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

def generate_bab23():
    base_dir = "app/src/main/java/com/example/chineselearning/data/repository"
    
    stages = {}
    
    # =========================================================================
    # STAGE 1: Rencana Berwisata & Ke Luar Negeri (旅游, 外国, 出国)
    # =========================================================================
    k1_p1_q4 = make_keys("lvyou")
    k1_p1_q8 = make_keys("waiguo")
    k1_p2_q4 = make_keys("chuguo")
    k1_p2_q8 = make_keys("beijing")
    
    stages[1] = {
        "p1": [
            f"""    // 1. Soal 1: Pilihan Gambar (旅游 -> berwisata / berlibur)
    Exercise(
        id = "u23_s1_p1_q1",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "旅游",
        targetPinyin = "lǚyóu",
        targetTranslation = "berwisata / berlibur",
        correctAnswer = "berwisata / berlibur",
        audioToSpeak = "旅游",
        pictureOptions = listOf(
            PictureOption("u23_s1_p1_opt1", "berwisata", "", R.drawable.ic_tour_travel, true),
            PictureOption("u23_s1_p1_opt2", "luar negeri", "", R.drawable.ic_tour_passport_abroad, false),
            PictureOption("u23_s1_p1_opt3", "bandara", "", R.drawable.ic_tour_airport, false),
            PictureOption("u23_s1_p1_opt4", "hotel", "", R.drawable.ic_tour_hotel, false)
        )
    )""",
            f"""    // 2. Soal 2: Susun Kalimat (Musim dingin tahun ini saya ingin berwisata ke Beijing.)
    Exercise(
        id = "u23_s1_p1_q2",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Musim dingin ini saya mau ke Beijing berlibur.",
        targetHanzi = "今年 冬天 我 想 去 北京 旅游。",
        targetPinyin = "Jīnnián dōngtiān wǒ xiǎng qù Běijīng lǚyóu.",
        wordChips = listOf("今年:jīnnián", "冬天:dōngtiān", "我:wǒ", "想:xiǎng", "去:qù", "北京:Běijīng", "旅游。:lǚyóu.", "工作:gōngzuò"),
        correctAnswer = "今年,冬天,我,想,去,北京,旅游。",
        audioToSpeak = "今年冬天我想去北京旅游。"
    )""",
            f"""    // 3. Soal 3: Ketuk Pasangan yang Sesuai (Berwisata & Luar Negeri)
    Exercise(
        id = "u23_s1_p1_q3",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u23_s1_p1_m1", "旅游", "lǚyóu", "berwisata / berlibur"),
            MatchPairItem("u23_s1_p1_m2", "外国", "wàiguó", "luar negeri"),
            MatchPairItem("u23_s1_p1_m3", "去北京", "qù Běijīng", "ke Beijing"),
            MatchPairItem("u23_s1_p1_m4", "冬天", "dōngtiān", "musim dingin")
        )
    )""",
            f"""    // 4. Soal 4: Ketik Pinyin (berwisata -> lǚyóu)
    Exercise(
        id = "u23_s1_p1_q4",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "berwisata / berlibur",
        sentenceWithBlank = "旅游 (________)",
        targetHanzi = "旅游",
        targetPinyin = "lǚyóu",
        correctAnswer = "lvyou",
        keyboardKeys = {k1_p1_q4},
        audioToSpeak = "旅游"
    )""",
            f"""    // 5. Soal 5: Mendengar Kalimat (Rule 10: illustrationRes = 0)
    Exercise(
        id = "u23_s1_p1_q5",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Apa yang Anda dengar?",
        targetTranslation = "Ada banyak teman luar negeri sedang belajar bahasa Mandarin.",
        targetHanzi = "有 很多 外国 朋友 在 学 中文。",
        targetPinyin = "Yǒu hěn duō wàiguó péngyou zài xué Zhōngwén.",
        wordChips = listOf("有:yǒu", "很多:hěn duō", "外国:wàiguó", "朋友:péngyou", "在:zài", "学:xué", "中文。:Zhōngwén.", "英语:Yīngyǔ"),
        correctAnswer = "有,很多,外国,朋友,在,学,中文。",
        illustrationRes = 0,
        audioToSpeak = "有很多外国朋友在学中文。"
    )""",
            f"""    // 6. Soal 6: Pilihan Kalimat
    Exercise(
        id = "u23_s1_p1_q6",
        type = ExerciseType.SENTENCE_CHOICE,
        title = "Pilih terjemahan yang benar",
        targetHanzi = "我 和 妻子 都 喜欢 去 外国 旅游。",
        targetPinyin = "Wǒ hé qīzi dōu xǐhuan qù wàiguó lǚyóu.",
        targetTranslation = "Saya dan istri sama-sama suka berwisata ke luar negeri.",
        correctAnswer = "Wǒ hé qīzi dōu xǐhuan qù wàiguó lǚyóu.\\n我 和 妻子 都 喜欢 去 外国 旅游。",
        options = listOf(
            "Wǒ hé qīzi dōu xǐhuan qù wàiguó lǚyóu.\\n我 和 妻子 都 喜欢 去 外国 旅游。",
            "Wǒ hé qīzi dōu bù xǐhuan lǚyóu.\\n我 和 妻子 都 不 喜欢 旅游。",
            "Tā hé qīzi dōu xǐhuan qù wàiguó lǚyóu.\\n他 和 妻子 都 喜欢 去 外国 旅游。"
        ),
        audioToSpeak = "我和妻子都喜欢去外国旅游。"
    )""",
            f"""    // 7. Soal 7: Pilihan Gambar (外国 -> luar negeri)
    Exercise(
        id = "u23_s1_p1_q7",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "外国",
        targetPinyin = "wàiguó",
        targetTranslation = "luar negeri",
        correctAnswer = "luar negeri",
        audioToSpeak = "外国",
        pictureOptions = listOf(
            PictureOption("u23_s1_p1_opt7_1", "luar negeri", "", R.drawable.ic_tour_passport_abroad, true),
            PictureOption("u23_s1_p1_opt7_2", "berwisata", "", R.drawable.ic_tour_travel, false),
            PictureOption("u23_s1_p1_opt7_3", "tiket pesawat", "", R.drawable.ic_tour_flight_ticket, false),
            PictureOption("u23_s1_p1_opt7_4", "hotel", "", R.drawable.ic_tour_hotel, false)
        )
    )""",
            f"""    // 8. Soal 8: Ketik Pinyin (luar negeri -> wàiguó)
    Exercise(
        id = "u23_s1_p1_q8",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "luar negeri",
        sentenceWithBlank = "外国 (________)",
        targetHanzi = "外国",
        targetPinyin = "wàiguó",
        correctAnswer = "waiguo",
        keyboardKeys = {k1_p1_q8},
        audioToSpeak = "外国"
    )""",
            f"""    // 9. Soal 9: Susun Kalimat (Teman saya pergi ke luar negeri berwisata.)
    Exercise(
        id = "u23_s1_p1_q9",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Teman saya ke luar negeri berlibur.",
        targetHanzi = "我 朋友 去 外国 旅游 了。",
        targetPinyin = "Wǒ péngyou qù wàiguó lǚyóu le.",
        wordChips = listOf("我:wǒ", "朋友:péngyou", "去:qù", "外国:wàiguó", "旅游:lǚyóu", "了。:le.", "回家:huíjiā"),
        correctAnswer = "我,朋友,去,外国,旅游,了。",
        audioToSpeak = "我朋友去外国旅游了。"
    )""",
            f"""    // 10. Soal 10: Ketuk Pasangan yang Sesuai (Rangkuman Wisata Internasional)
    Exercise(
        id = "u23_s1_p1_m10",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u23_s1_p1_m10_1", "旅游", "lǚyóu", "berlibur"),
            MatchPairItem("u23_s1_p1_m10_2", "外国", "wàiguó", "luar negeri"),
            MatchPairItem("u23_s1_p1_m10_3", "学中文", "xué Zhōngwén", "belajar Mandarin"),
            MatchPairItem("u23_s1_p1_m10_4", "朋友", "péngyou", "sahabat")
        )
    )"""
        ],
        "p2": [
            f"""    // 1. Soal 1: Pilihan Gambar (出国 -> pergi ke luar negeri)
    Exercise(
        id = "u23_s1_p2_q1",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "出国",
        targetPinyin = "chūguó",
        targetTranslation = "pergi ke luar negeri",
        correctAnswer = "pergi ke luar negeri",
        audioToSpeak = "出国",
        pictureOptions = listOf(
            PictureOption("u23_s1_p2_opt1", "pergi ke luar negeri", "", R.drawable.ic_tour_passport_abroad, true),
            PictureOption("u23_s1_p2_opt2", "hotel", "", R.drawable.ic_tour_hotel, false),
            PictureOption("u23_s1_p2_opt3", "pesawat terbang", "", R.drawable.ic_tour_airplane_fly, false),
            PictureOption("u23_s1_p2_opt4", "bandara", "", R.drawable.ic_tour_airport, false)
        )
    )""",
            f"""    // 2. Soal 2: Susun Kalimat (Dia berencana tahun depan pergi ke luar negeri kuliah universitas.)
    Exercise(
        id = "u23_s1_p2_q2",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Dia tahun depan mau kuliah di luar negeri.",
        targetHanzi = "他 明年 打算 出国 读 大学。",
        targetPinyin = "Tā míngnián dǎsuan chūguó dú dàxué.",
        wordChips = listOf("他:tā", "明年:míngnián", "打算:dǎsuan", "出国:chūguó", "读:dú", "大学。:dàxué.", "工作:gōngzuò"),
        correctAnswer = "他,明年,打算,出国,读,大学。",
        audioToSpeak = "他明年打算出国读大学。"
    )""",
            f"""    // 3. Soal 3: Ketuk Pasangan yang Sesuai (Ke Luar Negeri & Kuliah)
    Exercise(
        id = "u23_s1_p2_m3",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u23_s1_p2_m1", "出国", "chūguó", "ke luar negeri"),
            MatchPairItem("u23_s1_p2_m2", "打算", "dǎsuan", "berencana"),
            MatchPairItem("u23_s1_p2_m3", "读大学", "dú dàxué", "kuliah universitas"),
            MatchPairItem("u23_s1_p2_m4", "明年", "míngnián", "tahun depan")
        )
    )""",
            f"""    // 4. Soal 4: Ketik Pinyin (pergi ke luar negeri -> chūguó)
    Exercise(
        id = "u23_s1_p2_q4",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "pergi ke luar negeri",
        sentenceWithBlank = "出国 (________)",
        targetHanzi = "出国",
        targetPinyin = "chūguó",
        correctAnswer = "chuguo",
        keyboardKeys = {k1_p2_q4},
        audioToSpeak = "出国"
    )""",
            f"""    // 5. Soal 5: Mendengar Kalimat (Rule 10: illustrationRes = 0)
    Exercise(
        id = "u23_s1_p2_q5",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Apa yang Anda dengar?",
        targetTranslation = "Apakah kamu pernah pergi ke luar negeri?",
        targetHanzi = "你 出过 国 吗？",
        targetPinyin = "Nǐ chū guo guó ma?",
        wordChips = listOf("你:nǐ", "出过:chū guo", "国:guó", "吗？:ma?", "去:qù"),
        correctAnswer = "你,出过,国,吗？",
        illustrationRes = 0,
        audioToSpeak = "你出过国吗？"
    )""",
            f"""    // 6. Soal 6: Pilihan Kalimat
    Exercise(
        id = "u23_s1_p2_q6",
        type = ExerciseType.SENTENCE_CHOICE,
        title = "Pilih terjemahan yang benar",
        targetHanzi = "出国 旅游 要 准备 护照。",
        targetPinyin = "Chūguó lǚyóu yào zhǔnbèi hùzhào.",
        targetTranslation = "Berwisata ke luar negeri harus mempersiapkan paspor.",
        correctAnswer = "Chūguó lǚyóu yào zhǔnbèi hùzhào.\\n出国 旅游 要 准备 护照。",
        options = listOf(
            "出国 旅游 要 准备 护照。\\nChūguó lǚyóu yào zhǔnbèi hùzhào.",
            "Chūguó lǚyóu bù yào zhǔnbèi hùzhào.\\n出国 旅游 不 要 准备 护照。",
            "Zài jiā lǐ yào zhǔnbèi hùzhào.\\n在 家 里 要 准备 护照。"
        ),
        audioToSpeak = "出国旅游要准备护照。"
    )""",
            f"""    // 7. Soal 7: Pilihan Gambar (旅游 -> berlibur tamasya)
    Exercise(
        id = "u23_s1_p2_q7",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "旅游",
        targetPinyin = "lǚyóu",
        targetTranslation = "berwisata",
        correctAnswer = "berwisata",
        audioToSpeak = "旅游",
        pictureOptions = listOf(
            PictureOption("u23_s1_p2_opt7_1", "berwisata", "", R.drawable.ic_tour_travel, true),
            PictureOption("u23_s1_p2_opt7_2", "tiket pesawat", "", R.drawable.ic_tour_flight_ticket, false),
            PictureOption("u23_s1_p2_opt7_3", "hotel", "", R.drawable.ic_tour_hotel, false),
            PictureOption("u23_s1_p2_opt7_4", "bandara", "", R.drawable.ic_tour_airport, false)
        )
    )""",
            f"""    // 8. Soal 8: Ketik Pinyin (berwisata -> lǚyóu)
    Exercise(
        id = "u23_s1_p2_q8",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "berwisata / berlibur",
        sentenceWithBlank = "旅游 (________)",
        targetHanzi = "旅游",
        targetPinyin = "lǚyóu",
        correctAnswer = "lvyou",
        keyboardKeys = {k1_p1_q4},
        audioToSpeak = "旅游"
    )""",
            f"""    // 9. Soal 9: Susun Kalimat (Kakak perempuan pergi ke luar negeri bekerja.)
    Exercise(
        id = "u23_s1_p2_q9",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Kakak perempuan ke luar negeri kerja.",
        targetHanzi = "姐姐 出国 工作 了。",
        targetPinyin = "Jiějie chūguó gōngzuò le.",
        wordChips = listOf("姐姐:jiějie", "出国:chūguó", "工作:gōngzuò", "了。:le.", "回家:huíjiā"),
        correctAnswer = "姐姐,出国,工作,了。",
        audioToSpeak = "姐姐出国工作了。"
    )""",
            f"""    // 10. Soal 10: Ketuk Pasangan yang Sesuai (Rangkuman Pergi ke Luar Negeri)
    Exercise(
        id = "u23_s1_p2_m10",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u23_s1_p2_m10_1", "出国", "chūguó", "ke luar negeri"),
            MatchPairItem("u23_s1_p2_m10_2", "护照", "hùzhào", "paspor"),
            MatchPairItem("u23_s1_p2_m10_3", "出国工作", "chūguó gōngzuò", "kerja di luar negeri"),
            MatchPairItem("u23_s1_p2_m10_4", "准备好", "zhǔnbèi hǎo", "siap sedia")
        )
    )"""
        ]
    }

    # =========================================================================
    # STAGE 2: Bandara, Penerbangan & Tiket Pesawat (机场, 机票, 飞, 票, 门票)
    # =========================================================================
    k2_p1_q4 = make_keys("jichang")
    k2_p1_q8 = make_keys("jipiao")
    k2_p2_q4 = make_keys("fei")
    k2_p2_q8 = make_keys("menpiao")
    
    stages[2] = {
        "p1": [
            f"""    // 1. Soal 1: Pilihan Gambar (机场 -> bandara)
    Exercise(
        id = "u23_s2_p1_q1",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "机场",
        targetPinyin = "jīchǎng",
        targetTranslation = "bandara / bandar udara",
        correctAnswer = "bandara / bandar udara",
        audioToSpeak = "机场",
        pictureOptions = listOf(
            PictureOption("u23_s2_p1_opt1", "bandara", "", R.drawable.ic_tour_airport, true),
            PictureOption("u23_s2_p1_opt2", "tiket pesawat", "", R.drawable.ic_tour_flight_ticket, false),
            PictureOption("u23_s2_p1_opt3", "hotel", "", R.drawable.ic_tour_hotel, false),
            PictureOption("u23_s2_p1_opt4", "wisata", "", R.drawable.ic_tour_travel, false)
        )
    )""",
            f"""    // 2. Soal 2: Susun Kalimat (Besok pagi saya harus pergi ke bandara menjemput teman.)
    Exercise(
        id = "u23_s2_p1_q2",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Besok pagi saya ke bandara jemput kawan.",
        targetHanzi = "明天 早上 我 去 机场 接 朋友。",
        targetPinyin = "Míngtiān zǎoshang wǒ qù jīchǎng jiē péngyou.",
        wordChips = listOf("明天:míngtiān", "早上:zǎoshang", "我:wǒ", "去:qù", "机场:jīchǎng", "接:jiē", "朋友。:péngyou.", "车站:chēzhàn"),
        correctAnswer = "明天,早上,我,去,机场,接,朋友。",
        audioToSpeak = "明天早上我去机场接朋友。"
    )""",
            f"""    // 3. Soal 3: Ketuk Pasangan yang Sesuai (Bandara & Tiket Pesawat)
    Exercise(
        id = "u23_s2_p1_q3",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u23_s2_p1_m1", "机场", "jīchǎng", "bandara"),
            MatchPairItem("u23_s2_p1_m2", "机票", "jīpiào", "tiket pesawat"),
            MatchPairItem("u23_s2_p1_m3", "接朋友", "jiē péngyou", "jemput kawan"),
            MatchPairItem("u23_s2_p1_m4", "太贵了", "tài guì le", "terlalu mahal")
        )
    )""",
            f"""    // 4. Soal 4: Ketik Pinyin (bandara -> jīchǎng)
    Exercise(
        id = "u23_s2_p1_q4",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "bandara / bandar udara",
        sentenceWithBlank = "机场 (________)",
        targetHanzi = "机场",
        targetPinyin = "jīchǎng",
        correctAnswer = "jichang",
        keyboardKeys = {k2_p1_q4},
        audioToSpeak = "机场"
    )""",
            f"""    // 5. Soal 5: Mendengar Kalimat (Rule 10: illustrationRes = 0)
    Exercise(
        id = "u23_s2_p1_q5",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Apa yang Anda dengar?",
        targetTranslation = "Tiket pesawat menjelang Imlek sangat mahal.",
        targetHanzi = "春节 前 的 机票 很 贵。",
        targetPinyin = "Chūnjié qián de jīpiào hěn guì.",
        wordChips = listOf("春节:chūnjié", "前:qián", "的:de", "机票:jīpiào", "很:hěn", "贵。:guì.", "便宜:piányi"),
        correctAnswer = "春节,前,的,机票,很,贵。",
        illustrationRes = 0,
        audioToSpeak = "春节前的机票很贵。"
    )""",
            f"""    // 6. Soal 6: Pilihan Kalimat
    Exercise(
        id = "u23_s2_p1_q6",
        type = ExerciseType.SENTENCE_CHOICE,
        title = "Pilih terjemahan yang benar",
        targetHanzi = "我 已经 买 好 了 去 北京 的 机票。",
        targetPinyin = "Wǒ yǐjīng mǎi hǎo le qù Běijīng de jīpiào.",
        targetTranslation = "Saya sudah membeli tiket pesawat ke Beijing.",
        correctAnswer = "Wǒ yǐjīng mǎi hǎo le qù Běijīng de jīpiào.\\n我 已经 买 好 了 去 北京 的 机票。",
        options = listOf(
            "Wǒ yǐjīng mǎi hǎo le qù Běijīng de jīpiào.\\n我 已经 买 好 了 去 北京 的 机票。",
            "Wǒ hái méi mǎi qù Běijīng de jīpiào.\\n我 还 没 买 去 北京 的 机票。",
            "Tā yǐjīng mǎi hǎo le qù Shànghǎi de jīpiào.\\n他 已经 买 好 了 去 上海 的 机票。"
        ),
        audioToSpeak = "我已经买好了去北京的机票。"
    )""",
            f"""    // 7. Soal 7: Pilihan Gambar (机票 -> tiket pesawat)
    Exercise(
        id = "u23_s2_p1_q7",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "机票",
        targetPinyin = "jīpiào",
        targetTranslation = "tiket pesawat",
        correctAnswer = "tiket pesawat",
        audioToSpeak = "机票",
        pictureOptions = listOf(
            PictureOption("u23_s2_p1_opt7_1", "tiket pesawat", "", R.drawable.ic_tour_flight_ticket, true),
            PictureOption("u23_s2_p1_opt7_2", "bandara", "", R.drawable.ic_tour_airport, false),
            PictureOption("u23_s2_p1_opt7_3", "hotel", "", R.drawable.ic_tour_hotel, false),
            PictureOption("u23_s2_p1_opt7_4", "paspor", "", R.drawable.ic_tour_passport_abroad, false)
        )
    )""",
            f"""    // 8. Soal 8: Ketik Pinyin (tiket pesawat -> jīpiào)
    Exercise(
        id = "u23_s2_p1_q8",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "tiket pesawat",
        sentenceWithBlank = "机票 (________)",
        targetHanzi = "机票",
        targetPinyin = "jīpiào",
        correctAnswer = "jipiao",
        keyboardKeys = {k2_p1_q8},
        audioToSpeak = "机票"
    )""",
            f"""    // 9. Soal 9: Susun Kalimat (Dari sini naik taksi ke bandara sangat cepat.)
    Exercise(
        id = "u23_s2_p1_q9",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Dari sini naik taksi ke bandara cepat.",
        targetHanzi = "从 这里 打车 去 机场 很 快。",
        targetPinyin = "Cóng zhèlǐ dǎchē qù jīchǎng hěn kuài.",
        wordChips = listOf("从:cóng", "这里:zhèlǐ", "打车:dǎchē", "去:qù", "机场:jīchǎng", "很:hěn", "快。:kuài.", "慢:màn"),
        correctAnswer = "从,这里,打车,去,机场,很,快。",
        audioToSpeak = "从这里打车去机场很快。"
    )""",
            f"""    // 10. Soal 10: Ketuk Pasangan yang Sesuai (Rangkuman Tiket Penerbangan)
    Exercise(
        id = "u23_s2_p1_m10",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u23_s2_p1_m10_1", "机票", "jīpiào", "tiket pesawat"),
            MatchPairItem("u23_s2_p1_m2", "机场", "jīchǎng", "bandar udara"),
            MatchPairItem("u23_s2_p1_m3", "买好机票", "mǎi hǎo jīpiào", "beli tiket"),
            MatchPairItem("u23_s2_p1_m4", "很便宜", "hěn piányi", "sangat murah")
        )
    )"""
        ],
        "p2": [
            f"""    // 1. Soal 1: Pilihan Gambar (飞 -> terbang / pesawat terbang)
    Exercise(
        id = "u23_s2_p2_q1",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "飞",
        targetPinyin = "fēi",
        targetTranslation = "terbang",
        correctAnswer = "terbang",
        audioToSpeak = "飞",
        pictureOptions = listOf(
            PictureOption("u23_s2_p2_opt1", "terbang", "", R.drawable.ic_tour_airplane_fly, true),
            PictureOption("u23_s2_p2_opt2", "hotel", "", R.drawable.ic_tour_hotel, false),
            PictureOption("u23_s2_p2_opt3", "tiket", "", R.drawable.ic_tour_flight_ticket, false),
            PictureOption("u23_s2_p2_opt4", "bandara", "", R.drawable.ic_tour_airport, false)
        )
    )""",
            f"""    // 2. Soal 2: Susun Kalimat (Burung kecil terbang di langit biru.)
    Exercise(
        id = "u23_s2_p2_q2",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Burung terbang di langit biru.",
        targetHanzi = "小鸟 在 天空 上 飞。",
        targetPinyin = "Xiǎoniǎo zài tiānkōng shàng fēi.",
        wordChips = listOf("小鸟:xiǎoniǎo", "在:zài", "天空:tiānkōng", "上:shàng", "飞。:fēi.", "跑:pǎo"),
        correctAnswer = "小鸟,在,天空,上,飞。",
        audioToSpeak = "小鸟在天空上飞。"
    )""",
            f"""    // 3. Soal 3: Ketuk Pasangan yang Sesuai (Tiket & Tiket Masuk)
    Exercise(
        id = "u23_s2_p2_m3",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u23_s2_p2_m1", "飞", "fēi", "terbang"),
            MatchPairItem("u23_s2_p2_m2", "票", "piào", "tiket / karcis"),
            MatchPairItem("u23_s2_p2_m3", "门票", "ménpiào", "tiket masuk"),
            MatchPairItem("u23_s2_p2_m4", "电影票", "diànyǐngpiào", "tiket bioskop")
        )
    )""",
            f"""    // 4. Soal 4: Ketik Pinyin (terbang -> fēi)
    Exercise(
        id = "u23_s2_p2_q4",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "terbang",
        sentenceWithBlank = "飞 (________)",
        targetHanzi = "飞",
        targetPinyin = "fēi",
        correctAnswer = "fei",
        keyboardKeys = {k2_p2_q4},
        audioToSpeak = "飞"
    )""",
            f"""    // 5. Soal 5: Mendengar Kalimat (Rule 10: illustrationRes = 0)
    Exercise(
        id = "u23_s2_p2_q5",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Apa yang Anda dengar?",
        targetTranslation = "Tiket masuk taman lima puluh yuan per lembar.",
        targetHanzi = "公园 的 门票 一 张 五十 块。",
        targetPinyin = "Gōngyuán de ménpiào yì zhāng wǔshí kuài.",
        wordChips = listOf("公园:gōngyuán", "的:de", "门票:ménpiào", "一:yì", "张:zhāng", "五十:wǔshí", "块。:kuài.", "百:bǎi"),
        correctAnswer = "公园,的,门票,一,张,五十,块。",
        illustrationRes = 0,
        audioToSpeak = "公园的门票一张五十块。"
    )""",
            f"""    // 6. Soal 6: Pilihan Kalimat
    Exercise(
        id = "u23_s2_p2_q6",
        type = ExerciseType.SENTENCE_CHOICE,
        title = "Pilih terjemahan yang benar",
        targetHanzi = "电影票 已经 卖 完 了。",
        targetPinyin = "Diànyǐngpiào yǐjīng mài wán le.",
        targetTranslation = "Tiket bioskop sudah habis terjual.",
        correctAnswer = "Diànyǐngpiào yǐjīng mài wán le.\\n电影票 已经 卖 完 了。",
        options = listOf(
            "Diànyǐngpiào yǐjīng mài wán le.\\n电影票 已经 卖 完 了。",
            "Diànyǐngpiào hái méi mài wán.\\n电影票 还 没 卖 完。",
            "Jīpiào yǐjīng mài wán le.\\n机票 已经 卖 完 了。"
        ),
        audioToSpeak = "电影票已经卖完了。"
    )""",
            f"""    // 7. Soal 7: Pilihan Gambar (门票 -> tiket masuk tempat wisata)
    Exercise(
        id = "u23_s2_p2_q7",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "门票",
        targetPinyin = "ménpiào",
        targetTranslation = "tiket masuk",
        correctAnswer = "tiket masuk",
        audioToSpeak = "门票",
        pictureOptions = listOf(
            PictureOption("u23_s2_p2_opt7_1", "tiket masuk", "", R.drawable.ic_tour_flight_ticket, true),
            PictureOption("u23_s2_p2_opt7_2", "terbang", "", R.drawable.ic_tour_airplane_fly, false),
            PictureOption("u23_s2_p2_opt7_3", "hotel", "", R.drawable.ic_tour_hotel, false),
            PictureOption("u23_s2_p2_opt7_4", "bandara", "", R.drawable.ic_tour_airport, false)
        )
    )""",
            f"""    // 8. Soal 8: Ketik Pinyin (tiket masuk -> ménpiào)
    Exercise(
        id = "u23_s2_p2_q8",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "tiket masuk",
        sentenceWithBlank = "门票 (________)",
        targetHanzi = "门票",
        targetPinyin = "ménpiào",
        correctAnswer = "menpiao",
        keyboardKeys = {k2_p2_q8},
        audioToSpeak = "门票"
    )""",
            f"""    // 9. Soal 9: Susun Kalimat (Pesawat terbang sangat tinggi di awan.)
    Exercise(
        id = "u23_s2_p2_q9",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Pesawat terbang sangat tinggi.",
        targetHanzi = "飞机 飞 得 很 高。",
        targetPinyin = "Fēijī fēi de hěn gāo.",
        wordChips = listOf("飞机:fēijī", "飞:fēi", "得:de", "很:hěn", "高。:gāo.", "快:kuài"),
        correctAnswer = "飞机,飞,得,很,高。",
        audioToSpeak = "飞机飞得很高。"
    )""",
            f"""    // 10. Soal 10: Ketuk Pasangan yang Sesuai (Rangkuman Tiket Masuk & Tiket)
    Exercise(
        id = "u23_s2_p2_m10",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u23_s2_p2_m10_1", "门票", "ménpiào", "tiket masuk"),
            MatchPairItem("u23_s2_p2_m10_2", "票", "piào", "tiket / karcis"),
            MatchPairItem("u23_s2_p2_m3", "飞得高", "fēi de gāo", "terbang tinggi"),
            MatchPairItem("u23_s2_p2_m4", "一张票", "yì zhāng piào", "selembar tiket")
        )
    )"""
        ]
    }

    # =========================================================================
    # STAGE 3: Akomodasi Hotel & Merayakan Tahun Baru (酒店, 过, 过年, 准备)
    # =========================================================================
    k3_p1_q4 = make_keys("jiudian")
    k3_p1_q8 = make_keys("zhunbei")
    k3_p2_q4 = make_keys("guonian")
    k3_p2_q8 = make_keys("guo")
    
    stages[3] = {
        "p1": [
            f"""    // 1. Soal 1: Pilihan Gambar (酒店 -> hotel / penginapan)
    Exercise(
        id = "u23_s3_p1_q1",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "酒店",
        targetPinyin = "jiǔdiàn",
        targetTranslation = "hotel / penginapan",
        correctAnswer = "hotel / penginapan",
        audioToSpeak = "酒店",
        pictureOptions = listOf(
            PictureOption("u23_s3_p1_opt1", "hotel", "", R.drawable.ic_tour_hotel, true),
            PictureOption("u23_s3_p1_opt2", "bandara", "", R.drawable.ic_tour_airport, false),
            PictureOption("u23_s3_p1_opt3", "wisata", "", R.drawable.ic_tour_travel, false),
            PictureOption("u23_s3_p1_opt4", "tiket", "", R.drawable.ic_tour_flight_ticket, false)
        )
    )""",
            f"""    // 2. Soal 2: Susun Kalimat (Kami tinggal di sebuah hotel besar di tepi laut.)
    Exercise(
        id = "u23_s3_p1_q2",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Kami tinggal di hotel tepi laut.",
        targetHanzi = "我们 住 在 海边 的 酒店。",
        targetPinyin = "Wǒmen zhù zài hǎibiān de jiǔdiàn.",
        wordChips = listOf("我们:wǒmen", "住:zhù", "在:zài", "海边:hǎibiān", "的:de", "酒店。:jiǔdiàn.", "学校:xuéxiào"),
        correctAnswer = "我们,住,在,海边,的,酒店。",
        audioToSpeak = "我们住在海边的酒店。"
    )""",
            f"""    // 3. Soal 3: Ketuk Pasangan yang Sesuai (Hotel & Bersiap)
    Exercise(
        id = "u23_s3_p1_q3",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u23_s3_p1_m1", "酒店", "jiǔdiàn", "hotel"),
            MatchPairItem("u23_s3_p1_m2", "准备", "zhǔnbèi", "bersiap / menyiapkan"),
            MatchPairItem("u23_s3_p1_m3", "住酒店", "zhù jiǔdiàn", "menginap di hotel"),
            MatchPairItem("u23_s3_p1_m4", "准备好", "zhǔnbèi hǎo", "sudah siap")
        )
    )""",
            f"""    // 4. Soal 4: Ketik Pinyin (hotel -> jiǔdiàn)
    Exercise(
        id = "u23_s3_p1_q4",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "hotel / penginapan",
        sentenceWithBlank = "酒店 (________)",
        targetHanzi = "酒店",
        targetPinyin = "jiǔdiàn",
        correctAnswer = "jiudian",
        keyboardKeys = {k3_p1_q4},
        audioToSpeak = "酒店"
    )""",
            f"""    // 5. Soal 5: Mendengar Kalimat (Rule 10: illustrationRes = 0)
    Exercise(
        id = "u23_s3_p1_q5",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Apa yang Anda dengar?",
        targetTranslation = "Saya sudah siap berangkat berwisata.",
        targetHanzi = "我 已经 准备 好 去 旅游 了。",
        targetPinyin = "Wǒ yǐjīng zhǔnbèi hǎo qù lǚyóu le.",
        wordChips = listOf("我:wǒ", "已经:yǐjīng", "准备:zhǔnbèi", "好:hǎo", "去:qù", "旅游:lǚyóu", "了。:le."),
        correctAnswer = "我,已经,准备,好,去,旅游,了。",
        illustrationRes = 0,
        audioToSpeak = "我已经准备好去旅游了。"
    )""",
            f"""    // 6. Soal 6: Pilihan Kalimat
    Exercise(
        id = "u23_s3_p1_q6",
        type = ExerciseType.SENTENCE_CHOICE,
        title = "Pilih terjemahan yang benar",
        targetHanzi = "你 准备 什么时候 去 中国？",
        targetPinyin = "Nǐ zhǔnbèi shénmeshíhou qù Zhōngguó?",
        targetTranslation = "Kamu berencana kapan pergi ke Tiongkok?",
        correctAnswer = "Nǐ zhǔnbèi shénmeshíhou qù Zhōngguó?\\n你 准备 什么时候 去 中国？",
        options = listOf(
            "Nǐ zhǔnbèi shénmeshíhou qù Zhōngguó?\\n你 准备 什么时候 去 中国？",
            "Nǐ yǐjīng qù Zhōngguó le ma?\\n你 已经 去 中国 了 吗？",
            "Tā zhǔnbèi shénmeshíhou qù Zhōngguó?\\n他 准备 什么时候 去 中国？"
        ),
        audioToSpeak = "你准备什么时候去中国？"
    )""",
            f"""    // 7. Soal 7: Pilihan Gambar (酒店 -> penginapan)
    Exercise(
        id = "u23_s3_p1_q7",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "酒店",
        targetPinyin = "jiǔdiàn",
        targetTranslation = "penginapan",
        correctAnswer = "penginapan",
        audioToSpeak = "酒店",
        pictureOptions = listOf(
            PictureOption("u23_s3_p1_opt7_1", "hotel", "", R.drawable.ic_tour_hotel, true),
            PictureOption("u23_s3_p1_opt7_2", "bandara", "", R.drawable.ic_tour_airport, false),
            PictureOption("u23_s3_p1_opt7_3", "wisata", "", R.drawable.ic_tour_travel, false),
            PictureOption("u23_s3_p1_opt7_4", "paspor", "", R.drawable.ic_tour_passport_abroad, false)
        )
    )""",
            f"""    // 8. Soal 8: Ketik Pinyin (mempersiapkan -> zhǔnbèi)
    Exercise(
        id = "u23_s3_p1_q8",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "mempersiapkan / bersiap",
        sentenceWithBlank = "准备 (________)",
        targetHanzi = "准备",
        targetPinyin = "zhǔnbèi",
        correctAnswer = "zhunbei",
        keyboardKeys = {k3_p1_q8},
        audioToSpeak = "准备"
    )""",
            f"""    // 9. Soal 9: Susun Kalimat (Hotel ini pelayanannya sangat baik.)
    Exercise(
        id = "u23_s3_p1_q9",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Hotel ini sangat bagus.",
        targetHanzi = "这家 酒店 很 好。",
        targetPinyin = "Zhè jiā jiǔdiàn hěn hǎo.",
        wordChips = listOf("这家:zhè jiā", "酒店:jiǔdiàn", "很:hěn", "好。:hǎo.", "大:dà"),
        correctAnswer = "这家,酒店,很,好。",
        audioToSpeak = "这家酒店很好。"
    )""",
            f"""    // 10. Soal 10: Ketuk Pasangan yang Sesuai (Rangkuman Hotel)
    Exercise(
        id = "u23_s3_p1_m10",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u23_s3_p1_m10_1", "酒店", "jiǔdiàn", "hotel"),
            MatchPairItem("u23_s3_p1_m10_2", "准备", "zhǔnbèi", "bersiap-siap"),
            MatchPairItem("u23_s3_p1_m10_3", "大酒店", "dà jiǔdiàn", "hotel besar"),
            MatchPairItem("u23_s3_p1_m10_4", "什么时候", "shénmeshíhou", "kapan")
        )
    )"""
        ],
        "p2": [
            f"""    // 1. Soal 1: Pilihan Gambar (过年 -> merayakan Tahun Baru Imlek)
    Exercise(
        id = "u23_s3_p2_q1",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "过年",
        targetPinyin = "guònián",
        targetTranslation = "merayakan Imlek",
        correctAnswer = "merayakan Imlek",
        audioToSpeak = "过年",
        pictureOptions = listOf(
            PictureOption("u23_s3_p2_opt1", "merayakan Imlek", "", R.drawable.ic_tour_travel, true),
            PictureOption("u23_s3_p2_opt2", "hotel", "", R.drawable.ic_tour_hotel, false),
            PictureOption("u23_s3_p2_opt3", "bandara", "", R.drawable.ic_tour_airport, false),
            PictureOption("u23_s3_p2_opt4", "tiket", "", R.drawable.ic_tour_flight_ticket, false)
        )
    )""",
            f"""    // 2. Soal 2: Susun Kalimat (Saat merayakan tahun baru seluruh keluarga berkumpul.)
    Exercise(
        id = "u23_s3_p2_q2",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Saat Imlek sekeluarga kumpul.",
        targetHanzi = "过年 全家 团聚 在 一起。",
        targetPinyin = "Guònián quánjiā tuánjù zài yìqǐ.",
        wordChips = listOf("过年:guònián", "全家:quánjiā", "团聚:tuánjù", "在:zài", "一起。:yìqǐ.", "出去:chūqù"),
        correctAnswer = "过年,全家,团聚,在,一起。",
        audioToSpeak = "过年全家团聚在一起。"
    )""",
            f"""    // 3. Soal 3: Ketuk Pasangan yang Sesuai (Merayakan Imlek & Waktu)
    Exercise(
        id = "u23_s3_p2_m3",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u23_s3_p2_m1", "过年", "guònián", "merayakan Imlek"),
            MatchPairItem("u23_s3_p2_m2", "过", "guò", "melewati waktu"),
            MatchPairItem("u23_s3_p2_m3", "全家", "quánjiā", "sekeluarga"),
            MatchPairItem("u23_s3_p2_m4", "很高兴", "hěn gāoxìng", "sangat senang")
        )
    )""",
            f"""    // 4. Soal 4: Ketik Pinyin (merayakan Imlek -> guònián)
    Exercise(
        id = "u23_s3_p2_q4",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "merayakan Tahun Baru Imlek",
        sentenceWithBlank = "过年 (________)",
        targetHanzi = "过年",
        targetPinyin = "guònián",
        correctAnswer = "guonian",
        keyboardKeys = {k3_p2_q4},
        audioToSpeak = "过年"
    )""",
            f"""    // 5. Soal 5: Mendengar Kalimat (Rule 10: illustrationRes = 0)
    Exercise(
        id = "u23_s3_p2_q5",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Apa yang Anda dengar?",
        targetTranslation = "Hari ini saya lalui dengan sangat gembira.",
        targetHanzi = "今天 我 过 得 很 开心。",
        targetPinyin = "Jīntiān wǒ guò de hěn kāixīn.",
        wordChips = listOf("今天:jīntiān", "我:wǒ", "过:guò", "得:de", "很:hěn", "开心。:kāixīn.", "累:lèi"),
        correctAnswer = "今天,我,过,得,很,开心。",
        illustrationRes = 0,
        audioToSpeak = "今天我过得很开心。"
    )""",
            f"""    // 6. Soal 6: Pilihan Kalimat
    Exercise(
        id = "u23_s3_p2_q6",
        type = ExerciseType.SENTENCE_CHOICE,
        title = "Pilih terjemahan yang benar",
        targetHanzi = "过年 好！ 祝 您 新年 快乐！",
        targetPinyin = "Guònián hǎo! Zhù nín xīnnián kuàilè!",
        targetTranslation = "Selamat tahun baru! Mendoakan Anda selamat tahun baru!",
        correctAnswer = "Guònián hǎo! Zhù nín xīnnián kuàilè!\\n过年 好！ 祝 您 新年 快乐！",
        options = listOf(
            "Guònián hǎo! Zhù nín xīnnián kuàilè!\\n过年 好！ 祝 您 新年 快乐！",
            "Shēngrì kuàilè! Zhù nín shēntǐ jiànkāng!\\n生日 快乐！ 祝 您 身体 健康！",
            "Guònián hǎo! Zhù nǐ shēngrì kuàilè!\\n过年 好！ 祝 你 生日 快乐！"
        ),
        audioToSpeak = "过年好！祝您新年快乐！"
    )""",
            f"""    // 7. Soal 7: Pilihan Gambar (过 -> melewati hari)
    Exercise(
        id = "u23_s3_p2_q7",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "过",
        targetPinyin = "guò",
        targetTranslation = "melewati hari",
        correctAnswer = "melewati hari",
        audioToSpeak = "过",
        pictureOptions = listOf(
            PictureOption("u23_s3_p2_opt7_1", "melewati hari", "", R.drawable.ic_tour_travel, true),
            PictureOption("u23_s3_p2_opt7_2", "tiket", "", R.drawable.ic_tour_flight_ticket, false),
            PictureOption("u23_s3_p2_opt7_3", "hotel", "", R.drawable.ic_tour_hotel, false),
            PictureOption("u23_s3_p2_opt7_4", "bandara", "", R.drawable.ic_tour_airport, false)
        )
    )""",
            f"""    // 8. Soal 8: Ketik Pinyin (melewati hari -> guò)
    Exercise(
        id = "u23_s3_p2_q8",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "melewati / menghabiskan waktu",
        sentenceWithBlank = "过 (________)",
        targetHanzi = "过",
        targetPinyin = "guò",
        correctAnswer = "guo",
        keyboardKeys = {k3_p2_q8},
        audioToSpeak = "过"
    )""",
            f"""    // 9. Soal 9: Susun Kalimat (Kalian bagaimana merayakan tahun baru?)
    Exercise(
        id = "u23_s3_p2_q9",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Kalian merayakan Imlek bagaimana?",
        targetHanzi = "你们 怎么 过年？",
        targetPinyin = "Nǐmen zěnme guònián?",
        wordChips = listOf("你们:nǐmen", "怎么:zěnme", "过年？:guònián?", "吃饭:chīfàn"),
        correctAnswer = "你们,怎么,过年？",
        audioToSpeak = "你们怎么过年？"
    )""",
            f"""    // 10. Soal 10: Ketuk Pasangan yang Sesuai (Rangkuman Perayaan Imlek)
    Exercise(
        id = "u23_s3_p2_m10",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u23_s3_p2_m10_1", "过年", "guònián", "merayakan Imlek"),
            MatchPairItem("u23_s3_p2_m10_2", "过生日", "guò shēngrì", "merayakan ultah"),
            MatchPairItem("u23_s3_p2_m10_3", "过得好", "guò de hǎo", "hidup bahagia"),
            MatchPairItem("u23_s3_p2_m10_4", "很开心", "hěn kāixīn", "sangat gembira")
        )
    )"""
        ]
    }

    # =========================================================================
    # STAGE 4: Memberi Hadiah & Membawa Barang (送, 拿, 过 [guo])
    # =========================================================================
    k4_p1_q4 = make_keys("song")
    k4_p1_q8 = make_keys("na")
    k4_p2_q4 = make_keys("chiguo")
    k4_p2_q8 = make_keys("quguo")
    
    stages[4] = {
        "p1": [
            f"""    // 1. Soal 1: Pilihan Gambar (送 -> memberi hadiah / mengantar)
    Exercise(
        id = "u23_s4_p1_q1",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "送",
        targetPinyin = "sòng",
        targetTranslation = "memberi hadiah / mengantar",
        correctAnswer = "memberi hadiah / mengantar",
        audioToSpeak = "送",
        pictureOptions = listOf(
            PictureOption("u23_s4_p1_opt1", "memberi hadiah", "", R.drawable.ic_tour_travel, true),
            PictureOption("u23_s4_p1_opt2", "hotel", "", R.drawable.ic_tour_hotel, false),
            PictureOption("u23_s4_p1_opt3", "bandara", "", R.drawable.ic_tour_airport, false),
            PictureOption("u23_s4_p1_opt4", "tiket", "", R.drawable.ic_tour_flight_ticket, false)
        )
    )""",
            f"""    // 2. Soal 2: Susun Kalimat (Teman menghadiahi saya sebuah buku yang menarik.)
    Exercise(
        id = "u23_s4_p1_q2",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Teman menghadiahkan saya buku menarik.",
        targetHanzi = "朋友 送 我 一 本 好书。",
        targetPinyin = "Péngyou sòng wǒ yì běn hǎoshū.",
        wordChips = listOf("朋友:péngyou", "送:sòng", "我:wǒ", "一:yì", "本:běn", "好书。:hǎoshū.", "拿:ná"),
        correctAnswer = "朋友,送,我,一,本,好书。",
        audioToSpeak = "朋友送我一本好书。"
    )""",
            f"""    // 3. Soal 3: Ketuk Pasangan yang Sesuai (Mengantar & Membawa)
    Exercise(
        id = "u23_s4_p1_q3",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u23_s4_p1_m1", "送", "sòng", "mengantar / menghadiahkan"),
            MatchPairItem("u23_s4_p1_m2", "拿", "ná", "memegang / membawa"),
            MatchPairItem("u23_s4_p1_m3", "送朋友", "sòng péngyou", "mengantar teman"),
            MatchPairItem("u23_s4_p1_m4", "拿大包", "ná dàbāo", "membawa tas besar")
        )
    )""",
            f"""    // 4. Soal 4: Ketik Pinyin (mengantar/menghadiahi -> sòng)
    Exercise(
        id = "u23_s4_p1_q4",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "mengantar / memberi hadiah",
        sentenceWithBlank = "送 (________)",
        targetHanzi = "送",
        targetPinyin = "sòng",
        correctAnswer = "song",
        keyboardKeys = {k4_p1_q4},
        audioToSpeak = "送"
    )""",
            f"""    // 5. Soal 5: Mendengar Kalimat (Rule 10: illustrationRes = 0)
    Exercise(
        id = "u23_s4_p1_q5",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Apa yang Anda dengar?",
        targetTranslation = "Tolong bantu saya membawa tas besar ini sebentar.",
        targetHanzi = "请 帮 我 拿 一下 这个 包。",
        targetPinyin = "Qǐng bāng wǒ ná yíxià zhège bāo.",
        wordChips = listOf("请:qǐng", "帮:bāng", "我:wǒ", "拿:ná", "一下:yíxià", "这个:zhège", "包。:bāo.", "送:sòng"),
        correctAnswer = "请,帮,我,拿,一下,这个,包。",
        illustrationRes = 0,
        audioToSpeak = "请帮我拿一下这个包。"
    )""",
            f"""    // 6. Soal 6: Pilihan Kalimat
    Exercise(
        id = "u23_s4_p1_q6",
        type = ExerciseType.SENTENCE_CHOICE,
        title = "Pilih terjemahan yang benar",
        targetHanzi = "爸爸 开车 送 我 去 机场。",
        targetPinyin = "Bàba kāichē sòng wǒ qù jīchǎng.",
        targetTranslation = "Ayah mengendarai mobil mengantar saya ke bandara.",
        correctAnswer = "Bàba kāichē sòng wǒ qù jīchǎng.\\n爸爸 开车 送 我 去 机场。",
        options = listOf(
            "Bàba kāichē sòng wǒ qù jīchǎng.\\n爸爸 开车 送 我 去 机场。",
            "Bàba kāichē sòng wǒ qù xuéxiào.\\n爸爸 开车 送 我 去 学校。",
            "Māma kāichē sòng wǒ qù jīchǎng.\\n妈妈 开车 送 我 去 机场。"
        ),
        audioToSpeak = "爸爸开车送我去机场。"
    )""",
            f"""    // 7. Soal 7: Pilihan Gambar (拿 -> membawa / memegang)
    Exercise(
        id = "u23_s4_p1_q7",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "拿",
        targetPinyin = "ná",
        targetTranslation = "membawa / memegang",
        correctAnswer = "membawa / memegang",
        audioToSpeak = "拿",
        pictureOptions = listOf(
            PictureOption("u23_s4_p1_opt7_1", "membawa", "", R.drawable.ic_tour_travel, true),
            PictureOption("u23_s4_p1_opt7_2", "tiket", "", R.drawable.ic_tour_flight_ticket, false),
            PictureOption("u23_s4_p1_opt7_3", "hotel", "", R.drawable.ic_tour_hotel, false),
            PictureOption("u23_s4_p1_opt7_4", "bandara", "", R.drawable.ic_tour_airport, false)
        )
    )""",
            f"""    // 8. Soal 8: Ketik Pinyin (membawa -> ná)
    Exercise(
        id = "u23_s4_p1_q8",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "membawa / memegang",
        sentenceWithBlank = "拿 (________)",
        targetHanzi = "拿",
        targetPinyin = "ná",
        correctAnswer = "na",
        keyboardKeys = {k4_p1_q8},
        audioToSpeak = "拿"
    )""",
            f"""    // 9. Soal 9: Susun Kalimat (Ibu memberi saya sehelai celana baru.)
    Exercise(
        id = "u23_s4_p1_q9",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Ibu menghadiahkan saya celana baru.",
        targetHanzi = "妈妈 送 我 一 条 新 裤子。",
        targetPinyin = "Māma sòng wǒ yì tiáo xīn kùzi.",
        wordChips = listOf("妈妈:māma", "送:sòng", "我:wǒ", "一:yì", "条:tiáo", "新:xīn", "裤子。:kùzi.", "拿:ná"),
        correctAnswer = "妈妈,送,我,一,条,新,裤子。",
        audioToSpeak = "妈妈送我一条新裤子。"
    )""",
            f"""    // 10. Soal 10: Ketuk Pasangan yang Sesuai (Rangkuman Hadiah & Bawaan)
    Exercise(
        id = "u23_s4_p1_m10",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u23_s4_p1_m10_1", "送", "sòng", "memberikan"),
            MatchPairItem("u23_s4_p1_m10_2", "拿", "ná", "mengambil / bawa"),
            MatchPairItem("u23_s4_p1_m10_3", "送礼物", "sòng lǐwù", "memberi kado"),
            MatchPairItem("u23_s4_p1_m10_4", "拿行李", "ná xíngli", "bawa koper")
        )
    )"""
        ],
        "p2": [
            f"""    // 1. Soal 1: Pilihan Gambar (去过 -> pernah pergi)
    Exercise(
        id = "u23_s4_p2_q1",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "去过",
        targetPinyin = "qù guo",
        targetTranslation = "pernah pergi",
        correctAnswer = "pernah pergi",
        audioToSpeak = "去过",
        pictureOptions = listOf(
            PictureOption("u23_s4_p2_opt1", "pernah pergi", "", R.drawable.ic_tour_travel, true),
            PictureOption("u23_s4_p2_opt2", "hotel", "", R.drawable.ic_tour_hotel, false),
            PictureOption("u23_s4_p2_opt3", "bandara", "", R.drawable.ic_tour_airport, false),
            PictureOption("u23_s4_p2_opt4", "paspor", "", R.drawable.ic_tour_passport_abroad, false)
        )
    )""",
            f"""    // 2. Soal 2: Susun Kalimat (Apakah kamu pernah makan bebek panggang Beijing?)
    Exercise(
        id = "u23_s4_p2_q2",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Kamu pernah makan bebek panggang?",
        targetHanzi = "你 吃 过 北京 烤鸭 吗？",
        targetPinyin = "Nǐ chī guo Běijīng kǎoyā ma?",
        wordChips = listOf("你:nǐ", "吃:chī", "过:guo", "北京:Běijīng", "烤鸭:kǎoyā", "吗？:ma?", "去:qù"),
        correctAnswer = "你,吃,过,北京,烤鸭,吗？",
        audioToSpeak = "你吃过北京烤鸭吗？"
    )""",
            f"""    // 3. Soal 3: Ketuk Pasangan yang Sesuai (Aspek Pengalaman Lampau 过)
    Exercise(
        id = "u23_s4_p2_m3",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u23_s4_p2_m1", "吃过", "chī guo", "pernah makan"),
            MatchPairItem("u23_s4_p2_m2", "去过", "qù guo", "pernah pergi"),
            MatchPairItem("u23_s4_p2_m3", "没去过", "méi qù guo", "belum pernah pergi"),
            MatchPairItem("u23_s4_p2_m4", "看过", "kàn guo", "pernah melihat")
        )
    )""",
            f"""    // 4. Soal 4: Ketik Pinyin (pernah makan -> chīguo)
    Exercise(
        id = "u23_s4_p2_q4",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "pernah makan",
        sentenceWithBlank = "吃过 (________)",
        targetHanzi = "吃过",
        targetPinyin = "chīguo",
        correctAnswer = "chiguo",
        keyboardKeys = {k4_p2_q4},
        audioToSpeak = "吃过"
    )""",
            f"""    // 5. Soal 5: Mendengar Kalimat (Rule 10: illustrationRes = 0)
    Exercise(
        id = "u23_s4_p2_q5",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Apa yang Anda dengar?",
        targetTranslation = "Saya pernah pergi ke Tiongkok dua kali.",
        targetHanzi = "我 去 过 两 次 中国。",
        targetPinyin = "Wǒ qù guo liǎng cì Zhōngguó.",
        wordChips = listOf("我:wǒ", "去:qù", "过:guo", "两:liǎng", "次:cì", "中国。:Zhōngguó.", "一:yí"),
        correctAnswer = "我,去,过,两,次,中国。",
        illustrationRes = 0,
        audioToSpeak = "我去过两次中国。"
    )""",
            f"""    // 6. Soal 6: Pilihan Kalimat
    Exercise(
        id = "u23_s4_p2_q6",
        type = ExerciseType.SENTENCE_CHOICE,
        title = "Pilih terjemahan yang benar",
        targetHanzi = "我 没 去 过 外国 旅游。",
        targetPinyin = "Wǒ méi qù guo wàiguó lǚyóu.",
        targetTranslation = "Saya belum pernah berwisata ke luar negeri.",
        correctAnswer = "Wǒ méi qù guo wàiguó lǚyóu.\\n我 没 去 过 外国 旅游。",
        options = listOf(
            "Wǒ méi qù guo wàiguó lǚyóu.\\n我 没 去 过 外国 旅游。",
            "Wǒ qù guo wàiguó lǚyóu.\\n我 去 过 外国 旅游。",
            "Tā méi qù guo wàiguó lǚyóu.\\n他 没 去 过 外国 旅游。"
        ),
        audioToSpeak = "我没去过外国旅游。"
    )""",
            f"""    // 7. Soal 7: Pilihan Gambar (去过 -> pernah pergi wisata)
    Exercise(
        id = "u23_s4_p2_q7",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "去过",
        targetPinyin = "qù guo",
        targetTranslation = "pernah pergi",
        correctAnswer = "pernah pergi",
        audioToSpeak = "去过",
        pictureOptions = listOf(
            PictureOption("u23_s4_p2_opt7_1", "pernah pergi", "", R.drawable.ic_tour_travel, true),
            PictureOption("u23_s4_p2_opt7_2", "tiket", "", R.drawable.ic_tour_flight_ticket, false),
            PictureOption("u23_s4_p2_opt7_3", "hotel", "", R.drawable.ic_tour_hotel, false),
            PictureOption("u23_s4_p2_opt7_4", "bandara", "", R.drawable.ic_tour_airport, false)
        )
    )""",
            f"""    // 8. Soal 8: Ketik Pinyin (pernah pergi -> qùguo)
    Exercise(
        id = "u23_s4_p2_q8",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "pernah pergi",
        sentenceWithBlank = "去过 (________)",
        targetHanzi = "去过",
        targetPinyin = "qùguo",
        correctAnswer = "quguo",
        keyboardKeys = {k4_p2_q8},
        audioToSpeak = "去过"
    )""",
            f"""    // 9. Soal 9: Susun Kalimat (Saya pernah menonton film itu.)
    Exercise(
        id = "u23_s4_p2_q9",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Saya pernah menonton film itu.",
        targetHanzi = "我 看 过 那个 电影。",
        targetPinyin = "Wǒ kàn guo nàge diànyǐng.",
        wordChips = listOf("我:wǒ", "看:kàn", "过:guo", "那个:nàge", "电影。:diànyǐng.", "听:tīng"),
        correctAnswer = "我,看,过,那个,电影。",
        audioToSpeak = "我看过那个电影。"
    )""",
            f"""    // 10. Soal 10: Ketuk Pasangan yang Sesuai (Rangkuman Aspek Pernah)
    Exercise(
        id = "u23_s4_p2_m10",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u23_s4_p2_m10_1", "去过", "qù guo", "pernah pergi"),
            MatchPairItem("u23_s4_p2_m10_2", "两次", "liǎng cì", "dua kali"),
            MatchPairItem("u23_s4_p2_m10_3", "没看过", "méi kàn guo", "belum nonton"),
            MatchPairItem("u23_s4_p2_m10_4", "吃过饭", "chī guo fàn", "pernah makan")
        )
    )"""
        ]
    }

    # =========================================================================
    # STAGE 5: Evaluasi Komprehensif Perjalanan Wisata & Luar Negeri (Sintesis)
    # =========================================================================
    k5_p1_q4 = make_keys("lvyou")
    k5_p1_q8 = make_keys("jipiao")
    k5_p2_q4 = make_keys("jiudian")
    k5_p2_q8 = make_keys("chuguo")
    
    stages[5] = {
        "p1": [
            f"""    // 1. Soal 1: Pilihan Gambar (旅游 -> berwisata)
    Exercise(
        id = "u23_s5_p1_q1",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "旅游",
        targetPinyin = "lǚyóu",
        targetTranslation = "berwisata",
        correctAnswer = "berwisata",
        audioToSpeak = "旅游",
        pictureOptions = listOf(
            PictureOption("u23_s5_p1_opt1", "berwisata", "", R.drawable.ic_tour_travel, true),
            PictureOption("u23_s5_p1_opt2", "paspor", "", R.drawable.ic_tour_passport_abroad, false),
            PictureOption("u23_s5_p1_opt3", "bandara", "", R.drawable.ic_tour_airport, false),
            PictureOption("u23_s5_p1_opt4", "tiket pesawat", "", R.drawable.ic_tour_flight_ticket, false)
        )
    )""",
            f"""    // 2. Soal 2: Susun Kalimat (Kami membeli tiket pesawat terbang ke Beijing berwisata.)
    Exercise(
        id = "u23_s5_p1_q2",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Kami beli tiket terbang ke Beijing berlibur.",
        targetHanzi = "我们 买 机票 飞 去 北京 旅游。",
        targetPinyin = "Wǒmen mǎi jīpiào fēi qù Běijīng lǚyóu.",
        wordChips = listOf("我们:wǒmen", "买:mǎi", "机票:jīpiào", "飞:fēi", "去:qù", "北京:Běijīng", "旅游。:lǚyóu.", "车票:chēpiào"),
        correctAnswer = "我们,买,机票,飞,去,北京,旅游。",
        audioToSpeak = "我们买机票飞去北京旅游。"
    )""",
            f"""    // 3. Soal 3: Ketuk Pasangan yang Sesuai (Sintesis Wisata Penerbangan)
    Exercise(
        id = "u23_s5_p1_m3",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u23_s5_p1_m1", "旅游", "lǚyóu", "berwisata"),
            MatchPairItem("u23_s5_p1_m2", "机票", "jīpiào", "tiket pesawat"),
            MatchPairItem("u23_s5_p1_m3", "飞去", "fēi qù", "terbang ke"),
            MatchPairItem("u23_s5_p1_m4", "机场", "jīchǎng", "bandara")
        )
    )""",
            f"""    // 4. Soal 4: Ketik Pinyin (berwisata -> lǚyóu)
    Exercise(
        id = "u23_s5_p1_q4",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "berwisata / berlibur",
        sentenceWithBlank = "旅游 (________)",
        targetHanzi = "旅游",
        targetPinyin = "lǚyóu",
        correctAnswer = "lvyou",
        keyboardKeys = {k5_p1_q4},
        audioToSpeak = "旅游"
    )""",
            f"""    // 5. Soal 5: Mendengar Kalimat (Rule 10: illustrationRes = 0)
    Exercise(
        id = "u23_s5_p1_q5",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Apa yang Anda dengar?",
        targetTranslation = "Apakah Anda sudah siap pergi ke bandara?",
        targetHanzi = "你 准备 好 去 机场 了 吗？",
        targetPinyin = "Nǐ zhǔnbèi hǎo qù jīchǎng le ma?",
        wordChips = listOf("你:nǐ", "准备:zhǔnbèi", "好:hǎo", "去:qù", "机场:jīchǎng", "了:le", "吗？:ma?", "车站:chēzhàn"),
        correctAnswer = "你,准备,好,去,机场,了,吗？",
        illustrationRes = 0,
        audioToSpeak = "你准备好去机场了吗？"
    )""",
            f"""    // 6. Soal 6: Pilihan Kalimat
    Exercise(
        id = "u23_s5_p1_q6",
        type = ExerciseType.SENTENCE_CHOICE,
        title = "Pilih terjemahan yang benar",
        targetHanzi = "我们 住 在 机场 旁边 的 酒店。",
        targetPinyin = "Wǒmen zhù zài jīchǎng pángbiān de jiǔdiàn.",
        targetTranslation = "Kami menginap di hotel yang berada di samping bandara.",
        correctAnswer = "Wǒmen zhù zài jīchǎng pángbiān de jiǔdiàn.\\n我们 住 在 机场 旁边 的 酒店。",
        options = listOf(
            "Wǒmen zhù zài jīchǎng pángbiān de jiǔdiàn.\\n我们 住 在 机场 旁边 的 酒店。",
            "Wǒmen zhù zài xuéxiào pángbiān de jiǔdiàn.\\n我们 住 在 学校 旁边 的 酒店。",
            "Tāmen zhù zài jīchǎng pángbiān de jiǔdiàn.\\n他们 住 在 机场 旁边 的 酒店。"
        ),
        audioToSpeak = "我们住在机场旁边的酒店。"
    )""",
            f"""    // 7. Soal 7: Pilihan Gambar (机票 -> tiket pesawat terbang)
    Exercise(
        id = "u23_s5_p1_q7",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "机票",
        targetPinyin = "jīpiào",
        targetTranslation = "tiket pesawat",
        correctAnswer = "tiket pesawat",
        audioToSpeak = "机票",
        pictureOptions = listOf(
            PictureOption("u23_s5_p1_opt7_1", "tiket pesawat", "", R.drawable.ic_tour_flight_ticket, true),
            PictureOption("u23_s5_p1_opt7_2", "hotel", "", R.drawable.ic_tour_hotel, false),
            PictureOption("u23_s5_p1_opt7_3", "bandara", "", R.drawable.ic_tour_airport, false),
            PictureOption("u23_s5_p1_opt7_4", "paspor", "", R.drawable.ic_tour_passport_abroad, false)
        )
    )""",
            f"""    // 8. Soal 8: Ketik Pinyin (tiket pesawat -> jīpiào)
    Exercise(
        id = "u23_s5_p1_q8",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "tiket pesawat",
        sentenceWithBlank = "机票 (________)",
        targetHanzi = "机票",
        targetPinyin = "jīpiào",
        correctAnswer = "jipiao",
        keyboardKeys = {k5_p1_q8},
        audioToSpeak = "机票"
    )""",
            f"""    // 9. Soal 9: Susun Kalimat (Ibu mengantar saya ke bandara naik taksi.)
    Exercise(
        id = "u23_s5_p1_q9",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Ibu mengantar saya ke bandara.",
        targetHanzi = "妈妈 打车 送 我 去 机场。",
        targetPinyin = "Māma dǎchē sòng wǒ qù jīchǎng.",
        wordChips = listOf("妈妈:māma", "打车:dǎchē", "送:sòng", "我:wǒ", "去:qù", "机场。:jīchǎng.", "学校:xuéxiào"),
        correctAnswer = "妈妈,打车,送,我,去,机场。",
        audioToSpeak = "妈妈打车送我去机场。"
    )""",
            f"""    // 10. Soal 10: Ketuk Pasangan yang Sesuai (Rangkuman Sintesis 1)
    Exercise(
        id = "u23_s5_p1_m10",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u23_s5_p1_m10_1", "机票", "jīpiào", "tiket pesawat"),
            MatchPairItem("u23_s5_p1_m10_2", "送去", "sòng qù", "mengantar ke"),
            MatchPairItem("u23_s5_p1_m10_3", "飞北京", "fēi Běijīng", "terbang ke Beijing"),
            MatchPairItem("u23_s5_p1_m10_4", "大酒店", "dà jiǔdiàn", "hotel megah")
        )
    )"""
        ],
        "p2": [
            f"""    // 1. Soal 1: Pilihan Gambar (酒店 -> hotel tempat menginap)
    Exercise(
        id = "u23_s5_p2_q1",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "酒店",
        targetPinyin = "jiǔdiàn",
        targetTranslation = "hotel",
        correctAnswer = "hotel",
        audioToSpeak = "酒店",
        pictureOptions = listOf(
            PictureOption("u23_s5_p2_opt1", "hotel", "", R.drawable.ic_tour_hotel, true),
            PictureOption("u23_s5_p2_opt2", "bandara", "", R.drawable.ic_tour_airport, false),
            PictureOption("u23_s5_p2_opt3", "tiket", "", R.drawable.ic_tour_flight_ticket, false),
            PictureOption("u23_s5_p2_opt4", "paspor", "", R.drawable.ic_tour_passport_abroad, false)
        )
    )""",
            f"""    // 2. Soal 2: Susun Kalimat (Dia membawa koper keluar masuk hotel.)
    Exercise(
        id = "u23_s5_p2_q2",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Dia membawa koper ke hotel.",
        targetHanzi = "他 拿 着 箱子 进 酒店。",
        targetPinyin = "Tā ná zhe xiāngzi jìn jiǔdiàn.",
        wordChips = listOf("他:tā", "拿:ná", "着:zhe", "箱子:xiāngzi", "进:jìn", "酒店。:jiǔdiàn.", "出:chū"),
        correctAnswer = "他,拿,着,箱子,进,酒店。",
        audioToSpeak = "他拿着箱子进酒店。"
    )""",
            f"""    // 3. Soal 3: Ketuk Pasangan yang Sesuai (Grand Sintesis Bab 23)
    Exercise(
        id = "u23_s5_p2_m3",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u23_s5_p2_m1", "酒店", "jiǔdiàn", "hotel"),
            MatchPairItem("u23_s5_p2_m2", "出国", "chūguó", "ke luar negeri"),
            MatchPairItem("u23_s5_p2_m3", "门票", "ménpiào", "tiket masuk"),
            MatchPairItem("u23_s5_p2_m4", "过年好", "guònián hǎo", "selamat Imlek")
        )
    )""",
            f"""    // 4. Soal 4: Ketik Pinyin (hotel -> jiǔdiàn)
    Exercise(
        id = "u23_s5_p2_q4",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "hotel / penginapan",
        sentenceWithBlank = "酒店 (________)",
        targetHanzi = "酒店",
        targetPinyin = "jiǔdiàn",
        correctAnswer = "jiudian",
        keyboardKeys = {k5_p2_q4},
        audioToSpeak = "酒店"
    )""",
            f"""    // 5. Soal 5: Mendengar Kalimat (Rule 10: illustrationRes = 0)
    Exercise(
        id = "u23_s5_p2_q5",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Apa yang Anda dengar?",
        targetTranslation = "Saya belum pernah ke luar negeri merayakan Imlek.",
        targetHanzi = "我 没 出过 国 过年。",
        targetPinyin = "Wǒ méi chū guo guó guònián.",
        wordChips = listOf("我:wǒ", "没:méi", "出过:chū guo", "国:guó", "过年。:guònián.", "旅游:lǚyóu"),
        correctAnswer = "我,没,出过,国,过年。",
        illustrationRes = 0,
        audioToSpeak = "我没出国过年。"
    )""",
            f"""    // 6. Soal 6: Pilihan Kalimat
    Exercise(
        id = "u23_s5_p2_q6",
        type = ExerciseType.SENTENCE_CHOICE,
        title = "Pilih terjemahan yang benar",
        targetHanzi = "祝 大家 旅途 愉快， 一路 顺风！",
        targetPinyin = "Zhù dàjiā lǚtú yúkuài, yílù shùnfēng!",
        targetTranslation = "Semoga perjalanan kalian menyenangkan, selamat jalan!",
        correctAnswer = "Zhù dàjiā lǚtú yúkuài, yílù shùnfēng!\\n祝 大家 旅途 愉快， 一路 顺风！",
        options = listOf(
            "Zhù dàjiā lǚtú yúkuài, yílù shùnfēng!\\n祝 大家 旅途 愉快， 一路 顺风！",
            "Zhù dàjiā shēngrì kuàilè!\\n祝 大家 生日 快乐！",
            "Zhù nǐ xīnnián kuàilè!\\n祝 你 新年 快乐！"
        ),
        audioToSpeak = "祝大家旅途愉快，一路顺风！"
    )""",
            f"""    // 7. Soal 7: Pilihan Gambar (出国 -> keluar negeri)
    Exercise(
        id = "u23_s5_p2_q7",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "出国",
        targetPinyin = "chūguó",
        targetTranslation = "ke luar negeri",
        correctAnswer = "ke luar negeri",
        audioToSpeak = "出国",
        pictureOptions = listOf(
            PictureOption("u23_s5_p2_opt7_1", "ke luar negeri", "", R.drawable.ic_tour_passport_abroad, true),
            PictureOption("u23_s5_p2_opt7_2", "tiket", "", R.drawable.ic_tour_flight_ticket, false),
            PictureOption("u23_s5_p2_opt7_3", "hotel", "", R.drawable.ic_tour_hotel, false),
            PictureOption("u23_s5_p2_opt7_4", "bandara", "", R.drawable.ic_tour_airport, false)
        )
    )""",
            f"""    // 8. Soal 8: Ketik Pinyin (ke luar negeri -> chūguó)
    Exercise(
        id = "u23_s5_p2_q8",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "pergi ke luar negeri",
        sentenceWithBlank = "出国 (________)",
        targetHanzi = "出国",
        targetPinyin = "chūguó",
        correctAnswer = "chuguo",
        keyboardKeys = {k5_p2_q8},
        audioToSpeak = "出国"
    )""",
            f"""    // 9. Soal 9: Susun Kalimat (Kami membeli tiket masuk tempat wisata.)
    Exercise(
        id = "u23_s5_p2_q9",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Kami membeli tiket masuk.",
        targetHanzi = "我们 买 了 门票。",
        targetPinyin = "Wǒmen mǎi le ménpiào.",
        wordChips = listOf("我们:wǒmen", "买:mǎi", "了:le", "门票。:ménpiào.", "机票:jīpiào"),
        correctAnswer = "我们,买,了,门票。",
        audioToSpeak = "我们买了门票。"
    )""",
            f"""    // 10. Soal 10: Ketuk Pasangan yang Sesuai (Grand Review Final Bab 23)
    Exercise(
        id = "u23_s5_p2_m10",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u23_s5_p2_m10_1", "外国旅游", "wàiguó lǚyóu", "wisata LN"),
            MatchPairItem("u23_s5_p2_m10_2", "买机票", "mǎi jīpiào", "beli tiket pesawat"),
            MatchPairItem("u23_s5_p2_m10_3", "住大酒店", "zhù dà jiǔdiàn", "inap hotel"),
            MatchPairItem("u23_s5_p2_m10_4", "过年好", "guònián hǎo", "selamat tahun baru")
        )
    )"""
        ]
    }

    for s_idx in range(1, 6):
        filename = f"{base_dir}/Bab23Stage{s_idx}Data.kt"
        p1_code = ",\n\n".join(stages[s_idx]["p1"])
        p2_code = ",\n\n".join(stages[s_idx]["p2"])
        
        content = f"""package com.example.chineselearning.data.repository

import com.example.chineselearning.R
import com.example.chineselearning.data.model.Exercise
import com.example.chineselearning.data.model.ExerciseType
import com.example.chineselearning.data.model.MatchPairItem
import com.example.chineselearning.data.model.PictureOption

val bab23Stage{s_idx}Part1Exercises = listOf(
{p1_code}
)

val bab23Stage{s_idx}Part2Exercises = listOf(
{p2_code}
)
"""
        with open(filename, "w", encoding="utf-8") as f:
            f.write(content)
        print(f"Written {filename}")

if __name__ == "__main__":
    generate_bab23()
