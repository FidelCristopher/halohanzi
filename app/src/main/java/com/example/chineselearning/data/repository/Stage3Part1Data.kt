package com.example.chineselearning.data.repository

import com.example.chineselearning.R
import com.example.chineselearning.data.model.*

val stage3Part1Exercises = listOf<Exercise>(
    // 1. Soal 1: Pilihan Gambar (同事 -> rekan kerja, kolega)
    Exercise(
        id = "u2_s3_p1_q1",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "同事",
        targetPinyin = "tóngshì",
        targetTranslation = "rekan kerja, kolega",
        correctAnswer = "rekan kerja, kolega",
        audioToSpeak = "同事",
        pictureOptions = listOf(
            PictureOption("u2_s3_p1_q1_opt1", "bos", "老板", R.drawable.ill_cartoon_guru, false),
            PictureOption("u2_s3_p1_q1_opt2", "guru", "老师", R.drawable.ill_cartoon_guru, false),
            PictureOption("u2_s3_p1_q1_opt3", "rekan kerja, kolega", "同事", R.drawable.ill_cartoon_teman_sekolah, true),
            PictureOption("u2_s3_p1_q1_opt4", "teman sekolah", "同学", R.drawable.ill_cartoon_teman_sekolah, false)
        )
    ),

    // 2. Soal 2: Pilihan Gambar (老板 -> bos)
    Exercise(
        id = "u2_s3_p1_q2",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "老板",
        targetPinyin = "lǎobǎn",
        targetTranslation = "bos",
        correctAnswer = "bos",
        audioToSpeak = "老板",
        pictureOptions = listOf(
            PictureOption("u2_s3_p1_q2_opt1", "(perempuan) pacar", "女朋友", R.drawable.ill_cartoon_dia_perempuan, false),
            PictureOption("u2_s3_p1_q2_opt2", "bos", "老板", R.drawable.ill_cartoon_guru, true),
            PictureOption("u2_s3_p1_q2_opt3", "murid", "学生", R.drawable.ill_cartoon_murid, false),
            PictureOption("u2_s3_p1_q2_opt4", "rekan kerja, kolega", "同事", R.drawable.ill_cartoon_teman_sekolah, false)
        )
    ),

    // 3. Soal 3: Lengkapi terjemahan (这是我的 朋友 。 -> [Ini] adalah teman saya.)
    Exercise(
        id = "u2_s3_p1_q3",
        type = ExerciseType.FILL_BLANK,
        title = "Lengkapi terjemahan",
        targetHanzi = "这 是 我 的 朋友 。",
        targetPinyin = "Zhè shì wǒ de péngyou .",
        sentenceWithBlank = "________ adalah teman saya.",
        options = listOf("Ini", "Mereka", "Dia", "Itu"),
        correctAnswer = "Ini",
        audioToSpeak = "这是我的朋友。"
    ),

    // 4. Soal 4: Pilih terjemahan yang benar (那是你的 老板 吗？ -> Apakah itu bosmu?)
    Exercise(
        id = "u2_s3_p1_q4",
        type = ExerciseType.SENTENCE_CHOICE,
        title = "Pilih terjemahan yang benar",
        targetHanzi = "那 是 你 的 老板 吗？",
        targetPinyin = "Nà shì nǐ de lǎobǎn ma",
        options = listOf(
            "Apakah dia(L) bos kita?",
            "Apakah itu bosmu?",
            "Apakah itu pacarnya(P) bos?",
            "Apakah itu rekan kerja kita?"
        ),
        correctAnswer = "Apakah itu bosmu?",
        audioToSpeak = "那是你的老板吗？"
    ),

    // 5. Soal 5: Pilih kata yang sesuai dengan gambar (同事)
    Exercise(
        id = "u2_s3_p1_q5",
        type = ExerciseType.SENTENCE_CHOICE,
        title = "Pilih kata yang sesuai dengan gambar",
        targetTranslation = "rekan kerja",
        options = listOf(
            "nà\n那",
            "men\n们",
            "tóngshì\n同事",
            "zhè\n这"
        ),
        correctAnswer = "tóngshì\n同事",
        audioToSpeak = "同事"
    ),

    // 6. Soal 6: Apa yang Anda dengar? (那是我的 同事 。)
    Exercise(
        id = "u2_s3_p1_q6",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Apa yang Anda dengar?",
        isImmersiveSpeaker = true,
        illustrationRes = R.drawable.img_teacher_glasses,
        targetHanzi = "那 是 我 的 同事。",
        targetPinyin = "Nà shì wǒ de tóngshì.",
        targetTranslation = "Itu adalah rekan kerja saya.",
        wordChips = listOf("那:nà", "是我的:shì wǒ de", "同事:tóngshì", "男朋友:nánpéngyou", "同学:tóngxué", "这:zhè", "老师:lǎoshī"),
        correctAnswer = "那,是我的,同事",
        audioToSpeak = "那是我的同事。"
    ),

    // 7. Soal 7: Pilih terjemahan yang benar (Ini adalah bos kami. -> 这是我们 的 老板 。)
    Exercise(
        id = "u2_s3_p1_q7",
        type = ExerciseType.SENTENCE_CHOICE,
        title = "Pilih terjemahan yang benar",
        targetTranslation = "Ini adalah bos kami.",
        options = listOf(
            "Zhè shì wǒ de péngyou\n这是我的 朋友 。",
            "Zhè shì lǎobǎn de péngyou\n这是 老板 的 朋友 。",
            "Zhè bú shì wǒ men de tóngshì\n这不是我们 的 同事 。",
            "Zhè shì wǒ men de lǎobǎn\n这是我们 的 老板 。"
        ),
        correctAnswer = "Zhè shì wǒ men de lǎobǎn\n这是我们 的 老板 。",
        audioToSpeak = "这是我们的老板。"
    ),

    // 8. Soal 8: Ketuk pasangan yang sesuai (4 Pasang Kartu)
    Exercise(
        id = "u2_s3_p1_q8",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u2_s3_p1_q8_m1", "这", "zhè", "ini"),
            MatchPairItem("u2_s3_p1_q8_m2", "那", "nà", "itu"),
            MatchPairItem("u2_s3_p1_q8_m3", "同事", "tóngshì", "rekan kerja, kolega"),
            MatchPairItem("u2_s3_p1_q8_m4", "老板", "lǎobǎn", "bos")
        )
    ),

    // 9. Soal 9: Apa yang Anda dengar? (这是 老板 的 朋友 。)
    Exercise(
        id = "u2_s3_p1_q9",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Apa yang Anda dengar?",
        isImmersiveSpeaker = true,
        illustrationRes = R.drawable.img_girl_laptop_teacher,
        targetHanzi = "这 是 老板 的 朋友。",
        targetPinyin = "Zhè shì lǎobǎn de péngyou.",
        targetTranslation = "Ini adalah teman bos.",
        wordChips = listOf("这:zhè", "是:shì", "老板:lǎobǎn", "的:de", "朋友:péngyou", "同事:tóngshì", "我:wǒ", "女朋友:nǚpéngyou", "那:nà"),
        correctAnswer = "这,是,老板,的,朋友",
        audioToSpeak = "这是老板的朋友。"
    ),

    // 10. Soal 10: Lengkapi terjemahan (Apakah itu rekan kerja kita? -> [那] 是 我们 的 [同事] 吗？)
    Exercise(
        id = "u2_s3_p1_q10",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Lengkapi terjemahan",
        targetTranslation = "Apakah itu rekan kerja kita?",
        targetHanzi = "那 是 我们 的 同事 吗？",
        targetPinyin = "Nà shì wǒmen de tóngshì ma?",
        staticLeadingText = "",
 staticTrailingText = "是 我们 的",
 hasTrailingLine2 = true,
 trailingLine2Text = "吗？",
 wordChips = listOf("那:nà", "这:zhè", "同事:tóngshì", "你:nǐ", "同学:tóngxué", "老师:lǎoshī"),
 correctAnswer = "那,同事",
 audioToSpeak = "那是我们的同事吗？"
    )
)
