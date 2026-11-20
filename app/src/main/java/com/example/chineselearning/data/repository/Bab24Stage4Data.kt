package com.example.chineselearning.data.repository

import com.example.chineselearning.R
import com.example.chineselearning.data.model.Exercise
import com.example.chineselearning.data.model.ExerciseType
import com.example.chineselearning.data.model.MatchPairItem
import com.example.chineselearning.data.model.PictureOption

val bab24Stage4Part1Exercises = listOf(
    // 1. Soal 1: Pilihan Gambar (考试 -> ujian / tes)
    Exercise(
        id = "u24_s4_p1_q1",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "考试",
        targetPinyin = "kǎoshì",
        targetTranslation = "ujian / tes",
        correctAnswer = "ujian / tes",
        audioToSpeak = "考试",
        pictureOptions = listOf(
            PictureOption("u24_s4_p1_opt1", "ujian", "", R.drawable.ic_edu_exam_test, true),
            PictureOption("u24_s4_p1_opt2", "buku catatan", "", R.drawable.ic_edu_notebook, false),
            PictureOption("u24_s4_p1_opt3", "pena", "", R.drawable.ic_edu_pen_pencil, false),
            PictureOption("u24_s4_p1_opt4", "ruang kelas", "", R.drawable.ic_edu_classroom, false)
        )
    ),

    // 2. Soal 2: Susun Kalimat (Besok kita harus mengikuti ujian pendengaran.)
    Exercise(
        id = "u24_s4_p1_q2",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Besok kita tes menyimak.",
        targetHanzi = "明天 我们 考 听力。",
        targetPinyin = "Míngtiān wǒmen kǎo tīnglì.",
        wordChips = listOf("明天:míngtiān", "我们:wǒmen", "考:kǎo", "听力。:tīnglì.", "学:xué"),
        correctAnswer = "明天,我们,考,听力。",
        audioToSpeak = "明天我们考听力。"
    ),

    // 3. Soal 3: Ketuk Pasangan yang Sesuai (Ujian & Tes)
    Exercise(
        id = "u24_s4_p1_q3",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u24_s4_p1_m1", "考", "kǎo", "menguji / tes"),
            MatchPairItem("u24_s4_p1_m2", "考试", "kǎoshì", "ujian / ulangan"),
            MatchPairItem("u24_s4_p1_m3", "期末考试", "qīmò kǎoshì", "ujian semester"),
            MatchPairItem("u24_s4_p1_m4", "准备考试", "zhǔnbèi kǎoshì", "siap ujian")
        )
    ),

    // 4. Soal 4: Ketik Pinyin (menguji -> kǎo)
    Exercise(
        id = "u24_s4_p1_q4",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "menguji / dites",
        sentenceWithBlank = "考 (________)",
        targetHanzi = "考",
        targetPinyin = "kǎo",
        correctAnswer = "kao",
        keyboardKeys = listOf("k", "a", "o", "e", "i", "u", "b", "d", "g", "h", "j", "l"),
        audioToSpeak = "考"
    ),

    // 5. Soal 5: Mendengar Kalimat (Rule 10: illustrationRes = 0)
    Exercise(
        id = "u24_s4_p1_q5",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Apa yang Anda dengar?",
        targetTranslation = "Ujian semester akhir semua orang mendapat nilai bagus.",
        targetHanzi = "期末 考试 大家 考 得 很 好。",
        targetPinyin = "Qīmò kǎoshì dàjiā kǎo de hěn hǎo.",
        wordChips = listOf("期末:qīmò", "考试:kǎoshì", "大家:dàjiā", "考:kǎo", "得:de", "很:hěn", "好。:hǎo.", "差:chà"),
        correctAnswer = "期末,考试,大家,考,得,很,好。",
        illustrationRes = 0,
        audioToSpeak = "期末考试大家考得很好。"
    ),

    // 6. Soal 6: Pilihan Kalimat
    Exercise(
        id = "u24_s4_p1_q6",
        type = ExerciseType.SENTENCE_CHOICE,
        title = "Pilih terjemahan yang benar",
        targetHanzi = "今天 的 汉语 考试 不 太 难。",
        targetPinyin = "Jīntiān de Hànyǔ kǎoshì bú tài nán.",
        targetTranslation = "Ujian bahasa Mandarin hari ini tidak terlalu sulit.",
        correctAnswer = "Jīntiān de Hànyǔ kǎoshì bú tài nán.\n今天 的 汉语 考试 不 太 难。",
        options = listOf(
            "Jīntiān de Hànyǔ kǎoshì bú tài nán.\n今天 的 汉语 考试 不 太 难。",
            "Jīntiān de Hànyǔ kǎoshì fēicháng nán.\n今天 的 汉语 考试 非常 难。",
            "Míngtiān de Hànyǔ kǎoshì bú tài nán.\n明天 的 汉语 考试 不 太 难。"
        ),
        audioToSpeak = "今天的汉语考试不太难。"
    ),

    // 7. Soal 7: Pilihan Gambar (考试 -> ujian akademik)
    Exercise(
        id = "u24_s4_p1_q7",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "考试",
        targetPinyin = "kǎoshì",
        targetTranslation = "ujian",
        correctAnswer = "ujian",
        audioToSpeak = "考试",
        pictureOptions = listOf(
            PictureOption("u24_s4_p1_opt7_1", "ujian", "", R.drawable.ic_edu_exam_test, true),
            PictureOption("u24_s4_p1_opt7_2", "buku catatan", "", R.drawable.ic_edu_notebook, false),
            PictureOption("u24_s4_p1_opt7_3", "ruang kelas", "", R.drawable.ic_edu_classroom, false),
            PictureOption("u24_s4_p1_opt7_4", "pena", "", R.drawable.ic_edu_pen_pencil, false)
        )
    ),

    // 8. Soal 8: Ketik Pinyin (ujian -> kǎoshì)
    Exercise(
        id = "u24_s4_p1_q8",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "ujian / ulangan",
        sentenceWithBlank = "考试 (________)",
        targetHanzi = "考试",
        targetPinyin = "kǎoshì",
        correctAnswer = "kaoshi",
        keyboardKeys = listOf("k", "a", "o", "s", "h", "i", "e", "u", "b", "d", "g", "j"),
        audioToSpeak = "考试"
    ),

    // 9. Soal 9: Susun Kalimat (Saya harus mempersiapkan diri untuk ujian besok.)
    Exercise(
        id = "u24_s4_p1_q9",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Saya harus bersiap ujian.",
        targetHanzi = "我 要 准备 考试。",
        targetPinyin = "Wǒ yào zhǔnbèi kǎoshì.",
        wordChips = listOf("我:wǒ", "要:yào", "准备:zhǔnbèi", "考试。:kǎoshì.", "玩:wán"),
        correctAnswer = "我,要,准备,考试。",
        audioToSpeak = "我要准备考试。"
    ),

    // 10. Soal 10: Ketuk Pasangan yang Sesuai (Rangkuman Ujian)
    Exercise(
        id = "u24_s4_p1_m10",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u24_s4_p1_m10_1", "考", "kǎo", "menguji"),
            MatchPairItem("u24_s4_p1_m10_2", "考试", "kǎoshì", "ulangan"),
            MatchPairItem("u24_s4_p1_m10_3", "考得好", "kǎo de hǎo", "nilai bagus"),
            MatchPairItem("u24_s4_p1_m10_4", "不太难", "bú tài nán", "tidak susah")
        )
    )
)

val bab24Stage4Part2Exercises = listOf(
    // 1. Soal 1: Pilihan Gambar (题 -> butir soal)
    Exercise(
        id = "u24_s4_p2_q1",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "题",
        targetPinyin = "tí",
        targetTranslation = "butir soal / topik",
        correctAnswer = "butir soal / topik",
        audioToSpeak = "题",
        pictureOptions = listOf(
            PictureOption("u24_s4_p2_opt1", "soal ujian", "", R.drawable.ic_edu_exam_test, true),
            PictureOption("u24_s4_p2_opt2", "buku catatan", "", R.drawable.ic_edu_notebook, false),
            PictureOption("u24_s4_p2_opt3", "pena", "", R.drawable.ic_edu_pen_pencil, false),
            PictureOption("u24_s4_p2_opt4", "sekolah", "", R.drawable.ic_edu_high_school, false)
        )
    ),

    // 2. Soal 2: Susun Kalimat (Soal terakhir pada ujian matematika sangat sulit.)
    Exercise(
        id = "u24_s4_p2_q2",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Soal terakhir sangat sulit.",
        targetHanzi = "最后 一 道 题 很 难。",
        targetPinyin = "Zuìhòu yí dào tí hěn nán.",
        wordChips = listOf("最后:zuìhòu", "一:yí", "道:dào", "题:tí", "很:hěn", "难。:nán.", "容易:róngyì"),
        correctAnswer = "最后,一,道,题,很,难。",
        audioToSpeak = "最后一道题很难。"
    ),

    // 3. Soal 3: Ketuk Pasangan yang Sesuai (Soal & Keliru)
    Exercise(
        id = "u24_s4_p2_m3",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u24_s4_p2_m1", "题", "tí", "butir soal"),
            MatchPairItem("u24_s4_p2_m2", "错", "cuò", "salah / keliru"),
            MatchPairItem("u24_s4_p2_m3", "写错", "xiě cuò", "salah menulis"),
            MatchPairItem("u24_s4_p2_m4", "做题", "zuò tí", "kerjakan soal")
        )
    ),

    // 4. Soal 4: Ketik Pinyin (soal -> tí)
    Exercise(
        id = "u24_s4_p2_q4",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "butir soal / topik ujian",
        sentenceWithBlank = "题 (________)",
        targetHanzi = "题",
        targetPinyin = "tí",
        correctAnswer = "ti",
        keyboardKeys = listOf("t", "i", "a", "e", "o", "u", "b", "d", "g", "h", "j", "l"),
        audioToSpeak = "题"
    ),

    // 5. Soal 5: Mendengar Kalimat (Rule 10: illustrationRes = 0)
    Exercise(
        id = "u24_s4_p2_q5",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Apa yang Anda dengar?",
        targetTranslation = "Soal ini kamu salah menulis jawabannya.",
        targetHanzi = "这 道 题 你 写 错 了。",
        targetPinyin = "Zhè dào tí nǐ xiě cuò le.",
        wordChips = listOf("这:zhè", "道:dào", "题:tí", "你:nǐ", "写:xiě", "错:cuò", "了。:le.", "对:duì"),
        correctAnswer = "这,道,题,你,写,错,了。",
        illustrationRes = 0,
        audioToSpeak = "这道题你写错了。"
    ),

    // 6. Soal 6: Pilihan Kalimat
    Exercise(
        id = "u24_s4_p2_q6",
        type = ExerciseType.SENTENCE_CHOICE,
        title = "Pilih terjemahan yang benar",
        targetHanzi = "我 没 做 错， 是 对 的。",
        targetPinyin = "Wǒ méi zuò cuò, shì duì de.",
        targetTranslation = "Saya tidak salah mengerjakan, itu benar.",
        correctAnswer = "Wǒ méi zuò cuò, shì duì de.\n我 没 做 错， 是 对 的。",
        options = listOf(
            "Wǒ méi zuò cuò, shì duì de.\n我 没 做 错， 是 对 的。",
            "Wǒ zuò cuò le, bú duì.\n我 做 错 了， 不 对。",
            "Tā méi zuò cuò, shì duì de.\n他 没 做 错， 是 对 的。"
        ),
        audioToSpeak = "我没做错，是对的。"
    ),

    // 7. Soal 7: Pilihan Gambar (错 -> salah / keliru)
    Exercise(
        id = "u24_s4_p2_q7",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "错",
        targetPinyin = "cuò",
        targetTranslation = "salah / keliru",
        correctAnswer = "salah / keliru",
        audioToSpeak = "错",
        pictureOptions = listOf(
            PictureOption("u24_s4_p2_opt7_1", "keliru", "", R.drawable.ic_edu_exam_test, true),
            PictureOption("u24_s4_p2_opt7_2", "buku catatan", "", R.drawable.ic_edu_notebook, false),
            PictureOption("u24_s4_p2_opt7_3", "pena", "", R.drawable.ic_edu_pen_pencil, false),
            PictureOption("u24_s4_p2_opt7_4", "sekolah", "", R.drawable.ic_edu_high_school, false)
        )
    ),

    // 8. Soal 8: Ketik Pinyin (salah/keliru -> cuò)
    Exercise(
        id = "u24_s4_p2_q8",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "salah / keliru",
        sentenceWithBlank = "错 (________)",
        targetHanzi = "错",
        targetPinyin = "cuò",
        correctAnswer = "cuo",
        keyboardKeys = listOf("c", "u", "o", "a", "e", "i", "b", "d", "g", "h", "j", "l"),
        audioToSpeak = "错"
    ),

    // 9. Soal 9: Susun Kalimat (Ada berapa soal dalam ujian ini?)
    Exercise(
        id = "u24_s4_p2_q9",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Ada berapa butir soal?",
        targetHanzi = "一共 有 多少 道 题？",
        targetPinyin = "Yígòng yǒu duōshao dào tí?",
        wordChips = listOf("一共:yígòng", "有:yǒu", "多少:duōshao", "道:dào", "题？:tí?", "字:zì"),
        correctAnswer = "一共,有,多少,道,题？",
        audioToSpeak = "一共有多少道题？"
    ),

    // 10. Soal 10: Ketuk Pasangan yang Sesuai (Rangkuman Butir Soal Ujian)
    Exercise(
        id = "u24_s4_p2_m10",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u24_s4_p2_m10_1", "题", "tí", "soal"),
            MatchPairItem("u24_s4_p2_m10_2", "错", "cuò", "salah"),
            MatchPairItem("u24_s4_p2_m10_3", "不错", "búcuò", "bagus / mantap"),
            MatchPairItem("u24_s4_p2_m10_4", "一道题", "yí dào tí", "sebutir soal")
        )
    )
)
