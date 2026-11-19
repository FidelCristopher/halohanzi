package com.example.chineselearning.data.repository

import com.example.chineselearning.R
import com.example.chineselearning.data.model.Exercise
import com.example.chineselearning.data.model.ExerciseType
import com.example.chineselearning.data.model.MatchPairItem
import com.example.chineselearning.data.model.PictureOption

val bab12Stage4Part1Exercises = listOf(
    // 1. Soal 1: Pilihan Gambar (给 -> memberi / kepada)
    Exercise(
        id = "u12_s4_p1_q1",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "给",
        targetPinyin = "gěi",
        targetTranslation = "memberi / kepada",
        correctAnswer = "memberi / kepada",
        audioToSpeak = "给",
        pictureOptions = listOf(
            PictureOption("u12_s4_p1_opt1", "memberi / kepada", "🎁", R.drawable.ic_coin, true),
            PictureOption("u12_s4_p1_opt2", "mencari", "🔍", R.drawable.ic_target, false),
            PictureOption("u12_s4_p1_opt3", "membeli", "🛒", R.drawable.ic_book, false),
            PictureOption("u12_s4_p1_opt4", "menjual", "🏷️", R.drawable.ic_crown, false)
        )
    ),

    // 2. Soal 2: Susun Kalimat (Tolong beri saya sebuah cangkir.)
    Exercise(
        id = "u12_s4_p1_q2",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Beri saya sebuah cangkir.",
        targetHanzi = "请 给 我 一个 杯子。",
        targetPinyin = "Qǐng gěi wǒ yí gè bēizi.",
        wordChips = listOf("请:qǐng", "给:gěi", "我:wǒ", "一个:yí gè", "杯子:bēizi", "书:shū"),
        correctAnswer = "请,给,我,一个,杯子",
        audioToSpeak = "请给我一个杯子。"
    ),

    // 3. Soal 3: Ketuk Pasangan yang Sesuai (Memberi & Kepada)
    Exercise(
        id = "u12_s4_p1_q3",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u12_s4_p1_m1", "给", "gěi", "memberi / untuk"),
            MatchPairItem("u12_s4_p1_m2", "给我", "gěi wǒ", "beri saya"),
            MatchPairItem("u12_s4_p1_m3", "打电话", "dǎ diànhuà", "menelepon"),
            MatchPairItem("u12_s4_p1_m4", "给他", "gěi tā", "beri dia")
        )
    ),

    // 4. Soal 4: Ketik Pinyin (memberi/kepada -> gěi)
    Exercise(
        id = "u12_s4_p1_q4",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "memberi / kepada",
        sentenceWithBlank = "给 (________)",
        targetHanzi = "给",
        targetPinyin = "gěi",
        correctAnswer = "gei",
        keyboardKeys = listOf("g", "e", "i", "a", "o", "u", "b", "d", "h", "j", "l"),
        audioToSpeak = "给"
    ),

    // 5. Soal 5: Mendengar Kalimat (Rule 10: illustrationRes = 0)
    Exercise(
        id = "u12_s4_p1_q5",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Apa yang Anda dengar?",
        targetTranslation = "Saya menelepon Tuan Wang.",
        targetHanzi = "我 给 王 先生 打 电话。",
        targetPinyin = "Wǒ gěi Wáng xiānsheng dǎ diànhuà.",
        wordChips = listOf("我:wǒ", "给:gěi", "王:Wáng", "先生:xiānsheng", "打:dǎ", "电话:diànhuà"),
        correctAnswer = "我,给,王,先生,打,电话",
        illustrationRes = 0,
        audioToSpeak = "我给王先生打电话。"
    ),

    // 6. Soal 6: Pilihan Kalimat
    Exercise(
        id = "u12_s4_p1_q6",
        type = ExerciseType.SENTENCE_CHOICE,
        title = "Pilih terjemahan yang benar",
        targetHanzi = "他 给 了 我 一 本 书。",
        targetPinyin = "Tā gěi le wǒ yì běn shū.",
        targetTranslation = "Dia memberi saya sebuah buku.",
        correctAnswer = "Tā gěi le wǒ yì běn shū.\n他 给 了 我 一 本 书。",
        options = listOf(
            "Tā gěi le wǒ yì běn shū.\n他 给 了 我 一 本 书。",
            "Wǒ gěi le tā yì běn shū.\n我 给 了 他 一 本 书。",
            "Tā mǎi le wǒ yì běn shū.\n他 买 了 我 一 本 书。"
        ),
        audioToSpeak = "他给了我一本书。"
    ),

    // 7. Soal 7: Pilihan Gambar (给你 -> memberikan untukmu)
    Exercise(
        id = "u12_s4_p1_q7",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "给",
        targetPinyin = "gěi",
        targetTranslation = "memberi",
        correctAnswer = "memberi",
        audioToSpeak = "给",
        pictureOptions = listOf(
            PictureOption("u12_s4_p1_opt7_1", "memberi", "🎁", R.drawable.ic_coin, true),
            PictureOption("u12_s4_p1_opt7_2", "menelepon", "📞", R.drawable.ic_target, false),
            PictureOption("u12_s4_p1_opt7_3", "menulis", "✍️", R.drawable.ic_book, false),
            PictureOption("u12_s4_p1_opt7_4", "tidur", "🛌", R.drawable.ic_crown, false)
        )
    ),

    // 8. Soal 8: Ketik Pinyin (untukmu -> gěinǐ)
    Exercise(
        id = "u12_s4_p1_q8",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "untukmu / memberi kamu",
        sentenceWithBlank = "给你 (________)",
        targetHanzi = "给你",
        targetPinyin = "gěinǐ",
        correctAnswer = "geini",
        keyboardKeys = listOf("g", "e", "i", "n", "a", "o", "u", "b", "d", "h", "j"),
        audioToSpeak = "给你"
    ),

    // 9. Soal 9: Susun Kalimat (Ini kuberikan untukmu.)
    Exercise(
        id = "u12_s4_p1_q9",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Ini saya berikan untukmu.",
        targetHanzi = "这个 给 你。",
        targetPinyin = "Zhège gěi nǐ.",
        wordChips = listOf("这个:zhège", "给:gěi", "你:nǐ", "我:wǒ", "那个:nàge"),
        correctAnswer = "这个,给,你",
        audioToSpeak = "这个给你。"
    ),

    // 10. Soal 10: Ketuk Pasangan yang Sesuai (Rangkuman Memberi)
    Exercise(
        id = "u12_s4_p1_m10_1",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u12_s4_p1_m10_1", "给你", "gěi nǐ", "untukmu"),
            MatchPairItem("u12_s4_p1_m10_2", "给我", "gěi wǒ", "beri saya"),
            MatchPairItem("u12_s4_p1_m10_3", "给老师", "gěi lǎoshī", "kepada guru"),
            MatchPairItem("u12_s4_p1_m10_4", "打电话", "dǎ diànhuà", "menelepon")
        )
    )
)

val bab12Stage4Part2Exercises = listOf(
    // 1. Soal 1: Pilihan Gambar (没关系 -> tidak apa-apa)
    Exercise(
        id = "u12_s4_p2_q1",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "没关系",
        targetPinyin = "méi guānxi",
        targetTranslation = "tidak apa-apa",
        correctAnswer = "tidak apa-apa",
        audioToSpeak = "没关系",
        pictureOptions = listOf(
            PictureOption("u12_s4_p2_opt1", "tidak apa-apa", "🤝", R.drawable.ic_handshake, true),
            PictureOption("u12_s4_p2_opt2", "terima kasih", "🙏", R.drawable.ic_coin, false),
            PictureOption("u12_s4_p2_opt3", "maaf", "🙇", R.drawable.ic_target, false),
            PictureOption("u12_s4_p2_opt4", "sampai jumpa", "👋", R.drawable.ic_crown, false)
        )
    ),

    // 2. Soal 2: Susun Kalimat (Maaf! - Tidak apa-apa.)
    Exercise(
        id = "u12_s4_p2_q2",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Tidak apa-apa.",
        targetHanzi = "没关系。",
        targetPinyin = "Méi guānxi.",
        wordChips = listOf("没关系:méi guānxi", "对不起:duìbuqǐ", "谢谢:xièxie", "不客气:bú kèqi"),
        correctAnswer = "没关系",
        audioToSpeak = "没关系。"
    ),

    // 3. Soal 3: Ketuk Pasangan yang Sesuai (Etiket Sopan Santun)
    Exercise(
        id = "u12_s4_p2_m3",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u12_s4_p2_m1", "对不起", "duìbuqǐ", "maaf"),
            MatchPairItem("u12_s4_p2_m2", "没关系", "méi guānxi", "tidak apa-apa"),
            MatchPairItem("u12_s4_p2_m3", "谢谢", "xièxie", "terima kasih"),
            MatchPairItem("u12_s4_p2_m4", "没事", "méishì", "tidak masalah")
        )
    ),

    // 4. Soal 4: Ketik Pinyin (tidak apa-apa -> méiguānxi)
    Exercise(
        id = "u12_s4_p2_q4",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "tidak apa-apa",
        sentenceWithBlank = "没关系 (________)",
        targetHanzi = "没关系",
        targetPinyin = "méiguānxi",
        correctAnswer = "meiguanxi",
        keyboardKeys = listOf("m", "e", "i", "g", "u", "a", "n", "x", "o", "b", "d"),
        audioToSpeak = "没关系"
    ),

    // 5. Soal 5: Mendengar Kalimat (Rule 10: illustrationRes = 0)
    Exercise(
        id = "u12_s4_p2_q5",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Apa yang Anda dengar?",
        targetTranslation = "Tidak ada masalah, terima kasih.",
        targetHanzi = "没事， 谢谢 你。",
        targetPinyin = "Méishì, xièxie nǐ.",
        wordChips = listOf("没事，:méishì,", "谢谢:xièxie", "你。:nǐ.", "对不起:duìbuqǐ", "没关系:méi guānxi"),
        correctAnswer = "没事，,谢谢,你。",
        illustrationRes = 0,
        audioToSpeak = "没事，谢谢你。"
    ),

    // 6. Soal 6: Pilihan Kalimat
    Exercise(
        id = "u12_s4_p2_q6",
        type = ExerciseType.SENTENCE_CHOICE,
        title = "Pilih terjemahan yang benar",
        targetHanzi = "对不起！ 没关系。",
        targetPinyin = "Duìbuqǐ! Méi guānxi.",
        targetTranslation = "Maaf! Tidak apa-apa.",
        correctAnswer = "Duìbuqǐ! Méi guānxi.\n对不起！ 没关系。",
        options = listOf(
            "Duìbuqǐ! Méi guānxi.\n对不起！ 没关系。",
            "Xièxie! Bú kèqi.\n谢谢！ 不 客气。",
            "Nǐhǎo! Zàijiàn.\n你好！ 再见。"
        ),
        audioToSpeak = "对不起！没关系。"
    ),

    // 7. Soal 7: Pilihan Gambar (没事 -> tidak masalah)
    Exercise(
        id = "u12_s4_p2_q7",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "没事",
        targetPinyin = "méishì",
        targetTranslation = "tidak masalah",
        correctAnswer = "tidak masalah",
        audioToSpeak = "没事",
        pictureOptions = listOf(
            PictureOption("u12_s4_p2_opt7_1", "tidak masalah", "👌", R.drawable.ic_coin, true),
            PictureOption("u12_s4_p2_opt7_2", "ada urusan", "📋", R.drawable.ic_target, false),
            PictureOption("u12_s4_p2_opt7_3", "maaf", "🙇", R.drawable.ic_book, false),
            PictureOption("u12_s4_p2_opt7_4", "terima kasih", "🙏", R.drawable.ic_crown, false)
        )
    ),

    // 8. Soal 8: Ketik Pinyin (tidak masalah -> méishì)
    Exercise(
        id = "u12_s4_p2_q8",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "tidak masalah",
        sentenceWithBlank = "没事 (________)",
        targetHanzi = "没事",
        targetPinyin = "méishì",
        correctAnswer = "meishi",
        keyboardKeys = listOf("m", "e", "i", "s", "h", "a", "o", "u", "b", "d", "g"),
        audioToSpeak = "没事"
    ),

    // 9. Soal 9: Susun Kalimat (Tidak masalah, jangan khawatir.)
    Exercise(
        id = "u12_s4_p2_q9",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Tidak apa-apa, terima kasih.",
        targetHanzi = "没关系， 谢谢。",
        targetPinyin = "Méi guānxi, xièxie.",
        wordChips = listOf("没关系，:méi guānxi,", "谢谢。:xièxie.", "对不起:duìbuqǐ", "再见:zàijiàn"),
        correctAnswer = "没关系，,谢谢。",
        audioToSpeak = "没关系，谢谢。"
    ),

    // 10. Soal 10: Ketuk Pasangan yang Sesuai (Rangkuman Etiket Sopan)
    Exercise(
        id = "u12_s4_p2_m10_1",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u12_s4_p2_m10_1", "对不起", "duìbuqǐ", "maaf"),
            MatchPairItem("u12_s4_p2_m10_2", "没关系", "méi guānxi", "tidak apa-apa"),
            MatchPairItem("u12_s4_p2_m10_3", "没事", "méishì", "tidak masalah"),
            MatchPairItem("u12_s4_p2_m10_4", "不客气", "bú kèqi", "sama-sama")
        )
    )
)
