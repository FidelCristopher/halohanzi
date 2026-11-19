package com.example.chineselearning.data.repository

import com.example.chineselearning.R
import com.example.chineselearning.data.model.Exercise
import com.example.chineselearning.data.model.ExerciseType
import com.example.chineselearning.data.model.MatchPairItem
import com.example.chineselearning.data.model.PictureOption

val bab8Stage1Part1Exercises = listOf(
    // 1. Soal 1: Pilihan Gambar (买 -> membeli)
    Exercise(
        id = "u8_s1_p1_q1",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "买",
        targetPinyin = "mǎi",
        targetTranslation = "membeli",
        correctAnswer = "membeli",
        audioToSpeak = "买",
        pictureOptions = listOf(
            PictureOption("u8_s1_p1_opt1", "membeli", "🛒", R.drawable.ic_coin, true),
            PictureOption("u8_s1_p1_opt2", "menjual", "🏷️", R.drawable.ic_target, false),
            PictureOption("u8_s1_p1_opt3", "makan", "🍚", R.drawable.ic_book, false),
            PictureOption("u8_s1_p1_opt4", "minum", "🍵", R.drawable.ic_crown, false)
        )
    ),

    // 2. Soal 2: Susun Kalimat (Saya ingin membeli barang.)
    Exercise(
        id = "u8_s1_p1_q2",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Saya ingin membeli barang.",
        targetHanzi = "我 想 买 东西。",
        targetPinyin = "Wǒ xiǎng mǎi dōngxi.",
        wordChips = listOf("我:wǒ", "想:xiǎng", "买:mǎi", "东西:dōngxi", "卖:mài", "吃:chī"),
        correctAnswer = "我,想,买,东西",
        audioToSpeak = "我想买东西。"
    ),

    // 3. Soal 3: Ketuk Pasangan yang Sesuai (Jual & Beli)
    Exercise(
        id = "u8_s1_p1_q3",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u8_s1_p1_m1", "买", "mǎi", "membeli"),
            MatchPairItem("u8_s1_p1_m2", "卖", "mài", "menjual"),
            MatchPairItem("u8_s1_p1_m3", "东西", "dōngxi", "barang / benda"),
            MatchPairItem("u8_s1_p1_m4", "买东西", "mǎi dōngxi", "berbelanja")
        )
    ),

    // 4. Soal 4: Ketik Pinyin (membeli -> mǎi)
    Exercise(
        id = "u8_s1_p1_q4",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "membeli",
        sentenceWithBlank = "买 (________)",
        targetHanzi = "买",
        targetPinyin = "mǎi",
        correctAnswer = "mai",
        keyboardKeys = listOf("m", "a", "i", "e", "o", "u", "b", "d", "g", "h", "j"),
        audioToSpeak = "买"
    ),

    // 5. Soal 5: Mendengar Kalimat (Rule 10: illustrationRes = 0)
    Exercise(
        id = "u8_s1_p1_q5",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Apa yang Anda dengar?",
        targetTranslation = "Dia membeli banyak barang.",
        targetHanzi = "他 买 了 很多 东西。",
        targetPinyin = "Tā mǎi le hěnduō dōngxi.",
        wordChips = listOf("他:tā", "买:mǎi", "了:le", "很多:hěnduō", "东西:dōngxi", "我:wǒ"),
        correctAnswer = "他,买,了,很多,东西",
        illustrationRes = 0,
        audioToSpeak = "他买了很多东西。"
    ),

    // 6. Soal 6: Pilihan Kalimat
    Exercise(
        id = "u8_s1_p1_q6",
        type = ExerciseType.SENTENCE_CHOICE,
        title = "Pilih terjemahan yang benar",
        targetHanzi = "你 想 买 什么？",
        targetPinyin = "Nǐ xiǎng mǎi shénme?",
        targetTranslation = "Kamu ingin membeli apa?",
        correctAnswer = "Nǐ xiǎng mǎi shénme?\n你 想 买 什么？",
        options = listOf(
            "Nǐ xiǎng mǎi shénme?\n你 想 买 什么？",
            "Nǐ xiǎng chī shénme?\n你 想 吃 什么？",
            "Tā xiǎng mǎi shénme?\n他 想 买 什么？"
        ),
        audioToSpeak = "你想买什么？"
    ),

    // 7. Soal 7: Pilihan Gambar (东西 -> barang)
    Exercise(
        id = "u8_s1_p1_q7",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "东西",
        targetPinyin = "dōngxi",
        targetTranslation = "barang / benda",
        correctAnswer = "barang / benda",
        audioToSpeak = "东西",
        pictureOptions = listOf(
            PictureOption("u8_s1_p1_opt7_1", "barang / benda", "📦", R.drawable.ic_coin, true),
            PictureOption("u8_s1_p1_opt7_2", "uang", "🪙", R.drawable.ic_story_timer, false),
            PictureOption("u8_s1_p1_opt7_3", "air", "💧", R.drawable.ic_target, false),
            PictureOption("u8_s1_p1_opt7_4", "orang", "👥", R.drawable.ic_people_group, false)
        )
    ),

    // 8. Soal 8: Ketik Pinyin (barang -> dōngxi)
    Exercise(
        id = "u8_s1_p1_q8",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "barang / benda",
        sentenceWithBlank = "东西 (________)",
        targetHanzi = "东西",
        targetPinyin = "dōngxi",
        correctAnswer = "dongxi",
        keyboardKeys = listOf("d", "o", "n", "g", "x", "i", "a", "e", "u", "b", "h"),
        audioToSpeak = "东西"
    ),

    // 9. Soal 9: Susun Kalimat (Toko ini tidak menjual apel.)
    Exercise(
        id = "u8_s1_p1_q9",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Toko ini tidak menjual apel.",
        targetHanzi = "这个 店 不 卖 苹果。",
        targetPinyin = "Zhège diàn bù mài píngguǒ.",
        wordChips = listOf("这个:zhège", "店:diàn", "不:bù", "卖:mài", "苹果:píngguǒ", "买:mǎi"),
        correctAnswer = "这个,店,不,卖,苹果",
        audioToSpeak = "这个店不卖苹果。"
    ),

    // 10. Soal 10: Ketuk Pasangan yang Sesuai (Rangkuman Jual Beli)
    Exercise(
        id = "u8_s1_p1_m10_1",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u8_s1_p1_m10_1", "买", "mǎi", "membeli"),
            MatchPairItem("u8_s1_p1_m10_2", "卖", "mài", "menjual"),
            MatchPairItem("u8_s1_p1_m10_3", "买苹果", "mǎi píngguǒ", "beli apel"),
            MatchPairItem("u8_s1_p1_m10_4", "不卖", "bù mài", "tidak jual")
        )
    )
)

val bab8Stage1Part2Exercises = listOf(
    // 1. Soal 1: Pilihan Gambar (商店 -> toko)
    Exercise(
        id = "u8_s1_p2_q1",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "商店",
        targetPinyin = "shāngdiàn",
        targetTranslation = "toko",
        correctAnswer = "toko",
        audioToSpeak = "商店",
        pictureOptions = listOf(
            PictureOption("u8_s1_p2_opt1", "toko", "🏪", R.drawable.ic_coin, true),
            PictureOption("u8_s1_p2_opt2", "sekolah", "🏫", R.drawable.ic_cap, false),
            PictureOption("u8_s1_p2_opt3", "rumah", "🏠", R.drawable.ic_people_group, false),
            PictureOption("u8_s1_p2_opt4", "kamar", "🚪", R.drawable.ic_book, false)
        )
    ),

    // 2. Soal 2: Susun Kalimat (Saya pergi ke toko membeli barang.)
    Exercise(
        id = "u8_s1_p2_q2",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Saya pergi ke toko beli barang.",
        targetHanzi = "我 去 商店 买 东西。",
        targetPinyin = "Wǒ qù shāngdiàn mǎi dōngxi.",
        wordChips = listOf("我:wǒ", "去:qù", "商店:shāngdiàn", "买:mǎi", "东西:dōngxi", "来:lái", "卖:mài"),
        correctAnswer = "我,去,商店,买,东西",
        audioToSpeak = "我去商店买东西。"
    ),

    // 3. Soal 3: Ketuk Pasangan yang Sesuai (Toko & Supermarket)
    Exercise(
        id = "u8_s1_p2_q3",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u8_s1_p2_m1", "商店", "shāngdiàn", "toko"),
            MatchPairItem("u8_s1_p2_m2", "超市", "chāoshì", "supermarket"),
            MatchPairItem("u8_s1_p2_m3", "店", "diàn", "kedai / toko"),
            MatchPairItem("u8_s1_p2_m4", "去超市", "qù chāoshì", "pergi ke supermarket")
        )
    ),

    // 4. Soal 4: Ketik Pinyin (toko -> shāngdiàn)
    Exercise(
        id = "u8_s1_p2_q4",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "toko",
        sentenceWithBlank = "商店 (________)",
        targetHanzi = "商店",
        targetPinyin = "shāngdiàn",
        correctAnswer = "shangdian",
        keyboardKeys = listOf("s", "h", "a", "n", "g", "d", "i", "e", "o", "u", "b"),
        audioToSpeak = "商店"
    ),

    // 5. Soal 5: Mendengar Kalimat (Rule 10: illustrationRes = 0)
    Exercise(
        id = "u8_s1_p2_q5",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Apa yang Anda dengar?",
        targetTranslation = "Dia berada di supermarket membeli buah-buahan.",
        targetHanzi = "他 在 超市 买 水果。",
        targetPinyin = "Tā zài chāoshì mǎi shuǐguǒ.",
        wordChips = listOf("他:tā", "在:zài", "超市:chāoshì", "买:mǎi", "水果:shuǐguǒ", "我:wǒ"),
        correctAnswer = "他,在,超市,买,水果",
        illustrationRes = 0,
        audioToSpeak = "他在超市买水果。"
    ),

    // 6. Soal 6: Pilihan Kalimat
    Exercise(
        id = "u8_s1_p2_q6",
        type = ExerciseType.SENTENCE_CHOICE,
        title = "Pilih terjemahan yang benar",
        targetHanzi = "这个 超市 很 大。",
        targetPinyin = "Zhège chāoshì hěn dà.",
        targetTranslation = "Supermarket ini sangat besar.",
        correctAnswer = "Zhège chāoshì hěn dà.\n这个 超市 很 大。",
        options = listOf(
            "Zhège chāoshì hěn dà.\n这个 超市 很 大。",
            "Zhège shāngdiàn hěn dà.\n这个 商店 很 大。",
            "Nàgè chāoshì hěn dà.\n那个 超市 很 大。"
        ),
        audioToSpeak = "这个超市很大。"
    ),

    // 7. Soal 7: Pilihan Gambar (超市 -> supermarket)
    Exercise(
        id = "u8_s1_p2_q7",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "超市",
        targetPinyin = "chāoshì",
        targetTranslation = "supermarket",
        correctAnswer = "supermarket",
        audioToSpeak = "超市",
        pictureOptions = listOf(
            PictureOption("u8_s1_p2_opt7_1", "supermarket", "🏬", R.drawable.ic_coin, true),
            PictureOption("u8_s1_p2_opt7_2", "sekolah", "🏫", R.drawable.ic_cap, false),
            PictureOption("u8_s1_p2_opt7_3", "rumah", "🏠", R.drawable.ic_people_group, false),
            PictureOption("u8_s1_p2_opt7_4", "kamar", "🚪", R.drawable.ic_book, false)
        )
    ),

    // 8. Soal 8: Ketik Pinyin (supermarket -> chāoshì)
    Exercise(
        id = "u8_s1_p2_q8",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "supermarket",
        sentenceWithBlank = "超市 (________)",
        targetHanzi = "超市",
        targetPinyin = "chāoshì",
        correctAnswer = "chaoshi",
        keyboardKeys = listOf("c", "h", "a", "o", "s", "i", "e", "u", "b", "d", "g"),
        audioToSpeak = "超市"
    ),

    // 9. Soal 9: Susun Kalimat (Ibu pergi ke supermarket.)
    Exercise(
        id = "u8_s1_p2_q9",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Ibu pergi ke supermarket.",
        targetHanzi = "妈妈 去 超市 了。",
        targetPinyin = "Māma qù chāoshì le.",
        wordChips = listOf("妈妈:māma", "去:qù", "超市:chāoshì", "了:le", "爸爸:bàba", "商店:shāngdiàn"),
        correctAnswer = "妈妈,去,超市,了",
        audioToSpeak = "妈妈去超市了。"
    ),

    // 10. Soal 10: Ketuk Pasangan yang Sesuai (Rangkuman Tempat Belanja)
    Exercise(
        id = "u8_s1_p2_m10_1",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u8_s1_p2_m10_1", "商店", "shāngdiàn", "toko"),
            MatchPairItem("u8_s1_p2_m10_2", "超市", "chāoshì", "supermarket"),
            MatchPairItem("u8_s1_p2_m10_3", "买东西", "mǎi dōngxi", "beli barang"),
            MatchPairItem("u8_s1_p2_m10_4", "大超市", "dà chāoshì", "supermarket besar")
        )
    )
)
