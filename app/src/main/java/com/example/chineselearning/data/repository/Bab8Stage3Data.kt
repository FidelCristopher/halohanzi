package com.example.chineselearning.data.repository

import com.example.chineselearning.R
import com.example.chineselearning.data.model.Exercise
import com.example.chineselearning.data.model.ExerciseType
import com.example.chineselearning.data.model.MatchPairItem
import com.example.chineselearning.data.model.PictureOption

val bab8Stage3Part1Exercises = listOf(
    // 1. Soal 1: Pilihan Gambar (贵 -> mahal)
    Exercise(
        id = "u8_s3_p1_q1",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "贵",
        targetPinyin = "guì",
        targetTranslation = "mahal",
        correctAnswer = "mahal",
        audioToSpeak = "贵",
        pictureOptions = listOf(
            PictureOption("u8_s3_p1_opt1", "mahal", "💎", R.drawable.ic_shop_expensive, true),
            PictureOption("u8_s3_p1_opt2", "murah", "🏷️", R.drawable.ic_target, false),
            PictureOption("u8_s3_p1_opt3", "baru", "✨", R.drawable.ic_crown, false),
            PictureOption("u8_s3_p1_opt4", "buku", "📖", R.drawable.ic_book, false)
        )
    ),

    // 2. Soal 2: Susun Kalimat (Baju ini terlalu mahal!)
    Exercise(
        id = "u8_s3_p1_q2",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Pakaian ini terlalu mahal!",
        targetHanzi = "这 件 衣服 太 贵 了！",
        targetPinyin = "Zhè jiàn yīfu tài guì le!",
        wordChips = listOf("这:zhè", "件:jiàn", "衣服:yīfu", "太:tài", "贵:guì", "了！:le!", "便宜:piányi"),
        correctAnswer = "这,件,衣服,太,贵,了！",
        audioToSpeak = "这件衣服太贵了！"
    ),

    // 3. Soal 3: Ketuk Pasangan yang Sesuai (Mahal & Eksklamasio)
    Exercise(
        id = "u8_s3_p1_q3",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u8_s3_p1_m1", "贵", "guì", "mahal"),
            MatchPairItem("u8_s3_p1_m2", "太贵了", "tài guì le", "terlalu mahal!"),
            MatchPairItem("u8_s3_p1_m3", "太大了", "tài dà le", "terlalu besar!"),
            MatchPairItem("u8_s3_p1_m4", "太小了", "tài xiǎo le", "terlalu kecil!")
        )
    ),

    // 4. Soal 4: Ketik Pinyin (mahal -> guì)
    Exercise(
        id = "u8_s3_p1_q4",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "mahal",
        sentenceWithBlank = "贵 (________)",
        targetHanzi = "贵",
        targetPinyin = "guì",
        correctAnswer = "gui",
        keyboardKeys = listOf("g", "u", "i", "a", "e", "o", "b", "d", "h", "j", "l"),
        audioToSpeak = "贵"
    ),

    // 5. Soal 5: Mendengar Kalimat (Rule 10: illustrationRes = 0)
    Exercise(
        id = "u8_s3_p1_q5",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Apa yang Anda dengar?",
        targetTranslation = "Buku ini tidak mahal.",
        targetHanzi = "这 本 书 不 贵。",
        targetPinyin = "Zhè běn shū bú guì.",
        wordChips = listOf("这:zhè", "本:běn", "书:shū", "不:bú", "贵:guì", "那:nà"),
        correctAnswer = "这,本,书,不,贵",
        illustrationRes = 0,
        audioToSpeak = "这本书不贵。"
    ),

    // 6. Soal 6: Pilihan Kalimat
    Exercise(
        id = "u8_s3_p1_q6",
        type = ExerciseType.SENTENCE_CHOICE,
        title = "Pilih terjemahan yang benar",
        targetHanzi = "苹果 太 贵 了， 我 不 买。",
        targetPinyin = "Píngguǒ tài guì le, wǒ bù mǎi.",
        targetTranslation = "Apel terlalu mahal, saya tidak beli.",
        correctAnswer = "Píngguǒ tài guì le, wǒ bù mǎi.\n苹果 太 贵 了， 我 不 买。",
        options = listOf(
            "Píngguǒ tài guì le, wǒ bù mǎi.\n苹果 太 贵 了， 我 不 买。",
            "Píngguǒ tài piányi le, wǒ mǎi.\n苹果 太 便宜 了， 我 买。",
            "Píngguǒ bù guì, wǒ mǎi.\n苹果 不 贵， 我 买。"
        ),
        audioToSpeak = "苹果太贵了，我不买。"
    ),

    // 7. Soal 7: Pilihan Gambar (太...了 -> terlalu)
    Exercise(
        id = "u8_s3_p1_q7",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "太",
        targetPinyin = "tài",
        targetTranslation = "terlalu / amat",
        correctAnswer = "terlalu / amat",
        audioToSpeak = "太",
        pictureOptions = listOf(
            PictureOption("u8_s3_p1_opt7_1", "terlalu", "❗", R.drawable.ic_shop_too_expensive, true),
            PictureOption("u8_s3_p1_opt7_2", "sedikit", "🤏", R.drawable.ic_target, false),
            PictureOption("u8_s3_p1_opt7_3", "banyak", "📈", R.drawable.ic_crown, false),
            PictureOption("u8_s3_p1_opt7_4", "tidak", "❌", R.drawable.ic_book, false)
        )
    ),

    // 8. Soal 8: Ketik Pinyin (terlalu -> tài)
    Exercise(
        id = "u8_s3_p1_q8",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "terlalu / amat",
        sentenceWithBlank = "太 (________)",
        targetHanzi = "太",
        targetPinyin = "tài",
        correctAnswer = "tai",
        keyboardKeys = listOf("t", "a", "i", "l", "e", "o", "u", "b", "d", "g", "h"),
        audioToSpeak = "太"
    ),

    // 9. Soal 9: Susun Kalimat (Barang ini sangat mahal.)
    Exercise(
        id = "u8_s3_p1_q9",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Barang ini sangat mahal.",
        targetHanzi = "这个 东西 很 贵。",
        targetPinyin = "Zhège dōngxi hěn guì.",
        wordChips = listOf("这个:zhège", "东西:dōngxi", "很:hěn", "贵:guì", "便宜:piányi"),
        correctAnswer = "这个,东西,很,贵",
        audioToSpeak = "这个东西很贵。"
    ),

    // 10. Soal 10: Ketuk Pasangan yang Sesuai (Rangkuman Sifat Harga)
    Exercise(
        id = "u8_s3_p1_m10_1",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u8_s3_p1_m10_1", "贵", "guì", "mahal"),
            MatchPairItem("u8_s3_p1_m10_2", "太贵了", "tài guì le", "terlalu mahal"),
            MatchPairItem("u8_s3_p1_m10_3", "很贵", "hěn guì", "sangat mahal"),
            MatchPairItem("u8_s3_p1_m10_4", "不贵", "bú guì", "tidak mahal")
        )
    )
)

val bab8Stage3Part2Exercises = listOf(
    // 1. Soal 1: Pilihan Gambar (便宜 -> murah)
    Exercise(
        id = "u8_s3_p2_q1",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "便宜",
        targetPinyin = "piányi",
        targetTranslation = "murah",
        correctAnswer = "murah",
        audioToSpeak = "便宜",
        pictureOptions = listOf(
            PictureOption("u8_s3_p2_opt1", "murah", "🏷️", R.drawable.ic_shop_cheap, true),
            PictureOption("u8_s3_p2_opt2", "mahal", "💎", R.drawable.ic_crown, false),
            PictureOption("u8_s3_p2_opt3", "baru", "✨", R.drawable.ic_target, false),
            PictureOption("u8_s3_p2_opt4", "buku", "📖", R.drawable.ic_book, false)
        )
    ),

    // 2. Soal 2: Susun Kalimat (Barang di supermarket ini sangat murah.)
    Exercise(
        id = "u8_s3_p2_q2",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Barang supermarket ini murah.",
        targetHanzi = "这个 超市 的 东西 很 便宜。",
        targetPinyin = "Zhège chāoshì de dōngxi hěn piányi.",
        wordChips = listOf("这个:zhège", "超市:chāoshì", "的:de", "东西:dōngxi", "很:hěn", "便宜:piányi", "贵:guì"),
        correctAnswer = "这个,超市,的,东西,很,便宜",
        audioToSpeak = "这个超市的东西很便宜。"
    ),

    // 3. Soal 3: Ketuk Pasangan yang Sesuai (Murah vs Mahal)
    Exercise(
        id = "u8_s3_p2_q3",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u8_s3_p2_m1", "便宜", "piányi", "murah"),
            MatchPairItem("u8_s3_p2_m2", "很便宜", "hěn piányi", "sangat murah"),
            MatchPairItem("u8_s3_p2_m3", "太贵了", "tài guì le", "terlalu mahal"),
            MatchPairItem("u8_s3_p2_m4", "不便宜", "bù piányi", "tidak murah")
        )
    ),

    // 4. Soal 4: Ketik Pinyin (murah -> piányi)
    Exercise(
        id = "u8_s3_p2_q4",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "murah",
        sentenceWithBlank = "便宜 (________)",
        targetHanzi = "便宜",
        targetPinyin = "piányi",
        correctAnswer = "pianyi",
        keyboardKeys = listOf("p", "i", "a", "n", "y", "e", "o", "u", "b", "d", "g"),
        audioToSpeak = "便宜"
    ),

    // 5. Soal 5: Mendengar Kalimat (Rule 10: illustrationRes = 0)
    Exercise(
        id = "u8_s3_p2_q5",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Apa yang Anda dengar?",
        targetTranslation = "Dua puluh yuan sangat murah.",
        targetHanzi = "二十 块 钱 很 便宜。",
        targetPinyin = "Èrshí kuài qián hěn piányi.",
        wordChips = listOf("二十:èrshí", "块:kuài", "钱:qián", "很:hěn", "便宜:piányi", "贵:guì"),
        correctAnswer = "二十,块,钱,很,便宜",
        illustrationRes = 0,
        audioToSpeak = "二十块钱很便宜。"
    ),

    // 6. Soal 6: Pilihan Kalimat
    Exercise(
        id = "u8_s3_p2_q6",
        type = ExerciseType.SENTENCE_CHOICE,
        title = "Pilih terjemahan yang benar",
        targetHanzi = "能 便宜 一点儿 吗？",
        targetPinyin = "Néng piányi yìdiǎnr ma?",
        targetTranslation = "Bisakah lebih murah sedikit?",
        correctAnswer = "Néng piányi yìdiǎnr ma?\n能 便宜 一点儿 吗？",
        options = listOf(
            "Néng piányi yìdiǎnr ma?\n能 便宜 一点儿 吗？",
            "Néng guì yìdiǎnr ma?\n能 贵 一点儿 吗？",
            "Néng mǎi yìdiǎnr ma?\n能 买 一点儿 吗？"
        ),
        audioToSpeak = "能便宜一点儿吗？"
    ),

    // 7. Soal 7: Pilihan Gambar (太贵了 -> terlalu mahal)
    Exercise(
        id = "u8_s3_p2_q7",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "太贵了",
        targetPinyin = "tài guì le",
        targetTranslation = "terlalu mahal!",
        correctAnswer = "terlalu mahal!",
        audioToSpeak = "太贵了",
        pictureOptions = listOf(
            PictureOption("u8_s3_p2_opt7_1", "terlalu mahal!", "💸", R.drawable.ic_shop_too_expensive, true),
            PictureOption("u8_s3_p2_opt7_2", "sangat murah", "🏷️", R.drawable.ic_target, false),
            PictureOption("u8_s3_p2_opt7_3", "enak", "😋", R.drawable.ic_crown, false),
            PictureOption("u8_s3_p2_opt7_4", "baru", "✨", R.drawable.ic_book, false)
        )
    ),

    // 8. Soal 8: Ketik Pinyin (terlalu mahal -> tài guì le)
    Exercise(
        id = "u8_s3_p2_q8",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "terlalu mahal",
        sentenceWithBlank = "太贵了 (________)",
        targetHanzi = "太贵了",
        targetPinyin = "tàiguìle",
        correctAnswer = "taiguile",
        keyboardKeys = listOf("t", "a", "i", "g", "u", "l", "e", "o", "b", "d", "h"),
        audioToSpeak = "太贵了"
    ),

    // 9. Soal 9: Susun Kalimat (Bisakah lebih murah?)
    Exercise(
        id = "u8_s3_p2_q9",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Bisa murah sedikit tidak?",
        targetHanzi = "可以 便宜 一点儿 吗？",
        targetPinyin = "Kěyǐ piányi yìdiǎnr ma?",
        wordChips = listOf("可以:kěyǐ", "便宜:piányi", "一点儿:yìdiǎnr", "吗？:ma?", "太:tài"),
        correctAnswer = "可以,便宜,一点儿,吗？",
        audioToSpeak = "可以便宜一点儿吗？"
    ),

    // 10. Soal 10: Ketuk Pasangan yang Sesuai (Rangkuman Tawar Menawar)
    Exercise(
        id = "u8_s3_p2_m10_1",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u8_s3_p2_m10_1", "便宜", "piányi", "murah"),
            MatchPairItem("u8_s3_p2_m10_2", "便宜一点儿", "piányi yìdiǎnr", "sedikit lebih murah"),
            MatchPairItem("u8_s3_p2_m10_3", "太贵了", "tài guì le", "terlalu mahal"),
            MatchPairItem("u8_s3_p2_m10_4", "买不买", "mǎi bu mǎi", "beli atau tidak")
        )
    )
)
