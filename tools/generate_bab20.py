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

def generate_bab20():
    base_dir = "app/src/main/java/com/example/chineselearning/data/repository"
    
    stages = {}
    
    # =========================================================================
    # STAGE 1: Sisi Kiri & Sisi Kanan (左, 左边, 右, 右边)
    # =========================================================================
    k1_p1_q4 = make_keys("zuobian")
    k1_p1_q8 = make_keys("zuo")
    k1_p2_q4 = make_keys("youbian")
    k1_p2_q8 = make_keys("you")
    
    stages[1] = {
        "p1": [
            f"""    // 1. Soal 1: Pilihan Gambar (左边 -> sebelah kiri)
    Exercise(
        id = "u20_s1_p1_q1",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "左边",
        targetPinyin = "zuǒbian",
        targetTranslation = "sebelah kiri",
        correctAnswer = "sebelah kiri",
        audioToSpeak = "左边",
        pictureOptions = listOf(
            PictureOption("u20_s1_p1_opt1", "sebelah kiri", "", R.drawable.ic_pos_left, true),
            PictureOption("u20_s1_p1_opt2", "sebelah kanan", "", R.drawable.ic_pos_right, false),
            PictureOption("u20_s1_p1_opt3", "di depan", "", R.drawable.ic_pos_front, false),
            PictureOption("u20_s1_p1_opt4", "di belakang", "", R.drawable.ic_pos_back, false)
        )
    )""",
            f"""    // 2. Soal 2: Susun Kalimat (Sekolah berada di sebelah kiri rumah sakit.)
    Exercise(
        id = "u20_s1_p1_q2",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Sekolah di sebelah kiri rumah sakit.",
        targetHanzi = "学校 在 医院 的 左边。",
        targetPinyin = "Xuéxiào zài yīyuàn de zuǒbian.",
        wordChips = listOf("学校:xuéxiào", "在:zài", "医院:yīyuàn", "的:de", "左边。:zuǒbian.", "右边:yòubian"),
        correctAnswer = "学校,在,医院,的,左边。",
        audioToSpeak = "学校在医院的左边。"
    )""",
            f"""    // 3. Soal 3: Ketuk Pasangan yang Sesuai (Kiri & Kanan)
    Exercise(
        id = "u20_s1_p1_q3",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u20_s1_p1_m1", "左", "zuǒ", "kiri"),
            MatchPairItem("u20_s1_p1_m2", "左边", "zuǒbian", "sebelah kiri"),
            MatchPairItem("u20_s1_p1_m3", "往左走", "wǎng zuǒ zǒu", "jalan ke kiri"),
            MatchPairItem("u20_s1_p1_m4", "书店", "shūdiàn", "toko buku")
        )
    )""",
            f"""    // 4. Soal 4: Ketik Pinyin (sebelah kiri -> zuǒbian)
    Exercise(
        id = "u20_s1_p1_q4",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "sebelah kiri",
        sentenceWithBlank = "左边 (________)",
        targetHanzi = "左边",
        targetPinyin = "zuǒbian",
        correctAnswer = "zuobian",
        keyboardKeys = {k1_p1_q4},
        audioToSpeak = "左边"
    )""",
            f"""    // 5. Soal 5: Mendengar Kalimat (Rule 10: illustrationRes = 0)
    Exercise(
        id = "u20_s1_p1_q5",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Apa yang Anda dengar?",
        targetTranslation = "Lihat ke kiri ada sebuah toko buku.",
        targetHanzi = "往 左 看 有 一 家 书店。",
        targetPinyin = "Wǎng zuǒ kàn yǒu yì jiā shūdiàn.",
        wordChips = listOf("往:wǎng", "左:zuǒ", "看:kàn", "有:yǒu", "一:yì", "家:jiā", "书店。:shūdiàn.", "右:yòu"),
        correctAnswer = "往,左,看,有,一,家,书店。",
        illustrationRes = 0,
        audioToSpeak = "往左看有一家书店。"
    )""",
            f"""    // 6. Soal 6: Pilihan Kalimat
    Exercise(
        id = "u20_s1_p1_q6",
        type = ExerciseType.SENTENCE_CHOICE,
        title = "Pilih terjemahan yang benar",
        targetHanzi = "我 坐 在 他 的 左边。",
        targetPinyin = "Wǒ zuò zài tā de zuǒbian.",
        targetTranslation = "Saya duduk di sebelah kirinya.",
        correctAnswer = "Wǒ zuò zài tā de zuǒbian.\\n我 坐 在 他 的 左边。",
        options = listOf(
            "Wǒ zuò zài tā de zuǒbian.\\n我 坐 在 他 的 左边。",
            "Wǒ zuò zài tā de yòubian.\\n我 坐 在 他 的 右边。",
            "Tā zuò zài wǒ de zuǒbian.\\n他 坐 在 我 的 左边。"
        ),
        audioToSpeak = "我坐在他的左边。"
    )""",
            f"""    // 7. Soal 7: Pilihan Gambar (左 -> kiri)
    Exercise(
        id = "u20_s1_p1_q7",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "左",
        targetPinyin = "zuǒ",
        targetTranslation = "kiri",
        correctAnswer = "kiri",
        audioToSpeak = "左",
        pictureOptions = listOf(
            PictureOption("u20_s1_p1_opt7_1", "kiri", "", R.drawable.ic_pos_left, true),
            PictureOption("u20_s1_p1_opt7_2", "kanan", "", R.drawable.ic_pos_right, false),
            PictureOption("u20_s1_p1_opt7_3", "atas", "", R.drawable.ic_pos_up, false),
            PictureOption("u20_s1_p1_opt7_4", "bawah", "", R.drawable.ic_pos_down, false)
        )
    )""",
            f"""    // 8. Soal 8: Ketik Pinyin (kiri -> zuǒ)
    Exercise(
        id = "u20_s1_p1_q8",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "kiri",
        sentenceWithBlank = "左 (________)",
        targetHanzi = "左",
        targetPinyin = "zuǒ",
        correctAnswer = "zuo",
        keyboardKeys = {k1_p1_q8},
        audioToSpeak = "左"
    )""",
            f"""    // 9. Soal 9: Susun Kalimat (Di sebelah kiri ada dua orang anak kecil.)
    Exercise(
        id = "u20_s1_p1_q9",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Di sebelah kiri ada dua anak.",
        targetHanzi = "左边 有 两 个 小孩儿。",
        targetPinyin = "Zuǒbian yǒu liǎng gè xiǎoháiér.",
        wordChips = listOf("左边:zuǒbian", "有:yǒu", "两:liǎng", "个:gè", "小孩儿。:xiǎoháiér.", "右边:yòubian"),
        correctAnswer = "左边,有,两,个,小孩儿。",
        audioToSpeak = "左边有两个小孩儿。"
    )""",
            f"""    // 10. Soal 10: Ketuk Pasangan yang Sesuai (Rangkuman Sisi Kiri)
    Exercise(
        id = "u20_s1_p1_m10",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u20_s1_p1_m10_1", "左", "zuǒ", "kiri"),
            MatchPairItem("u20_s1_p1_m10_2", "左边", "zuǒbian", "sebelah kiri"),
            MatchPairItem("u20_s1_p1_m10_3", "坐在左边", "zuò zài zuǒbian", "duduk di kiri"),
            MatchPairItem("u20_s1_p1_m10_4", "往左", "wǎng zuǒ", "ke kiri")
        )
    )"""
        ],
        "p2": [
            f"""    // 1. Soal 1: Pilihan Gambar (右边 -> sebelah kanan)
    Exercise(
        id = "u20_s1_p2_q1",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "右边",
        targetPinyin = "yòubian",
        targetTranslation = "sebelah kanan",
        correctAnswer = "sebelah kanan",
        audioToSpeak = "右边",
        pictureOptions = listOf(
            PictureOption("u20_s1_p2_opt1", "sebelah kanan", "", R.drawable.ic_pos_right, true),
            PictureOption("u20_s1_p2_opt2", "sebelah kiri", "", R.drawable.ic_pos_left, false),
            PictureOption("u20_s1_p2_opt3", "di depan", "", R.drawable.ic_pos_front, false),
            PictureOption("u20_s1_p2_opt4", "di belakang", "", R.drawable.ic_pos_back, false)
        )
    )""",
            f"""    // 2. Soal 2: Susun Kalimat (Toilet berada di sebelah kanan tangga.)
    Exercise(
        id = "u20_s1_p2_q2",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Toilet di sebelah kanan tangga.",
        targetHanzi = "洗手间 在 楼梯 的 右边。",
        targetPinyin = "Xǐshǒujiān zài lóutī de yòubian.",
        wordChips = listOf("洗手间:xǐshǒujiān", "在:zài", "楼梯:lóutī", "的:de", "右边。:yòubian.", "左边:zuǒbian"),
        correctAnswer = "洗手间,在,楼梯,的,右边。",
        audioToSpeak = "洗手间在楼梯的右边。"
    )""",
            f"""    // 3. Soal 3: Ketuk Pasangan yang Sesuai (Sisi Kanan)
    Exercise(
        id = "u20_s1_p2_m3",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u20_s1_p2_m1", "右", "yòu", "kanan"),
            MatchPairItem("u20_s1_p2_m2", "右边", "yòubian", "sebelah kanan"),
            MatchPairItem("u20_s1_p2_m3", "往右走", "wǎng yòu zǒu", "jalan ke kanan"),
            MatchPairItem("u20_s1_p2_m4", "洗手间", "xǐshǒujiān", "toilet")
        )
    )""",
            f"""    // 4. Soal 4: Ketik Pinyin (sebelah kanan -> yòubian)
    Exercise(
        id = "u20_s1_p2_q4",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "sebelah kanan",
        sentenceWithBlank = "右边 (________)",
        targetHanzi = "右边",
        targetPinyin = "yòubian",
        correctAnswer = "youbian",
        keyboardKeys = {k1_p2_q4},
        audioToSpeak = "右边"
    )""",
            f"""    // 5. Soal 5: Mendengar Kalimat (Rule 10: illustrationRes = 0)
    Exercise(
        id = "u20_s1_p2_q5",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Apa yang Anda dengar?",
        targetTranslation = "Sampai di perempatan jalan silakan jalan ke kanan.",
        targetHanzi = "到 了 路口 请 往 右 走。",
        targetPinyin = "Dào le lùkǒu qǐng wǎng yòu zǒu.",
        wordChips = listOf("到:dào", "了:le", "路口:lùkǒu", "请:qǐng", "往:wǎng", "右:yòu", "走。:zǒu.", "左:zuǒ"),
        correctAnswer = "到,了,路口,请,往,右,走。",
        illustrationRes = 0,
        audioToSpeak = "到了路口请往右走。"
    )""",
            f"""    // 6. Soal 6: Pilihan Kalimat
    Exercise(
        id = "u20_s1_p2_q6",
        type = ExerciseType.SENTENCE_CHOICE,
        title = "Pilih terjemahan yang benar",
        targetHanzi = "桌子 的 右边 放 着 一 台 电脑。",
        targetPinyin = "Zhuōzi de yòubian fàng zhe yì tái diànnǎo.",
        targetTranslation = "Di sebelah kanan meja diletakkan sebuah komputer.",
        correctAnswer = "Zhuōzi de yòubian fàng zhe yì tái diànnǎo.\\n桌子 的 右边 放 着 一 台 电脑。",
        options = listOf(
            "Zhuōzi de yòubian fàng zhe yì tái diànnǎo.\\n桌子 的 右边 放 着 一 台 电脑。",
            "Zhuōzi de zuǒbian fàng zhe yì tái diànnǎo.\\n桌子 的 左边 放 着 一 台 电脑。",
            "Zhuōzi de shàngmiàn fàng zhe yì tái diànnǎo.\\n桌子 的 上面 放 着 一 台 电脑。"
        ),
        audioToSpeak = "桌子的右边放着一台电脑。"
    )""",
            f"""    // 7. Soal 7: Pilihan Gambar (右 -> kanan)
    Exercise(
        id = "u20_s1_p2_q7",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "右",
        targetPinyin = "yòu",
        targetTranslation = "kanan",
        correctAnswer = "kanan",
        audioToSpeak = "右",
        pictureOptions = listOf(
            PictureOption("u20_s1_p2_opt7_1", "kanan", "", R.drawable.ic_pos_right, true),
            PictureOption("u20_s1_p2_opt7_2", "kiri", "", R.drawable.ic_pos_left, false),
            PictureOption("u20_s1_p2_opt7_3", "depan", "", R.drawable.ic_pos_front, false),
            PictureOption("u20_s1_p2_opt7_4", "belakang", "", R.drawable.ic_pos_back, false)
        )
    )""",
            f"""    // 8. Soal 8: Ketik Pinyin (kanan -> yòu)
    Exercise(
        id = "u20_s1_p2_q8",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "kanan",
        sentenceWithBlank = "右 (________)",
        targetHanzi = "右",
        targetPinyin = "yòu",
        correctAnswer = "you",
        keyboardKeys = {k1_p2_q8},
        audioToSpeak = "右"
    )""",
            f"""    // 9. Soal 9: Susun Kalimat (Tangan kanan saya memegang sebuah pena.)
    Exercise(
        id = "u20_s1_p2_q9",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Tangan kanan saya memegang pena.",
        targetHanzi = "我 的 右 手 拿 着 笔。",
        targetPinyin = "Wǒ de yòu shǒu ná zhe bǐ.",
        wordChips = listOf("我:wǒ", "的:de", "右:yòu", "手:shǒu", "拿:ná", "着:zhe", "笔。:bǐ.", "左:zuǒ"),
        correctAnswer = "我,的,右,手,拿,着,笔。",
        audioToSpeak = "我的右手拿着笔。"
    )""",
            f"""    // 10. Soal 10: Ketuk Pasangan yang Sesuai (Rangkuman Kiri & Kanan)
    Exercise(
        id = "u20_s1_p2_m10",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u20_s1_p2_m10_1", "左手", "zuǒshǒu", "tangan kiri"),
            MatchPairItem("u20_s1_p2_m10_2", "右手", "yòushǒu", "tangan kanan"),
            MatchPairItem("u20_s1_p2_m10_3", "左右", "zuǒyòu", "kiri kanan"),
            MatchPairItem("u20_s1_p2_m10_4", "往右", "wǎng yòu", "ke kanan")
        )
    )"""
        ]
    }

    # =========================================================================
    # STAGE 2: Depan, Belakang & Sisi Samping (前面, 后面, 旁边, 面)
    # =========================================================================
    k2_p1_q4 = make_keys("qianmian")
    k2_p1_q8 = make_keys("houmian")
    k2_p2_q4 = make_keys("pangbian")
    k2_p2_q8 = make_keys("mian")
    
    stages[2] = {
        "p1": [
            f"""    // 1. Soal 1: Pilihan Gambar (前面 -> bagian depan / di depan)
    Exercise(
        id = "u20_s2_p1_q1",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "前面",
        targetPinyin = "qiánmiàn",
        targetTranslation = "bagian depan / di depan",
        correctAnswer = "bagian depan / di depan",
        audioToSpeak = "前面",
        pictureOptions = listOf(
            PictureOption("u20_s2_p1_opt1", "di depan", "", R.drawable.ic_pos_front, true),
            PictureOption("u20_s2_p1_opt2", "di belakang", "", R.drawable.ic_pos_back, false),
            PictureOption("u20_s2_p1_opt3", "di kiri", "", R.drawable.ic_pos_left, false),
            PictureOption("u20_s2_p1_opt4", "di kanan", "", R.drawable.ic_pos_right, false)
        )
    )""",
            f"""    // 2. Soal 2: Susun Kalimat (Halte bus berada di depan perusahaan.)
    Exercise(
        id = "u20_s2_p1_q2",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Halte di depan perusahaan.",
        targetHanzi = "车站 在 公司 前面。",
        targetPinyin = "Chēzhàn zài gōngsī qiánmiàn.",
        wordChips = listOf("车站:chēzhàn", "在:zài", "公司:gōngsī", "前面。:qiánmiàn.", "后面:hòumiàn"),
        correctAnswer = "车站,在,公司,前面。",
        audioToSpeak = "车站在公司前面。"
    )""",
            f"""    // 3. Soal 3: Ketuk Pasangan yang Sesuai (Depan & Belakang)
    Exercise(
        id = "u20_s2_p1_q3",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u20_s2_p1_m1", "前面", "qiánmiàn", "di depan"),
            MatchPairItem("u20_s2_p1_m2", "后面", "hòumiàn", "di belakang"),
            MatchPairItem("u20_s2_p1_m3", "车站", "chēzhàn", "halte / stasiun"),
            MatchPairItem("u20_s2_p1_m4", "公司", "gōngsī", "perusahaan")
        )
    )""",
            f"""    // 4. Soal 4: Ketik Pinyin (di depan -> qiánmiàn)
    Exercise(
        id = "u20_s2_p1_q4",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "bagian depan / di depan",
        sentenceWithBlank = "前面 (________)",
        targetHanzi = "前面",
        targetPinyin = "qiánmiàn",
        correctAnswer = "qianmian",
        keyboardKeys = {k2_p1_q4},
        audioToSpeak = "前面"
    )""",
            f"""    // 5. Soal 5: Mendengar Kalimat (Rule 10: illustrationRes = 0)
    Exercise(
        id = "u20_s2_p1_q5",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Apa yang Anda dengar?",
        targetTranslation = "Di belakang rumah ada sebuah taman kecil.",
        targetHanzi = "房子 后面 有 一个 花园。",
        targetPinyin = "Fángzi hòumiàn yǒu yí gè huāyuán.",
        wordChips = listOf("房子:fángzi", "后面:hòumiàn", "有:yǒu", "一个:yí gè", "花园。:huāyuán.", "前面:qiánmiàn"),
        correctAnswer = "房子,后面,有,一个,花园。",
        illustrationRes = 0,
        audioToSpeak = "房子后面有一个花园。"
    )""",
            f"""    // 6. Soal 6: Pilihan Kalimat
    Exercise(
        id = "u20_s2_p1_q6",
        type = ExerciseType.SENTENCE_CHOICE,
        title = "Pilih terjemahan yang benar",
        targetHanzi = "他 走 在 我 的 前面。",
        targetPinyin = "Tā zǒu zài wǒ de qiánmiàn.",
        targetTranslation = "Dia berjalan di depan saya.",
        correctAnswer = "Tā zǒu zài wǒ de qiánmiàn.\\n他 走 在 我 的 前面。",
        options = listOf(
            "Tā zǒu zài wǒ de qiánmiàn.\\n他 走 在 我 的 前面。",
            "Tā zǒu zài wǒ de hòumiàn.\\n他 走 在 我 的 后面。",
            "Wǒ zǒu zài tā de qiánmiàn.\\n我 走 在 他 的 前面。"
        ),
        audioToSpeak = "他走在我的前面。"
    )""",
            f"""    // 7. Soal 7: Pilihan Gambar (后面 -> di belakang)
    Exercise(
        id = "u20_s2_p1_q7",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "后面",
        targetPinyin = "hòumiàn",
        targetTranslation = "bagian belakang / di belakang",
        correctAnswer = "bagian belakang / di belakang",
        audioToSpeak = "后面",
        pictureOptions = listOf(
            PictureOption("u20_s2_p1_opt7_1", "di belakang", "", R.drawable.ic_pos_back, true),
            PictureOption("u20_s2_p1_opt7_2", "di depan", "", R.drawable.ic_pos_front, false),
            PictureOption("u20_s2_p1_opt7_3", "di kanan", "", R.drawable.ic_pos_right, false),
            PictureOption("u20_s2_p1_opt7_4", "di kiri", "", R.drawable.ic_pos_left, false)
        )
    )""",
            f"""    // 8. Soal 8: Ketik Pinyin (di belakang -> hòumiàn)
    Exercise(
        id = "u20_s2_p1_q8",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "bagian belakang / di belakang",
        sentenceWithBlank = "后面 (________)",
        targetHanzi = "后面",
        targetPinyin = "hòumiàn",
        correctAnswer = "houmian",
        keyboardKeys = {k2_p1_q8},
        audioToSpeak = "后面"
    )""",
            f"""    // 9. Soal 9: Susun Kalimat (Di belakang sekolah ada lapangan bola.)
    Exercise(
        id = "u20_s2_p1_q9",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Di belakang sekolah ada lapangan.",
        targetHanzi = "学校 后面 有 操场。",
        targetPinyin = "Xuéxiào hòumiàn yǒu cāochǎng.",
        wordChips = listOf("学校:xuéxiào", "后面:hòumiàn", "有:yǒu", "操场。:cāochǎng.", "前面:qiánmiàn"),
        correctAnswer = "学校,后面,有,操场。",
        audioToSpeak = "学校后面有操场。"
    )""",
            f"""    // 10. Soal 10: Ketuk Pasangan yang Sesuai (Rangkuman Depan Belakang)
    Exercise(
        id = "u20_s2_p1_m10",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u20_s2_p1_m10_1", "前面", "qiánmiàn", "di depan"),
            MatchPairItem("u20_s2_p1_m10_2", "后面", "hòumiàn", "di belakang"),
            MatchPairItem("u20_s2_p1_m10_3", "学校前", "xuéxiào qián", "depan sekolah"),
            MatchPairItem("u20_s2_p1_m10_4", "房子后", "fángzi hòu", "belakang rumah")
        )
    )"""
        ],
        "p2": [
            f"""    // 1. Soal 1: Pilihan Gambar (旁边 -> di samping / sebelah)
    Exercise(
        id = "u20_s2_p2_q1",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "旁边",
        targetPinyin = "pángbiān",
        targetTranslation = "samping / sebelah",
        correctAnswer = "samping / sebelah",
        audioToSpeak = "旁边",
        pictureOptions = listOf(
            PictureOption("u20_s2_p2_opt1", "di samping", "", R.drawable.ic_pos_left, true),
            PictureOption("u20_s2_p2_opt2", "di atas", "", R.drawable.ic_pos_up, false),
            PictureOption("u20_s2_p2_opt3", "di bawah", "", R.drawable.ic_pos_down, false),
            PictureOption("u20_s2_p2_opt4", "di dalam", "", R.drawable.ic_pos_in, false)
        )
    )""",
            f"""    // 2. Soal 2: Susun Kalimat (Saya duduk tepat di sebelahmu.)
    Exercise(
        id = "u20_s2_p2_q2",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Saya duduk di sampingmu.",
        targetHanzi = "我 就 坐 在 你 的 旁边。",
        targetPinyin = "Wǒ jiù zuò zài nǐ de pángbiān.",
        wordChips = listOf("我:wǒ", "就:jiù", "坐:zuò", "在:zài", "你:nǐ", "的:de", "旁边。:pángbiān.", "后面:hòumiàn"),
        correctAnswer = "我,就,坐,在,你,的,旁边。",
        audioToSpeak = "我就坐在你的旁边。"
    )""",
            f"""    // 3. Soal 3: Ketuk Pasangan yang Sesuai (Samping & Sisi Mata Angin)
    Exercise(
        id = "u20_s2_p2_m3",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u20_s2_p2_m1", "旁边", "pángbiān", "samping / sebelah"),
            MatchPairItem("u20_s2_p2_m2", "面", "miàn", "sisi / arah"),
            MatchPairItem("u20_s2_p2_m3", "坐在旁边", "zuò zài pángbiān", "duduk di samping"),
            MatchPairItem("u20_s2_p2_m4", "东面", "dōngmiàn", "sisi timur")
        )
    )""",
            f"""    // 4. Soal 4: Ketik Pinyin (samping -> pángbiān)
    Exercise(
        id = "u20_s2_p2_q4",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "samping / sebelah",
        sentenceWithBlank = "旁边 (________)",
        targetHanzi = "旁边",
        targetPinyin = "pángbiān",
        correctAnswer = "pangbian",
        keyboardKeys = {k2_p2_q4},
        audioToSpeak = "旁边"
    )""",
            f"""    // 5. Soal 5: Mendengar Kalimat (Rule 10: illustrationRes = 0)
    Exercise(
        id = "u20_s2_p2_q5",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Apa yang Anda dengar?",
        targetTranslation = "Di sisi timur ada sebuah gunung besar.",
        targetHanzi = "东面 有 一 座 大 山。",
        targetPinyin = "Dōngmiàn yǒu yí zuò dà shān.",
        wordChips = listOf("东面:dōngmiàn", "有:yǒu", "一:yí", "座:zuò", "大:dà", "山。:shān.", "西面:xīmiàn"),
        correctAnswer = "东面,有,一,座,大,山。",
        illustrationRes = 0,
        audioToSpeak = "东面有一座大山。"
    )""",
            f"""    // 6. Soal 6: Pilihan Kalimat
    Exercise(
        id = "u20_s2_p2_q6",
        type = ExerciseType.SENTENCE_CHOICE,
        title = "Pilih terjemahan yang benar",
        targetHanzi = "商场 旁边 有 一 家 饭馆。",
        targetPinyin = "Shāngchǎng pángbiān yǒu yì jiā fànguǎn.",
        targetTranslation = "Di samping mall ada sebuah restoran.",
        correctAnswer = "Shāngchǎng pángbiān yǒu yì jiā fànguǎn.\\n商场 旁边 有 一 家 饭馆。",
        options = listOf(
            "Shāngchǎng pángbiān yǒu yì jiā fànguǎn.\\n商场 旁边 有 一 家 饭馆。",
            "Shāngchǎng lǐmiàn yǒu yì jiā fànguǎn.\\n商场 里面 有 一 家 饭馆。",
            "Fànguǎn pángbiān yǒu yí gè shāngchǎng.\\n饭馆 旁边 有 一 个 商场。"
        ),
        audioToSpeak = "商场旁边有一家饭馆。"
    )""",
            f"""    // 7. Soal 7: Pilihan Gambar (面 -> sisi / arah)
    Exercise(
        id = "u20_s2_p2_q7",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "面",
        targetPinyin = "miàn",
        targetTranslation = "sisi / arah",
        correctAnswer = "sisi / arah",
        audioToSpeak = "面",
        pictureOptions = listOf(
            PictureOption("u20_s2_p2_opt7_1", "sisi / arah", "", R.drawable.ic_pos_right, true),
            PictureOption("u20_s2_p2_opt7_2", "di dalam", "", R.drawable.ic_pos_in, false),
            PictureOption("u20_s2_p2_opt7_3", "di atas", "", R.drawable.ic_pos_up, false),
            PictureOption("u20_s2_p2_opt7_4", "di bawah", "", R.drawable.ic_pos_down, false)
        )
    )""",
            f"""    // 8. Soal 8: Ketik Pinyin (sisi/arah -> miàn)
    Exercise(
        id = "u20_s2_p2_q8",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "sisi / arah",
        sentenceWithBlank = "面 (________)",
        targetHanzi = "面",
        targetPinyin = "miàn",
        correctAnswer = "mian",
        keyboardKeys = {k2_p2_q8},
        audioToSpeak = "面"
    )""",
            f"""    // 9. Soal 9: Susun Kalimat (Siapa yang duduk di sebelah Anda?)
    Exercise(
        id = "u20_s2_p2_q9",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Siapa yang duduk di sampingmu?",
        targetHanzi = "谁 坐 在 你 旁边？",
        targetPinyin = "Shéi zuò zài nǐ pángbiān?",
        wordChips = listOf("谁:shéi", "坐:zuò", "在:zài", "你:nǐ", "旁边？:pángbiān.", "前面:qiánmiàn"),
        correctAnswer = "谁,坐,在,你,旁边？",
        audioToSpeak = "谁坐在你旁边？"
    )""",
            f"""    // 10. Soal 10: Ketuk Pasangan yang Sesuai (Rangkuman Sisi & Posisi)
    Exercise(
        id = "u20_s2_p2_m10",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u20_s2_p2_m10_1", "旁边", "pángbiān", "samping"),
            MatchPairItem("u20_s2_p2_m2", "前面", "qiánmiàn", "depan"),
            MatchPairItem("u20_s2_p2_m3", "南面", "nánmiàn", "arah selatan"),
            MatchPairItem("u20_s2_p2_m4", "商场旁", "shāngchǎng páng", "sebelah mall")
        )
    )"""
        ]
    }

    # =========================================================================
    # STAGE 3: Dalam, Luar, Atas & Bawah (里面, 外面, 上面, 下面)
    # =========================================================================
    k3_p1_q4 = make_keys("limian")
    k3_p1_q8 = make_keys("waimian")
    k3_p2_q4 = make_keys("shangmian")
    k3_p2_q8 = make_keys("xiamian")
    
    stages[3] = {
        "p1": [
            f"""    // 1. Soal 1: Pilihan Gambar (里面 -> bagian dalam / di dalam)
    Exercise(
        id = "u20_s3_p1_q1",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "里面",
        targetPinyin = "lǐmiàn",
        targetTranslation = "bagian dalam / di dalam",
        correctAnswer = "bagian dalam / di dalam",
        audioToSpeak = "里面",
        pictureOptions = listOf(
            PictureOption("u20_s3_p1_opt1", "di dalam", "", R.drawable.ic_pos_in, true),
            PictureOption("u20_s3_p1_opt2", "di luar", "", R.drawable.ic_pos_out, false),
            PictureOption("u20_s3_p1_opt3", "di atas", "", R.drawable.ic_pos_up, false),
            PictureOption("u20_s3_p1_opt4", "di bawah", "", R.drawable.ic_pos_down, false)
        )
    )""",
            f"""    // 2. Soal 2: Susun Kalimat (Di dalam tas sekolah ada tiga buah buku.)
    Exercise(
        id = "u20_s3_p1_q2",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Di dalam tas ada tiga buku.",
        targetHanzi = "书包 里面 有 三 本 书。",
        targetPinyin = "Shūbāo lǐmiàn yǒu sān běn shū.",
        wordChips = listOf("书包:shūbāo", "里面:lǐmiàn", "有:yǒu", "三:sān", "本:běn", "书。:shū.", "外面:wàimiàn"),
        correctAnswer = "书包,里面,有,三,本,书。",
        audioToSpeak = "书包里面有三本书。"
    )""",
            f"""    // 3. Soal 3: Ketuk Pasangan yang Sesuai (Dalam & Luar)
    Exercise(
        id = "u20_s3_p1_q3",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u20_s3_p1_m1", "里面", "lǐmiàn", "di dalam"),
            MatchPairItem("u20_s3_p1_m2", "外面", "wàimiàn", "di luar"),
            MatchPairItem("u20_s3_p1_m3", "书包里", "shūbāo lǐ", "dalam tas"),
            MatchPairItem("u20_s3_p1_m4", "屋子外", "wūzi wài", "luar rumah")
        )
    )""",
            f"""    // 4. Soal 4: Ketik Pinyin (di dalam -> lǐmiàn)
    Exercise(
        id = "u20_s3_p1_q4",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "bagian dalam / di dalam",
        sentenceWithBlank = "里面 (________)",
        targetHanzi = "里面",
        targetPinyin = "lǐmiàn",
        correctAnswer = "limian",
        keyboardKeys = {k3_p1_q4},
        audioToSpeak = "里面"
    )""",
            f"""    // 5. Soal 5: Mendengar Kalimat (Rule 10: illustrationRes = 0)
    Exercise(
        id = "u20_s3_p1_q5",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Apa yang Anda dengar?",
        targetTranslation = "Di luar saat ini sedang turun hujan lebat.",
        targetHanzi = "外面 现在 正在 下 大雨。",
        targetPinyin = "Wàimiàn xiànzài zhèngzài xià dàyǔ.",
        wordChips = listOf("外面:wàimiàn", "现在:xiànzài", "正在:zhèngzài", "下:xià", "大雨。:dàyǔ.", "里面:lǐmiàn"),
        correctAnswer = "外面,现在,正在,下,大雨。",
        illustrationRes = 0,
        audioToSpeak = "外面现在正在下大雨。"
    )""",
            f"""    // 6. Soal 6: Pilihan Kalimat
    Exercise(
        id = "u20_s3_p1_q6",
        type = ExerciseType.SENTENCE_CHOICE,
        title = "Pilih terjemahan yang benar",
        targetHanzi = "屋子 里面 很 暖和， 外面 很 冷。",
        targetPinyin = "Wūzi lǐmiàn hěn nuǎnhuo, wàimiàn hěn lěng.",
        targetTranslation = "Di dalam ruangan sangat hangat, di luar sangat dingin.",
        correctAnswer = "Wūzi lǐmiàn hěn nuǎnhuo, wàimiàn hěn lěng.\\n屋子 里面 很 暖和， 外面 很 冷。",
        options = listOf(
            "Wūzi lǐmiàn hěn nuǎnhuo, wàimiàn hěn lěng.\\n屋子 里面 很 暖和， 外面 很 冷。",
            "Wūzi lǐmiàn hěn lěng, wàimiàn hěn nuǎnhuo.\\n屋子 里面 很 冷， 外面 很 暖和。",
            "Wūzi wàimiàn méiyǒu rén.\\n屋子 外面 没有 人。"
        ),
        audioToSpeak = "屋子里面很暖和，外面很冷。"
    )""",
            f"""    // 7. Soal 7: Pilihan Gambar (外面 -> di luar)
    Exercise(
        id = "u20_s3_p1_q7",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "外面",
        targetPinyin = "wàimiàn",
        targetTranslation = "bagian luar / di luar",
        correctAnswer = "bagian luar / di luar",
        audioToSpeak = "外面",
        pictureOptions = listOf(
            PictureOption("u20_s3_p1_opt7_1", "di luar", "", R.drawable.ic_pos_out, true),
            PictureOption("u20_s3_p1_opt7_2", "di dalam", "", R.drawable.ic_pos_in, false),
            PictureOption("u20_s3_p1_opt7_3", "di atas", "", R.drawable.ic_pos_up, false),
            PictureOption("u20_s3_p1_opt7_4", "di bawah", "", R.drawable.ic_pos_down, false)
        )
    )""",
            f"""    // 8. Soal 8: Ketik Pinyin (di luar -> wàimiàn)
    Exercise(
        id = "u20_s3_p1_q8",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "bagian luar / di luar",
        sentenceWithBlank = "外面 (________)",
        targetHanzi = "外面",
        targetPinyin = "wàimiàn",
        correctAnswer = "waimian",
        keyboardKeys = {k3_p1_q8},
        audioToSpeak = "外面"
    )""",
            f"""    // 9. Soal 9: Susun Kalimat (Di luar ada siapa?)
    Exercise(
        id = "u20_s3_p1_q9",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Di luar ada siapa?",
        targetHanzi = "外面 有 谁？",
        targetPinyin = "Wàimiàn yǒu shéi?",
        wordChips = listOf("外面:wàimiàn", "有:yǒu", "谁？:shéi?", "里面:lǐmiàn"),
        correctAnswer = "外面,有,谁？",
        audioToSpeak = "外面有谁？"
    )""",
            f"""    // 10. Soal 10: Ketuk Pasangan yang Sesuai (Rangkuman Ruang Dalam & Luar)
    Exercise(
        id = "u20_s3_p1_m10",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u20_s3_p1_m10_1", "里面", "lǐmiàn", "di dalam"),
            MatchPairItem("u20_s3_p1_m10_2", "外面", "wàimiàn", "di luar"),
            MatchPairItem("u20_s3_p1_m10_3", "暖和", "nuǎnhuo", "hangat"),
            MatchPairItem("u20_s3_p1_m10_4", "下雨", "xiàyǔ", "turun hujan")
        )
    )"""
        ],
        "p2": [
            f"""    // 1. Soal 1: Pilihan Gambar (上面 -> bagian atas / di atas)
    Exercise(
        id = "u20_s3_p2_q1",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "上面",
        targetPinyin = "shàngmiàn",
        targetTranslation = "bagian atas / di atas",
        correctAnswer = "bagian atas / di atas",
        audioToSpeak = "上面",
        pictureOptions = listOf(
            PictureOption("u20_s3_p2_opt1", "di atas", "", R.drawable.ic_pos_up, true),
            PictureOption("u20_s3_p2_opt2", "di bawah", "", R.drawable.ic_pos_down, false),
            PictureOption("u20_s3_p2_opt3", "di dalam", "", R.drawable.ic_pos_in, false),
            PictureOption("u20_s3_p2_opt4", "di luar", "", R.drawable.ic_pos_out, false)
        )
    )""",
            f"""    // 2. Soal 2: Susun Kalimat (Di atas meja diletakkan segelas air.)
    Exercise(
        id = "u20_s3_p2_q2",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Di atas meja ada segelas air.",
        targetHanzi = "桌子 上面 放 着 一 杯 水。",
        targetPinyin = "Zhuōzi shàngmiàn fàng zhe yì bēi shuǐ.",
        wordChips = listOf("桌子:zhuōzi", "上面:shàngmiàn", "放:fàng", "着:zhe", "一:yì", "杯:bēi", "水。:shuǐ.", "下面:xiàmiàn"),
        correctAnswer = "桌子,上面,放,着,一,杯,水。",
        audioToSpeak = "桌子上面放着一杯水。"
    )""",
            f"""    // 3. Soal 3: Ketuk Pasangan yang Sesuai (Atas & Bawah)
    Exercise(
        id = "u20_s3_p2_m3",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u20_s3_p2_m1", "上面", "shàngmiàn", "di atas"),
            MatchPairItem("u20_s3_p2_m2", "下面", "xiàmiàn", "di bawah"),
            MatchPairItem("u20_s3_p2_m3", "桌子上", "zhuōzi shàng", "atas meja"),
            MatchPairItem("u20_s3_p2_m4", "椅子下", "yǐzi xià", "bawah kursi")
        )
    )""",
            f"""    // 4. Soal 4: Ketik Pinyin (di atas -> shàngmiàn)
    Exercise(
        id = "u20_s3_p2_q4",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "bagian atas / di atas",
        sentenceWithBlank = "上面 (________)",
        targetHanzi = "上面",
        targetPinyin = "shàngmiàn",
        correctAnswer = "shangmian",
        keyboardKeys = {k3_p2_q4},
        audioToSpeak = "上面"
    )""",
            f"""    // 5. Soal 5: Mendengar Kalimat (Rule 10: illustrationRes = 0)
    Exercise(
        id = "u20_s3_p2_q5",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Apa yang Anda dengar?",
        targetTranslation = "Kucing kecil tidur di bawah kursi.",
        targetHanzi = "小猫 在 椅子 下面 睡觉。",
        targetPinyin = "Xiǎomāo zài yǐzi xiàmiàn shuìjiào.",
        wordChips = listOf("小猫:xiǎomāo", "在:zài", "椅子:yǐzi", "下面:xiàmiàn", "睡觉。:shuìjiào.", "上面:shàngmiàn"),
        correctAnswer = "小猫,在,椅子,下面,睡觉。",
        illustrationRes = 0,
        audioToSpeak = "小猫在椅子下面睡觉。"
    )""",
            f"""    // 6. Soal 6: Pilihan Kalimat
    Exercise(
        id = "u20_s3_p2_q6",
        type = ExerciseType.SENTENCE_CHOICE,
        title = "Pilih terjemahan yang benar",
        targetHanzi = "床 下面 有 一 个 小 盒子。",
        targetPinyin = "Chuáng xiàmiàn yǒu yí gè xiǎo hézi.",
        targetTranslation = "Di bawah ranjang ada sebuah kotak kecil.",
        correctAnswer = "Chuáng xiàmiàn yǒu yí gè xiǎo hézi.\\n床 下面 有 一 个 小 盒子。",
        options = listOf(
            "Chuáng xiàmiàn yǒu yí gè xiǎo hézi.\\n床 下面 有 一 个 小 盒子。",
            "Chuáng shàngmiàn yǒu yí gè xiǎo hézi.\\n床 上面 有 一 个 小 盒子。",
            "Zhuōzi xiàmiàn yǒu yí gè xiǎo hézi.\\n桌子 下面 有 一 个 小 盒子。"
        ),
        audioToSpeak = "床下面有一个小盒子。"
    )""",
            f"""    // 7. Soal 7: Pilihan Gambar (下面 -> di bawah)
    Exercise(
        id = "u20_s3_p2_q7",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "下面",
        targetPinyin = "xiàmiàn",
        targetTranslation = "bagian bawah / di bawah",
        correctAnswer = "bagian bawah / di bawah",
        audioToSpeak = "下面",
        pictureOptions = listOf(
            PictureOption("u20_s3_p2_opt7_1", "di bawah", "", R.drawable.ic_pos_down, true),
            PictureOption("u20_s3_p2_opt7_2", "di atas", "", R.drawable.ic_pos_up, false),
            PictureOption("u20_s3_p2_opt7_3", "di dalam", "", R.drawable.ic_pos_in, false),
            PictureOption("u20_s3_p2_opt7_4", "di luar", "", R.drawable.ic_pos_out, false)
        )
    )""",
            f"""    // 8. Soal 8: Ketik Pinyin (di bawah -> xiàmiàn)
    Exercise(
        id = "u20_s3_p2_q8",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "bagian bawah / di bawah",
        sentenceWithBlank = "下面 (________)",
        targetHanzi = "下面",
        targetPinyin = "xiàmiàn",
        correctAnswer = "xiamian",
        keyboardKeys = {k3_p2_q8},
        audioToSpeak = "下面"
    )""",
            f"""    // 9. Soal 9: Susun Kalimat (Buku diletakkan di atas meja belajar.)
    Exercise(
        id = "u20_s3_p2_q9",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Buku ada di atas meja.",
        targetHanzi = "书 在 桌子 上面。",
        targetPinyin = "Shū zài zhuōzi shàngmiàn.",
        wordChips = listOf("书:shū", "在:zài", "桌子:zhuōzi", "上面。:shàngmiàn.", "下面:xiàmiàn"),
        correctAnswer = "书,在,桌子,上面。",
        audioToSpeak = "书在桌子上面。"
    )""",
            f"""    // 10. Soal 10: Ketuk Pasangan yang Sesuai (Rangkuman Posisi Vertikal)
    Exercise(
        id = "u20_s3_p2_m10",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u20_s3_p2_m10_1", "上面", "shàngmiàn", "di atas"),
            MatchPairItem("u20_s3_p2_m10_2", "下面", "xiàmiàn", "di bawah"),
            MatchPairItem("u20_s3_p2_m3", "放着", "fàng zhe", "diletakkan"),
            MatchPairItem("u20_s3_p2_m4", "睡觉", "shuìjiào", "tidur")
        )
    )"""
        ]
    }

    # =========================================================================
    # STAGE 4: Lantai Gedung & Penataan Ruangan (楼, 间)
    # =========================================================================
    k4_p1_q4 = make_keys("lou")
    k4_p1_q8 = make_keys("wulou")
    k4_p2_q4 = make_keys("jian")
    k4_p2_q8 = make_keys("fangjian")
    
    stages[4] = {
        "p1": [
            f"""    // 1. Soal 1: Pilihan Gambar (楼 -> gedung / lantai gedung)
    Exercise(
        id = "u20_s4_p1_q1",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "楼",
        targetPinyin = "lóu",
        targetTranslation = "gedung / lantai",
        correctAnswer = "gedung / lantai",
        audioToSpeak = "楼",
        pictureOptions = listOf(
            PictureOption("u20_s4_p1_opt1", "gedung", "", R.drawable.ic_work_office_building, true),
            PictureOption("u20_s4_p1_opt2", "rumah", "", R.drawable.ic_fam_home, false),
            PictureOption("u20_s4_p1_opt3", "kamar", "", R.drawable.ic_fam_room, false),
            PictureOption("u20_s4_p1_opt4", "kursi", "", R.drawable.ic_fam_chair, false)
        )
    )""",
            f"""    // 2. Soal 2: Susun Kalimat (Kita pergi ke lantai lima ruang kelas untuk belajar.)
    Exercise(
        id = "u20_s4_p1_q2",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Kita ke lantai lima untuk belajar.",
        targetHanzi = "我们 去 五 楼 上课。",
        targetPinyin = "Wǒmen qù wǔ lóu shàngkè.",
        wordChips = listOf("我们:wǒmen", "去:qù", "五:wǔ", "楼:lóu", "上课。:shàngkè.", "下课:xiàkè"),
        correctAnswer = "我们,去,五,楼,上课。",
        audioToSpeak = "我们去五楼上课。"
    )""",
            f"""    // 3. Soal 3: Ketuk Pasangan yang Sesuai (Lantai & Gedung)
    Exercise(
        id = "u20_s4_p1_q3",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u20_s4_p1_m1", "楼", "lóu", "gedung / lantai"),
            MatchPairItem("u20_s4_p1_m2", "上楼", "shàng lóu", "naik lantai"),
            MatchPairItem("u20_s4_p1_m3", "下楼", "xià lóu", "turun lantai"),
            MatchPairItem("u20_s4_p1_m4", "大楼", "dàlóu", "gedung bertingkat")
        )
    )""",
            f"""    // 4. Soal 4: Ketik Pinyin (gedung/lantai -> lóu)
    Exercise(
        id = "u20_s4_p1_q4",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "gedung / lantai",
        sentenceWithBlank = "楼 (________)",
        targetHanzi = "楼",
        targetPinyin = "lóu",
        correctAnswer = "lou",
        keyboardKeys = {k4_p1_q4},
        audioToSpeak = "楼"
    )""",
            f"""    // 5. Soal 5: Mendengar Kalimat (Rule 10: illustrationRes = 0)
    Exercise(
        id = "u20_s4_p1_q5",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Apa yang Anda dengar?",
        targetTranslation = "Dia tinggal di lantai tiga.",
        targetHanzi = "他 住 在 三 楼。",
        targetPinyin = "Tā zhù zài sān lóu.",
        wordChips = listOf("他:tā", "住:zhù", "在:zài", "三:sān", "楼。:lóu.", "四:sì"),
        correctAnswer = "他,住,在,三,楼。",
        illustrationRes = 0,
        audioToSpeak = "他住在三楼。"
    )""",
            f"""    // 6. Soal 6: Pilihan Kalimat
    Exercise(
        id = "u20_s4_p1_q6",
        type = ExerciseType.SENTENCE_CHOICE,
        title = "Pilih terjemahan yang benar",
        targetHanzi = "这 栋 大楼 一共 有 二十 层。",
        targetPinyin = "Zhè dòng dàlóu yígòng yǒu èrshí céng.",
        targetTranslation = "Gedung ini secara keseluruhan memiliki dua puluh lantai.",
        correctAnswer = "Zhè dòng dàlóu yígòng yǒu èrshí céng.\\n这 栋 大楼 一共 有 二十 层。",
        options = listOf(
            "Zhè dòng dàlóu yígòng yǒu èrshí céng.\\n这 栋 大楼 一共 有 二十 层。",
            "Zhè dòng dàlóu yígòng yǒu shí céng.\\n这 栋 大楼 一共 有 十 层。",
            "Nà dòng dàlóu yígòng yǒu èrshí céng.\\n那 栋 大楼 一共 有 二十 层。"
        ),
        audioToSpeak = "这栋大楼一共有二十层。"
    )""",
            f"""    // 7. Soal 7: Pilihan Gambar (大楼 -> gedung bertingkat)
    Exercise(
        id = "u20_s4_p1_q7",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "大楼",
        targetPinyin = "dàlóu",
        targetTranslation = "gedung bertingkat",
        correctAnswer = "gedung bertingkat",
        audioToSpeak = "大楼",
        pictureOptions = listOf(
            PictureOption("u20_s4_p1_opt7_1", "gedung", "", R.drawable.ic_work_office_building, true),
            PictureOption("u20_s4_p1_opt7_2", "rumah", "", R.drawable.ic_fam_home, false),
            PictureOption("u20_s4_p1_opt7_3", "kamar", "", R.drawable.ic_fam_room, false),
            PictureOption("u20_s4_p1_opt7_4", "kursi", "", R.drawable.ic_fam_chair, false)
        )
    )""",
            f"""    // 8. Soal 8: Ketik Pinyin (lantai lima -> wǔlóu)
    Exercise(
        id = "u20_s4_p1_q8",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "lantai lima",
        sentenceWithBlank = "五楼 (________)",
        targetHanzi = "五楼",
        targetPinyin = "wǔlóu",
        correctAnswer = "wulou",
        keyboardKeys = {k4_p1_q8},
        audioToSpeak = "五楼"
    )""",
            f"""    // 9. Soal 9: Susun Kalimat (Tolong naik ke lantai atas mencari guru.)
    Exercise(
        id = "u20_s4_p1_q9",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Silakan naik ke atas cari guru.",
        targetHanzi = "请 上 楼 找 老师。",
        targetPinyin = "Qǐng shàng lóu zhǎo lǎoshī.",
        wordChips = listOf("请:qǐng", "上:shàng", "楼:lóu", "找:zhǎo", "老师。:lǎoshī.", "下:xià"),
        correctAnswer = "请,上,楼,找,老师。",
        audioToSpeak = "请上楼找老师。"
    )""",
            f"""    // 10. Soal 10: Ketuk Pasangan yang Sesuai (Rangkuman Lantai Gedung)
    Exercise(
        id = "u20_s4_p1_m10",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u20_s4_p1_m10_1", "楼", "lóu", "gedung / lantai"),
            MatchPairItem("u20_s4_p1_m10_2", "三楼", "sān lóu", "lantai tiga"),
            MatchPairItem("u20_s4_p1_m10_3", "上楼去", "shàng lóu qù", "naik ke atas"),
            MatchPairItem("u20_s4_p1_m10_4", "找老师", "zhǎo lǎoshī", "mencari guru")
        )
    )"""
        ],
        "p2": [
            f"""    // 1. Soal 1: Pilihan Gambar (间 -> kata penggolong kamar/ruangan)
    Exercise(
        id = "u20_s4_p2_q1",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "间",
        targetPinyin = "jiān",
        targetTranslation = "ruangan / kamar",
        correctAnswer = "ruangan / kamar",
        audioToSpeak = "间",
        pictureOptions = listOf(
            PictureOption("u20_s4_p2_opt1", "ruangan", "", R.drawable.ic_fam_room, true),
            PictureOption("u20_s4_p2_opt2", "gedung", "", R.drawable.ic_work_office_building, false),
            PictureOption("u20_s4_p2_opt3", "rumah", "", R.drawable.ic_fam_home, false),
            PictureOption("u20_s4_p2_opt4", "kursi", "", R.drawable.ic_fam_chair, false)
        )
    )""",
            f"""    // 2. Soal 2: Susun Kalimat (Di gedung ini ada 30 kamar.)
    Exercise(
        id = "u20_s4_p2_q2",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Di gedung ini ada 30 kamar.",
        targetHanzi = "这 栋 楼 里 有 三十 间 房间。",
        targetPinyin = "Zhè dòng lóu lǐ yǒu sānshí jiān fángjiān.",
        wordChips = listOf("这:zhè", "栋:dòng", "楼:lóu", "里:lǐ", "有:yǒu", "三十:sānshí", "间:jiān", "房间。:fángjiān."),
        correctAnswer = "这,栋,楼,里,有,三十,间,房间。",
        audioToSpeak = "这栋楼里有三十间房间。"
    )""",
            f"""    // 3. Soal 3: Ketuk Pasangan yang Sesuai (Kamar & Ruang Kelas)
    Exercise(
        id = "u20_s4_p2_m3",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u20_s4_p2_m1", "间", "jiān", "penggolong kamar"),
            MatchPairItem("u20_s4_p2_m2", "一间", "yì jiān", "sebuah kamar"),
            MatchPairItem("u20_s4_p2_m3", "教室", "jiàoshì", "ruang kelas"),
            MatchPairItem("u20_s4_p2_m4", "房间", "fángjiān", "kamar")
        )
    )""",
            f"""    // 4. Soal 4: Ketik Pinyin (penggolong ruangan -> jiān)
    Exercise(
        id = "u20_s4_p2_q4",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "ruangan / kamar",
        sentenceWithBlank = "间 (________)",
        targetHanzi = "间",
        targetPinyin = "jiān",
        correctAnswer = "jian",
        keyboardKeys = {k4_p2_q4},
        audioToSpeak = "间"
    )""",
            f"""    // 5. Soal 5: Mendengar Kalimat (Rule 10: illustrationRes = 0)
    Exercise(
        id = "u20_s4_p2_q5",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Apa yang Anda dengar?",
        targetTranslation = "Lantai tiga memiliki sebuah ruang kelas yang besar.",
        targetHanzi = "三 楼 有 一 间 大 教室。",
        targetPinyin = "Sān lóu yǒu yì jiān dà jiàoshì.",
        wordChips = listOf("三:sān", "楼:lóu", "有:yǒu", "一:yì", "间:jiān", "大:dà", "教室。:jiàoshì.", "小:xiǎo"),
        correctAnswer = "三,楼,有,一,间,大,教室。",
        illustrationRes = 0,
        audioToSpeak = "三楼有一间大教室。"
    )""",
            f"""    // 6. Soal 6: Pilihan Kalimat
    Exercise(
        id = "u20_s4_p2_q6",
        type = ExerciseType.SENTENCE_CHOICE,
        title = "Pilih terjemahan yang benar",
        targetHanzi = "这 间 房间 很 干净。",
        targetPinyin = "Zhè jiān fángjiān hěn gānjìng.",
        targetTranslation = "Kamar ini sangat bersih.",
        correctAnswer = "Zhè jiān fángjiān hěn gānjìng.\\n这 间 房间 很 干净。",
        options = listOf(
            "Zhè jiān fángjiān hěn gānjìng.\\n这 间 房间 很 干净。",
            "Nà jiān fángjiān hěn zāng.\\n那 间 房间 很 脏。",
            "Zhè dòng lóu hěn gānjìng.\\n这 栋 楼 很 干净。"
        ),
        audioToSpeak = "这间房间很干净。"
    )""",
            f"""    // 7. Soal 7: Pilihan Gambar (房间 -> kamar)
    Exercise(
        id = "u20_s4_p2_q7",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "房间",
        targetPinyin = "fángjiān",
        targetTranslation = "kamar",
        correctAnswer = "kamar",
        audioToSpeak = "房间",
        pictureOptions = listOf(
            PictureOption("u20_s4_p2_opt7_1", "kamar", "", R.drawable.ic_fam_room, true),
            PictureOption("u20_s4_p2_opt7_2", "gedung", "", R.drawable.ic_work_office_building, false),
            PictureOption("u20_s4_p2_opt7_3", "rumah", "", R.drawable.ic_fam_home, false),
            PictureOption("u20_s4_p2_opt7_4", "kursi", "", R.drawable.ic_fam_chair, false)
        )
    )""",
            f"""    // 8. Soal 8: Ketik Pinyin (kamar -> fángjiān)
    Exercise(
        id = "u20_s4_p2_q8",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "kamar",
        sentenceWithBlank = "房间 (________)",
        targetHanzi = "房间",
        targetPinyin = "fángjiān",
        correctAnswer = "fangjian",
        keyboardKeys = {k4_p2_q8},
        audioToSpeak = "房间"
    )""",
            f"""    // 9. Soal 9: Susun Kalimat (Hotel ini memiliki banyak kamar.)
    Exercise(
        id = "u20_s4_p2_q9",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Hotel ini punya banyak kamar.",
        targetHanzi = "这家 酒店 有 很多 间 房。",
        targetPinyin = "Zhè jiā jiǔdiàn yǒu hěn duō jiān fáng.",
        wordChips = listOf("这家:zhè jiā", "酒店:jiǔdiàn", "有:yǒu", "很多:hěn duō", "间:jiān", "房。:fáng.", "少:shǎo"),
        correctAnswer = "这家,酒店,有,很多,间,房。",
        audioToSpeak = "这家酒店有很多间房。"
    )""",
            f"""    // 10. Soal 10: Ketuk Pasangan yang Sesuai (Rangkuman Penggolong Kamar)
    Exercise(
        id = "u20_s4_p2_m10",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u20_s4_p2_m10_1", "间", "jiān", "kamar (satuan)"),
            MatchPairItem("u20_s4_p2_m10_2", "房间", "fángjiān", "kamar tidur"),
            MatchPairItem("u20_s4_p2_m10_3", "大教室", "dà jiàoshì", "kelas besar"),
            MatchPairItem("u20_s4_p2_m10_4", "干干净净", "gān gān jìng jìng", "bersih rapi")
        )
    )"""
        ]
    }

    # =========================================================================
    # STAGE 5: Evaluasi Komprehensif Posisi & Tata Ruang (Sintesis Seluruh Bab 20)
    # =========================================================================
    k5_p1_q4 = make_keys("zuobian")
    k5_p1_q8 = make_keys("qianmian")
    k5_p2_q4 = make_keys("shangmian")
    k5_p2_q8 = make_keys("lou")
    
    stages[5] = {
        "p1": [
            f"""    // 1. Soal 1: Pilihan Gambar (左边 -> sebelah kiri)
    Exercise(
        id = "u20_s5_p1_q1",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "左边",
        targetPinyin = "zuǒbian",
        targetTranslation = "sebelah kiri",
        correctAnswer = "sebelah kiri",
        audioToSpeak = "左边",
        pictureOptions = listOf(
            PictureOption("u20_s5_p1_opt1", "sebelah kiri", "", R.drawable.ic_pos_left, true),
            PictureOption("u20_s5_p1_opt2", "sebelah kanan", "", R.drawable.ic_pos_right, false),
            PictureOption("u20_s5_p1_opt3", "di depan", "", R.drawable.ic_pos_front, false),
            PictureOption("u20_s5_p1_opt4", "di belakang", "", R.drawable.ic_pos_back, false)
        )
    )""",
            f"""    // 2. Soal 2: Susun Kalimat (Di sebelah kiri ada toko buku, di sebelah kanan ada sekolah.)
    Exercise(
        id = "u20_s5_p1_q2",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Kiri ada toko buku, kanan ada sekolah.",
        targetHanzi = "左边 是 书店， 右边 是 学校。",
        targetPinyin = "Zuǒbian shì shūdiàn, yòubian shì xuéxiào.",
        wordChips = listOf("左边:zuǒbian", "是:shì", "书店，:shūdiàn,", "右边:yòubian", "是:shì", "学校。:xuéxiào.", "医院:yīyuàn"),
        correctAnswer = "左边,是,书店，,右边,是,学校。",
        audioToSpeak = "左边是书店，右边是学校。"
    )""",
            f"""    // 3. Soal 3: Ketuk Pasangan yang Sesuai (Sintesis Kiri Kanan Depan Belakang)
    Exercise(
        id = "u20_s5_p1_m3",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u20_s5_p1_m1", "左边", "zuǒbian", "sebelah kiri"),
            MatchPairItem("u20_s5_p1_m2", "右边", "yòubian", "sebelah kanan"),
            MatchPairItem("u20_s5_p1_m3", "前面", "qiánmiàn", "di depan"),
            MatchPairItem("u20_s5_p1_m4", "后面", "hòumiàn", "di belakang")
        )
    )""",
            f"""    // 4. Soal 4: Ketik Pinyin (sebelah kiri -> zuǒbian)
    Exercise(
        id = "u20_s5_p1_q4",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "sebelah kiri",
        sentenceWithBlank = "左边 (________)",
        targetHanzi = "左边",
        targetPinyin = "zuǒbian",
        correctAnswer = "zuobian",
        keyboardKeys = {k5_p1_q4},
        audioToSpeak = "左边"
    )""",
            f"""    // 5. Soal 5: Mendengar Kalimat (Rule 10: illustrationRes = 0)
    Exercise(
        id = "u20_s5_p1_q5",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Apa yang Anda dengar?",
        targetTranslation = "Rumah sakit berada di depan stasiun.",
        targetHanzi = "医院 在 车站 前面。",
        targetPinyin = "Yīyuàn zài chēzhàn qiánmiàn.",
        wordChips = listOf("医院:yīyuàn", "在:zài", "车站:chēzhàn", "前面。:qiánmiàn.", "后面:hòumiàn"),
        correctAnswer = "医院,在,车站,前面。",
        illustrationRes = 0,
        audioToSpeak = "医院在车站前面。"
    )""",
            f"""    // 6. Soal 6: Pilihan Kalimat
    Exercise(
        id = "u20_s5_p1_q6",
        type = ExerciseType.SENTENCE_CHOICE,
        title = "Pilih terjemahan yang benar",
        targetHanzi = "他 坐 在 我 的 旁边。",
        targetPinyin = "Tā zuò zài wǒ de pángbiān.",
        targetTranslation = "Dia duduk di samping saya.",
        correctAnswer = "Tā zuò zài wǒ de pángbiān.\\n他 坐 在 我 的 旁边。",
        options = listOf(
            "Tā zuò zài wǒ de pángbiān.\\n他 坐 在 我 的 旁边。",
            "Wǒ zuò zài tā de hòumiàn.\\n我 坐 在 他 的 后面。",
            "Tā zuò zài wǒ de qiánmiàn.\\n他 坐 在 我 的 前面。"
        ),
        audioToSpeak = "他坐在我的旁边。"
    )""",
            f"""    // 7. Soal 7: Pilihan Gambar (前面 -> di depan)
    Exercise(
        id = "u20_s5_p1_q7",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "前面",
        targetPinyin = "qiánmiàn",
        targetTranslation = "bagian depan / di depan",
        correctAnswer = "bagian depan / di depan",
        audioToSpeak = "前面",
        pictureOptions = listOf(
            PictureOption("u20_s5_p1_opt7_1", "di depan", "", R.drawable.ic_pos_front, true),
            PictureOption("u20_s5_p1_opt7_2", "di belakang", "", R.drawable.ic_pos_back, false),
            PictureOption("u20_s5_p1_opt7_3", "di kanan", "", R.drawable.ic_pos_right, false),
            PictureOption("u20_s5_p1_opt7_4", "di kiri", "", R.drawable.ic_pos_left, false)
        )
    )""",
            f"""    // 8. Soal 8: Ketik Pinyin (di depan -> qiánmiàn)
    Exercise(
        id = "u20_s5_p1_q8",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "bagian depan / di depan",
        sentenceWithBlank = "前面 (________)",
        targetHanzi = "前面",
        targetPinyin = "qiánmiàn",
        correctAnswer = "qianmian",
        keyboardKeys = {k5_p1_q8},
        audioToSpeak = "前面"
    )""",
            f"""    // 9. Soal 9: Susun Kalimat (Di belakang ada siapa?)
    Exercise(
        id = "u20_s5_p1_q9",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Di belakang ada siapa?",
        targetHanzi = "后面 有 谁？",
        targetPinyin = "Hòumiàn yǒu shéi?",
        wordChips = listOf("后面:hòumiàn", "有:yǒu", "谁？:shéi?", "前面:qiánmiàn"),
        correctAnswer = "后面,有,谁？",
        audioToSpeak = "后面有谁？"
    )""",
            f"""    // 10. Soal 10: Ketuk Pasangan yang Sesuai (Rangkuman Sintesis 1)
    Exercise(
        id = "u20_s5_p1_m10",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u20_s5_p1_m10_1", "左边", "zuǒbian", "sebelah kiri"),
            MatchPairItem("u20_s5_p1_m10_2", "右边", "yòubian", "sebelah kanan"),
            MatchPairItem("u20_s5_p1_m10_3", "旁边", "pángbiān", "di samping"),
            MatchPairItem("u20_s5_p1_m10_4", "前面", "qiánmiàn", "di depan")
        )
    )"""
        ],
        "p2": [
            f"""    // 1. Soal 1: Pilihan Gambar (上面 -> bagian atas / di atas)
    Exercise(
        id = "u20_s5_p2_q1",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "上面",
        targetPinyin = "shàngmiàn",
        targetTranslation = "bagian atas / di atas",
        correctAnswer = "bagian atas / di atas",
        audioToSpeak = "上面",
        pictureOptions = listOf(
            PictureOption("u20_s5_p2_opt1", "di atas", "", R.drawable.ic_pos_up, true),
            PictureOption("u20_s5_p2_opt2", "di bawah", "", R.drawable.ic_pos_down, false),
            PictureOption("u20_s5_p2_opt3", "di dalam", "", R.drawable.ic_pos_in, false),
            PictureOption("u20_s5_p2_opt4", "di luar", "", R.drawable.ic_pos_out, false)
        )
    )""",
            f"""    // 2. Soal 2: Susun Kalimat (Di atas meja ada sebuah buku dan sebuah tas.)
    Exercise(
        id = "u20_s5_p2_q2",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Di atas meja ada buku dan tas.",
        targetHanzi = "桌子 上面 有 书 和 包。",
        targetPinyin = "Zhuōzi shàngmiàn yǒu shū hé bāo.",
        wordChips = listOf("桌子:zhuōzi", "上面:shàngmiàn", "有:yǒu", "书:shū", "和:hé", "包。:bāo.", "下面:xiàmiàn"),
        correctAnswer = "桌子,上面,有,书,和,包。",
        audioToSpeak = "桌子上面有书和包。"
    )""",
            f"""    // 3. Soal 3: Ketuk Pasangan yang Sesuai (Grand Sintesis Bab 20)
    Exercise(
        id = "u20_s5_p2_m3",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u20_s5_p2_m1", "上面", "shàngmiàn", "di atas"),
            MatchPairItem("u20_s5_p2_m2", "下面", "xiàmiàn", "di bawah"),
            MatchPairItem("u20_s5_p2_m3", "楼上", "lóushàng", "lantai atas"),
            MatchPairItem("u20_s5_p2_m4", "一间房", "yì jiān fáng", "sebuah kamar")
        )
    )""",
            f"""    // 4. Soal 4: Ketik Pinyin (di atas -> shàngmiàn)
    Exercise(
        id = "u20_s5_p2_q4",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "bagian atas / di atas",
        sentenceWithBlank = "上面 (________)",
        targetHanzi = "上面",
        targetPinyin = "shàngmiàn",
        correctAnswer = "shangmian",
        keyboardKeys = {k5_p2_q4},
        audioToSpeak = "上面"
    )""",
            f"""    // 5. Soal 5: Mendengar Kalimat (Rule 10: illustrationRes = 0)
    Exercise(
        id = "u20_s5_p2_q5",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Apa yang Anda dengar?",
        targetTranslation = "Kamar saya berada di lantai tiga.",
        targetHanzi = "我 的 房间 在 三 楼。",
        targetPinyin = "Wǒ de fángjiān zài sān lóu.",
        wordChips = listOf("我:wǒ", "的:de", "房间:fángjiān", "在:zài", "三:sān", "楼。:lóu.", "二:èr"),
        correctAnswer = "我,的,房间,在,三,楼。",
        illustrationRes = 0,
        audioToSpeak = "我的房间在三楼。"
    )""",
            f"""    // 6. Soal 6: Pilihan Kalimat
    Exercise(
        id = "u20_s5_p2_q6",
        type = ExerciseType.SENTENCE_CHOICE,
        title = "Pilih terjemahan yang benar",
        targetHanzi = "请 进 房间 里面 坐。",
        targetPinyin = "Qǐng jìn fángjiān lǐmiàn zuò.",
        targetTranslation = "Silakan masuk ke dalam kamar dan duduk.",
        correctAnswer = "Qǐng jìn fángjiān lǐmiàn zuò.\\n请 进 房间 里面 坐。",
        options = listOf(
            "Qǐng jìn fángjiān lǐmiàn zuò.\\n请 进 房间 里面 坐。",
            "Qǐng zài fángjiān wàimiàn děng.\\n请 在 房间 外面 等。",
            "Qǐng jìn jiàoshì lǐmiàn zuò.\\n请 进 教室 里面 坐。"
        ),
        audioToSpeak = "请进房间里面坐。"
    )""",
            f"""    // 7. Soal 7: Pilihan Gambar (大楼 -> gedung bertingkat)
    Exercise(
        id = "u20_s5_p2_q7",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "大楼",
        targetPinyin = "dàlóu",
        targetTranslation = "gedung bertingkat",
        correctAnswer = "gedung bertingkat",
        audioToSpeak = "大楼",
        pictureOptions = listOf(
            PictureOption("u20_s5_p2_opt7_1", "gedung", "", R.drawable.ic_work_office_building, true),
            PictureOption("u20_s5_p2_opt7_2", "kamar", "", R.drawable.ic_fam_room, false),
            PictureOption("u20_s5_p2_opt7_3", "rumah", "", R.drawable.ic_fam_home, false),
            PictureOption("u20_s5_p2_opt7_4", "kursi", "", R.drawable.ic_fam_chair, false)
        )
    )""",
            f"""    // 8. Soal 8: Ketik Pinyin (gedung/lantai -> lóu)
    Exercise(
        id = "u20_s5_p2_q8",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "gedung / lantai",
        sentenceWithBlank = "楼 (________)",
        targetHanzi = "楼",
        targetPinyin = "lóu",
        correctAnswer = "lou",
        keyboardKeys = {k5_p2_q8},
        audioToSpeak = "楼"
    )""",
            f"""    // 9. Soal 9: Susun Kalimat (Di dalam kamar ada dua buah kursi.)
    Exercise(
        id = "u20_s5_p2_q9",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Di dalam kamar ada dua kursi.",
        targetHanzi = "房间 里面 有 两 把 椅子。",
        targetPinyin = "Fángjiān lǐmiàn yǒu liǎng bǎ yǐzi.",
        wordChips = listOf("房间:fángjiān", "里面:lǐmiàn", "有:yǒu", "两:liǎng", "把:bǎ", "椅子。:yǐzi.", "一张:yì zhāng"),
        correctAnswer = "房间,里面,有,两,把,椅子。",
        audioToSpeak = "房间里面有两把椅子。"
    )""",
            f"""    // 10. Soal 10: Ketuk Pasangan yang Sesuai (Grand Review Final Bab 20)
    Exercise(
        id = "u20_s5_p2_m10",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u20_s5_p2_m10_1", "里面外面", "lǐmiàn wàimiàn", "dalam dan luar"),
            MatchPairItem("u20_s5_p2_m10_2", "上面下面", "shàngmiàn xiàmiàn", "atas dan bawah"),
            MatchPairItem("u20_s5_p2_m10_3", "五层楼", "wǔ céng lóu", "lima lantai"),
            MatchPairItem("u20_s5_p2_m10_4", "进房间", "jìn fángjiān", "masuk kamar")
        )
    )"""
        ]
    }

    for s_idx in range(1, 6):
        filename = f"{base_dir}/Bab20Stage{s_idx}Data.kt"
        p1_code = ",\n\n".join(stages[s_idx]["p1"])
        p2_code = ",\n\n".join(stages[s_idx]["p2"])
        
        content = f"""package com.example.chineselearning.data.repository

import com.example.chineselearning.R
import com.example.chineselearning.data.model.Exercise
import com.example.chineselearning.data.model.ExerciseType
import com.example.chineselearning.data.model.MatchPairItem
import com.example.chineselearning.data.model.PictureOption

val bab20Stage{s_idx}Part1Exercises = listOf(
{p1_code}
)

val bab20Stage{s_idx}Part2Exercises = listOf(
{p2_code}
)
"""
        with open(filename, "w", encoding="utf-8") as f:
            f.write(content)
        print(f"Written {filename}")

if __name__ == "__main__":
    generate_bab20()
