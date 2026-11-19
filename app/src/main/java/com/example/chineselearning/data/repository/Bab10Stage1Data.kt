package com.example.chineselearning.data.repository

import com.example.chineselearning.R
import com.example.chineselearning.data.model.Exercise
import com.example.chineselearning.data.model.ExerciseType
import com.example.chineselearning.data.model.MatchPairItem
import com.example.chineselearning.data.model.PictureOption

val bab10Stage1Part1Exercises = listOf(
    // 1. Soal 1: Pilihan Gambar (车 -> mobil / kendaraan)
    Exercise(
        id = "u10_s1_p1_q1",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "车",
        targetPinyin = "chē",
        targetTranslation = "mobil / kendaraan",
        correctAnswer = "mobil / kendaraan",
        audioToSpeak = "车",
        pictureOptions = listOf(
            PictureOption("u10_s1_p1_opt1", "mobil / kendaraan", "", R.drawable.ic_trans_car, true),
            PictureOption("u10_s1_p1_opt2", "buku", "", R.drawable.ic_book_chinese, false),
            PictureOption("u10_s1_p1_opt3", "jam", "", R.drawable.ic_clock_analog, false),
            PictureOption("u10_s1_p1_opt4", "rumah", "", R.drawable.ic_fam_home, false)
        )
    ),

    // 2. Soal 2: Susun Kalimat (Kami naik mobil pergi.)
    Exercise(
        id = "u10_s1_p1_q2",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Kami naik mobil pergi.",
        targetHanzi = "我们 坐 车 去。",
        targetPinyin = "Wǒmen zuò chē qù.",
        wordChips = listOf("我们:wǒmen", "坐:zuò", "车:chē", "去:qù", "来:lái", "他们:tāmen"),
        correctAnswer = "我们,坐,车,去",
        audioToSpeak = "我们坐车去。"
    ),

    // 3. Soal 3: Ketuk Pasangan yang Sesuai (Mobil & Naik Kendaraan)
    Exercise(
        id = "u10_s1_p1_q3",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u10_s1_p1_m1", "车", "chē", "kendaraan / mobil"),
            MatchPairItem("u10_s1_p1_m2", "坐", "zuò", "naik (kendaraan) / duduk"),
            MatchPairItem("u10_s1_p1_m3", "坐车", "zuò chē", "naik mobil"),
            MatchPairItem("u10_s1_p1_m4", "开车", "kāichē", "menyetir mobil")
        )
    ),

    // 4. Soal 4: Ketik Pinyin (mobil -> chē)
    Exercise(
        id = "u10_s1_p1_q4",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "mobil / kendaraan",
        sentenceWithBlank = "车 (________)",
        targetHanzi = "车",
        targetPinyin = "chē",
        correctAnswer = "che",
        keyboardKeys = listOf("c", "h", "e", "a", "i", "o", "u", "b", "d", "g", "j"),
        audioToSpeak = "车"
    ),

    // 5. Soal 5: Mendengar Kalimat (Rule 10: illustrationRes = 0)
    Exercise(
        id = "u10_s1_p1_q5",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Apa yang Anda dengar?",
        targetTranslation = "Dia naik mobil pulang ke rumah.",
        targetHanzi = "他 坐 车 回家。",
        targetPinyin = "Tā zuò chē huíjiā.",
        wordChips = listOf("他:tā", "坐:zuò", "车:chē", "回家:huíjiā", "去:qù", "学校:xuéxiào"),
        correctAnswer = "他,坐,车,回家",
        illustrationRes = 0,
        audioToSpeak = "他坐车回家。"
    ),

    // 6. Soal 6: Pilihan Kalimat
    Exercise(
        id = "u10_s1_p1_q6",
        type = ExerciseType.SENTENCE_CHOICE,
        title = "Pilih terjemahan yang benar",
        targetHanzi = "你 坐 车 还是 走路？",
        targetPinyin = "Nǐ zuò chē háishi zǒulù?",
        targetTranslation = "Kamu naik mobil atau jalan kaki?",
        correctAnswer = "Nǐ zuò chē háishi zǒulù?\n你 坐 车 还是 走路？",
        options = listOf(
            "Nǐ zuò chē háishi zǒulù?\n你 坐 车 还是 走路？",
            "Tā zuò chē háishi zǒulù?\n他 坐 车 还是 走路？",
            "Nǐ kāichē háishi zǒulù?\n你 开车 还是 走路？"
        ),
        audioToSpeak = "你坐车还是走路？"
    ),

    // 7. Soal 7: Pilihan Gambar (坐 -> naik / duduk)
    Exercise(
        id = "u10_s1_p1_q7",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "坐",
        targetPinyin = "zuò",
        targetTranslation = "naik / duduk",
        correctAnswer = "naik / duduk",
        audioToSpeak = "坐",
        pictureOptions = listOf(
            PictureOption("u10_s1_p1_opt7_1", "naik / duduk", "", R.drawable.ic_fam_sit, true),
            PictureOption("u10_s1_p1_opt7_2", "berdiri", "", R.drawable.ic_trans_go, false),
            PictureOption("u10_s1_p1_opt7_3", "makan", "", R.drawable.ic_action_eat, false),
            PictureOption("u10_s1_p1_opt7_4", "tidur", "", R.drawable.ic_action_sleep, false)
        )
    ),

    // 8. Soal 8: Ketik Pinyin (naik/duduk -> zuò)
    Exercise(
        id = "u10_s1_p1_q8",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "naik / duduk",
        sentenceWithBlank = "坐 (________)",
        targetHanzi = "坐",
        targetPinyin = "zuò",
        correctAnswer = "zuo",
        keyboardKeys = listOf("z", "u", "o", "a", "e", "i", "b", "d", "g", "h", "j"),
        audioToSpeak = "坐"
    ),

    // 9. Soal 9: Susun Kalimat (Saya naik mobil ke sekolah.)
    Exercise(
        id = "u10_s1_p1_q9",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Saya naik mobil ke sekolah.",
        targetHanzi = "我 坐 车 去 学校。",
        targetPinyin = "Wǒ zuò chē qù xuéxiào.",
        wordChips = listOf("我:wǒ", "坐:zuò", "车:chē", "去:qù", "学校:xuéxiào", "回家:huíjiā"),
        correctAnswer = "我,坐,车,去,学校",
        audioToSpeak = "我坐车去学校。"
    ),

    // 10. Soal 10: Ketuk Pasangan yang Sesuai (Rangkuman Mobil & Naik)
    Exercise(
        id = "u10_s1_p1_m10_1",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u10_s1_p1_m10_1", "车", "chē", "mobil"),
            MatchPairItem("u10_s1_p1_m10_2", "坐车", "zuò chē", "naik mobil"),
            MatchPairItem("u10_s1_p1_m10_3", "坐", "zuò", "naik / duduk"),
            MatchPairItem("u10_s1_p1_m10_4", "去学校", "qù xuéxiào", "ke sekolah")
        )
    )
)

val bab10Stage1Part2Exercises = listOf(
    // 1. Soal 1: Pilihan Gambar (出租车 -> taksi)
    Exercise(
        id = "u10_s1_p2_q1",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "出租车",
        targetPinyin = "chūzūchē",
        targetTranslation = "taksi",
        correctAnswer = "taksi",
        audioToSpeak = "出租车",
        pictureOptions = listOf(
            PictureOption("u10_s1_p2_opt1", "taksi", "", R.drawable.ic_trans_taxi, true),
            PictureOption("u10_s1_p2_opt2", "pesawat", "", R.drawable.ic_trans_airplane, false),
            PictureOption("u10_s1_p2_opt3", "kereta", "", R.drawable.ic_trans_train, false),
            PictureOption("u10_s1_p2_opt4", "mobil", "", R.drawable.ic_trans_car, false)
        )
    ),

    // 2. Soal 2: Susun Kalimat (Kita naik taksi pergi.)
    Exercise(
        id = "u10_s1_p2_q2",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Kita naik taksi pergi.",
        targetHanzi = "我们 坐 出租车 去。",
        targetPinyin = "Wǒmen zuò chūzūchē qù.",
        wordChips = listOf("我们:wǒmen", "坐:zuò", "出租车:chūzūchē", "去:qù", "来:lái", "飞机:fēijī"),
        correctAnswer = "我们,坐,出租车,去",
        audioToSpeak = "我们坐出租车去。"
    ),

    // 3. Soal 3: Ketuk Pasangan yang Sesuai (Taksi & Transportasi Kota)
    Exercise(
        id = "u10_s1_p2_q3",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u10_s1_p2_m1", "出租车", "chūzūchē", "taksi"),
            MatchPairItem("u10_s1_p2_m2", "坐出租车", "zuò chūzūchē", "naik taksi"),
            MatchPairItem("u10_s1_p2_m3", "去火车站", "qù huǒchēzhàn", "ke stasiun"),
            MatchPairItem("u10_s1_p2_m4", "太贵了", "tài guì le", "terlalu mahal")
        )
    ),

    // 4. Soal 4: Ketik Pinyin (taksi -> chūzūchē)
    Exercise(
        id = "u10_s1_p2_q4",
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
        id = "u10_s1_p2_q5",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Apa yang Anda dengar?",
        targetTranslation = "Dia naik taksi ke toko.",
        targetHanzi = "他 坐 出租车 去 商店。",
        targetPinyin = "Tā zuò chūzūchē qù shāngdiàn.",
        wordChips = listOf("他:tā", "坐:zuò", "出租车:chūzūchē", "去:qù", "商店:shāngdiàn", "学校:xuéxiào"),
        correctAnswer = "他,坐,出租车,去,商店",
        illustrationRes = 0,
        audioToSpeak = "他坐出租车去商店。"
    ),

    // 6. Soal 6: Pilihan Kalimat
    Exercise(
        id = "u10_s1_p2_q6",
        type = ExerciseType.SENTENCE_CHOICE,
        title = "Pilih terjemahan yang benar",
        targetHanzi = "坐 出租车 太 贵 了。",
        targetPinyin = "Zuò chūzūchē tài guì le.",
        targetTranslation = "Naik taksi terlalu mahal.",
        correctAnswer = "Zuò chūzūchē tài guì le.\n坐 出租车 太 贵 了。",
        options = listOf(
            "Zuò chūzūchē tài guì le.\n坐 出租车 太 贵 了。",
            "Zuò chūzūchē hěn piányi.\n坐 出租车 很 便宜。",
            "Zuò huǒchē tài guì le.\n坐 火车 太 贵 了。"
        ),
        audioToSpeak = "坐出租车太贵了。"
    ),

    // 7. Soal 7: Pilihan Gambar (坐车 -> naik mobil)
    Exercise(
        id = "u10_s1_p2_q7",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "坐车",
        targetPinyin = "zuò chē",
        targetTranslation = "naik mobil",
        correctAnswer = "naik mobil",
        audioToSpeak = "坐车",
        pictureOptions = listOf(
            PictureOption("u10_s1_p2_opt7_1", "naik mobil", "", R.drawable.ic_trans_ride_car, true),
            PictureOption("u10_s1_p2_opt7_2", "jalan kaki", "", R.drawable.ic_trans_go, false),
            PictureOption("u10_s1_p2_opt7_3", "makan", "", R.drawable.ic_action_eat, false),
            PictureOption("u10_s1_p2_opt7_4", "tidur", "", R.drawable.ic_action_sleep, false)
        )
    ),

    // 8. Soal 8: Ketik Pinyin (naik mobil -> zuòchē)
    Exercise(
        id = "u10_s1_p2_q8",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "naik mobil",
        sentenceWithBlank = "坐车 (________)",
        targetHanzi = "坐车",
        targetPinyin = "zuòchē",
        correctAnswer = "zuoche",
        keyboardKeys = listOf("z", "u", "o", "c", "h", "e", "a", "i", "b", "d", "g"),
        audioToSpeak = "坐车"
    ),

    // 9. Soal 9: Susun Kalimat (Saya naik taksi pulang.)
    Exercise(
        id = "u10_s1_p2_q9",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Saya naik taksi pulang ke rumah.",
        targetHanzi = "我 坐 出租车 回家。",
        targetPinyin = "Wǒ zuò chūzūchē huíjiā.",
        wordChips = listOf("我:wǒ", "坐:zuò", "出租车:chūzūchē", "回家:huíjiā", "去:qù", "学校:xuéxiào"),
        correctAnswer = "我,坐,出租车,回家",
        audioToSpeak = "我坐出租车回家。"
    ),

    // 10. Soal 10: Ketuk Pasangan yang Sesuai (Rangkuman Taksi)
    Exercise(
        id = "u10_s1_p2_m10_1",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u10_s1_p2_m10_1", "出租车", "chūzūchē", "taksi"),
            MatchPairItem("u10_s1_p2_m10_2", "坐出租车", "zuò chūzūchē", "naik taksi"),
            MatchPairItem("u10_s1_p2_m10_3", "回家", "huíjiā", "pulang ke rumah"),
            MatchPairItem("u10_s1_p2_m10_4", "去商店", "qù shāngdiàn", "ke toko")
        )
    )
)
