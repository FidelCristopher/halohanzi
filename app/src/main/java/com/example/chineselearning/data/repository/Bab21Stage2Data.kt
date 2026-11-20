package com.example.chineselearning.data.repository

import com.example.chineselearning.R
import com.example.chineselearning.data.model.Exercise
import com.example.chineselearning.data.model.ExerciseType
import com.example.chineselearning.data.model.MatchPairItem
import com.example.chineselearning.data.model.PictureOption

val bab21Stage2Part1Exercises = listOf(
    // 1. Soal 1: Pilihan Gambar (出来 -> keluar ke sini)
    Exercise(
        id = "u21_s2_p1_q1",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "出来",
        targetPinyin = "chūlái",
        targetTranslation = "keluar ke sini",
        correctAnswer = "keluar ke sini",
        audioToSpeak = "出来",
        pictureOptions = listOf(
            PictureOption("u21_s2_p1_opt1", "keluar ke sini", "", R.drawable.ic_pos_out, true),
            PictureOption("u21_s2_p1_opt2", "masuk ke sini", "", R.drawable.ic_pos_in, false),
            PictureOption("u21_s2_p1_opt3", "naik ke atas", "", R.drawable.ic_pos_up, false),
            PictureOption("u21_s2_p1_opt4", "turun ke bawah", "", R.drawable.ic_pos_down, false)
        )
    ),

    // 2. Soal 2: Susun Kalimat (Harap semua orang keluar dari ruang kelas.)
    Exercise(
        id = "u21_s2_p1_q2",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Harap semua keluar dari kelas.",
        targetHanzi = "请 大家 从 教室 出来。",
        targetPinyin = "Qǐng dàjiā cóng jiàoshì chūlái.",
        wordChips = listOf("请:qǐng", "大家:dàjiā", "从:cóng", "教室:jiàoshì", "出来。:chūlái.", "进去:jìnqù"),
        correctAnswer = "请,大家,从,教室,出来。",
        audioToSpeak = "请大家从教室出来。"
    ),

    // 3. Soal 3: Ketuk Pasangan yang Sesuai (Keluar & Keluar Kemari)
    Exercise(
        id = "u21_s2_p1_q3",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u21_s2_p1_m1", "出", "chū", "keluar"),
            MatchPairItem("u21_s2_p1_m2", "出来", "chūlái", "keluar ke sini"),
            MatchPairItem("u21_s2_p1_m3", "走出", "zǒu chū", "berjalan keluar"),
            MatchPairItem("u21_s2_p1_m4", "校门", "xiàomén", "gerbang sekolah")
        )
    ),

    // 4. Soal 4: Ketik Pinyin (keluar ke sini -> chūlái)
    Exercise(
        id = "u21_s2_p1_q4",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "keluar ke sini",
        sentenceWithBlank = "出来 (________)",
        targetHanzi = "出来",
        targetPinyin = "chūlái",
        correctAnswer = "chulai",
        keyboardKeys = listOf("c", "h", "u", "l", "a", "i", "e", "o", "b", "d", "g", "j"),
        audioToSpeak = "出来"
    ),

    // 5. Soal 5: Mendengar Kalimat (Rule 10: illustrationRes = 0)
    Exercise(
        id = "u21_s2_p1_q5",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Apa yang Anda dengar?",
        targetTranslation = "Dia baru saja melangkah keluar gerbang sekolah.",
        targetHanzi = "他 刚 走 出 校门。",
        targetPinyin = "Tā gāng zǒu chū xiàomén.",
        wordChips = listOf("他:tā", "刚:gāng", "走:zǒu", "出:chū", "校门。:xiàomén.", "进:jìn"),
        correctAnswer = "他,刚,走,出,校门。",
        illustrationRes = 0,
        audioToSpeak = "他刚走出校门。"
    ),

    // 6. Soal 6: Pilihan Kalimat
    Exercise(
        id = "u21_s2_p1_q6",
        type = ExerciseType.SENTENCE_CHOICE,
        title = "Pilih terjemahan yang benar",
        targetHanzi = "太阳 从 东方 升 出来 了。",
        targetPinyin = "Tàiyáng cóng dōngfāng shēng chūlái le.",
        targetTranslation = "Matahari telah terbit keluar dari arah timur.",
        correctAnswer = "Tàiyáng cóng dōngfāng shēng chūlái le.\n太阳 从 东方 升 出来 了。",
        options = listOf(
            "Tàiyáng cóng dōngfāng shēng chūlái le.\n太阳 从 东方 升 出来 了。",
            "Tàiyáng cóng xīfāng luò xiàqù le.\n太阳 从 西方 落 下去 了。",
            "Yuèliang cóng dōngfāng shēng chūlái le.\n月亮 从 东方 升 出来 了。"
        ),
        audioToSpeak = "太阳从东方升出来了。"
    ),

    // 7. Soal 7: Pilihan Gambar (出 -> keluar)
    Exercise(
        id = "u21_s2_p1_q7",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "出",
        targetPinyin = "chū",
        targetTranslation = "keluar",
        correctAnswer = "keluar",
        audioToSpeak = "出",
        pictureOptions = listOf(
            PictureOption("u21_s2_p1_opt7_1", "keluar", "", R.drawable.ic_pos_out, true),
            PictureOption("u21_s2_p1_opt7_2", "masuk", "", R.drawable.ic_pos_in, false),
            PictureOption("u21_s2_p1_opt7_3", "datang", "", R.drawable.ic_trans_come, false),
            PictureOption("u21_s2_p1_opt7_4", "pergi", "", R.drawable.ic_trans_go, false)
        )
    ),

    // 8. Soal 8: Ketik Pinyin (keluar -> chū)
    Exercise(
        id = "u21_s2_p1_q8",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "keluar",
        sentenceWithBlank = "出 (________)",
        targetHanzi = "出",
        targetPinyin = "chū",
        correctAnswer = "chu",
        keyboardKeys = listOf("c", "h", "u", "a", "e", "i", "o", "b", "d", "g", "j", "l"),
        audioToSpeak = "出"
    ),

    // 9. Soal 9: Susun Kalimat (Kamu cepatlah keluar, kami sedang menunggumu.)
    Exercise(
        id = "u21_s2_p1_q9",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Kamu cepat keluar, kami menunggu.",
        targetHanzi = "你 快 出来， 我们 在 等 你。",
        targetPinyin = "Nǐ kuài chūlái, wǒmen zài děng nǐ.",
        wordChips = listOf("你:nǐ", "快:kuài", "出来，:chūlái,", "我们:wǒmen", "在:zài", "等:děng", "你。:nǐ.", "进去:jìnqù"),
        correctAnswer = "你,快,出来，,我们,在,等,你。",
        audioToSpeak = "你快出来，我们在等你。"
    ),

    // 10. Soal 10: Ketuk Pasangan yang Sesuai (Rangkuman Aksi Keluar)
    Exercise(
        id = "u21_s2_p1_m10",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u21_s2_p1_m10_1", "出", "chū", "keluar"),
            MatchPairItem("u21_s2_p1_m10_2", "出来", "chūlái", "keluar ke sini"),
            MatchPairItem("u21_s2_p1_m10_3", "等你", "děng nǐ", "menunggumu"),
            MatchPairItem("u21_s2_p1_m10_4", "从房间", "cóng fángjiān", "dari kamar")
        )
    )
)

val bab21Stage2Part2Exercises = listOf(
    // 1. Soal 1: Pilihan Gambar (出去 -> keluar ke sana)
    Exercise(
        id = "u21_s2_p2_q1",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "出去",
        targetPinyin = "chūqù",
        targetTranslation = "keluar ke sana",
        correctAnswer = "keluar ke sana",
        audioToSpeak = "出去",
        pictureOptions = listOf(
            PictureOption("u21_s2_p2_opt1", "keluar ke sana", "", R.drawable.ic_pos_out, true),
            PictureOption("u21_s2_p2_opt2", "masuk ke sini", "", R.drawable.ic_pos_in, false),
            PictureOption("u21_s2_p2_opt3", "datang", "", R.drawable.ic_trans_come, false),
            PictureOption("u21_s2_p2_opt4", "pulang", "", R.drawable.ic_trans_return_home, false)
        )
    ),

    // 2. Soal 2: Susun Kalimat (Ayah telah keluar, tidak ada di rumah.)
    Exercise(
        id = "u21_s2_p2_q2",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Ayah keluar, tidak ada di rumah.",
        targetHanzi = "爸爸 出去 了， 不 在 家。",
        targetPinyin = "Bàba chūqù le, bú zài jiā.",
        wordChips = listOf("爸爸:bàba", "出去:chūqù", "了，:le,", "不:bú", "在:zài", "家。:jiā.", "进来:jìnlái"),
        correctAnswer = "爸爸,出去,了，,不,在,家。",
        audioToSpeak = "爸爸出去了，不在家。"
    ),

    // 3. Soal 3: Ketuk Pasangan yang Sesuai (Keluar Ke Sana & Keluar Rumah)
    Exercise(
        id = "u21_s2_p2_m3",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u21_s2_p2_m1", "出去", "chūqù", "keluar ke sana"),
            MatchPairItem("u21_s2_p2_m2", "出门", "chūmén", "keluar rumah"),
            MatchPairItem("u21_s2_p2_m3", "不在家", "bú zài jiā", "tidak di rumah"),
            MatchPairItem("u21_s2_p2_m4", "带钥匙", "dài yàoshi", "bawa kunci")
        )
    ),

    // 4. Soal 4: Ketik Pinyin (keluar ke sana -> chūqù)
    Exercise(
        id = "u21_s2_p2_q4",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "keluar ke sana",
        sentenceWithBlank = "出去 (________)",
        targetHanzi = "出去",
        targetPinyin = "chūqù",
        correctAnswer = "chuqu",
        keyboardKeys = listOf("c", "h", "u", "q", "a", "e", "i", "o", "b", "d", "g", "j"),
        audioToSpeak = "出去"
    ),

    // 5. Soal 5: Mendengar Kalimat (Rule 10: illustrationRes = 0)
    Exercise(
        id = "u21_s2_p2_q5",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Apa yang Anda dengar?",
        targetTranslation = "Sebelum keluar rumah jangan lupa membawa kunci.",
        targetHanzi = "出门 前 别 忘 了 带 钥匙。",
        targetPinyin = "Chūmén qián bié wàng le dài yàoshi.",
        wordChips = listOf("出门:chūmén", "前:qián", "别:bié", "忘:wàng", "了:le", "带:dài", "钥匙。:yàoshi.", "进门:jìnmén"),
        correctAnswer = "出门,前,别,忘,了,带,钥匙。",
        illustrationRes = 0,
        audioToSpeak = "出门前别忘了带钥匙。"
    ),

    // 6. Soal 6: Pilihan Kalimat
    Exercise(
        id = "u21_s2_p2_q6",
        type = ExerciseType.SENTENCE_CHOICE,
        title = "Pilih terjemahan yang benar",
        targetHanzi = "今天 天气 好， 我们 出去 散步 吧。",
        targetPinyin = "Jīntiān tiānqì hǎo, wǒmen chūqù sànbù ba.",
        targetTranslation = "Hari ini cuaca bagus, mari kita keluar jalan-jalan santai.",
        correctAnswer = "Jīntiān tiānqì hǎo, wǒmen chūqù sànbù ba.\n今天 天气 好， 我们 出去 散步 吧。",
        options = listOf(
            "Jīntiān tiānqì hǎo, wǒmen chūqù sànbù ba.\n今天 天气 好， 我们 出去 散步 吧。",
            "Jīntiān tiānqì bù hǎo, wǒmen bié chūqù.\n今天 天气 不 好， 我们 别 出去。",
            "Jīntiān xiàyǔ, wǒmen zài jiā lǐ ba.\n今天 下雨， 我们 在 家 里 吧。"
        ),
        audioToSpeak = "今天天气好，我们出去散步吧。"
    ),

    // 7. Soal 7: Pilihan Gambar (出门 -> keluar rumah)
    Exercise(
        id = "u21_s2_p2_q7",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "出门",
        targetPinyin = "chūmén",
        targetTranslation = "keluar rumah",
        correctAnswer = "keluar rumah",
        audioToSpeak = "出门",
        pictureOptions = listOf(
            PictureOption("u21_s2_p2_opt7_1", "keluar rumah", "", R.drawable.ic_pos_out, true),
            PictureOption("u21_s2_p2_opt7_2", "masuk rumah", "", R.drawable.ic_pos_in, false),
            PictureOption("u21_s2_p2_opt7_3", "naik ke atas", "", R.drawable.ic_pos_up, false),
            PictureOption("u21_s2_p2_opt7_4", "turun ke bawah", "", R.drawable.ic_pos_down, false)
        )
    ),

    // 8. Soal 8: Ketik Pinyin (keluar rumah -> chūmén)
    Exercise(
        id = "u21_s2_p2_q8",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "keluar rumah / bepergian",
        sentenceWithBlank = "出门 (________)",
        targetHanzi = "出门",
        targetPinyin = "chūmén",
        correctAnswer = "chumen",
        keyboardKeys = listOf("c", "h", "u", "m", "e", "n", "a", "i", "o", "b", "d", "g"),
        audioToSpeak = "出门"
    ),

    // 9. Soal 9: Susun Kalimat (Dia tidak mau keluar, ingin istirahat di rumah.)
    Exercise(
        id = "u21_s2_p2_q9",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Dia tidak mau keluar rumah.",
        targetHanzi = "他 不 想 出门。",
        targetPinyin = "Tā bù xiǎng chūmén.",
        wordChips = listOf("他:tā", "不:bù", "想:xiǎng", "出门。:chūmén.", "进去:jìnqù"),
        correctAnswer = "他,不,想,出门。",
        audioToSpeak = "他不想出门。"
    ),

    // 10. Soal 10: Ketuk Pasangan yang Sesuai (Rangkuman Bepergian Keluar)
    Exercise(
        id = "u21_s2_p2_m10",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u21_s2_p2_m10_1", "出门", "chūmén", "keluar rumah"),
            MatchPairItem("u21_s2_p2_m10_2", "出去", "chūqù", "keluar ke sana"),
            MatchPairItem("u21_s2_p2_m10_3", "散步", "sànbù", "jalan santai"),
            MatchPairItem("u21_s2_p2_m10_4", "休息", "xiūxi", "istirahat")
        )
    )
)
