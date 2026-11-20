package com.example.chineselearning.data.repository

import com.example.chineselearning.R
import com.example.chineselearning.data.model.Exercise
import com.example.chineselearning.data.model.ExerciseType
import com.example.chineselearning.data.model.MatchPairItem
import com.example.chineselearning.data.model.PictureOption

val bab19Stage4Part1Exercises = listOf(
    // 1. Soal 1: Pilihan Gambar (不错 -> mantap / lumayan)
    Exercise(
        id = "u19_s4_p1_q1",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "不错",
        targetPinyin = "búcuò",
        targetTranslation = "bagus / lumayan / mantap",
        correctAnswer = "bagus / lumayan / mantap",
        audioToSpeak = "不错",
        pictureOptions = listOf(
            PictureOption("u19_s4_p1_opt1", "mantap", "", R.drawable.ic_food_delicious, true),
            PictureOption("u19_s4_p1_opt2", "cangkir", "", R.drawable.ic_food_cup, false),
            PictureOption("u19_s4_p1_opt3", "teh", "", R.drawable.ic_drink_green_tea, false),
            PictureOption("u19_s4_p1_opt4", "restoran", "", R.drawable.ic_food_restaurant, false)
        )
    ),

    // 2. Soal 2: Susun Kalimat (Cita rasa masakan ini sungguh mantap!)
    Exercise(
        id = "u19_s4_p1_q2",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Rasa masakan ini sungguh mantap!",
        targetHanzi = "这道 菜 味道 真 不错！",
        targetPinyin = "Zhè dào cài wèidao zhēn búcuò!",
        wordChips = listOf("这道:zhè dào", "菜:cài", "味道:wèidao", "真:zhēn", "不错！:búcuò!", "坏:huài"),
        correctAnswer = "这道,菜,味道,真,不错！",
        audioToSpeak = "这道菜味道真不错！"
    ),

    // 3. Soal 3: Ketuk Pasangan yang Sesuai (Mantap & Basi/Rusak)
    Exercise(
        id = "u19_s4_p1_q3",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u19_s4_p1_m1", "不错", "búcuò", "bagus / mantap"),
            MatchPairItem("u19_s4_p1_m2", "坏", "huài", "rusak / basi"),
            MatchPairItem("u19_s4_p1_m3", "味道", "wèidao", "cita rasa"),
            MatchPairItem("u19_s4_p1_m4", "真好", "zhēn hǎo", "sungguh baik")
        )
    ),

    // 4. Soal 4: Ketik Pinyin (bagus/mantap -> búcuò)
    Exercise(
        id = "u19_s4_p1_q4",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "bagus / lumayan / mantap",
        sentenceWithBlank = "不错 (________)",
        targetHanzi = "不错",
        targetPinyin = "búcuò",
        correctAnswer = "bucuo",
        keyboardKeys = listOf("b", "u", "c", "o", "a", "e", "i", "d", "g", "h", "j", "l"),
        audioToSpeak = "不错"
    ),

    // 5. Soal 5: Mendengar Kalimat (Rule 10: illustrationRes = 0)
    Exercise(
        id = "u19_s4_p1_q5",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Apa yang Anda dengar?",
        targetTranslation = "Masakan ini sudah basi tidak bisa dimakan.",
        targetHanzi = "菜 坏 了 不 能 吃。",
        targetPinyin = "Cài huài le bù néng chī.",
        wordChips = listOf("菜:cài", "坏:huài", "了:le", "不:bù", "能:néng", "吃。:chī.", "好:hǎo"),
        correctAnswer = "菜,坏,了,不,能,吃。",
        illustrationRes = 0,
        audioToSpeak = "菜坏了不能吃。"
    ),

    // 6. Soal 6: Pilihan Kalimat
    Exercise(
        id = "u19_s4_p1_q6",
        type = ExerciseType.SENTENCE_CHOICE,
        title = "Pilih terjemahan yang benar",
        targetHanzi = "今天 的 考试 成绩 很 不错。",
        targetPinyin = "Jīntiān de kǎoshì chéngjì hěn búcuò.",
        targetTranslation = "Nilai ujian hari ini lumayan bagus.",
        correctAnswer = "Jīntiān de kǎoshì chéngjì hěn búcuò.\n今天 的 考试 成绩 很 不错。",
        options = listOf(
            "Jīntiān de kǎoshì chéngjì hěn búcuò.\n今天 的 考试 成绩 很 不错。",
            "Jīntiān de kǎoshì chéngjì bù hǎo.\n今天 的 考试 成绩 不 好。",
            "Míngtiān de kǎoshì chéngjì hěn búcuò.\n明天 的 考试 成绩 很 不错。"
        ),
        audioToSpeak = "今天的考试成绩很不错。"
    ),

    // 7. Soal 7: Pilihan Gambar (坏 -> rusak / basi)
    Exercise(
        id = "u19_s4_p1_q7",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "坏",
        targetPinyin = "huài",
        targetTranslation = "rusak / basi",
        correctAnswer = "rusak / basi",
        audioToSpeak = "坏",
        pictureOptions = listOf(
            PictureOption("u19_s4_p1_opt7_1", "rusak", "", R.drawable.ic_mod_wrong, true),
            PictureOption("u19_s4_p1_opt7_2", "lezat", "", R.drawable.ic_food_delicious, false),
            PictureOption("u19_s4_p1_opt7_3", "teh", "", R.drawable.ic_drink_green_tea, false),
            PictureOption("u19_s4_p1_opt7_4", "cangkir", "", R.drawable.ic_food_cup, false)
        )
    ),

    // 8. Soal 8: Ketik Pinyin (rusak/basi -> huài)
    Exercise(
        id = "u19_s4_p1_q8",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "rusak / basi",
        sentenceWithBlank = "坏 (________)",
        targetHanzi = "坏",
        targetPinyin = "huài",
        correctAnswer = "huai",
        keyboardKeys = listOf("h", "u", "a", "i", "e", "o", "b", "d", "g", "j", "l", "m"),
        audioToSpeak = "坏"
    ),

    // 9. Soal 9: Susun Kalimat (Ponsel saya rusak tidak bisa menelepon.)
    Exercise(
        id = "u19_s4_p1_q9",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Ponsel saya rusak.",
        targetHanzi = "我 的 手机 坏 了。",
        targetPinyin = "Wǒ de shǒujī huài le.",
        wordChips = listOf("我:wǒ", "的:de", "手机:shǒujī", "坏:huài", "了。:le.", "好:hǎo"),
        correctAnswer = "我,的,手机,坏,了。",
        audioToSpeak = "我的手机坏了。"
    ),

    // 10. Soal 10: Ketuk Pasangan yang Sesuai (Rangkuman Mutu Makanan)
    Exercise(
        id = "u19_s4_p1_m10",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u19_s4_p1_m10_1", "不错", "búcuò", "mantap"),
            MatchPairItem("u19_s4_p1_m10_2", "坏了", "huài le", "sudah rusak"),
            MatchPairItem("u19_s4_p1_m10_3", "真不错", "zhēn búcuò", "sungguh bagus"),
            MatchPairItem("u19_s4_p1_m10_4", "手机坏", "shǒujī huài", "hp rusak")
        )
    )
)

val bab19Stage4Part2Exercises = listOf(
    // 1. Soal 1: Pilihan Gambar (有意思 -> menarik / asyik)
    Exercise(
        id = "u19_s4_p2_q1",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "有意思",
        targetPinyin = "yǒuyìsi",
        targetTranslation = "menarik / asyik",
        correctAnswer = "menarik / asyik",
        audioToSpeak = "有意思",
        pictureOptions = listOf(
            PictureOption("u19_s4_p2_opt1", "menarik", "", R.drawable.ic_hobby_fun, true),
            PictureOption("u19_s4_p2_opt2", "teh", "", R.drawable.ic_drink_green_tea, false),
            PictureOption("u19_s4_p2_opt3", "cangkir", "", R.drawable.ic_food_cup, false),
            PictureOption("u19_s4_p2_opt4", "restoran", "", R.drawable.ic_food_restaurant, false)
        )
    ),

    // 2. Soal 2: Susun Kalimat (Membaca buku ini sangat menarik.)
    Exercise(
        id = "u19_s4_p2_q2",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Baca buku ini sangat menarik.",
        targetHanzi = "看 这 本 书 很 有意思。",
        targetPinyin = "Kàn zhè běn shū hěn yǒuyìsi.",
        wordChips = listOf("看:kàn", "这:zhè", "本:běn", "书:shū", "很:hěn", "有意思。:yǒuyìsi.", "没意思:méiyìsi"),
        correctAnswer = "看,这,本,书,很,有意思。",
        audioToSpeak = "看这本书很有意思。"
    ),

    // 3. Soal 3: Ketuk Pasangan yang Sesuai (Menarik vs Membosankan)
    Exercise(
        id = "u19_s4_p2_m3",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u19_s4_p2_m1", "有意思", "yǒuyìsi", "menarik / asyik"),
            MatchPairItem("u19_s4_p2_m2", "没意思", "méiyìsi", "membosankan"),
            MatchPairItem("u19_s4_p2_m3", "看书", "kànshū", "membaca buku"),
            MatchPairItem("u19_s4_p2_m4", "电影", "diànyǐng", "film")
        )
    ),

    // 4. Soal 4: Ketik Pinyin (menarik -> yǒuyìsi)
    Exercise(
        id = "u19_s4_p2_q4",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "menarik / asyik",
        sentenceWithBlank = "有意思 (________)",
        targetHanzi = "有意思",
        targetPinyin = "yǒuyìsi",
        correctAnswer = "youyisi",
        keyboardKeys = listOf("y", "o", "u", "i", "s", "a", "e", "b", "d", "g", "h", "j"),
        audioToSpeak = "有意思"
    ),

    // 5. Soal 5: Mendengar Kalimat (Rule 10: illustrationRes = 0)
    Exercise(
        id = "u19_s4_p2_q5",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Apa yang Anda dengar?",
        targetTranslation = "Film ini sedikit pun tidak menarik.",
        targetHanzi = "这个 电影 一点 也没意思。",
        targetPinyin = "Zhège diànyǐng yìdiǎn yě méiyìsi.",
        wordChips = listOf("这个:zhège", "电影:diànyǐng", "一点:yìdiǎn", "也没意思。:yě méiyìsi.", "有意思:yǒuyìsi"),
        correctAnswer = "这个,电影,一点,也没意思。",
        illustrationRes = 0,
        audioToSpeak = "这个电影一点也没意思。"
    ),

    // 6. Soal 6: Pilihan Kalimat
    Exercise(
        id = "u19_s4_p2_q6",
        type = ExerciseType.SENTENCE_CHOICE,
        title = "Pilih terjemahan yang benar",
        targetHanzi = "学 汉语 是 一 件 很 有意思 的 事。",
        targetPinyin = "Xué Hànyǔ shì yí jiàn hěn yǒuyìsi de shì.",
        targetTranslation = "Belajar bahasa Mandarin adalah hal yang sangat menarik.",
        correctAnswer = "Xué Hànyǔ shì yí jiàn hěn yǒuyìsi de shì.\n学 汉语 是 一 件 很 有意思 的 事。",
        options = listOf(
            "Xué Hànyǔ shì yí jiàn hěn yǒuyìsi de shì.\n学 汉语 是 一 件 很 有意思 的 事。",
            "Xué Hànyǔ shì yí jiàn méiyìsi de shì.\n学 汉语 是 一 件 没意思 的 事。",
            "Kàn diànyǐng shì yí jiàn hěn yǒuyìsi de shì.\n看 电影 是 一 件 很 有意思 的 事。"
        ),
        audioToSpeak = "学汉语是一件很有意思的事。"
    ),

    // 7. Soal 7: Pilihan Gambar (没意思 -> membosankan)
    Exercise(
        id = "u19_s4_p2_q7",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "没意思",
        targetPinyin = "méiyìsi",
        targetTranslation = "membosankan",
        correctAnswer = "membosankan",
        audioToSpeak = "没意思",
        pictureOptions = listOf(
            PictureOption("u19_s4_p2_opt7_1", "membosankan", "", R.drawable.ic_action_sleep, true),
            PictureOption("u19_s4_p2_opt7_2", "gembira", "", R.drawable.ic_comm_happy, false),
            PictureOption("u19_s4_p2_opt7_3", "restoran", "", R.drawable.ic_food_restaurant, false),
            PictureOption("u19_s4_p2_opt7_4", "teh", "", R.drawable.ic_drink_green_tea, false)
        )
    ),

    // 8. Soal 8: Ketik Pinyin (membosankan -> méiyìsi)
    Exercise(
        id = "u19_s4_p2_q8",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "membosankan",
        sentenceWithBlank = "没意思 (________)",
        targetHanzi = "没意思",
        targetPinyin = "méiyìsi",
        correctAnswer = "meiyisi",
        keyboardKeys = listOf("m", "e", "i", "y", "s", "a", "o", "u", "b", "d", "g", "h"),
        audioToSpeak = "没意思"
    ),

    // 9. Soal 9: Susun Kalimat (Permainan ini sangat seru.)
    Exercise(
        id = "u19_s4_p2_q9",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Permainan ini sangat seru.",
        targetHanzi = "这个 游戏 真 有意思。",
        targetPinyin = "Zhège yóuxì zhēn yǒuyìsi.",
        wordChips = listOf("这个:zhège", "游戏:yóuxì", "真:zhēn", "有意思。:yǒuyìsi.", "没意思:méiyìsi"),
        correctAnswer = "这个,游戏,真,有意思。",
        audioToSpeak = "这个游戏真有意思。"
    ),

    // 10. Soal 10: Ketuk Pasangan yang Sesuai (Rangkuman Evaluasi Pengalaman)
    Exercise(
        id = "u19_s4_p2_m10",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u19_s4_p2_m10_1", "有意思", "yǒuyìsi", "menarik"),
            MatchPairItem("u19_s4_p2_m10_2", "没意思", "méiyìsi", "membosankan"),
            MatchPairItem("u19_s4_p2_m10_3", "真好玩", "zhēn hǎowán", "sangat asyik"),
            MatchPairItem("u19_s4_p2_m10_4", "学汉语", "xué Hànyǔ", "belajar Mandarin")
        )
    )
)
