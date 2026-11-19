package com.example.chineselearning.data.repository

import com.example.chineselearning.R
import com.example.chineselearning.data.model.Exercise
import com.example.chineselearning.data.model.ExerciseType
import com.example.chineselearning.data.model.MatchPairItem
import com.example.chineselearning.data.model.PictureOption

val bab10Stage3Part1Exercises = listOf(
    // 1. Soal 1: Pilihan Gambar (火车 -> kereta api)
    Exercise(
        id = "u10_s3_p1_q1",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "火车",
        targetPinyin = "huǒchē",
        targetTranslation = "kereta api",
        correctAnswer = "kereta api",
        audioToSpeak = "火车",
        pictureOptions = listOf(
            PictureOption("u10_s3_p1_opt1", "kereta api", "🚆", R.drawable.ic_trans_train, true),
            PictureOption("u10_s3_p1_opt2", "pesawat", "✈️", R.drawable.ic_target, false),
            PictureOption("u10_s3_p1_opt3", "mobil", "🚗", R.drawable.ic_book, false),
            PictureOption("u10_s3_p1_opt4", "taksi", "🚕", R.drawable.ic_crown, false)
        )
    ),

    // 2. Soal 2: Susun Kalimat (Saya naik kereta api ke Beijing.)
    Exercise(
        id = "u10_s3_p1_q2",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Saya naik kereta ke Beijing.",
        targetHanzi = "我 坐 火车 去 北京。",
        targetPinyin = "Wǒ zuò huǒchē qù Běijīng.",
        wordChips = listOf("我:wǒ", "坐:zuò", "火车:huǒchē", "去:qù", "北京:Běijīng", "飞机:fēijī"),
        correctAnswer = "我,坐,火车,去,北京",
        audioToSpeak = "我坐火车去北京。"
    ),

    // 3. Soal 3: Ketuk Pasangan yang Sesuai (Kereta Api & Stasiun)
    Exercise(
        id = "u10_s3_p1_q3",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u10_s3_p1_m1", "火车", "huǒchē", "kereta api"),
            MatchPairItem("u10_s3_p1_m2", "火车站", "huǒchēzhàn", "stasiun kereta"),
            MatchPairItem("u10_s3_p1_m3", "坐火车", "zuò huǒchē", "naik kereta api"),
            MatchPairItem("u10_s3_p1_m4", "北京", "Běijīng", "Beijing")
        )
    ),

    // 4. Soal 4: Ketik Pinyin (kereta api -> huǒchē)
    Exercise(
        id = "u10_s3_p1_q4",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "kereta api",
        sentenceWithBlank = "火车 (________)",
        targetHanzi = "火车",
        targetPinyin = "huǒchē",
        correctAnswer = "huoche",
        keyboardKeys = listOf("h", "u", "o", "c", "e", "a", "i", "b", "d", "g", "j"),
        audioToSpeak = "火车"
    ),

    // 5. Soal 5: Mendengar Kalimat (Rule 10: illustrationRes = 0)
    Exercise(
        id = "u10_s3_p1_q5",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Apa yang Anda dengar?",
        targetTranslation = "Stasiun kereta ada di depan.",
        targetHanzi = "火车站 在 前面。",
        targetPinyin = "Huǒchēzhàn zài qiánmiàn.",
        wordChips = listOf("火车站:huǒchēzhàn", "在:zài", "前面:qiánmiàn", "后面:hòumiàn", "学校:xuéxiào"),
        correctAnswer = "火车站,在,前面",
        illustrationRes = 0,
        audioToSpeak = "火车站在前面。"
    ),

    // 6. Soal 6: Pilihan Kalimat
    Exercise(
        id = "u10_s3_p1_q6",
        type = ExerciseType.SENTENCE_CHOICE,
        title = "Pilih terjemahan yang benar",
        targetHanzi = "明天 我们 坐 火车 去。",
        targetPinyin = "Míngtiān wǒmen zuò huǒchē qù.",
        targetTranslation = "Besok kami naik kereta pergi.",
        correctAnswer = "Míngtiān wǒmen zuò huǒchē qù.\n明天 我们 坐 火车 去。",
        options = listOf(
            "Míngtiān wǒmen zuò huǒchē qù.\n明天 我们 坐 火车 去。",
            "Jīntiān wǒmen zuò huǒchē qù.\n今天 我们 坐 火车 去。",
            "Míngtiān wǒmen zuò fēijī qù.\n明天 我们 坐 飞机 去。"
        ),
        audioToSpeak = "明天我们坐火车去。"
    ),

    // 7. Soal 7: Pilihan Gambar (火车站 -> stasiun kereta)
    Exercise(
        id = "u10_s3_p1_q7",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "火车站",
        targetPinyin = "huǒchēzhàn",
        targetTranslation = "stasiun kereta",
        correctAnswer = "stasiun kereta",
        audioToSpeak = "火车站",
        pictureOptions = listOf(
            PictureOption("u10_s3_p1_opt7_1", "stasiun kereta", "🚉", R.drawable.ic_trans_train_station, true),
            PictureOption("u10_s3_p1_opt7_2", "bandara", "🛫", R.drawable.ic_target, false),
            PictureOption("u10_s3_p1_opt7_3", "sekolah", "🏫", R.drawable.ic_cap, false),
            PictureOption("u10_s3_p1_opt7_4", "toko", "🏪", R.drawable.ic_book, false)
        )
    ),

    // 8. Soal 8: Ketik Pinyin (naik kereta -> zuò huǒchē)
    Exercise(
        id = "u10_s3_p1_q8",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "naik kereta api",
        sentenceWithBlank = "坐火车 (________)",
        targetHanzi = "坐火车",
        targetPinyin = "zuòhuǒchē",
        correctAnswer = "zuohuoche",
        keyboardKeys = listOf("z", "u", "o", "h", "c", "e", "a", "i", "b", "d", "g"),
        audioToSpeak = "坐火车"
    ),

    // 9. Soal 9: Susun Kalimat (Dia jam delapan naik kereta.)
    Exercise(
        id = "u10_s3_p1_q9",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Dia jam 8 naik kereta.",
        targetHanzi = "他 八 点 坐 火车。",
        targetPinyin = "Tā bā diǎn zuò huǒchē.",
        wordChips = listOf("他:tā", "八:bā", "点:diǎn", "坐:zuò", "火车:huǒchē", "飞机:fēijī"),
        correctAnswer = "他,八,点,坐,火车",
        audioToSpeak = "他八点坐火车。"
    ),

    // 10. Soal 10: Ketuk Pasangan yang Sesuai (Rangkuman Moda Kereta)
    Exercise(
        id = "u10_s3_p1_m10_1",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u10_s3_p1_m10_1", "火车", "huǒchē", "kereta api"),
            MatchPairItem("u10_s3_p1_m10_2", "坐火车", "zuò huǒchē", "naik kereta"),
            MatchPairItem("u10_s3_p1_m10_3", "火车站", "huǒchēzhàn", "stasiun"),
            MatchPairItem("u10_s3_p1_m10_4", "去北京", "qù Běijīng", "ke Beijing")
        )
    )
)

val bab10Stage3Part2Exercises = listOf(
    // 1. Soal 1: Pilihan Gambar (飞机 -> pesawat terbang)
    Exercise(
        id = "u10_s3_p2_q1",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "飞机",
        targetPinyin = "fēijī",
        targetTranslation = "pesawat terbang",
        correctAnswer = "pesawat terbang",
        audioToSpeak = "飞机",
        pictureOptions = listOf(
            PictureOption("u10_s3_p2_opt1", "pesawat terbang", "✈️", R.drawable.ic_trans_airplane, true),
            PictureOption("u10_s3_p2_opt2", "kereta", "🚆", R.drawable.ic_target, false),
            PictureOption("u10_s3_p2_opt3", "mobil", "🚗", R.drawable.ic_book, false),
            PictureOption("u10_s3_p2_opt4", "taksi", "🚕", R.drawable.ic_crown, false)
        )
    ),

    // 2. Soal 2: Susun Kalimat (Saya naik pesawat ke Tiongkok.)
    Exercise(
        id = "u10_s3_p2_q2",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Saya naik pesawat ke Tiongkok.",
        targetHanzi = "我 坐 飞机 去 中国。",
        targetPinyin = "Wǒ zuò fēijī qù Zhōngguó.",
        wordChips = listOf("我:wǒ", "坐:zuò", "飞机:fēijī", "去:qù", "中国:Zhōngguó", "火车:huǒchē"),
        correctAnswer = "我,坐,飞机,去,中国",
        audioToSpeak = "我坐飞机去中国。"
    ),

    // 3. Soal 3: Ketuk Pasangan yang Sesuai (Pesawat & Udara)
    Exercise(
        id = "u10_s3_p2_q3",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u10_s3_p2_m1", "飞机", "fēijī", "pesawat terbang"),
            MatchPairItem("u10_s3_p2_m2", "坐飞机", "zuò fēijī", "naik pesawat"),
            MatchPairItem("u10_s3_p2_m3", "去中国", "qù Zhōngguó", "ke Tiongkok"),
            MatchPairItem("u10_s3_p2_m4", "很高", "hěn gāo", "sangat tinggi")
        )
    ),

    // 4. Soal 4: Ketik Pinyin (pesawat -> fēijī)
    Exercise(
        id = "u10_s3_p2_q4",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "pesawat terbang",
        sentenceWithBlank = "飞机 (________)",
        targetHanzi = "飞机",
        targetPinyin = "fēijī",
        correctAnswer = "feiji",
        keyboardKeys = listOf("f", "e", "i", "j", "a", "o", "u", "b", "d", "g", "h"),
        audioToSpeak = "飞机"
    ),

    // 5. Soal 5: Mendengar Kalimat (Rule 10: illustrationRes = 0)
    Exercise(
        id = "u10_s3_p2_q5",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Apa yang Anda dengar?",
        targetTranslation = "Tahun depan dia naik pesawat ke Beijing.",
        targetHanzi = "明年 他 坐 飞机 去 北京。",
        targetPinyin = "Míngnián tā zuò fēijī qù Běijīng.",
        wordChips = listOf("明年:míngnián", "他:tā", "坐:zuò", "飞机:fēijī", "去:qù", "北京:Běijīng"),
        correctAnswer = "明年,他,坐,飞机,去,北京",
        illustrationRes = 0,
        audioToSpeak = "明年他坐飞机去北京。"
    ),

    // 6. Soal 6: Pilihan Kalimat
    Exercise(
        id = "u10_s3_p2_q6",
        type = ExerciseType.SENTENCE_CHOICE,
        title = "Pilih terjemahan yang benar",
        targetHanzi = "坐 飞机 很 快。",
        targetPinyin = "Zuò fēijī hěn kuài.",
        targetTranslation = "Naik pesawat sangat cepat.",
        correctAnswer = "Zuò fēijī hěn kuài.\n坐 飞机 很 快。",
        options = listOf(
            "Zuò fēijī hěn kuài.\n坐 飞机 很 快。",
            "Zuò huǒchē hěn kuài.\n坐 火车 很 快。",
            "Zuò chē hěn kuài.\n坐 车 很 快。"
        ),
        audioToSpeak = "坐飞机很快。"
    ),

    // 7. Soal 7: Pilihan Gambar (坐飞机 -> naik pesawat)
    Exercise(
        id = "u10_s3_p2_q7",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "坐飞机",
        targetPinyin = "zuò fēijī",
        targetTranslation = "naik pesawat",
        correctAnswer = "naik pesawat",
        audioToSpeak = "坐飞机",
        pictureOptions = listOf(
            PictureOption("u10_s3_p2_opt7_1", "naik pesawat", "🛫", R.drawable.ic_trans_ride_airplane, true),
            PictureOption("u10_s3_p2_opt7_2", "naik kereta", "🚆", R.drawable.ic_target, false),
            PictureOption("u10_s3_p2_opt7_3", "naik mobil", "🚗", R.drawable.ic_book, false),
            PictureOption("u10_s3_p2_opt7_4", "jalan kaki", "🚶", R.drawable.ic_crown, false)
        )
    ),

    // 8. Soal 8: Ketik Pinyin (naik pesawat -> zuò fēijī)
    Exercise(
        id = "u10_s3_p2_q8",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "naik pesawat",
        sentenceWithBlank = "坐飞机 (________)",
        targetHanzi = "坐飞机",
        targetPinyin = "zuòfēijī",
        correctAnswer = "zuofeiji",
        keyboardKeys = listOf("z", "u", "o", "f", "e", "i", "j", "a", "b", "d", "g"),
        audioToSpeak = "坐飞机"
    ),

    // 9. Soal 9: Susun Kalimat (Saya suka naik pesawat.)
    Exercise(
        id = "u10_s3_p2_q9",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Saya suka naik pesawat.",
        targetHanzi = "我 喜欢 坐 飞机。",
        targetPinyin = "Wǒ xǐhuan zuò fēijī.",
        wordChips = listOf("我:wǒ", "喜欢:xǐhuan", "坐:zuò", "飞机:fēijī", "火车:huǒchē"),
        correctAnswer = "我,喜欢,坐,飞机",
        audioToSpeak = "我喜欢坐飞机。"
    ),

    // 10. Soal 10: Ketuk Pasangan yang Sesuai (Rangkuman Moda Udara & Kereta)
    Exercise(
        id = "u10_s3_p2_m10_1",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u10_s3_p2_m10_1", "飞机", "fēijī", "pesawat"),
            MatchPairItem("u10_s3_p2_m10_2", "火车", "huǒchē", "kereta api"),
            MatchPairItem("u10_s3_p2_m10_3", "坐飞机", "zuò fēijī", "naik pesawat"),
            MatchPairItem("u10_s3_p2_m10_4", "去中国", "qù Zhōngguó", "ke Tiongkok")
        )
    )
)
