package com.example.chineselearning.data.repository

import com.example.chineselearning.R
import com.example.chineselearning.data.model.Exercise
import com.example.chineselearning.data.model.ExerciseType
import com.example.chineselearning.data.model.MatchPairItem
import com.example.chineselearning.data.model.PictureOption

val bab20Stage5Part1Exercises = listOf(
    // 1. Soal 1: Pilihan Gambar (左边 -> sebelah kiri)
    Exercise(
        id = "u20_s5_p1_q1",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "左边",
        targetPinyin = "zuǒbian",
        targetTranslation = "sebelah kiri",
        correctAnswer = "sebelah kiri",
        audioToSpeak = "左边",
        pictureOptions = listOf(
            PictureOption("u20_s5_p1_opt1", "sebelah kiri", "", R.drawable.ic_pos_left, true),
            PictureOption("u20_s5_p1_opt2", "sebelah kanan", "", R.drawable.ic_pos_right, false),
            PictureOption("u20_s5_p1_opt3", "di depan", "", R.drawable.ic_pos_front, false),
            PictureOption("u20_s5_p1_opt4", "di belakang", "", R.drawable.ic_pos_back, false)
        )
    ),

    // 2. Soal 2: Susun Kalimat (Di sebelah kiri ada toko buku, di sebelah kanan ada sekolah.)
    Exercise(
        id = "u20_s5_p1_q2",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Kiri ada toko buku, kanan ada sekolah.",
        targetHanzi = "左边 是 书店， 右边 是 学校。",
        targetPinyin = "Zuǒbian shì shūdiàn, yòubian shì xuéxiào.",
        wordChips = listOf("左边:zuǒbian", "是:shì", "书店，:shūdiàn,", "右边:yòubian", "是:shì", "学校。:xuéxiào.", "医院:yīyuàn"),
        correctAnswer = "左边,是,书店，,右边,是,学校。",
        audioToSpeak = "左边是书店，右边是学校。"
    ),

    // 3. Soal 3: Ketuk Pasangan yang Sesuai (Sintesis Kiri Kanan Depan Belakang)
    Exercise(
        id = "u20_s5_p1_m3",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u20_s5_p1_m1", "左边", "zuǒbian", "sebelah kiri"),
            MatchPairItem("u20_s5_p1_m2", "右边", "yòubian", "sebelah kanan"),
            MatchPairItem("u20_s5_p1_m3", "前面", "qiánmiàn", "di depan"),
            MatchPairItem("u20_s5_p1_m4", "后面", "hòumiàn", "di belakang")
        )
    ),

    // 4. Soal 4: Ketik Pinyin (sebelah kiri -> zuǒbian)
    Exercise(
        id = "u20_s5_p1_q4",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "sebelah kiri",
        sentenceWithBlank = "左边 (________)",
        targetHanzi = "左边",
        targetPinyin = "zuǒbian",
        correctAnswer = "zuobian",
        keyboardKeys = listOf("z", "u", "o", "b", "i", "a", "n", "e", "d", "g", "h", "j"),
        audioToSpeak = "左边"
    ),

    // 5. Soal 5: Mendengar Kalimat (Rule 10: illustrationRes = 0)
    Exercise(
        id = "u20_s5_p1_q5",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Apa yang Anda dengar?",
        targetTranslation = "Rumah sakit berada di depan stasiun.",
        targetHanzi = "医院 在 车站 前面。",
        targetPinyin = "Yīyuàn zài chēzhàn qiánmiàn.",
        wordChips = listOf("医院:yīyuàn", "在:zài", "车站:chēzhàn", "前面。:qiánmiàn.", "后面:hòumiàn"),
        correctAnswer = "医院,在,车站,前面。",
        illustrationRes = 0,
        audioToSpeak = "医院在车站前面。"
    ),

    // 6. Soal 6: Pilihan Kalimat
    Exercise(
        id = "u20_s5_p1_q6",
        type = ExerciseType.SENTENCE_CHOICE,
        title = "Pilih terjemahan yang benar",
        targetHanzi = "他 坐 在 我 的 旁边。",
        targetPinyin = "Tā zuò zài wǒ de pángbiān.",
        targetTranslation = "Dia duduk di samping saya.",
        correctAnswer = "Tā zuò zài wǒ de pángbiān.\n他 坐 在 我 的 旁边。",
        options = listOf(
            "Tā zuò zài wǒ de pángbiān.\n他 坐 在 我 的 旁边。",
            "Wǒ zuò zài tā de hòumiàn.\n我 坐 在 他 的 后面。",
            "Tā zuò zài wǒ de qiánmiàn.\n他 坐 在 我 的 前面。"
        ),
        audioToSpeak = "他坐在我的旁边。"
    ),

    // 7. Soal 7: Pilihan Gambar (前面 -> di depan)
    Exercise(
        id = "u20_s5_p1_q7",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "前面",
        targetPinyin = "qiánmiàn",
        targetTranslation = "bagian depan / di depan",
        correctAnswer = "bagian depan / di depan",
        audioToSpeak = "前面",
        pictureOptions = listOf(
            PictureOption("u20_s5_p1_opt7_1", "di depan", "", R.drawable.ic_pos_front, true),
            PictureOption("u20_s5_p1_opt7_2", "di belakang", "", R.drawable.ic_pos_back, false),
            PictureOption("u20_s5_p1_opt7_3", "di kanan", "", R.drawable.ic_pos_right, false),
            PictureOption("u20_s5_p1_opt7_4", "di kiri", "", R.drawable.ic_pos_left, false)
        )
    ),

    // 8. Soal 8: Ketik Pinyin (di depan -> qiánmiàn)
    Exercise(
        id = "u20_s5_p1_q8",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "bagian depan / di depan",
        sentenceWithBlank = "前面 (________)",
        targetHanzi = "前面",
        targetPinyin = "qiánmiàn",
        correctAnswer = "qianmian",
        keyboardKeys = listOf("q", "i", "a", "n", "m", "e", "o", "u", "b", "d", "g", "h"),
        audioToSpeak = "前面"
    ),

    // 9. Soal 9: Susun Kalimat (Di belakang ada siapa?)
    Exercise(
        id = "u20_s5_p1_q9",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Di belakang ada siapa?",
        targetHanzi = "后面 有 谁？",
        targetPinyin = "Hòumiàn yǒu shéi?",
        wordChips = listOf("后面:hòumiàn", "有:yǒu", "谁？:shéi?", "前面:qiánmiàn"),
        correctAnswer = "后面,有,谁？",
        audioToSpeak = "后面有谁？"
    ),

    // 10. Soal 10: Ketuk Pasangan yang Sesuai (Rangkuman Sintesis 1)
    Exercise(
        id = "u20_s5_p1_m10",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u20_s5_p1_m10_1", "左边", "zuǒbian", "sebelah kiri"),
            MatchPairItem("u20_s5_p1_m10_2", "右边", "yòubian", "sebelah kanan"),
            MatchPairItem("u20_s5_p1_m10_3", "旁边", "pángbiān", "di samping"),
            MatchPairItem("u20_s5_p1_m10_4", "前面", "qiánmiàn", "di depan")
        )
    )
)

val bab20Stage5Part2Exercises = listOf(
    // 1. Soal 1: Pilihan Gambar (上面 -> bagian atas / di atas)
    Exercise(
        id = "u20_s5_p2_q1",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "上面",
        targetPinyin = "shàngmiàn",
        targetTranslation = "bagian atas / di atas",
        correctAnswer = "bagian atas / di atas",
        audioToSpeak = "上面",
        pictureOptions = listOf(
            PictureOption("u20_s5_p2_opt1", "di atas", "", R.drawable.ic_pos_up, true),
            PictureOption("u20_s5_p2_opt2", "di bawah", "", R.drawable.ic_pos_down, false),
            PictureOption("u20_s5_p2_opt3", "di dalam", "", R.drawable.ic_pos_in, false),
            PictureOption("u20_s5_p2_opt4", "di luar", "", R.drawable.ic_pos_out, false)
        )
    ),

    // 2. Soal 2: Susun Kalimat (Di atas meja ada sebuah buku dan sebuah tas.)
    Exercise(
        id = "u20_s5_p2_q2",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Di atas meja ada buku dan tas.",
        targetHanzi = "桌子 上面 有 书 和 包。",
        targetPinyin = "Zhuōzi shàngmiàn yǒu shū hé bāo.",
        wordChips = listOf("桌子:zhuōzi", "上面:shàngmiàn", "有:yǒu", "书:shū", "和:hé", "包。:bāo.", "下面:xiàmiàn"),
        correctAnswer = "桌子,上面,有,书,和,包。",
        audioToSpeak = "桌子上面有书和包。"
    ),

    // 3. Soal 3: Ketuk Pasangan yang Sesuai (Grand Sintesis Bab 20)
    Exercise(
        id = "u20_s5_p2_m3",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u20_s5_p2_m1", "上面", "shàngmiàn", "di atas"),
            MatchPairItem("u20_s5_p2_m2", "下面", "xiàmiàn", "di bawah"),
            MatchPairItem("u20_s5_p2_m3", "楼上", "lóushàng", "lantai atas"),
            MatchPairItem("u20_s5_p2_m4", "一间房", "yì jiān fáng", "sebuah kamar")
        )
    ),

    // 4. Soal 4: Ketik Pinyin (di atas -> shàngmiàn)
    Exercise(
        id = "u20_s5_p2_q4",
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
        id = "u20_s5_p2_q5",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Apa yang Anda dengar?",
        targetTranslation = "Kamar saya berada di lantai tiga.",
        targetHanzi = "我 的 房间 在 三 楼。",
        targetPinyin = "Wǒ de fángjiān zài sān lóu.",
        wordChips = listOf("我:wǒ", "的:de", "房间:fángjiān", "在:zài", "三:sān", "楼。:lóu.", "二:èr"),
        correctAnswer = "我,的,房间,在,三,楼。",
        illustrationRes = 0,
        audioToSpeak = "我的房间在三楼。"
    ),

    // 6. Soal 6: Pilihan Kalimat
    Exercise(
        id = "u20_s5_p2_q6",
        type = ExerciseType.SENTENCE_CHOICE,
        title = "Pilih terjemahan yang benar",
        targetHanzi = "请 进 房间 里面 坐。",
        targetPinyin = "Qǐng jìn fángjiān lǐmiàn zuò.",
        targetTranslation = "Silakan masuk ke dalam kamar dan duduk.",
        correctAnswer = "Qǐng jìn fángjiān lǐmiàn zuò.\n请 进 房间 里面 坐。",
        options = listOf(
            "Qǐng jìn fángjiān lǐmiàn zuò.\n请 进 房间 里面 坐。",
            "Qǐng zài fángjiān wàimiàn děng.\n请 在 房间 外面 等。",
            "Qǐng jìn jiàoshì lǐmiàn zuò.\n请 进 教室 里面 坐。"
        ),
        audioToSpeak = "请进房间里面坐。"
    ),

    // 7. Soal 7: Pilihan Gambar (大楼 -> gedung bertingkat)
    Exercise(
        id = "u20_s5_p2_q7",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "大楼",
        targetPinyin = "dàlóu",
        targetTranslation = "gedung bertingkat",
        correctAnswer = "gedung bertingkat",
        audioToSpeak = "大楼",
        pictureOptions = listOf(
            PictureOption("u20_s5_p2_opt7_1", "gedung", "", R.drawable.ic_work_office_building, true),
            PictureOption("u20_s5_p2_opt7_2", "kamar", "", R.drawable.ic_fam_room, false),
            PictureOption("u20_s5_p2_opt7_3", "rumah", "", R.drawable.ic_fam_home, false),
            PictureOption("u20_s5_p2_opt7_4", "kursi", "", R.drawable.ic_fam_chair, false)
        )
    ),

    // 8. Soal 8: Ketik Pinyin (gedung/lantai -> lóu)
    Exercise(
        id = "u20_s5_p2_q8",
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

    // 9. Soal 9: Susun Kalimat (Di dalam kamar ada dua buah kursi.)
    Exercise(
        id = "u20_s5_p2_q9",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Di dalam kamar ada dua kursi.",
        targetHanzi = "房间 里面 有 两 把 椅子。",
        targetPinyin = "Fángjiān lǐmiàn yǒu liǎng bǎ yǐzi.",
        wordChips = listOf("房间:fángjiān", "里面:lǐmiàn", "有:yǒu", "两:liǎng", "把:bǎ", "椅子。:yǐzi.", "一张:yì zhāng"),
        correctAnswer = "房间,里面,有,两,把,椅子。",
        audioToSpeak = "房间里面有两把椅子。"
    ),

    // 10. Soal 10: Ketuk Pasangan yang Sesuai (Grand Review Final Bab 20)
    Exercise(
        id = "u20_s5_p2_m10",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u20_s5_p2_m10_1", "里面外面", "lǐmiàn wàimiàn", "dalam dan luar"),
            MatchPairItem("u20_s5_p2_m10_2", "上面下面", "shàngmiàn xiàmiàn", "atas dan bawah"),
            MatchPairItem("u20_s5_p2_m10_3", "五层楼", "wǔ céng lóu", "lima lantai"),
            MatchPairItem("u20_s5_p2_m10_4", "进房间", "jìn fángjiān", "masuk kamar")
        )
    )
)
