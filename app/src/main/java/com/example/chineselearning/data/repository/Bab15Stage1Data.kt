package com.example.chineselearning.data.repository

import com.example.chineselearning.R
import com.example.chineselearning.data.model.Exercise
import com.example.chineselearning.data.model.ExerciseType
import com.example.chineselearning.data.model.MatchPairItem
import com.example.chineselearning.data.model.PictureOption

val bab15Stage1Part1Exercises = listOf(
    // 1. Soal 1: Pilihan Gambar (手机 -> ponsel)
    Exercise(
        id = "u15_s1_p1_q1",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "手机",
        targetPinyin = "shǒujī",
        targetTranslation = "ponsel",
        correctAnswer = "ponsel",
        audioToSpeak = "手机",
        pictureOptions = listOf(
            PictureOption("u15_s1_p1_opt1", "ponsel", "📱", R.drawable.ic_coin, true),
            PictureOption("u15_s1_p1_opt2", "komputer", "💻", R.drawable.ic_target, false),
            PictureOption("u15_s1_p1_opt3", "buku", "📖", R.drawable.ic_book, false),
            PictureOption("u15_s1_p1_opt4", "televisi", "📺", R.drawable.ic_crown, false)
        )
    ),

    // 2. Soal 2: Susun Kalimat (Saya menelepon ibu.)
    Exercise(
        id = "u15_s1_p1_q2",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Saya menelepon ibu.",
        targetHanzi = "我 给 妈妈 打 电话。",
        targetPinyin = "Wǒ gěi māma dǎ diànhuà.",
        wordChips = listOf("我:wǒ", "给:gěi", "妈妈:māma", "打:dǎ", "电话:diànhuà", "爸爸:bàba"),
        correctAnswer = "我,给,妈妈,打,电话",
        audioToSpeak = "我给妈妈打电话。"
    ),

    // 3. Soal 3: Ketuk Pasangan yang Sesuai (Telepon & Ponsel)
    Exercise(
        id = "u15_s1_p1_q3",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u15_s1_p1_m1", "电话", "diànhuà", "telepon"),
            MatchPairItem("u15_s1_p1_m2", "打电话", "dǎ diànhuà", "menelepon"),
            MatchPairItem("u15_s1_p1_m3", "手机", "shǒujī", "ponsel / handphone"),
            MatchPairItem("u15_s1_p1_m4", "新手机", "xīn shǒujī", "ponsel baru")
        )
    ),

    // 4. Soal 4: Ketik Pinyin (telepon -> diànhuà)
    Exercise(
        id = "u15_s1_p1_q4",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "telepon",
        sentenceWithBlank = "电话 (________)",
        targetHanzi = "电话",
        targetPinyin = "diànhuà",
        correctAnswer = "dianhua",
        keyboardKeys = listOf("d", "i", "a", "n", "h", "u", "e", "o", "b", "g", "j"),
        audioToSpeak = "电话"
    ),

    // 5. Soal 5: Mendengar Kalimat (Rule 10: illustrationRes = 0)
    Exercise(
        id = "u15_s1_p1_q5",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Apa yang Anda dengar?",
        targetTranslation = "Dia sedang menelepon.",
        targetHanzi = "他 在 打 电话。",
        targetPinyin = "Tā zài dǎ diànhuà.",
        wordChips = listOf("他:tā", "在:zài", "打:dǎ", "电话:diànhuà", "看书:kànshū", "睡觉:shuìjiào"),
        correctAnswer = "他,在,打,电话",
        illustrationRes = 0,
        audioToSpeak = "他在打电话。"
    ),

    // 6. Soal 6: Pilihan Kalimat
    Exercise(
        id = "u15_s1_p1_q6",
        type = ExerciseType.SENTENCE_CHOICE,
        title = "Pilih terjemahan yang benar",
        targetHanzi = "这 是 谁 的 手机？",
        targetPinyin = "Zhè shì shéi de shǒujī?",
        targetTranslation = "Ini ponsel milik siapa?",
        correctAnswer = "Zhè shì shéi de shǒujī?\n这 是 谁 的 手机？",
        options = listOf(
            "Zhè shì shéi de shǒujī?\n这 是 谁 的 手机？",
            "Nà shì shéi de shǒujī?\n那 是 谁 的 手机？",
            "Zhè shì shéi de diànnǎo?\n这 是 谁 的 电脑？"
        ),
        audioToSpeak = "这是谁的手机？"
    ),

    // 7. Soal 7: Pilihan Gambar (打电话 -> menelepon)
    Exercise(
        id = "u15_s1_p1_q7",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "打电话",
        targetPinyin = "dǎ diànhuà",
        targetTranslation = "menelepon",
        correctAnswer = "menelepon",
        audioToSpeak = "打电话",
        pictureOptions = listOf(
            PictureOption("u15_s1_p1_opt7_1", "menelepon", "📞", R.drawable.ic_coin, true),
            PictureOption("u15_s1_p1_opt7_2", "makan", "🍜", R.drawable.ic_target, false),
            PictureOption("u15_s1_p1_opt7_3", "tidur", "🛌", R.drawable.ic_book, false),
            PictureOption("u15_s1_p1_opt7_4", "membaca", "📖", R.drawable.ic_crown, false)
        )
    ),

    // 8. Soal 8: Ketik Pinyin (ponsel -> shǒujī)
    Exercise(
        id = "u15_s1_p1_q8",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "ponsel",
        sentenceWithBlank = "手机 (________)",
        targetHanzi = "手机",
        targetPinyin = "shǒujī",
        correctAnswer = "shouji",
        keyboardKeys = listOf("s", "h", "o", "u", "j", "i", "a", "e", "b", "d", "g"),
        audioToSpeak = "手机"
    ),

    // 9. Soal 9: Susun Kalimat (Ponsel ada di atas meja.)
    Exercise(
        id = "u15_s1_p1_q9",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Ponsel ada di atas meja.",
        targetHanzi = "手机 在 桌子 上。",
        targetPinyin = "Shǒujī zài zhuōzi shang.",
        wordChips = listOf("手机:shǒujī", "在:zài", "桌子:zhuōzi", "上:shang", "电脑:diànnǎo"),
        correctAnswer = "手机,在,桌子,上",
        audioToSpeak = "手机在桌子上。"
    ),

    // 10. Soal 10: Ketuk Pasangan yang Sesuai (Rangkuman Telepon)
    Exercise(
        id = "u15_s1_p1_m10_1",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u15_s1_p1_m10_1", "电话", "diànhuà", "telepon"),
            MatchPairItem("u15_s1_p1_m10_2", "手机", "shǒujī", "ponsel"),
            MatchPairItem("u15_s1_p1_m10_3", "打电话", "dǎ diànhuà", "menelepon"),
            MatchPairItem("u15_s1_p1_m10_4", "新手机", "xīn shǒujī", "hp baru")
        )
    )
)

val bab15Stage1Part2Exercises = listOf(
    // 1. Soal 1: Pilihan Gambar (喂 -> halo telepon)
    Exercise(
        id = "u15_s1_p2_q1",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "喂",
        targetPinyin = "wèi",
        targetTranslation = "halo (telepon)",
        correctAnswer = "halo (telepon)",
        audioToSpeak = "喂",
        pictureOptions = listOf(
            PictureOption("u15_s1_p2_opt1", "halo (telepon)", "📞", R.drawable.ic_coin, true),
            PictureOption("u15_s1_p2_opt2", "selamat tinggal", "👋", R.drawable.ic_target, false),
            PictureOption("u15_s1_p2_opt3", "terima kasih", "🙏", R.drawable.ic_book, false),
            PictureOption("u15_s1_p2_opt4", "maaf", "🙇", R.drawable.ic_crown, false)
        )
    ),

    // 2. Soal 2: Susun Kalimat (Halo, apakah Tuan Wang ada?)
    Exercise(
        id = "u15_s1_p2_q2",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Halo, Tuan Wang ada?",
        targetHanzi = "喂， 王 先生 在 吗？",
        targetPinyin = "Wèi, Wáng xiānsheng zài ma?",
        wordChips = listOf("喂，:wèi,", "王:Wáng", "先生:xiānsheng", "在:zài", "吗？:ma?", "李:Lǐ"),
        correctAnswer = "喂，,王,先生,在,吗？",
        audioToSpeak = "喂，王先生在吗？"
    ),

    // 3. Soal 3: Ketuk Pasangan yang Sesuai (Bicara & Halo)
    Exercise(
        id = "u15_s1_p2_m3",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u15_s1_p2_m1", "喂", "wèi", "halo (di telepon)"),
            MatchPairItem("u15_s1_p2_m2", "说", "shuō", "berkata / bicara"),
            MatchPairItem("u15_s1_p2_m3", "说话", "shuōhuà", "berbicara / mengobrol"),
            MatchPairItem("u15_s1_p2_m4", "说什么", "shuō shénme", "bicara apa")
        )
    ),

    // 4. Soal 4: Ketik Pinyin (halo telepon -> wèi)
    Exercise(
        id = "u15_s1_p2_q4",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "halo (telepon)",
        sentenceWithBlank = "喂 (________)",
        targetHanzi = "喂",
        targetPinyin = "wèi",
        correctAnswer = "wei",
        keyboardKeys = listOf("w", "e", "i", "a", "o", "u", "b", "d", "g", "h", "j"),
        audioToSpeak = "喂"
    ),

    // 5. Soal 5: Mendengar Kalimat (Rule 10: illustrationRes = 0)
    Exercise(
        id = "u15_s1_p2_q5",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Apa yang Anda dengar?",
        targetTranslation = "Siapa yang sedang berbicara?",
        targetHanzi = "谁 在 说话？",
        targetPinyin = "Shéi zài shuōhuà?",
        wordChips = listOf("谁:shéi", "在:zài", "说话？:shuōhuà?", "看书:kànshū", "他:tā"),
        correctAnswer = "谁,在,说话？",
        illustrationRes = 0,
        audioToSpeak = "谁在说话？"
    ),

    // 6. Soal 6: Pilihan Kalimat
    Exercise(
        id = "u15_s1_p2_q6",
        type = ExerciseType.SENTENCE_CHOICE,
        title = "Pilih terjemahan yang benar",
        targetHanzi = "请 不要 说话。",
        targetPinyin = "Qǐng búyào shuōhuà.",
        targetTranslation = "Tolong jangan berbicara.",
        correctAnswer = "Qǐng búyào shuōhuà.\n请 不要 说话。",
        options = listOf(
            "Qǐng búyào shuōhuà.\n请 不要 说话。",
            "Qǐng búyào kànshū.\n请 不要 看书。",
            "Qǐng búyào shuìjiào.\n请 不要 睡觉。"
        ),
        audioToSpeak = "请不要说话。"
    ),

    // 7. Soal 7: Pilihan Gambar (说话 -> berbicara)
    Exercise(
        id = "u15_s1_p2_q7",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "说话",
        targetPinyin = "shuōhuà",
        targetTranslation = "berbicara",
        correctAnswer = "berbicara",
        audioToSpeak = "说话",
        pictureOptions = listOf(
            PictureOption("u15_s1_p2_opt7_1", "berbicara", "🗣️", R.drawable.ic_coin, true),
            PictureOption("u15_s1_p2_opt7_2", "tidur", "🛌", R.drawable.ic_target, false),
            PictureOption("u15_s1_p2_opt7_3", "makan", "🍚", R.drawable.ic_book, false),
            PictureOption("u15_s1_p2_opt7_4", "lari", "🏃", R.drawable.ic_crown, false)
        )
    ),

    // 8. Soal 8: Ketik Pinyin (berbicara -> shuōhuà)
    Exercise(
        id = "u15_s1_p2_q8",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "berbicara",
        sentenceWithBlank = "说话 (________)",
        targetHanzi = "说话",
        targetPinyin = "shuōhuà",
        correctAnswer = "shuohua",
        keyboardKeys = listOf("s", "h", "u", "o", "a", "e", "i", "b", "d", "g", "j"),
        audioToSpeak = "说话"
    ),

    // 9. Soal 9: Susun Kalimat (Kamu sedang berbicara apa?)
    Exercise(
        id = "u15_s1_p2_q9",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Kamu bicara apa?",
        targetHanzi = "你 说 什么？",
        targetPinyin = "Nǐ shuō shénme?",
        wordChips = listOf("你:nǐ", "说:shuō", "什么？:shénme?", "想:xiǎng", "听:tīng"),
        correctAnswer = "你,说,什么？",
        audioToSpeak = "你说什么？"
    ),

    // 10. Soal 10: Ketuk Pasangan yang Sesuai (Rangkuman Bicara)
    Exercise(
        id = "u15_s1_p2_m10_1",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u15_s1_p2_m10_1", "喂", "wèi", "halo"),
            MatchPairItem("u15_s1_p2_m10_2", "说话", "shuōhuà", "berbicara"),
            MatchPairItem("u15_s1_p2_m10_3", "说汉语", "shuō Hànyǔ", "bicara Mandarin"),
            MatchPairItem("u15_s1_p2_m10_4", "打电话", "dǎ diànhuà", "menelepon")
        )
    )
)
