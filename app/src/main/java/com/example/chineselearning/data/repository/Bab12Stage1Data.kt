package com.example.chineselearning.data.repository

import com.example.chineselearning.R
import com.example.chineselearning.data.model.Exercise
import com.example.chineselearning.data.model.ExerciseType
import com.example.chineselearning.data.model.MatchPairItem
import com.example.chineselearning.data.model.PictureOption

val bab12Stage1Part1Exercises = listOf(
    // 1. Soal 1: Pilihan Gambar (公司 -> perusahaan / kantor)
    Exercise(
        id = "u12_s1_p1_q1",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "公司",
        targetPinyin = "gōngsī",
        targetTranslation = "perusahaan",
        correctAnswer = "perusahaan",
        audioToSpeak = "公司",
        pictureOptions = listOf(
            PictureOption("u12_s1_p1_opt1", "perusahaan", "🏢", R.drawable.ic_coin, true),
            PictureOption("u12_s1_p1_opt2", "sekolah", "🏫", R.drawable.ic_cap, false),
            PictureOption("u12_s1_p1_opt3", "rumah", "🏠", R.drawable.ic_people_group, false),
            PictureOption("u12_s1_p1_opt4", "rumah sakit", "🏥", R.drawable.ic_book, false)
        )
    ),

    // 2. Soal 2: Susun Kalimat (Saya bekerja di perusahaan.)
    Exercise(
        id = "u12_s1_p1_q2",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Saya bekerja di perusahaan.",
        targetHanzi = "我 在 公司 工作。",
        targetPinyin = "Wǒ zài gōngsī gōngzuò.",
        wordChips = listOf("我:wǒ", "在:zài", "公司:gōngsī", "工作:gōngzuò", "学校:xuéxiào", "学习:xuéxí"),
        correctAnswer = "我,在,公司,工作",
        audioToSpeak = "我在公司工作。"
    ),

    // 3. Soal 3: Ketuk Pasangan yang Sesuai (Bekerja & Perusahaan)
    Exercise(
        id = "u12_s1_p1_q3",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u12_s1_p1_m1", "工作", "gōngzuò", "bekerja / pekerjaan"),
            MatchPairItem("u12_s1_p1_m2", "公司", "gōngsī", "perusahaan"),
            MatchPairItem("u12_s1_p1_m3", "去公司", "qù gōngsī", "pergi ke kantor"),
            MatchPairItem("u12_s1_p1_m4", "好工作", "hǎo gōngzuò", "pekerjaan bagus")
        )
    ),

    // 4. Soal 4: Ketik Pinyin (bekerja -> gōngzuò)
    Exercise(
        id = "u12_s1_p1_q4",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "bekerja / pekerjaan",
        sentenceWithBlank = "工作 (________)",
        targetHanzi = "工作",
        targetPinyin = "gōngzuò",
        correctAnswer = "gongzuo",
        keyboardKeys = listOf("g", "o", "n", "z", "u", "a", "e", "i", "b", "d", "h"),
        audioToSpeak = "工作"
    ),

    // 5. Soal 5: Mendengar Kalimat (Rule 10: illustrationRes = 0)
    Exercise(
        id = "u12_s1_p1_q5",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Apa yang Anda dengar?",
        targetTranslation = "Ayah saya bekerja di Beijing.",
        targetHanzi = "我 爸爸 在 北京 工作。",
        targetPinyin = "Wǒ bàba zài Běijīng gōngzuò.",
        wordChips = listOf("我:wǒ", "爸爸:bàba", "在:zài", "北京:Běijīng", "工作:gōngzuò", "妈妈:māma"),
        correctAnswer = "我,爸爸,在,北京,工作",
        illustrationRes = 0,
        audioToSpeak = "我爸爸在北京工作。"
    ),

    // 6. Soal 6: Pilihan Kalimat
    Exercise(
        id = "u12_s1_p1_q6",
        type = ExerciseType.SENTENCE_CHOICE,
        title = "Pilih terjemahan yang benar",
        targetHanzi = "你 在 哪儿 工作？",
        targetPinyin = "Nǐ zài nǎr gōngzuò?",
        targetTranslation = "Kamu bekerja di mana?",
        correctAnswer = "Nǐ zài nǎr gōngzuò?\n你 在 哪儿 工作？",
        options = listOf(
            "Nǐ zài nǎr gōngzuò?\n你 在 哪儿 工作？",
            "Tā zài nǎr gōngzuò?\n他 在 哪儿 工作？",
            "Nǐ zài nǎr xuéxí?\n你 在 哪儿 学习？"
        ),
        audioToSpeak = "你在哪儿工作？"
    ),

    // 7. Soal 7: Pilihan Gambar (工作 -> bekerja)
    Exercise(
        id = "u12_s1_p1_q7",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "工作",
        targetPinyin = "gōngzuò",
        targetTranslation = "bekerja",
        correctAnswer = "bekerja",
        audioToSpeak = "工作",
        pictureOptions = listOf(
            PictureOption("u12_s1_p1_opt7_1", "bekerja", "💼", R.drawable.ic_coin, true),
            PictureOption("u12_s1_p1_opt7_2", "tidur", "🛌", R.drawable.ic_book, false),
            PictureOption("u12_s1_p1_opt7_3", "makan", "🍜", R.drawable.ic_target, false),
            PictureOption("u12_s1_p1_opt7_4", "jalan-jalan", "🚶", R.drawable.ic_crown, false)
        )
    ),

    // 8. Soal 8: Ketik Pinyin (perusahaan -> gōngsī)
    Exercise(
        id = "u12_s1_p1_q8",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "perusahaan",
        sentenceWithBlank = "公司 (________)",
        targetHanzi = "公司",
        targetPinyin = "gōngsī",
        correctAnswer = "gongsi",
        keyboardKeys = listOf("g", "o", "n", "s", "i", "a", "e", "u", "b", "d", "h"),
        audioToSpeak = "公司"
    ),

    // 9. Soal 9: Susun Kalimat (Perusahaan ini sangat besar.)
    Exercise(
        id = "u12_s1_p1_q9",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Perusahaan ini sangat besar.",
        targetHanzi = "这个 公司 很 大。",
        targetPinyin = "Zhège gōngsī hěn dà.",
        wordChips = listOf("这个:zhège", "公司:gōngsī", "很:hěn", "大:dà", "小:xiǎo", "学校:xuéxiào"),
        correctAnswer = "这个,公司,很,大",
        audioToSpeak = "这个公司很大。"
    ),

    // 10. Soal 10: Ketuk Pasangan yang Sesuai (Rangkuman Perusahaan)
    Exercise(
        id = "u12_s1_p1_m10_1",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u12_s1_p1_m10_1", "工作", "gōngzuò", "bekerja"),
            MatchPairItem("u12_s1_p1_m10_2", "公司", "gōngsī", "perusahaan"),
            MatchPairItem("u12_s1_p1_m10_3", "大公司", "dà gōngsī", "perusahaan besar"),
            MatchPairItem("u12_s1_p1_m10_4", "找工作", "zhǎo gōngzuò", "mencari kerja")
        )
    )
)

val bab12Stage1Part2Exercises = listOf(
    // 1. Soal 1: Pilihan Gambar (上班 -> pergi bekerja)
    Exercise(
        id = "u12_s1_p2_q1",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "上班",
        targetPinyin = "shàngbān",
        targetTranslation = "masuk kerja",
        correctAnswer = "masuk kerja",
        audioToSpeak = "上班",
        pictureOptions = listOf(
            PictureOption("u12_s1_p2_opt1", "masuk kerja", "💼", R.drawable.ic_coin, true),
            PictureOption("u12_s1_p2_opt2", "pulang kerja", "🚪", R.drawable.ic_target, false),
            PictureOption("u12_s1_p2_opt3", "masuk kelas", "👨‍🏫", R.drawable.ic_cap, false),
            PictureOption("u12_s1_p2_opt4", "tidur", "🛌", R.drawable.ic_book, false)
        )
    ),

    // 2. Soal 2: Susun Kalimat (Saya jam sembilan masuk kerja.)
    Exercise(
        id = "u12_s1_p2_q2",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Saya jam sembilan masuk kerja.",
        targetHanzi = "我 九 点 上班。",
        targetPinyin = "Wǒ jiǔ diǎn shàngbān.",
        wordChips = listOf("我:wǒ", "九:jiǔ", "点:diǎn", "上班:shàngbān", "下班:xiàbān", "八:bā"),
        correctAnswer = "我,九,点,上班",
        audioToSpeak = "我九点上班。"
    ),

    // 3. Soal 3: Ketuk Pasangan yang Sesuai (Jam Kerja)
    Exercise(
        id = "u12_s1_p2_m3",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u12_s1_p2_m1", "上班", "shàngbān", "masuk kerja"),
            MatchPairItem("u12_s1_p2_m2", "下班", "xiàbān", "pulang kerja"),
            MatchPairItem("u12_s1_p2_m3", "九点上班", "jiǔ diǎn shàngbān", "jam 9 masuk kerja"),
            MatchPairItem("u12_s1_p2_m4", "五点下班", "wǔ diǎn xiàbān", "jam 5 pulang kerja")
        )
    ),

    // 4. Soal 4: Ketik Pinyin (masuk kerja -> shàngbān)
    Exercise(
        id = "u12_s1_p2_q4",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "masuk kerja",
        sentenceWithBlank = "上班 (________)",
        targetHanzi = "上班",
        targetPinyin = "shàngbān",
        correctAnswer = "shangban",
        keyboardKeys = listOf("s", "h", "a", "n", "g", "b", "e", "i", "o", "u", "d"),
        audioToSpeak = "上班"
    ),

    // 5. Soal 5: Mendengar Kalimat (Rule 10: illustrationRes = 0)
    Exercise(
        id = "u12_s1_p2_q5",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Apa yang Anda dengar?",
        targetTranslation = "Dia jam lima sore pulang kerja.",
        targetHanzi = "他 下午 五 点 下班。",
        targetPinyin = "Tā xiàwǔ wǔ diǎn xiàbān.",
        wordChips = listOf("他:tā", "下午:xiàwǔ", "五:wǔ", "点:diǎn", "下班:xiàbān", "上班:shàngbān"),
        correctAnswer = "他,下午,五,点,下班",
        illustrationRes = 0,
        audioToSpeak = "他下午五点下班。"
    ),

    // 6. Soal 6: Pilihan Kalimat
    Exercise(
        id = "u12_s1_p2_q6",
        type = ExerciseType.SENTENCE_CHOICE,
        title = "Pilih terjemahan yang benar",
        targetHanzi = "你 几 点 下班？",
        targetPinyin = "Nǐ jǐ diǎn xiàbān?",
        targetTranslation = "Kamu jam berapa pulang kerja?",
        correctAnswer = "Nǐ jǐ diǎn xiàbān?\n你 几 点 下班？",
        options = listOf(
            "Nǐ jǐ diǎn xiàbān?\n你 几 点 下班？",
            "Nǐ jǐ diǎn shàngbān?\n你 几 点 上班？",
            "Tā jǐ diǎn xiàbān?\n他 几 点 下班？"
        ),
        audioToSpeak = "你几点下班？"
    ),

    // 7. Soal 7: Pilihan Gambar (下班 -> pulang kerja)
    Exercise(
        id = "u12_s1_p2_q7",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "下班",
        targetPinyin = "xiàbān",
        targetTranslation = "pulang kerja",
        correctAnswer = "pulang kerja",
        audioToSpeak = "下班",
        pictureOptions = listOf(
            PictureOption("u12_s1_p2_opt7_1", "pulang kerja", "🚪", R.drawable.ic_target, true),
            PictureOption("u12_s1_p2_opt7_2", "masuk kerja", "💼", R.drawable.ic_coin, false),
            PictureOption("u12_s1_p2_opt7_3", "makan", "🍜", R.drawable.ic_book, false),
            PictureOption("u12_s1_p2_opt7_4", "tidur", "🛌", R.drawable.ic_crown, false)
        )
    ),

    // 8. Soal 8: Ketik Pinyin (pulang kerja -> xiàbān)
    Exercise(
        id = "u12_s1_p2_q8",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "pulang kerja",
        sentenceWithBlank = "下班 (________)",
        targetHanzi = "下班",
        targetPinyin = "xiàbān",
        correctAnswer = "xiaban",
        keyboardKeys = listOf("x", "i", "a", "b", "n", "e", "o", "u", "d", "g", "h"),
        audioToSpeak = "下班"
    ),

    // 9. Soal 9: Susun Kalimat (Saya naik mobil pergi bekerja.)
    Exercise(
        id = "u12_s1_p2_q9",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Saya naik mobil pergi kerja.",
        targetHanzi = "我 坐车 去 上班。",
        targetPinyin = "Wǒ zuòchē qù shàngbān.",
        wordChips = listOf("我:wǒ", "坐车:zuòchē", "去:qù", "上班:shàngbān", "下班:xiàbān", "回家:huíjiā"),
        correctAnswer = "我,坐车,去,上班",
        audioToSpeak = "我坐车去上班。"
    ),

    // 10. Soal 10: Ketuk Pasangan yang Sesuai (Rangkuman Masuk & Pulang)
    Exercise(
        id = "u12_s1_p2_m10_1",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u12_s1_p2_m10_1", "上班", "shàngbān", "masuk kerja"),
            MatchPairItem("u12_s1_p2_m10_2", "下班", "xiàbān", "pulang kerja"),
            MatchPairItem("u12_s1_p2_m10_3", "坐车上班", "zuòchē shàngbān", "naik mobil ke kantor"),
            MatchPairItem("u12_s1_p2_m10_4", "下班回家", "xiàbān huíjiā", "pulang kantor ke rumah")
        )
    )
)
