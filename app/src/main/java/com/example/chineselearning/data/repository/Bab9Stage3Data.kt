package com.example.chineselearning.data.repository

import com.example.chineselearning.R
import com.example.chineselearning.data.model.Exercise
import com.example.chineselearning.data.model.ExerciseType
import com.example.chineselearning.data.model.MatchPairItem
import com.example.chineselearning.data.model.PictureOption

val bab9Stage3Part1Exercises = listOf(
    // 1. Soal 1: Pilihan Gambar (这儿 -> di sini)
    Exercise(
        id = "u9_s3_p1_q1",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "这儿",
        targetPinyin = "zhèr",
        targetTranslation = "di sini",
        correctAnswer = "di sini",
        audioToSpeak = "这儿",
        pictureOptions = listOf(
            PictureOption("u9_s3_p1_opt1", "di sini", "", R.drawable.ic_pos_here, true),
            PictureOption("u9_s3_p1_opt2", "di sana", "", R.drawable.ic_pos_there, false),
            PictureOption("u9_s3_p1_opt3", "di mana", "", R.drawable.ic_pos_where, false),
            PictureOption("u9_s3_p1_opt4", "rumah", "", R.drawable.ic_fam_home, false)
        )
    ),

    // 2. Soal 2: Susun Kalimat (Saya ada di sini.)
    Exercise(
        id = "u9_s3_p1_q2",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Saya ada di sini.",
        targetHanzi = "我 在 这儿。",
        targetPinyin = "Wǒ zài zhèr.",
        wordChips = listOf("我:wǒ", "在:zài", "这儿:zhèr", "那儿:nàr", "他:tā"),
        correctAnswer = "我,在,这儿",
        audioToSpeak = "我在这儿。"
    ),

    // 3. Soal 3: Ketuk Pasangan yang Sesuai (Di Sini)
    Exercise(
        id = "u9_s3_p1_q3",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u9_s3_p1_m1", "这儿", "zhèr", "di sini"),
            MatchPairItem("u9_s3_p1_m2", "这里", "zhèlǐ", "di sini"),
            MatchPairItem("u9_s3_p1_m3", "这边", "zhèbiān", "sebelah sini"),
            MatchPairItem("u9_s3_p1_m4", "在这儿", "zài zhèr", "ada di sini")
        )
    ),

    // 4. Soal 4: Ketik Pinyin (di sini -> zhèr)
    Exercise(
        id = "u9_s3_p1_q4",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "di sini",
        sentenceWithBlank = "这儿 (________)",
        targetHanzi = "这儿",
        targetPinyin = "zhèr",
        correctAnswer = "zher",
        keyboardKeys = listOf("z", "h", "e", "r", "a", "i", "o", "u", "b", "d", "g"),
        audioToSpeak = "这儿"
    ),

    // 5. Soal 5: Mendengar Kalimat (Rule 10: illustrationRes = 0)
    Exercise(
        id = "u9_s3_p1_q5",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Apa yang Anda dengar?",
        targetTranslation = "Silakan duduk di sini.",
        targetHanzi = "请 坐 在 这里。",
        targetPinyin = "Qǐng zuò zài zhèlǐ.",
        wordChips = listOf("请:qǐng", "坐:zuò", "在:zài", "这里:zhèlǐ", "那里:nàlǐ"),
        correctAnswer = "请,坐,在,这里",
        illustrationRes = 0,
        audioToSpeak = "请坐在这里。"
    ),

    // 6. Soal 6: Pilihan Kalimat
    Exercise(
        id = "u9_s3_p1_q6",
        type = ExerciseType.SENTENCE_CHOICE,
        title = "Pilih terjemahan yang benar",
        targetHanzi = "老师 在 这里 吗？",
        targetPinyin = "Lǎoshī zài zhèlǐ ma?",
        targetTranslation = "Apakah guru ada di sini?",
        correctAnswer = "Lǎoshī zài zhèlǐ ma?\n老师 在 这里 吗？",
        options = listOf(
            "Lǎoshī zài zhèlǐ ma?\n老师 在 这里 吗？",
            "Lǎoshī zài nàlǐ ma?\n老师 在 那里 吗？",
            "Xuéshēng zài zhèlǐ ma?\n学生 在 这里 吗？"
        ),
        audioToSpeak = "老师在这里吗？"
    ),

    // 7. Soal 7: Pilihan Gambar (这里 -> di sini)
    Exercise(
        id = "u9_s3_p1_q7",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "这里",
        targetPinyin = "zhèlǐ",
        targetTranslation = "di sini",
        correctAnswer = "di sini",
        audioToSpeak = "这里",
        pictureOptions = listOf(
            PictureOption("u9_s3_p1_opt7_1", "di sini", "", R.drawable.ic_pos_here, true),
            PictureOption("u9_s3_p1_opt7_2", "di sana", "", R.drawable.ic_pos_there, false),
            PictureOption("u9_s3_p1_opt7_3", "di dalam", "", R.drawable.ic_pos_in, false),
            PictureOption("u9_s3_p1_opt7_4", "di luar", "", R.drawable.ic_pos_out, false)
        )
    ),

    // 8. Soal 8: Ketik Pinyin (di sini -> zhèlǐ)
    Exercise(
        id = "u9_s3_p1_q8",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "di sini",
        sentenceWithBlank = "这里 (________)",
        targetHanzi = "这里",
        targetPinyin = "zhèlǐ",
        correctAnswer = "zheli",
        keyboardKeys = listOf("z", "h", "e", "l", "i", "a", "o", "u", "b", "d", "g"),
        audioToSpeak = "这里"
    ),

    // 9. Soal 9: Susun Kalimat (Buku saya ada di sini.)
    Exercise(
        id = "u9_s1_p1_q9",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Buku saya ada di sini.",
        targetHanzi = "我 的 书 在 这儿。",
        targetPinyin = "Wǒ de shū zài zhèr.",
        wordChips = listOf("我:wǒ", "的:de", "书:shū", "在:zài", "这儿:zhèr", "那儿:nàr"),
        correctAnswer = "我,的,书,在,这儿",
        audioToSpeak = "我的书在这儿。"
    ),

    // 10. Soal 10: Ketuk Pasangan yang Sesuai (Rangkuman Di Sini)
    Exercise(
        id = "u9_s3_p1_m10_1",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u9_s3_p1_m10_1", "这儿", "zhèr", "di sini"),
            MatchPairItem("u9_s3_p1_m10_2", "这里", "zhèlǐ", "di sini"),
            MatchPairItem("u9_s3_p1_m10_3", "在这一边", "zài zhè yì biān", "di sisi ini"),
            MatchPairItem("u9_s3_p1_m10_4", "不在这儿", "bú zài zhèr", "tidak di sini")
        )
    )
)

val bab9Stage3Part2Exercises = listOf(
    // 1. Soal 1: Pilihan Gambar (那儿 -> di sana)
    Exercise(
        id = "u9_s3_p2_q1",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "那儿",
        targetPinyin = "nàr",
        targetTranslation = "di sana",
        correctAnswer = "di sana",
        audioToSpeak = "那儿",
        pictureOptions = listOf(
            PictureOption("u9_s3_p2_opt1", "di sana", "", R.drawable.ic_pos_there, true),
            PictureOption("u9_s3_p2_opt2", "di sini", "", R.drawable.ic_pos_here, false),
            PictureOption("u9_s3_p2_opt3", "di mana", "", R.drawable.ic_pos_where, false),
            PictureOption("u9_s3_p2_opt4", "rumah", "", R.drawable.ic_fam_home, false)
        )
    ),

    // 2. Soal 2: Susun Kalimat (Kamu ada di mana?)
    Exercise(
        id = "u9_s3_p2_q2",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Kamu ada di mana?",
        targetHanzi = "你 在 哪儿？",
        targetPinyin = "Nǐ zài nǎr?",
        wordChips = listOf("你:nǐ", "在:zài", "哪儿:nǎr", "这儿:zhèr", "那儿:nàr", "他:tā"),
        correctAnswer = "你,在,哪儿",
        audioToSpeak = "你在哪儿？"
    ),

    // 3. Soal 3: Ketuk Pasangan yang Sesuai (Di Sana & Di Mana)
    Exercise(
        id = "u9_s3_p2_q3",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u9_s3_p2_m1", "那儿", "nàr", "di sana"),
            MatchPairItem("u9_s3_p2_m2", "那里", "nàlǐ", "di sana"),
            MatchPairItem("u9_s3_p2_m3", "哪儿", "nǎr", "di mana"),
            MatchPairItem("u9_s3_p2_m4", "哪里", "nǎlǐ", "di mana")
        )
    ),

    // 4. Soal 4: Ketik Pinyin (di sana -> nàr)
    Exercise(
        id = "u9_s3_p2_q4",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "di sana",
        sentenceWithBlank = "那儿 (________)",
        targetHanzi = "那儿",
        targetPinyin = "nàr",
        correctAnswer = "nar",
        keyboardKeys = listOf("n", "a", "r", "e", "i", "o", "u", "b", "d", "g", "h"),
        audioToSpeak = "那儿"
    ),

    // 5. Soal 5: Mendengar Kalimat (Rule 10: illustrationRes = 0)
    Exercise(
        id = "u9_s3_p2_q5",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Apa yang Anda dengar?",
        targetTranslation = "Dia ada di sana.",
        targetHanzi = "他 在 那儿。",
        targetPinyin = "Tā zài nàr.",
        wordChips = listOf("他:tā", "在:zài", "那儿:nàr", "这儿:zhèr", "哪儿:nǎr"),
        correctAnswer = "他,在,那儿",
        illustrationRes = 0,
        audioToSpeak = "他在那儿。"
    ),

    // 6. Soal 6: Pilihan Kalimat
    Exercise(
        id = "u9_s3_p2_q6",
        type = ExerciseType.SENTENCE_CHOICE,
        title = "Pilih terjemahan yang benar",
        targetHanzi = "小狗 在 哪儿？",
        targetPinyin = "Xiǎogǒu zài nǎr?",
        targetTranslation = "Anak anjing ada di mana?",
        correctAnswer = "Xiǎogǒu zài nǎr?\n小狗 在 哪儿？",
        options = listOf(
            "Xiǎogǒu zài nǎr?\n小狗 在 哪儿？",
            "Xiǎogǒu zài nàr.\n小狗 在 那儿。",
            "Xiǎomāo zài nǎr?\n小猫 在 哪儿？"
        ),
        audioToSpeak = "小狗在哪儿？"
    ),

    // 7. Soal 7: Pilihan Gambar (哪儿 -> di mana)
    Exercise(
        id = "u9_s3_p2_q7",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "哪儿",
        targetPinyin = "nǎr",
        targetTranslation = "di mana",
        correctAnswer = "di mana",
        audioToSpeak = "哪儿",
        pictureOptions = listOf(
            PictureOption("u9_s3_p2_opt7_1", "di mana", "", R.drawable.ic_pos_where, true),
            PictureOption("u9_s3_p2_opt7_2", "di sini", "", R.drawable.ic_pos_here, false),
            PictureOption("u9_s3_p2_opt7_3", "di sana", "", R.drawable.ic_pos_there, false),
            PictureOption("u9_s3_p2_opt7_4", "siapa", "", R.drawable.ic_person_single, false)
        )
    ),

    // 8. Soal 8: Ketik Pinyin (di mana -> nǎlǐ)
    Exercise(
        id = "u9_s3_p2_q8",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "di mana",
        sentenceWithBlank = "哪里 (________)",
        targetHanzi = "哪里",
        targetPinyin = "nǎlǐ",
        correctAnswer = "nali",
        keyboardKeys = listOf("n", "a", "l", "i", "e", "o", "u", "b", "d", "g", "h"),
        audioToSpeak = "哪里"
    ),

    // 9. Soal 9: Susun Kalimat (Sekolah ada di sana.)
    Exercise(
        id = "u9_s3_p2_q9",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Sekolah ada di sana.",
        targetHanzi = "学校 在 那里。",
        targetPinyin = "Xuéxiào zài nàlǐ.",
        wordChips = listOf("学校:xuéxiào", "在:zài", "那里:nàlǐ", "这里:zhèlǐ", "商店:shāngdiàn"),
        correctAnswer = "学校,在,那里",
        audioToSpeak = "学校在那里。"
    ),

    // 10. Soal 10: Ketuk Pasangan yang Sesuai (Rangkuman Triad Lokasi)
    Exercise(
        id = "u9_s3_p2_m10_1",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u9_s3_p2_m10_1", "这儿", "zhèr", "di sini"),
            MatchPairItem("u9_s3_p2_m10_2", "那儿", "nàr", "di sana"),
            MatchPairItem("u9_s3_p2_m10_3", "哪儿", "nǎr", "di mana"),
            MatchPairItem("u9_s3_p2_m10_4", "在哪儿", "zài nǎr", "ada di mana")
        )
    )
)
