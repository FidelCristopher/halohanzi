package com.example.chineselearning.data.repository

import com.example.chineselearning.R
import com.example.chineselearning.data.model.Exercise
import com.example.chineselearning.data.model.ExerciseType
import com.example.chineselearning.data.model.MatchPairItem
import com.example.chineselearning.data.model.PictureOption

val bab4Stage2Part1Exercises = listOf(
    // 1. Soal 1: Pilihan Gambar (月 -> bulan)
    Exercise(
        id = "u4_s2_p1_q1",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "月",
        targetPinyin = "yuè",
        targetTranslation = "bulan",
        correctAnswer = "bulan",
        audioToSpeak = "月",
        pictureOptions = listOf(
            PictureOption("u4_s2_p1_opt1", "bulan", "", R.drawable.ic_cal_month, true),
            PictureOption("u4_s2_p1_opt2", "hari ini", "", R.drawable.ic_cal_today, false),
            PictureOption("u4_s2_p1_opt3", "tahun", "", R.drawable.ic_cal_year, false),
            PictureOption("u4_s2_p1_opt4", "jam", "", R.drawable.ic_clock_analog, false)
        )
    ),

    // 2. Soal 2: Susun Kalimat (Hari ini tanggal 5 Oktober.)
    Exercise(
        id = "u4_s2_p1_q2",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Hari ini tanggal 5 Oktober.",
        targetHanzi = "今天 是 十月 五号。",
        targetPinyin = "Jīntiān shì shíyuè wǔhào.",
        wordChips = listOf("今天:jīntiān", "是:shì", "十月:shíyuè", "五号:wǔhào", "明天:míngtiān", "九月:jiǔyuè"),
        correctAnswer = "今天,是,十月,五号",
        audioToSpeak = "今天是十月五号。"
    ),

    // 3. Soal 3: Ketuk Pasangan yang Sesuai (Bulan & Tanggal)
    Exercise(
        id = "u4_s2_p1_q3",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u4_s2_p1_m1", "月", "yuè", "bulan"),
            MatchPairItem("u4_s2_p1_m2", "号", "hào", "nomor / tanggal"),
            MatchPairItem("u4_s2_p1_m3", "日", "rì", "hari / tanggal (resmi)"),
            MatchPairItem("u4_s2_p1_m4", "一月", "yīyuè", "bulan januari")
        )
    ),

    // 4. Soal 4: Ketik Pinyin (bulan -> yuè)
    Exercise(
        id = "u4_s2_p1_q4",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "bulan",
        sentenceWithBlank = "月 (________)",
        targetHanzi = "月",
        targetPinyin = "yuè",
        correctAnswer = "yue",
        keyboardKeys = listOf("y", "u", "e", "a", "i", "o", "b", "d", "g", "h", "j"),
        audioToSpeak = "月"
    ),

    // 5. Soal 5: Mendengar Kalimat (Rule 10: illustrationRes = 0)
    Exercise(
        id = "u4_s2_p1_q5",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Apa yang Anda dengar?",
        targetTranslation = "Hari ini tanggal berapa?",
        targetHanzi = "今天 几 月 几 号？",
        targetPinyin = "Jīntiān jǐ yuè jǐ hào?",
        wordChips = listOf("今天:jīntiān", "几:jǐ", "月:yuè", "几:jǐ", "号:hào", "明天:míngtiān"),
        correctAnswer = "今天,几,月,几,号",
        illustrationRes = 0,
        audioToSpeak = "今天几月几号？"
    ),

    // 6. Soal 6: Pilihan Kalimat
    Exercise(
        id = "u4_s2_p1_q6",
        type = ExerciseType.SENTENCE_CHOICE,
        title = "Pilih terjemahan yang benar",
        targetHanzi = "明天 是 三月 八号。",
        targetPinyin = "Míngtiān shì sānyuè bāhào.",
        targetTranslation = "Besok adalah tanggal 8 Maret.",
        correctAnswer = "Míngtiān shì sānyuè bāhào.\n明天 是 三月 八号。",
        options = listOf(
            "Míngtiān shì sānyuè bāhào.\n明天 是 三月 八号。",
            "Jīntiān shì sānyuè bāhào.\n今天 是 三月 八号。",
            "Míngtiān shì sìyuè bāhào.\n明天 是 四月 八号。"
        ),
        audioToSpeak = "明天是三月八号。"
    ),

    // 7. Soal 7: Pilihan Gambar (号 -> tanggal/nomor)
    Exercise(
        id = "u4_s2_p1_q7",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "号",
        targetPinyin = "hào",
        targetTranslation = "nomor / tanggal",
        correctAnswer = "nomor / tanggal",
        audioToSpeak = "号",
        pictureOptions = listOf(
            PictureOption("u4_s2_p1_opt7_1", "nomor / tanggal", "", R.drawable.ic_cal_date, true),
            PictureOption("u4_s2_p1_opt7_2", "hari ini", "", R.drawable.ic_cal_today, false),
            PictureOption("u4_s2_p1_opt7_3", "uang", "", R.drawable.ic_yuan_currency, false),
            PictureOption("u4_s2_p1_opt7_4", "orang", "", R.drawable.ic_person_single, false)
        )
    ),

    // 8. Soal 8: Ketik Pinyin (tanggal / nomor -> hào)
    Exercise(
        id = "u4_s2_p1_q8",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "nomor / tanggal",
        sentenceWithBlank = "号 (________)",
        targetHanzi = "号",
        targetPinyin = "hào",
        correctAnswer = "hao",
        keyboardKeys = listOf("h", "a", "o", "e", "i", "u", "b", "d", "g", "j", "l"),
        audioToSpeak = "号"
    ),

    // 9. Soal 9: Susun Kalimat (Kemarin tanggal 1 Januari.)
    Exercise(
        id = "u4_s2_p1_q9",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Kemarin tanggal 1 Januari.",
        targetHanzi = "昨天 是 一月 一号。",
        targetPinyin = "Zuótiān shì yīyuè yīhào.",
        wordChips = listOf("昨天:zuótiān", "是:shì", "一月:yīyuè", "一号:yīhào", "今天:jīntiān", "二号:èrhào"),
        correctAnswer = "昨天,是,一月,一号",
        audioToSpeak = "昨天是一月一号。"
    ),

    // 10. Soal 10: Ketuk Pasangan yang Sesuai (Bulan-Bulan Penting)
    Exercise(
        id = "u4_s2_p1_q10",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u4_s2_p1_m10_1", "五月", "wǔyuè", "bulan mei"),
            MatchPairItem("u4_s2_p1_m10_2", "八月", "bāyuè", "bulan agustus"),
            MatchPairItem("u4_s2_p1_m10_3", "十月", "shíyuè", "bulan oktober"),
            MatchPairItem("u4_s2_p1_m10_4", "十二月", "shí'èryuè", "bulan desember")
        )
    )
)

val bab4Stage2Part2Exercises = listOf(
    // 1. Soal 1: Pilihan Gambar (年 -> tahun)
    Exercise(
        id = "u4_s2_p2_q1",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "年",
        targetPinyin = "nián",
        targetTranslation = "tahun",
        correctAnswer = "tahun",
        audioToSpeak = "年",
        pictureOptions = listOf(
            PictureOption("u4_s2_p2_opt1", "tahun", "", R.drawable.ic_cal_year, true),
            PictureOption("u4_s2_p2_opt2", "hari ini", "", R.drawable.ic_cal_today, false),
            PictureOption("u4_s2_p2_opt3", "bulan", "", R.drawable.ic_cal_month, false),
            PictureOption("u4_s2_p2_opt4", "jam", "", R.drawable.ic_clock_analog, false)
        )
    ),

    // 2. Soal 2: Susun Kalimat (Tahun ini adalah tahun 2024.)
    Exercise(
        id = "u4_s2_p2_q2",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Tahun ini adalah tahun 2024.",
        targetHanzi = "今年 是 二零二四年。",
        targetPinyin = "Jīnnián shì èrlíng'èrsìnián.",
        wordChips = listOf("今年:jīnnián", "是:shì", "二零二四年:èrlíng'èrsìnián", "明年:míngnián", "去年:qùnián"),
        correctAnswer = "今年,是,二零二四年",
        audioToSpeak = "今年是二零二四年。"
    ),

    // 3. Soal 3: Ketuk Pasangan yang Sesuai (Relasi Tahun)
    Exercise(
        id = "u4_s2_p2_q3",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u4_s2_p2_m1", "年", "nián", "tahun"),
            MatchPairItem("u4_s2_p2_m2", "今年", "jīnnián", "tahun ini"),
            MatchPairItem("u4_s2_p2_m3", "明年", "míngnián", "tahun depan"),
            MatchPairItem("u4_s2_p2_m4", "去年", "qùnián", "tahun lalu")
        )
    ),

    // 4. Soal 4: Ketik Pinyin (tahun ini -> jīnnián)
    Exercise(
        id = "u4_s2_p2_q4",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "tahun ini",
        sentenceWithBlank = "今年 (________)",
        targetHanzi = "今年",
        targetPinyin = "jīnnián",
        correctAnswer = "jinnian",
        keyboardKeys = listOf("j", "i", "n", "a", "e", "o", "u", "b", "d", "g", "h"),
        audioToSpeak = "今年"
    ),

    // 5. Soal 5: Mendengar Kalimat (Rule 10: illustrationRes = 0)
    Exercise(
        id = "u4_s2_p2_q5",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Apa yang Anda dengar?",
        targetTranslation = "Tahun depan saya pergi ke Tiongkok.",
        targetHanzi = "明年 我 去 中国。",
        targetPinyin = "Míngnián wǒ qù Zhōngguó.",
        wordChips = listOf("明年:míngnián", "我:wǒ", "去:qù", "中国:Zhōngguó", "去年:qùnián", "北京:Běijīng"),
        correctAnswer = "明年,我,去,中国",
        illustrationRes = 0,
        audioToSpeak = "明年我去中国。"
    ),

    // 6. Soal 6: Pilihan Kalimat
    Exercise(
        id = "u4_s2_p2_q6",
        type = ExerciseType.SENTENCE_CHOICE,
        title = "Pilih terjemahan yang benar",
        targetHanzi = "去年 他 是 学生。",
        targetPinyin = "Qùnián tā shì xuéshēng.",
        targetTranslation = "Tahun lalu dia adalah murid.",
        correctAnswer = "Qùnián tā shì xuéshēng.\n去年 他 是 学生。",
        options = listOf(
            "Qùnián tā shì xuéshēng.\n去年 他 是 学生。",
            "Jīnnián tā shì xuéshēng.\n今年 他 是 学生。",
            "Míngnián tā shì lǎoshī.\n明年 他 是 老师。"
        ),
        audioToSpeak = "去年他是学生。"
    ),

    // 7. Soal 7: Pilihan Gambar (明年 -> tahun depan)
    Exercise(
        id = "u4_s2_p2_q7",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "明年",
        targetPinyin = "míngnián",
        targetTranslation = "tahun depan",
        correctAnswer = "tahun depan",
        audioToSpeak = "明年",
        pictureOptions = listOf(
            PictureOption("u4_s2_p2_opt7_1", "tahun depan", "", R.drawable.ic_cal_next_year, true),
            PictureOption("u4_s2_p2_opt7_2", "tahun ini", "", R.drawable.ic_cal_year, false),
            PictureOption("u4_s2_p2_opt7_3", "kemarin", "", R.drawable.ic_cal_yesterday, false),
            PictureOption("u4_s2_p2_opt7_4", "besok", "", R.drawable.ic_cal_tomorrow, false)
        )
    ),

    // 8. Soal 8: Ketik Pinyin (tahun lalu -> qùnián)
    Exercise(
        id = "u4_s2_p2_q8",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "tahun lalu",
        sentenceWithBlank = "去年 (________)",
        targetHanzi = "去年",
        targetPinyin = "qùnián",
        correctAnswer = "qunian",
        keyboardKeys = listOf("q", "u", "n", "i", "a", "e", "o", "b", "d", "g", "h"),
        audioToSpeak = "去年"
    ),

    // 9. Soal 9: Susun Kalimat (Format Lengkap Kalender Mandarin)
    Exercise(
        id = "u4_s2_p2_q9",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Hari ini tanggal 1 Januari 2024.",
        targetHanzi = "今天 是 二零二四年 一月 一日。",
        targetPinyin = "Jīntiān shì èrlíng'èrsìnián yīyuè yīrì.",
        wordChips = listOf("今天:jīntiān", "是:shì", "二零二四年:èrlíng'èrsìnián", "一月:yīyuè", "一日:yīrì", "明天:míngtiān"),
        correctAnswer = "今天,是,二零二四年,一月,一日",
        audioToSpeak = "今天是二零二四年一月一日。"
    ),

    // 10. Soal 10: Ketuk Pasangan yang Sesuai (Rangkuman Kalender)
    Exercise(
        id = "u4_s2_p2_q10",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u4_s2_p2_m10_1", "今年", "jīnnián", "tahun ini"),
            MatchPairItem("u4_s2_p2_m10_2", "明年", "míngnián", "tahun depan"),
            MatchPairItem("u4_s2_p2_m10_3", "去年", "qùnián", "tahun lalu"),
            MatchPairItem("u4_s2_p2_m10_4", "日", "rì", "hari / tanggal")
        )
    )
)
