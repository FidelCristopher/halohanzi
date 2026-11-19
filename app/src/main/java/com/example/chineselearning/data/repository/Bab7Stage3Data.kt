package com.example.chineselearning.data.repository

import com.example.chineselearning.R
import com.example.chineselearning.data.model.Exercise
import com.example.chineselearning.data.model.ExerciseType
import com.example.chineselearning.data.model.MatchPairItem
import com.example.chineselearning.data.model.PictureOption

val bab7Stage3Part1Exercises = listOf(
    // 1. Soal 1: Pilihan Gambar (包子 -> bakpao)
    Exercise(
        id = "u7_s3_p1_q1",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "包子",
        targetPinyin = "bāozi",
        targetTranslation = "bakpao",
        correctAnswer = "bakpao",
        audioToSpeak = "包子",
        pictureOptions = listOf(
            PictureOption("u7_s3_p1_opt1", "bakpao", "", R.drawable.ic_food_baozi, true),
            PictureOption("u7_s3_p1_opt2", "mie", "", R.drawable.ic_food_noodles, false),
            PictureOption("u7_s3_p1_opt3", "roti", "", R.drawable.ic_food_bread, false),
            PictureOption("u7_s3_p1_opt4", "teh", "", R.drawable.ic_food_tea, false)
        )
    ),

    // 2. Soal 2: Susun Kalimat (Saya makan dua buah bakpao.)
    Exercise(
        id = "u7_s3_p1_q2",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Saya makan dua bakpao.",
        targetHanzi = "我 吃 两个 包子。",
        targetPinyin = "Wǒ chī liǎng gè bāozi.",
        wordChips = listOf("我:wǒ", "吃:chī", "两个:liǎng gè", "包子:bāozi", "饺子:jiǎozi", "二:èr"),
        correctAnswer = "我,吃,两个,包子",
        audioToSpeak = "我吃两个包子。"
    ),

    // 3. Soal 3: Ketuk Pasangan yang Sesuai (Bakpao & Pangsit)
    Exercise(
        id = "u7_s3_p1_q3",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u7_s3_p1_m1", "包子", "bāozi", "bakpao"),
            MatchPairItem("u7_s3_p1_m2", "饺子", "jiǎozi", "pangsit (dumpling)"),
            MatchPairItem("u7_s3_p1_m3", "中国饺子", "Zhōngguó jiǎozi", "pangsit Tiongkok"),
            MatchPairItem("u7_s3_p1_m4", "好吃", "hǎochī", "enak / lezat")
        )
    ),

    // 4. Soal 4: Ketik Pinyin (bakpao -> bāozi)
    Exercise(
        id = "u7_s3_p1_q4",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "bakpao",
        sentenceWithBlank = "包子 (________)",
        targetHanzi = "包子",
        targetPinyin = "bāozi",
        correctAnswer = "baozi",
        keyboardKeys = listOf("b", "a", "o", "z", "i", "e", "u", "d", "g", "h", "j"),
        audioToSpeak = "包子"
    ),

    // 5. Soal 5: Mendengar Kalimat (Rule 10: illustrationRes = 0)
    Exercise(
        id = "u7_s3_p1_q5",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Apa yang Anda dengar?",
        targetTranslation = "Pangsit Tiongkok sangat enak.",
        targetHanzi = "中国 饺子 很 好吃。",
        targetPinyin = "Zhōngguó jiǎozi hěn hǎochī.",
        wordChips = listOf("中国:Zhōngguó", "饺子:jiǎozi", "很:hěn", "好吃:hǎochī", "包子:bāozi", "面条儿:miàntiáor"),
        correctAnswer = "中国,饺子,很,好吃",
        illustrationRes = 0,
        audioToSpeak = "中国饺子很好吃。"
    ),

    // 6. Soal 6: Pilihan Kalimat
    Exercise(
        id = "u7_s3_p1_q6",
        type = ExerciseType.SENTENCE_CHOICE,
        title = "Pilih terjemahan yang benar",
        targetHanzi = "你 喜欢 吃 饺子 吗？",
        targetPinyin = "Nǐ xǐhuan chī jiǎozi ma?",
        targetTranslation = "Apakah kamu suka makan pangsit?",
        correctAnswer = "Nǐ xǐhuan chī jiǎozi ma?\n你 喜欢 吃 饺子 吗？",
        options = listOf(
            "Nǐ xǐhuan chī jiǎozi ma?\n你 喜欢 吃 饺子 吗？",
            "Nǐ xǐhuan chī bāozi ma?\n你 喜欢 吃 包子 吗？",
            "Tā xǐhuan chī jiǎozi ma?\n他 喜欢 吃 饺子 吗？"
        ),
        audioToSpeak = "你喜欢吃饺子吗？"
    ),

    // 7. Soal 7: Pilihan Gambar (饺子 -> pangsit)
    Exercise(
        id = "u7_s3_p1_q7",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "饺子",
        targetPinyin = "jiǎozi",
        targetTranslation = "pangsit",
        correctAnswer = "pangsit",
        audioToSpeak = "饺子",
        pictureOptions = listOf(
            PictureOption("u7_s3_p1_opt7_1", "pangsit", "", R.drawable.ic_food_dumpling, true),
            PictureOption("u7_s3_p1_opt7_2", "nasi putih", "", R.drawable.ic_food_rice, false),
            PictureOption("u7_s3_p1_opt7_3", "mie", "", R.drawable.ic_food_noodles, false),
            PictureOption("u7_s3_p1_opt7_4", "bakpao", "", R.drawable.ic_food_baozi, false)
        )
    ),

    // 8. Soal 8: Ketik Pinyin (pangsit -> jiǎozi)
    Exercise(
        id = "u7_s3_p1_q8",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "pangsit (dumpling)",
        sentenceWithBlank = "饺子 (________)",
        targetHanzi = "饺子",
        targetPinyin = "jiǎozi",
        correctAnswer = "jiaozi",
        keyboardKeys = listOf("j", "i", "a", "o", "z", "e", "u", "b", "d", "g", "h"),
        audioToSpeak = "饺子"
    ),

    // 9. Soal 9: Susun Kalimat (Kami makan pangsit bersama.)
    Exercise(
        id = "u7_s3_p1_q9",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Kami makan pangsit.",
        targetHanzi = "我们 吃 饺子。",
        targetPinyin = "Wǒmen chī jiǎozi.",
        wordChips = listOf("我们:wǒmen", "吃:chī", "饺子:jiǎozi", "包子:bāozi", "他们:tāmen"),
        correctAnswer = "我们,吃,饺子",
        audioToSpeak = "我们吃饺子。"
    ),

    // 10. Soal 10: Ketuk Pasangan yang Sesuai (Rangkuman Bakpao & Pangsit)
    Exercise(
        id = "u7_s3_p1_m10_1",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u7_s3_p1_m10_1", "包子", "bāozi", "bakpao"),
            MatchPairItem("u7_s3_p1_m10_2", "饺子", "jiǎozi", "pangsit"),
            MatchPairItem("u7_s3_p1_m10_3", "很好吃", "hěn hǎochī", "sangat enak"),
            MatchPairItem("u7_s3_p1_m10_4", "喜欢吃", "xǐhuan chī", "suka makan")
        )
    )
)

val bab7Stage3Part2Exercises = listOf(
    // 1. Soal 1: Pilihan Gambar (鸡蛋 -> telur)
    Exercise(
        id = "u7_s3_p2_q1",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "鸡蛋",
        targetPinyin = "jīdàn",
        targetTranslation = "telur",
        correctAnswer = "telur",
        audioToSpeak = "鸡蛋",
        pictureOptions = listOf(
            PictureOption("u7_s3_p2_opt1", "telur", "", R.drawable.ic_food_egg, true),
            PictureOption("u7_s3_p2_opt2", "apel", "", R.drawable.ic_food_apple, false),
            PictureOption("u7_s3_p2_opt3", "roti", "", R.drawable.ic_food_bread, false),
            PictureOption("u7_s3_p2_opt4", "teh", "", R.drawable.ic_food_tea, false)
        )
    ),

    // 2. Soal 2: Susun Kalimat (Saya makan satu butir telur.)
    Exercise(
        id = "u7_s3_p2_q2",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Saya makan sebutir telur.",
        targetHanzi = "我 吃 一个 鸡蛋。",
        targetPinyin = "Wǒ chī yí gè jīdàn.",
        wordChips = listOf("我:wǒ", "吃:chī", "一个:yí gè", "鸡蛋:jīdàn", "两个:liǎng gè", "面包:miànbāo"),
        correctAnswer = "我,吃,一个,鸡蛋",
        audioToSpeak = "我吃一个鸡蛋。"
    ),

    // 3. Soal 3: Ketuk Pasangan yang Sesuai (Telur & Makanan)
    Exercise(
        id = "u7_s3_p2_q3",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u7_s3_p2_m1", "鸡蛋", "jīdàn", "telur"),
            MatchPairItem("u7_s3_p2_m2", "一个鸡蛋", "yí gè jīdàn", "sebutir telur"),
            MatchPairItem("u7_s3_p2_m3", "鸡蛋面条儿", "jīdàn miàntiáor", "mie telur"),
            MatchPairItem("u7_s3_p2_m4", "好吃", "hǎochī", "enak / lezat")
        )
    ),

    // 4. Soal 4: Ketik Pinyin (telur -> jīdàn)
    Exercise(
        id = "u7_s3_p2_q4",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "telur",
        sentenceWithBlank = "鸡蛋 (________)",
        targetHanzi = "鸡蛋",
        targetPinyin = "jīdàn",
        correctAnswer = "jidan",
        keyboardKeys = listOf("j", "i", "d", "a", "n", "e", "o", "u", "b", "g", "h"),
        audioToSpeak = "鸡蛋"
    ),

    // 5. Soal 5: Mendengar Kalimat (Rule 10: illustrationRes = 0)
    Exercise(
        id = "u7_s3_p2_q5",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Apa yang Anda dengar?",
        targetTranslation = "Sarapan saya makan telur dan roti.",
        targetHanzi = "早饭 我 吃 鸡蛋 和 面包。",
        targetPinyin = "Zǎofàn wǒ chī jīdàn hé miànbāo.",
        wordChips = listOf("早饭:zǎofàn", "我:wǒ", "吃:chī", "鸡蛋:jīdàn", "和:hé", "面包:miànbāo"),
        correctAnswer = "早饭,我,吃,鸡蛋,和,面包",
        illustrationRes = 0,
        audioToSpeak = "早饭我吃鸡蛋和面包。"
    ),

    // 6. Soal 6: Pilihan Kalimat
    Exercise(
        id = "u7_s3_p2_q6",
        type = ExerciseType.SENTENCE_CHOICE,
        title = "Pilih terjemahan yang benar",
        targetHanzi = "鸡蛋 面条儿 很 好吃。",
        targetPinyin = "Jīdàn miàntiáor hěn hǎochī.",
        targetTranslation = "Mie telur sangat lezat.",
        correctAnswer = "Jīdàn miàntiáor hěn hǎochī.\n鸡蛋 面条儿 很 好吃。",
        options = listOf(
            "Jīdàn miàntiáor hěn hǎochī.\n鸡蛋 面条儿 很 好吃。",
            "Jīdàn mǐfàn hěn hǎochī.\n鸡蛋 米饭 很 好吃。",
            "Jīdàn bāozi hěn hǎochī.\n鸡蛋 包子 很 好吃。"
        ),
        audioToSpeak = "鸡蛋面条儿很好吃。"
    ),

    // 7. Soal 7: Pilihan Gambar (好吃 -> enak / lezat)
    Exercise(
        id = "u7_s3_p2_q7",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "好吃",
        targetPinyin = "hǎochī",
        targetTranslation = "enak / lezat",
        correctAnswer = "enak / lezat",
        audioToSpeak = "好吃",
        pictureOptions = listOf(
            PictureOption("u7_s3_p2_opt7_1", "enak / lezat", "", R.drawable.ic_food_delicious, true),
            PictureOption("u7_s3_p2_opt7_2", "roti", "", R.drawable.ic_food_bread, false),
            PictureOption("u7_s3_p2_opt7_3", "minum", "", R.drawable.ic_action_drink, false),
            PictureOption("u7_s3_p2_opt7_4", "tidur", "", R.drawable.ic_action_sleep, false)
        )
    ),

    // 8. Soal 8: Ketik Pinyin (enak -> hǎochī)
    Exercise(
        id = "u7_s3_p2_q8",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "enak / lezat",
        sentenceWithBlank = "好吃 (________)",
        targetHanzi = "好吃",
        targetPinyin = "hǎochī",
        correctAnswer = "haochi",
        keyboardKeys = listOf("h", "a", "o", "c", "i", "e", "u", "b", "d", "g", "j"),
        audioToSpeak = "好吃"
    ),

    // 9. Soal 9: Susun Kalimat (Masakan ini sangat enak.)
    Exercise(
        id = "u7_s3_p2_q9",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Masakan ini sangat lezat.",
        targetHanzi = "这个 菜 很 好吃。",
        targetPinyin = "Zhège cài hěn hǎochī.",
        wordChips = listOf("这个:zhège", "菜:cài", "很:hěn", "好吃:hǎochī", "不好吃:bù hǎochī"),
        correctAnswer = "这个,菜,很,好吃",
        audioToSpeak = "这个菜很好吃。"
    ),

    // 10. Soal 10: Ketuk Pasangan yang Sesuai (Rangkuman Telur & Rasa)
    Exercise(
        id = "u7_s3_p2_m10_1",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u7_s3_p2_m10_1", "鸡蛋", "jīdàn", "telur"),
            MatchPairItem("u7_s3_p2_m10_2", "好吃", "hǎochī", "enak / lezat"),
            MatchPairItem("u7_s3_p2_m10_3", "这个菜", "zhè gè cài", "masakan ini"),
            MatchPairItem("u7_s3_p2_m10_4", "吃鸡蛋", "chī jīdàn", "makan telur")
        )
    )
)
