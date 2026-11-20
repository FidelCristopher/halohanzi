package com.example.chineselearning.data.repository

import com.example.chineselearning.R
import com.example.chineselearning.data.model.Exercise
import com.example.chineselearning.data.model.ExerciseType
import com.example.chineselearning.data.model.MatchPairItem
import com.example.chineselearning.data.model.PictureOption

val bab21Stage4Part1Exercises = listOf(
    // 1. Soal 1: Pilihan Gambar (下来 -> turun ke sini)
    Exercise(
        id = "u21_s4_p1_q1",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "下来",
        targetPinyin = "xiàlái",
        targetTranslation = "turun ke sini",
        correctAnswer = "turun ke sini",
        audioToSpeak = "下来",
        pictureOptions = listOf(
            PictureOption("u21_s4_p1_opt1", "turun ke sini", "", R.drawable.ic_pos_down, true),
            PictureOption("u21_s4_p1_opt2", "naik ke sini", "", R.drawable.ic_pos_up, false),
            PictureOption("u21_s4_p1_opt3", "masuk ke sini", "", R.drawable.ic_pos_in, false),
            PictureOption("u21_s4_p1_opt4", "keluar ke sana", "", R.drawable.ic_pos_out, false)
        )
    ),

    // 2. Soal 2: Susun Kalimat (Kamu berdiri di atas terlalu tinggi, cepatlah turun!)
    Exercise(
        id = "u21_s4_p1_q2",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Terlalu tinggi, cepat turun kemari!",
        targetHanzi = "太 高 了， 快 下来！",
        targetPinyin = "Tài gāo le, kuài xiàlái!",
        wordChips = listOf("太:tài", "高:gāo", "了，:le,", "快:kuài", "下来！:xiàlái!", "上去:shàngqù"),
        correctAnswer = "太,高,了，,快,下来！",
        audioToSpeak = "太高了，快下来！"
    ),

    // 3. Soal 3: Ketuk Pasangan yang Sesuai (Turun Kemari)
    Exercise(
        id = "u21_s4_p1_q3",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u21_s4_p1_m1", "下来", "xiàlái", "turun ke sini"),
            MatchPairItem("u21_s4_p1_m2", "快下来", "kuài xiàlái", "cepat turun"),
            MatchPairItem("u21_s4_p1_m3", "走下来", "zǒu xiàlái", "jalan turun"),
            MatchPairItem("u21_s4_p1_m4", "太高", "tài gāo", "terlalu tinggi")
        )
    ),

    // 4. Soal 4: Ketik Pinyin (turun ke sini -> xiàlái)
    Exercise(
        id = "u21_s4_p1_q4",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "turun ke sini",
        sentenceWithBlank = "下来 (________)",
        targetHanzi = "下来",
        targetPinyin = "xiàlái",
        correctAnswer = "xialai",
        keyboardKeys = listOf("x", "i", "a", "l", "e", "o", "u", "b", "d", "g", "h", "j"),
        audioToSpeak = "下来"
    ),

    // 5. Soal 5: Mendengar Kalimat (Rule 10: illustrationRes = 0)
    Exercise(
        id = "u21_s4_p1_q5",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Apa yang Anda dengar?",
        targetTranslation = "Guru telah berjalan turun dari lantai atas.",
        targetHanzi = "老师 从 楼上 走 下来 了。",
        targetPinyin = "Lǎoshī cóng lóushàng zǒu xiàlái le.",
        wordChips = listOf("老师:lǎoshī", "从:cóng", "楼上:lóushàng", "走:zǒu", "下来:xiàlái", "了。:le.", "上去:shàngqù"),
        correctAnswer = "老师,从,楼上,走,下来,了。",
        illustrationRes = 0,
        audioToSpeak = "老师从楼上走下来了。"
    ),

    // 6. Soal 6: Pilihan Kalimat
    Exercise(
        id = "u21_s4_p1_q6",
        type = ExerciseType.SENTENCE_CHOICE,
        title = "Pilih terjemahan yang benar",
        targetHanzi = "小鸟 从 树上 飞 下来 了。",
        targetPinyin = "Xiǎoniǎo cóng shùshang fēi xiàlái le.",
        targetTranslation = "Burung kecil terbang turun dari atas pohon.",
        correctAnswer = "Xiǎoniǎo cóng shùshang fēi xiàlái le.\n小鸟 从 树上 飞 下来 了。",
        options = listOf(
            "Xiǎoniǎo cóng shùshang fēi xiàlái le.\n小鸟 从 树上 飞 下来 了。",
            "Xiǎoniǎo cóng shùshang fēi shàngqù le.\n小鸟 从 树上 飞 上去 了。",
            "Xiǎomāo cóng shùshang fēi xiàlái le.\n小猫 从 树上 飞 下来 了。"
        ),
        audioToSpeak = "小鸟从树上飞下来了。"
    ),

    // 7. Soal 7: Pilihan Gambar (走下来 -> jalan turun)
    Exercise(
        id = "u21_s4_p1_q7",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "走下来",
        targetPinyin = "zǒu xiàlái",
        targetTranslation = "berjalan turun ke sini",
        correctAnswer = "berjalan turun ke sini",
        audioToSpeak = "走下来",
        pictureOptions = listOf(
            PictureOption("u21_s4_p1_opt7_1", "turun ke sini", "", R.drawable.ic_pos_down, true),
            PictureOption("u21_s4_p1_opt7_2", "naik ke sini", "", R.drawable.ic_pos_up, false),
            PictureOption("u21_s4_p1_opt7_3", "masuk", "", R.drawable.ic_pos_in, false),
            PictureOption("u21_s4_p1_opt7_4", "keluar", "", R.drawable.ic_pos_out, false)
        )
    ),

    // 8. Soal 8: Ketik Pinyin (turun ke sini -> xiàlái)
    Exercise(
        id = "u21_s4_p1_q8",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "turun ke sini",
        sentenceWithBlank = "下来 (________)",
        targetHanzi = "下来",
        targetPinyin = "xiàlái",
        correctAnswer = "xialai",
        keyboardKeys = listOf("x", "i", "a", "l", "e", "o", "u", "b", "d", "g", "h", "j"),
        audioToSpeak = "下来"
    ),

    // 9. Soal 9: Susun Kalimat (Ibu memanggil saya turun makan.)
    Exercise(
        id = "u21_s4_p1_q9",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Ibu memanggil saya turun makan.",
        targetHanzi = "妈妈 叫 我 下来 吃饭。",
        targetPinyin = "Māma jiào wǒ xiàlái chīfàn.",
        wordChips = listOf("妈妈:māma", "叫:jiào", "我:wǒ", "下来:xiàlái", "吃饭。:chīfàn.", "上去:shàngqù"),
        correctAnswer = "妈妈,叫,我,下来,吃饭。",
        audioToSpeak = "妈妈叫我下来吃饭。"
    ),

    // 10. Soal 10: Ketuk Pasangan yang Sesuai (Rangkuman Turun Mendekat)
    Exercise(
        id = "u21_s4_p1_m10",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u21_s4_p1_m10_1", "下来", "xiàlái", "turun ke sini"),
            MatchPairItem("u21_s4_p1_m10_2", "飞下来", "fēi xiàlái", "terbang turun"),
            MatchPairItem("u21_s4_p1_m10_3", "叫我", "jiào wǒ", "memanggilku"),
            MatchPairItem("u21_s4_p1_m10_4", "下楼", "xià lóu", "turun lantai")
        )
    )
)

val bab21Stage4Part2Exercises = listOf(
    // 1. Soal 1: Pilihan Gambar (下去 -> turun ke sana)
    Exercise(
        id = "u21_s4_p2_q1",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "下去",
        targetPinyin = "xiàqù",
        targetTranslation = "turun ke sana",
        correctAnswer = "turun ke sana",
        audioToSpeak = "下去",
        pictureOptions = listOf(
            PictureOption("u21_s4_p2_opt1", "turun ke sana", "", R.drawable.ic_pos_down, true),
            PictureOption("u21_s4_p2_opt2", "naik ke sana", "", R.drawable.ic_pos_up, false),
            PictureOption("u21_s4_p2_opt3", "masuk", "", R.drawable.ic_pos_in, false),
            PictureOption("u21_s4_p2_opt4", "keluar", "", R.drawable.ic_pos_out, false)
        )
    ),

    // 2. Soal 2: Susun Kalimat (Harap semua orang berjalan turun sesuai urutan.)
    Exercise(
        id = "u21_s4_p2_q2",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Harap berjalan turun teratur.",
        targetHanzi = "请 走 下去。",
        targetPinyin = "Qǐng zǒu xiàqù.",
        wordChips = listOf("请:qǐng", "走:zǒu", "下去。:xiàqù.", "上来:shànglái"),
        correctAnswer = "请,走,下去。",
        audioToSpeak = "请走下去。"
    ),

    // 3. Soal 3: Ketuk Pasangan yang Sesuai (Turun Menjauh)
    Exercise(
        id = "u21_s4_p2_m3",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u21_s4_p2_m1", "下去", "xiàqù", "turun ke sana"),
            MatchPairItem("u21_s4_p2_m2", "走下去", "zǒu xiàqù", "berjalan turun"),
            MatchPairItem("u21_s4_p2_m3", "跑下去", "pǎo xiàqù", "berlari turun"),
            MatchPairItem("u21_s4_p2_m4", "楼下", "lóuxià", "lantai bawah")
        )
    ),

    // 4. Soal 4: Ketik Pinyin (turun ke sana -> xiàqù)
    Exercise(
        id = "u21_s4_p2_q4",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "turun ke sana",
        sentenceWithBlank = "下去 (________)",
        targetHanzi = "下去",
        targetPinyin = "xiàqù",
        correctAnswer = "xiaqu",
        keyboardKeys = listOf("x", "i", "a", "q", "u", "e", "o", "b", "d", "g", "h", "j"),
        audioToSpeak = "下去"
    ),

    // 5. Soal 5: Mendengar Kalimat (Rule 10: illustrationRes = 0)
    Exercise(
        id = "u21_s4_p2_q5",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Apa yang Anda dengar?",
        targetTranslation = "Dia membawa koper berjalan turun ke lantai bawah.",
        targetHanzi = "他 拿 着 箱子 走 下去 了。",
        targetPinyin = "Tā ná zhe xiāngzi zǒu xiàqù le.",
        wordChips = listOf("他:tā", "拿:ná", "着:zhe", "箱子:xiāngzi", "走:zǒu", "下去:xiàqù", "了。:le."),
        correctAnswer = "他,拿,着,箱子,走,下去,了。",
        illustrationRes = 0,
        audioToSpeak = "他拿着箱子走下去了。"
    ),

    // 6. Soal 6: Pilihan Kalimat
    Exercise(
        id = "u21_s4_p2_q6",
        type = ExerciseType.SENTENCE_CHOICE,
        title = "Pilih terjemahan yang benar",
        targetHanzi = "太阳 落 下去 了。",
        targetPinyin = "Tàiyáng luò xiàqù le.",
        targetTranslation = "Matahari telah terbenam turun.",
        correctAnswer = "Tàiyáng luò xiàqù le.\n太阳 落 下去 了。",
        options = listOf(
            "Tàiyáng luò xiàqù le.\n太阳 落 下去 了。",
            "Tàiyáng shēng chūlái le.\n太阳 升 出来 了。",
            "Yuèliang luò xiàqù le.\n月亮 落 下去 了。"
        ),
        audioToSpeak = "太阳落下去了。"
    ),

    // 7. Soal 7: Pilihan Gambar (走下去 -> berjalan turun ke sana)
    Exercise(
        id = "u21_s4_p2_q7",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "走下去",
        targetPinyin = "zǒu xiàqù",
        targetTranslation = "berjalan turun ke sana",
        correctAnswer = "berjalan turun ke sana",
        audioToSpeak = "走下去",
        pictureOptions = listOf(
            PictureOption("u21_s4_p2_opt7_1", "turun ke sana", "", R.drawable.ic_pos_down, true),
            PictureOption("u21_s4_p2_opt7_2", "naik ke atas", "", R.drawable.ic_pos_up, false),
            PictureOption("u21_s4_p2_opt7_3", "masuk ke sini", "", R.drawable.ic_pos_in, false),
            PictureOption("u21_s4_p2_opt7_4", "keluar ke sana", "", R.drawable.ic_pos_out, false)
        )
    ),

    // 8. Soal 8: Ketik Pinyin (berjalan turun -> zǒuxiàqù)
    Exercise(
        id = "u21_s4_p2_q8",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "berjalan turun ke sana",
        sentenceWithBlank = "走下去 (________)",
        targetHanzi = "走下去",
        targetPinyin = "zǒuxiàqù",
        correctAnswer = "zouxiaqu",
        keyboardKeys = listOf("z", "o", "u", "x", "i", "a", "q", "e", "b", "d", "g", "h"),
        audioToSpeak = "走下去"
    ),

    // 9. Soal 9: Susun Kalimat (Silakan bawa barang-barang ini turun ke bawah.)
    Exercise(
        id = "u21_s4_p2_q9",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Tolong bawa barang ini turun.",
        targetHanzi = "请 把 东西 拿 下去。",
        targetPinyin = "Qǐng bǎ dōngxi ná xiàqù.",
        wordChips = listOf("请:qǐng", "把:bǎ", "东西:dōngxi", "拿:ná", "下去。:xiàqù.", "上来:shànglái"),
        correctAnswer = "请,把,东西,拿,下去。",
        audioToSpeak = "请把东西拿下去。"
    ),

    // 10. Soal 10: Ketuk Pasangan yang Sesuai (Rangkuman Turun Menjauh)
    Exercise(
        id = "u21_s4_p2_m10",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u21_s4_p2_m10_1", "下去", "xiàqù", "turun ke sana"),
            MatchPairItem("u21_s4_p2_m10_2", "拿下去", "ná xiàqù", "bawa turun"),
            MatchPairItem("u21_s4_p2_m10_3", "太阳落", "tàiyáng luò", "mentari terbenam"),
            MatchPairItem("u21_s4_p2_m10_4", "按顺序", "àn shùnxù", "teratur rapi")
        )
    )
)
