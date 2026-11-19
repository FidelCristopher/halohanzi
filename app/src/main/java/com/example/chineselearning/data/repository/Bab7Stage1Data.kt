package com.example.chineselearning.data.repository

import com.example.chineselearning.R
import com.example.chineselearning.data.model.Exercise
import com.example.chineselearning.data.model.ExerciseType
import com.example.chineselearning.data.model.MatchPairItem
import com.example.chineselearning.data.model.PictureOption

val bab7Stage1Part1Exercises = listOf(
    // 1. Soal 1: Pilihan Gambar (茶 -> teh)
    Exercise(
        id = "u7_s1_p1_q1",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "茶",
        targetPinyin = "chá",
        targetTranslation = "teh",
        correctAnswer = "teh",
        audioToSpeak = "茶",
        pictureOptions = listOf(
            PictureOption("u7_s1_p1_opt1", "teh", "", R.drawable.ic_food_tea, true),
            PictureOption("u7_s1_p1_opt2", "air", "", R.drawable.ic_food_water, false),
            PictureOption("u7_s1_p1_opt3", "apel", "", R.drawable.ic_food_apple, false),
            PictureOption("u7_s1_p1_opt4", "nasi", "", R.drawable.ic_food_rice, false)
        )
    ),

    // 2. Soal 2: Susun Kalimat (Saya ingin minum teh.)
    Exercise(
        id = "u7_s1_p1_q2",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Saya ingin minum teh.",
        targetHanzi = "我 想 喝 茶。",
        targetPinyin = "Wǒ xiǎng hē chá.",
        wordChips = listOf("我:wǒ", "想:xiǎng", "喝:hē", "茶:chá", "吃:chī", "水:shuǐ"),
        correctAnswer = "我,想,喝,茶",
        audioToSpeak = "我想喝茶。"
    ),

    // 3. Soal 3: Ketuk Pasangan yang Sesuai (Aktivitas Minum & Minuman)
    Exercise(
        id = "u7_s1_p1_q3",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u7_s1_p1_m1", "吃", "chī", "makan"),
            MatchPairItem("u7_s1_p1_m2", "喝", "hē", "minum"),
            MatchPairItem("u7_s1_p1_m3", "水", "shuǐ", "air"),
            MatchPairItem("u7_s1_p1_m4", "茶", "chá", "teh")
        )
    ),

    // 4. Soal 4: Ketik Pinyin (minum -> hē)
    Exercise(
        id = "u7_s1_p1_q4",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "minum",
        sentenceWithBlank = "喝 (________)",
        targetHanzi = "喝",
        targetPinyin = "hē",
        correctAnswer = "he",
        keyboardKeys = listOf("h", "e", "a", "i", "o", "u", "b", "d", "g", "j", "l"),
        audioToSpeak = "喝"
    ),

    // 5. Soal 5: Mendengar Kalimat (Rule 10: illustrationRes = 0)
    Exercise(
        id = "u7_s1_p1_q5",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Apa yang Anda dengar?",
        targetTranslation = "Dia minum air.",
        targetHanzi = "他 喝 水。",
        targetPinyin = "Tā hē shuǐ.",
        wordChips = listOf("他:tā", "喝:hē", "水:shuǐ", "茶:chá", "吃:chī"),
        correctAnswer = "他,喝,水",
        illustrationRes = 0,
        audioToSpeak = "他喝水。"
    ),

    // 6. Soal 6: Pilihan Kalimat
    Exercise(
        id = "u7_s1_p1_q6",
        type = ExerciseType.SENTENCE_CHOICE,
        title = "Pilih terjemahan yang benar",
        targetHanzi = "你 喝 茶 吗？",
        targetPinyin = "Nǐ hē chá ma?",
        targetTranslation = "Apakah kamu minum teh?",
        correctAnswer = "Nǐ hē chá ma?\n你 喝 茶 吗？",
        options = listOf(
            "Nǐ hē chá ma?\n你 喝 茶 吗？",
            "Nǐ hē shuǐ ma?\n你 喝 水 吗？",
            "Tā hē chá ma?\n他 喝 茶 吗？"
        ),
        audioToSpeak = "你喝茶吗？"
    ),

    // 7. Soal 7: Pilihan Gambar (水 -> air)
    Exercise(
        id = "u7_s1_p1_q7",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "水",
        targetPinyin = "shuǐ",
        targetTranslation = "air",
        correctAnswer = "air",
        audioToSpeak = "水",
        pictureOptions = listOf(
            PictureOption("u7_s1_p1_opt7_1", "air", "", R.drawable.ic_food_water, true),
            PictureOption("u7_s1_p1_opt7_2", "teh", "", R.drawable.ic_food_tea, false),
            PictureOption("u7_s1_p1_opt7_3", "susu", "", R.drawable.ic_food_milk, false),
            PictureOption("u7_s1_p1_opt7_4", "cangkir / gelas", "", R.drawable.ic_food_cup, false)
        )
    ),

    // 8. Soal 8: Ketik Pinyin (teh -> chá)
    Exercise(
        id = "u7_s1_p1_q8",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "teh",
        sentenceWithBlank = "茶 (________)",
        targetHanzi = "茶",
        targetPinyin = "chá",
        correctAnswer = "cha",
        keyboardKeys = listOf("c", "h", "a", "e", "i", "o", "u", "b", "d", "g", "j"),
        audioToSpeak = "茶"
    ),

    // 9. Soal 9: Susun Kalimat (Saya tidak minum teh.)
    Exercise(
        id = "u7_s1_p1_q9",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Saya tidak minum teh.",
        targetHanzi = "我 不 喝 茶。",
        targetPinyin = "Wǒ bù hē chá.",
        wordChips = listOf("我:wǒ", "不:bù", "喝:hē", "茶:chá", "水:shuǐ", "想:xiǎng"),
        correctAnswer = "我,不,喝,茶",
        audioToSpeak = "我不喝茶。"
    ),

    // 10. Soal 10: Ketuk Pasangan yang Sesuai (Minuman)
    Exercise(
        id = "u7_s1_p1_m10_1",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u7_s1_p1_m10_1", "喝茶", "hē chá", "minum teh"),
            MatchPairItem("u7_s1_p1_m10_2", "喝水", "hē shuǐ", "minum air"),
            MatchPairItem("u7_s1_p1_m10_3", "想喝", "xiǎng hē", "ingin minum"),
            MatchPairItem("u7_s1_p1_m10_4", "不喝", "bù hē", "tidak minum")
        )
    )
)

val bab7Stage1Part2Exercises = listOf(
    // 1. Soal 1: Pilihan Gambar (牛奶 -> susu)
    Exercise(
        id = "u7_s1_p2_q1",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "牛奶",
        targetPinyin = "niúnǎi",
        targetTranslation = "susu",
        correctAnswer = "susu",
        audioToSpeak = "牛奶",
        pictureOptions = listOf(
            PictureOption("u7_s1_p2_opt1", "susu", "", R.drawable.ic_food_milk, true),
            PictureOption("u7_s1_p2_opt2", "teh", "", R.drawable.ic_food_tea, false),
            PictureOption("u7_s1_p2_opt3", "air", "", R.drawable.ic_food_water, false),
            PictureOption("u7_s1_p2_opt4", "apel", "", R.drawable.ic_food_apple, false)
        )
    ),

    // 2. Soal 2: Susun Kalimat (Saya ingin minum segelas susu.)
    Exercise(
        id = "u7_s1_p2_q2",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Saya ingin minum segelas susu.",
        targetHanzi = "我 想 喝 一杯 牛奶。",
        targetPinyin = "Wǒ xiǎng hē yìbēi niúnǎi.",
        wordChips = listOf("我:wǒ", "想:xiǎng", "喝:hē", "一杯:yìbēi", "牛奶:niúnǎi", "茶:chá"),
        correctAnswer = "我,想,喝,一杯,牛奶",
        audioToSpeak = "我想喝一杯牛奶。"
    ),

    // 3. Soal 3: Ketuk Pasangan yang Sesuai (Wadah & Minuman)
    Exercise(
        id = "u7_s1_p2_q3",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u7_s1_p2_m1", "牛奶", "niúnǎi", "susu"),
            MatchPairItem("u7_s1_p2_m2", "杯子", "bēizi", "cangkir / gelas"),
            MatchPairItem("u7_s1_p2_m3", "一杯茶", "yì bēi chá", "secangkir teh"),
            MatchPairItem("u7_s1_p2_m4", "一杯水", "yì bēi shuǐ", "segelas air")
        )
    ),

    // 4. Soal 4: Ketik Pinyin (susu -> niúnǎi)
    Exercise(
        id = "u7_s1_p2_q4",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "susu",
        sentenceWithBlank = "牛奶 (________)",
        targetHanzi = "牛奶",
        targetPinyin = "niúnǎi",
        correctAnswer = "niunai",
        keyboardKeys = listOf("n", "i", "u", "a", "e", "o", "b", "d", "g", "h", "j"),
        audioToSpeak = "牛奶"
    ),

    // 5. Soal 5: Mendengar Kalimat (Rule 10: illustrationRes = 0)
    Exercise(
        id = "u7_s1_p2_q5",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Apa yang Anda dengar?",
        targetTranslation = "Di atas meja ada sebuah cangkir.",
        targetHanzi = "桌子 上 有 一个 杯子。",
        targetPinyin = "Zhuōzi shang yǒu yí gè bēizi.",
        wordChips = listOf("桌子:zhuōzi", "上:shang", "有:yǒu", "一个:yí gè", "杯子:bēizi", "椅子:yǐzi"),
        correctAnswer = "桌子,上,有,一个,杯子",
        illustrationRes = 0,
        audioToSpeak = "桌子上有一个杯子。"
    ),

    // 6. Soal 6: Pilihan Kalimat
    Exercise(
        id = "u7_s1_p2_q6",
        type = ExerciseType.SENTENCE_CHOICE,
        title = "Pilih terjemahan yang benar",
        targetHanzi = "他 喝 了 一杯 牛奶。",
        targetPinyin = "Tā hē le yì bēi niúnǎi.",
        targetTranslation = "Dia minum segelas susu.",
        correctAnswer = "Tā hē le yì bēi niúnǎi.\n他 喝 了 一杯 牛奶。",
        options = listOf(
            "Tā hē le yì bēi niúnǎi.\n他 喝 了 一杯 牛奶。",
            "Wǒ hē le yì bēi niúnǎi.\n我 喝 了 一杯 牛奶。",
            "Tā hē le yì bēi chá.\n他 喝 了 一杯 茶。"
        ),
        audioToSpeak = "他喝了一杯牛奶。"
    ),

    // 7. Soal 7: Pilihan Gambar (杯子 -> cangkir / gelas)
    Exercise(
        id = "u7_s1_p2_q7",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "杯子",
        targetPinyin = "bēizi",
        targetTranslation = "cangkir / gelas",
        correctAnswer = "cangkir / gelas",
        audioToSpeak = "杯子",
        pictureOptions = listOf(
            PictureOption("u7_s1_p2_opt7_1", "cangkir / gelas", "", R.drawable.ic_food_cup, true),
            PictureOption("u7_s1_p2_opt7_2", "meja", "", R.drawable.ic_fam_table, false),
            PictureOption("u7_s1_p2_opt7_3", "kursi", "", R.drawable.ic_fam_chair, false),
            PictureOption("u7_s1_p2_opt7_4", "teh", "", R.drawable.ic_food_tea, false)
        )
    ),

    // 8. Soal 8: Ketik Pinyin (cangkir / gelas -> bēizi)
    Exercise(
        id = "u7_s1_p2_q8",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "cangkir / gelas",
        sentenceWithBlank = "杯子 (________)",
        targetHanzi = "杯子",
        targetPinyin = "bēizi",
        correctAnswer = "beizi",
        keyboardKeys = listOf("b", "e", "i", "z", "a", "o", "u", "d", "g", "h", "j"),
        audioToSpeak = "杯子"
    ),

    // 9. Soal 9: Susun Kalimat (Tolong beri saya segelas air.)
    Exercise(
        id = "u7_s1_p2_q9",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Beri saya segelas air.",
        targetHanzi = "给 我 一杯 水。",
        targetPinyin = "Gěi wǒ yìbēi shuǐ.",
        wordChips = listOf("给:gěi", "我:wǒ", "一杯:yìbēi", "水:shuǐ", "茶:chá", "牛奶:niúnǎi"),
        correctAnswer = "给,我,一杯,水",
        audioToSpeak = "给我一杯水。"
    ),

    // 10. Soal 10: Ketuk Pasangan yang Sesuai (Rangkuman Minuman & Wadah)
    Exercise(
        id = "u7_s1_p2_m10_1",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u7_s1_p2_m10_1", "牛奶", "niúnǎi", "susu"),
            MatchPairItem("u7_s1_p2_m10_2", "杯子", "bēizi", "cangkir / gelas"),
            MatchPairItem("u7_s1_p2_m10_3", "喝水", "hē shuǐ", "minum air"),
            MatchPairItem("u7_s1_p2_m10_4", "喝茶", "hē chá", "minum teh")
        )
    )
)
