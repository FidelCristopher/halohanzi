package com.example.chineselearning.data.repository

import com.example.chineselearning.R
import com.example.chineselearning.data.model.*

val stage2Part2Exercises = listOf<Exercise>(
    // 1. Soal 1: Lengkapi terjemahan (Pacar(P) saya bernama Wang Fei. -> 我的 [女朋友] 叫 王飞 。)
    Exercise(
        id = "u2_s2_p2_q1",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Lengkapi terjemahan",
        targetTranslation = "Pacar(P) saya bernama Wang Fei.",
        targetHanzi = "我的女朋友叫王飞。",
        targetPinyin = "Wǒ de nǚpéngyou jiào WángFēi.",
        staticLeadingText = "我的",
        staticLeadingPinyin = "Wǒ de",
        staticTrailingText = "叫 王飞 。",
        staticTrailingPinyin = "jiào WángFēi",
        wordChips = listOf("女朋友:nǚpéngyou", "男朋友:nánpéngyou", "朋友:péngyou", "同学:tóngxué"),
        correctAnswer = "女朋友",
        audioToSpeak = "我的女朋友叫王飞。"
    ),

    // 2. Soal 2: Apa yang Anda dengar? (我的男朋友是我的同学。)
    Exercise(
        id = "u2_s2_p2_q2",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Apa yang Anda dengar?",
        isImmersiveSpeaker = true,
        illustrationRes = R.drawable.img_couple_peace_sign,
        targetHanzi = "我的男朋友是我的同学。",
        targetPinyin = "Wǒ de nánpéngyou shì wǒ de tóngxué.",
        targetTranslation = "Pacar(L) saya adalah teman kelas saya.",
        wordChips = listOf("我:wǒ", "的:de", "男朋友:nánpéngyou", "是:shì", "我:wǒ", "的:de", "同学:tóngxué", "不:bù", "女朋友:nǚpéngyou", "们:men"),
        correctAnswer = "我,的,男朋友,是,我,的,同学",
        audioToSpeak = "我的男朋友是我的同学。"
    ),

    // 3. Soal 3: Selesaikan percakapan (王飞 是 你的 女朋友 吗？ -> 不是 ， 我们 是 朋友 。)
    Exercise(
        id = "u2_s2_p2_q3",
        type = ExerciseType.SENTENCE_CHOICE,
        title = "Selesaikan percakapan",
        dialogueBlankIsFirst = true,
        dialogueSpeakerText = "不是 ， 我们 是 朋友 。",
        dialogueSpeakerPinyin = "Bú shì  wǒ men shì péngyou",
        options = listOf(
            "WángFēi shì nǐ de nǚpéngyou ma\n王飞 是 你的 女朋友 吗？",
            "Nǐ shì xuéshēng ma\n你是 学生 吗？",
            "Nǐ de nǚpéngyou shì lǎoshī ma\n你的 女朋友 是 老师 吗？"
        ),
        correctAnswer = "WángFēi shì nǐ de nǚpéngyou ma\n王飞 是 你的 女朋友 吗？",
        audioToSpeak = "王飞是你的女朋友吗？"
    ),

    // 4. Soal 4: Pilih kalimat yang benar secara tata bahasa (他是我的 朋友 。)
    Exercise(
        id = "u2_s2_p2_q4",
        type = ExerciseType.SENTENCE_CHOICE,
        title = "Pilih kalimat yang benar secara tata bahasa",
        options = listOf(
            "Tā shì péngyou de wǒ\n他是 朋友 的 我 。",
            "Tā shì wǒ de péngyou\n他是我的 朋友 。"
        ),
        correctAnswer = "Tā shì wǒ de péngyou\n他是我的 朋友 。",
        audioToSpeak = "他是我的朋友。"
    ),

    // 5. Soal 5: Pilih terjemahan yang benar ((laki-laki) pacar -> nánpéngyou / 男朋友)
    Exercise(
        id = "u2_s2_p2_q5",
        type = ExerciseType.SENTENCE_CHOICE,
        title = "Pilih terjemahan yang benar",
        targetTranslation = "(laki-laki) pacar",
        options = listOf(
            "nánpéngyou\n男朋友",
            "nǚpéngyou\n女朋友",
            "tóngxué\n同学",
            "péngyou\n朋友"
        ),
        correctAnswer = "nánpéngyou\n男朋友",
        audioToSpeak = "男朋友"
    ),

    // 6. Soal 6: Dengarkan kalimat dan pilih terjemahan yang benar (我的女朋友是老师。)
    Exercise(
        id = "u2_s2_p2_q6",
        type = ExerciseType.SENTENCE_CHOICE,
        title = "Dengarkan kalimat dan pilih terjemahan yang benar",
        isImmersiveSpeaker = true,
        illustrationRes = R.drawable.img_two_students_studying,
        options = listOf(
            "Pacar(L) saya adalah seorang dokter.",
            "Pacar(P) saya adalah seorang guru.",
            "Pacar(P) saya bernama Wang Fei.",
            "Saya pacar(P) dia(L)."
        ),
        correctAnswer = "Pacar(P) saya adalah seorang guru.",
        audioToSpeak = "我的女朋友是老师。"
    ),

    // 7. Soal 7: Lengkapi terjemahan (Pacar(L) saya adalah seorang dokter. -> 我 [的] [男朋友] [是] 医生 。)
    Exercise(
        id = "u2_s2_p2_q7",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Lengkapi terjemahan",
        targetTranslation = "Pacar(L) saya adalah seorang dokter.",
        targetHanzi = "我的男朋友是医生。",
        targetPinyin = "Wǒ de nánpéngyou shì yīshēng.",
        staticLeadingText = "我",
        staticLeadingPinyin = "Wǒ",
        staticTrailingText = "医生 。",
        staticTrailingPinyin = "yīshēng",
        wordChips = listOf("是:shì", "同学:tóngxué", "们:men", "不:bù", "的:de", "男朋友:nánpéngyou", "朋友:péngyou"),
        correctAnswer = "的,男朋友,是",
        audioToSpeak = "我的男朋友是医生。"
    ),

    // 8. Soal 8: Pilih kalimat yang tepat untuk menyelesaikan percakapan (她是你的 女朋友 吗？ -> 不是 ， 她 不是 我的 女朋友 。)
    Exercise(
        id = "u2_s2_p2_q8",
        type = ExerciseType.SENTENCE_CHOICE,
        title = "Pilih kalimat yang tepat untuk menyelesaikan percakapan",
        dialogueSpeakerText = "她是你的 女朋友 吗？",
        dialogueSpeakerPinyin = "Tā shì nǐ de nǚpéngyou ma",
        options = listOf(
            "Shì  tā bú shì yīshēng\n是 ， 她 不是 医生 。",
            "Bú shì  tā bú shì wǒ de nǚpéngyou\n不是 ， 她 不是 我的 女朋友 。",
            "Bú shì  tā bú shì wǒ de lǎoshī\n不是 ， 她 不是 我的 老师 。"
        ),
        correctAnswer = "Bú shì  tā bú shì wǒ de nǚpéngyou\n不是 ， 她 不是 我的 女朋友 。",
        audioToSpeak = "不是，她不是我的女朋友。"
    ),

    // 9. Soal 9: Terjemahkan kalimat ini (Dia(L) bukan pacar(L) saya. -> 他不是我的男朋友。)
    Exercise(
        id = "u2_s2_p2_q9",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Terjemahkan kalimat ini",
        targetTranslation = "Dia(L) bukan pacar(L) saya.",
        targetHanzi = "他不是我的男朋友。",
        targetPinyin = "Tā bú shì wǒ de nánpéngyou.",
        wordChips = listOf("我:wǒ", "不:bù", "们:men", "的:de", "女朋友:nǚpéngyou", "他:tā", "是:shì", "同学:tóngxué", "男朋友:nánpéngyou"),
        correctAnswer = "他,不,是,我,的,男朋友",
        audioToSpeak = "他不是我的男朋友。"
    )
)
