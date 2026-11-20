package com.example.chineselearning.data.repository

import com.example.chineselearning.R
import com.example.chineselearning.data.model.Exercise
import com.example.chineselearning.data.model.ExerciseType
import com.example.chineselearning.data.model.MatchPairItem
import com.example.chineselearning.data.model.PictureOption

val bab24Stage1Part1Exercises = listOf(
    // 1. Soal 1: Pilihan Gambar (高中 -> Sekolah Menengah Atas / SMA)
    Exercise(
        id = "u24_s1_p1_q1",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "高中",
        targetPinyin = "gāozhōng",
        targetTranslation = "Sekolah Menengah Atas (SMA)",
        correctAnswer = "Sekolah Menengah Atas (SMA)",
        audioToSpeak = "高中",
        pictureOptions = listOf(
            PictureOption("u24_s1_p1_opt1", "SMA", "", R.drawable.ic_edu_high_school, true),
            PictureOption("u24_s1_p1_opt2", "ruang kelas", "", R.drawable.ic_edu_classroom, false),
            PictureOption("u24_s1_p1_opt3", "masuk sekolah", "", R.drawable.ic_edu_school_start, false),
            PictureOption("u24_s1_p1_opt4", "ujian", "", R.drawable.ic_edu_exam_test, false)
        )
    ),

    // 2. Soal 2: Susun Kalimat (Kakak perempuan saya sekarang sedang bersekolah di SMA.)
    Exercise(
        id = "u24_s1_p1_q2",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Kakak perempuan saya sekolah di SMA.",
        targetHanzi = "我 姐姐 现在 上 高中。",
        targetPinyin = "Wǒ jiějie xiànzài shàng gāozhōng.",
        wordChips = listOf("我:wǒ", "姐姐:jiějie", "现在:xiànzài", "上:shàng", "高中。:gāozhōng.", "大学:dàxué"),
        correctAnswer = "我,姐姐,现在,上,高中。",
        audioToSpeak = "我姐姐现在上高中。"
    ),

    // 3. Soal 3: Ketuk Pasangan yang Sesuai (SMA & Kelas)
    Exercise(
        id = "u24_s1_p1_q3",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u24_s1_p1_m1", "高中", "gāozhōng", "SMA"),
            MatchPairItem("u24_s1_p1_m2", "班", "bān", "kelas / rombel"),
            MatchPairItem("u24_s1_p1_m3", "同学", "tóngxué", "teman sekelas"),
            MatchPairItem("u24_s1_p1_m4", "我们班", "wǒmen bān", "kelas kami")
        )
    ),

    // 4. Soal 4: Ketik Pinyin (SMA -> gāozhōng)
    Exercise(
        id = "u24_s1_p1_q4",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "Sekolah Menengah Atas (SMA)",
        sentenceWithBlank = "高中 (________)",
        targetHanzi = "高中",
        targetPinyin = "gāozhōng",
        correctAnswer = "gaozhong",
        keyboardKeys = listOf("g", "a", "o", "z", "h", "n", "e", "i", "u", "b", "d", "j"),
        audioToSpeak = "高中"
    ),

    // 5. Soal 5: Mendengar Kalimat (Rule 10: illustrationRes = 0)
    Exercise(
        id = "u24_s1_p1_q5",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Apa yang Anda dengar?",
        targetTranslation = "Kelas kami secara keseluruhan ada dua puluh lima siswa.",
        targetHanzi = "我们 班 一共 有 二十五 个 同学。",
        targetPinyin = "Wǒmen bān yígòng yǒu èrshíwǔ gè tóngxué.",
        wordChips = listOf("我们:wǒmen", "班:bān", "一共:yígòng", "有:yǒu", "二十五:èrshíwǔ", "个:gè", "同学。:tóngxué.", "老师:lǎoshī"),
        correctAnswer = "我们,班,一共,有,二十五,个,同学。",
        illustrationRes = 0,
        audioToSpeak = "我们班一共有二十五个同学。"
    ),

    // 6. Soal 6: Pilihan Kalimat
    Exercise(
        id = "u24_s1_p1_q6",
        type = ExerciseType.SENTENCE_CHOICE,
        title = "Pilih terjemahan yang benar",
        targetHanzi = "高中 的 学习 很 忙。",
        targetPinyin = "Gāozhōng de xuéxí hěn máng.",
        targetTranslation = "Belajar di SMA sangat sibuk.",
        correctAnswer = "Gāozhōng de xuéxí hěn máng.\n高中 的 学习 很 忙。",
        options = listOf(
            "Gāozhōng de xuéxí hěn máng.\n高中 的 学习 很 忙。",
            "Gāozhōng de xuéxí hěn qīngsōng.\n高中 的 学习 很 轻松。",
            "Dàxué de xuéxí hěn máng.\n大学 的 学习 很 忙。"
        ),
        audioToSpeak = "高中的学习很忙。"
    ),

    // 7. Soal 7: Pilihan Gambar (班 -> kelas / rombel)
    Exercise(
        id = "u24_s1_p1_q7",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "班",
        targetPinyin = "bān",
        targetTranslation = "kelas / rombongan belajar",
        correctAnswer = "kelas / rombongan belajar",
        audioToSpeak = "班",
        pictureOptions = listOf(
            PictureOption("u24_s1_p1_opt7_1", "kelas", "", R.drawable.ic_edu_classroom, true),
            PictureOption("u24_s1_p1_opt7_2", "SMA", "", R.drawable.ic_edu_high_school, false),
            PictureOption("u24_s1_p1_opt7_3", "pena", "", R.drawable.ic_edu_pen_pencil, false),
            PictureOption("u24_s1_p1_opt7_4", "buku catatan", "", R.drawable.ic_edu_notebook, false)
        )
    ),

    // 8. Soal 8: Ketik Pinyin (kelas -> bān)
    Exercise(
        id = "u24_s1_p1_q8",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "kelas / rombel",
        sentenceWithBlank = "班 (________)",
        targetHanzi = "班",
        targetPinyin = "bān",
        correctAnswer = "ban",
        keyboardKeys = listOf("b", "a", "n", "e", "i", "o", "u", "d", "g", "h", "j", "l"),
        audioToSpeak = "班"
    ),

    // 9. Soal 9: Susun Kalimat (Dia adalah siswa kelas tiga SMA.)
    Exercise(
        id = "u24_s1_p1_q9",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Dia siswa kelas tiga SMA.",
        targetHanzi = "他 是 高三 的 学生。",
        targetPinyin = "Tā shì gāosān de xuéshēng.",
        wordChips = listOf("他:tā", "是:shì", "高三:gāosān", "的:de", "学生。:xuéshēng.", "老师:lǎoshī"),
        correctAnswer = "他,是,高三,的,学生。",
        audioToSpeak = "他是高三的学生。"
    ),

    // 10. Soal 10: Ketuk Pasangan yang Sesuai (Rangkuman Jenjang Kelas)
    Exercise(
        id = "u24_s1_p1_m10",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u24_s1_p1_m10_1", "高中", "gāozhōng", "SMA"),
            MatchPairItem("u24_s1_p1_m10_2", "班", "bān", "kelas"),
            MatchPairItem("u24_s1_p1_m10_3", "高中生", "gāozhōngshēng", "murid SMA"),
            MatchPairItem("u24_s1_p1_m10_4", "很多学生", "hěn duō xuéshēng", "banyak siswa")
        )
    )
)

val bab24Stage1Part2Exercises = listOf(
    // 1. Soal 1: Pilihan Gambar (教室 -> ruang kelas)
    Exercise(
        id = "u24_s1_p2_q1",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "教室",
        targetPinyin = "jiàoshì",
        targetTranslation = "ruang kelas",
        correctAnswer = "ruang kelas",
        audioToSpeak = "教室",
        pictureOptions = listOf(
            PictureOption("u24_s1_p2_opt1", "ruang kelas", "", R.drawable.ic_edu_classroom, true),
            PictureOption("u24_s1_p2_opt2", "masuk sekolah", "", R.drawable.ic_edu_school_start, false),
            PictureOption("u24_s1_p2_opt3", "SMA", "", R.drawable.ic_edu_high_school, false),
            PictureOption("u24_s1_p2_opt4", "ujian", "", R.drawable.ic_edu_exam_test, false)
        )
    ),

    // 2. Soal 2: Susun Kalimat (Para murid semua belajar mandiri dengan tenang di dalam kelas.)
    Exercise(
        id = "u24_s1_p2_q2",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Murid-murid di dalam kelas belajar.",
        targetHanzi = "同学们 在 教室 里 学习。",
        targetPinyin = "Tóngxuémen zài jiàoshì lǐ xuéxí.",
        wordChips = listOf("同学们:tóngxuémen", "在:zài", "教室:jiàoshì", "里:lǐ", "学习。:xuéxí.", "玩:wán"),
        correctAnswer = "同学们,在,教室,里,学习。",
        audioToSpeak = "同学们在教室里学习。"
    ),

    // 3. Soal 3: Ketuk Pasangan yang Sesuai (Kelas & Awal Semester)
    Exercise(
        id = "u24_s1_p2_m3",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u24_s1_p2_m1", "教室", "jiàoshì", "ruang kelas"),
            MatchPairItem("u24_s1_p2_m2", "开学", "kāixué", "awal semester"),
            MatchPairItem("u24_s1_p2_m3", "进教室", "jìn jiàoshì", "masuk kelas"),
            MatchPairItem("u24_s1_p2_m4", "新学期", "xīn xuéqī", "semester baru")
        )
    ),

    // 4. Soal 4: Ketik Pinyin (ruang kelas -> jiàoshì)
    Exercise(
        id = "u24_s1_p2_q4",
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

    // 5. Soal 5: Mendengar Kalimat (Rule 10: illustrationRes = 0)
    Exercise(
        id = "u24_s1_p2_q5",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Apa yang Anda dengar?",
        targetTranslation = "Senin depan kita akan mulai masuk sekolah.",
        targetHanzi = "下 星期一 我们 就 开学 了。",
        targetPinyin = "Xià xīngqīyī wǒmen jiù kāixué le.",
        wordChips = listOf("下:xià", "星期一:xīngqīyī", "我们:wǒmen", "就:jiù", "开学:kāixué", "了。:le.", "放假:fàngjià"),
        correctAnswer = "下,星期一,我们,就,开学,了。",
        illustrationRes = 0,
        audioToSpeak = "下星期一我们就开学了。"
    ),

    // 6. Soal 6: Pilihan Kalimat
    Exercise(
        id = "u24_s1_p2_q6",
        type = ExerciseType.SENTENCE_CHOICE,
        title = "Pilih terjemahan yang benar",
        targetHanzi = "我们 的 教室 在 三 楼。",
        targetPinyin = "Wǒmen de jiàoshì zài sān lóu.",
        targetTranslation = "Ruang kelas kami berada di lantai tiga.",
        correctAnswer = "Wǒmen de jiàoshì zài sān lóu.\n我们 的 教室 在 三 楼。",
        options = listOf(
            "Wǒmen de jiàoshì zài sān lóu.\n我们 的 教室 在 三 楼。",
            "Wǒmen de jiàoshì zài èr lóu.\n我们 的 教室 在 二 楼。",
            "Tāmen de jiàoshì zài sān lóu.\n他们 的 教室 在 三 楼。"
        ),
        audioToSpeak = "我们的教室在三楼。"
    ),

    // 7. Soal 7: Pilihan Gambar (开学 -> awal semester masuk sekolah)
    Exercise(
        id = "u24_s1_p2_q7",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "开学",
        targetPinyin = "kāixué",
        targetTranslation = "awal semester / masuk sekolah",
        correctAnswer = "awal semester / masuk sekolah",
        audioToSpeak = "开学",
        pictureOptions = listOf(
            PictureOption("u24_s1_p2_opt7_1", "masuk sekolah", "", R.drawable.ic_edu_school_start, true),
            PictureOption("u24_s1_p2_opt7_2", "ruang kelas", "", R.drawable.ic_edu_classroom, false),
            PictureOption("u24_s1_p2_opt7_3", "buku catatan", "", R.drawable.ic_edu_notebook, false),
            PictureOption("u24_s1_p2_opt7_4", "pena", "", R.drawable.ic_edu_pen_pencil, false)
        )
    ),

    // 8. Soal 8: Ketik Pinyin (masuk sekolah -> kāixué)
    Exercise(
        id = "u24_s1_p2_q8",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "mulai masuk sekolah / awal semester",
        sentenceWithBlank = "开学 (________)",
        targetHanzi = "开学",
        targetPinyin = "kāixué",
        correctAnswer = "kaixue",
        keyboardKeys = listOf("k", "a", "i", "x", "u", "e", "o", "b", "d", "g", "h", "j"),
        audioToSpeak = "开学"
    ),

    // 9. Soal 9: Susun Kalimat (Awal semester bertemu teman-teman sangat gembira.)
    Exercise(
        id = "u24_s1_p2_q9",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Awal semester sangat gembira.",
        targetHanzi = "开学 大家 都 很 高兴。",
        targetPinyin = "Kāixué dàjiā dōu hěn gāoxìng.",
        wordChips = listOf("开学:kāixué", "大家:dàjiā", "都:dōu", "很:hěn", "高兴。:gāoxìng.", "累:lèi"),
        correctAnswer = "开学,大家,都,很,高兴。",
        audioToSpeak = "开学大家都很高兴。"
    ),

    // 10. Soal 10: Ketuk Pasangan yang Sesuai (Rangkuman Kelas & Sekolah)
    Exercise(
        id = "u24_s1_p2_m10",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u24_s1_p2_m10_1", "教室", "jiàoshì", "ruang kelas"),
            MatchPairItem("u24_s1_p2_m10_2", "开学", "kāixué", "masuk sekolah"),
            MatchPairItem("u24_s1_p2_m10_3", "很高兴", "hěn gāoxìng", "sangat senang"),
            MatchPairItem("u24_s1_p2_m10_4", "安静学习", "ānjìng xuéxí", "belajar tenang")
        )
    )
)
