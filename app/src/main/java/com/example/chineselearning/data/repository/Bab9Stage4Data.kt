package com.example.chineselearning.data.repository

import com.example.chineselearning.R
import com.example.chineselearning.data.model.Exercise
import com.example.chineselearning.data.model.ExerciseType
import com.example.chineselearning.data.model.MatchPairItem
import com.example.chineselearning.data.model.PictureOption

val bab9Stage4Part1Exercises = listOf(
    // 1. Soal 1: Pilihan Gambar (这个 -> yang ini)
    Exercise(
        id = "u9_s4_p1_q1",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "这个",
        targetPinyin = "zhège",
        targetTranslation = "yang ini",
        correctAnswer = "yang ini",
        audioToSpeak = "这个",
        pictureOptions = listOf(
            PictureOption("u9_s4_p1_opt1", "yang ini", "👈", R.drawable.ic_target, true),
            PictureOption("u9_s4_p1_opt2", "yang itu", "👉", R.drawable.ic_coin, false),
            PictureOption("u9_s4_p1_opt3", "yang mana", "❓", R.drawable.ic_book, false),
            PictureOption("u9_s4_p1_opt4", "semua", "💯", R.drawable.ic_crown, false)
        )
    ),

    // 2. Soal 2: Susun Kalimat (Saya menginginkan yang ini.)
    Exercise(
        id = "u9_s4_p1_q2",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Saya ingin yang ini.",
        targetHanzi = "我 要 这个。",
        targetPinyin = "Wǒ yào zhège.",
        wordChips = listOf("我:wǒ", "要:yào", "这个:zhège", "那个:nàge", "买:mǎi"),
        correctAnswer = "我,要,这个",
        audioToSpeak = "我要这个。"
    ),

    // 3. Soal 3: Ketuk Pasangan yang Sesuai (Demonstratif Pilihan)
    Exercise(
        id = "u9_s4_p1_q3",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u9_s4_p1_m1", "这个", "zhège", "yang ini"),
            MatchPairItem("u9_s4_p1_m2", "那个", "nàge", "yang itu"),
            MatchPairItem("u9_s4_p1_m3", "哪个", "nǎge", "yang mana"),
            MatchPairItem("u9_s4_p1_m4", "哪", "nǎ", "mana")
        )
    ),

    // 4. Soal 4: Ketik Pinyin (yang ini -> zhège)
    Exercise(
        id = "u9_s4_p1_q4",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "yang ini",
        sentenceWithBlank = "这个 (________)",
        targetHanzi = "这个",
        targetPinyin = "zhège",
        correctAnswer = "zhege",
        keyboardKeys = listOf("z", "h", "e", "g", "a", "i", "o", "u", "b", "d", "j"),
        audioToSpeak = "这个"
    ),

    // 5. Soal 5: Mendengar Kalimat (Rule 10: illustrationRes = 0)
    Exercise(
        id = "u9_s4_p1_q5",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Apa yang Anda dengar?",
        targetTranslation = "Kamu ingin yang mana?",
        targetHanzi = "你 要 哪个？",
        targetPinyin = "Nǐ yào nǎge?",
        wordChips = listOf("你:nǐ", "要:yào", "哪个:nǎge", "这个:zhège", "那个:nàge"),
        correctAnswer = "你,要,哪个",
        illustrationRes = 0,
        audioToSpeak = "你要哪个？"
    ),

    // 6. Soal 6: Pilihan Kalimat
    Exercise(
        id = "u9_s4_p1_q6",
        type = ExerciseType.SENTENCE_CHOICE,
        title = "Pilih terjemahan yang benar",
        targetHanzi = "那个 杯子 是 我 的。",
        targetPinyin = "Nàge bēizi shì wǒ de.",
        targetTranslation = "Gelas yang itu adalah milik saya.",
        correctAnswer = "Nàge bēizi shì wǒ de.\n那个 杯子 是 我 的。",
        options = listOf(
            "Nàge bēizi shì wǒ de.\n那个 杯子 是 我 的。",
            "Zhège bēizi shì wǒ de.\n这个 杯子 是 我 的。",
            "Nàge shū shì wǒ de.\n那个 书 是 我 的。"
        ),
        audioToSpeak = "那个杯子是我的。"
    ),

    // 7. Soal 7: Pilihan Gambar (那个 -> yang itu)
    Exercise(
        id = "u9_s4_p1_q7",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "那个",
        targetPinyin = "nàge",
        targetTranslation = "yang itu",
        correctAnswer = "yang itu",
        audioToSpeak = "那个",
        pictureOptions = listOf(
            PictureOption("u9_s4_p1_opt7_1", "yang itu", "👉", R.drawable.ic_coin, true),
            PictureOption("u9_s4_p1_opt7_2", "yang ini", "👈", R.drawable.ic_target, false),
            PictureOption("u9_s4_p1_opt7_3", "yang mana", "❓", R.drawable.ic_book, false),
            PictureOption("u9_s4_p1_opt7_4", "semua", "💯", R.drawable.ic_crown, false)
        )
    ),

    // 8. Soal 8: Ketik Pinyin (yang itu -> nàge)
    Exercise(
        id = "u9_s4_p1_q8",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "yang itu",
        sentenceWithBlank = "那个 (________)",
        targetHanzi = "那个",
        targetPinyin = "nàge",
        correctAnswer = "nage",
        keyboardKeys = listOf("n", "a", "g", "e", "i", "o", "u", "b", "d", "h", "j"),
        audioToSpeak = "那个"
    ),

    // 9. Soal 9: Susun Kalimat (Yang mana buku milikmu?)
    Exercise(
        id = "u9_s4_p1_q9",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Yang mana buku milikmu?",
        targetHanzi = "哪个 是 你 的 书？",
        targetPinyin = "Nǎge shì nǐ de shū?",
        wordChips = listOf("哪个:nǎge", "是:shì", "你:nǐ", "的:de", "书:shū", "这个:zhège"),
        correctAnswer = "哪个,是,你,的,书",
        audioToSpeak = "哪个是你的书？"
    ),

    // 10. Soal 10: Ketuk Pasangan yang Sesuai (Rangkuman Pilihan Benda)
    Exercise(
        id = "u9_s4_p1_m10_1",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u9_s4_p1_m10_1", "这个", "zhège", "yang ini"),
            MatchPairItem("u9_s4_p1_m10_2", "那个", "nàge", "yang itu"),
            MatchPairItem("u9_s4_p1_m10_3", "哪个", "nǎge", "yang mana"),
            MatchPairItem("u9_s4_p1_m10_4", "我要这个", "wǒ yào zhège", "saya mau yang ini")
        )
    )
)

val bab9Stage4Part2Exercises = listOf(
    // 1. Soal 1: Pilihan Gambar (到 -> tiba / sampai)
    Exercise(
        id = "u9_s4_p2_q1",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "到",
        targetPinyin = "dào",
        targetTranslation = "tiba / sampai",
        correctAnswer = "tiba / sampai",
        audioToSpeak = "到",
        pictureOptions = listOf(
            PictureOption("u9_s4_p2_opt1", "tiba / sampai", "🏁", R.drawable.ic_target, true),
            PictureOption("u9_s4_p2_opt2", "pergi", "🚶", R.drawable.ic_coin, false),
            PictureOption("u9_s4_p2_opt3", "makan", "🍜", R.drawable.ic_book, false),
            PictureOption("u9_s4_p2_opt4", "tidur", "🛌", R.drawable.ic_crown, false)
        )
    ),

    // 2. Soal 2: Susun Kalimat (Saya sudah sampai di sekolah.)
    Exercise(
        id = "u9_s4_p2_q2",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Saya sudah sampai di sekolah.",
        targetHanzi = "我 到 学校 了。",
        targetPinyin = "Wǒ dào xuéxiào le.",
        wordChips = listOf("我:wǒ", "到:dào", "学校:xuéxiào", "了:le", "家:jiā", "去:qù"),
        correctAnswer = "我,到,学校,了",
        audioToSpeak = "我到学校了。"
    ),

    // 3. Soal 3: Ketuk Pasangan yang Sesuai (Tiba & Perjalanan)
    Exercise(
        id = "u9_s4_p2_q3",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u9_s4_p2_m1", "到", "dào", "tiba / sampai"),
            MatchPairItem("u9_s4_p2_m2", "到了", "dào le", "sudah sampai"),
            MatchPairItem("u9_s4_p2_m3", "回家", "huíjiā", "pulang ke rumah"),
            MatchPairItem("u9_s4_p2_m4", "到北京", "dào Běijīng", "sampai di Beijing")
        )
    ),

    // 4. Soal 4: Ketik Pinyin (tiba / sampai -> dào)
    Exercise(
        id = "u9_s4_p2_q4",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "tiba / sampai",
        sentenceWithBlank = "到 (________)",
        targetHanzi = "到",
        targetPinyin = "dào",
        correctAnswer = "dao",
        keyboardKeys = listOf("n", "a", "g", "e", "i", "o", "u", "b", "d", "h", "j"),
        audioToSpeak = "到"
    ),

    // 5. Soal 5: Mendengar Kalimat (Rule 10: illustrationRes = 0)
    Exercise(
        id = "u9_s4_p2_q5",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Apa yang Anda dengar?",
        targetTranslation = "Dia jam berapa sampai di rumah?",
        targetHanzi = "他 几 点 到 家？",
        targetPinyin = "Tā jǐ diǎn dào jiā?",
        wordChips = listOf("他:tā", "几:jǐ", "点:diǎn", "到:dào", "家:jiā", "学校:xuéxiào"),
        correctAnswer = "他,几,点,到,家",
        illustrationRes = 0,
        audioToSpeak = "他几点到家？"
    ),

    // 6. Soal 6: Pilihan Kalimat
    Exercise(
        id = "u9_s4_p2_q6",
        type = ExerciseType.SENTENCE_CHOICE,
        title = "Pilih terjemahan yang benar",
        targetHanzi = "我们 到 了。",
        targetPinyin = "Wǒmen dào le.",
        targetTranslation = "Kita sudah sampai.",
        correctAnswer = "Wǒmen dào le.\n我们 到 了。",
        options = listOf(
            "Wǒmen dào le.\n我们 到 了。",
            "Tāmen dào le.\n他们 到 了。",
            "Wǒmen qù le.\n我们 去 了。"
        ),
        audioToSpeak = "我们到了。"
    ),

    // 7. Soal 7: Pilihan Gambar (到了 -> sudah sampai)
    Exercise(
        id = "u9_s4_p2_q7",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "到了",
        targetPinyin = "dào le",
        targetTranslation = "sudah sampai",
        correctAnswer = "sudah sampai",
        audioToSpeak = "到了",
        pictureOptions = listOf(
            PictureOption("u9_s4_p2_opt7_1", "sudah sampai", "🏁", R.drawable.ic_target, true),
            PictureOption("u9_s4_p2_opt7_2", "berangkat", "🛫", R.drawable.ic_coin, false),
            PictureOption("u9_s4_p2_opt7_3", "makan", "🍜", R.drawable.ic_book, false),
            PictureOption("u9_s4_p2_opt7_4", "tidur", "🛌", R.drawable.ic_crown, false)
        )
    ),

    // 8. Soal 8: Ketik Pinyin (yang mana -> nǎge)
    Exercise(
        id = "u9_s4_p2_q8",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "yang mana",
        sentenceWithBlank = "哪个 (________)",
        targetHanzi = "哪个",
        targetPinyin = "nǎge",
        correctAnswer = "nage",
        keyboardKeys = listOf("n", "a", "g", "e", "i", "u", "b", "d", "h", "j", "l"),
        audioToSpeak = "哪个"
    ),

    // 9. Soal 9: Susun Kalimat (Saya sampai di Beijing jam sembilan.)
    Exercise(
        id = "u9_s4_p2_q9",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Saya jam 9 sampai di Beijing.",
        targetHanzi = "我 九 点 到 北京。",
        targetPinyin = "Wǒ jiǔ diǎn dào Běijīng.",
        wordChips = listOf("我:wǒ", "九:jiǔ", "点:diǎn", "到:dào", "北京:Běijīng", "去:qù"),
        correctAnswer = "我,九,点,到,北京",
        audioToSpeak = "我九点到北京。"
    ),

    // 10. Soal 10: Ketuk Pasangan yang Sesuai (Rangkuman Tiba & Tujuan)
    Exercise(
        id = "u9_s4_p2_m10_1",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u9_s4_p2_m10_1", "到家", "dào jiā", "sampai rumah"),
            MatchPairItem("u9_s4_p2_m10_2", "到了", "dào le", "sudah sampai"),
            MatchPairItem("u9_s4_p2_m10_3", "哪个", "nǎge", "yang mana"),
            MatchPairItem("u9_s4_p2_m10_4", "这个", "zhège", "yang ini")
        )
    )
)
