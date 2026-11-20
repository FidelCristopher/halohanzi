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

def generate_bab22():
    base_dir = "app/src/main/java/com/example/chineselearning/data/repository"
    
    stages = {}
    
    # =========================================================================
    # STAGE 1: Bus Umum, MRT & Stasiun Transit (公交车, 地铁, 车站, 站)
    # =========================================================================
    k1_p1_q4 = make_keys("gongjiaoche")
    k1_p1_q8 = make_keys("ditie")
    k1_p2_q4 = make_keys("chezhan")
    k1_p2_q8 = make_keys("zhan")
    
    stages[1] = {
        "p1": [
            f"""    // 1. Soal 1: Pilihan Gambar (公交车 -> bus umum)
    Exercise(
        id = "u22_s1_p1_q1",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "公交车",
        targetPinyin = "gōngjiāochē",
        targetTranslation = "bus umum",
        correctAnswer = "bus umum",
        audioToSpeak = "公交车",
        pictureOptions = listOf(
            PictureOption("u22_s1_p1_opt1", "bus umum", "", R.drawable.ic_trans_car, true),
            PictureOption("u22_s1_p1_opt2", "taksi", "", R.drawable.ic_trans_taxi, false),
            PictureOption("u22_s1_p1_opt3", "kereta", "", R.drawable.ic_trans_train, false),
            PictureOption("u22_s1_p1_opt4", "stasiun", "", R.drawable.ic_trans_train_station, false)
        )
    )""",
            f"""    // 2. Soal 2: Susun Kalimat (Naik bus umum ke sekolah hanya butuh dua yuan.)
    Exercise(
        id = "u22_s1_p1_q2",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Naik bus ke sekolah hanya dua yuan.",
        targetHanzi = "坐 公交车 去 学校 只要 两 块 钱。",
        targetPinyin = "Zuò gōngjiāochē qù xuéxiào zhǐyào liǎng kuài qián.",
        wordChips = listOf("坐:zuò", "公交车:gōngjiāochē", "去:qù", "学校:xuéxiào", "只要:zhǐyào", "两:liǎng", "块:kuài", "钱。:qián.", "地铁:dìtiě"),
        correctAnswer = "坐,公交车,去,学校,只要,两,块,钱。",
        audioToSpeak = "坐公交车去学校只要两块钱。"
    )""",
            f"""    // 3. Soal 3: Ketuk Pasangan yang Sesuai (Bus & MRT)
    Exercise(
        id = "u22_s1_p1_q3",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u22_s1_p1_m1", "公交车", "gōngjiāochē", "bus umum"),
            MatchPairItem("u22_s1_p1_m2", "地铁", "dìtiě", "MRT / kereta bawah tanah"),
            MatchPairItem("u22_s1_p1_m3", "坐地铁", "zuò dìtiě", "naik MRT"),
            MatchPairItem("u22_s1_p1_m4", "方便", "fāngbiàn", "praktis / nyaman")
        )
    )""",
            f"""    // 4. Soal 4: Ketik Pinyin (bus umum -> gōngjiāochē)
    Exercise(
        id = "u22_s1_p1_q4",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "bus umum",
        sentenceWithBlank = "公交车 (________)",
        targetHanzi = "公交车",
        targetPinyin = "gōngjiāochē",
        correctAnswer = "gongjiaoche",
        keyboardKeys = {k1_p1_q4},
        audioToSpeak = "公交车"
    )""",
            f"""    // 5. Soal 5: Mendengar Kalimat (Rule 10: illustrationRes = 0)
    Exercise(
        id = "u22_s1_p1_q5",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Apa yang Anda dengar?",
        targetTranslation = "Naik MRT ke bandara cepat dan praktis.",
        targetHanzi = "坐 地铁 去 机场 又 快 又 方便。",
        targetPinyin = "Zuò dìtiě qù jīchǎng yòu kuài yòu fāngbiàn.",
        wordChips = listOf("坐:zuò", "地铁:dìtiě", "去:qù", "机场:jīchǎng", "又:yòu", "快:kuài", "方便。:fāngbiàn.", "公交车:gōngjiāochē"),
        correctAnswer = "坐,地铁,去,机场,又,快,又,方便。",
        illustrationRes = 0,
        audioToSpeak = "坐地铁去机场又快又方便。"
    )""",
            f"""    // 6. Soal 6: Pilihan Kalimat
    Exercise(
        id = "u22_s1_p1_q6",
        type = ExerciseType.SENTENCE_CHOICE,
        title = "Pilih terjemahan yang benar",
        targetHanzi = "北京 的 地铁 非常 快。",
        targetPinyin = "Běijīng de dìtiě fēicháng kuài.",
        targetTranslation = "MRT Beijing sangat cepat.",
        correctAnswer = "Běijīng de dìtiě fēicháng kuài.\\n北京 的 地铁 非常 快。",
        options = listOf(
            "Běijīng de dìtiě fēicháng kuài.\\n北京 的 地铁 非常 快。",
            "Běijīng de gōngjiāochē fēicháng kuài.\\n北京 的 公交车 非常 快。",
            "Shànghǎi de dìtiě fēicháng kuài.\\n上海 的 地铁 非常 快。"
        ),
        audioToSpeak = "北京的地铁非常快。"
    )""",
            f"""    // 7. Soal 7: Pilihan Gambar (地铁 -> MRT)
    Exercise(
        id = "u22_s1_p1_q7",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "地铁",
        targetPinyin = "dìtiě",
        targetTranslation = "kereta bawah tanah / MRT",
        correctAnswer = "kereta bawah tanah / MRT",
        audioToSpeak = "地铁",
        pictureOptions = listOf(
            PictureOption("u22_s1_p1_opt7_1", "MRT", "", R.drawable.ic_trans_train, true),
            PictureOption("u22_s1_p1_opt7_2", "bus", "", R.drawable.ic_trans_car, false),
            PictureOption("u22_s1_p1_opt7_3", "taksi", "", R.drawable.ic_trans_taxi, false),
            PictureOption("u22_s1_p1_opt7_4", "stasiun", "", R.drawable.ic_trans_train_station, false)
        )
    )""",
            f"""    // 8. Soal 8: Ketik Pinyin (MRT -> dìtiě)
    Exercise(
        id = "u22_s1_p1_q8",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "kereta bawah tanah / MRT",
        sentenceWithBlank = "地铁 (________)",
        targetHanzi = "地铁",
        targetPinyin = "dìtiě",
        correctAnswer = "ditie",
        keyboardKeys = {k1_p1_q8},
        audioToSpeak = "地铁"
    )""",
            f"""    // 9. Soal 9: Susun Kalimat (Saya setiap hari naik bus pergi bekerja.)
    Exercise(
        id = "u22_s1_p1_q9",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Saya setiap hari naik bus kerja.",
        targetHanzi = "我 每天 坐 公交车 上班。",
        targetPinyin = "Wǒ měitiān zuò gōngjiāochē shàngbān.",
        wordChips = listOf("我:wǒ", "每天:měitiān", "坐:zuò", "公交车:gōngjiāochē", "上班。:shàngbān.", "下班:xiàbān"),
        correctAnswer = "我,每天,坐,公交车,上班。",
        audioToSpeak = "我每天坐公交车上班。"
    )""",
            f"""    // 10. Soal 10: Ketuk Pasangan yang Sesuai (Rangkuman Angkutan Transit)
    Exercise(
        id = "u22_s1_p1_m10",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u22_s1_p1_m10_1", "公交车", "gōngjiāochē", "bus kota"),
            MatchPairItem("u22_s1_p1_m10_2", "地铁", "dìtiě", "MRT"),
            MatchPairItem("u22_s1_p1_m10_3", "飞快", "fēikuài", "sangat cepat"),
            MatchPairItem("u22_s1_p1_m10_4", "上班", "shàngbān", "pergi kerja")
        )
    )"""
        ],
        "p2": [
            f"""    // 1. Soal 1: Pilihan Gambar (车站 -> halte / stasiun bus)
    Exercise(
        id = "u22_s1_p2_q1",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "车站",
        targetPinyin = "chēzhàn",
        targetTranslation = "halte / stasiun",
        correctAnswer = "halte / stasiun",
        audioToSpeak = "车站",
        pictureOptions = listOf(
            PictureOption("u22_s1_p2_opt1", "halte", "", R.drawable.ic_place_station, true),
            PictureOption("u22_s1_p2_opt2", "bus", "", R.drawable.ic_trans_car, false),
            PictureOption("u22_s1_p2_opt3", "taksi", "", R.drawable.ic_trans_taxi, false),
            PictureOption("u22_s1_p2_opt4", "kereta", "", R.drawable.ic_trans_train, false)
        )
    )""",
            f"""    // 2. Soal 2: Susun Kalimat (Kami menunggumu di halte bus.)
    Exercise(
        id = "u22_s1_p2_q2",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Kami menunggumu di halte bus.",
        targetHanzi = "我们 在 车站 等 你。",
        targetPinyin = "Wǒmen zài chēzhàn děng nǐ.",
        wordChips = listOf("我们:wǒmen", "在:zài", "车站:chēzhàn", "等:děng", "你。:nǐ.", "看:kàn"),
        correctAnswer = "我们,在,车站,等,你。",
        audioToSpeak = "我们在车站等你。"
    )""",
            f"""    // 3. Soal 3: Ketuk Pasangan yang Sesuai (Halte & Perhentian Stasiun)
    Exercise(
        id = "u22_s1_p2_m3",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u22_s1_p2_m1", "车站", "chēzhàn", "halte / stasiun"),
            MatchPairItem("u22_s1_p2_m2", "站", "zhàn", "perhentian halte"),
            MatchPairItem("u22_s1_p2_m3", "下一站", "xià yí zhàn", "halte berikutnya"),
            MatchPairItem("u22_s1_p2_m4", "等你", "děng nǐ", "menunggumu")
        )
    )""",
            f"""    // 4. Soal 4: Ketik Pinyin (halte/stasiun -> chēzhàn)
    Exercise(
        id = "u22_s1_p2_q4",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "halte / stasiun",
        sentenceWithBlank = "车站 (________)",
        targetHanzi = "车站",
        targetPinyin = "chēzhàn",
        correctAnswer = "chezhan",
        keyboardKeys = {k1_p2_q4},
        audioToSpeak = "车站"
    )""",
            f"""    // 5. Soal 5: Mendengar Kalimat (Rule 10: illustrationRes = 0)
    Exercise(
        id = "u22_s1_p2_q5",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Apa yang Anda dengar?",
        targetTranslation = "Perhentian berikutnya adalah pusat kota.",
        targetHanzi = "下 一 站 是 市中心。",
        targetPinyin = "Xià yí zhàn shì shìzhōngxīn.",
        wordChips = listOf("下:xià", "一:yí", "站:zhàn", "是:shì", "市中心。:shìzhōngxīn.", "学校:xuéxiào"),
        correctAnswer = "下,一,站,是,市中心。",
        illustrationRes = 0,
        audioToSpeak = "下一站是市中心。"
    )""",
            f"""    // 6. Soal 6: Pilihan Kalimat
    Exercise(
        id = "u22_s1_p2_q6",
        type = ExerciseType.SENTENCE_CHOICE,
        title = "Pilih terjemahan yang benar",
        targetHanzi = "去 机场 还 要 坐 几 站？",
        targetPinyin = "Qù jīchǎng hái yào zuò jǐ zhàn?",
        targetTranslation = "Pergi ke bandara masih harus naik berapa perhentian halte?",
        correctAnswer = "Qù jīchǎng hái yào zuò jǐ zhàn?\\n去 机场 还 要 坐 几 站？",
        options = listOf(
            "Qù jīchǎng hái yào zuò jǐ zhàn?\\n去 机场 还 要 坐 几 站？",
            "Qù xuéxiào hái yào zuò jǐ zhàn?\\n去 学校 还 要 坐 几 站？",
            "Qù yīyuàn hái yào zuò jǐ zhàn?\\n去 医院 还 要 坐 几 站？"
        ),
        audioToSpeak = "去机场还要坐几站？"
    )""",
            f"""    // 7. Soal 7: Pilihan Gambar (站 -> perhentian halte)
    Exercise(
        id = "u22_s1_p2_q7",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "站",
        targetPinyin = "zhàn",
        targetTranslation = "stasiun / halte",
        correctAnswer = "stasiun / halte",
        audioToSpeak = "站",
        pictureOptions = listOf(
            PictureOption("u22_s1_p2_opt7_1", "halte", "", R.drawable.ic_place_station, true),
            PictureOption("u22_s1_p2_opt2", "kereta", "", R.drawable.ic_trans_train, false),
            PictureOption("u22_s1_p2_opt3", "mobil", "", R.drawable.ic_trans_car, false),
            PictureOption("u22_s1_p2_opt4", "taksi", "", R.drawable.ic_trans_taxi, false)
        )
    )""",
            f"""    // 8. Soal 8: Ketik Pinyin (stasiun/halte -> zhàn)
    Exercise(
        id = "u22_s1_p2_q8",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "stasiun / halte",
        sentenceWithBlank = "站 (________)",
        targetHanzi = "站",
        targetPinyin = "zhàn",
        correctAnswer = "zhan",
        keyboardKeys = {k1_p2_q8},
        audioToSpeak = "站"
    )""",
            f"""    // 9. Soal 9: Susun Kalimat (Masih ada tiga halte lagi.)
    Exercise(
        id = "u22_s1_p2_q9",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Masih ada tiga halte lagi.",
        targetHanzi = "还有 三 站 路。",
        targetPinyin = "Hái yǒu sān zhàn lù.",
        wordChips = listOf("还有:hái yǒu", "三:sān", "站:zhàn", "路。:lù.", "四:sì"),
        correctAnswer = "还有,三,站,路。",
        audioToSpeak = "还有三站路。"
    )""",
            f"""    // 10. Soal 10: Ketuk Pasangan yang Sesuai (Rangkuman Halte & Stasiun)
    Exercise(
        id = "u22_s1_p2_m10",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u22_s1_p2_m10_1", "车站", "chēzhàn", "halte"),
            MatchPairItem("u22_s1_p2_m10_2", "下一站", "xià yí zhàn", "halte berikut"),
            MatchPairItem("u22_s1_p2_m10_3", "坐三站", "zuò sān zhàn", "naik 3 halte"),
            MatchPairItem("u22_s1_p2_m10_4", "到站", "dào zhàn", "tiba di halte")
        )
    )"""
        ]
    }

    # =========================================================================
    # STAGE 2: Memanggil Taksi & Perjalanan Jalan Kaki (打车, 走, 走路)
    # =========================================================================
    k2_p1_q4 = make_keys("dache")
    k2_p1_q8 = make_keys("zou")
    k2_p2_q4 = make_keys("zoulu")
    k2_p2_q8 = make_keys("kuaiqu")
    
    stages[2] = {
        "p1": [
            f"""    // 1. Soal 1: Pilihan Gambar (打车 -> naik taksi)
    Exercise(
        id = "u22_s2_p1_q1",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "打车",
        targetPinyin = "dǎchē",
        targetTranslation = "naik taksi",
        correctAnswer = "naik taksi",
        audioToSpeak = "打车",
        pictureOptions = listOf(
            PictureOption("u22_s2_p1_opt1", "naik taksi", "", R.drawable.ic_trans_taxi, true),
            PictureOption("u22_s2_p1_opt2", "bus", "", R.drawable.ic_trans_car, false),
            PictureOption("u22_s2_p1_opt3", "kereta", "", R.drawable.ic_trans_train, false),
            PictureOption("u22_s2_p1_opt4", "halte", "", R.drawable.ic_place_station, false)
        )
    )""",
            f"""    // 2. Soal 2: Susun Kalimat (Hari ini hujan lebat, mari kita naik taksi.)
    Exercise(
        id = "u22_s2_p1_q2",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Hari ini hujan lebat, ayo naik taksi.",
        targetHanzi = "今天 下大雨， 我们 打车 吧。",
        targetPinyin = "Jīntiān xià dàyǔ, wǒmen dǎchē ba.",
        wordChips = listOf("今天:jīntiān", "下大雨，:xià dàyǔ,", "我们:wǒmen", "打车:dǎchē", "吧。:ba.", "走路:zǒulù"),
        correctAnswer = "今天,下大雨，,我们,打车,吧。",
        audioToSpeak = "今天下大雨，我们打车吧。"
    )""",
            f"""    // 3. Soal 3: Ketuk Pasangan yang Sesuai (Taksi & Berjalan)
    Exercise(
        id = "u22_s2_p1_q3",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u22_s2_p1_m1", "打车", "dǎchē", "naik taksi"),
            MatchPairItem("u22_s2_p1_m2", "走", "zǒu", "berjalan / pergi"),
            MatchPairItem("u22_s2_p1_m3", "下大雨", "xià dàyǔ", "hujan deras"),
            MatchPairItem("u22_s2_p1_m4", "太晚了", "tài wǎn le", "terlalu malam")
        )
    )""",
            f"""    // 4. Soal 4: Ketik Pinyin (naik taksi -> dǎchē)
    Exercise(
        id = "u22_s2_p1_q4",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "naik taksi",
        sentenceWithBlank = "打车 (________)",
        targetHanzi = "打车",
        targetPinyin = "dǎchē",
        correctAnswer = "dache",
        keyboardKeys = {k2_p1_q4},
        audioToSpeak = "打车"
    )""",
            f"""    // 5. Soal 5: Mendengar Kalimat (Rule 10: illustrationRes = 0)
    Exercise(
        id = "u22_s2_p1_q5",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Apa yang Anda dengar?",
        targetTranslation = "Waktu sudah larut, saya harus pergi.",
        targetHanzi = "时间 不 早 了， 我 得 走 了。",
        targetPinyin = "Shíjiān bù zǎo le, wǒ děi zǒu le.",
        wordChips = listOf("时间:shíjiān", "不:bù", "早:zǎo", "了，:le,", "我:wǒ", "得:děi", "走:zǒu", "了。:le."),
        correctAnswer = "时间,不,早,了，,我,得,走,了。",
        illustrationRes = 0,
        audioToSpeak = "时间不早了，我得走了。"
    )""",
            f"""    // 6. Soal 6: Pilihan Kalimat
    Exercise(
        id = "u22_s2_p1_q6",
        type = ExerciseType.SENTENCE_CHOICE,
        title = "Pilih terjemahan yang benar",
        targetHanzi = "打车 去 机场 要 一百 块。",
        targetPinyin = "Dǎchē qù jīchǎng yào yìbǎi kuài.",
        targetTranslation = "Naik taksi ke bandara butuh seratus yuan.",
        correctAnswer = "Dǎchē qù jīchǎng yào yìbǎi kuài.\\n打车 去 机场 要 一百 块。",
        options = listOf(
            "Dǎchē qù jīchǎng yào yìbǎi kuài.\\n打车 去 机场 要 一百 块。",
            "Zuò dìtiě qù jīchǎng yào yìbǎi kuài.\\n坐 地铁 去 机场 要 一百 块。",
            "Dǎchē qù xuéxiào yào yìbǎi kuài.\\n打车 去 学校 要 一百 块。"
        ),
        audioToSpeak = "打车去机场要一百块。"
    )""",
            f"""    // 7. Soal 7: Pilihan Gambar (走 -> berjalan)
    Exercise(
        id = "u22_s2_p1_q7",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "走",
        targetPinyin = "zǒu",
        targetTranslation = "berjalan",
        correctAnswer = "berjalan",
        audioToSpeak = "走",
        pictureOptions = listOf(
            PictureOption("u22_s2_p1_opt7_1", "berjalan", "", R.drawable.ic_pos_front, true),
            PictureOption("u22_s2_p1_opt7_2", "mobil", "", R.drawable.ic_trans_car, false),
            PictureOption("u22_s2_p1_opt7_3", "taksi", "", R.drawable.ic_trans_taxi, false),
            PictureOption("u22_s2_p1_opt7_4", "kereta", "", R.drawable.ic_trans_train, false)
        )
    )""",
            f"""    // 8. Soal 8: Ketik Pinyin (berjalan -> zǒu)
    Exercise(
        id = "u22_s2_p1_q8",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "berjalan / pergi",
        sentenceWithBlank = "走 (________)",
        targetHanzi = "走",
        targetPinyin = "zǒu",
        correctAnswer = "zou",
        keyboardKeys = {k2_p1_q8},
        audioToSpeak = "走"
    )""",
            f"""    // 9. Soal 9: Susun Kalimat (Ayo kita berjalan kaki bersama.)
    Exercise(
        id = "u22_s2_p1_q9",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Mari kita jalan bersama.",
        targetHanzi = "我们 一起 走 吧。",
        targetPinyin = "Wǒmen yìqǐ zǒu ba.",
        wordChips = listOf("我们:wǒmen", "一起:yìqǐ", "走:zǒu", "吧。:ba.", "坐:zuò"),
        correctAnswer = "我们,一起,走,吧。",
        audioToSpeak = "我们一起走吧。"
    )""",
            f"""    // 10. Soal 10: Ketuk Pasangan yang Sesuai (Rangkuman Mobilitas Taksi)
    Exercise(
        id = "u22_s2_p1_m10",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u22_s2_p1_m10_1", "打车", "dǎchē", "naik taksi"),
            MatchPairItem("u22_s2_p1_m2", "走吧", "zǒu ba", "mari pergi"),
            MatchPairItem("u22_s2_p1_m3", "一百块", "yìbǎi kuài", "seratus yuan"),
            MatchPairItem("u22_s2_p1_m4", "太晚了", "tài wǎn le", "terlambat")
        )
    )"""
        ],
        "p2": [
            f"""    // 1. Soal 1: Pilihan Gambar (走路 -> berjalan kaki)
    Exercise(
        id = "u22_s2_p2_q1",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "走路",
        targetPinyin = "zǒulù",
        targetTranslation = "berjalan kaki",
        correctAnswer = "berjalan kaki",
        audioToSpeak = "走路",
        pictureOptions = listOf(
            PictureOption("u22_s2_p2_opt1", "jalan kaki", "", R.drawable.ic_pos_front, true),
            PictureOption("u22_s2_p2_opt2", "taksi", "", R.drawable.ic_trans_taxi, false),
            PictureOption("u22_s2_p2_opt3", "kereta", "", R.drawable.ic_trans_train, false),
            PictureOption("u22_s2_p2_opt4", "bus", "", R.drawable.ic_trans_car, false)
        )
    )""",
            f"""    // 2. Soal 2: Susun Kalimat (Saya setiap hari berjalan kaki ke perusahaan.)
    Exercise(
        id = "u22_s2_p2_q2",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Saya setiap hari jalan kaki kerja.",
        targetHanzi = "我 每天 走路 去 公司 上班。",
        targetPinyin = "Wǒ měitiān zǒulù qù gōngsī shàngbān.",
        wordChips = listOf("我:wǒ", "每天:měitiān", "走路:zǒulù", "去:qù", "公司:gōngsī", "上班。:shàngbān.", "打车:dǎchē"),
        correctAnswer = "我,每天,走路,去,公司,上班。",
        audioToSpeak = "我每天走路去公司上班。"
    )""",
            f"""    // 3. Soal 3: Ketuk Pasangan yang Sesuai (Jalan Kaki & Olahraga)
    Exercise(
        id = "u22_s2_p2_m3",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u22_s2_p2_m1", "走路", "zǒulù", "berjalan kaki"),
            MatchPairItem("u22_s2_p2_m2", "跑步", "pǎobù", "berlari / jogging"),
            MatchPairItem("u22_s2_p2_m3", "去上班", "qù shàngbān", "pergi kerja"),
            MatchPairItem("u22_s2_p2_m4", "很健康", "hěn jiànkāng", "sangat sehat")
        )
    )""",
            f"""    // 4. Soal 4: Ketik Pinyin (berjalan kaki -> zǒulù)
    Exercise(
        id = "u22_s2_p2_q4",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "berjalan kaki",
        sentenceWithBlank = "走路 (________)",
        targetHanzi = "走路",
        targetPinyin = "zǒulù",
        correctAnswer = "zoulu",
        keyboardKeys = {k2_p2_q4},
        audioToSpeak = "走路"
    )""",
            f"""    // 5. Soal 5: Mendengar Kalimat (Rule 10: illustrationRes = 0)
    Exercise(
        id = "u22_s2_p2_q5",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Apa yang Anda dengar?",
        targetTranslation = "Banyak berjalan kaki sangat baik untuk kesehatan.",
        targetHanzi = "多 走路 对 身体 很 好。",
        targetPinyin = "Duō zǒulù duì shēntǐ hěn hǎo.",
        wordChips = listOf("多:duō", "走路:zǒulù", "对:duì", "身体:shēntǐ", "很:hěn", "好。:hǎo.", "少:shǎo"),
        correctAnswer = "多,走路,对,身体,很,好。",
        illustrationRes = 0,
        audioToSpeak = "多走路对身体很好。"
    )""",
            f"""    // 6. Soal 6: Pilihan Kalimat
    Exercise(
        id = "u22_s2_p2_q6",
        type = ExerciseType.SENTENCE_CHOICE,
        title = "Pilih terjemahan yang benar",
        targetHanzi = "从 这里 走路 去 学校 只要 五 分钟。",
        targetPinyin = "Cóng zhèlǐ zǒulù qù xuéxiào zhǐyào wǔ fēnzhōng.",
        targetTranslation = "Dari sini berjalan kaki ke sekolah hanya butuh lima menit.",
        correctAnswer = "Cóng zhèlǐ zǒulù qù xuéxiào zhǐyào wǔ fēnzhōng.\\n从 这里 走路 去 学校 只要 五 分钟。",
        options = listOf(
            "Cóng zhèlǐ zǒulù qù xuéxiào zhǐyào wǔ fēnzhōng.\\n从 这里 走路 去 学校 只要 五 分钟。",
            "Cóng zhèlǐ dǎchē qù xuéxiào zhǐyào wǔ fēnzhōng.\\n从 这里 打车 去 学校 只要 五 分钟。",
            "Cóng zhèlǐ zǒulù qù yīyuàn zhǐyào wǔ fēnzhōng.\\n从 这里 走路 去 医院 只要 五 分钟。"
        ),
        audioToSpeak = "从这里走路去学校只要五分钟。"
    )""",
            f"""    // 7. Soal 7: Pilihan Gambar (走路 -> berjalan kaki santai)
    Exercise(
        id = "u22_s2_p2_q7",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "走路",
        targetPinyin = "zǒulù",
        targetTranslation = "berjalan kaki",
        correctAnswer = "berjalan kaki",
        audioToSpeak = "走路",
        pictureOptions = listOf(
            PictureOption("u22_s2_p2_opt7_1", "jalan kaki", "", R.drawable.ic_pos_front, true),
            PictureOption("u22_s2_p2_opt7_2", "mobil", "", R.drawable.ic_trans_car, false),
            PictureOption("u22_s2_p2_opt7_3", "taksi", "", R.drawable.ic_trans_taxi, false),
            PictureOption("u22_s2_p2_opt7_4", "kereta", "", R.drawable.ic_trans_train, false)
        )
    )""",
            f"""    // 8. Soal 8: Ketik Pinyin (berjalan kaki -> zǒulù)
    Exercise(
        id = "u22_s2_p2_q8",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "berjalan kaki",
        sentenceWithBlank = "走路 (________)",
        targetHanzi = "走路",
        targetPinyin = "zǒulù",
        correctAnswer = "zoulu",
        keyboardKeys = {k2_p2_q4},
        audioToSpeak = "走路"
    )""",
            f"""    // 9. Soal 9: Susun Kalimat (Kakek berjalan kaki sangat perlahan.)
    Exercise(
        id = "u22_s2_p2_q9",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Kakek berjalan kaki sangat pelan.",
        targetHanzi = "爷爷 走路 走 得 很 慢。",
        targetPinyin = "Yéye zǒulù zǒu de hěn màn.",
        wordChips = listOf("爷爷:yéye", "走路:zǒulù", "走:zǒu", "得:de", "很:hěn", "慢。:màn.", "快:kuài"),
        correctAnswer = "爷爷,走路,走,得,很,慢。",
        audioToSpeak = "爷爷走路走得很慢。"
    )""",
            f"""    // 10. Soal 10: Ketuk Pasangan yang Sesuai (Rangkuman Gaya Hidup Jalan Kaki)
    Exercise(
        id = "u22_s2_p2_m10",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u22_s2_p2_m10_1", "走路", "zǒulù", "jalan kaki"),
            MatchPairItem("u22_s2_p2_m2", "五分钟", "wǔ fēnzhōng", "lima menit"),
            MatchPairItem("u22_s2_p2_m3", "走得很慢", "zǒu de hěn màn", "jalan pelan"),
            MatchPairItem("u22_s2_p2_m4", "多走路", "duō zǒulù", "sering jalan")
        )
    )"""
        ]
    }

    # =========================================================================
    # STAGE 3: Kondisi Lalu Lintas & Di Tengah Jalan (路, 路上)
    # =========================================================================
    k3_p1_q4 = make_keys("lu")
    k3_p1_q8 = make_keys("dalu")
    k3_p2_q4 = make_keys("lushang")
    k3_p2_q8 = make_keys("xiaoxin")
    
    stages[3] = {
        "p1": [
            f"""    // 1. Soal 1: Pilihan Gambar (路 -> jalan / rute)
    Exercise(
        id = "u22_s3_p1_q1",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "路",
        targetPinyin = "lù",
        targetTranslation = "jalan / rute",
        correctAnswer = "jalan / rute",
        audioToSpeak = "路",
        pictureOptions = listOf(
            PictureOption("u22_s3_p1_opt1", "jalan", "", R.drawable.ic_pos_front, true),
            PictureOption("u22_s3_p1_opt2", "mobil", "", R.drawable.ic_trans_car, false),
            PictureOption("u22_s3_p1_opt3", "stasiun", "", R.drawable.ic_place_station, false),
            PictureOption("u22_s3_p1_opt4", "gedung", "", R.drawable.ic_work_office_building, false)
        )
    )""",
            f"""    // 2. Soal 2: Susun Kalimat (Mobil di jalan ini sangat banyak.)
    Exercise(
        id = "u22_s3_p1_q2",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Mobil di jalan ini sangat banyak.",
        targetHanzi = "这条 路 上的 车 非常 多。",
        targetPinyin = "Zhè tiáo lù shang de chē fēicháng duō.",
        wordChips = listOf("这条:zhè tiáo", "路:lù", "上的:shang de", "车:chē", "非常:fēicháng", "多。:duō.", "少:shǎo"),
        correctAnswer = "这条,路,上的,车,非常,多。",
        audioToSpeak = "这条路上的车非常多。"
    )""",
            f"""    // 3. Soal 3: Ketuk Pasangan yang Sesuai (Jalan Raya)
    Exercise(
        id = "u22_s3_p1_q3",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u22_s3_p1_m1", "路", "lù", "jalan"),
            MatchPairItem("u22_s3_p1_m2", "大路", "dà lù", "jalan raya besar"),
            MatchPairItem("u22_s3_p1_m3", "迷路", "mí lù", "tersesat jalan"),
            MatchPairItem("u22_s3_p1_m4", "很多车", "hěn duō chē", "banyak mobil")
        )
    )""",
            f"""    // 4. Soal 4: Ketik Pinyin (jalan -> lù)
    Exercise(
        id = "u22_s3_p1_q4",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "jalan / rute",
        sentenceWithBlank = "路 (________)",
        targetHanzi = "路",
        targetPinyin = "lù",
        correctAnswer = "lu",
        keyboardKeys = {k3_p1_q4},
        audioToSpeak = "路"
    )""",
            f"""    // 5. Soal 5: Mendengar Kalimat (Rule 10: illustrationRes = 0)
    Exercise(
        id = "u22_s3_p1_q5",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Apa yang Anda dengar?",
        targetTranslation = "Di depan ada sebuah jalan yang sangat lebar.",
        targetHanzi = "前面 有 一 条 大 路。",
        targetPinyin = "Qiánmiàn yǒu yì tiáo dà lù.",
        wordChips = listOf("前面:qiánmiàn", "有:yǒu", "一:yì", "条:tiáo", "大:dà", "路。:lù.", "后面:hòumiàn"),
        correctAnswer = "前面,有,一,条,大,路。",
        illustrationRes = 0,
        audioToSpeak = "前面有一条大路。"
    )""",
            f"""    // 6. Soal 6: Pilihan Kalimat
    Exercise(
        id = "u22_s3_p1_q6",
        type = ExerciseType.SENTENCE_CHOICE,
        title = "Pilih terjemahan yang benar",
        targetHanzi = "去 饭馆 走 哪条 路？",
        targetPinyin = "Qù fànguǎn zǒu nǎ tiáo lù?",
        targetTranslation = "Pergi ke restoran lewat jalan yang mana?",
        correctAnswer = "Qù fànguǎn zǒu nǎ tiáo lù?\\n去 饭馆 走 哪条 路？",
        options = listOf(
            "Qù fànguǎn zǒu nǎ tiáo lù?\\n去 饭馆 走 哪条 路？",
            "Qù xuéxiào zǒu nǎ tiáo lù?\\n去 学校 走 哪条 路？",
            "Qù yīyuàn zǒu nǎ tiáo lù?\\n去 医院 走 哪条 路？"
        ),
        audioToSpeak = "去饭馆走哪条路？"
    )""",
            f"""    // 7. Soal 7: Pilihan Gambar (大路 -> jalan raya)
    Exercise(
        id = "u22_s3_p1_q7",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "大路",
        targetPinyin = "dàlù",
        targetTranslation = "jalan raya",
        correctAnswer = "jalan raya",
        audioToSpeak = "大路",
        pictureOptions = listOf(
            PictureOption("u22_s3_p1_opt7_1", "jalan", "", R.drawable.ic_pos_front, true),
            PictureOption("u22_s3_p1_opt7_2", "mobil", "", R.drawable.ic_trans_car, false),
            PictureOption("u22_s3_p1_opt7_3", "gedung", "", R.drawable.ic_work_office_building, false),
            PictureOption("u22_s3_p1_opt7_4", "stasiun", "", R.drawable.ic_place_station, false)
        )
    )""",
            f"""    // 8. Soal 8: Ketik Pinyin (jalan raya -> dàlù)
    Exercise(
        id = "u22_s3_p1_q8",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "jalan raya",
        sentenceWithBlank = "大路 (________)",
        targetHanzi = "大路",
        targetPinyin = "dàlù",
        correctAnswer = "dalu",
        keyboardKeys = {k3_p1_q8},
        audioToSpeak = "大路"
    )""",
            f"""    // 9. Soal 9: Susun Kalimat (Jalan ini sangat bersih.)
    Exercise(
        id = "u22_s3_p1_q9",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Jalan ini sangat bersih.",
        targetHanzi = "这条 路 很 干净。",
        targetPinyin = "Zhè tiáo lù hěn gānjìng.",
        wordChips = listOf("这条:zhè tiáo", "路:lù", "很:hěn", "干净。:gānjìng.", "脏:zāng"),
        correctAnswer = "这条,路,很,干净。",
        audioToSpeak = "这条路很干净。"
    )""",
            f"""    // 10. Soal 10: Ketuk Pasangan yang Sesuai (Rangkuman Kondisi Jalan)
    Exercise(
        id = "u22_s3_p1_m10",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u22_s3_p1_m10_1", "路", "lù", "jalan"),
            MatchPairItem("u22_s3_p1_m2", "大路", "dà lù", "jalan raya"),
            MatchPairItem("u22_s3_p1_m3", "干净路", "gānjìng lù", "jalan bersih"),
            MatchPairItem("u22_s3_p1_m4", "走哪条", "zǒu nǎ tiáo", "lewat mana")
        )
    )"""
        ],
        "p2": [
            f"""    // 1. Soal 1: Pilihan Gambar (路上 -> di jalan / dalam perjalanan)
    Exercise(
        id = "u22_s3_p2_q1",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "路上",
        targetPinyin = "lùshang",
        targetTranslation = "di jalan / dalam perjalanan",
        correctAnswer = "di jalan / dalam perjalanan",
        audioToSpeak = "路上",
        pictureOptions = listOf(
            PictureOption("u22_s3_p2_opt1", "di jalan", "", R.drawable.ic_pos_front, true),
            PictureOption("u22_s3_p2_opt2", "mobil", "", R.drawable.ic_trans_car, false),
            PictureOption("u22_s3_p2_opt3", "stasiun", "", R.drawable.ic_place_station, false),
            PictureOption("u22_s3_p2_opt4", "gedung", "", R.drawable.ic_work_office_building, false)
        )
    )""",
            f"""    // 2. Soal 2: Susun Kalimat (Saya di tengah jalan bertemu dengan teman sekolah lama.)
    Exercise(
        id = "u22_s3_p2_q2",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Saya di jalan bertemu kawan lama.",
        targetHanzi = "我 在 路上 遇到 老 同学。",
        targetPinyin = "Wǒ zài lùshang yùdào lǎo tóngxué.",
        wordChips = listOf("我:wǒ", "在:zài", "路上:lùshang", "遇到:yùdào", "老:lǎo", "同学。:tóngxué.", "老师:lǎoshī"),
        correctAnswer = "我,在,路上,遇到,老,同学。",
        audioToSpeak = "我在路上遇到老同学。"
    )""",
            f"""    // 3. Soal 3: Ketuk Pasangan yang Sesuai (Dalam Perjalanan)
    Exercise(
        id = "u22_s3_p2_m3",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u22_s3_p2_m1", "路上", "lùshang", "di jalan"),
            MatchPairItem("u22_s3_p2_m2", "小心", "xiǎoxīn", "hati-hati"),
            MatchPairItem("u22_s3_p2_m3", "遇到", "yùdào", "bertemu"),
            MatchPairItem("u22_s3_p2_m4", "堵车", "dǔchē", "macet jalan")
        )
    )""",
            f"""    // 4. Soal 4: Ketik Pinyin (di jalan -> lùshang)
    Exercise(
        id = "u22_s3_p2_q4",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "di jalan / dalam perjalanan",
        sentenceWithBlank = "路上 (________)",
        targetHanzi = "路上",
        targetPinyin = "lùshang",
        correctAnswer = "lushang",
        keyboardKeys = {k3_p2_q4},
        audioToSpeak = "路上"
    )""",
            f"""    // 5. Soal 5: Mendengar Kalimat (Rule 10: illustrationRes = 0)
    Exercise(
        id = "u22_s3_p2_q5",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Apa yang Anda dengar?",
        targetTranslation = "Hati-hati di jalan ya!",
        targetHanzi = "路上 小心 点儿！",
        targetPinyin = "Lùshang xiǎoxīn diǎnr!",
        wordChips = listOf("路上:lùshang", "小心:xiǎoxīn", "点儿！:diǎnr!", "快:kuài"),
        correctAnswer = "路上,小心,点儿！",
        illustrationRes = 0,
        audioToSpeak = "路上小心点儿！"
    )""",
            f"""    // 6. Soal 6: Pilihan Kalimat
    Exercise(
        id = "u22_s3_p2_q6",
        type = ExerciseType.SENTENCE_CHOICE,
        title = "Pilih terjemahan yang benar",
        targetHanzi = "我 在 回家 的 路上。",
        targetPinyin = "Wǒ zài huíjiā de lùshang.",
        targetTranslation = "Saya sedang dalam perjalanan pulang ke rumah.",
        correctAnswer = "Wǒ zài huíjiā de lùshang.\\n我 在 回家 的 路上。",
        options = listOf(
            "Wǒ zài huíjiā de lùshang.\\n我 在 回家 的 路上。",
            "Wǒ zài qù xuéxiào de lùshang.\\n我 在 去 学校 的 路上。",
            "Wǒ yǐjīng dào jiā le.\\n我 已经 到 家 了。"
        ),
        audioToSpeak = "我在回家的路上。"
    )""",
            f"""    // 7. Soal 7: Pilihan Gambar (路上小心 -> hati-hati di jalan)
    Exercise(
        id = "u22_s3_p2_q7",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "路上小心",
        targetPinyin = "lùshang xiǎoxīn",
        targetTranslation = "hati-hati di jalan",
        correctAnswer = "hati-hati di jalan",
        audioToSpeak = "路上小心",
        pictureOptions = listOf(
            PictureOption("u22_s3_p2_opt7_1", "di jalan", "", R.drawable.ic_pos_front, true),
            PictureOption("u22_s3_p2_opt7_2", "mobil", "", R.drawable.ic_trans_car, false),
            PictureOption("u22_s3_p2_opt7_3", "stasiun", "", R.drawable.ic_place_station, false),
            PictureOption("u22_s3_p2_opt7_4", "gedung", "", R.drawable.ic_work_office_building, false)
        )
    )""",
            f"""    // 8. Soal 8: Ketik Pinyin (hati-hati -> xiǎoxīn)
    Exercise(
        id = "u22_s3_p2_q8",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "hati-hati",
        sentenceWithBlank = "小心 (________)",
        targetHanzi = "小心",
        targetPinyin = "xiǎoxīn",
        correctAnswer = "xiaoxin",
        keyboardKeys = {k3_p2_q8},
        audioToSpeak = "小心"
    )""",
            f"""    // 9. Soal 9: Susun Kalimat (Di jalan mobil sangat padat macet.)
    Exercise(
        id = "u22_s3_p2_q9",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Mobil di jalan sangat banyak.",
        targetHanzi = "路上 车 很多。",
        targetPinyin = "Lùshang chē hěn duō.",
        wordChips = listOf("路上:lùshang", "车:chē", "很多。:hěn duō.", "很少:hěn shǎo"),
        correctAnswer = "路上,车,很多。",
        audioToSpeak = "路上车很多。"
    )""",
            f"""    // 10. Soal 10: Ketuk Pasangan yang Sesuai (Rangkuman Perjalanan Jalan)
    Exercise(
        id = "u22_s3_p2_m10",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u22_s3_p2_m10_1", "路上", "lùshang", "di jalan"),
            MatchPairItem("u22_s3_p2_m10_2", "回家路上", "huíjiā lùshang", "jalan pulang"),
            MatchPairItem("u22_s3_p2_m10_3", "路上小心", "lùshang xiǎoxīn", "hati-hati jalan"),
            MatchPairItem("u22_s3_p2_m10_4", "很多车", "hěn duō chē", "banyak mobil")
        )
    )"""
        ]
    }

    # =========================================================================
    # STAGE 4: Jarak Spasial, Kecepatan & Panduan Arah (离, 远, 近, 快, 慢, 往)
    # =========================================================================
    k4_p1_q4 = make_keys("li")
    k4_p1_q8 = make_keys("yuan")
    k4_p2_q4 = make_keys("jin")
    k4_p2_q8 = make_keys("wang")
    
    stages[4] = {
        "p1": [
            f"""    // 1. Soal 1: Pilihan Gambar (远 -> jauh)
    Exercise(
        id = "u22_s4_p1_q1",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "远",
        targetPinyin = "yuǎn",
        targetTranslation = "jauh",
        correctAnswer = "jauh",
        audioToSpeak = "远",
        pictureOptions = listOf(
            PictureOption("u22_s4_p1_opt1", "jauh", "", R.drawable.ic_pos_front, true),
            PictureOption("u22_s4_p1_opt2", "mobil", "", R.drawable.ic_trans_car, false),
            PictureOption("u22_s4_p1_opt3", "stasiun", "", R.drawable.ic_place_station, false),
            PictureOption("u22_s4_p1_opt4", "gedung", "", R.drawable.ic_work_office_building, false)
        )
    )""",
            f"""    // 2. Soal 2: Susun Kalimat (Rumah saya berjarak sangat dekat dari kantor.)
    Exercise(
        id = "u22_s4_p1_q2",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Rumah saya dekat dari kantor.",
        targetHanzi = "我家 离 公司 很 近。",
        targetPinyin = "Wǒ jiā lí gōngsī hěn jìn.",
        wordChips = listOf("我家:wǒ jiā", "离:lí", "公司:gōngsī", "很:hěn", "近。:jìn.", "远:yuǎn"),
        correctAnswer = "我家,离,公司,很,近。",
        audioToSpeak = "我家离公司很近。"
    )""",
            f"""    // 3. Soal 3: Ketuk Pasangan yang Sesuai (Jarak Jauh vs Dekat)
    Exercise(
        id = "u22_s4_p1_q3",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u22_s4_p1_m1", "离", "lí", "berjarak dari"),
            MatchPairItem("u22_s4_p1_m2", "远", "yuǎn", "jauh"),
            MatchPairItem("u22_s4_p1_m3", "近", "jìn", "dekat"),
            MatchPairItem("u22_s4_p1_m4", "太远了", "tài yuǎn le", "terlalu jauh")
        )
    )""",
            f"""    // 4. Soal 4: Ketik Pinyin (berjarak dari -> lí)
    Exercise(
        id = "u22_s4_p1_q4",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "berjarak dari / terpisah dari",
        sentenceWithBlank = "离 (________)",
        targetHanzi = "离",
        targetPinyin = "lí",
        correctAnswer = "li",
        keyboardKeys = {k4_p1_q4},
        audioToSpeak = "离"
    )""",
            f"""    // 5. Soal 5: Mendengar Kalimat (Rule 10: illustrationRes = 0)
    Exercise(
        id = "u22_s4_p1_q5",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Apa yang Anda dengar?",
        targetTranslation = "Restoran itu terlalu jauh, jangan pergi ke sana.",
        targetHanzi = "那个 饭馆 太 远 了， 别 去 了。",
        targetPinyin = "Nàge fànguǎn tài yuǎn le, bié qù le.",
        wordChips = listOf("那个:nàge", "饭馆:fànguǎn", "太:tài", "远:yuǎn", "了，:le,", "别:bié", "去:qù", "了。:le."),
        correctAnswer = "那个,饭馆,太,远,了，,别,去,了。",
        illustrationRes = 0,
        audioToSpeak = "那个饭馆太远了，别去了。"
    )""",
            f"""    // 6. Soal 6: Pilihan Kalimat
    Exercise(
        id = "u22_s4_p1_q6",
        type = ExerciseType.SENTENCE_CHOICE,
        title = "Pilih terjemahan yang benar",
        targetHanzi = "学校 离 超市 很 近。",
        targetPinyin = "Xuéxiào lí chāoshì hěn jìn.",
        targetTranslation = "Sekolah berjarak sangat dekat dari supermarket.",
        correctAnswer = "Xuéxiào lí chāoshì hěn jìn.\\n学校 离 超市 很 近。",
        options = listOf(
            "Xuéxiào lí chāoshì hěn jìn.\\n学校 离 超市 很 近。",
            "Xuéxiào lí chāoshì hěn yuǎn.\\n学校 离 超市 很 远。",
            "Xuéxiào lí yīyuàn hěn jìn.\\n学校 离 医院 很 近。"
        ),
        audioToSpeak = "学校离超市很近。"
    )""",
            f"""    // 7. Soal 7: Pilihan Gambar (近 -> dekat)
    Exercise(
        id = "u22_s4_p1_q7",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "近",
        targetPinyin = "jìn",
        targetTranslation = "dekat",
        correctAnswer = "dekat",
        audioToSpeak = "近",
        pictureOptions = listOf(
            PictureOption("u22_s4_p1_opt7_1", "dekat", "", R.drawable.ic_pos_arrive, true),
            PictureOption("u22_s4_p1_opt7_2", "mobil", "", R.drawable.ic_trans_car, false),
            PictureOption("u22_s4_p1_opt7_3", "gedung", "", R.drawable.ic_work_office_building, false),
            PictureOption("u22_s4_p1_opt7_4", "stasiun", "", R.drawable.ic_place_station, false)
        )
    )""",
            f"""    // 8. Soal 8: Ketik Pinyin (jauh -> yuǎn)
    Exercise(
        id = "u22_s4_p1_q8",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "jauh",
        sentenceWithBlank = "远 (________)",
        targetHanzi = "远",
        targetPinyin = "yuǎn",
        correctAnswer = "yuan",
        keyboardKeys = {k4_p1_q8},
        audioToSpeak = "远"
    )""",
            f"""    // 9. Soal 9: Susun Kalimat (Apakah rumah sakit berjarak jauh dari sini?)
    Exercise(
        id = "u22_s4_p1_q9",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "RS jauh tidak dari sini?",
        targetHanzi = "医院 离 这里 远 吗？",
        targetPinyin = "Yīyuàn lí zhèlǐ yuǎn ma?",
        wordChips = listOf("医院:yīyuàn", "离:lí", "这里:zhèlǐ", "远:yuǎn", "吗？:ma?", "近:jìn"),
        correctAnswer = "医院,离,这里,远,吗？",
        audioToSpeak = "医院离这里远吗？"
    )""",
            f"""    // 10. Soal 10: Ketuk Pasangan yang Sesuai (Rangkuman Jarak)
    Exercise(
        id = "u22_s4_p1_m10",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u22_s4_p1_m10_1", "离这里", "lí zhèlǐ", "dari sini"),
            MatchPairItem("u22_s4_p1_m10_2", "很远", "hěn yuǎn", "sangat jauh"),
            MatchPairItem("u22_s4_p1_m10_3", "很近", "hěn jìn", "sangat dekat"),
            MatchPairItem("u22_s4_p1_m10_4", "去超市", "qù chāoshì", "ke supermarket")
        )
    )"""
        ],
        "p2": [
            f"""    // 1. Soal 1: Pilihan Gambar (快 -> cepat)
    Exercise(
        id = "u22_s4_p2_q1",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "快",
        targetPinyin = "kuài",
        targetTranslation = "cepat",
        correctAnswer = "cepat",
        audioToSpeak = "快",
        pictureOptions = listOf(
            PictureOption("u22_s4_p2_opt1", "cepat", "", R.drawable.ic_stopwatch_min, true),
            PictureOption("u22_s4_p2_opt2", "mobil", "", R.drawable.ic_trans_car, false),
            PictureOption("u22_s4_p2_opt3", "gedung", "", R.drawable.ic_work_office_building, false),
            PictureOption("u22_s4_p2_opt4", "stasiun", "", R.drawable.ic_place_station, false)
        )
    )""",
            f"""    // 2. Soal 2: Susun Kalimat (Jalan lurus terus ke arah depan.)
    Exercise(
        id = "u22_s4_p2_q2",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Jalan lurus ke depan.",
        targetHanzi = "一直 往 前 走。",
        targetPinyin = "Yìzhí wǎng qián zǒu.",
        wordChips = listOf("一直:yìzhí", "往:wǎng", "前:qián", "走。:zǒu.", "后:hòu"),
        correctAnswer = "一直,往,前,走。",
        audioToSpeak = "一直往前走。"
    )""",
            f"""    // 3. Soal 3: Ketuk Pasangan yang Sesuai (Arah & Cepat Lambat)
    Exercise(
        id = "u22_s4_p2_m3",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u22_s4_p2_m1", "快", "kuài", "cepat"),
            MatchPairItem("u22_s4_p2_m2", "慢", "màn", "lambat / pelan"),
            MatchPairItem("u22_s4_p2_m3", "往", "wǎng", "menuju / ke arah"),
            MatchPairItem("u22_s4_p2_m4", "往前走", "wǎng qián zǒu", "jalan ke depan")
        )
    )""",
            f"""    // 4. Soal 4: Ketik Pinyin (dekat -> jìn)
    Exercise(
        id = "u22_s4_p2_q4",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "dekat",
        sentenceWithBlank = "近 (________)",
        targetHanzi = "近",
        targetPinyin = "jìn",
        correctAnswer = "jin",
        keyboardKeys = {k4_p2_q4},
        audioToSpeak = "近"
    )""",
            f"""    // 5. Soal 5: Mendengar Kalimat (Rule 10: illustrationRes = 0)
    Exercise(
        id = "u22_s4_p2_q5",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Apa yang Anda dengar?",
        targetTranslation = "Dia berlari lebih cepat dibanding semua orang.",
        targetHanzi = "他 跑 得 比 大家 都 快。",
        targetPinyin = "Tā pǎo de bǐ dàjiā dōu kuài.",
        wordChips = listOf("他:tā", "跑:pǎo", "得:de", "比:bǐ", "大家:dàjiā", "都:dōu", "快。:kuài.", "慢:màn"),
        correctAnswer = "他,跑,得,比,大家,都,快。",
        illustrationRes = 0,
        audioToSpeak = "他跑得比大家都快。"
    )""",
            f"""    // 6. Soal 6: Pilihan Kalimat
    Exercise(
        id = "u22_s4_p2_q6",
        type = ExerciseType.SENTENCE_CHOICE,
        title = "Pilih terjemahan yang benar",
        targetHanzi = "请 往 右 拐， 医院 就 在 前面。",
        targetPinyin = "Qǐng wǎng yòu guǎi, yīyuàn jiù zài qiánmiàn.",
        targetTranslation = "Silakan belok ke kanan, rumah sakit langsung ada di depan.",
        correctAnswer = "Qǐng wǎng yòu guǎi, yīyuàn jiù zài qiánmiàn.\\n请 往 右 拐， 医院 就 在 前面。",
        options = listOf(
            "Qǐng wǎng yòu guǎi, yīyuàn jiù zài qiánmiàn.\\n请 往 右 拐， 医院 就 在 前面。",
            "Qǐng wǎng zuǒ guǎi, yīyuàn jiù zài qiánmiàn.\\n请 往 左 拐， 医院 就 在 前面。",
            "Qǐng wǎng qián zǒu, xuéxiào zài qiánmiàn.\\n请 往 前 走， 学校 在 前面。"
        ),
        audioToSpeak = "请往右拐，医院就在前面。"
    )""",
            f"""    // 7. Soal 7: Pilihan Gambar (往 -> menuju ke arah)
    Exercise(
        id = "u22_s4_p2_q7",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "往",
        targetPinyin = "wǎng",
        targetTranslation = "menuju / ke arah",
        correctAnswer = "menuju / ke arah",
        audioToSpeak = "往",
        pictureOptions = listOf(
            PictureOption("u22_s4_p2_opt7_1", "ke arah", "", R.drawable.ic_pos_front, true),
            PictureOption("u22_s4_p2_opt7_2", "mobil", "", R.drawable.ic_trans_car, false),
            PictureOption("u22_s4_p2_opt7_3", "gedung", "", R.drawable.ic_work_office_building, false),
            PictureOption("u22_s4_p2_opt7_4", "stasiun", "", R.drawable.ic_place_station, false)
        )
    )""",
            f"""    // 8. Soal 8: Ketik Pinyin (ke arah -> wǎng)
    Exercise(
        id = "u22_s4_p2_q8",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "menuju / ke arah",
        sentenceWithBlank = "往 (________)",
        targetHanzi = "往",
        targetPinyin = "wǎng",
        correctAnswer = "wang",
        keyboardKeys = {k4_p2_q8},
        audioToSpeak = "往"
    )""",
            f"""    // 9. Soal 9: Susun Kalimat (Kereta berjalan sangat cepat.)
    Exercise(
        id = "u22_s4_p2_q9",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Kereta berjalan sangat cepat.",
        targetHanzi = "火车 跑 得 很 快。",
        targetPinyin = "Huǒchē pǎo de hěn kuài.",
        wordChips = listOf("火车:huǒchē", "跑:pǎo", "得:de", "很:hěn", "快。:kuài.", "慢:màn"),
        correctAnswer = "火车,跑,得,很,快。",
        audioToSpeak = "火车跑得很快。"
    )""",
            f"""    // 10. Soal 10: Ketuk Pasangan yang Sesuai (Rangkuman Kecepatan & Arah)
    Exercise(
        id = "u22_s4_p2_m10",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u22_s4_p2_m10_1", "很快", "hěn kuài", "sangat cepat"),
            MatchPairItem("u22_s4_p2_m2", "很慢", "hěn màn", "sangat pelan"),
            MatchPairItem("u22_s4_p2_m3", "往右拐", "wǎng yòu guǎi", "belok kanan"),
            MatchPairItem("u22_s4_p2_m4", "往左走", "wǎng zuǒ zǒu", "jalan ke kiri")
        )
    )"""
        ]
    }

    # =========================================================================
    # STAGE 5: Evaluasi Komprehensif Mobilitas Kota (Sintesis Seluruh Bab 22)
    # =========================================================================
    k5_p1_q4 = make_keys("ditie")
    k5_p1_q8 = make_keys("dache")
    k5_p2_q4 = make_keys("zoulu")
    k5_p2_q8 = make_keys("chezhan")
    
    stages[5] = {
        "p1": [
            f"""    // 1. Soal 1: Pilihan Gambar (公交车 -> bus umum)
    Exercise(
        id = "u22_s5_p1_q1",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "公交车",
        targetPinyin = "gōngjiāochē",
        targetTranslation = "bus umum",
        correctAnswer = "bus umum",
        audioToSpeak = "公交车",
        pictureOptions = listOf(
            PictureOption("u22_s5_p1_opt1", "bus", "", R.drawable.ic_trans_car, true),
            PictureOption("u22_s5_p1_opt2", "taksi", "", R.drawable.ic_trans_taxi, false),
            PictureOption("u22_s5_p1_opt3", "kereta", "", R.drawable.ic_trans_train, false),
            PictureOption("u22_s5_p1_opt4", "halte", "", R.drawable.ic_place_station, false)
        )
    )""",
            f"""    // 2. Soal 2: Susun Kalimat (Dari sini naik bus umum sangat praktis.)
    Exercise(
        id = "u22_s5_p1_q2",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Dari sini naik bus sangat praktis.",
        targetHanzi = "从 这里 坐 公交车 很 方便。",
        targetPinyin = "Cóng zhèlǐ zuò gōngjiāochē hěn fāngbiàn.",
        wordChips = listOf("从:cóng", "这里:zhèlǐ", "坐:zuò", "公交车:gōngjiāochē", "很:hěn", "方便。:fāngbiàn.", "慢:màn"),
        correctAnswer = "从,这里,坐,公交车,很,方便。",
        audioToSpeak = "从这里坐公交车很方便。"
    )""",
            f"""    // 3. Soal 3: Ketuk Pasangan yang Sesuai (Sintesis Bus & Taksi)
    Exercise(
        id = "u22_s5_p1_m3",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u22_s5_p1_m1", "公交车", "gōngjiāochē", "bus umum"),
            MatchPairItem("u22_s5_p1_m2", "打车", "dǎchē", "naik taksi"),
            MatchPairItem("u22_s5_p1_m3", "很方便", "hěn fāngbiàn", "sangat praktis"),
            MatchPairItem("u22_s5_p1_m4", "很便宜", "hěn piányi", "sangat murah")
        )
    )""",
            f"""    // 4. Soal 4: Ketik Pinyin (MRT -> dìtiě)
    Exercise(
        id = "u22_s5_p1_q4",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "kereta bawah tanah / MRT",
        sentenceWithBlank = "地铁 (________)",
        targetHanzi = "地铁",
        targetPinyin = "dìtiě",
        correctAnswer = "ditie",
        keyboardKeys = {k5_p1_q4},
        audioToSpeak = "地铁"
    )""",
            f"""    // 5. Soal 5: Mendengar Kalimat (Rule 10: illustrationRes = 0)
    Exercise(
        id = "u22_s5_p1_q5",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Apa yang Anda dengar?",
        targetTranslation = "Stasiun MRT berada di sebelah kanan.",
        targetHanzi = "地铁站 在 右边。",
        targetPinyin = "Dìtiězhàn zài yòubian.",
        wordChips = listOf("地铁站:dìtiězhàn", "在:zài", "右边。:yòubian.", "左边:zuǒbian"),
        correctAnswer = "地铁站,在,右边。",
        illustrationRes = 0,
        audioToSpeak = "地铁站在右边。"
    )""",
            f"""    // 6. Soal 6: Pilihan Kalimat
    Exercise(
        id = "u22_s5_p1_q6",
        type = ExerciseType.SENTENCE_CHOICE,
        title = "Pilih terjemahan yang benar",
        targetHanzi = "我 每天 走路 上学， 不 坐车。",
        targetPinyin = "Wǒ měitiān zǒulù shàngxué, bú zuòchē.",
        targetTranslation = "Saya setiap hari berjalan kaki ke sekolah, tidak naik kendaraan.",
        correctAnswer = "Wǒ měitiān zǒulù shàngxué, bú zuòchē.\\n我 每天 走路 上学， 不 坐车。",
        options = listOf(
            "Wǒ měitiān zǒulù shàngxué, bú zuòchē.\\n我 每天 走路 上学， 不 坐车。",
            "Wǒ měitiān zuòchē shàngxué, bù zǒulù.\\n我 每天 坐车 上学， 不 走路。",
            "Tā měitiān zǒulù shàngxué, bú zuòchē.\\n他 每天 走路 上学， 不 坐车。"
        ),
        audioToSpeak = "我每天走路学，不坐车。"
    )""",
            f"""    // 7. Soal 7: Pilihan Gambar (打车 -> memanggil taksi)
    Exercise(
        id = "u22_s5_p1_q7",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "打车",
        targetPinyin = "dǎchē",
        targetTranslation = "naik taksi",
        correctAnswer = "naik taksi",
        audioToSpeak = "打车",
        pictureOptions = listOf(
            PictureOption("u22_s5_p1_opt7_1", "taksi", "", R.drawable.ic_trans_taxi, true),
            PictureOption("u22_s5_p1_opt7_2", "bus", "", R.drawable.ic_trans_car, false),
            PictureOption("u22_s5_p1_opt7_3", "kereta", "", R.drawable.ic_trans_train, false),
            PictureOption("u22_s5_p1_opt7_4", "halte", "", R.drawable.ic_place_station, false)
        )
    )""",
            f"""    // 8. Soal 8: Ketik Pinyin (naik taksi -> dǎchē)
    Exercise(
        id = "u22_s5_p1_q8",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "naik taksi",
        sentenceWithBlank = "打车 (________)",
        targetHanzi = "打车",
        targetPinyin = "dǎchē",
        correctAnswer = "dache",
        keyboardKeys = {k5_p1_q8},
        audioToSpeak = "打车"
    )""",
            f"""    // 9. Soal 9: Susun Kalimat (Ke bandara masih butuh waktu setengah jam.)
    Exercise(
        id = "u22_s5_p1_q9",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Ke bandara masih butuh setengah jam.",
        targetHanzi = "去 机场 还 要 半 个 小时。",
        targetPinyin = "Qù jīchǎng hái yào bàn gè xiǎoshí.",
        wordChips = listOf("去:qù", "机场:jīchǎng", "还:hái", "要:yào", "半:bàn", "个:gè", "小时。:xiǎoshí.", "分钟:fēnzhōng"),
        correctAnswer = "去,机场,还,要,半,个,小时。",
        audioToSpeak = "去机场还要半个小时。"
    )""",
            f"""    // 10. Soal 10: Ketuk Pasangan yang Sesuai (Rangkuman Sintesis 1)
    Exercise(
        id = "u22_s5_p1_m10",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u22_s5_p1_m10_1", "地铁站", "dìtiězhàn", "stasiun MRT"),
            MatchPairItem("u22_s5_p1_m2", "打车去", "dǎchē qù", "naik taksi"),
            MatchPairItem("u22_s5_p1_m3", "半小时", "bàn xiǎoshí", "setengah jam"),
            MatchPairItem("u22_s5_p1_m4", "很近", "hěn jìn", "sangat dekat")
        )
    )"""
        ],
        "p2": [
            f"""    // 1. Soal 1: Pilihan Gambar (车站 -> halte stasiun)
    Exercise(
        id = "u22_s5_p2_q1",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "车站",
        targetPinyin = "chēzhàn",
        targetTranslation = "halte / stasiun",
        correctAnswer = "halte / stasiun",
        audioToSpeak = "车站",
        pictureOptions = listOf(
            PictureOption("u22_s5_p2_opt1", "halte", "", R.drawable.ic_place_station, true),
            PictureOption("u22_s5_p2_opt2", "bus", "", R.drawable.ic_trans_car, false),
            PictureOption("u22_s5_p2_opt3", "taksi", "", R.drawable.ic_trans_taxi, false),
            PictureOption("u22_s5_p2_opt4", "kereta", "", R.drawable.ic_trans_train, false)
        )
    )""",
            f"""    // 2. Soal 2: Susun Kalimat (Jalan lurus ke depan sampai di halte bus.)
    Exercise(
        id = "u22_s5_p2_q2",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Jalan terus ke depan sampai di halte.",
        targetHanzi = "往前 走 到 车站。",
        targetPinyin = "Wǎng qián zǒu dào chēzhàn.",
        wordChips = listOf("往前:wǎng qián", "走:zǒu", "到:dào", "车站。:chēzhàn.", "往后:wǎng hòu"),
        correctAnswer = "往前,走,到,车站。",
        audioToSpeak = "往前走到车站。"
    )""",
            f"""    // 3. Soal 3: Ketuk Pasangan yang Sesuai (Grand Sintesis Bab 22)
    Exercise(
        id = "u22_s5_p2_m3",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u22_s5_p2_m1", "路上", "lùshang", "di jalan"),
            MatchPairItem("u22_s5_p2_m2", "走路", "zǒulù", "jalan kaki"),
            MatchPairItem("u22_s5_p2_m3", "很远", "hěn yuǎn", "sangat jauh"),
            MatchPairItem("u22_s5_p2_m4", "往右走", "wǎng yòu zǒu", "jalan ke kanan")
        )
    )""",
            f"""    // 4. Soal 4: Ketik Pinyin (jalan kaki -> zǒulù)
    Exercise(
        id = "u22_s5_p2_q4",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "berjalan kaki",
        sentenceWithBlank = "走路 (________)",
        targetHanzi = "走路",
        targetPinyin = "zǒulù",
        correctAnswer = "zoulu",
        keyboardKeys = {k5_p2_q4},
        audioToSpeak = "走路"
    )""",
            f"""    // 5. Soal 5: Mendengar Kalimat (Rule 10: illustrationRes = 0)
    Exercise(
        id = "u22_s5_p2_q5",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Apa yang Anda dengar?",
        targetTranslation = "Halte bus berjarak tidak jauh dari sini.",
        targetHanzi = "车站 离 这里 不 远。",
        targetPinyin = "Chēzhàn lí zhèlǐ bù yuǎn.",
        wordChips = listOf("车站:chēzhàn", "离:lí", "这里:zhèlǐ", "不:bù", "远。:yuǎn.", "很:hěn"),
        correctAnswer = "车站,离,这里,不,远。",
        illustrationRes = 0,
        audioToSpeak = "车站离这里不远。"
    )""",
            f"""    // 6. Soal 6: Pilihan Kalimat
    Exercise(
        id = "u22_s5_p2_q6",
        type = ExerciseType.SENTENCE_CHOICE,
        title = "Pilih terjemahan yang benar",
        targetHanzi = "路上 小心， 到 了 打 电话。",
        targetPinyin = "Lùshang xiǎoxīn, dào le dǎ diànhuà.",
        targetTranslation = "Hati-hati di jalan, begitu sampai telepon ya.",
        correctAnswer = "Lùshang xiǎoxīn, dào le dǎ diànhuà.\\n路上 小心， 到 了 打 电话。",
        options = listOf(
            "Lùshang xiǎoxīn, dào le dǎ diànhuà.\\n路上 小心， 到 了 打 电话。",
            "Lùshang kuài diǎnr, dào le dǎ diànhuà.\\n路上 快 点儿， 到 了 打 电话。",
            "Lùshang xiǎoxīn, bié dǎ diànhuà.\\n路上 小心， 别 打 电话。"
        ),
        audioToSpeak = "路上小心，到了打电话。"
    )""",
            f"""    // 7. Soal 7: Pilihan Gambar (地铁 -> MRT)
    Exercise(
        id = "u22_s5_p2_q7",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "地铁",
        targetPinyin = "dìtiě",
        targetTranslation = "kereta bawah tanah / MRT",
        correctAnswer = "kereta bawah tanah / MRT",
        audioToSpeak = "地铁",
        pictureOptions = listOf(
            PictureOption("u22_s5_p2_opt7_1", "MRT", "", R.drawable.ic_trans_train, true),
            PictureOption("u22_s5_p2_opt7_2", "bus", "", R.drawable.ic_trans_car, false),
            PictureOption("u22_s5_p2_opt7_3", "taksi", "", R.drawable.ic_trans_taxi, false),
            PictureOption("u22_s5_p2_opt7_4", "halte", "", R.drawable.ic_place_station, false)
        )
    )""",
            f"""    // 8. Soal 8: Ketik Pinyin (halte -> chēzhàn)
    Exercise(
        id = "u22_s5_p2_q8",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "halte / stasiun",
        sentenceWithBlank = "车站 (________)",
        targetHanzi = "车站",
        targetPinyin = "chēzhàn",
        correctAnswer = "chezhan",
        keyboardKeys = {k5_p2_q8},
        audioToSpeak = "车站"
    )""",
            f"""    // 9. Soal 9: Susun Kalimat (Kami naik bus umum kembali ke rumah.)
    Exercise(
        id = "u22_s5_p2_q9",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Kami naik bus pulang ke rumah.",
        targetHanzi = "我们 坐 公交车 回 家。",
        targetPinyin = "Wǒmen zuò gōngjiāochē huí jiā.",
        wordChips = listOf("我们:wǒmen", "坐:zuò", "公交车:gōngjiāochē", "回:huí", "家。:jiā.", "打车:dǎchē"),
        correctAnswer = "我们,坐,公交车,回,家。",
        audioToSpeak = "我们坐公交车回家。"
    )""",
            f"""    // 10. Soal 10: Ketuk Pasangan yang Sesuai (Grand Review Final Bab 22)
    Exercise(
        id = "u22_s5_p2_m10",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u22_s5_p2_m10_1", "公共汽车", "gōnggòng qìchē", "bus umum"),
            MatchPairItem("u22_s5_p2_m10_2", "坐地铁", "zuò dìtiě", "naik MRT"),
            MatchPairItem("u22_s5_p2_m3", "打电话", "dǎ diànhuà", "menelepon"),
            MatchPairItem("u22_s5_p2_m4", "回家去", "huí jiā qù", "pulang rumah")
        )
    )"""
        ]
    }

    for s_idx in range(1, 6):
        filename = f"{base_dir}/Bab22Stage{s_idx}Data.kt"
        p1_code = ",\n\n".join(stages[s_idx]["p1"])
        p2_code = ",\n\n".join(stages[s_idx]["p2"])
        
        content = f"""package com.example.chineselearning.data.repository

import com.example.chineselearning.R
import com.example.chineselearning.data.model.Exercise
import com.example.chineselearning.data.model.ExerciseType
import com.example.chineselearning.data.model.MatchPairItem
import com.example.chineselearning.data.model.PictureOption

val bab22Stage{s_idx}Part1Exercises = listOf(
{p1_code}
)

val bab22Stage{s_idx}Part2Exercises = listOf(
{p2_code}
)
"""
        with open(filename, "w", encoding="utf-8") as f:
            f.write(content)
        print(f"Written {filename}")

if __name__ == "__main__":
    generate_bab22()
