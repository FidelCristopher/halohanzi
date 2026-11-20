package com.example.chineselearning.data.repository

import com.example.chineselearning.R
import com.example.chineselearning.data.model.Exercise
import com.example.chineselearning.data.model.ExerciseType
import com.example.chineselearning.data.model.MatchPairItem
import com.example.chineselearning.data.model.PictureOption

val bab28Stage4Part1Exercises = listOf(
    // 1. Soal 1: Pilihan Gambar (经常 -> sering / kerap kali)
    Exercise(
        id = "u28_s4_p1_q1",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "经常",
        targetPinyin = "jīngcháng",
        targetTranslation = "sering / kerap kali",
        correctAnswer = "sering / kerap kali",
        audioToSpeak = "经常",
        pictureOptions = listOf(
            PictureOption("u28_s4_p1_opt1", "sering", "", R.drawable.ic_gram_manner_so_much, true),
            PictureOption("u28_s4_p1_opt2", "waktu masa depan", "", R.drawable.ic_gram_timeline_future, false),
            PictureOption("u28_s4_p1_opt3", "derajat", "", R.drawable.ic_gram_degree_speedometer, false),
            PictureOption("u28_s4_p1_opt4", "skala", "", R.drawable.ic_gram_compare_scale, false)
        )
    ),

    // 2. Soal 2: Susun Kalimat (Akhir pekan saya sering pergi ke perpustakaan membaca buku.)
    Exercise(
        id = "u28_s4_p1_q2",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Akhir pekan saya sering ke perpustakaan.",
        targetHanzi = "周末 我 经常 去 图书馆。",
        targetPinyin = "Zhōumò wǒ jīngcháng qù túshūguǎn.",
        wordChips = listOf("周末:zhōumò", "我:wǒ", "经常:jīngcháng", "去:qù", "图书馆。:túshūguǎn.", "不:bù"),
        correctAnswer = "周末,我,经常,去,图书馆。",
        audioToSpeak = "周末我经常去图书馆。"
    ),

    // 3. Soal 3: Ketuk Pasangan yang Sesuai (Sering & Terkadang)
    Exercise(
        id = "u28_s4_p1_q3",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u28_s4_p1_m1", "经常", "jīngcháng", "sering"),
            MatchPairItem("u28_s4_p1_m2", "有时", "yǒushí", "kadang-kadang"),
            MatchPairItem("u28_s4_p1_m3", "看书", "kànshū", "baca buku"),
            MatchPairItem("u28_s4_p1_m4", "不常", "bù cháng", "jarang")
        )
    ),

    // 4. Soal 4: Ketik Pinyin (sering -> jīngcháng)
    Exercise(
        id = "u28_s4_p1_q4",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "sering / kerap kali",
        sentenceWithBlank = "经常 (________)",
        targetHanzi = "经常",
        targetPinyin = "jīngcháng",
        correctAnswer = "jingchang",
        keyboardKeys = listOf("j", "i", "n", "g", "c", "h", "a", "e", "o", "u", "b", "d"),
        audioToSpeak = "经常"
    ),

    // 5. Soal 5: Mendengar Kalimat (Rule 10: illustrationRes = 0)
    Exercise(
        id = "u28_s4_p1_q5",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Apa yang Anda dengar?",
        targetTranslation = "Dia kadang-kadang jogging, kadang-kadang berenang.",
        targetHanzi = "他 有时 跑步， 有时 游泳。",
        targetPinyin = "Tā yǒushí pǎobù, yǒushí yóuyǒng.",
        wordChips = listOf("他:tā", "有时:yǒushí", "跑步，:pǎobù,", "有时:yǒushí", "游泳。:yóuyǒng.", "睡觉:shuìjiào"),
        correctAnswer = "他,有时,跑步，,有时,游泳。",
        illustrationRes = 0,
        audioToSpeak = "他有时跑步，有时游泳。"
    ),

    // 6. Soal 6: Pilihan Kalimat
    Exercise(
        id = "u28_s4_p1_q6",
        type = ExerciseType.SENTENCE_CHOICE,
        title = "Pilih terjemahan yang benar",
        targetHanzi = "我 经常 和 同学 练习 口语。",
        targetPinyin = "Wǒ jīngcháng hé tóngxué liànxí kǒuyǔ.",
        targetTranslation = "Saya sering berlatih percakapan bersama teman sekelas.",
        correctAnswer = "Wǒ jīngcháng hé tóngxué liànxí kǒuyǔ.\n我 经常 和 同学 练习 口语。",
        options = listOf(
            "Wǒ jīngcháng hé tóngxué liànxí kǒuyǔ.\n我 经常 和 同学 练习 口语。",
            "Wǒ bù cháng hé tóngxué liànxí kǒuyǔ.\n我 不 常 和 同学 练习 口语。",
            "Tā jīngcháng hé lǎoshī liànxí kǒuyǔ.\n他 经常 和 老师 练习 口语。"
        ),
        audioToSpeak = "我经常和同学练习口语。"
    ),

    // 7. Soal 7: Pilihan Gambar (有时 -> terkadang kadang-kadang)
    Exercise(
        id = "u28_s4_p1_q7",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "有时",
        targetPinyin = "yǒushí",
        targetTranslation = "terkadang / kadang-kadang",
        correctAnswer = "terkadang / kadang-kadang",
        audioToSpeak = "有时",
        pictureOptions = listOf(
            PictureOption("u28_s4_p1_opt7_1", "kadang-kadang", "", R.drawable.ic_gram_manner_so_much, true),
            PictureOption("u28_s4_p1_opt7_2", "waktu", "", R.drawable.ic_gram_timeline_future, false),
            PictureOption("u28_s4_p1_opt7_3", "kecepatan", "", R.drawable.ic_gram_degree_speedometer, false),
            PictureOption("u28_s4_p1_opt7_4", "skala", "", R.drawable.ic_gram_compare_scale, false)
        )
    ),

    // 8. Soal 8: Ketik Pinyin (kadang-kadang -> yǒushí)
    Exercise(
        id = "u28_s4_p1_q8",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "kadang-kadang / terkadang",
        sentenceWithBlank = "有时 (________)",
        targetHanzi = "有时",
        targetPinyin = "yǒushí",
        correctAnswer = "youshi",
        keyboardKeys = listOf("y", "o", "u", "s", "h", "i", "a", "e", "b", "d", "g", "j"),
        audioToSpeak = "有时"
    ),

    // 9. Soal 9: Susun Kalimat (Ibu sering memasak masakan lezat untuk kami.)
    Exercise(
        id = "u28_s4_p1_q9",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Ibu sering memasak untuk kami.",
        targetHanzi = "妈妈 经常 做 好吃 的。",
        targetPinyin = "Māma jīngcháng zuò hǎochī de.",
        wordChips = listOf("妈妈:māma", "经常:jīngcháng", "做:zuò", "好吃:hǎochī", "的。:de.", "不:bù"),
        correctAnswer = "妈妈,经常,做,好吃,的。",
        audioToSpeak = "妈妈经常做好吃的。"
    ),

    // 10. Soal 10: Ketuk Pasangan yang Sesuai (Rangkuman Frekuensi)
    Exercise(
        id = "u28_s4_p1_m10",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u28_s4_p1_m10_1", "经常", "jīngcháng", "kerap kali"),
            MatchPairItem("u28_s4_p1_m10_2", "有时", "yǒushí", "sewaktu-waktu"),
            MatchPairItem("u28_s4_p1_m3", "练口语", "liàn kǒuyǔ", "latihan bicara"),
            MatchPairItem("u28_s4_p1_m4", "去超市", "qù chāoshì", "ke supermarket")
        )
    )
)

val bab28Stage4Part2Exercises = listOf(
    // 1. Soal 1: Pilihan Gambar (一会儿 -> sebentar / sejenak)
    Exercise(
        id = "u28_s4_p2_q1",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "一会儿",
        targetPinyin = "yíhuìér",
        targetTranslation = "sebentar / sejenak",
        correctAnswer = "sebentar / sejenak",
        audioToSpeak = "一会儿",
        pictureOptions = listOf(
            PictureOption("u28_s4_p2_opt1", "sebentar", "", R.drawable.ic_gram_timeline_future, true),
            PictureOption("u28_s4_p2_opt2", "sering", "", R.drawable.ic_gram_manner_so_much, false),
            PictureOption("u28_s4_p2_opt3", "derajat", "", R.drawable.ic_gram_degree_speedometer, false),
            PictureOption("u28_s4_p2_opt4", "skala", "", R.drawable.ic_gram_compare_scale, false)
        )
    ),

    // 2. Soal 2: Susun Kalimat (Tolong kamu menunggu saya sebentar di depan pintu.)
    Exercise(
        id = "u28_s4_p2_q2",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Tolong tunggu saya sebentar di pintu.",
        targetHanzi = "请 在 门口 等 我 一会儿。",
        targetPinyin = "Qǐng zài ménkǒu děng wǒ yíhuìér.",
        wordChips = listOf("请:qǐng", "在:zài", "门口:ménkǒu", "等:děng", "我:wǒ", "一会儿。:yíhuìér.", "去:qù"),
        correctAnswer = "请,在,门口,等,我,一会儿。",
        audioToSpeak = "请在门口等我一会儿。"
    ),

    // 3. Soal 3: Ketuk Pasangan yang Sesuai (Sebentar & Istirahat)
    Exercise(
        id = "u28_s4_p2_m3",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u28_s4_p2_m1", "一会儿", "yíhuìér", "sejenak / sebentar"),
            MatchPairItem("u28_s4_p2_m2", "睡一会儿", "shuì yíhuìér", "tidur sebentar"),
            MatchPairItem("u28_s4_p2_m3", "等一会儿", "děng yíhuìér", "tunggu sebentar"),
            MatchPairItem("u28_s4_p2_m4", "看一会儿", "kàn yíhuìér", "lihat sebentar")
        )
    ),

    // 4. Soal 4: Ketik Pinyin (sebentar -> yíhuìér)
    Exercise(
        id = "u28_s4_p2_q4",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "sebentar / sejenak",
        sentenceWithBlank = "一会儿 (________)",
        targetHanzi = "一会儿",
        targetPinyin = "yíhuìér",
        correctAnswer = "yihuier",
        keyboardKeys = listOf("y", "i", "h", "u", "e", "r", "a", "o", "b", "d", "g", "j"),
        audioToSpeak = "一会儿"
    ),

    // 5. Soal 5: Mendengar Kalimat (Rule 10: illustrationRes = 0)
    Exercise(
        id = "u28_s4_p2_q5",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Apa yang Anda dengar?",
        targetTranslation = "Saya ingin istirahat berbaring sebentar.",
        targetHanzi = "我 想 躺 一会儿 休息。",
        targetPinyin = "Wǒ xiǎng tǎng yíhuìér xiūxi.",
        wordChips = listOf("我:wǒ", "想:xiǎng", "躺:tǎng", "一会儿:yíhuìér", "休息。:xiūxi.", "工作:gōngzuò"),
        correctAnswer = "我,想,躺,一会儿,休息。",
        illustrationRes = 0,
        audioToSpeak = "我想躺一会儿休息。"
    ),

    // 6. Soal 6: Pilihan Kalimat
    Exercise(
        id = "u28_s4_p2_q6",
        type = ExerciseType.SENTENCE_CHOICE,
        title = "Pilih terjemahan yang benar",
        targetHanzi = "他 一会儿 哭， 一会儿 笑。",
        targetPinyin = "Tā yíhuìér kū, yíhuìér xiào.",
        targetTranslation = "Dia sebentar menangis, sebentar tertawa.",
        correctAnswer = "Tā yíhuìér kū, yíhuìér xiào.\n他 一会儿 哭， 一会儿 笑。",
        options = listOf(
            "Tā yíhuìér kū, yíhuìér xiào.\n他 一会儿 哭， 一会儿 笑。",
            "Tā yízhí zài xiào.\n他 一直 在 笑。",
            "Tā yízhí zài kū.\n他 一直 在 哭。"
        ),
        audioToSpeak = "他一会儿哭，一会儿笑。"
    ),

    // 7. Soal 7: Pilihan Gambar (等一会儿 -> tunggu sejenak)
    Exercise(
        id = "u28_s4_p2_q7",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "等一会儿",
        targetPinyin = "děng yíhuìér",
        targetTranslation = "tunggu sebentar",
        correctAnswer = "tunggu sebentar",
        audioToSpeak = "等一会儿",
        pictureOptions = listOf(
            PictureOption("u28_s4_p2_opt7_1", "sebentar", "", R.drawable.ic_gram_timeline_future, true),
            PictureOption("u28_s4_p2_opt7_2", "sering", "", R.drawable.ic_gram_manner_so_much, false),
            PictureOption("u28_s4_p2_opt7_3", "derajat", "", R.drawable.ic_gram_degree_speedometer, false),
            PictureOption("u28_s4_p2_opt7_4", "skala", "", R.drawable.ic_gram_compare_scale, false)
        )
    ),

    // 8. Soal 8: Ketik Pinyin (waktu -> shíjiān)
    Exercise(
        id = "u28_s4_p2_q8",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "waktu",
        sentenceWithBlank = "时间 (________)",
        targetHanzi = "时间",
        targetPinyin = "shíjiān",
        correctAnswer = "shijian",
        keyboardKeys = listOf("s", "h", "i", "j", "a", "n", "e", "o", "u", "b", "d", "g"),
        audioToSpeak = "时间"
    ),

    // 9. Soal 9: Susun Kalimat (Tunggu saya sebentar, saya segera datang.)
    Exercise(
        id = "u28_s4_p2_q9",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Tunggu saya sebentar, saya segera datang.",
        targetHanzi = "等 我 一会儿， 我 马上 来。",
        targetPinyin = "Děng wǒ yíhuìér, wǒ mǎshàng lái.",
        wordChips = listOf("等:děng", "我:wǒ", "一会儿，:yíhuìér,", "我:wǒ", "马上:mǎshàng", "来。:lái.", "走:zǒu"),
        correctAnswer = "等,我,一会儿，,我,马上,来。",
        audioToSpeak = "等我一会儿，我马上来。"
    ),

    // 10. Soal 10: Ketuk Pasangan yang Sesuai (Rangkuman Durasi Singkat)
    Exercise(
        id = "u28_s4_p2_m10",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u28_s4_p2_m10_1", "一会儿", "yíhuìér", "sekejap"),
            MatchPairItem("u28_s4_p2_m10_2", "马上来", "mǎshàng lái", "segera datang"),
            MatchPairItem("u28_s4_p2_m3", "等一下", "děng yíxià", "tunggu dulu"),
            MatchPairItem("u28_s4_p2_m4", "睡一会儿", "shuì yíhuìér", "rebah sejenak")
        )
    )
)
