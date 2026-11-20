package com.example.chineselearning.data.repository

import com.example.chineselearning.R
import com.example.chineselearning.data.model.Exercise
import com.example.chineselearning.data.model.ExerciseType
import com.example.chineselearning.data.model.MatchPairItem
import com.example.chineselearning.data.model.PictureOption

val bab30Stage1Part1Exercises = listOf(
    // 1. Soal 1: Pilihan Gambar (万 -> sepuluh ribu / 10.000)
    Exercise(
        id = "u30_s1_p1_q1",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "万",
        targetPinyin = "wàn",
        targetTranslation = "sepuluh ribu (10.000)",
        correctAnswer = "sepuluh ribu (10.000)",
        audioToSpeak = "万",
        pictureOptions = listOf(
            PictureOption("u30_s1_p1_opt1", "sepuluh ribu", "", R.drawable.ic_fin_ten_thousand, true),
            PictureOption("u30_s1_p1_opt2", "pusat belanja", "", R.drawable.ic_shop_mall_plaza, false),
            PictureOption("u30_s1_p1_opt3", "pekan", "", R.drawable.ic_cal_week_cycle, false),
            PictureOption("u30_s1_p1_opt4", "trofi", "", R.drawable.ic_eval_mastery_trophy, false)
        )
    ),

    // 2. Soal 2: Susun Kalimat (Sepeda motor baru ini seharga sepuluh ribu yuan.)
    Exercise(
        id = "u30_s1_p1_q2",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Motor baru ini sepuluh ribu yuan.",
        targetHanzi = "这辆 新车 要 一万 块 钱。",
        targetPinyin = "Zhè liàng xīnchē yào yíwàn kuài qián.",
        wordChips = listOf("这辆:zhè liàng", "新车:xīnchē", "要:yào", "一万:yíwàn", "块:kuài", "钱。:qián.", "千:qiān"),
        correctAnswer = "这辆,新车,要,一万,块,钱。",
        audioToSpeak = "这辆新车要一万块钱。"
    ),

    // 3. Soal 3: Ketuk Pasangan yang Sesuai (Puluhan Ribu & Mall)
    Exercise(
        id = "u30_s1_p1_q3",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u30_s1_p1_m1", "万", "wàn", "sepuluh ribu (10.000)"),
            MatchPairItem("u30_s1_p1_m2", "商场", "shāngchǎng", "mall / pusat belanja"),
            MatchPairItem("u30_s1_p1_m3", "一万块", "yíwàn kuài", "sepuluh ribu yuan"),
            MatchPairItem("u30_s1_p1_m4", "大商场", "dà shāngchǎng", "mall besar")
        )
    ),

    // 4. Soal 4: Ketik Pinyin (sepuluh ribu -> wàn)
    Exercise(
        id = "u30_s1_p1_q4",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "sepuluh ribu (10.000)",
        sentenceWithBlank = "万 (________)",
        targetHanzi = "万",
        targetPinyin = "wàn",
        correctAnswer = "wan",
        keyboardKeys = listOf("w", "a", "n", "e", "i", "o", "u", "b", "d", "g", "h", "j"),
        audioToSpeak = "万"
    ),

    // 5. Soal 5: Mendengar Kalimat (Rule 10: illustrationRes = 0)
    Exercise(
        id = "u30_s1_p1_q5",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Apa yang Anda dengar?",
        targetTranslation = "Akhir pekan banyak orang pergi ke mall besar berbelanja.",
        targetHanzi = "周末 很多 人 去 大 商场 购物。",
        targetPinyin = "Zhōumò hěn duō rén qù dà shāngchǎng gòuwù.",
        wordChips = listOf("周末:zhōumò", "很多:hěn duō", "人:rén", "去:qù", "大:dà", "商场:shāngchǎng", "购物。:gòuwù.", "学校:xuéxiào"),
        correctAnswer = "周末,很多,人,去,大,商场,购物。",
        illustrationRes = 0,
        audioToSpeak = "周末很多人去大商场购物。"
    ),

    // 6. Soal 6: Pilihan Kalimat
    Exercise(
        id = "u30_s1_p1_q6",
        type = ExerciseType.SENTENCE_CHOICE,
        title = "Pilih terjemahan yang benar",
        targetHanzi = "这个 城市 有 两万 个 学生。",
        targetPinyin = "Zhège chéngshì yǒu liǎngwàn gè xuéshēng.",
        targetTranslation = "Kota ini memiliki dua puluh ribu orang siswa.",
        correctAnswer = "Zhège chéngshì yǒu liǎngwàn gè xuéshēng.\n这个 城市 有 两万 个 学生。",
        options = listOf(
            "Zhège chéngshì yǒu liǎngwàn gè xuéshēng.\n这个 城市 有 两万 个 学生。",
            "Zhège chéngshì yǒu yíwàn gè xuéshēng.\n这个 城市 有 一万 个 学生。",
            "Zhè suǒ xuéxiào yǒu liǎngwàn gè xuéshēng.\n这 所 学校 有 两万 个 学生。"
        ),
        audioToSpeak = "这个城市有两万个学生。"
    ),

    // 7. Soal 7: Pilihan Gambar (商场 -> mall pusat belanja)
    Exercise(
        id = "u30_s1_p1_q7",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "商场",
        targetPinyin = "shāngchǎng",
        targetTranslation = "pusat perbelanjaan / mall",
        correctAnswer = "pusat perbelanjaan / mall",
        audioToSpeak = "商场",
        pictureOptions = listOf(
            PictureOption("u30_s1_p1_opt7_1", "mall", "", R.drawable.ic_shop_mall_plaza, true),
            PictureOption("u30_s1_p1_opt7_2", "sepuluh ribu", "", R.drawable.ic_fin_ten_thousand, false),
            PictureOption("u30_s1_p1_opt7_3", "pekan", "", R.drawable.ic_cal_week_cycle, false),
            PictureOption("u30_s1_p1_opt7_4", "cerah", "", R.drawable.ic_weather_sunny_clear, false)
        )
    ),

    // 8. Soal 8: Ketik Pinyin (mall -> shāngchǎng)
    Exercise(
        id = "u30_s1_p1_q8",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "pusat perbelanjaan / mall",
        sentenceWithBlank = "商场 (________)",
        targetHanzi = "商场",
        targetPinyin = "shāngchǎng",
        correctAnswer = "shangchang",
        keyboardKeys = listOf("s", "h", "a", "n", "g", "c", "e", "i", "o", "u", "b", "d"),
        audioToSpeak = "商场"
    ),

    // 9. Soal 9: Susun Kalimat (Hari ini saya berjalan dua puluh ribu langkah.)
    Exercise(
        id = "u30_s1_p1_q9",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Hari ini saya jalan 20.000 langkah.",
        targetHanzi = "今天 我 走 了 两万 步。",
        targetPinyin = "Jīntiān wǒ zǒu le liǎngwàn bù.",
        wordChips = listOf("今天:jīntiān", "我:wǒ", "走:zǒu", "了:le", "两万:liǎngwàn", "步。:bù.", "一万:yíwàn"),
        correctAnswer = "今天,我,走,了,两万,步。",
        audioToSpeak = "今天我走了两万步。"
    ),

    // 10. Soal 10: Ketuk Pasangan yang Sesuai (Rangkuman Hitungan Sepuluh Ribu)
    Exercise(
        id = "u30_s1_p1_m10",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u30_s1_p1_m10_1", "万", "wàn", "sepuluh ribu"),
            MatchPairItem("u30_s1_p1_m10_2", "两万", "liǎngwàn", "dua puluh ribu"),
            MatchPairItem("u30_s1_p1_m10_3", "大商场", "dà shāngchǎng", "mall megah"),
            MatchPairItem("u30_s1_p1_m10_4", "买东西", "mǎi dōngxi", "belanja barang")
        )
    )
)

val bab30Stage1Part2Exercises = listOf(
    // 1. Soal 1: Pilihan Gambar (商场 -> mall belanja)
    Exercise(
        id = "u30_s1_p2_q1",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "商场",
        targetPinyin = "shāngchǎng",
        targetTranslation = "mall",
        correctAnswer = "mall",
        audioToSpeak = "商场",
        pictureOptions = listOf(
            PictureOption("u30_s1_p2_opt1", "mall", "", R.drawable.ic_shop_mall_plaza, true),
            PictureOption("u30_s1_p2_opt2", "uang 10.000", "", R.drawable.ic_fin_ten_thousand, false),
            PictureOption("u30_s1_p2_opt3", "pekan", "", R.drawable.ic_cal_week_cycle, false),
            PictureOption("u30_s1_p2_opt4", "piala", "", R.drawable.ic_eval_mastery_trophy, false)
        )
    ),

    // 2. Soal 2: Susun Kalimat (Di dalam mall ada banyak restoran.)
    Exercise(
        id = "u30_s1_p2_q2",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Di dalam mall ada banyak restoran.",
        targetHanzi = "商场 里 有 很多 饭馆。",
        targetPinyin = "Shāngchǎng lǐ yǒu hěn duō fànguǎn.",
        wordChips = listOf("商场:shāngchǎng", "里:lǐ", "有:yǒu", "很多:hěn duō", "饭馆。:fànguǎn.", "学校:xuéxiào"),
        correctAnswer = "商场,里,有,很多,饭馆。",
        audioToSpeak = "商场里有很多饭馆。"
    ),

    // 3. Soal 3: Ketuk Pasangan yang Sesuai (Angka Besar & Toko)
    Exercise(
        id = "u30_s1_p2_m3",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u30_s1_p2_m1", "一万", "yíwàn", "10.000"),
            MatchPairItem("u30_s1_p2_m2", "商场里", "shāngchǎng lǐ", "di dalam mall"),
            MatchPairItem("u30_s1_p2_m3", "两万块", "liǎngwàn kuài", "20.000 yuan"),
            MatchPairItem("u30_s1_p2_m4", "很多饭馆", "hěn duō fànguǎn", "banyak restoran")
        )
    ),

    // 4. Soal 4: Ketik Pinyin (sepuluh ribu -> yíwàn)
    Exercise(
        id = "u30_s1_p2_q4",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "sepuluh ribu",
        sentenceWithBlank = "一万 (________)",
        targetHanzi = "一万",
        targetPinyin = "yíwàn",
        correctAnswer = "yiwan",
        keyboardKeys = listOf("y", "i", "w", "a", "n", "e", "o", "u", "b", "d", "g", "h"),
        audioToSpeak = "一万"
    ),

    // 5. Soal 5: Mendengar Kalimat (Rule 10: illustrationRes = 0)
    Exercise(
        id = "u30_s1_p2_q5",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Apa yang Anda dengar?",
        targetTranslation = "Saya ingin pergi ke mall membeli baju.",
        targetHanzi = "我 想 去 商场 买 衣服。",
        targetPinyin = "Wǒ xiǎng qù shāngchǎng mǎi yīfu.",
        wordChips = listOf("我:wǒ", "想:xiǎng", "去:qù", "商场:shāngchǎng", "买:mǎi", "衣服。:yīfu.", "卖:mài"),
        correctAnswer = "我,想,去,商场,买,衣服。",
        illustrationRes = 0,
        audioToSpeak = "我想去商场买衣服。"
    ),

    // 6. Soal 6: Pilihan Kalimat
    Exercise(
        id = "u30_s1_p2_q6",
        type = ExerciseType.SENTENCE_CHOICE,
        title = "Pilih terjemahan yang benar",
        targetHanzi = "那 部 手机 要 一万 块 钱。",
        targetPinyin = "Nà bù shǒujī yào yíwàn kuài qián.",
        targetTranslation = "Ponsel itu harganya sepuluh ribu yuan.",
        correctAnswer = "Nà bù shǒujī yào yíwàn kuài qián.\n那 部 手机 要 一万 块 钱。",
        options = listOf(
            "Nà bù shǒujī yào yíwàn kuài qián.\n那 部 手机 要 一万 块 钱。",
            "Nà bù shǒujī yào liǎngwàn kuài qián.\n那 部 手机 要 两万 块 钱。",
            "Zhè bù shǒujī yào yíwàn kuài qián.\n这 部 手机 要 一万 块 钱。"
        ),
        audioToSpeak = "那部手机要一万块钱。"
    ),

    // 7. Soal 7: Pilihan Gambar (万 -> 10.000)
    Exercise(
        id = "u30_s1_p2_q7",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "万",
        targetPinyin = "wàn",
        targetTranslation = "10.000",
        correctAnswer = "10.000",
        audioToSpeak = "万",
        pictureOptions = listOf(
            PictureOption("u30_s1_p2_opt7_1", "10.000", "", R.drawable.ic_fin_ten_thousand, true),
            PictureOption("u30_s1_p2_opt7_2", "mall", "", R.drawable.ic_shop_mall_plaza, false),
            PictureOption("u30_s1_p2_opt7_3", "pekan", "", R.drawable.ic_cal_week_cycle, false),
            PictureOption("u30_s1_p2_opt7_4", "cerah", "", R.drawable.ic_weather_sunny_clear, false)
        )
    ),

    // 8. Soal 8: Ketik Pinyin (dua puluh ribu -> liǎngwàn)
    Exercise(
        id = "u30_s1_p2_q8",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "dua puluh ribu",
        sentenceWithBlank = "两万 (________)",
        targetHanzi = "两万",
        targetPinyin = "liǎngwàn",
        correctAnswer = "liangwan",
        keyboardKeys = listOf("l", "i", "a", "n", "g", "w", "e", "o", "u", "b", "d", "h"),
        audioToSpeak = "两万"
    ),

    // 9. Soal 9: Susun Kalimat (Mall ini buka pada pukul sembilan pagi.)
    Exercise(
        id = "u30_s1_p2_q9",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Mall buka jam sembilan pagi.",
        targetHanzi = "商场 早上 九点 开门。",
        targetPinyin = "Shāngchǎng zǎoshang jiǔdiǎn kāimén.",
        wordChips = listOf("商场:shāngchǎng", "早上:zǎoshang", "九点:jiǔdiǎn", "开门。:kāimén.", "关门:guānmén"),
        correctAnswer = "商场,早上,九点,开门。",
        audioToSpeak = "商场早上九点开门。"
    ),

    // 10. Soal 10: Ketuk Pasangan yang Sesuai (Rangkuman Mall & Finansial)
    Exercise(
        id = "u30_s1_p2_m10",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u30_s1_p2_m10_1", "商场开门", "shāngchǎng kāimén", "mall buka"),
            MatchPairItem("u30_s1_p2_m10_2", "一万块", "yíwàn kuài", "10 ribu yuan"),
            MatchPairItem("u30_s1_p2_m10_3", "买新衣服", "mǎi xīn yīfu", "beli baju baru"),
            MatchPairItem("u30_s1_p2_m10_4", "太贵了", "tài guì le", "kemahalan")
        )
    )
)
