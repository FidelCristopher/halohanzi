package com.example.chineselearning.data.repository

import com.example.chineselearning.R
import com.example.chineselearning.data.model.Exercise
import com.example.chineselearning.data.model.ExerciseType
import com.example.chineselearning.data.model.MatchPairItem
import com.example.chineselearning.data.model.PictureOption

val bab15Stage4Part1Exercises = listOf(
    // 1. Soal 1: Pilihan Gambar (认识 -> mengenal / kenal)
    Exercise(
        id = "u15_s4_p1_q1",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "认识",
        targetPinyin = "rènshi",
        targetTranslation = "mengenal / kenal",
        correctAnswer = "mengenal / kenal",
        audioToSpeak = "认识",
        pictureOptions = listOf(
            PictureOption("u15_s4_p1_opt1", "mengenal", "🤝", R.drawable.ic_coin, true),
            PictureOption("u15_s4_p1_opt2", "tidur", "🛌", R.drawable.ic_target, false),
            PictureOption("u15_s4_p1_opt3", "makan", "🍜", R.drawable.ic_book, false),
            PictureOption("u15_s4_p1_opt4", "lari", "🏃", R.drawable.ic_crown, false)
        )
    ),

    // 2. Soal 2: Susun Kalimat (Senang berkenalan dengan Anda.)
    Exercise(
        id = "u15_s4_p1_q2",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Senang berkenalan denganmu.",
        targetHanzi = "认识 你 很 高兴。",
        targetPinyin = "Rènshi nǐ hěn gāoxìng.",
        wordChips = listOf("认识:rènshi", "你:nǐ", "很:hěn", "高兴。:gāoxìng.", "您:nín", "他:tā"),
        correctAnswer = "认识,你,很,高兴。",
        audioToSpeak = "认识你很高兴。"
    ),

    // 3. Soal 3: Ketuk Pasangan yang Sesuai (Kenal & Senang)
    Exercise(
        id = "u15_s4_p1_q3",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u15_s4_p1_m1", "认识", "rènshi", "mengenal / kenal"),
            MatchPairItem("u15_s4_p1_m2", "高兴", "gāoxìng", "senang / bahagia"),
            MatchPairItem("u15_s4_p1_m3", "认识你", "rènshi nǐ", "kenal denganmu"),
            MatchPairItem("u15_s4_p1_m4", "很高兴", "hěn gāoxìng", "sangat senang")
        )
    ),

    // 4. Soal 4: Ketik Pinyin (mengenal -> rènshi)
    Exercise(
        id = "u15_s4_p1_q4",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "mengenal / kenal",
        sentenceWithBlank = "认识 (________)",
        targetHanzi = "认识",
        targetPinyin = "rènshi",
        correctAnswer = "renshi",
        keyboardKeys = listOf("r", "e", "n", "s", "h", "i", "a", "o", "u", "b", "d"),
        audioToSpeak = "认识"
    ),

    // 5. Soal 5: Mendengar Kalimat (Rule 10: illustrationRes = 0)
    Exercise(
        id = "u15_s4_p1_q5",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Apa yang Anda dengar?",
        targetTranslation = "Senang berkenalan dengan Anda.",
        targetHanzi = "很 高兴 认识 您。",
        targetPinyin = "Hěn gāoxìng rènshi nín.",
        wordChips = listOf("很:hěn", "高兴:gāoxìng", "认识:rènshi", "您。:nín.", "你:nǐ"),
        correctAnswer = "很,高兴,认识,您。",
        illustrationRes = 0,
        audioToSpeak = "很高兴认识您。"
    ),

    // 6. Soal 6: Pilihan Kalimat
    Exercise(
        id = "u15_s4_p1_q6",
        type = ExerciseType.SENTENCE_CHOICE,
        title = "Pilih terjemahan yang benar",
        targetHanzi = "你 认识 他 吗？",
        targetPinyin = "Nǐ rènshi tā ma?",
        targetTranslation = "Apakah kamu kenal dia?",
        correctAnswer = "Nǐ rènshi tā ma?\n你 认识 他 吗？",
        options = listOf(
            "Nǐ rènshi tā ma?\n你 认识 他 吗？",
            "Tā rènshi nǐ ma?\n他 认识 你 吗？",
            "Nǐ zhīdào tā ma?\n你 知道 他 吗？"
        ),
        audioToSpeak = "你认识他吗？"
    ),

    // 7. Soal 7: Pilihan Gambar (高兴 -> senang / bahagia)
    Exercise(
        id = "u15_s4_p1_q7",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "高兴",
        targetPinyin = "gāoxìng",
        targetTranslation = "senang / bahagia",
        correctAnswer = "senang / bahagia",
        audioToSpeak = "高兴",
        pictureOptions = listOf(
            PictureOption("u15_s4_p1_opt7_1", "senang", "😄", R.drawable.ic_coin, true),
            PictureOption("u15_s4_p1_opt7_2", "sedih", "😢", R.drawable.ic_target, false),
            PictureOption("u15_s4_p1_opt7_3", "marah", "😡", R.drawable.ic_book, false),
            PictureOption("u15_s4_p1_opt7_4", "tidur", "🛌", R.drawable.ic_crown, false)
        )
    ),

    // 8. Soal 8: Ketik Pinyin (senang -> gāoxìng)
    Exercise(
        id = "u15_s4_p1_q8",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "senang / bahagia",
        sentenceWithBlank = "高兴 (________)",
        targetHanzi = "高兴",
        targetPinyin = "gāoxìng",
        correctAnswer = "gaoxing",
        keyboardKeys = listOf("g", "a", "o", "x", "i", "n", "e", "u", "b", "d", "h"),
        audioToSpeak = "高兴"
    ),

    // 9. Soal 9: Susun Kalimat (Saya kenal Guru Wang.)
    Exercise(
        id = "u15_s4_p1_q9",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Saya kenal Guru Wang.",
        targetHanzi = "我 认识 王 老师。",
        targetPinyin = "Wǒ rènshi Wáng lǎoshī.",
        wordChips = listOf("我:wǒ", "认识:rènshi", "王:Wáng", "老师:lǎoshī", "知道:zhīdào"),
        correctAnswer = "我,认识,王,老师",
        audioToSpeak = "我认识王老师。"
    ),

    // 10. Soal 10: Ketuk Pasangan yang Sesuai (Rangkuman Perkenalan)
    Exercise(
        id = "u15_s4_p1_m10_1",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u15_s4_p1_m10_1", "认识", "rènshi", "kenal"),
            MatchPairItem("u15_s4_p1_m10_2", "高兴", "gāoxìng", "senang"),
            MatchPairItem("u15_s4_p1_m10_3", "不认识", "bú rènshi", "tidak kenal"),
            MatchPairItem("u15_s4_p1_m10_4", "认识您", "rènshi nín", "kenal Anda")
        )
    )
)

val bab15Stage4Part2Exercises = listOf(
    // 1. Soal 1: Pilihan Gambar (知道 -> mengetahui / tahu)
    Exercise(
        id = "u15_s4_p2_q1",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "知道",
        targetPinyin = "zhīdào",
        targetTranslation = "mengetahui",
        correctAnswer = "mengetahui",
        audioToSpeak = "知道",
        pictureOptions = listOf(
            PictureOption("u15_s4_p2_opt1", "tahu / paham", "💡", R.drawable.ic_coin, true),
            PictureOption("u15_s4_p2_opt2", "tidak tahu", "🤷", R.drawable.ic_target, false),
            PictureOption("u15_s4_p2_opt3", "buku", "📖", R.drawable.ic_book, false),
            PictureOption("u15_s4_p2_opt4", "uang", "💰", R.drawable.ic_crown, false)
        )
    ),

    // 2. Soal 2: Susun Kalimat (Saya tahu hal ini.)
    Exercise(
        id = "u15_s4_p2_q2",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Saya tahu hal ini.",
        targetHanzi = "我 知道 这个 事。",
        targetPinyin = "Wǒ zhīdào zhège shì.",
        wordChips = listOf("我:wǒ", "知道:zhīdào", "这个:zhège", "事:shì", "不:bù", "觉得:juéde"),
        correctAnswer = "我,知道,这个,事",
        audioToSpeak = "我知道这个事。"
    ),

    // 3. Soal 3: Ketuk Pasangan yang Sesuai (Tahu & Merasa)
    Exercise(
        id = "u15_s4_p2_m3",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u15_s4_p2_m1", "知道", "zhīdào", "mengetahui / tahu"),
            MatchPairItem("u15_s4_p2_m2", "觉得", "juéde", "merasakan / berpikir"),
            MatchPairItem("u15_s4_p2_m3", "不知道", "bù zhīdào", "tidak tahu"),
            MatchPairItem("u15_s4_p2_m4", "我觉得很好", "wǒ juéde hěn hǎo", "saya rasa baik")
        )
    ),

    // 4. Soal 4: Ketik Pinyin (mengetahui -> zhīdào)
    Exercise(
        id = "u15_s4_p2_q4",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "mengetahui / tahu",
        sentenceWithBlank = "知道 (________)",
        targetHanzi = "知道",
        targetPinyin = "zhīdào",
        correctAnswer = "zhidao",
        keyboardKeys = listOf("z", "h", "i", "d", "a", "o", "e", "u", "b", "g", "j"),
        audioToSpeak = "知道"
    ),

    // 5. Soal 5: Mendengar Kalimat (Rule 10: illustrationRes = 0)
    Exercise(
        id = "u15_s4_p2_q5",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Apa yang Anda dengar?",
        targetTranslation = "Saya rasa masakan ini sangat enak.",
        targetHanzi = "我 觉得 这个 菜 很 好吃。",
        targetPinyin = "Wǒ juéde zhège cài hěn hǎochī.",
        wordChips = listOf("我:wǒ", "觉得:juéde", "这个:zhège", "菜:cài", "很:hěn", "好吃:hǎochī"),
        correctAnswer = "我,觉得,这个,菜,很,好吃",
        illustrationRes = 0,
        audioToSpeak = "我觉得这个菜很好吃。"
    ),

    // 6. Soal 6: Pilihan Kalimat
    Exercise(
        id = "u15_s4_p2_q6",
        type = ExerciseType.SENTENCE_CHOICE,
        title = "Pilih terjemahan yang benar",
        targetHanzi = "你 觉得 怎么样？",
        targetPinyin = "Nǐ juéde zěnmeyàng?",
        targetTranslation = "Bagaimana menurutmu?",
        correctAnswer = "Nǐ juéde zěnmeyàng?\n你 觉得 怎么样？",
        options = listOf(
            "Nǐ juéde zěnmeyàng?\n你 觉得 怎么样？",
            "Tā juéde zěnmeyàng?\n他 觉得 怎么样？",
            "Nǐ zhīdào zěnmeyàng?\n你 知道 怎么样？"
        ),
        audioToSpeak = "你觉得怎么样？"
    ),

    // 7. Soal 7: Pilihan Gambar (觉得 -> merasa / berpendapat)
    Exercise(
        id = "u15_s4_p2_q7",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "觉得",
        targetPinyin = "juéde",
        targetTranslation = "merasa / berpendapat",
        correctAnswer = "merasa / berpendapat",
        audioToSpeak = "觉得",
        pictureOptions = listOf(
            PictureOption("u15_s4_p2_opt7_1", "merasa / berpikir", "💭", R.drawable.ic_coin, true),
            PictureOption("u15_s4_p2_opt7_2", "makan", "🍜", R.drawable.ic_target, false),
            PictureOption("u15_s4_p2_opt7_3", "tidur", "🛌", R.drawable.ic_book, false),
            PictureOption("u15_s4_p2_opt7_4", "lari", "🏃", R.drawable.ic_crown, false)
        )
    ),

    // 8. Soal 8: Ketik Pinyin (merasa/berpendapat -> juéde)
    Exercise(
        id = "u15_s4_p2_q8",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "merasa / berpendapat",
        sentenceWithBlank = "觉得 (________)",
        targetHanzi = "觉得",
        targetPinyin = "juéde",
        correctAnswer = "juede",
        keyboardKeys = listOf("j", "u", "e", "d", "a", "i", "o", "b", "g", "h", "l"),
        audioToSpeak = "觉得"
    ),

    // 9. Soal 9: Susun Kalimat (Saya merasa sangat senang.)
    Exercise(
        id = "u15_s4_p2_q9",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Saya merasa sangat senang.",
        targetHanzi = "我 觉得 很 高兴。",
        targetPinyin = "Wǒ juéde hěn gāoxìng.",
        wordChips = listOf("我:wǒ", "觉得:juéde", "很:hěn", "高兴:gāoxìng", "知道:zhīdào"),
        correctAnswer = "我,觉得,很,高兴",
        audioToSpeak = "我觉得很高兴。"
    ),

    // 10. Soal 10: Ketuk Pasangan yang Sesuai (Rangkuman Kognisi & Opini)
    Exercise(
        id = "u15_s4_p2_m10_1",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u15_s4_p2_m10_1", "知道", "zhīdào", "mengetahui"),
            MatchPairItem("u15_s4_p2_m10_2", "觉得", "juéde", "merasa"),
            MatchPairItem("u15_s4_p2_m10_3", "不知道", "bù zhīdào", "tidak tahu"),
            MatchPairItem("u15_s4_p2_m10_4", "我觉得", "wǒ juéde", "menurut saya")
        )
    )
)
