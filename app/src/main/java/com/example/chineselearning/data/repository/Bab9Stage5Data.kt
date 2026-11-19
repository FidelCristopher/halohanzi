package com.example.chineselearning.data.repository

import com.example.chineselearning.R
import com.example.chineselearning.data.model.Exercise
import com.example.chineselearning.data.model.ExerciseType
import com.example.chineselearning.data.model.MatchPairItem
import com.example.chineselearning.data.model.PictureOption

val bab9Stage5Part1Exercises = listOf(
    // 1. Soal 1: Pilihan Gambar (这儿 -> di sini)
    Exercise(
        id = "u9_s5_p1_q1",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "这儿",
        targetPinyin = "zhèr",
        targetTranslation = "di sini",
        correctAnswer = "di sini",
        audioToSpeak = "这儿",
        pictureOptions = listOf(
            PictureOption("u9_s5_p1_opt1", "di sini", "📍", R.drawable.ic_target, true),
            PictureOption("u9_s5_p1_opt2", "di sana", "👉", R.drawable.ic_coin, false),
            PictureOption("u9_s5_p1_opt3", "di mana", "❓", R.drawable.ic_book, false),
            PictureOption("u9_s5_p1_opt4", "rumah", "🏠", R.drawable.ic_crown, false)
        )
    ),

    // 2. Soal 2: Susun Kalimat (Buku saya ada di atas meja.)
    Exercise(
        id = "u9_s5_p1_q2",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Buku saya ada di atas meja.",
        targetHanzi = "我 的 书 在 桌子 上。",
        targetPinyin = "Wǒ de shū zài zhuōzi shang.",
        wordChips = listOf("我:wǒ", "的:de", "书:shū", "在:zài", "桌子:zhuōzi", "上:shang", "下:xià"),
        correctAnswer = "我,的,书,在,桌子,上",
        audioToSpeak = "我的书在桌子上。"
    ),

    // 3. Soal 3: Ketuk Pasangan yang Sesuai (Rangkuman Bab 9 Bagian 1)
    Exercise(
        id = "u9_s5_p1_q3",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u9_s5_p1_m1", "上", "shàng", "atas"),
            MatchPairItem("u9_s5_p1_m2", "下", "xià", "bawah"),
            MatchPairItem("u9_s5_p1_m3", "前", "qián", "depan"),
            MatchPairItem("u9_s5_p1_m4", "后", "hòu", "belakang")
        )
    ),

    // 4. Soal 4: Ketik Pinyin (atas -> shàng)
    Exercise(
        id = "u9_s5_p1_q4",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "atas",
        sentenceWithBlank = "上 (________)",
        targetHanzi = "上",
        targetPinyin = "shàng",
        correctAnswer = "shang",
        keyboardKeys = listOf("s", "h", "a", "n", "g", "e", "i", "o", "u", "b", "d"),
        audioToSpeak = "上"
    ),

    // 5. Soal 5: Mendengar Kalimat (Rule 10: illustrationRes = 0)
    Exercise(
        id = "u9_s5_p1_q5",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Apa yang Anda dengar?",
        targetTranslation = "Toko tepat di depan.",
        targetHanzi = "商店 在 前面。",
        targetPinyin = "Shāngdiàn zài qiánmiàn.",
        wordChips = listOf("商店:shāngdiàn", "在:zài", "前面:qiánmiàn", "后面:hòumiàn", "超市:chāoshì"),
        correctAnswer = "商店,在,前面",
        illustrationRes = 0,
        audioToSpeak = "商店在前面。"
    ),

    // 6. Soal 6: Pilihan Kalimat
    Exercise(
        id = "u9_s5_p1_q6",
        type = ExerciseType.SENTENCE_CHOICE,
        title = "Pilih terjemahan yang benar",
        targetHanzi = "他 在 房间 里 看书。",
        targetPinyin = "Tā zài fángjiān lǐ kànshū.",
        targetTranslation = "Dia membaca buku di dalam kamar.",
        correctAnswer = "Tā zài fángjiān lǐ kànshū.\n他 在 房间 里 看书。",
        options = listOf(
            "Tā zài fángjiān lǐ kànshū.\n他 在 房间 里 看书。",
            "Tā zài wàibian kànshū.\n他 在 外边 看书。",
            "Wǒ zài fángjiān lǐ kànshū.\n我 在 房间 里 看书。"
        ),
        audioToSpeak = "他在房间里看书。"
    ),

    // 7. Soal 7: Pilihan Gambar (前面 -> depan)
    Exercise(
        id = "u9_s5_p1_q7",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "前面",
        targetPinyin = "qiánmiàn",
        targetTranslation = "di depan",
        correctAnswer = "di depan",
        audioToSpeak = "前面",
        pictureOptions = listOf(
            PictureOption("u9_s5_p1_opt7_1", "di depan", "⏩", R.drawable.ic_target, true),
            PictureOption("u9_s5_p1_opt7_2", "di belakang", "⏪", R.drawable.ic_coin, false),
            PictureOption("u9_s5_p1_opt7_3", "di atas", "⬆️", R.drawable.ic_crown, false),
            PictureOption("u9_s5_p1_opt7_4", "di bawah", "⬇️", R.drawable.ic_book, false)
        )
    ),

    // 8. Soal 8: Ketik Pinyin (di sini -> zhèr)
    Exercise(
        id = "u9_s5_p1_q8",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "di sini",
        sentenceWithBlank = "这儿 (________)",
        targetHanzi = "这儿",
        targetPinyin = "zhèr",
        correctAnswer = "zher",
        keyboardKeys = listOf("z", "h", "e", "r", "a", "i", "o", "u", "b", "d", "g"),
        audioToSpeak = "这儿"
    ),

    // 9. Soal 9: Susun Kalimat (Saya sudah sampai di rumah.)
    Exercise(
        id = "u9_s5_p1_q9",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Saya sudah sampai rumah.",
        targetHanzi = "我 到 家 了。",
        targetPinyin = "Wǒ dào jiā le.",
        wordChips = listOf("我:wǒ", "到:dào", "家:jiā", "了:le", "学校:xuéxiào", "去:qù"),
        correctAnswer = "我,到,家,了",
        audioToSpeak = "我到家了。"
    ),

    // 10. Soal 10: Ketuk Pasangan yang Sesuai (Rangkuman Posisi Lengkap)
    Exercise(
        id = "u9_s5_p1_m10_1",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u9_s5_p1_m10_1", "桌子上", "zhuōzi shang", "di atas meja"),
            MatchPairItem("u9_s5_p1_m10_2", "椅子下", "yǐzi xia", "di bawah kursi"),
            MatchPairItem("u9_s5_p1_m10_3", "在前面", "zài qiánmiàn", "di depan"),
            MatchPairItem("u9_s5_p1_m10_4", "在后面", "zài hòumiàn", "di belakang")
        )
    )
)

val bab9Stage5Part2Exercises = listOf(
    // 1. Soal 1: Pilihan Gambar (哪儿 -> di mana)
    Exercise(
        id = "u9_s5_p2_q1",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "哪儿",
        targetPinyin = "nǎr",
        targetTranslation = "di mana",
        correctAnswer = "di mana",
        audioToSpeak = "哪儿",
        pictureOptions = listOf(
            PictureOption("u9_s5_p2_opt1", "di mana", "❓", R.drawable.ic_book, true),
            PictureOption("u9_s5_p2_opt2", "di sini", "📍", R.drawable.ic_target, false),
            PictureOption("u9_s5_p2_opt3", "di sana", "👉", R.drawable.ic_coin, false),
            PictureOption("u9_s5_p2_opt4", "rumah", "🏠", R.drawable.ic_crown, false)
        )
    ),

    // 2. Soal 2: Susun Kalimat (Kamu ada di mana?)
    Exercise(
        id = "u9_s5_p2_q2",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Kamu ada di mana?",
        targetHanzi = "你 在 哪儿？",
        targetPinyin = "Nǐ zài nǎr?",
        wordChips = listOf("你:nǐ", "在:zài", "哪儿:nǎr", "这儿:zhèr", "那儿:nàr"),
        correctAnswer = "你,在,哪儿",
        audioToSpeak = "你在哪儿？"
    ),

    // 3. Soal 3: Ketuk Pasangan yang Sesuai (Grand Review Bab 9)
    Exercise(
        id = "u9_s5_p2_m3",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u9_s5_p2_m1", "这儿", "zhèr", "di sini"),
            MatchPairItem("u9_s5_p2_m2", "那儿", "nàr", "di sana"),
            MatchPairItem("u9_s5_p2_m3", "这个", "zhège", "yang ini"),
            MatchPairItem("u9_s5_p2_m4", "那个", "nàge", "yang itu")
        )
    ),

    // 4. Soal 4: Ketik Pinyin (di sana -> nàr)
    Exercise(
        id = "u9_s5_p2_q4",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "di sana",
        sentenceWithBlank = "那儿 (________)",
        targetHanzi = "那儿",
        targetPinyin = "nàr",
        correctAnswer = "nar",
        keyboardKeys = listOf("n", "a", "r", "e", "i", "o", "u", "b", "d", "g", "h"),
        audioToSpeak = "那儿"
    ),

    // 5. Soal 5: Mendengar Kalimat (Rule 10: illustrationRes = 0)
    Exercise(
        id = "u9_s5_p2_q5",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Apa yang Anda dengar?",
        targetTranslation = "Gelas ada di dalam kamar.",
        targetHanzi = "杯子 在 房间 里。",
        targetPinyin = "Bēizi zài fángjiān lǐ.",
        wordChips = listOf("杯子:bēizi", "在:zài", "房间:fángjiān", "里:lǐ", "外边:wàibian"),
        correctAnswer = "杯子,在,房间,里",
        illustrationRes = 0,
        audioToSpeak = "杯子在房间里。"
    ),

    // 6. Soal 6: Pilihan Kalimat
    Exercise(
        id = "u9_s5_p2_q6",
        type = ExerciseType.SENTENCE_CHOICE,
        title = "Pilih terjemahan yang benar",
        targetHanzi = "火车站 在 那儿。",
        targetPinyin = "Huǒchēzhàn zài nàr.",
        targetTranslation = "Stasiun kereta ada di sana.",
        correctAnswer = "Huǒchēzhàn zài nàr.\n火车站 在 那儿。",
        options = listOf(
            "Huǒchēzhàn zài nàr.\n火车站 在 那儿。",
            "Huǒchēzhàn zài zhèr.\n火车站 在 这儿。",
            "Xuéxiào zài nàr.\n学校 在 那儿。"
        ),
        audioToSpeak = "火车站 在 那儿。"
    ),

    // 7. Soal 7: Pilihan Gambar (前面 -> di depan)
    Exercise(
        id = "u9_s5_p2_q7",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "前面",
        targetPinyin = "qiánmiàn",
        targetTranslation = "di depan",
        correctAnswer = "di depan",
        audioToSpeak = "前面",
        pictureOptions = listOf(
            PictureOption("u9_s5_p2_opt7_1", "di depan", "⏩", R.drawable.ic_target, true),
            PictureOption("u9_s5_p2_opt7_2", "di belakang", "⏪", R.drawable.ic_coin, false),
            PictureOption("u9_s5_p2_opt7_3", "di dalam", "📦", R.drawable.ic_book, false),
            PictureOption("u9_s5_p2_opt7_4", "di luar", "🚪", R.drawable.ic_crown, false)
        )
    ),

    // 8. Soal 8: Ketik Pinyin (di depan -> qiánmiàn)
    Exercise(
        id = "u9_s5_p2_q8",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "di depan",
        sentenceWithBlank = "前面 (________)",
        targetHanzi = "前面",
        targetPinyin = "qiánmiàn",
        correctAnswer = "qianmian",
        keyboardKeys = listOf("q", "i", "a", "n", "m", "e", "o", "u", "b", "d", "g"),
        audioToSpeak = "前面"
    ),

    // 9. Soal 9: Susun Kalimat (Grand Evaluasi Bab 9)
    Exercise(
        id = "u9_s5_p2_q9",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Saya ingin membeli yang ini.",
        targetHanzi = "我 想 买 这个。",
        targetPinyin = "Wǒ xiǎng mǎi zhège.",
        wordChips = listOf("我:wǒ", "想:xiǎng", "买:mǎi", "这个:zhège", "那个:nàge"),
        correctAnswer = "我,想,买,这个",
        audioToSpeak = "我想买这个。"
    ),

    // 10. Soal 10: Ketuk Pasangan yang Sesuai (Grand Review Bab 9 Akhir)
    Exercise(
        id = "u9_s5_p2_m10_1",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u9_s5_p2_m10_1", "前面", "qiánmiàn", "di depan"),
            MatchPairItem("u9_s5_p2_m10_2", "后面", "hòumiàn", "di belakang"),
            MatchPairItem("u9_s5_p2_m10_3", "哪儿", "nǎr", "di mana"),
            MatchPairItem("u9_s5_p2_m10_4", "到家", "dào jiā", "sampai rumah")
        )
    )
)
