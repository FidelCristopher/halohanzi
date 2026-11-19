package com.example.chineselearning.data.repository

import com.example.chineselearning.R
import com.example.chineselearning.data.model.Exercise
import com.example.chineselearning.data.model.ExerciseType
import com.example.chineselearning.data.model.MatchPairItem
import com.example.chineselearning.data.model.PictureOption

val bab16Stage6Part1Exercises = listOf(
    // 1. Soal 1: Pilihan Gambar (医院 -> rumah sakit)
    Exercise(
        id = "u16_s6_p1_q1",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "医院",
        targetPinyin = "yīyuàn",
        targetTranslation = "rumah sakit",
        correctAnswer = "rumah sakit",
        audioToSpeak = "医院",
        pictureOptions = listOf(
            PictureOption("u16_s6_p1_opt1", "rumah sakit", "🏥", R.drawable.ic_coin, true),
            PictureOption("u16_s6_p1_opt2", "sekolah", "🏫", R.drawable.ic_cap, false),
            PictureOption("u16_s6_p1_opt3", "toko", "🏪", R.drawable.ic_target, false),
            PictureOption("u16_s6_p1_opt4", "rumah", "🏠", R.drawable.ic_people_group, false)
        )
    ),

    // 2. Soal 2: Susun Kalimat (Saya hari ini sakit pergi ke rumah sakit.)
    Exercise(
        id = "u16_s6_p1_q2",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Hari ini saya sakit ke rumah sakit.",
        targetHanzi = "今天 我 生病 去 医院。",
        targetPinyin = "Jīntiān wǒ shēngbìng qù yīyuàn.",
        wordChips = listOf("今天:jīntiān", "我:wǒ", "生病:shēngbìng", "去:qù", "医院。:yīyuàn.", "学校:xuéxiào"),
        correctAnswer = "今天,我,生病,去,医院。",
        audioToSpeak = "今天我生病去医院。"
    ),

    // 3. Soal 3: Ketuk Pasangan yang Sesuai (Rangkuman Grand Evaluasi 1)
    Exercise(
        id = "u16_s6_p1_q3",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u16_s6_p1_m1", "生病", "shēngbìng", "sakit"),
            MatchPairItem("u16_s6_p1_m2", "看病", "kànbìng", "berobat"),
            MatchPairItem("u16_s6_p1_m3", "可以", "kěyǐ", "boleh"),
            MatchPairItem("u16_s6_p1_m4", "对", "duì", "benar")
        )
    ),

    // 4. Soal 4: Ketik Pinyin (jatuh sakit -> shēngbìng)
    Exercise(
        id = "u16_s6_p1_q4",
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
        id = "u16_s6_p1_q5",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Apa yang Anda dengar?",
        targetTranslation = "Dokter memeriksa saya.",
        targetHanzi = "医生 给 我 看病。",
        targetPinyin = "Yīshēng gěi wǒ kànbìng.",
        wordChips = listOf("医生:yīshēng", "给:gěi", "我:wǒ", "看病。:kànbìng.", "他:tā"),
        correctAnswer = "医生,给,我,看病。",
        illustrationRes = 0,
        audioToSpeak = "医生给我看病。"
    ),

    // 6. Soal 6: Pilihan Kalimat
    Exercise(
        id = "u16_s6_p1_q6",
        type = ExerciseType.SENTENCE_CHOICE,
        title = "Pilih terjemahan yang benar",
        targetHanzi = "我们 都 会 说 汉语。",
        targetPinyin = "Wǒmen dōu huì shuō Hànyǔ.",
        targetTranslation = "Kami semua bisa berbicara bahasa Mandarin.",
        correctAnswer = "Wǒmen dōu huì shuō Hànyǔ.\n我们 都 会 说 汉语。",
        options = listOf(
            "Wǒmen dōu huì shuō Hànyǔ.\n我们 都 会 说 汉语。",
            "Tāmen dōu huì shuō Hànyǔ.\n他们 都 会 说 汉语。",
            "Wǒmen yě huì shuō Hànyǔ.\n我们 也 会 说 汉语。"
        ),
        audioToSpeak = "我们都会说汉语。"
    ),

    // 7. Soal 7: Pilihan Gambar (看病 -> berobat ke dokter)
    Exercise(
        id = "u16_s6_p1_q7",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "看病",
        targetPinyin = "kànbìng",
        targetTranslation = "berobat ke dokter",
        correctAnswer = "berobat ke dokter",
        audioToSpeak = "看病",
        pictureOptions = listOf(
            PictureOption("u16_s6_p1_opt7_1", "berobat", "🩺", R.drawable.ic_coin, true),
            PictureOption("u16_s6_p1_opt7_2", "belajar", "📖", R.drawable.ic_book, false),
            PictureOption("u16_s6_p1_opt7_3", "makan", "🍜", R.drawable.ic_target, false),
            PictureOption("u16_s6_p1_opt7_4", "tidur", "🛌", R.drawable.ic_crown, false)
        )
    ),

    // 8. Soal 8: Ketik Pinyin (rumah sakit -> yīyuàn)
    Exercise(
        id = "u16_s6_p1_q8",
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

    // 9. Soal 9: Susun Kalimat (Hari ini saya tidak bisa pergi ke sekolah.)
    Exercise(
        id = "u16_s6_p1_q9",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Hari ini saya tidak bisa ke sekolah.",
        targetHanzi = "今天 我 不能 去 学校。",
        targetPinyin = "Jīntiān wǒ bùnéng qù xuéxiào.",
        wordChips = listOf("今天:jīntiān", "我:wǒ", "不能:bùnéng", "去:qù", "学校。:xuéxiào.", "能:néng"),
        correctAnswer = "今天,我,不能,去,学校。",
        audioToSpeak = "今天我不能去学校。"
    ),

    // 10. Soal 10: Ketuk Pasangan yang Sesuai (Rangkuman Kesehatan)
    Exercise(
        id = "u16_s6_p1_m10_1",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u16_s6_p1_m10_1", "生病", "shēngbìng", "jatuh sakit"),
            MatchPairItem("u16_s6_p1_m10_2", "看病", "kànbìng", "berobat"),
            MatchPairItem("u16_s6_p1_m10_3", "医院", "yīyuàn", "rumah sakit"),
            MatchPairItem("u16_s6_p1_m10_4", "医生", "yīshēng", "dokter")
        )
    )
)

val bab16Stage6Part2Exercises = listOf(
    // 1. Soal 1: Pilihan Gambar (大家 -> semua orang)
    Exercise(
        id = "u16_s6_p2_q1",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "大家",
        targetPinyin = "dàjiā",
        targetTranslation = "semua orang",
        correctAnswer = "semua orang",
        audioToSpeak = "大家",
        pictureOptions = listOf(
            PictureOption("u16_s6_p2_opt1", "semua orang", "👥", R.drawable.ic_coin, true),
            PictureOption("u16_s6_p2_opt2", "satu orang", "👤", R.drawable.ic_target, false),
            PictureOption("u16_s6_p2_opt3", "rumah", "🏠", R.drawable.ic_book, false),
            PictureOption("u16_s6_p2_opt4", "buku", "📖", R.drawable.ic_crown, false)
        )
    ),

    // 2. Soal 2: Susun Kalimat (Semua orang sangat suka belajar bahasa Mandarin.)
    Exercise(
        id = "u16_s6_p2_q2",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Semua orang suka belajar Mandarin.",
        targetHanzi = "大家 都 喜欢 学习 汉语。",
        targetPinyin = "Dàjiā dōu xǐhuan xuéxí Hànyǔ.",
        wordChips = listOf("大家:dàjiā", "都:dōu", "喜欢:xǐhuan", "学习:xuéxí", "汉语。:Hànyǔ.", "也:yě"),
        correctAnswer = "大家,都,喜欢,学习,汉语。",
        audioToSpeak = "大家都喜欢学习汉语。"
    ),

    // 3. Soal 3: Ketuk Pasangan yang Sesuai (Grand Sintesis Final New HSK 1)
    Exercise(
        id = "u16_s6_p2_m3",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u16_s6_p2_m1", "大家", "dàjiā", "semua orang"),
            MatchPairItem("u16_s6_p2_m2", "汉语", "Hànyǔ", "bahasa Mandarin"),
            MatchPairItem("u16_s6_p2_m3", "汉字", "Hànzì", "karakter Hanzi"),
            MatchPairItem("u16_s6_p2_m4", "再见", "zàijiàn", "sampai jumpa")
        )
    ),

    // 4. Soal 4: Ketik Pinyin (semua orang -> dàjiā)
    Exercise(
        id = "u16_s6_p2_q4",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "semua orang",
        sentenceWithBlank = "大家 (________)",
        targetHanzi = "大家",
        targetPinyin = "dàjiā",
        correctAnswer = "dajia",
        keyboardKeys = listOf("d", "a", "j", "i", "e", "o", "u", "b", "g", "h", "l"),
        audioToSpeak = "大家"
    ),

    // 5. Soal 5: Mendengar Kalimat (Rule 10: illustrationRes = 0)
    Exercise(
        id = "u16_s6_p2_q5",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Apa yang Anda dengar?",
        targetTranslation = "Selamat tinggal teman-teman semua!",
        targetHanzi = "大家 再见！",
        targetPinyin = "Dàjiā zàijiàn!",
        wordChips = listOf("大家:dàjiā", "再见！:zàijiàn!", "老师:lǎoshī", "朋友:péngyou"),
        correctAnswer = "大家,再见！",
        illustrationRes = 0,
        audioToSpeak = "大家再见！"
    ),

    // 6. Soal 6: Pilihan Kalimat
    Exercise(
        id = "u16_s6_p2_q6",
        type = ExerciseType.SENTENCE_CHOICE,
        title = "Pilih terjemahan yang benar",
        targetHanzi = "我 会 读 也 会 写 汉字。",
        targetPinyin = "Wǒ huì dú yě huì xiě Hànzì.",
        targetTranslation = "Saya bisa membaca dan juga menulis Hanzi.",
        correctAnswer = "Wǒ huì dú yě huì xiě Hànzì.\n我 会 读 也 会 写 汉字。",
        options = listOf(
            "Wǒ huì dú yě huì xiě Hànzì.\n我 会 读 也 会 写 汉字。",
            "Tā huì dú yě huì xiě Hànzì.\n他 会 读 也 会 写 汉字。",
            "Wǒ bú huì dú yě bú huì xiě.\n我 不 会 读 也 不 会 写。"
        ),
        audioToSpeak = "我会读也会写汉字。"
    ),

    // 7. Soal 7: Pilihan Gambar (再见 -> sampai jumpa)
    Exercise(
        id = "u16_s6_p2_q7",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "再见",
        targetPinyin = "zàijiàn",
        targetTranslation = "sampai jumpa",
        correctAnswer = "sampai jumpa",
        audioToSpeak = "再见",
        pictureOptions = listOf(
            PictureOption("u16_s6_p2_opt7_1", "sampai jumpa", "👋", R.drawable.ic_coin, true),
            PictureOption("u16_s6_p2_opt7_2", "halo", "🤝", R.drawable.ic_target, false),
            PictureOption("u16_s6_p2_opt7_3", "terima kasih", "🙏", R.drawable.ic_book, false),
            PictureOption("u16_s6_p2_opt7_4", "maaf", "🙇", R.drawable.ic_crown, false)
        )
    ),

    // 8. Soal 8: Ketik Pinyin (sampai jumpa -> zàijiàn)
    Exercise(
        id = "u16_s6_p2_q8",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "sampai jumpa",
        sentenceWithBlank = "再见 (________)",
        targetHanzi = "再见",
        targetPinyin = "zàijiàn",
        correctAnswer = "zaijian",
        keyboardKeys = listOf("z", "a", "i", "j", "n", "e", "o", "u", "b", "d", "g"),
        audioToSpeak = "再见"
    ),

    // 9. Soal 9: Susun Kalimat (Grand Final HSK 1)
    Exercise(
        id = "u16_s6_p2_q9",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Kami semua sangat senang belajar Mandarin.",
        targetHanzi = "我们 学习 汉语 很 高兴。",
        targetPinyin = "Wǒmen xuéxí Hànyǔ hěn gāoxìng.",
        wordChips = listOf("我们:wǒmen", "学习:xuéxí", "汉语:Hànyǔ", "很:hěn", "高兴。:gāoxìng.", "大家:dàjiā"),
        correctAnswer = "我们,学习,汉语,很,高兴。",
        audioToSpeak = "我们学习汉语很高兴。"
    ),

    // 10. Soal 10: Ketuk Pasangan yang Sesuai (Grand Review Final New HSK 1)
    Exercise(
        id = "u16_s6_p2_m10_1",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u16_s6_p2_m10_1", "学汉语", "xué Hànyǔ", "belajar Mandarin"),
            MatchPairItem("u16_s6_p2_m10_2", "写汉字", "xiě Hànzì", "menulis Hanzi"),
            MatchPairItem("u16_s6_p2_m10_3", "很高兴", "hěn gāoxìng", "sangat gembira"),
            MatchPairItem("u16_s6_p2_m10_4", "再见", "zàijiàn", "sampai jumpa")
        )
    )
)
