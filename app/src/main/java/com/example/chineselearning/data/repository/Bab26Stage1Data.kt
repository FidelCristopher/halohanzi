package com.example.chineselearning.data.repository

import com.example.chineselearning.R
import com.example.chineselearning.data.model.Exercise
import com.example.chineselearning.data.model.ExerciseType
import com.example.chineselearning.data.model.MatchPairItem
import com.example.chineselearning.data.model.PictureOption

val bab26Stage1Part1Exercises = listOf(
    // 1. Soal 1: Pilihan Gambar (疼 -> sakit / nyeri)
    Exercise(
        id = "u26_s1_p1_q1",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "疼",
        targetPinyin = "téng",
        targetTranslation = "sakit / nyeri",
        correctAnswer = "sakit / nyeri",
        audioToSpeak = "疼",
        pictureOptions = listOf(
            PictureOption("u26_s1_p1_opt1", "sakit", "", R.drawable.ic_med_headache, true),
            PictureOption("u26_s1_p1_opt2", "nyaman", "", R.drawable.ic_med_comfort_healthy, false),
            PictureOption("u26_s1_p1_opt3", "obat", "", R.drawable.ic_med_pharmacy_drug, false),
            PictureOption("u26_s1_p1_opt4", "ranjang", "", R.drawable.ic_med_bed_rest, false)
        )
    ),

    // 2. Soal 2: Susun Kalimat (Kepala saya agak sakit, ingin tidur sebentar.)
    Exercise(
        id = "u26_s1_p1_q2",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Kepala saya agak sakit, mau tidur.",
        targetHanzi = "我 头 有点 疼， 想 睡 一会儿。",
        targetPinyin = "Wǒ tóu yǒudiǎn téng, xiǎng shuì yíhuìér.",
        wordChips = listOf("我:wǒ", "头:tóu", "有点:yǒudiǎn", "疼，:téng,", "想:xiǎng", "睡:shuì", "一会儿。:yíhuìér.", "好:hǎo"),
        correctAnswer = "我,头,有点,疼，,想,睡,一会儿。",
        audioToSpeak = "我头有点疼，想睡一会儿。"
    ),

    // 3. Soal 3: Ketuk Pasangan yang Sesuai (Kepala & Nyeri)
    Exercise(
        id = "u26_s1_p1_q3",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u26_s1_p1_m1", "头", "tóu", "kepala"),
            MatchPairItem("u26_s1_p1_m2", "疼", "téng", "sakit / nyeri"),
            MatchPairItem("u26_s1_p1_m3", "头疼", "tóuténg", "sakit kepala"),
            MatchPairItem("u26_s1_p1_m4", "睡一会儿", "shuì yíhuìér", "tidur sejenak")
        )
    ),

    // 4. Soal 4: Ketik Pinyin (sakit/nyeri -> téng)
    Exercise(
        id = "u26_s1_p1_q4",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "sakit / nyeri",
        sentenceWithBlank = "疼 (________)",
        targetHanzi = "疼",
        targetPinyin = "téng",
        correctAnswer = "teng",
        keyboardKeys = listOf("t", "e", "n", "g", "a", "i", "o", "u", "b", "d", "h", "j"),
        audioToSpeak = "疼"
    ),

    // 5. Soal 5: Mendengar Kalimat (Rule 10: illustrationRes = 0)
    Exercise(
        id = "u26_s1_p1_q5",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Apa yang Anda dengar?",
        targetTranslation = "Makan terlalu banyak es krim, perut sangat sakit.",
        targetHanzi = "吃 太多 冰淇淋， 肚子 很 疼。",
        targetPinyin = "Chī tài duō bīngqílín, dùzi hěn téng.",
        wordChips = listOf("吃:chī", "太多:tài duō", "冰淇淋，:bīngqílín,", "肚子:dùzi", "很:hěn", "疼。:téng.", "舒服:shūfu"),
        correctAnswer = "吃,太多,冰淇淋，,肚子,很,疼。",
        illustrationRes = 0,
        audioToSpeak = "吃太多冰淇淋，肚子很疼。"
    ),

    // 6. Soal 6: Pilihan Kalimat
    Exercise(
        id = "u26_s1_p1_q6",
        type = ExerciseType.SENTENCE_CHOICE,
        title = "Pilih terjemahan yang benar",
        targetHanzi = "你 哪里 觉得 疼？",
        targetPinyin = "Nǐ nǎlǐ juéde téng?",
        targetTranslation = "Di bagian mana Anda merasa sakit?",
        correctAnswer = "Nǐ nǎlǐ juéde téng?\n你 哪里 觉得 疼？",
        options = listOf(
            "Nǐ nǎlǐ juéde téng?\n你 哪里 觉得 疼？",
            "Nǐ nǎlǐ juéde shūfu?\n你 哪里 觉得 舒服？",
            "Tā nǎlǐ juéde téng?\n他 哪里 觉得 疼？"
        ),
        audioToSpeak = "你哪里觉得疼？"
    ),

    // 7. Soal 7: Pilihan Gambar (头 -> kepala)
    Exercise(
        id = "u26_s1_p1_q7",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "头",
        targetPinyin = "tóu",
        targetTranslation = "kepala",
        correctAnswer = "kepala",
        audioToSpeak = "头",
        pictureOptions = listOf(
            PictureOption("u26_s1_p1_opt7_1", "kepala", "", R.drawable.ic_med_headache, true),
            PictureOption("u26_s1_p1_opt7_2", "tidur", "", R.drawable.ic_med_rest_sleep, false),
            PictureOption("u26_s1_p1_opt7_3", "obat", "", R.drawable.ic_med_pharmacy_drug, false),
            PictureOption("u26_s1_p1_opt7_4", "sehat", "", R.drawable.ic_med_comfort_healthy, false)
        )
    ),

    // 8. Soal 8: Ketik Pinyin (kepala -> tóu)
    Exercise(
        id = "u26_s1_p1_q8",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "kepala",
        sentenceWithBlank = "头 (________)",
        targetHanzi = "头",
        targetPinyin = "tóu",
        correctAnswer = "tou",
        keyboardKeys = listOf("t", "o", "u", "a", "e", "i", "b", "d", "g", "h", "j", "l"),
        audioToSpeak = "头"
    ),

    // 9. Soal 9: Susun Kalimat (Kaki saya sakit tidak bisa berjalan.)
    Exercise(
        id = "u26_s1_p1_q9",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Kaki saya sakit tidak bisa jalan.",
        targetHanzi = "我 脚 疼， 不 能 走。",
        targetPinyin = "Wǒ jiǎo téng, bù néng zǒu.",
        wordChips = listOf("我:wǒ", "脚:jiǎo", "疼，:téng,", "不:bù", "能:néng", "走。:zǒu.", "跑:pǎo"),
        correctAnswer = "我,脚,疼，,不,能,走。",
        audioToSpeak = "我脚疼，不能走。"
    ),

    // 10. Soal 10: Ketuk Pasangan yang Sesuai (Rangkuman Keluhan Sakit)
    Exercise(
        id = "u26_s1_p1_m10",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u26_s1_p1_m10_1", "头", "tóu", "kepala"),
            MatchPairItem("u26_s1_p1_m10_2", "疼", "téng", "nyeri"),
            MatchPairItem("u26_s1_p1_m10_3", "脚疼", "jiǎo téng", "sakit kaki"),
            MatchPairItem("u26_s1_p1_m10_4", "肚子疼", "dùzi téng", "sakit perut")
        )
    )
)

val bab26Stage1Part2Exercises = listOf(
    // 1. Soal 1: Pilihan Gambar (舒服 -> nyaman / enak badan)
    Exercise(
        id = "u26_s1_p2_q1",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "舒服",
        targetPinyin = "shūfu",
        targetTranslation = "nyaman / enak badan",
        correctAnswer = "nyaman / enak badan",
        audioToSpeak = "舒服",
        pictureOptions = listOf(
            PictureOption("u26_s1_p2_opt1", "nyaman", "", R.drawable.ic_med_comfort_healthy, true),
            PictureOption("u26_s1_p2_opt2", "sakit kepala", "", R.drawable.ic_med_headache, false),
            PictureOption("u26_s1_p2_opt3", "demam", "", R.drawable.ic_med_thermometer_fever, false),
            PictureOption("u26_s1_p2_opt4", "obat", "", R.drawable.ic_med_pharmacy_drug, false)
        )
    ),

    // 2. Soal 2: Susun Kalimat (Hari ini badan saya merasa kurang enak.)
    Exercise(
        id = "u26_s1_p2_q2",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Hari ini tubuh saya kurang enak.",
        targetHanzi = "今天 我 身体 不 舒服。",
        targetPinyin = "Jīntiān wǒ shēntǐ bù shūfu.",
        wordChips = listOf("今天:jīntiān", "我:wǒ", "身体:shēntǐ", "不:bù", "舒服。:shūfu.", "很:hěn"),
        correctAnswer = "今天,我,身体,不,舒服。",
        audioToSpeak = "今天我身体不舒服。"
    ),

    // 3. Soal 3: Ketuk Pasangan yang Sesuai (Kenyamanan Tubuh)
    Exercise(
        id = "u26_s1_p2_m3",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u26_s1_p2_m1", "舒服", "shūfu", "nyaman / enak badan"),
            MatchPairItem("u26_s1_p2_m2", "不舒服", "bù shūfu", "kurang enak badan"),
            MatchPairItem("u26_s1_p2_m3", "很舒服", "hěn shūfu", "sangat nyaman"),
            MatchPairItem("u26_s1_p2_m4", "睡得舒服", "shuì de shūfu", "tidur nyenyak")
        )
    ),

    // 4. Soal 4: Ketik Pinyin (nyaman -> shūfu)
    Exercise(
        id = "u26_s1_p2_q4",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "nyaman / enak badan",
        sentenceWithBlank = "舒服 (________)",
        targetHanzi = "舒服",
        targetPinyin = "shūfu",
        correctAnswer = "shufu",
        keyboardKeys = listOf("s", "h", "u", "f", "a", "e", "i", "o", "b", "d", "g", "j"),
        audioToSpeak = "舒服"
    ),

    // 5. Soal 5: Mendengar Kalimat (Rule 10: illustrationRes = 0)
    Exercise(
        id = "u26_s1_p2_q5",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Apa yang Anda dengar?",
        targetTranslation = "Duduk membaca buku di sofa sangat nyaman.",
        targetHanzi = "坐 着 看书 非常 舒服。",
        targetPinyin = "Zuò zhe kànshū fēicháng shūfu.",
        wordChips = listOf("坐:zuò", "着:zhe", "看书:kànshū", "非常:fēicháng", "舒服。:shūfu.", "累:lèi"),
        correctAnswer = "坐,着,看书,非常,舒服。",
        illustrationRes = 0,
        audioToSpeak = "坐着看书非常舒服。"
    ),

    // 6. Soal 6: Pilihan Kalimat
    Exercise(
        id = "u26_s1_p2_q6",
        type = ExerciseType.SENTENCE_CHOICE,
        title = "Pilih terjemahan yang benar",
        targetHanzi = "喝 了 热水， 觉得 舒服 多 了。",
        targetPinyin = "Hē le rèshuǐ, juéde shūfu duō le.",
        targetTranslation = "Minum air hangat, terasa jauh lebih nyaman.",
        correctAnswer = "Hē le rèshuǐ, juéde shūfu duō le.\n喝 了 热水， 觉得 舒服 多 了。",
        options = listOf(
            "Hē le rèshuǐ, juéde shūfu duō le.\n喝 了 热水， 觉得 舒服 多 了。",
            "Hē le lěngshuǐ, juéde shūfu duō le.\n喝 了 冷水， 觉得 舒服 多 了。",
            "Hē le rèchá, juéde bù shūfu.\n喝 了 热茶， 觉得 不 舒服。"
        ),
        audioToSpeak = "喝了热水，觉得舒服多了。"
    ),

    // 7. Soal 7: Pilihan Gambar (不舒服 -> kurang enak badan)
    Exercise(
        id = "u26_s1_p2_q7",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "不舒服",
        targetPinyin = "bù shūfu",
        targetTranslation = "kurang enak badan",
        correctAnswer = "kurang enak badan",
        audioToSpeak = "不舒服",
        pictureOptions = listOf(
            PictureOption("u26_s1_p2_opt7_1", "kurang enak badan", "", R.drawable.ic_med_headache, true),
            PictureOption("u26_s1_p2_opt7_2", "sehat", "", R.drawable.ic_med_comfort_healthy, false),
            PictureOption("u26_s1_p2_opt7_3", "ranjang", "", R.drawable.ic_med_bed_rest, false),
            PictureOption("u26_s1_p2_opt7_4", "obat", "", R.drawable.ic_med_pharmacy_drug, false)
        )
    ),

    // 8. Soal 8: Ketik Pinyin (sakit kepala -> tóuténg)
    Exercise(
        id = "u26_s1_p2_q8",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "sakit kepala",
        sentenceWithBlank = "头疼 (________)",
        targetHanzi = "头疼",
        targetPinyin = "tóuténg",
        correctAnswer = "touteng",
        keyboardKeys = listOf("t", "o", "u", "e", "n", "g", "a", "i", "b", "d", "h", "j"),
        audioToSpeak = "头疼"
    ),

    // 9. Soal 9: Susun Kalimat (Hari ini saya tidak enak badan, minta izin tidak masuk sekolah.)
    Exercise(
        id = "u26_s1_p2_q9",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Saya tidak enak badan, tidak masuk sekolah.",
        targetHanzi = "我 不 舒服， 不 来 学校。",
        targetPinyin = "Wǒ bù shūfu, bù lái xuéxiào.",
        wordChips = listOf("我:wǒ", "不:bù", "舒服，:shūfu,", "不:bù", "来:lái", "学校。:xuéxiào.", "去:qù"),
        correctAnswer = "我,不,舒服，,不,来,学校。",
        audioToSpeak = "我不舒服，不来学校。"
    ),

    // 10. Soal 10: Ketuk Pasangan yang Sesuai (Rangkuman Gejala Fisik)
    Exercise(
        id = "u26_s1_p2_m10",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u26_s1_p2_m10_1", "舒服", "shūfu", "nyaman"),
            MatchPairItem("u26_s1_p2_m10_2", "头疼", "tóuténg", "pusing kepala"),
            MatchPairItem("u26_s1_p2_m10_3", "喝热水", "hē rèshuǐ", "minum air hangat"),
            MatchPairItem("u26_s1_p2_m10_4", "不来学校", "bù lái xuéxiào", "tidak ke sekolah")
        )
    )
)
