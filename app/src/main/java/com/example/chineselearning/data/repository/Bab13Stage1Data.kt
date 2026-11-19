package com.example.chineselearning.data.repository

import com.example.chineselearning.R
import com.example.chineselearning.data.model.Exercise
import com.example.chineselearning.data.model.ExerciseType
import com.example.chineselearning.data.model.MatchPairItem
import com.example.chineselearning.data.model.PictureOption

val bab13Stage1Part1Exercises = listOf(
    // 1. Soal 1: Pilihan Gambar (天气 -> cuaca)
    Exercise(
        id = "u13_s1_p1_q1",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "天气",
        targetPinyin = "tiānqì",
        targetTranslation = "cuaca",
        correctAnswer = "cuaca",
        audioToSpeak = "天气",
        pictureOptions = listOf(
            PictureOption("u13_s1_p1_opt1", "cuaca", "⛅", R.drawable.ic_coin, true),
            PictureOption("u13_s1_p1_opt2", "air", "💧", R.drawable.ic_target, false),
            PictureOption("u13_s1_p1_opt3", "buku", "📖", R.drawable.ic_book, false),
            PictureOption("u13_s1_p1_opt4", "uang", "💰", R.drawable.ic_crown, false)
        )
    ),

    // 2. Soal 2: Susun Kalimat (Hari ini cuaca sangat bagus.)
    Exercise(
        id = "u13_s1_p1_q2",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Hari ini cuaca sangat bagus.",
        targetHanzi = "今天 天气 很 好。",
        targetPinyin = "Jīntiān tiānqì hěn hǎo.",
        wordChips = listOf("今天:jīntiān", "天气:tiānqì", "很:hěn", "好:hǎo", "明天:míngtiān", "冷:lěng"),
        correctAnswer = "今天,天气,很,好",
        audioToSpeak = "今天天气很好。"
    ),

    // 3. Soal 3: Ketuk Pasangan yang Sesuai (Cuaca & Tanya Kondisi)
    Exercise(
        id = "u13_s1_p1_q3",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u13_s1_p1_m1", "天气", "tiānqì", "cuaca"),
            MatchPairItem("u13_s1_p1_m2", "怎么样", "zěnmeyàng", "bagaimana"),
            MatchPairItem("u13_s1_p1_m3", "今天天气", "jīntiān tiānqì", "cuaca hari ini"),
            MatchPairItem("u13_s1_p1_m4", "很好", "hěn hǎo", "sangat baik")
        )
    ),

    // 4. Soal 4: Ketik Pinyin (cuaca -> tiānqì)
    Exercise(
        id = "u13_s1_p1_q4",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "cuaca",
        sentenceWithBlank = "天气 (________)",
        targetHanzi = "天气",
        targetPinyin = "tiānqì",
        correctAnswer = "tianqi",
        keyboardKeys = listOf("t", "i", "a", "n", "q", "e", "o", "u", "b", "d", "g"),
        audioToSpeak = "天气"
    ),

    // 5. Soal 5: Mendengar Kalimat (Rule 10: illustrationRes = 0)
    Exercise(
        id = "u13_s1_p1_q5",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Apa yang Anda dengar?",
        targetTranslation = "Bagaimana cuaca hari ini?",
        targetHanzi = "今天 天气 怎么样？",
        targetPinyin = "Jīntiān tiānqì zěnmeyàng?",
        wordChips = listOf("今天:jīntiān", "天气:tiānqì", "怎么样？:zěnmeyàng?", "明天:míngtiān", "好:hǎo"),
        correctAnswer = "今天,天气,怎么样？",
        illustrationRes = 0,
        audioToSpeak = "今天天气怎么样？"
    ),

    // 6. Soal 6: Pilihan Kalimat
    Exercise(
        id = "u13_s1_p1_q6",
        type = ExerciseType.SENTENCE_CHOICE,
        title = "Pilih terjemahan yang benar",
        targetHanzi = "明天 天气 怎么样？",
        targetPinyin = "Míngtiān tiānqì zěnmeyàng?",
        targetTranslation = "Bagaimana cuaca besok?",
        correctAnswer = "Míngtiān tiānqì zěnmeyàng?\n明天 天气 怎么样？",
        options = listOf(
            "Míngtiān tiānqì zěnmeyàng?\n明天 天气 怎么样？",
            "Jīntiān tiānqì zěnmeyàng?\n今天 天气 怎么样？",
            "Zuótiān tiānqì zěnmeyàng?\n昨天 天气 怎么样？"
        ),
        audioToSpeak = "明天天气怎么样？"
    ),

    // 7. Soal 7: Pilihan Gambar (怎么样 -> bagaimana)
    Exercise(
        id = "u13_s1_p1_q7",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "怎么样",
        targetPinyin = "zěnmeyàng",
        targetTranslation = "bagaimana",
        correctAnswer = "bagaimana",
        audioToSpeak = "怎么样",
        pictureOptions = listOf(
            PictureOption("u13_s1_p1_opt7_1", "bagaimana", "❓", R.drawable.ic_target, true),
            PictureOption("u13_s1_p1_opt7_2", "di mana", "📍", R.drawable.ic_coin, false),
            PictureOption("u13_s1_p1_opt7_3", "siapa", "👤", R.drawable.ic_book, false),
            PictureOption("u13_s1_p1_opt7_4", "kapan", "⏰", R.drawable.ic_crown, false)
        )
    ),

    // 8. Soal 8: Ketik Pinyin (bagaimana -> zěnmeyàng)
    Exercise(
        id = "u13_s1_p1_q8",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "bagaimana keadaannya",
        sentenceWithBlank = "怎么样 (________)",
        targetHanzi = "怎么样",
        targetPinyin = "zěnmeyàng",
        correctAnswer = "zenmeyang",
        keyboardKeys = listOf("z", "e", "n", "m", "y", "a", "g", "i", "o", "u", "b"),
        audioToSpeak = "怎么样"
    ),

    // 9. Soal 9: Susun Kalimat (Cuaca hari ini tidak baik.)
    Exercise(
        id = "u13_s1_p1_q9",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Cuaca hari ini tidak baik.",
        targetHanzi = "今天 天气 不 好。",
        targetPinyin = "Jīntiān tiānqì bù hǎo.",
        wordChips = listOf("今天:jīntiān", "天气:tiānqì", "不:bù", "好:hǎo", "很:hěn"),
        correctAnswer = "今天,天气,不,好",
        audioToSpeak = "今天天气不好。"
    ),

    // 10. Soal 10: Ketuk Pasangan yang Sesuai (Rangkuman Cuaca Hari Ini)
    Exercise(
        id = "u13_s1_p1_m10_1",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u13_s1_p1_m10_1", "天气", "tiānqì", "cuaca"),
            MatchPairItem("u13_s1_p1_m10_2", "怎么样", "zěnmeyàng", "bagaimana"),
            MatchPairItem("u13_s1_p1_m10_3", "天气很好", "tiānqì hěn hǎo", "cuaca sangat baik"),
            MatchPairItem("u13_s1_p1_m10_4", "天气不好", "tiānqì bù hǎo", "cuaca buruk")
        )
    )
)

val bab13Stage1Part2Exercises = listOf(
    // 1. Soal 1: Pilihan Gambar (天 -> langit / hari)
    Exercise(
        id = "u13_s1_p2_q1",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "天",
        targetPinyin = "tiān",
        targetTranslation = "hari / langit",
        correctAnswer = "hari / langit",
        audioToSpeak = "天",
        pictureOptions = listOf(
            PictureOption("u13_s1_p2_opt1", "hari / langit", "☀️", R.drawable.ic_coin, true),
            PictureOption("u13_s1_p2_opt2", "bulan", "🌙", R.drawable.ic_target, false),
            PictureOption("u13_s1_p2_opt3", "bintang", "⭐", R.drawable.ic_book, false),
            PictureOption("u13_s1_p2_opt4", "hujan", "🌧️", R.drawable.ic_crown, false)
        )
    ),

    // 2. Soal 2: Susun Kalimat (Beijing hari ini cuaca sangat baik.)
    Exercise(
        id = "u13_s1_p2_q2",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Beijing hari ini cuaca bagus.",
        targetHanzi = "北京 今天 天气 很 好。",
        targetPinyin = "Běijīng jīntiān tiānqì hěn hǎo.",
        wordChips = listOf("北京:Běijīng", "今天:jīntiān", "天气:tiānqì", "很:hěn", "好:hǎo", "明天:míngtiān"),
        correctAnswer = "北京,今天,天气,很,好",
        audioToSpeak = "北京今天天气很好。"
    ),

    // 3. Soal 3: Ketuk Pasangan yang Sesuai (Hari & Langit)
    Exercise(
        id = "u13_s1_p2_m3",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u13_s1_p2_m1", "天", "tiān", "hari / langit"),
            MatchPairItem("u13_s1_p2_m2", "三天", "sān tiān", "tiga hari"),
            MatchPairItem("u13_s1_p2_m3", "天气", "tiānqì", "cuaca"),
            MatchPairItem("u13_s1_p2_m4", "明天天气", "míngtiān tiānqì", "cuaca besok")
        )
    ),

    // 4. Soal 4: Ketik Pinyin (hari / langit -> tiān)
    Exercise(
        id = "u13_s1_p2_q4",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "hari / langit",
        sentenceWithBlank = "天 (________)",
        targetHanzi = "天",
        targetPinyin = "tiān",
        correctAnswer = "tian",
        keyboardKeys = listOf("t", "i", "a", "n", "e", "o", "u", "b", "d", "g", "h"),
        audioToSpeak = "天"
    ),

    // 5. Soal 5: Mendengar Kalimat (Rule 10: illustrationRes = 0)
    Exercise(
        id = "u13_s1_p2_q5",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Apa yang Anda dengar?",
        targetTranslation = "Kemarin cuacanya bagaimana?",
        targetHanzi = "昨天 天气 怎么样？",
        targetPinyin = "Zuótiān tiānqì zěnmeyàng?",
        wordChips = listOf("昨天:zuótiān", "天气:tiānqì", "怎么样？:zěnmeyàng?", "今天:jīntiān"),
        correctAnswer = "昨天,天气,怎么样？",
        illustrationRes = 0,
        audioToSpeak = "昨天天气怎么样？"
    ),

    // 6. Soal 6: Pilihan Kalimat
    Exercise(
        id = "u13_s1_p2_q6",
        type = ExerciseType.SENTENCE_CHOICE,
        title = "Pilih terjemahan yang benar",
        targetHanzi = "昨天 天气 很 好。",
        targetPinyin = "Zuótiān tiānqì hěn hǎo.",
        targetTranslation = "Kemarin cuaca sangat baik.",
        correctAnswer = "Zuótiān tiānqì hěn hǎo.\n昨天 天气 很 好。",
        options = listOf(
            "Zuótiān tiānqì hěn hǎo.\n昨天 天气 很 好。",
            "Jīntiān tiānqì hěn hǎo.\n今天 天气 很 好。",
            "Míngtiān tiānqì hěn hǎo.\n明天 天气 很 好。"
        ),
        audioToSpeak = "昨天天气很好。"
    ),

    // 7. Soal 7: Pilihan Gambar (天气很好 -> cuaca sangat bagus)
    Exercise(
        id = "u13_s1_p2_q7",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "好",
        targetPinyin = "hǎo",
        targetTranslation = "bagus / baik",
        correctAnswer = "bagus / baik",
        audioToSpeak = "好",
        pictureOptions = listOf(
            PictureOption("u13_s1_p2_opt7_1", "bagus / baik", "👍", R.drawable.ic_coin, true),
            PictureOption("u13_s1_p2_opt7_2", "buruk", "👎", R.drawable.ic_target, false),
            PictureOption("u13_s1_p2_opt7_3", "dingin", "🥶", R.drawable.ic_book, false),
            PictureOption("u13_s1_p2_opt7_4", "panas", "🥵", R.drawable.ic_crown, false)
        )
    ),

    // 8. Soal 8: Ketik Pinyin (sangat baik -> hěnhǎo)
    Exercise(
        id = "u13_s1_p2_q8",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "sangat baik",
        sentenceWithBlank = "很好 (________)",
        targetHanzi = "很好",
        targetPinyin = "hěnhǎo",
        correctAnswer = "henhao",
        keyboardKeys = listOf("h", "e", "n", "a", "o", "i", "u", "b", "d", "g", "j"),
        audioToSpeak = "很好"
    ),

    // 9. Soal 9: Susun Kalimat (Saya tinggal di sini tiga hari.)
    Exercise(
        id = "u13_s1_p2_q9",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Saya tinggal di sini tiga hari.",
        targetHanzi = "我 在 这儿 住 三 天。",
        targetPinyin = "Wǒ zài zhèr zhù sān tiān.",
        wordChips = listOf("我:wǒ", "在:zài", "这儿:zhèr", "住:zhù", "三:sān", "天:tiān"),
        correctAnswer = "我,在,这儿,住,三,天",
        audioToSpeak = "我在这儿住三天。"
    ),

    // 10. Soal 10: Ketuk Pasangan yang Sesuai (Rangkuman Hitungan Hari)
    Exercise(
        id = "u13_s1_p2_m10_1",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u13_s1_p2_m10_1", "一天", "yì tiān", "satu hari"),
            MatchPairItem("u13_s1_p2_m10_2", "两天", "liǎng tiān", "dua hari"),
            MatchPairItem("u13_s1_p2_m10_3", "几天", "jǐ tiān", "beberapa hari"),
            MatchPairItem("u13_s1_p2_m10_4", "天气", "tiānqì", "cuaca")
        )
    )
)
