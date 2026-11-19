package com.example.chineselearning.data.repository

import com.example.chineselearning.R
import com.example.chineselearning.data.model.*

/**
 * Bab 3 - Stage 2 (Puluhan, Ratusan, Ribuan & Perbedaan 两 vs 二)
 * Kosakata: 零 (líng), 百 (bǎi), 千 (qiān), 两 (liǎng), 二 (èr).
 */

val bab3Stage2Part1Exercises = listOf(
    // 1. Soal 1: Pilihan Gambar (两 -> dua di depan satuan)
    Exercise(
        id = "u3_s2_p1_q1",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "两",
        targetPinyin = "liǎng",
        targetTranslation = "dua",
        correctAnswer = "dua",
        audioToSpeak = "两",
        pictureOptions = listOf(
            PictureOption("u3_s2_p1_opt1", "dua (satuan)", "2", R.drawable.ic_two_items, true),
            PictureOption("u3_s2_p1_opt2", "tiga", "3", R.drawable.ic_three_items, false),
            PictureOption("u3_s2_p1_opt3", "nol", "0", R.drawable.ic_num_0, false),
            PictureOption("u3_s2_p1_opt4", "sepuluh", "10", R.drawable.ic_num_10, false)
        )
    ),

    // 2. Soal 2: Susun Kalimat (十二个人。 -> Dua belas orang.)
    Exercise(
        id = "u3_s2_p1_q2",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Dua belas orang.",
        targetHanzi = "十二 个 人。",
        targetPinyin = "Shí'èr gè rén.",
        wordChips = listOf("十二:shí'èr", "个:gè", "人:rén", "两:liǎng", "学生:xuéshēng"),
        correctAnswer = "十二,个,人",
        audioToSpeak = "十二个人。"
    ),

    // 3. Soal 3: Ketuk Pasangan yang Sesuai (Puluhan & Angka Khusus)
    Exercise(
        id = "u3_s2_p1_q3",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u3_s2_p1_m1", "零", "líng", "nol"),
            MatchPairItem("u3_s2_p1_m2", "两", "liǎng", "dua (kuantitas)"),
            MatchPairItem("u3_s2_p1_m3", "十一", "shíyī", "sebelas"),
            MatchPairItem("u3_s2_p1_m4", "二十", "èrshí", "dua puluh")
        )
    ),

    // 4. Soal 4: Ketik Pinyin (dua puluh -> èrshí)
    Exercise(
        id = "u3_s2_p1_q4",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "dua puluh",
        sentenceWithBlank = "二十 (________)",
        targetHanzi = "二十",
        targetPinyin = "èrshí",
        correctAnswer = "ershi",
        keyboardKeys = listOf("e", "r", "s", "h", "i", "a", "n", "g"),
        audioToSpeak = "二十"
    ),

    // 5. Soal 5: Pilihan Terjemahan (Dua orang teman)
    Exercise(
        id = "u3_s2_p1_q5",
        type = ExerciseType.SENTENCE_CHOICE,
        title = "Pilih terjemahan yang benar",
        targetTranslation = "Dua orang teman",
        options = listOf(
            "Liǎng gè péngyou\n两 个 朋友",
            "Èr gè péngyou\n二 个 朋友",
            "Shí gè péngyou\n十 个 朋友",
            "Yí gè tóngxué\n一 个 同学"
        ),
        correctAnswer = "Liǎng gè péngyou\n两 个 朋友",
        audioToSpeak = "两个朋友"
    ),

    // 6. Soal 6: Apa yang Anda dengar? (十五个学生。 -> Lima belas orang murid.)
    Exercise(
        id = "u3_s2_p1_q6",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Apa yang Anda dengar?",
        isImmersiveSpeaker = true,
        illustrationRes = 0,
        targetHanzi = "十五 个 学生。",
        targetPinyin = "Shíwǔ gè xuéshēng.",
        targetTranslation = "Lima belas orang murid.",
        wordChips = listOf("十五:shíwǔ", "个:gè", "学生:xuéshēng", "十二:shí'èr", "人:rén", "老师:lǎoshī"),
        correctAnswer = "十五,个,学生",
        audioToSpeak = "十五个学生。"
    ),

    // 7. Soal 7: Pilihan Terjemahan (Tiga puluh orang)
    Exercise(
        id = "u3_s2_p1_q7",
        type = ExerciseType.SENTENCE_CHOICE,
        title = "Pilih terjemahan yang benar",
        targetTranslation = "Tiga puluh orang",
        options = listOf(
            "Sānshí gè rén\n三十 个 人",
            "Èrshí gè rén\n二十 个 人",
            "Sān gè rén\n三 个 人",
            "Shísān gè rén\n十三 个 人"
        ),
        correctAnswer = "Sānshí gè rén\n三十 个 人",
        audioToSpeak = "三十个人"
    ),

    // 8. Soal 8: Susun Kalimat (两个朋友。 -> Dua orang teman.)
    Exercise(
        id = "u3_s2_p1_q8",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Dua orang teman.",
        targetHanzi = "两 个 朋友。",
        targetPinyin = "Liǎng gè péngyou.",
        wordChips = listOf("两:liǎng", "个:gè", "朋友:péngyou", "二:èr", "人:rén"),
        correctAnswer = "两,个,朋友",
        audioToSpeak = "两个朋友。"
    ),

    // 9. Soal 9: Apa yang Anda dengar? (二十个人。 -> Dua puluh orang.)
    Exercise(
        id = "u3_s2_p1_q9",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Apa yang Anda dengar?",
        isImmersiveSpeaker = true,
        illustrationRes = 0,
        targetHanzi = "二十 个 人。",
        targetPinyin = "Èrshí gè rén.",
        targetTranslation = "Dua puluh orang.",
        wordChips = listOf("二十:èrshí", "个:gè", "人:rén", "三十:sānshí", "两:liǎng", "朋友:péngyou"),
        correctAnswer = "二十,个,人",
        audioToSpeak = "二十个人。"
    ),

    // 10. Soal 10: Susun Kalimat (八十五个学生。 -> Delapan puluh lima orang murid.)
    Exercise(
        id = "u3_s2_p1_q10",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Delapan puluh lima orang murid.",
        targetHanzi = "八十五 个 学生。",
        targetPinyin = "Bāshíwǔ gè xuéshēng.",
        wordChips = listOf("八十五:bāshíwǔ", "个:gè", "学生:xuéshēng", "五十:wǔshí", "老师:lǎoshī"),
        correctAnswer = "八十五,个,学生",
        audioToSpeak = "八十五个学生。"
    )
)

val bab3Stage2Part2Exercises = listOf(
    // 1. Soal 1: Pilihan Gambar (一百 -> seratus)
    Exercise(
        id = "u3_s2_p2_q1",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "一百",
        targetPinyin = "yìbǎi",
        targetTranslation = "seratus",
        correctAnswer = "seratus",
        audioToSpeak = "一百",
        pictureOptions = listOf(
            PictureOption("u3_s2_p2_opt1", "sepuluh", "10", R.drawable.ic_num_10, false),
            PictureOption("u3_s2_p2_opt2", "seratus", "100", R.drawable.ic_num_100, true),
            PictureOption("u3_s2_p2_opt3", "seribu", "1000", R.drawable.ic_num_1000, false),
            PictureOption("u3_s2_p2_opt4", "nol", "0", R.drawable.ic_num_0, false)
        )
    ),

    // 2. Soal 2: Susun Kalimat (一百个人。 -> Seratus orang.)
    Exercise(
        id = "u3_s2_p2_q2",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Seratus orang.",
        targetHanzi = "一百 个 人。",
        targetPinyin = "Yìbǎi gè rén.",
        wordChips = listOf("一百:yìbǎi", "个:gè", "人:rén", "两百:liǎngbǎi", "老师:lǎoshī"),
        correctAnswer = "一百,个,人",
        audioToSpeak = "一百个人。"
    ),

    // 3. Soal 3: Ketuk Pasangan yang Sesuai (Ratusan & Ribuan)
    Exercise(
        id = "u3_s2_p2_q3",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u3_s2_p2_m1", "百", "bǎi", "ratus"),
            MatchPairItem("u3_s2_p2_m2", "千", "qiān", "ribu"),
            MatchPairItem("u3_s2_p2_m3", "两百", "liǎngbǎi", "dua ratus"),
            MatchPairItem("u3_s2_p2_m4", "一千", "yìqiān", "seribu")
        )
    ),

    // 4. Soal 4: Ketik Pinyin (seratus -> bǎi)
    Exercise(
        id = "u3_s2_p2_q4",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "seratus",
        sentenceWithBlank = "百 (________)",
        targetHanzi = "百",
        targetPinyin = "bǎi",
        correctAnswer = "bai",
        keyboardKeys = listOf("b", "a", "i", "q", "n", "l", "g", "e"),
        audioToSpeak = "百"
    ),

    // 5. Soal 5: Pilihan Terjemahan (Dua ratus orang murid)
    Exercise(
        id = "u3_s2_p2_q5",
        type = ExerciseType.SENTENCE_CHOICE,
        title = "Pilih terjemahan yang benar",
        targetTranslation = "Dua ratus orang murid",
        options = listOf(
            "Liǎngbǎi gè xuéshēng\n两百 个 学生",
            "Èrbǎi gè xuéshēng\n二百 个 学生",
            "Yìbǎi gè xuéshēng\n一百 个 学生",
            "Liǎngqiān gè rén\n两千 个 人"
        ),
        correctAnswer = "Liǎngbǎi gè xuéshēng\n两百 个 学生",
        audioToSpeak = "两百个学生"
    ),

    // 6. Soal 6: Apa yang Anda dengar? (一千个人。 -> Seribu orang.)
    Exercise(
        id = "u3_s2_p2_q6",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Apa yang Anda dengar?",
        isImmersiveSpeaker = true,
        illustrationRes = 0,
        targetHanzi = "一千 个 人。",
        targetPinyin = "Yìqiān gè rén.",
        targetTranslation = "Seribu orang.",
        wordChips = listOf("一千:yìqiān", "个:gè", "人:rén", "一百:yìbǎi", "学生:xuéshēng"),
        correctAnswer = "一千,个,人",
        audioToSpeak = "一千个人。"
    ),

    // 7. Soal 7: Pilihan Terjemahan (Seratus lima orang)
    Exercise(
        id = "u3_s2_p2_q7",
        type = ExerciseType.SENTENCE_CHOICE,
        title = "Pilih terjemahan yang benar",
        targetTranslation = "Seratus lima orang",
        options = listOf(
            "Yìbǎi líng wǔ gè rén\n一百 零 五 个 人",
            "Yìbǎi wǔ gè rén\n一百 五 个 人",
            "Liǎngbǎi gè rén\n两百 个 人",
            "Yìqiān gè rén\n一千 个 人"
        ),
        correctAnswer = "Yìbǎi líng wǔ gè rén\n一百 零 五 个 人",
        audioToSpeak = "一百零五个人"
    ),

    // 8. Soal 8: Susun Kalimat (两百个朋友。 -> Dua ratus orang teman.)
    Exercise(
        id = "u3_s2_p2_q8",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Dua ratus orang teman.",
        targetHanzi = "两百 个 朋友。",
        targetPinyin = "Liǎngbǎi gè péngyou.",
        wordChips = listOf("两百:liǎngbǎi", "个:gè", "朋友:péngyou", "一百:yìbǎi", "人:rén"),
        correctAnswer = "两百,个,朋友",
        audioToSpeak = "两百个朋友。"
    ),

    // 9. Soal 9: Apa yang Anda dengar? (一百个老师。 -> Seratus orang guru.)
    Exercise(
        id = "u3_s2_p2_q9",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Apa yang Anda dengar?",
        isImmersiveSpeaker = true,
        illustrationRes = 0,
        targetHanzi = "一百 个 老师。",
        targetPinyin = "Yìbǎi gè lǎoshī.",
        targetTranslation = "Seratus orang guru.",
        wordChips = listOf("一百:yìbǎi", "个:gè", "老师:lǎoshī", "两百:liǎngbǎi", "学生:xuéshēng"),
        correctAnswer = "一百,个,老师",
        audioToSpeak = "一百个老师。"
    ),

    // 10. Soal 10: Susun Kalimat (两千个学生。 -> Dua ribu orang murid.)
    Exercise(
        id = "u3_s2_p2_q10",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Dua ribu orang murid.",
        targetHanzi = "两千 个 学生。",
        targetPinyin = "Liǎngqiān gè xuéshēng.",
        wordChips = listOf("两千:liǎngqiān", "个:gè", "学生:xuéshēng", "一千:yìqiān", "老师:lǎoshī"),
        correctAnswer = "两千,个,学生",
        audioToSpeak = "两千个学生。"
    )
)
