package com.example.chineselearning.data.repository

import com.example.chineselearning.R
import com.example.chineselearning.data.model.Exercise
import com.example.chineselearning.data.model.ExerciseType
import com.example.chineselearning.data.model.MatchPairItem
import com.example.chineselearning.data.model.PictureOption

val bab22Stage5Part1Exercises = listOf(
    // 1. Soal 1: Pilihan Gambar (公交车 -> bus umum)
    Exercise(
        id = "u22_s5_p1_q1",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "公交车",
        targetPinyin = "gōngjiāochē",
        targetTranslation = "bus umum",
        correctAnswer = "bus umum",
        audioToSpeak = "公交车",
        pictureOptions = listOf(
            PictureOption("u22_s5_p1_opt1", "bus", "", R.drawable.ic_trans_bus, true),
            PictureOption("u22_s5_p1_opt2", "taksi", "", R.drawable.ic_trans_taxi, false),
            PictureOption("u22_s5_p1_opt3", "kereta", "", R.drawable.ic_trans_train, false),
            PictureOption("u22_s5_p1_opt4", "halte", "", R.drawable.ic_trans_bus_stop, false)
        )
    ),

    // 2. Soal 2: Susun Kalimat (Dari sini naik bus umum sangat praktis.)
    Exercise(
        id = "u22_s5_p1_q2",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Dari sini naik bus sangat praktis.",
        targetHanzi = "从 这里 坐 公交车 很 方便。",
        targetPinyin = "Cóng zhèlǐ zuò gōngjiāochē hěn fāngbiàn.",
        wordChips = listOf("从:cóng", "这里:zhèlǐ", "坐:zuò", "公交车:gōngjiāochē", "很:hěn", "方便。:fāngbiàn.", "慢:màn"),
        correctAnswer = "从,这里,坐,公交车,很,方便。",
        audioToSpeak = "从这里坐公交车很方便。"
    ),

    // 3. Soal 3: Ketuk Pasangan yang Sesuai (Sintesis Bus & Taksi)
    Exercise(
        id = "u22_s5_p1_m3",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u22_s5_p1_m1", "公交车", "gōngjiāochē", "bus umum"),
            MatchPairItem("u22_s5_p1_m2", "打车", "dǎchē", "naik taksi"),
            MatchPairItem("u22_s5_p1_m3", "很方便", "hěn fāngbiàn", "sangat praktis"),
            MatchPairItem("u22_s5_p1_m4", "很便宜", "hěn piányi", "sangat murah")
        )
    ),

    // 4. Soal 4: Ketik Pinyin (MRT -> dìtiě)
    Exercise(
        id = "u22_s5_p1_q4",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "kereta bawah tanah / MRT",
        sentenceWithBlank = "地铁 (________)",
        targetHanzi = "地铁",
        targetPinyin = "dìtiě",
        correctAnswer = "ditie",
        keyboardKeys = listOf("d", "i", "t", "e", "a", "o", "u", "b", "g", "h", "j", "l"),
        audioToSpeak = "地铁"
    ),

    // 5. Soal 5: Mendengar Kalimat (Rule 10: illustrationRes = 0)
    Exercise(
        id = "u22_s5_p1_q5",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Apa yang Anda dengar?",
        targetTranslation = "Stasiun MRT berada di sebelah kanan.",
        targetHanzi = "地铁站 在 右边。",
        targetPinyin = "Dìtiězhàn zài yòubian.",
        wordChips = listOf("地铁站:dìtiězhàn", "在:zài", "右边。:yòubian.", "左边:zuǒbian"),
        correctAnswer = "地铁站,在,右边。",
        illustrationRes = 0,
        audioToSpeak = "地铁站在右边。"
    ),

    // 6. Soal 6: Pilihan Kalimat
    Exercise(
        id = "u22_s5_p1_q6",
        type = ExerciseType.SENTENCE_CHOICE,
        title = "Pilih terjemahan yang benar",
        targetHanzi = "我 每天 走路 上学， 不 坐车。",
        targetPinyin = "Wǒ měitiān zǒulù shàngxué, bú zuòchē.",
        targetTranslation = "Saya setiap hari berjalan kaki ke sekolah, tidak naik kendaraan.",
        correctAnswer = "Wǒ měitiān zǒulù shàngxué, bú zuòchē.\n我 每天 走路 上学， 不 坐车。",
        options = listOf(
            "Wǒ měitiān zǒulù shàngxué, bú zuòchē.\n我 每天 走路 上学， 不 坐车。",
            "Wǒ měitiān zuòchē shàngxué, bù zǒulù.\n我 每天 坐车 上学， 不 走路。",
            "Tā měitiān zǒulù shàngxué, bú zuòchē.\n他 每天 走路 上学， 不 坐车。"
        ),
        audioToSpeak = "我每天走路学，不坐车。"
    ),

    // 7. Soal 7: Pilihan Gambar (打车 -> memanggil taksi)
    Exercise(
        id = "u22_s5_p1_q7",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "打车",
        targetPinyin = "dǎchē",
        targetTranslation = "naik taksi",
        correctAnswer = "naik taksi",
        audioToSpeak = "打车",
        pictureOptions = listOf(
            PictureOption("u22_s5_p1_opt7_1", "taksi", "", R.drawable.ic_trans_taxi, true),
            PictureOption("u22_s5_p1_opt7_2", "bus", "", R.drawable.ic_trans_bus, false),
            PictureOption("u22_s5_p1_opt7_3", "kereta", "", R.drawable.ic_trans_train, false),
            PictureOption("u22_s5_p1_opt7_4", "halte", "", R.drawable.ic_trans_bus_stop, false)
        )
    ),

    // 8. Soal 8: Ketik Pinyin (naik taksi -> dǎchē)
    Exercise(
        id = "u22_s5_p1_q8",
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

    // 9. Soal 9: Susun Kalimat (Ke bandara masih butuh waktu setengah jam.)
    Exercise(
        id = "u22_s5_p1_q9",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Ke bandara masih butuh setengah jam.",
        targetHanzi = "去 机场 还 要 半 个 小时。",
        targetPinyin = "Qù jīchǎng hái yào bàn gè xiǎoshí.",
        wordChips = listOf("去:qù", "机场:jīchǎng", "还:hái", "要:yào", "半:bàn", "个:gè", "小时。:xiǎoshí.", "分钟:fēnzhōng"),
        correctAnswer = "去,机场,还,要,半,个,小时。",
        audioToSpeak = "去机场还要半个小时。"
    ),

    // 10. Soal 10: Ketuk Pasangan yang Sesuai (Rangkuman Sintesis 1)
    Exercise(
        id = "u22_s5_p1_m10",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u22_s5_p1_m10_1", "地铁站", "dìtiězhàn", "stasiun MRT"),
            MatchPairItem("u22_s5_p1_m2", "打车去", "dǎchē qù", "naik taksi"),
            MatchPairItem("u22_s5_p1_m3", "半小时", "bàn xiǎoshí", "setengah jam"),
            MatchPairItem("u22_s5_p1_m4", "很近", "hěn jìn", "sangat dekat")
        )
    )
)

val bab22Stage5Part2Exercises = listOf(
    // 1. Soal 1: Pilihan Gambar (车站 -> halte stasiun)
    Exercise(
        id = "u22_s5_p2_q1",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "车站",
        targetPinyin = "chēzhàn",
        targetTranslation = "halte / stasiun",
        correctAnswer = "halte / stasiun",
        audioToSpeak = "车站",
        pictureOptions = listOf(
            PictureOption("u22_s5_p2_opt1", "halte", "", R.drawable.ic_trans_bus_stop, true),
            PictureOption("u22_s5_p2_opt2", "bus", "", R.drawable.ic_trans_bus, false),
            PictureOption("u22_s5_p2_opt3", "taksi", "", R.drawable.ic_trans_taxi, false),
            PictureOption("u22_s5_p2_opt4", "kereta", "", R.drawable.ic_trans_train, false)
        )
    ),

    // 2. Soal 2: Susun Kalimat (Jalan lurus ke depan sampai di halte bus.)
    Exercise(
        id = "u22_s5_p2_q2",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Jalan terus ke depan sampai di halte.",
        targetHanzi = "往前 走 到 车站。",
        targetPinyin = "Wǎng qián zǒu dào chēzhàn.",
        wordChips = listOf("往前:wǎng qián", "走:zǒu", "到:dào", "车站。:chēzhàn.", "往后:wǎng hòu"),
        correctAnswer = "往前,走,到,车站。",
        audioToSpeak = "往前走到车站。"
    ),

    // 3. Soal 3: Ketuk Pasangan yang Sesuai (Grand Sintesis Bab 22)
    Exercise(
        id = "u22_s5_p2_m3",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u22_s5_p2_m1", "路上", "lùshang", "di jalan"),
            MatchPairItem("u22_s5_p2_m2", "走路", "zǒulù", "jalan kaki"),
            MatchPairItem("u22_s5_p2_m3", "很远", "hěn yuǎn", "sangat jauh"),
            MatchPairItem("u22_s5_p2_m4", "往右走", "wǎng yòu zǒu", "jalan ke kanan")
        )
    ),

    // 4. Soal 4: Ketik Pinyin (jalan kaki -> zǒulù)
    Exercise(
        id = "u22_s5_p2_q4",
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
        id = "u22_s5_p2_q5",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Apa yang Anda dengar?",
        targetTranslation = "Halte bus berjarak tidak jauh dari sini.",
        targetHanzi = "车站 离 这里 不 远。",
        targetPinyin = "Chēzhàn lí zhèlǐ bù yuǎn.",
        wordChips = listOf("车站:chēzhàn", "离:lí", "这里:zhèlǐ", "不:bù", "远。:yuǎn.", "很:hěn"),
        correctAnswer = "车站,离,这里,不,远。",
        illustrationRes = 0,
        audioToSpeak = "车站离这里不远。"
    ),

    // 6. Soal 6: Pilihan Kalimat
    Exercise(
        id = "u22_s5_p2_q6",
        type = ExerciseType.SENTENCE_CHOICE,
        title = "Pilih terjemahan yang benar",
        targetHanzi = "路上 小心， 到 了 打 电话。",
        targetPinyin = "Lùshang xiǎoxīn, dào le dǎ diànhuà.",
        targetTranslation = "Hati-hati di jalan, begitu sampai telepon ya.",
        correctAnswer = "Lùshang xiǎoxīn, dào le dǎ diànhuà.\n路上 小心， 到 了 打 电话。",
        options = listOf(
            "Lùshang xiǎoxīn, dào le dǎ diànhuà.\n路上 小心， 到 了 打 电话。",
            "Lùshang kuài diǎnr, dào le dǎ diànhuà.\n路上 快 点儿， 到 了 打 电话。",
            "Lùshang xiǎoxīn, bié dǎ diànhuà.\n路上 小心， 别 打 电话。"
        ),
        audioToSpeak = "路上小心，到了打电话。"
    ),

    // 7. Soal 7: Pilihan Gambar (地铁 -> MRT)
    Exercise(
        id = "u22_s5_p2_q7",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "地铁",
        targetPinyin = "dìtiě",
        targetTranslation = "kereta bawah tanah / MRT",
        correctAnswer = "kereta bawah tanah / MRT",
        audioToSpeak = "地铁",
        pictureOptions = listOf(
            PictureOption("u22_s5_p2_opt7_1", "MRT", "", R.drawable.ic_trans_subway, true),
            PictureOption("u22_s5_p2_opt7_2", "bus", "", R.drawable.ic_trans_bus, false),
            PictureOption("u22_s5_p2_opt7_3", "taksi", "", R.drawable.ic_trans_taxi, false),
            PictureOption("u22_s5_p2_opt7_4", "halte", "", R.drawable.ic_trans_bus_stop, false)
        )
    ),

    // 8. Soal 8: Ketik Pinyin (halte -> chēzhàn)
    Exercise(
        id = "u22_s5_p2_q8",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "halte / stasiun",
        sentenceWithBlank = "车站 (________)",
        targetHanzi = "车站",
        targetPinyin = "chēzhàn",
        correctAnswer = "chezhan",
        keyboardKeys = listOf("c", "h", "e", "z", "a", "n", "i", "o", "u", "b", "d", "g"),
        audioToSpeak = "车站"
    ),

    // 9. Soal 9: Susun Kalimat (Kami naik bus umum kembali ke rumah.)
    Exercise(
        id = "u22_s5_p2_q9",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Kami naik bus pulang ke rumah.",
        targetHanzi = "我们 坐 公交车 回 家。",
        targetPinyin = "Wǒmen zuò gōngjiāochē huí jiā.",
        wordChips = listOf("我们:wǒmen", "坐:zuò", "公交车:gōngjiāochē", "回:huí", "家。:jiā.", "打车:dǎchē"),
        correctAnswer = "我们,坐,公交车,回,家。",
        audioToSpeak = "我们坐公交车回家。"
    ),

    // 10. Soal 10: Ketuk Pasangan yang Sesuai (Grand Review Final Bab 22)
    Exercise(
        id = "u22_s5_p2_m10",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u22_s5_p2_m10_1", "公共汽车", "gōnggòng qìchē", "bus umum"),
            MatchPairItem("u22_s5_p2_m10_2", "坐地铁", "zuò dìtiě", "naik MRT"),
            MatchPairItem("u22_s5_p2_m3", "打电话", "dǎ diànhuà", "menelepon"),
            MatchPairItem("u22_s5_p2_m4", "回家去", "huí jiā qù", "pulang rumah")
        )
    )
)
