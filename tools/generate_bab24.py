#!/usr/bin/env python3
import os

extra_distractors = ['a', 'e', 'i', 'o', 'u', 'b', 'd', 'g', 'h', 'j', 'l', 'm', 'n', 'q', 'r', 's', 't', 'w', 'x', 'y', 'z']

def make_keys(ans):
    ans_clean = ans.lower().strip()
    needed = [c for c in ans_clean if c.isalpha()]
    keys = list(dict.fromkeys(needed))
    for d in extra_distractors:
        if d not in keys:
            keys.append(d)
        if len(keys) >= 12:
            break
    return "listOf(" + ", ".join(f'"{k}"' for k in keys) + ")"

def generate_bab24():
    base_dir = "app/src/main/java/com/example/chineselearning/data/repository"
    
    stages = {}
    
    # =========================================================================
    # STAGE 1: Jenjang Sekolah, Kelas & Awal Masuk (高中, 班, 教室, 开学)
    # =========================================================================
    k1_p1_q4 = make_keys("gaozhong")
    k1_p1_q8 = make_keys("ban")
    k1_p2_q4 = make_keys("jiaoshi")
    k1_p2_q8 = make_keys("kaixue")
    
    stages[1] = {
        "p1": [
            f"""    // 1. Soal 1: Pilihan Gambar (高中 -> Sekolah Menengah Atas / SMA)
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
    )""",
            f"""    // 2. Soal 2: Susun Kalimat (Kakak perempuan saya sekarang sedang bersekolah di SMA.)
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
    )""",
            f"""    // 3. Soal 3: Ketuk Pasangan yang Sesuai (SMA & Kelas)
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
    )""",
            f"""    // 4. Soal 4: Ketik Pinyin (SMA -> gāozhōng)
    Exercise(
        id = "u24_s1_p1_q4",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "Sekolah Menengah Atas (SMA)",
        sentenceWithBlank = "高中 (________)",
        targetHanzi = "高中",
        targetPinyin = "gāozhōng",
        correctAnswer = "gaozhong",
        keyboardKeys = {k1_p1_q4},
        audioToSpeak = "高中"
    )""",
            f"""    // 5. Soal 5: Mendengar Kalimat (Rule 10: illustrationRes = 0)
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
    )""",
            f"""    // 6. Soal 6: Pilihan Kalimat
    Exercise(
        id = "u24_s1_p1_q6",
        type = ExerciseType.SENTENCE_CHOICE,
        title = "Pilih terjemahan yang benar",
        targetHanzi = "高中 的 学习 很 忙。",
        targetPinyin = "Gāozhōng de xuéxí hěn máng.",
        targetTranslation = "Belajar di SMA sangat sibuk.",
        correctAnswer = "Gāozhōng de xuéxí hěn máng.\\n高中 的 学习 很 忙。",
        options = listOf(
            "Gāozhōng de xuéxí hěn máng.\\n高中 的 学习 很 忙。",
            "Gāozhōng de xuéxí hěn qīngsōng.\\n高中 的 学习 很 轻松。",
            "Dàxué de xuéxí hěn máng.\\n大学 的 学习 很 忙。"
        ),
        audioToSpeak = "高中的学习很忙。"
    )""",
            f"""    // 7. Soal 7: Pilihan Gambar (班 -> kelas / rombel)
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
    )""",
            f"""    // 8. Soal 8: Ketik Pinyin (kelas -> bān)
    Exercise(
        id = "u24_s1_p1_q8",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "kelas / rombel",
        sentenceWithBlank = "班 (________)",
        targetHanzi = "班",
        targetPinyin = "bān",
        correctAnswer = "ban",
        keyboardKeys = {k1_p1_q8},
        audioToSpeak = "班"
    )""",
            f"""    // 9. Soal 9: Susun Kalimat (Dia adalah siswa kelas tiga SMA.)
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
    )""",
            f"""    // 10. Soal 10: Ketuk Pasangan yang Sesuai (Rangkuman Jenjang Kelas)
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
    )"""
        ],
        "p2": [
            f"""    // 1. Soal 1: Pilihan Gambar (教室 -> ruang kelas)
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
    )""",
            f"""    // 2. Soal 2: Susun Kalimat (Para murid semua belajar mandiri dengan tenang di dalam kelas.)
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
    )""",
            f"""    // 3. Soal 3: Ketuk Pasangan yang Sesuai (Kelas & Awal Semester)
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
    )""",
            f"""    // 4. Soal 4: Ketik Pinyin (ruang kelas -> jiàoshì)
    Exercise(
        id = "u24_s1_p2_q4",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "ruang kelas",
        sentenceWithBlank = "教室 (________)",
        targetHanzi = "教室",
        targetPinyin = "jiàoshì",
        correctAnswer = "jiaoshi",
        keyboardKeys = {k1_p2_q4},
        audioToSpeak = "教室"
    )""",
            f"""    // 5. Soal 5: Mendengar Kalimat (Rule 10: illustrationRes = 0)
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
    )""",
            f"""    // 6. Soal 6: Pilihan Kalimat
    Exercise(
        id = "u24_s1_p2_q6",
        type = ExerciseType.SENTENCE_CHOICE,
        title = "Pilih terjemahan yang benar",
        targetHanzi = "我们 的 教室 在 三 楼。",
        targetPinyin = "Wǒmen de jiàoshì zài sān lóu.",
        targetTranslation = "Ruang kelas kami berada di lantai tiga.",
        correctAnswer = "Wǒmen de jiàoshì zài sān lóu.\\n我们 的 教室 在 三 楼。",
        options = listOf(
            "Wǒmen de jiàoshì zài sān lóu.\\n我们 的 教室 在 三 楼。",
            "Wǒmen de jiàoshì zài èr lóu.\\n我们 的 教室 在 二 楼。",
            "Tāmen de jiàoshì zài sān lóu.\\n他们 的 教室 在 三 楼。"
        ),
        audioToSpeak = "我们的教室在三楼。"
    )""",
            f"""    // 7. Soal 7: Pilihan Gambar (开学 -> awal semester masuk sekolah)
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
    )""",
            f"""    // 8. Soal 8: Ketik Pinyin (masuk sekolah -> kāixué)
    Exercise(
        id = "u24_s1_p2_q8",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "mulai masuk sekolah / awal semester",
        sentenceWithBlank = "开学 (________)",
        targetHanzi = "开学",
        targetPinyin = "kāixué",
        correctAnswer = "kaixue",
        keyboardKeys = {k1_p2_q8},
        audioToSpeak = "开学"
    )""",
            f"""    // 9. Soal 9: Susun Kalimat (Awal semester bertemu teman-teman sangat gembira.)
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
    )""",
            f"""    // 10. Soal 10: Ketuk Pasangan yang Sesuai (Rangkuman Kelas & Sekolah)
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
    )"""
        ]
    }

    # =========================================================================
    # STAGE 2: Perlengkapan Belajar & Alat Tulis (本子, 笔, 书包, 门, 门口)
    # =========================================================================
    k2_p1_q4 = make_keys("benzi")
    k2_p1_q8 = make_keys("bi")
    k2_p2_q4 = make_keys("shubao")
    k2_p2_q8 = make_keys("menkou")
    
    stages[2] = {
        "p1": [
            f"""    // 1. Soal 1: Pilihan Gambar (本子 -> buku catatan)
    Exercise(
        id = "u24_s2_p1_q1",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "本子",
        targetPinyin = "běnzi",
        targetTranslation = "buku catatan",
        correctAnswer = "buku catatan",
        audioToSpeak = "本子",
        pictureOptions = listOf(
            PictureOption("u24_s2_p1_opt1", "buku catatan", "", R.drawable.ic_edu_notebook, true),
            PictureOption("u24_s2_p1_opt2", "pena", "", R.drawable.ic_edu_pen_pencil, false),
            PictureOption("u24_s2_p1_opt3", "ruang kelas", "", R.drawable.ic_edu_classroom, false),
            PictureOption("u24_s2_p1_opt4", "ujian", "", R.drawable.ic_edu_exam_test, false)
        )
    )""",
            f"""    // 2. Soal 2: Susun Kalimat (Saya mencatat perkataan guru di buku catatan.)
    Exercise(
        id = "u24_s2_p1_q2",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Saya mencatat di buku catatan.",
        targetHanzi = "我 在 本子 上 记下。",
        targetPinyin = "Wǒ zài běnzi shang jìxià.",
        wordChips = listOf("我:wǒ", "在:zài", "本子:běnzi", "上:shang", "记下。:jìxià.", "书包:shūbāo"),
        correctAnswer = "我,在,本子,上,记下。",
        audioToSpeak = "我在本子上记下。"
    )""",
            f"""    // 3. Soal 3: Ketuk Pasangan yang Sesuai (Alat Tulis & Catatan)
    Exercise(
        id = "u24_s2_p1_q3",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u24_s2_p1_m1", "本子", "běnzi", "buku catatan"),
            MatchPairItem("u24_s2_p1_m2", "笔", "bǐ", "pena / pensil"),
            MatchPairItem("u24_s2_p1_m3", "一支笔", "yì zhī bǐ", "sebatang pena"),
            MatchPairItem("u24_s2_p1_m4", "写字", "xiě zì", "menulis kata")
        )
    )""",
            f"""    // 4. Soal 4: Ketik Pinyin (buku catatan -> běnzi)
    Exercise(
        id = "u24_s2_p1_q4",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "buku catatan",
        sentenceWithBlank = "本子 (________)",
        targetHanzi = "本子",
        targetPinyin = "běnzi",
        correctAnswer = "benzi",
        keyboardKeys = {k2_p1_q4},
        audioToSpeak = "本子"
    )""",
            f"""    // 5. Soal 5: Mendengar Kalimat (Rule 10: illustrationRes = 0)
    Exercise(
        id = "u24_s2_p1_q5",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Apa yang Anda dengar?",
        targetTranslation = "Bisakah kamu meminjamkan saya sebatang pena?",
        targetHanzi = "你 能 借 我 一 支 笔 吗？",
        targetPinyin = "Nǐ néng jiè wǒ yì zhī bǐ ma?",
        wordChips = listOf("你:nǐ", "能:néng", "借:jiè", "我:wǒ", "一:yì", "支:zhī", "笔:bǐ", "吗？:ma?", "本子:běnzi"),
        correctAnswer = "你,能,借,我,一,支,笔,吗？",
        illustrationRes = 0,
        audioToSpeak = "你能借我一支笔吗？"
    )""",
            f"""    // 6. Soal 6: Pilihan Kalimat
    Exercise(
        id = "u24_s2_p1_q6",
        type = ExerciseType.SENTENCE_CHOICE,
        title = "Pilih terjemahan yang benar",
        targetHanzi = "我 拿 着 黑色 的 笔 写 汉字。",
        targetPinyin = "Wǒ ná zhe hēisè de bǐ xiě Hànzì.",
        targetTranslation = "Saya memegang pena hitam menulis karakter Hanzi.",
        correctAnswer = "Wǒ ná zhe hēisè de bǐ xiě Hànzì.\\n我 拿 着 黑色 的 笔 写 汉字。",
        options = listOf(
            "Wǒ ná zhe hēisè de bǐ xiě Hànzì.\\n我 拿 着 黑色 的 笔 写 汉字。",
            "Wǒ ná zhe hóngsè de bǐ xiě Hànzì.\\n我 拿 着 红色 的 笔 写 汉字。",
            "Tā ná zhe hēisè de bǐ xiě Hànzì.\\n他 拿 着 黑色 的 笔 写 汉字。"
        ),
        audioToSpeak = "我拿着黑色的笔写汉字。"
    )""",
            f"""    // 7. Soal 7: Pilihan Gambar (笔 -> pena / pensil)
    Exercise(
        id = "u24_s2_p1_q7",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "笔",
        targetPinyin = "bǐ",
        targetTranslation = "pena / pensil",
        correctAnswer = "pena / pensil",
        audioToSpeak = "笔",
        pictureOptions = listOf(
            PictureOption("u24_s2_p1_opt7_1", "pena", "", R.drawable.ic_edu_pen_pencil, true),
            PictureOption("u24_s2_p1_opt7_2", "buku catatan", "", R.drawable.ic_edu_notebook, false),
            PictureOption("u24_s2_p1_opt7_3", "ruang kelas", "", R.drawable.ic_edu_classroom, false),
            PictureOption("u24_s2_p1_opt7_4", "ujian", "", R.drawable.ic_edu_exam_test, false)
        )
    )""",
            f"""    // 8. Soal 8: Ketik Pinyin (pena -> bǐ)
    Exercise(
        id = "u24_s2_p1_q8",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "pena / pensil / alat tulis",
        sentenceWithBlank = "笔 (________)",
        targetHanzi = "笔",
        targetPinyin = "bǐ",
        correctAnswer = "bi",
        keyboardKeys = {k2_p1_q8},
        audioToSpeak = "笔"
    )""",
            f"""    // 9. Soal 9: Susun Kalimat (Di atas meja diletakkan dua buah buku catatan.)
    Exercise(
        id = "u24_s2_p1_q9",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Di atas meja ada dua buku catatan.",
        targetHanzi = "桌子 上 有 两 个 本子。",
        targetPinyin = "Zhuōzi shang yǒu liǎng gè běnzi.",
        wordChips = listOf("桌子:zhuōzi", "上:shang", "有:yǒu", "两:liǎng", "个:gè", "本子。:běnzi.", "三:sān"),
        correctAnswer = "桌子,上,有,两,个,本子。",
        audioToSpeak = "桌子上有两个本子。"
    )""",
            f"""    // 10. Soal 10: Ketuk Pasangan yang Sesuai (Rangkuman Alat Tulis)
    Exercise(
        id = "u24_s2_p1_m10",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u24_s2_p1_m10_1", "本子", "běnzi", "buku catatan"),
            MatchPairItem("u24_s2_p1_m10_2", "笔", "bǐ", "alat tulis"),
            MatchPairItem("u24_s2_p1_m10_3", "借笔", "jiè bǐ", "pinjam pena"),
            MatchPairItem("u24_s2_p1_m10_4", "黑笔", "hēi bǐ", "pena hitam")
        )
    )"""
        ],
        "p2": [
            f"""    // 1. Soal 1: Pilihan Gambar (书包 -> tas sekolah)
    Exercise(
        id = "u24_s2_p2_q1",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "书包",
        targetPinyin = "shūbāo",
        targetTranslation = "tas sekolah",
        correctAnswer = "tas sekolah",
        audioToSpeak = "书包",
        pictureOptions = listOf(
            PictureOption("u24_s2_p2_opt1", "tas sekolah", "", R.drawable.ic_edu_notebook, true),
            PictureOption("u24_s2_p2_opt2", "pena", "", R.drawable.ic_edu_pen_pencil, false),
            PictureOption("u24_s2_p2_opt3", "ruang kelas", "", R.drawable.ic_edu_classroom, false),
            PictureOption("u24_s2_p2_opt4", "ujian", "", R.drawable.ic_edu_exam_test, false)
        )
    )""",
            f"""    // 2. Soal 2: Susun Kalimat (Tas sekolah baru ini adalah hadiah dari ibu untuk saya.)
    Exercise(
        id = "u24_s2_p2_q2",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Tas baru ini hadiah dari ibu.",
        targetHanzi = "新 书包 是 妈妈 送 的。",
        targetPinyin = "Xīn shūbāo shì māma sòng de.",
        wordChips = listOf("新:xīn", "书包:shūbāo", "是:shì", "妈妈:māma", "送:sòng", "的。:de.", "爸爸:bàba"),
        correctAnswer = "新,书包,是,妈妈,送,的。",
        audioToSpeak = "新书包是妈妈送的。"
    )""",
            f"""    // 3. Soal 3: Ketuk Pasangan yang Sesuai (Tas & Pintu)
    Exercise(
        id = "u24_s2_p2_m3",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u24_s2_p2_m1", "书包", "shūbāo", "tas sekolah"),
            MatchPairItem("u24_s2_p2_m2", "门", "mén", "pintu"),
            MatchPairItem("u24_s2_p2_m3", "门口", "ménkǒu", "ambang pintu"),
            MatchPairItem("u24_s2_p2_m4", "关门", "guān mén", "menutup pintu")
        )
    )""",
            f"""    // 4. Soal 4: Ketik Pinyin (tas sekolah -> shūbāo)
    Exercise(
        id = "u24_s2_p2_q4",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "tas sekolah",
        sentenceWithBlank = "书包 (________)",
        targetHanzi = "书包",
        targetPinyin = "shūbāo",
        correctAnswer = "shubao",
        keyboardKeys = {k2_p2_q4},
        audioToSpeak = "书包"
    )""",
            f"""    // 5. Soal 5: Mendengar Kalimat (Rule 10: illustrationRes = 0)
    Exercise(
        id = "u24_s2_p2_q5",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Apa yang Anda dengar?",
        targetTranslation = "Saya menunggu Anda di depan pintu gerbang sekolah.",
        targetHanzi = "我 在 学校 门口 等 你。",
        targetPinyin = "Wǒ zài xuéxiào ménkǒu děng nǐ.",
        wordChips = listOf("我:wǒ", "在:zài", "学校:xuéxiào", "门口:ménkǒu", "等:děng", "你。:nǐ.", "看:kàn"),
        correctAnswer = "我,在,学校,门口,等,你。",
        illustrationRes = 0,
        audioToSpeak = "我在学校门口等你。"
    )""",
            f"""    // 6. Soal 6: Pilihan Kalimat
    Exercise(
        id = "u24_s2_p2_q6",
        type = ExerciseType.SENTENCE_CHOICE,
        title = "Pilih terjemahan yang benar",
        targetHanzi = "出门 前 请 把 门 关 上。",
        targetPinyin = "Chūmén qián qǐng bǎ mén guān shàng.",
        targetTranslation = "Sebelum keluar rumah tolong tutup pintunya.",
        correctAnswer = "Chūmén qián qǐng bǎ mén guān shàng.\\n出门 前 请 把 门 关 上。",
        options = listOf(
            "Chūmén qián qǐng bǎ mén guān shàng.\\n出门 前 请 把 门 关 上。",
            "Chūmén qián qǐng bǎ mén dǎkāi.\\n出门 前 请 把 门 打开。",
            "Jìnmén qián qǐng bǎ mén guān shàng.\\n进门 前 请 把 门 关 上。"
        ),
        audioToSpeak = "出门前请把门关上。"
    )""",
            f"""    // 7. Soal 7: Pilihan Gambar (门 -> pintu gerbang)
    Exercise(
        id = "u24_s2_p2_q7",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "门",
        targetPinyin = "mén",
        targetTranslation = "pintu / gerbang",
        correctAnswer = "pintu / gerbang",
        audioToSpeak = "门",
        pictureOptions = listOf(
            PictureOption("u24_s2_p2_opt7_1", "pintu", "", R.drawable.ic_edu_school_start, true),
            PictureOption("u24_s2_p2_opt7_2", "ruang kelas", "", R.drawable.ic_edu_classroom, false),
            PictureOption("u24_s2_p2_opt7_3", "tas", "", R.drawable.ic_edu_notebook, false),
            PictureOption("u24_s2_p2_opt7_4", "pena", "", R.drawable.ic_edu_pen_pencil, false)
        )
    )""",
            f"""    // 8. Soal 8: Ketik Pinyin (pintu masuk -> ménkǒu)
    Exercise(
        id = "u24_s2_p2_q8",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "pintu masuk / ambang pintu",
        sentenceWithBlank = "门口 (________)",
        targetHanzi = "门口",
        targetPinyin = "ménkǒu",
        correctAnswer = "menkou",
        keyboardKeys = {k2_p2_q8},
        audioToSpeak = "门口"
    )""",
            f"""    // 9. Soal 9: Susun Kalimat (Di dalam tas sekolah ada buku dan pena.)
    Exercise(
        id = "u24_s2_p2_q9",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Di dalam tas ada buku dan pena.",
        targetHanzi = "书包 里 有 书 和 笔。",
        targetPinyin = "Shūbāo lǐ yǒu shū hé bǐ.",
        wordChips = listOf("书包:shūbāo", "里:lǐ", "有:yǒu", "书:shū", "和:hé", "笔。:bǐ.", "本子:běnzi"),
        correctAnswer = "书包,里,有,书,和,笔。",
        audioToSpeak = "书包里有书和笔。"
    )""",
            f"""    // 10. Soal 10: Ketuk Pasangan yang Sesuai (Rangkuman Tas & Ambang Pintu)
    Exercise(
        id = "u24_s2_p2_m10",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u24_s2_p2_m10_1", "书包", "shūbāo", "tas sekolah"),
            MatchPairItem("u24_s2_p2_m10_2", "门口", "ménkǒu", "ambang pintu"),
            MatchPairItem("u24_s2_p2_m3", "关上门", "guān shàng mén", "tutup pintu"),
            MatchPairItem("u24_s2_p2_m4", "打开门", "dǎkāi mén", "buka pintu")
        )
    )"""
        ]
    }

    # =========================================================================
    # STAGE 3: Pengajaran, Kosakata & Pemahaman (教, 懂, 词, 开始)
    # =========================================================================
    k3_p1_q4 = make_keys("jiao")
    k3_p1_q8 = make_keys("kaishi")
    k3_p2_q4 = make_keys("dong")
    k3_p2_q8 = make_keys("ci")
    
    stages[3] = {
        "p1": [
            f"""    // 1. Soal 1: Pilihan Gambar (教 -> mengajar)
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
    )""",
            f"""    // 2. Soal 2: Susun Kalimat (Guru Wang mengajar kami bahasa Mandarin.)
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
    )""",
            f"""    // 3. Soal 3: Ketuk Pasangan yang Sesuai (Mengajar & Memulai)
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
    )""",
            f"""    // 4. Soal 4: Ketik Pinyin (mengajar -> jiāo)
    Exercise(
        id = "u24_s3_p1_q4",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "mengajar",
        sentenceWithBlank = "教 (________)",
        targetHanzi = "教",
        targetPinyin = "jiāo",
        correctAnswer = "jiao",
        keyboardKeys = {k3_p1_q4},
        audioToSpeak = "教"
    )""",
            f"""    // 5. Soal 5: Mendengar Kalimat (Rule 10: illustrationRes = 0)
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
    )""",
            f"""    // 6. Soal 6: Pilihan Kalimat
    Exercise(
        id = "u24_s3_p1_q6",
        type = ExerciseType.SENTENCE_CHOICE,
        title = "Pilih terjemahan yang benar",
        targetHanzi = "电影 什么时候 开始？",
        targetPinyin = "Diànyǐng shénmeshíhou kāishǐ?",
        targetTranslation = "Kapan film dimulai?",
        correctAnswer = "Diànyǐng shénmeshíhou kāishǐ?\\n电影 什么时候 开始？",
        options = listOf(
            "Diànyǐng shénmeshíhou kāishǐ?\\n电影 什么时候 开始？",
            "Diànyǐng yǐjīng jiéshù le ma?\\n电影 已经 结束 了 吗？",
            "Shàngkè shénmeshíhou kāishǐ?\\n上课 什么时候 开始？"
        ),
        audioToSpeak = "电影什么时候开始？"
    )""",
            f"""    // 7. Soal 7: Pilihan Gambar (开始 -> mulai permulaan)
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
    )""",
            f"""    // 8. Soal 8: Ketik Pinyin (mulai -> kāishǐ)
    Exercise(
        id = "u24_s3_p1_q8",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "mulai / permulaan",
        sentenceWithBlank = "开始 (________)",
        targetHanzi = "开始",
        targetPinyin = "kāishǐ",
        correctAnswer = "kaishi",
        keyboardKeys = {k3_p1_q8},
        audioToSpeak = "开始"
    )""",
            f"""    // 9. Soal 9: Susun Kalimat (Ibu mengajari saya memasak nasi.)
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
    )""",
            f"""    // 10. Soal 10: Ketuk Pasangan yang Sesuai (Rangkuman Mengajar & Memulai)
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
    )"""
        ],
        "p2": [
            f"""    // 1. Soal 1: Pilihan Gambar (懂 -> mengerti / paham)
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
    )""",
            f"""    // 2. Soal 2: Susun Kalimat (Perkataan yang disampaikan guru saya semua sudah paham.)
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
    )""",
            f"""    // 3. Soal 3: Ketuk Pasangan yang Sesuai (Paham & Kosakata)
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
    )""",
            f"""    // 4. Soal 4: Ketik Pinyin (paham -> dǒng)
    Exercise(
        id = "u24_s3_p2_q4",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "mengerti / paham",
        sentenceWithBlank = "懂 (________)",
        targetHanzi = "懂",
        targetPinyin = "dǒng",
        correctAnswer = "dong",
        keyboardKeys = {k3_p2_q4},
        audioToSpeak = "懂"
    )""",
            f"""    // 5. Soal 5: Mendengar Kalimat (Rule 10: illustrationRes = 0)
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
    )""",
            f"""    // 6. Soal 6: Pilihan Kalimat
    Exercise(
        id = "u24_s3_p2_q6",
        type = ExerciseType.SENTENCE_CHOICE,
        title = "Pilih terjemahan yang benar",
        targetHanzi = "这个 词 是 什么 意思？",
        targetPinyin = "Zhège cí shì shénme yìsi?",
        targetTranslation = "Kata ini artinya apa?",
        correctAnswer = "Zhège cí shì shénme yìsi?\\n这个 词 是 什么 意思？",
        options = listOf(
            "Zhège cí shì shénme yìsi?\\n这个 词 是 什么 意思？",
            "Zhège zì shì shénme yìsi?\\n这个 字 是 什么 意思？",
            "Zhè jù huà shì shénme yìsi?\\n这 句 话 是 什么 意思？"
        ),
        audioToSpeak = "这个词是什么意思？"
    )""",
            f"""    // 7. Soal 7: Pilihan Gambar (词 -> kosakata)
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
    )""",
            f"""    // 8. Soal 8: Ketik Pinyin (kata/kosakata -> cí)
    Exercise(
        id = "u24_s3_p2_q8",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "kata / kosakata",
        sentenceWithBlank = "词 (________)",
        targetHanzi = "词",
        targetPinyin = "cí",
        correctAnswer = "ci",
        keyboardKeys = {k3_p2_q8},
        audioToSpeak = "词"
    )""",
            f"""    // 9. Soal 9: Susun Kalimat (Apakah kamu mengerti maksud perkataannya?)
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
    )""",
            f"""    // 10. Soal 10: Ketuk Pasangan yang Sesuai (Rangkuman Paham Kosakata)
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
    )"""
        ]
    }

    # =========================================================================
    # STAGE 4: Pelaksanaan Ujian & Ketepatan Menjawab (考, 考试, 题, 错)
    # =========================================================================
    k4_p1_q4 = make_keys("kao")
    k4_p1_q8 = make_keys("kaoshi")
    k4_p2_q4 = make_keys("ti")
    k4_p2_q8 = make_keys("cuo")
    
    stages[4] = {
        "p1": [
            f"""    // 1. Soal 1: Pilihan Gambar (考试 -> ujian / tes)
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
    )""",
            f"""    // 2. Soal 2: Susun Kalimat (Besok kita harus mengikuti ujian pendengaran.)
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
    )""",
            f"""    // 3. Soal 3: Ketuk Pasangan yang Sesuai (Ujian & Tes)
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
    )""",
            f"""    // 4. Soal 4: Ketik Pinyin (menguji -> kǎo)
    Exercise(
        id = "u24_s4_p1_q4",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "menguji / dites",
        sentenceWithBlank = "考 (________)",
        targetHanzi = "考",
        targetPinyin = "kǎo",
        correctAnswer = "kao",
        keyboardKeys = {k4_p1_q4},
        audioToSpeak = "考"
    )""",
            f"""    // 5. Soal 5: Mendengar Kalimat (Rule 10: illustrationRes = 0)
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
    )""",
            f"""    // 6. Soal 6: Pilihan Kalimat
    Exercise(
        id = "u24_s4_p1_q6",
        type = ExerciseType.SENTENCE_CHOICE,
        title = "Pilih terjemahan yang benar",
        targetHanzi = "今天 的 汉语 考试 不 太 难。",
        targetPinyin = "Jīntiān de Hànyǔ kǎoshì bú tài nán.",
        targetTranslation = "Ujian bahasa Mandarin hari ini tidak terlalu sulit.",
        correctAnswer = "Jīntiān de Hànyǔ kǎoshì bú tài nán.\\n今天 的 汉语 考试 不 太 难。",
        options = listOf(
            "Jīntiān de Hànyǔ kǎoshì bú tài nán.\\n今天 的 汉语 考试 不 太 难。",
            "Jīntiān de Hànyǔ kǎoshì fēicháng nán.\\n今天 的 汉语 考试 非常 难。",
            "Míngtiān de Hànyǔ kǎoshì bú tài nán.\\n明天 的 汉语 考试 不 太 难。"
        ),
        audioToSpeak = "今天的汉语考试不太难。"
    )""",
            f"""    // 7. Soal 7: Pilihan Gambar (考试 -> ujian akademik)
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
    )""",
            f"""    // 8. Soal 8: Ketik Pinyin (ujian -> kǎoshì)
    Exercise(
        id = "u24_s4_p1_q8",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "ujian / ulangan",
        sentenceWithBlank = "考试 (________)",
        targetHanzi = "考试",
        targetPinyin = "kǎoshì",
        correctAnswer = "kaoshi",
        keyboardKeys = {k4_p1_q8},
        audioToSpeak = "考试"
    )""",
            f"""    // 9. Soal 9: Susun Kalimat (Saya harus mempersiapkan diri untuk ujian besok.)
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
    )""",
            f"""    // 10. Soal 10: Ketuk Pasangan yang Sesuai (Rangkuman Ujian)
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
    )"""
        ],
        "p2": [
            f"""    // 1. Soal 1: Pilihan Gambar (题 -> butir soal)
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
    )""",
            f"""    // 2. Soal 2: Susun Kalimat (Soal terakhir pada ujian matematika sangat sulit.)
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
    )""",
            f"""    // 3. Soal 3: Ketuk Pasangan yang Sesuai (Soal & Keliru)
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
    )""",
            f"""    // 4. Soal 4: Ketik Pinyin (soal -> tí)
    Exercise(
        id = "u24_s4_p2_q4",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "butir soal / topik ujian",
        sentenceWithBlank = "题 (________)",
        targetHanzi = "题",
        targetPinyin = "tí",
        correctAnswer = "ti",
        keyboardKeys = {k4_p2_q4},
        audioToSpeak = "题"
    )""",
            f"""    // 5. Soal 5: Mendengar Kalimat (Rule 10: illustrationRes = 0)
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
    )""",
            f"""    // 6. Soal 6: Pilihan Kalimat
    Exercise(
        id = "u24_s4_p2_q6",
        type = ExerciseType.SENTENCE_CHOICE,
        title = "Pilih terjemahan yang benar",
        targetHanzi = "我 没 做 错， 是 对 的。",
        targetPinyin = "Wǒ méi zuò cuò, shì duì de.",
        targetTranslation = "Saya tidak salah mengerjakan, itu benar.",
        correctAnswer = "Wǒ méi zuò cuò, shì duì de.\\n我 没 做 错， 是 对 的。",
        options = listOf(
            "Wǒ méi zuò cuò, shì duì de.\\n我 没 做 错， 是 对 的。",
            "Wǒ zuò cuò le, bú duì.\\n我 做 错 了， 不 对。",
            "Tā méi zuò cuò, shì duì de.\\n他 没 做 错， 是 对 的。"
        ),
        audioToSpeak = "我没做错，是对的。"
    )""",
            f"""    // 7. Soal 7: Pilihan Gambar (错 -> salah / keliru)
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
    )""",
            f"""    // 8. Soal 8: Ketik Pinyin (salah/keliru -> cuò)
    Exercise(
        id = "u24_s4_p2_q8",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "salah / keliru",
        sentenceWithBlank = "错 (________)",
        targetHanzi = "错",
        targetPinyin = "cuò",
        correctAnswer = "cuo",
        keyboardKeys = {k4_p2_q8},
        audioToSpeak = "错"
    )""",
            f"""    // 9. Soal 9: Susun Kalimat (Ada berapa soal dalam ujian ini?)
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
    )""",
            f"""    // 10. Soal 10: Ketuk Pasangan yang Sesuai (Rangkuman Butir Soal Ujian)
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
    )"""
        ]
    }

    # =========================================================================
    # STAGE 5: Evaluasi Komprehensif Aktivitas Akademik (Sintesis Seluruh Bab 24)
    # =========================================================================
    k5_p1_q4 = make_keys("gaozhong")
    k5_p1_q8 = make_keys("jiaoshi")
    k5_p2_q4 = make_keys("kaoshi")
    k5_p2_q8 = make_keys("cuo")
    
    stages[5] = {
        "p1": [
            f"""    // 1. Soal 1: Pilihan Gambar (高中 -> SMA)
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
    )""",
            f"""    // 2. Soal 2: Susun Kalimat (Guru mulai mengajar kami di dalam kelas.)
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
    )""",
            f"""    // 3. Soal 3: Ketuk Pasangan yang Sesuai (Sintesis Pembelajaran Kelas)
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
    )""",
            f"""    // 4. Soal 4: Ketik Pinyin (SMA -> gāozhōng)
    Exercise(
        id = "u24_s5_p1_q4",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "SMA",
        sentenceWithBlank = "高中 (________)",
        targetHanzi = "高中",
        targetPinyin = "gāozhōng",
        correctAnswer = "gaozhong",
        keyboardKeys = {k5_p1_q4},
        audioToSpeak = "高中"
    )""",
            f"""    // 5. Soal 5: Mendengar Kalimat (Rule 10: illustrationRes = 0)
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
    )""",
            f"""    // 6. Soal 6: Pilihan Kalimat
    Exercise(
        id = "u24_s5_p1_q6",
        type = ExerciseType.SENTENCE_CHOICE,
        title = "Pilih terjemahan yang benar",
        targetHanzi = "请 大家 把 书包 放 在 桌子 下面。",
        targetPinyin = "Qǐng dàjiā bǎ shūbāo fàng zài zhuōzi xiàmiàn.",
        targetTranslation = "Silakan semua taruh tas sekolah di bawah meja.",
        correctAnswer = "Qǐng大家 bǎ shūbāo fàng zài zhuōzi xiàmiàn.\\n请 大家 把 书包 放 在 桌子 下面。",
        options = listOf(
            "Qǐng大家 bǎ shūbāo fàng zài zhuōzi xiàmiàn.\\n请 大家 把 书包 放 在 桌子 下面。",
            "Qǐng大家 bǎ shūbāo fàng zài zhuōzi shàngmiàn.\\n请 大家 把 书包 放 在 桌子 上面。",
            "Qǐng大家 bǎ běnzi fàng zài zhuōzi xiàmiàn.\\n请 大家 把 本子 放 在 桌子 下面。"
        ),
        audioToSpeak = "请大家把书包放在桌子下面。"
    )""",
            f"""    // 7. Soal 7: Pilihan Gambar (教室 -> ruang kelas bersih)
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
    )""",
            f"""    // 8. Soal 8: Ketik Pinyin (ruang kelas -> jiàoshì)
    Exercise(
        id = "u24_s5_p1_q8",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "ruang kelas",
        sentenceWithBlank = "教室 (________)",
        targetHanzi = "教室",
        targetPinyin = "jiàoshì",
        correctAnswer = "jiaoshi",
        keyboardKeys = {k5_p1_q8},
        audioToSpeak = "教室"
    )""",
            f"""    // 9. Soal 9: Susun Kalimat (Murid-murid menulis karakter Hanzi dengan pena.)
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
    )""",
            f"""    // 10. Soal 10: Ketuk Pasangan yang Sesuai (Rangkuman Sintesis 1)
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
    )"""
        ],
        "p2": [
            f"""    // 1. Soal 1: Pilihan Gambar (考试 -> ujian tes akhir)
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
    )""",
            f"""    // 2. Soal 2: Susun Kalimat (Semua soal pada ujian ini saya pahami.)
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
    )""",
            f"""    // 3. Soal 3: Ketuk Pasangan yang Sesuai (Grand Sintesis Bab 24)
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
    )""",
            f"""    // 4. Soal 4: Ketik Pinyin (ujian -> kǎoshì)
    Exercise(
        id = "u24_s5_p2_q4",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "ujian / ulangan",
        sentenceWithBlank = "考试 (________)",
        targetHanzi = "考试",
        targetPinyin = "kǎoshì",
        correctAnswer = "kaoshi",
        keyboardKeys = {k5_p2_q4},
        audioToSpeak = "考试"
    )""",
            f"""    // 5. Soal 5: Mendengar Kalimat (Rule 10: illustrationRes = 0)
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
    )""",
            f"""    // 6. Soal 6: Pilihan Kalimat
    Exercise(
        id = "u24_s5_p2_q6",
        type = ExerciseType.SENTENCE_CHOICE,
        title = "Pilih terjemahan yang benar",
        targetHanzi = "我们 班 的 同学 都 很 努力。",
        targetPinyin = "Wǒmen bān de tóngxué dōu hěn nǔlì.",
        targetTranslation = "Teman-teman di kelas kami semua sangat rajin.",
        correctAnswer = "Wǒmen bān de tóngxué dōu hěn nǔlì.\\n我们 班 的 同学 都 很 努力。",
        options = listOf(
            "Wǒmen bān de tóngxué dōu hěn nǔlì.\\n我们 班 的 同学 都 很 努力。",
            "Tāmen bān de tóngxué dōu hěn lǎn.\\n他们 班 的 同学 都 很 懒。",
            "Wǒmen bān de tóngxué bù nǔlì.\\n我们 班 的 同学 不 努力。"
        ),
        audioToSpeak = "我们班的同学都很努力。"
    )""",
            f"""    // 7. Soal 7: Pilihan Gambar (错 -> keliru salah)
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
    )""",
            f"""    // 8. Soal 8: Ketik Pinyin (salah/keliru -> cuò)
    Exercise(
        id = "u24_s5_p2_q8",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "salah / keliru",
        sentenceWithBlank = "错 (________)",
        targetHanzi = "错",
        targetPinyin = "cuò",
        correctAnswer = "cuo",
        keyboardKeys = {k5_p2_q8},
        audioToSpeak = "错"
    )""",
            f"""    // 9. Soal 9: Susun Kalimat (Saya sudah paham semua kosakata baru.)
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
    )""",
            f"""    // 10. Soal 10: Ketuk Pasangan yang Sesuai (Grand Review Final Bab 24)
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
    )"""
        ]
    }

    for s_idx in range(1, 6):
        filename = f"{base_dir}/Bab24Stage{s_idx}Data.kt"
        p1_code = ",\n\n".join(stages[s_idx]["p1"])
        p2_code = ",\n\n".join(stages[s_idx]["p2"])
        
        content = f"""package com.example.chineselearning.data.repository

import com.example.chineselearning.R
import com.example.chineselearning.data.model.Exercise
import com.example.chineselearning.data.model.ExerciseType
import com.example.chineselearning.data.model.MatchPairItem
import com.example.chineselearning.data.model.PictureOption

val bab24Stage{s_idx}Part1Exercises = listOf(
{p1_code}
)

val bab24Stage{s_idx}Part2Exercises = listOf(
{p2_code}
)
"""
        with open(filename, "w", encoding="utf-8") as f:
            f.write(content)
        print(f"Written {filename}")

if __name__ == "__main__":
    generate_bab24()
