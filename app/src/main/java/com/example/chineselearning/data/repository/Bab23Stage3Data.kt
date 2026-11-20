package com.example.chineselearning.data.repository

import com.example.chineselearning.R
import com.example.chineselearning.data.model.Exercise
import com.example.chineselearning.data.model.ExerciseType
import com.example.chineselearning.data.model.MatchPairItem
import com.example.chineselearning.data.model.PictureOption

val bab23Stage3Part1Exercises = listOf(
    // 1. Soal 1: Pilihan Gambar (酒店 -> hotel / penginapan)
    Exercise(
        id = "u23_s3_p1_q1",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "酒店",
        targetPinyin = "jiǔdiàn",
        targetTranslation = "hotel / penginapan",
        correctAnswer = "hotel / penginapan",
        audioToSpeak = "酒店",
        pictureOptions = listOf(
            PictureOption("u23_s3_p1_opt1", "hotel", "", R.drawable.ic_tour_hotel, true),
            PictureOption("u23_s3_p1_opt2", "bandara", "", R.drawable.ic_tour_airport, false),
            PictureOption("u23_s3_p1_opt3", "wisata", "", R.drawable.ic_tour_travel, false),
            PictureOption("u23_s3_p1_opt4", "tiket", "", R.drawable.ic_tour_flight_ticket, false)
        )
    ),

    // 2. Soal 2: Susun Kalimat (Kami tinggal di sebuah hotel besar di tepi laut.)
    Exercise(
        id = "u23_s3_p1_q2",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Kami tinggal di hotel tepi laut.",
        targetHanzi = "我们 住 在 海边 的 酒店。",
        targetPinyin = "Wǒmen zhù zài hǎibiān de jiǔdiàn.",
        wordChips = listOf("我们:wǒmen", "住:zhù", "在:zài", "海边:hǎibiān", "的:de", "酒店。:jiǔdiàn.", "学校:xuéxiào"),
        correctAnswer = "我们,住,在,海边,的,酒店。",
        audioToSpeak = "我们住在海边的酒店。"
    ),

    // 3. Soal 3: Ketuk Pasangan yang Sesuai (Hotel & Bersiap)
    Exercise(
        id = "u23_s3_p1_q3",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u23_s3_p1_m1", "酒店", "jiǔdiàn", "hotel"),
            MatchPairItem("u23_s3_p1_m2", "准备", "zhǔnbèi", "bersiap / menyiapkan"),
            MatchPairItem("u23_s3_p1_m3", "住酒店", "zhù jiǔdiàn", "menginap di hotel"),
            MatchPairItem("u23_s3_p1_m4", "准备好", "zhǔnbèi hǎo", "sudah siap")
        )
    ),

    // 4. Soal 4: Ketik Pinyin (hotel -> jiǔdiàn)
    Exercise(
        id = "u23_s3_p1_q4",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "hotel / penginapan",
        sentenceWithBlank = "酒店 (________)",
        targetHanzi = "酒店",
        targetPinyin = "jiǔdiàn",
        correctAnswer = "jiudian",
        keyboardKeys = listOf("j", "i", "u", "d", "a", "n", "e", "o", "b", "g", "h", "l"),
        audioToSpeak = "酒店"
    ),

    // 5. Soal 5: Mendengar Kalimat (Rule 10: illustrationRes = 0)
    Exercise(
        id = "u23_s3_p1_q5",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Apa yang Anda dengar?",
        targetTranslation = "Saya sudah siap berangkat berwisata.",
        targetHanzi = "我 已经 准备 好 去 旅游 了。",
        targetPinyin = "Wǒ yǐjīng zhǔnbèi hǎo qù lǚyóu le.",
        wordChips = listOf("我:wǒ", "已经:yǐjīng", "准备:zhǔnbèi", "好:hǎo", "去:qù", "旅游:lǚyóu", "了。:le."),
        correctAnswer = "我,已经,准备,好,去,旅游,了。",
        illustrationRes = 0,
        audioToSpeak = "我已经准备好去旅游了。"
    ),

    // 6. Soal 6: Pilihan Kalimat
    Exercise(
        id = "u23_s3_p1_q6",
        type = ExerciseType.SENTENCE_CHOICE,
        title = "Pilih terjemahan yang benar",
        targetHanzi = "你 准备 什么时候 去 中国？",
        targetPinyin = "Nǐ zhǔnbèi shénmeshíhou qù Zhōngguó?",
        targetTranslation = "Kamu berencana kapan pergi ke Tiongkok?",
        correctAnswer = "Nǐ zhǔnbèi shénmeshíhou qù Zhōngguó?\n你 准备 什么时候 去 中国？",
        options = listOf(
            "Nǐ zhǔnbèi shénmeshíhou qù Zhōngguó?\n你 准备 什么时候 去 中国？",
            "Nǐ yǐjīng qù Zhōngguó le ma?\n你 已经 去 中国 了 吗？",
            "Tā zhǔnbèi shénmeshíhou qù Zhōngguó?\n他 准备 什么时候 去 中国？"
        ),
        audioToSpeak = "你准备什么时候去中国？"
    ),

    // 7. Soal 7: Pilihan Gambar (酒店 -> penginapan)
    Exercise(
        id = "u23_s3_p1_q7",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "酒店",
        targetPinyin = "jiǔdiàn",
        targetTranslation = "penginapan",
        correctAnswer = "penginapan",
        audioToSpeak = "酒店",
        pictureOptions = listOf(
            PictureOption("u23_s3_p1_opt7_1", "hotel", "", R.drawable.ic_tour_hotel, true),
            PictureOption("u23_s3_p1_opt7_2", "bandara", "", R.drawable.ic_tour_airport, false),
            PictureOption("u23_s3_p1_opt7_3", "wisata", "", R.drawable.ic_tour_travel, false),
            PictureOption("u23_s3_p1_opt7_4", "paspor", "", R.drawable.ic_tour_passport_abroad, false)
        )
    ),

    // 8. Soal 8: Ketik Pinyin (mempersiapkan -> zhǔnbèi)
    Exercise(
        id = "u23_s3_p1_q8",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "mempersiapkan / bersiap",
        sentenceWithBlank = "准备 (________)",
        targetHanzi = "准备",
        targetPinyin = "zhǔnbèi",
        correctAnswer = "zhunbei",
        keyboardKeys = listOf("z", "h", "u", "n", "b", "e", "i", "a", "o", "d", "g", "j"),
        audioToSpeak = "准备"
    ),

    // 9. Soal 9: Susun Kalimat (Hotel ini pelayanannya sangat baik.)
    Exercise(
        id = "u23_s3_p1_q9",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Hotel ini sangat bagus.",
        targetHanzi = "这家 酒店 很 好。",
        targetPinyin = "Zhè jiā jiǔdiàn hěn hǎo.",
        wordChips = listOf("这家:zhè jiā", "酒店:jiǔdiàn", "很:hěn", "好。:hǎo.", "大:dà"),
        correctAnswer = "这家,酒店,很,好。",
        audioToSpeak = "这家酒店很好。"
    ),

    // 10. Soal 10: Ketuk Pasangan yang Sesuai (Rangkuman Hotel)
    Exercise(
        id = "u23_s3_p1_m10",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u23_s3_p1_m10_1", "酒店", "jiǔdiàn", "hotel"),
            MatchPairItem("u23_s3_p1_m10_2", "准备", "zhǔnbèi", "bersiap-siap"),
            MatchPairItem("u23_s3_p1_m10_3", "大酒店", "dà jiǔdiàn", "hotel besar"),
            MatchPairItem("u23_s3_p1_m10_4", "什么时候", "shénmeshíhou", "kapan")
        )
    )
)

val bab23Stage3Part2Exercises = listOf(
    // 1. Soal 1: Pilihan Gambar (过年 -> merayakan Tahun Baru Imlek)
    Exercise(
        id = "u23_s3_p2_q1",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "过年",
        targetPinyin = "guònián",
        targetTranslation = "merayakan Imlek",
        correctAnswer = "merayakan Imlek",
        audioToSpeak = "过年",
        pictureOptions = listOf(
            PictureOption("u23_s3_p2_opt1", "merayakan Imlek", "", R.drawable.ic_tour_travel, true),
            PictureOption("u23_s3_p2_opt2", "hotel", "", R.drawable.ic_tour_hotel, false),
            PictureOption("u23_s3_p2_opt3", "bandara", "", R.drawable.ic_tour_airport, false),
            PictureOption("u23_s3_p2_opt4", "tiket", "", R.drawable.ic_tour_flight_ticket, false)
        )
    ),

    // 2. Soal 2: Susun Kalimat (Saat merayakan tahun baru seluruh keluarga berkumpul.)
    Exercise(
        id = "u23_s3_p2_q2",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Saat Imlek sekeluarga kumpul.",
        targetHanzi = "过年 全家 团聚 在 一起。",
        targetPinyin = "Guònián quánjiā tuánjù zài yìqǐ.",
        wordChips = listOf("过年:guònián", "全家:quánjiā", "团聚:tuánjù", "在:zài", "一起。:yìqǐ.", "出去:chūqù"),
        correctAnswer = "过年,全家,团聚,在,一起。",
        audioToSpeak = "过年全家团聚在一起。"
    ),

    // 3. Soal 3: Ketuk Pasangan yang Sesuai (Merayakan Imlek & Waktu)
    Exercise(
        id = "u23_s3_p2_m3",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u23_s3_p2_m1", "过年", "guònián", "merayakan Imlek"),
            MatchPairItem("u23_s3_p2_m2", "过", "guò", "melewati waktu"),
            MatchPairItem("u23_s3_p2_m3", "全家", "quánjiā", "sekeluarga"),
            MatchPairItem("u23_s3_p2_m4", "很高兴", "hěn gāoxìng", "sangat senang")
        )
    ),

    // 4. Soal 4: Ketik Pinyin (merayakan Imlek -> guònián)
    Exercise(
        id = "u23_s3_p2_q4",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "merayakan Tahun Baru Imlek",
        sentenceWithBlank = "过年 (________)",
        targetHanzi = "过年",
        targetPinyin = "guònián",
        correctAnswer = "guonian",
        keyboardKeys = listOf("g", "u", "o", "n", "i", "a", "e", "b", "d", "h", "j", "l"),
        audioToSpeak = "过年"
    ),

    // 5. Soal 5: Mendengar Kalimat (Rule 10: illustrationRes = 0)
    Exercise(
        id = "u23_s3_p2_q5",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Apa yang Anda dengar?",
        targetTranslation = "Hari ini saya lalui dengan sangat gembira.",
        targetHanzi = "今天 我 过 得 很 开心。",
        targetPinyin = "Jīntiān wǒ guò de hěn kāixīn.",
        wordChips = listOf("今天:jīntiān", "我:wǒ", "过:guò", "得:de", "很:hěn", "开心。:kāixīn.", "累:lèi"),
        correctAnswer = "今天,我,过,得,很,开心。",
        illustrationRes = 0,
        audioToSpeak = "今天我过得很开心。"
    ),

    // 6. Soal 6: Pilihan Kalimat
    Exercise(
        id = "u23_s3_p2_q6",
        type = ExerciseType.SENTENCE_CHOICE,
        title = "Pilih terjemahan yang benar",
        targetHanzi = "过年 好！ 祝 您 新年 快乐！",
        targetPinyin = "Guònián hǎo! Zhù nín xīnnián kuàilè!",
        targetTranslation = "Selamat tahun baru! Mendoakan Anda selamat tahun baru!",
        correctAnswer = "Guònián hǎo! Zhù nín xīnnián kuàilè!\n过年 好！ 祝 您 新年 快乐！",
        options = listOf(
            "Guònián hǎo! Zhù nín xīnnián kuàilè!\n过年 好！ 祝 您 新年 快乐！",
            "Shēngrì kuàilè! Zhù nín shēntǐ jiànkāng!\n生日 快乐！ 祝 您 身体 健康！",
            "Guònián hǎo! Zhù nǐ shēngrì kuàilè!\n过年 好！ 祝 你 生日 快乐！"
        ),
        audioToSpeak = "过年好！祝您新年快乐！"
    ),

    // 7. Soal 7: Pilihan Gambar (过 -> melewati hari)
    Exercise(
        id = "u23_s3_p2_q7",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "过",
        targetPinyin = "guò",
        targetTranslation = "melewati hari",
        correctAnswer = "melewati hari",
        audioToSpeak = "过",
        pictureOptions = listOf(
            PictureOption("u23_s3_p2_opt7_1", "melewati hari", "", R.drawable.ic_tour_travel, true),
            PictureOption("u23_s3_p2_opt7_2", "tiket", "", R.drawable.ic_tour_flight_ticket, false),
            PictureOption("u23_s3_p2_opt7_3", "hotel", "", R.drawable.ic_tour_hotel, false),
            PictureOption("u23_s3_p2_opt7_4", "bandara", "", R.drawable.ic_tour_airport, false)
        )
    ),

    // 8. Soal 8: Ketik Pinyin (melewati hari -> guò)
    Exercise(
        id = "u23_s3_p2_q8",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "melewati / menghabiskan waktu",
        sentenceWithBlank = "过 (________)",
        targetHanzi = "过",
        targetPinyin = "guò",
        correctAnswer = "guo",
        keyboardKeys = listOf("g", "u", "o", "a", "e", "i", "b", "d", "h", "j", "l", "m"),
        audioToSpeak = "过"
    ),

    // 9. Soal 9: Susun Kalimat (Kalian bagaimana merayakan tahun baru?)
    Exercise(
        id = "u23_s3_p2_q9",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Kalian merayakan Imlek bagaimana?",
        targetHanzi = "你们 怎么 过年？",
        targetPinyin = "Nǐmen zěnme guònián?",
        wordChips = listOf("你们:nǐmen", "怎么:zěnme", "过年？:guònián?", "吃饭:chīfàn"),
        correctAnswer = "你们,怎么,过年？",
        audioToSpeak = "你们怎么过年？"
    ),

    // 10. Soal 10: Ketuk Pasangan yang Sesuai (Rangkuman Perayaan Imlek)
    Exercise(
        id = "u23_s3_p2_m10",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u23_s3_p2_m10_1", "过年", "guònián", "merayakan Imlek"),
            MatchPairItem("u23_s3_p2_m10_2", "过生日", "guò shēngrì", "merayakan ultah"),
            MatchPairItem("u23_s3_p2_m10_3", "过得好", "guò de hǎo", "hidup bahagia"),
            MatchPairItem("u23_s3_p2_m10_4", "很开心", "hěn kāixīn", "sangat gembira")
        )
    )
)
