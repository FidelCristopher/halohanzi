package com.example.chineselearning.data.repository

import com.example.chineselearning.R
import com.example.chineselearning.data.model.Exercise
import com.example.chineselearning.data.model.ExerciseType
import com.example.chineselearning.data.model.MatchPairItem
import com.example.chineselearning.data.model.PictureOption

val bab11Stage3Part1Exercises = listOf(
    // 1. Soal 1: Pilihan Gambar (书 -> buku)
    Exercise(
        id = "u11_s3_p1_q1",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "书",
        targetPinyin = "shū",
        targetTranslation = "buku",
        correctAnswer = "buku",
        audioToSpeak = "书",
        pictureOptions = listOf(
            PictureOption("u11_s3_p1_opt1", "buku", "", R.drawable.ic_book_chinese, true),
            PictureOption("u11_s3_p1_opt2", "cangkir", "", R.drawable.ic_food_cup, false),
            PictureOption("u11_s3_p1_opt3", "meja", "", R.drawable.ic_fam_table, false),
            PictureOption("u11_s3_p1_opt4", "kursi", "", R.drawable.ic_fam_chair, false)
        )
    ),

    // 2. Soal 2: Susun Kalimat (Ini adalah buku saya.)
    Exercise(
        id = "u11_s3_p1_q2",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Ini adalah buku saya.",
        targetHanzi = "这 是 我 的 书。",
        targetPinyin = "Zhè shì wǒ de shū.",
        wordChips = listOf("这:zhè", "是:shì", "我:wǒ", "的:de", "书:shū", "那:nà"),
        correctAnswer = "这,是,我,的,书",
        audioToSpeak = "这是我的书。"
    ),

    // 3. Soal 3: Ketuk Pasangan yang Sesuai (Buku & Satuan)
    Exercise(
        id = "u11_s3_p1_q3",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u11_s3_p1_m1", "书", "shū", "buku"),
            MatchPairItem("u11_s3_p1_m2", "本", "běn", "jilid / buah (buku)"),
            MatchPairItem("u11_s3_p1_m3", "一本书", "yì běn shū", "sebuah buku"),
            MatchPairItem("u11_s3_p1_m4", "中文书", "Zhōngwén shū", "buku bahasa Mandarin")
        )
    ),

    // 4. Soal 4: Ketik Pinyin (buku -> shū)
    Exercise(
        id = "u11_s3_p1_q4",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "buku",
        sentenceWithBlank = "书 (________)",
        targetHanzi = "书",
        targetPinyin = "shū",
        correctAnswer = "shu",
        keyboardKeys = listOf("s", "h", "u", "a", "e", "i", "o", "b", "d", "g", "j"),
        audioToSpeak = "书"
    ),

    // 5. Soal 5: Mendengar Kalimat (Rule 10: illustrationRes = 0)
    Exercise(
        id = "u11_s3_p1_q5",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Apa yang Anda dengar?",
        targetTranslation = "Di atas meja ada tiga buku.",
        targetHanzi = "桌子 上 有 三 本 书。",
        targetPinyin = "Zhuōzi shang yǒu sān běn shū.",
        wordChips = listOf("桌子:zhuōzi", "上:shang", "有:yǒu", "三:sān", "本:běn", "书:shū"),
        correctAnswer = "桌子,上,有,三,本,书",
        illustrationRes = 0,
        audioToSpeak = "桌子上有三本书。"
    ),

    // 6. Soal 6: Pilihan Kalimat
    Exercise(
        id = "u11_s3_p1_q6",
        type = ExerciseType.SENTENCE_CHOICE,
        title = "Pilih terjemahan yang benar",
        targetHanzi = "我 买 了 两 本 书。",
        targetPinyin = "Wǒ mǎi le liǎng běn shū.",
        targetTranslation = "Saya membeli dua buah buku.",
        correctAnswer = "Wǒ mǎi le liǎng běn shū.\n我 买 了 两 本 书。",
        options = listOf(
            "Wǒ mǎi le liǎng běn shū.\n我 买 了 两 本 书。",
            "Tā mǎi le liǎng běn shū.\n他 买 了 两 本 书。",
            "Wǒ mǎi le sān běn shū.\n我 买 了 三 本 书。"
        ),
        audioToSpeak = "我买了两本书。"
    ),

    // 7. Soal 7: Pilihan Gambar (本 -> satuan jilid buku)
    Exercise(
        id = "u11_s3_p1_q7",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "本",
        targetPinyin = "běn",
        targetTranslation = "jilid (buku)",
        correctAnswer = "jilid (buku)",
        audioToSpeak = "本",
        pictureOptions = listOf(
            PictureOption("u11_s3_p1_opt7_1", "jilid (buku)", "", R.drawable.ic_edu_book_volume, true),
            PictureOption("u11_s3_p1_opt7_2", "barang", "", R.drawable.ic_shop_goods, false),
            PictureOption("u11_s3_p1_opt7_3", "cangkir", "", R.drawable.ic_food_cup, false),
            PictureOption("u11_s3_p1_opt7_4", "helai baju", "", R.drawable.ic_shop_piece_clothes, false)
        )
    ),

    // 8. Soal 8: Ketik Pinyin (jilid buku -> běn)
    Exercise(
        id = "u11_s3_p1_q8",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "jilid (kata bantu buku)",
        sentenceWithBlank = "本 (________)",
        targetHanzi = "本",
        targetPinyin = "běn",
        correctAnswer = "ben",
        keyboardKeys = listOf("b", "e", "n", "a", "i", "o", "u", "d", "g", "h", "j"),
        audioToSpeak = "本"
    ),

    // 9. Soal 9: Susun Kalimat (Buku ini berapa harganya?)
    Exercise(
        id = "u11_s3_p1_q9",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Buku ini berapa harganya?",
        targetHanzi = "这 本 书 多少 钱？",
        targetPinyin = "Zhè běn shū duōshao qián?",
        wordChips = listOf("这:zhè", "本:běn", "书:shū", "多少:duōshao", "钱？:qián?", "那:nà"),
        correctAnswer = "这,本,书,多少,钱？",
        audioToSpeak = "这本书多少钱？"
    ),

    // 10. Soal 10: Ketuk Pasangan yang Sesuai (Rangkuman Buku)
    Exercise(
        id = "u11_s3_p1_m10_1",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u11_s3_p1_m10_1", "书", "shū", "buku"),
            MatchPairItem("u11_s3_p1_m10_2", "本", "běn", "jilid"),
            MatchPairItem("u11_s3_p1_m10_3", "一本书", "yì běn shū", "sebuah buku"),
            MatchPairItem("u11_s3_p1_m10_4", "买书", "mǎi shū", "beli buku")
        )
    )
)

val bab11Stage3Part2Exercises = listOf(
    // 1. Soal 1: Pilihan Gambar (书店 -> toko buku)
    Exercise(
        id = "u11_s3_p2_q1",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "书店",
        targetPinyin = "shūdiàn",
        targetTranslation = "toko buku",
        correctAnswer = "toko buku",
        audioToSpeak = "书店",
        pictureOptions = listOf(
            PictureOption("u11_s3_p2_opt1", "toko buku", "", R.drawable.ic_edu_bookstore, true),
            PictureOption("u11_s3_p2_opt2", "restoran", "", R.drawable.ic_food_restaurant, false),
            PictureOption("u11_s3_p2_opt3", "sekolah", "", R.drawable.ic_edu_school, false),
            PictureOption("u11_s3_p2_opt4", "rumah", "", R.drawable.ic_fam_home, false)
        )
    ),

    // 2. Soal 2: Susun Kalimat (Saya pergi ke toko buku membeli buku.)
    Exercise(
        id = "u11_s3_p2_q2",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Saya ke toko buku beli buku.",
        targetHanzi = "我 去 书店 买 书。",
        targetPinyin = "Wǒ qù shūdiàn mǎi shū.",
        wordChips = listOf("我:wǒ", "去:qù", "书店:shūdiàn", "买:mǎi", "书:shū", "来:lái", "卖:mài"),
        correctAnswer = "我,去,书店,买,书",
        audioToSpeak = "我去书店买书。"
    ),

    // 3. Soal 3: Ketuk Pasangan yang Sesuai (Toko Buku & Buku)
    Exercise(
        id = "u11_s3_p2_q3",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u11_s3_p2_m1", "书店", "shūdiàn", "toko buku"),
            MatchPairItem("u11_s3_p2_m2", "去书店", "qù shūdiàn", "pergi ke toko buku"),
            MatchPairItem("u11_s3_p2_m3", "买书", "mǎi shū", "beli buku"),
            MatchPairItem("u11_s3_p2_m4", "很多书", "hěnduō shū", "banyak buku")
        )
    ),

    // 4. Soal 4: Ketik Pinyin (toko buku -> shūdiàn)
    Exercise(
        id = "u11_s3_p2_q4",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "toko buku",
        sentenceWithBlank = "书店 (________)",
        targetHanzi = "书店",
        targetPinyin = "shūdiàn",
        correctAnswer = "shudian",
        keyboardKeys = listOf("s", "h", "u", "d", "i", "a", "n", "e", "o", "b", "g"),
        audioToSpeak = "书店"
    ),

    // 5. Soal 5: Mendengar Kalimat (Rule 10: illustrationRes = 0)
    Exercise(
        id = "u11_s3_p2_q5",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Apa yang Anda dengar?",
        targetTranslation = "Toko buku ada di depan sekolah.",
        targetHanzi = "书店 在 学校 前面。",
        targetPinyin = "Shūdiàn zài xuéxiào qiánmiàn.",
        wordChips = listOf("书店:shūdiàn", "在:zài", "学校:xuéxiào", "前面:qiánmiàn", "后面:hòumiàn"),
        correctAnswer = "书店,在,学校,前面",
        illustrationRes = 0,
        audioToSpeak = "书店在学校前面。"
    ),

    // 6. Soal 6: Pilihan Kalimat
    Exercise(
        id = "u11_s3_p2_q6",
        type = ExerciseType.SENTENCE_CHOICE,
        title = "Pilih terjemahan yang benar",
        targetHanzi = "书店 里 有 很多 书。",
        targetPinyin = "Shūdiàn lǐ yǒu hěnduō shū.",
        targetTranslation = "Di dalam toko buku ada banyak buku.",
        correctAnswer = "Shūdiàn lǐ yǒu hěnduō shū.\n书店 里 有 很多 书。",
        options = listOf(
            "Shūdiàn lǐ yǒu hěnduō shū.\n书店 里 有 很多 书。",
            "Shāngdiàn lǐ yǒu hěnduō shū.\n商店 里 有 很多 书。",
            "Fàndiàn lǐ yǒu hěnduō shū.\n饭店 里 有 很多 书。"
        ),
        audioToSpeak = "书店里有很多书。"
    ),

    // 7. Soal 7: Pilihan Gambar (去书店 -> ke toko buku)
    Exercise(
        id = "u11_s3_p2_q7",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "书店",
        targetPinyin = "shūdiàn",
        targetTranslation = "toko buku",
        correctAnswer = "toko buku",
        audioToSpeak = "书店",
        pictureOptions = listOf(
            PictureOption("u11_s3_p2_opt7_1", "toko buku", "", R.drawable.ic_edu_bookstore, true),
            PictureOption("u11_s3_p2_opt7_2", "restoran", "", R.drawable.ic_food_restaurant, false),
            PictureOption("u11_s3_p2_opt7_3", "sekolah", "", R.drawable.ic_edu_school, false),
            PictureOption("u11_s3_p2_opt7_4", "stasiun", "", R.drawable.ic_trans_train_station, false)
        )
    ),

    // 8. Soal 8: Ketik Pinyin (sebuah buku -> yì běn shū)
    Exercise(
        id = "u11_s3_p2_q8",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "sebuah buku",
        sentenceWithBlank = "一本书 (________)",
        targetHanzi = "一本书",
        targetPinyin = "yìběnshū",
        correctAnswer = "yibenshu",
        keyboardKeys = listOf("y", "i", "b", "e", "n", "s", "h", "u", "a", "o", "d"),
        audioToSpeak = "一本书"
    ),

    // 9. Soal 9: Susun Kalimat (Dia membeli sebuah buku baru.)
    Exercise(
        id = "u11_s3_p2_q9",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Dia beli sebuah buku baru.",
        targetHanzi = "他 买 了 一 本 新 书。",
        targetPinyin = "Tā mǎi le yì běn xīn shū.",
        wordChips = listOf("他:tā", "买:mǎi", "了:le", "一:yì", "本:běn", "新:xīn", "书:shū"),
        correctAnswer = "他,买,了,一,本,新,书",
        audioToSpeak = "他买了一本新书。"
    ),

    // 10. Soal 10: Ketuk Pasangan yang Sesuai (Rangkuman Toko Buku)
    Exercise(
        id = "u11_s3_p2_m10_1",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u11_s3_p2_m10_1", "书店", "shūdiàn", "toko buku"),
            MatchPairItem("u11_s3_p2_m10_2", "一本书", "yì běn shū", "sebuah buku"),
            MatchPairItem("u11_s3_p2_m10_3", "新书", "xīn shū", "buku baru"),
            MatchPairItem("u11_s3_p2_m10_4", "买书", "mǎi shū", "beli buku")
        )
    )
)
