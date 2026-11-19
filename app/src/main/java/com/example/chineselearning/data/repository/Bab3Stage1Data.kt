package com.example.chineselearning.data.repository

import com.example.chineselearning.R
import com.example.chineselearning.data.model.*

/**
 * Bab 3 - Stage 1 (Angka 1 - 10 & Penggunaan Satuan 个)
 * Kosakata: 一 (yī), 二 (èr), 三 (sān), 四 (sì), 五 (wǔ), 六 (liù), 七 (qī), 八 (bā), 九 (jiǔ), 十 (shí), 个 (gè).
 */

val bab3Stage1Part1Exercises = listOf(
    // 1. Soal 1: Pilihan Gambar (三 -> tiga)
    Exercise(
        id = "u3_s1_p1_q1",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "三",
        targetPinyin = "sān",
        targetTranslation = "tiga",
        correctAnswer = "tiga",
        audioToSpeak = "三",
        pictureOptions = listOf(
            PictureOption("u3_s1_p1_opt1", "satu", "1", R.drawable.ic_coin, false),
            PictureOption("u3_s1_p1_opt2", "tiga", "3", R.drawable.ic_pouch, true),
            PictureOption("u3_s1_p1_opt3", "dua", "2", R.drawable.ic_cap, false),
            PictureOption("u3_s1_p1_opt4", "lima", "5", R.drawable.ic_crown, false)
        )
    ),

    // 2. Soal 2: Susun Kalimat (一个人。 -> Satu orang.)
    Exercise(
        id = "u3_s1_p1_q2",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Satu orang.",
        targetHanzi = "一 个 人。",
        targetPinyin = "Yí gè rén.",
        wordChips = listOf("一:yí", "个:gè", "人:rén", "三:sān", "朋友:péngyou"),
        correctAnswer = "一,个,人",
        audioToSpeak = "一个人。"
    ),

    // 3. Soal 3: Ketuk Pasangan yang Sesuai (Angka 1 - 5)
    Exercise(
        id = "u3_s1_p1_q3",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u3_s1_p1_m1", "一", "yī", "satu"),
            MatchPairItem("u3_s1_p1_m2", "二", "èr", "dua"),
            MatchPairItem("u3_s1_p1_m3", "三", "sān", "tiga"),
            MatchPairItem("u3_s1_p1_m4", "四", "sì", "empat")
        )
    ),

    // 4. Soal 4: Ketik Pinyin (dua -> èr)
    Exercise(
        id = "u3_s1_p1_q4",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "dua",
        sentenceWithBlank = "二 (________)",
        targetHanzi = "二",
        targetPinyin = "èr",
        correctAnswer = "er",
        keyboardKeys = listOf("e", "r", "s", "a", "n", "y", "i", "w", "u"),
        audioToSpeak = "二"
    ),

    // 5. Soal 5: Pilihan Terjemahan (Tiga orang murid)
    Exercise(
        id = "u3_s1_p1_q5",
        type = ExerciseType.SENTENCE_CHOICE,
        title = "Pilih terjemahan yang benar",
        targetTranslation = "Tiga orang murid",
        options = listOf(
            "Sān gè xuéshēng\n三 个 学生",
            "Yí gè xuéshēng\n一 个 学生",
            "Sì gè lǎoshī\n四 个 老师",
            "Liǎng gè rén\n两 个 人"
        ),
        correctAnswer = "Sān gè xuéshēng\n三 个 学生",
        audioToSpeak = "三个学生"
    ),

    // 6. Soal 6: Apa yang Anda dengar? (五个人。 -> Lima orang.)
    Exercise(
        id = "u3_s1_p1_q6",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Apa yang Anda dengar?",
        isImmersiveSpeaker = true,
        illustrationRes = 0,
        targetHanzi = "五 个 人。",
        targetPinyin = "Wǔ gè rén.",
        targetTranslation = "Lima orang.",
        wordChips = listOf("五:wǔ", "个:gè", "人:rén", "四:sì", "三:sān", "学生:xuéshēng"),
        correctAnswer = "五,个,人",
        audioToSpeak = "五个人。"
    ),

    // 7. Soal 7: Pilihan Terjemahan (Empat orang teman)
    Exercise(
        id = "u3_s1_p1_q7",
        type = ExerciseType.SENTENCE_CHOICE,
        title = "Pilih terjemahan yang benar",
        targetTranslation = "Empat orang teman",
        options = listOf(
            "Sì gè péngyou\n四 个 朋友",
            "Wǔ gè péngyou\n五 个 朋友",
            "Sān gè tóngxué\n三 个 同学",
            "Yí gè lǎoshī\n一 个 老师"
        ),
        correctAnswer = "Sì gè péngyou\n四 个 朋友",
        audioToSpeak = "四个朋友"
    ),

    // 8. Soal 8: Susun Kalimat (两个老师。 -> Dua orang guru.)
    Exercise(
        id = "u3_s1_p1_q8",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Dua orang guru.",
        targetHanzi = "两 个 老师。",
        targetPinyin = "Liǎng gè lǎoshī.",
        wordChips = listOf("两:liǎng", "个:gè", "老师:lǎoshī", "一:yī", "学生:xuéshēng"),
        correctAnswer = "两,个,老师",
        audioToSpeak = "两个老师。"
    ),

    // 9. Soal 9: Apa yang Anda dengar? (一个老师。 -> Satu orang guru.)
    Exercise(
        id = "u3_s1_p1_q9",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Apa yang Anda dengar?",
        isImmersiveSpeaker = true,
        illustrationRes = 0,
        targetHanzi = "一 个 老师。",
        targetPinyin = "Yí gè lǎoshī.",
        targetTranslation = "Satu orang guru.",
        wordChips = listOf("一:yí", "个:gè", "老师:lǎoshī", "两:liǎng", "人:rén", "朋友:péngyou"),
        correctAnswer = "一,个,老师",
        audioToSpeak = "一个老师。"
    ),

    // 10. Soal 10: Susun Kalimat (三个朋友。 -> Tiga orang teman.)
    Exercise(
        id = "u3_s1_p1_q10",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Tiga orang teman.",
        targetHanzi = "三 个 朋友。",
        targetPinyin = "Sān gè péngyou.",
        wordChips = listOf("三:sān", "个:gè", "朋友:péngyou", "五:wǔ", "人:rén"),
        correctAnswer = "三,个,朋友",
        audioToSpeak = "三个朋友。"
    )
)

val bab3Stage1Part2Exercises = listOf(
    // 1. Soal 1: Pilihan Gambar (八 -> delapan)
    Exercise(
        id = "u3_s1_p2_q1",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "八",
        targetPinyin = "bā",
        targetTranslation = "delapan",
        correctAnswer = "delapan",
        audioToSpeak = "八",
        pictureOptions = listOf(
            PictureOption("u3_s1_p2_opt1", "enam", "6", R.drawable.ic_coin, false),
            PictureOption("u3_s1_p2_opt2", "delapan", "8", R.drawable.ic_crown, true),
            PictureOption("u3_s1_p2_opt3", "tujuh", "7", R.drawable.ic_pouch, false),
            PictureOption("u3_s1_p2_opt4", "sepuluh", "10", R.drawable.ic_cap, false)
        )
    ),

    // 2. Soal 2: Susun Kalimat (六个学生。 -> Enam orang murid.)
    Exercise(
        id = "u3_s1_p2_q2",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Enam orang murid.",
        targetHanzi = "六 个 学生。",
        targetPinyin = "Liù gè xuéshēng.",
        wordChips = listOf("六:liù", "个:gè", "学生:xuéshēng", "七:qī", "老师:lǎoshī"),
        correctAnswer = "六,个,学生",
        audioToSpeak = "六个学生。"
    ),

    // 3. Soal 3: Ketuk Pasangan yang Sesuai (Angka 6 - 10)
    Exercise(
        id = "u3_s1_p2_q3",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u3_s1_p2_m1", "六", "liù", "enam"),
            MatchPairItem("u3_s1_p2_m2", "七", "qī", "tujuh"),
            MatchPairItem("u3_s1_p2_m3", "八", "bā", "delapan"),
            MatchPairItem("u3_s1_p2_m4", "十", "shí", "sepuluh")
        )
    ),

    // 4. Soal 4: Ketik Pinyin (sepuluh -> shí)
    Exercise(
        id = "u3_s1_p2_q4",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "sepuluh",
        sentenceWithBlank = "十 (________)",
        targetHanzi = "十",
        targetPinyin = "shí",
        correctAnswer = "shi",
        keyboardKeys = listOf("s", "h", "i", "u", "b", "a", "j", "q"),
        audioToSpeak = "十"
    ),

    // 5. Soal 5: Pilihan Terjemahan (Tujuh orang teman)
    Exercise(
        id = "u3_s1_p2_q5",
        type = ExerciseType.SENTENCE_CHOICE,
        title = "Pilih terjemahan yang benar",
        targetTranslation = "Tujuh orang teman",
        options = listOf(
            "Qī gè péngyou\n七 个 朋友",
            "Liù gè péngyou\n六 个 朋友",
            "Bā gè tóngxué\n八 个 同学",
            "Shí gè rén\n十 个 人"
        ),
        correctAnswer = "Qī gè péngyou\n七 个 朋友",
        audioToSpeak = "七个朋友"
    ),

    // 6. Soal 6: Apa yang Anda dengar? (八个人。 -> Delapan orang.)
    Exercise(
        id = "u3_s1_p2_q6",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Apa yang Anda dengar?",
        isImmersiveSpeaker = true,
        illustrationRes = 0,
        targetHanzi = "八 个 人。",
        targetPinyin = "Bā gè rén.",
        targetTranslation = "Delapan orang.",
        wordChips = listOf("八:bā", "个:gè", "人:rén", "九:jiǔ", "七:qī", "朋友:péngyou"),
        correctAnswer = "八,个,人",
        audioToSpeak = "八个人。"
    ),

    // 7. Soal 7: Pilihan Terjemahan (Sepuluh orang murid)
    Exercise(
        id = "u3_s1_p2_q7",
        type = ExerciseType.SENTENCE_CHOICE,
        title = "Pilih terjemahan yang benar",
        targetTranslation = "Sepuluh orang murid",
        options = listOf(
            "Shí gè xuéshēng\n十 个 学生",
            "Jiǔ gè xuéshēng\n九 个 学生",
            "Bā gè lǎoshī\n八 个 老师",
            "Qī gè rén\n七 个 人"
        ),
        correctAnswer = "Shí gè xuéshēng\n十 个 学生",
        audioToSpeak = "十个学生"
    ),

    // 8. Soal 8: Susun Kalimat (九个朋友。 -> Sembilan orang teman.)
    Exercise(
        id = "u3_s1_p2_q8",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Sembilan orang teman.",
        targetHanzi = "九 个 朋友。",
        targetPinyin = "Jiǔ gè péngyou.",
        wordChips = listOf("九:jiǔ", "个:gè", "朋友:péngyou", "十:shí", "人:rén"),
        correctAnswer = "九,个,朋友",
        audioToSpeak = "九个朋友。"
    ),

    // 9. Soal 9: Apa yang Anda dengar? (七个老师。 -> Tujuh orang guru.)
    Exercise(
        id = "u3_s1_p2_q9",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Apa yang Anda dengar?",
        isImmersiveSpeaker = true,
        illustrationRes = 0,
        targetHanzi = "七 个 老师。",
        targetPinyin = "Qī gè lǎoshī.",
        targetTranslation = "Tujuh orang guru.",
        wordChips = listOf("七:qī", "个:gè", "老师:lǎoshī", "六:liù", "人:rén", "学生:xuéshēng"),
        correctAnswer = "七,个,老师",
        audioToSpeak = "七个老师。"
    ),

    // 10. Soal 10: Susun Kalimat (十个人。 -> Sepuluh orang.)
    Exercise(
        id = "u3_s1_p2_q10",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Sepuluh orang.",
        targetHanzi = "十 个 人。",
        targetPinyin = "Shí gè rén.",
        wordChips = listOf("十:shí", "个:gè", "人:rén", "八:bā", "朋友:péngyou"),
        correctAnswer = "十,个,人",
        audioToSpeak = "十个人。"
    )
)
