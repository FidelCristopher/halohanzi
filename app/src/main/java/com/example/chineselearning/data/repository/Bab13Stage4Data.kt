package com.example.chineselearning.data.repository

import com.example.chineselearning.R
import com.example.chineselearning.data.model.Exercise
import com.example.chineselearning.data.model.ExerciseType
import com.example.chineselearning.data.model.MatchPairItem
import com.example.chineselearning.data.model.PictureOption

val bab13Stage4Part1Exercises = listOf(
    // 1. Soal 1: Pilihan Gambar (非常 -> amat sangat)
    Exercise(
        id = "u13_s4_p1_q1",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "非常",
        targetPinyin = "fēicháng",
        targetTranslation = "amat sangat",
        correctAnswer = "amat sangat",
        audioToSpeak = "非常",
        pictureOptions = listOf(
            PictureOption("u13_s4_p1_opt1", "amat sangat", "💯", R.drawable.ic_coin, true),
            PictureOption("u13_s4_p1_opt2", "sedikit", "🤏", R.drawable.ic_target, false),
            PictureOption("u13_s4_p1_opt3", "tidak", "❌", R.drawable.ic_book, false),
            PictureOption("u13_s4_p1_opt4", "semua", "👥", R.drawable.ic_crown, false)
        )
    ),

    // 2. Soal 2: Susun Kalimat (Hari ini cuaca sangat amat baik.)
    Exercise(
        id = "u13_s4_p1_q2",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Hari ini cuaca amat sangat bagus.",
        targetHanzi = "今天 天气 非常 好。",
        targetPinyin = "Jīntiān tiānqì fēicháng hǎo.",
        wordChips = listOf("今天:jīntiān", "天气:tiānqì", "非常:fēicháng", "好:hǎo", "冷:lěng", "热:rè"),
        correctAnswer = "今天,天气,非常,好",
        audioToSpeak = "今天天气非常好。"
    ),

    // 3. Soal 3: Ketuk Pasangan yang Sesuai (Intensitas Sangat)
    Exercise(
        id = "u13_s4_p1_q3",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u13_s4_p1_m1", "非常", "fēicháng", "amat sangat"),
            MatchPairItem("u13_s4_p1_m2", "非常好", "fēicháng hǎo", "sangat baik sekali"),
            MatchPairItem("u13_s4_p1_m3", "非常冷", "fēicháng lěng", "amat dingin"),
            MatchPairItem("u13_s4_p1_m4", "非常热", "fēicháng rè", "amat panas")
        )
    ),

    // 4. Soal 4: Ketik Pinyin (amat sangat -> fēicháng)
    Exercise(
        id = "u13_s4_p1_q4",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "amat sangat",
        sentenceWithBlank = "非常 (________)",
        targetHanzi = "非常",
        targetPinyin = "fēicháng",
        correctAnswer = "feichang",
        keyboardKeys = listOf("f", "e", "i", "c", "h", "a", "n", "g", "o", "u", "b"),
        audioToSpeak = "非常"
    ),

    // 5. Soal 5: Mendengar Kalimat (Rule 10: illustrationRes = 0)
    Exercise(
        id = "u13_s4_p1_q5",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Apa yang Anda dengar?",
        targetTranslation = "Beijing musim dingin amat dingin.",
        targetHanzi = "北京 的 冬天 非常 冷。",
        targetPinyin = "Běijīng de dōngtiān fēicháng lěng.",
        wordChips = listOf("北京:Běijīng", "的:de", "冬天:dōngtiān", "非常:fēicháng", "冷:lěng", "热:rè"),
        correctAnswer = "北京,的,冬天,非常,冷",
        illustrationRes = 0,
        audioToSpeak = "北京的冬天非常冷。"
    ),

    // 6. Soal 6: Pilihan Kalimat
    Exercise(
        id = "u13_s4_p1_q6",
        type = ExerciseType.SENTENCE_CHOICE,
        title = "Pilih terjemahan yang benar",
        targetHanzi = "这个 菜 非常 好吃。",
        targetPinyin = "Zhège cài fēicháng hǎochī.",
        targetTranslation = "Masakan ini amat sangat enak.",
        correctAnswer = "Zhège cài fēicháng hǎochī.\n这个 菜 非常 好吃。",
        options = listOf(
            "Zhège cài fēicháng hǎochī.\n这个 菜 非常 好吃。",
            "Zhège cài hěn hǎochī.\n这个 菜 很 好吃。",
            "Zhège cài bù hǎochī.\n这个 菜 不 好吃。"
        ),
        audioToSpeak = "这个菜非常好吃。"
    ),

    // 7. Soal 7: Pilihan Gambar (非常好 -> sangat bagus)
    Exercise(
        id = "u13_s4_p1_q7",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "好",
        targetPinyin = "hǎo",
        targetTranslation = "bagus / baik",
        correctAnswer = "bagus / baik",
        audioToSpeak = "好",
        pictureOptions = listOf(
            PictureOption("u13_s4_p1_opt7_1", "bagus", "🌟", R.drawable.ic_coin, true),
            PictureOption("u13_s4_p1_opt7_2", "buruk", "👎", R.drawable.ic_target, false),
            PictureOption("u13_s4_p1_opt7_3", "sedikit", "🤏", R.drawable.ic_book, false),
            PictureOption("u13_s4_p1_opt7_4", "dingin", "❄️", R.drawable.ic_crown, false)
        )
    ),

    // 8. Soal 8: Ketik Pinyin (sangat baik -> fēichánghǎo)
    Exercise(
        id = "u13_s4_p1_q8",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "sangat baik sekali",
        sentenceWithBlank = "非常好 (________)",
        targetHanzi = "非常好",
        targetPinyin = "fēichánghǎo",
        correctAnswer = "feichanghao",
        keyboardKeys = listOf("f", "e", "i", "c", "h", "a", "n", "g", "o", "u", "b"),
        audioToSpeak = "非常好"
    ),

    // 9. Soal 9: Susun Kalimat (Hari ini amat sangat panas.)
    Exercise(
        id = "u13_s4_p1_q9",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Hari ini amat sangat panas.",
        targetHanzi = "今天 非常 热。",
        targetPinyin = "Jīntiān fēicháng rè.",
        wordChips = listOf("今天:jīntiān", "非常:fēicháng", "热:rè", "冷:lěng", "昨天:zuótiān"),
        correctAnswer = "今天,非常,热",
        audioToSpeak = "今天非常热。"
    ),

    // 10. Soal 10: Ketuk Pasangan yang Sesuai (Rangkuman Intensitas)
    Exercise(
        id = "u13_s4_p1_m10_1",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u13_s4_p1_m10_1", "非常", "fēicháng", "amat sangat"),
            MatchPairItem("u13_s4_p1_m10_2", "非常好", "fēicháng hǎo", "sangat baik"),
            MatchPairItem("u13_s4_p1_m10_3", "很热", "hěn rè", "sangat panas"),
            MatchPairItem("u13_s4_p1_m10_4", "太冷了", "tài lěng le", "terlalu dingin")
        )
    )
)

val bab13Stage4Part2Exercises = listOf(
    // 1. Soal 1: Pilihan Gambar (真 -> sungguh / benar-benar)
    Exercise(
        id = "u13_s4_p2_q1",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "真",
        targetPinyin = "zhēn",
        targetTranslation = "sungguh / benar-benar",
        correctAnswer = "sungguh / benar-benar",
        audioToSpeak = "真",
        pictureOptions = listOf(
            PictureOption("u13_s4_p2_opt1", "sungguh / benar", "💯", R.drawable.ic_coin, true),
            PictureOption("u13_s4_p2_opt2", "palsu", "❌", R.drawable.ic_target, false),
            PictureOption("u13_s4_p2_opt3", "sedikit", "🤏", R.drawable.ic_book, false),
            PictureOption("u13_s4_p2_opt4", "tidak", "🚫", R.drawable.ic_crown, false)
        )
    ),

    // 2. Soal 2: Susun Kalimat (Hari ini cuaca sungguh bagus!)
    Exercise(
        id = "u13_s4_p2_q2",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Hari ini cuaca sungguh bagus!",
        targetHanzi = "今天 天气 真 好！",
        targetPinyin = "Jīntiān tiānqì zhēn hǎo!",
        wordChips = listOf("今天:jīntiān", "天气:tiānqì", "真:zhēn", "好！:hǎo!", "冷:lěng", "热:rè"),
        correctAnswer = "今天,天气,真,好！",
        audioToSpeak = "今天天气真好！"
    ),

    // 3. Soal 3: Ketuk Pasangan yang Sesuai (Kekaguman Sungguh)
    Exercise(
        id = "u13_s4_p2_m3",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u13_s4_p2_m1", "真", "zhēn", "sungguh / benar"),
            MatchPairItem("u13_s4_p2_m2", "真好", "zhēn hǎo", "sungguh bagus"),
            MatchPairItem("u13_s4_p2_m3", "真漂亮", "zhēn piàoliang", "sungguh cantik"),
            MatchPairItem("u13_s4_p2_m4", "真冷", "zhēn lěng", "sungguh dingin")
        )
    ),

    // 4. Soal 4: Ketik Pinyin (sungguh -> zhēn)
    Exercise(
        id = "u13_s4_p2_q4",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "sungguh / benar-benar",
        sentenceWithBlank = "真 (________)",
        targetHanzi = "真",
        targetPinyin = "zhēn",
        correctAnswer = "zhen",
        keyboardKeys = listOf("z", "h", "e", "n", "a", "i", "o", "u", "b", "d", "g"),
        audioToSpeak = "真"
    ),

    // 5. Soal 5: Mendengar Kalimat (Rule 10: illustrationRes = 0)
    Exercise(
        id = "u13_s4_p2_q5",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Apa yang Anda dengar?",
        targetTranslation = "Pangsit ini sungguh lezat!",
        targetHanzi = "这个 饺子 真 好吃！",
        targetPinyin = "Zhège jiǎozi zhēn hǎochī!",
        wordChips = listOf("这个:zhège", "饺子:jiǎozi", "真:zhēn", "好吃！:hǎochī!", "苹果:píngguǒ"),
        correctAnswer = "这个,饺子,真,好吃！",
        illustrationRes = 0,
        audioToSpeak = "这个饺子真好吃！"
    ),

    // 6. Soal 6: Pilihan Kalimat
    Exercise(
        id = "u13_s4_p2_q6",
        type = ExerciseType.SENTENCE_CHOICE,
        title = "Pilih terjemahan yang benar",
        targetHanzi = "外边 真 冷 啊！",
        targetPinyin = "Wàibian zhēn lěng a!",
        targetTranslation = "Di luar sungguh dingin ya!",
        correctAnswer = "Wàibian zhēn lěng a!\n外边 真 冷 啊！",
        options = listOf(
            "Wàibian zhēn lěng a!\n外边 真 冷 啊！",
            "Wàibian zhēn rè a!\n外边 真 热 啊！",
            "Jiālǐ zhēn lěng a!\n家里 真 冷 啊！"
        ),
        audioToSpeak = "外边真冷啊！"
    ),

    // 7. Soal 7: Pilihan Gambar (真好 -> sungguh bagus)
    Exercise(
        id = "u13_s4_p2_q7",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "真好",
        targetPinyin = "zhēn hǎo",
        targetTranslation = "sungguh bagus",
        correctAnswer = "sungguh bagus",
        audioToSpeak = "真好",
        pictureOptions = listOf(
            PictureOption("u13_s4_p2_opt7_1", "sungguh bagus", "🌟", R.drawable.ic_coin, true),
            PictureOption("u13_s4_p2_opt7_2", "buruk", "👎", R.drawable.ic_target, false),
            PictureOption("u13_s4_p2_opt7_3", "dingin", "❄️", R.drawable.ic_book, false),
            PictureOption("u13_s4_p2_opt7_4", "hujan", "🌧️", R.drawable.ic_crown, false)
        )
    ),

    // 8. Soal 8: Ketik Pinyin (sungguh bagus -> zhēnhǎo)
    Exercise(
        id = "u13_s4_p2_q8",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "sungguh bagus",
        sentenceWithBlank = "真好 (________)",
        targetHanzi = "真好",
        targetPinyin = "zhēnhǎo",
        correctAnswer = "zhenhao",
        keyboardKeys = listOf("z", "h", "e", "n", "a", "o", "i", "u", "b", "d", "g"),
        audioToSpeak = "真好"
    ),

    // 9. Soal 9: Susun Kalimat (Baju ini sungguh cantik.)
    Exercise(
        id = "u13_s4_p2_q9",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Baju ini sungguh cantik.",
        targetHanzi = "这 件 衣服 真 漂亮。",
        targetPinyin = "Zhè jiàn yīfu zhēn piàoliang.",
        wordChips = listOf("这:zhè", "件:jiàn", "衣服:yīfu", "真:zhēn", "漂亮:piàoliang", "那:nà"),
        correctAnswer = "这,件,衣服,真,漂亮",
        audioToSpeak = "这件衣服真漂亮。"
    ),

    // 10. Soal 10: Ketuk Pasangan yang Sesuai (Rangkuman Kekaguman)
    Exercise(
        id = "u13_s4_p2_m10_1",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u13_s4_p2_m10_1", "真好", "zhēn hǎo", "sungguh bagus"),
            MatchPairItem("u13_s4_p2_m10_2", "真漂亮", "zhēn piàoliang", "sungguh cantik"),
            MatchPairItem("u13_s4_p2_m10_3", "真好吃", "zhēn hǎochī", "sungguh enak"),
            MatchPairItem("u13_s4_p2_m10_4", "真冷", "zhēn lěng", "sungguh dingin")
        )
    )
)
