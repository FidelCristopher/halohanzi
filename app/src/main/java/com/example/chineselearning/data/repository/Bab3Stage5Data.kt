package com.example.chineselearning.data.repository

import com.example.chineselearning.R
import com.example.chineselearning.data.model.*

/**
 * Bab 3 - Stage 5 (Latihan Komprehensif Bab 3)
 * Review terpadu 20 kosakata: Angka, Kuantitas, Penggolong 个, Uang (块/元), dan Umur (岁/几岁/多大).
 */

val bab3Stage5Part1Exercises = listOf(
    // 1. Soal 1: Pilihan Gambar (两块钱 -> dua yuan uang)
    Exercise(
        id = "u3_s5_p1_q1",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "两 块 钱",
        targetPinyin = "liǎng kuài qián",
        targetTranslation = "dua yuan uang",
        correctAnswer = "dua yuan uang",
        audioToSpeak = "两块钱",
        pictureOptions = listOf(
            PictureOption("u3_s5_p1_opt1", "dua yuan uang", "¥2", R.drawable.ic_coin, true),
            PictureOption("u3_s5_p1_opt2", "dua orang", "👥", R.drawable.ic_pouch, false),
            PictureOption("u3_s5_p1_opt3", "dua tahun", "🎂", R.drawable.ic_crown, false),
            PictureOption("u3_s5_p1_opt4", "dua buku", "📖", R.drawable.ic_book, false)
        )
    ),

    // 2. Soal 2: Susun Kalimat (我有三个中国朋友。 -> Saya punya tiga teman Tiongkok.)
    Exercise(
        id = "u3_s5_p1_q2",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Saya punya tiga teman Tiongkok.",
        targetHanzi = "我 有 三 个 中国 朋友。",
        targetPinyin = "Wǒ yǒu sān gè Zhōngguó péngyou.",
        wordChips = listOf("我:wǒ", "有:yǒu", "三:sān", "个:gè", "中国:Zhōngguó", "朋友:péngyou", "五:wǔ", "老师:lǎoshī"),
        correctAnswer = "我,有,三,个,中国,朋友",
        audioToSpeak = "我有三个中国朋友。"
    ),

    // 3. Soal 3: Ketuk Pasangan yang Sesuai (Review Angka & Kuantitas)
    Exercise(
        id = "u3_s5_p1_q3",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u3_s5_p1_m1", "一千", "yìqiān", "seribu"),
            MatchPairItem("u3_s5_p1_m2", "两百", "liǎngbǎi", "dua ratus"),
            MatchPairItem("u3_s5_p1_m3", "五十", "wǔshí", "lima puluh"),
            MatchPairItem("u3_s5_p1_m4", "多少钱", "duōshao qián", "berapa harganya")
        )
    ),

    // 4. Soal 4: Ketik Pinyin (dua orang -> liǎnggè)
    Exercise(
        id = "u3_s5_p1_q4",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "dua orang",
        sentenceWithBlank = "两个人 (________)",
        targetHanzi = "两 个 人",
        targetPinyin = "liǎng gè rén",
        correctAnswer = "liangge",
        keyboardKeys = listOf("l", "i", "a", "n", "g", "e", "r", "s"),
        audioToSpeak = "两个人"
    ),

    // 5. Soal 5: Pilihan Terjemahan (Ini lima puluh yuan)
    Exercise(
        id = "u3_s5_p1_q5",
        type = ExerciseType.SENTENCE_CHOICE,
        title = "Pilih terjemahan yang benar",
        targetTranslation = "Ini lima puluh yuan",
        options = listOf(
            "Zhège wǔshí kuài\n这个 五十 块。",
            "Zhège shí kuài\n这个 十 块。",
            "Nàge wǔshí kuài\n那个 五十 块。",
            "Zhège wǔ kuài\n这个 五 块。"
        ),
        correctAnswer = "Zhège wǔshí kuài\n这个 五十 块。",
        audioToSpeak = "这个五十块。"
    ),

    // 6. Soal 6: Apa yang Anda dengar? (他有两个老师。 -> Dia punya dua orang guru.)
    Exercise(
        id = "u3_s5_p1_q6",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Apa yang Anda dengar?",
        isImmersiveSpeaker = true,
        illustrationRes = 0,
        targetHanzi = "他 有 两 个 老师。",
        targetPinyin = "Tā yǒu liǎng gè lǎoshī.",
        targetTranslation = "Dia punya dua orang guru.",
        wordChips = listOf("他:tā", "有:yǒu", "两:liǎng", "个:gè", "老师:lǎoshī", "三:sān", "朋友:péngyou"),
        correctAnswer = "他,有,两,个,老师",
        audioToSpeak = "他有两个老师。"
    ),

    // 7. Soal 7: Pilihan Terjemahan (Berapa umur dokter Wang?)
    Exercise(
        id = "u3_s5_p1_q7",
        type = ExerciseType.SENTENCE_CHOICE,
        title = "Pilih terjemahan yang benar",
        targetTranslation = "Berapa umur dokter Wang?",
        options = listOf(
            "Wáng yīshēng duō dà\n王 医生 多 大？",
            "Wáng lǎoshī jǐ suì\n王 老师 几 岁？",
            "Wáng yīshēng jǐ gè\n王 医生 几 个？",
            "Shéi shì Wáng yīshēng\n谁 是 王 医生？"
        ),
        correctAnswer = "Wáng yīshēng duō dà\n王 医生 多 大？",
        audioToSpeak = "王医生多大？"
    ),

    // 8. Soal 8: Susun Kalimat (这个苹果五块钱。 -> Apel ini lima yuan uang.)
    Exercise(
        id = "u3_s5_p1_q8",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Apel ini lima yuan uang.",
        targetHanzi = "这个 苹果 五 块 钱。",
        targetPinyin = "Zhège píngguǒ wǔ kuài qián.",
        wordChips = listOf("这个:zhège", "苹果:píngguǒ", "五:wǔ", "块:kuài", "钱:qián", "十:shí", "那个:nàge"),
        correctAnswer = "这个,苹果,五,块,钱",
        audioToSpeak = "这个苹果五块钱。"
    ),

    // 9. Soal 9: Apa yang Anda dengar? (我有十个同学。 -> Saya punya sepuluh orang teman sekolah.)
    Exercise(
        id = "u3_s5_p1_q9",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Apa yang Anda dengar?",
        isImmersiveSpeaker = true,
        illustrationRes = 0,
        targetHanzi = "我 有 十 个 同学。",
        targetPinyin = "Wǒ yǒu shí gè tóngxué.",
        targetTranslation = "Saya punya sepuluh orang teman sekolah.",
        wordChips = listOf("我:wǒ", "有:yǒu", "十:shí", "个:gè", "同学:tóngxué", "朋友:péngyou", "八:bā"),
        correctAnswer = "我,有,十,个,同学",
        audioToSpeak = "我有十个同学。"
    ),

    // 10. Soal 10: Susun Kalimat (学校里有一百个学生。 -> Di dalam sekolah ada seratus orang murid.)
    Exercise(
        id = "u3_s5_p1_q10",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Di dalam sekolah ada seratus orang murid.",
        targetHanzi = "学校 里 有 一百 个 学生。",
        targetPinyin = "Xuéxiào lǐ yǒu yìbǎi gè xuéshēng.",
        wordChips = listOf("学校:xuéxiào", "里:lǐ", "有:yǒu", "一百:yìbǎi", "个:gè", "学生:xuéshēng", "老师:lǎoshī"),
        correctAnswer = "学校,里,有,一百,个,学生",
        audioToSpeak = "学校里有一百个学生。"
    )
)

val bab3Stage5Part2Exercises = listOf(
    // 1. Soal 1: Pilihan Terjemahan (Sembilan orang teman)
    Exercise(
        id = "u3_s5_p2_q1",
        type = ExerciseType.SENTENCE_CHOICE,
        title = "Pilih terjemahan yang benar",
        targetTranslation = "Sembilan orang teman",
        options = listOf(
            "Jiǔ gè péngyou\n九 个 朋友",
            "Bā gè péngyou\n八 个 朋友",
            "Shí gè péngyou\n十 个 朋友",
            "Qī gè tóngxué\n七 个 同学"
        ),
        correctAnswer = "Jiǔ gè péngyou\n九 个 朋友",
        audioToSpeak = "九个朋友"
    ),

    // 2. Soal 2: Apa yang Anda dengar? (你有几个苹果？ -> Kamu punya berapa buah apel?)
    Exercise(
        id = "u3_s5_p2_q2",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Apa yang Anda dengar?",
        isImmersiveSpeaker = true,
        illustrationRes = 0,
        targetHanzi = "你 有 几 个 苹果？",
        targetPinyin = "Nǐ yǒu jǐ gè píngguǒ?",
        targetTranslation = "Kamu punya berapa buah apel?",
        wordChips = listOf("你:nǐ", "有:yǒu", "几:jǐ", "个:gè", "苹果:píngguǒ", "多少:duōshao", "钱:qián"),
        correctAnswer = "你,有,几,个,苹果",
        audioToSpeak = "你有几个苹果？"
    ),

    // 3. Soal 3: Susun Kalimat (我有两千块钱。 -> Saya punya dua ribu yuan uang.)
    Exercise(
        id = "u3_s5_p2_q3",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Saya punya dua ribu yuan uang.",
        targetHanzi = "我 有 两千 块 钱。",
        targetPinyin = "Wǒ yǒu liǎngqiān kuài qián.",
        wordChips = listOf("我:wǒ", "有:yǒu", "两千:liǎngqiān", "块:kuài", "钱:qián", "一千:yìqiān", "元:yuán"),
        correctAnswer = "我,有,两千,块,钱",
        audioToSpeak = "我有两千块钱。"
    ),

    // 4. Soal 4: Ketuk Pasangan yang Sesuai (Review Komprehensif)
    Exercise(
        id = "u3_s5_p2_q4",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u3_s5_p2_m1", "零", "líng", "nol"),
            MatchPairItem("u3_s5_p2_m2", "几", "jǐ", "berapa"),
            MatchPairItem("u3_s5_p2_m3", "块", "kuài", "yuan (lisan)"),
            MatchPairItem("u3_s5_p2_m4", "岁", "suì", "tahun (umur)")
        )
    ),

    // 5. Soal 5: Apa yang Anda dengar? (那个八十块。 -> Yang itu delapan puluh yuan.)
    Exercise(
        id = "u3_s5_p2_q5",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Apa yang Anda dengar?",
        isImmersiveSpeaker = true,
        illustrationRes = 0,
        targetHanzi = "那个 八十 块。",
        targetPinyin = "Nàge bāshí kuài.",
        targetTranslation = "Yang itu delapan puluh yuan.",
        wordChips = listOf("那个:nàge", "八十:bāshí", "块:kuài", "这个:zhège", "五十:wǔshí", "元:yuán"),
        correctAnswer = "那个,八十,块",
        audioToSpeak = "那个八十块。"
    ),

    // 6. Soal 6: Susun Kalimat (王飞今年二十岁。 -> Wang Fei tahun ini berumur dua puluh tahun.)
    Exercise(
        id = "u3_s5_p2_q6",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Wang Fei tahun ini berumur dua puluh tahun.",
        targetHanzi = "王飞 今年 二十 岁。",
        targetPinyin = "WángFēi jīnnián èrshí suì.",
        wordChips = listOf("王飞:WángFēi", "今年:jīnnián", "二十:èrshí", "岁:suì", "三十:sānshí", "是:shì"),
        correctAnswer = "王飞,今年,二十,岁",
        audioToSpeak = "王飞今年二十岁。"
    ),

    // 7. Soal 7: Pilihan Terjemahan (Kamu mau berapa buah?)
    Exercise(
        id = "u3_s5_p2_q7",
        type = ExerciseType.SENTENCE_CHOICE,
        title = "Pilih terjemahan yang benar",
        targetTranslation = "Kamu mau berapa buah?",
        options = listOf(
            "Nǐ yào jǐ gè\n你 要 几 个？",
            "Nǐ yǒu jǐ gè\n你 有 几 个？",
            "Zhège duōshao qián\n这个 多少 钱？",
            "Nǐ jǐ suì\n你 几 岁？"
        ),
        correctAnswer = "Nǐ yào jǐ gè\n你 要 几 个？",
        audioToSpeak = "你要几个？"
    ),

    // 8. Soal 8: Ketik Pinyin (tiga orang -> sāngè)
    Exercise(
        id = "u3_s5_p2_q8",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "tiga orang",
        sentenceWithBlank = "三个人 (________)",
        targetHanzi = "三 个 人",
        targetPinyin = "sān gè rén",
        correctAnswer = "sange",
        keyboardKeys = listOf("s", "a", "n", "g", "e", "l", "i", "u"),
        audioToSpeak = "三个人"
    ),

    // 9. Soal 9: Susun Kalimat (这个多少钱？ -> Ini berapa harganya?)
    Exercise(
        id = "u3_s5_p2_q9",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Ini berapa harganya?",
        targetHanzi = "这个 多少 钱？",
        targetPinyin = "Zhège duōshao qián?",
        wordChips = listOf("这个:zhège", "多少:duōshao", "钱:qián", "那个:nàge", "块:kuài"),
        correctAnswer = "这个,多少,钱",
        audioToSpeak = "这个多少钱？"
    ),

    // 10. Soal 10: Pilihan Terjemahan (Delapan ratus yuan)
    Exercise(
        id = "u3_s5_p2_q10",
        type = ExerciseType.SENTENCE_CHOICE,
        title = "Pilih terjemahan yang benar",
        targetTranslation = "Delapan ratus yuan",
        options = listOf(
            "Bābǎi yuán\n八百 元。",
            "Jiǔbǎi yuán\n九百 元。",
            "Bāshí yuán\n八十 元。",
            "Liǎngbǎi yuán\n两百 元。"
        ),
        correctAnswer = "Bābǎi yuán\n八百 元。",
        audioToSpeak = "八百元。"
    )
)
