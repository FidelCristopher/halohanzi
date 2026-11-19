package com.example.chineselearning.data.repository

import com.example.chineselearning.R
import com.example.chineselearning.data.model.Exercise
import com.example.chineselearning.data.model.ExerciseType
import com.example.chineselearning.data.model.MatchPairItem
import com.example.chineselearning.data.model.PictureOption

val bab8Stage5Part1Exercises = listOf(
    // 1. Soal 1: Pilihan Gambar (一点儿 -> sedikit)
    Exercise(
        id = "u8_s5_p1_q1",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "一点儿",
        targetPinyin = "yìdiǎnr",
        targetTranslation = "sedikit",
        correctAnswer = "sedikit",
        audioToSpeak = "一点儿",
        pictureOptions = listOf(
            PictureOption("u8_s5_p1_opt1", "sedikit", "", R.drawable.ic_shop_little_bit, true),
            PictureOption("u8_s5_p1_opt2", "banyak", "", R.drawable.ic_shop_some_items, false),
            PictureOption("u8_s5_p1_opt3", "semua", "", R.drawable.ic_gram_all, false),
            PictureOption("u8_s5_p1_opt4", "tidak ada", "", R.drawable.ic_mod_wrong, false)
        )
    ),

    // 2. Soal 2: Susun Kalimat (Saya ingin makan sedikit buah.)
    Exercise(
        id = "u8_s5_p1_q2",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Saya ingin makan sedikit buah.",
        targetHanzi = "我 想 吃 一点儿 水果。",
        targetPinyin = "Wǒ xiǎng chī yìdiǎnr shuǐguǒ.",
        wordChips = listOf("我:wǒ", "想:xiǎng", "吃:chī", "一点儿:yìdiǎnr", "水果:shuǐguǒ", "喝:hē"),
        correctAnswer = "我,想,吃,一点儿,水果",
        audioToSpeak = "我想吃一点儿水果。"
    ),

    // 3. Soal 3: Ketuk Pasangan yang Sesuai (Sedikit & Agak)
    Exercise(
        id = "u8_s5_p1_q3",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u8_s5_p1_m1", "一点儿", "yìdiǎnr", "sedikit (kuantitas)"),
            MatchPairItem("u8_s5_p1_m2", "有点儿", "yǒudiǎnr", "agak (derajat)"),
            MatchPairItem("u8_s5_p1_m3", "有点儿贵", "yǒudiǎnr guì", "agak mahal"),
            MatchPairItem("u8_s5_p1_m4", "便宜一点儿", "piányi yìdiǎnr", "sedikit lebih murah")
        )
    ),

    // 4. Soal 4: Ketik Pinyin (sedikit -> yìdiǎnr)
    Exercise(
        id = "u8_s5_p1_q4",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "sedikit",
        sentenceWithBlank = "一点儿 (________)",
        targetHanzi = "一点儿",
        targetPinyin = "yìdiǎnr",
        correctAnswer = "yidianr",
        keyboardKeys = listOf("y", "i", "d", "a", "n", "r", "e", "o", "u", "b", "g"),
        audioToSpeak = "一点儿"
    ),

    // 5. Soal 5: Mendengar Kalimat (Rule 10: illustrationRes = 0)
    Exercise(
        id = "u8_s5_p1_q5",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Apa yang Anda dengar?",
        targetTranslation = "Baju ini agak mahal.",
        targetHanzi = "这 件 衣服 有点儿 贵。",
        targetPinyin = "Zhè jiàn yīfu yǒudiǎnr guì.",
        wordChips = listOf("这:zhè", "件:jiàn", "衣服:yīfu", "有点儿:yǒudiǎnr", "贵:guì", "便宜:piányi"),
        correctAnswer = "这,件,衣服,有点儿,贵",
        illustrationRes = 0,
        audioToSpeak = "这件衣服有点儿贵。"
    ),

    // 6. Soal 6: Pilihan Kalimat
    Exercise(
        id = "u8_s5_p1_q6",
        type = ExerciseType.SENTENCE_CHOICE,
        title = "Pilih terjemahan yang benar",
        targetHanzi = "我 想 喝 一点儿 水。",
        targetPinyin = "Wǒ xiǎng hē yìdiǎnr shuǐ.",
        targetTranslation = "Saya ingin minum sedikit air.",
        correctAnswer = "Wǒ xiǎng hē yìdiǎnr shuǐ.\n我 想 喝 一点儿 水。",
        options = listOf(
            "Wǒ xiǎng hē yìdiǎnr shuǐ.\n我 想 喝 一点儿 水。",
            "Wǒ xiǎng chī yìdiǎnr shuǐ.\n我 想 吃 一点儿 水。",
            "Tā xiǎng hē yìdiǎnr chá.\n他 想 喝 一点儿 茶。"
        ),
        audioToSpeak = "我想喝一点儿水。"
    ),

    // 7. Soal 7: Pilihan Gambar (有点儿 -> agak)
    Exercise(
        id = "u8_s5_p1_q7",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "有点儿",
        targetPinyin = "yǒudiǎnr",
        targetTranslation = "agak",
        correctAnswer = "agak",
        audioToSpeak = "有点儿",
        pictureOptions = listOf(
            PictureOption("u8_s5_p1_opt7_1", "agak", "", R.drawable.ic_shop_little_bit, true),
            PictureOption("u8_s5_p1_opt7_2", "sangat", "", R.drawable.ic_weather_really_good, false),
            PictureOption("u8_s5_p1_opt7_3", "tidak", "", R.drawable.ic_mod_wrong, false),
            PictureOption("u8_s5_p1_opt7_4", "semua", "", R.drawable.ic_gram_all, false)
        )
    ),

    // 8. Soal 8: Ketik Pinyin (agak -> yǒudiǎnr)
    Exercise(
        id = "u8_s5_p1_q8",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "agak / sedikit",
        sentenceWithBlank = "有点儿 (________)",
        targetHanzi = "有点儿",
        targetPinyin = "yǒudiǎnr",
        correctAnswer = "youdianr",
        keyboardKeys = listOf("y", "o", "u", "d", "i", "a", "n", "r", "e", "b", "g"),
        audioToSpeak = "有点儿"
    ),

    // 9. Soal 9: Susun Kalimat (Apel ini agak besar.)
    Exercise(
        id = "u8_s5_p1_q9",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Apel ini agak besar.",
        targetHanzi = "这个 苹果 有点儿 大。",
        targetPinyin = "Zhège píngguǒ yǒudiǎnr dà.",
        wordChips = listOf("这个:zhège", "苹果:píngguǒ", "有点儿:yǒudiǎnr", "大:dà", "小:xiǎo"),
        correctAnswer = "这个,苹果,有点儿,大",
        audioToSpeak = "这个苹果有点儿大。"
    ),

    // 10. Soal 10: Ketuk Pasangan yang Sesuai (Rangkuman Derajat Parsial)
    Exercise(
        id = "u8_s5_p1_m10_1",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u8_s5_p1_m10_1", "有点儿贵", "yǒudiǎnr guì", "agak mahal"),
            MatchPairItem("u8_s5_p1_m10_2", "有点儿大", "yǒudiǎnr dà", "agak besar"),
            MatchPairItem("u8_s5_p1_m10_3", "吃一点儿", "chī yìdiǎnr", "makan sedikit"),
            MatchPairItem("u8_s5_p1_m10_4", "喝一点儿", "hē yìdiǎnr", "minum sedikit")
        )
    )
)

val bab8Stage5Part2Exercises = listOf(
    // 1. Soal 1: Pilihan Gambar (一些 -> beberapa)
    Exercise(
        id = "u8_s5_p2_q1",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "一些",
        targetPinyin = "yìxiē",
        targetTranslation = "beberapa",
        correctAnswer = "beberapa",
        audioToSpeak = "一些",
        pictureOptions = listOf(
            PictureOption("u8_s5_p2_opt1", "beberapa", "", R.drawable.ic_shop_some_items, true),
            PictureOption("u8_s5_p2_opt2", "satu", "", R.drawable.ic_num_1, false),
            PictureOption("u8_s5_p2_opt3", "nol", "", R.drawable.ic_num_0, false),
            PictureOption("u8_s5_p2_opt4", "semua", "", R.drawable.ic_gram_all, false)
        )
    ),

    // 2. Soal 2: Susun Kalimat (Saya membeli beberapa buku.)
    Exercise(
        id = "u8_s5_p2_q2",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Saya beli beberapa buku.",
        targetHanzi = "我 买 了 一些 书。",
        targetPinyin = "Wǒ mǎi le yìxiē shū.",
        wordChips = listOf("我:wǒ", "买:mǎi", "了:le", "一些:yìxiē", "书:shū", "苹果:píngguǒ"),
        correctAnswer = "我,买,了,一些,书",
        audioToSpeak = "我买了一些书。"
    ),

    // 3. Soal 3: Ketuk Pasangan yang Sesuai (Beberapa & Separuh)
    Exercise(
        id = "u8_s5_p2_q3",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u8_s5_p2_m1", "一些", "yìxiē", "beberapa"),
            MatchPairItem("u8_s5_p2_m2", "一半", "yíbàn", "setengah / separuh"),
            MatchPairItem("u8_s5_p2_m3", "这些", "zhèxiē", "ini semua / beberapa ini"),
            MatchPairItem("u8_s5_p2_m4", "那些", "nàxiē", "itu semua / beberapa itu")
        )
    ),

    // 4. Soal 4: Ketik Pinyin (beberapa -> yìxiē)
    Exercise(
        id = "u8_s5_p2_q4",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "beberapa",
        sentenceWithBlank = "一些 (________)",
        targetHanzi = "一些",
        targetPinyin = "yìxiē",
        correctAnswer = "yixie",
        keyboardKeys = listOf("y", "i", "x", "e", "a", "o", "u", "b", "d", "g", "h"),
        audioToSpeak = "一些"
    ),

    // 5. Soal 5: Mendengar Kalimat (Rule 10: illustrationRes = 0)
    Exercise(
        id = "u8_s5_p2_q5",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Apa yang Anda dengar?",
        targetTranslation = "Dia makan separuh apel.",
        targetHanzi = "他 吃 了 一半 苹果。",
        targetPinyin = "Tā chī le yíbàn píngguǒ.",
        wordChips = listOf("他:tā", "吃:chī", "了:le", "一半:yíbàn", "苹果:píngguǒ", "我:wǒ"),
        correctAnswer = "他,吃,了,一半,苹果",
        illustrationRes = 0,
        audioToSpeak = "他吃了一半苹果。"
    ),

    // 6. Soal 6: Pilihan Kalimat
    Exercise(
        id = "u8_s5_p2_q6",
        type = ExerciseType.SENTENCE_CHOICE,
        title = "Pilih terjemahan yang benar",
        targetHanzi = "这些 苹果 很 好吃。",
        targetPinyin = "Zhèxiē píngguǒ hěn hǎochī.",
        targetTranslation = "Apel-apel ini sangat enak.",
        correctAnswer = "Zhèxiē píngguǒ hěn hǎochī.\n这些 苹果 很 好吃。",
        options = listOf(
            "Zhèxiē píngguǒ hěn hǎochī.\n这些 苹果 很 好吃。",
            "Nàxiē píngguǒ hěn hǎochī.\n那些 苹果 很 好吃。",
            "Zhèxiē cài hěn hǎochī.\n这些 菜 很 好吃。"
        ),
        audioToSpeak = "这些苹果很好吃。"
    ),

    // 7. Soal 7: Pilihan Gambar (一半 -> setengah)
    Exercise(
        id = "u8_s5_p2_q7",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "一半",
        targetPinyin = "yíbàn",
        targetTranslation = "setengah / separuh",
        correctAnswer = "setengah / separuh",
        audioToSpeak = "一半",
        pictureOptions = listOf(
            PictureOption("u8_s5_p2_opt7_1", "setengah / separuh", "", R.drawable.ic_clock_half, true),
            PictureOption("u8_s5_p2_opt7_2", "penuh", "", R.drawable.ic_gram_all, false),
            PictureOption("u8_s5_p2_opt7_3", "kosong", "", R.drawable.ic_mod_wrong, false),
            PictureOption("u8_s5_p2_opt7_4", "buku", "", R.drawable.ic_book_chinese, false)
        )
    ),

    // 8. Soal 8: Ketik Pinyin (setengah -> yíbàn)
    Exercise(
        id = "u8_s5_p2_q8",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "setengah / separuh",
        sentenceWithBlank = "一半 (________)",
        targetHanzi = "一半",
        targetPinyin = "yíbàn",
        correctAnswer = "yiban",
        keyboardKeys = listOf("y", "i", "b", "a", "n", "e", "o", "u", "d", "g", "h"),
        audioToSpeak = "一半"
    ),

    // 9. Soal 9: Susun Kalimat (Saya ingin membeli beberapa apel.)
    Exercise(
        id = "u8_s5_p2_q9",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Saya ingin beli beberapa apel.",
        targetHanzi = "我 想 买 一些 苹果。",
        targetPinyin = "Wǒ xiǎng mǎi yìxiē píngguǒ.",
        wordChips = listOf("我:wǒ", "想:xiǎng", "买:mǎi", "一些:yìxiē", "苹果:píngguǒ", "卖:mài"),
        correctAnswer = "我,想,买,一些,苹果",
        audioToSpeak = "我想买一些苹果。"
    ),

    // 10. Soal 10: Ketuk Pasangan yang Sesuai (Rangkuman Kuantitas)
    Exercise(
        id = "u8_s5_p2_m10_1",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u8_s5_p2_m10_1", "一些", "yìxiē", "beberapa"),
            MatchPairItem("u8_s5_p2_m10_2", "一半", "yíbàn", "separuh"),
            MatchPairItem("u8_s5_p2_m10_3", "买一些", "mǎi yìxiē", "beli beberapa"),
            MatchPairItem("u8_s5_p2_m10_4", "这些东西", "zhèxiē dōngxi", "barang-barang ini")
        )
    )
)
