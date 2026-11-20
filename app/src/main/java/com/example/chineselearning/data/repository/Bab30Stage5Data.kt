package com.example.chineselearning.data.repository

import com.example.chineselearning.R
import com.example.chineselearning.data.model.Exercise
import com.example.chineselearning.data.model.ExerciseType
import com.example.chineselearning.data.model.MatchPairItem
import com.example.chineselearning.data.model.PictureOption

val bab30Stage5Part1Exercises = listOf(
    // 1. Soal 1: Pilihan Gambar (完 -> selesai / habis tuntas)
    Exercise(
        id = "u30_s5_p1_q1",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "完",
        targetPinyin = "wán",
        targetTranslation = "selesai / habis",
        correctAnswer = "selesai / habis",
        audioToSpeak = "完",
        pictureOptions = listOf(
            PictureOption("u30_s5_p1_opt1", "selesai", "", R.drawable.ic_eval_mastery_trophy, true),
            PictureOption("u30_s5_p1_opt2", "mall", "", R.drawable.ic_shop_mall_plaza, false),
            PictureOption("u30_s5_p1_opt3", "pekan", "", R.drawable.ic_cal_week_cycle, false),
            PictureOption("u30_s5_p1_opt4", "cerah", "", R.drawable.ic_weather_sunny_clear, false)
        )
    ),

    // 2. Soal 2: Susun Kalimat (Selesai mengerjakan tugas PR kita bisa pergi bermain bola.)
    Exercise(
        id = "u30_s5_p1_q2",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Selesai PR kita pergi main bola.",
        targetHanzi = "做完 作业 去 踢球。",
        targetPinyin = "Zuòwán zuòyè qù tīqiú.",
        wordChips = listOf("做完:zuòwán", "作业:zuòyè", "去:qù", "踢球。:tīqiú.", "睡觉:shuìjiào"),
        correctAnswer = "做完,作业,去,踢球。",
        audioToSpeak = "做完作业去踢球。"
    ),

    // 3. Soal 3: Ketuk Pasangan yang Sesuai (Selesai & Bersama-sama)
    Exercise(
        id = "u30_s5_p1_m3",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u30_s5_p1_m1", "完", "wán", "selesai"),
            MatchPairItem("u30_s5_p1_m2", "一起", "yìqǐ", "bersama-sama"),
            MatchPairItem("u30_s5_p1_m3", "吃完", "chī wán", "selesai makan"),
            MatchPairItem("u30_s5_p1_m4", "大家一起", "dàjiā yìqǐ", "kita semua bersama")
        )
    ),

    // 4. Soal 4: Ketik Pinyin (selesai -> wán)
    Exercise(
        id = "u30_s5_p1_q4",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "selesai / habis",
        sentenceWithBlank = "完 (________)",
        targetHanzi = "完",
        targetPinyin = "wán",
        correctAnswer = "wan",
        keyboardKeys = listOf("w", "a", "n", "e", "i", "o", "u", "b", "d", "g", "h", "j"),
        audioToSpeak = "完"
    ),

    // 5. Soal 5: Mendengar Kalimat (Rule 10: illustrationRes = 0)
    Exercise(
        id = "u30_s5_p1_q5",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Apa yang Anda dengar?",
        targetTranslation = "Mari kita bersama-sama belajar bahasa Mandarin!",
        targetHanzi = "我们 一起 学 汉语 吧！",
        targetPinyin = "Wǒmen yìqǐ xué Hànyǔ ba!",
        wordChips = listOf("我们:wǒmen", "一起:yìqǐ", "学:xué", "汉语:Hànyǔ", "吧！:ba.", "玩:wán"),
        correctAnswer = "我们,一起,学,汉语,吧！",
        illustrationRes = 0,
        audioToSpeak = "我们一起学汉语吧！"
    ),

    // 6. Soal 6: Pilihan Kalimat
    Exercise(
        id = "u30_s5_p1_q6",
        type = ExerciseType.SENTENCE_CHOICE,
        title = "Pilih terjemahan yang benar",
        targetHanzi = "这 本 书 我 已经 看 完 了。",
        targetPinyin = "Zhè běn shū wǒ yǐjīng kàn wán le.",
        targetTranslation = "Buku ini saya sudah selesai membacanya.",
        correctAnswer = "Zhè běn shū wǒ yǐjīng kàn wán le.\n这 本 书 我 已经 看 完 了。",
        options = listOf(
            "Zhè běn shū wǒ yǐjīng kàn wán le.\n这 本 书 我 已经 看 完 了。",
            "Zhè běn shū wǒ hái méi kàn wán.\n这 本 书 我 还 没 看 完。",
            "Nà běn shū wǒ yǐjīng kàn wán le.\n那 本 书 我 已经 看 完 了。"
        ),
        audioToSpeak = "这本书我已经看完了。"
    ),

    // 7. Soal 7: Pilihan Gambar (一起 -> bersama-sama)
    Exercise(
        id = "u30_s5_p1_q7",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "一起",
        targetPinyin = "yìqǐ",
        targetTranslation = "bersama-sama",
        correctAnswer = "bersama-sama",
        audioToSpeak = "一起",
        pictureOptions = listOf(
            PictureOption("u30_s5_p1_opt7_1", "bersama", "", R.drawable.ic_eval_mastery_trophy, true),
            PictureOption("u30_s5_p1_opt7_2", "mall", "", R.drawable.ic_shop_mall_plaza, false),
            PictureOption("u30_s5_p1_opt7_3", "pekan", "", R.drawable.ic_cal_week_cycle, false),
            PictureOption("u30_s5_p1_opt7_4", "cerah", "", R.drawable.ic_weather_sunny_clear, false)
        )
    ),

    // 8. Soal 8: Ketik Pinyin (bersama-sama -> yìqǐ)
    Exercise(
        id = "u30_s5_p1_q8",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "bersama-sama",
        sentenceWithBlank = "一起 (________)",
        targetHanzi = "一起",
        targetPinyin = "yìqǐ",
        correctAnswer = "yiqi",
        keyboardKeys = listOf("y", "i", "q", "a", "e", "o", "u", "b", "d", "g", "h", "j"),
        audioToSpeak = "一起"
    ),

    // 9. Soal 9: Susun Kalimat (Kalian makan bersama-sama.)
    Exercise(
        id = "u30_s5_p1_q9",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Kalian makan bersama-sama.",
        targetHanzi = "你们 一起 吃 饭。",
        targetPinyin = "Nǐmen yìqǐ chī fàn.",
        wordChips = listOf("你们:nǐmen", "一起:yìqǐ", "吃:chī", "饭。:fàn.", "去:qù"),
        correctAnswer = "你们,一起,吃,饭。",
        audioToSpeak = "你们一起吃饭。"
    ),

    // 10. Soal 10: Ketuk Pasangan yang Sesuai (Rangkuman Selesai & Kolaborasi)
    Exercise(
        id = "u30_s5_p1_m10",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u30_s5_p1_m10_1", "学完", "xué wán", "tamat belajar"),
            MatchPairItem("u30_s5_p1_m10_2", "一起走", "yìqǐ zǒu", "jalan bersama"),
            MatchPairItem("u30_s5_p1_m3", "看完了", "kàn wán le", "tuntas baca"),
            MatchPairItem("u30_s5_p1_m4", "很高兴", "hěn gāoxìng", "sukacita")
        )
    )
)

val bab30Stage5Part2Exercises = listOf(
    // 1. Soal 1: Pilihan Gambar (做完 -> selesai mengerjakan)
    Exercise(
        id = "u30_s5_p2_q1",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "做完",
        targetPinyin = "zuòwán",
        targetTranslation = "selesai mengerjakan",
        correctAnswer = "selesai mengerjakan",
        audioToSpeak = "做完",
        pictureOptions = listOf(
            PictureOption("u30_s5_p2_opt1", "selesai", "", R.drawable.ic_eval_mastery_trophy, true),
            PictureOption("u30_s5_p2_opt2", "mall", "", R.drawable.ic_shop_mall_plaza, false),
            PictureOption("u30_s5_p2_opt3", "pekan", "", R.drawable.ic_cal_week_cycle, false),
            PictureOption("u30_s5_p2_opt4", "mendung", "", R.drawable.ic_weather_overcast_cloud, false)
        )
    ),

    // 2. Soal 2: Susun Kalimat (Semua orang sudah selesai mengerjakan soal ujian.)
    Exercise(
        id = "u30_s5_p2_q2",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Semua sudah selesai mengerjakan soal.",
        targetHanzi = "大家 都 做完 题 了。",
        targetPinyin = "Dàjiā dōu zuòwán tí le.",
        wordChips = listOf("大家:dàjiā", "都:dōu", "做完:zuòwán", "题:tí", "了。:le.", "没:méi"),
        correctAnswer = "大家,都,做完,题,了。",
        audioToSpeak = "大家都做完题了。"
    ),

    // 3. Soal 3: Ketuk Pasangan yang Sesuai (Tuntas Mengerjakan)
    Exercise(
        id = "u30_s5_p2_m3",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u30_s5_p2_m1", "做完", "zuòwán", "selesai bikin"),
            MatchPairItem("u30_s5_p2_m2", "大家", "dàjiā", "semua orang"),
            MatchPairItem("u30_s5_p2_m3", "写完", "xiě wán", "selesai tulis"),
            MatchPairItem("u30_s5_p2_m4", "听懂", "tīng dǒng", "paham dengar")
        )
    ),

    // 4. Soal 4: Ketik Pinyin (selesai mengerjakan -> zuòwán)
    Exercise(
        id = "u30_s5_p2_q4",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "selesai membuat",
        sentenceWithBlank = "做完 (________)",
        targetHanzi = "做完",
        targetPinyin = "zuòwán",
        correctAnswer = "zuowan",
        keyboardKeys = listOf("z", "u", "o", "w", "a", "n", "e", "i", "b", "d", "g", "h"),
        audioToSpeak = "做完"
    ),

    // 5. Soal 5: Mendengar Kalimat (Rule 10: illustrationRes = 0)
    Exercise(
        id = "u30_s5_p2_q5",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Apa yang Anda dengar?",
        targetTranslation = "Kami bersama-sama pergi ke mall berbelanja.",
        targetHanzi = "我们 一起 去 商场 买 东西。",
        targetPinyin = "Wǒmen yìqǐ qù shāngchǎng mǎi dōngxi.",
        wordChips = listOf("我们:wǒmen", "一起:yìqǐ", "去:qù", "商场:shāngchǎng", "买:mǎi", "东西。:dōngxi.", "卖:mài"),
        correctAnswer = "我们,一起,去,商场,买,东西。",
        illustrationRes = 0,
        audioToSpeak = "我们一起去商场买东西。"
    ),

    // 6. Soal 6: Pilihan Kalimat
    Exercise(
        id = "u30_s5_p2_q6",
        type = ExerciseType.SENTENCE_CHOICE,
        title = "Pilih terjemahan yang benar",
        targetHanzi = "大家 都 考 完 了， 真 高兴！",
        targetPinyin = "Dàjiā dōu kǎo wán le, zhēn gāoxìng!",
        targetTranslation = "Semua orang telah selesai ujian, sungguh senang!",
        correctAnswer = "Dàjiā dōu kǎo wán le, zhēn gāoxìng!\n大家 都 考 完 了， 真 高兴！",
        options = listOf(
            "Dàjiā dōu kǎo wán le, zhēn gāoxìng!\n大家 都 考 完 了， 真 高兴！",
            "Dàjiā dōu kǎo wán le, zhēn nánguò!\n大家 都 考 完 了， 真 难过！",
            "Tāmen hái méi kǎo wán.\n他们 还 没 考 完。"
        ),
        audioToSpeak = "大家都考完了，真高兴！"
    ),

    // 7. Soal 7: Pilihan Gambar (大家 -> semua orang)
    Exercise(
        id = "u30_s5_p2_q7",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "大家",
        targetPinyin = "dàjiā",
        targetTranslation = "semua orang",
        correctAnswer = "semua orang",
        audioToSpeak = "大家",
        pictureOptions = listOf(
            PictureOption("u30_s5_p2_opt7_1", "semua orang", "", R.drawable.ic_eval_mastery_trophy, true),
            PictureOption("u30_s5_p2_opt7_2", "mall", "", R.drawable.ic_shop_mall_plaza, false),
            PictureOption("u30_s5_p2_opt7_3", "pekan", "", R.drawable.ic_cal_week_cycle, false),
            PictureOption("u30_s5_p2_opt7_4", "cerah", "", R.drawable.ic_weather_sunny_clear, false)
        )
    ),

    // 8. Soal 8: Ketik Pinyin (semua orang -> dàjiā)
    Exercise(
        id = "u30_s5_p2_q8",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "semua orang",
        sentenceWithBlank = "大家 (________)",
        targetHanzi = "大家",
        targetPinyin = "dàjiā",
        correctAnswer = "dajia",
        keyboardKeys = listOf("d", "a", "j", "i", "e", "o", "u", "b", "g", "h", "l", "m"),
        audioToSpeak = "大家"
    ),

    // 9. Soal 9: Susun Kalimat (Selamat kepada kalian semua telah menuntaskan pembelajaran!)
    Exercise(
        id = "u30_s5_p2_q9",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Kalian semua belajar dengan sangat baik.",
        targetHanzi = "大家 学 得 真 好。",
        targetPinyin = "Dàjiā xué de zhēn hǎo.",
        wordChips = listOf("大家:dàjiā", "学:xué", "得:de", "真:zhēn", "好。:hǎo.", "慢:màn"),
        correctAnswer = "大家,学,得,真,好。",
        audioToSpeak = "大家学得真好。"
    ),

    // 10. Soal 10: Ketuk Pasangan yang Sesuai (Rangkuman Prestasi Akhir)
    Exercise(
        id = "u30_s5_p2_m10",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u30_s5_p2_m10_1", "考完了", "kǎo wán le", "selesai ujian"),
            MatchPairItem("u30_s5_p2_m10_2", "真高兴", "zhēn gāoxìng", "sangat gembira"),
            MatchPairItem("u30_s5_p2_m3", "学得好", "xué de hǎo", "belajar unggul"),
            MatchPairItem("u30_s5_p2_m4", "做完了", "zuò wán le", "tuntas tuntas")
        )
    )
)
