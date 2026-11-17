package com.example.chineselearning.data.repository

import com.example.chineselearning.R
import com.example.chineselearning.data.model.*

val stage5Part2Exercises = listOf<Exercise>(
    // 1. Soal 1: Lengkapi kalimat (我们 [是] [邻居] 。)
    Exercise(
        id = "u2_s5_p2_q1",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Lengkapi kalimat",
        targetTranslation = "Kami adalah tetangga.",
        targetHanzi = "我们 是 邻居。",
        targetPinyin = "Wǒmen shì línjū.",
        staticLeadingText = "我们",
        staticLeadingPinyin = "Wǒmen",
        staticTrailingText = "。",
        wordChips = listOf("是:shì", "邻居:línjū", "网友:wǎngyǒu", "同学:tóngxué"),
        correctAnswer = "是,邻居",
        audioToSpeak = "我们是邻居。"
    ),

    // 2. Soal 2: Apa yang Anda dengar? (你是我的网友吗)
    Exercise(
        id = "u2_s5_p2_q2",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Apa yang Anda dengar?",
        isImmersiveSpeaker = true,
        illustrationRes = R.drawable.img_frog_dinner_phone,
        targetHanzi = "你 是 我 的 网友 吗？",
        targetPinyin = "Nǐ shì wǒ de wǎngyǒu ma?",
        targetTranslation = "Apakah kamu teman onlineku?",
        wordChips = listOf("你:nǐ", "是:shì", "我:wǒ", "的:de", "网友:wǎngyǒu", "吗:ma", "邻居:línjū", "同学:tóngxué", "老板:lǎobǎn"),
        correctAnswer = "你,是,我,的,网友,吗",
        audioToSpeak = "你是我的网友吗？"
    ),

    // 3. Soal 3: Lengkapi kalimat (我 是 你的 [老板] 。)
    Exercise(
        id = "u2_s5_p2_q3",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Lengkapi kalimat",
        targetTranslation = "Saya adalah bosmu.",
        targetHanzi = "我 是 你 的 老板。",
        targetPinyin = "Wǒ shì nǐ de lǎobǎn.",
        staticLeadingText = "我 是 你的",
        staticLeadingPinyin = "Wǒ shì nǐ de",
        staticTrailingText = "。",
        wordChips = listOf("老板:lǎobǎn", "邻居:línjū", "网友:wǎngyǒu"),
        correctAnswer = "老板",
        audioToSpeak = "我是你的老板。"
    ),

    // 4. Soal 4: Selesaikan dialog (你们的老板是谁？ -> 我们的老板是王飞。)
    Exercise(
        id = "u2_s5_p2_q4",
        type = ExerciseType.SENTENCE_CHOICE,
        title = "Pilih kalimat yang benar untuk melengkapi dialog",
        dialogueSpeakerText = "你们 的 老板 是 谁 ？",
        dialogueSpeakerPinyin = "Nǐ men de lǎobǎn shì shéi",
        options = listOf(
            "Wǒ men de lǎobǎn shì WángFēi\n我 们 的 老板 是 王飞。",
            "Nà bú shì wǒ men de lǎobǎn\n那 不 是 我 们 的 老板。",
            "Nà shì wǒ de nǚpéngyou\n那 是 我 的 女朋友。"
        ),
        correctAnswer = "Wǒ men de lǎobǎn shì WángFēi\n我 们 的 老板 是 王飞。",
        audioToSpeak = "我们的老板是王飞。"
    ),

    // 5. Soal 5: Apa yang Anda dengar? (这是我的室友)
    Exercise(
        id = "u2_s5_p2_q5",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Apa yang Anda dengar?",
        isImmersiveSpeaker = true,
        illustrationRes = R.drawable.img_cat_duck_roommates,
        targetHanzi = "这 是 我 的 室友。",
        targetPinyin = "Zhè shì wǒ de shìyǒu.",
        targetTranslation = "Ini adalah teman sekamarku.",
        wordChips = listOf("这:zhè", "是:shì", "我:wǒ", "的:de", "室友:shìyǒu", "那:nà", "网友:wǎngyǒu", "你:nǐ"),
        correctAnswer = "这,是,我,的,室友",
        audioToSpeak = "这是我的室友。"
    ),

    // 6. Soal 6: Buat kalimat menggunakan semua kata berdasarkan gambar (你是谁？)
    Exercise(
        id = "u2_s5_p2_q6",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Buat kalimat menggunakan semua kata berdasarkan gambar",
        illustrationRes = R.drawable.img_ghost_hill,
        targetTranslation = "Siapa kamu?",
        targetHanzi = "你 是 谁？",
        targetPinyin = "Nǐ shì shéi?",
        wordChips = listOf("是:shì", "谁:shéi", "你:nǐ"),
        correctAnswer = "你,是,谁",
        audioToSpeak = "你是谁？"
    ),

    // 7. Soal 7: Lengkapi kalimat (那 是 我们 的 [邻居] 。)
    Exercise(
        id = "u2_s5_p2_q7",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Lengkapi kalimat",
        targetTranslation = "Itu adalah tetangga kita.",
        targetHanzi = "那 是 我们 的 邻居。",
        targetPinyin = "Nà shì wǒmen de línjū.",
        staticLeadingText = "那 是 我们 的",
        staticLeadingPinyin = "Nà shì wǒmen de",
        staticTrailingText = "。",
        wordChips = listOf("邻居:línjū", "同学:tóngxué", "老板:lǎobǎn"),
        correctAnswer = "邻居",
        audioToSpeak = "那是我们的邻居。"
    ),

    // 8. Soal 8: Buat kalimat menggunakan semua kata berdasarkan gambar (这是你吗？)
    Exercise(
        id = "u2_s5_p2_q8",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Buat kalimat menggunakan semua kata berdasarkan gambar",
        illustrationRes = R.drawable.img_girl_in_car,
        targetTranslation = "Apakah ini kamu?",
        targetHanzi = "这 是 你 吗？",
        targetPinyin = "Zhè shì nǐ ma?",
        wordChips = listOf("这:zhè", "吗:ma", "你:nǐ", "是:shì"),
        correctAnswer = "这,是,你,吗",
        audioToSpeak = "这是你吗？"
    )
)
