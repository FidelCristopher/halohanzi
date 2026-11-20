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

def generate_bab30():
    base_dir = "app/src/main/java/com/example/chineselearning/data/repository"
    
    stages = {}
    
    # =========================================================================
    # STAGE 1: Bilangan Puluhan Ribu & Hitungan Finansial (万, 商场)
    # =========================================================================
    k1_p1_q4 = make_keys("wan")
    k1_p1_q8 = make_keys("shangchang")
    k1_p2_q4 = make_keys("yiwan")
    k1_p2_q8 = make_keys("liangwan")
    
    stages[1] = {
        "p1": [
            f"""    // 1. Soal 1: Pilihan Gambar (万 -> sepuluh ribu / 10.000)
    Exercise(
        id = "u30_s1_p1_q1",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "万",
        targetPinyin = "wàn",
        targetTranslation = "sepuluh ribu (10.000)",
        correctAnswer = "sepuluh ribu (10.000)",
        audioToSpeak = "万",
        pictureOptions = listOf(
            PictureOption("u30_s1_p1_opt1", "sepuluh ribu", "", R.drawable.ic_fin_ten_thousand, true),
            PictureOption("u30_s1_p1_opt2", "pusat belanja", "", R.drawable.ic_shop_mall_plaza, false),
            PictureOption("u30_s1_p1_opt3", "pekan", "", R.drawable.ic_cal_week_cycle, false),
            PictureOption("u30_s1_p1_opt4", "trofi", "", R.drawable.ic_eval_mastery_trophy, false)
        )
    )""",
            f"""    // 2. Soal 2: Susun Kalimat (Sepeda motor baru ini seharga sepuluh ribu yuan.)
    Exercise(
        id = "u30_s1_p1_q2",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Motor baru ini sepuluh ribu yuan.",
        targetHanzi = "这辆 新车 要 一万 块 钱。",
        targetPinyin = "Zhè liàng xīnchē yào yíwàn kuài qián.",
        wordChips = listOf("这辆:zhè liàng", "新车:xīnchē", "要:yào", "一万:yíwàn", "块:kuài", "钱。:qián.", "千:qiān"),
        correctAnswer = "这辆,新车,要,一万,块,钱。",
        audioToSpeak = "这辆新车要一万块钱。"
    )""",
            f"""    // 3. Soal 3: Ketuk Pasangan yang Sesuai (Puluhan Ribu & Mall)
    Exercise(
        id = "u30_s1_p1_q3",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u30_s1_p1_m1", "万", "wàn", "sepuluh ribu (10.000)"),
            MatchPairItem("u30_s1_p1_m2", "商场", "shāngchǎng", "mall / pusat belanja"),
            MatchPairItem("u30_s1_p1_m3", "一万块", "yíwàn kuài", "sepuluh ribu yuan"),
            MatchPairItem("u30_s1_p1_m4", "大商场", "dà shāngchǎng", "mall besar")
        )
    )""",
            f"""    // 4. Soal 4: Ketik Pinyin (sepuluh ribu -> wàn)
    Exercise(
        id = "u30_s1_p1_q4",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "sepuluh ribu (10.000)",
        sentenceWithBlank = "万 (________)",
        targetHanzi = "万",
        targetPinyin = "wàn",
        correctAnswer = "wan",
        keyboardKeys = {k1_p1_q4},
        audioToSpeak = "万"
    )""",
            f"""    // 5. Soal 5: Mendengar Kalimat (Rule 10: illustrationRes = 0)
    Exercise(
        id = "u30_s1_p1_q5",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Apa yang Anda dengar?",
        targetTranslation = "Akhir pekan banyak orang pergi ke mall besar berbelanja.",
        targetHanzi = "周末 很多 人 去 大 商场 购物。",
        targetPinyin = "Zhōumò hěn duō rén qù dà shāngchǎng gòuwù.",
        wordChips = listOf("周末:zhōumò", "很多:hěn duō", "人:rén", "去:qù", "大:dà", "商场:shāngchǎng", "购物。:gòuwù.", "学校:xuéxiào"),
        correctAnswer = "周末,很多,人,去,大,商场,购物。",
        illustrationRes = 0,
        audioToSpeak = "周末很多人去大商场购物。"
    )""",
            f"""    // 6. Soal 6: Pilihan Kalimat
    Exercise(
        id = "u30_s1_p1_q6",
        type = ExerciseType.SENTENCE_CHOICE,
        title = "Pilih terjemahan yang benar",
        targetHanzi = "这个 城市 有 两万 个 学生。",
        targetPinyin = "Zhège chéngshì yǒu liǎngwàn gè xuéshēng.",
        targetTranslation = "Kota ini memiliki dua puluh ribu orang siswa.",
        correctAnswer = "Zhège chéngshì yǒu liǎngwàn gè xuéshēng.\\n这个 城市 有 两万 个 学生。",
        options = listOf(
            "Zhège chéngshì yǒu liǎngwàn gè xuéshēng.\\n这个 城市 有 两万 个 学生。",
            "Zhège chéngshì yǒu yíwàn gè xuéshēng.\\n这个 城市 有 一万 个 学生。",
            "Zhè suǒ xuéxiào yǒu liǎngwàn gè xuéshēng.\\n这 所 学校 有 两万 个 学生。"
        ),
        audioToSpeak = "这个城市有两万个学生。"
    )""",
            f"""    // 7. Soal 7: Pilihan Gambar (商场 -> mall pusat belanja)
    Exercise(
        id = "u30_s1_p1_q7",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "商场",
        targetPinyin = "shāngchǎng",
        targetTranslation = "pusat perbelanjaan / mall",
        correctAnswer = "pusat perbelanjaan / mall",
        audioToSpeak = "商场",
        pictureOptions = listOf(
            PictureOption("u30_s1_p1_opt7_1", "mall", "", R.drawable.ic_shop_mall_plaza, true),
            PictureOption("u30_s1_p1_opt7_2", "sepuluh ribu", "", R.drawable.ic_fin_ten_thousand, false),
            PictureOption("u30_s1_p1_opt7_3", "pekan", "", R.drawable.ic_cal_week_cycle, false),
            PictureOption("u30_s1_p1_opt7_4", "cerah", "", R.drawable.ic_weather_sunny_clear, false)
        )
    )""",
            f"""    // 8. Soal 8: Ketik Pinyin (mall -> shāngchǎng)
    Exercise(
        id = "u30_s1_p1_q8",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "pusat perbelanjaan / mall",
        sentenceWithBlank = "商场 (________)",
        targetHanzi = "商场",
        targetPinyin = "shāngchǎng",
        correctAnswer = "shangchang",
        keyboardKeys = {k1_p1_q8},
        audioToSpeak = "商场"
    )""",
            f"""    // 9. Soal 9: Susun Kalimat (Hari ini saya berjalan dua puluh ribu langkah.)
    Exercise(
        id = "u30_s1_p1_q9",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Hari ini saya jalan 20.000 langkah.",
        targetHanzi = "今天 我 走 了 两万 步。",
        targetPinyin = "Jīntiān wǒ zǒu le liǎngwàn bù.",
        wordChips = listOf("今天:jīntiān", "我:wǒ", "走:zǒu", "了:le", "两万:liǎngwàn", "步。:bù.", "一万:yíwàn"),
        correctAnswer = "今天,我,走,了,两万,步。",
        audioToSpeak = "今天我走了两万步。"
    )""",
            f"""    // 10. Soal 10: Ketuk Pasangan yang Sesuai (Rangkuman Hitungan Sepuluh Ribu)
    Exercise(
        id = "u30_s1_p1_m10",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u30_s1_p1_m10_1", "万", "wàn", "sepuluh ribu"),
            MatchPairItem("u30_s1_p1_m10_2", "两万", "liǎngwàn", "dua puluh ribu"),
            MatchPairItem("u30_s1_p1_m10_3", "大商场", "dà shāngchǎng", "mall megah"),
            MatchPairItem("u30_s1_p1_m10_4", "买东西", "mǎi dōngxi", "belanja barang")
        )
    )"""
        ],
        "p2": [
            f"""    // 1. Soal 1: Pilihan Gambar (商场 -> mall belanja)
    Exercise(
        id = "u30_s1_p2_q1",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "商场",
        targetPinyin = "shāngchǎng",
        targetTranslation = "mall",
        correctAnswer = "mall",
        audioToSpeak = "商场",
        pictureOptions = listOf(
            PictureOption("u30_s1_p2_opt1", "mall", "", R.drawable.ic_shop_mall_plaza, true),
            PictureOption("u30_s1_p2_opt2", "uang 10.000", "", R.drawable.ic_fin_ten_thousand, false),
            PictureOption("u30_s1_p2_opt3", "pekan", "", R.drawable.ic_cal_week_cycle, false),
            PictureOption("u30_s1_p2_opt4", "piala", "", R.drawable.ic_eval_mastery_trophy, false)
        )
    )""",
            f"""    // 2. Soal 2: Susun Kalimat (Di dalam mall ada banyak restoran.)
    Exercise(
        id = "u30_s1_p2_q2",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Di dalam mall ada banyak restoran.",
        targetHanzi = "商场 里 有 很多 饭馆。",
        targetPinyin = "Shāngchǎng lǐ yǒu hěn duō fànguǎn.",
        wordChips = listOf("商场:shāngchǎng", "里:lǐ", "有:yǒu", "很多:hěn duō", "饭馆。:fànguǎn.", "学校:xuéxiào"),
        correctAnswer = "商场,里,有,很多,饭馆。",
        audioToSpeak = "商场里有很多饭馆。"
    )""",
            f"""    // 3. Soal 3: Ketuk Pasangan yang Sesuai (Angka Besar & Toko)
    Exercise(
        id = "u30_s1_p2_m3",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u30_s1_p2_m1", "一万", "yíwàn", "10.000"),
            MatchPairItem("u30_s1_p2_m2", "商场里", "shāngchǎng lǐ", "di dalam mall"),
            MatchPairItem("u30_s1_p2_m3", "两万块", "liǎngwàn kuài", "20.000 yuan"),
            MatchPairItem("u30_s1_p2_m4", "很多饭馆", "hěn duō fànguǎn", "banyak restoran")
        )
    )""",
            f"""    // 4. Soal 4: Ketik Pinyin (sepuluh ribu -> yíwàn)
    Exercise(
        id = "u30_s1_p2_q4",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "sepuluh ribu",
        sentenceWithBlank = "一万 (________)",
        targetHanzi = "一万",
        targetPinyin = "yíwàn",
        correctAnswer = "yiwan",
        keyboardKeys = {k1_p2_q4},
        audioToSpeak = "一万"
    )""",
            f"""    // 5. Soal 5: Mendengar Kalimat (Rule 10: illustrationRes = 0)
    Exercise(
        id = "u30_s1_p2_q5",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Apa yang Anda dengar?",
        targetTranslation = "Saya ingin pergi ke mall membeli baju.",
        targetHanzi = "我 想 去 商场 买 衣服。",
        targetPinyin = "Wǒ xiǎng qù shāngchǎng mǎi yīfu.",
        wordChips = listOf("我:wǒ", "想:xiǎng", "去:qù", "商场:shāngchǎng", "买:mǎi", "衣服。:yīfu.", "卖:mài"),
        correctAnswer = "我,想,去,商场,买,衣服。",
        illustrationRes = 0,
        audioToSpeak = "我想去商场买衣服。"
    )""",
            f"""    // 6. Soal 6: Pilihan Kalimat
    Exercise(
        id = "u30_s1_p2_q6",
        type = ExerciseType.SENTENCE_CHOICE,
        title = "Pilih terjemahan yang benar",
        targetHanzi = "那 部 手机 要 一万 块 钱。",
        targetPinyin = "Nà bù shǒujī yào yíwàn kuài qián.",
        targetTranslation = "Ponsel itu harganya sepuluh ribu yuan.",
        correctAnswer = "Nà bù shǒujī yào yíwàn kuài qián.\\n那 部 手机 要 一万 块 钱。",
        options = listOf(
            "Nà bù shǒujī yào yíwàn kuài qián.\\n那 部 手机 要 一万 块 钱。",
            "Nà bù shǒujī yào liǎngwàn kuài qián.\\n那 部 手机 要 两万 块 钱。",
            "Zhè bù shǒujī yào yíwàn kuài qián.\\n这 部 手机 要 一万 块 钱。"
        ),
        audioToSpeak = "那部手机要一万块钱。"
    )""",
            f"""    // 7. Soal 7: Pilihan Gambar (万 -> 10.000)
    Exercise(
        id = "u30_s1_p2_q7",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "万",
        targetPinyin = "wàn",
        targetTranslation = "10.000",
        correctAnswer = "10.000",
        audioToSpeak = "万",
        pictureOptions = listOf(
            PictureOption("u30_s1_p2_opt7_1", "10.000", "", R.drawable.ic_fin_ten_thousand, true),
            PictureOption("u30_s1_p2_opt7_2", "mall", "", R.drawable.ic_shop_mall_plaza, false),
            PictureOption("u30_s1_p2_opt7_3", "pekan", "", R.drawable.ic_cal_week_cycle, false),
            PictureOption("u30_s1_p2_opt7_4", "cerah", "", R.drawable.ic_weather_sunny_clear, false)
        )
    )""",
            f"""    // 8. Soal 8: Ketik Pinyin (dua puluh ribu -> liǎngwàn)
    Exercise(
        id = "u30_s1_p2_q8",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "dua puluh ribu",
        sentenceWithBlank = "两万 (________)",
        targetHanzi = "两万",
        targetPinyin = "liǎngwàn",
        correctAnswer = "liangwan",
        keyboardKeys = {k1_p2_q8},
        audioToSpeak = "两万"
    )""",
            f"""    // 9. Soal 9: Susun Kalimat (Mall ini buka pada pukul sembilan pagi.)
    Exercise(
        id = "u30_s1_p2_q9",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Mall buka jam sembilan pagi.",
        targetHanzi = "商场 早上 九点 开门。",
        targetPinyin = "Shāngchǎng zǎoshang jiǔdiǎn kāimén.",
        wordChips = listOf("商场:shāngchǎng", "早上:zǎoshang", "九点:jiǔdiǎn", "开门。:kāimén.", "关门:guānmén"),
        correctAnswer = "商场,早上,九点,开门。",
        audioToSpeak = "商场早上九点开门。"
    )""",
            f"""    // 10. Soal 10: Ketuk Pasangan yang Sesuai (Rangkuman Mall & Finansial)
    Exercise(
        id = "u30_s1_p2_m10",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u30_s1_p2_m10_1", "商场开门", "shāngchǎng kāimén", "mall buka"),
            MatchPairItem("u30_s1_p2_m10_2", "一万块", "yíwàn kuài", "10 ribu yuan"),
            MatchPairItem("u30_s1_p2_m10_3", "买新衣服", "mǎi xīn yīfu", "beli baju baru"),
            MatchPairItem("u30_s1_p2_m10_4", "太贵了", "tài guì le", "kemahalan")
        )
    )"""
        ]
    }

    # =========================================================================
    # STAGE 2: Satuan Pekan & Dinamika Cuaca Langit (周, 晴, 阴)
    # =========================================================================
    k2_p1_q4 = make_keys("zhou")
    k2_p1_q8 = make_keys("qing")
    k2_p2_q4 = make_keys("yin")
    k2_p2_q8 = make_keys("xiazhou")
    
    stages[2] = {
        "p1": [
            f"""    // 1. Soal 1: Pilihan Gambar (周 -> minggu / pekan)
    Exercise(
        id = "u30_s2_p1_q1",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "周",
        targetPinyin = "zhōu",
        targetTranslation = "minggu / pekan",
        correctAnswer = "minggu / pekan",
        audioToSpeak = "周",
        pictureOptions = listOf(
            PictureOption("u30_s2_p1_opt1", "pekan", "", R.drawable.ic_cal_week_cycle, true),
            PictureOption("u30_s2_p1_opt2", "cerah", "", R.drawable.ic_weather_sunny_clear, false),
            PictureOption("u30_s2_p1_opt3", "mendung", "", R.drawable.ic_weather_overcast_cloud, false),
            PictureOption("u30_s2_p1_opt4", "mall", "", R.drawable.ic_shop_mall_plaza, false)
        )
    )""",
            f"""    // 2. Soal 2: Susun Kalimat (Pekan depan kita akan mengadakan lomba karakter Hanzi.)
    Exercise(
        id = "u30_s2_p1_q2",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Pekan depan kita ada lomba Hanzi.",
        targetHanzi = "下周 我们 有 汉字 比赛。",
        targetPinyin = "Xiàzhōu wǒmen yǒu Hànzì bǐsài.",
        wordChips = listOf("下周:xiàzhōu", "我们:wǒmen", "有:yǒu", "汉字:Hànzì", "比赛。:bǐsài.", "考试:kǎoshì"),
        correctAnswer = "下周,我们,有,汉字,比赛。",
        audioToSpeak = "下周我们有汉字比赛。"
    )""",
            f"""    // 3. Soal 3: Ketuk Pasangan yang Sesuai (Pekan & Langit Cerah)
    Exercise(
        id = "u30_s2_p1_q3",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u30_s2_p1_m1", "周", "zhōu", "minggu / pekan"),
            MatchPairItem("u30_s2_p1_m2", "晴", "qíng", "cerah"),
            MatchPairItem("u30_s2_p1_m3", "晴天", "qíngtiān", "hari cerah"),
            MatchPairItem("u30_s2_p1_m4", "下周", "xiàzhōu", "minggu depan")
        )
    )""",
            f"""    // 4. Soal 4: Ketik Pinyin (minggu/pekan -> zhōu)
    Exercise(
        id = "u30_s2_p1_q4",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "minggu / pekan",
        sentenceWithBlank = "周 (________)",
        targetHanzi = "周",
        targetPinyin = "zhōu",
        correctAnswer = "zhou",
        keyboardKeys = {k2_p1_q4},
        audioToSpeak = "周"
    )""",
            f"""    // 5. Soal 5: Mendengar Kalimat (Rule 10: illustrationRes = 0)
    Exercise(
        id = "u30_s2_p1_q5",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Apa yang Anda dengar?",
        targetTranslation = "Hari ini adalah hari yang cerah, matahari sangat terik.",
        targetHanzi = "今天 是 个 晴天， 太阳 大。",
        targetPinyin = "Jīntiān shì gè qíngtiān, tàiyáng dà.",
        wordChips = listOf("今天:jīntiān", "是:shì", "个:gè", "晴天，:qíngtiān,", "太阳:tàiyáng", "大。:dà.", "阴天:yīntiān"),
        correctAnswer = "今天,是,个,晴天，,太阳,大。",
        illustrationRes = 0,
        audioToSpeak = "今天是个晴天，太阳大。"
    )""",
            f"""    // 6. Soal 6: Pilihan Kalimat
    Exercise(
        id = "u30_s2_p1_q6",
        type = ExerciseType.SENTENCE_CHOICE,
        title = "Pilih terjemahan yang benar",
        targetHanzi = "这 周 我 非常 忙。",
        targetPinyin = "Zhè zhōu wǒ fēicháng máng.",
        targetTranslation = "Pekan ini saya sangat sibuk.",
        correctAnswer = "Zhè zhōu wǒ fēicháng máng.\\n这 周 我 非常 忙。",
        options = listOf(
            "Zhè zhōu wǒ fēicháng máng.\\n这 周 我 非常 忙。",
            "Xià zhōu wǒ fēicháng máng.\\n下 周 我 非常 忙。",
            "Zhè zhōu wǒ fēicháng qīngsōng.\\n这 周 我 非常 轻松。"
        ),
        audioToSpeak = "这周我非常忙。"
    )""",
            f"""    // 7. Soal 7: Pilihan Gambar (晴 -> langit cerah bersinar)
    Exercise(
        id = "u30_s2_p1_q7",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "晴",
        targetPinyin = "qíng",
        targetTranslation = "cerah",
        correctAnswer = "cerah",
        audioToSpeak = "晴",
        pictureOptions = listOf(
            PictureOption("u30_s2_p1_opt7_1", "cerah", "", R.drawable.ic_weather_sunny_clear, true),
            PictureOption("u30_s2_p1_opt7_2", "mendung", "", R.drawable.ic_weather_overcast_cloud, false),
            PictureOption("u30_s2_p1_opt7_3", "pekan", "", R.drawable.ic_cal_week_cycle, false),
            PictureOption("u30_s2_p1_opt7_4", "mall", "", R.drawable.ic_shop_mall_plaza, false)
        )
    )""",
            f"""    // 8. Soal 8: Ketik Pinyin (cerah -> qíng)
    Exercise(
        id = "u30_s2_p1_q8",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "cerah",
        sentenceWithBlank = "晴 (________)",
        targetHanzi = "晴",
        targetPinyin = "qíng",
        correctAnswer = "qing",
        keyboardKeys = {k2_p1_q8},
        audioToSpeak = "晴"
    )""",
            f"""    // 9. Soal 9: Susun Kalimat (Hari cerah kita pergi ke taman bermain bola.)
    Exercise(
        id = "u30_s2_p1_q9",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Hari cerah kita ke taman main bola.",
        targetHanzi = "晴天 我们 去 踢球。",
        targetPinyin = "Qíngtiān wǒmen qù tīqiú.",
        wordChips = listOf("晴天:qíngtiān", "我们:wǒmen", "去:qù", "踢球。:tīqiú.", "阴天:yīntiān"),
        correctAnswer = "晴天,我们,去,踢球。",
        audioToSpeak = "晴天我们去踢球。"
    )""",
            f"""    // 10. Soal 10: Ketuk Pasangan yang Sesuai (Rangkuman Pekan & Cerah)
    Exercise(
        id = "u30_s2_p1_m10",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u30_s2_p1_m10_1", "周", "zhōu", "pekan"),
            MatchPairItem("u30_s2_p1_m10_2", "晴", "qíng", "cuaca cerah"),
            MatchPairItem("u30_s2_p1_m10_3", "大太阳", "dà tàiyáng", "mentari terik"),
            MatchPairItem("u30_s2_p1_m10_4", "踢足球", "tī zúqiú", "sepak bola")
        )
    )"""
        ],
        "p2": [
            f"""    // 1. Soal 1: Pilihan Gambar (阴 -> mendung / berawan)
    Exercise(
        id = "u30_s2_p2_q1",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "阴",
        targetPinyin = "yīn",
        targetTranslation = "mendung / berawan",
        correctAnswer = "mendung / berawan",
        audioToSpeak = "阴",
        pictureOptions = listOf(
            PictureOption("u30_s2_p2_opt1", "mendung", "", R.drawable.ic_weather_overcast_cloud, true),
            PictureOption("u30_s2_p2_opt2", "cerah", "", R.drawable.ic_weather_sunny_clear, false),
            PictureOption("u30_s2_p2_opt3", "pekan", "", R.drawable.ic_cal_week_cycle, false),
            PictureOption("u30_s2_p2_opt4", "trofi", "", R.drawable.ic_eval_mastery_trophy, false)
        )
    )""",
            f"""    // 2. Soal 2: Susun Kalimat (Hari ini cuaca sangat mendung, sepertinya akan turun hujan.)
    Exercise(
        id = "u30_s2_p2_q2",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Hari ini mendung, sepertinya mau hujan.",
        targetHanzi = "今天 天 阴， 要 下雨 了。",
        targetPinyin = "Jīntiān tiān yīn, yào xiàyǔ le.",
        wordChips = listOf("今天:jīntiān", "天:tiān", "阴，:yīn,", "要:yào", "下雨:xiàyǔ", "了。:le.", "晴:qíng"),
        correctAnswer = "今天,天,阴，,要,下雨,了。",
        audioToSpeak = "今天天阴，要下雨了。"
    )""",
            f"""    // 3. Soal 3: Ketuk Pasangan yang Sesuai (Cuaca Mendung & Kalender Pekan)
    Exercise(
        id = "u30_s2_p2_m3",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u30_s2_p2_m1", "阴", "yīn", "mendung"),
            MatchPairItem("u30_s2_p2_m2", "阴天", "yīntiān", "hari mendung"),
            MatchPairItem("u30_s2_p2_m3", "下周五", "xiàzhōuwǔ", "Jumat depan"),
            MatchPairItem("u30_s2_p2_m4", "要下雨", "yào xiàyǔ", "akan hujan")
        )
    )""",
            f"""    // 4. Soal 4: Ketik Pinyin (mendung -> yīn)
    Exercise(
        id = "u30_s2_p2_q4",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "mendung / berawan",
        sentenceWithBlank = "阴 (________)",
        targetHanzi = "阴",
        targetPinyin = "yīn",
        correctAnswer = "yin",
        keyboardKeys = {k2_p2_q4},
        audioToSpeak = "阴"
    )""",
            f"""    // 5. Soal 5: Mendengar Kalimat (Rule 10: illustrationRes = 0)
    Exercise(
        id = "u30_s2_p2_q5",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Apa yang Anda dengar?",
        targetTranslation = "Minggu depan kita akan pergi bersama-sama.",
        targetHanzi = "下周 我们 一起 去。",
        targetPinyin = "Xiàzhōu wǒmen yìqǐ qù.",
        wordChips = listOf("下周:xiàzhōu", "我们:wǒmen", "一起:yìqǐ", "去。:qù.", "来:lái"),
        correctAnswer = "下周,我们,一起,去。",
        illustrationRes = 0,
        audioToSpeak = "下周我们一起去。"
    )""",
            f"""    // 6. Soal 6: Pilihan Kalimat
    Exercise(
        id = "u30_s2_p2_q6",
        type = ExerciseType.SENTENCE_CHOICE,
        title = "Pilih terjemahan yang benar",
        targetHanzi = "今天 阴天， 出门 记得 带 伞。",
        targetPinyin = "Jīntiān yīntiān, chūmén jìde dài sǎn.",
        targetTranslation = "Hari ini mendung, keluar rumah ingat bawa payung.",
        correctAnswer = "Jīntiān yīntiān, chūmén jìde dài sǎn.\\n今天 阴天， 出门 记得 带 伞。",
        options = listOf(
            "Jīntiān yīntiān, chūmén jìde dài sǎn.\\n今天 阴天， 出门 记得 带 伞。",
            "Jīntiān qíngtiān, chūmén jìde dài sǎn.\\n今天 晴天， 出门 记得 带 伞。",
            "Jīntiān xiàyǔ, bié chūmén.\\n今天 下雨， 别 出门。"
        ),
        audioToSpeak = "今天阴天，出门记得带伞。"
    )""",
            f"""    // 7. Soal 7: Pilihan Gambar (下周 -> pekan depan)
    Exercise(
        id = "u30_s2_p2_q7",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "下周",
        targetPinyin = "xiàzhōu",
        targetTranslation = "pekan depan",
        correctAnswer = "pekan depan",
        audioToSpeak = "下周",
        pictureOptions = listOf(
            PictureOption("u30_s2_p2_opt7_1", "pekan", "", R.drawable.ic_cal_week_cycle, true),
            PictureOption("u30_s2_p2_opt7_2", "mendung", "", R.drawable.ic_weather_overcast_cloud, false),
            PictureOption("u30_s2_p2_opt7_3", "cerah", "", R.drawable.ic_weather_sunny_clear, false),
            PictureOption("u30_s2_p2_opt7_4", "mall", "", R.drawable.ic_shop_mall_plaza, false)
        )
    )""",
            f"""    // 8. Soal 8: Ketik Pinyin (pekan depan -> xiàzhōu)
    Exercise(
        id = "u30_s2_p2_q8",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "pekan depan",
        sentenceWithBlank = "下周 (________)",
        targetHanzi = "下周",
        targetPinyin = "xiàzhōu",
        correctAnswer = "xiazhou",
        keyboardKeys = {k2_p2_q8},
        audioToSpeak = "下周"
    )""",
            f"""    // 9. Soal 9: Susun Kalimat (Hari ini mendung, tidak ada matahari.)
    Exercise(
        id = "u30_s2_p2_q9",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Hari ini mendung, tidak ada matahari.",
        targetHanzi = "今天 阴天， 没有 太阳。",
        targetPinyin = "Jīntiān yīntiān, méiyǒu tàiyáng.",
        wordChips = listOf("今天:jīntiān", "阴天，:yīntiān,", "没有:méiyǒu", "太阳。:tàiyáng.", "有:yǒu"),
        correctAnswer = "今天,阴天，,没有,太阳。",
        audioToSpeak = "今天阴天，没有太阳。"
    )""",
            f"""    // 10. Soal 10: Ketuk Pasangan yang Sesuai (Rangkuman Cuaca & Waktu)
    Exercise(
        id = "u30_s2_p2_m10",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u30_s2_p2_m10_1", "阴天", "yīntiān", "mendung berawan"),
            MatchPairItem("u30_s2_p2_m10_2", "下周见", "xiàzhōu jiàn", "jumpa pekan depan"),
            MatchPairItem("u30_s2_p2_m3", "带雨伞", "dài yǔsǎn", "membawa payung"),
            MatchPairItem("u30_s2_p2_m4", "天气阴", "tiānqì yīn", "cuaca kelabu")
        )
    )"""
        ]
    }

    # =========================================================================
    # STAGE 3: Frekuensi Peristiwa & Panggilan Terhormat (次, 位)
    # =========================================================================
    k3_p1_q4 = make_keys("ci")
    k3_p1_q8 = make_keys("wei")
    k3_p2_q4 = make_keys("liangci")
    k3_p2_q8 = make_keys("liangwei")
    
    stages[3] = {
        "p1": [
            f"""    // 1. Soal 1: Pilihan Gambar (次 -> kali frekuensi)
    Exercise(
        id = "u30_s3_p1_q1",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "次",
        targetPinyin = "cì",
        targetTranslation = "kali (frekuensi)",
        correctAnswer = "kali (frekuensi)",
        audioToSpeak = "次",
        pictureOptions = listOf(
            PictureOption("u30_s3_p1_opt1", "frekuensi kali", "", R.drawable.ic_eval_mastery_trophy, true),
            PictureOption("u30_s3_p1_opt2", "pekan", "", R.drawable.ic_cal_week_cycle, false),
            PictureOption("u30_s3_p1_opt3", "cerah", "", R.drawable.ic_weather_sunny_clear, false),
            PictureOption("u30_s3_p1_opt4", "10.000", "", R.drawable.ic_fin_ten_thousand, false)
        )
    )""",
            f"""    // 2. Soal 2: Susun Kalimat (Buku ini sudah saya baca dengan sungguh-sungguh sebanyak tiga kali.)
    Exercise(
        id = "u30_s3_p1_q2",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Buku ini sudah saya baca tiga kali.",
        targetHanzi = "这 本 书 我 读 了 三 次。",
        targetPinyin = "Zhè běn shū wǒ dú le sān cì.",
        wordChips = listOf("这:zhè", "本:běn", "书:shū", "我:wǒ", "读:dú", "了:le", "三:sān", "次。:cì.", "看:kàn"),
        correctAnswer = "这,本,书,我,读,了,三,次。",
        audioToSpeak = "这本书我读了三次。"
    )""",
            f"""    // 3. Soal 3: Ketuk Pasangan yang Sesuai (Kali & Panggilan Sopan)
    Exercise(
        id = "u30_s3_p1_q3",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u30_s3_p1_m1", "次", "cì", "kali (frekuensi)"),
            MatchPairItem("u30_s3_p1_m2", "位", "wèi", "orang (sopan)"),
            MatchPairItem("u30_s3_p1_m3", "这位老师", "zhè wèi lǎoshī", "guru ini (hormat)"),
            MatchPairItem("u30_s3_p1_m4", "第一次", "dì-yī cì", "pertama kali")
        )
    )""",
            f"""    // 4. Soal 4: Ketik Pinyin (kali -> cì)
    Exercise(
        id = "u30_s3_p1_q4",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "kali (frekuensi kejadian)",
        sentenceWithBlank = "次 (________)",
        targetHanzi = "次",
        targetPinyin = "cì",
        correctAnswer = "ci",
        keyboardKeys = {k3_p1_q4},
        audioToSpeak = "次"
    )""",
            f"""    // 5. Soal 5: Mendengar Kalimat (Rule 10: illustrationRes = 0)
    Exercise(
        id = "u30_s3_p1_q5",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Apa yang Anda dengar?",
        targetTranslation = "Di depan pintu telah datang dua orang kawan lama.",
        targetHanzi = "门口 来 了 两 位 朋友。",
        targetPinyin = "Ménkǒu lái le liǎng wèi péngyou.",
        wordChips = listOf("门口:ménkǒu", "来:lái", "了:le", "两:liǎng", "位:wèi", "朋友。:péngyou.", "个:gè"),
        correctAnswer = "门口,来,了,两,位,朋友。",
        illustrationRes = 0,
        audioToSpeak = "门口来了两位朋友。"
    )""",
            f"""    // 6. Soal 6: Pilihan Kalimat
    Exercise(
        id = "u30_s3_p1_q6",
        type = ExerciseType.SENTENCE_CHOICE,
        title = "Pilih terjemahan yang benar",
        targetHanzi = "这 是 我 第一 次 来 中国。",
        targetPinyin = "Zhè shì wǒ dì-yī cì lái Zhōngguó.",
        targetTranslation = "Ini adalah pertama kalinya saya datang ke Tiongkok.",
        correctAnswer = "Zhè shì wǒ dì-yī cì lái Zhōngguó.\\n这 是 我 第一 次 来 中国。",
        options = listOf(
            "Zhè shì wǒ dì-yī cì lái Zhōngguó.\\n这 是 我 第一 次 来 中国。",
            "Zhè shì wǒ dì-èr cì lái Zhōngguó.\\n这 是 我 第二 次 来 中国。",
            "Tā shì dì-yī cì lái Zhōngguó.\\n他 是 第一 次 来 中国。"
        ),
        audioToSpeak = "这是我第一次来中国。"
    )""",
            f"""    // 7. Soal 7: Pilihan Gambar (位 -> orang terhormat)
    Exercise(
        id = "u30_s3_p1_q7",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "位",
        targetPinyin = "wèi",
        targetTranslation = "orang (sopan)",
        correctAnswer = "orang (sopan)",
        audioToSpeak = "位",
        pictureOptions = listOf(
            PictureOption("u30_s3_p1_opt7_1", "panggilan sopan", "", R.drawable.ic_eval_mastery_trophy, true),
            PictureOption("u30_s3_p1_opt7_2", "mall", "", R.drawable.ic_shop_mall_plaza, false),
            PictureOption("u30_s3_p1_opt7_3", "pekan", "", R.drawable.ic_cal_week_cycle, false),
            PictureOption("u30_s3_p1_opt7_4", "cerah", "", R.drawable.ic_weather_sunny_clear, false)
        )
    )""",
            f"""    // 8. Soal 8: Ketik Pinyin (orang terhormat -> wèi)
    Exercise(
        id = "u30_s3_p1_q8",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "orang (penghormatan sopan)",
        sentenceWithBlank = "位 (________)",
        targetHanzi = "位",
        targetPinyin = "wèi",
        correctAnswer = "wei",
        keyboardKeys = {k3_p1_q8},
        audioToSpeak = "位"
    )""",
            f"""    // 9. Soal 9: Susun Kalimat (Guru yang terhormat ini sangat ramah.)
    Exercise(
        id = "u30_s3_p1_q9",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Guru terhormat ini sangat baik.",
        targetHanzi = "这 位 老师 很 好。",
        targetPinyin = "Zhè wèi lǎoshī hěn hǎo.",
        wordChips = listOf("这:zhè", "位:wèi", "老师:lǎoshī", "很:hěn", "好。:hǎo.", "个:gè"),
        correctAnswer = "这,位,老师,很,好。",
        audioToSpeak = "这位老师很好。"
    )""",
            f"""    // 10. Soal 10: Ketuk Pasangan yang Sesuai (Rangkuman Frekuensi & Hormat)
    Exercise(
        id = "u30_s3_p1_m10",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u30_s3_p1_m10_1", "次", "cì", "kali kejadian"),
            MatchPairItem("u30_s3_p1_m10_2", "位", "wèi", "tuan / nyonya"),
            MatchPairItem("u30_s3_p1_m10_3", "两位客人", "liǎng wèi kèrén", "dua orang tamu"),
            MatchPairItem("u30_s3_p1_m10_4", "再去一次", "zài qù yí cì", "pergi sekali lagi")
        )
    )"""
        ],
        "p2": [
            f"""    // 1. Soal 1: Pilihan Gambar (两次 -> dua kali)
    Exercise(
        id = "u30_s3_p2_q1",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "两次",
        targetPinyin = "liǎngcì",
        targetTranslation = "dua kali",
        correctAnswer = "dua kali",
        audioToSpeak = "两次",
        pictureOptions = listOf(
            PictureOption("u30_s3_p2_opt1", "dua kali", "", R.drawable.ic_eval_mastery_trophy, true),
            PictureOption("u30_s3_p2_opt2", "mall", "", R.drawable.ic_shop_mall_plaza, false),
            PictureOption("u30_s3_p2_opt3", "pekan", "", R.drawable.ic_cal_week_cycle, false),
            PictureOption("u30_s3_p2_opt4", "10.000", "", R.drawable.ic_fin_ten_thousand, false)
        )
    )""",
            f"""    // 2. Soal 2: Susun Kalimat (Saya sudah pergi ke Tiongkok dua kali.)
    Exercise(
        id = "u30_s3_p2_q2",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Saya sudah pergi ke Tiongkok 2 kali.",
        targetHanzi = "我 去 过 两 次 中国。",
        targetPinyin = "Wǒ qù guo liǎng cì Zhōngguó.",
        wordChips = listOf("我:wǒ", "去:qù", "过:guo", "两:liǎng", "次:cì", "中国。:Zhōngguó.", "三:sān"),
        correctAnswer = "我,去,过,两,次,中国。",
        audioToSpeak = "我去过两次中国。"
    )""",
            f"""    // 3. Soal 3: Ketuk Pasangan yang Sesuai (Panggilan Terhormat)
    Exercise(
        id = "u30_s3_p2_m3",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u30_s3_p2_m1", "三位", "sān wèi", "tiga orang (sopan)"),
            MatchPairItem("u30_s3_p2_m2", "两次", "liǎng cì", "dua kali"),
            MatchPairItem("u30_s3_p2_m3", "这位朋友", "zhè wèi péngyou", "sahabat ini"),
            MatchPairItem("u30_s3_p2_m4", "来过一次", "lái guo yí cì", "pernah datang 1x")
        )
    )""",
            f"""    // 4. Soal 4: Ketik Pinyin (dua kali -> liǎngcì)
    Exercise(
        id = "u30_s3_p2_q4",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "dua kali",
        sentenceWithBlank = "两次 (________)",
        targetHanzi = "两次",
        targetPinyin = "liǎngcì",
        correctAnswer = "liangci",
        keyboardKeys = {k3_p2_q4},
        audioToSpeak = "两次"
    )""",
            f"""    // 5. Soal 5: Mendengar Kalimat (Rule 10: illustrationRes = 0)
    Exercise(
        id = "u30_s3_p2_q5",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Apa yang Anda dengar?",
        targetTranslation = "Tiga orang dokter memeriksa pasien.",
        targetHanzi = "三 位 医生 给 他 看病。",
        targetPinyin = "Sān wèi yīshēng gěi tā kànbìng.",
        wordChips = listOf("三:sān", "位:wèi", "医生:yīshēng", "给:gěi", "他:tā", "看病。:kànbìng.", "个:gè"),
        correctAnswer = "三,位,医生,给,他,看病。",
        illustrationRes = 0,
        audioToSpeak = "三位医生给他看病。"
    )""",
            f"""    // 6. Soal 6: Pilihan Kalimat
    Exercise(
        id = "u30_s3_p2_q6",
        type = ExerciseType.SENTENCE_CHOICE,
        title = "Pilih terjemahan yang benar",
        targetHanzi = "请问 您 是 哪 一 位？",
        targetPinyin = "Qǐngwèn nín shì nǎ yí wèi?",
        targetTranslation = "Bolehkah saya bertanya Anda dengan siapa (panggilan hormat telepon)?",
        correctAnswer = "Qǐngwèn nín shì nǎ yí wèi?\\n请问 您 是 哪 一 位？",
        options = listOf(
            "Qǐngwèn nín shì nǎ yí wèi?\\n请问 您 是 哪 一 位？",
            "Qǐngwèn nǐ shì shéi?\\n请问 你 是 谁？",
            "Nín zài nǎlǐ?\\n您 在 哪里？"
        ),
        audioToSpeak = "请问您是哪一位？"
    )""",
            f"""    // 7. Soal 7: Pilihan Gambar (两位 -> dua orang terhormat)
    Exercise(
        id = "u30_s3_p2_q7",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "两位",
        targetPinyin = "liǎngwèi",
        targetTranslation = "dua orang sopan",
        correctAnswer = "dua orang sopan",
        audioToSpeak = "两位",
        pictureOptions = listOf(
            PictureOption("u30_s3_p2_opt7_1", "dua orang sopan", "", R.drawable.ic_eval_mastery_trophy, true),
            PictureOption("u30_s3_p2_opt7_2", "mall", "", R.drawable.ic_shop_mall_plaza, false),
            PictureOption("u30_s3_p2_opt7_3", "10.000", "", R.drawable.ic_fin_ten_thousand, false),
            PictureOption("u30_s3_p2_opt7_4", "cerah", "", R.drawable.ic_weather_sunny_clear, false)
        )
    )""",
            f"""    // 8. Soal 8: Ketik Pinyin (dua orang sopan -> liǎngwèi)
    Exercise(
        id = "u30_s3_p2_q8",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "dua orang (sopan)",
        sentenceWithBlank = "两位 (________)",
        targetHanzi = "两位",
        targetPinyin = "liǎngwèi",
        correctAnswer = "liangwei",
        keyboardKeys = {k3_p2_q8},
        audioToSpeak = "两位"
    )""",
            f"""    // 9. Soal 9: Susun Kalimat (Silakan kedua orang guru duduk di sini.)
    Exercise(
        id = "u30_s3_p2_q9",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Silakan kedua guru duduk.",
        targetHanzi = "两位 老师 请 坐。",
        targetPinyin = "Liǎng wèi lǎoshī qǐng zuò.",
        wordChips = listOf("两位:liǎng wèi", "老师:lǎoshī", "请:qǐng", "坐。:zuò.", "走:zǒu"),
        correctAnswer = "两位,老师,请,坐。",
        audioToSpeak = "两位老师请坐。"
    )""",
            f"""    // 10. Soal 10: Ketuk Pasangan yang Sesuai (Rangkuman Panggilan Hormat)
    Exercise(
        id = "u30_s3_p2_m10",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u30_s3_p2_m10_1", "两位老师", "liǎng wèi lǎoshī", "dua orang guru"),
            MatchPairItem("u30_s3_p2_m10_2", "去了两次", "qù le liǎng cì", "sudah pergi 2x"),
            MatchPairItem("u30_s3_p2_m3", "请坐下", "qǐng zuò xià", "silakan duduk"),
            MatchPairItem("u30_s3_p2_m4", "哪一位", "nǎ yí wèi", "dengan siapa")
        )
    )"""
        ]
    }

    # =========================================================================
    # STAGE 4: Waktu, Asal-Usul & Aspek Duratif Tindakan (就, 从, 时, 着)
    # =========================================================================
    k4_p1_q4 = make_keys("cong")
    k4_p1_q8 = make_keys("jiu")
    k4_p2_q4 = make_keys("shi")
    k4_p2_q8 = make_keys("zhe")
    
    stages[4] = {
        "p1": [
            f"""    // 1. Soal 1: Pilihan Gambar (从 -> dari arah asal waktu)
    Exercise(
        id = "u30_s4_p1_q1",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "从",
        targetPinyin = "cóng",
        targetTranslation = "dari (arah / asal / waktu)",
        correctAnswer = "dari (arah / asal / waktu)",
        audioToSpeak = "从",
        pictureOptions = listOf(
            PictureOption("u30_s4_p1_opt1", "dari", "", R.drawable.ic_eval_mastery_trophy, true),
            PictureOption("u30_s4_p1_opt2", "pekan", "", R.drawable.ic_cal_week_cycle, false),
            PictureOption("u30_s4_p1_opt3", "mall", "", R.drawable.ic_shop_mall_plaza, false),
            PictureOption("u30_s4_p1_opt4", "10.000", "", R.drawable.ic_fin_ten_thousand, false)
        )
    )""",
            f"""    // 2. Soal 2: Susun Kalimat (Dari sekolah ke rumah saya hanya butuh sepuluh menit.)
    Exercise(
        id = "u30_s4_p1_q2",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Dari sekolah ke rumah 10 menit.",
        targetHanzi = "从 学校 到 我家 只要 十 分钟。",
        targetPinyin = "Cóng xuéxiào dào wǒjiā zhǐyào shí fēnzhōng.",
        wordChips = listOf("从:cóng", "学校:xuéxiào", "到:dào", "我家:wǒjiā", "只要:zhǐyào", "十:shí", "分钟。:fēnzhōng.", "小时:xiǎoshí"),
        correctAnswer = "从,学校,到,我家,只要,十,分钟。",
        audioToSpeak = "从学校到我家只要十分钟。"
    )""",
            f"""    // 3. Soal 3: Ketuk Pasangan yang Sesuai (Dari & Langsung)
    Exercise(
        id = "u30_s4_p1_q3",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u30_s4_p1_m1", "从", "cóng", "dari (asal)"),
            MatchPairItem("u30_s4_p1_m2", "就", "jiù", "langsung / maka"),
            MatchPairItem("u30_s4_p1_m3", "从头到尾", "cóngtóu dào wěi", "dari awal sampai akhir"),
            MatchPairItem("u30_s4_p1_m4", "就到了", "jiù dào le", "langsung sampai")
        )
    )""",
            f"""    // 4. Soal 4: Ketik Pinyin (dari -> cóng)
    Exercise(
        id = "u30_s4_p1_q4",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "dari",
        sentenceWithBlank = "从 (________)",
        targetHanzi = "从",
        targetPinyin = "cóng",
        correctAnswer = "cong",
        keyboardKeys = {k4_p1_q4},
        audioToSpeak = "从"
    )""",
            f"""    // 5. Soal 5: Mendengar Kalimat (Rule 10: illustrationRes = 0)
    Exercise(
        id = "u30_s4_p1_q5",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Apa yang Anda dengar?",
        targetTranslation = "Meminum teh panas, kepala saya langsung tidak sakit lagi.",
        targetHanzi = "喝 热茶 头 就 不 疼 了。",
        targetPinyin = "Hē rèchá tóu jiù bù téng le.",
        wordChips = listOf("喝:hē", "热茶:rèchá", "头:tóu", "就:jiù", "不:bù", "疼:téng", "了。:le.", "很:hěn"),
        correctAnswer = "喝,热茶,头,就,不,疼,了。",
        illustrationRes = 0,
        audioToSpeak = "喝热茶头就不疼了。"
    )""",
            f"""    // 6. Soal 6: Pilihan Kalimat
    Exercise(
        id = "u30_s4_p1_q6",
        type = ExerciseType.SENTENCE_CHOICE,
        title = "Pilih terjemahan yang benar",
        targetHanzi = "走 过 车站 就 到 了。",
        targetPinyin = "Zǒu guò chēzhàn jiù dào le.",
        targetTranslation = "Berjalan melewati stasiun langsung sampai.",
        correctAnswer = "Zǒu guò chēzhàn jiù dào le.\\n走 过 车站 就 到 了。",
        options = listOf(
            "Zǒu guò chēzhàn jiù dào le.\\n走 过 车站 就 到 了。",
            "Zǒu guò xuéxiào jiù dào le.\\n走 过 学校 就 到 了。",
            "Zǒu guò chēzhàn hái méi dào.\\n走 过 车站 还 没 到。"
        ),
        audioToSpeak = "走过车站就到了。"
    )""",
            f"""    // 7. Soal 7: Pilihan Gambar (就 -> langsung / segera)
    Exercise(
        id = "u30_s4_p1_q7",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "就",
        targetPinyin = "jiù",
        targetTranslation = "langsung",
        correctAnswer = "langsung",
        audioToSpeak = "就",
        pictureOptions = listOf(
            PictureOption("u30_s4_p1_opt7_1", "langsung", "", R.drawable.ic_eval_mastery_trophy, true),
            PictureOption("u30_s4_p1_opt7_2", "pekan", "", R.drawable.ic_cal_week_cycle, false),
            PictureOption("u30_s4_p1_opt7_3", "mendung", "", R.drawable.ic_weather_overcast_cloud, false),
            PictureOption("u30_s4_p1_opt7_4", "cerah", "", R.drawable.ic_weather_sunny_clear, false)
        )
    )""",
            f"""    // 8. Soal 8: Ketik Pinyin (langsung -> jiù)
    Exercise(
        id = "u30_s4_p1_q8",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "langsung / maka",
        sentenceWithBlank = "就 (________)",
        targetHanzi = "就",
        targetPinyin = "jiù",
        correctAnswer = "jiu",
        keyboardKeys = {k4_p1_q8},
        audioToSpeak = "就"
    )""",
            f"""    // 9. Soal 9: Susun Kalimat (Dari sini jalan kaki sangat dekat.)
    Exercise(
        id = "u30_s4_p1_q9",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Dari sini jalan kaki sangat dekat.",
        targetHanzi = "从 这里 走路 很 近。",
        targetPinyin = "Cóng zhèlǐ zǒulù hěn jìn.",
        wordChips = listOf("从:cóng", "这里:zhèlǐ", "走路:zǒulù", "很:hěn", "近。:jìn.", "远:yuǎn"),
        correctAnswer = "从,这里,走路,很,近。",
        audioToSpeak = "从这里走路很近。"
    )""",
            f"""    // 10. Soal 10: Ketuk Pasangan yang Sesuai (Rangkuman Asal Arah)
    Exercise(
        id = "u30_s4_p1_m10",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u30_s4_p1_m10_1", "从这里", "cóng zhèlǐ", "dari sini"),
            MatchPairItem("u30_s4_p1_m10_2", "到了", "dào le", "sudah sampai"),
            MatchPairItem("u30_s4_p1_m3", "这就去", "zhè jiù qù", "segera berangkat"),
            MatchPairItem("u30_s4_p1_m4", "从小", "cóngxiǎo", "sejak kecil")
        )
    )"""
        ],
        "p2": [
            f"""    // 1. Soal 1: Pilihan Gambar (着 -> partikel aspek duratif keadaan)
    Exercise(
        id = "u30_s4_p2_q1",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "着",
        targetPinyin = "zhe",
        targetTranslation = "partikel duratif (berlangsung)",
        correctAnswer = "partikel duratif (berlangsung)",
        audioToSpeak = "着",
        pictureOptions = listOf(
            PictureOption("u30_s4_p2_opt1", "duratif keadaan", "", R.drawable.ic_eval_mastery_trophy, true),
            PictureOption("u30_s4_p2_opt2", "pekan", "", R.drawable.ic_cal_week_cycle, false),
            PictureOption("u30_s4_p2_opt3", "mall", "", R.drawable.ic_shop_mall_plaza, false),
            PictureOption("u30_s4_p2_opt4", "10.000", "", R.drawable.ic_fin_ten_thousand, false)
        )
    )""",
            f"""    // 2. Soal 2: Susun Kalimat (Saat bersantap makan tolong jangan berbicara dengan suara keras.)
    Exercise(
        id = "u30_s4_p2_q2",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Saat makan jangan bicara keras.",
        targetHanzi = "吃饭 时 别 大声 说话。",
        targetPinyin = "Chīfàn shí bié dàshēng shuōhuà.",
        wordChips = listOf("吃饭:chīfàn", "时:shí", "别:bié", "大声:dàshēng", "说话。:shuōhuà.", "请:qǐng"),
        correctAnswer = "吃饭,时,别,大声,说话。",
        audioToSpeak = "吃饭时别大声说话。"
    )""",
            f"""    // 3. Soal 3: Ketuk Pasangan yang Sesuai (Saat Waktu & Keadaan Duratif)
    Exercise(
        id = "u30_s4_p2_m3",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u30_s4_p2_m1", "时", "shí", "saat / ketika"),
            MatchPairItem("u30_s4_p2_m2", "着", "zhe", "sedang berstatus"),
            MatchPairItem("u30_s4_p2_m3", "开着门", "kāi zhe mén", "pintu terbuka"),
            MatchPairItem("u30_s4_p2_m4", "下着雨", "xià zhe yǔ", "sedang hujan")
        )
    )""",
            f"""    // 4. Soal 4: Ketik Pinyin (saat/ketika -> shí)
    Exercise(
        id = "u30_s4_p2_q4",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "saat / waktu / ketika",
        sentenceWithBlank = "时 (________)",
        targetHanzi = "时",
        targetPinyin = "shí",
        correctAnswer = "shi",
        keyboardKeys = {k4_p2_q4},
        audioToSpeak = "时"
    )""",
            f"""    // 5. Soal 5: Mendengar Kalimat (Rule 10: illustrationRes = 0)
    Exercise(
        id = "u30_s4_p2_q5",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Apa yang Anda dengar?",
        targetTranslation = "Pintu terbuka, silakan langsung masuk.",
        targetHanzi = "门 开 着， 请 进。",
        targetPinyin = "Mén kāi zhe, qǐng jìn.",
        wordChips = listOf("门:mén", "开:kāi", "着，:zhe,", "请:qǐng", "进。:jìn.", "关:guān"),
        correctAnswer = "门,开,着，,请,进。",
        illustrationRes = 0,
        audioToSpeak = "门开着，请进。"
    )""",
            f"""    // 6. Soal 6: Pilihan Kalimat
    Exercise(
        id = "u30_s4_p2_q6",
        type = ExerciseType.SENTENCE_CHOICE,
        title = "Pilih terjemahan yang benar",
        targetHanzi = "他 穿 着 一 件 黑色 衣服。",
        targetPinyin = "Tā chuān zhe yí jiàn hēisè yīfu.",
        targetTranslation = "Dia sedang mengenakan sehelai pakaian berwarna hitam.",
        correctAnswer = "Tā chuān zhe yí jiàn hēisè yīfu.\\n他 穿 着 一 件 黑色 衣服。",
        options = listOf(
            "Tā chuān zhe yí jiàn hēisè yīfu.\\n他 穿 着 一 件 黑色 衣服。",
            "Tā chuān zhe yí jiàn báisè yīfu.\\n他 穿 着 一 件 白色 衣服。",
            "Tā méiyǒu chuān yīfu.\\n他 没有 穿 衣服。"
        ),
        audioToSpeak = "他穿着一件黑色衣服。"
    )""",
            f"""    // 7. Soal 7: Pilihan Gambar (开着门 -> pintu dalam kondisi terbuka)
    Exercise(
        id = "u30_s4_p2_q7",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "开着",
        targetPinyin = "kāi zhe",
        targetTranslation = "terbuka (berstatus)",
        correctAnswer = "terbuka (berstatus)",
        audioToSpeak = "开着",
        pictureOptions = listOf(
            PictureOption("u30_s4_p2_opt7_1", "terbuka", "", R.drawable.ic_eval_mastery_trophy, true),
            PictureOption("u30_s4_p2_opt7_2", "pekan", "", R.drawable.ic_cal_week_cycle, false),
            PictureOption("u30_s4_p2_opt7_3", "mall", "", R.drawable.ic_shop_mall_plaza, false),
            PictureOption("u30_s4_p2_opt7_4", "cerah", "", R.drawable.ic_weather_sunny_clear, false)
        )
    )""",
            f"""    // 8. Soal 8: Ketik Pinyin (partikel duratif -> zhe)
    Exercise(
        id = "u30_s4_p2_q8",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "partikel duratif",
        sentenceWithBlank = "着 (________)",
        targetHanzi = "着",
        targetPinyin = "zhe",
        correctAnswer = "zhe",
        keyboardKeys = {k4_p2_q8},
        audioToSpeak = "着"
    )""",
            f"""    // 9. Soal 9: Susun Kalimat (Di atas meja diletakkan secangkir teh.)
    Exercise(
        id = "u30_s4_p2_q9",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Di atas meja ada secangkir teh.",
        targetHanzi = "桌子 上 放 着 茶。",
        targetPinyin = "Zhuōzi shang fàng zhe chá.",
        wordChips = listOf("桌子:zhuōzi", "上:shang", "放:fàng", "着:zhe", "茶。:chá.", "水:shuǐ"),
        correctAnswer = "桌子,上,放,着,茶。",
        audioToSpeak = "桌子上放着茶。"
    )""",
            f"""    // 10. Soal 10: Ketuk Pasangan yang Sesuai (Rangkuman Status Tindakan)
    Exercise(
        id = "u30_s4_p2_m10",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u30_s4_p2_m10_1", "放着", "fàng zhe", "ditaruh"),
            MatchPairItem("u30_s4_p2_m10_2", "拿着", "ná zhe", "dipegang"),
            MatchPairItem("u30_s4_p2_m3", "看书时", "kànshū shí", "kala membaca"),
            MatchPairItem("u30_s4_p2_m4", "别大声", "bié dàshēng", "jangan bersuara")
        )
    )"""
        ]
    }

    # =========================================================================
    # STAGE 5: Ketuntasan Tindakan & Penyelesaian Soal (完, 一起, Evaluasi)
    # =========================================================================
    k5_p1_q4 = make_keys("wan")
    k5_p1_q8 = make_keys("yiqi")
    k5_p2_q4 = make_keys("zuowan")
    k5_p2_q8 = make_keys("dajia")
    
    stages[5] = {
        "p1": [
            f"""    // 1. Soal 1: Pilihan Gambar (完 -> selesai / habis tuntas)
    Exercise(
        id = "u30_s5_p1_q1",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "完",
        targetPinyin = "wán",
        targetTranslation = "selesai / habis",
        correctAnswer = "selesai / habis",
        audioToSpeak = "完",
        pictureOptions = listOf(
            PictureOption("u30_s5_p1_opt1", "selesai", "", R.drawable.ic_eval_mastery_trophy, true),
            PictureOption("u30_s5_p1_opt2", "mall", "", R.drawable.ic_shop_mall_plaza, false),
            PictureOption("u30_s5_p1_opt3", "pekan", "", R.drawable.ic_cal_week_cycle, false),
            PictureOption("u30_s5_p1_opt4", "cerah", "", R.drawable.ic_weather_sunny_clear, false)
        )
    )""",
            f"""    // 2. Soal 2: Susun Kalimat (Selesai mengerjakan tugas PR kita bisa pergi bermain bola.)
    Exercise(
        id = "u30_s5_p1_q2",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Selesai PR kita pergi main bola.",
        targetHanzi = "做完 作业 去 踢球。",
        targetPinyin = "Zuòwán zuòyè qù tīqiú.",
        wordChips = listOf("做完:zuòwán", "作业:zuòyè", "去:qù", "踢球。:tīqiú.", "睡觉:shuìjiào"),
        correctAnswer = "做完,作业,去,踢球。",
        audioToSpeak = "做完作业去踢球。"
    )""",
            f"""    // 3. Soal 3: Ketuk Pasangan yang Sesuai (Selesai & Bersama-sama)
    Exercise(
        id = "u30_s5_p1_m3",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u30_s5_p1_m1", "完", "wán", "selesai"),
            MatchPairItem("u30_s5_p1_m2", "一起", "yìqǐ", "bersama-sama"),
            MatchPairItem("u30_s5_p1_m3", "吃完", "chī wán", "selesai makan"),
            MatchPairItem("u30_s5_p1_m4", "大家一起", "dàjiā yìqǐ", "kita semua bersama")
        )
    )""",
            f"""    // 4. Soal 4: Ketik Pinyin (selesai -> wán)
    Exercise(
        id = "u30_s5_p1_q4",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "selesai / habis",
        sentenceWithBlank = "完 (________)",
        targetHanzi = "完",
        targetPinyin = "wán",
        correctAnswer = "wan",
        keyboardKeys = {k5_p1_q4},
        audioToSpeak = "完"
    )""",
            f"""    // 5. Soal 5: Mendengar Kalimat (Rule 10: illustrationRes = 0)
    Exercise(
        id = "u30_s5_p1_q5",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Apa yang Anda dengar?",
        targetTranslation = "Mari kita bersama-sama belajar bahasa Mandarin!",
        targetHanzi = "我们 一起 学 汉语 吧！",
        targetPinyin = "Wǒmen yìqǐ xué Hànyǔ ba!",
        wordChips = listOf("我们:wǒmen", "一起:yìqǐ", "学:xué", "汉语:Hànyǔ", "吧！:ba.", "玩:wán"),
        correctAnswer = "我们,一起,学,汉语,吧！",
        illustrationRes = 0,
        audioToSpeak = "我们一起学汉语吧！"
    )""",
            f"""    // 6. Soal 6: Pilihan Kalimat
    Exercise(
        id = "u30_s5_p1_q6",
        type = ExerciseType.SENTENCE_CHOICE,
        title = "Pilih terjemahan yang benar",
        targetHanzi = "这 本 书 我 已经 看 完 了。",
        targetPinyin = "Zhè běn shū wǒ yǐjīng kàn wán le.",
        targetTranslation = "Buku ini saya sudah selesai membacanya.",
        correctAnswer = "Zhè běn shū wǒ yǐjīng kàn wán le.\\n这 本 书 我 已经 看 完 了。",
        options = listOf(
            "Zhè běn shū wǒ yǐjīng kàn wán le.\\n这 本 书 我 已经 看 完 了。",
            "Zhè běn shū wǒ hái méi kàn wán.\\n这 本 书 我 还 没 看 完。",
            "Nà běn shū wǒ yǐjīng kàn wán le.\\n那 本 书 我 已经 看 完 了。"
        ),
        audioToSpeak = "这本书我已经看完了。"
    )""",
            f"""    // 7. Soal 7: Pilihan Gambar (一起 -> bersama-sama)
    Exercise(
        id = "u30_s5_p1_q7",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "一起",
        targetPinyin = "yìqǐ",
        targetTranslation = "bersama-sama",
        correctAnswer = "bersama-sama",
        audioToSpeak = "一起",
        pictureOptions = listOf(
            PictureOption("u30_s5_p1_opt7_1", "bersama", "", R.drawable.ic_eval_mastery_trophy, true),
            PictureOption("u30_s5_p1_opt7_2", "mall", "", R.drawable.ic_shop_mall_plaza, false),
            PictureOption("u30_s5_p1_opt7_3", "pekan", "", R.drawable.ic_cal_week_cycle, false),
            PictureOption("u30_s5_p1_opt7_4", "cerah", "", R.drawable.ic_weather_sunny_clear, false)
        )
    )""",
            f"""    // 8. Soal 8: Ketik Pinyin (bersama-sama -> yìqǐ)
    Exercise(
        id = "u30_s5_p1_q8",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "bersama-sama",
        sentenceWithBlank = "一起 (________)",
        targetHanzi = "一起",
        targetPinyin = "yìqǐ",
        correctAnswer = "yiqi",
        keyboardKeys = {k5_p1_q8},
        audioToSpeak = "一起"
    )""",
            f"""    // 9. Soal 9: Susun Kalimat (Kalian makan bersama-sama.)
    Exercise(
        id = "u30_s5_p1_q9",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Kalian makan bersama-sama.",
        targetHanzi = "你们 一起 吃 饭。",
        targetPinyin = "Nǐmen yìqǐ chī fàn.",
        wordChips = listOf("你们:nǐmen", "一起:yìqǐ", "吃:chī", "饭。:fàn.", "去:qù"),
        correctAnswer = "你们,一起,吃,饭。",
        audioToSpeak = "你们一起吃饭。"
    )""",
            f"""    // 10. Soal 10: Ketuk Pasangan yang Sesuai (Rangkuman Selesai & Kolaborasi)
    Exercise(
        id = "u30_s5_p1_m10",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u30_s5_p1_m10_1", "学完", "xué wán", "tamat belajar"),
            MatchPairItem("u30_s5_p1_m10_2", "一起走", "yìqǐ zǒu", "jalan bersama"),
            MatchPairItem("u30_s5_p1_m3", "看完了", "kàn wán le", "tuntas baca"),
            MatchPairItem("u30_s5_p1_m4", "很高兴", "hěn gāoxìng", "sukacita")
        )
    )"""
        ],
        "p2": [
            f"""    // 1. Soal 1: Pilihan Gambar (做完 -> selesai mengerjakan)
    Exercise(
        id = "u30_s5_p2_q1",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "做完",
        targetPinyin = "zuòwán",
        targetTranslation = "selesai mengerjakan",
        correctAnswer = "selesai mengerjakan",
        audioToSpeak = "做完",
        pictureOptions = listOf(
            PictureOption("u30_s5_p2_opt1", "selesai", "", R.drawable.ic_eval_mastery_trophy, true),
            PictureOption("u30_s5_p2_opt2", "mall", "", R.drawable.ic_shop_mall_plaza, false),
            PictureOption("u30_s5_p2_opt3", "pekan", "", R.drawable.ic_cal_week_cycle, false),
            PictureOption("u30_s5_p2_opt4", "mendung", "", R.drawable.ic_weather_overcast_cloud, false)
        )
    )""",
            f"""    // 2. Soal 2: Susun Kalimat (Semua orang sudah selesai mengerjakan soal ujian.)
    Exercise(
        id = "u30_s5_p2_q2",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Semua sudah selesai mengerjakan soal.",
        targetHanzi = "大家 都 做完 题 了。",
        targetPinyin = "Dàjiā dōu zuòwán tí le.",
        wordChips = listOf("大家:dàjiā", "都:dōu", "做完:zuòwán", "题:tí", "了。:le.", "没:méi"),
        correctAnswer = "大家,都,做完,题,了。",
        audioToSpeak = "大家都做完题了。"
    )""",
            f"""    // 3. Soal 3: Ketuk Pasangan yang Sesuai (Tuntas Mengerjakan)
    Exercise(
        id = "u30_s5_p2_m3",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u30_s5_p2_m1", "做完", "zuòwán", "selesai bikin"),
            MatchPairItem("u30_s5_p2_m2", "大家", "dàjiā", "semua orang"),
            MatchPairItem("u30_s5_p2_m3", "写完", "xiě wán", "selesai tulis"),
            MatchPairItem("u30_s5_p2_m4", "听懂", "tīng dǒng", "paham dengar")
        )
    )""",
            f"""    // 4. Soal 4: Ketik Pinyin (selesai mengerjakan -> zuòwán)
    Exercise(
        id = "u30_s5_p2_q4",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "selesai membuat",
        sentenceWithBlank = "做完 (________)",
        targetHanzi = "做完",
        targetPinyin = "zuòwán",
        correctAnswer = "zuowan",
        keyboardKeys = {k5_p2_q4},
        audioToSpeak = "做完"
    )""",
            f"""    // 5. Soal 5: Mendengar Kalimat (Rule 10: illustrationRes = 0)
    Exercise(
        id = "u30_s5_p2_q5",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Apa yang Anda dengar?",
        targetTranslation = "Kami bersama-sama pergi ke mall berbelanja.",
        targetHanzi = "我们 一起 去 商场 买 东西。",
        targetPinyin = "Wǒmen yìqǐ qù shāngchǎng mǎi dōngxi.",
        wordChips = listOf("我们:wǒmen", "一起:yìqǐ", "去:qù", "商场:shāngchǎng", "买:mǎi", "东西。:dōngxi.", "卖:mài"),
        correctAnswer = "我们,一起,去,商场,买,东西。",
        illustrationRes = 0,
        audioToSpeak = "我们一起去商场买东西。"
    )""",
            f"""    // 6. Soal 6: Pilihan Kalimat
    Exercise(
        id = "u30_s5_p2_q6",
        type = ExerciseType.SENTENCE_CHOICE,
        title = "Pilih terjemahan yang benar",
        targetHanzi = "大家 都 考 完 了， 真 高兴！",
        targetPinyin = "Dàjiā dōu kǎo wán le, zhēn gāoxìng!",
        targetTranslation = "Semua orang telah selesai ujian, sungguh senang!",
        correctAnswer = "Dàjiā dōu kǎo wán le, zhēn gāoxìng!\\n大家 都 考 完 了， 真 高兴！",
        options = listOf(
            "Dàjiā dōu kǎo wán le, zhēn gāoxìng!\\n大家 都 考 完 了， 真 高兴！",
            "Dàjiā dōu kǎo wán le, zhēn nánguò!\\n大家 都 考 完 了， 真 难过！",
            "Tāmen hái méi kǎo wán.\\n他们 还 没 考 完。"
        ),
        audioToSpeak = "大家都考完了，真高兴！"
    )""",
            f"""    // 7. Soal 7: Pilihan Gambar (大家 -> semua orang)
    Exercise(
        id = "u30_s5_p2_q7",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "大家",
        targetPinyin = "dàjiā",
        targetTranslation = "semua orang",
        correctAnswer = "semua orang",
        audioToSpeak = "大家",
        pictureOptions = listOf(
            PictureOption("u30_s5_p2_opt7_1", "semua orang", "", R.drawable.ic_eval_mastery_trophy, true),
            PictureOption("u30_s5_p2_opt7_2", "mall", "", R.drawable.ic_shop_mall_plaza, false),
            PictureOption("u30_s5_p2_opt7_3", "pekan", "", R.drawable.ic_cal_week_cycle, false),
            PictureOption("u30_s5_p2_opt7_4", "cerah", "", R.drawable.ic_weather_sunny_clear, false)
        )
    )""",
            f"""    // 8. Soal 8: Ketik Pinyin (semua orang -> dàjiā)
    Exercise(
        id = "u30_s5_p2_q8",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "semua orang",
        sentenceWithBlank = "大家 (________)",
        targetHanzi = "大家",
        targetPinyin = "dàjiā",
        correctAnswer = "dajia",
        keyboardKeys = {k5_p2_q8},
        audioToSpeak = "大家"
    )""",
            f"""    // 9. Soal 9: Susun Kalimat (Selamat kepada kalian semua telah menuntaskan pembelajaran!)
    Exercise(
        id = "u30_s5_p2_q9",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Kalian semua belajar dengan sangat baik.",
        targetHanzi = "大家 学 得 真 好。",
        targetPinyin = "Dàjiā xué de zhēn hǎo.",
        wordChips = listOf("大家:dàjiā", "学:xué", "得:de", "真:zhēn", "好。:hǎo.", "慢:màn"),
        correctAnswer = "大家,学,得,真,好。",
        audioToSpeak = "大家学得真好。"
    )""",
            f"""    // 10. Soal 10: Ketuk Pasangan yang Sesuai (Rangkuman Prestasi Akhir)
    Exercise(
        id = "u30_s5_p2_m10",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u30_s5_p2_m10_1", "考完了", "kǎo wán le", "selesai ujian"),
            MatchPairItem("u30_s5_p2_m10_2", "真高兴", "zhēn gāoxìng", "sangat gembira"),
            MatchPairItem("u30_s5_p2_m3", "学得好", "xué de hǎo", "belajar unggul"),
            MatchPairItem("u30_s5_p2_m4", "做完了", "zuò wán le", "tuntas tuntas")
        )
    )"""
        ]
    }

    # =========================================================================
    # STAGE 6: Grand Final Ujian HSK 2 (Sintesis Puncak Menyeluruh Bab 17 - 30)
    # =========================================================================
    k6_p1_q4 = make_keys("wan")
    k6_p1_q8 = make_keys("shangchang")
    k6_p2_q4 = make_keys("yiqi")
    k6_p2_q8 = make_keys("hanyu")
    
    stages[6] = {
        "p1": [
            f"""    // 1. Soal 1: Pilihan Gambar (万 -> sepuluh ribu nilai puncak)
    Exercise(
        id = "u30_s6_p1_q1",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "万",
        targetPinyin = "wàn",
        targetTranslation = "sepuluh ribu",
        correctAnswer = "sepuluh ribu",
        audioToSpeak = "万",
        pictureOptions = listOf(
            PictureOption("u30_s6_p1_opt1", "10.000", "", R.drawable.ic_fin_ten_thousand, true),
            PictureOption("u30_s6_p1_opt2", "mall", "", R.drawable.ic_shop_mall_plaza, false),
            PictureOption("u30_s6_p1_opt3", "trofi", "", R.drawable.ic_eval_mastery_trophy, false),
            PictureOption("u30_s6_p1_opt4", "pekan", "", R.drawable.ic_cal_week_cycle, false)
        )
    )""",
            f"""    // 2. Soal 2: Susun Kalimat (Hari ini cerah, kami pergi ke mall bersama-sama.)
    Exercise(
        id = "u30_s6_p1_q2",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Hari ini cerah, kami ke mall bersama.",
        targetHanzi = "今天 晴天， 我们 去 商场。",
        targetPinyin = "Jīntiān qíngtiān, wǒmen qù shāngchǎng.",
        wordChips = listOf("今天:jīntiān", "晴天，:qíngtiān,", "我们:wǒmen", "去:qù", "商场。:shāngchǎng.", "下雨:xiàyǔ"),
        correctAnswer = "今天,晴天，,我们,去,商场。",
        audioToSpeak = "今天晴天，我们去商场。"
    )""",
            f"""    // 3. Soal 3: Ketuk Pasangan yang Sesuai (Grand Final Bagian 1)
    Exercise(
        id = "u30_s6_p1_m3",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u30_s6_p1_m1", "万", "wàn", "sepuluh ribu"),
            MatchPairItem("u30_s6_p1_m2", "晴", "qíng", "cerah"),
            MatchPairItem("u30_s6_p1_m3", "阴", "yīn", "mendung"),
            MatchPairItem("u30_s6_p1_m4", "商场", "shāngchǎng", "mall")
        )
    )""",
            f"""    // 4. Soal 4: Ketik Pinyin (sepuluh ribu -> wàn)
    Exercise(
        id = "u30_s6_p1_q4",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "sepuluh ribu",
        sentenceWithBlank = "万 (________)",
        targetHanzi = "万",
        targetPinyin = "wàn",
        correctAnswer = "wan",
        keyboardKeys = {k6_p1_q4},
        audioToSpeak = "万"
    )""",
            f"""    // 5. Soal 5: Mendengar Kalimat (Rule 10: illustrationRes = 0)
    Exercise(
        id = "u30_s6_p1_q5",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Apa yang Anda dengar?",
        targetTranslation = "Pekan depan kita ada ujian akhir.",
        targetHanzi = "下周 我们 有 考试。",
        targetPinyin = "Xiàzhōu wǒmen yǒu kǎoshì.",
        wordChips = listOf("下周:xiàzhōu", "我们:wǒmen", "有:yǒu", "考试。:kǎoshì.", "玩:wán"),
        correctAnswer = "下周,我们,有,考试。",
        illustrationRes = 0,
        audioToSpeak = "下周我们有考试。"
    )""",
            f"""    // 6. Soal 6: Pilihan Kalimat
    Exercise(
        id = "u30_s6_p1_q6",
        type = ExerciseType.SENTENCE_CHOICE,
        title = "Pilih terjemahan yang benar",
        targetHanzi = "我们 都 听 懂 了 汉语。",
        targetPinyin = "Wǒmen dōu tīng dǒng le Hànyǔ.",
        targetTranslation = "Kami semua telah paham mendengarkan bahasa Mandarin.",
        correctAnswer = "Wǒmen dōu tīng dǒng le Hànyǔ.\\n我们 都 听 懂 了 汉语。",
        options = listOf(
            "Wǒmen dōu tīng dǒng le Hànyǔ.\\n我们 都 听 懂 了 汉语。",
            "Wǒmen dōu tīng bù dǒng Hànyǔ.\\n我们 都 听 不 懂 汉语。",
            "Tāmen dōu tīng dǒng le Hànyǔ.\\n他们 都 听 懂 了 汉语。"
        ),
        audioToSpeak = "我们都听懂了汉语。"
    )""",
            f"""    // 7. Soal 7: Pilihan Gambar (商场 -> mall perbelanjaan)
    Exercise(
        id = "u30_s6_p1_q7",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "商场",
        targetPinyin = "shāngchǎng",
        targetTranslation = "mall",
        correctAnswer = "mall",
        audioToSpeak = "商场",
        pictureOptions = listOf(
            PictureOption("u30_s6_p1_opt7_1", "mall", "", R.drawable.ic_shop_mall_plaza, true),
            PictureOption("u30_s6_p1_opt7_2", "trofi", "", R.drawable.ic_eval_mastery_trophy, false),
            PictureOption("u30_s6_p1_opt7_3", "10.000", "", R.drawable.ic_fin_ten_thousand, false),
            PictureOption("u30_s6_p1_opt7_4", "cerah", "", R.drawable.ic_weather_sunny_clear, false)
        )
    )""",
            f"""    // 8. Soal 8: Ketik Pinyin (mall -> shāngchǎng)
    Exercise(
        id = "u30_s6_p1_q8",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "pusat belanja",
        sentenceWithBlank = "商场 (________)",
        targetHanzi = "商场",
        targetPinyin = "shāngchǎng",
        correctAnswer = "shangchang",
        keyboardKeys = {k6_p1_q8},
        audioToSpeak = "商场"
    )""",
            f"""    // 9. Soal 9: Susun Kalimat (Saya sudah dua kali berkunjung ke mall ini.)
    Exercise(
        id = "u30_s6_p1_q9",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Saya sudah dua kali ke mall ini.",
        targetHanzi = "我 来 过 两 次 商场。",
        targetPinyin = "Wǒ lái guo liǎng cì shāngchǎng.",
        wordChips = listOf("我:wǒ", "来:lái", "过:guo", "两:liǎng", "次:cì", "商场。:shāngchǎng.", "三:sān"),
        correctAnswer = "我,来,过,两,次,商场。",
        audioToSpeak = "我来过两次商场。"
    )""",
            f"""    // 10. Soal 10: Ketuk Pasangan yang Sesuai (Rangkuman Grand Final 1)
    Exercise(
        id = "u30_s6_p1_m10",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u30_s6_p1_m10_1", "万", "wàn", "10 ribu"),
            MatchPairItem("u30_s6_p1_m10_2", "次", "cì", "kali"),
            MatchPairItem("u30_s6_p1_m3", "商场", "shāngchǎng", "mall"),
            MatchPairItem("u30_s6_p1_m4", "听懂", "tīng dǒng", "paham")
        )
    )"""
        ],
        "p2": [
            f"""    // 1. Soal 1: Pilihan Gambar (胜利 -> trofi kelulusan kurikulum)
    Exercise(
        id = "u30_s6_p2_q1",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "完",
        targetPinyin = "wán",
        targetTranslation = "tuntas / selesai",
        correctAnswer = "tuntas / selesai",
        audioToSpeak = "完",
        pictureOptions = listOf(
            PictureOption("u30_s6_p2_opt1", "tuntas", "", R.drawable.ic_eval_mastery_trophy, true),
            PictureOption("u30_s6_p2_opt2", "mall", "", R.drawable.ic_shop_mall_plaza, false),
            PictureOption("u30_s6_p2_opt3", "10.000", "", R.drawable.ic_fin_ten_thousand, false),
            PictureOption("u30_s6_p2_opt4", "pekan", "", R.drawable.ic_cal_week_cycle, false)
        )
    )""",
            f"""    // 2. Soal 2: Susun Kalimat (Grand Final Ujian HSK 2: Kami semua tamat belajar HSK 2.)
    Exercise(
        id = "u30_s6_p2_q2",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Kami semua tamat belajar HSK 2.",
        targetHanzi = "我们 学 完 了 汉语。",
        targetPinyin = "Wǒmen xué wán le Hànyǔ.",
        wordChips = listOf("我们:wǒmen", "学:xué", "完:wán", "了:le", "汉语。:Hànyǔ.", "英语:Yīngyǔ"),
        correctAnswer = "我们,学,完,了,汉语。",
        audioToSpeak = "我们学完了汉语。"
    )""",
            f"""    // 3. Soal 3: Ketuk Pasangan yang Sesuai (Puncak Kelulusan HSK 2)
    Exercise(
        id = "u30_s6_p2_m3",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u30_s6_p2_m1", "完", "wán", "selesai"),
            MatchPairItem("u30_s6_p2_m2", "一起", "yìqǐ", "bersama"),
            MatchPairItem("u30_s6_p2_m3", "学完", "xué wán", "tamat belajar"),
            MatchPairItem("u30_s6_p2_m4", "很高兴", "hěn gāoxìng", "gembira")
        )
    )""",
            f"""    // 4. Soal 4: Ketik Pinyin (bersama -> yìqǐ)
    Exercise(
        id = "u30_s6_p2_q4",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "bersama-sama",
        sentenceWithBlank = "一起 (________)",
        targetHanzi = "一起",
        targetPinyin = "yìqǐ",
        correctAnswer = "yiqi",
        keyboardKeys = {k6_p2_q4},
        audioToSpeak = "一起"
    )""",
            f"""    // 5. Soal 5: Mendengar Kalimat (Rule 10: illustrationRes = 0)
    Exercise(
        id = "u30_s6_p2_q5",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Apa yang Anda dengar?",
        targetTranslation = "Selamat kepada kalian semua telah menuntaskan pembelajaran!",
        targetHanzi = "祝贺 大家 学习 成功！",
        targetPinyin = "Zhùhè dàjiā xuéxí chénggōng!",
        wordChips = listOf("祝贺:zhùhè", "大家:dàjiā", "学习:xuéxí", "成功！:chénggōng!", "新年:xīnnián"),
        correctAnswer = "祝贺,大家,学习,成功！",
        illustrationRes = 0,
        audioToSpeak = "祝贺大家学习成功！"
    )""",
            f"""    // 6. Soal 6: Pilihan Kalimat
    Exercise(
        id = "u30_s6_p2_q6",
        type = ExerciseType.SENTENCE_CHOICE,
        title = "Pilih terjemahan yang benar",
        targetHanzi = "我们 会 听、 会 说、 也 会 写 汉字。",
        targetPinyin = "Wǒmen huì tīng, huì shuō, yě huì xiě Hànzì.",
        targetTranslation = "Kami bisa menyimak, bisa berbicara, dan juga bisa menulis karakter Hanzi.",
        correctAnswer = "Wǒmen huì tīng, huì shuō, yě huì xiě Hànzì.\\n我们 会 听、 会 说、 也 会 写 汉字。",
        options = listOf(
            "Wǒmen huì tīng, huì shuō, yě huì xiě Hànzì.\\n我们 会 听、 会 说、 也 会 写 汉字。",
            "Wǒmen bú huì tīng, bú huì shuō.\\n我们 不 会 听， 不 会 说。",
            "Tāmen huì tīng, bú huì xiě.\\n他们 会 听， 不 会 写。"
        ),
        audioToSpeak = "我们会听、会说、也会写汉字。"
    )""",
            f"""    // 7. Soal 7: Pilihan Gambar (成功 -> trofi mahakarya)
    Exercise(
        id = "u30_s6_p2_q7",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "成功",
        targetPinyin = "chénggōng",
        targetTranslation = "berhasil sukses",
        correctAnswer = "berhasil sukses",
        audioToSpeak = "成功",
        pictureOptions = listOf(
            PictureOption("u30_s6_p2_opt7_1", "sukses", "", R.drawable.ic_eval_mastery_trophy, true),
            PictureOption("u30_s6_p2_opt7_2", "pekan", "", R.drawable.ic_cal_week_cycle, false),
            PictureOption("u30_s6_p2_opt7_3", "mall", "", R.drawable.ic_shop_mall_plaza, false),
            PictureOption("u30_s6_p2_opt7_4", "10.000", "", R.drawable.ic_fin_ten_thousand, false)
        )
    )""",
            f"""    // 8. Soal 8: Ketik Pinyin (bahasa Mandarin -> Hànyǔ)
    Exercise(
        id = "u30_s6_p2_q8",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "bahasa Mandarin",
        sentenceWithBlank = "汉语 (________)",
        targetHanzi = "汉语",
        targetPinyin = "Hànyǔ",
        correctAnswer = "hanyu",
        keyboardKeys = {k6_p2_q8},
        audioToSpeak = "汉语"
    )""",
            f"""    // 9. Soal 9: Susun Kalimat (Puncak Penutupan New HSK 2)
    Exercise(
        id = "u30_s6_p2_q9",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Semua orang belajar Mandarin dengan gembira.",
        targetHanzi = "大家 学 汉语 很 开心。",
        targetPinyin = "Dàjiā xué Hànyǔ hěn kāixīn.",
        wordChips = listOf("大家:dàjiā", "学:xué", "汉语:Hànyǔ", "很:hěn", "开心。:kāixīn.", "累:lèi"),
        correctAnswer = "大家,学,汉语,很,开心。",
        audioToSpeak = "大家学汉语很开心。"
    )""",
            f"""    // 10. Soal 10: Ketuk Pasangan yang Sesuai (Rangkuman Grand Puncak HSK 2)
    Exercise(
        id = "u30_s6_p2_m10",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u30_s6_p2_m10_1", "学完了", "xué wán le", "tuntas kurikulum"),
            MatchPairItem("u30_s6_p2_m10_2", "写汉字", "xiě Hànzì", "tulis Hanzi"),
            MatchPairItem("u30_s6_p2_m3", "大家一起", "dàjiā yìqǐ", "semua bersama"),
            MatchPairItem("u30_s6_p2_m4", "成功", "chénggōng", "berhasil")
        )
    )"""
        ]
    }

    for s_idx in range(1, 7):
        filename = f"{base_dir}/Bab30Stage{s_idx}Data.kt"
        p1_code = ",\n\n".join(stages[s_idx]["p1"])
        p2_code = ",\n\n".join(stages[s_idx]["p2"])
        
        content = f"""package com.example.chineselearning.data.repository

import com.example.chineselearning.R
import com.example.chineselearning.data.model.Exercise
import com.example.chineselearning.data.model.ExerciseType
import com.example.chineselearning.data.model.MatchPairItem
import com.example.chineselearning.data.model.PictureOption

val bab30Stage{s_idx}Part1Exercises = listOf(
{p1_code}
)

val bab30Stage{s_idx}Part2Exercises = listOf(
{p2_code}
)
"""
        with open(filename, "w", encoding="utf-8") as f:
            f.write(content)
        print(f"Written {filename}")

if __name__ == "__main__":
    generate_bab30()
