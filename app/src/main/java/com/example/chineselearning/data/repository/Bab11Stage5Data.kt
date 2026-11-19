package com.example.chineselearning.data.repository

import com.example.chineselearning.R
import com.example.chineselearning.data.model.Exercise
import com.example.chineselearning.data.model.ExerciseType
import com.example.chineselearning.data.model.MatchPairItem
import com.example.chineselearning.data.model.PictureOption

val bab11Stage5Part1Exercises = listOf(
    // 1. Soal 1: Pilihan Gambar (写 -> menulis)
    Exercise(
        id = "u11_s5_p1_q1",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "写",
        targetPinyin = "xiě",
        targetTranslation = "menulis",
        correctAnswer = "menulis",
        audioToSpeak = "写",
        pictureOptions = listOf(
            PictureOption("u11_s5_p1_opt1", "menulis", "", R.drawable.ic_edu_write, true),
            PictureOption("u11_s5_p1_opt2", "membaca", "", R.drawable.ic_edu_read_aloud, false),
            PictureOption("u11_s5_p1_opt3", "makan", "", R.drawable.ic_action_eat, false),
            PictureOption("u11_s5_p1_opt4", "tidur", "", R.drawable.ic_action_sleep, false)
        )
    ),

    // 2. Soal 2: Susun Kalimat (Saya bisa menulis aksara Hanzi.)
    Exercise(
        id = "u11_s5_p1_q2",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Saya bisa menulis aksara Hanzi.",
        targetHanzi = "我 会 写 汉字。",
        targetPinyin = "Wǒ huì xiě Hànzì.",
        wordChips = listOf("我:wǒ", "会:huì", "写:xiě", "汉字:Hànzì", "读:dú", "他:tā"),
        correctAnswer = "我,会,写,汉字",
        audioToSpeak = "我会写汉字。"
    ),

    // 3. Soal 3: Ketuk Pasangan yang Sesuai (Menulis & Aksara Hanzi)
    Exercise(
        id = "u11_s5_p1_q3",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u11_s5_p1_m1", "写", "xiě", "menulis"),
            MatchPairItem("u11_s5_p1_m2", "汉字", "Hànzì", "karakter Hanzi"),
            MatchPairItem("u11_s5_p1_m3", "字", "zì", "huruf / karakter"),
            MatchPairItem("u11_s5_p1_m4", "写汉字", "xiě Hànzì", "menulis aksara Hanzi")
        )
    ),

    // 4. Soal 4: Ketik Pinyin (menulis -> xiě)
    Exercise(
        id = "u11_s5_p1_q4",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "menulis",
        sentenceWithBlank = "写 (________)",
        targetHanzi = "写",
        targetPinyin = "xiě",
        correctAnswer = "xie",
        keyboardKeys = listOf("x", "i", "e", "a", "o", "u", "b", "d", "g", "h", "j"),
        audioToSpeak = "写"
    ),

    // 5. Soal 5: Mendengar Kalimat (Rule 10: illustrationRes = 0)
    Exercise(
        id = "u11_s5_p1_q5",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Apa yang Anda dengar?",
        targetTranslation = "Karakter ini sangat bagus ditulisnya.",
        targetHanzi = "这个 字 写 得 很 好。",
        targetPinyin = "Zhège zì xiě de hěn hǎo.",
        wordChips = listOf("这个:zhège", "字:zì", "写:xiě", "得:de", "很:hěn", "好:hǎo"),
        correctAnswer = "这个,字,写,得,很,好",
        illustrationRes = 0,
        audioToSpeak = "这个字写得很好。"
    ),

    // 6. Soal 6: Pilihan Kalimat
    Exercise(
        id = "u11_s5_p1_q6",
        type = ExerciseType.SENTENCE_CHOICE,
        title = "Pilih terjemahan yang benar",
        targetHanzi = "你 会 写 这个 汉字 吗？",
        targetPinyin = "Nǐ huì xiě zhège Hànzì ma?",
        targetTranslation = "Apakah kamu bisa menulis Hanzi ini?",
        correctAnswer = "Nǐ huì xiě zhège Hànzì ma?\n你 会 写 这个 汉字 吗？",
        options = listOf(
            "Nǐ huì xiě zhège Hànzì ma?\n你 会 写 这个 汉字 吗？",
            "Nǐ huì dú zhège Hànzì ma?\n你 会 读 这个 汉字 吗？",
            "Tā huì xiě zhège Hànzì ma?\n他 会 写 这个 汉字 吗？"
        ),
        audioToSpeak = "你会写这个汉字吗？"
    ),

    // 7. Soal 7: Pilihan Gambar (汉字 -> karakter Hanzi)
    Exercise(
        id = "u11_s5_p1_q7",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "汉字",
        targetPinyin = "Hànzì",
        targetTranslation = "karakter Hanzi",
        correctAnswer = "karakter Hanzi",
        audioToSpeak = "汉字",
        pictureOptions = listOf(
            PictureOption("u11_s5_p1_opt7_1", "karakter Hanzi", "", R.drawable.ic_edu_hanzi_char, true),
            PictureOption("u11_s5_p1_opt7_2", "angka", "", R.drawable.ic_num_10, false),
            PictureOption("u11_s5_p1_opt7_3", "buku", "", R.drawable.ic_book_chinese, false),
            PictureOption("u11_s5_p1_opt7_4", "uang", "", R.drawable.ic_yuan_currency, false)
        )
    ),

    // 8. Soal 8: Ketik Pinyin (karakter Hanzi -> Hànzì)
    Exercise(
        id = "u11_s5_p1_q8",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "karakter Hanzi",
        sentenceWithBlank = "汉字 (________)",
        targetHanzi = "汉字",
        targetPinyin = "Hànzì",
        correctAnswer = "hanzi",
        keyboardKeys = listOf("h", "a", "n", "z", "i", "e", "o", "u", "b", "d", "g"),
        audioToSpeak = "汉字"
    ),

    // 9. Soal 9: Susun Kalimat (Guru mengajarkan kami menulis Hanzi.)
    Exercise(
        id = "u11_s5_p1_q9",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Guru mengajarkan kami menulis Hanzi.",
        targetHanzi = "老师 教 我们 写 汉字。",
        targetPinyin = "Lǎoshī jiāo wǒmen xiě Hànzì.",
        wordChips = listOf("老师:lǎoshī", "教:jiāo", "我们:wǒmen", "写:xiě", "汉字:Hànzì", "读:dú"),
        correctAnswer = "老师,教,我们,写,汉字",
        audioToSpeak = "老师教我们写汉字。"
    ),

    // 10. Soal 10: Ketuk Pasangan yang Sesuai (Rangkuman Menulis Hanzi)
    Exercise(
        id = "u11_s5_p1_m10_1",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u11_s5_p1_m10_1", "汉字", "Hànzì", "karakter Hanzi"),
            MatchPairItem("u11_s5_p1_m10_2", "写字", "xiězì", "menulis huruf"),
            MatchPairItem("u11_s5_p1_m10_3", "写汉字", "xiě Hànzì", "menulis Hanzi"),
            MatchPairItem("u11_s5_p1_m10_4", "怎么写", "zěnme xiě", "bagaimana menulisnya")
        )
    )
)

val bab11Stage5Part2Exercises = listOf(
    // 1. Soal 1: Pilihan Gambar (汉语 -> bahasa Mandarin)
    Exercise(
        id = "u11_s5_p2_q1",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "汉语",
        targetPinyin = "Hànyǔ",
        targetTranslation = "bahasa Mandarin",
        correctAnswer = "bahasa Mandarin",
        audioToSpeak = "汉语",
        pictureOptions = listOf(
            PictureOption("u11_s5_p2_opt1", "bahasa Mandarin", "", R.drawable.ic_edu_mandarin_lang, true),
            PictureOption("u11_s5_p2_opt2", "buku pelajaran", "", R.drawable.ic_book_chinese, false),
            PictureOption("u11_s5_p2_opt3", "karakter Hanzi", "", R.drawable.ic_edu_hanzi_char, false),
            PictureOption("u11_s5_p2_opt4", "menulis", "", R.drawable.ic_edu_write, false)
        )
    ),

    // 2. Soal 2: Susun Kalimat (Saya belajar bahasa Mandarin di sekolah.)
    Exercise(
        id = "u11_s5_p2_q2",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Saya belajar Mandarin di sekolah.",
        targetHanzi = "我 在 学校 学习 汉语。",
        targetPinyin = "Wǒ zài xuéxiào xuéxí Hànyǔ.",
        wordChips = listOf("我:wǒ", "在:zài", "学校:xuéxiào", "学习:xuéxí", "汉语:Hànyǔ", "去:qù"),
        correctAnswer = "我,在,学校,学习,汉语",
        audioToSpeak = "我在学校学习汉语。"
    ),

    // 3. Soal 3: Ketuk Pasangan yang Sesuai (Bahasa Mandarin & Bahasa Tionghoa)
    Exercise(
        id = "u11_s5_p2_m3",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u11_s5_p2_m1", "汉语", "Hànyǔ", "bahasa Mandarin (lisan)"),
            MatchPairItem("u11_s5_p2_m2", "中文", "Zhōngwén", "bahasa Mandarin (tulisan/umum)"),
            MatchPairItem("u11_s5_p2_m3", "说汉语", "shuō Hànyǔ", "bicara Mandarin"),
            MatchPairItem("u11_s5_p2_m4", "看中文书", "kàn Zhōngwén shū", "baca buku Mandarin")
        )
    ),

    // 4. Soal 4: Ketik Pinyin (bahasa Mandarin -> Hànyǔ)
    Exercise(
        id = "u11_s5_p2_q4",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "bahasa Mandarin",
        sentenceWithBlank = "汉语 (________)",
        targetHanzi = "汉语",
        targetPinyin = "Hànyǔ",
        correctAnswer = "hanyu",
        keyboardKeys = listOf("h", "a", "n", "y", "u", "e", "i", "o", "b", "d", "g"),
        audioToSpeak = "汉语"
    ),

    // 5. Soal 5: Mendengar Kalimat (Rule 10: illustrationRes = 0)
    Exercise(
        id = "u11_s5_p2_q5",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Apa yang Anda dengar?",
        targetTranslation = "Bahasa Mandarin dia sangat bagus.",
        targetHanzi = "他 的 汉语 很 好。",
        targetPinyin = "Tā de Hànyǔ hěn hǎo.",
        wordChips = listOf("他:tā", "的:de", "汉语:Hànyǔ", "很:hěn", "好:hǎo", "中文:Zhōngwén"),
        correctAnswer = "他,的,汉语,很,好",
        illustrationRes = 0,
        audioToSpeak = "他的汉语很好。"
    ),

    // 6. Soal 6: Pilihan Kalimat
    Exercise(
        id = "u11_s5_p2_q6",
        type = ExerciseType.SENTENCE_CHOICE,
        title = "Pilih terjemahan yang benar",
        targetHanzi = "你 会 说 汉语 吗？",
        targetPinyin = "Nǐ huì shuō Hànyǔ ma?",
        targetTranslation = "Apakah kamu bisa berbicara bahasa Mandarin?",
        correctAnswer = "Nǐ huì shuō Hànyǔ ma?\n你 会 说 汉语 吗？",
        options = listOf(
            "Nǐ huì shuō Hànyǔ ma?\n你 会 说 汉语 吗？",
            "Nǐ huì xiě Hànyǔ ma?\n你 会 写 汉语 吗？",
            "Tā huì shuō Hànyǔ ma?\n他 会 说 汉语 吗？"
        ),
        audioToSpeak = "你会说汉语吗？"
    ),

    // 7. Soal 7: Pilihan Gambar (中文 -> bahasa Mandarin tulisan)
    Exercise(
        id = "u11_s5_p2_q7",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "中文",
        targetPinyin = "Zhōngwén",
        targetTranslation = "bahasa Tionghoa / Mandarin",
        correctAnswer = "bahasa Tionghoa / Mandarin",
        audioToSpeak = "中文",
        pictureOptions = listOf(
            PictureOption("u11_s5_p2_opt7_1", "bahasa Mandarin", "", R.drawable.ic_edu_mandarin_lang, true),
            PictureOption("u11_s5_p2_opt7_2", "buku", "", R.drawable.ic_book_chinese, false),
            PictureOption("u11_s5_p2_opt7_3", "sekolah", "", R.drawable.ic_edu_school, false),
            PictureOption("u11_s5_p2_opt7_4", "mobil", "", R.drawable.ic_trans_car, false)
        )
    ),

    // 8. Soal 8: Ketik Pinyin (bahasa Mandarin tulisan -> Zhōngwén)
    Exercise(
        id = "u11_s5_p2_q8",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "bahasa Mandarin (tulisan)",
        sentenceWithBlank = "中文 (________)",
        targetHanzi = "中文",
        targetPinyin = "Zhōngwén",
        correctAnswer = "zhongwen",
        keyboardKeys = listOf("z", "h", "o", "n", "g", "w", "e", "a", "i", "u", "b"),
        audioToSpeak = "中文"
    ),

    // 9. Soal 9: Susun Kalimat (Saya suka membaca buku bahasa Mandarin.)
    Exercise(
        id = "u11_s5_p2_q9",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Saya suka membaca buku Mandarin.",
        targetHanzi = "我 喜欢 看 中文 书。",
        targetPinyin = "Wǒ xǐhuan kàn Zhōngwén shū.",
        wordChips = listOf("我:wǒ", "喜欢:xǐhuan", "看:kàn", "中文:Zhōngwén", "书:shū", "写:xiě"),
        correctAnswer = "我,喜欢,看,中文,书",
        audioToSpeak = "我喜欢看中文书。"
    ),

    // 10. Soal 10: Ketuk Pasangan yang Sesuai (Rangkuman Bahasa Mandarin)
    Exercise(
        id = "u11_s5_p2_m10_1",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u11_s5_p2_m10_1", "汉语", "Hànyǔ", "bahasa Mandarin"),
            MatchPairItem("u11_s5_p2_m10_2", "中文", "Zhōngwén", "bahasa Tionghoa"),
            MatchPairItem("u11_s5_p2_m10_3", "说汉语", "shuō Hànyǔ", "bicara Mandarin"),
            MatchPairItem("u11_s5_p2_m10_4", "写汉字", "xiě Hànzì", "menulis Hanzi")
        )
    )
)
