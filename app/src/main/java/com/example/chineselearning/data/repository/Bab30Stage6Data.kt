package com.example.chineselearning.data.repository

import com.example.chineselearning.R
import com.example.chineselearning.data.model.Exercise
import com.example.chineselearning.data.model.ExerciseType
import com.example.chineselearning.data.model.MatchPairItem
import com.example.chineselearning.data.model.PictureOption

val bab30Stage6Part1Exercises = listOf(
    // 1. Soal 1: Pilihan Gambar (万 -> sepuluh ribu nilai puncak)
    Exercise(
        id = "u30_s6_p1_q1",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "万",
        targetPinyin = "wàn",
        targetTranslation = "sepuluh ribu",
        correctAnswer = "sepuluh ribu",
        audioToSpeak = "万",
        pictureOptions = listOf(
            PictureOption("u30_s6_p1_opt1", "10.000", "", R.drawable.ic_fin_ten_thousand, true),
            PictureOption("u30_s6_p1_opt2", "mall", "", R.drawable.ic_shop_mall_plaza, false),
            PictureOption("u30_s6_p1_opt3", "trofi", "", R.drawable.ic_eval_mastery_trophy, false),
            PictureOption("u30_s6_p1_opt4", "pekan", "", R.drawable.ic_cal_week_cycle, false)
        )
    ),

    // 2. Soal 2: Susun Kalimat (Hari ini cerah, kami pergi ke mall bersama-sama.)
    Exercise(
        id = "u30_s6_p1_q2",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Hari ini cerah, kami ke mall bersama.",
        targetHanzi = "今天 晴天， 我们 去 商场。",
        targetPinyin = "Jīntiān qíngtiān, wǒmen qù shāngchǎng.",
        wordChips = listOf("今天:jīntiān", "晴天，:qíngtiān,", "我们:wǒmen", "去:qù", "商场。:shāngchǎng.", "下雨:xiàyǔ"),
        correctAnswer = "今天,晴天，,我们,去,商场。",
        audioToSpeak = "今天晴天，我们去商场。"
    ),

    // 3. Soal 3: Ketuk Pasangan yang Sesuai (Grand Final Bagian 1)
    Exercise(
        id = "u30_s6_p1_m3",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u30_s6_p1_m1", "万", "wàn", "sepuluh ribu"),
            MatchPairItem("u30_s6_p1_m2", "晴", "qíng", "cerah"),
            MatchPairItem("u30_s6_p1_m3", "阴", "yīn", "mendung"),
            MatchPairItem("u30_s6_p1_m4", "商场", "shāngchǎng", "mall")
        )
    ),

    // 4. Soal 4: Ketik Pinyin (sepuluh ribu -> wàn)
    Exercise(
        id = "u30_s6_p1_q4",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "sepuluh ribu",
        sentenceWithBlank = "万 (________)",
        targetHanzi = "万",
        targetPinyin = "wàn",
        correctAnswer = "wan",
        keyboardKeys = listOf("w", "a", "n", "e", "i", "o", "u", "b", "d", "g", "h", "j"),
        audioToSpeak = "万"
    ),

    // 5. Soal 5: Mendengar Kalimat (Rule 10: illustrationRes = 0)
    Exercise(
        id = "u30_s6_p1_q5",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Apa yang Anda dengar?",
        targetTranslation = "Pekan depan kita ada ujian akhir.",
        targetHanzi = "下周 我们 有 考试。",
        targetPinyin = "Xiàzhōu wǒmen yǒu kǎoshì.",
        wordChips = listOf("下周:xiàzhōu", "我们:wǒmen", "有:yǒu", "考试。:kǎoshì.", "玩:wán"),
        correctAnswer = "下周,我们,有,考试。",
        illustrationRes = 0,
        audioToSpeak = "下周我们有考试。"
    ),

    // 6. Soal 6: Pilihan Kalimat
    Exercise(
        id = "u30_s6_p1_q6",
        type = ExerciseType.SENTENCE_CHOICE,
        title = "Pilih terjemahan yang benar",
        targetHanzi = "我们 都 听 懂 了 汉语。",
        targetPinyin = "Wǒmen dōu tīng dǒng le Hànyǔ.",
        targetTranslation = "Kami semua telah paham mendengarkan bahasa Mandarin.",
        correctAnswer = "Wǒmen dōu tīng dǒng le Hànyǔ.\n我们 都 听 懂 了 汉语。",
        options = listOf(
            "Wǒmen dōu tīng dǒng le Hànyǔ.\n我们 都 听 懂 了 汉语。",
            "Wǒmen dōu tīng bù dǒng Hànyǔ.\n我们 都 听 不 懂 汉语。",
            "Tāmen dōu tīng dǒng le Hànyǔ.\n他们 都 听 懂 了 汉语。"
        ),
        audioToSpeak = "我们都听懂了汉语。"
    ),

    // 7. Soal 7: Pilihan Gambar (商场 -> mall perbelanjaan)
    Exercise(
        id = "u30_s6_p1_q7",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "商场",
        targetPinyin = "shāngchǎng",
        targetTranslation = "mall",
        correctAnswer = "mall",
        audioToSpeak = "商场",
        pictureOptions = listOf(
            PictureOption("u30_s6_p1_opt7_1", "mall", "", R.drawable.ic_shop_mall_plaza, true),
            PictureOption("u30_s6_p1_opt7_2", "trofi", "", R.drawable.ic_eval_mastery_trophy, false),
            PictureOption("u30_s6_p1_opt7_3", "10.000", "", R.drawable.ic_fin_ten_thousand, false),
            PictureOption("u30_s6_p1_opt7_4", "cerah", "", R.drawable.ic_weather_sunny_clear, false)
        )
    ),

    // 8. Soal 8: Ketik Pinyin (mall -> shāngchǎng)
    Exercise(
        id = "u30_s6_p1_q8",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "pusat belanja",
        sentenceWithBlank = "商场 (________)",
        targetHanzi = "商场",
        targetPinyin = "shāngchǎng",
        correctAnswer = "shangchang",
        keyboardKeys = listOf("s", "h", "a", "n", "g", "c", "e", "i", "o", "u", "b", "d"),
        audioToSpeak = "商场"
    ),

    // 9. Soal 9: Susun Kalimat (Saya sudah dua kali berkunjung ke mall ini.)
    Exercise(
        id = "u30_s6_p1_q9",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Saya sudah dua kali ke mall ini.",
        targetHanzi = "我 来 过 两 次 商场。",
        targetPinyin = "Wǒ lái guo liǎng cì shāngchǎng.",
        wordChips = listOf("我:wǒ", "来:lái", "过:guo", "两:liǎng", "次:cì", "商场。:shāngchǎng.", "三:sān"),
        correctAnswer = "我,来,过,两,次,商场。",
        audioToSpeak = "我来过两次商场。"
    ),

    // 10. Soal 10: Ketuk Pasangan yang Sesuai (Rangkuman Grand Final 1)
    Exercise(
        id = "u30_s6_p1_m10",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u30_s6_p1_m10_1", "万", "wàn", "10 ribu"),
            MatchPairItem("u30_s6_p1_m10_2", "次", "cì", "kali"),
            MatchPairItem("u30_s6_p1_m3", "商场", "shāngchǎng", "mall"),
            MatchPairItem("u30_s6_p1_m4", "听懂", "tīng dǒng", "paham")
        )
    )
)

val bab30Stage6Part2Exercises = listOf(
    // 1. Soal 1: Pilihan Gambar (胜利 -> trofi kelulusan kurikulum)
    Exercise(
        id = "u30_s6_p2_q1",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "完",
        targetPinyin = "wán",
        targetTranslation = "tuntas / selesai",
        correctAnswer = "tuntas / selesai",
        audioToSpeak = "完",
        pictureOptions = listOf(
            PictureOption("u30_s6_p2_opt1", "tuntas", "", R.drawable.ic_eval_mastery_trophy, true),
            PictureOption("u30_s6_p2_opt2", "mall", "", R.drawable.ic_shop_mall_plaza, false),
            PictureOption("u30_s6_p2_opt3", "10.000", "", R.drawable.ic_fin_ten_thousand, false),
            PictureOption("u30_s6_p2_opt4", "pekan", "", R.drawable.ic_cal_week_cycle, false)
        )
    ),

    // 2. Soal 2: Susun Kalimat (Grand Final Ujian HSK 2: Kami semua tamat belajar HSK 2.)
    Exercise(
        id = "u30_s6_p2_q2",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Kami semua tamat belajar HSK 2.",
        targetHanzi = "我们 学 完 了 汉语。",
        targetPinyin = "Wǒmen xué wán le Hànyǔ.",
        wordChips = listOf("我们:wǒmen", "学:xué", "完:wán", "了:le", "汉语。:Hànyǔ.", "英语:Yīngyǔ"),
        correctAnswer = "我们,学,完,了,汉语。",
        audioToSpeak = "我们学完了汉语。"
    ),

    // 3. Soal 3: Ketuk Pasangan yang Sesuai (Puncak Kelulusan HSK 2)
    Exercise(
        id = "u30_s6_p2_m3",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u30_s6_p2_m1", "完", "wán", "selesai"),
            MatchPairItem("u30_s6_p2_m2", "一起", "yìqǐ", "bersama"),
            MatchPairItem("u30_s6_p2_m3", "学完", "xué wán", "tamat belajar"),
            MatchPairItem("u30_s6_p2_m4", "很高兴", "hěn gāoxìng", "gembira")
        )
    ),

    // 4. Soal 4: Ketik Pinyin (bersama -> yìqǐ)
    Exercise(
        id = "u30_s6_p2_q4",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "bersama-sama",
        sentenceWithBlank = "一起 (________)",
        targetHanzi = "一起",
        targetPinyin = "yìqǐ",
        correctAnswer = "yiqi",
        keyboardKeys = listOf("y", "i", "q", "a", "e", "o", "u", "b", "d", "g", "h", "j"),
        audioToSpeak = "一起"
    ),

    // 5. Soal 5: Mendengar Kalimat (Rule 10: illustrationRes = 0)
    Exercise(
        id = "u30_s6_p2_q5",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Apa yang Anda dengar?",
        targetTranslation = "Selamat kepada kalian semua telah menuntaskan pembelajaran!",
        targetHanzi = "祝贺 大家 学习 成功！",
        targetPinyin = "Zhùhè dàjiā xuéxí chénggōng!",
        wordChips = listOf("祝贺:zhùhè", "大家:dàjiā", "学习:xuéxí", "成功！:chénggōng!", "新年:xīnnián"),
        correctAnswer = "祝贺,大家,学习,成功！",
        illustrationRes = 0,
        audioToSpeak = "祝贺大家学习成功！"
    ),

    // 6. Soal 6: Pilihan Kalimat
    Exercise(
        id = "u30_s6_p2_q6",
        type = ExerciseType.SENTENCE_CHOICE,
        title = "Pilih terjemahan yang benar",
        targetHanzi = "我们 会 听、 会 说、 也 会 写 汉字。",
        targetPinyin = "Wǒmen huì tīng, huì shuō, yě huì xiě Hànzì.",
        targetTranslation = "Kami bisa menyimak, bisa berbicara, dan juga bisa menulis karakter Hanzi.",
        correctAnswer = "Wǒmen huì tīng, huì shuō, yě huì xiě Hànzì.\n我们 会 听、 会 说、 也 会 写 汉字。",
        options = listOf(
            "Wǒmen huì tīng, huì shuō, yě huì xiě Hànzì.\n我们 会 听、 会 说、 也 会 写 汉字。",
            "Wǒmen bú huì tīng, bú huì shuō.\n我们 不 会 听， 不 会 说。",
            "Tāmen huì tīng, bú huì xiě.\n他们 会 听， 不 会 写。"
        ),
        audioToSpeak = "我们会听、会说、也会写汉字。"
    ),

    // 7. Soal 7: Pilihan Gambar (成功 -> trofi mahakarya)
    Exercise(
        id = "u30_s6_p2_q7",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "成功",
        targetPinyin = "chénggōng",
        targetTranslation = "berhasil sukses",
        correctAnswer = "berhasil sukses",
        audioToSpeak = "成功",
        pictureOptions = listOf(
            PictureOption("u30_s6_p2_opt7_1", "sukses", "", R.drawable.ic_eval_mastery_trophy, true),
            PictureOption("u30_s6_p2_opt7_2", "pekan", "", R.drawable.ic_cal_week_cycle, false),
            PictureOption("u30_s6_p2_opt7_3", "mall", "", R.drawable.ic_shop_mall_plaza, false),
            PictureOption("u30_s6_p2_opt7_4", "10.000", "", R.drawable.ic_fin_ten_thousand, false)
        )
    ),

    // 8. Soal 8: Ketik Pinyin (bahasa Mandarin -> Hànyǔ)
    Exercise(
        id = "u30_s6_p2_q8",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "bahasa Mandarin",
        sentenceWithBlank = "汉语 (________)",
        targetHanzi = "汉语",
        targetPinyin = "Hànyǔ",
        correctAnswer = "hanyu",
        keyboardKeys = listOf("h", "a", "n", "y", "u", "e", "i", "o", "b", "d", "g", "j"),
        audioToSpeak = "汉语"
    ),

    // 9. Soal 9: Susun Kalimat (Puncak Penutupan New HSK 2)
    Exercise(
        id = "u30_s6_p2_q9",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Semua orang belajar Mandarin dengan gembira.",
        targetHanzi = "大家 学 汉语 很 开心。",
        targetPinyin = "Dàjiā xué Hànyǔ hěn kāixīn.",
        wordChips = listOf("大家:dàjiā", "学:xué", "汉语:Hànyǔ", "很:hěn", "开心。:kāixīn.", "累:lèi"),
        correctAnswer = "大家,学,汉语,很,开心。",
        audioToSpeak = "大家学汉语很开心。"
    ),

    // 10. Soal 10: Ketuk Pasangan yang Sesuai (Rangkuman Grand Puncak HSK 2)
    Exercise(
        id = "u30_s6_p2_m10",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u30_s6_p2_m10_1", "学完了", "xué wán le", "tuntas kurikulum"),
            MatchPairItem("u30_s6_p2_m10_2", "写汉字", "xiě Hànzì", "tulis Hanzi"),
            MatchPairItem("u30_s6_p2_m3", "大家一起", "dàjiā yìqǐ", "semua bersama"),
            MatchPairItem("u30_s6_p2_m4", "成功", "chénggōng", "berhasil")
        )
    )
)
