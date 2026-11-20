package com.example.chineselearning.data.repository

import com.example.chineselearning.R
import com.example.chineselearning.data.model.Exercise
import com.example.chineselearning.data.model.ExerciseType
import com.example.chineselearning.data.model.MatchPairItem
import com.example.chineselearning.data.model.PictureOption

val bab24Stage5Part1Exercises = listOf(
    // 1. Soal 1: Pilihan Gambar (高中 -> SMA)
    Exercise(
        id = "u24_s5_p1_q1",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "高中",
        targetPinyin = "gāozhōng",
        targetTranslation = "Sekolah Menengah Atas (SMA)",
        correctAnswer = "Sekolah Menengah Atas (SMA)",
        audioToSpeak = "高中",
        pictureOptions = listOf(
            PictureOption("u24_s5_p1_opt1", "SMA", "", R.drawable.ic_edu_high_school, true),
            PictureOption("u24_s5_p1_opt2", "ruang kelas", "", R.drawable.ic_edu_classroom, false),
            PictureOption("u24_s5_p1_opt3", "masuk sekolah", "", R.drawable.ic_edu_school_start, false),
            PictureOption("u24_s5_p1_opt4", "ujian", "", R.drawable.ic_edu_exam_test, false)
        )
    ),

    // 2. Soal 2: Susun Kalimat (Guru mulai mengajar kami di dalam kelas.)
    Exercise(
        id = "u24_s5_p1_q2",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Guru mulai mengajar di kelas.",
        targetHanzi = "老师 在 教室 开始 教课。",
        targetPinyin = "Lǎoshī zài jiàoshì kāishǐ jiāokè.",
        wordChips = listOf("老师:lǎoshī", "在:zài", "教室:jiàoshì", "开始:kāishǐ", "教课。:jiāokè.", "玩:wán"),
        correctAnswer = "老师,在,教室,开始,教课。",
        audioToSpeak = "老师在教室开始教课。"
    ),

    // 3. Soal 3: Ketuk Pasangan yang Sesuai (Sintesis Pembelajaran Kelas)
    Exercise(
        id = "u24_s5_p1_m3",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u24_s5_p1_m1", "高中", "gāozhōng", "SMA"),
            MatchPairItem("u24_s5_p1_m2", "教室", "jiàoshì", "ruang kelas"),
            MatchPairItem("u24_s5_p1_m3", "开学", "kāixué", "awal semester"),
            MatchPairItem("u24_s5_p1_m4", "教课", "jiāokè", "mengajar kelas")
        )
    ),

    // 4. Soal 4: Ketik Pinyin (SMA -> gāozhōng)
    Exercise(
        id = "u24_s5_p1_q4",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "SMA",
        sentenceWithBlank = "高中 (________)",
        targetHanzi = "高中",
        targetPinyin = "gāozhōng",
        correctAnswer = "gaozhong",
        keyboardKeys = listOf("g", "a", "o", "z", "h", "n", "e", "i", "u", "b", "d", "j"),
        audioToSpeak = "高中"
    ),

    // 5. Soal 5: Mendengar Kalimat (Rule 10: illustrationRes = 0)
    Exercise(
        id = "u24_s5_p1_q5",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Apa yang Anda dengar?",
        targetTranslation = "Kami semua mendengarkan guru di kelas.",
        targetHanzi = "我们 在 教室 听 老师 讲课。",
        targetPinyin = "Wǒmen zài jiàoshì tīng lǎoshī jiǎngkè.",
        wordChips = listOf("我们:wǒmen", "在:zài", "教室:jiàoshì", "听:tīng", "老师:lǎoshī", "讲课。:jiǎngkè.", "唱歌:chànggē"),
        correctAnswer = "我们,在,教室,听,老师,讲课。",
        illustrationRes = 0,
        audioToSpeak = "我们在教室听老师讲课。"
    ),

    // 6. Soal 6: Pilihan Kalimat
    Exercise(
        id = "u24_s5_p1_q6",
        type = ExerciseType.SENTENCE_CHOICE,
        title = "Pilih terjemahan yang benar",
        targetHanzi = "请 大家 把 书包 放 在 桌子 下面。",
        targetPinyin = "Qǐng dàjiā bǎ shūbāo fàng zài zhuōzi xiàmiàn.",
        targetTranslation = "Silakan semua taruh tas sekolah di bawah meja.",
        correctAnswer = "Qǐng大家 bǎ shūbāo fàng zài zhuōzi xiàmiàn.\n请 大家 把 书包 放 在 桌子 下面。",
        options = listOf(
            "Qǐng大家 bǎ shūbāo fàng zài zhuōzi xiàmiàn.\n请 大家 把 书包 放 在 桌子 下面。",
            "Qǐng大家 bǎ shūbāo fàng zài zhuōzi shàngmiàn.\n请 大家 把 书包 放 在 桌子 上面。",
            "Qǐng大家 bǎ běnzi fàng zài zhuōzi xiàmiàn.\n请 大家 把 本子 放 在 桌子 下面。"
        ),
        audioToSpeak = "请大家把书包放在桌子下面。"
    ),

    // 7. Soal 7: Pilihan Gambar (教室 -> ruang kelas bersih)
    Exercise(
        id = "u24_s5_p1_q7",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "教室",
        targetPinyin = "jiàoshì",
        targetTranslation = "ruang kelas",
        correctAnswer = "ruang kelas",
        audioToSpeak = "教室",
        pictureOptions = listOf(
            PictureOption("u24_s5_p1_opt7_1", "ruang kelas", "", R.drawable.ic_edu_classroom, true),
            PictureOption("u24_s5_p1_opt7_2", "buku catatan", "", R.drawable.ic_edu_notebook, false),
            PictureOption("u24_s5_p1_opt7_3", "pena", "", R.drawable.ic_edu_pen_pencil, false),
            PictureOption("u24_s5_p1_opt7_4", "ujian", "", R.drawable.ic_edu_exam_test, false)
        )
    ),

    // 8. Soal 8: Ketik Pinyin (ruang kelas -> jiàoshì)
    Exercise(
        id = "u24_s5_p1_q8",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "ruang kelas",
        sentenceWithBlank = "教室 (________)",
        targetHanzi = "教室",
        targetPinyin = "jiàoshì",
        correctAnswer = "jiaoshi",
        keyboardKeys = listOf("j", "i", "a", "o", "s", "h", "e", "u", "b", "d", "g", "l"),
        audioToSpeak = "教室"
    ),

    // 9. Soal 9: Susun Kalimat (Murid-murid menulis karakter Hanzi dengan pena.)
    Exercise(
        id = "u24_s5_p1_q9",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Murid menulis Hanzi dengan pena.",
        targetHanzi = "学生 用 笔 写 汉字。",
        targetPinyin = "Xuéshēng yòng bǐ xiě Hànzì.",
        wordChips = listOf("学生:xuéshēng", "用:yòng", "笔:bǐ", "写:xiě", "汉字。:Hànzì.", "画:huà"),
        correctAnswer = "学生,用,笔,写,汉字。",
        audioToSpeak = "学生用笔写汉字。"
    ),

    // 10. Soal 10: Ketuk Pasangan yang Sesuai (Rangkuman Sintesis 1)
    Exercise(
        id = "u24_s5_p1_m10",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u24_s5_p1_m10_1", "写汉字", "xiě Hànzì", "menulis Hanzi"),
            MatchPairItem("u24_s5_p1_m10_2", "用笔", "yòng bǐ", "pakai pena"),
            MatchPairItem("u24_s5_p1_m10_3", "新书包", "xīn shūbāo", "tas baru"),
            MatchPairItem("u24_s5_p1_m10_4", "进教室", "jìn jiàoshì", "masuk kelas")
        )
    )
)

val bab24Stage5Part2Exercises = listOf(
    // 1. Soal 1: Pilihan Gambar (考试 -> ujian tes akhir)
    Exercise(
        id = "u24_s5_p2_q1",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "考试",
        targetPinyin = "kǎoshì",
        targetTranslation = "ujian",
        correctAnswer = "ujian",
        audioToSpeak = "考试",
        pictureOptions = listOf(
            PictureOption("u24_s5_p2_opt1", "ujian", "", R.drawable.ic_edu_exam_test, true),
            PictureOption("u24_s5_p2_opt2", "buku catatan", "", R.drawable.ic_edu_notebook, false),
            PictureOption("u24_s5_p2_opt3", "pena", "", R.drawable.ic_edu_pen_pencil, false),
            PictureOption("u24_s5_p2_opt4", "sekolah", "", R.drawable.ic_edu_high_school, false)
        )
    ),

    // 2. Soal 2: Susun Kalimat (Semua soal pada ujian ini saya pahami.)
    Exercise(
        id = "u24_s5_p2_q2",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Soal ujian ini saya paham semua.",
        targetHanzi = "这 次 考试 的 题 我 都 懂。",
        targetPinyin = "Zhè cì kǎoshì de tí wǒ dōu dǒng.",
        wordChips = listOf("这:zhè", "次:cì", "考试:kǎoshì", "的:de", "题:tí", "我:wǒ", "都:dōu", "懂。:dǒng.", "错:cuò"),
        correctAnswer = "这,次,考试,的,题,我,都,懂。",
        audioToSpeak = "这次考试的题我都懂。"
    ),

    // 3. Soal 3: Ketuk Pasangan yang Sesuai (Grand Sintesis Bab 24)
    Exercise(
        id = "u24_s5_p2_m3",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u24_s5_p2_m1", "考试", "kǎoshì", "ujian"),
            MatchPairItem("u24_s5_p2_m2", "懂", "dǒng", "mengerti / paham"),
            MatchPairItem("u24_s5_p2_m3", "错", "cuò", "salah"),
            MatchPairItem("u24_s5_p2_m4", "题", "tí", "soal")
        )
    ),

    // 4. Soal 4: Ketik Pinyin (ujian -> kǎoshì)
    Exercise(
        id = "u24_s5_p2_q4",
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

    // 5. Soal 5: Mendengar Kalimat (Rule 10: illustrationRes = 0)
    Exercise(
        id = "u24_s5_p2_q5",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Apa yang Anda dengar?",
        targetTranslation = "Soal ini tidak salah, jawabannya benar.",
        targetHanzi = "这 道 题 没 错， 是 对 的。",
        targetPinyin = "Zhè dào tí méi cuò, shì duì de.",
        wordChips = listOf("这:zhè", "道:dào", "题:tí", "没:méi", "错，:cuò,", "是:shì", "对:duì", "的。:de."),
        correctAnswer = "这,道,题,没,错，,是,对,的。",
        illustrationRes = 0,
        audioToSpeak = "这道题没错，是对的。"
    ),

    // 6. Soal 6: Pilihan Kalimat
    Exercise(
        id = "u24_s5_p2_q6",
        type = ExerciseType.SENTENCE_CHOICE,
        title = "Pilih terjemahan yang benar",
        targetHanzi = "我们 班 的 同学 都 很 努力。",
        targetPinyin = "Wǒmen bān de tóngxué dōu hěn nǔlì.",
        targetTranslation = "Teman-teman di kelas kami semua sangat rajin.",
        correctAnswer = "Wǒmen bān de tóngxué dōu hěn nǔlì.\n我们 班 的 同学 都 很 努力。",
        options = listOf(
            "Wǒmen bān de tóngxué dōu hěn nǔlì.\n我们 班 的 同学 都 很 努力。",
            "Tāmen bān de tóngxué dōu hěn lǎn.\n他们 班 的 同学 都 很 懒。",
            "Wǒmen bān de tóngxué bù nǔlì.\n我们 班 的 同学 不 努力。"
        ),
        audioToSpeak = "我们班的同学都很努力。"
    ),

    // 7. Soal 7: Pilihan Gambar (错 -> keliru salah)
    Exercise(
        id = "u24_s5_p2_q7",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "错",
        targetPinyin = "cuò",
        targetTranslation = "salah / keliru",
        correctAnswer = "salah / keliru",
        audioToSpeak = "错",
        pictureOptions = listOf(
            PictureOption("u24_s5_p2_opt7_1", "keliru", "", R.drawable.ic_edu_exam_test, true),
            PictureOption("u24_s5_p2_opt7_2", "buku catatan", "", R.drawable.ic_edu_notebook, false),
            PictureOption("u24_s5_p2_opt7_3", "pena", "", R.drawable.ic_edu_pen_pencil, false),
            PictureOption("u24_s5_p2_opt7_4", "sekolah", "", R.drawable.ic_edu_high_school, false)
        )
    ),

    // 8. Soal 8: Ketik Pinyin (salah/keliru -> cuò)
    Exercise(
        id = "u24_s5_p2_q8",
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

    // 9. Soal 9: Susun Kalimat (Saya sudah paham semua kosakata baru.)
    Exercise(
        id = "u24_s5_p2_q9",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Kosakata baru saya sudah paham.",
        targetHanzi = "新 词 我 都 懂 了。",
        targetPinyin = "Xīn cí wǒ dōu dǒng le.",
        wordChips = listOf("新:xīn", "词:cí", "我:wǒ", "都:dōu", "懂:dǒng", "了。:le.", "忘:wàng"),
        correctAnswer = "新,词,我,都,懂,了。",
        audioToSpeak = "新词我都懂了。"
    ),

    // 10. Soal 10: Ketuk Pasangan yang Sesuai (Grand Review Final Bab 24)
    Exercise(
        id = "u24_s5_p2_m10",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u24_s5_p2_m10_1", "考得好", "kǎo de hǎo", "ujian sukses"),
            MatchPairItem("u24_s5_p2_m10_2", "都懂了", "dōu dǒng le", "semua paham"),
            MatchPairItem("u24_s5_p2_m10_3", "没做错", "méi zuò cuò", "tidak salah"),
            MatchPairItem("u24_s5_p2_m10_4", "高中班", "gāozhōng bān", "kelas SMA")
        )
    )
)
