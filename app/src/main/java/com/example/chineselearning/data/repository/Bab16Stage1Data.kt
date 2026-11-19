package com.example.chineselearning.data.repository

import com.example.chineselearning.R
import com.example.chineselearning.data.model.Exercise
import com.example.chineselearning.data.model.ExerciseType
import com.example.chineselearning.data.model.MatchPairItem
import com.example.chineselearning.data.model.PictureOption

val bab16Stage1Part1Exercises = listOf(
    // 1. Soal 1: Pilihan Gambar (医院 -> rumah sakit)
    Exercise(
        id = "u16_s1_p1_q1",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "医院",
        targetPinyin = "yīyuàn",
        targetTranslation = "rumah sakit",
        correctAnswer = "rumah sakit",
        audioToSpeak = "医院",
        pictureOptions = listOf(
            PictureOption("u16_s1_p1_opt1", "rumah sakit", "", R.drawable.ic_med_hospital, true),
            PictureOption("u16_s1_p1_opt2", "sekolah", "", R.drawable.ic_edu_school, false),
            PictureOption("u16_s1_p1_opt3", "toko", "", R.drawable.ic_shop_store, false),
            PictureOption("u16_s1_p1_opt4", "rumah", "", R.drawable.ic_fam_home, false)
        )
    ),

    // 2. Soal 2: Susun Kalimat (Dia jatuh sakit.)
    Exercise(
        id = "u16_s1_p1_q2",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Dia jatuh sakit.",
        targetHanzi = "他 生病 了。",
        targetPinyin = "Tā shēngbìng le.",
        wordChips = listOf("他:tā", "生病:shēngbìng", "了:le", "好:hǎo", "去:qù"),
        correctAnswer = "他,生病,了",
        audioToSpeak = "他生病了。"
    ),

    // 3. Soal 3: Ketuk Pasangan yang Sesuai (Sakit & Rumah Sakit)
    Exercise(
        id = "u16_s1_p1_q3",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u16_s1_p1_m1", "生病", "shēngbìng", "jatuh sakit"),
            MatchPairItem("u16_s1_p1_m2", "医院", "yīyuàn", "rumah sakit"),
            MatchPairItem("u16_s1_p1_m3", "去医院", "qù yīyuàn", "pergi ke rumah sakit"),
            MatchPairItem("u16_s1_p1_m4", "看病", "kànbìng", "berobat ke dokter")
        )
    ),

    // 4. Soal 4: Ketik Pinyin (jatuh sakit -> shēngbìng)
    Exercise(
        id = "u16_s1_p1_q4",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "jatuh sakit",
        sentenceWithBlank = "生病 (________)",
        targetHanzi = "生病",
        targetPinyin = "shēngbìng",
        correctAnswer = "shengbing",
        keyboardKeys = listOf("s", "h", "e", "n", "g", "b", "i", "a", "o", "u", "d"),
        audioToSpeak = "生病"
    ),

    // 5. Soal 5: Mendengar Kalimat (Rule 10: illustrationRes = 0)
    Exercise(
        id = "u16_s1_p1_q5",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Apa yang Anda dengar?",
        targetTranslation = "Dia pergi ke rumah sakit.",
        targetHanzi = "他 去 医院 了。",
        targetPinyin = "Tā qù yīyuàn le.",
        wordChips = listOf("他:tā", "去:qù", "医院:yīyuàn", "了:le", "学校:xuéxiào"),
        correctAnswer = "他,去,医院,了",
        illustrationRes = 0,
        audioToSpeak = "他去医院了。"
    ),

    // 6. Soal 6: Pilihan Kalimat
    Exercise(
        id = "u16_s1_p1_q6",
        type = ExerciseType.SENTENCE_CHOICE,
        title = "Pilih terjemahan yang benar",
        targetHanzi = "今天 他 生病 了， 不 来 学校。",
        targetPinyin = "Jīntiān tā shēngbìng le, bù lái xuéxiào.",
        targetTranslation = "Hari ini dia sakit, tidak datang ke sekolah.",
        correctAnswer = "Jīntiān tā shēngbìng le, bù lái xuéxiào.\n今天 他 生病 了， 不 来 学校。",
        options = listOf(
            "Jīntiān tā shēngbìng le, bù lái xuéxiào.\n今天 他 生病 了， 不 来 学校。",
            "Míngtiān tā shēngbìng le, bù lái xuéxiào.\n明天 他 生病 了， 不 来 学校。",
            "Jīntiān tā méiyǒu shēngbìng, lái xuéxiào.\n今天 他 没有 生病， 来 学校。"
        ),
        audioToSpeak = "今天他生病了，不来学校。"
    ),

    // 7. Soal 7: Pilihan Gambar (生病 -> sakit)
    Exercise(
        id = "u16_s1_p1_q7",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "生病",
        targetPinyin = "shēngbìng",
        targetTranslation = "jatuh sakit",
        correctAnswer = "jatuh sakit",
        audioToSpeak = "生病",
        pictureOptions = listOf(
            PictureOption("u16_s1_p1_opt7_1", "jatuh sakit", "", R.drawable.ic_med_sick, true),
            PictureOption("u16_s1_p1_opt7_2", "sehat", "", R.drawable.ic_mod_can, false),
            PictureOption("u16_s1_p1_opt7_3", "makan", "", R.drawable.ic_action_eat, false),
            PictureOption("u16_s1_p1_opt7_4", "tidur", "", R.drawable.ic_action_sleep, false)
        )
    ),

    // 8. Soal 8: Ketik Pinyin (rumah sakit -> yīyuàn)
    Exercise(
        id = "u16_s1_p1_q8",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "rumah sakit",
        sentenceWithBlank = "医院 (________)",
        targetHanzi = "医院",
        targetPinyin = "yīyuàn",
        correctAnswer = "yiyuan",
        keyboardKeys = listOf("y", "i", "u", "a", "n", "e", "o", "b", "d", "g", "h"),
        audioToSpeak = "医院"
    ),

    // 9. Soal 9: Susun Kalimat (Ibu saya ada di rumah sakit.)
    Exercise(
        id = "u16_s1_p1_q9",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Ibu ada di rumah sakit.",
        targetHanzi = "妈妈 在 医院。",
        targetPinyin = "Māma zài yīyuàn.",
        wordChips = listOf("妈妈:māma", "在:zài", "医院:yīyuàn", "家里:jiālǐ", "爸爸:bàba"),
        correctAnswer = "妈妈,在,医院",
        audioToSpeak = "妈妈在医院。"
    ),

    // 10. Soal 10: Ketuk Pasangan yang Sesuai (Rangkuman Sakit)
    Exercise(
        id = "u16_s1_p1_m10_1",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u16_s1_p1_m10_1", "生病", "shēngbìng", "jatuh sakit"),
            MatchPairItem("u16_s1_p1_m10_2", "医院", "yīyuàn", "rumah sakit"),
            MatchPairItem("u16_s1_p1_m10_3", "去医院", "qù yīyuàn", "ke rumah sakit"),
            MatchPairItem("u16_s1_p1_m10_4", "医生", "yīshēng", "dokter")
        )
    )
)

val bab16Stage1Part2Exercises = listOf(
    // 1. Soal 1: Pilihan Gambar (看病 -> berobat)
    Exercise(
        id = "u16_s1_p2_q1",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "看病",
        targetPinyin = "kànbìng",
        targetTranslation = "berobat ke dokter",
        correctAnswer = "berobat ke dokter",
        audioToSpeak = "看病",
        pictureOptions = listOf(
            PictureOption("u16_s1_p2_opt1", "berobat", "", R.drawable.ic_med_doctor, true),
            PictureOption("u16_s1_p2_opt2", "baca buku", "", R.drawable.ic_action_reading, false),
            PictureOption("u16_s1_p2_opt3", "makan", "", R.drawable.ic_action_eat, false),
            PictureOption("u16_s1_p2_opt4", "tidur", "", R.drawable.ic_action_sleep, false)
        )
    ),

    // 2. Soal 2: Susun Kalimat (Saya pergi ke rumah sakit berobat.)
    Exercise(
        id = "u16_s1_p2_q2",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Saya ke rumah sakit berobat.",
        targetHanzi = "我 去 医院 看病。",
        targetPinyin = "Wǒ qù yīyuàn kànbìng.",
        wordChips = listOf("我:wǒ", "去:qù", "医院:yīyuàn", "看病:kànbìng", "学校:xuéxiào"),
        correctAnswer = "我,去,医院,看病",
        audioToSpeak = "我去医院看病。"
    ),

    // 3. Soal 3: Ketuk Pasangan yang Sesuai (Berobat & Penyakit)
    Exercise(
        id = "u16_s1_p2_m3",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u16_s1_p2_m1", "病", "bìng", "penyakit / sakit"),
            MatchPairItem("u16_s1_p2_m2", "看病", "kànbìng", "berobat ke dokter"),
            MatchPairItem("u16_s1_p2_m3", "没有病", "méiyǒu bìng", "tidak sakit"),
            MatchPairItem("u16_s1_p2_m4", "大病", "dà bìng", "sakit parah")
        )
    ),

    // 4. Soal 4: Ketik Pinyin (berobat -> kànbìng)
    Exercise(
        id = "u16_s1_p2_q4",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "berobat ke dokter",
        sentenceWithBlank = "看病 (________)",
        targetHanzi = "看病",
        targetPinyin = "kànbìng",
        correctAnswer = "kanbing",
        keyboardKeys = listOf("k", "a", "n", "b", "i", "g", "e", "o", "u", "d", "h"),
        audioToSpeak = "看病"
    ),

    // 5. Soal 5: Mendengar Kalimat (Rule 10: illustrationRes = 0)
    Exercise(
        id = "u16_s1_p2_q5",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Apa yang Anda dengar?",
        targetTranslation = "Dokter memeriksa dia berobat.",
        targetHanzi = "医生 给 他 看病。",
        targetPinyin = "Yīshēng gěi tā kànbìng.",
        wordChips = listOf("医生:yīshēng", "给:gěi", "他:tā", "看病:kànbìng", "我:wǒ"),
        correctAnswer = "医生,给,他,看病",
        illustrationRes = 0,
        audioToSpeak = "医生给他看病。"
    ),

    // 6. Soal 6: Pilihan Kalimat
    Exercise(
        id = "u16_s1_p2_q6",
        type = ExerciseType.SENTENCE_CHOICE,
        title = "Pilih terjemahan yang benar",
        targetHanzi = "他 的 病 好 了。",
        targetPinyin = "Tā de bìng hǎo le.",
        targetTranslation = "Penyakitnya sudah sembuh.",
        correctAnswer = "Tā de bìng hǎo le.\n他 的 病 好 了。",
        options = listOf(
            "Tā de bìng hǎo le.\n他 的 病 好 了。",
            "Wǒ de bìng hǎo le.\n我 的 病 好 了。",
            "Tā shēngbìng le.\n他 生病 了。"
        ),
        audioToSpeak = "他的病好了。"
    ),

    // 7. Soal 7: Pilihan Gambar (病 -> sakit / penyakit)
    Exercise(
        id = "u16_s1_p2_q7",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "病",
        targetPinyin = "bìng",
        targetTranslation = "penyakit / sakit",
        correctAnswer = "penyakit / sakit",
        audioToSpeak = "病",
        pictureOptions = listOf(
            PictureOption("u16_s1_p2_opt7_1", "penyakit", "", R.drawable.ic_med_disease, true),
            PictureOption("u16_s1_p2_opt7_2", "makanan", "", R.drawable.ic_food_chinese_cuisine, false),
            PictureOption("u16_s1_p2_opt7_3", "uang", "", R.drawable.ic_yuan_currency, false),
            PictureOption("u16_s1_p2_opt7_4", "buku", "", R.drawable.ic_book_chinese, false)
        )
    ),

    // 8. Soal 8: Ketik Pinyin (penyakit -> bìng)
    Exercise(
        id = "u16_s1_p2_q8",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "sakit / penyakit",
        sentenceWithBlank = "病 (________)",
        targetHanzi = "病",
        targetPinyin = "bìng",
        correctAnswer = "bing",
        keyboardKeys = listOf("b", "i", "n", "g", "a", "e", "o", "u", "d", "h", "j"),
        audioToSpeak = "病"
    ),

    // 9. Soal 9: Susun Kalimat (Hari ini saya pergi berobat.)
    Exercise(
        id = "u16_s1_p2_q9",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Hari ini saya pergi berobat.",
        targetHanzi = "今天 我 去 看病。",
        targetPinyin = "Jīntiān wǒ qù kànbìng.",
        wordChips = listOf("今天:jīntiān", "我:wǒ", "去:qù", "看病:kànbìng", "明天:míngtiān"),
        correctAnswer = "今天,我,去,看病",
        audioToSpeak = "今天我去看病。"
    ),

    // 10. Soal 10: Ketuk Pasangan yang Sesuai (Rangkuman Berobat)
    Exercise(
        id = "u16_s1_p2_m10_1",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u16_s1_p2_m10_1", "病", "bìng", "penyakit"),
            MatchPairItem("u16_s1_p2_m10_2", "看病", "kànbìng", "berobat"),
            MatchPairItem("u16_s1_p2_m10_3", "病好了", "bìng hǎo le", "sudah sembuh"),
            MatchPairItem("u16_s1_p2_m10_4", "去医院", "qù yīyuàn", "ke RS")
        )
    )
)
