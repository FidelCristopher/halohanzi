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

def generate_bab29():
    base_dir = "app/src/main/java/com/example/chineselearning/data/repository"
    
    stages = {}
    
    # =========================================================================
    # STAGE 1: Hubungan Sebab-Akibat & Alasan (因为, 所以, 为什么)
    # =========================================================================
    k1_p1_q4 = make_keys("yinwei")
    k1_p1_q8 = make_keys("suoyi")
    k1_p2_q4 = make_keys("weishenme")
    k1_p2_q8 = make_keys("shengbing")
    
    stages[1] = {
        "p1": [
            f"""    // 1. Soal 1: Pilihan Gambar (因为 -> karena / sebab)
    Exercise(
        id = "u29_s1_p1_q1",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "因为",
        targetPinyin = "yīnwèi",
        targetTranslation = "karena / sebab",
        correctAnswer = "karena / sebab",
        audioToSpeak = "因为",
        pictureOptions = listOf(
            PictureOption("u29_s1_p1_opt1", "sebab-akibat", "", R.drawable.ic_log_cause_effect, true),
            PictureOption("u29_s1_p1_opt2", "pertentangan", "", R.drawable.ic_log_contrast_switch, false),
            PictureOption("u29_s1_p1_opt3", "mengapa", "", R.drawable.ic_log_question_why, false),
            PictureOption("u29_s1_p1_opt4", "sopan", "", R.drawable.ic_etq_formal_bow, false)
        )
    )""",
            f"""    // 2. Soal 2: Susun Kalimat (Karena jatuh sakit, maka dia tidak datang masuk kelas.)
    Exercise(
        id = "u29_s1_p1_q2",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Karena sakit, maka dia tidak masuk.",
        targetHanzi = "因为 生病， 所以 他 没 来。",
        targetPinyin = "Yīnwèi shēngbìng, suǒyǐ tā méi lái.",
        wordChips = listOf("因为:yīnwèi", "生病，:shēngbìng,", "所以:suǒyǐ", "他:tā", "没:méi", "来。:lái.", "虽然:suīrán"),
        correctAnswer = "因为,生病，,所以,他,没,来。",
        audioToSpeak = "因为生病，所以他没来。"
    )""",
            f"""    // 3. Soal 3: Ketuk Pasangan yang Sesuai (Sebab & Akibat)
    Exercise(
        id = "u29_s1_p1_q3",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u29_s1_p1_m1", "因为", "yīnwèi", "karena"),
            MatchPairItem("u29_s1_p1_m2", "所以", "suǒyǐ", "maka / oleh karena itu"),
            MatchPairItem("u29_s1_p1_m3", "因为下雨", "yīnwèi xiàyǔ", "karena hujan"),
            MatchPairItem("u29_s1_p1_m4", "没来", "méi lái", "tidak datang")
        )
    )""",
            f"""    // 4. Soal 4: Ketik Pinyin (karena -> yīnwèi)
    Exercise(
        id = "u29_s1_p1_q4",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "karena / sebab",
        sentenceWithBlank = "因为 (________)",
        targetHanzi = "因为",
        targetPinyin = "yīnwèi",
        correctAnswer = "yinwei",
        keyboardKeys = {k1_p1_q4},
        audioToSpeak = "因为"
    )""",
            f"""    // 5. Soal 5: Mendengar Kalimat (Rule 10: illustrationRes = 0)
    Exercise(
        id = "u29_s1_p1_q5",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Apa yang Anda dengar?",
        targetTranslation = "Karena turun hujan, maka kami tidak pergi keluar.",
        targetHanzi = "因为 下雨， 所以 我们 没 出去。",
        targetPinyin = "Yīnwèi xiàyǔ, suǒyǐ wǒmen méi chūqù.",
        wordChips = listOf("因为:yīnwèi", "下雨，:xiàyǔ,", "所以:suǒyǐ", "我们:wǒmen", "没:méi", "出去。:chūqù.", "但是:dànshì"),
        correctAnswer = "因为,下雨，,所以,我们,没,出去。",
        illustrationRes = 0,
        audioToSpeak = "因为下雨，所以我们没出去。"
    )""",
            f"""    // 6. Soal 6: Pilihan Kalimat
    Exercise(
        id = "u29_s1_p1_q6",
        type = ExerciseType.SENTENCE_CHOICE,
        title = "Pilih terjemahan yang benar",
        targetHanzi = "因为 喜欢， 所以 我 买 了。",
        targetPinyin = "Yīnwèi xǐhuan, suǒyǐ wǒ mǎi le.",
        targetTranslation = "Karena suka, maka saya membelinya.",
        correctAnswer = "Yīnwèi xǐhuan, suǒyǐ wǒ mǎi le.\\n因为 喜欢， 所以 我 买 了。",
        options = listOf(
            "Yīnwèi xǐhuan, suǒyǐ wǒ mǎi le.\\n因为 喜欢， 所以 我 买 了。",
            "Suīrán xǐhuan, dànshì wǒ méi mǎi.\\n虽然 喜欢， 但是 我 没 买。",
            "Yīnwèi tài guì, suǒyǐ wǒ méi mǎi.\\n因为 太 贵， 所以 我 没 买。"
        ),
        audioToSpeak = "因为喜欢，所以我买了。"
    )""",
            f"""    // 7. Soal 7: Pilihan Gambar (所以 -> oleh karena itu)
    Exercise(
        id = "u29_s1_p1_q7",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "所以",
        targetPinyin = "suǒyǐ",
        targetTranslation = "oleh karena itu",
        correctAnswer = "oleh karena itu",
        audioToSpeak = "所以",
        pictureOptions = listOf(
            PictureOption("u29_s1_p1_opt7_1", "maka", "", R.drawable.ic_log_cause_effect, true),
            PictureOption("u29_s1_p1_opt7_2", "tetapi", "", R.drawable.ic_log_contrast_switch, false),
            PictureOption("u29_s1_p1_opt7_3", "tanya kenapa", "", R.drawable.ic_log_question_why, false),
            PictureOption("u29_s1_p1_opt7_4", "hadiah", "", R.drawable.ic_etq_gift_giving, false)
        )
    )""",
            f"""    // 8. Soal 8: Ketik Pinyin (maka/oleh karena itu -> suǒyǐ)
    Exercise(
        id = "u29_s1_p1_q8",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "maka / oleh karena itu",
        sentenceWithBlank = "所以 (________)",
        targetHanzi = "所以",
        targetPinyin = "suǒyǐ",
        correctAnswer = "suoyi",
        keyboardKeys = {k1_p1_q8},
        audioToSpeak = "所以"
    )""",
            f"""    // 9. Soal 9: Susun Kalimat (Karena dia sangat lelah, maka tidur lebih awal.)
    Exercise(
        id = "u29_s1_p1_q9",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Karena lelah, maka tidur cepat.",
        targetHanzi = "因为 太 累， 所以 睡 得 早。",
        targetPinyin = "Yīnwèi tài lèi, suǒyǐ shuì de zǎo.",
        wordChips = listOf("因为:yīnwèi", "太:tài", "累，:lèi,", "所以:suǒyǐ", "睡:shuì", "得:de", "早。:zǎo.", "晚:wǎn"),
        correctAnswer = "因为,太,累，,所以,睡,得,早。",
        audioToSpeak = "因为太累，所以睡得早。"
    )""",
            f"""    // 10. Soal 10: Ketuk Pasangan yang Sesuai (Rangkuman Pasangan Sebab-Akibat)
    Exercise(
        id = "u29_s1_p1_m10",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u29_s1_p1_m10_1", "因为", "yīnwèi", "sebab"),
            MatchPairItem("u29_s1_p1_m10_2", "所以", "suǒyǐ", "maka"),
            MatchPairItem("u29_s1_p1_m10_3", "因为想吃", "yīnwèi xiǎng chī", "karena mau makan"),
            MatchPairItem("u29_s1_p1_m10_4", "所以做饭", "suǒyǐ zuòfàn", "maka memasak")
        )
    )"""
        ],
        "p2": [
            f"""    // 1. Soal 1: Pilihan Gambar (为什么 -> mengapa / kenapa)
    Exercise(
        id = "u29_s1_p2_q1",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "为什么",
        targetPinyin = "wèishénme",
        targetTranslation = "mengapa / kenapa",
        correctAnswer = "mengapa / kenapa",
        audioToSpeak = "为什么",
        pictureOptions = listOf(
            PictureOption("u29_s1_p2_opt1", "mengapa", "", R.drawable.ic_log_question_why, true),
            PictureOption("u29_s1_p2_opt2", "sebab-akibat", "", R.drawable.ic_log_cause_effect, false),
            PictureOption("u29_s1_p2_opt3", "pertentangan", "", R.drawable.ic_log_contrast_switch, false),
            PictureOption("u29_s1_p2_opt4", "sopan santun", "", R.drawable.ic_etq_formal_bow, false)
        )
    )""",
            f"""    // 2. Soal 2: Susun Kalimat (Mengapa hari ini kamu datang begitu terlambat?)
    Exercise(
        id = "u29_s1_p2_q2",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Kenapa kamu datang begitu terlambat?",
        targetHanzi = "你 为什么 来 得 这么 晚？",
        targetPinyin = "Nǐ wèishénme lái de zhème wǎn?",
        wordChips = listOf("你:nǐ", "为什么:wèishénme", "来:lái", "得:de", "这么:zhème", "晚？:wǎn?", "早:zǎo"),
        correctAnswer = "你,为什么,来,得,这么,晚？",
        audioToSpeak = "你为什么来得这么晚？"
    )""",
            f"""    // 3. Soal 3: Ketuk Pasangan yang Sesuai (Menanyakan Alasan)
    Exercise(
        id = "u29_s1_p2_m3",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u29_s1_p2_m1", "为什么", "wèishénme", "mengapa"),
            MatchPairItem("u29_s1_p2_m2", "怎么了", "zěnme le", "ada apa"),
            MatchPairItem("u29_s1_p2_m3", "学中文", "xué Zhōngwén", "belajar Mandarin"),
            MatchPairItem("u29_s1_p2_m4", "因为喜欢", "yīnwèi xǐhuan", "karena suka")
        )
    )""",
            f"""    // 4. Soal 4: Ketik Pinyin (mengapa -> wèishénme)
    Exercise(
        id = "u29_s1_p2_q4",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "mengapa / kenapa",
        sentenceWithBlank = "为什么 (________)",
        targetHanzi = "为什么",
        targetPinyin = "wèishénme",
        correctAnswer = "weishenme",
        keyboardKeys = {k1_p2_q4},
        audioToSpeak = "为什么"
    )""",
            f"""    // 5. Soal 5: Mendengar Kalimat (Rule 10: illustrationRes = 0)
    Exercise(
        id = "u29_s1_p2_q5",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Apa yang Anda dengar?",
        targetTranslation = "Kenapa kamu tidak meminum obat?",
        targetHanzi = "你 为什么 不 吃 药？",
        targetPinyin = "Nǐ wèishénme bù chī yào?",
        wordChips = listOf("你:nǐ", "为什么:wèishénme", "不:bù", "吃:chī", "药？:yào?", "饭:fàn"),
        correctAnswer = "你,为什么,不,吃,药？",
        illustrationRes = 0,
        audioToSpeak = "你为什么不吃药？"
    )""",
            f"""    // 6. Soal 6: Pilihan Kalimat
    Exercise(
        id = "u29_s1_p2_q6",
        type = ExerciseType.SENTENCE_CHOICE,
        title = "Pilih terjemahan yang benar",
        targetHanzi = "你 为什么 想 学 汉语？",
        targetPinyin = "Nǐ wèishénme xiǎng xué Hànyǔ?",
        targetTranslation = "Mengapa kamu ingin belajar bahasa Mandarin?",
        correctAnswer = "Nǐ wèishénme xiǎng xué Hànyǔ?\\n你 为什么 想 学 汉语？",
        options = listOf(
            "Nǐ wèishénme xiǎng xué Hànyǔ?\\n你 为什么 想 学 汉语？",
            "Nǐ zài nǎlǐ xué Hànyǔ?\\n你 在 哪里 学 汉语？",
            "Tā wèishénme xiǎng xué Hànyǔ?\\n他 为什么 想 学 汉语？"
        ),
        audioToSpeak = "你为什么想学汉语？"
    )""",
            f"""    // 7. Soal 7: Pilihan Gambar (为什么 -> tanda tanya kenapa)
    Exercise(
        id = "u29_s1_p2_q7",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "为什么",
        targetPinyin = "wèishénme",
        targetTranslation = "kenapa",
        correctAnswer = "kenapa",
        audioToSpeak = "为什么",
        pictureOptions = listOf(
            PictureOption("u29_s1_p2_opt7_1", "kenapa", "", R.drawable.ic_log_question_why, true),
            PictureOption("u29_s1_p2_opt7_2", "sebab-akibat", "", R.drawable.ic_log_cause_effect, false),
            PictureOption("u29_s1_p2_opt7_3", "pertentangan", "", R.drawable.ic_log_contrast_switch, false),
            PictureOption("u29_s1_p2_opt7_4", "bow", "", R.drawable.ic_etq_formal_bow, false)
        )
    )""",
            f"""    // 8. Soal 8: Ketik Pinyin (mengapa -> wèishénme)
    Exercise(
        id = "u29_s1_p2_q8",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "mengapa",
        sentenceWithBlank = "为什么 (________)",
        targetHanzi = "为什么",
        targetPinyin = "wèishénme",
        correctAnswer = "weishenme",
        keyboardKeys = {k1_p2_q4},
        audioToSpeak = "为什么"
    )""",
            f"""    // 9. Soal 9: Susun Kalimat (Mengapa hari ini di toko tidak ada orang?)
    Exercise(
        id = "u29_s1_p2_q9",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Kenapa di toko tidak ada orang?",
        targetHanzi = "商店 为什么 没有 人？",
        targetPinyin = "Shāngdiàn wèishénme méiyǒu rén?",
        wordChips = listOf("商店:shāngdiàn", "为什么:wèishénme", "没有:méiyǒu", "人？:rén?", "很多:hěn duō"),
        correctAnswer = "商店,为什么,没有,人？",
        audioToSpeak = "商店为什么没有人？"
    )""",
            f"""    // 10. Soal 10: Ketuk Pasangan yang Sesuai (Rangkuman Pertanyaan Alasan)
    Exercise(
        id = "u29_s1_p2_m10",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u29_s1_p2_m10_1", "为什么", "wèishénme", "kenapa"),
            MatchPairItem("u29_s1_p2_m10_2", "没有去", "méiyǒu qù", "tidak pergi"),
            MatchPairItem("u29_s1_p2_m10_3", "为什么笑", "wèishénme xiào", "kenapa tertawa"),
            MatchPairItem("u29_s1_p2_m10_4", "迟到了", "chídào le", "terlambat")
        )
    )"""
        ]
    }

    # =========================================================================
    # STAGE 2: Hubungan Pertentangan & Transisi (虽然, 但是, 但)
    # =========================================================================
    k2_p1_q4 = make_keys("suiran")
    k2_p1_q8 = make_keys("danshi")
    k2_p2_q4 = make_keys("dan")
    k2_p2_q8 = make_keys("hennan")
    
    stages[2] = {
        "p1": [
            f"""    // 1. Soal 1: Pilihan Gambar (虽然 -> meskipun / walaupun)
    Exercise(
        id = "u29_s2_p1_q1",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "虽然",
        targetPinyin = "suīrán",
        targetTranslation = "meskipun / walaupun",
        correctAnswer = "meskipun / walaupun",
        audioToSpeak = "虽然",
        pictureOptions = listOf(
            PictureOption("u29_s2_p1_opt1", "pertentangan", "", R.drawable.ic_log_contrast_switch, true),
            PictureOption("u29_s2_p1_opt2", "sebab-akibat", "", R.drawable.ic_log_cause_effect, false),
            PictureOption("u29_s2_p1_opt3", "tanya kenapa", "", R.drawable.ic_log_question_why, false),
            PictureOption("u29_s2_p1_opt4", "sopan", "", R.drawable.ic_etq_formal_bow, false)
        )
    )""",
            f"""    // 2. Soal 2: Susun Kalimat (Meskipun bahasa Mandarin sulit, tetapi dia belajar dengan riang.)
    Exercise(
        id = "u29_s2_p1_q2",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Meskipun Mandarin sulit, tapi senang belajarnya.",
        targetHanzi = "虽然 汉语 难， 但是 很 快乐。",
        targetPinyin = "Suīrán Hànyǔ nán, dànshì hěn kuàilè.",
        wordChips = listOf("虽然:suīrán", "汉语:Hànyǔ", "难，:nán,", "但是:dànshì", "很:hěn", "快乐。:kuàilè.", "所以:suǒyǐ"),
        correctAnswer = "虽然,汉语,难，,但是,很,快乐。",
        audioToSpeak = "虽然汉语难，但是很快乐。"
    )""",
            f"""    // 3. Soal 3: Ketuk Pasangan yang Sesuai (Walaupun & Tetapi)
    Exercise(
        id = "u29_s2_p1_q3",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u29_s2_p1_m1", "虽然", "suīrán", "meskipun"),
            MatchPairItem("u29_s2_p1_m2", "但是", "dànshì", "tetapi / namun"),
            MatchPairItem("u29_s2_p1_m3", "虽然难", "suīrán nán", "walau sulit"),
            MatchPairItem("u29_s2_p1_m4", "太贵了", "tài guì le", "terlalu mahal")
        )
    )""",
            f"""    // 4. Soal 4: Ketik Pinyin (meskipun -> suīrán)
    Exercise(
        id = "u29_s2_p1_q4",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "meskipun / walaupun",
        sentenceWithBlank = "虽然 (________)",
        targetHanzi = "虽然",
        targetPinyin = "suīrán",
        correctAnswer = "suiran",
        keyboardKeys = {k2_p1_q4},
        audioToSpeak = "虽然"
    )""",
            f"""    // 5. Soal 5: Mendengar Kalimat (Rule 10: illustrationRes = 0)
    Exercise(
        id = "u29_s2_p1_q5",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Apa yang Anda dengar?",
        targetTranslation = "Pakaian ini sangat indah, tetapi terlalu mahal.",
        targetHanzi = "衣服 很 美， 但是 太 贵 了。",
        targetPinyin = "Yīfu hěn měi, dànshì tài guì le.",
        wordChips = listOf("衣服:yīfu", "很:hěn", "美，:měi,", "但是:dànshì", "太:tài", "贵:guì", "了。:le.", "便宜:piányi"),
        correctAnswer = "衣服,很,美，,但是,太,贵,了。",
        illustrationRes = 0,
        audioToSpeak = "衣服很美，但是太贵了。"
    )""",
            f"""    // 6. Soal 6: Pilihan Kalimat
    Exercise(
        id = "u29_s2_p1_q6",
        type = ExerciseType.SENTENCE_CHOICE,
        title = "Pilih terjemahan yang benar",
        targetHanzi = "他 虽然 小， 但是 很 懂事。",
        targetPinyin = "Tā suīrán xiǎo, dànshì hěn dǒngshì.",
        targetTranslation = "Meskipun dia masih kecil, tetapi sangat bijaksana.",
        correctAnswer = "Tā suīrán xiǎo, dànshì hěn dǒngshì.\\n他 虽然 小， 但是 很 懂事。",
        options = listOf(
            "Tā suīrán xiǎo, dànshì hěn dǒngshì.\\n他 虽然 小， 但是 很 懂事。",
            "Yīnwèi tā xiǎo, suǒyǐ hěn dǒngshì.\\n因为 他 小， 所以 很 懂事。",
            "Tā suīrán dà, dànshì bù dǒngshì.\\n他 虽然 大， 但是 不 懂事。"
        ),
        audioToSpeak = "他虽然小，但是很懂事。"
    )""",
            f"""    // 7. Soal 7: Pilihan Gambar (但是 -> tetapi / switch)
    Exercise(
        id = "u29_s2_p1_q7",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "但是",
        targetPinyin = "dànshì",
        targetTranslation = "tetapi / namun",
        correctAnswer = "tetapi / namun",
        audioToSpeak = "但是",
        pictureOptions = listOf(
            PictureOption("u29_s2_p1_opt7_1", "tetapi", "", R.drawable.ic_log_contrast_switch, true),
            PictureOption("u29_s2_p1_opt7_2", "sebab-akibat", "", R.drawable.ic_log_cause_effect, false),
            PictureOption("u29_s2_p1_opt7_3", "pertanyaan", "", R.drawable.ic_log_question_why, false),
            PictureOption("u29_s2_p1_opt7_4", "salam", "", R.drawable.ic_etq_formal_bow, false)
        )
    )""",
            f"""    // 8. Soal 8: Ketik Pinyin (tetapi -> dànshì)
    Exercise(
        id = "u29_s2_p1_q8",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "tetapi / namun",
        sentenceWithBlank = "但是 (________)",
        targetHanzi = "但是",
        targetPinyin = "dànshì",
        correctAnswer = "danshi",
        keyboardKeys = {k2_p1_q8},
        audioToSpeak = "但是"
    )""",
            f"""    // 9. Soal 9: Susun Kalimat (Meskipun di luar dingin, di dalam rumah hangat.)
    Exercise(
        id = "u29_s2_p1_q9",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Walau luar dingin, dalam rumah hangat.",
        targetHanzi = "虽然 外面 冷， 但是 屋里 暖和。",
        targetPinyin = "Suīrán wàimiàn lěng, dànshì wūlǐ nuǎnhuo.",
        wordChips = listOf("虽然:suīrán", "外面:wàimiàn", "冷，:lěng,", "但是:dànshì", "屋里:wūlǐ", "暖和。:nuǎnhuo.", "热:rè"),
        correctAnswer = "虽然,外面,冷，,但是,屋里,暖和。",
        audioToSpeak = "虽然外面冷，但是屋里暖和。"
    )""",
            f"""    // 10. Soal 10: Ketuk Pasangan yang Sesuai (Rangkuman Hubungan Transisi)
    Exercise(
        id = "u29_s2_p1_m10",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u29_s2_p1_m10_1", "虽然", "suīrán", "kendati"),
            MatchPairItem("u29_s2_p1_m10_2", "但是", "dànshì", "namun"),
            MatchPairItem("u29_s2_p1_m10_3", "屋里暖和", "wūlǐ nuǎnhuo", "dalam rumah hangat"),
            MatchPairItem("u29_s2_p1_m10_4", "外面很冷", "wàimiàn hěn lěng", "di luar dingin")
        )
    )"""
        ],
        "p2": [
            f"""    // 1. Soal 1: Pilihan Gambar (但 -> tetapi ringkas)
    Exercise(
        id = "u29_s2_p2_q1",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "但",
        targetPinyin = "dàn",
        targetTranslation = "tetapi (ringkas)",
        correctAnswer = "tetapi (ringkas)",
        audioToSpeak = "但",
        pictureOptions = listOf(
            PictureOption("u29_s2_p2_opt1", "tetapi", "", R.drawable.ic_log_contrast_switch, true),
            PictureOption("u29_s2_p2_opt2", "sebab-akibat", "", R.drawable.ic_log_cause_effect, false),
            PictureOption("u29_s2_p2_opt3", "kenapa", "", R.drawable.ic_log_question_why, false),
            PictureOption("u29_s2_p2_opt4", "hadiah", "", R.drawable.ic_etq_gift_giving, false)
        )
    )""",
            f"""    // 2. Soal 2: Susun Kalimat (Saya meskipun lelah, tapi di hati sangat senang.)
    Exercise(
        id = "u29_s2_p2_q2",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Saya walau lelah, tapi hati senang.",
        targetHanzi = "我 虽然 累， 但 心里 高兴。",
        targetPinyin = "Wǒ suīrán lèi, dàn xīnlǐ gāoxìng.",
        wordChips = listOf("我:wǒ", "虽然:suīrán", "累，:lèi,", "但:dàn", "心里:xīnlǐ", "高兴。:gāoxìng.", "难过:nánguò"),
        correctAnswer = "我,虽然,累，,但,心里,高兴。",
        audioToSpeak = "我虽然累，但心里高兴。"
    )""",
            f"""    // 3. Soal 3: Ketuk Pasangan yang Sesuai (Kontras Ringkas 但)
    Exercise(
        id = "u29_s2_p2_m3",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u29_s2_p2_m1", "但", "dàn", "tapi"),
            MatchPairItem("u29_s2_p2_m2", "虽然", "suīrán", "walaupun"),
            MatchPairItem("u29_s2_p2_m3", "心里高兴", "xīnlǐ gāoxìng", "hati senang"),
            MatchPairItem("u29_s2_p2_m4", "身体累", "shēntǐ lèi", "badan lelah")
        )
    )""",
            f"""    // 4. Soal 4: Ketik Pinyin (tapi ringkas -> dàn)
    Exercise(
        id = "u29_s2_p2_q4",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "tetapi / namun",
        sentenceWithBlank = "但 (________)",
        targetHanzi = "但",
        targetPinyin = "dàn",
        correctAnswer = "dan",
        keyboardKeys = {k2_p2_q4},
        audioToSpeak = "但"
    )""",
            f"""    // 5. Soal 5: Mendengar Kalimat (Rule 10: illustrationRes = 0)
    Exercise(
        id = "u29_s2_p2_q5",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Apa yang Anda dengar?",
        targetTranslation = "Saya sangat ingin pergi, tapi tidak ada waktu.",
        targetHanzi = "我 很 想 去， 但 没 时间。",
        targetPinyin = "Wǒ hěn xiǎng qù, dàn méi shíjiān.",
        wordChips = listOf("我:wǒ", "很:hěn", "想:xiǎng", "去，:qù,", "但:dàn", "没:méi", "时间。:shíjiān.", "有:yǒu"),
        correctAnswer = "我,很,想,去，,但,没,时间。",
        illustrationRes = 0,
        audioToSpeak = "我很想去，但没时间。"
    )""",
            f"""    // 6. Soal 6: Pilihan Kalimat
    Exercise(
        id = "u29_s2_p2_q6",
        type = ExerciseType.SENTENCE_CHOICE,
        title = "Pilih terjemahan yang benar",
        targetHanzi = "这 题 很 难， 但 我 懂 了。",
        targetPinyin = "Zhè tí hěn nán, dàn wǒ dǒng le.",
        targetTranslation = "Soal ini sangat sulit, tapi saya sudah mengerti.",
        correctAnswer = "Zhè tí hěn nán, dàn wǒ dǒng le.\\n这 题 很 难， 但 我 懂 了。",
        options = listOf(
            "Zhè tí hěn nán, dàn wǒ dǒng le.\\n这 题 很 难， 但 我 懂 了。",
            "Zhè tí hěn róngyì, wǒ dǒng le.\\n这 题 很 容易， 我 懂 了。",
            "Zhè tí hěn nán, wǒ bù dǒng.\\n这 题 很 难， 我 不 懂。"
        ),
        audioToSpeak = "这题很难，但我懂了。"
    )""",
            f"""    // 7. Soal 7: Pilihan Gambar (但是 -> peralihan kontras)
    Exercise(
        id = "u29_s2_p2_q7",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "但是",
        targetPinyin = "dànshì",
        targetTranslation = "tetapi",
        correctAnswer = "tetapi",
        audioToSpeak = "但是",
        pictureOptions = listOf(
            PictureOption("u29_s2_p2_opt7_1", "kontras tapi", "", R.drawable.ic_log_contrast_switch, true),
            PictureOption("u29_s2_p2_opt7_2", "sebab akibat", "", R.drawable.ic_log_cause_effect, false),
            PictureOption("u29_s2_p2_opt7_3", "tanya kenapa", "", R.drawable.ic_log_question_why, false),
            PictureOption("u29_s2_p2_opt7_4", "hadiah", "", R.drawable.ic_etq_gift_giving, false)
        )
    )""",
            f"""    // 8. Soal 8: Ketik Pinyin (sangat sulit -> hěnnán)
    Exercise(
        id = "u29_s2_p2_q8",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "sangat sulit",
        sentenceWithBlank = "很难 (________)",
        targetHanzi = "很难",
        targetPinyin = "hěnnán",
        correctAnswer = "hennan",
        keyboardKeys = {k2_p2_q8},
        audioToSpeak = "很难"
    )""",
            f"""    // 9. Soal 9: Susun Kalimat (Masakan ini enak tapi agak mahal.)
    Exercise(
        id = "u29_s2_p2_q9",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Masakan ini enak tapi agak mahal.",
        targetHanzi = "菜 好吃， 但 有点 贵。",
        targetPinyin = "Cài hǎochī, dàn yǒudiǎn guì.",
        wordChips = listOf("菜:cài", "好吃，:hǎochī,", "但:dàn", "有点:yǒudiǎn", "贵。:guì.", "便宜:piányi"),
        correctAnswer = "菜,好吃，,但,有点,贵。",
        audioToSpeak = "菜好吃，但有点贵。"
    )""",
            f"""    // 10. Soal 10: Ketuk Pasangan yang Sesuai (Rangkuman Kontras Sifat)
    Exercise(
        id = "u29_s2_p2_m10",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u29_s2_p2_m10_1", "但有点贵", "dàn yǒudiǎn guì", "tapi agak mahal"),
            MatchPairItem("u29_s2_p2_m10_2", "但没时间", "dàn méi shíjiān", "tapi tak ada waktu"),
            MatchPairItem("u29_s2_p2_m3", "菜好吃", "cài hǎochī", "masakan sedap"),
            MatchPairItem("u29_s2_p2_m4", "我很想", "wǒ hěn xiǎng", "saya ingin")
        )
    )"""
        ]
    }

    # =========================================================================
    # STAGE 3: Pilihan Alternatif, Kausatif & Kemungkinan (还是, 让, 可能)
    # =========================================================================
    k3_p1_q4 = make_keys("haishi")
    k3_p1_q8 = make_keys("rang")
    k3_p2_q4 = make_keys("keneng")
    k3_p2_q8 = make_keys("xiayu")
    
    stages[3] = {
        "p1": [
            f"""    // 1. Soal 1: Pilihan Gambar (还是 -> ataukah / pilihan)
    Exercise(
        id = "u29_s3_p1_q1",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "还是",
        targetPinyin = "háishi",
        targetTranslation = "atau (dalam pertanyaan)",
        correctAnswer = "atau (dalam pertanyaan)",
        audioToSpeak = "还是",
        pictureOptions = listOf(
            PictureOption("u29_s3_p1_opt1", "pilihan atau", "", R.drawable.ic_log_contrast_switch, true),
            PictureOption("u29_s3_p1_opt2", "kenapa", "", R.drawable.ic_log_question_why, false),
            PictureOption("u29_s3_p1_opt3", "sebab", "", R.drawable.ic_log_cause_effect, false),
            PictureOption("u29_s3_p1_opt4", "sopan", "", R.drawable.ic_etq_formal_bow, false)
        )
    )""",
            f"""    // 2. Soal 2: Susun Kalimat (Kamu ingin minum kopi ataukah minum teh?)
    Exercise(
        id = "u29_s3_p1_q2",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Kamu mau minum kopi atau minum teh?",
        targetHanzi = "你 想 喝 咖啡 还是 喝 茶？",
        targetPinyin = "Nǐ xiǎng hē kāfēi háishi hē chá?",
        wordChips = listOf("你:nǐ", "想:xiǎng", "喝:hē", "咖啡:kāfēi", "还是:háishi", "喝:hē", "茶？:chá.", "水:shuǐ"),
        correctAnswer = "你,想,喝,咖啡,还是,喝,茶？",
        audioToSpeak = "你想喝咖啡还是喝茶？"
    )""",
            f"""    // 3. Soal 3: Ketuk Pasangan yang Sesuai (Pilihan & Kausatif)
    Exercise(
        id = "u29_s3_p1_q3",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u29_s3_p1_m1", "还是", "háishi", "atau (tanya)"),
            MatchPairItem("u29_s3_p1_m2", "让", "ràng", "menyuruh / membiarkan"),
            MatchPairItem("u29_s3_p1_m3", "喝咖啡", "hē kāfēi", "minum kopi"),
            MatchPairItem("u29_s3_p1_m4", "喝红茶", "hē hóngchá", "minum teh merah")
        )
    )""",
            f"""    // 4. Soal 4: Ketik Pinyin (atau -> háishi)
    Exercise(
        id = "u29_s3_p1_q4",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "atau (dalam pertanyaan)",
        sentenceWithBlank = "还是 (________)",
        targetHanzi = "还是",
        targetPinyin = "háishi",
        correctAnswer = "haishi",
        keyboardKeys = {k3_p1_q4},
        audioToSpeak = "还是"
    )""",
            f"""    // 5. Soal 5: Mendengar Kalimat (Rule 10: illustrationRes = 0)
    Exercise(
        id = "u29_s3_p1_q5",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Apa yang Anda dengar?",
        targetTranslation = "Ibu menyuruh saya lekas pulang makan nasi.",
        targetHanzi = "妈妈 让 我 早点 回家 吃饭。",
        targetPinyin = "Māma ràng wǒ zǎodiǎn huíjiā chīfàn.",
        wordChips = listOf("妈妈:māma", "让:ràng", "我:wǒ", "早点:zǎodiǎn", "回家:huíjiā", "吃饭。:chīfàn.", "去:qù"),
        correctAnswer = "妈妈,让,我,早点,回家,吃饭。",
        illustrationRes = 0,
        audioToSpeak = "妈妈让我早点回家吃饭。"
    )""",
            f"""    // 6. Soal 6: Pilihan Kalimat
    Exercise(
        id = "u29_s3_p1_q6",
        type = ExerciseType.SENTENCE_CHOICE,
        title = "Pilih terjemahan yang benar",
        targetHanzi = "老师 让 我 回答 问题。",
        targetPinyin = "Lǎoshī ràng wǒ huídá wèntí.",
        targetTranslation = "Guru menyuruh saya menjawab pertanyaan.",
        correctAnswer = "Lǎoshī ràng wǒ huídá wèntí.\\n老师 让 我 回答 问题。",
        options = listOf(
            "Lǎoshī ràng wǒ huídá wèntí.\\n老师 让 我 回答 问题。",
            "Lǎoshī ràng tā huídá wèntí.\\n老师 让 他 回答 问题。",
            "Wǒ ràng lǎoshī huídá wèntí.\\n我 让 老师 回答 问题。"
        ),
        audioToSpeak = "老师让我回答问题。"
    )""",
            f"""    // 7. Soal 7: Pilihan Gambar (让 -> menyuruh / kausatif)
    Exercise(
        id = "u29_s3_p1_q7",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "让",
        targetPinyin = "ràng",
        targetTranslation = "menyuruh / membiarkan",
        correctAnswer = "menyuruh / membiarkan",
        audioToSpeak = "让",
        pictureOptions = listOf(
            PictureOption("u29_s3_p1_opt7_1", "menyuruh", "", R.drawable.ic_etq_gift_giving, true),
            PictureOption("u29_s3_p1_opt7_2", "pertentangan", "", R.drawable.ic_log_contrast_switch, false),
            PictureOption("u29_s3_p1_opt7_3", "kenapa", "", R.drawable.ic_log_question_why, false),
            PictureOption("u29_s3_p1_opt7_4", "sebab", "", R.drawable.ic_log_cause_effect, false)
        )
    )""",
            f"""    // 8. Soal 8: Ketik Pinyin (menyuruh -> ràng)
    Exercise(
        id = "u29_s3_p1_q8",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "menyuruh / membiarkan",
        sentenceWithBlank = "让 (________)",
        targetHanzi = "让",
        targetPinyin = "ràng",
        correctAnswer = "rang",
        keyboardKeys = {k3_p1_q8},
        audioToSpeak = "让"
    )""",
            f"""    // 9. Soal 9: Susun Kalimat (Hari ini pergi ataukah besok pergi?)
    Exercise(
        id = "u29_s3_p1_q9",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Hari ini pergi atau besok pergi?",
        targetHanzi = "今天 去 还是 明天 去？",
        targetPinyin = "Jīntiān qù háishi míngtiān qù?",
        wordChips = listOf("今天:jīntiān", "去:qù", "还是:háishi", "明天:míngtiān", "去？:qù.", "昨天:zuótiān"),
        correctAnswer = "今天,去,还是,明天,去？",
        audioToSpeak = "今天去还是明天去？"
    )""",
            f"""    // 10. Soal 10: Ketuk Pasangan yang Sesuai (Rangkuman Pilihan Tanya)
    Exercise(
        id = "u29_s3_p1_m10",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u29_s3_p1_m10_1", "还是", "háishi", "ataukah"),
            MatchPairItem("u29_s3_p1_m2", "让我想想", "ràng wǒ xiǎngxiang", "biar kupikirkan"),
            MatchPairItem("u29_s3_p1_m3", "回答问题", "huídá wèntí", "menjawab soal"),
            MatchPairItem("u29_s3_p1_m4", "早点回家", "zǎodiǎn huíjiā", "lekas pulang")
        )
    )"""
        ],
        "p2": [
            f"""    // 1. Soal 1: Pilihan Gambar (可能 -> mungkin / barangkali)
    Exercise(
        id = "u29_s3_p2_q1",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "可能",
        targetPinyin = "kěnéng",
        targetTranslation = "mungkin / barangkali",
        correctAnswer = "mungkin / barangkali",
        audioToSpeak = "可能",
        pictureOptions = listOf(
            PictureOption("u29_s3_p2_opt1", "mungkin", "", R.drawable.ic_log_question_why, true),
            PictureOption("u29_s3_p2_opt2", "kontras", "", R.drawable.ic_log_contrast_switch, false),
            PictureOption("u29_s3_p2_opt3", "sebab", "", R.drawable.ic_log_cause_effect, false),
            PictureOption("u29_s3_p2_opt4", "sopan", "", R.drawable.ic_etq_formal_bow, false)
        )
    )""",
            f"""    // 2. Soal 2: Susun Kalimat (Besok sore barangkali akan turun hujan lebat.)
    Exercise(
        id = "u29_s3_p2_q2",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Besok sore mungkin turun hujan.",
        targetHanzi = "明天 下午 可能 会 下雨。",
        targetPinyin = "Míngtiān xiàwǔ kěnéng huì xiàyǔ.",
        wordChips = listOf("明天:míngtiān", "下午:xiàwǔ", "可能:kěnéng", "会:huì", "下雨。:xiàyǔ.", "晴天:qíngtiān"),
        correctAnswer = "明天,下午,可能,会,下雨。",
        audioToSpeak = "明天下午可能会下雨。"
    )""",
            f"""    // 3. Soal 3: Ketuk Pasangan yang Sesuai (Kemungkinan)
    Exercise(
        id = "u29_s3_p2_m3",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u29_s3_p2_m1", "可能", "kěnéng", "mungkin"),
            MatchPairItem("u29_s3_p2_m2", "可能会", "kěnéng huì", "barangkali akan"),
            MatchPairItem("u29_s3_p2_m3", "不可能", "bù kěnéng", "tidak mungkin"),
            MatchPairItem("u29_s3_p2_m4", "明天下午", "míngtiān xiàwǔ", "besok sore")
        )
    )""",
            f"""    // 4. Soal 4: Ketik Pinyin (mungkin -> kěnéng)
    Exercise(
        id = "u29_s3_p2_q4",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "mungkin / barangkali",
        sentenceWithBlank = "可能 (________)",
        targetHanzi = "可能",
        targetPinyin = "kěnéng",
        correctAnswer = "keneng",
        keyboardKeys = {k3_p2_q4},
        audioToSpeak = "可能"
    )""",
            f"""    // 5. Soal 5: Mendengar Kalimat (Rule 10: illustrationRes = 0)
    Exercise(
        id = "u29_s3_p2_q5",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Apa yang Anda dengar?",
        targetTranslation = "Dia besok mungkin tidak bisa datang.",
        targetHanzi = "他 明天 可能 不 来。",
        targetPinyin = "Tā míngtiān kěnéng bù lái.",
        wordChips = listOf("他:tā", "明天:míngtiān", "可能:kěnéng", "不:bù", "来。:lái.", "去:qù"),
        correctAnswer = "他,明天,可能,不,来。",
        illustrationRes = 0,
        audioToSpeak = "他明天可能不来。"
    )""",
            f"""    // 6. Soal 6: Pilihan Kalimat
    Exercise(
        id = "u29_s3_p2_q6",
        type = ExerciseType.SENTENCE_CHOICE,
        title = "Pilih terjemahan yang benar",
        targetHanzi = "这 是 完全 可能 的。",
        targetPinyin = "Zhè shì wánquán kěnéng de.",
        targetTranslation = "Ini adalah hal yang sepenuhnya memungkinkan.",
        correctAnswer = "Zhè shì wánquán kěnéng de.\\n这 是 完全 可能 的。",
        options = listOf(
            "Zhè shì wánquán kěnéng de.\\n这 是 完全 可能 的。",
            "Zhè shì wánquán bù kěnéng de.\\n这 是 完全 不 可能 的。",
            "Nà shì wánquán kěnéng de.\\n那 是 完全 可能 的。"
        ),
        audioToSpeak = "这是完全可能的。"
    )""",
            f"""    // 7. Soal 7: Pilihan Gambar (可能 -> barangkali)
    Exercise(
        id = "u29_s3_p2_q7",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "可能",
        targetPinyin = "kěnéng",
        targetTranslation = "kemungkinan",
        correctAnswer = "kemungkinan",
        audioToSpeak = "可能",
        pictureOptions = listOf(
            PictureOption("u29_s3_p2_opt7_1", "mungkin", "", R.drawable.ic_log_question_why, true),
            PictureOption("u29_s3_p2_opt7_2", "kontras", "", R.drawable.ic_log_contrast_switch, false),
            PictureOption("u29_s3_p2_opt7_3", "sebab", "", R.drawable.ic_log_cause_effect, false),
            PictureOption("u29_s3_p2_opt7_4", "sopan", "", R.drawable.ic_etq_formal_bow, false)
        )
    )""",
            f"""    // 8. Soal 8: Ketik Pinyin (turun hujan -> xiàyǔ)
    Exercise(
        id = "u29_s3_p2_q8",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "turun hujan",
        sentenceWithBlank = "下雨 (________)",
        targetHanzi = "下雨",
        targetPinyin = "xiàyǔ",
        correctAnswer = "xiayu",
        keyboardKeys = {k3_p2_q8},
        audioToSpeak = "下雨"
    )""",
            f"""    // 9. Soal 9: Susun Kalimat (Hal itu sangat mungkin terjadi.)
    Exercise(
        id = "u29_s3_p2_q9",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Hal itu sangat mungkin.",
        targetHanzi = "那 是 很 可能 的。",
        targetPinyin = "Nà shì hěn kěnéng de.",
        wordChips = listOf("那:nà", "是:shì", "很:hěn", "可能:kěnéng", "的。:de.", "不:bù"),
        correctAnswer = "那,是,很,可能,的。",
        audioToSpeak = "那是很可能的。"
    )""",
            f"""    // 10. Soal 10: Ketuk Pasangan yang Sesuai (Rangkuman Modalitas Kemungkinan)
    Exercise(
        id = "u29_s3_p2_m10",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u29_s3_p2_m10_1", "可能", "kěnéng", "mungkin"),
            MatchPairItem("u29_s3_p2_m10_2", "可能会下雨", "kěnéng huì xiàyǔ", "mungkin hujan"),
            MatchPairItem("u29_s3_p2_m3", "有可能", "yǒu kěnéng", "ada peluang"),
            MatchPairItem("u29_s3_p2_m4", "明天见", "míngtiān jiàn", "sampai jumpa besok")
        )
    )"""
        ]
    }

    # =========================================================================
    # STAGE 4: Etiket Kesopanan, Memori & Makna (记得, 介绍, 意思, 不好意思)
    # =========================================================================
    k4_p1_q4 = make_keys("jide")
    k4_p1_q8 = make_keys("jieshao")
    k4_p2_q4 = make_keys("yisi")
    k4_p2_q8 = make_keys("buhaoyisi")
    
    stages[4] = {
        "p1": [
            f"""    // 1. Soal 1: Pilihan Gambar (介绍 -> memperkenalkan)
    Exercise(
        id = "u29_s4_p1_q1",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "介绍",
        targetPinyin = "jièshào",
        targetTranslation = "memperkenalkan",
        correctAnswer = "memperkenalkan",
        audioToSpeak = "介绍",
        pictureOptions = listOf(
            PictureOption("u29_s4_p1_opt1", "memperkenalkan", "", R.drawable.ic_etq_formal_bow, true),
            PictureOption("u29_s4_p1_opt2", "hadiah", "", R.drawable.ic_etq_gift_giving, false),
            PictureOption("u29_s4_p1_opt3", "masuk pintu", "", R.drawable.ic_etq_welcome_door, false),
            PictureOption("u29_s4_p1_opt4", "mengapa", "", R.drawable.ic_log_question_why, false)
        )
    )""",
            f"""    // 2. Soal 2: Susun Kalimat (Saya perkenalkan sebentar, ini adalah manajer Wang.)
    Exercise(
        id = "u29_s4_p1_q2",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Saya perkenalkan, ini Manajer Wang.",
        targetHanzi = "我 介绍 一下， 这 是 王 经理。",
        targetPinyin = "Wǒ jièshào yíxià, zhè shì Wáng jīnglǐ.",
        wordChips = listOf("我:wǒ", "介绍:jièshào", "一下，:yíxià,", "这:zhè", "是:shì", "王:Wáng", "经理。:jīnglǐ.", "老师:lǎoshī"),
        correctAnswer = "我,介绍,一下，,这,是,王,经理。",
        audioToSpeak = "我介绍一下，这是王经理。"
    )""",
            f"""    // 3. Soal 3: Ketuk Pasangan yang Sesuai (Ingat & Memperkenalkan)
    Exercise(
        id = "u29_s4_p1_q3",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u29_s4_p1_m1", "记得", "jìde", "ingat"),
            MatchPairItem("u29_s4_p1_m2", "介绍", "jièshào", "memperkenalkan"),
            MatchPairItem("u29_s4_p1_m3", "介绍一下", "jièshào yíxià", "perkenalkan dulu"),
            MatchPairItem("u29_s4_p1_m4", "还记得", "hái jìde", "masih ingat")
        )
    )""",
            f"""    // 4. Soal 4: Ketik Pinyin (ingat -> jìde)
    Exercise(
        id = "u29_s4_p1_q4",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "ingat",
        sentenceWithBlank = "记得 (________)",
        targetHanzi = "记得",
        targetPinyin = "jìde",
        correctAnswer = "jide",
        keyboardKeys = {k4_p1_q4},
        audioToSpeak = "记得"
    )""",
            f"""    // 5. Soal 5: Mendengar Kalimat (Rule 10: illustrationRes = 0)
    Exercise(
        id = "u29_s4_p1_q5",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Apa yang Anda dengar?",
        targetTranslation = "Apakah kamu masih ingat siapa nama lengkapnya?",
        targetHanzi = "你 还 记得 他 的 名字 吗？",
        targetPinyin = "Nǐ hái jìde tā de míngzi ma?",
        wordChips = listOf("你:nǐ", "还:hái", "记得:jìde", "他:tā", "的:de", "名字:míngzi", "吗？:ma?", "忘:wàng"),
        correctAnswer = "你,还,记得,他,的,名字,吗？",
        illustrationRes = 0,
        audioToSpeak = "你还记得他的名字吗？"
    )""",
            f"""    // 6. Soal 6: Pilihan Kalimat
    Exercise(
        id = "u29_s4_p1_q6",
        type = ExerciseType.SENTENCE_CHOICE,
        title = "Pilih terjemahan yang benar",
        targetHanzi = "请 介绍 一下 你 的 朋友。",
        targetPinyin = "Qǐng jièshào yíxià nǐ de péngyou.",
        targetTranslation = "Tolong perkenalkan sebentar temanmu itu.",
        correctAnswer = "Qǐng jièshào yíxià nǐ de péngyou.\\n请 介绍 一下 你 的 朋友。",
        options = listOf(
            "Qǐng jièshào yíxià nǐ de péngyou.\\n请 介绍 一下 你 的 朋友。",
            "Qǐng jièshào yíxià nǐ de jiā.\\n请 介绍 一下 你 的 家。",
            "Tā jièshào le tā de péngyou.\\n他 介绍 了 他 的 朋友。"
        ),
        audioToSpeak = "请介绍一下你的朋友。"
    )""",
            f"""    // 7. Soal 7: Pilihan Gambar (记得 -> mengingat kembali)
    Exercise(
        id = "u29_s4_p1_q7",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "记得",
        targetPinyin = "jìde",
        targetTranslation = "ingat",
        correctAnswer = "ingat",
        audioToSpeak = "记得",
        pictureOptions = listOf(
            PictureOption("u29_s4_p1_opt7_1", "ingat", "", R.drawable.ic_etq_formal_bow, true),
            PictureOption("u29_s4_p1_opt7_2", "hadiah", "", R.drawable.ic_etq_gift_giving, false),
            PictureOption("u29_s4_p1_opt7_3", "pintu", "", R.drawable.ic_etq_welcome_door, false),
            PictureOption("u29_s4_p1_opt7_4", "kenapa", "", R.drawable.ic_log_question_why, false)
        )
    )""",
            f"""    // 8. Soal 8: Ketik Pinyin (memperkenalkan -> jièshào)
    Exercise(
        id = "u29_s4_p1_q8",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "memperkenalkan",
        sentenceWithBlank = "介绍 (________)",
        targetHanzi = "介绍",
        targetPinyin = "jièshào",
        correctAnswer = "jieshao",
        keyboardKeys = {k4_p1_q8},
        audioToSpeak = "介绍"
    )""",
            f"""    // 9. Soal 9: Susun Kalimat (Saya ingat hal ini dengan sangat jelas.)
    Exercise(
        id = "u29_s4_p1_q9",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Saya ingat hal ini sangat jelas.",
        targetHanzi = "我 记得 很 清楚。",
        targetPinyin = "Wǒ jìde hěn qīngchu.",
        wordChips = listOf("我:wǒ", "记得:jìde", "很:hěn", "清楚。:qīngchu.", "忘:wàng"),
        correctAnswer = "我,记得,很,清楚。",
        audioToSpeak = "我记得很清楚。"
    )""",
            f"""    // 10. Soal 10: Ketuk Pasangan yang Sesuai (Rangkuman Perkenalan & Ingatan)
    Exercise(
        id = "u29_s4_p1_m10",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u29_s4_p1_m10_1", "记得", "jìde", "mengingat"),
            MatchPairItem("u29_s4_p1_m10_2", "介绍", "jièshào", "kenalkan"),
            MatchPairItem("u29_s4_p1_m3", "记得清楚", "jìde qīngchu", "ingat jelas"),
            MatchPairItem("u29_s4_p1_m4", "我来介绍", "wǒ lái jièshào", "biar kukenalkan")
        )
    )"""
        ],
        "p2": [
            f"""    // 1. Soal 1: Pilihan Gambar (不好意思 -> merasa tidak enak / sungkan / permisi)
    Exercise(
        id = "u29_s4_p2_q1",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "不好意思",
        targetPinyin = "bùhǎoyìsi",
        targetTranslation = "sungkan / permisi",
        correctAnswer = "sungkan / permisi",
        audioToSpeak = "不好意思",
        pictureOptions = listOf(
            PictureOption("u29_s4_p2_opt1", "sungkan", "", R.drawable.ic_etq_formal_bow, true),
            PictureOption("u29_s4_p2_opt2", "hadiah", "", R.drawable.ic_etq_gift_giving, false),
            PictureOption("u29_s4_p2_opt3", "masuk pintu", "", R.drawable.ic_etq_welcome_door, false),
            PictureOption("u29_s4_p2_opt4", "mengapa", "", R.drawable.ic_log_question_why, false)
        )
    )""",
            f"""    // 2. Soal 2: Susun Kalimat (Permisi, numpang tanya toilet ada di sebelah mana?)
    Exercise(
        id = "u29_s4_p2_q2",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Permisi, mengganggu Anda sebentar.",
        targetHanzi = "不好意思， 打扰 您 一下。",
        targetPinyin = "Bùhǎoyìsi, dǎrǎo nín yíxià.",
        wordChips = listOf("不好意思，:bùhǎoyìsi,", "打扰:dǎrǎo", "您:nín", "一下。:yíxià.", "对不起:duìbuqǐ"),
        correctAnswer = "不好意思，,打扰,您,一下。",
        audioToSpeak = "不好意思，打扰您一下。"
    )""",
            f"""    // 3. Soal 3: Ketuk Pasangan yang Sesuai (Makna & Rasa Sungkan)
    Exercise(
        id = "u29_s4_p2_m3",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u29_s4_p2_m1", "意思", "yìsi", "makna / arti"),
            MatchPairItem("u29_s4_p2_m2", "不好意思", "bùhǎoyìsi", "sungkan / permisi"),
            MatchPairItem("u29_s4_p2_m3", "什么意思", "shénme yìsi", "apa artinya"),
            MatchPairItem("u29_s4_p2_m4", "有意思", "yǒuyìsi", "menarik")
        )
    )""",
            f"""    // 4. Soal 4: Ketik Pinyin (makna/arti -> yìsi)
    Exercise(
        id = "u29_s4_p2_q4",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "makna / arti",
        sentenceWithBlank = "意思 (________)",
        targetHanzi = "意思",
        targetPinyin = "yìsi",
        correctAnswer = "yisi",
        keyboardKeys = {k4_p2_q4},
        audioToSpeak = "意思"
    )""",
            f"""    // 5. Soal 5: Mendengar Kalimat (Rule 10: illustrationRes = 0)
    Exercise(
        id = "u29_s4_p2_q5",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Apa yang Anda dengar?",
        targetTranslation = "Permisi numpang tanya apa arti karakter Hanzi ini?",
        targetHanzi = "这个 汉字 是 什么 意思？",
        targetPinyin = "Zhège Hànzì shì shénme yìsi?",
        wordChips = listOf("这个:zhège", "汉字:Hànzì", "是:shì", "什么:shénme", "意思？:yìsi.", "词:cí"),
        correctAnswer = "这个,汉字,是,什么,意思？",
        illustrationRes = 0,
        audioToSpeak = "这个汉字是什么意思？"
    )""",
            f"""    // 6. Soal 6: Pilihan Kalimat
    Exercise(
        id = "u29_s4_p2_q6",
        type = ExerciseType.SENTENCE_CHOICE,
        title = "Pilih terjemahan yang benar",
        targetHanzi = "真 不好意思， 让 您 久 等 了。",
        targetPinyin = "Zhēn bùhǎoyìsi, ràng nín jiǔ děng le.",
        targetTranslation = "Sungguh tidak enak hati, membuat Anda lama menunggu.",
        correctAnswer = "Zhēn bùhǎoyìsi, ràng nín jiǔ děng le.\\n真 不好意思， 让 您 久 等 了。",
        options = listOf(
            "Zhēn bùhǎoyìsi, ràng nín jiǔ děng le.\\n真 不好意思， 让 您 久 等 了。",
            "Zhēn gāoxìng, ràng nín jiǔ děng le.\\n真 高兴， 让 您 久 等 了。",
            "Bùhǎoyìsi, wǒ lái zǎo le.\\n不好意思， 我 来 早 了。"
        ),
        audioToSpeak = "真不好意思，让您久等了。"
    )""",
            f"""    // 7. Soal 7: Pilihan Gambar (意思 -> makna arti)
    Exercise(
        id = "u29_s4_p2_q7",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "意思",
        targetPinyin = "yìsi",
        targetTranslation = "makna",
        correctAnswer = "makna",
        audioToSpeak = "意思",
        pictureOptions = listOf(
            PictureOption("u29_s4_p2_opt7_1", "makna", "", R.drawable.ic_log_question_why, true),
            PictureOption("u29_s4_p2_opt7_2", "sopan", "", R.drawable.ic_etq_formal_bow, false),
            PictureOption("u29_s4_p2_opt7_3", "pintu", "", R.drawable.ic_etq_welcome_door, false),
            PictureOption("u29_s4_p2_opt7_4", "hadiah", "", R.drawable.ic_etq_gift_giving, false)
        )
    )""",
            f"""    // 8. Soal 8: Ketik Pinyin (sungkan/permisi -> bùhǎoyìsi)
    Exercise(
        id = "u29_s4_p2_q8",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "sungkan / permisi",
        sentenceWithBlank = "不好意思 (________)",
        targetHanzi = "不好意思",
        targetPinyin = "bùhǎoyìsi",
        correctAnswer = "buhaoyisi",
        keyboardKeys = {k4_p2_q8},
        audioToSpeak = "不好意思"
    )""",
            f"""    // 9. Soal 9: Susun Kalimat (Saya paham arti kalimat ini.)
    Exercise(
        id = "u29_s4_p2_q9",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Saya paham arti kalimat ini.",
        targetHanzi = "我 懂 这 句 话 的 意思。",
        targetPinyin = "Wǒ dǒng zhè jù huà de yìsi.",
        wordChips = listOf("我:wǒ", "懂:dǒng", "这:zhè", "句:jù", "话:huà", "的:de", "意思。:yìsi.", "字:zì"),
        correctAnswer = "我,懂,这,句,话,的,意思。",
        audioToSpeak = "我懂这句话的意思。"
    )""",
            f"""    // 10. Soal 10: Ketuk Pasangan yang Sesuai (Rangkuman Sopan Santun Etiket)
    Exercise(
        id = "u29_s4_p2_m10",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u29_s4_p2_m10_1", "不好意思", "bùhǎoyìsi", "merasa sungkan"),
            MatchPairItem("u29_s4_p2_m10_2", "打扰一下", "dǎrǎo yíxià", "mengganggu sebentar"),
            MatchPairItem("u29_s4_p2_m3", "什么意思", "shénme yìsi", "maknanya apa"),
            MatchPairItem("u29_s4_p2_m4", "久等了", "jiǔ děng le", "lama menunggu")
        )
    )"""
        ]
    }

    # =========================================================================
    # STAGE 5: Larangan Lembut & Partikel Seru (别, 啊, 跟, Evaluasi Bab 29)
    # =========================================================================
    k5_p1_q4 = make_keys("bie")
    k5_p1_q8 = make_keys("a")
    k5_p2_q4 = make_keys("gen")
    k5_p2_q8 = make_keys("biewang")
    
    stages[5] = {
        "p1": [
            f"""    // 1. Soal 1: Pilihan Gambar (别 -> jangan / larangan lembut)
    Exercise(
        id = "u29_s5_p1_q1",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "别",
        targetPinyin = "bié",
        targetTranslation = "jangan",
        correctAnswer = "jangan",
        audioToSpeak = "别",
        pictureOptions = listOf(
            PictureOption("u29_s5_p1_opt1", "jangan", "", R.drawable.ic_etq_welcome_door, true),
            PictureOption("u29_s5_p1_opt2", "sopan", "", R.drawable.ic_etq_formal_bow, false),
            PictureOption("u29_s5_p1_opt3", "hadiah", "", R.drawable.ic_etq_gift_giving, false),
            PictureOption("u29_s5_p1_opt4", "kenapa", "", R.drawable.ic_log_question_why, false)
        )
    )""",
            f"""    // 2. Soal 2: Susun Kalimat (Hari sudah dingin, keluar rumah jangan lupa banyak memakai pakaian.)
    Exercise(
        id = "u29_s5_p1_q2",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Keluar rumah jangan lupa pakai baju.",
        targetHanzi = "出门 别 忘 穿 衣服。",
        targetPinyin = "Chūmén bié wàng chuān yīfu.",
        wordChips = listOf("出门:chūmén", "别:bié", "忘:wàng", "穿:chuān", "衣服。:yīfu.", "带:dài"),
        correctAnswer = "出门,别,忘,穿,衣服。",
        audioToSpeak = "出门别忘穿衣服。"
    )""",
            f"""    // 3. Soal 3: Ketuk Pasangan yang Sesuai (Jangan & Seruan)
    Exercise(
        id = "u29_s5_p1_m3",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u29_s5_p1_m1", "别", "bié", "jangan"),
            MatchPairItem("u29_s5_p1_m2", "啊", "a", "partikel seru (ah/oh)"),
            MatchPairItem("u29_s5_p1_m3", "别说话", "bié shuōhuà", "jangan bicara"),
            MatchPairItem("u29_s5_p1_m4", "真美啊", "zhēn měi a", "sungguh indah")
        )
    )""",
            f"""    // 4. Soal 4: Ketik Pinyin (jangan -> bié)
    Exercise(
        id = "u29_s5_p1_q4",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "jangan",
        sentenceWithBlank = "别 (________)",
        targetHanzi = "别",
        targetPinyin = "bié",
        correctAnswer = "bie",
        keyboardKeys = {k5_p1_q4},
        audioToSpeak = "别"
    )""",
            f"""    // 5. Soal 5: Mendengar Kalimat (Rule 10: illustrationRes = 0)
    Exercise(
        id = "u29_s5_p1_q5",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Apa yang Anda dengar?",
        targetTranslation = "Pemandangan di sini sungguh sangat indah ya!",
        targetHanzi = "这里 的 风景 真 美丽 啊！",
        targetPinyin = "Zhèlǐ de fēngjǐng zhēn měilì a!",
        wordChips = listOf("这里:zhèlǐ", "的:de", "风景:fēngjǐng", "真:zhēn", "美丽:měilì", "啊！:a!", "漂亮:piàoliang"),
        correctAnswer = "这里,的,风景,真,美丽,啊！",
        illustrationRes = 0,
        audioToSpeak = "这里的风景真美丽啊！"
    )""",
            f"""    // 6. Soal 6: Pilihan Kalimat
    Exercise(
        id = "u29_s5_p1_q6",
        type = ExerciseType.SENTENCE_CHOICE,
        title = "Pilih terjemahan yang benar",
        targetHanzi = "在 图书馆 里 别 大声 说话。",
        targetPinyin = "Zài túshūguǎn lǐ bié dàshēng shuōhuà.",
        targetTranslation = "Di dalam perpustakaan jangan berbicara dengan suara keras.",
        correctAnswer = "Zài túshūguǎn lǐ bié dàshēng shuōhuà.\\n在 图书馆 里 别 大声 说话。",
        options = listOf(
            "Zài túshūguǎn lǐ bié dàshēng shuōhuà.\\n在 图书馆 里 别 大声 说话。",
            "Zài túshūguǎn lǐ kěyǐ dàshēng shuōhuà.\\n在 图书馆 里 可以 大声 说话。",
            "Zài jiàoshì lǐ bié shuōhuà.\\n在 教室 里 别 说话。"
        ),
        audioToSpeak = "在图书馆里别大声说话。"
    )""",
            f"""    // 7. Soal 7: Pilihan Gambar (啊 -> seruan kagum)
    Exercise(
        id = "u29_s5_p1_q7",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "啊",
        targetPinyin = "a",
        targetTranslation = "partikel seru",
        correctAnswer = "partikel seru",
        audioToSpeak = "啊",
        pictureOptions = listOf(
            PictureOption("u29_s5_p1_opt7_1", "partikel kagum", "", R.drawable.ic_etq_gift_giving, true),
            PictureOption("u29_s5_p1_opt7_2", "jangan", "", R.drawable.ic_etq_welcome_door, false),
            PictureOption("u29_s5_p1_opt7_3", "sopan", "", R.drawable.ic_etq_formal_bow, false),
            PictureOption("u29_s5_p1_opt7_4", "kenapa", "", R.drawable.ic_log_question_why, false)
        )
    )""",
            f"""    // 8. Soal 8: Ketik Pinyin (partikel seru -> a)
    Exercise(
        id = "u29_s5_p1_q8",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "partikel seru",
        sentenceWithBlank = "啊 (________)",
        targetHanzi = "啊",
        targetPinyin = "a",
        correctAnswer = "a",
        keyboardKeys = {k5_p1_q8},
        audioToSpeak = "啊"
    )""",
            f"""    // 9. Soal 9: Susun Kalimat (Hari ini menyenangkan sekali ya!)
    Exercise(
        id = "u29_s5_p1_q9",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Hari ini sungguh senang ya!",
        targetHanzi = "今天 真 高兴 啊！",
        targetPinyin = "Jīntiān zhēn gāoxìng a!",
        wordChips = listOf("今天:jīntiān", "真:zhēn", "高兴:gāoxìng", "啊！:a!", "累:lèi"),
        correctAnswer = "今天,真,高兴,啊！",
        audioToSpeak = "今天真高兴啊！"
    )""",
            f"""    // 10. Soal 10: Ketuk Pasangan yang Sesuai (Rangkuman Seruan Emosi)
    Exercise(
        id = "u29_s5_p1_m10",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u29_s5_p1_m10_1", "别担心", "bié dānxīn", "jangan cemas"),
            MatchPairItem("u29_s5_p1_m10_2", "好啊", "hǎo a", "baiklah"),
            MatchPairItem("u29_s5_p1_m3", "别走", "bié zǒu", "jangan pergi"),
            MatchPairItem("u29_s5_p1_m4", "真热啊", "zhēn rè a", "sungguh panas")
        )
    )"""
        ],
        "p2": [
            f"""    // 1. Soal 1: Pilihan Gambar (跟 -> dengan / bersama)
    Exercise(
        id = "u29_s5_p2_q1",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "跟",
        targetPinyin = "gēn",
        targetTranslation = "dengan / bersama",
        correctAnswer = "dengan / bersama",
        audioToSpeak = "跟",
        pictureOptions = listOf(
            PictureOption("u29_s5_p2_opt1", "bersama", "", R.drawable.ic_etq_gift_giving, true),
            PictureOption("u29_s5_p2_opt2", "jangan", "", R.drawable.ic_etq_welcome_door, false),
            PictureOption("u29_s5_p2_opt3", "sopan", "", R.drawable.ic_etq_formal_bow, false),
            PictureOption("u29_s5_p2_opt4", "kenapa", "", R.drawable.ic_log_question_why, false)
        )
    )""",
            f"""    // 2. Soal 2: Susun Kalimat (Saya ingin pergi ke supermarket bersama denganmu.)
    Exercise(
        id = "u29_s5_p2_q2",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Saya mau pergi ke supermarket bersamamu.",
        targetHanzi = "我 想 跟 你 一起 去 超市。",
        targetPinyin = "Wǒ xiǎng gēn nǐ yìqǐ qù chāoshì.",
        wordChips = listOf("我:wǒ", "想:xiǎng", "跟:gēn", "你:nǐ", "一起:yìqǐ", "去:qù", "超市。:chāoshì.", "学校:xuéxiào"),
        correctAnswer = "我,想,跟,你,一起,去,超市。",
        audioToSpeak = "我想跟你一起去超市。"
    )""",
            f"""    // 3. Soal 3: Ketuk Pasangan yang Sesuai (Grand Sintesis Bab 29)
    Exercise(
        id = "u29_s5_p2_m3",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u29_s5_p2_m1", "跟", "gēn", "bersama / dengan"),
            MatchPairItem("u29_s5_p2_m2", "虽然但是", "suīrán dànshì", "walaupun namun"),
            MatchPairItem("u29_s5_p2_m3", "因为所以", "yīnwèi suǒyǐ", "karena maka"),
            MatchPairItem("u29_s5_p2_m4", "别客气", "bié kèqi", "jangan sungkan")
        )
    )""",
            f"""    // 4. Soal 4: Ketik Pinyin (bersama/dengan -> gēn)
    Exercise(
        id = "u29_s5_p2_q4",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "dengan / bersama",
        sentenceWithBlank = "跟 (________)",
        targetHanzi = "跟",
        targetPinyin = "gēn",
        correctAnswer = "gen",
        keyboardKeys = {k5_p2_q4},
        audioToSpeak = "跟"
    )""",
            f"""    // 5. Soal 5: Mendengar Kalimat (Rule 10: illustrationRes = 0)
    Exercise(
        id = "u29_s5_p2_q5",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Apa yang Anda dengar?",
        targetTranslation = "Dia berbicara bahasa Mandarin bersama guru.",
        targetHanzi = "他 跟 老师 说 汉语。",
        targetPinyin = "Tā gēn lǎoshī shuō Hànyǔ.",
        wordChips = listOf("他:tā", "跟:gēn", "老师:lǎoshī", "说:shuō", "汉语。:Hànyǔ.", "英语:Yīngyǔ"),
        correctAnswer = "他,跟,老师,说,汉语。",
        illustrationRes = 0,
        audioToSpeak = "他跟老师说汉语。"
    )""",
            f"""    // 6. Soal 6: Pilihan Kalimat
    Exercise(
        id = "u29_s5_p2_q6",
        type = ExerciseType.SENTENCE_CHOICE,
        title = "Pilih terjemahan yang benar",
        targetHanzi = "你 跟 他 一起 去 吧。",
        targetPinyin = "Nǐ gēn tā yìqǐ qù ba.",
        targetTranslation = "Kamu pergilah bersama-sama dengannya.",
        correctAnswer = "Nǐ gēn tā yìqǐ qù ba.\\n你 跟 他 一起 去 吧。",
        options = listOf(
            "Nǐ gēn tā yìqǐ qù ba.\\n你 跟 他 一起 去 吧。",
            "Nǐ bú yào gēn tā qù.\\n你 不 要 跟 他 去。",
            "Tā gēn wǒ yìqǐ qù ba.\\n他 跟 我 一起 去 吧。"
        ),
        audioToSpeak = "你跟他一起去吧。"
    )""",
            f"""    // 7. Soal 7: Pilihan Gambar (别忘 -> jangan lupa)
    Exercise(
        id = "u29_s5_p2_q7",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "别忘",
        targetPinyin = "bié wàng",
        targetTranslation = "jangan lupa",
        correctAnswer = "jangan lupa",
        audioToSpeak = "别忘",
        pictureOptions = listOf(
            PictureOption("u29_s5_p2_opt7_1", "jangan lupa", "", R.drawable.ic_etq_welcome_door, true),
            PictureOption("u29_s5_p2_opt7_2", "hadiah", "", R.drawable.ic_etq_gift_giving, false),
            PictureOption("u29_s5_p2_opt7_3", "sopan", "", R.drawable.ic_etq_formal_bow, false),
            PictureOption("u29_s5_p2_opt7_4", "kenapa", "", R.drawable.ic_log_question_why, false)
        )
    )""",
            f"""    // 8. Soal 8: Ketik Pinyin (jangan lupa -> biéwàng)
    Exercise(
        id = "u29_s5_p2_q8",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "jangan lupa",
        sentenceWithBlank = "别忘 (________)",
        targetHanzi = "别忘",
        targetPinyin = "biéwàng",
        correctAnswer = "biewang",
        keyboardKeys = {k5_p2_q8},
        audioToSpeak = "别忘"
    )""",
            f"""    // 9. Soal 9: Susun Kalimat (Ayo kita belajar bersama guru.)
    Exercise(
        id = "u29_s5_p2_q9",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Ayo kita belajar bersama guru.",
        targetHanzi = "我们 跟 老师 学习 吧。",
        targetPinyin = "Wǒmen gēn lǎoshī xuéxí ba.",
        wordChips = listOf("我们:wǒmen", "跟:gēn", "老师:lǎoshī", "学习:xuéxí", "吧。:ba.", "走:zǒu"),
        correctAnswer = "我们,跟,老师,学习,吧。",
        audioToSpeak = "我们跟老师学习吧。"
    )""",
            f"""    // 10. Soal 10: Ketuk Pasangan yang Sesuai (Grand Review Final Bab 29)
    Exercise(
        id = "u29_s5_p2_m10",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u29_s5_p2_m10_1", "跟他学", "gēn tā xué", "belajar dengannya"),
            MatchPairItem("u29_s5_p2_m10_2", "一起走", "yìqǐ zǒu", "jalan bareng"),
            MatchPairItem("u29_s5_p2_m3", "别说话", "bié shuōhuà", "jangan bersuara"),
            MatchPairItem("u29_s5_p2_m4", "真好啊", "zhēn hǎo a", "sungguh elok")
        )
    )"""
        ]
    }

    for s_idx in range(1, 6):
        filename = f"{base_dir}/Bab29Stage{s_idx}Data.kt"
        p1_code = ",\n\n".join(stages[s_idx]["p1"])
        p2_code = ",\n\n".join(stages[s_idx]["p2"])
        
        content = f"""package com.example.chineselearning.data.repository

import com.example.chineselearning.R
import com.example.chineselearning.data.model.Exercise
import com.example.chineselearning.data.model.ExerciseType
import com.example.chineselearning.data.model.MatchPairItem
import com.example.chineselearning.data.model.PictureOption

val bab29Stage{s_idx}Part1Exercises = listOf(
{p1_code}
)

val bab29Stage{s_idx}Part2Exercises = listOf(
{p2_code}
)
"""
        with open(filename, "w", encoding="utf-8") as f:
            f.write(content)
        print(f"Written {filename}")

if __name__ == "__main__":
    generate_bab29()
