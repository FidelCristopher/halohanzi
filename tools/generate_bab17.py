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

def generate_bab17():
    base_dir = "app/src/main/java/com/example/chineselearning/data/repository"
    
    stages = {}
    
    # =========================================================================
    # STAGE 1: Kakek, Nenek & Pasangan Hidup (爷爷, 奶奶, 丈夫, 妻子)
    # =========================================================================
    k1_p1_q4 = make_keys("yeye")
    k1_p1_q8 = make_keys("nainai")
    k1_p2_q4 = make_keys("zhangfu")
    k1_p2_q8 = make_keys("qizi")
    
    stages[1] = {
        "p1": [
            f"""    // 1. Soal 1: Pilihan Gambar (爷爷 -> kakek)
    Exercise(
        id = "u17_s1_p1_q1",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "爷爷",
        targetPinyin = "yéye",
        targetTranslation = "kakek",
        correctAnswer = "kakek",
        audioToSpeak = "爷爷",
        pictureOptions = listOf(
            PictureOption("u17_s1_p1_opt1", "kakek", "", R.drawable.ic_fam_father, true),
            PictureOption("u17_s1_p1_opt2", "nenek", "", R.drawable.ic_fam_mother, false),
            PictureOption("u17_s1_p1_opt3", "anak", "", R.drawable.ic_fam_child, false),
            PictureOption("u17_s1_p1_opt4", "rumah", "", R.drawable.ic_fam_home, false)
        )
    )""",
            f"""    // 2. Soal 2: Susun Kalimat (Kakek saya tahun ini berusia 70 tahun.)
    Exercise(
        id = "u17_s1_p1_q2",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Kakek saya tahun ini 70 tahun.",
        targetHanzi = "我 爷爷 今年 七十 岁。",
        targetPinyin = "Wǒ yéye jīnnián qīshí suì.",
        wordChips = listOf("我:wǒ", "爷爷:yéye", "今年:jīnnián", "七十:qīshí", "岁。:suì.", "奶奶:nǎinai"),
        correctAnswer = "我,爷爷,今年,七十,岁。",
        audioToSpeak = "我爷爷今年七十岁。"
    )""",
            f"""    // 3. Soal 3: Ketuk Pasangan yang Sesuai (Kakek & Nenek)
    Exercise(
        id = "u17_s1_p1_q3",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u17_s1_p1_m1", "爷爷", "yéye", "kakek"),
            MatchPairItem("u17_s1_p1_m2", "奶奶", "nǎinai", "nenek"),
            MatchPairItem("u17_s1_p1_m3", "今年", "jīnnián", "tahun ini"),
            MatchPairItem("u17_s1_p1_m4", "做饭", "zuòfàn", "memasak")
        )
    )""",
            f"""    // 4. Soal 4: Ketik Pinyin (kakek -> yéye)
    Exercise(
        id = "u17_s1_p1_q4",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "kakek",
        sentenceWithBlank = "爷爷 (________)",
        targetHanzi = "爷爷",
        targetPinyin = "yéye",
        correctAnswer = "yeye",
        keyboardKeys = {k1_p1_q4},
        audioToSpeak = "爷爷"
    )""",
            f"""    // 5. Soal 5: Mendengar Kalimat (Rule 10: illustrationRes = 0)
    Exercise(
        id = "u17_s1_p1_q5",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Apa yang Anda dengar?",
        targetTranslation = "Nenek memasak sangat enak.",
        targetHanzi = "奶奶 做饭 很 好吃。",
        targetPinyin = "Nǎinai zuòfàn hěn hǎochī.",
        wordChips = listOf("奶奶:nǎinai", "做饭:zuòfàn", "很:hěn", "好吃。:hǎochī.", "爷爷:yéye"),
        correctAnswer = "奶奶,做饭,很,好吃。",
        illustrationRes = 0,
        audioToSpeak = "奶奶做饭很好吃。"
    )""",
            f"""    // 6. Soal 6: Pilihan Kalimat
    Exercise(
        id = "u17_s1_p1_q6",
        type = ExerciseType.SENTENCE_CHOICE,
        title = "Pilih terjemahan yang benar",
        targetHanzi = "我 常常 去 看 爷爷 和 奶奶。",
        targetPinyin = "Wǒ chángcháng qù kàn yéye hé nǎinai.",
        targetTranslation = "Saya sering pergi menjenguk kakek dan nenek.",
        correctAnswer = "Wǒ chángcháng qù kàn yéye hé nǎinai.\\n我 常常 去 看 爷爷 和 奶奶。",
        options = listOf(
            "Wǒ chángcháng qù kàn yéye hé nǎinai.\\n我 常常 去 看 爷爷 和 奶奶。",
            "Wǒ bú qù kàn yéye hé nǎinai.\\n我 不 去 看 爷爷 和 奶奶。",
            "Tā chángcháng qù kàn yéye hé nǎinai.\\n他 常常 去 看 爷爷 和 奶奶。"
        ),
        audioToSpeak = "我常常去看爷爷和奶奶。"
    )""",
            f"""    // 7. Soal 7: Pilihan Gambar (奶奶 -> nenek)
    Exercise(
        id = "u17_s1_p1_q7",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "奶奶",
        targetPinyin = "nǎinai",
        targetTranslation = "nenek",
        correctAnswer = "nenek",
        audioToSpeak = "奶奶",
        pictureOptions = listOf(
            PictureOption("u17_s1_p1_opt7_1", "nenek", "", R.drawable.ic_fam_mother, true),
            PictureOption("u17_s1_p1_opt7_2", "kakek", "", R.drawable.ic_fam_father, false),
            PictureOption("u17_s1_p1_opt7_3", "anak", "", R.drawable.ic_fam_child, false),
            PictureOption("u17_s1_p1_opt7_4", "rumah", "", R.drawable.ic_fam_home, false)
        )
    )""",
            f"""    // 8. Soal 8: Ketik Pinyin (nenek -> nǎinai)
    Exercise(
        id = "u17_s1_p1_q8",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "nenek",
        sentenceWithBlank = "奶奶 (________)",
        targetHanzi = "奶奶",
        targetPinyin = "nǎinai",
        correctAnswer = "nainai",
        keyboardKeys = {k1_p1_q8},
        audioToSpeak = "奶奶"
    )""",
            f"""    // 9. Soal 9: Susun Kalimat (Kakek dan nenek ada di rumah.)
    Exercise(
        id = "u17_s1_p1_q9",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Kakek dan nenek ada di rumah.",
        targetHanzi = "爷爷 和 奶奶 都 在 家。",
        targetPinyin = "Yéye hé nǎinai dōu zài jiā.",
        wordChips = listOf("爷爷:yéye", "和:hé", "奶奶:nǎinai", "都:dōu", "在:zài", "家。:jiā.", "学校:xuéxiào"),
        correctAnswer = "爷爷,和,奶奶,都,在,家。",
        audioToSpeak = "爷爷和奶奶都在家。"
    )""",
            f"""    // 10. Soal 10: Ketuk Pasangan yang Sesuai (Rangkuman Kakek & Nenek)
    Exercise(
        id = "u17_s1_p1_m10",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u17_s1_p1_m10_1", "爷爷", "yéye", "kakek"),
            MatchPairItem("u17_s1_p1_m10_2", "奶奶", "nǎinai", "nenek"),
            MatchPairItem("u17_s1_p1_m10_3", "在家", "zài jiā", "di rumah"),
            MatchPairItem("u17_s1_p1_m10_4", "好吃", "hǎochī", "enak")
        )
    )"""
        ],
        "p2": [
            f"""    // 1. Soal 1: Pilihan Gambar (丈夫 -> suami)
    Exercise(
        id = "u17_s1_p2_q1",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "丈夫",
        targetPinyin = "zhàngfu",
        targetTranslation = "suami",
        correctAnswer = "suami",
        audioToSpeak = "丈夫",
        pictureOptions = listOf(
            PictureOption("u17_s1_p2_opt1", "suami", "", R.drawable.ic_work_gentleman, true),
            PictureOption("u17_s1_p2_opt2", "istri", "", R.drawable.ic_work_lady, false),
            PictureOption("u17_s1_p2_opt3", "anak", "", R.drawable.ic_fam_child, false),
            PictureOption("u17_s1_p2_opt4", "rumah", "", R.drawable.ic_fam_home, false)
        )
    )""",
            f"""    // 2. Soal 2: Susun Kalimat (Suaminya adalah seorang dokter.)
    Exercise(
        id = "u17_s1_p2_q2",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Suaminya adalah dokter.",
        targetHanzi = "她 的 丈夫 是 医生。",
        targetPinyin = "Tā de zhàngfu shì yīshēng.",
        wordChips = listOf("她:tā", "的:de", "丈夫:zhàngfu", "是:shì", "医生。:yīshēng.", "妻子:qīzi"),
        correctAnswer = "她,的,丈夫,是,医生。",
        audioToSpeak = "她的丈夫是医生。"
    )""",
            f"""    // 3. Soal 3: Ketuk Pasangan yang Sesuai (Suami & Istri)
    Exercise(
        id = "u17_s1_p2_m3",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u17_s1_p2_m1", "丈夫", "zhàngfu", "suami"),
            MatchPairItem("u17_s1_p2_m2", "妻子", "qīzi", "istri"),
            MatchPairItem("u17_s1_p2_m3", "医生", "yīshēng", "dokter"),
            MatchPairItem("u17_s1_p2_m4", "旅游", "lǚyóu", "berwisata")
        )
    )""",
            f"""    // 4. Soal 4: Ketik Pinyin (suami -> zhàngfu)
    Exercise(
        id = "u17_s1_p2_q4",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "suami",
        sentenceWithBlank = "丈夫 (________)",
        targetHanzi = "丈夫",
        targetPinyin = "zhàngfu",
        correctAnswer = "zhangfu",
        keyboardKeys = {k1_p2_q4},
        audioToSpeak = "丈夫"
    )""",
            f"""    // 5. Soal 5: Mendengar Kalimat (Rule 10: illustrationRes = 0)
    Exercise(
        id = "u17_s1_p2_q5",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Apa yang Anda dengar?",
        targetTranslation = "Saya dan istri suka berwisata.",
        targetHanzi = "我 和 妻子 都 喜欢 旅游。",
        targetPinyin = "Wǒ hé qīzi dōu xǐhuan lǚyóu.",
        wordChips = listOf("我:wǒ", "和:hé", "妻子:qīzi", "都:dōu", "喜欢:xǐhuan", "旅游。:lǚyóu.", "丈夫:zhàngfu"),
        correctAnswer = "我,和,妻子,都,喜欢,旅游。",
        illustrationRes = 0,
        audioToSpeak = "我和妻子都喜欢旅游。"
    )""",
            f"""    // 6. Soal 6: Pilihan Kalimat
    Exercise(
        id = "u17_s1_p2_q6",
        type = ExerciseType.SENTENCE_CHOICE,
        title = "Pilih terjemahan yang benar",
        targetHanzi = "他 的 妻子 是 一 名 老师。",
        targetPinyin = "Tā de qīzi shì yì míng lǎoshī.",
        targetTranslation = "Istrinya adalah seorang guru.",
        correctAnswer = "Tā de qīzi shì yì míng lǎoshī.\\n他 的 妻子 是 一 名 老师。",
        options = listOf(
            "Tā de qīzi shì yì míng lǎoshī.\\n他 的 妻子 是 一 名 老师。",
            "Tā de zhàngfu shì yì míng lǎoshī.\\n他 的 丈夫 是 一 名 老师。",
            "Wǒ de qīzi shì yì míng yīshēng.\\n我 的 妻子 是 一 名 医生。"
        ),
        audioToSpeak = "他的妻子是一名老师。"
    )""",
            f"""    // 7. Soal 7: Pilihan Gambar (妻子 -> istri)
    Exercise(
        id = "u17_s1_p2_q7",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "妻子",
        targetPinyin = "qīzi",
        targetTranslation = "istri",
        correctAnswer = "istri",
        audioToSpeak = "妻子",
        pictureOptions = listOf(
            PictureOption("u17_s1_p2_opt7_1", "istri", "", R.drawable.ic_work_lady, true),
            PictureOption("u17_s1_p2_opt7_2", "suami", "", R.drawable.ic_work_gentleman, false),
            PictureOption("u17_s1_p2_opt7_3", "anak", "", R.drawable.ic_fam_child, false),
            PictureOption("u17_s1_p2_opt7_4", "rumah", "", R.drawable.ic_fam_home, false)
        )
    )""",
            f"""    // 8. Soal 8: Ketik Pinyin (istri -> qīzi)
    Exercise(
        id = "u17_s1_p2_q8",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "istri",
        sentenceWithBlank = "妻子 (________)",
        targetHanzi = "妻子",
        targetPinyin = "qīzi",
        correctAnswer = "qizi",
        keyboardKeys = {k1_p2_q8},
        audioToSpeak = "妻子"
    )""",
            f"""    // 9. Soal 9: Susun Kalimat (Suami dan istri saling mencintai.)
    Exercise(
        id = "u17_s1_p2_q9",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Suami dan istri saling mencintai.",
        targetHanzi = "丈夫 和 妻子 很 相爱。",
        targetPinyin = "Zhàngfu hé qīzi hěn xiāng'ài.",
        wordChips = listOf("丈夫:zhàngfu", "和:hé", "妻子:qīzi", "很:hěn", "相爱。:xiāng'ài.", "都:dōu"),
        correctAnswer = "丈夫,和,妻子,很,相爱。",
        audioToSpeak = "丈夫和妻子很相爱。"
    )""",
            f"""    // 10. Soal 10: Ketuk Pasangan yang Sesuai (Rangkuman Suami Istri)
    Exercise(
        id = "u17_s1_p2_m10",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u17_s1_p2_m10_1", "丈夫", "zhàngfu", "suami"),
            MatchPairItem("u17_s1_p2_m10_2", "妻子", "qīzi", "istri"),
            MatchPairItem("u17_s1_p2_m10_3", "老师", "lǎoshī", "guru"),
            MatchPairItem("u17_s1_p2_m10_4", "喜欢", "xǐhuan", "suka")
        )
    )"""
        ]
    }

    # =========================================================================
    # STAGE 2: Anak-Anak & Generasi Muda (男孩儿, 女孩儿, 小孩儿)
    # =========================================================================
    k2_p1_q4 = make_keys("nanhair")
    k2_p1_q8 = make_keys("nvhair")
    k2_p2_q4 = make_keys("xiaohair")
    k2_p2_q8 = make_keys("haizi")
    
    stages[2] = {
        "p1": [
            f"""    // 1. Soal 1: Pilihan Gambar (男孩儿 -> anak laki-laki)
    Exercise(
        id = "u17_s2_p1_q1",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "男孩儿",
        targetPinyin = "nánháiér",
        targetTranslation = "anak laki-laki",
        correctAnswer = "anak laki-laki",
        audioToSpeak = "男孩儿",
        pictureOptions = listOf(
            PictureOption("u17_s2_p1_opt1", "anak laki-laki", "", R.drawable.ic_fam_son, true),
            PictureOption("u17_s2_p1_opt2", "anak perempuan", "", R.drawable.ic_fam_daughter, false),
            PictureOption("u17_s2_p1_opt3", "ayah", "", R.drawable.ic_fam_father, false),
            PictureOption("u17_s2_p1_opt4", "ibu", "", R.drawable.ic_fam_mother, false)
        )
    )""",
            f"""    // 2. Soal 2: Susun Kalimat (Anak laki-laki itu adalah siapa?)
    Exercise(
        id = "u17_s2_p1_q2",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Anak laki-laki itu siapa?",
        targetHanzi = "那个 男孩儿 是 谁？",
        targetPinyin = "Nàge nánháiér shì shéi?",
        wordChips = listOf("那个:nàge", "男孩儿:nánháiér", "是:shì", "谁？:shéi?", "女孩儿:nǚháiér"),
        correctAnswer = "那个,男孩儿,是,谁？",
        audioToSpeak = "那个男孩儿是谁？"
    )""",
            f"""    // 3. Soal 3: Ketuk Pasangan yang Sesuai (Laki-laki & Perempuan)
    Exercise(
        id = "u17_s2_p1_q3",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u17_s2_p1_m1", "男孩儿", "nánháiér", "anak laki-laki"),
            MatchPairItem("u17_s2_p1_m2", "女孩儿", "nǚháiér", "anak perempuan"),
            MatchPairItem("u17_s2_p1_m3", "那个", "nàge", "yang itu"),
            MatchPairItem("u17_s2_p1_m4", "漂亮", "piàoliang", "cantik")
        )
    )""",
            f"""    // 4. Soal 4: Ketik Pinyin (anak laki-laki -> nánháiér)
    Exercise(
        id = "u17_s2_p1_q4",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "anak laki-laki",
        sentenceWithBlank = "男孩儿 (________)",
        targetHanzi = "男孩儿",
        targetPinyin = "nánháiér",
        correctAnswer = "nanhair",
        keyboardKeys = {k2_p1_q4},
        audioToSpeak = "男孩儿"
    )""",
            f"""    // 5. Soal 5: Mendengar Kalimat (Rule 10: illustrationRes = 0)
    Exercise(
        id = "u17_s2_p1_q5",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Apa yang Anda dengar?",
        targetTranslation = "Anak perempuan itu sangat cantik.",
        targetHanzi = "那个 女孩儿 很 漂亮。",
        targetPinyin = "Nàge nǚháiér hěn piàoliang.",
        wordChips = listOf("那个:nàge", "女孩儿:nǚháiér", "很:hěn", "漂亮。:piàoliang.", "男孩儿:nánháiér"),
        correctAnswer = "那个,女孩儿,很,漂亮。",
        illustrationRes = 0,
        audioToSpeak = "那个女孩儿很漂亮。"
    )""",
            f"""    // 6. Soal 6: Pilihan Kalimat
    Exercise(
        id = "u17_s2_p1_q6",
        type = ExerciseType.SENTENCE_CHOICE,
        title = "Pilih terjemahan yang benar",
        targetHanzi = "前面 有 一 个 小 女孩儿。",
        targetPinyin = "Qiánmiàn yǒu yí gè xiǎo nǚháiér.",
        targetTranslation = "Di depan ada seorang anak perempuan kecil.",
        correctAnswer = "Qiánmiàn yǒu yí gè xiǎo nǚháiér.\\n前面 有 一 个 小 女孩儿。",
        options = listOf(
            "Qiánmiàn yǒu yí gè xiǎo nǚháiér.\\n前面 有 一 个 小 女孩儿。",
            "Hòumiàn yǒu yí gè xiǎo nǚháiér.\\n后面 有 一 个 小 女孩儿。",
            "Qiánmiàn yǒu yí gè xiǎo nánháiér.\\n前面 有 一 个 小 男孩儿。"
        ),
        audioToSpeak = "前面有一个小女孩儿。"
    )""",
            f"""    // 7. Soal 7: Pilihan Gambar (女孩儿 -> anak perempuan)
    Exercise(
        id = "u17_s2_p1_q7",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "女孩儿",
        targetPinyin = "nǚháiér",
        targetTranslation = "anak perempuan",
        correctAnswer = "anak perempuan",
        audioToSpeak = "女孩儿",
        pictureOptions = listOf(
            PictureOption("u17_s2_p1_opt7_1", "anak perempuan", "", R.drawable.ic_fam_daughter, true),
            PictureOption("u17_s2_p1_opt7_2", "anak laki-laki", "", R.drawable.ic_fam_son, false),
            PictureOption("u17_s2_p1_opt7_3", "ayah", "", R.drawable.ic_fam_father, false),
            PictureOption("u17_s2_p1_opt7_4", "ibu", "", R.drawable.ic_fam_mother, false)
        )
    )""",
            f"""    // 8. Soal 8: Ketik Pinyin (anak perempuan -> nǚháiér)
    Exercise(
        id = "u17_s2_p1_q8",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "anak perempuan",
        sentenceWithBlank = "女孩儿 (________)",
        targetHanzi = "女孩儿",
        targetPinyin = "nǚháiér",
        correctAnswer = "nvhair",
        keyboardKeys = {k2_p1_q8},
        audioToSpeak = "女孩儿"
    )""",
            f"""    // 9. Soal 9: Susun Kalimat (Dua anak laki-laki sedang bermain sepak bola.)
    Exercise(
        id = "u17_s2_p1_q9",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Dua anak laki-laki bermain bola.",
        targetHanzi = "两个 男孩儿 在 踢 足球。",
        targetPinyin = "Liǎng gè nánháiér zài tī zúqiú.",
        wordChips = listOf("两个:liǎng gè", "男孩儿:nánháiér", "在:zài", "踢:tī", "足球。:zúqiú.", "女孩儿:nǚháiér"),
        correctAnswer = "两个,男孩儿,在,踢,足球。",
        audioToSpeak = "两个男孩儿在踢足球。"
    )""",
            f"""    // 10. Soal 10: Ketuk Pasangan yang Sesuai (Rangkuman Anak Laki & Perempuan)
    Exercise(
        id = "u17_s2_p1_m10",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u17_s2_p1_m10_1", "男孩儿", "nánháiér", "anak laki-laki"),
            MatchPairItem("u17_s2_p1_m10_2", "女孩儿", "nǚháiér", "anak perempuan"),
            MatchPairItem("u17_s2_p1_m10_3", "足球", "zúqiú", "sepak bola"),
            MatchPairItem("u17_s2_p1_m10_4", "前面", "qiánmiàn", "di depan")
        )
    )"""
        ],
        "p2": [
            f"""    // 1. Soal 1: Pilihan Gambar (小孩儿 -> anak kecil / bocah)
    Exercise(
        id = "u17_s2_p2_q1",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "小孩儿",
        targetPinyin = "xiǎoháiér",
        targetTranslation = "anak kecil / bocah",
        correctAnswer = "anak kecil / bocah",
        audioToSpeak = "小孩儿",
        pictureOptions = listOf(
            PictureOption("u17_s2_p2_opt1", "anak kecil", "", R.drawable.ic_fam_child, true),
            PictureOption("u17_s2_p2_opt2", "ayah", "", R.drawable.ic_fam_father, false),
            PictureOption("u17_s2_p2_opt3", "pria dewasa", "", R.drawable.ic_work_gentleman, false),
            PictureOption("u17_s2_p2_opt4", "rumah", "", R.drawable.ic_fam_home, false)
        )
    )""",
            f"""    // 2. Soal 2: Susun Kalimat (Bocah itu sedang bermain di kamar.)
    Exercise(
        id = "u17_s2_p2_q2",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Bocah itu bermain di kamar.",
        targetHanzi = "小孩儿 在 房间 里 玩。",
        targetPinyin = "Xiǎoháiér zài fángjiān lǐ wán.",
        wordChips = listOf("小孩儿:xiǎoháiér", "在:zài", "房间:fángjiān", "里:lǐ", "玩。:wán.", "看书:kànshū"),
        correctAnswer = "小孩儿,在,房间,里,玩。",
        audioToSpeak = "小孩儿在房间里玩。"
    )""",
            f"""    // 3. Soal 3: Ketuk Pasangan yang Sesuai (Bocah & Ruangan)
    Exercise(
        id = "u17_s2_p2_m3",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u17_s2_p2_m1", "小孩儿", "xiǎoháiér", "bocah / anak kecil"),
            MatchPairItem("u17_s2_p2_m2", "房间", "fángjiān", "kamar / ruangan"),
            MatchPairItem("u17_s2_p2_m3", "玩", "wán", "bermain"),
            MatchPairItem("u17_s2_p2_m4", "很多", "hěn duō", "banyak")
        )
    )""",
            f"""    // 4. Soal 4: Ketik Pinyin (anak kecil -> xiǎoháiér)
    Exercise(
        id = "u17_s2_p2_q4",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "anak kecil / bocah",
        sentenceWithBlank = "小孩儿 (________)",
        targetHanzi = "小孩儿",
        targetPinyin = "xiǎoháiér",
        correctAnswer = "xiaohair",
        keyboardKeys = {k2_p2_q4},
        audioToSpeak = "小孩儿"
    )""",
            f"""    // 5. Soal 5: Mendengar Kalimat (Rule 10: illustrationRes = 0)
    Exercise(
        id = "u17_s2_p2_q5",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Apa yang Anda dengar?",
        targetTranslation = "Tiga bocah itu sangat senang.",
        targetHanzi = "三个 小孩儿 都 很 高兴。",
        targetPinyin = "Sān gè xiǎoháiér dōu hěn gāoxìng.",
        wordChips = listOf("三个:sān gè", "小孩儿:xiǎoháiér", "都:dōu", "很:hěn", "高兴。:gāoxìng.", "一个:yí gè"),
        correctAnswer = "三个,小孩儿,都,很,高兴。",
        illustrationRes = 0,
        audioToSpeak = "三个小孩儿都很高兴。"
    )""",
            f"""    // 6. Soal 6: Pilihan Kalimat
    Exercise(
        id = "u17_s2_p2_q6",
        type = ExerciseType.SENTENCE_CHOICE,
        title = "Pilih terjemahan yang benar",
        targetHanzi = "公园 里 有 很多 小孩儿。",
        targetPinyin = "Gōngyuán lǐ yǒu hěn duō xiǎoháiér.",
        targetTranslation = "Di dalam taman ada banyak anak kecil.",
        correctAnswer = "Gōngyuán lǐ yǒu hěn duō xiǎoháiér.\\n公园 里 有 很多 小孩儿。",
        options = listOf(
            "Gōngyuán lǐ yǒu hěn duō xiǎoháiér.\\n公园 里 有 很多 小孩儿。",
            "Gōngyuán lǐ méiyǒu xiǎoháiér.\\n公园 里 没有 小孩儿。",
            "Xuéxiào lǐ yǒu hěn duō xiǎoháiér.\\n学校 里 有 很多 小孩儿。"
        ),
        audioToSpeak = "公园里有很多小孩儿。"
    )""",
            f"""    // 7. Soal 7: Pilihan Gambar (小孩儿 -> anak kecil)
    Exercise(
        id = "u17_s2_p2_q7",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "小孩儿",
        targetPinyin = "xiǎoháiér",
        targetTranslation = "anak kecil",
        correctAnswer = "anak kecil",
        audioToSpeak = "小孩儿",
        pictureOptions = listOf(
            PictureOption("u17_s2_p2_opt7_1", "anak kecil", "", R.drawable.ic_fam_child, true),
            PictureOption("u17_s2_p2_opt7_2", "wanita", "", R.drawable.ic_work_lady, false),
            PictureOption("u17_s2_p2_opt7_3", "pria", "", R.drawable.ic_work_gentleman, false),
            PictureOption("u17_s2_p2_opt7_4", "rumah", "", R.drawable.ic_fam_home, false)
        )
    )""",
            f"""    // 8. Soal 8: Ketik Pinyin (anak kecil -> xiǎoháiér)
    Exercise(
        id = "u17_s2_p2_q8",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "anak kecil",
        sentenceWithBlank = "小孩儿 (________)",
        targetHanzi = "小孩儿",
        targetPinyin = "xiǎoháiér",
        correctAnswer = "xiaohair",
        keyboardKeys = {k2_p2_q4},
        audioToSpeak = "小孩儿"
    )""",
            f"""    // 9. Soal 9: Susun Kalimat (Anak kecil suka makan buah apel.)
    Exercise(
        id = "u17_s2_p2_q9",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Anak kecil suka makan apel.",
        targetHanzi = "小孩儿 喜欢 吃 苹果。",
        targetPinyin = "Xiǎoháiér xǐhuan chī píngguǒ.",
        wordChips = listOf("小孩儿:xiǎoháiér", "喜欢:xǐhuan", "吃:chī", "苹果。:píngguǒ.", "西瓜:xīguā"),
        correctAnswer = "小孩儿,喜欢,吃,苹果。",
        audioToSpeak = "小孩儿喜欢吃苹果。"
    )""",
            f"""    // 10. Soal 10: Ketuk Pasangan yang Sesuai (Rangkuman Generasi Anak)
    Exercise(
        id = "u17_s2_p2_m10",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u17_s2_p2_m10_1", "小孩儿", "xiǎoháiér", "anak kecil"),
            MatchPairItem("u17_s2_p2_m10_2", "吃苹果", "chī píngguǒ", "makan apel"),
            MatchPairItem("u17_s2_p2_m10_3", "在玩", "zài wán", "sedang main"),
            MatchPairItem("u17_s2_p2_m10_4", "公园", "gōngyuán", "taman")
        )
    )"""
        ]
    }

    # =========================================================================
    # STAGE 3: Masa Kecil & Tumbuh Kembang (小时候, 从小, 生日)
    # =========================================================================
    k3_p1_q4 = make_keys("xiaoshihou")
    k3_p1_q8 = make_keys("congxiao")
    k3_p2_q4 = make_keys("shengri")
    k3_p2_q8 = make_keys("kuaile")
    
    stages[3] = {
        "p1": [
            f"""    // 1. Soal 1: Pilihan Gambar (小时候 -> waktu kecil)
    Exercise(
        id = "u17_s3_p1_q1",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "小时候",
        targetPinyin = "xiǎoshíhou",
        targetTranslation = "waktu kecil",
        correctAnswer = "waktu kecil",
        audioToSpeak = "小时候",
        pictureOptions = listOf(
            PictureOption("u17_s3_p1_opt1", "waktu kecil", "", R.drawable.ic_fam_child, true),
            PictureOption("u17_s3_p1_opt2", "dewasa", "", R.drawable.ic_work_gentleman, false),
            PictureOption("u17_s3_p1_opt3", "kakek", "", R.drawable.ic_fam_father, false),
            PictureOption("u17_s3_p1_opt4", "rumah", "", R.drawable.ic_fam_home, false)
        )
    )""",
            f"""    // 2. Soal 2: Susun Kalimat (Saya waktu kecil suka menyanyi.)
    Exercise(
        id = "u17_s3_p1_q2",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Saya waktu kecil suka menyanyi.",
        targetHanzi = "我 小时候 喜欢 唱歌。",
        targetPinyin = "Wǒ xiǎoshíhou xǐhuan chànggē.",
        wordChips = listOf("我:wǒ", "小时候:xiǎoshíhou", "喜欢:xǐhuan", "唱歌。:chànggē.", "跳舞:tiàowǔ"),
        correctAnswer = "我,小时候,喜欢,唱歌。",
        audioToSpeak = "我小时候喜欢唱歌。"
    )""",
            f"""    // 3. Soal 3: Ketuk Pasangan yang Sesuai (Waktu Kecil & Sejak Kecil)
    Exercise(
        id = "u17_s3_p1_q3",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u17_s3_p1_m1", "小时候", "xiǎoshíhou", "waktu kecil"),
            MatchPairItem("u17_s3_p1_m2", "从小", "cóngxiǎo", "sejak kecil"),
            MatchPairItem("u17_s3_p1_m3", "唱歌", "chànggē", "menyanyi"),
            MatchPairItem("u17_s3_p1_m4", "汉语", "Hànyǔ", "bahasa Mandarin")
        )
    )""",
            f"""    // 4. Soal 4: Ketik Pinyin (waktu kecil -> xiǎoshíhou)
    Exercise(
        id = "u17_s3_p1_q4",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "waktu kecil",
        sentenceWithBlank = "小时候 (________)",
        targetHanzi = "小时候",
        targetPinyin = "xiǎoshíhou",
        correctAnswer = "xiaoshihou",
        keyboardKeys = {k3_p1_q4},
        audioToSpeak = "小时候"
    )""",
            f"""    // 5. Soal 5: Mendengar Kalimat (Rule 10: illustrationRes = 0)
    Exercise(
        id = "u17_s3_p1_q5",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Apa yang Anda dengar?",
        targetTranslation = "Dia sejak kecil belajar bahasa Mandarin.",
        targetHanzi = "他 从小 学习 汉语。",
        targetPinyin = "Tā cóngxiǎo xuéxí Hànyǔ.",
        wordChips = listOf("他:tā", "从小:cóngxiǎo", "学习:xuéxí", "汉语。:Hànyǔ.", "英语:Yīngyǔ"),
        correctAnswer = "他,从小,学习,汉语。",
        illustrationRes = 0,
        audioToSpeak = "他从小学习汉语。"
    )""",
            f"""    // 6. Soal 6: Pilihan Kalimat
    Exercise(
        id = "u17_s3_p1_q6",
        type = ExerciseType.SENTENCE_CHOICE,
        title = "Pilih terjemahan yang benar",
        targetHanzi = "我 从小 就 认识 他。",
        targetPinyin = "Wǒ cóngxiǎo jiù rènshi tā.",
        targetTranslation = "Saya sejak kecil sudah mengenalnya.",
        correctAnswer = "Wǒ cóngxiǎo jiù rènshi tā.\\n我 从小 就 认识 他。",
        options = listOf(
            "Wǒ cóngxiǎo jiù rènshi tā.\\n我 从小 就 认识 他。",
            "Wǒ xiànzài cái rènshi tā.\\n我 现在 才 认识 他。",
            "Tā cóngxiǎo jiù rènshi wǒ.\\n他 从小 就 认识 我。"
        ),
        audioToSpeak = "我从小就认识他。"
    )""",
            f"""    // 7. Soal 7: Pilihan Gambar (从小 -> sejak kecil)
    Exercise(
        id = "u17_s3_p1_q7",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "从小",
        targetPinyin = "cóngxiǎo",
        targetTranslation = "sejak kecil",
        correctAnswer = "sejak kecil",
        audioToSpeak = "从小",
        pictureOptions = listOf(
            PictureOption("u17_s3_p1_opt7_1", "sejak kecil", "", R.drawable.ic_fam_child, true),
            PictureOption("u17_s3_p1_opt7_2", "orang tua", "", R.drawable.ic_fam_father, false),
            PictureOption("u17_s3_p1_opt7_3", "guru", "", R.drawable.ic_person_guru, false),
            PictureOption("u17_s3_p1_opt7_4", "rumah", "", R.drawable.ic_fam_home, false)
        )
    )""",
            f"""    // 8. Soal 8: Ketik Pinyin (sejak kecil -> cóngxiǎo)
    Exercise(
        id = "u17_s3_p1_q8",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "sejak kecil",
        sentenceWithBlank = "从小 (________)",
        targetHanzi = "从小",
        targetPinyin = "cóngxiǎo",
        correctAnswer = "congxiao",
        keyboardKeys = {k3_p1_q8},
        audioToSpeak = "从小"
    )""",
            f"""    // 9. Soal 9: Susun Kalimat (Waktu kecil saya tinggal di Beijing.)
    Exercise(
        id = "u17_s3_p1_q9",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Waktu kecil saya tinggal di Beijing.",
        targetHanzi = "我 小时候 住 在 北京。",
        targetPinyin = "Wǒ xiǎoshíhou zhù zài Běijīng.",
        wordChips = listOf("我:wǒ", "小时候:xiǎoshíhou", "住:zhù", "在:zài", "北京。:Běijīng.", "上海:Shànghǎi"),
        correctAnswer = "我,小时候,住,在,北京。",
        audioToSpeak = "我小时候住在北京。"
    )""",
            f"""    // 10. Soal 10: Ketuk Pasangan yang Sesuai (Rangkuman Tumbuh Kembang)
    Exercise(
        id = "u17_s3_p1_m10",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u17_s3_p1_m10_1", "小时候", "xiǎoshíhou", "waktu kecil"),
            MatchPairItem("u17_s3_p1_m10_2", "从小", "cóngxiǎo", "sejak kecil"),
            MatchPairItem("u17_s3_p1_m10_3", "住在", "zhù zài", "tinggal di"),
            MatchPairItem("u17_s3_p1_m10_4", "认识", "rènshi", "mengenal")
        )
    )"""
        ],
        "p2": [
            f"""    // 1. Soal 1: Pilihan Gambar (生日 -> hari ulang tahun)
    Exercise(
        id = "u17_s3_p2_q1",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "生日",
        targetPinyin = "shēngrì",
        targetTranslation = "hari ulang tahun",
        correctAnswer = "hari ulang tahun",
        audioToSpeak = "生日",
        pictureOptions = listOf(
            PictureOption("u17_s3_p2_opt1", "ulang tahun", "", R.drawable.ic_birthday_cake, true),
            PictureOption("u17_s3_p2_opt2", "rumah", "", R.drawable.ic_fam_home, false),
            PictureOption("u17_s3_p2_opt3", "kursi", "", R.drawable.ic_fam_chair, false),
            PictureOption("u17_s3_p2_opt4", "meja", "", R.drawable.ic_fam_table, false)
        )
    )""",
            f"""    // 2. Soal 2: Susun Kalimat (Selamat ulang tahun kepadamu!)
    Exercise(
        id = "u17_s3_p2_q2",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Selamat ulang tahun kepadamu!",
        targetHanzi = "祝 你 生日 快乐！",
        targetPinyin = "Zhù nǐ shēngrì kuàilè!",
        wordChips = listOf("祝:zhù", "你:nǐ", "生日:shēngrì", "快乐！:kuàilè!", "高兴:gāoxìng"),
        correctAnswer = "祝,你,生日,快乐！",
        audioToSpeak = "祝你生日快乐！"
    )""",
            f"""    // 3. Soal 3: Ketuk Pasangan yang Sesuai (Ulang Tahun & Selamat)
    Exercise(
        id = "u17_s3_p2_m3",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u17_s3_p2_m1", "生日", "shēngrì", "ulang tahun"),
            MatchPairItem("u17_s3_p2_m2", "快乐", "kuàilè", "bahagia / gembira"),
            MatchPairItem("u17_s3_p2_m3", "今天", "jīntiān", "hari ini"),
            MatchPairItem("u17_s3_p2_m4", "蛋糕", "dàngāo", "kue")
        )
    )""",
            f"""    // 4. Soal 4: Ketik Pinyin (ulang tahun -> shēngrì)
    Exercise(
        id = "u17_s3_p2_q4",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "hari ulang tahun",
        sentenceWithBlank = "生日 (________)",
        targetHanzi = "生日",
        targetPinyin = "shēngrì",
        correctAnswer = "shengri",
        keyboardKeys = {k3_p2_q4},
        audioToSpeak = "生日"
    )""",
            f"""    // 5. Soal 5: Mendengar Kalimat (Rule 10: illustrationRes = 0)
    Exercise(
        id = "u17_s3_p2_q5",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Apa yang Anda dengar?",
        targetTranslation = "Hari ini adalah hari ulang tahun saya.",
        targetHanzi = "今天 是 我 的 生日。",
        targetPinyin = "Jīntiān shì wǒ de shēngrì.",
        wordChips = listOf("今天:jīntiān", "是:shì", "我:wǒ", "的:de", "生日。:shēngrì.", "明天:míngtiān"),
        correctAnswer = "今天,是,我,的,生日。",
        illustrationRes = 0,
        audioToSpeak = "今天是我的生日。"
    )""",
            f"""    // 6. Soal 6: Pilihan Kalimat
    Exercise(
        id = "u17_s3_p2_q6",
        type = ExerciseType.SENTENCE_CHOICE,
        title = "Pilih terjemahan yang benar",
        targetHanzi = "你 的 生日 是 几 月 几 号？",
        targetPinyin = "Nǐ de shēngrì shì jǐ yuè jǐ hào?",
        targetTranslation = "Ulang tahunmu tanggal berapa bulan berapa?",
        correctAnswer = "Nǐ de shēngrì shì jǐ yuè jǐ hào?\\n你 的 生日 是 几 月 几 号？",
        options = listOf(
            "Nǐ de shēngrì shì jǐ yuè jǐ hào?\\n你 的 生日 是 几 月 几 号？",
            "Tā de shēngrì shì jǐ yuè jǐ hào?\\n他 的 生日 是 几 月 几 号？",
            "Jīntiān shì jǐ yuè jǐ hào?\\n今天 是 几 月 几 号？"
        ),
        audioToSpeak = "你的生日是几月几号？"
    )""",
            f"""    // 7. Soal 7: Pilihan Gambar (生日 -> ulang tahun)
    Exercise(
        id = "u17_s3_p2_q7",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "生日",
        targetPinyin = "shēngrì",
        targetTranslation = "ulang tahun",
        correctAnswer = "ulang tahun",
        audioToSpeak = "生日",
        pictureOptions = listOf(
            PictureOption("u17_s3_p2_opt7_1", "ulang tahun", "", R.drawable.ic_birthday_cake, true),
            PictureOption("u17_s3_p2_opt7_2", "buku", "", R.drawable.ic_comm_know, false),
            PictureOption("u17_s3_p2_opt7_3", "orang", "", R.drawable.ic_person_saya, false),
            PictureOption("u17_s3_p2_opt7_4", "rumah", "", R.drawable.ic_fam_home, false)
        )
    )""",
            f"""    // 8. Soal 8: Ketik Pinyin (ulang tahun -> shēngrì)
    Exercise(
        id = "u17_s3_p2_q8",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "hari ulang tahun",
        sentenceWithBlank = "生日 (________)",
        targetHanzi = "生日",
        targetPinyin = "shēngrì",
        correctAnswer = "shengri",
        keyboardKeys = {k3_p2_q4},
        audioToSpeak = "生日"
    )""",
            f"""    // 9. Soal 9: Susun Kalimat (Ibu membuatkan kue ulang tahun untuk saya.)
    Exercise(
        id = "u17_s3_p2_q9",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Ibu membuatkan kue ulang tahun.",
        targetHanzi = "妈妈 给 我 做 生日 蛋糕。",
        targetPinyin = "Māma gěi wǒ zuò shēngrì dàngāo.",
        wordChips = listOf("妈妈:māma", "给:gěi", "我:wǒ", "做:zuò", "生日:shēngrì", "蛋糕。:dàngāo.", "爸爸:bàba"),
        correctAnswer = "妈妈,给,我,做,生日,蛋糕。",
        audioToSpeak = "妈妈给我做生日蛋糕。"
    )""",
            f"""    // 10. Soal 10: Ketuk Pasangan yang Sesuai (Rangkuman Pesta Ulang Tahun)
    Exercise(
        id = "u17_s3_p2_m10",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u17_s3_p2_m10_1", "生日", "shēngrì", "ulang tahun"),
            MatchPairItem("u17_s3_p2_m10_2", "生日蛋糕", "shēngrì dàngāo", "kue ulang tahun"),
            MatchPairItem("u17_s3_p2_m10_3", "祝你", "zhù nǐ", "mendoakanmu"),
            MatchPairItem("u17_s3_p2_m10_4", "快乐", "kuàilè", "gembira")
        )
    )"""
        ]
    }

    # =========================================================================
    # STAGE 4: Identitas Diri & Marga Formal (姓, 姓名, 名, 自己)
    # =========================================================================
    k4_p1_q4 = make_keys("xing")
    k4_p1_q8 = make_keys("xingming")
    k4_p2_q4 = make_keys("ziji")
    k4_p2_q8 = make_keys("ming")
    
    stages[4] = {
        "p1": [
            f"""    // 1. Soal 1: Pilihan Gambar (姓 -> marga)
    Exercise(
        id = "u17_s4_p1_q1",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "姓",
        targetPinyin = "xìng",
        targetTranslation = "marga / bermarga",
        correctAnswer = "marga / bermarga",
        audioToSpeak = "姓",
        pictureOptions = listOf(
            PictureOption("u17_s4_p1_opt1", "marga", "", R.drawable.ic_comm_know, true),
            PictureOption("u17_s4_p1_opt2", "rumah", "", R.drawable.ic_fam_home, false),
            PictureOption("u17_s4_p1_opt3", "kursi", "", R.drawable.ic_fam_chair, false),
            PictureOption("u17_s4_p1_opt4", "meja", "", R.drawable.ic_fam_table, false)
        )
    )""",
            f"""    // 2. Soal 2: Susun Kalimat (Bolehkah saya tanya apa marga terhormat Anda?)
    Exercise(
        id = "u17_s4_p1_q2",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Bolehkah tanya siapa marga Anda?",
        targetHanzi = "请问 您 贵 姓？",
        targetPinyin = "Qǐngwèn nín guì xìng?",
        wordChips = listOf("请问:qǐngwèn", "您:nín", "贵:guì", "姓？:xìng?", "叫:jiào"),
        correctAnswer = "请问,您,贵,姓？",
        audioToSpeak = "请问您贵姓？"
    )""",
            f"""    // 3. Soal 3: Ketuk Pasangan yang Sesuai (Marga & Nama Lengkap)
    Exercise(
        id = "u17_s4_p1_q3",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u17_s4_p1_m1", "姓", "xìng", "bermarga / marga"),
            MatchPairItem("u17_s4_p1_m2", "姓名", "xìngmíng", "nama lengkap"),
            MatchPairItem("u17_s4_p1_m3", "贵姓", "guìxìng", "marga terhormat"),
            MatchPairItem("u17_s4_p1_m4", "名字", "míngzi", "nama")
        )
    )""",
            f"""    // 4. Soal 4: Ketik Pinyin (marga -> xìng)
    Exercise(
        id = "u17_s4_p1_q4",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "marga / bermarga",
        sentenceWithBlank = "姓 (________)",
        targetHanzi = "姓",
        targetPinyin = "xìng",
        correctAnswer = "xing",
        keyboardKeys = {k4_p1_q4},
        audioToSpeak = "姓"
    )""",
            f"""    // 5. Soal 5: Mendengar Kalimat (Rule 10: illustrationRes = 0)
    Exercise(
        id = "u17_s4_p1_q5",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Apa yang Anda dengar?",
        targetTranslation = "Tolong tuliskan nama lengkap Anda di sini.",
        targetHanzi = "请 在 这里 写 姓名。",
        targetPinyin = "Qǐng zài zhèlǐ xiě xìngmíng.",
        wordChips = listOf("请:qǐng", "在:zài", "这里:zhèlǐ", "写:xiě", "姓名。:xìngmíng.", "看:kàn"),
        correctAnswer = "请,在,这里,写,姓名。",
        illustrationRes = 0,
        audioToSpeak = "请在这里写姓名。"
    )""",
            f"""    // 6. Soal 6: Pilihan Kalimat
    Exercise(
        id = "u17_s4_p1_q6",
        type = ExerciseType.SENTENCE_CHOICE,
        title = "Pilih terjemahan yang benar",
        targetHanzi = "我 姓 王， 叫 王 朋。",
        targetPinyin = "Wǒ xìng Wáng, jiào Wáng Péng.",
        targetTranslation = "Marga saya Wang, dipanggil Wang Peng.",
        correctAnswer = "Wǒ xìng Wáng, jiào Wáng Péng.\\n我 姓 王， 叫 王 朋。",
        options = listOf(
            "Wǒ xìng Wáng, jiào Wáng Péng.\\n我 姓 王， 叫 王 朋。",
            "Wǒ xìng Lǐ, jiào Wáng Péng.\\n我 姓 李， 叫 王 朋。",
            "Tā xìng Wáng, jiào Wáng Péng.\\n他 姓 王， 叫 王 朋。"
        ),
        audioToSpeak = "我姓王，叫王朋。"
    )""",
            f"""    // 7. Soal 7: Pilihan Gambar (姓名 -> nama lengkap)
    Exercise(
        id = "u17_s4_p1_q7",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "姓名",
        targetPinyin = "xìngmíng",
        targetTranslation = "nama lengkap",
        correctAnswer = "nama lengkap",
        audioToSpeak = "姓名",
        pictureOptions = listOf(
            PictureOption("u17_s4_p1_opt7_1", "nama lengkap", "", R.drawable.ic_comm_know, true),
            PictureOption("u17_s4_p1_opt7_2", "orang", "", R.drawable.ic_person_saya, false),
            PictureOption("u17_s4_p1_opt7_3", "rumah", "", R.drawable.ic_fam_home, false),
            PictureOption("u17_s4_p1_opt7_4", "kue", "", R.drawable.ic_birthday_cake, false)
        )
    )""",
            f"""    // 8. Soal 8: Ketik Pinyin (nama lengkap -> xìngmíng)
    Exercise(
        id = "u17_s4_p1_q8",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "nama lengkap",
        sentenceWithBlank = "姓名 (________)",
        targetHanzi = "姓名",
        targetPinyin = "xìngmíng",
        correctAnswer = "xingming",
        keyboardKeys = {k4_p1_q8},
        audioToSpeak = "姓名"
    )""",
            f"""    // 9. Soal 9: Susun Kalimat (Siapa nama lengkap guru bahasa Mandarin Anda?)
    Exercise(
        id = "u17_s4_p1_q9",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Siapa nama lengkap guru Anda?",
        targetHanzi = "你 老师 的 姓名 是 谁？",
        targetPinyin = "Nǐ lǎoshī de xìngmíng shì shéi?",
        wordChips = listOf("你:nǐ", "老师:lǎoshī", "的:de", "姓名:xìngmíng", "是:shì", "谁？:shéi?"),
        correctAnswer = "你,老师,的,姓名,是,谁？",
        audioToSpeak = "你老师的姓名是谁？"
    )""",
            f"""    // 10. Soal 10: Ketuk Pasangan yang Sesuai (Rangkuman Marga & Nama)
    Exercise(
        id = "u17_s4_p1_m10",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u17_s4_p1_m10_1", "姓", "xìng", "marga"),
            MatchPairItem("u17_s4_p1_m10_2", "姓名", "xìngmíng", "nama lengkap"),
            MatchPairItem("u17_s4_p1_m10_3", "写下", "xiě xià", "tuliskan"),
            MatchPairItem("u17_s4_p1_m10_4", "请问", "qǐngwèn", "permisi tanya")
        )
    )"""
        ],
        "p2": [
            f"""    // 1. Soal 1: Pilihan Gambar (自己 -> diri sendiri)
    Exercise(
        id = "u17_s4_p2_q1",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "自己",
        targetPinyin = "zìjǐ",
        targetTranslation = "diri sendiri",
        correctAnswer = "diri sendiri",
        audioToSpeak = "自己",
        pictureOptions = listOf(
            PictureOption("u17_s4_p2_opt1", "diri sendiri", "", R.drawable.ic_person_saya, true),
            PictureOption("u17_s4_p2_opt2", "banyak orang", "", R.drawable.ic_people_group, false),
            PictureOption("u17_s4_p2_opt3", "teman", "", R.drawable.ic_two_friends, false),
            PictureOption("u17_s4_p2_opt4", "rumah", "", R.drawable.ic_fam_home, false)
        )
    )""",
            f"""    // 2. Soal 2: Susun Kalimat (Kita harus merawat diri sendiri dengan baik.)
    Exercise(
        id = "u17_s4_p2_q2",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Kita harus merawat diri sendiri.",
        targetHanzi = "我们要 照顾 好 自己。",
        targetPinyin = "Wǒmen yào zhàogù hǎo zìjǐ.",
        wordChips = listOf("我们要:wǒmen yào", "照顾:zhàogù", "好:hǎo", "自己。:zìjǐ.", "他们:tāmen"),
        correctAnswer = "我们要,照顾,好,自己。",
        audioToSpeak = "我们要照顾好自己。"
    )""",
            f"""    // 3. Soal 3: Ketuk Pasangan yang Sesuai (Diri Sendiri & Orang Formal)
    Exercise(
        id = "u17_s4_p2_m3",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u17_s4_p2_m1", "自己", "zìjǐ", "diri sendiri"),
            MatchPairItem("u17_s4_p2_m2", "名", "míng", "orang (formal)"),
            MatchPairItem("u17_s4_p2_m3", "照顾", "zhàogù", "merawat"),
            MatchPairItem("u17_s4_p2_m4", "做饭", "zuòfàn", "memasak")
        )
    )""",
            f"""    // 4. Soal 4: Ketik Pinyin (diri sendiri -> zìjǐ)
    Exercise(
        id = "u17_s4_p2_q4",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "diri sendiri",
        sentenceWithBlank = "自己 (________)",
        targetHanzi = "自己",
        targetPinyin = "zìjǐ",
        correctAnswer = "ziji",
        keyboardKeys = {k4_p2_q4},
        audioToSpeak = "自己"
    )""",
            f"""    // 5. Soal 5: Mendengar Kalimat (Rule 10: illustrationRes = 0)
    Exercise(
        id = "u17_s4_p2_q5",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Apa yang Anda dengar?",
        targetTranslation = "Ada dua orang dokter datang.",
        targetHanzi = "来 了 两 名 医生。",
        targetPinyin = "Lái le liǎng míng yīshēng.",
        wordChips = listOf("来:lái", "了:le", "两:liǎng", "名:míng", "医生。:yīshēng.", "三:sān"),
        correctAnswer = "来,了,两,名,医生。",
        illustrationRes = 0,
        audioToSpeak = "来了两名医生。"
    )""",
            f"""    // 6. Soal 6: Pilihan Kalimat
    Exercise(
        id = "u17_s4_p2_q6",
        type = ExerciseType.SENTENCE_CHOICE,
        title = "Pilih terjemahan yang benar",
        targetHanzi = "这 是 我 自己 做 的 菜。",
        targetPinyin = "Zhè shì wǒ zìjǐ zuò de cài.",
        targetTranslation = "Ini adalah masakan yang saya buat sendiri.",
        correctAnswer = "Zhè shì wǒ zìjǐ zuò de cài.\\n这 是 我 自己 做 的 菜。",
        options = listOf(
            "Zhè shì wǒ zìjǐ zuò de cài.\\n这 是 我 自己 做 的 菜。",
            "Zhè shì tā zìjǐ zuò de cài.\\n这 是 他 自己 做 的 菜。",
            "Zhè bú shì wǒ zuò de cài.\\n这 不 是 我 做 的 菜。"
        ),
        audioToSpeak = "这是我自己做的菜。"
    )""",
            f"""    // 7. Soal 7: Pilihan Gambar (名 -> kata penggolong orang formal)
    Exercise(
        id = "u17_s4_p2_q7",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "名",
        targetPinyin = "míng",
        targetTranslation = "orang (formal)",
        correctAnswer = "orang (formal)",
        audioToSpeak = "名",
        pictureOptions = listOf(
            PictureOption("u17_s4_p2_opt7_1", "orang formal", "", R.drawable.ic_person_single, true),
            PictureOption("u17_s4_p2_opt7_2", "banyak orang", "", R.drawable.ic_people_group, false),
            PictureOption("u17_s4_p2_opt7_3", "rumah", "", R.drawable.ic_fam_home, false),
            PictureOption("u17_s4_p2_opt7_4", "kue", "", R.drawable.ic_birthday_cake, false)
        )
    )""",
            f"""    // 8. Soal 8: Ketik Pinyin (orang formal -> míng)
    Exercise(
        id = "u17_s4_p2_q8",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "orang (formal)",
        sentenceWithBlank = "名 (________)",
        targetHanzi = "名",
        targetPinyin = "míng",
        correctAnswer = "ming",
        keyboardKeys = {k4_p2_q8},
        audioToSpeak = "名"
    )""",
            f"""    // 9. Soal 9: Susun Kalimat (Saya suka membaca buku sendiri di rumah.)
    Exercise(
        id = "u17_s4_p2_q9",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Saya suka baca buku sendiri.",
        targetHanzi = "我 喜欢 自己 在 家 看书。",
        targetPinyin = "Wǒ xǐhuan zìjǐ zài jiā kànshū.",
        wordChips = listOf("我:wǒ", "喜欢:xǐhuan", "自己:zìjǐ", "在:zài", "家:jiā", "看书。:kànshū.", "出去:chūqù"),
        correctAnswer = "我,喜欢,自己,在,家,看书。",
        audioToSpeak = "我喜欢自己在家看书。"
    )""",
            f"""    // 10. Soal 10: Ketuk Pasangan yang Sesuai (Rangkuman Diri Sendiri)
    Exercise(
        id = "u17_s4_p2_m10",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u17_s4_p2_m10_1", "自己", "zìjǐ", "diri sendiri"),
            MatchPairItem("u17_s4_p2_m10_2", "两名", "liǎng míng", "dua orang"),
            MatchPairItem("u17_s4_p2_m10_3", "自己做", "zìjǐ zuò", "buat sendiri"),
            MatchPairItem("u17_s4_p2_m10_4", "在家里", "zài jiālǐ", "di dalam rumah")
        )
    )"""
        ]
    }

    # =========================================================================
    # STAGE 5: Evaluasi Komprehensif Keluarga & Kerabat (Sintesis Seluruh Bab 17)
    # =========================================================================
    k5_p1_q4 = make_keys("yeye")
    k5_p1_q8 = make_keys("zhàngfu".replace("à", "a"))
    k5_p2_q4 = make_keys("ziji")
    k5_p2_q8 = make_keys("shengri")
    
    stages[5] = {
        "p1": [
            f"""    // 1. Soal 1: Pilihan Gambar (爷爷 -> kakek)
    Exercise(
        id = "u17_s5_p1_q1",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "爷爷",
        targetPinyin = "yéye",
        targetTranslation = "kakek",
        correctAnswer = "kakek",
        audioToSpeak = "爷爷",
        pictureOptions = listOf(
            PictureOption("u17_s5_p1_opt1", "kakek", "", R.drawable.ic_fam_father, true),
            PictureOption("u17_s5_p1_opt2", "nenek", "", R.drawable.ic_fam_mother, false),
            PictureOption("u17_s5_p1_opt3", "anak", "", R.drawable.ic_fam_child, false),
            PictureOption("u17_s5_p1_opt4", "rumah", "", R.drawable.ic_fam_home, false)
        )
    )""",
            f"""    // 2. Soal 2: Susun Kalimat (Kakek dan nenek merawat saya sejak kecil.)
    Exercise(
        id = "u17_s5_p1_q2",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Kakek nenek merawat saya sejak kecil.",
        targetHanzi = "爷爷 奶奶 从小 照顾 我。",
        targetPinyin = "Yéye nǎinai cóngxiǎo zhàogù wǒ.",
        wordChips = listOf("爷爷:yéye", "奶奶:nǎinai", "从小:cóngxiǎo", "照顾:zhàogù", "我。:wǒ.", "他们:tāmen"),
        correctAnswer = "爷爷,奶奶,从小,照顾,我。",
        audioToSpeak = "爷爷奶奶从小照顾我。"
    )""",
            f"""    // 3. Soal 3: Ketuk Pasangan yang Sesuai (Sintesis Evaluasi Bagian 1)
    Exercise(
        id = "u17_s5_p1_m3",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u17_s5_p1_m1", "爷爷", "yéye", "kakek"),
            MatchPairItem("u17_s5_p1_m2", "奶奶", "nǎinai", "nenek"),
            MatchPairItem("u17_s5_p1_m3", "丈夫", "zhàngfu", "suami"),
            MatchPairItem("u17_s5_p1_m4", "妻子", "qīzi", "istri")
        )
    )""",
            f"""    // 4. Soal 4: Ketik Pinyin (kakek -> yéye)
    Exercise(
        id = "u17_s5_p1_q4",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "kakek",
        sentenceWithBlank = "爷爷 (________)",
        targetHanzi = "爷爷",
        targetPinyin = "yéye",
        correctAnswer = "yeye",
        keyboardKeys = {k5_p1_q4},
        audioToSpeak = "爷爷"
    )""",
            f"""    // 5. Soal 5: Mendengar Kalimat (Rule 10: illustrationRes = 0)
    Exercise(
        id = "u17_s5_p1_q5",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Apa yang Anda dengar?",
        targetTranslation = "Suami dan istri pergi bersama ke rumah sakit.",
        targetHanzi = "丈夫 和 妻子 一起 去 医院。",
        targetPinyin = "Zhàngfu hé qīzi yìqǐ qù yīyuàn.",
        wordChips = listOf("丈夫:zhàngfu", "和:hé", "妻子:qīzi", "一起:yìqǐ", "去:qù", "医院。:yīyuàn."),
        correctAnswer = "丈夫,和,妻子,一起,去,医院。",
        illustrationRes = 0,
        audioToSpeak = "丈夫和妻子一起去医院。"
    )""",
            f"""    // 6. Soal 6: Pilihan Kalimat
    Exercise(
        id = "u17_s5_p1_q6",
        type = ExerciseType.SENTENCE_CHOICE,
        title = "Pilih terjemahan yang benar",
        targetHanzi = "那个 男孩儿 是 我 的 弟弟。",
        targetPinyin = "Nàge nánháiér shì wǒ de dìdi.",
        targetTranslation = "Anak laki-laki itu adalah adik laki-laki saya.",
        correctAnswer = "Nàge nánháiér shì wǒ de dìdi.\\n那个 男孩儿 是 我 的 弟弟。",
        options = listOf(
            "Nàge nánháiér shì wǒ de dìdi.\\n那个 男孩儿 是 我 的 弟弟。",
            "Nàge nǚháiér shì wǒ de mèimei.\\n那个 女孩儿 是 我 的 妹妹。",
            "Nàge nánháiér shì wǒ de gēge.\\n那个 男孩儿 是 我 的 哥哥。"
        ),
        audioToSpeak = "那个男孩儿是我的弟弟。"
    )""",
            f"""    // 7. Soal 7: Pilihan Gambar (丈夫 -> suami)
    Exercise(
        id = "u17_s5_p1_q7",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "丈夫",
        targetPinyin = "zhàngfu",
        targetTranslation = "suami",
        correctAnswer = "suami",
        audioToSpeak = "丈夫",
        pictureOptions = listOf(
            PictureOption("u17_s5_p1_opt7_1", "suami", "", R.drawable.ic_work_gentleman, true),
            PictureOption("u17_s5_p1_opt7_2", "istri", "", R.drawable.ic_work_lady, false),
            PictureOption("u17_s5_p1_opt7_3", "anak", "", R.drawable.ic_fam_child, false),
            PictureOption("u17_s5_p1_opt7_4", "rumah", "", R.drawable.ic_fam_home, false)
        )
    )""",
            f"""    // 8. Soal 8: Ketik Pinyin (suami -> zhàngfu)
    Exercise(
        id = "u17_s5_p1_q8",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "suami",
        sentenceWithBlank = "丈夫 (________)",
        targetHanzi = "丈夫",
        targetPinyin = "zhàngfu",
        correctAnswer = "zhangfu",
        keyboardKeys = {k5_p1_q8},
        audioToSpeak = "丈夫"
    )""",
            f"""    // 9. Soal 9: Susun Kalimat (Gadis cilik itu bernyanyi sangat bagus.)
    Exercise(
        id = "u17_s5_p1_q9",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Gadis cilik itu menyanyi merdu.",
        targetHanzi = "小 女孩儿 唱歌 很 好听。",
        targetPinyin = "Xiǎo nǚháiér chànggē hěn hǎotīng.",
        wordChips = listOf("小:xiǎo", "女孩儿:nǚháiér", "唱歌:chànggē", "很:hěn", "好听。:hǎotīng.", "男孩儿:nánháiér"),
        correctAnswer = "小,女孩儿,唱歌,很,好听。",
        audioToSpeak = "小女孩儿唱歌很好听。"
    )""",
            f"""    // 10. Soal 10: Ketuk Pasangan yang Sesuai (Rangkuman Sintesis 1)
    Exercise(
        id = "u17_s5_p1_m10",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u17_s5_p1_m10_1", "男孩儿", "nánháiér", "anak laki-laki"),
            MatchPairItem("u17_s5_p1_m10_2", "女孩儿", "nǚháiér", "anak perempuan"),
            MatchPairItem("u17_s5_p1_m10_3", "唱歌", "chànggē", "menyanyi"),
            MatchPairItem("u17_s5_p1_m10_4", "好听", "hǎotīng", "merdu")
        )
    )"""
        ],
        "p2": [
            f"""    // 1. Soal 1: Pilihan Gambar (自己 -> diri sendiri)
    Exercise(
        id = "u17_s5_p2_q1",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "自己",
        targetPinyin = "zìjǐ",
        targetTranslation = "diri sendiri",
        correctAnswer = "diri sendiri",
        audioToSpeak = "自己",
        pictureOptions = listOf(
            PictureOption("u17_s5_p2_opt1", "diri sendiri", "", R.drawable.ic_person_saya, true),
            PictureOption("u17_s5_p2_opt2", "banyak orang", "", R.drawable.ic_people_group, false),
            PictureOption("u17_s5_p2_opt3", "teman", "", R.drawable.ic_two_friends, false),
            PictureOption("u17_s5_p2_opt4", "rumah", "", R.drawable.ic_fam_home, false)
        )
    )""",
            f"""    // 2. Soal 2: Susun Kalimat (Hari ini ulang tahun kakek, kami sangat senang.)
    Exercise(
        id = "u17_s5_p2_q2",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Hari ini ulang tahun kakek.",
        targetHanzi = "今天 是 爷爷 的 生日。",
        targetPinyin = "Jīntiān shì yéye de shēngrì.",
        wordChips = listOf("今天:jīntiān", "是:shì", "爷爷:yéye", "的:de", "生日。:shēngrì.", "奶奶:nǎinai"),
        correctAnswer = "今天,是,爷爷,的,生日。",
        audioToSpeak = "今天是爷爷的生日。"
    )""",
            f"""    // 3. Soal 3: Ketuk Pasangan yang Sesuai (Grand Sintesis Bab 17)
    Exercise(
        id = "u17_s5_p2_m3",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u17_s5_p2_m1", "从小", "cóngxiǎo", "sejak kecil"),
            MatchPairItem("u17_s5_p2_m2", "小时候", "xiǎoshíhou", "waktu kecil"),
            MatchPairItem("u17_s5_p2_m3", "姓名", "xìngmíng", "nama lengkap"),
            MatchPairItem("u17_s5_p2_m4", "自己", "zìjǐ", "diri sendiri")
        )
    )""",
            f"""    // 4. Soal 4: Ketik Pinyin (diri sendiri -> zìjǐ)
    Exercise(
        id = "u17_s5_p2_q4",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "diri sendiri",
        sentenceWithBlank = "自己 (________)",
        targetHanzi = "自己",
        targetPinyin = "zìjǐ",
        correctAnswer = "ziji",
        keyboardKeys = {k5_p2_q4},
        audioToSpeak = "自己"
    )""",
            f"""    // 5. Soal 5: Mendengar Kalimat (Rule 10: illustrationRes = 0)
    Exercise(
        id = "u17_s5_p2_q5",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Apa yang Anda dengar?",
        targetTranslation = "Selamat ulang tahun untukmu!",
        targetHanzi = "祝 你 生日 快乐！",
        targetPinyin = "Zhù nǐ shēngrì kuàilè!",
        wordChips = listOf("祝:zhù", "你:nǐ", "生日:shēngrì", "快乐！:kuàilè!", "高兴:gāoxìng"),
        correctAnswer = "祝,你,生日,快乐！",
        illustrationRes = 0,
        audioToSpeak = "祝你生日快乐！"
    )""",
            f"""    // 6. Soal 6: Pilihan Kalimat
    Exercise(
        id = "u17_s5_p2_q6",
        type = ExerciseType.SENTENCE_CHOICE,
        title = "Pilih terjemahan yang benar",
        targetHanzi = "我 认识 一 名 好 医生。",
        targetPinyin = "Wǒ rènshi yì míng hǎo yīshēng.",
        targetTranslation = "Saya mengenal seorang dokter yang baik.",
        correctAnswer = "Wǒ rènshi yì míng hǎo yīshēng.\\n我 认识 一 名 好 医生。",
        options = listOf(
            "Wǒ rènshi yì míng hǎo yīshēng.\\n我 认识 一 名 好 医生。",
            "Tā rènshi yì míng hǎo lǎoshī.\\n他 认识 一 名 好 老师。",
            "Wǒ bú rènshi zhè wèi yīshēng.\\n我 不 认识 这 位 医生。"
        ),
        audioToSpeak = "我认识一名好医生。"
    )""",
            f"""    // 7. Soal 7: Pilihan Gambar (生日 -> ulang tahun)
    Exercise(
        id = "u17_s5_p2_q7",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "生日",
        targetPinyin = "shēngrì",
        targetTranslation = "ulang tahun",
        correctAnswer = "ulang tahun",
        audioToSpeak = "生日",
        pictureOptions = listOf(
            PictureOption("u17_s5_p2_opt7_1", "ulang tahun", "", R.drawable.ic_birthday_cake, true),
            PictureOption("u17_s5_p2_opt7_2", "orang", "", R.drawable.ic_person_saya, false),
            PictureOption("u17_s5_p2_opt7_3", "rumah", "", R.drawable.ic_fam_home, false),
            PictureOption("u17_s5_p2_opt7_4", "kursi", "", R.drawable.ic_fam_chair, false)
        )
    )""",
            f"""    // 8. Soal 8: Ketik Pinyin (ulang tahun -> shēngrì)
    Exercise(
        id = "u17_s5_p2_q8",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "hari ulang tahun",
        sentenceWithBlank = "生日 (________)",
        targetHanzi = "生日",
        targetPinyin = "shēngrì",
        correctAnswer = "shengri",
        keyboardKeys = {k5_p2_q8},
        audioToSpeak = "生日"
    )""",
            f"""    // 9. Soal 9: Susun Kalimat (Kita semua harus menyayangi keluarga sendiri.)
    Exercise(
        id = "u17_s5_p2_q9",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Kita harus sayang keluarga sendiri.",
        targetHanzi = "我们 要 爱 自己 的 家人。",
        targetPinyin = "Wǒmen yào ài zìjǐ de jiārén.",
        wordChips = listOf("我们:wǒmen", "要:yào", "爱:ài", "自己:zìjǐ", "的:de", "家人。:jiārén.", "朋友:péngyou"),
        correctAnswer = "我们,要,爱,自己,的,家人。",
        audioToSpeak = "我们要爱自己的家人。"
    )""",
            f"""    // 10. Soal 10: Ketuk Pasangan yang Sesuai (Rangkuman Grand Review Bab 17)
    Exercise(
        id = "u17_s5_p2_m10",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u17_s5_p2_m10_1", "爱家人", "ài jiārén", "sayang keluarga"),
            MatchPairItem("u17_s5_p2_m10_2", "两名医生", "liǎng míng yīshēng", "dua orang dokter"),
            MatchPairItem("u17_s5_p2_m10_3", "生日快乐", "shēngrì kuàilè", "selamat ultah"),
            MatchPairItem("u17_s5_p2_m10_4", "做饭好吃", "zuòfàn hǎochī", "masakan enak")
        )
    )"""
        ]
    }

    for s_idx in range(1, 6):
        filename = f"{base_dir}/Bab17Stage{s_idx}Data.kt"
        p1_code = ",\n\n".join(stages[s_idx]["p1"])
        p2_code = ",\n\n".join(stages[s_idx]["p2"])
        
        content = f"""package com.example.chineselearning.data.repository

import com.example.chineselearning.R
import com.example.chineselearning.data.model.Exercise
import com.example.chineselearning.data.model.ExerciseType
import com.example.chineselearning.data.model.MatchPairItem
import com.example.chineselearning.data.model.PictureOption

val bab17Stage{s_idx}Part1Exercises = listOf(
{p1_code}
)

val bab17Stage{s_idx}Part2Exercises = listOf(
{p2_code}
)
"""
        with open(filename, "w", encoding="utf-8") as f:
            f.write(content)
        print(f"Written {filename}")

if __name__ == "__main__":
    generate_bab17()
