package com.example.chineselearning.data.repository

import com.example.chineselearning.R
import com.example.chineselearning.data.model.Exercise
import com.example.chineselearning.data.model.ExerciseType
import com.example.chineselearning.data.model.MatchPairItem
import com.example.chineselearning.data.model.PictureOption

val bab17Stage3Part1Exercises = listOf(
    // 1. Soal 1: Pilihan Gambar (小时候 -> waktu kecil)
    Exercise(
        id = "u17_s3_p1_q1",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "小时候",
        targetPinyin = "xiǎoshíhou",
        targetTranslation = "waktu kecil",
        correctAnswer = "waktu kecil",
        audioToSpeak = "小时候",
        pictureOptions = listOf(
            PictureOption("u17_s3_p1_opt1", "waktu kecil", "", R.drawable.ic_fam_child, true),
            PictureOption("u17_s3_p1_opt2", "dewasa", "", R.drawable.ic_work_gentleman, false),
            PictureOption("u17_s3_p1_opt3", "kakek", "", R.drawable.art_fam_grandfather, false),
            PictureOption("u17_s3_p1_opt4", "rumah", "", R.drawable.ic_fam_home, false)
        )
    ),

    // 2. Soal 2: Susun Kalimat (Saya waktu kecil suka menyanyi.)
    Exercise(
        id = "u17_s3_p1_q2",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Saya waktu kecil suka menyanyi.",
        targetHanzi = "我 小时候 喜欢 唱歌。",
        targetPinyin = "Wǒ xiǎoshíhou xǐhuan chànggē.",
        wordChips = listOf("我:wǒ", "小时候:xiǎoshíhou", "喜欢:xǐhuan", "唱歌。:chànggē.", "跳舞:tiàowǔ"),
        correctAnswer = "我,小时候,喜欢,唱歌。",
        audioToSpeak = "我小时候喜欢唱歌。"
    ),

    // 3. Soal 3: Ketuk Pasangan yang Sesuai (Waktu Kecil & Sejak Kecil)
    Exercise(
        id = "u17_s3_p1_q3",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u17_s3_p1_m1", "小时候", "xiǎoshíhou", "waktu kecil"),
            MatchPairItem("u17_s3_p1_m2", "从小", "cóngxiǎo", "sejak kecil"),
            MatchPairItem("u17_s3_p1_m3", "唱歌", "chànggē", "menyanyi"),
            MatchPairItem("u17_s3_p1_m4", "汉语", "Hànyǔ", "bahasa Mandarin")
        )
    ),

    // 4. Soal 4: Ketik Pinyin (waktu kecil -> xiǎoshíhou)
    Exercise(
        id = "u17_s3_p1_q4",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "waktu kecil",
        sentenceWithBlank = "小时候 (________)",
        targetHanzi = "小时候",
        targetPinyin = "xiǎoshíhou",
        correctAnswer = "xiaoshihou",
        keyboardKeys = listOf("x", "i", "a", "o", "s", "h", "u", "e", "b", "d", "g", "j"),
        audioToSpeak = "小时候"
    ),

    // 5. Soal 5: Mendengar Kalimat (Rule 10: illustrationRes = 0)
    Exercise(
        id = "u17_s3_p1_q5",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Apa yang Anda dengar?",
        targetTranslation = "Dia sejak kecil belajar bahasa Mandarin.",
        targetHanzi = "他 从小 学习 汉语。",
        targetPinyin = "Tā cóngxiǎo xuéxí Hànyǔ.",
        wordChips = listOf("他:tā", "从小:cóngxiǎo", "学习:xuéxí", "汉语。:Hànyǔ.", "英语:Yīngyǔ"),
        correctAnswer = "他,从小,学习,汉语。",
        illustrationRes = 0,
        audioToSpeak = "他从小学习汉语。"
    ),

    // 6. Soal 6: Pilihan Kalimat
    Exercise(
        id = "u17_s3_p1_q6",
        type = ExerciseType.SENTENCE_CHOICE,
        title = "Pilih terjemahan yang benar",
        targetHanzi = "我 从小 就 认识 他。",
        targetPinyin = "Wǒ cóngxiǎo jiù rènshi tā.",
        targetTranslation = "Saya sejak kecil sudah mengenalnya.",
        correctAnswer = "Wǒ cóngxiǎo jiù rènshi tā.\n我 从小 就 认识 他。",
        options = listOf(
            "Wǒ cóngxiǎo jiù rènshi tā.\n我 从小 就 认识 他。",
            "Wǒ xiànzài cái rènshi tā.\n我 现在 才 认识 他。",
            "Tā cóngxiǎo jiù rènshi wǒ.\n他 从小 就 认识 我。"
        ),
        audioToSpeak = "我从小就认识他。"
    ),

    // 7. Soal 7: Pilihan Gambar (从小 -> sejak kecil)
    Exercise(
        id = "u17_s3_p1_q7",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "从小",
        targetPinyin = "cóngxiǎo",
        targetTranslation = "sejak kecil",
        correctAnswer = "sejak kecil",
        audioToSpeak = "从小",
        pictureOptions = listOf(
            PictureOption("u17_s3_p1_opt7_1", "sejak kecil", "", R.drawable.ic_fam_child, true),
            PictureOption("u17_s3_p1_opt7_2", "orang tua", "", R.drawable.ic_fam_father, false),
            PictureOption("u17_s3_p1_opt7_3", "guru", "", R.drawable.ic_person_guru, false),
            PictureOption("u17_s3_p1_opt7_4", "rumah", "", R.drawable.ic_fam_home, false)
        )
    ),

    // 8. Soal 8: Ketik Pinyin (sejak kecil -> cóngxiǎo)
    Exercise(
        id = "u17_s3_p1_q8",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "sejak kecil",
        sentenceWithBlank = "从小 (________)",
        targetHanzi = "从小",
        targetPinyin = "cóngxiǎo",
        correctAnswer = "congxiao",
        keyboardKeys = listOf("c", "o", "n", "g", "x", "i", "a", "e", "u", "b", "d", "h"),
        audioToSpeak = "从小"
    ),

    // 9. Soal 9: Susun Kalimat (Waktu kecil saya tinggal di Beijing.)
    Exercise(
        id = "u17_s3_p1_q9",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Waktu kecil saya tinggal di Beijing.",
        targetHanzi = "我 小时候 住 在 北京。",
        targetPinyin = "Wǒ xiǎoshíhou zhù zài Běijīng.",
        wordChips = listOf("我:wǒ", "小时候:xiǎoshíhou", "住:zhù", "在:zài", "北京。:Běijīng.", "上海:Shànghǎi"),
        correctAnswer = "我,小时候,住,在,北京。",
        audioToSpeak = "我小时候住在北京。"
    ),

    // 10. Soal 10: Ketuk Pasangan yang Sesuai (Rangkuman Tumbuh Kembang)
    Exercise(
        id = "u17_s3_p1_m10",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u17_s3_p1_m10_1", "小时候", "xiǎoshíhou", "waktu kecil"),
            MatchPairItem("u17_s3_p1_m10_2", "从小", "cóngxiǎo", "sejak kecil"),
            MatchPairItem("u17_s3_p1_m10_3", "住在", "zhù zài", "tinggal di"),
            MatchPairItem("u17_s3_p1_m10_4", "认识", "rènshi", "mengenal")
        )
    )
)

val bab17Stage3Part2Exercises = listOf(
    // 1. Soal 1: Pilihan Gambar (生日 -> hari ulang tahun)
    Exercise(
        id = "u17_s3_p2_q1",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "生日",
        targetPinyin = "shēngrì",
        targetTranslation = "hari ulang tahun",
        correctAnswer = "hari ulang tahun",
        audioToSpeak = "生日",
        pictureOptions = listOf(
            PictureOption("u17_s3_p2_opt1", "ulang tahun", "", R.drawable.ic_birthday_cake, true),
            PictureOption("u17_s3_p2_opt2", "rumah", "", R.drawable.ic_fam_home, false),
            PictureOption("u17_s3_p2_opt3", "kursi", "", R.drawable.ic_fam_chair, false),
            PictureOption("u17_s3_p2_opt4", "meja", "", R.drawable.ic_fam_table, false)
        )
    ),

    // 2. Soal 2: Susun Kalimat (Selamat ulang tahun kepadamu!)
    Exercise(
        id = "u17_s3_p2_q2",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Selamat ulang tahun kepadamu!",
        targetHanzi = "祝 你 生日 快乐！",
        targetPinyin = "Zhù nǐ shēngrì kuàilè!",
        wordChips = listOf("祝:zhù", "你:nǐ", "生日:shēngrì", "快乐！:kuàilè!", "高兴:gāoxìng"),
        correctAnswer = "祝,你,生日,快乐！",
        audioToSpeak = "祝你生日快乐！"
    ),

    // 3. Soal 3: Ketuk Pasangan yang Sesuai (Ulang Tahun & Selamat)
    Exercise(
        id = "u17_s3_p2_m3",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u17_s3_p2_m1", "生日", "shēngrì", "ulang tahun"),
            MatchPairItem("u17_s3_p2_m2", "快乐", "kuàilè", "bahagia / gembira"),
            MatchPairItem("u17_s3_p2_m3", "今天", "jīntiān", "hari ini"),
            MatchPairItem("u17_s3_p2_m4", "蛋糕", "dàngāo", "kue")
        )
    ),

    // 4. Soal 4: Ketik Pinyin (ulang tahun -> shēngrì)
    Exercise(
        id = "u17_s3_p2_q4",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "hari ulang tahun",
        sentenceWithBlank = "生日 (________)",
        targetHanzi = "生日",
        targetPinyin = "shēngrì",
        correctAnswer = "shengri",
        keyboardKeys = listOf("s", "h", "e", "n", "g", "r", "i", "a", "o", "u", "b", "d"),
        audioToSpeak = "生日"
    ),

    // 5. Soal 5: Mendengar Kalimat (Rule 10: illustrationRes = 0)
    Exercise(
        id = "u17_s3_p2_q5",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Apa yang Anda dengar?",
        targetTranslation = "Hari ini adalah hari ulang tahun saya.",
        targetHanzi = "今天 是 我 的 生日。",
        targetPinyin = "Jīntiān shì wǒ de shēngrì.",
        wordChips = listOf("今天:jīntiān", "是:shì", "我:wǒ", "的:de", "生日。:shēngrì.", "明天:míngtiān"),
        correctAnswer = "今天,是,我,的,生日。",
        illustrationRes = 0,
        audioToSpeak = "今天是我的生日。"
    ),

    // 6. Soal 6: Pilihan Kalimat
    Exercise(
        id = "u17_s3_p2_q6",
        type = ExerciseType.SENTENCE_CHOICE,
        title = "Pilih terjemahan yang benar",
        targetHanzi = "你 的 生日 是 几 月 几 号？",
        targetPinyin = "Nǐ de shēngrì shì jǐ yuè jǐ hào?",
        targetTranslation = "Ulang tahunmu tanggal berapa bulan berapa?",
        correctAnswer = "Nǐ de shēngrì shì jǐ yuè jǐ hào?\n你 的 生日 是 几 月 几 号？",
        options = listOf(
            "Nǐ de shēngrì shì jǐ yuè jǐ hào?\n你 的 生日 是 几 月 几 号？",
            "Tā de shēngrì shì jǐ yuè jǐ hào?\n他 的 生日 是 几 月 几 号？",
            "Jīntiān shì jǐ yuè jǐ hào?\n今天 是 几 月 几 号？"
        ),
        audioToSpeak = "你的生日是几月几号？"
    ),

    // 7. Soal 7: Pilihan Gambar (生日 -> ulang tahun)
    Exercise(
        id = "u17_s3_p2_q7",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "生日",
        targetPinyin = "shēngrì",
        targetTranslation = "ulang tahun",
        correctAnswer = "ulang tahun",
        audioToSpeak = "生日",
        pictureOptions = listOf(
            PictureOption("u17_s3_p2_opt7_1", "ulang tahun", "", R.drawable.ic_birthday_cake, true),
            PictureOption("u17_s3_p2_opt7_2", "buku", "", R.drawable.ic_comm_know, false),
            PictureOption("u17_s3_p2_opt7_3", "orang", "", R.drawable.ic_person_saya, false),
            PictureOption("u17_s3_p2_opt7_4", "rumah", "", R.drawable.ic_fam_home, false)
        )
    ),

    // 8. Soal 8: Ketik Pinyin (ulang tahun -> shēngrì)
    Exercise(
        id = "u17_s3_p2_q8",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "hari ulang tahun",
        sentenceWithBlank = "生日 (________)",
        targetHanzi = "生日",
        targetPinyin = "shēngrì",
        correctAnswer = "shengri",
        keyboardKeys = listOf("s", "h", "e", "n", "g", "r", "i", "a", "o", "u", "b", "d"),
        audioToSpeak = "生日"
    ),

    // 9. Soal 9: Susun Kalimat (Ibu membuatkan kue ulang tahun untuk saya.)
    Exercise(
        id = "u17_s3_p2_q9",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Ibu membuatkan kue ulang tahun.",
        targetHanzi = "妈妈 给 我 做 生日 蛋糕。",
        targetPinyin = "Māma gěi wǒ zuò shēngrì dàngāo.",
        wordChips = listOf("妈妈:māma", "给:gěi", "我:wǒ", "做:zuò", "生日:shēngrì", "蛋糕。:dàngāo.", "爸爸:bàba"),
        correctAnswer = "妈妈,给,我,做,生日,蛋糕。",
        audioToSpeak = "妈妈给我做生日蛋糕。"
    ),

    // 10. Soal 10: Ketuk Pasangan yang Sesuai (Rangkuman Pesta Ulang Tahun)
    Exercise(
        id = "u17_s3_p2_m10",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u17_s3_p2_m10_1", "生日", "shēngrì", "ulang tahun"),
            MatchPairItem("u17_s3_p2_m10_2", "生日蛋糕", "shēngrì dàngāo", "kue ulang tahun"),
            MatchPairItem("u17_s3_p2_m10_3", "祝你", "zhù nǐ", "mendoakanmu"),
            MatchPairItem("u17_s3_p2_m10_4", "快乐", "kuàilè", "gembira")
        )
    )
)
