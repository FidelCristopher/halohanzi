package com.example.chineselearning.data.repository

import com.example.chineselearning.R
import com.example.chineselearning.data.model.Exercise
import com.example.chineselearning.data.model.ExerciseType
import com.example.chineselearning.data.model.MatchPairItem
import com.example.chineselearning.data.model.PictureOption

val bab15Stage2Part1Exercises = listOf(
    // 1. Soal 1: Pilihan Gambar (请问 -> permisi numpang tanya)
    Exercise(
        id = "u15_s2_p1_q1",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "请问",
        targetPinyin = "qǐngwèn",
        targetTranslation = "permisi numpang tanya",
        correctAnswer = "permisi numpang tanya",
        audioToSpeak = "请问",
        pictureOptions = listOf(
            PictureOption("u15_s2_p1_opt1", "permisi bertanya", "🙋", R.drawable.ic_coin, true),
            PictureOption("u15_s2_p1_opt2", "terima kasih", "🙏", R.drawable.ic_target, false),
            PictureOption("u15_s2_p1_opt3", "maaf", "🙇", R.drawable.ic_book, false),
            PictureOption("u15_s2_p1_opt4", "sampai jumpa", "👋", R.drawable.ic_crown, false)
        )
    ),

    // 2. Soal 2: Susun Kalimat (Permisi, apakah Anda Guru Wang?)
    Exercise(
        id = "u15_s2_p1_q2",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Permisi, Anda Guru Wang?",
        targetHanzi = "请问， 您 是 王 老师 吗？",
        targetPinyin = "Qǐngwèn, nín shì Wáng lǎoshī ma?",
        wordChips = listOf("请问，:qǐngwèn,", "您:nín", "是:shì", "王:Wáng", "老师:lǎoshī", "吗？:ma?", "你:nǐ"),
        correctAnswer = "请问，,您,是,王,老师,吗？",
        audioToSpeak = "请问，您是王老师吗？"
    ),

    // 3. Soal 3: Ketuk Pasangan yang Sesuai (Permohonan Santun)
    Exercise(
        id = "u15_s2_p1_q3",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u15_s2_p1_m1", "请", "qǐng", "silakan / tolong"),
            MatchPairItem("u15_s2_p1_m2", "请问", "qǐngwèn", "permisi bertanya"),
            MatchPairItem("u15_s2_p1_m3", "您", "nín", "Anda (sopan)"),
            MatchPairItem("u15_s2_p1_m4", "请坐", "qǐng zuò", "silakan duduk")
        )
    ),

    // 4. Soal 4: Ketik Pinyin (permisi bertanya -> qǐngwèn)
    Exercise(
        id = "u15_s2_p1_q4",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "permisi bertanya",
        sentenceWithBlank = "请问 (________)",
        targetHanzi = "请问",
        targetPinyin = "qǐngwèn",
        correctAnswer = "qingwen",
        keyboardKeys = listOf("q", "i", "n", "g", "w", "e", "a", "o", "u", "b", "d"),
        audioToSpeak = "请问"
    ),

    // 5. Soal 5: Mendengar Kalimat (Rule 10: illustrationRes = 0)
    Exercise(
        id = "u15_s2_p1_q5",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Apa yang Anda dengar?",
        targetTranslation = "Silakan masuk, silakan duduk.",
        targetHanzi = "请 进， 请 坐。",
        targetPinyin = "Qǐng jìn, qǐng zuò.",
        wordChips = listOf("请:qǐng", "进，:jìn,", "请:qǐng", "坐。:zuò.", "走:zǒu"),
        correctAnswer = "请,进，,请,坐。",
        illustrationRes = 0,
        audioToSpeak = "请进，请坐。"
    ),

    // 6. Soal 6: Pilihan Kalimat
    Exercise(
        id = "u15_s2_p1_q6",
        type = ExerciseType.SENTENCE_CHOICE,
        title = "Pilih terjemahan yang benar",
        targetHanzi = "请问， 火车站 在 哪儿？",
        targetPinyin = "Qǐngwèn, huǒchēzhàn zài nǎr?",
        targetTranslation = "Permisi, stasiun kereta di mana?",
        correctAnswer = "Qǐngwèn, huǒchēzhàn zài nǎr?\n请问， 火车站 在 哪儿？",
        options = listOf(
            "Qǐngwèn, huǒchēzhàn zài nǎr?\n请问， 火车站 在 哪儿？",
            "Qǐngwèn, fànguǎnr zài nǎr?\n请问， 饭馆儿 在 哪儿？",
            "Qǐngwèn, xuéxiào zài nǎr?\n请问， 学校 在 哪儿？"
        ),
        audioToSpeak = "请问，火车站在哪儿？"
    ),

    // 7. Soal 7: Pilihan Gambar (您 -> Anda sopan)
    Exercise(
        id = "u15_s2_p1_q7",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "您",
        targetPinyin = "nín",
        targetTranslation = "Anda (sopan)",
        correctAnswer = "Anda (sopan)",
        audioToSpeak = "您",
        pictureOptions = listOf(
            PictureOption("u15_s2_p1_opt7_1", "Anda (sopan)", "🤝", R.drawable.ic_coin, true),
            PictureOption("u15_s2_p1_opt7_2", "kamu", "👉", R.drawable.ic_target, false),
            PictureOption("u15_s2_p1_opt7_3", "dia", "👤", R.drawable.ic_book, false),
            PictureOption("u15_s2_p1_opt7_4", "mereka", "👥", R.drawable.ic_crown, false)
        )
    ),

    // 8. Soal 8: Ketik Pinyin (Anda sopan -> nín)
    Exercise(
        id = "u15_s2_p1_q8",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "Anda (sopan)",
        sentenceWithBlank = "您 (________)",
        targetHanzi = "您",
        targetPinyin = "nín",
        correctAnswer = "nin",
        keyboardKeys = listOf("n", "i", "a", "e", "o", "u", "b", "d", "g", "h", "j"),
        audioToSpeak = "您"
    ),

    // 9. Soal 9: Susun Kalimat (Halo Anda!)
    Exercise(
        id = "u15_s2_p1_q9",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Halo Anda!",
        targetHanzi = "您 好！",
        targetPinyin = "Nín hǎo!",
        wordChips = listOf("您:nín", "好！:hǎo!", "你:nǐ", "再见:zàijiàn"),
        correctAnswer = "您,好！",
        audioToSpeak = "您好！"
    ),

    // 10. Soal 10: Ketuk Pasangan yang Sesuai (Rangkuman Bertanya Santun)
    Exercise(
        id = "u15_s2_p1_m10_1",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u15_s2_p1_m10_1", "请问", "qǐngwèn", "permisi tanya"),
            MatchPairItem("u15_s2_p1_m10_2", "您好", "nín hǎo", "halo (hormat)"),
            MatchPairItem("u15_s2_p1_m10_3", "请进", "qǐng jìn", "silakan masuk"),
            MatchPairItem("u15_s2_p1_m10_4", "请喝茶", "qǐng hē chá", "silakan minum teh")
        )
    )
)

val bab15Stage2Part2Exercises = listOf(
    // 1. Soal 1: Pilihan Gambar (问题 -> pertanyaan / masalah)
    Exercise(
        id = "u15_s2_p2_q1",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "问题",
        targetPinyin = "wèntí",
        targetTranslation = "pertanyaan",
        correctAnswer = "pertanyaan",
        audioToSpeak = "问题",
        pictureOptions = listOf(
            PictureOption("u15_s2_p2_opt1", "pertanyaan", "❓", R.drawable.ic_coin, true),
            PictureOption("u15_s2_p2_opt2", "jawaban", "💡", R.drawable.ic_target, false),
            PictureOption("u15_s2_p2_opt3", "buku", "📖", R.drawable.ic_book, false),
            PictureOption("u15_s2_p2_opt4", "uang", "💰", R.drawable.ic_crown, false)
        )
    ),

    // 2. Soal 2: Susun Kalimat (Saya punya sebuah pertanyaan.)
    Exercise(
        id = "u15_s2_p2_q2",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Saya punya satu pertanyaan.",
        targetHanzi = "我 有 一个 问题。",
        targetPinyin = "Wǒ yǒu yí gè wèntí.",
        wordChips = listOf("我:wǒ", "有:yǒu", "一个:yí gè", "问题:wèntí", "没有:méiyǒu", "他:tā"),
        correctAnswer = "我,有,一个,问题",
        audioToSpeak = "我有一个问题。"
    ),

    // 3. Soal 3: Ketuk Pasangan yang Sesuai (Tanya & Masalah)
    Exercise(
        id = "u15_s2_p2_m3",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u15_s2_p2_m1", "问", "wèn", "bertanya"),
            MatchPairItem("u15_s2_p2_m2", "问题", "wèntí", "pertanyaan / masalah"),
            MatchPairItem("u15_s2_p2_m3", "问老师", "wèn lǎoshī", "tanya guru"),
            MatchPairItem("u15_s2_p2_m4", "没问题", "méi wèntí", "tidak ada masalah")
        )
    ),

    // 4. Soal 4: Ketik Pinyin (pertanyaan -> wèntí)
    Exercise(
        id = "u15_s2_p2_q4",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "pertanyaan / masalah",
        sentenceWithBlank = "问题 (________)",
        targetHanzi = "问题",
        targetPinyin = "wèntí",
        correctAnswer = "wenti",
        keyboardKeys = listOf("w", "e", "n", "t", "i", "a", "o", "u", "b", "d", "g"),
        audioToSpeak = "问题"
    ),

    // 5. Soal 5: Mendengar Kalimat (Rule 10: illustrationRes = 0)
    Exercise(
        id = "u15_s2_p2_q5",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Apa yang Anda dengar?",
        targetTranslation = "Tidak ada masalah, baiklah.",
        targetHanzi = "没 问题， 好 的。",
        targetPinyin = "Méi wèntí, hǎo de.",
        wordChips = listOf("没:méi", "问题，:wèntí,", "好:hǎo", "的。:de.", "有:yǒu"),
        correctAnswer = "没,问题，,好,的。",
        illustrationRes = 0,
        audioToSpeak = "没问题，好的。"
    ),

    // 6. Soal 6: Pilihan Kalimat
    Exercise(
        id = "u15_s2_p2_q6",
        type = ExerciseType.SENTENCE_CHOICE,
        title = "Pilih terjemahan yang benar",
        targetHanzi = "你 有 问题 吗？",
        targetPinyin = "Nǐ yǒu wèntí ma?",
        targetTranslation = "Apakah kamu ada pertanyaan?",
        correctAnswer = "Nǐ yǒu wèntí ma?\n你 有 问题 吗？",
        options = listOf(
            "Nǐ yǒu wèntí ma?\n你 有 问题 吗？",
            "Tā yǒu wèntí ma?\n他 有 问题 吗？",
            "Nǐ méiyǒu wèntí ma?\n你 没有 问题 吗？"
        ),
        audioToSpeak = "你有问题吗？"
    ),

    // 7. Soal 7: Pilihan Gambar (问 -> bertanya)
    Exercise(
        id = "u15_s2_p2_q7",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "问",
        targetPinyin = "wèn",
        targetTranslation = "bertanya",
        correctAnswer = "bertanya",
        audioToSpeak = "问",
        pictureOptions = listOf(
            PictureOption("u15_s2_p2_opt7_1", "bertanya", "❓", R.drawable.ic_coin, true),
            PictureOption("u15_s2_p2_opt7_2", "mendengar", "🎧", R.drawable.ic_target, false),
            PictureOption("u15_s2_p2_opt7_3", "menulis", "✍️", R.drawable.ic_book, false),
            PictureOption("u15_s2_p2_opt7_4", "membaca", "📖", R.drawable.ic_crown, false)
        )
    ),

    // 8. Soal 8: Ketik Pinyin (bertanya -> wèn)
    Exercise(
        id = "u15_s2_p2_q8",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "bertanya",
        sentenceWithBlank = "问 (________)",
        targetHanzi = "问",
        targetPinyin = "wèn",
        correctAnswer = "wen",
        keyboardKeys = listOf("w", "e", "n", "a", "i", "o", "u", "b", "d", "g", "h"),
        audioToSpeak = "问"
    ),

    // 9. Soal 9: Susun Kalimat (Saya bertanya kepada guru.)
    Exercise(
        id = "u15_s2_p2_q9",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Saya tanya guru satu hal.",
        targetHanzi = "我 问 老师 一个 问题。",
        targetPinyin = "Wǒ wèn lǎoshī yí gè wèntí.",
        wordChips = listOf("我:wǒ", "问:wèn", "老师:lǎoshī", "一个:yí gè", "问题:wèntí", "他:tā"),
        correctAnswer = "我,问,老师,一个,问题",
        audioToSpeak = "我问老师一个问题。"
    ),

    // 10. Soal 10: Ketuk Pasangan yang Sesuai (Rangkuman Pertanyaan & Masalah)
    Exercise(
        id = "u15_s2_p2_m10_1",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u15_s2_p2_m10_1", "问题", "wèntí", "masalah / pertanyaan"),
            MatchPairItem("u15_s2_p2_m10_2", "没问题", "méi wèntí", "tidak masalah"),
            MatchPairItem("u15_s2_p2_m10_3", "问一问", "wènyíwèn", "coba tanya"),
            MatchPairItem("u15_s2_p2_m10_4", "问老师", "wèn lǎoshī", "tanya guru")
        )
    )
)
