package com.example.chineselearning.data.repository

import com.example.chineselearning.R
import com.example.chineselearning.data.model.Exercise
import com.example.chineselearning.data.model.ExerciseType
import com.example.chineselearning.data.model.MatchPairItem
import com.example.chineselearning.data.model.PictureOption

val bab25Stage3Part1Exercises = listOf(
    // 1. Soal 1: Pilihan Gambar (游泳 -> berenang)
    Exercise(
        id = "u25_s3_p1_q1",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "游泳",
        targetPinyin = "yóuyǒng",
        targetTranslation = "berenang",
        correctAnswer = "berenang",
        audioToSpeak = "游泳",
        pictureOptions = listOf(
            PictureOption("u25_s3_p1_opt1", "renang", "", R.drawable.ic_sport_swim, true),
            PictureOption("u25_s3_p1_opt2", "lari", "", R.drawable.ic_sport_running, false),
            PictureOption("u25_s3_p1_opt3", "sepak bola", "", R.drawable.ic_sport_soccer, false),
            PictureOption("u25_s3_p1_opt4", "basket", "", R.drawable.ic_sport_basketball, false)
        )
    ),

    // 2. Soal 2: Susun Kalimat (Di musim panas semua orang paling suka pergi ke pantai berenang.)
    Exercise(
        id = "u25_s3_p1_q2",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Musim panas semua suka ke pantai berenang.",
        targetHanzi = "夏天 大家 去 海边 游泳。",
        targetPinyin = "Xiàtiān dàjiā qù hǎibiān yóuyǒng.",
        wordChips = listOf("夏天:xiàtiān", "大家:dàjiā", "去:qù", "海边:hǎibiān", "游泳。:yóuyǒng.", "跑步:pǎobù"),
        correctAnswer = "夏天,大家,去,海边,游泳。",
        audioToSpeak = "夏天大家去海边游泳。"
    ),

    // 3. Soal 3: Ketuk Pasangan yang Sesuai (Berenang)
    Exercise(
        id = "u25_s3_p1_q3",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u25_s3_p1_m1", "游", "yóu", "berenang (kata kerja)"),
            MatchPairItem("u25_s3_p1_m2", "游泳", "yóuyǒng", "olahraga renang"),
            MatchPairItem("u25_s3_p1_m3", "去海边", "qù hǎibiān", "ke pantai"),
            MatchPairItem("u25_s3_p1_m4", "夏天", "xiàtiān", "musim panas")
        )
    ),

    // 4. Soal 4: Ketik Pinyin (berenang -> yóu)
    Exercise(
        id = "u25_s3_p1_q4",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "berenang",
        sentenceWithBlank = "游 (________)",
        targetHanzi = "游",
        targetPinyin = "yóu",
        correctAnswer = "you",
        keyboardKeys = listOf("y", "o", "u", "a", "e", "i", "b", "d", "g", "h", "j", "l"),
        audioToSpeak = "游"
    ),

    // 5. Soal 5: Mendengar Kalimat (Rule 10: illustrationRes = 0)
    Exercise(
        id = "u25_s3_p1_q5",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Apa yang Anda dengar?",
        targetTranslation = "Ikan kecil berenang bebas ke sana ke mari di dalam air.",
        targetHanzi = "小鱼 在 水 里 游。",
        targetPinyin = "Xiǎoyú zài shuǐ lǐ yóu.",
        wordChips = listOf("小鱼:xiǎoyú", "在:zài", "水:shuǐ", "里:lǐ", "游。:yóu.", "飞:fēi"),
        correctAnswer = "小鱼,在,水,里,游。",
        illustrationRes = 0,
        audioToSpeak = "小鱼在水里游。"
    ),

    // 6. Soal 6: Pilihan Kalimat
    Exercise(
        id = "u25_s3_p1_q6",
        type = ExerciseType.SENTENCE_CHOICE,
        title = "Pilih terjemahan yang benar",
        targetHanzi = "你 会 不 会 游泳？",
        targetPinyin = "Nǐ huì bu huì yóuyǒng?",
        targetTranslation = "Apakah kamu bisa berenang?",
        correctAnswer = "Nǐ huì bu huì yóuyǒng?\n你 会 不 会 游泳？",
        options = listOf(
            "Nǐ huì bu huì yóuyǒng?\n你 会 不 会 游泳？",
            "Nǐ huì bu huì chànggē?\n你 会 不 会 唱歌？",
            "Tā huì bu huì yóuyǒng?\n他 会 不 会 游泳？"
        ),
        audioToSpeak = "你会不会游泳？"
    ),

    // 7. Soal 7: Pilihan Gambar (游 -> berenang di air)
    Exercise(
        id = "u25_s3_p1_q7",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "游",
        targetPinyin = "yóu",
        targetTranslation = "berenang",
        correctAnswer = "berenang",
        audioToSpeak = "游",
        pictureOptions = listOf(
            PictureOption("u25_s3_p1_opt7_1", "berenang", "", R.drawable.ic_sport_swim, true),
            PictureOption("u25_s3_p1_opt7_2", "lari", "", R.drawable.ic_sport_running, false),
            PictureOption("u25_s3_p1_opt7_3", "basket", "", R.drawable.ic_sport_basketball, false),
            PictureOption("u25_s3_p1_opt7_4", "fitness", "", R.drawable.ic_sport_fitness, false)
        )
    ),

    // 8. Soal 8: Ketik Pinyin (berenang -> yóuyǒng)
    Exercise(
        id = "u25_s3_p1_q8",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "berenang (olahraga)",
        sentenceWithBlank = "游泳 (________)",
        targetHanzi = "游泳",
        targetPinyin = "yóuyǒng",
        correctAnswer = "youyong",
        keyboardKeys = listOf("y", "o", "u", "n", "g", "a", "e", "i", "b", "d", "h", "j"),
        audioToSpeak = "游泳"
    ),

    // 9. Soal 9: Susun Kalimat (Saya bisa berenang dengan sangat baik.)
    Exercise(
        id = "u25_s3_p1_q9",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Saya berenang sangat baik.",
        targetHanzi = "我 游 得 很 好。",
        targetPinyin = "Wǒ yóu de hěn hǎo.",
        wordChips = listOf("我:wǒ", "游:yóu", "得:de", "很:hěn", "好。:hǎo.", "慢:màn"),
        correctAnswer = "我,游,得,很,好。",
        audioToSpeak = "我游得很好。"
    ),

    // 10. Soal 10: Ketuk Pasangan yang Sesuai (Rangkuman Olahraga Renang)
    Exercise(
        id = "u25_s3_p1_m10",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u25_s3_p1_m10_1", "游", "yóu", "berenang"),
            MatchPairItem("u25_s3_p1_m2", "游泳池", "yóuyǒngchí", "kolam renang"),
            MatchPairItem("u25_s3_p1_m3", "学游泳", "xué yóuyǒng", "belajar renang"),
            MatchPairItem("u25_s3_p1_m4", "会游泳", "huì yóuyǒng", "bisa renang")
        )
    )
)

val bab25Stage3Part2Exercises = listOf(
    // 1. Soal 1: Pilihan Gambar (跳舞 -> menari / berdansa)
    Exercise(
        id = "u25_s3_p2_q1",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "跳舞",
        targetPinyin = "tiàowǔ",
        targetTranslation = "menari / berdansa",
        correctAnswer = "menari / berdansa",
        audioToSpeak = "跳舞",
        pictureOptions = listOf(
            PictureOption("u25_s3_p2_opt1", "menari", "", R.drawable.ic_sport_fitness, true),
            PictureOption("u25_s3_p2_opt2", "renang", "", R.drawable.ic_sport_swim, false),
            PictureOption("u25_s3_p2_opt3", "lari", "", R.drawable.ic_sport_running, false),
            PictureOption("u25_s3_p2_opt4", "sepak bola", "", R.drawable.ic_sport_soccer, false)
        )
    ),

    // 2. Soal 2: Susun Kalimat (Kakak perempuan sejak kecil sudah suka menari.)
    Exercise(
        id = "u25_s3_p2_q2",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Kakak perempuan sejak kecil suka menari.",
        targetHanzi = "姐姐 从小 喜欢 跳舞。",
        targetPinyin = "Jiějie cóngxiǎo xǐhuan tiàowǔ.",
        wordChips = listOf("姐姐:jiějie", "从小:cóngxiǎo", "喜欢:xǐhuan", "跳舞。:tiàowǔ.", "游泳:yóuyǒng"),
        correctAnswer = "姐姐,从小,喜欢,跳舞。",
        audioToSpeak = "姐姐从小喜欢跳舞。"
    ),

    // 3. Soal 3: Ketuk Pasangan yang Sesuai (Menari & Seni Gerak)
    Exercise(
        id = "u25_s3_p2_m3",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u25_s3_p2_m1", "跳舞", "tiàowǔ", "menari / berdansa"),
            MatchPairItem("u25_s3_p2_m2", "唱歌", "chànggē", "bernyanyi"),
            MatchPairItem("u25_s3_p2_m3", "跳得好", "tiào de hǎo", "menari bagus"),
            MatchPairItem("u25_s3_p2_m4", "从小喜欢", "cóngxiǎo xǐhuan", "sejak kecil suka")
        )
    ),

    // 4. Soal 4: Ketik Pinyin (menari -> tiàowǔ)
    Exercise(
        id = "u25_s3_p2_q4",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "menari / berdansa",
        sentenceWithBlank = "跳舞 (________)",
        targetHanzi = "跳舞",
        targetPinyin = "tiàowǔ",
        correctAnswer = "tiaowu",
        keyboardKeys = listOf("t", "i", "a", "o", "w", "u", "e", "b", "d", "g", "h", "j"),
        audioToSpeak = "跳舞"
    ),

    // 5. Soal 5: Mendengar Kalimat (Rule 10: illustrationRes = 0)
    Exercise(
        id = "u25_s3_p2_q5",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Apa yang Anda dengar?",
        targetTranslation = "Gadis kecil itu menari dengan sangat indah.",
        targetHanzi = "小 女孩儿 跳舞 跳 得 真 好看。",
        targetPinyin = "Xiǎo nǚháiér tiàowǔ tiào de zhēn hǎokàn.",
        wordChips = listOf("小:xiǎo", "女孩儿:nǚháiér", "跳舞:tiàowǔ", "跳:tiào", "得:de", "真:zhēn", "好看。:hǎokàn.", "唱歌:chànggē"),
        correctAnswer = "小,女孩儿,跳舞,跳,得,真,好看。",
        illustrationRes = 0,
        audioToSpeak = "小女孩儿跳舞跳得真好看。"
    ),

    // 6. Soal 6: Pilihan Kalimat
    Exercise(
        id = "u25_s3_p2_q6",
        type = ExerciseType.SENTENCE_CHOICE,
        title = "Pilih terjemahan yang benar",
        targetHanzi = "晚上 广场 上 有 很多 人 在 跳舞。",
        targetPinyin = "Wǎnshang guǎngchǎng shang yǒu hěn duō rén zài tiàowǔ.",
        targetTranslation = "Malam hari di alun-alun ada banyak orang sedang menari.",
        correctAnswer = "Wǎnshang guǎngchǎng shang yǒu hěn duō rén zài tiàowǔ.\n晚上 广场 上 有 很多 人 在 跳舞。",
        options = listOf(
            "Wǎnshang guǎngchǎng shang yǒu hěn duō rén zài tiàowǔ.\n晚上 广场 上 有 很多 人 在 跳舞。",
            "Zǎoshang guǎngchǎng shang yǒu hěn duō rén zài pǎobù.\n早上 广场 上 有 很多 人 在 跑步。",
            "Wǎnshang jiā lǐ yǒu hěn duō rén zài tiàowǔ.\n晚上 家 里 有 很多 人 在 跳舞。"
        ),
        audioToSpeak = "晚上广场上有很多人在跳舞。"
    ),

    // 7. Soal 7: Pilihan Gambar (跳舞 -> tari seni)
    Exercise(
        id = "u25_s3_p2_q7",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "跳舞",
        targetPinyin = "tiàowǔ",
        targetTranslation = "seni tari",
        correctAnswer = "seni tari",
        audioToSpeak = "跳舞",
        pictureOptions = listOf(
            PictureOption("u25_s3_p2_opt7_1", "menari", "", R.drawable.ic_sport_fitness, true),
            PictureOption("u25_s3_p2_opt7_2", "lari", "", R.drawable.ic_sport_running, false),
            PictureOption("u25_s3_p2_opt7_3", "sepak bola", "", R.drawable.ic_sport_soccer, false),
            PictureOption("u25_s3_p2_opt7_4", "renang", "", R.drawable.ic_sport_swim, false)
        )
    ),

    // 8. Soal 8: Ketik Pinyin (menari -> tiàowǔ)
    Exercise(
        id = "u25_s3_p2_q8",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "menari",
        sentenceWithBlank = "跳舞 (________)",
        targetHanzi = "跳舞",
        targetPinyin = "tiàowǔ",
        correctAnswer = "tiaowu",
        keyboardKeys = listOf("t", "i", "a", "o", "w", "u", "e", "b", "d", "g", "h", "j"),
        audioToSpeak = "跳舞"
    ),

    // 9. Soal 9: Susun Kalimat (Ayo kita menari bersama-sama.)
    Exercise(
        id = "u25_s3_p2_q9",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Ayo kita menari bersama.",
        targetHanzi = "我们 一起 跳舞 吧。",
        targetPinyin = "Wǒmen yìqǐ tiàowǔ ba.",
        wordChips = listOf("我们:wǒmen", "一起:yìqǐ", "跳舞:tiàowǔ", "吧。:ba.", "唱歌:chànggē"),
        correctAnswer = "我们,一起,跳舞,吧。",
        audioToSpeak = "我们一起跳舞吧。"
    ),

    // 10. Soal 10: Ketuk Pasangan yang Sesuai (Rangkuman Tari & Olahraga)
    Exercise(
        id = "u25_s3_p2_m10",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u25_s3_p2_m10_1", "跳舞", "tiàowǔ", "menari"),
            MatchPairItem("u25_s3_p2_m10_2", "真好看", "zhēn hǎokàn", "sangat indah"),
            MatchPairItem("u25_s3_p2_m3", "学跳舞", "xué tiàowǔ", "belajar tari"),
            MatchPairItem("u25_s3_p2_m4", "广场上", "guǎngchǎng shang", "di alun-alun")
        )
    )
)
