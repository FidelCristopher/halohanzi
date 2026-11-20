package com.example.chineselearning.data.repository

import com.example.chineselearning.R
import com.example.chineselearning.data.model.Exercise
import com.example.chineselearning.data.model.ExerciseType
import com.example.chineselearning.data.model.MatchPairItem
import com.example.chineselearning.data.model.PictureOption

val bab23Stage4Part1Exercises = listOf(
    // 1. Soal 1: Pilihan Gambar (送 -> memberi hadiah / mengantar)
    Exercise(
        id = "u23_s4_p1_q1",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "送",
        targetPinyin = "sòng",
        targetTranslation = "memberi hadiah / mengantar",
        correctAnswer = "memberi hadiah / mengantar",
        audioToSpeak = "送",
        pictureOptions = listOf(
            PictureOption("u23_s4_p1_opt1", "memberi hadiah", "", R.drawable.ic_tour_travel, true),
            PictureOption("u23_s4_p1_opt2", "hotel", "", R.drawable.ic_tour_hotel, false),
            PictureOption("u23_s4_p1_opt3", "bandara", "", R.drawable.ic_tour_airport, false),
            PictureOption("u23_s4_p1_opt4", "tiket", "", R.drawable.ic_tour_flight_ticket, false)
        )
    ),

    // 2. Soal 2: Susun Kalimat (Teman menghadiahi saya sebuah buku yang menarik.)
    Exercise(
        id = "u23_s4_p1_q2",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Teman menghadiahkan saya buku menarik.",
        targetHanzi = "朋友 送 我 一 本 好书。",
        targetPinyin = "Péngyou sòng wǒ yì běn hǎoshū.",
        wordChips = listOf("朋友:péngyou", "送:sòng", "我:wǒ", "一:yì", "本:běn", "好书。:hǎoshū.", "拿:ná"),
        correctAnswer = "朋友,送,我,一,本,好书。",
        audioToSpeak = "朋友送我一本好书。"
    ),

    // 3. Soal 3: Ketuk Pasangan yang Sesuai (Mengantar & Membawa)
    Exercise(
        id = "u23_s4_p1_q3",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u23_s4_p1_m1", "送", "sòng", "mengantar / menghadiahkan"),
            MatchPairItem("u23_s4_p1_m2", "拿", "ná", "memegang / membawa"),
            MatchPairItem("u23_s4_p1_m3", "送朋友", "sòng péngyou", "mengantar teman"),
            MatchPairItem("u23_s4_p1_m4", "拿大包", "ná dàbāo", "membawa tas besar")
        )
    ),

    // 4. Soal 4: Ketik Pinyin (mengantar/menghadiahi -> sòng)
    Exercise(
        id = "u23_s4_p1_q4",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "mengantar / memberi hadiah",
        sentenceWithBlank = "送 (________)",
        targetHanzi = "送",
        targetPinyin = "sòng",
        correctAnswer = "song",
        keyboardKeys = listOf("s", "o", "n", "g", "a", "e", "i", "u", "b", "d", "h", "j"),
        audioToSpeak = "送"
    ),

    // 5. Soal 5: Mendengar Kalimat (Rule 10: illustrationRes = 0)
    Exercise(
        id = "u23_s4_p1_q5",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Apa yang Anda dengar?",
        targetTranslation = "Tolong bantu saya membawa tas besar ini sebentar.",
        targetHanzi = "请 帮 我 拿 一下 这个 包。",
        targetPinyin = "Qǐng bāng wǒ ná yíxià zhège bāo.",
        wordChips = listOf("请:qǐng", "帮:bāng", "我:wǒ", "拿:ná", "一下:yíxià", "这个:zhège", "包。:bāo.", "送:sòng"),
        correctAnswer = "请,帮,我,拿,一下,这个,包。",
        illustrationRes = 0,
        audioToSpeak = "请帮我拿一下这个包。"
    ),

    // 6. Soal 6: Pilihan Kalimat
    Exercise(
        id = "u23_s4_p1_q6",
        type = ExerciseType.SENTENCE_CHOICE,
        title = "Pilih terjemahan yang benar",
        targetHanzi = "爸爸 开车 送 我 去 机场。",
        targetPinyin = "Bàba kāichē sòng wǒ qù jīchǎng.",
        targetTranslation = "Ayah mengendarai mobil mengantar saya ke bandara.",
        correctAnswer = "Bàba kāichē sòng wǒ qù jīchǎng.\n爸爸 开车 送 我 去 机场。",
        options = listOf(
            "Bàba kāichē sòng wǒ qù jīchǎng.\n爸爸 开车 送 我 去 机场。",
            "Bàba kāichē sòng wǒ qù xuéxiào.\n爸爸 开车 送 我 去 学校。",
            "Māma kāichē sòng wǒ qù jīchǎng.\n妈妈 开车 送 我 去 机场。"
        ),
        audioToSpeak = "爸爸开车送我去机场。"
    ),

    // 7. Soal 7: Pilihan Gambar (拿 -> membawa / memegang)
    Exercise(
        id = "u23_s4_p1_q7",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "拿",
        targetPinyin = "ná",
        targetTranslation = "membawa / memegang",
        correctAnswer = "membawa / memegang",
        audioToSpeak = "拿",
        pictureOptions = listOf(
            PictureOption("u23_s4_p1_opt7_1", "membawa", "", R.drawable.ic_tour_travel, true),
            PictureOption("u23_s4_p1_opt7_2", "tiket", "", R.drawable.ic_tour_flight_ticket, false),
            PictureOption("u23_s4_p1_opt7_3", "hotel", "", R.drawable.ic_tour_hotel, false),
            PictureOption("u23_s4_p1_opt7_4", "bandara", "", R.drawable.ic_tour_airport, false)
        )
    ),

    // 8. Soal 8: Ketik Pinyin (membawa -> ná)
    Exercise(
        id = "u23_s4_p1_q8",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "membawa / memegang",
        sentenceWithBlank = "拿 (________)",
        targetHanzi = "拿",
        targetPinyin = "ná",
        correctAnswer = "na",
        keyboardKeys = listOf("n", "a", "e", "i", "o", "u", "b", "d", "g", "h", "j", "l"),
        audioToSpeak = "拿"
    ),

    // 9. Soal 9: Susun Kalimat (Ibu memberi saya sehelai celana baru.)
    Exercise(
        id = "u23_s4_p1_q9",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Ibu menghadiahkan saya celana baru.",
        targetHanzi = "妈妈 送 我 一 条 新 裤子。",
        targetPinyin = "Māma sòng wǒ yì tiáo xīn kùzi.",
        wordChips = listOf("妈妈:māma", "送:sòng", "我:wǒ", "一:yì", "条:tiáo", "新:xīn", "裤子。:kùzi.", "拿:ná"),
        correctAnswer = "妈妈,送,我,一,条,新,裤子。",
        audioToSpeak = "妈妈送我一条新裤子。"
    ),

    // 10. Soal 10: Ketuk Pasangan yang Sesuai (Rangkuman Hadiah & Bawaan)
    Exercise(
        id = "u23_s4_p1_m10",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u23_s4_p1_m10_1", "送", "sòng", "memberikan"),
            MatchPairItem("u23_s4_p1_m10_2", "拿", "ná", "mengambil / bawa"),
            MatchPairItem("u23_s4_p1_m10_3", "送礼物", "sòng lǐwù", "memberi kado"),
            MatchPairItem("u23_s4_p1_m10_4", "拿行李", "ná xíngli", "bawa koper")
        )
    )
)

val bab23Stage4Part2Exercises = listOf(
    // 1. Soal 1: Pilihan Gambar (去过 -> pernah pergi)
    Exercise(
        id = "u23_s4_p2_q1",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "去过",
        targetPinyin = "qù guo",
        targetTranslation = "pernah pergi",
        correctAnswer = "pernah pergi",
        audioToSpeak = "去过",
        pictureOptions = listOf(
            PictureOption("u23_s4_p2_opt1", "pernah pergi", "", R.drawable.ic_tour_travel, true),
            PictureOption("u23_s4_p2_opt2", "hotel", "", R.drawable.ic_tour_hotel, false),
            PictureOption("u23_s4_p2_opt3", "bandara", "", R.drawable.ic_tour_airport, false),
            PictureOption("u23_s4_p2_opt4", "paspor", "", R.drawable.ic_tour_passport_abroad, false)
        )
    ),

    // 2. Soal 2: Susun Kalimat (Apakah kamu pernah makan bebek panggang Beijing?)
    Exercise(
        id = "u23_s4_p2_q2",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Kamu pernah makan bebek panggang?",
        targetHanzi = "你 吃 过 北京 烤鸭 吗？",
        targetPinyin = "Nǐ chī guo Běijīng kǎoyā ma?",
        wordChips = listOf("你:nǐ", "吃:chī", "过:guo", "北京:Běijīng", "烤鸭:kǎoyā", "吗？:ma?", "去:qù"),
        correctAnswer = "你,吃,过,北京,烤鸭,吗？",
        audioToSpeak = "你吃过北京烤鸭吗？"
    ),

    // 3. Soal 3: Ketuk Pasangan yang Sesuai (Aspek Pengalaman Lampau 过)
    Exercise(
        id = "u23_s4_p2_m3",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u23_s4_p2_m1", "吃过", "chī guo", "pernah makan"),
            MatchPairItem("u23_s4_p2_m2", "去过", "qù guo", "pernah pergi"),
            MatchPairItem("u23_s4_p2_m3", "没去过", "méi qù guo", "belum pernah pergi"),
            MatchPairItem("u23_s4_p2_m4", "看过", "kàn guo", "pernah melihat")
        )
    ),

    // 4. Soal 4: Ketik Pinyin (pernah makan -> chīguo)
    Exercise(
        id = "u23_s4_p2_q4",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "pernah makan",
        sentenceWithBlank = "吃过 (________)",
        targetHanzi = "吃过",
        targetPinyin = "chīguo",
        correctAnswer = "chiguo",
        keyboardKeys = listOf("c", "h", "i", "g", "u", "o", "a", "e", "b", "d", "j", "l"),
        audioToSpeak = "吃过"
    ),

    // 5. Soal 5: Mendengar Kalimat (Rule 10: illustrationRes = 0)
    Exercise(
        id = "u23_s4_p2_q5",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Apa yang Anda dengar?",
        targetTranslation = "Saya pernah pergi ke Tiongkok dua kali.",
        targetHanzi = "我 去 过 两 次 中国。",
        targetPinyin = "Wǒ qù guo liǎng cì Zhōngguó.",
        wordChips = listOf("我:wǒ", "去:qù", "过:guo", "两:liǎng", "次:cì", "中国。:Zhōngguó.", "一:yí"),
        correctAnswer = "我,去,过,两,次,中国。",
        illustrationRes = 0,
        audioToSpeak = "我去过两次中国。"
    ),

    // 6. Soal 6: Pilihan Kalimat
    Exercise(
        id = "u23_s4_p2_q6",
        type = ExerciseType.SENTENCE_CHOICE,
        title = "Pilih terjemahan yang benar",
        targetHanzi = "我 没 去 过 外国 旅游。",
        targetPinyin = "Wǒ méi qù guo wàiguó lǚyóu.",
        targetTranslation = "Saya belum pernah berwisata ke luar negeri.",
        correctAnswer = "Wǒ méi qù guo wàiguó lǚyóu.\n我 没 去 过 外国 旅游。",
        options = listOf(
            "Wǒ méi qù guo wàiguó lǚyóu.\n我 没 去 过 外国 旅游。",
            "Wǒ qù guo wàiguó lǚyóu.\n我 去 过 外国 旅游。",
            "Tā méi qù guo wàiguó lǚyóu.\n他 没 去 过 外国 旅游。"
        ),
        audioToSpeak = "我没去过外国旅游。"
    ),

    // 7. Soal 7: Pilihan Gambar (去过 -> pernah pergi wisata)
    Exercise(
        id = "u23_s4_p2_q7",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "去过",
        targetPinyin = "qù guo",
        targetTranslation = "pernah pergi",
        correctAnswer = "pernah pergi",
        audioToSpeak = "去过",
        pictureOptions = listOf(
            PictureOption("u23_s4_p2_opt7_1", "pernah pergi", "", R.drawable.ic_tour_travel, true),
            PictureOption("u23_s4_p2_opt7_2", "tiket", "", R.drawable.ic_tour_flight_ticket, false),
            PictureOption("u23_s4_p2_opt7_3", "hotel", "", R.drawable.ic_tour_hotel, false),
            PictureOption("u23_s4_p2_opt7_4", "bandara", "", R.drawable.ic_tour_airport, false)
        )
    ),

    // 8. Soal 8: Ketik Pinyin (pernah pergi -> qùguo)
    Exercise(
        id = "u23_s4_p2_q8",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "pernah pergi",
        sentenceWithBlank = "去过 (________)",
        targetHanzi = "去过",
        targetPinyin = "qùguo",
        correctAnswer = "quguo",
        keyboardKeys = listOf("q", "u", "g", "o", "a", "e", "i", "b", "d", "h", "j", "l"),
        audioToSpeak = "去过"
    ),

    // 9. Soal 9: Susun Kalimat (Saya pernah menonton film itu.)
    Exercise(
        id = "u23_s4_p2_q9",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Saya pernah menonton film itu.",
        targetHanzi = "我 看 过 那个 电影。",
        targetPinyin = "Wǒ kàn guo nàge diànyǐng.",
        wordChips = listOf("我:wǒ", "看:kàn", "过:guo", "那个:nàge", "电影。:diànyǐng.", "听:tīng"),
        correctAnswer = "我,看,过,那个,电影。",
        audioToSpeak = "我看过那个电影。"
    ),

    // 10. Soal 10: Ketuk Pasangan yang Sesuai (Rangkuman Aspek Pernah)
    Exercise(
        id = "u23_s4_p2_m10",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u23_s4_p2_m10_1", "去过", "qù guo", "pernah pergi"),
            MatchPairItem("u23_s4_p2_m10_2", "两次", "liǎng cì", "dua kali"),
            MatchPairItem("u23_s4_p2_m10_3", "没看过", "méi kàn guo", "belum nonton"),
            MatchPairItem("u23_s4_p2_m10_4", "吃过饭", "chī guo fàn", "pernah makan")
        )
    )
)
