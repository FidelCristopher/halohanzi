package com.example.chineselearning.data.repository

import com.example.chineselearning.R
import com.example.chineselearning.data.model.Exercise
import com.example.chineselearning.data.model.ExerciseType
import com.example.chineselearning.data.model.MatchPairItem
import com.example.chineselearning.data.model.PictureOption

val bab4Stage3Part1Exercises = listOf(
    // 1. Soal 1: Pilihan Gambar (点 -> jam / pukul)
    Exercise(
        id = "u4_s3_p1_q1",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "点",
        targetPinyin = "diǎn",
        targetTranslation = "jam (pukul)",
        correctAnswer = "jam (pukul)",
        audioToSpeak = "点",
        pictureOptions = listOf(
            PictureOption("u4_s3_p1_opt1", "jam (pukul)", "", R.drawable.ic_clock_analog, true),
            PictureOption("u4_s3_p1_opt2", "menit", "", R.drawable.ic_stopwatch_min, false),
            PictureOption("u4_s3_p1_opt3", "tanggal", "", R.drawable.ic_cal_date, false),
            PictureOption("u4_s3_p1_opt4", "tahun", "", R.drawable.ic_cal_year, false)
        )
    ),

    // 2. Soal 2: Susun Kalimat (Sekarang jam berapa?)
    Exercise(
        id = "u4_s3_p1_q2",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Sekarang jam berapa?",
        targetHanzi = "现在 几 点？",
        targetPinyin = "Xiànzài jǐ diǎn?",
        wordChips = listOf("现在:xiànzài", "几:jǐ", "点:diǎn", "分:fēn", "什么时候:shénme shíhou"),
        correctAnswer = "现在,几,点",
        audioToSpeak = "现在几点？"
    ),

    // 3. Soal 3: Ketuk Pasangan yang Sesuai (Jam & Waktu Sekarang)
    Exercise(
        id = "u4_s3_p1_q3",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u4_s3_p1_m1", "现在", "xiànzài", "sekarang"),
            MatchPairItem("u4_s3_p1_m2", "点", "diǎn", "jam (pukul)"),
            MatchPairItem("u4_s3_p1_m3", "半", "bàn", "setengah (30 menit)"),
            MatchPairItem("u4_s3_p1_m4", "三点", "sāndiǎn", "jam tiga")
        )
    ),

    // 4. Soal 4: Ketik Pinyin (sekarang -> xiànzài)
    Exercise(
        id = "u4_s3_p1_q4",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "sekarang",
        sentenceWithBlank = "现在 (________)",
        targetHanzi = "现在",
        targetPinyin = "xiànzài",
        correctAnswer = "xianzai",
        keyboardKeys = listOf("x", "i", "a", "n", "z", "e", "o", "u", "b", "d", "g"),
        audioToSpeak = "现在"
    ),

    // 5. Soal 5: Mendengar Kalimat (Rule 10: illustrationRes = 0)
    Exercise(
        id = "u4_s3_p1_q5",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Apa yang Anda dengar?",
        targetTranslation = "Sekarang jam delapan tepat.",
        targetHanzi = "现在 八 点。",
        targetPinyin = "Xiànzài bā diǎn.",
        wordChips = listOf("现在:xiànzài", "八:bā", "点:diǎn", "九:jiǔ", "分:fēn"),
        correctAnswer = "现在,八,点",
        illustrationRes = 0,
        audioToSpeak = "现在八点。"
    ),

    // 6. Soal 6: Pilihan Kalimat
    Exercise(
        id = "u4_s3_p1_q6",
        type = ExerciseType.SENTENCE_CHOICE,
        title = "Pilih terjemahan yang benar",
        targetHanzi = "现在 两 点 半。",
        targetPinyin = "Xiànzài liǎng diǎn bàn.",
        targetTranslation = "Sekarang jam setengah tiga (2:30).",
        correctAnswer = "Xiànzài liǎng diǎn bàn.\n现在 两 点 半。",
        options = listOf(
            "Xiànzài liǎng diǎn bàn.\n现在 两 点 半。",
            "Xiànzài sān diǎn bàn.\n现在 三 点 半。",
            "Xiànzài èr diǎn bàn.\n现在 二 点 半。"
        ),
        audioToSpeak = "现在两点半。"
    ),

    // 7. Soal 7: Pilihan Gambar (半 -> setengah)
    Exercise(
        id = "u4_s3_p1_q7",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "半",
        targetPinyin = "bàn",
        targetTranslation = "setengah / separuh",
        correctAnswer = "setengah / separuh",
        audioToSpeak = "半",
        pictureOptions = listOf(
            PictureOption("u4_s3_p1_opt7_1", "setengah / separuh", "", R.drawable.ic_clock_half, true),
            PictureOption("u4_s3_p1_opt7_2", "jam (pukul)", "", R.drawable.ic_clock_analog, false),
            PictureOption("u4_s3_p1_opt7_3", "menit", "", R.drawable.ic_stopwatch_min, false),
            PictureOption("u4_s3_p1_opt7_4", "tanggal", "", R.drawable.ic_cal_date, false)
        )
    ),

    // 8. Soal 8: Ketik Pinyin (jam / pukul -> diǎn)
    Exercise(
        id = "u4_s3_p1_q8",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "jam (pukul)",
        sentenceWithBlank = "点 (________)",
        targetHanzi = "点",
        targetPinyin = "diǎn",
        correctAnswer = "dian",
        keyboardKeys = listOf("d", "i", "a", "n", "e", "o", "u", "b", "g", "h", "j"),
        audioToSpeak = "点"
    ),

    // 9. Soal 9: Susun Kalimat (Sekarang jam sepuluh tiga puluh.)
    Exercise(
        id = "u4_s3_p1_q9",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Sekarang jam setengah sebelas.",
        targetHanzi = "现在 十 点 半。",
        targetPinyin = "Xiànzài shí diǎn bàn.",
        wordChips = listOf("现在:xiànzài", "十:shí", "点:diǎn", "半:bàn", "八:bā", "分:fēn"),
        correctAnswer = "现在,十,点,半",
        audioToSpeak = "现在十点半。"
    ),

    // 10. Soal 10: Ketuk Pasangan yang Sesuai (Pukul & Jam)
    Exercise(
        id = "u4_s3_p1_q10",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u4_s3_p1_m10_1", "两点", "liǎngdiǎn", "jam dua"),
            MatchPairItem("u4_s3_p1_m10_2", "两点半", "liǎngdiǎnbàn", "jam setengah tiga"),
            MatchPairItem("u4_s3_p1_m10_3", "五点", "wǔdiǎn", "jam lima"),
            MatchPairItem("u4_s3_p1_m10_4", "十二点", "shí'èrdiǎn", "jam dua belas")
        )
    )
)

val bab4Stage3Part2Exercises = listOf(
    // 1. Soal 1: Pilihan Gambar (分 -> menit)
    Exercise(
        id = "u4_s3_p2_q1",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "分",
        targetPinyin = "fēn",
        targetTranslation = "menit",
        correctAnswer = "menit",
        audioToSpeak = "分",
        pictureOptions = listOf(
            PictureOption("u4_s3_p2_opt1", "menit", "", R.drawable.ic_stopwatch_min, true),
            PictureOption("u4_s3_p2_opt2", "jam (pukul)", "", R.drawable.ic_clock_analog, false),
            PictureOption("u4_s3_p2_opt3", "jam (durasi)", "", R.drawable.ic_hourglass_duration, false),
            PictureOption("u4_s3_p2_opt4", "tanggal", "", R.drawable.ic_cal_date, false)
        )
    ),

    // 2. Soal 2: Susun Kalimat (Sekarang jam sembilan lewat sepuluh menit.)
    Exercise(
        id = "u4_s3_p2_q2",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Sekarang jam 09:10.",
        targetHanzi = "现在 九 点 十 分。",
        targetPinyin = "Xiànzài jiǔ diǎn shí fēn.",
        wordChips = listOf("现在:xiànzài", "九:jiǔ", "点:diǎn", "十:shí", "分:fēn", "八:bā", "半:bàn"),
        correctAnswer = "现在,九,点,十,分",
        audioToSpeak = "现在九点十分。"
    ),

    // 3. Soal 3: Ketuk Pasangan yang Sesuai (Menit & Pukul)
    Exercise(
        id = "u4_s3_p2_q3",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u4_s3_p2_m1", "分", "fēn", "menit"),
            MatchPairItem("u4_s3_p2_m2", "分钟", "fēnzhōng", "menit (durasi)"),
            MatchPairItem("u4_s3_p2_m3", "十分钟", "shí fēnzhōng", "sepuluh menit"),
            MatchPairItem("u4_s3_p2_m4", "三点零五分", "sān diǎn líng wǔ fēn", "jam 03:05")
        )
    ),

    // 4. Soal 4: Ketik Pinyin (menit -> fēn)
    Exercise(
        id = "u4_s3_p2_q4",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "menit",
        sentenceWithBlank = "分 (________)",
        targetHanzi = "分",
        targetPinyin = "fēn",
        correctAnswer = "fen",
        keyboardKeys = listOf("f", "e", "n", "a", "i", "o", "u", "b", "d", "g", "h"),
        audioToSpeak = "分"
    ),

    // 5. Soal 5: Mendengar Kalimat (Rule 10: illustrationRes = 0)
    Exercise(
        id = "u4_s3_p2_q5",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Apa yang Anda dengar?",
        targetTranslation = "Sekarang jam 07:15.",
        targetHanzi = "现在 七 点 十五 分。",
        targetPinyin = "Xiànzài qī diǎn shíwǔ fēn.",
        wordChips = listOf("现在:xiànzài", "七:qī", "点:diǎn", "十五:shíwǔ", "分:fēn", "八:bā"),
        correctAnswer = "现在,七,点,十五,分",
        illustrationRes = 0,
        audioToSpeak = "现在七点十五分。"
    ),

    // 6. Soal 6: Pilihan Kalimat
    Exercise(
        id = "u4_s3_p2_q6",
        type = ExerciseType.SENTENCE_CHOICE,
        title = "Pilih terjemahan yang benar",
        targetHanzi = "现在 四 点 零 五 分。",
        targetPinyin = "Xiànzài sì diǎn líng wǔ fēn.",
        targetTranslation = "Sekarang jam 04:05.",
        correctAnswer = "Xiànzài sì diǎn líng wǔ fēn.\n现在 四 点 零 五 分。",
        options = listOf(
            "Xiànzài sì diǎn líng wǔ fēn.\n现在 四 点 零 五 分。",
            "Xiànzài wǔ diǎn líng sì fēn.\n现在 五 点 零 四 分。",
            "Xiànzài sì diǎn bàn.\n现在 四 点 半。"
        ),
        audioToSpeak = "现在四点零五分。"
    ),

    // 7. Soal 7: Pilihan Gambar (分钟 -> menit durasi)
    Exercise(
        id = "u4_s3_p2_q7",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "分钟",
        targetPinyin = "fēnzhōng",
        targetTranslation = "menit (durasi)",
        correctAnswer = "menit (durasi)",
        audioToSpeak = "分钟",
        pictureOptions = listOf(
            PictureOption("u4_s3_p2_opt7_1", "menit (durasi)", "", R.drawable.ic_stopwatch_min, true),
            PictureOption("u4_s3_p2_opt7_2", "jam (durasi)", "", R.drawable.ic_hourglass_duration, false),
            PictureOption("u4_s3_p2_opt7_3", "uang", "", R.drawable.ic_yuan_currency, false),
            PictureOption("u4_s3_p2_opt7_4", "orang", "", R.drawable.ic_person_single, false)
        )
    ),

    // 8. Soal 8: Ketik Pinyin (setengah / 30 menit -> bàn)
    Exercise(
        id = "u4_s3_p2_q8",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "setengah / separuh",
        sentenceWithBlank = "半 (________)",
        targetHanzi = "半",
        targetPinyin = "bàn",
        correctAnswer = "ban",
        keyboardKeys = listOf("b", "a", "n", "e", "i", "o", "u", "d", "g", "h", "j"),
        audioToSpeak = "半"
    ),

    // 9. Soal 9: Susun Kalimat (Tunggu lima menit.)
    Exercise(
        id = "u4_s3_p2_q9",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Lima menit.",
        targetHanzi = "五 分钟。",
        targetPinyin = "Wǔ fēnzhōng.",
        wordChips = listOf("五:wǔ", "分钟:fēnzhōng", "点:diǎn", "小时:xiǎoshí", "三:sān"),
        correctAnswer = "五,分钟",
        audioToSpeak = "五分钟。"
    ),

    // 10. Soal 10: Ketuk Pasangan yang Sesuai (Rangkuman Waktu)
    Exercise(
        id = "u4_s3_p2_q10",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u4_s3_p2_m10_1", "现在", "xiànzài", "sekarang"),
            MatchPairItem("u4_s3_p2_m10_2", "点", "diǎn", "jam (pukul)"),
            MatchPairItem("u4_s3_p2_m10_3", "分", "fēn", "menit"),
            MatchPairItem("u4_s3_p2_m10_4", "半", "bàn", "setengah")
        )
    )
)
