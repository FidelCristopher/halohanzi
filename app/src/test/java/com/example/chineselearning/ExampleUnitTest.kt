package com.example.chineselearning

import com.example.chineselearning.data.model.ExerciseType
import com.example.chineselearning.data.repository.LearningRepository
import org.junit.Assert.*
import org.junit.Test

class ComprehensiveExerciseAuditTest {

    @Test
    fun auditAllChaptersAndStages() {
        val allUnits = LearningRepository.units
        assertNotNull("Units must not be null", allUnits)
        assertTrue("Must have at least 2 units", allUnits.size >= 2)

        val errors = mutableListOf<String>()

        allUnits.forEach { unit ->
            unit.lessons.forEach { lesson ->
                val allExercises = lesson.exercisesPart1 + lesson.exercisesPart2 + lesson.exercisesPart3
                allExercises.forEach { ex ->
                    // 1. Audit SENTENCE_BUILDER
                    if (ex.type == ExerciseType.SENTENCE_BUILDER) {
                        val expectedWords = ex.correctAnswer.split(",").map { it.trim() }
                        val chipWords = ex.wordChips.map { it.substringBefore(":").trim() }
                        expectedWords.forEach { word ->
                            if (!chipWords.contains(word)) {
                                errors.add("[${lesson.id} - ${ex.id}] Correct word '$word' not found in wordChips: $chipWords")
                            }
                        }
                    }

                    // 2. Audit PINYIN_KEYBOARD
                    if (ex.type == ExerciseType.PINYIN_KEYBOARD) {
                        if (ex.targetTranslation.isBlank()) {
                            errors.add("[${lesson.id} - ${ex.id}] PINYIN_KEYBOARD missing targetTranslation")
                        }
                        if (ex.sentenceWithBlank.isBlank()) {
                            errors.add("[${lesson.id} - ${ex.id}] PINYIN_KEYBOARD missing sentenceWithBlank")
                        }
                        val correctChars = ex.correctAnswer.trim().lowercase().toCharArray()
                        correctChars.forEach { ch ->
                            if (ch.isLetter() && !ex.keyboardKeys.contains(ch.toString())) {
                                errors.add("[${lesson.id} - ${ex.id}] Key '$ch' missing in keyboardKeys: ${ex.keyboardKeys}")
                            }
                        }
                    }

                    // 3. Audit MATCH_PAIRS
                    if (ex.type == ExerciseType.MATCH_PAIRS) {
                        ex.matchPairs.forEach { pair ->
                            if (pair.translation.length > 30) {
                                errors.add("[${lesson.id} - ${ex.id}] Match pair translation too long (${pair.translation.length} chars): '${pair.translation}'")
                            }
                        }
                    }

                    // 4. Audit SENTENCE_CHOICE options
                    if (ex.type == ExerciseType.SENTENCE_CHOICE) {
                        ex.options.forEach { opt ->
                            if (opt.contains("\n")) {
                                val lines = opt.split("\n")
                                if (lines.size == 2) {
                                    val pTokens = lines[0].split("\\s+").filter { it.isNotBlank() }
                                    val hTokens = lines[1].split("\\s+").filter { it.isNotBlank() }
                                    if (pTokens.size != hTokens.size) {
                                        errors.add("[${lesson.id} - ${ex.id}] Option token asymmetry (${pTokens.size} vs ${hTokens.size}): '$opt'")
                                    }
                                }
                            }
                        }
                    }

                    // 5. Audit Listening Exercises ("Apa yang Anda dengar?") - Rule 10 Zero Background Mandate
                    if (ex.title == "Apa yang Anda dengar?") {
                        if (ex.illustrationRes != 0) {
                            errors.add("[${lesson.id} - ${ex.id}] Listening exercise must have illustrationRes == 0 (got ${ex.illustrationRes})")
                        }
                    }

                    // 6. Audit PICTURE_CHOICE Semantic Accuracy - Rule 13 Zero Fallback Placeholder Mandate
                    if (ex.type == ExerciseType.PICTURE_CHOICE) {
                        ex.pictureOptions.forEach { opt ->
                            val isMoneyRelated = opt.label.contains("uang", ignoreCase = true) ||
                                    opt.label.contains("koin", ignoreCase = true) ||
                                    opt.label.contains("harga", ignoreCase = true) ||
                                    opt.label.contains("yuan", ignoreCase = true) ||
                                    opt.label.contains("mahal", ignoreCase = true) ||
                                    opt.label.contains("murah", ignoreCase = true)
                            if (opt.iconRes == R.drawable.ic_coin && !isMoneyRelated) {
                                errors.add("[${lesson.id} - ${ex.id}] PictureOption '${opt.label}' (${opt.id}) is using ic_coin placeholder! Must use dedicated semantic VectorDrawable.")
                            }

                            // Disallow generic placeholder dumping
                            if (opt.iconRes == R.drawable.ic_target && !opt.label.contains("target", ignoreCase = true) && !opt.label.contains("sasaran", ignoreCase = true)) {
                                errors.add("[${lesson.id} - ${ex.id}] PictureOption '${opt.label}' (${opt.id}) is using ic_target placeholder! Must use dedicated semantic VectorDrawable.")
                            }
                            if (opt.iconRes == R.drawable.ic_crown && !opt.label.contains("mahal", ignoreCase = true) && !opt.label.contains("emas", ignoreCase = true) && !opt.label.contains("raja", ignoreCase = true)) {
                                errors.add("[${lesson.id} - ${ex.id}] PictureOption '${opt.label}' (${opt.id}) is using ic_crown placeholder! Must use dedicated semantic VectorDrawable.")
                            }
                            if (opt.iconRes == R.drawable.ic_book && !opt.label.contains("buku", ignoreCase = true) && !opt.label.contains("belajar", ignoreCase = true) && !opt.label.contains("baca", ignoreCase = true)) {
                                errors.add("[${lesson.id} - ${ex.id}] PictureOption '${opt.label}' (${opt.id}) is using ic_book placeholder! Must use dedicated semantic VectorDrawable.")
                            }
                            if (opt.iconRes == R.drawable.ic_cap && !opt.label.contains("topi", ignoreCase = true) && !opt.label.contains("wisuda", ignoreCase = true) && !opt.label.contains("mahasiswa", ignoreCase = true)) {
                                errors.add("[${lesson.id} - ${ex.id}] PictureOption '${opt.label}' (${opt.id}) is using ic_cap placeholder! Must use dedicated semantic VectorDrawable.")
                            }
                        }
                    }
                }
            }
        }

        if (errors.isNotEmpty()) {
            fail("Comprehensive Exercise Audit Failed with ${errors.size} errors:\n" + errors.joinToString("\n"))
        }
    }

    @Test
    fun auditListeningExercisesZeroIllustrationMandate() {
        val allUnits = LearningRepository.units
        val violations = mutableListOf<String>()

        allUnits.forEach { unit ->
            unit.lessons.forEach { lesson ->
                val allExercises = lesson.exercisesPart1 + lesson.exercisesPart2 + lesson.exercisesPart3
                allExercises.forEach { ex ->
                    if (ex.title == "Apa yang Anda dengar?") {
                        if (ex.illustrationRes != 0) {
                            violations.add("${unit.id}/${lesson.id}/${ex.id}: illustrationRes is ${ex.illustrationRes}, expected 0")
                        }
                    }
                }
            }
        }

        assertTrue(
            "Found ${violations.size} listening exercises violating Rule 10 (non-zero illustrationRes):\n" + violations.joinToString("\n"),
            violations.isEmpty()
        )
    }
}
