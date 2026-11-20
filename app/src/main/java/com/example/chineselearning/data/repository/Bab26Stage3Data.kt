package com.example.chineselearning.data.repository

import com.example.chineselearning.R
import com.example.chineselearning.data.model.Exercise
import com.example.chineselearning.data.model.ExerciseType
import com.example.chineselearning.data.model.MatchPairItem
import com.example.chineselearning.data.model.PictureOption

val bab26Stage3Part1Exercises = listOf(
    // 1. Soal 1: Pilihan Gambar (帮 -> membantu / menolong)
    Exercise(
        id = "u26_s3_p1_q1",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "帮",
        targetPinyin = "bāng",
        targetTranslation = "membantu / menolong",
        correctAnswer = "membantu / menolong",
        audioToSpeak = "帮",
        pictureOptions = listOf(
            PictureOption("u26_s3_p1_opt1", "membantu", "", R.drawable.ic_med_comfort_healthy, true),
            PictureOption("u26_s3_p1_opt2", "istirahat", "", R.drawable.ic_med_rest_sleep, false),
            PictureOption("u26_s3_p1_opt3", "obat", "", R.drawable.ic_med_pharmacy_drug, false),
            PictureOption("u26_s3_p1_opt4", "ranjang", "", R.drawable.ic_med_bed_rest, false)
        )
    ),

    // 2. Soal 2: Susun Kalimat (Bisakah kamu membantu saya membeli obat?)
    Exercise(
        id = "u26_s3_p1_q2",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Bisa bantu saya beli obat?",
        targetHanzi = "你 能 帮 我 买 药 吗？",
        targetPinyin = "Nǐ néng bāng wǒ mǎi yào ma?",
        wordChips = listOf("你:nǐ", "能:néng", "帮:bāng", "我:wǒ", "买:mǎi", "药:yào", "吗？:ma?", "吃:chī"),
        correctAnswer = "你,能,帮,我,买,药,吗？",
        audioToSpeak = "你能帮我买药吗？"
    ),

    // 3. Soal 3: Ketuk Pasangan yang Sesuai (Menolong & Bantuan)
    Exercise(
        id = "u26_s3_p1_q3",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u26_s3_p1_m1", "帮", "bāng", "membantu"),
            MatchPairItem("u26_s3_p1_m2", "帮忙", "bāngmáng", "memberi bantuan"),
            MatchPairItem("u26_s3_p1_m3", "帮我", "bāng wǒ", "menolong saya"),
            MatchPairItem("u26_s3_p1_m4", "谢谢你", "xièxie nǐ", "terima kasih")
        )
    ),

    // 4. Soal 4: Ketik Pinyin (membantu -> bāng)
    Exercise(
        id = "u26_s3_p1_q4",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "membantu / menolong",
        sentenceWithBlank = "帮 (________)",
        targetHanzi = "帮",
        targetPinyin = "bāng",
        correctAnswer = "bang",
        keyboardKeys = listOf("b", "a", "n", "g", "e", "i", "o", "u", "d", "h", "j", "l"),
        audioToSpeak = "帮"
    ),

    // 5. Soal 5: Mendengar Kalimat (Rule 10: illustrationRes = 0)
    Exercise(
        id = "u26_s3_p1_q5",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Apa yang Anda dengar?",
        targetTranslation = "Terima kasih hari ini kamu telah banyak membantuku.",
        targetHanzi = "谢谢 你 帮 我 的 忙。",
        targetPinyin = "Xièxie nǐ bāng wǒ de máng.",
        wordChips = listOf("谢谢:xièxie", "你:nǐ", "帮:bāng", "我:wǒ", "的:de", "忙。:máng.", "他:tā"),
        correctAnswer = "谢谢,你,帮,我,的,忙。",
        illustrationRes = 0,
        audioToSpeak = "谢谢你帮我的忙。"
    ),

    // 6. Soal 6: Pilihan Kalimat
    Exercise(
        id = "u26_s3_p1_q6",
        type = ExerciseType.SENTENCE_CHOICE,
        title = "Pilih terjemahan yang benar",
        targetHanzi = "大家 互相 帮助。",
        targetPinyin = "Dàjiā hùxiāng bāngzhù.",
        targetTranslation = "Semua orang saling membantu.",
        correctAnswer = "Dàjiā hùxiāng bāngzhù.\n大家 互相 帮助。",
        options = listOf(
            "Dàjiā hùxiāng bāngzhù.\n大家 互相 帮助。",
            "Dàjiā dōu bù bāngzhù.\n大家 都 不 帮助。",
            "Tāmen hùxiāng bāngzhù.\n他们 互相 帮助。"
        ),
        audioToSpeak = "大家互相帮助。"
    ),

    // 7. Soal 7: Pilihan Gambar (帮忙 -> memberi pertolongan)
    Exercise(
        id = "u26_s3_p1_q7",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "帮忙",
        targetPinyin = "bāngmáng",
        targetTranslation = "memberi bantuan",
        correctAnswer = "memberi bantuan",
        audioToSpeak = "帮忙",
        pictureOptions = listOf(
            PictureOption("u26_s3_p1_opt7_1", "bantuan", "", R.drawable.ic_med_comfort_healthy, true),
            PictureOption("u26_s3_p1_opt7_2", "pusing", "", R.drawable.ic_med_headache, false),
            PictureOption("u26_s3_p1_opt7_3", "ranjang", "", R.drawable.ic_med_bed_rest, false),
            PictureOption("u26_s3_p1_opt7_4", "obat", "", R.drawable.ic_med_pharmacy_drug, false)
        )
    ),

    // 8. Soal 8: Ketik Pinyin (memberi bantuan -> bāngmáng)
    Exercise(
        id = "u26_s3_p1_q8",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "membantu / memberi bantuan",
        sentenceWithBlank = "帮忙 (________)",
        targetHanzi = "帮忙",
        targetPinyin = "bāngmáng",
        correctAnswer = "bangmang",
        keyboardKeys = listOf("b", "a", "n", "g", "m", "e", "i", "o", "u", "d", "h", "j"),
        audioToSpeak = "帮忙"
    ),

    // 9. Soal 9: Susun Kalimat (Saya butuh bantuanmu.)
    Exercise(
        id = "u26_s3_p1_q9",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Saya butuh bantuanmu.",
        targetHanzi = "请 你 帮 我 忙。",
        targetPinyin = "Qǐng nǐ bāng wǒ máng.",
        wordChips = listOf("请:qǐng", "你:nǐ", "帮:bāng", "我:wǒ", "忙。:máng.", "他:tā"),
        correctAnswer = "请,你,帮,我,忙。",
        audioToSpeak = "请你帮我忙。"
    ),

    // 10. Soal 10: Ketuk Pasangan yang Sesuai (Rangkuman Saling Membantu)
    Exercise(
        id = "u26_s3_p1_m10",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u26_s3_p1_m10_1", "帮", "bāng", "menolong"),
            MatchPairItem("u26_s3_p1_m2", "帮忙", "bāngmáng", "bantuan"),
            MatchPairItem("u26_s3_p1_m3", "帮大忙", "bāng dàmáng", "bantuan besar"),
            MatchPairItem("u26_s3_p1_m4", "太感谢", "tài gǎnxiè", "sangat terima kasih")
        )
    )
)

val bab26Stage3Part2Exercises = listOf(
    // 1. Soal 1: Pilihan Gambar (等 -> menunggu)
    Exercise(
        id = "u26_s3_p2_q1",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "等",
        targetPinyin = "děng",
        targetTranslation = "menunggu",
        correctAnswer = "menunggu",
        audioToSpeak = "等",
        pictureOptions = listOf(
            PictureOption("u26_s3_p2_opt1", "menunggu", "", R.drawable.ic_med_rest_sleep, true),
            PictureOption("u26_s3_p2_opt2", "sakit", "", R.drawable.ic_med_headache, false),
            PictureOption("u26_s3_p2_opt3", "obat", "", R.drawable.ic_med_pharmacy_drug, false),
            PictureOption("u26_s3_p2_opt4", "ranjang", "", R.drawable.ic_med_bed_rest, false)
        )
    ),

    // 2. Soal 2: Susun Kalimat (Silakan tunggu sebentar di ruang tunggu apotek.)
    Exercise(
        id = "u26_s3_p2_q2",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Silakan tunggu sebentar di apotek.",
        targetHanzi = "请 在 药店 等 一会儿。",
        targetPinyin = "Qǐng zài yàodiàn děng yíhuìér.",
        wordChips = listOf("请:qǐng", "在:zài", "药店:yàodiàn", "等:děng", "一会儿。:yíhuìér.", "去:qù"),
        correctAnswer = "请,在,药店,等,一会儿。",
        audioToSpeak = "请在药店等一会儿。"
    ),

    // 3. Soal 3: Ketuk Pasangan yang Sesuai (Menunggu)
    Exercise(
        id = "u26_s3_p2_m3",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u26_s3_p2_m1", "等", "děng", "menunggu"),
            MatchPairItem("u26_s3_p2_m2", "等一会儿", "děng yíhuìér", "tunggu sejenak"),
            MatchPairItem("u26_s3_p2_m3", "等医生", "děng yīshēng", "menunggu dokter"),
            MatchPairItem("u26_s3_p2_m4", "等等", "děngděng", "dan lain-lain / tunggu")
        )
    ),

    // 4. Soal 4: Ketik Pinyin (menunggu -> děng)
    Exercise(
        id = "u26_s3_p2_q4",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "menunggu",
        sentenceWithBlank = "等 (________)",
        targetHanzi = "等",
        targetPinyin = "děng",
        correctAnswer = "deng",
        keyboardKeys = listOf("d", "e", "n", "g", "a", "i", "o", "u", "b", "h", "j", "l"),
        audioToSpeak = "等"
    ),

    // 5. Soal 5: Mendengar Kalimat (Rule 10: illustrationRes = 0)
    Exercise(
        id = "u26_s3_p2_q5",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Apa yang Anda dengar?",
        targetTranslation = "Saya sedang menunggu dokter memeriksa.",
        targetHanzi = "我 在 等 医生 看病。",
        targetPinyin = "Wǒ zài děng yīshēng kànbìng.",
        wordChips = listOf("我:wǒ", "在:zài", "等:děng", "医生:yīshēng", "看病。:kànbìng.", "走:zǒu"),
        correctAnswer = "我,在,等,医生,看病。",
        illustrationRes = 0,
        audioToSpeak = "我在等医生看病。"
    ),

    // 6. Soal 6: Pilihan Kalimat
    Exercise(
        id = "u26_s3_p2_q6",
        type = ExerciseType.SENTENCE_CHOICE,
        title = "Pilih terjemahan yang benar",
        targetHanzi = "你 在 这里 等 我 一下， 我 去 买 药。",
        targetPinyin = "Nǐ zài zhèlǐ děng wǒ yíxià, wǒ qù mǎi yào.",
        targetTranslation = "Kamu tunggu saya sebentar di sini, saya pergi membeli obat.",
        correctAnswer = "Nǐ zài zhèlǐ děng wǒ yíxià, wǒ qù mǎi yào.\n你 在 这里 等 我 一下， 我 去 买 药。",
        options = listOf(
            "Nǐ zài zhèlǐ děng wǒ yíxià, wǒ qù mǎi yào.\n你 在 这里 等 我 一下， 我 去 买 药。",
            "Wǒ zài zhèlǐ děng nǐ yíxià, nǐ qù mǎi yào.\n我 在 这里 等 你 一下， 你 去 买 药。",
            "Nǐ zài zhèlǐ děng wǒ yíxià, wǒ qù mǎi fàn.\n你 在 这里 等 我 一下， 我 去 买 饭。"
        ),
        audioToSpeak = "你在这里等我一下，我去买药。"
    ),

    // 7. Soal 7: Pilihan Gambar (等一会儿 -> tunggu sebentar)
    Exercise(
        id = "u26_s3_p2_q7",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "等一会儿",
        targetPinyin = "děng yíhuìér",
        targetTranslation = "tunggu sejenak",
        correctAnswer = "tunggu sejenak",
        audioToSpeak = "等一会儿",
        pictureOptions = listOf(
            PictureOption("u26_s3_p2_opt7_1", "menunggu", "", R.drawable.ic_med_rest_sleep, true),
            PictureOption("u26_s3_p2_opt7_2", "obat", "", R.drawable.ic_med_pharmacy_drug, false),
            PictureOption("u26_s3_p2_opt7_3", "sehat", "", R.drawable.ic_med_comfort_healthy, false),
            PictureOption("u26_s3_p2_opt7_4", "ranjang", "", R.drawable.ic_med_bed_rest, false)
        )
    ),

    // 8. Soal 8: Ketik Pinyin (tolong bantu -> qǐngbāng)
    Exercise(
        id = "u26_s3_p2_q8",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "tolong bantu",
        sentenceWithBlank = "请帮 (________)",
        targetHanzi = "请帮",
        targetPinyin = "qǐngbāng",
        correctAnswer = "qingbang",
        keyboardKeys = listOf("q", "i", "n", "g", "b", "a", "e", "o", "u", "d", "h", "j"),
        audioToSpeak = "请帮"
    ),

    // 9. Soal 9: Susun Kalimat (Tolong bantu saya mengambil obat.)
    Exercise(
        id = "u26_s3_p2_q9",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Tolong bantu saya mengambil obat.",
        targetHanzi = "请 帮 我 拿 药。",
        targetPinyin = "Qǐng bāng wǒ ná yào.",
        wordChips = listOf("请:qǐng", "帮:bāng", "我:wǒ", "拿:ná", "药。:yào.", "水:shuǐ"),
        correctAnswer = "请,帮,我,拿,药。",
        audioToSpeak = "请帮我拿药。"
    ),

    // 10. Soal 10: Ketuk Pasangan yang Sesuai (Rangkuman Menunggu Bantuan)
    Exercise(
        id = "u26_s3_p2_m10",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u26_s3_p2_m10_1", "等一等", "děng yi děng", "tunggu sebentar"),
            MatchPairItem("u26_s3_p2_m10_2", "请帮我", "qǐng bāng wǒ", "tolong bantu"),
            MatchPairItem("u26_s3_p2_m10_3", "去拿药", "qù ná yào", "ambil obat"),
            MatchPairItem("u26_s3_p2_m10_4", "看病", "kànbìng", "berobat")
        )
    )
)
