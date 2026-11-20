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

def generate_bab28():
    base_dir = "app/src/main/java/com/example/chineselearning/data/repository"
    
    stages = {}
    
    # =========================================================================
    # STAGE 1: Struktur Komparasi Dasar A 比 B (比, 最)
    # =========================================================================
    k1_p1_q4 = make_keys("bi")
    k1_p1_q8 = make_keys("zui")
    k1_p2_q4 = make_keys("bidi")
    k1_p2_q8 = make_keys("zuigao")
    
    stages[1] = {
        "p1": [
            f"""    // 1. Soal 1: Pilihan Gambar (比 -> membandingkan / daripada)
    Exercise(
        id = "u28_s1_p1_q1",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "比",
        targetPinyin = "bǐ",
        targetTranslation = "daripada / dibandingkan",
        correctAnswer = "daripada / dibandingkan",
        audioToSpeak = "比",
        pictureOptions = listOf(
            PictureOption("u28_s1_p1_opt1", "perbandingan", "", R.drawable.ic_gram_compare_scale, true),
            PictureOption("u28_s1_p1_opt2", "paling", "", R.drawable.ic_gram_superlative_podium, false),
            PictureOption("u28_s1_p1_opt3", "derajat", "", R.drawable.ic_gram_degree_speedometer, false),
            PictureOption("u28_s1_p1_opt4", "waktu", "", R.drawable.ic_gram_timeline_future, false)
        )
    )""",
            f"""    // 2. Soal 2: Susun Kalimat (Cuaca hari ini jauh lebih baik dibanding kemarin.)
    Exercise(
        id = "u28_s1_p1_q2",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Hari ini cuaca lebih baik dari kemarin.",
        targetHanzi = "今天 天气 比 昨天 好。",
        targetPinyin = "Jīntiān tiānqì bǐ zuótiān hǎo.",
        wordChips = listOf("今天:jīntiān", "天气:tiānqì", "比:bǐ", "昨天:zuótiān", "好。:hǎo.", "最:zuì"),
        correctAnswer = "今天,天气,比,昨天,好。",
        audioToSpeak = "今天天气比昨天好。"
    )""",
            f"""    // 3. Soal 3: Ketuk Pasangan yang Sesuai (Komparasi & Superlatif)
    Exercise(
        id = "u28_s1_p1_q3",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u28_s1_p1_m1", "比", "bǐ", "dibandingkan / daripada"),
            MatchPairItem("u28_s1_p1_m2", "最", "zuì", "paling / ter-"),
            MatchPairItem("u28_s1_p1_m3", "最好", "zuì hǎo", "paling baik"),
            MatchPairItem("u28_s1_p1_m4", "比较", "bǐjiào", "relatif / membandingkan")
        )
    )""",
            f"""    // 4. Soal 4: Ketik Pinyin (dibandingkan -> bǐ)
    Exercise(
        id = "u28_s1_p1_q4",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "dibandingkan dengan / daripada",
        sentenceWithBlank = "比 (________)",
        targetHanzi = "比",
        targetPinyin = "bǐ",
        correctAnswer = "bi",
        keyboardKeys = {k1_p1_q4},
        audioToSpeak = "比"
    )""",
            f"""    // 5. Soal 5: Mendengar Kalimat (Rule 10: illustrationRes = 0)
    Exercise(
        id = "u28_s1_p1_q5",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Apa yang Anda dengar?",
        targetTranslation = "Di dalam kelas dia berbicara bahasa Mandarin paling bagus.",
        targetHanzi = "他 汉语 说 得 最 好。",
        targetPinyin = "Tā Hànyǔ shuō de zuì hǎo.",
        wordChips = listOf("他:tā", "汉语:Hànyǔ", "说:shuō", "得:de", "最:zuì", "好。:hǎo.", "比:bǐ"),
        correctAnswer = "他,汉语,说,得,最,好。",
        illustrationRes = 0,
        audioToSpeak = "他汉语说得最好。"
    )""",
            f"""    // 6. Soal 6: Pilihan Kalimat
    Exercise(
        id = "u28_s1_p1_q6",
        type = ExerciseType.SENTENCE_CHOICE,
        title = "Pilih terjemahan yang benar",
        targetHanzi = "哥哥 比 弟弟 高 五 厘米。",
        targetPinyin = "Gēge bǐ dìdi gāo wǔ límǐ.",
        targetTranslation = "Kakak laki-laki lebih tinggi lima sentimeter dibanding adik.",
        correctAnswer = "Gēge bǐ dìdi gāo wǔ límǐ.\\n哥哥 比 弟弟 高 五 厘米。",
        options = listOf(
            "Gēge bǐ dìdi gāo wǔ límǐ.\\n哥哥 比 弟弟 高 五 厘米。",
            "Dìdi bǐ gēge gāo wǔ límǐ.\\n弟弟 比 哥哥 高 五 厘米。",
            "Gēge hé dìdi yíyàng gāo.\\n哥哥 和 弟弟 一样 高。"
        ),
        audioToSpeak = "哥哥比弟弟高五厘米。"
    )""",
            f"""    // 7. Soal 7: Pilihan Gambar (最 -> paling / superlatif)
    Exercise(
        id = "u28_s1_p1_q7",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "最",
        targetPinyin = "zuì",
        targetTranslation = "paling",
        correctAnswer = "paling",
        audioToSpeak = "最",
        pictureOptions = listOf(
            PictureOption("u28_s1_p1_opt7_1", "paling", "", R.drawable.ic_gram_superlative_podium, true),
            PictureOption("u28_s1_p1_opt7_2", "skala banding", "", R.drawable.ic_gram_compare_scale, false),
            PictureOption("u28_s1_p1_opt7_3", "kecepatan", "", R.drawable.ic_gram_degree_speedometer, false),
            PictureOption("u28_s1_p1_opt7_4", "arah", "", R.drawable.ic_gram_manner_running, false)
        )
    )""",
            f"""    // 8. Soal 8: Ketik Pinyin (paling/ter- -> zuì)
    Exercise(
        id = "u28_s1_p1_q8",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "paling / ter-",
        sentenceWithBlank = "最 (________)",
        targetHanzi = "最",
        targetPinyin = "zuì",
        correctAnswer = "zui",
        keyboardKeys = {k1_p1_q8},
        audioToSpeak = "最"
    )""",
            f"""    // 9. Soal 9: Susun Kalimat (Saya paling suka makan semangka.)
    Exercise(
        id = "u28_s1_p1_q9",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Saya paling suka makan semangka.",
        targetHanzi = "我 最 喜欢 吃 西瓜。",
        targetPinyin = "Wǒ zuì xǐhuan chī xīguā.",
        wordChips = listOf("我:wǒ", "最:zuì", "喜欢:xǐhuan", "吃:chī", "西瓜。:xīguā.", "比:bǐ"),
        correctAnswer = "我,最,喜欢,吃,西瓜。",
        audioToSpeak = "我最喜欢吃西瓜。"
    )""",
            f"""    // 10. Soal 10: Ketuk Pasangan yang Sesuai (Rangkuman Komparasi)
    Exercise(
        id = "u28_s1_p1_m10",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u28_s1_p1_m10_1", "比", "bǐ", "daripada"),
            MatchPairItem("u28_s1_p1_m2", "最", "zuì", "ter- / paling"),
            MatchPairItem("u28_s1_p1_m3", "比我高", "bǐ wǒ gāo", "lebih tinggi dariku"),
            MatchPairItem("u28_s1_p1_m4", "最喜欢", "zuì xǐhuan", "paling disukai")
        )
    )"""
        ],
        "p2": [
            f"""    // 1. Soal 1: Pilihan Gambar (比 -> perbandingan timbangan)
    Exercise(
        id = "u28_s1_p2_q1",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "比",
        targetPinyin = "bǐ",
        targetTranslation = "perbandingan",
        correctAnswer = "perbandingan",
        audioToSpeak = "比",
        pictureOptions = listOf(
            PictureOption("u28_s1_p2_opt1", "perbandingan", "", R.drawable.ic_gram_compare_scale, true),
            PictureOption("u28_s1_p2_opt2", "podium", "", R.drawable.ic_gram_superlative_podium, false),
            PictureOption("u28_s1_p2_opt3", "kecepatan", "", R.drawable.ic_gram_degree_speedometer, false),
            PictureOption("u28_s1_p2_opt4", "waktu", "", R.drawable.ic_gram_timeline_future, false)
        )
    )""",
            f"""    // 2. Soal 2: Susun Kalimat (Apel ini lebih manis dibanding yang itu.)
    Exercise(
        id = "u28_s1_p2_q2",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Apel ini lebih manis dari yang itu.",
        targetHanzi = "这个 苹果 比 那个 甜。",
        targetPinyin = "Zhège píngguǒ bǐ nàge tián.",
        wordChips = listOf("这个:zhège", "苹果:píngguǒ", "比:bǐ", "那个:nàge", "甜。:tián.", "最:zuì"),
        correctAnswer = "这个,苹果,比,那个,甜。",
        audioToSpeak = "这个苹果比那个甜。"
    )""",
            f"""    // 3. Soal 3: Ketuk Pasangan yang Sesuai (Pola Komparatif)
    Exercise(
        id = "u28_s1_p2_m3",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u28_s1_p2_m1", "比他大", "bǐ tā dà", "lebih tua darinya"),
            MatchPairItem("u28_s1_p2_m2", "比我快", "bǐ wǒ kuài", "lebih cepat dariku"),
            MatchPairItem("u28_s1_p2_m3", "最大", "zuì dà", "paling besar"),
            MatchPairItem("u28_s1_p2_m4", "最小", "zuì xiǎo", "paling kecil")
        )
    )""",
            f"""    // 4. Soal 4: Ketik Pinyin (dibandingkan adik -> bǐdì)
    Exercise(
        id = "u28_s1_p2_q4",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "dibanding adik",
        sentenceWithBlank = "比弟 (________)",
        targetHanzi = "比弟",
        targetPinyin = "bǐdì",
        correctAnswer = "bidi",
        keyboardKeys = {k1_p2_q4},
        audioToSpeak = "比弟"
    )""",
            f"""    // 5. Soal 5: Mendengar Kalimat (Rule 10: illustrationRes = 0)
    Exercise(
        id = "u28_s1_p2_q5",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Apa yang Anda dengar?",
        targetTranslation = "Pesawat terbang paling cepat.",
        targetHanzi = "飞机 跑 得 最 快。",
        targetPinyin = "Fēijī pǎo de zuì kuài.",
        wordChips = listOf("飞机:fēijī", "跑:pǎo", "得:de", "最:zuì", "快。:kuài.", "慢:màn"),
        correctAnswer = "飞机,跑,得,最,快。",
        illustrationRes = 0,
        audioToSpeak = "飞机跑得最快。"
    )""",
            f"""    // 6. Soal 6: Pilihan Kalimat
    Exercise(
        id = "u28_s1_p2_q6",
        type = ExerciseType.SENTENCE_CHOICE,
        title = "Pilih terjemahan yang benar",
        targetHanzi = "今天 是 我 最 开心 的 一 天。",
        targetPinyin = "Jīntiān shì wǒ zuì kāixīn de yì tiān.",
        targetTranslation = "Hari ini adalah hari yang paling membuat saya gembira.",
        correctAnswer = "Jīntiān shì wǒ zuì kāixīn de yì tiān.\\n今天 是 我 最 开心 的 一 天。",
        options = listOf(
            "Jīntiān shì wǒ zuì kāixīn de yì tiān.\\n今天 是 我 最 开心 的 一 天。",
            "Zuótiān shì wǒ zuì kāixīn de yì tiān.\\n昨天 是 我 最 开心 的 一 天。",
            "Jīntiān shì wǒ zuì lèi de yì tiān.\\n今天 是 我 最 累 的 一 天。"
        ),
        audioToSpeak = "今天是我最开心的一天。"
    )""",
            f"""    // 7. Soal 7: Pilihan Gambar (最 -> superlatif tertinggi)
    Exercise(
        id = "u28_s1_p2_q7",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "最",
        targetPinyin = "zuì",
        targetTranslation = "paling",
        correctAnswer = "paling",
        audioToSpeak = "最",
        pictureOptions = listOf(
            PictureOption("u28_s1_p2_opt7_1", "paling", "", R.drawable.ic_gram_superlative_podium, true),
            PictureOption("u28_s1_p2_opt7_2", "skala", "", R.drawable.ic_gram_compare_scale, false),
            PictureOption("u28_s1_p2_opt7_3", "derajat", "", R.drawable.ic_gram_degree_speedometer, false),
            PictureOption("u28_s1_p2_opt7_4", "berjalan", "", R.drawable.ic_gram_manner_running, false)
        )
    )""",
            f"""    // 8. Soal 8: Ketik Pinyin (paling tinggi -> zuìgāo)
    Exercise(
        id = "u28_s1_p2_q8",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "paling tinggi",
        sentenceWithBlank = "最高 (________)",
        targetHanzi = "最高",
        targetPinyin = "zuìgāo",
        correctAnswer = "zuigao",
        keyboardKeys = {k1_p2_q8},
        audioToSpeak = "最高"
    )""",
            f"""    // 9. Soal 9: Susun Kalimat (Hari ini adalah hari paling dingin.)
    Exercise(
        id = "u28_s1_p2_q9",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Hari ini adalah hari paling dingin.",
        targetHanzi = "今天 是 最 冷 的 一 天。",
        targetPinyin = "Jīntiān shì zuì lěng de yì tiān.",
        wordChips = listOf("今天:jīntiān", "是:shì", "最:zuì", "冷:lěng", "的:de", "一:yì", "天。:tiān.", "热:rè"),
        correctAnswer = "今天,是,最,冷,的,一,天。",
        audioToSpeak = "今天是最冷的一天。"
    )""",
            f"""    // 10. Soal 10: Ketuk Pasangan yang Sesuai (Rangkuman Ekstrem Superlatif)
    Exercise(
        id = "u28_s1_p2_m10",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u28_s1_p2_m10_1", "最高", "zuì gāo", "tertinggi"),
            MatchPairItem("u28_s1_p2_m10_2", "最冷", "zuì lěng", "terdingin"),
            MatchPairItem("u28_s1_p2_m10_3", "最热", "zuì rè", "terpanas"),
            MatchPairItem("u28_s1_p2_m10_4", "最贵", "zuì guì", "termahal")
        )
    )"""
        ]
    }

    # =========================================================================
    # STAGE 2: Partikel Tata Bahasa Struktural (得, 地)
    # =========================================================================
    k2_p1_q4 = make_keys("de")
    k2_p1_q8 = make_keys("xiede")
    k2_p2_q4 = make_keys("paode")
    k2_p2_q8 = make_keys("mande")
    
    stages[2] = {
        "p1": [
            f"""    // 1. Soal 1: Pilihan Gambar (得 -> partikel komplemen hasil)
    Exercise(
        id = "u28_s2_p1_q1",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "得",
        targetPinyin = "de",
        targetTranslation = "partikel komplemen derajat",
        correctAnswer = "partikel komplemen derajat",
        audioToSpeak = "得",
        pictureOptions = listOf(
            PictureOption("u28_s2_p1_opt1", "derajat", "", R.drawable.ic_gram_degree_speedometer, true),
            PictureOption("u28_s2_p1_opt2", "timbangan", "", R.drawable.ic_gram_compare_scale, false),
            PictureOption("u28_s2_p1_opt3", "podium", "", R.drawable.ic_gram_superlative_podium, false),
            PictureOption("u28_s2_p1_opt4", "waktu", "", R.drawable.ic_gram_timeline_future, false)
        )
    )""",
            f"""    // 2. Soal 2: Susun Kalimat (Xiao Ming menulis karakter Hanzi dengan sangat indah.)
    Exercise(
        id = "u28_s2_p1_q2",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Xiao Ming menulis Hanzi sangat indah.",
        targetHanzi = "小明 汉字 写 得 很 漂亮。",
        targetPinyin = "Xiǎomíng Hànzì xiě de hěn piàoliang.",
        wordChips = listOf("小明:Xiǎomíng", "汉字:Hànzì", "写:xiě", "得:de", "很:hěn", "漂亮。:piàoliang.", "快:kuài"),
        correctAnswer = "小明,汉字,写,得,很,漂亮。",
        audioToSpeak = "小明汉字写得非常漂亮。"
    )""",
            f"""    // 3. Soal 3: Ketuk Pasangan yang Sesuai (Partikel 得)
    Exercise(
        id = "u28_s2_p1_q3",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u28_s2_p1_m1", "写得好", "xiě de hǎo", "menulis dengan baik"),
            MatchPairItem("u28_s2_p1_m2", "跑得快", "pǎo de kuài", "berlari kencang"),
            MatchPairItem("u28_s2_p1_m3", "起得早", "qǐ de zǎo", "bangun pagi"),
            MatchPairItem("u28_s2_p1_m4", "吃得饱", "chī de bǎo", "makan kenyang")
        )
    )""",
            f"""    // 4. Soal 4: Ketik Pinyin (partikel komplemen -> de)
    Exercise(
        id = "u28_s2_p1_q4",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "partikel derajat",
        sentenceWithBlank = "得 (________)",
        targetHanzi = "得",
        targetPinyin = "de",
        correctAnswer = "de",
        keyboardKeys = {k2_p1_q4},
        audioToSpeak = "得"
    )""",
            f"""    // 5. Soal 5: Mendengar Kalimat (Rule 10: illustrationRes = 0)
    Exercise(
        id = "u28_s2_p1_q5",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Apa yang Anda dengar?",
        targetTranslation = "Adik perempuan bernyanyi dengan sangat merdu.",
        targetHanzi = "妹妹 唱歌 唱 得 很 好听。",
        targetPinyin = "Mèimei chànggē chàng de hěn hǎotīng.",
        wordChips = listOf("妹妹:mèimei", "唱歌:chànggē", "唱:chàng", "得:de", "很:hěn", "好听。:hǎotīng.", "快:kuài"),
        correctAnswer = "妹妹,唱歌,唱,得,很,好听。",
        illustrationRes = 0,
        audioToSpeak = "妹妹唱歌唱得很好听。"
    )""",
            f"""    // 6. Soal 6: Pilihan Kalimat
    Exercise(
        id = "u28_s2_p1_q6",
        type = ExerciseType.SENTENCE_CHOICE,
        title = "Pilih terjemahan yang benar",
        targetHanzi = "他 汉语 讲 得 很 流利。",
        targetPinyin = "Tā Hànyǔ jiǎng de hěn liúlì.",
        targetTranslation = "Dia berbicara bahasa Mandarin dengan sangat lancar.",
        correctAnswer = "Tā Hànyǔ jiǎng de hěn liúlì.\\n他 汉语 讲 得 很 流利。",
        options = listOf(
            "Tā Hànyǔ jiǎng de hěn liúlì.\\n他 汉语 讲 得 很 流利。",
            "Tā Hànyǔ jiǎng de bù liúlì.\\n他 汉语 讲 得 不 流利。",
            "Wǒ Hànyǔ jiǎng de hěn liúlì.\\n我 汉语 讲 得 很 流利。"
        ),
        audioToSpeak = "他汉语讲得很流利。"
    )""",
            f"""    // 7. Soal 7: Pilihan Gambar (写得好 -> menulis dengan elok)
    Exercise(
        id = "u28_s2_p1_q7",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "写得好",
        targetPinyin = "xiě de hǎo",
        targetTranslation = "menulis dengan baik",
        correctAnswer = "menulis dengan baik",
        audioToSpeak = "写得好",
        pictureOptions = listOf(
            PictureOption("u28_s2_p1_opt7_1", "derajat baik", "", R.drawable.ic_gram_degree_speedometer, true),
            PictureOption("u28_s2_p1_opt7_2", "berlari", "", R.drawable.ic_gram_manner_running, false),
            PictureOption("u28_s2_p1_opt7_3", "podium", "", R.drawable.ic_gram_superlative_podium, false),
            PictureOption("u28_s2_p1_opt7_4", "timbangan", "", R.drawable.ic_gram_compare_scale, false)
        )
    )""",
            f"""    // 8. Soal 8: Ketik Pinyin (menulis dengan baik -> xiěde)
    Exercise(
        id = "u28_s2_p1_q8",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "menulis dengan baik",
        sentenceWithBlank = "写的 (________)",
        targetHanzi = "写的",
        targetPinyin = "xiěde",
        correctAnswer = "xiede",
        keyboardKeys = {k2_p1_q8},
        audioToSpeak = "写的"
    )""",
            f"""    // 9. Soal 9: Susun Kalimat (Ibu memasak dengan sangat lezat.)
    Exercise(
        id = "u28_s2_p1_q9",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Ibu memasak dengan sangat lezat.",
        targetHanzi = "妈妈 做饭 做 得 很 好吃。",
        targetPinyin = "Māma zuòfàn zuò de hěn hǎochī.",
        wordChips = listOf("妈妈:māma", "做饭:zuòfàn", "做:zuò", "得:de", "很:hěn", "好吃。:hǎochī.", "难吃:nánchī"),
        correctAnswer = "妈妈,做饭,做,得,很,好吃。",
        audioToSpeak = "妈妈做饭做得很好吃。"
    )""",
            f"""    // 10. Soal 10: Ketuk Pasangan yang Sesuai (Rangkuman Komplemen Derajat)
    Exercise(
        id = "u28_s2_p1_m10",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u28_s2_p1_m10_1", "做得好", "zuò de hǎo", "buat dengan bagus"),
            MatchPairItem("u28_s2_p1_m2", "睡得香", "shuì de xiāng", "tidur lelap"),
            MatchPairItem("u28_s2_p1_m3", "走得慢", "zǒu de màn", "jalan lambat"),
            MatchPairItem("u28_s2_p1_m4", "玩得开心", "wán de kāixīn", "main gembira")
        )
    )"""
        ],
        "p2": [
            f"""    // 1. Soal 1: Pilihan Gambar (地 -> partikel penanda cara adverbial)
    Exercise(
        id = "u28_s2_p2_q1",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "地",
        targetPinyin = "de",
        targetTranslation = "partikel adverbial cara",
        correctAnswer = "partikel adverbial cara",
        audioToSpeak = "地",
        pictureOptions = listOf(
            PictureOption("u28_s2_p2_opt1", "cara bertindak", "", R.drawable.ic_gram_manner_running, true),
            PictureOption("u28_s2_p2_opt2", "kecepatan", "", R.drawable.ic_gram_degree_speedometer, false),
            PictureOption("u28_s2_p2_opt3", "timbangan", "", R.drawable.ic_gram_compare_scale, false),
            PictureOption("u28_s2_p2_opt4", "podium", "", R.drawable.ic_gram_superlative_podium, false)
        )
    )""",
            f"""    // 2. Soal 2: Susun Kalimat (Para murid mendengarkan penjelasan guru dengan sungguh-sungguh.)
    Exercise(
        id = "u28_s2_p2_q2",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Siswa mendengarkan guru dengan sungguh-sungguh.",
        targetHanzi = "同学们 认真 地 听课。",
        targetPinyin = "Tóngxuémen rènzhēn de tīngkè.",
        wordChips = listOf("同学们:tóngxuémen", "认真:rènzhēn", "地:de", "听课。:tīngkè.", "玩:wán"),
        correctAnswer = "同学们,认真,地,听课。",
        audioToSpeak = "同学们认真地听课。"
    )""",
            f"""    // 3. Soal 3: Ketuk Pasangan yang Sesuai (Partikel Cara 地)
    Exercise(
        id = "u28_s2_p2_m3",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u28_s2_p2_m1", "慢慢地", "mànmàn de", "dengan perlahan"),
            MatchPairItem("u28_s2_p2_m2", "飞快地", "fēikuài de", "dengan melesat"),
            MatchPairItem("u28_s2_p2_m3", "高兴地", "gāoxìng de", "dengan gembira"),
            MatchPairItem("u28_s2_p2_m4", "认真地", "rènzhēn de", "dengan sungguh-sungguh")
        )
    )""",
            f"""    // 4. Soal 4: Ketik Pinyin (berlari dengan kencang -> pǎode)
    Exercise(
        id = "u28_s2_p2_q4",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "berlari kencang",
        sentenceWithBlank = "跑的 (________)",
        targetHanzi = "跑的",
        targetPinyin = "pǎode",
        correctAnswer = "paode",
        keyboardKeys = {k2_p2_q4},
        audioToSpeak = "跑的"
    )""",
            f"""    // 5. Soal 5: Mendengar Kalimat (Rule 10: illustrationRes = 0)
    Exercise(
        id = "u28_s2_p2_q5",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Apa yang Anda dengar?",
        targetTranslation = "Kakek berjalan dengan perlahan-lahan.",
        targetHanzi = "爷爷 慢慢 地 走。",
        targetPinyin = "Yéye mànmàn de zǒu.",
        wordChips = listOf("爷爷:yéye", "慢慢:mànmàn", "地:de", "走。:zǒu.", "快:kuài"),
        correctAnswer = "爷爷,慢慢,地,走。",
        illustrationRes = 0,
        audioToSpeak = "爷爷慢慢地走。"
    )""",
            f"""    // 6. Soal 6: Pilihan Kalimat
    Exercise(
        id = "u28_s2_p2_q6",
        type = ExerciseType.SENTENCE_CHOICE,
        title = "Pilih terjemahan yang benar",
        targetHanzi = "他 高兴 地 笑 了 起来。",
        targetPinyin = "Tā gāoxìng de xiào le qǐlai.",
        targetTranslation = "Dia mulai tertawa dengan gembira.",
        correctAnswer = "Tā gāoxìng de xiào le qǐlai.\\n他 高兴 地 笑 了 起来。",
        options = listOf(
            "Tā gāoxìng de xiào le qǐlai.\\n他 高兴 地 笑 了 起来。",
            "Tā shāngxīn de kū le qǐlai.\\n他 伤心 地 哭 了 起来。",
            "Wǒ gāoxìng de xiào le qǐlai.\\n我 高兴 地 笑 了 起来。"
        ),
        audioToSpeak = "他高兴地笑了起来。"
    )""",
            f"""    // 7. Soal 7: Pilihan Gambar (慢慢地 -> berjalan perlahan)
    Exercise(
        id = "u28_s2_p2_q7",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "慢慢地",
        targetPinyin = "mànmàn de",
        targetTranslation = "dengan perlahan",
        correctAnswer = "dengan perlahan",
        audioToSpeak = "慢慢地",
        pictureOptions = listOf(
            PictureOption("u28_s2_p2_opt7_1", "perlahan", "", R.drawable.ic_gram_manner_running, true),
            PictureOption("u28_s2_p2_opt7_2", "podium", "", R.drawable.ic_gram_superlative_podium, false),
            PictureOption("u28_s2_p2_opt7_3", "skala", "", R.drawable.ic_gram_compare_scale, false),
            PictureOption("u28_s2_p2_opt7_4", "kecepatan", "", R.drawable.ic_gram_degree_speedometer, false)
        )
    )""",
            f"""    // 8. Soal 8: Ketik Pinyin (pelan-pelan -> mànmande)
    Exercise(
        id = "u28_s2_p2_q8",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "dengan pelan",
        sentenceWithBlank = "慢的 (________)",
        targetHanzi = "慢的",
        targetPinyin = "mànde",
        correctAnswer = "mande",
        keyboardKeys = {k2_p2_q8},
        audioToSpeak = "慢的"
    )""",
            f"""    // 9. Soal 9: Susun Kalimat (Anak kecil bernyanyi dengan sangat gembira.)
    Exercise(
        id = "u28_s2_p2_q9",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Anak kecil menyanyi dengan gembira.",
        targetHanzi = "小孩儿 快乐 地 唱歌。",
        targetPinyin = "Xiǎoháiér kuàilè de chànggē.",
        wordChips = listOf("小孩儿:xiǎoháiér", "快乐:kuàilè", "地:de", "唱歌。:chànggē.", "哭:kū"),
        correctAnswer = "小孩儿,快乐,地,唱歌。",
        audioToSpeak = "小孩儿快乐地唱歌。"
    )""",
            f"""    // 10. Soal 10: Ketuk Pasangan yang Sesuai (Rangkuman Cara & Sikap)
    Exercise(
        id = "u28_s2_p2_m10",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u28_s2_p2_m10_1", "认真地", "rènzhēn de", "sungguh-sungguh"),
            MatchPairItem("u28_s2_p2_m10_2", "慢慢地", "mànmàn de", "pelan-pelan"),
            MatchPairItem("u28_s2_p2_m3", "快乐地", "kuàilè de", "dengan riang"),
            MatchPairItem("u28_s2_p2_m4", "高声地", "gāoshēng de", "dengan lantang")
        )
    )"""
        ]
    }

    # =========================================================================
    # STAGE 3: Demonstratif Derajat & Ragam Cara (那么, 那样, 这么, 这样)
    # =========================================================================
    k3_p1_q4 = make_keys("zheme")
    k3_p1_q8 = make_keys("zheyang")
    k3_p2_q4 = make_keys("name")
    k3_p2_q8 = make_keys("nayang")
    
    stages[3] = {
        "p1": [
            f"""    // 1. Soal 1: Pilihan Gambar (这么 -> sebegitu / begini)
    Exercise(
        id = "u28_s3_p1_q1",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "这么",
        targetPinyin = "zhème",
        targetTranslation = "sebegitu / begini",
        correctAnswer = "sebegitu / begini",
        audioToSpeak = "这么",
        pictureOptions = listOf(
            PictureOption("u28_s3_p1_opt1", "sebegini", "", R.drawable.ic_gram_manner_so_much, true),
            PictureOption("u28_s3_p1_opt2", "waktu", "", R.drawable.ic_gram_timeline_future, false),
            PictureOption("u28_s3_p1_opt3", "skala", "", R.drawable.ic_gram_compare_scale, false),
            PictureOption("u28_s3_p1_opt4", "podium", "", R.drawable.ic_gram_superlative_podium, false)
        )
    )""",
            f"""    // 2. Soal 2: Susun Kalimat (Pakaian ini bagaimana bisa semurah ini?)
    Exercise(
        id = "u28_s3_p1_q2",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Baju ini kenapa begitu murah?",
        targetHanzi = "这件 衣服 怎么 这么 便宜？",
        targetPinyin = "Zhè jiàn yīfu zěnme zhème piányi?",
        wordChips = listOf("这件:zhè jiàn", "衣服:yīfu", "怎么:zěnme", "这么:zhème", "便宜？:piányi.", "贵:guì"),
        correctAnswer = "这件,衣服,怎么,这么,便宜？",
        audioToSpeak = "这件衣服怎么这么便宜？"
    )""",
            f"""    // 3. Soal 3: Ketuk Pasangan yang Sesuai (Sebegini & Begini)
    Exercise(
        id = "u28_s3_p1_q3",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u28_s3_p1_m1", "这么", "zhème", "sebegini / begitu"),
            MatchPairItem("u28_s3_p1_m2", "这样", "zhèyàng", "seperti ini / begini"),
            MatchPairItem("u28_s3_p1_m3", "这么好", "zhème hǎo", "sebegitu baik"),
            MatchPairItem("u28_s3_p1_m4", "这样做", "zhèyàng zuò", "berbuat begini")
        )
    )""",
            f"""    // 4. Soal 4: Ketik Pinyin (sebegini -> zhème)
    Exercise(
        id = "u28_s3_p1_q4",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "sebegini / begini",
        sentenceWithBlank = "这么 (________)",
        targetHanzi = "这么",
        targetPinyin = "zhème",
        correctAnswer = "zheme",
        keyboardKeys = {k3_p1_q4},
        audioToSpeak = "这么"
    )""",
            f"""    // 5. Soal 5: Mendengar Kalimat (Rule 10: illustrationRes = 0)
    Exercise(
        id = "u28_s3_p1_q5",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Apa yang Anda dengar?",
        targetTranslation = "Melakukan dengan cara begini baru tepat.",
        targetHanzi = "这样 做 才能 学好 汉语。",
        targetPinyin = "Zhèyàng zuò cáinéng xuéhǎo Hànyǔ.",
        wordChips = listOf("这样:zhèyàng", "做:zuò", "才能:cáinéng", "学好:xuéhǎo", "汉语。:Hànyǔ.", "那样:nàyàng"),
        correctAnswer = "这样,做,才能,学好,汉语。",
        illustrationRes = 0,
        audioToSpeak = "这样做才能学好汉语。"
    )""",
            f"""    // 6. Soal 6: Pilihan Kalimat
    Exercise(
        id = "u28_s3_p1_q6",
        type = ExerciseType.SENTENCE_CHOICE,
        title = "Pilih terjemahan yang benar",
        targetHanzi = "你怎么 走 得 这么 慢？",
        targetPinyin = "Nǐ zěnme zǒu de zhème màn?",
        targetTranslation = "Kenapa kamu berjalan begitu lambat?",
        correctAnswer = "Nǐ zěnme zǒu de zhème màn?\\n你怎么 走 得 这么 慢？",
        options = listOf(
            "Nǐ zěnme zǒu de zhème màn?\\n你怎么 走 得 这么 慢？",
            "Nǐ zěnme zǒu de zhème kuài?\\n你怎么 走 得 这么 快？",
            "Tā zěnme zǒu de zhème màn?\\n他 怎么 走 得 这么 慢？"
        ),
        audioToSpeak = "你怎么走得这么慢？"
    )""",
            f"""    // 7. Soal 7: Pilihan Gambar (这样 -> cara seperti ini)
    Exercise(
        id = "u28_s3_p1_q7",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "这样",
        targetPinyin = "zhèyàng",
        targetTranslation = "seperti ini",
        correctAnswer = "seperti ini",
        audioToSpeak = "这样",
        pictureOptions = listOf(
            PictureOption("u28_s3_p1_opt7_1", "seperti ini", "", R.drawable.ic_gram_manner_running, true),
            PictureOption("u28_s3_p1_opt7_2", "begitu banyak", "", R.drawable.ic_gram_manner_so_much, false),
            PictureOption("u28_s3_p1_opt7_3", "kecepatan", "", R.drawable.ic_gram_degree_speedometer, false),
            PictureOption("u28_s3_p1_opt7_4", "waktu", "", R.drawable.ic_gram_timeline_future, false)
        )
    )""",
            f"""    // 8. Soal 8: Ketik Pinyin (seperti ini -> zhèyàng)
    Exercise(
        id = "u28_s3_p1_q8",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "seperti ini / begini",
        sentenceWithBlank = "这样 (________)",
        targetHanzi = "这样",
        targetPinyin = "zhèyàng",
        correctAnswer = "zheyang",
        keyboardKeys = {k3_p1_q8},
        audioToSpeak = "这样"
    )""",
            f"""    // 9. Soal 9: Susun Kalimat (Kenapa kamu begitu bahagia hari ini?)
    Exercise(
        id = "u28_s3_p1_q9",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Kamu kenapa begitu bahagia?",
        targetHanzi = "你 怎么 这么 高兴？",
        targetPinyin = "Nǐ zěnme zhème gāoxìng?",
        wordChips = listOf("你:nǐ", "怎么:zěnme", "这么:zhème", "高兴？:gāoxìng.", "累:lèi"),
        correctAnswer = "你,怎么,这么,高兴？",
        audioToSpeak = "你怎么这么高兴？"
    )""",
            f"""    // 10. Soal 10: Ketuk Pasangan yang Sesuai (Rangkuman Cara Ini)
    Exercise(
        id = "u28_s3_p1_m10",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u28_s3_p1_m10_1", "这么", "zhème", "sebegini"),
            MatchPairItem("u28_s3_p1_m10_2", "这样", "zhèyàng", "seperti ini"),
            MatchPairItem("u28_s3_p1_m10_3", "这么快", "zhème kuài", "secepat ini"),
            MatchPairItem("u28_s3_p1_m10_4", "这样说", "zhèyàng shuō", "bicara begini")
        )
    )"""
        ],
        "p2": [
            f"""    // 1. Soal 1: Pilihan Gambar (那么 -> sebegitu / kalau begitu)
    Exercise(
        id = "u28_s3_p2_q1",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "那么",
        targetPinyin = "nàme",
        targetTranslation = "sebegitu / kalau begitu",
        correctAnswer = "sebegitu / kalau begitu",
        audioToSpeak = "那么",
        pictureOptions = listOf(
            PictureOption("u28_s3_p2_opt1", "sebegitu", "", R.drawable.ic_gram_manner_so_much, true),
            PictureOption("u28_s3_p2_opt2", "waktu", "", R.drawable.ic_gram_timeline_future, false),
            PictureOption("u28_s3_p2_opt3", "kecepatan", "", R.drawable.ic_gram_degree_speedometer, false),
            PictureOption("u28_s3_p2_opt4", "skala", "", R.drawable.ic_gram_compare_scale, false)
        )
    )""",
            f"""    // 2. Soal 2: Susun Kalimat (Cuaca sebegini bagus, mari kita ke taman jalan santai.)
    Exercise(
        id = "u28_s3_p2_q2",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Cuaca begitu bagus, ayo ke taman.",
        targetHanzi = "天气 那么 好， 去 公园 吧。",
        targetPinyin = "Tiānqì nàme hǎo, qù gōngyuán ba.",
        wordChips = listOf("天气:tiānqì", "那么:nàme", "好，:hǎo,", "去:qù", "公园:gōngyuán", "吧。:ba.", "家里:jiālǐ"),
        correctAnswer = "天气,那么,好，,去,公园,吧。",
        audioToSpeak = "天气那么好，去公园吧。"
    )""",
            f"""    // 3. Soal 3: Ketuk Pasangan yang Sesuai (Sebegitu & Begitu)
    Exercise(
        id = "u28_s3_p2_m3",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u28_s3_p2_m1", "那么", "nàme", "sebegitu / begitu"),
            MatchPairItem("u28_s3_p2_m2", "那样", "nàyàng", "seperti itu"),
            MatchPairItem("u28_s3_p2_m3", "那么好", "nàme hǎo", "sebegitu baik"),
            MatchPairItem("u28_s3_p2_m4", "那样做", "nàyàng zuò", "berbuat begitu")
        )
    )""",
            f"""    // 4. Soal 4: Ketik Pinyin (sebegitu -> nàme)
    Exercise(
        id = "u28_s3_p2_q4",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "sebegitu / kalau begitu",
        sentenceWithBlank = "那么 (________)",
        targetHanzi = "那么",
        targetPinyin = "nàme",
        correctAnswer = "name",
        keyboardKeys = {k3_p2_q4},
        audioToSpeak = "那么"
    )""",
            f"""    // 5. Soal 5: Mendengar Kalimat (Rule 10: illustrationRes = 0)
    Exercise(
        id = "u28_s3_p2_q5",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Apa yang Anda dengar?",
        targetTranslation = "Anda tidak usah berbuat seperti itu.",
        targetHanzi = "你 不 用 那样 做。",
        targetPinyin = "Nǐ bú yòng nàyàng zuò.",
        wordChips = listOf("你:nǐ", "不:bú", "用:yòng", "那样:nàyàng", "做。:zuò.", "想:xiǎng"),
        correctAnswer = "你,不,用,那样,做。",
        illustrationRes = 0,
        audioToSpeak = "你不用那样做。"
    )""",
            f"""    // 6. Soal 6: Pilihan Kalimat
    Exercise(
        id = "u28_s3_p2_q6",
        type = ExerciseType.SENTENCE_CHOICE,
        title = "Pilih terjemahan yang benar",
        targetHanzi = "那 里 为什么 那么 多 人？",
        targetPinyin = "Nàlǐ wèishénme nàme duō rén?",
        targetTranslation = "Mengapa di sana ada begitu banyak orang?",
        correctAnswer = "Nàlǐ wèishénme nàme duō rén?\\n那 里 为什么 那么 多 人？",
        options = listOf(
            "Nàlǐ wèishénme nàme duō rén?\\n那 里 为什么 那么 多 人？",
            "Zhèlǐ wèishénme zhème duō rén?\\n这里 为什么 这么 多 人？",
            "Nàlǐ wèishénme méiyǒu rén?\\n那 里 为什么 没有 人？"
        ),
        audioToSpeak = "那里为什么那么多人？"
    )""",
            f"""    // 7. Soal 7: Pilihan Gambar (那样 -> seperti itu)
    Exercise(
        id = "u28_s3_p2_q7",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "那样",
        targetPinyin = "nàyàng",
        targetTranslation = "seperti itu",
        correctAnswer = "seperti itu",
        audioToSpeak = "那样",
        pictureOptions = listOf(
            PictureOption("u28_s3_p2_opt7_1", "seperti itu", "", R.drawable.ic_gram_manner_running, true),
            PictureOption("u28_s3_p2_opt7_2", "begitu banyak", "", R.drawable.ic_gram_manner_so_much, false),
            PictureOption("u28_s3_p2_opt7_3", "derajat", "", R.drawable.ic_gram_degree_speedometer, false),
            PictureOption("u28_s3_p2_opt7_4", "waktu", "", R.drawable.ic_gram_timeline_future, false)
        )
    )""",
            f"""    // 8. Soal 8: Ketik Pinyin (seperti itu -> nàyàng)
    Exercise(
        id = "u28_s3_p2_q8",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "seperti itu / begitu",
        sentenceWithBlank = "那样 (________)",
        targetHanzi = "那样",
        targetPinyin = "nàyàng",
        correctAnswer = "nayang",
        keyboardKeys = {k3_p2_q8},
        audioToSpeak = "那样"
    )""",
            f"""    // 9. Soal 9: Susun Kalimat (Kalau begitu kita berangkat sekarang.)
    Exercise(
        id = "u28_s3_p2_q9",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Kalau begitu kita sekarang jalan.",
        targetHanzi = "那么 我们 现在 走 吧。",
        targetPinyin = "Nàme wǒmen xiànzài zǒu ba.",
        wordChips = listOf("那么:nàme", "我们:wǒmen", "现在:xiànzài", "走:zǒu", "吧。:ba.", "等:děng"),
        correctAnswer = "那么,我们,现在,走,吧。",
        audioToSpeak = "那么我们现在走吧。"
    )""",
            f"""    // 10. Soal 10: Ketuk Pasangan yang Sesuai (Rangkuman Derajat Jauh)
    Exercise(
        id = "u28_s3_p2_m10",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u28_s3_p2_m10_1", "那么", "nàme", "sebegitu"),
            MatchPairItem("u28_s3_p2_m10_2", "那样", "nàyàng", "seperti itu"),
            MatchPairItem("u28_s3_p2_m10_3", "那么远", "nàme yuǎn", "sebegitu jauh"),
            MatchPairItem("u28_s3_p2_m10_4", "那样想", "nàyàng xiǎng", "berpikir begitu")
        )
    )"""
        ]
    }

    # =========================================================================
    # STAGE 4: Frekuensi Rutinitas & Durasi Sejenak (经常, 有时, 一会儿)
    # =========================================================================
    k4_p1_q4 = make_keys("jingchang")
    k4_p1_q8 = make_keys("youshi")
    k4_p2_q4 = make_keys("yihuier")
    k4_p2_q8 = make_keys("shijian")
    
    stages[4] = {
        "p1": [
            f"""    // 1. Soal 1: Pilihan Gambar (经常 -> sering / kerap kali)
    Exercise(
        id = "u28_s4_p1_q1",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "经常",
        targetPinyin = "jīngcháng",
        targetTranslation = "sering / kerap kali",
        correctAnswer = "sering / kerap kali",
        audioToSpeak = "经常",
        pictureOptions = listOf(
            PictureOption("u28_s4_p1_opt1", "sering", "", R.drawable.ic_gram_manner_so_much, true),
            PictureOption("u28_s4_p1_opt2", "waktu masa depan", "", R.drawable.ic_gram_timeline_future, false),
            PictureOption("u28_s4_p1_opt3", "derajat", "", R.drawable.ic_gram_degree_speedometer, false),
            PictureOption("u28_s4_p1_opt4", "skala", "", R.drawable.ic_gram_compare_scale, false)
        )
    )""",
            f"""    // 2. Soal 2: Susun Kalimat (Akhir pekan saya sering pergi ke perpustakaan membaca buku.)
    Exercise(
        id = "u28_s4_p1_q2",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Akhir pekan saya sering ke perpustakaan.",
        targetHanzi = "周末 我 经常 去 图书馆。",
        targetPinyin = "Zhōumò wǒ jīngcháng qù túshūguǎn.",
        wordChips = listOf("周末:zhōumò", "我:wǒ", "经常:jīngcháng", "去:qù", "图书馆。:túshūguǎn.", "不:bù"),
        correctAnswer = "周末,我,经常,去,图书馆。",
        audioToSpeak = "周末我经常去图书馆。"
    )""",
            f"""    // 3. Soal 3: Ketuk Pasangan yang Sesuai (Sering & Terkadang)
    Exercise(
        id = "u28_s4_p1_q3",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u28_s4_p1_m1", "经常", "jīngcháng", "sering"),
            MatchPairItem("u28_s4_p1_m2", "有时", "yǒushí", "kadang-kadang"),
            MatchPairItem("u28_s4_p1_m3", "看书", "kànshū", "baca buku"),
            MatchPairItem("u28_s4_p1_m4", "不常", "bù cháng", "jarang")
        )
    )""",
            f"""    // 4. Soal 4: Ketik Pinyin (sering -> jīngcháng)
    Exercise(
        id = "u28_s4_p1_q4",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "sering / kerap kali",
        sentenceWithBlank = "经常 (________)",
        targetHanzi = "经常",
        targetPinyin = "jīngcháng",
        correctAnswer = "jingchang",
        keyboardKeys = {k4_p1_q4},
        audioToSpeak = "经常"
    )""",
            f"""    // 5. Soal 5: Mendengar Kalimat (Rule 10: illustrationRes = 0)
    Exercise(
        id = "u28_s4_p1_q5",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Apa yang Anda dengar?",
        targetTranslation = "Dia kadang-kadang jogging, kadang-kadang berenang.",
        targetHanzi = "他 有时 跑步， 有时 游泳。",
        targetPinyin = "Tā yǒushí pǎobù, yǒushí yóuyǒng.",
        wordChips = listOf("他:tā", "有时:yǒushí", "跑步，:pǎobù,", "有时:yǒushí", "游泳。:yóuyǒng.", "睡觉:shuìjiào"),
        correctAnswer = "他,有时,跑步，,有时,游泳。",
        illustrationRes = 0,
        audioToSpeak = "他有时跑步，有时游泳。"
    )""",
            f"""    // 6. Soal 6: Pilihan Kalimat
    Exercise(
        id = "u28_s4_p1_q6",
        type = ExerciseType.SENTENCE_CHOICE,
        title = "Pilih terjemahan yang benar",
        targetHanzi = "我 经常 和 同学 练习 口语。",
        targetPinyin = "Wǒ jīngcháng hé tóngxué liànxí kǒuyǔ.",
        targetTranslation = "Saya sering berlatih percakapan bersama teman sekelas.",
        correctAnswer = "Wǒ jīngcháng hé tóngxué liànxí kǒuyǔ.\\n我 经常 和 同学 练习 口语。",
        options = listOf(
            "Wǒ jīngcháng hé tóngxué liànxí kǒuyǔ.\\n我 经常 和 同学 练习 口语。",
            "Wǒ bù cháng hé tóngxué liànxí kǒuyǔ.\\n我 不 常 和 同学 练习 口语。",
            "Tā jīngcháng hé lǎoshī liànxí kǒuyǔ.\\n他 经常 和 老师 练习 口语。"
        ),
        audioToSpeak = "我经常和同学练习口语。"
    )""",
            f"""    // 7. Soal 7: Pilihan Gambar (有时 -> terkadang kadang-kadang)
    Exercise(
        id = "u28_s4_p1_q7",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "有时",
        targetPinyin = "yǒushí",
        targetTranslation = "terkadang / kadang-kadang",
        correctAnswer = "terkadang / kadang-kadang",
        audioToSpeak = "有时",
        pictureOptions = listOf(
            PictureOption("u28_s4_p1_opt7_1", "kadang-kadang", "", R.drawable.ic_gram_manner_so_much, true),
            PictureOption("u28_s4_p1_opt7_2", "waktu", "", R.drawable.ic_gram_timeline_future, false),
            PictureOption("u28_s4_p1_opt7_3", "kecepatan", "", R.drawable.ic_gram_degree_speedometer, false),
            PictureOption("u28_s4_p1_opt7_4", "skala", "", R.drawable.ic_gram_compare_scale, false)
        )
    )""",
            f"""    // 8. Soal 8: Ketik Pinyin (kadang-kadang -> yǒushí)
    Exercise(
        id = "u28_s4_p1_q8",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "kadang-kadang / terkadang",
        sentenceWithBlank = "有时 (________)",
        targetHanzi = "有时",
        targetPinyin = "yǒushí",
        correctAnswer = "youshi",
        keyboardKeys = {k4_p1_q8},
        audioToSpeak = "有时"
    )""",
            f"""    // 9. Soal 9: Susun Kalimat (Ibu sering memasak masakan lezat untuk kami.)
    Exercise(
        id = "u28_s4_p1_q9",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Ibu sering memasak untuk kami.",
        targetHanzi = "妈妈 经常 做 好吃 的。",
        targetPinyin = "Māma jīngcháng zuò hǎochī de.",
        wordChips = listOf("妈妈:māma", "经常:jīngcháng", "做:zuò", "好吃:hǎochī", "的。:de.", "不:bù"),
        correctAnswer = "妈妈,经常,做,好吃,的。",
        audioToSpeak = "妈妈经常做好吃的。"
    )""",
            f"""    // 10. Soal 10: Ketuk Pasangan yang Sesuai (Rangkuman Frekuensi)
    Exercise(
        id = "u28_s4_p1_m10",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u28_s4_p1_m10_1", "经常", "jīngcháng", "kerap kali"),
            MatchPairItem("u28_s4_p1_m10_2", "有时", "yǒushí", "sewaktu-waktu"),
            MatchPairItem("u28_s4_p1_m3", "练口语", "liàn kǒuyǔ", "latihan bicara"),
            MatchPairItem("u28_s4_p1_m4", "去超市", "qù chāoshì", "ke supermarket")
        )
    )"""
        ],
        "p2": [
            f"""    // 1. Soal 1: Pilihan Gambar (一会儿 -> sebentar / sejenak)
    Exercise(
        id = "u28_s4_p2_q1",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "一会儿",
        targetPinyin = "yíhuìér",
        targetTranslation = "sebentar / sejenak",
        correctAnswer = "sebentar / sejenak",
        audioToSpeak = "一会儿",
        pictureOptions = listOf(
            PictureOption("u28_s4_p2_opt1", "sebentar", "", R.drawable.ic_gram_timeline_future, true),
            PictureOption("u28_s4_p2_opt2", "sering", "", R.drawable.ic_gram_manner_so_much, false),
            PictureOption("u28_s4_p2_opt3", "derajat", "", R.drawable.ic_gram_degree_speedometer, false),
            PictureOption("u28_s4_p2_opt4", "skala", "", R.drawable.ic_gram_compare_scale, false)
        )
    )""",
            f"""    // 2. Soal 2: Susun Kalimat (Tolong kamu menunggu saya sebentar di depan pintu.)
    Exercise(
        id = "u28_s4_p2_q2",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Tolong tunggu saya sebentar di pintu.",
        targetHanzi = "请 在 门口 等 我 一会儿。",
        targetPinyin = "Qǐng zài ménkǒu děng wǒ yíhuìér.",
        wordChips = listOf("请:qǐng", "在:zài", "门口:ménkǒu", "等:děng", "我:wǒ", "一会儿。:yíhuìér.", "去:qù"),
        correctAnswer = "请,在,门口,等,我,一会儿。",
        audioToSpeak = "请在门口等我一会儿。"
    )""",
            f"""    // 3. Soal 3: Ketuk Pasangan yang Sesuai (Sebentar & Istirahat)
    Exercise(
        id = "u28_s4_p2_m3",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u28_s4_p2_m1", "一会儿", "yíhuìér", "sejenak / sebentar"),
            MatchPairItem("u28_s4_p2_m2", "睡一会儿", "shuì yíhuìér", "tidur sebentar"),
            MatchPairItem("u28_s4_p2_m3", "等一会儿", "děng yíhuìér", "tunggu sebentar"),
            MatchPairItem("u28_s4_p2_m4", "看一会儿", "kàn yíhuìér", "lihat sebentar")
        )
    )""",
            f"""    // 4. Soal 4: Ketik Pinyin (sebentar -> yíhuìér)
    Exercise(
        id = "u28_s4_p2_q4",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "sebentar / sejenak",
        sentenceWithBlank = "一会儿 (________)",
        targetHanzi = "一会儿",
        targetPinyin = "yíhuìér",
        correctAnswer = "yihuier",
        keyboardKeys = {k4_p2_q4},
        audioToSpeak = "一会儿"
    )""",
            f"""    // 5. Soal 5: Mendengar Kalimat (Rule 10: illustrationRes = 0)
    Exercise(
        id = "u28_s4_p2_q5",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Apa yang Anda dengar?",
        targetTranslation = "Saya ingin istirahat berbaring sebentar.",
        targetHanzi = "我 想 躺 一会儿 休息。",
        targetPinyin = "Wǒ xiǎng tǎng yíhuìér xiūxi.",
        wordChips = listOf("我:wǒ", "想:xiǎng", "躺:tǎng", "一会儿:yíhuìér", "休息。:xiūxi.", "工作:gōngzuò"),
        correctAnswer = "我,想,躺,一会儿,休息。",
        illustrationRes = 0,
        audioToSpeak = "我想躺一会儿休息。"
    )""",
            f"""    // 6. Soal 6: Pilihan Kalimat
    Exercise(
        id = "u28_s4_p2_q6",
        type = ExerciseType.SENTENCE_CHOICE,
        title = "Pilih terjemahan yang benar",
        targetHanzi = "他 一会儿 哭， 一会儿 笑。",
        targetPinyin = "Tā yíhuìér kū, yíhuìér xiào.",
        targetTranslation = "Dia sebentar menangis, sebentar tertawa.",
        correctAnswer = "Tā yíhuìér kū, yíhuìér xiào.\\n他 一会儿 哭， 一会儿 笑。",
        options = listOf(
            "Tā yíhuìér kū, yíhuìér xiào.\\n他 一会儿 哭， 一会儿 笑。",
            "Tā yízhí zài xiào.\\n他 一直 在 笑。",
            "Tā yízhí zài kū.\\n他 一直 在 哭。"
        ),
        audioToSpeak = "他一会儿哭，一会儿笑。"
    )""",
            f"""    // 7. Soal 7: Pilihan Gambar (等一会儿 -> tunggu sejenak)
    Exercise(
        id = "u28_s4_p2_q7",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "等一会儿",
        targetPinyin = "děng yíhuìér",
        targetTranslation = "tunggu sebentar",
        correctAnswer = "tunggu sebentar",
        audioToSpeak = "等一会儿",
        pictureOptions = listOf(
            PictureOption("u28_s4_p2_opt7_1", "sebentar", "", R.drawable.ic_gram_timeline_future, true),
            PictureOption("u28_s4_p2_opt7_2", "sering", "", R.drawable.ic_gram_manner_so_much, false),
            PictureOption("u28_s4_p2_opt7_3", "derajat", "", R.drawable.ic_gram_degree_speedometer, false),
            PictureOption("u28_s4_p2_opt7_4", "skala", "", R.drawable.ic_gram_compare_scale, false)
        )
    )""",
            f"""    // 8. Soal 8: Ketik Pinyin (waktu -> shíjiān)
    Exercise(
        id = "u28_s4_p2_q8",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "waktu",
        sentenceWithBlank = "时间 (________)",
        targetHanzi = "时间",
        targetPinyin = "shíjiān",
        correctAnswer = "shijian",
        keyboardKeys = {k4_p2_q8},
        audioToSpeak = "时间"
    )""",
            f"""    // 9. Soal 9: Susun Kalimat (Tunggu saya sebentar, saya segera datang.)
    Exercise(
        id = "u28_s4_p2_q9",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Tunggu saya sebentar, saya segera datang.",
        targetHanzi = "等 我 一会儿， 我 马上 来。",
        targetPinyin = "Děng wǒ yíhuìér, wǒ mǎshàng lái.",
        wordChips = listOf("等:děng", "我:wǒ", "一会儿，:yíhuìér,", "我:wǒ", "马上:mǎshàng", "来。:lái.", "走:zǒu"),
        correctAnswer = "等,我,一会儿，,我,马上,来。",
        audioToSpeak = "等我一会儿，我马上来。"
    )""",
            f"""    // 10. Soal 10: Ketuk Pasangan yang Sesuai (Rangkuman Durasi Singkat)
    Exercise(
        id = "u28_s4_p2_m10",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u28_s4_p2_m10_1", "一会儿", "yíhuìér", "sekejap"),
            MatchPairItem("u28_s4_p2_m10_2", "马上来", "mǎshàng lái", "segera datang"),
            MatchPairItem("u28_s4_p2_m3", "等一下", "děng yíxià", "tunggu dulu"),
            MatchPairItem("u28_s4_p2_m4", "睡一会儿", "shuì yíhuìér", "rebah sejenak")
        )
    )"""
        ]
    }

    # =========================================================================
    # STAGE 5: Aspek Waktu Progresif & Sudah Terjadi (已经, 快要, 正, Evaluasi)
    # =========================================================================
    k5_p1_q4 = make_keys("yijing")
    k5_p1_q8 = make_keys("kuaiyao")
    k5_p2_q4 = make_keys("zheng")
    k5_p2_q8 = make_keys("kaishi")
    
    stages[5] = {
        "p1": [
            f"""    // 1. Soal 1: Pilihan Gambar (已经 -> sudah / telah)
    Exercise(
        id = "u28_s5_p1_q1",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "已经",
        targetPinyin = "yǐjīng",
        targetTranslation = "sudah / telah",
        correctAnswer = "sudah / telah",
        audioToSpeak = "已经",
        pictureOptions = listOf(
            PictureOption("u28_s5_p1_opt1", "sudah", "", R.drawable.ic_gram_timeline_future, true),
            PictureOption("u28_s5_p1_opt2", "kecepatan", "", R.drawable.ic_gram_degree_speedometer, false),
            PictureOption("u28_s5_p1_opt3", "skala", "", R.drawable.ic_gram_compare_scale, false),
            PictureOption("u28_s5_p1_opt4", "podium", "", R.drawable.ic_gram_superlative_podium, false)
        )
    )""",
            f"""    // 2. Soal 2: Susun Kalimat (Film sudah dimulai, lekaslah masuk ke dalam bioskop.)
    Exercise(
        id = "u28_s5_p1_q2",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Film sudah mulai, cepat masuk.",
        targetHanzi = "电影 已经 开始 了， 快 进去。",
        targetPinyin = "Diànyǐng yǐjīng kāishǐ le, kuài jìnqù.",
        wordChips = listOf("电影:diànyǐng", "已经:yǐjīng", "开始:kāishǐ", "了，:le,", "快:kuài", "进去。:jìnqù.", "出来:chūlái"),
        correctAnswer = "电影,已经,开始,了，,快,进去。",
        audioToSpeak = "电影已经开始了，快进去。"
    )""",
            f"""    // 3. Soal 3: Ketuk Pasangan yang Sesuai (Sudah & Sebentar Lagi)
    Exercise(
        id = "u28_s5_p1_m3",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u28_s5_p1_m1", "已经", "yǐjīng", "sudah"),
            MatchPairItem("u28_s5_p1_m2", "快要", "kuàiyào", "sebentar lagi akan"),
            MatchPairItem("u28_s5_p1_m3", "已经走", "yǐjīng zǒu", "sudah pergi"),
            MatchPairItem("u28_s5_p1_m4", "快要开", "kuàiyào kāi", "segera berangkat")
        )
    )""",
            f"""    // 4. Soal 4: Ketik Pinyin (sudah -> yǐjīng)
    Exercise(
        id = "u28_s5_p1_q4",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "sudah / telah",
        sentenceWithBlank = "已经 (________)",
        targetHanzi = "已经",
        targetPinyin = "yǐjīng",
        correctAnswer = "yijing",
        keyboardKeys = {k5_p1_q4},
        audioToSpeak = "已经"
    )""",
            f"""    // 5. Soal 5: Mendengar Kalimat (Rule 10: illustrationRes = 0)
    Exercise(
        id = "u28_s5_p1_q5",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Apa yang Anda dengar?",
        targetTranslation = "Kereta api sebentar lagi akan berangkat, semua lekas naik ke kereta.",
        targetHanzi = "火车 快要 开 了， 快 上车。",
        targetPinyin = "Huǒchē kuàiyào kāi le, kuài shàngchē.",
        wordChips = listOf("火车:huǒchē", "快要:kuàiyào", "开:kāi", "了，:le,", "快:kuài", "上车。:shàngchē.", "下车:xiàchē"),
        correctAnswer = "火车,快要,开,了，,快,上车。",
        illustrationRes = 0,
        audioToSpeak = "火车快要开了，快上车。"
    )""",
            f"""    // 6. Soal 6: Pilihan Kalimat
    Exercise(
        id = "u28_s5_p1_q6",
        type = ExerciseType.SENTENCE_CHOICE,
        title = "Pilih terjemahan yang benar",
        targetHanzi = "天 快要 下雨 了， 我们 回家 吧。",
        targetPinyin = "Tiān kuàiyào xiàyǔ le, wǒmen huíjiā ba.",
        targetTranslation = "Hari sebentar lagi akan turun hujan, ayo kita pulang ke rumah.",
        correctAnswer = "Tiān kuàiyào xiàyǔ le, wǒmen huíjiā ba.\\n天 快要 下雨 了， 我们 回家 吧。",
        options = listOf(
            "Tiān kuàiyào xiàyǔ le, wǒmen huíjiā ba.\\n天 快要 下雨 了， 我们 回家 吧。",
            "Tiān yǐjīng xiàyǔ le, wǒmen bié huíjiā.\\n天 已经 下雨 了， 我们 别 回家。",
            "Tiān qíng le, wǒmen chūqù ba.\\n天 晴 了， 我们 出去 吧。"
        ),
        audioToSpeak = "天快要下雨了，我们回家吧。"
    )""",
            f"""    // 7. Soal 7: Pilihan Gambar (快要 -> sebentar lagi akan)
    Exercise(
        id = "u28_s5_p1_q7",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "快要",
        targetPinyin = "kuàiyào",
        targetTranslation = "sebentar lagi",
        correctAnswer = "sebentar lagi",
        audioToSpeak = "快要",
        pictureOptions = listOf(
            PictureOption("u28_s5_p1_opt7_1", "sebentar lagi", "", R.drawable.ic_gram_timeline_future, true),
            PictureOption("u28_s5_p1_opt7_2", "sering", "", R.drawable.ic_gram_manner_so_much, false),
            PictureOption("u28_s5_p1_opt7_3", "derajat", "", R.drawable.ic_gram_degree_speedometer, false),
            PictureOption("u28_s5_p1_opt7_4", "skala", "", R.drawable.ic_gram_compare_scale, false)
        )
    )""",
            f"""    // 8. Soal 8: Ketik Pinyin (sebentar lagi akan -> kuàiyào)
    Exercise(
        id = "u28_s5_p1_q8",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "sebentar lagi akan",
        sentenceWithBlank = "快要 (________)",
        targetHanzi = "快要",
        targetPinyin = "kuàiyào",
        correctAnswer = "kuaiyao",
        keyboardKeys = {k5_p1_q8},
        audioToSpeak = "快要"
    )""",
            f"""    // 9. Soal 9: Susun Kalimat (Saya sudah selesai makan nasi.)
    Exercise(
        id = "u28_s5_p1_q9",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Saya sudah selesai makan.",
        targetHanzi = "我 已经 吃 完 饭 了。",
        targetPinyin = "Wǒ yǐjīng chī wán fàn le.",
        wordChips = listOf("我:wǒ", "已经:yǐjīng", "吃:chī", "完:wán", "饭:fàn", "了。:le.", "没:méi"),
        correctAnswer = "我,已经,吃,完,饭,了。",
        audioToSpeak = "我已经吃完饭了。"
    )""",
            f"""    // 10. Soal 10: Ketuk Pasangan yang Sesuai (Rangkuman Waktu Lampau & Prospektif)
    Exercise(
        id = "u28_s5_p1_m10",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u28_s5_p1_m10_1", "已经", "yǐjīng", "telah"),
            MatchPairItem("u28_s5_p1_m10_2", "快要", "kuàiyào", "hampir akan"),
            MatchPairItem("u28_s5_p1_m3", "吃完了", "chī wán le", "sudah habis makan"),
            MatchPairItem("u28_s5_p1_m4", "快到了", "kuài dào le", "segera tiba")
        )
    )"""
        ],
        "p2": [
            f"""    // 1. Soal 1: Pilihan Gambar (正 -> sedang / tepat saat)
    Exercise(
        id = "u28_s5_p2_q1",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "正",
        targetPinyin = "zhèng",
        targetTranslation = "sedang / tepat",
        correctAnswer = "sedang / tepat",
        audioToSpeak = "正",
        pictureOptions = listOf(
            PictureOption("u28_s5_p2_opt1", "sedang berlangsung", "", R.drawable.ic_gram_timeline_future, true),
            PictureOption("u28_s5_p2_opt2", "kecepatan", "", R.drawable.ic_gram_degree_speedometer, false),
            PictureOption("u28_s5_p2_opt3", "timbangan", "", R.drawable.ic_gram_compare_scale, false),
            PictureOption("u28_s5_p2_opt4", "podium", "", R.drawable.ic_gram_superlative_podium, false)
        )
    )""",
            f"""    // 2. Soal 2: Susun Kalimat (Saya tepat sedang berniat menelepon kepadamu.)
    Exercise(
        id = "u28_s5_p2_q2",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Saya pas mau meneleponmu.",
        targetHanzi = "我 正 想 打 电话 给 你。",
        targetPinyin = "Wǒ zhèng xiǎng dǎ diànhuà gěi nǐ.",
        wordChips = listOf("我:wǒ", "正:zhèng", "想:xiǎng", "打:dǎ", "电话:diànhuà", "给:gěi", "你。:nǐ.", "去:qù"),
        correctAnswer = "我,正,想,打,电话,给,你。",
        audioToSpeak = "我正想打电话给你。"
    )""",
            f"""    // 3. Soal 3: Ketuk Pasangan yang Sesuai (Grand Sintesis Bab 28)
    Exercise(
        id = "u28_s5_p2_m3",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u28_s5_p2_m1", "比", "bǐ", "daripada"),
            MatchPairItem("u28_s5_p2_m2", "最", "zuì", "paling"),
            MatchPairItem("u28_s5_p2_m3", "已经", "yǐjīng", "sudah"),
            MatchPairItem("u28_s5_p2_m4", "正", "zhèng", "sedang / pas")
        )
    )""",
            f"""    // 4. Soal 4: Ketik Pinyin (sedang/tepat -> zhèng)
    Exercise(
        id = "u28_s5_p2_q4",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "sedang / tepat",
        sentenceWithBlank = "正 (________)",
        targetHanzi = "正",
        targetPinyin = "zhèng",
        correctAnswer = "zheng",
        keyboardKeys = {k5_p2_q4},
        audioToSpeak = "正"
    )""",
            f"""    // 5. Soal 5: Mendengar Kalimat (Rule 10: illustrationRes = 0)
    Exercise(
        id = "u28_s5_p2_q5",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Apa yang Anda dengar?",
        targetTranslation = "Di luar tepat sedang turun salju.",
        targetHanzi = "外面 正 下 着 雪 呢。",
        targetPinyin = "Wàimiàn zhèng xià zhe xuě ne.",
        wordChips = listOf("外面:wàimiàn", "正:zhèng", "下:xià", "着:zhe", "雪:xuě", "呢。:ne.", "雨:yǔ"),
        correctAnswer = "外面,正,下,着,雪,呢。",
        illustrationRes = 0,
        audioToSpeak = "外面正下着雪呢。"
    )""",
            f"""    // 6. Soal 6: Pilihan Kalimat
    Exercise(
        id = "u28_s5_p2_q6",
        type = ExerciseType.SENTENCE_CHOICE,
        title = "Pilih terjemahan yang benar",
        targetHanzi = "他 正 在 房间 听 音乐 呢。",
        targetPinyin = "Tā zhèng zài fángjiān tīng yīnyuè ne.",
        targetTranslation = "Dia tepat sedang mendengarkan musik di dalam kamar.",
        correctAnswer = "Tā zhèng zài fángjiān tīng yīnyuè ne.\\n他 正 在 房间 听 音乐 呢。",
        options = listOf(
            "Tā zhèng zài fángjiān tīng yīnyuè ne.\\n他 正 在 房间 听 音乐 呢。",
            "Tā yǐjīng shuìjiào le.\\n他 已经 睡觉 了。",
            "Wǒ zhèng zài fángjiān tīng yīnyuè ne.\\n我 正 在 房间 听 音乐 呢。"
        ),
        audioToSpeak = "他正在房间听音乐呢。"
    )""",
            f"""    // 7. Soal 7: Pilihan Gambar (已经 -> sudah selesai)
    Exercise(
        id = "u28_s5_p2_q7",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "已经",
        targetPinyin = "yǐjīng",
        targetTranslation = "sudah",
        correctAnswer = "sudah",
        audioToSpeak = "已经",
        pictureOptions = listOf(
            PictureOption("u28_s5_p2_opt7_1", "sudah", "", R.drawable.ic_gram_timeline_future, true),
            PictureOption("u28_s5_p2_opt7_2", "kecepatan", "", R.drawable.ic_gram_degree_speedometer, false),
            PictureOption("u28_s5_p2_opt7_3", "timbangan", "", R.drawable.ic_gram_compare_scale, false),
            PictureOption("u28_s5_p2_opt7_4", "podium", "", R.drawable.ic_gram_superlative_podium, false)
        )
    )""",
            f"""    // 8. Soal 8: Ketik Pinyin (sudah -> yǐjīng)
    Exercise(
        id = "u28_s5_p2_q8",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "sudah",
        sentenceWithBlank = "已经 (________)",
        targetHanzi = "已经",
        targetPinyin = "yǐjīng",
        correctAnswer = "yijing",
        keyboardKeys = {k5_p1_q4},
        audioToSpeak = "已经"
    )""",
            f"""    // 9. Soal 9: Susun Kalimat (Dia lebih tinggi dibanding saya.)
    Exercise(
        id = "u28_s5_p2_q9",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Dia lebih tinggi dari saya.",
        targetHanzi = "他 比 我 高。",
        targetPinyin = "Tā bǐ wǒ gāo.",
        wordChips = listOf("他:tā", "比:bǐ", "我:wǒ", "高。:gāo.", "矮:ǎi"),
        correctAnswer = "他,比,我,高。",
        audioToSpeak = "他比我高。"
    )""",
            f"""    // 10. Soal 10: Ketuk Pasangan yang Sesuai (Grand Review Final Bab 28)
    Exercise(
        id = "u28_s5_p2_m10",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u28_s5_p2_m10_1", "比我高", "bǐ wǒ gāo", "lebih tinggi"),
            MatchPairItem("u28_s5_p2_m10_2", "最好看", "zuì hǎokàn", "paling elok"),
            MatchPairItem("u28_s5_p2_m10_3", "走得快", "zǒu de kuài", "jalan cepat"),
            MatchPairItem("u28_s5_p2_m10_4", "快到了", "kuài dào le", "hampir sampai")
        )
    )"""
        ]
    }

    for s_idx in range(1, 6):
        filename = f"{base_dir}/Bab28Stage{s_idx}Data.kt"
        p1_code = ",\n\n".join(stages[s_idx]["p1"])
        p2_code = ",\n\n".join(stages[s_idx]["p2"])
        
        content = f"""package com.example.chineselearning.data.repository

import com.example.chineselearning.R
import com.example.chineselearning.data.model.Exercise
import com.example.chineselearning.data.model.ExerciseType
import com.example.chineselearning.data.model.MatchPairItem
import com.example.chineselearning.data.model.PictureOption

val bab28Stage{s_idx}Part1Exercises = listOf(
{p1_code}
)

val bab28Stage{s_idx}Part2Exercises = listOf(
{p2_code}
)
"""
        with open(filename, "w", encoding="utf-8") as f:
            f.write(content)
        print(f"Written {filename}")

if __name__ == "__main__":
    generate_bab28()
