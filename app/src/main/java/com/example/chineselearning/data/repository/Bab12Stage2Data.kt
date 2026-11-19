package com.example.chineselearning.data.repository

import com.example.chineselearning.R
import com.example.chineselearning.data.model.Exercise
import com.example.chineselearning.data.model.ExerciseType
import com.example.chineselearning.data.model.MatchPairItem
import com.example.chineselearning.data.model.PictureOption

val bab12Stage2Part1Exercises = listOf(
    // 1. Soal 1: Pilihan Gambar (忙 -> sibuk)
    Exercise(
        id = "u12_s2_p1_q1",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "忙",
        targetPinyin = "máng",
        targetTranslation = "sibuk",
        correctAnswer = "sibuk",
        audioToSpeak = "忙",
        pictureOptions = listOf(
            PictureOption("u12_s2_p1_opt1", "sibuk", "", R.drawable.ic_work_busy, true),
            PictureOption("u12_s2_p1_opt2", "beristirahat", "", R.drawable.ic_action_rest, false),
            PictureOption("u12_s2_p1_opt3", "tidur", "", R.drawable.ic_action_sleep, false),
            PictureOption("u12_s2_p1_opt4", "makan", "", R.drawable.ic_action_eat, false)
        )
    ),

    // 2. Soal 2: Susun Kalimat (Hari ini pekerjaan sangat sibuk.)
    Exercise(
        id = "u12_s2_p1_q2",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Hari ini pekerjaan sangat sibuk.",
        targetHanzi = "今天 工作 很 忙。",
        targetPinyin = "Jīntiān gōngzuò hěn máng.",
        wordChips = listOf("今天:jīntiān", "工作:gōngzuò", "很:hěn", "忙:máng", "明天:míngtiān", "不忙:bù máng"),
        correctAnswer = "今天,工作,很,忙",
        audioToSpeak = "今天工作很忙。"
    ),

    // 3. Soal 3: Ketuk Pasangan yang Sesuai (Sibuk & Pekerjaan)
    Exercise(
        id = "u12_s2_p1_q3",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u12_s2_p1_m1", "忙", "máng", "sibuk"),
            MatchPairItem("u12_s2_p1_m2", "很忙", "hěn máng", "sangat sibuk"),
            MatchPairItem("u12_s2_p1_m3", "不忙", "bù máng", "tidak sibuk"),
            MatchPairItem("u12_s2_p1_m4", "太忙了", "tài máng le", "terlalu sibuk")
        )
    ),

    // 4. Soal 4: Ketik Pinyin (sibuk -> máng)
    Exercise(
        id = "u12_s2_p1_q4",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "sibuk",
        sentenceWithBlank = "忙 (________)",
        targetHanzi = "忙",
        targetPinyin = "máng",
        correctAnswer = "mang",
        keyboardKeys = listOf("m", "a", "n", "g", "e", "i", "o", "u", "b", "d", "h"),
        audioToSpeak = "忙"
    ),

    // 5. Soal 5: Mendengar Kalimat (Rule 10: illustrationRes = 0)
    Exercise(
        id = "u12_s2_p1_q5",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Apa yang Anda dengar?",
        targetTranslation = "Kamu sedang sibuk apa?",
        targetHanzi = "你 在 忙 什么？",
        targetPinyin = "Nǐ zài máng shénme?",
        wordChips = listOf("你:nǐ", "在:zài", "忙:máng", "什么:shénme", "他:tā", "做:zuò"),
        correctAnswer = "你,在,忙,什么",
        illustrationRes = 0,
        audioToSpeak = "你在忙什么？"
    ),

    // 6. Soal 6: Pilihan Kalimat
    Exercise(
        id = "u12_s2_p1_q6",
        type = ExerciseType.SENTENCE_CHOICE,
        title = "Pilih terjemahan yang benar",
        targetHanzi = "老师 最近 很 忙。",
        targetPinyin = "Lǎoshī zuìjìn hěn máng.",
        targetTranslation = "Guru akhir-akhir ini sangat sibuk.",
        correctAnswer = "Lǎoshī zuìjìn hěn máng.\n老师 最近 很 忙。",
        options = listOf(
            "Lǎoshī zuìjìn hěn máng.\n老师 最近 很 忙。",
            "Xuéshēng zuìjìn hěn máng.\n学生 最近 很 忙。",
            "Lǎoshī zuìjìn bù máng.\n老师 最近 不 忙。"
        ),
        audioToSpeak = "老师最近很忙。"
    ),

    // 7. Soal 7: Pilihan Gambar (很忙 -> sangat sibuk)
    Exercise(
        id = "u12_s2_p1_q7",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "很忙",
        targetPinyin = "hěn máng",
        targetTranslation = "sangat sibuk",
        correctAnswer = "sangat sibuk",
        audioToSpeak = "很忙",
        pictureOptions = listOf(
            PictureOption("u12_s2_p1_opt7_1", "sangat sibuk", "", R.drawable.ic_work_busy, true),
            PictureOption("u12_s2_p1_opt7_2", "istirahat", "", R.drawable.ic_action_rest, false),
            PictureOption("u12_s2_p1_opt7_3", "makan", "", R.drawable.ic_action_eat, false),
            PictureOption("u12_s2_p1_opt7_4", "tidur", "", R.drawable.ic_action_sleep, false)
        )
    ),

    // 8. Soal 8: Ketik Pinyin (sangat sibuk -> hěnmáng)
    Exercise(
        id = "u12_s2_p1_q8",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "sangat sibuk",
        sentenceWithBlank = "很忙 (________)",
        targetHanzi = "很忙",
        targetPinyin = "hěnmáng",
        correctAnswer = "henmang",
        keyboardKeys = listOf("h", "e", "n", "m", "a", "g", "i", "o", "u", "b", "d"),
        audioToSpeak = "很忙"
    ),

    // 9. Soal 9: Susun Kalimat (Saya hari ini tidak sibuk.)
    Exercise(
        id = "u12_s2_p1_q9",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Saya hari ini tidak sibuk.",
        targetHanzi = "我 今天 不 忙。",
        targetPinyin = "Wǒ jīntiān bù máng.",
        wordChips = listOf("我:wǒ", "今天:jīntiān", "不:bù", "忙:máng", "很:hěn", "他:tā"),
        correctAnswer = "我,今天,不,忙",
        audioToSpeak = "我今天不忙。"
    ),

    // 10. Soal 10: Ketuk Pasangan yang Sesuai (Rangkuman Kesibukan)
    Exercise(
        id = "u12_s2_p1_m10_1",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u12_s2_p1_m10_1", "忙", "máng", "sibuk"),
            MatchPairItem("u12_s2_p1_m10_2", "很忙", "hěn máng", "sangat sibuk"),
            MatchPairItem("u12_s2_p1_m10_3", "忙什么", "máng shénme", "sibuk apa"),
            MatchPairItem("u12_s2_p1_m10_4", "工作很忙", "gōngzuò hěn máng", "kerjaan sibuk")
        )
    )
)

val bab12Stage2Part2Exercises = listOf(
    // 1. Soal 1: Pilihan Gambar (电脑 -> komputer)
    Exercise(
        id = "u12_s2_p2_q1",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "电脑",
        targetPinyin = "diànnǎo",
        targetTranslation = "komputer",
        correctAnswer = "komputer",
        audioToSpeak = "电脑",
        pictureOptions = listOf(
            PictureOption("u12_s2_p2_opt1", "komputer", "", R.drawable.ic_work_computer, true),
            PictureOption("u12_s2_p2_opt2", "buku", "", R.drawable.ic_book_chinese, false),
            PictureOption("u12_s2_p2_opt3", "meja", "", R.drawable.ic_fam_table, false),
            PictureOption("u12_s2_p2_opt4", "kursi", "", R.drawable.ic_fam_chair, false)
        )
    ),

    // 2. Soal 2: Susun Kalimat (Komputer ada di atas meja.)
    Exercise(
        id = "u12_s2_p2_q2",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Komputer ada di atas meja.",
        targetHanzi = "电脑 在 桌子 上。",
        targetPinyin = "Diànnǎo zài zhuōzi shang.",
        wordChips = listOf("电脑:diànnǎo", "在:zài", "桌子:zhuōzi", "上:shang", "椅子:yǐzi", "里:lǐ"),
        correctAnswer = "电脑,在,桌子,上",
        audioToSpeak = "电脑在桌子上。"
    ),

    // 3. Soal 3: Ketuk Pasangan yang Sesuai (Urusan & Komputer)
    Exercise(
        id = "u12_s2_p2_m3",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u12_s2_p2_m1", "事", "shì", "urusan / masalah"),
            MatchPairItem("u12_s2_p2_m2", "没事", "méishì", "tidak ada masalah"),
            MatchPairItem("u12_s2_p2_m3", "电脑", "diànnǎo", "komputer"),
            MatchPairItem("u12_s2_p2_m4", "有事", "yǒu shì", "ada urusan")
        )
    ),

    // 4. Soal 4: Ketik Pinyin (urusan -> shì)
    Exercise(
        id = "u12_s2_p2_q4",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "urusan / hal",
        sentenceWithBlank = "事 (________)",
        targetHanzi = "事",
        targetPinyin = "shì",
        correctAnswer = "shi",
        keyboardKeys = listOf("s", "h", "i", "a", "e", "o", "u", "b", "d", "g", "j"),
        audioToSpeak = "事"
    ),

    // 5. Soal 5: Mendengar Kalimat (Rule 10: illustrationRes = 0)
    Exercise(
        id = "u12_s2_p2_q5",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Apa yang Anda dengar?",
        targetTranslation = "Dia punya urusan hari ini.",
        targetHanzi = "他 今天 有 事。",
        targetPinyin = "Tā jīntiān yǒu shì.",
        wordChips = listOf("他:tā", "今天:jīntiān", "有:yǒu", "事:shì", "没事:méishì", "我:wǒ"),
        correctAnswer = "他,今天,有,事",
        illustrationRes = 0,
        audioToSpeak = "他今天有事。"
    ),

    // 6. Soal 6: Pilihan Kalimat
    Exercise(
        id = "u12_s2_p2_q6",
        type = ExerciseType.SENTENCE_CHOICE,
        title = "Pilih terjemahan yang benar",
        targetHanzi = "你 有 什么 事？",
        targetPinyin = "Nǐ yǒu shénme shì?",
        targetTranslation = "Kamu ada urusan apa?",
        correctAnswer = "Nǐ yǒu shénme shì?\n你 有 什么 事？",
        options = listOf(
            "Nǐ yǒu shénme shì?\n你 有 什么 事？",
            "Tā yǒu shénme shì?\n他 有 什么 事？",
            "Nǐ zài zuò shénme?\n你 在 做 什么？"
        ),
        audioToSpeak = "你有什么事？"
    ),

    // 7. Soal 7: Pilihan Gambar (事 -> urusan / hal)
    Exercise(
        id = "u12_s2_p2_q7",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "事",
        targetPinyin = "shì",
        targetTranslation = "urusan / hal",
        correctAnswer = "urusan / hal",
        audioToSpeak = "事",
        pictureOptions = listOf(
            PictureOption("u12_s2_p2_opt7_1", "urusan", "", R.drawable.ic_work_clipboard_task, true),
            PictureOption("u12_s2_p2_opt7_2", "uang", "", R.drawable.ic_yuan_currency, false),
            PictureOption("u12_s2_p2_opt7_3", "buku", "", R.drawable.ic_book_chinese, false),
            PictureOption("u12_s2_p2_opt7_4", "mobil", "", R.drawable.ic_trans_car, false)
        )
    ),

    // 8. Soal 8: Ketik Pinyin (komputer -> diànnǎo)
    Exercise(
        id = "u12_s2_p2_q8",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "komputer",
        sentenceWithBlank = "电脑 (________)",
        targetHanzi = "电脑",
        targetPinyin = "diànnǎo",
        correctAnswer = "diannao",
        keyboardKeys = listOf("d", "i", "a", "n", "o", "e", "u", "b", "g", "h", "j"),
        audioToSpeak = "电脑"
    ),

    // 9. Soal 9: Susun Kalimat (Saya membeli sebuah komputer.)
    Exercise(
        id = "u12_s2_p2_q9",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Saya beli satu komputer.",
        targetHanzi = "我 买 了 一个 电脑。",
        targetPinyin = "Wǒ mǎi le yí gè diànnǎo.",
        wordChips = listOf("我:wǒ", "买:mǎi", "了:le", "一个:yí gè", "电脑:diànnǎo", "书:shū"),
        correctAnswer = "我,买,了,一个,电脑",
        audioToSpeak = "我买了一个电脑。"
    ),

    // 10. Soal 10: Ketuk Pasangan yang Sesuai (Rangkuman Urusan & Komputer)
    Exercise(
        id = "u12_s2_p2_m10_1",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u12_s2_p2_m10_1", "电脑", "diànnǎo", "komputer"),
            MatchPairItem("u12_s2_p2_m10_2", "事", "shì", "urusan"),
            MatchPairItem("u12_s2_p2_m10_3", "没事", "méishì", "tidak ada masalah"),
            MatchPairItem("u12_s2_p2_m10_4", "有事", "yǒu shì", "ada hal/urusan")
        )
    )
)
