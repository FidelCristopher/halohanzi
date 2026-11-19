package com.example.chineselearning.data.repository

import com.example.chineselearning.R
import com.example.chineselearning.data.model.Exercise
import com.example.chineselearning.data.model.ExerciseType
import com.example.chineselearning.data.model.MatchPairItem
import com.example.chineselearning.data.model.PictureOption

val bab16Stage3Part1Exercises = listOf(
    // 1. Soal 1: Pilihan Gambar (要 -> mau / harus)
    Exercise(
        id = "u16_s3_p1_q1",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "要",
        targetPinyin = "yào",
        targetTranslation = "mau / harus",
        correctAnswer = "mau / harus",
        audioToSpeak = "要",
        pictureOptions = listOf(
            PictureOption("u16_s3_p1_opt1", "mau / harus", "", R.drawable.ic_mod_must, true),
            PictureOption("u16_s3_p1_opt2", "jangan", "", R.drawable.ic_mod_dont, false),
            PictureOption("u16_s3_p1_opt3", "buku", "", R.drawable.ic_book_chinese, false),
            PictureOption("u16_s3_p1_opt4", "tidur", "", R.drawable.ic_action_sleep, false)
        )
    ),

    // 2. Soal 2: Susun Kalimat (Saya ingin segelas air.)
    Exercise(
        id = "u16_s3_p1_q2",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Saya mau segelas air.",
        targetHanzi = "我 要 一杯 水。",
        targetPinyin = "Wǒ yào yìbēi shuǐ.",
        wordChips = listOf("我:wǒ", "要:yào", "一杯:yìbēi", "水。:shuǐ.", "不要:búyào"),
        correctAnswer = "我,要,一杯,水。",
        audioToSpeak = "我要一杯水。"
    ),

    // 3. Soal 3: Ketuk Pasangan yang Sesuai (Mau & Jangan)
    Exercise(
        id = "u16_s3_p1_q3",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u16_s3_p1_m1", "要", "yào", "mau / harus"),
            MatchPairItem("u16_s3_p1_m2", "不要", "búyào", "jangan / tidak mau"),
            MatchPairItem("u16_s3_p1_m3", "不要说话", "búyào shuōhuà", "jangan bicara"),
            MatchPairItem("u16_s3_p1_m4", "要吃", "yào chī", "mau makan")
        )
    ),

    // 4. Soal 4: Ketik Pinyin (mau/harus -> yào)
    Exercise(
        id = "u16_s3_p1_q4",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "mau / harus",
        sentenceWithBlank = "要 (________)",
        targetHanzi = "要",
        targetPinyin = "yào",
        correctAnswer = "yao",
        keyboardKeys = listOf("y", "a", "o", "e", "i", "u", "b", "d", "g", "h", "j"),
        audioToSpeak = "要"
    ),

    // 5. Soal 5: Mendengar Kalimat (Rule 10: illustrationRes = 0)
    Exercise(
        id = "u16_s3_p1_q5",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Apa yang Anda dengar?",
        targetTranslation = "Jangan berbicara di sini.",
        targetHanzi = "不要 在 这里 说话。",
        targetPinyin = "Búyào zài zhèlǐ shuōhuà.",
        wordChips = listOf("不要:búyào", "在:zài", "这里:zhèlǐ", "说话。:shuōhuà.", "要:yào"),
        correctAnswer = "不要,在,这里,说话。",
        illustrationRes = 0,
        audioToSpeak = "不要在这里说话。"
    ),

    // 6. Soal 6: Pilihan Kalimat
    Exercise(
        id = "u16_s3_p1_q6",
        type = ExerciseType.SENTENCE_CHOICE,
        title = "Pilih terjemahan yang benar",
        targetHanzi = "明天 我 要 去 医院。",
        targetPinyin = "Míngtiān wǒ yào qù yīyuàn.",
        targetTranslation = "Besok saya harus pergi ke rumah sakit.",
        correctAnswer = "Míngtiān wǒ yào qù yīyuàn.\n明天 我 要 去 医院。",
        options = listOf(
            "Míngtiān wǒ yào qù yīyuàn.\n明天 我 要 去 医院。",
            "Jīntiān wǒ yào qù yīyuàn.\n今天 我 要 去 医院。",
            "Míngtiān wǒ yào qù xuéxiào.\n明天 我 要 去 学校。"
        ),
        audioToSpeak = "明天我要去医院。"
    ),

    // 7. Soal 7: Pilihan Gambar (不要 -> jangan)
    Exercise(
        id = "u16_s3_p1_q7",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "不要",
        targetPinyin = "búyào",
        targetTranslation = "jangan",
        correctAnswer = "jangan",
        audioToSpeak = "不要",
        pictureOptions = listOf(
            PictureOption("u16_s3_p1_opt7_1", "jangan", "", R.drawable.ic_mod_dont, true),
            PictureOption("u16_s3_p1_opt7_2", "mau", "", R.drawable.ic_mod_must, false),
            PictureOption("u16_s3_p1_opt7_3", "makan", "", R.drawable.ic_action_eat, false),
            PictureOption("u16_s3_p1_opt7_4", "tidur", "", R.drawable.ic_action_sleep, false)
        )
    ),

    // 8. Soal 8: Ketik Pinyin (jangan -> búyào)
    Exercise(
        id = "u16_s3_p1_q8",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "jangan / tidak mau",
        sentenceWithBlank = "不要 (________)",
        targetHanzi = "不要",
        targetPinyin = "búyào",
        correctAnswer = "buyao",
        keyboardKeys = listOf("b", "u", "y", "a", "o", "e", "i", "d", "g", "h", "j"),
        audioToSpeak = "不要"
    ),

    // 9. Soal 9: Susun Kalimat (Saya harus pergi bekerja.)
    Exercise(
        id = "u16_s3_p1_q9",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Saya harus pergi kerja.",
        targetHanzi = "我 要 去 上班 了。",
        targetPinyin = "Wǒ yào qù shàngbān le.",
        wordChips = listOf("我:wǒ", "要:yào", "去:qù", "上班:shàngbān", "了。:le.", "不要:búyào"),
        correctAnswer = "我,要,去,上班,了。",
        audioToSpeak = "我要去上班了。"
    ),

    // 10. Soal 10: Ketuk Pasangan yang Sesuai (Rangkuman Keharusan)
    Exercise(
        id = "u16_s3_p1_m10_1",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u16_s3_p1_m10_1", "要", "yào", "harus"),
            MatchPairItem("u16_s3_p1_m10_2", "不要", "búyào", "jangan"),
            MatchPairItem("u16_s3_p1_m10_3", "要学习", "yào xuéxí", "harus belajar"),
            MatchPairItem("u16_s3_p1_m10_4", "不要走", "búyào zǒu", "jangan pergi")
        )
    )
)

val bab16Stage3Part2Exercises = listOf(
    // 1. Soal 1: Pilihan Gambar (对 -> benar)
    Exercise(
        id = "u16_s3_p2_q1",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "对",
        targetPinyin = "duì",
        targetTranslation = "benar",
        correctAnswer = "benar",
        audioToSpeak = "对",
        pictureOptions = listOf(
            PictureOption("u16_s3_p2_opt1", "benar", "", R.drawable.ic_mod_correct, true),
            PictureOption("u16_s3_p2_opt2", "salah", "", R.drawable.ic_mod_wrong, false),
            PictureOption("u16_s3_p2_opt3", "buku", "", R.drawable.ic_book_chinese, false),
            PictureOption("u16_s3_p2_opt4", "tidur", "", R.drawable.ic_action_sleep, false)
        )
    ),

    // 2. Soal 2: Susun Kalimat (Anda mengatakannya dengan benar.)
    Exercise(
        id = "u16_s3_p2_q2",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Anda mengatakannya dengan benar.",
        targetHanzi = "你 说 得 对。",
        targetPinyin = "Nǐ shuō de duì.",
        wordChips = listOf("你:nǐ", "说:shuō", "得:de", "对。:duì.", "不对:bú duì"),
        correctAnswer = "你,说,得,对。",
        audioToSpeak = "你说得对。"
    ),

    // 3. Soal 3: Ketuk Pasangan yang Sesuai (Benar vs Salah)
    Exercise(
        id = "u16_s3_p2_m3",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u16_s3_p2_m1", "对", "duì", "benar / tepat"),
            MatchPairItem("u16_s3_p2_m2", "不对", "bú duì", "salah / tidak tepat"),
            MatchPairItem("u16_s3_p2_m3", "对不对", "duì bu duì", "benar tidak?"),
            MatchPairItem("u16_s3_p2_m4", "对的", "duì de", "yang benar")
        )
    ),

    // 4. Soal 4: Ketik Pinyin (benar -> duì)
    Exercise(
        id = "u16_s3_p2_q4",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "benar / tepat",
        sentenceWithBlank = "对 (________)",
        targetHanzi = "对",
        targetPinyin = "duì",
        correctAnswer = "dui",
        keyboardKeys = listOf("d", "u", "i", "a", "e", "o", "b", "g", "h", "j", "l"),
        audioToSpeak = "对"
    ),

    // 5. Soal 5: Mendengar Kalimat (Rule 10: illustrationRes = 0)
    Exercise(
        id = "u16_s3_p2_q5",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Apa yang Anda dengar?",
        targetTranslation = "Ini tidak benar.",
        targetHanzi = "这个 不 对。",
        targetPinyin = "Zhège bú duì.",
        wordChips = listOf("这个:zhège", "不:bú", "对。:duì.", "那个:nàge", "很:hěn"),
        correctAnswer = "这个,不,对。",
        illustrationRes = 0,
        audioToSpeak = "这个不对。"
    ),

    // 6. Soal 6: Pilihan Kalimat
    Exercise(
        id = "u16_s3_p2_q6",
        type = ExerciseType.SENTENCE_CHOICE,
        title = "Pilih terjemahan yang benar",
        targetHanzi = "对， 我 是 老师。",
        targetPinyin = "Duì, wǒ shì lǎoshī.",
        targetTranslation = "Benar, saya adalah guru.",
        correctAnswer = "Duì, wǒ shì lǎoshī.\n对， 我 是 老师。",
        options = listOf(
            "Duì, wǒ shì lǎoshī.\n对， 我 是 老师。",
            "Bú duì, wǒ shì lǎoshī.\n不 对， 我 是 老师。",
            "Duì, tā shì lǎoshī.\n对， 他 是 老师。"
        ),
        audioToSpeak = "对，我是老师。"
    ),

    // 7. Soal 7: Pilihan Gambar (不对 -> salah)
    Exercise(
        id = "u16_s3_p2_q7",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "不对",
        targetPinyin = "bú duì",
        targetTranslation = "salah / tidak benar",
        correctAnswer = "salah / tidak benar",
        audioToSpeak = "不对",
        pictureOptions = listOf(
            PictureOption("u16_s3_p2_opt7_1", "salah", "", R.drawable.ic_mod_wrong, true),
            PictureOption("u16_s3_p2_opt7_2", "benar", "", R.drawable.ic_mod_correct, false),
            PictureOption("u16_s3_p2_opt7_3", "makan", "", R.drawable.ic_action_eat, false),
            PictureOption("u16_s3_p2_opt7_4", "tidur", "", R.drawable.ic_action_sleep, false)
        )
    ),

    // 8. Soal 8: Ketik Pinyin (salah -> búduì)
    Exercise(
        id = "u16_s3_p2_q8",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "salah / tidak tepat",
        sentenceWithBlank = "不对 (________)",
        targetHanzi = "不对",
        targetPinyin = "búduì",
        correctAnswer = "budui",
        keyboardKeys = listOf("b", "u", "d", "i", "a", "e", "o", "g", "h", "j", "l"),
        audioToSpeak = "不对"
    ),

    // 9. Soal 9: Susun Kalimat (Benar atau tidak?)
    Exercise(
        id = "u16_s3_p2_q9",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Benar tidak?",
        targetHanzi = "对 不 对？",
        targetPinyin = "Duì bu duì?",
        wordChips = listOf("对:duì", "不:bu", "对？:duì?", "好:hǎo"),
        correctAnswer = "对,不,对？",
        audioToSpeak = "对不对？"
    ),

    // 10. Soal 10: Ketuk Pasangan yang Sesuai (Rangkuman Kebenaran)
    Exercise(
        id = "u16_s3_p2_m10_1",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u16_s3_p2_m10_1", "对", "duì", "benar"),
            MatchPairItem("u16_s3_p2_m10_2", "不对", "bú duì", "salah"),
            MatchPairItem("u16_s3_p2_m10_3", "说得对", "shuō de duì", "benar katanya"),
            MatchPairItem("u16_s3_p2_m10_4", "是对的", "shì duì de", "adalah benar")
        )
    )
)
