package com.example.chineselearning.data.repository

import com.example.chineselearning.R
import com.example.chineselearning.data.model.Exercise
import com.example.chineselearning.data.model.ExerciseType
import com.example.chineselearning.data.model.MatchPairItem
import com.example.chineselearning.data.model.PictureOption

val bab5Stage1Part1Exercises = listOf(
    // 1. Soal 1: Pilihan Gambar (早上 -> pagi)
    Exercise(
        id = "u5_s1_p1_q1",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "早上",
        targetPinyin = "zǎoshang",
        targetTranslation = "pagi",
        correctAnswer = "pagi",
        audioToSpeak = "早上",
        pictureOptions = listOf(
            PictureOption("u5_s1_p1_opt1", "pagi", "🌅", R.drawable.ic_story_timer, true),
            PictureOption("u5_s1_p1_opt2", "malam", "🌙", R.drawable.ic_book, false),
            PictureOption("u5_s1_p1_opt3", "siang", "☀️", R.drawable.ic_target, false),
            PictureOption("u5_s1_p1_opt4", "sore", "🌇", R.drawable.ic_crown, false)
        )
    ),

    // 2. Soal 2: Susun Kalimat (Selamat pagi guru!)
    Exercise(
        id = "u5_s1_p1_q2",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Selamat pagi guru!",
        targetHanzi = "老师 早上好！",
        targetPinyin = "Lǎoshī zǎoshang hǎo!",
        wordChips = listOf("老师:lǎoshī", "早上好:zǎoshang hǎo", "学生:xuéshēng", "晚上好:wǎnshang hǎo", "再见:zàijiàn"),
        correctAnswer = "老师,早上好",
        audioToSpeak = "老师早上好！"
    ),

    // 3. Soal 3: Ketuk Pasangan yang Sesuai (Waktu Pagi & Siang)
    Exercise(
        id = "u5_s1_p1_q3",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u5_s1_p1_m1", "早上", "zǎoshang", "pagi"),
            MatchPairItem("u5_s1_p1_m2", "上午", "shàngwǔ", "pagi menjelang siang"),
            MatchPairItem("u5_s1_p1_m3", "中午", "zhōngwǔ", "tengah hari / siang"),
            MatchPairItem("u5_s1_p1_m4", "早", "zǎo", "pagi / awal")
        )
    ),

    // 4. Soal 4: Ketik Pinyin (pagi -> zǎoshang)
    Exercise(
        id = "u5_s1_p1_q4",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "pagi hari",
        sentenceWithBlank = "早上 (________)",
        targetHanzi = "早上",
        targetPinyin = "zǎoshang",
        correctAnswer = "zaoshang",
        keyboardKeys = listOf("z", "a", "o", "s", "h", "n", "g", "e", "i", "u", "b"),
        audioToSpeak = "早上"
    ),

    // 5. Soal 5: Mendengar Kalimat (Rule 10: illustrationRes = 0)
    Exercise(
        id = "u5_s1_p1_q5",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Apa yang Anda dengar?",
        targetTranslation = "Besok pagi jam delapan.",
        targetHanzi = "明天 早上 八 点。",
        targetPinyin = "Míngtiān zǎoshang bā diǎn.",
        wordChips = listOf("明天:míngtiān", "早上:zǎoshang", "八:bā", "点:diǎn", "今天:jīntiān", "晚上:wǎnshang"),
        correctAnswer = "明天,早上,八,点",
        illustrationRes = 0,
        audioToSpeak = "明天早上八点。"
    ),

    // 6. Soal 6: Pilihan Kalimat
    Exercise(
        id = "u5_s1_p1_q6",
        type = ExerciseType.SENTENCE_CHOICE,
        title = "Pilih terjemahan yang benar",
        targetHanzi = "中午 十二 点 见。",
        targetPinyin = "Zhōngwǔ shí'èr diǎn jiàn.",
        targetTranslation = "Sampai jumpa tengah hari jam 12.",
        correctAnswer = "Zhōngwǔ shí'èr diǎn jiàn.\n中午 十二 点 见。",
        options = listOf(
            "Zhōngwǔ shí'èr diǎn jiàn.\n中午 十二 点 见。",
            "Zǎoshang shí'èr diǎn jiàn.\n早上 十二 点 见。",
            "Xiàwǔ shí'èr diǎn jiàn.\n下午 十二 点 见。"
        ),
        audioToSpeak = "中午十二点见。"
    ),

    // 7. Soal 7: Pilihan Gambar (中午 -> tengah hari / siang)
    Exercise(
        id = "u5_s1_p1_q7",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "中午",
        targetPinyin = "zhōngwǔ",
        targetTranslation = "tengah hari / siang",
        correctAnswer = "tengah hari / siang",
        audioToSpeak = "中午",
        pictureOptions = listOf(
            PictureOption("u5_s1_p1_opt7_1", "tengah hari / siang", "☀️", R.drawable.ic_story_timer, true),
            PictureOption("u5_s1_p1_opt7_2", "malam", "🌙", R.drawable.ic_crown, false),
            PictureOption("u5_s1_p1_opt7_3", "pagi", "🌅", R.drawable.ic_book, false),
            PictureOption("u5_s1_p1_opt7_4", "subuh", "🌌", R.drawable.ic_target, false)
        )
    ),

    // 8. Soal 8: Ketik Pinyin (tengah hari -> zhōngwǔ)
    Exercise(
        id = "u5_s1_p1_q8",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "tengah hari / siang",
        sentenceWithBlank = "中午 (________)",
        targetHanzi = "中午",
        targetPinyin = "zhōngwǔ",
        correctAnswer = "zhongwu",
        keyboardKeys = listOf("z", "h", "o", "n", "g", "w", "u", "a", "e", "i", "b"),
        audioToSpeak = "中午"
    ),

    // 9. Soal 9: Susun Kalimat (Hari ini jam sembilan pagi.)
    Exercise(
        id = "u5_s1_p1_q9",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Hari ini jam sembilan pagi.",
        targetHanzi = "今天 上午 九 点。",
        targetPinyin = "Jīntiān shàngwǔ jiǔ diǎn.",
        wordChips = listOf("今天:jīntiān", "上午:shàngwǔ", "九:jiǔ", "点:diǎn", "昨天:zuótiān", "晚上:wǎnshang"),
        correctAnswer = "今天,上午,九,点",
        audioToSpeak = "今天上午九点。"
    ),

    // 10. Soal 10: Ketuk Pasangan yang Sesuai (Salam & Waktu)
    Exercise(
        id = "u5_s1_p1_q10",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u5_s1_p1_m10_1", "早上好", "zǎoshang hǎo", "selamat pagi"),
            MatchPairItem("u5_s1_p1_m10_2", "早", "zǎo", "pagi / awal"),
            MatchPairItem("u5_s1_p1_m10_3", "中午", "zhōngwǔ", "tengah hari"),
            MatchPairItem("u5_s1_p1_m10_4", "上午", "shàngwǔ", "pagi menjelang siang")
        )
    )
)

val bab5Stage1Part2Exercises = listOf(
    // 1. Soal 1: Pilihan Gambar (晚上 -> malam)
    Exercise(
        id = "u5_s1_p2_q1",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "晚上",
        targetPinyin = "wǎnshang",
        targetTranslation = "malam",
        correctAnswer = "malam",
        audioToSpeak = "晚上",
        pictureOptions = listOf(
            PictureOption("u5_s1_p2_opt1", "malam", "🌙", R.drawable.ic_story_timer, true),
            PictureOption("u5_s1_p2_opt2", "siang", "☀️", R.drawable.ic_target, false),
            PictureOption("u5_s1_p2_opt3", "pagi", "🌅", R.drawable.ic_book, false),
            PictureOption("u5_s1_p2_opt4", "sore", "🌇", R.drawable.ic_crown, false)
        )
    ),

    // 2. Soal 2: Susun Kalimat (Hari ini jam tiga sore.)
    Exercise(
        id = "u5_s1_p2_q2",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Hari ini jam tiga sore.",
        targetHanzi = "今天 下午 三 点。",
        targetPinyin = "Jīntiān xiàwǔ sān diǎn.",
        wordChips = listOf("今天:jīntiān", "下午:xiàwǔ", "三:sān", "点:diǎn", "明天:míngtiān", "晚上:wǎnshang"),
        correctAnswer = "今天,下午,三,点",
        audioToSpeak = "今天下午三点。"
    ),

    // 3. Soal 3: Ketuk Pasangan yang Sesuai (Sore, Malam & Siang)
    Exercise(
        id = "u5_s1_p2_q3",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u5_s1_p2_m1", "下午", "xiàwǔ", "sore hari"),
            MatchPairItem("u5_s1_p2_m2", "晚上", "wǎnshang", "malam hari"),
            MatchPairItem("u5_s1_p2_m3", "白天", "báitiān", "siang hari (terang)"),
            MatchPairItem("u5_s1_p2_m4", "晚", "wǎn", "terlambat / malam")
        )
    ),

    // 4. Soal 4: Ketik Pinyin (malam -> wǎnshang)
    Exercise(
        id = "u5_s1_p2_q4",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "malam hari",
        sentenceWithBlank = "晚上 (________)",
        targetHanzi = "晚上",
        targetPinyin = "wǎnshang",
        correctAnswer = "wanshang",
        keyboardKeys = listOf("w", "a", "n", "s", "h", "g", "e", "i", "o", "u", "b"),
        audioToSpeak = "晚上"
    ),

    // 5. Soal 5: Mendengar Kalimat (Rule 10: illustrationRes = 0)
    Exercise(
        id = "u5_s1_p2_q5",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Apa yang Anda dengar?",
        targetTranslation = "Malam ini jam delapan.",
        targetHanzi = "今天 晚上 八 点。",
        targetPinyin = "Jīntiān wǎnshang bā diǎn.",
        wordChips = listOf("今天:jīntiān", "晚上:wǎnshang", "八:bā", "点:diǎn", "明天:míngtiān", "早上:zǎoshang"),
        correctAnswer = "今天,晚上,八,点",
        illustrationRes = 0,
        audioToSpeak = "今天晚上八点。"
    ),

    // 6. Soal 6: Pilihan Kalimat
    Exercise(
        id = "u5_s1_p2_q6",
        type = ExerciseType.SENTENCE_CHOICE,
        title = "Pilih terjemahan yang benar",
        targetHanzi = "明天 晚上 见。",
        targetPinyin = "Míngtiān wǎnshang jiàn.",
        targetTranslation = "Sampai jumpa besok malam.",
        correctAnswer = "Míngtiān wǎnshang jiàn.\n明天 晚上 见。",
        options = listOf(
            "Míngtiān wǎnshang jiàn.\n明天 晚上 见。",
            "Jīntiān wǎnshang jiàn.\n今天 晚上 见。",
            "Míngtiān zǎoshang jiàn.\n明天 早上 见。"
        ),
        audioToSpeak = "明天晚上见。"
    ),

    // 7. Soal 7: Pilihan Gambar (下午 -> sore hari)
    Exercise(
        id = "u5_s1_p2_q7",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "下午",
        targetPinyin = "xiàwǔ",
        targetTranslation = "sore hari",
        correctAnswer = "sore hari",
        audioToSpeak = "下午",
        pictureOptions = listOf(
            PictureOption("u5_s1_p2_opt7_1", "sore hari", "🌇", R.drawable.ic_story_timer, true),
            PictureOption("u5_s1_p2_opt7_2", "pagi hari", "🌅", R.drawable.ic_book, false),
            PictureOption("u5_s1_p2_opt7_3", "malam hari", "🌙", R.drawable.ic_crown, false),
            PictureOption("u5_s1_p2_opt7_4", "siang terik", "☀️", R.drawable.ic_target, false)
        )
    ),

    // 8. Soal 8: Ketik Pinyin (sore hari -> xiàwǔ)
    Exercise(
        id = "u5_s1_p2_q8",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "sore hari",
        sentenceWithBlank = "下午 (________)",
        targetHanzi = "下午",
        targetPinyin = "xiàwǔ",
        correctAnswer = "xiawu",
        keyboardKeys = listOf("x", "i", "a", "w", "u", "e", "o", "b", "d", "g", "h"),
        audioToSpeak = "下午"
    ),

    // 9. Soal 9: Susun Kalimat (Siang hari dia pergi ke sekolah.)
    Exercise(
        id = "u5_s1_p2_q9",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Siang hari dia pergi ke sekolah.",
        targetHanzi = "白天 他 去 学校。",
        targetPinyin = "Báitiān tā qù xuéxiào.",
        wordChips = listOf("白天:báitiān", "他:tā", "去:qù", "学校:xuéxiào", "晚上:wǎnshang", "来:lái"),
        correctAnswer = "白天,他,去,学校",
        audioToSpeak = "白天他去学校。"
    ),

    // 10. Soal 10: Ketuk Pasangan yang Sesuai (Rangkuman Segmen Waktu)
    Exercise(
        id = "u5_s1_p2_q10",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u5_s1_p2_m10_1", "下午", "xiàwǔ", "sore"),
            MatchPairItem("u5_s1_p2_m10_2", "晚上", "wǎnshang", "malam"),
            MatchPairItem("u5_s1_p2_m10_3", "白天", "báitiān", "siang hari"),
            MatchPairItem("u5_s1_p2_m10_4", "晚上好", "wǎnshang hǎo", "selamat malam")
        )
    )
)
