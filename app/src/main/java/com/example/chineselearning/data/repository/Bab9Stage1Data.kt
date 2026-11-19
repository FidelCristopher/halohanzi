package com.example.chineselearning.data.repository

import com.example.chineselearning.R
import com.example.chineselearning.data.model.Exercise
import com.example.chineselearning.data.model.ExerciseType
import com.example.chineselearning.data.model.MatchPairItem
import com.example.chineselearning.data.model.PictureOption

val bab9Stage1Part1Exercises = listOf(
    // 1. Soal 1: Pilihan Gambar (上 -> atas)
    Exercise(
        id = "u9_s1_p1_q1",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "上",
        targetPinyin = "shàng",
        targetTranslation = "atas",
        correctAnswer = "atas",
        audioToSpeak = "上",
        pictureOptions = listOf(
            PictureOption("u9_s1_p1_opt1", "atas", "⬆️", R.drawable.ic_target, true),
            PictureOption("u9_s1_p1_opt2", "bawah", "⬇️", R.drawable.ic_coin, false),
            PictureOption("u9_s1_p1_opt3", "dalam", "📦", R.drawable.ic_book, false),
            PictureOption("u9_s1_p1_opt4", "luar", "🚪", R.drawable.ic_crown, false)
        )
    ),

    // 2. Soal 2: Susun Kalimat (Buku ada di atas meja.)
    Exercise(
        id = "u9_s1_p1_q2",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Buku ada di atas meja.",
        targetHanzi = "书 在 桌子 上。",
        targetPinyin = "Shū zài zhuōzi shang.",
        wordChips = listOf("书:shū", "在:zài", "桌子:zhuōzi", "上:shang", "下:xià", "椅子:yǐzi"),
        correctAnswer = "书,在,桌子,上",
        audioToSpeak = "书在桌子上。"
    ),

    // 3. Soal 3: Ketuk Pasangan yang Sesuai (Atas & Bawah)
    Exercise(
        id = "u9_s1_p1_q3",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u9_s1_p1_m1", "上", "shàng", "atas"),
            MatchPairItem("u9_s1_p1_m2", "下", "xià", "bawah"),
            MatchPairItem("u9_s1_p1_m3", "桌子上", "zhuōzi shang", "di atas meja"),
            MatchPairItem("u9_s1_p1_m4", "椅子下", "yǐzi xia", "di bawah kursi")
        )
    ),

    // 4. Soal 4: Ketik Pinyin (atas -> shàng)
    Exercise(
        id = "u9_s1_p1_q4",
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
        id = "u9_s1_p1_q5",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Apa yang Anda dengar?",
        targetTranslation = "Kucing di bawah kursi.",
        targetHanzi = "猫 在 椅子 下。",
        targetPinyin = "Māo zài yǐzi xia.",
        wordChips = listOf("猫:māo", "在:zài", "椅子:yǐzi", "下:xia", "上:shang", "狗:gǒu"),
        correctAnswer = "猫,在,椅子,下",
        illustrationRes = 0,
        audioToSpeak = "猫在椅子下。"
    ),

    // 6. Soal 6: Pilihan Kalimat
    Exercise(
        id = "u9_s1_p1_q6",
        type = ExerciseType.SENTENCE_CHOICE,
        title = "Pilih terjemahan yang benar",
        targetHanzi = "杯子 在 桌子 上。",
        targetPinyin = "Bēizi zài zhuōzi shang.",
        targetTranslation = "Gelas ada di atas meja.",
        correctAnswer = "Bēizi zài zhuōzi shang.\n杯子 在 桌子 上。",
        options = listOf(
            "Bēizi zài zhuōzi shang.\n杯子 在 桌子 上。",
            "Bēizi zài yǐzi xia.\n杯子 在 椅子 下。",
            "Shū zài zhuōzi shang.\n书 在 桌子 上。"
        ),
        audioToSpeak = "杯子在桌子上。"
    ),

    // 7. Soal 7: Pilihan Gambar (下 -> bawah)
    Exercise(
        id = "u9_s1_p1_q7",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "下",
        targetPinyin = "xià",
        targetTranslation = "bawah",
        correctAnswer = "bawah",
        audioToSpeak = "下",
        pictureOptions = listOf(
            PictureOption("u9_s1_p1_opt7_1", "bawah", "⬇️", R.drawable.ic_coin, true),
            PictureOption("u9_s1_p1_opt7_2", "atas", "⬆️", R.drawable.ic_target, false),
            PictureOption("u9_s1_p1_opt7_3", "kiri", "⬅️", R.drawable.ic_book, false),
            PictureOption("u9_s1_p1_opt7_4", "kanan", "➡️", R.drawable.ic_crown, false)
        )
    ),

    // 8. Soal 8: Ketik Pinyin (bawah -> xià)
    Exercise(
        id = "u9_s1_p1_q8",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "bawah",
        sentenceWithBlank = "下 (________)",
        targetHanzi = "下",
        targetPinyin = "xià",
        correctAnswer = "xia",
        keyboardKeys = listOf("x", "i", "a", "e", "o", "u", "b", "d", "g", "h", "j"),
        audioToSpeak = "下"
    ),

    // 9. Soal 9: Susun Kalimat (Gelas ada di bawah meja.)
    Exercise(
        id = "u9_s1_p1_q9",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Gelas ada di bawah meja.",
        targetHanzi = "杯子 在 桌子 下。",
        targetPinyin = "Bēizi zài zhuōzi xia.",
        wordChips = listOf("杯子:bēizi", "在:zài", "桌子:zhuōzi", "下:xia", "上:shang", "书:shū"),
        correctAnswer = "杯子,在,桌子,下",
        audioToSpeak = "杯子在桌子下。"
    ),

    // 10. Soal 10: Ketuk Pasangan yang Sesuai (Rangkuman Posisi Atas Bawah)
    Exercise(
        id = "u9_s1_p1_m10_1",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u9_s1_p1_m10_1", "上", "shàng", "atas"),
            MatchPairItem("u9_s1_p1_m10_2", "下", "xià", "bawah"),
            MatchPairItem("u9_s1_p1_m10_3", "在桌子上", "zài zhuōzi shang", "di atas meja"),
            MatchPairItem("u9_s1_p1_m10_4", "在椅子下", "zài yǐzi xia", "di bawah kursi")
        )
    )
)

val bab9Stage1Part2Exercises = listOf(
    // 1. Soal 1: Pilihan Gambar (里 -> dalam)
    Exercise(
        id = "u9_s1_p2_q1",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "里",
        targetPinyin = "lǐ",
        targetTranslation = "dalam",
        correctAnswer = "dalam",
        audioToSpeak = "里",
        pictureOptions = listOf(
            PictureOption("u9_s1_p2_opt1", "dalam", "📦", R.drawable.ic_book, true),
            PictureOption("u9_s1_p2_opt2", "luar", "🚪", R.drawable.ic_target, false),
            PictureOption("u9_s1_p2_opt3", "atas", "⬆️", R.drawable.ic_coin, false),
            PictureOption("u9_s1_p2_opt4", "bawah", "⬇️", R.drawable.ic_crown, false)
        )
    ),

    // 2. Soal 2: Susun Kalimat (Di dalam kamar ada orang.)
    Exercise(
        id = "u9_s1_p2_q2",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Di dalam kamar ada orang.",
        targetHanzi = "房间 里 有 人。",
        targetPinyin = "Fángjiān lǐ yǒu rén.",
        wordChips = listOf("房间:fángjiān", "里:lǐ", "有:yǒu", "人:rén", "外边:wàibian", "桌子:zhuōzi"),
        correctAnswer = "房间,里,有,人",
        audioToSpeak = "房间里有人。"
    ),

    // 3. Soal 3: Ketuk Pasangan yang Sesuai (Dalam & Luar)
    Exercise(
        id = "u9_s1_p2_q3",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u9_s1_p2_m1", "里", "lǐ", "dalam"),
            MatchPairItem("u9_s1_p2_m2", "外", "wài", "luar"),
            MatchPairItem("u9_s1_p2_m3", "外边", "wàibian", "di luar"),
            MatchPairItem("u9_s1_p2_m4", "家里", "jiālǐ", "di dalam rumah")
        )
    ),

    // 4. Soal 4: Ketik Pinyin (di luar -> wàibian)
    Exercise(
        id = "u9_s1_p2_q4",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "di luar",
        sentenceWithBlank = "外边 (________)",
        targetHanzi = "外边",
        targetPinyin = "wàibian",
        correctAnswer = "waibian",
        keyboardKeys = listOf("w", "a", "i", "b", "n", "e", "o", "u", "d", "g", "h"),
        audioToSpeak = "外边"
    ),

    // 5. Soal 5: Mendengar Kalimat (Rule 10: illustrationRes = 0)
    Exercise(
        id = "u9_s1_p2_q5",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Apa yang Anda dengar?",
        targetTranslation = "Dia berada di luar.",
        targetHanzi = "他 在 外边。",
        targetPinyin = "Tā zài wàibian.",
        wordChips = listOf("他:tā", "在:zài", "外边:wàibian", "家里:jiālǐ", "我:wǒ"),
        correctAnswer = "他,在,外边",
        illustrationRes = 0,
        audioToSpeak = "他在外边。"
    ),

    // 6. Soal 6: Pilihan Kalimat
    Exercise(
        id = "u9_s1_p2_q6",
        type = ExerciseType.SENTENCE_CHOICE,
        title = "Pilih terjemahan yang benar",
        targetHanzi = "谁 在 房间 里？",
        targetPinyin = "Shéi zài fángjiān lǐ?",
        targetTranslation = "Siapa di dalam kamar?",
        correctAnswer = "Shéi zài fángjiān lǐ?\n谁 在 房间 里？",
        options = listOf(
            "Shéi zài fángjiān lǐ?\n谁 在 房间 里？",
            "Shéi zài wàibian?\n谁 在 外边？",
            "Tā zài fángjiān lǐ?\n他 在 房间 里？"
        ),
        audioToSpeak = "谁在房间里？"
    ),

    // 7. Soal 7: Pilihan Gambar (外边 -> luar)
    Exercise(
        id = "u9_s1_p2_q7",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "外边",
        targetPinyin = "wàibian",
        targetTranslation = "di luar",
        correctAnswer = "di luar",
        audioToSpeak = "外边",
        pictureOptions = listOf(
            PictureOption("u9_s1_p2_opt7_1", "di luar", "🚪", R.drawable.ic_target, true),
            PictureOption("u9_s1_p2_opt7_2", "di dalam", "📦", R.drawable.ic_book, false),
            PictureOption("u9_s1_p2_opt7_3", "di atas", "⬆️", R.drawable.ic_coin, false),
            PictureOption("u9_s1_p2_opt7_4", "di bawah", "⬇️", R.drawable.ic_crown, false)
        )
    ),

    // 8. Soal 8: Ketik Pinyin (dalam -> lǐ)
    Exercise(
        id = "u9_s1_p2_q8",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "dalam",
        sentenceWithBlank = "里 (________)",
        targetHanzi = "里",
        targetPinyin = "lǐ",
        correctAnswer = "li",
        keyboardKeys = listOf("l", "i", "a", "e", "o", "u", "b", "d", "g", "h", "j"),
        audioToSpeak = "里"
    ),

    // 9. Soal 9: Susun Kalimat (Anak-anak di luar.)
    Exercise(
        id = "u9_s1_p2_q9",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Anak berada di luar.",
        targetHanzi = "孩子 在 外边。",
        targetPinyin = "Háizi zài wàibian.",
        wordChips = listOf("孩子:háizi", "在:zài", "外边:wàibian", "家里:jiālǐ", "老师:lǎoshī"),
        correctAnswer = "孩子,在,外边",
        audioToSpeak = "孩子在外边。"
    ),

    // 10. Soal 10: Ketuk Pasangan yang Sesuai (Rangkuman Dalam & Luar)
    Exercise(
        id = "u9_s1_p2_m10_1",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u9_s1_p2_m10_1", "里", "lǐ", "dalam"),
            MatchPairItem("u9_s1_p2_m10_2", "外边", "wàibian", "luar"),
            MatchPairItem("u9_s1_p2_m10_3", "在家里", "zài jiālǐ", "di dalam rumah"),
            MatchPairItem("u9_s1_p2_m10_4", "在房间里", "zài fángjiān lǐ", "di dalam kamar")
        )
    )
)
