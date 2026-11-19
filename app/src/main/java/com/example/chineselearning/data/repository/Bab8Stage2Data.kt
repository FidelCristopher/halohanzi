package com.example.chineselearning.data.repository

import com.example.chineselearning.R
import com.example.chineselearning.data.model.Exercise
import com.example.chineselearning.data.model.ExerciseType
import com.example.chineselearning.data.model.MatchPairItem
import com.example.chineselearning.data.model.PictureOption

val bab8Stage2Part1Exercises = listOf(
    // 1. Soal 1: Pilihan Gambar (钱 -> uang)
    Exercise(
        id = "u8_s2_p1_q1",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "钱",
        targetPinyin = "qián",
        targetTranslation = "uang",
        correctAnswer = "uang",
        audioToSpeak = "钱",
        pictureOptions = listOf(
            PictureOption("u8_s2_p1_opt1", "uang", "💰", R.drawable.ic_coin, true),
            PictureOption("u8_s2_p1_opt2", "buku", "📖", R.drawable.ic_book, false),
            PictureOption("u8_s2_p1_opt3", "jam", "⏰", R.drawable.ic_story_timer, false),
            PictureOption("u8_s2_p1_opt4", "orang", "👤", R.drawable.ic_people_group, false)
        )
    ),

    // 2. Soal 2: Susun Kalimat (Buku ini berapa harganya?)
    Exercise(
        id = "u8_s2_p1_q2",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Buku ini berapa harganya?",
        targetHanzi = "这 本 书 多少 钱？",
        targetPinyin = "Zhè běn shū duōshao qián?",
        wordChips = listOf("这:zhè", "本:běn", "书:shū", "多少:duōshao", "钱？:qián?", "那:nà"),
        correctAnswer = "这,本,书,多少,钱？",
        audioToSpeak = "这本书多少钱？"
    ),

    // 3. Soal 3: Ketuk Pasangan yang Sesuai (Uang & Harga)
    Exercise(
        id = "u8_s2_p1_q3",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u8_s2_p1_m1", "钱", "qián", "uang"),
            MatchPairItem("u8_s2_p1_m2", "多少钱", "duōshao qián", "berapa harganya"),
            MatchPairItem("u8_s2_p1_m3", "有钱", "yǒu qián", "punya uang"),
            MatchPairItem("u8_s2_p1_m4", "没有钱", "méiyǒu qián", "tidak punya uang")
        )
    ),

    // 4. Soal 4: Ketik Pinyin (uang -> qián)
    Exercise(
        id = "u8_s2_p1_q4",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "uang",
        sentenceWithBlank = "钱 (________)",
        targetHanzi = "钱",
        targetPinyin = "qián",
        correctAnswer = "qian",
        keyboardKeys = listOf("q", "i", "a", "n", "e", "o", "u", "b", "d", "g", "h"),
        audioToSpeak = "钱"
    ),

    // 5. Soal 5: Mendengar Kalimat (Rule 10: illustrationRes = 0)
    Exercise(
        id = "u8_s2_p1_q5",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Apa yang Anda dengar?",
        targetTranslation = "Berapa harga apel ini?",
        targetHanzi = "这个 苹果 多少 钱？",
        targetPinyin = "Zhège píngguǒ duōshao qián?",
        wordChips = listOf("这个:zhège", "苹果:píngguǒ", "多少:duōshao", "钱？:qián?", "那个:nàgè"),
        correctAnswer = "这个,苹果,多少,钱？",
        illustrationRes = 0,
        audioToSpeak = "这个苹果多少钱？"
    ),

    // 6. Soal 6: Pilihan Kalimat
    Exercise(
        id = "u8_s2_p1_q6",
        type = ExerciseType.SENTENCE_CHOICE,
        title = "Pilih terjemahan yang benar",
        targetHanzi = "你 有 多少 钱？",
        targetPinyin = "Nǐ yǒu duōshao qián?",
        targetTranslation = "Kamu punya berapa banyak uang?",
        correctAnswer = "Nǐ yǒu duōshao qián?\n你 有 多少 钱？",
        options = listOf(
            "Nǐ yǒu duōshao qián?\n你 有 多少 钱？",
            "Tā yǒu duōshao qián?\n他 有 多少 钱？",
            "Nǐ yǒu qián ma?\n你 有 钱 吗？"
        ),
        audioToSpeak = "你有多少钱？"
    ),

    // 7. Soal 7: Pilihan Gambar (多少钱 -> berapa harganya)
    Exercise(
        id = "u8_s2_p1_q7",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "多少钱",
        targetPinyin = "duōshao qián",
        targetTranslation = "berapa harganya",
        correctAnswer = "berapa harganya",
        audioToSpeak = "多少钱",
        pictureOptions = listOf(
            PictureOption("u8_s2_p1_opt7_1", "berapa harganya", "💰", R.drawable.ic_coin, true),
            PictureOption("u8_s2_p1_opt7_2", "berapa orang", "👥", R.drawable.ic_people_group, false),
            PictureOption("u8_s2_p1_opt7_3", "jam berapa", "⏰", R.drawable.ic_story_timer, false),
            PictureOption("u8_s2_p1_opt7_4", "di mana", "📍", R.drawable.ic_target, false)
        )
    ),

    // 8. Soal 8: Ketik Pinyin (berapa harga -> duōshao qián)
    Exercise(
        id = "u8_s2_p1_q8",
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

    // 9. Soal 9: Susun Kalimat (Saya tidak punya uang.)
    Exercise(
        id = "u8_s2_p1_q9",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Saya tidak punya uang.",
        targetHanzi = "我 没有 钱。",
        targetPinyin = "Wǒ méiyǒu qián.",
        wordChips = listOf("我:wǒ", "没有:méiyǒu", "钱:qián", "有:yǒu", "他:tā"),
        correctAnswer = "我,没有,钱",
        audioToSpeak = "我没有钱。"
    ),

    // 10. Soal 10: Ketuk Pasangan yang Sesuai (Rangkuman Uang & Pertanyaan)
    Exercise(
        id = "u8_s2_p1_m10_1",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u8_s2_p1_m10_1", "多少钱", "duōshao qián", "berapa harganya"),
            MatchPairItem("u8_s2_p1_m10_2", "没有钱", "méiyǒu qián", "tidak ada uang"),
            MatchPairItem("u8_s2_p1_m10_3", "钱", "qián", "uang"),
            MatchPairItem("u8_s2_p1_m10_4", "买东西", "mǎi dōngxi", "beli barang")
        )
    )
)

val bab8Stage2Part2Exercises = listOf(
    // 1. Soal 1: Pilihan Gambar (块 -> yuan lisan)
    Exercise(
        id = "u8_s2_p2_q1",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "块",
        targetPinyin = "kuài",
        targetTranslation = "yuan (uang lisan)",
        correctAnswer = "yuan (uang lisan)",
        audioToSpeak = "块",
        pictureOptions = listOf(
            PictureOption("u8_s2_p2_opt1", "yuan (lisan)", "💴", R.drawable.ic_coin, true),
            PictureOption("u8_s2_p2_opt2", "jam", "⏰", R.drawable.ic_story_timer, false),
            PictureOption("u8_s2_p2_opt3", "buku", "📖", R.drawable.ic_book, false),
            PictureOption("u8_s2_p2_opt4", "orang", "👤", R.drawable.ic_people_group, false)
        )
    ),

    // 2. Soal 2: Susun Kalimat (Apel ini lima yuan.)
    Exercise(
        id = "u8_s2_p2_q2",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Apel ini lima yuan.",
        targetHanzi = "这个 苹果 五 块 钱。",
        targetPinyin = "Zhège píngguǒ wǔ kuài qián.",
        wordChips = listOf("这个:zhège", "苹果:píngguǒ", "五:wǔ", "块:kuài", "钱:qián", "六:liù"),
        correctAnswer = "这个,苹果,五,块,钱",
        audioToSpeak = "这个苹果五块钱。"
    ),

    // 3. Soal 3: Ketuk Pasangan yang Sesuai (Satuan Mata Uang)
    Exercise(
        id = "u8_s2_p2_q3",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u8_s2_p2_m1", "块", "kuài", "yuan (lisan)"),
            MatchPairItem("u8_s2_p2_m2", "元", "yuán", "yuan (resmi/tulisan)"),
            MatchPairItem("u8_s2_p2_m3", "十块钱", "shí kuài qián", "sepuluh yuan"),
            MatchPairItem("u8_s2_p2_m4", "一百元", "yìbǎi yuán", "seratus yuan")
        )
    ),

    // 4. Soal 4: Ketik Pinyin (yuan lisan -> kuài)
    Exercise(
        id = "u8_s2_p2_q4",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "yuan (lisan)",
        sentenceWithBlank = "块 (________)",
        targetHanzi = "块",
        targetPinyin = "kuài",
        correctAnswer = "kuai",
        keyboardKeys = listOf("k", "u", "a", "i", "e", "o", "b", "d", "g", "h", "j"),
        audioToSpeak = "块"
    ),

    // 5. Soal 5: Mendengar Kalimat (Rule 10: illustrationRes = 0)
    Exercise(
        id = "u8_s2_p2_q5",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Apa yang Anda dengar?",
        targetTranslation = "Semuanya berjumlah dua puluh yuan.",
        targetHanzi = "一共 二十 块 钱。",
        targetPinyin = "Yígòng èrshí kuài qián.",
        wordChips = listOf("一共:yígòng", "二十:èrshí", "块:kuài", "钱:qián", "三十:sānshí"),
        correctAnswer = "一共,二十,块,钱",
        illustrationRes = 0,
        audioToSpeak = "一共二十块钱。"
    ),

    // 6. Soal 6: Pilihan Kalimat
    Exercise(
        id = "u8_s2_p2_q6",
        type = ExerciseType.SENTENCE_CHOICE,
        title = "Pilih terjemahan yang benar",
        targetHanzi = "一 碗 面条儿 十五 元。",
        targetPinyin = "Yì wǎn miàntiáor shíwǔ yuán.",
        targetTranslation = "Semangkuk mie 15 yuan.",
        correctAnswer = "Yì wǎn miàntiáor shíwǔ yuán.\n一 碗 面条儿 十五 元。",
        options = listOf(
            "Yì wǎn miàntiáor shíwǔ yuán.\n一 碗 面条儿 十五 元。",
            "Yì wǎn mǐfàn shíwǔ yuán.\n一 碗 米饭 十五 元。",
            "Yì wǎn miàntiáor èrshí yuán.\n一 碗 面条儿 二十 元。"
        ),
        audioToSpeak = "一碗面条儿十五元。"
    ),

    // 7. Soal 7: Pilihan Gambar (元 -> yuan resmi)
    Exercise(
        id = "u8_s2_p2_q7",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "元",
        targetPinyin = "yuán",
        targetTranslation = "yuan (resmi)",
        correctAnswer = "yuan (resmi)",
        audioToSpeak = "元",
        pictureOptions = listOf(
            PictureOption("u8_s2_p2_opt7_1", "yuan (resmi)", "💴", R.drawable.ic_coin, true),
            PictureOption("u8_s2_p2_opt7_2", "dolar", "💵", R.drawable.ic_book, false),
            PictureOption("u8_s2_p2_opt7_3", "emas", "🪙", R.drawable.ic_crown, false),
            PictureOption("u8_s2_p2_opt7_4", "jam", "⏰", R.drawable.ic_story_timer, false)
        )
    ),

    // 8. Soal 8: Ketik Pinyin (yuan resmi -> yuán)
    Exercise(
        id = "u8_s2_p2_q8",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "yuan (resmi)",
        sentenceWithBlank = "元 (________)",
        targetHanzi = "元",
        targetPinyin = "yuán",
        correctAnswer = "yuan",
        keyboardKeys = listOf("y", "u", "a", "n", "e", "i", "o", "b", "d", "g", "h"),
        audioToSpeak = "元"
    ),

    // 9. Soal 9: Susun Kalimat (Buku ini lima puluh yuan.)
    Exercise(
        id = "u8_s2_p2_q9",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Buku ini 50 yuan.",
        targetHanzi = "这 本 书 五十 块。",
        targetPinyin = "Zhè běn shū wǔshí kuài.",
        wordChips = listOf("这:zhè", "本:běn", "书:shū", "五十:wǔshí", "块:kuài", "四十:sìshí"),
        correctAnswer = "这,本,书,五十,块",
        audioToSpeak = "这本书五十块。"
    ),

    // 10. Soal 10: Ketuk Pasangan yang Sesuai (Rangkuman Satuan Uang)
    Exercise(
        id = "u8_s2_p2_m10_1",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u8_s2_p2_m10_1", "块", "kuài", "yuan (lisan)"),
            MatchPairItem("u8_s2_p2_m10_2", "元", "yuán", "yuan (resmi)"),
            MatchPairItem("u8_s2_p2_m10_3", "五十块", "wǔshí kuài", "50 yuan"),
            MatchPairItem("u8_s2_p2_m10_4", "一百块", "yìbǎi kuài", "100 yuan")
        )
    )
)
