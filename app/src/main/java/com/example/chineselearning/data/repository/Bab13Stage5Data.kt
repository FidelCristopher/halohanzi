package com.example.chineselearning.data.repository

import com.example.chineselearning.R
import com.example.chineselearning.data.model.Exercise
import com.example.chineselearning.data.model.ExerciseType
import com.example.chineselearning.data.model.MatchPairItem
import com.example.chineselearning.data.model.PictureOption

val bab13Stage5Part1Exercises = listOf(
    // 1. Soal 1: Pilihan Gambar (天气 -> cuaca)
    Exercise(
        id = "u13_s5_p1_q1",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "天气",
        targetPinyin = "tiānqì",
        targetTranslation = "cuaca",
        correctAnswer = "cuaca",
        audioToSpeak = "天气",
        pictureOptions = listOf(
            PictureOption("u13_s5_p1_opt1", "cuaca", "⛅", R.drawable.ic_coin, true),
            PictureOption("u13_s5_p1_opt2", "air", "💧", R.drawable.ic_target, false),
            PictureOption("u13_s5_p1_opt3", "salju", "❄️", R.drawable.ic_book, false),
            PictureOption("u13_s5_p1_opt4", "hujan", "🌧️", R.drawable.ic_crown, false)
        )
    ),

    // 2. Soal 2: Susun Kalimat (Hari ini cuaca sangat baik, tidak dingin dan tidak panas.)
    Exercise(
        id = "u13_s5_p1_q2",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Hari ini tidak dingin tidak panas.",
        targetHanzi = "今天 不 冷 不 热。",
        targetPinyin = "Jīntiān bù lěng bú rè.",
        wordChips = listOf("今天:jīntiān", "不:bù", "冷:lěng", "不:bú", "热:rè", "很:hěn"),
        correctAnswer = "今天,不,冷,不,热",
        audioToSpeak = "今天不冷不热。"
    ),

    // 3. Soal 3: Ketuk Pasangan yang Sesuai (Rangkuman Cuaca Bab 13)
    Exercise(
        id = "u13_s5_p1_q3",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u13_s5_p1_m1", "天气", "tiānqì", "cuaca"),
            MatchPairItem("u13_s5_p1_m2", "下雨", "xià yǔ", "turun hujan"),
            MatchPairItem("u13_s5_p1_m3", "下雪", "xià xuě", "turun salju"),
            MatchPairItem("u13_s5_p1_m4", "冷", "lěng", "dingin")
        )
    ),

    // 4. Soal 4: Ketik Pinyin (cuaca -> tiānqì)
    Exercise(
        id = "u13_s5_p1_q4",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "cuaca",
        sentenceWithBlank = "天气 (________)",
        targetHanzi = "天气",
        targetPinyin = "tiānqì",
        correctAnswer = "tianqi",
        keyboardKeys = listOf("t", "i", "a", "n", "q", "e", "o", "u", "b", "d", "g"),
        audioToSpeak = "天气"
    ),

    // 5. Soal 5: Mendengar Kalimat (Rule 10: illustrationRes = 0)
    Exercise(
        id = "u13_s5_p1_q5",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Apa yang Anda dengar?",
        targetTranslation = "Hari ini cuaca sangat baik.",
        targetHanzi = "今天 天气 非常 好。",
        targetPinyin = "Jīntiān tiānqì fēicháng hǎo.",
        wordChips = listOf("今天:jīntiān", "天气:tiānqì", "非常:fēicháng", "好:hǎo", "冷:lěng"),
        correctAnswer = "今天,天气,非常,好",
        illustrationRes = 0,
        audioToSpeak = "今天天气非常好。"
    ),

    // 6. Soal 6: Pilihan Kalimat
    Exercise(
        id = "u13_s5_p1_q6",
        type = ExerciseType.SENTENCE_CHOICE,
        title = "Pilih terjemahan yang benar",
        targetHanzi = "明天 会 下雨 吗？",
        targetPinyin = "Míngtiān huì xiàyǔ ma?",
        targetTranslation = "Apakah besok akan turun hujan?",
        correctAnswer = "Míngtiān huì xiàyǔ ma?\n明天 会 下雨 吗？",
        options = listOf(
            "Míngtiān huì xiàyǔ ma?\n明天 会 下雨 吗？",
            "Jīntiān huì xiàyǔ ma?\n今天 会 下雨 吗？",
            "Míngtiān huì xiàxuě ma?\n明天 会 下雪 吗？"
        ),
        audioToSpeak = "明天会下雨吗？"
    ),

    // 7. Soal 7: Pilihan Gambar (下雨 -> hujan)
    Exercise(
        id = "u13_s5_p1_q7",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "下雨",
        targetPinyin = "xià yǔ",
        targetTranslation = "turun hujan",
        correctAnswer = "turun hujan",
        audioToSpeak = "下雨",
        pictureOptions = listOf(
            PictureOption("u13_s5_p1_opt7_1", "turun hujan", "🌧️", R.drawable.ic_coin, true),
            PictureOption("u13_s5_p1_opt7_2", "turun salju", "❄️", R.drawable.ic_target, false),
            PictureOption("u13_s5_p1_opt7_3", "panas", "☀️", R.drawable.ic_book, false),
            PictureOption("u13_s5_p1_opt7_4", "angin", "💨", R.drawable.ic_crown, false)
        )
    ),

    // 8. Soal 8: Ketik Pinyin (turun hujan -> xiàyǔ)
    Exercise(
        id = "u13_s5_p1_q8",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "turun hujan",
        sentenceWithBlank = "下雨 (________)",
        targetHanzi = "下雨",
        targetPinyin = "xiàyǔ",
        correctAnswer = "xiayu",
        keyboardKeys = listOf("x", "i", "a", "y", "u", "e", "o", "b", "d", "g", "h"),
        audioToSpeak = "下雨"
    ),

    // 9. Soal 9: Susun Kalimat (Beijing kemarin turun salju.)
    Exercise(
        id = "u13_s5_p1_q9",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Beijing kemarin turun salju.",
        targetHanzi = "北京 昨天 下雪 了。",
        targetPinyin = "Běijīng zuótiān xiàxuě le.",
        wordChips = listOf("北京:Běijīng", "昨天:zuótiān", "下雪:xiàxuě", "了:le", "今天:jīntiān"),
        correctAnswer = "北京,昨天,下雪,了",
        audioToSpeak = "北京昨天下雪了。"
    ),

    // 10. Soal 10: Ketuk Pasangan yang Sesuai (Rangkuman Cuaca Alam)
    Exercise(
        id = "u13_s5_p1_m10_1",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u13_s5_p1_m10_1", "天气", "tiānqì", "cuaca"),
            MatchPairItem("u13_s5_p1_m10_2", "下雨", "xià yǔ", "hujan"),
            MatchPairItem("u13_s5_p1_m10_3", "下雪", "xià xuě", "salju"),
            MatchPairItem("u13_s5_p1_m10_4", "非常热", "fēicháng rè", "amat panas")
        )
    )
)

val bab13Stage5Part2Exercises = listOf(
    // 1. Soal 1: Pilihan Gambar (冷 -> dingin)
    Exercise(
        id = "u13_s5_p2_q1",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "冷",
        targetPinyin = "lěng",
        targetTranslation = "dingin",
        correctAnswer = "dingin",
        audioToSpeak = "冷",
        pictureOptions = listOf(
            PictureOption("u13_s5_p2_opt1", "dingin", "❄️", R.drawable.ic_coin, true),
            PictureOption("u13_s5_p2_opt2", "panas", "🔥", R.drawable.ic_target, false),
            PictureOption("u13_s5_p2_opt3", "hujan", "🌧️", R.drawable.ic_book, false),
            PictureOption("u13_s5_p2_opt4", "awan", "☁️", R.drawable.ic_crown, false)
        )
    ),

    // 2. Soal 2: Susun Kalimat (Hari ini cuaca sungguh dingin!)
    Exercise(
        id = "u13_s5_p2_q2",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Hari ini cuaca sungguh dingin!",
        targetHanzi = "今天 天气 真 冷！",
        targetPinyin = "Jīntiān tiānqì zhēn lěng!",
        wordChips = listOf("今天:jīntiān", "天气:tiānqì", "真:zhēn", "冷！:lěng!", "热:rè", "明天:míngtiān"),
        correctAnswer = "今天,天气,真,冷！",
        audioToSpeak = "今天天气真冷！"
    ),

    // 3. Soal 3: Ketuk Pasangan yang Sesuai (Grand Review Bab 13)
    Exercise(
        id = "u13_s5_p2_m3",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u13_s5_p2_m1", "冷", "lěng", "dingin"),
            MatchPairItem("u13_s5_p2_m2", "热", "rè", "panas"),
            MatchPairItem("u13_s5_p2_m3", "非常", "fēicháng", "amat sangat"),
            MatchPairItem("u13_s5_p2_m4", "真好", "zhēn hǎo", "sungguh bagus")
        )
    ),

    // 4. Soal 4: Ketik Pinyin (dingin -> lěng)
    Exercise(
        id = "u13_s5_p2_q4",
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
        id = "u13_s5_p2_q5",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Apa yang Anda dengar?",
        targetTranslation = "Besok cuacanya bagaimana?",
        targetHanzi = "明天 天气 怎么样？",
        targetPinyin = "Míngtiān tiānqì zěnmeyàng?",
        wordChips = listOf("明天:míngtiān", "天气:tiānqì", "怎么样？:zěnmeyàng?", "今天:jīntiān"),
        correctAnswer = "明天,天气,怎么样？",
        illustrationRes = 0,
        audioToSpeak = "明天天气怎么样？"
    ),

    // 6. Soal 6: Pilihan Kalimat
    Exercise(
        id = "u13_s5_p2_q6",
        type = ExerciseType.SENTENCE_CHOICE,
        title = "Pilih terjemahan yang benar",
        targetHanzi = "外边 下 大雨 了。",
        targetPinyin = "Wàibian xià dàyǔ le.",
        targetTranslation = "Di luar turun hujan deras.",
        correctAnswer = "Wàibian xià dàyǔ le.\n外边 下 大雨 了。",
        options = listOf(
            "Wàibian xià dàyǔ le.\n外边 下 大雨 了。",
            "Wàibian xià dàxuě le.\n外边 下 大雪 了。",
            "Wàibian tiānqì hěn hǎo.\n外边 天气 很 好。"
        ),
        audioToSpeak = "外边下大雨了。"
    ),

    // 7. Soal 7: Pilihan Gambar (热 -> panas)
    Exercise(
        id = "u13_s5_p2_q7",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "热",
        targetPinyin = "rè",
        targetTranslation = "panas",
        correctAnswer = "panas",
        audioToSpeak = "热",
        pictureOptions = listOf(
            PictureOption("u13_s5_p2_opt7_1", "panas", "🔥", R.drawable.ic_coin, true),
            PictureOption("u13_s5_p2_opt7_2", "dingin", "❄️", R.drawable.ic_target, false),
            PictureOption("u13_s5_p2_opt7_3", "hujan", "🌧️", R.drawable.ic_book, false),
            PictureOption("u13_s5_p2_opt7_4", "awan", "☁️", R.drawable.ic_crown, false)
        )
    ),

    // 8. Soal 8: Ketik Pinyin (panas -> rè)
    Exercise(
        id = "u13_s5_p2_q8",
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

    // 9. Soal 9: Susun Kalimat (Grand Evaluasi Bab 13)
    Exercise(
        id = "u13_s5_p2_q9",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Hari ini cuaca sangat bagus.",
        targetHanzi = "今天 天气 很 好。",
        targetPinyin = "Jīntiān tiānqì hěn hǎo.",
        wordChips = listOf("今天:jīntiān", "天气:tiānqì", "很:hěn", "好:hǎo", "冷:lěng"),
        correctAnswer = "今天,天气,很,好",
        audioToSpeak = "今天天气很好。"
    ),

    // 10. Soal 10: Ketuk Pasangan yang Sesuai (Grand Review Akhir Bab 13)
    Exercise(
        id = "u13_s5_p2_m10_1",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u13_s5_p2_m10_1", "天气很好", "tiānqì hěn hǎo", "cuaca sangat bagus"),
            MatchPairItem("u13_s5_p2_m10_2", "下雪", "xià xuě", "salju"),
            MatchPairItem("u13_s5_p2_m10_3", "下雨", "xià yǔ", "hujan"),
            MatchPairItem("u13_s5_p2_m10_4", "真冷", "zhēn lěng", "sungguh dingin")
        )
    )
)
