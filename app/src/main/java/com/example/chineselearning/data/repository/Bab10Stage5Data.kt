package com.example.chineselearning.data.repository

import com.example.chineselearning.R
import com.example.chineselearning.data.model.Exercise
import com.example.chineselearning.data.model.ExerciseType
import com.example.chineselearning.data.model.MatchPairItem
import com.example.chineselearning.data.model.PictureOption

val bab10Stage5Part1Exercises = listOf(
    // 1. Soal 1: Pilihan Gambar (飞机 -> pesawat)
    Exercise(
        id = "u10_s5_p1_q1",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "飞机",
        targetPinyin = "fēijī",
        targetTranslation = "pesawat terbang",
        correctAnswer = "pesawat terbang",
        audioToSpeak = "飞机",
        pictureOptions = listOf(
            PictureOption("u10_s5_p1_opt1", "pesawat terbang", "✈️", R.drawable.ic_coin, true),
            PictureOption("u10_s5_p1_opt2", "kereta", "🚆", R.drawable.ic_target, false),
            PictureOption("u10_s5_p1_opt3", "mobil", "🚗", R.drawable.ic_book, false),
            PictureOption("u10_s5_p1_opt4", "taksi", "🚕", R.drawable.ic_crown, false)
        )
    ),

    // 2. Soal 2: Susun Kalimat (Saya naik taksi ke stasiun kereta.)
    Exercise(
        id = "u10_s5_p1_q2",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Saya naik taksi ke stasiun kereta.",
        targetHanzi = "我 坐 出租车 去 火车站。",
        targetPinyin = "Wǒ zuò chūzūchē qù huǒchēzhàn.",
        wordChips = listOf("我:wǒ", "坐:zuò", "出租车:chūzūchē", "去:qù", "火车站:huǒchēzhàn", "飞机:fēijī"),
        correctAnswer = "我,坐,出租车,去,火车站",
        audioToSpeak = "我坐出租车去火车站。"
    ),

    // 3. Soal 3: Ketuk Pasangan yang Sesuai (Rangkuman Bab 10 Bagian 1)
    Exercise(
        id = "u10_s5_p1_q3",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u10_s5_p1_m1", "车", "chē", "mobil"),
            MatchPairItem("u10_s5_p1_m2", "出租车", "chūzūchē", "taksi"),
            MatchPairItem("u10_s5_p1_m3", "火车", "huǒchē", "kereta api"),
            MatchPairItem("u10_s5_p1_m4", "飞机", "fēijī", "pesawat terbang")
        )
    ),

    // 4. Soal 4: Ketik Pinyin (kereta api -> huǒchē)
    Exercise(
        id = "u10_s5_p1_q4",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "kereta api",
        sentenceWithBlank = "火车 (________)",
        targetHanzi = "火车",
        targetPinyin = "huǒchē",
        correctAnswer = "huoche",
        keyboardKeys = listOf("h", "u", "o", "c", "e", "a", "i", "b", "d", "g", "j"),
        audioToSpeak = "火车"
    ),

    // 5. Soal 5: Mendengar Kalimat (Rule 10: illustrationRes = 0)
    Exercise(
        id = "u10_s5_p1_q5",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Apa yang Anda dengar?",
        targetTranslation = "Dia menyetir mobil pulang ke rumah.",
        targetHanzi = "他 开车 回家 了。",
        targetPinyin = "Tā kāichē huíjiā le.",
        wordChips = listOf("他:tā", "开车:kāichē", "回家:huíjiā", "了:le", "去:qù", "学校:xuéxiào"),
        correctAnswer = "他,开车,回家,了",
        illustrationRes = 0,
        audioToSpeak = "他开车回家了。"
    ),

    // 6. Soal 6: Pilihan Kalimat
    Exercise(
        id = "u10_s5_p1_q6",
        type = ExerciseType.SENTENCE_CHOICE,
        title = "Pilih terjemahan yang benar",
        targetHanzi = "我们 坐 飞机 去 中国。",
        targetPinyin = "Wǒmen zuò fēijī qù Zhōngguó.",
        targetTranslation = "Kami naik pesawat ke Tiongkok.",
        correctAnswer = "Wǒmen zuò fēijī qù Zhōngguó.\n我们 坐 飞机 去 中国。",
        options = listOf(
            "Wǒmen zuò fēijī qù Zhōngguó.\n我们 坐 飞机 去 中国。",
            "Wǒmen zuò huǒchē qù Zhōngguó.\n我们 坐 火车 去 中国。",
            "Tāmen zuò fēijī qù Zhōngguó.\n他们 坐 飞机 去 中国。"
        ),
        audioToSpeak = "我们坐飞机去中国。"
    ),

    // 7. Soal 7: Pilihan Gambar (火车 -> kereta api)
    Exercise(
        id = "u10_s5_p1_q7",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "火车",
        targetPinyin = "huǒchē",
        targetTranslation = "kereta api",
        correctAnswer = "kereta api",
        audioToSpeak = "火车",
        pictureOptions = listOf(
            PictureOption("u10_s5_p1_opt7_1", "kereta api", "🚆", R.drawable.ic_coin, true),
            PictureOption("u10_s5_p1_opt7_2", "pesawat", "✈️", R.drawable.ic_target, false),
            PictureOption("u10_s5_p1_opt7_3", "mobil", "🚗", R.drawable.ic_book, false),
            PictureOption("u10_s5_p1_opt7_4", "taksi", "🚕", R.drawable.ic_crown, false)
        )
    ),

    // 8. Soal 8: Ketik Pinyin (pesawat -> fēijī)
    Exercise(
        id = "u10_s5_p1_q8",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "pesawat terbang",
        sentenceWithBlank = "飞机 (________)",
        targetHanzi = "飞机",
        targetPinyin = "fēijī",
        correctAnswer = "feiji",
        keyboardKeys = listOf("f", "e", "i", "j", "a", "o", "u", "b", "d", "g", "h"),
        audioToSpeak = "飞机"
    ),

    // 9. Soal 9: Susun Kalimat (Ibu naik mobil pulang.)
    Exercise(
        id = "u10_s5_p1_q9",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Ibu naik mobil pulang ke rumah.",
        targetHanzi = "妈妈 坐 车 回家。",
        targetPinyin = "Māma zuò chē huíjiā.",
        wordChips = listOf("妈妈:māma", "坐:zuò", "车:chē", "回家:huíjiā", "爸爸:bàba", "去:qù"),
        correctAnswer = "妈妈,坐,车,回家",
        audioToSpeak = "妈妈坐车回家。"
    ),

    // 10. Soal 10: Ketuk Pasangan yang Sesuai (Rangkuman Sarana Perjalanan)
    Exercise(
        id = "u10_s5_p1_m10_1",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u10_s5_p1_m10_1", "坐车", "zuò chē", "naik mobil"),
            MatchPairItem("u10_s5_p1_m10_2", "坐火车", "zuò huǒchē", "naik kereta"),
            MatchPairItem("u10_s5_p1_m10_3", "坐飞机", "zuò fēijī", "naik pesawat"),
            MatchPairItem("u10_s5_p1_m10_4", "坐出租车", "zuò chūzūchē", "naik taksi")
        )
    )
)

val bab10Stage5Part2Exercises = listOf(
    // 1. Soal 1: Pilihan Gambar (出租车 -> taksi)
    Exercise(
        id = "u10_s5_p2_q1",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "出租车",
        targetPinyin = "chūzūchē",
        targetTranslation = "taksi",
        correctAnswer = "taksi",
        audioToSpeak = "出租车",
        pictureOptions = listOf(
            PictureOption("u10_s5_p2_opt1", "taksi", "🚕", R.drawable.ic_coin, true),
            PictureOption("u10_s5_p2_opt2", "kereta", "🚆", R.drawable.ic_target, false),
            PictureOption("u10_s5_p2_opt3", "pesawat", "✈️", R.drawable.ic_book, false),
            PictureOption("u10_s5_p2_opt4", "rumah", "🏠", R.drawable.ic_crown, false)
        )
    ),

    // 2. Soal 2: Susun Kalimat (Kapan kita berangkat ke stasiun kereta?)
    Exercise(
        id = "u10_s5_p2_q2",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Kapan kita pergi ke stasiun?",
        targetHanzi = "我们 什么时候 去 火车站？",
        targetPinyin = "Wǒmen shénme shíhou qù huǒchēzhàn?",
        wordChips = listOf("我们:wǒmen", "什么时候:shénme shíhou", "去:qù", "火车站:huǒchēzhàn", "他们:tāmen"),
        correctAnswer = "我们,什么时候,去,火车站",
        audioToSpeak = "我们什么时候去火车站？"
    ),

    // 3. Soal 3: Ketuk Pasangan yang Sesuai (Grand Review Bab 10)
    Exercise(
        id = "u10_s5_p2_m3",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u10_s5_p2_m1", "开车", "kāichē", "menyetir"),
            MatchPairItem("u10_s5_p2_m2", "坐车", "zuò chē", "naik mobil"),
            MatchPairItem("u10_s5_p2_m3", "回家", "huíjiā", "pulang rumah"),
            MatchPairItem("u10_s5_p2_m4", "火车站", "huǒchēzhàn", "stasiun kereta")
        )
    ),

    // 4. Soal 4: Ketik Pinyin (taksi -> chūzūchē)
    Exercise(
        id = "u10_s5_p2_q4",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "taksi",
        sentenceWithBlank = "出租车 (________)",
        targetHanzi = "出租车",
        targetPinyin = "chūzūchē",
        correctAnswer = "chuzuche",
        keyboardKeys = listOf("c", "h", "u", "z", "e", "a", "i", "o", "b", "d", "g"),
        audioToSpeak = "出租车"
    ),

    // 5. Soal 5: Mendengar Kalimat (Rule 10: illustrationRes = 0)
    Exercise(
        id = "u10_s5_p2_q5",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Apa yang Anda dengar?",
        targetTranslation = "Saya bisa menyetir mobil.",
        targetHanzi = "我 会 开车。",
        targetPinyin = "Wǒ huì kāichē.",
        wordChips = listOf("我:wǒ", "会:huì", "开车:kāichē", "坐车:zuòchē", "不:bù"),
        correctAnswer = "我,会,开车",
        illustrationRes = 0,
        audioToSpeak = "我会开车。"
    ),

    // 6. Soal 6: Pilihan Kalimat
    Exercise(
        id = "u10_s5_p2_q6",
        type = ExerciseType.SENTENCE_CHOICE,
        title = "Pilih terjemahan yang benar",
        targetHanzi = "他 坐 火车 回来 了。",
        targetPinyin = "Tā zuò huǒchē huílái le.",
        targetTranslation = "Dia naik kereta api sudah kembali.",
        correctAnswer = "Tā zuò huǒchē huílái le.\n他 坐 火车 回来 了。",
        options = listOf(
            "Tā zuò huǒchē huílái le.\n他 坐 火车 回来 了。",
            "Tā zuò fēijī huílái le.\n他 坐 飞机 回来 了。",
            "Wǒ zuò huǒchē huílái le.\n我 坐 火车 回来 了。"
        ),
        audioToSpeak = "他坐火车回来了。"
    ),

    // 7. Soal 7: Pilihan Gambar (开车 -> mengemudi)
    Exercise(
        id = "u10_s5_p2_q7",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "开车",
        targetPinyin = "kāichē",
        targetTranslation = "menyetir mobil",
        correctAnswer = "menyetir mobil",
        audioToSpeak = "开车",
        pictureOptions = listOf(
            PictureOption("u10_s5_p2_opt7_1", "menyetir mobil", "🚗", R.drawable.ic_coin, true),
            PictureOption("u10_s5_p2_opt7_2", "jalan kaki", "🚶", R.drawable.ic_target, false),
            PictureOption("u10_s5_p2_opt7_3", "tidur", "🛌", R.drawable.ic_book, false),
            PictureOption("u10_s5_p2_opt7_4", "makan", "🍜", R.drawable.ic_crown, false)
        )
    ),

    // 8. Soal 8: Ketik Pinyin (menyetir mobil -> kāichē)
    Exercise(
        id = "u10_s5_p2_q8",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "menyetir mobil",
        sentenceWithBlank = "开车 (________)",
        targetHanzi = "开车",
        targetPinyin = "kāichē",
        correctAnswer = "kaiche",
        keyboardKeys = listOf("k", "a", "i", "c", "h", "e", "o", "u", "b", "d", "g"),
        audioToSpeak = "开车"
    ),

    // 9. Soal 9: Susun Kalimat (Grand Evaluasi Bab 10)
    Exercise(
        id = "u10_s5_p2_q9",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Kami naik taksi ke stasiun kereta.",
        targetHanzi = "我们 坐 出租车 去 火车站。",
        targetPinyin = "Wǒmen zuò chūzūchē qù huǒchēzhàn.",
        wordChips = listOf("我们:wǒmen", "坐:zuò", "出租车:chūzūchē", "去:qù", "火车站:huǒchēzhàn", "飞机:fēijī"),
        correctAnswer = "我们,坐,出租车,去,火车站",
        audioToSpeak = "我们坐出租车去火车站。"
    ),

    // 10. Soal 10: Ketuk Pasangan yang Sesuai (Grand Review Bab 10 Akhir)
    Exercise(
        id = "u10_s5_p2_m10_1",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u10_s5_p2_m10_1", "去火车站", "qù huǒchēzhàn", "ke stasiun"),
            MatchPairItem("u10_s5_p2_m10_2", "坐飞机", "zuò fēijī", "naik pesawat"),
            MatchPairItem("u10_s5_p2_m10_3", "坐出租车", "zuò chūzūchē", "naik taksi"),
            MatchPairItem("u10_s5_p2_m10_4", "回家", "huíjiā", "pulang rumah")
        )
    )
)
