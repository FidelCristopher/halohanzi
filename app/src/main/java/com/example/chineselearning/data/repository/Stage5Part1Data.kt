package com.example.chineselearning.data.repository

import com.example.chineselearning.R
import com.example.chineselearning.data.model.*

val stage5Part1Exercises = listOf<Exercise>(
    // 1. Soal 1: Lengkapi terjemahan (Kami adalah teman sekamar. -> 我 [们] [是] [室友] 。)
    Exercise(
        id = "u2_s5_p1_q1",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Lengkapi terjemahan",
        targetTranslation = "Kami adalah teman sekamar.",
        targetHanzi = "我们是室友。",
        targetPinyin = "Wǒmen shì shìyǒu.",
        staticLeadingText = "我",
        staticLeadingPinyin = "Wǒ",
        staticTrailingText = "。",
        wordChips = listOf("是:shì", "不:bù", "们:men", "人:rén", "室友:shìyǒu", "邻居:línjū", "网友:wǎngyǒu"),
        correctAnswer = "们,是,室友",
        audioToSpeak = "我们是室友。"
    ),

    // 2. Soal 2: Ketuk pasangan yang sesuai (4 Pasang Kartu)
    Exercise(
        id = "u2_s5_p1_q2",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u2_s5_p1_q2_m1", "同事", "tóngshì", "rekan kerja, kolega"),
            MatchPairItem("u2_s5_p1_q2_m2", "们", "men", "kata penanda jamak yang digunakan untuk kata ganti atau beberapa kat..."),
            MatchPairItem("u2_s5_p1_q2_m3", "网友", "wǎngyǒu", "teman online"),
            MatchPairItem("u2_s5_p1_q2_m4", "老板", "lǎobǎn", "bos")
        )
    ),

    // 3. Soal 3: Terjemahkan kalimat ini (Mereka(P) adalah rekan kerja saya. -> 她们是我的同事。)
    Exercise(
        id = "u2_s5_p1_q3",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Terjemahkan kalimat ini",
        targetTranslation = "Mereka(P) adalah rekan kerja saya.",
        targetHanzi = "她们是我的同事。",
        targetPinyin = "Tāmen shì wǒ de tóngshì.",
        wordChips = listOf("是:shì", "的:de", "同事:tóngshì", "我:wǒ", "不:bù", "老板:lǎobǎn", "她:tā", "人:rén", "们:men"),
        correctAnswer = "她,们,是,我,的,同事",
        audioToSpeak = "她们是我的同事。"
    ),

    // 4. Soal 4: Selesaikan dialog (他 是 我们 的 老师 。 -> 他是谁)
    Exercise(
        id = "u2_s5_p1_q4",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Lengkapi percakapan dengan semua kata",
        dialogueSpeakerText = "他 是 我们 的 老师 。",
        dialogueSpeakerPinyin = "Tā shì wǒ men de lǎoshī",
        dialogueBlankIsFirst = true,
        wordChips = listOf("他:tā", "是:shì", "谁:shéi"),
        correctAnswer = "他,是,谁",
        audioToSpeak = "他是谁？"
    ),

    // 5. Soal 5: Masukkan kata yang hilang (Pinyin keyboard: men)
    Exercise(
        id = "u2_s5_p1_q5",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Masukkan kata yang hilang",
        targetHanzi = "王飞是我们的邻居。",
        targetPinyin = "WángFēi shì wǒmen de línjū.",
        targetTranslation = "Wang Fei adalah tetangga kita.",
        sentenceWithBlank = "WángFēi shì wǒ ________ de línjū\n王 飞 是 我 们 的 邻居 。",
        correctAnswer = "men",
        keyboardKeys = listOf("a", "e", "g", "m", "n", "ò", "s", "ǔ", "z"),
        audioToSpeak = "王飞是我们的邻居。"
    ),

    // 6. Soal 6: Ketuk pasangan yang sesuai (4 Pasang Kartu)
    Exercise(
        id = "u2_s5_p1_q6",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u2_s5_p1_q6_m1", "邻居", "línjū", "tetangga"),
            MatchPairItem("u2_s5_p1_q6_m2", "老板", "lǎobǎn", "bos"),
            MatchPairItem("u2_s5_p1_q6_m3", "室友", "shìyǒu", "teman sekamar"),
            MatchPairItem("u2_s5_p1_q6_m4", "同学", "tóngxué", "teman sekolah")
        )
    ),

    // 7. Soal 7: Dengarkan rekaman dan jawab pertanyaan (Tāmen shì wǒ de péngyou.)
    Exercise(
        id = "u2_s5_p1_q7",
        type = ExerciseType.SENTENCE_CHOICE,
        title = "Dengarkan rekaman dan jawab pertanyaan\n\nPembicara menyebutkan berapa teman?",
        targetHanzi = "他们是我的朋友。",
        targetPinyin = "Tā men shì wǒ de péngyou",
        targetTranslation = "Mereka(L) adalah teman saya.",
        options = listOf(
            "Satu",
            "Nol",
            "Dua atau lebih"
        ),
        correctAnswer = "Dua atau lebih",
        audioToSpeak = "他们是我的朋友。"
    ),

    // 8. Soal 8: Review Pemahaman Latihan (Dua atau lebih)
    Exercise(
        id = "u2_s5_p1_q8",
        type = ExerciseType.SENTENCE_CHOICE,
        title = "Pembicara menyebutkan berapa teman?",
        targetHanzi = "他们是我的朋友。",
        targetPinyin = "Tāmen shì wǒ de péngyou.",
        options = listOf(
            "Satu",
            "Nol",
            "Dua atau lebih"
        ),
        correctAnswer = "Dua atau lebih",
        audioToSpeak = "他们是我的朋友。"
    )
)
