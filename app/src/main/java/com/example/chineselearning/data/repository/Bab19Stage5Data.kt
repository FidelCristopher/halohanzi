package com.example.chineselearning.data.repository

import com.example.chineselearning.R
import com.example.chineselearning.data.model.Exercise
import com.example.chineselearning.data.model.ExerciseType
import com.example.chineselearning.data.model.MatchPairItem
import com.example.chineselearning.data.model.PictureOption

val bab19Stage5Part1Exercises = listOf(
    // 1. Soal 1: Pilihan Gambar (洗手间 -> toilet / kamar kecil)
    Exercise(
        id = "u19_s5_p1_q1",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "洗手间",
        targetPinyin = "xǐshǒujiān",
        targetTranslation = "toilet / kamar kecil",
        correctAnswer = "toilet / kamar kecil",
        audioToSpeak = "洗手间",
        pictureOptions = listOf(
            PictureOption("u19_s5_p1_opt1", "toilet", "", R.drawable.ic_food_restaurant, true),
            PictureOption("u19_s5_p1_opt2", "teh", "", R.drawable.ic_food_tea, false),
            PictureOption("u19_s5_p1_opt3", "hidangan", "", R.drawable.ic_food_chinese_cuisine, false),
            PictureOption("u19_s5_p1_opt4", "cangkir", "", R.drawable.ic_food_cup, false)
        )
    ),

    // 2. Soal 2: Susun Kalimat (Permisi toilet di lantai berapa?)
    Exercise(
        id = "u19_s5_p1_q2",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Permisi toilet di lantai berapa?",
        targetHanzi = "请问 洗手间 在 几 楼？",
        targetPinyin = "Qǐngwèn xǐshǒujiān zài jǐ lóu?",
        wordChips = listOf("请问:qǐngwèn", "洗手间:xǐshǒujiān", "在:zài", "几:jǐ", "楼？:lóu?", "哪儿:nǎr"),
        correctAnswer = "请问,洗手间,在,几,楼？",
        audioToSpeak = "请问洗手间在几楼？"
    ),

    // 3. Soal 3: Ketuk Pasangan yang Sesuai (Toilet & Mencuci)
    Exercise(
        id = "u19_s5_p1_q3",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u19_s5_p1_m1", "洗", "xǐ", "mencuci"),
            MatchPairItem("u19_s5_p1_m2", "洗手间", "xǐshǒujiān", "toilet"),
            MatchPairItem("u19_s5_p1_m3", "请问", "qǐngwèn", "permisi tanya"),
            MatchPairItem("u19_s5_p1_m4", "水果", "shuǐguǒ", "buah-buahan")
        )
    ),

    // 4. Soal 4: Ketik Pinyin (mencuci -> xǐ)
    Exercise(
        id = "u19_s5_p1_q4",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "mencuci",
        sentenceWithBlank = "洗 (________)",
        targetHanzi = "洗",
        targetPinyin = "xǐ",
        correctAnswer = "xi",
        keyboardKeys = listOf("x", "i", "a", "e", "o", "u", "b", "d", "g", "h", "j", "l"),
        audioToSpeak = "洗"
    ),

    // 5. Soal 5: Mendengar Kalimat (Rule 10: illustrationRes = 0)
    Exercise(
        id = "u19_s5_p1_q5",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Apa yang Anda dengar?",
        targetTranslation = "Sebelum makan buah harus dicuci dulu.",
        targetHanzi = "吃 水果 前 要 先 洗。",
        targetPinyin = "Chī shuǐguǒ qián yào xiān xǐ.",
        wordChips = listOf("吃:chī", "水果:shuǐguǒ", "前:qián", "要:yào", "先:xiān", "洗。:xǐ.", "喝:hē"),
        correctAnswer = "吃,水果,前,要,先,洗。",
        illustrationRes = 0,
        audioToSpeak = "吃水果前要先洗。"
    ),

    // 6. Soal 6: Pilihan Kalimat
    Exercise(
        id = "u19_s5_p1_q6",
        type = ExerciseType.SENTENCE_CHOICE,
        title = "Pilih terjemahan yang benar",
        targetHanzi = "洗手间 在 饭馆 的 后面。",
        targetPinyin = "Xǐshǒujiān zài fànguǎn de hòumiàn.",
        targetTranslation = "Toilet berada di bagian belakang restoran.",
        correctAnswer = "Xǐshǒujiān zài fànguǎn de hòumiàn.\n洗手间 在 饭馆 的 后面。",
        options = listOf(
            "Xǐshǒujiān zài fànguǎn de hòumiàn.\n洗手间 在 饭馆 的 后面。",
            "Xǐshǒujiān zài fànguǎn de qiánmiàn.\n洗手间 在 饭馆 的 前面。",
            "Fànguǎn zài xǐshǒujiān de hòumiàn.\n饭馆 在 洗手间 的 后面。"
        ),
        audioToSpeak = "洗手间在饭馆的后面。"
    ),

    // 7. Soal 7: Pilihan Gambar (洗 -> mencuci)
    Exercise(
        id = "u19_s5_p1_q7",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "洗",
        targetPinyin = "xǐ",
        targetTranslation = "mencuci",
        correctAnswer = "mencuci",
        audioToSpeak = "洗",
        pictureOptions = listOf(
            PictureOption("u19_s5_p1_opt7_1", "mencuci", "", R.drawable.ic_hand_wave, true),
            PictureOption("u19_s5_p1_opt7_2", "restoran", "", R.drawable.ic_food_restaurant, false),
            PictureOption("u19_s5_p1_opt7_3", "teh", "", R.drawable.ic_food_tea, false),
            PictureOption("u19_s5_p1_opt7_4", "cangkir", "", R.drawable.ic_food_cup, false)
        )
    ),

    // 8. Soal 8: Ketik Pinyin (toilet -> xǐshǒujiān)
    Exercise(
        id = "u19_s5_p1_q8",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "toilet / kamar kecil",
        sentenceWithBlank = "洗手间 (________)",
        targetHanzi = "洗手间",
        targetPinyin = "xǐshǒujiān",
        correctAnswer = "xishoujian",
        keyboardKeys = listOf("x", "i", "s", "h", "o", "u", "j", "a", "n", "e", "b", "d"),
        audioToSpeak = "洗手间"
    ),

    // 9. Soal 9: Susun Kalimat (Saya ingin pergi ke toilet mencuci tangan.)
    Exercise(
        id = "u19_s5_p1_q9",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Saya ke toilet cuci tangan.",
        targetHanzi = "我 去 洗手间 洗 手。",
        targetPinyin = "Wǒ qù xǐshǒujiān xǐ shǒu.",
        wordChips = listOf("我:wǒ", "去:qù", "洗手间:xǐshǒujiān", "洗:xǐ", "手。:shǒu.", "脸:liǎn"),
        correctAnswer = "我,去,洗手间,洗,手。",
        audioToSpeak = "我去洗手间洗手。"
    ),

    // 10. Soal 10: Ketuk Pasangan yang Sesuai (Rangkuman Fasilitas Restoran)
    Exercise(
        id = "u19_s5_p1_m10",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u19_s5_p1_m10_1", "洗手间", "xǐshǒujiān", "toilet"),
            MatchPairItem("u19_s5_p1_m10_2", "洗苹果", "xǐ píngguǒ", "cuci apel"),
            MatchPairItem("u19_s5_p1_m10_3", "很干净", "hěn gānjìng", "sangat bersih"),
            MatchPairItem("u19_s5_p1_m10_4", "在后面", "zài hòumiàn", "di belakang")
        )
    )
)

val bab19Stage5Part2Exercises = listOf(
    // 1. Soal 1: Pilihan Gambar (饭馆 -> restoran / rumah makan)
    Exercise(
        id = "u19_s5_p2_q1",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "饭馆",
        targetPinyin = "fànguǎn",
        targetTranslation = "restoran / rumah makan",
        correctAnswer = "restoran / rumah makan",
        audioToSpeak = "饭馆",
        pictureOptions = listOf(
            PictureOption("u19_s5_p2_opt1", "restoran", "", R.drawable.ic_food_restaurant, true),
            PictureOption("u19_s5_p2_opt2", "teh", "", R.drawable.ic_food_tea, false),
            PictureOption("u19_s5_p2_opt3", "cangkir", "", R.drawable.ic_food_cup, false),
            PictureOption("u19_s5_p2_opt4", "hidangan", "", R.drawable.ic_food_chinese_cuisine, false)
        )
    ),

    // 2. Soal 2: Susun Kalimat (Ikan dan daging di restoran ini sangat lezat.)
    Exercise(
        id = "u19_s5_p2_q2",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Ikan dan daging restoran ini lezat.",
        targetHanzi = "这家 饭馆 的 鱼 和 肉 真 不错。",
        targetPinyin = "Zhè jiā fànguǎn de yú hé ròu zhēn búcuò.",
        wordChips = listOf("这家:zhè jiā", "饭馆:fànguǎn", "的:de", "鱼:yú", "和:hé", "肉:ròu", "真:zhēn", "不错。:búcuò."),
        correctAnswer = "这家,饭馆,的,鱼,和,肉,真,不错。",
        audioToSpeak = "这家饭馆的鱼和肉真不错。"
    ),

    // 3. Soal 3: Ketuk Pasangan yang Sesuai (Grand Sintesis Bab 19)
    Exercise(
        id = "u19_s5_p2_m3",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u19_s5_p2_m1", "饭馆", "fànguǎn", "restoran"),
            MatchPairItem("u19_s5_p2_m2", "奶茶", "nǎichá", "teh susu"),
            MatchPairItem("u19_s5_p2_m3", "咖啡", "kāfēi", "kopi"),
            MatchPairItem("u19_s5_p2_m4", "不错", "búcuò", "mantap")
        )
    ),

    // 4. Soal 4: Ketik Pinyin (restoran -> fànguǎn)
    Exercise(
        id = "u19_s5_p2_q4",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "restoran / rumah makan",
        sentenceWithBlank = "饭馆 (________)",
        targetHanzi = "饭馆",
        targetPinyin = "fànguǎn",
        correctAnswer = "fanguan",
        keyboardKeys = listOf("f", "a", "n", "g", "u", "e", "i", "o", "b", "d", "h", "j"),
        audioToSpeak = "饭馆"
    ),

    // 5. Soal 5: Mendengar Kalimat (Rule 10: illustrationRes = 0)
    Exercise(
        id = "u19_s5_p2_q5",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Apa yang Anda dengar?",
        targetTranslation = "Kami memesan dua gelas teh susu dan seporsi ikan.",
        targetHanzi = "我们 点 了 两 杯 奶茶 和 一 条 鱼。",
        targetPinyin = "Wǒmen diǎn le liǎng bēi nǎichá hé yì tiáo yú.",
        wordChips = listOf("我们:wǒmen", "点:diǎn", "了:le", "两:liǎng", "杯:bēi", "奶茶:nǎichá", "和:hé", "一:yì", "条:tiáo", "鱼。:yú."),
        correctAnswer = "我们,点,了,两,杯,奶茶,和,一,条,鱼。",
        illustrationRes = 0,
        audioToSpeak = "我们点了两杯奶茶和一条鱼。"
    ),

    // 6. Soal 6: Pilihan Kalimat
    Exercise(
        id = "u19_s5_p2_q6",
        type = ExerciseType.SENTENCE_CHOICE,
        title = "Pilih terjemahan yang benar",
        targetHanzi = "这道 菜 没 坏， 很 有意思 的 味道。",
        targetPinyin = "Zhè dào cài méi huài, hěn yǒuyìsi de wèidao.",
        targetTranslation = "Masakan ini tidak basi, rasanya sangat menarik.",
        correctAnswer = "Zhè dào cài méi huài, hěn yǒuyìsi de wèidao.\n这道 菜 没 坏， 很 有意思 的 味道。",
        options = listOf(
            "Zhè dào cài méi huài, hěn yǒuyìsi de wèidao.\n这道 菜 没 坏， 很 有意思 的 味道。",
            "Zhè dào cài huài le, bù néng chī.\n这道 菜 坏 了， 不 能 吃。",
            "Zhè dào cài hěn guì, bù hǎochī.\n这道 菜 很 贵， 不 好吃。"
        ),
        audioToSpeak = "这道菜没坏，很有意思的味道。"
    ),

    // 7. Soal 7: Pilihan Gambar (奶茶 -> teh susu)
    Exercise(
        id = "u19_s5_p2_q7",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "奶茶",
        targetPinyin = "nǎichá",
        targetTranslation = "teh susu",
        correctAnswer = "teh susu",
        audioToSpeak = "奶茶",
        pictureOptions = listOf(
            PictureOption("u19_s5_p2_opt7_1", "teh susu", "", R.drawable.ic_food_cup, true),
            PictureOption("u19_s5_p2_opt7_2", "teh", "", R.drawable.ic_food_tea, false),
            PictureOption("u19_s5_p2_opt7_3", "restoran", "", R.drawable.ic_food_restaurant, false),
            PictureOption("u19_s5_p2_opt7_4", "hidangan", "", R.drawable.ic_food_chinese_cuisine, false)
        )
    ),

    // 8. Soal 8: Ketik Pinyin (teh susu -> nǎichá)
    Exercise(
        id = "u19_s5_p2_q8",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "teh susu",
        sentenceWithBlank = "奶茶 (________)",
        targetHanzi = "奶茶",
        targetPinyin = "nǎichá",
        correctAnswer = "naicha",
        keyboardKeys = listOf("n", "a", "i", "c", "h", "e", "o", "u", "b", "d", "g", "j"),
        audioToSpeak = "奶茶"
    ),

    // 9. Soal 9: Susun Kalimat (Sebelum makan di restoran harus cuci tangan.)
    Exercise(
        id = "u19_s5_p2_q9",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Di restoran harus cuci tangan.",
        targetHanzi = "在 饭馆 吃饭 要 先 洗 手。",
        targetPinyin = "Zài fànguǎn chīfàn yào xiān xǐ shǒu.",
        wordChips = listOf("在:zài", "饭馆:fànguǎn", "吃饭:chīfàn", "要:yào", "先:xiān", "洗:xǐ", "手。:shǒu.", "家:jiā"),
        correctAnswer = "在,饭馆,吃饭,要,先,洗,手。",
        audioToSpeak = "在饭馆吃饭要先洗手。"
    ),

    // 10. Soal 10: Ketuk Pasangan yang Sesuai (Grand Review Final Bab 19)
    Exercise(
        id = "u19_s5_p2_m10",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u19_s5_p2_m10_1", "红茶绿茶", "hóngchá lǜchá", "teh merah hijau"),
            MatchPairItem("u19_s5_p2_m10_2", "喝咖啡", "hē kāfēi", "minum kopi"),
            MatchPairItem("u19_s5_p2_m10_3", "洗手间", "xǐshǒujiān", "kamar kecil"),
            MatchPairItem("u19_s5_p2_m10_4", "菜真不错", "cài zhēn búcuò", "masakan mantap")
        )
    )
)
