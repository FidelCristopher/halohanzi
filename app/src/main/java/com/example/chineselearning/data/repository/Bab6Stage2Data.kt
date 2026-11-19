package com.example.chineselearning.data.repository

import com.example.chineselearning.R
import com.example.chineselearning.data.model.Exercise
import com.example.chineselearning.data.model.ExerciseType
import com.example.chineselearning.data.model.MatchPairItem
import com.example.chineselearning.data.model.PictureOption

val bab6Stage2Part1Exercises = listOf(
    // 1. Soal 1: Pilihan Gambar (儿子 -> anak laki-laki)
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
    ),

    // 2. Soal 2: Susun Kalimat (Dia adalah anak laki-laki saya.)
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
    ),

    // 3. Soal 3: Ketuk Pasangan yang Sesuai (Anak Laki & Perempuan)
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
    ),

    // 4. Soal 4: Ketik Pinyin (anak laki-laki -> érzi)
    Exercise(
        id = "u6_s2_p1_q4",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "anak laki-laki",
        sentenceWithBlank = "儿子 (________)",
        targetHanzi = "儿子",
        targetPinyin = "érzi",
        correctAnswer = "erzi",
        keyboardKeys = listOf("e", "r", "z", "i", "a", "o", "u", "b", "d", "g", "h"),
        audioToSpeak = "儿子"
    ),

    // 5. Soal 5: Mendengar Kalimat (Rule 10: illustrationRes = 0)
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
    ),

    // 6. Soal 6: Pilihan Kalimat
    Exercise(
        id = "u6_s2_p1_q6",
        type = ExerciseType.SENTENCE_CHOICE,
        title = "Pilih terjemahan yang benar",
        targetHanzi = "我有 一个 儿子。",
        targetPinyin = "Wǒyǒu yí gè érzi.",
        targetTranslation = "Saya punya seorang anak laki-laki.",
        correctAnswer = "Wǒyǒu yí gè érzi.\n我有 一个 儿子。",
        options = listOf(
            "Wǒyǒu yí gè érzi.\n我有 一个 儿子。",
            "Wǒyǒu yí gè nǚ'ér.\n我有 一个 女儿。",
            "Tāyǒu yí gè érzi.\n他有 一个 儿子。"
        ),
        audioToSpeak = "我有一个儿子。"
    ),

    // 7. Soal 7: Pilihan Gambar (女儿 -> anak perempuan)
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
    ),

    // 8. Soal 8: Ketik Pinyin (anak perempuan -> nǚ'ér)
    Exercise(
        id = "u6_s2_p1_q8",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "anak perempuan",
        sentenceWithBlank = "女儿 (________)",
        targetHanzi = "女儿",
        targetPinyin = "nǚ'ér",
        correctAnswer = "nver",
        keyboardKeys = listOf("n", "v", "e", "r", "a", "i", "o", "u", "b", "d", "g"),
        audioToSpeak = "女儿"
    ),

    // 9. Soal 9: Susun Kalimat (Guru Wang punya seorang anak perempuan.)
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
    ),

    // 10. Soal 10: Ketuk Pasangan yang Sesuai (Rangkuman Anak)
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
    )
)

val bab6Stage2Part2Exercises = listOf(
    // 1. Soal 1: Pilihan Gambar (孩子 -> anak / anak-anak)
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
    ),

    // 2. Soal 2: Susun Kalimat (Keluarga saya ada empat orang.)
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
    ),

    // 3. Soal 3: Ketuk Pasangan yang Sesuai (Satuan Anggota Keluarga)
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
    ),

    // 4. Soal 4: Ketik Pinyin (anak -> háizi)
    Exercise(
        id = "u6_s2_p2_q4",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "anak",
        sentenceWithBlank = "孩子 (________)",
        targetHanzi = "孩子",
        targetPinyin = "háizi",
        correctAnswer = "haizi",
        keyboardKeys = listOf("h", "a", "i", "z", "e", "o", "u", "b", "d", "g", "j"),
        audioToSpeak = "孩子"
    ),

    // 5. Soal 5: Mendengar Kalimat (Rule 10: illustrationRes = 0)
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
    ),

    // 6. Soal 6: Pilihan Kalimat
    Exercise(
        id = "u6_s2_p2_q6",
        type = ExerciseType.SENTENCE_CHOICE,
        title = "Pilih terjemahan yang benar",
        targetHanzi = "你家 有 几 口 人？",
        targetPinyin = "Nǐjiā yǒu jǐ kǒu rén?",
        targetTranslation = "Keluargamu ada berapa orang?",
        correctAnswer = "Nǐjiā yǒu jǐ kǒu rén?\n你家 有 几 口 人？",
        options = listOf(
            "Nǐjiā yǒu jǐ kǒu rén?\n你家 有 几 口 人？",
            "Tājiā yǒu jǐ kǒu rén?\n他家 有 几 口 人？",
            "Nǐjiā yǒu jǐ gè háizi?\n你家 有 几 个 孩子？"
        ),
        audioToSpeak = "你家有几口人？"
    ),

    // 7. Soal 7: Pilihan Gambar (口 -> satuan orang keluarga)
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
    ),

    // 8. Soal 8: Ketik Pinyin (satuan keluarga -> kǒu)
    Exercise(
        id = "u6_s2_p2_q8",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "satuan keluarga / mulut",
        sentenceWithBlank = "口 (________)",
        targetHanzi = "口",
        targetPinyin = "kǒu",
        correctAnswer = "kou",
        keyboardKeys = listOf("k", "o", "u", "a", "e", "i", "b", "d", "g", "h", "j"),
        audioToSpeak = "口"
    ),

    // 9. Soal 9: Susun Kalimat (Halo anak-anak kecil!)
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
    ),

    // 10. Soal 10: Ketuk Pasangan yang Sesuai (Rangkuman Anggota Keluarga)
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
    )
)
