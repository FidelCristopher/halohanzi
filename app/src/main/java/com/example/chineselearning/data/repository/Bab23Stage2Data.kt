package com.example.chineselearning.data.repository

import com.example.chineselearning.R
import com.example.chineselearning.data.model.Exercise
import com.example.chineselearning.data.model.ExerciseType
import com.example.chineselearning.data.model.MatchPairItem
import com.example.chineselearning.data.model.PictureOption

val bab23Stage2Part1Exercises = listOf(
    // 1. Soal 1: Pilihan Gambar (机场 -> bandara)
    Exercise(
        id = "u23_s2_p1_q1",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "机场",
        targetPinyin = "jīchǎng",
        targetTranslation = "bandara / bandar udara",
        correctAnswer = "bandara / bandar udara",
        audioToSpeak = "机场",
        pictureOptions = listOf(
            PictureOption("u23_s2_p1_opt1", "bandara", "", R.drawable.ic_tour_airport, true),
            PictureOption("u23_s2_p1_opt2", "tiket pesawat", "", R.drawable.ic_tour_flight_ticket, false),
            PictureOption("u23_s2_p1_opt3", "hotel", "", R.drawable.ic_tour_hotel, false),
            PictureOption("u23_s2_p1_opt4", "wisata", "", R.drawable.ic_tour_travel, false)
        )
    ),

    // 2. Soal 2: Susun Kalimat (Besok pagi saya harus pergi ke bandara menjemput teman.)
    Exercise(
        id = "u23_s2_p1_q2",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Besok pagi saya ke bandara jemput kawan.",
        targetHanzi = "明天 早上 我 去 机场 接 朋友。",
        targetPinyin = "Míngtiān zǎoshang wǒ qù jīchǎng jiē péngyou.",
        wordChips = listOf("明天:míngtiān", "早上:zǎoshang", "我:wǒ", "去:qù", "机场:jīchǎng", "接:jiē", "朋友。:péngyou.", "车站:chēzhàn"),
        correctAnswer = "明天,早上,我,去,机场,接,朋友。",
        audioToSpeak = "明天早上我去机场接朋友。"
    ),

    // 3. Soal 3: Ketuk Pasangan yang Sesuai (Bandara & Tiket Pesawat)
    Exercise(
        id = "u23_s2_p1_q3",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u23_s2_p1_m1", "机场", "jīchǎng", "bandara"),
            MatchPairItem("u23_s2_p1_m2", "机票", "jīpiào", "tiket pesawat"),
            MatchPairItem("u23_s2_p1_m3", "接朋友", "jiē péngyou", "jemput kawan"),
            MatchPairItem("u23_s2_p1_m4", "太贵了", "tài guì le", "terlalu mahal")
        )
    ),

    // 4. Soal 4: Ketik Pinyin (bandara -> jīchǎng)
    Exercise(
        id = "u23_s2_p1_q4",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "bandara / bandar udara",
        sentenceWithBlank = "机场 (________)",
        targetHanzi = "机场",
        targetPinyin = "jīchǎng",
        correctAnswer = "jichang",
        keyboardKeys = listOf("j", "i", "c", "h", "a", "n", "g", "e", "o", "u", "b", "d"),
        audioToSpeak = "机场"
    ),

    // 5. Soal 5: Mendengar Kalimat (Rule 10: illustrationRes = 0)
    Exercise(
        id = "u23_s2_p1_q5",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Apa yang Anda dengar?",
        targetTranslation = "Tiket pesawat menjelang Imlek sangat mahal.",
        targetHanzi = "春节 前 的 机票 很 贵。",
        targetPinyin = "Chūnjié qián de jīpiào hěn guì.",
        wordChips = listOf("春节:chūnjié", "前:qián", "的:de", "机票:jīpiào", "很:hěn", "贵。:guì.", "便宜:piányi"),
        correctAnswer = "春节,前,的,机票,很,贵。",
        illustrationRes = 0,
        audioToSpeak = "春节前的机票很贵。"
    ),

    // 6. Soal 6: Pilihan Kalimat
    Exercise(
        id = "u23_s2_p1_q6",
        type = ExerciseType.SENTENCE_CHOICE,
        title = "Pilih terjemahan yang benar",
        targetHanzi = "我 已经 买 好 了 去 北京 的 机票。",
        targetPinyin = "Wǒ yǐjīng mǎi hǎo le qù Běijīng de jīpiào.",
        targetTranslation = "Saya sudah membeli tiket pesawat ke Beijing.",
        correctAnswer = "Wǒ yǐjīng mǎi hǎo le qù Běijīng de jīpiào.\n我 已经 买 好 了 去 北京 的 机票。",
        options = listOf(
            "Wǒ yǐjīng mǎi hǎo le qù Běijīng de jīpiào.\n我 已经 买 好 了 去 北京 的 机票。",
            "Wǒ hái méi mǎi qù Běijīng de jīpiào.\n我 还 没 买 去 北京 的 机票。",
            "Tā yǐjīng mǎi hǎo le qù Shànghǎi de jīpiào.\n他 已经 买 好 了 去 上海 的 机票。"
        ),
        audioToSpeak = "我已经买好了去北京的机票。"
    ),

    // 7. Soal 7: Pilihan Gambar (机票 -> tiket pesawat)
    Exercise(
        id = "u23_s2_p1_q7",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "机票",
        targetPinyin = "jīpiào",
        targetTranslation = "tiket pesawat",
        correctAnswer = "tiket pesawat",
        audioToSpeak = "机票",
        pictureOptions = listOf(
            PictureOption("u23_s2_p1_opt7_1", "tiket pesawat", "", R.drawable.ic_tour_flight_ticket, true),
            PictureOption("u23_s2_p1_opt7_2", "bandara", "", R.drawable.ic_tour_airport, false),
            PictureOption("u23_s2_p1_opt7_3", "hotel", "", R.drawable.ic_tour_hotel, false),
            PictureOption("u23_s2_p1_opt7_4", "paspor", "", R.drawable.ic_tour_passport_abroad, false)
        )
    ),

    // 8. Soal 8: Ketik Pinyin (tiket pesawat -> jīpiào)
    Exercise(
        id = "u23_s2_p1_q8",
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

    // 9. Soal 9: Susun Kalimat (Dari sini naik taksi ke bandara sangat cepat.)
    Exercise(
        id = "u23_s2_p1_q9",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Dari sini naik taksi ke bandara cepat.",
        targetHanzi = "从 这里 打车 去 机场 很 快。",
        targetPinyin = "Cóng zhèlǐ dǎchē qù jīchǎng hěn kuài.",
        wordChips = listOf("从:cóng", "这里:zhèlǐ", "打车:dǎchē", "去:qù", "机场:jīchǎng", "很:hěn", "快。:kuài.", "慢:màn"),
        correctAnswer = "从,这里,打车,去,机场,很,快。",
        audioToSpeak = "从这里打车去机场很快。"
    ),

    // 10. Soal 10: Ketuk Pasangan yang Sesuai (Rangkuman Tiket Penerbangan)
    Exercise(
        id = "u23_s2_p1_m10",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u23_s2_p1_m10_1", "机票", "jīpiào", "tiket pesawat"),
            MatchPairItem("u23_s2_p1_m2", "机场", "jīchǎng", "bandar udara"),
            MatchPairItem("u23_s2_p1_m3", "买好机票", "mǎi hǎo jīpiào", "beli tiket"),
            MatchPairItem("u23_s2_p1_m4", "很便宜", "hěn piányi", "sangat murah")
        )
    )
)

val bab23Stage2Part2Exercises = listOf(
    // 1. Soal 1: Pilihan Gambar (飞 -> terbang / pesawat terbang)
    Exercise(
        id = "u23_s2_p2_q1",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "飞",
        targetPinyin = "fēi",
        targetTranslation = "terbang",
        correctAnswer = "terbang",
        audioToSpeak = "飞",
        pictureOptions = listOf(
            PictureOption("u23_s2_p2_opt1", "terbang", "", R.drawable.ic_tour_airplane_fly, true),
            PictureOption("u23_s2_p2_opt2", "hotel", "", R.drawable.ic_tour_hotel, false),
            PictureOption("u23_s2_p2_opt3", "tiket", "", R.drawable.ic_tour_flight_ticket, false),
            PictureOption("u23_s2_p2_opt4", "bandara", "", R.drawable.ic_tour_airport, false)
        )
    ),

    // 2. Soal 2: Susun Kalimat (Burung kecil terbang di langit biru.)
    Exercise(
        id = "u23_s2_p2_q2",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Burung terbang di langit biru.",
        targetHanzi = "小鸟 在 天空 上 飞。",
        targetPinyin = "Xiǎoniǎo zài tiānkōng shàng fēi.",
        wordChips = listOf("小鸟:xiǎoniǎo", "在:zài", "天空:tiānkōng", "上:shàng", "飞。:fēi.", "跑:pǎo"),
        correctAnswer = "小鸟,在,天空,上,飞。",
        audioToSpeak = "小鸟在天空上飞。"
    ),

    // 3. Soal 3: Ketuk Pasangan yang Sesuai (Tiket & Tiket Masuk)
    Exercise(
        id = "u23_s2_p2_m3",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u23_s2_p2_m1", "飞", "fēi", "terbang"),
            MatchPairItem("u23_s2_p2_m2", "票", "piào", "tiket / karcis"),
            MatchPairItem("u23_s2_p2_m3", "门票", "ménpiào", "tiket masuk"),
            MatchPairItem("u23_s2_p2_m4", "电影票", "diànyǐngpiào", "tiket bioskop")
        )
    ),

    // 4. Soal 4: Ketik Pinyin (terbang -> fēi)
    Exercise(
        id = "u23_s2_p2_q4",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "terbang",
        sentenceWithBlank = "飞 (________)",
        targetHanzi = "飞",
        targetPinyin = "fēi",
        correctAnswer = "fei",
        keyboardKeys = listOf("f", "e", "i", "a", "o", "u", "b", "d", "g", "h", "j", "l"),
        audioToSpeak = "飞"
    ),

    // 5. Soal 5: Mendengar Kalimat (Rule 10: illustrationRes = 0)
    Exercise(
        id = "u23_s2_p2_q5",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Apa yang Anda dengar?",
        targetTranslation = "Tiket masuk taman lima puluh yuan per lembar.",
        targetHanzi = "公园 的 门票 一 张 五十 块。",
        targetPinyin = "Gōngyuán de ménpiào yì zhāng wǔshí kuài.",
        wordChips = listOf("公园:gōngyuán", "的:de", "门票:ménpiào", "一:yì", "张:zhāng", "五十:wǔshí", "块。:kuài.", "百:bǎi"),
        correctAnswer = "公园,的,门票,一,张,五十,块。",
        illustrationRes = 0,
        audioToSpeak = "公园的门票一张五十块。"
    ),

    // 6. Soal 6: Pilihan Kalimat
    Exercise(
        id = "u23_s2_p2_q6",
        type = ExerciseType.SENTENCE_CHOICE,
        title = "Pilih terjemahan yang benar",
        targetHanzi = "电影票 已经 卖 完 了。",
        targetPinyin = "Diànyǐngpiào yǐjīng mài wán le.",
        targetTranslation = "Tiket bioskop sudah habis terjual.",
        correctAnswer = "Diànyǐngpiào yǐjīng mài wán le.\n电影票 已经 卖 完 了。",
        options = listOf(
            "Diànyǐngpiào yǐjīng mài wán le.\n电影票 已经 卖 完 了。",
            "Diànyǐngpiào hái méi mài wán.\n电影票 还 没 卖 完。",
            "Jīpiào yǐjīng mài wán le.\n机票 已经 卖 完 了。"
        ),
        audioToSpeak = "电影票已经卖完了。"
    ),

    // 7. Soal 7: Pilihan Gambar (门票 -> tiket masuk tempat wisata)
    Exercise(
        id = "u23_s2_p2_q7",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "门票",
        targetPinyin = "ménpiào",
        targetTranslation = "tiket masuk",
        correctAnswer = "tiket masuk",
        audioToSpeak = "门票",
        pictureOptions = listOf(
            PictureOption("u23_s2_p2_opt7_1", "tiket masuk", "", R.drawable.ic_tour_flight_ticket, true),
            PictureOption("u23_s2_p2_opt7_2", "terbang", "", R.drawable.ic_tour_airplane_fly, false),
            PictureOption("u23_s2_p2_opt7_3", "hotel", "", R.drawable.ic_tour_hotel, false),
            PictureOption("u23_s2_p2_opt7_4", "bandara", "", R.drawable.ic_tour_airport, false)
        )
    ),

    // 8. Soal 8: Ketik Pinyin (tiket masuk -> ménpiào)
    Exercise(
        id = "u23_s2_p2_q8",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "tiket masuk",
        sentenceWithBlank = "门票 (________)",
        targetHanzi = "门票",
        targetPinyin = "ménpiào",
        correctAnswer = "menpiao",
        keyboardKeys = listOf("m", "e", "n", "p", "i", "a", "o", "u", "b", "d", "g", "h"),
        audioToSpeak = "门票"
    ),

    // 9. Soal 9: Susun Kalimat (Pesawat terbang sangat tinggi di awan.)
    Exercise(
        id = "u23_s2_p2_q9",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Pesawat terbang sangat tinggi.",
        targetHanzi = "飞机 飞 得 很 高。",
        targetPinyin = "Fēijī fēi de hěn gāo.",
        wordChips = listOf("飞机:fēijī", "飞:fēi", "得:de", "很:hěn", "高。:gāo.", "快:kuài"),
        correctAnswer = "飞机,飞,得,很,高。",
        audioToSpeak = "飞机飞得很高。"
    ),

    // 10. Soal 10: Ketuk Pasangan yang Sesuai (Rangkuman Tiket Masuk & Tiket)
    Exercise(
        id = "u23_s2_p2_m10",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u23_s2_p2_m10_1", "门票", "ménpiào", "tiket masuk"),
            MatchPairItem("u23_s2_p2_m10_2", "票", "piào", "tiket / karcis"),
            MatchPairItem("u23_s2_p2_m3", "飞得高", "fēi de gāo", "terbang tinggi"),
            MatchPairItem("u23_s2_p2_m4", "一张票", "yì zhāng piào", "selembar tiket")
        )
    )
)
