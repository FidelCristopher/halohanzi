package com.example.chineselearning.data.repository

import com.example.chineselearning.R
import com.example.chineselearning.data.model.Exercise
import com.example.chineselearning.data.model.ExerciseType
import com.example.chineselearning.data.model.MatchPairItem
import com.example.chineselearning.data.model.PictureOption

val bab13Stage2Part1Exercises = listOf(
    // 1. Soal 1: Pilihan Gambar (热 -> panas)
    Exercise(
        id = "u13_s2_p1_q1",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "热",
        targetPinyin = "rè",
        targetTranslation = "panas",
        correctAnswer = "panas",
        audioToSpeak = "热",
        pictureOptions = listOf(
            PictureOption("u13_s2_p1_opt1", "panas", "🥵", R.drawable.ic_coin, true),
            PictureOption("u13_s2_p1_opt2", "dingin", "🥶", R.drawable.ic_target, false),
            PictureOption("u13_s2_p1_opt3", "hujan", "🌧️", R.drawable.ic_book, false),
            PictureOption("u13_s2_p1_opt4", "angin", "💨", R.drawable.ic_crown, false)
        )
    ),

    // 2. Soal 2: Susun Kalimat (Hari ini sangat panas.)
    Exercise(
        id = "u13_s2_p1_q2",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Hari ini sangat panas.",
        targetHanzi = "今天 很 热。",
        targetPinyin = "Jīntiān hěn rè.",
        wordChips = listOf("今天:jīntiān", "很:hěn", "热:rè", "冷:lěng", "昨天:zuótiān"),
        correctAnswer = "今天,很,热",
        audioToSpeak = "今天很热。"
    ),

    // 3. Soal 3: Ketuk Pasangan yang Sesuai (Suhu Panas)
    Exercise(
        id = "u13_s2_p1_q3",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u13_s2_p1_m1", "热", "rè", "panas"),
            MatchPairItem("u13_s2_p1_m2", "很热", "hěn rè", "sangat panas"),
            MatchPairItem("u13_s2_p1_m3", "太热了", "tài rè le", "terlalu panas!"),
            MatchPairItem("u13_s2_p1_m4", "不热", "bú rè", "tidak panas")
        )
    ),

    // 4. Soal 4: Ketik Pinyin (panas -> rè)
    Exercise(
        id = "u13_s2_p1_q4",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "panas",
        sentenceWithBlank = "热 (________)",
        targetHanzi = "热",
        targetPinyin = "rè",
        correctAnswer = "re",
        keyboardKeys = listOf("r", "e", "a", "i", "o", "u", "b", "d", "g", "h", "j"),
        audioToSpeak = "热"
    ),

    // 5. Soal 5: Mendengar Kalimat (Rule 10: illustrationRes = 0)
    Exercise(
        id = "u13_s2_p1_q5",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Apa yang Anda dengar?",
        targetTranslation = "Hari ini cuaca terlalu panas.",
        targetHanzi = "今天 天气 太 热 了。",
        targetPinyin = "Jīntiān tiānqì tài rè le.",
        wordChips = listOf("今天:jīntiān", "天气:tiānqì", "太:tài", "热:rè", "了:le", "冷:lěng"),
        correctAnswer = "今天,天气,太,热,了",
        illustrationRes = 0,
        audioToSpeak = "今天天气太热了。"
    ),

    // 6. Soal 6: Pilihan Kalimat
    Exercise(
        id = "u13_s2_p1_q6",
        type = ExerciseType.SENTENCE_CHOICE,
        title = "Pilih terjemahan yang benar",
        targetHanzi = "北京 的 夏天 很 热。",
        targetPinyin = "Běijīng de xiàtiān hěn rè.",
        targetTranslation = "Musim panas di Beijing sangat panas.",
        correctAnswer = "Běijīng de xiàtiān hěn rè.\n北京 的 夏天 很 热。",
        options = listOf(
            "Běijīng de xiàtiān hěn rè.\n北京 的 夏天 很 热。",
            "Běijīng de dōngtiān hěn lěng.\n北京 的 冬天 很 冷。",
            "Běijīng de tiānqì hěn hǎo.\n北京 的 天气 很 好。"
        ),
        audioToSpeak = "北京的夏天很热。"
    ),

    // 7. Soal 7: Pilihan Gambar (太热了 -> terlalu panas)
    Exercise(
        id = "u13_s2_p1_q7",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "热",
        targetPinyin = "rè",
        targetTranslation = "panas",
        correctAnswer = "panas",
        audioToSpeak = "热",
        pictureOptions = listOf(
            PictureOption("u13_s2_p1_opt7_1", "panas", "🔥", R.drawable.ic_coin, true),
            PictureOption("u13_s2_p1_opt7_2", "dingin", "❄️", R.drawable.ic_target, false),
            PictureOption("u13_s2_p1_opt7_3", "air", "💧", R.drawable.ic_book, false),
            PictureOption("u13_s2_p1_opt7_4", "angin", "💨", R.drawable.ic_crown, false)
        )
    ),

    // 8. Soal 8: Ketik Pinyin (sangat panas -> hěnrè)
    Exercise(
        id = "u13_s2_p1_q8",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "sangat panas",
        sentenceWithBlank = "很热 (________)",
        targetHanzi = "很热",
        targetPinyin = "hěnrè",
        correctAnswer = "henre",
        keyboardKeys = listOf("h", "e", "n", "r", "a", "i", "o", "u", "b", "d", "g"),
        audioToSpeak = "很热"
    ),

    // 9. Soal 9: Susun Kalimat (Hari ini tidak terlalu panas.)
    Exercise(
        id = "u13_s2_p1_q9",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Hari ini tidak terlalu panas.",
        targetHanzi = "今天 不 太 热。",
        targetPinyin = "Jīntiān bú tài rè.",
        wordChips = listOf("今天:jīntiān", "不:bú", "太:tài", "热:rè", "很:hěn", "冷:lěng"),
        correctAnswer = "今天,不,太,热",
        audioToSpeak = "今天不太热。"
    ),

    // 10. Soal 10: Ketuk Pasangan yang Sesuai (Rangkuman Suhu Panas)
    Exercise(
        id = "u13_s2_p1_m10_1",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u13_s2_p1_m10_1", "热", "rè", "panas"),
            MatchPairItem("u13_s2_p1_m10_2", "太热了", "tài rè le", "terlalu panas"),
            MatchPairItem("u13_s2_p1_m10_3", "喝水", "hē shuǐ", "minum air"),
            MatchPairItem("u13_s2_p1_m10_4", "不太热", "bú tài rè", "tidak terlalu panas")
        )
    )
)

val bab13Stage2Part2Exercises = listOf(
    // 1. Soal 1: Pilihan Gambar (冷 -> dingin)
    Exercise(
        id = "u13_s2_p2_q1",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "冷",
        targetPinyin = "lěng",
        targetTranslation = "dingin",
        correctAnswer = "dingin",
        audioToSpeak = "冷",
        pictureOptions = listOf(
            PictureOption("u13_s2_p2_opt1", "dingin", "🥶", R.drawable.ic_coin, true),
            PictureOption("u13_s2_p2_opt2", "panas", "🥵", R.drawable.ic_target, false),
            PictureOption("u13_s2_p2_opt3", "hujan", "🌧️", R.drawable.ic_book, false),
            PictureOption("u13_s2_p2_opt4", "awan", "☁️", R.drawable.ic_crown, false)
        )
    ),

    // 2. Soal 2: Susun Kalimat (Hari ini sangat dingin.)
    Exercise(
        id = "u13_s2_p2_q2",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Hari ini sangat dingin.",
        targetHanzi = "今天 很 冷。",
        targetPinyin = "Jīntiān hěn lěng.",
        wordChips = listOf("今天:jīntiān", "很:hěn", "冷:lěng", "热:rè", "明天:míngtiān"),
        correctAnswer = "今天,很,冷",
        audioToSpeak = "今天很冷。"
    ),

    // 3. Soal 3: Ketuk Pasangan yang Sesuai (Suhu Dingin)
    Exercise(
        id = "u13_s2_p2_m3",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u13_s2_p2_m1", "冷", "lěng", "dingin"),
            MatchPairItem("u13_s2_p2_m2", "太冷了", "tài lěng le", "terlalu dingin!"),
            MatchPairItem("u13_s2_p2_m3", "很冷", "hěn lěng", "sangat dingin"),
            MatchPairItem("u13_s2_p2_m4", "不冷", "bù lěng", "tidak dingin")
        )
    ),

    // 4. Soal 4: Ketik Pinyin (dingin -> lěng)
    Exercise(
        id = "u13_s2_p2_q4",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "dingin",
        sentenceWithBlank = "冷 (________)",
        targetHanzi = "冷",
        targetPinyin = "lěng",
        correctAnswer = "leng",
        keyboardKeys = listOf("l", "e", "n", "g", "a", "i", "o", "u", "b", "d", "h"),
        audioToSpeak = "冷"
    ),

    // 5. Soal 5: Mendengar Kalimat (Rule 10: illustrationRes = 0)
    Exercise(
        id = "u13_s2_p2_q5",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Apa yang Anda dengar?",
        targetTranslation = "Di luar sungguh dingin.",
        targetHanzi = "外边 真 冷。",
        targetPinyin = "Wàibian zhēn lěng.",
        wordChips = listOf("外边:wàibian", "真:zhēn", "冷:lěng", "热:rè", "家里:jiālǐ"),
        correctAnswer = "外边,真,冷",
        illustrationRes = 0,
        audioToSpeak = "外边真冷。"
    ),

    // 6. Soal 6: Pilihan Kalimat
    Exercise(
        id = "u13_s2_p2_q6",
        type = ExerciseType.SENTENCE_CHOICE,
        title = "Pilih terjemahan yang benar",
        targetHanzi = "今天 冷 不 冷？",
        targetPinyin = "Jīntiān lěng bù lěng?",
        targetTranslation = "Hari ini dingin tidak?",
        correctAnswer = "Jīntiān lěng bù lěng?\n今天 冷 不 冷？",
        options = listOf(
            "Jīntiān lěng bù lěng?\n今天 冷 不 冷？",
            "Jīntiān rè bú rè?\n今天 热 不 热？",
            "Míngtiān lěng bù lěng?\n明天 冷 不 冷？"
        ),
        audioToSpeak = "今天冷不冷？"
    ),

    // 7. Soal 7: Pilihan Gambar (真冷 -> sungguh dingin)
    Exercise(
        id = "u13_s2_p2_q7",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "冷",
        targetPinyin = "lěng",
        targetTranslation = "dingin",
        correctAnswer = "dingin",
        audioToSpeak = "冷",
        pictureOptions = listOf(
            PictureOption("u13_s2_p2_opt7_1", "dingin", "❄️", R.drawable.ic_coin, true),
            PictureOption("u13_s2_p2_opt7_2", "panas", "🔥", R.drawable.ic_target, false),
            PictureOption("u13_s2_p2_opt7_3", "hujan", "🌧️", R.drawable.ic_book, false),
            PictureOption("u13_s2_p2_opt7_4", "angin", "💨", R.drawable.ic_crown, false)
        )
    ),

    // 8. Soal 8: Ketik Pinyin (sungguh dingin -> zhēnlěng)
    Exercise(
        id = "u13_s2_p2_q8",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "sungguh dingin",
        sentenceWithBlank = "真冷 (________)",
        targetHanzi = "真冷",
        targetPinyin = "zhēnlěng",
        correctAnswer = "zhenleng",
        keyboardKeys = listOf("z", "h", "e", "n", "l", "g", "a", "i", "o", "u", "b"),
        audioToSpeak = "真冷"
    ),

    // 9. Soal 9: Susun Kalimat (Hari ini tidak dingin, sangat nyaman.)
    Exercise(
        id = "u13_s2_p2_q9",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Hari ini tidak dingin.",
        targetHanzi = "今天 不 冷。",
        targetPinyin = "Jīntiān bù lěng.",
        wordChips = listOf("今天:jīntiān", "不:bù", "冷:lěng", "很:hěn", "热:rè"),
        correctAnswer = "今天,不,冷",
        audioToSpeak = "今天不冷。"
    ),

    // 10. Soal 10: Ketuk Pasangan yang Sesuai (Rangkuman Suhu Dingin)
    Exercise(
        id = "u13_s2_p2_m10_1",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u13_s2_p2_m10_1", "冷", "lěng", "dingin"),
            MatchPairItem("u13_s2_p2_m2", "真冷", "zhēn lěng", "sungguh dingin"),
            MatchPairItem("u13_s2_p2_m3", "穿衣服", "chuān yīfu", "pakai pakaian"),
            MatchPairItem("u13_s2_p2_m4", "太冷了", "tài lěng le", "terlalu dingin")
        )
    )
)
