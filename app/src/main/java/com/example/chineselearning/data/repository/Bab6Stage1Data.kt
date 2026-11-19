package com.example.chineselearning.data.repository

import com.example.chineselearning.R
import com.example.chineselearning.data.model.Exercise
import com.example.chineselearning.data.model.ExerciseType
import com.example.chineselearning.data.model.MatchPairItem
import com.example.chineselearning.data.model.PictureOption

val bab6Stage1Part1Exercises = listOf(
    // 1. Soal 1: Pilihan Gambar (爸爸 -> ayah)
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
    ),

    // 2. Soal 2: Susun Kalimat (Ini adalah ayah saya.)
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
    ),

    // 3. Soal 3: Ketuk Pasangan yang Sesuai (Keluarga Inti)
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
    ),

    // 4. Soal 4: Ketik Pinyin (ayah -> bàba)
    Exercise(
        id = "u6_s1_p1_q4",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "ayah",
        sentenceWithBlank = "爸爸 (________)",
        targetHanzi = "爸爸",
        targetPinyin = "bàba",
        correctAnswer = "baba",
        keyboardKeys = listOf("b", "a", "e", "i", "o", "u", "d", "g", "h", "j", "l"),
        audioToSpeak = "爸爸"
    ),

    // 5. Soal 5: Mendengar Kalimat (Rule 10: illustrationRes = 0)
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
    ),

    // 6. Soal 6: Pilihan Kalimat
    Exercise(
        id = "u6_s1_p1_q6",
        type = ExerciseType.SENTENCE_CHOICE,
        title = "Pilih terjemahan yang benar",
        targetHanzi = "他 是 我 哥哥。",
        targetPinyin = "Tā shì wǒ gēge.",
        targetTranslation = "Dia adalah kakak laki-laki saya.",
        correctAnswer = "Tā shì wǒ gēge.\n他 是 我 哥哥。",
        options = listOf(
            "Tā shì wǒ gēge.\n他 是 我 哥哥。",
            "Tā shì wǒ dìdi.\n他 是 我 弟弟。",
            "Tā shì wǒ bàba.\n他 是 我 爸爸。"
        ),
        audioToSpeak = "他是我哥哥。"
    ),

    // 7. Soal 7: Pilihan Gambar (妈妈 -> ibu)
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
    ),

    // 8. Soal 8: Ketik Pinyin (kakak laki-laki -> gēge)
    Exercise(
        id = "u6_s1_p1_q8",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "kakak laki-laki",
        sentenceWithBlank = "哥哥 (________)",
        targetHanzi = "哥哥",
        targetPinyin = "gēge",
        correctAnswer = "gege",
        keyboardKeys = listOf("g", "e", "a", "i", "o", "u", "b", "d", "h", "j", "l"),
        audioToSpeak = "哥哥"
    ),

    // 9. Soal 9: Susun Kalimat (Itu adalah kakak perempuan saya.)
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
    ),

    // 10. Soal 10: Ketuk Pasangan yang Sesuai (Rangkuman Saudara Kandung)
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
    )
)

val bab6Stage1Part2Exercises = listOf(
    // 1. Soal 1: Pilihan Gambar (弟弟 -> adik laki-laki)
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
    ),

    // 2. Soal 2: Susun Kalimat (Saya punya seorang adik perempuan.)
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
    ),

    // 3. Soal 3: Ketuk Pasangan yang Sesuai (Adik Laki-laki & Perempuan)
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
    ),

    // 4. Soal 4: Ketik Pinyin (adik laki-laki -> dìdi)
    Exercise(
        id = "u6_s1_p2_q4",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "adik laki-laki",
        sentenceWithBlank = "弟弟 (________)",
        targetHanzi = "弟弟",
        targetPinyin = "dìdi",
        correctAnswer = "didi",
        keyboardKeys = listOf("d", "i", "a", "e", "o", "u", "b", "g", "h", "j", "l"),
        audioToSpeak = "弟弟"
    ),

    // 5. Soal 5: Mendengar Kalimat (Rule 10: illustrationRes = 0)
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
    ),

    // 6. Soal 6: Pilihan Kalimat
    Exercise(
        id = "u6_s1_p2_q6",
        type = ExerciseType.SENTENCE_CHOICE,
        title = "Pilih terjemahan yang benar",
        targetHanzi = "我 没有 妹妹。",
        targetPinyin = "Wǒ méiyǒu mèimei.",
        targetTranslation = "Saya tidak punya adik perempuan.",
        correctAnswer = "Wǒ méiyǒu mèimei.\n我 没有 妹妹。",
        options = listOf(
            "Wǒ méiyǒu mèimei.\n我 没有 妹妹。",
            "Wǒ yǒu mèimei.\n我 有 妹妹。",
            "Wǒ méiyǒu dìdi.\n我 没有 弟弟。"
        ),
        audioToSpeak = "我没有妹妹。"
    ),

    // 7. Soal 7: Pilihan Gambar (妹妹 -> adik perempuan)
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
    ),

    // 8. Soal 8: Ketik Pinyin (adik perempuan -> mèimei)
    Exercise(
        id = "u6_s1_p2_q8",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "adik perempuan",
        sentenceWithBlank = "妹妹 (________)",
        targetHanzi = "妹妹",
        targetPinyin = "mèimei",
        correctAnswer = "meimei",
        keyboardKeys = listOf("m", "e", "i", "a", "o", "u", "b", "d", "g", "h", "j"),
        audioToSpeak = "妹妹"
    ),

    // 9. Soal 9: Susun Kalimat (Dia punya dua adik laki-laki.)
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
    ),

    // 10. Soal 10: Ketuk Pasangan yang Sesuai (Rangkuman Lengkap Saudara)
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
    )
)
