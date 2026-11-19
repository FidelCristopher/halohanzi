package com.example.chineselearning.data.repository

import com.example.chineselearning.R
import com.example.chineselearning.data.model.Exercise
import com.example.chineselearning.data.model.ExerciseType
import com.example.chineselearning.data.model.MatchPairItem
import com.example.chineselearning.data.model.PictureOption

val bab15Stage5Part1Exercises = listOf(
    // 1. Soal 1: Pilihan Gambar (手机 -> ponsel)
    Exercise(
        id = "u15_s5_p1_q1",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "手机",
        targetPinyin = "shǒujī",
        targetTranslation = "ponsel",
        correctAnswer = "ponsel",
        audioToSpeak = "手机",
        pictureOptions = listOf(
            PictureOption("u15_s5_p1_opt1", "ponsel", "", R.drawable.ic_comm_phone, true),
            PictureOption("u15_s5_p1_opt2", "buku", "", R.drawable.ic_book_chinese, false),
            PictureOption("u15_s5_p1_opt3", "meja", "", R.drawable.ic_fam_table, false),
            PictureOption("u15_s5_p1_opt4", "uang", "", R.drawable.ic_yuan_currency, false)
        )
    ),

    // 2. Soal 2: Susun Kalimat (Halo, Tuan Wang ada di kantor?)
    Exercise(
        id = "u15_s5_p1_q2",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Halo, Tuan Wang ada di kantor?",
        targetHanzi = "喂， 王 先生 在 公司 吗？",
        targetPinyin = "Wèi, Wáng xiānsheng zài gōngsī ma?",
        wordChips = listOf("喂，:wèi,", "王:Wáng", "先生:xiānsheng", "在:zài", "公司:gōngsī", "吗？:ma?"),
        correctAnswer = "喂，,王,先生,在,公司,吗？",
        audioToSpeak = "喂，王先生在公司吗？"
    ),

    // 3. Soal 3: Ketuk Pasangan yang Sesuai (Rangkuman Bab 15 Bagian 1)
    Exercise(
        id = "u15_s5_p1_q3",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u15_s5_p1_m1", "打电话", "dǎ diànhuà", "menelepon"),
            MatchPairItem("u15_s5_p1_m2", "请问", "qǐngwèn", "permisi bertanya"),
            MatchPairItem("u15_s5_p1_m3", "手机", "shǒujī", "ponsel"),
            MatchPairItem("u15_s5_p1_m4", "认识", "rènshi", "mengenal")
        )
    ),

    // 4. Soal 4: Ketik Pinyin (menelepon -> diànhuà)
    Exercise(
        id = "u15_s5_p1_q4",
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
        id = "u15_s5_p1_q5",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Apa yang Anda dengar?",
        targetTranslation = "Permisi, stasiun kereta di mana?",
        targetHanzi = "请问， 火车站 在 哪儿？",
        targetPinyin = "Qǐngwèn, huǒchēzhàn zài nǎr?",
        wordChips = listOf("请问，:qǐngwèn,", "火车站:huǒchēzhàn", "在:zài", "哪儿？:nǎr?", "学校:xuéxiào"),
        correctAnswer = "请问，,火车站,在,哪儿？",
        illustrationRes = 0,
        audioToSpeak = "请问，火车站在哪儿？"
    ),

    // 6. Soal 6: Pilihan Kalimat
    Exercise(
        id = "u15_s5_p1_q6",
        type = ExerciseType.SENTENCE_CHOICE,
        title = "Pilih terjemahan yang benar",
        targetHanzi = "认识 您 很 高兴。",
        targetPinyin = "Rènshi nín hěn gāoxìng.",
        targetTranslation = "Senang berkenalan dengan Anda.",
        correctAnswer = "Rènshi nín hěn gāoxìng.\n认识 您 很 高兴。",
        options = listOf(
            "Rènshi nín hěn gāoxìng.\n认识 您 很 高兴。",
            "Rènshi tā hěn gāoxìng.\n认识 他 很 高兴。",
            "Xièxie nín hěn gāoxìng.\n谢谢 您 很 高兴。"
        ),
        audioToSpeak = "认识您很高兴。"
    ),

    // 7. Soal 7: Pilihan Gambar (请问 -> permisi tanya)
    Exercise(
        id = "u15_s5_p1_q7",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "请问",
        targetPinyin = "qǐngwèn",
        targetTranslation = "permisi bertanya",
        correctAnswer = "permisi bertanya",
        audioToSpeak = "请问",
        pictureOptions = listOf(
            PictureOption("u15_s5_p1_opt7_1", "permisi bertanya", "", R.drawable.ic_etq_ask, true),
            PictureOption("u15_s5_p1_opt7_2", "terima kasih", "", R.drawable.ic_etq_thanks, false),
            PictureOption("u15_s5_p1_opt7_3", "maaf", "", R.drawable.ic_etq_sorry, false),
            PictureOption("u15_s5_p1_opt7_4", "halo", "", R.drawable.ic_comm_hello, false)
        )
    ),

    // 8. Soal 8: Ketik Pinyin (permisi tanya -> qǐngwèn)
    Exercise(
        id = "u15_s5_p1_q8",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "permisi bertanya",
        sentenceWithBlank = "请问 (________)",
        targetHanzi = "请问",
        targetPinyin = "qǐngwèn",
        correctAnswer = "qingwen",
        keyboardKeys = listOf("q", "i", "n", "g", "w", "e", "a", "o", "u", "b", "d"),
        audioToSpeak = "请问"
    ),

    // 9. Soal 9: Susun Kalimat (Terima kasih bantuan Anda!)
    Exercise(
        id = "u15_s5_p1_q9",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Terima kasih bantuan Anda!",
        targetHanzi = "谢谢 您 的 帮助！",
        targetPinyin = "Xièxie nín de bāngzhù!",
        wordChips = listOf("谢谢:xièxie", "您:nín", "的:de", "帮助！:bāngzhù!", "对不起:duìbuqǐ"),
        correctAnswer = "谢谢,您,的,帮助！",
        audioToSpeak = "谢谢您的帮助！"
    ),

    // 10. Soal 10: Ketuk Pasangan yang Sesuai (Rangkuman Komunikasi)
    Exercise(
        id = "u15_s5_p1_m10_1",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u15_s5_p1_m10_1", "打电话", "dǎ diànhuà", "menelepon"),
            MatchPairItem("u15_s5_p1_m10_2", "认识你", "rènshi nǐ", "kenal denganmu"),
            MatchPairItem("u15_s5_p1_m10_3", "请坐", "qǐng zuò", "silakan duduk"),
            MatchPairItem("u15_s5_p1_m10_4", "没问题", "méi wèntí", "tidak masalah")
        )
    )
)

val bab15Stage5Part2Exercises = listOf(
    // 1. Soal 1: Pilihan Gambar (谢谢 -> terima kasih)
    Exercise(
        id = "u15_s5_p2_q1",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "谢谢",
        targetPinyin = "xièxie",
        targetTranslation = "terima kasih",
        correctAnswer = "terima kasih",
        audioToSpeak = "谢谢",
        pictureOptions = listOf(
            PictureOption("u15_s5_p2_opt1", "terima kasih", "", R.drawable.ic_etq_thanks, true),
            PictureOption("u15_s5_p2_opt2", "maaf", "", R.drawable.ic_etq_sorry, false),
            PictureOption("u15_s5_p2_opt3", "halo", "", R.drawable.ic_comm_hello, false),
            PictureOption("u15_s5_p2_opt4", "telepon", "", R.drawable.ic_comm_call, false)
        )
    ),

    // 2. Soal 2: Susun Kalimat (Tidak masalah, terima kasih!)
    Exercise(
        id = "u15_s5_p2_q2",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Tidak apa-apa, terima kasih.",
        targetHanzi = "没关系， 谢谢 你。",
        targetPinyin = "Méi guānxi, xièxie nǐ.",
        wordChips = listOf("没关系，:méi guānxi,", "谢谢:xièxie", "你。:nǐ.", "对不起:duìbuqǐ"),
        correctAnswer = "没关系，,谢谢,你。",
        audioToSpeak = "没关系，谢谢你。"
    ),

    // 3. Soal 3: Ketuk Pasangan yang Sesuai (Grand Review Bab 15)
    Exercise(
        id = "u15_s5_p2_m3",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u15_s5_p2_m1", "谢谢", "xièxie", "terima kasih"),
            MatchPairItem("u15_s5_p2_m2", "不客气", "bú kèqi", "sama-sama"),
            MatchPairItem("u15_s5_p2_m3", "对不起", "duìbuqǐ", "maaf"),
            MatchPairItem("u15_s5_p2_m4", "没关系", "méi guānxi", "tidak apa-apa")
        )
    ),

    // 4. Soal 4: Ketik Pinyin (terima kasih -> xièxie)
    Exercise(
        id = "u15_s5_p2_q4",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "terima kasih",
        sentenceWithBlank = "谢谢 (________)",
        targetHanzi = "谢谢",
        targetPinyin = "xièxie",
        correctAnswer = "xiexie",
        keyboardKeys = listOf("x", "i", "e", "a", "o", "u", "b", "d", "g", "h", "j"),
        audioToSpeak = "谢谢"
    ),

    // 5. Soal 5: Mendengar Kalimat (Rule 10: illustrationRes = 0)
    Exercise(
        id = "u15_s5_p2_q5",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Apa yang Anda dengar?",
        targetTranslation = "Saya merasa sangat senang.",
        targetHanzi = "我 觉得 很 高兴。",
        targetPinyin = "Wǒ juéde hěn gāoxìng.",
        wordChips = listOf("我:wǒ", "觉得:juéde", "很:hěn", "高兴。:gāoxìng.", "知道:zhīdào"),
        correctAnswer = "我,觉得,很,高兴。",
        illustrationRes = 0,
        audioToSpeak = "我觉得很高兴。"
    ),

    // 6. Soal 6: Pilihan Kalimat
    Exercise(
        id = "u15_s5_p2_q6",
        type = ExerciseType.SENTENCE_CHOICE,
        title = "Pilih terjemahan yang benar",
        targetHanzi = "你 知道 这 件 事 吗？",
        targetPinyin = "Nǐ zhīdào zhè jiàn shì ma?",
        targetTranslation = "Apakah kamu tahu hal ini?",
        correctAnswer = "Nǐ zhīdào zhè jiàn shì ma?\n你 知道 这 件 事 吗？",
        options = listOf(
            "Nǐ zhīdào zhè jiàn shì ma?\n你 知道 这 件 事 吗？",
            "Tā zhīdào zhè jiàn shì ma?\n他 知道 这 件 事 吗？",
            "Nǐ juéde zhè jiàn shì ma?\n你 觉得 这 件 事 吗？"
        ),
        audioToSpeak = "你知道这件事吗？"
    ),

    // 7. Soal 7: Pilihan Gambar (认识 -> mengenal)
    Exercise(
        id = "u15_s5_p2_q7",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "认识",
        targetPinyin = "rènshi",
        targetTranslation = "mengenal / kenal",
        correctAnswer = "mengenal / kenal",
        audioToSpeak = "认识",
        pictureOptions = listOf(
            PictureOption("u15_s5_p2_opt7_1", "kenal", "", R.drawable.ic_comm_know, true),
            PictureOption("u15_s5_p2_opt7_2", "buku", "", R.drawable.ic_book_chinese, false),
            PictureOption("u15_s5_p2_opt7_3", "makanan", "", R.drawable.ic_food_chinese_cuisine, false),
            PictureOption("u15_s5_p2_opt7_4", "tidur", "", R.drawable.ic_action_sleep, false)
        )
    ),

    // 8. Soal 8: Ketik Pinyin (mengenal -> rènshi)
    Exercise(
        id = "u15_s5_p2_q8",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "mengenal / kenal",
        sentenceWithBlank = "认识 (________)",
        targetHanzi = "认识",
        targetPinyin = "rènshi",
        correctAnswer = "renshi",
        keyboardKeys = listOf("r", "e", "n", "s", "h", "i", "a", "o", "u", "b", "d"),
        audioToSpeak = "认识"
    ),

    // 9. Soal 9: Susun Kalimat (Grand Evaluasi Bab 15)
    Exercise(
        id = "u15_s5_p2_q9",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Senang berkenalan dengan Anda.",
        targetHanzi = "认识 您 很 高兴。",
        targetPinyin = "Rènshi nín hěn gāoxìng.",
        wordChips = listOf("认识:rènshi", "您:nín", "很:hěn", "高兴。:gāoxìng.", "你:nǐ"),
        correctAnswer = "认识,您,很,高兴。",
        audioToSpeak = "认识您很高兴。"
    ),

    // 10. Soal 10: Ketuk Pasangan yang Sesuai (Grand Review Akhir Bab 15)
    Exercise(
        id = "u15_s5_p2_m10_1",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u15_s5_p2_m10_1", "认识您", "rènshi nín", "kenal Anda"),
            MatchPairItem("u15_s5_p2_m10_2", "很高兴", "hěn gāoxìng", "sangat senang"),
            MatchPairItem("u15_s5_p2_m10_3", "对不起", "duìbuqǐ", "maaf"),
            MatchPairItem("u15_s5_p2_m10_4", "没关系", "méi guānxi", "tidak apa-apa")
        )
    )
)
