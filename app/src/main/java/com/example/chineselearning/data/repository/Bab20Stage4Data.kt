package com.example.chineselearning.data.repository

import com.example.chineselearning.R
import com.example.chineselearning.data.model.Exercise
import com.example.chineselearning.data.model.ExerciseType
import com.example.chineselearning.data.model.MatchPairItem
import com.example.chineselearning.data.model.PictureOption

val bab20Stage4Part1Exercises = listOf(
    // 1. Soal 1: Pilihan Gambar (楼 -> gedung / lantai gedung)
    Exercise(
        id = "u20_s4_p1_q1",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "楼",
        targetPinyin = "lóu",
        targetTranslation = "gedung / lantai",
        correctAnswer = "gedung / lantai",
        audioToSpeak = "楼",
        pictureOptions = listOf(
            PictureOption("u20_s4_p1_opt1", "gedung", "", R.drawable.ic_work_office_building, true),
            PictureOption("u20_s4_p1_opt2", "rumah", "", R.drawable.ic_fam_home, false),
            PictureOption("u20_s4_p1_opt3", "kamar", "", R.drawable.ic_fam_room, false),
            PictureOption("u20_s4_p1_opt4", "kursi", "", R.drawable.ic_fam_chair, false)
        )
    ),

    // 2. Soal 2: Susun Kalimat (Kita pergi ke lantai lima ruang kelas untuk belajar.)
    Exercise(
        id = "u20_s4_p1_q2",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Kita ke lantai lima untuk belajar.",
        targetHanzi = "我们 去 五 楼 上课。",
        targetPinyin = "Wǒmen qù wǔ lóu shàngkè.",
        wordChips = listOf("我们:wǒmen", "去:qù", "五:wǔ", "楼:lóu", "上课。:shàngkè.", "下课:xiàkè"),
        correctAnswer = "我们,去,五,楼,上课。",
        audioToSpeak = "我们去五楼上课。"
    ),

    // 3. Soal 3: Ketuk Pasangan yang Sesuai (Lantai & Gedung)
    Exercise(
        id = "u20_s4_p1_q3",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u20_s4_p1_m1", "楼", "lóu", "gedung / lantai"),
            MatchPairItem("u20_s4_p1_m2", "上楼", "shàng lóu", "naik lantai"),
            MatchPairItem("u20_s4_p1_m3", "下楼", "xià lóu", "turun lantai"),
            MatchPairItem("u20_s4_p1_m4", "大楼", "dàlóu", "gedung bertingkat")
        )
    ),

    // 4. Soal 4: Ketik Pinyin (gedung/lantai -> lóu)
    Exercise(
        id = "u20_s4_p1_q4",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "gedung / lantai",
        sentenceWithBlank = "楼 (________)",
        targetHanzi = "楼",
        targetPinyin = "lóu",
        correctAnswer = "lou",
        keyboardKeys = listOf("l", "o", "u", "a", "e", "i", "b", "d", "g", "h", "j", "m"),
        audioToSpeak = "楼"
    ),

    // 5. Soal 5: Mendengar Kalimat (Rule 10: illustrationRes = 0)
    Exercise(
        id = "u20_s4_p1_q5",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Apa yang Anda dengar?",
        targetTranslation = "Dia tinggal di lantai tiga.",
        targetHanzi = "他 住 在 三 楼。",
        targetPinyin = "Tā zhù zài sān lóu.",
        wordChips = listOf("他:tā", "住:zhù", "在:zài", "三:sān", "楼。:lóu.", "四:sì"),
        correctAnswer = "他,住,在,三,楼。",
        illustrationRes = 0,
        audioToSpeak = "他住在三楼。"
    ),

    // 6. Soal 6: Pilihan Kalimat
    Exercise(
        id = "u20_s4_p1_q6",
        type = ExerciseType.SENTENCE_CHOICE,
        title = "Pilih terjemahan yang benar",
        targetHanzi = "这 栋 大楼 一共 有 二十 层。",
        targetPinyin = "Zhè dòng dàlóu yígòng yǒu èrshí céng.",
        targetTranslation = "Gedung ini secara keseluruhan memiliki dua puluh lantai.",
        correctAnswer = "Zhè dòng dàlóu yígòng yǒu èrshí céng.\n这 栋 大楼 一共 有 二十 层。",
        options = listOf(
            "Zhè dòng dàlóu yígòng yǒu èrshí céng.\n这 栋 大楼 一共 有 二十 层。",
            "Zhè dòng dàlóu yígòng yǒu shí céng.\n这 栋 大楼 一共 有 十 层。",
            "Nà dòng dàlóu yígòng yǒu èrshí céng.\n那 栋 大楼 一共 有 二十 层。"
        ),
        audioToSpeak = "这栋大楼一共有二十层。"
    ),

    // 7. Soal 7: Pilihan Gambar (大楼 -> gedung bertingkat)
    Exercise(
        id = "u20_s4_p1_q7",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "大楼",
        targetPinyin = "dàlóu",
        targetTranslation = "gedung bertingkat",
        correctAnswer = "gedung bertingkat",
        audioToSpeak = "大楼",
        pictureOptions = listOf(
            PictureOption("u20_s4_p1_opt7_1", "gedung", "", R.drawable.ic_work_office_building, true),
            PictureOption("u20_s4_p1_opt7_2", "rumah", "", R.drawable.ic_fam_home, false),
            PictureOption("u20_s4_p1_opt7_3", "kamar", "", R.drawable.ic_fam_room, false),
            PictureOption("u20_s4_p1_opt7_4", "kursi", "", R.drawable.ic_fam_chair, false)
        )
    ),

    // 8. Soal 8: Ketik Pinyin (lantai lima -> wǔlóu)
    Exercise(
        id = "u20_s4_p1_q8",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "lantai lima",
        sentenceWithBlank = "五楼 (________)",
        targetHanzi = "五楼",
        targetPinyin = "wǔlóu",
        correctAnswer = "wulou",
        keyboardKeys = listOf("w", "u", "l", "o", "a", "e", "i", "b", "d", "g", "h", "j"),
        audioToSpeak = "五楼"
    ),

    // 9. Soal 9: Susun Kalimat (Tolong naik ke lantai atas mencari guru.)
    Exercise(
        id = "u20_s4_p1_q9",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Silakan naik ke atas cari guru.",
        targetHanzi = "请 上 楼 找 老师。",
        targetPinyin = "Qǐng shàng lóu zhǎo lǎoshī.",
        wordChips = listOf("请:qǐng", "上:shàng", "楼:lóu", "找:zhǎo", "老师。:lǎoshī.", "下:xià"),
        correctAnswer = "请,上,楼,找,老师。",
        audioToSpeak = "请上楼找老师。"
    ),

    // 10. Soal 10: Ketuk Pasangan yang Sesuai (Rangkuman Lantai Gedung)
    Exercise(
        id = "u20_s4_p1_m10",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u20_s4_p1_m10_1", "楼", "lóu", "gedung / lantai"),
            MatchPairItem("u20_s4_p1_m10_2", "三楼", "sān lóu", "lantai tiga"),
            MatchPairItem("u20_s4_p1_m10_3", "上楼去", "shàng lóu qù", "naik ke atas"),
            MatchPairItem("u20_s4_p1_m10_4", "找老师", "zhǎo lǎoshī", "mencari guru")
        )
    )
)

val bab20Stage4Part2Exercises = listOf(
    // 1. Soal 1: Pilihan Gambar (间 -> kata penggolong kamar/ruangan)
    Exercise(
        id = "u20_s4_p2_q1",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "间",
        targetPinyin = "jiān",
        targetTranslation = "ruangan / kamar",
        correctAnswer = "ruangan / kamar",
        audioToSpeak = "间",
        pictureOptions = listOf(
            PictureOption("u20_s4_p2_opt1", "ruangan", "", R.drawable.ic_fam_room, true),
            PictureOption("u20_s4_p2_opt2", "gedung", "", R.drawable.ic_work_office_building, false),
            PictureOption("u20_s4_p2_opt3", "rumah", "", R.drawable.ic_fam_home, false),
            PictureOption("u20_s4_p2_opt4", "kursi", "", R.drawable.ic_fam_chair, false)
        )
    ),

    // 2. Soal 2: Susun Kalimat (Di gedung ini ada 30 kamar.)
    Exercise(
        id = "u20_s4_p2_q2",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Di gedung ini ada 30 kamar.",
        targetHanzi = "这 栋 楼 里 有 三十 间 房间。",
        targetPinyin = "Zhè dòng lóu lǐ yǒu sānshí jiān fángjiān.",
        wordChips = listOf("这:zhè", "栋:dòng", "楼:lóu", "里:lǐ", "有:yǒu", "三十:sānshí", "间:jiān", "房间。:fángjiān."),
        correctAnswer = "这,栋,楼,里,有,三十,间,房间。",
        audioToSpeak = "这栋楼里有三十间房间。"
    ),

    // 3. Soal 3: Ketuk Pasangan yang Sesuai (Kamar & Ruang Kelas)
    Exercise(
        id = "u20_s4_p2_m3",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u20_s4_p2_m1", "间", "jiān", "penggolong kamar"),
            MatchPairItem("u20_s4_p2_m2", "一间", "yì jiān", "sebuah kamar"),
            MatchPairItem("u20_s4_p2_m3", "教室", "jiàoshì", "ruang kelas"),
            MatchPairItem("u20_s4_p2_m4", "房间", "fángjiān", "kamar")
        )
    ),

    // 4. Soal 4: Ketik Pinyin (penggolong ruangan -> jiān)
    Exercise(
        id = "u20_s4_p2_q4",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "ruangan / kamar",
        sentenceWithBlank = "间 (________)",
        targetHanzi = "间",
        targetPinyin = "jiān",
        correctAnswer = "jian",
        keyboardKeys = listOf("j", "i", "a", "n", "e", "o", "u", "b", "d", "g", "h", "l"),
        audioToSpeak = "间"
    ),

    // 5. Soal 5: Mendengar Kalimat (Rule 10: illustrationRes = 0)
    Exercise(
        id = "u20_s4_p2_q5",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Apa yang Anda dengar?",
        targetTranslation = "Lantai tiga memiliki sebuah ruang kelas yang besar.",
        targetHanzi = "三 楼 有 一 间 大 教室。",
        targetPinyin = "Sān lóu yǒu yì jiān dà jiàoshì.",
        wordChips = listOf("三:sān", "楼:lóu", "有:yǒu", "一:yì", "间:jiān", "大:dà", "教室。:jiàoshì.", "小:xiǎo"),
        correctAnswer = "三,楼,有,一,间,大,教室。",
        illustrationRes = 0,
        audioToSpeak = "三楼有一间大教室。"
    ),

    // 6. Soal 6: Pilihan Kalimat
    Exercise(
        id = "u20_s4_p2_q6",
        type = ExerciseType.SENTENCE_CHOICE,
        title = "Pilih terjemahan yang benar",
        targetHanzi = "这 间 房间 很 干净。",
        targetPinyin = "Zhè jiān fángjiān hěn gānjìng.",
        targetTranslation = "Kamar ini sangat bersih.",
        correctAnswer = "Zhè jiān fángjiān hěn gānjìng.\n这 间 房间 很 干净。",
        options = listOf(
            "Zhè jiān fángjiān hěn gānjìng.\n这 间 房间 很 干净。",
            "Nà jiān fángjiān hěn zāng.\n那 间 房间 很 脏。",
            "Zhè dòng lóu hěn gānjìng.\n这 栋 楼 很 干净。"
        ),
        audioToSpeak = "这间房间很干净。"
    ),

    // 7. Soal 7: Pilihan Gambar (房间 -> kamar)
    Exercise(
        id = "u20_s4_p2_q7",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "房间",
        targetPinyin = "fángjiān",
        targetTranslation = "kamar",
        correctAnswer = "kamar",
        audioToSpeak = "房间",
        pictureOptions = listOf(
            PictureOption("u20_s4_p2_opt7_1", "kamar", "", R.drawable.ic_fam_room, true),
            PictureOption("u20_s4_p2_opt7_2", "gedung", "", R.drawable.ic_work_office_building, false),
            PictureOption("u20_s4_p2_opt7_3", "rumah", "", R.drawable.ic_fam_home, false),
            PictureOption("u20_s4_p2_opt7_4", "kursi", "", R.drawable.ic_fam_chair, false)
        )
    ),

    // 8. Soal 8: Ketik Pinyin (kamar -> fángjiān)
    Exercise(
        id = "u20_s4_p2_q8",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "kamar",
        sentenceWithBlank = "房间 (________)",
        targetHanzi = "房间",
        targetPinyin = "fángjiān",
        correctAnswer = "fangjian",
        keyboardKeys = listOf("f", "a", "n", "g", "j", "i", "e", "o", "u", "b", "d", "h"),
        audioToSpeak = "房间"
    ),

    // 9. Soal 9: Susun Kalimat (Hotel ini memiliki banyak kamar.)
    Exercise(
        id = "u20_s4_p2_q9",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Hotel ini punya banyak kamar.",
        targetHanzi = "这家 酒店 有 很多 间 房。",
        targetPinyin = "Zhè jiā jiǔdiàn yǒu hěn duō jiān fáng.",
        wordChips = listOf("这家:zhè jiā", "酒店:jiǔdiàn", "有:yǒu", "很多:hěn duō", "间:jiān", "房。:fáng.", "少:shǎo"),
        correctAnswer = "这家,酒店,有,很多,间,房。",
        audioToSpeak = "这家酒店有很多间房。"
    ),

    // 10. Soal 10: Ketuk Pasangan yang Sesuai (Rangkuman Penggolong Kamar)
    Exercise(
        id = "u20_s4_p2_m10",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u20_s4_p2_m10_1", "间", "jiān", "kamar (satuan)"),
            MatchPairItem("u20_s4_p2_m10_2", "房间", "fángjiān", "kamar tidur"),
            MatchPairItem("u20_s4_p2_m10_3", "大教室", "dà jiàoshì", "kelas besar"),
            MatchPairItem("u20_s4_p2_m10_4", "干干净净", "gān gān jìng jìng", "bersih rapi")
        )
    )
)
