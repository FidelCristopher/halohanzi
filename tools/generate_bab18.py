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

def generate_bab18():
    base_dir = "app/src/main/java/com/example/chineselearning/data/repository"
    
    stages = {}
    
    # =========================================================================
    # STAGE 1: Spektrum Warna Dasar (颜色, 红色, 白色, 黑色, 绿色)
    # =========================================================================
    k1_p1_q4 = make_keys("yanse")
    k1_p1_q8 = make_keys("hongse")
    k1_p2_q4 = make_keys("heise")
    k1_p2_q8 = make_keys("lvse")
    
    stages[1] = {
        "p1": [
            f"""    // 1. Soal 1: Pilihan Gambar (红色 -> warna merah)
    Exercise(
        id = "u18_s1_p1_q1",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "红色",
        targetPinyin = "hóngsè",
        targetTranslation = "warna merah",
        correctAnswer = "warna merah",
        audioToSpeak = "红色",
        pictureOptions = listOf(
            PictureOption("u18_s1_p1_opt1", "warna merah", "", R.drawable.ic_shop_clothes, true),
            PictureOption("u18_s1_p1_opt2", "warna putih", "", R.drawable.ic_shop_piece_clothes, false),
            PictureOption("u18_s1_p1_opt3", "jam tangan", "", R.drawable.ic_clock_analog, false),
            PictureOption("u18_s1_p1_opt4", "sepatu", "", R.drawable.ic_shop_goods, false)
        )
    )""",
            f"""    // 2. Soal 2: Susun Kalimat (Kamu suka warna apa?)
    Exercise(
        id = "u18_s1_p1_q2",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Kamu suka warna apa?",
        targetHanzi = "你 喜欢 什么 颜色？",
        targetPinyin = "Nǐ xǐhuan shénme yánsè?",
        wordChips = listOf("你:nǐ", "喜欢:xǐhuan", "什么:shénme", "颜色？:yánsè?", "红色:hóngsè"),
        correctAnswer = "你,喜欢,什么,颜色？",
        audioToSpeak = "你喜欢什么颜色？"
    )""",
            f"""    // 3. Soal 3: Ketuk Pasangan yang Sesuai (Warna & Merah Putih)
    Exercise(
        id = "u18_s1_p1_q3",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u18_s1_p1_m1", "颜色", "yánsè", "warna"),
            MatchPairItem("u18_s1_p1_m2", "红色", "hóngsè", "warna merah"),
            MatchPairItem("u18_s1_p1_m3", "白色", "báisè", "warna putih"),
            MatchPairItem("u18_s1_p1_m4", "喜欢", "xǐhuan", "menyukai")
        )
    )""",
            f"""    // 4. Soal 4: Ketik Pinyin (warna -> yánsè)
    Exercise(
        id = "u18_s1_p1_q4",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "warna",
        sentenceWithBlank = "颜色 (________)",
        targetHanzi = "颜色",
        targetPinyin = "yánsè",
        correctAnswer = "yanse",
        keyboardKeys = {k1_p1_q4},
        audioToSpeak = "颜色"
    )""",
            f"""    // 5. Soal 5: Mendengar Kalimat (Rule 10: illustrationRes = 0)
    Exercise(
        id = "u18_s1_p1_q5",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Apa yang Anda dengar?",
        targetTranslation = "Saya membeli sehelai baju warna merah.",
        targetHanzi = "我 买 了 一 件 红色 的 衣服。",
        targetPinyin = "Wǒ mǎi le yí jiàn hóngsè de yīfu.",
        wordChips = listOf("我:wǒ", "买:mǎi", "了:le", "一:yí", "件:jiàn", "红色:hóngsè", "的:de", "衣服。:yīfu."),
        correctAnswer = "我,买,了,一,件,红色,的,衣服。",
        illustrationRes = 0,
        audioToSpeak = "我买了一件红色的衣服。"
    )""",
            f"""    // 6. Soal 6: Pilihan Kalimat
    Exercise(
        id = "u18_s1_p1_q6",
        type = ExerciseType.SENTENCE_CHOICE,
        title = "Pilih terjemahan yang benar",
        targetHanzi = "那 辆 白色 的 车 很 漂亮。",
        targetPinyin = "Nà liàng báisè de chē hěn piàoliang.",
        targetTranslation = "Mobil berwarna putih itu sangat indah.",
        correctAnswer = "Nà liàng báisè de chē hěn piàoliang.\\n那 辆 白色 的 车 很 漂亮。",
        options = listOf(
            "Nà liàng báisè de chē hěn piàoliang.\\n那 辆 白色 的 车 很 漂亮。",
            "Nà liàng hēisè de chē hěn piàoliang.\\n那 辆 黑色 的 车 很 漂亮。",
            "Zhè liàng báisè de chē hěn piàoliang.\\n这 辆 白色 的 车 很 漂亮。"
        ),
        audioToSpeak = "那辆白色的车很漂亮。"
    )""",
            f"""    // 7. Soal 7: Pilihan Gambar (白色 -> warna putih)
    Exercise(
        id = "u18_s1_p1_q7",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "白色",
        targetPinyin = "báisè",
        targetTranslation = "warna putih",
        correctAnswer = "warna putih",
        audioToSpeak = "白色",
        pictureOptions = listOf(
            PictureOption("u18_s1_p1_opt7_1", "warna putih", "", R.drawable.ic_shop_piece_clothes, true),
            PictureOption("u18_s1_p1_opt7_2", "warna merah", "", R.drawable.ic_shop_clothes, false),
            PictureOption("u18_s1_p1_opt7_3", "jam tangan", "", R.drawable.ic_clock_analog, false),
            PictureOption("u18_s1_p1_opt7_4", "sepatu", "", R.drawable.ic_shop_goods, false)
        )
    )""",
            f"""    // 8. Soal 8: Ketik Pinyin (warna merah -> hóngsè)
    Exercise(
        id = "u18_s1_p1_q8",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "warna merah",
        sentenceWithBlank = "红色 (________)",
        targetHanzi = "红色",
        targetPinyin = "hóngsè",
        correctAnswer = "hongse",
        keyboardKeys = {k1_p1_q8},
        audioToSpeak = "红色"
    )""",
            f"""    // 9. Soal 9: Susun Kalimat (Saya paling suka warna putih.)
    Exercise(
        id = "u18_s1_p1_q9",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Saya paling suka warna putih.",
        targetHanzi = "我 最 喜欢 白色。",
        targetPinyin = "Wǒ zuì xǐhuan báisè.",
        wordChips = listOf("我:wǒ", "最:zuì", "喜欢:xǐhuan", "白色。:báisè.", "红色:hóngsè"),
        correctAnswer = "我,最,喜欢,白色。",
        audioToSpeak = "我最喜欢白色。"
    )""",
            f"""    // 10. Soal 10: Ketuk Pasangan yang Sesuai (Rangkuman Warna 1)
    Exercise(
        id = "u18_s1_p1_m10",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u18_s1_p1_m10_1", "红色", "hóngsè", "warna merah"),
            MatchPairItem("u18_s1_p1_m10_2", "白色", "báisè", "warna putih"),
            MatchPairItem("u18_s1_p1_m10_3", "衣服", "yīfu", "pakaian"),
            MatchPairItem("u18_s1_p1_m10_4", "漂亮", "piàoliang", "cantik / indah")
        )
    )"""
        ],
        "p2": [
            f"""    // 1. Soal 1: Pilihan Gambar (黑色 -> warna hitam)
    Exercise(
        id = "u18_s1_p2_q1",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "黑色",
        targetPinyin = "hēisè",
        targetTranslation = "warna hitam",
        correctAnswer = "warna hitam",
        audioToSpeak = "黑色",
        pictureOptions = listOf(
            PictureOption("u18_s1_p2_opt1", "warna hitam", "", R.drawable.ic_shop_clothes, true),
            PictureOption("u18_s1_p2_opt2", "warna hijau", "", R.drawable.ic_shop_piece_clothes, false),
            PictureOption("u18_s1_p2_opt3", "jam tangan", "", R.drawable.ic_clock_analog, false),
            PictureOption("u18_s1_p2_opt4", "tas", "", R.drawable.ic_shop_goods, false)
        )
    )""",
            f"""    // 2. Soal 2: Susun Kalimat (Dia mengenakan jam tangan hitam.)
    Exercise(
        id = "u18_s1_p2_q2",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Dia memakai jam tangan hitam.",
        targetHanzi = "他 戴 着 黑色 的 手表。",
        targetPinyin = "Tā dài zhe hēisè de shǒubiǎo.",
        wordChips = listOf("他:tā", "戴:dài", "着:zhe", "黑色:hēisè", "的:de", "手表。:shǒubiǎo.", "白色:báisè"),
        correctAnswer = "他,戴,着,黑色,的,手表。",
        audioToSpeak = "他戴着黑色的手表。"
    )""",
            f"""    // 3. Soal 3: Ketuk Pasangan yang Sesuai (Hitam & Hijau)
    Exercise(
        id = "u18_s1_p2_m3",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u18_s1_p2_m1", "黑色", "hēisè", "warna hitam"),
            MatchPairItem("u18_s1_p2_m2", "绿色", "lǜsè", "warna hijau"),
            MatchPairItem("u18_s1_p2_m3", "树上", "shùshang", "di atas pohon"),
            MatchPairItem("u18_s1_p2_m4", "春天", "chūntiān", "musim semi")
        )
    )""",
            f"""    // 4. Soal 4: Ketik Pinyin (warna hitam -> hēisè)
    Exercise(
        id = "u18_s1_p2_q4",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "warna hitam",
        sentenceWithBlank = "黑色 (________)",
        targetHanzi = "黑色",
        targetPinyin = "hēisè",
        correctAnswer = "heise",
        keyboardKeys = {k1_p2_q4},
        audioToSpeak = "黑色"
    )""",
            f"""    // 5. Soal 5: Mendengar Kalimat (Rule 10: illustrationRes = 0)
    Exercise(
        id = "u18_s1_p2_q5",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Apa yang Anda dengar?",
        targetTranslation = "Di musim semi dedaunan semua berwarna hijau.",
        targetHanzi = "春天 树上 都是 绿色 的。",
        targetPinyin = "Chūntiān shùshang dōushì lǜsè de.",
        wordChips = listOf("春天:chūntiān", "树上:shùshang", "都是:dōushì", "绿色:lǜsè", "的。:de.", "黑色:hēisè"),
        correctAnswer = "春天,树上,都是,绿色,的。",
        illustrationRes = 0,
        audioToSpeak = "春天树上都是绿色的。"
    )""",
            f"""    // 6. Soal 6: Pilihan Kalimat
    Exercise(
        id = "u18_s1_p2_q6",
        type = ExerciseType.SENTENCE_CHOICE,
        title = "Pilih terjemahan yang benar",
        targetHanzi = "这 条 黑色 的 裤子 很 便宜。",
        targetPinyin = "Zhè tiáo hēisè de kùzi hěn piányi.",
        targetTranslation = "Celana hitam ini sangat murah.",
        correctAnswer = "Zhè tiáo hēisè de kùzi hěn piányi.\\n这 条 黑色 的 裤子 很 便宜。",
        options = listOf(
            "Zhè tiáo hēisè de kùzi hěn piányi.\\n这 条 黑色 的 裤子 很 便宜。",
            "Zhè tiáo báisè de kùzi hěn piányi.\\n这 条 白色 的 裤子 很 便宜。",
            "Zhè tiáo hēisè de kùzi hěn guì.\\n这 条 黑色 的 裤子 很 贵。"
        ),
        audioToSpeak = "这条黑色的裤子很便宜。"
    )""",
            f"""    // 7. Soal 7: Pilihan Gambar (绿色 -> warna hijau)
    Exercise(
        id = "u18_s1_p2_q7",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "绿色",
        targetPinyin = "lǜsè",
        targetTranslation = "warna hijau",
        correctAnswer = "warna hijau",
        audioToSpeak = "绿色",
        pictureOptions = listOf(
            PictureOption("u18_s1_p2_opt7_1", "warna hijau", "", R.drawable.ic_shop_piece_clothes, true),
            PictureOption("u18_s1_p2_opt7_2", "warna hitam", "", R.drawable.ic_shop_clothes, false),
            PictureOption("u18_s1_p2_opt7_3", "jam tangan", "", R.drawable.ic_clock_analog, false),
            PictureOption("u18_s1_p2_opt7_4", "tas", "", R.drawable.ic_shop_goods, false)
        )
    )""",
            f"""    // 8. Soal 8: Ketik Pinyin (warna hijau -> lǜsè)
    Exercise(
        id = "u18_s1_p2_q8",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "warna hijau",
        sentenceWithBlank = "绿色 (________)",
        targetHanzi = "绿色",
        targetPinyin = "lǜsè",
        correctAnswer = "lvse",
        keyboardKeys = {k1_p2_q8},
        audioToSpeak = "绿色"
    )""",
            f"""    // 9. Soal 9: Susun Kalimat (Ibu menyukai teh hijau.)
    Exercise(
        id = "u18_s1_p2_q9",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Ibu suka minum teh hijau.",
        targetHanzi = "妈妈 喜欢 喝 绿茶。",
        targetPinyin = "Māma xǐhuan hē lǜchá.",
        wordChips = listOf("妈妈:māma", "喜欢:xǐhuan", "喝:hē", "绿茶。:lǜchá.", "红茶:hóngchá"),
        correctAnswer = "妈妈,喜欢,喝,绿茶。",
        audioToSpeak = "妈妈喜欢喝绿茶。"
    )""",
            f"""    // 10. Soal 10: Ketuk Pasangan yang Sesuai (Rangkuman Warna Lengkap)
    Exercise(
        id = "u18_s1_p2_m10",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u18_s1_p2_m10_1", "黑色", "hēisè", "warna hitam"),
            MatchPairItem("u18_s1_p2_m10_2", "绿色", "lǜsè", "warna hijau"),
            MatchPairItem("u18_s1_p2_m10_3", "绿茶", "lǜchá", "teh hijau"),
            MatchPairItem("u18_s1_p2_m10_4", "便宜", "piányi", "murah")
        )
    )"""
        ]
    }

    # =========================================================================
    # STAGE 2: Pakaian, Celana & Aksesoris (裤子, 条, 包, 手表)
    # =========================================================================
    k2_p1_q4 = make_keys("kuzi")
    k2_p1_q8 = make_keys("tiao")
    k2_p2_q4 = make_keys("bao")
    k2_p2_q8 = make_keys("shoubiao")
    
    stages[2] = {
        "p1": [
            f"""    // 1. Soal 1: Pilihan Gambar (裤子 -> celana)
    Exercise(
        id = "u18_s2_p1_q1",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "裤子",
        targetPinyin = "kùzi",
        targetTranslation = "celana",
        correctAnswer = "celana",
        audioToSpeak = "裤子",
        pictureOptions = listOf(
            PictureOption("u18_s2_p1_opt1", "celana", "", R.drawable.ic_shop_clothes, true),
            PictureOption("u18_s2_p1_opt2", "baju", "", R.drawable.ic_shop_piece_clothes, false),
            PictureOption("u18_s2_p1_opt3", "jam tangan", "", R.drawable.ic_clock_analog, false),
            PictureOption("u18_s2_p1_opt4", "tas", "", R.drawable.ic_shop_goods, false)
        )
    )""",
            f"""    // 2. Soal 2: Susun Kalimat (Saya ingin membeli sehelai celana baru.)
    Exercise(
        id = "u18_s2_p1_q2",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Saya mau beli celana baru.",
        targetHanzi = "我 想 买 一 条 新 裤子。",
        targetPinyin = "Wǒ xiǎng mǎi yì tiáo xīn kùzi.",
        wordChips = listOf("我:wǒ", "想:xiǎng", "买:mǎi", "一:yì", "条:tiáo", "新:xīn", "裤子。:kùzi.", "件:jiàn"),
        correctAnswer = "我,想,买,一,条,新,裤子。",
        audioToSpeak = "我想买一条新裤子。"
    )""",
            f"""    // 3. Soal 3: Ketuk Pasangan yang Sesuai (Celana & Kata Penggolong 条)
    Exercise(
        id = "u18_s2_p1_q3",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u18_s2_p1_m1", "裤子", "kùzi", "celana"),
            MatchPairItem("u18_s2_p1_m2", "条", "tiáo", "helai / lembar (panjang)"),
            MatchPairItem("u18_s2_p1_m3", "新", "xīn", "baru"),
            MatchPairItem("u18_s2_p1_m4", "想买", "xiǎng mǎi", "ingin beli")
        )
    )""",
            f"""    // 4. Soal 4: Ketik Pinyin (celana -> kùzi)
    Exercise(
        id = "u18_s2_p1_q4",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "celana",
        sentenceWithBlank = "裤子 (________)",
        targetHanzi = "裤子",
        targetPinyin = "kùzi",
        correctAnswer = "kuzi",
        keyboardKeys = {k2_p1_q4},
        audioToSpeak = "裤子"
    )""",
            f"""    // 5. Soal 5: Mendengar Kalimat (Rule 10: illustrationRes = 0)
    Exercise(
        id = "u18_s2_p1_q5",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Apa yang Anda dengar?",
        targetTranslation = "Celana ini terlalu panjang.",
        targetHanzi = "这 条 裤子 太 长 了。",
        targetPinyin = "Zhè tiáo kùzi tài cháng le.",
        wordChips = listOf("这:zhè", "条:tiáo", "裤子:kùzi", "太:tài", "长:cháng", "了。:le.", "短:duǎn"),
        correctAnswer = "这,条,裤子,太,长,了。",
        illustrationRes = 0,
        audioToSpeak = "这条裤子太长了。"
    )""",
            f"""    // 6. Soal 6: Pilihan Kalimat
    Exercise(
        id = "u18_s2_p1_q6",
        type = ExerciseType.SENTENCE_CHOICE,
        title = "Pilih terjemahan yang benar",
        targetHanzi = "他 穿 着 一 条 黑色 裤子。",
        targetPinyin = "Tā chuān zhe yì tiáo hēisè kùzi.",
        targetTranslation = "Dia sedang memakai sehelai celana hitam.",
        correctAnswer = "Tā chuān zhe yì tiáo hēisè kùzi.\\n他 穿 着 一 条 黑色 裤子。",
        options = listOf(
            "Tā chuān zhe yì tiáo hēisè kùzi.\\n他 穿 着 一 条 黑色 裤子。",
            "Tā chuān zhe yì tiáo báisè kùzi.\\n他 穿 着 一 条 白色 裤子。",
            "Wǒ chuān zhe yì tiáo hēisè kùzi.\\n我 穿 着 一 条 黑色 裤子。"
        ),
        audioToSpeak = "他穿着一条黑色裤子。"
    )""",
            f"""    // 7. Soal 7: Pilihan Gambar (条 -> penggolong celana/panjang)
    Exercise(
        id = "u18_s2_p1_q7",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "条",
        targetPinyin = "tiáo",
        targetTranslation = "helai (benda panjang)",
        correctAnswer = "helai (benda panjang)",
        audioToSpeak = "条",
        pictureOptions = listOf(
            PictureOption("u18_s2_p1_opt7_1", "helai celana", "", R.drawable.ic_shop_clothes, true),
            PictureOption("u18_s2_p1_opt7_2", "baju", "", R.drawable.ic_shop_piece_clothes, false),
            PictureOption("u18_s2_p1_opt7_3", "jam tangan", "", R.drawable.ic_clock_analog, false),
            PictureOption("u18_s2_p1_opt7_4", "tas", "", R.drawable.ic_shop_goods, false)
        )
    )""",
            f"""    // 8. Soal 8: Ketik Pinyin (penggolong helai -> tiáo)
    Exercise(
        id = "u18_s2_p1_q8",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "helai / lembar (panjang)",
        sentenceWithBlank = "条 (________)",
        targetHanzi = "条",
        targetPinyin = "tiáo",
        correctAnswer = "tiao",
        keyboardKeys = {k2_p1_q8},
        audioToSpeak = "条"
    )""",
            f"""    // 9. Soal 9: Susun Kalimat (Dua helai celana ini sangat pas.)
    Exercise(
        id = "u18_s2_p1_q9",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Dua celana ini sangat bagus.",
        targetHanzi = "这两 条 裤子 都 很 好。",
        targetPinyin = "Zhè liǎng tiáo kùzi dōu hěn hǎo.",
        wordChips = listOf("这两:zhè liǎng", "条:tiáo", "裤子:kùzi", "都:dōu", "很:hěn", "好。:hǎo.", "衣服:yīfu"),
        correctAnswer = "这两,条,裤子,都,很,好。",
        audioToSpeak = "这两条裤子都很好。"
    )""",
            f"""    // 10. Soal 10: Ketuk Pasangan yang Sesuai (Rangkuman Celana & Ukuran)
    Exercise(
        id = "u18_s2_p1_m10",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u18_s2_p1_m10_1", "裤子", "kùzi", "celana"),
            MatchPairItem("u18_s2_p1_m10_2", "两条", "liǎng tiáo", "dua helai"),
            MatchPairItem("u18_s2_p1_m10_3", "太长", "tài cháng", "terlalu panjang"),
            MatchPairItem("u18_s2_p1_m10_4", "穿着", "chuān zhe", "sedang memakai")
        )
    )"""
        ],
        "p2": [
            f"""    // 1. Soal 1: Pilihan Gambar (包 -> tas)
    Exercise(
        id = "u18_s2_p2_q1",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "包",
        targetPinyin = "bāo",
        targetTranslation = "tas",
        correctAnswer = "tas",
        audioToSpeak = "包",
        pictureOptions = listOf(
            PictureOption("u18_s2_p2_opt1", "tas", "", R.drawable.ic_shop_goods, true),
            PictureOption("u18_s2_p2_opt2", "jam tangan", "", R.drawable.ic_clock_analog, false),
            PictureOption("u18_s2_p2_opt3", "celana", "", R.drawable.ic_shop_clothes, false),
            PictureOption("u18_s2_p2_opt4", "baju", "", R.drawable.ic_shop_piece_clothes, false)
        )
    )""",
            f"""    // 2. Soal 2: Susun Kalimat (Tas warna merah ini milik siapa?)
    Exercise(
        id = "u18_s2_p2_q2",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Tas merah ini milik siapa?",
        targetHanzi = "这个 红色 的 包 是 谁 的？",
        targetPinyin = "Zhège hóngsè de bāo shì shéi de?",
        wordChips = listOf("这个:zhège", "红色:hóngsè", "的:de", "包:bāo", "是:shì", "谁:shéi", "的？:de?", "黑色:hēisè"),
        correctAnswer = "这个,红色,的,包,是,谁,的？",
        audioToSpeak = "这个红色的包是谁的？"
    )""",
            f"""    // 3. Soal 3: Ketuk Pasangan yang Sesuai (Tas & Jam Tangan)
    Exercise(
        id = "u18_s2_p2_m3",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u18_s2_p2_m1", "包", "bāo", "tas / ransel"),
            MatchPairItem("u18_s2_p2_m2", "手表", "shǒubiǎo", "jam tangan"),
            MatchPairItem("u18_s2_p2_m3", "太贵", "tài guì", "terlalu mahal"),
            MatchPairItem("u18_s2_p2_m4", "好看", "hǎokàn", "bagus dilihat")
        )
    )""",
            f"""    // 4. Soal 4: Ketik Pinyin (tas -> bāo)
    Exercise(
        id = "u18_s2_p2_q4",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "tas",
        sentenceWithBlank = "包 (________)",
        targetHanzi = "包",
        targetPinyin = "bāo",
        correctAnswer = "bao",
        keyboardKeys = {k2_p2_q4},
        audioToSpeak = "包"
    )""",
            f"""    // 5. Soal 5: Mendengar Kalimat (Rule 10: illustrationRes = 0)
    Exercise(
        id = "u18_s2_p2_q5",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Apa yang Anda dengar?",
        targetTranslation = "Jam tangan ini terlalu mahal.",
        targetHanzi = "这 块 手表 太 贵 了。",
        targetPinyin = "Zhè kuài shǒubiǎo tài guì le.",
        wordChips = listOf("这:zhè", "块:kuài", "手表:shǒubiǎo", "太:tài", "贵:guì", "了。:le.", "便宜:piányi"),
        correctAnswer = "这,块,手表,太,贵,了。",
        illustrationRes = 0,
        audioToSpeak = "这块手表太贵了。"
    )""",
            f"""    // 6. Soal 6: Pilihan Kalimat
    Exercise(
        id = "u18_s2_p2_q6",
        type = ExerciseType.SENTENCE_CHOICE,
        title = "Pilih terjemahan yang benar",
        targetHanzi = "我 想 买 一 个 新 书包。",
        targetPinyin = "Wǒ xiǎng mǎi yí gè xīn shūbāo.",
        targetTranslation = "Saya ingin membeli sebuah tas sekolah baru.",
        correctAnswer = "Wǒ xiǎng mǎi yí gè xīn shūbāo.\\n我 想 买 一 个 新 书包。",
        options = listOf(
            "Wǒ xiǎng mǎi yí gè xīn shūbāo.\\n我 想 买 一 个 新 书包。",
            "Wǒ xiǎng mǎi yí kuài xīn shǒubiǎo.\\n我 想 买 一 块 新 手表。",
            "Tā xiǎng mǎi yí gè xīn shūbāo.\\n他 想 买 一 个 新 书包。"
        ),
        audioToSpeak = "我想买一个新的书包。"
    )""",
            f"""    // 7. Soal 7: Pilihan Gambar (手表 -> jam tangan)
    Exercise(
        id = "u18_s2_p2_q7",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "手表",
        targetPinyin = "shǒubiǎo",
        targetTranslation = "jam tangan",
        correctAnswer = "jam tangan",
        audioToSpeak = "手表",
        pictureOptions = listOf(
            PictureOption("u18_s2_p2_opt7_1", "jam tangan", "", R.drawable.ic_clock_analog, true),
            PictureOption("u18_s2_p2_opt7_2", "tas", "", R.drawable.ic_shop_goods, false),
            PictureOption("u18_s2_p2_opt7_3", "celana", "", R.drawable.ic_shop_clothes, false),
            PictureOption("u18_s2_p2_opt7_4", "baju", "", R.drawable.ic_shop_piece_clothes, false)
        )
    )""",
            f"""    // 8. Soal 8: Ketik Pinyin (jam tangan -> shǒubiǎo)
    Exercise(
        id = "u18_s2_p2_q8",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "jam tangan",
        sentenceWithBlank = "手表 (________)",
        targetHanzi = "手表",
        targetPinyin = "shǒubiǎo",
        correctAnswer = "shoubiao",
        keyboardKeys = {k2_p2_q8},
        audioToSpeak = "手表"
    )""",
            f"""    // 9. Soal 9: Susun Kalimat (Ibu memberi saya sebuah jam tangan baru.)
    Exercise(
        id = "u18_s2_p2_q9",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Ibu menghadiahkan saya sebuah jam tangan.",
        targetHanzi = "妈妈 送 我 一 块 手表。",
        targetPinyin = "Māma sòng wǒ yí kuài shǒubiǎo.",
        wordChips = listOf("妈妈:māma", "送:sòng", "我:wǒ", "一:yí", "块:kuài", "手表。:shǒubiǎo.", "包:bāo"),
        correctAnswer = "妈妈,送,我,一,块,手表。",
        audioToSpeak = "妈妈送我一块手表。"
    )""",
            f"""    // 10. Soal 10: Ketuk Pasangan yang Sesuai (Rangkuman Aksesoris Lengkap)
    Exercise(
        id = "u18_s2_p2_m10",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u18_s2_p2_m10_1", "包", "bāo", "tas"),
            MatchPairItem("u18_s2_p2_m10_2", "手表", "shǒubiǎo", "jam tangan"),
            MatchPairItem("u18_s2_p2_m10_3", "一块", "yí kuài", "sebuah (arloji)"),
            MatchPairItem("u18_s2_p2_m10_4", "送给", "sòng gěi", "dihadiahkan")
        )
    )"""
        ]
    }

    # =========================================================================
    # STAGE 3: Postur & Ciri Fisik Tubuh (个子, 高, 长)
    # =========================================================================
    k3_p1_q4 = make_keys("gezi")
    k3_p1_q8 = make_keys("gao")
    k3_p2_q4 = make_keys("chang")
    k3_p2_q8 = make_keys("hengao")
    
    stages[3] = {
        "p1": [
            f"""    // 1. Soal 1: Pilihan Gambar (高 -> tinggi)
    Exercise(
        id = "u18_s3_p1_q1",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "高",
        targetPinyin = "gāo",
        targetTranslation = "tinggi",
        correctAnswer = "tinggi",
        audioToSpeak = "高",
        pictureOptions = listOf(
            PictureOption("u18_s3_p1_opt1", "tinggi", "", R.drawable.ic_work_gentleman, true),
            PictureOption("u18_s3_p1_opt2", "anak kecil", "", R.drawable.ic_fam_child, false),
            PictureOption("u18_s3_p1_opt3", "jam tangan", "", R.drawable.ic_clock_analog, false),
            PictureOption("u18_s3_p1_opt4", "tas", "", R.drawable.ic_shop_goods, false)
        )
    )""",
            f"""    // 2. Soal 2: Susun Kalimat (Tinggi badannya sangat tinggi.)
    Exercise(
        id = "u18_s3_p1_q2",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Tinggi badannya sangat tinggi.",
        targetHanzi = "他 的 个子 很 高。",
        targetPinyin = "Tā de gèzi hěn gāo.",
        wordChips = listOf("他:tā", "的:de", "个子:gèzi", "很:hěn", "高。:gāo.", "矮:ǎi"),
        correctAnswer = "他,的,个子,很,高。",
        audioToSpeak = "他的个子很高。"
    )""",
            f"""    // 3. Soal 3: Ketuk Pasangan yang Sesuai (Postur & Tinggi)
    Exercise(
        id = "u18_s3_p1_q3",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u18_s3_p1_m1", "个子", "gèzi", "tinggi badan / postur"),
            MatchPairItem("u18_s3_p1_m2", "高", "gāo", "tinggi"),
            MatchPairItem("u18_s3_p1_m3", "很高", "hěn gāo", "sangat tinggi"),
            MatchPairItem("u18_s3_p1_m4", "哥哥", "gēge", "kakak laki-laki")
        )
    )""",
            f"""    // 4. Soal 4: Ketik Pinyin (postur/tinggi badan -> gèzi)
    Exercise(
        id = "u18_s3_p1_q4",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "tinggi badan / postur",
        sentenceWithBlank = "个子 (________)",
        targetHanzi = "个子",
        targetPinyin = "gèzi",
        correctAnswer = "gezi",
        keyboardKeys = {k3_p1_q4},
        audioToSpeak = "个子"
    )""",
            f"""    // 5. Soal 5: Mendengar Kalimat (Rule 10: illustrationRes = 0)
    Exercise(
        id = "u18_s3_p1_q5",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Apa yang Anda dengar?",
        targetTranslation = "Adik laki-laki tumbuh sangat tinggi.",
        targetHanzi = "弟弟 长 得 很 高。",
        targetPinyin = "Dìdi zhǎng de hěn gāo.",
        wordChips = listOf("弟弟:dìdi", "长:zhǎng", "得:de", "很:hěn", "高。:gāo.", "哥哥:gēge"),
        correctAnswer = "弟弟,长,得,很,高。",
        illustrationRes = 0,
        audioToSpeak = "弟弟长得很高。"
    )""",
            f"""    // 6. Soal 6: Pilihan Kalimat
    Exercise(
        id = "u18_s3_p1_q6",
        type = ExerciseType.SENTENCE_CHOICE,
        title = "Pilih terjemahan yang benar",
        targetHanzi = "姚明 的 个子 非常 高。",
        targetPinyin = "Yáo Míng de gèzi fēicháng gāo.",
        targetTranslation = "Postur badan Yao Ming sangat tinggi.",
        correctAnswer = "Yáo Míng de gèzi fēicháng gāo.\\n姚明 的 个子 非常 高。",
        options = listOf(
            "Yáo Míng de gèzi fēicháng gāo.\\n姚明 的 个子 非常 高。",
            "Yáo Míng de gèzi bú gāo.\\n姚明 的 个子 不 高。",
            "Wǒ de gèzi fēicháng gāo.\\n我 的 个子 非常 高。"
        ),
        audioToSpeak = "姚明的个子非常高。"
    )""",
            f"""    // 7. Soal 7: Pilihan Gambar (个子 -> postur tubuh)
    Exercise(
        id = "u18_s3_p1_q7",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "个子",
        targetPinyin = "gèzi",
        targetTranslation = "tinggi badan",
        correctAnswer = "tinggi badan",
        audioToSpeak = "个子",
        pictureOptions = listOf(
            PictureOption("u18_s3_p1_opt7_1", "tinggi badan", "", R.drawable.ic_work_gentleman, true),
            PictureOption("u18_s3_p1_opt7_2", "bocah", "", R.drawable.ic_fam_child, false),
            PictureOption("u18_s3_p1_opt7_3", "celana", "", R.drawable.ic_shop_clothes, false),
            PictureOption("u18_s3_p1_opt7_4", "tas", "", R.drawable.ic_shop_goods, false)
        )
    )""",
            f"""    // 8. Soal 8: Ketik Pinyin (tinggi -> gāo)
    Exercise(
        id = "u18_s3_p1_q8",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "tinggi",
        sentenceWithBlank = "高 (________)",
        targetHanzi = "高",
        targetPinyin = "gāo",
        correctAnswer = "gao",
        keyboardKeys = {k3_p1_q8},
        audioToSpeak = "高"
    )""",
            f"""    // 9. Soal 9: Susun Kalimat (Pemain bola basket itu sangat tinggi.)
    Exercise(
        id = "u18_s3_p1_q9",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Pemain basket itu sangat tinggi.",
        targetHanzi = "那个 篮球 运动员 很 高。",
        targetPinyin = "Nàge lánqiú yùndòngyuán hěn gāo.",
        wordChips = listOf("那个:nàge", "篮球:lánqiú", "运动员:yùndòngyuán", "很:hěn", "高。:gāo.", "矮:ǎi"),
        correctAnswer = "那个,篮球,运动员,很,高。",
        audioToSpeak = "那个篮球运动员很高。"
    )""",
            f"""    // 10. Soal 10: Ketuk Pasangan yang Sesuai (Rangkuman Postur)
    Exercise(
        id = "u18_s3_p1_m10",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u18_s3_p1_m10_1", "个子", "gèzi", "postur tubuh"),
            MatchPairItem("u18_s3_p1_m10_2", "高", "gāo", "tinggi"),
            MatchPairItem("u18_s3_p1_m10_3", "篮球", "lánqiú", "bola basket"),
            MatchPairItem("u18_s3_p1_m10_4", "弟弟", "dìdi", "adik laki-laki")
        )
    )"""
        ],
        "p2": [
            f"""    // 1. Soal 1: Pilihan Gambar (长 -> panjang)
    Exercise(
        id = "u18_s3_p2_q1",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "长",
        targetPinyin = "cháng",
        targetTranslation = "panjang",
        correctAnswer = "panjang",
        audioToSpeak = "长",
        pictureOptions = listOf(
            PictureOption("u18_s3_p2_opt1", "panjang", "", R.drawable.ic_shop_clothes, true),
            PictureOption("u18_s3_p2_opt2", "jam tangan", "", R.drawable.ic_clock_analog, false),
            PictureOption("u18_s3_p2_opt3", "tas", "", R.drawable.ic_shop_goods, false),
            PictureOption("u18_s3_p2_opt4", "orang", "", R.drawable.ic_person_saya, false)
        )
    )""",
            f"""    // 2. Soal 2: Susun Kalimat (Rambut adik perempuan sangat panjang.)
    Exercise(
        id = "u18_s3_p2_q2",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Rambut adik perempuan sangat panjang.",
        targetHanzi = "妹妹 的 头发 很 长。",
        targetPinyin = "Mèimei de tóufa hěn cháng.",
        wordChips = listOf("妹妹:mèimei", "的:de", "头发:tóufa", "很:hěn", "长。:cháng.", "短:duǎn"),
        correctAnswer = "妹妹,的,头发,很,长。",
        audioToSpeak = "妹妹的头发很长。"
    )""",
            f"""    // 3. Soal 3: Ketuk Pasangan yang Sesuai (Panjang & Ciri Fisik)
    Exercise(
        id = "u18_s3_p2_m3",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u18_s3_p2_m1", "长", "cháng", "panjang"),
            MatchPairItem("u18_s3_p2_m2", "头发", "tóufa", "rambut"),
            MatchPairItem("u18_s3_p2_m3", "妹妹", "mèimei", "adik perempuan"),
            MatchPairItem("u18_s3_p2_m4", "很长", "hěn cháng", "sangat panjang")
        )
    )""",
            f"""    // 4. Soal 4: Ketik Pinyin (panjang -> cháng)
    Exercise(
        id = "u18_s3_p2_q4",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "panjang",
        sentenceWithBlank = "长 (________)",
        targetHanzi = "长",
        targetPinyin = "cháng",
        correctAnswer = "chang",
        keyboardKeys = {k3_p2_q4},
        audioToSpeak = "长"
    )""",
            f"""    // 5. Soal 5: Mendengar Kalimat (Rule 10: illustrationRes = 0)
    Exercise(
        id = "u18_s3_p2_q5",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Apa yang Anda dengar?",
        targetTranslation = "Jalan ini sangat panjang.",
        targetHanzi = "这 条 路 很 长。",
        targetPinyin = "Zhè tiáo lù hěn cháng.",
        wordChips = listOf("这:zhè", "条:tiáo", "路:lù", "很:hěn", "长。:cháng.", "远:yuǎn"),
        correctAnswer = "这,条,路,很,长。",
        illustrationRes = 0,
        audioToSpeak = "这条路很长。"
    )""",
            f"""    // 6. Soal 6: Pilihan Kalimat
    Exercise(
        id = "u18_s3_p2_q6",
        type = ExerciseType.SENTENCE_CHOICE,
        title = "Pilih terjemahan yang benar",
        targetHanzi = "她 有 一 头 长 头发。",
        targetPinyin = "Tā yǒu yì tóu cháng tóufa.",
        targetTranslation = "Dia memiliki rambut yang panjang.",
        correctAnswer = "Tā yǒu yì tóu cháng tóufa.\\n她 有 一 头 长 头发。",
        options = listOf(
            "Tā yǒu yì tóu cháng tóufa.\\n她 有 一 头 长 头发。",
            "Tā yǒu yì tóu duǎn tóufa.\\n她 有 一 头 短 头发。",
            "Wǒ yǒu yì tóu cháng tóufa.\\n我 有 一 头 长 头发。"
        ),
        audioToSpeak = "她有一头长头发。"
    )""",
            f"""    // 7. Soal 7: Pilihan Gambar (长 -> panjang)
    Exercise(
        id = "u18_s3_p2_q7",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "长",
        targetPinyin = "cháng",
        targetTranslation = "panjang",
        correctAnswer = "panjang",
        audioToSpeak = "长",
        pictureOptions = listOf(
            PictureOption("u18_s3_p2_opt7_1", "panjang", "", R.drawable.ic_shop_clothes, true),
            PictureOption("u18_s3_p2_opt7_2", "baju", "", R.drawable.ic_shop_piece_clothes, false),
            PictureOption("u18_s3_p2_opt7_3", "jam tangan", "", R.drawable.ic_clock_analog, false),
            PictureOption("u18_s3_p2_opt7_4", "tas", "", R.drawable.ic_shop_goods, false)
        )
    )""",
            f"""    // 8. Soal 8: Ketik Pinyin (panjang -> cháng)
    Exercise(
        id = "u18_s3_p2_q8",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "panjang",
        sentenceWithBlank = "长 (________)",
        targetHanzi = "长",
        targetPinyin = "cháng",
        correctAnswer = "chang",
        keyboardKeys = {k3_p2_q4},
        audioToSpeak = "长"
    )""",
            f"""    // 9. Soal 9: Susun Kalimat (Waktu yang dibutuhkan sangat panjang.)
    Exercise(
        id = "u18_s3_p2_q9",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Waktu yang dipakai sangat panjang.",
        targetHanzi = "时间 过 得 很 长。",
        targetPinyin = "Shíjiān guò de hěn cháng.",
        wordChips = listOf("时间:shíjiān", "过:guò", "得:de", "很:hěn", "长。:cháng.", "快:kuài"),
        correctAnswer = "时间,过,得,很,长。",
        audioToSpeak = "时间过得很长。"
    )""",
            f"""    // 10. Soal 10: Ketuk Pasangan yang Sesuai (Rangkuman Panjang & Durasi)
    Exercise(
        id = "u18_s3_p2_m10",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u18_s3_p2_m10_1", "长", "cháng", "panjang"),
            MatchPairItem("u18_s3_p2_m10_2", "时间", "shíjiān", "waktu"),
            MatchPairItem("u18_s3_p2_m10_3", "一条路", "yì tiáo lù", "sebuah jalan"),
            MatchPairItem("u18_s3_p2_m10_4", "长头发", "cháng tóufa", "rambut panjang")
        )
    )"""
        ]
    }

    # =========================================================================
    # STAGE 4: Detail Wajah & Anggota Tubuh (眼睛, 手)
    # =========================================================================
    k4_p1_q4 = make_keys("yanjing")
    k4_p1_q8 = make_keys("shou")
    k4_p2_q4 = make_keys("xishou")
    k4_p2_q8 = make_keys("dayanjing")
    
    stages[4] = {
        "p1": [
            f"""    // 1. Soal 1: Pilihan Gambar (眼睛 -> mata)
    Exercise(
        id = "u18_s4_p1_q1",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "眼睛",
        targetPinyin = "yǎnjing",
        targetTranslation = "mata",
        correctAnswer = "mata",
        audioToSpeak = "眼睛",
        pictureOptions = listOf(
            PictureOption("u18_s4_p1_opt1", "mata", "", R.drawable.ic_person_saya, true),
            PictureOption("u18_s4_p1_opt2", "tangan", "", R.drawable.ic_hand_wave, false),
            PictureOption("u18_s4_p1_opt3", "jam tangan", "", R.drawable.ic_clock_analog, false),
            PictureOption("u18_s4_p1_opt4", "tas", "", R.drawable.ic_shop_goods, false)
        )
    )""",
            f"""    // 2. Soal 2: Susun Kalimat (Mata adik perempuan besar dan indah.)
    Exercise(
        id = "u18_s4_p1_q2",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Mata adik perempuan sangat besar.",
        targetHanzi = "妹妹 的 眼睛 很 大。",
        targetPinyin = "Mèimei de yǎnjing hěn dà.",
        wordChips = listOf("妹妹:mèimei", "的:de", "眼睛:yǎnjing", "很:hěn", "大。:dà.", "小:xiǎo"),
        correctAnswer = "妹妹,的,眼睛,很,大。",
        audioToSpeak = "妹妹的眼睛很大。"
    )""",
            f"""    // 3. Soal 3: Ketuk Pasangan yang Sesuai (Mata & Wajah)
    Exercise(
        id = "u18_s4_p1_q3",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u18_s4_p1_m1", "眼睛", "yǎnjing", "mata"),
            MatchPairItem("u18_s4_p1_m2", "大眼睛", "dà yǎnjing", "mata besar"),
            MatchPairItem("u18_s4_p1_m3", "看", "kàn", "melihat"),
            MatchPairItem("u18_s4_p1_m4", "很美", "hěn měi", "sangat indah")
        )
    )""",
            f"""    // 4. Soal 4: Ketik Pinyin (mata -> yǎnjing)
    Exercise(
        id = "u18_s4_p1_q4",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "mata",
        sentenceWithBlank = "眼睛 (________)",
        targetHanzi = "眼睛",
        targetPinyin = "yǎnjing",
        correctAnswer = "yanjing",
        keyboardKeys = {k4_p1_q4},
        audioToSpeak = "眼睛"
    )""",
            f"""    // 5. Soal 5: Mendengar Kalimat (Rule 10: illustrationRes = 0)
    Exercise(
        id = "u18_s4_p1_q5",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Apa yang Anda dengar?",
        targetTranslation = "Mata kucing kecil berwarna biru.",
        targetHanzi = "小猫 的 眼睛 是 蓝色 的。",
        targetPinyin = "Xiǎomāo de yǎnjing shì lánsè de.",
        wordChips = listOf("小猫:xiǎomāo", "的:de", "眼睛:yǎnjing", "是:shì", "蓝色:lánsè", "的。:de.", "小狗:xiǎogǒu"),
        correctAnswer = "小猫,的,眼睛,是,蓝色,的。",
        illustrationRes = 0,
        audioToSpeak = "小猫的眼睛是蓝色的。"
    )""",
            f"""    // 6. Soal 6: Pilihan Kalimat
    Exercise(
        id = "u18_s4_p1_q6",
        type = ExerciseType.SENTENCE_CHOICE,
        title = "Pilih terjemahan yang benar",
        targetHanzi = "他 的 眼睛 很 漂亮。",
        targetPinyin = "Tā de yǎnjing hěn piàoliang.",
        targetTranslation = "Matanya sangat indah.",
        correctAnswer = "Tā de yǎnjing hěn piàoliang.\\n他 的 眼睛 很 漂亮。",
        options = listOf(
            "Tā de yǎnjing hěn piàoliang.\\n他 的 眼睛 很 漂亮。",
            "Wǒ de yǎnjing hěn piàoliang.\\n我 的 眼睛 很 漂亮。",
            "Tā de shǒu hěn piàoliang.\\n他 的 手 很 漂亮。"
        ),
        audioToSpeak = "他的眼睛很漂亮。"
    )""",
            f"""    // 7. Soal 7: Pilihan Gambar (手 -> tangan)
    Exercise(
        id = "u18_s4_p1_q7",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "手",
        targetPinyin = "shǒu",
        targetTranslation = "tangan",
        correctAnswer = "tangan",
        audioToSpeak = "手",
        pictureOptions = listOf(
            PictureOption("u18_s4_p1_opt7_1", "tangan", "", R.drawable.ic_hand_wave, true),
            PictureOption("u18_s4_p1_opt7_2", "mata", "", R.drawable.ic_person_saya, false),
            PictureOption("u18_s4_p1_opt7_3", "jam tangan", "", R.drawable.ic_clock_analog, false),
            PictureOption("u18_s4_p1_opt7_4", "tas", "", R.drawable.ic_shop_goods, false)
        )
    )""",
            f"""    // 8. Soal 8: Ketik Pinyin (tangan -> shǒu)
    Exercise(
        id = "u18_s4_p1_q8",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "tangan",
        sentenceWithBlank = "手 (________)",
        targetHanzi = "手",
        targetPinyin = "shǒu",
        correctAnswer = "shou",
        keyboardKeys = {k4_p1_q8},
        audioToSpeak = "手"
    )""",
            f"""    // 9. Soal 9: Susun Kalimat (Sebelum makan harus mencuci tangan.)
    Exercise(
        id = "u18_s4_p1_q9",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Sebelum makan harus cuci tangan.",
        targetHanzi = "吃饭 前 要 洗 手。",
        targetPinyin = "Chīfàn qián yào xǐ shǒu.",
        wordChips = listOf("吃饭:chīfàn", "前:qián", "要:yào", "洗:xǐ", "手。:shǒu.", "后:hòu"),
        correctAnswer = "吃饭,前,要,洗,手。",
        audioToSpeak = "吃饭前要洗手。"
    )""",
            f"""    // 10. Soal 10: Ketuk Pasangan yang Sesuai (Rangkuman Mata & Tangan)
    Exercise(
        id = "u18_s4_p1_m10",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u18_s4_p1_m10_1", "眼睛", "yǎnjing", "mata"),
            MatchPairItem("u18_s4_p1_m10_2", "手", "shǒu", "tangan"),
            MatchPairItem("u18_s4_p1_m10_3", "洗手", "xǐ shǒu", "cuci tangan"),
            MatchPairItem("u18_s4_p1_m10_4", "吃饭前", "chīfàn qián", "sebelum makan")
        )
    )"""
        ],
        "p2": [
            f"""    // 1. Soal 1: Pilihan Gambar (手 -> tangan)
    Exercise(
        id = "u18_s4_p2_q1",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "手",
        targetPinyin = "shǒu",
        targetTranslation = "tangan",
        correctAnswer = "tangan",
        audioToSpeak = "手",
        pictureOptions = listOf(
            PictureOption("u18_s4_p2_opt1", "tangan", "", R.drawable.ic_hand_wave, true),
            PictureOption("u18_s4_p2_opt2", "mata", "", R.drawable.ic_person_saya, false),
            PictureOption("u18_s4_p2_opt3", "jam tangan", "", R.drawable.ic_clock_analog, false),
            PictureOption("u18_s4_p2_opt4", "tas", "", R.drawable.ic_shop_goods, false)
        )
    )""",
            f"""    // 2. Soal 2: Susun Kalimat (Di tangannya memegang sebuah buku.)
    Exercise(
        id = "u18_s4_p2_q2",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Di tangannya memegang buku.",
        targetHanzi = "他 手 里 拿 着 一 本 书。",
        targetPinyin = "Tā shǒu lǐ ná zhe yì běn shū.",
        wordChips = listOf("他:tā", "手:shǒu", "里:lǐ", "拿:ná", "着:zhe", "一:yì", "本:běn", "书。:shū.", "包:bāo"),
        correctAnswer = "他,手,里,拿,着,一,本,书。",
        audioToSpeak = "他手里拿着一本书。"
    )""",
            f"""    // 3. Soal 3: Ketuk Pasangan yang Sesuai (Aksi Tangan)
    Exercise(
        id = "u18_s4_p2_m3",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u18_s4_p2_m1", "手", "shǒu", "tangan"),
            MatchPairItem("u18_s4_p2_m2", "手里", "shǒu lǐ", "di tangan"),
            MatchPairItem("u18_s4_p2_m3", "拿着", "ná zhe", "memegang"),
            MatchPairItem("u18_s4_p2_m4", "一本书", "yì běn shū", "sebuah buku")
        )
    )""",
            f"""    // 4. Soal 4: Ketik Pinyin (mencuci tangan -> xǐshǒu)
    Exercise(
        id = "u18_s4_p2_q4",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "cuci tangan",
        sentenceWithBlank = "洗手 (________)",
        targetHanzi = "洗手",
        targetPinyin = "xǐshǒu",
        correctAnswer = "xishou",
        keyboardKeys = {k4_p2_q4},
        audioToSpeak = "洗手"
    )""",
            f"""    // 5. Soal 5: Mendengar Kalimat (Rule 10: illustrationRes = 0)
    Exercise(
        id = "u18_s4_p2_q5",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Apa yang Anda dengar?",
        targetTranslation = "Tangan saya sangat bersih.",
        targetHanzi = "我 的 手 很 干净。",
        targetPinyin = "Wǒ de shǒu hěn gānjìng.",
        wordChips = listOf("我:wǒ", "的:de", "手:shǒu", "很:hěn", "干净。:gānjìng.", "脏:zāng"),
        correctAnswer = "我,的,手,很,干净。",
        illustrationRes = 0,
        audioToSpeak = "我的手很干净。"
    )""",
            f"""    // 6. Soal 6: Pilihan Kalimat
    Exercise(
        id = "u18_s4_p2_q6",
        type = ExerciseType.SENTENCE_CHOICE,
        title = "Pilih terjemahan yang benar",
        targetHanzi = "请 大家 举 起 手 来。",
        targetPinyin = "Qǐng dàjiā jǔ qǐ shǒu lái.",
        targetTranslation = "Silakan semua angkat tangan.",
        correctAnswer = "Qǐng dàjiā jǔ qǐ shǒu lái.\\n请 大家 举 起 手 来。",
        options = listOf(
            "Qǐng dàjiā jǔ qǐ shǒu lái.\\n请 大家 举 起 手 来。",
            "Qǐng dàjiā zhàn qǐlai.\\n请 大家 站 起来。",
            "Qǐng dàjiā zuò xià.\\n请 大家 坐 下。"
        ),
        audioToSpeak = "请大家举起手来。"
    )""",
            f"""    // 7. Soal 7: Pilihan Gambar (眼睛 -> mata)
    Exercise(
        id = "u18_s4_p2_q7",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "眼睛",
        targetPinyin = "yǎnjing",
        targetTranslation = "mata",
        correctAnswer = "mata",
        audioToSpeak = "眼睛",
        pictureOptions = listOf(
            PictureOption("u18_s4_p2_opt7_1", "mata", "", R.drawable.ic_person_saya, true),
            PictureOption("u18_s4_p2_opt7_2", "tangan", "", R.drawable.ic_hand_wave, false),
            PictureOption("u18_s4_p2_opt7_3", "jam tangan", "", R.drawable.ic_clock_analog, false),
            PictureOption("u18_s4_p2_opt7_4", "tas", "", R.drawable.ic_shop_goods, false)
        )
    )""",
            f"""    // 8. Soal 8: Ketik Pinyin (mata -> yǎnjing)
    Exercise(
        id = "u18_s4_p2_q8",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "mata",
        sentenceWithBlank = "眼睛 (________)",
        targetHanzi = "眼睛",
        targetPinyin = "yǎnjing",
        correctAnswer = "yanjing",
        keyboardKeys = {k4_p1_q4},
        audioToSpeak = "眼睛"
    )""",
            f"""    // 9. Soal 9: Susun Kalimat (Ibu memegang tangan saya.)
    Exercise(
        id = "u18_s4_p2_q9",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Ibu menggandeng tangan saya.",
        targetHanzi = "妈妈 牵 着 我 的 手。",
        targetPinyin = "Māma qiān zhe wǒ de shǒu.",
        wordChips = listOf("妈妈:māma", "牵:qiān", "着:zhe", "我:wǒ", "的:de", "手。:shǒu.", "爸爸:bàba"),
        correctAnswer = "妈妈,牵,着,我,的,手。",
        audioToSpeak = "妈妈牵着我的手。"
    )""",
            f"""    // 10. Soal 10: Ketuk Pasangan yang Sesuai (Rangkuman Kehangatan Tangan)
    Exercise(
        id = "u18_s4_p2_m10",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u18_s4_p2_m10_1", "手", "shǒu", "tangan"),
            MatchPairItem("u18_s4_p2_m10_2", "干净", "gānjìng", "bersih"),
            MatchPairItem("u18_s4_p2_m10_3", "举手", "jǔ shǒu", "angkat tangan"),
            MatchPairItem("u18_s4_p2_m10_4", "牵手", "qiān shǒu", "gandeng tangan")
        )
    )"""
        ]
    }

    # =========================================================================
    # STAGE 5: Evaluasi Komprehensif Busana & Fisik (Sintesis Seluruh Bab 18)
    # =========================================================================
    k5_p1_q4 = make_keys("kuzi")
    k5_p1_q8 = make_keys("hongse")
    k5_p2_q4 = make_keys("gezi")
    k5_p2_q8 = make_keys("shoubiao")
    
    stages[5] = {
        "p1": [
            f"""    // 1. Soal 1: Pilihan Gambar (裤子 -> celana)
    Exercise(
        id = "u18_s5_p1_q1",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "裤子",
        targetPinyin = "kùzi",
        targetTranslation = "celana",
        correctAnswer = "celana",
        audioToSpeak = "裤子",
        pictureOptions = listOf(
            PictureOption("u18_s5_p1_opt1", "celana", "", R.drawable.ic_shop_clothes, true),
            PictureOption("u18_s5_p1_opt2", "baju", "", R.drawable.ic_shop_piece_clothes, false),
            PictureOption("u18_s5_p1_opt3", "jam tangan", "", R.drawable.ic_clock_analog, false),
            PictureOption("u18_s5_p1_opt4", "tas", "", R.drawable.ic_shop_goods, false)
        )
    )""",
            f"""    // 2. Soal 2: Susun Kalimat (Gadis itu memakai celana putih.)
    Exercise(
        id = "u18_s5_p1_q2",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Gadis itu memakai celana putih.",
        targetHanzi = "女孩儿 穿 着 白色 裤子。",
        targetPinyin = "Nǚháiér chuān zhe báisè kùzi.",
        wordChips = listOf("女孩儿:nǚháiér", "穿:chuān", "着:zhe", "白色:báisè", "裤子。:kùzi.", "黑色:hēisè"),
        correctAnswer = "女孩儿,穿,着,白色,裤子。",
        audioToSpeak = "女孩儿穿着白色裤子。"
    )""",
            f"""    // 3. Soal 3: Ketuk Pasangan yang Sesuai (Sintesis Busana & Warna)
    Exercise(
        id = "u18_s5_p1_m3",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u18_s5_p1_m1", "裤子", "kùzi", "celana"),
            MatchPairItem("u18_s5_p1_m2", "白色", "báisè", "warna putih"),
            MatchPairItem("u18_s5_p1_m3", "红色", "hóngsè", "warna merah"),
            MatchPairItem("u18_s5_p1_m4", "女孩儿", "nǚháiér", "anak perempuan")
        )
    )""",
            f"""    // 4. Soal 4: Ketik Pinyin (celana -> kùzi)
    Exercise(
        id = "u18_s5_p1_q4",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "celana",
        sentenceWithBlank = "裤子 (________)",
        targetHanzi = "裤子",
        targetPinyin = "kùzi",
        correctAnswer = "kuzi",
        keyboardKeys = {k5_p1_q4},
        audioToSpeak = "裤子"
    )""",
            f"""    // 5. Soal 5: Mendengar Kalimat (Rule 10: illustrationRes = 0)
    Exercise(
        id = "u18_s5_p1_q5",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Apa yang Anda dengar?",
        targetTranslation = "Tas merah ini sangat cantik.",
        targetHanzi = "这个 红色 的 包 真 漂亮。",
        targetPinyin = "Zhège hóngsè de bāo zhēn piàoliang.",
        wordChips = listOf("这个:zhège", "红色:hóngsè", "的:de", "包:bāo", "真:zhēn", "漂亮。:piàoliang.", "黑色:hēisè"),
        correctAnswer = "这个,红色,的,包,真,漂亮。",
        illustrationRes = 0,
        audioToSpeak = "这个红色的包真漂亮。"
    )""",
            f"""    // 6. Soal 6: Pilihan Kalimat
    Exercise(
        id = "u18_s5_p1_q6",
        type = ExerciseType.SENTENCE_CHOICE,
        title = "Pilih terjemahan yang benar",
        targetHanzi = "他 的 个子 很 高， 头发 很 长。",
        targetPinyin = "Tā de gèzi hěn gāo, tóufa hěn cháng.",
        targetTranslation = "Tinggi badannya sangat tinggi, rambutnya sangat panjang.",
        correctAnswer = "Tā de gèzi hěn gāo, tóufa hěn cháng.\\n他 的 个子 很 高， 头发 很 长。",
        options = listOf(
            "Tā de gèzi hěn gāo, tóufa hěn cháng.\\n他 的 个子 很 高， 头发 很 长。",
            "Tā de gèzi bú gāo, tóufa hěn duǎn.\\n他 的 个子 不 高， 头发 很 短。",
            "Wǒ de gèzi hěn gāo, tóufa hěn cháng.\\n我 的 个子 很 高， 头发 很 长。"
        ),
        audioToSpeak = "他的个子很高，头发很长。"
    )""",
            f"""    // 7. Soal 7: Pilihan Gambar (红色 -> warna merah)
    Exercise(
        id = "u18_s5_p1_q7",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "红色",
        targetPinyin = "hóngsè",
        targetTranslation = "warna merah",
        correctAnswer = "warna merah",
        audioToSpeak = "红色",
        pictureOptions = listOf(
            PictureOption("u18_s5_p1_opt7_1", "warna merah", "", R.drawable.ic_shop_clothes, true),
            PictureOption("u18_s5_p1_opt7_2", "warna hitam", "", R.drawable.ic_shop_piece_clothes, false),
            PictureOption("u18_s5_p1_opt7_3", "jam tangan", "", R.drawable.ic_clock_analog, false),
            PictureOption("u18_s5_p1_opt7_4", "tas", "", R.drawable.ic_shop_goods, false)
        )
    )""",
            f"""    // 8. Soal 8: Ketik Pinyin (warna merah -> hóngsè)
    Exercise(
        id = "u18_s5_p1_q8",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "warna merah",
        sentenceWithBlank = "红色 (________)",
        targetHanzi = "红色",
        targetPinyin = "hóngsè",
        correctAnswer = "hongse",
        keyboardKeys = {k5_p1_q8},
        audioToSpeak = "红色"
    )""",
            f"""    // 9. Soal 9: Susun Kalimat (Mata anak laki-laki itu sangat besar.)
    Exercise(
        id = "u18_s5_p1_q9",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Mata anak laki-laki itu besar.",
        targetHanzi = "小 男孩儿 的 眼睛 很 大。",
        targetPinyin = "Xiǎo nánháiér de yǎnjing hěn dà.",
        wordChips = listOf("小:xiǎo", "男孩儿:nánháiér", "的:de", "眼睛:yǎnjing", "很:hěn", "大。:dà.", "女孩儿:nǚháiér"),
        correctAnswer = "小,男孩儿,的,眼睛,很,大。",
        audioToSpeak = "小男孩儿的眼睛很大。"
    )""",
            f"""    // 10. Soal 10: Ketuk Pasangan yang Sesuai (Rangkuman Sintesis 1)
    Exercise(
        id = "u18_s5_p1_m10",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u18_s5_p1_m10_1", "眼睛", "yǎnjing", "mata"),
            MatchPairItem("u18_s5_p1_m10_2", "个子", "gèzi", "postur tubuh"),
            MatchPairItem("u18_s5_p1_m10_3", "真漂亮", "zhēn piàoliang", "sangat cantik"),
            MatchPairItem("u18_s5_p1_m10_4", "很大", "hěn dà", "sangat besar")
        )
    )"""
        ],
        "p2": [
            f"""    // 1. Soal 1: Pilihan Gambar (手表 -> jam tangan)
    Exercise(
        id = "u18_s5_p2_q1",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "手表",
        targetPinyin = "shǒubiǎo",
        targetTranslation = "jam tangan",
        correctAnswer = "jam tangan",
        audioToSpeak = "手表",
        pictureOptions = listOf(
            PictureOption("u18_s5_p2_opt1", "jam tangan", "", R.drawable.ic_clock_analog, true),
            PictureOption("u18_s5_p2_opt2", "tas", "", R.drawable.ic_shop_goods, false),
            PictureOption("u18_s5_p2_opt3", "celana", "", R.drawable.ic_shop_clothes, false),
            PictureOption("u18_s5_p2_opt4", "baju", "", R.drawable.ic_shop_piece_clothes, false)
        )
    )""",
            f"""    // 2. Soal 2: Susun Kalimat (Dia mencuci tangan lalu memakai jam tangan.)
    Exercise(
        id = "u18_s5_p2_q2",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Dia cuci tangan lalu pakai jam.",
        targetHanzi = "他 洗 了 手 戴 手表。",
        targetPinyin = "Tā xǐ le shǒu dài shǒubiǎo.",
        wordChips = listOf("他:tā", "洗:xǐ", "了:le", "手:shǒu", "戴:dài", "手表。:shǒubiǎo.", "包:bāo"),
        correctAnswer = "他,洗,了,手,戴,手表。",
        audioToSpeak = "他洗了手戴手表。"
    )""",
            f"""    // 3. Soal 3: Ketuk Pasangan yang Sesuai (Grand Sintesis Bab 18)
    Exercise(
        id = "u18_s5_p2_m3",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u18_s5_p2_m1", "手表", "shǒubiǎo", "jam tangan"),
            MatchPairItem("u18_s5_p2_m2", "手", "shǒu", "tangan"),
            MatchPairItem("u18_s5_p2_m3", "包", "bāo", "tas"),
            MatchPairItem("u18_s5_p2_m4", "长", "cháng", "panjang")
        )
    )""",
            f"""    // 4. Soal 4: Ketik Pinyin (postur tubuh -> gèzi)
    Exercise(
        id = "u18_s5_p2_q4",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "postur / tinggi badan",
        sentenceWithBlank = "个子 (________)",
        targetHanzi = "个子",
        targetPinyin = "gèzi",
        correctAnswer = "gezi",
        keyboardKeys = {k5_p2_q4},
        audioToSpeak = "个子"
    )""",
            f"""    // 5. Soal 5: Mendengar Kalimat (Rule 10: illustrationRes = 0)
    Exercise(
        id = "u18_s5_p2_q5",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Apa yang Anda dengar?",
        targetTranslation = "Di dalam tas ada sebuah buku.",
        targetHanzi = "包 里 有 一 本 书。",
        targetPinyin = "Bāo lǐ yǒu yì běn shū.",
        wordChips = listOf("包:bāo", "里:lǐ", "有:yǒu", "一:yì", "本:běn", "书。:shū.", "两:liǎng"),
        correctAnswer = "包,里,有,一,本,书。",
        illustrationRes = 0,
        audioToSpeak = "包里有一本书。"
    )""",
            f"""    // 6. Soal 6: Pilihan Kalimat
    Exercise(
        id = "u18_s5_p2_q6",
        type = ExerciseType.SENTENCE_CHOICE,
        title = "Pilih terjemahan yang benar",
        targetHanzi = "这 条 绿色 的 裤子 太 长 了。",
        targetPinyin = "Zhè tiáo lǜsè de kùzi tài cháng le.",
        targetTranslation = "Celana hijau ini terlalu panjang.",
        correctAnswer = "Zhè tiáo lǜsè de kùzi tài cháng le.\\n这 条 绿色 的 裤子 太 长 了。",
        options = listOf(
            "Zhè tiáo lǜsè de kùzi tài cháng le.\\n这 条 绿色 的 裤子 太 长 了。",
            "Zhè tiáo hēisè de kùzi tài cháng le.\\n这 条 黑色 的 裤子 太 长 了。",
            "Zhè tiáo lǜsè de kùzi tài duǎn le.\\n这 条 绿色 的 裤子 太 短 了。"
        ),
        audioToSpeak = "这条绿色的裤子太长了。"
    )""",
            f"""    // 7. Soal 7: Pilihan Gambar (包 -> tas)
    Exercise(
        id = "u18_s5_p2_q7",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "包",
        targetPinyin = "bāo",
        targetTranslation = "tas",
        correctAnswer = "tas",
        audioToSpeak = "包",
        pictureOptions = listOf(
            PictureOption("u18_s5_p2_opt7_1", "tas", "", R.drawable.ic_shop_goods, true),
            PictureOption("u18_s5_p2_opt7_2", "jam tangan", "", R.drawable.ic_clock_analog, false),
            PictureOption("u18_s5_p2_opt7_3", "celana", "", R.drawable.ic_shop_clothes, false),
            PictureOption("u18_s5_p2_opt7_4", "baju", "", R.drawable.ic_shop_piece_clothes, false)
        )
    )""",
            f"""    // 8. Soal 8: Ketik Pinyin (jam tangan -> shǒubiǎo)
    Exercise(
        id = "u18_s5_p2_q8",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "jam tangan",
        sentenceWithBlank = "手表 (________)",
        targetHanzi = "手表",
        targetPinyin = "shǒubiǎo",
        correctAnswer = "shoubiao",
        keyboardKeys = {k5_p2_q8},
        audioToSpeak = "手表"
    )""",
            f"""    // 9. Soal 9: Susun Kalimat (Semua orang suka pakaian warna indah.)
    Exercise(
        id = "u18_s5_p2_q9",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Semua orang suka baju warna indah.",
        targetHanzi = "大家 喜欢 漂亮 颜色 的 衣服。",
        targetPinyin = "Dàjiā xǐhuan piàoliang yánsè de yīfu.",
        wordChips = listOf("大家:dàjiā", "喜欢:xǐhuan", "漂亮:piàoliang", "颜色:yánsè", "的:de", "衣服。:yīfu.", "买:mǎi"),
        correctAnswer = "大家,喜欢,漂亮,颜色,的,衣服。",
        audioToSpeak = "大家喜欢漂亮颜色的衣服。"
    )""",
            f"""    // 10. Soal 10: Ketuk Pasangan yang Sesuai (Grand Review Final Bab 18)
    Exercise(
        id = "u18_s5_p2_m10",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u18_s5_p2_m10_1", "漂亮颜色", "piàoliang yánsè", "warna indah"),
            MatchPairItem("u18_s5_p2_m10_2", "新买的包", "xīn mǎi de bāo", "tas baru beli"),
            MatchPairItem("u18_s5_p2_m10_3", "戴手表", "dài shǒubiǎo", "pakai arloji"),
            MatchPairItem("u18_s5_p2_m10_4", "穿裤子", "chuān kùzi", "pakai celana")
        )
    )"""
        ]
    }

    for s_idx in range(1, 6):
        filename = f"{base_dir}/Bab18Stage{s_idx}Data.kt"
        p1_code = ",\n\n".join(stages[s_idx]["p1"])
        p2_code = ",\n\n".join(stages[s_idx]["p2"])
        
        content = f"""package com.example.chineselearning.data.repository

import com.example.chineselearning.R
import com.example.chineselearning.data.model.Exercise
import com.example.chineselearning.data.model.ExerciseType
import com.example.chineselearning.data.model.MatchPairItem
import com.example.chineselearning.data.model.PictureOption

val bab18Stage{s_idx}Part1Exercises = listOf(
{p1_code}
)

val bab18Stage{s_idx}Part2Exercises = listOf(
{p2_code}
)
"""
        with open(filename, "w", encoding="utf-8") as f:
            f.write(content)
        print(f"Written {filename}")

if __name__ == "__main__":
    generate_bab18()
