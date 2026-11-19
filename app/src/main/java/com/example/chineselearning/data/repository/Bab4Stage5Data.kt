package com.example.chineselearning.data.repository

import com.example.chineselearning.R
import com.example.chineselearning.data.model.Exercise
import com.example.chineselearning.data.model.ExerciseType
import com.example.chineselearning.data.model.MatchPairItem
import com.example.chineselearning.data.model.PictureOption

val bab4Stage5Part1Exercises = listOf(
    // 1. Soal 1: Pilihan Gambar (明天见 -> sampai jumpa besok)
    Exercise(
        id = "u4_s5_p1_q1",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "明天 见",
        targetPinyin = "míngtiān jiàn",
        targetTranslation = "sampai jumpa besok",
        correctAnswer = "sampai jumpa besok",
        audioToSpeak = "明天见",
        pictureOptions = listOf(
            PictureOption("u4_s5_p1_opt1", "sampai jumpa besok", "", R.drawable.ic_hand_wave, true),
            PictureOption("u4_s5_p1_opt2", "terima kasih", "", R.drawable.ic_handshake, false),
            PictureOption("u4_s5_p1_opt3", "besok", "", R.drawable.ic_cal_tomorrow, false),
            PictureOption("u4_s5_p1_opt4", "hari ini", "", R.drawable.ic_cal_today, false)
        )
    ),

    // 2. Soal 2: Susun Kalimat (Besok jam tiga sore kita bertemu.)
    Exercise(
        id = "u4_s5_p1_q2",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Besok jam tiga kita bertemu.",
        targetHanzi = "明天 三 点 见。",
        targetPinyin = "Míngtiān sān diǎn jiàn.",
        wordChips = listOf("明天:míngtiān", "三:sān", "点:diǎn", "见:jiàn", "今天:jīntiān", "四:sì"),
        correctAnswer = "明天,三,点,见",
        audioToSpeak = "明天三点见。"
    ),

    // 3. Soal 3: Ketuk Pasangan yang Sesuai (Jadwal & Janji Temu)
    Exercise(
        id = "u4_s5_p1_q3",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u4_s5_p1_m1", "明天见", "míngtiān jiàn", "sampai jumpa besok"),
            MatchPairItem("u4_s5_p1_m2", "星期一见", "xīngqīyī jiàn", "sampai jumpa hari senin"),
            MatchPairItem("u4_s5_p1_m3", "八点见", "bā diǎn jiàn", "sampai jumpa jam delapan"),
            MatchPairItem("u4_s5_p1_m4", "再见", "zàijiàn", "sampai jumpa")
        )
    ),

    // 4. Soal 4: Ketik Pinyin (bertemu / melihat -> jiàn)
    Exercise(
        id = "u4_s5_p1_q4",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "bertemu / melihat",
        sentenceWithBlank = "见 (________)",
        targetHanzi = "见",
        targetPinyin = "jiàn",
        correctAnswer = "jian",
        keyboardKeys = listOf("j", "i", "a", "n", "e", "o", "u", "b", "d", "g", "h"),
        audioToSpeak = "见"
    ),

    // 5. Soal 5: Mendengar Kalimat (Rule 10: illustrationRes = 0)
    Exercise(
        id = "u4_s5_p1_q5",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Apa yang Anda dengar?",
        targetTranslation = "Hari ini jam lima sore bertemu.",
        targetHanzi = "今天 五 点 见。",
        targetPinyin = "Jīntiān wǔ diǎn jiàn.",
        wordChips = listOf("今天:jīntiān", "五:wǔ", "点:diǎn", "见:jiàn", "昨天:zuótiān", "六:liù"),
        correctAnswer = "今天,五,点,见",
        illustrationRes = 0,
        audioToSpeak = "今天五点见。"
    ),

    // 6. Soal 6: Pilihan Kalimat
    Exercise(
        id = "u4_s5_p1_q6",
        type = ExerciseType.SENTENCE_CHOICE,
        title = "Pilih terjemahan yang benar",
        targetHanzi = "星期三 下午 见。",
        targetPinyin = "Xīngqīsān xiàwǔ jiàn.",
        targetTranslation = "Sampai jumpa Rabu sore.",
        correctAnswer = "Xīngqīsān xiàwǔ jiàn.\n星期三 下午 见。",
        options = listOf(
            "Xīngqīsān xiàwǔ jiàn.\n星期三 下午 见。",
            "Xīngqīsān shàngwǔ jiàn.\n星期三 上午 见。",
            "Xīngqīsì xiàwǔ jiàn.\n星期四 下午 见。"
        ),
        audioToSpeak = "星期三下午见。"
    ),

    // 7. Soal 7: Pilihan Gambar (星期日见 -> sampai jumpa hari minggu)
    Exercise(
        id = "u4_s5_p1_q7",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "星期日 见",
        targetPinyin = "xīngqīrì jiàn",
        targetTranslation = "sampai jumpa hari Minggu",
        correctAnswer = "sampai jumpa hari Minggu",
        audioToSpeak = "星期日见",
        pictureOptions = listOf(
            PictureOption("u4_s5_p1_opt7_1", "sampai jumpa hari Minggu", "", R.drawable.ic_cal_sunday, true),
            PictureOption("u4_s5_p1_opt7_2", "hari ini", "", R.drawable.ic_cal_today, false),
            PictureOption("u4_s5_p1_opt7_3", "belajar", "", R.drawable.ic_book_chinese, false),
            PictureOption("u4_s5_p1_opt7_4", "kemarin", "", R.drawable.ic_cal_yesterday, false)
        )
    ),

    // 8. Soal 8: Ketik Pinyin (sampai jumpa besok -> míngtiān jiàn)
    Exercise(
        id = "u4_s5_p1_q8",
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

    // 9. Soal 9: Susun Kalimat (Sampai jumpa jam dua.)
    Exercise(
        id = "u4_s5_p1_q9",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Sampai jumpa jam dua.",
        targetHanzi = "两 点 见。",
        targetPinyin = "Liǎng diǎn jiàn.",
        wordChips = listOf("两:liǎng", "点:diǎn", "见:jiàn", "二:èr", "半:bàn", "去:qù"),
        correctAnswer = "两,点,见",
        audioToSpeak = "两点见。"
    ),

    // 10. Soal 10: Ketuk Pasangan yang Sesuai (Rangkuman Janji Temu)
    Exercise(
        id = "u4_s5_p1_q10",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u4_s5_p1_m10_1", "两点见", "liǎng diǎn jiàn", "jumpa jam dua"),
            MatchPairItem("u4_s5_p1_m10_2", "十点半见", "shí diǎn bàn jiàn", "jumpa jam 10:30"),
            MatchPairItem("u4_s5_p1_m10_3", "明天见", "míngtiān jiàn", "jumpa besok"),
            MatchPairItem("u4_s5_p1_m10_4", "什么时候见", "shénme shíhou jiàn", "kapan bertemu")
        )
    )
)

val bab4Stage5Part2Exercises = listOf(
    // 1. Soal 1: Pilihan Gambar (现在 -> sekarang)
    Exercise(
        id = "u4_s5_p2_q1",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "现在",
        targetPinyin = "xiànzài",
        targetTranslation = "sekarang",
        correctAnswer = "sekarang",
        audioToSpeak = "现在",
        pictureOptions = listOf(
            PictureOption("u4_s5_p2_opt1", "sekarang", "", R.drawable.ic_time_now, true),
            PictureOption("u4_s5_p2_opt2", "jam (durasi)", "", R.drawable.ic_hourglass_duration, false),
            PictureOption("u4_s5_p2_opt3", "kemarin", "", R.drawable.ic_cal_yesterday, false),
            PictureOption("u4_s5_p2_opt4", "besok", "", R.drawable.ic_cal_tomorrow, false)
        )
    ),

    // 2. Soal 2: Susun Kalimat (Hari ini tanggal 15 Oktober 2024.)
    Exercise(
        id = "u4_s5_p2_q2",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Hari ini 15 Oktober.",
        targetHanzi = "今天 是 十月 十五号。",
        targetPinyin = "Jīntiān shì shíyuè shíwǔhào.",
        wordChips = listOf("今天:jīntiān", "是:shì", "十月:shíyuè", "十五号:shíwǔhào", "明天:míngtiān", "九月:jiǔyuè"),
        correctAnswer = "今天,是,十月,十五号",
        audioToSpeak = "今天是十月十五号。"
    ),

    // 3. Soal 3: Ketuk Pasangan yang Sesuai (Jadwal Lengkap)
    Exercise(
        id = "u4_s5_p2_q3",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u4_s5_p2_m1", "今天", "jīntiān", "hari ini"),
            MatchPairItem("u4_s5_p2_m2", "星期五", "xīngqīwǔ", "hari jumat"),
            MatchPairItem("u4_s5_p2_m3", "八点", "bā diǎn", "jam delapan"),
            MatchPairItem("u4_s5_p2_m4", "学校见", "xuéxiào jiàn", "bertemu di sekolah")
        )
    ),

    // 4. Soal 4: Ketik Pinyin (jam 10 tepat -> shídiǎn)
    Exercise(
        id = "u4_s5_p2_q4",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "jam sepuluh",
        sentenceWithBlank = "十点 (________)",
        targetHanzi = "十点",
        targetPinyin = "shídiǎn",
        correctAnswer = "shidian",
        keyboardKeys = listOf("s", "h", "i", "d", "a", "n", "e", "o", "u", "b", "g"),
        audioToSpeak = "十点"
    ),

    // 5. Soal 5: Mendengar Kalimat (Rule 10: illustrationRes = 0)
    Exercise(
        id = "u4_s5_p2_q5",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Apa yang Anda dengar?",
        targetTranslation = "Kapan Anda pergi ke sekolah?",
        targetHanzi = "你 什么时候 去 学校？",
        targetPinyin = "Nǐ shénme shíhou qù xuéxiào?",
        wordChips = listOf("你:nǐ", "什么时候:shénme shíhou", "去:qù", "学校:xuéxiào", "来:lái", "看:kàn"),
        correctAnswer = "你,什么时候,去,学校",
        illustrationRes = 0,
        audioToSpeak = "你什么时候去学校？"
    ),

    // 6. Soal 6: Pilihan Kalimat
    Exercise(
        id = "u4_s5_p2_q6",
        type = ExerciseType.SENTENCE_CHOICE,
        title = "Pilih terjemahan yang benar",
        targetHanzi = "明天 上午 九 点 见。",
        targetPinyin = "Míngtiān shàngwǔ jiǔ diǎn jiàn.",
        targetTranslation = "Sampai jumpa besok pagi jam 9.",
        correctAnswer = "Míngtiān shàngwǔ jiǔ diǎn jiàn.\n明天 上午 九 点 见。",
        options = listOf(
            "Míngtiān shàngwǔ jiǔ diǎn jiàn.\n明天 上午 九 点 见。",
            "Jīntiān xiàwǔ jiǔ diǎn jiàn.\n今天 下午 九 点 见。",
            "Míngtiān wǎnshang jiǔ diǎn jiàn.\n明天 晚上 九 点 见。"
        ),
        audioToSpeak = "明天上午九点见。"
    ),

    // 7. Soal 7: Pilihan Gambar (星期六 -> hari Sabtu)
    Exercise(
        id = "u4_s5_p2_q7",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "星期六",
        targetPinyin = "xīngqīliù",
        targetTranslation = "hari Sabtu",
        correctAnswer = "hari Sabtu",
        audioToSpeak = "星期六",
        pictureOptions = listOf(
            PictureOption("u4_s5_p2_opt7_1", "minggu / pekan", "", R.drawable.ic_cal_week, true),
            PictureOption("u4_s5_p2_opt7_2", "hari ini", "", R.drawable.ic_cal_today, false),
            PictureOption("u4_s5_p2_opt7_3", "hari Minggu", "", R.drawable.ic_cal_sunday, false),
            PictureOption("u4_s5_p2_opt7_4", "besok", "", R.drawable.ic_cal_tomorrow, false)
        )
    ),

    // 8. Soal 8: Ketik Pinyin (pagi hari -> shàngwǔ)
    Exercise(
        id = "u4_s5_p2_q8",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "pagi hari (menjelang siang)",
        sentenceWithBlank = "上午 (________)",
        targetHanzi = "上午",
        targetPinyin = "shàngwǔ",
        correctAnswer = "shangwu",
        keyboardKeys = listOf("s", "h", "a", "n", "g", "w", "u", "e", "i", "o", "b"),
        audioToSpeak = "上午"
    ),

    // 9. Soal 9: Susun Kalimat (Kita bertemu hari Minggu.)
    Exercise(
        id = "u4_s5_p2_q9",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Sampai jumpa hari Minggu.",
        targetHanzi = "星期天 见。",
        targetPinyin = "Xīngqītiān jiàn.",
        wordChips = listOf("星期天:xīngqītiān", "见:jiàn", "星期六:xīngqīliù", "去:qù", "明天:míngtiān"),
        correctAnswer = "星期天,见",
        audioToSpeak = "星期天见。"
    ),

    // 10. Soal 10: Ketuk Pasangan yang Sesuai (Rangkuman Waktu & Aksi)
    Exercise(
        id = "u4_s5_p2_q10",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u4_s5_p2_m10_1", "昨天", "zuótiān", "kemarin"),
            MatchPairItem("u4_s5_p2_m10_2", "今天", "jīntiān", "hari ini"),
            MatchPairItem("u4_s5_p2_m10_3", "明天", "míngtiān", "besok"),
            MatchPairItem("u4_s5_p2_m10_4", "再见", "zàijiàn", "sampai jumpa")
        )
    )
)
