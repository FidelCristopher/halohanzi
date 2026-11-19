package com.example.chineselearning.data.repository

import com.example.chineselearning.R
import com.example.chineselearning.data.model.Exercise
import com.example.chineselearning.data.model.ExerciseType
import com.example.chineselearning.data.model.MatchPairItem
import com.example.chineselearning.data.model.PictureOption

val bab16Stage5Part1Exercises = listOf(
    // 1. Soal 1: Pilihan Gambar (都 -> semua / seluruhnya)
    Exercise(
        id = "u16_s5_p1_q1",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "都",
        targetPinyin = "dōu",
        targetTranslation = "semua / seluruhnya",
        correctAnswer = "semua / seluruhnya",
        audioToSpeak = "都",
        pictureOptions = listOf(
            PictureOption("u16_s5_p1_opt1", "semua", "💯", R.drawable.ic_coin, true),
            PictureOption("u16_s5_p1_opt2", "satu", "1️⃣", R.drawable.ic_target, false),
            PictureOption("u16_s5_p1_opt3", "sedikit", "🤏", R.drawable.ic_book, false),
            PictureOption("u16_s5_p1_opt4", "tidak", "❌", R.drawable.ic_crown, false)
        )
    ),

    // 2. Soal 2: Susun Kalimat (Kami semua adalah mahasiswa.)
    Exercise(
        id = "u16_s5_p1_q2",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Kami semua adalah mahasiswa.",
        targetHanzi = "我们 都 是 大学生。",
        targetPinyin = "Wǒmen dōu shì dàxuéshēng.",
        wordChips = listOf("我们:wǒmen", "都:dōu", "是:shì", "大学生。:dàxuéshēng.", "也:yě", "老师:lǎoshī"),
        correctAnswer = "我们,都,是,大学生。",
        audioToSpeak = "我们都是大学生。"
    ),

    // 3. Soal 3: Ketuk Pasangan yang Sesuai (Konjungsi & Adverbia)
    Exercise(
        id = "u16_s5_p1_q3",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u16_s5_p1_m1", "都", "dōu", "semua / seluruhnya"),
            MatchPairItem("u16_s5_p1_m2", "也", "yě", "juga"),
            MatchPairItem("u16_s5_p1_m3", "还", "hái", "masih / juga"),
            MatchPairItem("u16_s5_p1_m4", "和", "hé", "dan / bersama")
        )
    ),

    // 4. Soal 4: Ketik Pinyin (semua -> dōu)
    Exercise(
        id = "u16_s5_p1_q4",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "semua / seluruhnya",
        sentenceWithBlank = "都 (________)",
        targetHanzi = "都",
        targetPinyin = "dōu",
        correctAnswer = "dou",
        keyboardKeys = listOf("d", "o", "u", "a", "e", "i", "b", "g", "h", "j", "l"),
        audioToSpeak = "都"
    ),

    // 5. Soal 5: Mendengar Kalimat (Rule 10: illustrationRes = 0)
    Exercise(
        id = "u16_s5_p1_q5",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Apa yang Anda dengar?",
        targetTranslation = "Dia juga menyukai bahasa Mandarin.",
        targetHanzi = "他 也 喜欢 汉语。",
        targetPinyin = "Tā yě xǐhuan Hànyǔ.",
        wordChips = listOf("他:tā", "也:yě", "喜欢:xǐhuan", "汉语。:Hànyǔ.", "都:dōu"),
        correctAnswer = "他,也,喜欢,汉语。",
        illustrationRes = 0,
        audioToSpeak = "他也喜欢汉语。"
    ),

    // 6. Soal 6: Pilihan Kalimat
    Exercise(
        id = "u16_s5_p1_q6",
        type = ExerciseType.SENTENCE_CHOICE,
        title = "Pilih terjemahan yang benar",
        targetHanzi = "爸爸 妈妈 都 在 家。",
        targetPinyin = "Bàba māma dōu zài jiā.",
        targetTranslation = "Ayah dan ibu semua ada di rumah.",
        correctAnswer = "Bàba māma dōu zài jiā.\n爸爸 妈妈 都 在 家。",
        options = listOf(
            "Bàba māma dōu zài jiā.\n爸爸 妈妈 都 在 家。",
            "Bàba māma yě zài jiā.\n爸爸 妈妈 也 在 家。",
            "Bàba māma dōu zài gōngsī.\n爸爸 妈妈 都 在 公司。"
        ),
        audioToSpeak = "爸爸妈妈都在家。"
    ),

    // 7. Soal 7: Pilihan Gambar (也 -> juga)
    Exercise(
        id = "u16_s5_p1_q7",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "也",
        targetPinyin = "yě",
        targetTranslation = "juga",
        correctAnswer = "juga",
        audioToSpeak = "也",
        pictureOptions = listOf(
            PictureOption("u16_s5_p1_opt7_1", "juga", "➕", R.drawable.ic_coin, true),
            PictureOption("u16_s5_p1_opt7_2", "tidak", "❌", R.drawable.ic_target, false),
            PictureOption("u16_s5_p1_opt7_3", "buku", "📖", R.drawable.ic_book, false),
            PictureOption("u16_s5_p1_opt7_4", "uang", "💰", R.drawable.ic_crown, false)
        )
    ),

    // 8. Soal 8: Ketik Pinyin (juga -> yě)
    Exercise(
        id = "u16_s5_p1_q8",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "juga",
        sentenceWithBlank = "也 (________)",
        targetHanzi = "也",
        targetPinyin = "yě",
        correctAnswer = "ye",
        keyboardKeys = listOf("y", "e", "a", "i", "o", "u", "b", "d", "g", "h", "j"),
        audioToSpeak = "也"
    ),

    // 9. Soal 9: Susun Kalimat (Saya punya apel, juga punya teh.)
    Exercise(
        id = "u16_s5_p1_q9",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Saya ada apel, juga ada teh.",
        targetHanzi = "我 有 苹果， 也 有 茶。",
        targetPinyin = "Wǒ yǒu píngguǒ, yě yǒu chá.",
        wordChips = listOf("我:wǒ", "有:yǒu", "苹果，:píngguǒ,", "也:yě", "有:yǒu", "茶。:chá.", "都:dōu"),
        correctAnswer = "我,有,苹果，,也,有,茶。",
        audioToSpeak = "我有苹果，也有茶。"
    ),

    // 10. Soal 10: Ketuk Pasangan yang Sesuai (Rangkuman Konjungsi)
    Exercise(
        id = "u16_s5_p1_m10_1",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u16_s5_p1_m10_1", "都", "dōu", "semua"),
            MatchPairItem("u16_s5_p1_m2", "也", "yě", "juga"),
            MatchPairItem("u16_s5_p1_m3", "和", "hé", "dan"),
            MatchPairItem("u16_s5_p1_m4", "还", "hái", "masih")
        )
    )
)

val bab16Stage5Part2Exercises = listOf(
    // 1. Soal 1: Pilihan Gambar (怎么 -> bagaimana)
    Exercise(
        id = "u16_s5_p2_q1",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "怎么",
        targetPinyin = "zěnme",
        targetTranslation = "bagaimana",
        correctAnswer = "bagaimana",
        audioToSpeak = "怎么",
        pictureOptions = listOf(
            PictureOption("u16_s5_p2_opt1", "bagaimana", "❓", R.drawable.ic_coin, true),
            PictureOption("u16_s5_p2_opt2", "di mana", "📍", R.drawable.ic_target, false),
            PictureOption("u16_s5_p2_opt3", "siapa", "👤", R.drawable.ic_book, false),
            PictureOption("u16_s5_p2_opt4", "kapan", "⏰", R.drawable.ic_crown, false)
        )
    ),

    // 2. Soal 2: Susun Kalimat (Kamu kenapa?)
    Exercise(
        id = "u16_s5_p2_q2",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Kamu kenapa?",
        targetHanzi = "你 怎么 了？",
        targetPinyin = "Nǐ zěnme le?",
        wordChips = listOf("你:nǐ", "怎么:zěnme", "了？:le?", "好:hǎo", "去:qù"),
        correctAnswer = "你,怎么,了？",
        audioToSpeak = "你怎么了？"
    ),

    // 3. Soal 3: Ketuk Pasangan yang Sesuai (Partikel & Pertanyaan)
    Exercise(
        id = "u16_s5_p2_m3",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u16_s5_p2_m1", "怎么", "zěnme", "bagaimana / kenapa"),
            MatchPairItem("u16_s5_p2_m2", "吧", "ba", "partikel saran / ajakan"),
            MatchPairItem("u16_s5_p2_m3", "呢", "ne", "bagaimana dengan..."),
            MatchPairItem("u16_s5_p2_m4", "再见", "zàijiàn", "sampai jumpa")
        )
    ),

    // 4. Soal 4: Ketik Pinyin (bagaimana/kenapa -> zěnme)
    Exercise(
        id = "u16_s5_p2_q4",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "bagaimana / kenapa",
        sentenceWithBlank = "怎么 (________)",
        targetHanzi = "怎么",
        targetPinyin = "zěnme",
        correctAnswer = "zenme",
        keyboardKeys = listOf("z", "e", "n", "m", "a", "i", "o", "u", "b", "d", "g"),
        audioToSpeak = "怎么"
    ),

    // 5. Soal 5: Mendengar Kalimat (Rule 10: illustrationRes = 0)
    Exercise(
        id = "u16_s5_p2_q5",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Apa yang Anda dengar?",
        targetTranslation = "Bagaimana dengan kamu?",
        targetHanzi = "你 呢？",
        targetPinyin = "Nǐ ne?",
        wordChips = listOf("你:nǐ", "呢？:ne?", "我:wǒ", "他:tā"),
        correctAnswer = "你,呢？",
        illustrationRes = 0,
        audioToSpeak = "你呢？"
    ),

    // 6. Soal 6: Pilihan Kalimat
    Exercise(
        id = "u16_s5_p2_q6",
        type = ExerciseType.SENTENCE_CHOICE,
        title = "Pilih terjemahan yang benar",
        targetHanzi = "我们 去 吃饭 吧。",
        targetPinyin = "Wǒmen qù chīfàn ba.",
        targetTranslation = "Ayo kita pergi makan.",
        correctAnswer = "Wǒmen qù chīfàn ba.\n我们 去 吃饭 吧。",
        options = listOf(
            "Wǒmen qù chīfàn ba.\n我们 去 吃饭 吧。",
            "Wǒmen qù xuéxí ba.\n我们 去 学习 吧。",
            "Tāmen qù chīfàn ba.\n他们 去 吃饭 吧。"
        ),
        audioToSpeak = "我们去吃饭吧。"
    ),

    // 7. Soal 7: Pilihan Gambar (再见 -> sampai jumpa)
    Exercise(
        id = "u16_s5_p2_q7",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "再见",
        targetPinyin = "zàijiàn",
        targetTranslation = "sampai jumpa",
        correctAnswer = "sampai jumpa",
        audioToSpeak = "再见",
        pictureOptions = listOf(
            PictureOption("u16_s5_p2_opt7_1", "sampai jumpa", "👋", R.drawable.ic_coin, true),
            PictureOption("u16_s5_p2_opt7_2", "halo", "🤝", R.drawable.ic_target, false),
            PictureOption("u16_s5_p2_opt7_3", "terima kasih", "🙏", R.drawable.ic_book, false),
            PictureOption("u16_s5_p2_opt7_4", "maaf", "🙇", R.drawable.ic_crown, false)
        )
    ),

    // 8. Soal 8: Ketik Pinyin (sampai jumpa -> zàijiàn)
    Exercise(
        id = "u16_s5_p2_q8",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "sampai jumpa",
        sentenceWithBlank = "再见 (________)",
        targetHanzi = "再见",
        targetPinyin = "zàijiàn",
        correctAnswer = "zaijian",
        keyboardKeys = listOf("z", "a", "i", "j", "n", "e", "o", "u", "b", "d", "g"),
        audioToSpeak = "再见"
    ),

    // 9. Soal 9: Susun Kalimat (Mari kita pulang ke rumah.)
    Exercise(
        id = "u16_s5_p2_q9",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Ayo kita pulang ke rumah.",
        targetHanzi = "我们 回家 吧。",
        targetPinyin = "Wǒmen huíjiā ba.",
        wordChips = listOf("我们:wǒmen", "回家:huíjiā", "吧。:ba.", "去:qù", "学校:xuéxiào"),
        correctAnswer = "我们,回家,吧。",
        audioToSpeak = "我们回家吧。"
    ),

    // 10. Soal 10: Ketuk Pasangan yang Sesuai (Rangkuman Partikel Akhir)
    Exercise(
        id = "u16_s5_p2_m10_1",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u16_s5_p2_m10_1", "吧", "ba", "partikel ajakan"),
            MatchPairItem("u16_s5_p2_m10_2", "呢", "ne", "bagaimana dengan"),
            MatchPairItem("u16_s5_p2_m10_3", "怎么去", "zěnme qù", "bagaimana perginya"),
            MatchPairItem("u16_s5_p2_m10_4", "再见", "zàijiàn", "sampai jumpa")
        )
    )
)
