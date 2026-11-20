package com.example.chineselearning.data.repository

import com.example.chineselearning.R
import com.example.chineselearning.data.model.Exercise
import com.example.chineselearning.data.model.ExerciseType
import com.example.chineselearning.data.model.MatchPairItem
import com.example.chineselearning.data.model.PictureOption

val bab27Stage3Part1Exercises = listOf(
    // 1. Soal 1: Pilihan Gambar (上网 -> berselancar di internet)
    Exercise(
        id = "u27_s3_p1_q1",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "上网",
        targetPinyin = "shàngwǎng",
        targetTranslation = "berselancar di internet",
        correctAnswer = "berselancar di internet",
        audioToSpeak = "上网",
        pictureOptions = listOf(
            PictureOption("u27_s3_p1_opt1", "internet", "", R.drawable.ic_digi_surf_internet, true),
            PictureOption("u27_s3_p1_opt2", "kamera", "", R.drawable.ic_digi_camera_photo, false),
            PictureOption("u27_s3_p1_opt3", "musik", "", R.drawable.ic_digi_music_sing, false),
            PictureOption("u27_s3_p1_opt4", "lukisan", "", R.drawable.ic_hobby_painting, false)
        )
    ),

    // 2. Soal 2: Susun Kalimat (Sekarang setiap hari semua orang berselancar di internet mencari bahan.)
    Exercise(
        id = "u27_s3_p1_q2",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Sekarang tiap hari semua internetan.",
        targetHanzi = "现在 大家 每天 上网 查 资料。",
        targetPinyin = "Xiànzài dàjiā měitiān shàngwǎng chá zīliào.",
        wordChips = listOf("现在:xiànzài", "大家:dàjiā", "每天:měitiān", "上网:shàngwǎng", "查:chá", "资料。:zīliào.", "不:bù"),
        correctAnswer = "现在,大家,每天,上网,查,资料。",
        audioToSpeak = "现在大家每天上网查资料。"
    ),

    // 3. Soal 3: Ketuk Pasangan yang Sesuai (Internet & Online)
    Exercise(
        id = "u27_s3_p1_q3",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u27_s3_p1_m1", "上网", "shàngwǎng", "online / internet"),
            MatchPairItem("u27_s3_p1_m2", "网上", "wǎngshang", "di internet"),
            MatchPairItem("u27_s3_p1_m3", "查资料", "chá zīliào", "cari informasi"),
            MatchPairItem("u27_s3_p1_m4", "很方便", "hěn fāngbiàn", "sangat praktis")
        )
    ),

    // 4. Soal 4: Ketik Pinyin (internetan -> shàngwǎng)
    Exercise(
        id = "u27_s3_p1_q4",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "berselancar di internet",
        sentenceWithBlank = "上网 (________)",
        targetHanzi = "上网",
        targetPinyin = "shàngwǎng",
        correctAnswer = "shangwang",
        keyboardKeys = listOf("s", "h", "a", "n", "g", "w", "e", "i", "o", "u", "b", "d"),
        audioToSpeak = "上网"
    ),

    // 5. Soal 5: Mendengar Kalimat (Rule 10: illustrationRes = 0)
    Exercise(
        id = "u27_s3_p1_q5",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Apa yang Anda dengar?",
        targetTranslation = "Banyak barang yang dibeli secara daring di internet lebih murah daripada di mall.",
        targetHanzi = "网上 买 东西 比 商场 便宜。",
        targetPinyin = "Wǎngshang mǎi dōngxi bǐ shāngchǎng piányi.",
        wordChips = listOf("网上:wǎngshang", "买:mǎi", "东西:dōngxi", "比:bǐ", "商场:shāngchǎng", "便宜。:piányi.", "贵:guì"),
        correctAnswer = "网上,买,东西,比,商场,便宜。",
        illustrationRes = 0,
        audioToSpeak = "网上买东西比商场便宜。"
    ),

    // 6. Soal 6: Pilihan Kalimat
    Exercise(
        id = "u27_s3_p1_q6",
        type = ExerciseType.SENTENCE_CHOICE,
        title = "Pilih terjemahan yang benar",
        targetHanzi = "弟弟 喜欢 在 网上 玩 游戏。",
        targetPinyin = "Dìdi xǐhuan zài wǎngshang wán yóuxì.",
        targetTranslation = "Adik laki-laki suka bermain game di internet.",
        correctAnswer = "Dìdi xǐhuan zài wǎngshang wán yóuxì.\n弟弟 喜欢 在 网上 玩 游戏。",
        options = listOf(
            "Dìdi xǐhuan zài wǎngshang wán yóuxì.\n弟弟 喜欢 在 网上 玩 游戏。",
            "Dìdi bù xǐhuan zài wǎngshang wán yóuxì.\n弟弟 不 喜欢 在 网上 玩 游戏。",
            "Gēge xǐhuan zài wǎngshang wán yóuxì.\n哥哥 喜欢 在 网上 玩 游戏。"
        ),
        audioToSpeak = "弟弟喜欢在网上玩游戏。"
    ),

    // 7. Soal 7: Pilihan Gambar (网上 -> di internet / daring)
    Exercise(
        id = "u27_s3_p1_q7",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "网上",
        targetPinyin = "wǎngshang",
        targetTranslation = "di internet / online",
        correctAnswer = "di internet / online",
        audioToSpeak = "网上",
        pictureOptions = listOf(
            PictureOption("u27_s3_p1_opt7_1", "di internet", "", R.drawable.ic_digi_surf_internet, true),
            PictureOption("u27_s3_p1_opt7_2", "foto", "", R.drawable.ic_digi_camera_photo, false),
            PictureOption("u27_s3_p1_opt7_3", "musik", "", R.drawable.ic_digi_music_sing, false),
            PictureOption("u27_s3_p1_opt7_4", "lukisan", "", R.drawable.ic_hobby_painting, false)
        )
    ),

    // 8. Soal 8: Ketik Pinyin (di internet -> wǎngshang)
    Exercise(
        id = "u27_s3_p1_q8",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "di internet / secara daring",
        sentenceWithBlank = "网上 (________)",
        targetHanzi = "网上",
        targetPinyin = "wǎngshang",
        correctAnswer = "wangshang",
        keyboardKeys = listOf("w", "a", "n", "g", "s", "h", "e", "i", "o", "u", "b", "d"),
        audioToSpeak = "网上"
    ),

    // 9. Soal 9: Susun Kalimat (Saya belajar bahasa Mandarin secara daring di internet.)
    Exercise(
        id = "u27_s3_p1_q9",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Saya belajar Mandarin daring di internet.",
        targetHanzi = "我 在 网上 学 汉语。",
        targetPinyin = "Wǒ zài wǎngshang xué Hànyǔ.",
        wordChips = listOf("我:wǒ", "在:zài", "网上:wǎngshang", "学:xué", "汉语。:Hànyǔ.", "看:kàn"),
        correctAnswer = "我,在,网上,学,汉语。",
        audioToSpeak = "我在网上学汉语。"
    ),

    // 10. Soal 10: Ketuk Pasangan yang Sesuai (Rangkuman Kehidupan Daring)
    Exercise(
        id = "u27_s3_p1_m10",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u27_s3_p1_m10_1", "上网", "shàngwǎng", "berinternet"),
            MatchPairItem("u27_s3_p1_m10_2", "网上买", "wǎngshang mǎi", "beli online"),
            MatchPairItem("u27_s3_p1_m10_3", "玩游戏", "wán yóuxì", "main game"),
            MatchPairItem("u27_s3_p1_m10_4", "学汉语", "xué Hànyǔ", "belajar Mandarin")
        )
    )
)

val bab27Stage3Part2Exercises = listOf(
    // 1. Soal 1: Pilihan Gambar (打开 -> membuka / menyalakan)
    Exercise(
        id = "u27_s3_p2_q1",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "打开",
        targetPinyin = "dǎkāi",
        targetTranslation = "membuka / menyalakan",
        correctAnswer = "membuka / menyalakan",
        audioToSpeak = "打开",
        pictureOptions = listOf(
            PictureOption("u27_s3_p2_opt1", "membuka", "", R.drawable.ic_digi_surf_internet, true),
            PictureOption("u27_s3_p2_opt2", "foto", "", R.drawable.ic_digi_camera_photo, false),
            PictureOption("u27_s3_p2_opt3", "musik", "", R.drawable.ic_digi_music_sing, false),
            PictureOption("u27_s3_p2_opt4", "lukisan", "", R.drawable.ic_hobby_painting, false)
        )
    ),

    // 2. Soal 2: Susun Kalimat (Silakan semuanya membuka buku ke halaman tiga puluh.)
    Exercise(
        id = "u27_s3_p2_q2",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Buka buku ke halaman 30.",
        targetHanzi = "请 把 书 打开 到 三十 页。",
        targetPinyin = "Qǐng bǎ shū dǎkāi dào sānshí yè.",
        wordChips = listOf("请:qǐng", "把:bǎ", "书:shū", "打开:dǎkāi", "到:dào", "三十:sānshí", "页。:yè.", "关上:guānshàng"),
        correctAnswer = "请,把,书,打开,到,三十,页。",
        audioToSpeak = "请把书打开到三十页。"
    ),

    // 3. Soal 3: Ketuk Pasangan yang Sesuai (Buka & Nyalakan)
    Exercise(
        id = "u27_s3_p2_m3",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u27_s3_p2_m1", "打开", "dǎkāi", "membuka / menyalakan"),
            MatchPairItem("u27_s3_p2_m2", "打开电脑", "dǎkāi diànnǎo", "nyalakan komputer"),
            MatchPairItem("u27_s3_p2_m3", "开门", "kāimén", "membuka pintu"),
            MatchPairItem("u27_s3_p2_m4", "关上", "guānshàng", "menutup")
        )
    ),

    // 4. Soal 4: Ketik Pinyin (membuka -> dǎkāi)
    Exercise(
        id = "u27_s3_p2_q4",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "membuka / menyalakan",
        sentenceWithBlank = "打开 (________)",
        targetHanzi = "打开",
        targetPinyin = "dǎkāi",
        correctAnswer = "dakai",
        keyboardKeys = listOf("d", "a", "k", "i", "e", "o", "u", "b", "g", "h", "j", "l"),
        audioToSpeak = "打开"
    ),

    // 5. Soal 5: Mendengar Kalimat (Rule 10: illustrationRes = 0)
    Exercise(
        id = "u27_s3_p2_q5",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Apa yang Anda dengar?",
        targetTranslation = "Tolong buka pintunya.",
        targetHanzi = "请 把 门 打开。",
        targetPinyin = "Qǐng bǎ mén dǎkāi.",
        wordChips = listOf("请:qǐng", "把:bǎ", "门:mén", "打开。:dǎkāi.", "关上:guānshàng"),
        correctAnswer = "请,把,门,打开。",
        illustrationRes = 0,
        audioToSpeak = "请把门打开。"
    ),

    // 6. Soal 6: Pilihan Kalimat
    Exercise(
        id = "u27_s3_p2_q6",
        type = ExerciseType.SENTENCE_CHOICE,
        title = "Pilih terjemahan yang benar",
        targetHanzi = "他 打开 电脑 开始 工作。",
        targetPinyin = "Tā dǎkāi diànnǎo kāishǐ gōngzuò.",
        targetTranslation = "Dia menyalakan komputer mulai bekerja.",
        correctAnswer = "Tā dǎkāi diànnǎo kāishǐ gōngzuò.\n他 打开 电脑 开始 工作。",
        options = listOf(
            "Tā dǎkāi diànnǎo kāishǐ gōngzuò.\n他 打开 电脑 开始 工作。",
            "Tā guānshàng diànnǎo kāishǐ gōngzuò.\n他 关上 电脑 开始 工作。",
            "Wǒ dǎkāi diànnǎo kāishǐ gōngzuò.\n我 打开 电脑 开始 工作。"
        ),
        audioToSpeak = "他打开电脑开始工作。"
    ),

    // 7. Soal 7: Pilihan Gambar (打开电脑 -> nyalakan laptop/komputer)
    Exercise(
        id = "u27_s3_p2_q7",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "打开电脑",
        targetPinyin = "dǎkāi diànnǎo",
        targetTranslation = "nyalakan komputer",
        correctAnswer = "nyalakan komputer",
        audioToSpeak = "打开电脑",
        pictureOptions = listOf(
            PictureOption("u27_s3_p2_opt7_1", "komputer", "", R.drawable.ic_digi_surf_internet, true),
            PictureOption("u27_s3_p2_opt7_2", "kamera", "", R.drawable.ic_digi_camera_photo, false),
            PictureOption("u27_s3_p2_opt7_3", "musik", "", R.drawable.ic_digi_music_sing, false),
            PictureOption("u27_s3_p2_opt7_4", "lukisan", "", R.drawable.ic_hobby_painting, false)
        )
    ),

    // 8. Soal 8: Ketik Pinyin (membuka -> dǎkāi)
    Exercise(
        id = "u27_s3_p2_q8",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "membuka",
        sentenceWithBlank = "打开 (________)",
        targetHanzi = "打开",
        targetPinyin = "dǎkāi",
        correctAnswer = "dakai",
        keyboardKeys = listOf("d", "a", "k", "i", "e", "o", "u", "b", "g", "h", "j", "l"),
        audioToSpeak = "打开"
    ),

    // 9. Soal 9: Susun Kalimat (Tolong nyalakan lampu di dalam ruangan.)
    Exercise(
        id = "u27_s3_p2_q9",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Silakan nyalakan lampu.",
        targetHanzi = "请 打开 灯。",
        targetPinyin = "Qǐng dǎkāi dēng.",
        wordChips = listOf("请:qǐng", "打开:dǎkāi", "灯。:dēng.", "关上:guānshàng"),
        correctAnswer = "请,打开,灯。",
        audioToSpeak = "请打开灯。"
    ),

    // 10. Soal 10: Ketuk Pasangan yang Sesuai (Rangkuman Membuka & Menutup)
    Exercise(
        id = "u27_s3_p2_m10",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u27_s3_p2_m10_1", "打开", "dǎkāi", "membuka"),
            MatchPairItem("u27_s3_p2_m10_2", "打开书", "dǎkāi shū", "buka buku"),
            MatchPairItem("u27_s3_p2_m10_3", "开灯", "kāi dēng", "nyalakan lampu"),
            MatchPairItem("u27_s3_p2_m10_4", "关门", "guān mén", "tutup pintu")
        )
    )
)
