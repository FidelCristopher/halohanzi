package com.example.chineselearning.data.repository

import com.example.chineselearning.R
import com.example.chineselearning.data.model.Exercise
import com.example.chineselearning.data.model.ExerciseType
import com.example.chineselearning.data.model.MatchPairItem
import com.example.chineselearning.data.model.PictureOption

val bab18Stage1Part1Exercises = listOf(
    // 1. Soal 1: Pilihan Gambar (红色 -> warna merah)
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
    ),

    // 2. Soal 2: Susun Kalimat (Kamu suka warna apa?)
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
    ),

    // 3. Soal 3: Ketuk Pasangan yang Sesuai (Warna & Merah Putih)
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
    ),

    // 4. Soal 4: Ketik Pinyin (warna -> yánsè)
    Exercise(
        id = "u18_s1_p1_q4",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "warna",
        sentenceWithBlank = "颜色 (________)",
        targetHanzi = "颜色",
        targetPinyin = "yánsè",
        correctAnswer = "yanse",
        keyboardKeys = listOf("y", "a", "n", "s", "e", "i", "o", "u", "b", "d", "g", "h"),
        audioToSpeak = "颜色"
    ),

    // 5. Soal 5: Mendengar Kalimat (Rule 10: illustrationRes = 0)
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
    ),

    // 6. Soal 6: Pilihan Kalimat
    Exercise(
        id = "u18_s1_p1_q6",
        type = ExerciseType.SENTENCE_CHOICE,
        title = "Pilih terjemahan yang benar",
        targetHanzi = "那 辆 白色 的 车 很 漂亮。",
        targetPinyin = "Nà liàng báisè de chē hěn piàoliang.",
        targetTranslation = "Mobil berwarna putih itu sangat indah.",
        correctAnswer = "Nà liàng báisè de chē hěn piàoliang.\n那 辆 白色 的 车 很 漂亮。",
        options = listOf(
            "Nà liàng báisè de chē hěn piàoliang.\n那 辆 白色 的 车 很 漂亮。",
            "Nà liàng hēisè de chē hěn piàoliang.\n那 辆 黑色 的 车 很 漂亮。",
            "Zhè liàng báisè de chē hěn piàoliang.\n这 辆 白色 的 车 很 漂亮。"
        ),
        audioToSpeak = "那辆白色的车很漂亮。"
    ),

    // 7. Soal 7: Pilihan Gambar (白色 -> warna putih)
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
    ),

    // 8. Soal 8: Ketik Pinyin (warna merah -> hóngsè)
    Exercise(
        id = "u18_s1_p1_q8",
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

    // 9. Soal 9: Susun Kalimat (Saya paling suka warna putih.)
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
    ),

    // 10. Soal 10: Ketuk Pasangan yang Sesuai (Rangkuman Warna 1)
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
    )
)

val bab18Stage1Part2Exercises = listOf(
    // 1. Soal 1: Pilihan Gambar (黑色 -> warna hitam)
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
    ),

    // 2. Soal 2: Susun Kalimat (Dia mengenakan jam tangan hitam.)
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
    ),

    // 3. Soal 3: Ketuk Pasangan yang Sesuai (Hitam & Hijau)
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
    ),

    // 4. Soal 4: Ketik Pinyin (warna hitam -> hēisè)
    Exercise(
        id = "u18_s1_p2_q4",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "warna hitam",
        sentenceWithBlank = "黑色 (________)",
        targetHanzi = "黑色",
        targetPinyin = "hēisè",
        correctAnswer = "heise",
        keyboardKeys = listOf("h", "e", "i", "s", "a", "o", "u", "b", "d", "g", "j", "l"),
        audioToSpeak = "黑色"
    ),

    // 5. Soal 5: Mendengar Kalimat (Rule 10: illustrationRes = 0)
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
    ),

    // 6. Soal 6: Pilihan Kalimat
    Exercise(
        id = "u18_s1_p2_q6",
        type = ExerciseType.SENTENCE_CHOICE,
        title = "Pilih terjemahan yang benar",
        targetHanzi = "这 条 黑色 的 裤子 很 便宜。",
        targetPinyin = "Zhè tiáo hēisè de kùzi hěn piányi.",
        targetTranslation = "Celana hitam ini sangat murah.",
        correctAnswer = "Zhè tiáo hēisè de kùzi hěn piányi.\n这 条 黑色 的 裤子 很 便宜。",
        options = listOf(
            "Zhè tiáo hēisè de kùzi hěn piányi.\n这 条 黑色 的 裤子 很 便宜。",
            "Zhè tiáo báisè de kùzi hěn piányi.\n这 条 白色 的 裤子 很 便宜。",
            "Zhè tiáo hēisè de kùzi hěn guì.\n这 条 黑色 的 裤子 很 贵。"
        ),
        audioToSpeak = "这条黑色的裤子很便宜。"
    ),

    // 7. Soal 7: Pilihan Gambar (绿色 -> warna hijau)
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
    ),

    // 8. Soal 8: Ketik Pinyin (warna hijau -> lǜsè)
    Exercise(
        id = "u18_s1_p2_q8",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "warna hijau",
        sentenceWithBlank = "绿色 (________)",
        targetHanzi = "绿色",
        targetPinyin = "lǜsè",
        correctAnswer = "lvse",
        keyboardKeys = listOf("l", "v", "s", "e", "a", "i", "o", "u", "b", "d", "g", "h"),
        audioToSpeak = "绿色"
    ),

    // 9. Soal 9: Susun Kalimat (Ibu menyukai teh hijau.)
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
    ),

    // 10. Soal 10: Ketuk Pasangan yang Sesuai (Rangkuman Warna Lengkap)
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
    )
)
