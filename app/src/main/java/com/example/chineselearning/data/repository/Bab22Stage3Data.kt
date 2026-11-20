package com.example.chineselearning.data.repository

import com.example.chineselearning.R
import com.example.chineselearning.data.model.Exercise
import com.example.chineselearning.data.model.ExerciseType
import com.example.chineselearning.data.model.MatchPairItem
import com.example.chineselearning.data.model.PictureOption

val bab22Stage3Part1Exercises = listOf(
    // 1. Soal 1: Pilihan Gambar (路 -> jalan / rute)
    Exercise(
        id = "u22_s3_p1_q1",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "路",
        targetPinyin = "lù",
        targetTranslation = "jalan / rute",
        correctAnswer = "jalan / rute",
        audioToSpeak = "路",
        pictureOptions = listOf(
            PictureOption("u22_s3_p1_opt1", "jalan", "", R.drawable.ic_pos_front, true),
            PictureOption("u22_s3_p1_opt2", "mobil", "", R.drawable.ic_trans_car, false),
            PictureOption("u22_s3_p1_opt3", "stasiun", "", R.drawable.ic_place_station, false),
            PictureOption("u22_s3_p1_opt4", "gedung", "", R.drawable.ic_work_office_building, false)
        )
    ),

    // 2. Soal 2: Susun Kalimat (Mobil di jalan ini sangat banyak.)
    Exercise(
        id = "u22_s3_p1_q2",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Mobil di jalan ini sangat banyak.",
        targetHanzi = "这条 路 上的 车 非常 多。",
        targetPinyin = "Zhè tiáo lù shang de chē fēicháng duō.",
        wordChips = listOf("这条:zhè tiáo", "路:lù", "上的:shang de", "车:chē", "非常:fēicháng", "多。:duō.", "少:shǎo"),
        correctAnswer = "这条,路,上的,车,非常,多。",
        audioToSpeak = "这条路上的车非常多。"
    ),

    // 3. Soal 3: Ketuk Pasangan yang Sesuai (Jalan Raya)
    Exercise(
        id = "u22_s3_p1_q3",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u22_s3_p1_m1", "路", "lù", "jalan"),
            MatchPairItem("u22_s3_p1_m2", "大路", "dà lù", "jalan raya besar"),
            MatchPairItem("u22_s3_p1_m3", "迷路", "mí lù", "tersesat jalan"),
            MatchPairItem("u22_s3_p1_m4", "很多车", "hěn duō chē", "banyak mobil")
        )
    ),

    // 4. Soal 4: Ketik Pinyin (jalan -> lù)
    Exercise(
        id = "u22_s3_p1_q4",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "jalan / rute",
        sentenceWithBlank = "路 (________)",
        targetHanzi = "路",
        targetPinyin = "lù",
        correctAnswer = "lu",
        keyboardKeys = listOf("l", "u", "a", "e", "i", "o", "b", "d", "g", "h", "j", "m"),
        audioToSpeak = "路"
    ),

    // 5. Soal 5: Mendengar Kalimat (Rule 10: illustrationRes = 0)
    Exercise(
        id = "u22_s3_p1_q5",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Apa yang Anda dengar?",
        targetTranslation = "Di depan ada sebuah jalan yang sangat lebar.",
        targetHanzi = "前面 有 一 条 大 路。",
        targetPinyin = "Qiánmiàn yǒu yì tiáo dà lù.",
        wordChips = listOf("前面:qiánmiàn", "有:yǒu", "一:yì", "条:tiáo", "大:dà", "路。:lù.", "后面:hòumiàn"),
        correctAnswer = "前面,有,一,条,大,路。",
        illustrationRes = 0,
        audioToSpeak = "前面有一条大路。"
    ),

    // 6. Soal 6: Pilihan Kalimat
    Exercise(
        id = "u22_s3_p1_q6",
        type = ExerciseType.SENTENCE_CHOICE,
        title = "Pilih terjemahan yang benar",
        targetHanzi = "去 饭馆 走 哪条 路？",
        targetPinyin = "Qù fànguǎn zǒu nǎ tiáo lù?",
        targetTranslation = "Pergi ke restoran lewat jalan yang mana?",
        correctAnswer = "Qù fànguǎn zǒu nǎ tiáo lù?\n去 饭馆 走 哪条 路？",
        options = listOf(
            "Qù fànguǎn zǒu nǎ tiáo lù?\n去 饭馆 走 哪条 路？",
            "Qù xuéxiào zǒu nǎ tiáo lù?\n去 学校 走 哪条 路？",
            "Qù yīyuàn zǒu nǎ tiáo lù?\n去 医院 走 哪条 路？"
        ),
        audioToSpeak = "去饭馆走哪条路？"
    ),

    // 7. Soal 7: Pilihan Gambar (大路 -> jalan raya)
    Exercise(
        id = "u22_s3_p1_q7",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "大路",
        targetPinyin = "dàlù",
        targetTranslation = "jalan raya",
        correctAnswer = "jalan raya",
        audioToSpeak = "大路",
        pictureOptions = listOf(
            PictureOption("u22_s3_p1_opt7_1", "jalan", "", R.drawable.ic_pos_front, true),
            PictureOption("u22_s3_p1_opt7_2", "mobil", "", R.drawable.ic_trans_car, false),
            PictureOption("u22_s3_p1_opt7_3", "gedung", "", R.drawable.ic_work_office_building, false),
            PictureOption("u22_s3_p1_opt7_4", "stasiun", "", R.drawable.ic_place_station, false)
        )
    ),

    // 8. Soal 8: Ketik Pinyin (jalan raya -> dàlù)
    Exercise(
        id = "u22_s3_p1_q8",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "jalan raya",
        sentenceWithBlank = "大路 (________)",
        targetHanzi = "大路",
        targetPinyin = "dàlù",
        correctAnswer = "dalu",
        keyboardKeys = listOf("d", "a", "l", "u", "e", "i", "o", "b", "g", "h", "j", "m"),
        audioToSpeak = "大路"
    ),

    // 9. Soal 9: Susun Kalimat (Jalan ini sangat bersih.)
    Exercise(
        id = "u22_s3_p1_q9",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Jalan ini sangat bersih.",
        targetHanzi = "这条 路 很 干净。",
        targetPinyin = "Zhè tiáo lù hěn gānjìng.",
        wordChips = listOf("这条:zhè tiáo", "路:lù", "很:hěn", "干净。:gānjìng.", "脏:zāng"),
        correctAnswer = "这条,路,很,干净。",
        audioToSpeak = "这条路很干净。"
    ),

    // 10. Soal 10: Ketuk Pasangan yang Sesuai (Rangkuman Kondisi Jalan)
    Exercise(
        id = "u22_s3_p1_m10",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u22_s3_p1_m10_1", "路", "lù", "jalan"),
            MatchPairItem("u22_s3_p1_m2", "大路", "dà lù", "jalan raya"),
            MatchPairItem("u22_s3_p1_m3", "干净路", "gānjìng lù", "jalan bersih"),
            MatchPairItem("u22_s3_p1_m4", "走哪条", "zǒu nǎ tiáo", "lewat mana")
        )
    )
)

val bab22Stage3Part2Exercises = listOf(
    // 1. Soal 1: Pilihan Gambar (路上 -> di jalan / dalam perjalanan)
    Exercise(
        id = "u22_s3_p2_q1",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "路上",
        targetPinyin = "lùshang",
        targetTranslation = "di jalan / dalam perjalanan",
        correctAnswer = "di jalan / dalam perjalanan",
        audioToSpeak = "路上",
        pictureOptions = listOf(
            PictureOption("u22_s3_p2_opt1", "di jalan", "", R.drawable.ic_pos_front, true),
            PictureOption("u22_s3_p2_opt2", "mobil", "", R.drawable.ic_trans_car, false),
            PictureOption("u22_s3_p2_opt3", "stasiun", "", R.drawable.ic_place_station, false),
            PictureOption("u22_s3_p2_opt4", "gedung", "", R.drawable.ic_work_office_building, false)
        )
    ),

    // 2. Soal 2: Susun Kalimat (Saya di tengah jalan bertemu dengan teman sekolah lama.)
    Exercise(
        id = "u22_s3_p2_q2",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Saya di jalan bertemu kawan lama.",
        targetHanzi = "我 在 路上 遇到 老 同学。",
        targetPinyin = "Wǒ zài lùshang yùdào lǎo tóngxué.",
        wordChips = listOf("我:wǒ", "在:zài", "路上:lùshang", "遇到:yùdào", "老:lǎo", "同学。:tóngxué.", "老师:lǎoshī"),
        correctAnswer = "我,在,路上,遇到,老,同学。",
        audioToSpeak = "我在路上遇到老同学。"
    ),

    // 3. Soal 3: Ketuk Pasangan yang Sesuai (Dalam Perjalanan)
    Exercise(
        id = "u22_s3_p2_m3",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u22_s3_p2_m1", "路上", "lùshang", "di jalan"),
            MatchPairItem("u22_s3_p2_m2", "小心", "xiǎoxīn", "hati-hati"),
            MatchPairItem("u22_s3_p2_m3", "遇到", "yùdào", "bertemu"),
            MatchPairItem("u22_s3_p2_m4", "堵车", "dǔchē", "macet jalan")
        )
    ),

    // 4. Soal 4: Ketik Pinyin (di jalan -> lùshang)
    Exercise(
        id = "u22_s3_p2_q4",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "di jalan / dalam perjalanan",
        sentenceWithBlank = "路上 (________)",
        targetHanzi = "路上",
        targetPinyin = "lùshang",
        correctAnswer = "lushang",
        keyboardKeys = listOf("l", "u", "s", "h", "a", "n", "g", "e", "i", "o", "b", "d"),
        audioToSpeak = "路上"
    ),

    // 5. Soal 5: Mendengar Kalimat (Rule 10: illustrationRes = 0)
    Exercise(
        id = "u22_s3_p2_q5",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Apa yang Anda dengar?",
        targetTranslation = "Hati-hati di jalan ya!",
        targetHanzi = "路上 小心 点儿！",
        targetPinyin = "Lùshang xiǎoxīn diǎnr!",
        wordChips = listOf("路上:lùshang", "小心:xiǎoxīn", "点儿！:diǎnr!", "快:kuài"),
        correctAnswer = "路上,小心,点儿！",
        illustrationRes = 0,
        audioToSpeak = "路上小心点儿！"
    ),

    // 6. Soal 6: Pilihan Kalimat
    Exercise(
        id = "u22_s3_p2_q6",
        type = ExerciseType.SENTENCE_CHOICE,
        title = "Pilih terjemahan yang benar",
        targetHanzi = "我 在 回家 的 路上。",
        targetPinyin = "Wǒ zài huíjiā de lùshang.",
        targetTranslation = "Saya sedang dalam perjalanan pulang ke rumah.",
        correctAnswer = "Wǒ zài huíjiā de lùshang.\n我 在 回家 的 路上。",
        options = listOf(
            "Wǒ zài huíjiā de lùshang.\n我 在 回家 的 路上。",
            "Wǒ zài qù xuéxiào de lùshang.\n我 在 去 学校 的 路上。",
            "Wǒ yǐjīng dào jiā le.\n我 已经 到 家 了。"
        ),
        audioToSpeak = "我在回家的路上。"
    ),

    // 7. Soal 7: Pilihan Gambar (路上小心 -> hati-hati di jalan)
    Exercise(
        id = "u22_s3_p2_q7",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "路上小心",
        targetPinyin = "lùshang xiǎoxīn",
        targetTranslation = "hati-hati di jalan",
        correctAnswer = "hati-hati di jalan",
        audioToSpeak = "路上小心",
        pictureOptions = listOf(
            PictureOption("u22_s3_p2_opt7_1", "di jalan", "", R.drawable.ic_pos_front, true),
            PictureOption("u22_s3_p2_opt7_2", "mobil", "", R.drawable.ic_trans_car, false),
            PictureOption("u22_s3_p2_opt7_3", "stasiun", "", R.drawable.ic_place_station, false),
            PictureOption("u22_s3_p2_opt7_4", "gedung", "", R.drawable.ic_work_office_building, false)
        )
    ),

    // 8. Soal 8: Ketik Pinyin (hati-hati -> xiǎoxīn)
    Exercise(
        id = "u22_s3_p2_q8",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "hati-hati",
        sentenceWithBlank = "小心 (________)",
        targetHanzi = "小心",
        targetPinyin = "xiǎoxīn",
        correctAnswer = "xiaoxin",
        keyboardKeys = listOf("x", "i", "a", "o", "n", "e", "u", "b", "d", "g", "h", "j"),
        audioToSpeak = "小心"
    ),

    // 9. Soal 9: Susun Kalimat (Di jalan mobil sangat padat macet.)
    Exercise(
        id = "u22_s3_p2_q9",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Mobil di jalan sangat banyak.",
        targetHanzi = "路上 车 很多。",
        targetPinyin = "Lùshang chē hěn duō.",
        wordChips = listOf("路上:lùshang", "车:chē", "很多。:hěn duō.", "很少:hěn shǎo"),
        correctAnswer = "路上,车,很多。",
        audioToSpeak = "路上车很多。"
    ),

    // 10. Soal 10: Ketuk Pasangan yang Sesuai (Rangkuman Perjalanan Jalan)
    Exercise(
        id = "u22_s3_p2_m10",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u22_s3_p2_m10_1", "路上", "lùshang", "di jalan"),
            MatchPairItem("u22_s3_p2_m10_2", "回家路上", "huíjiā lùshang", "jalan pulang"),
            MatchPairItem("u22_s3_p2_m10_3", "路上小心", "lùshang xiǎoxīn", "hati-hati jalan"),
            MatchPairItem("u22_s3_p2_m10_4", "很多车", "hěn duō chē", "banyak mobil")
        )
    )
)
