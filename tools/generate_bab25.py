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

def generate_bab25():
    base_dir = "app/src/main/java/com/example/chineselearning/data/repository"
    
    stages = {}
    
    # =========================================================================
    # STAGE 1: Kebugaran Umum & Lari Pagi (运动, 跑, 跑步)
    # =========================================================================
    k1_p1_q4 = make_keys("yundong")
    k1_p1_q8 = make_keys("pao")
    k1_p2_q4 = make_keys("paobu")
    k1_p2_q8 = make_keys("gongyuan")
    
    stages[1] = {
        "p1": [
            f"""    // 1. Soal 1: Pilihan Gambar (运动 -> olahraga / berolahraga)
    Exercise(
        id = "u25_s1_p1_q1",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "运动",
        targetPinyin = "yùndòng",
        targetTranslation = "berolahraga / olahraga",
        correctAnswer = "berolahraga / olahraga",
        audioToSpeak = "运动",
        pictureOptions = listOf(
            PictureOption("u25_s1_p1_opt1", "olahraga", "", R.drawable.ic_sport_fitness, true),
            PictureOption("u25_s1_p1_opt2", "lari", "", R.drawable.ic_sport_running, false),
            PictureOption("u25_s1_p1_opt3", "sepak bola", "", R.drawable.ic_sport_soccer, false),
            PictureOption("u25_s1_p1_opt4", "renang", "", R.drawable.ic_sport_swim, false)
        )
    )""",
            f"""    // 2. Soal 2: Susun Kalimat (Banyak berolahraga memiliki banyak manfaat bagi tubuh.)
    Exercise(
        id = "u25_s1_p1_q2",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Banyak olahraga baik untuk tubuh.",
        targetHanzi = "多 运动 对 身体 好。",
        targetPinyin = "Duō yùndòng duì shēntǐ hǎo.",
        wordChips = listOf("多:duō", "运动:yùndòng", "对:duì", "身体:shēntǐ", "好。:hǎo.", "少:shǎo"),
        correctAnswer = "多,运动,对,身体,好。",
        audioToSpeak = "多运动对身体好。"
    )""",
            f"""    // 3. Soal 3: Ketuk Pasangan yang Sesuai (Olahraga & Lari)
    Exercise(
        id = "u25_s1_p1_q3",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u25_s1_p1_m1", "运动", "yùndòng", "olahraga"),
            MatchPairItem("u25_s1_p1_m2", "跑", "pǎo", "berlari"),
            MatchPairItem("u25_s1_p1_m3", "身体好", "shēntǐ hǎo", "tubuh sehat"),
            MatchPairItem("u25_s1_p1_m4", "飞快跑", "fēikuài pǎo", "lari kencang")
        )
    )""",
            f"""    // 4. Soal 4: Ketik Pinyin (olahraga -> yùndòng)
    Exercise(
        id = "u25_s1_p1_q4",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "berolahraga / olahraga",
        sentenceWithBlank = "运动 (________)",
        targetHanzi = "运动",
        targetPinyin = "yùndòng",
        correctAnswer = "yundong",
        keyboardKeys = {k1_p1_q4},
        audioToSpeak = "运动"
    )""",
            f"""    // 5. Soal 5: Mendengar Kalimat (Rule 10: illustrationRes = 0)
    Exercise(
        id = "u25_s1_p1_q5",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Apa yang Anda dengar?",
        targetTranslation = "Anjing kecil berlari sangat kencang di atas rumput.",
        targetHanzi = "小狗 飞快 地 跑。",
        targetPinyin = "Xiǎogǒu fēikuài de pǎo.",
        wordChips = listOf("小狗:xiǎogǒu", "飞快:fēikuài", "地:de", "跑。:pǎo.", "走:zǒu"),
        correctAnswer = "小狗,飞快,地,跑。",
        illustrationRes = 0,
        audioToSpeak = "小狗飞快地跑。"
    )""",
            f"""    // 6. Soal 6: Pilihan Kalimat
    Exercise(
        id = "u25_s1_p1_q6",
        type = ExerciseType.SENTENCE_CHOICE,
        title = "Pilih terjemahan yang benar",
        targetHanzi = "你 喜欢 什么 运动？",
        targetPinyin = "Nǐ xǐhuan shénme yùndòng?",
        targetTranslation = "Kamu suka olahraga apa?",
        correctAnswer = "Nǐ xǐhuan shénme yùndòng?\\n你 喜欢 什么 运动？",
        options = listOf(
            "Nǐ xǐhuan shénme yùndòng?\\n你 喜欢 什么 运动？",
            "Nǐ xǐhuan shénme yánsè?\\n你 喜欢 什么 颜色？",
            "Tā xǐhuan shénme yùndòng?\\n他 喜欢 什么 运动？"
        ),
        audioToSpeak = "你喜欢什么运动？"
    )""",
            f"""    // 7. Soal 7: Pilihan Gambar (跑 -> berlari)
    Exercise(
        id = "u25_s1_p1_q7",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "跑",
        targetPinyin = "pǎo",
        targetTranslation = "berlari",
        correctAnswer = "berlari",
        audioToSpeak = "跑",
        pictureOptions = listOf(
            PictureOption("u25_s1_p1_opt7_1", "lari", "", R.drawable.ic_sport_running, true),
            PictureOption("u25_s1_p1_opt7_2", "fitness", "", R.drawable.ic_sport_fitness, false),
            PictureOption("u25_s1_p1_opt7_3", "sepak bola", "", R.drawable.ic_sport_soccer, false),
            PictureOption("u25_s1_p1_opt7_4", "renang", "", R.drawable.ic_sport_swim, false)
        )
    )""",
            f"""    // 8. Soal 8: Ketik Pinyin (berlari -> pǎo)
    Exercise(
        id = "u25_s1_p1_q8",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "lari / berlari",
        sentenceWithBlank = "跑 (________)",
        targetHanzi = "跑",
        targetPinyin = "pǎo",
        correctAnswer = "pao",
        keyboardKeys = {k1_p1_q8},
        audioToSpeak = "跑"
    )""",
            f"""    // 9. Soal 9: Susun Kalimat (Dia berlari sangat cepat.)
    Exercise(
        id = "u25_s1_p1_q9",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Dia berlari sangat cepat.",
        targetHanzi = "他 跑 得 很 快。",
        targetPinyin = "Tā pǎo de hěn kuài.",
        wordChips = listOf("他:tā", "跑:pǎo", "得:de", "很:hěn", "快。:kuài.", "慢:màn"),
        correctAnswer = "他,跑,得,很,快。",
        audioToSpeak = "他跑得很快。"
    )""",
            f"""    // 10. Soal 10: Ketuk Pasangan yang Sesuai (Rangkuman Lari & Olahraga)
    Exercise(
        id = "u25_s1_p1_m10",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u25_s1_p1_m10_1", "运动", "yùndòng", "olahraga"),
            MatchPairItem("u25_s1_p1_m10_2", "跑得快", "pǎo de kuài", "lari kencang"),
            MatchPairItem("u25_s1_p1_m10_3", "做运动", "zuò yùndòng", "berolahraga"),
            MatchPairItem("u25_s1_p1_m10_4", "跑步", "pǎobù", "jogging")
        )
    )"""
        ],
        "p2": [
            f"""    // 1. Soal 1: Pilihan Gambar (跑步 -> jogging / lari santai)
    Exercise(
        id = "u25_s1_p2_q1",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "跑步",
        targetPinyin = "pǎobù",
        targetTranslation = "berlari santai / jogging",
        correctAnswer = "berlari santai / jogging",
        audioToSpeak = "跑步",
        pictureOptions = listOf(
            PictureOption("u25_s1_p2_opt1", "jogging", "", R.drawable.ic_sport_running, true),
            PictureOption("u25_s1_p2_opt2", "basket", "", R.drawable.ic_sport_basketball, false),
            PictureOption("u25_s1_p2_opt3", "renang", "", R.drawable.ic_sport_swim, false),
            PictureOption("u25_s1_p2_opt4", "sepak bola", "", R.drawable.ic_sport_soccer, false)
        )
    )""",
            f"""    // 2. Soal 2: Susun Kalimat (Setiap pagi saya pergi ke taman untuk jogging.)
    Exercise(
        id = "u25_s1_p2_q2",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Tiap pagi saya ke taman jogging.",
        targetHanzi = "早晨 我 去 公园 跑步。",
        targetPinyin = "Zǎochén wǒ qù gōngyuán pǎobù.",
        wordChips = listOf("早晨:zǎochén", "我:wǒ", "去:qù", "公园:gōngyuán", "跑步。:pǎobù.", "睡觉:shuìjiào"),
        correctAnswer = "早晨,我,去,公园,跑步。",
        audioToSpeak = "早晨我去公园跑步。"
    )""",
            f"""    // 3. Soal 3: Ketuk Pasangan yang Sesuai (Jogging Pagi)
    Exercise(
        id = "u25_s1_p2_m3",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u25_s1_p2_m1", "跑步", "pǎobù", "jogging"),
            MatchPairItem("u25_s1_p2_m2", "早晨", "zǎochén", "pagi hari"),
            MatchPairItem("u25_s1_p2_m3", "公园", "gōngyuán", "taman"),
            MatchPairItem("u25_s1_p2_m4", "每天跑", "měitiān pǎo", "lari tiap hari")
        )
    )""",
            f"""    // 4. Soal 4: Ketik Pinyin (jogging -> pǎobù)
    Exercise(
        id = "u25_s1_p2_q4",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "berlari santai / jogging",
        sentenceWithBlank = "跑步 (________)",
        targetHanzi = "跑步",
        targetPinyin = "pǎobù",
        correctAnswer = "paobu",
        keyboardKeys = {k1_p2_q4},
        audioToSpeak = "跑步"
    )""",
            f"""    // 5. Soal 5: Mendengar Kalimat (Rule 10: illustrationRes = 0)
    Exercise(
        id = "u25_s1_p2_q5",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Apa yang Anda dengar?",
        targetTranslation = "Saya suka jogging bersama teman.",
        targetHanzi = "我 喜欢 和 朋友 跑步。",
        targetPinyin = "Wǒ xǐhuan hé péngyou pǎobù.",
        wordChips = listOf("我:wǒ", "喜欢:xǐhuan", "和:hé", "朋友:péngyou", "跑步。:pǎobù.", "游泳:yóuyǒng"),
        correctAnswer = "我,喜欢,和,朋友,跑步。",
        illustrationRes = 0,
        audioToSpeak = "我喜欢和朋友跑步。"
    )""",
            f"""    // 6. Soal 6: Pilihan Kalimat
    Exercise(
        id = "u25_s1_p2_q6",
        type = ExerciseType.SENTENCE_CHOICE,
        title = "Pilih terjemahan yang benar",
        targetHanzi = "跑步 能 让 身体 更 健康。",
        targetPinyin = "Pǎobù néng ràng shēntǐ gèng jiànkāng.",
        targetTranslation = "Jogging dapat membuat tubuh lebih sehat.",
        correctAnswer = "Pǎobù néng ràng shēntǐ gèng jiànkāng.\\n跑步 能 让 身体 更 健康。",
        options = listOf(
            "Pǎobù néng ràng shēntǐ gèng jiànkāng.\\n跑步 能 让 身体 更 健康。",
            "Pǎobù néng ràng shēntǐ gèng lèi.\\n跑步 能 让 身体 更 累。",
            "Shuìjiào néng ràng shēntǐ gèng jiànkāng.\\n睡觉 能 让 身体 更 健康。"
        ),
        audioToSpeak = "跑步能让身体更健康。"
    )""",
            f"""    // 7. Soal 7: Pilihan Gambar (跑步 -> olahraga lari)
    Exercise(
        id = "u25_s1_p2_q7",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "跑步",
        targetPinyin = "pǎobù",
        targetTranslation = "lari santai",
        correctAnswer = "lari santai",
        audioToSpeak = "跑步",
        pictureOptions = listOf(
            PictureOption("u25_s1_p2_opt7_1", "jogging", "", R.drawable.ic_sport_running, true),
            PictureOption("u25_s1_p2_opt7_2", "sepak bola", "", R.drawable.ic_sport_soccer, false),
            PictureOption("u25_s1_p2_opt7_3", "basket", "", R.drawable.ic_sport_basketball, false),
            PictureOption("u25_s1_p2_opt7_4", "renang", "", R.drawable.ic_sport_swim, false)
        )
    )""",
            f"""    // 8. Soal 8: Ketik Pinyin (taman -> gōngyuán)
    Exercise(
        id = "u25_s1_p2_q8",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "taman",
        sentenceWithBlank = "公园 (________)",
        targetHanzi = "公园",
        targetPinyin = "gōngyuán",
        correctAnswer = "gongyuan",
        keyboardKeys = {k1_p2_q8},
        audioToSpeak = "公园"
    )""",
            f"""    // 9. Soal 9: Susun Kalimat (Kami berlari selama tiga puluh menit.)
    Exercise(
        id = "u25_s1_p2_q9",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Kami lari selama 30 menit.",
        targetHanzi = "我们 跑 了 三十 分钟。",
        targetPinyin = "Wǒmen pǎo le sānshí fēnzhōng.",
        wordChips = listOf("我们:wǒmen", "跑:pǎo", "了:le", "三十:sānshí", "分钟。:fēnzhōng.", "小时:xiǎoshí"),
        correctAnswer = "我们,跑,了,三十,分钟。",
        audioToSpeak = "我们跑了三十分钟。"
    )""",
            f"""    // 10. Soal 10: Ketuk Pasangan yang Sesuai (Rangkuman Rutinitas Jogging)
    Exercise(
        id = "u25_s1_p2_m10",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u25_s1_p2_m10_1", "跑步", "pǎobù", "jogging"),
            MatchPairItem("u25_s1_p2_m2", "三十分钟", "sānshí fēnzhōng", "30 menit"),
            MatchPairItem("u25_s1_p2_m3", "更健康", "gèng jiànkāng", "lebih sehat"),
            MatchPairItem("u25_s1_p2_m4", "好习惯", "hǎo xíguàn", "kebiasaan baik")
        )
    )"""
        ]
    }

    # =========================================================================
    # STAGE 2: Permainan Sepak Bola & Bola Basket (踢, 足球, 篮球, 球, 打)
    # =========================================================================
    k2_p1_q4 = make_keys("ti")
    k2_p1_q8 = make_keys("zuqiu")
    k2_p2_q4 = make_keys("lanqiu")
    k2_p2_q8 = make_keys("da")
    
    stages[2] = {
        "p1": [
            f"""    // 1. Soal 1: Pilihan Gambar (足球 -> sepak bola)
    Exercise(
        id = "u25_s2_p1_q1",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "足球",
        targetPinyin = "zúqiú",
        targetTranslation = "sepak bola",
        correctAnswer = "sepak bola",
        audioToSpeak = "足球",
        pictureOptions = listOf(
            PictureOption("u25_s2_p1_opt1", "sepak bola", "", R.drawable.ic_sport_soccer, true),
            PictureOption("u25_s2_p1_opt2", "basket", "", R.drawable.ic_sport_basketball, false),
            PictureOption("u25_s2_p1_opt3", "menendang bola", "", R.drawable.ic_sport_kick_ball, false),
            PictureOption("u25_s2_p1_opt4", "renang", "", R.drawable.ic_sport_swim, false)
        )
    )""",
            f"""    // 2. Soal 2: Susun Kalimat (Anak-anak laki-laki bermain sepak bola di lapangan.)
    Exercise(
        id = "u25_s2_p1_q2",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Anak-anak bermain bola di lapangan.",
        targetHanzi = "男孩子们 在 操场 踢球。",
        targetPinyin = "Nánháizimen zài cāochǎng tīqiú.",
        wordChips = listOf("男孩子们:nánháizimen", "在:zài", "操场:cāochǎng", "踢球。:tīqiú.", "教室:jiàoshì"),
        correctAnswer = "男孩子们,在,操场,踢球。",
        audioToSpeak = "男孩子们在操场踢球。"
    )""",
            f"""    // 3. Soal 3: Ketuk Pasangan yang Sesuai (Menendang & Sepak Bola)
    Exercise(
        id = "u25_s2_p1_q3",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u25_s2_p1_m1", "踢", "tī", "menendang"),
            MatchPairItem("u25_s2_p1_m2", "足球", "zúqiú", "sepak bola"),
            MatchPairItem("u25_s2_p1_m3", "踢足球", "tī zúqiú", "main sepak bola"),
            MatchPairItem("u25_s2_p1_m4", "操场", "cāochǎng", "lapangan")
        )
    )""",
            f"""    // 4. Soal 4: Ketik Pinyin (menendang -> tī)
    Exercise(
        id = "u25_s2_p1_q4",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "menendang",
        sentenceWithBlank = "踢 (________)",
        targetHanzi = "踢",
        targetPinyin = "tī",
        correctAnswer = "ti",
        keyboardKeys = {k2_p1_q4},
        audioToSpeak = "踢"
    )""",
            f"""    // 5. Soal 5: Mendengar Kalimat (Rule 10: illustrationRes = 0)
    Exercise(
        id = "u25_s2_p1_q5",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Apa yang Anda dengar?",
        targetTranslation = "Saya suka menonton pertandingan sepak bola.",
        targetHanzi = "我 喜欢 看 足球 比赛。",
        targetPinyin = "Wǒ xǐhuan kàn zúqiú bǐsài.",
        wordChips = listOf("我:wǒ", "喜欢:xǐhuan", "看:kàn", "足球:zúqiú", "比赛。:bǐsài.", "电影:diànyǐng"),
        correctAnswer = "我,喜欢,看,足球,比赛。",
        illustrationRes = 0,
        audioToSpeak = "我喜欢看足球比赛。"
    )""",
            f"""    // 6. Soal 6: Pilihan Kalimat
    Exercise(
        id = "u25_s2_p1_q6",
        type = ExerciseType.SENTENCE_CHOICE,
        title = "Pilih terjemahan yang benar",
        targetHanzi = "下午 我们 一起 去 踢 足球 吧。",
        targetPinyin = "Xiàwǔ wǒmen yìqǐ qù tī zúqiú ba.",
        targetTranslation = "Sore hari ayo kita main sepak bola bersama-sama.",
        correctAnswer = "Xiàwǔ wǒmen yìqǐ qù tī zúqiú ba.\\n下午 我们 一起 去 踢 足球 吧。",
        options = listOf(
            "Xiàwǔ wǒmen yìqǐ qù tī zúqiú ba.\\n下午 我们 一起 去 踢 足球 吧。",
            "Xiàwǔ wǒmen yìqǐ qù dǎ lánqiú ba.\\n下午 我们 一起 去 打 篮球 吧。",
            "Shàngwǔ wǒmen yìqǐ qù tī zúqiú ba.\\n上午 我们 一起 去 踢 足球 吧。"
        ),
        audioToSpeak = "下午我们一起去踢足球吧。"
    )""",
            f"""    // 7. Soal 7: Pilihan Gambar (踢 -> menendang bola)
    Exercise(
        id = "u25_s2_p1_q7",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "踢",
        targetPinyin = "tī",
        targetTranslation = "menendang",
        correctAnswer = "menendang",
        audioToSpeak = "踢",
        pictureOptions = listOf(
            PictureOption("u25_s2_p1_opt7_1", "menendang bola", "", R.drawable.ic_sport_kick_ball, true),
            PictureOption("u25_s2_p1_opt7_2", "sepak bola", "", R.drawable.ic_sport_soccer, false),
            PictureOption("u25_s2_p1_opt7_3", "basket", "", R.drawable.ic_sport_basketball, false),
            PictureOption("u25_s2_p1_opt7_4", "renang", "", R.drawable.ic_sport_swim, false)
        )
    )""",
            f"""    // 8. Soal 8: Ketik Pinyin (sepak bola -> zúqiú)
    Exercise(
        id = "u25_s2_p1_q8",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "sepak bola",
        sentenceWithBlank = "足球 (________)",
        targetHanzi = "足球",
        targetPinyin = "zúqiú",
        correctAnswer = "zuqiu",
        keyboardKeys = {k2_p1_q8},
        audioToSpeak = "足球"
    )""",
            f"""    // 9. Soal 9: Susun Kalimat (Dia menendang bola ke dalam gawang.)
    Exercise(
        id = "u25_s2_p1_q9",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Dia menendang bola masuk.",
        targetHanzi = "他 把 球 踢 进去 了。",
        targetPinyin = "Tā bǎ qiú tī jìnqù le.",
        wordChips = listOf("他:tā", "把:bǎ", "球:qiú", "踢:tī", "进去:jìnqù", "了。:le.", "出来:chūlái"),
        correctAnswer = "他,把,球,踢,进去,了。",
        audioToSpeak = "他把球踢进去了。"
    )""",
            f"""    // 10. Soal 10: Ketuk Pasangan yang Sesuai (Rangkuman Sepak Bola)
    Exercise(
        id = "u25_s2_p1_m10",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u25_s2_p1_m10_1", "踢", "tī", "menendang"),
            MatchPairItem("u25_s2_p1_m2", "足球", "zúqiú", "sepak bola"),
            MatchPairItem("u25_s2_p1_m3", "足球比赛", "zúqiú bǐsài", "laga sepak bola"),
            MatchPairItem("u25_s2_p1_m4", "看比赛", "kàn bǐsài", "nonton tanding")
        )
    )"""
        ],
        "p2": [
            f"""    // 1. Soal 1: Pilihan Gambar (篮球 -> bola basket)
    Exercise(
        id = "u25_s2_p2_q1",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "篮球",
        targetPinyin = "lánqiú",
        targetTranslation = "bola basket",
        correctAnswer = "bola basket",
        audioToSpeak = "篮球",
        pictureOptions = listOf(
            PictureOption("u25_s2_p2_opt1", "basket", "", R.drawable.ic_sport_basketball, true),
            PictureOption("u25_s2_p2_opt2", "sepak bola", "", R.drawable.ic_sport_soccer, false),
            PictureOption("u25_s2_p2_opt3", "menendang bola", "", R.drawable.ic_sport_kick_ball, false),
            PictureOption("u25_s2_p2_opt4", "renang", "", R.drawable.ic_sport_swim, false)
        )
    )""",
            f"""    // 2. Soal 2: Susun Kalimat (Adik laki-laki badannya tinggi, sangat pandai bermain basket.)
    Exercise(
        id = "u25_s2_p2_q2",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Adik tinggi, pintar main basket.",
        targetHanzi = "弟弟 很 会 打 篮球。",
        targetPinyin = "Dìdi hěn huì dǎ lánqiú.",
        wordChips = listOf("弟弟:dìdi", "很:hěn", "会:huì", "打:dǎ", "篮球。:lánqiú.", "踢:tī"),
        correctAnswer = "弟弟,很,会,打,篮球。",
        audioToSpeak = "弟弟很会打篮球。"
    )""",
            f"""    // 3. Soal 3: Ketuk Pasangan yang Sesuai (Basket & Bola)
    Exercise(
        id = "u25_s2_p2_m3",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u25_s2_p2_m1", "篮球", "lánqiú", "bola basket"),
            MatchPairItem("u25_s2_p2_m2", "打", "dǎ", "bermain (tangan)"),
            MatchPairItem("u25_s2_p2_m3", "球", "qiú", "bola"),
            MatchPairItem("u25_s2_p2_m4", "打篮球", "dǎ lánqiú", "main basket")
        )
    )""",
            f"""    // 4. Soal 4: Ketik Pinyin (bola basket -> lánqiú)
    Exercise(
        id = "u25_s2_p2_q4",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "bola basket",
        sentenceWithBlank = "篮球 (________)",
        targetHanzi = "篮球",
        targetPinyin = "lánqiú",
        correctAnswer = "lanqiu",
        keyboardKeys = {k2_p2_q4},
        audioToSpeak = "篮球"
    )""",
            f"""    // 5. Soal 5: Mendengar Kalimat (Rule 10: illustrationRes = 0)
    Exercise(
        id = "u25_s2_p2_q5",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Apa yang Anda dengar?",
        targetTranslation = "Sore hari kami bersama-sama pergi bermain bulu tangkis.",
        targetHanzi = "下午 我们 一起 去 打球。",
        targetPinyin = "Xiàwǔ wǒmen yìqǐ qù dǎqiú.",
        wordChips = listOf("下午:xiàwǔ", "我们:wǒmen", "一起:yìqǐ", "去:qù", "打球。:dǎqiú.", "游泳:yóuyǒng"),
        correctAnswer = "下午,我们,一起,去,打球。",
        illustrationRes = 0,
        audioToSpeak = "下午我们一起去打球。"
    )""",
            f"""    // 6. Soal 6: Pilihan Kalimat
    Exercise(
        id = "u25_s2_p2_q6",
        type = ExerciseType.SENTENCE_CHOICE,
        title = "Pilih terjemahan yang benar",
        targetHanzi = "这个 球 是 谁 踢 到 草丛 里的？",
        targetPinyin = "Zhège qiú shì shéi tī dào cǎocóng lǐ de?",
        targetTranslation = "Bola ini siapa yang menendangnya ke dalam semak rumput?",
        correctAnswer = "Zhège qiú shì shéi tī dào cǎocóng lǐ de?\\n这个 球 是 谁 踢 到 草丛 里的？",
        options = listOf(
            "Zhège qiú shì shéi tī dào cǎocóng lǐ de?\\n这个 球 是 谁 踢 到 草丛 里的？",
            "Zhège qiú shì shéi rēng dào shuǐ lǐ de?\\n这个 球 是 谁 扔 到 水 里的？",
            "Zhège qiú bú shì wǒ de.\\n这个 球 不 是 我 的。"
        ),
        audioToSpeak = "这个球是谁踢到草丛里的？"
    )""",
            f"""    // 7. Soal 7: Pilihan Gambar (打 -> bermain olahraga tangan)
    Exercise(
        id = "u25_s2_p2_q7",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "打",
        targetPinyin = "dǎ",
        targetTranslation = "bermain (tangan)",
        correctAnswer = "bermain (tangan)",
        audioToSpeak = "打",
        pictureOptions = listOf(
            PictureOption("u25_s2_p2_opt7_1", "main basket", "", R.drawable.ic_sport_basketball, true),
            PictureOption("u25_s2_p2_opt7_2", "tendang bola", "", R.drawable.ic_sport_kick_ball, false),
            PictureOption("u25_s2_p2_opt7_3", "lari", "", R.drawable.ic_sport_running, false),
            PictureOption("u25_s2_p2_opt7_4", "renang", "", R.drawable.ic_sport_swim, false)
        )
    )""",
            f"""    // 8. Soal 8: Ketik Pinyin (bermain/memukul -> dǎ)
    Exercise(
        id = "u25_s2_p2_q8",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "bermain / memukul",
        sentenceWithBlank = "打 (________)",
        targetHanzi = "打",
        targetPinyin = "dǎ",
        correctAnswer = "da",
        keyboardKeys = {k2_p2_q8},
        audioToSpeak = "打"
    )""",
            f"""    // 9. Soal 9: Susun Kalimat (Saya suka bermain bola basket.)
    Exercise(
        id = "u25_s2_p2_q9",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Saya suka bermain basket.",
        targetHanzi = "我 喜欢 打 篮球。",
        targetPinyin = "Wǒ xǐhuan dǎ lánqiú.",
        wordChips = listOf("我:wǒ", "喜欢:xǐhuan", "打:dǎ", "篮球。:lánqiú.", "踢:tī"),
        correctAnswer = "我,喜欢,打,篮球。",
        audioToSpeak = "我喜欢打篮球。"
    )""",
            f"""    // 10. Soal 10: Ketuk Pasangan yang Sesuai (Rangkuman Olahraga Bola)
    Exercise(
        id = "u25_s2_p2_m10",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u25_s2_p2_m10_1", "打篮球", "dǎ lánqiú", "main basket"),
            MatchPairItem("u25_s2_p2_m2", "踢足球", "tī zúqiú", "main sepak bola"),
            MatchPairItem("u25_s2_p2_m3", "打球", "dǎqiú", "main bola"),
            MatchPairItem("u25_s2_p2_m4", "很喜欢", "hěn xǐhuan", "sangat suka")
        )
    )"""
        ]
    }

    # =========================================================================
    # STAGE 3: Berenang & Seni Gerak Tari (游, 游泳, 跳舞)
    # =========================================================================
    k3_p1_q4 = make_keys("you")
    k3_p1_q8 = make_keys("youyong")
    k3_p2_q4 = make_keys("tiaowu")
    k3_p2_q8 = make_keys("haibian")
    
    stages[3] = {
        "p1": [
            f"""    // 1. Soal 1: Pilihan Gambar (游泳 -> berenang)
    Exercise(
        id = "u25_s3_p1_q1",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "游泳",
        targetPinyin = "yóuyǒng",
        targetTranslation = "berenang",
        correctAnswer = "berenang",
        audioToSpeak = "游泳",
        pictureOptions = listOf(
            PictureOption("u25_s3_p1_opt1", "renang", "", R.drawable.ic_sport_swim, true),
            PictureOption("u25_s3_p1_opt2", "lari", "", R.drawable.ic_sport_running, false),
            PictureOption("u25_s3_p1_opt3", "sepak bola", "", R.drawable.ic_sport_soccer, false),
            PictureOption("u25_s3_p1_opt4", "basket", "", R.drawable.ic_sport_basketball, false)
        )
    )""",
            f"""    // 2. Soal 2: Susun Kalimat (Di musim panas semua orang paling suka pergi ke pantai berenang.)
    Exercise(
        id = "u25_s3_p1_q2",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Musim panas semua suka ke pantai berenang.",
        targetHanzi = "夏天 大家 去 海边 游泳。",
        targetPinyin = "Xiàtiān dàjiā qù hǎibiān yóuyǒng.",
        wordChips = listOf("夏天:xiàtiān", "大家:dàjiā", "去:qù", "海边:hǎibiān", "游泳。:yóuyǒng.", "跑步:pǎobù"),
        correctAnswer = "夏天,大家,去,海边,游泳。",
        audioToSpeak = "夏天大家去海边游泳。"
    )""",
            f"""    // 3. Soal 3: Ketuk Pasangan yang Sesuai (Berenang)
    Exercise(
        id = "u25_s3_p1_q3",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u25_s3_p1_m1", "游", "yóu", "berenang (kata kerja)"),
            MatchPairItem("u25_s3_p1_m2", "游泳", "yóuyǒng", "olahraga renang"),
            MatchPairItem("u25_s3_p1_m3", "去海边", "qù hǎibiān", "ke pantai"),
            MatchPairItem("u25_s3_p1_m4", "夏天", "xiàtiān", "musim panas")
        )
    )""",
            f"""    // 4. Soal 4: Ketik Pinyin (berenang -> yóu)
    Exercise(
        id = "u25_s3_p1_q4",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "berenang",
        sentenceWithBlank = "游 (________)",
        targetHanzi = "游",
        targetPinyin = "yóu",
        correctAnswer = "you",
        keyboardKeys = {k3_p1_q4},
        audioToSpeak = "游"
    )""",
            f"""    // 5. Soal 5: Mendengar Kalimat (Rule 10: illustrationRes = 0)
    Exercise(
        id = "u25_s3_p1_q5",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Apa yang Anda dengar?",
        targetTranslation = "Ikan kecil berenang bebas ke sana ke mari di dalam air.",
        targetHanzi = "小鱼 在 水 里 游。",
        targetPinyin = "Xiǎoyú zài shuǐ lǐ yóu.",
        wordChips = listOf("小鱼:xiǎoyú", "在:zài", "水:shuǐ", "里:lǐ", "游。:yóu.", "飞:fēi"),
        correctAnswer = "小鱼,在,水,里,游。",
        illustrationRes = 0,
        audioToSpeak = "小鱼在水里游。"
    )""",
            f"""    // 6. Soal 6: Pilihan Kalimat
    Exercise(
        id = "u25_s3_p1_q6",
        type = ExerciseType.SENTENCE_CHOICE,
        title = "Pilih terjemahan yang benar",
        targetHanzi = "你 会 不 会 游泳？",
        targetPinyin = "Nǐ huì bu huì yóuyǒng?",
        targetTranslation = "Apakah kamu bisa berenang?",
        correctAnswer = "Nǐ huì bu huì yóuyǒng?\\n你 会 不 会 游泳？",
        options = listOf(
            "Nǐ huì bu huì yóuyǒng?\\n你 会 不 会 游泳？",
            "Nǐ huì bu huì chànggē?\\n你 会 不 会 唱歌？",
            "Tā huì bu huì yóuyǒng?\\n他 会 不 会 游泳？"
        ),
        audioToSpeak = "你会不会游泳？"
    )""",
            f"""    // 7. Soal 7: Pilihan Gambar (游 -> berenang di air)
    Exercise(
        id = "u25_s3_p1_q7",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "游",
        targetPinyin = "yóu",
        targetTranslation = "berenang",
        correctAnswer = "berenang",
        audioToSpeak = "游",
        pictureOptions = listOf(
            PictureOption("u25_s3_p1_opt7_1", "berenang", "", R.drawable.ic_sport_swim, true),
            PictureOption("u25_s3_p1_opt7_2", "lari", "", R.drawable.ic_sport_running, false),
            PictureOption("u25_s3_p1_opt7_3", "basket", "", R.drawable.ic_sport_basketball, false),
            PictureOption("u25_s3_p1_opt7_4", "fitness", "", R.drawable.ic_sport_fitness, false)
        )
    )""",
            f"""    // 8. Soal 8: Ketik Pinyin (berenang -> yóuyǒng)
    Exercise(
        id = "u25_s3_p1_q8",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "berenang (olahraga)",
        sentenceWithBlank = "游泳 (________)",
        targetHanzi = "游泳",
        targetPinyin = "yóuyǒng",
        correctAnswer = "youyong",
        keyboardKeys = {k3_p1_q8},
        audioToSpeak = "游泳"
    )""",
            f"""    // 9. Soal 9: Susun Kalimat (Saya bisa berenang dengan sangat baik.)
    Exercise(
        id = "u25_s3_p1_q9",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Saya berenang sangat baik.",
        targetHanzi = "我 游 得 很 好。",
        targetPinyin = "Wǒ yóu de hěn hǎo.",
        wordChips = listOf("我:wǒ", "游:yóu", "得:de", "很:hěn", "好。:hǎo.", "慢:màn"),
        correctAnswer = "我,游,得,很,好。",
        audioToSpeak = "我游得很好。"
    )""",
            f"""    // 10. Soal 10: Ketuk Pasangan yang Sesuai (Rangkuman Olahraga Renang)
    Exercise(
        id = "u25_s3_p1_m10",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u25_s3_p1_m10_1", "游", "yóu", "berenang"),
            MatchPairItem("u25_s3_p1_m2", "游泳池", "yóuyǒngchí", "kolam renang"),
            MatchPairItem("u25_s3_p1_m3", "学游泳", "xué yóuyǒng", "belajar renang"),
            MatchPairItem("u25_s3_p1_m4", "会游泳", "huì yóuyǒng", "bisa renang")
        )
    )"""
        ],
        "p2": [
            f"""    // 1. Soal 1: Pilihan Gambar (跳舞 -> menari / berdansa)
    Exercise(
        id = "u25_s3_p2_q1",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "跳舞",
        targetPinyin = "tiàowǔ",
        targetTranslation = "menari / berdansa",
        correctAnswer = "menari / berdansa",
        audioToSpeak = "跳舞",
        pictureOptions = listOf(
            PictureOption("u25_s3_p2_opt1", "menari", "", R.drawable.ic_sport_fitness, true),
            PictureOption("u25_s3_p2_opt2", "renang", "", R.drawable.ic_sport_swim, false),
            PictureOption("u25_s3_p2_opt3", "lari", "", R.drawable.ic_sport_running, false),
            PictureOption("u25_s3_p2_opt4", "sepak bola", "", R.drawable.ic_sport_soccer, false)
        )
    )""",
            f"""    // 2. Soal 2: Susun Kalimat (Kakak perempuan sejak kecil sudah suka menari.)
    Exercise(
        id = "u25_s3_p2_q2",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Kakak perempuan sejak kecil suka menari.",
        targetHanzi = "姐姐 从小 喜欢 跳舞。",
        targetPinyin = "Jiějie cóngxiǎo xǐhuan tiàowǔ.",
        wordChips = listOf("姐姐:jiějie", "从小:cóngxiǎo", "喜欢:xǐhuan", "跳舞。:tiàowǔ.", "游泳:yóuyǒng"),
        correctAnswer = "姐姐,从小,喜欢,跳舞。",
        audioToSpeak = "姐姐从小喜欢跳舞。"
    )""",
            f"""    // 3. Soal 3: Ketuk Pasangan yang Sesuai (Menari & Seni Gerak)
    Exercise(
        id = "u25_s3_p2_m3",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u25_s3_p2_m1", "跳舞", "tiàowǔ", "menari / berdansa"),
            MatchPairItem("u25_s3_p2_m2", "唱歌", "chànggē", "bernyanyi"),
            MatchPairItem("u25_s3_p2_m3", "跳得好", "tiào de hǎo", "menari bagus"),
            MatchPairItem("u25_s3_p2_m4", "从小喜欢", "cóngxiǎo xǐhuan", "sejak kecil suka")
        )
    )""",
            f"""    // 4. Soal 4: Ketik Pinyin (menari -> tiàowǔ)
    Exercise(
        id = "u25_s3_p2_q4",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "menari / berdansa",
        sentenceWithBlank = "跳舞 (________)",
        targetHanzi = "跳舞",
        targetPinyin = "tiàowǔ",
        correctAnswer = "tiaowu",
        keyboardKeys = {k3_p2_q4},
        audioToSpeak = "跳舞"
    )""",
            f"""    // 5. Soal 5: Mendengar Kalimat (Rule 10: illustrationRes = 0)
    Exercise(
        id = "u25_s3_p2_q5",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Apa yang Anda dengar?",
        targetTranslation = "Gadis kecil itu menari dengan sangat indah.",
        targetHanzi = "小 女孩儿 跳舞 跳 得 真 好看。",
        targetPinyin = "Xiǎo nǚháiér tiàowǔ tiào de zhēn hǎokàn.",
        wordChips = listOf("小:xiǎo", "女孩儿:nǚháiér", "跳舞:tiàowǔ", "跳:tiào", "得:de", "真:zhēn", "好看。:hǎokàn.", "唱歌:chànggē"),
        correctAnswer = "小,女孩儿,跳舞,跳,得,真,好看。",
        illustrationRes = 0,
        audioToSpeak = "小女孩儿跳舞跳得真好看。"
    )""",
            f"""    // 6. Soal 6: Pilihan Kalimat
    Exercise(
        id = "u25_s3_p2_q6",
        type = ExerciseType.SENTENCE_CHOICE,
        title = "Pilih terjemahan yang benar",
        targetHanzi = "晚上 广场 上 有 很多 人 在 跳舞。",
        targetPinyin = "Wǎnshang guǎngchǎng shang yǒu hěn duō rén zài tiàowǔ.",
        targetTranslation = "Malam hari di alun-alun ada banyak orang sedang menari.",
        correctAnswer = "Wǎnshang guǎngchǎng shang yǒu hěn duō rén zài tiàowǔ.\\n晚上 广场 上 有 很多 人 在 跳舞。",
        options = listOf(
            "Wǎnshang guǎngchǎng shang yǒu hěn duō rén zài tiàowǔ.\\n晚上 广场 上 有 很多 人 在 跳舞。",
            "Zǎoshang guǎngchǎng shang yǒu hěn duō rén zài pǎobù.\\n早上 广场 上 有 很多 人 在 跑步。",
            "Wǎnshang jiā lǐ yǒu hěn duō rén zài tiàowǔ.\\n晚上 家 里 有 很多 人 在 跳舞。"
        ),
        audioToSpeak = "晚上广场上有很多人在跳舞。"
    )""",
            f"""    // 7. Soal 7: Pilihan Gambar (跳舞 -> tari seni)
    Exercise(
        id = "u25_s3_p2_q7",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "跳舞",
        targetPinyin = "tiàowǔ",
        targetTranslation = "seni tari",
        correctAnswer = "seni tari",
        audioToSpeak = "跳舞",
        pictureOptions = listOf(
            PictureOption("u25_s3_p2_opt7_1", "menari", "", R.drawable.ic_sport_fitness, true),
            PictureOption("u25_s3_p2_opt7_2", "lari", "", R.drawable.ic_sport_running, false),
            PictureOption("u25_s3_p2_opt7_3", "sepak bola", "", R.drawable.ic_sport_soccer, false),
            PictureOption("u25_s3_p2_opt7_4", "renang", "", R.drawable.ic_sport_swim, false)
        )
    )""",
            f"""    // 8. Soal 8: Ketik Pinyin (menari -> tiàowǔ)
    Exercise(
        id = "u25_s3_p2_q8",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "menari",
        sentenceWithBlank = "跳舞 (________)",
        targetHanzi = "跳舞",
        targetPinyin = "tiàowǔ",
        correctAnswer = "tiaowu",
        keyboardKeys = {k3_p2_q4},
        audioToSpeak = "跳舞"
    )""",
            f"""    // 9. Soal 9: Susun Kalimat (Ayo kita menari bersama-sama.)
    Exercise(
        id = "u25_s3_p2_q9",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Ayo kita menari bersama.",
        targetHanzi = "我们 一起 跳舞 吧。",
        targetPinyin = "Wǒmen yìqǐ tiàowǔ ba.",
        wordChips = listOf("我们:wǒmen", "一起:yìqǐ", "跳舞:tiàowǔ", "吧。:ba.", "唱歌:chànggē"),
        correctAnswer = "我们,一起,跳舞,吧。",
        audioToSpeak = "我们一起跳舞吧。"
    )""",
            f"""    // 10. Soal 10: Ketuk Pasangan yang Sesuai (Rangkuman Tari & Olahraga)
    Exercise(
        id = "u25_s3_p2_m10",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u25_s3_p2_m10_1", "跳舞", "tiàowǔ", "menari"),
            MatchPairItem("u25_s3_p2_m10_2", "真好看", "zhēn hǎokàn", "sangat indah"),
            MatchPairItem("u25_s3_p2_m3", "学跳舞", "xué tiàowǔ", "belajar tari"),
            MatchPairItem("u25_s3_p2_m4", "广场上", "guǎngchǎng shang", "di alun-alun")
        )
    )"""
        ]
    }

    # =========================================================================
    # STAGE 4: Bangkit Berenergi & Mengatasi Lelah (起来, 动, 身体, 累)
    # =========================================================================
    k4_p1_q4 = make_keys("qilai")
    k4_p1_q8 = make_keys("dong")
    k4_p2_q4 = make_keys("shenti")
    k4_p2_q8 = make_keys("lei")
    
    stages[4] = {
        "p1": [
            f"""    // 1. Soal 1: Pilihan Gambar (起来 -> bangun / bangkit)
    Exercise(
        id = "u25_s4_p1_q1",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "起来",
        targetPinyin = "qǐlái",
        targetTranslation = "bangun / bangkit",
        correctAnswer = "bangun / bangkit",
        audioToSpeak = "起来",
        pictureOptions = listOf(
            PictureOption("u25_s4_p1_opt1", "bangun", "", R.drawable.ic_sport_fitness, true),
            PictureOption("u25_s4_p1_opt2", "lari", "", R.drawable.ic_sport_running, false),
            PictureOption("u25_s4_p1_opt3", "sepak bola", "", R.drawable.ic_sport_soccer, false),
            PictureOption("u25_s4_p1_opt4", "renang", "", R.drawable.ic_sport_swim, false)
        )
    )""",
            f"""    // 2. Soal 2: Susun Kalimat (Pukul tujuh pagi saya sudah bangun dari tempat tidur.)
    Exercise(
        id = "u25_s4_p1_q2",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Pukul tujuh pagi saya sudah bangun.",
        targetHanzi = "早上 七点 我 就 起来 了。",
        targetPinyin = "Zǎoshang qīdiǎn wǒ jiù qǐlái le.",
        wordChips = listOf("早上:zǎoshang", "七点:qīdiǎn", "我:wǒ", "就:jiù", "起来:qǐlái", "了。:le.", "睡觉:shuìjiào"),
        correctAnswer = "早上,七点,我,就,起来,了。",
        audioToSpeak = "早上七点我就起来了。"
    )""",
            f"""    // 3. Soal 3: Ketuk Pasangan yang Sesuai (Bangun & Bergerak)
    Exercise(
        id = "u25_s4_p1_q3",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u25_s4_p1_m1", "起来", "qǐlái", "bangun / bangkit"),
            MatchPairItem("u25_s4_p1_m2", "动", "dòng", "bergerak"),
            MatchPairItem("u25_s4_p1_m3", "站起来", "zhàn qǐlai", "berdiri"),
            MatchPairItem("u25_s4_p1_m4", "动一动", "dòng yi dòng", "bergerak sedikit")
        )
    )""",
            f"""    // 4. Soal 4: Ketik Pinyin (bangun -> qǐlái)
    Exercise(
        id = "u25_s4_p1_q4",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "bangun / bangkit",
        sentenceWithBlank = "起来 (________)",
        targetHanzi = "起来",
        targetPinyin = "qǐlái",
        correctAnswer = "qilai",
        keyboardKeys = {k4_p1_q4},
        audioToSpeak = "起来"
    )""",
            f"""    // 5. Soal 5: Mendengar Kalimat (Rule 10: illustrationRes = 0)
    Exercise(
        id = "u25_s4_p1_q5",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Apa yang Anda dengar?",
        targetTranslation = "Cuaca terlalu dingin, tangan sampai hampir tidak bisa digerakkan.",
        targetHanzi = "太 冷 了， 动 不 了 了。",
        targetPinyin = "Tài lěng le, dòng bù liǎo le.",
        wordChips = listOf("太:tài", "冷:lěng", "了，:le,", "动:dòng", "不:bù", "了:liǎo", "了。:le.", "热:rè"),
        correctAnswer = "太,冷,了，,动,不,了,了。",
        illustrationRes = 0,
        audioToSpeak = "太冷了，动不了了。"
    )""",
            f"""    // 6. Soal 6: Pilihan Kalimat
    Exercise(
        id = "u25_s4_p1_q6",
        type = ExerciseType.SENTENCE_CHOICE,
        title = "Pilih terjemahan yang benar",
        targetHanzi = "别 坐 着， 快 起来 动 一 动！",
        targetPinyin = "Bié zuò zhe, kuài qǐlái dòng yi dòng!",
        targetTranslation = "Jangan duduk terus, cepat bangun dan bergerak sedikit!",
        correctAnswer = "Bié zuò zhe, kuài qǐlái dòng yi dòng!\\n别 坐 着， 快 起来 动 一 动！",
        options = listOf(
            "Bié zuò zhe, kuài qǐlái dòng yi dòng!\\n别 坐 着， 快 起来 动 一 动！",
            "Bié zhàn zhe, kuài zuò xià ba!\\n别 站 着， 快 坐 下 吧！",
            "Kuài shuìjiào ba, bié dòng le!\\n快 睡觉 吧， 别 动 了！"
        ),
        audioToSpeak = "别坐着，快起来动一动！"
    )""",
            f"""    // 7. Soal 7: Pilihan Gambar (动 -> bergerak)
    Exercise(
        id = "u25_s4_p1_q7",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "动",
        targetPinyin = "dòng",
        targetTranslation = "bergerak",
        correctAnswer = "bergerak",
        audioToSpeak = "动",
        pictureOptions = listOf(
            PictureOption("u25_s4_p1_opt7_1", "bergerak", "", R.drawable.ic_sport_fitness, true),
            PictureOption("u25_s4_p1_opt7_2", "lari", "", R.drawable.ic_sport_running, false),
            PictureOption("u25_s4_p1_opt7_3", "basket", "", R.drawable.ic_sport_basketball, false),
            PictureOption("u25_s4_p1_opt7_4", "renang", "", R.drawable.ic_sport_swim, false)
        )
    )""",
            f"""    // 8. Soal 8: Ketik Pinyin (bergerak -> dòng)
    Exercise(
        id = "u25_s4_p1_q8",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "bergerak",
        sentenceWithBlank = "动 (________)",
        targetHanzi = "动",
        targetPinyin = "dòng",
        correctAnswer = "dong",
        keyboardKeys = {k4_p1_q8},
        audioToSpeak = "动"
    )""",
            f"""    // 9. Soal 9: Susun Kalimat (Silakan para hadirin berdiri.)
    Exercise(
        id = "u25_s4_p1_q9",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Silakan semua berdiri.",
        targetHanzi = "请 大家 站 起来。",
        targetPinyin = "Qǐng dàjiā zhàn qǐlai.",
        wordChips = listOf("请:qǐng", "大家:dàjiā", "站:zhàn", "起来。:qǐlai.", "坐下:zuòxià"),
        correctAnswer = "请,大家,站,起来。",
        audioToSpeak = "请大家站起来。"
    )""",
            f"""    // 10. Soal 10: Ketuk Pasangan yang Sesuai (Rangkuman Bangkit & Bergerak)
    Exercise(
        id = "u25_s4_p1_m10",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u25_s4_p1_m10_1", "起来", "qǐlái", "bangun"),
            MatchPairItem("u25_s4_p1_m10_2", "动", "dòng", "bergerak"),
            MatchPairItem("u25_s4_p1_m10_3", "站起来", "zhàn qǐlai", "bangkit berdiri"),
            MatchPairItem("u25_s4_p1_m10_4", "起得早", "qǐ de zǎo", "bangun pagi")
        )
    )"""
        ],
        "p2": [
            f"""    // 1. Soal 1: Pilihan Gambar (身体 -> tubuh / kesehatan)
    Exercise(
        id = "u25_s4_p2_q1",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "身体",
        targetPinyin = "shēntǐ",
        targetTranslation = "tubuh / kesehatan",
        correctAnswer = "tubuh / kesehatan",
        audioToSpeak = "身体",
        pictureOptions = listOf(
            PictureOption("u25_s4_p2_opt1", "tubuh sehat", "", R.drawable.ic_sport_fitness, true),
            PictureOption("u25_s4_p2_opt2", "lelah", "", R.drawable.ic_sport_running, false),
            PictureOption("u25_s4_p2_opt3", "renang", "", R.drawable.ic_sport_swim, false),
            PictureOption("u25_s4_p2_opt4", "sepak bola", "", R.drawable.ic_sport_soccer, false)
        )
    )""",
            f"""    // 2. Soal 2: Susun Kalimat (Akhir-akhir ini pekerjaan sangat sibuk, Anda harus menjaga kesehatan tubuh.)
    Exercise(
        id = "u25_s4_p2_q2",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Kamu harus menjaga kesehatan tubuh.",
        targetHanzi = "你 要 保重 身体。",
        targetPinyin = "Nǐ yào bǎozhòng shēntǐ.",
        wordChips = listOf("你:nǐ", "要:yào", "保重:bǎozhòng", "身体。:shēntǐ.", "休息:xiūxi"),
        correctAnswer = "你,要,保重,身体。",
        audioToSpeak = "你要保重身体。"
    )""",
            f"""    // 3. Soal 3: Ketuk Pasangan yang Sesuai (Tubuh & Lelah)
    Exercise(
        id = "u25_s4_p2_m3",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u25_s4_p2_m1", "身体", "shēntǐ", "tubuh / kesehatan"),
            MatchPairItem("u25_s4_p2_m2", "累", "lèi", "lelah / capek"),
            MatchPairItem("u25_s4_p2_m3", "太累了", "tài lèi le", "terlalu lelah"),
            MatchPairItem("u25_s4_p2_m4", "身体好", "shēntǐ hǎo", "sehat walafiat")
        )
    )""",
            f"""    // 4. Soal 4: Ketik Pinyin (tubuh/kesehatan -> shēntǐ)
    Exercise(
        id = "u25_s4_p2_q4",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "tubuh / kesehatan",
        sentenceWithBlank = "身体 (________)",
        targetHanzi = "身体",
        targetPinyin = "shēntǐ",
        correctAnswer = "shenti",
        keyboardKeys = {k4_p2_q4},
        audioToSpeak = "身体"
    )""",
            f"""    // 5. Soal 5: Mendengar Kalimat (Rule 10: illustrationRes = 0)
    Exercise(
        id = "u25_s4_p2_q5",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Apa yang Anda dengar?",
        targetTranslation = "Hari ini berjalan dua puluh ribu langkah, sungguh capek!",
        targetHanzi = "今天 走 了 两万 步， 真 累！",
        targetPinyin = "Jīntiān zǒu le liǎngwàn bù, zhēn lèi!",
        wordChips = listOf("今天:jīntiān", "走:zǒu", "了:le", "两万:liǎngwàn", "步，:bù,", "真:zhēn", "累！:lèi!", "高兴:gāoxìng"),
        correctAnswer = "今天,走,了,两万,步，,真,累！",
        illustrationRes = 0,
        audioToSpeak = "今天走了两万步，真累！"
    )""",
            f"""    // 6. Soal 6: Pilihan Kalimat
    Exercise(
        id = "u25_s4_p2_q6",
        type = ExerciseType.SENTENCE_CHOICE,
        title = "Pilih terjemahan yang benar",
        targetHanzi = "虽然 很 累， 但 我 心里 很 高兴。",
        targetPinyin = "Suīrán hěn lèi, dàn wǒ xīnlǐ hěn gāoxìng.",
        targetTranslation = "Meskipun sangat lelah, tetapi hati saya sangat senang.",
        correctAnswer = "Suīrán hěn lèi, dàn wǒ xīnlǐ hěn gāoxìng.\\n虽然 很 累， 但 我 心里 很 高兴。",
        options = listOf(
            "Suīrán hěn lèi, dàn wǒ xīnlǐ hěn gāoxìng.\\n虽然 很 累， 但 我 心里 很 高兴。",
            "Suīrán bù lèi, dàn wǒ xīnlǐ bù gāoxìng.\\n虽然 不 累， 但 我 心里 不 高兴。",
            "Tā hěn lèi, xīnlǐ bù gāoxìng.\\n他 很 累， 心里 不 高兴。"
        ),
        audioToSpeak = "虽然很累，但我心里很高兴。"
    )""",
            f"""    // 7. Soal 7: Pilihan Gambar (累 -> lelah capek)
    Exercise(
        id = "u25_s4_p2_q7",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "累",
        targetPinyin = "lèi",
        targetTranslation = "lelah / capek",
        correctAnswer = "lelah / capek",
        audioToSpeak = "累",
        pictureOptions = listOf(
            PictureOption("u25_s4_p2_opt7_1", "lelah", "", R.drawable.ic_sport_running, true),
            PictureOption("u25_s4_p2_opt7_2", "kebugaran", "", R.drawable.ic_sport_fitness, false),
            PictureOption("u25_s4_p2_opt7_3", "sepak bola", "", R.drawable.ic_sport_soccer, false),
            PictureOption("u25_s4_p2_opt7_4", "renang", "", R.drawable.ic_sport_swim, false)
        )
    )""",
            f"""    // 8. Soal 8: Ketik Pinyin (lelah -> lèi)
    Exercise(
        id = "u25_s4_p2_q8",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "lelah / capek",
        sentenceWithBlank = "累 (________)",
        targetHanzi = "累",
        targetPinyin = "lèi",
        correctAnswer = "lei",
        keyboardKeys = {k4_p2_q8},
        audioToSpeak = "累"
    )""",
            f"""    // 9. Soal 9: Susun Kalimat (Kerja seharian sangat melelahkan.)
    Exercise(
        id = "u25_s4_p2_q9",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Kerja seharian sangat lelah.",
        targetHanzi = "工作 一天 很 累。",
        targetPinyin = "Gōngzuò yìtiān hěn lèi.",
        wordChips = listOf("工作:gōngzuò", "一天:yìtiān", "很:hěn", "累。:lèi.", "轻松:qīngsōng"),
        correctAnswer = "工作,一天,很,累。",
        audioToSpeak = "工作一天很累。"
    )""",
            f"""    // 10. Soal 10: Ketuk Pasangan yang Sesuai (Rangkuman Tubuh & Kebugaran)
    Exercise(
        id = "u25_s4_p2_m10",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u25_s4_p2_m10_1", "身体", "shēntǐ", "kondisi badan"),
            MatchPairItem("u25_s4_p2_m10_2", "真累", "zhēn lèi", "sungguh lelah"),
            MatchPairItem("u25_s4_p2_m10_3", "好好休息", "hǎohāo xiūxi", "istirahat baik"),
            MatchPairItem("u25_s4_p2_m10_4", "多运动", "duō yùndòng", "rajin olahraga")
        )
    )"""
        ]
    }

    # =========================================================================
    # STAGE 5: Evaluasi Komprehensif Olahraga & Kebugaran (Sintesis Seluruh Bab 25)
    # =========================================================================
    k5_p1_q4 = make_keys("yundong")
    k5_p1_q8 = make_keys("zuqiu")
    k5_p2_q4 = make_keys("lanqiu")
    k5_p2_q8 = make_keys("youyong")
    
    stages[5] = {
        "p1": [
            f"""    // 1. Soal 1: Pilihan Gambar (运动 -> olahraga kebugaran)
    Exercise(
        id = "u25_s5_p1_q1",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "运动",
        targetPinyin = "yùndòng",
        targetTranslation = "olahraga",
        correctAnswer = "olahraga",
        audioToSpeak = "运动",
        pictureOptions = listOf(
            PictureOption("u25_s5_p1_opt1", "olahraga", "", R.drawable.ic_sport_fitness, true),
            PictureOption("u25_s5_p1_opt2", "lari", "", R.drawable.ic_sport_running, false),
            PictureOption("u25_s5_p1_opt3", "sepak bola", "", R.drawable.ic_sport_soccer, false),
            PictureOption("u25_s5_p1_opt4", "renang", "", R.drawable.ic_sport_swim, false)
        )
    )""",
            f"""    // 2. Soal 2: Susun Kalimat (Kami setiap akhir pekan pergi bermain sepak bola.)
    Exercise(
        id = "u25_s5_p1_q2",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Kami tiap akhir pekan main bola.",
        targetHanzi = "我们 周末 去 踢 足球。",
        targetPinyin = "Wǒmen zhōumò qù tī zúqiú.",
        wordChips = listOf("我们:wǒmen", "周末:zhōumò", "去:qù", "踢:tī", "足球。:zúqiú.", "买东西:mǎi dōngxi"),
        correctAnswer = "我们,周末,去,踢,足球。",
        audioToSpeak = "我们周末去踢足球。"
    )""",
            f"""    // 3. Soal 3: Ketuk Pasangan yang Sesuai (Sintesis Olahraga Bola)
    Exercise(
        id = "u25_s5_p1_m3",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u25_s5_p1_m1", "运动", "yùndòng", "olahraga"),
            MatchPairItem("u25_s5_p1_m2", "足球", "zúqiú", "sepak bola"),
            MatchPairItem("u25_s5_p1_m3", "踢球", "tī qiú", "tendang bola"),
            MatchPairItem("u25_s5_p1_m4", "周末", "zhōumò", "akhir pekan")
        )
    )""",
            f"""    // 4. Soal 4: Ketik Pinyin (olahraga -> yùndòng)
    Exercise(
        id = "u25_s5_p1_q4",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "berolahraga / olahraga",
        sentenceWithBlank = "运动 (________)",
        targetHanzi = "运动",
        targetPinyin = "yùndòng",
        correctAnswer = "yundong",
        keyboardKeys = {k5_p1_q4},
        audioToSpeak = "运动"
    )""",
            f"""    // 5. Soal 5: Mendengar Kalimat (Rule 10: illustrationRes = 0)
    Exercise(
        id = "u25_s5_p1_q5",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Apa yang Anda dengar?",
        targetTranslation = "Anak-anak laki-laki suka bermain basket.",
        targetHanzi = "男孩子们 喜欢 打 篮球。",
        targetPinyin = "Nánháizimen xǐhuan dǎ lánqiú.",
        wordChips = listOf("男孩子们:nánháizimen", "喜欢:xǐhuan", "打:dǎ", "篮球。:lánqiú.", "跳舞:tiàowǔ"),
        correctAnswer = "男孩子们,喜欢,打,篮球。",
        illustrationRes = 0,
        audioToSpeak = "男孩子们喜欢打篮球。"
    )""",
            f"""    // 6. Soal 6: Pilihan Kalimat
    Exercise(
        id = "u25_s5_p1_q6",
        type = ExerciseType.SENTENCE_CHOICE,
        title = "Pilih terjemahan yang benar",
        targetHanzi = "我 每天 早上 跑步 半 个 小时。",
        targetPinyin = "Wǒ měitiān zǎoshang pǎobù bàn gè xiǎoshí.",
        targetTranslation = "Saya setiap pagi jogging selama setengah jam.",
        correctAnswer = "Wǒ měitiān zǎoshang pǎobù bàn gè xiǎoshí.\\n我 每天 早上 跑步 半 个 小时。",
        options = listOf(
            "Wǒ měitiān zǎoshang pǎobù bàn gè xiǎoshí.\\n我 每天 早上 跑步 半 个 小时。",
            "Wǒ měitiān wǎnshang pǎobù yí gè xiǎoshí.\\n我 每天 晚上 跑步 一 个 小时。",
            "Tā měitiān zǎoshang yóuyǒng bàn gè xiǎoshí.\\n他 每天 早上 游泳 半 个 小时。"
        ),
        audioToSpeak = "我每天早上跑步半个小时。"
    )""",
            f"""    // 7. Soal 7: Pilihan Gambar (足球 -> sepak bola rumput)
    Exercise(
        id = "u25_s5_p1_q7",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "足球",
        targetPinyin = "zúqiú",
        targetTranslation = "sepak bola",
        correctAnswer = "sepak bola",
        audioToSpeak = "足球",
        pictureOptions = listOf(
            PictureOption("u25_s5_p1_opt7_1", "sepak bola", "", R.drawable.ic_sport_soccer, true),
            PictureOption("u25_s5_p1_opt7_2", "basket", "", R.drawable.ic_sport_basketball, false),
            PictureOption("u25_s5_p1_opt7_3", "menendang bola", "", R.drawable.ic_sport_kick_ball, false),
            PictureOption("u25_s5_p1_opt7_4", "renang", "", R.drawable.ic_sport_swim, false)
        )
    )""",
            f"""    // 8. Soal 8: Ketik Pinyin (sepak bola -> zúqiú)
    Exercise(
        id = "u25_s5_p1_q8",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "sepak bola",
        sentenceWithBlank = "足球 (________)",
        targetHanzi = "足球",
        targetPinyin = "zúqiú",
        correctAnswer = "zuqiu",
        keyboardKeys = {k5_p1_q8},
        audioToSpeak = "足球"
    )""",
            f"""    // 9. Soal 9: Susun Kalimat (Berenang membuat tubuh sangat sehat.)
    Exercise(
        id = "u25_s5_p1_q9",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Berenang membuat tubuh sangat sehat.",
        targetHanzi = "游泳 让 身体 很 健康。",
        targetPinyin = "Yóuyǒng ràng shēntǐ hěn jiànkāng.",
        wordChips = listOf("游泳:yóuyǒng", "让:ràng", "身体:shēntǐ", "很:hěn", "健康。:jiànkāng.", "生病:shēngbìng"),
        correctAnswer = "游泳,让,身体,很,健康。",
        audioToSpeak = "游泳让身体很健康。"
    )""",
            f"""    // 10. Soal 10: Ketuk Pasangan yang Sesuai (Rangkuman Sintesis 1)
    Exercise(
        id = "u25_s5_p1_m10",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u25_s5_p1_m10_1", "踢足球", "tī zúqiú", "main sepak bola"),
            MatchPairItem("u25_s5_p1_m10_2", "打篮球", "dǎ lánqiú", "main basket"),
            MatchPairItem("u25_s5_p1_m10_3", "很健康", "hěn jiànkāng", "sangat sehat"),
            MatchPairItem("u25_s5_p1_m10_4", "去游泳", "qù yóuyǒng", "pergi berenang")
        )
    )"""
        ],
        "p2": [
            f"""    // 1. Soal 1: Pilihan Gambar (篮球 -> bola basket ring)
    Exercise(
        id = "u25_s5_p2_q1",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "篮球",
        targetPinyin = "lánqiú",
        targetTranslation = "bola basket",
        correctAnswer = "bola basket",
        audioToSpeak = "篮球",
        pictureOptions = listOf(
            PictureOption("u25_s5_p2_opt1", "basket", "", R.drawable.ic_sport_basketball, true),
            PictureOption("u25_s5_p2_opt2", "sepak bola", "", R.drawable.ic_sport_soccer, false),
            PictureOption("u25_s5_p2_opt3", "lari", "", R.drawable.ic_sport_running, false),
            PictureOption("u25_s5_p2_opt4", "renang", "", R.drawable.ic_sport_swim, false)
        )
    )""",
            f"""    // 2. Soal 2: Susun Kalimat (Setelah selesai berolahraga, kami minum air.)
    Exercise(
        id = "u25_s5_p2_q2",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Selesai olahraga kami minum air.",
        targetHanzi = "运动 完 我们 喝 水。",
        targetPinyin = "Yùndòng wán wǒmen hē shuǐ.",
        wordChips = listOf("运动:yùndòng", "完:wán", "我们:wǒmen", "喝:hē", "水。:shuǐ.", "茶:chá"),
        correctAnswer = "运动,完,我们,喝,水。",
        audioToSpeak = "运动完我们喝水。"
    )""",
            f"""    // 3. Soal 3: Ketuk Pasangan yang Sesuai (Grand Sintesis Bab 25)
    Exercise(
        id = "u25_s5_p2_m3",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u25_s5_p2_m1", "篮球", "lánqiú", "bola basket"),
            MatchPairItem("u25_s5_p2_m2", "游泳", "yóuyǒng", "berenang"),
            MatchPairItem("u25_s5_p2_m3", "跳舞", "tiàowǔ", "menari"),
            MatchPairItem("u25_s5_p2_m4", "跑步", "pǎobù", "jogging")
        )
    )""",
            f"""    // 4. Soal 4: Ketik Pinyin (bola basket -> lánqiú)
    Exercise(
        id = "u25_s5_p2_q4",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "bola basket",
        sentenceWithBlank = "篮球 (________)",
        targetHanzi = "篮球",
        targetPinyin = "lánqiú",
        correctAnswer = "lanqiu",
        keyboardKeys = {k5_p2_q4},
        audioToSpeak = "篮球"
    )""",
            f"""    // 5. Soal 5: Mendengar Kalimat (Rule 10: illustrationRes = 0)
    Exercise(
        id = "u25_s5_p2_q5",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Apa yang Anda dengar?",
        targetTranslation = "Menari membuat orang sangat bahagia.",
        targetHanzi = "跳舞 让 人 很 快乐。",
        targetPinyin = "Tiàowǔ ràng rén hěn kuàilè.",
        wordChips = listOf("跳舞:tiàowǔ", "让:ràng", "人:rén", "很:hěn", "快乐。:kuàilè.", "累:lèi"),
        correctAnswer = "跳舞,让,人,很,快乐。",
        illustrationRes = 0,
        audioToSpeak = "跳舞让人快乐。"
    )""",
            f"""    // 6. Soal 6: Pilihan Kalimat
    Exercise(
        id = "u25_s5_p2_q6",
        type = ExerciseType.SENTENCE_CHOICE,
        title = "Pilih terjemahan yang benar",
        targetHanzi = "我们 大家 一起 运动 吧！",
        targetPinyin = "Wǒmen dàjiā yìqǐ yùndòng ba!",
        targetTranslation = "Ayo kita semua berolahraga bersama!",
        correctAnswer = "Wǒmen dàjiā yìqǐ yùndòng ba!\\n我们 大家 一起 运动 吧！",
        options = listOf(
            "Wǒmen dàjiā yìqǐ yùndòng ba!\\n我们 大家 一起 运动 吧！",
            "Wǒmen dàjiā yìqǐ shuìjiào ba!\\n我们 大家 一起 睡觉 吧！",
            "Tāmen dàjiā yìqǐ yùndòng ba!\\n他们 大家 一起 运动 吧！"
        ),
        audioToSpeak = "我们大家一起运动吧！"
    )""",
            f"""    // 7. Soal 7: Pilihan Gambar (游泳 -> olahraga renang)
    Exercise(
        id = "u25_s5_p2_q7",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "游泳",
        targetPinyin = "yóuyǒng",
        targetTranslation = "berenang",
        correctAnswer = "berenang",
        audioToSpeak = "游泳",
        pictureOptions = listOf(
            PictureOption("u25_s5_p2_opt7_1", "renang", "", R.drawable.ic_sport_swim, true),
            PictureOption("u25_s5_p2_opt7_2", "lari", "", R.drawable.ic_sport_running, false),
            PictureOption("u25_s5_p2_opt7_3", "basket", "", R.drawable.ic_sport_basketball, false),
            PictureOption("u25_s5_p2_opt7_4", "sepak bola", "", R.drawable.ic_sport_soccer, false)
        )
    )""",
            f"""    // 8. Soal 8: Ketik Pinyin (berenang -> yóuyǒng)
    Exercise(
        id = "u25_s5_p2_q8",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "berenang",
        sentenceWithBlank = "游泳 (________)",
        targetHanzi = "游泳",
        targetPinyin = "yóuyǒng",
        correctAnswer = "youyong",
        keyboardKeys = {k5_p2_q8},
        audioToSpeak = "游泳"
    )""",
            f"""    // 9. Soal 9: Susun Kalimat (Kebugaran tubuh sangat penting bagi semua orang.)
    Exercise(
        id = "u25_s5_p2_q9",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Kesehatan tubuh sangat penting.",
        targetHanzi = "身体 健康 很 重要。",
        targetPinyin = "Shēntǐ jiànkāng hěn zhòngyào.",
        wordChips = listOf("身体:shēntǐ", "健康:jiànkāng", "很:hěn", "重要。:zhòngyào.", "好:hǎo"),
        correctAnswer = "身体,健康,很,重要。",
        audioToSpeak = "身体健康很重要。"
    )""",
            f"""    // 10. Soal 10: Ketuk Pasangan yang Sesuai (Grand Review Final Bab 25)
    Exercise(
        id = "u25_s5_p2_m10",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u25_s5_p2_m10_1", "爱运动", "ài yùndòng", "gemar olahraga"),
            MatchPairItem("u25_s5_p2_m10_2", "身体棒", "shēntǐ bàng", "tubuh prima"),
            MatchPairItem("u25_s5_p2_m10_3", "快快跑", "kuàikuài pǎo", "lari kencang"),
            MatchPairItem("u25_s5_p2_m10_4", "多锻炼", "duō duànliàn", "rajin berlatih")
        )
    )"""
        ]
    }

    for s_idx in range(1, 6):
        filename = f"{base_dir}/Bab25Stage{s_idx}Data.kt"
        p1_code = ",\n\n".join(stages[s_idx]["p1"])
        p2_code = ",\n\n".join(stages[s_idx]["p2"])
        
        content = f"""package com.example.chineselearning.data.repository

import com.example.chineselearning.R
import com.example.chineselearning.data.model.Exercise
import com.example.chineselearning.data.model.ExerciseType
import com.example.chineselearning.data.model.MatchPairItem
import com.example.chineselearning.data.model.PictureOption

val bab25Stage{s_idx}Part1Exercises = listOf(
{p1_code}
)

val bab25Stage{s_idx}Part2Exercises = listOf(
{p2_code}
)
"""
        with open(filename, "w", encoding="utf-8") as f:
            f.write(content)
        print(f"Written {filename}")

if __name__ == "__main__":
    generate_bab25()
