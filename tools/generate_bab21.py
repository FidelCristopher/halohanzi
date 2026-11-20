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

def generate_bab21():
    base_dir = "app/src/main/java/com/example/chineselearning/data/repository"
    
    stages = {}
    
    # =========================================================================
    # STAGE 1: Dinamika Masuk & Menuju Masuk (进, 进来, 进去)
    # =========================================================================
    k1_p1_q4 = make_keys("jinlai")
    k1_p1_q8 = make_keys("jin")
    k1_p2_q4 = make_keys("jinqu")
    k1_p2_q8 = make_keys("qingjin")
    
    stages[1] = {
        "p1": [
            f"""    // 1. Soal 1: Pilihan Gambar (进来 -> masuk ke sini)
    Exercise(
        id = "u21_s1_p1_q1",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "进来",
        targetPinyin = "jìnlái",
        targetTranslation = "masuk ke sini",
        correctAnswer = "masuk ke sini",
        audioToSpeak = "进来",
        pictureOptions = listOf(
            PictureOption("u21_s1_p1_opt1", "masuk ke sini", "", R.drawable.ic_pos_in, true),
            PictureOption("u21_s1_p1_opt2", "keluar ke sana", "", R.drawable.ic_pos_out, false),
            PictureOption("u21_s1_p1_opt3", "naik ke atas", "", R.drawable.ic_pos_up, false),
            PictureOption("u21_s1_p1_opt4", "turun ke bawah", "", R.drawable.ic_pos_down, false)
        )
    )""",
            f"""    // 2. Soal 2: Susun Kalimat (Pintu terbuka, cepatlah kamu masuk ke sini.)
    Exercise(
        id = "u21_s1_p1_q2",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Pintu buka, cepatlah kamu masuk.",
        targetHanzi = "门 开 着， 你 快 进来 吧。",
        targetPinyin = "Mén kāi zhe, nǐ kuài jìnlái ba.",
        wordChips = listOf("门:mén", "开:kāi", "着，:zhe,", "你:nǐ", "快:kuài", "进来:jìnlái", "吧。:ba.", "出去:chūqù"),
        correctAnswer = "门,开,着，,你,快,进来,吧。",
        audioToSpeak = "门开着，你快进来吧。"
    )""",
            f"""    // 3. Soal 3: Ketuk Pasangan yang Sesuai (Masuk & Masuk Ke Sini)
    Exercise(
        id = "u21_s1_p1_q3",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u21_s1_p1_m1", "进", "jìn", "masuk"),
            MatchPairItem("u21_s1_p1_m2", "进来", "jìnlái", "masuk ke sini"),
            MatchPairItem("u21_s1_p1_m3", "请进", "qǐng jìn", "silakan masuk"),
            MatchPairItem("u21_s1_p1_m4", "快来", "kuài lái", "cepat datang")
        )
    )""",
            f"""    // 4. Soal 4: Ketik Pinyin (masuk ke sini -> jìnlái)
    Exercise(
        id = "u21_s1_p1_q4",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "masuk ke sini",
        sentenceWithBlank = "进来 (________)",
        targetHanzi = "进来",
        targetPinyin = "jìnlái",
        correctAnswer = "jinlai",
        keyboardKeys = {k1_p1_q4},
        audioToSpeak = "进来"
    )""",
            f"""    // 5. Soal 5: Mendengar Kalimat (Rule 10: illustrationRes = 0)
    Exercise(
        id = "u21_s1_p1_q5",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Apa yang Anda dengar?",
        targetTranslation = "Di luar sangat dingin, silakan masuk ke dalam kamar.",
        targetHanzi = "外面 冷， 请 进 房间 吧。",
        targetPinyin = "Wàimiàn lěng, qǐng jìn fángjiān ba.",
        wordChips = listOf("外面:wàimiàn", "冷，:lěng,", "请:qǐng", "进:jìn", "房间:fángjiān", "吧。:ba.", "出:chū"),
        correctAnswer = "外面,冷，,请,进,房间,吧。",
        illustrationRes = 0,
        audioToSpeak = "外面冷，请进房间吧。"
    )""",
            f"""    // 6. Soal 6: Pilihan Kalimat
    Exercise(
        id = "u21_s1_p1_q6",
        type = ExerciseType.SENTENCE_CHOICE,
        title = "Pilih terjemahan yang benar",
        targetHanzi = "老师 进 教室 来 了。",
        targetPinyin = "Lǎoshī jìn jiàoshì lái le.",
        targetTranslation = "Guru telah masuk ke dalam ruang kelas.",
        correctAnswer = "Lǎoshī jìn jiàoshì lái le.\\n老师 进 教室 来 了。",
        options = listOf(
            "Lǎoshī jìn jiàoshì lái le.\\n老师 进 教室 来 了。",
            "Lǎoshī chū jiàoshì qù le.\\n老师 出 教室 去 了。",
            "Xuéshēng jìn jiàoshì lái le.\\n学生 进 教室 来 了。"
        ),
        audioToSpeak = "老师进教室来了。"
    )""",
            f"""    // 7. Soal 7: Pilihan Gambar (进 -> masuk)
    Exercise(
        id = "u21_s1_p1_q7",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "进",
        targetPinyin = "jìn",
        targetTranslation = "masuk",
        correctAnswer = "masuk",
        audioToSpeak = "进",
        pictureOptions = listOf(
            PictureOption("u21_s1_p1_opt7_1", "masuk", "", R.drawable.ic_pos_in, true),
            PictureOption("u21_s1_p1_opt7_2", "keluar", "", R.drawable.ic_pos_out, false),
            PictureOption("u21_s1_p1_opt7_3", "naik", "", R.drawable.ic_pos_up, false),
            PictureOption("u21_s1_p1_opt7_4", "turun", "", R.drawable.ic_pos_down, false)
        )
    )""",
            f"""    // 8. Soal 8: Ketik Pinyin (masuk -> jìn)
    Exercise(
        id = "u21_s1_p1_q8",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "masuk",
        sentenceWithBlank = "进 (________)",
        targetHanzi = "进",
        targetPinyin = "jìn",
        correctAnswer = "jin",
        keyboardKeys = {k1_p1_q8},
        audioToSpeak = "进"
    )""",
            f"""    // 9. Soal 9: Susun Kalimat (Silakan masuk ke dalam rumah dan duduk.)
    Exercise(
        id = "u21_s1_p1_q9",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Silakan masuk rumah dan duduk.",
        targetHanzi = "请 进 屋 坐。",
        targetPinyin = "Qǐng jìn wū zuò.",
        wordChips = listOf("请:qǐng", "进:jìn", "屋:wū", "坐。:zuò.", "出:chū"),
        correctAnswer = "请,进,屋,坐。",
        audioToSpeak = "请进屋坐。"
    )""",
            f"""    // 10. Soal 10: Ketuk Pasangan yang Sesuai (Rangkuman Masuk)
    Exercise(
        id = "u21_s1_p1_m10",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u21_s1_p1_m10_1", "进", "jìn", "masuk"),
            MatchPairItem("u21_s1_p1_m10_2", "进来", "jìnlái", "masuk kemari"),
            MatchPairItem("u21_s1_p1_m10_3", "进门", "jìn mén", "masuk pintu"),
            MatchPairItem("u21_s1_p1_m10_4", "坐下", "zuò xià", "duduk")
        )
    )"""
        ],
        "p2": [
            f"""    // 1. Soal 1: Pilihan Gambar (进去 -> masuk ke sana)
    Exercise(
        id = "u21_s1_p2_q1",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "进去",
        targetPinyin = "jìnqù",
        targetTranslation = "masuk ke sana",
        correctAnswer = "masuk ke sana",
        audioToSpeak = "进去",
        pictureOptions = listOf(
            PictureOption("u21_s1_p2_opt1", "masuk ke sana", "", R.drawable.ic_pos_in, true),
            PictureOption("u21_s1_p2_opt2", "keluar ke sini", "", R.drawable.ic_pos_out, false),
            PictureOption("u21_s1_p2_opt3", "naik ke atas", "", R.drawable.ic_pos_up, false),
            PictureOption("u21_s1_p2_opt4", "turun ke bawah", "", R.drawable.ic_pos_down, false)
        )
    )""",
            f"""    // 2. Soal 2: Susun Kalimat (Dia berdiri di depan pintu, belum masuk ke sana.)
    Exercise(
        id = "u21_s1_p2_q2",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Dia di pintu, belum masuk ke sana.",
        targetHanzi = "他 在 门口， 还没 进去。",
        targetPinyin = "Tā zài ménkǒu, hái méi jìnqù.",
        wordChips = listOf("他:tā", "在:zài", "门口，:ménkǒu,", "还没:hái méi", "进去。:jìnqù.", "出来:chūlái"),
        correctAnswer = "他,在,门口，,还没,进去。",
        audioToSpeak = "他在门口，还没进去。"
    )""",
            f"""    // 3. Soal 3: Ketuk Pasangan yang Sesuai (Masuk Ke Sana)
    Exercise(
        id = "u21_s1_p2_m3",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u21_s1_p2_m1", "进去", "jìnqù", "masuk ke sana"),
            MatchPairItem("u21_s1_p2_m2", "门口", "ménkǒu", "ambang pintu"),
            MatchPairItem("u21_s1_p2_m3", "还没", "hái méi", "belum"),
            MatchPairItem("u21_s1_p2_m4", "走进去", "zǒu jìnqù", "berjalan masuk")
        )
    )""",
            f"""    // 4. Soal 4: Ketik Pinyin (masuk ke sana -> jìnqù)
    Exercise(
        id = "u21_s1_p2_q4",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "masuk ke sana",
        sentenceWithBlank = "进去 (________)",
        targetHanzi = "进去",
        targetPinyin = "jìnqù",
        correctAnswer = "jinqu",
        keyboardKeys = {k1_p2_q4},
        audioToSpeak = "进去"
    )""",
            f"""    // 5. Soal 5: Mendengar Kalimat (Rule 10: illustrationRes = 0)
    Exercise(
        id = "u21_s1_p2_q5",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Apa yang Anda dengar?",
        targetTranslation = "Kita bersama-sama berjalan masuk ke sana.",
        targetHanzi = "我们 一起 走 进去 吧。",
        targetPinyin = "Wǒmen yìqǐ zǒu jìnqù ba.",
        wordChips = listOf("我们:wǒmen", "一起:yìqǐ", "走:zǒu", "进去:jìnqù", "吧。:ba.", "出来:chūlái"),
        correctAnswer = "我们,一起,走,进去,吧。",
        illustrationRes = 0,
        audioToSpeak = "我们一起走进去吧。"
    )""",
            f"""    // 6. Soal 6: Pilihan Kalimat
    Exercise(
        id = "u21_s1_p2_q6",
        type = ExerciseType.SENTENCE_CHOICE,
        title = "Pilih terjemahan yang benar",
        targetHanzi = "里面 太 黑 了， 我 不 敢 进去。",
        targetPinyin = "Lǐmiàn tài hēi le, wǒ bù gǎn jìnqù.",
        targetTranslation = "Di dalam terlalu gelap, saya tidak berani masuk ke sana.",
        correctAnswer = "Lǐmiàn tài hēi le, wǒ bù gǎn jìnqù.\\n里面 太 黑 了， 我 不 敢 进去。",
        options = listOf(
            "Lǐmiàn tài hēi le, wǒ bù gǎn jìnqù.\\n里面 太 黑 了， 我 不 敢 进去。",
            "Wàimiàn tài hēi le, wǒ bù gǎn jìnqù.\\n外面 太 黑 了， 我 不 敢 进去。",
            "Lǐmiàn tài liàng le, wǒ bù gǎn jìnqù.\\n里面 太 亮 了， 我 不 敢 进去。"
        ),
        audioToSpeak = "里面太黑了，我不敢进去。"
    )""",
            f"""    // 7. Soal 7: Pilihan Gambar (进去 -> masuk menjauhi penutur)
    Exercise(
        id = "u21_s1_p2_q7",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "进去",
        targetPinyin = "jìnqù",
        targetTranslation = "masuk ke sana",
        correctAnswer = "masuk ke sana",
        audioToSpeak = "进去",
        pictureOptions = listOf(
            PictureOption("u21_s1_p2_opt7_1", "masuk ke sana", "", R.drawable.ic_pos_in, true),
            PictureOption("u21_s1_p2_opt7_2", "keluar ke sana", "", R.drawable.ic_pos_out, false),
            PictureOption("u21_s1_p2_opt7_3", "datang", "", R.drawable.ic_trans_come, false),
            PictureOption("u21_s1_p2_opt7_4", "pulang", "", R.drawable.ic_trans_return_home, false)
        )
    )""",
            f"""    // 8. Soal 8: Ketik Pinyin (silakan masuk -> qǐngjìn)
    Exercise(
        id = "u21_s1_p2_q8",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "silakan masuk",
        sentenceWithBlank = "请进 (________)",
        targetHanzi = "请进",
        targetPinyin = "qǐngjìn",
        correctAnswer = "qingjin",
        keyboardKeys = {k1_p2_q8},
        audioToSpeak = "请进"
    )""",
            f"""    // 9. Soal 9: Susun Kalimat (Semua orang sudah masuk ke sana.)
    Exercise(
        id = "u21_s1_p2_q9",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Semua orang sudah masuk ke sana.",
        targetHanzi = "大家 都 已经 进去 了。",
        targetPinyin = "Dàjiā dōu yǐjīng jìnqù le.",
        wordChips = listOf("大家:dàjiā", "都:dōu", "已经:yǐjīng", "进去:jìnqù", "了。:le.", "出来:chūlái"),
        correctAnswer = "大家,都,已经,进去,了。",
        audioToSpeak = "大家都已经进去了。"
    )""",
            f"""    // 10. Soal 10: Ketuk Pasangan yang Sesuai (Rangkuman Komplemen Masuk)
    Exercise(
        id = "u21_s1_p2_m10",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u21_s1_p2_m10_1", "进去", "jìnqù", "masuk ke sana"),
            MatchPairItem("u21_s1_p2_m10_2", "已经进", "yǐjīng jìn", "sudah masuk"),
            MatchPairItem("u21_s1_p2_m10_3", "走进去", "zǒu jìnqù", "berjalan masuk"),
            MatchPairItem("u21_s1_p2_m10_4", "黑夜", "hēiyè", "malam gelap")
        )
    )"""
        ]
    }

    # =========================================================================
    # STAGE 2: Dinamika Keluar & Meninggalkan Ruangan (出, 出来, 出去, 出门)
    # =========================================================================
    k2_p1_q4 = make_keys("chulai")
    k2_p1_q8 = make_keys("chu")
    k2_p2_q4 = make_keys("chuqu")
    k2_p2_q8 = make_keys("chumen")
    
    stages[2] = {
        "p1": [
            f"""    // 1. Soal 1: Pilihan Gambar (出来 -> keluar ke sini)
    Exercise(
        id = "u21_s2_p1_q1",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "出来",
        targetPinyin = "chūlái",
        targetTranslation = "keluar ke sini",
        correctAnswer = "keluar ke sini",
        audioToSpeak = "出来",
        pictureOptions = listOf(
            PictureOption("u21_s2_p1_opt1", "keluar ke sini", "", R.drawable.ic_pos_out, true),
            PictureOption("u21_s2_p1_opt2", "masuk ke sini", "", R.drawable.ic_pos_in, false),
            PictureOption("u21_s2_p1_opt3", "naik ke atas", "", R.drawable.ic_pos_up, false),
            PictureOption("u21_s2_p1_opt4", "turun ke bawah", "", R.drawable.ic_pos_down, false)
        )
    )""",
            f"""    // 2. Soal 2: Susun Kalimat (Harap semua orang keluar dari ruang kelas.)
    Exercise(
        id = "u21_s2_p1_q2",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Harap semua keluar dari kelas.",
        targetHanzi = "请 大家 从 教室 出来。",
        targetPinyin = "Qǐng dàjiā cóng jiàoshì chūlái.",
        wordChips = listOf("请:qǐng", "大家:dàjiā", "从:cóng", "教室:jiàoshì", "出来。:chūlái.", "进去:jìnqù"),
        correctAnswer = "请,大家,从,教室,出来。",
        audioToSpeak = "请大家从教室出来。"
    )""",
            f"""    // 3. Soal 3: Ketuk Pasangan yang Sesuai (Keluar & Keluar Kemari)
    Exercise(
        id = "u21_s2_p1_q3",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u21_s2_p1_m1", "出", "chū", "keluar"),
            MatchPairItem("u21_s2_p1_m2", "出来", "chūlái", "keluar ke sini"),
            MatchPairItem("u21_s2_p1_m3", "走出", "zǒu chū", "berjalan keluar"),
            MatchPairItem("u21_s2_p1_m4", "校门", "xiàomén", "gerbang sekolah")
        )
    )""",
            f"""    // 4. Soal 4: Ketik Pinyin (keluar ke sini -> chūlái)
    Exercise(
        id = "u21_s2_p1_q4",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "keluar ke sini",
        sentenceWithBlank = "出来 (________)",
        targetHanzi = "出来",
        targetPinyin = "chūlái",
        correctAnswer = "chulai",
        keyboardKeys = {k2_p1_q4},
        audioToSpeak = "出来"
    )""",
            f"""    // 5. Soal 5: Mendengar Kalimat (Rule 10: illustrationRes = 0)
    Exercise(
        id = "u21_s2_p1_q5",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Apa yang Anda dengar?",
        targetTranslation = "Dia baru saja melangkah keluar gerbang sekolah.",
        targetHanzi = "他 刚 走 出 校门。",
        targetPinyin = "Tā gāng zǒu chū xiàomén.",
        wordChips = listOf("他:tā", "刚:gāng", "走:zǒu", "出:chū", "校门。:xiàomén.", "进:jìn"),
        correctAnswer = "他,刚,走,出,校门。",
        illustrationRes = 0,
        audioToSpeak = "他刚走出校门。"
    )""",
            f"""    // 6. Soal 6: Pilihan Kalimat
    Exercise(
        id = "u21_s2_p1_q6",
        type = ExerciseType.SENTENCE_CHOICE,
        title = "Pilih terjemahan yang benar",
        targetHanzi = "太阳 从 东方 升 出来 了。",
        targetPinyin = "Tàiyáng cóng dōngfāng shēng chūlái le.",
        targetTranslation = "Matahari telah terbit keluar dari arah timur.",
        correctAnswer = "Tàiyáng cóng dōngfāng shēng chūlái le.\\n太阳 从 东方 升 出来 了。",
        options = listOf(
            "Tàiyáng cóng dōngfāng shēng chūlái le.\\n太阳 从 东方 升 出来 了。",
            "Tàiyáng cóng xīfāng luò xiàqù le.\\n太阳 从 西方 落 下去 了。",
            "Yuèliang cóng dōngfāng shēng chūlái le.\\n月亮 从 东方 升 出来 了。"
        ),
        audioToSpeak = "太阳从东方升出来了。"
    )""",
            f"""    // 7. Soal 7: Pilihan Gambar (出 -> keluar)
    Exercise(
        id = "u21_s2_p1_q7",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "出",
        targetPinyin = "chū",
        targetTranslation = "keluar",
        correctAnswer = "keluar",
        audioToSpeak = "出",
        pictureOptions = listOf(
            PictureOption("u21_s2_p1_opt7_1", "keluar", "", R.drawable.ic_pos_out, true),
            PictureOption("u21_s2_p1_opt7_2", "masuk", "", R.drawable.ic_pos_in, false),
            PictureOption("u21_s2_p1_opt7_3", "datang", "", R.drawable.ic_trans_come, false),
            PictureOption("u21_s2_p1_opt7_4", "pergi", "", R.drawable.ic_trans_go, false)
        )
    )""",
            f"""    // 8. Soal 8: Ketik Pinyin (keluar -> chū)
    Exercise(
        id = "u21_s2_p1_q8",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "keluar",
        sentenceWithBlank = "出 (________)",
        targetHanzi = "出",
        targetPinyin = "chū",
        correctAnswer = "chu",
        keyboardKeys = {k2_p1_q8},
        audioToSpeak = "出"
    )""",
            f"""    // 9. Soal 9: Susun Kalimat (Kamu cepatlah keluar, kami sedang menunggumu.)
    Exercise(
        id = "u21_s2_p1_q9",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Kamu cepat keluar, kami menunggu.",
        targetHanzi = "你 快 出来， 我们 在 等 你。",
        targetPinyin = "Nǐ kuài chūlái, wǒmen zài děng nǐ.",
        wordChips = listOf("你:nǐ", "快:kuài", "出来，:chūlái,", "我们:wǒmen", "在:zài", "等:děng", "你。:nǐ.", "进去:jìnqù"),
        correctAnswer = "你,快,出来，,我们,在,等,你。",
        audioToSpeak = "你快出来，我们在等你。"
    )""",
            f"""    // 10. Soal 10: Ketuk Pasangan yang Sesuai (Rangkuman Aksi Keluar)
    Exercise(
        id = "u21_s2_p1_m10",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u21_s2_p1_m10_1", "出", "chū", "keluar"),
            MatchPairItem("u21_s2_p1_m10_2", "出来", "chūlái", "keluar ke sini"),
            MatchPairItem("u21_s2_p1_m10_3", "等你", "děng nǐ", "menunggumu"),
            MatchPairItem("u21_s2_p1_m10_4", "从房间", "cóng fángjiān", "dari kamar")
        )
    )"""
        ],
        "p2": [
            f"""    // 1. Soal 1: Pilihan Gambar (出去 -> keluar ke sana)
    Exercise(
        id = "u21_s2_p2_q1",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "出去",
        targetPinyin = "chūqù",
        targetTranslation = "keluar ke sana",
        correctAnswer = "keluar ke sana",
        audioToSpeak = "出去",
        pictureOptions = listOf(
            PictureOption("u21_s2_p2_opt1", "keluar ke sana", "", R.drawable.ic_pos_out, true),
            PictureOption("u21_s2_p2_opt2", "masuk ke sini", "", R.drawable.ic_pos_in, false),
            PictureOption("u21_s2_p2_opt3", "datang", "", R.drawable.ic_trans_come, false),
            PictureOption("u21_s2_p2_opt4", "pulang", "", R.drawable.ic_trans_return_home, false)
        )
    )""",
            f"""    // 2. Soal 2: Susun Kalimat (Ayah telah keluar, tidak ada di rumah.)
    Exercise(
        id = "u21_s2_p2_q2",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Ayah keluar, tidak ada di rumah.",
        targetHanzi = "爸爸 出去 了， 不 在 家。",
        targetPinyin = "Bàba chūqù le, bú zài jiā.",
        wordChips = listOf("爸爸:bàba", "出去:chūqù", "了，:le,", "不:bú", "在:zài", "家。:jiā.", "进来:jìnlái"),
        correctAnswer = "爸爸,出去,了，,不,在,家。",
        audioToSpeak = "爸爸出去了，不在家。"
    )""",
            f"""    // 3. Soal 3: Ketuk Pasangan yang Sesuai (Keluar Ke Sana & Keluar Rumah)
    Exercise(
        id = "u21_s2_p2_m3",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u21_s2_p2_m1", "出去", "chūqù", "keluar ke sana"),
            MatchPairItem("u21_s2_p2_m2", "出门", "chūmén", "keluar rumah"),
            MatchPairItem("u21_s2_p2_m3", "不在家", "bú zài jiā", "tidak di rumah"),
            MatchPairItem("u21_s2_p2_m4", "带钥匙", "dài yàoshi", "bawa kunci")
        )
    )""",
            f"""    // 4. Soal 4: Ketik Pinyin (keluar ke sana -> chūqù)
    Exercise(
        id = "u21_s2_p2_q4",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "keluar ke sana",
        sentenceWithBlank = "出去 (________)",
        targetHanzi = "出去",
        targetPinyin = "chūqù",
        correctAnswer = "chuqu",
        keyboardKeys = {k2_p2_q4},
        audioToSpeak = "出去"
    )""",
            f"""    // 5. Soal 5: Mendengar Kalimat (Rule 10: illustrationRes = 0)
    Exercise(
        id = "u21_s2_p2_q5",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Apa yang Anda dengar?",
        targetTranslation = "Sebelum keluar rumah jangan lupa membawa kunci.",
        targetHanzi = "出门 前 别 忘 了 带 钥匙。",
        targetPinyin = "Chūmén qián bié wàng le dài yàoshi.",
        wordChips = listOf("出门:chūmén", "前:qián", "别:bié", "忘:wàng", "了:le", "带:dài", "钥匙。:yàoshi.", "进门:jìnmén"),
        correctAnswer = "出门,前,别,忘,了,带,钥匙。",
        illustrationRes = 0,
        audioToSpeak = "出门前别忘了带钥匙。"
    )""",
            f"""    // 6. Soal 6: Pilihan Kalimat
    Exercise(
        id = "u21_s2_p2_q6",
        type = ExerciseType.SENTENCE_CHOICE,
        title = "Pilih terjemahan yang benar",
        targetHanzi = "今天 天气 好， 我们 出去 散步 吧。",
        targetPinyin = "Jīntiān tiānqì hǎo, wǒmen chūqù sànbù ba.",
        targetTranslation = "Hari ini cuaca bagus, mari kita keluar jalan-jalan santai.",
        correctAnswer = "Jīntiān tiānqì hǎo, wǒmen chūqù sànbù ba.\\n今天 天气 好， 我们 出去 散步 吧。",
        options = listOf(
            "Jīntiān tiānqì hǎo, wǒmen chūqù sànbù ba.\\n今天 天气 好， 我们 出去 散步 吧。",
            "Jīntiān tiānqì bù hǎo, wǒmen bié chūqù.\\n今天 天气 不 好， 我们 别 出去。",
            "Jīntiān xiàyǔ, wǒmen zài jiā lǐ ba.\\n今天 下雨， 我们 在 家 里 吧。"
        ),
        audioToSpeak = "今天天气好，我们出去散步吧。"
    )""",
            f"""    // 7. Soal 7: Pilihan Gambar (出门 -> keluar rumah)
    Exercise(
        id = "u21_s2_p2_q7",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "出门",
        targetPinyin = "chūmén",
        targetTranslation = "keluar rumah",
        correctAnswer = "keluar rumah",
        audioToSpeak = "出门",
        pictureOptions = listOf(
            PictureOption("u21_s2_p2_opt7_1", "keluar rumah", "", R.drawable.ic_pos_out, true),
            PictureOption("u21_s2_p2_opt7_2", "masuk rumah", "", R.drawable.ic_pos_in, false),
            PictureOption("u21_s2_p2_opt7_3", "naik ke atas", "", R.drawable.ic_pos_up, false),
            PictureOption("u21_s2_p2_opt7_4", "turun ke bawah", "", R.drawable.ic_pos_down, false)
        )
    )""",
            f"""    // 8. Soal 8: Ketik Pinyin (keluar rumah -> chūmén)
    Exercise(
        id = "u21_s2_p2_q8",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "keluar rumah / bepergian",
        sentenceWithBlank = "出门 (________)",
        targetHanzi = "出门",
        targetPinyin = "chūmén",
        correctAnswer = "chumen",
        keyboardKeys = {k2_p2_q8},
        audioToSpeak = "出门"
    )""",
            f"""    // 9. Soal 9: Susun Kalimat (Dia tidak mau keluar, ingin istirahat di rumah.)
    Exercise(
        id = "u21_s2_p2_q9",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Dia tidak mau keluar rumah.",
        targetHanzi = "他 不 想 出门。",
        targetPinyin = "Tā bù xiǎng chūmén.",
        wordChips = listOf("他:tā", "不:bù", "想:xiǎng", "出门。:chūmén.", "进去:jìnqù"),
        correctAnswer = "他,不,想,出门。",
        audioToSpeak = "他不想出门。"
    )""",
            f"""    // 10. Soal 10: Ketuk Pasangan yang Sesuai (Rangkuman Bepergian Keluar)
    Exercise(
        id = "u21_s2_p2_m10",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u21_s2_p2_m10_1", "出门", "chūmén", "keluar rumah"),
            MatchPairItem("u21_s2_p2_m10_2", "出去", "chūqù", "keluar ke sana"),
            MatchPairItem("u21_s2_p2_m10_3", "散步", "sànbù", "jalan santai"),
            MatchPairItem("u21_s2_p2_m10_4", "休息", "xiūxi", "istirahat")
        )
    )"""
        ]
    }

    # =========================================================================
    # STAGE 3: Dinamika Naik Vertikal (上来, 上去)
    # =========================================================================
    k3_p1_q4 = make_keys("shanglai")
    k3_p1_q8 = make_keys("kuaishanglai")
    k3_p2_q4 = make_keys("shangqu")
    k3_p2_q8 = make_keys("paishangqu")
    
    stages[3] = {
        "p1": [
            f"""    // 1. Soal 1: Pilihan Gambar (上来 -> naik ke sini)
    Exercise(
        id = "u21_s3_p1_q1",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "上来",
        targetPinyin = "shànglái",
        targetTranslation = "naik ke sini",
        correctAnswer = "naik ke sini",
        audioToSpeak = "上来",
        pictureOptions = listOf(
            PictureOption("u21_s3_p1_opt1", "naik ke sini", "", R.drawable.ic_pos_up, true),
            PictureOption("u21_s3_p1_opt2", "turun ke bawah", "", R.drawable.ic_pos_down, false),
            PictureOption("u21_s3_p1_opt3", "masuk ke dalam", "", R.drawable.ic_pos_in, false),
            PictureOption("u21_s3_p1_opt4", "keluar ke luar", "", R.drawable.ic_pos_out, false)
        )
    )""",
            f"""    // 2. Soal 2: Susun Kalimat (Saya di lantai dua, cepatlah kamu naik kemari.)
    Exercise(
        id = "u21_s3_p1_q2",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Saya di lantai dua, cepat naik kemari.",
        targetHanzi = "我 在 二 楼， 你 快 上来 吧。",
        targetPinyin = "Wǒ zài èr lóu, nǐ kuài shànglái ba.",
        wordChips = listOf("我:wǒ", "在:zài", "二:èr", "楼，:lóu,", "你:nǐ", "快:kuài", "上来:shànglái", "吧。:ba.", "下去:xiàqù"),
        correctAnswer = "我,在,二,楼，,你,快,上来,吧。",
        audioToSpeak = "我在二楼，你快上来吧。"
    )""",
            f"""    // 3. Soal 3: Ketuk Pasangan yang Sesuai (Naik Kemari)
    Exercise(
        id = "u21_s3_p1_q3",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u21_s3_p1_m1", "上来", "shànglái", "naik ke sini"),
            MatchPairItem("u21_s3_p1_m2", "二楼", "èr lóu", "lantai dua"),
            MatchPairItem("u21_s3_p1_m3", "走上来", "zǒu shànglái", "jalan naik kemari"),
            MatchPairItem("u21_s3_p1_m4", "快上来", "kuài shànglái", "cepat naik")
        )
    )""",
            f"""    // 4. Soal 4: Ketik Pinyin (naik ke sini -> shànglái)
    Exercise(
        id = "u21_s3_p1_q4",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "naik ke sini",
        sentenceWithBlank = "上来 (________)",
        targetHanzi = "上来",
        targetPinyin = "shànglái",
        correctAnswer = "shanglai",
        keyboardKeys = {k3_p1_q4},
        audioToSpeak = "上来"
    )""",
            f"""    // 5. Soal 5: Mendengar Kalimat (Rule 10: illustrationRes = 0)
    Exercise(
        id = "u21_s3_p1_q5",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Apa yang Anda dengar?",
        targetTranslation = "Silakan naik ke mobil.",
        targetHanzi = "请 大家 快 上 车 来。",
        targetPinyin = "Qǐng dàjiā kuài shàng chē lái.",
        wordChips = listOf("请:qǐng", "大家:dàjiā", "快:kuài", "上:shàng", "车:chē", "来。:lái.", "下:xià"),
        correctAnswer = "请,大家,快,上,车,来。",
        illustrationRes = 0,
        audioToSpeak = "请大家快上车来。"
    )""",
            f"""    // 6. Soal 6: Pilihan Kalimat
    Exercise(
        id = "u21_s3_p1_q6",
        type = ExerciseType.SENTENCE_CHOICE,
        title = "Pilih terjemahan yang benar",
        targetHanzi = "他 拿 着 一 本 书 走 上来 了。",
        targetPinyin = "Tā ná zhe yì běn shū zǒu shànglái le.",
        targetTranslation = "Dia membawa buku berjalan naik kemari.",
        correctAnswer = "Tā ná zhe yì běn shū zǒu shànglái le.\\n他 拿 着 一 本 书 走 上来 了。",
        options = listOf(
            "Tā ná zhe yì běn shū zǒu shànglái le.\\n他 拿 着 一 本 书 走 上来 了。",
            "Tā ná zhe yì běn shū zǒu xiàlái le.\\n他 拿 着 一 本 书 走 下来 了。",
            "Wǒ ná zhe yì běn shū zǒu shànglái le.\\n我 拿 着 一 本 书 走 上来 了。"
        ),
        audioToSpeak = "他拿着一本书走上来了。"
    )""",
            f"""    // 7. Soal 7: Pilihan Gambar (走上来 -> berjalan naik kemari)
    Exercise(
        id = "u21_s3_p1_q7",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "走上来",
        targetPinyin = "zǒu shànglái",
        targetTranslation = "berjalan naik kemari",
        correctAnswer = "berjalan naik kemari",
        audioToSpeak = "走上来",
        pictureOptions = listOf(
            PictureOption("u21_s3_p1_opt7_1", "naik kemari", "", R.drawable.ic_pos_up, true),
            PictureOption("u21_s3_p1_opt7_2", "turun ke bawah", "", R.drawable.ic_pos_down, false),
            PictureOption("u21_s3_p1_opt7_3", "keluar ke sana", "", R.drawable.ic_pos_out, false),
            PictureOption("u21_s3_p1_opt7_4", "masuk ke dalam", "", R.drawable.ic_pos_in, false)
        )
    )""",
            f"""    // 8. Soal 8: Ketik Pinyin (naik ke sini -> shànglái)
    Exercise(
        id = "u21_s3_p1_q8",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "naik ke sini",
        sentenceWithBlank = "上来 (________)",
        targetHanzi = "上来",
        targetPinyin = "shànglái",
        correctAnswer = "shanglai",
        keyboardKeys = {k3_p1_q4},
        audioToSpeak = "上来"
    )""",
            f"""    // 9. Soal 9: Susun Kalimat (Kucing kecil melompat naik kemari.)
    Exercise(
        id = "u21_s3_p1_q9",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Kucing melompat naik kemari.",
        targetHanzi = "小猫 跳 上来 了。",
        targetPinyin = "Xiǎomāo tiào shànglái le.",
        wordChips = listOf("小猫:xiǎomāo", "跳:tiào", "上来:shànglái", "了。:le.", "下去:xiàqù"),
        correctAnswer = "小猫,跳,上来,了。",
        audioToSpeak = "小猫跳上来了。"
    )""",
            f"""    // 10. Soal 10: Ketuk Pasangan yang Sesuai (Rangkuman Naik Mendekat)
    Exercise(
        id = "u21_s3_p1_m10",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u21_s3_p1_m10_1", "上来", "shànglái", "naik kemari"),
            MatchPairItem("u21_s3_p1_m10_2", "跳上来", "tiào shànglái", "lompat naik"),
            MatchPairItem("u21_s3_p1_m10_3", "快上来", "kuài shànglái", "cepat naik"),
            MatchPairItem("u21_s3_p1_m10_4", "二楼上", "èr lóu shàng", "di lantai dua")
        )
    )"""
        ],
        "p2": [
            f"""    // 1. Soal 1: Pilihan Gambar (上去 -> naik ke sana)
    Exercise(
        id = "u21_s3_p2_q1",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "上去",
        targetPinyin = "shàngqù",
        targetTranslation = "naik ke sana",
        correctAnswer = "naik ke sana",
        audioToSpeak = "上去",
        pictureOptions = listOf(
            PictureOption("u21_s3_p2_opt1", "naik ke sana", "", R.drawable.ic_pos_up, true),
            PictureOption("u21_s3_p2_opt2", "turun ke bawah", "", R.drawable.ic_pos_down, false),
            PictureOption("u21_s3_p2_opt3", "masuk ke sini", "", R.drawable.ic_pos_in, false),
            PictureOption("u21_s3_p2_opt4", "keluar ke sana", "", R.drawable.ic_pos_out, false)
        )
    )""",
            f"""    // 2. Soal 2: Susun Kalimat (Mereka sudah mendaki naik ke atas.)
    Exercise(
        id = "u21_s3_p2_q2",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Mereka sudah naik ke atas sana.",
        targetHanzi = "他们 已经 爬 上去 了。",
        targetPinyin = "Tāmen yǐjīng pá shàngqù le.",
        wordChips = listOf("他们:tāmen", "已经:yǐjīng", "爬:pá", "上去:shàngqù", "了。:le.", "下来:xiàlái"),
        correctAnswer = "他们,已经,爬,上去,了。",
        audioToSpeak = "他们已经爬上去了。"
    )""",
            f"""    // 3. Soal 3: Ketuk Pasangan yang Sesuai (Naik Menjauh)
    Exercise(
        id = "u21_s3_p2_m3",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u21_s3_p2_m1", "上去", "shàngqù", "naik ke sana"),
            MatchPairItem("u21_s3_p2_m2", "爬上去", "pá shàngqù", "mendaki naik"),
            MatchPairItem("u21_s3_p2_m3", "走上去", "zǒu shàngqù", "berjalan naik"),
            MatchPairItem("u21_s3_p2_m4", "楼顶", "lóudǐng", "atap gedung")
        )
    )""",
            f"""    // 4. Soal 4: Ketik Pinyin (naik ke sana -> shàngqù)
    Exercise(
        id = "u21_s3_p2_q4",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "naik ke sana",
        sentenceWithBlank = "上去 (________)",
        targetHanzi = "上去",
        targetPinyin = "shàngqù",
        correctAnswer = "shangqu",
        keyboardKeys = {k3_p2_q4},
        audioToSpeak = "上去"
    )""",
            f"""    // 5. Soal 5: Mendengar Kalimat (Rule 10: illustrationRes = 0)
    Exercise(
        id = "u21_s3_p2_q5",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Apa yang Anda dengar?",
        targetTranslation = "Buku-buku ini tolong bawakan naik ke atas.",
        targetHanzi = "这些 书 请 拿 上去。",
        targetPinyin = "Zhèxiē shū qǐng ná shàngqù.",
        wordChips = listOf("这些:zhèxiē", "书:shū", "请:qǐng", "拿:ná", "上去。:shàngqù.", "下来:xiàlái"),
        correctAnswer = "这些,书,请,拿,上去。",
        illustrationRes = 0,
        audioToSpeak = "这些书请拿上去。"
    )""",
            f"""    // 6. Soal 6: Pilihan Kalimat
    Exercise(
        id = "u21_s3_p2_q6",
        type = ExerciseType.SENTENCE_CHOICE,
        title = "Pilih terjemahan yang benar",
        targetHanzi = "电梯 坏 了， 我们 走 上去 吧。",
        targetPinyin = "Diàntī huài le, wǒmen zǒu shàngqù ba.",
        targetTranslation = "Lift rusak, ayo kita berjalan naik ke atas.",
        correctAnswer = "Diàntī huài le, wǒmen zǒu shàngqù ba.\\n电梯 坏 了， 我们 走 上去 吧。",
        options = listOf(
            "Diàntī huài le, wǒmen zǒu shàngqù ba.\\n电梯 坏 了， 我们 走 上去 吧。",
            "Diàntī huài le, wǒmen zǒu xiàqù ba.\\n电梯 坏 了， 我们 走 下去 吧。",
            "Diàntī hǎo le, wǒmen zuò diàntī ba.\\n电梯 好 了， 我们 坐 电梯 吧。"
        ),
        audioToSpeak = "电梯坏了，我们走上去吧。"
    )""",
            f"""    // 7. Soal 7: Pilihan Gambar (走上去 -> berjalan naik)
    Exercise(
        id = "u21_s3_p2_q7",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "走上去",
        targetPinyin = "zǒu shàngqù",
        targetTranslation = "berjalan naik ke sana",
        correctAnswer = "berjalan naik ke sana",
        audioToSpeak = "走上去",
        pictureOptions = listOf(
            PictureOption("u21_s3_p2_opt7_1", "naik ke sana", "", R.drawable.ic_pos_up, true),
            PictureOption("u21_s3_p2_opt7_2", "turun ke bawah", "", R.drawable.ic_pos_down, false),
            PictureOption("u21_s3_p2_opt7_3", "keluar ke sana", "", R.drawable.ic_pos_out, false),
            PictureOption("u21_s3_p2_opt7_4", "masuk ke sini", "", R.drawable.ic_pos_in, false)
        )
    )""",
            f"""    // 8. Soal 8: Ketik Pinyin (naik ke sana -> shàngqù)
    Exercise(
        id = "u21_s3_p2_q8",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "naik ke sana",
        sentenceWithBlank = "上去 (________)",
        targetHanzi = "上去",
        targetPinyin = "shàngqù",
        correctAnswer = "shangqu",
        keyboardKeys = {k3_p2_q4},
        audioToSpeak = "上去"
    )""",
            f"""    // 9. Soal 9: Susun Kalimat (Dia berlari naik ke lantai atas.)
    Exercise(
        id = "u21_s3_p2_q9",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Dia lari naik ke lantai atas.",
        targetHanzi = "他 跑 上去 了。",
        targetPinyin = "Tā pǎo shàngqù le.",
        wordChips = listOf("他:tā", "跑:pǎo", "上去:shàngqù", "了。:le.", "下来:xiàlái"),
        correctAnswer = "他,跑,上去,了。",
        audioToSpeak = "他跑上去了。"
    )""",
            f"""    // 10. Soal 10: Ketuk Pasangan yang Sesuai (Rangkuman Naik Menjauh)
    Exercise(
        id = "u21_s3_p2_m10",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u21_s3_p2_m10_1", "上去", "shàngqù", "naik ke sana"),
            MatchPairItem("u21_s3_p2_m10_2", "跑上去", "pǎo shàngqù", "lari naik"),
            MatchPairItem("u21_s3_p2_m10_3", "拿上去", "ná shàngqù", "bawa naik"),
            MatchPairItem("u21_s3_p2_m10_4", "上楼梯", "shàng lóutī", "naik tangga")
        )
    )"""
        ]
    }

    # =========================================================================
    # STAGE 4: Dinamika Turun Vertikal (下来, 下去)
    # =========================================================================
    k4_p1_q4 = make_keys("xialai")
    k4_p1_q8 = make_keys("kuaixialai")
    k4_p2_q4 = make_keys("xiaqu")
    k4_p2_q8 = make_keys("zouxiaqu")
    
    stages[4] = {
        "p1": [
            f"""    // 1. Soal 1: Pilihan Gambar (下来 -> turun ke sini)
    Exercise(
        id = "u21_s4_p1_q1",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "下来",
        targetPinyin = "xiàlái",
        targetTranslation = "turun ke sini",
        correctAnswer = "turun ke sini",
        audioToSpeak = "下来",
        pictureOptions = listOf(
            PictureOption("u21_s4_p1_opt1", "turun ke sini", "", R.drawable.ic_pos_down, true),
            PictureOption("u21_s4_p1_opt2", "naik ke sini", "", R.drawable.ic_pos_up, false),
            PictureOption("u21_s4_p1_opt3", "masuk ke sini", "", R.drawable.ic_pos_in, false),
            PictureOption("u21_s4_p1_opt4", "keluar ke sana", "", R.drawable.ic_pos_out, false)
        )
    )""",
            f"""    // 2. Soal 2: Susun Kalimat (Kamu berdiri di atas terlalu tinggi, cepatlah turun!)
    Exercise(
        id = "u21_s4_p1_q2",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Terlalu tinggi, cepat turun kemari!",
        targetHanzi = "太 高 了， 快 下来！",
        targetPinyin = "Tài gāo le, kuài xiàlái!",
        wordChips = listOf("太:tài", "高:gāo", "了，:le,", "快:kuài", "下来！:xiàlái!", "上去:shàngqù"),
        correctAnswer = "太,高,了，,快,下来！",
        audioToSpeak = "太高了，快下来！"
    )""",
            f"""    // 3. Soal 3: Ketuk Pasangan yang Sesuai (Turun Kemari)
    Exercise(
        id = "u21_s4_p1_q3",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u21_s4_p1_m1", "下来", "xiàlái", "turun ke sini"),
            MatchPairItem("u21_s4_p1_m2", "快下来", "kuài xiàlái", "cepat turun"),
            MatchPairItem("u21_s4_p1_m3", "走下来", "zǒu xiàlái", "jalan turun"),
            MatchPairItem("u21_s4_p1_m4", "太高", "tài gāo", "terlalu tinggi")
        )
    )""",
            f"""    // 4. Soal 4: Ketik Pinyin (turun ke sini -> xiàlái)
    Exercise(
        id = "u21_s4_p1_q4",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "turun ke sini",
        sentenceWithBlank = "下来 (________)",
        targetHanzi = "下来",
        targetPinyin = "xiàlái",
        correctAnswer = "xialai",
        keyboardKeys = {k4_p1_q4},
        audioToSpeak = "下来"
    )""",
            f"""    // 5. Soal 5: Mendengar Kalimat (Rule 10: illustrationRes = 0)
    Exercise(
        id = "u21_s4_p1_q5",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Apa yang Anda dengar?",
        targetTranslation = "Guru telah berjalan turun dari lantai atas.",
        targetHanzi = "老师 从 楼上 走 下来 了。",
        targetPinyin = "Lǎoshī cóng lóushàng zǒu xiàlái le.",
        wordChips = listOf("老师:lǎoshī", "从:cóng", "楼上:lóushàng", "走:zǒu", "下来:xiàlái", "了。:le.", "上去:shàngqù"),
        correctAnswer = "老师,从,楼上,走,下来,了。",
        illustrationRes = 0,
        audioToSpeak = "老师从楼上走下来了。"
    )""",
            f"""    // 6. Soal 6: Pilihan Kalimat
    Exercise(
        id = "u21_s4_p1_q6",
        type = ExerciseType.SENTENCE_CHOICE,
        title = "Pilih terjemahan yang benar",
        targetHanzi = "小鸟 从 树上 飞 下来 了。",
        targetPinyin = "Xiǎoniǎo cóng shùshang fēi xiàlái le.",
        targetTranslation = "Burung kecil terbang turun dari atas pohon.",
        correctAnswer = "Xiǎoniǎo cóng shùshang fēi xiàlái le.\\n小鸟 从 树上 飞 下来 了。",
        options = listOf(
            "Xiǎoniǎo cóng shùshang fēi xiàlái le.\\n小鸟 从 树上 飞 下来 了。",
            "Xiǎoniǎo cóng shùshang fēi shàngqù le.\\n小鸟 从 树上 飞 上去 了。",
            "Xiǎomāo cóng shùshang fēi xiàlái le.\\n小猫 从 树上 飞 下来 了。"
        ),
        audioToSpeak = "小鸟从树上飞下来了。"
    )""",
            f"""    // 7. Soal 7: Pilihan Gambar (走下来 -> jalan turun)
    Exercise(
        id = "u21_s4_p1_q7",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "走下来",
        targetPinyin = "zǒu xiàlái",
        targetTranslation = "berjalan turun ke sini",
        correctAnswer = "berjalan turun ke sini",
        audioToSpeak = "走下来",
        pictureOptions = listOf(
            PictureOption("u21_s4_p1_opt7_1", "turun ke sini", "", R.drawable.ic_pos_down, true),
            PictureOption("u21_s4_p1_opt7_2", "naik ke sini", "", R.drawable.ic_pos_up, false),
            PictureOption("u21_s4_p1_opt7_3", "masuk", "", R.drawable.ic_pos_in, false),
            PictureOption("u21_s4_p1_opt7_4", "keluar", "", R.drawable.ic_pos_out, false)
        )
    )""",
            f"""    // 8. Soal 8: Ketik Pinyin (turun ke sini -> xiàlái)
    Exercise(
        id = "u21_s4_p1_q8",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "turun ke sini",
        sentenceWithBlank = "下来 (________)",
        targetHanzi = "下来",
        targetPinyin = "xiàlái",
        correctAnswer = "xialai",
        keyboardKeys = {k4_p1_q4},
        audioToSpeak = "下来"
    )""",
            f"""    // 9. Soal 9: Susun Kalimat (Ibu memanggil saya turun makan.)
    Exercise(
        id = "u21_s4_p1_q9",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Ibu memanggil saya turun makan.",
        targetHanzi = "妈妈 叫 我 下来 吃饭。",
        targetPinyin = "Māma jiào wǒ xiàlái chīfàn.",
        wordChips = listOf("妈妈:māma", "叫:jiào", "我:wǒ", "下来:xiàlái", "吃饭。:chīfàn.", "上去:shàngqù"),
        correctAnswer = "妈妈,叫,我,下来,吃饭。",
        audioToSpeak = "妈妈叫我下来吃饭。"
    )""",
            f"""    // 10. Soal 10: Ketuk Pasangan yang Sesuai (Rangkuman Turun Mendekat)
    Exercise(
        id = "u21_s4_p1_m10",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u21_s4_p1_m10_1", "下来", "xiàlái", "turun ke sini"),
            MatchPairItem("u21_s4_p1_m10_2", "飞下来", "fēi xiàlái", "terbang turun"),
            MatchPairItem("u21_s4_p1_m10_3", "叫我", "jiào wǒ", "memanggilku"),
            MatchPairItem("u21_s4_p1_m10_4", "下楼", "xià lóu", "turun lantai")
        )
    )"""
        ],
        "p2": [
            f"""    // 1. Soal 1: Pilihan Gambar (下去 -> turun ke sana)
    Exercise(
        id = "u21_s4_p2_q1",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "下去",
        targetPinyin = "xiàqù",
        targetTranslation = "turun ke sana",
        correctAnswer = "turun ke sana",
        audioToSpeak = "下去",
        pictureOptions = listOf(
            PictureOption("u21_s4_p2_opt1", "turun ke sana", "", R.drawable.ic_pos_down, true),
            PictureOption("u21_s4_p2_opt2", "naik ke sana", "", R.drawable.ic_pos_up, false),
            PictureOption("u21_s4_p2_opt3", "masuk", "", R.drawable.ic_pos_in, false),
            PictureOption("u21_s4_p2_opt4", "keluar", "", R.drawable.ic_pos_out, false)
        )
    )""",
            f"""    // 2. Soal 2: Susun Kalimat (Harap semua orang berjalan turun sesuai urutan.)
    Exercise(
        id = "u21_s4_p2_q2",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Harap berjalan turun teratur.",
        targetHanzi = "请 走 下去。",
        targetPinyin = "Qǐng zǒu xiàqù.",
        wordChips = listOf("请:qǐng", "走:zǒu", "下去。:xiàqù.", "上来:shànglái"),
        correctAnswer = "请,走,下去。",
        audioToSpeak = "请走下去。"
    )""",
            f"""    // 3. Soal 3: Ketuk Pasangan yang Sesuai (Turun Menjauh)
    Exercise(
        id = "u21_s4_p2_m3",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u21_s4_p2_m1", "下去", "xiàqù", "turun ke sana"),
            MatchPairItem("u21_s4_p2_m2", "走下去", "zǒu xiàqù", "berjalan turun"),
            MatchPairItem("u21_s4_p2_m3", "跑下去", "pǎo xiàqù", "berlari turun"),
            MatchPairItem("u21_s4_p2_m4", "楼下", "lóuxià", "lantai bawah")
        )
    )""",
            f"""    // 4. Soal 4: Ketik Pinyin (turun ke sana -> xiàqù)
    Exercise(
        id = "u21_s4_p2_q4",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "turun ke sana",
        sentenceWithBlank = "下去 (________)",
        targetHanzi = "下去",
        targetPinyin = "xiàqù",
        correctAnswer = "xiaqu",
        keyboardKeys = {k4_p2_q4},
        audioToSpeak = "下去"
    )""",
            f"""    // 5. Soal 5: Mendengar Kalimat (Rule 10: illustrationRes = 0)
    Exercise(
        id = "u21_s4_p2_q5",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Apa yang Anda dengar?",
        targetTranslation = "Dia membawa koper berjalan turun ke lantai bawah.",
        targetHanzi = "他 拿 着 箱子 走 下去 了。",
        targetPinyin = "Tā ná zhe xiāngzi zǒu xiàqù le.",
        wordChips = listOf("他:tā", "拿:ná", "着:zhe", "箱子:xiāngzi", "走:zǒu", "下去:xiàqù", "了。:le."),
        correctAnswer = "他,拿,着,箱子,走,下去,了。",
        illustrationRes = 0,
        audioToSpeak = "他拿着箱子走下去了。"
    )""",
            f"""    // 6. Soal 6: Pilihan Kalimat
    Exercise(
        id = "u21_s4_p2_q6",
        type = ExerciseType.SENTENCE_CHOICE,
        title = "Pilih terjemahan yang benar",
        targetHanzi = "太阳 落 下去 了。",
        targetPinyin = "Tàiyáng luò xiàqù le.",
        targetTranslation = "Matahari telah terbenam turun.",
        correctAnswer = "Tàiyáng luò xiàqù le.\\n太阳 落 下去 了。",
        options = listOf(
            "Tàiyáng luò xiàqù le.\\n太阳 落 下去 了。",
            "Tàiyáng shēng chūlái le.\\n太阳 升 出来 了。",
            "Yuèliang luò xiàqù le.\\n月亮 落 下去 了。"
        ),
        audioToSpeak = "太阳落下去了。"
    )""",
            f"""    // 7. Soal 7: Pilihan Gambar (走下去 -> berjalan turun ke sana)
    Exercise(
        id = "u21_s4_p2_q7",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "走下去",
        targetPinyin = "zǒu xiàqù",
        targetTranslation = "berjalan turun ke sana",
        correctAnswer = "berjalan turun ke sana",
        audioToSpeak = "走下去",
        pictureOptions = listOf(
            PictureOption("u21_s4_p2_opt7_1", "turun ke sana", "", R.drawable.ic_pos_down, true),
            PictureOption("u21_s4_p2_opt7_2", "naik ke atas", "", R.drawable.ic_pos_up, false),
            PictureOption("u21_s4_p2_opt7_3", "masuk ke sini", "", R.drawable.ic_pos_in, false),
            PictureOption("u21_s4_p2_opt7_4", "keluar ke sana", "", R.drawable.ic_pos_out, false)
        )
    )""",
            f"""    // 8. Soal 8: Ketik Pinyin (berjalan turun -> zǒuxiàqù)
    Exercise(
        id = "u21_s4_p2_q8",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "berjalan turun ke sana",
        sentenceWithBlank = "走下去 (________)",
        targetHanzi = "走下去",
        targetPinyin = "zǒuxiàqù",
        correctAnswer = "zouxiaqu",
        keyboardKeys = {k4_p2_q8},
        audioToSpeak = "走下去"
    )""",
            f"""    // 9. Soal 9: Susun Kalimat (Silakan bawa barang-barang ini turun ke bawah.)
    Exercise(
        id = "u21_s4_p2_q9",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Tolong bawa barang ini turun.",
        targetHanzi = "请 把 东西 拿 下去。",
        targetPinyin = "Qǐng bǎ dōngxi ná xiàqù.",
        wordChips = listOf("请:qǐng", "把:bǎ", "东西:dōngxi", "拿:ná", "下去。:xiàqù.", "上来:shànglái"),
        correctAnswer = "请,把,东西,拿,下去。",
        audioToSpeak = "请把东西拿下去。"
    )""",
            f"""    // 10. Soal 10: Ketuk Pasangan yang Sesuai (Rangkuman Turun Menjauh)
    Exercise(
        id = "u21_s4_p2_m10",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u21_s4_p2_m10_1", "下去", "xiàqù", "turun ke sana"),
            MatchPairItem("u21_s4_p2_m10_2", "拿下去", "ná xiàqù", "bawa turun"),
            MatchPairItem("u21_s4_p2_m10_3", "太阳落", "tàiyáng luò", "mentari terbenam"),
            MatchPairItem("u21_s4_p2_m10_4", "按顺序", "àn shùnxù", "teratur rapi")
        )
    )"""
        ]
    }

    # =========================================================================
    # STAGE 5: Melintas, Mendekat & Menjauh (过来, 过去, 回来, 回去, Evaluasi Bab 21)
    # =========================================================================
    k5_p1_q4 = make_keys("guolai")
    k5_p1_q8 = make_keys("guoqu")
    k5_p2_q4 = make_keys("huilai")
    k5_p2_q8 = make_keys("huiqu")
    
    stages[5] = {
        "p1": [
            f"""    // 1. Soal 1: Pilihan Gambar (过来 -> datang kemari / mendekat)
    Exercise(
        id = "u21_s5_p1_q1",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "过来",
        targetPinyin = "guòlái",
        targetTranslation = "datang kemari / mendekat",
        correctAnswer = "datang kemari / mendekat",
        audioToSpeak = "过来",
        pictureOptions = listOf(
            PictureOption("u21_s5_p1_opt1", "datang kemari", "", R.drawable.ic_trans_come, true),
            PictureOption("u21_s5_p1_opt2", "pergi ke sana", "", R.drawable.ic_trans_go, false),
            PictureOption("u21_s5_p1_opt3", "masuk ke sini", "", R.drawable.ic_pos_in, false),
            PictureOption("u21_s5_p1_opt4", "keluar ke sana", "", R.drawable.ic_pos_out, false)
        )
    )""",
            f"""    // 2. Soal 2: Susun Kalimat (Kamu kemarilah sebentar, saya ada bicara kepadamu.)
    Exercise(
        id = "u21_s5_p1_q2",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Kamu kemari, saya ada bicara.",
        targetHanzi = "你 过来， 我 有 话 对 你 说。",
        targetPinyin = "Nǐ guòlái, wǒ yǒu huà duì nǐ shuō.",
        wordChips = listOf("你:nǐ", "过来，:guòlái,", "我:wǒ", "有:yǒu", "话:huà", "对:duì", "你:nǐ", "说。:shuō.", "过去:guòqù"),
        correctAnswer = "你,过来，,我,有,话,对,你,说。",
        audioToSpeak = "你过来，我有话对你说。"
    )""",
            f"""    // 3. Soal 3: Ketuk Pasangan yang Sesuai (Mendekat & Melintas Menjauh)
    Exercise(
        id = "u21_s5_p1_m3",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u21_s5_p1_m1", "过来", "guòlái", "datang kemari"),
            MatchPairItem("u21_s5_p1_m2", "过去", "guòqù", "pergi ke sana"),
            MatchPairItem("u21_s5_p1_m3", "走过去", "zǒu guòqù", "jalan menyeberang"),
            MatchPairItem("u21_s5_p1_m4", "对你说", "duì nǐ shuō", "bicara padamu")
        )
    )""",
            f"""    // 4. Soal 4: Ketik Pinyin (datang kemari -> guòlái)
    Exercise(
        id = "u21_s5_p1_q4",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "datang kemari / mendekat",
        sentenceWithBlank = "过来 (________)",
        targetHanzi = "过来",
        targetPinyin = "guòlái",
        correctAnswer = "guolai",
        keyboardKeys = {k5_p1_q4},
        audioToSpeak = "过来"
    )""",
            f"""    // 5. Soal 5: Mendengar Kalimat (Rule 10: illustrationRes = 0)
    Exercise(
        id = "u21_s5_p1_q5",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Apa yang Anda dengar?",
        targetTranslation = "Dia berjalan menyeberang ke seberang jalan.",
        targetHanzi = "他 朝 对面 走 过去 了。",
        targetPinyin = "Tā cháo duìmiàn zǒu guòqù le.",
        wordChips = listOf("他:tā", "朝:cháo", "对面:duìmiàn", "走:zǒu", "过去:guòqù", "了。:le.", "过来:guòlái"),
        correctAnswer = "他,朝,对面,走,过去,了。",
        illustrationRes = 0,
        audioToSpeak = "他朝对面走过去了。"
    )""",
            f"""    // 6. Soal 6: Pilihan Kalimat
    Exercise(
        id = "u21_s5_p1_q6",
        type = ExerciseType.SENTENCE_CHOICE,
        title = "Pilih terjemahan yang benar",
        targetHanzi = "请 您 走 过来 看 一 看。",
        targetPinyin = "Qǐng nín zǒu guòlái kàn yi kàn.",
        targetTranslation = "Silakan Anda berjalan kemari melihat-lihat.",
        correctAnswer = "Qǐng nín zǒu guòlái kàn yi kàn.\\n请 您 走 过来 看 一 看。",
        options = listOf(
            "Qǐng nín zǒu guòlái kàn yi kàn.\\n请 您 走 过来 看 一 看。",
            "Qǐng nín zǒu guòqù kàn yi kàn.\\n请 您 走 过去 看 一 看。",
            "Qǐng nín zǒu chūlái kàn yi kàn.\\n请 您 走 出来 看 一 看。"
        ),
        audioToSpeak = "请您走过来求看一下。"
    )""",
            f"""    // 7. Soal 7: Pilihan Gambar (过去 -> pergi ke sana)
    Exercise(
        id = "u21_s5_p1_q7",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "过去",
        targetPinyin = "guòqù",
        targetTranslation = "pergi ke sana",
        correctAnswer = "pergi ke sana",
        audioToSpeak = "过去",
        pictureOptions = listOf(
            PictureOption("u21_s5_p1_opt7_1", "pergi ke sana", "", R.drawable.ic_trans_go, true),
            PictureOption("u21_s5_p1_opt7_2", "datang kemari", "", R.drawable.ic_trans_come, false),
            PictureOption("u21_s5_p1_opt7_3", "masuk ke sini", "", R.drawable.ic_pos_in, false),
            PictureOption("u21_s5_p1_opt7_4", "keluar ke sana", "", R.drawable.ic_pos_out, false)
        )
    )""",
            f"""    // 8. Soal 8: Ketik Pinyin (pergi ke sana -> guòqù)
    Exercise(
        id = "u21_s5_p1_q8",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "pergi ke sana / masa lalu",
        sentenceWithBlank = "过去 (________)",
        targetHanzi = "过去",
        targetPinyin = "guòqù",
        correctAnswer = "guoqu",
        keyboardKeys = {k5_p1_q8},
        audioToSpeak = "过去"
    )""",
            f"""    // 9. Soal 9: Susun Kalimat (Ayo kita menyeberang jalan bersama-sama.)
    Exercise(
        id = "u21_s5_p1_q9",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Ayo kita jalan menyeberang ke sana.",
        targetHanzi = "我们 一起 走 过去 吧。",
        targetPinyin = "Wǒmen yìqǐ zǒu guòqù ba.",
        wordChips = listOf("我们:wǒmen", "一起:yìqǐ", "走:zǒu", "过去:guòqù", "吧。:ba.", "过来:guòlái"),
        correctAnswer = "我们,一起,走,过去,吧。",
        audioToSpeak = "我们一起走过去吧。"
    )""",
            f"""    // 10. Soal 10: Ketuk Pasangan yang Sesuai (Rangkuman Melintas Jalan)
    Exercise(
        id = "u21_s5_p1_m10",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u21_s5_p1_m10_1", "过来", "guòlái", "datang kemari"),
            MatchPairItem("u21_s5_p1_m10_2", "过去", "guòqù", "pergi ke sana"),
            MatchPairItem("u21_s5_p1_m10_3", "马路对面", "mǎlù duìmiàn", "seberang jalan"),
            MatchPairItem("u21_s5_p1_m10_4", "看一看", "kàn yi kàn", "melihat-lihat")
        )
    )"""
        ],
        "p2": [
            f"""    // 1. Soal 1: Pilihan Gambar (回来 -> kembali ke sini / pulang)
    Exercise(
        id = "u21_s5_p2_q1",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "回来",
        targetPinyin = "huílái",
        targetTranslation = "kembali ke sini / pulang",
        correctAnswer = "kembali ke sini / pulang",
        audioToSpeak = "回来",
        pictureOptions = listOf(
            PictureOption("u21_s5_p2_opt1", "pulang kemari", "", R.drawable.ic_trans_return_home, true),
            PictureOption("u21_s5_p2_opt2", "pergi ke sana", "", R.drawable.ic_trans_go, false),
            PictureOption("u21_s5_p2_opt3", "masuk ke sini", "", R.drawable.ic_pos_in, false),
            PictureOption("u21_s5_p2_opt4", "keluar ke sana", "", R.drawable.ic_pos_out, false)
        )
    )""",
            f"""    // 2. Soal 2: Susun Kalimat (Hari sudah gelap, ayo kita lekas pulang.)
    Exercise(
        id = "u21_s5_p2_q2",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Hari sudah gelap, lekas pulang.",
        targetHanzi = "天 黑 了， 我们 快 回去 吧。",
        targetPinyin = "Tiān hēi le, wǒmen kuài huíqù ba.",
        wordChips = listOf("天:tiān", "黑:hēi", "了，:le,", "我们:wǒmen", "快:kuài", "回去:huíqù", "吧。:ba.", "出来:chūlái"),
        correctAnswer = "天,黑,了，,我们,快,回去,吧。",
        audioToSpeak = "天黑了，我们快回去吧。"
    )""",
            f"""    // 3. Soal 3: Ketuk Pasangan yang Sesuai (Pulang Kemari vs Pulang Ke Sana)
    Exercise(
        id = "u21_s5_p2_m3",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u21_s5_p2_m1", "回来", "huílái", "kembali ke sini"),
            MatchPairItem("u21_s5_p2_m2", "回去", "huíqù", "kembali ke sana"),
            MatchPairItem("u21_s5_p2_m3", "回家去", "huí jiā qù", "pulang ke rumah"),
            MatchPairItem("u21_s5_p2_m4", "天黑了", "tiān hēi le", "hari gelap")
        )
    )""",
            f"""    // 4. Soal 4: Ketik Pinyin (kembali ke sini -> huílái)
    Exercise(
        id = "u21_s5_p2_q4",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "kembali ke sini / pulang",
        sentenceWithBlank = "回来 (________)",
        targetHanzi = "回来",
        targetPinyin = "huílái",
        correctAnswer = "huilai",
        keyboardKeys = {k5_p2_q4},
        audioToSpeak = "回来"
    )""",
            f"""    // 5. Soal 5: Mendengar Kalimat (Rule 10: illustrationRes = 0)
    Exercise(
        id = "u21_s5_p2_q5",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Apa yang Anda dengar?",
        targetTranslation = "Kamu kapan pulang ke sini menjenguk kami?",
        targetHanzi = "你 什么时候 回来 看 我们？",
        targetPinyin = "Nǐ shénmeshíhou huílái kàn wǒmen?",
        wordChips = listOf("你:nǐ", "什么时候:shénmeshíhou", "回来:huílái", "看:kàn", "我们？:wǒmen?", "回去:huíqù"),
        correctAnswer = "你,什么时候,回来,看,我们？",
        illustrationRes = 0,
        audioToSpeak = "你什么时候回来看我们？"
    )""",
            f"""    // 6. Soal 6: Pilihan Kalimat
    Exercise(
        id = "u21_s5_p2_q6",
        type = ExerciseType.SENTENCE_CHOICE,
        title = "Pilih terjemahan yang benar",
        targetHanzi = "爸爸 下班 回来 了。",
        targetPinyin = "Bàba xiàbān huílái le.",
        targetTranslation = "Ayah pulang kerja kembali ke rumah.",
        correctAnswer = "Bàba xiàbān huílái le.\\n爸爸 下班 回来 了。",
        options = listOf(
            "Bàba xiàbān huílái le.\\n爸爸 下班 回来 了。",
            "Bàba shàngbān qù le.\\n爸爸 上班 去 了。",
            "Māma xiàbān huílái le.\\n妈妈 下班 回来 了。"
        ),
        audioToSpeak = "爸爸下班回来了。"
    )""",
            f"""    // 7. Soal 7: Pilihan Gambar (回去 -> kembali ke sana)
    Exercise(
        id = "u21_s5_p2_q7",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "回去",
        targetPinyin = "huíqù",
        targetTranslation = "kembali ke sana / pulang",
        correctAnswer = "kembali ke sana / pulang",
        audioToSpeak = "回去",
        pictureOptions = listOf(
            PictureOption("u21_s5_p2_opt7_1", "kembali ke sana", "", R.drawable.ic_trans_go, true),
            PictureOption("u21_s5_p2_opt7_2", "pulang ke sini", "", R.drawable.ic_trans_return_home, false),
            PictureOption("u21_s5_p2_opt7_3", "masuk ke sini", "", R.drawable.ic_pos_in, false),
            PictureOption("u21_s5_p2_opt7_4", "keluar ke luar", "", R.drawable.ic_pos_out, false)
        )
    )""",
            f"""    // 8. Soal 8: Ketik Pinyin (kembali ke sana -> huíqù)
    Exercise(
        id = "u21_s5_p2_q8",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "kembali ke sana / pulang",
        sentenceWithBlank = "回去 (________)",
        targetHanzi = "回去",
        targetPinyin = "huíqù",
        correctAnswer = "huiqu",
        keyboardKeys = {k5_p2_q8},
        audioToSpeak = "回去"
    )""",
            f"""    // 9. Soal 9: Susun Kalimat (Waktunya sudah larut, saya harus pulang ke sana.)
    Exercise(
        id = "u21_s5_p2_q9",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Waktu tidak pagi, saya harus pulang.",
        targetHanzi = "时间 不 早 了， 我 得 回去 了。",
        targetPinyin = "Shíjiān bù zǎo le, wǒ děi huíqù le.",
        wordChips = listOf("时间:shíjiān", "不:bù", "早:zǎo", "了，:le,", "我:wǒ", "得:děi", "回去:huíqù", "了。:le."),
        correctAnswer = "时间,不,早,了，,我,得,回去,了。",
        audioToSpeak = "时间不早了，我得回去了。"
    )""",
            f"""    // 10. Soal 10: Ketuk Pasangan yang Sesuai (Grand Review Final Bab 21)
    Exercise(
        id = "u21_s5_p2_m10",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u21_s5_p2_m10_1", "回来", "huílái", "kembali kemari"),
            MatchPairItem("u21_s5_p2_m10_2", "回去", "huíqù", "kembali ke sana"),
            MatchPairItem("u21_s5_p2_m10_3", "走进来", "zǒu jìnlái", "masuk kemari"),
            MatchPairItem("u21_s5_p2_m10_4", "跑出去", "pǎo chūqù", "lari ke luar")
        )
    )"""
        ]
    }

    for s_idx in range(1, 6):
        filename = f"{base_dir}/Bab21Stage{s_idx}Data.kt"
        p1_code = ",\n\n".join(stages[s_idx]["p1"])
        p2_code = ",\n\n".join(stages[s_idx]["p2"])
        
        content = f"""package com.example.chineselearning.data.repository

import com.example.chineselearning.R
import com.example.chineselearning.data.model.Exercise
import com.example.chineselearning.data.model.ExerciseType
import com.example.chineselearning.data.model.MatchPairItem
import com.example.chineselearning.data.model.PictureOption

val bab21Stage{s_idx}Part1Exercises = listOf(
{p1_code}
)

val bab21Stage{s_idx}Part2Exercises = listOf(
{p2_code}
)
"""
        with open(filename, "w", encoding="utf-8") as f:
            f.write(content)
        print(f"Written {filename}")

if __name__ == "__main__":
    generate_bab21()
