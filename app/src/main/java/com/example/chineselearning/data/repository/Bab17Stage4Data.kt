package com.example.chineselearning.data.repository

import com.example.chineselearning.R
import com.example.chineselearning.data.model.Exercise
import com.example.chineselearning.data.model.ExerciseType
import com.example.chineselearning.data.model.MatchPairItem
import com.example.chineselearning.data.model.PictureOption

val bab17Stage4Part1Exercises = listOf(
    // 1. Soal 1: Pilihan Gambar (姓 -> marga)
    Exercise(
        id = "u17_s4_p1_q1",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "姓",
        targetPinyin = "xìng",
        targetTranslation = "marga / bermarga",
        correctAnswer = "marga / bermarga",
        audioToSpeak = "姓",
        pictureOptions = listOf(
            PictureOption("u17_s4_p1_opt1", "marga", "", R.drawable.ic_comm_know, true),
            PictureOption("u17_s4_p1_opt2", "rumah", "", R.drawable.ic_fam_home, false),
            PictureOption("u17_s4_p1_opt3", "kursi", "", R.drawable.ic_fam_chair, false),
            PictureOption("u17_s4_p1_opt4", "meja", "", R.drawable.ic_fam_table, false)
        )
    ),

    // 2. Soal 2: Susun Kalimat (Bolehkah saya tanya apa marga terhormat Anda?)
    Exercise(
        id = "u17_s4_p1_q2",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Bolehkah tanya siapa marga Anda?",
        targetHanzi = "请问 您 贵 姓？",
        targetPinyin = "Qǐngwèn nín guì xìng?",
        wordChips = listOf("请问:qǐngwèn", "您:nín", "贵:guì", "姓？:xìng?", "叫:jiào"),
        correctAnswer = "请问,您,贵,姓？",
        audioToSpeak = "请问您贵姓？"
    ),

    // 3. Soal 3: Ketuk Pasangan yang Sesuai (Marga & Nama Lengkap)
    Exercise(
        id = "u17_s4_p1_q3",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u17_s4_p1_m1", "姓", "xìng", "bermarga / marga"),
            MatchPairItem("u17_s4_p1_m2", "姓名", "xìngmíng", "nama lengkap"),
            MatchPairItem("u17_s4_p1_m3", "贵姓", "guìxìng", "marga terhormat"),
            MatchPairItem("u17_s4_p1_m4", "名字", "míngzi", "nama")
        )
    ),

    // 4. Soal 4: Ketik Pinyin (marga -> xìng)
    Exercise(
        id = "u17_s4_p1_q4",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "marga / bermarga",
        sentenceWithBlank = "姓 (________)",
        targetHanzi = "姓",
        targetPinyin = "xìng",
        correctAnswer = "xing",
        keyboardKeys = listOf("x", "i", "n", "g", "a", "e", "o", "u", "b", "d", "h", "j"),
        audioToSpeak = "姓"
    ),

    // 5. Soal 5: Mendengar Kalimat (Rule 10: illustrationRes = 0)
    Exercise(
        id = "u17_s4_p1_q5",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Apa yang Anda dengar?",
        targetTranslation = "Tolong tuliskan nama lengkap Anda di sini.",
        targetHanzi = "请 在 这里 写 姓名。",
        targetPinyin = "Qǐng zài zhèlǐ xiě xìngmíng.",
        wordChips = listOf("请:qǐng", "在:zài", "这里:zhèlǐ", "写:xiě", "姓名。:xìngmíng.", "看:kàn"),
        correctAnswer = "请,在,这里,写,姓名。",
        illustrationRes = 0,
        audioToSpeak = "请在这里写姓名。"
    ),

    // 6. Soal 6: Pilihan Kalimat
    Exercise(
        id = "u17_s4_p1_q6",
        type = ExerciseType.SENTENCE_CHOICE,
        title = "Pilih terjemahan yang benar",
        targetHanzi = "我 姓 王， 叫 王 朋。",
        targetPinyin = "Wǒ xìng Wáng, jiào Wáng Péng.",
        targetTranslation = "Marga saya Wang, dipanggil Wang Peng.",
        correctAnswer = "Wǒ xìng Wáng, jiào Wáng Péng.\n我 姓 王， 叫 王 朋。",
        options = listOf(
            "Wǒ xìng Wáng, jiào Wáng Péng.\n我 姓 王， 叫 王 朋。",
            "Wǒ xìng Lǐ, jiào Wáng Péng.\n我 姓 李， 叫 王 朋。",
            "Tā xìng Wáng, jiào Wáng Péng.\n他 姓 王， 叫 王 朋。"
        ),
        audioToSpeak = "我姓王，叫王朋。"
    ),

    // 7. Soal 7: Pilihan Gambar (姓名 -> nama lengkap)
    Exercise(
        id = "u17_s4_p1_q7",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "姓名",
        targetPinyin = "xìngmíng",
        targetTranslation = "nama lengkap",
        correctAnswer = "nama lengkap",
        audioToSpeak = "姓名",
        pictureOptions = listOf(
            PictureOption("u17_s4_p1_opt7_1", "nama lengkap", "", R.drawable.ic_comm_know, true),
            PictureOption("u17_s4_p1_opt7_2", "orang", "", R.drawable.ic_person_saya, false),
            PictureOption("u17_s4_p1_opt7_3", "rumah", "", R.drawable.ic_fam_home, false),
            PictureOption("u17_s4_p1_opt7_4", "kue", "", R.drawable.ic_birthday_cake, false)
        )
    ),

    // 8. Soal 8: Ketik Pinyin (nama lengkap -> xìngmíng)
    Exercise(
        id = "u17_s4_p1_q8",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "nama lengkap",
        sentenceWithBlank = "姓名 (________)",
        targetHanzi = "姓名",
        targetPinyin = "xìngmíng",
        correctAnswer = "xingming",
        keyboardKeys = listOf("x", "i", "n", "g", "m", "a", "e", "o", "u", "b", "d", "h"),
        audioToSpeak = "姓名"
    ),

    // 9. Soal 9: Susun Kalimat (Siapa nama lengkap guru bahasa Mandarin Anda?)
    Exercise(
        id = "u17_s4_p1_q9",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Siapa nama lengkap guru Anda?",
        targetHanzi = "你 老师 的 姓名 是 谁？",
        targetPinyin = "Nǐ lǎoshī de xìngmíng shì shéi?",
        wordChips = listOf("你:nǐ", "老师:lǎoshī", "的:de", "姓名:xìngmíng", "是:shì", "谁？:shéi?"),
        correctAnswer = "你,老师,的,姓名,是,谁？",
        audioToSpeak = "你老师的姓名是谁？"
    ),

    // 10. Soal 10: Ketuk Pasangan yang Sesuai (Rangkuman Marga & Nama)
    Exercise(
        id = "u17_s4_p1_m10",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u17_s4_p1_m10_1", "姓", "xìng", "marga"),
            MatchPairItem("u17_s4_p1_m10_2", "姓名", "xìngmíng", "nama lengkap"),
            MatchPairItem("u17_s4_p1_m10_3", "写下", "xiě xià", "tuliskan"),
            MatchPairItem("u17_s4_p1_m10_4", "请问", "qǐngwèn", "permisi tanya")
        )
    )
)

val bab17Stage4Part2Exercises = listOf(
    // 1. Soal 1: Pilihan Gambar (自己 -> diri sendiri)
    Exercise(
        id = "u17_s4_p2_q1",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "自己",
        targetPinyin = "zìjǐ",
        targetTranslation = "diri sendiri",
        correctAnswer = "diri sendiri",
        audioToSpeak = "自己",
        pictureOptions = listOf(
            PictureOption("u17_s4_p2_opt1", "diri sendiri", "", R.drawable.ic_person_saya, true),
            PictureOption("u17_s4_p2_opt2", "banyak orang", "", R.drawable.ic_people_group, false),
            PictureOption("u17_s4_p2_opt3", "teman", "", R.drawable.ic_two_friends, false),
            PictureOption("u17_s4_p2_opt4", "rumah", "", R.drawable.ic_fam_home, false)
        )
    ),

    // 2. Soal 2: Susun Kalimat (Kita harus merawat diri sendiri dengan baik.)
    Exercise(
        id = "u17_s4_p2_q2",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Kita harus merawat diri sendiri.",
        targetHanzi = "我们要 照顾 好 自己。",
        targetPinyin = "Wǒmen yào zhàogù hǎo zìjǐ.",
        wordChips = listOf("我们要:wǒmen yào", "照顾:zhàogù", "好:hǎo", "自己。:zìjǐ.", "他们:tāmen"),
        correctAnswer = "我们要,照顾,好,自己。",
        audioToSpeak = "我们要照顾好自己。"
    ),

    // 3. Soal 3: Ketuk Pasangan yang Sesuai (Diri Sendiri & Orang Formal)
    Exercise(
        id = "u17_s4_p2_m3",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u17_s4_p2_m1", "自己", "zìjǐ", "diri sendiri"),
            MatchPairItem("u17_s4_p2_m2", "名", "míng", "orang (formal)"),
            MatchPairItem("u17_s4_p2_m3", "照顾", "zhàogù", "merawat"),
            MatchPairItem("u17_s4_p2_m4", "做饭", "zuòfàn", "memasak")
        )
    ),

    // 4. Soal 4: Ketik Pinyin (diri sendiri -> zìjǐ)
    Exercise(
        id = "u17_s4_p2_q4",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "diri sendiri",
        sentenceWithBlank = "自己 (________)",
        targetHanzi = "自己",
        targetPinyin = "zìjǐ",
        correctAnswer = "ziji",
        keyboardKeys = listOf("z", "i", "j", "a", "e", "o", "u", "b", "d", "g", "h", "l"),
        audioToSpeak = "自己"
    ),

    // 5. Soal 5: Mendengar Kalimat (Rule 10: illustrationRes = 0)
    Exercise(
        id = "u17_s4_p2_q5",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Apa yang Anda dengar?",
        targetTranslation = "Ada dua orang dokter datang.",
        targetHanzi = "来 了 两 名 医生。",
        targetPinyin = "Lái le liǎng míng yīshēng.",
        wordChips = listOf("来:lái", "了:le", "两:liǎng", "名:míng", "医生。:yīshēng.", "三:sān"),
        correctAnswer = "来,了,两,名,医生。",
        illustrationRes = 0,
        audioToSpeak = "来了两名医生。"
    ),

    // 6. Soal 6: Pilihan Kalimat
    Exercise(
        id = "u17_s4_p2_q6",
        type = ExerciseType.SENTENCE_CHOICE,
        title = "Pilih terjemahan yang benar",
        targetHanzi = "这 是 我 自己 做 的 菜。",
        targetPinyin = "Zhè shì wǒ zìjǐ zuò de cài.",
        targetTranslation = "Ini adalah masakan yang saya buat sendiri.",
        correctAnswer = "Zhè shì wǒ zìjǐ zuò de cài.\n这 是 我 自己 做 的 菜。",
        options = listOf(
            "Zhè shì wǒ zìjǐ zuò de cài.\n这 是 我 自己 做 的 菜。",
            "Zhè shì tā zìjǐ zuò de cài.\n这 是 他 自己 做 的 菜。",
            "Zhè bú shì wǒ zuò de cài.\n这 不 是 我 做 的 菜。"
        ),
        audioToSpeak = "这是我自己做的菜。"
    ),

    // 7. Soal 7: Pilihan Gambar (名 -> kata penggolong orang formal)
    Exercise(
        id = "u17_s4_p2_q7",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "名",
        targetPinyin = "míng",
        targetTranslation = "orang (formal)",
        correctAnswer = "orang (formal)",
        audioToSpeak = "名",
        pictureOptions = listOf(
            PictureOption("u17_s4_p2_opt7_1", "orang formal", "", R.drawable.ic_person_single, true),
            PictureOption("u17_s4_p2_opt7_2", "banyak orang", "", R.drawable.ic_people_group, false),
            PictureOption("u17_s4_p2_opt7_3", "rumah", "", R.drawable.ic_fam_home, false),
            PictureOption("u17_s4_p2_opt7_4", "kue", "", R.drawable.ic_birthday_cake, false)
        )
    ),

    // 8. Soal 8: Ketik Pinyin (orang formal -> míng)
    Exercise(
        id = "u17_s4_p2_q8",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "orang (formal)",
        sentenceWithBlank = "名 (________)",
        targetHanzi = "名",
        targetPinyin = "míng",
        correctAnswer = "ming",
        keyboardKeys = listOf("m", "i", "n", "g", "a", "e", "o", "u", "b", "d", "h", "j"),
        audioToSpeak = "名"
    ),

    // 9. Soal 9: Susun Kalimat (Saya suka membaca buku sendiri di rumah.)
    Exercise(
        id = "u17_s4_p2_q9",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Saya suka baca buku sendiri.",
        targetHanzi = "我 喜欢 自己 在 家 看书。",
        targetPinyin = "Wǒ xǐhuan zìjǐ zài jiā kànshū.",
        wordChips = listOf("我:wǒ", "喜欢:xǐhuan", "自己:zìjǐ", "在:zài", "家:jiā", "看书。:kànshū.", "出去:chūqù"),
        correctAnswer = "我,喜欢,自己,在,家,看书。",
        audioToSpeak = "我喜欢自己在家看书。"
    ),

    // 10. Soal 10: Ketuk Pasangan yang Sesuai (Rangkuman Diri Sendiri)
    Exercise(
        id = "u17_s4_p2_m10",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u17_s4_p2_m10_1", "自己", "zìjǐ", "diri sendiri"),
            MatchPairItem("u17_s4_p2_m10_2", "两名", "liǎng míng", "dua orang"),
            MatchPairItem("u17_s4_p2_m10_3", "自己做", "zìjǐ zuò", "buat sendiri"),
            MatchPairItem("u17_s4_p2_m10_4", "在家里", "zài jiālǐ", "di dalam rumah")
        )
    )
)
