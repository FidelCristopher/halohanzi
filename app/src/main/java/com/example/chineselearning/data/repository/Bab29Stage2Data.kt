package com.example.chineselearning.data.repository

import com.example.chineselearning.R
import com.example.chineselearning.data.model.Exercise
import com.example.chineselearning.data.model.ExerciseType
import com.example.chineselearning.data.model.MatchPairItem
import com.example.chineselearning.data.model.PictureOption

val bab29Stage2Part1Exercises = listOf(
    // 1. Soal 1: Pilihan Gambar (虽然 -> meskipun / walaupun)
    Exercise(
        id = "u29_s2_p1_q1",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "虽然",
        targetPinyin = "suīrán",
        targetTranslation = "meskipun / walaupun",
        correctAnswer = "meskipun / walaupun",
        audioToSpeak = "虽然",
        pictureOptions = listOf(
            PictureOption("u29_s2_p1_opt1", "pertentangan", "", R.drawable.ic_log_contrast_switch, true),
            PictureOption("u29_s2_p1_opt2", "sebab-akibat", "", R.drawable.ic_log_cause_effect, false),
            PictureOption("u29_s2_p1_opt3", "tanya kenapa", "", R.drawable.ic_log_question_why, false),
            PictureOption("u29_s2_p1_opt4", "sopan", "", R.drawable.ic_etq_formal_bow, false)
        )
    ),

    // 2. Soal 2: Susun Kalimat (Meskipun bahasa Mandarin sulit, tetapi dia belajar dengan riang.)
    Exercise(
        id = "u29_s2_p1_q2",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Meskipun Mandarin sulit, tapi senang belajarnya.",
        targetHanzi = "虽然 汉语 难， 但是 很 快乐。",
        targetPinyin = "Suīrán Hànyǔ nán, dànshì hěn kuàilè.",
        wordChips = listOf("虽然:suīrán", "汉语:Hànyǔ", "难，:nán,", "但是:dànshì", "很:hěn", "快乐。:kuàilè.", "所以:suǒyǐ"),
        correctAnswer = "虽然,汉语,难，,但是,很,快乐。",
        audioToSpeak = "虽然汉语难，但是很快乐。"
    ),

    // 3. Soal 3: Ketuk Pasangan yang Sesuai (Walaupun & Tetapi)
    Exercise(
        id = "u29_s2_p1_q3",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u29_s2_p1_m1", "虽然", "suīrán", "meskipun"),
            MatchPairItem("u29_s2_p1_m2", "但是", "dànshì", "tetapi / namun"),
            MatchPairItem("u29_s2_p1_m3", "虽然难", "suīrán nán", "walau sulit"),
            MatchPairItem("u29_s2_p1_m4", "太贵了", "tài guì le", "terlalu mahal")
        )
    ),

    // 4. Soal 4: Ketik Pinyin (meskipun -> suīrán)
    Exercise(
        id = "u29_s2_p1_q4",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "meskipun / walaupun",
        sentenceWithBlank = "虽然 (________)",
        targetHanzi = "虽然",
        targetPinyin = "suīrán",
        correctAnswer = "suiran",
        keyboardKeys = listOf("s", "u", "i", "r", "a", "n", "e", "o", "b", "d", "g", "h"),
        audioToSpeak = "虽然"
    ),

    // 5. Soal 5: Mendengar Kalimat (Rule 10: illustrationRes = 0)
    Exercise(
        id = "u29_s2_p1_q5",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Apa yang Anda dengar?",
        targetTranslation = "Pakaian ini sangat indah, tetapi terlalu mahal.",
        targetHanzi = "衣服 很 美， 但是 太 贵 了。",
        targetPinyin = "Yīfu hěn měi, dànshì tài guì le.",
        wordChips = listOf("衣服:yīfu", "很:hěn", "美，:měi,", "但是:dànshì", "太:tài", "贵:guì", "了。:le.", "便宜:piányi"),
        correctAnswer = "衣服,很,美，,但是,太,贵,了。",
        illustrationRes = 0,
        audioToSpeak = "衣服很美，但是太贵了。"
    ),

    // 6. Soal 6: Pilihan Kalimat
    Exercise(
        id = "u29_s2_p1_q6",
        type = ExerciseType.SENTENCE_CHOICE,
        title = "Pilih terjemahan yang benar",
        targetHanzi = "他 虽然 小， 但是 很 懂事。",
        targetPinyin = "Tā suīrán xiǎo, dànshì hěn dǒngshì.",
        targetTranslation = "Meskipun dia masih kecil, tetapi sangat bijaksana.",
        correctAnswer = "Tā suīrán xiǎo, dànshì hěn dǒngshì.\n他 虽然 小， 但是 很 懂事。",
        options = listOf(
            "Tā suīrán xiǎo, dànshì hěn dǒngshì.\n他 虽然 小， 但是 很 懂事。",
            "Yīnwèi tā xiǎo, suǒyǐ hěn dǒngshì.\n因为 他 小， 所以 很 懂事。",
            "Tā suīrán dà, dànshì bù dǒngshì.\n他 虽然 大， 但是 不 懂事。"
        ),
        audioToSpeak = "他虽然小，但是很懂事。"
    ),

    // 7. Soal 7: Pilihan Gambar (但是 -> tetapi / switch)
    Exercise(
        id = "u29_s2_p1_q7",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "但是",
        targetPinyin = "dànshì",
        targetTranslation = "tetapi / namun",
        correctAnswer = "tetapi / namun",
        audioToSpeak = "但是",
        pictureOptions = listOf(
            PictureOption("u29_s2_p1_opt7_1", "tetapi", "", R.drawable.ic_log_contrast_switch, true),
            PictureOption("u29_s2_p1_opt7_2", "sebab-akibat", "", R.drawable.ic_log_cause_effect, false),
            PictureOption("u29_s2_p1_opt7_3", "pertanyaan", "", R.drawable.ic_log_question_why, false),
            PictureOption("u29_s2_p1_opt7_4", "salam", "", R.drawable.ic_etq_formal_bow, false)
        )
    ),

    // 8. Soal 8: Ketik Pinyin (tetapi -> dànshì)
    Exercise(
        id = "u29_s2_p1_q8",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "tetapi / namun",
        sentenceWithBlank = "但是 (________)",
        targetHanzi = "但是",
        targetPinyin = "dànshì",
        correctAnswer = "danshi",
        keyboardKeys = listOf("d", "a", "n", "s", "h", "i", "e", "o", "u", "b", "g", "j"),
        audioToSpeak = "但是"
    ),

    // 9. Soal 9: Susun Kalimat (Meskipun di luar dingin, di dalam rumah hangat.)
    Exercise(
        id = "u29_s2_p1_q9",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Walau luar dingin, dalam rumah hangat.",
        targetHanzi = "虽然 外面 冷， 但是 屋里 暖和。",
        targetPinyin = "Suīrán wàimiàn lěng, dànshì wūlǐ nuǎnhuo.",
        wordChips = listOf("虽然:suīrán", "外面:wàimiàn", "冷，:lěng,", "但是:dànshì", "屋里:wūlǐ", "暖和。:nuǎnhuo.", "热:rè"),
        correctAnswer = "虽然,外面,冷，,但是,屋里,暖和。",
        audioToSpeak = "虽然外面冷，但是屋里暖和。"
    ),

    // 10. Soal 10: Ketuk Pasangan yang Sesuai (Rangkuman Hubungan Transisi)
    Exercise(
        id = "u29_s2_p1_m10",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u29_s2_p1_m10_1", "虽然", "suīrán", "kendati"),
            MatchPairItem("u29_s2_p1_m10_2", "但是", "dànshì", "namun"),
            MatchPairItem("u29_s2_p1_m10_3", "屋里暖和", "wūlǐ nuǎnhuo", "dalam rumah hangat"),
            MatchPairItem("u29_s2_p1_m10_4", "外面很冷", "wàimiàn hěn lěng", "di luar dingin")
        )
    )
)

val bab29Stage2Part2Exercises = listOf(
    // 1. Soal 1: Pilihan Gambar (但 -> tetapi ringkas)
    Exercise(
        id = "u29_s2_p2_q1",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "但",
        targetPinyin = "dàn",
        targetTranslation = "tetapi (ringkas)",
        correctAnswer = "tetapi (ringkas)",
        audioToSpeak = "但",
        pictureOptions = listOf(
            PictureOption("u29_s2_p2_opt1", "tetapi", "", R.drawable.ic_log_contrast_switch, true),
            PictureOption("u29_s2_p2_opt2", "sebab-akibat", "", R.drawable.ic_log_cause_effect, false),
            PictureOption("u29_s2_p2_opt3", "kenapa", "", R.drawable.ic_log_question_why, false),
            PictureOption("u29_s2_p2_opt4", "hadiah", "", R.drawable.ic_etq_gift_giving, false)
        )
    ),

    // 2. Soal 2: Susun Kalimat (Saya meskipun lelah, tapi di hati sangat senang.)
    Exercise(
        id = "u29_s2_p2_q2",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Saya walau lelah, tapi hati senang.",
        targetHanzi = "我 虽然 累， 但 心里 高兴。",
        targetPinyin = "Wǒ suīrán lèi, dàn xīnlǐ gāoxìng.",
        wordChips = listOf("我:wǒ", "虽然:suīrán", "累，:lèi,", "但:dàn", "心里:xīnlǐ", "高兴。:gāoxìng.", "难过:nánguò"),
        correctAnswer = "我,虽然,累，,但,心里,高兴。",
        audioToSpeak = "我虽然累，但心里高兴。"
    ),

    // 3. Soal 3: Ketuk Pasangan yang Sesuai (Kontras Ringkas 但)
    Exercise(
        id = "u29_s2_p2_m3",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u29_s2_p2_m1", "但", "dàn", "tapi"),
            MatchPairItem("u29_s2_p2_m2", "虽然", "suīrán", "walaupun"),
            MatchPairItem("u29_s2_p2_m3", "心里高兴", "xīnlǐ gāoxìng", "hati senang"),
            MatchPairItem("u29_s2_p2_m4", "身体累", "shēntǐ lèi", "badan lelah")
        )
    ),

    // 4. Soal 4: Ketik Pinyin (tapi ringkas -> dàn)
    Exercise(
        id = "u29_s2_p2_q4",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "tetapi / namun",
        sentenceWithBlank = "但 (________)",
        targetHanzi = "但",
        targetPinyin = "dàn",
        correctAnswer = "dan",
        keyboardKeys = listOf("d", "a", "n", "e", "i", "o", "u", "b", "g", "h", "j", "l"),
        audioToSpeak = "但"
    ),

    // 5. Soal 5: Mendengar Kalimat (Rule 10: illustrationRes = 0)
    Exercise(
        id = "u29_s2_p2_q5",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Apa yang Anda dengar?",
        targetTranslation = "Saya sangat ingin pergi, tapi tidak ada waktu.",
        targetHanzi = "我 很 想 去， 但 没 时间。",
        targetPinyin = "Wǒ hěn xiǎng qù, dàn méi shíjiān.",
        wordChips = listOf("我:wǒ", "很:hěn", "想:xiǎng", "去，:qù,", "但:dàn", "没:méi", "时间。:shíjiān.", "有:yǒu"),
        correctAnswer = "我,很,想,去，,但,没,时间。",
        illustrationRes = 0,
        audioToSpeak = "我很想去，但没时间。"
    ),

    // 6. Soal 6: Pilihan Kalimat
    Exercise(
        id = "u29_s2_p2_q6",
        type = ExerciseType.SENTENCE_CHOICE,
        title = "Pilih terjemahan yang benar",
        targetHanzi = "这 题 很 难， 但 我 懂 了。",
        targetPinyin = "Zhè tí hěn nán, dàn wǒ dǒng le.",
        targetTranslation = "Soal ini sangat sulit, tapi saya sudah mengerti.",
        correctAnswer = "Zhè tí hěn nán, dàn wǒ dǒng le.\n这 题 很 难， 但 我 懂 了。",
        options = listOf(
            "Zhè tí hěn nán, dàn wǒ dǒng le.\n这 题 很 难， 但 我 懂 了。",
            "Zhè tí hěn róngyì, wǒ dǒng le.\n这 题 很 容易， 我 懂 了。",
            "Zhè tí hěn nán, wǒ bù dǒng.\n这 题 很 难， 我 不 懂。"
        ),
        audioToSpeak = "这题很难，但我懂了。"
    ),

    // 7. Soal 7: Pilihan Gambar (但是 -> peralihan kontras)
    Exercise(
        id = "u29_s2_p2_q7",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "但是",
        targetPinyin = "dànshì",
        targetTranslation = "tetapi",
        correctAnswer = "tetapi",
        audioToSpeak = "但是",
        pictureOptions = listOf(
            PictureOption("u29_s2_p2_opt7_1", "kontras tapi", "", R.drawable.ic_log_contrast_switch, true),
            PictureOption("u29_s2_p2_opt7_2", "sebab akibat", "", R.drawable.ic_log_cause_effect, false),
            PictureOption("u29_s2_p2_opt7_3", "tanya kenapa", "", R.drawable.ic_log_question_why, false),
            PictureOption("u29_s2_p2_opt7_4", "hadiah", "", R.drawable.ic_etq_gift_giving, false)
        )
    ),

    // 8. Soal 8: Ketik Pinyin (sangat sulit -> hěnnán)
    Exercise(
        id = "u29_s2_p2_q8",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "sangat sulit",
        sentenceWithBlank = "很难 (________)",
        targetHanzi = "很难",
        targetPinyin = "hěnnán",
        correctAnswer = "hennan",
        keyboardKeys = listOf("h", "e", "n", "a", "i", "o", "u", "b", "d", "g", "j", "l"),
        audioToSpeak = "很难"
    ),

    // 9. Soal 9: Susun Kalimat (Masakan ini enak tapi agak mahal.)
    Exercise(
        id = "u29_s2_p2_q9",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Masakan ini enak tapi agak mahal.",
        targetHanzi = "菜 好吃， 但 有点 贵。",
        targetPinyin = "Cài hǎochī, dàn yǒudiǎn guì.",
        wordChips = listOf("菜:cài", "好吃，:hǎochī,", "但:dàn", "有点:yǒudiǎn", "贵。:guì.", "便宜:piányi"),
        correctAnswer = "菜,好吃，,但,有点,贵。",
        audioToSpeak = "菜好吃，但有点贵。"
    ),

    // 10. Soal 10: Ketuk Pasangan yang Sesuai (Rangkuman Kontras Sifat)
    Exercise(
        id = "u29_s2_p2_m10",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u29_s2_p2_m10_1", "但有点贵", "dàn yǒudiǎn guì", "tapi agak mahal"),
            MatchPairItem("u29_s2_p2_m10_2", "但没时间", "dàn méi shíjiān", "tapi tak ada waktu"),
            MatchPairItem("u29_s2_p2_m3", "菜好吃", "cài hǎochī", "masakan sedap"),
            MatchPairItem("u29_s2_p2_m4", "我很想", "wǒ hěn xiǎng", "saya ingin")
        )
    )
)
