package com.example.chineselearning.data.repository

import com.example.chineselearning.R
import com.example.chineselearning.data.model.Exercise
import com.example.chineselearning.data.model.ExerciseType
import com.example.chineselearning.data.model.MatchPairItem
import com.example.chineselearning.data.model.PictureOption

val bab16Stage4Part1Exercises = listOf(
    // 1. Soal 1: Pilihan Gambar (这些 -> ini semua)
    Exercise(
        id = "u16_s4_p1_q1",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "这些",
        targetPinyin = "zhèxiē",
        targetTranslation = "ini semua",
        correctAnswer = "ini semua",
        audioToSpeak = "这些",
        pictureOptions = listOf(
            PictureOption("u16_s4_p1_opt1", "ini semua", "👈", R.drawable.ic_coin, true),
            PictureOption("u16_s4_p1_opt2", "itu semua", "👉", R.drawable.ic_target, false),
            PictureOption("u16_s4_p1_opt3", "buku", "📖", R.drawable.ic_book, false),
            PictureOption("u16_s4_p1_opt4", "uang", "💰", R.drawable.ic_crown, false)
        )
    ),

    // 2. Soal 2: Susun Kalimat (Barang-barang ini sangat murah.)
    Exercise(
        id = "u16_s4_p1_q2",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Barang-barang ini sangat murah.",
        targetHanzi = "这些 东西 很 便宜。",
        targetPinyin = "Zhèxiē dōngxi hěn piányi.",
        wordChips = listOf("这些:zhèxiē", "东西:dōngxi", "很:hěn", "便宜。:piányi.", "贵:guì"),
        correctAnswer = "这些,东西,很,便宜。",
        audioToSpeak = "这些东西很便宜。"
    ),

    // 3. Soal 3: Ketuk Pasangan yang Sesuai (Demonstratif Jamak)
    Exercise(
        id = "u16_s4_p1_q3",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u16_s4_p1_m1", "这些", "zhèxiē", "ini semua"),
            MatchPairItem("u16_s4_p1_m2", "那些", "nàxiē", "itu semua"),
            MatchPairItem("u16_s4_p1_m3", "哪些", "nǎxiē", "yang mana saja"),
            MatchPairItem("u16_s4_p1_m4", "这些书", "zhèxiē shū", "buku-buku ini")
        )
    ),

    // 4. Soal 4: Ketik Pinyin (ini semua -> zhèxiē)
    Exercise(
        id = "u16_s4_p1_q4",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "ini semua",
        sentenceWithBlank = "这些 (________)",
        targetHanzi = "这些",
        targetPinyin = "zhèxiē",
        correctAnswer = "zhexie",
        keyboardKeys = listOf("z", "h", "e", "x", "i", "a", "o", "u", "b", "d", "g"),
        audioToSpeak = "这些"
    ),

    // 5. Soal 5: Mendengar Kalimat (Rule 10: illustrationRes = 0)
    Exercise(
        id = "u16_s4_p1_q5",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Apa yang Anda dengar?",
        targetTranslation = "Orang-orang itu semua adalah teman saya.",
        targetHanzi = "那些 人 都 是 我 朋友。",
        targetPinyin = "Nàxiē rén dōu shì wǒ péngyou.",
        wordChips = listOf("那些:nàxiē", "人:rén", "都:dōu", "是:shì", "我:wǒ", "朋友。:péngyou."),
        correctAnswer = "那些,人,都,是,我,朋友。",
        illustrationRes = 0,
        audioToSpeak = "那些人都是我朋友。"
    ),

    // 6. Soal 6: Pilihan Kalimat
    Exercise(
        id = "u16_s4_p1_q6",
        type = ExerciseType.SENTENCE_CHOICE,
        title = "Pilih terjemahan yang benar",
        targetHanzi = "哪些 是 你 的 书？",
        targetPinyin = "Nǎxiē shì nǐ de shū?",
        targetTranslation = "Yang mana sajakah buku milikmu?",
        correctAnswer = "Nǎxiē shì nǐ de shū?\n哪些 是 你 的 书？",
        options = listOf(
            "Nǎxiē shì nǐ de shū?\n哪些 是 你 的 书？",
            "Zhèxiē shì nǐ de shū?\n这些 是 你 的 书？",
            "Nàxiē shì nǐ de shū?\n那些 是 你 的 书？"
        ),
        audioToSpeak = "哪些是你的书？"
    ),

    // 7. Soal 7: Pilihan Gambar (那些 -> itu semua)
    Exercise(
        id = "u16_s4_p1_q7",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "那些",
        targetPinyin = "nàxiē",
        targetTranslation = "itu semua",
        correctAnswer = "itu semua",
        audioToSpeak = "那些",
        pictureOptions = listOf(
            PictureOption("u16_s4_p1_opt7_1", "itu semua", "👉", R.drawable.ic_coin, true),
            PictureOption("u16_s4_p1_opt7_2", "ini semua", "👈", R.drawable.ic_target, false),
            PictureOption("u16_s4_p1_opt7_3", "buku", "📖", R.drawable.ic_book, false),
            PictureOption("u16_s4_p1_opt7_4", "uang", "💰", R.drawable.ic_crown, false)
        )
    ),

    // 8. Soal 8: Ketik Pinyin (itu semua -> nàxiē)
    Exercise(
        id = "u16_s4_p1_q8",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "itu semua",
        sentenceWithBlank = "那些 (________)",
        targetHanzi = "那些",
        targetPinyin = "nàxiē",
        correctAnswer = "naxie",
        keyboardKeys = listOf("n", "a", "x", "i", "e", "o", "u", "b", "d", "g", "h"),
        audioToSpeak = "那些"
    ),

    // 9. Soal 9: Susun Kalimat (Apel-apel ini sangat manis.)
    Exercise(
        id = "u16_s4_p1_q9",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Apel-apel ini sangat enak.",
        targetHanzi = "这些 苹果 很 好吃。",
        targetPinyin = "Zhèxiē píngguǒ hěn hǎochī.",
        wordChips = listOf("这些:zhèxiē", "苹果:píngguǒ", "很:hěn", "好吃。:hǎochī.", "那些:nàxiē"),
        correctAnswer = "这些,苹果,很,好吃。",
        audioToSpeak = "这些苹果很好吃。"
    ),

    // 10. Soal 10: Ketuk Pasangan yang Sesuai (Rangkuman Jamak)
    Exercise(
        id = "u16_s4_p1_m10_1",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u16_s4_p1_m10_1", "这些", "zhèxiē", "ini semua"),
            MatchPairItem("u16_s4_p1_m10_2", "那些", "nàxiē", "itu semua"),
            MatchPairItem("u16_s4_p1_m10_3", "哪些", "nǎxiē", "yang mana saja"),
            MatchPairItem("u16_s4_p1_m10_4", "这些东西", "zhèxiē dōngxi", "barang-barang ini")
        )
    )
)

val bab16Stage4Part2Exercises = listOf(
    // 1. Soal 1: Pilihan Gambar (大家 -> semua orang)
    Exercise(
        id = "u16_s4_p2_q1",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "大家",
        targetPinyin = "dàjiā",
        targetTranslation = "semua orang",
        correctAnswer = "semua orang",
        audioToSpeak = "大家",
        pictureOptions = listOf(
            PictureOption("u16_s4_p2_opt1", "semua orang", "👥", R.drawable.ic_coin, true),
            PictureOption("u16_s4_p2_opt2", "satu orang", "👤", R.drawable.ic_target, false),
            PictureOption("u16_s4_p2_opt3", "rumah", "🏠", R.drawable.ic_book, false),
            PictureOption("u16_s4_p2_opt4", "buku", "📖", R.drawable.ic_crown, false)
        )
    ),

    // 2. Soal 2: Susun Kalimat (Halo semuanya!)
    Exercise(
        id = "u16_s4_p2_q2",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Halo semuanya!",
        targetHanzi = "大家 好！",
        targetPinyin = "Dàjiā hǎo!",
        wordChips = listOf("大家:dàjiā", "好！:hǎo!", "老师:lǎoshī", "再见:zàijiàn"),
        correctAnswer = "大家,好！",
        audioToSpeak = "大家好！"
    ),

    // 3. Soal 3: Ketuk Pasangan yang Sesuai (Kolektif & Sebagian)
    Exercise(
        id = "u16_s4_p2_m3",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u16_s4_p2_m1", "大家", "dàjiā", "semua orang / hadirin"),
            MatchPairItem("u16_s4_p2_m2", "有的", "yǒude", "beberapa di antaranya"),
            MatchPairItem("u16_s4_p2_m3", "有些", "yǒuxiē", "beberapa"),
            MatchPairItem("u16_s4_p2_m4", "大家好", "dàjiā hǎo", "halo semuanya")
        )
    ),

    // 4. Soal 4: Ketik Pinyin (semua orang -> dàjiā)
    Exercise(
        id = "u16_s4_p2_q4",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "semua orang / hadirin",
        sentenceWithBlank = "大家 (________)",
        targetHanzi = "大家",
        targetPinyin = "dàjiā",
        correctAnswer = "dajia",
        keyboardKeys = listOf("d", "a", "j", "i", "e", "o", "u", "b", "g", "h", "l"),
        audioToSpeak = "大家"
    ),

    // 5. Soal 5: Mendengar Kalimat (Rule 10: illustrationRes = 0)
    Exercise(
        id = "u16_s4_p2_q5",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Apa yang Anda dengar?",
        targetTranslation = "Semua orang sangat senang.",
        targetHanzi = "大家 都 很 高兴。",
        targetPinyin = "Dàjiā dōu hěn gāoxìng.",
        wordChips = listOf("大家:dàjiā", "都:dōu", "很:hěn", "高兴。:gāoxìng.", "我:wǒ"),
        correctAnswer = "大家,都,很,高兴。",
        illustrationRes = 0,
        audioToSpeak = "大家都很高兴。"
    ),

    // 6. Soal 6: Pilihan Kalimat
    Exercise(
        id = "u16_s4_p2_q6",
        type = ExerciseType.SENTENCE_CHOICE,
        title = "Pilih terjemahan yang benar",
        targetHanzi = "有的 人 喜欢 喝 茶。",
        targetPinyin = "Yǒude rén xǐhuan hē chá.",
        targetTranslation = "Beberapa orang suka minum teh.",
        correctAnswer = "Yǒude rén xǐhuan hē chá.\n有的 人 喜欢 喝 茶。",
        options = listOf(
            "Yǒude rén xǐhuan hē chá.\n有的 人 喜欢 喝 茶。",
            "Dàjiā dōu xǐhuan hē chá.\n大家 都 喜欢 喝 茶。",
            "Yǒude rén xǐhuan hē shuǐ.\n有的 人 喜欢 喝 水。"
        ),
        audioToSpeak = "有的人喜欢喝茶。"
    ),

    // 7. Soal 7: Pilihan Gambar (有的 -> beberapa)
    Exercise(
        id = "u16_s4_p2_q7",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "有的",
        targetPinyin = "yǒude",
        targetTranslation = "beberapa di antaranya",
        correctAnswer = "beberapa di antaranya",
        audioToSpeak = "有的",
        pictureOptions = listOf(
            PictureOption("u16_s4_p2_opt7_1", "beberapa", "📦", R.drawable.ic_coin, true),
            PictureOption("u16_s4_p2_opt7_2", "semua", "💯", R.drawable.ic_target, false),
            PictureOption("u16_s4_p2_opt7_3", "tidak ada", "⭕", R.drawable.ic_book, false),
            PictureOption("u16_s4_p2_opt7_4", "satu", "1️⃣", R.drawable.ic_crown, false)
        )
    ),

    // 8. Soal 8: Ketik Pinyin (beberapa -> yǒude)
    Exercise(
        id = "u16_s4_p2_q8",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "beberapa di antaranya",
        sentenceWithBlank = "有的 (________)",
        targetHanzi = "有的",
        targetPinyin = "yǒude",
        correctAnswer = "youde",
        keyboardKeys = listOf("y", "o", "u", "d", "e", "a", "i", "b", "g", "h", "j"),
        audioToSpeak = "有的"
    ),

    // 9. Soal 9: Susun Kalimat (Semua orang suka belajar bahasa Mandarin.)
    Exercise(
        id = "u16_s4_p2_q9",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Semua orang suka belajar Mandarin.",
        targetHanzi = "大家 都 喜欢 学 汉语。",
        targetPinyin = "Dàjiā dōu xǐhuan xué Hànyǔ.",
        wordChips = listOf("大家:dàjiā", "都:dōu", "喜欢:xǐhuan", "学:xué", "汉语。:Hànyǔ.", "有的:yǒude"),
        correctAnswer = "大家,都,喜欢,学,汉语。",
        audioToSpeak = "大家都喜欢学汉语。"
    ),

    // 10. Soal 10: Ketuk Pasangan yang Sesuai (Rangkuman Kolektif)
    Exercise(
        id = "u16_s4_p2_m10_1",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u16_s4_p2_m10_1", "大家", "dàjiā", "semua orang"),
            MatchPairItem("u16_s4_p2_m2", "有的", "yǒude", "beberapa"),
            MatchPairItem("u16_s4_p2_m3", "有些人", "yǒuxiē rén", "beberapa orang"),
            MatchPairItem("u16_s4_p2_m4", "都很好", "dōu hěn hǎo", "semuanya baik")
        )
    )
)
