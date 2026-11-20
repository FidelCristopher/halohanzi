package com.example.chineselearning.data.repository

import com.example.chineselearning.R
import com.example.chineselearning.data.model.Exercise
import com.example.chineselearning.data.model.ExerciseType
import com.example.chineselearning.data.model.MatchPairItem
import com.example.chineselearning.data.model.PictureOption

val bab29Stage5Part1Exercises = listOf(
    // 1. Soal 1: Pilihan Gambar (别 -> jangan / larangan lembut)
    Exercise(
        id = "u29_s5_p1_q1",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "别",
        targetPinyin = "bié",
        targetTranslation = "jangan",
        correctAnswer = "jangan",
        audioToSpeak = "别",
        pictureOptions = listOf(
            PictureOption("u29_s5_p1_opt1", "jangan", "", R.drawable.ic_etq_welcome_door, true),
            PictureOption("u29_s5_p1_opt2", "sopan", "", R.drawable.ic_etq_formal_bow, false),
            PictureOption("u29_s5_p1_opt3", "hadiah", "", R.drawable.ic_etq_gift_giving, false),
            PictureOption("u29_s5_p1_opt4", "kenapa", "", R.drawable.ic_log_question_why, false)
        )
    ),

    // 2. Soal 2: Susun Kalimat (Hari sudah dingin, keluar rumah jangan lupa banyak memakai pakaian.)
    Exercise(
        id = "u29_s5_p1_q2",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Keluar rumah jangan lupa pakai baju.",
        targetHanzi = "出门 别 忘 穿 衣服。",
        targetPinyin = "Chūmén bié wàng chuān yīfu.",
        wordChips = listOf("出门:chūmén", "别:bié", "忘:wàng", "穿:chuān", "衣服。:yīfu.", "带:dài"),
        correctAnswer = "出门,别,忘,穿,衣服。",
        audioToSpeak = "出门别忘穿衣服。"
    ),

    // 3. Soal 3: Ketuk Pasangan yang Sesuai (Jangan & Seruan)
    Exercise(
        id = "u29_s5_p1_m3",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u29_s5_p1_m1", "别", "bié", "jangan"),
            MatchPairItem("u29_s5_p1_m2", "啊", "a", "partikel seru (ah/oh)"),
            MatchPairItem("u29_s5_p1_m3", "别说话", "bié shuōhuà", "jangan bicara"),
            MatchPairItem("u29_s5_p1_m4", "真美啊", "zhēn měi a", "sungguh indah")
        )
    ),

    // 4. Soal 4: Ketik Pinyin (jangan -> bié)
    Exercise(
        id = "u29_s5_p1_q4",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "jangan",
        sentenceWithBlank = "别 (________)",
        targetHanzi = "别",
        targetPinyin = "bié",
        correctAnswer = "bie",
        keyboardKeys = listOf("b", "i", "e", "a", "o", "u", "d", "g", "h", "j", "l", "m"),
        audioToSpeak = "别"
    ),

    // 5. Soal 5: Mendengar Kalimat (Rule 10: illustrationRes = 0)
    Exercise(
        id = "u29_s5_p1_q5",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Apa yang Anda dengar?",
        targetTranslation = "Pemandangan di sini sungguh sangat indah ya!",
        targetHanzi = "这里 的 风景 真 美丽 啊！",
        targetPinyin = "Zhèlǐ de fēngjǐng zhēn měilì a!",
        wordChips = listOf("这里:zhèlǐ", "的:de", "风景:fēngjǐng", "真:zhēn", "美丽:měilì", "啊！:a!", "漂亮:piàoliang"),
        correctAnswer = "这里,的,风景,真,美丽,啊！",
        illustrationRes = 0,
        audioToSpeak = "这里的风景真美丽啊！"
    ),

    // 6. Soal 6: Pilihan Kalimat
    Exercise(
        id = "u29_s5_p1_q6",
        type = ExerciseType.SENTENCE_CHOICE,
        title = "Pilih terjemahan yang benar",
        targetHanzi = "在 图书馆 里 别 大声 说话。",
        targetPinyin = "Zài túshūguǎn lǐ bié dàshēng shuōhuà.",
        targetTranslation = "Di dalam perpustakaan jangan berbicara dengan suara keras.",
        correctAnswer = "Zài túshūguǎn lǐ bié dàshēng shuōhuà.\n在 图书馆 里 别 大声 说话。",
        options = listOf(
            "Zài túshūguǎn lǐ bié dàshēng shuōhuà.\n在 图书馆 里 别 大声 说话。",
            "Zài túshūguǎn lǐ kěyǐ dàshēng shuōhuà.\n在 图书馆 里 可以 大声 说话。",
            "Zài jiàoshì lǐ bié shuōhuà.\n在 教室 里 别 说话。"
        ),
        audioToSpeak = "在图书馆里别大声说话。"
    ),

    // 7. Soal 7: Pilihan Gambar (啊 -> seruan kagum)
    Exercise(
        id = "u29_s5_p1_q7",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "啊",
        targetPinyin = "a",
        targetTranslation = "partikel seru",
        correctAnswer = "partikel seru",
        audioToSpeak = "啊",
        pictureOptions = listOf(
            PictureOption("u29_s5_p1_opt7_1", "partikel kagum", "", R.drawable.ic_etq_gift_giving, true),
            PictureOption("u29_s5_p1_opt7_2", "jangan", "", R.drawable.ic_etq_welcome_door, false),
            PictureOption("u29_s5_p1_opt7_3", "sopan", "", R.drawable.ic_etq_formal_bow, false),
            PictureOption("u29_s5_p1_opt7_4", "kenapa", "", R.drawable.ic_log_question_why, false)
        )
    ),

    // 8. Soal 8: Ketik Pinyin (partikel seru -> a)
    Exercise(
        id = "u29_s5_p1_q8",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "partikel seru",
        sentenceWithBlank = "啊 (________)",
        targetHanzi = "啊",
        targetPinyin = "a",
        correctAnswer = "a",
        keyboardKeys = listOf("a", "e", "i", "o", "u", "b", "d", "g", "h", "j", "l", "m"),
        audioToSpeak = "啊"
    ),

    // 9. Soal 9: Susun Kalimat (Hari ini menyenangkan sekali ya!)
    Exercise(
        id = "u29_s5_p1_q9",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Hari ini sungguh senang ya!",
        targetHanzi = "今天 真 高兴 啊！",
        targetPinyin = "Jīntiān zhēn gāoxìng a!",
        wordChips = listOf("今天:jīntiān", "真:zhēn", "高兴:gāoxìng", "啊！:a!", "累:lèi"),
        correctAnswer = "今天,真,高兴,啊！",
        audioToSpeak = "今天真高兴啊！"
    ),

    // 10. Soal 10: Ketuk Pasangan yang Sesuai (Rangkuman Seruan Emosi)
    Exercise(
        id = "u29_s5_p1_m10",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u29_s5_p1_m10_1", "别担心", "bié dānxīn", "jangan cemas"),
            MatchPairItem("u29_s5_p1_m10_2", "好啊", "hǎo a", "baiklah"),
            MatchPairItem("u29_s5_p1_m3", "别走", "bié zǒu", "jangan pergi"),
            MatchPairItem("u29_s5_p1_m4", "真热啊", "zhēn rè a", "sungguh panas")
        )
    )
)

val bab29Stage5Part2Exercises = listOf(
    // 1. Soal 1: Pilihan Gambar (跟 -> dengan / bersama)
    Exercise(
        id = "u29_s5_p2_q1",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "跟",
        targetPinyin = "gēn",
        targetTranslation = "dengan / bersama",
        correctAnswer = "dengan / bersama",
        audioToSpeak = "跟",
        pictureOptions = listOf(
            PictureOption("u29_s5_p2_opt1", "bersama", "", R.drawable.ic_etq_gift_giving, true),
            PictureOption("u29_s5_p2_opt2", "jangan", "", R.drawable.ic_etq_welcome_door, false),
            PictureOption("u29_s5_p2_opt3", "sopan", "", R.drawable.ic_etq_formal_bow, false),
            PictureOption("u29_s5_p2_opt4", "kenapa", "", R.drawable.ic_log_question_why, false)
        )
    ),

    // 2. Soal 2: Susun Kalimat (Saya ingin pergi ke supermarket bersama denganmu.)
    Exercise(
        id = "u29_s5_p2_q2",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Saya mau pergi ke supermarket bersamamu.",
        targetHanzi = "我 想 跟 你 一起 去 超市。",
        targetPinyin = "Wǒ xiǎng gēn nǐ yìqǐ qù chāoshì.",
        wordChips = listOf("我:wǒ", "想:xiǎng", "跟:gēn", "你:nǐ", "一起:yìqǐ", "去:qù", "超市。:chāoshì.", "学校:xuéxiào"),
        correctAnswer = "我,想,跟,你,一起,去,超市。",
        audioToSpeak = "我想跟你一起去超市。"
    ),

    // 3. Soal 3: Ketuk Pasangan yang Sesuai (Grand Sintesis Bab 29)
    Exercise(
        id = "u29_s5_p2_m3",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u29_s5_p2_m1", "跟", "gēn", "bersama / dengan"),
            MatchPairItem("u29_s5_p2_m2", "虽然但是", "suīrán dànshì", "walaupun namun"),
            MatchPairItem("u29_s5_p2_m3", "因为所以", "yīnwèi suǒyǐ", "karena maka"),
            MatchPairItem("u29_s5_p2_m4", "别客气", "bié kèqi", "jangan sungkan")
        )
    ),

    // 4. Soal 4: Ketik Pinyin (bersama/dengan -> gēn)
    Exercise(
        id = "u29_s5_p2_q4",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "dengan / bersama",
        sentenceWithBlank = "跟 (________)",
        targetHanzi = "跟",
        targetPinyin = "gēn",
        correctAnswer = "gen",
        keyboardKeys = listOf("g", "e", "n", "a", "i", "o", "u", "b", "d", "h", "j", "l"),
        audioToSpeak = "跟"
    ),

    // 5. Soal 5: Mendengar Kalimat (Rule 10: illustrationRes = 0)
    Exercise(
        id = "u29_s5_p2_q5",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Apa yang Anda dengar?",
        targetTranslation = "Dia berbicara bahasa Mandarin bersama guru.",
        targetHanzi = "他 跟 老师 说 汉语。",
        targetPinyin = "Tā gēn lǎoshī shuō Hànyǔ.",
        wordChips = listOf("他:tā", "跟:gēn", "老师:lǎoshī", "说:shuō", "汉语。:Hànyǔ.", "英语:Yīngyǔ"),
        correctAnswer = "他,跟,老师,说,汉语。",
        illustrationRes = 0,
        audioToSpeak = "他跟老师说汉语。"
    ),

    // 6. Soal 6: Pilihan Kalimat
    Exercise(
        id = "u29_s5_p2_q6",
        type = ExerciseType.SENTENCE_CHOICE,
        title = "Pilih terjemahan yang benar",
        targetHanzi = "你 跟 他 一起 去 吧。",
        targetPinyin = "Nǐ gēn tā yìqǐ qù ba.",
        targetTranslation = "Kamu pergilah bersama-sama dengannya.",
        correctAnswer = "Nǐ gēn tā yìqǐ qù ba.\n你 跟 他 一起 去 吧。",
        options = listOf(
            "Nǐ gēn tā yìqǐ qù ba.\n你 跟 他 一起 去 吧。",
            "Nǐ bú yào gēn tā qù.\n你 不 要 跟 他 去。",
            "Tā gēn wǒ yìqǐ qù ba.\n他 跟 我 一起 去 吧。"
        ),
        audioToSpeak = "你跟他一起去吧。"
    ),

    // 7. Soal 7: Pilihan Gambar (别忘 -> jangan lupa)
    Exercise(
        id = "u29_s5_p2_q7",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "别忘",
        targetPinyin = "bié wàng",
        targetTranslation = "jangan lupa",
        correctAnswer = "jangan lupa",
        audioToSpeak = "别忘",
        pictureOptions = listOf(
            PictureOption("u29_s5_p2_opt7_1", "jangan lupa", "", R.drawable.ic_etq_welcome_door, true),
            PictureOption("u29_s5_p2_opt7_2", "hadiah", "", R.drawable.ic_etq_gift_giving, false),
            PictureOption("u29_s5_p2_opt7_3", "sopan", "", R.drawable.ic_etq_formal_bow, false),
            PictureOption("u29_s5_p2_opt7_4", "kenapa", "", R.drawable.ic_log_question_why, false)
        )
    ),

    // 8. Soal 8: Ketik Pinyin (jangan lupa -> biéwàng)
    Exercise(
        id = "u29_s5_p2_q8",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "jangan lupa",
        sentenceWithBlank = "别忘 (________)",
        targetHanzi = "别忘",
        targetPinyin = "biéwàng",
        correctAnswer = "biewang",
        keyboardKeys = listOf("b", "i", "e", "w", "a", "n", "g", "o", "u", "d", "h", "j"),
        audioToSpeak = "别忘"
    ),

    // 9. Soal 9: Susun Kalimat (Ayo kita belajar bersama guru.)
    Exercise(
        id = "u29_s5_p2_q9",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Ayo kita belajar bersama guru.",
        targetHanzi = "我们 跟 老师 学习 吧。",
        targetPinyin = "Wǒmen gēn lǎoshī xuéxí ba.",
        wordChips = listOf("我们:wǒmen", "跟:gēn", "老师:lǎoshī", "学习:xuéxí", "吧。:ba.", "走:zǒu"),
        correctAnswer = "我们,跟,老师,学习,吧。",
        audioToSpeak = "我们跟老师学习吧。"
    ),

    // 10. Soal 10: Ketuk Pasangan yang Sesuai (Grand Review Final Bab 29)
    Exercise(
        id = "u29_s5_p2_m10",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u29_s5_p2_m10_1", "跟他学", "gēn tā xué", "belajar dengannya"),
            MatchPairItem("u29_s5_p2_m10_2", "一起走", "yìqǐ zǒu", "jalan bareng"),
            MatchPairItem("u29_s5_p2_m3", "别说话", "bié shuōhuà", "jangan bersuara"),
            MatchPairItem("u29_s5_p2_m4", "真好啊", "zhēn hǎo a", "sungguh elok")
        )
    )
)
