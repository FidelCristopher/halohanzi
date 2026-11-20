package com.example.chineselearning.data.repository

import com.example.chineselearning.R
import com.example.chineselearning.data.model.Exercise
import com.example.chineselearning.data.model.ExerciseType
import com.example.chineselearning.data.model.MatchPairItem
import com.example.chineselearning.data.model.PictureOption

val bab27Stage1Part1Exercises = listOf(
    // 1. Soal 1: Pilihan Gambar (画 -> melukis / menggambar)
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
    ),

    // 2. Soal 2: Susun Kalimat (Hobi saya di waktu luang adalah melukis.)
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
    ),

    // 3. Soal 3: Ketuk Pasangan yang Sesuai (Hobi & Melukis)
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
    ),

    // 4. Soal 4: Ketik Pinyin (hobi -> àihào)
    Exercise(
        id = "u27_s1_p1_q4",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "hobi / kegemaran",
        sentenceWithBlank = "爱好 (________)",
        targetHanzi = "爱好",
        targetPinyin = "àihào",
        correctAnswer = "aihao",
        keyboardKeys = listOf("a", "i", "h", "o", "e", "u", "b", "d", "g", "j", "l", "m"),
        audioToSpeak = "爱好"
    ),

    // 5. Soal 5: Mendengar Kalimat (Rule 10: illustrationRes = 0)
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
    ),

    // 6. Soal 6: Pilihan Kalimat
    Exercise(
        id = "u27_s1_p1_q6",
        type = ExerciseType.SENTENCE_CHOICE,
        title = "Pilih terjemahan yang benar",
        targetHanzi = "你 有 什么 业余 爱好？",
        targetPinyin = "Nǐ yǒu shénme yèyú àihào?",
        targetTranslation = "Kamu punya hobi apa di waktu luang?",
        correctAnswer = "Nǐ yǒu shénme yèyú àihào?\n你 有 什么 业余 爱好？",
        options = listOf(
            "Nǐ yǒu shénme yèyú àihào?\n你 有 什么 业余 爱好？",
            "Nǐ xǐhuan shénme yùndòng?\n你 喜欢 什么 运动？",
            "Tā yǒu shénme yèyú àihào?\n他 有 什么 业余 爱好？"
        ),
        audioToSpeak = "你有什么业余爱好？"
    ),

    // 7. Soal 7: Pilihan Gambar (爱好 -> hobi seni)
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
    ),

    // 8. Soal 8: Ketik Pinyin (melukis/gambar -> huà)
    Exercise(
        id = "u27_s1_p1_q8",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "menggambar / lukisan",
        sentenceWithBlank = "画 (________)",
        targetHanzi = "画",
        targetPinyin = "huà",
        correctAnswer = "hua",
        keyboardKeys = listOf("h", "u", "a", "e", "i", "o", "b", "d", "g", "j", "l", "m"),
        audioToSpeak = "画"
    ),

    // 9. Soal 9: Susun Kalimat (Dia melukis pemandangan gunung dengan sangat indah.)
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
    ),

    // 10. Soal 10: Ketuk Pasangan yang Sesuai (Rangkuman Hobi Seni)
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
    )
)

val bab27Stage1Part2Exercises = listOf(
    // 1. Soal 1: Pilihan Gambar (画画 -> menggambar lukisan)
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
    ),

    // 2. Soal 2: Susun Kalimat (Saya suka menggambar lukisan tradisional Tiongkok.)
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
    ),

    // 3. Soal 3: Ketuk Pasangan yang Sesuai (Lukisan & Gambar)
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
    ),

    // 4. Soal 4: Ketik Pinyin (menggambar -> huàhuà)
    Exercise(
        id = "u27_s1_p2_q4",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "menggambar / melukis",
        sentenceWithBlank = "画画 (________)",
        targetHanzi = "画画",
        targetPinyin = "huàhuà",
        correctAnswer = "huahua",
        keyboardKeys = listOf("h", "u", "a", "e", "i", "o", "b", "d", "g", "j", "l", "m"),
        audioToSpeak = "画画"
    ),

    // 5. Soal 5: Mendengar Kalimat (Rule 10: illustrationRes = 0)
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
    ),

    // 6. Soal 6: Pilihan Kalimat
    Exercise(
        id = "u27_s1_p2_q6",
        type = ExerciseType.SENTENCE_CHOICE,
        title = "Pilih terjemahan yang benar",
        targetHanzi = "墙 上 挂 着 一 幅 漂亮 的 画。",
        targetPinyin = "Qiáng shang guà zhe yì fú piàoliang de huà.",
        targetTranslation = "Di dinding tergantung sebuah lukisan yang indah.",
        correctAnswer = "Qiáng shang guà zhe yì fú piàoliang de huà.\n墙 上 挂 着 一 幅 漂亮 的 画。",
        options = listOf(
            "Qiáng shang guà zhe yì fú piàoliang de huà.\n墙 上 挂 着 一 幅 漂亮 的 画。",
            "Zhuōzi shang fàng zhe yì fú huà.\n桌子 上 放 着 一 幅 画。",
            "Qiáng shang guà zhe yí kuài shǒubiǎo.\n墙 上 挂 着 一 块 手表。"
        ),
        audioToSpeak = "墙上挂着一幅漂亮的画。"
    ),

    // 7. Soal 7: Pilihan Gambar (画 -> lukisan)
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
    ),

    // 8. Soal 8: Ketik Pinyin (sebuah lukisan -> yífú)
    Exercise(
        id = "u27_s1_p2_q8",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "sebuah (penggolong lukisan)",
        sentenceWithBlank = "一幅 (________)",
        targetHanzi = "一幅",
        targetPinyin = "yìfú",
        correctAnswer = "yifu",
        keyboardKeys = listOf("y", "i", "f", "u", "a", "e", "o", "b", "d", "g", "h", "j"),
        audioToSpeak = "一幅"
    ),

    // 9. Soal 9: Susun Kalimat (Kakak perempuan sedang melukis bunga di taman.)
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
    ),

    // 10. Soal 10: Ketuk Pasangan yang Sesuai (Rangkuman Melukis Alam)
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
    )
)
