package com.example.chineselearning.data.repository

import com.example.chineselearning.R
import com.example.chineselearning.data.model.Exercise
import com.example.chineselearning.data.model.ExerciseType
import com.example.chineselearning.data.model.MatchPairItem
import com.example.chineselearning.data.model.PictureOption

val bab7Stage2Part1Exercises = listOf(
    // 1. Soal 1: Pilihan Gambar (米饭 -> nasi putih)
    Exercise(
        id = "u7_s2_p1_q1",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "米饭",
        targetPinyin = "mǐfàn",
        targetTranslation = "nasi putih",
        correctAnswer = "nasi putih",
        audioToSpeak = "米饭",
        pictureOptions = listOf(
            PictureOption("u7_s2_p1_opt1", "nasi putih", "", R.drawable.ic_food_rice, true),
            PictureOption("u7_s2_p1_opt2", "mie", "", R.drawable.ic_food_noodles, false),
            PictureOption("u7_s2_p1_opt3", "roti", "", R.drawable.ic_food_bread, false),
            PictureOption("u7_s2_p1_opt4", "teh", "", R.drawable.ic_food_tea, false)
        )
    ),

    // 2. Soal 2: Susun Kalimat (Saya ingin makan nasi putih.)
    Exercise(
        id = "u7_s2_p1_q2",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Saya ingin makan nasi putih.",
        targetHanzi = "我 想 吃 米饭。",
        targetPinyin = "Wǒ xiǎng chī mǐfàn.",
        wordChips = listOf("我:wǒ", "想:xiǎng", "吃:chī", "米饭:mǐfàn", "面条儿:miàntiáor", "喝:hē"),
        correctAnswer = "我,想,吃,米饭",
        audioToSpeak = "我想吃米饭。"
    ),

    // 3. Soal 3: Ketuk Pasangan yang Sesuai (Nasi & Mie)
    Exercise(
        id = "u7_s2_p1_q3",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u7_s2_p1_m1", "米饭", "mǐfàn", "nasi putih"),
            MatchPairItem("u7_s2_p1_m2", "面条儿", "miàntiáor", "mie"),
            MatchPairItem("u7_s2_p1_m3", "饭", "fàn", "nasi / makanan"),
            MatchPairItem("u7_s2_p1_m4", "吃米饭", "chī mǐfàn", "makan nasi")
        )
    ),

    // 4. Soal 4: Ketik Pinyin (nasi putih -> mǐfàn)
    Exercise(
        id = "u7_s2_p1_q4",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "nasi putih",
        sentenceWithBlank = "米饭 (________)",
        targetHanzi = "米饭",
        targetPinyin = "mǐfàn",
        correctAnswer = "mifan",
        keyboardKeys = listOf("m", "i", "f", "a", "n", "e", "o", "u", "b", "d", "g"),
        audioToSpeak = "米饭"
    ),

    // 5. Soal 5: Mendengar Kalimat (Rule 10: illustrationRes = 0)
    Exercise(
        id = "u7_s2_p1_q5",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Apa yang Anda dengar?",
        targetTranslation = "Dia suka makan mie.",
        targetHanzi = "他 喜欢 吃 面条儿。",
        targetPinyin = "Tā xǐhuan chī miàntiáor.",
        wordChips = listOf("他:tā", "喜欢:xǐhuan", "吃:chī", "面条儿:miàntiáor", "米饭:mǐfàn", "我:wǒ"),
        correctAnswer = "他,喜欢,吃,面条儿",
        illustrationRes = 0,
        audioToSpeak = "他喜欢吃面条儿。"
    ),

    // 6. Soal 6: Pilihan Kalimat
    Exercise(
        id = "u7_s2_p1_q6",
        type = ExerciseType.SENTENCE_CHOICE,
        title = "Pilih terjemahan yang benar",
        targetHanzi = "中国 面条儿 很 好吃。",
        targetPinyin = "Zhōngguó miàntiáor hěn hǎochī.",
        targetTranslation = "Mie Tiongkok sangat enak.",
        correctAnswer = "Zhōngguó miàntiáor hěn hǎochī.\n中国 面条儿 很 好吃。",
        options = listOf(
            "Zhōngguó miàntiáor hěn hǎochī.\n中国 面条儿 很 好吃。",
            "Zhōngguó mǐfàn hěn hǎochī.\n中国 米饭 很 好吃。",
            "Běijīng miàntiáor hěn hǎochī.\n北京 面条儿 很 好吃。"
        ),
        audioToSpeak = "中国面条儿很好吃。"
    ),

    // 7. Soal 7: Pilihan Gambar (面条儿 -> mie)
    Exercise(
        id = "u7_s2_p1_q7",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "面条儿",
        targetPinyin = "miàntiáor",
        targetTranslation = "mie",
        correctAnswer = "mie",
        audioToSpeak = "面条儿",
        pictureOptions = listOf(
            PictureOption("u7_s2_p1_opt7_1", "mie", "", R.drawable.ic_food_noodles, true),
            PictureOption("u7_s2_p1_opt7_2", "nasi putih", "", R.drawable.ic_food_rice, false),
            PictureOption("u7_s2_p1_opt7_3", "roti", "", R.drawable.ic_food_bread, false),
            PictureOption("u7_s2_p1_opt7_4", "air", "", R.drawable.ic_food_water, false)
        )
    ),

    // 8. Soal 8: Ketik Pinyin (mie -> miàntiáor)
    Exercise(
        id = "u7_s2_p1_q8",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "mie",
        sentenceWithBlank = "面条儿 (________)",
        targetHanzi = "面条儿",
        targetPinyin = "miàntiáor",
        correctAnswer = "miantiar",
        keyboardKeys = listOf("m", "i", "a", "n", "t", "r", "e", "o", "u", "b", "d"),
        audioToSpeak = "面条儿"
    ),

    // 9. Soal 9: Susun Kalimat (Saya makan semangkuk mie.)
    Exercise(
        id = "u7_s2_p1_q9",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Saya makan semangkuk mie.",
        targetHanzi = "我 吃 一 碗 面条儿。",
        targetPinyin = "Wǒ chī yì wǎn miàntiáor.",
        wordChips = listOf("我:wǒ", "吃:chī", "一:yì", "碗:wǎn", "面条儿:miàntiáor", "米饭:mǐfàn"),
        correctAnswer = "我,吃,一,碗,面条儿",
        audioToSpeak = "我吃一碗面条儿。"
    ),

    // 10. Soal 10: Ketuk Pasangan yang Sesuai (Rangkuman Nasi & Mie)
    Exercise(
        id = "u7_s2_p1_m10_1",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u7_s2_p1_m10_1", "米饭", "mǐfàn", "nasi putih"),
            MatchPairItem("u7_s2_p1_m10_2", "面条儿", "miàntiáor", "mie"),
            MatchPairItem("u7_s2_p1_m10_3", "吃面条儿", "chī miàntiáor", "makan mie"),
            MatchPairItem("u7_s2_p1_m10_4", "喜欢吃", "xǐhuan chī", "suka makan")
        )
    )
)

val bab7Stage2Part2Exercises = listOf(
    // 1. Soal 1: Pilihan Gambar (面包 -> roti)
    Exercise(
        id = "u7_s2_p2_q1",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "面包",
        targetPinyin = "miànbāo",
        targetTranslation = "roti",
        correctAnswer = "roti",
        audioToSpeak = "面包",
        pictureOptions = listOf(
            PictureOption("u7_s2_p2_opt1", "roti", "", R.drawable.ic_food_bread, true),
            PictureOption("u7_s2_p2_opt2", "nasi putih", "", R.drawable.ic_food_rice, false),
            PictureOption("u7_s2_p2_opt3", "mie", "", R.drawable.ic_food_noodles, false),
            PictureOption("u7_s2_p2_opt4", "teh", "", R.drawable.ic_food_tea, false)
        )
    ),

    // 2. Soal 2: Susun Kalimat (Ibu saya sedang memasak di rumah.)
    Exercise(
        id = "u7_s2_p2_q2",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Ibu saya sedang memasak di rumah.",
        targetHanzi = "我 妈妈 在家 做饭。",
        targetPinyin = "Wǒ māma zàijiā zuòfàn.",
        wordChips = listOf("我:wǒ", "妈妈:māma", "在家:zàijiā", "做饭:zuòfàn", "吃饭:chīfàn", "爸爸:bàba"),
        correctAnswer = "我,妈妈,在家,做饭",
        audioToSpeak = "我妈妈在家做饭。"
    ),

    // 3. Soal 3: Ketuk Pasangan yang Sesuai (Roti & Memasak)
    Exercise(
        id = "u7_s2_p2_q3",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u7_s2_p2_m1", "面包", "miànbāo", "roti"),
            MatchPairItem("u7_s2_p2_m2", "做饭", "zuò fàn", "memasak"),
            MatchPairItem("u7_s2_p2_m3", "吃面包", "chī miànbāo", "makan roti"),
            MatchPairItem("u7_s2_p2_m4", "会做饭", "huì zuò fàn", "bisa memasak")
        )
    ),

    // 4. Soal 4: Ketik Pinyin (roti -> miànbāo)
    Exercise(
        id = "u7_s2_p2_q4",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "roti",
        sentenceWithBlank = "面包 (________)",
        targetHanzi = "面包",
        targetPinyin = "miànbāo",
        correctAnswer = "mianbao",
        keyboardKeys = listOf("m", "i", "a", "n", "b", "o", "e", "u", "d", "g", "h"),
        audioToSpeak = "面包"
    ),

    // 5. Soal 5: Mendengar Kalimat (Rule 10: illustrationRes = 0)
    Exercise(
        id = "u7_s2_p2_q5",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Apa yang Anda dengar?",
        targetTranslation = "Dia bisa memasak masakan Tiongkok.",
        targetHanzi = "他 会 做 中国 菜。",
        targetPinyin = "Tā huì zuò Zhōngguó cài.",
        wordChips = listOf("他:tā", "会:huì", "做:zuò", "中国:Zhōngguó", "菜:cài", "米饭:mǐfàn"),
        correctAnswer = "他,会,做,中国,菜",
        illustrationRes = 0,
        audioToSpeak = "他会做中国菜。"
    ),

    // 6. Soal 6: Pilihan Kalimat
    Exercise(
        id = "u7_s2_p2_q6",
        type = ExerciseType.SENTENCE_CHOICE,
        title = "Pilih terjemahan yang benar",
        targetHanzi = "早饭 我 吃 面包。",
        targetPinyin = "Zǎofàn wǒ chī miànbāo.",
        targetTranslation = "Sarapan saya makan roti.",
        correctAnswer = "Zǎofàn wǒ chī miànbāo.\n早饭 我 吃 面包。",
        options = listOf(
            "Zǎofàn wǒ chī miànbāo.\n早饭 我 吃 面包。",
            "Wǔfàn wǒ chī miànbāo.\n午饭 我 吃 面包。",
            "Zǎofàn wǒ chī mǐfàn.\n早饭 我 吃 米饭。"
        ),
        audioToSpeak = "早饭我吃面包。"
    ),

    // 7. Soal 7: Pilihan Gambar (做饭 -> memasak)
    Exercise(
        id = "u7_s2_p2_q7",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "做饭",
        targetPinyin = "zuò fàn",
        targetTranslation = "memasak",
        correctAnswer = "memasak",
        audioToSpeak = "做饭",
        pictureOptions = listOf(
            PictureOption("u7_s2_p2_opt7_1", "memasak", "", R.drawable.ic_food_cooking, true),
            PictureOption("u7_s2_p2_opt7_2", "makan", "", R.drawable.ic_action_eat, false),
            PictureOption("u7_s2_p2_opt7_3", "tidur", "", R.drawable.ic_action_sleep, false),
            PictureOption("u7_s2_p2_opt7_4", "minum", "", R.drawable.ic_action_drink, false)
        )
    ),

    // 8. Soal 8: Ketik Pinyin (memasak -> zuòfàn)
    Exercise(
        id = "u7_s2_p2_q8",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "memasak",
        sentenceWithBlank = "做饭 (________)",
        targetHanzi = "做饭",
        targetPinyin = "zuòfàn",
        correctAnswer = "zuofan",
        keyboardKeys = listOf("z", "u", "o", "f", "a", "n", "e", "i", "b", "d", "g"),
        audioToSpeak = "做饭"
    ),

    // 9. Soal 9: Susun Kalimat (Siapa yang memasak?)
    Exercise(
        id = "u7_s2_p2_q9",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Siapa yang memasak?",
        targetHanzi = "谁 在 做饭？",
        targetPinyin = "Shéi zài zuòfàn?",
        wordChips = listOf("谁:shéi", "在:zài", "做饭:zuòfàn", "吃饭:chīfàn", "他:tā"),
        correctAnswer = "谁,在,做饭",
        audioToSpeak = "谁在做饭？"
    ),

    // 10. Soal 10: Ketuk Pasangan yang Sesuai (Rangkuman Memasak & Roti)
    Exercise(
        id = "u7_s2_p2_m10_1",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u7_s2_p2_m10_1", "做饭", "zuò fàn", "memasak"),
            MatchPairItem("u7_s2_p2_m10_2", "吃面包", "chī miànbāo", "makan roti"),
            MatchPairItem("u7_s2_p2_m10_3", "面包很好吃", "miànbāo hěn hǎochī", "roti sangat lezat"),
            MatchPairItem("u7_s2_p2_m10_4", "谁做饭", "shéi zuò fàn", "siapa yang memasak")
        )
    )
)
