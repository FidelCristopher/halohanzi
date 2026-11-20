package com.example.chineselearning.data.repository

import com.example.chineselearning.R
import com.example.chineselearning.data.model.Exercise
import com.example.chineselearning.data.model.ExerciseType
import com.example.chineselearning.data.model.MatchPairItem
import com.example.chineselearning.data.model.PictureOption

val bab19Stage1Part1Exercises = listOf(
    // 1. Soal 1: Pilihan Gambar (饭馆 -> restoran / rumah makan)
    Exercise(
        id = "u19_s1_p1_q1",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "饭馆",
        targetPinyin = "fànguǎn",
        targetTranslation = "restoran / rumah makan",
        correctAnswer = "restoran / rumah makan",
        audioToSpeak = "饭馆",
        pictureOptions = listOf(
            PictureOption("u19_s1_p1_opt1", "restoran", "", R.drawable.ic_food_restaurant, true),
            PictureOption("u19_s1_p1_opt2", "teh", "", R.drawable.ic_drink_green_tea, false),
            PictureOption("u19_s1_p1_opt3", "masakan", "", R.drawable.ic_food_chinese_cuisine, false),
            PictureOption("u19_s1_p1_opt4", "cangkir", "", R.drawable.ic_food_cup, false)
        )
    ),

    // 2. Soal 2: Susun Kalimat (Di samping sekolah ada sebuah restoran baru.)
    Exercise(
        id = "u19_s1_p1_q2",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Di samping sekolah ada restoran baru.",
        targetHanzi = "学校 旁边 有 一 家 新 饭馆。",
        targetPinyin = "Xuéxiào pángbiān yǒu yì jiā xīn fànguǎn.",
        wordChips = listOf("学校:xuéxiào", "旁边:pángbiān", "有:yǒu", "一:yì", "家:jiā", "新:xīn", "饭馆。:fànguǎn.", "医院:yīyuàn"),
        correctAnswer = "学校,旁边,有,一,家,新,饭馆。",
        audioToSpeak = "学校旁边有一家新饭馆。"
    ),

    // 3. Soal 3: Ketuk Pasangan yang Sesuai (Restoran & Memesan)
    Exercise(
        id = "u19_s1_p1_q3",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u19_s1_p1_m1", "饭馆", "fànguǎn", "restoran"),
            MatchPairItem("u19_s1_p1_m2", "点菜", "diǎn cài", "memesan makanan"),
            MatchPairItem("u19_s1_p1_m3", "新饭馆", "xīn fànguǎn", "restoran baru"),
            MatchPairItem("u19_s1_p1_m4", "服务员", "fúwùyuán", "pelayan")
        )
    ),

    // 4. Soal 4: Ketik Pinyin (restoran -> fànguǎn)
    Exercise(
        id = "u19_s1_p1_q4",
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
        id = "u19_s1_p1_q5",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Apa yang Anda dengar?",
        targetTranslation = "Pelayan, kami ingin memesan makanan.",
        targetHanzi = "服务员， 我们 要 点 菜。",
        targetPinyin = "Fúwùyuán, wǒmen yào diǎn cài.",
        wordChips = listOf("服务员，:fúwùyuán,", "我们:wǒmen", "要:yào", "点:diǎn", "菜。:cài.", "水:shuǐ"),
        correctAnswer = "服务员，,我们,要,点,菜。",
        illustrationRes = 0,
        audioToSpeak = "服务员，我们要点菜。"
    ),

    // 6. Soal 6: Pilihan Kalimat
    Exercise(
        id = "u19_s1_p1_q6",
        type = ExerciseType.SENTENCE_CHOICE,
        title = "Pilih terjemahan yang benar",
        targetHanzi = "这家 饭馆 的 菜 很 好吃。",
        targetPinyin = "Zhè jiā fànguǎn de cài hěn hǎochī.",
        targetTranslation = "Masakan di restoran ini sangat enak.",
        correctAnswer = "Zhè jiā fànguǎn de cài hěn hǎochī.\n这家 饭馆 的 菜 很 好吃。",
        options = listOf(
            "Zhè jiā fànguǎn de cài hěn hǎochī.\n这家 饭馆 的 菜 很 好吃。",
            "Nà jiā fànguǎn de cài bù hǎochī.\n那家 饭馆 的 菜 不 好吃。",
            "Zhè jiā fànguǎn de chá hěn hǎochī.\n这家 饭馆 的 茶 很 好吃。"
        ),
        audioToSpeak = "这家饭馆的菜很好吃。"
    ),

    // 7. Soal 7: Pilihan Gambar (点菜 -> memesan hidangan)
    Exercise(
        id = "u19_s1_p1_q7",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "点菜",
        targetPinyin = "diǎncài",
        targetTranslation = "memesan hidangan",
        correctAnswer = "memesan hidangan",
        audioToSpeak = "点菜",
        pictureOptions = listOf(
            PictureOption("u19_s1_p1_opt7_1", "memesan hidangan", "", R.drawable.ic_food_chinese_cuisine, true),
            PictureOption("u19_s1_p1_opt7_2", "restoran", "", R.drawable.ic_food_restaurant, false),
            PictureOption("u19_s1_p1_opt7_3", "cangkir", "", R.drawable.ic_food_cup, false),
            PictureOption("u19_s1_p1_opt7_4", "teh", "", R.drawable.ic_drink_green_tea, false)
        )
    ),

    // 8. Soal 8: Ketik Pinyin (memesan hidangan -> diǎncài)
    Exercise(
        id = "u19_s1_p1_q8",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "memesan hidangan",
        sentenceWithBlank = "点菜 (________)",
        targetHanzi = "点菜",
        targetPinyin = "diǎncài",
        correctAnswer = "diancai",
        keyboardKeys = listOf("d", "i", "a", "n", "c", "e", "o", "u", "b", "g", "h", "j"),
        audioToSpeak = "点菜"
    ),

    // 9. Soal 9: Susun Kalimat (Kalian ingin memesan apa?)
    Exercise(
        id = "u19_s1_p1_q9",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Kalian mau memesan apa?",
        targetHanzi = "你们 想 点 什么 菜？",
        targetPinyin = "Nǐmen xiǎng diǎn shénme cài?",
        wordChips = listOf("你们:nǐmen", "想:xiǎng", "点:diǎn", "什么:shénme", "菜？:cài?", "吃:chī"),
        correctAnswer = "你们,想,点,什么,菜？",
        audioToSpeak = "你们想点什么菜？"
    ),

    // 10. Soal 10: Ketuk Pasangan yang Sesuai (Rangkuman Memesan Makanan)
    Exercise(
        id = "u19_s1_p1_m10",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u19_s1_p1_m10_1", "饭馆", "fànguǎn", "restoran"),
            MatchPairItem("u19_s1_p1_m10_2", "点菜", "diǎn cài", "pesan makan"),
            MatchPairItem("u19_s1_p1_m10_3", "想吃", "xiǎng chī", "ingin makan"),
            MatchPairItem("u19_s1_p1_m10_4", "好吃", "hǎochī", "enak")
        )
    )
)

val bab19Stage1Part2Exercises = listOf(
    // 1. Soal 1: Pilihan Gambar (点 -> memesan)
    Exercise(
        id = "u19_s1_p2_q1",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "点",
        targetPinyin = "diǎn",
        targetTranslation = "memesan",
        correctAnswer = "memesan",
        audioToSpeak = "点",
        pictureOptions = listOf(
            PictureOption("u19_s1_p2_opt1", "memesan", "", R.drawable.ic_food_chinese_cuisine, true),
            PictureOption("u19_s1_p2_opt2", "restoran", "", R.drawable.ic_food_restaurant, false),
            PictureOption("u19_s1_p2_opt3", "cangkir", "", R.drawable.ic_food_cup, false),
            PictureOption("u19_s1_p2_opt4", "teh", "", R.drawable.ic_drink_green_tea, false)
        )
    ),

    // 2. Soal 2: Susun Kalimat (Saya memesan seporsi mie dan segelas air.)
    Exercise(
        id = "u19_s1_p2_q2",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Saya pesan mi dan air.",
        targetHanzi = "我 点 了 面条 和 水。",
        targetPinyin = "Wǒ diǎn le miàntiáo hé shuǐ.",
        wordChips = listOf("我:wǒ", "点:diǎn", "了:le", "面条:miàntiáo", "和:hé", "水。:shuǐ.", "饭:fàn"),
        correctAnswer = "我,点,了,面条,和,水。",
        audioToSpeak = "我点了面条和水。"
    ),

    // 3. Soal 3: Ketuk Pasangan yang Sesuai (Pesan & Hidangan)
    Exercise(
        id = "u19_s1_p2_m3",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u19_s1_p2_m1", "点", "diǎn", "memesan"),
            MatchPairItem("u19_s1_p2_m2", "面条", "miàntiáo", "mi"),
            MatchPairItem("u19_s1_p2_m3", "热汤", "rè tāng", "sup hangat"),
            MatchPairItem("u19_s1_p2_m4", "喝水", "hē shuǐ", "minum air")
        )
    ),

    // 4. Soal 4: Ketik Pinyin (memesan -> diǎn)
    Exercise(
        id = "u19_s1_p2_q4",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "memesan",
        sentenceWithBlank = "点 (________)",
        targetHanzi = "点",
        targetPinyin = "diǎn",
        correctAnswer = "dian",
        keyboardKeys = listOf("d", "i", "a", "n", "e", "o", "u", "b", "g", "h", "j", "l"),
        audioToSpeak = "点"
    ),

    // 5. Soal 5: Mendengar Kalimat (Rule 10: illustrationRes = 0)
    Exercise(
        id = "u19_s1_p2_q5",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Apa yang Anda dengar?",
        targetTranslation = "Hari ini saya mentraktirmu makan di restoran.",
        targetHanzi = "今天 我 请 你 去 饭馆 吃饭。",
        targetPinyin = "Jīntiān wǒ qǐng nǐ qù fànguǎn chīfàn.",
        wordChips = listOf("今天:jīntiān", "我:wǒ", "请:qǐng", "你:nǐ", "去:qù", "饭馆:fànguǎn", "吃饭。:chīfàn.", "家:jiā"),
        correctAnswer = "今天,我,请,你,去,饭馆,吃饭。",
        illustrationRes = 0,
        audioToSpeak = "今天我请你去饭馆吃饭。"
    ),

    // 6. Soal 6: Pilihan Kalimat
    Exercise(
        id = "u19_s1_p2_q6",
        type = ExerciseType.SENTENCE_CHOICE,
        title = "Pilih terjemahan yang benar",
        targetHanzi = "我们 去 哪家 饭馆 吃饭？",
        targetPinyin = "Wǒmen qù nǎ jiā fànguǎn chīfàn?",
        targetTranslation = "Kita pergi ke restoran yang mana untuk makan?",
        correctAnswer = "Wǒmen qù nǎ jiā fànguǎn chīfàn?\n我们 去 哪家 饭馆 吃饭？",
        options = listOf(
            "Wǒmen qù nǎ jiā fànguǎn chīfàn?\n我们 去 哪家 饭馆 吃饭？",
            "Wǒmen zài jiā lǐ chīfàn ma?\n我们 在 家 里 吃饭 吗？",
            "Tāmen qù nǎ jiā fànguǎn chīfàn?\n他们 去 哪家 饭馆 吃饭？"
        ),
        audioToSpeak = "我们去哪家饭馆吃饭？"
    ),

    // 7. Soal 7: Pilihan Gambar (饭馆 -> rumah makan)
    Exercise(
        id = "u19_s1_p2_q7",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "饭馆",
        targetPinyin = "fànguǎn",
        targetTranslation = "rumah makan",
        correctAnswer = "rumah makan",
        audioToSpeak = "饭馆",
        pictureOptions = listOf(
            PictureOption("u19_s1_p2_opt7_1", "rumah makan", "", R.drawable.ic_food_restaurant, true),
            PictureOption("u19_s1_p2_opt7_2", "cangkir", "", R.drawable.ic_food_cup, false),
            PictureOption("u19_s1_p2_opt7_3", "hidangan", "", R.drawable.ic_food_chinese_cuisine, false),
            PictureOption("u19_s1_p2_opt7_4", "teh", "", R.drawable.ic_drink_green_tea, false)
        )
    ),

    // 8. Soal 8: Ketik Pinyin (makan nasi -> chīfàn)
    Exercise(
        id = "u19_s1_p2_q8",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "makan / bersantap",
        sentenceWithBlank = "吃饭 (________)",
        targetHanzi = "吃饭",
        targetPinyin = "chīfàn",
        correctAnswer = "chifan",
        keyboardKeys = listOf("c", "h", "i", "f", "a", "n", "e", "o", "u", "b", "d", "g"),
        audioToSpeak = "吃饭"
    ),

    // 9. Soal 9: Susun Kalimat (Restoran ini sangat terkenal.)
    Exercise(
        id = "u19_s1_p2_q9",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Restoran ini banyak orang.",
        targetHanzi = "这家 饭馆 的 人 很 多。",
        targetPinyin = "Zhè jiā fànguǎn de rén hěn duō.",
        wordChips = listOf("这家:zhè jiā", "饭馆:fànguǎn", "的:de", "人:rén", "很:hěn", "多。:duō.", "少:shǎo"),
        correctAnswer = "这家,饭馆,的,人,很,多。",
        audioToSpeak = "这家饭馆的人很多。"
    ),

    // 10. Soal 10: Ketuk Pasangan yang Sesuai (Rangkuman Suasana Restoran)
    Exercise(
        id = "u19_s1_p2_m10",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u19_s1_p2_m10_1", "饭馆", "fànguǎn", "rumah makan"),
            MatchPairItem("u19_s1_p2_m10_2", "点水", "diǎn shuǐ", "pesan air"),
            MatchPairItem("u19_s1_p2_m10_3", "很多客", "hěn duō kè", "banyak tamu"),
            MatchPairItem("u19_s1_p2_m10_4", "请客", "qǐngkè", "mentraktir")
        )
    )
)
