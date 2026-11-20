#!/usr/bin/env python3
import os

extra_distractors = ['a', 'e', 'i', 'o', 'u', 'b', 'd', 'g', 'h', 'j', 'l', 'm', 'n', 'q', 'r', 's', 't', 'w', 'x', 'y', 'z']

def make_keys(ans):
    ans_clean = ans.lower().strip()
    needed = [c for c in ans_clean if c.isalpha()]
    keys = list(dict.fromkeys(needed))
    for d in extra_distractors:
        if d not in keys:
            keys.append(d)
        if len(keys) >= 12:
            break
    return "listOf(" + ", ".join(f'"{k}"' for k in keys) + ")"

def generate_bab19():
    base_dir = "app/src/main/java/com/example/chineselearning/data/repository"
    
    stages = {}
    
    # =========================================================================
    # STAGE 1: Suasana Rumah Makan & Memesan (饭馆, 点)
    # =========================================================================
    k1_p1_q4 = make_keys("fanguan")
    k1_p1_q8 = make_keys("diancai")
    k1_p2_q4 = make_keys("dian")
    k1_p2_q8 = make_keys("chifan")
    
    stages[1] = {
        "p1": [
            f"""    // 1. Soal 1: Pilihan Gambar (饭馆 -> restoran / rumah makan)
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
            PictureOption("u19_s1_p1_opt2", "teh", "", R.drawable.ic_food_tea, false),
            PictureOption("u19_s1_p1_opt3", "masakan", "", R.drawable.ic_food_chinese_cuisine, false),
            PictureOption("u19_s1_p1_opt4", "cangkir", "", R.drawable.ic_food_cup, false)
        )
    )""",
            f"""    // 2. Soal 2: Susun Kalimat (Di samping sekolah ada sebuah restoran baru.)
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
    )""",
            f"""    // 3. Soal 3: Ketuk Pasangan yang Sesuai (Restoran & Memesan)
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
    )""",
            f"""    // 4. Soal 4: Ketik Pinyin (restoran -> fànguǎn)
    Exercise(
        id = "u19_s1_p1_q4",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "restoran / rumah makan",
        sentenceWithBlank = "饭馆 (________)",
        targetHanzi = "饭馆",
        targetPinyin = "fànguǎn",
        correctAnswer = "fanguan",
        keyboardKeys = {k1_p1_q4},
        audioToSpeak = "饭馆"
    )""",
            f"""    // 5. Soal 5: Mendengar Kalimat (Rule 10: illustrationRes = 0)
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
    )""",
            f"""    // 6. Soal 6: Pilihan Kalimat
    Exercise(
        id = "u19_s1_p1_q6",
        type = ExerciseType.SENTENCE_CHOICE,
        title = "Pilih terjemahan yang benar",
        targetHanzi = "这家 饭馆 的 菜 很 好吃。",
        targetPinyin = "Zhè jiā fànguǎn de cài hěn hǎochī.",
        targetTranslation = "Masakan di restoran ini sangat enak.",
        correctAnswer = "Zhè jiā fànguǎn de cài hěn hǎochī.\\n这家 饭馆 的 菜 很 好吃。",
        options = listOf(
            "Zhè jiā fànguǎn de cài hěn hǎochī.\\n这家 饭馆 的 菜 很 好吃。",
            "Nà jiā fànguǎn de cài bù hǎochī.\\n那家 饭馆 的 菜 不 好吃。",
            "Zhè jiā fànguǎn de chá hěn hǎochī.\\n这家 饭馆 的 茶 很 好吃。"
        ),
        audioToSpeak = "这家饭馆的菜很好吃。"
    )""",
            f"""    // 7. Soal 7: Pilihan Gambar (点菜 -> memesan hidangan)
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
            PictureOption("u19_s1_p1_opt7_4", "teh", "", R.drawable.ic_food_tea, false)
        )
    )""",
            f"""    // 8. Soal 8: Ketik Pinyin (memesan hidangan -> diǎncài)
    Exercise(
        id = "u19_s1_p1_q8",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "memesan hidangan",
        sentenceWithBlank = "点菜 (________)",
        targetHanzi = "点菜",
        targetPinyin = "diǎncài",
        correctAnswer = "diancai",
        keyboardKeys = {k1_p1_q8},
        audioToSpeak = "点菜"
    )""",
            f"""    // 9. Soal 9: Susun Kalimat (Kalian ingin memesan apa?)
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
    )""",
            f"""    // 10. Soal 10: Ketuk Pasangan yang Sesuai (Rangkuman Memesan Makanan)
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
    )"""
        ],
        "p2": [
            f"""    // 1. Soal 1: Pilihan Gambar (点 -> memesan)
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
            PictureOption("u19_s1_p2_opt4", "teh", "", R.drawable.ic_food_tea, false)
        )
    )""",
            f"""    // 2. Soal 2: Susun Kalimat (Saya memesan seporsi mie dan segelas air.)
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
    )""",
            f"""    // 3. Soal 3: Ketuk Pasangan yang Sesuai (Pesan & Hidangan)
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
    )""",
            f"""    // 4. Soal 4: Ketik Pinyin (memesan -> diǎn)
    Exercise(
        id = "u19_s1_p2_q4",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "memesan",
        sentenceWithBlank = "点 (________)",
        targetHanzi = "点",
        targetPinyin = "diǎn",
        correctAnswer = "dian",
        keyboardKeys = {k1_p2_q4},
        audioToSpeak = "点"
    )""",
            f"""    // 5. Soal 5: Mendengar Kalimat (Rule 10: illustrationRes = 0)
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
    )""",
            f"""    // 6. Soal 6: Pilihan Kalimat
    Exercise(
        id = "u19_s1_p2_q6",
        type = ExerciseType.SENTENCE_CHOICE,
        title = "Pilih terjemahan yang benar",
        targetHanzi = "我们 去 哪家 饭馆 吃饭？",
        targetPinyin = "Wǒmen qù nǎ jiā fànguǎn chīfàn?",
        targetTranslation = "Kita pergi ke restoran yang mana untuk makan?",
        correctAnswer = "Wǒmen qù nǎ jiā fànguǎn chīfàn?\\n我们 去 哪家 饭馆 吃饭？",
        options = listOf(
            "Wǒmen qù nǎ jiā fànguǎn chīfàn?\\n我们 去 哪家 饭馆 吃饭？",
            "Wǒmen zài jiā lǐ chīfàn ma?\\n我们 在 家 里 吃饭 吗？",
            "Tāmen qù nǎ jiā fànguǎn chīfàn?\\n他们 去 哪家 饭馆 吃饭？"
        ),
        audioToSpeak = "我们去哪家饭馆吃饭？"
    )""",
            f"""    // 7. Soal 7: Pilihan Gambar (饭馆 -> rumah makan)
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
            PictureOption("u19_s1_p2_opt7_4", "teh", "", R.drawable.ic_food_tea, false)
        )
    )""",
            f"""    // 8. Soal 8: Ketik Pinyin (makan nasi -> chīfàn)
    Exercise(
        id = "u19_s1_p2_q8",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "makan / bersantap",
        sentenceWithBlank = "吃饭 (________)",
        targetHanzi = "吃饭",
        targetPinyin = "chīfàn",
        correctAnswer = "chifan",
        keyboardKeys = {k1_p2_q8},
        audioToSpeak = "吃饭"
    )""",
            f"""    // 9. Soal 9: Susun Kalimat (Restoran ini sangat terkenal.)
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
    )""",
            f"""    // 10. Soal 10: Ketuk Pasangan yang Sesuai (Rangkuman Suasana Restoran)
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
    )"""
        ]
    }

    # =========================================================================
    # STAGE 2: Hidangan Daging & Ikan (肉, 鱼)
    # =========================================================================
    k2_p1_q4 = make_keys("rou")
    k2_p1_q8 = make_keys("yu")
    k2_p2_q4 = make_keys("chiyu")
    k2_p2_q8 = make_keys("niurou")
    
    stages[2] = {
        "p1": [
            f"""    // 1. Soal 1: Pilihan Gambar (肉 -> daging)
    Exercise(
        id = "u19_s2_p1_q1",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "肉",
        targetPinyin = "ròu",
        targetTranslation = "daging",
        correctAnswer = "daging",
        audioToSpeak = "肉",
        pictureOptions = listOf(
            PictureOption("u19_s2_p1_opt1", "daging", "", R.drawable.ic_food_chinese_cuisine, true),
            PictureOption("u19_s2_p1_opt2", "ikan", "", R.drawable.ic_food_restaurant, false),
            PictureOption("u19_s2_p1_opt3", "teh", "", R.drawable.ic_food_tea, false),
            PictureOption("u19_s2_p1_opt4", "cangkir", "", R.drawable.ic_food_cup, false)
        )
    )""",
            f"""    // 2. Soal 2: Susun Kalimat (Saya tidak sering makan daging sapi.)
    Exercise(
        id = "u19_s2_p1_q2",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Saya tidak sering makan daging.",
        targetHanzi = "我 不 常 吃 肉。",
        targetPinyin = "Wǒ bù cháng chī ròu.",
        wordChips = listOf("我:wǒ", "不:bù", "常:cháng", "吃:chī", "肉。:ròu.", "喜欢:xǐhuan"),
        correctAnswer = "我,不,常,吃,肉。",
        audioToSpeak = "我不常吃肉。"
    )""",
            f"""    // 3. Soal 3: Ketuk Pasangan yang Sesuai (Daging & Ikan)
    Exercise(
        id = "u19_s2_p1_q3",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u19_s2_p1_m1", "肉", "ròu", "daging"),
            MatchPairItem("u19_s2_p1_m2", "鱼", "yú", "ikan"),
            MatchPairItem("u19_s2_p1_m3", "新鲜", "xīnxiān", "segar"),
            MatchPairItem("u19_s2_p1_m4", "羊肉", "yángròu", "daging domba")
        )
    )""",
            f"""    // 4. Soal 4: Ketik Pinyin (daging -> ròu)
    Exercise(
        id = "u19_s2_p1_q4",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "daging",
        sentenceWithBlank = "肉 (________)",
        targetHanzi = "肉",
        targetPinyin = "ròu",
        correctAnswer = "rou",
        keyboardKeys = {k2_p1_q4},
        audioToSpeak = "肉"
    )""",
            f"""    // 5. Soal 5: Mendengar Kalimat (Rule 10: illustrationRes = 0)
    Exercise(
        id = "u19_s2_p1_q5",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Apa yang Anda dengar?",
        targetTranslation = "Ikan di restoran ini sangat segar.",
        targetHanzi = "这家 饭馆 的 鱼 很 新鲜。",
        targetPinyin = "Zhè jiā fànguǎn de yú hěn xīnxiān.",
        wordChips = listOf("这家:zhè jiā", "饭馆:fànguǎn", "的:de", "鱼:yú", "很:hěn", "新鲜。:xīnxiān.", "肉:ròu"),
        correctAnswer = "这家,饭馆,的,鱼,很,新鲜。",
        illustrationRes = 0,
        audioToSpeak = "这家饭馆的鱼很新鲜。"
    )""",
            f"""    // 6. Soal 6: Pilihan Kalimat
    Exercise(
        id = "u19_s2_p1_q6",
        type = ExerciseType.SENTENCE_CHOICE,
        title = "Pilih terjemahan yang benar",
        targetHanzi = "弟弟 喜欢 吃 鱼， 不 喜欢 吃 肉。",
        targetPinyin = "Dìdi xǐhuan chī yú, bù xǐhuan chī ròu.",
        targetTranslation = "Adik suka makan ikan, tidak suka makan daging.",
        correctAnswer = "Dìdi xǐhuan chī yú, bù xǐhuan chī ròu.\\n弟弟 喜欢 吃 鱼， 不 喜欢 吃 肉。",
        options = listOf(
            "Dìdi xǐhuan chī yú, bù xǐhuan chī ròu.\\n弟弟 喜欢 吃 鱼， 不 喜欢 吃 肉。",
            "Dìdi xǐhuan chī ròu, bù xǐhuan chī yú.\\n弟弟 喜欢 吃 肉， 不 喜欢 吃 鱼。",
            "Gēge xǐhuan chī yú, bù xǐhuan chī ròu.\\n哥哥 喜欢 吃 鱼， 不 喜欢 吃 肉。"
        ),
        audioToSpeak = "弟弟喜欢吃鱼，不喜欢吃肉。"
    )""",
            f"""    // 7. Soal 7: Pilihan Gambar (鱼 -> ikan)
    Exercise(
        id = "u19_s2_p1_q7",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "鱼",
        targetPinyin = "yú",
        targetTranslation = "ikan",
        correctAnswer = "ikan",
        audioToSpeak = "鱼",
        pictureOptions = listOf(
            PictureOption("u19_s2_p1_opt7_1", "ikan", "", R.drawable.ic_food_chinese_cuisine, true),
            PictureOption("u19_s2_p1_opt7_2", "restoran", "", R.drawable.ic_food_restaurant, false),
            PictureOption("u19_s2_p1_opt7_3", "cangkir", "", R.drawable.ic_food_cup, false),
            PictureOption("u19_s2_p1_opt7_4", "teh", "", R.drawable.ic_food_tea, false)
        )
    )""",
            f"""    // 8. Soal 8: Ketik Pinyin (ikan -> yú)
    Exercise(
        id = "u19_s2_p1_q8",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "ikan",
        sentenceWithBlank = "鱼 (________)",
        targetHanzi = "鱼",
        targetPinyin = "yú",
        correctAnswer = "yu",
        keyboardKeys = {k2_p1_q8},
        audioToSpeak = "鱼"
    )""",
            f"""    // 9. Soal 9: Susun Kalimat (Ibu memasak ikan dengan sangat lezat.)
    Exercise(
        id = "u19_s2_p1_q9",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Ibu memasak ikan sangat enak.",
        targetHanzi = "妈妈 做 的 鱼 很 好吃。",
        targetPinyin = "Māma zuò de yú hěn hǎochī.",
        wordChips = listOf("妈妈:māma", "做:zuò", "的:de", "鱼:yú", "很:hěn", "好吃。:hǎochī.", "肉:ròu"),
        correctAnswer = "妈妈,做,的,鱼,很,好吃。",
        audioToSpeak = "妈妈做的鱼很好吃。"
    )""",
            f"""    // 10. Soal 10: Ketuk Pasangan yang Sesuai (Rangkuman Olahan Ikan & Daging)
    Exercise(
        id = "u19_s2_p1_m10",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u19_s2_p1_m10_1", "肉", "ròu", "daging"),
            MatchPairItem("u19_s2_p1_m10_2", "鱼", "yú", "ikan"),
            MatchPairItem("u19_s2_p1_m10_3", "大鱼", "dà yú", "ikan besar"),
            MatchPairItem("u19_s2_p1_m10_4", "做肉", "zuò ròu", "masak daging")
        )
    )"""
        ],
        "p2": [
            f"""    // 1. Soal 1: Pilihan Gambar (鱼 -> ikan segar)
    Exercise(
        id = "u19_s2_p2_q1",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "鱼",
        targetPinyin = "yú",
        targetTranslation = "ikan",
        correctAnswer = "ikan",
        audioToSpeak = "鱼",
        pictureOptions = listOf(
            PictureOption("u19_s2_p2_opt1", "ikan", "", R.drawable.ic_food_chinese_cuisine, true),
            PictureOption("u19_s2_p2_opt2", "restoran", "", R.drawable.ic_food_restaurant, false),
            PictureOption("u19_s2_p2_opt3", "teh", "", R.drawable.ic_food_tea, false),
            PictureOption("u19_s2_p2_opt4", "cangkir", "", R.drawable.ic_food_cup, false)
        )
    )""",
            f"""    // 2. Soal 2: Susun Kalimat (Kucing suka makan ikan segar.)
    Exercise(
        id = "u19_s2_p2_q2",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Kucing suka makan ikan.",
        targetHanzi = "小猫 喜欢 吃 鱼。",
        targetPinyin = "Xiǎomāo xǐhuan chī yú.",
        wordChips = listOf("小猫:xiǎomāo", "喜欢:xǐhuan", "吃:chī", "鱼。:yú.", "肉:ròu"),
        correctAnswer = "小猫,喜欢,吃,鱼。",
        audioToSpeak = "小猫喜欢吃鱼。"
    )""",
            f"""    // 3. Soal 3: Ketuk Pasangan yang Sesuai (Konsumsi Protein)
    Exercise(
        id = "u19_s2_p2_m3",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u19_s2_p2_m1", "吃鱼", "chī yú", "makan ikan"),
            MatchPairItem("u19_s2_p2_m2", "吃肉", "chī ròu", "makan daging"),
            MatchPairItem("u19_s2_p2_m3", "牛肉", "niúròu", "daging sapi"),
            MatchPairItem("u19_s2_p2_m4", "鲜美", "xiānměi", "lezat gurih")
        )
    )""",
            f"""    // 4. Soal 4: Ketik Pinyin (makan ikan -> chīyú)
    Exercise(
        id = "u19_s2_p2_q4",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "makan ikan",
        sentenceWithBlank = "吃鱼 (________)",
        targetHanzi = "吃鱼",
        targetPinyin = "chīyú",
        correctAnswer = "chiyu",
        keyboardKeys = {k2_p2_q4},
        audioToSpeak = "吃鱼"
    )""",
            f"""    // 5. Soal 5: Mendengar Kalimat (Rule 10: illustrationRes = 0)
    Exercise(
        id = "u19_s2_p2_q5",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Apa yang Anda dengar?",
        targetTranslation = "Daging sapi hari ini sangat mahal.",
        targetHanzi = "今天 的 牛肉 很 贵。",
        targetPinyin = "Jīntiān de niúròu hěn guì.",
        wordChips = listOf("今天:jīntiān", "的:de", "牛肉:niúròu", "很:hěn", "贵。:guì.", "便宜:piányi"),
        correctAnswer = "今天,的,牛肉,很,贵。",
        illustrationRes = 0,
        audioToSpeak = "今天的牛肉很贵。"
    )""",
            f"""    // 6. Soal 6: Pilihan Kalimat
    Exercise(
        id = "u19_s2_p2_q6",
        type = ExerciseType.SENTENCE_CHOICE,
        title = "Pilih terjemahan yang benar",
        targetHanzi = "请 给 我 一 盘 炒 牛肉。",
        targetPinyin = "Qǐng gěi wǒ yì pán chǎo niúròu.",
        targetTranslation = "Tolong beri saya sepiring tumis daging sapi.",
        correctAnswer = "Qǐng gěi wǒ yì pán chǎo niúròu.\\n请 给 我 一 盘 炒 牛肉。",
        options = listOf(
            "Qǐng gěi wǒ yì pán chǎo niúròu.\\n请 给 我 一 盘 炒 牛肉。",
            "Qǐng gěi wǒ yì pán chǎo yú.\\n请 给 我 一 盘 炒 鱼。",
            "Qǐng gěi wǒ yì wǎn miàntiáo.\\n请 给 我 一 碗 面条。"
        ),
        audioToSpeak = "请给我一盘炒牛肉。"
    )""",
            f"""    // 7. Soal 7: Pilihan Gambar (牛肉 -> daging sapi)
    Exercise(
        id = "u19_s2_p2_q7",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "牛肉",
        targetPinyin = "niúròu",
        targetTranslation = "daging sapi",
        correctAnswer = "daging sapi",
        audioToSpeak = "牛肉",
        pictureOptions = listOf(
            PictureOption("u19_s2_p2_opt7_1", "daging sapi", "", R.drawable.ic_food_chinese_cuisine, true),
            PictureOption("u19_s2_p2_opt7_2", "ikan", "", R.drawable.ic_food_restaurant, false),
            PictureOption("u19_s2_p2_opt7_3", "teh", "", R.drawable.ic_food_tea, false),
            PictureOption("u19_s2_p2_opt7_4", "cangkir", "", R.drawable.ic_food_cup, false)
        )
    )""",
            f"""    // 8. Soal 8: Ketik Pinyin (daging sapi -> niúròu)
    Exercise(
        id = "u19_s2_p2_q8",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "daging sapi",
        sentenceWithBlank = "牛肉 (________)",
        targetHanzi = "牛肉",
        targetPinyin = "niúròu",
        correctAnswer = "niurou",
        keyboardKeys = {k2_p2_q8},
        audioToSpeak = "牛肉"
    )""",
            f"""    // 9. Soal 9: Susun Kalimat (Kami makan daging sapi bersama nasi putih.)
    Exercise(
        id = "u19_s2_p2_q9",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Kami makan daging sapi dan nasi.",
        targetHanzi = "我们 吃 牛肉 和 米饭。",
        targetPinyin = "Wǒmen chī niúròu hé mǐfàn.",
        wordChips = listOf("我们:wǒmen", "吃:chī", "牛肉:niúròu", "和:hé", "米饭。:mǐfàn.", "鱼:yú"),
        correctAnswer = "我们,吃,牛肉,和,米饭。",
        audioToSpeak = "我们吃牛肉和米饭。"
    )""",
            f"""    // 10. Soal 10: Ketuk Pasangan yang Sesuai (Rangkuman Hidangan Daging & Nasi)
    Exercise(
        id = "u19_s2_p2_m10",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u19_s2_p2_m10_1", "牛肉", "niúròu", "daging sapi"),
            MatchPairItem("u19_s2_p2_m10_2", "米饭", "mǐfàn", "nasi putih"),
            MatchPairItem("u19_s2_p2_m10_3", "吃饱", "chī bǎo", "kenyang makan"),
            MatchPairItem("u19_s2_p2_m10_4", "新鲜鱼", "xīnxiān yú", "ikan segar")
        )
    )"""
        ]
    }

    # =========================================================================
    # STAGE 3: Aneka Teh & Kopi Favorit (红茶, 绿茶, 奶茶, 咖啡)
    # =========================================================================
    k3_p1_q4 = make_keys("hongcha")
    k3_p1_q8 = make_keys("lvcha")
    k3_p2_q4 = make_keys("naicha")
    k3_p2_q8 = make_keys("kafei")
    
    stages[3] = {
        "p1": [
            f"""    // 1. Soal 1: Pilihan Gambar (红茶 -> teh hitam)
    Exercise(
        id = "u19_s3_p1_q1",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "红茶",
        targetPinyin = "hóngchá",
        targetTranslation = "teh hitam",
        correctAnswer = "teh hitam",
        audioToSpeak = "红茶",
        pictureOptions = listOf(
            PictureOption("u19_s3_p1_opt1", "teh hitam", "", R.drawable.ic_food_tea, true),
            PictureOption("u19_s3_p1_opt2", "cangkir", "", R.drawable.ic_food_cup, false),
            PictureOption("u19_s3_p1_opt3", "restoran", "", R.drawable.ic_food_restaurant, false),
            PictureOption("u19_s3_p1_opt4", "masakan", "", R.drawable.ic_food_chinese_cuisine, false)
        )
    )""",
            f"""    // 2. Soal 2: Susun Kalimat (Tolong beri saya segelas teh hitam panas.)
    Exercise(
        id = "u19_s3_p1_q2",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Beri saya segelas teh hitam.",
        targetHanzi = "请 给 我 一 杯 热 红茶。",
        targetPinyin = "Qǐng gěi wǒ yì bēi rè hóngchá.",
        wordChips = listOf("请:qǐng", "给:gěi", "我:wǒ", "一:yì", "杯:bēi", "热:rè", "红茶。:hóngchá.", "绿茶:lǜchá"),
        correctAnswer = "请,给,我,一,杯,热,红茶。",
        audioToSpeak = "请给我一杯热红茶。"
    )""",
            f"""    // 3. Soal 3: Ketuk Pasangan yang Sesuai (Teh Hitam & Teh Hijau)
    Exercise(
        id = "u19_s3_p1_q3",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u19_s3_p1_m1", "红茶", "hóngchá", "teh hitam"),
            MatchPairItem("u19_s3_p1_m2", "绿茶", "lǜchá", "teh hijau"),
            MatchPairItem("u19_s3_p1_m3", "一杯茶", "yì bēi chá", "segelas teh"),
            MatchPairItem("u19_s3_p1_m4", "喝茶", "hē chá", "minum teh")
        )
    )""",
            f"""    // 4. Soal 4: Ketik Pinyin (teh hitam -> hóngchá)
    Exercise(
        id = "u19_s3_p1_q4",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "teh hitam",
        sentenceWithBlank = "红茶 (________)",
        targetHanzi = "红茶",
        targetPinyin = "hóngchá",
        correctAnswer = "hongcha",
        keyboardKeys = {k3_p1_q4},
        audioToSpeak = "红茶"
    )""",
            f"""    // 5. Soal 5: Mendengar Kalimat (Rule 10: illustrationRes = 0)
    Exercise(
        id = "u19_s3_p1_q5",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Apa yang Anda dengar?",
        targetTranslation = "Minum teh hijau sangat baik untuk kesehatan.",
        targetHanzi = "喝 绿茶 对 身体 很 好。",
        targetPinyin = "Hē lǜchá duì shēntǐ hěn hǎo.",
        wordChips = listOf("喝:hē", "绿茶:lǜchá", "对:duì", "身体:shēntǐ", "很:hěn", "好。:hǎo.", "红茶:hóngchá"),
        correctAnswer = "喝,绿茶,对,身体,很,好。",
        illustrationRes = 0,
        audioToSpeak = "喝绿茶对身体很好。"
    )""",
            f"""    // 6. Soal 6: Pilihan Kalimat
    Exercise(
        id = "u19_s3_p1_q6",
        type = ExerciseType.SENTENCE_CHOICE,
        title = "Pilih terjemahan yang benar",
        targetHanzi = "中国 人 很 喜欢 喝 绿茶。",
        targetPinyin = "Zhōngguó rén hěn xǐhuan hē lǜchá.",
        targetTranslation = "Orang Tiongkok sangat suka minum teh hijau.",
        correctAnswer = "Zhōngguó rén hěn xǐhuan hē lǜchá.\\n中国 人 很 喜欢 喝 绿茶。",
        options = listOf(
            "Zhōngguó rén hěn xǐhuan hē lǜchá.\\n中国 人 很 喜欢 喝 绿茶。",
            "Zhōngguó rén bù xǐhuan hē lǜchá.\\n中国 人 不 喜欢 喝 绿茶。",
            "Yìnní rén hěn xǐhuan hē lǜchá.\\n印尼 人 很 喜欢 喝 绿茶。"
        ),
        audioToSpeak = "中国人很喜欢喝绿茶。"
    )""",
            f"""    // 7. Soal 7: Pilihan Gambar (绿茶 -> teh hijau)
    Exercise(
        id = "u19_s3_p1_q7",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "绿茶",
        targetPinyin = "lǜchá",
        targetTranslation = "teh hijau",
        correctAnswer = "teh hijau",
        audioToSpeak = "绿茶",
        pictureOptions = listOf(
            PictureOption("u19_s3_p1_opt7_1", "teh hijau", "", R.drawable.ic_food_tea, true),
            PictureOption("u19_s3_p1_opt7_2", "cangkir", "", R.drawable.ic_food_cup, false),
            PictureOption("u19_s3_p1_opt7_3", "restoran", "", R.drawable.ic_food_restaurant, false),
            PictureOption("u19_s3_p1_opt7_4", "hidangan", "", R.drawable.ic_food_chinese_cuisine, false)
        )
    )""",
            f"""    // 8. Soal 8: Ketik Pinyin (teh hijau -> lǜchá)
    Exercise(
        id = "u19_s3_p1_q8",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "teh hijau",
        sentenceWithBlank = "绿茶 (________)",
        targetHanzi = "绿茶",
        targetPinyin = "lǜchá",
        correctAnswer = "lvcha",
        keyboardKeys = {k3_p1_q8},
        audioToSpeak = "绿茶"
    )""",
            f"""    // 9. Soal 9: Susun Kalimat (Ayah setiap hari minum teh hijau.)
    Exercise(
        id = "u19_s3_p1_q9",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Ayah tiap hari minum teh hijau.",
        targetHanzi = "爸爸 每天 喝 绿茶。",
        targetPinyin = "Bàba měitiān hē lǜchá.",
        wordChips = listOf("爸爸:bàba", "每天:měitiān", "喝:hē", "绿茶。:lǜchá.", "牛奶:niúnǎi"),
        correctAnswer = "爸爸,每天,喝,绿茶。",
        audioToSpeak = "爸爸每天喝绿茶。"
    )""",
            f"""    // 10. Soal 10: Ketuk Pasangan yang Sesuai (Rangkuman Tradisi Minum Teh)
    Exercise(
        id = "u19_s3_p1_m10",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u19_s3_p1_m10_1", "红茶", "hóngchá", "teh hitam"),
            MatchPairItem("u19_s3_p1_m10_2", "绿茶", "lǜchá", "teh hijau"),
            MatchPairItem("u19_s3_p1_m10_3", "好身体", "hǎo shēntǐ", "badan sehat"),
            MatchPairItem("u19_s3_p1_m10_4", "每天喝", "měitiān hē", "minum tiap hari")
        )
    )"""
        ],
        "p2": [
            f"""    // 1. Soal 1: Pilihan Gambar (奶茶 -> teh susu / milk tea)
    Exercise(
        id = "u19_s3_p2_q1",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "奶茶",
        targetPinyin = "nǎichá",
        targetTranslation = "teh susu / milk tea",
        correctAnswer = "teh susu / milk tea",
        audioToSpeak = "奶茶",
        pictureOptions = listOf(
            PictureOption("u19_s3_p2_opt1", "teh susu", "", R.drawable.ic_food_cup, true),
            PictureOption("u19_s3_p2_opt2", "teh", "", R.drawable.ic_food_tea, false),
            PictureOption("u19_s3_p2_opt3", "restoran", "", R.drawable.ic_food_restaurant, false),
            PictureOption("u19_s3_p2_opt4", "hidangan", "", R.drawable.ic_food_chinese_cuisine, false)
        )
    )""",
            f"""    // 2. Soal 2: Susun Kalimat (Banyak anak muda suka minum teh susu.)
    Exercise(
        id = "u19_s3_p2_q2",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Anak muda suka minum teh susu.",
        targetHanzi = "年轻人 喜欢 喝 奶茶。",
        targetPinyin = "Niánqīngrén xǐhuan hē nǎichá.",
        wordChips = listOf("年轻人:niánqīngrén", "喜欢:xǐhuan", "喝:hē", "奶茶。:nǎichá.", "水:shuǐ"),
        correctAnswer = "年轻人,喜欢,喝,奶茶。",
        audioToSpeak = "年轻人喜欢喝奶茶。"
    )""",
            f"""    // 3. Soal 3: Ketuk Pasangan yang Sesuai (Teh Susu & Kopi)
    Exercise(
        id = "u19_s3_p2_m3",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u19_s3_p2_m1", "奶茶", "nǎichá", "teh susu / boba"),
            MatchPairItem("u19_s3_p2_m2", "咖啡", "kāfēi", "kopi"),
            MatchPairItem("u19_s3_p2_m3", "喝咖啡", "hē kāfēi", "minum kopi"),
            MatchPairItem("u19_s3_p2_m4", "甜奶茶", "tián nǎichá", "teh susu manis")
        )
    )""",
            f"""    // 4. Soal 4: Ketik Pinyin (teh susu -> nǎichá)
    Exercise(
        id = "u19_s3_p2_q4",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "teh susu / milk tea",
        sentenceWithBlank = "奶茶 (________)",
        targetHanzi = "奶茶",
        targetPinyin = "nǎichá",
        correctAnswer = "naicha",
        keyboardKeys = {k3_p2_q4},
        audioToSpeak = "奶茶"
    )""",
            f"""    // 5. Soal 5: Mendengar Kalimat (Rule 10: illustrationRes = 0)
    Exercise(
        id = "u19_s3_p2_q5",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Apa yang Anda dengar?",
        targetTranslation = "Pagi hari saya minum segelas kopi hitam.",
        targetHanzi = "早上 我 喝 了 一 杯 咖啡。",
        targetPinyin = "Zǎoshang wǒ hē le yì bēi kāfēi.",
        wordChips = listOf("早上:zǎoshang", "我:wǒ", "喝:hē", "了:le", "一:yì", "杯:bēi", "咖啡。:kāfēi.", "茶:chá"),
        correctAnswer = "早上,我,喝,了,一,杯,咖啡。",
        illustrationRes = 0,
        audioToSpeak = "早上我喝了一杯咖啡。"
    )""",
            f"""    // 6. Soal 6: Pilihan Kalimat
    Exercise(
        id = "u19_s3_p2_q6",
        type = ExerciseType.SENTENCE_CHOICE,
        title = "Pilih terjemahan yang benar",
        targetHanzi = "你 想 喝 咖啡 还是 喝 茶？",
        targetPinyin = "Nǐ xiǎng hē kāfēi háishi hē chá?",
        targetTranslation = "Kamu ingin minum kopi atau minum teh?",
        correctAnswer = "Nǐ xiǎng hē kāfēi háishi hē chá?\\n你 想 喝 咖啡 还是 喝 茶？",
        options = listOf(
            "Nǐ xiǎng hē kāfēi háishi hē chá?\\n你 想 喝 咖啡 还是 喝 茶？",
            "Nǐ xiǎng hē kāfēi hé chá ma?\\n你 想 喝 咖啡 和 茶 吗？",
            "Tā xiǎng hē kāfēi háishi hē chá?\\n他 想 喝 咖啡 还是 喝 茶？"
        ),
        audioToSpeak = "你想喝咖啡还是喝茶？"
    )""",
            f"""    // 7. Soal 7: Pilihan Gambar (咖啡 -> kopi)
    Exercise(
        id = "u19_s3_p2_q7",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "咖啡",
        targetPinyin = "kāfēi",
        targetTranslation = "kopi",
        correctAnswer = "kopi",
        audioToSpeak = "咖啡",
        pictureOptions = listOf(
            PictureOption("u19_s3_p2_opt7_1", "kopi", "", R.drawable.ic_food_cup, true),
            PictureOption("u19_s3_p2_opt7_2", "teh", "", R.drawable.ic_food_tea, false),
            PictureOption("u19_s3_p2_opt7_3", "restoran", "", R.drawable.ic_food_restaurant, false),
            PictureOption("u19_s3_p2_opt7_4", "hidangan", "", R.drawable.ic_food_chinese_cuisine, false)
        )
    )""",
            f"""    // 8. Soal 8: Ketik Pinyin (kopi -> kāfēi)
    Exercise(
        id = "u19_s3_p2_q8",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "kopi",
        sentenceWithBlank = "咖啡 (________)",
        targetHanzi = "咖啡",
        targetPinyin = "kāfēi",
        correctAnswer = "kafei",
        keyboardKeys = {k3_p2_q8},
        audioToSpeak = "咖啡"
    )""",
            f"""    // 9. Soal 9: Susun Kalimat (Secangkir kopi ini tidak manis.)
    Exercise(
        id = "u19_s3_p2_q9",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Kopi ini tidak manis.",
        targetHanzi = "这 杯 咖啡 不 甜。",
        targetPinyin = "Zhè bēi kāfēi bù tián.",
        wordChips = listOf("这:zhè", "杯:bēi", "咖啡:kāfēi", "不:bù", "甜。:tián.", "热:rè"),
        correctAnswer = "这,杯,咖啡,不,甜。",
        audioToSpeak = "这杯咖啡不甜。"
    )""",
            f"""    // 10. Soal 10: Ketuk Pasangan yang Sesuai (Rangkuman Ragam Minuman Populer)
    Exercise(
        id = "u19_s3_p2_m10",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u19_s3_p2_m10_1", "奶茶", "nǎichá", "teh susu"),
            MatchPairItem("u19_s3_p2_m10_2", "咖啡", "kāfēi", "kopi"),
            MatchPairItem("u19_s3_p2_m10_3", "一杯咖啡", "yì bēi kāfēi", "secangkir kopi"),
            MatchPairItem("u19_s3_p2_m10_4", "热饮", "rèyǐn", "minuman panas")
        )
    )"""
        ]
    }

    # =========================================================================
    # STAGE 4: Evaluasi Pengalaman & Cita Rasa (不错, 有意思, 没意思, 坏)
    # =========================================================================
    k4_p1_q4 = make_keys("bucuo")
    k4_p1_q8 = make_keys("huai")
    k4_p2_q4 = make_keys("youyisi")
    k4_p2_q8 = make_keys("meiyisi")
    
    stages[4] = {
        "p1": [
            f"""    // 1. Soal 1: Pilihan Gambar (不错 -> mantap / lumayan)
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
            PictureOption("u19_s4_p1_opt3", "teh", "", R.drawable.ic_food_tea, false),
            PictureOption("u19_s4_p1_opt4", "restoran", "", R.drawable.ic_food_restaurant, false)
        )
    )""",
            f"""    // 2. Soal 2: Susun Kalimat (Cita rasa masakan ini sungguh mantap!)
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
    )""",
            f"""    // 3. Soal 3: Ketuk Pasangan yang Sesuai (Mantap & Basi/Rusak)
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
    )""",
            f"""    // 4. Soal 4: Ketik Pinyin (bagus/mantap -> búcuò)
    Exercise(
        id = "u19_s4_p1_q4",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "bagus / lumayan / mantap",
        sentenceWithBlank = "不错 (________)",
        targetHanzi = "不错",
        targetPinyin = "búcuò",
        correctAnswer = "bucuo",
        keyboardKeys = {k4_p1_q4},
        audioToSpeak = "不错"
    )""",
            f"""    // 5. Soal 5: Mendengar Kalimat (Rule 10: illustrationRes = 0)
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
    )""",
            f"""    // 6. Soal 6: Pilihan Kalimat
    Exercise(
        id = "u19_s4_p1_q6",
        type = ExerciseType.SENTENCE_CHOICE,
        title = "Pilih terjemahan yang benar",
        targetHanzi = "今天 的 考试 成绩 很 不错。",
        targetPinyin = "Jīntiān de kǎoshì chéngjì hěn búcuò.",
        targetTranslation = "Nilai ujian hari ini lumayan bagus.",
        correctAnswer = "Jīntiān de kǎoshì chéngjì hěn búcuò.\\n今天 的 考试 成绩 很 不错。",
        options = listOf(
            "Jīntiān de kǎoshì chéngjì hěn búcuò.\\n今天 的 考试 成绩 很 不错。",
            "Jīntiān de kǎoshì chéngjì bù hǎo.\\n今天 的 考试 成绩 不 好。",
            "Míngtiān de kǎoshì chéngjì hěn búcuò.\\n明天 的 考试 成绩 很 不错。"
        ),
        audioToSpeak = "今天的考试成绩很不错。"
    )""",
            f"""    // 7. Soal 7: Pilihan Gambar (坏 -> rusak / basi)
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
            PictureOption("u19_s4_p1_opt7_1", "rusak", "", R.drawable.ic_food_chinese_cuisine, true),
            PictureOption("u19_s4_p1_opt7_2", "lezat", "", R.drawable.ic_food_delicious, false),
            PictureOption("u19_s4_p1_opt7_3", "teh", "", R.drawable.ic_food_tea, false),
            PictureOption("u19_s4_p1_opt7_4", "cangkir", "", R.drawable.ic_food_cup, false)
        )
    )""",
            f"""    // 8. Soal 8: Ketik Pinyin (rusak/basi -> huài)
    Exercise(
        id = "u19_s4_p1_q8",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "rusak / basi",
        sentenceWithBlank = "坏 (________)",
        targetHanzi = "坏",
        targetPinyin = "huài",
        correctAnswer = "huai",
        keyboardKeys = {k4_p1_q8},
        audioToSpeak = "坏"
    )""",
            f"""    // 9. Soal 9: Susun Kalimat (Ponsel saya rusak tidak bisa menelepon.)
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
    )""",
            f"""    // 10. Soal 10: Ketuk Pasangan yang Sesuai (Rangkuman Mutu Makanan)
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
    )"""
        ],
        "p2": [
            f"""    // 1. Soal 1: Pilihan Gambar (有意思 -> menarik / asyik)
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
            PictureOption("u19_s4_p2_opt1", "menarik", "", R.drawable.ic_comm_happy, true),
            PictureOption("u19_s4_p2_opt2", "teh", "", R.drawable.ic_food_tea, false),
            PictureOption("u19_s4_p2_opt3", "cangkir", "", R.drawable.ic_food_cup, false),
            PictureOption("u19_s4_p2_opt4", "restoran", "", R.drawable.ic_food_restaurant, false)
        )
    )""",
            f"""    // 2. Soal 2: Susun Kalimat (Membaca buku ini sangat menarik.)
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
    )""",
            f"""    // 3. Soal 3: Ketuk Pasangan yang Sesuai (Menarik vs Membosankan)
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
    )""",
            f"""    // 4. Soal 4: Ketik Pinyin (menarik -> yǒuyìsi)
    Exercise(
        id = "u19_s4_p2_q4",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "menarik / asyik",
        sentenceWithBlank = "有意思 (________)",
        targetHanzi = "有意思",
        targetPinyin = "yǒuyìsi",
        correctAnswer = "youyisi",
        keyboardKeys = {k4_p2_q4},
        audioToSpeak = "有意思"
    )""",
            f"""    // 5. Soal 5: Mendengar Kalimat (Rule 10: illustrationRes = 0)
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
    )""",
            f"""    // 6. Soal 6: Pilihan Kalimat
    Exercise(
        id = "u19_s4_p2_q6",
        type = ExerciseType.SENTENCE_CHOICE,
        title = "Pilih terjemahan yang benar",
        targetHanzi = "学 汉语 是 一 件 很 有意思 的 事。",
        targetPinyin = "Xué Hànyǔ shì yí jiàn hěn yǒuyìsi de shì.",
        targetTranslation = "Belajar bahasa Mandarin adalah hal yang sangat menarik.",
        correctAnswer = "Xué Hànyǔ shì yí jiàn hěn yǒuyìsi de shì.\\n学 汉语 是 一 件 很 有意思 的 事。",
        options = listOf(
            "Xué Hànyǔ shì yí jiàn hěn yǒuyìsi de shì.\\n学 汉语 是 一 件 很 有意思 的 事。",
            "Xué Hànyǔ shì yí jiàn méiyìsi de shì.\\n学 汉语 是 一 件 没意思 的 事。",
            "Kàn diànyǐng shì yí jiàn hěn yǒuyìsi de shì.\\n看 电影 是 一 件 很 有意思 的 事。"
        ),
        audioToSpeak = "学汉语是一件很有意思的事。"
    )""",
            f"""    // 7. Soal 7: Pilihan Gambar (没意思 -> membosankan)
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
            PictureOption("u19_s4_p2_opt7_1", "membosankan", "", R.drawable.ic_comm_know, true),
            PictureOption("u19_s4_p2_opt7_2", "gembira", "", R.drawable.ic_comm_happy, false),
            PictureOption("u19_s4_p2_opt7_3", "restoran", "", R.drawable.ic_food_restaurant, false),
            PictureOption("u19_s4_p2_opt7_4", "teh", "", R.drawable.ic_food_tea, false)
        )
    )""",
            f"""    // 8. Soal 8: Ketik Pinyin (membosankan -> méiyìsi)
    Exercise(
        id = "u19_s4_p2_q8",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "membosankan",
        sentenceWithBlank = "没意思 (________)",
        targetHanzi = "没意思",
        targetPinyin = "méiyìsi",
        correctAnswer = "meiyisi",
        keyboardKeys = {k4_p2_q8},
        audioToSpeak = "没意思"
    )""",
            f"""    // 9. Soal 9: Susun Kalimat (Permainan ini sangat seru.)
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
    )""",
            f"""    // 10. Soal 10: Ketuk Pasangan yang Sesuai (Rangkuman Evaluasi Pengalaman)
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
    )"""
        ]
    }

    # =========================================================================
    # STAGE 5: Kebersihan & Fasilitas Restoran (洗, 洗手间, Evaluasi Sintesis Bab 19)
    # =========================================================================
    k5_p1_q4 = make_keys("xi")
    k5_p1_q8 = make_keys("xishoujian")
    k5_p2_q4 = make_keys("fanguan")
    k5_p2_q8 = make_keys("naicha")
    
    stages[5] = {
        "p1": [
            f"""    // 1. Soal 1: Pilihan Gambar (洗手间 -> toilet / kamar kecil)
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
    )""",
            f"""    // 2. Soal 2: Susun Kalimat (Permisi toilet di lantai berapa?)
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
    )""",
            f"""    // 3. Soal 3: Ketuk Pasangan yang Sesuai (Toilet & Mencuci)
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
    )""",
            f"""    // 4. Soal 4: Ketik Pinyin (mencuci -> xǐ)
    Exercise(
        id = "u19_s5_p1_q4",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "mencuci",
        sentenceWithBlank = "洗 (________)",
        targetHanzi = "洗",
        targetPinyin = "xǐ",
        correctAnswer = "xi",
        keyboardKeys = {k5_p1_q4},
        audioToSpeak = "洗"
    )""",
            f"""    // 5. Soal 5: Mendengar Kalimat (Rule 10: illustrationRes = 0)
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
    )""",
            f"""    // 6. Soal 6: Pilihan Kalimat
    Exercise(
        id = "u19_s5_p1_q6",
        type = ExerciseType.SENTENCE_CHOICE,
        title = "Pilih terjemahan yang benar",
        targetHanzi = "洗手间 在 饭馆 的 后面。",
        targetPinyin = "Xǐshǒujiān zài fànguǎn de hòumiàn.",
        targetTranslation = "Toilet berada di bagian belakang restoran.",
        correctAnswer = "Xǐshǒujiān zài fànguǎn de hòumiàn.\\n洗手间 在 饭馆 的 后面。",
        options = listOf(
            "Xǐshǒujiān zài fànguǎn de hòumiàn.\\n洗手间 在 饭馆 的 后面。",
            "Xǐshǒujiān zài fànguǎn de qiánmiàn.\\n洗手间 在 饭馆 的 前面。",
            "Fànguǎn zài xǐshǒujiān de hòumiàn.\\n饭馆 在 洗手间 的 后面。"
        ),
        audioToSpeak = "洗手间在饭馆的后面。"
    )""",
            f"""    // 7. Soal 7: Pilihan Gambar (洗 -> mencuci)
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
    )""",
            f"""    // 8. Soal 8: Ketik Pinyin (toilet -> xǐshǒujiān)
    Exercise(
        id = "u19_s5_p1_q8",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "toilet / kamar kecil",
        sentenceWithBlank = "洗手间 (________)",
        targetHanzi = "洗手间",
        targetPinyin = "xǐshǒujiān",
        correctAnswer = "xishoujian",
        keyboardKeys = {k5_p1_q8},
        audioToSpeak = "洗手间"
    )""",
            f"""    // 9. Soal 9: Susun Kalimat (Saya ingin pergi ke toilet mencuci tangan.)
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
    )""",
            f"""    // 10. Soal 10: Ketuk Pasangan yang Sesuai (Rangkuman Fasilitas Restoran)
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
    )"""
        ],
        "p2": [
            f"""    // 1. Soal 1: Pilihan Gambar (饭馆 -> restoran / rumah makan)
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
    )""",
            f"""    // 2. Soal 2: Susun Kalimat (Ikan dan daging di restoran ini sangat lezat.)
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
    )""",
            f"""    // 3. Soal 3: Ketuk Pasangan yang Sesuai (Grand Sintesis Bab 19)
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
    )""",
            f"""    // 4. Soal 4: Ketik Pinyin (restoran -> fànguǎn)
    Exercise(
        id = "u19_s5_p2_q4",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "restoran / rumah makan",
        sentenceWithBlank = "饭馆 (________)",
        targetHanzi = "饭馆",
        targetPinyin = "fànguǎn",
        correctAnswer = "fanguan",
        keyboardKeys = {k5_p2_q4},
        audioToSpeak = "饭馆"
    )""",
            f"""    // 5. Soal 5: Mendengar Kalimat (Rule 10: illustrationRes = 0)
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
    )""",
            f"""    // 6. Soal 6: Pilihan Kalimat
    Exercise(
        id = "u19_s5_p2_q6",
        type = ExerciseType.SENTENCE_CHOICE,
        title = "Pilih terjemahan yang benar",
        targetHanzi = "这道 菜 没 坏， 很 有意思 的 味道。",
        targetPinyin = "Zhè dào cài méi huài, hěn yǒuyìsi de wèidao.",
        targetTranslation = "Masakan ini tidak basi, rasanya sangat menarik.",
        correctAnswer = "Zhè dào cài méi huài, hěn yǒuyìsi de wèidao.\\n这道 菜 没 坏， 很 有意思 的 味道。",
        options = listOf(
            "Zhè dào cài méi huài, hěn yǒuyìsi de wèidao.\\n这道 菜 没 坏， 很 有意思 的 味道。",
            "Zhè dào cài huài le, bù néng chī.\\n这道 菜 坏 了， 不 能 吃。",
            "Zhè dào cài hěn guì, bù hǎochī.\\n这道 菜 很 贵， 不 好吃。"
        ),
        audioToSpeak = "这道菜没坏，很有意思的味道。"
    )""",
            f"""    // 7. Soal 7: Pilihan Gambar (奶茶 -> teh susu)
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
    )""",
            f"""    // 8. Soal 8: Ketik Pinyin (teh susu -> nǎichá)
    Exercise(
        id = "u19_s5_p2_q8",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "teh susu",
        sentenceWithBlank = "奶茶 (________)",
        targetHanzi = "奶茶",
        targetPinyin = "nǎichá",
        correctAnswer = "naicha",
        keyboardKeys = {k5_p2_q8},
        audioToSpeak = "奶茶"
    )""",
            f"""    // 9. Soal 9: Susun Kalimat (Sebelum makan di restoran harus cuci tangan.)
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
    )""",
            f"""    // 10. Soal 10: Ketuk Pasangan yang Sesuai (Grand Review Final Bab 19)
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
    )"""
        ]
    }

    for s_idx in range(1, 6):
        filename = f"{base_dir}/Bab19Stage{s_idx}Data.kt"
        p1_code = ",\n\n".join(stages[s_idx]["p1"])
        p2_code = ",\n\n".join(stages[s_idx]["p2"])
        
        content = f"""package com.example.chineselearning.data.repository

import com.example.chineselearning.R
import com.example.chineselearning.data.model.Exercise
import com.example.chineselearning.data.model.ExerciseType
import com.example.chineselearning.data.model.MatchPairItem
import com.example.chineselearning.data.model.PictureOption

val bab19Stage{s_idx}Part1Exercises = listOf(
{p1_code}
)

val bab19Stage{s_idx}Part2Exercises = listOf(
{p2_code}
)
"""
        with open(filename, "w", encoding="utf-8") as f:
            f.write(content)
        print(f"Written {filename}")

if __name__ == "__main__":
    generate_bab19()
