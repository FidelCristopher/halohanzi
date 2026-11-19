package com.example.chineselearning.data.repository

import com.example.chineselearning.R
import com.example.chineselearning.data.model.Exercise
import com.example.chineselearning.data.model.ExerciseType
import com.example.chineselearning.data.model.MatchPairItem
import com.example.chineselearning.data.model.PictureOption

val bab14Stage1Part1Exercises = listOf(
    // 1. Soal 1: Pilihan Gambar (喜欢 -> suka / gemar)
    Exercise(
        id = "u14_s1_p1_q1",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "喜欢",
        targetPinyin = "xǐhuan",
        targetTranslation = "suka / gemar",
        correctAnswer = "suka / gemar",
        audioToSpeak = "喜欢",
        pictureOptions = listOf(
            PictureOption("u14_s1_p1_opt1", "suka / gemar", "", R.drawable.ic_hobby_like, true),
            PictureOption("u14_s1_p1_opt2", "benci", "", R.drawable.ic_mod_wrong, false),
            PictureOption("u14_s1_p1_opt3", "tidur", "", R.drawable.ic_action_sleep, false),
            PictureOption("u14_s1_p1_opt4", "makan", "", R.drawable.ic_action_eat, false)
        )
    ),

    // 2. Soal 2: Susun Kalimat (Saya suka belajar bahasa Mandarin.)
    Exercise(
        id = "u14_s1_p1_q2",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Saya suka belajar bahasa Mandarin.",
        targetHanzi = "我 喜欢 学习 汉语。",
        targetPinyin = "Wǒ xǐhuan xuéxí Hànyǔ.",
        wordChips = listOf("我:wǒ", "喜欢:xǐhuan", "学习:xuéxí", "汉语:Hànyǔ", "爱:ài", "想:xiǎng"),
        correctAnswer = "我,喜欢,学习,汉语",
        audioToSpeak = "我喜欢学习汉语。"
    ),

    // 3. Soal 3: Ketuk Pasangan yang Sesuai (Afeksi & Minat)
    Exercise(
        id = "u14_s1_p1_q3",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u14_s1_p1_m1", "喜欢", "xǐhuan", "suka / gemar"),
            MatchPairItem("u14_s1_p1_m2", "爱", "ài", "cinta / menyayangi"),
            MatchPairItem("u14_s1_p1_m3", "想", "xiǎng", "ingin / rindu"),
            MatchPairItem("u14_s1_p1_m4", "我爱家", "wǒ ài jiā", "saya cinta keluarga")
        )
    ),

    // 4. Soal 4: Ketik Pinyin (suka -> xǐhuan)
    Exercise(
        id = "u14_s1_p1_q4",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "suka / gemar",
        sentenceWithBlank = "喜欢 (________)",
        targetHanzi = "喜欢",
        targetPinyin = "xǐhuan",
        correctAnswer = "xihuan",
        keyboardKeys = listOf("x", "i", "h", "u", "a", "n", "e", "o", "b", "d", "g"),
        audioToSpeak = "喜欢"
    ),

    // 5. Soal 5: Mendengar Kalimat (Rule 10: illustrationRes = 0)
    Exercise(
        id = "u14_s1_p1_q5",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Apa yang Anda dengar?",
        targetTranslation = "Dia sangat menyayangi kucing.",
        targetHanzi = "他 很 爱 猫。",
        targetPinyin = "Tā hěn ài māo.",
        wordChips = listOf("他:tā", "很:hěn", "爱:ài", "猫:māo", "狗:gǒu", "我:wǒ"),
        correctAnswer = "他,很,爱,猫",
        illustrationRes = 0,
        audioToSpeak = "他很爱猫。"
    ),

    // 6. Soal 6: Pilihan Kalimat
    Exercise(
        id = "u14_s1_p1_q6",
        type = ExerciseType.SENTENCE_CHOICE,
        title = "Pilih terjemahan yang benar",
        targetHanzi = "你 喜欢 吃 什么？",
        targetPinyin = "Nǐ xǐhuan chī shénme?",
        targetTranslation = "Kamu suka makan apa?",
        correctAnswer = "Nǐ xǐhuan chī shénme?\n你 喜欢 吃 什么？",
        options = listOf(
            "Nǐ xǐhuan chī shénme?\n你 喜欢 吃 什么？",
            "Nǐ xǐhuan hē shénme?\n你 喜欢 喝 什么？",
            "Tā xǐhuan chī shénme?\n他 喜欢 吃 什么？"
        ),
        audioToSpeak = "你喜欢吃什么？"
    ),

    // 7. Soal 7: Pilihan Gambar (爱 -> cinta / menyayangi)
    Exercise(
        id = "u14_s1_p1_q7",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "爱",
        targetPinyin = "ài",
        targetTranslation = "cinta / menyayangi",
        correctAnswer = "cinta / menyayangi",
        audioToSpeak = "爱",
        pictureOptions = listOf(
            PictureOption("u14_s1_p1_opt7_1", "cinta", "", R.drawable.ic_hobby_love, true),
            PictureOption("u14_s1_p1_opt7_2", "uang", "", R.drawable.ic_yuan_currency, false),
            PictureOption("u14_s1_p1_opt3", "buku", "", R.drawable.ic_book_chinese, false),
            PictureOption("u14_s1_p1_opt4", "mobil", "", R.drawable.ic_trans_car, false)
        )
    ),

    // 8. Soal 8: Ketik Pinyin (cinta -> ài)
    Exercise(
        id = "u14_s1_p1_q8",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "cinta / menyayangi",
        sentenceWithBlank = "爱 (________)",
        targetHanzi = "爱",
        targetPinyin = "ài",
        correctAnswer = "ai",
        keyboardKeys = listOf("a", "i", "e", "o", "u", "b", "d", "g", "h", "j", "l"),
        audioToSpeak = "爱"
    ),

    // 9. Soal 9: Susun Kalimat (Saya ingin pergi ke Beijing.)
    Exercise(
        id = "u14_s1_p1_q9",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Saya ingin pergi ke Beijing.",
        targetHanzi = "我 想 去 北京。",
        targetPinyin = "Wǒ xiǎng qù Běijīng.",
        wordChips = listOf("我:wǒ", "想:xiǎng", "去:qù", "北京:Běijīng", "来:lái", "喜欢:xǐhuan"),
        correctAnswer = "我,想,去,北京",
        audioToSpeak = "我想去北京。"
    ),

    // 10. Soal 10: Ketuk Pasangan yang Sesuai (Rangkuman Minat)
    Exercise(
        id = "u14_s1_p1_m10_1",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u14_s1_p1_m10_1", "喜欢", "xǐhuan", "suka"),
            MatchPairItem("u14_s1_p1_m10_2", "爱", "ài", "cinta"),
            MatchPairItem("u14_s1_p1_m10_3", "想去", "xiǎng qù", "ingin pergi"),
            MatchPairItem("u14_s1_p1_m10_4", "喜欢读书", "xǐhuan dúshū", "gemar membaca")
        )
    )
)

val bab14Stage1Part2Exercises = listOf(
    // 1. Soal 1: Pilihan Gambar (玩 -> bermain)
    Exercise(
        id = "u14_s1_p2_q1",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "玩",
        targetPinyin = "wán",
        targetTranslation = "bermain",
        correctAnswer = "bermain",
        audioToSpeak = "玩",
        pictureOptions = listOf(
            PictureOption("u14_s1_p2_opt1", "bermain", "", R.drawable.ic_hobby_play, true),
            PictureOption("u14_s1_p2_opt2", "belajar", "", R.drawable.ic_edu_study, false),
            PictureOption("u14_s1_p2_opt3", "tidur", "", R.drawable.ic_action_sleep, false),
            PictureOption("u14_s1_p2_opt4", "makan", "", R.drawable.ic_action_eat, false)
        )
    ),

    // 2. Soal 2: Susun Kalimat (Akhir pekan kami pergi bermain.)
    Exercise(
        id = "u14_s1_p2_q2",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Kami pergi bermain.",
        targetHanzi = "我们 去 玩。",
        targetPinyin = "Wǒmen qù wán.",
        wordChips = listOf("我们:wǒmen", "去:qù", "玩:wán", "学习:xuéxí", "他:tā"),
        correctAnswer = "我们,去,玩",
        audioToSpeak = "我们去玩。"
    ),

    // 3. Soal 3: Ketuk Pasangan yang Sesuai (Bermain & Asyik)
    Exercise(
        id = "u14_s1_p2_m3",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u14_s1_p2_m1", "玩", "wán", "bermain"),
            MatchPairItem("u14_s1_p2_m2", "好玩儿", "hǎowánr", "menyenangkan / asyik"),
            MatchPairItem("u14_s1_p2_m3", "很好玩儿", "hěn hǎowánr", "sangat asyik"),
            MatchPairItem("u14_s1_p2_m4", "出去玩", "chūqù wán", "pergi main keluar")
        )
    ),

    // 4. Soal 4: Ketik Pinyin (bermain -> wán)
    Exercise(
        id = "u14_s1_p2_q4",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "bermain",
        sentenceWithBlank = "玩 (________)",
        targetHanzi = "玩",
        targetPinyin = "wán",
        correctAnswer = "wan",
        keyboardKeys = listOf("w", "a", "n", "e", "i", "o", "u", "b", "d", "g", "h"),
        audioToSpeak = "玩"
    ),

    // 5. Soal 5: Mendengar Kalimat (Rule 10: illustrationRes = 0)
    Exercise(
        id = "u14_s1_p2_q5",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Apa yang Anda dengar?",
        targetTranslation = "Beijing sangat asyik untuk dikunjungi.",
        targetHanzi = "北京 很 好玩儿。",
        targetPinyin = "Běijīng hěn hǎowánr.",
        wordChips = listOf("北京:Běijīng", "很:hěn", "好玩儿:hǎowánr", "大:dà", "冷:lěng"),
        correctAnswer = "北京,很,好玩儿",
        illustrationRes = 0,
        audioToSpeak = "北京很好玩儿。"
    ),

    // 6. Soal 6: Pilihan Kalimat
    Exercise(
        id = "u14_s1_p2_q6",
        type = ExerciseType.SENTENCE_CHOICE,
        title = "Pilih terjemahan yang benar",
        targetHanzi = "这个 东西 好玩儿 吗？",
        targetPinyin = "Zhège dōngxi hǎowánr ma?",
        targetTranslation = "Apakah barang ini asyik?",
        correctAnswer = "Zhège dōngxi hǎowánr ma?\n这个 东西 好玩儿 吗？",
        options = listOf(
            "Zhège dōngxi hǎowánr ma?\n这个 东西 好玩儿 吗？",
            "Zhège dōngxi hǎochī ma?\n这个 东西 好吃 吗？",
            "Zhège dōngxi hǎokàn ma?\n这个 东西 好看 吗？"
        ),
        audioToSpeak = "这个东西好玩儿吗？"
    ),

    // 7. Soal 7: Pilihan Gambar (好玩儿 -> menyenangkan)
    Exercise(
        id = "u14_s1_p2_q7",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "好玩儿",
        targetPinyin = "hǎowánr",
        targetTranslation = "menyenangkan / asyik",
        correctAnswer = "menyenangkan / asyik",
        audioToSpeak = "好玩儿",
        pictureOptions = listOf(
            PictureOption("u14_s1_p2_opt7_1", "menyenangkan", "", R.drawable.ic_hobby_fun, true),
            PictureOption("u14_s1_p2_opt7_2", "membosankan", "", R.drawable.ic_mod_wrong, false),
            PictureOption("u14_s1_p2_opt7_3", "makanan", "", R.drawable.ic_food_chinese_cuisine, false),
            PictureOption("u14_s1_p2_opt7_4", "tidur", "", R.drawable.ic_action_sleep, false)
        )
    ),

    // 8. Soal 8: Ketik Pinyin (menyenangkan -> hǎowánr)
    Exercise(
        id = "u14_s1_p2_q8",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "menyenangkan / asyik",
        sentenceWithBlank = "好玩儿 (________)",
        targetHanzi = "好玩儿",
        targetPinyin = "hǎowánr",
        correctAnswer = "haowanr",
        keyboardKeys = listOf("h", "a", "o", "w", "n", "r", "e", "i", "u", "b", "d"),
        audioToSpeak = "好玩儿"
    ),

    // 9. Soal 9: Susun Kalimat (Anak-anak suka bermain.)
    Exercise(
        id = "u14_s1_p2_q9",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Anak-anak suka bermain.",
        targetHanzi = "孩子 喜欢 玩。",
        targetPinyin = "Háizi xǐhuan wán.",
        wordChips = listOf("孩子:háizi", "喜欢:xǐhuan", "玩:wán", "看书:kànshū", "睡觉:shuìjiào"),
        correctAnswer = "孩子,喜欢,玩",
        audioToSpeak = "孩子喜欢玩。"
    ),

    // 10. Soal 10: Ketuk Pasangan yang Sesuai (Rangkuman Bermain)
    Exercise(
        id = "u14_s1_p2_m10_1",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u14_s1_p2_m10_1", "玩", "wán", "bermain"),
            MatchPairItem("u14_s1_p2_m10_2", "好玩儿", "hǎowánr", "asyik"),
            MatchPairItem("u14_s1_p2_m10_3", "喜欢玩", "xǐhuan wán", "suka bermain"),
            MatchPairItem("u14_s1_p2_m10_4", "真好玩儿", "zhēn hǎowánr", "sungguh asyik")
        )
    )
)
