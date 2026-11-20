package com.example.chineselearning.data.repository

import com.example.chineselearning.R
import com.example.chineselearning.data.model.Exercise
import com.example.chineselearning.data.model.ExerciseType
import com.example.chineselearning.data.model.MatchPairItem
import com.example.chineselearning.data.model.PictureOption

val bab18Stage4Part1Exercises = listOf(
    // 1. Soal 1: Pilihan Gambar (眼睛 -> mata)
    Exercise(
        id = "u18_s4_p1_q1",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "眼睛",
        targetPinyin = "yǎnjing",
        targetTranslation = "mata",
        correctAnswer = "mata",
        audioToSpeak = "眼睛",
        pictureOptions = listOf(
            PictureOption("u18_s4_p1_opt1", "mata", "", R.drawable.ic_person_saya, true),
            PictureOption("u18_s4_p1_opt2", "tangan", "", R.drawable.ic_hand_wave, false),
            PictureOption("u18_s4_p1_opt3", "jam tangan", "", R.drawable.ic_clock_analog, false),
            PictureOption("u18_s4_p1_opt4", "tas", "", R.drawable.ic_shop_goods, false)
        )
    ),

    // 2. Soal 2: Susun Kalimat (Mata adik perempuan besar dan indah.)
    Exercise(
        id = "u18_s4_p1_q2",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Mata adik perempuan sangat besar.",
        targetHanzi = "妹妹 的 眼睛 很 大。",
        targetPinyin = "Mèimei de yǎnjing hěn dà.",
        wordChips = listOf("妹妹:mèimei", "的:de", "眼睛:yǎnjing", "很:hěn", "大。:dà.", "小:xiǎo"),
        correctAnswer = "妹妹,的,眼睛,很,大。",
        audioToSpeak = "妹妹的眼睛很大。"
    ),

    // 3. Soal 3: Ketuk Pasangan yang Sesuai (Mata & Wajah)
    Exercise(
        id = "u18_s4_p1_q3",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u18_s4_p1_m1", "眼睛", "yǎnjing", "mata"),
            MatchPairItem("u18_s4_p1_m2", "大眼睛", "dà yǎnjing", "mata besar"),
            MatchPairItem("u18_s4_p1_m3", "看", "kàn", "melihat"),
            MatchPairItem("u18_s4_p1_m4", "很美", "hěn měi", "sangat indah")
        )
    ),

    // 4. Soal 4: Ketik Pinyin (mata -> yǎnjing)
    Exercise(
        id = "u18_s4_p1_q4",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "mata",
        sentenceWithBlank = "眼睛 (________)",
        targetHanzi = "眼睛",
        targetPinyin = "yǎnjing",
        correctAnswer = "yanjing",
        keyboardKeys = listOf("y", "a", "n", "j", "i", "g", "e", "o", "u", "b", "d", "h"),
        audioToSpeak = "眼睛"
    ),

    // 5. Soal 5: Mendengar Kalimat (Rule 10: illustrationRes = 0)
    Exercise(
        id = "u18_s4_p1_q5",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Apa yang Anda dengar?",
        targetTranslation = "Mata kucing kecil berwarna biru.",
        targetHanzi = "小猫 的 眼睛 是 蓝色 的。",
        targetPinyin = "Xiǎomāo de yǎnjing shì lánsè de.",
        wordChips = listOf("小猫:xiǎomāo", "的:de", "眼睛:yǎnjing", "是:shì", "蓝色:lánsè", "的。:de.", "小狗:xiǎogǒu"),
        correctAnswer = "小猫,的,眼睛,是,蓝色,的。",
        illustrationRes = 0,
        audioToSpeak = "小猫的眼睛是蓝色的。"
    ),

    // 6. Soal 6: Pilihan Kalimat
    Exercise(
        id = "u18_s4_p1_q6",
        type = ExerciseType.SENTENCE_CHOICE,
        title = "Pilih terjemahan yang benar",
        targetHanzi = "他 的 眼睛 很 漂亮。",
        targetPinyin = "Tā de yǎnjing hěn piàoliang.",
        targetTranslation = "Matanya sangat indah.",
        correctAnswer = "Tā de yǎnjing hěn piàoliang.\n他 的 眼睛 很 漂亮。",
        options = listOf(
            "Tā de yǎnjing hěn piàoliang.\n他 的 眼睛 很 漂亮。",
            "Wǒ de yǎnjing hěn piàoliang.\n我 的 眼睛 很 漂亮。",
            "Tā de shǒu hěn piàoliang.\n他 的 手 很 漂亮。"
        ),
        audioToSpeak = "他的眼睛很漂亮。"
    ),

    // 7. Soal 7: Pilihan Gambar (手 -> tangan)
    Exercise(
        id = "u18_s4_p1_q7",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "手",
        targetPinyin = "shǒu",
        targetTranslation = "tangan",
        correctAnswer = "tangan",
        audioToSpeak = "手",
        pictureOptions = listOf(
            PictureOption("u18_s4_p1_opt7_1", "tangan", "", R.drawable.ic_hand_wave, true),
            PictureOption("u18_s4_p1_opt7_2", "mata", "", R.drawable.ic_person_saya, false),
            PictureOption("u18_s4_p1_opt7_3", "jam tangan", "", R.drawable.ic_clock_analog, false),
            PictureOption("u18_s4_p1_opt7_4", "tas", "", R.drawable.ic_shop_goods, false)
        )
    ),

    // 8. Soal 8: Ketik Pinyin (tangan -> shǒu)
    Exercise(
        id = "u18_s4_p1_q8",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "tangan",
        sentenceWithBlank = "手 (________)",
        targetHanzi = "手",
        targetPinyin = "shǒu",
        correctAnswer = "shou",
        keyboardKeys = listOf("s", "h", "o", "u", "a", "e", "i", "b", "d", "g", "j", "l"),
        audioToSpeak = "手"
    ),

    // 9. Soal 9: Susun Kalimat (Sebelum makan harus mencuci tangan.)
    Exercise(
        id = "u18_s4_p1_q9",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Sebelum makan harus cuci tangan.",
        targetHanzi = "吃饭 前 要 洗 手。",
        targetPinyin = "Chīfàn qián yào xǐ shǒu.",
        wordChips = listOf("吃饭:chīfàn", "前:qián", "要:yào", "洗:xǐ", "手。:shǒu.", "后:hòu"),
        correctAnswer = "吃饭,前,要,洗,手。",
        audioToSpeak = "吃饭前要洗手。"
    ),

    // 10. Soal 10: Ketuk Pasangan yang Sesuai (Rangkuman Mata & Tangan)
    Exercise(
        id = "u18_s4_p1_m10",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u18_s4_p1_m10_1", "眼睛", "yǎnjing", "mata"),
            MatchPairItem("u18_s4_p1_m10_2", "手", "shǒu", "tangan"),
            MatchPairItem("u18_s4_p1_m10_3", "洗手", "xǐ shǒu", "cuci tangan"),
            MatchPairItem("u18_s4_p1_m10_4", "吃饭前", "chīfàn qián", "sebelum makan")
        )
    )
)

val bab18Stage4Part2Exercises = listOf(
    // 1. Soal 1: Pilihan Gambar (手 -> tangan)
    Exercise(
        id = "u18_s4_p2_q1",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "手",
        targetPinyin = "shǒu",
        targetTranslation = "tangan",
        correctAnswer = "tangan",
        audioToSpeak = "手",
        pictureOptions = listOf(
            PictureOption("u18_s4_p2_opt1", "tangan", "", R.drawable.ic_hand_wave, true),
            PictureOption("u18_s4_p2_opt2", "mata", "", R.drawable.ic_person_saya, false),
            PictureOption("u18_s4_p2_opt3", "jam tangan", "", R.drawable.ic_clock_analog, false),
            PictureOption("u18_s4_p2_opt4", "tas", "", R.drawable.ic_shop_goods, false)
        )
    ),

    // 2. Soal 2: Susun Kalimat (Di tangannya memegang sebuah buku.)
    Exercise(
        id = "u18_s4_p2_q2",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Di tangannya memegang buku.",
        targetHanzi = "他 手 里 拿 着 一 本 书。",
        targetPinyin = "Tā shǒu lǐ ná zhe yì běn shū.",
        wordChips = listOf("他:tā", "手:shǒu", "里:lǐ", "拿:ná", "着:zhe", "一:yì", "本:běn", "书。:shū.", "包:bāo"),
        correctAnswer = "他,手,里,拿,着,一,本,书。",
        audioToSpeak = "他手里拿着一本书。"
    ),

    // 3. Soal 3: Ketuk Pasangan yang Sesuai (Aksi Tangan)
    Exercise(
        id = "u18_s4_p2_m3",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u18_s4_p2_m1", "手", "shǒu", "tangan"),
            MatchPairItem("u18_s4_p2_m2", "手里", "shǒu lǐ", "di tangan"),
            MatchPairItem("u18_s4_p2_m3", "拿着", "ná zhe", "memegang"),
            MatchPairItem("u18_s4_p2_m4", "一本书", "yì běn shū", "sebuah buku")
        )
    ),

    // 4. Soal 4: Ketik Pinyin (mencuci tangan -> xǐshǒu)
    Exercise(
        id = "u18_s4_p2_q4",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "cuci tangan",
        sentenceWithBlank = "洗手 (________)",
        targetHanzi = "洗手",
        targetPinyin = "xǐshǒu",
        correctAnswer = "xishou",
        keyboardKeys = listOf("x", "i", "s", "h", "o", "u", "a", "e", "b", "d", "g", "j"),
        audioToSpeak = "洗手"
    ),

    // 5. Soal 5: Mendengar Kalimat (Rule 10: illustrationRes = 0)
    Exercise(
        id = "u18_s4_p2_q5",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Apa yang Anda dengar?",
        targetTranslation = "Tangan saya sangat bersih.",
        targetHanzi = "我 的 手 很 干净。",
        targetPinyin = "Wǒ de shǒu hěn gānjìng.",
        wordChips = listOf("我:wǒ", "的:de", "手:shǒu", "很:hěn", "干净。:gānjìng.", "脏:zāng"),
        correctAnswer = "我,的,手,很,干净。",
        illustrationRes = 0,
        audioToSpeak = "我的手很干净。"
    ),

    // 6. Soal 6: Pilihan Kalimat
    Exercise(
        id = "u18_s4_p2_q6",
        type = ExerciseType.SENTENCE_CHOICE,
        title = "Pilih terjemahan yang benar",
        targetHanzi = "请 大家 举 起 手 来。",
        targetPinyin = "Qǐng dàjiā jǔ qǐ shǒu lái.",
        targetTranslation = "Silakan semua angkat tangan.",
        correctAnswer = "Qǐng dàjiā jǔ qǐ shǒu lái.\n请 大家 举 起 手 来。",
        options = listOf(
            "Qǐng dàjiā jǔ qǐ shǒu lái.\n请 大家 举 起 手 来。",
            "Qǐng dàjiā zhàn qǐlai.\n请 大家 站 起来。",
            "Qǐng dàjiā zuò xià.\n请 大家 坐 下。"
        ),
        audioToSpeak = "请大家举起手来。"
    ),

    // 7. Soal 7: Pilihan Gambar (眼睛 -> mata)
    Exercise(
        id = "u18_s4_p2_q7",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "眼睛",
        targetPinyin = "yǎnjing",
        targetTranslation = "mata",
        correctAnswer = "mata",
        audioToSpeak = "眼睛",
        pictureOptions = listOf(
            PictureOption("u18_s4_p2_opt7_1", "mata", "", R.drawable.ic_person_saya, true),
            PictureOption("u18_s4_p2_opt7_2", "tangan", "", R.drawable.ic_hand_wave, false),
            PictureOption("u18_s4_p2_opt7_3", "jam tangan", "", R.drawable.ic_clock_analog, false),
            PictureOption("u18_s4_p2_opt7_4", "tas", "", R.drawable.ic_shop_goods, false)
        )
    ),

    // 8. Soal 8: Ketik Pinyin (mata -> yǎnjing)
    Exercise(
        id = "u18_s4_p2_q8",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "mata",
        sentenceWithBlank = "眼睛 (________)",
        targetHanzi = "眼睛",
        targetPinyin = "yǎnjing",
        correctAnswer = "yanjing",
        keyboardKeys = listOf("y", "a", "n", "j", "i", "g", "e", "o", "u", "b", "d", "h"),
        audioToSpeak = "眼睛"
    ),

    // 9. Soal 9: Susun Kalimat (Ibu memegang tangan saya.)
    Exercise(
        id = "u18_s4_p2_q9",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Ibu menggandeng tangan saya.",
        targetHanzi = "妈妈 牵 着 我 的 手。",
        targetPinyin = "Māma qiān zhe wǒ de shǒu.",
        wordChips = listOf("妈妈:māma", "牵:qiān", "着:zhe", "我:wǒ", "的:de", "手。:shǒu.", "爸爸:bàba"),
        correctAnswer = "妈妈,牵,着,我,的,手。",
        audioToSpeak = "妈妈牵着我的手。"
    ),

    // 10. Soal 10: Ketuk Pasangan yang Sesuai (Rangkuman Kehangatan Tangan)
    Exercise(
        id = "u18_s4_p2_m10",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u18_s4_p2_m10_1", "手", "shǒu", "tangan"),
            MatchPairItem("u18_s4_p2_m10_2", "干净", "gānjìng", "bersih"),
            MatchPairItem("u18_s4_p2_m10_3", "举手", "jǔ shǒu", "angkat tangan"),
            MatchPairItem("u18_s4_p2_m10_4", "牵手", "qiān shǒu", "gandeng tangan")
        )
    )
)
