package com.example.chineselearning.data.repository

import com.example.chineselearning.R
import com.example.chineselearning.data.model.Exercise
import com.example.chineselearning.data.model.ExerciseType
import com.example.chineselearning.data.model.MatchPairItem
import com.example.chineselearning.data.model.PictureOption

val bab20Stage3Part1Exercises = listOf(
    // 1. Soal 1: Pilihan Gambar (里面 -> bagian dalam / di dalam)
    Exercise(
        id = "u20_s3_p1_q1",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "里面",
        targetPinyin = "lǐmiàn",
        targetTranslation = "bagian dalam / di dalam",
        correctAnswer = "bagian dalam / di dalam",
        audioToSpeak = "里面",
        pictureOptions = listOf(
            PictureOption("u20_s3_p1_opt1", "di dalam", "", R.drawable.ic_pos_in, true),
            PictureOption("u20_s3_p1_opt2", "di luar", "", R.drawable.ic_pos_out, false),
            PictureOption("u20_s3_p1_opt3", "di atas", "", R.drawable.ic_pos_up, false),
            PictureOption("u20_s3_p1_opt4", "di bawah", "", R.drawable.ic_pos_down, false)
        )
    ),

    // 2. Soal 2: Susun Kalimat (Di dalam tas sekolah ada tiga buah buku.)
    Exercise(
        id = "u20_s3_p1_q2",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Di dalam tas ada tiga buku.",
        targetHanzi = "书包 里面 有 三 本 书。",
        targetPinyin = "Shūbāo lǐmiàn yǒu sān běn shū.",
        wordChips = listOf("书包:shūbāo", "里面:lǐmiàn", "有:yǒu", "三:sān", "本:běn", "书。:shū.", "外面:wàimiàn"),
        correctAnswer = "书包,里面,有,三,本,书。",
        audioToSpeak = "书包里面有三本书。"
    ),

    // 3. Soal 3: Ketuk Pasangan yang Sesuai (Dalam & Luar)
    Exercise(
        id = "u20_s3_p1_q3",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u20_s3_p1_m1", "里面", "lǐmiàn", "di dalam"),
            MatchPairItem("u20_s3_p1_m2", "外面", "wàimiàn", "di luar"),
            MatchPairItem("u20_s3_p1_m3", "书包里", "shūbāo lǐ", "dalam tas"),
            MatchPairItem("u20_s3_p1_m4", "屋子外", "wūzi wài", "luar rumah")
        )
    ),

    // 4. Soal 4: Ketik Pinyin (di dalam -> lǐmiàn)
    Exercise(
        id = "u20_s3_p1_q4",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "bagian dalam / di dalam",
        sentenceWithBlank = "里面 (________)",
        targetHanzi = "里面",
        targetPinyin = "lǐmiàn",
        correctAnswer = "limian",
        keyboardKeys = listOf("l", "i", "m", "a", "n", "e", "o", "u", "b", "d", "g", "h"),
        audioToSpeak = "里面"
    ),

    // 5. Soal 5: Mendengar Kalimat (Rule 10: illustrationRes = 0)
    Exercise(
        id = "u20_s3_p1_q5",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Apa yang Anda dengar?",
        targetTranslation = "Di luar saat ini sedang turun hujan lebat.",
        targetHanzi = "外面 现在 正在 下 大雨。",
        targetPinyin = "Wàimiàn xiànzài zhèngzài xià dàyǔ.",
        wordChips = listOf("外面:wàimiàn", "现在:xiànzài", "正在:zhèngzài", "下:xià", "大雨。:dàyǔ.", "里面:lǐmiàn"),
        correctAnswer = "外面,现在,正在,下,大雨。",
        illustrationRes = 0,
        audioToSpeak = "外面现在正在下大雨。"
    ),

    // 6. Soal 6: Pilihan Kalimat
    Exercise(
        id = "u20_s3_p1_q6",
        type = ExerciseType.SENTENCE_CHOICE,
        title = "Pilih terjemahan yang benar",
        targetHanzi = "屋子 里面 很 暖和， 外面 很 冷。",
        targetPinyin = "Wūzi lǐmiàn hěn nuǎnhuo, wàimiàn hěn lěng.",
        targetTranslation = "Di dalam ruangan sangat hangat, di luar sangat dingin.",
        correctAnswer = "Wūzi lǐmiàn hěn nuǎnhuo, wàimiàn hěn lěng.\n屋子 里面 很 暖和， 外面 很 冷。",
        options = listOf(
            "Wūzi lǐmiàn hěn nuǎnhuo, wàimiàn hěn lěng.\n屋子 里面 很 暖和， 外面 很 冷。",
            "Wūzi lǐmiàn hěn lěng, wàimiàn hěn nuǎnhuo.\n屋子 里面 很 冷， 外面 很 暖和。",
            "Wūzi wàimiàn méiyǒu rén.\n屋子 外面 没有 人。"
        ),
        audioToSpeak = "屋子里面很暖和，外面很冷。"
    ),

    // 7. Soal 7: Pilihan Gambar (外面 -> di luar)
    Exercise(
        id = "u20_s3_p1_q7",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "外面",
        targetPinyin = "wàimiàn",
        targetTranslation = "bagian luar / di luar",
        correctAnswer = "bagian luar / di luar",
        audioToSpeak = "外面",
        pictureOptions = listOf(
            PictureOption("u20_s3_p1_opt7_1", "di luar", "", R.drawable.ic_pos_out, true),
            PictureOption("u20_s3_p1_opt7_2", "di dalam", "", R.drawable.ic_pos_in, false),
            PictureOption("u20_s3_p1_opt7_3", "di atas", "", R.drawable.ic_pos_up, false),
            PictureOption("u20_s3_p1_opt7_4", "di bawah", "", R.drawable.ic_pos_down, false)
        )
    ),

    // 8. Soal 8: Ketik Pinyin (di luar -> wàimiàn)
    Exercise(
        id = "u20_s3_p1_q8",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "bagian luar / di luar",
        sentenceWithBlank = "外面 (________)",
        targetHanzi = "外面",
        targetPinyin = "wàimiàn",
        correctAnswer = "waimian",
        keyboardKeys = listOf("w", "a", "i", "m", "n", "e", "o", "u", "b", "d", "g", "h"),
        audioToSpeak = "外面"
    ),

    // 9. Soal 9: Susun Kalimat (Di luar ada siapa?)
    Exercise(
        id = "u20_s3_p1_q9",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Di luar ada siapa?",
        targetHanzi = "外面 有 谁？",
        targetPinyin = "Wàimiàn yǒu shéi?",
        wordChips = listOf("外面:wàimiàn", "有:yǒu", "谁？:shéi?", "里面:lǐmiàn"),
        correctAnswer = "外面,有,谁？",
        audioToSpeak = "外面有谁？"
    ),

    // 10. Soal 10: Ketuk Pasangan yang Sesuai (Rangkuman Ruang Dalam & Luar)
    Exercise(
        id = "u20_s3_p1_m10",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u20_s3_p1_m10_1", "里面", "lǐmiàn", "di dalam"),
            MatchPairItem("u20_s3_p1_m10_2", "外面", "wàimiàn", "di luar"),
            MatchPairItem("u20_s3_p1_m10_3", "暖和", "nuǎnhuo", "hangat"),
            MatchPairItem("u20_s3_p1_m10_4", "下雨", "xiàyǔ", "turun hujan")
        )
    )
)

val bab20Stage3Part2Exercises = listOf(
    // 1. Soal 1: Pilihan Gambar (上面 -> bagian atas / di atas)
    Exercise(
        id = "u20_s3_p2_q1",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "上面",
        targetPinyin = "shàngmiàn",
        targetTranslation = "bagian atas / di atas",
        correctAnswer = "bagian atas / di atas",
        audioToSpeak = "上面",
        pictureOptions = listOf(
            PictureOption("u20_s3_p2_opt1", "di atas", "", R.drawable.ic_pos_up, true),
            PictureOption("u20_s3_p2_opt2", "di bawah", "", R.drawable.ic_pos_down, false),
            PictureOption("u20_s3_p2_opt3", "di dalam", "", R.drawable.ic_pos_in, false),
            PictureOption("u20_s3_p2_opt4", "di luar", "", R.drawable.ic_pos_out, false)
        )
    ),

    // 2. Soal 2: Susun Kalimat (Di atas meja diletakkan segelas air.)
    Exercise(
        id = "u20_s3_p2_q2",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Di atas meja ada segelas air.",
        targetHanzi = "桌子 上面 放 着 一 杯 水。",
        targetPinyin = "Zhuōzi shàngmiàn fàng zhe yì bēi shuǐ.",
        wordChips = listOf("桌子:zhuōzi", "上面:shàngmiàn", "放:fàng", "着:zhe", "一:yì", "杯:bēi", "水。:shuǐ.", "下面:xiàmiàn"),
        correctAnswer = "桌子,上面,放,着,一,杯,水。",
        audioToSpeak = "桌子上面放着一杯水。"
    ),

    // 3. Soal 3: Ketuk Pasangan yang Sesuai (Atas & Bawah)
    Exercise(
        id = "u20_s3_p2_m3",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u20_s3_p2_m1", "上面", "shàngmiàn", "di atas"),
            MatchPairItem("u20_s3_p2_m2", "下面", "xiàmiàn", "di bawah"),
            MatchPairItem("u20_s3_p2_m3", "桌子上", "zhuōzi shàng", "atas meja"),
            MatchPairItem("u20_s3_p2_m4", "椅子下", "yǐzi xià", "bawah kursi")
        )
    ),

    // 4. Soal 4: Ketik Pinyin (di atas -> shàngmiàn)
    Exercise(
        id = "u20_s3_p2_q4",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "bagian atas / di atas",
        sentenceWithBlank = "上面 (________)",
        targetHanzi = "上面",
        targetPinyin = "shàngmiàn",
        correctAnswer = "shangmian",
        keyboardKeys = listOf("s", "h", "a", "n", "g", "m", "i", "e", "o", "u", "b", "d"),
        audioToSpeak = "上面"
    ),

    // 5. Soal 5: Mendengar Kalimat (Rule 10: illustrationRes = 0)
    Exercise(
        id = "u20_s3_p2_q5",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Apa yang Anda dengar?",
        targetTranslation = "Kucing kecil tidur di bawah kursi.",
        targetHanzi = "小猫 在 椅子 下面 睡觉。",
        targetPinyin = "Xiǎomāo zài yǐzi xiàmiàn shuìjiào.",
        wordChips = listOf("小猫:xiǎomāo", "在:zài", "椅子:yǐzi", "下面:xiàmiàn", "睡觉。:shuìjiào.", "上面:shàngmiàn"),
        correctAnswer = "小猫,在,椅子,下面,睡觉。",
        illustrationRes = 0,
        audioToSpeak = "小猫在椅子下面睡觉。"
    ),

    // 6. Soal 6: Pilihan Kalimat
    Exercise(
        id = "u20_s3_p2_q6",
        type = ExerciseType.SENTENCE_CHOICE,
        title = "Pilih terjemahan yang benar",
        targetHanzi = "床 下面 有 一 个 小 盒子。",
        targetPinyin = "Chuáng xiàmiàn yǒu yí gè xiǎo hézi.",
        targetTranslation = "Di bawah ranjang ada sebuah kotak kecil.",
        correctAnswer = "Chuáng xiàmiàn yǒu yí gè xiǎo hézi.\n床 下面 有 一 个 小 盒子。",
        options = listOf(
            "Chuáng xiàmiàn yǒu yí gè xiǎo hézi.\n床 下面 有 一 个 小 盒子。",
            "Chuáng shàngmiàn yǒu yí gè xiǎo hézi.\n床 上面 有 一 个 小 盒子。",
            "Zhuōzi xiàmiàn yǒu yí gè xiǎo hézi.\n桌子 下面 有 一 个 小 盒子。"
        ),
        audioToSpeak = "床下面有一个小盒子。"
    ),

    // 7. Soal 7: Pilihan Gambar (下面 -> di bawah)
    Exercise(
        id = "u20_s3_p2_q7",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "下面",
        targetPinyin = "xiàmiàn",
        targetTranslation = "bagian bawah / di bawah",
        correctAnswer = "bagian bawah / di bawah",
        audioToSpeak = "下面",
        pictureOptions = listOf(
            PictureOption("u20_s3_p2_opt7_1", "di bawah", "", R.drawable.ic_pos_down, true),
            PictureOption("u20_s3_p2_opt7_2", "di atas", "", R.drawable.ic_pos_up, false),
            PictureOption("u20_s3_p2_opt7_3", "di dalam", "", R.drawable.ic_pos_in, false),
            PictureOption("u20_s3_p2_opt7_4", "di luar", "", R.drawable.ic_pos_out, false)
        )
    ),

    // 8. Soal 8: Ketik Pinyin (di bawah -> xiàmiàn)
    Exercise(
        id = "u20_s3_p2_q8",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "bagian bawah / di bawah",
        sentenceWithBlank = "下面 (________)",
        targetHanzi = "下面",
        targetPinyin = "xiàmiàn",
        correctAnswer = "xiamian",
        keyboardKeys = listOf("x", "i", "a", "m", "n", "e", "o", "u", "b", "d", "g", "h"),
        audioToSpeak = "下面"
    ),

    // 9. Soal 9: Susun Kalimat (Buku diletakkan di atas meja belajar.)
    Exercise(
        id = "u20_s3_p2_q9",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Buku ada di atas meja.",
        targetHanzi = "书 在 桌子 上面。",
        targetPinyin = "Shū zài zhuōzi shàngmiàn.",
        wordChips = listOf("书:shū", "在:zài", "桌子:zhuōzi", "上面。:shàngmiàn.", "下面:xiàmiàn"),
        correctAnswer = "书,在,桌子,上面。",
        audioToSpeak = "书在桌子上面。"
    ),

    // 10. Soal 10: Ketuk Pasangan yang Sesuai (Rangkuman Posisi Vertikal)
    Exercise(
        id = "u20_s3_p2_m10",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u20_s3_p2_m10_1", "上面", "shàngmiàn", "di atas"),
            MatchPairItem("u20_s3_p2_m10_2", "下面", "xiàmiàn", "di bawah"),
            MatchPairItem("u20_s3_p2_m3", "放着", "fàng zhe", "diletakkan"),
            MatchPairItem("u20_s3_p2_m4", "睡觉", "shuìjiào", "tidur")
        )
    )
)
