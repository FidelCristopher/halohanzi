package com.example.chineselearning.data.repository

import com.example.chineselearning.R
import com.example.chineselearning.data.model.Exercise
import com.example.chineselearning.data.model.ExerciseType
import com.example.chineselearning.data.model.MatchPairItem
import com.example.chineselearning.data.model.PictureOption

val bab6Stage6Part1Exercises = listOf(
    // 1. Soal 1: Pilihan Gambar (家 -> rumah / keluarga)
    Exercise(
        id = "u6_s6_p1_q1",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "家",
        targetPinyin = "jiā",
        targetTranslation = "rumah / keluarga",
        correctAnswer = "rumah / keluarga",
        audioToSpeak = "家",
        pictureOptions = listOf(
            PictureOption("u6_s6_p1_opt1", "rumah / keluarga", "", R.drawable.ic_fam_home, true),
            PictureOption("u6_s6_p1_opt2", "ayah", "", R.drawable.ic_fam_father, false),
            PictureOption("u6_s6_p1_opt3", "kamar", "", R.drawable.ic_fam_room, false),
            PictureOption("u6_s6_p1_opt4", "kursi", "", R.drawable.ic_fam_chair, false)
        )
    ),

    // 2. Soal 2: Susun Kalimat (Keluarga saya ada lima orang.)
    Exercise(
        id = "u6_s6_p1_q2",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Keluarga saya ada lima orang.",
        targetHanzi = "我家 有 五 口 人。",
        targetPinyin = "Wǒjiā yǒu wǔ kǒu rén.",
        wordChips = listOf("我家:wǒjiā", "有:yǒu", "五:wǔ", "口:kǒu", "人:rén", "四:sì", "个:gè"),
        correctAnswer = "我家,有,五,口,人",
        audioToSpeak = "我家有五口人。"
    ),

    // 3. Soal 3: Ketuk Pasangan yang Sesuai (Rangkuman Bab 6 Bagian 1)
    Exercise(
        id = "u6_s6_p1_q3",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u6_s6_p1_m1", "爸爸", "bàba", "ayah"),
            MatchPairItem("u6_s6_p1_m2", "妈妈", "māma", "ibu"),
            MatchPairItem("u6_s6_p1_m3", "儿子", "érzi", "anak laki-laki"),
            MatchPairItem("u6_s6_p1_m4", "女儿", "nǚ'ér", "anak perempuan")
        )
    ),

    // 4. Soal 4: Ketik Pinyin (anggota keluarga -> jiārén)
    Exercise(
        id = "u6_s6_p1_q4",
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

    // 5. Soal 5: Mendengar Kalimat (Rule 10: illustrationRes = 0)
    Exercise(
        id = "u6_s6_p1_q5",
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
        id = "u6_s6_p1_q6",
        type = ExerciseType.SENTENCE_CHOICE,
        title = "Pilih terjemahan yang benar",
        targetHanzi = "房间 里 有 桌子 和 椅子。",
        targetPinyin = "Fángjiān lǐ yǒu zhuōzi hé yǐzi.",
        targetTranslation = "Di dalam kamar ada meja dan kursi.",
        correctAnswer = "Fángjiān lǐ yǒu zhuōzi hé yǐzi.\n房间 里 有 桌子 和 椅子。",
        options = listOf(
            "Fángjiān lǐ yǒu zhuōzi hé yǐzi.\n房间 里 有 桌子 和 椅子。",
            "Jiā lǐ yǒu zhuōzi hé yǐzi.\n家 里 有 桌子 和 椅子。",
            "Fángjiān lǐ yǒu shū hé bǐ.\n房间 里 有 书 和 笔。"
        ),
        audioToSpeak = "房间里有桌子和椅子。"
    ),

    // 7. Soal 7: Pilihan Gambar (房间 -> kamar)
    Exercise(
        id = "u6_s6_p1_q7",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "房间",
        targetPinyin = "fángjiān",
        targetTranslation = "kamar / ruangan",
        correctAnswer = "kamar / ruangan",
        audioToSpeak = "房间",
        pictureOptions = listOf(
            PictureOption("u6_s6_p1_opt7_1", "kamar / ruangan", "", R.drawable.ic_fam_room, true),
            PictureOption("u6_s6_p1_opt7_2", "meja", "", R.drawable.ic_fam_table, false),
            PictureOption("u6_s6_p1_opt7_3", "kursi", "", R.drawable.ic_fam_chair, false),
            PictureOption("u6_s6_p1_opt7_4", "anggota keluarga", "", R.drawable.ic_fam_family_group, false)
        )
    ),

    // 8. Soal 8: Ketik Pinyin (kamar -> fángjiān)
    Exercise(
        id = "u6_s6_p1_q8",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "kamar / ruangan",
        sentenceWithBlank = "房间 (________)",
        targetHanzi = "房间",
        targetPinyin = "fángjiān",
        correctAnswer = "fangjian",
        keyboardKeys = listOf("f", "a", "n", "g", "j", "i", "e", "o", "u", "b", "d"),
        audioToSpeak = "房间"
    ),

    // 9. Soal 9: Susun Kalimat (Adik perempuan saya sangat cantik.)
    Exercise(
        id = "u6_s6_p1_q9",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Adik perempuan saya berumur delapan tahun.",
        targetHanzi = "我 妹妹 八 岁。",
        targetPinyin = "Wǒ mèimei bā suì.",
        wordChips = listOf("我:wǒ", "妹妹:mèimei", "八:bā", "岁:suì", "弟弟:dìdi", "九:jiǔ"),
        correctAnswer = "我,妹妹,八,岁",
        audioToSpeak = "我妹妹八岁。"
    ),

    // 10. Soal 10: Ketuk Pasangan yang Sesuai (Rangkuman Perabot & Ruang)
    Exercise(
        id = "u6_s6_p1_m10_1",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u6_s6_p1_m10_1", "房间", "fángjiān", "kamar"),
            MatchPairItem("u6_s6_p1_m10_2", "桌子", "zhuōzi", "meja"),
            MatchPairItem("u6_s6_p1_m10_3", "椅子", "yǐzi", "kursi"),
            MatchPairItem("u6_s6_p1_m10_4", "住", "zhù", "tinggal")
        )
    )
)

val bab6Stage6Part2Exercises = listOf(
    // 1. Soal 1: Pilihan Gambar (桌子 -> meja)
    Exercise(
        id = "u6_s6_p2_q1",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "桌子",
        targetPinyin = "zhuōzi",
        targetTranslation = "meja",
        correctAnswer = "meja",
        audioToSpeak = "桌子",
        pictureOptions = listOf(
            PictureOption("u6_s6_p2_opt1", "meja", "", R.drawable.ic_fam_table, true),
            PictureOption("u6_s6_p2_opt2", "kursi", "", R.drawable.ic_fam_chair, false),
            PictureOption("u6_s6_p2_opt3", "kamar", "", R.drawable.ic_fam_room, false),
            PictureOption("u6_s6_p2_opt4", "rumah", "", R.drawable.ic_fam_home, false)
        )
    ),

    // 2. Soal 2: Susun Kalimat (Kakak laki-laki saya seorang guru.)
    Exercise(
        id = "u6_s6_p2_q2",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Kakak laki-laki saya adalah seorang guru.",
        targetHanzi = "我 哥哥 是 老师。",
        targetPinyin = "Wǒ gēge shì lǎoshī.",
        wordChips = listOf("我:wǒ", "哥哥:gēge", "是:shì", "老师:lǎoshī", "学生:xuéshēng", "弟弟:dìdi"),
        correctAnswer = "我,哥哥,是,老师",
        audioToSpeak = "我哥哥是老师。"
    ),

    // 3. Soal 3: Ketuk Pasangan yang Sesuai (Rangkuman Akhir Bab 6)
    Exercise(
        id = "u6_s6_p2_m3",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u6_s6_p2_m1", "家", "jiā", "rumah"),
            MatchPairItem("u6_s6_p2_m2", "家人", "jiārén", "keluarga"),
            MatchPairItem("u6_s6_p2_m3", "孩子", "háizi", "anak"),
            MatchPairItem("u6_s6_p2_m4", "岁", "suì", "tahun umur")
        )
    ),

    // 4. Soal 4: Ketik Pinyin (meja -> zhuōzi)
    Exercise(
        id = "u6_s6_p2_q4",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "meja",
        sentenceWithBlank = "桌子 (________)",
        targetHanzi = "桌子",
        targetPinyin = "zhuōzi",
        correctAnswer = "zhuozi",
        keyboardKeys = listOf("z", "h", "u", "o", "i", "a", "e", "b", "d", "g", "j"),
        audioToSpeak = "桌子"
    ),

    // 5. Soal 5: Mendengar Kalimat (Rule 10: illustrationRes = 0)
    Exercise(
        id = "u6_s6_p2_q5",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Apa yang Anda dengar?",
        targetTranslation = "Saya punya dua orang anak.",
        targetHanzi = "我 有 两 个 孩子。",
        targetPinyin = "Wǒ yǒu liǎng gè háizi.",
        wordChips = listOf("我:wǒ", "有:yǒu", "两:liǎng", "个:gè", "孩子:háizi", "三:sān"),
        correctAnswer = "我,有,两,个,孩子",
        illustrationRes = 0,
        audioToSpeak = "我有两个孩子。"
    ),

    // 6. Soal 6: Pilihan Kalimat
    Exercise(
        id = "u6_s6_p2_q6",
        type = ExerciseType.SENTENCE_CHOICE,
        title = "Pilih terjemahan yang benar",
        targetHanzi = "他 坐 在 椅子 上。",
        targetPinyin = "Tā zuò zài yǐzi shang.",
        targetTranslation = "Dia duduk di kursi.",
        correctAnswer = "Tā zuò zài yǐzi shang.\n他 坐 在 椅子 上。",
        options = listOf(
            "Tā zuò zài yǐzi shang.\n他 坐 在 椅子 上。",
            "Wǒ zuò zài yǐzi shang.\n我 坐 在 椅子 上。",
            "Tā zuò zài zhuōzi shang.\n他 坐 在 桌子 上。"
        ),
        audioToSpeak = "他坐在椅子上。"
    ),

    // 7. Soal 7: Pilihan Gambar (孩子 -> anak)
    Exercise(
        id = "u6_s6_p2_q7",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "孩子",
        targetPinyin = "háizi",
        targetTranslation = "anak",
        correctAnswer = "anak",
        audioToSpeak = "孩子",
        pictureOptions = listOf(
            PictureOption("u6_s6_p2_opt7_1", "anak", "", R.drawable.ic_fam_child, true),
            PictureOption("u6_s6_p2_opt7_2", "guru", "", R.drawable.ic_teacher_avatar, false),
            PictureOption("u6_s6_p2_opt7_3", "ibu", "", R.drawable.ic_fam_mother, false),
            PictureOption("u6_s6_p2_opt7_4", "rumah", "", R.drawable.ic_fam_home, false)
        )
    ),

    // 8. Soal 8: Ketik Pinyin (anak -> háizi)
    Exercise(
        id = "u6_s6_p2_q8",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "anak",
        sentenceWithBlank = "孩子 (________)",
        targetHanzi = "孩子",
        targetPinyin = "háizi",
        correctAnswer = "haizi",
        keyboardKeys = listOf("h", "a", "i", "z", "e", "o", "u", "b", "d", "g", "j"),
        audioToSpeak = "孩子"
    ),

    // 9. Soal 9: Susun Kalimat (Grand Evaluasi Bab 6)
    Exercise(
        id = "u6_s6_p2_q9",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Keluarga saya tinggal di Beijing.",
        targetHanzi = "我 家人 住 在 北京。",
        targetPinyin = "Wǒ jiārén zhù zài Běijīng.",
        wordChips = listOf("我:wǒ", "家人:jiārén", "住:zhù", "在:zài", "北京:Běijīng", "学校:xuéxiào"),
        correctAnswer = "我,家人,住,在,北京",
        audioToSpeak = "我家人住在北京。"
    ),

    // 10. Soal 10: Ketuk Pasangan yang Sesuai (Grand Review Bab 6)
    Exercise(
        id = "u6_s6_p2_m10_1",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u6_s6_p2_m10_1", "住在北京", "zhù zài Běijīng", "tinggal di Beijing"),
            MatchPairItem("u6_s6_p2_m10_2", "桌子和椅子", "zhuōzi hé yǐzi", "meja dan kursi"),
            MatchPairItem("u6_s6_p2_m10_3", "四口人", "sì kǒu rén", "empat orang"),
            MatchPairItem("u6_s6_p2_m10_4", "爱家人", "ài jiārén", "sayang keluarga")
        )
    )
)
