package com.example.chineselearning.data.repository

import com.example.chineselearning.R
import com.example.chineselearning.data.model.Exercise
import com.example.chineselearning.data.model.ExerciseType
import com.example.chineselearning.data.model.MatchPairItem
import com.example.chineselearning.data.model.PictureOption

val bab24Stage3Part1Exercises = listOf(
    // 1. Soal 1: Pilihan Gambar (教 -> mengajar)
    Exercise(
        id = "u24_s3_p1_q1",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "教",
        targetPinyin = "jiāo",
        targetTranslation = "mengajar",
        correctAnswer = "mengajar",
        audioToSpeak = "教",
        pictureOptions = listOf(
            PictureOption("u24_s3_p1_opt1", "mengajar", "", R.drawable.ic_edu_classroom, true),
            PictureOption("u24_s3_p1_opt2", "ujian", "", R.drawable.ic_edu_exam_test, false),
            PictureOption("u24_s3_p1_opt3", "buku catatan", "", R.drawable.ic_edu_notebook, false),
            PictureOption("u24_s3_p1_opt4", "pena", "", R.drawable.ic_edu_pen_pencil, false)
        )
    ),

    // 2. Soal 2: Susun Kalimat (Guru Wang mengajar kami bahasa Mandarin.)
    Exercise(
        id = "u24_s3_p1_q2",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Guru Wang mengajar kami Mandarin.",
        targetHanzi = "王 老师 教 我们 汉语。",
        targetPinyin = "Wáng lǎoshī jiāo wǒmen Hànyǔ.",
        wordChips = listOf("王:Wáng", "老师:lǎoshī", "教:jiāo", "我们:wǒmen", "汉语。:Hànyǔ.", "英语:Yīngyǔ"),
        correctAnswer = "王,老师,教,我们,汉语。",
        audioToSpeak = "王老师教我们汉语。"
    ),

    // 3. Soal 3: Ketuk Pasangan yang Sesuai (Mengajar & Memulai)
    Exercise(
        id = "u24_s3_p1_q3",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u24_s3_p1_m1", "教", "jiāo", "mengajar"),
            MatchPairItem("u24_s3_p1_m2", "开始", "kāishǐ", "mulai / permulaan"),
            MatchPairItem("u24_s3_p1_m3", "教汉语", "jiāo Hànyǔ", "mengajar Mandarin"),
            MatchPairItem("u24_s3_p1_m4", "上课", "shàngkè", "mulai kelas")
        )
    ),

    // 4. Soal 4: Ketik Pinyin (mengajar -> jiāo)
    Exercise(
        id = "u24_s3_p1_q4",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "mengajar",
        sentenceWithBlank = "教 (________)",
        targetHanzi = "教",
        targetPinyin = "jiāo",
        correctAnswer = "jiao",
        keyboardKeys = listOf("j", "i", "a", "o", "e", "u", "b", "d", "g", "h", "l", "m"),
        audioToSpeak = "教"
    ),

    // 5. Soal 5: Mendengar Kalimat (Rule 10: illustrationRes = 0)
    Exercise(
        id = "u24_s3_p1_q5",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Apa yang Anda dengar?",
        targetTranslation = "Sekarang kita mulai memulai kelas.",
        targetHanzi = "现在 我们 开始 上课。",
        targetPinyin = "Xiànzài wǒmen kāishǐ shàngkè.",
        wordChips = listOf("现在:xiànzài", "我们:wǒmen", "开始:kāishǐ", "上课。:shàngkè.", "下课:xiàkè"),
        correctAnswer = "现在,我们,开始,上课。",
        illustrationRes = 0,
        audioToSpeak = "现在我们开始上课。"
    ),

    // 6. Soal 6: Pilihan Kalimat
    Exercise(
        id = "u24_s3_p1_q6",
        type = ExerciseType.SENTENCE_CHOICE,
        title = "Pilih terjemahan yang benar",
        targetHanzi = "电影 什么时候 开始？",
        targetPinyin = "Diànyǐng shénmeshíhou kāishǐ?",
        targetTranslation = "Kapan film dimulai?",
        correctAnswer = "Diànyǐng shénmeshíhou kāishǐ?\n电影 什么时候 开始？",
        options = listOf(
            "Diànyǐng shénmeshíhou kāishǐ?\n电影 什么时候 开始？",
            "Diànyǐng yǐjīng jiéshù le ma?\n电影 已经 结束 了 吗？",
            "Shàngkè shénmeshíhou kāishǐ?\n上课 什么时候 开始？"
        ),
        audioToSpeak = "电影什么时候开始？"
    ),

    // 7. Soal 7: Pilihan Gambar (开始 -> mulai permulaan)
    Exercise(
        id = "u24_s3_p1_q7",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "开始",
        targetPinyin = "kāishǐ",
        targetTranslation = "mulai / permulaan",
        correctAnswer = "mulai / permulaan",
        audioToSpeak = "开始",
        pictureOptions = listOf(
            PictureOption("u24_s3_p1_opt7_1", "mulai", "", R.drawable.ic_edu_school_start, true),
            PictureOption("u24_s3_p1_opt7_2", "ruang kelas", "", R.drawable.ic_edu_classroom, false),
            PictureOption("u24_s3_p1_opt7_3", "ujian", "", R.drawable.ic_edu_exam_test, false),
            PictureOption("u24_s3_p1_opt7_4", "pena", "", R.drawable.ic_edu_pen_pencil, false)
        )
    ),

    // 8. Soal 8: Ketik Pinyin (mulai -> kāishǐ)
    Exercise(
        id = "u24_s3_p1_q8",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "mulai / permulaan",
        sentenceWithBlank = "开始 (________)",
        targetHanzi = "开始",
        targetPinyin = "kāishǐ",
        correctAnswer = "kaishi",
        keyboardKeys = listOf("k", "a", "i", "s", "h", "e", "o", "u", "b", "d", "g", "j"),
        audioToSpeak = "开始"
    ),

    // 9. Soal 9: Susun Kalimat (Ibu mengajari saya memasak nasi.)
    Exercise(
        id = "u24_s3_p1_q9",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Ibu mengajari saya memasak.",
        targetHanzi = "妈妈 教 我 做饭。",
        targetPinyin = "Māma jiāo wǒ zuòfàn.",
        wordChips = listOf("妈妈:māma", "教:jiāo", "我:wǒ", "做饭。:zuòfàn.", "洗衣服:xǐ yīfu"),
        correctAnswer = "妈妈,教,我,做饭。",
        audioToSpeak = "妈妈教我做饭。"
    ),

    // 10. Soal 10: Ketuk Pasangan yang Sesuai (Rangkuman Mengajar & Memulai)
    Exercise(
        id = "u24_s3_p1_m10",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u24_s3_p1_m10_1", "教", "jiāo", "mengajar"),
            MatchPairItem("u24_s3_p1_m10_2", "开始", "kāishǐ", "mulai"),
            MatchPairItem("u24_s3_p1_m10_3", "教做饭", "jiāo zuòfàn", "ajar masak"),
            MatchPairItem("u24_s3_p1_m10_4", "开始学", "kāishǐ xué", "mulai belajar")
        )
    )
)

val bab24Stage3Part2Exercises = listOf(
    // 1. Soal 1: Pilihan Gambar (懂 -> mengerti / paham)
    Exercise(
        id = "u24_s3_p2_q1",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "懂",
        targetPinyin = "dǒng",
        targetTranslation = "mengerti / paham",
        correctAnswer = "mengerti / paham",
        audioToSpeak = "懂",
        pictureOptions = listOf(
            PictureOption("u24_s3_p2_opt1", "mengerti", "", R.drawable.ic_edu_notebook, true),
            PictureOption("u24_s3_p2_opt2", "ujian", "", R.drawable.ic_edu_exam_test, false),
            PictureOption("u24_s3_p2_opt3", "ruang kelas", "", R.drawable.ic_edu_classroom, false),
            PictureOption("u24_s3_p2_opt4", "sekolah", "", R.drawable.ic_edu_high_school, false)
        )
    ),

    // 2. Soal 2: Susun Kalimat (Perkataan yang disampaikan guru saya semua sudah paham.)
    Exercise(
        id = "u24_s3_p2_q2",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Perkataan guru saya mengerti.",
        targetHanzi = "老师 讲 的 话 我 懂 了。",
        targetPinyin = "Lǎoshī jiǎng de huà wǒ dǒng le.",
        wordChips = listOf("老师:lǎoshī", "讲:jiǎng", "的:de", "话:huà", "我:wǒ", "懂:dǒng", "了。:le.", "错:cuò"),
        correctAnswer = "老师,讲,的,话,我,懂,了。",
        audioToSpeak = "老师讲的话我懂了。"
    ),

    // 3. Soal 3: Ketuk Pasangan yang Sesuai (Paham & Kosakata)
    Exercise(
        id = "u24_s3_p2_m3",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u24_s3_p2_m1", "懂", "dǒng", "mengerti / paham"),
            MatchPairItem("u24_s3_p2_m2", "词", "cí", "kata / kosakata"),
            MatchPairItem("u24_s3_p2_m3", "听懂", "tīng dǒng", "paham mendengar"),
            MatchPairItem("u24_s3_p2_m4", "生词", "shēngcí", "kosakata baru")
        )
    ),

    // 4. Soal 4: Ketik Pinyin (paham -> dǒng)
    Exercise(
        id = "u24_s3_p2_q4",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "mengerti / paham",
        sentenceWithBlank = "懂 (________)",
        targetHanzi = "懂",
        targetPinyin = "dǒng",
        correctAnswer = "dong",
        keyboardKeys = listOf("d", "o", "n", "g", "a", "e", "i", "u", "b", "h", "j", "l"),
        audioToSpeak = "懂"
    ),

    // 5. Soal 5: Mendengar Kalimat (Rule 10: illustrationRes = 0)
    Exercise(
        id = "u24_s3_p2_q5",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Apa yang Anda dengar?",
        targetTranslation = "Hari ini kami telah mempelajari dua puluh kosakata baru.",
        targetHanzi = "今天 我们 学 了 二十 个 新 词。",
        targetPinyin = "Jīntiān wǒmen xué le èrshí gè xīn cí.",
        wordChips = listOf("今天:jīntiān", "我们:wǒmen", "学:xué", "了:le", "二十:èrshí", "个:gè", "新:xīn", "词。:cí.", "字:zì"),
        correctAnswer = "今天,我们,学,了,二十,个,新,词。",
        illustrationRes = 0,
        audioToSpeak = "今天我们学了二十个新词。"
    ),

    // 6. Soal 6: Pilihan Kalimat
    Exercise(
        id = "u24_s3_p2_q6",
        type = ExerciseType.SENTENCE_CHOICE,
        title = "Pilih terjemahan yang benar",
        targetHanzi = "这个 词 是 什么 意思？",
        targetPinyin = "Zhège cí shì shénme yìsi?",
        targetTranslation = "Kata ini artinya apa?",
        correctAnswer = "Zhège cí shì shénme yìsi?\n这个 词 是 什么 意思？",
        options = listOf(
            "Zhège cí shì shénme yìsi?\n这个 词 是 什么 意思？",
            "Zhège zì shì shénme yìsi?\n这个 字 是 什么 意思？",
            "Zhè jù huà shì shénme yìsi?\n这 句 话 是 什么 意思？"
        ),
        audioToSpeak = "这个词是什么意思？"
    ),

    // 7. Soal 7: Pilihan Gambar (词 -> kosakata)
    Exercise(
        id = "u24_s3_p2_q7",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "词",
        targetPinyin = "cí",
        targetTranslation = "kata / kosakata",
        correctAnswer = "kata / kosakata",
        audioToSpeak = "词",
        pictureOptions = listOf(
            PictureOption("u24_s3_p2_opt7_1", "kosakata", "", R.drawable.ic_edu_notebook, true),
            PictureOption("u24_s3_p2_opt7_2", "pena", "", R.drawable.ic_edu_pen_pencil, false),
            PictureOption("u24_s3_p2_opt7_3", "ruang kelas", "", R.drawable.ic_edu_classroom, false),
            PictureOption("u24_s3_p2_opt7_4", "ujian", "", R.drawable.ic_edu_exam_test, false)
        )
    ),

    // 8. Soal 8: Ketik Pinyin (kata/kosakata -> cí)
    Exercise(
        id = "u24_s3_p2_q8",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "kata / kosakata",
        sentenceWithBlank = "词 (________)",
        targetHanzi = "词",
        targetPinyin = "cí",
        correctAnswer = "ci",
        keyboardKeys = listOf("c", "i", "a", "e", "o", "u", "b", "d", "g", "h", "j", "l"),
        audioToSpeak = "词"
    ),

    // 9. Soal 9: Susun Kalimat (Apakah kamu mengerti maksud perkataannya?)
    Exercise(
        id = "u24_s3_p2_q9",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Kamu mengerti tidak kata-katanya?",
        targetHanzi = "你 懂 他 的 意思 吗？",
        targetPinyin = "Nǐ dǒng tā de yìsi ma?",
        wordChips = listOf("你:nǐ", "懂:dǒng", "他:tā", "的:de", "意思:yìsi", "吗？:ma?", "会:huì"),
        correctAnswer = "你,懂,他,的,意思,吗？",
        audioToSpeak = "你懂他的意思吗？"
    ),

    // 10. Soal 10: Ketuk Pasangan yang Sesuai (Rangkuman Paham Kosakata)
    Exercise(
        id = "u24_s3_p2_m10",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u24_s3_p2_m10_1", "懂了", "dǒng le", "sudah paham"),
            MatchPairItem("u24_s3_p2_m10_2", "新生词", "xīn shēngcí", "kosakata baru"),
            MatchPairItem("u24_s3_p2_m10_3", "不懂", "bù dǒng", "tidak mengerti"),
            MatchPairItem("u24_s3_p2_m10_4", "学新词", "xué xīn cí", "belajar kata")
        )
    )
)
