package com.example.chineselearning.data.repository

import com.example.chineselearning.R
import com.example.chineselearning.data.model.Exercise
import com.example.chineselearning.data.model.ExerciseType
import com.example.chineselearning.data.model.MatchPairItem
import com.example.chineselearning.data.model.PictureOption

val bab17Stage5Part1Exercises = listOf(
    // 1. Soal 1: Pilihan Gambar (爷爷 -> kakek)
    Exercise(
        id = "u17_s5_p1_q1",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "爷爷",
        targetPinyin = "yéye",
        targetTranslation = "kakek",
        correctAnswer = "kakek",
        audioToSpeak = "爷爷",
        pictureOptions = listOf(
            PictureOption("u17_s5_p1_opt1", "kakek", "", R.drawable.ic_fam_grandfather, true),
            PictureOption("u17_s5_p1_opt2", "nenek", "", R.drawable.ic_fam_grandmother, false),
            PictureOption("u17_s5_p1_opt3", "anak", "", R.drawable.ic_fam_child, false),
            PictureOption("u17_s5_p1_opt4", "rumah", "", R.drawable.ic_fam_home, false)
        )
    ),

    // 2. Soal 2: Susun Kalimat (Kakek dan nenek merawat saya sejak kecil.)
    Exercise(
        id = "u17_s5_p1_q2",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Kakek nenek merawat saya sejak kecil.",
        targetHanzi = "爷爷 奶奶 从小 照顾 我。",
        targetPinyin = "Yéye nǎinai cóngxiǎo zhàogù wǒ.",
        wordChips = listOf("爷爷:yéye", "奶奶:nǎinai", "从小:cóngxiǎo", "照顾:zhàogù", "我。:wǒ.", "他们:tāmen"),
        correctAnswer = "爷爷,奶奶,从小,照顾,我。",
        audioToSpeak = "爷爷奶奶从小照顾我。"
    ),

    // 3. Soal 3: Ketuk Pasangan yang Sesuai (Sintesis Evaluasi Bagian 1)
    Exercise(
        id = "u17_s5_p1_m3",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u17_s5_p1_m1", "爷爷", "yéye", "kakek"),
            MatchPairItem("u17_s5_p1_m2", "奶奶", "nǎinai", "nenek"),
            MatchPairItem("u17_s5_p1_m3", "丈夫", "zhàngfu", "suami"),
            MatchPairItem("u17_s5_p1_m4", "妻子", "qīzi", "istri")
        )
    ),

    // 4. Soal 4: Ketik Pinyin (kakek -> yéye)
    Exercise(
        id = "u17_s5_p1_q4",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "kakek",
        sentenceWithBlank = "爷爷 (________)",
        targetHanzi = "爷爷",
        targetPinyin = "yéye",
        correctAnswer = "yeye",
        keyboardKeys = listOf("y", "e", "a", "i", "o", "u", "b", "d", "g", "h", "j", "l"),
        audioToSpeak = "爷爷"
    ),

    // 5. Soal 5: Mendengar Kalimat (Rule 10: illustrationRes = 0)
    Exercise(
        id = "u17_s5_p1_q5",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Apa yang Anda dengar?",
        targetTranslation = "Suami dan istri pergi bersama ke rumah sakit.",
        targetHanzi = "丈夫 和 妻子 一起 去 医院。",
        targetPinyin = "Zhàngfu hé qīzi yìqǐ qù yīyuàn.",
        wordChips = listOf("丈夫:zhàngfu", "和:hé", "妻子:qīzi", "一起:yìqǐ", "去:qù", "医院。:yīyuàn."),
        correctAnswer = "丈夫,和,妻子,一起,去,医院。",
        illustrationRes = 0,
        audioToSpeak = "丈夫和妻子一起去医院。"
    ),

    // 6. Soal 6: Pilihan Kalimat
    Exercise(
        id = "u17_s5_p1_q6",
        type = ExerciseType.SENTENCE_CHOICE,
        title = "Pilih terjemahan yang benar",
        targetHanzi = "那个 男孩儿 是 我 的 弟弟。",
        targetPinyin = "Nàge nánháiér shì wǒ de dìdi.",
        targetTranslation = "Anak laki-laki itu adalah adik laki-laki saya.",
        correctAnswer = "Nàge nánháiér shì wǒ de dìdi.\n那个 男孩儿 是 我 的 弟弟。",
        options = listOf(
            "Nàge nánháiér shì wǒ de dìdi.\n那个 男孩儿 是 我 的 弟弟。",
            "Nàge nǚháiér shì wǒ de mèimei.\n那个 女孩儿 是 我 的 妹妹。",
            "Nàge nánháiér shì wǒ de gēge.\n那个 男孩儿 是 我 的 哥哥。"
        ),
        audioToSpeak = "那个男孩儿是我的弟弟。"
    ),

    // 7. Soal 7: Pilihan Gambar (丈夫 -> suami)
    Exercise(
        id = "u17_s5_p1_q7",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "丈夫",
        targetPinyin = "zhàngfu",
        targetTranslation = "suami",
        correctAnswer = "suami",
        audioToSpeak = "丈夫",
        pictureOptions = listOf(
            PictureOption("u17_s5_p1_opt7_1", "suami", "", R.drawable.ic_work_gentleman, true),
            PictureOption("u17_s5_p1_opt7_2", "istri", "", R.drawable.ic_work_lady, false),
            PictureOption("u17_s5_p1_opt7_3", "anak", "", R.drawable.ic_fam_child, false),
            PictureOption("u17_s5_p1_opt7_4", "rumah", "", R.drawable.ic_fam_home, false)
        )
    ),

    // 8. Soal 8: Ketik Pinyin (suami -> zhàngfu)
    Exercise(
        id = "u17_s5_p1_q8",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "suami",
        sentenceWithBlank = "丈夫 (________)",
        targetHanzi = "丈夫",
        targetPinyin = "zhàngfu",
        correctAnswer = "zhangfu",
        keyboardKeys = listOf("z", "h", "a", "n", "g", "f", "u", "e", "i", "o", "b", "d"),
        audioToSpeak = "丈夫"
    ),

    // 9. Soal 9: Susun Kalimat (Gadis cilik itu bernyanyi sangat bagus.)
    Exercise(
        id = "u17_s5_p1_q9",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Gadis cilik itu menyanyi merdu.",
        targetHanzi = "小 女孩儿 唱歌 很 好听。",
        targetPinyin = "Xiǎo nǚháiér chànggē hěn hǎotīng.",
        wordChips = listOf("小:xiǎo", "女孩儿:nǚháiér", "唱歌:chànggē", "很:hěn", "好听。:hǎotīng.", "男孩儿:nánháiér"),
        correctAnswer = "小,女孩儿,唱歌,很,好听。",
        audioToSpeak = "小女孩儿唱歌很好听。"
    ),

    // 10. Soal 10: Ketuk Pasangan yang Sesuai (Rangkuman Sintesis 1)
    Exercise(
        id = "u17_s5_p1_m10",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u17_s5_p1_m10_1", "男孩儿", "nánháiér", "anak laki-laki"),
            MatchPairItem("u17_s5_p1_m10_2", "女孩儿", "nǚháiér", "anak perempuan"),
            MatchPairItem("u17_s5_p1_m10_3", "唱歌", "chànggē", "menyanyi"),
            MatchPairItem("u17_s5_p1_m10_4", "好听", "hǎotīng", "merdu")
        )
    )
)

val bab17Stage5Part2Exercises = listOf(
    // 1. Soal 1: Pilihan Gambar (自己 -> diri sendiri)
    Exercise(
        id = "u17_s5_p2_q1",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "自己",
        targetPinyin = "zìjǐ",
        targetTranslation = "diri sendiri",
        correctAnswer = "diri sendiri",
        audioToSpeak = "自己",
        pictureOptions = listOf(
            PictureOption("u17_s5_p2_opt1", "diri sendiri", "", R.drawable.ic_person_saya, true),
            PictureOption("u17_s5_p2_opt2", "banyak orang", "", R.drawable.ic_people_group, false),
            PictureOption("u17_s5_p2_opt3", "teman", "", R.drawable.ic_two_friends, false),
            PictureOption("u17_s5_p2_opt4", "rumah", "", R.drawable.ic_fam_home, false)
        )
    ),

    // 2. Soal 2: Susun Kalimat (Hari ini ulang tahun kakek, kami sangat senang.)
    Exercise(
        id = "u17_s5_p2_q2",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Hari ini ulang tahun kakek.",
        targetHanzi = "今天 是 爷爷 的 生日。",
        targetPinyin = "Jīntiān shì yéye de shēngrì.",
        wordChips = listOf("今天:jīntiān", "是:shì", "爷爷:yéye", "的:de", "生日。:shēngrì.", "奶奶:nǎinai"),
        correctAnswer = "今天,是,爷爷,的,生日。",
        audioToSpeak = "今天是爷爷的生日。"
    ),

    // 3. Soal 3: Ketuk Pasangan yang Sesuai (Grand Sintesis Bab 17)
    Exercise(
        id = "u17_s5_p2_m3",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u17_s5_p2_m1", "从小", "cóngxiǎo", "sejak kecil"),
            MatchPairItem("u17_s5_p2_m2", "小时候", "xiǎoshíhou", "waktu kecil"),
            MatchPairItem("u17_s5_p2_m3", "姓名", "xìngmíng", "nama lengkap"),
            MatchPairItem("u17_s5_p2_m4", "自己", "zìjǐ", "diri sendiri")
        )
    ),

    // 4. Soal 4: Ketik Pinyin (diri sendiri -> zìjǐ)
    Exercise(
        id = "u17_s5_p2_q4",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "diri sendiri",
        sentenceWithBlank = "自己 (________)",
        targetHanzi = "自己",
        targetPinyin = "zìjǐ",
        correctAnswer = "ziji",
        keyboardKeys = listOf("z", "i", "j", "a", "e", "o", "u", "b", "d", "g", "h", "l"),
        audioToSpeak = "自己"
    ),

    // 5. Soal 5: Mendengar Kalimat (Rule 10: illustrationRes = 0)
    Exercise(
        id = "u17_s5_p2_q5",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Apa yang Anda dengar?",
        targetTranslation = "Selamat ulang tahun untukmu!",
        targetHanzi = "祝 你 生日 快乐！",
        targetPinyin = "Zhù nǐ shēngrì kuàilè!",
        wordChips = listOf("祝:zhù", "你:nǐ", "生日:shēngrì", "快乐！:kuàilè!", "高兴:gāoxìng"),
        correctAnswer = "祝,你,生日,快乐！",
        illustrationRes = 0,
        audioToSpeak = "祝你生日快乐！"
    ),

    // 6. Soal 6: Pilihan Kalimat
    Exercise(
        id = "u17_s5_p2_q6",
        type = ExerciseType.SENTENCE_CHOICE,
        title = "Pilih terjemahan yang benar",
        targetHanzi = "我 认识 一 名 好 医生。",
        targetPinyin = "Wǒ rènshi yì míng hǎo yīshēng.",
        targetTranslation = "Saya mengenal seorang dokter yang baik.",
        correctAnswer = "Wǒ rènshi yì míng hǎo yīshēng.\n我 认识 一 名 好 医生。",
        options = listOf(
            "Wǒ rènshi yì míng hǎo yīshēng.\n我 认识 一 名 好 医生。",
            "Tā rènshi yì míng hǎo lǎoshī.\n他 认识 一 名 好 老师。",
            "Wǒ bú rènshi zhè wèi yīshēng.\n我 不 认识 这 位 医生。"
        ),
        audioToSpeak = "我认识一名好医生。"
    ),

    // 7. Soal 7: Pilihan Gambar (生日 -> ulang tahun)
    Exercise(
        id = "u17_s5_p2_q7",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "生日",
        targetPinyin = "shēngrì",
        targetTranslation = "ulang tahun",
        correctAnswer = "ulang tahun",
        audioToSpeak = "生日",
        pictureOptions = listOf(
            PictureOption("u17_s5_p2_opt7_1", "ulang tahun", "", R.drawable.ic_birthday_cake, true),
            PictureOption("u17_s5_p2_opt7_2", "orang", "", R.drawable.ic_person_saya, false),
            PictureOption("u17_s5_p2_opt7_3", "rumah", "", R.drawable.ic_fam_home, false),
            PictureOption("u17_s5_p2_opt7_4", "kursi", "", R.drawable.ic_fam_chair, false)
        )
    ),

    // 8. Soal 8: Ketik Pinyin (ulang tahun -> shēngrì)
    Exercise(
        id = "u17_s5_p2_q8",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "hari ulang tahun",
        sentenceWithBlank = "生日 (________)",
        targetHanzi = "生日",
        targetPinyin = "shēngrì",
        correctAnswer = "shengri",
        keyboardKeys = listOf("s", "h", "e", "n", "g", "r", "i", "a", "o", "u", "b", "d"),
        audioToSpeak = "生日"
    ),

    // 9. Soal 9: Susun Kalimat (Kita semua harus menyayangi keluarga sendiri.)
    Exercise(
        id = "u17_s5_p2_q9",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Kita harus sayang keluarga sendiri.",
        targetHanzi = "我们 要 爱 自己 的 家人。",
        targetPinyin = "Wǒmen yào ài zìjǐ de jiārén.",
        wordChips = listOf("我们:wǒmen", "要:yào", "爱:ài", "自己:zìjǐ", "的:de", "家人。:jiārén.", "朋友:péngyou"),
        correctAnswer = "我们,要,爱,自己,的,家人。",
        audioToSpeak = "我们要爱自己的家人。"
    ),

    // 10. Soal 10: Ketuk Pasangan yang Sesuai (Rangkuman Grand Review Bab 17)
    Exercise(
        id = "u17_s5_p2_m10",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u17_s5_p2_m10_1", "爱家人", "ài jiārén", "sayang keluarga"),
            MatchPairItem("u17_s5_p2_m10_2", "两名医生", "liǎng míng yīshēng", "dua orang dokter"),
            MatchPairItem("u17_s5_p2_m10_3", "生日快乐", "shēngrì kuàilè", "selamat ultah"),
            MatchPairItem("u17_s5_p2_m10_4", "做饭好吃", "zuòfàn hǎochī", "masakan enak")
        )
    )
)
