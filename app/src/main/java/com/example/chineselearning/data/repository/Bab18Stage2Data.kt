package com.example.chineselearning.data.repository

import com.example.chineselearning.R
import com.example.chineselearning.data.model.Exercise
import com.example.chineselearning.data.model.ExerciseType
import com.example.chineselearning.data.model.MatchPairItem
import com.example.chineselearning.data.model.PictureOption

val bab18Stage2Part1Exercises = listOf(
    // 1. Soal 1: Pilihan Gambar (裤子 -> celana)
    Exercise(
        id = "u18_s2_p1_q1",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "裤子",
        targetPinyin = "kùzi",
        targetTranslation = "celana",
        correctAnswer = "celana",
        audioToSpeak = "裤子",
        pictureOptions = listOf(
            PictureOption("u18_s2_p1_opt1", "celana", "", R.drawable.ic_cloth_pants, true),
            PictureOption("u18_s2_p1_opt2", "baju", "", R.drawable.ic_shop_clothes, false),
            PictureOption("u18_s2_p1_opt3", "jam tangan", "", R.drawable.ic_acc_wristwatch, false),
            PictureOption("u18_s2_p1_opt4", "tas", "", R.drawable.ic_cloth_bag, false)
        )
    ),

    // 2. Soal 2: Susun Kalimat (Saya ingin membeli sehelai celana baru.)
    Exercise(
        id = "u18_s2_p1_q2",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Saya mau beli celana baru.",
        targetHanzi = "我 想 买 一 条 新 裤子。",
        targetPinyin = "Wǒ xiǎng mǎi yì tiáo xīn kùzi.",
        wordChips = listOf("我:wǒ", "想:xiǎng", "买:mǎi", "一:yì", "条:tiáo", "新:xīn", "裤子。:kùzi.", "件:jiàn"),
        correctAnswer = "我,想,买,一,条,新,裤子。",
        audioToSpeak = "我想买一条新裤子。"
    ),

    // 3. Soal 3: Ketuk Pasangan yang Sesuai (Celana & Kata Penggolong 条)
    Exercise(
        id = "u18_s2_p1_q3",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u18_s2_p1_m1", "裤子", "kùzi", "celana"),
            MatchPairItem("u18_s2_p1_m2", "条", "tiáo", "helai / lembar (panjang)"),
            MatchPairItem("u18_s2_p1_m3", "新", "xīn", "baru"),
            MatchPairItem("u18_s2_p1_m4", "想买", "xiǎng mǎi", "ingin beli")
        )
    ),

    // 4. Soal 4: Ketik Pinyin (celana -> kùzi)
    Exercise(
        id = "u18_s2_p1_q4",
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
        id = "u18_s2_p1_q5",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Apa yang Anda dengar?",
        targetTranslation = "Celana ini terlalu panjang.",
        targetHanzi = "这 条 裤子 太 长 了。",
        targetPinyin = "Zhè tiáo kùzi tài cháng le.",
        wordChips = listOf("这:zhè", "条:tiáo", "裤子:kùzi", "太:tài", "长:cháng", "了。:le.", "短:duǎn"),
        correctAnswer = "这,条,裤子,太,长,了。",
        illustrationRes = 0,
        audioToSpeak = "这条裤子太长了。"
    ),

    // 6. Soal 6: Pilihan Kalimat
    Exercise(
        id = "u18_s2_p1_q6",
        type = ExerciseType.SENTENCE_CHOICE,
        title = "Pilih terjemahan yang benar",
        targetHanzi = "他 穿 着 一 条 黑色 裤子。",
        targetPinyin = "Tā chuān zhe yì tiáo hēisè kùzi.",
        targetTranslation = "Dia sedang memakai sehelai celana hitam.",
        correctAnswer = "Tā chuān zhe yì tiáo hēisè kùzi.\n他 穿 着 一 条 黑色 裤子。",
        options = listOf(
            "Tā chuān zhe yì tiáo hēisè kùzi.\n他 穿 着 一 条 黑色 裤子。",
            "Tā chuān zhe yì tiáo báisè kùzi.\n他 穿 着 一 条 白色 裤子。",
            "Wǒ chuān zhe yì tiáo hēisè kùzi.\n我 穿 着 一 条 黑色 裤子。"
        ),
        audioToSpeak = "他穿着一条黑色裤子。"
    ),

    // 7. Soal 7: Pilihan Gambar (条 -> penggolong celana/panjang)
    Exercise(
        id = "u18_s2_p1_q7",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "条",
        targetPinyin = "tiáo",
        targetTranslation = "helai (benda panjang)",
        correctAnswer = "helai (benda panjang)",
        audioToSpeak = "条",
        pictureOptions = listOf(
            PictureOption("u18_s2_p1_opt7_1", "helai celana", "", R.drawable.ic_cloth_pants, true),
            PictureOption("u18_s2_p1_opt7_2", "baju", "", R.drawable.ic_shop_clothes, false),
            PictureOption("u18_s2_p1_opt7_3", "jam tangan", "", R.drawable.ic_acc_wristwatch, false),
            PictureOption("u18_s2_p1_opt7_4", "tas", "", R.drawable.ic_cloth_bag, false)
        )
    ),

    // 8. Soal 8: Ketik Pinyin (penggolong helai -> tiáo)
    Exercise(
        id = "u18_s2_p1_q8",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "helai / lembar (panjang)",
        sentenceWithBlank = "条 (________)",
        targetHanzi = "条",
        targetPinyin = "tiáo",
        correctAnswer = "tiao",
        keyboardKeys = listOf("t", "i", "a", "o", "e", "u", "b", "d", "g", "h", "j", "l"),
        audioToSpeak = "条"
    ),

    // 9. Soal 9: Susun Kalimat (Dua helai celana ini sangat pas.)
    Exercise(
        id = "u18_s2_p1_q9",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Dua celana ini sangat bagus.",
        targetHanzi = "这两 条 裤子 都 很 好。",
        targetPinyin = "Zhè liǎng tiáo kùzi dōu hěn hǎo.",
        wordChips = listOf("这两:zhè liǎng", "条:tiáo", "裤子:kùzi", "都:dōu", "很:hěn", "好。:hǎo.", "衣服:yīfu"),
        correctAnswer = "这两,条,裤子,都,很,好。",
        audioToSpeak = "这两条裤子都很好。"
    ),

    // 10. Soal 10: Ketuk Pasangan yang Sesuai (Rangkuman Celana & Ukuran)
    Exercise(
        id = "u18_s2_p1_m10",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u18_s2_p1_m10_1", "裤子", "kùzi", "celana"),
            MatchPairItem("u18_s2_p1_m10_2", "两条", "liǎng tiáo", "dua helai"),
            MatchPairItem("u18_s2_p1_m10_3", "太长", "tài cháng", "terlalu panjang"),
            MatchPairItem("u18_s2_p1_m10_4", "穿着", "chuān zhe", "sedang memakai")
        )
    )
)

val bab18Stage2Part2Exercises = listOf(
    // 1. Soal 1: Pilihan Gambar (包 -> tas)
    Exercise(
        id = "u18_s2_p2_q1",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "包",
        targetPinyin = "bāo",
        targetTranslation = "tas",
        correctAnswer = "tas",
        audioToSpeak = "包",
        pictureOptions = listOf(
            PictureOption("u18_s2_p2_opt1", "tas", "", R.drawable.ic_cloth_bag, true),
            PictureOption("u18_s2_p2_opt2", "jam tangan", "", R.drawable.ic_acc_wristwatch, false),
            PictureOption("u18_s2_p2_opt3", "celana", "", R.drawable.ic_cloth_pants, false),
            PictureOption("u18_s2_p2_opt4", "baju", "", R.drawable.ic_shop_clothes, false)
        )
    ),

    // 2. Soal 2: Susun Kalimat (Tas warna merah ini milik siapa?)
    Exercise(
        id = "u18_s2_p2_q2",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Tas merah ini milik siapa?",
        targetHanzi = "这个 红色 的 包 是 谁 的？",
        targetPinyin = "Zhège hóngsè de bāo shì shéi de?",
        wordChips = listOf("这个:zhège", "红色:hóngsè", "的:de", "包:bāo", "是:shì", "谁:shéi", "的？:de?", "黑色:hēisè"),
        correctAnswer = "这个,红色,的,包,是,谁,的？",
        audioToSpeak = "这个红色的包是谁的？"
    ),

    // 3. Soal 3: Ketuk Pasangan yang Sesuai (Tas & Jam Tangan)
    Exercise(
        id = "u18_s2_p2_m3",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u18_s2_p2_m1", "包", "bāo", "tas / ransel"),
            MatchPairItem("u18_s2_p2_m2", "手表", "shǒubiǎo", "jam tangan"),
            MatchPairItem("u18_s2_p2_m3", "太贵", "tài guì", "terlalu mahal"),
            MatchPairItem("u18_s2_p2_m4", "好看", "hǎokàn", "bagus dilihat")
        )
    ),

    // 4. Soal 4: Ketik Pinyin (tas -> bāo)
    Exercise(
        id = "u18_s2_p2_q4",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "tas",
        sentenceWithBlank = "包 (________)",
        targetHanzi = "包",
        targetPinyin = "bāo",
        correctAnswer = "bao",
        keyboardKeys = listOf("b", "a", "o", "e", "i", "u", "d", "g", "h", "j", "l", "m"),
        audioToSpeak = "包"
    ),

    // 5. Soal 5: Mendengar Kalimat (Rule 10: illustrationRes = 0)
    Exercise(
        id = "u18_s2_p2_q5",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Apa yang Anda dengar?",
        targetTranslation = "Jam tangan ini terlalu mahal.",
        targetHanzi = "这 块 手表 太 贵 了。",
        targetPinyin = "Zhè kuài shǒubiǎo tài guì le.",
        wordChips = listOf("这:zhè", "块:kuài", "手表:shǒubiǎo", "太:tài", "贵:guì", "了。:le.", "便宜:piányi"),
        correctAnswer = "这,块,手表,太,贵,了。",
        illustrationRes = 0,
        audioToSpeak = "这块手表太贵了。"
    ),

    // 6. Soal 6: Pilihan Kalimat
    Exercise(
        id = "u18_s2_p2_q6",
        type = ExerciseType.SENTENCE_CHOICE,
        title = "Pilih terjemahan yang benar",
        targetHanzi = "我 想 买 一 个 新 书包。",
        targetPinyin = "Wǒ xiǎng mǎi yí gè xīn shūbāo.",
        targetTranslation = "Saya ingin membeli sebuah tas sekolah baru.",
        correctAnswer = "Wǒ xiǎng mǎi yí gè xīn shūbāo.\n我 想 买 一 个 新 书包。",
        options = listOf(
            "Wǒ xiǎng mǎi yí gè xīn shūbāo.\n我 想 买 一 个 新 书包。",
            "Wǒ xiǎng mǎi yí kuài xīn shǒubiǎo.\n我 想 买 一 块 新 手表。",
            "Tā xiǎng mǎi yí gè xīn shūbāo.\n他 想 买 一 个 新 书包。"
        ),
        audioToSpeak = "我想买一个新的书包。"
    ),

    // 7. Soal 7: Pilihan Gambar (手表 -> jam tangan)
    Exercise(
        id = "u18_s2_p2_q7",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "手表",
        targetPinyin = "shǒubiǎo",
        targetTranslation = "jam tangan",
        correctAnswer = "jam tangan",
        audioToSpeak = "手表",
        pictureOptions = listOf(
            PictureOption("u18_s2_p2_opt7_1", "jam tangan", "", R.drawable.ic_acc_wristwatch, true),
            PictureOption("u18_s2_p2_opt7_2", "tas", "", R.drawable.ic_cloth_bag, false),
            PictureOption("u18_s2_p2_opt7_3", "celana", "", R.drawable.ic_cloth_pants, false),
            PictureOption("u18_s2_p2_opt7_4", "baju", "", R.drawable.ic_shop_clothes, false)
        )
    ),

    // 8. Soal 8: Ketik Pinyin (jam tangan -> shǒubiǎo)
    Exercise(
        id = "u18_s2_p2_q8",
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

    // 9. Soal 9: Susun Kalimat (Ibu memberi saya sebuah jam tangan baru.)
    Exercise(
        id = "u18_s2_p2_q9",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Ibu menghadiahkan saya sebuah jam tangan.",
        targetHanzi = "妈妈 送 我 一 块 手表。",
        targetPinyin = "Māma sòng wǒ yí kuài shǒubiǎo.",
        wordChips = listOf("妈妈:māma", "送:sòng", "我:wǒ", "一:yí", "块:kuài", "手表。:shǒubiǎo.", "包:bāo"),
        correctAnswer = "妈妈,送,我,一,块,手表。",
        audioToSpeak = "妈妈送我一块手表。"
    ),

    // 10. Soal 10: Ketuk Pasangan yang Sesuai (Rangkuman Aksesoris Lengkap)
    Exercise(
        id = "u18_s2_p2_m10",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u18_s2_p2_m10_1", "包", "bāo", "tas"),
            MatchPairItem("u18_s2_p2_m10_2", "手表", "shǒubiǎo", "jam tangan"),
            MatchPairItem("u18_s2_p2_m10_3", "一块", "yí kuài", "sebuah (arloji)"),
            MatchPairItem("u18_s2_p2_m10_4", "送给", "sòng gěi", "dihadiahkan")
        )
    )
)
