package com.example.chineselearning.data.repository

import com.example.chineselearning.R
import com.example.chineselearning.data.model.Exercise
import com.example.chineselearning.data.model.ExerciseType
import com.example.chineselearning.data.model.MatchPairItem
import com.example.chineselearning.data.model.PictureOption

val bab21Stage5Part1Exercises = listOf(
    // 1. Soal 1: Pilihan Gambar (过来 -> datang kemari / mendekat)
    Exercise(
        id = "u21_s5_p1_q1",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "过来",
        targetPinyin = "guòlái",
        targetTranslation = "datang kemari / mendekat",
        correctAnswer = "datang kemari / mendekat",
        audioToSpeak = "过来",
        pictureOptions = listOf(
            PictureOption("u21_s5_p1_opt1", "datang kemari", "", R.drawable.ic_trans_come, true),
            PictureOption("u21_s5_p1_opt2", "pergi ke sana", "", R.drawable.ic_trans_go, false),
            PictureOption("u21_s5_p1_opt3", "masuk ke sini", "", R.drawable.ic_pos_in, false),
            PictureOption("u21_s5_p1_opt4", "keluar ke sana", "", R.drawable.ic_pos_out, false)
        )
    ),

    // 2. Soal 2: Susun Kalimat (Kamu kemarilah sebentar, saya ada bicara kepadamu.)
    Exercise(
        id = "u21_s5_p1_q2",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Kamu kemari, saya ada bicara.",
        targetHanzi = "你 过来， 我 有 话 对 你 说。",
        targetPinyin = "Nǐ guòlái, wǒ yǒu huà duì nǐ shuō.",
        wordChips = listOf("你:nǐ", "过来，:guòlái,", "我:wǒ", "有:yǒu", "话:huà", "对:duì", "你:nǐ", "说。:shuō.", "过去:guòqù"),
        correctAnswer = "你,过来，,我,有,话,对,你,说。",
        audioToSpeak = "你过来，我有话对你说。"
    ),

    // 3. Soal 3: Ketuk Pasangan yang Sesuai (Mendekat & Melintas Menjauh)
    Exercise(
        id = "u21_s5_p1_m3",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u21_s5_p1_m1", "过来", "guòlái", "datang kemari"),
            MatchPairItem("u21_s5_p1_m2", "过去", "guòqù", "pergi ke sana"),
            MatchPairItem("u21_s5_p1_m3", "走过去", "zǒu guòqù", "jalan menyeberang"),
            MatchPairItem("u21_s5_p1_m4", "对你说", "duì nǐ shuō", "bicara padamu")
        )
    ),

    // 4. Soal 4: Ketik Pinyin (datang kemari -> guòlái)
    Exercise(
        id = "u21_s5_p1_q4",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "datang kemari / mendekat",
        sentenceWithBlank = "过来 (________)",
        targetHanzi = "过来",
        targetPinyin = "guòlái",
        correctAnswer = "guolai",
        keyboardKeys = listOf("g", "u", "o", "l", "a", "i", "e", "b", "d", "h", "j", "m"),
        audioToSpeak = "过来"
    ),

    // 5. Soal 5: Mendengar Kalimat (Rule 10: illustrationRes = 0)
    Exercise(
        id = "u21_s5_p1_q5",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Apa yang Anda dengar?",
        targetTranslation = "Dia berjalan menyeberang ke seberang jalan.",
        targetHanzi = "他 朝 对面 走 过去 了。",
        targetPinyin = "Tā cháo duìmiàn zǒu guòqù le.",
        wordChips = listOf("他:tā", "朝:cháo", "对面:duìmiàn", "走:zǒu", "过去:guòqù", "了。:le.", "过来:guòlái"),
        correctAnswer = "他,朝,对面,走,过去,了。",
        illustrationRes = 0,
        audioToSpeak = "他朝对面走过去了。"
    ),

    // 6. Soal 6: Pilihan Kalimat
    Exercise(
        id = "u21_s5_p1_q6",
        type = ExerciseType.SENTENCE_CHOICE,
        title = "Pilih terjemahan yang benar",
        targetHanzi = "请 您 走 过来 看 一 看。",
        targetPinyin = "Qǐng nín zǒu guòlái kàn yi kàn.",
        targetTranslation = "Silakan Anda berjalan kemari melihat-lihat.",
        correctAnswer = "Qǐng nín zǒu guòlái kàn yi kàn.\n请 您 走 过来 看 一 看。",
        options = listOf(
            "Qǐng nín zǒu guòlái kàn yi kàn.\n请 您 走 过来 看 一 看。",
            "Qǐng nín zǒu guòqù kàn yi kàn.\n请 您 走 过去 看 一 看。",
            "Qǐng nín zǒu chūlái kàn yi kàn.\n请 您 走 出来 看 一 看。"
        ),
        audioToSpeak = "请您走过来求看一下。"
    ),

    // 7. Soal 7: Pilihan Gambar (过去 -> pergi ke sana)
    Exercise(
        id = "u21_s5_p1_q7",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "过去",
        targetPinyin = "guòqù",
        targetTranslation = "pergi ke sana",
        correctAnswer = "pergi ke sana",
        audioToSpeak = "过去",
        pictureOptions = listOf(
            PictureOption("u21_s5_p1_opt7_1", "pergi ke sana", "", R.drawable.ic_trans_go, true),
            PictureOption("u21_s5_p1_opt7_2", "datang kemari", "", R.drawable.ic_trans_come, false),
            PictureOption("u21_s5_p1_opt7_3", "masuk ke sini", "", R.drawable.ic_pos_in, false),
            PictureOption("u21_s5_p1_opt7_4", "keluar ke sana", "", R.drawable.ic_pos_out, false)
        )
    ),

    // 8. Soal 8: Ketik Pinyin (pergi ke sana -> guòqù)
    Exercise(
        id = "u21_s5_p1_q8",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "pergi ke sana / masa lalu",
        sentenceWithBlank = "过去 (________)",
        targetHanzi = "过去",
        targetPinyin = "guòqù",
        correctAnswer = "guoqu",
        keyboardKeys = listOf("g", "u", "o", "q", "a", "e", "i", "b", "d", "h", "j", "l"),
        audioToSpeak = "过去"
    ),

    // 9. Soal 9: Susun Kalimat (Ayo kita menyeberang jalan bersama-sama.)
    Exercise(
        id = "u21_s5_p1_q9",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Ayo kita jalan menyeberang ke sana.",
        targetHanzi = "我们 一起 走 过去 吧。",
        targetPinyin = "Wǒmen yìqǐ zǒu guòqù ba.",
        wordChips = listOf("我们:wǒmen", "一起:yìqǐ", "走:zǒu", "过去:guòqù", "吧。:ba.", "过来:guòlái"),
        correctAnswer = "我们,一起,走,过去,吧。",
        audioToSpeak = "我们一起走过去吧。"
    ),

    // 10. Soal 10: Ketuk Pasangan yang Sesuai (Rangkuman Melintas Jalan)
    Exercise(
        id = "u21_s5_p1_m10",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u21_s5_p1_m10_1", "过来", "guòlái", "datang kemari"),
            MatchPairItem("u21_s5_p1_m10_2", "过去", "guòqù", "pergi ke sana"),
            MatchPairItem("u21_s5_p1_m10_3", "马路对面", "mǎlù duìmiàn", "seberang jalan"),
            MatchPairItem("u21_s5_p1_m10_4", "看一看", "kàn yi kàn", "melihat-lihat")
        )
    )
)

val bab21Stage5Part2Exercises = listOf(
    // 1. Soal 1: Pilihan Gambar (回来 -> kembali ke sini / pulang)
    Exercise(
        id = "u21_s5_p2_q1",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "回来",
        targetPinyin = "huílái",
        targetTranslation = "kembali ke sini / pulang",
        correctAnswer = "kembali ke sini / pulang",
        audioToSpeak = "回来",
        pictureOptions = listOf(
            PictureOption("u21_s5_p2_opt1", "pulang kemari", "", R.drawable.ic_trans_return_home, true),
            PictureOption("u21_s5_p2_opt2", "pergi ke sana", "", R.drawable.ic_trans_go, false),
            PictureOption("u21_s5_p2_opt3", "masuk ke sini", "", R.drawable.ic_pos_in, false),
            PictureOption("u21_s5_p2_opt4", "keluar ke sana", "", R.drawable.ic_pos_out, false)
        )
    ),

    // 2. Soal 2: Susun Kalimat (Hari sudah gelap, ayo kita lekas pulang.)
    Exercise(
        id = "u21_s5_p2_q2",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Hari sudah gelap, lekas pulang.",
        targetHanzi = "天 黑 了， 我们 快 回去 吧。",
        targetPinyin = "Tiān hēi le, wǒmen kuài huíqù ba.",
        wordChips = listOf("天:tiān", "黑:hēi", "了，:le,", "我们:wǒmen", "快:kuài", "回去:huíqù", "吧。:ba.", "出来:chūlái"),
        correctAnswer = "天,黑,了，,我们,快,回去,吧。",
        audioToSpeak = "天黑了，我们快回去吧。"
    ),

    // 3. Soal 3: Ketuk Pasangan yang Sesuai (Pulang Kemari vs Pulang Ke Sana)
    Exercise(
        id = "u21_s5_p2_m3",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u21_s5_p2_m1", "回来", "huílái", "kembali ke sini"),
            MatchPairItem("u21_s5_p2_m2", "回去", "huíqù", "kembali ke sana"),
            MatchPairItem("u21_s5_p2_m3", "回家去", "huí jiā qù", "pulang ke rumah"),
            MatchPairItem("u21_s5_p2_m4", "天黑了", "tiān hēi le", "hari gelap")
        )
    ),

    // 4. Soal 4: Ketik Pinyin (kembali ke sini -> huílái)
    Exercise(
        id = "u21_s5_p2_q4",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "kembali ke sini / pulang",
        sentenceWithBlank = "回来 (________)",
        targetHanzi = "回来",
        targetPinyin = "huílái",
        correctAnswer = "huilai",
        keyboardKeys = listOf("h", "u", "i", "l", "a", "e", "o", "b", "d", "g", "j", "m"),
        audioToSpeak = "回来"
    ),

    // 5. Soal 5: Mendengar Kalimat (Rule 10: illustrationRes = 0)
    Exercise(
        id = "u21_s5_p2_q5",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Apa yang Anda dengar?",
        targetTranslation = "Kamu kapan pulang ke sini menjenguk kami?",
        targetHanzi = "你 什么时候 回来 看 我们？",
        targetPinyin = "Nǐ shénmeshíhou huílái kàn wǒmen?",
        wordChips = listOf("你:nǐ", "什么时候:shénmeshíhou", "回来:huílái", "看:kàn", "我们？:wǒmen?", "回去:huíqù"),
        correctAnswer = "你,什么时候,回来,看,我们？",
        illustrationRes = 0,
        audioToSpeak = "你什么时候回来看我们？"
    ),

    // 6. Soal 6: Pilihan Kalimat
    Exercise(
        id = "u21_s5_p2_q6",
        type = ExerciseType.SENTENCE_CHOICE,
        title = "Pilih terjemahan yang benar",
        targetHanzi = "爸爸 下班 回来 了。",
        targetPinyin = "Bàba xiàbān huílái le.",
        targetTranslation = "Ayah pulang kerja kembali ke rumah.",
        correctAnswer = "Bàba xiàbān huílái le.\n爸爸 下班 回来 了。",
        options = listOf(
            "Bàba xiàbān huílái le.\n爸爸 下班 回来 了。",
            "Bàba shàngbān qù le.\n爸爸 上班 去 了。",
            "Māma xiàbān huílái le.\n妈妈 下班 回来 了。"
        ),
        audioToSpeak = "爸爸下班回来了。"
    ),

    // 7. Soal 7: Pilihan Gambar (回去 -> kembali ke sana)
    Exercise(
        id = "u21_s5_p2_q7",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "回去",
        targetPinyin = "huíqù",
        targetTranslation = "kembali ke sana / pulang",
        correctAnswer = "kembali ke sana / pulang",
        audioToSpeak = "回去",
        pictureOptions = listOf(
            PictureOption("u21_s5_p2_opt7_1", "kembali ke sana", "", R.drawable.ic_trans_go, true),
            PictureOption("u21_s5_p2_opt7_2", "pulang ke sini", "", R.drawable.ic_trans_return_home, false),
            PictureOption("u21_s5_p2_opt7_3", "masuk ke sini", "", R.drawable.ic_pos_in, false),
            PictureOption("u21_s5_p2_opt7_4", "keluar ke luar", "", R.drawable.ic_pos_out, false)
        )
    ),

    // 8. Soal 8: Ketik Pinyin (kembali ke sana -> huíqù)
    Exercise(
        id = "u21_s5_p2_q8",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "kembali ke sana / pulang",
        sentenceWithBlank = "回去 (________)",
        targetHanzi = "回去",
        targetPinyin = "huíqù",
        correctAnswer = "huiqu",
        keyboardKeys = listOf("h", "u", "i", "q", "a", "e", "o", "b", "d", "g", "j", "l"),
        audioToSpeak = "回去"
    ),

    // 9. Soal 9: Susun Kalimat (Waktunya sudah larut, saya harus pulang ke sana.)
    Exercise(
        id = "u21_s5_p2_q9",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Waktu tidak pagi, saya harus pulang.",
        targetHanzi = "时间 不 早 了， 我 得 回去 了。",
        targetPinyin = "Shíjiān bù zǎo le, wǒ děi huíqù le.",
        wordChips = listOf("时间:shíjiān", "不:bù", "早:zǎo", "了，:le,", "我:wǒ", "得:děi", "回去:huíqù", "了。:le."),
        correctAnswer = "时间,不,早,了，,我,得,回去,了。",
        audioToSpeak = "时间不早了，我得回去了。"
    ),

    // 10. Soal 10: Ketuk Pasangan yang Sesuai (Grand Review Final Bab 21)
    Exercise(
        id = "u21_s5_p2_m10",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u21_s5_p2_m10_1", "回来", "huílái", "kembali kemari"),
            MatchPairItem("u21_s5_p2_m10_2", "回去", "huíqù", "kembali ke sana"),
            MatchPairItem("u21_s5_p2_m10_3", "走进来", "zǒu jìnlái", "masuk kemari"),
            MatchPairItem("u21_s5_p2_m10_4", "跑出去", "pǎo chūqù", "lari ke luar")
        )
    )
)
