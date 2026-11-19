package com.example.chineselearning.data.repository

import com.example.chineselearning.R
import com.example.chineselearning.data.model.Exercise
import com.example.chineselearning.data.model.ExerciseType
import com.example.chineselearning.data.model.MatchPairItem
import com.example.chineselearning.data.model.PictureOption

val bab8Stage4Part1Exercises = listOf(
    // 1. Soal 1: Pilihan Gambar (衣服 -> pakaian / baju)
    Exercise(
        id = "u8_s4_p1_q1",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "衣服",
        targetPinyin = "yīfu",
        targetTranslation = "pakaian / baju",
        correctAnswer = "pakaian / baju",
        audioToSpeak = "衣服",
        pictureOptions = listOf(
            PictureOption("u8_s4_p1_opt1", "pakaian / baju", "👕", R.drawable.ic_shop_clothes, true),
            PictureOption("u8_s4_p1_opt2", "buku", "📖", R.drawable.ic_book, false),
            PictureOption("u8_s4_p1_opt3", "meja", "🪵", R.drawable.ic_target, false),
            PictureOption("u8_s4_p1_opt4", "kursi", "🪑", R.drawable.ic_crown, false)
        )
    ),

    // 2. Soal 2: Susun Kalimat (Saya ingin membeli baju.)
    Exercise(
        id = "u8_s4_p1_q2",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Saya ingin membeli pakaian.",
        targetHanzi = "我 想 买 衣服。",
        targetPinyin = "Wǒ xiǎng mǎi yīfu.",
        wordChips = listOf("我:wǒ", "想:xiǎng", "买:mǎi", "衣服:yīfu", "穿:chuān", "卖:mài"),
        correctAnswer = "我,想,买,衣服",
        audioToSpeak = "我想买衣服。"
    ),

    // 3. Soal 3: Ketuk Pasangan yang Sesuai (Pakaian & Memakai)
    Exercise(
        id = "u8_s4_p1_q3",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u8_s4_p1_m1", "衣服", "yīfu", "pakaian / baju"),
            MatchPairItem("u8_s4_p1_m2", "穿", "chuān", "memakai / mengenakan"),
            MatchPairItem("u8_s4_p1_m3", "穿衣服", "chuān yīfu", "memakai baju"),
            MatchPairItem("u8_s4_p1_m4", "买衣服", "mǎi yīfu", "membeli baju")
        )
    ),

    // 4. Soal 4: Ketik Pinyin (pakaian -> yīfu)
    Exercise(
        id = "u8_s4_p1_q4",
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

    // 5. Soal 5: Mendengar Kalimat (Rule 10: illustrationRes = 0)
    Exercise(
        id = "u8_s4_p1_q5",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Apa yang Anda dengar?",
        targetTranslation = "Dia memakai sebuah baju.",
        targetHanzi = "她 穿 这 件 衣服。",
        targetPinyin = "Tā chuān zhè jiàn yīfu.",
        wordChips = listOf("她:tā", "穿:chuān", "这:zhè", "件:jiàn", "衣服:yīfu", "那:nà"),
        correctAnswer = "她,穿,这,件,衣服",
        illustrationRes = 0,
        audioToSpeak = "她穿这件衣服。"
    ),

    // 6. Soal 6: Pilihan Kalimat
    Exercise(
        id = "u8_s4_p1_q6",
        type = ExerciseType.SENTENCE_CHOICE,
        title = "Pilih terjemahan yang benar",
        targetHanzi = "你 穿 这 件 衣服 很 漂亮。",
        targetPinyin = "Nǐ chuān zhè jiàn yīfu hěn piàoliang.",
        targetTranslation = "Kamu memakai baju ini sangat cantik.",
        correctAnswer = "Nǐ chuān zhè jiàn yīfu hěn piàoliang.\n你 穿 这 件 衣服 很 漂亮。",
        options = listOf(
            "Nǐ chuān zhè jiàn yīfu hěn piàoliang.\n你 穿 这 件 衣服 很 漂亮。",
            "Tā chuān zhè jiàn yīfu hěn piàoliang.\n他 穿 这 件 衣服 很 漂亮。",
            "Nǐ mǎi zhè jiàn yīfu hěn piàoliang.\n你 买 这 件 衣服 很 漂亮。"
        ),
        audioToSpeak = "你穿这件衣服很漂亮。"
    ),

    // 7. Soal 7: Pilihan Gambar (穿 -> memakai)
    Exercise(
        id = "u8_s4_p1_q7",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "穿",
        targetPinyin = "chuān",
        targetTranslation = "memakai",
        correctAnswer = "memakai",
        audioToSpeak = "穿",
        pictureOptions = listOf(
            PictureOption("u8_s4_p1_opt7_1", "memakai", "👔", R.drawable.ic_shop_wear, true),
            PictureOption("u8_s4_p1_opt7_2", "makan", "🍚", R.drawable.ic_book, false),
            PictureOption("u8_s4_p1_opt7_3", "minum", "🍵", R.drawable.ic_target, false),
            PictureOption("u8_s4_p1_opt7_4", "tidur", "🛌", R.drawable.ic_crown, false)
        )
    ),

    // 8. Soal 8: Ketik Pinyin (memakai -> chuān)
    Exercise(
        id = "u8_s4_p1_q8",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "memakai / mengenakan",
        sentenceWithBlank = "穿 (________)",
        targetHanzi = "穿",
        targetPinyin = "chuān",
        correctAnswer = "chuan",
        keyboardKeys = listOf("c", "h", "u", "a", "n", "e", "i", "o", "b", "d", "g"),
        audioToSpeak = "穿"
    ),

    // 9. Soal 9: Susun Kalimat (Baju ini sangat cantik.)
    Exercise(
        id = "u8_s4_p1_q9",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Baju ini sangat cantik.",
        targetHanzi = "这 件 衣服 很 漂亮。",
        targetPinyin = "Zhè jiàn yīfu hěn piàoliang.",
        wordChips = listOf("这:zhè", "件:jiàn", "衣服:yīfu", "很:hěn", "漂亮:piàoliang", "那:nà"),
        correctAnswer = "这,件,衣服,很,漂亮",
        audioToSpeak = "这件衣服很漂亮。"
    ),

    // 10. Soal 10: Ketuk Pasangan yang Sesuai (Rangkuman Pakaian)
    Exercise(
        id = "u8_s4_p1_m10_1",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u8_s4_p1_m10_1", "衣服", "yīfu", "pakaian"),
            MatchPairItem("u8_s4_p1_m10_2", "穿", "chuān", "memakai"),
            MatchPairItem("u8_s4_p1_m10_3", "很漂亮", "hěn piàoliang", "sangat cantik"),
            MatchPairItem("u8_s4_p1_m10_4", "买衣服", "mǎi yīfu", "beli pakaian")
        )
    )
)

val bab8Stage4Part2Exercises = listOf(
    // 1. Soal 1: Pilihan Gambar (新 -> baru)
    Exercise(
        id = "u8_s4_p2_q1",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "新",
        targetPinyin = "xīn",
        targetTranslation = "baru",
        correctAnswer = "baru",
        audioToSpeak = "新",
        pictureOptions = listOf(
            PictureOption("u8_s4_p2_opt1", "baru", "✨", R.drawable.ic_crown, true),
            PictureOption("u8_s4_p2_opt2", "lama / bekas", "📦", R.drawable.ic_book, false),
            PictureOption("u8_s4_p2_opt3", "mahal", "💎", R.drawable.ic_shop_expensive, false),
            PictureOption("u8_s4_p2_opt4", "murah", "🏷️", R.drawable.ic_target, false)
        )
    ),

    // 2. Soal 2: Susun Kalimat (Saya membeli sehelai baju baru.)
    Exercise(
        id = "u8_s4_p2_q2",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Saya beli sehelai baju baru.",
        targetHanzi = "我 买 了 一 件 新 衣服。",
        targetPinyin = "Wǒ mǎi le yí jiàn xīn yīfu.",
        wordChips = listOf("我:wǒ", "买:mǎi", "了:le", "一:yí", "件:jiàn", "新:xīn", "衣服:yīfu"),
        correctAnswer = "我,买,了,一,件,新,衣服",
        audioToSpeak = "我买了一件新衣服。"
    ),

    // 3. Soal 3: Ketuk Pasangan yang Sesuai (Satuan Pakaian & Baru)
    Exercise(
        id = "u8_s4_p2_q3",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u8_s4_p2_m1", "件", "jiàn", "helai / potong (pakaian)"),
            MatchPairItem("u8_s4_p2_m2", "新", "xīn", "baru"),
            MatchPairItem("u8_s4_p2_m3", "新衣服", "xīn yīfu", "pakaian baru"),
            MatchPairItem("u8_s4_p2_m4", "一件衣服", "yí jiàn yīfu", "sehelai pakaian")
        )
    ),

    // 4. Soal 4: Ketik Pinyin (potong/helai baju -> jiàn)
    Exercise(
        id = "u8_s4_p2_q4",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "helai / potong (baju)",
        sentenceWithBlank = "件 (________)",
        targetHanzi = "件",
        targetPinyin = "jiàn",
        correctAnswer = "jian",
        keyboardKeys = listOf("j", "i", "a", "n", "e", "o", "u", "b", "d", "g", "h"),
        audioToSpeak = "件"
    ),

    // 5. Soal 5: Mendengar Kalimat (Rule 10: illustrationRes = 0)
    Exercise(
        id = "u8_s4_p2_q5",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Apa yang Anda dengar?",
        targetTranslation = "Baju baru ini seratus yuan.",
        targetHanzi = "这 件 新 衣服 一百 块。",
        targetPinyin = "Zhè jiàn xīn yīfu yìbǎi kuài.",
        wordChips = listOf("这:zhè", "件:jiàn", "新:xīn", "衣服:yīfu", "一百:yìbǎi", "块:kuài"),
        correctAnswer = "这,件,新,衣服,一百,块",
        illustrationRes = 0,
        audioToSpeak = "这件新衣服一百块。"
    ),

    // 6. Soal 6: Pilihan Kalimat
    Exercise(
        id = "u8_s4_p2_q6",
        type = ExerciseType.SENTENCE_CHOICE,
        title = "Pilih terjemahan yang benar",
        targetHanzi = "他 穿 了 一 件 新 衣服。",
        targetPinyin = "Tā chuān le yí jiàn xīn yīfu.",
        targetTranslation = "Dia memakai sehelai pakaian baru.",
        correctAnswer = "Tā chuān le yí jiàn xīn yīfu.\n他 穿 了 一 件 新 衣服。",
        options = listOf(
            "Tā chuān le yí jiàn xīn yīfu.\n他 穿 了 一 件 新 衣服。",
            "Wǒ chuān le yí jiàn xīn yīfu.\n我 穿 了 一 件 新 衣服。",
            "Tā mǎi le yí jiàn xīn yīfu.\n他 买 了 一 件 新 衣服。"
        ),
        audioToSpeak = "他穿了一件新衣服。"
    ),

    // 7. Soal 7: Pilihan Gambar (件 -> kata bantu pakaian)
    Exercise(
        id = "u8_s4_p2_q7",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "件",
        targetPinyin = "jiàn",
        targetTranslation = "helai (pakaian)",
        correctAnswer = "helai (pakaian)",
        audioToSpeak = "件",
        pictureOptions = listOf(
            PictureOption("u8_s4_p2_opt7_1", "helai (baju)", "👔", R.drawable.ic_shop_piece_clothes, true),
            PictureOption("u8_s4_p2_opt7_2", "buah (benda)", "📦", R.drawable.ic_book, false),
            PictureOption("u8_s4_p2_opt7_3", "cangkir", "🥛", R.drawable.ic_target, false),
            PictureOption("u8_s4_p2_opt7_4", "buku", "📖", R.drawable.ic_story_timer, false)
        )
    ),

    // 8. Soal 8: Ketik Pinyin (baru -> xīn)
    Exercise(
        id = "u8_s4_p2_q8",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "baru",
        sentenceWithBlank = "新 (________)",
        targetHanzi = "新",
        targetPinyin = "xīn",
        correctAnswer = "xin",
        keyboardKeys = listOf("x", "i", "n", "a", "e", "o", "u", "b", "d", "g", "h"),
        audioToSpeak = "新"
    ),

    // 9. Soal 9: Susun Kalimat (Baju ini berapa harganya?)
    Exercise(
        id = "u8_s4_p2_q9",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Baju ini berapa harganya?",
        targetHanzi = "这 件 衣服 多少 钱？",
        targetPinyin = "Zhè jiàn yīfu duōshao qián?",
        wordChips = listOf("这:zhè", "件:jiàn", "衣服:yīfu", "多少:duōshao", "钱？:qián?", "那:nà"),
        correctAnswer = "这,件,衣服,多少,钱？",
        audioToSpeak = "这件衣服多少钱？"
    ),

    // 10. Soal 10: Ketuk Pasangan yang Sesuai (Rangkuman Pakaian Baru)
    Exercise(
        id = "u8_s4_p2_m10_1",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u8_s4_p2_m10_1", "一件衣服", "yí jiàn yīfu", "sehelai baju"),
            MatchPairItem("u8_s4_p2_m2", "新衣服", "xīn yīfu", "baju baru"),
            MatchPairItem("u8_s4_p2_m3", "穿新衣服", "chuān xīn yīfu", "pakai baju baru"),
            MatchPairItem("u8_s4_p2_m4", "多少钱", "duōshao qián", "berapa harganya")
        )
    )
)
