package com.example.chineselearning.data.repository

import com.example.chineselearning.R
import com.example.chineselearning.data.model.Exercise
import com.example.chineselearning.data.model.ExerciseType
import com.example.chineselearning.data.model.MatchPairItem
import com.example.chineselearning.data.model.PictureOption

val bab18Stage5Part1Exercises = listOf(
    // 1. Soal 1: Pilihan Gambar (裤子 -> celana)
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
    ),

    // 2. Soal 2: Susun Kalimat (Gadis itu memakai celana putih.)
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
    ),

    // 3. Soal 3: Ketuk Pasangan yang Sesuai (Sintesis Busana & Warna)
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
    ),

    // 4. Soal 4: Ketik Pinyin (celana -> kùzi)
    Exercise(
        id = "u18_s5_p1_q4",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "celana",
        sentenceWithBlank = "裤子 (________)",
        targetHanzi = "裤子",
        targetPinyin = "kùzi",
        correctAnswer = "kuzi",
        keyboardKeys = listOf("k", "u", "z", "i", "a", "e", "o", "b", "d", "g", "h", "j"),
        audioToSpeak = "裤子"
    ),

    // 5. Soal 5: Mendengar Kalimat (Rule 10: illustrationRes = 0)
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
    ),

    // 6. Soal 6: Pilihan Kalimat
    Exercise(
        id = "u18_s5_p1_q6",
        type = ExerciseType.SENTENCE_CHOICE,
        title = "Pilih terjemahan yang benar",
        targetHanzi = "他 的 个子 很 高， 头发 很 长。",
        targetPinyin = "Tā de gèzi hěn gāo, tóufa hěn cháng.",
        targetTranslation = "Tinggi badannya sangat tinggi, rambutnya sangat panjang.",
        correctAnswer = "Tā de gèzi hěn gāo, tóufa hěn cháng.\n他 的 个子 很 高， 头发 很 长。",
        options = listOf(
            "Tā de gèzi hěn gāo, tóufa hěn cháng.\n他 的 个子 很 高， 头发 很 长。",
            "Tā de gèzi bú gāo, tóufa hěn duǎn.\n他 的 个子 不 高， 头发 很 短。",
            "Wǒ de gèzi hěn gāo, tóufa hěn cháng.\n我 的 个子 很 高， 头发 很 长。"
        ),
        audioToSpeak = "他的个子很高，头发很长。"
    ),

    // 7. Soal 7: Pilihan Gambar (红色 -> warna merah)
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
    ),

    // 8. Soal 8: Ketik Pinyin (warna merah -> hóngsè)
    Exercise(
        id = "u18_s5_p1_q8",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "warna merah",
        sentenceWithBlank = "红色 (________)",
        targetHanzi = "红色",
        targetPinyin = "hóngsè",
        correctAnswer = "hongse",
        keyboardKeys = listOf("h", "o", "n", "g", "s", "e", "a", "i", "u", "b", "d", "j"),
        audioToSpeak = "红色"
    ),

    // 9. Soal 9: Susun Kalimat (Mata anak laki-laki itu sangat besar.)
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
    ),

    // 10. Soal 10: Ketuk Pasangan yang Sesuai (Rangkuman Sintesis 1)
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
    )
)

val bab18Stage5Part2Exercises = listOf(
    // 1. Soal 1: Pilihan Gambar (手表 -> jam tangan)
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
    ),

    // 2. Soal 2: Susun Kalimat (Dia mencuci tangan lalu memakai jam tangan.)
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
    ),

    // 3. Soal 3: Ketuk Pasangan yang Sesuai (Grand Sintesis Bab 18)
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
    ),

    // 4. Soal 4: Ketik Pinyin (postur tubuh -> gèzi)
    Exercise(
        id = "u18_s5_p2_q4",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "postur / tinggi badan",
        sentenceWithBlank = "个子 (________)",
        targetHanzi = "个子",
        targetPinyin = "gèzi",
        correctAnswer = "gezi",
        keyboardKeys = listOf("g", "e", "z", "i", "a", "o", "u", "b", "d", "h", "j", "l"),
        audioToSpeak = "个子"
    ),

    // 5. Soal 5: Mendengar Kalimat (Rule 10: illustrationRes = 0)
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
    ),

    // 6. Soal 6: Pilihan Kalimat
    Exercise(
        id = "u18_s5_p2_q6",
        type = ExerciseType.SENTENCE_CHOICE,
        title = "Pilih terjemahan yang benar",
        targetHanzi = "这 条 绿色 的 裤子 太 长 了。",
        targetPinyin = "Zhè tiáo lǜsè de kùzi tài cháng le.",
        targetTranslation = "Celana hijau ini terlalu panjang.",
        correctAnswer = "Zhè tiáo lǜsè de kùzi tài cháng le.\n这 条 绿色 的 裤子 太 长 了。",
        options = listOf(
            "Zhè tiáo lǜsè de kùzi tài cháng le.\n这 条 绿色 的 裤子 太 长 了。",
            "Zhè tiáo hēisè de kùzi tài cháng le.\n这 条 黑色 的 裤子 太 长 了。",
            "Zhè tiáo lǜsè de kùzi tài duǎn le.\n这 条 绿色 的 裤子 太 短 了。"
        ),
        audioToSpeak = "这条绿色的裤子太长了。"
    ),

    // 7. Soal 7: Pilihan Gambar (包 -> tas)
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
    ),

    // 8. Soal 8: Ketik Pinyin (jam tangan -> shǒubiǎo)
    Exercise(
        id = "u18_s5_p2_q8",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "jam tangan",
        sentenceWithBlank = "手表 (________)",
        targetHanzi = "手表",
        targetPinyin = "shǒubiǎo",
        correctAnswer = "shoubiao",
        keyboardKeys = listOf("s", "h", "o", "u", "b", "i", "a", "e", "d", "g", "j", "l"),
        audioToSpeak = "手表"
    ),

    // 9. Soal 9: Susun Kalimat (Semua orang suka pakaian warna indah.)
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
    ),

    // 10. Soal 10: Ketuk Pasangan yang Sesuai (Grand Review Final Bab 18)
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
    )
)
