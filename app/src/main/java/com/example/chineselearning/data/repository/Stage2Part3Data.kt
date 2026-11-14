package com.example.chineselearning.data.repository

import com.example.chineselearning.R
import com.example.chineselearning.data.model.*

val stage2Part3Exercises = listOf<Exercise>(
    // 1. Soal 1: Lengkapi kalimat (我 [们] [是] [同学] 。)
    Exercise(
        id = "u2_s2_p3_q1",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Lengkapi kalimat",
        illustrationRes = R.drawable.img_kittens_chalkboard,
        targetTranslation = "Kami adalah teman sekolah.",
        targetHanzi = "我们是同学。",
        targetPinyin = "Wǒmen shì tóngxué.",
        staticLeadingText = "我",
        staticLeadingPinyin = "Wǒ",
        staticTrailingText = "。",
        wordChips = listOf("同学:tóngxué", "们:men", "是:shì"),
        correctAnswer = "们,是,同学",
        audioToSpeak = "我们是同学。"
    ),

    // 2. Soal 2: Apa yang Anda dengar? (她是我的老师。)
    Exercise(
        id = "u2_s2_p3_q2",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Apa yang Anda dengar?",
        isImmersiveSpeaker = true,
        illustrationRes = R.drawable.img_mcgonagall_teaching,
        targetHanzi = "她是我的老师。",
        targetPinyin = "Tā shì wǒ de lǎoshī.",
        targetTranslation = "Dia(P) adalah guru saya.",
        wordChips = listOf("她:tā", "是:shì", "我:wǒ", "的:de", "老师:lǎoshī", "你:nǐ", "人:rén", "不:bù"),
        correctAnswer = "她,是,我,的,老师",
        audioToSpeak = "她是我的老师。"
    ),

    // 3. Soal 3: Lengkapi kalimat (她 [是] 你 [的] [女朋友] 吗？)
    Exercise(
        id = "u2_s2_p3_q3",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Lengkapi kalimat",
        illustrationRes = R.drawable.img_shrek_fiona,
        targetTranslation = "Apakah dia(P) pacarmu(P)?",
        targetHanzi = "她是你的女朋友吗？",
        targetPinyin = "Tā shì nǐ de nǚpéngyou ma?",
        staticLeadingText = "她",
        staticLeadingPinyin = "Tā",
        staticTrailingText = "吗？",
        staticTrailingPinyin = "ma",
        wordChips = listOf("是:shì", "的:de", "女朋友:nǚpéngyou"),
        correctAnswer = "是,的,女朋友",
        audioToSpeak = "她是你的女朋友吗？"
    ),

    // 4. Soal 4: Apa yang Anda dengar? (我的男朋友不是人。)
    Exercise(
        id = "u2_s2_p3_q4",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Apa yang Anda dengar?",
        isImmersiveSpeaker = true,
        illustrationRes = R.drawable.img_beauty_and_the_beast,
        targetHanzi = "我的男朋友不是人。",
        targetPinyin = "Wǒ de nánpéngyou bú shì rén.",
        targetTranslation = "Pacar(L) saya bukan manusia.",
        wordChips = listOf("我:wǒ", "的:de", "男朋友:nánpéngyou", "不:bù", "是:shì", "人:rén", "同学:tóngxué", "女朋友:nǚpéngyou", "朋友:péngyou"),
        correctAnswer = "我,的,男朋友,不,是,人",
        audioToSpeak = "我的男朋友不是人。"
    ),

    // 5. Soal 5: Buat kalimat menggunakan semua kata berdasarkan gambar (我是你的医生吗？)
    Exercise(
        id = "u2_s2_p3_q5",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Buat kalimat menggunakan semua kata berdasarkan gambar",
        illustrationRes = R.drawable.img_spongebob_doctor,
        targetTranslation = "Apakah saya doktermu?",
        targetHanzi = "我是你的医生吗？",
        targetPinyin = "Wǒ shì nǐ de yīshēng ma?",
        wordChips = listOf("我:wǒ", "是:shì", "的:de", "你:nǐ", "医生:yīshēng", "吗:ma"),
        correctAnswer = "我,是,你,的,医生,吗",
        audioToSpeak = "我是你的医生吗？"
    ),

    // 6. Soal 6: Lengkapi kalimat (他 [们] [是] 她 [的] [男朋友] 吗？)
    Exercise(
        id = "u2_s2_p3_q6",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Lengkapi kalimat",
        illustrationRes = R.drawable.img_snow_white_dwarfs,
        targetTranslation = "Apakah mereka pacar(L)-nya?",
        targetHanzi = "他们是她的男朋友吗？",
        targetPinyin = "Tāmen shì tā de nánpéngyou ma?",
        staticLeadingText = "他",
        staticLeadingPinyin = "Tā",
        staticTrailingText = "吗？",
        staticTrailingPinyin = "ma",
        wordChips = listOf("是:shì", "的:de", "们:men", "男朋友:nánpéngyou"),
        correctAnswer = "们,是,的,男朋友",
        audioToSpeak = "他们是她的男朋友吗？"
    ),

    // 7. Soal 7: Buat kalimat menggunakan semua kata berdasarkan gambar (我们是朋友。)
    Exercise(
        id = "u2_s2_p3_q7",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Buat kalimat menggunakan semua kata berdasarkan gambar",
        illustrationRes = R.drawable.img_gru_minions,
        targetTranslation = "Kami adalah teman.",
        targetHanzi = "我们是朋友。",
        targetPinyin = "Wǒmen shì péngyou.",
        wordChips = listOf("我:wǒ", "是:shì", "朋友:péngyou", "们:men"),
        correctAnswer = "我,们,是,朋友",
        audioToSpeak = "我们是朋友。"
    )
)
