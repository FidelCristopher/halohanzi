package com.example.chineselearning.data.repository

import com.example.chineselearning.R
import com.example.chineselearning.data.model.*

val stage4Part1Exercises = listOf<Exercise>(
    // 1. Soal 1: Lengkapi terjemahan (Kami adalah rekan kerja. -> 我们 是 [同事] 。)
    Exercise(
        id = "u2_s4_p1_q1",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Lengkapi terjemahan",
        targetTranslation = "Kami adalah rekan kerja.",
        targetHanzi = "我们 是 同事。",
        targetPinyin = "Wǒmen shì tóngshì.",
        staticLeadingText = "我们 是",
        staticLeadingPinyin = "Wǒ men shì",
        staticTrailingText = "。",
        wordChips = listOf("同事:tóngshì", "老师:lǎoshī", "老板:lǎobǎn", "男朋友:nánpéngyou", "同学:tóngxué"),
        correctAnswer = "同事",
        audioToSpeak = "我们是同事。"
    ),

    // 2. Soal 2: Pilih terjemahan yang benar (ini -> zhè / 这)
    Exercise(
        id = "u2_s4_p1_q2",
        type = ExerciseType.SENTENCE_CHOICE,
        title = "Pilih terjemahan yang benar",
        targetTranslation = "ini",
        options = listOf(
            "wǒ\n我",
            "nà\n那",
            "zhè\n这",
            "nǐ\n你"
        ),
        correctAnswer = "zhè\n这",
        audioToSpeak = "这"
    ),

    // 3. Soal 3: Lengkapi terjemahan (Apakah itu pacarnya(P) bos? -> [那] [是] [老板] 的 女朋友 吗？)
    Exercise(
        id = "u2_s4_p1_q3",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Lengkapi terjemahan",
        targetTranslation = "Apakah itu pacarnya(P) bos?",
        targetHanzi = "那 是 老板 的 女朋友 吗？",
        targetPinyin = "Nà shì lǎobǎn de nǚpéngyou ma?",
        staticTrailingText = "的 女朋友",
        staticTrailingPinyin = "de nǚpéngyou",
        hasTrailingLine2 = true,
        trailingLine2Text = "吗？",
        trailingLine2Pinyin = "ma",
        wordChips = listOf("那:nà", "老板:lǎobǎn", "是:shì", "这:zhè", "学生:xuéshēng", "同事:tóngshì", "你:nǐ"),
        correctAnswer = "那,是,老板",
        audioToSpeak = "那是老板的女朋友吗？"
    ),

    // 4. Soal 4: Apa yang Anda dengar? (那是我们的同事吗？)
    Exercise(
        id = "u2_s4_p1_q4",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Apa yang Anda dengar?",
        isImmersiveSpeaker = true,
        illustrationRes = R.drawable.img_teacher_glasses,
        targetHanzi = "那 是 我们 的 同事 吗？",
        targetPinyin = "Nà shì wǒmen de tóngshì ma?",
        targetTranslation = "Apakah itu rekan kerja kita?",
        wordChips = listOf("那:nà", "是:shì", "我:wǒ", "们:men", "的:de", "同事:tóngshì", "吗:ma", "男朋友:nánpéngyou", "同学:tóngxué", "老板:lǎobǎn"),
        correctAnswer = "那,是,我,们,的,同事,吗",
        audioToSpeak = "那是我们的同事吗？"
    ),

    // 5. Soal 5: Pilih kalimat yang benar secara tata bahasa (这是 老板 的 朋友 。)
    Exercise(
        id = "u2_s4_p1_q5",
        type = ExerciseType.SENTENCE_CHOICE,
        title = "Pilih kalimat yang benar secara tata bahasa",
        options = listOf(
            "Zhè shì lǎobǎn de péngyou\n这 是 老板 的 朋友。",
            "Lǎobǎn de péngyou shì zhè\n老板 的 朋友 是 这。"
        ),
        correctAnswer = "Zhè shì lǎobǎn de péngyou\n这 是 老板 的 朋友。",
        audioToSpeak = "这是老板的朋友。"
    ),

    // 6. Soal 6: Dengarkan kalimat dan pilih terjemahan yang benar (这是我们的老板。)
    Exercise(
        id = "u2_s4_p1_q6",
        type = ExerciseType.SENTENCE_CHOICE,
        title = "Dengarkan kalimat dan pilih terjemahan yang benar",
        isImmersiveSpeaker = true,
        illustrationRes = R.drawable.img_two_students_studying,
        options = listOf(
            "Itu bukan teman saya.",
            "Ini bukan rekan kerja kita.",
            "Ini adalah teman bos.",
            "Ini adalah bos kami."
        ),
        correctAnswer = "Ini adalah bos kami.",
        audioToSpeak = "这是我们的老板。"
    ),

    // 7. Soal 7: Lengkapi terjemahan (Ini bukan rekan kerja kita. -> [这] 不 [是] [我] [们] 的 [同事] 。)
    Exercise(
        id = "u2_s4_p1_q7",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Lengkapi terjemahan",
        targetTranslation = "Ini bukan rekan kerja kita.",
        targetHanzi = "这 不 是 我们 的 同事。",
        targetPinyin = "Zhè bú shì wǒmen de tóngshì.",
        staticTrailingText = "不",
        hasTrailingLine2 = true,
        trailingLine2Text = "的",
        wordChips = listOf("这:zhè", "老师:lǎoshī", "同事:tóngshì", "同学:tóngxué", "们:men", "老板:lǎobǎn", "是:shì", "那:nà"),
        correctAnswer = "这,是,们,同事",
        audioToSpeak = "这不是我们的同事。"
    ),

    // 8. Soal 8: Ketuk pasangan yang sesuai (4 Pasang Kartu)
    Exercise(
        id = "u2_s4_p1_q8",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u2_s4_p1_q8_m1", "老板", "lǎobǎn", "bos"),
            MatchPairItem("u2_s4_p1_q8_m2", "同事", "tóngshì", "rekan kerja, kolega"),
            MatchPairItem("u2_s4_p1_q8_m3", "这", "zhè", "ini"),
            MatchPairItem("u2_s4_p1_q8_m4", "那", "nà", "itu")
        )
    ),

    // 9. Soal 9: Pilih kalimat yang tepat untuk menyelesaikan percakapan
    Exercise(
        id = "u2_s4_p1_q9",
        type = ExerciseType.SENTENCE_CHOICE,
        title = "Pilih kalimat yang tepat untuk menyelesaikan percakapan",
        dialogueSpeakerText = "那是你们 的 老板 吗？",
        dialogueSpeakerPinyin = "Nà shì nǐ men de lǎobǎn ma",
        options = listOf(
            "Bú shì nà bú shì wǒ men de lǎobǎn\n不 是， 那 不 是 我 们 的 老板。",
            "Shì tā shì wǒ de xuéshēng\n是， 他 是 我 的 学生。"
        ),
        correctAnswer = "Bú shì nà bú shì wǒ men de lǎobǎn\n不 是， 那 不 是 我 们 的 老板。",
        audioToSpeak = "不是，那不是我们的老板。"
    ),

    // 10. Soal 10: Terjemahkan kalimat ini (Itu adalah rekan kerja saya. -> 那是我的同事。)
    Exercise(
        id = "u2_s4_p1_q10",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Terjemahkan kalimat ini",
        targetTranslation = "Itu adalah rekan kerja saya.",
        targetHanzi = "那 是 我 的 同事。",
        targetPinyin = "Nà shì wǒ de tóngshì.",
        wordChips = listOf("老板:lǎobǎn", "的:de", "这:zhè", "老师:lǎoshī", "是:shì", "那:nà", "我:wǒ", "同事:tóngshì"),
        correctAnswer = "那,是,我,的,同事",
        audioToSpeak = "那是我的同事。"
    )
)
