package com.example.chineselearning.data.repository

import com.example.chineselearning.R
import com.example.chineselearning.data.model.Exercise
import com.example.chineselearning.data.model.ExerciseType
import com.example.chineselearning.data.model.MatchPairItem
import com.example.chineselearning.data.model.PictureOption

val bab4Stage1Part1Exercises = listOf(
    // 1. Soal 1: Pilihan Gambar (今天 -> hari ini)
    Exercise(
        id = "u4_s1_p1_q1",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "今天",
        targetPinyin = "jīntiān",
        targetTranslation = "hari ini",
        correctAnswer = "hari ini",
        audioToSpeak = "今天",
        pictureOptions = listOf(
            PictureOption("u4_s1_p1_opt1", "hari ini", "", R.drawable.ic_cal_today, true),
            PictureOption("u4_s1_p1_opt2", "kemarin", "", R.drawable.ic_cal_yesterday, false),
            PictureOption("u4_s1_p1_opt3", "besok", "", R.drawable.ic_cal_tomorrow, false),
            PictureOption("u4_s1_p1_opt4", "minggu", "", R.drawable.ic_cal_week, false)
        )
    ),

    // 2. Soal 2: Susun Kalimat (今天是星期一。 -> Hari ini adalah hari Senin.)
    Exercise(
        id = "u4_s1_p1_q2",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Hari ini adalah hari Senin.",
        targetHanzi = "今天 是 星期一。",
        targetPinyin = "Jīntiān shì xīngqīyī.",
        wordChips = listOf("今天:jīntiān", "是:shì", "星期一:xīngqīyī", "明天:míngtiān", "星期二:xīngqī'èr"),
        correctAnswer = "今天,是,星期一",
        audioToSpeak = "今天是星期一。"
    ),

    // 3. Soal 3: Ketuk Pasangan yang Sesuai (Hari dalam Seminggu)
    Exercise(
        id = "u4_s1_p1_q3",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u4_s1_p1_m1", "今天", "jīntiān", "hari ini"),
            MatchPairItem("u4_s1_p1_m2", "明天", "míngtiān", "besok"),
            MatchPairItem("u4_s1_p1_m3", "昨天", "zuótiān", "kemarin"),
            MatchPairItem("u4_s1_p1_m4", "星期", "xīngqī", "minggu / pekan")
        )
    ),

    // 4. Soal 4: Ketik Pinyin (besok -> míngtiān)
    Exercise(
        id = "u4_s1_p1_q4",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "besok",
        sentenceWithBlank = "明天 (________)",
        targetHanzi = "明天",
        targetPinyin = "míngtiān",
        correctAnswer = "mingtian",
        keyboardKeys = listOf("m", "i", "n", "g", "t", "a", "e", "o", "u", "b", "d"),
        audioToSpeak = "明天"
    ),

    // 5. Soal 5: Mendengar Kalimat (Rule 10: illustrationRes = 0)
    Exercise(
        id = "u4_s1_p1_q5",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Apa yang Anda dengar?",
        targetTranslation = "Kemarin adalah hari Minggu.",
        targetHanzi = "昨天 是 星期天。",
        targetPinyin = "Zuótiān shì xīngqītiān.",
        wordChips = listOf("昨天:zuótiān", "是:shì", "星期天:xīngqītiān", "今天:jīntiān", "星期日:xīngqīrì"),
        correctAnswer = "昨天,是,星期天",
        illustrationRes = 0,
        audioToSpeak = "昨天是星期天。"
    ),

    // 6. Soal 6: Pilihan Kalimat
    Exercise(
        id = "u4_s1_p1_q6",
        type = ExerciseType.SENTENCE_CHOICE,
        title = "Pilih terjemahan yang benar",
        targetHanzi = "明天 是 星期二。",
        targetPinyin = "Míngtiān shì xīngqī'èr.",
        targetTranslation = "Besok adalah hari Selasa.",
        correctAnswer = "Míngtiān shì xīngqī'èr.\n明天 是 星期二。",
        options = listOf(
            "Míngtiān shì xīngqī'èr.\n明天 是 星期二。",
            "Jīntiān shì xīngqī'èr.\n今天 是 星期二。",
            "Zuótiān shì xīngqīyī.\n昨天 是 星期一。"
        ),
        audioToSpeak = "明天是星期二。"
    ),

    // 7. Soal 7: Pilihan Gambar (昨天 -> kemarin)
    Exercise(
        id = "u4_s1_p1_q7",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "昨天",
        targetPinyin = "zuótiān",
        targetTranslation = "kemarin",
        correctAnswer = "kemarin",
        audioToSpeak = "昨天",
        pictureOptions = listOf(
            PictureOption("u4_s1_p1_opt7_1", "kemarin", "", R.drawable.ic_cal_yesterday, true),
            PictureOption("u4_s1_p1_opt7_2", "hari ini", "", R.drawable.ic_cal_today, false),
            PictureOption("u4_s1_p1_opt7_3", "besok", "", R.drawable.ic_cal_tomorrow, false),
            PictureOption("u4_s1_p1_opt7_4", "minggu", "", R.drawable.ic_cal_week, false)
        )
    ),

    // 8. Soal 8: Ketik Pinyin (kemarin -> zuótiān)
    Exercise(
        id = "u4_s1_p1_q8",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "kemarin",
        sentenceWithBlank = "昨天 (________)",
        targetHanzi = "昨天",
        targetPinyin = "zuótiān",
        correctAnswer = "zuotian",
        keyboardKeys = listOf("z", "u", "o", "t", "i", "a", "n", "e", "b", "d", "g"),
        audioToSpeak = "昨天"
    ),

    // 9. Soal 9: Susun Kalimat (Hari ini hari Minggu.)
    Exercise(
        id = "u4_s1_p1_q9",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Hari ini adalah hari Minggu.",
        targetHanzi = "今天 是 星期日。",
        targetPinyin = "Jīntiān shì xīngqīrì.",
        wordChips = listOf("今天:jīntiān", "是:shì", "星期日:xīngqīrì", "明天:míngtiān", "星期三:xīngqīsān"),
        correctAnswer = "今天,是,星期日",
        audioToSpeak = "今天是星期日。"
    ),

    // 10. Soal 10: Ketuk Pasangan yang Sesuai (Hari Minggu)
    Exercise(
        id = "u4_s1_p1_q10",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u4_s1_p1_m10_1", "星期一", "xīngqīyī", "hari senin"),
            MatchPairItem("u4_s1_p1_m10_2", "星期二", "xīngqī'èr", "hari selasa"),
            MatchPairItem("u4_s1_p1_m10_3", "星期天", "xīngqītiān", "hari minggu"),
            MatchPairItem("u4_s1_p1_m10_4", "星期日", "xīngqīrì", "hari minggu (resmi)")
        )
    )
)

val bab4Stage1Part2Exercises = listOf(
    // 1. Soal 1: Pilihan Gambar (星期 -> minggu/pekan)
    Exercise(
        id = "u4_s1_p2_q1",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "星期",
        targetPinyin = "xīngqī",
        targetTranslation = "minggu / pekan",
        correctAnswer = "minggu / pekan",
        audioToSpeak = "星期",
        pictureOptions = listOf(
            PictureOption("u4_s1_p2_opt1", "minggu / pekan", "", R.drawable.ic_cal_week, true),
            PictureOption("u4_s1_p2_opt2", "tahun", "", R.drawable.ic_cal_year, false),
            PictureOption("u4_s1_p2_opt3", "bulan", "", R.drawable.ic_cal_month, false),
            PictureOption("u4_s1_p2_opt4", "hari ini", "", R.drawable.ic_cal_today, false)
        )
    ),

    // 2. Soal 2: Susun Kalimat (Hari ini hari apa?)
    Exercise(
        id = "u4_s1_p2_q2",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Hari ini hari apa?",
        targetHanzi = "今天 星期 几？",
        targetPinyin = "Jīntiān xīngqī jǐ?",
        wordChips = listOf("今天:jīntiān", "星期:xīngqī", "几:jǐ", "明天:míngtiān", "什么:shénme"),
        correctAnswer = "今天,星期,几",
        audioToSpeak = "今天星期几？"
    ),

    // 3. Soal 3: Ketuk Pasangan yang Sesuai (Pertanyaan Hari)
    Exercise(
        id = "u4_s1_p2_q3",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u4_s1_p2_m1", "星期三", "xīngqīsān", "hari rabu"),
            MatchPairItem("u4_s1_p2_m2", "星期四", "xīngqīsì", "hari kamis"),
            MatchPairItem("u4_s1_p2_m3", "星期五", "xīngqīwǔ", "hari jumat"),
            MatchPairItem("u4_s1_p2_m4", "星期六", "xīngqīliù", "hari sabtu")
        )
    ),

    // 4. Soal 4: Ketik Pinyin (minggu / pekan -> xīngqī)
    Exercise(
        id = "u4_s1_p2_q4",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "minggu / pekan",
        sentenceWithBlank = "星期 (________)",
        targetHanzi = "星期",
        targetPinyin = "xīngqī",
        correctAnswer = "xingqi",
        keyboardKeys = listOf("x", "i", "n", "g", "q", "a", "e", "o", "u", "b", "d"),
        audioToSpeak = "星期"
    ),

    // 5. Soal 5: Mendengar Kalimat (Rule 10: illustrationRes = 0)
    Exercise(
        id = "u4_s1_p2_q5",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Apa yang Anda dengar?",
        targetTranslation = "Besok hari apa?",
        targetHanzi = "明天 星期 几？",
        targetPinyin = "Míngtiān xīngqī jǐ?",
        wordChips = listOf("明天:míngtiān", "星期:xīngqī", "几:jǐ", "昨天:zuótiān", "今天:jīntiān"),
        correctAnswer = "明天,星期,几",
        illustrationRes = 0,
        audioToSpeak = "明天星期几？"
    ),

    // 6. Soal 6: Pilihan Kalimat
    Exercise(
        id = "u4_s1_p2_q6",
        type = ExerciseType.SENTENCE_CHOICE,
        title = "Pilih terjemahan yang benar",
        targetHanzi = "昨天 是 星期五。",
        targetPinyin = "Zuótiān shì xīngqīwǔ.",
        targetTranslation = "Kemarin adalah hari Jumat.",
        correctAnswer = "Zuótiān shì xīngqīwǔ.\n昨天 是 星期五。",
        options = listOf(
            "Zuótiān shì xīngqīwǔ.\n昨天 是 星期五。",
            "Jīntiān shì xīngqīwǔ.\n今天 是 星期五。",
            "Míngtiān shì xīngqīliù.\n明天 是 星期六。"
        ),
        audioToSpeak = "昨天是星期五。"
    ),

    // 7. Soal 7: Susun Kalimat (Besok adalah hari Sabtu.)
    Exercise(
        id = "u4_s1_p2_q7",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Besok adalah hari Sabtu.",
        targetHanzi = "明天 是 星期六。",
        targetPinyin = "Míngtiān shì xīngqīliù.",
        wordChips = listOf("明天:míngtiān", "是:shì", "星期六:xīngqīliù", "昨天:zuótiān", "星期天:xīngqītiān"),
        correctAnswer = "明天,是,星期六",
        audioToSpeak = "明天是星期六。"
    ),

    // 8. Soal 8: Ketik Pinyin (hari apa -> jǐ)
    Exercise(
        id = "u4_s1_p2_q8",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "berapa / hari apa",
        sentenceWithBlank = "星期几 (xīngqī ________)",
        targetHanzi = "几",
        targetPinyin = "jǐ",
        correctAnswer = "ji",
        keyboardKeys = listOf("j", "i", "a", "e", "o", "u", "b", "d", "g", "h", "l"),
        audioToSpeak = "几"
    ),

    // 9. Soal 9: Pilihan Gambar (hari Minggu -> 星期天)
    Exercise(
        id = "u4_s1_p2_q9",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "星期天",
        targetPinyin = "xīngqītiān",
        targetTranslation = "hari Minggu",
        correctAnswer = "hari Minggu",
        audioToSpeak = "星期天",
        pictureOptions = listOf(
            PictureOption("u4_s1_p2_opt9_1", "hari Minggu", "", R.drawable.ic_cal_sunday, true),
            PictureOption("u4_s1_p2_opt9_2", "hari ini", "", R.drawable.ic_cal_today, false),
            PictureOption("u4_s1_p2_opt9_3", "besok", "", R.drawable.ic_cal_tomorrow, false),
            PictureOption("u4_s1_p2_opt9_4", "kemarin", "", R.drawable.ic_cal_yesterday, false)
        )
    ),

    // 10. Soal 10: Ketuk Pasangan yang Sesuai (Rangkuman Hari & Relasi)
    Exercise(
        id = "u4_s1_p2_q10",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u4_s1_p2_m10_1", "今天", "jīntiān", "hari ini"),
            MatchPairItem("u4_s1_p2_m10_2", "明天", "míngtiān", "besok"),
            MatchPairItem("u4_s1_p2_m10_3", "昨天", "zuótiān", "kemarin"),
            MatchPairItem("u4_s1_p2_m10_4", "星期几", "xīngqī jǐ", "hari apa")
        )
    )
)
