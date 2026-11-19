package com.example.chineselearning.data.repository

import com.example.chineselearning.R
import com.example.chineselearning.data.model.Exercise
import com.example.chineselearning.data.model.ExerciseType
import com.example.chineselearning.data.model.MatchPairItem
import com.example.chineselearning.data.model.PictureOption

val bab7Stage6Part1Exercises = listOf(
    // 1. Soal 1: Pilihan Gambar (茶 -> teh)
    Exercise(
        id = "u7_s6_p1_q1",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "茶",
        targetPinyin = "chá",
        targetTranslation = "teh",
        correctAnswer = "teh",
        audioToSpeak = "茶",
        pictureOptions = listOf(
            PictureOption("u7_s6_p1_opt1", "teh", "", R.drawable.ic_food_tea, true),
            PictureOption("u7_s6_p1_opt2", "air", "", R.drawable.ic_food_water, false),
            PictureOption("u7_s6_p1_opt3", "mie", "", R.drawable.ic_food_noodles, false),
            PictureOption("u7_s6_p1_opt4", "nasi putih", "", R.drawable.ic_food_rice, false)
        )
    ),

    // 2. Soal 2: Susun Kalimat (Masakan Tiongkok sangat enak.)
    Exercise(
        id = "u7_s6_p1_q2",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Masakan Tiongkok sangat lezat.",
        targetHanzi = "中国 菜 很 好吃。",
        targetPinyin = "Zhōngguó cài hěn hǎochī.",
        wordChips = listOf("中国:Zhōngguó", "菜:cài", "很:hěn", "好吃:hǎochī", "北京:Běijīng", "茶:chá"),
        correctAnswer = "中国,菜,很,好吃",
        audioToSpeak = "中国菜很好吃。"
    ),

    // 3. Soal 3: Ketuk Pasangan yang Sesuai (Rangkuman Kuliner)
    Exercise(
        id = "u7_s6_p1_q3",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u7_s6_p1_m1", "米饭", "mǐfàn", "nasi putih"),
            MatchPairItem("u7_s6_p1_m2", "面条儿", "miàntiáor", "mie"),
            MatchPairItem("u7_s6_p1_m3", "包子", "bāozi", "bakpao"),
            MatchPairItem("u7_s6_p1_m4", "饺子", "jiǎozi", "pangsit")
        )
    ),

    // 4. Soal 4: Ketik Pinyin (lezat -> hǎochī)
    Exercise(
        id = "u7_s6_p1_q4",
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

    // 5. Soal 5: Mendengar Kalimat (Rule 10: illustrationRes = 0)
    Exercise(
        id = "u7_s6_p1_q5",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Apa yang Anda dengar?",
        targetTranslation = "Saya ingin minum secangkir teh.",
        targetHanzi = "我 想 喝 一杯 茶。",
        targetPinyin = "Wǒ xiǎng hē yìbēi chá.",
        wordChips = listOf("我:wǒ", "想:xiǎng", "喝:hē", "一杯:yìbēi", "茶:chá", "水:shuǐ"),
        correctAnswer = "我,想,喝,一杯,茶",
        illustrationRes = 0,
        audioToSpeak = "我想喝一杯茶。"
    ),

    // 6. Soal 6: Pilihan Kalimat
    Exercise(
        id = "u7_s6_p1_q6",
        type = ExerciseType.SENTENCE_CHOICE,
        title = "Pilih terjemahan yang benar",
        targetHanzi = "服务员， 我们 想 吃 饺子。",
        targetPinyin = "Fúwùyuán, wǒmen xiǎng chī jiǎozi.",
        targetTranslation = "Pelayan, kami ingin makan pangsit.",
        correctAnswer = "Fúwùyuán, wǒmen xiǎng chī jiǎozi.\n服务员， 我们 想 吃 饺子。",
        options = listOf(
            "Fúwùyuán, wǒmen xiǎng chī jiǎozi.\n服务员， 我们 想 吃 饺子。",
            "Fúwùyuán, wǒmen xiǎng chī bāozi.\n服务员， 我们 想 吃 包子。",
            "Fúwùyuán, wǒmen xiǎng hē chá.\n服务员， 我们 想 喝 茶。"
        ),
        audioToSpeak = "服务员，我们想吃饺子。"
    ),

    // 7. Soal 7: Pilihan Gambar (米饭 -> nasi)
    Exercise(
        id = "u7_s6_p1_q7",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "米饭",
        targetPinyin = "mǐfàn",
        targetTranslation = "nasi putih",
        correctAnswer = "nasi putih",
        audioToSpeak = "米饭",
        pictureOptions = listOf(
            PictureOption("u7_s6_p1_opt7_1", "nasi putih", "", R.drawable.ic_food_rice, true),
            PictureOption("u7_s6_p1_opt7_2", "mie", "", R.drawable.ic_food_noodles, false),
            PictureOption("u7_s6_p1_opt7_3", "apel", "", R.drawable.ic_food_apple, false),
            PictureOption("u7_s6_p1_opt7_4", "telur", "", R.drawable.ic_food_egg, false)
        )
    ),

    // 8. Soal 8: Ketik Pinyin (nasi putih -> mǐfàn)
    Exercise(
        id = "u7_s6_p1_q8",
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

    // 9. Soal 9: Susun Kalimat (Saya makan apel.)
    Exercise(
        id = "u7_s6_p1_q9",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Saya makan sebuah apel.",
        targetHanzi = "我 吃 一个 苹果。",
        targetPinyin = "Wǒ chī yí gè píngguǒ.",
        wordChips = listOf("我:wǒ", "吃:chī", "一个:yí gè", "苹果:píngguǒ", "鸡蛋:jīdàn", "两个:liǎng gè"),
        correctAnswer = "我,吃,一个,苹果",
        audioToSpeak = "我吃一个苹果。"
    ),

    // 10. Soal 10: Ketuk Pasangan yang Sesuai (Rangkuman Makanan Sehat)
    Exercise(
        id = "u7_s6_p1_m10_1",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u7_s6_p1_m10_1", "水果", "shuǐguǒ", "buah-buahan"),
            MatchPairItem("u7_s6_p1_m10_2", "苹果", "píngguǒ", "apel"),
            MatchPairItem("u7_s6_p1_m10_3", "牛奶", "niúnǎi", "susu"),
            MatchPairItem("u7_s6_p1_m10_4", "鸡蛋", "jīdàn", "telur")
        )
    )
)

val bab7Stage6Part2Exercises = listOf(
    // 1. Soal 1: Pilihan Gambar (饺子 -> pangsit)
    Exercise(
        id = "u7_s6_p2_q1",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "饺子",
        targetPinyin = "jiǎozi",
        targetTranslation = "pangsit",
        correctAnswer = "pangsit",
        audioToSpeak = "饺子",
        pictureOptions = listOf(
            PictureOption("u7_s6_p2_opt1", "pangsit", "", R.drawable.ic_food_dumpling, true),
            PictureOption("u7_s6_p2_opt2", "nasi putih", "", R.drawable.ic_food_rice, false),
            PictureOption("u7_s6_p2_opt3", "roti", "", R.drawable.ic_food_bread, false),
            PictureOption("u7_s6_p2_opt4", "bakpao", "", R.drawable.ic_food_baozi, false)
        )
    ),

    // 2. Soal 2: Susun Kalimat (Ibu saya memasak masakan yang sangat enak.)
    Exercise(
        id = "u7_s6_p2_q2",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Ibu memasak masakan sangat enak.",
        targetHanzi = "妈妈 做 的 菜 很 好吃。",
        targetPinyin = "Māma zuò de cài hěn hǎochī.",
        wordChips = listOf("妈妈:māma", "做:zuò", "的:de", "菜:cài", "很:hěn", "好吃:hǎochī", "爸爸:bàba"),
        correctAnswer = "妈妈,做,的,菜,很,好吃",
        audioToSpeak = "妈妈做的菜很好吃。"
    ),

    // 3. Soal 3: Ketuk Pasangan yang Sesuai (Grand Review Bab 7)
    Exercise(
        id = "u7_s6_p2_m3",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u7_s6_p2_m1", "饭店", "fàndiàn", "restoran"),
            MatchPairItem("u7_s6_p2_m2", "做饭", "zuò fàn", "memasak"),
            MatchPairItem("u7_s6_p2_m3", "多少钱", "duōshao qián", "berapa harganya"),
            MatchPairItem("u7_s6_p2_m4", "面包", "miànbāo", "roti")
        )
    ),

    // 4. Soal 4: Ketik Pinyin (pangsit -> jiǎozi)
    Exercise(
        id = "u7_s6_p2_q4",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "pangsit",
        sentenceWithBlank = "饺子 (________)",
        targetHanzi = "饺子",
        targetPinyin = "jiǎozi",
        correctAnswer = "jiaozi",
        keyboardKeys = listOf("j", "i", "a", "o", "z", "e", "u", "b", "d", "g", "h"),
        audioToSpeak = "饺子"
    ),

    // 5. Soal 5: Mendengar Kalimat (Rule 10: illustrationRes = 0)
    Exercise(
        id = "u7_s6_p2_q5",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Apa yang Anda dengar?",
        targetTranslation = "Kami pergi ke restoran makan masakan Tiongkok.",
        targetHanzi = "我们 去 饭店 吃 中国 菜。",
        targetPinyin = "Wǒmen qù fàndiàn chī Zhōngguó cài.",
        wordChips = listOf("我们:wǒmen", "去:qù", "饭店:fàndiàn", "吃:chī", "中国:Zhōngguó", "菜:cài"),
        correctAnswer = "我们,去,饭店,吃,中国,菜",
        illustrationRes = 0,
        audioToSpeak = "我们去饭店吃中国菜。"
    ),

    // 6. Soal 6: Pilihan Kalimat
    Exercise(
        id = "u7_s6_p2_q6",
        type = ExerciseType.SENTENCE_CHOICE,
        title = "Pilih terjemahan yang benar",
        targetHanzi = "你 想 吃 米饭 还是 面条儿？",
        targetPinyin = "Nǐ xiǎng chī mǐfàn háishi miàntiáor?",
        targetTranslation = "Kamu ingin makan nasi atau mie?",
        correctAnswer = "Nǐ xiǎng chī mǐfàn háishi miàntiáor?\n你 想 吃 米饭 还是 面条儿？",
        options = listOf(
            "Nǐ xiǎng chī mǐfàn háishi miàntiáor?\n你 想 吃 米饭 还是 面条儿？",
            "Nǐ xiǎng chī bāozi háishi jiǎozi?\n你 想 吃 包子 还是 饺子？",
            "Tā xiǎng chī mǐfàn háishi miàntiáor?\n他 想 吃 米饭 还是 面条儿？"
        ),
        audioToSpeak = "你想吃米饭还是面条儿？"
    ),

    // 7. Soal 7: Pilihan Gambar (饭店 -> restoran)
    Exercise(
        id = "u7_s6_p2_q7",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "饭店",
        targetPinyin = "fàndiàn",
        targetTranslation = "restoran",
        correctAnswer = "restoran",
        audioToSpeak = "饭店",
        pictureOptions = listOf(
            PictureOption("u7_s6_p2_opt7_1", "restoran", "", R.drawable.ic_food_restaurant, true),
            PictureOption("u7_s6_p2_opt7_2", "rumah", "", R.drawable.ic_fam_home, false),
            PictureOption("u7_s6_p2_opt7_3", "kamar", "", R.drawable.ic_fam_room, false),
            PictureOption("u7_s6_p2_opt7_4", "meja", "", R.drawable.ic_fam_table, false)
        )
    ),

    // 8. Soal 8: Ketik Pinyin (restoran -> fàndiàn)
    Exercise(
        id = "u7_s6_p2_q8",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "restoran",
        sentenceWithBlank = "饭店 (________)",
        targetHanzi = "饭店",
        targetPinyin = "fàndiàn",
        correctAnswer = "fandian",
        keyboardKeys = listOf("f", "a", "n", "d", "i", "e", "o", "u", "b", "g", "h"),
        audioToSpeak = "饭店"
    ),

    // 9. Soal 9: Susun Kalimat (Grand Evaluasi Bab 7)
    Exercise(
        id = "u7_s6_p2_q9",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Makanan ini sangat enak dimakan.",
        targetHanzi = "这个 菜 很 好吃。",
        targetPinyin = "Zhège cài hěn hǎochī.",
        wordChips = listOf("这个:zhège", "菜:cài", "很:hěn", "好吃:hǎochī", "饭店:fàndiàn"),
        correctAnswer = "这个,菜,很,好吃",
        audioToSpeak = "这个菜很好吃。"
    ),

    // 10. Soal 10: Ketuk Pasangan yang Sesuai (Grand Review Makanan & Minuman)
    Exercise(
        id = "u7_s6_p2_m10_1",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u7_s6_p2_m10_1", "喝茶", "hē chá", "minum teh"),
            MatchPairItem("u7_s6_p2_m10_2", "喝水", "hē shuǐ", "minum air"),
            MatchPairItem("u7_s6_p2_m10_3", "吃米饭", "chī mǐfàn", "makan nasi"),
            MatchPairItem("u7_s6_p2_m10_4", "吃饺子", "chī jiǎozi", "makan pangsit")
        )
    )
)
