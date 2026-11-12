package com.example.chineselearning.data.repository

import com.example.chineselearning.R
import com.example.chineselearning.data.model.*

val stage1Part1Exercises = listOf<Exercise>(
    // 1. Soal 1: Pilihan Gambar (同学 -> teman sekolah)
    Exercise(
        id = "u2_p1_q1",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "同学",
        targetPinyin = "tóngxué",
        targetTranslation = "teman sekolah",
        correctAnswer = "teman sekolah",
        audioToSpeak = "同学",
        pictureOptions = listOf(
            PictureOption("u2_p1_q1_opt1", "guru", "老师", R.drawable.ill_cartoon_guru, false),
            PictureOption("u2_p1_q1_opt2", "teman sekolah", "同学", R.drawable.ill_cartoon_teman_sekolah, true),
            PictureOption("u2_p1_q1_opt3", "murid", "学生", R.drawable.ill_cartoon_murid, false),
            PictureOption("u2_p1_q1_opt4", "teman", "朋友", R.drawable.ill_cartoon_teman, false)
        )
    ),

    // 2. Soal 2: Pilihan Gambar (朋友 -> teman)
    Exercise(
        id = "u2_p1_q2",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "朋友",
        targetPinyin = "péngyou",
        targetTranslation = "teman",
        correctAnswer = "teman",
        audioToSpeak = "朋友",
        pictureOptions = listOf(
            PictureOption("u2_p1_q2_opt1", "murid", "学生", R.drawable.ill_cartoon_murid, false),
            PictureOption("u2_p1_q2_opt2", "teman", "朋友", R.drawable.ill_cartoon_teman, true),
            PictureOption("u2_p1_q2_opt3", "guru", "老师", R.drawable.ill_cartoon_guru, false),
            PictureOption("u2_p1_q2_opt4", "teman sekolah", "同学", R.drawable.ill_cartoon_teman_sekolah, false)
        )
    ),

    // 3. Soal 3: Lengkapi terjemahan (Wǒ men shì tóngxué / 我们 是 同学 。 -> [Kami] adalah teman kelas.)
    Exercise(
        id = "u2_p1_q3",
        type = ExerciseType.FILL_BLANK,
        title = "Lengkapi terjemahan",
        targetHanzi = "我们 是 同学 。",
        targetPinyin = "Wǒ men shì tóngxué",
        sentenceWithBlank = "________ adalah teman kelas.",
        options = listOf("Paman", "Kami", "Dia"),
        correctAnswer = "Kami",
        audioToSpeak = "我们是同学。"
    ),

    // 4. Soal 4: Pilih terjemahan yang benar (你们 是 朋友 吗？ -> Apakah kalian teman?)
    Exercise(
        id = "u2_p1_q4",
        type = ExerciseType.SENTENCE_CHOICE,
        title = "Pilih terjemahan yang benar",
        targetHanzi = "你们 是 朋友 吗？",
        targetPinyin = "Nǐ men shì péngyou ma",
        options = listOf(
            "Apakah kalian teman?",
            "Apakah mereka(P) teman?",
            "Apakah kalian guru?",
            "Apakah kalian teman kelas?"
        ),
        correctAnswer = "Apakah kalian teman?",
        audioToSpeak = "你们是朋友吗？"
    ),

    // 5. Soal 5: Pilih terjemahan yang benar (们 -> kata penanda jamak ...)
    Exercise(
        id = "u2_p1_q5",
        type = ExerciseType.SENTENCE_CHOICE,
        title = "Pilih terjemahan yang benar",
        targetHanzi = "们",
        targetPinyin = "men",
        options = listOf(
            "kata penanda jamak yang digunakan untuk kata ganti atau beberapa kata benda yang meruju...",
            "orang",
            "tidak, bukan",
            "saya"
        ),
        correctAnswer = "kata penanda jamak yang digunakan untuk kata ganti atau beberapa kata benda yang meruju...",
        audioToSpeak = "们"
    ),

    // 6. Soal 6: Apa yang Anda dengar? (Two friends smiling -> 我们是朋友。)
    Exercise(
        id = "u2_p1_q6",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Apa yang Anda dengar?",
        isImmersiveSpeaker = true,
        illustrationRes = R.drawable.img_two_friends_smiling,
        targetHanzi = "我们是朋友。",
        targetPinyin = "Wǒmen shì péngyou.",
        targetTranslation = "Kami adalah teman.",
        wordChips = listOf("们:men", "朋友:péngyou", "学生:xuéshēng", "同学:tóngxué", "不:bù", "人:rén"),
        correctAnswer = "们,朋友",
        audioToSpeak = "我们是朋友。"
    ),

    // 7. Soal 7: Pilih terjemahan yang benar (Apakah mereka(L) teman kelas? -> 他们 是 同学 吗？)
    Exercise(
        id = "u2_p1_q7",
        type = ExerciseType.SENTENCE_CHOICE,
        title = "Pilih terjemahan yang benar",
        targetTranslation = "Apakah mereka(L) teman kelas?",
        options = listOf(
            "Nǐ  men  shì  lǎoshī  ma\n你们 是 老师 吗？",
            "Tā  men  shì  péngyou  ma\n她们 是 朋友 吗？",
            "Nǐ  men  shì  péngyou  ma\n你们 是 朋友 吗？",
            "Tā  men  shì  tóngxué  ma\n他们 是 同学 吗？"
        ),
        correctAnswer = "Tā  men  shì  tóngxué  ma\n他们 是 同学 吗？",
        audioToSpeak = "他们是同学吗？"
    ),

    // 8. Soal 8: Ketuk pasangan yang sesuai (同学, 朋友, 们)
    Exercise(
        id = "u2_p1_q8",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u2_p1_m1", "同学", "tóngxué", "teman sekolah"),
            MatchPairItem("u2_p1_m2", "朋友", "péngyou", "teman"),
            MatchPairItem("u2_p1_m3", "们", "men", "kata penanda jamak yang digunakan untuk kata ganti atau beberapa kat...")
        )
    ),

    // 9. Soal 9: Apa yang Anda dengar? (Man in striped shirt -> 你们是同学吗？)
    Exercise(
        id = "u2_p1_q9",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Apa yang Anda dengar?",
        isImmersiveSpeaker = true,
        illustrationRes = R.drawable.img_man_striped_shirt,
        targetHanzi = "你们是同学吗？",
        targetPinyin = "Nǐmen shì tóngxué ma?",
        targetTranslation = "Apakah kalian teman sekolah?",
        wordChips = listOf("们:men", "同学:tóngxué", "朋友:péngyou", "人:rén", "老师:lǎoshī", "不:bù"),
        correctAnswer = "们,同学",
        audioToSpeak = "你们是同学吗？"
    ),

    // 10. Soal 10: Lengkapi terjemahan (Mereka(L) bukan teman. -> 他 [们] 不是 [朋友] 。)
    Exercise(
        id = "u2_p1_q10",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Lengkapi terjemahan",
        targetTranslation = "Mereka(L) bukan teman.",
        targetHanzi = "他们不是朋友。",
        targetPinyin = "Tāmen bú shì péngyou.",
        audioToSpeak = "他们不是朋友。",
        wordChips = listOf("们:men", "人:rén", "她:tā", "朋友:péngyou", "老师:lǎoshī", "我:wǒ"),
        correctAnswer = "们,朋友"
    )
)
