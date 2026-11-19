#!/usr/bin/env python3
import os
import re

extra_distractors = ['a', 'e', 'i', 'o', 'u', 'b', 'd', 'g', 'h', 'j', 'l', 'm', 'n', 'q', 's', 't', 'w', 'x', 'y', 'z']

def make_keys(ans):
    ans_clean = ans.lower().strip()
    needed = [c for c in ans_clean if c.isalpha()]
    keys = list(dict.fromkeys(needed))
    for d in extra_distractors:
        if d not in keys:
            keys.append(d)
        if len(keys) >= 11:
            break
    return "listOf(" + ", ".join(f'"{k}"' for k in keys) + ")"

def generate_bab6():
    base_dir = "app/src/main/java/com/example/chineselearning/data/repository"
    
    stages = {}
    
    # STAGE 1: Orang Tua & Saudara Kandung (爸爸, 妈妈, 哥哥, 姐姐, 弟弟, 妹妹)
    k1_p1_q4_keys = make_keys("baba")
    k1_p1_q8_keys = make_keys("gege")
    k1_p2_q4_keys = make_keys("didi")
    k1_p2_q8_keys = make_keys("meimei")
    
    stages[1] = {
        "p1": [
            f"""    // 1. Soal 1: Pilihan Gambar (爸爸 -> ayah)
    Exercise(
        id = "u6_s1_p1_q1",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "爸爸",
        targetPinyin = "bàba",
        targetTranslation = "ayah",
        correctAnswer = "ayah",
        audioToSpeak = "爸爸",
        pictureOptions = listOf(
            PictureOption("u6_s1_p1_opt1", "ayah", "👨", R.drawable.ic_person_guru, true),
            PictureOption("u6_s1_p1_opt2", "ibu", "👩", R.drawable.ic_person_saya, false),
            PictureOption("u6_s1_p1_opt3", "murid", "🧒", R.drawable.ic_person_murid, false),
            PictureOption("u6_s1_p1_opt4", "rumah", "🏠", R.drawable.ic_book, false)
        )
    )""",
            f"""    // 2. Soal 2: Susun Kalimat (Ini adalah ayah saya.)
    Exercise(
        id = "u6_s1_p1_q2",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Ini adalah ayah saya.",
        targetHanzi = "这 是 我 爸爸。",
        targetPinyin = "Zhè shì wǒ bàba.",
        wordChips = listOf("这:zhè", "是:shì", "我:wǒ", "爸爸:bàba", "妈妈:māma", "那:nà"),
        correctAnswer = "这,是,我,爸爸",
        audioToSpeak = "这是我爸爸。"
    )""",
            f"""    // 3. Soal 3: Ketuk Pasangan yang Sesuai (Keluarga Inti)
    Exercise(
        id = "u6_s1_p1_q3",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u6_s1_p1_m1", "爸爸", "bàba", "ayah"),
            MatchPairItem("u6_s1_p1_m2", "妈妈", "māma", "ibu"),
            MatchPairItem("u6_s1_p1_m3", "哥哥", "gēge", "kakak laki-laki"),
            MatchPairItem("u6_s1_p1_m4", "姐姐", "jiějie", "kakak perempuan")
        )
    )""",
            f"""    // 4. Soal 4: Ketik Pinyin (ayah -> bàba)
    Exercise(
        id = "u6_s1_p1_q4",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "ayah",
        sentenceWithBlank = "爸爸 (________)",
        targetHanzi = "爸爸",
        targetPinyin = "bàba",
        correctAnswer = "baba",
        keyboardKeys = {k1_p1_q4_keys},
        audioToSpeak = "爸爸"
    )""",
            f"""    // 5. Soal 5: Mendengar Kalimat (Rule 10: illustrationRes = 0)
    Exercise(
        id = "u6_s1_p1_q5",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Apa yang Anda dengar?",
        targetTranslation = "Saya menyayangi ayah dan ibu.",
        targetHanzi = "我 爱 爸爸 妈妈。",
        targetPinyin = "Wǒ ài bàba māma.",
        wordChips = listOf("我:wǒ", "爱:ài", "爸爸:bàba", "妈妈:māma", "他:tā", "哥哥:gēge"),
        correctAnswer = "我,爱,爸爸,妈妈",
        illustrationRes = 0,
        audioToSpeak = "我爱爸爸妈妈。"
    )""",
            f"""    // 6. Soal 6: Pilihan Kalimat
    Exercise(
        id = "u6_s1_p1_q6",
        type = ExerciseType.SENTENCE_CHOICE,
        title = "Pilih terjemahan yang benar",
        targetHanzi = "他 是 我 哥哥。",
        targetPinyin = "Tā shì wǒ gēge.",
        targetTranslation = "Dia adalah kakak laki-laki saya.",
        correctAnswer = "Tā shì wǒ gēge.\\n他 是 我 哥哥。",
        options = listOf(
            "Tā shì wǒ gēge.\\n他 是 我 哥哥。",
            "Tā shì wǒ dìdi.\\n他 是 我 弟弟。",
            "Tā shì wǒ bàba.\\n他 是 我 爸爸。"
        ),
        audioToSpeak = "他是我哥哥。"
    )""",
            f"""    // 7. Soal 7: Pilihan Gambar (妈妈 -> ibu)
    Exercise(
        id = "u6_s1_p1_q7",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "妈妈",
        targetPinyin = "māma",
        targetTranslation = "ibu",
        correctAnswer = "ibu",
        audioToSpeak = "妈妈",
        pictureOptions = listOf(
            PictureOption("u6_s1_p1_opt7_1", "ibu", "👩", R.drawable.ic_person_saya, true),
            PictureOption("u6_s1_p1_opt7_2", "ayah", "👨", R.drawable.ic_person_guru, false),
            PictureOption("u6_s1_p1_opt7_3", "kakak", "👦", R.drawable.ic_person_murid, false),
            PictureOption("u6_s1_p1_opt7_4", "uang", "🪙", R.drawable.ic_coin, false)
        )
    )""",
            f"""    // 8. Soal 8: Ketik Pinyin (kakak laki-laki -> gēge)
    Exercise(
        id = "u6_s1_p1_q8",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "kakak laki-laki",
        sentenceWithBlank = "哥哥 (________)",
        targetHanzi = "哥哥",
        targetPinyin = "gēge",
        correctAnswer = "gege",
        keyboardKeys = {k1_p1_q8_keys},
        audioToSpeak = "哥哥"
    )""",
            f"""    // 9. Soal 9: Susun Kalimat (Itu adalah kakak perempuan saya.)
    Exercise(
        id = "u6_s1_p1_q9",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Itu adalah kakak perempuan saya.",
        targetHanzi = "那 是 我 姐姐。",
        targetPinyin = "Nà shì wǒ jiějie.",
        wordChips = listOf("那:nà", "是:shì", "我:wǒ", "姐姐:jiějie", "妹妹:mèimei", "这:zhè"),
        correctAnswer = "那,是,我,姐姐",
        audioToSpeak = "那是我姐姐。"
    )""",
            f"""    // 10. Soal 10: Ketuk Pasangan yang Sesuai (Rangkuman Saudara Kandung)
    Exercise(
        id = "u6_s1_p1_q10",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u6_s1_p1_m10_1", "我爸爸", "wǒ bàba", "ayah saya"),
            MatchPairItem("u6_s1_p1_m10_2", "我妈妈", "wǒ māma", "ibu saya"),
            MatchPairItem("u6_s1_p1_m10_3", "我哥哥", "wǒ gēge", "kakak laki-laki saya"),
            MatchPairItem("u6_s1_p1_m10_4", "我姐姐", "wǒ jiějie", "kakak perempuan saya")
        )
    )"""
        ],
        "p2": [
            f"""    // 1. Soal 1: Pilihan Gambar (弟弟 -> adik laki-laki)
    Exercise(
        id = "u6_s1_p2_q1",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "弟弟",
        targetPinyin = "dìdi",
        targetTranslation = "adik laki-laki",
        correctAnswer = "adik laki-laki",
        audioToSpeak = "弟弟",
        pictureOptions = listOf(
            PictureOption("u6_s1_p2_opt1", "adik laki-laki", "👦", R.drawable.ic_person_murid, true),
            PictureOption("u6_s1_p2_opt2", "kakak perempuan", "👧", R.drawable.ic_person_saya, false),
            PictureOption("u6_s1_p2_opt3", "ayah", "👨", R.drawable.ic_person_guru, false),
            PictureOption("u6_s1_p2_opt4", "buku", "📖", R.drawable.ic_book, false)
        )
    )""",
            f"""    // 2. Soal 2: Susun Kalimat (Saya punya seorang adik perempuan.)
    Exercise(
        id = "u6_s1_p2_q2",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Saya punya seorang adik perempuan.",
        targetHanzi = "我 有 一 个 妹妹。",
        targetPinyin = "Wǒ yǒu yí gè mèimei.",
        wordChips = listOf("我:wǒ", "有:yǒu", "一:yí", "个:gè", "妹妹:mèimei", "没有:méiyǒu", "弟弟:dìdi"),
        correctAnswer = "我,有,一,个,妹妹",
        audioToSpeak = "我有一个妹妹。"
    )""",
            f"""    // 3. Soal 3: Ketuk Pasangan yang Sesuai (Adik Laki-laki & Perempuan)
    Exercise(
        id = "u6_s1_p2_q3",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u6_s1_p2_m1", "弟弟", "dìdi", "adik laki-laki"),
            MatchPairItem("u6_s1_p2_m2", "妹妹", "mèimei", "adik perempuan"),
            MatchPairItem("u6_s1_p2_m3", "哥哥", "gēge", "kakak laki-laki"),
            MatchPairItem("u6_s1_p2_m4", "姐姐", "jiějie", "kakak perempuan")
        )
    )""",
            f"""    // 4. Soal 4: Ketik Pinyin (adik laki-laki -> dìdi)
    Exercise(
        id = "u6_s1_p2_q4",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "adik laki-laki",
        sentenceWithBlank = "弟弟 (________)",
        targetHanzi = "弟弟",
        targetPinyin = "dìdi",
        correctAnswer = "didi",
        keyboardKeys = {k1_p2_q4_keys},
        audioToSpeak = "弟弟"
    )""",
            f"""    // 5. Soal 5: Mendengar Kalimat (Rule 10: illustrationRes = 0)
    Exercise(
        id = "u6_s1_p2_q5",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Apa yang Anda dengar?",
        targetTranslation = "Apakah kamu punya adik laki-laki?",
        targetHanzi = "你 有 弟弟 吗？",
        targetPinyin = "Nǐ yǒu dìdi ma?",
        wordChips = listOf("你:nǐ", "有:yǒu", "弟弟:dìdi", "吗:ma", "没有:méiyǒu", "妹妹:mèimei"),
        correctAnswer = "你,有,弟弟,吗",
        illustrationRes = 0,
        audioToSpeak = "你有弟弟吗？"
    )""",
            f"""    // 6. Soal 6: Pilihan Kalimat
    Exercise(
        id = "u6_s1_p2_q6",
        type = ExerciseType.SENTENCE_CHOICE,
        title = "Pilih terjemahan yang benar",
        targetHanzi = "我 没有 妹妹。",
        targetPinyin = "Wǒ méiyǒu mèimei.",
        targetTranslation = "Saya tidak punya adik perempuan.",
        correctAnswer = "Wǒ méiyǒu mèimei.\\n我 没有 妹妹。",
        options = listOf(
            "Wǒ méiyǒu mèimei.\\n我 没有 妹妹。",
            "Wǒ yǒu mèimei.\\n我 有 妹妹。",
            "Wǒ méiyǒu dìdi.\\n我 没有 弟弟。"
        ),
        audioToSpeak = "我没有妹妹。"
    )""",
            f"""    // 7. Soal 7: Pilihan Gambar (妹妹 -> adik perempuan)
    Exercise(
        id = "u6_s1_p2_q7",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "妹妹",
        targetPinyin = "mèimei",
        targetTranslation = "adik perempuan",
        correctAnswer = "adik perempuan",
        audioToSpeak = "妹妹",
        pictureOptions = listOf(
            PictureOption("u6_s1_p2_opt7_1", "adik perempuan", "👧", R.drawable.ic_person_saya, true),
            PictureOption("u6_s1_p2_opt7_2", "ayah", "👨", R.drawable.ic_person_guru, false),
            PictureOption("u6_s1_p2_opt7_3", "adik laki-laki", "👦", R.drawable.ic_person_murid, false),
            PictureOption("u6_s1_p2_opt7_4", "kucing", "🐱", R.drawable.ic_book, false)
        )
    )""",
            f"""    // 8. Soal 8: Ketik Pinyin (adik perempuan -> mèimei)
    Exercise(
        id = "u6_s1_p2_q8",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "adik perempuan",
        sentenceWithBlank = "妹妹 (________)",
        targetHanzi = "妹妹",
        targetPinyin = "mèimei",
        correctAnswer = "meimei",
        keyboardKeys = {k1_p2_q8_keys},
        audioToSpeak = "妹妹"
    )""",
            f"""    // 9. Soal 9: Susun Kalimat (Dia punya dua adik laki-laki.)
    Exercise(
        id = "u6_s1_p2_q9",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Dia punya dua adik laki-laki.",
        targetHanzi = "他 有 两 个 弟弟。",
        targetPinyin = "Tā yǒu liǎng gè dìdi.",
        wordChips = listOf("他:tā", "有:yǒu", "两:liǎng", "个:gè", "弟弟:dìdi", "二:èr", "妹妹:mèimei"),
        correctAnswer = "他,有,两,个,弟弟",
        audioToSpeak = "他有两个弟弟。"
    )""",
            f"""    // 10. Soal 10: Ketuk Pasangan yang Sesuai (Rangkuman Lengkap Saudara)
    Exercise(
        id = "u6_s1_p2_m10_1",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u6_s1_p2_m10_1", "弟弟", "dìdi", "adik laki-laki"),
            MatchPairItem("u6_s1_p2_m10_2", "妹妹", "mèimei", "adik perempuan"),
            MatchPairItem("u6_s1_p2_m10_3", "哥哥", "gēge", "kakak laki-laki"),
            MatchPairItem("u6_s1_p2_m10_4", "没有", "méiyǒu", "tidak punya")
        )
    )"""
        ]
    }

    # STAGE 2: Anak & Kuantitas Anggota Keluarga (儿子, 女儿, 孩子, 小朋友, 口)
    k2_p1_q4_keys = make_keys("erzi")
    k2_p1_q8_keys = make_keys("nver")
    k2_p2_q4_keys = make_keys("haizi")
    k2_p2_q8_keys = make_keys("kou")
    
    stages[2] = {
        "p1": [
            f"""    // 1. Soal 1: Pilihan Gambar (儿子 -> anak laki-laki)
    Exercise(
        id = "u6_s2_p1_q1",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "儿子",
        targetPinyin = "érzi",
        targetTranslation = "anak laki-laki",
        correctAnswer = "anak laki-laki",
        audioToSpeak = "儿子",
        pictureOptions = listOf(
            PictureOption("u6_s2_p1_opt1", "anak laki-laki", "👦", R.drawable.ic_person_murid, true),
            PictureOption("u6_s2_p1_opt2", "anak perempuan", "👧", R.drawable.ic_person_saya, false),
            PictureOption("u6_s2_p1_opt3", "ibu", "👩", R.drawable.ic_book, false),
            PictureOption("u6_s2_p1_opt4", "ayah", "👨", R.drawable.ic_person_guru, false)
        )
    )""",
            f"""    // 2. Soal 2: Susun Kalimat (Dia adalah anak laki-laki saya.)
    Exercise(
        id = "u6_s2_p1_q2",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Dia adalah anak laki-laki saya.",
        targetHanzi = "他 是 我 儿子。",
        targetPinyin = "Tā shì wǒ érzi.",
        wordChips = listOf("他:tā", "是:shì", "我:wǒ", "儿子:érzi", "女儿:nǚ'ér", "她:tā"),
        correctAnswer = "他,是,我,儿子",
        audioToSpeak = "他是我儿子。"
    )""",
            f"""    // 3. Soal 3: Ketuk Pasangan yang Sesuai (Anak Laki & Perempuan)
    Exercise(
        id = "u6_s2_p1_q3",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u6_s2_p1_m1", "儿子", "érzi", "anak laki-laki"),
            MatchPairItem("u6_s2_p1_m2", "女儿", "nǚ'ér", "anak perempuan"),
            MatchPairItem("u6_s2_p1_m3", "孩子", "háizi", "anak"),
            MatchPairItem("u6_s2_p1_m4", "爸爸", "bàba", "ayah")
        )
    )""",
            f"""    // 4. Soal 4: Ketik Pinyin (anak laki-laki -> érzi)
    Exercise(
        id = "u6_s2_p1_q4",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "anak laki-laki",
        sentenceWithBlank = "儿子 (________)",
        targetHanzi = "儿子",
        targetPinyin = "érzi",
        correctAnswer = "erzi",
        keyboardKeys = {k2_p1_q4_keys},
        audioToSpeak = "儿子"
    )""",
            f"""    // 5. Soal 5: Mendengar Kalimat (Rule 10: illustrationRes = 0)
    Exercise(
        id = "u6_s2_p1_q5",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Apa yang Anda dengar?",
        targetTranslation = "Dia adalah anak perempuan saya.",
        targetHanzi = "她 是 我 女儿。",
        targetPinyin = "Tā shì wǒ nǚ'ér.",
        wordChips = listOf("她:tā", "是:shì", "我:wǒ", "女儿:nǚ'ér", "他:tā", "儿子:érzi"),
        correctAnswer = "她,是,我,女儿",
        illustrationRes = 0,
        audioToSpeak = "她是女儿。"
    )""",
            f"""    // 6. Soal 6: Pilihan Kalimat
    Exercise(
        id = "u6_s2_p1_q6",
        type = ExerciseType.SENTENCE_CHOICE,
        title = "Pilih terjemahan yang benar",
        targetHanzi = "我有 一个 儿子。",
        targetPinyin = "Wǒyǒu yí gè érzi.",
        targetTranslation = "Saya punya seorang anak laki-laki.",
        correctAnswer = "Wǒyǒu yí gè érzi.\\n我有 一个 儿子。",
        options = listOf(
            "Wǒyǒu yí gè érzi.\\n我有 一个 儿子。",
            "Wǒyǒu yí gè nǚ'ér.\\n我有 一个 女儿。",
            "Tāyǒu yí gè érzi.\\n他有 一个 儿子。"
        ),
        audioToSpeak = "我有一个儿子。"
    )""",
            f"""    // 7. Soal 7: Pilihan Gambar (女儿 -> anak perempuan)
    Exercise(
        id = "u6_s2_p1_q7",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "女儿",
        targetPinyin = "nǚ'ér",
        targetTranslation = "anak perempuan",
        correctAnswer = "anak perempuan",
        audioToSpeak = "女儿",
        pictureOptions = listOf(
            PictureOption("u6_s2_p1_opt7_1", "anak perempuan", "👧", R.drawable.ic_person_saya, true),
            PictureOption("u6_s2_p1_opt7_2", "anak laki-laki", "👦", R.drawable.ic_person_murid, false),
            PictureOption("u6_s2_p1_opt7_3", "ayah", "👨", R.drawable.ic_person_guru, false),
            PictureOption("u6_s2_p1_opt7_4", "rumah", "🏠", R.drawable.ic_story_timer, false)
        )
    )""",
            f"""    // 8. Soal 8: Ketik Pinyin (anak perempuan -> nǚ'ér)
    Exercise(
        id = "u6_s2_p1_q8",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "anak perempuan",
        sentenceWithBlank = "女儿 (________)",
        targetHanzi = "女儿",
        targetPinyin = "nǚ'ér",
        correctAnswer = "nver",
        keyboardKeys = {k2_p1_q8_keys},
        audioToSpeak = "女儿"
    )""",
            f"""    // 9. Soal 9: Susun Kalimat (Guru Wang punya seorang anak perempuan.)
    Exercise(
        id = "u6_s2_p1_q9",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Guru Wang punya seorang anak perempuan.",
        targetHanzi = "王老师 有 一个 女儿。",
        targetPinyin = "Wáng lǎoshī yǒu yí gè nǚ'ér.",
        wordChips = listOf("王老师:Wáng lǎoshī", "有:yǒu", "一个:yí gè", "女儿:nǚ'ér", "儿子:érzi", "学生:xuéshēng"),
        correctAnswer = "王老师,有,一个,女儿",
        audioToSpeak = "王老师有一个女儿。"
    )""",
            f"""    // 10. Soal 10: Ketuk Pasangan yang Sesuai (Rangkuman Anak)
    Exercise(
        id = "u6_s2_p1_m10_1",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u6_s2_p1_m10_1", "儿子", "érzi", "anak laki-laki"),
            MatchPairItem("u6_s2_p1_m10_2", "女儿", "nǚ'ér", "anak perempuan"),
            MatchPairItem("u6_s2_p1_m10_3", "一个儿子", "yí gè érzi", "seorang anak laki-laki"),
            MatchPairItem("u6_s2_p1_m10_4", "一个女儿", "yí gè nǚ'ér", "seorang anak perempuan")
        )
    )"""
        ],
        "p2": [
            f"""    // 1. Soal 1: Pilihan Gambar (孩子 -> anak / anak-anak)
    Exercise(
        id = "u6_s2_p2_q1",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "孩子",
        targetPinyin = "háizi",
        targetTranslation = "anak",
        correctAnswer = "anak",
        audioToSpeak = "孩子",
        pictureOptions = listOf(
            PictureOption("u6_s2_p2_opt1", "anak", "🧒", R.drawable.ic_person_murid, true),
            PictureOption("u6_s2_p2_opt2", "guru", "👨‍🏫", R.drawable.ic_person_guru, false),
            PictureOption("u6_s2_p2_opt3", "ibu", "👩", R.drawable.ic_person_saya, false),
            PictureOption("u6_s2_p2_opt4", "buku", "📖", R.drawable.ic_book, false)
        )
    )""",
            f"""    // 2. Soal 2: Susun Kalimat (Keluarga saya ada empat orang.)
    Exercise(
        id = "u6_s2_p2_q2",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Keluarga saya ada empat orang.",
        targetHanzi = "我家 有 四 口 人。",
        targetPinyin = "Wǒjiā yǒu sì kǒu rén.",
        wordChips = listOf("我家:wǒjiā", "有:yǒu", "四:sì", "口:kǒu", "人:rén", "五:wǔ", "个:gè"),
        correctAnswer = "我家,有,四,口,人",
        audioToSpeak = "我家有四口人。"
    )""",
            f"""    // 3. Soal 3: Ketuk Pasangan yang Sesuai (Satuan Anggota Keluarga)
    Exercise(
        id = "u6_s2_p2_q3",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u6_s2_p2_m1", "口", "kǒu", "orang (satuan keluarga)"),
            MatchPairItem("u6_s2_p2_m2", "孩子", "háizi", "anak"),
            MatchPairItem("u6_s2_p2_m3", "小朋友", "xiǎopéngyǒu", "anak kecil / teman kecil"),
            MatchPairItem("u6_s2_p2_m4", "几口人", "jǐ kǒu rén", "berapa orang (keluarga)")
        )
    )""",
            f"""    // 4. Soal 4: Ketik Pinyin (anak -> háizi)
    Exercise(
        id = "u6_s2_p2_q4",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "anak",
        sentenceWithBlank = "孩子 (________)",
        targetHanzi = "孩子",
        targetPinyin = "háizi",
        correctAnswer = "haizi",
        keyboardKeys = {k2_p2_q4_keys},
        audioToSpeak = "孩子"
    )""",
            f"""    // 5. Soal 5: Mendengar Kalimat (Rule 10: illustrationRes = 0)
    Exercise(
        id = "u6_s2_p2_q5",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Apa yang Anda dengar?",
        targetTranslation = "Kamu punya berapa anak?",
        targetHanzi = "你 有 几 个 孩子？",
        targetPinyin = "Nǐ yǒu jǐ gè háizi?",
        wordChips = listOf("你:nǐ", "有:yǒu", "几:jǐ", "个:gè", "孩子:háizi", "多少:duōshao"),
        correctAnswer = "你,有,几,个,孩子",
        illustrationRes = 0,
        audioToSpeak = "你有几个孩子？"
    )""",
            f"""    // 6. Soal 6: Pilihan Kalimat
    Exercise(
        id = "u6_s2_p2_q6",
        type = ExerciseType.SENTENCE_CHOICE,
        title = "Pilih terjemahan yang benar",
        targetHanzi = "你家 有 几 口 人？",
        targetPinyin = "Nǐjiā yǒu jǐ kǒu rén?",
        targetTranslation = "Keluargamu ada berapa orang?",
        correctAnswer = "Nǐjiā yǒu jǐ kǒu rén?\\n你家 有 几 口 人？",
        options = listOf(
            "Nǐjiā yǒu jǐ kǒu rén?\\n你家 有 几 口 人？",
            "Tājiā yǒu jǐ kǒu rén?\\n他家 有 几 口 人？",
            "Nǐjiā yǒu jǐ gè háizi?\\n你家 有 几 个 孩子？"
        ),
        audioToSpeak = "你家有几口人？"
    )""",
            f"""    // 7. Soal 7: Pilihan Gambar (口 -> satuan orang keluarga)
    Exercise(
        id = "u6_s2_p2_q7",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "口",
        targetPinyin = "kǒu",
        targetTranslation = "satuan keluarga / mulut",
        correctAnswer = "satuan keluarga / mulut",
        audioToSpeak = "口",
        pictureOptions = listOf(
            PictureOption("u6_s2_p2_opt7_1", "satuan keluarga / mulut", "👄", R.drawable.ic_people_group, true),
            PictureOption("u6_s2_p2_opt7_2", "buku", "📖", R.drawable.ic_book, false),
            PictureOption("u6_s2_p2_opt7_3", "uang", "🪙", R.drawable.ic_coin, false),
            PictureOption("u6_s2_p2_opt7_4", "jam", "⏰", R.drawable.ic_story_timer, false)
        )
    )""",
            f"""    // 8. Soal 8: Ketik Pinyin (satuan keluarga -> kǒu)
    Exercise(
        id = "u6_s2_p2_q8",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "satuan keluarga / mulut",
        sentenceWithBlank = "口 (________)",
        targetHanzi = "口",
        targetPinyin = "kǒu",
        correctAnswer = "kou",
        keyboardKeys = {k2_p2_q8_keys},
        audioToSpeak = "口"
    )""",
            f"""    // 9. Soal 9: Susun Kalimat (Halo anak-anak kecil!)
    Exercise(
        id = "u6_s2_p2_q9",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Halo anak-anak!",
        targetHanzi = "小朋友们 好！",
        targetPinyin = "Xiǎopéngyǒumen hǎo!",
        wordChips = listOf("小朋友们:xiǎopéngyǒumen", "好:hǎo", "老师:lǎoshī", "再见:zàijiàn"),
        correctAnswer = "小朋友们,好",
        audioToSpeak = "小朋友们好！"
    )""",
            f"""    // 10. Soal 10: Ketuk Pasangan yang Sesuai (Rangkuman Anggota Keluarga)
    Exercise(
        id = "u6_s2_p2_m10_1",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u6_s2_p2_m10_1", "三口人", "sān kǒu rén", "tiga orang anggota"),
            MatchPairItem("u6_s2_p2_m10_2", "四口人", "sì kǒu rén", "empat orang anggota"),
            MatchPairItem("u6_s2_p2_m10_3", "两个孩子", "liǎng gè háizi", "dua orang anak"),
            MatchPairItem("u6_s2_p2_m10_4", "小朋友", "xiǎopéngyǒu", "anak kecil")
        )
    )"""
        ]
    }

    # STAGE 3: Rumah, Keluarga & Tempat Tinggal (家, 家人, 住)
    k3_p1_q4_keys = make_keys("jia")
    k3_p1_q8_keys = make_keys("jiaren")
    k3_p2_q4_keys = make_keys("zhu")
    k3_p2_q8_keys = make_keys("zhuzai")
    
    stages[3] = {
        "p1": [
            f"""    // 1. Soal 1: Pilihan Gambar (家 -> rumah / keluarga)
    Exercise(
        id = "u6_s3_p1_q1",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "家",
        targetPinyin = "jiā",
        targetTranslation = "rumah / keluarga",
        correctAnswer = "rumah / keluarga",
        audioToSpeak = "家",
        pictureOptions = listOf(
            PictureOption("u6_s3_p1_opt1", "rumah / keluarga", "🏠", R.drawable.ic_people_group, true),
            PictureOption("u6_s3_p1_opt2", "sekolah", "🏫", R.drawable.ic_cap, false),
            PictureOption("u6_s3_p1_opt3", "kantor", "🏢", R.drawable.ic_story_timer, false),
            PictureOption("u6_s3_p1_opt4", "rumah sakit", "🏥", R.drawable.ic_book, false)
        )
    )""",
            f"""    // 2. Soal 2: Susun Kalimat (Saya sangat menyayangi keluarga saya.)
    Exercise(
        id = "u6_s3_p1_q2",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Saya sangat menyayangi keluarga saya.",
        targetHanzi = "我 很 爱 我 家人。",
        targetPinyin = "Wǒ hěn ài wǒ jiārén.",
        wordChips = listOf("我:wǒ", "很:hěn", "爱:ài", "我:wǒ", "家人:jiārén", "朋友:péngyou"),
        correctAnswer = "我,很,爱,我,家人",
        audioToSpeak = "我很爱我家人。"
    )""",
            f"""    // 3. Soal 3: Ketuk Pasangan yang Sesuai (Rumah & Keluarga)
    Exercise(
        id = "u6_s3_p1_q3",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u6_s3_p1_m1", "家", "jiā", "rumah / keluarga"),
            MatchPairItem("u6_s3_p1_m2", "家人", "jiārén", "anggota keluarga"),
            MatchPairItem("u6_s3_p1_m3", "回家", "huíjiā", "pulang ke rumah"),
            MatchPairItem("u6_s3_p1_m4", "在家", "zài jiā", "di rumah")
        )
    )""",
            f"""    // 4. Soal 4: Ketik Pinyin (rumah / keluarga -> jiā)
    Exercise(
        id = "u6_s3_p1_q4",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "rumah / keluarga",
        sentenceWithBlank = "家 (________)",
        targetHanzi = "家",
        targetPinyin = "jiā",
        correctAnswer = "jia",
        keyboardKeys = {k3_p1_q4_keys},
        audioToSpeak = "家"
    )""",
            f"""    // 5. Soal 5: Mendengar Kalimat (Rule 10: illustrationRes = 0)
    Exercise(
        id = "u6_s3_p1_q5",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Apa yang Anda dengar?",
        targetTranslation = "Dia sedang berada di rumah.",
        targetHanzi = "他 正在 家里。",
        targetPinyin = "Tā zhèngzài jiālǐ.",
        wordChips = listOf("他:tā", "正在:zhèngzài", "家里:jiālǐ", "学校:xuéxiào", "我:wǒ"),
        correctAnswer = "他,正在,家里",
        illustrationRes = 0,
        audioToSpeak = "他正在家里。"
    )""",
            f"""    // 6. Soal 6: Pilihan Kalimat
    Exercise(
        id = "u6_s3_p1_q6",
        type = ExerciseType.SENTENCE_CHOICE,
        title = "Pilih terjemahan yang benar",
        targetHanzi = "我们 都 爱 家人。",
        targetPinyin = "Wǒmen dōu ài jiārén.",
        targetTranslation = "Kita semua menyayangi keluarga.",
        correctAnswer = "Wǒmen dōu ài jiārén.\\n我们 都 爱 家人。",
        options = listOf(
            "Wǒmen dōu ài jiārén.\\n我们 都 爱 家人。",
            "Tāmen dōu ài jiārén.\\n他们 都 爱 家人。",
            "Wǒmen dōu ài péngyou.\\n我们 都 爱 朋友。"
        ),
        audioToSpeak = "我们都爱家人。"
    )""",
            f"""    // 7. Soal 7: Pilihan Gambar (家人 -> anggota keluarga)
    Exercise(
        id = "u6_s3_p1_q7",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "家人",
        targetPinyin = "jiārén",
        targetTranslation = "anggota keluarga",
        correctAnswer = "anggota keluarga",
        audioToSpeak = "家人",
        pictureOptions = listOf(
            PictureOption("u6_s3_p1_opt7_1", "anggota keluarga", "👨‍👩‍👧‍👦", R.drawable.ic_people_group, true),
            PictureOption("u6_s3_p1_opt7_2", "guru", "👨‍🏫", R.drawable.ic_person_guru, false),
            PictureOption("u6_s3_p1_opt7_3", "murid", "🧒", R.drawable.ic_person_murid, false),
            PictureOption("u6_s3_p1_opt7_4", "rekan", "🤝", R.drawable.ic_handshake, false)
        )
    )""",
            f"""    // 8. Soal 8: Ketik Pinyin (anggota keluarga -> jiārén)
    Exercise(
        id = "u6_s3_p1_q8",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "anggota keluarga",
        sentenceWithBlank = "家人 (________)",
        targetHanzi = "家人",
        targetPinyin = "jiārén",
        correctAnswer = "jiaren",
        keyboardKeys = {k3_p1_q8_keys},
        audioToSpeak = "家人"
    )""",
            f"""    // 9. Soal 9: Susun Kalimat (Saya pulang ke rumah.)
    Exercise(
        id = "u6_s3_p1_q9",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Saya pulang ke rumah jam enam.",
        targetHanzi = "我 六 点 回家。",
        targetPinyin = "Wǒ liù diǎn huíjiā.",
        wordChips = listOf("我:wǒ", "六:liù", "点:diǎn", "回家:huíjiā", "去:qù", "学校:xuéxiào"),
        correctAnswer = "我,六,点,回家",
        audioToSpeak = "我六点回家。"
    )""",
            f"""    // 10. Soal 10: Ketuk Pasangan yang Sesuai (Rangkuman Rumah)
    Exercise(
        id = "u6_s3_p1_m10_1",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u6_s3_p1_m10_1", "家人", "jiārén", "anggota keluarga"),
            MatchPairItem("u6_s3_p1_m10_2", "我家", "wǒjiā", "keluarga / rumah saya"),
            MatchPairItem("u6_s3_p1_m10_3", "爱家人", "ài jiārén", "sayang keluarga"),
            MatchPairItem("u6_s3_p1_m10_4", "回家", "huíjiā", "pulang rumah")
        )
    )"""
        ],
        "p2": [
            f"""    // 1. Soal 1: Pilihan Gambar (住 -> tinggal / menetap)
    Exercise(
        id = "u6_s3_p2_q1",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "住",
        targetPinyin = "zhù",
        targetTranslation = "tinggal / menetap",
        correctAnswer = "tinggal / menetap",
        audioToSpeak = "住",
        pictureOptions = listOf(
            PictureOption("u6_s3_p2_opt1", "tinggal / menetap", "🏡", R.drawable.ic_people_group, true),
            PictureOption("u6_s3_p2_opt2", "pergi", "🚶", R.drawable.ic_target, false),
            PictureOption("u6_s3_p2_opt3", "makan", "🍚", R.drawable.ic_coin, false),
            PictureOption("u6_s3_p2_opt4", "belajar", "📖", R.drawable.ic_book, false)
        )
    )""",
            f"""    // 2. Soal 2: Susun Kalimat (Kamu tinggal di mana?)
    Exercise(
        id = "u6_s3_p2_q2",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Kamu tinggal di mana?",
        targetHanzi = "你 住 在 哪儿？",
        targetPinyin = "Nǐ zhù zài nǎr?",
        wordChips = listOf("你:nǐ", "住:zhù", "在:zài", "哪儿:nǎr", "他:tā", "北京:Běijīng"),
        correctAnswer = "你,住,在,哪儿",
        audioToSpeak = "你住在哪儿？"
    )""",
            f"""    // 3. Soal 3: Ketuk Pasangan yang Sesuai (Tinggal & Tempat)
    Exercise(
        id = "u6_s3_p2_q3",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u6_s3_p2_m1", "住", "zhù", "tinggal"),
            MatchPairItem("u6_s3_p2_m2", "住在", "zhù zài", "tinggal di"),
            MatchPairItem("u6_s3_p2_m3", "哪儿", "nǎr", "di mana"),
            MatchPairItem("u6_s3_p2_m4", "北京", "Běijīng", "Beijing")
        )
    )""",
            f"""    // 4. Soal 4: Ketik Pinyin (tinggal -> zhù)
    Exercise(
        id = "u6_s3_p2_q4",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "tinggal / menetap",
        sentenceWithBlank = "住 (________)",
        targetHanzi = "住",
        targetPinyin = "zhù",
        correctAnswer = "zhu",
        keyboardKeys = {k3_p2_q4_keys},
        audioToSpeak = "住"
    )""",
            f"""    // 5. Soal 5: Mendengar Kalimat (Rule 10: illustrationRes = 0)
    Exercise(
        id = "u6_s3_p2_q5",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Apa yang Anda dengar?",
        targetTranslation = "Saya dan keluarga tinggal di Beijing.",
        targetHanzi = "我 和 家人 住 在 北京。",
        targetPinyin = "Wǒ hé jiārén zhù zài Běijīng.",
        wordChips = listOf("我:wǒ", "和:hé", "家人:jiārén", "住:zhù", "在:zài", "北京:Běijīng"),
        correctAnswer = "我,和,家人,住,在,北京",
        illustrationRes = 0,
        audioToSpeak = "我和家人住在北京。"
    )""",
            f"""    // 6. Soal 6: Pilihan Kalimat
    Exercise(
        id = "u6_s3_p2_q6",
        type = ExerciseType.SENTENCE_CHOICE,
        title = "Pilih terjemahan yang benar",
        targetHanzi = "他 住 在 中国。",
        targetPinyin = "Tā zhù zài Zhōngguó.",
        targetTranslation = "Dia tinggal di Tiongkok.",
        correctAnswer = "Tā zhù zài Zhōngguó.\\n他 住 在 中国。",
        options = listOf(
            "Tā zhù zài Zhōngguó.\\n他 住 在 中国。",
            "Wǒ zhù zài Zhōngguó.\\n我 住 在 中国。",
            "Tā qù Zhōngguó.\\n他 去 中国。"
        ),
        audioToSpeak = "他住在中国。"
    )""",
            f"""    // 7. Soal 7: Pilihan Gambar (住在 -> tinggal di)
    Exercise(
        id = "u6_s3_p2_q7",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "住在",
        targetPinyin = "zhù zài",
        targetTranslation = "tinggal di",
        correctAnswer = "tinggal di",
        audioToSpeak = "住在",
        pictureOptions = listOf(
            PictureOption("u6_s3_p2_opt7_1", "tinggal di", "📍", R.drawable.ic_people_group, true),
            PictureOption("u6_s3_p2_opt7_2", "tidur", "🛌", R.drawable.ic_book, false),
            PictureOption("u6_s3_p2_opt7_3", "makan", "🍚", R.drawable.ic_coin, false),
            PictureOption("u6_s3_p2_opt7_4", "lari", "🏃", R.drawable.ic_dumbbell, false)
        )
    )""",
            f"""    // 8. Soal 8: Ketik Pinyin (tinggal di -> zhù zài)
    Exercise(
        id = "u6_s3_p2_q8",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "tinggal di",
        sentenceWithBlank = "住在 (________)",
        targetHanzi = "住在",
        targetPinyin = "zhùzài",
        correctAnswer = "zhuzai",
        keyboardKeys = {k3_p2_q8_keys},
        audioToSpeak = "住在"
    )""",
            f"""    // 9. Soal 9: Susun Kalimat (Guru Wang tinggal di sekolah.)
    Exercise(
        id = "u6_s3_p2_q9",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Guru Wang tinggal di sekolah.",
        targetHanzi = "王老师 住 在 学校。",
        targetPinyin = "Wáng lǎoshī zhù zài xuéxiào.",
        wordChips = listOf("王老师:Wáng lǎoshī", "住:zhù", "在:zài", "学校:xuéxiào", "家里:jiālǐ", "北京:Běijīng"),
        correctAnswer = "王老师,住,在,学校",
        audioToSpeak = "王老师住在学校。"
    )""",
            f"""    // 10. Soal 10: Ketuk Pasangan yang Sesuai (Rangkuman Tempat Tinggal)
    Exercise(
        id = "u6_s3_p2_m10_1",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u6_s3_p2_m10_1", "住在北京", "zhù zài Běijīng", "tinggal di Beijing"),
            MatchPairItem("u6_s3_p2_m10_2", "住在学校", "zhù zài xuéxiào", "tinggal di sekolah"),
            MatchPairItem("u6_s3_p2_m10_3", "住在哪儿", "zhù zài nǎr", "tinggal di mana"),
            MatchPairItem("u6_s3_p2_m10_4", "家人", "jiārén", "anggota keluarga")
        )
    )"""
        ]
    }

    # STAGE 4: Kamar & Perabot Rumah (房间, 桌子, 椅子)
    k4_p1_q4_keys = make_keys("fangjian")
    k4_p1_q8_keys = make_keys("zhuozi")
    k4_p2_q4_keys = make_keys("yizi")
    k4_p2_q8_keys = make_keys("shang")
    
    stages[4] = {
        "p1": [
            f"""    // 1. Soal 1: Pilihan Gambar (房间 -> kamar / ruangan)
    Exercise(
        id = "u6_s4_p1_q1",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "房间",
        targetPinyin = "fángjiān",
        targetTranslation = "kamar / ruangan",
        correctAnswer = "kamar / ruangan",
        audioToSpeak = "房间",
        pictureOptions = listOf(
            PictureOption("u6_s4_p1_opt1", "kamar / ruangan", "🚪", R.drawable.ic_book, true),
            PictureOption("u6_s4_p1_opt2", "meja", "🪑", R.drawable.ic_crown, false),
            PictureOption("u6_s4_p1_opt3", "buku", "📖", R.drawable.ic_story_timer, false),
            PictureOption("u6_s4_p1_opt4", "uang", "🪙", R.drawable.ic_coin, false)
        )
    )""",
            f"""    // 2. Soal 2: Susun Kalimat (Ini adalah kamar saya.)
    Exercise(
        id = "u6_s4_p1_q2",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Ini adalah kamar saya.",
        targetHanzi = "这 是 我 的 房间。",
        targetPinyin = "Zhè shì wǒ de fángjiān.",
        wordChips = listOf("这:zhè", "是:shì", "我:wǒ", "的:de", "房间:fángjiān", "家:jiā", "那:nà"),
        correctAnswer = "这,是,我,的,房间",
        audioToSpeak = "这是我的房间。"
    )""",
            f"""    // 3. Soal 3: Ketuk Pasangan yang Sesuai (Kamar & Perabot)
    Exercise(
        id = "u6_s4_p1_q3",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u6_s4_p1_m1", "房间", "fángjiān", "kamar / ruangan"),
            MatchPairItem("u6_s4_p1_m2", "桌子", "zhuōzi", "meja"),
            MatchPairItem("u6_s4_p1_m3", "椅子", "yǐzi", "kursi"),
            MatchPairItem("u6_s4_p1_m4", "很大", "hěn dà", "sangat besar")
        )
    )""",
            f"""    // 4. Soal 4: Ketik Pinyin (kamar -> fángjiān)
    Exercise(
        id = "u6_s4_p1_q4",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "kamar / ruangan",
        sentenceWithBlank = "房间 (________)",
        targetHanzi = "房间",
        targetPinyin = "fángjiān",
        correctAnswer = "fangjian",
        keyboardKeys = {k4_p1_q4_keys},
        audioToSpeak = "房间"
    )""",
            f"""    // 5. Soal 5: Mendengar Kalimat (Rule 10: illustrationRes = 0)
    Exercise(
        id = "u6_s4_p1_q5",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Apa yang Anda dengar?",
        targetTranslation = "Kamarnya sangat besar.",
        targetHanzi = "房间 很 大。",
        targetPinyin = "Fángjiān hěn dà.",
        wordChips = listOf("房间:fángjiān", "很:hěn", "大:dà", "小:xiǎo", "桌子:zhuōzi"),
        correctAnswer = "房间,很,大",
        illustrationRes = 0,
        audioToSpeak = "房间很大。"
    )""",
            f"""    // 6. Soal 6: Pilihan Kalimat
    Exercise(
        id = "u6_s4_p1_q6",
        type = ExerciseType.SENTENCE_CHOICE,
        title = "Pilih terjemahan yang benar",
        targetHanzi = "房间 里 有 桌子。",
        targetPinyin = "Fángjiān lǐ yǒu zhuōzi.",
        targetTranslation = "Di dalam kamar ada meja.",
        correctAnswer = "Fángjiān lǐ yǒu zhuōzi.\\n房间 里 有 桌子。",
        options = listOf(
            "Fángjiān lǐ yǒu zhuōzi.\\n房间 里 有 桌子。",
            "Fángjiān lǐ yǒu yǐzi.\\n房间 里 有 椅子。",
            "Jiā lǐ yǒu zhuōzi.\\n家 里 有 桌子。"
        ),
        audioToSpeak = "房间里有桌子。"
    )""",
            f"""    // 7. Soal 7: Pilihan Gambar (桌子 -> meja)
    Exercise(
        id = "u6_s4_p1_q7",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "桌子",
        targetPinyin = "zhuōzi",
        targetTranslation = "meja",
        correctAnswer = "meja",
        audioToSpeak = "桌子",
        pictureOptions = listOf(
            PictureOption("u6_s4_p1_opt7_1", "meja", "🪵", R.drawable.ic_book, true),
            PictureOption("u6_s4_p1_opt7_2", "kursi", "🪑", R.drawable.ic_story_timer, false),
            PictureOption("u6_s4_p1_opt7_3", "pintu", "🚪", R.drawable.ic_target, false),
            PictureOption("u6_s4_p1_opt7_4", "uang", "🪙", R.drawable.ic_coin, false)
        )
    )""",
            f"""    // 8. Soal 8: Ketik Pinyin (meja -> zhuōzi)
    Exercise(
        id = "u6_s4_p1_q8",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "meja",
        sentenceWithBlank = "桌子 (________)",
        targetHanzi = "桌子",
        targetPinyin = "zhuōzi",
        correctAnswer = "zhuozi",
        keyboardKeys = {k4_p1_q8_keys},
        audioToSpeak = "桌子"
    )""",
            f"""    // 9. Soal 9: Susun Kalimat (Buku ada di atas meja.)
    Exercise(
        id = "u6_s4_p1_q9",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Buku ada di atas meja.",
        targetHanzi = "书 在 桌子 上。",
        targetPinyin = "Shū zài zhuōzi shang.",
        wordChips = listOf("书:shū", "在:zài", "桌子:zhuōzi", "上:shang", "椅子:yǐzi", "里:lǐ"),
        correctAnswer = "书,在,桌子,上",
        audioToSpeak = "书在桌子上。"
    )""",
            f"""    // 10. Soal 10: Ketuk Pasangan yang Sesuai (Perabot Kamar)
    Exercise(
        id = "u6_s4_p1_m10_1",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u6_s4_p1_m10_1", "桌子", "zhuōzi", "meja"),
            MatchPairItem("u6_s4_p1_m10_2", "房间", "fángjiān", "kamar"),
            MatchPairItem("u6_s4_p1_m10_3", "在桌子上", "zài zhuōzi shang", "di atas meja"),
            MatchPairItem("u6_s4_p1_m10_4", "很大", "hěn dà", "sangat besar")
        )
    )"""
        ],
        "p2": [
            f"""    // 1. Soal 1: Pilihan Gambar (椅子 -> kursi)
    Exercise(
        id = "u6_s4_p2_q1",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "椅子",
        targetPinyin = "yǐzi",
        targetTranslation = "kursi",
        correctAnswer = "kursi",
        audioToSpeak = "椅子",
        pictureOptions = listOf(
            PictureOption("u6_s4_p2_opt1", "kursi", "🪑", R.drawable.ic_book, true),
            PictureOption("u6_s4_p2_opt2", "meja", "🪵", R.drawable.ic_story_timer, false),
            PictureOption("u6_s4_p2_opt3", "kamar", "🚪", R.drawable.ic_target, false),
            PictureOption("u6_s4_p2_opt4", "buku", "📖", R.drawable.ic_crown, false)
        )
    )""",
            f"""    // 2. Soal 2: Susun Kalimat (Di dalam kamar ada sebuah kursi.)
    Exercise(
        id = "u6_s4_p2_q2",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Di dalam kamar ada satu kursi.",
        targetHanzi = "房间 里 有 一 把 椅子。",
        targetPinyin = "Fángjiān lǐ yǒu yì bǎ yǐzi.",
        wordChips = listOf("房间:fángjiān", "里:lǐ", "有:yǒu", "一:yì", "把:bǎ", "椅子:yǐzi", "桌子:zhuōzi"),
        correctAnswer = "房间,里,有,一,把,椅子",
        audioToSpeak = "房间里有一把椅子。"
    )""",
            f"""    // 3. Soal 3: Ketuk Pasangan yang Sesuai (Posisi Perabot)
    Exercise(
        id = "u6_s4_p2_q3",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u6_s4_p2_m1", "椅子", "yǐzi", "kursi"),
            MatchPairItem("u6_s4_p2_m2", "桌子", "zhuōzi", "meja"),
            MatchPairItem("u6_s4_p2_m3", "坐在椅子上", "zuò zài yǐzi shang", "duduk di kursi"),
            MatchPairItem("u6_s4_p2_m4", "在房间里", "zài fángjiān lǐ", "di dalam kamar")
        )
    )""",
            f"""    // 4. Soal 4: Ketik Pinyin (kursi -> yǐzi)
    Exercise(
        id = "u6_s4_p2_q4",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "kursi",
        sentenceWithBlank = "椅子 (________)",
        targetHanzi = "椅子",
        targetPinyin = "yǐzi",
        correctAnswer = "yizi",
        keyboardKeys = {k4_p2_q4_keys},
        audioToSpeak = "椅子"
    )""",
            f"""    // 5. Soal 5: Mendengar Kalimat (Rule 10: illustrationRes = 0)
    Exercise(
        id = "u6_s4_p2_q5",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Apa yang Anda dengar?",
        targetTranslation = "Dia duduk di kursi.",
        targetHanzi = "他 坐 在 椅子 上。",
        targetPinyin = "Tā zuò zài yǐzi shang.",
        wordChips = listOf("他:tā", "坐:zuò", "在:zài", "椅子:yǐzi", "上:shang", "桌子:zhuōzi"),
        correctAnswer = "他,坐,在,椅子,上",
        illustrationRes = 0,
        audioToSpeak = "他坐在椅子上。"
    )""",
            f"""    // 6. Soal 6: Pilihan Kalimat
    Exercise(
        id = "u6_s4_p2_q6",
        type = ExerciseType.SENTENCE_CHOICE,
        title = "Pilih terjemahan yang benar",
        targetHanzi = "房间 里 有 桌子 和 椅子。",
        targetPinyin = "Fángjiān lǐ yǒu zhuōzi hé yǐzi.",
        targetTranslation = "Di dalam kamar ada meja dan kursi.",
        correctAnswer = "Fángjiān lǐ yǒu zhuōzi hé yǐzi.\\n房间 里 有 桌子 和 椅子。",
        options = listOf(
            "Fángjiān lǐ yǒu zhuōzi hé yǐzi.\\n房间 里 有 桌子 和 椅子。",
            "Fángjiān lǐ yǒu shū hé yǐzi.\\n房间 里 有 书 和 椅子。",
            "Jiā lǐ yǒu zhuōzi hé yǐzi.\\n家 里 有 桌子 和 椅子。"
        ),
        audioToSpeak = "房间里有桌子和椅子。"
    )""",
            f"""    // 7. Soal 7: Pilihan Gambar (坐在椅子上 -> duduk di kursi)
    Exercise(
        id = "u6_s4_p2_q7",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "坐",
        targetPinyin = "zuò",
        targetTranslation = "duduk",
        correctAnswer = "duduk",
        audioToSpeak = "坐",
        pictureOptions = listOf(
            PictureOption("u6_s4_p2_opt7_1", "duduk", "🪑", R.drawable.ic_book, true),
            PictureOption("u6_s4_p2_opt7_2", "berdiri", "🚶", R.drawable.ic_target, false),
            PictureOption("u6_s4_p2_opt7_3", "tidur", "🛌", R.drawable.ic_story_timer, false),
            PictureOption("u6_s4_p2_opt7_4", "makan", "🍜", R.drawable.ic_coin, false)
        )
    )""",
            f"""    // 8. Soal 8: Ketik Pinyin (atas -> shàng)
    Exercise(
        id = "u6_s4_p2_q8",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "atas",
        sentenceWithBlank = "桌子上 (zhuōzi ________)",
        targetHanzi = "上",
        targetPinyin = "shang",
        correctAnswer = "shang",
        keyboardKeys = {k4_p2_q8_keys},
        audioToSpeak = "上"
    )""",
            f"""    // 9. Soal 9: Susun Kalimat (Silakan duduk di sini.)
    Exercise(
        id = "u6_s4_p2_q9",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Silakan duduk di sini.",
        targetHanzi = "请 坐 在 这儿。",
        targetPinyin = "Qǐng zuò zài zhèr.",
        wordChips = listOf("请:qǐng", "坐:zuò", "在:zài", "这儿:zhèr", "那儿:nàr", "看:kàn"),
        correctAnswer = "请,坐,在,这儿",
        audioToSpeak = "请坐在这儿。"
    )""",
            f"""    // 10. Soal 10: Ketuk Pasangan yang Sesuai (Rangkuman Perabot & Lokasi)
    Exercise(
        id = "u6_s4_p2_m10_1",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u6_s4_p2_m10_1", "椅子", "yǐzi", "kursi"),
            MatchPairItem("u6_s4_p2_m10_2", "桌子", "zhuōzi", "meja"),
            MatchPairItem("u6_s4_p2_m10_3", "坐在椅子上", "zuò zài yǐzi shang", "duduk di kursi"),
            MatchPairItem("u6_s4_p2_m10_4", "桌子上有书", "zhuōzi shang yǒu shū", "di meja ada buku")
        )
    )"""
        ]
    }

    # STAGE 5: Usia & Hubungan Anggota Keluarga (岁)
    k5_p1_q4_keys = make_keys("sui")
    k5_p1_q8_keys = make_keys("duoda")
    k5_p2_q4_keys = make_keys("jinnian")
    k5_p2_q8_keys = make_keys("jisui")
    
    stages[5] = {
        "p1": [
            f"""    // 1. Soal 1: Pilihan Gambar (岁 -> tahun umur)
    Exercise(
        id = "u6_s5_p1_q1",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "岁",
        targetPinyin = "suì",
        targetTranslation = "tahun (umur)",
        correctAnswer = "tahun (umur)",
        audioToSpeak = "岁",
        pictureOptions = listOf(
            PictureOption("u6_s5_p1_opt1", "tahun (umur)", "🎂", R.drawable.ic_crown, true),
            PictureOption("u6_s5_p1_opt2", "jam", "⏰", R.drawable.ic_story_timer, false),
            PictureOption("u6_s5_p1_opt3", "uang", "🪙", R.drawable.ic_coin, false),
            PictureOption("u6_s5_p1_opt4", "buku", "📖", R.drawable.ic_book, false)
        )
    )""",
            f"""    // 2. Soal 2: Susun Kalimat (Kakak laki-laki saya tahun ini 20 tahun.)
    Exercise(
        id = "u6_s5_p1_q2",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Kakak saya tahun ini 20 tahun.",
        targetHanzi = "我 哥哥 今年 二十 岁。",
        targetPinyin = "Wǒ gēge jīnnián èrshí suì.",
        wordChips = listOf("我:wǒ", "哥哥:gēge", "今年:jīnnián", "二十:èrshí", "岁:suì", "弟弟:dìdi"),
        correctAnswer = "我,哥哥,今年,二十,岁",
        audioToSpeak = "我哥哥今年二十岁。"
    )""",
            f"""    // 3. Soal 3: Ketuk Pasangan yang Sesuai (Usia Anggota Keluarga)
    Exercise(
        id = "u6_s5_p1_q3",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u6_s5_p1_m1", "二十岁", "èrshí suì", "dua puluh tahun"),
            MatchPairItem("u6_s5_p1_m2", "五岁", "wǔ suì", "lima tahun"),
            MatchPairItem("u6_s5_p1_m3", "多大", "duō dà", "berapa umur (dewasa)"),
            MatchPairItem("u6_s5_p1_m4", "几岁", "jǐ suì", "berapa umur (anak)")
        )
    )""",
            f"""    // 4. Soal 4: Ketik Pinyin (tahun umur -> suì)
    Exercise(
        id = "u6_s5_p1_q4",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "tahun (umur)",
        sentenceWithBlank = "岁 (________)",
        targetHanzi = "岁",
        targetPinyin = "suì",
        correctAnswer = "sui",
        keyboardKeys = {k5_p1_q4_keys},
        audioToSpeak = "岁"
    )""",
            f"""    // 5. Soal 5: Mendengar Kalimat (Rule 10: illustrationRes = 0)
    Exercise(
        id = "u6_s5_p1_q5",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Apa yang Anda dengar?",
        targetTranslation = "Anak perempuannya berumur lima tahun.",
        targetHanzi = "他 女儿 五 岁。",
        targetPinyin = "Tā nǚ'ér wǔ suì.",
        wordChips = listOf("他:tā", "女儿:nǚ'ér", "五:wǔ", "岁:suì", "儿子:érzi", "六:liù"),
        correctAnswer = "他,女儿,五,岁",
        illustrationRes = 0,
        audioToSpeak = "他女儿五岁。"
    )""",
            f"""    // 6. Soal 6: Pilihan Kalimat
    Exercise(
        id = "u6_s5_p1_q6",
        type = ExerciseType.SENTENCE_CHOICE,
        title = "Pilih terjemahan yang benar",
        targetHanzi = "你 儿子 几 岁？",
        targetPinyin = "Nǐ érzi jǐ suì?",
        targetTranslation = "Berapa umur anak laki-lakimu?",
        correctAnswer = "Nǐ érzi jǐ suì?\\n你 儿子 几 岁？",
        options = listOf(
            "Nǐ érzi jǐ suì?\\n你 儿子 几 岁？",
            "Nǐ nǚ'ér jǐ suì?\\n你 女儿 几 岁？",
            "Tā érzi jǐ suì?\\n他 儿子 几 岁？"
        ),
        audioToSpeak = "你儿子几岁？"
    )""",
            f"""    // 7. Soal 7: Pilihan Gambar (多大 -> berapa umur)
    Exercise(
        id = "u6_s5_p1_q7",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "多大",
        targetPinyin = "duō dà",
        targetTranslation = "berapa umur",
        correctAnswer = "berapa umur",
        audioToSpeak = "多大",
        pictureOptions = listOf(
            PictureOption("u6_s5_p1_opt7_1", "berapa umur", "🎂", R.drawable.ic_crown, true),
            PictureOption("u6_s5_p1_opt7_2", "berapa harga", "💰", R.drawable.ic_coin, false),
            PictureOption("u6_s5_p1_opt7_3", "kapan", "⏰", R.drawable.ic_story_timer, false),
            PictureOption("u6_s5_p1_opt7_4", "siapa", "👤", R.drawable.ic_person_guru, false)
        )
    )""",
            f"""    // 8. Soal 8: Ketik Pinyin (berapa umur -> duōdà)
    Exercise(
        id = "u6_s5_p1_q8",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "berapa umur",
        sentenceWithBlank = "多大 (________)",
        targetHanzi = "多大",
        targetPinyin = "duōdà",
        correctAnswer = "duoda",
        keyboardKeys = {k5_p1_q8_keys},
        audioToSpeak = "多大"
    )""",
            f"""    // 9. Soal 9: Susun Kalimat (Ibu saya tahun ini 45 tahun.)
    Exercise(
        id = "u6_s5_p1_q9",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Ibu saya tahun ini 45 tahun.",
        targetHanzi = "我 妈妈 今年 四十五 岁。",
        targetPinyin = "Wǒ māma jīnnián sìshíwǔ suì.",
        wordChips = listOf("我:wǒ", "妈妈:māma", "今年:jīnnián", "四十五:sìshíwǔ", "岁:suì", "爸爸:bàba"),
        correctAnswer = "我,妈妈,今年,四十五,岁",
        audioToSpeak = "我妈妈今年四十五岁。"
    )""",
            f"""    // 10. Soal 10: Ketuk Pasangan yang Sesuai (Rangkuman Umur Keluarga)
    Exercise(
        id = "u6_s5_p1_m10_1",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u6_s5_p1_m10_1", "我哥哥", "wǒ gēge", "kakak laki-laki"),
            MatchPairItem("u6_s5_p1_m10_2", "我妹妹", "wǒ mèimei", "adik perempuan"),
            MatchPairItem("u6_s5_p1_m10_3", "今年多大", "jīnnián duō dà", "berapa umur tahun ini"),
            MatchPairItem("u6_s5_p1_m10_4", "七岁", "qī suì", "tujuh tahun")
        )
    )"""
        ],
        "p2": [
            f"""    // 1. Soal 1: Pilihan Gambar (今年 -> tahun ini)
    Exercise(
        id = "u6_s5_p2_q1",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "今年",
        targetPinyin = "jīnnián",
        targetTranslation = "tahun ini",
        correctAnswer = "tahun ini",
        audioToSpeak = "今年",
        pictureOptions = listOf(
            PictureOption("u6_s5_p2_opt1", "tahun ini", "📅", R.drawable.ic_story_timer, true),
            PictureOption("u6_s5_p2_opt2", "tahun lalu", "⏮️", R.drawable.ic_book, false),
            PictureOption("u6_s5_p2_opt3", "tahun depan", "⏭️", R.drawable.ic_crown, false),
            PictureOption("u6_s5_p2_opt4", "hari ini", "☀️", R.drawable.ic_target, false)
        )
    )""",
            f"""    // 2. Soal 2: Susun Kalimat (Ayahmu tahun ini berapa umur?)
    Exercise(
        id = "u6_s5_p2_q2",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Ayahmu tahun ini berapa umur?",
        targetHanzi = "你 爸爸 今年 多大？",
        targetPinyin = "Nǐ bàba jīnnián duō dà?",
        wordChips = listOf("你:nǐ", "爸爸:bàba", "今年:jīnnián", "多大:duō dà", "妈妈:māma", "岁:suì"),
        correctAnswer = "你,爸爸,今年,多大",
        audioToSpeak = "你爸爸今年多大？"
    )""",
            f"""    // 3. Soal 3: Ketuk Pasangan yang Sesuai (Relasi Umur & Keluarga)
    Exercise(
        id = "u6_s5_p2_q3",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u6_s5_p2_m1", "你爸爸", "nǐ bàba", "ayahmu"),
            MatchPairItem("u6_s5_p2_m2", "你妈妈", "nǐ māma", "ibumu"),
            MatchPairItem("u6_s5_p2_m3", "今年多大", "jīnnián duō dà", "berapa umur tahun ini"),
            MatchPairItem("u6_s5_p2_m4", "五十岁", "wǔshí suì", "lima puluh tahun")
        )
    )""",
            f"""    // 4. Soal 4: Ketik Pinyin (tahun ini -> jīnnián)
    Exercise(
        id = "u6_s5_p2_q4",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "tahun ini",
        sentenceWithBlank = "今年 (________)",
        targetHanzi = "今年",
        targetPinyin = "jīnnián",
        correctAnswer = "jinnian",
        keyboardKeys = {k5_p2_q4_keys},
        audioToSpeak = "今年"
    )""",
            f"""    // 5. Soal 5: Mendengar Kalimat (Rule 10: illustrationRes = 0)
    Exercise(
        id = "u6_s5_p2_q5",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Apa yang Anda dengar?",
        targetTranslation = "Adik laki-laki saya berumur sepuluh tahun.",
        targetHanzi = "我 弟弟 十 岁。",
        targetPinyin = "Wǒ dìdi shí suì.",
        wordChips = listOf("我:wǒ", "弟弟:dìdi", "十:shí", "岁:suì", "哥哥:gēge", "九:jiǔ"),
        correctAnswer = "我,弟弟,十,岁",
        illustrationRes = 0,
        audioToSpeak = "我弟弟十岁。"
    )""",
            f"""    // 6. Soal 6: Pilihan Kalimat
    Exercise(
        id = "u6_s5_p2_q6",
        type = ExerciseType.SENTENCE_CHOICE,
        title = "Pilih terjemahan yang benar",
        targetHanzi = "我 妹妹 六 岁。",
        targetPinyin = "Wǒ mèimei liù suì.",
        targetTranslation = "Adik perempuan saya berumur enam tahun.",
        correctAnswer = "Wǒ mèimei liù suì.\\n我 妹妹 六 岁。",
        options = listOf(
            "Wǒ mèimei liù suì.\\n我 妹妹 六 岁。",
            "Wǒ jiějie liù suì.\\n我 姐姐 六 岁。",
            "Tā mèimei liù suì.\\n他 妹妹 六 岁。"
        ),
        audioToSpeak = "我妹妹六岁。"
    )""",
            f"""    // 7. Soal 7: Pilihan Gambar (几岁 -> berapa umur anak)
    Exercise(
        id = "u6_s5_p2_q7",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "几岁",
        targetPinyin = "jǐ suì",
        targetTranslation = "berapa umur (anak)",
        correctAnswer = "berapa umur (anak)",
        audioToSpeak = "几岁",
        pictureOptions = listOf(
            PictureOption("u6_s5_p2_opt7_1", "berapa umur (anak)", "🎂", R.drawable.ic_crown, true),
            PictureOption("u6_s5_p2_opt7_2", "berapa orang", "👥", R.drawable.ic_people_group, false),
            PictureOption("u6_s5_p2_opt7_3", "berapa jam", "⏰", R.drawable.ic_story_timer, false),
            PictureOption("u6_s5_p2_opt7_4", "berapa harga", "💰", R.drawable.ic_coin, false)
        )
    )""",
            f"""    // 8. Soal 8: Ketik Pinyin (berapa umur -> jǐsuì)
    Exercise(
        id = "u6_s5_p2_q8",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "berapa umur (anak)",
        sentenceWithBlank = "几岁 (________)",
        targetHanzi = "几岁",
        targetPinyin = "jǐsuì",
        correctAnswer = "jisui",
        keyboardKeys = {k5_p2_q8_keys},
        audioToSpeak = "几岁"
    )""",
            f"""    // 9. Soal 9: Susun Kalimat (Dia berumur delapan belas tahun.)
    Exercise(
        id = "u6_s5_p2_q9",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Dia berumur delapan belas tahun.",
        targetHanzi = "他 十八 岁。",
        targetPinyin = "Tā shíbā suì.",
        wordChips = listOf("他:tā", "十八:shíbā", "岁:suì", "我:wǒ", "二十:èrshí"),
        correctAnswer = "他,十八,岁",
        audioToSpeak = "他十八岁。"
    )""",
            f"""    // 10. Soal 10: Ketuk Pasangan yang Sesuai (Rangkuman Usia & Saudara)
    Exercise(
        id = "u6_s5_p2_m10_1",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u6_s5_p2_m10_1", "十八岁", "shíbā suì", "18 tahun"),
            MatchPairItem("u6_s5_p2_m10_2", "十岁", "shí suì", "10 tahun"),
            MatchPairItem("u6_s5_p2_m10_3", "六岁", "liù suì", "6 tahun"),
            MatchPairItem("u6_s5_p2_m10_4", "几岁", "jǐ suì", "berapa umur")
        )
    )"""
        ]
    }

    # STAGE 6: Evaluasi Komprehensif Bab 6 (Keluarga & Kehangatan Rumah)
    k6_p1_q4_keys = make_keys("jiaren")
    k6_p1_q8_keys = make_keys("fangjian")
    k6_p2_q4_keys = make_keys("zhuozi")
    k6_p2_q8_keys = make_keys("haizi")
    
    stages[6] = {
        "p1": [
            f"""    // 1. Soal 1: Pilihan Gambar (家 -> rumah / keluarga)
    Exercise(
        id = "u6_s6_p1_q1",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "家",
        targetPinyin = "jiā",
        targetTranslation = "rumah / keluarga",
        correctAnswer = "rumah / keluarga",
        audioToSpeak = "家",
        pictureOptions = listOf(
            PictureOption("u6_s6_p1_opt1", "rumah / keluarga", "🏠", R.drawable.ic_people_group, true),
            PictureOption("u6_s6_p1_opt2", "sekolah", "🏫", R.drawable.ic_cap, false),
            PictureOption("u6_s6_p1_opt3", "kamar", "🚪", R.drawable.ic_book, false),
            PictureOption("u6_s6_p1_opt4", "kursi", "🪑", R.drawable.ic_crown, false)
        )
    )""",
            f"""    // 2. Soal 2: Susun Kalimat (Keluarga saya ada lima orang.)
    Exercise(
        id = "u6_s6_p1_q2",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Keluarga saya ada lima orang.",
        targetHanzi = "我家 有 五 口 人。",
        targetPinyin = "Wǒjiā yǒu wǔ kǒu rén.",
        wordChips = listOf("我家:wǒjiā", "有:yǒu", "五:wǔ", "口:kǒu", "人:rén", "四:sì", "个:gè"),
        correctAnswer = "我家,有,五,口,人",
        audioToSpeak = "我家有五口人。"
    )""",
            f"""    // 3. Soal 3: Ketuk Pasangan yang Sesuai (Rangkuman Bab 6 Bagian 1)
    Exercise(
        id = "u6_s6_p1_q3",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u6_s6_p1_m1", "爸爸", "bàba", "ayah"),
            MatchPairItem("u6_s6_p1_m2", "妈妈", "māma", "ibu"),
            MatchPairItem("u6_s6_p1_m3", "儿子", "érzi", "anak laki-laki"),
            MatchPairItem("u6_s6_p1_m4", "女儿", "nǚ'ér", "anak perempuan")
        )
    )""",
            f"""    // 4. Soal 4: Ketik Pinyin (anggota keluarga -> jiārén)
    Exercise(
        id = "u6_s6_p1_q4",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "anggota keluarga",
        sentenceWithBlank = "家人 (________)",
        targetHanzi = "家人",
        targetPinyin = "jiārén",
        correctAnswer = "jiaren",
        keyboardKeys = {k6_p1_q4_keys},
        audioToSpeak = "家人"
    )""",
            f"""    // 5. Soal 5: Mendengar Kalimat (Rule 10: illustrationRes = 0)
    Exercise(
        id = "u6_s6_p1_q5",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Apa yang Anda dengar?",
        targetTranslation = "Saya dan keluarga tinggal di Beijing.",
        targetHanzi = "我 和 家人 住 在 北京。",
        targetPinyin = "Wǒ hé jiārén zhù zài Běijīng.",
        wordChips = listOf("我:wǒ", "和:hé", "家人:jiārén", "住:zhù", "在:zài", "北京:Běijīng"),
        correctAnswer = "我,和,家人,住,在,北京",
        illustrationRes = 0,
        audioToSpeak = "我和家人住在北京。"
    )""",
            f"""    // 6. Soal 6: Pilihan Kalimat
    Exercise(
        id = "u6_s6_p1_q6",
        type = ExerciseType.SENTENCE_CHOICE,
        title = "Pilih terjemahan yang benar",
        targetHanzi = "房间 里 有 桌子 和 椅子。",
        targetPinyin = "Fángjiān lǐ yǒu zhuōzi hé yǐzi.",
        targetTranslation = "Di dalam kamar ada meja dan kursi.",
        correctAnswer = "Fángjiān lǐ yǒu zhuōzi hé yǐzi.\\n房间 里 有 桌子 和 椅子。",
        options = listOf(
            "Fángjiān lǐ yǒu zhuōzi hé yǐzi.\\n房间 里 有 桌子 和 椅子。",
            "Jiā lǐ yǒu zhuōzi hé yǐzi.\\n家 里 有 桌子 和 椅子。",
            "Fángjiān lǐ yǒu shū hé bǐ.\\n房间 里 有 书 和 笔。"
        ),
        audioToSpeak = "房间里有桌子和椅子。"
    )""",
            f"""    // 7. Soal 7: Pilihan Gambar (房间 -> kamar)
    Exercise(
        id = "u6_s6_p1_q7",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "房间",
        targetPinyin = "fángjiān",
        targetTranslation = "kamar / ruangan",
        correctAnswer = "kamar / ruangan",
        audioToSpeak = "房间",
        pictureOptions = listOf(
            PictureOption("u6_s6_p1_opt7_1", "kamar / ruangan", "🚪", R.drawable.ic_book, true),
            PictureOption("u6_s6_p1_opt7_2", "meja", "🪵", R.drawable.ic_story_timer, false),
            PictureOption("u6_s6_p1_opt7_3", "kursi", "🪑", R.drawable.ic_crown, false),
            PictureOption("u6_s6_p1_opt7_4", "keluarga", "👨‍👩‍👧‍👦", R.drawable.ic_people_group, false)
        )
    )""",
            f"""    // 8. Soal 8: Ketik Pinyin (kamar -> fángjiān)
    Exercise(
        id = "u6_s6_p1_q8",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "kamar / ruangan",
        sentenceWithBlank = "房间 (________)",
        targetHanzi = "房间",
        targetPinyin = "fángjiān",
        correctAnswer = "fangjian",
        keyboardKeys = {k6_p1_q8_keys},
        audioToSpeak = "房间"
    )""",
            f"""    // 9. Soal 9: Susun Kalimat (Adik perempuan saya sangat cantik.)
    Exercise(
        id = "u6_s6_p1_q9",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Adik perempuan saya berumur delapan tahun.",
        targetHanzi = "我 妹妹 八 岁。",
        targetPinyin = "Wǒ mèimei bā suì.",
        wordChips = listOf("我:wǒ", "妹妹:mèimei", "八:bā", "岁:suì", "弟弟:dìdi", "九:jiǔ"),
        correctAnswer = "我,妹妹,八,岁",
        audioToSpeak = "我妹妹八岁。"
    )""",
            f"""    // 10. Soal 10: Ketuk Pasangan yang Sesuai (Rangkuman Perabot & Ruang)
    Exercise(
        id = "u6_s6_p1_m10_1",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u6_s6_p1_m10_1", "房间", "fángjiān", "kamar"),
            MatchPairItem("u6_s6_p1_m10_2", "桌子", "zhuōzi", "meja"),
            MatchPairItem("u6_s6_p1_m10_3", "椅子", "yǐzi", "kursi"),
            MatchPairItem("u6_s6_p1_m10_4", "住", "zhù", "tinggal")
        )
    )"""
        ],
        "p2": [
            f"""    // 1. Soal 1: Pilihan Gambar (桌子 -> meja)
    Exercise(
        id = "u6_s6_p2_q1",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "桌子",
        targetPinyin = "zhuōzi",
        targetTranslation = "meja",
        correctAnswer = "meja",
        audioToSpeak = "桌子",
        pictureOptions = listOf(
            PictureOption("u6_s6_p2_opt1", "meja", "🪵", R.drawable.ic_book, true),
            PictureOption("u6_s6_p2_opt2", "kursi", "🪑", R.drawable.ic_story_timer, false),
            PictureOption("u6_s6_p2_opt3", "kamar", "🚪", R.drawable.ic_target, false),
            PictureOption("u6_s6_p2_opt4", "rumah", "🏠", R.drawable.ic_people_group, false)
        )
    )""",
            f"""    // 2. Soal 2: Susun Kalimat (Kakak laki-laki saya seorang guru.)
    Exercise(
        id = "u6_s6_p2_q2",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Kakak laki-laki saya adalah seorang guru.",
        targetHanzi = "我 哥哥 是 老师。",
        targetPinyin = "Wǒ gēge shì lǎoshī.",
        wordChips = listOf("我:wǒ", "哥哥:gēge", "是:shì", "老师:lǎoshī", "学生:xuéshēng", "弟弟:dìdi"),
        correctAnswer = "我,哥哥,是,老师",
        audioToSpeak = "我哥哥是老师。"
    )""",
            f"""    // 3. Soal 3: Ketuk Pasangan yang Sesuai (Rangkuman Akhir Bab 6)
    Exercise(
        id = "u6_s6_p2_m3",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u6_s6_p2_m1", "家", "jiā", "rumah"),
            MatchPairItem("u6_s6_p2_m2", "家人", "jiārén", "keluarga"),
            MatchPairItem("u6_s6_p2_m3", "孩子", "háizi", "anak"),
            MatchPairItem("u6_s6_p2_m4", "岁", "suì", "tahun umur")
        )
    )""",
            f"""    // 4. Soal 4: Ketik Pinyin (meja -> zhuōzi)
    Exercise(
        id = "u6_s6_p2_q4",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "meja",
        sentenceWithBlank = "桌子 (________)",
        targetHanzi = "桌子",
        targetPinyin = "zhuōzi",
        correctAnswer = "zhuozi",
        keyboardKeys = {k6_p2_q4_keys},
        audioToSpeak = "桌子"
    )""",
            f"""    // 5. Soal 5: Mendengar Kalimat (Rule 10: illustrationRes = 0)
    Exercise(
        id = "u6_s6_p2_q5",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Apa yang Anda dengar?",
        targetTranslation = "Saya punya dua orang anak.",
        targetHanzi = "我 有 两 个 孩子。",
        targetPinyin = "Wǒ yǒu liǎng gè háizi.",
        wordChips = listOf("我:wǒ", "有:yǒu", "两:liǎng", "个:gè", "孩子:háizi", "三:sān"),
        correctAnswer = "我,有,两,个,孩子",
        illustrationRes = 0,
        audioToSpeak = "我有两个孩子。"
    )""",
            f"""    // 6. Soal 6: Pilihan Kalimat
    Exercise(
        id = "u6_s6_p2_q6",
        type = ExerciseType.SENTENCE_CHOICE,
        title = "Pilih terjemahan yang benar",
        targetHanzi = "他 坐 在 椅子 上。",
        targetPinyin = "Tā zuò zài yǐzi shang.",
        targetTranslation = "Dia duduk di kursi.",
        correctAnswer = "Tā zuò zài yǐzi shang.\\n他 坐 在 椅子 上。",
        options = listOf(
            "Tā zuò zài yǐzi shang.\\n他 坐 在 椅子 上。",
            "Wǒ zuò zài yǐzi shang.\\n我 坐 在 椅子 上。",
            "Tā zuò zài zhuōzi shang.\\n他 坐 在 桌子 上。"
        ),
        audioToSpeak = "他坐在椅子上。"
    )""",
            f"""    // 7. Soal 7: Pilihan Gambar (孩子 -> anak)
    Exercise(
        id = "u6_s6_p2_q7",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "孩子",
        targetPinyin = "háizi",
        targetTranslation = "anak",
        correctAnswer = "anak",
        audioToSpeak = "孩子",
        pictureOptions = listOf(
            PictureOption("u6_s6_p2_opt7_1", "anak", "🧒", R.drawable.ic_person_murid, true),
            PictureOption("u6_s6_p2_opt7_2", "guru", "👨‍🏫", R.drawable.ic_person_guru, false),
            PictureOption("u6_s6_p2_opt7_3", "ibu", "👩", R.drawable.ic_person_saya, false),
            PictureOption("u6_s6_p2_opt7_4", "rumah", "🏠", R.drawable.ic_people_group, false)
        )
    )""",
            f"""    // 8. Soal 8: Ketik Pinyin (anak -> háizi)
    Exercise(
        id = "u6_s6_p2_q8",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "anak",
        sentenceWithBlank = "孩子 (________)",
        targetHanzi = "孩子",
        targetPinyin = "háizi",
        correctAnswer = "haizi",
        keyboardKeys = {k6_p2_q8_keys},
        audioToSpeak = "孩子"
    )""",
            f"""    // 9. Soal 9: Susun Kalimat (Grand Evaluasi Bab 6)
    Exercise(
        id = "u6_s6_p2_q9",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Keluarga saya tinggal di Beijing.",
        targetHanzi = "我 家人 住 在 北京。",
        targetPinyin = "Wǒ jiārén zhù zài Běijīng.",
        wordChips = listOf("我:wǒ", "家人:jiārén", "住:zhù", "在:zài", "北京:Běijīng", "学校:xuéxiào"),
        correctAnswer = "我,家人,住,在,北京",
        audioToSpeak = "我家人住在北京。"
    )""",
            f"""    // 10. Soal 10: Ketuk Pasangan yang Sesuai (Grand Review Bab 6)
    Exercise(
        id = "u6_s6_p2_m10_1",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u6_s6_p2_m10_1", "住在北京", "zhù zài Běijīng", "tinggal di Beijing"),
            MatchPairItem("u6_s6_p2_m10_2", "桌子和椅子", "zhuōzi hé yǐzi", "meja dan kursi"),
            MatchPairItem("u6_s6_p2_m10_3", "四口人", "sì kǒu rén", "empat orang"),
            MatchPairItem("u6_s6_p2_m10_4", "爱家人", "ài jiārén", "sayang keluarga")
        )
    )"""
        ]
    }

    for s_idx in range(1, 7):
        filename = f"{base_dir}/Bab6Stage{s_idx}Data.kt"
        p1_code = ",\n\n".join(stages[s_idx]["p1"])
        p2_code = ",\n\n".join(stages[s_idx]["p2"])
        
        content = f"""package com.example.chineselearning.data.repository

import com.example.chineselearning.R
import com.example.chineselearning.data.model.Exercise
import com.example.chineselearning.data.model.ExerciseType
import com.example.chineselearning.data.model.MatchPairItem
import com.example.chineselearning.data.model.PictureOption

val bab6Stage{s_idx}Part1Exercises = listOf(
{p1_code}
)

val bab6Stage{s_idx}Part2Exercises = listOf(
{p2_code}
)
"""
        with open(filename, "w", encoding="utf-8") as f:
            f.write(content)
        print(f"Written {filename}")

if __name__ == "__main__":
    generate_bab6()
