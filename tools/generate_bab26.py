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

def generate_bab26():
    base_dir = "app/src/main/java/com/example/chineselearning/data/repository"
    
    stages = {}
    
    # =========================================================================
    # STAGE 1: Rasa Sakit Kepala & Nyeri Fisik (头, 疼, 舒服)
    # =========================================================================
    k1_p1_q4 = make_keys("teng")
    k1_p1_q8 = make_keys("tou")
    k1_p2_q4 = make_keys("shufu")
    k1_p2_q8 = make_keys("touteng")
    
    stages[1] = {
        "p1": [
            f"""    // 1. Soal 1: Pilihan Gambar (疼 -> sakit / nyeri)
    Exercise(
        id = "u26_s1_p1_q1",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "疼",
        targetPinyin = "téng",
        targetTranslation = "sakit / nyeri",
        correctAnswer = "sakit / nyeri",
        audioToSpeak = "疼",
        pictureOptions = listOf(
            PictureOption("u26_s1_p1_opt1", "sakit", "", R.drawable.ic_med_headache, true),
            PictureOption("u26_s1_p1_opt2", "nyaman", "", R.drawable.ic_med_comfort_healthy, false),
            PictureOption("u26_s1_p1_opt3", "obat", "", R.drawable.ic_med_pharmacy_drug, false),
            PictureOption("u26_s1_p1_opt4", "ranjang", "", R.drawable.ic_med_bed_rest, false)
        )
    )""",
            f"""    // 2. Soal 2: Susun Kalimat (Kepala saya agak sakit, ingin tidur sebentar.)
    Exercise(
        id = "u26_s1_p1_q2",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Kepala saya agak sakit, mau tidur.",
        targetHanzi = "我 头 有点 疼， 想 睡 一会儿。",
        targetPinyin = "Wǒ tóu yǒudiǎn téng, xiǎng shuì yíhuìér.",
        wordChips = listOf("我:wǒ", "头:tóu", "有点:yǒudiǎn", "疼，:téng,", "想:xiǎng", "睡:shuì", "一会儿。:yíhuìér.", "好:hǎo"),
        correctAnswer = "我,头,有点,疼，,想,睡,一会儿。",
        audioToSpeak = "我头有点疼，想睡一会儿。"
    )""",
            f"""    // 3. Soal 3: Ketuk Pasangan yang Sesuai (Kepala & Nyeri)
    Exercise(
        id = "u26_s1_p1_q3",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u26_s1_p1_m1", "头", "tóu", "kepala"),
            MatchPairItem("u26_s1_p1_m2", "疼", "téng", "sakit / nyeri"),
            MatchPairItem("u26_s1_p1_m3", "头疼", "tóuténg", "sakit kepala"),
            MatchPairItem("u26_s1_p1_m4", "睡一会儿", "shuì yíhuìér", "tidur sejenak")
        )
    )""",
            f"""    // 4. Soal 4: Ketik Pinyin (sakit/nyeri -> téng)
    Exercise(
        id = "u26_s1_p1_q4",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "sakit / nyeri",
        sentenceWithBlank = "疼 (________)",
        targetHanzi = "疼",
        targetPinyin = "téng",
        correctAnswer = "teng",
        keyboardKeys = {k1_p1_q4},
        audioToSpeak = "疼"
    )""",
            f"""    // 5. Soal 5: Mendengar Kalimat (Rule 10: illustrationRes = 0)
    Exercise(
        id = "u26_s1_p1_q5",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Apa yang Anda dengar?",
        targetTranslation = "Makan terlalu banyak es krim, perut sangat sakit.",
        targetHanzi = "吃 太多 冰淇淋， 肚子 很 疼。",
        targetPinyin = "Chī tài duō bīngqílín, dùzi hěn téng.",
        wordChips = listOf("吃:chī", "太多:tài duō", "冰淇淋，:bīngqílín,", "肚子:dùzi", "很:hěn", "疼。:téng.", "舒服:shūfu"),
        correctAnswer = "吃,太多,冰淇淋，,肚子,很,疼。",
        illustrationRes = 0,
        audioToSpeak = "吃太多冰淇淋，肚子很疼。"
    )""",
            f"""    // 6. Soal 6: Pilihan Kalimat
    Exercise(
        id = "u26_s1_p1_q6",
        type = ExerciseType.SENTENCE_CHOICE,
        title = "Pilih terjemahan yang benar",
        targetHanzi = "你 哪里 觉得 疼？",
        targetPinyin = "Nǐ nǎlǐ juéde téng?",
        targetTranslation = "Di bagian mana Anda merasa sakit?",
        correctAnswer = "Nǐ nǎlǐ juéde téng?\\n你 哪里 觉得 疼？",
        options = listOf(
            "Nǐ nǎlǐ juéde téng?\\n你 哪里 觉得 疼？",
            "Nǐ nǎlǐ juéde shūfu?\\n你 哪里 觉得 舒服？",
            "Tā nǎlǐ juéde téng?\\n他 哪里 觉得 疼？"
        ),
        audioToSpeak = "你哪里觉得疼？"
    )""",
            f"""    // 7. Soal 7: Pilihan Gambar (头 -> kepala)
    Exercise(
        id = "u26_s1_p1_q7",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "头",
        targetPinyin = "tóu",
        targetTranslation = "kepala",
        correctAnswer = "kepala",
        audioToSpeak = "头",
        pictureOptions = listOf(
            PictureOption("u26_s1_p1_opt7_1", "kepala", "", R.drawable.ic_med_headache, true),
            PictureOption("u26_s1_p1_opt7_2", "tidur", "", R.drawable.ic_med_rest_sleep, false),
            PictureOption("u26_s1_p1_opt7_3", "obat", "", R.drawable.ic_med_pharmacy_drug, false),
            PictureOption("u26_s1_p1_opt7_4", "sehat", "", R.drawable.ic_med_comfort_healthy, false)
        )
    )""",
            f"""    // 8. Soal 8: Ketik Pinyin (kepala -> tóu)
    Exercise(
        id = "u26_s1_p1_q8",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "kepala",
        sentenceWithBlank = "头 (________)",
        targetHanzi = "头",
        targetPinyin = "tóu",
        correctAnswer = "tou",
        keyboardKeys = {k1_p1_q8},
        audioToSpeak = "头"
    )""",
            f"""    // 9. Soal 9: Susun Kalimat (Kaki saya sakit tidak bisa berjalan.)
    Exercise(
        id = "u26_s1_p1_q9",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Kaki saya sakit tidak bisa jalan.",
        targetHanzi = "我 脚 疼， 不 能 走。",
        targetPinyin = "Wǒ jiǎo téng, bù néng zǒu.",
        wordChips = listOf("我:wǒ", "脚:jiǎo", "疼，:téng,", "不:bù", "能:néng", "走。:zǒu.", "跑:pǎo"),
        correctAnswer = "我,脚,疼，,不,能,走。",
        audioToSpeak = "我脚疼，不能走。"
    )""",
            f"""    // 10. Soal 10: Ketuk Pasangan yang Sesuai (Rangkuman Keluhan Sakit)
    Exercise(
        id = "u26_s1_p1_m10",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u26_s1_p1_m10_1", "头", "tóu", "kepala"),
            MatchPairItem("u26_s1_p1_m10_2", "疼", "téng", "nyeri"),
            MatchPairItem("u26_s1_p1_m10_3", "脚疼", "jiǎo téng", "sakit kaki"),
            MatchPairItem("u26_s1_p1_m10_4", "肚子疼", "dùzi téng", "sakit perut")
        )
    )"""
        ],
        "p2": [
            f"""    // 1. Soal 1: Pilihan Gambar (舒服 -> nyaman / enak badan)
    Exercise(
        id = "u26_s1_p2_q1",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "舒服",
        targetPinyin = "shūfu",
        targetTranslation = "nyaman / enak badan",
        correctAnswer = "nyaman / enak badan",
        audioToSpeak = "舒服",
        pictureOptions = listOf(
            PictureOption("u26_s1_p2_opt1", "nyaman", "", R.drawable.ic_med_comfort_healthy, true),
            PictureOption("u26_s1_p2_opt2", "sakit kepala", "", R.drawable.ic_med_headache, false),
            PictureOption("u26_s1_p2_opt3", "demam", "", R.drawable.ic_med_thermometer_fever, false),
            PictureOption("u26_s1_p2_opt4", "obat", "", R.drawable.ic_med_pharmacy_drug, false)
        )
    )""",
            f"""    // 2. Soal 2: Susun Kalimat (Hari ini badan saya merasa kurang enak.)
    Exercise(
        id = "u26_s1_p2_q2",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Hari ini tubuh saya kurang enak.",
        targetHanzi = "今天 我 身体 不 舒服。",
        targetPinyin = "Jīntiān wǒ shēntǐ bù shūfu.",
        wordChips = listOf("今天:jīntiān", "我:wǒ", "身体:shēntǐ", "不:bù", "舒服。:shūfu.", "很:hěn"),
        correctAnswer = "今天,我,身体,不,舒服。",
        audioToSpeak = "今天我身体不舒服。"
    )""",
            f"""    // 3. Soal 3: Ketuk Pasangan yang Sesuai (Kenyamanan Tubuh)
    Exercise(
        id = "u26_s1_p2_m3",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u26_s1_p2_m1", "舒服", "shūfu", "nyaman / enak badan"),
            MatchPairItem("u26_s1_p2_m2", "不舒服", "bù shūfu", "kurang enak badan"),
            MatchPairItem("u26_s1_p2_m3", "很舒服", "hěn shūfu", "sangat nyaman"),
            MatchPairItem("u26_s1_p2_m4", "睡得舒服", "shuì de shūfu", "tidur nyenyak")
        )
    )""",
            f"""    // 4. Soal 4: Ketik Pinyin (nyaman -> shūfu)
    Exercise(
        id = "u26_s1_p2_q4",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "nyaman / enak badan",
        sentenceWithBlank = "舒服 (________)",
        targetHanzi = "舒服",
        targetPinyin = "shūfu",
        correctAnswer = "shufu",
        keyboardKeys = {k1_p2_q4},
        audioToSpeak = "舒服"
    )""",
            f"""    // 5. Soal 5: Mendengar Kalimat (Rule 10: illustrationRes = 0)
    Exercise(
        id = "u26_s1_p2_q5",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Apa yang Anda dengar?",
        targetTranslation = "Duduk membaca buku di sofa sangat nyaman.",
        targetHanzi = "坐 着 看书 非常 舒服。",
        targetPinyin = "Zuò zhe kànshū fēicháng shūfu.",
        wordChips = listOf("坐:zuò", "着:zhe", "看书:kànshū", "非常:fēicháng", "舒服。:shūfu.", "累:lèi"),
        correctAnswer = "坐,着,看书,非常,舒服。",
        illustrationRes = 0,
        audioToSpeak = "坐着看书非常舒服。"
    )""",
            f"""    // 6. Soal 6: Pilihan Kalimat
    Exercise(
        id = "u26_s1_p2_q6",
        type = ExerciseType.SENTENCE_CHOICE,
        title = "Pilih terjemahan yang benar",
        targetHanzi = "喝 了 热水， 觉得 舒服 多 了。",
        targetPinyin = "Hē le rèshuǐ, juéde shūfu duō le.",
        targetTranslation = "Minum air hangat, terasa jauh lebih nyaman.",
        correctAnswer = "Hē le rèshuǐ, juéde shūfu duō le.\\n喝 了 热水， 觉得 舒服 多 了。",
        options = listOf(
            "Hē le rèshuǐ, juéde shūfu duō le.\\n喝 了 热水， 觉得 舒服 多 了。",
            "Hē le lěngshuǐ, juéde shūfu duō le.\\n喝 了 冷水， 觉得 舒服 多 了。",
            "Hē le rèchá, juéde bù shūfu.\\n喝 了 热茶， 觉得 不 舒服。"
        ),
        audioToSpeak = "喝了热水，觉得舒服多了。"
    )""",
            f"""    // 7. Soal 7: Pilihan Gambar (不舒服 -> kurang enak badan)
    Exercise(
        id = "u26_s1_p2_q7",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "不舒服",
        targetPinyin = "bù shūfu",
        targetTranslation = "kurang enak badan",
        correctAnswer = "kurang enak badan",
        audioToSpeak = "不舒服",
        pictureOptions = listOf(
            PictureOption("u26_s1_p2_opt7_1", "kurang enak badan", "", R.drawable.ic_med_headache, true),
            PictureOption("u26_s1_p2_opt7_2", "sehat", "", R.drawable.ic_med_comfort_healthy, false),
            PictureOption("u26_s1_p2_opt7_3", "ranjang", "", R.drawable.ic_med_bed_rest, false),
            PictureOption("u26_s1_p2_opt7_4", "obat", "", R.drawable.ic_med_pharmacy_drug, false)
        )
    )""",
            f"""    // 8. Soal 8: Ketik Pinyin (sakit kepala -> tóuténg)
    Exercise(
        id = "u26_s1_p2_q8",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "sakit kepala",
        sentenceWithBlank = "头疼 (________)",
        targetHanzi = "头疼",
        targetPinyin = "tóuténg",
        correctAnswer = "touteng",
        keyboardKeys = {k1_p2_q8},
        audioToSpeak = "头疼"
    )""",
            f"""    // 9. Soal 9: Susun Kalimat (Hari ini saya tidak enak badan, minta izin tidak masuk sekolah.)
    Exercise(
        id = "u26_s1_p2_q9",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Saya tidak enak badan, tidak masuk sekolah.",
        targetHanzi = "我 不 舒服， 不 来 学校。",
        targetPinyin = "Wǒ bù shūfu, bù lái xuéxiào.",
        wordChips = listOf("我:wǒ", "不:bù", "舒服，:shūfu,", "不:bù", "来:lái", "学校。:xuéxiào.", "去:qù"),
        correctAnswer = "我,不,舒服，,不,来,学校。",
        audioToSpeak = "我不舒服，不来学校。"
    )""",
            f"""    // 10. Soal 10: Ketuk Pasangan yang Sesuai (Rangkuman Gejala Fisik)
    Exercise(
        id = "u26_s1_p2_m10",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u26_s1_p2_m10_1", "舒服", "shūfu", "nyaman"),
            MatchPairItem("u26_s1_p2_m10_2", "头疼", "tóuténg", "pusing kepala"),
            MatchPairItem("u26_s1_p2_m10_3", "喝热水", "hē rèshuǐ", "minum air hangat"),
            MatchPairItem("u26_s1_p2_m10_4", "不来学校", "bù lái xuéxiào", "tidak ke sekolah")
        )
    )"""
        ]
    }

    # =========================================================================
    # STAGE 2: Membeli Obat di Apotek & Istirahat Ranjang (药, 药店, 床)
    # =========================================================================
    k2_p1_q4 = make_keys("yao")
    k2_p1_q8 = make_keys("yaodian")
    k2_p2_q4 = make_keys("chuang")
    k2_p2_q8 = make_keys("chiyao")
    
    stages[2] = {
        "p1": [
            f"""    // 1. Soal 1: Pilihan Gambar (药 -> obat)
    Exercise(
        id = "u26_s2_p1_q1",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "药",
        targetPinyin = "yào",
        targetTranslation = "obat",
        correctAnswer = "obat",
        audioToSpeak = "药",
        pictureOptions = listOf(
            PictureOption("u26_s2_p1_opt1", "obat", "", R.drawable.ic_med_pharmacy_drug, true),
            PictureOption("u26_s2_p1_opt2", "ranjang", "", R.drawable.ic_med_bed_rest, false),
            PictureOption("u26_s2_p1_opt3", "tidur", "", R.drawable.ic_med_rest_sleep, false),
            PictureOption("u26_s2_p1_opt4", "pusing", "", R.drawable.ic_med_headache, false)
        )
    )""",
            f"""    // 2. Soal 2: Susun Kalimat (Dokter berkata obat ini harus diminum tiga kali sehari.)
    Exercise(
        id = "u26_s2_p1_q2",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Obat ini diminum tiga kali sehari.",
        targetHanzi = "这 种 药 一天 吃 三 次。",
        targetPinyin = "Zhè zhǒng yào yìtiān chī sān cì.",
        wordChips = listOf("这:zhè", "种:zhǒng", "药:yào", "一天:yìtiān", "吃:chī", "三:sān", "次。:cì.", "两:liǎng"),
        correctAnswer = "这,种,药,一天,吃,三,次。",
        audioToSpeak = "这种药一天吃三次。"
    )""",
            f"""    // 3. Soal 3: Ketuk Pasangan yang Sesuai (Obat & Apotek)
    Exercise(
        id = "u26_s2_p1_q3",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u26_s2_p1_m1", "药", "yào", "obat"),
            MatchPairItem("u26_s2_p1_m2", "药店", "yàodiàn", "apotek / toko obat"),
            MatchPairItem("u26_s2_p1_m3", "吃药", "chī yào", "minum obat"),
            MatchPairItem("u26_s2_p1_m4", "三次", "sān cì", "tiga kali")
        )
    )""",
            f"""    // 4. Soal 4: Ketik Pinyin (obat -> yào)
    Exercise(
        id = "u26_s2_p1_q4",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "obat",
        sentenceWithBlank = "药 (________)",
        targetHanzi = "药",
        targetPinyin = "yào",
        correctAnswer = "yao",
        keyboardKeys = {k2_p1_q4},
        audioToSpeak = "药"
    )""",
            f"""    // 5. Soal 5: Mendengar Kalimat (Rule 10: illustrationRes = 0)
    Exercise(
        id = "u26_s2_p1_q5",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Apa yang Anda dengar?",
        targetTranslation = "Di seberang jalan ada sebuah apotek.",
        targetHanzi = "马路 对面 有 一 家 药店。",
        targetPinyin = "Mǎlù duìmiàn yǒu yì jiā yàodiàn.",
        wordChips = listOf("马路:mǎlù", "对面:duìmiàn", "有:yǒu", "一:yì", "家:jiā", "药店。:yàodiàn.", "饭馆:fànguǎn"),
        correctAnswer = "马路,对面,有,一,家,药店。",
        illustrationRes = 0,
        audioToSpeak = "马路对面有一家药店。"
    )""",
            f"""    // 6. Soal 6: Pilihan Kalimat
    Exercise(
        id = "u26_s2_p1_q6",
        type = ExerciseType.SENTENCE_CHOICE,
        title = "Pilih terjemahan yang benar",
        targetHanzi = "你 吃 药 了 没有？",
        targetPinyin = "Nǐ chī yào le méiyǒu?",
        targetTranslation = "Kamu sudah minum obat belum?",
        correctAnswer = "Nǐ chī yào le méiyǒu?\\n你 吃 药 了 没有？",
        options = listOf(
            "Nǐ chī yào le méiyǒu?\\n你 吃 药 了 没有？",
            "Nǐ chī fàn le méiyǒu?\\n你 吃 饭 了 没有？",
            "Tā chī yào le méiyǒu?\\n他 吃 药 了 没有？"
        ),
        audioToSpeak = "你吃药了没有？"
    )""",
            f"""    // 7. Soal 7: Pilihan Gambar (药店 -> apotek)
    Exercise(
        id = "u26_s2_p1_q7",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "药店",
        targetPinyin = "yàodiàn",
        targetTranslation = "apotek",
        correctAnswer = "apotek",
        audioToSpeak = "药店",
        pictureOptions = listOf(
            PictureOption("u26_s2_p1_opt7_1", "apotek", "", R.drawable.ic_med_pharmacy_drug, true),
            PictureOption("u26_s2_p1_opt7_2", "ranjang", "", R.drawable.ic_med_bed_rest, false),
            PictureOption("u26_s2_p1_opt7_3", "sehat", "", R.drawable.ic_med_comfort_healthy, false),
            PictureOption("u26_s2_p1_opt7_4", "tidur", "", R.drawable.ic_med_rest_sleep, false)
        )
    )""",
            f"""    // 8. Soal 8: Ketik Pinyin (apotek -> yàodiàn)
    Exercise(
        id = "u26_s2_p1_q8",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "apotek / toko obat",
        sentenceWithBlank = "药店 (________)",
        targetHanzi = "药店",
        targetPinyin = "yàodiàn",
        correctAnswer = "yaodian",
        keyboardKeys = {k2_p1_q8},
        audioToSpeak = "药店"
    )""",
            f"""    // 9. Soal 9: Susun Kalimat (Saya pergi ke apotek membeli obat.)
    Exercise(
        id = "u26_s2_p1_q9",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Saya ke apotek beli obat.",
        targetHanzi = "我 去 药店 买 药。",
        targetPinyin = "Wǒ qù yàodiàn mǎi yào.",
        wordChips = listOf("我:wǒ", "去:qù", "药店:yàodiàn", "买:mǎi", "药。:yào.", "卖:mài"),
        correctAnswer = "我,去,药店,买,药。",
        audioToSpeak = "我去药店买药。"
    )""",
            f"""    // 10. Soal 10: Ketuk Pasangan yang Sesuai (Rangkuman Obat & Apotek)
    Exercise(
        id = "u26_s2_p1_m10",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u26_s2_p1_m10_1", "买药", "mǎi yào", "beli obat"),
            MatchPairItem("u26_s2_p1_m10_2", "去药店", "qù yàodiàn", "ke apotek"),
            MatchPairItem("u26_s2_p1_m10_3", "吃完药", "chī wán yào", "selesai minum obat"),
            MatchPairItem("u26_s2_p1_m10_4", "一家药店", "yì jiā yàodiàn", "sebuah apotek")
        )
    )"""
        ],
        "p2": [
            f"""    // 1. Soal 1: Pilihan Gambar (床 -> ranjang / tempat tidur)
    Exercise(
        id = "u26_s2_p2_q1",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "床",
        targetPinyin = "chuáng",
        targetTranslation = "ranjang / tempat tidur",
        correctAnswer = "ranjang / tempat tidur",
        audioToSpeak = "床",
        pictureOptions = listOf(
            PictureOption("u26_s2_p2_opt1", "ranjang", "", R.drawable.ic_med_bed_rest, true),
            PictureOption("u26_s2_p2_opt2", "istirahat", "", R.drawable.ic_med_rest_sleep, false),
            PictureOption("u26_s2_p2_opt3", "obat", "", R.drawable.ic_med_pharmacy_drug, false),
            PictureOption("u26_s2_p2_opt4", "sehat", "", R.drawable.ic_med_comfort_healthy, false)
        )
    )""",
            f"""    // 2. Soal 2: Susun Kalimat (Pasien sedang beristirahat dengan baik di atas ranjang.)
    Exercise(
        id = "u26_s2_p2_q2",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Pasien istirahat di ranjang.",
        targetHanzi = "病人 在 床 上 休息。",
        targetPinyin = "Bìngrén zài chuáng shang xiūxi.",
        wordChips = listOf("病人:bìngrén", "在:zài", "床:chuáng", "上:shang", "休息。:xiūxi.", "坐:zuò"),
        correctAnswer = "病人,在,床,上,休息。",
        audioToSpeak = "病人在床上休息。"
    )""",
            f"""    // 3. Soal 3: Ketuk Pasangan yang Sesuai (Ranjang & Istirahat)
    Exercise(
        id = "u26_s2_p2_m3",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u26_s2_p2_m1", "床", "chuáng", "ranjang"),
            MatchPairItem("u26_s2_p2_m2", "休息", "xiūxi", "beristirahat"),
            MatchPairItem("u26_s2_p2_m3", "起床", "qǐchuáng", "bangun tidur"),
            MatchPairItem("u26_s2_p2_m4", "一张床", "yì zhāng chuáng", "sebuah ranjang")
        )
    )""",
            f"""    // 4. Soal 4: Ketik Pinyin (ranjang -> chuáng)
    Exercise(
        id = "u26_s2_p2_q4",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "ranjang / tempat tidur",
        sentenceWithBlank = "床 (________)",
        targetHanzi = "床",
        targetPinyin = "chuáng",
        correctAnswer = "chuang",
        keyboardKeys = {k2_p2_q4},
        audioToSpeak = "床"
    )""",
            f"""    // 5. Soal 5: Mendengar Kalimat (Rule 10: illustrationRes = 0)
    Exercise(
        id = "u26_s2_p2_q5",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Apa yang Anda dengar?",
        targetTranslation = "Kamu cepatlah berbaring di atas ranjang istirahat.",
        targetHanzi = "你 快 躺 在 床 上 休息。",
        targetPinyin = "Nǐ kuài tǎng zài chuáng shang xiūxi.",
        wordChips = listOf("你:nǐ", "快:kuài", "躺:tǎng", "在:zài", "床:chuáng", "上:shang", "休息。:xiūxi.", "看书:kànshū"),
        correctAnswer = "你,快,躺,在,床,上,休息。",
        illustrationRes = 0,
        audioToSpeak = "你快躺在床上休息。"
    )""",
            f"""    // 6. Soal 6: Pilihan Kalimat
    Exercise(
        id = "u26_s2_p2_q6",
        type = ExerciseType.SENTENCE_CHOICE,
        title = "Pilih terjemahan yang benar",
        targetHanzi = "这 张 床 非常 大， 也 很 舒服。",
        targetPinyin = "Zhè zhāng chuáng fēicháng dà, yě hěn shūfu.",
        targetTranslation = "Ranjang ini sangat besar, dan juga sangat nyaman.",
        correctAnswer = "Zhè zhāng chuáng fēicháng dà, yě hěn shūfu.\\n这 张 床 非常 大， 也 很 舒服。",
        options = listOf(
            "Zhè zhāng chuáng fēicháng dà, yě hěn shūfu.\\n这 张 床 非常 大， 也 很 舒服。",
            "Zhè zhāng chuáng fēicháng xiǎo, bù shūfu.\\n这 张 床 非常 小， 不 舒服。",
            "Zhè bǎ yǐzi fēicháng dà, yě hěn shūfu.\\n这 把 椅子 非常 大， 也 很 舒服。"
        ),
        audioToSpeak = "这张床非常大，也很舒服。"
    )""",
            f"""    // 7. Soal 7: Pilihan Gambar (床 -> tempat tidur)
    Exercise(
        id = "u26_s2_p2_q7",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "床",
        targetPinyin = "chuáng",
        targetTranslation = "tempat tidur",
        correctAnswer = "tempat tidur",
        audioToSpeak = "床",
        pictureOptions = listOf(
            PictureOption("u26_s2_p2_opt7_1", "tempat tidur", "", R.drawable.ic_med_bed_rest, true),
            PictureOption("u26_s2_p2_opt7_2", "obat", "", R.drawable.ic_med_pharmacy_drug, false),
            PictureOption("u26_s2_p2_opt7_3", "sehat", "", R.drawable.ic_med_comfort_healthy, false),
            PictureOption("u26_s2_p2_opt7_4", "pusing", "", R.drawable.ic_med_headache, false)
        )
    )""",
            f"""    // 8. Soal 8: Ketik Pinyin (minum obat -> chīyào)
    Exercise(
        id = "u26_s2_p2_q8",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "minum obat",
        sentenceWithBlank = "吃药 (________)",
        targetHanzi = "吃药",
        targetPinyin = "chīyào",
        correctAnswer = "chiyao",
        keyboardKeys = {k2_p2_q8},
        audioToSpeak = "吃药"
    )""",
            f"""    // 9. Soal 9: Susun Kalimat (Minum obat lalu tidur di ranjang.)
    Exercise(
        id = "u26_s2_p2_q9",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Minum obat lalu tidur di ranjang.",
        targetHanzi = "吃 了 药 在 床 上 睡。",
        targetPinyin = "Chī le yào zài chuáng shang shuì.",
        wordChips = listOf("吃:chī", "了:le", "药:yào", "在:zài", "床:chuáng", "上:shang", "睡。:shuì.", "玩:wán"),
        correctAnswer = "吃,了,药,在,床,上,睡。",
        audioToSpeak = "吃了药在床上睡。"
    )""",
            f"""    // 10. Soal 10: Ketuk Pasangan yang Sesuai (Rangkuman Istirahat di Ranjang)
    Exercise(
        id = "u26_s2_p2_m10",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u26_s2_p2_m10_1", "床", "chuáng", "tempat tidur"),
            MatchPairItem("u26_s2_p2_m10_2", "吃药", "chī yào", "minum obat"),
            MatchPairItem("u26_s2_p2_m10_3", "躺在床上", "tǎng zài chuáng shang", "baring di kasur"),
            MatchPairItem("u26_s2_p2_m10_4", "好好休息", "hǎohāo xiūxi", "istirahat nyenyak")
        )
    )"""
        ]
    }

    # =========================================================================
    # STAGE 3: Meminta Bantuan & Tolong Menolong (帮, 帮忙, 等)
    # =========================================================================
    k3_p1_q4 = make_keys("bang")
    k3_p1_q8 = make_keys("bangmang")
    k3_p2_q4 = make_keys("deng")
    k3_p2_q8 = make_keys("qingbang")
    
    stages[3] = {
        "p1": [
            f"""    // 1. Soal 1: Pilihan Gambar (帮 -> membantu / menolong)
    Exercise(
        id = "u26_s3_p1_q1",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "帮",
        targetPinyin = "bāng",
        targetTranslation = "membantu / menolong",
        correctAnswer = "membantu / menolong",
        audioToSpeak = "帮",
        pictureOptions = listOf(
            PictureOption("u26_s3_p1_opt1", "membantu", "", R.drawable.ic_med_comfort_healthy, true),
            PictureOption("u26_s3_p1_opt2", "istirahat", "", R.drawable.ic_med_rest_sleep, false),
            PictureOption("u26_s3_p1_opt3", "obat", "", R.drawable.ic_med_pharmacy_drug, false),
            PictureOption("u26_s3_p1_opt4", "ranjang", "", R.drawable.ic_med_bed_rest, false)
        )
    )""",
            f"""    // 2. Soal 2: Susun Kalimat (Bisakah kamu membantu saya membeli obat?)
    Exercise(
        id = "u26_s3_p1_q2",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Bisa bantu saya beli obat?",
        targetHanzi = "你 能 帮 我 买 药 吗？",
        targetPinyin = "Nǐ néng bāng wǒ mǎi yào ma?",
        wordChips = listOf("你:nǐ", "能:néng", "帮:bāng", "我:wǒ", "买:mǎi", "药:yào", "吗？:ma?", "吃:chī"),
        correctAnswer = "你,能,帮,我,买,药,吗？",
        audioToSpeak = "你能帮我买药吗？"
    )""",
            f"""    // 3. Soal 3: Ketuk Pasangan yang Sesuai (Menolong & Bantuan)
    Exercise(
        id = "u26_s3_p1_q3",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u26_s3_p1_m1", "帮", "bāng", "membantu"),
            MatchPairItem("u26_s3_p1_m2", "帮忙", "bāngmáng", "memberi bantuan"),
            MatchPairItem("u26_s3_p1_m3", "帮我", "bāng wǒ", "menolong saya"),
            MatchPairItem("u26_s3_p1_m4", "谢谢你", "xièxie nǐ", "terima kasih")
        )
    )""",
            f"""    // 4. Soal 4: Ketik Pinyin (membantu -> bāng)
    Exercise(
        id = "u26_s3_p1_q4",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "membantu / menolong",
        sentenceWithBlank = "帮 (________)",
        targetHanzi = "帮",
        targetPinyin = "bāng",
        correctAnswer = "bang",
        keyboardKeys = {k3_p1_q4},
        audioToSpeak = "帮"
    )""",
            f"""    // 5. Soal 5: Mendengar Kalimat (Rule 10: illustrationRes = 0)
    Exercise(
        id = "u26_s3_p1_q5",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Apa yang Anda dengar?",
        targetTranslation = "Terima kasih hari ini kamu telah banyak membantuku.",
        targetHanzi = "谢谢 你 帮 我 的 忙。",
        targetPinyin = "Xièxie nǐ bāng wǒ de máng.",
        wordChips = listOf("谢谢:xièxie", "你:nǐ", "帮:bāng", "我:wǒ", "的:de", "忙。:máng.", "他:tā"),
        correctAnswer = "谢谢,你,帮,我,的,忙。",
        illustrationRes = 0,
        audioToSpeak = "谢谢你帮我的忙。"
    )""",
            f"""    // 6. Soal 6: Pilihan Kalimat
    Exercise(
        id = "u26_s3_p1_q6",
        type = ExerciseType.SENTENCE_CHOICE,
        title = "Pilih terjemahan yang benar",
        targetHanzi = "大家 互相 帮助。",
        targetPinyin = "Dàjiā hùxiāng bāngzhù.",
        targetTranslation = "Semua orang saling membantu.",
        correctAnswer = "Dàjiā hùxiāng bāngzhù.\\n大家 互相 帮助。",
        options = listOf(
            "Dàjiā hùxiāng bāngzhù.\\n大家 互相 帮助。",
            "Dàjiā dōu bù bāngzhù.\\n大家 都 不 帮助。",
            "Tāmen hùxiāng bāngzhù.\\n他们 互相 帮助。"
        ),
        audioToSpeak = "大家互相帮助。"
    )""",
            f"""    // 7. Soal 7: Pilihan Gambar (帮忙 -> memberi pertolongan)
    Exercise(
        id = "u26_s3_p1_q7",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "帮忙",
        targetPinyin = "bāngmáng",
        targetTranslation = "memberi bantuan",
        correctAnswer = "memberi bantuan",
        audioToSpeak = "帮忙",
        pictureOptions = listOf(
            PictureOption("u26_s3_p1_opt7_1", "bantuan", "", R.drawable.ic_med_comfort_healthy, true),
            PictureOption("u26_s3_p1_opt7_2", "pusing", "", R.drawable.ic_med_headache, false),
            PictureOption("u26_s3_p1_opt7_3", "ranjang", "", R.drawable.ic_med_bed_rest, false),
            PictureOption("u26_s3_p1_opt7_4", "obat", "", R.drawable.ic_med_pharmacy_drug, false)
        )
    )""",
            f"""    // 8. Soal 8: Ketik Pinyin (memberi bantuan -> bāngmáng)
    Exercise(
        id = "u26_s3_p1_q8",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "membantu / memberi bantuan",
        sentenceWithBlank = "帮忙 (________)",
        targetHanzi = "帮忙",
        targetPinyin = "bāngmáng",
        correctAnswer = "bangmang",
        keyboardKeys = {k3_p1_q8},
        audioToSpeak = "帮忙"
    )""",
            f"""    // 9. Soal 9: Susun Kalimat (Saya butuh bantuanmu.)
    Exercise(
        id = "u26_s3_p1_q9",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Saya butuh bantuanmu.",
        targetHanzi = "请 你 帮 我 忙。",
        targetPinyin = "Qǐng nǐ bāng wǒ máng.",
        wordChips = listOf("请:qǐng", "你:nǐ", "帮:bāng", "我:wǒ", "忙。:máng.", "他:tā"),
        correctAnswer = "请,你,帮,我,忙。",
        audioToSpeak = "请你帮我忙。"
    )""",
            f"""    // 10. Soal 10: Ketuk Pasangan yang Sesuai (Rangkuman Saling Membantu)
    Exercise(
        id = "u26_s3_p1_m10",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u26_s3_p1_m10_1", "帮", "bāng", "menolong"),
            MatchPairItem("u26_s3_p1_m2", "帮忙", "bāngmáng", "bantuan"),
            MatchPairItem("u26_s3_p1_m3", "帮大忙", "bāng dàmáng", "bantuan besar"),
            MatchPairItem("u26_s3_p1_m4", "太感谢", "tài gǎnxiè", "sangat terima kasih")
        )
    )"""
        ],
        "p2": [
            f"""    // 1. Soal 1: Pilihan Gambar (等 -> menunggu)
    Exercise(
        id = "u26_s3_p2_q1",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "等",
        targetPinyin = "děng",
        targetTranslation = "menunggu",
        correctAnswer = "menunggu",
        audioToSpeak = "等",
        pictureOptions = listOf(
            PictureOption("u26_s3_p2_opt1", "menunggu", "", R.drawable.ic_med_rest_sleep, true),
            PictureOption("u26_s3_p2_opt2", "sakit", "", R.drawable.ic_med_headache, false),
            PictureOption("u26_s3_p2_opt3", "obat", "", R.drawable.ic_med_pharmacy_drug, false),
            PictureOption("u26_s3_p2_opt4", "ranjang", "", R.drawable.ic_med_bed_rest, false)
        )
    )""",
            f"""    // 2. Soal 2: Susun Kalimat (Silakan tunggu sebentar di ruang tunggu apotek.)
    Exercise(
        id = "u26_s3_p2_q2",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Silakan tunggu sebentar di apotek.",
        targetHanzi = "请 在 药店 等 一会儿。",
        targetPinyin = "Qǐng zài yàodiàn děng yíhuìér.",
        wordChips = listOf("请:qǐng", "在:zài", "药店:yàodiàn", "等:děng", "一会儿。:yíhuìér.", "去:qù"),
        correctAnswer = "请,在,药店,等,一会儿。",
        audioToSpeak = "请在药店等一会儿。"
    )""",
            f"""    // 3. Soal 3: Ketuk Pasangan yang Sesuai (Menunggu)
    Exercise(
        id = "u26_s3_p2_m3",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u26_s3_p2_m1", "等", "děng", "menunggu"),
            MatchPairItem("u26_s3_p2_m2", "等一会儿", "děng yíhuìér", "tunggu sejenak"),
            MatchPairItem("u26_s3_p2_m3", "等医生", "děng yīshēng", "menunggu dokter"),
            MatchPairItem("u26_s3_p2_m4", "等等", "děngděng", "dan lain-lain / tunggu")
        )
    )""",
            f"""    // 4. Soal 4: Ketik Pinyin (menunggu -> děng)
    Exercise(
        id = "u26_s3_p2_q4",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "menunggu",
        sentenceWithBlank = "等 (________)",
        targetHanzi = "等",
        targetPinyin = "děng",
        correctAnswer = "deng",
        keyboardKeys = {k3_p2_q4},
        audioToSpeak = "等"
    )""",
            f"""    // 5. Soal 5: Mendengar Kalimat (Rule 10: illustrationRes = 0)
    Exercise(
        id = "u26_s3_p2_q5",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Apa yang Anda dengar?",
        targetTranslation = "Saya sedang menunggu dokter memeriksa.",
        targetHanzi = "我 在 等 医生 看病。",
        targetPinyin = "Wǒ zài děng yīshēng kànbìng.",
        wordChips = listOf("我:wǒ", "在:zài", "等:děng", "医生:yīshēng", "看病。:kànbìng.", "走:zǒu"),
        correctAnswer = "我,在,等,医生,看病。",
        illustrationRes = 0,
        audioToSpeak = "我在等医生看病。"
    )""",
            f"""    // 6. Soal 6: Pilihan Kalimat
    Exercise(
        id = "u26_s3_p2_q6",
        type = ExerciseType.SENTENCE_CHOICE,
        title = "Pilih terjemahan yang benar",
        targetHanzi = "你 在 这里 等 我 一下， 我 去 买 药。",
        targetPinyin = "Nǐ zài zhèlǐ děng wǒ yíxià, wǒ qù mǎi yào.",
        targetTranslation = "Kamu tunggu saya sebentar di sini, saya pergi membeli obat.",
        correctAnswer = "Nǐ zài zhèlǐ děng wǒ yíxià, wǒ qù mǎi yào.\\n你 在 这里 等 我 一下， 我 去 买 药。",
        options = listOf(
            "Nǐ zài zhèlǐ děng wǒ yíxià, wǒ qù mǎi yào.\\n你 在 这里 等 我 一下， 我 去 买 药。",
            "Wǒ zài zhèlǐ děng nǐ yíxià, nǐ qù mǎi yào.\\n我 在 这里 等 你 一下， 你 去 买 药。",
            "Nǐ zài zhèlǐ děng wǒ yíxià, wǒ qù mǎi fàn.\\n你 在 这里 等 我 一下， 我 去 买 饭。"
        ),
        audioToSpeak = "你在这里等我一下，我去买药。"
    )""",
            f"""    // 7. Soal 7: Pilihan Gambar (等一会儿 -> tunggu sebentar)
    Exercise(
        id = "u26_s3_p2_q7",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "等一会儿",
        targetPinyin = "děng yíhuìér",
        targetTranslation = "tunggu sejenak",
        correctAnswer = "tunggu sejenak",
        audioToSpeak = "等一会儿",
        pictureOptions = listOf(
            PictureOption("u26_s3_p2_opt7_1", "menunggu", "", R.drawable.ic_med_rest_sleep, true),
            PictureOption("u26_s3_p2_opt7_2", "obat", "", R.drawable.ic_med_pharmacy_drug, false),
            PictureOption("u26_s3_p2_opt7_3", "sehat", "", R.drawable.ic_med_comfort_healthy, false),
            PictureOption("u26_s3_p2_opt7_4", "ranjang", "", R.drawable.ic_med_bed_rest, false)
        )
    )""",
            f"""    // 8. Soal 8: Ketik Pinyin (tolong bantu -> qǐngbāng)
    Exercise(
        id = "u26_s3_p2_q8",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "tolong bantu",
        sentenceWithBlank = "请帮 (________)",
        targetHanzi = "请帮",
        targetPinyin = "qǐngbāng",
        correctAnswer = "qingbang",
        keyboardKeys = {k3_p2_q8},
        audioToSpeak = "请帮"
    )""",
            f"""    // 9. Soal 9: Susun Kalimat (Tolong bantu saya mengambil obat.)
    Exercise(
        id = "u26_s3_p2_q9",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Tolong bantu saya mengambil obat.",
        targetHanzi = "请 帮 我 拿 药。",
        targetPinyin = "Qǐng bāng wǒ ná yào.",
        wordChips = listOf("请:qǐng", "帮:bāng", "我:wǒ", "拿:ná", "药。:yào.", "水:shuǐ"),
        correctAnswer = "请,帮,我,拿,药。",
        audioToSpeak = "请帮我拿药。"
    )""",
            f"""    // 10. Soal 10: Ketuk Pasangan yang Sesuai (Rangkuman Menunggu Bantuan)
    Exercise(
        id = "u26_s3_p2_m10",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u26_s3_p2_m10_1", "等一等", "děng yi děng", "tunggu sebentar"),
            MatchPairItem("u26_s3_p2_m10_2", "请帮我", "qǐng bāng wǒ", "tolong bantu"),
            MatchPairItem("u26_s3_p2_m10_3", "去拿药", "qù ná yào", "ambil obat"),
            MatchPairItem("u26_s3_p2_m10_4", "看病", "kànbìng", "berobat")
        )
    )"""
        ]
    }

    # =========================================================================
    # STAGE 4: Memberi Kabar & Harapan Kesembuhan (告诉, 希望)
    # =========================================================================
    k4_p1_q4 = make_keys("gaosu")
    k4_p1_q8 = make_keys("xiwang")
    k4_p2_q4 = make_keys("kuaidian")
    k4_p2_q8 = make_keys("haoqilai")
    
    stages[4] = {
        "p1": [
            f"""    // 1. Soal 1: Pilihan Gambar (告诉 -> memberitahu / mengabari)
    Exercise(
        id = "u26_s4_p1_q1",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "告诉",
        targetPinyin = "gàosu",
        targetTranslation = "memberitahu / mengabari",
        correctAnswer = "memberitahu / mengabari",
        audioToSpeak = "告诉",
        pictureOptions = listOf(
            PictureOption("u26_s4_p1_opt1", "memberitahu", "", R.drawable.ic_med_comfort_healthy, true),
            PictureOption("u26_s4_p1_opt2", "sakit", "", R.drawable.ic_med_headache, false),
            PictureOption("u26_s4_p1_opt3", "obat", "", R.drawable.ic_med_pharmacy_drug, false),
            PictureOption("u26_s4_p1_opt4", "ranjang", "", R.drawable.ic_med_bed_rest, false)
        )
    )""",
            f"""    // 2. Soal 2: Susun Kalimat (Tolong beritahukan dokter saya sakit kepala.)
    Exercise(
        id = "u26_s4_p1_q2",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Tolong beritahu dokter saya pusing.",
        targetHanzi = "请 告诉 医生 我 头疼。",
        targetPinyin = "Qǐng gàosu yīshēng wǒ tóuténg.",
        wordChips = listOf("请:qǐng", "告诉:gàosu", "医生:yīshēng", "我:wǒ", "头疼。:tóuténg.", "脚疼:jiǎoténg"),
        correctAnswer = "请,告诉,医生,我,头疼。",
        audioToSpeak = "请告诉医生我头疼。"
    )""",
            f"""    // 3. Soal 3: Ketuk Pasangan yang Sesuai (Mengabari & Berharap)
    Exercise(
        id = "u26_s4_p1_q3",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u26_s4_p1_m1", "告诉", "gàosu", "memberitahu"),
            MatchPairItem("u26_s4_p1_m2", "希望", "xīwàng", "berharap / semoga"),
            MatchPairItem("u26_s4_p1_m3", "早日康复", "zǎorì kāngfù", "lekas sembuh"),
            MatchPairItem("u26_s4_p1_m4", "好起来", "hǎo qǐlai", "membaik sembuh")
        )
    )""",
            f"""    // 4. Soal 4: Ketik Pinyin (memberitahu -> gàosu)
    Exercise(
        id = "u26_s4_p1_q4",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "memberitahu / mengabarkan",
        sentenceWithBlank = "告诉 (________)",
        targetHanzi = "告诉",
        targetPinyin = "gàosu",
        correctAnswer = "gaosu",
        keyboardKeys = {k4_p1_q4},
        audioToSpeak = "告诉"
    )""",
            f"""    // 5. Soal 5: Mendengar Kalimat (Rule 10: illustrationRes = 0)
    Exercise(
        id = "u26_s4_p1_q5",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Apa yang Anda dengar?",
        targetTranslation = "Saya berharap kamu bisa segera sembuh membaik.",
        targetHanzi = "我 希望 你 快点 好起来。",
        targetPinyin = "Wǒ xīwàng nǐ kuàidiǎn hǎoqǐlai.",
        wordChips = listOf("我:wǒ", "希望:xīwàng", "你:nǐ", "快点:kuàidiǎn", "好起来。:hǎoqǐlai.", "慢:màn"),
        correctAnswer = "我,希望,你,快点,好起来。",
        illustrationRes = 0,
        audioToSpeak = "我希望你快点好起来。"
    )""",
            f"""    // 6. Soal 6: Pilihan Kalimat
    Exercise(
        id = "u26_s4_p1_q6",
        type = ExerciseType.SENTENCE_CHOICE,
        title = "Pilih terjemahan yang benar",
        targetHanzi = "请 把 这 件 事 告诉 老师。",
        targetPinyin = "Qǐng bǎ zhè jiàn shì gàosu lǎoshī.",
        targetTranslation = "Tolong beritahukan hal ini kepada guru.",
        correctAnswer = "Qǐng bǎ zhè jiàn shì gàosu lǎoshī.\\n请 把 这 件 事 告诉 老师。",
        options = listOf(
            "Qǐng bǎ zhè jiàn shì gàosu lǎoshī.\\n请 把 这 件 事 告诉 老师。",
            "Qǐng bǎ zhè jiàn shì gàosu yīshēng.\\n请 把 这 件 事 告诉 医生。",
            "Qǐng bǎ zhè běn shū sòng gěi lǎoshī.\\n请 把 这 本 书 送 给 老师。"
        ),
        audioToSpeak = "请把这件事告诉老师。"
    )""",
            f"""    // 7. Soal 7: Pilihan Gambar (希望 -> berharap semoga)
    Exercise(
        id = "u26_s4_p1_q7",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "希望",
        targetPinyin = "xīwàng",
        targetTranslation = "berharap / semoga",
        correctAnswer = "berharap / semoga",
        audioToSpeak = "希望",
        pictureOptions = listOf(
            PictureOption("u26_s4_p1_opt7_1", "harapan sembuh", "", R.drawable.ic_med_comfort_healthy, true),
            PictureOption("u26_s4_p1_opt7_2", "demam", "", R.drawable.ic_med_thermometer_fever, false),
            PictureOption("u26_s4_p1_opt7_3", "pusing", "", R.drawable.ic_med_headache, false),
            PictureOption("u26_s4_p1_opt7_4", "istirahat", "", R.drawable.ic_med_rest_sleep, false)
        )
    )""",
            f"""    // 8. Soal 8: Ketik Pinyin (berharap/semoga -> xīwàng)
    Exercise(
        id = "u26_s4_p1_q8",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "berharap / semoga",
        sentenceWithBlank = "希望 (________)",
        targetHanzi = "希望",
        targetPinyin = "xīwàng",
        correctAnswer = "xiwang",
        keyboardKeys = {k4_p1_q8},
        audioToSpeak = "希望"
    )""",
            f"""    // 9. Soal 9: Susun Kalimat (Semoga semua orang sehat selalu.)
    Exercise(
        id = "u26_s4_p1_q9",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Semoga semua orang sehat.",
        targetHanzi = "希望 大家 身体 健康。",
        targetPinyin = "Xīwàng dàjiā shēntǐ jiànkāng.",
        wordChips = listOf("希望:xīwàng", "大家:dàjiā", "身体:shēntǐ", "健康。:jiànkāng.", "生病:shēngbìng"),
        correctAnswer = "希望,大家,身体,健康。",
        audioToSpeak = "希望大家身体健康。"
    )""",
            f"""    // 10. Soal 10: Ketuk Pasangan yang Sesuai (Rangkuman Doa Kesembuhan)
    Exercise(
        id = "u26_s4_p1_m10",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u26_s4_p1_m10_1", "希望", "xīwàng", "semoga"),
            MatchPairItem("u26_s4_p1_m10_2", "告诉", "gàosu", "memberitahu"),
            MatchPairItem("u26_s4_p1_m3", "身体健康", "shēntǐ jiànkāng", "badan sehat"),
            MatchPairItem("u26_s4_p1_m4", "快点好", "kuàidiǎn hǎo", "lekas baik")
        )
    )"""
        ],
        "p2": [
            f"""    // 1. Soal 1: Pilihan Gambar (好起来 -> membaik / sembuh)
    Exercise(
        id = "u26_s4_p2_q1",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "好起来",
        targetPinyin = "hǎo qǐlai",
        targetTranslation = "sembuh membaik",
        correctAnswer = "sembuh membaik",
        audioToSpeak = "好起来",
        pictureOptions = listOf(
            PictureOption("u26_s4_p2_opt1", "sembuh", "", R.drawable.ic_med_comfort_healthy, true),
            PictureOption("u26_s4_p2_opt2", "demam", "", R.drawable.ic_med_thermometer_fever, false),
            PictureOption("u26_s4_p2_opt3", "pusing", "", R.drawable.ic_med_headache, false),
            PictureOption("u26_s4_p2_opt4", "ranjang", "", R.drawable.ic_med_bed_rest, false)
        )
    )""",
            f"""    // 2. Soal 2: Susun Kalimat (Penyakitnya sudah sembuh membaik.)
    Exercise(
        id = "u26_s4_p2_q2",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Penyakitnya sudah sembuh.",
        targetHanzi = "他 的 病 好 了。",
        targetPinyin = "Tā de bìng hǎo le.",
        wordChips = listOf("他:tā", "的:de", "病:bìng", "好:hǎo", "了。:le.", "坏:huài"),
        correctAnswer = "他,的,病,好,了。",
        audioToSpeak = "他的病好了。"
    )""",
            f"""    // 3. Soal 3: Ketuk Pasangan yang Sesuai (Pemulihan & Sehat)
    Exercise(
        id = "u26_s4_p2_m3",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u26_s4_p2_m1", "好起来", "hǎo qǐlai", "sembuh pulih"),
            MatchPairItem("u26_s4_p2_m2", "病好了", "bìng hǎo le", "penyakit sembuh"),
            MatchPairItem("u26_s4_p2_m3", "快点", "kuàidiǎn", "segera / lekas"),
            MatchPairItem("u26_s4_p2_m4", "心情好", "xīnqíng hǎo", "hati senang")
        )
    )""",
            f"""    // 4. Soal 4: Ketik Pinyin (lekas / cepat sedikit -> kuàidiǎn)
    Exercise(
        id = "u26_s4_p2_q4",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "segera / lekas",
        sentenceWithBlank = "快点 (________)",
        targetHanzi = "快点",
        targetPinyin = "kuàidiǎn",
        correctAnswer = "kuaidian",
        keyboardKeys = {k4_p2_q4},
        audioToSpeak = "快点"
    )""",
            f"""    // 5. Soal 5: Mendengar Kalimat (Rule 10: illustrationRes = 0)
    Exercise(
        id = "u26_s4_p2_q5",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Apa yang Anda dengar?",
        targetTranslation = "Saya memberitahunya besok tidak perlu datang.",
        targetHanzi = "我 告诉 他 明天 不用 来。",
        targetPinyin = "Wǒ gàosu tā míngtiān búyòng lái.",
        wordChips = listOf("我:wǒ", "告诉:gàosu", "他:tā", "明天:míngtiān", "不用:búyòng", "来。:lái.", "去:qù"),
        correctAnswer = "我,告诉,他,明天,不用,来。",
        illustrationRes = 0,
        audioToSpeak = "我告诉他明天不用来。"
    )""",
            f"""    // 6. Soal 6: Pilihan Kalimat
    Exercise(
        id = "u26_s4_p2_q6",
        type = ExerciseType.SENTENCE_CHOICE,
        title = "Pilih terjemahan yang benar",
        targetHanzi = "祝 你 身体 健康， 万事 如意！",
        targetPinyin = "Zhù nǐ shēntǐ jiànkāng, wànshì rúyì!",
        targetTranslation = "Mendoakanmu sehat walafiat, segala hal lancar!",
        correctAnswer = "Zhù nǐ shēntǐ jiànkāng, wànshì rúyì!\\n祝 你 身体 健康， 万事 如意！",
        options = listOf(
            "Zhù nǐ shēntǐ jiànkāng, wànshì rúyì!\\n祝 你 身体 健康， 万事 如意！",
            "Zhù nǐ shēngrì kuàilè, wànshì rúyì!\\n祝 你 生日 快乐， 万事 如意！",
            "Zhù nǐ xīnnián kuàilè, wànshì rúyì!\\n祝 你 新年 快乐， 万事 如意！"
        ),
        audioToSpeak = "祝你身体健康，万事如意！"
    )""",
            f"""    // 7. Soal 7: Pilihan Gambar (康复 -> sembuh sehat)
    Exercise(
        id = "u26_s4_p2_q7",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "健康",
        targetPinyin = "jiànkāng",
        targetTranslation = "sehat",
        correctAnswer = "sehat",
        audioToSpeak = "健康",
        pictureOptions = listOf(
            PictureOption("u26_s4_p2_opt7_1", "sehat", "", R.drawable.ic_med_comfort_healthy, true),
            PictureOption("u26_s4_p2_opt7_2", "demam", "", R.drawable.ic_med_thermometer_fever, false),
            PictureOption("u26_s4_p2_opt7_3", "pusing", "", R.drawable.ic_med_headache, false),
            PictureOption("u26_s4_p2_opt7_4", "ranjang", "", R.drawable.ic_med_bed_rest, false)
        )
    )""",
            f"""    // 8. Soal 8: Ketik Pinyin (membaik/sembuh -> hǎoqǐlai)
    Exercise(
        id = "u26_s4_p2_q8",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "sembuh / membaik",
        sentenceWithBlank = "好起来 (________)",
        targetHanzi = "好起来",
        targetPinyin = "hǎoqǐlai",
        correctAnswer = "haoqilai",
        keyboardKeys = {k4_p2_q8},
        audioToSpeak = "好起来"
    )""",
            f"""    // 9. Soal 9: Susun Kalimat (Ibu menyuruh saya beristirahat dengan baik di rumah.)
    Exercise(
        id = "u26_s4_p2_q9",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Ibu menyuruh saya istirahat.",
        targetHanzi = "妈妈 叫 我 好好 休息。",
        targetPinyin = "Māma jiào wǒ hǎohāo xiūxi.",
        wordChips = listOf("妈妈:māma", "叫:jiào", "我:wǒ", "好好:hǎohāo", "休息。:xiūxi.", "去:qù"),
        correctAnswer = "妈妈,叫,我,好好,休息。",
        audioToSpeak = "妈妈叫我好好休息。"
    )""",
            f"""    // 10. Soal 10: Ketuk Pasangan yang Sesuai (Rangkuman Harapan Kesembuhan)
    Exercise(
        id = "u26_s4_p2_m10",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u26_s4_p2_m10_1", "好起来", "hǎo qǐlai", "membaik"),
            MatchPairItem("u26_s4_p2_m10_2", "好好休息", "hǎohāo xiūxi", "istirahat baik"),
            MatchPairItem("u26_s4_p2_m10_3", "不用来", "búyòng lái", "tak perlu datang"),
            MatchPairItem("u26_s4_p2_m10_4", "万事如意", "wànshì rúyì", "semua lancar")
        )
    )"""
        ]
    }

    # =========================================================================
    # STAGE 5: Evaluasi Komprehensif Kesehatan & Perawatan (Sintesis Seluruh Bab 26)
    # =========================================================================
    k5_p1_q4 = make_keys("yaodian")
    k5_p1_q8 = make_keys("touteng")
    k5_p2_q4 = make_keys("shufu")
    k5_p2_q8 = make_keys("xiwang")
    
    stages[5] = {
        "p1": [
            f"""    // 1. Soal 1: Pilihan Gambar (头疼 -> sakit kepala)
    Exercise(
        id = "u26_s5_p1_q1",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "头疼",
        targetPinyin = "tóuténg",
        targetTranslation = "sakit kepala",
        correctAnswer = "sakit kepala",
        audioToSpeak = "头疼",
        pictureOptions = listOf(
            PictureOption("u26_s5_p1_opt1", "sakit kepala", "", R.drawable.ic_med_headache, true),
            PictureOption("u26_s5_p1_opt2", "obat", "", R.drawable.ic_med_pharmacy_drug, false),
            PictureOption("u26_s5_p1_opt3", "ranjang", "", R.drawable.ic_med_bed_rest, false),
            PictureOption("u26_s5_p1_opt4", "sehat", "", R.drawable.ic_med_comfort_healthy, false)
        )
    )""",
            f"""    // 2. Soal 2: Susun Kalimat (Saya sakit kepala pergi ke apotek membeli obat.)
    Exercise(
        id = "u26_s5_p1_q2",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Saya pusing ke apotek beli obat.",
        targetHanzi = "我 头疼 去 药店 买 药。",
        targetPinyin = "Wǒ tóuténg qù yàodiàn mǎi yào.",
        wordChips = listOf("我:wǒ", "头疼:tóuténg", "去:qù", "药店:yàodiàn", "买:mǎi", "药。:yào.", "医院:yīyuàn"),
        correctAnswer = "我,头疼,去,药店,买,药。",
        audioToSpeak = "我头疼去药店买药。"
    )""",
            f"""    // 3. Soal 3: Ketuk Pasangan yang Sesuai (Sintesis Apotek & Sakit)
    Exercise(
        id = "u26_s5_p1_m3",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u26_s5_p1_m1", "头疼", "tóuténg", "pusing"),
            MatchPairItem("u26_s5_p1_m2", "药店", "yàodiàn", "apotek"),
            MatchPairItem("u26_s5_p1_m3", "买药", "mǎi yào", "beli obat"),
            MatchPairItem("u26_s5_p1_m4", "吃药", "chī yào", "minum obat")
        )
    )""",
            f"""    // 4. Soal 4: Ketik Pinyin (apotek -> yàodiàn)
    Exercise(
        id = "u26_s5_p1_q4",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "apotek",
        sentenceWithBlank = "药店 (________)",
        targetHanzi = "药店",
        targetPinyin = "yàodiàn",
        correctAnswer = "yaodian",
        keyboardKeys = {k5_p1_q4},
        audioToSpeak = "药店"
    )""",
            f"""    // 5. Soal 5: Mendengar Kalimat (Rule 10: illustrationRes = 0)
    Exercise(
        id = "u26_s5_p1_q5",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Apa yang Anda dengar?",
        targetTranslation = "Minum obat ini badan akan merasa nyaman.",
        targetHanzi = "吃 了 药 身体 很 舒服。",
        targetPinyin = "Chī le yào shēntǐ hěn shūfu.",
        wordChips = listOf("吃:chī", "了:le", "药:yào", "身体:shēntǐ", "很:hěn", "舒服。:shūfu.", "累:lèi"),
        correctAnswer = "吃,了,药,身体,很,舒服。",
        illustrationRes = 0,
        audioToSpeak = "吃了药身体很舒服。"
    )""",
            f"""    // 6. Soal 6: Pilihan Kalimat
    Exercise(
        id = "u26_s5_p1_q6",
        type = ExerciseType.SENTENCE_CHOICE,
        title = "Pilih terjemahan yang benar",
        targetHanzi = "请 你 帮 我 倒 一 杯 热水。",
        targetPinyin = "Qǐng nǐ bāng wǒ dào yì bēi rèshuǐ.",
        targetTranslation = "Tolong bantu saya tuangkan segelas air hangat.",
        correctAnswer = "Qǐng nǐ bāng wǒ dào yì bēi rèshuǐ.\\n请 你 帮 我 倒 一 杯 热水。",
        options = listOf(
            "Qǐng nǐ bāng wǒ dào yì bēi rèshuǐ.\\n请 你 帮 我 倒 一 杯 热水。",
            "Qǐng nǐ bāng wǒ dào yì bēi lěngshuǐ.\\n请 你 帮 我 倒 一 杯 冷水。",
            "Tā bāng wǒ dào yì bēi rèshuǐ.\\n他 帮 我 倒 一 杯 热水。"
        ),
        audioToSpeak = "请你帮我倒一杯热水。"
    )""",
            f"""    // 7. Soal 7: Pilihan Gambar (药 -> obat tablet kapsul)
    Exercise(
        id = "u26_s5_p1_q7",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "药",
        targetPinyin = "yào",
        targetTranslation = "obat",
        correctAnswer = "obat",
        audioToSpeak = "药",
        pictureOptions = listOf(
            PictureOption("u26_s5_p1_opt7_1", "obat", "", R.drawable.ic_med_pharmacy_drug, true),
            PictureOption("u26_s5_p1_opt7_2", "ranjang", "", R.drawable.ic_med_bed_rest, false),
            PictureOption("u26_s5_p1_opt7_3", "sehat", "", R.drawable.ic_med_comfort_healthy, false),
            PictureOption("u26_s5_p1_opt7_4", "tidur", "", R.drawable.ic_med_rest_sleep, false)
        )
    )""",
            f"""    // 8. Soal 8: Ketik Pinyin (sakit kepala -> tóuténg)
    Exercise(
        id = "u26_s5_p1_q8",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "sakit kepala",
        sentenceWithBlank = "头疼 (________)",
        targetHanzi = "头疼",
        targetPinyin = "tóuténg",
        correctAnswer = "touteng",
        keyboardKeys = {k5_p1_q8},
        audioToSpeak = "头疼"
    )""",
            f"""    // 9. Soal 9: Susun Kalimat (Ibu menyuruh saya minum obat tepat waktu.)
    Exercise(
        id = "u26_s5_p1_q9",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Ibu suruh saya minum obat.",
        targetHanzi = "妈妈 叫 我 吃 药。",
        targetPinyin = "Māma jiào wǒ chī yào.",
        wordChips = listOf("妈妈:māma", "叫:jiào", "我:wǒ", "吃:chī", "药。:yào.", "饭:fàn"),
        correctAnswer = "妈妈,叫,我,吃,药。",
        audioToSpeak = "妈妈叫我吃药。"
    )""",
            f"""    // 10. Soal 10: Ketuk Pasangan yang Sesuai (Rangkuman Sintesis 1)
    Exercise(
        id = "u26_s5_p1_m10",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u26_s5_p1_m10_1", "吃药", "chī yào", "minum obat"),
            MatchPairItem("u26_s5_p1_m10_2", "喝热水", "hē rèshuǐ", "minum air panas"),
            MatchPairItem("u26_s5_p1_m10_3", "身体舒服", "shēntǐ shūfu", "badan enak"),
            MatchPairItem("u26_s5_p1_m10_4", "去药店", "qù yàodiàn", "pergi apotek")
        )
    )"""
        ],
        "p2": [
            f"""    // 1. Soal 1: Pilihan Gambar (床 -> ranjang istirahat pemulihan)
    Exercise(
        id = "u26_s5_p2_q1",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "床",
        targetPinyin = "chuáng",
        targetTranslation = "ranjang",
        correctAnswer = "ranjang",
        audioToSpeak = "床",
        pictureOptions = listOf(
            PictureOption("u26_s5_p2_opt1", "ranjang", "", R.drawable.ic_med_bed_rest, true),
            PictureOption("u26_s5_p2_opt2", "obat", "", R.drawable.ic_med_pharmacy_drug, false),
            PictureOption("u26_s5_p2_opt3", "sehat", "", R.drawable.ic_med_comfort_healthy, false),
            PictureOption("u26_s5_p2_opt4", "istirahat", "", R.drawable.ic_med_rest_sleep, false)
        )
    )""",
            f"""    // 2. Soal 2: Susun Kalimat (Saya berbaring di atas ranjang istirahat satu hari.)
    Exercise(
        id = "u26_s5_p2_q2",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Saya istirahat di ranjang seharian.",
        targetHanzi = "我 在 床 上 休息 一天。",
        targetPinyin = "Wǒ zài chuáng shang xiūxi yìtiān.",
        wordChips = listOf("我:wǒ", "在:zài", "床:chuáng", "上:shang", "休息:xiūxi", "一天。:yìtiān.", "跑:pǎo"),
        correctAnswer = "我,在,床,上,休息,一天。",
        audioToSpeak = "我在床上休息一天。"
    )""",
            f"""    // 3. Soal 3: Ketuk Pasangan yang Sesuai (Grand Sintesis Bab 26)
    Exercise(
        id = "u26_s5_p2_m3",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u26_s5_p2_m1", "头疼", "tóuténg", "pusing"),
            MatchPairItem("u26_s5_p2_m2", "舒服", "shūfu", "nyaman"),
            MatchPairItem("u26_s5_p2_m3", "药店", "yàodiàn", "apotek"),
            MatchPairItem("u26_s5_p2_m4", "希望", "xīwàng", "berharap")
        )
    )""",
            f"""    // 4. Soal 4: Ketik Pinyin (nyaman -> shūfu)
    Exercise(
        id = "u26_s5_p2_q4",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "nyaman / enak badan",
        sentenceWithBlank = "舒服 (________)",
        targetHanzi = "舒服",
        targetPinyin = "shūfu",
        correctAnswer = "shufu",
        keyboardKeys = {k5_p2_q4},
        audioToSpeak = "舒服"
    )""",
            f"""    // 5. Soal 5: Mendengar Kalimat (Rule 10: illustrationRes = 0)
    Exercise(
        id = "u26_s5_p2_q5",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Apa yang Anda dengar?",
        targetTranslation = "Semoga kamu lekas sembuh membaik!",
        targetHanzi = "希望 你 快点 好起来！",
        targetPinyin = "Xīwàng nǐ kuàidiǎn hǎoqǐlai!",
        wordChips = listOf("希望:xīwàng", "你:nǐ", "快点:kuàidiǎn", "好起来！:hǎoqǐlai!", "生病:shēngbìng"),
        correctAnswer = "希望,你,快点,好起来！",
        illustrationRes = 0,
        audioToSpeak = "希望你快点好起来！"
    )""",
            f"""    // 6. Soal 6: Pilihan Kalimat
    Exercise(
        id = "u26_s5_p2_q6",
        type = ExerciseType.SENTENCE_CHOICE,
        title = "Pilih terjemahan yang benar",
        targetHanzi = "他 帮 我 去 药店 买 了 药。",
        targetPinyin = "Tā bāng wǒ qù yàodiàn mǎi le yào.",
        targetTranslation = "Dia membantu saya pergi ke apotek membeli obat.",
        correctAnswer = "Tā bāng wǒ qù yàodiàn mǎi le yào.\\n他 帮 我 去 药店 买 了 药。",
        options = listOf(
            "Tā bāng wǒ qù yàodiàn mǎi le yào.\\n他 帮 我 去 药店 买 了 药。",
            "Wǒ bāng tā qù yàodiàn mǎi le yào.\\n我 帮 他 去 药店 买 了 药。",
            "Tā bāng wǒ qù fànguǎn mǎi le cài.\\n他 帮 我 去 饭馆 买 了 菜。"
        ),
        audioToSpeak = "他帮我去药店买了药。"
    )""",
            f"""    // 7. Soal 7: Pilihan Gambar (希望康复 -> semoga sembuh)
    Exercise(
        id = "u26_s5_p2_q7",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "希望",
        targetPinyin = "xīwàng",
        targetTranslation = "harapan sembuh",
        correctAnswer = "harapan sembuh",
        audioToSpeak = "希望",
        pictureOptions = listOf(
            PictureOption("u26_s5_p2_opt7_1", "sehat", "", R.drawable.ic_med_comfort_healthy, true),
            PictureOption("u26_s5_p2_opt7_2", "obat", "", R.drawable.ic_med_pharmacy_drug, false),
            PictureOption("u26_s5_p2_opt7_3", "pusing", "", R.drawable.ic_med_headache, false),
            PictureOption("u26_s5_p2_opt7_4", "ranjang", "", R.drawable.ic_med_bed_rest, false)
        )
    )""",
            f"""    // 8. Soal 8: Ketik Pinyin (berharap/semoga -> xīwàng)
    Exercise(
        id = "u26_s5_p2_q8",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "berharap / semoga",
        sentenceWithBlank = "希望 (________)",
        targetHanzi = "希望",
        targetPinyin = "xīwàng",
        correctAnswer = "xiwang",
        keyboardKeys = {k5_p2_q8},
        audioToSpeak = "希望"
    )""",
            f"""    // 9. Soal 9: Susun Kalimat (Dokter memberitahu saya harus banyak minum air hangat.)
    Exercise(
        id = "u26_s5_p2_q9",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Dokter menyuruh saya banyak minum air hangat.",
        targetHanzi = "医生 叫 我 多 喝 热水。",
        targetPinyin = "Yīshēng jiào wǒ duō hē rèshuǐ.",
        wordChips = listOf("医生:yīshēng", "叫:jiào", "我:wǒ", "多:duō", "喝:hē", "热水。:rèshuǐ.", "冰水:bīngshuǐ"),
        correctAnswer = "医生,叫,我,多,喝,热水。",
        audioToSpeak = "医生叫我多喝热水。"
    )""",
            f"""    // 10. Soal 10: Ketuk Pasangan yang Sesuai (Grand Review Final Bab 26)
    Exercise(
        id = "u26_s5_p2_m10",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u26_s5_p2_m10_1", "多喝热水", "duō hē rèshuǐ", "banyak minum air"),
            MatchPairItem("u26_s5_p2_m10_2", "快点好", "kuàidiǎn hǎo", "lekas sembuh"),
            MatchPairItem("u26_s5_p2_m10_3", "躺在床上", "tǎng zài chuáng shang", "baring di kasur"),
            MatchPairItem("u26_s5_p2_m10_4", "帮大忙", "bāng dàmáng", "bantuan besar")
        )
    )"""
        ]
    }

    for s_idx in range(1, 6):
        filename = f"{base_dir}/Bab26Stage{s_idx}Data.kt"
        p1_code = ",\n\n".join(stages[s_idx]["p1"])
        p2_code = ",\n\n".join(stages[s_idx]["p2"])
        
        content = f"""package com.example.chineselearning.data.repository

import com.example.chineselearning.R
import com.example.chineselearning.data.model.Exercise
import com.example.chineselearning.data.model.ExerciseType
import com.example.chineselearning.data.model.MatchPairItem
import com.example.chineselearning.data.model.PictureOption

val bab26Stage{s_idx}Part1Exercises = listOf(
{p1_code}
)

val bab26Stage{s_idx}Part2Exercises = listOf(
{p2_code}
)
"""
        with open(filename, "w", encoding="utf-8") as f:
            f.write(content)
        print(f"Written {filename}")

if __name__ == "__main__":
    generate_bab26()
