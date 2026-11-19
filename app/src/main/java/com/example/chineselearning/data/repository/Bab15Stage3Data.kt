package com.example.chineselearning.data.repository

import com.example.chineselearning.R
import com.example.chineselearning.data.model.Exercise
import com.example.chineselearning.data.model.ExerciseType
import com.example.chineselearning.data.model.MatchPairItem
import com.example.chineselearning.data.model.PictureOption

val bab15Stage3Part1Exercises = listOf(
    // 1. Soal 1: Pilihan Gambar (谢谢 -> terima kasih)
    Exercise(
        id = "u15_s3_p1_q1",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "谢谢",
        targetPinyin = "xièxie",
        targetTranslation = "terima kasih",
        correctAnswer = "terima kasih",
        audioToSpeak = "谢谢",
        pictureOptions = listOf(
            PictureOption("u15_s3_p1_opt1", "terima kasih", "", R.drawable.ic_etq_thanks, true),
            PictureOption("u15_s3_p1_opt2", "maaf", "", R.drawable.ic_etq_sorry, false),
            PictureOption("u15_s3_p1_opt3", "halo", "", R.drawable.ic_comm_hello, false),
            PictureOption("u15_s3_p1_opt4", "selamat tinggal", "", R.drawable.ic_etq_goodbye, false)
        )
    ),

    // 2. Soal 2: Susun Kalimat (Terima kasih Guru Wang!)
    Exercise(
        id = "u15_s3_p1_q2",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Terima kasih Guru Wang!",
        targetHanzi = "谢谢 王 老师！",
        targetPinyin = "Xièxie Wáng lǎoshī!",
        wordChips = listOf("谢谢:xièxie", "王:Wáng", "老师！:lǎoshī!", "李:Lǐ", "再见:zàijiàn"),
        correctAnswer = "谢谢,王,老师！",
        audioToSpeak = "谢谢王老师！"
    ),

    // 3. Soal 3: Ketuk Pasangan yang Sesuai (Terima Kasih & Respons)
    Exercise(
        id = "u15_s3_p1_q3",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u15_s3_p1_m1", "谢谢", "xièxie", "terima kasih"),
            MatchPairItem("u15_s3_p1_m2", "不客气", "bú kèqi", "sama-sama / kembali"),
            MatchPairItem("u15_s3_p1_m3", "谢谢你", "xièxie nǐ", "terima kasih padamu"),
            MatchPairItem("u15_s3_p1_m4", "太谢谢了", "tài xièxie le", "terima kasih banyak")
        )
    ),

    // 4. Soal 4: Ketik Pinyin (terima kasih -> xièxie)
    Exercise(
        id = "u15_s3_p1_q4",
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
        id = "u15_s3_p1_q5",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Apa yang Anda dengar?",
        targetTranslation = "Sama-sama, jangan sungkan.",
        targetHanzi = "不 客气。",
        targetPinyin = "Bú kèqi.",
        wordChips = listOf("不:bú", "客气:kèqi", "客气。:kèqi.", "谢谢:xièxie", "对不起:duìbuqǐ"),
        correctAnswer = "不,客气。",
        illustrationRes = 0,
        audioToSpeak = "不客气。"
    ),

    // 6. Soal 6: Pilihan Kalimat
    Exercise(
        id = "u15_s3_p1_q6",
        type = ExerciseType.SENTENCE_CHOICE,
        title = "Pilih terjemahan yang benar",
        targetHanzi = "谢谢 你 的 帮助。 不客气。",
        targetPinyin = "Xièxie nǐ de bāngzhù. Bú kèqi.",
        targetTranslation = "Terima kasih bantuanmu. Sama-sama.",
        correctAnswer = "Xièxie nǐ de bāngzhù. Bú kèqi.\n谢谢 你 的 帮助。 不客气。",
        options = listOf(
            "Xièxie nǐ de bāngzhù. Bú kèqi.\n谢谢 你 的 帮助。 不客气。",
            "Duìbuqǐ! Méi guānxi.\n对不起！ 没 关系。",
            "Nǐhǎo! Zàijiàn.\n你好！ 再见。"
        ),
        audioToSpeak = "谢谢你的帮助。不客气。"
    ),

    // 7. Soal 7: Pilihan Gambar (不客气 -> sama-sama)
    Exercise(
        id = "u15_s3_p1_q7",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "不客气",
        targetPinyin = "bú kèqi",
        targetTranslation = "sama-sama",
        correctAnswer = "sama-sama",
        audioToSpeak = "不客气",
        pictureOptions = listOf(
            PictureOption("u15_s3_p1_opt7_1", "sama-sama", "", R.drawable.ic_etq_welcome, true),
            PictureOption("u15_s3_p1_opt7_2", "terima kasih", "", R.drawable.ic_etq_thanks, false),
            PictureOption("u15_s3_p1_opt7_3", "maaf", "", R.drawable.ic_etq_sorry, false),
            PictureOption("u15_s3_p1_opt7_4", "halo", "", R.drawable.ic_comm_hello, false)
        )
    ),

    // 8. Soal 8: Ketik Pinyin (sama-sama -> búkèqi)
    Exercise(
        id = "u15_s3_p1_q8",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "sama-sama / kembali",
        sentenceWithBlank = "不客气 (________)",
        targetHanzi = "不客气",
        targetPinyin = "búkèqi",
        correctAnswer = "bukeqi",
        keyboardKeys = listOf("b", "u", "k", "e", "q", "i", "a", "o", "d", "g", "h"),
        audioToSpeak = "不客气"
    ),

    // 9. Soal 9: Susun Kalimat (Terima kasih semua!)
    Exercise(
        id = "u15_s3_p1_q9",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Terima kasih semuanya!",
        targetHanzi = "谢谢 大家！",
        targetPinyin = "Xièxie dàjiā!",
        wordChips = listOf("谢谢:xièxie", "大家！:dàjiā!", "老师:lǎoshī", "朋友:péngyou"),
        correctAnswer = "谢谢,大家！",
        audioToSpeak = "谢谢大家！"
    ),

    // 10. Soal 10: Ketuk Pasangan yang Sesuai (Rangkuman Terima Kasih)
    Exercise(
        id = "u15_s3_p1_m10_1",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u15_s3_p1_m10_1", "谢谢", "xièxie", "terima kasih"),
            MatchPairItem("u15_s3_p1_m10_2", "不客气", "bú kèqi", "sama-sama"),
            MatchPairItem("u15_s3_p1_m10_3", "谢谢大家", "xièxie dàjiā", "terima kasih semua"),
            MatchPairItem("u15_s3_p1_m10_4", "非常感谢", "fēicháng gǎnxiè", "sangat terima kasih")
        )
    )
)

val bab15Stage3Part2Exercises = listOf(
    // 1. Soal 1: Pilihan Gambar (对不起 -> maaf)
    Exercise(
        id = "u15_s3_p2_q1",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "对不起",
        targetPinyin = "duìbuqǐ",
        targetTranslation = "maaf",
        correctAnswer = "maaf",
        audioToSpeak = "对不起",
        pictureOptions = listOf(
            PictureOption("u15_s3_p2_opt1", "maaf", "", R.drawable.ic_etq_sorry, true),
            PictureOption("u15_s3_p2_opt2", "terima kasih", "", R.drawable.ic_etq_thanks, false),
            PictureOption("u15_s3_p2_opt3", "halo", "", R.drawable.ic_comm_hello, false),
            PictureOption("u15_s3_p2_opt4", "selamat tinggal", "", R.drawable.ic_etq_goodbye, false)
        )
    ),

    // 2. Soal 2: Susun Kalimat (Maaf, saya terlambat.)
    Exercise(
        id = "u15_s3_p2_q2",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Maaf, saya datang terlambat.",
        targetHanzi = "对不起， 我 来 晚 了。",
        targetPinyin = "Duìbuqǐ, wǒ lái wǎn le.",
        wordChips = listOf("对不起，:duìbuqǐ,", "我:wǒ", "来:lái", "晚:wǎn", "了。:le.", "没关系:méi guānxi"),
        correctAnswer = "对不起，,我,来,晚,了。",
        audioToSpeak = "对不起，我来晚了。"
    ),

    // 3. Soal 3: Ketuk Pasangan yang Sesuai (Permintaan Maaf)
    Exercise(
        id = "u15_s3_p2_m3",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u15_s3_p2_m1", "对不起", "duìbuqǐ", "maaf"),
            MatchPairItem("u15_s3_p2_m2", "没关系", "méi guānxi", "tidak apa-apa"),
            MatchPairItem("u15_s3_p2_m3", "没事", "méishì", "tidak masalah"),
            MatchPairItem("u15_s3_p2_m4", "我来晚了", "wǒ lái wǎn le", "saya datang telat")
        )
    ),

    // 4. Soal 4: Ketik Pinyin (maaf -> duìbuqǐ)
    Exercise(
        id = "u15_s3_p2_q4",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "maaf",
        sentenceWithBlank = "对不起 (________)",
        targetHanzi = "对不起",
        targetPinyin = "duìbuqǐ",
        correctAnswer = "duibuqi",
        keyboardKeys = listOf("d", "u", "i", "b", "q", "a", "e", "o", "g", "h", "j"),
        audioToSpeak = "对不起"
    ),

    // 5. Soal 5: Mendengar Kalimat (Rule 10: illustrationRes = 0)
    Exercise(
        id = "u15_s3_p2_q5",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Apa yang Anda dengar?",
        targetTranslation = "Maaf! - Tidak apa-apa.",
        targetHanzi = "对不起！ 没关系。",
        targetPinyin = "Duìbuqǐ! Méi guānxi.",
        wordChips = listOf("对不起！:duìbuqǐ!", "没关系。:méi guānxi.", "谢谢:xièxie", "不客气:bú kèqi"),
        correctAnswer = "对不起！,没关系。",
        illustrationRes = 0,
        audioToSpeak = "对不起！没关系。"
    ),

    // 6. Soal 6: Pilihan Kalimat
    Exercise(
        id = "u15_s3_p2_q6",
        type = ExerciseType.SENTENCE_CHOICE,
        title = "Pilih terjemahan yang benar",
        targetHanzi = "没关系， 没事 的。",
        targetPinyin = "Méi guānxi, méishì de.",
        targetTranslation = "Tidak apa-apa, tidak masalah.",
        correctAnswer = "Méi guānxi, méishì de.\n没关系， 没事 的。",
        options = listOf(
            "Méi guānxi, méishì de.\n没关系， 没事 的。",
            "Duìbuqǐ, méishì de.\n对不起， 没事 的。",
            "Xièxie, bú kèqi.\n谢谢， 不 客气。"
        ),
        audioToSpeak = "没关系，没事的。"
    ),

    // 7. Soal 7: Pilihan Gambar (没关系 -> tidak apa-apa)
    Exercise(
        id = "u15_s3_p2_q7",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "没关系",
        targetPinyin = "méi guānxi",
        targetTranslation = "tidak apa-apa",
        correctAnswer = "tidak apa-apa",
        audioToSpeak = "没关系",
        pictureOptions = listOf(
            PictureOption("u15_s3_p2_opt7_1", "tidak apa-apa", "", R.drawable.ic_etq_no_problem, true),
            PictureOption("u15_s3_p2_opt7_2", "maaf", "", R.drawable.ic_etq_sorry, false),
            PictureOption("u15_s3_p2_opt7_3", "terima kasih", "", R.drawable.ic_etq_thanks, false),
            PictureOption("u15_s3_p2_opt7_4", "halo", "", R.drawable.ic_comm_hello, false)
        )
    ),

    // 8. Soal 8: Ketik Pinyin (tidak apa-apa -> méiguānxi)
    Exercise(
        id = "u15_s3_p2_q8",
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

    // 9. Soal 9: Susun Kalimat (Maaf, saya tidak tahu.)
    Exercise(
        id = "u15_s3_p2_q9",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Maaf, saya tidak tahu.",
        targetHanzi = "对不起， 我 不 知道。",
        targetPinyin = "Duìbuqǐ, wǒ bù zhīdào.",
        wordChips = listOf("对不起，:duìbuqǐ,", "我:wǒ", "不:bù", "知道。:zhīdào.", "知道:zhīdào"),
        correctAnswer = "对不起，,我,不,知道。",
        audioToSpeak = "对不起，我不知道。"
    ),

    // 10. Soal 10: Ketuk Pasangan yang Sesuai (Rangkuman Maaf & Respon)
    Exercise(
        id = "u15_s3_p2_m10_1",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u15_s3_p2_m10_1", "对不起", "duìbuqǐ", "maaf"),
            MatchPairItem("u15_s3_p2_m10_2", "没关系", "méi guānxi", "tidak apa-apa"),
            MatchPairItem("u15_s3_p2_m10_3", "不知道", "bù zhīdào", "tidak tahu"),
            MatchPairItem("u15_s3_p2_m10_4", "没事", "méishì", "tidak ada masalah")
        )
    )
)
