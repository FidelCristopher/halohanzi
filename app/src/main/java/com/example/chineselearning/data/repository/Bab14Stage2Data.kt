package com.example.chineselearning.data.repository

import com.example.chineselearning.R
import com.example.chineselearning.data.model.Exercise
import com.example.chineselearning.data.model.ExerciseType
import com.example.chineselearning.data.model.MatchPairItem
import com.example.chineselearning.data.model.PictureOption

val bab14Stage2Part1Exercises = listOf(
    // 1. Soal 1: Pilihan Gambar (歌 -> lagu)
    Exercise(
        id = "u14_s2_p1_q1",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "歌",
        targetPinyin = "gē",
        targetTranslation = "lagu",
        correctAnswer = "lagu",
        audioToSpeak = "歌",
        pictureOptions = listOf(
            PictureOption("u14_s2_p1_opt1", "lagu", "", R.drawable.ic_hobby_song, true),
            PictureOption("u14_s2_p1_opt2", "buku", "", R.drawable.ic_book_chinese, false),
            PictureOption("u14_s2_p1_opt3", "uang", "", R.drawable.ic_yuan_currency, false),
            PictureOption("u14_s2_p1_opt4", "gelas", "", R.drawable.ic_food_cup, false)
        )
    ),

    // 2. Soal 2: Susun Kalimat (Saya suka mendengarkan lagu.)
    Exercise(
        id = "u14_s2_p1_q2",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Saya suka mendengar lagu.",
        targetHanzi = "我 喜欢 听 歌。",
        targetPinyin = "Wǒ xǐhuan tīng gē.",
        wordChips = listOf("我:wǒ", "喜欢:xǐhuan", "听:tīng", "歌:gē", "唱:chàng", "他:tā"),
        correctAnswer = "我,喜欢,听,歌",
        audioToSpeak = "我喜欢听歌。"
    ),

    // 3. Soal 3: Ketuk Pasangan yang Sesuai (Mendengar & Lagu)
    Exercise(
        id = "u14_s2_p1_q3",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u14_s2_p1_m1", "听", "tīng", "mendengar"),
            MatchPairItem("u14_s2_p1_m2", "歌", "gē", "lagu"),
            MatchPairItem("u14_s2_p1_m3", "听歌", "tīng gē", "mendengarkan lagu"),
            MatchPairItem("u14_s2_p1_m4", "好听", "hǎotīng", "merdu / enak didengar")
        )
    ),

    // 4. Soal 4: Ketik Pinyin (mendengar -> tīng)
    Exercise(
        id = "u14_s2_p1_q4",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "mendengar",
        sentenceWithBlank = "听 (________)",
        targetHanzi = "听",
        targetPinyin = "tīng",
        correctAnswer = "ting",
        keyboardKeys = listOf("t", "i", "n", "g", "a", "e", "o", "u", "b", "d", "h"),
        audioToSpeak = "听"
    ),

    // 5. Soal 5: Mendengar Kalimat (Rule 10: illustrationRes = 0)
    Exercise(
        id = "u14_s2_p1_q5",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Apa yang Anda dengar?",
        targetTranslation = "Lagu ini sangat enak didengar.",
        targetHanzi = "这 首 歌 很 好听。",
        targetPinyin = "Zhè shǒu gē hěn hǎotīng.",
        wordChips = listOf("这:zhè", "首:shǒu", "歌:gē", "很:hěn", "好听:hǎotīng", "好看:hǎokàn"),
        correctAnswer = "这,首,歌,很,好听",
        illustrationRes = 0,
        audioToSpeak = "这首歌很好听。"
    ),

    // 6. Soal 6: Pilihan Kalimat
    Exercise(
        id = "u14_s2_p1_q6",
        type = ExerciseType.SENTENCE_CHOICE,
        title = "Pilih terjemahan yang benar",
        targetHanzi = "他在 听 音乐。",
        targetPinyin = "Tāzài tīng yīnyuè.",
        targetTranslation = "Dia sedang mendengarkan musik.",
        correctAnswer = "Tāzài tīng yīnyuè.\n他在 听 音乐。",
        options = listOf(
            "Tāzài tīng yīnyuè.\n他在 听 音乐。",
            "Tāzài chàng gē.\n他在 唱 歌。",
            "Wǒzài tīng yīnyuè.\n我在 听 音乐。"
        ),
        audioToSpeak = "他在听音乐。"
    ),

    // 7. Soal 7: Pilihan Gambar (听 -> mendengar)
    Exercise(
        id = "u14_s2_p1_q7",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "听",
        targetPinyin = "tīng",
        targetTranslation = "mendengar",
        correctAnswer = "mendengar",
        audioToSpeak = "听",
        pictureOptions = listOf(
            PictureOption("u14_s2_p1_opt7_1", "mendengar", "", R.drawable.ic_hobby_listen, true),
            PictureOption("u14_s2_p1_opt7_2", "melihat", "", R.drawable.ic_work_search, false),
            PictureOption("u14_s2_p1_opt7_3", "makan", "", R.drawable.ic_action_eat, false),
            PictureOption("u14_s2_p1_opt7_4", "tidur", "", R.drawable.ic_action_sleep, false)
        )
    ),

    // 8. Soal 8: Ketik Pinyin (lagu -> gē)
    Exercise(
        id = "u14_s2_p1_q8",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "lagu",
        sentenceWithBlank = "歌 (________)",
        targetHanzi = "歌",
        targetPinyin = "gē",
        correctAnswer = "ge",
        keyboardKeys = listOf("g", "e", "a", "i", "o", "u", "b", "d", "h", "j", "l"),
        audioToSpeak = "歌"
    ),

    // 9. Soal 9: Susun Kalimat (Lagu Tiongkok sangat merdu.)
    Exercise(
        id = "u14_s2_p1_q9",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Lagu Tiongkok sangat merdu.",
        targetHanzi = "中国 歌 很 好听。",
        targetPinyin = "Zhōngguó gē hěn hǎotīng.",
        wordChips = listOf("中国:Zhōngguó", "歌:gē", "很:hěn", "好听:hǎotīng", "好看:hǎokàn"),
        correctAnswer = "中国,歌,很,好听",
        audioToSpeak = "中国歌很好听。"
    ),

    // 10. Soal 10: Ketuk Pasangan yang Sesuai (Rangkuman Musik)
    Exercise(
        id = "u14_s2_p1_m10_1",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u14_s2_p1_m10_1", "歌", "gē", "lagu"),
            MatchPairItem("u14_s2_p1_m10_2", "听歌", "tīng gē", "dengar lagu"),
            MatchPairItem("u14_s2_p1_m10_3", "好听", "hǎotīng", "enak didengar"),
            MatchPairItem("u14_s2_p1_m10_4", "喜欢听", "xǐhuan tīng", "suka mendengar")
        )
    )
)

val bab14Stage2Part2Exercises = listOf(
    // 1. Soal 1: Pilihan Gambar (唱 -> menyanyi)
    Exercise(
        id = "u14_s2_p2_q1",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "唱",
        targetPinyin = "chàng",
        targetTranslation = "menyanyi",
        correctAnswer = "menyanyi",
        audioToSpeak = "唱",
        pictureOptions = listOf(
            PictureOption("u14_s2_p2_opt1", "menyanyi", "", R.drawable.ic_hobby_sing, true),
            PictureOption("u14_s2_p2_opt2", "mendengar", "", R.drawable.ic_hobby_listen, false),
            PictureOption("u14_s2_p2_opt3", "menulis", "", R.drawable.ic_edu_write, false),
            PictureOption("u14_s2_p2_opt4", "makan", "", R.drawable.ic_action_eat, false)
        )
    ),

    // 2. Soal 2: Susun Kalimat (Dia bisa menyanyi.)
    Exercise(
        id = "u14_s2_p2_q2",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Dia bisa menyanyi.",
        targetHanzi = "她 会 唱歌。",
        targetPinyin = "Tā huì chànggē.",
        wordChips = listOf("她:tā", "会:huì", "唱歌:chànggē", "跳舞:tiàowǔ", "我:wǒ"),
        correctAnswer = "她,会,唱歌",
        audioToSpeak = "她会唱歌。"
    ),

    // 3. Soal 3: Ketuk Pasangan yang Sesuai (Menyanyi & Mendengar)
    Exercise(
        id = "u14_s2_p2_m3",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u14_s2_p2_m1", "唱", "chàng", "menyanyi"),
            MatchPairItem("u14_s2_p2_m2", "唱歌", "chànggē", "bernyanyi"),
            MatchPairItem("u14_s2_p2_m3", "听见", "tīngjiàn", "mendengar (terdengar)"),
            MatchPairItem("u14_s2_p2_m4", "唱得好", "chàng de hǎo", "menyanyi dengan baik")
        )
    ),

    // 4. Soal 4: Ketik Pinyin (menyanyi -> chàng)
    Exercise(
        id = "u14_s2_p2_q4",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "menyanyi",
        sentenceWithBlank = "唱 (________)",
        targetHanzi = "唱",
        targetPinyin = "chàng",
        correctAnswer = "chang",
        keyboardKeys = listOf("c", "h", "a", "n", "g", "e", "i", "o", "u", "b", "d"),
        audioToSpeak = "唱"
    ),

    // 5. Soal 5: Mendengar Kalimat (Rule 10: illustrationRes = 0)
    Exercise(
        id = "u14_s2_p2_q5",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Apa yang Anda dengar?",
        targetTranslation = "Apakah kamu mendengar guru berbicara?",
        targetHanzi = "你 听见 老师 说话 了 吗？",
        targetPinyin = "Nǐ tīngjiàn lǎoshī shuōhuà le ma?",
        wordChips = listOf("你:nǐ", "听见:tīngjiàn", "老师:lǎoshī", "说话:shuōhuà", "了:le", "吗？:ma?"),
        correctAnswer = "你,听见,老师,说话,了,吗？",
        illustrationRes = 0,
        audioToSpeak = "你听见老师说话了吗？"
    ),

    // 6. Soal 6: Pilihan Kalimat
    Exercise(
        id = "u14_s2_p2_q6",
        type = ExerciseType.SENTENCE_CHOICE,
        title = "Pilih terjemahan yang benar",
        targetHanzi = "妹妹 唱 得 很 好听。",
        targetPinyin = "Mèimei chàng de hěn hǎotīng.",
        targetTranslation = "Adik menyanyi dengan sangat merdu.",
        correctAnswer = "Mèimei chàng de hěn hǎotīng.\n妹妹 唱 得 很 好听。",
        options = listOf(
            "Mèimei chàng de hěn hǎotīng.\n妹妹 唱 得 很 好听。",
            "Jiějie chàng de hěn hǎotīng.\n姐姐 唱 得 很 好听。",
            "Mèimei chàng de bù hǎotīng.\n妹妹 唱 得 不 好听。"
        ),
        audioToSpeak = "妹妹唱得很好听。"
    ),

    // 7. Soal 7: Pilihan Gambar (好听 -> merdu / enak didengar)
    Exercise(
        id = "u14_s2_p2_q7",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "好听",
        targetPinyin = "hǎotīng",
        targetTranslation = "merdu / enak didengar",
        correctAnswer = "merdu / enak didengar",
        audioToSpeak = "好听",
        pictureOptions = listOf(
            PictureOption("u14_s2_p2_opt7_1", "merdu", "", R.drawable.ic_hobby_song, true),
            PictureOption("u14_s2_p2_opt7_2", "lezat", "", R.drawable.ic_food_delicious, false),
            PictureOption("u14_s2_p2_opt7_3", "cantik", "", R.drawable.ic_hobby_pretty, false),
            PictureOption("u14_s2_p2_opt7_4", "panas", "", R.drawable.ic_weather_hot, false)
        )
    ),

    // 8. Soal 8: Ketik Pinyin (merdu -> hǎotīng)
    Exercise(
        id = "u14_s2_p2_q8",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "merdu / enak didengar",
        sentenceWithBlank = "好听 (________)",
        targetHanzi = "好听",
        targetPinyin = "hǎotīng",
        correctAnswer = "haoting",
        keyboardKeys = listOf("h", "a", "o", "t", "i", "n", "g", "e", "u", "b", "d"),
        audioToSpeak = "好听"
    ),

    // 9. Soal 9: Susun Kalimat (Saya mendengar dia menyanyi.)
    Exercise(
        id = "u14_s2_p2_q9",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Saya dengar dia bernyanyi.",
        targetHanzi = "我 听见 她 唱歌 了。",
        targetPinyin = "Wǒ tīngjiàn tā chànggē le.",
        wordChips = listOf("我:wǒ", "听见:tīngjiàn", "她:tā", "唱歌:chànggē", "了:le", "看:kàn"),
        correctAnswer = "我,听见,她,唱歌,了",
        audioToSpeak = "我听见她唱歌了。"
    ),

    // 10. Soal 10: Ketuk Pasangan yang Sesuai (Rangkuman Bernyanyi)
    Exercise(
        id = "u14_s2_p2_m10_1",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u14_s2_p2_m10_1", "唱歌", "chànggē", "bernyanyi"),
            MatchPairItem("u14_s2_p2_m10_2", "听见", "tīngjiàn", "mendengar"),
            MatchPairItem("u14_s2_p2_m10_3", "很好听", "hěn hǎotīng", "sangat merdu"),
            MatchPairItem("u14_s2_p2_m10_4", "唱一首歌", "chàng yì shǒu gē", "nyanyi sebuah lagu")
        )
    )
)
