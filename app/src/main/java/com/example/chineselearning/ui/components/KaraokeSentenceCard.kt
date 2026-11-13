package com.example.chineselearning.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.VolumeUp
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.chineselearning.data.model.Sentence
import com.example.chineselearning.data.model.WordToken
import com.example.chineselearning.ui.theme.*

@OptIn(ExperimentalLayoutApi::class)
@Composable
fun KaraokeSentenceCard(
    sentence: Sentence,
    index: Int,
    isActive: Boolean,
    showPinyin: Boolean,
    showTranslation: Boolean,
    onPlayAudio: () -> Unit,
    onTokenClick: (WordToken) -> Unit
) {
    Card(
        shape = RoundedCornerShape(16.dp),
        colors = CardDefaults.cardColors(
            containerColor = if (isActive) HanziMint else MaterialTheme.colorScheme.surface
        ),
        elevation = CardDefaults.cardElevation(defaultElevation = if (isActive) 2.dp else 0.5.dp),
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 5.dp)
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 14.dp, vertical = 10.dp)
        ) {
            // Header: sentence status & speaker icon
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Row(verticalAlignment = Alignment.CenterVertically) {
                    Box(
                        modifier = Modifier
                            .size(22.dp)
                            .clip(RoundedCornerShape(6.dp))
                            .background(if (isActive) HanziGreen else LightSlate),
                        contentAlignment = Alignment.Center
                    ) {
                        Text(
                            text = "${index + 1}",
                            fontSize = 11.sp,
                            fontWeight = FontWeight.Bold,
                            color = if (isActive) Color.White else SlateGray
                        )
                    }

                    if (isActive) {
                        Spacer(modifier = Modifier.width(8.dp))
                        Text(
                            text = "Playing...",
                            fontSize = 11.sp,
                            fontWeight = FontWeight.Bold,
                            color = HanziGreenDark
                        )
                    }
                }

                FilledTonalIconButton(
                    onClick = onPlayAudio,
                    modifier = Modifier.size(30.dp),
                    colors = IconButtonDefaults.filledTonalIconButtonColors(
                        containerColor = if (isActive) HanziGreen else LightSlate,
                        contentColor = if (isActive) Color.White else SlateGray
                    )
                ) {
                    Icon(
                        imageVector = Icons.AutoMirrored.Filled.VolumeUp,
                        contentDescription = "Read Sentence",
                        modifier = Modifier.size(16.dp)
                    )
                }
            }

            Spacer(modifier = Modifier.height(6.dp))

            val (speaker, parsedItems) = remember(sentence.hanzi, sentence.tokens) {
                parseSentenceItems(sentence.hanzi, sentence.tokens)
            }

            // Ruby Pinyin Text Flow (Character & Token Aligned)
            FlowRow(
                horizontalArrangement = Arrangement.spacedBy(4.dp),
                verticalArrangement = Arrangement.spacedBy(6.dp),
                modifier = Modifier.fillMaxWidth()
            ) {
                if (speaker != null) {
                    SpeakerBadge(speaker = speaker, showPinyin = showPinyin, isActive = isActive)
                }

                parsedItems.forEach { item ->
                    when (item) {
                        is SentenceItem.Token -> {
                            TokenChip(
                                token = item.token,
                                showPinyin = showPinyin,
                                isActive = isActive,
                                onClick = { onTokenClick(item.token) }
                            )
                        }
                        is SentenceItem.Punct -> {
                            PunctuationMark(
                                punct = item.text,
                                showPinyin = showPinyin,
                                isActive = isActive
                            )
                        }
                    }
                }
            }

            // Translation line
            if (showTranslation) {
                Spacer(modifier = Modifier.height(8.dp))
                HorizontalDivider(color = if (isActive) Color(0xFFC7EEDB) else LightSlate, thickness = 0.8.dp)
                Spacer(modifier = Modifier.height(4.dp))
                Text(
                    text = sentence.translation,
                    fontSize = 13.sp,
                    color = if (isActive) DeepNavy else SlateGray,
                    lineHeight = 17.sp
                )
            }
        }
    }
}

private sealed interface SentenceItem {
    data class Token(val token: WordToken) : SentenceItem
    data class Punct(val text: String) : SentenceItem
}

private fun parseSentenceItems(hanzi: String, tokens: List<WordToken>): Pair<String?, List<SentenceItem>> {
    val trimmed = hanzi.trim()
    var speaker: String? = null
    var startIdx = 0

    val speakerRegex = Regex("^[A-Za-z0-9]+[:：]\\s*")
    val match = speakerRegex.find(trimmed)
    if (match != null) {
        speaker = match.value.trim().replace('：', ':')
        startIdx = match.range.last + 1
    }

    val items = mutableListOf<SentenceItem>()
    var currIdx = startIdx

    for (token in tokens) {
        val findIdx = trimmed.indexOf(token.hanzi, currIdx)
        if (findIdx != -1) {
            if (findIdx > currIdx) {
                val punct = trimmed.substring(currIdx, findIdx).trim()
                if (punct.isNotEmpty()) {
                    items.add(SentenceItem.Punct(punct))
                }
            }
            items.add(SentenceItem.Token(token))
            currIdx = findIdx + token.hanzi.length
        } else {
            items.add(SentenceItem.Token(token))
        }
    }

    if (currIdx < trimmed.length) {
        val trailingPunct = trimmed.substring(currIdx).trim()
        if (trailingPunct.isNotEmpty()) {
            items.add(SentenceItem.Punct(trailingPunct))
        }
    }

    return Pair(speaker, items)
}

private fun splitPinyinIntoSyllables(pinyin: String, targetCount: Int): List<String> {
    if (targetCount <= 0) return emptyList()
    val clean = pinyin.trim()
    if (clean.isBlank()) return List(targetCount) { "" }

    val parts = clean.split(Regex("\\s+")).filter { it.isNotBlank() }
    if (parts.size == targetCount) {
        return parts
    }

    if (targetCount == 1) {
        return listOf(clean)
    }

    val vowelClusterRegex = Regex("[aāáǎàeēéěèiīíǐìoōóǒòuūúǔùüǖǘǚǜAĀÁǍÀEĒÉĚÈIĪÍǏÌOŌÓǑÒUŪÚǓÙÜǕǗǙǛ]+", RegexOption.IGNORE_CASE)
    val matches = vowelClusterRegex.findAll(clean).toList()

    if (matches.size == targetCount) {
        val cuts = mutableListOf(0)
        for (i in 1 until matches.size) {
            val prevEnd = matches[i - 1].range.last + 1
            val currStart = matches[i].range.first
            val consonants = clean.substring(prevEnd, currStart).lowercase()

            val cut = when {
                consonants.startsWith("zh") || consonants.startsWith("ch") || consonants.startsWith("sh") -> prevEnd
                consonants.endsWith("ng") -> prevEnd + (consonants.length - 2).coerceAtLeast(0)
                consonants.endsWith("n") || consonants.endsWith("r") -> if (consonants.length > 1) prevEnd + 1 else prevEnd
                consonants.length > 1 -> prevEnd + (consonants.length / 2)
                else -> prevEnd
            }
            cuts.add(cut)
        }
        cuts.add(clean.length)
        val result = mutableListOf<String>()
        for (i in 0 until cuts.size - 1) {
            result.add(clean.substring(cuts[i], cuts[i + 1]).trim())
        }
        return result
    }

    if (parts.isNotEmpty()) {
        val res = ArrayList<String>()
        for (i in 0 until targetCount) {
            if (i < parts.size) res.add(parts[i]) else res.add("")
        }
        return res
    }

    return List(targetCount) { if (it == 0) clean else "" }
}

@Composable
fun TokenChip(
    token: WordToken,
    showPinyin: Boolean,
    isActive: Boolean,
    onClick: () -> Unit
) {
    val interactionSource = remember { MutableInteractionSource() }
    val syllables = remember(token.pinyin, token.hanzi) {
        splitPinyinIntoSyllables(token.pinyin, token.hanzi.length)
    }

    Surface(
        shape = RoundedCornerShape(8.dp),
        color = Color.Transparent,
        modifier = Modifier
            .clip(RoundedCornerShape(8.dp))
            .clickable(
                interactionSource = interactionSource,
                indication = null,
                onClick = onClick
            )
            .padding(horizontal = 1.dp, vertical = 1.dp)
    ) {
        Row(
            verticalAlignment = Alignment.Bottom,
            horizontalArrangement = Arrangement.Center
        ) {
            token.hanzi.forEachIndexed { index, char ->
                val pinyinSyllable = syllables.getOrElse(index) { "" }
                RubyUnit(
                    character = char.toString(),
                    pinyin = pinyinSyllable,
                    showPinyin = showPinyin,
                    isActive = isActive
                )
            }
        }
    }
}

@Composable
private fun RubyUnit(
    character: String,
    pinyin: String,
    showPinyin: Boolean,
    isActive: Boolean
) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.padding(horizontal = 2.dp)
    ) {
        if (showPinyin) {
            Text(
                text = pinyin,
                fontSize = 12.sp,
                fontWeight = FontWeight.Medium,
                // Warm golden-brown pinyin like Mandarin Bean, turning active green when audio plays
                color = if (isActive) HanziGreenDark else Color(0xFFB58900),
                maxLines = 1
            )
        }
        Text(
            text = character,
            fontFamily = KaiTiFontFamily,
            fontSize = 25.sp,
            fontWeight = FontWeight.SemiBold,
            color = if (isActive) ActiveSentenceGreen else HanziColor
        )
    }
}

@Composable
private fun SpeakerBadge(
    speaker: String,
    showPinyin: Boolean,
    isActive: Boolean
) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.padding(end = 4.dp)
    ) {
        if (showPinyin) {
            Spacer(modifier = Modifier.height(16.dp))
        }
        Text(
            text = speaker,
            fontSize = 21.sp,
            fontWeight = FontWeight.Bold,
            color = if (isActive) HanziGreenDark else DeepNavy
        )
    }
}

@Composable
private fun PunctuationMark(
    punct: String,
    showPinyin: Boolean,
    isActive: Boolean
) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.padding(horizontal = 1.dp)
    ) {
        if (showPinyin) {
            Spacer(modifier = Modifier.height(16.dp))
        }
        Text(
            text = punct,
            fontFamily = KaiTiFontFamily,
            fontSize = 24.sp,
            fontWeight = FontWeight.SemiBold,
            color = if (isActive) ActiveSentenceGreen else HanziColor
        )
    }
}
