package com.example.chineselearning.data.repository

import com.example.chineselearning.R
import com.example.chineselearning.data.model.Exercise
import com.example.chineselearning.data.model.ExerciseType
import com.example.chineselearning.data.model.MatchPairItem
import com.example.chineselearning.data.model.PictureOption

val bab28Stage5Part1Exercises = listOf(
    // 1. Soal 1: Pilihan Gambar (已经 -> sudah / telah)
    Exercise(
        id = "u28_s5_p1_q1",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "已经",
        targetPinyin = "yǐjīng",
        targetTranslation = "sudah / telah",
        correctAnswer = "sudah / telah",
        audioToSpeak = "已经",
        pictureOptions = listOf(
            PictureOption("u28_s5_p1_opt1", "sudah", "", R.drawable.ic_gram_timeline_future, true),
            PictureOption("u28_s5_p1_opt2", "kecepatan", "", R.drawable.ic_gram_degree_speedometer, false),
            PictureOption("u28_s5_p1_opt3", "skala", "", R.drawable.ic_gram_compare_scale, false),
            PictureOption("u28_s5_p1_opt4", "podium", "", R.drawable.ic_gram_superlative_podium, false)
        )
    ),

    // 2. Soal 2: Susun Kalimat (Film sudah dimulai, lekaslah masuk ke dalam bioskop.)
    Exercise(
        id = "u28_s5_p1_q2",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Film sudah mulai, cepat masuk.",
        targetHanzi = "电影 已经 开始 了， 快 进去。",
        targetPinyin = "Diànyǐng yǐjīng kāishǐ le, kuài jìnqù.",
        wordChips = listOf("电影:diànyǐng", "已经:yǐjīng", "开始:kāishǐ", "了，:le,", "快:kuài", "进去。:jìnqù.", "出来:chūlái"),
        correctAnswer = "电影,已经,开始,了，,快,进去。",
        audioToSpeak = "电影已经开始了，快进去。"
    ),

    // 3. Soal 3: Ketuk Pasangan yang Sesuai (Sudah & Sebentar Lagi)
    Exercise(
        id = "u28_s5_p1_m3",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u28_s5_p1_m1", "已经", "yǐjīng", "sudah"),
            MatchPairItem("u28_s5_p1_m2", "快要", "kuàiyào", "sebentar lagi akan"),
            MatchPairItem("u28_s5_p1_m3", "已经走", "yǐjīng zǒu", "sudah pergi"),
            MatchPairItem("u28_s5_p1_m4", "快要开", "kuàiyào kāi", "segera berangkat")
        )
    ),

    // 4. Soal 4: Ketik Pinyin (sudah -> yǐjīng)
    Exercise(
        id = "u28_s5_p1_q4",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "sudah / telah",
        sentenceWithBlank = "已经 (________)",
        targetHanzi = "已经",
        targetPinyin = "yǐjīng",
        correctAnswer = "yijing",
        keyboardKeys = listOf("y", "i", "j", "n", "g", "a", "e", "o", "u", "b", "d", "h"),
        audioToSpeak = "已经"
    ),

    // 5. Soal 5: Mendengar Kalimat (Rule 10: illustrationRes = 0)
    Exercise(
        id = "u28_s5_p1_q5",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Apa yang Anda dengar?",
        targetTranslation = "Kereta api sebentar lagi akan berangkat, semua lekas naik ke kereta.",
        targetHanzi = "火车 快要 开 了， 快 上车。",
        targetPinyin = "Huǒchē kuàiyào kāi le, kuài shàngchē.",
        wordChips = listOf("火车:huǒchē", "快要:kuàiyào", "开:kāi", "了，:le,", "快:kuài", "上车。:shàngchē.", "下车:xiàchē"),
        correctAnswer = "火车,快要,开,了，,快,上车。",
        illustrationRes = 0,
        audioToSpeak = "火车快要开了，快上车。"
    ),

    // 6. Soal 6: Pilihan Kalimat
    Exercise(
        id = "u28_s5_p1_q6",
        type = ExerciseType.SENTENCE_CHOICE,
        title = "Pilih terjemahan yang benar",
        targetHanzi = "天 快要 下雨 了， 我们 回家 吧。",
        targetPinyin = "Tiān kuàiyào xiàyǔ le, wǒmen huíjiā ba.",
        targetTranslation = "Hari sebentar lagi akan turun hujan, ayo kita pulang ke rumah.",
        correctAnswer = "Tiān kuàiyào xiàyǔ le, wǒmen huíjiā ba.\n天 快要 下雨 了， 我们 回家 吧。",
        options = listOf(
            "Tiān kuàiyào xiàyǔ le, wǒmen huíjiā ba.\n天 快要 下雨 了， 我们 回家 吧。",
            "Tiān yǐjīng xiàyǔ le, wǒmen bié huíjiā.\n天 已经 下雨 了， 我们 别 回家。",
            "Tiān qíng le, wǒmen chūqù ba.\n天 晴 了， 我们 出去 吧。"
        ),
        audioToSpeak = "天快要下雨了，我们回家吧。"
    ),

    // 7. Soal 7: Pilihan Gambar (快要 -> sebentar lagi akan)
    Exercise(
        id = "u28_s5_p1_q7",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "快要",
        targetPinyin = "kuàiyào",
        targetTranslation = "sebentar lagi",
        correctAnswer = "sebentar lagi",
        audioToSpeak = "快要",
        pictureOptions = listOf(
            PictureOption("u28_s5_p1_opt7_1", "sebentar lagi", "", R.drawable.ic_gram_timeline_future, true),
            PictureOption("u28_s5_p1_opt7_2", "sering", "", R.drawable.ic_gram_manner_so_much, false),
            PictureOption("u28_s5_p1_opt7_3", "derajat", "", R.drawable.ic_gram_degree_speedometer, false),
            PictureOption("u28_s5_p1_opt7_4", "skala", "", R.drawable.ic_gram_compare_scale, false)
        )
    ),

    // 8. Soal 8: Ketik Pinyin (sebentar lagi akan -> kuàiyào)
    Exercise(
        id = "u28_s5_p1_q8",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "sebentar lagi akan",
        sentenceWithBlank = "快要 (________)",
        targetHanzi = "快要",
        targetPinyin = "kuàiyào",
        correctAnswer = "kuaiyao",
        keyboardKeys = listOf("k", "u", "a", "i", "y", "o", "e", "b", "d", "g", "h", "j"),
        audioToSpeak = "快要"
    ),

    // 9. Soal 9: Susun Kalimat (Saya sudah selesai makan nasi.)
    Exercise(
        id = "u28_s5_p1_q9",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Saya sudah selesai makan.",
        targetHanzi = "我 已经 吃 完 饭 了。",
        targetPinyin = "Wǒ yǐjīng chī wán fàn le.",
        wordChips = listOf("我:wǒ", "已经:yǐjīng", "吃:chī", "完:wán", "饭:fàn", "了。:le.", "没:méi"),
        correctAnswer = "我,已经,吃,完,饭,了。",
        audioToSpeak = "我已经吃完饭了。"
    ),

    // 10. Soal 10: Ketuk Pasangan yang Sesuai (Rangkuman Waktu Lampau & Prospektif)
    Exercise(
        id = "u28_s5_p1_m10",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u28_s5_p1_m10_1", "已经", "yǐjīng", "telah"),
            MatchPairItem("u28_s5_p1_m10_2", "快要", "kuàiyào", "hampir akan"),
            MatchPairItem("u28_s5_p1_m3", "吃完了", "chī wán le", "sudah habis makan"),
            MatchPairItem("u28_s5_p1_m4", "快到了", "kuài dào le", "segera tiba")
        )
    )
)

val bab28Stage5Part2Exercises = listOf(
    // 1. Soal 1: Pilihan Gambar (正 -> sedang / tepat saat)
    Exercise(
        id = "u28_s5_p2_q1",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "正",
        targetPinyin = "zhèng",
        targetTranslation = "sedang / tepat",
        correctAnswer = "sedang / tepat",
        audioToSpeak = "正",
        pictureOptions = listOf(
            PictureOption("u28_s5_p2_opt1", "sedang berlangsung", "", R.drawable.ic_gram_timeline_future, true),
            PictureOption("u28_s5_p2_opt2", "kecepatan", "", R.drawable.ic_gram_degree_speedometer, false),
            PictureOption("u28_s5_p2_opt3", "timbangan", "", R.drawable.ic_gram_compare_scale, false),
            PictureOption("u28_s5_p2_opt4", "podium", "", R.drawable.ic_gram_superlative_podium, false)
        )
    ),

    // 2. Soal 2: Susun Kalimat (Saya tepat sedang berniat menelepon kepadamu.)
    Exercise(
        id = "u28_s5_p2_q2",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Saya pas mau meneleponmu.",
        targetHanzi = "我 正 想 打 电话 给 你。",
        targetPinyin = "Wǒ zhèng xiǎng dǎ diànhuà gěi nǐ.",
        wordChips = listOf("我:wǒ", "正:zhèng", "想:xiǎng", "打:dǎ", "电话:diànhuà", "给:gěi", "你。:nǐ.", "去:qù"),
        correctAnswer = "我,正,想,打,电话,给,你。",
        audioToSpeak = "我正想打电话给你。"
    ),

    // 3. Soal 3: Ketuk Pasangan yang Sesuai (Grand Sintesis Bab 28)
    Exercise(
        id = "u28_s5_p2_m3",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u28_s5_p2_m1", "比", "bǐ", "daripada"),
            MatchPairItem("u28_s5_p2_m2", "最", "zuì", "paling"),
            MatchPairItem("u28_s5_p2_m3", "已经", "yǐjīng", "sudah"),
            MatchPairItem("u28_s5_p2_m4", "正", "zhèng", "sedang / pas")
        )
    ),

    // 4. Soal 4: Ketik Pinyin (sedang/tepat -> zhèng)
    Exercise(
        id = "u28_s5_p2_q4",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "sedang / tepat",
        sentenceWithBlank = "正 (________)",
        targetHanzi = "正",
        targetPinyin = "zhèng",
        correctAnswer = "zheng",
        keyboardKeys = listOf("z", "h", "e", "n", "g", "a", "i", "o", "u", "b", "d", "j"),
        audioToSpeak = "正"
    ),

    // 5. Soal 5: Mendengar Kalimat (Rule 10: illustrationRes = 0)
    Exercise(
        id = "u28_s5_p2_q5",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Apa yang Anda dengar?",
        targetTranslation = "Di luar tepat sedang turun salju.",
        targetHanzi = "外面 正 下 着 雪 呢。",
        targetPinyin = "Wàimiàn zhèng xià zhe xuě ne.",
        wordChips = listOf("外面:wàimiàn", "正:zhèng", "下:xià", "着:zhe", "雪:xuě", "呢。:ne.", "雨:yǔ"),
        correctAnswer = "外面,正,下,着,雪,呢。",
        illustrationRes = 0,
        audioToSpeak = "外面正下着雪呢。"
    ),

    // 6. Soal 6: Pilihan Kalimat
    Exercise(
        id = "u28_s5_p2_q6",
        type = ExerciseType.SENTENCE_CHOICE,
        title = "Pilih terjemahan yang benar",
        targetHanzi = "他 正 在 房间 听 音乐 呢。",
        targetPinyin = "Tā zhèng zài fángjiān tīng yīnyuè ne.",
        targetTranslation = "Dia tepat sedang mendengarkan musik di dalam kamar.",
        correctAnswer = "Tā zhèng zài fángjiān tīng yīnyuè ne.\n他 正 在 房间 听 音乐 呢。",
        options = listOf(
            "Tā zhèng zài fángjiān tīng yīnyuè ne.\n他 正 在 房间 听 音乐 呢。",
            "Tā yǐjīng shuìjiào le.\n他 已经 睡觉 了。",
            "Wǒ zhèng zài fángjiān tīng yīnyuè ne.\n我 正 在 房间 听 音乐 呢。"
        ),
        audioToSpeak = "他正在房间听音乐呢。"
    ),

    // 7. Soal 7: Pilihan Gambar (已经 -> sudah selesai)
    Exercise(
        id = "u28_s5_p2_q7",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "已经",
        targetPinyin = "yǐjīng",
        targetTranslation = "sudah",
        correctAnswer = "sudah",
        audioToSpeak = "已经",
        pictureOptions = listOf(
            PictureOption("u28_s5_p2_opt7_1", "sudah", "", R.drawable.ic_gram_timeline_future, true),
            PictureOption("u28_s5_p2_opt7_2", "kecepatan", "", R.drawable.ic_gram_degree_speedometer, false),
            PictureOption("u28_s5_p2_opt7_3", "timbangan", "", R.drawable.ic_gram_compare_scale, false),
            PictureOption("u28_s5_p2_opt7_4", "podium", "", R.drawable.ic_gram_superlative_podium, false)
        )
    ),

    // 8. Soal 8: Ketik Pinyin (sudah -> yǐjīng)
    Exercise(
        id = "u28_s5_p2_q8",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "sudah",
        sentenceWithBlank = "已经 (________)",
        targetHanzi = "已经",
        targetPinyin = "yǐjīng",
        correctAnswer = "yijing",
        keyboardKeys = listOf("y", "i", "j", "n", "g", "a", "e", "o", "u", "b", "d", "h"),
        audioToSpeak = "已经"
    ),

    // 9. Soal 9: Susun Kalimat (Dia lebih tinggi dibanding saya.)
    Exercise(
        id = "u28_s5_p2_q9",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Dia lebih tinggi dari saya.",
        targetHanzi = "他 比 我 高。",
        targetPinyin = "Tā bǐ wǒ gāo.",
        wordChips = listOf("他:tā", "比:bǐ", "我:wǒ", "高。:gāo.", "矮:ǎi"),
        correctAnswer = "他,比,我,高。",
        audioToSpeak = "他比我高。"
    ),

    // 10. Soal 10: Ketuk Pasangan yang Sesuai (Grand Review Final Bab 28)
    Exercise(
        id = "u28_s5_p2_m10",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u28_s5_p2_m10_1", "比我高", "bǐ wǒ gāo", "lebih tinggi"),
            MatchPairItem("u28_s5_p2_m10_2", "最好看", "zuì hǎokàn", "paling elok"),
            MatchPairItem("u28_s5_p2_m10_3", "走得快", "zǒu de kuài", "jalan cepat"),
            MatchPairItem("u28_s5_p2_m10_4", "快到了", "kuài dào le", "hampir sampai")
        )
    )
)
