package com.example.chineselearning.data.repository

import com.example.chineselearning.R
import com.example.chineselearning.data.model.Exercise
import com.example.chineselearning.data.model.ExerciseType
import com.example.chineselearning.data.model.MatchPairItem
import com.example.chineselearning.data.model.PictureOption

val bab9Stage2Part1Exercises = listOf(
    // 1. Soal 1: Pilihan Gambar (前 -> depan)
    Exercise(
        id = "u9_s2_p1_q1",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "前",
        targetPinyin = "qián",
        targetTranslation = "depan",
        correctAnswer = "depan",
        audioToSpeak = "前",
        pictureOptions = listOf(
            PictureOption("u9_s2_p1_opt1", "depan", "⏩", R.drawable.ic_target, true),
            PictureOption("u9_s2_p1_opt2", "belakang", "⏪", R.drawable.ic_coin, false),
            PictureOption("u9_s2_p1_opt3", "atas", "⬆️", R.drawable.ic_book, false),
            PictureOption("u9_s2_p1_opt4", "bawah", "⬇️", R.drawable.ic_crown, false)
        )
    ),

    // 2. Soal 2: Susun Kalimat (Dia ada di depan saya.)
    Exercise(
        id = "u9_s2_p1_q2",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Dia ada di depan saya.",
        targetHanzi = "他 在 我 前面。",
        targetPinyin = "Tā zài wǒ qiánmiàn.",
        wordChips = listOf("他:tā", "在:zài", "我:wǒ", "前面:qiánmiàn", "后面:hòumiàn", "你:nǐ"),
        correctAnswer = "他,在,我,前面",
        audioToSpeak = "他在我前面。"
    ),

    // 3. Soal 3: Ketuk Pasangan yang Sesuai (Arah Depan)
    Exercise(
        id = "u9_s2_p1_q3",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u9_s2_p1_m1", "前", "qián", "depan"),
            MatchPairItem("u9_s2_p1_m2", "前面", "qiánmiàn", "di depan"),
            MatchPairItem("u9_s2_p1_m3", "在我前面", "zài wǒ qiánmiàn", "di depanku"),
            MatchPairItem("u9_s2_p1_m4", "向前", "xiàng qián", "ke depan")
        )
    ),

    // 4. Soal 4: Ketik Pinyin (depan -> qián)
    Exercise(
        id = "u9_s2_p1_q4",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "depan",
        sentenceWithBlank = "前 (________)",
        targetHanzi = "前",
        targetPinyin = "qián",
        correctAnswer = "qian",
        keyboardKeys = listOf("q", "i", "a", "n", "e", "o", "u", "b", "d", "g", "h"),
        audioToSpeak = "前"
    ),

    // 5. Soal 5: Mendengar Kalimat (Rule 10: illustrationRes = 0)
    Exercise(
        id = "u9_s2_p1_q5",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Apa yang Anda dengar?",
        targetTranslation = "Stasiun kereta tepat di depan.",
        targetHanzi = "火车站 在 前面。",
        targetPinyin = "Huǒchēzhàn zài qiánmiàn.",
        wordChips = listOf("火车站:huǒchēzhàn", "在:zài", "前面:qiánmiàn", "后面:hòumiàn", "学校:xuéxiào"),
        correctAnswer = "火车站,在,前面",
        illustrationRes = 0,
        audioToSpeak = "火车站 heritage di 前面。"
    ),

    // 6. Soal 6: Pilihan Kalimat
    Exercise(
        id = "u9_s2_p1_q6",
        type = ExerciseType.SENTENCE_CHOICE,
        title = "Pilih terjemahan yang benar",
        targetHanzi = "商店 就 在 前面。",
        targetPinyin = "Shāngdiàn jiù zài qiánmiàn.",
        targetTranslation = "Toko tepat ada di depan.",
        correctAnswer = "Shāngdiàn jiù zài qiánmiàn.\n商店 就 在 前面。",
        options = listOf(
            "Shāngdiàn jiù zài qiánmiàn.\n商店 就 在 前面。",
            "Shāngdiàn jiù zài hòumiàn.\n商店 就 在 后面。",
            "Fàndiàn jiù zài qiánmiàn.\n饭店 就 在 前面。"
        ),
        audioToSpeak = "商店就在前面。"
    ),

    // 7. Soal 7: Pilihan Gambar (前面 -> di depan)
    Exercise(
        id = "u9_s2_p1_q7",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "前面",
        targetPinyin = "qiánmiàn",
        targetTranslation = "di depan",
        correctAnswer = "di depan",
        audioToSpeak = "前面",
        pictureOptions = listOf(
            PictureOption("u9_s2_p1_opt7_1", "di depan", "⏩", R.drawable.ic_target, true),
            PictureOption("u9_s2_p1_opt7_2", "di belakang", "⏪", R.drawable.ic_coin, false),
            PictureOption("u9_s2_p1_opt7_3", "di dalam", "📦", R.drawable.ic_book, false),
            PictureOption("u9_s2_p1_opt7_4", "di luar", "🚪", R.drawable.ic_crown, false)
        )
    ),

    // 8. Soal 8: Ketik Pinyin (di depan -> qiánmiàn)
    Exercise(
        id = "u9_s2_p1_q8",
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

    // 9. Soal 9: Susun Kalimat (Guru ada di depan kelas.)
    Exercise(
        id = "u9_s2_p1_q9",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Guru ada di depan.",
        targetHanzi = "老师 在 前面。",
        targetPinyin = "Lǎoshī zài qiánmiàn.",
        wordChips = listOf("老师:lǎoshī", "在:zài", "前面:qiánmiàn", "后面:hòumiàn", "学生:xuéshēng"),
        correctAnswer = "老师,在,前面",
        audioToSpeak = "老师在前面。"
    ),

    // 10. Soal 10: Ketuk Pasangan yang Sesuai (Rangkuman Depan)
    Exercise(
        id = "u9_s2_p1_m10_1",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u9_s2_p1_m10_1", "前", "qián", "depan"),
            MatchPairItem("u9_s2_p1_m10_2", "前面", "qiánmiàn", "di depan"),
            MatchPairItem("u9_s2_p1_m10_3", "在前面", "zài qiánmiàn", "ada di depan"),
            MatchPairItem("u9_s2_p1_m10_4", "前面的人", "qiánmiàn de rén", "orang di depan")
        )
    )
)

val bab9Stage2Part2Exercises = listOf(
    // 1. Soal 1: Pilihan Gambar (后 -> belakang)
    Exercise(
        id = "u9_s2_p2_q1",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "后",
        targetPinyin = "hòu",
        targetTranslation = "belakang",
        correctAnswer = "belakang",
        audioToSpeak = "后",
        pictureOptions = listOf(
            PictureOption("u9_s2_p2_opt1", "belakang", "⏪", R.drawable.ic_coin, true),
            PictureOption("u9_s2_p2_opt2", "depan", "⏩", R.drawable.ic_target, false),
            PictureOption("u9_s2_p2_opt3", "atas", "⬆️", R.drawable.ic_crown, false),
            PictureOption("u9_s2_p2_opt4", "bawah", "⬇️", R.drawable.ic_book, false)
        )
    ),

    // 2. Soal 2: Susun Kalimat (Dia ada di belakang saya.)
    Exercise(
        id = "u9_s2_p2_q2",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Dia ada di belakang saya.",
        targetHanzi = "他 在 我 后面。",
        targetPinyin = "Tā zài wǒ hòumiàn.",
        wordChips = listOf("他:tā", "在:zài", "我:wǒ", "后面:hòumiàn", "前面:qiánmiàn", "你:nǐ"),
        correctAnswer = "他,在,我,后面",
        audioToSpeak = "他在我后面。"
    ),

    // 3. Soal 3: Ketuk Pasangan yang Sesuai (Arah Belakang)
    Exercise(
        id = "u9_s2_p2_q3",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u9_s2_p2_m1", "后", "hòu", "belakang"),
            MatchPairItem("u9_s2_p2_m2", "后面", "hòumiàn", "di belakang"),
            MatchPairItem("u9_s2_p2_m3", "在我后面", "zài wǒ hòumiàn", "di belakangku"),
            MatchPairItem("u9_s2_p2_m4", "向后", "xiàng hòu", "ke belakang")
        )
    ),

    // 4. Soal 4: Ketik Pinyin (belakang -> hòu)
    Exercise(
        id = "u9_s2_p2_q4",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "belakang",
        sentenceWithBlank = "后 (________)",
        targetHanzi = "后",
        targetPinyin = "hòu",
        correctAnswer = "hou",
        keyboardKeys = listOf("h", "o", "u", "a", "e", "i", "b", "d", "g", "j", "l"),
        audioToSpeak = "后"
    ),

    // 5. Soal 5: Mendengar Kalimat (Rule 10: illustrationRes = 0)
    Exercise(
        id = "u9_s2_p2_q5",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Apa yang Anda dengar?",
        targetTranslation = "Sekolah ada di belakang toko.",
        targetHanzi = "学校 在 商店 后面。",
        targetPinyin = "Xuéxiào zài shāngdiàn hòumiàn.",
        wordChips = listOf("学校:xuéxiào", "在:zài", "商店:shāngdiàn", "后面:hòumiàn", "前面:qiánmiàn"),
        correctAnswer = "学校,在,商店,后面",
        illustrationRes = 0,
        audioToSpeak = "学校在商店后面。"
    ),

    // 6. Soal 6: Pilihan Kalimat
    Exercise(
        id = "u9_s2_p2_q6",
        type = ExerciseType.SENTENCE_CHOICE,
        title = "Pilih terjemahan yang benar",
        targetHanzi = "他 在 学校 后面。",
        targetPinyin = "Tā zài xuéxiào hòumiàn.",
        targetTranslation = "Dia ada di belakang sekolah.",
        correctAnswer = "Tā zài xuéxiào hòumiàn.\n他 在 学校 后面。",
        options = listOf(
            "Tā zài xuéxiào hòumiàn.\n他 在 学校 后面。",
            "Tā zài xuéxiào qiánmiàn.\n他 在 学校 前面。",
            "Wǒ zài xuéxiào hòumiàn.\n我 在 学校 后面。"
        ),
        audioToSpeak = "他在学校后面。"
    ),

    // 7. Soal 7: Pilihan Gambar (后面 -> di belakang)
    Exercise(
        id = "u9_s2_p2_q7",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "后面",
        targetPinyin = "hòumiàn",
        targetTranslation = "di belakang",
        correctAnswer = "di belakang",
        audioToSpeak = "后面",
        pictureOptions = listOf(
            PictureOption("u9_s2_p2_opt7_1", "di belakang", "⏪", R.drawable.ic_coin, true),
            PictureOption("u9_s2_p2_opt7_2", "di depan", "⏩", R.drawable.ic_target, false),
            PictureOption("u9_s2_p2_opt7_3", "di samping", "↔️", R.drawable.ic_crown, false),
            PictureOption("u9_s2_p2_opt7_4", "di atas", "⬆️", R.drawable.ic_book, false)
        )
    ),

    // 8. Soal 8: Ketik Pinyin (di belakang -> hòumiàn)
    Exercise(
        id = "u9_s2_p2_q8",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "di belakang",
        sentenceWithBlank = "后面 (________)",
        targetHanzi = "后面",
        targetPinyin = "hòumiàn",
        correctAnswer = "houmian",
        keyboardKeys = listOf("h", "o", "u", "m", "i", "a", "n", "e", "b", "d", "g"),
        audioToSpeak = "后面"
    ),

    // 9. Soal 9: Susun Kalimat (Mobil ada di belakang rumah.)
    Exercise(
        id = "u9_s2_p2_q9",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Mobil ada di belakang rumah.",
        targetHanzi = "车 在 家 后面。",
        targetPinyin = "Chē zài jiā hòumiàn.",
        wordChips = listOf("车:chē", "在:zài", "家:jiā", "后面:hòumiàn", "前面:qiánmiàn", "学校:xuéxiào"),
        correctAnswer = "车,在,家,后面",
        audioToSpeak = "车在家后面。"
    ),

    // 10. Soal 10: Ketuk Pasangan yang Sesuai (Rangkuman Depan & Belakang)
    Exercise(
        id = "u9_s2_p2_m10_1",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u9_s2_p2_m10_1", "前", "qián", "depan"),
            MatchPairItem("u9_s2_p2_m10_2", "后", "hòu", "belakang"),
            MatchPairItem("u9_s2_p2_m10_3", "前面", "qiánmiàn", "di depan"),
            MatchPairItem("u9_s2_p2_m10_4", "后面", "hòumiàn", "di belakang")
        )
    )
)
