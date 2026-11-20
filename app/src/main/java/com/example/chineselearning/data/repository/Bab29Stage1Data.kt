package com.example.chineselearning.data.repository

import com.example.chineselearning.R
import com.example.chineselearning.data.model.Exercise
import com.example.chineselearning.data.model.ExerciseType
import com.example.chineselearning.data.model.MatchPairItem
import com.example.chineselearning.data.model.PictureOption

val bab29Stage1Part1Exercises = listOf(
    // 1. Soal 1: Pilihan Gambar (因为 -> karena / sebab)
    Exercise(
        id = "u29_s1_p1_q1",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "因为",
        targetPinyin = "yīnwèi",
        targetTranslation = "karena / sebab",
        correctAnswer = "karena / sebab",
        audioToSpeak = "因为",
        pictureOptions = listOf(
            PictureOption("u29_s1_p1_opt1", "sebab-akibat", "", R.drawable.ic_log_cause_effect, true),
            PictureOption("u29_s1_p1_opt2", "pertentangan", "", R.drawable.ic_log_contrast_switch, false),
            PictureOption("u29_s1_p1_opt3", "mengapa", "", R.drawable.ic_log_question_why, false),
            PictureOption("u29_s1_p1_opt4", "sopan", "", R.drawable.ic_etq_formal_bow, false)
        )
    ),

    // 2. Soal 2: Susun Kalimat (Karena jatuh sakit, maka dia tidak datang masuk kelas.)
    Exercise(
        id = "u29_s1_p1_q2",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Karena sakit, maka dia tidak masuk.",
        targetHanzi = "因为 生病， 所以 他 没 来。",
        targetPinyin = "Yīnwèi shēngbìng, suǒyǐ tā méi lái.",
        wordChips = listOf("因为:yīnwèi", "生病，:shēngbìng,", "所以:suǒyǐ", "他:tā", "没:méi", "来。:lái.", "虽然:suīrán"),
        correctAnswer = "因为,生病，,所以,他,没,来。",
        audioToSpeak = "因为生病，所以他没来。"
    ),

    // 3. Soal 3: Ketuk Pasangan yang Sesuai (Sebab & Akibat)
    Exercise(
        id = "u29_s1_p1_q3",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u29_s1_p1_m1", "因为", "yīnwèi", "karena"),
            MatchPairItem("u29_s1_p1_m2", "所以", "suǒyǐ", "maka / oleh karena itu"),
            MatchPairItem("u29_s1_p1_m3", "因为下雨", "yīnwèi xiàyǔ", "karena hujan"),
            MatchPairItem("u29_s1_p1_m4", "没来", "méi lái", "tidak datang")
        )
    ),

    // 4. Soal 4: Ketik Pinyin (karena -> yīnwèi)
    Exercise(
        id = "u29_s1_p1_q4",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "karena / sebab",
        sentenceWithBlank = "因为 (________)",
        targetHanzi = "因为",
        targetPinyin = "yīnwèi",
        correctAnswer = "yinwei",
        keyboardKeys = listOf("y", "i", "n", "w", "e", "a", "o", "u", "b", "d", "g", "h"),
        audioToSpeak = "因为"
    ),

    // 5. Soal 5: Mendengar Kalimat (Rule 10: illustrationRes = 0)
    Exercise(
        id = "u29_s1_p1_q5",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Apa yang Anda dengar?",
        targetTranslation = "Karena turun hujan, maka kami tidak pergi keluar.",
        targetHanzi = "因为 下雨， 所以 我们 没 出去。",
        targetPinyin = "Yīnwèi xiàyǔ, suǒyǐ wǒmen méi chūqù.",
        wordChips = listOf("因为:yīnwèi", "下雨，:xiàyǔ,", "所以:suǒyǐ", "我们:wǒmen", "没:méi", "出去。:chūqù.", "但是:dànshì"),
        correctAnswer = "因为,下雨，,所以,我们,没,出去。",
        illustrationRes = 0,
        audioToSpeak = "因为下雨，所以我们没出去。"
    ),

    // 6. Soal 6: Pilihan Kalimat
    Exercise(
        id = "u29_s1_p1_q6",
        type = ExerciseType.SENTENCE_CHOICE,
        title = "Pilih terjemahan yang benar",
        targetHanzi = "因为 喜欢， 所以 我 买 了。",
        targetPinyin = "Yīnwèi xǐhuan, suǒyǐ wǒ mǎi le.",
        targetTranslation = "Karena suka, maka saya membelinya.",
        correctAnswer = "Yīnwèi xǐhuan, suǒyǐ wǒ mǎi le.\n因为 喜欢， 所以 我 买 了。",
        options = listOf(
            "Yīnwèi xǐhuan, suǒyǐ wǒ mǎi le.\n因为 喜欢， 所以 我 买 了。",
            "Suīrán xǐhuan, dànshì wǒ méi mǎi.\n虽然 喜欢， 但是 我 没 买。",
            "Yīnwèi tài guì, suǒyǐ wǒ méi mǎi.\n因为 太 贵， 所以 我 没 买。"
        ),
        audioToSpeak = "因为喜欢，所以我买了。"
    ),

    // 7. Soal 7: Pilihan Gambar (所以 -> oleh karena itu)
    Exercise(
        id = "u29_s1_p1_q7",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "所以",
        targetPinyin = "suǒyǐ",
        targetTranslation = "oleh karena itu",
        correctAnswer = "oleh karena itu",
        audioToSpeak = "所以",
        pictureOptions = listOf(
            PictureOption("u29_s1_p1_opt7_1", "maka", "", R.drawable.ic_log_cause_effect, true),
            PictureOption("u29_s1_p1_opt7_2", "tetapi", "", R.drawable.ic_log_contrast_switch, false),
            PictureOption("u29_s1_p1_opt7_3", "tanya kenapa", "", R.drawable.ic_log_question_why, false),
            PictureOption("u29_s1_p1_opt7_4", "hadiah", "", R.drawable.ic_etq_gift_giving, false)
        )
    ),

    // 8. Soal 8: Ketik Pinyin (maka/oleh karena itu -> suǒyǐ)
    Exercise(
        id = "u29_s1_p1_q8",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "maka / oleh karena itu",
        sentenceWithBlank = "所以 (________)",
        targetHanzi = "所以",
        targetPinyin = "suǒyǐ",
        correctAnswer = "suoyi",
        keyboardKeys = listOf("s", "u", "o", "y", "i", "a", "e", "b", "d", "g", "h", "j"),
        audioToSpeak = "所以"
    ),

    // 9. Soal 9: Susun Kalimat (Karena dia sangat lelah, maka tidur lebih awal.)
    Exercise(
        id = "u29_s1_p1_q9",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Karena lelah, maka tidur cepat.",
        targetHanzi = "因为 太 累， 所以 睡 得 早。",
        targetPinyin = "Yīnwèi tài lèi, suǒyǐ shuì de zǎo.",
        wordChips = listOf("因为:yīnwèi", "太:tài", "累，:lèi,", "所以:suǒyǐ", "睡:shuì", "得:de", "早。:zǎo.", "晚:wǎn"),
        correctAnswer = "因为,太,累，,所以,睡,得,早。",
        audioToSpeak = "因为太累，所以睡得早。"
    ),

    // 10. Soal 10: Ketuk Pasangan yang Sesuai (Rangkuman Pasangan Sebab-Akibat)
    Exercise(
        id = "u29_s1_p1_m10",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u29_s1_p1_m10_1", "因为", "yīnwèi", "sebab"),
            MatchPairItem("u29_s1_p1_m10_2", "所以", "suǒyǐ", "maka"),
            MatchPairItem("u29_s1_p1_m10_3", "因为想吃", "yīnwèi xiǎng chī", "karena mau makan"),
            MatchPairItem("u29_s1_p1_m10_4", "所以做饭", "suǒyǐ zuòfàn", "maka memasak")
        )
    )
)

val bab29Stage1Part2Exercises = listOf(
    // 1. Soal 1: Pilihan Gambar (为什么 -> mengapa / kenapa)
    Exercise(
        id = "u29_s1_p2_q1",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "为什么",
        targetPinyin = "wèishénme",
        targetTranslation = "mengapa / kenapa",
        correctAnswer = "mengapa / kenapa",
        audioToSpeak = "为什么",
        pictureOptions = listOf(
            PictureOption("u29_s1_p2_opt1", "mengapa", "", R.drawable.ic_log_question_why, true),
            PictureOption("u29_s1_p2_opt2", "sebab-akibat", "", R.drawable.ic_log_cause_effect, false),
            PictureOption("u29_s1_p2_opt3", "pertentangan", "", R.drawable.ic_log_contrast_switch, false),
            PictureOption("u29_s1_p2_opt4", "sopan santun", "", R.drawable.ic_etq_formal_bow, false)
        )
    ),

    // 2. Soal 2: Susun Kalimat (Mengapa hari ini kamu datang begitu terlambat?)
    Exercise(
        id = "u29_s1_p2_q2",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Kenapa kamu datang begitu terlambat?",
        targetHanzi = "你 为什么 来 得 这么 晚？",
        targetPinyin = "Nǐ wèishénme lái de zhème wǎn?",
        wordChips = listOf("你:nǐ", "为什么:wèishénme", "来:lái", "得:de", "这么:zhème", "晚？:wǎn?", "早:zǎo"),
        correctAnswer = "你,为什么,来,得,这么,晚？",
        audioToSpeak = "你为什么来得这么晚？"
    ),

    // 3. Soal 3: Ketuk Pasangan yang Sesuai (Menanyakan Alasan)
    Exercise(
        id = "u29_s1_p2_m3",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u29_s1_p2_m1", "为什么", "wèishénme", "mengapa"),
            MatchPairItem("u29_s1_p2_m2", "怎么了", "zěnme le", "ada apa"),
            MatchPairItem("u29_s1_p2_m3", "学中文", "xué Zhōngwén", "belajar Mandarin"),
            MatchPairItem("u29_s1_p2_m4", "因为喜欢", "yīnwèi xǐhuan", "karena suka")
        )
    ),

    // 4. Soal 4: Ketik Pinyin (mengapa -> wèishénme)
    Exercise(
        id = "u29_s1_p2_q4",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "mengapa / kenapa",
        sentenceWithBlank = "为什么 (________)",
        targetHanzi = "为什么",
        targetPinyin = "wèishénme",
        correctAnswer = "weishenme",
        keyboardKeys = listOf("w", "e", "i", "s", "h", "n", "m", "a", "o", "u", "b", "d"),
        audioToSpeak = "为什么"
    ),

    // 5. Soal 5: Mendengar Kalimat (Rule 10: illustrationRes = 0)
    Exercise(
        id = "u29_s1_p2_q5",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Apa yang Anda dengar?",
        targetTranslation = "Kenapa kamu tidak meminum obat?",
        targetHanzi = "你 为什么 不 吃 药？",
        targetPinyin = "Nǐ wèishénme bù chī yào?",
        wordChips = listOf("你:nǐ", "为什么:wèishénme", "不:bù", "吃:chī", "药？:yào?", "饭:fàn"),
        correctAnswer = "你,为什么,不,吃,药？",
        illustrationRes = 0,
        audioToSpeak = "你为什么不吃药？"
    ),

    // 6. Soal 6: Pilihan Kalimat
    Exercise(
        id = "u29_s1_p2_q6",
        type = ExerciseType.SENTENCE_CHOICE,
        title = "Pilih terjemahan yang benar",
        targetHanzi = "你 为什么 想 学 汉语？",
        targetPinyin = "Nǐ wèishénme xiǎng xué Hànyǔ?",
        targetTranslation = "Mengapa kamu ingin belajar bahasa Mandarin?",
        correctAnswer = "Nǐ wèishénme xiǎng xué Hànyǔ?\n你 为什么 想 学 汉语？",
        options = listOf(
            "Nǐ wèishénme xiǎng xué Hànyǔ?\n你 为什么 想 学 汉语？",
            "Nǐ zài nǎlǐ xué Hànyǔ?\n你 在 哪里 学 汉语？",
            "Tā wèishénme xiǎng xué Hànyǔ?\n他 为什么 想 学 汉语？"
        ),
        audioToSpeak = "你为什么想学汉语？"
    ),

    // 7. Soal 7: Pilihan Gambar (为什么 -> tanda tanya kenapa)
    Exercise(
        id = "u29_s1_p2_q7",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "为什么",
        targetPinyin = "wèishénme",
        targetTranslation = "kenapa",
        correctAnswer = "kenapa",
        audioToSpeak = "为什么",
        pictureOptions = listOf(
            PictureOption("u29_s1_p2_opt7_1", "kenapa", "", R.drawable.ic_log_question_why, true),
            PictureOption("u29_s1_p2_opt7_2", "sebab-akibat", "", R.drawable.ic_log_cause_effect, false),
            PictureOption("u29_s1_p2_opt7_3", "pertentangan", "", R.drawable.ic_log_contrast_switch, false),
            PictureOption("u29_s1_p2_opt7_4", "bow", "", R.drawable.ic_etq_formal_bow, false)
        )
    ),

    // 8. Soal 8: Ketik Pinyin (mengapa -> wèishénme)
    Exercise(
        id = "u29_s1_p2_q8",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "mengapa",
        sentenceWithBlank = "为什么 (________)",
        targetHanzi = "为什么",
        targetPinyin = "wèishénme",
        correctAnswer = "weishenme",
        keyboardKeys = listOf("w", "e", "i", "s", "h", "n", "m", "a", "o", "u", "b", "d"),
        audioToSpeak = "为什么"
    ),

    // 9. Soal 9: Susun Kalimat (Mengapa hari ini di toko tidak ada orang?)
    Exercise(
        id = "u29_s1_p2_q9",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Kenapa di toko tidak ada orang?",
        targetHanzi = "商店 为什么 没有 人？",
        targetPinyin = "Shāngdiàn wèishénme méiyǒu rén?",
        wordChips = listOf("商店:shāngdiàn", "为什么:wèishénme", "没有:méiyǒu", "人？:rén?", "很多:hěn duō"),
        correctAnswer = "商店,为什么,没有,人？",
        audioToSpeak = "商店为什么没有人？"
    ),

    // 10. Soal 10: Ketuk Pasangan yang Sesuai (Rangkuman Pertanyaan Alasan)
    Exercise(
        id = "u29_s1_p2_m10",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u29_s1_p2_m10_1", "为什么", "wèishénme", "kenapa"),
            MatchPairItem("u29_s1_p2_m10_2", "没有去", "méiyǒu qù", "tidak pergi"),
            MatchPairItem("u29_s1_p2_m10_3", "为什么笑", "wèishénme xiào", "kenapa tertawa"),
            MatchPairItem("u29_s1_p2_m10_4", "迟到了", "chídào le", "terlambat")
        )
    )
)
