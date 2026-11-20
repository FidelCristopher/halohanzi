package com.example.chineselearning.data.repository

import com.example.chineselearning.R
import com.example.chineselearning.data.model.Exercise
import com.example.chineselearning.data.model.ExerciseType
import com.example.chineselearning.data.model.MatchPairItem
import com.example.chineselearning.data.model.PictureOption

val bab25Stage5Part1Exercises = listOf(
    // 1. Soal 1: Pilihan Gambar (运动 -> olahraga kebugaran)
    Exercise(
        id = "u25_s5_p1_q1",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "运动",
        targetPinyin = "yùndòng",
        targetTranslation = "olahraga",
        correctAnswer = "olahraga",
        audioToSpeak = "运动",
        pictureOptions = listOf(
            PictureOption("u25_s5_p1_opt1", "olahraga", "", R.drawable.ic_sport_fitness, true),
            PictureOption("u25_s5_p1_opt2", "lari", "", R.drawable.ic_sport_running, false),
            PictureOption("u25_s5_p1_opt3", "sepak bola", "", R.drawable.ic_sport_soccer, false),
            PictureOption("u25_s5_p1_opt4", "renang", "", R.drawable.ic_sport_swim, false)
        )
    ),

    // 2. Soal 2: Susun Kalimat (Kami setiap akhir pekan pergi bermain sepak bola.)
    Exercise(
        id = "u25_s5_p1_q2",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Kami tiap akhir pekan main bola.",
        targetHanzi = "我们 周末 去 踢 足球。",
        targetPinyin = "Wǒmen zhōumò qù tī zúqiú.",
        wordChips = listOf("我们:wǒmen", "周末:zhōumò", "去:qù", "踢:tī", "足球。:zúqiú.", "买东西:mǎi dōngxi"),
        correctAnswer = "我们,周末,去,踢,足球。",
        audioToSpeak = "我们周末去踢足球。"
    ),

    // 3. Soal 3: Ketuk Pasangan yang Sesuai (Sintesis Olahraga Bola)
    Exercise(
        id = "u25_s5_p1_m3",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u25_s5_p1_m1", "运动", "yùndòng", "olahraga"),
            MatchPairItem("u25_s5_p1_m2", "足球", "zúqiú", "sepak bola"),
            MatchPairItem("u25_s5_p1_m3", "踢球", "tī qiú", "tendang bola"),
            MatchPairItem("u25_s5_p1_m4", "周末", "zhōumò", "akhir pekan")
        )
    ),

    // 4. Soal 4: Ketik Pinyin (olahraga -> yùndòng)
    Exercise(
        id = "u25_s5_p1_q4",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "berolahraga / olahraga",
        sentenceWithBlank = "运动 (________)",
        targetHanzi = "运动",
        targetPinyin = "yùndòng",
        correctAnswer = "yundong",
        keyboardKeys = listOf("y", "u", "n", "d", "o", "g", "a", "e", "i", "b", "h", "j"),
        audioToSpeak = "运动"
    ),

    // 5. Soal 5: Mendengar Kalimat (Rule 10: illustrationRes = 0)
    Exercise(
        id = "u25_s5_p1_q5",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Apa yang Anda dengar?",
        targetTranslation = "Anak-anak laki-laki suka bermain basket.",
        targetHanzi = "男孩子们 喜欢 打 篮球。",
        targetPinyin = "Nánháizimen xǐhuan dǎ lánqiú.",
        wordChips = listOf("男孩子们:nánháizimen", "喜欢:xǐhuan", "打:dǎ", "篮球。:lánqiú.", "跳舞:tiàowǔ"),
        correctAnswer = "男孩子们,喜欢,打,篮球。",
        illustrationRes = 0,
        audioToSpeak = "男孩子们喜欢打篮球。"
    ),

    // 6. Soal 6: Pilihan Kalimat
    Exercise(
        id = "u25_s5_p1_q6",
        type = ExerciseType.SENTENCE_CHOICE,
        title = "Pilih terjemahan yang benar",
        targetHanzi = "我 每天 早上 跑步 半 个 小时。",
        targetPinyin = "Wǒ měitiān zǎoshang pǎobù bàn gè xiǎoshí.",
        targetTranslation = "Saya setiap pagi jogging selama setengah jam.",
        correctAnswer = "Wǒ měitiān zǎoshang pǎobù bàn gè xiǎoshí.\n我 每天 早上 跑步 半 个 小时。",
        options = listOf(
            "Wǒ měitiān zǎoshang pǎobù bàn gè xiǎoshí.\n我 每天 早上 跑步 半 个 小时。",
            "Wǒ měitiān wǎnshang pǎobù yí gè xiǎoshí.\n我 每天 晚上 跑步 一 个 小时。",
            "Tā měitiān zǎoshang yóuyǒng bàn gè xiǎoshí.\n他 每天 早上 游泳 半 个 小时。"
        ),
        audioToSpeak = "我每天早上跑步半个小时。"
    ),

    // 7. Soal 7: Pilihan Gambar (足球 -> sepak bola rumput)
    Exercise(
        id = "u25_s5_p1_q7",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "足球",
        targetPinyin = "zúqiú",
        targetTranslation = "sepak bola",
        correctAnswer = "sepak bola",
        audioToSpeak = "足球",
        pictureOptions = listOf(
            PictureOption("u25_s5_p1_opt7_1", "sepak bola", "", R.drawable.ic_sport_soccer, true),
            PictureOption("u25_s5_p1_opt7_2", "basket", "", R.drawable.ic_sport_basketball, false),
            PictureOption("u25_s5_p1_opt7_3", "menendang bola", "", R.drawable.ic_sport_kick_ball, false),
            PictureOption("u25_s5_p1_opt7_4", "renang", "", R.drawable.ic_sport_swim, false)
        )
    ),

    // 8. Soal 8: Ketik Pinyin (sepak bola -> zúqiú)
    Exercise(
        id = "u25_s5_p1_q8",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "sepak bola",
        sentenceWithBlank = "足球 (________)",
        targetHanzi = "足球",
        targetPinyin = "zúqiú",
        correctAnswer = "zuqiu",
        keyboardKeys = listOf("z", "u", "q", "i", "a", "e", "o", "b", "d", "g", "h", "j"),
        audioToSpeak = "足球"
    ),

    // 9. Soal 9: Susun Kalimat (Berenang membuat tubuh sangat sehat.)
    Exercise(
        id = "u25_s5_p1_q9",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Berenang membuat tubuh sangat sehat.",
        targetHanzi = "游泳 让 身体 很 健康。",
        targetPinyin = "Yóuyǒng ràng shēntǐ hěn jiànkāng.",
        wordChips = listOf("游泳:yóuyǒng", "让:ràng", "身体:shēntǐ", "很:hěn", "健康。:jiànkāng.", "生病:shēngbìng"),
        correctAnswer = "游泳,让,身体,很,健康。",
        audioToSpeak = "游泳让身体很健康。"
    ),

    // 10. Soal 10: Ketuk Pasangan yang Sesuai (Rangkuman Sintesis 1)
    Exercise(
        id = "u25_s5_p1_m10",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u25_s5_p1_m10_1", "踢足球", "tī zúqiú", "main sepak bola"),
            MatchPairItem("u25_s5_p1_m10_2", "打篮球", "dǎ lánqiú", "main basket"),
            MatchPairItem("u25_s5_p1_m10_3", "很健康", "hěn jiànkāng", "sangat sehat"),
            MatchPairItem("u25_s5_p1_m10_4", "去游泳", "qù yóuyǒng", "pergi berenang")
        )
    )
)

val bab25Stage5Part2Exercises = listOf(
    // 1. Soal 1: Pilihan Gambar (篮球 -> bola basket ring)
    Exercise(
        id = "u25_s5_p2_q1",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "篮球",
        targetPinyin = "lánqiú",
        targetTranslation = "bola basket",
        correctAnswer = "bola basket",
        audioToSpeak = "篮球",
        pictureOptions = listOf(
            PictureOption("u25_s5_p2_opt1", "basket", "", R.drawable.ic_sport_basketball, true),
            PictureOption("u25_s5_p2_opt2", "sepak bola", "", R.drawable.ic_sport_soccer, false),
            PictureOption("u25_s5_p2_opt3", "lari", "", R.drawable.ic_sport_running, false),
            PictureOption("u25_s5_p2_opt4", "renang", "", R.drawable.ic_sport_swim, false)
        )
    ),

    // 2. Soal 2: Susun Kalimat (Setelah selesai berolahraga, kami minum air.)
    Exercise(
        id = "u25_s5_p2_q2",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Selesai olahraga kami minum air.",
        targetHanzi = "运动 完 我们 喝 水。",
        targetPinyin = "Yùndòng wán wǒmen hē shuǐ.",
        wordChips = listOf("运动:yùndòng", "完:wán", "我们:wǒmen", "喝:hē", "水。:shuǐ.", "茶:chá"),
        correctAnswer = "运动,完,我们,喝,水。",
        audioToSpeak = "运动完我们喝水。"
    ),

    // 3. Soal 3: Ketuk Pasangan yang Sesuai (Grand Sintesis Bab 25)
    Exercise(
        id = "u25_s5_p2_m3",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u25_s5_p2_m1", "篮球", "lánqiú", "bola basket"),
            MatchPairItem("u25_s5_p2_m2", "游泳", "yóuyǒng", "berenang"),
            MatchPairItem("u25_s5_p2_m3", "跳舞", "tiàowǔ", "menari"),
            MatchPairItem("u25_s5_p2_m4", "跑步", "pǎobù", "jogging")
        )
    ),

    // 4. Soal 4: Ketik Pinyin (bola basket -> lánqiú)
    Exercise(
        id = "u25_s5_p2_q4",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "bola basket",
        sentenceWithBlank = "篮球 (________)",
        targetHanzi = "篮球",
        targetPinyin = "lánqiú",
        correctAnswer = "lanqiu",
        keyboardKeys = listOf("l", "a", "n", "q", "i", "u", "e", "o", "b", "d", "g", "h"),
        audioToSpeak = "篮球"
    ),

    // 5. Soal 5: Mendengar Kalimat (Rule 10: illustrationRes = 0)
    Exercise(
        id = "u25_s5_p2_q5",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Apa yang Anda dengar?",
        targetTranslation = "Menari membuat orang sangat bahagia.",
        targetHanzi = "跳舞 让 人 很 快乐。",
        targetPinyin = "Tiàowǔ ràng rén hěn kuàilè.",
        wordChips = listOf("跳舞:tiàowǔ", "让:ràng", "人:rén", "很:hěn", "快乐。:kuàilè.", "累:lèi"),
        correctAnswer = "跳舞,让,人,很,快乐。",
        illustrationRes = 0,
        audioToSpeak = "跳舞让人快乐。"
    ),

    // 6. Soal 6: Pilihan Kalimat
    Exercise(
        id = "u25_s5_p2_q6",
        type = ExerciseType.SENTENCE_CHOICE,
        title = "Pilih terjemahan yang benar",
        targetHanzi = "我们 大家 一起 运动 吧！",
        targetPinyin = "Wǒmen dàjiā yìqǐ yùndòng ba!",
        targetTranslation = "Ayo kita semua berolahraga bersama!",
        correctAnswer = "Wǒmen dàjiā yìqǐ yùndòng ba!\n我们 大家 一起 运动 吧！",
        options = listOf(
            "Wǒmen dàjiā yìqǐ yùndòng ba!\n我们 大家 一起 运动 吧！",
            "Wǒmen dàjiā yìqǐ shuìjiào ba!\n我们 大家 一起 睡觉 吧！",
            "Tāmen dàjiā yìqǐ yùndòng ba!\n他们 大家 一起 运动 吧！"
        ),
        audioToSpeak = "我们大家一起运动吧！"
    ),

    // 7. Soal 7: Pilihan Gambar (游泳 -> olahraga renang)
    Exercise(
        id = "u25_s5_p2_q7",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "游泳",
        targetPinyin = "yóuyǒng",
        targetTranslation = "berenang",
        correctAnswer = "berenang",
        audioToSpeak = "游泳",
        pictureOptions = listOf(
            PictureOption("u25_s5_p2_opt7_1", "renang", "", R.drawable.ic_sport_swim, true),
            PictureOption("u25_s5_p2_opt7_2", "lari", "", R.drawable.ic_sport_running, false),
            PictureOption("u25_s5_p2_opt7_3", "basket", "", R.drawable.ic_sport_basketball, false),
            PictureOption("u25_s5_p2_opt7_4", "sepak bola", "", R.drawable.ic_sport_soccer, false)
        )
    ),

    // 8. Soal 8: Ketik Pinyin (berenang -> yóuyǒng)
    Exercise(
        id = "u25_s5_p2_q8",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "berenang",
        sentenceWithBlank = "游泳 (________)",
        targetHanzi = "游泳",
        targetPinyin = "yóuyǒng",
        correctAnswer = "youyong",
        keyboardKeys = listOf("y", "o", "u", "n", "g", "a", "e", "i", "b", "d", "h", "j"),
        audioToSpeak = "游泳"
    ),

    // 9. Soal 9: Susun Kalimat (Kebugaran tubuh sangat penting bagi semua orang.)
    Exercise(
        id = "u25_s5_p2_q9",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Kesehatan tubuh sangat penting.",
        targetHanzi = "身体 健康 很 重要。",
        targetPinyin = "Shēntǐ jiànkāng hěn zhòngyào.",
        wordChips = listOf("身体:shēntǐ", "健康:jiànkāng", "很:hěn", "重要。:zhòngyào.", "好:hǎo"),
        correctAnswer = "身体,健康,很,重要。",
        audioToSpeak = "身体健康很重要。"
    ),

    // 10. Soal 10: Ketuk Pasangan yang Sesuai (Grand Review Final Bab 25)
    Exercise(
        id = "u25_s5_p2_m10",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u25_s5_p2_m10_1", "爱运动", "ài yùndòng", "gemar olahraga"),
            MatchPairItem("u25_s5_p2_m10_2", "身体棒", "shēntǐ bàng", "tubuh prima"),
            MatchPairItem("u25_s5_p2_m10_3", "快快跑", "kuàikuài pǎo", "lari kencang"),
            MatchPairItem("u25_s5_p2_m10_4", "多锻炼", "duō duànliàn", "rajin berlatih")
        )
    )
)
