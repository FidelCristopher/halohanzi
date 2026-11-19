package com.example.chineselearning.data.repository

import com.example.chineselearning.R
import com.example.chineselearning.data.model.Exercise
import com.example.chineselearning.data.model.ExerciseType
import com.example.chineselearning.data.model.MatchPairItem
import com.example.chineselearning.data.model.PictureOption

val bab11Stage6Part1Exercises = listOf(
    // 1. Soal 1: Pilihan Gambar (学校 -> sekolah)
    Exercise(
        id = "u11_s6_p1_q1",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "学校",
        targetPinyin = "xuéxiào",
        targetTranslation = "sekolah",
        correctAnswer = "sekolah",
        audioToSpeak = "学校",
        pictureOptions = listOf(
            PictureOption("u11_s6_p1_opt1", "sekolah", "", R.drawable.ic_edu_school, true),
            PictureOption("u11_s6_p1_opt2", "rumah", "", R.drawable.ic_fam_home, false),
            PictureOption("u11_s6_p1_opt3", "buku", "", R.drawable.ic_book_chinese, false),
            PictureOption("u11_s6_p1_opt4", "toko", "", R.drawable.ic_shop_store, false)
        )
    ),

    // 2. Soal 2: Susun Kalimat (Saya belajar bahasa Mandarin di universitas.)
    Exercise(
        id = "u11_s6_p1_q2",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Saya belajar Mandarin di universitas.",
        targetHanzi = "我 在 大学 学习 汉语。",
        targetPinyin = "Wǒ zài dàxué xuéxí Hànyǔ.",
        wordChips = listOf("我:wǒ", "在:zài", "大学:dàxué", "学习:xuéxí", "汉语:Hànyǔ", "去:qù"),
        correctAnswer = "我,在,大学,学习,汉语",
        audioToSpeak = "我在大学学习汉语。"
    ),

    // 3. Soal 3: Ketuk Pasangan yang Sesuai (Rangkuman Bab 11 Bagian 1)
    Exercise(
        id = "u11_s6_p1_q3",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u11_s6_p1_m1", "学校", "xuéxiào", "sekolah"),
            MatchPairItem("u11_s6_p1_m2", "大学", "dàxué", "universitas"),
            MatchPairItem("u11_s6_p1_m3", "大学生", "dàxuéshēng", "mahasiswa"),
            MatchPairItem("u11_s6_p1_m4", "学习", "xuéxí", "belajar")
        )
    ),

    // 4. Soal 4: Ketik Pinyin (belajar -> xuéxí)
    Exercise(
        id = "u11_s6_p1_q4",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "belajar",
        sentenceWithBlank = "学习 (________)",
        targetHanzi = "学习",
        targetPinyin = "xuéxí",
        correctAnswer = "xuexi",
        keyboardKeys = listOf("x", "u", "e", "i", "a", "o", "b", "d", "g", "h", "j"),
        audioToSpeak = "学习"
    ),

    // 5. Soal 5: Mendengar Kalimat (Rule 10: illustrationRes = 0)
    Exercise(
        id = "u11_s6_p1_q5",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Apa yang Anda dengar?",
        targetTranslation = "Kami jam delapan pagi masuk kelas.",
        targetHanzi = "我们 早上 八 点 上课。",
        targetPinyin = "Wǒmen zǎoshang bā diǎn shàngkè.",
        wordChips = listOf("我们:wǒmen", "早上:zǎoshang", "八:bā", "点:diǎn", "上课:shàngkè", "下课:xiàkè"),
        correctAnswer = "我们,早上,八,点,上课",
        illustrationRes = 0,
        audioToSpeak = "我们早上八点上课。"
    ),

    // 6. Soal 6: Pilihan Kalimat
    Exercise(
        id = "u11_s6_p1_q6",
        type = ExerciseType.SENTENCE_CHOICE,
        title = "Pilih terjemahan yang benar",
        targetHanzi = "他 是 北京 大学 的 老师。",
        targetPinyin = "Tā shì Běijīng dàxué de lǎoshī.",
        targetTranslation = "Dia adalah dosen Universitas Beijing.",
        correctAnswer = "Tā shì Běijīng dàxué de lǎoshī.\n他 是 北京 大学 的 老师。",
        options = listOf(
            "Tā shì Běijīng dàxué de lǎoshī.\n他 是 北京 大学 的 老师。",
            "Tā shì Běijīng dàxué de xuéshēng.\n他 是 北京 大学 的 学生。",
            "Wǒ shì Běijīng dàxué de lǎoshī.\n我 是 北京 大学 的 老师。"
        ),
        audioToSpeak = "他是北京大学的老师。"
    ),

    // 7. Soal 7: Pilihan Gambar (书店 -> toko buku)
    Exercise(
        id = "u11_s6_p1_q7",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "书店",
        targetPinyin = "shūdiàn",
        targetTranslation = "toko buku",
        correctAnswer = "toko buku",
        audioToSpeak = "书店",
        pictureOptions = listOf(
            PictureOption("u11_s6_p1_opt7_1", "toko buku", "", R.drawable.ic_edu_bookstore, true),
            PictureOption("u11_s6_p1_opt7_2", "sekolah", "", R.drawable.ic_edu_school, false),
            PictureOption("u11_s6_p1_opt7_3", "rumah", "", R.drawable.ic_fam_home, false),
            PictureOption("u11_s6_p1_opt7_4", "toko", "", R.drawable.ic_shop_store, false)
        )
    ),

    // 8. Soal 8: Ketik Pinyin (masuk kelas -> shàngkè)
    Exercise(
        id = "u11_s6_p1_q8",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "masuk kelas",
        sentenceWithBlank = "上课 (________)",
        targetHanzi = "上课",
        targetPinyin = "shàngkè",
        correctAnswer = "shangke",
        keyboardKeys = listOf("s", "h", "a", "n", "g", "k", "e", "i", "o", "u", "b"),
        audioToSpeak = "上课"
    ),

    // 9. Soal 9: Susun Kalimat (Saya membeli sebuah buku di toko buku.)
    Exercise(
        id = "u11_s6_p1_q9",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Saya beli buku di toko buku.",
        targetHanzi = "我 在 书店 买 书。",
        targetPinyin = "Wǒ zài shūdiàn mǎi shū.",
        wordChips = listOf("我:wǒ", "在:zài", "书店:shūdiàn", "买:mǎi", "书:shū", "学校:xuéxiào"),
        correctAnswer = "我,在,书店,买,书",
        audioToSpeak = "我在书店买书。"
    ),

    // 10. Soal 10: Ketuk Pasangan yang Sesuai (Rangkuman Kehidupan Kampus)
    Exercise(
        id = "u11_s6_p1_m10_1",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u11_s6_p1_m10_1", "上课", "shàngkè", "masuk kelas"),
            MatchPairItem("u11_s6_p1_m10_2", "下课", "xiàkè", "selesai kelas"),
            MatchPairItem("u11_s6_p1_m10_3", "一本书", "yì běn shū", "sebuah buku"),
            MatchPairItem("u11_s6_p1_m10_4", "去书店", "qù shūdiàn", "ke toko buku")
        )
    )
)

val bab11Stage6Part2Exercises = listOf(
    // 1. Soal 1: Pilihan Gambar (写汉字 -> menulis Hanzi)
    Exercise(
        id = "u11_s6_p2_q1",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "写汉字",
        targetPinyin = "xiě Hànzì",
        targetTranslation = "menulis aksara Hanzi",
        correctAnswer = "menulis aksara Hanzi",
        audioToSpeak = "写汉字",
        pictureOptions = listOf(
            PictureOption("u11_s6_p2_opt1", "menulis Hanzi", "", R.drawable.ic_edu_hanzi_char, true),
            PictureOption("u11_s6_p2_opt2", "membaca buku", "", R.drawable.ic_action_reading, false),
            PictureOption("u11_s6_p2_opt3", "sekolah", "", R.drawable.ic_edu_school, false),
            PictureOption("u11_s6_p2_opt4", "uang", "", R.drawable.ic_yuan_currency, false)
        )
    ),

    // 2. Soal 2: Susun Kalimat (Saya bisa berbicara bahasa Mandarin.)
    Exercise(
        id = "u11_s6_p2_q2",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Saya bisa bicara bahasa Mandarin.",
        targetHanzi = "我 会 说 汉语。",
        targetPinyin = "Wǒ huì shuō Hànyǔ.",
        wordChips = listOf("我:wǒ", "会:huì", "说:shuō", "汉语:Hànyǔ", "写:xiě", "他:tā"),
        correctAnswer = "我,会,说,汉语",
        audioToSpeak = "我会说汉语。"
    ),

    // 3. Soal 3: Ketuk Pasangan yang Sesuai (Grand Review Bab 11)
    Exercise(
        id = "u11_s6_p2_m3",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u11_s6_p2_m1", "写", "xiě", "menulis"),
            MatchPairItem("u11_s6_p2_m2", "读", "dú", "membaca"),
            MatchPairItem("u11_s6_p2_m3", "汉字", "Hànzì", "karakter Hanzi"),
            MatchPairItem("u11_s6_p2_m4", "汉语", "Hànyǔ", "bahasa Mandarin")
        )
    ),

    // 4. Soal 4: Ketik Pinyin (karakter Hanzi -> Hànzì)
    Exercise(
        id = "u11_s6_p2_q4",
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

    // 5. Soal 5: Mendengar Kalimat (Rule 10: illustrationRes = 0)
    Exercise(
        id = "u11_s6_p2_q5",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Apa yang Anda dengar?",
        targetTranslation = "Dia sangat suka membaca buku bahasa Mandarin.",
        targetHanzi = "他 很 喜欢 看 中文 书。",
        targetPinyin = "Tā hěn xǐhuan kàn Zhōngwén shū.",
        wordChips = listOf("他:tā", "很:hěn", "喜欢:xǐhuan", "看:kàn", "中文:Zhōngwén", "书:shū"),
        correctAnswer = "他,很,喜欢,看,中文,书",
        illustrationRes = 0,
        audioToSpeak = "他很喜欢看中文书。"
    ),

    // 6. Soal 6: Pilihan Kalimat
    Exercise(
        id = "u11_s6_p2_q6",
        type = ExerciseType.SENTENCE_CHOICE,
        title = "Pilih terjemahan yang benar",
        targetHanzi = "我们 都 喜欢 学 汉语。",
        targetPinyin = "Wǒmen dōu xǐhuan xué Hànyǔ.",
        targetTranslation = "Kami semua suka belajar bahasa Mandarin.",
        correctAnswer = "Wǒmen dōu xǐhuan xué Hànyǔ.\n我们 都 喜欢 学 汉语。",
        options = listOf(
            "Wǒmen dōu xǐhuan xué Hànyǔ.\n我们 都 喜欢 学 汉语。",
            "Tāmen dōu xǐhuan xué Hànyǔ.\n他们 都 喜欢 学 汉语。",
            "Wǒmen dōu xǐhuan xiě Hànzì.\n我们 都 喜欢 写 汉字。"
        ),
        audioToSpeak = "我们都喜欢学汉语。"
    ),

    // 7. Soal 7: Pilihan Gambar (读课文 -> membaca)
    Exercise(
        id = "u11_s6_p2_q7",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "读",
        targetPinyin = "dú",
        targetTranslation = "membaca",
        correctAnswer = "membaca",
        audioToSpeak = "读",
        pictureOptions = listOf(
            PictureOption("u11_s6_p2_opt7_1", "membaca", "", R.drawable.ic_edu_read_aloud, true),
            PictureOption("u11_s6_p2_opt7_2", "menulis", "", R.drawable.ic_edu_write, false),
            PictureOption("u11_s6_p2_opt7_3", "tidur", "", R.drawable.ic_action_sleep, false),
            PictureOption("u11_s6_p2_opt7_4", "makan", "", R.drawable.ic_action_eat, false)
        )
    ),

    // 8. Soal 8: Ketik Pinyin (bahasa Mandarin -> Hànyǔ)
    Exercise(
        id = "u11_s6_p2_q8",
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

    // 9. Soal 9: Susun Kalimat (Grand Evaluasi Bab 11)
    Exercise(
        id = "u11_s6_p2_q9",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Saya bisa membaca dan menulis Hanzi.",
        targetHanzi = "我 会 读 也 会 写 汉字。",
        targetPinyin = "Wǒ huì dú yě huì xiě Hànzì.",
        wordChips = listOf("我:wǒ", "会:huì", "读:dú", "也:yě", "写:xiě", "汉字:Hànzì"),
        correctAnswer = "我,会,读,也,会,写,汉字",
        audioToSpeak = "我会读也会写汉字。"
    ),

    // 10. Soal 10: Ketuk Pasangan yang Sesuai (Grand Review Akhir Bab 11)
    Exercise(
        id = "u11_s6_p2_m10_1",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u11_s6_p2_m10_1", "写汉字", "xiě Hànzì", "menulis Hanzi"),
            MatchPairItem("u11_s6_p2_m10_2", "学汉语", "xué Hànyǔ", "belajar Mandarin"),
            MatchPairItem("u11_s6_p2_m10_3", "大学生", "dàxuéshēng", "mahasiswa"),
            MatchPairItem("u11_s6_p2_m10_4", "学校", "xuéxiào", "sekolah")
        )
    )
)
