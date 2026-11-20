package com.example.chineselearning.data.repository

import com.example.chineselearning.R
import com.example.chineselearning.data.model.Exercise
import com.example.chineselearning.data.model.ExerciseType
import com.example.chineselearning.data.model.MatchPairItem
import com.example.chineselearning.data.model.PictureOption

val bab29Stage4Part1Exercises = listOf(
    // 1. Soal 1: Pilihan Gambar (介绍 -> memperkenalkan)
    Exercise(
        id = "u29_s4_p1_q1",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "介绍",
        targetPinyin = "jièshào",
        targetTranslation = "memperkenalkan",
        correctAnswer = "memperkenalkan",
        audioToSpeak = "介绍",
        pictureOptions = listOf(
            PictureOption("u29_s4_p1_opt1", "memperkenalkan", "", R.drawable.ic_etq_formal_bow, true),
            PictureOption("u29_s4_p1_opt2", "hadiah", "", R.drawable.ic_etq_gift_giving, false),
            PictureOption("u29_s4_p1_opt3", "masuk pintu", "", R.drawable.ic_etq_welcome_door, false),
            PictureOption("u29_s4_p1_opt4", "mengapa", "", R.drawable.ic_log_question_why, false)
        )
    ),

    // 2. Soal 2: Susun Kalimat (Saya perkenalkan sebentar, ini adalah manajer Wang.)
    Exercise(
        id = "u29_s4_p1_q2",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Saya perkenalkan, ini Manajer Wang.",
        targetHanzi = "我 介绍 一下， 这 是 王 经理。",
        targetPinyin = "Wǒ jièshào yíxià, zhè shì Wáng jīnglǐ.",
        wordChips = listOf("我:wǒ", "介绍:jièshào", "一下，:yíxià,", "这:zhè", "是:shì", "王:Wáng", "经理。:jīnglǐ.", "老师:lǎoshī"),
        correctAnswer = "我,介绍,一下，,这,是,王,经理。",
        audioToSpeak = "我介绍一下，这是王经理。"
    ),

    // 3. Soal 3: Ketuk Pasangan yang Sesuai (Ingat & Memperkenalkan)
    Exercise(
        id = "u29_s4_p1_q3",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u29_s4_p1_m1", "记得", "jìde", "ingat"),
            MatchPairItem("u29_s4_p1_m2", "介绍", "jièshào", "memperkenalkan"),
            MatchPairItem("u29_s4_p1_m3", "介绍一下", "jièshào yíxià", "perkenalkan dulu"),
            MatchPairItem("u29_s4_p1_m4", "还记得", "hái jìde", "masih ingat")
        )
    ),

    // 4. Soal 4: Ketik Pinyin (ingat -> jìde)
    Exercise(
        id = "u29_s4_p1_q4",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "ingat",
        sentenceWithBlank = "记得 (________)",
        targetHanzi = "记得",
        targetPinyin = "jìde",
        correctAnswer = "jide",
        keyboardKeys = listOf("j", "i", "d", "e", "a", "o", "u", "b", "g", "h", "l", "m"),
        audioToSpeak = "记得"
    ),

    // 5. Soal 5: Mendengar Kalimat (Rule 10: illustrationRes = 0)
    Exercise(
        id = "u29_s4_p1_q5",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Apa yang Anda dengar?",
        targetTranslation = "Apakah kamu masih ingat siapa nama lengkapnya?",
        targetHanzi = "你 还 记得 他 的 名字 吗？",
        targetPinyin = "Nǐ hái jìde tā de míngzi ma?",
        wordChips = listOf("你:nǐ", "还:hái", "记得:jìde", "他:tā", "的:de", "名字:míngzi", "吗？:ma?", "忘:wàng"),
        correctAnswer = "你,还,记得,他,的,名字,吗？",
        illustrationRes = 0,
        audioToSpeak = "你还记得他的名字吗？"
    ),

    // 6. Soal 6: Pilihan Kalimat
    Exercise(
        id = "u29_s4_p1_q6",
        type = ExerciseType.SENTENCE_CHOICE,
        title = "Pilih terjemahan yang benar",
        targetHanzi = "请 介绍 一下 你 的 朋友。",
        targetPinyin = "Qǐng jièshào yíxià nǐ de péngyou.",
        targetTranslation = "Tolong perkenalkan sebentar temanmu itu.",
        correctAnswer = "Qǐng jièshào yíxià nǐ de péngyou.\n请 介绍 一下 你 的 朋友。",
        options = listOf(
            "Qǐng jièshào yíxià nǐ de péngyou.\n请 介绍 一下 你 的 朋友。",
            "Qǐng jièshào yíxià nǐ de jiā.\n请 介绍 一下 你 的 家。",
            "Tā jièshào le tā de péngyou.\n他 介绍 了 他 的 朋友。"
        ),
        audioToSpeak = "请介绍一下你的朋友。"
    ),

    // 7. Soal 7: Pilihan Gambar (记得 -> mengingat kembali)
    Exercise(
        id = "u29_s4_p1_q7",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "记得",
        targetPinyin = "jìde",
        targetTranslation = "ingat",
        correctAnswer = "ingat",
        audioToSpeak = "记得",
        pictureOptions = listOf(
            PictureOption("u29_s4_p1_opt7_1", "ingat", "", R.drawable.ic_etq_formal_bow, true),
            PictureOption("u29_s4_p1_opt7_2", "hadiah", "", R.drawable.ic_etq_gift_giving, false),
            PictureOption("u29_s4_p1_opt7_3", "pintu", "", R.drawable.ic_etq_welcome_door, false),
            PictureOption("u29_s4_p1_opt7_4", "kenapa", "", R.drawable.ic_log_question_why, false)
        )
    ),

    // 8. Soal 8: Ketik Pinyin (memperkenalkan -> jièshào)
    Exercise(
        id = "u29_s4_p1_q8",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "memperkenalkan",
        sentenceWithBlank = "介绍 (________)",
        targetHanzi = "介绍",
        targetPinyin = "jièshào",
        correctAnswer = "jieshao",
        keyboardKeys = listOf("j", "i", "e", "s", "h", "a", "o", "u", "b", "d", "g", "l"),
        audioToSpeak = "介绍"
    ),

    // 9. Soal 9: Susun Kalimat (Saya ingat hal ini dengan sangat jelas.)
    Exercise(
        id = "u29_s4_p1_q9",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Saya ingat hal ini sangat jelas.",
        targetHanzi = "我 记得 很 清楚。",
        targetPinyin = "Wǒ jìde hěn qīngchu.",
        wordChips = listOf("我:wǒ", "记得:jìde", "很:hěn", "清楚。:qīngchu.", "忘:wàng"),
        correctAnswer = "我,记得,很,清楚。",
        audioToSpeak = "我记得很清楚。"
    ),

    // 10. Soal 10: Ketuk Pasangan yang Sesuai (Rangkuman Perkenalan & Ingatan)
    Exercise(
        id = "u29_s4_p1_m10",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u29_s4_p1_m10_1", "记得", "jìde", "mengingat"),
            MatchPairItem("u29_s4_p1_m10_2", "介绍", "jièshào", "kenalkan"),
            MatchPairItem("u29_s4_p1_m3", "记得清楚", "jìde qīngchu", "ingat jelas"),
            MatchPairItem("u29_s4_p1_m4", "我来介绍", "wǒ lái jièshào", "biar kukenalkan")
        )
    )
)

val bab29Stage4Part2Exercises = listOf(
    // 1. Soal 1: Pilihan Gambar (不好意思 -> merasa tidak enak / sungkan / permisi)
    Exercise(
        id = "u29_s4_p2_q1",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "不好意思",
        targetPinyin = "bùhǎoyìsi",
        targetTranslation = "sungkan / permisi",
        correctAnswer = "sungkan / permisi",
        audioToSpeak = "不好意思",
        pictureOptions = listOf(
            PictureOption("u29_s4_p2_opt1", "sungkan", "", R.drawable.ic_etq_formal_bow, true),
            PictureOption("u29_s4_p2_opt2", "hadiah", "", R.drawable.ic_etq_gift_giving, false),
            PictureOption("u29_s4_p2_opt3", "masuk pintu", "", R.drawable.ic_etq_welcome_door, false),
            PictureOption("u29_s4_p2_opt4", "mengapa", "", R.drawable.ic_log_question_why, false)
        )
    ),

    // 2. Soal 2: Susun Kalimat (Permisi, numpang tanya toilet ada di sebelah mana?)
    Exercise(
        id = "u29_s4_p2_q2",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Permisi, mengganggu Anda sebentar.",
        targetHanzi = "不好意思， 打扰 您 一下。",
        targetPinyin = "Bùhǎoyìsi, dǎrǎo nín yíxià.",
        wordChips = listOf("不好意思，:bùhǎoyìsi,", "打扰:dǎrǎo", "您:nín", "一下。:yíxià.", "对不起:duìbuqǐ"),
        correctAnswer = "不好意思，,打扰,您,一下。",
        audioToSpeak = "不好意思，打扰您一下。"
    ),

    // 3. Soal 3: Ketuk Pasangan yang Sesuai (Makna & Rasa Sungkan)
    Exercise(
        id = "u29_s4_p2_m3",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u29_s4_p2_m1", "意思", "yìsi", "makna / arti"),
            MatchPairItem("u29_s4_p2_m2", "不好意思", "bùhǎoyìsi", "sungkan / permisi"),
            MatchPairItem("u29_s4_p2_m3", "什么意思", "shénme yìsi", "apa artinya"),
            MatchPairItem("u29_s4_p2_m4", "有意思", "yǒuyìsi", "menarik")
        )
    ),

    // 4. Soal 4: Ketik Pinyin (makna/arti -> yìsi)
    Exercise(
        id = "u29_s4_p2_q4",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "makna / arti",
        sentenceWithBlank = "意思 (________)",
        targetHanzi = "意思",
        targetPinyin = "yìsi",
        correctAnswer = "yisi",
        keyboardKeys = listOf("y", "i", "s", "a", "e", "o", "u", "b", "d", "g", "h", "j"),
        audioToSpeak = "意思"
    ),

    // 5. Soal 5: Mendengar Kalimat (Rule 10: illustrationRes = 0)
    Exercise(
        id = "u29_s4_p2_q5",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Apa yang Anda dengar?",
        targetTranslation = "Permisi numpang tanya apa arti karakter Hanzi ini?",
        targetHanzi = "这个 汉字 是 什么 意思？",
        targetPinyin = "Zhège Hànzì shì shénme yìsi?",
        wordChips = listOf("这个:zhège", "汉字:Hànzì", "是:shì", "什么:shénme", "意思？:yìsi.", "词:cí"),
        correctAnswer = "这个,汉字,是,什么,意思？",
        illustrationRes = 0,
        audioToSpeak = "这个汉字是什么意思？"
    ),

    // 6. Soal 6: Pilihan Kalimat
    Exercise(
        id = "u29_s4_p2_q6",
        type = ExerciseType.SENTENCE_CHOICE,
        title = "Pilih terjemahan yang benar",
        targetHanzi = "真 不好意思， 让 您 久 等 了。",
        targetPinyin = "Zhēn bùhǎoyìsi, ràng nín jiǔ děng le.",
        targetTranslation = "Sungguh tidak enak hati, membuat Anda lama menunggu.",
        correctAnswer = "Zhēn bùhǎoyìsi, ràng nín jiǔ děng le.\n真 不好意思， 让 您 久 等 了。",
        options = listOf(
            "Zhēn bùhǎoyìsi, ràng nín jiǔ děng le.\n真 不好意思， 让 您 久 等 了。",
            "Zhēn gāoxìng, ràng nín jiǔ děng le.\n真 高兴， 让 您 久 等 了。",
            "Bùhǎoyìsi, wǒ lái zǎo le.\n不好意思， 我 来 早 了。"
        ),
        audioToSpeak = "真不好意思，让您久等了。"
    ),

    // 7. Soal 7: Pilihan Gambar (意思 -> makna arti)
    Exercise(
        id = "u29_s4_p2_q7",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "意思",
        targetPinyin = "yìsi",
        targetTranslation = "makna",
        correctAnswer = "makna",
        audioToSpeak = "意思",
        pictureOptions = listOf(
            PictureOption("u29_s4_p2_opt7_1", "makna", "", R.drawable.ic_log_question_why, true),
            PictureOption("u29_s4_p2_opt7_2", "sopan", "", R.drawable.ic_etq_formal_bow, false),
            PictureOption("u29_s4_p2_opt7_3", "pintu", "", R.drawable.ic_etq_welcome_door, false),
            PictureOption("u29_s4_p2_opt7_4", "hadiah", "", R.drawable.ic_etq_gift_giving, false)
        )
    ),

    // 8. Soal 8: Ketik Pinyin (sungkan/permisi -> bùhǎoyìsi)
    Exercise(
        id = "u29_s4_p2_q8",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "sungkan / permisi",
        sentenceWithBlank = "不好意思 (________)",
        targetHanzi = "不好意思",
        targetPinyin = "bùhǎoyìsi",
        correctAnswer = "buhaoyisi",
        keyboardKeys = listOf("b", "u", "h", "a", "o", "y", "i", "s", "e", "d", "g", "j"),
        audioToSpeak = "不好意思"
    ),

    // 9. Soal 9: Susun Kalimat (Saya paham arti kalimat ini.)
    Exercise(
        id = "u29_s4_p2_q9",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Saya paham arti kalimat ini.",
        targetHanzi = "我 懂 这 句 话 的 意思。",
        targetPinyin = "Wǒ dǒng zhè jù huà de yìsi.",
        wordChips = listOf("我:wǒ", "懂:dǒng", "这:zhè", "句:jù", "话:huà", "的:de", "意思。:yìsi.", "字:zì"),
        correctAnswer = "我,懂,这,句,话,的,意思。",
        audioToSpeak = "我懂这句话的意思。"
    ),

    // 10. Soal 10: Ketuk Pasangan yang Sesuai (Rangkuman Sopan Santun Etiket)
    Exercise(
        id = "u29_s4_p2_m10",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u29_s4_p2_m10_1", "不好意思", "bùhǎoyìsi", "merasa sungkan"),
            MatchPairItem("u29_s4_p2_m10_2", "打扰一下", "dǎrǎo yíxià", "mengganggu sebentar"),
            MatchPairItem("u29_s4_p2_m3", "什么意思", "shénme yìsi", "maknanya apa"),
            MatchPairItem("u29_s4_p2_m4", "久等了", "jiǔ děng le", "lama menunggu")
        )
    )
)
