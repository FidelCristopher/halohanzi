package com.example.chineselearning.data.repository

import com.example.chineselearning.R
import com.example.chineselearning.data.model.Exercise
import com.example.chineselearning.data.model.ExerciseType
import com.example.chineselearning.data.model.MatchPairItem
import com.example.chineselearning.data.model.PictureOption

val bab16Stage2Part1Exercises = listOf(
    // 1. Soal 1: Pilihan Gambar (能 -> sanggup / bisa)
    Exercise(
        id = "u16_s2_p1_q1",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "能",
        targetPinyin = "néng",
        targetTranslation = "bisa / sanggup",
        correctAnswer = "bisa / sanggup",
        audioToSpeak = "能",
        pictureOptions = listOf(
            PictureOption("u16_s2_p1_opt1", "bisa / sanggup", "", R.drawable.ic_mod_can, true),
            PictureOption("u16_s2_p1_opt2", "tidak bisa", "", R.drawable.ic_mod_forbidden, false),
            PictureOption("u16_s2_p1_opt3", "tidur", "", R.drawable.ic_action_sleep, false),
            PictureOption("u16_s2_p1_opt4", "makan", "", R.drawable.ic_action_eat, false)
        )
    ),

    // 2. Soal 2: Susun Kalimat (Hari ini saya bisa datang.)
    Exercise(
        id = "u16_s2_p1_q2",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Hari ini saya bisa datang.",
        targetHanzi = "今天 我 能 来。",
        targetPinyin = "Jīntiān wǒ néng lái.",
        wordChips = listOf("今天:jīntiān", "我:wǒ", "能:néng", "来:lái", "不:bù", "去:qù"),
        correctAnswer = "今天,我,能,来",
        audioToSpeak = "今天我能来。"
    ),

    // 3. Soal 3: Ketuk Pasangan yang Sesuai (Modalitas Kemampuan)
    Exercise(
        id = "u16_s2_p1_q3",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u16_s2_p1_m1", "能", "néng", "bisa / sanggup"),
            MatchPairItem("u16_s2_p1_m2", "会", "huì", "bisa (keterampilan) / akan"),
            MatchPairItem("u16_s2_p1_m3", "不能", "bù néng", "tidak bisa / tidak sanggup"),
            MatchPairItem("u16_s2_p1_m4", "不会", "bú huì", "tidak bisa")
        )
    ),

    // 4. Soal 4: Ketik Pinyin (bisa/sanggup -> néng)
    Exercise(
        id = "u16_s2_p1_q4",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "bisa / sanggup",
        sentenceWithBlank = "能 (________)",
        targetHanzi = "能",
        targetPinyin = "néng",
        correctAnswer = "neng",
        keyboardKeys = listOf("n", "e", "g", "a", "i", "o", "u", "b", "d", "h", "j"),
        audioToSpeak = "能"
    ),

    // 5. Soal 5: Mendengar Kalimat (Rule 10: illustrationRes = 0)
    Exercise(
        id = "u16_s2_p1_q5",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Apa yang Anda dengar?",
        targetTranslation = "Dia sakit tidak bisa datang.",
        targetHanzi = "他 生病 了 不能 来。",
        targetPinyin = "Tā shēngbìng le bùnéng lái.",
        wordChips = listOf("他:tā", "生病:shēngbìng", "了:le", "不能:bùnéng", "来:lái", "我:wǒ"),
        correctAnswer = "他,生病,了,不能,来",
        illustrationRes = 0,
        audioToSpeak = "他生病了不能来。"
    ),

    // 6. Soal 6: Pilihan Kalimat
    Exercise(
        id = "u16_s2_p1_q6",
        type = ExerciseType.SENTENCE_CHOICE,
        title = "Pilih terjemahan yang benar",
        targetHanzi = "你 能 来 我 家 吗？",
        targetPinyin = "Nǐ néng lái wǒ jiā ma?",
        targetTranslation = "Bisakah kamu datang ke rumah saya?",
        correctAnswer = "Nǐ néng lái wǒ jiā ma?\n你 能 来 我 家 吗？",
        options = listOf(
            "Nǐ néng lái wǒ jiā ma?\n你 能 来 我 家 吗？",
            "Tā néng lái wǒ jiā ma?\n他 能 来 我 家 吗？",
            "Nǐ huì lái wǒ jiā ma?\n你 会 来 我 家 吗？"
        ),
        audioToSpeak = "你能来我家吗？"
    ),

    // 7. Soal 7: Pilihan Gambar (会 -> bisa keterampilan)
    Exercise(
        id = "u16_s2_p1_q7",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "会",
        targetPinyin = "huì",
        targetTranslation = "bisa (keterampilan)",
        correctAnswer = "bisa (keterampilan)",
        audioToSpeak = "会",
        pictureOptions = listOf(
            PictureOption("u16_s2_p1_opt7_1", "bisa", "", R.drawable.ic_mod_can, true),
            PictureOption("u16_s2_p1_opt7_2", "tidak", "", R.drawable.ic_mod_wrong, false),
            PictureOption("u16_s2_p1_opt7_3", "buku", "", R.drawable.ic_book_chinese, false),
            PictureOption("u16_s2_p1_opt7_4", "tidur", "", R.drawable.ic_action_sleep, false)
        )
    ),

    // 8. Soal 8: Ketik Pinyin (bisa -> huì)
    Exercise(
        id = "u16_s2_p1_q8",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "bisa (keterampilan)",
        sentenceWithBlank = "会 (________)",
        targetHanzi = "会",
        targetPinyin = "huì",
        correctAnswer = "hui",
        keyboardKeys = listOf("h", "u", "i", "a", "e", "o", "b", "d", "g", "j", "l"),
        audioToSpeak = "会"
    ),

    // 9. Soal 9: Susun Kalimat (Saya bisa berbicara bahasa Mandarin.)
    Exercise(
        id = "u16_s2_p1_q9",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Saya bisa bicara bahasa Mandarin.",
        targetHanzi = "我 会 说 汉语。",
        targetPinyin = "Wǒ huì shuō Hànyǔ.",
        wordChips = listOf("我:wǒ", "会:huì", "说:shuō", "汉语:Hànyǔ", "能:néng"),
        correctAnswer = "我,会,说,汉语",
        audioToSpeak = "我会说汉语。"
    ),

    // 10. Soal 10: Ketuk Pasangan yang Sesuai (Rangkuman Modalitas)
    Exercise(
        id = "u16_s2_p1_m10_1",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u16_s2_p1_m10_1", "能", "néng", "bisa"),
            MatchPairItem("u16_s2_p1_m10_2", "会", "huì", "bisa"),
            MatchPairItem("u16_s2_p1_m10_3", "会说", "huì shuō", "bisa bicara"),
            MatchPairItem("u16_s2_p1_m10_4", "能来", "néng lái", "bisa datang")
        )
    )
)

val bab16Stage2Part2Exercises = listOf(
    // 1. Soal 1: Pilihan Gambar (可以 -> boleh / bisa)
    Exercise(
        id = "u16_s2_p2_q1",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "可以",
        targetPinyin = "kěyǐ",
        targetTranslation = "boleh / bisa",
        correctAnswer = "boleh / bisa",
        audioToSpeak = "可以",
        pictureOptions = listOf(
            PictureOption("u16_s2_p2_opt1", "boleh / bisa", "", R.drawable.ic_mod_allow, true),
            PictureOption("u16_s2_p2_opt2", "jangan", "", R.drawable.ic_mod_dont, false),
            PictureOption("u16_s2_p2_opt3", "makan", "", R.drawable.ic_action_eat, false),
            PictureOption("u16_s2_p2_opt4", "tidur", "", R.drawable.ic_action_sleep, false)
        )
    ),

    // 2. Soal 2: Susun Kalimat (Bolehkah saya duduk di sini?)
    Exercise(
        id = "u16_s2_p2_q2",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Bolehkah saya duduk di sini?",
        targetHanzi = "我 可以 坐 在 这儿 吗？",
        targetPinyin = "Wǒ kěyǐ zuò zài zhèr ma?",
        wordChips = listOf("我:wǒ", "可以:kěyǐ", "坐:zuò", "在:zài", "这儿:zhèr", "吗？:ma?"),
        correctAnswer = "我,可以,坐,在,这儿,吗？",
        audioToSpeak = "我可以坐在这儿吗？"
    ),

    // 3. Soal 3: Ketuk Pasangan yang Sesuai (Izin & Kebolehan)
    Exercise(
        id = "u16_s2_p2_m3",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u16_s2_p2_m1", "可以", "kěyǐ", "boleh / bisa"),
            MatchPairItem("u16_s2_p2_m2", "不可以", "bù kěyǐ", "tidak boleh"),
            MatchPairItem("u16_s2_p2_m3", "可以坐", "kěyǐ zuò", "boleh duduk"),
            MatchPairItem("u16_s2_p2_m4", "可以去", "kěyǐ qù", "boleh pergi")
        )
    ),

    // 4. Soal 4: Ketik Pinyin (boleh -> kěyǐ)
    Exercise(
        id = "u16_s2_p2_q4",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "boleh / bisa",
        sentenceWithBlank = "可以 (________)",
        targetHanzi = "可以",
        targetPinyin = "kěyǐ",
        correctAnswer = "keyi",
        keyboardKeys = listOf("k", "e", "y", "i", "a", "o", "u", "b", "d", "g", "h"),
        audioToSpeak = "可以"
    ),

    // 5. Soal 5: Mendengar Kalimat (Rule 10: illustrationRes = 0)
    Exercise(
        id = "u16_s2_p2_q5",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Apa yang Anda dengar?",
        targetTranslation = "Boleh, silakan duduk.",
        targetHanzi = "可以， 请 坐。",
        targetPinyin = "Kěyǐ, qǐng zuò.",
        wordChips = listOf("可以，:kěyǐ,", "请:qǐng", "坐。:zuò.", "走:zǒu"),
        correctAnswer = "可以，,请,坐。",
        illustrationRes = 0,
        audioToSpeak = "可以，请坐。"
    ),

    // 6. Soal 6: Pilihan Kalimat
    Exercise(
        id = "u16_s2_p2_q6",
        type = ExerciseType.SENTENCE_CHOICE,
        title = "Pilih terjemahan yang benar",
        targetHanzi = "这里 不 可以 说话。",
        targetPinyin = "Zhèlǐ bù kěyǐ shuōhuà.",
        targetTranslation = "Di sini tidak boleh berbicara.",
        correctAnswer = "Zhèlǐ bù kěyǐ shuōhuà.\n这里 不 可以 说话。",
        options = listOf(
            "Zhèlǐ bù kěyǐ shuōhuà.\n这里 不 可以 说话。",
            "Zhèlǐ kěyǐ shuōhuà.\n这里 可以 说话。",
            "Nàlǐ bù kěyǐ shuōhuà.\n那里 不 可以 说话。"
        ),
        audioToSpeak = "这里不可以说话。"
    ),

    // 7. Soal 7: Pilihan Gambar (不可以 -> tidak boleh)
    Exercise(
        id = "u16_s2_p2_q7",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "不可以",
        targetPinyin = "bù kěyǐ",
        targetTranslation = "tidak boleh",
        correctAnswer = "tidak boleh",
        audioToSpeak = "不可以",
        pictureOptions = listOf(
            PictureOption("u16_s2_p2_opt7_1", "tidak boleh", "", R.drawable.ic_mod_forbidden, true),
            PictureOption("u16_s2_p2_opt7_2", "boleh", "", R.drawable.ic_mod_allow, false),
            PictureOption("u16_s2_p2_opt7_3", "makan", "", R.drawable.ic_action_eat, false),
            PictureOption("u16_s2_p2_opt7_4", "tidur", "", R.drawable.ic_action_sleep, false)
        )
    ),

    // 8. Soal 8: Ketik Pinyin (tidak boleh -> bùkěyǐ)
    Exercise(
        id = "u16_s2_p2_q8",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "tidak boleh",
        sentenceWithBlank = "不可以 (________)",
        targetHanzi = "不可以",
        targetPinyin = "bùkěyǐ",
        correctAnswer = "bukeyi",
        keyboardKeys = listOf("b", "u", "k", "e", "y", "i", "a", "o", "d", "g", "h"),
        audioToSpeak = "不可以"
    ),

    // 9. Soal 9: Susun Kalimat (Anda boleh pulang.)
    Exercise(
        id = "u16_s2_p2_q9",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Kamu boleh pulang ke rumah.",
        targetHanzi = "你 可以 回家 了。",
        targetPinyin = "Nǐ kěyǐ huíjiā le.",
        wordChips = listOf("你:nǐ", "可以:kěyǐ", "回家:huíjiā", "了。:le.", "去:qù"),
        correctAnswer = "你,可以,回家,了。",
        audioToSpeak = "你可以回家了。"
    ),

    // 10. Soal 10: Ketuk Pasangan yang Sesuai (Rangkuman Izin)
    Exercise(
        id = "u16_s2_p2_m10_1",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u16_s2_p2_m10_1", "可以", "kěyǐ", "boleh"),
            MatchPairItem("u16_s2_p2_m10_2", "不可以", "bù kěyǐ", "tidak boleh"),
            MatchPairItem("u16_s2_p2_m10_3", "可以回家", "kěyǐ huíjiā", "boleh pulang"),
            MatchPairItem("u16_s2_p2_m10_4", "可以吃", "kěyǐ chī", "boleh makan")
        )
    )
)
