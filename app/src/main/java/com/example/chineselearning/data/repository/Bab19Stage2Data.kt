package com.example.chineselearning.data.repository

import com.example.chineselearning.R
import com.example.chineselearning.data.model.Exercise
import com.example.chineselearning.data.model.ExerciseType
import com.example.chineselearning.data.model.MatchPairItem
import com.example.chineselearning.data.model.PictureOption

val bab19Stage2Part1Exercises = listOf(
    // 1. Soal 1: Pilihan Gambar (肉 -> daging)
    Exercise(
        id = "u19_s2_p1_q1",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "肉",
        targetPinyin = "ròu",
        targetTranslation = "daging",
        correctAnswer = "daging",
        audioToSpeak = "肉",
        pictureOptions = listOf(
            PictureOption("u19_s2_p1_opt1", "daging", "", R.drawable.ic_food_chinese_cuisine, true),
            PictureOption("u19_s2_p1_opt2", "ikan", "", R.drawable.ic_food_restaurant, false),
            PictureOption("u19_s2_p1_opt3", "teh", "", R.drawable.ic_food_tea, false),
            PictureOption("u19_s2_p1_opt4", "cangkir", "", R.drawable.ic_food_cup, false)
        )
    ),

    // 2. Soal 2: Susun Kalimat (Saya tidak sering makan daging sapi.)
    Exercise(
        id = "u19_s2_p1_q2",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Saya tidak sering makan daging.",
        targetHanzi = "我 不 常 吃 肉。",
        targetPinyin = "Wǒ bù cháng chī ròu.",
        wordChips = listOf("我:wǒ", "不:bù", "常:cháng", "吃:chī", "肉。:ròu.", "喜欢:xǐhuan"),
        correctAnswer = "我,不,常,吃,肉。",
        audioToSpeak = "我不常吃肉。"
    ),

    // 3. Soal 3: Ketuk Pasangan yang Sesuai (Daging & Ikan)
    Exercise(
        id = "u19_s2_p1_q3",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u19_s2_p1_m1", "肉", "ròu", "daging"),
            MatchPairItem("u19_s2_p1_m2", "鱼", "yú", "ikan"),
            MatchPairItem("u19_s2_p1_m3", "新鲜", "xīnxiān", "segar"),
            MatchPairItem("u19_s2_p1_m4", "羊肉", "yángròu", "daging domba")
        )
    ),

    // 4. Soal 4: Ketik Pinyin (daging -> ròu)
    Exercise(
        id = "u19_s2_p1_q4",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "daging",
        sentenceWithBlank = "肉 (________)",
        targetHanzi = "肉",
        targetPinyin = "ròu",
        correctAnswer = "rou",
        keyboardKeys = listOf("r", "o", "u", "a", "e", "i", "b", "d", "g", "h", "j", "l"),
        audioToSpeak = "肉"
    ),

    // 5. Soal 5: Mendengar Kalimat (Rule 10: illustrationRes = 0)
    Exercise(
        id = "u19_s2_p1_q5",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Apa yang Anda dengar?",
        targetTranslation = "Ikan di restoran ini sangat segar.",
        targetHanzi = "这家 饭馆 的 鱼 很 新鲜。",
        targetPinyin = "Zhè jiā fànguǎn de yú hěn xīnxiān.",
        wordChips = listOf("这家:zhè jiā", "饭馆:fànguǎn", "的:de", "鱼:yú", "很:hěn", "新鲜。:xīnxiān.", "肉:ròu"),
        correctAnswer = "这家,饭馆,的,鱼,很,新鲜。",
        illustrationRes = 0,
        audioToSpeak = "这家饭馆的鱼很新鲜。"
    ),

    // 6. Soal 6: Pilihan Kalimat
    Exercise(
        id = "u19_s2_p1_q6",
        type = ExerciseType.SENTENCE_CHOICE,
        title = "Pilih terjemahan yang benar",
        targetHanzi = "弟弟 喜欢 吃 鱼， 不 喜欢 吃 肉。",
        targetPinyin = "Dìdi xǐhuan chī yú, bù xǐhuan chī ròu.",
        targetTranslation = "Adik suka makan ikan, tidak suka makan daging.",
        correctAnswer = "Dìdi xǐhuan chī yú, bù xǐhuan chī ròu.\n弟弟 喜欢 吃 鱼， 不 喜欢 吃 肉。",
        options = listOf(
            "Dìdi xǐhuan chī yú, bù xǐhuan chī ròu.\n弟弟 喜欢 吃 鱼， 不 喜欢 吃 肉。",
            "Dìdi xǐhuan chī ròu, bù xǐhuan chī yú.\n弟弟 喜欢 吃 肉， 不 喜欢 吃 鱼。",
            "Gēge xǐhuan chī yú, bù xǐhuan chī ròu.\n哥哥 喜欢 吃 鱼， 不 喜欢 吃 肉。"
        ),
        audioToSpeak = "弟弟喜欢吃鱼，不喜欢吃肉。"
    ),

    // 7. Soal 7: Pilihan Gambar (鱼 -> ikan)
    Exercise(
        id = "u19_s2_p1_q7",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "鱼",
        targetPinyin = "yú",
        targetTranslation = "ikan",
        correctAnswer = "ikan",
        audioToSpeak = "鱼",
        pictureOptions = listOf(
            PictureOption("u19_s2_p1_opt7_1", "ikan", "", R.drawable.ic_food_chinese_cuisine, true),
            PictureOption("u19_s2_p1_opt7_2", "restoran", "", R.drawable.ic_food_restaurant, false),
            PictureOption("u19_s2_p1_opt7_3", "cangkir", "", R.drawable.ic_food_cup, false),
            PictureOption("u19_s2_p1_opt7_4", "teh", "", R.drawable.ic_food_tea, false)
        )
    ),

    // 8. Soal 8: Ketik Pinyin (ikan -> yú)
    Exercise(
        id = "u19_s2_p1_q8",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "ikan",
        sentenceWithBlank = "鱼 (________)",
        targetHanzi = "鱼",
        targetPinyin = "yú",
        correctAnswer = "yu",
        keyboardKeys = listOf("y", "u", "a", "e", "i", "o", "b", "d", "g", "h", "j", "l"),
        audioToSpeak = "鱼"
    ),

    // 9. Soal 9: Susun Kalimat (Ibu memasak ikan dengan sangat lezat.)
    Exercise(
        id = "u19_s2_p1_q9",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Ibu memasak ikan sangat enak.",
        targetHanzi = "妈妈 做 的 鱼 很 好吃。",
        targetPinyin = "Māma zuò de yú hěn hǎochī.",
        wordChips = listOf("妈妈:māma", "做:zuò", "的:de", "鱼:yú", "很:hěn", "好吃。:hǎochī.", "肉:ròu"),
        correctAnswer = "妈妈,做,的,鱼,很,好吃。",
        audioToSpeak = "妈妈做的鱼很好吃。"
    ),

    // 10. Soal 10: Ketuk Pasangan yang Sesuai (Rangkuman Olahan Ikan & Daging)
    Exercise(
        id = "u19_s2_p1_m10",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u19_s2_p1_m10_1", "肉", "ròu", "daging"),
            MatchPairItem("u19_s2_p1_m10_2", "鱼", "yú", "ikan"),
            MatchPairItem("u19_s2_p1_m10_3", "大鱼", "dà yú", "ikan besar"),
            MatchPairItem("u19_s2_p1_m10_4", "做肉", "zuò ròu", "masak daging")
        )
    )
)

val bab19Stage2Part2Exercises = listOf(
    // 1. Soal 1: Pilihan Gambar (鱼 -> ikan segar)
    Exercise(
        id = "u19_s2_p2_q1",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "鱼",
        targetPinyin = "yú",
        targetTranslation = "ikan",
        correctAnswer = "ikan",
        audioToSpeak = "鱼",
        pictureOptions = listOf(
            PictureOption("u19_s2_p2_opt1", "ikan", "", R.drawable.ic_food_chinese_cuisine, true),
            PictureOption("u19_s2_p2_opt2", "restoran", "", R.drawable.ic_food_restaurant, false),
            PictureOption("u19_s2_p2_opt3", "teh", "", R.drawable.ic_food_tea, false),
            PictureOption("u19_s2_p2_opt4", "cangkir", "", R.drawable.ic_food_cup, false)
        )
    ),

    // 2. Soal 2: Susun Kalimat (Kucing suka makan ikan segar.)
    Exercise(
        id = "u19_s2_p2_q2",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Kucing suka makan ikan.",
        targetHanzi = "小猫 喜欢 吃 鱼。",
        targetPinyin = "Xiǎomāo xǐhuan chī yú.",
        wordChips = listOf("小猫:xiǎomāo", "喜欢:xǐhuan", "吃:chī", "鱼。:yú.", "肉:ròu"),
        correctAnswer = "小猫,喜欢,吃,鱼。",
        audioToSpeak = "小猫喜欢吃鱼。"
    ),

    // 3. Soal 3: Ketuk Pasangan yang Sesuai (Konsumsi Protein)
    Exercise(
        id = "u19_s2_p2_m3",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u19_s2_p2_m1", "吃鱼", "chī yú", "makan ikan"),
            MatchPairItem("u19_s2_p2_m2", "吃肉", "chī ròu", "makan daging"),
            MatchPairItem("u19_s2_p2_m3", "牛肉", "niúròu", "daging sapi"),
            MatchPairItem("u19_s2_p2_m4", "鲜美", "xiānměi", "lezat gurih")
        )
    ),

    // 4. Soal 4: Ketik Pinyin (makan ikan -> chīyú)
    Exercise(
        id = "u19_s2_p2_q4",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "makan ikan",
        sentenceWithBlank = "吃鱼 (________)",
        targetHanzi = "吃鱼",
        targetPinyin = "chīyú",
        correctAnswer = "chiyu",
        keyboardKeys = listOf("c", "h", "i", "y", "u", "a", "e", "o", "b", "d", "g", "j"),
        audioToSpeak = "吃鱼"
    ),

    // 5. Soal 5: Mendengar Kalimat (Rule 10: illustrationRes = 0)
    Exercise(
        id = "u19_s2_p2_q5",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Apa yang Anda dengar?",
        targetTranslation = "Daging sapi hari ini sangat mahal.",
        targetHanzi = "今天 的 牛肉 很 贵。",
        targetPinyin = "Jīntiān de niúròu hěn guì.",
        wordChips = listOf("今天:jīntiān", "的:de", "牛肉:niúròu", "很:hěn", "贵。:guì.", "便宜:piányi"),
        correctAnswer = "今天,的,牛肉,很,贵。",
        illustrationRes = 0,
        audioToSpeak = "今天的牛肉很贵。"
    ),

    // 6. Soal 6: Pilihan Kalimat
    Exercise(
        id = "u19_s2_p2_q6",
        type = ExerciseType.SENTENCE_CHOICE,
        title = "Pilih terjemahan yang benar",
        targetHanzi = "请 给 我 一 盘 炒 牛肉。",
        targetPinyin = "Qǐng gěi wǒ yì pán chǎo niúròu.",
        targetTranslation = "Tolong beri saya sepiring tumis daging sapi.",
        correctAnswer = "Qǐng gěi wǒ yì pán chǎo niúròu.\n请 给 我 一 盘 炒 牛肉。",
        options = listOf(
            "Qǐng gěi wǒ yì pán chǎo niúròu.\n请 给 我 一 盘 炒 牛肉。",
            "Qǐng gěi wǒ yì pán chǎo yú.\n请 给 我 一 盘 炒 鱼。",
            "Qǐng gěi wǒ yì wǎn miàntiáo.\n请 给 我 一 碗 面条。"
        ),
        audioToSpeak = "请给我一盘炒牛肉。"
    ),

    // 7. Soal 7: Pilihan Gambar (牛肉 -> daging sapi)
    Exercise(
        id = "u19_s2_p2_q7",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "牛肉",
        targetPinyin = "niúròu",
        targetTranslation = "daging sapi",
        correctAnswer = "daging sapi",
        audioToSpeak = "牛肉",
        pictureOptions = listOf(
            PictureOption("u19_s2_p2_opt7_1", "daging sapi", "", R.drawable.ic_food_chinese_cuisine, true),
            PictureOption("u19_s2_p2_opt7_2", "ikan", "", R.drawable.ic_food_restaurant, false),
            PictureOption("u19_s2_p2_opt7_3", "teh", "", R.drawable.ic_food_tea, false),
            PictureOption("u19_s2_p2_opt7_4", "cangkir", "", R.drawable.ic_food_cup, false)
        )
    ),

    // 8. Soal 8: Ketik Pinyin (daging sapi -> niúròu)
    Exercise(
        id = "u19_s2_p2_q8",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "daging sapi",
        sentenceWithBlank = "牛肉 (________)",
        targetHanzi = "牛肉",
        targetPinyin = "niúròu",
        correctAnswer = "niurou",
        keyboardKeys = listOf("n", "i", "u", "r", "o", "a", "e", "b", "d", "g", "h", "j"),
        audioToSpeak = "牛肉"
    ),

    // 9. Soal 9: Susun Kalimat (Kami makan daging sapi bersama nasi putih.)
    Exercise(
        id = "u19_s2_p2_q9",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Kami makan daging sapi dan nasi.",
        targetHanzi = "我们 吃 牛肉 和 米饭。",
        targetPinyin = "Wǒmen chī niúròu hé mǐfàn.",
        wordChips = listOf("我们:wǒmen", "吃:chī", "牛肉:niúròu", "和:hé", "米饭。:mǐfàn.", "鱼:yú"),
        correctAnswer = "我们,吃,牛肉,和,米饭。",
        audioToSpeak = "我们吃牛肉和米饭。"
    ),

    // 10. Soal 10: Ketuk Pasangan yang Sesuai (Rangkuman Hidangan Daging & Nasi)
    Exercise(
        id = "u19_s2_p2_m10",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u19_s2_p2_m10_1", "牛肉", "niúròu", "daging sapi"),
            MatchPairItem("u19_s2_p2_m10_2", "米饭", "mǐfàn", "nasi putih"),
            MatchPairItem("u19_s2_p2_m10_3", "吃饱", "chī bǎo", "kenyang makan"),
            MatchPairItem("u19_s2_p2_m10_4", "新鲜鱼", "xīnxiān yú", "ikan segar")
        )
    )
)
