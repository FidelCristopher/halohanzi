package com.example.chineselearning.data.repository

import com.example.chineselearning.R
import com.example.chineselearning.data.model.Exercise
import com.example.chineselearning.data.model.ExerciseType
import com.example.chineselearning.data.model.MatchPairItem
import com.example.chineselearning.data.model.PictureOption

val bab4Stage6Part1Exercises = listOf(
    // 1. Soal 1: Pilihan Gambar (时间 -> waktu)
    Exercise(
        id = "u4_s6_p1_q1",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "时间",
        targetPinyin = "shíjiān",
        targetTranslation = "waktu",
        correctAnswer = "waktu",
        audioToSpeak = "时间",
        pictureOptions = listOf(
            PictureOption("u4_s6_p1_opt1", "waktu", "", R.drawable.ic_time_moment, true),
            PictureOption("u4_s6_p1_opt2", "uang", "", R.drawable.ic_yuan_currency, false),
            PictureOption("u4_s6_p1_opt3", "buku", "", R.drawable.ic_book_chinese, false),
            PictureOption("u4_s6_p1_opt4", "orang", "", R.drawable.ic_person_single, false)
        )
    ),

    // 2. Soal 2: Susun Kalimat (Kemarin tanggal 10 Oktober.)
    Exercise(
        id = "u4_s6_p1_q2",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Kemarin tanggal 10 Oktober.",
        targetHanzi = "昨天 是 十月 十号。",
        targetPinyin = "Zuótiān shì shíyuè shíhào.",
        wordChips = listOf("昨天:zuótiān", "是:shì", "十月:shíyuè", "十号:shíhào", "今天:jīntiān", "九号:jiǔhào"),
        correctAnswer = "昨天,是,十月,十号",
        audioToSpeak = "昨天是十月十号。"
    ),

    // 3. Soal 3: Ketuk Pasangan yang Sesuai (Rangkuman Bab 4)
    Exercise(
        id = "u4_s6_p1_q3",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u4_s6_p1_m1", "年", "nián", "tahun"),
            MatchPairItem("u4_s6_p1_m2", "月", "yuè", "bulan"),
            MatchPairItem("u4_s6_p1_m3", "日", "rì", "hari / tanggal"),
            MatchPairItem("u4_s6_p1_m4", "星期", "xīngqī", "pekan / minggu")
        )
    ),

    // 4. Soal 4: Ketik Pinyin (sekarang jam berapa -> xiànzàijǐdiǎn)
    Exercise(
        id = "u4_s6_p1_q4",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "jam berapa",
        sentenceWithBlank = "几点 (________)",
        targetHanzi = "几点",
        targetPinyin = "jǐdiǎn",
        correctAnswer = "jidian",
        keyboardKeys = listOf("j", "i", "d", "a", "n", "e", "o", "u", "b", "g", "h"),
        audioToSpeak = "几点"
    ),

    // 5. Soal 5: Mendengar Kalimat (Rule 10: illustrationRes = 0)
    Exercise(
        id = "u4_s6_p1_q5",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Apa yang Anda dengar?",
        targetTranslation = "Sekarang jam setengah enam.",
        targetHanzi = "现在 五 点 半。",
        targetPinyin = "Xiànzài wǔ diǎn bàn.",
        wordChips = listOf("现在:xiànzài", "五:wǔ", "点:diǎn", "半:bàn", "六:liù", "分:fēn"),
        correctAnswer = "现在,五,点,半",
        illustrationRes = 0,
        audioToSpeak = "现在五点半。"
    ),

    // 6. Soal 6: Pilihan Kalimat
    Exercise(
        id = "u4_s6_p1_q6",
        type = ExerciseType.SENTENCE_CHOICE,
        title = "Pilih terjemahan yang benar",
        targetHanzi = "今天 是 星期日。",
        targetPinyin = "Jīntiān shì xīngqīrì.",
        targetTranslation = "Hari ini adalah hari Minggu.",
        correctAnswer = "Jīntiān shì xīngqīrì.\n今天 是 星期日。",
        options = listOf(
            "Jīntiān shì xīngqīrì.\n今天 是 星期日。",
            "Zuótiān shì xīngqīrì.\n昨天 是 星期日。",
            "Míngtiān shì xīngqīyī.\n明天 是 星期一。"
        ),
        audioToSpeak = "今天是星期日。"
    ),

    // 7. Soal 7: Pilihan Gambar (半 -> 30 menit / setengah)
    Exercise(
        id = "u4_s6_p1_q7",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "半",
        targetPinyin = "bàn",
        targetTranslation = "setengah / separuh",
        correctAnswer = "setengah / separuh",
        audioToSpeak = "半",
        pictureOptions = listOf(
            PictureOption("u4_s6_p1_opt7_1", "setengah / separuh", "", R.drawable.ic_clock_half, true),
            PictureOption("u4_s6_p1_opt7_2", "satu", "", R.drawable.ic_num_1, false),
            PictureOption("u4_s6_p1_opt7_3", "nol", "", R.drawable.ic_num_0, false),
            PictureOption("u4_s6_p1_opt7_4", "jam (pukul)", "", R.drawable.ic_clock_analog, false)
        )
    ),

    // 8. Soal 8: Ketik Pinyin (kapan -> shénmeshíhou)
    Exercise(
        id = "u4_s6_p1_q8",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "kapan",
        sentenceWithBlank = "什么时候 (________)",
        targetHanzi = "什么时候",
        targetPinyin = "shénme shíhou",
        correctAnswer = "shenmeshihou",
        keyboardKeys = listOf("s", "h", "e", "n", "m", "i", "o", "u", "a", "b", "d"),
        audioToSpeak = "什么时候"
    ),

    // 9. Soal 9: Susun Kalimat (Besok jam dua kita bertemu.)
    Exercise(
        id = "u4_s6_p1_q9",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Besok jam dua kita bertemu.",
        targetHanzi = "明天 两 点 见。",
        targetPinyin = "Míngtiān liǎng diǎn jiàn.",
        wordChips = listOf("明天:míngtiān", "两:liǎng", "点:diǎn", "见:jiàn", "今天:jīntiān", "三:sān"),
        correctAnswer = "明天,两,点,见",
        audioToSpeak = "明天两点见。"
    ),

    // 10. Soal 10: Ketuk Pasangan yang Sesuai (Rangkuman Waktu HSK 1)
    Exercise(
        id = "u4_s6_p1_q10",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u4_s6_p1_m10_1", "点", "diǎn", "jam (pukul)"),
            MatchPairItem("u4_s6_p1_m10_2", "分", "fēn", "menit"),
            MatchPairItem("u4_s6_p1_m10_3", "小时", "xiǎoshí", "jam (durasi)"),
            MatchPairItem("u4_s6_p1_m10_4", "时间", "shíjiān", "waktu")
        )
    )
)

val bab4Stage6Part2Exercises = listOf(
    // 1. Soal 1: Pilihan Gambar (明天 -> besok)
    Exercise(
        id = "u4_s6_p2_q1",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "明天",
        targetPinyin = "míngtiān",
        targetTranslation = "besok",
        correctAnswer = "besok",
        audioToSpeak = "明天",
        pictureOptions = listOf(
            PictureOption("u4_s6_p2_opt1", "besok", "", R.drawable.ic_cal_tomorrow, true),
            PictureOption("u4_s6_p2_opt2", "kemarin", "", R.drawable.ic_cal_yesterday, false),
            PictureOption("u4_s6_p2_opt3", "hari ini", "", R.drawable.ic_cal_today, false),
            PictureOption("u4_s6_p2_opt4", "minggu", "", R.drawable.ic_cal_week, false)
        )
    ),

    // 2. Soal 2: Susun Kalimat (Kamu ada waktu tidak?)
    Exercise(
        id = "u4_s6_p2_q2",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Apakah kamu punya waktu?",
        targetHanzi = "你 有 时间 吗？",
        targetPinyin = "Nǐ yǒu shíjiān ma?",
        wordChips = listOf("你:nǐ", "有:yǒu", "时间:shíjiān", "吗:ma", "没有:méiyǒu", "他:tā"),
        correctAnswer = "你,有,时间,吗",
        audioToSpeak = "你有时间吗？"
    ),

    // 3. Soal 3: Ketuk Pasangan yang Sesuai (Rangkuman Akhir Bab 4)
    Exercise(
        id = "u4_s6_p2_q3",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u4_s6_p2_m1", "今年", "jīnnián", "tahun ini"),
            MatchPairItem("u4_s6_p2_m2", "明年", "míngnián", "tahun depan"),
            MatchPairItem("u4_s6_p2_m3", "去年", "qùnián", "tahun lalu"),
            MatchPairItem("u4_s6_p2_m4", "现在", "xiànzài", "sekarang")
        )
    ),

    // 4. Soal 4: Ketik Pinyin (menit durasi -> fēnzhōng)
    Exercise(
        id = "u4_s6_p2_q4",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "menit (durasi)",
        sentenceWithBlank = "分钟 (________)",
        targetHanzi = "分钟",
        targetPinyin = "fēnzhōng",
        correctAnswer = "fenzhong",
        keyboardKeys = listOf("f", "e", "n", "z", "h", "o", "g", "a", "i", "u", "b"),
        audioToSpeak = "分钟"
    ),

    // 5. Soal 5: Mendengar Kalimat (Rule 10: illustrationRes = 0)
    Exercise(
        id = "u4_s6_p2_q5",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Apa yang Anda dengar?",
        targetTranslation = "Tahun depan saya pergi ke Tiongkok.",
        targetHanzi = "明年 我 去 中国。",
        targetPinyin = "Míngnián wǒ qù Zhōngguó.",
        wordChips = listOf("明年:míngnián", "我:wǒ", "去:qù", "中国:Zhōngguó", "去年:qùnián", "来:lái"),
        correctAnswer = "明年,我,去,中国",
        illustrationRes = 0,
        audioToSpeak = "明年我去中国。"
    ),

    // 6. Soal 6: Pilihan Kalimat
    Exercise(
        id = "u4_s6_p2_q6",
        type = ExerciseType.SENTENCE_CHOICE,
        title = "Pilih terjemahan yang benar",
        targetHanzi = "现在 是 两 点。",
        targetPinyin = "Xiànzài shì liǎng diǎn.",
        targetTranslation = "Sekarang adalah jam dua.",
        correctAnswer = "Xiànzài shì liǎng diǎn.\n现在 是 两 点。",
        options = listOf(
            "Xiànzài shì liǎng diǎn.\n现在 是 两 点。",
            "Xiànzài shì èr diǎn.\n现在 是 二 点。",
            "Xiànzài shì sān diǎn.\n现在 是 三 点。"
        ),
        audioToSpeak = "现在是两点。"
    ),

    // 7. Soal 7: Pilihan Gambar (昨天 -> kemarin)
    Exercise(
        id = "u4_s6_p2_q7",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "昨天",
        targetPinyin = "zuótiān",
        targetTranslation = "kemarin",
        correctAnswer = "kemarin",
        audioToSpeak = "昨天",
        pictureOptions = listOf(
            PictureOption("u4_s6_p2_opt7_1", "kemarin", "", R.drawable.ic_cal_yesterday, true),
            PictureOption("u4_s6_p2_opt7_2", "hari ini", "", R.drawable.ic_cal_today, false),
            PictureOption("u4_s6_p2_opt7_3", "besok", "", R.drawable.ic_cal_tomorrow, false),
            PictureOption("u4_s6_p2_opt7_4", "minggu", "", R.drawable.ic_cal_week, false)
        )
    ),

    // 8. Soal 8: Ketik Pinyin (bertemu besok -> míngtiān jiàn)
    Exercise(
        id = "u4_s6_p2_q8",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "sampai jumpa besok",
        sentenceWithBlank = "明天见 (________)",
        targetHanzi = "明天 见",
        targetPinyin = "míngtiān jiàn",
        correctAnswer = "mingtianjian",
        keyboardKeys = listOf("m", "i", "n", "g", "t", "a", "j", "e", "o", "u", "b"),
        audioToSpeak = "明天见"
    ),

    // 9. Soal 9: Susun Kalimat (Evaluasi Akhir Waktu Bab 4)
    Exercise(
        id = "u4_s6_p2_q9",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Kapan kita bertemu?",
        targetHanzi = "我们 什么时候 见？",
        targetPinyin = "Wǒmen shénme shíhou jiàn?",
        wordChips = listOf("我们:wǒmen", "什么时候:shénme shíhou", "见:jiàn", "他们:tāmen", "去:qù", "哪儿:nǎr"),
        correctAnswer = "我们,什么时候,见",
        audioToSpeak = "我们什么时候见？"
    ),

    // 10. Soal 10: Ketuk Pasangan yang Sesuai (Grand Review Waktu & Kalender)
    Exercise(
        id = "u4_s6_p2_q10",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u4_s6_p2_m10_1", "昨天", "zuótiān", "kemarin"),
            MatchPairItem("u4_s6_p2_m10_2", "今天", "jīntiān", "hari ini"),
            MatchPairItem("u4_s6_p2_m10_3", "明天", "míngtiān", "besok"),
            MatchPairItem("u4_s6_p2_m10_4", "什么时候", "shénme shíhou", "kapan")
        )
    )
)
