package com.example.chineselearning.data.repository

import com.example.chineselearning.R
import com.example.chineselearning.data.model.Exercise
import com.example.chineselearning.data.model.ExerciseType
import com.example.chineselearning.data.model.MatchPairItem
import com.example.chineselearning.data.model.PictureOption

val bab28Stage1Part1Exercises = listOf(
    // 1. Soal 1: Pilihan Gambar (比 -> membandingkan / daripada)
    Exercise(
        id = "u28_s1_p1_q1",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "比",
        targetPinyin = "bǐ",
        targetTranslation = "daripada / dibandingkan",
        correctAnswer = "daripada / dibandingkan",
        audioToSpeak = "比",
        pictureOptions = listOf(
            PictureOption("u28_s1_p1_opt1", "perbandingan", "", R.drawable.ic_gram_compare_scale, true),
            PictureOption("u28_s1_p1_opt2", "paling", "", R.drawable.ic_gram_superlative_podium, false),
            PictureOption("u28_s1_p1_opt3", "derajat", "", R.drawable.ic_gram_degree_speedometer, false),
            PictureOption("u28_s1_p1_opt4", "waktu", "", R.drawable.ic_gram_timeline_future, false)
        )
    ),

    // 2. Soal 2: Susun Kalimat (Cuaca hari ini jauh lebih baik dibanding kemarin.)
    Exercise(
        id = "u28_s1_p1_q2",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Hari ini cuaca lebih baik dari kemarin.",
        targetHanzi = "今天 天气 比 昨天 好。",
        targetPinyin = "Jīntiān tiānqì bǐ zuótiān hǎo.",
        wordChips = listOf("今天:jīntiān", "天气:tiānqì", "比:bǐ", "昨天:zuótiān", "好。:hǎo.", "最:zuì"),
        correctAnswer = "今天,天气,比,昨天,好。",
        audioToSpeak = "今天天气比昨天好。"
    ),

    // 3. Soal 3: Ketuk Pasangan yang Sesuai (Komparasi & Superlatif)
    Exercise(
        id = "u28_s1_p1_q3",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u28_s1_p1_m1", "比", "bǐ", "dibandingkan / daripada"),
            MatchPairItem("u28_s1_p1_m2", "最", "zuì", "paling / ter-"),
            MatchPairItem("u28_s1_p1_m3", "最好", "zuì hǎo", "paling baik"),
            MatchPairItem("u28_s1_p1_m4", "比较", "bǐjiào", "relatif / membandingkan")
        )
    ),

    // 4. Soal 4: Ketik Pinyin (dibandingkan -> bǐ)
    Exercise(
        id = "u28_s1_p1_q4",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "dibandingkan dengan / daripada",
        sentenceWithBlank = "比 (________)",
        targetHanzi = "比",
        targetPinyin = "bǐ",
        correctAnswer = "bi",
        keyboardKeys = listOf("b", "i", "a", "e", "o", "u", "d", "g", "h", "j", "l", "m"),
        audioToSpeak = "比"
    ),

    // 5. Soal 5: Mendengar Kalimat (Rule 10: illustrationRes = 0)
    Exercise(
        id = "u28_s1_p1_q5",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Apa yang Anda dengar?",
        targetTranslation = "Di dalam kelas dia berbicara bahasa Mandarin paling bagus.",
        targetHanzi = "他 汉语 说 得 最 好。",
        targetPinyin = "Tā Hànyǔ shuō de zuì hǎo.",
        wordChips = listOf("他:tā", "汉语:Hànyǔ", "说:shuō", "得:de", "最:zuì", "好。:hǎo.", "比:bǐ"),
        correctAnswer = "他,汉语,说,得,最,好。",
        illustrationRes = 0,
        audioToSpeak = "他汉语说得最好。"
    ),

    // 6. Soal 6: Pilihan Kalimat
    Exercise(
        id = "u28_s1_p1_q6",
        type = ExerciseType.SENTENCE_CHOICE,
        title = "Pilih terjemahan yang benar",
        targetHanzi = "哥哥 比 弟弟 高 五 厘米。",
        targetPinyin = "Gēge bǐ dìdi gāo wǔ límǐ.",
        targetTranslation = "Kakak laki-laki lebih tinggi lima sentimeter dibanding adik.",
        correctAnswer = "Gēge bǐ dìdi gāo wǔ límǐ.\n哥哥 比 弟弟 高 五 厘米。",
        options = listOf(
            "Gēge bǐ dìdi gāo wǔ límǐ.\n哥哥 比 弟弟 高 五 厘米。",
            "Dìdi bǐ gēge gāo wǔ límǐ.\n弟弟 比 哥哥 高 五 厘米。",
            "Gēge hé dìdi yíyàng gāo.\n哥哥 和 弟弟 一样 高。"
        ),
        audioToSpeak = "哥哥比弟弟高五厘米。"
    ),

    // 7. Soal 7: Pilihan Gambar (最 -> paling / superlatif)
    Exercise(
        id = "u28_s1_p1_q7",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "最",
        targetPinyin = "zuì",
        targetTranslation = "paling",
        correctAnswer = "paling",
        audioToSpeak = "最",
        pictureOptions = listOf(
            PictureOption("u28_s1_p1_opt7_1", "paling", "", R.drawable.ic_gram_superlative_podium, true),
            PictureOption("u28_s1_p1_opt7_2", "skala banding", "", R.drawable.ic_gram_compare_scale, false),
            PictureOption("u28_s1_p1_opt7_3", "kecepatan", "", R.drawable.ic_gram_degree_speedometer, false),
            PictureOption("u28_s1_p1_opt7_4", "arah", "", R.drawable.ic_gram_manner_running, false)
        )
    ),

    // 8. Soal 8: Ketik Pinyin (paling/ter- -> zuì)
    Exercise(
        id = "u28_s1_p1_q8",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "paling / ter-",
        sentenceWithBlank = "最 (________)",
        targetHanzi = "最",
        targetPinyin = "zuì",
        correctAnswer = "zui",
        keyboardKeys = listOf("z", "u", "i", "a", "e", "o", "b", "d", "g", "h", "j", "l"),
        audioToSpeak = "最"
    ),

    // 9. Soal 9: Susun Kalimat (Saya paling suka makan semangka.)
    Exercise(
        id = "u28_s1_p1_q9",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Saya paling suka makan semangka.",
        targetHanzi = "我 最 喜欢 吃 西瓜。",
        targetPinyin = "Wǒ zuì xǐhuan chī xīguā.",
        wordChips = listOf("我:wǒ", "最:zuì", "喜欢:xǐhuan", "吃:chī", "西瓜。:xīguā.", "比:bǐ"),
        correctAnswer = "我,最,喜欢,吃,西瓜。",
        audioToSpeak = "我最喜欢吃西瓜。"
    ),

    // 10. Soal 10: Ketuk Pasangan yang Sesuai (Rangkuman Komparasi)
    Exercise(
        id = "u28_s1_p1_m10",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u28_s1_p1_m10_1", "比", "bǐ", "daripada"),
            MatchPairItem("u28_s1_p1_m2", "最", "zuì", "ter- / paling"),
            MatchPairItem("u28_s1_p1_m3", "比我高", "bǐ wǒ gāo", "lebih tinggi dariku"),
            MatchPairItem("u28_s1_p1_m4", "最喜欢", "zuì xǐhuan", "paling disukai")
        )
    )
)

val bab28Stage1Part2Exercises = listOf(
    // 1. Soal 1: Pilihan Gambar (比 -> perbandingan timbangan)
    Exercise(
        id = "u28_s1_p2_q1",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "比",
        targetPinyin = "bǐ",
        targetTranslation = "perbandingan",
        correctAnswer = "perbandingan",
        audioToSpeak = "比",
        pictureOptions = listOf(
            PictureOption("u28_s1_p2_opt1", "perbandingan", "", R.drawable.ic_gram_compare_scale, true),
            PictureOption("u28_s1_p2_opt2", "podium", "", R.drawable.ic_gram_superlative_podium, false),
            PictureOption("u28_s1_p2_opt3", "kecepatan", "", R.drawable.ic_gram_degree_speedometer, false),
            PictureOption("u28_s1_p2_opt4", "waktu", "", R.drawable.ic_gram_timeline_future, false)
        )
    ),

    // 2. Soal 2: Susun Kalimat (Apel ini lebih manis dibanding yang itu.)
    Exercise(
        id = "u28_s1_p2_q2",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Apel ini lebih manis dari yang itu.",
        targetHanzi = "这个 苹果 比 那个 甜。",
        targetPinyin = "Zhège píngguǒ bǐ nàge tián.",
        wordChips = listOf("这个:zhège", "苹果:píngguǒ", "比:bǐ", "那个:nàge", "甜。:tián.", "最:zuì"),
        correctAnswer = "这个,苹果,比,那个,甜。",
        audioToSpeak = "这个苹果比那个甜。"
    ),

    // 3. Soal 3: Ketuk Pasangan yang Sesuai (Pola Komparatif)
    Exercise(
        id = "u28_s1_p2_m3",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u28_s1_p2_m1", "比他大", "bǐ tā dà", "lebih tua darinya"),
            MatchPairItem("u28_s1_p2_m2", "比我快", "bǐ wǒ kuài", "lebih cepat dariku"),
            MatchPairItem("u28_s1_p2_m3", "最大", "zuì dà", "paling besar"),
            MatchPairItem("u28_s1_p2_m4", "最小", "zuì xiǎo", "paling kecil")
        )
    ),

    // 4. Soal 4: Ketik Pinyin (dibandingkan adik -> bǐdì)
    Exercise(
        id = "u28_s1_p2_q4",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "dibanding adik",
        sentenceWithBlank = "比弟 (________)",
        targetHanzi = "比弟",
        targetPinyin = "bǐdì",
        correctAnswer = "bidi",
        keyboardKeys = listOf("b", "i", "d", "a", "e", "o", "u", "g", "h", "j", "l", "m"),
        audioToSpeak = "比弟"
    ),

    // 5. Soal 5: Mendengar Kalimat (Rule 10: illustrationRes = 0)
    Exercise(
        id = "u28_s1_p2_q5",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Apa yang Anda dengar?",
        targetTranslation = "Pesawat terbang paling cepat.",
        targetHanzi = "飞机 跑 得 最 快。",
        targetPinyin = "Fēijī pǎo de zuì kuài.",
        wordChips = listOf("飞机:fēijī", "跑:pǎo", "得:de", "最:zuì", "快。:kuài.", "慢:màn"),
        correctAnswer = "飞机,跑,得,最,快。",
        illustrationRes = 0,
        audioToSpeak = "飞机跑得最快。"
    ),

    // 6. Soal 6: Pilihan Kalimat
    Exercise(
        id = "u28_s1_p2_q6",
        type = ExerciseType.SENTENCE_CHOICE,
        title = "Pilih terjemahan yang benar",
        targetHanzi = "今天 是 我 最 开心 的 一 天。",
        targetPinyin = "Jīntiān shì wǒ zuì kāixīn de yì tiān.",
        targetTranslation = "Hari ini adalah hari yang paling membuat saya gembira.",
        correctAnswer = "Jīntiān shì wǒ zuì kāixīn de yì tiān.\n今天 是 我 最 开心 的 一 天。",
        options = listOf(
            "Jīntiān shì wǒ zuì kāixīn de yì tiān.\n今天 是 我 最 开心 的 一 天。",
            "Zuótiān shì wǒ zuì kāixīn de yì tiān.\n昨天 是 我 最 开心 的 一 天。",
            "Jīntiān shì wǒ zuì lèi de yì tiān.\n今天 是 我 最 累 的 一 天。"
        ),
        audioToSpeak = "今天是我最开心的一天。"
    ),

    // 7. Soal 7: Pilihan Gambar (最 -> superlatif tertinggi)
    Exercise(
        id = "u28_s1_p2_q7",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "最",
        targetPinyin = "zuì",
        targetTranslation = "paling",
        correctAnswer = "paling",
        audioToSpeak = "最",
        pictureOptions = listOf(
            PictureOption("u28_s1_p2_opt7_1", "paling", "", R.drawable.ic_gram_superlative_podium, true),
            PictureOption("u28_s1_p2_opt7_2", "skala", "", R.drawable.ic_gram_compare_scale, false),
            PictureOption("u28_s1_p2_opt7_3", "derajat", "", R.drawable.ic_gram_degree_speedometer, false),
            PictureOption("u28_s1_p2_opt7_4", "berjalan", "", R.drawable.ic_gram_manner_running, false)
        )
    ),

    // 8. Soal 8: Ketik Pinyin (paling tinggi -> zuìgāo)
    Exercise(
        id = "u28_s1_p2_q8",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "paling tinggi",
        sentenceWithBlank = "最高 (________)",
        targetHanzi = "最高",
        targetPinyin = "zuìgāo",
        correctAnswer = "zuigao",
        keyboardKeys = listOf("z", "u", "i", "g", "a", "o", "e", "b", "d", "h", "j", "l"),
        audioToSpeak = "最高"
    ),

    // 9. Soal 9: Susun Kalimat (Hari ini adalah hari paling dingin.)
    Exercise(
        id = "u28_s1_p2_q9",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Hari ini adalah hari paling dingin.",
        targetHanzi = "今天 是 最 冷 的 一 天。",
        targetPinyin = "Jīntiān shì zuì lěng de yì tiān.",
        wordChips = listOf("今天:jīntiān", "是:shì", "最:zuì", "冷:lěng", "的:de", "一:yì", "天。:tiān.", "热:rè"),
        correctAnswer = "今天,是,最,冷,的,一,天。",
        audioToSpeak = "今天是最冷的一天。"
    ),

    // 10. Soal 10: Ketuk Pasangan yang Sesuai (Rangkuman Ekstrem Superlatif)
    Exercise(
        id = "u28_s1_p2_m10",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u28_s1_p2_m10_1", "最高", "zuì gāo", "tertinggi"),
            MatchPairItem("u28_s1_p2_m10_2", "最冷", "zuì lěng", "terdingin"),
            MatchPairItem("u28_s1_p2_m10_3", "最热", "zuì rè", "terpanas"),
            MatchPairItem("u28_s1_p2_m10_4", "最贵", "zuì guì", "termahal")
        )
    )
)
