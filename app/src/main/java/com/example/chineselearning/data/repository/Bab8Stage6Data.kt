package com.example.chineselearning.data.repository

import com.example.chineselearning.R
import com.example.chineselearning.data.model.Exercise
import com.example.chineselearning.data.model.ExerciseType
import com.example.chineselearning.data.model.MatchPairItem
import com.example.chineselearning.data.model.PictureOption

val bab8Stage6Part1Exercises = listOf(
    // 1. Soal 1: Pilihan Gambar (买 -> membeli)
    Exercise(
        id = "u8_s6_p1_q1",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "买",
        targetPinyin = "mǎi",
        targetTranslation = "membeli",
        correctAnswer = "membeli",
        audioToSpeak = "买",
        pictureOptions = listOf(
            PictureOption("u8_s6_p1_opt1", "membeli", "🛒", R.drawable.ic_coin, true),
            PictureOption("u8_s6_p1_opt2", "menjual", "🏷️", R.drawable.ic_target, false),
            PictureOption("u8_s6_p1_opt3", "makan", "🍜", R.drawable.ic_book, false),
            PictureOption("u8_s6_p1_opt4", "minum", "🍵", R.drawable.ic_crown, false)
        )
    ),

    // 2. Soal 2: Susun Kalimat (Baju ini seratus yuan.)
    Exercise(
        id = "u8_s6_p1_q2",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Baju ini seratus yuan.",
        targetHanzi = "这 件 衣服 一百 块 钱。",
        targetPinyin = "Zhè jiàn yīfu yìbǎi kuài qián.",
        wordChips = listOf("这:zhè", "件:jiàn", "衣服:yīfu", "一百:yìbǎi", "块:kuài", "钱:qián", "那:nà"),
        correctAnswer = "这,件,衣服,一百,块,钱",
        audioToSpeak = "这件衣服一百块钱。"
    ),

    // 3. Soal 3: Ketuk Pasangan yang Sesuai (Rangkuman Transaksi Bab 8)
    Exercise(
        id = "u8_s6_p1_q3",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u8_s6_p1_m1", "商店", "shāngdiàn", "toko"),
            MatchPairItem("u8_s6_p1_m2", "多少钱", "duōshao qián", "berapa harganya"),
            MatchPairItem("u8_s6_p1_m3", "太贵了", "tài guì le", "terlalu mahal"),
            MatchPairItem("u8_s6_p1_m4", "便宜", "piányi", "murah")
        )
    ),

    // 4. Soal 4: Ketik Pinyin (berapa harga -> duōshao qián)
    Exercise(
        id = "u8_s6_p1_q4",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "berapa harganya",
        sentenceWithBlank = "多少钱 (________)",
        targetHanzi = "多少钱",
        targetPinyin = "duōshaoqián",
        correctAnswer = "duoshaoqian",
        keyboardKeys = listOf("d", "u", "o", "s", "h", "a", "q", "i", "n", "e", "b"),
        audioToSpeak = "多少钱"
    ),

    // 5. Soal 5: Mendengar Kalimat (Rule 10: illustrationRes = 0)
    Exercise(
        id = "u8_s6_p1_q5",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Apa yang Anda dengar?",
        targetTranslation = "Saya pergi ke supermarket membeli beberapa apel.",
        targetHanzi = "我 去 超市 买 一些 苹果。",
        targetPinyin = "Wǒ qù chāoshì mǎi yìxiē píngguǒ.",
        wordChips = listOf("我:wǒ", "去:qù", "超市:chāoshì", "买:mǎi", "一些:yìxiē", "苹果:píngguǒ"),
        correctAnswer = "我,去,超市,买,一些,苹果",
        illustrationRes = 0,
        audioToSpeak = "我去超市买一些苹果。"
    ),

    // 6. Soal 6: Pilihan Kalimat
    Exercise(
        id = "u8_s6_p1_q6",
        type = ExerciseType.SENTENCE_CHOICE,
        title = "Pilih terjemahan yang benar",
        targetHanzi = "这 件 衣服 太 贵 了。",
        targetPinyin = "Zhè jiàn yīfu tài guì le.",
        targetTranslation = "Baju ini terlalu mahal.",
        correctAnswer = "Zhè jiàn yīfu tài guì le.\n这 件 衣服 太 贵 了。",
        options = listOf(
            "Zhè jiàn yīfu tài guì le.\n这 件 衣服 太 贵 了。",
            "Zhè jiàn yīfu hěn piányi.\n这 件 衣服 很 便宜。",
            "Nà jiàn yīfu tài guì le.\n那 件 衣服 太 贵 了。"
        ),
        audioToSpeak = "这件衣服太贵了。"
    ),

    // 7. Soal 7: Pilihan Gambar (衣服 -> pakaian)
    Exercise(
        id = "u8_s6_p1_q7",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "衣服",
        targetPinyin = "yīfu",
        targetTranslation = "pakaian / baju",
        correctAnswer = "pakaian / baju",
        audioToSpeak = "衣服",
        pictureOptions = listOf(
            PictureOption("u8_s6_p1_opt7_1", "pakaian / baju", "👕", R.drawable.ic_coin, true),
            PictureOption("u8_s6_p1_opt7_2", "buku", "📖", R.drawable.ic_book, false),
            PictureOption("u8_s6_p1_opt7_3", "meja", "🪵", R.drawable.ic_target, false),
            PictureOption("u8_s6_p1_opt7_4", "kursi", "🪑", R.drawable.ic_crown, false)
        )
    ),

    // 8. Soal 8: Ketik Pinyin (pakaian -> yīfu)
    Exercise(
        id = "u8_s6_p1_q8",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "pakaian / baju",
        sentenceWithBlank = "衣服 (________)",
        targetHanzi = "衣服",
        targetPinyin = "yīfu",
        correctAnswer = "yifu",
        keyboardKeys = listOf("y", "i", "f", "u", "a", "e", "o", "b", "d", "g", "h"),
        audioToSpeak = "衣服"
    ),

    // 9. Soal 9: Susun Kalimat (Bisakah lebih murah sedikit?)
    Exercise(
        id = "u8_s6_p1_q9",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Bisa lebih murah sedikit?",
        targetHanzi = "能 便宜 一点儿 吗？",
        targetPinyin = "Néng piányi yìdiǎnr ma?",
        wordChips = listOf("能:néng", "便宜:piányi", "一点儿:yìdiǎnr", "吗？:ma?", "太:tài"),
        correctAnswer = "能,便宜,一点儿,吗？",
        audioToSpeak = "能便宜一点儿吗？"
    ),

    // 10. Soal 10: Ketuk Pasangan yang Sesuai (Rangkuman Transaksi)
    Exercise(
        id = "u8_s6_p1_m10_1",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u8_s6_p1_m10_1", "买衣服", "mǎi yīfu", "beli pakaian"),
            MatchPairItem("u8_s6_p1_m10_2", "穿新衣服", "chuān xīn yīfu", "pakai baju baru"),
            MatchPairItem("u8_s6_p1_m10_3", "便宜一点儿", "piányi yìdiǎnr", "sedikit lebih murah"),
            MatchPairItem("u8_s6_p1_m10_4", "一百块钱", "yìbǎi kuài qián", "seratus yuan")
        )
    )
)

val bab8Stage6Part2Exercises = listOf(
    // 1. Soal 1: Pilihan Gambar (新衣服 -> pakaian baru)
    Exercise(
        id = "u8_s6_p2_q1",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "新衣服",
        targetPinyin = "xīn yīfu",
        targetTranslation = "pakaian baru",
        correctAnswer = "pakaian baru",
        audioToSpeak = "新衣服",
        pictureOptions = listOf(
            PictureOption("u8_s6_p2_opt1", "pakaian baru", "✨", R.drawable.ic_coin, true),
            PictureOption("u8_s6_p2_opt2", "buku baru", "📖", R.drawable.ic_book, false),
            PictureOption("u8_s6_p2_opt3", "uang", "💰", R.drawable.ic_target, false),
            PictureOption("u8_s6_p2_opt4", "meja", "🪵", R.drawable.ic_crown, false)
        )
    ),

    // 2. Soal 2: Susun Kalimat (Saya ingin membeli sehelai baju baru.)
    Exercise(
        id = "u8_s6_p2_q2",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Saya ingin beli sehelai baju baru.",
        targetHanzi = "我 想 买 一 件 新 衣服。",
        targetPinyin = "Wǒ xiǎng mǎi yí jiàn xīn yīfu.",
        wordChips = listOf("我:wǒ", "想:xiǎng", "买:mǎi", "一:yí", "件:jiàn", "新:xīn", "衣服:yīfu"),
        correctAnswer = "我,想,买,一,件,新,衣服",
        audioToSpeak = "我想买一件新衣服。"
    ),

    // 3. Soal 3: Ketuk Pasangan yang Sesuai (Grand Review Bab 8)
    Exercise(
        id = "u8_s6_p2_m3",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u8_s6_p2_m1", "买", "mǎi", "membeli"),
            MatchPairItem("u8_s6_p2_m2", "卖", "mài", "menjual"),
            MatchPairItem("u8_s6_p2_m3", "贵", "guì", "mahal"),
            MatchPairItem("u8_s6_p2_m4", "便宜", "piányi", "murah")
        )
    ),

    // 4. Soal 4: Ketik Pinyin (terlalu mahal -> tài guì le)
    Exercise(
        id = "u8_s6_p2_q4",
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

    // 5. Soal 5: Mendengar Kalimat (Rule 10: illustrationRes = 0)
    Exercise(
        id = "u8_s6_p2_q5",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Apa yang Anda dengar?",
        targetTranslation = "Totalnya lima puluh yuan.",
        targetHanzi = "一共 五十 块 钱。",
        targetPinyin = "Yígòng wǔshí kuài qián.",
        wordChips = listOf("一共:yígòng", "五十:wǔshí", "块:kuài", "钱:qián", "六十:liùshí"),
        correctAnswer = "一共,五十,块,钱",
        illustrationRes = 0,
        audioToSpeak = "一共五十块钱。"
    ),

    // 6. Soal 6: Pilihan Kalimat
    Exercise(
        id = "u8_s6_p2_q6",
        type = ExerciseType.SENTENCE_CHOICE,
        title = "Pilih terjemahan yang benar",
        targetHanzi = "这 件 衣服 很 便宜， 我 买 了。",
        targetPinyin = "Zhè jiàn yīfu hěn piányi, wǒ mǎi le.",
        targetTranslation = "Baju ini sangat murah, saya membelinya.",
        correctAnswer = "Zhè jiàn yīfu hěn piányi, wǒ mǎi le.\n这 件 衣服 很 便宜， 我 买 了。",
        options = listOf(
            "Zhè jiàn yīfu hěn piányi, wǒ mǎi le.\n这 件 衣服 很 便宜， 我 买 了。",
            "Zhè jiàn yīfu tài guì le, wǒ bù mǎi.\n这 件 衣服 太 贵 了， 我 不 买。",
            "Nà jiàn yīfu hěn piányi, wǒ mǎi le.\n那 件 衣服 很 便宜， 我 买 了。"
        ),
        audioToSpeak = "这件衣服很便宜，我买了。"
    ),

    // 7. Soal 7: Pilihan Gambar (便宜 -> murah)
    Exercise(
        id = "u8_s6_p2_q7",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "便宜",
        targetPinyin = "piányi",
        targetTranslation = "murah",
        correctAnswer = "murah",
        audioToSpeak = "便宜",
        pictureOptions = listOf(
            PictureOption("u8_s6_p2_opt7_1", "murah", "🏷️", R.drawable.ic_coin, true),
            PictureOption("u8_s6_p2_opt7_2", "mahal", "💎", R.drawable.ic_crown, false),
            PictureOption("u8_s6_p2_opt7_3", "uang", "💰", R.drawable.ic_target, false),
            PictureOption("u8_s6_p2_opt7_4", "buku", "📖", R.drawable.ic_book, false)
        )
    ),

    // 8. Soal 8: Ketik Pinyin (murah -> piányi)
    Exercise(
        id = "u8_s6_p2_q8",
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

    // 9. Soal 9: Susun Kalimat (Grand Evaluasi Bab 8)
    Exercise(
        id = "u8_s6_p2_q9",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Saya pergi ke supermarket membeli pakaian.",
        targetHanzi = "我 去 超市 买 衣服。",
        targetPinyin = "Wǒ qù chāoshì mǎi yīfu.",
        wordChips = listOf("我:wǒ", "去:qù", "超市:chāoshì", "买:mǎi", "衣服:yīfu", "商店:shāngdiàn"),
        correctAnswer = "我,去,超市,买,衣服",
        audioToSpeak = "我去超市买衣服。"
    ),

    // 10. Soal 10: Ketuk Pasangan yang Sesuai (Grand Review Bab 8 Akhir)
    Exercise(
        id = "u8_s6_p2_m10_1",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u8_s6_p2_m10_1", "多少钱", "duōshao qián", "berapa harganya"),
            MatchPairItem("u8_s6_p2_m10_2", "太贵了", "tài guì le", "terlalu mahal"),
            MatchPairItem("u8_s6_p2_m10_3", "新衣服", "xīn yīfu", "baju baru"),
            MatchPairItem("u8_s6_p2_m10_4", "去超市", "qù chāoshì", "pergi ke supermarket")
        )
    )
)
