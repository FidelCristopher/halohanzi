package com.example.chineselearning.data.repository

import com.example.chineselearning.R
import com.example.chineselearning.data.model.*

/**
 * Bab 3 - Stage 3 (Kata Tanya Kuantitas (几 vs 多少) & Uang (块/元))
 * Kosakata: 几 (jǐ), 多少 (duōshao), 块 (kuài), 元 (yuán), 钱 (qián).
 */

val bab3Stage3Part1Exercises = listOf(
    // 1. Soal 1: Pilihan Gambar (多少 -> berapa banyak)
    Exercise(
        id = "u3_s3_p1_q1",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "多少",
        targetPinyin = "duōshao",
        targetTranslation = "berapa banyak",
        correctAnswer = "berapa banyak",
        audioToSpeak = "多少",
        pictureOptions = listOf(
            PictureOption("u3_s3_p1_opt1", "berapa banyak", "", R.drawable.ic_question_quantity, true),
            PictureOption("u3_s3_p1_opt2", "satu", "1", R.drawable.ic_num_1, false),
            PictureOption("u3_s3_p1_opt3", "teman", "", R.drawable.ic_two_friends, false),
            PictureOption("u3_s3_p1_opt4", "guru", "", R.drawable.ic_teacher_avatar, false)
        )
    ),

    // 2. Soal 2: Susun Kalimat (你有几个朋友？ -> Kamu punya berapa orang teman?)
    Exercise(
        id = "u3_s3_p1_q2",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Kamu punya berapa orang teman?",
        targetHanzi = "你 有 几 个 朋友？",
        targetPinyin = "Nǐ yǒu jǐ gè péngyou?",
        wordChips = listOf("你:nǐ", "有:yǒu", "几:jǐ", "个:gè", "朋友:péngyou", "多少:duōshao", "是:shì"),
        correctAnswer = "你,有,几,个,朋友",
        audioToSpeak = "你有几个朋友？"
    ),

    // 3. Soal 3: Ketuk Pasangan yang Sesuai (Tanya Kuantitas & Satuan)
    Exercise(
        id = "u3_s3_p1_q3",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u3_s3_p1_m1", "几", "jǐ", "berapa (< 10)"),
            MatchPairItem("u3_s3_p1_m2", "多少", "duōshao", "berapa / banyak"),
            MatchPairItem("u3_s3_p1_m3", "钱", "qián", "uang"),
            MatchPairItem("u3_s3_p1_m4", "块", "kuài", "yuan (lisan)")
        )
    ),

    // 4. Soal 4: Ketik Pinyin (berapa -> jǐ)
    Exercise(
        id = "u3_s3_p1_q4",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "berapa",
        sentenceWithBlank = "几 (________)",
        targetHanzi = "几",
        targetPinyin = "jǐ",
        correctAnswer = "ji",
        keyboardKeys = listOf("j", "i", "d", "u", "o", "s", "h", "a"),
        audioToSpeak = "几"
    ),

    // 5. Soal 5: Pilihan Terjemahan (Ada berapa orang murid?)
    Exercise(
        id = "u3_s3_p1_q5",
        type = ExerciseType.SENTENCE_CHOICE,
        title = "Pilih terjemahan yang benar",
        targetTranslation = "Ada berapa orang murid?",
        options = listOf(
            "Yǒu duōshao xuéshēng\n有 多少 学生？",
            "Yǒu jǐ rén\n有 几 人？",
            "Shì shéi de xuéshēng\n是 谁 的 学生？",
            "Nǐ shì xuéshēng ma\n你 是 学生 吗？"
        ),
        correctAnswer = "Yǒu duōshao xuéshēng\n有 多少 学生？",
        audioToSpeak = "有多少学生？"
    ),

    // 6. Soal 6: Apa yang Anda dengar? (你有几个老师？ -> Kamu punya berapa guru?)
    Exercise(
        id = "u3_s3_p1_q6",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Apa yang Anda dengar?",
        isImmersiveSpeaker = true,
        illustrationRes = 0,
        targetHanzi = "你 有 几 个 老师？",
        targetPinyin = "Nǐ yǒu jǐ gè lǎoshī?",
        targetTranslation = "Kamu punya berapa orang guru?",
        wordChips = listOf("你:nǐ", "有:yǒu", "几:jǐ", "个:gè", "老师:lǎoshī", "学生:xuéshēng", "多少:duōshao"),
        correctAnswer = "你,有,几,个,老师",
        audioToSpeak = "你有几个老师？"
    ),

    // 7. Soal 7: Pilihan Terjemahan (Berapa banyak orang?)
    Exercise(
        id = "u3_s3_p1_q7",
        type = ExerciseType.SENTENCE_CHOICE,
        title = "Pilih terjemahan yang benar",
        targetTranslation = "Berapa banyak orang?",
        options = listOf(
            "Duōshao rén\n多少 人？",
            "Jǐ gè qián\n几 个 钱？",
            "Shéi de rén\n谁 的 人？",
            "Yí gè rén\n一 个 人。"
        ),
        correctAnswer = "Duōshao rén\n多少 人？",
        audioToSpeak = "多少人？"
    ),

    // 8. Soal 8: Susun Kalimat (我们有三个老师。 -> Kami punya tiga orang guru.)
    Exercise(
        id = "u3_s3_p1_q8",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Kami punya tiga orang guru.",
        targetHanzi = "我们 有 三 个 老师。",
        targetPinyin = "Wǒmen yǒu sān gè lǎoshī.",
        wordChips = listOf("我们:wǒmen", "有:yǒu", "三:sān", "个:gè", "老师:lǎoshī", "朋友:péngyou", "五:wǔ"),
        correctAnswer = "我们,有,三,个,老师",
        audioToSpeak = "我们有三个老师。"
    ),

    // 9. Soal 9: Apa yang Anda dengar? (他有五个朋友。 -> Dia punya lima orang teman.)
    Exercise(
        id = "u3_s3_p1_q9",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Apa yang Anda dengar?",
        isImmersiveSpeaker = true,
        illustrationRes = 0,
        targetHanzi = "他 有 五 个 朋友。",
        targetPinyin = "Tā yǒu wǔ gè péngyou.",
        targetTranslation = "Dia punya lima orang teman.",
        wordChips = listOf("他:tā", "有:yǒu", "五:wǔ", "个:gè", "朋友:péngyou", "三:sān", "老师:lǎoshī"),
        correctAnswer = "他,有,五,个,朋友",
        audioToSpeak = "他有五个朋友。"
    ),

    // 10. Soal 10: Susun Kalimat (你有几个同学？ -> Kamu punya berapa teman sekolah?)
    Exercise(
        id = "u3_s3_p1_q10",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Kamu punya berapa teman sekolah?",
        targetHanzi = "你 有 几 个 同学？",
        targetPinyin = "Nǐ yǒu jǐ gè tóngxué?",
        wordChips = listOf("你:nǐ", "有:yǒu", "几:jǐ", "个:gè", "同学:tóngxué", "老师:lǎoshī", "两:liǎng"),
        correctAnswer = "你,有,几,个,同学",
        audioToSpeak = "你有几个同学？"
    )
)

val bab3Stage3Part2Exercises = listOf(
    // 1. Soal 1: Pilihan Gambar (块 -> yuan / satuan uang)
    Exercise(
        id = "u3_s3_p2_q1",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "块",
        targetPinyin = "kuài",
        targetTranslation = "yuan (uang lisan)",
        correctAnswer = "yuan (uang lisan)",
        audioToSpeak = "块",
        pictureOptions = listOf(
            PictureOption("u3_s3_p2_opt1", "yuan (uang)", "", R.drawable.ic_yuan_currency, true),
            PictureOption("u3_s3_p2_opt2", "buku", "", R.drawable.ic_book_chinese, false),
            PictureOption("u3_s3_p2_opt3", "teman", "", R.drawable.ic_two_friends, false),
            PictureOption("u3_s3_p2_opt4", "orang", "", R.drawable.ic_person_single, false)
        )
    ),

    // 2. Soal 2: Susun Kalimat (这个多少钱？ -> Ini berapa harganya?)
    Exercise(
        id = "u3_s3_p2_q2",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Ini berapa harganya?",
        targetHanzi = "这个 多少 钱？",
        targetPinyin = "Zhège duōshao qián?",
        wordChips = listOf("这个:zhège", "多少:duōshao", "钱:qián", "几:jǐ", "块:kuài"),
        correctAnswer = "这个,多少,钱",
        audioToSpeak = "这个多少钱？"
    ),

    // 3. Soal 3: Ketuk Pasangan yang Sesuai (Mata Uang & Harga)
    Exercise(
        id = "u3_s3_p2_q3",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u3_s3_p2_m1", "块", "kuài", "yuan (lisan)"),
            MatchPairItem("u3_s3_p2_m2", "元", "yuán", "yuan (resmi)"),
            MatchPairItem("u3_s3_p2_m3", "钱", "qián", "uang"),
            MatchPairItem("u3_s3_p2_m4", "多少", "duōshao", "berapa")
        )
    ),

    // 4. Soal 4: Ketik Pinyin (yuan -> kuài)
    Exercise(
        id = "u3_s3_p2_q4",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "yuan (uang lisan)",
        sentenceWithBlank = "块 (________)",
        targetHanzi = "块",
        targetPinyin = "kuài",
        correctAnswer = "kuai",
        keyboardKeys = listOf("k", "u", "a", "i", "y", "n", "q", "g"),
        audioToSpeak = "块"
    ),

    // 5. Soal 5: Pilihan Terjemahan (Lima yuan uang)
    Exercise(
        id = "u3_s3_p2_q5",
        type = ExerciseType.SENTENCE_CHOICE,
        title = "Pilih terjemahan yang benar",
        targetTranslation = "Lima yuan uang",
        options = listOf(
            "Wǔ kuài qián\n五 块 钱",
            "Shí kuài qián\n十 块 钱",
            "Sān kuài qián\n三 块 钱",
            "Liǎng kuài qián\n两 块 钱"
        ),
        correctAnswer = "Wǔ kuài qián\n五 块 钱",
        audioToSpeak = "五块钱"
    ),

    // 6. Soal 6: Apa yang Anda dengar? (这个十块钱。 -> Ini sepuluh yuan uang.)
    Exercise(
        id = "u3_s3_p2_q6",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Apa yang Anda dengar?",
        isImmersiveSpeaker = true,
        illustrationRes = 0,
        targetHanzi = "这个 十 块 钱。",
        targetPinyin = "Zhège shí kuài qián.",
        targetTranslation = "Ini sepuluh yuan uang.",
        wordChips = listOf("这个:zhège", "十:shí", "块:kuài", "钱:qián", "五:wǔ", "那个:nàge"),
        correctAnswer = "这个,十,块,钱",
        audioToSpeak = "这个十块钱。"
    ),

    // 7. Soal 7: Pilihan Terjemahan (Itu berapa harganya?)
    Exercise(
        id = "u3_s3_p2_q7",
        type = ExerciseType.SENTENCE_CHOICE,
        title = "Pilih terjemahan yang benar",
        targetTranslation = "Itu berapa harganya?",
        options = listOf(
            "Nàge duōshao qián\n那个 多少 钱？",
            "Zhège duōshao qián\n这个 多少 钱？",
            "Nàge jǐ kuài\n那个 几 块？",
            "Shéi de qián\n谁 的 钱？"
        ),
        correctAnswer = "Nàge duōshao qián\n那个 多少 钱？",
        audioToSpeak = "那个多少钱？"
    ),

    // 8. Soal 8: Susun Kalimat (那个八块钱。 -> Yang itu delapan yuan uang.)
    Exercise(
        id = "u3_s3_p2_q8",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Yang itu delapan yuan uang.",
        targetHanzi = "那个 八 块 钱。",
        targetPinyin = "Nàge bā kuài qián.",
        wordChips = listOf("那个:nàge", "八:bā", "块:kuài", "钱:qián", "九:jiǔ", "这个:zhège"),
        correctAnswer = "那个,八,块,钱",
        audioToSpeak = "那个八块钱。"
    ),

    // 9. Soal 9: Apa yang Anda dengar? (二十元。 -> Dua puluh yuan.)
    Exercise(
        id = "u3_s3_p2_q9",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Apa yang Anda dengar?",
        isImmersiveSpeaker = true,
        illustrationRes = 0,
        targetHanzi = "二十 元。",
        targetPinyin = "Èrshí yuán.",
        targetTranslation = "Dua puluh yuan.",
        wordChips = listOf("二十:èrshí", "元:yuán", "三十:sānshí", "块:kuài", "钱:qián"),
        correctAnswer = "二十,元",
        audioToSpeak = "二十元。"
    ),

    // 10. Soal 10: Susun Kalimat (这个一百块。 -> Yang ini seratus yuan.)
    Exercise(
        id = "u3_s3_p2_q10",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Yang ini seratus yuan.",
        targetHanzi = "这个 一百 块。",
        targetPinyin = "Zhège yìbǎi kuài.",
        wordChips = listOf("这个:zhège", "一百:yìbǎi", "块:kuài", "两百:liǎngbǎi", "元:yuán"),
        correctAnswer = "这个,一百,块",
        audioToSpeak = "这个一百块。"
    )
)
