package com.example.chineselearning.data.repository

import com.example.chineselearning.R
import com.example.chineselearning.data.model.Exercise
import com.example.chineselearning.data.model.ExerciseType
import com.example.chineselearning.data.model.MatchPairItem
import com.example.chineselearning.data.model.PictureOption

val bab20Stage1Part1Exercises = listOf(
    // 1. Soal 1: Pilihan Gambar (左边 -> sebelah kiri)
    Exercise(
        id = "u20_s1_p1_q1",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "左边",
        targetPinyin = "zuǒbian",
        targetTranslation = "sebelah kiri",
        correctAnswer = "sebelah kiri",
        audioToSpeak = "左边",
        pictureOptions = listOf(
            PictureOption("u20_s1_p1_opt1", "sebelah kiri", "", R.drawable.ic_pos_left, true),
            PictureOption("u20_s1_p1_opt2", "sebelah kanan", "", R.drawable.ic_pos_right, false),
            PictureOption("u20_s1_p1_opt3", "di depan", "", R.drawable.ic_pos_front, false),
            PictureOption("u20_s1_p1_opt4", "di belakang", "", R.drawable.ic_pos_back, false)
        )
    ),

    // 2. Soal 2: Susun Kalimat (Sekolah berada di sebelah kiri rumah sakit.)
    Exercise(
        id = "u20_s1_p1_q2",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Sekolah di sebelah kiri rumah sakit.",
        targetHanzi = "学校 在 医院 的 左边。",
        targetPinyin = "Xuéxiào zài yīyuàn de zuǒbian.",
        wordChips = listOf("学校:xuéxiào", "在:zài", "医院:yīyuàn", "的:de", "左边。:zuǒbian.", "右边:yòubian"),
        correctAnswer = "学校,在,医院,的,左边。",
        audioToSpeak = "学校在医院的左边。"
    ),

    // 3. Soal 3: Ketuk Pasangan yang Sesuai (Kiri & Kanan)
    Exercise(
        id = "u20_s1_p1_q3",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u20_s1_p1_m1", "左", "zuǒ", "kiri"),
            MatchPairItem("u20_s1_p1_m2", "左边", "zuǒbian", "sebelah kiri"),
            MatchPairItem("u20_s1_p1_m3", "往左走", "wǎng zuǒ zǒu", "jalan ke kiri"),
            MatchPairItem("u20_s1_p1_m4", "书店", "shūdiàn", "toko buku")
        )
    ),

    // 4. Soal 4: Ketik Pinyin (sebelah kiri -> zuǒbian)
    Exercise(
        id = "u20_s1_p1_q4",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "sebelah kiri",
        sentenceWithBlank = "左边 (________)",
        targetHanzi = "左边",
        targetPinyin = "zuǒbian",
        correctAnswer = "zuobian",
        keyboardKeys = listOf("z", "u", "o", "b", "i", "a", "n", "e", "d", "g", "h", "j"),
        audioToSpeak = "左边"
    ),

    // 5. Soal 5: Mendengar Kalimat (Rule 10: illustrationRes = 0)
    Exercise(
        id = "u20_s1_p1_q5",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Apa yang Anda dengar?",
        targetTranslation = "Lihat ke kiri ada sebuah toko buku.",
        targetHanzi = "往 左 看 有 一 家 书店。",
        targetPinyin = "Wǎng zuǒ kàn yǒu yì jiā shūdiàn.",
        wordChips = listOf("往:wǎng", "左:zuǒ", "看:kàn", "有:yǒu", "一:yì", "家:jiā", "书店。:shūdiàn.", "右:yòu"),
        correctAnswer = "往,左,看,有,一,家,书店。",
        illustrationRes = 0,
        audioToSpeak = "往左看有一家书店。"
    ),

    // 6. Soal 6: Pilihan Kalimat
    Exercise(
        id = "u20_s1_p1_q6",
        type = ExerciseType.SENTENCE_CHOICE,
        title = "Pilih terjemahan yang benar",
        targetHanzi = "我 坐 在 他 的 左边。",
        targetPinyin = "Wǒ zuò zài tā de zuǒbian.",
        targetTranslation = "Saya duduk di sebelah kirinya.",
        correctAnswer = "Wǒ zuò zài tā de zuǒbian.\n我 坐 在 他 的 左边。",
        options = listOf(
            "Wǒ zuò zài tā de zuǒbian.\n我 坐 在 他 的 左边。",
            "Wǒ zuò zài tā de yòubian.\n我 坐 在 他 的 右边。",
            "Tā zuò zài wǒ de zuǒbian.\n他 坐 在 我 的 左边。"
        ),
        audioToSpeak = "我坐在他的左边。"
    ),

    // 7. Soal 7: Pilihan Gambar (左 -> kiri)
    Exercise(
        id = "u20_s1_p1_q7",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "左",
        targetPinyin = "zuǒ",
        targetTranslation = "kiri",
        correctAnswer = "kiri",
        audioToSpeak = "左",
        pictureOptions = listOf(
            PictureOption("u20_s1_p1_opt7_1", "kiri", "", R.drawable.ic_pos_left, true),
            PictureOption("u20_s1_p1_opt7_2", "kanan", "", R.drawable.ic_pos_right, false),
            PictureOption("u20_s1_p1_opt7_3", "atas", "", R.drawable.ic_pos_up, false),
            PictureOption("u20_s1_p1_opt7_4", "bawah", "", R.drawable.ic_pos_down, false)
        )
    ),

    // 8. Soal 8: Ketik Pinyin (kiri -> zuǒ)
    Exercise(
        id = "u20_s1_p1_q8",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "kiri",
        sentenceWithBlank = "左 (________)",
        targetHanzi = "左",
        targetPinyin = "zuǒ",
        correctAnswer = "zuo",
        keyboardKeys = listOf("z", "u", "o", "a", "e", "i", "b", "d", "g", "h", "j", "l"),
        audioToSpeak = "左"
    ),

    // 9. Soal 9: Susun Kalimat (Di sebelah kiri ada dua orang anak kecil.)
    Exercise(
        id = "u20_s1_p1_q9",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Di sebelah kiri ada dua anak.",
        targetHanzi = "左边 有 两 个 小孩儿。",
        targetPinyin = "Zuǒbian yǒu liǎng gè xiǎoháiér.",
        wordChips = listOf("左边:zuǒbian", "有:yǒu", "两:liǎng", "个:gè", "小孩儿。:xiǎoháiér.", "右边:yòubian"),
        correctAnswer = "左边,有,两,个,小孩儿。",
        audioToSpeak = "左边有两个小孩儿。"
    ),

    // 10. Soal 10: Ketuk Pasangan yang Sesuai (Rangkuman Sisi Kiri)
    Exercise(
        id = "u20_s1_p1_m10",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u20_s1_p1_m10_1", "左", "zuǒ", "kiri"),
            MatchPairItem("u20_s1_p1_m10_2", "左边", "zuǒbian", "sebelah kiri"),
            MatchPairItem("u20_s1_p1_m10_3", "坐在左边", "zuò zài zuǒbian", "duduk di kiri"),
            MatchPairItem("u20_s1_p1_m10_4", "往左", "wǎng zuǒ", "ke kiri")
        )
    )
)

val bab20Stage1Part2Exercises = listOf(
    // 1. Soal 1: Pilihan Gambar (右边 -> sebelah kanan)
    Exercise(
        id = "u20_s1_p2_q1",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "右边",
        targetPinyin = "yòubian",
        targetTranslation = "sebelah kanan",
        correctAnswer = "sebelah kanan",
        audioToSpeak = "右边",
        pictureOptions = listOf(
            PictureOption("u20_s1_p2_opt1", "sebelah kanan", "", R.drawable.ic_pos_right, true),
            PictureOption("u20_s1_p2_opt2", "sebelah kiri", "", R.drawable.ic_pos_left, false),
            PictureOption("u20_s1_p2_opt3", "di depan", "", R.drawable.ic_pos_front, false),
            PictureOption("u20_s1_p2_opt4", "di belakang", "", R.drawable.ic_pos_back, false)
        )
    ),

    // 2. Soal 2: Susun Kalimat (Toilet berada di sebelah kanan tangga.)
    Exercise(
        id = "u20_s1_p2_q2",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Toilet di sebelah kanan tangga.",
        targetHanzi = "洗手间 在 楼梯 的 右边。",
        targetPinyin = "Xǐshǒujiān zài lóutī de yòubian.",
        wordChips = listOf("洗手间:xǐshǒujiān", "在:zài", "楼梯:lóutī", "的:de", "右边。:yòubian.", "左边:zuǒbian"),
        correctAnswer = "洗手间,在,楼梯,的,右边。",
        audioToSpeak = "洗手间在楼梯的右边。"
    ),

    // 3. Soal 3: Ketuk Pasangan yang Sesuai (Sisi Kanan)
    Exercise(
        id = "u20_s1_p2_m3",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u20_s1_p2_m1", "右", "yòu", "kanan"),
            MatchPairItem("u20_s1_p2_m2", "右边", "yòubian", "sebelah kanan"),
            MatchPairItem("u20_s1_p2_m3", "往右走", "wǎng yòu zǒu", "jalan ke kanan"),
            MatchPairItem("u20_s1_p2_m4", "洗手间", "xǐshǒujiān", "toilet")
        )
    ),

    // 4. Soal 4: Ketik Pinyin (sebelah kanan -> yòubian)
    Exercise(
        id = "u20_s1_p2_q4",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "sebelah kanan",
        sentenceWithBlank = "右边 (________)",
        targetHanzi = "右边",
        targetPinyin = "yòubian",
        correctAnswer = "youbian",
        keyboardKeys = listOf("y", "o", "u", "b", "i", "a", "n", "e", "d", "g", "h", "j"),
        audioToSpeak = "右边"
    ),

    // 5. Soal 5: Mendengar Kalimat (Rule 10: illustrationRes = 0)
    Exercise(
        id = "u20_s1_p2_q5",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Apa yang Anda dengar?",
        targetTranslation = "Sampai di perempatan jalan silakan jalan ke kanan.",
        targetHanzi = "到 了 路口 请 往 右 走。",
        targetPinyin = "Dào le lùkǒu qǐng wǎng yòu zǒu.",
        wordChips = listOf("到:dào", "了:le", "路口:lùkǒu", "请:qǐng", "往:wǎng", "右:yòu", "走。:zǒu.", "左:zuǒ"),
        correctAnswer = "到,了,路口,请,往,右,走。",
        illustrationRes = 0,
        audioToSpeak = "到了路口请往右走。"
    ),

    // 6. Soal 6: Pilihan Kalimat
    Exercise(
        id = "u20_s1_p2_q6",
        type = ExerciseType.SENTENCE_CHOICE,
        title = "Pilih terjemahan yang benar",
        targetHanzi = "桌子 的 右边 放 着 一 台 电脑。",
        targetPinyin = "Zhuōzi de yòubian fàng zhe yì tái diànnǎo.",
        targetTranslation = "Di sebelah kanan meja diletakkan sebuah komputer.",
        correctAnswer = "Zhuōzi de yòubian fàng zhe yì tái diànnǎo.\n桌子 的 右边 放 着 一 台 电脑。",
        options = listOf(
            "Zhuōzi de yòubian fàng zhe yì tái diànnǎo.\n桌子 的 右边 放 着 一 台 电脑。",
            "Zhuōzi de zuǒbian fàng zhe yì tái diànnǎo.\n桌子 的 左边 放 着 一 台 电脑。",
            "Zhuōzi de shàngmiàn fàng zhe yì tái diànnǎo.\n桌子 的 上面 放 着 一 台 电脑。"
        ),
        audioToSpeak = "桌子的右边放着一台电脑。"
    ),

    // 7. Soal 7: Pilihan Gambar (右 -> kanan)
    Exercise(
        id = "u20_s1_p2_q7",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "右",
        targetPinyin = "yòu",
        targetTranslation = "kanan",
        correctAnswer = "kanan",
        audioToSpeak = "右",
        pictureOptions = listOf(
            PictureOption("u20_s1_p2_opt7_1", "kanan", "", R.drawable.ic_pos_right, true),
            PictureOption("u20_s1_p2_opt7_2", "kiri", "", R.drawable.ic_pos_left, false),
            PictureOption("u20_s1_p2_opt7_3", "depan", "", R.drawable.ic_pos_front, false),
            PictureOption("u20_s1_p2_opt7_4", "belakang", "", R.drawable.ic_pos_back, false)
        )
    ),

    // 8. Soal 8: Ketik Pinyin (kanan -> yòu)
    Exercise(
        id = "u20_s1_p2_q8",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "kanan",
        sentenceWithBlank = "右 (________)",
        targetHanzi = "右",
        targetPinyin = "yòu",
        correctAnswer = "you",
        keyboardKeys = listOf("y", "o", "u", "a", "e", "i", "b", "d", "g", "h", "j", "l"),
        audioToSpeak = "右"
    ),

    // 9. Soal 9: Susun Kalimat (Tangan kanan saya memegang sebuah pena.)
    Exercise(
        id = "u20_s1_p2_q9",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Tangan kanan saya memegang pena.",
        targetHanzi = "我 的 右 手 拿 着 笔。",
        targetPinyin = "Wǒ de yòu shǒu ná zhe bǐ.",
        wordChips = listOf("我:wǒ", "的:de", "右:yòu", "手:shǒu", "拿:ná", "着:zhe", "笔。:bǐ.", "左:zuǒ"),
        correctAnswer = "我,的,右,手,拿,着,笔。",
        audioToSpeak = "我的右手拿着笔。"
    ),

    // 10. Soal 10: Ketuk Pasangan yang Sesuai (Rangkuman Kiri & Kanan)
    Exercise(
        id = "u20_s1_p2_m10",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u20_s1_p2_m10_1", "左手", "zuǒshǒu", "tangan kiri"),
            MatchPairItem("u20_s1_p2_m10_2", "右手", "yòushǒu", "tangan kanan"),
            MatchPairItem("u20_s1_p2_m10_3", "左右", "zuǒyòu", "kiri kanan"),
            MatchPairItem("u20_s1_p2_m10_4", "往右", "wǎng yòu", "ke kanan")
        )
    )
)
