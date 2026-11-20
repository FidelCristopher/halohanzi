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

def generate_bab27():
    base_dir = "app/src/main/java/com/example/chineselearning/data/repository"
    
    stages = {}
    
    # =========================================================================
    # STAGE 1: Bakat Seni & Melukis (爱好, 画)
    # =========================================================================
    k1_p1_q4 = make_keys("aihao")
    k1_p1_q8 = make_keys("hua")
    k1_p2_q4 = make_keys("huahua")
    k1_p2_q8 = make_keys("yifu")
    
    stages[1] = {
        "p1": [
            f"""    // 1. Soal 1: Pilihan Gambar (画 -> melukis / menggambar)
    Exercise(
        id = "u27_s1_p1_q1",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "画",
        targetPinyin = "huà",
        targetTranslation = "menggambar / melukis",
        correctAnswer = "menggambar / melukis",
        audioToSpeak = "画",
        pictureOptions = listOf(
            PictureOption("u27_s1_p1_opt1", "melukis", "", R.drawable.ic_hobby_painting, true),
            PictureOption("u27_s1_p1_opt2", "bunga", "", R.drawable.ic_nature_flower_bloom, false),
            PictureOption("u27_s1_p1_opt3", "burung", "", R.drawable.ic_nature_bird_singing, false),
            PictureOption("u27_s1_p1_opt4", "internet", "", R.drawable.ic_digi_surf_internet, false)
        )
    )""",
            f"""    // 2. Soal 2: Susun Kalimat (Hobi saya di waktu luang adalah melukis.)
    Exercise(
        id = "u27_s1_p1_q2",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Hobi saya adalah melukis.",
        targetHanzi = "我 的 爱好 是 画画。",
        targetPinyin = "Wǒ de àihào shì huàhuà.",
        wordChips = listOf("我:wǒ", "的:de", "爱好:àihào", "是:shì", "画画。:huàhuà.", "唱歌:chànggē"),
        correctAnswer = "我,的,爱好,是,画画。",
        audioToSpeak = "我的爱好是画画。"
    )""",
            f"""    // 3. Soal 3: Ketuk Pasangan yang Sesuai (Hobi & Melukis)
    Exercise(
        id = "u27_s1_p1_q3",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u27_s1_p1_m1", "爱好", "àihào", "hobi / kegemaran"),
            MatchPairItem("u27_s1_p1_m2", "画", "huà", "melukis / gambar"),
            MatchPairItem("u27_s1_p1_m3", "画画", "huàhuà", "menggambar"),
            MatchPairItem("u27_s1_p1_m4", "真可爱", "zhēn kě'ài", "lucu sekali")
        )
    )""",
            f"""    // 4. Soal 4: Ketik Pinyin (hobi -> àihào)
    Exercise(
        id = "u27_s1_p1_q4",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "hobi / kegemaran",
        sentenceWithBlank = "爱好 (________)",
        targetHanzi = "爱好",
        targetPinyin = "àihào",
        correctAnswer = "aihao",
        keyboardKeys = {k1_p1_q4},
        audioToSpeak = "爱好"
    )""",
            f"""    // 5. Soal 5: Mendengar Kalimat (Rule 10: illustrationRes = 0)
    Exercise(
        id = "u27_s1_p1_q5",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Apa yang Anda dengar?",
        targetTranslation = "Kucing kecil yang digambar adik perempuan sungguh lucu.",
        targetHanzi = "妹妹 画 的 小猫 真 可爱。",
        targetPinyin = "Mèimei huà de xiǎomāo zhēn kě'ài.",
        wordChips = listOf("妹妹:mèimei", "画:huà", "的:de", "小猫:xiǎomāo", "真:zhēn", "可爱。:kě'ài.", "小狗:xiǎogǒu"),
        correctAnswer = "妹妹,画,的,小猫,真,可爱。",
        illustrationRes = 0,
        audioToSpeak = "妹妹画的小猫真可爱。"
    )""",
            f"""    // 6. Soal 6: Pilihan Kalimat
    Exercise(
        id = "u27_s1_p1_q6",
        type = ExerciseType.SENTENCE_CHOICE,
        title = "Pilih terjemahan yang benar",
        targetHanzi = "你 有 什么 业余 爱好？",
        targetPinyin = "Nǐ yǒu shénme yèyú àihào?",
        targetTranslation = "Kamu punya hobi apa di waktu luang?",
        correctAnswer = "Nǐ yǒu shénme yèyú àihào?\\n你 有 什么 业余 爱好？",
        options = listOf(
            "Nǐ yǒu shénme yèyú àihào?\\n你 有 什么 业余 爱好？",
            "Nǐ xǐhuan shénme yùndòng?\\n你 喜欢 什么 运动？",
            "Tā yǒu shénme yèyú àihào?\\n他 有 什么 业余 爱好？"
        ),
        audioToSpeak = "你有什么业余爱好？"
    )""",
            f"""    // 7. Soal 7: Pilihan Gambar (爱好 -> hobi seni)
    Exercise(
        id = "u27_s1_p1_q7",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "爱好",
        targetPinyin = "àihào",
        targetTranslation = "hobi",
        correctAnswer = "hobi",
        audioToSpeak = "爱好",
        pictureOptions = listOf(
            PictureOption("u27_s1_p1_opt7_1", "hobi", "", R.drawable.ic_hobby_painting, true),
            PictureOption("u27_s1_p1_opt7_2", "bunga", "", R.drawable.ic_nature_flower_bloom, false),
            PictureOption("u27_s1_p1_opt7_3", "musik", "", R.drawable.ic_digi_music_sing, false),
            PictureOption("u27_s1_p1_opt7_4", "foto", "", R.drawable.ic_digi_camera_photo, false)
        )
    )""",
            f"""    // 8. Soal 8: Ketik Pinyin (melukis/gambar -> huà)
    Exercise(
        id = "u27_s1_p1_q8",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "menggambar / lukisan",
        sentenceWithBlank = "画 (________)",
        targetHanzi = "画",
        targetPinyin = "huà",
        correctAnswer = "hua",
        keyboardKeys = {k1_p1_q8},
        audioToSpeak = "画"
    )""",
            f"""    // 9. Soal 9: Susun Kalimat (Dia melukis pemandangan gunung dengan sangat indah.)
    Exercise(
        id = "u27_s1_p1_q9",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Dia melukis sangat bagus.",
        targetHanzi = "他 画 得 很 好看。",
        targetPinyin = "Tā huà de hěn hǎokàn.",
        wordChips = listOf("他:tā", "画:huà", "得:de", "很:hěn", "好看。:hǎokàn.", "快:kuài"),
        correctAnswer = "他,画,得,很,好看。",
        audioToSpeak = "他画得很好看。"
    )""",
            f"""    // 10. Soal 10: Ketuk Pasangan yang Sesuai (Rangkuman Hobi Seni)
    Exercise(
        id = "u27_s1_p1_m10",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u27_s1_p1_m10_1", "爱好", "àihào", "kegemaran"),
            MatchPairItem("u27_s1_p1_m10_2", "画画儿", "huàhuàr", "melukis gambar"),
            MatchPairItem("u27_s1_p1_m10_3", "一幅画", "yì fú huà", "sebuah lukisan"),
            MatchPairItem("u27_s1_p1_m10_4", "真好看", "zhēn hǎokàn", "sangat elok")
        )
    )"""
        ],
        "p2": [
            f"""    // 1. Soal 1: Pilihan Gambar (画画 -> menggambar lukisan)
    Exercise(
        id = "u27_s1_p2_q1",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "画画",
        targetPinyin = "huàhuà",
        targetTranslation = "menggambar",
        correctAnswer = "menggambar",
        audioToSpeak = "画画",
        pictureOptions = listOf(
            PictureOption("u27_s1_p2_opt1", "menggambar", "", R.drawable.ic_hobby_painting, true),
            PictureOption("u27_s1_p2_opt2", "internet", "", R.drawable.ic_digi_surf_internet, false),
            PictureOption("u27_s1_p2_opt3", "burung", "", R.drawable.ic_nature_bird_singing, false),
            PictureOption("u27_s1_p2_opt4", "musik", "", R.drawable.ic_digi_music_sing, false)
        )
    )""",
            f"""    // 2. Soal 2: Susun Kalimat (Saya suka menggambar lukisan tradisional Tiongkok.)
    Exercise(
        id = "u27_s1_p2_q2",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Saya suka melukis lukisan Cina.",
        targetHanzi = "我 喜欢 画 中国画。",
        targetPinyin = "Wǒ xǐhuan huà Zhōngguóhuà.",
        wordChips = listOf("我:wǒ", "喜欢:xǐhuan", "画:huà", "中国画。:Zhōngguóhuà.", "油画:yóuhuà"),
        correctAnswer = "我,喜欢,画,中国画。",
        audioToSpeak = "我喜欢画中国画。"
    )""",
            f"""    // 3. Soal 3: Ketuk Pasangan yang Sesuai (Lukisan & Gambar)
    Exercise(
        id = "u27_s1_p2_m3",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u27_s1_p2_m1", "画画", "huàhuà", "menggambar"),
            MatchPairItem("u27_s1_p2_m2", "中国画", "Zhōngguóhuà", "lukisan Cina"),
            MatchPairItem("u27_s1_p2_m3", "学画画", "xué huàhuà", "belajar melukis"),
            MatchPairItem("u27_s1_p2_m4", "很美丽", "hěn měilì", "sangat indah")
        )
    )""",
            f"""    // 4. Soal 4: Ketik Pinyin (menggambar -> huàhuà)
    Exercise(
        id = "u27_s1_p2_q4",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "menggambar / melukis",
        sentenceWithBlank = "画画 (________)",
        targetHanzi = "画画",
        targetPinyin = "huàhuà",
        correctAnswer = "huahua",
        keyboardKeys = {k1_p2_q4},
        audioToSpeak = "画画"
    )""",
            f"""    // 5. Soal 5: Mendengar Kalimat (Rule 10: illustrationRes = 0)
    Exercise(
        id = "u27_s1_p2_q5",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Apa yang Anda dengar?",
        targetTranslation = "Lukisan ini digambar oleh ayah saya.",
        targetHanzi = "这 幅 画 是 爸爸 画 的。",
        targetPinyin = "Zhè fú huà shì bàba huà de.",
        wordChips = listOf("这:zhè", "幅:fú", "画:huà", "是:shì", "爸爸:bàba", "画:huà", "的。:de.", "妈妈:māma"),
        correctAnswer = "这,幅,画,是,爸爸,画,的。",
        illustrationRes = 0,
        audioToSpeak = "这幅画是爸爸画的。"
    )""",
            f"""    // 6. Soal 6: Pilihan Kalimat
    Exercise(
        id = "u27_s1_p2_q6",
        type = ExerciseType.SENTENCE_CHOICE,
        title = "Pilih terjemahan yang benar",
        targetHanzi = "墙 上 挂 着 一 幅 漂亮 的 画。",
        targetPinyin = "Qiáng shang guà zhe yì fú piàoliang de huà.",
        targetTranslation = "Di dinding tergantung sebuah lukisan yang indah.",
        correctAnswer = "Qiáng shang guà zhe yì fú piàoliang de huà.\\n墙 上 挂 着 一 幅 漂亮 的 画。",
        options = listOf(
            "Qiáng shang guà zhe yì fú piàoliang de huà.\\n墙 上 挂 着 一 幅 漂亮 的 画。",
            "Zhuōzi shang fàng zhe yì fú huà.\\n桌子 上 放 着 一 幅 画。",
            "Qiáng shang guà zhe yí kuài shǒubiǎo.\\n墙 上 挂 着 一 块 手表。"
        ),
        audioToSpeak = "墙上挂着一幅漂亮的画。"
    )""",
            f"""    // 7. Soal 7: Pilihan Gambar (画 -> lukisan)
    Exercise(
        id = "u27_s1_p2_q7",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "画",
        targetPinyin = "huà",
        targetTranslation = "lukisan",
        correctAnswer = "lukisan",
        audioToSpeak = "画",
        pictureOptions = listOf(
            PictureOption("u27_s1_p2_opt7_1", "lukisan", "", R.drawable.ic_hobby_painting, true),
            PictureOption("u27_s1_p2_opt7_2", "bunga", "", R.drawable.ic_nature_flower_bloom, false),
            PictureOption("u27_s1_p2_opt7_3", "foto", "", R.drawable.ic_digi_camera_photo, false),
            PictureOption("u27_s1_p2_opt7_4", "internet", "", R.drawable.ic_digi_surf_internet, false)
        )
    )""",
            f"""    // 8. Soal 8: Ketik Pinyin (sebuah lukisan -> yífú)
    Exercise(
        id = "u27_s1_p2_q8",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "sebuah (penggolong lukisan)",
        sentenceWithBlank = "一幅 (________)",
        targetHanzi = "一幅",
        targetPinyin = "yìfú",
        correctAnswer = "yifu",
        keyboardKeys = {k1_p2_q8},
        audioToSpeak = "一幅"
    )""",
            f"""    // 9. Soal 9: Susun Kalimat (Kakak perempuan sedang melukis bunga di taman.)
    Exercise(
        id = "u27_s1_p2_q9",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Kakak melukis bunga di taman.",
        targetHanzi = "姐姐 在 花园 画 花。",
        targetPinyin = "Jiějie zài huāyuán huà huā.",
        wordChips = listOf("姐姐:jiějie", "在:zài", "花园:huāyuán", "画:huà", "花。:huā.", "看:kàn"),
        correctAnswer = "姐姐,在,花园,画,花。",
        audioToSpeak = "姐姐在花园画花。"
    )""",
            f"""    // 10. Soal 10: Ketuk Pasangan yang Sesuai (Rangkuman Melukis Alam)
    Exercise(
        id = "u27_s1_p2_m10",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u27_s1_p2_m10_1", "画花", "huà huā", "melukis bunga"),
            MatchPairItem("u27_s1_p2_m10_2", "挂在墙上", "guà zài qiáng shang", "gantung di tembok"),
            MatchPairItem("u27_s1_p2_m10_3", "爸爸画的", "bàba huà de", "lukisan ayah"),
            MatchPairItem("u27_s1_p2_m10_4", "真漂亮", "zhēn piàoliang", "sungguh cantik")
        )
    )"""
        ]
    }

    # =========================================================================
    # STAGE 2: Bunga di Taman, Biaya & Alam (花 [bunga], 花 [menghabiskan], 鸟)
    # =========================================================================
    k2_p1_q4 = make_keys("hua")
    k2_p1_q8 = make_keys("niao")
    k2_p2_q4 = make_keys("huashijian")
    k2_p2_q8 = make_keys("huoqian")
    
    stages[2] = {
        "p1": [
            f"""    // 1. Soal 1: Pilihan Gambar (花 -> bunga)
    Exercise(
        id = "u27_s2_p1_q1",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "花",
        targetPinyin = "huā",
        targetTranslation = "bunga",
        correctAnswer = "bunga",
        audioToSpeak = "花",
        pictureOptions = listOf(
            PictureOption("u27_s2_p1_opt1", "bunga", "", R.drawable.ic_nature_flower_bloom, true),
            PictureOption("u27_s2_p1_opt2", "burung", "", R.drawable.ic_nature_bird_singing, false),
            PictureOption("u27_s2_p1_opt3", "lukisan", "", R.drawable.ic_hobby_painting, false),
            PictureOption("u27_s2_p1_opt4", "kamera", "", R.drawable.ic_digi_camera_photo, false)
        )
    )""",
            f"""    // 2. Soal 2: Susun Kalimat (Di dalam taman mekar penuh aneka bunga warna-warni.)
    Exercise(
        id = "u27_s2_p1_q2",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Di taman penuh dengan bunga.",
        targetHanzi = "花园 里 开 满 了 花。",
        targetPinyin = "Huāyuán lǐ kāi mǎn le huā.",
        wordChips = listOf("花园:huāyuán", "里:lǐ", "开:kāi", "满:mǎn", "了:le", "花。:huā.", "草:cǎo"),
        correctAnswer = "花园,里,开,满,了,花。",
        audioToSpeak = "花园里开满了花。"
    )""",
            f"""    // 3. Soal 3: Ketuk Pasangan yang Sesuai (Bunga & Burung)
    Exercise(
        id = "u27_s2_p1_q3",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u27_s2_p1_m1", "花", "huā", "bunga"),
            MatchPairItem("u27_s2_p1_m2", "鸟", "niǎo", "burung"),
            MatchPairItem("u27_s2_p1_m3", "小鸟唱歌", "xiǎoniǎo chànggē", "burung berkicau"),
            MatchPairItem("u27_s2_p1_m4", "花开了", "huā kāi le", "bunga mekar")
        )
    )""",
            f"""    // 4. Soal 4: Ketik Pinyin (bunga -> huā)
    Exercise(
        id = "u27_s2_p1_q4",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "bunga",
        sentenceWithBlank = "花 (________)",
        targetHanzi = "花",
        targetPinyin = "huā",
        correctAnswer = "hua",
        keyboardKeys = {k2_p1_q4},
        audioToSpeak = "花"
    )""",
            f"""    // 5. Soal 5: Mendengar Kalimat (Rule 10: illustrationRes = 0)
    Exercise(
        id = "u27_s2_p1_q5",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Apa yang Anda dengar?",
        targetTranslation = "Di atas pohon ada banyak burung kecil sedang bernyanyi dengan riang.",
        targetHanzi = "树上 有 小鸟 在 唱歌。",
        targetPinyin = "Shùshang yǒu xiǎoniǎo zài chànggē.",
        wordChips = listOf("树上:shùshang", "有:yǒu", "小鸟:xiǎoniǎo", "在:zài", "唱歌。:chànggē.", "跳舞:tiàowǔ"),
        correctAnswer = "树上,有,小鸟,在,唱歌。",
        illustrationRes = 0,
        audioToSpeak = "树上有小鸟在唱歌。"
    )""",
            f"""    // 6. Soal 6: Pilihan Kalimat
    Exercise(
        id = "u27_s2_p1_q6",
        type = ExerciseType.SENTENCE_CHOICE,
        title = "Pilih terjemahan yang benar",
        targetHanzi = "春天 到 了， 花儿 都 开 了。",
        targetPinyin = "Chūntiān dào le, huār dōu kāi le.",
        targetTranslation = "Musim semi tiba, bunga-bunga semua telah bermekaran.",
        correctAnswer = "Chūntiān dào le, huār dōu kāi le.\\n春天 到 了， 花儿 都 开 了。",
        options = listOf(
            "Chūntiān dào le, huār dōu kāi le.\\n春天 到 了， 花儿 都 开 了。",
            "Dōngtiān dào le, huār dōu xiè le.\\n冬天 到 了， 花儿 都 谢 了。",
            "Chūntiān dào le, tiānqì hěn lěng.\\n春天 到 了， 天气 很 冷。"
        ),
        audioToSpeak = "春天到了，花儿都开了。"
    )""",
            f"""    // 7. Soal 7: Pilihan Gambar (鸟 -> burung bernyanyi)
    Exercise(
        id = "u27_s2_p1_q7",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "鸟",
        targetPinyin = "niǎo",
        targetTranslation = "burung",
        correctAnswer = "burung",
        audioToSpeak = "鸟",
        pictureOptions = listOf(
            PictureOption("u27_s2_p1_opt7_1", "burung", "", R.drawable.ic_nature_bird_singing, true),
            PictureOption("u27_s2_p1_opt7_2", "bunga", "", R.drawable.ic_nature_flower_bloom, false),
            PictureOption("u27_s2_p1_opt7_3", "melukis", "", R.drawable.ic_hobby_painting, false),
            PictureOption("u27_s2_p1_opt7_4", "kamera", "", R.drawable.ic_digi_camera_photo, false)
        )
    )""",
            f"""    // 8. Soal 8: Ketik Pinyin (burung -> niǎo)
    Exercise(
        id = "u27_s2_p1_q8",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "burung",
        sentenceWithBlank = "鸟 (________)",
        targetHanzi = "鸟",
        targetPinyin = "niǎo",
        correctAnswer = "niao",
        keyboardKeys = {k2_p1_q8},
        audioToSpeak = "鸟"
    )""",
            f"""    // 9. Soal 9: Susun Kalimat (Burung kecil bisa terbang sangat tinggi.)
    Exercise(
        id = "u27_s2_p1_q9",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Burung kecil terbang sangat tinggi.",
        targetHanzi = "小鸟 飞 得 很 高。",
        targetPinyin = "Xiǎoniǎo fēi de hěn gāo.",
        wordChips = listOf("小鸟:xiǎoniǎo", "飞:fēi", "得:de", "很:hěn", "高。:gāo.", "快:kuài"),
        correctAnswer = "小鸟,飞,得,很,高。",
        audioToSpeak = "小鸟飞得很高。"
    )""",
            f"""    // 10. Soal 10: Ketuk Pasangan yang Sesuai (Rangkuman Alam Semesta)
    Exercise(
        id = "u27_s2_p1_m10",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u27_s2_p1_m10_1", "花", "huā", "bunga"),
            MatchPairItem("u27_s2_p1_m10_2", "鸟", "niǎo", "burung"),
            MatchPairItem("u27_s2_p1_m10_3", "飞得高", "fēi de gāo", "terbang tinggi"),
            MatchPairItem("u27_s2_p1_m10_4", "满园花", "mǎn yuán huā", "kebun bunga")
        )
    )"""
        ],
        "p2": [
            f"""    // 1. Soal 1: Pilihan Gambar (花钱 -> menghabiskan uang)
    Exercise(
        id = "u27_s2_p2_q1",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "花钱",
        targetPinyin = "huāqián",
        targetTranslation = "menghabiskan uang",
        correctAnswer = "menghabiskan uang",
        audioToSpeak = "花钱",
        pictureOptions = listOf(
            PictureOption("u27_s2_p2_opt1", "biaya", "", R.drawable.ic_digi_surf_internet, true),
            PictureOption("u27_s2_p2_opt2", "bunga", "", R.drawable.ic_nature_flower_bloom, false),
            PictureOption("u27_s2_p2_opt3", "burung", "", R.drawable.ic_nature_bird_singing, false),
            PictureOption("u27_s2_p2_opt4", "lukisan", "", R.drawable.ic_hobby_painting, false)
        )
    )""",
            f"""    // 2. Soal 2: Susun Kalimat (Memperbaiki mobil ini menghabiskan lima ratus yuan uang saya.)
    Exercise(
        id = "u27_s2_p2_q2",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Perbaiki mobil habis 500 yuan.",
        targetHanzi = "修 车 花 了 五百 块 钱。",
        targetPinyin = "Xiū chē huā le wǔbǎi kuài qián.",
        wordChips = listOf("修:xiū", "车:chē", "花:huā", "了:le", "五百:wǔbǎi", "块:kuài", "钱。:qián.", "买:mǎi"),
        correctAnswer = "修,车,花,了,五百,块,钱。",
        audioToSpeak = "修车花了五百块钱。"
    )""",
            f"""    // 3. Soal 3: Ketuk Pasangan yang Sesuai (Menghabiskan Biaya & Waktu)
    Exercise(
        id = "u27_s2_p2_m3",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u27_s2_p2_m1", "花钱", "huāqián", "menghabiskan uang"),
            MatchPairItem("u27_s2_p2_m2", "花时间", "huā shíjiān", "menghabiskan waktu"),
            MatchPairItem("u27_s2_p2_m3", "花了很多", "huā le hěn duō", "menghabiskan banyak"),
            MatchPairItem("u27_s2_p2_m4", "太贵了", "tài guì le", "terlalu mahal")
        )
    )""",
            f"""    // 4. Soal 4: Ketik Pinyin (menghabiskan waktu -> huāshíjiān)
    Exercise(
        id = "u27_s2_p2_q4",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "menghabiskan waktu",
        sentenceWithBlank = "花时间 (________)",
        targetHanzi = "花时间",
        targetPinyin = "huāshíjiān",
        correctAnswer = "huashijian",
        keyboardKeys = {k2_p2_q4},
        audioToSpeak = "花时间"
    )""",
            f"""    // 5. Soal 5: Mendengar Kalimat (Rule 10: illustrationRes = 0)
    Exercise(
        id = "u27_s2_p2_q5",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Apa yang Anda dengar?",
        targetTranslation = "Belajar bahasa Mandarin perlu menghabiskan banyak waktu.",
        targetHanzi = "学 汉语 要 花 很多 时间。",
        targetPinyin = "Xué Hànyǔ yào huā hěn duō shíjiān.",
        wordChips = listOf("学:xué", "汉语:Hànyǔ", "要:yào", "花:huā", "很多:hěn duō", "时间。:shíjiān.", "钱:qián"),
        correctAnswer = "学,汉语,要,花,很多,时间。",
        illustrationRes = 0,
        audioToSpeak = "学汉语要花很多时间。"
    )""",
            f"""    // 6. Soal 6: Pilihan Kalimat
    Exercise(
        id = "u27_s2_p2_q6",
        type = ExerciseType.SENTENCE_CHOICE,
        title = "Pilih terjemahan yang benar",
        targetHanzi = "买 这 件 衣服 花 了 多少 钱？",
        targetPinyin = "Mǎi zhè jiàn yīfu huā le duōshao qián?",
        targetTranslation = "Membeli pakaian ini menghabiskan berapa banyak uang?",
        correctAnswer = "Mǎi zhè jiàn yīfu huā le duōshao qián?\\n买 这 件 衣服 花 了 多少 钱？",
        options = listOf(
            "Mǎi zhè jiàn yīfu huā le duōshao qián?\\n买 这 件 衣服 花 了 多少 钱？",
            "Mǎi zhè tiáo kùzi huā le duōshao qián?\\n买 这 条 裤子 花 了 多少 钱？",
            "Mǎi zhè kuài shǒubiǎo huā le duōshao qián?\\n买 这 块 手表 花 了 多少 钱？"
        ),
        audioToSpeak = "买这件衣服花了多少钱？"
    )""",
            f"""    // 7. Soal 7: Pilihan Gambar (花 -> menghabiskan biaya)
    Exercise(
        id = "u27_s2_p2_q7",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "花",
        targetPinyin = "huā",
        targetTranslation = "menghabiskan biaya",
        correctAnswer = "menghabiskan biaya",
        audioToSpeak = "花",
        pictureOptions = listOf(
            PictureOption("u27_s2_p2_opt7_1", "menghabiskan", "", R.drawable.ic_digi_surf_internet, true),
            PictureOption("u27_s2_p2_opt7_2", "bunga", "", R.drawable.ic_nature_flower_bloom, false),
            PictureOption("u27_s2_p2_opt7_3", "burung", "", R.drawable.ic_nature_bird_singing, false),
            PictureOption("u27_s2_p2_opt7_4", "lukisan", "", R.drawable.ic_hobby_painting, false)
        )
    )""",
            f"""    // 8. Soal 8: Ketik Pinyin (menghabiskan uang -> huāqián)
    Exercise(
        id = "u27_s2_p2_q8",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "menghabiskan uang",
        sentenceWithBlank = "花钱 (________)",
        targetHanzi = "花钱",
        targetPinyin = "huāqián",
        correctAnswer = "huaqian",
        keyboardKeys = {k2_p2_q8},
        audioToSpeak = "花钱"
    )""",
            f"""    // 9. Soal 9: Susun Kalimat (Saya menghabiskan dua jam membaca buku.)
    Exercise(
        id = "u27_s2_p2_q9",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Saya habis dua jam membaca buku.",
        targetHanzi = "我 花 了 两个 小时 看书。",
        targetPinyin = "Wǒ huā le liǎng gè xiǎoshí kànshū.",
        wordChips = listOf("我:wǒ", "花:huā", "了:le", "两个:liǎng gè", "小时:xiǎoshí", "看书。:kànshū.", "睡觉:shuìjiào"),
        correctAnswer = "我,花,了,两个,小时,看书。",
        audioToSpeak = "我花了两个小时看书。"
    )""",
            f"""    // 10. Soal 10: Ketuk Pasangan yang Sesuai (Rangkuman Waktu & Pengeluaran)
    Exercise(
        id = "u27_s2_p2_m10",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u27_s2_p2_m10_1", "花时间", "huā shíjiān", "pakai waktu"),
            MatchPairItem("u27_s2_p2_m10_2", "花钱", "huāqián", "keluar uang"),
            MatchPairItem("u27_s2_p2_m10_3", "两个小时", "liǎng gè xiǎoshí", "dua jam"),
            MatchPairItem("u27_s2_p2_m10_4", "很值得", "hěn zhíde", "sangat berharga")
        )
    )"""
        ]
    }

    # =========================================================================
    # STAGE 3: Berselancar di Internet & Membuka Aplikasi (上网, 网上, 打开)
    # =========================================================================
    k3_p1_q4 = make_keys("shangwang")
    k3_p1_q8 = make_keys("wangshang")
    k3_p2_q4 = make_keys("dakai")
    k3_p2_q8 = make_keys("chaziliao")
    
    stages[3] = {
        "p1": [
            f"""    // 1. Soal 1: Pilihan Gambar (上网 -> berselancar di internet)
    Exercise(
        id = "u27_s3_p1_q1",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "上网",
        targetPinyin = "shàngwǎng",
        targetTranslation = "berselancar di internet",
        correctAnswer = "berselancar di internet",
        audioToSpeak = "上网",
        pictureOptions = listOf(
            PictureOption("u27_s3_p1_opt1", "internet", "", R.drawable.ic_digi_surf_internet, true),
            PictureOption("u27_s3_p1_opt2", "kamera", "", R.drawable.ic_digi_camera_photo, false),
            PictureOption("u27_s3_p1_opt3", "musik", "", R.drawable.ic_digi_music_sing, false),
            PictureOption("u27_s3_p1_opt4", "lukisan", "", R.drawable.ic_hobby_painting, false)
        )
    )""",
            f"""    // 2. Soal 2: Susun Kalimat (Sekarang setiap hari semua orang berselancar di internet mencari bahan.)
    Exercise(
        id = "u27_s3_p1_q2",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Sekarang tiap hari semua internetan.",
        targetHanzi = "现在 大家 每天 上网 查 资料。",
        targetPinyin = "Xiànzài dàjiā měitiān shàngwǎng chá zīliào.",
        wordChips = listOf("现在:xiànzài", "大家:dàjiā", "每天:měitiān", "上网:shàngwǎng", "查:chá", "资料。:zīliào.", "不:bù"),
        correctAnswer = "现在,大家,每天,上网,查,资料。",
        audioToSpeak = "现在大家每天上网查资料。"
    )""",
            f"""    // 3. Soal 3: Ketuk Pasangan yang Sesuai (Internet & Online)
    Exercise(
        id = "u27_s3_p1_q3",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u27_s3_p1_m1", "上网", "shàngwǎng", "online / internet"),
            MatchPairItem("u27_s3_p1_m2", "网上", "wǎngshang", "di internet"),
            MatchPairItem("u27_s3_p1_m3", "查资料", "chá zīliào", "cari informasi"),
            MatchPairItem("u27_s3_p1_m4", "很方便", "hěn fāngbiàn", "sangat praktis")
        )
    )""",
            f"""    // 4. Soal 4: Ketik Pinyin (internetan -> shàngwǎng)
    Exercise(
        id = "u27_s3_p1_q4",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "berselancar di internet",
        sentenceWithBlank = "上网 (________)",
        targetHanzi = "上网",
        targetPinyin = "shàngwǎng",
        correctAnswer = "shangwang",
        keyboardKeys = {k3_p1_q4},
        audioToSpeak = "上网"
    )""",
            f"""    // 5. Soal 5: Mendengar Kalimat (Rule 10: illustrationRes = 0)
    Exercise(
        id = "u27_s3_p1_q5",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Apa yang Anda dengar?",
        targetTranslation = "Banyak barang yang dibeli secara daring di internet lebih murah daripada di mall.",
        targetHanzi = "网上 买 东西 比 商场 便宜。",
        targetPinyin = "Wǎngshang mǎi dōngxi bǐ shāngchǎng piányi.",
        wordChips = listOf("网上:wǎngshang", "买:mǎi", "东西:dōngxi", "比:bǐ", "商场:shāngchǎng", "便宜。:piányi.", "贵:guì"),
        correctAnswer = "网上,买,东西,比,商场,便宜。",
        illustrationRes = 0,
        audioToSpeak = "网上买东西比商场便宜。"
    )""",
            f"""    // 6. Soal 6: Pilihan Kalimat
    Exercise(
        id = "u27_s3_p1_q6",
        type = ExerciseType.SENTENCE_CHOICE,
        title = "Pilih terjemahan yang benar",
        targetHanzi = "弟弟 喜欢 在 网上 玩 游戏。",
        targetPinyin = "Dìdi xǐhuan zài wǎngshang wán yóuxì.",
        targetTranslation = "Adik laki-laki suka bermain game di internet.",
        correctAnswer = "Dìdi xǐhuan zài wǎngshang wán yóuxì.\\n弟弟 喜欢 在 网上 玩 游戏。",
        options = listOf(
            "Dìdi xǐhuan zài wǎngshang wán yóuxì.\\n弟弟 喜欢 在 网上 玩 游戏。",
            "Dìdi bù xǐhuan zài wǎngshang wán yóuxì.\\n弟弟 不 喜欢 在 网上 玩 游戏。",
            "Gēge xǐhuan zài wǎngshang wán yóuxì.\\n哥哥 喜欢 在 网上 玩 游戏。"
        ),
        audioToSpeak = "弟弟喜欢在网上玩游戏。"
    )""",
            f"""    // 7. Soal 7: Pilihan Gambar (网上 -> di internet / daring)
    Exercise(
        id = "u27_s3_p1_q7",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "网上",
        targetPinyin = "wǎngshang",
        targetTranslation = "di internet / online",
        correctAnswer = "di internet / online",
        audioToSpeak = "网上",
        pictureOptions = listOf(
            PictureOption("u27_s3_p1_opt7_1", "di internet", "", R.drawable.ic_digi_surf_internet, true),
            PictureOption("u27_s3_p1_opt7_2", "foto", "", R.drawable.ic_digi_camera_photo, false),
            PictureOption("u27_s3_p1_opt7_3", "musik", "", R.drawable.ic_digi_music_sing, false),
            PictureOption("u27_s3_p1_opt7_4", "lukisan", "", R.drawable.ic_hobby_painting, false)
        )
    )""",
            f"""    // 8. Soal 8: Ketik Pinyin (di internet -> wǎngshang)
    Exercise(
        id = "u27_s3_p1_q8",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "di internet / secara daring",
        sentenceWithBlank = "网上 (________)",
        targetHanzi = "网上",
        targetPinyin = "wǎngshang",
        correctAnswer = "wangshang",
        keyboardKeys = {k3_p1_q8},
        audioToSpeak = "网上"
    )""",
            f"""    // 9. Soal 9: Susun Kalimat (Saya belajar bahasa Mandarin secara daring di internet.)
    Exercise(
        id = "u27_s3_p1_q9",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Saya belajar Mandarin daring di internet.",
        targetHanzi = "我 在 网上 学 汉语。",
        targetPinyin = "Wǒ zài wǎngshang xué Hànyǔ.",
        wordChips = listOf("我:wǒ", "在:zài", "网上:wǎngshang", "学:xué", "汉语。:Hànyǔ.", "看:kàn"),
        correctAnswer = "我,在,网上,学,汉语。",
        audioToSpeak = "我在网上学汉语。"
    )""",
            f"""    // 10. Soal 10: Ketuk Pasangan yang Sesuai (Rangkuman Kehidupan Daring)
    Exercise(
        id = "u27_s3_p1_m10",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u27_s3_p1_m10_1", "上网", "shàngwǎng", "berinternet"),
            MatchPairItem("u27_s3_p1_m10_2", "网上买", "wǎngshang mǎi", "beli online"),
            MatchPairItem("u27_s3_p1_m10_3", "玩游戏", "wán yóuxì", "main game"),
            MatchPairItem("u27_s3_p1_m10_4", "学汉语", "xué Hànyǔ", "belajar Mandarin")
        )
    )"""
        ],
        "p2": [
            f"""    // 1. Soal 1: Pilihan Gambar (打开 -> membuka / menyalakan)
    Exercise(
        id = "u27_s3_p2_q1",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "打开",
        targetPinyin = "dǎkāi",
        targetTranslation = "membuka / menyalakan",
        correctAnswer = "membuka / menyalakan",
        audioToSpeak = "打开",
        pictureOptions = listOf(
            PictureOption("u27_s3_p2_opt1", "membuka", "", R.drawable.ic_digi_surf_internet, true),
            PictureOption("u27_s3_p2_opt2", "foto", "", R.drawable.ic_digi_camera_photo, false),
            PictureOption("u27_s3_p2_opt3", "musik", "", R.drawable.ic_digi_music_sing, false),
            PictureOption("u27_s3_p2_opt4", "lukisan", "", R.drawable.ic_hobby_painting, false)
        )
    )""",
            f"""    // 2. Soal 2: Susun Kalimat (Silakan semuanya membuka buku ke halaman tiga puluh.)
    Exercise(
        id = "u27_s3_p2_q2",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Buka buku ke halaman 30.",
        targetHanzi = "请 把 书 打开 到 三十 页。",
        targetPinyin = "Qǐng bǎ shū dǎkāi dào sānshí yè.",
        wordChips = listOf("请:qǐng", "把:bǎ", "书:shū", "打开:dǎkāi", "到:dào", "三十:sānshí", "页。:yè.", "关上:guānshàng"),
        correctAnswer = "请,把,书,打开,到,三十,页。",
        audioToSpeak = "请把书打开到三十页。"
    )""",
            f"""    // 3. Soal 3: Ketuk Pasangan yang Sesuai (Buka & Nyalakan)
    Exercise(
        id = "u27_s3_p2_m3",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u27_s3_p2_m1", "打开", "dǎkāi", "membuka / menyalakan"),
            MatchPairItem("u27_s3_p2_m2", "打开电脑", "dǎkāi diànnǎo", "nyalakan komputer"),
            MatchPairItem("u27_s3_p2_m3", "开门", "kāimén", "membuka pintu"),
            MatchPairItem("u27_s3_p2_m4", "关上", "guānshàng", "menutup")
        )
    )""",
            f"""    // 4. Soal 4: Ketik Pinyin (membuka -> dǎkāi)
    Exercise(
        id = "u27_s3_p2_q4",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "membuka / menyalakan",
        sentenceWithBlank = "打开 (________)",
        targetHanzi = "打开",
        targetPinyin = "dǎkāi",
        correctAnswer = "dakai",
        keyboardKeys = {k3_p2_q4},
        audioToSpeak = "打开"
    )""",
            f"""    // 5. Soal 5: Mendengar Kalimat (Rule 10: illustrationRes = 0)
    Exercise(
        id = "u27_s3_p2_q5",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Apa yang Anda dengar?",
        targetTranslation = "Tolong buka pintunya.",
        targetHanzi = "请 把 门 打开。",
        targetPinyin = "Qǐng bǎ mén dǎkāi.",
        wordChips = listOf("请:qǐng", "把:bǎ", "门:mén", "打开。:dǎkāi.", "关上:guānshàng"),
        correctAnswer = "请,把,门,打开。",
        illustrationRes = 0,
        audioToSpeak = "请把门打开。"
    )""",
            f"""    // 6. Soal 6: Pilihan Kalimat
    Exercise(
        id = "u27_s3_p2_q6",
        type = ExerciseType.SENTENCE_CHOICE,
        title = "Pilih terjemahan yang benar",
        targetHanzi = "他 打开 电脑 开始 工作。",
        targetPinyin = "Tā dǎkāi diànnǎo kāishǐ gōngzuò.",
        targetTranslation = "Dia menyalakan komputer mulai bekerja.",
        correctAnswer = "Tā dǎkāi diànnǎo kāishǐ gōngzuò.\\n他 打开 电脑 开始 工作。",
        options = listOf(
            "Tā dǎkāi diànnǎo kāishǐ gōngzuò.\\n他 打开 电脑 开始 工作。",
            "Tā guānshàng diànnǎo kāishǐ gōngzuò.\\n他 关上 电脑 开始 工作。",
            "Wǒ dǎkāi diànnǎo kāishǐ gōngzuò.\\n我 打开 电脑 开始 工作。"
        ),
        audioToSpeak = "他打开电脑开始工作。"
    )""",
            f"""    // 7. Soal 7: Pilihan Gambar (打开电脑 -> nyalakan laptop/komputer)
    Exercise(
        id = "u27_s3_p2_q7",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "打开电脑",
        targetPinyin = "dǎkāi diànnǎo",
        targetTranslation = "nyalakan komputer",
        correctAnswer = "nyalakan komputer",
        audioToSpeak = "打开电脑",
        pictureOptions = listOf(
            PictureOption("u27_s3_p2_opt7_1", "komputer", "", R.drawable.ic_digi_surf_internet, true),
            PictureOption("u27_s3_p2_opt7_2", "kamera", "", R.drawable.ic_digi_camera_photo, false),
            PictureOption("u27_s3_p2_opt7_3", "musik", "", R.drawable.ic_digi_music_sing, false),
            PictureOption("u27_s3_p2_opt7_4", "lukisan", "", R.drawable.ic_hobby_painting, false)
        )
    )""",
            f"""    // 8. Soal 8: Ketik Pinyin (membuka -> dǎkāi)
    Exercise(
        id = "u27_s3_p2_q8",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "membuka",
        sentenceWithBlank = "打开 (________)",
        targetHanzi = "打开",
        targetPinyin = "dǎkāi",
        correctAnswer = "dakai",
        keyboardKeys = {k3_p2_q4},
        audioToSpeak = "打开"
    )""",
            f"""    // 9. Soal 9: Susun Kalimat (Tolong nyalakan lampu di dalam ruangan.)
    Exercise(
        id = "u27_s3_p2_q9",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Silakan nyalakan lampu.",
        targetHanzi = "请 打开 灯。",
        targetPinyin = "Qǐng dǎkāi dēng.",
        wordChips = listOf("请:qǐng", "打开:dǎkāi", "灯。:dēng.", "关上:guānshàng"),
        correctAnswer = "请,打开,灯。",
        audioToSpeak = "请打开灯。"
    )""",
            f"""    // 10. Soal 10: Ketuk Pasangan yang Sesuai (Rangkuman Membuka & Menutup)
    Exercise(
        id = "u27_s3_p2_m10",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u27_s3_p2_m10_1", "打开", "dǎkāi", "membuka"),
            MatchPairItem("u27_s3_p2_m10_2", "打开书", "dǎkāi shū", "buka buku"),
            MatchPairItem("u27_s3_p2_m10_3", "开灯", "kāi dēng", "nyalakan lampu"),
            MatchPairItem("u27_s3_p2_m10_4", "关门", "guān mén", "tutup pintu")
        )
    )"""
        ]
    }

    # =========================================================================
    # STAGE 4: Senyuman Gembira, Urusan & Ingatan (笑, 快乐, 每, 事情, 忘)
    # =========================================================================
    k4_p1_q4 = make_keys("xiao")
    k4_p1_q8 = make_keys("kuaile")
    k4_p2_q4 = make_keys("shiqing")
    k4_p2_q8 = make_keys("wang")
    
    stages[4] = {
        "p1": [
            f"""    // 1. Soal 1: Pilihan Gambar (笑 -> tersenyum / tertawa)
    Exercise(
        id = "u27_s4_p1_q1",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "笑",
        targetPinyin = "xiào",
        targetTranslation = "tersenyum / tertawa",
        correctAnswer = "tersenyum / tertawa",
        audioToSpeak = "笑",
        pictureOptions = listOf(
            PictureOption("u27_s4_p1_opt1", "senyum", "", R.drawable.ic_digi_camera_photo, true),
            PictureOption("u27_s4_p1_opt2", "musik", "", R.drawable.ic_digi_music_sing, false),
            PictureOption("u27_s4_p1_opt3", "lukisan", "", R.drawable.ic_hobby_painting, false),
            PictureOption("u27_s4_p1_opt4", "bunga", "", R.drawable.ic_nature_flower_bloom, false)
        )
    )""",
            f"""    // 2. Soal 2: Susun Kalimat (Melihat temannya datang, dia tersenyum dengan sangat gembira.)
    Exercise(
        id = "u27_s4_p1_q2",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Melihat teman datang, dia tersenyum senang.",
        targetHanzi = "看到 朋友 她 高兴 地 笑 了。",
        targetPinyin = "Kàndào péngyou tā gāoxìng de xiào le.",
        wordChips = listOf("看到:kàndào", "朋友:péngyou", "她:tā", "高兴:gāoxìng", "地:de", "笑:xiào", "了。:le.", "哭:kū"),
        correctAnswer = "看到,朋友,她,高兴,地,笑,了。",
        audioToSpeak = "看到朋友她高兴地笑了。"
    )""",
            f"""    // 3. Soal 3: Ketuk Pasangan yang Sesuai (Senyum & Bahagia)
    Exercise(
        id = "u27_s4_p1_q3",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u27_s4_p1_m1", "笑", "xiào", "senyum / tawa"),
            MatchPairItem("u27_s4_p1_m2", "快乐", "kuàilè", "bahagia / gembira"),
            MatchPairItem("u27_s4_p1_m3", "新年快乐", "xīnnián kuàilè", "selamat tahun baru"),
            MatchPairItem("u27_s4_p1_m4", "笑了", "xiào le", "tersenyum")
        )
    )""",
            f"""    // 4. Soal 4: Ketik Pinyin (senyum/tertawa -> xiào)
    Exercise(
        id = "u27_s4_p1_q4",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "tersenyum / tertawa",
        sentenceWithBlank = "笑 (________)",
        targetHanzi = "笑",
        targetPinyin = "xiào",
        correctAnswer = "xiao",
        keyboardKeys = {k4_p1_q4},
        audioToSpeak = "笑"
    )""",
            f"""    // 5. Soal 5: Mendengar Kalimat (Rule 10: illustrationRes = 0)
    Exercise(
        id = "u27_s4_p1_q5",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Apa yang Anda dengar?",
        targetTranslation = "Mendoakan kalian semua selamat tahun baru!",
        targetHanzi = "祝 大家 新年 快乐！",
        targetPinyin = "Zhù dàjiā xīnnián kuàilè!",
        wordChips = listOf("祝:zhù", "大家:dàjiā", "新年:xīnnián", "快乐！:kuàilè!", "高兴:gāoxìng"),
        correctAnswer = "祝,大家,新年,快乐！",
        illustrationRes = 0,
        audioToSpeak = "祝大家新年快乐！"
    )""",
            f"""    // 6. Soal 6: Pilihan Kalimat
    Exercise(
        id = "u27_s4_p1_q6",
        type = ExerciseType.SENTENCE_CHOICE,
        title = "Pilih terjemahan yang benar",
        targetHanzi = "他 笑 得 很 开心。",
        targetPinyin = "Tā xiào de hěn kāixīn.",
        targetTranslation = "Dia tertawa dengan sangat gembira.",
        correctAnswer = "Tā xiào de hěn kāixīn.\\n他 笑 得 很 开心。",
        options = listOf(
            "Tā xiào de hěn kāixīn.\\n他 笑 得 很 开心。",
            "Tā kū de hěn shāngxīn.\\n他 哭 得 很 伤心。",
            "Wǒ xiào de hěn kāixīn.\\n我 笑 得 很 开心。"
        ),
        audioToSpeak = "他笑得很开心。"
    )""",
            f"""    // 7. Soal 7: Pilihan Gambar (快乐 -> bahagia gembira)
    Exercise(
        id = "u27_s4_p1_q7",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "快乐",
        targetPinyin = "kuàilè",
        targetTranslation = "bahagia / gembira",
        correctAnswer = "bahagia / gembira",
        audioToSpeak = "快乐",
        pictureOptions = listOf(
            PictureOption("u27_s4_p1_opt7_1", "bahagia", "", R.drawable.ic_digi_music_sing, true),
            PictureOption("u27_s4_p1_opt7_2", "foto", "", R.drawable.ic_digi_camera_photo, false),
            PictureOption("u27_s4_p1_opt7_3", "internet", "", R.drawable.ic_digi_surf_internet, false),
            PictureOption("u27_s4_p1_opt7_4", "lukisan", "", R.drawable.ic_hobby_painting, false)
        )
    )""",
            f"""    // 8. Soal 8: Ketik Pinyin (bahagia -> kuàilè)
    Exercise(
        id = "u27_s4_p1_q8",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "bahagia / gembira",
        sentenceWithBlank = "快乐 (________)",
        targetHanzi = "快乐",
        targetPinyin = "kuàilè",
        correctAnswer = "kuaile",
        keyboardKeys = {k4_p1_q8},
        audioToSpeak = "快乐"
    )""",
            f"""    // 9. Soal 9: Susun Kalimat (Hari ini semua orang sangat bahagia.)
    Exercise(
        id = "u27_s4_p1_q9",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Hari ini semua orang sangat bahagia.",
        targetHanzi = "今天 大家 都 很 快乐。",
        targetPinyin = "Jīntiān dàjiā dōu hěn kuàilè.",
        wordChips = listOf("今天:jīntiān", "大家:dàjiā", "都:dōu", "很:hěn", "快乐。:kuàilè.", "累:lèi"),
        correctAnswer = "今天,大家,都,很,快乐。",
        audioToSpeak = "今天大家都很快乐。"
    )""",
            f"""    // 10. Soal 10: Ketuk Pasangan yang Sesuai (Rangkuman Kebahagiaan)
    Exercise(
        id = "u27_s4_p1_m10",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u27_s4_p1_m10_1", "笑", "xiào", "senyum"),
            MatchPairItem("u27_s4_p1_m10_2", "快乐", "kuàilè", "bahagia"),
            MatchPairItem("u27_s4_p1_m10_3", "开心", "kāixīn", "gembira"),
            MatchPairItem("u27_s4_p1_m10_4", "大笑", "dàxiào", "tertawa lebar")
        )
    )"""
        ],
        "p2": [
            f"""    // 1. Soal 1: Pilihan Gambar (事情 -> perkara / urusan)
    Exercise(
        id = "u27_s4_p2_q1",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "事情",
        targetPinyin = "shìqing",
        targetTranslation = "urusan / perkara",
        correctAnswer = "urusan / perkara",
        audioToSpeak = "事情",
        pictureOptions = listOf(
            PictureOption("u27_s4_p2_opt1", "urusan", "", R.drawable.ic_digi_surf_internet, true),
            PictureOption("u27_s4_p2_opt2", "foto", "", R.drawable.ic_digi_camera_photo, false),
            PictureOption("u27_s4_p2_opt3", "musik", "", R.drawable.ic_digi_music_sing, false),
            PictureOption("u27_s4_p2_opt4", "bunga", "", R.drawable.ic_nature_flower_bloom, false)
        )
    )""",
            f"""    // 2. Soal 2: Susun Kalimat (Hari ini di perusahaan ada banyak urusan yang harus diselesaikan.)
    Exercise(
        id = "u27_s4_p2_q2",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Hari ini kantor banyak urusan.",
        targetHanzi = "今天 公司 有 很多 事情。",
        targetPinyin = "Jīntiān gōngsī yǒu hěn duō shìqing.",
        wordChips = listOf("今天:jīntiān", "公司:gōngsī", "有:yǒu", "很多:hěn duō", "事情。:shìqing.", "少:shǎo"),
        correctAnswer = "今天,公司,有,很多,事情。",
        audioToSpeak = "今天公司有很多事情。"
    )""",
            f"""    // 3. Soal 3: Ketuk Pasangan yang Sesuai (Urusan & Lupa)
    Exercise(
        id = "u27_s4_p2_m3",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u27_s4_p2_m1", "每", "měi", "setiap"),
            MatchPairItem("u27_s4_p2_m2", "事情", "shìqing", "urusan / persoalan"),
            MatchPairItem("u27_s4_p2_m3", "忘", "wàng", "lupa"),
            MatchPairItem("u27_s4_p2_m4", "别忘了", "bié wàng le", "jangan lupa")
        )
    )""",
            f"""    // 4. Soal 4: Ketik Pinyin (urusan -> shìqing)
    Exercise(
        id = "u27_s4_p2_q4",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "urusan / perkara",
        sentenceWithBlank = "事情 (________)",
        targetHanzi = "事情",
        targetPinyin = "shìqing",
        correctAnswer = "shiqing",
        keyboardKeys = {k4_p2_q4},
        audioToSpeak = "事情"
    )""",
            f"""    // 5. Soal 5: Mendengar Kalimat (Rule 10: illustrationRes = 0)
    Exercise(
        id = "u27_s4_p2_q5",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Apa yang Anda dengar?",
        targetTranslation = "Maaf, saya lupa membawa buku pelajaran hari ini.",
        targetHanzi = "对不起， 我 忘 了 带 课本。",
        targetPinyin = "Duìbuqǐ, wǒ wàng le dài kèběn.",
        wordChips = listOf("对不起，:duìbuqǐ,", "我:wǒ", "忘:wàng", "了:le", "带:dài", "课本。:kèběn.", "拿:ná"),
        correctAnswer = "对不起，,我,忘,了,带,课本。",
        illustrationRes = 0,
        audioToSpeak = "对不起，我忘了带课本。"
    )""",
            f"""    // 6. Soal 6: Pilihan Kalimat
    Exercise(
        id = "u27_s4_p2_q6",
        type = ExerciseType.SENTENCE_CHOICE,
        title = "Pilih terjemahan yang benar",
        targetHanzi = "我 每天 早上 都 喝 一 杯 牛奶。",
        targetPinyin = "Wǒ měitiān zǎoshang dōu hē yì bēi niúnǎi.",
        targetTranslation = "Saya setiap pagi selalu minum segelas susu.",
        correctAnswer = "Wǒ měitiān zǎoshang dōu hē yì bēi niúnǎi.\\n我 每天 早上 都 喝 一 杯 牛奶。",
        options = listOf(
            "Wǒ měitiān zǎoshang dōu hē yì bēi niúnǎi.\\n我 每天 早上 都 喝 一 杯 牛奶。",
            "Wǒ měitiān wǎnshang dōu hē yì bēi niúnǎi.\\n我 每天 晚上 都 喝 一 杯 牛奶。",
            "Tā měitiān zǎoshang dōu hē yì bēi niúnǎi.\\n他 每天 早上 都 喝 一 杯 牛奶。"
        ),
        audioToSpeak = "我每天早上都喝一杯牛奶。"
    )""",
            f"""    // 7. Soal 7: Pilihan Gambar (忘 -> lupa)
    Exercise(
        id = "u27_s4_p2_q7",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "忘",
        targetPinyin = "wàng",
        targetTranslation = "lupa",
        correctAnswer = "lupa",
        audioToSpeak = "忘",
        pictureOptions = listOf(
            PictureOption("u27_s4_p2_opt7_1", "lupa", "", R.drawable.ic_digi_camera_photo, true),
            PictureOption("u27_s4_p2_opt7_2", "bunga", "", R.drawable.ic_nature_flower_bloom, false),
            PictureOption("u27_s4_p2_opt7_3", "burung", "", R.drawable.ic_nature_bird_singing, false),
            PictureOption("u27_s4_p2_opt7_4", "musik", "", R.drawable.ic_digi_music_sing, false)
        )
    )""",
            f"""    // 8. Soal 8: Ketik Pinyin (lupa -> wàng)
    Exercise(
        id = "u27_s4_p2_q8",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "lupa",
        sentenceWithBlank = "忘 (________)",
        targetHanzi = "忘",
        targetPinyin = "wàng",
        correctAnswer = "wang",
        keyboardKeys = {k4_p2_q8},
        audioToSpeak = "忘"
    )""",
            f"""    // 9. Soal 9: Susun Kalimat (Setiap orang memiliki urusannya masing-masing.)
    Exercise(
        id = "u27_s4_p2_q9",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Tiap orang ada urusan masing-masing.",
        targetHanzi = "每个人 都有 自己的 事情。",
        targetPinyin = "Měi gè rén dōu yǒu zìjǐ de shìqing.",
        wordChips = listOf("每个人:měi gè rén", "都有:dōu yǒu", "自己的:zìjǐ de", "事情。:shìqing.", "没有:méiyǒu"),
        correctAnswer = "每个人,都有,自己的,事情。",
        audioToSpeak = "每个人都有自己的事情。"
    )""",
            f"""    // 10. Soal 10: Ketuk Pasangan yang Sesuai (Rangkuman Urusan Harian)
    Exercise(
        id = "u27_s4_p2_m10",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u27_s4_p2_m10_1", "每天", "měitiān", "setiap hari"),
            MatchPairItem("u27_s4_p2_m10_2", "办事情", "bàn shìqing", "mengurus perkara"),
            MatchPairItem("u27_s4_p2_m10_3", "没忘", "méi wàng", "tidak lupa"),
            MatchPairItem("u27_s4_p2_m10_4", "每个人", "měi gè rén", "setiap orang")
        )
    )"""
        ]
    }

    # =========================================================================
    # STAGE 5: Evaluasi Komprehensif Hobi & Hiburan Digital (Sintesis Seluruh Bab 27)
    # =========================================================================
    k5_p1_q4 = make_keys("aihao")
    k5_p1_q8 = make_keys("hua")
    k5_p2_q4 = make_keys("shangwang")
    k5_p2_q8 = make_keys("kuaile")
    
    stages[5] = {
        "p1": [
            f"""    // 1. Soal 1: Pilihan Gambar (画 -> melukis karya seni)
    Exercise(
        id = "u27_s5_p1_q1",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "画",
        targetPinyin = "huà",
        targetTranslation = "melukis",
        correctAnswer = "melukis",
        audioToSpeak = "画",
        pictureOptions = listOf(
            PictureOption("u27_s5_p1_opt1", "melukis", "", R.drawable.ic_hobby_painting, true),
            PictureOption("u27_s5_p1_opt2", "bunga", "", R.drawable.ic_nature_flower_bloom, false),
            PictureOption("u27_s5_p1_opt3", "burung", "", R.drawable.ic_nature_bird_singing, false),
            PictureOption("u27_s5_p1_opt4", "internet", "", R.drawable.ic_digi_surf_internet, false)
        )
    )""",
            f"""    // 2. Soal 2: Susun Kalimat (Saya suka menggambar bunga dan burung kecil di waktu luang.)
    Exercise(
        id = "u27_s5_p1_q2",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Saya suka melukis bunga dan burung.",
        targetHanzi = "我 喜欢 画 花 和 鸟。",
        targetPinyin = "Wǒ xǐhuan huà huā hé niǎo.",
        wordChips = listOf("我:wǒ", "喜欢:xǐhuan", "画:huà", "花:huā", "和:hé", "鸟。:niǎo.", "看:kàn"),
        correctAnswer = "我,喜欢,画,花,和,鸟。",
        audioToSpeak = "我喜欢画花和鸟。"
    )""",
            f"""    // 3. Soal 3: Ketuk Pasangan yang Sesuai (Sintesis Alam & Seni)
    Exercise(
        id = "u27_s5_p1_m3",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u27_s5_p1_m1", "爱好", "àihào", "hobi"),
            MatchPairItem("u27_s5_p1_m2", "画花", "huà huā", "melukis bunga"),
            MatchPairItem("u27_s5_p1_m3", "鸟儿", "niǎor", "burung"),
            MatchPairItem("u27_s5_p1_m4", "真可爱", "zhēn kě'ài", "sangat imut")
        )
    )""",
            f"""    // 4. Soal 4: Ketik Pinyin (hobi -> àihào)
    Exercise(
        id = "u27_s5_p1_q4",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "hobi / kegemaran",
        sentenceWithBlank = "爱好 (________)",
        targetHanzi = "爱好",
        targetPinyin = "àihào",
        correctAnswer = "aihao",
        keyboardKeys = {k5_p1_q4},
        audioToSpeak = "爱好"
    )""",
            f"""    // 5. Soal 5: Mendengar Kalimat (Rule 10: illustrationRes = 0)
    Exercise(
        id = "u27_s5_p1_q5",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Apa yang Anda dengar?",
        targetTranslation = "Bunga di taman bermekaran sangat indah.",
        targetHanzi = "花园 里的 花 真 美丽。",
        targetPinyin = "Huāyuán lǐ de huā zhēn měilì.",
        wordChips = listOf("花园:huāyuán", "里的:lǐ de", "花:huā", "真:zhēn", "美丽。:měilì.", "草:cǎo"),
        correctAnswer = "花园,里的,花,真,美丽。",
        illustrationRes = 0,
        audioToSpeak = "花园里的花真美丽。"
    )""",
            f"""    // 6. Soal 6: Pilihan Kalimat
    Exercise(
        id = "u27_s5_p1_q6",
        type = ExerciseType.SENTENCE_CHOICE,
        title = "Pilih terjemahan yang benar",
        targetHanzi = "树上 的 小鸟 在 快乐 地 唱歌。",
        targetPinyin = "Shùshang de xiǎoniǎo zài kuàilè de chànggē.",
        targetTranslation = "Burung di atas pohon bernyanyi dengan riang.",
        correctAnswer = "Shùshang de xiǎoniǎo zài kuàilè de chànggē.\\n树上 的 小鸟 在 快乐 地 唱歌。",
        options = listOf(
            "Shùshang de xiǎoniǎo zài kuàilè de chànggē.\\n树上 的 小鸟 在 快乐 地 唱歌。",
            "Shùshang de xiǎoniǎo zài kuàilè de tiàowǔ.\\n树上 的 小鸟 在 快乐 地 跳舞。",
            "Dìshang de xiǎoniǎo zài kuàilè de chànggē.\\n地上 的 小鸟 在 快乐 地 唱歌。"
        ),
        audioToSpeak = "树上的小鸟在快乐地唱歌。"
    )""",
            f"""    // 7. Soal 7: Pilihan Gambar (花 -> bunga merekah)
    Exercise(
        id = "u27_s5_p1_q7",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "花",
        targetPinyin = "huā",
        targetTranslation = "bunga",
        correctAnswer = "bunga",
        audioToSpeak = "花",
        pictureOptions = listOf(
            PictureOption("u27_s5_p1_opt7_1", "bunga", "", R.drawable.ic_nature_flower_bloom, true),
            PictureOption("u27_s5_p1_opt7_2", "burung", "", R.drawable.ic_nature_bird_singing, false),
            PictureOption("u27_s5_p1_opt7_3", "melukis", "", R.drawable.ic_hobby_painting, false),
            PictureOption("u27_s5_p1_opt7_4", "foto", "", R.drawable.ic_digi_camera_photo, false)
        )
    )""",
            f"""    // 8. Soal 8: Ketik Pinyin (bunga -> huā)
    Exercise(
        id = "u27_s5_p1_q8",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "bunga",
        sentenceWithBlank = "花 (________)",
        targetHanzi = "花",
        targetPinyin = "huā",
        correctAnswer = "hua",
        keyboardKeys = {k5_p1_q8},
        audioToSpeak = "花"
    )""",
            f"""    // 9. Soal 9: Susun Kalimat (Setiap orang tersenyum dengan gembira.)
    Exercise(
        id = "u27_s5_p1_q9",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Setiap orang tersenyum gembira.",
        targetHanzi = "每个人 都 笑 了。",
        targetPinyin = "Měi gè rén dōu xiào le.",
        wordChips = listOf("每个人:měi gè rén", "都:dōu", "笑:xiào", "了。:le.", "走:zǒu"),
        correctAnswer = "每个人,都,笑,了。",
        audioToSpeak = "每个人都笑了。"
    )""",
            f"""    // 10. Soal 10: Ketuk Pasangan yang Sesuai (Rangkuman Sintesis 1)
    Exercise(
        id = "u27_s5_p1_m10",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u27_s5_p1_m10_1", "开花", "kāihuā", "bunga mekar"),
            MatchPairItem("u27_s5_p1_m10_2", "小鸟", "xiǎoniǎo", "burung kecil"),
            MatchPairItem("u27_s5_p1_m10_3", "笑了", "xiào le", "tersenyum"),
            MatchPairItem("u27_s5_p1_m10_4", "真美丽", "zhēn měilì", "sungguh cantik")
        )
    )"""
        ],
        "p2": [
            f"""    // 1. Soal 1: Pilihan Gambar (上网 -> berselancar daring)
    Exercise(
        id = "u27_s5_p2_q1",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "上网",
        targetPinyin = "shàngwǎng",
        targetTranslation = "online",
        correctAnswer = "online",
        audioToSpeak = "上网",
        pictureOptions = listOf(
            PictureOption("u27_s5_p2_opt1", "internet", "", R.drawable.ic_digi_surf_internet, true),
            PictureOption("u27_s5_p2_opt2", "bunga", "", R.drawable.ic_nature_flower_bloom, false),
            PictureOption("u27_s5_p2_opt3", "burung", "", R.drawable.ic_nature_bird_singing, false),
            PictureOption("u27_s5_p2_opt4", "musik", "", R.drawable.ic_digi_music_sing, false)
        )
    )""",
            f"""    // 2. Soal 2: Susun Kalimat (Saya menyalakan komputer berselancar daring.)
    Exercise(
        id = "u27_s5_p2_q2",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Saya buka komputer berinternet.",
        targetHanzi = "我 打开 电脑 上网。",
        targetPinyin = "Wǒ dǎkāi diànnǎo shàngwǎng.",
        wordChips = listOf("我:wǒ", "打开:dǎkāi", "电脑:diànnǎo", "上网。:shàngwǎng.", "关上:guānshàng"),
        correctAnswer = "我,打开,电脑,上网。",
        audioToSpeak = "我打开电脑上网。"
    )""",
            f"""    // 3. Soal 3: Ketuk Pasangan yang Sesuai (Grand Sintesis Bab 27)
    Exercise(
        id = "u27_s5_p2_m3",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u27_s5_p2_m1", "上网", "shàngwǎng", "berinternet"),
            MatchPairItem("u27_s5_p2_m2", "打开", "dǎkāi", "membuka"),
            MatchPairItem("u27_s5_p2_m3", "快乐", "kuàilè", "bahagia"),
            MatchPairItem("u27_s5_p2_m4", "别忘", "bié wàng", "jangan lupa")
        )
    )""",
            f"""    // 4. Soal 4: Ketik Pinyin (internetan -> shàngwǎng)
    Exercise(
        id = "u27_s5_p2_q4",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "berselancar di internet",
        sentenceWithBlank = "上网 (________)",
        targetHanzi = "上网",
        targetPinyin = "shàngwǎng",
        correctAnswer = "shangwang",
        keyboardKeys = {k5_p2_q4},
        audioToSpeak = "上网"
    )""",
            f"""    // 5. Soal 5: Mendengar Kalimat (Rule 10: illustrationRes = 0)
    Exercise(
        id = "u27_s5_p2_q5",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Apa yang Anda dengar?",
        targetTranslation = "Setiap hari harus hidup dengan bahagia.",
        targetHanzi = "每天 都 要 快乐 生活。",
        targetPinyin = "Měitiān dōu yào kuàilè shēnghuó.",
        wordChips = listOf("每天:měitiān", "都:dōu", "要:yào", "快乐:kuàilè", "生活。:shēnghuó.", "难过:nánguò"),
        correctAnswer = "每天,都,要,快乐,生活。",
        illustrationRes = 0,
        audioToSpeak = "每天都要快乐生活。"
    )""",
            f"""    // 6. Soal 6: Pilihan Kalimat
    Exercise(
        id = "u27_s5_p2_q6",
        type = ExerciseType.SENTENCE_CHOICE,
        title = "Pilih terjemahan yang benar",
        targetHanzi = "别 忘 了 明天 有 很多 事情 要 做。",
        targetPinyin = "Bié wàng le míngtiān yǒu hěn duō shìqing yào zuò.",
        targetTranslation = "Jangan lupa besok ada banyak urusan yang harus dikerjakan.",
        correctAnswer = "Bié wàng le míngtiān yǒu hěn duō shìqing yào zuò.\\n别 忘 了 明天 有 很多 事情 要 做。",
        options = listOf(
            "Bié wàng le míngtiān yǒu hěn duō shìqing yào zuò.\\n别 忘 了 明天 有 很多 事情 要 做。",
            "Yǐjīng wàng le míngtiān yǒu shìqing yào zuò.\\n已经 忘 了 明天 有 事情 要 做。",
            "Míngtiān méiyǒu shìqing yào zuò.\\n明天 没有 事情 要 做。"
        ),
        audioToSpeak = "别忘了明天有很多事情要做。"
    )""",
            f"""    // 7. Soal 7: Pilihan Gambar (快乐 -> bahagia bersukacita)
    Exercise(
        id = "u27_s5_p2_q7",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "快乐",
        targetPinyin = "kuàilè",
        targetTranslation = "bahagia",
        correctAnswer = "bahagia",
        audioToSpeak = "快乐",
        pictureOptions = listOf(
            PictureOption("u27_s5_p2_opt7_1", "bahagia", "", R.drawable.ic_digi_music_sing, true),
            PictureOption("u27_s5_p2_opt7_2", "foto", "", R.drawable.ic_digi_camera_photo, false),
            PictureOption("u27_s5_p2_opt7_3", "internet", "", R.drawable.ic_digi_surf_internet, false),
            PictureOption("u27_s5_p2_opt7_4", "lukisan", "", R.drawable.ic_hobby_painting, false)
        )
    )""",
            f"""    // 8. Soal 8: Ketik Pinyin (bahagia -> kuàilè)
    Exercise(
        id = "u27_s5_p2_q8",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "bahagia / gembira",
        sentenceWithBlank = "快乐 (________)",
        targetHanzi = "快乐",
        targetPinyin = "kuàilè",
        correctAnswer = "kuaile",
        keyboardKeys = {k5_p2_q8},
        audioToSpeak = "快乐"
    )""",
            f"""    // 9. Soal 9: Susun Kalimat (Saya tidak melupakan hal ini.)
    Exercise(
        id = "u27_s5_p2_q9",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Saya tidak lupa urusan ini.",
        targetHanzi = "我 没 忘 这 件 事。",
        targetPinyin = "Wǒ méi wàng zhè jiàn shì.",
        wordChips = listOf("我:wǒ", "没:méi", "忘:wàng", "这:zhè", "件:jiàn", "事。:shì.", "了:le"),
        correctAnswer = "我,没,忘,这,件,事。",
        audioToSpeak = "我没忘这件事。"
    )""",
            f"""    // 10. Soal 10: Ketuk Pasangan yang Sesuai (Grand Review Final Bab 27)
    Exercise(
        id = "u27_s5_p2_m10",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u27_s5_p2_m10_1", "天天快乐", "tiāntiān kuàilè", "bahagia tiap hari"),
            MatchPairItem("u27_s5_p2_m10_2", "做事情", "zuò shìqing", "kerja urusan"),
            MatchPairItem("u27_s5_p2_m10_3", "没忘记", "méi wàngjì", "tak terlupa"),
            MatchPairItem("u27_s5_p2_m10_4", "上网看", "shàngwǎng kàn", "nonton daring")
        )
    )"""
        ]
    }

    for s_idx in range(1, 6):
        filename = f"{base_dir}/Bab27Stage{s_idx}Data.kt"
        p1_code = ",\n\n".join(stages[s_idx]["p1"])
        p2_code = ",\n\n".join(stages[s_idx]["p2"])
        
        content = f"""package com.example.chineselearning.data.repository

import com.example.chineselearning.R
import com.example.chineselearning.data.model.Exercise
import com.example.chineselearning.data.model.ExerciseType
import com.example.chineselearning.data.model.MatchPairItem
import com.example.chineselearning.data.model.PictureOption

val bab27Stage{s_idx}Part1Exercises = listOf(
{p1_code}
)

val bab27Stage{s_idx}Part2Exercises = listOf(
{p2_code}
)
"""
        with open(filename, "w", encoding="utf-8") as f:
            f.write(content)
        print(f"Written {filename}")

if __name__ == "__main__":
    generate_bab27()
