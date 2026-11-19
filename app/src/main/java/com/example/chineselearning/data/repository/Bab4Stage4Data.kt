package com.example.chineselearning.data.repository

import com.example.chineselearning.R
import com.example.chineselearning.data.model.Exercise
import com.example.chineselearning.data.model.ExerciseType
import com.example.chineselearning.data.model.MatchPairItem
import com.example.chineselearning.data.model.PictureOption

val bab4Stage4Part1Exercises = listOf(
    // 1. Soal 1: Pilihan Gambar (小时 -> jam durasi)
    Exercise(
        id = "u4_s4_p1_q1",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "小时",
        targetPinyin = "xiǎoshí",
        targetTranslation = "jam (durasi)",
        correctAnswer = "jam (durasi)",
        audioToSpeak = "小时",
        pictureOptions = listOf(
            PictureOption("u4_s4_p1_opt1", "jam (durasi)", "⏳", R.drawable.ic_story_timer, true),
            PictureOption("u4_s4_p1_opt2", "menit", "⏱️", R.drawable.ic_target, false),
            PictureOption("u4_s4_p1_opt3", "hari", "📅", R.drawable.ic_book, false),
            PictureOption("u4_s4_p1_opt4", "tahun", "🗓️", R.drawable.ic_crown, false)
        )
    ),

    // 2. Soal 2: Susun Kalimat (Satu jam.)
    Exercise(
        id = "u4_s4_p1_q2",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Satu jam.",
        targetHanzi = "一个 小时。",
        targetPinyin = "Yí gè xiǎoshí.",
        wordChips = listOf("一个:yí gè", "小时:xiǎoshí", "两个:liǎng gè", "分钟:fēnzhōng", "点:diǎn"),
        correctAnswer = "一个,小时",
        audioToSpeak = "一个小时。"
    ),

    // 3. Soal 3: Ketuk Pasangan yang Sesuai (Durasi & Waktu)
    Exercise(
        id = "u4_s4_p1_q3",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u4_s4_p1_m1", "小时", "xiǎoshí", "jam (durasi)"),
            MatchPairItem("u4_s4_p1_m2", "时间", "shíjiān", "waktu"),
            MatchPairItem("u4_s4_p1_m3", "时候", "shíhou", "saat / waktu"),
            MatchPairItem("u4_s4_p1_m4", "什么时候", "shénme shíhou", "kapan")
        )
    ),

    // 4. Soal 4: Ketik Pinyin (jam durasi -> xiǎoshí)
    Exercise(
        id = "u4_s4_p1_q4",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "jam (durasi)",
        sentenceWithBlank = "小时 (________)",
        targetHanzi = "小时",
        targetPinyin = "xiǎoshí",
        correctAnswer = "xiaoshi",
        keyboardKeys = listOf("x", "i", "a", "o", "s", "h", "e", "u", "b", "d", "g"),
        audioToSpeak = "小时"
    ),

    // 5. Soal 5: Mendengar Kalimat (Rule 10: illustrationRes = 0)
    Exercise(
        id = "u4_s4_p1_q5",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Apa yang Anda dengar?",
        targetTranslation = "Saya punya waktu.",
        targetHanzi = "我 有 时间。",
        targetPinyin = "Wǒ yǒu shíjiān.",
        wordChips = listOf("我:wǒ", "有:yǒu", "时间:shíjiān", "没有:méiyǒu", "钱:qián"),
        correctAnswer = "我,有,时间",
        illustrationRes = 0,
        audioToSpeak = "我有时间。"
    ),

    // 6. Soal 6: Pilihan Kalimat
    Exercise(
        id = "u4_s4_p1_q6",
        type = ExerciseType.SENTENCE_CHOICE,
        title = "Pilih terjemahan yang benar",
        targetHanzi = "你 有 时间 吗？",
        targetPinyin = "Nǐ yǒu shíjiān ma?",
        targetTranslation = "Apakah kamu punya waktu?",
        correctAnswer = "Nǐ yǒu shíjiān ma?\n你 有 时间 吗？",
        options = listOf(
            "Nǐ yǒu shíjiān ma?\n你 有 时间 吗？",
            "Nǐ yǒu qián ma?\n你 有 钱 吗？",
            "Tā yǒu shíjiān ma?\n他 有 时间 吗？"
        ),
        audioToSpeak = "你有时间吗？"
    ),

    // 7. Soal 7: Pilihan Gambar (时间 -> waktu)
    Exercise(
        id = "u4_s4_p1_q7",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "时间",
        targetPinyin = "shíjiān",
        targetTranslation = "waktu",
        correctAnswer = "waktu",
        audioToSpeak = "时间",
        pictureOptions = listOf(
            PictureOption("u4_s4_p1_opt7_1", "waktu", "⌚", R.drawable.ic_story_timer, true),
            PictureOption("u4_s4_p1_opt7_2", "tempat", "📍", R.drawable.ic_target, false),
            PictureOption("u4_s4_p1_opt7_3", "buku", "📖", R.drawable.ic_book, false),
            PictureOption("u4_s4_p1_opt7_4", "orang", "👥", R.drawable.ic_people_group, false)
        )
    ),

    // 8. Soal 8: Ketik Pinyin (waktu -> shíjiān)
    Exercise(
        id = "u4_s4_p1_q8",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "waktu",
        sentenceWithBlank = "时间 (________)",
        targetHanzi = "时间",
        targetPinyin = "shíjiān",
        correctAnswer = "shijian",
        keyboardKeys = listOf("s", "h", "i", "j", "a", "n", "e", "o", "u", "b", "d"),
        audioToSpeak = "时间"
    ),

    // 9. Soal 9: Susun Kalimat (Dua jam.)
    Exercise(
        id = "u4_s4_p1_q9",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Dua jam.",
        targetHanzi = "两个 小时。",
        targetPinyin = "Liǎng gè xiǎoshí.",
        wordChips = listOf("两个:liǎng gè", "小时:xiǎoshí", "二:èr", "个:gè", "分钟:fēnzhōng"),
        correctAnswer = "两个,小时",
        audioToSpeak = "两个小时。"
    ),

    // 10. Soal 10: Ketuk Pasangan yang Sesuai (Durasi Satuan)
    Exercise(
        id = "u4_s4_p1_q10",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u4_s4_p1_m10_1", "一个小时", "yí gè xiǎoshí", "satu jam"),
            MatchPairItem("u4_s4_p1_m10_2", "两个小时", "liǎng gè xiǎoshí", "dua jam"),
            MatchPairItem("u4_s4_p1_m10_3", "没有时间", "méiyǒu shíjiān", "tidak ada waktu"),
            MatchPairItem("u4_s4_p1_m10_4", "有时间", "yǒu shíjiān", "ada waktu")
        )
    )
)

val bab4Stage4Part2Exercises = listOf(
    // 1. Soal 1: Pilihan Gambar (什么时候 -> kapan)
    Exercise(
        id = "u4_s4_p2_q1",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "什么时候",
        targetPinyin = "shénme shíhou",
        targetTranslation = "kapan",
        correctAnswer = "kapan",
        audioToSpeak = "什么时候",
        pictureOptions = listOf(
            PictureOption("u4_s4_p2_opt1", "kapan", "❓", R.drawable.ic_story_timer, true),
            PictureOption("u4_s4_p2_opt2", "siapa", "👤", R.drawable.ic_person_saya, false),
            PictureOption("u4_s4_p2_opt3", "di mana", "📍", R.drawable.ic_target, false),
            PictureOption("u4_s4_p2_opt4", "berapa", "🔢", R.drawable.ic_coin, false)
        )
    ),

    // 2. Soal 2: Susun Kalimat (Kamu kapan pergi ke Beijing?)
    Exercise(
        id = "u4_s4_p2_q2",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Kamu kapan pergi ke Beijing?",
        targetHanzi = "你 什么时候 去 北京？",
        targetPinyin = "Nǐ shénme shíhou qù Běijīng?",
        wordChips = listOf("你:nǐ", "什么时候:shénme shíhou", "去:qù", "北京:Běijīng", "他:tā", "来:lái"),
        correctAnswer = "你,什么时候,去,北京",
        audioToSpeak = "你什么时候去北京？"
    ),

    // 3. Soal 3: Ketuk Pasangan yang Sesuai (Kata Keterangan Waktu)
    Exercise(
        id = "u4_s4_p2_q3",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u4_s4_p2_m1", "什么时候", "shénme shíhou", "kapan"),
            MatchPairItem("u4_s4_p2_m2", "的时候", "de shíhou", "saat / ketika"),
            MatchPairItem("u4_s4_p2_m3", "现在", "xiànzài", "sekarang"),
            MatchPairItem("u4_s4_p2_m4", "小时", "xiǎoshí", "jam (durasi)")
        )
    ),

    // 4. Soal 4: Ketik Pinyin (kapan -> shénmeshíhou)
    Exercise(
        id = "u4_s4_p2_q4",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "kapan",
        sentenceWithBlank = "什么时候 (________)",
        targetHanzi = "什么时候",
        targetPinyin = "shénme shíhou",
        correctAnswer = "shenmeshihou",
        keyboardKeys = listOf("s", "h", "e", "n", "m", "i", "o", "u", "a", "b", "d"),
        audioToSpeak = "什么时候"
    ),

    // 5. Soal 5: Mendengar Kalimat (Rule 10: illustrationRes = 0)
    Exercise(
        id = "u4_s4_p2_q5",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Apa yang Anda dengar?",
        targetTranslation = "Kapan dia datang?",
        targetHanzi = "他 什么时候 来？",
        targetPinyin = "Tā shénme shíhou lái?",
        wordChips = listOf("他:tā", "什么时候:shénme shíhou", "来:lái", "去:qù", "你:nǐ"),
        correctAnswer = "他,什么时候,来",
        illustrationRes = 0,
        audioToSpeak = "他什么时候来？"
    ),

    // 6. Soal 6: Pilihan Kalimat
    Exercise(
        id = "u4_s4_p2_q6",
        type = ExerciseType.SENTENCE_CHOICE,
        title = "Pilih terjemahan yang benar",
        targetHanzi = "我们 什么时候 见？",
        targetPinyin = "Wǒmen shénme shíhou jiàn?",
        targetTranslation = "Kita kapan bertemu?",
        correctAnswer = "Wǒmen shénme shíhou jiàn?\n我们 什么时候 见？",
        options = listOf(
            "Wǒmen shénme shíhou jiàn?\n我们 什么时候 见？",
            "Nǐmen shénme shíhou qù?\n你们 什么时候 去？",
            "Tāmen shénme shíhou lái?\n他们 什么时候 来？"
        ),
        audioToSpeak = "我们什么时候见？"
    ),

    // 7. Soal 7: Pilihan Gambar (的时候 -> saat / ketika)
    Exercise(
        id = "u4_s4_p2_q7",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "时候",
        targetPinyin = "shíhou",
        targetTranslation = "saat / waktu",
        correctAnswer = "saat / waktu",
        audioToSpeak = "时候",
        pictureOptions = listOf(
            PictureOption("u4_s4_p2_opt7_1", "saat / waktu", "⏰", R.drawable.ic_story_timer, true),
            PictureOption("u4_s4_p2_opt7_2", "tempat", "📍", R.drawable.ic_target, false),
            PictureOption("u4_s4_p2_opt7_3", "orang", "👤", R.drawable.ic_person_guru, false),
            PictureOption("u4_s4_p2_opt7_4", "buku", "📚", R.drawable.ic_book, false)
        )
    ),

    // 8. Soal 8: Ketik Pinyin (saat / waktu -> shíhou)
    Exercise(
        id = "u4_s4_p2_q8",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "saat / waktu",
        sentenceWithBlank = "时候 (________)",
        targetHanzi = "时候",
        targetPinyin = "shíhou",
        correctAnswer = "shihou",
        keyboardKeys = listOf("s", "h", "i", "o", "u", "a", "e", "b", "d", "g", "j"),
        audioToSpeak = "时候"
    ),

    // 9. Soal 9: Susun Kalimat (Kapan Anda makan?)
    Exercise(
        id = "u4_s4_p2_q9",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Kapan kamu makan?",
        targetHanzi = "你 什么时候 吃饭？",
        targetPinyin = "Nǐ shénme shíhou chīfàn?",
        wordChips = listOf("你:nǐ", "什么时候:shénme shíhou", "吃饭:chīfàn", "睡觉:shuìjiào", "去:qù"),
        correctAnswer = "你,什么时候,吃饭",
        audioToSpeak = "你什么时候吃饭？"
    ),

    // 10. Soal 10: Ketuk Pasangan yang Sesuai (Rangkuman Pertanyaan Waktu)
    Exercise(
        id = "u4_s4_p2_q10",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u4_s4_p2_m10_1", "什么时候", "shénme shíhou", "kapan"),
            MatchPairItem("u4_s4_p2_m10_2", "什么时候见", "shénme shíhou jiàn", "kapan bertemu"),
            MatchPairItem("u4_s4_p2_m10_3", "有时间", "yǒu shíjiān", "punya waktu"),
            MatchPairItem("u4_s4_p2_m10_4", "三个小时", "sān gè xiǎoshí", "tiga jam")
        )
    )
)
