package com.example.chineselearning.data.repository

import com.example.chineselearning.R
import com.example.chineselearning.data.model.Exercise
import com.example.chineselearning.data.model.ExerciseType
import com.example.chineselearning.data.model.MatchPairItem
import com.example.chineselearning.data.model.PictureOption

val bab22Stage1Part1Exercises = listOf(
    // 1. Soal 1: Pilihan Gambar (公交车 -> bus umum)
    Exercise(
        id = "u22_s1_p1_q1",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "公交车",
        targetPinyin = "gōngjiāochē",
        targetTranslation = "bus umum",
        correctAnswer = "bus umum",
        audioToSpeak = "公交车",
        pictureOptions = listOf(
            PictureOption("u22_s1_p1_opt1", "bus umum", "", R.drawable.ic_trans_car, true),
            PictureOption("u22_s1_p1_opt2", "taksi", "", R.drawable.ic_trans_taxi, false),
            PictureOption("u22_s1_p1_opt3", "kereta", "", R.drawable.ic_trans_train, false),
            PictureOption("u22_s1_p1_opt4", "stasiun", "", R.drawable.ic_trans_train_station, false)
        )
    ),

    // 2. Soal 2: Susun Kalimat (Naik bus umum ke sekolah hanya butuh dua yuan.)
    Exercise(
        id = "u22_s1_p1_q2",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Naik bus ke sekolah hanya dua yuan.",
        targetHanzi = "坐 公交车 去 学校 只要 两 块 钱。",
        targetPinyin = "Zuò gōngjiāochē qù xuéxiào zhǐyào liǎng kuài qián.",
        wordChips = listOf("坐:zuò", "公交车:gōngjiāochē", "去:qù", "学校:xuéxiào", "只要:zhǐyào", "两:liǎng", "块:kuài", "钱。:qián.", "地铁:dìtiě"),
        correctAnswer = "坐,公交车,去,学校,只要,两,块,钱。",
        audioToSpeak = "坐公交车去学校只要两块钱。"
    ),

    // 3. Soal 3: Ketuk Pasangan yang Sesuai (Bus & MRT)
    Exercise(
        id = "u22_s1_p1_q3",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u22_s1_p1_m1", "公交车", "gōngjiāochē", "bus umum"),
            MatchPairItem("u22_s1_p1_m2", "地铁", "dìtiě", "MRT / kereta bawah tanah"),
            MatchPairItem("u22_s1_p1_m3", "坐地铁", "zuò dìtiě", "naik MRT"),
            MatchPairItem("u22_s1_p1_m4", "方便", "fāngbiàn", "praktis / nyaman")
        )
    ),

    // 4. Soal 4: Ketik Pinyin (bus umum -> gōngjiāochē)
    Exercise(
        id = "u22_s1_p1_q4",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "bus umum",
        sentenceWithBlank = "公交车 (________)",
        targetHanzi = "公交车",
        targetPinyin = "gōngjiāochē",
        correctAnswer = "gongjiaoche",
        keyboardKeys = listOf("g", "o", "n", "j", "i", "a", "c", "h", "e", "u", "b", "d"),
        audioToSpeak = "公交车"
    ),

    // 5. Soal 5: Mendengar Kalimat (Rule 10: illustrationRes = 0)
    Exercise(
        id = "u22_s1_p1_q5",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Apa yang Anda dengar?",
        targetTranslation = "Naik MRT ke bandara cepat dan praktis.",
        targetHanzi = "坐 地铁 去 机场 又 快 又 方便。",
        targetPinyin = "Zuò dìtiě qù jīchǎng yòu kuài yòu fāngbiàn.",
        wordChips = listOf("坐:zuò", "地铁:dìtiě", "去:qù", "机场:jīchǎng", "又:yòu", "快:kuài", "方便。:fāngbiàn.", "公交车:gōngjiāochē"),
        correctAnswer = "坐,地铁,去,机场,又,快,又,方便。",
        illustrationRes = 0,
        audioToSpeak = "坐地铁去机场又快又方便。"
    ),

    // 6. Soal 6: Pilihan Kalimat
    Exercise(
        id = "u22_s1_p1_q6",
        type = ExerciseType.SENTENCE_CHOICE,
        title = "Pilih terjemahan yang benar",
        targetHanzi = "北京 的 地铁 非常 快。",
        targetPinyin = "Běijīng de dìtiě fēicháng kuài.",
        targetTranslation = "MRT Beijing sangat cepat.",
        correctAnswer = "Běijīng de dìtiě fēicháng kuài.\n北京 的 地铁 非常 快。",
        options = listOf(
            "Běijīng de dìtiě fēicháng kuài.\n北京 的 地铁 非常 快。",
            "Běijīng de gōngjiāochē fēicháng kuài.\n北京 的 公交车 非常 快。",
            "Shànghǎi de dìtiě fēicháng kuài.\n上海 的 地铁 非常 快。"
        ),
        audioToSpeak = "北京的地铁非常快。"
    ),

    // 7. Soal 7: Pilihan Gambar (地铁 -> MRT)
    Exercise(
        id = "u22_s1_p1_q7",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "地铁",
        targetPinyin = "dìtiě",
        targetTranslation = "kereta bawah tanah / MRT",
        correctAnswer = "kereta bawah tanah / MRT",
        audioToSpeak = "地铁",
        pictureOptions = listOf(
            PictureOption("u22_s1_p1_opt7_1", "MRT", "", R.drawable.ic_trans_train, true),
            PictureOption("u22_s1_p1_opt7_2", "bus", "", R.drawable.ic_trans_car, false),
            PictureOption("u22_s1_p1_opt7_3", "taksi", "", R.drawable.ic_trans_taxi, false),
            PictureOption("u22_s1_p1_opt7_4", "stasiun", "", R.drawable.ic_trans_train_station, false)
        )
    ),

    // 8. Soal 8: Ketik Pinyin (MRT -> dìtiě)
    Exercise(
        id = "u22_s1_p1_q8",
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

    // 9. Soal 9: Susun Kalimat (Saya setiap hari naik bus pergi bekerja.)
    Exercise(
        id = "u22_s1_p1_q9",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Saya setiap hari naik bus kerja.",
        targetHanzi = "我 每天 坐 公交车 上班。",
        targetPinyin = "Wǒ měitiān zuò gōngjiāochē shàngbān.",
        wordChips = listOf("我:wǒ", "每天:měitiān", "坐:zuò", "公交车:gōngjiāochē", "上班。:shàngbān.", "下班:xiàbān"),
        correctAnswer = "我,每天,坐,公交车,上班。",
        audioToSpeak = "我每天坐公交车上班。"
    ),

    // 10. Soal 10: Ketuk Pasangan yang Sesuai (Rangkuman Angkutan Transit)
    Exercise(
        id = "u22_s1_p1_m10",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u22_s1_p1_m10_1", "公交车", "gōngjiāochē", "bus kota"),
            MatchPairItem("u22_s1_p1_m10_2", "地铁", "dìtiě", "MRT"),
            MatchPairItem("u22_s1_p1_m10_3", "飞快", "fēikuài", "sangat cepat"),
            MatchPairItem("u22_s1_p1_m10_4", "上班", "shàngbān", "pergi kerja")
        )
    )
)

val bab22Stage1Part2Exercises = listOf(
    // 1. Soal 1: Pilihan Gambar (车站 -> halte / stasiun bus)
    Exercise(
        id = "u22_s1_p2_q1",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "车站",
        targetPinyin = "chēzhàn",
        targetTranslation = "halte / stasiun",
        correctAnswer = "halte / stasiun",
        audioToSpeak = "车站",
        pictureOptions = listOf(
            PictureOption("u22_s1_p2_opt1", "halte", "", R.drawable.ic_place_station, true),
            PictureOption("u22_s1_p2_opt2", "bus", "", R.drawable.ic_trans_car, false),
            PictureOption("u22_s1_p2_opt3", "taksi", "", R.drawable.ic_trans_taxi, false),
            PictureOption("u22_s1_p2_opt4", "kereta", "", R.drawable.ic_trans_train, false)
        )
    ),

    // 2. Soal 2: Susun Kalimat (Kami menunggumu di halte bus.)
    Exercise(
        id = "u22_s1_p2_q2",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Kami menunggumu di halte bus.",
        targetHanzi = "我们 在 车站 等 你。",
        targetPinyin = "Wǒmen zài chēzhàn děng nǐ.",
        wordChips = listOf("我们:wǒmen", "在:zài", "车站:chēzhàn", "等:děng", "你。:nǐ.", "看:kàn"),
        correctAnswer = "我们,在,车站,等,你。",
        audioToSpeak = "我们在车站等你。"
    ),

    // 3. Soal 3: Ketuk Pasangan yang Sesuai (Halte & Perhentian Stasiun)
    Exercise(
        id = "u22_s1_p2_m3",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u22_s1_p2_m1", "车站", "chēzhàn", "halte / stasiun"),
            MatchPairItem("u22_s1_p2_m2", "站", "zhàn", "perhentian halte"),
            MatchPairItem("u22_s1_p2_m3", "下一站", "xià yí zhàn", "halte berikutnya"),
            MatchPairItem("u22_s1_p2_m4", "等你", "děng nǐ", "menunggumu")
        )
    ),

    // 4. Soal 4: Ketik Pinyin (halte/stasiun -> chēzhàn)
    Exercise(
        id = "u22_s1_p2_q4",
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

    // 5. Soal 5: Mendengar Kalimat (Rule 10: illustrationRes = 0)
    Exercise(
        id = "u22_s1_p2_q5",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Apa yang Anda dengar?",
        targetTranslation = "Perhentian berikutnya adalah pusat kota.",
        targetHanzi = "下 一 站 是 市中心。",
        targetPinyin = "Xià yí zhàn shì shìzhōngxīn.",
        wordChips = listOf("下:xià", "一:yí", "站:zhàn", "是:shì", "市中心。:shìzhōngxīn.", "学校:xuéxiào"),
        correctAnswer = "下,一,站,是,市中心。",
        illustrationRes = 0,
        audioToSpeak = "下一站是市中心。"
    ),

    // 6. Soal 6: Pilihan Kalimat
    Exercise(
        id = "u22_s1_p2_q6",
        type = ExerciseType.SENTENCE_CHOICE,
        title = "Pilih terjemahan yang benar",
        targetHanzi = "去 机场 还 要 坐 几 站？",
        targetPinyin = "Qù jīchǎng hái yào zuò jǐ zhàn?",
        targetTranslation = "Pergi ke bandara masih harus naik berapa perhentian halte?",
        correctAnswer = "Qù jīchǎng hái yào zuò jǐ zhàn?\n去 机场 还 要 坐 几 站？",
        options = listOf(
            "Qù jīchǎng hái yào zuò jǐ zhàn?\n去 机场 还 要 坐 几 站？",
            "Qù xuéxiào hái yào zuò jǐ zhàn?\n去 学校 还 要 坐 几 站？",
            "Qù yīyuàn hái yào zuò jǐ zhàn?\n去 医院 还 要 坐 几 站？"
        ),
        audioToSpeak = "去机场还要坐几站？"
    ),

    // 7. Soal 7: Pilihan Gambar (站 -> perhentian halte)
    Exercise(
        id = "u22_s1_p2_q7",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "站",
        targetPinyin = "zhàn",
        targetTranslation = "stasiun / halte",
        correctAnswer = "stasiun / halte",
        audioToSpeak = "站",
        pictureOptions = listOf(
            PictureOption("u22_s1_p2_opt7_1", "halte", "", R.drawable.ic_place_station, true),
            PictureOption("u22_s1_p2_opt2", "kereta", "", R.drawable.ic_trans_train, false),
            PictureOption("u22_s1_p2_opt3", "mobil", "", R.drawable.ic_trans_car, false),
            PictureOption("u22_s1_p2_opt4", "taksi", "", R.drawable.ic_trans_taxi, false)
        )
    ),

    // 8. Soal 8: Ketik Pinyin (stasiun/halte -> zhàn)
    Exercise(
        id = "u22_s1_p2_q8",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "stasiun / halte",
        sentenceWithBlank = "站 (________)",
        targetHanzi = "站",
        targetPinyin = "zhàn",
        correctAnswer = "zhan",
        keyboardKeys = listOf("z", "h", "a", "n", "e", "i", "o", "u", "b", "d", "g", "j"),
        audioToSpeak = "站"
    ),

    // 9. Soal 9: Susun Kalimat (Masih ada tiga halte lagi.)
    Exercise(
        id = "u22_s1_p2_q9",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Masih ada tiga halte lagi.",
        targetHanzi = "还有 三 站 路。",
        targetPinyin = "Hái yǒu sān zhàn lù.",
        wordChips = listOf("还有:hái yǒu", "三:sān", "站:zhàn", "路。:lù.", "四:sì"),
        correctAnswer = "还有,三,站,路。",
        audioToSpeak = "还有三站路。"
    ),

    // 10. Soal 10: Ketuk Pasangan yang Sesuai (Rangkuman Halte & Stasiun)
    Exercise(
        id = "u22_s1_p2_m10",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u22_s1_p2_m10_1", "车站", "chēzhàn", "halte"),
            MatchPairItem("u22_s1_p2_m10_2", "下一站", "xià yí zhàn", "halte berikut"),
            MatchPairItem("u22_s1_p2_m10_3", "坐三站", "zuò sān zhàn", "naik 3 halte"),
            MatchPairItem("u22_s1_p2_m10_4", "到站", "dào zhàn", "tiba di halte")
        )
    )
)
