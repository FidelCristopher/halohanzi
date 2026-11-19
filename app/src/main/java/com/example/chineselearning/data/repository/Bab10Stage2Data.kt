package com.example.chineselearning.data.repository

import com.example.chineselearning.R
import com.example.chineselearning.data.model.Exercise
import com.example.chineselearning.data.model.ExerciseType
import com.example.chineselearning.data.model.MatchPairItem
import com.example.chineselearning.data.model.PictureOption

val bab10Stage2Part1Exercises = listOf(
    // 1. Soal 1: Pilihan Gambar (开车 -> mengemudi / menyetir)
    Exercise(
        id = "u10_s2_p1_q1",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "开车",
        targetPinyin = "kāichē",
        targetTranslation = "menyetir mobil",
        correctAnswer = "menyetir mobil",
        audioToSpeak = "开车",
        pictureOptions = listOf(
            PictureOption("u10_s2_p1_opt1", "menyetir mobil", "🚗", R.drawable.ic_coin, true),
            PictureOption("u10_s2_p1_opt2", "jalan kaki", "🚶", R.drawable.ic_target, false),
            PictureOption("u10_s2_p1_opt3", "duduk", "🪑", R.drawable.ic_book, false),
            PictureOption("u10_s2_p1_opt4", "lari", "🏃", R.drawable.ic_crown, false)
        )
    ),

    // 2. Soal 2: Susun Kalimat (Ayah saya bisa menyetir mobil.)
    Exercise(
        id = "u10_s2_p1_q2",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Ayah saya bisa menyetir mobil.",
        targetHanzi = "我 爸爸 会 开车。",
        targetPinyin = "Wǒ bàba huì kāichē.",
        wordChips = listOf("我:wǒ", "爸爸:bàba", "会:huì", "开车:kāichē", "坐车:zuòchē", "妈妈:māma"),
        correctAnswer = "我,爸爸,会,开车",
        audioToSpeak = "我爸爸会开车。"
    ),

    // 3. Soal 3: Ketuk Pasangan yang Sesuai (Menyetir & Bisa)
    Exercise(
        id = "u10_s2_p1_q3",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u10_s2_p1_m1", "开", "kāi", "menyetir / membuka"),
            MatchPairItem("u10_s2_p1_m2", "开车", "kāichē", "menyetir mobil"),
            MatchPairItem("u10_s2_p1_m3", "会开车", "huì kāichē", "bisa menyetir"),
            MatchPairItem("u10_s2_p1_m4", "不会开车", "bú huì kāichē", "tidak bisa menyetir")
        )
    ),

    // 4. Soal 4: Ketik Pinyin (menyetir/buka -> kāi)
    Exercise(
        id = "u10_s2_p1_q4",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "menyetir / membuka",
        sentenceWithBlank = "开 (________)",
        targetHanzi = "开",
        targetPinyin = "kāi",
        correctAnswer = "kai",
        keyboardKeys = listOf("k", "a", "i", "e", "o", "u", "b", "d", "g", "h", "j"),
        audioToSpeak = "开"
    ),

    // 5. Soal 5: Mendengar Kalimat (Rule 10: illustrationRes = 0)
    Exercise(
        id = "u10_s2_p1_q5",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Apa yang Anda dengar?",
        targetTranslation = "Dia menyetir mobil pergi ke Beijing.",
        targetHanzi = "他 开车 去 北京。",
        targetPinyin = "Tā kāichē qù Běijīng.",
        wordChips = listOf("他:tā", "开车:kāichē", "去:qù", "北京:Běijīng", "坐车:zuòchē", "我:wǒ"),
        correctAnswer = "他,开车,去,北京",
        illustrationRes = 0,
        audioToSpeak = "他开车去北京。"
    ),

    // 6. Soal 6: Pilihan Kalimat
    Exercise(
        id = "u10_s2_p1_q6",
        type = ExerciseType.SENTENCE_CHOICE,
        title = "Pilih terjemahan yang benar",
        targetHanzi = "你会 开车 吗？",
        targetPinyin = "Nǐhuì kāichē ma?",
        targetTranslation = "Apakah kamu bisa menyetir mobil?",
        correctAnswer = "Nǐhuì kāichē ma?\n你会 开车 吗？",
        options = listOf(
            "Nǐhuì kāichē ma?\n你会 开车 吗？",
            "Tāhuì kāichē ma?\n他会 开车 吗？",
            "Nǐhuì zuòchē ma?\n你会 坐车 吗？"
        ),
        audioToSpeak = "你会开车吗？"
    ),

    // 7. Soal 7: Pilihan Gambar (开 -> membuka / menyetir)
    Exercise(
        id = "u10_s2_p1_q7",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "开",
        targetPinyin = "kāi",
        targetTranslation = "membuka / menyetir",
        correctAnswer = "membuka / menyetir",
        audioToSpeak = "开",
        pictureOptions = listOf(
            PictureOption("u10_s2_p1_opt7_1", "membuka / menyetir", "🚗", R.drawable.ic_coin, true),
            PictureOption("u10_s2_p1_opt7_2", "menutup", "🚪", R.drawable.ic_target, false),
            PictureOption("u10_s2_p1_opt7_3", "makan", "🍜", R.drawable.ic_book, false),
            PictureOption("u10_s2_p1_opt7_4", "tidur", "🛌", R.drawable.ic_crown, false)
        )
    ),

    // 8. Soal 8: Ketik Pinyin (menyetir mobil -> kāichē)
    Exercise(
        id = "u10_s2_p1_q8",
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

    // 9. Soal 9: Susun Kalimat (Saya tidak bisa menyetir mobil.)
    Exercise(
        id = "u10_s2_p1_q9",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Saya tidak bisa menyetir mobil.",
        targetHanzi = "我 不 会 开车。",
        targetPinyin = "Wǒ bú huì kāichē.",
        wordChips = listOf("我:wǒ", "不:bú", "会:huì", "开车:kāichē", "坐车:zuòchē", "想:xiǎng"),
        correctAnswer = "我,不,会,开车",
        audioToSpeak = "我不会开车。"
    ),

    // 10. Soal 10: Ketuk Pasangan yang Sesuai (Rangkuman Menyetir)
    Exercise(
        id = "u10_s2_p1_m10_1",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u10_s2_p1_m10_1", "开车", "kāichē", "menyetir"),
            MatchPairItem("u10_s2_p1_m10_2", "坐车", "zuò chē", "naik mobil"),
            MatchPairItem("u10_s2_p1_m10_3", "会开车", "huì kāichē", "bisa mengemudi"),
            MatchPairItem("u10_s2_p1_m10_4", "我爸爸", "wǒ bàba", "ayah saya")
        )
    )
)

val bab10Stage2Part2Exercises = listOf(
    // 1. Soal 1: Pilihan Gambar (开车去学校 -> menyetir ke sekolah)
    Exercise(
        id = "u10_s2_p2_q1",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "开车",
        targetPinyin = "kāichē",
        targetTranslation = "menyetir mobil",
        correctAnswer = "menyetir mobil",
        audioToSpeak = "开车",
        pictureOptions = listOf(
            PictureOption("u10_s2_p2_opt1", "menyetir mobil", "🚗", R.drawable.ic_coin, true),
            PictureOption("u10_s2_p2_opt2", "pesawat", "✈️", R.drawable.ic_target, false),
            PictureOption("u10_s2_p2_opt3", "kereta", "🚆", R.drawable.ic_book, false),
            PictureOption("u10_s2_p2_opt4", "berjalan", "🚶", R.drawable.ic_crown, false)
        )
    ),

    // 2. Soal 2: Susun Kalimat (Guru Wang menyetir mobil ke sekolah.)
    Exercise(
        id = "u10_s2_p2_q2",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Guru Wang menyetir ke sekolah.",
        targetHanzi = "王老师 开车 去 学校。",
        targetPinyin = "Wáng lǎoshī kāichē qù xuéxiào.",
        wordChips = listOf("王老师:Wáng lǎoshī", "开车:kāichē", "去:qù", "学校:xuéxiào", "回家:huíjiā"),
        correctAnswer = "王老师,开车,去,学校",
        audioToSpeak = "王老师开车去学校。"
    ),

    // 3. Soal 3: Ketuk Pasangan yang Sesuai (Aktivitas Kemudi)
    Exercise(
        id = "u10_s2_p2_q3",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u10_s2_p2_m1", "开车去", "kāichē qù", "menyetir pergi"),
            MatchPairItem("u10_s2_p2_m2", "坐车去", "zuò chē qù", "naik mobil pergi"),
            MatchPairItem("u10_s2_p2_m3", "去学校", "qù xuéxiào", "ke sekolah"),
            MatchPairItem("u10_s2_p2_m4", "回家", "huíjiā", "pulang ke rumah")
        )
    ),

    // 4. Soal 4: Ketik Pinyin (bisa menyetir -> huì kāichē)
    Exercise(
        id = "u10_s2_p2_q4",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "bisa menyetir mobil",
        sentenceWithBlank = "会开车 (________)",
        targetHanzi = "会开车",
        targetPinyin = "huìkāichē",
        correctAnswer = "huikaiche",
        keyboardKeys = listOf("h", "u", "i", "k", "a", "c", "e", "o", "b", "d", "g"),
        audioToSpeak = "会开车"
    ),

    // 5. Soal 5: Mendengar Kalimat (Rule 10: illustrationRes = 0)
    Exercise(
        id = "u10_s2_p2_q5",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Apa yang Anda dengar?",
        targetTranslation = "Dia sedang menyetir mobil.",
        targetHanzi = "他 正在 开车。",
        targetPinyin = "Tā zhèngzài kāichē.",
        wordChips = listOf("他:tā", "正在:zhèngzài", "开车:kāichē", "看书:kànshū", "睡觉:shuìjiào"),
        correctAnswer = "他,正在,开车",
        illustrationRes = 0,
        audioToSpeak = "他正在开车。"
    ),

    // 6. Soal 6: Pilihan Kalimat
    Exercise(
        id = "u10_s2_p2_q6",
        type = ExerciseType.SENTENCE_CHOICE,
        title = "Pilih terjemahan yang benar",
        targetHanzi = "谁 在 开车？",
        targetPinyin = "Shéi zài kāichē?",
        targetTranslation = "Siapa yang sedang menyetir?",
        correctAnswer = "Shéi zài kāichē?\n谁 在 开车？",
        options = listOf(
            "Shéi zài kāichē?\n谁 在 开车？",
            "Shéi zài zuòchē?\n谁 在 坐车？",
            "Tā zài kāichē?\n他 在 开车？"
        ),
        audioToSpeak = "谁在开车？"
    ),

    // 7. Soal 7: Pilihan Gambar (开车回家 -> menyetir pulang ke rumah)
    Exercise(
        id = "u10_s2_p2_q7",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "回家",
        targetPinyin = "huíjiā",
        targetTranslation = "pulang ke rumah",
        correctAnswer = "pulang ke rumah",
        audioToSpeak = "回家",
        pictureOptions = listOf(
            PictureOption("u10_s2_p2_opt7_1", "pulang ke rumah", "🏠", R.drawable.ic_people_group, true),
            PictureOption("u10_s2_p2_opt7_2", "ke sekolah", "🏫", R.drawable.ic_cap, false),
            PictureOption("u10_s2_p2_opt7_3", "ke toko", "🏪", R.drawable.ic_coin, false),
            PictureOption("u10_s2_p2_opt7_4", "ke stasiun", "🚆", R.drawable.ic_target, false)
        )
    ),

    // 8. Soal 8: Ketik Pinyin (tidak bisa menyetir -> bú huì kāichē)
    Exercise(
        id = "u10_s2_p2_q8",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "tidak bisa menyetir",
        sentenceWithBlank = "不会开车 (________)",
        targetHanzi = "不会开车",
        targetPinyin = "búhuìkāichē",
        correctAnswer = "buhuikaiche",
        keyboardKeys = listOf("b", "u", "h", "i", "k", "a", "c", "e", "o", "d", "g"),
        audioToSpeak = "不会开车"
    ),

    // 9. Soal 9: Susun Kalimat (Ibu saya tidak bisa menyetir mobil.)
    Exercise(
        id = "u10_s2_p2_q9",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Ibu saya tidak bisa menyetir.",
        targetHanzi = "我 妈妈 不 会 开车。",
        targetPinyin = "Wǒ māma bù huì kāichē.",
        wordChips = listOf("我:wǒ", "妈妈:māma", "不:bù", "会:huì", "开车:kāichē", "爸爸:bàba"),
        correctAnswer = "我,妈妈,不,会,开车",
        audioToSpeak = "我妈妈不会开车。"
    ),

    // 10. Soal 10: Ketuk Pasangan yang Sesuai (Rangkuman Mengemudi)
    Exercise(
        id = "u10_s2_p2_m10_1",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u10_s2_p2_m10_1", "开车", "kāichē", "menyetir mobil"),
            MatchPairItem("u10_s2_p2_m10_2", "正在开车", "zhèngzài kāichē", "sedang menyetir"),
            MatchPairItem("u10_s2_p2_m10_3", "会开车", "huì kāichē", "bisa mengemudi"),
            MatchPairItem("u10_s2_p2_m10_4", "不会开车", "bú huì kāichē", "tidak bisa menyetir")
        )
    )
)
