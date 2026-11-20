package com.example.chineselearning.data.repository

import com.example.chineselearning.R
import com.example.chineselearning.data.model.Exercise
import com.example.chineselearning.data.model.ExerciseType
import com.example.chineselearning.data.model.MatchPairItem
import com.example.chineselearning.data.model.PictureOption

val bab24Stage2Part1Exercises = listOf(
    // 1. Soal 1: Pilihan Gambar (本子 -> buku catatan)
    Exercise(
        id = "u24_s2_p1_q1",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "本子",
        targetPinyin = "běnzi",
        targetTranslation = "buku catatan",
        correctAnswer = "buku catatan",
        audioToSpeak = "本子",
        pictureOptions = listOf(
            PictureOption("u24_s2_p1_opt1", "buku catatan", "", R.drawable.ic_edu_notebook, true),
            PictureOption("u24_s2_p1_opt2", "pena", "", R.drawable.ic_edu_pen_pencil, false),
            PictureOption("u24_s2_p1_opt3", "ruang kelas", "", R.drawable.ic_edu_classroom, false),
            PictureOption("u24_s2_p1_opt4", "ujian", "", R.drawable.ic_edu_exam_test, false)
        )
    ),

    // 2. Soal 2: Susun Kalimat (Saya mencatat perkataan guru di buku catatan.)
    Exercise(
        id = "u24_s2_p1_q2",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Saya mencatat di buku catatan.",
        targetHanzi = "我 在 本子 上 记下。",
        targetPinyin = "Wǒ zài běnzi shang jìxià.",
        wordChips = listOf("我:wǒ", "在:zài", "本子:běnzi", "上:shang", "记下。:jìxià.", "书包:shūbāo"),
        correctAnswer = "我,在,本子,上,记下。",
        audioToSpeak = "我在本子上记下。"
    ),

    // 3. Soal 3: Ketuk Pasangan yang Sesuai (Alat Tulis & Catatan)
    Exercise(
        id = "u24_s2_p1_q3",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u24_s2_p1_m1", "本子", "běnzi", "buku catatan"),
            MatchPairItem("u24_s2_p1_m2", "笔", "bǐ", "pena / pensil"),
            MatchPairItem("u24_s2_p1_m3", "一支笔", "yì zhī bǐ", "sebatang pena"),
            MatchPairItem("u24_s2_p1_m4", "写字", "xiě zì", "menulis kata")
        )
    ),

    // 4. Soal 4: Ketik Pinyin (buku catatan -> běnzi)
    Exercise(
        id = "u24_s2_p1_q4",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "buku catatan",
        sentenceWithBlank = "本子 (________)",
        targetHanzi = "本子",
        targetPinyin = "běnzi",
        correctAnswer = "benzi",
        keyboardKeys = listOf("b", "e", "n", "z", "i", "a", "o", "u", "d", "g", "h", "j"),
        audioToSpeak = "本子"
    ),

    // 5. Soal 5: Mendengar Kalimat (Rule 10: illustrationRes = 0)
    Exercise(
        id = "u24_s2_p1_q5",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Apa yang Anda dengar?",
        targetTranslation = "Bisakah kamu meminjamkan saya sebatang pena?",
        targetHanzi = "你 能 借 我 一 支 笔 吗？",
        targetPinyin = "Nǐ néng jiè wǒ yì zhī bǐ ma?",
        wordChips = listOf("你:nǐ", "能:néng", "借:jiè", "我:wǒ", "一:yì", "支:zhī", "笔:bǐ", "吗？:ma?", "本子:běnzi"),
        correctAnswer = "你,能,借,我,一,支,笔,吗？",
        illustrationRes = 0,
        audioToSpeak = "你能借我一支笔吗？"
    ),

    // 6. Soal 6: Pilihan Kalimat
    Exercise(
        id = "u24_s2_p1_q6",
        type = ExerciseType.SENTENCE_CHOICE,
        title = "Pilih terjemahan yang benar",
        targetHanzi = "我 拿 着 黑色 的 笔 写 汉字。",
        targetPinyin = "Wǒ ná zhe hēisè de bǐ xiě Hànzì.",
        targetTranslation = "Saya memegang pena hitam menulis karakter Hanzi.",
        correctAnswer = "Wǒ ná zhe hēisè de bǐ xiě Hànzì.\n我 拿 着 黑色 的 笔 写 汉字。",
        options = listOf(
            "Wǒ ná zhe hēisè de bǐ xiě Hànzì.\n我 拿 着 黑色 的 笔 写 汉字。",
            "Wǒ ná zhe hóngsè de bǐ xiě Hànzì.\n我 拿 着 红色 的 笔 写 汉字。",
            "Tā ná zhe hēisè de bǐ xiě Hànzì.\n他 拿 着 黑色 的 笔 写 汉字。"
        ),
        audioToSpeak = "我拿着黑色的笔写汉字。"
    ),

    // 7. Soal 7: Pilihan Gambar (笔 -> pena / pensil)
    Exercise(
        id = "u24_s2_p1_q7",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "笔",
        targetPinyin = "bǐ",
        targetTranslation = "pena / pensil",
        correctAnswer = "pena / pensil",
        audioToSpeak = "笔",
        pictureOptions = listOf(
            PictureOption("u24_s2_p1_opt7_1", "pena", "", R.drawable.ic_edu_pen_pencil, true),
            PictureOption("u24_s2_p1_opt7_2", "buku catatan", "", R.drawable.ic_edu_notebook, false),
            PictureOption("u24_s2_p1_opt7_3", "ruang kelas", "", R.drawable.ic_edu_classroom, false),
            PictureOption("u24_s2_p1_opt7_4", "ujian", "", R.drawable.ic_edu_exam_test, false)
        )
    ),

    // 8. Soal 8: Ketik Pinyin (pena -> bǐ)
    Exercise(
        id = "u24_s2_p1_q8",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "pena / pensil / alat tulis",
        sentenceWithBlank = "笔 (________)",
        targetHanzi = "笔",
        targetPinyin = "bǐ",
        correctAnswer = "bi",
        keyboardKeys = listOf("b", "i", "a", "e", "o", "u", "d", "g", "h", "j", "l", "m"),
        audioToSpeak = "笔"
    ),

    // 9. Soal 9: Susun Kalimat (Di atas meja diletakkan dua buah buku catatan.)
    Exercise(
        id = "u24_s2_p1_q9",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Di atas meja ada dua buku catatan.",
        targetHanzi = "桌子 上 有 两 个 本子。",
        targetPinyin = "Zhuōzi shang yǒu liǎng gè běnzi.",
        wordChips = listOf("桌子:zhuōzi", "上:shang", "有:yǒu", "两:liǎng", "个:gè", "本子。:běnzi.", "三:sān"),
        correctAnswer = "桌子,上,有,两,个,本子。",
        audioToSpeak = "桌子上有两个本子。"
    ),

    // 10. Soal 10: Ketuk Pasangan yang Sesuai (Rangkuman Alat Tulis)
    Exercise(
        id = "u24_s2_p1_m10",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u24_s2_p1_m10_1", "本子", "běnzi", "buku catatan"),
            MatchPairItem("u24_s2_p1_m10_2", "笔", "bǐ", "alat tulis"),
            MatchPairItem("u24_s2_p1_m10_3", "借笔", "jiè bǐ", "pinjam pena"),
            MatchPairItem("u24_s2_p1_m10_4", "黑笔", "hēi bǐ", "pena hitam")
        )
    )
)

val bab24Stage2Part2Exercises = listOf(
    // 1. Soal 1: Pilihan Gambar (书包 -> tas sekolah)
    Exercise(
        id = "u24_s2_p2_q1",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "书包",
        targetPinyin = "shūbāo",
        targetTranslation = "tas sekolah",
        correctAnswer = "tas sekolah",
        audioToSpeak = "书包",
        pictureOptions = listOf(
            PictureOption("u24_s2_p2_opt1", "tas sekolah", "", R.drawable.ic_edu_notebook, true),
            PictureOption("u24_s2_p2_opt2", "pena", "", R.drawable.ic_edu_pen_pencil, false),
            PictureOption("u24_s2_p2_opt3", "ruang kelas", "", R.drawable.ic_edu_classroom, false),
            PictureOption("u24_s2_p2_opt4", "ujian", "", R.drawable.ic_edu_exam_test, false)
        )
    ),

    // 2. Soal 2: Susun Kalimat (Tas sekolah baru ini adalah hadiah dari ibu untuk saya.)
    Exercise(
        id = "u24_s2_p2_q2",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Tas baru ini hadiah dari ibu.",
        targetHanzi = "新 书包 是 妈妈 送 的。",
        targetPinyin = "Xīn shūbāo shì māma sòng de.",
        wordChips = listOf("新:xīn", "书包:shūbāo", "是:shì", "妈妈:māma", "送:sòng", "的。:de.", "爸爸:bàba"),
        correctAnswer = "新,书包,是,妈妈,送,的。",
        audioToSpeak = "新书包是妈妈送的。"
    ),

    // 3. Soal 3: Ketuk Pasangan yang Sesuai (Tas & Pintu)
    Exercise(
        id = "u24_s2_p2_m3",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u24_s2_p2_m1", "书包", "shūbāo", "tas sekolah"),
            MatchPairItem("u24_s2_p2_m2", "门", "mén", "pintu"),
            MatchPairItem("u24_s2_p2_m3", "门口", "ménkǒu", "ambang pintu"),
            MatchPairItem("u24_s2_p2_m4", "关门", "guān mén", "menutup pintu")
        )
    ),

    // 4. Soal 4: Ketik Pinyin (tas sekolah -> shūbāo)
    Exercise(
        id = "u24_s2_p2_q4",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "tas sekolah",
        sentenceWithBlank = "书包 (________)",
        targetHanzi = "书包",
        targetPinyin = "shūbāo",
        correctAnswer = "shubao",
        keyboardKeys = listOf("s", "h", "u", "b", "a", "o", "e", "i", "d", "g", "j", "l"),
        audioToSpeak = "书包"
    ),

    // 5. Soal 5: Mendengar Kalimat (Rule 10: illustrationRes = 0)
    Exercise(
        id = "u24_s2_p2_q5",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Apa yang Anda dengar?",
        targetTranslation = "Saya menunggu Anda di depan pintu gerbang sekolah.",
        targetHanzi = "我 在 学校 门口 等 你。",
        targetPinyin = "Wǒ zài xuéxiào ménkǒu děng nǐ.",
        wordChips = listOf("我:wǒ", "在:zài", "学校:xuéxiào", "门口:ménkǒu", "等:děng", "你。:nǐ.", "看:kàn"),
        correctAnswer = "我,在,学校,门口,等,你。",
        illustrationRes = 0,
        audioToSpeak = "我在学校门口等你。"
    ),

    // 6. Soal 6: Pilihan Kalimat
    Exercise(
        id = "u24_s2_p2_q6",
        type = ExerciseType.SENTENCE_CHOICE,
        title = "Pilih terjemahan yang benar",
        targetHanzi = "出门 前 请 把 门 关 上。",
        targetPinyin = "Chūmén qián qǐng bǎ mén guān shàng.",
        targetTranslation = "Sebelum keluar rumah tolong tutup pintunya.",
        correctAnswer = "Chūmén qián qǐng bǎ mén guān shàng.\n出门 前 请 把 门 关 上。",
        options = listOf(
            "Chūmén qián qǐng bǎ mén guān shàng.\n出门 前 请 把 门 关 上。",
            "Chūmén qián qǐng bǎ mén dǎkāi.\n出门 前 请 把 门 打开。",
            "Jìnmén qián qǐng bǎ mén guān shàng.\n进门 前 请 把 门 关 上。"
        ),
        audioToSpeak = "出门前请把门关上。"
    ),

    // 7. Soal 7: Pilihan Gambar (门 -> pintu gerbang)
    Exercise(
        id = "u24_s2_p2_q7",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "门",
        targetPinyin = "mén",
        targetTranslation = "pintu / gerbang",
        correctAnswer = "pintu / gerbang",
        audioToSpeak = "门",
        pictureOptions = listOf(
            PictureOption("u24_s2_p2_opt7_1", "pintu", "", R.drawable.ic_edu_school_start, true),
            PictureOption("u24_s2_p2_opt7_2", "ruang kelas", "", R.drawable.ic_edu_classroom, false),
            PictureOption("u24_s2_p2_opt7_3", "tas", "", R.drawable.ic_edu_notebook, false),
            PictureOption("u24_s2_p2_opt7_4", "pena", "", R.drawable.ic_edu_pen_pencil, false)
        )
    ),

    // 8. Soal 8: Ketik Pinyin (pintu masuk -> ménkǒu)
    Exercise(
        id = "u24_s2_p2_q8",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "pintu masuk / ambang pintu",
        sentenceWithBlank = "门口 (________)",
        targetHanzi = "门口",
        targetPinyin = "ménkǒu",
        correctAnswer = "menkou",
        keyboardKeys = listOf("m", "e", "n", "k", "o", "u", "a", "i", "b", "d", "g", "h"),
        audioToSpeak = "门口"
    ),

    // 9. Soal 9: Susun Kalimat (Di dalam tas sekolah ada buku dan pena.)
    Exercise(
        id = "u24_s2_p2_q9",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Di dalam tas ada buku dan pena.",
        targetHanzi = "书包 里 有 书 和 笔。",
        targetPinyin = "Shūbāo lǐ yǒu shū hé bǐ.",
        wordChips = listOf("书包:shūbāo", "里:lǐ", "有:yǒu", "书:shū", "和:hé", "笔。:bǐ.", "本子:běnzi"),
        correctAnswer = "书包,里,有,书,和,笔。",
        audioToSpeak = "书包里有书和笔。"
    ),

    // 10. Soal 10: Ketuk Pasangan yang Sesuai (Rangkuman Tas & Ambang Pintu)
    Exercise(
        id = "u24_s2_p2_m10",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u24_s2_p2_m10_1", "书包", "shūbāo", "tas sekolah"),
            MatchPairItem("u24_s2_p2_m10_2", "门口", "ménkǒu", "ambang pintu"),
            MatchPairItem("u24_s2_p2_m3", "关上门", "guān shàng mén", "tutup pintu"),
            MatchPairItem("u24_s2_p2_m4", "打开门", "dǎkāi mén", "buka pintu")
        )
    )
)
