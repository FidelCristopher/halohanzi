package com.example.chineselearning.data.repository

import com.example.chineselearning.R
import com.example.chineselearning.data.model.*

val stage1Part2Exercises = listOf<Exercise>(
    // 1. Soal 1: Pilihan Gambar (男朋友 -> (laki-laki) pacar)
    Exercise(
        id = "u2_p2_q1",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "男朋友",
        targetPinyin = "nánpéngyou",
        targetTranslation = "(laki-laki) pacar",
        correctAnswer = "(laki-laki) pacar",
        audioToSpeak = "男朋友",
        pictureOptions = listOf(
            PictureOption("u2_p2_q1_opt1", "teman sekolah", "同学", R.drawable.ill_cartoon_teman_sekolah, false),
            PictureOption("u2_p2_q1_opt2", "(perempuan) pacar", "女朋友", R.drawable.ill_cartoon_dia_perempuan, false),
            PictureOption("u2_p2_q1_opt3", "teman", "朋友", R.drawable.ill_cartoon_teman, false),
            PictureOption("u2_p2_q1_opt4", "(laki-laki) pacar", "男朋友", R.drawable.ill_cartoon_dia_pria, true)
        )
    ),

    // 2. Soal 2: Lengkapi terjemahan (Wǒ de nánpéngyou shì yīshēng . / 我的 男朋友 是 医生 。 -> [Pacar(L)] saya adalah seorang dokter.)
    Exercise(
        id = "u2_p2_q2",
        type = ExerciseType.FILL_BLANK,
        title = "Lengkapi terjemahan",
        targetHanzi = "我的 男朋友 是 医生 。",
        targetPinyin = "Wǒ de nánpéngyou shì yīshēng .",
        targetTranslation = "Pacar(L) saya adalah seorang dokter.",
        sentenceWithBlank = "________ saya adalah seorang dokter.",
        options = listOf("Pacar(L)", "Istri", "Suami"),
        correctAnswer = "Pacar(L)",
        audioToSpeak = "我的男朋友是医生。"
    ),

    // 3. Soal 3: Pilihan Gambar (女朋友 -> (perempuan) pacar)
    Exercise(
        id = "u2_p2_q3",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "女朋友",
        targetPinyin = "nǚpéngyou",
        targetTranslation = "(perempuan) pacar",
        correctAnswer = "(perempuan) pacar",
        audioToSpeak = "女朋友",
        pictureOptions = listOf(
            PictureOption("u2_p2_q3_opt1", "(laki-laki) pacar", "男朋友", R.drawable.ill_cartoon_dia_pria, false),
            PictureOption("u2_p2_q3_opt2", "(perempuan) pacar", "女朋友", R.drawable.ill_cartoon_dia_perempuan, true),
            PictureOption("u2_p2_q3_opt3", "teman sekolah", "同学", R.drawable.ill_cartoon_teman_sekolah, false),
            PictureOption("u2_p2_q3_opt4", "teman", "朋友", R.drawable.ill_cartoon_teman, false)
        )
    ),

    // 4. Soal 4: Pilih terjemahan yang benar (我的 女朋友 是 我的 同学 。 -> Pacar(P) saya adalah teman kelas saya.)
    Exercise(
        id = "u2_p2_q4",
        type = ExerciseType.SENTENCE_CHOICE,
        title = "Pilih terjemahan yang benar",
        targetHanzi = "我的 女朋友 是 我的 同学 。",
        targetPinyin = "Wǒ de nǚpéngyou shì wǒ de tóngxué .",
        targetTranslation = "Pacar(P) saya adalah teman kelas saya.",
        options = listOf(
            "Dia(P) bukan pacarmu(P).",
            "Pacar(L) saya adalah teman kelas saya.",
            "Pacar(L) saya adalah orang Tiongkok.",
            "Pacar(P) saya adalah teman kelas saya."
        ),
        correctAnswer = "Pacar(P) saya adalah teman kelas saya.",
        audioToSpeak = "我的女朋友是我的同学。"
    ),

    // 5. Soal 5: Apa yang Anda dengar? (你的 男朋友 是 中国 人 吗？)
    Exercise(
        id = "u2_p2_q5",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Apa yang Anda dengar?",
        isImmersiveSpeaker = true,
        illustrationRes = R.drawable.img_teacher_glasses,
        targetHanzi = "你的男朋友是中国人吗？",
        targetPinyin = "Nǐ de nánpéngyou shì Zhōngguó rén ma?",
        targetTranslation = "Apakah pacarmu(L) orang Tiongkok?",
        wordChips = listOf("你:nǐ", "的:de", "男朋友:nánpéngyou", "是:shì", "中国:Zhōngguó", "人:rén", "吗:ma", "女朋友:nǚpéngyou", "朋友:péngyou", "不:bù", "们:men"),
        correctAnswer = "你,的,男朋友,是,中国,人,吗",
        audioToSpeak = "你的男朋友是中国人吗？"
    ),

    // 6. Soal 6: Pilih terjemahan yang benar (Apakah pacarmu(P) seorang guru? -> 你的女朋友是老师吗？)
    Exercise(
        id = "u2_p2_q6",
        type = ExerciseType.SENTENCE_CHOICE,
        title = "Pilih terjemahan yang benar",
        targetTranslation = "Apakah pacarmu(P) seorang guru?",
        options = listOf(
            "Nǐ de nánpéngyou shì Zhōngguó rén ma\n你的 男朋友 是 中国 人 吗？",
            "Nǐ de nǚpéngyou shì yīshēng ma\n你的 女朋友 是 医生 吗？",
            "Nǐ de nǚpéngyou shì lǎoshī ma\n你的 女朋友 是 老师 吗？",
            "Tā shì nǐ de nánpéngyou ma\n他是你的 男朋友 吗？"
        ),
        correctAnswer = "Nǐ de nǚpéngyou shì lǎoshī ma\n你的 女朋友 是 老师 吗？",
        audioToSpeak = "你的女朋友是老师吗？"
    ),

    // 7. Soal 7: Ketuk pasangan yang sesuai (4 Pasang Kartu)
    Exercise(
        id = "u2_p2_q7",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u2_p2_q7_m1", "女朋友", "nǚpéngyou", "(perempuan) pacar"),
            MatchPairItem("u2_p2_q7_m2", "男朋友", "nánpéngyou", "(laki-laki) pacar"),
            MatchPairItem("u2_p2_q7_m3", "朋友", "péngyou", "teman"),
            MatchPairItem("u2_p2_q7_m4", "同学", "tóngxué", "teman sekolah")
        )
    ),

    // 8. Soal 8: Apa yang Anda dengar? (我是他 的 女朋友 。)
    Exercise(
        id = "u2_p2_q8",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Apa yang Anda dengar?",
        isImmersiveSpeaker = true,
        illustrationRes = R.drawable.img_couple_peace_sign,
        targetHanzi = "我是他的女朋友。",
        targetPinyin = "Wǒ shì tā de nǚpéngyou.",
        targetTranslation = "Saya adalah pacar(P)-nya.",
        wordChips = listOf("我:wǒ", "是:shì", "他:tā", "的:de", "女朋友:nǚpéngyou", "同学:tóngxué", "男朋友:nánpéngyou", "朋友:péngyou", "们:men"),
        correctAnswer = "我,是,他,的,女朋友",
        audioToSpeak = "我是他的女朋友。"
    ),

    // 9. Soal 9: Lengkapi terjemahan (Pacar(L) saya adalah orang Tiongkok. -> 我 [的] [男朋友] 是 中国 人 。)
    Exercise(
        id = "u2_p2_q9",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Lengkapi terjemahan",
        targetTranslation = "Pacar(L) saya adalah orang Tiongkok.",
        targetHanzi = "我的男朋友是中国人。",
        targetPinyin = "Wǒ de nánpéngyou shì Zhōngguó rén.",
        staticLeadingText = "我",
        staticLeadingPinyin = "Wǒ",
        staticTrailingText = "是 中国",
        staticTrailingPinyin = "shì Zhōngguó",
        hasTrailingLine2 = true,
        trailingLine2Text = "人 。",
        trailingLine2Pinyin = "rén",
        wordChips = listOf("同学:tóngxué", "女朋友:nǚpéngyou", "男朋友:nánpéngyou", "的:de", "们:men", "朋友:péngyou"),
        correctAnswer = "的,男朋友",
        audioToSpeak = "我的男朋友是中国人。"
    )
)
