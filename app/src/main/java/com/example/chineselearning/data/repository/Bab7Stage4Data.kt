package com.example.chineselearning.data.repository

import com.example.chineselearning.R
import com.example.chineselearning.data.model.Exercise
import com.example.chineselearning.data.model.ExerciseType
import com.example.chineselearning.data.model.MatchPairItem
import com.example.chineselearning.data.model.PictureOption

val bab7Stage4Part1Exercises = listOf(
    // 1. Soal 1: Pilihan Gambar (菜 -> sayur / masakan)
    Exercise(
        id = "u7_s4_p1_q1",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "菜",
        targetPinyin = "cài",
        targetTranslation = "sayur / hidangan",
        correctAnswer = "sayur / hidangan",
        audioToSpeak = "菜",
        pictureOptions = listOf(
            PictureOption("u7_s4_p1_opt1", "sayur / hidangan", "🥗", R.drawable.ic_coin, true),
            PictureOption("u7_s4_p1_opt2", "nasi", "🍚", R.drawable.ic_book, false),
            PictureOption("u7_s4_p1_opt3", "air", "💧", R.drawable.ic_target, false),
            PictureOption("u7_s4_p1_opt4", "teh", "🍵", R.drawable.ic_crown, false)
        )
    ),

    // 2. Soal 2: Susun Kalimat (Masakan Tiongkok sangat lezat.)
    Exercise(
        id = "u7_s4_p1_q2",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Masakan Tiongkok sangat lezat.",
        targetHanzi = "中国 菜 很 好吃。",
        targetPinyin = "Zhōngguó cài hěn hǎochī.",
        wordChips = listOf("中国:Zhōngguó", "菜:cài", "很:hěn", "好吃:hǎochī", "北京:Běijīng", "不好吃:bù hǎochī"),
        correctAnswer = "中国,菜,很,好吃",
        audioToSpeak = "中国菜很好吃。"
    ),

    // 3. Soal 3: Ketuk Pasangan yang Sesuai (Sayur & Masakan)
    Exercise(
        id = "u7_s4_p1_q3",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u7_s4_p1_m1", "菜", "cài", "sayur / hidangan"),
            MatchPairItem("u7_s4_p1_m2", "中国菜", "Zhōngguó cài", "masakan Tiongkok"),
            MatchPairItem("u7_s4_p1_m3", "做菜", "zuò cài", "memasak hidangan"),
            MatchPairItem("u7_s4_p1_m4", "很好吃", "hěn hǎochī", "sangat lezat")
        )
    ),

    // 4. Soal 4: Ketik Pinyin (sayur / hidangan -> cài)
    Exercise(
        id = "u7_s4_p1_q4",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "sayur / hidangan",
        sentenceWithBlank = "菜 (________)",
        targetHanzi = "菜",
        targetPinyin = "cài",
        correctAnswer = "cai",
        keyboardKeys = listOf("c", "a", "i", "e", "o", "u", "b", "d", "g", "h", "j"),
        audioToSpeak = "菜"
    ),

    // 5. Soal 5: Mendengar Kalimat (Rule 10: illustrationRes = 0)
    Exercise(
        id = "u7_s4_p1_q5",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Apa yang Anda dengar?",
        targetTranslation = "Dia suka makan masakan Tiongkok.",
        targetHanzi = "他 喜欢 吃 中国 菜。",
        targetPinyin = "Tā xǐhuan chī Zhōngguó cài.",
        wordChips = listOf("他:tā", "喜欢:xǐhuan", "吃:chī", "中国:Zhōngguó", "菜:cài", "米饭:mǐfàn"),
        correctAnswer = "他,喜欢,吃,中国,菜",
        illustrationRes = 0,
        audioToSpeak = "他喜欢吃中国菜。"
    ),

    // 6. Soal 6: Pilihan Kalimat
    Exercise(
        id = "u7_s4_p1_q6",
        type = ExerciseType.SENTENCE_CHOICE,
        title = "Pilih terjemahan yang benar",
        targetHanzi = "我 妈妈 会 做 很多 菜。",
        targetPinyin = "Wǒ māma huì zuò hěnduō cài.",
        targetTranslation = "Ibu saya bisa memasak banyak hidangan.",
        correctAnswer = "Wǒ māma huì zuò hěnduō cài.\n我 妈妈 会 做 很多 菜。",
        options = listOf(
            "Wǒ māma huì zuò hěnduō cài.\n我 妈妈 会 做 很多 菜。",
            "Wǒ bàba huì zuò hěnduō cài.\n我 爸爸 会 做 很多 菜。",
            "Wǒ māma huì chī hěnduō cài.\n我 妈妈 会 吃 很多 菜。"
        ),
        audioToSpeak = "我妈妈会做很多菜。"
    ),

    // 7. Soal 7: Pilihan Gambar (中国菜 -> masakan Tiongkok)
    Exercise(
        id = "u7_s4_p1_q7",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "中国菜",
        targetPinyin = "Zhōngguó cài",
        targetTranslation = "masakan Tiongkok",
        correctAnswer = "masakan Tiongkok",
        audioToSpeak = "中国菜",
        pictureOptions = listOf(
            PictureOption("u7_s4_p1_opt7_1", "masakan Tiongkok", "🍲", R.drawable.ic_coin, true),
            PictureOption("u7_s4_p1_opt7_2", "roti", "🍞", R.drawable.ic_book, false),
            PictureOption("u7_s4_p1_opt7_3", "buah", "🍎", R.drawable.ic_target, false),
            PictureOption("u7_s4_p1_opt7_4", "air", "💧", R.drawable.ic_crown, false)
        )
    ),

    // 8. Soal 8: Ketik Pinyin (enak -> hǎochī)
    Exercise(
        id = "u7_s4_p1_q8",
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

    // 9. Soal 9: Susun Kalimat (Saya makan sayur dan nasi.)
    Exercise(
        id = "u7_s4_p1_q9",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Saya makan sayur dan nasi.",
        targetHanzi = "我 吃 菜 和 米饭。",
        targetPinyin = "Wǒ chī cài hé mǐfàn.",
        wordChips = listOf("我:wǒ", "吃:chī", "菜:cài", "和:hé", "米饭:mǐfàn", "面条儿:miàntiáor"),
        correctAnswer = "我,吃,菜,和,米饭",
        audioToSpeak = "我吃菜和米饭。"
    ),

    // 10. Soal 10: Ketuk Pasangan yang Sesuai (Rangkuman Hidangan Masakan)
    Exercise(
        id = "u7_s4_p1_m10_1",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u7_s4_p1_m10_1", "中国菜", "Zhōngguó cài", "masakan Tiongkok"),
            MatchPairItem("u7_s4_p1_m10_2", "做菜", "zuò cài", "memasak lauk"),
            MatchPairItem("u7_s4_p1_m10_3", "吃菜", "chī cài", "makan sayur"),
            MatchPairItem("u7_s4_p1_m10_4", "好吃", "hǎochī", "enak")
        )
    )
)

val bab7Stage4Part2Exercises = listOf(
    // 1. Soal 1: Pilihan Gambar (水果 -> buah-buahan)
    Exercise(
        id = "u7_s4_p2_q1",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "水果",
        targetPinyin = "shuǐguǒ",
        targetTranslation = "buah-buahan",
        correctAnswer = "buah-buahan",
        audioToSpeak = "水果",
        pictureOptions = listOf(
            PictureOption("u7_s4_p2_opt1", "buah-buahan", "🍇", R.drawable.ic_coin, true),
            PictureOption("u7_s4_p2_opt2", "sayur", "🥗", R.drawable.ic_book, false),
            PictureOption("u7_s4_p2_opt3", "mie", "🍜", R.drawable.ic_target, false),
            PictureOption("u7_s4_p2_opt4", "teh", "🍵", R.drawable.ic_crown, false)
        )
    ),

    // 2. Soal 2: Susun Kalimat (Saya ingin makan buah-buahan.)
    Exercise(
        id = "u7_s4_p2_q2",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Saya ingin makan buah-buahan.",
        targetHanzi = "我 想 吃 水果。",
        targetPinyin = "Wǒ xiǎng chī shuǐguǒ.",
        wordChips = listOf("我:wǒ", "想:xiǎng", "吃:chī", "水果:shuǐguǒ", "苹果:píngguǒ", "买:mǎi"),
        correctAnswer = "我,想,吃,水果",
        audioToSpeak = "我想吃水果。"
    ),

    // 3. Soal 3: Ketuk Pasangan yang Sesuai (Buah & Apel)
    Exercise(
        id = "u7_s4_p2_q3",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u7_s4_p2_m1", "水果", "shuǐguǒ", "buah-buahan"),
            MatchPairItem("u7_s4_p2_m2", "苹果", "píngguǒ", "apel"),
            MatchPairItem("u7_s4_p2_m3", "吃苹果", "chī píngguǒ", "makan apel"),
            MatchPairItem("u7_s4_p2_m4", "买水果", "mǎi shuǐguǒ", "beli buah")
        )
    ),

    // 4. Soal 4: Ketik Pinyin (buah-buahan -> shuǐguǒ)
    Exercise(
        id = "u7_s4_p2_q4",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "buah-buahan",
        sentenceWithBlank = "水果 (________)",
        targetHanzi = "水果",
        targetPinyin = "shuǐguǒ",
        correctAnswer = "shuiguo",
        keyboardKeys = listOf("s", "h", "u", "i", "g", "o", "a", "e", "b", "d", "j"),
        audioToSpeak = "水果"
    ),

    // 5. Soal 5: Mendengar Kalimat (Rule 10: illustrationRes = 0)
    Exercise(
        id = "u7_s4_p2_q5",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Apa yang Anda dengar?",
        targetTranslation = "Apel ini sangat lezat.",
        targetHanzi = "这个 苹果 很 好吃。",
        targetPinyin = "Zhège píngguǒ hěn hǎochī.",
        wordChips = listOf("这个:zhège", "苹果:píngguǒ", "很:hěn", "好吃:hǎochī", "水果:shuǐguǒ"),
        correctAnswer = "这个,苹果,很,好吃",
        illustrationRes = 0,
        audioToSpeak = "这个苹果很好吃。"
    ),

    // 6. Soal 6: Pilihan Kalimat
    Exercise(
        id = "u7_s4_p2_q6",
        type = ExerciseType.SENTENCE_CHOICE,
        title = "Pilih terjemahan yang benar",
        targetHanzi = "他 去 商店 买 苹果。",
        targetPinyin = "Tā qù shāngdiàn mǎi píngguǒ.",
        targetTranslation = "Dia pergi ke toko membeli apel.",
        correctAnswer = "Tā qù shāngdiàn mǎi píngguǒ.\n他 去 商店 买 苹果。",
        options = listOf(
            "Tā qù shāngdiàn mǎi píngguǒ.\n他 去 商店 买 苹果。",
            "Wǒ qù shāngdiàn mǎi píngguǒ.\n我 去 商店 买 苹果。",
            "Tā qù shāngdiàn mǎi shuǐguǒ.\n他 去 商店 买 水果。"
        ),
        audioToSpeak = "他去商店买苹果。"
    ),

    // 7. Soal 7: Pilihan Gambar (苹果 -> apel)
    Exercise(
        id = "u7_s4_p2_q7",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "苹果",
        targetPinyin = "píngguǒ",
        targetTranslation = "apel",
        correctAnswer = "apel",
        audioToSpeak = "苹果",
        pictureOptions = listOf(
            PictureOption("u7_s4_p2_opt7_1", "apel", "🍎", R.drawable.ic_coin, true),
            PictureOption("u7_s4_p2_opt7_2", "anggur", "🍇", R.drawable.ic_target, false),
            PictureOption("u7_s4_p2_opt7_3", "nasi", "🍚", R.drawable.ic_book, false),
            PictureOption("u7_s4_p2_opt7_4", "roti", "🍞", R.drawable.ic_crown, false)
        )
    ),

    // 8. Soal 8: Ketik Pinyin (apel -> píngguǒ)
    Exercise(
        id = "u7_s4_p2_q8",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "apel",
        sentenceWithBlank = "苹果 (________)",
        targetHanzi = "苹果",
        targetPinyin = "píngguǒ",
        correctAnswer = "pingguo",
        keyboardKeys = listOf("p", "i", "n", "g", "u", "o", "a", "e", "b", "d", "h"),
        audioToSpeak = "苹果"
    ),

    // 9. Soal 9: Susun Kalimat (Saya makan dua buah apel.)
    Exercise(
        id = "u7_s4_p2_q9",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Saya makan dua apel.",
        targetHanzi = "我 吃 两 个 苹果。",
        targetPinyin = "Wǒ chī liǎng gè píngguǒ.",
        wordChips = listOf("我:wǒ", "吃:chī", "两:liǎng", "个:gè", "苹果:píngguǒ", "二:èr"),
        correctAnswer = "我,吃,两,个,苹果",
        audioToSpeak = "我吃两个苹果。"
    ),

    // 10. Soal 10: Ketuk Pasangan yang Sesuai (Rangkuman Buah-buahan)
    Exercise(
        id = "u7_s4_p2_m10_1",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u7_s4_p2_m10_1", "水果", "shuǐguǒ", "buah-buahan"),
            MatchPairItem("u7_s4_p2_m10_2", "苹果", "píngguǒ", "apel"),
            MatchPairItem("u7_s4_p2_m3", "两个苹果", "liǎng gè píngguǒ", "dua buah apel"),
            MatchPairItem("u7_s4_p2_m4", "买水果", "mǎi shuǐguǒ", "beli buah")
        )
    )
)
