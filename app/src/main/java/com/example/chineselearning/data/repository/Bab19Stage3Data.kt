package com.example.chineselearning.data.repository

import com.example.chineselearning.R
import com.example.chineselearning.data.model.Exercise
import com.example.chineselearning.data.model.ExerciseType
import com.example.chineselearning.data.model.MatchPairItem
import com.example.chineselearning.data.model.PictureOption

val bab19Stage3Part1Exercises = listOf(
    // 1. Soal 1: Pilihan Gambar (红茶 -> teh hitam)
    Exercise(
        id = "u19_s3_p1_q1",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "红茶",
        targetPinyin = "hóngchá",
        targetTranslation = "teh hitam",
        correctAnswer = "teh hitam",
        audioToSpeak = "红茶",
        pictureOptions = listOf(
            PictureOption("u19_s3_p1_opt1", "teh hitam", "", R.drawable.ic_drink_black_tea, true),
            PictureOption("u19_s3_p1_opt2", "teh hijau", "", R.drawable.ic_drink_green_tea, false),
            PictureOption("u19_s3_p1_opt3", "kopi", "", R.drawable.ic_drink_coffee, false),
            PictureOption("u19_s3_p1_opt4", "cangkir", "", R.drawable.ic_food_cup, false)
        )
    ),

    // 2. Soal 2: Susun Kalimat (Tolong beri saya segelas teh hitam panas.)
    Exercise(
        id = "u19_s3_p1_q2",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Beri saya segelas teh hitam.",
        targetHanzi = "请 给 我 一 杯 热 红茶。",
        targetPinyin = "Qǐng gěi wǒ yì bēi rè hóngchá.",
        wordChips = listOf("请:qǐng", "给:gěi", "我:wǒ", "一:yì", "杯:bēi", "热:rè", "红茶。:hóngchá.", "绿茶:lǜchá"),
        correctAnswer = "请,给,我,一,杯,热,红茶。",
        audioToSpeak = "请给我一杯热红茶。"
    ),

    // 3. Soal 3: Ketuk Pasangan yang Sesuai (Teh Hitam & Teh Hijau)
    Exercise(
        id = "u19_s3_p1_q3",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u19_s3_p1_m1", "红茶", "hóngchá", "teh hitam"),
            MatchPairItem("u19_s3_p1_m2", "绿茶", "lǜchá", "teh hijau"),
            MatchPairItem("u19_s3_p1_m3", "一杯茶", "yì bēi chá", "segelas teh"),
            MatchPairItem("u19_s3_p1_m4", "喝茶", "hē chá", "minum teh")
        )
    ),

    // 4. Soal 4: Ketik Pinyin (teh hitam -> hóngchá)
    Exercise(
        id = "u19_s3_p1_q4",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "teh hitam",
        sentenceWithBlank = "红茶 (________)",
        targetHanzi = "红茶",
        targetPinyin = "hóngchá",
        correctAnswer = "hongcha",
        keyboardKeys = listOf("h", "o", "n", "g", "c", "a", "e", "i", "u", "b", "d", "j"),
        audioToSpeak = "红茶"
    ),

    // 5. Soal 5: Mendengar Kalimat (Rule 10: illustrationRes = 0)
    Exercise(
        id = "u19_s3_p1_q5",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Apa yang Anda dengar?",
        targetTranslation = "Minum teh hijau sangat baik untuk kesehatan.",
        targetHanzi = "喝 绿茶 对 身体 很 好。",
        targetPinyin = "Hē lǜchá duì shēntǐ hěn hǎo.",
        wordChips = listOf("喝:hē", "绿茶:lǜchá", "对:duì", "身体:shēntǐ", "很:hěn", "好。:hǎo.", "红茶:hóngchá"),
        correctAnswer = "喝,绿茶,对,身体,很,好。",
        illustrationRes = 0,
        audioToSpeak = "喝绿茶对身体很好。"
    ),

    // 6. Soal 6: Pilihan Kalimat
    Exercise(
        id = "u19_s3_p1_q6",
        type = ExerciseType.SENTENCE_CHOICE,
        title = "Pilih terjemahan yang benar",
        targetHanzi = "中国 人 很 喜欢 喝 绿茶。",
        targetPinyin = "Zhōngguó rén hěn xǐhuan hē lǜchá.",
        targetTranslation = "Orang Tiongkok sangat suka minum teh hijau.",
        correctAnswer = "Zhōngguó rén hěn xǐhuan hē lǜchá.\n中国 人 很 喜欢 喝 绿茶。",
        options = listOf(
            "Zhōngguó rén hěn xǐhuan hē lǜchá.\n中国 人 很 喜欢 喝 绿茶。",
            "Zhōngguó rén bù xǐhuan hē lǜchá.\n中国 人 不 喜欢 喝 绿茶。",
            "Yìnní rén hěn xǐhuan hē lǜchá.\n印尼 人 很 喜欢 喝 绿茶。"
        ),
        audioToSpeak = "中国人很喜欢喝绿茶。"
    ),

    // 7. Soal 7: Pilihan Gambar (绿茶 -> teh hijau)
    Exercise(
        id = "u19_s3_p1_q7",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "绿茶",
        targetPinyin = "lǜchá",
        targetTranslation = "teh hijau",
        correctAnswer = "teh hijau",
        audioToSpeak = "绿茶",
        pictureOptions = listOf(
            PictureOption("u19_s3_p1_opt7_1", "teh hijau", "", R.drawable.ic_drink_green_tea, true),
            PictureOption("u19_s3_p1_opt7_2", "teh hitam", "", R.drawable.ic_drink_black_tea, false),
            PictureOption("u19_s3_p1_opt7_3", "kopi", "", R.drawable.ic_drink_coffee, false),
            PictureOption("u19_s3_p1_opt7_4", "cangkir", "", R.drawable.ic_food_cup, false)
        )
    ),

    // 8. Soal 8: Ketik Pinyin (teh hijau -> lǜchá)
    Exercise(
        id = "u19_s3_p1_q8",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "teh hijau",
        sentenceWithBlank = "绿茶 (________)",
        targetHanzi = "绿茶",
        targetPinyin = "lǜchá",
        correctAnswer = "lvcha",
        keyboardKeys = listOf("l", "v", "c", "h", "a", "e", "i", "o", "u", "b", "d", "g"),
        audioToSpeak = "绿茶"
    ),

    // 9. Soal 9: Susun Kalimat (Ayah setiap hari minum teh hijau.)
    Exercise(
        id = "u19_s3_p1_q9",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Ayah tiap hari minum teh hijau.",
        targetHanzi = "爸爸 每天 喝 绿茶。",
        targetPinyin = "Bàba měitiān hē lǜchá.",
        wordChips = listOf("爸爸:bàba", "每天:měitiān", "喝:hē", "绿茶。:lǜchá.", "牛奶:niúnǎi"),
        correctAnswer = "爸爸,每天,喝,绿茶。",
        audioToSpeak = "爸爸每天喝绿茶。"
    ),

    // 10. Soal 10: Ketuk Pasangan yang Sesuai (Rangkuman Tradisi Minum Teh)
    Exercise(
        id = "u19_s3_p1_m10",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u19_s3_p1_m10_1", "红茶", "hóngchá", "teh hitam"),
            MatchPairItem("u19_s3_p1_m10_2", "绿茶", "lǜchá", "teh hijau"),
            MatchPairItem("u19_s3_p1_m10_3", "好身体", "hǎo shēntǐ", "badan sehat"),
            MatchPairItem("u19_s3_p1_m10_4", "每天喝", "měitiān hē", "minum tiap hari")
        )
    )
)

val bab19Stage3Part2Exercises = listOf(
    // 1. Soal 1: Pilihan Gambar (奶茶 -> teh susu / milk tea)
    Exercise(
        id = "u19_s3_p2_q1",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "奶茶",
        targetPinyin = "nǎichá",
        targetTranslation = "teh susu / milk tea",
        correctAnswer = "teh susu / milk tea",
        audioToSpeak = "奶茶",
        pictureOptions = listOf(
            PictureOption("u19_s3_p2_opt1", "teh susu", "", R.drawable.ic_food_cup, true),
            PictureOption("u19_s3_p2_opt2", "teh hitam", "", R.drawable.ic_drink_black_tea, false),
            PictureOption("u19_s3_p2_opt3", "teh hijau", "", R.drawable.ic_drink_green_tea, false),
            PictureOption("u19_s3_p2_opt4", "kopi", "", R.drawable.ic_drink_coffee, false)
        )
    ),

    // 2. Soal 2: Susun Kalimat (Banyak anak muda suka minum teh susu.)
    Exercise(
        id = "u19_s3_p2_q2",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Anak muda suka minum teh susu.",
        targetHanzi = "年轻人 喜欢 喝 奶茶。",
        targetPinyin = "Niánqīngrén xǐhuan hē nǎichá.",
        wordChips = listOf("年轻人:niánqīngrén", "喜欢:xǐhuan", "喝:hē", "奶茶。:nǎichá.", "水:shuǐ"),
        correctAnswer = "年轻人,喜欢,喝,奶茶。",
        audioToSpeak = "年轻人喜欢喝奶茶。"
    ),

    // 3. Soal 3: Ketuk Pasangan yang Sesuai (Teh Susu & Kopi)
    Exercise(
        id = "u19_s3_p2_m3",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u19_s3_p2_m1", "奶茶", "nǎichá", "teh susu / boba"),
            MatchPairItem("u19_s3_p2_m2", "咖啡", "kāfēi", "kopi"),
            MatchPairItem("u19_s3_p2_m3", "喝咖啡", "hē kāfēi", "minum kopi"),
            MatchPairItem("u19_s3_p2_m4", "甜奶茶", "tián nǎichá", "teh susu manis")
        )
    ),

    // 4. Soal 4: Ketik Pinyin (teh susu -> nǎichá)
    Exercise(
        id = "u19_s3_p2_q4",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "teh susu / milk tea",
        sentenceWithBlank = "奶茶 (________)",
        targetHanzi = "奶茶",
        targetPinyin = "nǎichá",
        correctAnswer = "naicha",
        keyboardKeys = listOf("n", "a", "i", "c", "h", "e", "o", "u", "b", "d", "g", "j"),
        audioToSpeak = "奶茶"
    ),

    // 5. Soal 5: Mendengar Kalimat (Rule 10: illustrationRes = 0)
    Exercise(
        id = "u19_s3_p2_q5",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Apa yang Anda dengar?",
        targetTranslation = "Pagi hari saya minum segelas kopi hitam.",
        targetHanzi = "早上 我 喝 了 一 杯 咖啡。",
        targetPinyin = "Zǎoshang wǒ hē le yì bēi kāfēi.",
        wordChips = listOf("早上:zǎoshang", "我:wǒ", "喝:hē", "了:le", "一:yì", "杯:bēi", "咖啡。:kāfēi.", "茶:chá"),
        correctAnswer = "早上,我,喝,了,一,杯,咖啡。",
        illustrationRes = 0,
        audioToSpeak = "早上我喝了一杯咖啡。"
    ),

    // 6. Soal 6: Pilihan Kalimat
    Exercise(
        id = "u19_s3_p2_q6",
        type = ExerciseType.SENTENCE_CHOICE,
        title = "Pilih terjemahan yang benar",
        targetHanzi = "你 想 喝 咖啡 还是 喝 茶？",
        targetPinyin = "Nǐ xiǎng hē kāfēi háishi hē chá?",
        targetTranslation = "Kamu ingin minum kopi atau minum teh?",
        correctAnswer = "Nǐ xiǎng hē kāfēi háishi hē chá?\n你 想 喝 咖啡 还是 喝 茶？",
        options = listOf(
            "Nǐ xiǎng hē kāfēi háishi hē chá?\n你 想 喝 咖啡 还是 喝 茶？",
            "Nǐ xiǎng hē kāfēi hé chá ma?\n你 想 喝 咖啡 和 茶 吗？",
            "Tā xiǎng hē kāfēi háishi hē chá?\n他 想 喝 咖啡 还是 喝 茶？"
        ),
        audioToSpeak = "你想喝咖啡还是喝茶？"
    ),

    // 7. Soal 7: Pilihan Gambar (咖啡 -> kopi)
    Exercise(
        id = "u19_s3_p2_q7",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "咖啡",
        targetPinyin = "kāfēi",
        targetTranslation = "kopi",
        correctAnswer = "kopi",
        audioToSpeak = "咖啡",
        pictureOptions = listOf(
            PictureOption("u19_s3_p2_opt7_1", "kopi", "", R.drawable.ic_drink_coffee, true),
            PictureOption("u19_s3_p2_opt7_2", "teh hitam", "", R.drawable.ic_drink_black_tea, false),
            PictureOption("u19_s3_p2_opt7_3", "teh hijau", "", R.drawable.ic_drink_green_tea, false),
            PictureOption("u19_s3_p2_opt7_4", "cangkir", "", R.drawable.ic_food_cup, false)
        )
    ),

    // 8. Soal 8: Ketik Pinyin (kopi -> kāfēi)
    Exercise(
        id = "u19_s3_p2_q8",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "kopi",
        sentenceWithBlank = "咖啡 (________)",
        targetHanzi = "咖啡",
        targetPinyin = "kāfēi",
        correctAnswer = "kafei",
        keyboardKeys = listOf("k", "a", "f", "e", "i", "o", "u", "b", "d", "g", "h", "j"),
        audioToSpeak = "咖啡"
    ),

    // 9. Soal 9: Susun Kalimat (Secangkir kopi ini tidak manis.)
    Exercise(
        id = "u19_s3_p2_q9",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Kopi ini tidak manis.",
        targetHanzi = "这 杯 咖啡 不 甜。",
        targetPinyin = "Zhè bēi kāfēi bù tián.",
        wordChips = listOf("这:zhè", "杯:bēi", "咖啡:kāfēi", "不:bù", "甜。:tián.", "热:rè"),
        correctAnswer = "这,杯,咖啡,不,甜。",
        audioToSpeak = "这杯咖啡不甜。"
    ),

    // 10. Soal 10: Ketuk Pasangan yang Sesuai (Rangkuman Ragam Minuman Populer)
    Exercise(
        id = "u19_s3_p2_m10",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u19_s3_p2_m10_1", "奶茶", "nǎichá", "teh susu"),
            MatchPairItem("u19_s3_p2_m10_2", "咖啡", "kāfēi", "kopi"),
            MatchPairItem("u19_s3_p2_m10_3", "一杯咖啡", "yì bēi kāfēi", "secangkir kopi"),
            MatchPairItem("u19_s3_p2_m10_4", "热饮", "rèyǐn", "minuman panas")
        )
    )
)
