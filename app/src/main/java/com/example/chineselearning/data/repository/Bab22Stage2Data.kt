package com.example.chineselearning.data.repository

import com.example.chineselearning.R
import com.example.chineselearning.data.model.Exercise
import com.example.chineselearning.data.model.ExerciseType
import com.example.chineselearning.data.model.MatchPairItem
import com.example.chineselearning.data.model.PictureOption

val bab22Stage2Part1Exercises = listOf(
    // 1. Soal 1: Pilihan Gambar (打车 -> naik taksi)
    Exercise(
        id = "u22_s2_p1_q1",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "打车",
        targetPinyin = "dǎchē",
        targetTranslation = "naik taksi",
        correctAnswer = "naik taksi",
        audioToSpeak = "打车",
        pictureOptions = listOf(
            PictureOption("u22_s2_p1_opt1", "naik taksi", "", R.drawable.ic_trans_hail_taxi, true),
            PictureOption("u22_s2_p1_opt2", "bus", "", R.drawable.ic_trans_bus, false),
            PictureOption("u22_s2_p1_opt3", "kereta", "", R.drawable.ic_trans_train, false),
            PictureOption("u22_s2_p1_opt4", "halte", "", R.drawable.ic_trans_bus_stop, false)
        )
    ),

    // 2. Soal 2: Susun Kalimat (Hari ini hujan lebat, mari kita naik taksi.)
    Exercise(
        id = "u22_s2_p1_q2",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Hari ini hujan lebat, ayo naik taksi.",
        targetHanzi = "今天 下大雨， 我们 打车 吧。",
        targetPinyin = "Jīntiān xià dàyǔ, wǒmen dǎchē ba.",
        wordChips = listOf("今天:jīntiān", "下大雨，:xià dàyǔ,", "我们:wǒmen", "打车:dǎchē", "吧。:ba.", "走路:zǒulù"),
        correctAnswer = "今天,下大雨，,我们,打车,吧。",
        audioToSpeak = "今天下大雨，我们打车吧。"
    ),

    // 3. Soal 3: Ketuk Pasangan yang Sesuai (Taksi & Berjalan)
    Exercise(
        id = "u22_s2_p1_q3",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u22_s2_p1_m1", "打车", "dǎchē", "naik taksi"),
            MatchPairItem("u22_s2_p1_m2", "走", "zǒu", "berjalan / pergi"),
            MatchPairItem("u22_s2_p1_m3", "下大雨", "xià dàyǔ", "hujan deras"),
            MatchPairItem("u22_s2_p1_m4", "太晚了", "tài wǎn le", "terlalu malam")
        )
    ),

    // 4. Soal 4: Ketik Pinyin (naik taksi -> dǎchē)
    Exercise(
        id = "u22_s2_p1_q4",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "naik taksi",
        sentenceWithBlank = "打车 (________)",
        targetHanzi = "打车",
        targetPinyin = "dǎchē",
        correctAnswer = "dache",
        keyboardKeys = listOf("d", "a", "c", "h", "e", "i", "o", "u", "b", "g", "j", "l"),
        audioToSpeak = "打车"
    ),

    // 5. Soal 5: Mendengar Kalimat (Rule 10: illustrationRes = 0)
    Exercise(
        id = "u22_s2_p1_q5",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Apa yang Anda dengar?",
        targetTranslation = "Waktu sudah larut, saya harus pergi.",
        targetHanzi = "时间 不 早 了， 我 得 走 了。",
        targetPinyin = "Shíjiān bù zǎo le, wǒ děi zǒu le.",
        wordChips = listOf("时间:shíjiān", "不:bù", "早:zǎo", "了，:le,", "我:wǒ", "得:děi", "走:zǒu", "了。:le."),
        correctAnswer = "时间,不,早,了，,我,得,走,了。",
        illustrationRes = 0,
        audioToSpeak = "时间不早了，我得走了。"
    ),

    // 6. Soal 6: Pilihan Kalimat
    Exercise(
        id = "u22_s2_p1_q6",
        type = ExerciseType.SENTENCE_CHOICE,
        title = "Pilih terjemahan yang benar",
        targetHanzi = "打车 去 机场 要 一百 块。",
        targetPinyin = "Dǎchē qù jīchǎng yào yìbǎi kuài.",
        targetTranslation = "Naik taksi ke bandara butuh seratus yuan.",
        correctAnswer = "Dǎchē qù jīchǎng yào yìbǎi kuài.\n打车 去 机场 要 一百 块。",
        options = listOf(
            "Dǎchē qù jīchǎng yào yìbǎi kuài.\n打车 去 机场 要 一百 块。",
            "Zuò dìtiě qù jīchǎng yào yìbǎi kuài.\n坐 地铁 去 机场 要 一百 块。",
            "Dǎchē qù xuéxiào yào yìbǎi kuài.\n打车 去 学校 要 一百 块。"
        ),
        audioToSpeak = "打车去机场要一百块。"
    ),

    // 7. Soal 7: Pilihan Gambar (走 -> berjalan)
    Exercise(
        id = "u22_s2_p1_q7",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "走",
        targetPinyin = "zǒu",
        targetTranslation = "berjalan",
        correctAnswer = "berjalan",
        audioToSpeak = "走",
        pictureOptions = listOf(
            PictureOption("u22_s2_p1_opt7_1", "berjalan", "", R.drawable.ic_action_walk, true),
            PictureOption("u22_s2_p1_opt7_2", "mobil", "", R.drawable.ic_trans_car, false),
            PictureOption("u22_s2_p1_opt7_3", "taksi", "", R.drawable.ic_trans_taxi, false),
            PictureOption("u22_s2_p1_opt7_4", "kereta", "", R.drawable.ic_trans_train, false)
        )
    ),

    // 8. Soal 8: Ketik Pinyin (berjalan -> zǒu)
    Exercise(
        id = "u22_s2_p1_q8",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "berjalan / pergi",
        sentenceWithBlank = "走 (________)",
        targetHanzi = "走",
        targetPinyin = "zǒu",
        correctAnswer = "zou",
        keyboardKeys = listOf("z", "o", "u", "a", "e", "i", "b", "d", "g", "h", "j", "l"),
        audioToSpeak = "走"
    ),

    // 9. Soal 9: Susun Kalimat (Ayo kita berjalan kaki bersama.)
    Exercise(
        id = "u22_s2_p1_q9",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Mari kita jalan bersama.",
        targetHanzi = "我们 一起 走 吧。",
        targetPinyin = "Wǒmen yìqǐ zǒu ba.",
        wordChips = listOf("我们:wǒmen", "一起:yìqǐ", "走:zǒu", "吧。:ba.", "坐:zuò"),
        correctAnswer = "我们,一起,走,吧。",
        audioToSpeak = "我们一起走吧。"
    ),

    // 10. Soal 10: Ketuk Pasangan yang Sesuai (Rangkuman Mobilitas Taksi)
    Exercise(
        id = "u22_s2_p1_m10",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u22_s2_p1_m10_1", "打车", "dǎchē", "naik taksi"),
            MatchPairItem("u22_s2_p1_m2", "走吧", "zǒu ba", "mari pergi"),
            MatchPairItem("u22_s2_p1_m3", "一百块", "yìbǎi kuài", "seratus yuan"),
            MatchPairItem("u22_s2_p1_m4", "太晚了", "tài wǎn le", "terlambat")
        )
    )
)

val bab22Stage2Part2Exercises = listOf(
    // 1. Soal 1: Pilihan Gambar (走路 -> berjalan kaki)
    Exercise(
        id = "u22_s2_p2_q1",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "走路",
        targetPinyin = "zǒulù",
        targetTranslation = "berjalan kaki",
        correctAnswer = "berjalan kaki",
        audioToSpeak = "走路",
        pictureOptions = listOf(
            PictureOption("u22_s2_p2_opt1", "jalan kaki", "", R.drawable.ic_action_walk, true),
            PictureOption("u22_s2_p2_opt2", "taksi", "", R.drawable.ic_trans_taxi, false),
            PictureOption("u22_s2_p2_opt3", "kereta", "", R.drawable.ic_trans_train, false),
            PictureOption("u22_s2_p2_opt4", "bus", "", R.drawable.ic_trans_bus, false)
        )
    ),

    // 2. Soal 2: Susun Kalimat (Saya setiap hari berjalan kaki ke perusahaan.)
    Exercise(
        id = "u22_s2_p2_q2",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Saya setiap hari jalan kaki kerja.",
        targetHanzi = "我 每天 走路 去 公司 上班。",
        targetPinyin = "Wǒ měitiān zǒulù qù gōngsī shàngbān.",
        wordChips = listOf("我:wǒ", "每天:měitiān", "走路:zǒulù", "去:qù", "公司:gōngsī", "上班。:shàngbān.", "打车:dǎchē"),
        correctAnswer = "我,每天,走路,去,公司,上班。",
        audioToSpeak = "我每天走路去公司上班。"
    ),

    // 3. Soal 3: Ketuk Pasangan yang Sesuai (Jalan Kaki & Olahraga)
    Exercise(
        id = "u22_s2_p2_m3",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u22_s2_p2_m1", "走路", "zǒulù", "berjalan kaki"),
            MatchPairItem("u22_s2_p2_m2", "跑步", "pǎobù", "berlari / jogging"),
            MatchPairItem("u22_s2_p2_m3", "去上班", "qù shàngbān", "pergi kerja"),
            MatchPairItem("u22_s2_p2_m4", "很健康", "hěn jiànkāng", "sangat sehat")
        )
    ),

    // 4. Soal 4: Ketik Pinyin (berjalan kaki -> zǒulù)
    Exercise(
        id = "u22_s2_p2_q4",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "berjalan kaki",
        sentenceWithBlank = "走路 (________)",
        targetHanzi = "走路",
        targetPinyin = "zǒulù",
        correctAnswer = "zoulu",
        keyboardKeys = listOf("z", "o", "u", "l", "a", "e", "i", "b", "d", "g", "h", "j"),
        audioToSpeak = "走路"
    ),

    // 5. Soal 5: Mendengar Kalimat (Rule 10: illustrationRes = 0)
    Exercise(
        id = "u22_s2_p2_q5",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Apa yang Anda dengar?",
        targetTranslation = "Banyak berjalan kaki sangat baik untuk kesehatan.",
        targetHanzi = "多 走路 对 身体 很 好。",
        targetPinyin = "Duō zǒulù duì shēntǐ hěn hǎo.",
        wordChips = listOf("多:duō", "走路:zǒulù", "对:duì", "身体:shēntǐ", "很:hěn", "好。:hǎo.", "少:shǎo"),
        correctAnswer = "多,走路,对,身体,很,好。",
        illustrationRes = 0,
        audioToSpeak = "多走路对身体很好。"
    ),

    // 6. Soal 6: Pilihan Kalimat
    Exercise(
        id = "u22_s2_p2_q6",
        type = ExerciseType.SENTENCE_CHOICE,
        title = "Pilih terjemahan yang benar",
        targetHanzi = "从 这里 走路 去 学校 只要 五 分钟。",
        targetPinyin = "Cóng zhèlǐ zǒulù qù xuéxiào zhǐyào wǔ fēnzhōng.",
        targetTranslation = "Dari sini berjalan kaki ke sekolah hanya butuh lima menit.",
        correctAnswer = "Cóng zhèlǐ zǒulù qù xuéxiào zhǐyào wǔ fēnzhōng.\n从 这里 走路 去 学校 只要 五 分钟。",
        options = listOf(
            "Cóng zhèlǐ zǒulù qù xuéxiào zhǐyào wǔ fēnzhōng.\n从 这里 走路 去 学校 只要 五 分钟。",
            "Cóng zhèlǐ dǎchē qù xuéxiào zhǐyào wǔ fēnzhōng.\n从 这里 打车 去 学校 只要 五 分钟。",
            "Cóng zhèlǐ zǒulù qù yīyuàn zhǐyào wǔ fēnzhōng.\n从 这里 走路 去 医院 只要 五 分钟。"
        ),
        audioToSpeak = "从这里走路去学校只要五分钟。"
    ),

    // 7. Soal 7: Pilihan Gambar (走路 -> berjalan kaki santai)
    Exercise(
        id = "u22_s2_p2_q7",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "走路",
        targetPinyin = "zǒulù",
        targetTranslation = "berjalan kaki",
        correctAnswer = "berjalan kaki",
        audioToSpeak = "走路",
        pictureOptions = listOf(
            PictureOption("u22_s2_p2_opt7_1", "jalan kaki", "", R.drawable.ic_action_walk, true),
            PictureOption("u22_s2_p2_opt7_2", "mobil", "", R.drawable.ic_trans_car, false),
            PictureOption("u22_s2_p2_opt7_3", "taksi", "", R.drawable.ic_trans_taxi, false),
            PictureOption("u22_s2_p2_opt7_4", "kereta", "", R.drawable.ic_trans_train, false)
        )
    ),

    // 8. Soal 8: Ketik Pinyin (berjalan kaki -> zǒulù)
    Exercise(
        id = "u22_s2_p2_q8",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "berjalan kaki",
        sentenceWithBlank = "走路 (________)",
        targetHanzi = "走路",
        targetPinyin = "zǒulù",
        correctAnswer = "zoulu",
        keyboardKeys = listOf("z", "o", "u", "l", "a", "e", "i", "b", "d", "g", "h", "j"),
        audioToSpeak = "走路"
    ),

    // 9. Soal 9: Susun Kalimat (Kakek berjalan kaki sangat perlahan.)
    Exercise(
        id = "u22_s2_p2_q9",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Kakek berjalan kaki sangat pelan.",
        targetHanzi = "爷爷 走路 走 得 很 慢。",
        targetPinyin = "Yéye zǒulù zǒu de hěn màn.",
        wordChips = listOf("爷爷:yéye", "走路:zǒulù", "走:zǒu", "得:de", "很:hěn", "慢。:màn.", "快:kuài"),
        correctAnswer = "爷爷,走路,走,得,很,慢。",
        audioToSpeak = "爷爷走路走得很慢。"
    ),

    // 10. Soal 10: Ketuk Pasangan yang Sesuai (Rangkuman Gaya Hidup Jalan Kaki)
    Exercise(
        id = "u22_s2_p2_m10",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u22_s2_p2_m10_1", "走路", "zǒulù", "jalan kaki"),
            MatchPairItem("u22_s2_p2_m2", "五分钟", "wǔ fēnzhōng", "lima menit"),
            MatchPairItem("u22_s2_p2_m3", "走得很慢", "zǒu de hěn màn", "jalan pelan"),
            MatchPairItem("u22_s2_p2_m4", "多走路", "duō zǒulù", "sering jalan")
        )
    )
)
