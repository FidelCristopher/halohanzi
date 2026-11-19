package com.example.chineselearning.data.repository

import com.example.chineselearning.R
import com.example.chineselearning.data.model.Exercise
import com.example.chineselearning.data.model.ExerciseType
import com.example.chineselearning.data.model.MatchPairItem
import com.example.chineselearning.data.model.PictureOption

val bab11Stage4Part1Exercises = listOf(
    // 1. Soal 1: Pilihan Gambar (读 -> membaca lantang)
    Exercise(
        id = "u11_s4_p1_q1",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "读",
        targetPinyin = "dú",
        targetTranslation = "membaca",
        correctAnswer = "membaca",
        audioToSpeak = "读",
        pictureOptions = listOf(
            PictureOption("u11_s4_p1_opt1", "membaca", "🗣️", R.drawable.ic_book, true),
            PictureOption("u11_s4_p1_opt2", "menulis", "✍️", R.drawable.ic_target, false),
            PictureOption("u11_s4_p1_opt3", "tidur", "🛌", R.drawable.ic_crown, false),
            PictureOption("u11_s4_p1_opt4", "makan", "🍜", R.drawable.ic_coin, false)
        )
    ),

    // 2. Soal 2: Susun Kalimat (Mari membaca bersama guru.)
    Exercise(
        id = "u11_s4_p1_q2",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Membaca bersama guru.",
        targetHanzi = "跟 老师 读。",
        targetPinyin = "Gēn lǎoshī dú.",
        wordChips = listOf("跟:gēn", "老师:lǎoshī", "读:dú", "写:xiě", "看:kàn"),
        correctAnswer = "跟,老师,读",
        audioToSpeak = "跟老师读。"
    ),

    // 3. Soal 3: Ketuk Pasangan yang Sesuai (Membaca)
    Exercise(
        id = "u11_s4_p1_q3",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u11_s4_p1_m1", "读", "dú", "membaca (lantang)"),
            MatchPairItem("u11_s4_p1_m2", "读书", "dúshū", "membaca buku / kuliah"),
            MatchPairItem("u11_s4_p1_m3", "看书", "kànshū", "membaca buku (visual)"),
            MatchPairItem("u11_s4_p1_m4", "跟老师读", "gēn lǎoshī dú", "ikut membaca")
        )
    ),

    // 4. Soal 4: Ketik Pinyin (membaca -> dú)
    Exercise(
        id = "u11_s4_p1_q4",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "membaca",
        sentenceWithBlank = "读 (________)",
        targetHanzi = "读",
        targetPinyin = "dú",
        correctAnswer = "du",
        keyboardKeys = listOf("d", "u", "a", "e", "i", "o", "b", "g", "h", "j", "l"),
        audioToSpeak = "读"
    ),

    // 5. Soal 5: Mendengar Kalimat (Rule 10: illustrationRes = 0)
    Exercise(
        id = "u11_s4_p1_q5",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Apa yang Anda dengar?",
        targetTranslation = "Silakan Anda baca kalimat ini.",
        targetHanzi = "请 你 读 这个 句子。",
        targetPinyin = "Qǐng nǐ dú zhège jùzi.",
        wordChips = listOf("请:qǐng", "你:nǐ", "读:dú", "这个:zhège", "句子:jùzi", "写:xiě"),
        correctAnswer = "请,你,读,这个,句子",
        illustrationRes = 0,
        audioToSpeak = "请你读这个句子。"
    ),

    // 6. Soal 6: Pilihan Kalimat
    Exercise(
        id = "u11_s4_p1_q6",
        type = ExerciseType.SENTENCE_CHOICE,
        title = "Pilih terjemahan yang benar",
        targetHanzi = "这个 汉字 怎么 读？",
        targetPinyin = "Zhège Hànzì zěnme dú?",
        targetTranslation = "Bagaimana membaca Hanzi ini?",
        correctAnswer = "Zhège Hànzì zěnme dú?\n这个 汉字 怎么 读？",
        options = listOf(
            "Zhège Hànzì zěnme dú?\n这个 汉字 怎么 读？",
            "Zhège Hànzì zěnme xiě?\n这个 汉字 怎么 写？",
            "Nàge Hànzì zěnme dú?\n那个 汉字 怎么 读？"
        ),
        audioToSpeak = "这个汉字怎么读？"
    ),

    // 7. Soal 7: Pilihan Gambar (读书 -> membaca buku)
    Exercise(
        id = "u11_s4_p1_q7",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "读书",
        targetPinyin = "dúshū",
        targetTranslation = "membaca buku",
        correctAnswer = "membaca buku",
        audioToSpeak = "读书",
        pictureOptions = listOf(
            PictureOption("u11_s4_p1_opt7_1", "membaca buku", "📖", R.drawable.ic_book, true),
            PictureOption("u11_s4_p1_opt7_2", "menulis", "✍️", R.drawable.ic_target, false),
            PictureOption("u11_s4_p1_opt7_3", "tidur", "🛌", R.drawable.ic_crown, false),
            PictureOption("u11_s4_p1_opt7_4", "makan", "🍜", R.drawable.ic_coin, false)
        )
    ),

    // 8. Soal 8: Ketik Pinyin (membaca buku -> dúshū)
    Exercise(
        id = "u11_s4_p1_q8",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "membaca buku",
        sentenceWithBlank = "读书 (________)",
        targetHanzi = "读书",
        targetPinyin = "dúshū",
        correctAnswer = "dushu",
        keyboardKeys = listOf("d", "u", "s", "h", "a", "e", "i", "o", "b", "g", "j"),
        audioToSpeak = "读书"
    ),

    // 9. Soal 9: Susun Kalimat (Siswa sedang membaca buku.)
    Exercise(
        id = "u11_s4_p1_q9",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Siswa sedang membaca buku.",
        targetHanzi = "学生 在 读书。",
        targetPinyin = "Xuéshēng zài dúshū.",
        wordChips = listOf("学生:xuéshēng", "在:zài", "读书:dúshū", "睡觉:shuìjiào", "老师:lǎoshī"),
        correctAnswer = "学生,在,读书",
        audioToSpeak = "学生在读书。"
    ),

    // 10. Soal 10: Ketuk Pasangan yang Sesuai (Rangkuman Membaca Buku)
    Exercise(
        id = "u11_s4_p1_m10_1",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u11_s4_p1_m10_1", "读", "dú", "membaca"),
            MatchPairItem("u11_s4_p1_m10_2", "读书", "dúshū", "baca buku"),
            MatchPairItem("u11_s4_p1_m10_3", "怎么读", "zěnme dú", "cara membaca"),
            MatchPairItem("u11_s4_p1_m10_4", "跟老师读", "gēn lǎoshī dú", "ikut baca")
        )
    )
)

val bab11Stage4Part2Exercises = listOf(
    // 1. Soal 1: Pilihan Gambar (读汉语 -> membaca bahasa Mandarin)
    Exercise(
        id = "u11_s4_p2_q1",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "读",
        targetPinyin = "dú",
        targetTranslation = "membaca",
        correctAnswer = "membaca",
        audioToSpeak = "读",
        pictureOptions = listOf(
            PictureOption("u11_s4_p2_opt1", "membaca", "🗣️", R.drawable.ic_book, true),
            PictureOption("u11_s4_p2_opt2", "menulis", "✍️", R.drawable.ic_target, false),
            PictureOption("u11_s4_p2_opt3", "mendengar", "🎧", R.drawable.ic_crown, false),
            PictureOption("u11_s4_p2_opt4", "makan", "🍜", R.drawable.ic_coin, false)
        )
    ),

    // 2. Soal 2: Susun Kalimat (Dia kuliah di Beijing.)
    Exercise(
        id = "u11_s4_p2_q2",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Dia kuliah di Beijing.",
        targetHanzi = "他 在 北京 读书。",
        targetPinyin = "Tā zài Běijīng dúshū.",
        wordChips = listOf("他:tā", "在:zài", "北京:Běijīng", "读书:dúshū", "工作:gōngzuò", "我:wǒ"),
        correctAnswer = "他,在,北京,读书",
        audioToSpeak = "他在北京读书。"
    ),

    // 3. Soal 3: Ketuk Pasangan yang Sesuai (Aktivitas Kuliah)
    Exercise(
        id = "u11_s4_p2_m3",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u11_s4_p2_m1", "读书", "dúshū", "kuliah / baca buku"),
            MatchPairItem("u11_s4_p2_m2", "在大学读书", "zài dàxué dúshū", "kuliah di universitas"),
            MatchPairItem("u11_s4_p2_m3", "喜欢读书", "xǐhuan dúshū", "suka membaca"),
            MatchPairItem("u11_s4_p2_m4", "在北京", "zài Běijīng", "di Beijing")
        )
    ),

    // 4. Soal 4: Ketik Pinyin (ikut membaca -> gēndú)
    Exercise(
        id = "u11_s4_p2_q4",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "ikut membaca",
        sentenceWithBlank = "跟读 (________)",
        targetHanzi = "跟读",
        targetPinyin = "gēndú",
        correctAnswer = "gendu",
        keyboardKeys = listOf("g", "e", "n", "d", "u", "a", "i", "o", "b", "h", "j"),
        audioToSpeak = "跟读"
    ),

    // 5. Soal 5: Mendengar Kalimat (Rule 10: illustrationRes = 0)
    Exercise(
        id = "u11_s4_p2_q5",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Apa yang Anda dengar?",
        targetTranslation = "Saya suka membaca buku.",
        targetHanzi = "我 喜欢 读书。",
        targetPinyin = "Wǒ xǐhuan dúshū.",
        wordChips = listOf("我:wǒ", "喜欢:xǐhuan", "读书:dúshū", "睡觉:shuìjiào", "他:tā"),
        correctAnswer = "我,喜欢,读书",
        illustrationRes = 0,
        audioToSpeak = "我喜欢读书。"
    ),

    // 6. Soal 6: Pilihan Kalimat
    Exercise(
        id = "u11_s4_p2_q6",
        type = ExerciseType.SENTENCE_CHOICE,
        title = "Pilih terjemahan yang benar",
        targetHanzi = "你 在 哪儿 读书？",
        targetPinyin = "Nǐ zài nǎr dúshū?",
        targetTranslation = "Kamu kuliah di mana?",
        correctAnswer = "Nǐ zài nǎr dúshū?\n你 在 哪儿 读书？",
        options = listOf(
            "Nǐ zài nǎr dúshū?\n你 在 哪儿 读书？",
            "Tā zài nǎr dúshū?\n他 在 哪儿 读书？",
            "Nǐ zài nǎr gōngzuò?\n你 在 哪儿 工作？"
        ),
        audioToSpeak = "你在哪儿读书？"
    ),

    // 7. Soal 7: Pilihan Gambar (读课文 -> membaca teks)
    Exercise(
        id = "u11_s4_p2_q7",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "读",
        targetPinyin = "dú",
        targetTranslation = "membaca",
        correctAnswer = "membaca",
        audioToSpeak = "读",
        pictureOptions = listOf(
            PictureOption("u11_s4_p2_opt7_1", "membaca", "🗣️", R.drawable.ic_book, true),
            PictureOption("u11_s4_p2_opt7_2", "menulis", "✍️", R.drawable.ic_target, false),
            PictureOption("u11_s4_p2_opt7_3", "makan", "🍜", R.drawable.ic_coin, false),
            PictureOption("u11_s4_p2_opt7_4", "tidur", "🛌", R.drawable.ic_crown, false)
        )
    ),

    // 8. Soal 8: Ketik Pinyin (membaca -> dú)
    Exercise(
        id = "u11_s4_p2_q8",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "membaca",
        sentenceWithBlank = "读 (________)",
        targetHanzi = "读",
        targetPinyin = "dú",
        correctAnswer = "du",
        keyboardKeys = listOf("h", "a", "o", "d", "u", "e", "i", "b", "g", "j", "l"),
        audioToSpeak = "读"
    ),

    // 9. Soal 9: Susun Kalimat (Kakak saya kuliah di Tiongkok.)
    Exercise(
        id = "u11_s4_p2_q9",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Kakak saya kuliah di Tiongkok.",
        targetHanzi = "我 哥哥 在 中国 读书。",
        targetPinyin = "Wǒ gēge zài Zhōngguó dúshū.",
        wordChips = listOf("我:wǒ", "哥哥:gēge", "在:zài", "中国:Zhōngguó", "读书:dúshū", "弟弟:dìdi"),
        correctAnswer = "我,哥哥,在,中国,读书",
        audioToSpeak = "我哥哥在中国读书。"
    ),

    // 10. Soal 10: Ketuk Pasangan yang Sesuai (Rangkuman Studi)
    Exercise(
        id = "u11_s4_p2_m10_1",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u11_s4_p2_m10_1", "读书", "dúshū", "kuliah"),
            MatchPairItem("u11_s4_p2_m10_2", "读", "dú", "membaca"),
            MatchPairItem("u11_s4_p2_m10_3", "在中国读书", "zài Zhōngguó dúshū", "kuliah di Tiongkok"),
            MatchPairItem("u11_s4_p2_m10_4", "喜欢读书", "xǐhuan dúshū", "gemar membaca")
        )
    )
)
