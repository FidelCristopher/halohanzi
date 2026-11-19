package com.example.chineselearning.data.repository

import com.example.chineselearning.R
import com.example.chineselearning.data.model.*

/**
 * Bab 3 - Stage 4 (Menanyakan Umur & Usia (几岁 / 多大 / 岁))
 * Kosakata: 岁 (suì), 几岁 (jǐ suì), 多大 (duō dà), 今年 (jīnnián).
 */

val bab3Stage4Part1Exercises = listOf(
    // 1. Soal 1: Pilihan Gambar (岁 -> tahun umur / usia)
    Exercise(
        id = "u3_s4_p1_q1",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "岁",
        targetPinyin = "suì",
        targetTranslation = "tahun (umur)",
        correctAnswer = "tahun (umur)",
        audioToSpeak = "岁",
        pictureOptions = listOf(
            PictureOption("u3_s4_p1_opt1", "tahun (umur)", "🎂", R.drawable.ic_crown, true),
            PictureOption("u3_s4_p1_opt2", "uang", "¥", R.drawable.ic_coin, false),
            PictureOption("u3_s4_p1_opt3", "orang", "👤", R.drawable.ic_cap, false),
            PictureOption("u3_s4_p1_opt4", "buku", "📖", R.drawable.ic_book, false)
        )
    ),

    // 2. Soal 2: Susun Kalimat (你几岁？ -> Berapa umurmu?)
    Exercise(
        id = "u3_s4_p1_q2",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Berapa umurmu?",
        targetHanzi = "你 几 岁？",
        targetPinyin = "Nǐ jǐ suì?",
        wordChips = listOf("你:nǐ", "几:jǐ", "岁:suì", "多:duō", "大:dà", "是:shì"),
        correctAnswer = "你,几,岁",
        audioToSpeak = "你几岁？"
    ),

    // 3. Soal 3: Ketuk Pasangan yang Sesuai (Istilah Usia & Umur)
    Exercise(
        id = "u3_s4_p1_q3",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u3_s4_p1_m1", "岁", "suì", "tahun (umur)"),
            MatchPairItem("u3_s4_p1_m2", "几岁", "jǐ suì", "berapa umur (anak)"),
            MatchPairItem("u3_s4_p1_m3", "多大", "duō dà", "berapa usia (dewasa)"),
            MatchPairItem("u3_s4_p1_m4", "今年", "jīnnián", "tahun ini")
        )
    ),

    // 4. Soal 4: Ketik Pinyin (umur -> suì)
    Exercise(
        id = "u3_s4_p1_q4",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "tahun (umur)",
        sentenceWithBlank = "岁 (________)",
        targetHanzi = "岁",
        targetPinyin = "suì",
        correctAnswer = "sui",
        keyboardKeys = listOf("s", "u", "i", "d", "a", "j", "n", "y"),
        audioToSpeak = "岁"
    ),

    // 5. Soal 5: Pilihan Terjemahan (Saya berumur sembilan tahun)
    Exercise(
        id = "u3_s4_p1_q5",
        type = ExerciseType.SENTENCE_CHOICE,
        title = "Pilih terjemahan yang benar",
        targetTranslation = "Saya berumur sembilan tahun",
        options = listOf(
            "Wǒ jiǔ suì\n我 九 岁。",
            "Wǒ bā suì\n我 八 岁。",
            "Wǒ shí suì\n我 十 岁。",
            "Wǒ qī suì\n我 七 岁。"
        ),
        correctAnswer = "Wǒ jiǔ suì\n我 九 岁。",
        audioToSpeak = "我九岁。"
    ),

    // 6. Soal 6: Apa yang Anda dengar? (我七岁。 -> Saya berumur tujuh tahun.)
    Exercise(
        id = "u3_s4_p1_q6",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Apa yang Anda dengar?",
        isImmersiveSpeaker = true,
        illustrationRes = 0,
        targetHanzi = "我 七 岁。",
        targetPinyin = "Wǒ qī suì.",
        targetTranslation = "Saya berumur tujuh tahun.",
        wordChips = listOf("我:wǒ", "七:qī", "岁:suì", "八:bā", "六:liù", "是:shì"),
        correctAnswer = "我,七,岁",
        audioToSpeak = "我七岁。"
    ),

    // 7. Soal 7: Pilihan Terjemahan (Dia berumur lima tahun)
    Exercise(
        id = "u3_s4_p1_q7",
        type = ExerciseType.SENTENCE_CHOICE,
        title = "Pilih terjemahan yang benar",
        targetTranslation = "Dia berumur lima tahun",
        options = listOf(
            "Tā wǔ suì\n他 五 岁。",
            "Tā sì suì\n他 四 岁。",
            "Wǒ wǔ suì\n我 五 岁。",
            "Tā liù suì\n他 六 岁。"
        ),
        correctAnswer = "Tā wǔ suì\n他 五 岁。",
        audioToSpeak = "他五岁。"
    ),

    // 8. Soal 8: Susun Kalimat (他几岁？ -> Berapa umurnya?)
    Exercise(
        id = "u3_s4_p1_q8",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Berapa umurnya?",
        targetHanzi = "他 几 岁？",
        targetPinyin = "Tā jǐ suì?",
        wordChips = listOf("他:tā", "几:jǐ", "岁:suì", "谁:shéi", "你:nǐ"),
        correctAnswer = "他,几,岁",
        audioToSpeak = "他几岁？"
    ),

    // 9. Soal 9: Apa yang Anda dengar? (他十岁。 -> Dia berumur sepuluh tahun.)
    Exercise(
        id = "u3_s4_p1_q9",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Apa yang Anda dengar?",
        isImmersiveSpeaker = true,
        illustrationRes = 0,
        targetHanzi = "他 十 岁。",
        targetPinyin = "Tā shí suì.",
        targetTranslation = "Dia berumur sepuluh tahun.",
        wordChips = listOf("他:tā", "十:shí", "岁:suì", "我:wǒ", "九:jiǔ", "是:shì"),
        correctAnswer = "他,十,岁",
        audioToSpeak = "他十岁。"
    ),

    // 10. Soal 10: Susun Kalimat (我今年六岁。 -> Saya tahun ini berumur enam tahun.)
    Exercise(
        id = "u3_s4_p1_q10",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Saya tahun ini berumur enam tahun.",
        targetHanzi = "我 今年 六 岁。",
        targetPinyin = "Wǒ jīnnián liù suì.",
        wordChips = listOf("我:wǒ", "今年:jīnnián", "六:liù", "岁:suì", "七:qī", "是:shì"),
        correctAnswer = "我,今年,六,岁",
        audioToSpeak = "我今年六岁。"
    )
)

val bab3Stage4Part2Exercises = listOf(
    // 1. Soal 1: Pilihan Gambar (多大 -> berapa usia dewasa)
    Exercise(
        id = "u3_s4_p2_q1",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "多大",
        targetPinyin = "duōdà",
        targetTranslation = "berapa usia",
        correctAnswer = "berapa usia",
        audioToSpeak = "多大",
        pictureOptions = listOf(
            PictureOption("u3_s4_p2_opt1", "berapa usia", "🎂", R.drawable.ic_crown, true),
            PictureOption("u3_s4_p2_opt2", "berapa uang", "¥", R.drawable.ic_coin, false),
            PictureOption("u3_s4_p2_opt3", "berapa orang", "👥", R.drawable.ic_pouch, false),
            PictureOption("u3_s4_p2_opt4", "siapa", "👤", R.drawable.ic_cap, false)
        )
    ),

    // 2. Soal 2: Susun Kalimat (你今年多大？ -> Berapa usiamu tahun ini?)
    Exercise(
        id = "u3_s4_p2_q2",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Berapa usiamu tahun ini?",
        targetHanzi = "你 今年 多 大？",
        targetPinyin = "Nǐ jīnnián duō dà?",
        wordChips = listOf("你:nǐ", "今年:jīnnián", "多:duō", "大:dà", "岁:suì", "几:jǐ"),
        correctAnswer = "你,今年,多,大",
        audioToSpeak = "你今年多大？"
    ),

    // 3. Soal 3: Ketuk Pasangan yang Sesuai (Penyebutan Usia)
    Exercise(
        id = "u3_s4_p2_q3",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u3_s4_p2_m1", "几岁", "jǐ suì", "berapa umur"),
            MatchPairItem("u3_s4_p2_m2", "多大", "duō dà", "berapa usia"),
            MatchPairItem("u3_s4_p2_m3", "二十岁", "èrshí suì", "dua puluh tahun"),
            MatchPairItem("u3_s4_p2_m4", "三十岁", "sānshí suì", "tiga puluh tahun")
        )
    ),

    // 4. Soal 4: Ketik Pinyin (berapa usia -> duōdà)
    Exercise(
        id = "u3_s4_p2_q4",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "berapa usia",
        sentenceWithBlank = "多大 (________)",
        targetHanzi = "多大",
        targetPinyin = "duōdà",
        correctAnswer = "duoda",
        keyboardKeys = listOf("d", "u", "o", "a", "s", "i", "j", "n"),
        audioToSpeak = "多大"
    ),

    // 5. Soal 5: Pilihan Terjemahan (Guru Wang berumur tiga puluh tahun)
    Exercise(
        id = "u3_s4_p2_q5",
        type = ExerciseType.SENTENCE_CHOICE,
        title = "Pilih terjemahan yang benar",
        targetTranslation = "Guru Wang berumur tiga puluh tahun",
        options = listOf(
            "Wáng lǎoshī sānshí suì\n王 老师 三十 岁。",
            "Wáng lǎoshī èrshí suì\n王 老师 二十 岁。",
            "Wáng lǎoshī wǔshí suì\n王 老师 五十 岁。",
            "Wǒ de lǎoshī sān suì\n我 的 老师 三 岁。"
        ),
        correctAnswer = "Wáng lǎoshī sānshí suì\n王 老师 三十 岁。",
        audioToSpeak = "王老师三十岁。"
    ),

    // 6. Soal 6: Apa yang Anda dengar? (我二十岁。 -> Saya berumur dua puluh tahun.)
    Exercise(
        id = "u3_s4_p2_q6",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Apa yang Anda dengar?",
        isImmersiveSpeaker = true,
        illustrationRes = 0,
        targetHanzi = "我 二十 岁。",
        targetPinyin = "Wǒ èrshí suì.",
        targetTranslation = "Saya berumur dua puluh tahun.",
        wordChips = listOf("我:wǒ", "二十:èrshí", "岁:suì", "三十:sānshí", "是:shì", "你:nǐ"),
        correctAnswer = "我,二十,岁",
        audioToSpeak = "我二十岁。"
    ),

    // 7. Soal 7: Pilihan Terjemahan (Pacar saya berumur dua puluh dua tahun)
    Exercise(
        id = "u3_s4_p2_q7",
        type = ExerciseType.SENTENCE_CHOICE,
        title = "Pilih terjemahan yang benar",
        targetTranslation = "Pacar saya berumur dua puluh dua tahun",
        options = listOf(
            "Wǒ de nánpéngyou èrshí'èr suì\n我 的 男朋友 二十二 岁。",
            "Wǒ de nánpéngyou èrshí suì\n我 的 男朋友 二十 岁。",
            "Wǒ de nǚpéngyou sānshí suì\n我 的 女朋友 三十 岁。",
            "Wǒ de péngyou shí'èr suì\n我 的 朋友 十二 岁。"
        ),
        correctAnswer = "Wǒ de nánpéngyou èrshí'èr suì\n我 的 男朋友 二十二 岁。",
        audioToSpeak = "我的男朋友二十二岁。"
    ),

    // 8. Soal 8: Susun Kalimat (老师今年多大？ -> Berapa usia guru tahun ini?)
    Exercise(
        id = "u3_s4_p2_q8",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Berapa usia guru tahun ini?",
        targetHanzi = "老师 今年 多 大？",
        targetPinyin = "Lǎoshī jīnnián duō dà?",
        wordChips = listOf("老师:lǎoshī", "今年:jīnnián", "多:duō", "大:dà", "几:jǐ", "岁:suì"),
        correctAnswer = "老师,今年,多,大",
        audioToSpeak = "老师今年多大？"
    ),

    // 9. Soal 9: Apa yang Anda dengar? (她二十五岁。 -> Dia berumur dua puluh lima tahun.)
    Exercise(
        id = "u3_s4_p2_q9",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Apa yang Anda dengar?",
        isImmersiveSpeaker = true,
        illustrationRes = 0,
        targetHanzi = "她 二十五 岁。",
        targetPinyin = "Tā èrshíwǔ suì.",
        targetTranslation = "Dia berumur dua puluh lima tahun.",
        wordChips = listOf("她:tā", "二十五:èrshíwǔ", "岁:suì", "他:tā", "三十:sānshí", "是:shì"),
        correctAnswer = "她,二十五,岁",
        audioToSpeak = "她二十五岁。"
    ),

    // 10. Soal 10: Susun Kalimat (我的同学十八岁。 -> Teman sekelasku berumur delapan belas tahun.)
    Exercise(
        id = "u3_s4_p2_q10",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Teman sekelasku berumur delapan belas tahun.",
        targetHanzi = "我 的 同学 十八 岁。",
        targetPinyin = "Wǒ de tóngxué shíbā suì.",
        wordChips = listOf("我:wǒ", "的:de", "同学:tóngxué", "十八:shíbā", "岁:suì", "朋友:péngyou", "二十:èrshí"),
        correctAnswer = "我,的,同学,十八,岁",
        audioToSpeak = "我的同学十八岁。"
    )
)
