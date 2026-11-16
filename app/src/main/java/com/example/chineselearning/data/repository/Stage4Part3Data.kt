package com.example.chineselearning.data.repository

import com.example.chineselearning.R
import com.example.chineselearning.data.model.*

val stage4Part3Exercises = listOf<Exercise>(
    // 1. Soal 1: Ketuk pasangan yang sesuai (4 Pasang Kartu)
    Exercise(
        id = "u2_s4_p3_q1",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u2_s4_p3_q1_m1", "朋友", "péngyou", "teman"),
            MatchPairItem("u2_s4_p3_q1_m2", "男朋友", "nánpéngyou", "(laki-laki) pacar"),
            MatchPairItem("u2_s4_p3_q1_m3", "女朋友", "nǚpéngyou", "(perempuan) pacar"),
            MatchPairItem("u2_s4_p3_q1_m4", "同学", "tóngxué", "teman sekolah")
        )
    ),

    // 2. Soal 2: Terjemahkan kalimat ini (Apakah itu temanmu? -> 那是你的朋友吗？)
    Exercise(
        id = "u2_s4_p3_q2",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Terjemahkan kalimat ini",
        targetTranslation = "Apakah itu temanmu?",
        targetHanzi = "那 是 你 的 朋友 吗？",
        targetPinyin = "Nà shì nǐ de péngyou ma?",
        wordChips = listOf("你:nǐ", "朋友:péngyou", "不:bù", "是:shì", "同学:tóngxué", "那:nà", "的:de", "吗:ma", "这:zhè"),
        correctAnswer = "那,是,你,的,朋友,吗",
        audioToSpeak = "那是你的朋友吗？"
    ),

    // 3. Soal 3: Masukkan kata yang hilang (Pinyin keyboard: zhè)
    Exercise(
        id = "u2_s4_p3_q3",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Masukkan kata yang hilang",
        targetHanzi = "这 是 我 的 同学。",
        targetPinyin = "Zhè shì wǒ de tóngxué.",
        targetTranslation = "Ini adalah teman sekolah saya.",
        sentenceWithBlank = "________ shì wǒ de tóngxué\n这 是 我 的 同学 。",
        correctAnswer = "zhè",
        keyboardKeys = listOf("a", "b", "c", "è", "h", "i", "l", "ú", "z"),
        audioToSpeak = "这是我的同学。"
    ),

    // 4. Soal 4: Pilih terjemahan yang benar (Situasi: mengantar teman sekamar)
    Exercise(
        id = "u2_s4_p3_q4",
        type = ExerciseType.SENTENCE_CHOICE,
        title = "Hari ini, kamu melihat seorang laki-laki mengantar teman sekamarmu pulang. Rasa penasaranmu memuncak, bagaimana cara kamu menanyakan hubungan mereka pada temanmu?",
        options = listOf(
            "Nǐ de nánpéngyou shì Zhōngguó rén ma\n你 的 男朋友 是 中国 人 吗？",
            "Tā shì xuéshēng ma\n他 是 学生 吗？",
            "Nà shì nǐ de nánpéngyou ma\n那 是 你 的 男朋友 吗？"
        ),
        correctAnswer = "Nà shì nǐ de nánpéngyou ma\n那 是 你 的 男朋友 吗？",
        audioToSpeak = "那是你的男朋友吗？"
    ),

    // 5. Soal 5: Ketuk pasangan yang sesuai (4 Pasang Kartu)
    Exercise(
        id = "u2_s4_p3_q5",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u2_s4_p3_q5_m1", "那", "nà", "itu"),
            MatchPairItem("u2_s4_p3_q5_m2", "这", "zhè", "ini"),
            MatchPairItem("u2_s4_p3_q5_m3", "谁", "shéi", "siapa"),
            MatchPairItem("u2_s4_p3_q5_m4", "同事", "tóngshì", "rekan kerja, kolega")
        )
    ),

    // 6. Soal 6: Masukkan kata yang hilang (Pinyin keyboard: shéi)
    Exercise(
        id = "u2_s4_p3_q6",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Masukkan kata yang hilang",
        targetHanzi = "王飞 是 谁 的 朋友？",
        targetPinyin = "WángFēi shì shéi de péngyou?",
        targetTranslation = "Wang Fei teman siapa?",
        sentenceWithBlank = "WángFēi shì ________ de péngyou\n王 飞 是 谁 的 朋友 ？",
        correctAnswer = "shéi",
        keyboardKeys = listOf("à", "d", "é", "h", "i", "o", "s", "ū", "y"),
        audioToSpeak = "王飞是谁的朋友？"
    ),

    // 7. Soal 7: Lengkapi terjemahan (Apakah itu teman kelas Wang Fei? -> [那] 是 王飞 [的] [同学] 吗？)
    Exercise(
        id = "u2_s4_p3_q7",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Lengkapi terjemahan",
        targetTranslation = "Apakah itu teman kelas Wang Fei?",
        targetHanzi = "那 是 王飞 的 同学 吗？",
        targetPinyin = "Nà shì WángFēi de tóngxué ma?",
        staticTrailingText = "是 王飞",
        hasTrailingLine2 = true,
        trailingLine2Text = "吗？",
        wordChips = listOf("的:de", "不:bù", "同学:tóngxué", "朋友:péngyou", "这:zhè", "那:nà", "们:men"),
        correctAnswer = "那,的,同学",
        audioToSpeak = "那是王飞的同学吗？"
    )
)
