package com.example.chineselearning.data.repository

import com.example.chineselearning.R
import com.example.chineselearning.data.model.Exercise
import com.example.chineselearning.data.model.ExerciseType
import com.example.chineselearning.data.model.MatchPairItem
import com.example.chineselearning.data.model.PictureOption

val bab23Stage5Part1Exercises = listOf(
    // 1. Soal 1: Pilihan Gambar (旅游 -> berwisata)
    Exercise(
        id = "u23_s5_p1_q1",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "旅游",
        targetPinyin = "lǚyóu",
        targetTranslation = "berwisata",
        correctAnswer = "berwisata",
        audioToSpeak = "旅游",
        pictureOptions = listOf(
            PictureOption("u23_s5_p1_opt1", "berwisata", "", R.drawable.ic_tour_travel, true),
            PictureOption("u23_s5_p1_opt2", "paspor", "", R.drawable.ic_tour_passport_abroad, false),
            PictureOption("u23_s5_p1_opt3", "bandara", "", R.drawable.ic_tour_airport, false),
            PictureOption("u23_s5_p1_opt4", "tiket pesawat", "", R.drawable.ic_tour_flight_ticket, false)
        )
    ),

    // 2. Soal 2: Susun Kalimat (Kami membeli tiket pesawat terbang ke Beijing berwisata.)
    Exercise(
        id = "u23_s5_p1_q2",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Kami beli tiket terbang ke Beijing berlibur.",
        targetHanzi = "我们 买 机票 飞 去 北京 旅游。",
        targetPinyin = "Wǒmen mǎi jīpiào fēi qù Běijīng lǚyóu.",
        wordChips = listOf("我们:wǒmen", "买:mǎi", "机票:jīpiào", "飞:fēi", "去:qù", "北京:Běijīng", "旅游。:lǚyóu.", "车票:chēpiào"),
        correctAnswer = "我们,买,机票,飞,去,北京,旅游。",
        audioToSpeak = "我们买机票飞去北京旅游。"
    ),

    // 3. Soal 3: Ketuk Pasangan yang Sesuai (Sintesis Wisata Penerbangan)
    Exercise(
        id = "u23_s5_p1_m3",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u23_s5_p1_m1", "旅游", "lǚyóu", "berwisata"),
            MatchPairItem("u23_s5_p1_m2", "机票", "jīpiào", "tiket pesawat"),
            MatchPairItem("u23_s5_p1_m3", "飞去", "fēi qù", "terbang ke"),
            MatchPairItem("u23_s5_p1_m4", "机场", "jīchǎng", "bandara")
        )
    ),

    // 4. Soal 4: Ketik Pinyin (berwisata -> lǚyóu)
    Exercise(
        id = "u23_s5_p1_q4",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "berwisata / berlibur",
        sentenceWithBlank = "旅游 (________)",
        targetHanzi = "旅游",
        targetPinyin = "lǚyóu",
        correctAnswer = "lvyou",
        keyboardKeys = listOf("l", "v", "y", "o", "u", "a", "e", "i", "b", "d", "g", "h"),
        audioToSpeak = "旅游"
    ),

    // 5. Soal 5: Mendengar Kalimat (Rule 10: illustrationRes = 0)
    Exercise(
        id = "u23_s5_p1_q5",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Apa yang Anda dengar?",
        targetTranslation = "Apakah Anda sudah siap pergi ke bandara?",
        targetHanzi = "你 准备 好 去 机场 了 吗？",
        targetPinyin = "Nǐ zhǔnbèi hǎo qù jīchǎng le ma?",
        wordChips = listOf("你:nǐ", "准备:zhǔnbèi", "好:hǎo", "去:qù", "机场:jīchǎng", "了:le", "吗？:ma?", "车站:chēzhàn"),
        correctAnswer = "你,准备,好,去,机场,了,吗？",
        illustrationRes = 0,
        audioToSpeak = "你准备好去机场了吗？"
    ),

    // 6. Soal 6: Pilihan Kalimat
    Exercise(
        id = "u23_s5_p1_q6",
        type = ExerciseType.SENTENCE_CHOICE,
        title = "Pilih terjemahan yang benar",
        targetHanzi = "我们 住 在 机场 旁边 的 酒店。",
        targetPinyin = "Wǒmen zhù zài jīchǎng pángbiān de jiǔdiàn.",
        targetTranslation = "Kami menginap di hotel yang berada di samping bandara.",
        correctAnswer = "Wǒmen zhù zài jīchǎng pángbiān de jiǔdiàn.\n我们 住 在 机场 旁边 的 酒店。",
        options = listOf(
            "Wǒmen zhù zài jīchǎng pángbiān de jiǔdiàn.\n我们 住 在 机场 旁边 的 酒店。",
            "Wǒmen zhù zài xuéxiào pángbiān de jiǔdiàn.\n我们 住 在 学校 旁边 的 酒店。",
            "Tāmen zhù zài jīchǎng pángbiān de jiǔdiàn.\n他们 住 在 机场 旁边 的 酒店。"
        ),
        audioToSpeak = "我们住在机场旁边的酒店。"
    ),

    // 7. Soal 7: Pilihan Gambar (机票 -> tiket pesawat terbang)
    Exercise(
        id = "u23_s5_p1_q7",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "机票",
        targetPinyin = "jīpiào",
        targetTranslation = "tiket pesawat",
        correctAnswer = "tiket pesawat",
        audioToSpeak = "机票",
        pictureOptions = listOf(
            PictureOption("u23_s5_p1_opt7_1", "tiket pesawat", "", R.drawable.ic_tour_flight_ticket, true),
            PictureOption("u23_s5_p1_opt7_2", "hotel", "", R.drawable.ic_tour_hotel, false),
            PictureOption("u23_s5_p1_opt7_3", "bandara", "", R.drawable.ic_tour_airport, false),
            PictureOption("u23_s5_p1_opt7_4", "paspor", "", R.drawable.ic_tour_passport_abroad, false)
        )
    ),

    // 8. Soal 8: Ketik Pinyin (tiket pesawat -> jīpiào)
    Exercise(
        id = "u23_s5_p1_q8",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "tiket pesawat",
        sentenceWithBlank = "机票 (________)",
        targetHanzi = "机票",
        targetPinyin = "jīpiào",
        correctAnswer = "jipiao",
        keyboardKeys = listOf("j", "i", "p", "a", "o", "e", "u", "b", "d", "g", "h", "l"),
        audioToSpeak = "机票"
    ),

    // 9. Soal 9: Susun Kalimat (Ibu mengantar saya ke bandara naik taksi.)
    Exercise(
        id = "u23_s5_p1_q9",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Ibu mengantar saya ke bandara.",
        targetHanzi = "妈妈 打车 送 我 去 机场。",
        targetPinyin = "Māma dǎchē sòng wǒ qù jīchǎng.",
        wordChips = listOf("妈妈:māma", "打车:dǎchē", "送:sòng", "我:wǒ", "去:qù", "机场。:jīchǎng.", "学校:xuéxiào"),
        correctAnswer = "妈妈,打车,送,我,去,机场。",
        audioToSpeak = "妈妈打车送我去机场。"
    ),

    // 10. Soal 10: Ketuk Pasangan yang Sesuai (Rangkuman Sintesis 1)
    Exercise(
        id = "u23_s5_p1_m10",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u23_s5_p1_m10_1", "机票", "jīpiào", "tiket pesawat"),
            MatchPairItem("u23_s5_p1_m10_2", "送去", "sòng qù", "mengantar ke"),
            MatchPairItem("u23_s5_p1_m10_3", "飞北京", "fēi Běijīng", "terbang ke Beijing"),
            MatchPairItem("u23_s5_p1_m10_4", "大酒店", "dà jiǔdiàn", "hotel megah")
        )
    )
)

val bab23Stage5Part2Exercises = listOf(
    // 1. Soal 1: Pilihan Gambar (酒店 -> hotel tempat menginap)
    Exercise(
        id = "u23_s5_p2_q1",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "酒店",
        targetPinyin = "jiǔdiàn",
        targetTranslation = "hotel",
        correctAnswer = "hotel",
        audioToSpeak = "酒店",
        pictureOptions = listOf(
            PictureOption("u23_s5_p2_opt1", "hotel", "", R.drawable.ic_tour_hotel, true),
            PictureOption("u23_s5_p2_opt2", "bandara", "", R.drawable.ic_tour_airport, false),
            PictureOption("u23_s5_p2_opt3", "tiket", "", R.drawable.ic_tour_flight_ticket, false),
            PictureOption("u23_s5_p2_opt4", "paspor", "", R.drawable.ic_tour_passport_abroad, false)
        )
    ),

    // 2. Soal 2: Susun Kalimat (Dia membawa koper keluar masuk hotel.)
    Exercise(
        id = "u23_s5_p2_q2",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Dia membawa koper ke hotel.",
        targetHanzi = "他 拿 着 箱子 进 酒店。",
        targetPinyin = "Tā ná zhe xiāngzi jìn jiǔdiàn.",
        wordChips = listOf("他:tā", "拿:ná", "着:zhe", "箱子:xiāngzi", "进:jìn", "酒店。:jiǔdiàn.", "出:chū"),
        correctAnswer = "他,拿,着,箱子,进,酒店。",
        audioToSpeak = "他拿着箱子进酒店。"
    ),

    // 3. Soal 3: Ketuk Pasangan yang Sesuai (Grand Sintesis Bab 23)
    Exercise(
        id = "u23_s5_p2_m3",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u23_s5_p2_m1", "酒店", "jiǔdiàn", "hotel"),
            MatchPairItem("u23_s5_p2_m2", "出国", "chūguó", "ke luar negeri"),
            MatchPairItem("u23_s5_p2_m3", "门票", "ménpiào", "tiket masuk"),
            MatchPairItem("u23_s5_p2_m4", "过年好", "guònián hǎo", "selamat Imlek")
        )
    ),

    // 4. Soal 4: Ketik Pinyin (hotel -> jiǔdiàn)
    Exercise(
        id = "u23_s5_p2_q4",
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
        id = "u23_s5_p2_q5",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Apa yang Anda dengar?",
        targetTranslation = "Saya belum pernah ke luar negeri merayakan Imlek.",
        targetHanzi = "我 没 出过 国 过年。",
        targetPinyin = "Wǒ méi chū guo guó guònián.",
        wordChips = listOf("我:wǒ", "没:méi", "出过:chū guo", "国:guó", "过年。:guònián.", "旅游:lǚyóu"),
        correctAnswer = "我,没,出过,国,过年。",
        illustrationRes = 0,
        audioToSpeak = "我没出国过年。"
    ),

    // 6. Soal 6: Pilihan Kalimat
    Exercise(
        id = "u23_s5_p2_q6",
        type = ExerciseType.SENTENCE_CHOICE,
        title = "Pilih terjemahan yang benar",
        targetHanzi = "祝 大家 旅途 愉快， 一路 顺风！",
        targetPinyin = "Zhù dàjiā lǚtú yúkuài, yílù shùnfēng!",
        targetTranslation = "Semoga perjalanan kalian menyenangkan, selamat jalan!",
        correctAnswer = "Zhù dàjiā lǚtú yúkuài, yílù shùnfēng!\n祝 大家 旅途 愉快， 一路 顺风！",
        options = listOf(
            "Zhù dàjiā lǚtú yúkuài, yílù shùnfēng!\n祝 大家 旅途 愉快， 一路 顺风！",
            "Zhù dàjiā shēngrì kuàilè!\n祝 大家 生日 快乐！",
            "Zhù nǐ xīnnián kuàilè!\n祝 你 新年 快乐！"
        ),
        audioToSpeak = "祝大家旅途愉快，一路顺风！"
    ),

    // 7. Soal 7: Pilihan Gambar (出国 -> keluar negeri)
    Exercise(
        id = "u23_s5_p2_q7",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "出国",
        targetPinyin = "chūguó",
        targetTranslation = "ke luar negeri",
        correctAnswer = "ke luar negeri",
        audioToSpeak = "出国",
        pictureOptions = listOf(
            PictureOption("u23_s5_p2_opt7_1", "ke luar negeri", "", R.drawable.ic_tour_passport_abroad, true),
            PictureOption("u23_s5_p2_opt7_2", "tiket", "", R.drawable.ic_tour_flight_ticket, false),
            PictureOption("u23_s5_p2_opt7_3", "hotel", "", R.drawable.ic_tour_hotel, false),
            PictureOption("u23_s5_p2_opt7_4", "bandara", "", R.drawable.ic_tour_airport, false)
        )
    ),

    // 8. Soal 8: Ketik Pinyin (ke luar negeri -> chūguó)
    Exercise(
        id = "u23_s5_p2_q8",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "pergi ke luar negeri",
        sentenceWithBlank = "出国 (________)",
        targetHanzi = "出国",
        targetPinyin = "chūguó",
        correctAnswer = "chuguo",
        keyboardKeys = listOf("c", "h", "u", "g", "o", "a", "e", "i", "b", "d", "j", "l"),
        audioToSpeak = "出国"
    ),

    // 9. Soal 9: Susun Kalimat (Kami membeli tiket masuk tempat wisata.)
    Exercise(
        id = "u23_s5_p2_q9",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Kami membeli tiket masuk.",
        targetHanzi = "我们 买 了 门票。",
        targetPinyin = "Wǒmen mǎi le ménpiào.",
        wordChips = listOf("我们:wǒmen", "买:mǎi", "了:le", "门票。:ménpiào.", "机票:jīpiào"),
        correctAnswer = "我们,买,了,门票。",
        audioToSpeak = "我们买了门票。"
    ),

    // 10. Soal 10: Ketuk Pasangan yang Sesuai (Grand Review Final Bab 23)
    Exercise(
        id = "u23_s5_p2_m10",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u23_s5_p2_m10_1", "外国旅游", "wàiguó lǚyóu", "wisata LN"),
            MatchPairItem("u23_s5_p2_m10_2", "买机票", "mǎi jīpiào", "beli tiket pesawat"),
            MatchPairItem("u23_s5_p2_m10_3", "住大酒店", "zhù dà jiǔdiàn", "inap hotel"),
            MatchPairItem("u23_s5_p2_m10_4", "过年好", "guònián hǎo", "selamat tahun baru")
        )
    )
)
