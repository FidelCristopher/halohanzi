package com.example.chineselearning.data.repository

import com.example.chineselearning.R
import com.example.chineselearning.data.model.Exercise
import com.example.chineselearning.data.model.ExerciseType
import com.example.chineselearning.data.model.MatchPairItem
import com.example.chineselearning.data.model.PictureOption

val bab6Stage4Part1Exercises = listOf(
    // 1. Soal 1: Pilihan Gambar (房间 -> kamar / ruangan)
    Exercise(
        id = "u6_s4_p1_q1",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "房间",
        targetPinyin = "fángjiān",
        targetTranslation = "kamar / ruangan",
        correctAnswer = "kamar / ruangan",
        audioToSpeak = "房间",
        pictureOptions = listOf(
            PictureOption("u6_s4_p1_opt1", "kamar / ruangan", "🚪", R.drawable.ic_book, true),
            PictureOption("u6_s4_p1_opt2", "meja", "🪑", R.drawable.ic_crown, false),
            PictureOption("u6_s4_p1_opt3", "buku", "📖", R.drawable.ic_story_timer, false),
            PictureOption("u6_s4_p1_opt4", "uang", "🪙", R.drawable.ic_coin, false)
        )
    ),

    // 2. Soal 2: Susun Kalimat (Ini adalah kamar saya.)
    Exercise(
        id = "u6_s4_p1_q2",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Ini adalah kamar saya.",
        targetHanzi = "这 是 我 的 房间。",
        targetPinyin = "Zhè shì wǒ de fángjiān.",
        wordChips = listOf("这:zhè", "是:shì", "我:wǒ", "的:de", "房间:fángjiān", "家:jiā", "那:nà"),
        correctAnswer = "这,是,我,的,房间",
        audioToSpeak = "这是我的房间。"
    ),

    // 3. Soal 3: Ketuk Pasangan yang Sesuai (Kamar & Perabot)
    Exercise(
        id = "u6_s4_p1_q3",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u6_s4_p1_m1", "房间", "fángjiān", "kamar / ruangan"),
            MatchPairItem("u6_s4_p1_m2", "桌子", "zhuōzi", "meja"),
            MatchPairItem("u6_s4_p1_m3", "椅子", "yǐzi", "kursi"),
            MatchPairItem("u6_s4_p1_m4", "很大", "hěn dà", "sangat besar")
        )
    ),

    // 4. Soal 4: Ketik Pinyin (kamar -> fángjiān)
    Exercise(
        id = "u6_s4_p1_q4",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "kamar / ruangan",
        sentenceWithBlank = "房间 (________)",
        targetHanzi = "房间",
        targetPinyin = "fángjiān",
        correctAnswer = "fangjian",
        keyboardKeys = listOf("f", "a", "n", "g", "j", "i", "e", "o", "u", "b", "d"),
        audioToSpeak = "房间"
    ),

    // 5. Soal 5: Mendengar Kalimat (Rule 10: illustrationRes = 0)
    Exercise(
        id = "u6_s4_p1_q5",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Apa yang Anda dengar?",
        targetTranslation = "Kamarnya sangat besar.",
        targetHanzi = "房间 很 大。",
        targetPinyin = "Fángjiān hěn dà.",
        wordChips = listOf("房间:fángjiān", "很:hěn", "大:dà", "小:xiǎo", "桌子:zhuōzi"),
        correctAnswer = "房间,很,大",
        illustrationRes = 0,
        audioToSpeak = "房间很大。"
    ),

    // 6. Soal 6: Pilihan Kalimat
    Exercise(
        id = "u6_s4_p1_q6",
        type = ExerciseType.SENTENCE_CHOICE,
        title = "Pilih terjemahan yang benar",
        targetHanzi = "房间 里 有 桌子。",
        targetPinyin = "Fángjiān lǐ yǒu zhuōzi.",
        targetTranslation = "Di dalam kamar ada meja.",
        correctAnswer = "Fángjiān lǐ yǒu zhuōzi.\n房间 里 有 桌子。",
        options = listOf(
            "Fángjiān lǐ yǒu zhuōzi.\n房间 里 有 桌子。",
            "Fángjiān lǐ yǒu yǐzi.\n房间 里 有 椅子。",
            "Jiā lǐ yǒu zhuōzi.\n家 里 有 桌子。"
        ),
        audioToSpeak = "房间里有桌子。"
    ),

    // 7. Soal 7: Pilihan Gambar (桌子 -> meja)
    Exercise(
        id = "u6_s4_p1_q7",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "桌子",
        targetPinyin = "zhuōzi",
        targetTranslation = "meja",
        correctAnswer = "meja",
        audioToSpeak = "桌子",
        pictureOptions = listOf(
            PictureOption("u6_s4_p1_opt7_1", "meja", "🪵", R.drawable.ic_book, true),
            PictureOption("u6_s4_p1_opt7_2", "kursi", "🪑", R.drawable.ic_story_timer, false),
            PictureOption("u6_s4_p1_opt7_3", "pintu", "🚪", R.drawable.ic_target, false),
            PictureOption("u6_s4_p1_opt7_4", "uang", "🪙", R.drawable.ic_coin, false)
        )
    ),

    // 8. Soal 8: Ketik Pinyin (meja -> zhuōzi)
    Exercise(
        id = "u6_s4_p1_q8",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "meja",
        sentenceWithBlank = "桌子 (________)",
        targetHanzi = "桌子",
        targetPinyin = "zhuōzi",
        correctAnswer = "zhuozi",
        keyboardKeys = listOf("z", "h", "u", "o", "i", "a", "e", "b", "d", "g", "j"),
        audioToSpeak = "桌子"
    ),

    // 9. Soal 9: Susun Kalimat (Buku ada di atas meja.)
    Exercise(
        id = "u6_s4_p1_q9",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Buku ada di atas meja.",
        targetHanzi = "书 在 桌子 上。",
        targetPinyin = "Shū zài zhuōzi shang.",
        wordChips = listOf("书:shū", "在:zài", "桌子:zhuōzi", "上:shang", "椅子:yǐzi", "里:lǐ"),
        correctAnswer = "书,在,桌子,上",
        audioToSpeak = "书在桌子上。"
    ),

    // 10. Soal 10: Ketuk Pasangan yang Sesuai (Perabot Kamar)
    Exercise(
        id = "u6_s4_p1_m10_1",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u6_s4_p1_m10_1", "桌子", "zhuōzi", "meja"),
            MatchPairItem("u6_s4_p1_m10_2", "房间", "fángjiān", "kamar"),
            MatchPairItem("u6_s4_p1_m10_3", "在桌子上", "zài zhuōzi shang", "di atas meja"),
            MatchPairItem("u6_s4_p1_m10_4", "很大", "hěn dà", "sangat besar")
        )
    )
)

val bab6Stage4Part2Exercises = listOf(
    // 1. Soal 1: Pilihan Gambar (椅子 -> kursi)
    Exercise(
        id = "u6_s4_p2_q1",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "椅子",
        targetPinyin = "yǐzi",
        targetTranslation = "kursi",
        correctAnswer = "kursi",
        audioToSpeak = "椅子",
        pictureOptions = listOf(
            PictureOption("u6_s4_p2_opt1", "kursi", "🪑", R.drawable.ic_book, true),
            PictureOption("u6_s4_p2_opt2", "meja", "🪵", R.drawable.ic_story_timer, false),
            PictureOption("u6_s4_p2_opt3", "kamar", "🚪", R.drawable.ic_target, false),
            PictureOption("u6_s4_p2_opt4", "buku", "📖", R.drawable.ic_crown, false)
        )
    ),

    // 2. Soal 2: Susun Kalimat (Di dalam kamar ada sebuah kursi.)
    Exercise(
        id = "u6_s4_p2_q2",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Di dalam kamar ada satu kursi.",
        targetHanzi = "房间 里 有 一 把 椅子。",
        targetPinyin = "Fángjiān lǐ yǒu yì bǎ yǐzi.",
        wordChips = listOf("房间:fángjiān", "里:lǐ", "有:yǒu", "一:yì", "把:bǎ", "椅子:yǐzi", "桌子:zhuōzi"),
        correctAnswer = "房间,里,有,一,把,椅子",
        audioToSpeak = "房间里有一把椅子。"
    ),

    // 3. Soal 3: Ketuk Pasangan yang Sesuai (Posisi Perabot)
    Exercise(
        id = "u6_s4_p2_q3",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u6_s4_p2_m1", "椅子", "yǐzi", "kursi"),
            MatchPairItem("u6_s4_p2_m2", "桌子", "zhuōzi", "meja"),
            MatchPairItem("u6_s4_p2_m3", "坐在椅子上", "zuò zài yǐzi shang", "duduk di kursi"),
            MatchPairItem("u6_s4_p2_m4", "在房间里", "zài fángjiān lǐ", "di dalam kamar")
        )
    ),

    // 4. Soal 4: Ketik Pinyin (kursi -> yǐzi)
    Exercise(
        id = "u6_s4_p2_q4",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "kursi",
        sentenceWithBlank = "椅子 (________)",
        targetHanzi = "椅子",
        targetPinyin = "yǐzi",
        correctAnswer = "yizi",
        keyboardKeys = listOf("y", "i", "z", "a", "e", "o", "u", "b", "d", "g", "h"),
        audioToSpeak = "椅子"
    ),

    // 5. Soal 5: Mendengar Kalimat (Rule 10: illustrationRes = 0)
    Exercise(
        id = "u6_s4_p2_q5",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Apa yang Anda dengar?",
        targetTranslation = "Dia duduk di kursi.",
        targetHanzi = "他 坐 在 椅子 上。",
        targetPinyin = "Tā zuò zài yǐzi shang.",
        wordChips = listOf("他:tā", "坐:zuò", "在:zài", "椅子:yǐzi", "上:shang", "桌子:zhuōzi"),
        correctAnswer = "他,坐,在,椅子,上",
        illustrationRes = 0,
        audioToSpeak = "他坐在椅子上。"
    ),

    // 6. Soal 6: Pilihan Kalimat
    Exercise(
        id = "u6_s4_p2_q6",
        type = ExerciseType.SENTENCE_CHOICE,
        title = "Pilih terjemahan yang benar",
        targetHanzi = "房间 里 有 桌子 和 椅子。",
        targetPinyin = "Fángjiān lǐ yǒu zhuōzi hé yǐzi.",
        targetTranslation = "Di dalam kamar ada meja dan kursi.",
        correctAnswer = "Fángjiān lǐ yǒu zhuōzi hé yǐzi.\n房间 里 有 桌子 和 椅子。",
        options = listOf(
            "Fángjiān lǐ yǒu zhuōzi hé yǐzi.\n房间 里 有 桌子 和 椅子。",
            "Fángjiān lǐ yǒu shū hé yǐzi.\n房间 里 有 书 和 椅子。",
            "Jiā lǐ yǒu zhuōzi hé yǐzi.\n家 里 有 桌子 和 椅子。"
        ),
        audioToSpeak = "房间里有桌子和椅子。"
    ),

    // 7. Soal 7: Pilihan Gambar (坐在椅子上 -> duduk di kursi)
    Exercise(
        id = "u6_s4_p2_q7",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "坐",
        targetPinyin = "zuò",
        targetTranslation = "duduk",
        correctAnswer = "duduk",
        audioToSpeak = "坐",
        pictureOptions = listOf(
            PictureOption("u6_s4_p2_opt7_1", "duduk", "🪑", R.drawable.ic_book, true),
            PictureOption("u6_s4_p2_opt7_2", "berdiri", "🚶", R.drawable.ic_target, false),
            PictureOption("u6_s4_p2_opt7_3", "tidur", "🛌", R.drawable.ic_story_timer, false),
            PictureOption("u6_s4_p2_opt7_4", "makan", "🍜", R.drawable.ic_coin, false)
        )
    ),

    // 8. Soal 8: Ketik Pinyin (atas -> shàng)
    Exercise(
        id = "u6_s4_p2_q8",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "atas",
        sentenceWithBlank = "桌子上 (zhuōzi ________)",
        targetHanzi = "上",
        targetPinyin = "shang",
        correctAnswer = "shang",
        keyboardKeys = listOf("s", "h", "a", "n", "g", "e", "i", "o", "u", "b", "d"),
        audioToSpeak = "上"
    ),

    // 9. Soal 9: Susun Kalimat (Silakan duduk di sini.)
    Exercise(
        id = "u6_s4_p2_q9",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Silakan duduk di sini.",
        targetHanzi = "请 坐 在 这儿。",
        targetPinyin = "Qǐng zuò zài zhèr.",
        wordChips = listOf("请:qǐng", "坐:zuò", "在:zài", "这儿:zhèr", "那儿:nàr", "看:kàn"),
        correctAnswer = "请,坐,在,这儿",
        audioToSpeak = "请坐在这儿。"
    ),

    // 10. Soal 10: Ketuk Pasangan yang Sesuai (Rangkuman Perabot & Lokasi)
    Exercise(
        id = "u6_s4_p2_m10_1",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u6_s4_p2_m10_1", "椅子", "yǐzi", "kursi"),
            MatchPairItem("u6_s4_p2_m10_2", "桌子", "zhuōzi", "meja"),
            MatchPairItem("u6_s4_p2_m10_3", "坐在椅子上", "zuò zài yǐzi shang", "duduk di kursi"),
            MatchPairItem("u6_s4_p2_m10_4", "桌子上有书", "zhuōzi shang yǒu shū", "di meja ada buku")
        )
    )
)
