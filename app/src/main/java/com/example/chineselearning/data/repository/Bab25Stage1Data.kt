package com.example.chineselearning.data.repository

import com.example.chineselearning.R
import com.example.chineselearning.data.model.Exercise
import com.example.chineselearning.data.model.ExerciseType
import com.example.chineselearning.data.model.MatchPairItem
import com.example.chineselearning.data.model.PictureOption

val bab25Stage1Part1Exercises = listOf(
    // 1. Soal 1: Pilihan Gambar (运动 -> olahraga / berolahraga)
    Exercise(
        id = "u25_s1_p1_q1",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "运动",
        targetPinyin = "yùndòng",
        targetTranslation = "berolahraga / olahraga",
        correctAnswer = "berolahraga / olahraga",
        audioToSpeak = "运动",
        pictureOptions = listOf(
            PictureOption("u25_s1_p1_opt1", "olahraga", "", R.drawable.ic_sport_fitness, true),
            PictureOption("u25_s1_p1_opt2", "lari", "", R.drawable.ic_sport_running, false),
            PictureOption("u25_s1_p1_opt3", "sepak bola", "", R.drawable.ic_sport_soccer, false),
            PictureOption("u25_s1_p1_opt4", "renang", "", R.drawable.ic_sport_swim, false)
        )
    ),

    // 2. Soal 2: Susun Kalimat (Banyak berolahraga memiliki banyak manfaat bagi tubuh.)
    Exercise(
        id = "u25_s1_p1_q2",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Banyak olahraga baik untuk tubuh.",
        targetHanzi = "多 运动 对 身体 好。",
        targetPinyin = "Duō yùndòng duì shēntǐ hǎo.",
        wordChips = listOf("多:duō", "运动:yùndòng", "对:duì", "身体:shēntǐ", "好。:hǎo.", "少:shǎo"),
        correctAnswer = "多,运动,对,身体,好。",
        audioToSpeak = "多运动对身体好。"
    ),

    // 3. Soal 3: Ketuk Pasangan yang Sesuai (Olahraga & Lari)
    Exercise(
        id = "u25_s1_p1_q3",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u25_s1_p1_m1", "运动", "yùndòng", "olahraga"),
            MatchPairItem("u25_s1_p1_m2", "跑", "pǎo", "berlari"),
            MatchPairItem("u25_s1_p1_m3", "身体好", "shēntǐ hǎo", "tubuh sehat"),
            MatchPairItem("u25_s1_p1_m4", "飞快跑", "fēikuài pǎo", "lari kencang")
        )
    ),

    // 4. Soal 4: Ketik Pinyin (olahraga -> yùndòng)
    Exercise(
        id = "u25_s1_p1_q4",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "berolahraga / olahraga",
        sentenceWithBlank = "运动 (________)",
        targetHanzi = "运动",
        targetPinyin = "yùndòng",
        correctAnswer = "yundong",
        keyboardKeys = listOf("y", "u", "n", "d", "o", "g", "a", "e", "i", "b", "h", "j"),
        audioToSpeak = "运动"
    ),

    // 5. Soal 5: Mendengar Kalimat (Rule 10: illustrationRes = 0)
    Exercise(
        id = "u25_s1_p1_q5",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Apa yang Anda dengar?",
        targetTranslation = "Anjing kecil berlari sangat kencang di atas rumput.",
        targetHanzi = "小狗 飞快 地 跑。",
        targetPinyin = "Xiǎogǒu fēikuài de pǎo.",
        wordChips = listOf("小狗:xiǎogǒu", "飞快:fēikuài", "地:de", "跑。:pǎo.", "走:zǒu"),
        correctAnswer = "小狗,飞快,地,跑。",
        illustrationRes = 0,
        audioToSpeak = "小狗飞快地跑。"
    ),

    // 6. Soal 6: Pilihan Kalimat
    Exercise(
        id = "u25_s1_p1_q6",
        type = ExerciseType.SENTENCE_CHOICE,
        title = "Pilih terjemahan yang benar",
        targetHanzi = "你 喜欢 什么 运动？",
        targetPinyin = "Nǐ xǐhuan shénme yùndòng?",
        targetTranslation = "Kamu suka olahraga apa?",
        correctAnswer = "Nǐ xǐhuan shénme yùndòng?\n你 喜欢 什么 运动？",
        options = listOf(
            "Nǐ xǐhuan shénme yùndòng?\n你 喜欢 什么 运动？",
            "Nǐ xǐhuan shénme yánsè?\n你 喜欢 什么 颜色？",
            "Tā xǐhuan shénme yùndòng?\n他 喜欢 什么 运动？"
        ),
        audioToSpeak = "你喜欢什么运动？"
    ),

    // 7. Soal 7: Pilihan Gambar (跑 -> berlari)
    Exercise(
        id = "u25_s1_p1_q7",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "跑",
        targetPinyin = "pǎo",
        targetTranslation = "berlari",
        correctAnswer = "berlari",
        audioToSpeak = "跑",
        pictureOptions = listOf(
            PictureOption("u25_s1_p1_opt7_1", "lari", "", R.drawable.ic_sport_running, true),
            PictureOption("u25_s1_p1_opt7_2", "fitness", "", R.drawable.ic_sport_fitness, false),
            PictureOption("u25_s1_p1_opt7_3", "sepak bola", "", R.drawable.ic_sport_soccer, false),
            PictureOption("u25_s1_p1_opt7_4", "renang", "", R.drawable.ic_sport_swim, false)
        )
    ),

    // 8. Soal 8: Ketik Pinyin (berlari -> pǎo)
    Exercise(
        id = "u25_s1_p1_q8",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "lari / berlari",
        sentenceWithBlank = "跑 (________)",
        targetHanzi = "跑",
        targetPinyin = "pǎo",
        correctAnswer = "pao",
        keyboardKeys = listOf("p", "a", "o", "e", "i", "u", "b", "d", "g", "h", "j", "l"),
        audioToSpeak = "跑"
    ),

    // 9. Soal 9: Susun Kalimat (Dia berlari sangat cepat.)
    Exercise(
        id = "u25_s1_p1_q9",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Dia berlari sangat cepat.",
        targetHanzi = "他 跑 得 很 快。",
        targetPinyin = "Tā pǎo de hěn kuài.",
        wordChips = listOf("他:tā", "跑:pǎo", "得:de", "很:hěn", "快。:kuài.", "慢:màn"),
        correctAnswer = "他,跑,得,很,快。",
        audioToSpeak = "他跑得很快。"
    ),

    // 10. Soal 10: Ketuk Pasangan yang Sesuai (Rangkuman Lari & Olahraga)
    Exercise(
        id = "u25_s1_p1_m10",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u25_s1_p1_m10_1", "运动", "yùndòng", "olahraga"),
            MatchPairItem("u25_s1_p1_m10_2", "跑得快", "pǎo de kuài", "lari kencang"),
            MatchPairItem("u25_s1_p1_m10_3", "做运动", "zuò yùndòng", "berolahraga"),
            MatchPairItem("u25_s1_p1_m10_4", "跑步", "pǎobù", "jogging")
        )
    )
)

val bab25Stage1Part2Exercises = listOf(
    // 1. Soal 1: Pilihan Gambar (跑步 -> jogging / lari santai)
    Exercise(
        id = "u25_s1_p2_q1",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "跑步",
        targetPinyin = "pǎobù",
        targetTranslation = "berlari santai / jogging",
        correctAnswer = "berlari santai / jogging",
        audioToSpeak = "跑步",
        pictureOptions = listOf(
            PictureOption("u25_s1_p2_opt1", "jogging", "", R.drawable.ic_sport_running, true),
            PictureOption("u25_s1_p2_opt2", "basket", "", R.drawable.ic_sport_basketball, false),
            PictureOption("u25_s1_p2_opt3", "renang", "", R.drawable.ic_sport_swim, false),
            PictureOption("u25_s1_p2_opt4", "sepak bola", "", R.drawable.ic_sport_soccer, false)
        )
    ),

    // 2. Soal 2: Susun Kalimat (Setiap pagi saya pergi ke taman untuk jogging.)
    Exercise(
        id = "u25_s1_p2_q2",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Tiap pagi saya ke taman jogging.",
        targetHanzi = "早晨 我 去 公园 跑步。",
        targetPinyin = "Zǎochén wǒ qù gōngyuán pǎobù.",
        wordChips = listOf("早晨:zǎochén", "我:wǒ", "去:qù", "公园:gōngyuán", "跑步。:pǎobù.", "睡觉:shuìjiào"),
        correctAnswer = "早晨,我,去,公园,跑步。",
        audioToSpeak = "早晨我去公园跑步。"
    ),

    // 3. Soal 3: Ketuk Pasangan yang Sesuai (Jogging Pagi)
    Exercise(
        id = "u25_s1_p2_m3",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u25_s1_p2_m1", "跑步", "pǎobù", "jogging"),
            MatchPairItem("u25_s1_p2_m2", "早晨", "zǎochén", "pagi hari"),
            MatchPairItem("u25_s1_p2_m3", "公园", "gōngyuán", "taman"),
            MatchPairItem("u25_s1_p2_m4", "每天跑", "měitiān pǎo", "lari tiap hari")
        )
    ),

    // 4. Soal 4: Ketik Pinyin (jogging -> pǎobù)
    Exercise(
        id = "u25_s1_p2_q4",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "berlari santai / jogging",
        sentenceWithBlank = "跑步 (________)",
        targetHanzi = "跑步",
        targetPinyin = "pǎobù",
        correctAnswer = "paobu",
        keyboardKeys = listOf("p", "a", "o", "b", "u", "e", "i", "d", "g", "h", "j", "l"),
        audioToSpeak = "跑步"
    ),

    // 5. Soal 5: Mendengar Kalimat (Rule 10: illustrationRes = 0)
    Exercise(
        id = "u25_s1_p2_q5",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Apa yang Anda dengar?",
        targetTranslation = "Saya suka jogging bersama teman.",
        targetHanzi = "我 喜欢 和 朋友 跑步。",
        targetPinyin = "Wǒ xǐhuan hé péngyou pǎobù.",
        wordChips = listOf("我:wǒ", "喜欢:xǐhuan", "和:hé", "朋友:péngyou", "跑步。:pǎobù.", "游泳:yóuyǒng"),
        correctAnswer = "我,喜欢,和,朋友,跑步。",
        illustrationRes = 0,
        audioToSpeak = "我喜欢和朋友跑步。"
    ),

    // 6. Soal 6: Pilihan Kalimat
    Exercise(
        id = "u25_s1_p2_q6",
        type = ExerciseType.SENTENCE_CHOICE,
        title = "Pilih terjemahan yang benar",
        targetHanzi = "跑步 能 让 身体 更 健康。",
        targetPinyin = "Pǎobù néng ràng shēntǐ gèng jiànkāng.",
        targetTranslation = "Jogging dapat membuat tubuh lebih sehat.",
        correctAnswer = "Pǎobù néng ràng shēntǐ gèng jiànkāng.\n跑步 能 让 身体 更 健康。",
        options = listOf(
            "Pǎobù néng ràng shēntǐ gèng jiànkāng.\n跑步 能 让 身体 更 健康。",
            "Pǎobù néng ràng shēntǐ gèng lèi.\n跑步 能 让 身体 更 累。",
            "Shuìjiào néng ràng shēntǐ gèng jiànkāng.\n睡觉 能 让 身体 更 健康。"
        ),
        audioToSpeak = "跑步能让身体更健康。"
    ),

    // 7. Soal 7: Pilihan Gambar (跑步 -> olahraga lari)
    Exercise(
        id = "u25_s1_p2_q7",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "跑步",
        targetPinyin = "pǎobù",
        targetTranslation = "lari santai",
        correctAnswer = "lari santai",
        audioToSpeak = "跑步",
        pictureOptions = listOf(
            PictureOption("u25_s1_p2_opt7_1", "jogging", "", R.drawable.ic_sport_running, true),
            PictureOption("u25_s1_p2_opt7_2", "sepak bola", "", R.drawable.ic_sport_soccer, false),
            PictureOption("u25_s1_p2_opt7_3", "basket", "", R.drawable.ic_sport_basketball, false),
            PictureOption("u25_s1_p2_opt7_4", "renang", "", R.drawable.ic_sport_swim, false)
        )
    ),

    // 8. Soal 8: Ketik Pinyin (taman -> gōngyuán)
    Exercise(
        id = "u25_s1_p2_q8",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "taman",
        sentenceWithBlank = "公园 (________)",
        targetHanzi = "公园",
        targetPinyin = "gōngyuán",
        correctAnswer = "gongyuan",
        keyboardKeys = listOf("g", "o", "n", "y", "u", "a", "e", "i", "b", "d", "h", "j"),
        audioToSpeak = "公园"
    ),

    // 9. Soal 9: Susun Kalimat (Kami berlari selama tiga puluh menit.)
    Exercise(
        id = "u25_s1_p2_q9",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Kami lari selama 30 menit.",
        targetHanzi = "我们 跑 了 三十 分钟。",
        targetPinyin = "Wǒmen pǎo le sānshí fēnzhōng.",
        wordChips = listOf("我们:wǒmen", "跑:pǎo", "了:le", "三十:sānshí", "分钟。:fēnzhōng.", "小时:xiǎoshí"),
        correctAnswer = "我们,跑,了,三十,分钟。",
        audioToSpeak = "我们跑了三十分钟。"
    ),

    // 10. Soal 10: Ketuk Pasangan yang Sesuai (Rangkuman Rutinitas Jogging)
    Exercise(
        id = "u25_s1_p2_m10",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u25_s1_p2_m10_1", "跑步", "pǎobù", "jogging"),
            MatchPairItem("u25_s1_p2_m2", "三十分钟", "sānshí fēnzhōng", "30 menit"),
            MatchPairItem("u25_s1_p2_m3", "更健康", "gèng jiànkāng", "lebih sehat"),
            MatchPairItem("u25_s1_p2_m4", "好习惯", "hǎo xíguàn", "kebiasaan baik")
        )
    )
)
