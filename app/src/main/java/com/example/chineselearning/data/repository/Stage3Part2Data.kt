package com.example.chineselearning.data.repository

import com.example.chineselearning.R
import com.example.chineselearning.data.model.*

val stage3Part2Exercises = listOf<Exercise>(
    // 1. Soal 1: Pilihan Gambar (邻居 -> tetangga)
    Exercise(
        id = "u2_s3_p2_q1",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "邻居",
        targetPinyin = "línjū",
        targetTranslation = "tetangga",
        correctAnswer = "tetangga",
        audioToSpeak = "邻居",
        pictureOptions = listOf(
            PictureOption("u2_s3_p2_q1_opt1", "tetangga", "邻居", R.drawable.ill_cartoon_guru, true),
            PictureOption("u2_s3_p2_q1_opt2", "teman", "朋友", R.drawable.ill_cartoon_teman, false),
            PictureOption("u2_s3_p2_q1_opt3", "teman online", "网友", R.drawable.ill_cartoon_murid, false),
            PictureOption("u2_s3_p2_q1_opt4", "teman sekamar", "室友", R.drawable.ill_cartoon_teman_sekolah, false)
        )
    ),

    // 2. Soal 2: Pilihan Gambar (网友 -> teman online)
    Exercise(
        id = "u2_s3_p2_q2",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "网友",
        targetPinyin = "wǎngyǒu",
        targetTranslation = "teman online",
        correctAnswer = "teman online",
        audioToSpeak = "网友",
        pictureOptions = listOf(
            PictureOption("u2_s3_p2_q2_opt1", "teman online", "网友", R.drawable.ill_cartoon_murid, true),
            PictureOption("u2_s3_p2_q2_opt2", "tetangga", "邻居", R.drawable.ill_cartoon_guru, false),
            PictureOption("u2_s3_p2_q2_opt3", "teman sekamar", "室友", R.drawable.ill_cartoon_teman_sekolah, false),
            PictureOption("u2_s3_p2_q2_opt4", "teman sekolah", "同学", R.drawable.ill_cartoon_teman_sekolah, false)
        )
    ),

    // 3. Soal 3: Lengkapi terjemahan (这是 谁 ？ -> Ini [siapa] ?)
    Exercise(
        id = "u2_s3_p2_q3",
        type = ExerciseType.FILL_BLANK,
        title = "Lengkapi terjemahan",
        targetHanzi = "这是 谁 ？",
        targetPinyin = "Zhè shì shéi",
        sentenceWithBlank = "Ini ________ ?",
        options = listOf("di mana", "apa", "siapa", "kamu"),
        correctAnswer = "siapa",
        audioToSpeak = "这是谁？"
    ),

    // 4. Soal 4: Pilih terjemahan yang benar (王飞 是 谁 ？ -> Siapa Wang Fei?)
    Exercise(
        id = "u2_s3_p2_q4",
        type = ExerciseType.SENTENCE_CHOICE,
        title = "Pilih terjemahan yang benar",
        targetHanzi = "王飞 是 谁 ？",
        targetPinyin = "WángFēi shì shéi",
        options = listOf(
            "Ini siapa?",
            "Siapa pacar(L) dia(P)?",
            "Siapa Wang Fei?",
            "Itu siapa?"
        ),
        correctAnswer = "Siapa Wang Fei?",
        audioToSpeak = "王飞是谁？"
    ),

    // 5. Soal 5: Apa yang Anda dengar? (你的 网友 是 谁 ？)
    Exercise(
        id = "u2_s3_p2_q5",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Apa yang Anda dengar?",
        isImmersiveSpeaker = true,
        illustrationRes = R.drawable.img_girl_laptop_teacher,
        targetHanzi = "你的网友是谁？",
        targetPinyin = "Nǐ de wǎngyǒu shì shéi?",
        targetTranslation = "Siapa teman onlinemu?",
        wordChips = listOf("你的:nǐ de", "网友:wǎngyǒu", "是:shì", "谁:shéi", "们:men", "室友:shìyǒu", "邻居:línjū", "人:rén"),
        correctAnswer = "你的,网友,是,谁",
        audioToSpeak = "你的网友是谁？"
    ),

    // 6. Soal 6: Pilihan Gambar (室友 -> teman sekamar)
    Exercise(
        id = "u2_s3_p2_q6",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "室友",
        targetPinyin = "shìyǒu",
        targetTranslation = "teman sekamar",
        correctAnswer = "teman sekamar",
        audioToSpeak = "室友",
        pictureOptions = listOf(
            PictureOption("u2_s3_p2_q6_opt1", "teman online", "网友", R.drawable.ill_cartoon_murid, false),
            PictureOption("u2_s3_p2_q6_opt2", "(laki-laki) pacar", "男朋友", R.drawable.ill_cartoon_dia_pria, false),
            PictureOption("u2_s3_p2_q6_opt3", "teman sekamar", "室友", R.drawable.ill_cartoon_teman_sekolah, true),
            PictureOption("u2_s3_p2_q6_opt4", "tetangga", "邻居", R.drawable.ill_cartoon_guru, false)
        )
    ),

    // 7. Soal 7: Pilih terjemahan yang benar (Itu siapa? -> 那是 谁 ？)
    Exercise(
        id = "u2_s3_p2_q7",
        type = ExerciseType.SENTENCE_CHOICE,
        title = "Pilih terjemahan yang benar",
        targetTranslation = "Itu siapa?",
        options = listOf(
            "Nǐ de wǎngyǒu shì shéi?\n你的 网友 是 谁 ？",
            "Nà shì shéi?\n那是 谁 ？",
            "Tā de nánpéngyou shì shéi?\n她的 男朋友 是 谁 ？",
            "Shéi shì nǐ de nánpéngyou?\n谁 是你的 男朋友 ？"
        ),
        correctAnswer = "Nà shì shéi?\n那是 谁 ？",
        audioToSpeak = "那是谁？"
    ),

    // 8. Soal 8: Pilih kata yang sesuai dengan gambar (室友)
    Exercise(
        id = "u2_s3_p2_q8",
        type = ExerciseType.SENTENCE_CHOICE,
        title = "Pilih kata yang sesuai dengan gambar",
        targetTranslation = "teman sekamar",
        options = listOf(
            "shìyǒu\n室友",
            "nà\n那",
            "zhè\n这",
            "Zhōngguó\n中国"
        ),
        correctAnswer = "shìyǒu\n室友",
        audioToSpeak = "室友"
    ),

    // 9. Soal 9: Ketuk pasangan yang sesuai (4 Pasang Kartu)
    Exercise(
        id = "u2_s3_p2_q9",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u2_s3_p2_q9_m1", "网友", "wǎngyǒu", "teman online"),
            MatchPairItem("u2_s3_p2_q9_m2", "室友", "shìyǒu", "teman sekamar"),
            MatchPairItem("u2_s3_p2_q9_m3", "谁", "shéi", "siapa"),
            MatchPairItem("u2_s3_p2_q9_m4", "邻居", "línjū", "tetangga")
        )
    ),

    // 10. Soal 10: Lengkapi terjemahan (Siapa tetanggamu? -> 你的 [邻居] 是 [谁] ？)
    Exercise(
        id = "u2_s3_p2_q10",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Lengkapi terjemahan",
        targetTranslation = "Siapa tetanggamu?",
        targetHanzi = "你的邻居是谁？",
        targetPinyin = "Nǐ de línjū shì shéi?",
        staticLeadingText = "你的",
        staticLeadingPinyin = "Nǐ de",
        staticTrailingText = "？",
        wordChips = listOf("网友:wǎngyǒu", "邻居:línjū", "人:rén", "们:men", "谁:shéi", "室友:shìyǒu"),
        correctAnswer = "邻居,谁",
        audioToSpeak = "你的邻居是谁？"
    )
)
