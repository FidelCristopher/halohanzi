package com.example.chineselearning.data.repository

import com.example.chineselearning.R
import com.example.chineselearning.data.model.Exercise
import com.example.chineselearning.data.model.ExerciseType
import com.example.chineselearning.data.model.MatchPairItem
import com.example.chineselearning.data.model.PictureOption

val bab5Stage4Part1Exercises = listOf(
    // 1. Soal 1: Pilihan Gambar (正在 -> sedang dalam proses)
    Exercise(
        id = "u5_s4_p1_q1",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "正在",
        targetPinyin = "zhèngzài",
        targetTranslation = "sedang",
        correctAnswer = "sedang",
        audioToSpeak = "正在",
        pictureOptions = listOf(
            PictureOption("u5_s4_p1_opt1", "sedang", "", R.drawable.ic_action_in_progress, true),
            PictureOption("u5_s4_p1_opt2", "beristirahat", "", R.drawable.ic_action_rest, false),
            PictureOption("u5_s4_p1_opt3", "membaca buku", "", R.drawable.ic_action_reading, false),
            PictureOption("u5_s4_p1_opt4", "besok", "", R.drawable.ic_cal_tomorrow, false)
        )
    ),

    // 2. Soal 2: Susun Kalimat (Saya sedang makan.)
    Exercise(
        id = "u5_s4_p1_q2",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Saya sedang makan.",
        targetHanzi = "我 正在 吃饭。",
        targetPinyin = "Wǒ zhèngzài chīfàn.",
        wordChips = listOf("我:wǒ", "正在:zhèngzài", "吃饭:chīfàn", "睡觉:shuìjiào", "他:tā"),
        correctAnswer = "我,正在,吃饭",
        audioToSpeak = "我正在吃饭。"
    ),

    // 3. Soal 3: Ketuk Pasangan yang Sesuai (Aspek Progresif)
    Exercise(
        id = "u5_s4_p1_q3",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u5_s4_p1_m1", "正在", "zhèngzài", "sedang"),
            MatchPairItem("u5_s4_p1_m2", "在", "zài", "di / sedang"),
            MatchPairItem("u5_s4_p1_m3", "正在吃饭", "zhèngzài chīfàn", "sedang makan"),
            MatchPairItem("u5_s4_p1_m4", "正在睡觉", "zhèngzài shuìjiào", "sedang tidur")
        )
    ),

    // 4. Soal 4: Ketik Pinyin (sedang -> zhèngzài)
    Exercise(
        id = "u5_s4_p1_q4",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "sedang",
        sentenceWithBlank = "正在 (________)",
        targetHanzi = "正在",
        targetPinyin = "zhèngzài",
        correctAnswer = "zhengzai",
        keyboardKeys = listOf("z", "h", "e", "n", "g", "a", "i", "o", "u", "b", "d"),
        audioToSpeak = "正在"
    ),

    // 5. Soal 5: Mendengar Kalimat (Rule 10: illustrationRes = 0)
    Exercise(
        id = "u5_s4_p1_q5",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Apa yang Anda dengar?",
        targetTranslation = "Dia sedang tidur.",
        targetHanzi = "他 正在 睡觉。",
        targetPinyin = "Tā zhèngzài shuìjiào.",
        wordChips = listOf("他:tā", "正在:zhèngzài", "睡觉:shuìjiào", "我:wǒ", "起床:qǐchuáng"),
        correctAnswer = "他,正在,睡觉",
        illustrationRes = 0,
        audioToSpeak = "他正在睡觉。"
    ),

    // 6. Soal 6: Pilihan Kalimat
    Exercise(
        id = "u5_s4_p1_q6",
        type = ExerciseType.SENTENCE_CHOICE,
        title = "Pilih terjemahan yang benar",
        targetHanzi = "老师 正在 休息。",
        targetPinyin = "Lǎoshī zhèngzài xiūxi.",
        targetTranslation = "Guru sedang beristirahat.",
        correctAnswer = "Lǎoshī zhèngzài xiūxi.\n老师 正在 休息。",
        options = listOf(
            "Lǎoshī zhèngzài xiūxi.\n老师 正在 休息。",
            "Xuéshēng zhèngzài xiūxi.\n学生 正在 休息。",
            "Lǎoshī zhèngzài chīfàn.\n老师 正在 吃饭。"
        ),
        audioToSpeak = "老师正在休息。"
    ),

    // 7. Soal 7: Pilihan Gambar (在 -> sedang / di)
    Exercise(
        id = "u5_s4_p1_q7",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "在",
        targetPinyin = "zài",
        targetTranslation = "sedang / di",
        correctAnswer = "sedang / di",
        audioToSpeak = "在",
        pictureOptions = listOf(
            PictureOption("u5_s4_p1_opt7_1", "sedang / di", "", R.drawable.ic_action_in_progress, true),
            PictureOption("u5_s4_p1_opt7_2", "beristirahat", "", R.drawable.ic_action_rest, false),
            PictureOption("u5_s4_p1_opt7_3", "sampai jumpa", "", R.drawable.ic_hand_wave, false),
            PictureOption("u5_s4_p1_opt7_4", "membaca buku", "", R.drawable.ic_action_reading, false)
        )
    ),

    // 8. Soal 8: Ketik Pinyin (di / sedang -> zài)
    Exercise(
        id = "u5_s4_p1_q8",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "di / sedang",
        sentenceWithBlank = "在 (________)",
        targetHanzi = "在",
        targetPinyin = "zài",
        correctAnswer = "zai",
        keyboardKeys = listOf("z", "a", "i", "e", "o", "u", "b", "d", "g", "h", "j"),
        audioToSpeak = "在"
    ),

    // 9. Soal 9: Susun Kalimat (Kamu sedang apa?)
    Exercise(
        id = "u5_s4_p1_q9",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Kamu sedang melakukan apa?",
        targetHanzi = "你 在 做 什么？",
        targetPinyin = "Nǐ zài zuò shénme?",
        wordChips = listOf("你:nǐ", "在:zài", "做:zuò", "什么:shénme", "他:tā", "去:qù"),
        correctAnswer = "你,在,做,什么",
        audioToSpeak = "你在做什么？"
    ),

    // 10. Soal 10: Ketuk Pasangan yang Sesuai (Aktivitas Sedang Berlangsung)
    Exercise(
        id = "u5_s4_p1_q10",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u5_s4_p1_m10_1", "在做什么", "zài zuò shénme", "sedang apa"),
            MatchPairItem("u5_s4_p1_m10_2", "在吃饭", "zài chīfàn", "sedang makan"),
            MatchPairItem("u5_s4_p1_m10_3", "在睡觉", "zài shuìjiào", "sedang tidur"),
            MatchPairItem("u5_s4_p1_m10_4", "在休息", "zài xiūxi", "sedang istirahat")
        )
    )
)

val bab5Stage4Part2Exercises = listOf(
    // 1. Soal 1: Pilihan Gambar (一下 -> sebentar / sejenak)
    Exercise(
        id = "u5_s4_p2_q1",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "一下",
        targetPinyin = "yíxià",
        targetTranslation = "sebentar / sejenak",
        correctAnswer = "sebentar / sejenak",
        audioToSpeak = "一下",
        pictureOptions = listOf(
            PictureOption("u5_s4_p2_opt1", "sebentar / sejenak", "", R.drawable.ic_action_moment, true),
            PictureOption("u5_s4_p2_opt2", "jam (durasi)", "", R.drawable.ic_hourglass_duration, false),
            PictureOption("u5_s4_p2_opt3", "sekarang", "", R.drawable.ic_time_now, false),
            PictureOption("u5_s4_p2_opt4", "besok", "", R.drawable.ic_cal_tomorrow, false)
        )
    ),

    // 2. Soal 2: Susun Kalimat (Istirahatlah sebentar.)
    Exercise(
        id = "u5_s4_p2_q2",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Istirahatlah sebentar.",
        targetHanzi = "休息 一下 吧。",
        targetPinyin = "Xiūxi yíxià ba.",
        wordChips = listOf("休息:xiūxi", "一下:yíxià", "吧:ba", "去:qù", "睡:shuì"),
        correctAnswer = "休息,一下,吧",
        audioToSpeak = "休息一下吧。"
    ),

    // 3. Soal 3: Ketuk Pasangan yang Sesuai (Aktivitas Singkat)
    Exercise(
        id = "u5_s4_p2_q3",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u5_s4_p2_m1", "一下", "yíxià", "sebentar / sejenak"),
            MatchPairItem("u5_s4_p2_m2", "休息一下", "xiūxi yíxià", "istirahat sebentar"),
            MatchPairItem("u5_s4_p2_m3", "看书", "kànshū", "membaca buku"),
            MatchPairItem("u5_s4_p2_m4", "看一看", "kànyíkàn", "melihat-lihat")
        )
    ),

    // 4. Soal 4: Ketik Pinyin (sebentar -> yíxià)
    Exercise(
        id = "u5_s4_p2_q4",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "sebentar / sejenak",
        sentenceWithBlank = "一下 (________)",
        targetHanzi = "一下",
        targetPinyin = "yíxià",
        correctAnswer = "yixia",
        keyboardKeys = listOf("y", "i", "x", "a", "e", "o", "u", "b", "d", "g", "h"),
        audioToSpeak = "一下"
    ),

    // 5. Soal 5: Mendengar Kalimat (Rule 10: illustrationRes = 0)
    Exercise(
        id = "u5_s4_p2_q5",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Apa yang Anda dengar?",
        targetTranslation = "Saya sedang membaca buku.",
        targetHanzi = "我 在 看 书。",
        targetPinyin = "Wǒ zài kàn shū.",
        wordChips = listOf("我:wǒ", "在:zài", "看:kàn", "书:shū", "睡觉:shuìjiào", "他:tā"),
        correctAnswer = "我,在,看,书",
        illustrationRes = 0,
        audioToSpeak = "我在看书。"
    ),

    // 6. Soal 6: Pilihan Kalimat
    Exercise(
        id = "u5_s4_p2_q6",
        type = ExerciseType.SENTENCE_CHOICE,
        title = "Pilih terjemahan yang benar",
        targetHanzi = "他 正在 看书。",
        targetPinyin = "Tā zhèngzài kànshū.",
        targetTranslation = "Dia sedang membaca buku.",
        correctAnswer = "Tā zhèngzài kànshū.\n他 正在 看书。",
        options = listOf(
            "Tā zhèngzài kànshū.\n他 正在 看书。",
            "Wǒ zhèngzài kànshū.\n我 正在 看书。",
            "Tā zhèngzài shuìjiào.\n他 正在 睡觉。"
        ),
        audioToSpeak = "他正在看书。"
    ),

    // 7. Soal 7: Pilihan Gambar (看书 -> membaca buku)
    Exercise(
        id = "u5_s4_p2_q7",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "看书",
        targetPinyin = "kànshū",
        targetTranslation = "membaca buku",
        correctAnswer = "membaca buku",
        audioToSpeak = "看书",
        pictureOptions = listOf(
            PictureOption("u5_s4_p2_opt7_1", "membaca buku", "", R.drawable.ic_action_reading, true),
            PictureOption("u5_s4_p2_opt7_2", "beristirahat", "", R.drawable.ic_action_rest, false),
            PictureOption("u5_s4_p2_opt7_3", "makan", "", R.drawable.ic_action_eat, false),
            PictureOption("u5_s4_p2_opt7_4", "tidur", "", R.drawable.ic_action_sleep, false)
        )
    ),

    // 8. Soal 8: Ketik Pinyin (membaca buku -> kànshū)
    Exercise(
        id = "u5_s4_p2_q8",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "membaca buku",
        sentenceWithBlank = "看书 (________)",
        targetHanzi = "看书",
        targetPinyin = "kànshū",
        correctAnswer = "kanshu",
        keyboardKeys = listOf("k", "a", "n", "s", "h", "u", "e", "i", "o", "b", "d"),
        audioToSpeak = "看书"
    ),

    // 9. Soal 9: Susun Kalimat (Lihatlah sebentar.)
    Exercise(
        id = "u5_s4_p2_q9",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Coba lihat sebentar.",
        targetHanzi = "看 一下。",
        targetPinyin = "Kàn yíxià.",
        wordChips = listOf("看:kàn", "一下:yíxià", "去:qù", "来:lái", "说:shuō"),
        correctAnswer = "看,一下",
        audioToSpeak = "看一下。"
    ),

    // 10. Soal 10: Ketuk Pasangan yang Sesuai (Rangkuman Aspek Singkat)
    Exercise(
        id = "u5_s4_p2_m10_1",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u5_s4_p2_m10_1", "看书", "kànshū", "membaca buku"),
            MatchPairItem("u5_s4_p2_m10_2", "一下", "yíxià", "sebentar"),
            MatchPairItem("u5_s4_p2_m10_3", "看一下", "kàn yíxià", "lihat sebentar"),
            MatchPairItem("u5_s4_p2_m10_4", "休息一下", "xiūxi yíxià", "istirahat sejenak")
        )
    )
)
