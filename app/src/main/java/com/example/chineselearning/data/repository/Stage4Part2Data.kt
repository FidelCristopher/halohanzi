package com.example.chineselearning.data.repository

import com.example.chineselearning.R
import com.example.chineselearning.data.model.*

val stage4Part2Exercises = listOf<Exercise>(
    // 1. Soal 1: Lengkapi terjemahan (Teman sekamar saya adalah orang Tiongkok. -> 我的 [室友] 是 中国 人 。)
    Exercise(
        id = "u2_s4_p2_q1",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Lengkapi terjemahan",
        targetTranslation = "Teman sekamar saya adalah orang Tiongkok.",
        targetHanzi = "我的室友是中国人。",
        targetPinyin = "Wǒ de shìyǒu shì Zhōngguó rén.",
        staticLeadingText = "我的",
        staticLeadingPinyin = "Wǒ de",
        staticTrailingText = "是 中国 人 。",
        staticTrailingPinyin = "shì Zhōngguó rén.",
        wordChips = listOf("邻居:línjū", "男朋友:nánpéngyou", "室友:shìyǒu", "网友:wǎngyǒu", "老师:lǎoshī"),
        correctAnswer = "室友",
        audioToSpeak = "我的室友是中国人。"
    ),

    // 2. Soal 2: Apa yang Anda dengar? (她的 男朋友 是 谁)
    Exercise(
        id = "u2_s4_p2_q2",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Apa yang Anda dengar?",
        isImmersiveSpeaker = true,
        illustrationRes = R.drawable.img_girl_cap_glasses,
        targetHanzi = "她的男朋友是谁？",
        targetPinyin = "Tā de nánpéngyou shì shéi?",
        targetTranslation = "Siapa pacar(L)-nya?",
        wordChips = listOf("她的:tā de", "男朋友:nánpéngyou", "是:shì", "谁:shéi", "你:nǐ", "们:men", "我:wǒ"),
        correctAnswer = "她的,男朋友,是,谁",
        audioToSpeak = "她的男朋友是谁？"
    ),

    // 3. Soal 3: Pilih kalimat yang benar secara tata bahasa (这是 谁 ？)
    Exercise(
        id = "u2_s4_p2_q3",
        type = ExerciseType.SENTENCE_CHOICE,
        title = "Pilih kalimat yang benar secara tata bahasa",
        options = listOf(
            "Zhè shì shéi\n这是 谁 ？",
            "Zhè shì shéi ma\n这是 谁 吗？"
        ),
        correctAnswer = "Zhè shì shéi\n这是 谁 ？",
        audioToSpeak = "这是谁？"
    ),

    // 4. Soal 4: Lengkapi terjemahan (Siapa teman onlinemu? -> 你的 [网友] [是] [谁] ？)
    Exercise(
        id = "u2_s4_p2_q4",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Lengkapi terjemahan",
        targetTranslation = "Siapa teman onlinemu?",
        targetHanzi = "你的网友是谁？",
        targetPinyin = "Nǐ de wǎngyǒu shì shéi?",
        staticLeadingText = "你的",
        staticLeadingPinyin = "Nǐ de",
        staticTrailingText = "？",
        wordChips = listOf("人:rén", "网友:wǎngyǒu", "室友:shìyǒu", "谁:shéi", "邻居:línjū", "们:men", "是:shì"),
        correctAnswer = "网友,是,谁",
        audioToSpeak = "你的网友是谁？"
    ),

    // 5. Soal 5: Dengarkan kalimat dan pilih terjemahan yang benar (那是谁？ -> Itu siapa?)
    Exercise(
        id = "u2_s4_p2_q5",
        type = ExerciseType.SENTENCE_CHOICE,
        title = "Dengarkan kalimat dan pilih terjemahan yang benar",
        isImmersiveSpeaker = true,
        illustrationRes = R.drawable.img_indonesia_man,
        options = listOf(
            "Ini siapa?",
            "Siapa Wang Fei?",
            "Itu siapa?"
        ),
        correctAnswer = "Itu siapa?",
        audioToSpeak = "那是谁？"
    ),

    // 6. Soal 6: Ketuk pasangan yang sesuai (4 Pasang Kartu)
    Exercise(
        id = "u2_s4_p2_q6",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u2_s4_p2_q6_m1", "谁", "shéi", "siapa"),
            MatchPairItem("u2_s4_p2_q6_m2", "网友", "wǎngyǒu", "teman online"),
            MatchPairItem("u2_s4_p2_q6_m3", "室友", "shìyǒu", "teman sekamar"),
            MatchPairItem("u2_s4_p2_q6_m4", "邻居", "línjū", "tetangga")
        )
    ),

    // 7. Soal 7: Selesaikan percakapan (这是 谁 ？ -> 这是我的 网友 。)
    Exercise(
        id = "u2_s4_p2_q7",
        type = ExerciseType.SENTENCE_CHOICE,
        title = "Pilih kalimat yang tepat untuk menyelesaikan percakapan",
        dialogueSpeakerText = "这是 谁 ？",
        dialogueSpeakerPinyin = "Zhè shì shéi",
        options = listOf(
            "Zhè shì wǒ de wǎngyǒu\n这是我的 网友 。",
            "Wǒ bú shì nǐ de péngyou\n我 不是 你的 朋友 。",
            "Wǒ men bú shì tóngshì\n我们 不是 同事 。"
        ),
        correctAnswer = "Zhè shì wǒ de wǎngyǒu\n这是我的 网友 。",
        audioToSpeak = "这是我的网友。"
    ),

    // 8. Soal 8: Terjemahkan kalimat ini (Siapa tetanggamu? -> 你的邻居是谁？)
    Exercise(
        id = "u2_s4_p2_q8",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Terjemahkan kalimat ini",
        targetTranslation = "Siapa tetanggamu?",
        targetHanzi = "你的邻居是谁？",
        targetPinyin = "Nǐ de línjū shì shéi?",
        wordChips = listOf("你的:nǐ de", "邻居:línjū", "是:shì", "人:rén", "们:men", "网友:wǎngyǒu", "谁:shéi"),
        correctAnswer = "你的,邻居,是,谁",
        audioToSpeak = "你的邻居是谁？"
    )
)
