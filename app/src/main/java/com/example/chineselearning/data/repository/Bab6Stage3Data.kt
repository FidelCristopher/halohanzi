package com.example.chineselearning.data.repository

import com.example.chineselearning.R
import com.example.chineselearning.data.model.Exercise
import com.example.chineselearning.data.model.ExerciseType
import com.example.chineselearning.data.model.MatchPairItem
import com.example.chineselearning.data.model.PictureOption

val bab6Stage3Part1Exercises = listOf(
    // 1. Soal 1: Pilihan Gambar (家 -> rumah / keluarga)
    Exercise(
        id = "u6_s3_p1_q1",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "家",
        targetPinyin = "jiā",
        targetTranslation = "rumah / keluarga",
        correctAnswer = "rumah / keluarga",
        audioToSpeak = "家",
        pictureOptions = listOf(
            PictureOption("u6_s3_p1_opt1", "rumah / keluarga", "", R.drawable.ic_fam_home, true),
            PictureOption("u6_s3_p1_opt2", "ayah", "", R.drawable.ic_fam_father, false),
            PictureOption("u6_s3_p1_opt3", "kamar", "", R.drawable.ic_fam_room, false),
            PictureOption("u6_s3_p1_opt4", "kursi", "", R.drawable.ic_fam_chair, false)
        )
    ),

    // 2. Soal 2: Susun Kalimat (Saya sangat menyayangi keluarga saya.)
    Exercise(
        id = "u6_s3_p1_q2",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Saya sangat menyayangi keluarga saya.",
        targetHanzi = "我 很 爱 我 家人。",
        targetPinyin = "Wǒ hěn ài wǒ jiārén.",
        wordChips = listOf("我:wǒ", "很:hěn", "爱:ài", "我:wǒ", "家人:jiārén", "朋友:péngyou"),
        correctAnswer = "我,很,爱,我,家人",
        audioToSpeak = "我很爱我家人。"
    ),

    // 3. Soal 3: Ketuk Pasangan yang Sesuai (Rumah & Keluarga)
    Exercise(
        id = "u6_s3_p1_q3",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u6_s3_p1_m1", "家", "jiā", "rumah / keluarga"),
            MatchPairItem("u6_s3_p1_m2", "家人", "jiārén", "anggota keluarga"),
            MatchPairItem("u6_s3_p1_m3", "回家", "huíjiā", "pulang ke rumah"),
            MatchPairItem("u6_s3_p1_m4", "在家", "zài jiā", "di rumah")
        )
    ),

    // 4. Soal 4: Ketik Pinyin (rumah / keluarga -> jiā)
    Exercise(
        id = "u6_s3_p1_q4",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "rumah / keluarga",
        sentenceWithBlank = "家 (________)",
        targetHanzi = "家",
        targetPinyin = "jiā",
        correctAnswer = "jia",
        keyboardKeys = listOf("j", "i", "a", "e", "o", "u", "b", "d", "g", "h", "l"),
        audioToSpeak = "家"
    ),

    // 5. Soal 5: Mendengar Kalimat (Rule 10: illustrationRes = 0)
    Exercise(
        id = "u6_s3_p1_q5",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Apa yang Anda dengar?",
        targetTranslation = "Dia sedang berada di rumah.",
        targetHanzi = "他 正在 家里。",
        targetPinyin = "Tā zhèngzài jiālǐ.",
        wordChips = listOf("他:tā", "正在:zhèngzài", "家里:jiālǐ", "学校:xuéxiào", "我:wǒ"),
        correctAnswer = "他,正在,家里",
        illustrationRes = 0,
        audioToSpeak = "他正在家里。"
    ),

    // 6. Soal 6: Pilihan Kalimat
    Exercise(
        id = "u6_s3_p1_q6",
        type = ExerciseType.SENTENCE_CHOICE,
        title = "Pilih terjemahan yang benar",
        targetHanzi = "我们 都 爱 家人。",
        targetPinyin = "Wǒmen dōu ài jiārén.",
        targetTranslation = "Kita semua menyayangi keluarga.",
        correctAnswer = "Wǒmen dōu ài jiārén.\n我们 都 爱 家人。",
        options = listOf(
            "Wǒmen dōu ài jiārén.\n我们 都 爱 家人。",
            "Tāmen dōu ài jiārén.\n他们 都 爱 家人。",
            "Wǒmen dōu ài péngyou.\n我们 都 爱 朋友。"
        ),
        audioToSpeak = "我们都爱家人。"
    ),

    // 7. Soal 7: Pilihan Gambar (家人 -> anggota keluarga)
    Exercise(
        id = "u6_s3_p1_q7",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "家人",
        targetPinyin = "jiārén",
        targetTranslation = "anggota keluarga",
        correctAnswer = "anggota keluarga",
        audioToSpeak = "家人",
        pictureOptions = listOf(
            PictureOption("u6_s3_p1_opt7_1", "anggota keluarga", "", R.drawable.ic_fam_family_group, true),
            PictureOption("u6_s3_p1_opt7_2", "guru", "", R.drawable.ic_teacher_avatar, false),
            PictureOption("u6_s3_p1_opt7_3", "anak", "", R.drawable.ic_fam_child, false),
            PictureOption("u6_s3_p1_opt7_4", "teman", "", R.drawable.ic_two_friends, false)
        )
    ),

    // 8. Soal 8: Ketik Pinyin (anggota keluarga -> jiārén)
    Exercise(
        id = "u6_s3_p1_q8",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "anggota keluarga",
        sentenceWithBlank = "家人 (________)",
        targetHanzi = "家人",
        targetPinyin = "jiārén",
        correctAnswer = "jiaren",
        keyboardKeys = listOf("j", "i", "a", "r", "e", "n", "o", "u", "b", "d", "g"),
        audioToSpeak = "家人"
    ),

    // 9. Soal 9: Susun Kalimat (Saya pulang ke rumah.)
    Exercise(
        id = "u6_s3_p1_q9",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Saya pulang ke rumah jam enam.",
        targetHanzi = "我 六 点 回家。",
        targetPinyin = "Wǒ liù diǎn huíjiā.",
        wordChips = listOf("我:wǒ", "六:liù", "点:diǎn", "回家:huíjiā", "去:qù", "学校:xuéxiào"),
        correctAnswer = "我,六,点,回家",
        audioToSpeak = "我六点回家。"
    ),

    // 10. Soal 10: Ketuk Pasangan yang Sesuai (Rangkuman Rumah)
    Exercise(
        id = "u6_s3_p1_m10_1",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u6_s3_p1_m10_1", "家人", "jiārén", "anggota keluarga"),
            MatchPairItem("u6_s3_p1_m10_2", "我家", "wǒjiā", "keluarga / rumah saya"),
            MatchPairItem("u6_s3_p1_m10_3", "爱家人", "ài jiārén", "sayang keluarga"),
            MatchPairItem("u6_s3_p1_m10_4", "回家", "huíjiā", "pulang rumah")
        )
    )
)

val bab6Stage3Part2Exercises = listOf(
    // 1. Soal 1: Pilihan Gambar (住 -> tinggal / menetap)
    Exercise(
        id = "u6_s3_p2_q1",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "住",
        targetPinyin = "zhù",
        targetTranslation = "tinggal / menetap",
        correctAnswer = "tinggal / menetap",
        audioToSpeak = "住",
        pictureOptions = listOf(
            PictureOption("u6_s3_p2_opt1", "tinggal / menetap", "", R.drawable.ic_fam_home, true),
            PictureOption("u6_s3_p2_opt2", "duduk", "", R.drawable.ic_fam_sit, false),
            PictureOption("u6_s3_p2_opt3", "makan", "", R.drawable.ic_action_eat, false),
            PictureOption("u6_s3_p2_opt4", "tidur", "", R.drawable.ic_action_sleep, false)
        )
    ),

    // 2. Soal 2: Susun Kalimat (Kamu tinggal di mana?)
    Exercise(
        id = "u6_s3_p2_q2",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Kamu tinggal di mana?",
        targetHanzi = "你 住 在 哪儿？",
        targetPinyin = "Nǐ zhù zài nǎr?",
        wordChips = listOf("你:nǐ", "住:zhù", "在:zài", "哪儿:nǎr", "他:tā", "北京:Běijīng"),
        correctAnswer = "你,住,在,哪儿",
        audioToSpeak = "你住在哪儿？"
    ),

    // 3. Soal 3: Ketuk Pasangan yang Sesuai (Tinggal & Tempat)
    Exercise(
        id = "u6_s3_p2_q3",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u6_s3_p2_m1", "住", "zhù", "tinggal"),
            MatchPairItem("u6_s3_p2_m2", "住在", "zhù zài", "tinggal di"),
            MatchPairItem("u6_s3_p2_m3", "哪儿", "nǎr", "di mana"),
            MatchPairItem("u6_s3_p2_m4", "北京", "Běijīng", "Beijing")
        )
    ),

    // 4. Soal 4: Ketik Pinyin (tinggal -> zhù)
    Exercise(
        id = "u6_s3_p2_q4",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "tinggal / menetap",
        sentenceWithBlank = "住 (________)",
        targetHanzi = "住",
        targetPinyin = "zhù",
        correctAnswer = "zhu",
        keyboardKeys = listOf("z", "h", "u", "a", "e", "i", "o", "b", "d", "g", "j"),
        audioToSpeak = "住"
    ),

    // 5. Soal 5: Mendengar Kalimat (Rule 10: illustrationRes = 0)
    Exercise(
        id = "u6_s3_p2_q5",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Apa yang Anda dengar?",
        targetTranslation = "Saya dan keluarga tinggal di Beijing.",
        targetHanzi = "我 和 家人 住 在 北京。",
        targetPinyin = "Wǒ hé jiārén zhù zài Běijīng.",
        wordChips = listOf("我:wǒ", "和:hé", "家人:jiārén", "住:zhù", "在:zài", "北京:Běijīng"),
        correctAnswer = "我,和,家人,住,在,北京",
        illustrationRes = 0,
        audioToSpeak = "我和家人住在北京。"
    ),

    // 6. Soal 6: Pilihan Kalimat
    Exercise(
        id = "u6_s3_p2_q6",
        type = ExerciseType.SENTENCE_CHOICE,
        title = "Pilih terjemahan yang benar",
        targetHanzi = "他 住 在 中国。",
        targetPinyin = "Tā zhù zài Zhōngguó.",
        targetTranslation = "Dia tinggal di Tiongkok.",
        correctAnswer = "Tā zhù zài Zhōngguó.\n他 住 在 中国。",
        options = listOf(
            "Tā zhù zài Zhōngguó.\n他 住 在 中国。",
            "Wǒ zhù zài Zhōngguó.\n我 住 在 中国。",
            "Tā qù Zhōngguó.\n他 去 中国。"
        ),
        audioToSpeak = "他住在中国。"
    ),

    // 7. Soal 7: Pilihan Gambar (住在 -> tinggal di)
    Exercise(
        id = "u6_s3_p2_q7",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "住在",
        targetPinyin = "zhù zài",
        targetTranslation = "tinggal di",
        correctAnswer = "tinggal di",
        audioToSpeak = "住在",
        pictureOptions = listOf(
            PictureOption("u6_s3_p2_opt7_1", "tinggal di", "", R.drawable.ic_fam_home, true),
            PictureOption("u6_s3_p2_opt7_2", "tidur", "", R.drawable.ic_action_sleep, false),
            PictureOption("u6_s3_p2_opt7_3", "makan", "", R.drawable.ic_action_eat, false),
            PictureOption("u6_s3_p2_opt7_4", "beristirahat", "", R.drawable.ic_action_rest, false)
        )
    ),

    // 8. Soal 8: Ketik Pinyin (tinggal di -> zhù zài)
    Exercise(
        id = "u6_s3_p2_q8",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "tinggal di",
        sentenceWithBlank = "住在 (________)",
        targetHanzi = "住在",
        targetPinyin = "zhùzài",
        correctAnswer = "zhuzai",
        keyboardKeys = listOf("z", "h", "u", "a", "i", "e", "o", "b", "d", "g", "j"),
        audioToSpeak = "住在"
    ),

    // 9. Soal 9: Susun Kalimat (Guru Wang tinggal di sekolah.)
    Exercise(
        id = "u6_s3_p2_q9",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Guru Wang tinggal di sekolah.",
        targetHanzi = "王老师 住 在 学校。",
        targetPinyin = "Wáng lǎoshī zhù zài xuéxiào.",
        wordChips = listOf("王老师:Wáng lǎoshī", "住:zhù", "在:zài", "学校:xuéxiào", "家里:jiālǐ", "北京:Běijīng"),
        correctAnswer = "王老师,住,在,学校",
        audioToSpeak = "王老师住在学校。"
    ),

    // 10. Soal 10: Ketuk Pasangan yang Sesuai (Rangkuman Tempat Tinggal)
    Exercise(
        id = "u6_s3_p2_m10_1",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u6_s3_p2_m10_1", "住在北京", "zhù zài Běijīng", "tinggal di Beijing"),
            MatchPairItem("u6_s3_p2_m10_2", "住在学校", "zhù zài xuéxiào", "tinggal di sekolah"),
            MatchPairItem("u6_s3_p2_m10_3", "住在哪儿", "zhù zài nǎr", "tinggal di mana"),
            MatchPairItem("u6_s3_p2_m10_4", "家人", "jiārén", "anggota keluarga")
        )
    )
)
