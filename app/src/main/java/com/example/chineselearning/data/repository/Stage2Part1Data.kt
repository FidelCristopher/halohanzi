package com.example.chineselearning.data.repository

import com.example.chineselearning.R
import com.example.chineselearning.data.model.*

val stage2Part1Exercises = listOf<Exercise>(
    // 1. Soal 1: Lengkapi terjemahan (Apakah mereka(P) teman? -> 她们 是 [朋友] 吗？)
    Exercise(
        id = "u2_s2_p1_q1",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Lengkapi terjemahan",
        targetTranslation = "Apakah mereka(P) teman?",
        targetHanzi = "她们是朋友吗？",
        targetPinyin = "Tāmen shì péngyou ma?",
        staticLeadingText = "她们 是",
        staticLeadingPinyin = "Tā men shì",
        staticTrailingText = "吗？",
        staticTrailingPinyin = "ma",
        wordChips = listOf("同学:tóngxué", "老师:lǎoshī", "朋友:péngyou", "学生:xuéshēng"),
        correctAnswer = "朋友",
        audioToSpeak = "她们是朋友吗？"
    ),

    // 2. Soal 2: Pilih terjemahan yang benar (teman sekolah -> tóngxué / 同学)
    Exercise(
        id = "u2_s2_p1_q2",
        type = ExerciseType.SENTENCE_CHOICE,
        title = "Pilih terjemahan yang benar",
        targetTranslation = "teman sekolah",
        options = listOf(
            "péngyou\n朋友",
            "lǎoshī\n老师",
            "xuéshēng\n学生",
            "tóngxué\n同学"
        ),
        correctAnswer = "tóngxué\n同学",
        audioToSpeak = "同学"
    ),

    // 3. Soal 3: Apa yang Anda dengar? (我们不是朋友。)
    Exercise(
        id = "u2_s2_p1_q3",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Apa yang Anda dengar?",
        isImmersiveSpeaker = true,
        illustrationRes = R.drawable.img_wang_fei_girl,
        targetHanzi = "我们不是朋友。",
        targetPinyin = "Wǒmen bú shì péngyou.",
        targetTranslation = "Kami bukan teman.",
        wordChips = listOf("我:wǒ", "们:men", "不:bù", "是:shì", "朋友:péngyou", "你:nǐ", "同学:tóngxué", "人:rén"),
        correctAnswer = "我,们,不,是,朋友",
        audioToSpeak = "我们不是朋友。"
    ),

    // 4. Soal 4: Selesaikan percakapan (你们 是 同学 吗？ -> 不是 ， 我们 不是 同学 。)
    Exercise(
        id = "u2_s2_p1_q4",
        type = ExerciseType.SENTENCE_CHOICE,
        title = "Selesaikan percakapan",
        dialogueSpeakerText = "你们 是 同学 吗？",
        dialogueSpeakerPinyin = "Nǐ men shì tóngxué ma",
        options = listOf(
            "Bú shì  wǒ men shì Zhōngguó rén\n不是 ， 我们 是 中国 人 。",
            "Bú shì  wǒ men bú shì yīshēng\n不是 ， 我们 不是 医生 。",
            "Bú shì  wǒ men bú shì tóngxué\n不是 ， 我们 不是 同学 。"
        ),
        correctAnswer = "Bú shì  wǒ men bú shì tóngxué\n不是 ， 我们 不是 同学 。",
        audioToSpeak = "不是，我们不是同学。"
    ),

    // 5. Soal 5: Lengkapi terjemahan (Apakah kalian teman kelas? -> 你 [们] [是] [同学] 吗？)
    Exercise(
        id = "u2_s2_p1_q5",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Lengkapi terjemahan",
        targetTranslation = "Apakah kalian teman kelas?",
        targetHanzi = "你们是同学吗？",
        targetPinyin = "Nǐmen shì tóngxué ma?",
        staticLeadingText = "你",
        staticLeadingPinyin = "Nǐ",
        staticTrailingText = "吗？",
        staticTrailingPinyin = "ma",
        wordChips = listOf("学生:xuéshēng", "同学:tóngxué", "们:men", "是:shì", "老师:lǎoshī", "不:bù", "朋友:péngyou"),
        correctAnswer = "们,是,同学",
        audioToSpeak = "你们是同学吗？"
    ),

    // 6. Soal 6: Dengarkan kalimat dan pilih terjemahan yang benar (我们不是同学。)
    Exercise(
        id = "u2_s2_p1_q6",
        type = ExerciseType.SENTENCE_CHOICE,
        title = "Dengarkan kalimat dan pilih terjemahan yang benar",
        isImmersiveSpeaker = true,
        illustrationRes = R.drawable.img_two_students_studying,
        options = listOf(
            "Mereka(L) bukan teman.",
            "Kami adalah teman kelas.",
            "Kami bukan teman.",
            "Kami bukan teman kelas."
        ),
        correctAnswer = "Kami bukan teman kelas.",
        audioToSpeak = "我们不是同学。"
    ),

    // 7. Soal 7: Ketuk pasangan yang sesuai (4 Pasang Kartu)
    Exercise(
        id = "u2_s2_p1_q7",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u2_s2_p1_q7_m1", "们", "men", "penanda jamak"),
            MatchPairItem("u2_s2_p1_q7_m2", "同学", "tóngxué", "teman sekolah"),
            MatchPairItem("u2_s2_p1_q7_m3", "朋友", "péngyou", "teman"),
            MatchPairItem("u2_s2_p1_q7_m4", "我们", "wǒmen", "kami / kita")
        )
    ),

    // 8. Soal 8: Pilih kalimat yang tepat untuk menyelesaikan percakapan (你们 是 朋友 吗？ -> 是 ， 我们 是 朋友 。)
    Exercise(
        id = "u2_s2_p1_q8",
        type = ExerciseType.SENTENCE_CHOICE,
        title = "Pilih kalimat yang tepat untuk menyelesaikan percakapan",
        dialogueSpeakerText = "你们 是 朋友 吗？",
        dialogueSpeakerPinyin = "Nǐ men shì péngyou ma",
        options = listOf(
            "Shì  tā men shì tóngxué\n是 ， 他们 是 同学 。",
            "Shì  wǒ men shì péngyou\n是 ， 我们 是 朋友 。",
            "Bú shì  wǒ men bú shì xuéshēng\n不是 ， 我们 不是 学生 。"
        ),
        correctAnswer = "Shì  wǒ men shì péngyou\n是 ， 我们 是 朋友 。",
        audioToSpeak = "是，我们是朋友。"
    ),

    // 9. Soal 9: Terjemahkan kalimat ini (Kami adalah teman kelas. -> 我们是同学。)
    Exercise(
        id = "u2_s2_p1_q9",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Terjemahkan kalimat ini",
        targetTranslation = "Kami adalah teman kelas.",
        targetHanzi = "我们是同学。",
        targetPinyin = "Wǒmen shì tóngxué.",
        wordChips = listOf("不:bù", "我:wǒ", "同学:tóngxué", "们:men", "是:shì", "老师:lǎoshī", "人:rén"),
        correctAnswer = "我,们,是,同学",
        audioToSpeak = "我们是同学。"
    )
)
