package com.example.chineselearning.data.repository

import com.example.chineselearning.R
import com.example.chineselearning.data.model.Exercise
import com.example.chineselearning.data.model.ExerciseType
import com.example.chineselearning.data.model.MatchPairItem
import com.example.chineselearning.data.model.PictureOption

val bab12Stage5Part1Exercises = listOf(
    // 1. Soal 1: Pilihan Gambar (公司 -> perusahaan)
    Exercise(
        id = "u12_s5_p1_q1",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "公司",
        targetPinyin = "gōngsī",
        targetTranslation = "perusahaan",
        correctAnswer = "perusahaan",
        audioToSpeak = "公司",
        pictureOptions = listOf(
            PictureOption("u12_s5_p1_opt1", "perusahaan", "", R.drawable.ic_work_office_building, true),
            PictureOption("u12_s5_p1_opt2", "sekolah", "", R.drawable.ic_edu_school, false),
            PictureOption("u12_s5_p1_opt3", "rumah", "", R.drawable.ic_fam_home, false),
            PictureOption("u12_s5_p1_opt4", "buku", "", R.drawable.ic_book_chinese, false)
        )
    ),

    // 2. Soal 2: Susun Kalimat (Saya bekerja di perusahaan Tuan Wang.)
    Exercise(
        id = "u12_s5_p1_q2",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Saya kerja di perusahaan Tuan Wang.",
        targetHanzi = "我 在 王 先生 的 公司 工作。",
        targetPinyin = "Wǒ zài Wáng xiānsheng de gōngsī gōngzuò.",
        wordChips = listOf("我:wǒ", "在:zài", "王:Wáng", "先生:xiānsheng", "的:de", "公司:gōngsī", "工作:gōngzuò"),
        correctAnswer = "我,在,王,先生,的,公司,工作",
        audioToSpeak = "我在王先生的公司工作。"
    ),

    // 3. Soal 3: Ketuk Pasangan yang Sesuai (Rangkuman Bab 12 Bagian 1)
    Exercise(
        id = "u12_s5_p1_q3",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u12_s5_p1_m1", "工作", "gōngzuò", "bekerja"),
            MatchPairItem("u12_s5_p1_m2", "公司", "gōngsī", "perusahaan"),
            MatchPairItem("u12_s5_p1_m3", "先生", "xiānsheng", "tuan / bapak"),
            MatchPairItem("u12_s5_p1_m4", "女士", "nǚshì", "nyonya / nona")
        )
    ),

    // 4. Soal 4: Ketik Pinyin (bekerja -> gōngzuò)
    Exercise(
        id = "u12_s5_p1_q4",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "bekerja / pekerjaan",
        sentenceWithBlank = "工作 (________)",
        targetHanzi = "工作",
        targetPinyin = "gōngzuò",
        correctAnswer = "gongzuo",
        keyboardKeys = listOf("g", "o", "n", "z", "u", "a", "e", "i", "b", "d", "h"),
        audioToSpeak = "工作"
    ),

    // 5. Soal 5: Mendengar Kalimat (Rule 10: illustrationRes = 0)
    Exercise(
        id = "u12_s5_p1_q5",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Apa yang Anda dengar?",
        targetTranslation = "Komputer ada di atas meja.",
        targetHanzi = "电脑 在 桌子 上。",
        targetPinyin = "Diànnǎo zài zhuōzi shang.",
        wordChips = listOf("电脑:diànnǎo", "在:zài", "桌子:zhuōzi", "上:shang", "椅子:yǐzi"),
        correctAnswer = "电脑,在,桌子,上",
        illustrationRes = 0,
        audioToSpeak = "电脑在桌子上。"
    ),

    // 6. Soal 6: Pilihan Kalimat
    Exercise(
        id = "u12_s5_p1_q6",
        type = ExerciseType.SENTENCE_CHOICE,
        title = "Pilih terjemahan yang benar",
        targetHanzi = "李 女士 在 找 电脑。",
        targetPinyin = "Lǐ nǚshì zài zhǎo diànnǎo.",
        targetTranslation = "Nyonya Li sedang mencari komputer.",
        correctAnswer = "Lǐ nǚshì zài zhǎo diànnǎo.\n李 女士 在 找 电脑。",
        options = listOf(
            "Lǐ nǚshì zài zhǎo diànnǎo.\n李 女士 在 找 电脑。",
            "Wáng xiānsheng zài zhǎo diànnǎo.\n王 先生 在 找 电脑。",
            "Lǐ nǚshì zài zhǎo shū.\n李 女士 在 找 书。"
        ),
        audioToSpeak = "李女士在找电脑。"
    ),

    // 7. Soal 7: Pilihan Gambar (先生 -> tuan / bapak)
    Exercise(
        id = "u12_s5_p1_q7",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "先生",
        targetPinyin = "xiānsheng",
        targetTranslation = "tuan / bapak",
        correctAnswer = "tuan / bapak",
        audioToSpeak = "先生",
        pictureOptions = listOf(
            PictureOption("u12_s5_p1_opt7_1", "tuan / bapak", "", R.drawable.ic_work_gentleman, true),
            PictureOption("u12_s5_p1_opt7_2", "nyonya", "", R.drawable.ic_work_lady, false),
            PictureOption("u12_s5_p1_opt7_3", "murid", "", R.drawable.ic_edu_primary_school, false),
            PictureOption("u12_s5_p1_opt7_4", "sekolah", "", R.drawable.ic_edu_school, false)
        )
    ),

    // 8. Soal 8: Ketik Pinyin (tuan -> xiānsheng)
    Exercise(
        id = "u12_s5_p1_q8",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "tuan / bapak",
        sentenceWithBlank = "先生 (________)",
        targetHanzi = "先生",
        targetPinyin = "xiānsheng",
        correctAnswer = "xiansheng",
        keyboardKeys = listOf("x", "i", "a", "n", "s", "h", "e", "g", "o", "u", "b"),
        audioToSpeak = "先生"
    ),

    // 9. Soal 9: Susun Kalimat (Hari ini pekerjaan sangat sibuk.)
    Exercise(
        id = "u12_s5_p1_q9",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Hari ini pekerjaan sangat sibuk.",
        targetHanzi = "今天 工作 很 忙。",
        targetPinyin = "Jīntiān gōngzuò hěn máng.",
        wordChips = listOf("今天:jīntiān", "工作:gōngzuò", "很:hěn", "忙:máng", "明天:míngtiān"),
        correctAnswer = "今天,工作,很,忙",
        audioToSpeak = "今天工作很忙。"
    ),

    // 10. Soal 10: Ketuk Pasangan yang Sesuai (Rangkuman Kantor)
    Exercise(
        id = "u12_s5_p1_m10_1",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u12_s5_p1_m10_1", "公司", "gōngsī", "perusahaan"),
            MatchPairItem("u12_s5_p1_m10_2", "工作很忙", "gōngzuò hěn máng", "pekerjaan sibuk"),
            MatchPairItem("u12_s5_p1_m10_3", "电脑", "diànnǎo", "komputer"),
            MatchPairItem("u12_s5_p1_m10_4", "找人", "zhǎo rén", "mencari orang")
        )
    )
)

val bab12Stage5Part2Exercises = listOf(
    // 1. Soal 1: Pilihan Gambar (上班 -> masuk kerja)
    Exercise(
        id = "u12_s5_p2_q1",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "上班",
        targetPinyin = "shàngbān",
        targetTranslation = "masuk kerja",
        correctAnswer = "masuk kerja",
        audioToSpeak = "上班",
        pictureOptions = listOf(
            PictureOption("u12_s5_p2_opt1", "masuk kerja", "", R.drawable.ic_work_clock_in, true),
            PictureOption("u12_s5_p2_opt2", "pulang kerja", "", R.drawable.ic_work_clock_out, false),
            PictureOption("u12_s5_p2_opt3", "tidur", "", R.drawable.ic_action_sleep, false),
            PictureOption("u12_s5_p2_opt4", "makan", "", R.drawable.ic_action_eat, false)
        )
    ),

    // 2. Soal 2: Susun Kalimat (Saya jam lima pulang kerja.)
    Exercise(
        id = "u12_s5_p2_q2",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Saya jam lima pulang kerja.",
        targetHanzi = "我 五 点 下班。",
        targetPinyin = "Wǒ wǔ diǎn xiàbān.",
        wordChips = listOf("我:wǒ", "五:wǔ", "点:diǎn", "下班:xiàbān", "上班:shàngbān", "六:liù"),
        correctAnswer = "我,五,点,下班",
        audioToSpeak = "我五点下班。"
    ),

    // 3. Soal 3: Ketuk Pasangan yang Sesuai (Grand Review Bab 12)
    Exercise(
        id = "u12_s5_p2_m3",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u12_s5_p2_m1", "上班", "shàngbān", "masuk kerja"),
            MatchPairItem("u12_s5_p2_m2", "下班", "xiàbān", "pulang kerja"),
            MatchPairItem("u12_s5_p2_m3", "没关系", "méi guānxi", "tidak apa-apa"),
            MatchPairItem("u12_s5_p2_m4", "没事", "méishì", "tidak masalah")
        )
    ),

    // 4. Soal 4: Ketik Pinyin (masuk kerja -> shàngbān)
    Exercise(
        id = "u12_s5_p2_q4",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "masuk kerja",
        sentenceWithBlank = "上班 (________)",
        targetHanzi = "上班",
        targetPinyin = "shàngbān",
        correctAnswer = "shangban",
        keyboardKeys = listOf("s", "h", "a", "n", "g", "b", "e", "i", "o", "u", "d"),
        audioToSpeak = "上班"
    ),

    // 5. Soal 5: Mendengar Kalimat (Rule 10: illustrationRes = 0)
    Exercise(
        id = "u12_s5_p2_q5",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Apa yang Anda dengar?",
        targetTranslation = "Tidak ada masalah, terima kasih Tuan Wang.",
        targetHanzi = "没事， 谢谢 王 先生。",
        targetPinyin = "Méishì, xièxie Wáng xiānsheng.",
        wordChips = listOf("没事，:méishì,", "谢谢:xièxie", "王:Wáng", "先生。:xiānsheng.", "对不起:duìbuqǐ"),
        correctAnswer = "没事，,谢谢,王,先生。",
        illustrationRes = 0,
        audioToSpeak = "没事，谢谢王先生。"
    ),

    // 6. Soal 6: Pilihan Kalimat
    Exercise(
        id = "u12_s5_p2_q6",
        type = ExerciseType.SENTENCE_CHOICE,
        title = "Pilih terjemahan yang benar",
        targetHanzi = "我 给 你 打 电话。",
        targetPinyin = "Wǒ gěi nǐ dǎ diànhuà.",
        targetTranslation = "Saya menelepon kamu.",
        correctAnswer = "Wǒ gěi nǐ dǎ diànhuà.\n我 给 你 打 电话。",
        options = listOf(
            "Wǒ gěi nǐ dǎ diànhuà.\n我 给 你 打 电话。",
            "Tā gěi nǐ dǎ diànhuà.\n他 给 你 打 电话。",
            "Wǒ gěi tā dǎ diànhuà.\n我 给 他 打 电话。"
        ),
        audioToSpeak = "我给你打电话。"
    ),

    // 7. Soal 7: Pilihan Gambar (没关系 -> tidak apa-apa)
    Exercise(
        id = "u12_s5_p2_q7",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "没关系",
        targetPinyin = "méi guānxi",
        targetTranslation = "tidak apa-apa",
        correctAnswer = "tidak apa-apa",
        audioToSpeak = "没关系",
        pictureOptions = listOf(
            PictureOption("u12_s5_p2_opt7_1", "tidak apa-apa", "", R.drawable.ic_work_no_problem, true),
            PictureOption("u12_s5_p2_opt7_2", "terima kasih", "", R.drawable.ic_handshake, false),
            PictureOption("u12_s5_p2_opt7_3", "bekerja", "", R.drawable.ic_work_job, false),
            PictureOption("u12_s5_p2_opt7_4", "sampai jumpa", "", R.drawable.ic_hand_wave, false)
        )
    ),

    // 8. Soal 8: Ketik Pinyin (tidak apa-apa -> méiguānxi)
    Exercise(
        id = "u12_s5_p2_q8",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "tidak apa-apa",
        sentenceWithBlank = "没关系 (________)",
        targetHanzi = "没关系",
        targetPinyin = "méiguānxi",
        correctAnswer = "meiguanxi",
        keyboardKeys = listOf("m", "e", "i", "g", "u", "a", "n", "x", "o", "b", "d"),
        audioToSpeak = "没关系"
    ),

    // 9. Soal 9: Susun Kalimat (Grand Evaluasi Bab 12)
    Exercise(
        id = "u12_s5_p2_q9",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Saya bekerja di perusahaan.",
        targetHanzi = "我 在 公司 工作。",
        targetPinyin = "Wǒ zài gōngsī gōngzuò.",
        wordChips = listOf("我:wǒ", "在:zài", "公司:gōngsī", "工作:gōngzuò", "学校:xuéxiào"),
        correctAnswer = "我,在,公司,工作",
        audioToSpeak = "我在公司工作。"
    ),

    // 10. Soal 10: Ketuk Pasangan yang Sesuai (Grand Review Akhir Bab 12)
    Exercise(
        id = "u12_s5_p2_m10_1",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u12_s5_p2_m10_1", "在公司工作", "zài gōngsī gōngzuò", "kerja di kantor"),
            MatchPairItem("u12_s5_p2_m10_2", "下班回家", "xiàbān huíjiā", "pulang kantor"),
            MatchPairItem("u12_s5_p2_m10_3", "没关系", "méi guānxi", "tidak apa-apa"),
            MatchPairItem("u12_s5_p2_m10_4", "打电话", "dǎ diànhuà", "menelepon")
        )
    )
)
