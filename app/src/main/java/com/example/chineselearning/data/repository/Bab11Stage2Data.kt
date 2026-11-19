package com.example.chineselearning.data.repository

import com.example.chineselearning.R
import com.example.chineselearning.data.model.Exercise
import com.example.chineselearning.data.model.ExerciseType
import com.example.chineselearning.data.model.MatchPairItem
import com.example.chineselearning.data.model.PictureOption

val bab11Stage2Part1Exercises = listOf(
    // 1. Soal 1: Pilihan Gambar (学习 -> belajar)
    Exercise(
        id = "u11_s2_p1_q1",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "学习",
        targetPinyin = "xuéxí",
        targetTranslation = "belajar",
        correctAnswer = "belajar",
        audioToSpeak = "学习",
        pictureOptions = listOf(
            PictureOption("u11_s2_p1_opt1", "belajar", "📖", R.drawable.ic_book, true),
            PictureOption("u11_s2_p1_opt2", "tidur", "🛌", R.drawable.ic_crown, false),
            PictureOption("u11_s2_p1_opt3", "makan", "🍜", R.drawable.ic_action_eat, false),
            PictureOption("u11_s2_p1_opt4", "lari", "🏃", R.drawable.ic_target, false)
        )
    ),

    // 2. Soal 2: Susun Kalimat (Saya sedang belajar bahasa Mandarin.)
    Exercise(
        id = "u11_s2_p1_q2",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Saya sedang belajar bahasa Mandarin.",
        targetHanzi = "我 在 学习 汉语。",
        targetPinyin = "Wǒ zài xuéxí Hànyǔ.",
        wordChips = listOf("我:wǒ", "在:zài", "学习:xuéxí", "汉语:Hànyǔ", "去:qù", "说:shuō"),
        correctAnswer = "我,在,学习,汉语",
        audioToSpeak = "我在学习汉语。"
    ),

    // 3. Soal 3: Ketuk Pasangan yang Sesuai (Belajar & Pelajaran)
    Exercise(
        id = "u11_s2_p1_q3",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u11_s2_p1_m1", "学习", "xuéxí", "belajar"),
            MatchPairItem("u11_s2_p1_m2", "学", "xué", "belajar (verba)"),
            MatchPairItem("u11_s2_p1_m3", "课", "kè", "kelas / pelajaran"),
            MatchPairItem("u11_s2_p1_m4", "汉语课", "Hànyǔ kè", "kelas Mandarin")
        )
    ),

    // 4. Soal 4: Ketik Pinyin (belajar -> xuéxí)
    Exercise(
        id = "u11_s2_p1_q4",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "belajar",
        sentenceWithBlank = "学习 (________)",
        targetHanzi = "学习",
        targetPinyin = "xuéxí",
        correctAnswer = "xuexi",
        keyboardKeys = listOf("x", "u", "e", "i", "a", "o", "b", "d", "g", "h", "j"),
        audioToSpeak = "学习"
    ),

    // 5. Soal 5: Mendengar Kalimat (Rule 10: illustrationRes = 0)
    Exercise(
        id = "u11_s2_p1_q5",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Apa yang Anda dengar?",
        targetTranslation = "Dia sangat suka belajar.",
        targetHanzi = "他 很 喜欢 学习。",
        targetPinyin = "Tā hěn xǐhuan xuéxí.",
        wordChips = listOf("他:tā", "很:hěn", "喜欢:xǐhuan", "学习:xuéxí", "我:wǒ"),
        correctAnswer = "他,很,喜欢,学习",
        illustrationRes = 0,
        audioToSpeak = "他很喜欢学习。"
    ),

    // 6. Soal 6: Pilihan Kalimat
    Exercise(
        id = "u11_s2_p1_q6",
        type = ExerciseType.SENTENCE_CHOICE,
        title = "Pilih terjemahan yang benar",
        targetHanzi = "今天 没有 课。",
        targetPinyin = "Jīntiān méiyǒu kè.",
        targetTranslation = "Hari ini tidak ada kelas.",
        correctAnswer = "Jīntiān méiyǒu kè.\n今天 没有 课。",
        options = listOf(
            "Jīntiān méiyǒu kè.\n今天 没有 课。",
            "Míngtiān méiyǒu kè.\n明天 没有 课。",
            "Jīntiān yǒu kè.\n今天 有 课。"
        ),
        audioToSpeak = "今天没有课。"
    ),

    // 7. Soal 7: Pilihan Gambar (课 -> kelas / pelajaran)
    Exercise(
        id = "u11_s2_p1_q7",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "课",
        targetPinyin = "kè",
        targetTranslation = "kelas / pelajaran",
        correctAnswer = "kelas / pelajaran",
        audioToSpeak = "课",
        pictureOptions = listOf(
            PictureOption("u11_s2_p1_opt7_1", "kelas", "📝", R.drawable.ic_book, true),
            PictureOption("u11_s2_p1_opt7_2", "makan", "🍚", R.drawable.ic_action_eat, false),
            PictureOption("u11_s2_p1_opt7_3", "mobil", "🚗", R.drawable.ic_target, false),
            PictureOption("u11_s2_p1_opt7_4", "tidur", "🛌", R.drawable.ic_crown, false)
        )
    ),

    // 8. Soal 8: Ketik Pinyin (kelas/pelajaran -> kè)
    Exercise(
        id = "u11_s2_p1_q8",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "kelas / pelajaran",
        sentenceWithBlank = "课 (________)",
        targetHanzi = "课",
        targetPinyin = "kè",
        correctAnswer = "ke",
        keyboardKeys = listOf("k", "e", "a", "i", "o", "u", "b", "d", "g", "h", "j"),
        audioToSpeak = "课"
    ),

    // 9. Soal 9: Susun Kalimat (Saya belajar bahasa Mandarin.)
    Exercise(
        id = "u11_s2_p1_q9",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Saya belajar bahasa Mandarin.",
        targetHanzi = "我 学 汉语。",
        targetPinyin = "Wǒ xué Hànyǔ.",
        wordChips = listOf("我:wǒ", "学:xué", "汉语:Hànyǔ", "说:shuō", "他:tā"),
        correctAnswer = "我,学,汉语",
        audioToSpeak = "我学汉语。"
    ),

    // 10. Soal 10: Ketuk Pasangan yang Sesuai (Rangkuman Belajar)
    Exercise(
        id = "u11_s2_p1_m10_1",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u11_s2_p1_m10_1", "学习", "xuéxí", "belajar"),
            MatchPairItem("u11_s2_p1_m10_2", "学汉语", "xué Hànyǔ", "belajar Mandarin"),
            MatchPairItem("u11_s2_p1_m10_3", "有课", "yǒu kè", "ada kelas"),
            MatchPairItem("u11_s2_p1_m10_4", "没有课", "méiyǒu kè", "tidak ada kelas")
        )
    )
)

val bab11Stage2Part2Exercises = listOf(
    // 1. Soal 1: Pilihan Gambar (上课 -> mulai kelas)
    Exercise(
        id = "u11_s2_p2_q1",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "上课",
        targetPinyin = "shàngkè",
        targetTranslation = "masuk kelas",
        correctAnswer = "masuk kelas",
        audioToSpeak = "上课",
        pictureOptions = listOf(
            PictureOption("u11_s2_p2_opt1", "masuk kelas", "👨‍🏫", R.drawable.ic_cap, true),
            PictureOption("u11_s2_p2_opt2", "selesai kelas", "🚪", R.drawable.ic_book, false),
            PictureOption("u11_s2_p2_opt3", "makan", "🍜", R.drawable.ic_action_eat, false),
            PictureOption("u11_s2_p2_opt4", "tidur", "🛌", R.drawable.ic_crown, false)
        )
    ),

    // 2. Soal 2: Susun Kalimat (Kami jam delapan masuk kelas.)
    Exercise(
        id = "u11_s2_p2_q2",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Kami jam delapan masuk kelas.",
        targetHanzi = "我们 八 点 上课。",
        targetPinyin = "Wǒmen bā diǎn shàngkè.",
        wordChips = listOf("我们:wǒmen", "八:bā", "点:diǎn", "上课:shàngkè", "下课:xiàkè", "九:jiǔ"),
        correctAnswer = "我们,八,点,上课",
        audioToSpeak = "我们八点上课。"
    ),

    // 3. Soal 3: Ketuk Pasangan yang Sesuai (Siklus Kelas)
    Exercise(
        id = "u11_s2_p2_m3",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u11_s2_p2_m1", "上课", "shàngkè", "masuk kelas"),
            MatchPairItem("u11_s2_p2_m2", "下课", "xiàkè", "selesai kelas"),
            MatchPairItem("u11_s2_p2_m3", "上学", "shàngxué", "pergi ke sekolah"),
            MatchPairItem("u11_s2_p2_m4", "放学", "fàngxué", "pulang sekolah")
        )
    ),

    // 4. Soal 4: Ketik Pinyin (masuk kelas -> shàngkè)
    Exercise(
        id = "u11_s2_p2_q4",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "masuk kelas",
        sentenceWithBlank = "上课 (________)",
        targetHanzi = "上课",
        targetPinyin = "shàngkè",
        correctAnswer = "shangke",
        keyboardKeys = listOf("s", "h", "a", "n", "g", "k", "e", "i", "o", "u", "b"),
        audioToSpeak = "上课"
    ),

    // 5. Soal 5: Mendengar Kalimat (Rule 10: illustrationRes = 0)
    Exercise(
        id = "u11_s2_p2_q5",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Apa yang Anda dengar?",
        targetTranslation = "Jam dua belas selesai kelas.",
        targetHanzi = "十二 点 下课。",
        targetPinyin = "Shí'èr diǎn xiàkè.",
        wordChips = listOf("十二:shí'èr", "点:diǎn", "下课:xiàkè", "上课:shàngkè", "一:yī"),
        correctAnswer = "十二,点,下课",
        illustrationRes = 0,
        audioToSpeak = "十二点下课。"
    ),

    // 6. Soal 6: Pilihan Kalimat
    Exercise(
        id = "u11_s2_p2_q6",
        type = ExerciseType.SENTENCE_CHOICE,
        title = "Pilih terjemahan yang benar",
        targetHanzi = "老师 来 上课 了。",
        targetPinyin = "Lǎoshī lái shàngkè le.",
        targetTranslation = "Guru sudah datang memulai kelas.",
        correctAnswer = "Lǎoshī lái shàngkè le.\n老师 来 上课 了。",
        options = listOf(
            "Lǎoshī lái shàngkè le.\n老师 来 上课 了。",
            "Xuéshēng lái shàngkè le.\n学生 来 上课 了。",
            "Lǎoshī xiàkè le.\n老师 下课 了。"
        ),
        audioToSpeak = "老师来上课了。"
    ),

    // 7. Soal 7: Pilihan Gambar (下课 -> selesai kelas)
    Exercise(
        id = "u11_s2_p2_q7",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "下课",
        targetPinyin = "xiàkè",
        targetTranslation = "selesai kelas",
        correctAnswer = "selesai kelas",
        audioToSpeak = "下课",
        pictureOptions = listOf(
            PictureOption("u11_s2_p2_opt7_1", "selesai kelas", "🔔", R.drawable.ic_story_timer, true),
            PictureOption("u11_s2_p2_opt7_2", "masuk kelas", "📝", R.drawable.ic_cap, false),
            PictureOption("u11_s2_p2_opt7_3", "makan", "🍜", R.drawable.ic_action_eat, false),
            PictureOption("u11_s2_p2_opt7_4", "tidur", "🛌", R.drawable.ic_book, false)
        )
    ),

    // 8. Soal 8: Ketik Pinyin (selesai kelas -> xiàkè)
    Exercise(
        id = "u11_s2_p2_q8",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "selesai kelas",
        sentenceWithBlank = "下课 (________)",
        targetHanzi = "下课",
        targetPinyin = "xiàkè",
        correctAnswer = "xiake",
        keyboardKeys = listOf("x", "i", "a", "k", "e", "o", "u", "b", "d", "g", "h"),
        audioToSpeak = "下课"
    ),

    // 9. Soal 9: Susun Kalimat (Anak itu jam tujuh pergi ke sekolah.)
    Exercise(
        id = "u11_s2_p2_q9",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Anak jam 7 pergi ke sekolah.",
        targetHanzi = "孩子 七 点 上学。",
        targetPinyin = "Háizi qī diǎn shàngxué.",
        wordChips = listOf("孩子:háizi", "七:qī", "点:diǎn", "上学:shàngxué", "回家:huíjiā", "八:bā"),
        correctAnswer = "孩子,七,点,上学",
        audioToSpeak = "孩子七点上学。"
    ),

    // 10. Soal 10: Ketuk Pasangan yang Sesuai (Rangkuman Waktu Kelas)
    Exercise(
        id = "u11_s2_p2_m10_1",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u11_s2_p2_m10_1", "上课", "shàngkè", "masuk kelas"),
            MatchPairItem("u11_s2_p2_m10_2", "下课", "xiàkè", "selesai kelas"),
            MatchPairItem("u11_s2_p2_m10_3", "八点上课", "bā diǎn shàngkè", "jam 8 masuk kelas"),
            MatchPairItem("u11_s2_p2_m10_4", "上学", "shàngxué", "berangkat sekolah")
        )
    )
)
