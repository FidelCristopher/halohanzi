package com.example.chineselearning.data.repository

import com.example.chineselearning.R
import com.example.chineselearning.data.model.Exercise
import com.example.chineselearning.data.model.ExerciseType
import com.example.chineselearning.data.model.MatchPairItem
import com.example.chineselearning.data.model.PictureOption

val bab23Stage1Part1Exercises = listOf(
    // 1. Soal 1: Pilihan Gambar (旅游 -> berwisata / berlibur)
    Exercise(
        id = "u23_s1_p1_q1",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "旅游",
        targetPinyin = "lǚyóu",
        targetTranslation = "berwisata / berlibur",
        correctAnswer = "berwisata / berlibur",
        audioToSpeak = "旅游",
        pictureOptions = listOf(
            PictureOption("u23_s1_p1_opt1", "berwisata", "", R.drawable.ic_tour_travel, true),
            PictureOption("u23_s1_p1_opt2", "luar negeri", "", R.drawable.ic_tour_passport_abroad, false),
            PictureOption("u23_s1_p1_opt3", "bandara", "", R.drawable.ic_tour_airport, false),
            PictureOption("u23_s1_p1_opt4", "hotel", "", R.drawable.ic_tour_hotel, false)
        )
    ),

    // 2. Soal 2: Susun Kalimat (Musim dingin tahun ini saya ingin berwisata ke Beijing.)
    Exercise(
        id = "u23_s1_p1_q2",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Musim dingin ini saya mau ke Beijing berlibur.",
        targetHanzi = "今年 冬天 我 想 去 北京 旅游。",
        targetPinyin = "Jīnnián dōngtiān wǒ xiǎng qù Běijīng lǚyóu.",
        wordChips = listOf("今年:jīnnián", "冬天:dōngtiān", "我:wǒ", "想:xiǎng", "去:qù", "北京:Běijīng", "旅游。:lǚyóu.", "工作:gōngzuò"),
        correctAnswer = "今年,冬天,我,想,去,北京,旅游。",
        audioToSpeak = "今年冬天我想去北京旅游。"
    ),

    // 3. Soal 3: Ketuk Pasangan yang Sesuai (Berwisata & Luar Negeri)
    Exercise(
        id = "u23_s1_p1_q3",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u23_s1_p1_m1", "旅游", "lǚyóu", "berwisata / berlibur"),
            MatchPairItem("u23_s1_p1_m2", "外国", "wàiguó", "luar negeri"),
            MatchPairItem("u23_s1_p1_m3", "去北京", "qù Běijīng", "ke Beijing"),
            MatchPairItem("u23_s1_p1_m4", "冬天", "dōngtiān", "musim dingin")
        )
    ),

    // 4. Soal 4: Ketik Pinyin (berwisata -> lǚyóu)
    Exercise(
        id = "u23_s1_p1_q4",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "berwisata / berlibur",
        sentenceWithBlank = "旅游 (________)",
        targetHanzi = "旅游",
        targetPinyin = "lǚyóu",
        correctAnswer = "lvyou",
        keyboardKeys = listOf("l", "v", "y", "o", "u", "a", "e", "i", "b", "d", "g", "h"),
        audioToSpeak = "旅游"
    ),

    // 5. Soal 5: Mendengar Kalimat (Rule 10: illustrationRes = 0)
    Exercise(
        id = "u23_s1_p1_q5",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Apa yang Anda dengar?",
        targetTranslation = "Ada banyak teman luar negeri sedang belajar bahasa Mandarin.",
        targetHanzi = "有 很多 外国 朋友 在 学 中文。",
        targetPinyin = "Yǒu hěn duō wàiguó péngyou zài xué Zhōngwén.",
        wordChips = listOf("有:yǒu", "很多:hěn duō", "外国:wàiguó", "朋友:péngyou", "在:zài", "学:xué", "中文。:Zhōngwén.", "英语:Yīngyǔ"),
        correctAnswer = "有,很多,外国,朋友,在,学,中文。",
        illustrationRes = 0,
        audioToSpeak = "有很多外国朋友在学中文。"
    ),

    // 6. Soal 6: Pilihan Kalimat
    Exercise(
        id = "u23_s1_p1_q6",
        type = ExerciseType.SENTENCE_CHOICE,
        title = "Pilih terjemahan yang benar",
        targetHanzi = "我 和 妻子 都 喜欢 去 外国 旅游。",
        targetPinyin = "Wǒ hé qīzi dōu xǐhuan qù wàiguó lǚyóu.",
        targetTranslation = "Saya dan istri sama-sama suka berwisata ke luar negeri.",
        correctAnswer = "Wǒ hé qīzi dōu xǐhuan qù wàiguó lǚyóu.\n我 和 妻子 都 喜欢 去 外国 旅游。",
        options = listOf(
            "Wǒ hé qīzi dōu xǐhuan qù wàiguó lǚyóu.\n我 和 妻子 都 喜欢 去 外国 旅游。",
            "Wǒ hé qīzi dōu bù xǐhuan lǚyóu.\n我 和 妻子 都 不 喜欢 旅游。",
            "Tā hé qīzi dōu xǐhuan qù wàiguó lǚyóu.\n他 和 妻子 都 喜欢 去 外国 旅游。"
        ),
        audioToSpeak = "我和妻子都喜欢去外国旅游。"
    ),

    // 7. Soal 7: Pilihan Gambar (外国 -> luar negeri)
    Exercise(
        id = "u23_s1_p1_q7",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "外国",
        targetPinyin = "wàiguó",
        targetTranslation = "luar negeri",
        correctAnswer = "luar negeri",
        audioToSpeak = "外国",
        pictureOptions = listOf(
            PictureOption("u23_s1_p1_opt7_1", "luar negeri", "", R.drawable.ic_tour_passport_abroad, true),
            PictureOption("u23_s1_p1_opt7_2", "berwisata", "", R.drawable.ic_tour_travel, false),
            PictureOption("u23_s1_p1_opt7_3", "tiket pesawat", "", R.drawable.ic_tour_flight_ticket, false),
            PictureOption("u23_s1_p1_opt7_4", "hotel", "", R.drawable.ic_tour_hotel, false)
        )
    ),

    // 8. Soal 8: Ketik Pinyin (luar negeri -> wàiguó)
    Exercise(
        id = "u23_s1_p1_q8",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "luar negeri",
        sentenceWithBlank = "外国 (________)",
        targetHanzi = "外国",
        targetPinyin = "wàiguó",
        correctAnswer = "waiguo",
        keyboardKeys = listOf("w", "a", "i", "g", "u", "o", "e", "b", "d", "h", "j", "l"),
        audioToSpeak = "外国"
    ),

    // 9. Soal 9: Susun Kalimat (Teman saya pergi ke luar negeri berwisata.)
    Exercise(
        id = "u23_s1_p1_q9",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Teman saya ke luar negeri berlibur.",
        targetHanzi = "我 朋友 去 外国 旅游 了。",
        targetPinyin = "Wǒ péngyou qù wàiguó lǚyóu le.",
        wordChips = listOf("我:wǒ", "朋友:péngyou", "去:qù", "外国:wàiguó", "旅游:lǚyóu", "了。:le.", "回家:huíjiā"),
        correctAnswer = "我,朋友,去,外国,旅游,了。",
        audioToSpeak = "我朋友去外国旅游了。"
    ),

    // 10. Soal 10: Ketuk Pasangan yang Sesuai (Rangkuman Wisata Internasional)
    Exercise(
        id = "u23_s1_p1_m10",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u23_s1_p1_m10_1", "旅游", "lǚyóu", "berlibur"),
            MatchPairItem("u23_s1_p1_m10_2", "外国", "wàiguó", "luar negeri"),
            MatchPairItem("u23_s1_p1_m10_3", "学中文", "xué Zhōngwén", "belajar Mandarin"),
            MatchPairItem("u23_s1_p1_m10_4", "朋友", "péngyou", "sahabat")
        )
    )
)

val bab23Stage1Part2Exercises = listOf(
    // 1. Soal 1: Pilihan Gambar (出国 -> pergi ke luar negeri)
    Exercise(
        id = "u23_s1_p2_q1",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "出国",
        targetPinyin = "chūguó",
        targetTranslation = "pergi ke luar negeri",
        correctAnswer = "pergi ke luar negeri",
        audioToSpeak = "出国",
        pictureOptions = listOf(
            PictureOption("u23_s1_p2_opt1", "pergi ke luar negeri", "", R.drawable.ic_tour_passport_abroad, true),
            PictureOption("u23_s1_p2_opt2", "hotel", "", R.drawable.ic_tour_hotel, false),
            PictureOption("u23_s1_p2_opt3", "pesawat terbang", "", R.drawable.ic_tour_airplane_fly, false),
            PictureOption("u23_s1_p2_opt4", "bandara", "", R.drawable.ic_tour_airport, false)
        )
    ),

    // 2. Soal 2: Susun Kalimat (Dia berencana tahun depan pergi ke luar negeri kuliah universitas.)
    Exercise(
        id = "u23_s1_p2_q2",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Dia tahun depan mau kuliah di luar negeri.",
        targetHanzi = "他 明年 打算 出国 读 大学。",
        targetPinyin = "Tā míngnián dǎsuan chūguó dú dàxué.",
        wordChips = listOf("他:tā", "明年:míngnián", "打算:dǎsuan", "出国:chūguó", "读:dú", "大学。:dàxué.", "工作:gōngzuò"),
        correctAnswer = "他,明年,打算,出国,读,大学。",
        audioToSpeak = "他明年打算出国读大学。"
    ),

    // 3. Soal 3: Ketuk Pasangan yang Sesuai (Ke Luar Negeri & Kuliah)
    Exercise(
        id = "u23_s1_p2_m3",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u23_s1_p2_m1", "出国", "chūguó", "ke luar negeri"),
            MatchPairItem("u23_s1_p2_m2", "打算", "dǎsuan", "berencana"),
            MatchPairItem("u23_s1_p2_m3", "读大学", "dú dàxué", "kuliah universitas"),
            MatchPairItem("u23_s1_p2_m4", "明年", "míngnián", "tahun depan")
        )
    ),

    // 4. Soal 4: Ketik Pinyin (pergi ke luar negeri -> chūguó)
    Exercise(
        id = "u23_s1_p2_q4",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "pergi ke luar negeri",
        sentenceWithBlank = "出国 (________)",
        targetHanzi = "出国",
        targetPinyin = "chūguó",
        correctAnswer = "chuguo",
        keyboardKeys = listOf("c", "h", "u", "g", "o", "a", "e", "i", "b", "d", "j", "l"),
        audioToSpeak = "出国"
    ),

    // 5. Soal 5: Mendengar Kalimat (Rule 10: illustrationRes = 0)
    Exercise(
        id = "u23_s1_p2_q5",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Apa yang Anda dengar?",
        targetTranslation = "Apakah kamu pernah pergi ke luar negeri?",
        targetHanzi = "你 出过 国 吗？",
        targetPinyin = "Nǐ chū guo guó ma?",
        wordChips = listOf("你:nǐ", "出过:chū guo", "国:guó", "吗？:ma?", "去:qù"),
        correctAnswer = "你,出过,国,吗？",
        illustrationRes = 0,
        audioToSpeak = "你出过国吗？"
    ),

    // 6. Soal 6: Pilihan Kalimat
    Exercise(
        id = "u23_s1_p2_q6",
        type = ExerciseType.SENTENCE_CHOICE,
        title = "Pilih terjemahan yang benar",
        targetHanzi = "出国 旅游 要 准备 护照。",
        targetPinyin = "Chūguó lǚyóu yào zhǔnbèi hùzhào.",
        targetTranslation = "Berwisata ke luar negeri harus mempersiapkan paspor.",
        correctAnswer = "Chūguó lǚyóu yào zhǔnbèi hùzhào.\n出国 旅游 要 准备 护照。",
        options = listOf(
            "出国 旅游 要 准备 护照。\nChūguó lǚyóu yào zhǔnbèi hùzhào.",
            "Chūguó lǚyóu bù yào zhǔnbèi hùzhào.\n出国 旅游 不 要 准备 护照。",
            "Zài jiā lǐ yào zhǔnbèi hùzhào.\n在 家 里 要 准备 护照。"
        ),
        audioToSpeak = "出国旅游要准备护照。"
    ),

    // 7. Soal 7: Pilihan Gambar (旅游 -> berlibur tamasya)
    Exercise(
        id = "u23_s1_p2_q7",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "旅游",
        targetPinyin = "lǚyóu",
        targetTranslation = "berwisata",
        correctAnswer = "berwisata",
        audioToSpeak = "旅游",
        pictureOptions = listOf(
            PictureOption("u23_s1_p2_opt7_1", "berwisata", "", R.drawable.ic_tour_travel, true),
            PictureOption("u23_s1_p2_opt7_2", "tiket pesawat", "", R.drawable.ic_tour_flight_ticket, false),
            PictureOption("u23_s1_p2_opt7_3", "hotel", "", R.drawable.ic_tour_hotel, false),
            PictureOption("u23_s1_p2_opt7_4", "bandara", "", R.drawable.ic_tour_airport, false)
        )
    ),

    // 8. Soal 8: Ketik Pinyin (berwisata -> lǚyóu)
    Exercise(
        id = "u23_s1_p2_q8",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "berwisata / berlibur",
        sentenceWithBlank = "旅游 (________)",
        targetHanzi = "旅游",
        targetPinyin = "lǚyóu",
        correctAnswer = "lvyou",
        keyboardKeys = listOf("l", "v", "y", "o", "u", "a", "e", "i", "b", "d", "g", "h"),
        audioToSpeak = "旅游"
    ),

    // 9. Soal 9: Susun Kalimat (Kakak perempuan pergi ke luar negeri bekerja.)
    Exercise(
        id = "u23_s1_p2_q9",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Kakak perempuan ke luar negeri kerja.",
        targetHanzi = "姐姐 出国 工作 了。",
        targetPinyin = "Jiějie chūguó gōngzuò le.",
        wordChips = listOf("姐姐:jiějie", "出国:chūguó", "工作:gōngzuò", "了。:le.", "回家:huíjiā"),
        correctAnswer = "姐姐,出国,工作,了。",
        audioToSpeak = "姐姐出国工作了。"
    ),

    // 10. Soal 10: Ketuk Pasangan yang Sesuai (Rangkuman Pergi ke Luar Negeri)
    Exercise(
        id = "u23_s1_p2_m10",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u23_s1_p2_m10_1", "出国", "chūguó", "ke luar negeri"),
            MatchPairItem("u23_s1_p2_m10_2", "护照", "hùzhào", "paspor"),
            MatchPairItem("u23_s1_p2_m10_3", "出国工作", "chūguó gōngzuò", "kerja di luar negeri"),
            MatchPairItem("u23_s1_p2_m10_4", "准备好", "zhǔnbèi hǎo", "siap sedia")
        )
    )
)
