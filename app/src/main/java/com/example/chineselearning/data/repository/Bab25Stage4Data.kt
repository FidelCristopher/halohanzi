package com.example.chineselearning.data.repository

import com.example.chineselearning.R
import com.example.chineselearning.data.model.Exercise
import com.example.chineselearning.data.model.ExerciseType
import com.example.chineselearning.data.model.MatchPairItem
import com.example.chineselearning.data.model.PictureOption

val bab25Stage4Part1Exercises = listOf(
    // 1. Soal 1: Pilihan Gambar (起来 -> bangun / bangkit)
    Exercise(
        id = "u25_s4_p1_q1",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "起来",
        targetPinyin = "qǐlái",
        targetTranslation = "bangun / bangkit",
        correctAnswer = "bangun / bangkit",
        audioToSpeak = "起来",
        pictureOptions = listOf(
            PictureOption("u25_s4_p1_opt1", "bangun", "", R.drawable.ic_sport_fitness, true),
            PictureOption("u25_s4_p1_opt2", "lari", "", R.drawable.ic_sport_running, false),
            PictureOption("u25_s4_p1_opt3", "sepak bola", "", R.drawable.ic_sport_soccer, false),
            PictureOption("u25_s4_p1_opt4", "renang", "", R.drawable.ic_sport_swim, false)
        )
    ),

    // 2. Soal 2: Susun Kalimat (Pukul tujuh pagi saya sudah bangun dari tempat tidur.)
    Exercise(
        id = "u25_s4_p1_q2",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Pukul tujuh pagi saya sudah bangun.",
        targetHanzi = "早上 七点 我 就 起来 了。",
        targetPinyin = "Zǎoshang qīdiǎn wǒ jiù qǐlái le.",
        wordChips = listOf("早上:zǎoshang", "七点:qīdiǎn", "我:wǒ", "就:jiù", "起来:qǐlái", "了。:le.", "睡觉:shuìjiào"),
        correctAnswer = "早上,七点,我,就,起来,了。",
        audioToSpeak = "早上七点我就起来了。"
    ),

    // 3. Soal 3: Ketuk Pasangan yang Sesuai (Bangun & Bergerak)
    Exercise(
        id = "u25_s4_p1_q3",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u25_s4_p1_m1", "起来", "qǐlái", "bangun / bangkit"),
            MatchPairItem("u25_s4_p1_m2", "动", "dòng", "bergerak"),
            MatchPairItem("u25_s4_p1_m3", "站起来", "zhàn qǐlai", "berdiri"),
            MatchPairItem("u25_s4_p1_m4", "动一动", "dòng yi dòng", "bergerak sedikit")
        )
    ),

    // 4. Soal 4: Ketik Pinyin (bangun -> qǐlái)
    Exercise(
        id = "u25_s4_p1_q4",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "bangun / bangkit",
        sentenceWithBlank = "起来 (________)",
        targetHanzi = "起来",
        targetPinyin = "qǐlái",
        correctAnswer = "qilai",
        keyboardKeys = listOf("q", "i", "l", "a", "e", "o", "u", "b", "d", "g", "h", "j"),
        audioToSpeak = "起来"
    ),

    // 5. Soal 5: Mendengar Kalimat (Rule 10: illustrationRes = 0)
    Exercise(
        id = "u25_s4_p1_q5",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Apa yang Anda dengar?",
        targetTranslation = "Cuaca terlalu dingin, tangan sampai hampir tidak bisa digerakkan.",
        targetHanzi = "太 冷 了， 动 不 了 了。",
        targetPinyin = "Tài lěng le, dòng bù liǎo le.",
        wordChips = listOf("太:tài", "冷:lěng", "了，:le,", "动:dòng", "不:bù", "了:liǎo", "了。:le.", "热:rè"),
        correctAnswer = "太,冷,了，,动,不,了,了。",
        illustrationRes = 0,
        audioToSpeak = "太冷了，动不了了。"
    ),

    // 6. Soal 6: Pilihan Kalimat
    Exercise(
        id = "u25_s4_p1_q6",
        type = ExerciseType.SENTENCE_CHOICE,
        title = "Pilih terjemahan yang benar",
        targetHanzi = "别 坐 着， 快 起来 动 一 动！",
        targetPinyin = "Bié zuò zhe, kuài qǐlái dòng yi dòng!",
        targetTranslation = "Jangan duduk terus, cepat bangun dan bergerak sedikit!",
        correctAnswer = "Bié zuò zhe, kuài qǐlái dòng yi dòng!\n别 坐 着， 快 起来 动 一 动！",
        options = listOf(
            "Bié zuò zhe, kuài qǐlái dòng yi dòng!\n别 坐 着， 快 起来 动 一 动！",
            "Bié zhàn zhe, kuài zuò xià ba!\n别 站 着， 快 坐 下 吧！",
            "Kuài shuìjiào ba, bié dòng le!\n快 睡觉 吧， 别 动 了！"
        ),
        audioToSpeak = "别坐着，快起来动一动！"
    ),

    // 7. Soal 7: Pilihan Gambar (动 -> bergerak)
    Exercise(
        id = "u25_s4_p1_q7",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "动",
        targetPinyin = "dòng",
        targetTranslation = "bergerak",
        correctAnswer = "bergerak",
        audioToSpeak = "动",
        pictureOptions = listOf(
            PictureOption("u25_s4_p1_opt7_1", "bergerak", "", R.drawable.ic_sport_fitness, true),
            PictureOption("u25_s4_p1_opt7_2", "lari", "", R.drawable.ic_sport_running, false),
            PictureOption("u25_s4_p1_opt7_3", "basket", "", R.drawable.ic_sport_basketball, false),
            PictureOption("u25_s4_p1_opt7_4", "renang", "", R.drawable.ic_sport_swim, false)
        )
    ),

    // 8. Soal 8: Ketik Pinyin (bergerak -> dòng)
    Exercise(
        id = "u25_s4_p1_q8",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "bergerak",
        sentenceWithBlank = "动 (________)",
        targetHanzi = "动",
        targetPinyin = "dòng",
        correctAnswer = "dong",
        keyboardKeys = listOf("d", "o", "n", "g", "a", "e", "i", "u", "b", "h", "j", "l"),
        audioToSpeak = "动"
    ),

    // 9. Soal 9: Susun Kalimat (Silakan para hadirin berdiri.)
    Exercise(
        id = "u25_s4_p1_q9",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Silakan semua berdiri.",
        targetHanzi = "请 大家 站 起来。",
        targetPinyin = "Qǐng dàjiā zhàn qǐlai.",
        wordChips = listOf("请:qǐng", "大家:dàjiā", "站:zhàn", "起来。:qǐlai.", "坐下:zuòxià"),
        correctAnswer = "请,大家,站,起来。",
        audioToSpeak = "请大家站起来。"
    ),

    // 10. Soal 10: Ketuk Pasangan yang Sesuai (Rangkuman Bangkit & Bergerak)
    Exercise(
        id = "u25_s4_p1_m10",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u25_s4_p1_m10_1", "起来", "qǐlái", "bangun"),
            MatchPairItem("u25_s4_p1_m10_2", "动", "dòng", "bergerak"),
            MatchPairItem("u25_s4_p1_m10_3", "站起来", "zhàn qǐlai", "bangkit berdiri"),
            MatchPairItem("u25_s4_p1_m10_4", "起得早", "qǐ de zǎo", "bangun pagi")
        )
    )
)

val bab25Stage4Part2Exercises = listOf(
    // 1. Soal 1: Pilihan Gambar (身体 -> tubuh / kesehatan)
    Exercise(
        id = "u25_s4_p2_q1",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "身体",
        targetPinyin = "shēntǐ",
        targetTranslation = "tubuh / kesehatan",
        correctAnswer = "tubuh / kesehatan",
        audioToSpeak = "身体",
        pictureOptions = listOf(
            PictureOption("u25_s4_p2_opt1", "tubuh sehat", "", R.drawable.ic_sport_fitness, true),
            PictureOption("u25_s4_p2_opt2", "lelah", "", R.drawable.ic_sport_running, false),
            PictureOption("u25_s4_p2_opt3", "renang", "", R.drawable.ic_sport_swim, false),
            PictureOption("u25_s4_p2_opt4", "sepak bola", "", R.drawable.ic_sport_soccer, false)
        )
    ),

    // 2. Soal 2: Susun Kalimat (Akhir-akhir ini pekerjaan sangat sibuk, Anda harus menjaga kesehatan tubuh.)
    Exercise(
        id = "u25_s4_p2_q2",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Kamu harus menjaga kesehatan tubuh.",
        targetHanzi = "你 要 保重 身体。",
        targetPinyin = "Nǐ yào bǎozhòng shēntǐ.",
        wordChips = listOf("你:nǐ", "要:yào", "保重:bǎozhòng", "身体。:shēntǐ.", "休息:xiūxi"),
        correctAnswer = "你,要,保重,身体。",
        audioToSpeak = "你要保重身体。"
    ),

    // 3. Soal 3: Ketuk Pasangan yang Sesuai (Tubuh & Lelah)
    Exercise(
        id = "u25_s4_p2_m3",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u25_s4_p2_m1", "身体", "shēntǐ", "tubuh / kesehatan"),
            MatchPairItem("u25_s4_p2_m2", "累", "lèi", "lelah / capek"),
            MatchPairItem("u25_s4_p2_m3", "太累了", "tài lèi le", "terlalu lelah"),
            MatchPairItem("u25_s4_p2_m4", "身体好", "shēntǐ hǎo", "sehat walafiat")
        )
    ),

    // 4. Soal 4: Ketik Pinyin (tubuh/kesehatan -> shēntǐ)
    Exercise(
        id = "u25_s4_p2_q4",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "tubuh / kesehatan",
        sentenceWithBlank = "身体 (________)",
        targetHanzi = "身体",
        targetPinyin = "shēntǐ",
        correctAnswer = "shenti",
        keyboardKeys = listOf("s", "h", "e", "n", "t", "i", "a", "o", "u", "b", "d", "g"),
        audioToSpeak = "身体"
    ),

    // 5. Soal 5: Mendengar Kalimat (Rule 10: illustrationRes = 0)
    Exercise(
        id = "u25_s4_p2_q5",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Apa yang Anda dengar?",
        targetTranslation = "Hari ini berjalan dua puluh ribu langkah, sungguh capek!",
        targetHanzi = "今天 走 了 两万 步， 真 累！",
        targetPinyin = "Jīntiān zǒu le liǎngwàn bù, zhēn lèi!",
        wordChips = listOf("今天:jīntiān", "走:zǒu", "了:le", "两万:liǎngwàn", "步，:bù,", "真:zhēn", "累！:lèi!", "高兴:gāoxìng"),
        correctAnswer = "今天,走,了,两万,步，,真,累！",
        illustrationRes = 0,
        audioToSpeak = "今天走了两万步，真累！"
    ),

    // 6. Soal 6: Pilihan Kalimat
    Exercise(
        id = "u25_s4_p2_q6",
        type = ExerciseType.SENTENCE_CHOICE,
        title = "Pilih terjemahan yang benar",
        targetHanzi = "虽然 很 累， 但 我 心里 很 高兴。",
        targetPinyin = "Suīrán hěn lèi, dàn wǒ xīnlǐ hěn gāoxìng.",
        targetTranslation = "Meskipun sangat lelah, tetapi hati saya sangat senang.",
        correctAnswer = "Suīrán hěn lèi, dàn wǒ xīnlǐ hěn gāoxìng.\n虽然 很 累， 但 我 心里 很 高兴。",
        options = listOf(
            "Suīrán hěn lèi, dàn wǒ xīnlǐ hěn gāoxìng.\n虽然 很 累， 但 我 心里 很 高兴。",
            "Suīrán bù lèi, dàn wǒ xīnlǐ bù gāoxìng.\n虽然 不 累， 但 我 心里 不 高兴。",
            "Tā hěn lèi, xīnlǐ bù gāoxìng.\n他 很 累， 心里 不 高兴。"
        ),
        audioToSpeak = "虽然很累，但我心里很高兴。"
    ),

    // 7. Soal 7: Pilihan Gambar (累 -> lelah capek)
    Exercise(
        id = "u25_s4_p2_q7",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "累",
        targetPinyin = "lèi",
        targetTranslation = "lelah / capek",
        correctAnswer = "lelah / capek",
        audioToSpeak = "累",
        pictureOptions = listOf(
            PictureOption("u25_s4_p2_opt7_1", "lelah", "", R.drawable.ic_sport_running, true),
            PictureOption("u25_s4_p2_opt7_2", "kebugaran", "", R.drawable.ic_sport_fitness, false),
            PictureOption("u25_s4_p2_opt7_3", "sepak bola", "", R.drawable.ic_sport_soccer, false),
            PictureOption("u25_s4_p2_opt7_4", "renang", "", R.drawable.ic_sport_swim, false)
        )
    ),

    // 8. Soal 8: Ketik Pinyin (lelah -> lèi)
    Exercise(
        id = "u25_s4_p2_q8",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "lelah / capek",
        sentenceWithBlank = "累 (________)",
        targetHanzi = "累",
        targetPinyin = "lèi",
        correctAnswer = "lei",
        keyboardKeys = listOf("l", "e", "i", "a", "o", "u", "b", "d", "g", "h", "j", "m"),
        audioToSpeak = "累"
    ),

    // 9. Soal 9: Susun Kalimat (Kerja seharian sangat melelahkan.)
    Exercise(
        id = "u25_s4_p2_q9",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Kerja seharian sangat lelah.",
        targetHanzi = "工作 一天 很 累。",
        targetPinyin = "Gōngzuò yìtiān hěn lèi.",
        wordChips = listOf("工作:gōngzuò", "一天:yìtiān", "很:hěn", "累。:lèi.", "轻松:qīngsōng"),
        correctAnswer = "工作,一天,很,累。",
        audioToSpeak = "工作一天很累。"
    ),

    // 10. Soal 10: Ketuk Pasangan yang Sesuai (Rangkuman Tubuh & Kebugaran)
    Exercise(
        id = "u25_s4_p2_m10",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u25_s4_p2_m10_1", "身体", "shēntǐ", "kondisi badan"),
            MatchPairItem("u25_s4_p2_m10_2", "真累", "zhēn lèi", "sungguh lelah"),
            MatchPairItem("u25_s4_p2_m10_3", "好好休息", "hǎohāo xiūxi", "istirahat baik"),
            MatchPairItem("u25_s4_p2_m10_4", "多运动", "duō yùndòng", "rajin olahraga")
        )
    )
)
