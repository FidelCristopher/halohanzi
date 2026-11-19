package com.example.chineselearning.data.repository

import com.example.chineselearning.R
import com.example.chineselearning.data.model.Exercise
import com.example.chineselearning.data.model.ExerciseType
import com.example.chineselearning.data.model.MatchPairItem
import com.example.chineselearning.data.model.PictureOption

val bab10Stage4Part1Exercises = listOf(
    // 1. Soal 1: Pilihan Gambar (去 -> pergi)
    Exercise(
        id = "u10_s4_p1_q1",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "去",
        targetPinyin = "qù",
        targetTranslation = "pergi",
        correctAnswer = "pergi",
        audioToSpeak = "去",
        pictureOptions = listOf(
            PictureOption("u10_s4_p1_opt1", "pergi", "🚶", R.drawable.ic_trans_go, true),
            PictureOption("u10_s4_p1_opt2", "datang", "👋", R.drawable.ic_target, false),
            PictureOption("u10_s4_p1_opt3", "duduk", "🪑", R.drawable.ic_book, false),
            PictureOption("u10_s4_p1_opt4", "tidur", "🛌", R.drawable.ic_crown, false)
        )
    ),

    // 2. Soal 2: Susun Kalimat (Kamu pergi ke mana?)
    Exercise(
        id = "u10_s4_p1_q2",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Kamu pergi ke mana?",
        targetHanzi = "你 去 哪儿？",
        targetPinyin = "Nǐ qù nǎr?",
        wordChips = listOf("你:nǐ", "去:qù", "哪儿:nǎr", "来:lái", "在:zài"),
        correctAnswer = "你,去,哪儿",
        audioToSpeak = "你去哪儿？"
    ),

    // 3. Soal 3: Ketuk Pasangan yang Sesuai (Pergi & Datang)
    Exercise(
        id = "u10_s4_p1_q3",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u10_s4_p1_m1", "去", "qù", "pergi"),
            MatchPairItem("u10_s4_p1_m2", "来", "lái", "datang"),
            MatchPairItem("u10_s4_p1_m3", "去学校", "qù xuéxiào", "pergi ke sekolah"),
            MatchPairItem("u10_s4_p1_m4", "来北京", "lái Běijīng", "datang ke Beijing")
        )
    ),

    // 4. Soal 4: Ketik Pinyin (pergi -> qù)
    Exercise(
        id = "u10_s4_p1_q4",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "pergi",
        sentenceWithBlank = "去 (________)",
        targetHanzi = "去",
        targetPinyin = "qù",
        correctAnswer = "qu",
        keyboardKeys = listOf("q", "u", "a", "e", "i", "o", "b", "d", "g", "h", "j"),
        audioToSpeak = "去"
    ),

    // 5. Soal 5: Mendengar Kalimat (Rule 10: illustrationRes = 0)
    Exercise(
        id = "u10_s4_p1_q5",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Apa yang Anda dengar?",
        targetTranslation = "Kapan dia datang?",
        targetHanzi = "他 什么时候 来？",
        targetPinyin = "Tā shénme shíhou lái?",
        wordChips = listOf("他:tā", "什么时候:shénme shíhou", "来:lái", "去:qù", "回:huí"),
        correctAnswer = "他,什么时候,来",
        illustrationRes = 0,
        audioToSpeak = "他什么时候来？"
    ),

    // 6. Soal 6: Pilihan Kalimat
    Exercise(
        id = "u10_s4_p1_q6",
        type = ExerciseType.SENTENCE_CHOICE,
        title = "Pilih terjemahan yang benar",
        targetHanzi = "明天 我 去 他 家。",
        targetPinyin = "Míngtiān wǒ qù tā jiā.",
        targetTranslation = "Besok saya pergi ke rumahnya.",
        correctAnswer = "Míngtiān wǒ qù tā jiā.\n明天 我 去 他 家。",
        options = listOf(
            "Míngtiān wǒ qù tā jiā.\n明天 我 去 他 家。",
            "Jīntiān wǒ qù tā jiā.\n今天 我 去 他 家。",
            "Míngtiān tā lái wǒ jiā.\n明天 他 来 我 家。"
        ),
        audioToSpeak = "明天我去他家。"
    ),

    // 7. Soal 7: Pilihan Gambar (来 -> datang)
    Exercise(
        id = "u10_s4_p1_q7",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "来",
        targetPinyin = "lái",
        targetTranslation = "datang",
        correctAnswer = "datang",
        audioToSpeak = "来",
        pictureOptions = listOf(
            PictureOption("u10_s4_p1_opt7_1", "datang", "👋", R.drawable.ic_trans_come, true),
            PictureOption("u10_s4_p1_opt7_2", "pergi", "🚶", R.drawable.ic_target, false),
            PictureOption("u10_s4_p1_opt7_3", "makan", "🍜", R.drawable.ic_book, false),
            PictureOption("u10_s4_p1_opt7_4", "tidur", "🛌", R.drawable.ic_crown, false)
        )
    ),

    // 8. Soal 8: Ketik Pinyin (datang -> lái)
    Exercise(
        id = "u10_s4_p1_q8",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "datang",
        sentenceWithBlank = "来 (________)",
        targetHanzi = "来",
        targetPinyin = "lái",
        correctAnswer = "lai",
        keyboardKeys = listOf("l", "a", "i", "e", "o", "u", "b", "d", "g", "h", "j"),
        audioToSpeak = "来"
    ),

    // 9. Soal 9: Susun Kalimat (Selamat datang di Tiongkok!)
    Exercise(
        id = "u10_s4_p1_q9",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Selamat datang di Tiongkok!",
        targetHanzi = "欢迎 来 中国！",
        targetPinyin = "Huānyíng lái Zhōngguó!",
        wordChips = listOf("欢迎:huānyíng", "来:lái", "中国:Zhōngguó", "北京:Běijīng", "去:qù"),
        correctAnswer = "欢迎,来,中国",
        audioToSpeak = "欢迎来中国！"
    ),

    // 10. Soal 10: Ketuk Pasangan yang Sesuai (Rangkuman Pergi & Datang)
    Exercise(
        id = "u10_s4_p1_m10_1",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u10_s4_p1_m10_1", "去", "qù", "pergi"),
            MatchPairItem("u10_s4_p1_m10_2", "来", "lái", "datang"),
            MatchPairItem("u10_s4_p1_m10_3", "去哪儿", "qù nǎr", "pergi ke mana"),
            MatchPairItem("u10_s4_p1_m10_4", "来这里", "lái zhèlǐ", "datang ke sini")
        )
    )
)

val bab10Stage4Part2Exercises = listOf(
    // 1. Soal 1: Pilihan Gambar (回 -> kembali / pulang)
    Exercise(
        id = "u10_s4_p2_q1",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "回",
        targetPinyin = "huí",
        targetTranslation = "kembali / pulang",
        correctAnswer = "kembali / pulang",
        audioToSpeak = "回",
        pictureOptions = listOf(
            PictureOption("u10_s4_p2_opt1", "kembali / pulang", "🏠", R.drawable.ic_trans_return_home, true),
            PictureOption("u10_s4_p2_opt2", "pergi", "🚶", R.drawable.ic_target, false),
            PictureOption("u10_s4_p2_opt3", "datang", "👋", R.drawable.ic_book, false),
            PictureOption("u10_s4_p2_opt4", "duduk", "🪑", R.drawable.ic_crown, false)
        )
    ),

    // 2. Soal 2: Susun Kalimat (Saya jam lima pulang ke rumah.)
    Exercise(
        id = "u10_s4_p2_q2",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Saya jam lima pulang ke rumah.",
        targetHanzi = "我 五 点 回家。",
        targetPinyin = "Wǒ wǔ diǎn huíjiā.",
        wordChips = listOf("我:wǒ", "五:wǔ", "点:diǎn", "回家:huíjiā", "六:liù", "去:qù"),
        correctAnswer = "我,五,点,回家",
        audioToSpeak = "我五点回家。"
    ),

    // 3. Soal 3: Ketuk Pasangan yang Sesuai (Pulang & Kembali)
    Exercise(
        id = "u10_s4_p2_q3",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u10_s4_p2_m1", "回", "huí", "kembali / pulang"),
            MatchPairItem("u10_s4_p2_m2", "回家", "huíjiā", "pulang ke rumah"),
            MatchPairItem("u10_s4_p2_m3", "回学校", "huí xuéxiào", "kembali ke sekolah"),
            MatchPairItem("u10_s4_p2_m4", "回国", "huíguó", "pulang ke negara asal")
        )
    ),

    // 4. Soal 4: Ketik Pinyin (kembali -> huí)
    Exercise(
        id = "u10_s4_p2_q4",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "kembali / pulang",
        sentenceWithBlank = "回 (________)",
        targetHanzi = "回",
        targetPinyin = "huí",
        correctAnswer = "hui",
        keyboardKeys = listOf("h", "u", "i", "a", "e", "o", "b", "d", "g", "j", "l"),
        audioToSpeak = "回"
    ),

    // 5. Soal 5: Mendengar Kalimat (Rule 10: illustrationRes = 0)
    Exercise(
        id = "u10_s4_p2_q5",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Apa yang Anda dengar?",
        targetTranslation = "Kapan kamu pulang ke rumah?",
        targetHanzi = "你 什么时候 回家？",
        targetPinyin = "Nǐ shénme shíhou huíjiā?",
        wordChips = listOf("你:nǐ", "什么时候:shénme shíhou", "回家:huíjiā", "去:qù", "他:tā"),
        correctAnswer = "你,什么时候,回家",
        illustrationRes = 0,
        audioToSpeak = "你什么时候回家？"
    ),

    // 6. Soal 6: Pilihan Kalimat
    Exercise(
        id = "u10_s4_p2_q6",
        type = ExerciseType.SENTENCE_CHOICE,
        title = "Pilih terjemahan yang benar",
        targetHanzi = "他 已经 回家 了。",
        targetPinyin = "Tā yǐjīng huíjiā le.",
        targetTranslation = "Dia sudah pulang ke rumah.",
        correctAnswer = "Tā yǐjīng huíjiā le.\n他 已经 回家 了。",
        options = listOf(
            "Tā yǐjīng huíjiā le.\n他 已经 回家 了。",
            "Wǒ yǐjīng huíjiā le.\n我 已经 回家 了。",
            "Tā yǐjīng qù xuéxiào le.\n他 已经 去 学校 了。"
        ),
        audioToSpeak = "他已经回家了。"
    ),

    // 7. Soal 7: Pilihan Gambar (回家 -> pulang ke rumah)
    Exercise(
        id = "u10_s4_p2_q7",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "回家",
        targetPinyin = "huíjiā",
        targetTranslation = "pulang ke rumah",
        correctAnswer = "pulang ke rumah",
        audioToSpeak = "回家",
        pictureOptions = listOf(
            PictureOption("u10_s4_p2_opt7_1", "pulang ke rumah", "🏠", R.drawable.ic_trans_return_home, true),
            PictureOption("u10_s4_p2_opt7_2", "ke sekolah", "🏫", R.drawable.ic_cap, false),
            PictureOption("u10_s4_p2_opt7_3", "ke toko", "🏪", R.drawable.ic_target, false),
            PictureOption("u10_s4_p2_opt7_4", "ke stasiun", "🚉", R.drawable.ic_book, false)
        )
    ),

    // 8. Soal 8: Ketik Pinyin (pulang ke rumah -> huíjiā)
    Exercise(
        id = "u10_s4_p2_q8",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "pulang ke rumah",
        sentenceWithBlank = "回家 (________)",
        targetHanzi = "回家",
        targetPinyin = "huíjiā",
        correctAnswer = "huijia",
        keyboardKeys = listOf("h", "u", "i", "j", "a", "e", "o", "b", "d", "g", "l"),
        audioToSpeak = "回家"
    ),

    // 9. Soal 9: Susun Kalimat (Ibu saya kembali ke rumah.)
    Exercise(
        id = "u10_s4_p2_q9",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Ibu kembali ke rumah.",
        targetHanzi = "妈妈 回到 家 了。",
        targetPinyin = "Māma huídào jiā le.",
        wordChips = listOf("妈妈:māma", "回到:huídào", "家:jiā", "了:le", "学校:xuéxiào", "去:qù"),
        correctAnswer = "妈妈,回到,家,了",
        audioToSpeak = "妈妈回到家了。"
    ),

    // 10. Soal 10: Ketuk Pasangan yang Sesuai (Rangkuman Pulang)
    Exercise(
        id = "u10_s4_p2_m10_1",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u10_s4_p2_m10_1", "回", "huí", "pulang / kembali"),
            MatchPairItem("u10_s4_p2_m10_2", "回家", "huíjiā", "pulang ke rumah"),
            MatchPairItem("u10_s4_p2_m10_3", "回到家", "huí dào jiā", "sampai di rumah"),
            MatchPairItem("u10_s4_p2_m10_4", "回学校", "huí xuéxiào", "kembali ke sekolah")
        )
    )
)
