package com.example.chineselearning.data.repository

import com.example.chineselearning.R
import com.example.chineselearning.data.model.Exercise
import com.example.chineselearning.data.model.ExerciseType
import com.example.chineselearning.data.model.MatchPairItem
import com.example.chineselearning.data.model.PictureOption

val bab18Stage3Part1Exercises = listOf(
    // 1. Soal 1: Pilihan Gambar (高 -> tinggi)
    Exercise(
        id = "u18_s3_p1_q1",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "高",
        targetPinyin = "gāo",
        targetTranslation = "tinggi",
        correctAnswer = "tinggi",
        audioToSpeak = "高",
        pictureOptions = listOf(
            PictureOption("u18_s3_p1_opt1", "tinggi", "", R.drawable.ic_work_gentleman, true),
            PictureOption("u18_s3_p1_opt2", "anak kecil", "", R.drawable.ic_fam_child, false),
            PictureOption("u18_s3_p1_opt3", "jam tangan", "", R.drawable.ic_clock_analog, false),
            PictureOption("u18_s3_p1_opt4", "tas", "", R.drawable.ic_shop_goods, false)
        )
    ),

    // 2. Soal 2: Susun Kalimat (Tinggi badannya sangat tinggi.)
    Exercise(
        id = "u18_s3_p1_q2",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Tinggi badannya sangat tinggi.",
        targetHanzi = "他 的 个子 很 高。",
        targetPinyin = "Tā de gèzi hěn gāo.",
        wordChips = listOf("他:tā", "的:de", "个子:gèzi", "很:hěn", "高。:gāo.", "矮:ǎi"),
        correctAnswer = "他,的,个子,很,高。",
        audioToSpeak = "他的个子很高。"
    ),

    // 3. Soal 3: Ketuk Pasangan yang Sesuai (Postur & Tinggi)
    Exercise(
        id = "u18_s3_p1_q3",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u18_s3_p1_m1", "个子", "gèzi", "tinggi badan / postur"),
            MatchPairItem("u18_s3_p1_m2", "高", "gāo", "tinggi"),
            MatchPairItem("u18_s3_p1_m3", "很高", "hěn gāo", "sangat tinggi"),
            MatchPairItem("u18_s3_p1_m4", "哥哥", "gēge", "kakak laki-laki")
        )
    ),

    // 4. Soal 4: Ketik Pinyin (postur/tinggi badan -> gèzi)
    Exercise(
        id = "u18_s3_p1_q4",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "tinggi badan / postur",
        sentenceWithBlank = "个子 (________)",
        targetHanzi = "个子",
        targetPinyin = "gèzi",
        correctAnswer = "gezi",
        keyboardKeys = listOf("g", "e", "z", "i", "a", "o", "u", "b", "d", "h", "j", "l"),
        audioToSpeak = "个子"
    ),

    // 5. Soal 5: Mendengar Kalimat (Rule 10: illustrationRes = 0)
    Exercise(
        id = "u18_s3_p1_q5",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Apa yang Anda dengar?",
        targetTranslation = "Adik laki-laki tumbuh sangat tinggi.",
        targetHanzi = "弟弟 长 得 很 高。",
        targetPinyin = "Dìdi zhǎng de hěn gāo.",
        wordChips = listOf("弟弟:dìdi", "长:zhǎng", "得:de", "很:hěn", "高。:gāo.", "哥哥:gēge"),
        correctAnswer = "弟弟,长,得,很,高。",
        illustrationRes = 0,
        audioToSpeak = "弟弟长得很高。"
    ),

    // 6. Soal 6: Pilihan Kalimat
    Exercise(
        id = "u18_s3_p1_q6",
        type = ExerciseType.SENTENCE_CHOICE,
        title = "Pilih terjemahan yang benar",
        targetHanzi = "姚明 的 个子 非常 高。",
        targetPinyin = "Yáo Míng de gèzi fēicháng gāo.",
        targetTranslation = "Postur badan Yao Ming sangat tinggi.",
        correctAnswer = "Yáo Míng de gèzi fēicháng gāo.\n姚明 的 个子 非常 高。",
        options = listOf(
            "Yáo Míng de gèzi fēicháng gāo.\n姚明 的 个子 非常 高。",
            "Yáo Míng de gèzi bú gāo.\n姚明 的 个子 不 高。",
            "Wǒ de gèzi fēicháng gāo.\n我 的 个子 非常 高。"
        ),
        audioToSpeak = "姚明的个子非常高。"
    ),

    // 7. Soal 7: Pilihan Gambar (个子 -> postur tubuh)
    Exercise(
        id = "u18_s3_p1_q7",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "个子",
        targetPinyin = "gèzi",
        targetTranslation = "tinggi badan",
        correctAnswer = "tinggi badan",
        audioToSpeak = "个子",
        pictureOptions = listOf(
            PictureOption("u18_s3_p1_opt7_1", "tinggi badan", "", R.drawable.ic_work_gentleman, true),
            PictureOption("u18_s3_p1_opt7_2", "bocah", "", R.drawable.ic_fam_child, false),
            PictureOption("u18_s3_p1_opt7_3", "celana", "", R.drawable.ic_shop_clothes, false),
            PictureOption("u18_s3_p1_opt7_4", "tas", "", R.drawable.ic_shop_goods, false)
        )
    ),

    // 8. Soal 8: Ketik Pinyin (tinggi -> gāo)
    Exercise(
        id = "u18_s3_p1_q8",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "tinggi",
        sentenceWithBlank = "高 (________)",
        targetHanzi = "高",
        targetPinyin = "gāo",
        correctAnswer = "gao",
        keyboardKeys = listOf("g", "a", "o", "e", "i", "u", "b", "d", "h", "j", "l", "m"),
        audioToSpeak = "高"
    ),

    // 9. Soal 9: Susun Kalimat (Pemain bola basket itu sangat tinggi.)
    Exercise(
        id = "u18_s3_p1_q9",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Pemain basket itu sangat tinggi.",
        targetHanzi = "那个 篮球 运动员 很 高。",
        targetPinyin = "Nàge lánqiú yùndòngyuán hěn gāo.",
        wordChips = listOf("那个:nàge", "篮球:lánqiú", "运动员:yùndòngyuán", "很:hěn", "高。:gāo.", "矮:ǎi"),
        correctAnswer = "那个,篮球,运动员,很,高。",
        audioToSpeak = "那个篮球运动员很高。"
    ),

    // 10. Soal 10: Ketuk Pasangan yang Sesuai (Rangkuman Postur)
    Exercise(
        id = "u18_s3_p1_m10",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u18_s3_p1_m10_1", "个子", "gèzi", "postur tubuh"),
            MatchPairItem("u18_s3_p1_m10_2", "高", "gāo", "tinggi"),
            MatchPairItem("u18_s3_p1_m10_3", "篮球", "lánqiú", "bola basket"),
            MatchPairItem("u18_s3_p1_m10_4", "弟弟", "dìdi", "adik laki-laki")
        )
    )
)

val bab18Stage3Part2Exercises = listOf(
    // 1. Soal 1: Pilihan Gambar (长 -> panjang)
    Exercise(
        id = "u18_s3_p2_q1",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "长",
        targetPinyin = "cháng",
        targetTranslation = "panjang",
        correctAnswer = "panjang",
        audioToSpeak = "长",
        pictureOptions = listOf(
            PictureOption("u18_s3_p2_opt1", "panjang", "", R.drawable.ic_shop_clothes, true),
            PictureOption("u18_s3_p2_opt2", "jam tangan", "", R.drawable.ic_clock_analog, false),
            PictureOption("u18_s3_p2_opt3", "tas", "", R.drawable.ic_shop_goods, false),
            PictureOption("u18_s3_p2_opt4", "orang", "", R.drawable.ic_person_saya, false)
        )
    ),

    // 2. Soal 2: Susun Kalimat (Rambut adik perempuan sangat panjang.)
    Exercise(
        id = "u18_s3_p2_q2",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Rambut adik perempuan sangat panjang.",
        targetHanzi = "妹妹 的 头发 很 长。",
        targetPinyin = "Mèimei de tóufa hěn cháng.",
        wordChips = listOf("妹妹:mèimei", "的:de", "头发:tóufa", "很:hěn", "长。:cháng.", "短:duǎn"),
        correctAnswer = "妹妹,的,头发,很,长。",
        audioToSpeak = "妹妹的头发很长。"
    ),

    // 3. Soal 3: Ketuk Pasangan yang Sesuai (Panjang & Ciri Fisik)
    Exercise(
        id = "u18_s3_p2_m3",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u18_s3_p2_m1", "长", "cháng", "panjang"),
            MatchPairItem("u18_s3_p2_m2", "头发", "tóufa", "rambut"),
            MatchPairItem("u18_s3_p2_m3", "妹妹", "mèimei", "adik perempuan"),
            MatchPairItem("u18_s3_p2_m4", "很长", "hěn cháng", "sangat panjang")
        )
    ),

    // 4. Soal 4: Ketik Pinyin (panjang -> cháng)
    Exercise(
        id = "u18_s3_p2_q4",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "panjang",
        sentenceWithBlank = "长 (________)",
        targetHanzi = "长",
        targetPinyin = "cháng",
        correctAnswer = "chang",
        keyboardKeys = listOf("c", "h", "a", "n", "g", "e", "i", "o", "u", "b", "d", "j"),
        audioToSpeak = "长"
    ),

    // 5. Soal 5: Mendengar Kalimat (Rule 10: illustrationRes = 0)
    Exercise(
        id = "u18_s3_p2_q5",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Apa yang Anda dengar?",
        targetTranslation = "Jalan ini sangat panjang.",
        targetHanzi = "这 条 路 很 长。",
        targetPinyin = "Zhè tiáo lù hěn cháng.",
        wordChips = listOf("这:zhè", "条:tiáo", "路:lù", "很:hěn", "长。:cháng.", "远:yuǎn"),
        correctAnswer = "这,条,路,很,长。",
        illustrationRes = 0,
        audioToSpeak = "这条路很长。"
    ),

    // 6. Soal 6: Pilihan Kalimat
    Exercise(
        id = "u18_s3_p2_q6",
        type = ExerciseType.SENTENCE_CHOICE,
        title = "Pilih terjemahan yang benar",
        targetHanzi = "她 有 一 头 长 头发。",
        targetPinyin = "Tā yǒu yì tóu cháng tóufa.",
        targetTranslation = "Dia memiliki rambut yang panjang.",
        correctAnswer = "Tā yǒu yì tóu cháng tóufa.\n她 有 一 头 长 头发。",
        options = listOf(
            "Tā yǒu yì tóu cháng tóufa.\n她 有 一 头 长 头发。",
            "Tā yǒu yì tóu duǎn tóufa.\n她 有 一 头 短 头发。",
            "Wǒ yǒu yì tóu cháng tóufa.\n我 有 一 头 长 头发。"
        ),
        audioToSpeak = "她有一头长头发。"
    ),

    // 7. Soal 7: Pilihan Gambar (长 -> panjang)
    Exercise(
        id = "u18_s3_p2_q7",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "长",
        targetPinyin = "cháng",
        targetTranslation = "panjang",
        correctAnswer = "panjang",
        audioToSpeak = "长",
        pictureOptions = listOf(
            PictureOption("u18_s3_p2_opt7_1", "panjang", "", R.drawable.ic_shop_clothes, true),
            PictureOption("u18_s3_p2_opt7_2", "baju", "", R.drawable.ic_shop_piece_clothes, false),
            PictureOption("u18_s3_p2_opt7_3", "jam tangan", "", R.drawable.ic_clock_analog, false),
            PictureOption("u18_s3_p2_opt7_4", "tas", "", R.drawable.ic_shop_goods, false)
        )
    ),

    // 8. Soal 8: Ketik Pinyin (panjang -> cháng)
    Exercise(
        id = "u18_s3_p2_q8",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "panjang",
        sentenceWithBlank = "长 (________)",
        targetHanzi = "长",
        targetPinyin = "cháng",
        correctAnswer = "chang",
        keyboardKeys = listOf("c", "h", "a", "n", "g", "e", "i", "o", "u", "b", "d", "j"),
        audioToSpeak = "长"
    ),

    // 9. Soal 9: Susun Kalimat (Waktu yang dibutuhkan sangat panjang.)
    Exercise(
        id = "u18_s3_p2_q9",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Waktu yang dipakai sangat panjang.",
        targetHanzi = "时间 过 得 很 长。",
        targetPinyin = "Shíjiān guò de hěn cháng.",
        wordChips = listOf("时间:shíjiān", "过:guò", "得:de", "很:hěn", "长。:cháng.", "快:kuài"),
        correctAnswer = "时间,过,得,很,长。",
        audioToSpeak = "时间过得很长。"
    ),

    // 10. Soal 10: Ketuk Pasangan yang Sesuai (Rangkuman Panjang & Durasi)
    Exercise(
        id = "u18_s3_p2_m10",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u18_s3_p2_m10_1", "长", "cháng", "panjang"),
            MatchPairItem("u18_s3_p2_m10_2", "时间", "shíjiān", "waktu"),
            MatchPairItem("u18_s3_p2_m10_3", "一条路", "yì tiáo lù", "sebuah jalan"),
            MatchPairItem("u18_s3_p2_m10_4", "长头发", "cháng tóufa", "rambut panjang")
        )
    )
)
