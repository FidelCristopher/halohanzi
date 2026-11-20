package com.example.chineselearning.data.repository

import com.example.chineselearning.R
import com.example.chineselearning.data.model.Exercise
import com.example.chineselearning.data.model.ExerciseType
import com.example.chineselearning.data.model.MatchPairItem
import com.example.chineselearning.data.model.PictureOption

val bab29Stage3Part1Exercises = listOf(
    // 1. Soal 1: Pilihan Gambar (还是 -> ataukah / pilihan)
    Exercise(
        id = "u29_s3_p1_q1",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "还是",
        targetPinyin = "háishi",
        targetTranslation = "atau (dalam pertanyaan)",
        correctAnswer = "atau (dalam pertanyaan)",
        audioToSpeak = "还是",
        pictureOptions = listOf(
            PictureOption("u29_s3_p1_opt1", "pilihan atau", "", R.drawable.ic_log_contrast_switch, true),
            PictureOption("u29_s3_p1_opt2", "kenapa", "", R.drawable.ic_log_question_why, false),
            PictureOption("u29_s3_p1_opt3", "sebab", "", R.drawable.ic_log_cause_effect, false),
            PictureOption("u29_s3_p1_opt4", "sopan", "", R.drawable.ic_etq_formal_bow, false)
        )
    ),

    // 2. Soal 2: Susun Kalimat (Kamu ingin minum kopi ataukah minum teh?)
    Exercise(
        id = "u29_s3_p1_q2",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Kamu mau minum kopi atau minum teh?",
        targetHanzi = "你 想 喝 咖啡 还是 喝 茶？",
        targetPinyin = "Nǐ xiǎng hē kāfēi háishi hē chá?",
        wordChips = listOf("你:nǐ", "想:xiǎng", "喝:hē", "咖啡:kāfēi", "还是:háishi", "喝:hē", "茶？:chá.", "水:shuǐ"),
        correctAnswer = "你,想,喝,咖啡,还是,喝,茶？",
        audioToSpeak = "你想喝咖啡还是喝茶？"
    ),

    // 3. Soal 3: Ketuk Pasangan yang Sesuai (Pilihan & Kausatif)
    Exercise(
        id = "u29_s3_p1_q3",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u29_s3_p1_m1", "还是", "háishi", "atau (tanya)"),
            MatchPairItem("u29_s3_p1_m2", "让", "ràng", "menyuruh / membiarkan"),
            MatchPairItem("u29_s3_p1_m3", "喝咖啡", "hē kāfēi", "minum kopi"),
            MatchPairItem("u29_s3_p1_m4", "喝红茶", "hē hóngchá", "minum teh merah")
        )
    ),

    // 4. Soal 4: Ketik Pinyin (atau -> háishi)
    Exercise(
        id = "u29_s3_p1_q4",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "atau (dalam pertanyaan)",
        sentenceWithBlank = "还是 (________)",
        targetHanzi = "还是",
        targetPinyin = "háishi",
        correctAnswer = "haishi",
        keyboardKeys = listOf("h", "a", "i", "s", "e", "o", "u", "b", "d", "g", "j", "l"),
        audioToSpeak = "还是"
    ),

    // 5. Soal 5: Mendengar Kalimat (Rule 10: illustrationRes = 0)
    Exercise(
        id = "u29_s3_p1_q5",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Apa yang Anda dengar?",
        targetTranslation = "Ibu menyuruh saya lekas pulang makan nasi.",
        targetHanzi = "妈妈 让 我 早点 回家 吃饭。",
        targetPinyin = "Māma ràng wǒ zǎodiǎn huíjiā chīfàn.",
        wordChips = listOf("妈妈:māma", "让:ràng", "我:wǒ", "早点:zǎodiǎn", "回家:huíjiā", "吃饭。:chīfàn.", "去:qù"),
        correctAnswer = "妈妈,让,我,早点,回家,吃饭。",
        illustrationRes = 0,
        audioToSpeak = "妈妈让我早点回家吃饭。"
    ),

    // 6. Soal 6: Pilihan Kalimat
    Exercise(
        id = "u29_s3_p1_q6",
        type = ExerciseType.SENTENCE_CHOICE,
        title = "Pilih terjemahan yang benar",
        targetHanzi = "老师 让 我 回答 问题。",
        targetPinyin = "Lǎoshī ràng wǒ huídá wèntí.",
        targetTranslation = "Guru menyuruh saya menjawab pertanyaan.",
        correctAnswer = "Lǎoshī ràng wǒ huídá wèntí.\n老师 让 我 回答 问题。",
        options = listOf(
            "Lǎoshī ràng wǒ huídá wèntí.\n老师 让 我 回答 问题。",
            "Lǎoshī ràng tā huídá wèntí.\n老师 让 他 回答 问题。",
            "Wǒ ràng lǎoshī huídá wèntí.\n我 让 老师 回答 问题。"
        ),
        audioToSpeak = "老师让我回答问题。"
    ),

    // 7. Soal 7: Pilihan Gambar (让 -> menyuruh / kausatif)
    Exercise(
        id = "u29_s3_p1_q7",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "让",
        targetPinyin = "ràng",
        targetTranslation = "menyuruh / membiarkan",
        correctAnswer = "menyuruh / membiarkan",
        audioToSpeak = "让",
        pictureOptions = listOf(
            PictureOption("u29_s3_p1_opt7_1", "menyuruh", "", R.drawable.ic_etq_gift_giving, true),
            PictureOption("u29_s3_p1_opt7_2", "pertentangan", "", R.drawable.ic_log_contrast_switch, false),
            PictureOption("u29_s3_p1_opt7_3", "kenapa", "", R.drawable.ic_log_question_why, false),
            PictureOption("u29_s3_p1_opt7_4", "sebab", "", R.drawable.ic_log_cause_effect, false)
        )
    ),

    // 8. Soal 8: Ketik Pinyin (menyuruh -> ràng)
    Exercise(
        id = "u29_s3_p1_q8",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "menyuruh / membiarkan",
        sentenceWithBlank = "让 (________)",
        targetHanzi = "让",
        targetPinyin = "ràng",
        correctAnswer = "rang",
        keyboardKeys = listOf("r", "a", "n", "g", "e", "i", "o", "u", "b", "d", "h", "j"),
        audioToSpeak = "让"
    ),

    // 9. Soal 9: Susun Kalimat (Hari ini pergi ataukah besok pergi?)
    Exercise(
        id = "u29_s3_p1_q9",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Hari ini pergi atau besok pergi?",
        targetHanzi = "今天 去 还是 明天 去？",
        targetPinyin = "Jīntiān qù háishi míngtiān qù?",
        wordChips = listOf("今天:jīntiān", "去:qù", "还是:háishi", "明天:míngtiān", "去？:qù.", "昨天:zuótiān"),
        correctAnswer = "今天,去,还是,明天,去？",
        audioToSpeak = "今天去还是明天去？"
    ),

    // 10. Soal 10: Ketuk Pasangan yang Sesuai (Rangkuman Pilihan Tanya)
    Exercise(
        id = "u29_s3_p1_m10",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u29_s3_p1_m10_1", "还是", "háishi", "ataukah"),
            MatchPairItem("u29_s3_p1_m2", "让我想想", "ràng wǒ xiǎngxiang", "biar kupikirkan"),
            MatchPairItem("u29_s3_p1_m3", "回答问题", "huídá wèntí", "menjawab soal"),
            MatchPairItem("u29_s3_p1_m4", "早点回家", "zǎodiǎn huíjiā", "lekas pulang")
        )
    )
)

val bab29Stage3Part2Exercises = listOf(
    // 1. Soal 1: Pilihan Gambar (可能 -> mungkin / barangkali)
    Exercise(
        id = "u29_s3_p2_q1",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "可能",
        targetPinyin = "kěnéng",
        targetTranslation = "mungkin / barangkali",
        correctAnswer = "mungkin / barangkali",
        audioToSpeak = "可能",
        pictureOptions = listOf(
            PictureOption("u29_s3_p2_opt1", "mungkin", "", R.drawable.ic_log_question_why, true),
            PictureOption("u29_s3_p2_opt2", "kontras", "", R.drawable.ic_log_contrast_switch, false),
            PictureOption("u29_s3_p2_opt3", "sebab", "", R.drawable.ic_log_cause_effect, false),
            PictureOption("u29_s3_p2_opt4", "sopan", "", R.drawable.ic_etq_formal_bow, false)
        )
    ),

    // 2. Soal 2: Susun Kalimat (Besok sore barangkali akan turun hujan lebat.)
    Exercise(
        id = "u29_s3_p2_q2",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Besok sore mungkin turun hujan.",
        targetHanzi = "明天 下午 可能 会 下雨。",
        targetPinyin = "Míngtiān xiàwǔ kěnéng huì xiàyǔ.",
        wordChips = listOf("明天:míngtiān", "下午:xiàwǔ", "可能:kěnéng", "会:huì", "下雨。:xiàyǔ.", "晴天:qíngtiān"),
        correctAnswer = "明天,下午,可能,会,下雨。",
        audioToSpeak = "明天下午可能会下雨。"
    ),

    // 3. Soal 3: Ketuk Pasangan yang Sesuai (Kemungkinan)
    Exercise(
        id = "u29_s3_p2_m3",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u29_s3_p2_m1", "可能", "kěnéng", "mungkin"),
            MatchPairItem("u29_s3_p2_m2", "可能会", "kěnéng huì", "barangkali akan"),
            MatchPairItem("u29_s3_p2_m3", "不可能", "bù kěnéng", "tidak mungkin"),
            MatchPairItem("u29_s3_p2_m4", "明天下午", "míngtiān xiàwǔ", "besok sore")
        )
    ),

    // 4. Soal 4: Ketik Pinyin (mungkin -> kěnéng)
    Exercise(
        id = "u29_s3_p2_q4",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "mungkin / barangkali",
        sentenceWithBlank = "可能 (________)",
        targetHanzi = "可能",
        targetPinyin = "kěnéng",
        correctAnswer = "keneng",
        keyboardKeys = listOf("k", "e", "n", "g", "a", "i", "o", "u", "b", "d", "h", "j"),
        audioToSpeak = "可能"
    ),

    // 5. Soal 5: Mendengar Kalimat (Rule 10: illustrationRes = 0)
    Exercise(
        id = "u29_s3_p2_q5",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Apa yang Anda dengar?",
        targetTranslation = "Dia besok mungkin tidak bisa datang.",
        targetHanzi = "他 明天 可能 不 来。",
        targetPinyin = "Tā míngtiān kěnéng bù lái.",
        wordChips = listOf("他:tā", "明天:míngtiān", "可能:kěnéng", "不:bù", "来。:lái.", "去:qù"),
        correctAnswer = "他,明天,可能,不,来。",
        illustrationRes = 0,
        audioToSpeak = "他明天可能不来。"
    ),

    // 6. Soal 6: Pilihan Kalimat
    Exercise(
        id = "u29_s3_p2_q6",
        type = ExerciseType.SENTENCE_CHOICE,
        title = "Pilih terjemahan yang benar",
        targetHanzi = "这 是 完全 可能 的。",
        targetPinyin = "Zhè shì wánquán kěnéng de.",
        targetTranslation = "Ini adalah hal yang sepenuhnya memungkinkan.",
        correctAnswer = "Zhè shì wánquán kěnéng de.\n这 是 完全 可能 的。",
        options = listOf(
            "Zhè shì wánquán kěnéng de.\n这 是 完全 可能 的。",
            "Zhè shì wánquán bù kěnéng de.\n这 是 完全 不 可能 的。",
            "Nà shì wánquán kěnéng de.\n那 是 完全 可能 的。"
        ),
        audioToSpeak = "这是完全可能的。"
    ),

    // 7. Soal 7: Pilihan Gambar (可能 -> barangkali)
    Exercise(
        id = "u29_s3_p2_q7",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "可能",
        targetPinyin = "kěnéng",
        targetTranslation = "kemungkinan",
        correctAnswer = "kemungkinan",
        audioToSpeak = "可能",
        pictureOptions = listOf(
            PictureOption("u29_s3_p2_opt7_1", "mungkin", "", R.drawable.ic_log_question_why, true),
            PictureOption("u29_s3_p2_opt7_2", "kontras", "", R.drawable.ic_log_contrast_switch, false),
            PictureOption("u29_s3_p2_opt7_3", "sebab", "", R.drawable.ic_log_cause_effect, false),
            PictureOption("u29_s3_p2_opt7_4", "sopan", "", R.drawable.ic_etq_formal_bow, false)
        )
    ),

    // 8. Soal 8: Ketik Pinyin (turun hujan -> xiàyǔ)
    Exercise(
        id = "u29_s3_p2_q8",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "turun hujan",
        sentenceWithBlank = "下雨 (________)",
        targetHanzi = "下雨",
        targetPinyin = "xiàyǔ",
        correctAnswer = "xiayu",
        keyboardKeys = listOf("x", "i", "a", "y", "u", "e", "o", "b", "d", "g", "h", "j"),
        audioToSpeak = "下雨"
    ),

    // 9. Soal 9: Susun Kalimat (Hal itu sangat mungkin terjadi.)
    Exercise(
        id = "u29_s3_p2_q9",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Hal itu sangat mungkin.",
        targetHanzi = "那 是 很 可能 的。",
        targetPinyin = "Nà shì hěn kěnéng de.",
        wordChips = listOf("那:nà", "是:shì", "很:hěn", "可能:kěnéng", "的。:de.", "不:bù"),
        correctAnswer = "那,是,很,可能,的。",
        audioToSpeak = "那是很可能的。"
    ),

    // 10. Soal 10: Ketuk Pasangan yang Sesuai (Rangkuman Modalitas Kemungkinan)
    Exercise(
        id = "u29_s3_p2_m10",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u29_s3_p2_m10_1", "可能", "kěnéng", "mungkin"),
            MatchPairItem("u29_s3_p2_m10_2", "可能会下雨", "kěnéng huì xiàyǔ", "mungkin hujan"),
            MatchPairItem("u29_s3_p2_m3", "有可能", "yǒu kěnéng", "ada peluang"),
            MatchPairItem("u29_s3_p2_m4", "明天见", "míngtiān jiàn", "sampai jumpa besok")
        )
    )
)
