package com.example.chineselearning.data.repository

import com.example.chineselearning.R
import com.example.chineselearning.data.model.Exercise
import com.example.chineselearning.data.model.ExerciseType
import com.example.chineselearning.data.model.MatchPairItem
import com.example.chineselearning.data.model.PictureOption

val bab30Stage3Part1Exercises = listOf(
    // 1. Soal 1: Pilihan Gambar (次 -> kali frekuensi)
    Exercise(
        id = "u30_s3_p1_q1",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "次",
        targetPinyin = "cì",
        targetTranslation = "kali (frekuensi)",
        correctAnswer = "kali (frekuensi)",
        audioToSpeak = "次",
        pictureOptions = listOf(
            PictureOption("u30_s3_p1_opt1", "frekuensi kali", "", R.drawable.ic_eval_mastery_trophy, true),
            PictureOption("u30_s3_p1_opt2", "pekan", "", R.drawable.ic_cal_week_cycle, false),
            PictureOption("u30_s3_p1_opt3", "cerah", "", R.drawable.ic_weather_sunny_clear, false),
            PictureOption("u30_s3_p1_opt4", "10.000", "", R.drawable.ic_fin_ten_thousand, false)
        )
    ),

    // 2. Soal 2: Susun Kalimat (Buku ini sudah saya baca dengan sungguh-sungguh sebanyak tiga kali.)
    Exercise(
        id = "u30_s3_p1_q2",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Buku ini sudah saya baca tiga kali.",
        targetHanzi = "这 本 书 我 读 了 三 次。",
        targetPinyin = "Zhè běn shū wǒ dú le sān cì.",
        wordChips = listOf("这:zhè", "本:běn", "书:shū", "我:wǒ", "读:dú", "了:le", "三:sān", "次。:cì.", "看:kàn"),
        correctAnswer = "这,本,书,我,读,了,三,次。",
        audioToSpeak = "这本书我读了三次。"
    ),

    // 3. Soal 3: Ketuk Pasangan yang Sesuai (Kali & Panggilan Sopan)
    Exercise(
        id = "u30_s3_p1_q3",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u30_s3_p1_m1", "次", "cì", "kali (frekuensi)"),
            MatchPairItem("u30_s3_p1_m2", "位", "wèi", "orang (sopan)"),
            MatchPairItem("u30_s3_p1_m3", "这位老师", "zhè wèi lǎoshī", "guru ini (hormat)"),
            MatchPairItem("u30_s3_p1_m4", "第一次", "dì-yī cì", "pertama kali")
        )
    ),

    // 4. Soal 4: Ketik Pinyin (kali -> cì)
    Exercise(
        id = "u30_s3_p1_q4",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "kali (frekuensi kejadian)",
        sentenceWithBlank = "次 (________)",
        targetHanzi = "次",
        targetPinyin = "cì",
        correctAnswer = "ci",
        keyboardKeys = listOf("c", "i", "a", "e", "o", "u", "b", "d", "g", "h", "j", "l"),
        audioToSpeak = "次"
    ),

    // 5. Soal 5: Mendengar Kalimat (Rule 10: illustrationRes = 0)
    Exercise(
        id = "u30_s3_p1_q5",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Apa yang Anda dengar?",
        targetTranslation = "Di depan pintu telah datang dua orang kawan lama.",
        targetHanzi = "门口 来 了 两 位 朋友。",
        targetPinyin = "Ménkǒu lái le liǎng wèi péngyou.",
        wordChips = listOf("门口:ménkǒu", "来:lái", "了:le", "两:liǎng", "位:wèi", "朋友。:péngyou.", "个:gè"),
        correctAnswer = "门口,来,了,两,位,朋友。",
        illustrationRes = 0,
        audioToSpeak = "门口来了两位朋友。"
    ),

    // 6. Soal 6: Pilihan Kalimat
    Exercise(
        id = "u30_s3_p1_q6",
        type = ExerciseType.SENTENCE_CHOICE,
        title = "Pilih terjemahan yang benar",
        targetHanzi = "这 是 我 第一 次 来 中国。",
        targetPinyin = "Zhè shì wǒ dì-yī cì lái Zhōngguó.",
        targetTranslation = "Ini adalah pertama kalinya saya datang ke Tiongkok.",
        correctAnswer = "Zhè shì wǒ dì-yī cì lái Zhōngguó.\n这 是 我 第一 次 来 中国。",
        options = listOf(
            "Zhè shì wǒ dì-yī cì lái Zhōngguó.\n这 是 我 第一 次 来 中国。",
            "Zhè shì wǒ dì-èr cì lái Zhōngguó.\n这 是 我 第二 次 来 中国。",
            "Tā shì dì-yī cì lái Zhōngguó.\n他 是 第一 次 来 中国。"
        ),
        audioToSpeak = "这是我第一次来中国。"
    ),

    // 7. Soal 7: Pilihan Gambar (位 -> orang terhormat)
    Exercise(
        id = "u30_s3_p1_q7",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "位",
        targetPinyin = "wèi",
        targetTranslation = "orang (sopan)",
        correctAnswer = "orang (sopan)",
        audioToSpeak = "位",
        pictureOptions = listOf(
            PictureOption("u30_s3_p1_opt7_1", "panggilan sopan", "", R.drawable.ic_eval_mastery_trophy, true),
            PictureOption("u30_s3_p1_opt7_2", "mall", "", R.drawable.ic_shop_mall_plaza, false),
            PictureOption("u30_s3_p1_opt7_3", "pekan", "", R.drawable.ic_cal_week_cycle, false),
            PictureOption("u30_s3_p1_opt7_4", "cerah", "", R.drawable.ic_weather_sunny_clear, false)
        )
    ),

    // 8. Soal 8: Ketik Pinyin (orang terhormat -> wèi)
    Exercise(
        id = "u30_s3_p1_q8",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "orang (penghormatan sopan)",
        sentenceWithBlank = "位 (________)",
        targetHanzi = "位",
        targetPinyin = "wèi",
        correctAnswer = "wei",
        keyboardKeys = listOf("w", "e", "i", "a", "o", "u", "b", "d", "g", "h", "j", "l"),
        audioToSpeak = "位"
    ),

    // 9. Soal 9: Susun Kalimat (Guru yang terhormat ini sangat ramah.)
    Exercise(
        id = "u30_s3_p1_q9",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Guru terhormat ini sangat baik.",
        targetHanzi = "这 位 老师 很 好。",
        targetPinyin = "Zhè wèi lǎoshī hěn hǎo.",
        wordChips = listOf("这:zhè", "位:wèi", "老师:lǎoshī", "很:hěn", "好。:hǎo.", "个:gè"),
        correctAnswer = "这,位,老师,很,好。",
        audioToSpeak = "这位老师很好。"
    ),

    // 10. Soal 10: Ketuk Pasangan yang Sesuai (Rangkuman Frekuensi & Hormat)
    Exercise(
        id = "u30_s3_p1_m10",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u30_s3_p1_m10_1", "次", "cì", "kali kejadian"),
            MatchPairItem("u30_s3_p1_m10_2", "位", "wèi", "tuan / nyonya"),
            MatchPairItem("u30_s3_p1_m10_3", "两位客人", "liǎng wèi kèrén", "dua orang tamu"),
            MatchPairItem("u30_s3_p1_m10_4", "再去一次", "zài qù yí cì", "pergi sekali lagi")
        )
    )
)

val bab30Stage3Part2Exercises = listOf(
    // 1. Soal 1: Pilihan Gambar (两次 -> dua kali)
    Exercise(
        id = "u30_s3_p2_q1",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "两次",
        targetPinyin = "liǎngcì",
        targetTranslation = "dua kali",
        correctAnswer = "dua kali",
        audioToSpeak = "两次",
        pictureOptions = listOf(
            PictureOption("u30_s3_p2_opt1", "dua kali", "", R.drawable.ic_eval_mastery_trophy, true),
            PictureOption("u30_s3_p2_opt2", "mall", "", R.drawable.ic_shop_mall_plaza, false),
            PictureOption("u30_s3_p2_opt3", "pekan", "", R.drawable.ic_cal_week_cycle, false),
            PictureOption("u30_s3_p2_opt4", "10.000", "", R.drawable.ic_fin_ten_thousand, false)
        )
    ),

    // 2. Soal 2: Susun Kalimat (Saya sudah pergi ke Tiongkok dua kali.)
    Exercise(
        id = "u30_s3_p2_q2",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Saya sudah pergi ke Tiongkok 2 kali.",
        targetHanzi = "我 去 过 两 次 中国。",
        targetPinyin = "Wǒ qù guo liǎng cì Zhōngguó.",
        wordChips = listOf("我:wǒ", "去:qù", "过:guo", "两:liǎng", "次:cì", "中国。:Zhōngguó.", "三:sān"),
        correctAnswer = "我,去,过,两,次,中国。",
        audioToSpeak = "我去过两次中国。"
    ),

    // 3. Soal 3: Ketuk Pasangan yang Sesuai (Panggilan Terhormat)
    Exercise(
        id = "u30_s3_p2_m3",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u30_s3_p2_m1", "三位", "sān wèi", "tiga orang (sopan)"),
            MatchPairItem("u30_s3_p2_m2", "两次", "liǎng cì", "dua kali"),
            MatchPairItem("u30_s3_p2_m3", "这位朋友", "zhè wèi péngyou", "sahabat ini"),
            MatchPairItem("u30_s3_p2_m4", "来过一次", "lái guo yí cì", "pernah datang 1x")
        )
    ),

    // 4. Soal 4: Ketik Pinyin (dua kali -> liǎngcì)
    Exercise(
        id = "u30_s3_p2_q4",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "dua kali",
        sentenceWithBlank = "两次 (________)",
        targetHanzi = "两次",
        targetPinyin = "liǎngcì",
        correctAnswer = "liangci",
        keyboardKeys = listOf("l", "i", "a", "n", "g", "c", "e", "o", "u", "b", "d", "h"),
        audioToSpeak = "两次"
    ),

    // 5. Soal 5: Mendengar Kalimat (Rule 10: illustrationRes = 0)
    Exercise(
        id = "u30_s3_p2_q5",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Apa yang Anda dengar?",
        targetTranslation = "Tiga orang dokter memeriksa pasien.",
        targetHanzi = "三 位 医生 给 他 看病。",
        targetPinyin = "Sān wèi yīshēng gěi tā kànbìng.",
        wordChips = listOf("三:sān", "位:wèi", "医生:yīshēng", "给:gěi", "他:tā", "看病。:kànbìng.", "个:gè"),
        correctAnswer = "三,位,医生,给,他,看病。",
        illustrationRes = 0,
        audioToSpeak = "三位医生给他看病。"
    ),

    // 6. Soal 6: Pilihan Kalimat
    Exercise(
        id = "u30_s3_p2_q6",
        type = ExerciseType.SENTENCE_CHOICE,
        title = "Pilih terjemahan yang benar",
        targetHanzi = "请问 您 是 哪 一 位？",
        targetPinyin = "Qǐngwèn nín shì nǎ yí wèi?",
        targetTranslation = "Bolehkah saya bertanya Anda dengan siapa (panggilan hormat telepon)?",
        correctAnswer = "Qǐngwèn nín shì nǎ yí wèi?\n请问 您 是 哪 一 位？",
        options = listOf(
            "Qǐngwèn nín shì nǎ yí wèi?\n请问 您 是 哪 一 位？",
            "Qǐngwèn nǐ shì shéi?\n请问 你 是 谁？",
            "Nín zài nǎlǐ?\n您 在 哪里？"
        ),
        audioToSpeak = "请问您是哪一位？"
    ),

    // 7. Soal 7: Pilihan Gambar (两位 -> dua orang terhormat)
    Exercise(
        id = "u30_s3_p2_q7",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "两位",
        targetPinyin = "liǎngwèi",
        targetTranslation = "dua orang sopan",
        correctAnswer = "dua orang sopan",
        audioToSpeak = "两位",
        pictureOptions = listOf(
            PictureOption("u30_s3_p2_opt7_1", "dua orang sopan", "", R.drawable.ic_eval_mastery_trophy, true),
            PictureOption("u30_s3_p2_opt7_2", "mall", "", R.drawable.ic_shop_mall_plaza, false),
            PictureOption("u30_s3_p2_opt7_3", "10.000", "", R.drawable.ic_fin_ten_thousand, false),
            PictureOption("u30_s3_p2_opt7_4", "cerah", "", R.drawable.ic_weather_sunny_clear, false)
        )
    ),

    // 8. Soal 8: Ketik Pinyin (dua orang sopan -> liǎngwèi)
    Exercise(
        id = "u30_s3_p2_q8",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "dua orang (sopan)",
        sentenceWithBlank = "两位 (________)",
        targetHanzi = "两位",
        targetPinyin = "liǎngwèi",
        correctAnswer = "liangwei",
        keyboardKeys = listOf("l", "i", "a", "n", "g", "w", "e", "o", "u", "b", "d", "h"),
        audioToSpeak = "两位"
    ),

    // 9. Soal 9: Susun Kalimat (Silakan kedua orang guru duduk di sini.)
    Exercise(
        id = "u30_s3_p2_q9",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Silakan kedua guru duduk.",
        targetHanzi = "两位 老师 请 坐。",
        targetPinyin = "Liǎng wèi lǎoshī qǐng zuò.",
        wordChips = listOf("两位:liǎng wèi", "老师:lǎoshī", "请:qǐng", "坐。:zuò.", "走:zǒu"),
        correctAnswer = "两位,老师,请,坐。",
        audioToSpeak = "两位老师请坐。"
    ),

    // 10. Soal 10: Ketuk Pasangan yang Sesuai (Rangkuman Panggilan Hormat)
    Exercise(
        id = "u30_s3_p2_m10",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u30_s3_p2_m10_1", "两位老师", "liǎng wèi lǎoshī", "dua orang guru"),
            MatchPairItem("u30_s3_p2_m10_2", "去了两次", "qù le liǎng cì", "sudah pergi 2x"),
            MatchPairItem("u30_s3_p2_m3", "请坐下", "qǐng zuò xià", "silakan duduk"),
            MatchPairItem("u30_s3_p2_m4", "哪一位", "nǎ yí wèi", "dengan siapa")
        )
    )
)
