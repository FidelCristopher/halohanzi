package com.example.chineselearning.data.repository

import com.example.chineselearning.R
import com.example.chineselearning.data.model.Exercise
import com.example.chineselearning.data.model.ExerciseType
import com.example.chineselearning.data.model.MatchPairItem
import com.example.chineselearning.data.model.PictureOption

val bab11Stage1Part1Exercises = listOf(
    // 1. Soal 1: Pilihan Gambar (学校 -> sekolah)
    Exercise(
        id = "u11_s1_p1_q1",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "学校",
        targetPinyin = "xuéxiào",
        targetTranslation = "sekolah",
        correctAnswer = "sekolah",
        audioToSpeak = "学校",
        pictureOptions = listOf(
            PictureOption("u11_s1_p1_opt1", "sekolah", "🏫", R.drawable.ic_cap, true),
            PictureOption("u11_s1_p1_opt2", "rumah", "🏠", R.drawable.ic_people_group, false),
            PictureOption("u11_s1_p1_opt3", "toko", "🏪", R.drawable.ic_coin, false),
            PictureOption("u11_s1_p1_opt4", "buku", "📖", R.drawable.ic_book, false)
        )
    ),

    // 2. Soal 2: Susun Kalimat (Saya pergi ke sekolah.)
    Exercise(
        id = "u11_s1_p1_q2",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Saya pergi ke sekolah.",
        targetHanzi = "我 去 学校。",
        targetPinyin = "Wǒ qù xuéxiào.",
        wordChips = listOf("我:wǒ", "去:qù", "学校:xuéxiào", "家:jiā", "来:lái"),
        correctAnswer = "我,去,学校",
        audioToSpeak = "我去学校。"
    ),

    // 3. Soal 3: Ketuk Pasangan yang Sesuai (Sekolah & Siswa SD)
    Exercise(
        id = "u11_s1_p1_q3",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u11_s1_p1_m1", "学校", "xuéxiào", "sekolah"),
            MatchPairItem("u11_s1_p1_m2", "小学", "xiǎoxué", "sekolah dasar (SD)"),
            MatchPairItem("u11_s1_p1_m3", "小学生", "xiǎoxuéshēng", "murid SD"),
            MatchPairItem("u11_s1_p1_m4", "老师", "lǎoshī", "guru")
        )
    ),

    // 4. Soal 4: Ketik Pinyin (sekolah -> xuéxiào)
    Exercise(
        id = "u11_s1_p1_q4",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "sekolah",
        sentenceWithBlank = "学校 (________)",
        targetHanzi = "学校",
        targetPinyin = "xuéxiào",
        correctAnswer = "xuexiao",
        keyboardKeys = listOf("x", "u", "e", "i", "a", "o", "b", "d", "g", "h", "j"),
        audioToSpeak = "学校"
    ),

    // 5. Soal 5: Mendengar Kalimat (Rule 10: illustrationRes = 0)
    Exercise(
        id = "u11_s1_p1_q5",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Apa yang Anda dengar?",
        targetTranslation = "Dia adalah murid SD.",
        targetHanzi = "他 是 小学生。",
        targetPinyin = "Tā shì xiǎoxuéshēng.",
        wordChips = listOf("他:tā", "是:shì", "小学生:xiǎoxuéshēng", "老师:lǎoshī", "我:wǒ"),
        correctAnswer = "他,是,小学生",
        illustrationRes = 0,
        audioToSpeak = "他是小学生。"
    ),

    // 6. Soal 6: Pilihan Kalimat
    Exercise(
        id = "u11_s1_p1_q6",
        type = ExerciseType.SENTENCE_CHOICE,
        title = "Pilih terjemahan yang benar",
        targetHanzi = "我们 学校 很 大。",
        targetPinyin = "Wǒmen xuéxiào hěn dà.",
        targetTranslation = "Sekolah kami sangat besar.",
        correctAnswer = "Wǒmen xuéxiào hěn dà.\n我们 学校 很 大。",
        options = listOf(
            "Wǒmen xuéxiào hěn dà.\n我们 学校 很 大。",
            "Tāmen xuéxiào hěn dà.\n他们 学校 很 大。",
            "Wǒmen jiā hěn dà.\n我们 家 很 大。"
        ),
        audioToSpeak = "我们学校很大。"
    ),

    // 7. Soal 7: Pilihan Gambar (小学 -> sekolah dasar)
    Exercise(
        id = "u11_s1_p1_q7",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "小学",
        targetPinyin = "xiǎoxué",
        targetTranslation = "sekolah dasar",
        correctAnswer = "sekolah dasar",
        audioToSpeak = "小学",
        pictureOptions = listOf(
            PictureOption("u11_s1_p1_opt7_1", "sekolah dasar", "🎒", R.drawable.ic_cap, true),
            PictureOption("u11_s1_p1_opt7_2", "universitas", "🏛️", R.drawable.ic_target, false),
            PictureOption("u11_s1_p1_opt7_3", "rumah", "🏠", R.drawable.ic_people_group, false),
            PictureOption("u11_s1_p1_opt7_4", "toko", "🏪", R.drawable.ic_coin, false)
        )
    ),

    // 8. Soal 8: Ketik Pinyin (sekolah dasar -> xiǎoxué)
    Exercise(
        id = "u11_s1_p1_q8",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "sekolah dasar",
        sentenceWithBlank = "小学 (________)",
        targetHanzi = "小学",
        targetPinyin = "xiǎoxué",
        correctAnswer = "xiaoxue",
        keyboardKeys = listOf("x", "i", "a", "o", "u", "e", "b", "d", "g", "h", "j"),
        audioToSpeak = "小学"
    ),

    // 9. Soal 9: Susun Kalimat (Adik laki-laki saya murid SD.)
    Exercise(
        id = "u11_s1_p1_q9",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Adik saya murid SD.",
        targetHanzi = "我 弟弟 是 小学生。",
        targetPinyin = "Wǒ dìdi shì xiǎoxuéshēng.",
        wordChips = listOf("我:wǒ", "弟弟:dìdi", "是:shì", "小学生:xiǎoxuéshēng", "哥哥:gēge", "老师:lǎoshī"),
        correctAnswer = "我,弟弟,是,小学生",
        audioToSpeak = "我弟弟是小学生。"
    ),

    // 10. Soal 10: Ketuk Pasangan yang Sesuai (Rangkuman SD)
    Exercise(
        id = "u11_s1_p1_m10_1",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u11_s1_p1_m10_1", "小学", "xiǎoxué", "sekolah dasar"),
            MatchPairItem("u11_s1_p1_m10_2", "小学生", "xiǎoxuéshēng", "murid SD"),
            MatchPairItem("u11_s1_p1_m10_3", "学校", "xuéxiào", "sekolah"),
            MatchPairItem("u11_s1_p1_m10_4", "去学校", "qù xuéxiào", "pergi ke sekolah")
        )
    )
)

val bab11Stage1Part2Exercises = listOf(
    // 1. Soal 1: Pilihan Gambar (大学 -> universitas)
    Exercise(
        id = "u11_s1_p2_q1",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "大学",
        targetPinyin = "dàxué",
        targetTranslation = "universitas",
        correctAnswer = "universitas",
        audioToSpeak = "大学",
        pictureOptions = listOf(
            PictureOption("u11_s1_p2_opt1", "universitas", "🏛️", R.drawable.ic_cap, true),
            PictureOption("u11_s1_p2_opt2", "sekolah dasar", "🎒", R.drawable.ic_target, false),
            PictureOption("u11_s1_p2_opt3", "rumah", "🏠", R.drawable.ic_people_group, false),
            PictureOption("u11_s1_p2_opt4", "rumah sakit", "🏥", R.drawable.ic_book, false)
        )
    ),

    // 2. Soal 2: Susun Kalimat (Kakak laki-laki saya mahasiswa.)
    Exercise(
        id = "u11_s1_p2_q2",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Kakak saya adalah mahasiswa.",
        targetHanzi = "我 哥哥 是 大学生。",
        targetPinyin = "Wǒ gēge shì dàxuéshēng.",
        wordChips = listOf("我:wǒ", "哥哥:gēge", "是:shì", "大学生:dàxuéshēng", "弟弟:dìdi", "老师:lǎoshī"),
        correctAnswer = "我,哥哥,是,大学生",
        audioToSpeak = "我哥哥是大学生。"
    ),

    // 3. Soal 3: Ketuk Pasangan yang Sesuai (Jenjang Pendidikan)
    Exercise(
        id = "u11_s1_p2_m3",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u11_s1_p2_m1", "中学", "zhōngxué", "sekolah menengah"),
            MatchPairItem("u11_s1_p2_m2", "中学生", "zhōngxuéshēng", "siswa SMP/SMA"),
            MatchPairItem("u11_s1_p2_m3", "大学", "dàxué", "universitas"),
            MatchPairItem("u11_s1_p2_m4", "大学生", "dàxuéshēng", "mahasiswa")
        )
    ),

    // 4. Soal 4: Ketik Pinyin (universitas -> dàxué)
    Exercise(
        id = "u11_s1_p2_q4",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "universitas",
        sentenceWithBlank = "大学 (________)",
        targetHanzi = "大学",
        targetPinyin = "dàxué",
        correctAnswer = "daxue",
        keyboardKeys = listOf("d", "a", "x", "u", "e", "i", "o", "b", "g", "h", "j"),
        audioToSpeak = "大学"
    ),

    // 5. Soal 5: Mendengar Kalimat (Rule 10: illustrationRes = 0)
    Exercise(
        id = "u11_s1_p2_q5",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Apa yang Anda dengar?",
        targetTranslation = "Dia belajar di universitas.",
        targetHanzi = "他 在 大学 学习。",
        targetPinyin = "Tā zài dàxué xuéxí.",
        wordChips = listOf("他:tā", "在:zài", "大学:dàxué", "学习:xuéxí", "中学:zhōngxué", "去:qù"),
        correctAnswer = "他,在,大学,学习",
        illustrationRes = 0,
        audioToSpeak = "他在大学学习。"
    ),

    // 6. Soal 6: Pilihan Kalimat
    Exercise(
        id = "u11_s1_p2_q6",
        type = ExerciseType.SENTENCE_CHOICE,
        title = "Pilih terjemahan yang benar",
        targetHanzi = "北京 大学 很 大。",
        targetPinyin = "Běijīng dàxué hěn dà.",
        targetTranslation = "Universitas Beijing sangat besar.",
        correctAnswer = "Běijīng dàxué hěn dà.\n北京 大学 很 大。",
        options = listOf(
            "Běijīng dàxué hěn dà.\n北京 大学 很 大。",
            "Běijīng zhōngxué hěn dà.\n北京 中学 很 大。",
            "Běijīng xiǎoxué hěn dà.\n北京 小学 很 大。"
        ),
        audioToSpeak = "北京大学很大。"
    ),

    // 7. Soal 7: Pilihan Gambar (大学生 -> mahasiswa)
    Exercise(
        id = "u11_s1_p2_q7",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "大学生",
        targetPinyin = "dàxuéshēng",
        targetTranslation = "mahasiswa",
        correctAnswer = "mahasiswa",
        audioToSpeak = "大学生",
        pictureOptions = listOf(
            PictureOption("u11_s1_p2_opt7_1", "mahasiswa", "🧑‍🎓", R.drawable.ic_cap, true),
            PictureOption("u11_s1_p2_opt7_2", "guru", "👨‍🏫", R.drawable.ic_target, false),
            PictureOption("u11_s1_p2_opt7_3", "dokter", "👨‍⚕️", R.drawable.ic_book, false),
            PictureOption("u11_s1_p2_opt7_4", "murid SD", "🎒", R.drawable.ic_coin, false)
        )
    ),

    // 8. Soal 8: Ketik Pinyin (mahasiswa -> dàxuéshēng)
    Exercise(
        id = "u11_s1_p2_q8",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "mahasiswa",
        sentenceWithBlank = "大学生 (________)",
        targetHanzi = "大学生",
        targetPinyin = "dàxuéshēng",
        correctAnswer = "daxuesheng",
        keyboardKeys = listOf("d", "a", "x", "u", "e", "s", "h", "n", "g", "i", "o"),
        audioToSpeak = "大学生"
    ),

    // 9. Soal 9: Susun Kalimat (Kakak perempuan saya siswi SMP.)
    Exercise(
        id = "u11_s1_p2_q9",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Kakak saya siswi sekolah menengah.",
        targetHanzi = "我 姐姐 是 中学生。",
        targetPinyin = "Wǒ jiějie shì zhōngxuéshēng.",
        wordChips = listOf("我:wǒ", "姐姐:jiějie", "是:shì", "中学生:zhōngxuéshēng", "妹妹:mèimei", "小学生:xiǎoxuéshēng"),
        correctAnswer = "我,姐姐,是,中学生",
        audioToSpeak = "我姐姐是中学生。"
    ),

    // 10. Soal 10: Ketuk Pasangan yang Sesuai (Rangkuman Siswa & Mahasiswa)
    Exercise(
        id = "u11_s1_p2_m10_1",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u11_s1_p2_m10_1", "大学生", "dàxuéshēng", "mahasiswa"),
            MatchPairItem("u11_s1_p2_m10_2", "中学生", "zhōngxuéshēng", "siswa SMP/SMA"),
            MatchPairItem("u11_s1_p2_m10_3", "小学生", "xiǎoxuéshēng", "siswa SD"),
            MatchPairItem("u11_s1_p2_m10_4", "大学", "dàxué", "universitas")
        )
    )
)
