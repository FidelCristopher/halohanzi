package com.example.chineselearning.data.repository

import com.example.chineselearning.R
import com.example.chineselearning.data.model.Exercise
import com.example.chineselearning.data.model.ExerciseType
import com.example.chineselearning.data.model.MatchPairItem
import com.example.chineselearning.data.model.PictureOption

val bab22Stage4Part1Exercises = listOf(
    // 1. Soal 1: Pilihan Gambar (远 -> jauh)
    Exercise(
        id = "u22_s4_p1_q1",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "远",
        targetPinyin = "yuǎn",
        targetTranslation = "jauh",
        correctAnswer = "jauh",
        audioToSpeak = "远",
        pictureOptions = listOf(
            PictureOption("u22_s4_p1_opt1", "jauh", "", R.drawable.ic_pos_front, true),
            PictureOption("u22_s4_p1_opt2", "mobil", "", R.drawable.ic_trans_car, false),
            PictureOption("u22_s4_p1_opt3", "stasiun", "", R.drawable.ic_place_station, false),
            PictureOption("u22_s4_p1_opt4", "gedung", "", R.drawable.ic_work_office_building, false)
        )
    ),

    // 2. Soal 2: Susun Kalimat (Rumah saya berjarak sangat dekat dari kantor.)
    Exercise(
        id = "u22_s4_p1_q2",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Rumah saya dekat dari kantor.",
        targetHanzi = "我家 离 公司 很 近。",
        targetPinyin = "Wǒ jiā lí gōngsī hěn jìn.",
        wordChips = listOf("我家:wǒ jiā", "离:lí", "公司:gōngsī", "很:hěn", "近。:jìn.", "远:yuǎn"),
        correctAnswer = "我家,离,公司,很,近。",
        audioToSpeak = "我家离公司很近。"
    ),

    // 3. Soal 3: Ketuk Pasangan yang Sesuai (Jarak Jauh vs Dekat)
    Exercise(
        id = "u22_s4_p1_q3",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u22_s4_p1_m1", "离", "lí", "berjarak dari"),
            MatchPairItem("u22_s4_p1_m2", "远", "yuǎn", "jauh"),
            MatchPairItem("u22_s4_p1_m3", "近", "jìn", "dekat"),
            MatchPairItem("u22_s4_p1_m4", "太远了", "tài yuǎn le", "terlalu jauh")
        )
    ),

    // 4. Soal 4: Ketik Pinyin (berjarak dari -> lí)
    Exercise(
        id = "u22_s4_p1_q4",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "berjarak dari / terpisah dari",
        sentenceWithBlank = "离 (________)",
        targetHanzi = "离",
        targetPinyin = "lí",
        correctAnswer = "li",
        keyboardKeys = listOf("l", "i", "a", "e", "o", "u", "b", "d", "g", "h", "j", "m"),
        audioToSpeak = "离"
    ),

    // 5. Soal 5: Mendengar Kalimat (Rule 10: illustrationRes = 0)
    Exercise(
        id = "u22_s4_p1_q5",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Apa yang Anda dengar?",
        targetTranslation = "Restoran itu terlalu jauh, jangan pergi ke sana.",
        targetHanzi = "那个 饭馆 太 远 了， 别 去 了。",
        targetPinyin = "Nàge fànguǎn tài yuǎn le, bié qù le.",
        wordChips = listOf("那个:nàge", "饭馆:fànguǎn", "太:tài", "远:yuǎn", "了，:le,", "别:bié", "去:qù", "了。:le."),
        correctAnswer = "那个,饭馆,太,远,了，,别,去,了。",
        illustrationRes = 0,
        audioToSpeak = "那个饭馆太远了，别去了。"
    ),

    // 6. Soal 6: Pilihan Kalimat
    Exercise(
        id = "u22_s4_p1_q6",
        type = ExerciseType.SENTENCE_CHOICE,
        title = "Pilih terjemahan yang benar",
        targetHanzi = "学校 离 超市 很 近。",
        targetPinyin = "Xuéxiào lí chāoshì hěn jìn.",
        targetTranslation = "Sekolah berjarak sangat dekat dari supermarket.",
        correctAnswer = "Xuéxiào lí chāoshì hěn jìn.\n学校 离 超市 很 近。",
        options = listOf(
            "Xuéxiào lí chāoshì hěn jìn.\n学校 离 超市 很 近。",
            "Xuéxiào lí chāoshì hěn yuǎn.\n学校 离 超市 很 远。",
            "Xuéxiào lí yīyuàn hěn jìn.\n学校 离 医院 很 近。"
        ),
        audioToSpeak = "学校离超市很近。"
    ),

    // 7. Soal 7: Pilihan Gambar (近 -> dekat)
    Exercise(
        id = "u22_s4_p1_q7",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "近",
        targetPinyin = "jìn",
        targetTranslation = "dekat",
        correctAnswer = "dekat",
        audioToSpeak = "近",
        pictureOptions = listOf(
            PictureOption("u22_s4_p1_opt7_1", "dekat", "", R.drawable.ic_pos_arrive, true),
            PictureOption("u22_s4_p1_opt7_2", "mobil", "", R.drawable.ic_trans_car, false),
            PictureOption("u22_s4_p1_opt7_3", "gedung", "", R.drawable.ic_work_office_building, false),
            PictureOption("u22_s4_p1_opt7_4", "stasiun", "", R.drawable.ic_place_station, false)
        )
    ),

    // 8. Soal 8: Ketik Pinyin (jauh -> yuǎn)
    Exercise(
        id = "u22_s4_p1_q8",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "jauh",
        sentenceWithBlank = "远 (________)",
        targetHanzi = "远",
        targetPinyin = "yuǎn",
        correctAnswer = "yuan",
        keyboardKeys = listOf("y", "u", "a", "n", "e", "i", "o", "b", "d", "g", "h", "j"),
        audioToSpeak = "远"
    ),

    // 9. Soal 9: Susun Kalimat (Apakah rumah sakit berjarak jauh dari sini?)
    Exercise(
        id = "u22_s4_p1_q9",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "RS jauh tidak dari sini?",
        targetHanzi = "医院 离 这里 远 吗？",
        targetPinyin = "Yīyuàn lí zhèlǐ yuǎn ma?",
        wordChips = listOf("医院:yīyuàn", "离:lí", "这里:zhèlǐ", "远:yuǎn", "吗？:ma?", "近:jìn"),
        correctAnswer = "医院,离,这里,远,吗？",
        audioToSpeak = "医院离这里远吗？"
    ),

    // 10. Soal 10: Ketuk Pasangan yang Sesuai (Rangkuman Jarak)
    Exercise(
        id = "u22_s4_p1_m10",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u22_s4_p1_m10_1", "离这里", "lí zhèlǐ", "dari sini"),
            MatchPairItem("u22_s4_p1_m10_2", "很远", "hěn yuǎn", "sangat jauh"),
            MatchPairItem("u22_s4_p1_m10_3", "很近", "hěn jìn", "sangat dekat"),
            MatchPairItem("u22_s4_p1_m10_4", "去超市", "qù chāoshì", "ke supermarket")
        )
    )
)

val bab22Stage4Part2Exercises = listOf(
    // 1. Soal 1: Pilihan Gambar (快 -> cepat)
    Exercise(
        id = "u22_s4_p2_q1",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "快",
        targetPinyin = "kuài",
        targetTranslation = "cepat",
        correctAnswer = "cepat",
        audioToSpeak = "快",
        pictureOptions = listOf(
            PictureOption("u22_s4_p2_opt1", "cepat", "", R.drawable.ic_stopwatch_min, true),
            PictureOption("u22_s4_p2_opt2", "mobil", "", R.drawable.ic_trans_car, false),
            PictureOption("u22_s4_p2_opt3", "gedung", "", R.drawable.ic_work_office_building, false),
            PictureOption("u22_s4_p2_opt4", "stasiun", "", R.drawable.ic_place_station, false)
        )
    ),

    // 2. Soal 2: Susun Kalimat (Jalan lurus terus ke arah depan.)
    Exercise(
        id = "u22_s4_p2_q2",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Jalan lurus ke depan.",
        targetHanzi = "一直 往 前 走。",
        targetPinyin = "Yìzhí wǎng qián zǒu.",
        wordChips = listOf("一直:yìzhí", "往:wǎng", "前:qián", "走。:zǒu.", "后:hòu"),
        correctAnswer = "一直,往,前,走。",
        audioToSpeak = "一直往前走。"
    ),

    // 3. Soal 3: Ketuk Pasangan yang Sesuai (Arah & Cepat Lambat)
    Exercise(
        id = "u22_s4_p2_m3",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u22_s4_p2_m1", "快", "kuài", "cepat"),
            MatchPairItem("u22_s4_p2_m2", "慢", "màn", "lambat / pelan"),
            MatchPairItem("u22_s4_p2_m3", "往", "wǎng", "menuju / ke arah"),
            MatchPairItem("u22_s4_p2_m4", "往前走", "wǎng qián zǒu", "jalan ke depan")
        )
    ),

    // 4. Soal 4: Ketik Pinyin (dekat -> jìn)
    Exercise(
        id = "u22_s4_p2_q4",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "dekat",
        sentenceWithBlank = "近 (________)",
        targetHanzi = "近",
        targetPinyin = "jìn",
        correctAnswer = "jin",
        keyboardKeys = listOf("j", "i", "n", "a", "e", "o", "u", "b", "d", "g", "h", "l"),
        audioToSpeak = "近"
    ),

    // 5. Soal 5: Mendengar Kalimat (Rule 10: illustrationRes = 0)
    Exercise(
        id = "u22_s4_p2_q5",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Apa yang Anda dengar?",
        targetTranslation = "Dia berlari lebih cepat dibanding semua orang.",
        targetHanzi = "他 跑 得 比 大家 都 快。",
        targetPinyin = "Tā pǎo de bǐ dàjiā dōu kuài.",
        wordChips = listOf("他:tā", "跑:pǎo", "得:de", "比:bǐ", "大家:dàjiā", "都:dōu", "快。:kuài.", "慢:màn"),
        correctAnswer = "他,跑,得,比,大家,都,快。",
        illustrationRes = 0,
        audioToSpeak = "他跑得比大家都快。"
    ),

    // 6. Soal 6: Pilihan Kalimat
    Exercise(
        id = "u22_s4_p2_q6",
        type = ExerciseType.SENTENCE_CHOICE,
        title = "Pilih terjemahan yang benar",
        targetHanzi = "请 往 右 拐， 医院 就 在 前面。",
        targetPinyin = "Qǐng wǎng yòu guǎi, yīyuàn jiù zài qiánmiàn.",
        targetTranslation = "Silakan belok ke kanan, rumah sakit langsung ada di depan.",
        correctAnswer = "Qǐng wǎng yòu guǎi, yīyuàn jiù zài qiánmiàn.\n请 往 右 拐， 医院 就 在 前面。",
        options = listOf(
            "Qǐng wǎng yòu guǎi, yīyuàn jiù zài qiánmiàn.\n请 往 右 拐， 医院 就 在 前面。",
            "Qǐng wǎng zuǒ guǎi, yīyuàn jiù zài qiánmiàn.\n请 往 左 拐， 医院 就 在 前面。",
            "Qǐng wǎng qián zǒu, xuéxiào zài qiánmiàn.\n请 往 前 走， 学校 在 前面。"
        ),
        audioToSpeak = "请往右拐，医院就在前面。"
    ),

    // 7. Soal 7: Pilihan Gambar (往 -> menuju ke arah)
    Exercise(
        id = "u22_s4_p2_q7",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "往",
        targetPinyin = "wǎng",
        targetTranslation = "menuju / ke arah",
        correctAnswer = "menuju / ke arah",
        audioToSpeak = "往",
        pictureOptions = listOf(
            PictureOption("u22_s4_p2_opt7_1", "ke arah", "", R.drawable.ic_pos_front, true),
            PictureOption("u22_s4_p2_opt7_2", "mobil", "", R.drawable.ic_trans_car, false),
            PictureOption("u22_s4_p2_opt7_3", "gedung", "", R.drawable.ic_work_office_building, false),
            PictureOption("u22_s4_p2_opt7_4", "stasiun", "", R.drawable.ic_place_station, false)
        )
    ),

    // 8. Soal 8: Ketik Pinyin (ke arah -> wǎng)
    Exercise(
        id = "u22_s4_p2_q8",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "menuju / ke arah",
        sentenceWithBlank = "往 (________)",
        targetHanzi = "往",
        targetPinyin = "wǎng",
        correctAnswer = "wang",
        keyboardKeys = listOf("w", "a", "n", "g", "e", "i", "o", "u", "b", "d", "h", "j"),
        audioToSpeak = "往"
    ),

    // 9. Soal 9: Susun Kalimat (Kereta berjalan sangat cepat.)
    Exercise(
        id = "u22_s4_p2_q9",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Kereta berjalan sangat cepat.",
        targetHanzi = "火车 跑 得 很 快。",
        targetPinyin = "Huǒchē pǎo de hěn kuài.",
        wordChips = listOf("火车:huǒchē", "跑:pǎo", "得:de", "很:hěn", "快。:kuài.", "慢:màn"),
        correctAnswer = "火车,跑,得,很,快。",
        audioToSpeak = "火车跑得很快。"
    ),

    // 10. Soal 10: Ketuk Pasangan yang Sesuai (Rangkuman Kecepatan & Arah)
    Exercise(
        id = "u22_s4_p2_m10",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u22_s4_p2_m10_1", "很快", "hěn kuài", "sangat cepat"),
            MatchPairItem("u22_s4_p2_m2", "很慢", "hěn màn", "sangat pelan"),
            MatchPairItem("u22_s4_p2_m3", "往右拐", "wǎng yòu guǎi", "belok kanan"),
            MatchPairItem("u22_s4_p2_m4", "往左走", "wǎng zuǒ zǒu", "jalan ke kiri")
        )
    )
)
