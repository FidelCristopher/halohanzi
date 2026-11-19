package com.example.chineselearning.data.repository

import com.example.chineselearning.R
import com.example.chineselearning.data.model.Exercise
import com.example.chineselearning.data.model.ExerciseType
import com.example.chineselearning.data.model.MatchPairItem
import com.example.chineselearning.data.model.PictureOption

val bab5Stage2Part1Exercises = listOf(
    // 1. Soal 1: Pilihan Gambar (起床 -> bangun tidur)
    Exercise(
        id = "u5_s2_p1_q1",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "起床",
        targetPinyin = "qǐchuáng",
        targetTranslation = "bangun tidur",
        correctAnswer = "bangun tidur",
        audioToSpeak = "起床",
        pictureOptions = listOf(
            PictureOption("u5_s2_p1_opt1", "bangun tidur", "⏰", R.drawable.ic_story_timer, true),
            PictureOption("u5_s2_p1_opt2", "tidur", "🛌", R.drawable.ic_book, false),
            PictureOption("u5_s2_p1_opt3", "makan", "🍜", R.drawable.ic_pouch, false),
            PictureOption("u5_s2_p1_opt4", "belajar", "📖", R.drawable.ic_cap, false)
        )
    ),

    // 2. Soal 2: Susun Kalimat (Saya jam tujuh bangun tidur.)
    Exercise(
        id = "u5_s2_p1_q2",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Saya bangun tidur jam tujuh.",
        targetHanzi = "我 七 点 起床。",
        targetPinyin = "Wǒ qī diǎn qǐchuáng.",
        wordChips = listOf("我:wǒ", "七:qī", "点:diǎn", "起床:qǐchuáng", "八:bā", "睡觉:shuìjiào"),
        correctAnswer = "我,七,点,起床",
        audioToSpeak = "我七点起床。"
    ),

    // 3. Soal 3: Ketuk Pasangan yang Sesuai (Bangun & Tidur)
    Exercise(
        id = "u5_s2_p1_q3",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u5_s2_p1_m1", "起床", "qǐchuáng", "bangun tidur"),
            MatchPairItem("u5_s2_p1_m2", "睡觉", "shuìjiào", "tidur"),
            MatchPairItem("u5_s2_p1_m3", "睡", "shuì", "tidur (kata kerja)"),
            MatchPairItem("u5_s2_p1_m4", "七点", "qīdiǎn", "jam tujuh")
        )
    ),

    // 4. Soal 4: Ketik Pinyin (bangun tidur -> qǐchuáng)
    Exercise(
        id = "u5_s2_p1_q4",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "bangun tidur",
        sentenceWithBlank = "起床 (________)",
        targetHanzi = "起床",
        targetPinyin = "qǐchuáng",
        correctAnswer = "qichuang",
        keyboardKeys = listOf("q", "i", "c", "h", "u", "a", "n", "g", "e", "o", "b"),
        audioToSpeak = "起床"
    ),

    // 5. Soal 5: Mendengar Kalimat (Rule 10: illustrationRes = 0)
    Exercise(
        id = "u5_s2_p1_q5",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Apa yang Anda dengar?",
        targetTranslation = "Dia jam sepuluh tidur.",
        targetHanzi = "他 十 点 睡觉。",
        targetPinyin = "Tā shí diǎn shuìjiào.",
        wordChips = listOf("他:tā", "十:shí", "点:diǎn", "睡觉:shuìjiào", "我:wǒ", "起床:qǐchuáng"),
        correctAnswer = "他,十,点,睡觉",
        illustrationRes = 0,
        audioToSpeak = "他十点睡觉。"
    ),

    // 6. Soal 6: Pilihan Kalimat
    Exercise(
        id = "u5_s2_p1_q6",
        type = ExerciseType.SENTENCE_CHOICE,
        title = "Pilih terjemahan yang benar",
        targetHanzi = "你 几 点 起床？",
        targetPinyin = "Nǐ jǐ diǎn qǐchuáng?",
        targetTranslation = "Kamu jam berapa bangun tidur?",
        correctAnswer = "Nǐ jǐ diǎn qǐchuáng?\n你 几 点 起床？",
        options = listOf(
            "Nǐ jǐ diǎn qǐchuáng?\n你 几 点 起床？",
            "Nǐ jǐ diǎn shuìjiào?\n你 几 点 睡觉？",
            "Tā jǐ diǎn qǐchuáng?\n他 几 点 起床？"
        ),
        audioToSpeak = "你几点起床？"
    ),

    // 7. Soal 7: Pilihan Gambar (睡觉 -> tidur)
    Exercise(
        id = "u5_s2_p1_q7",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "睡觉",
        targetPinyin = "shuìjiào",
        targetTranslation = "tidur",
        correctAnswer = "tidur",
        audioToSpeak = "睡觉",
        pictureOptions = listOf(
            PictureOption("u5_s2_p1_opt7_1", "tidur", "🛌", R.drawable.ic_book, true),
            PictureOption("u5_s2_p1_opt7_2", "bangun", "⏰", R.drawable.ic_story_timer, false),
            PictureOption("u5_s2_p1_opt7_3", "makan", "🍜", R.drawable.ic_coin, false),
            PictureOption("u5_s2_p1_opt7_4", "minum", "🍵", R.drawable.ic_crown, false)
        )
    ),

    // 8. Soal 8: Ketik Pinyin (tidur -> shuìjiào)
    Exercise(
        id = "u5_s2_p1_q8",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "tidur",
        sentenceWithBlank = "睡觉 (________)",
        targetHanzi = "睡觉",
        targetPinyin = "shuìjiào",
        correctAnswer = "shuijiao",
        keyboardKeys = listOf("s", "h", "u", "i", "j", "a", "o", "e", "b", "d", "g"),
        audioToSpeak = "睡觉"
    ),

    // 9. Soal 9: Susun Kalimat (Kamu jam berapa tidur?)
    Exercise(
        id = "u5_s2_p1_q9",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Kamu jam berapa tidur?",
        targetHanzi = "你 几 点 睡觉？",
        targetPinyin = "Nǐ jǐ diǎn shuìjiào?",
        wordChips = listOf("你:nǐ", "几:jǐ", "点:diǎn", "睡觉:shuìjiào", "他:tā", "起床:qǐchuáng"),
        correctAnswer = "你,几,点,睡觉",
        audioToSpeak = "你几点睡觉？"
    ),

    // 10. Soal 10: Ketuk Pasangan yang Sesuai (Jadwal Rutinitas)
    Exercise(
        id = "u5_s2_p1_q10",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u5_s2_p1_m10_1", "六点起床", "liù diǎn qǐchuáng", "jam 6 bangun"),
            MatchPairItem("u5_s2_p1_m10_2", "十点睡觉", "shí diǎn shuìjiào", "jam 10 tidur"),
            MatchPairItem("u5_s2_p1_m10_3", "几点", "jǐ diǎn", "jam berapa"),
            MatchPairItem("u5_s2_p1_m10_4", "睡觉", "shuìjiào", "tidur")
        )
    )
)

val bab5Stage2Part2Exercises = listOf(
    // 1. Soal 1: Pilihan Gambar (休息 -> istirahat)
    Exercise(
        id = "u5_s2_p2_q1",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "休息",
        targetPinyin = "xiūxi",
        targetTranslation = "beristirahat",
        correctAnswer = "beristirahat",
        audioToSpeak = "休息",
        pictureOptions = listOf(
            PictureOption("u5_s2_p2_opt1", "beristirahat", "☕", R.drawable.ic_story_timer, true),
            PictureOption("u5_s2_p2_opt2", "belajar", "📖", R.drawable.ic_book, false),
            PictureOption("u5_s2_p2_opt3", "lari", "🏃", R.drawable.ic_dumbbell, false),
            PictureOption("u5_s2_p2_opt4", "bekerja", "💼", R.drawable.ic_cap, false)
        )
    ),

    // 2. Soal 2: Susun Kalimat (Saya mau istirahat.)
    Exercise(
        id = "u5_s2_p2_q2",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Saya ingin istirahat.",
        targetHanzi = "我 想 休息。",
        targetPinyin = "Wǒ xiǎng xiūxi.",
        wordChips = listOf("我:wǒ", "想:xiǎng", "休息:xiūxi", "去:qù", "睡:shuì"),
        correctAnswer = "我,想,休息",
        audioToSpeak = "我想休息。"
    ),

    // 3. Soal 3: Ketuk Pasangan yang Sesuai (Istirahat & Durasi Tidur)
    Exercise(
        id = "u5_s2_p2_q3",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u5_s2_p2_m1", "休息", "xiūxi", "beristirahat"),
            MatchPairItem("u5_s2_p2_m2", "睡", "shuì", "tidur"),
            MatchPairItem("u5_s2_p2_m3", "八个小时", "bā gè xiǎoshí", "delapan jam"),
            MatchPairItem("u5_s2_p2_m4", "很累", "hěn lèi", "sangat lelah")
        )
    ),

    // 4. Soal 4: Ketik Pinyin (istirahat -> xiūxi)
    Exercise(
        id = "u5_s2_p2_q4",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "beristirahat",
        sentenceWithBlank = "休息 (________)",
        targetHanzi = "休息",
        targetPinyin = "xiūxi",
        correctAnswer = "xiuxi",
        keyboardKeys = listOf("x", "i", "u", "a", "e", "o", "b", "d", "g", "h", "j"),
        audioToSpeak = "休息"
    ),

    // 5. Soal 5: Mendengar Kalimat (Rule 10: illustrationRes = 0)
    Exercise(
        id = "u5_s2_p2_q5",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Apa yang Anda dengar?",
        targetTranslation = "Dia tidur delapan jam.",
        targetHanzi = "他 睡 八 个 小时。",
        targetPinyin = "Tā shuì bā gè xiǎoshí.",
        wordChips = listOf("他:tā", "睡:shuì", "八:bā", "个:gè", "小时:xiǎoshí", "我:wǒ"),
        correctAnswer = "他,睡,八,个,小时",
        illustrationRes = 0,
        audioToSpeak = "他睡八个小时。"
    ),

    // 6. Soal 6: Pilihan Kalimat
    Exercise(
        id = "u5_s2_p2_q6",
        type = ExerciseType.SENTENCE_CHOICE,
        title = "Pilih terjemahan yang benar",
        targetHanzi = "你 休息 吧。",
        targetPinyin = "Nǐ xiūxi ba.",
        targetTranslation = "Kamu beristirahatlah.",
        correctAnswer = "Nǐ xiūxi ba.\n你 休息 吧。",
        options = listOf(
            "Nǐ xiūxi ba.\n你 休息 吧。",
            "Nǐ qǐchuáng ba.\n你 起床 吧。",
            "Tā xiūxi ba.\n他 休息 吧。"
        ),
        audioToSpeak = "你休息吧。"
    ),

    // 7. Soal 7: Pilihan Gambar (睡 -> tidur)
    Exercise(
        id = "u5_s2_p2_q7",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "睡",
        targetPinyin = "shuì",
        targetTranslation = "tidur",
        correctAnswer = "tidur",
        audioToSpeak = "睡",
        pictureOptions = listOf(
            PictureOption("u5_s2_p2_opt7_1", "tidur", "🛌", R.drawable.ic_book, true),
            PictureOption("u5_s2_p2_opt7_2", "bangun", "🌅", R.drawable.ic_story_timer, false),
            PictureOption("u5_s2_p2_opt7_3", "makan", "🍚", R.drawable.ic_coin, false),
            PictureOption("u5_s2_p2_opt7_4", "minum", "💧", R.drawable.ic_target, false)
        )
    ),

    // 8. Soal 8: Ketik Pinyin (tidur -> shuì)
    Exercise(
        id = "u5_s2_p2_q8",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "tidur (verba)",
        sentenceWithBlank = "睡 (________)",
        targetHanzi = "睡",
        targetPinyin = "shuì",
        correctAnswer = "shui",
        keyboardKeys = listOf("s", "h", "u", "i", "a", "e", "o", "b", "d", "g", "j"),
        audioToSpeak = "睡"
    ),

    // 9. Soal 9: Susun Kalimat (Saya tidur tujuh jam.)
    Exercise(
        id = "u5_s2_p2_q9",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Saya tidur tujuh jam.",
        targetHanzi = "我 睡 七 个 小时。",
        targetPinyin = "Wǒ shuì qī gè xiǎoshí.",
        wordChips = listOf("我:wǒ", "睡:shuì", "七:qī", "个:gè", "小时:xiǎoshí", "他:tā"),
        correctAnswer = "我,睡,七,个,小时",
        audioToSpeak = "我睡七个小时。"
    ),

    // 10. Soal 10: Ketuk Pasangan yang Sesuai (Rangkuman Istirahat)
    Exercise(
        id = "u5_s2_p2_m10_1",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u5_s2_p2_m10_1", "休息", "xiūxi", "istirahat"),
            MatchPairItem("u5_s2_p2_m10_2", "睡觉", "shuìjiào", "tidur"),
            MatchPairItem("u5_s2_p2_m10_3", "起床", "qǐchuáng", "bangun"),
            MatchPairItem("u5_s2_p2_m10_4", "小时", "xiǎoshí", "jam (durasi)")
        )
    )
)
