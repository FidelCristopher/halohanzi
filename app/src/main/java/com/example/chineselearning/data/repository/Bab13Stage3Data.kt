package com.example.chineselearning.data.repository

import com.example.chineselearning.R
import com.example.chineselearning.data.model.Exercise
import com.example.chineselearning.data.model.ExerciseType
import com.example.chineselearning.data.model.MatchPairItem
import com.example.chineselearning.data.model.PictureOption

val bab13Stage3Part1Exercises = listOf(
    // 1. Soal 1: Pilihan Gambar (下雨 -> hujan / turun hujan)
    Exercise(
        id = "u13_s3_p1_q1",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "下雨",
        targetPinyin = "xià yǔ",
        targetTranslation = "turun hujan",
        correctAnswer = "turun hujan",
        audioToSpeak = "下雨",
        pictureOptions = listOf(
            PictureOption("u13_s3_p1_opt1", "turun hujan", "", R.drawable.ic_weather_raining, true),
            PictureOption("u13_s3_p1_opt2", "salju", "", R.drawable.ic_weather_snow, false),
            PictureOption("u13_s3_p1_opt3", "panas", "", R.drawable.ic_weather_hot, false),
            PictureOption("u13_s3_p1_opt4", "dingin", "", R.drawable.ic_weather_cold, false)
        )
    ),

    // 2. Soal 2: Susun Kalimat (Hari ini turun hujan.)
    Exercise(
        id = "u13_s3_p1_q2",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Hari ini turun hujan.",
        targetHanzi = "今天 下雨 了。",
        targetPinyin = "Jīntiān xiàyǔ le.",
        wordChips = listOf("今天:jīntiān", "下雨:xiàyǔ", "了:le", "明天:míngtiān", "下雪:xiàxuě"),
        correctAnswer = "今天,下雨,了",
        audioToSpeak = "今天下雨了。"
    ),

    // 3. Soal 3: Ketuk Pasangan yang Sesuai (Hujan)
    Exercise(
        id = "u13_s3_p1_q3",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u13_s3_p1_m1", "雨", "yǔ", "hujan"),
            MatchPairItem("u13_s3_p1_m2", "下雨", "xià yǔ", "turun hujan"),
            MatchPairItem("u13_s3_p1_m3", "下大雨", "xià dà yǔ", "hujan lebat"),
            MatchPairItem("u13_s3_p1_m4", "不下雨", "bú xià yǔ", "tidak hujan")
        )
    ),

    // 4. Soal 4: Ketik Pinyin (turun hujan -> xiàyǔ)
    Exercise(
        id = "u13_s3_p1_q4",
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

    // 5. Soal 5: Mendengar Kalimat (Rule 10: illustrationRes = 0)
    Exercise(
        id = "u13_s3_p1_q5",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Apa yang Anda dengar?",
        targetTranslation = "Di luar sedang turun hujan.",
        targetHanzi = "外边 在 下雨。",
        targetPinyin = "Wàibian zài xiàyǔ.",
        wordChips = listOf("外边:wàibian", "在:zài", "下雨:xiàyǔ", "下雪:xiàxuě", "家里:jiālǐ"),
        correctAnswer = "外边,在,下雨",
        illustrationRes = 0,
        audioToSpeak = "外边在下雨。"
    ),

    // 6. Soal 6: Pilihan Kalimat
    Exercise(
        id = "u13_s3_p1_q6",
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

    // 7. Soal 7: Pilihan Gambar (雨 -> hujan)
    Exercise(
        id = "u13_s3_p1_q7",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "雨",
        targetPinyin = "yǔ",
        targetTranslation = "hujan",
        correctAnswer = "hujan",
        audioToSpeak = "雨",
        pictureOptions = listOf(
            PictureOption("u13_s3_p1_opt7_1", "hujan", "", R.drawable.ic_weather_rain, true),
            PictureOption("u13_s3_p1_opt7_2", "salju", "", R.drawable.ic_weather_snow, false),
            PictureOption("u13_s3_p1_opt7_3", "panas", "", R.drawable.ic_weather_hot, false),
            PictureOption("u13_s3_p1_opt7_4", "dingin", "", R.drawable.ic_weather_cold, false)
        )
    ),

    // 8. Soal 8: Ketik Pinyin (hujan -> yǔ)
    Exercise(
        id = "u13_s3_p1_q8",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "hujan",
        sentenceWithBlank = "雨 (________)",
        targetHanzi = "雨",
        targetPinyin = "yǔ",
        correctAnswer = "yu",
        keyboardKeys = listOf("y", "u", "a", "e", "i", "o", "b", "d", "g", "h", "j"),
        audioToSpeak = "雨"
    ),

    // 9. Soal 9: Susun Kalimat (Hari ini tidak turun hujan.)
    Exercise(
        id = "u13_s3_p1_q9",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Hari ini tidak turun hujan.",
        targetHanzi = "今天 没 下雨。",
        targetPinyin = "Jīntiān méi xiàyǔ.",
        wordChips = listOf("今天:jīntiān", "没:méi", "下雨:xiàyǔ", "下雪:xiàxuě", "明天:míngtiān"),
        correctAnswer = "今天,没,下雨",
        audioToSpeak = "今天没下雨。"
    ),

    // 10. Soal 10: Ketuk Pasangan yang Sesuai (Rangkuman Hujan)
    Exercise(
        id = "u13_s3_p1_m10_1",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u13_s3_p1_m10_1", "下雨", "xià yǔ", "turun hujan"),
            MatchPairItem("u13_s3_p1_m10_2", "下大雨", "xià dà yǔ", "hujan deras"),
            MatchPairItem("u13_s3_p1_m10_3", "没下雨", "méi xiàyǔ", "tidak hujan"),
            MatchPairItem("u13_s3_p1_m10_4", "外边下雨", "wàibian xiàyǔ", "di luar hujan")
        )
    )
)

val bab13Stage3Part2Exercises = listOf(
    // 1. Soal 1: Pilihan Gambar (下雪 -> salju / turun salju)
    Exercise(
        id = "u13_s3_p2_q1",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "下雪",
        targetPinyin = "xià xuě",
        targetTranslation = "turun salju",
        correctAnswer = "turun salju",
        audioToSpeak = "下雪",
        pictureOptions = listOf(
            PictureOption("u13_s3_p2_opt1", "turun salju", "", R.drawable.ic_weather_snowing, true),
            PictureOption("u13_s3_p2_opt2", "hujan", "", R.drawable.ic_weather_rain, false),
            PictureOption("u13_s3_p2_opt3", "panas", "", R.drawable.ic_weather_hot, false),
            PictureOption("u13_s3_p2_opt4", "dingin", "", R.drawable.ic_weather_cold, false)
        )
    ),

    // 2. Soal 2: Susun Kalimat (Beijing turun salju hari ini.)
    Exercise(
        id = "u13_s3_p2_q2",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Beijing hari ini turun salju.",
        targetHanzi = "北京 今天 下雪 了。",
        targetPinyin = "Běijīng jīntiān xiàxuě le.",
        wordChips = listOf("北京:Běijīng", "今天:jīntiān", "下雪:xiàxuě", "了:le", "下雨:xiàyǔ"),
        correctAnswer = "北京,今天,下雪,了",
        audioToSpeak = "北京今天下雪了。"
    ),

    // 3. Soal 3: Ketuk Pasangan yang Sesuai (Salju & Keadaan)
    Exercise(
        id = "u13_s3_p2_m3",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u13_s3_p2_m1", "雪", "xuě", "salju"),
            MatchPairItem("u13_s3_p2_m2", "下雪", "xià xuě", "turun salju"),
            MatchPairItem("u13_s3_p2_m3", "真漂亮", "zhēn piàoliang", "sungguh cantik"),
            MatchPairItem("u13_s3_p2_m4", "很冷", "hěn lěng", "sangat dingin")
        )
    ),

    // 4. Soal 4: Ketik Pinyin (turun salju -> xiàxuě)
    Exercise(
        id = "u13_s3_p2_q4",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "turun salju",
        sentenceWithBlank = "下雪 (________)",
        targetHanzi = "下雪",
        targetPinyin = "xiàxuě",
        correctAnswer = "xiaxue",
        keyboardKeys = listOf("x", "i", "a", "u", "e", "o", "b", "d", "g", "h", "j"),
        audioToSpeak = "下雪"
    ),

    // 5. Soal 5: Mendengar Kalimat (Rule 10: illustrationRes = 0)
    Exercise(
        id = "u13_s3_p2_q5",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Apa yang Anda dengar?",
        targetTranslation = "Turun salju sangat indah.",
        targetHanzi = "下雪 很 漂亮。",
        targetPinyin = "Xiàxuě hěn piàoliang.",
        wordChips = listOf("下雪:xiàxuě", "很:hěn", "漂亮:piàoliang", "下雨:xiàyǔ", "冷:lěng"),
        correctAnswer = "下雪,很,漂亮",
        illustrationRes = 0,
        audioToSpeak = "下雪很漂亮。"
    ),

    // 6. Soal 6: Pilihan Kalimat
    Exercise(
        id = "u13_s3_p2_q6",
        type = ExerciseType.SENTENCE_CHOICE,
        title = "Pilih terjemahan yang benar",
        targetHanzi = "明天 会 下雪 吗？",
        targetPinyin = "Míngtiān huì xiàxuě ma?",
        targetTranslation = "Apakah besok akan turun salju?",
        correctAnswer = "Míngtiān huì xiàxuě ma?\n明天 会 下雪 吗？",
        options = listOf(
            "Míngtiān huì xiàxuě ma?\n明天 会 下雪 吗？",
            "Míngtiān huì xiàyǔ ma?\n明天 会 下雨 吗？",
            "Jīntiān huì xiàxuě ma?\n今天 会 下雪 吗？"
        ),
        audioToSpeak = "明天会下雪吗？"
    ),

    // 7. Soal 7: Pilihan Gambar (雪 -> salju)
    Exercise(
        id = "u13_s3_p2_q7",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "雪",
        targetPinyin = "xuě",
        targetTranslation = "salju",
        correctAnswer = "salju",
        audioToSpeak = "雪",
        pictureOptions = listOf(
            PictureOption("u13_s3_p2_opt7_1", "salju", "", R.drawable.ic_weather_snow, true),
            PictureOption("u13_s3_p2_opt7_2", "hujan", "", R.drawable.ic_weather_rain, false),
            PictureOption("u13_s3_p2_opt7_3", "panas", "", R.drawable.ic_weather_hot, false),
            PictureOption("u13_s3_p2_opt7_4", "cuaca", "", R.drawable.ic_weather_forecast, false)
        )
    ),

    // 8. Soal 8: Ketik Pinyin (salju -> xuě)
    Exercise(
        id = "u13_s3_p2_q8",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "salju",
        sentenceWithBlank = "雪 (________)",
        targetHanzi = "雪",
        targetPinyin = "xuě",
        correctAnswer = "xue",
        keyboardKeys = listOf("x", "u", "e", "a", "i", "o", "b", "d", "g", "h", "j"),
        audioToSpeak = "雪"
    ),

    // 9. Soal 9: Susun Kalimat (Di luar sedang turun salju.)
    Exercise(
        id = "u13_s3_p2_q9",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Di luar sedang turun salju.",
        targetHanzi = "外边 在 下雪。",
        targetPinyin = "Wàibian zài xiàxuě.",
        wordChips = listOf("外边:wàibian", "在:zài", "下雪:xiàxuě", "下雨:xiàyǔ", "家里:jiālǐ"),
        correctAnswer = "外边,在,下雪",
        audioToSpeak = "外边在下雪。"
    ),

    // 10. Soal 10: Ketuk Pasangan yang Sesuai (Rangkuman Hujan & Salju)
    Exercise(
        id = "u13_s3_p2_m10_1",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u13_s3_p2_m10_1", "下雪", "xià xuě", "turun salju"),
            MatchPairItem("u13_s3_p2_m10_2", "下雨", "xià yǔ", "turun hujan"),
            MatchPairItem("u13_s3_p2_m10_3", "下大雪", "xià dà xuě", "salju lebat"),
            MatchPairItem("u13_s3_p2_m10_4", "真冷", "zhēn lěng", "sungguh dingin")
        )
    )
)
