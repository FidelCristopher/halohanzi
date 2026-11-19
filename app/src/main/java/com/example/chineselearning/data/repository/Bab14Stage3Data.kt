package com.example.chineselearning.data.repository

import com.example.chineselearning.R
import com.example.chineselearning.data.model.Exercise
import com.example.chineselearning.data.model.ExerciseType
import com.example.chineselearning.data.model.MatchPairItem
import com.example.chineselearning.data.model.PictureOption

val bab14Stage3Part1Exercises = listOf(
    // 1. Soal 1: Pilihan Gambar (电视 -> televisi)
    Exercise(
        id = "u14_s3_p1_q1",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "电视",
        targetPinyin = "diànshì",
        targetTranslation = "televisi",
        correctAnswer = "televisi",
        audioToSpeak = "电视",
        pictureOptions = listOf(
            PictureOption("u14_s3_p1_opt1", "televisi", "", R.drawable.ic_hobby_tv, true),
            PictureOption("u14_s3_p1_opt2", "komputer", "", R.drawable.ic_work_computer, false),
            PictureOption("u14_s3_p1_opt3", "telepon", "", R.drawable.ic_comm_phone, false),
            PictureOption("u14_s3_p1_opt4", "buku", "", R.drawable.ic_book_chinese, false)
        )
    ),

    // 2. Soal 2: Susun Kalimat (Saya menonton televisi di rumah.)
    Exercise(
        id = "u14_s3_p1_q2",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Saya nonton televisi di rumah.",
        targetHanzi = "我 在家 看 电视。",
        targetPinyin = "Wǒ zàijiā kàn diànshì.",
        wordChips = listOf("我:wǒ", "在家:zàijiā", "看:kàn", "电视:diànshì", "电影:diànyǐng", "他:tā"),
        correctAnswer = "我,在家,看,电视",
        audioToSpeak = "我在家看电视。"
    ),

    // 3. Soal 3: Ketuk Pasangan yang Sesuai (Televisi & Menonton)
    Exercise(
        id = "u14_s3_p1_q3",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u14_s3_p1_m1", "看", "kàn", "menonton / melihat"),
            MatchPairItem("u14_s3_p1_m2", "电视", "diànshì", "televisi"),
            MatchPairItem("u14_s3_p1_m3", "看电视", "kàn diànshì", "menonton TV"),
            MatchPairItem("u14_s3_p1_m4", "看书", "kànshū", "membaca buku")
        )
    ),

    // 4. Soal 4: Ketik Pinyin (melihat/nonton -> kàn)
    Exercise(
        id = "u14_s3_p1_q4",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "melihat / menonton",
        sentenceWithBlank = "看 (________)",
        targetHanzi = "看",
        targetPinyin = "kàn",
        correctAnswer = "kan",
        keyboardKeys = listOf("k", "a", "n", "e", "i", "o", "u", "b", "d", "g", "h"),
        audioToSpeak = "看"
    ),

    // 5. Soal 5: Mendengar Kalimat (Rule 10: illustrationRes = 0)
    Exercise(
        id = "u14_s3_p1_q5",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Apa yang Anda dengar?",
        targetTranslation = "Ibu sedang menonton televisi.",
        targetHanzi = "妈妈 正在 看 电视。",
        targetPinyin = "Māma zhèngzài kàn diànshì.",
        wordChips = listOf("妈妈:māma", "正在:zhèngzài", "看:kàn", "电视:diànshì", "做饭:zuòfàn", "爸爸:bàba"),
        correctAnswer = "妈妈,正在,看,电视",
        illustrationRes = 0,
        audioToSpeak = "妈妈正在看电视。"
    ),

    // 6. Soal 6: Pilihan Kalimat
    Exercise(
        id = "u14_s3_p1_q6",
        type = ExerciseType.SENTENCE_CHOICE,
        title = "Pilih terjemahan yang benar",
        targetHanzi = "你 喜欢 看 电视 吗？",
        targetPinyin = "Nǐ xǐhuan kàn diànshì ma?",
        targetTranslation = "Apakah kamu suka menonton televisi?",
        correctAnswer = "Nǐ xǐhuan kàn diànshì ma?\n你 喜欢 看 电视 吗？",
        options = listOf(
            "Nǐ xǐhuan kàn diànshì ma?\n你 喜欢 看 电视 吗？",
            "Nǐ xǐhuan kàn diànyǐng ma?\n你 喜欢 看 电影 吗？",
            "Tā xǐhuan kàn diànshì ma?\n他 喜欢 看 电视 吗？"
        ),
        audioToSpeak = "你喜欢看电视吗？"
    ),

    // 7. Soal 7: Pilihan Gambar (看电视 -> menonton TV)
    Exercise(
        id = "u14_s3_p1_q7",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "电视",
        targetPinyin = "diànshì",
        targetTranslation = "televisi",
        correctAnswer = "televisi",
        audioToSpeak = "电视",
        pictureOptions = listOf(
            PictureOption("u14_s3_p1_opt7_1", "televisi", "", R.drawable.ic_hobby_tv, true),
            PictureOption("u14_s3_p1_opt7_2", "buku", "", R.drawable.ic_book_chinese, false),
            PictureOption("u14_s3_p1_opt7_3", "mobil", "", R.drawable.ic_trans_car, false),
            PictureOption("u14_s3_p1_opt7_4", "komputer", "", R.drawable.ic_work_computer, false)
        )
    ),

    // 8. Soal 8: Ketik Pinyin (televisi -> diànshì)
    Exercise(
        id = "u14_s3_p1_q8",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "televisi",
        sentenceWithBlank = "电视 (________)",
        targetHanzi = "电视",
        targetPinyin = "diànshì",
        correctAnswer = "dianshi",
        keyboardKeys = listOf("d", "i", "a", "n", "s", "h", "e", "o", "u", "b", "g"),
        audioToSpeak = "电视"
    ),

    // 9. Soal 9: Susun Kalimat (Keluarga kami menonton TV bersama.)
    Exercise(
        id = "u14_s3_p1_q9",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Kami bersama menonton TV.",
        targetHanzi = "我们 一起 看 电视。",
        targetPinyin = "Wǒmen yìqǐ kàn diànshì.",
        wordChips = listOf("我们:wǒmen", "一起:yìqǐ", "看:kàn", "电视:diànshì", "去:qù"),
        correctAnswer = "我们,一起,看,电视",
        audioToSpeak = "我们一起看电视。"
    ),

    // 10. Soal 10: Ketuk Pasangan yang Sesuai (Rangkuman Televisi)
    Exercise(
        id = "u14_s3_p1_m10_1",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u14_s3_p1_m10_1", "电视", "diànshì", "televisi"),
            MatchPairItem("u14_s3_p1_m10_2", "看电视", "kàn diànshì", "nonton TV"),
            MatchPairItem("u14_s3_p1_m10_3", "看书", "kànshū", "baca buku"),
            MatchPairItem("u14_s3_p1_m10_4", "看", "kàn", "menonton / melihat")
        )
    )
)

val bab14Stage3Part2Exercises = listOf(
    // 1. Soal 1: Pilihan Gambar (电影 -> film)
    Exercise(
        id = "u14_s3_p2_q1",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "电影",
        targetPinyin = "diànyǐng",
        targetTranslation = "film",
        correctAnswer = "film",
        audioToSpeak = "电影",
        pictureOptions = listOf(
            PictureOption("u14_s3_p2_opt1", "film", "", R.drawable.ic_hobby_movie, true),
            PictureOption("u14_s3_p2_opt2", "televisi", "", R.drawable.ic_hobby_tv, false),
            PictureOption("u14_s3_p2_opt3", "buku", "", R.drawable.ic_book_chinese, false),
            PictureOption("u14_s3_p2_opt4", "komputer", "", R.drawable.ic_work_computer, false)
        )
    ),

    // 2. Soal 2: Susun Kalimat (Malam ini kita pergi menonton film.)
    Exercise(
        id = "u14_s3_p2_q2",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Malam ini kita nonton film.",
        targetHanzi = "今天 晚上 我们 看 电影。",
        targetPinyin = "Jīntiān wǎnshang wǒmen kàn diànyǐng.",
        wordChips = listOf("今天:jīntiān", "晚上:wǎnshang", "我们:wǒmen", "看:kàn", "电影:diànyǐng", "电视:diànshì"),
        correctAnswer = "今天,晚上,我们,看,电影",
        audioToSpeak = "今天晚上我们看电影。"
    ),

    // 3. Soal 3: Ketuk Pasangan yang Sesuai (Film & Bioskop)
    Exercise(
        id = "u14_s3_p2_m3",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u14_s3_p2_m1", "电影", "diànyǐng", "film"),
            MatchPairItem("u14_s3_p2_m2", "电影院", "diànyǐngyuàn", "bioskop"),
            MatchPairItem("u14_s3_p2_m3", "好看", "hǎokàn", "bagus / menarik"),
            MatchPairItem("u14_s3_p2_m4", "看电影", "kàn diànyǐng", "menonton film")
        )
    ),

    // 4. Soal 4: Ketik Pinyin (film -> diànyǐng)
    Exercise(
        id = "u14_s3_p2_q4",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "film",
        sentenceWithBlank = "电影 (________)",
        targetHanzi = "电影",
        targetPinyin = "diànyǐng",
        correctAnswer = "dianying",
        keyboardKeys = listOf("d", "i", "a", "n", "y", "g", "e", "o", "u", "b", "h"),
        audioToSpeak = "电影"
    ),

    // 5. Soal 5: Mendengar Kalimat (Rule 10: illustrationRes = 0)
    Exercise(
        id = "u14_s3_p2_q5",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Apa yang Anda dengar?",
        targetTranslation = "Film ini sangat bagus.",
        targetHanzi = "这个 电影 很 好看。",
        targetPinyin = "Zhège diànyǐng hěn hǎokàn.",
        wordChips = listOf("这个:zhège", "电影:diànyǐng", "很:hěn", "好看:hǎokàn", "好听:hǎotīng"),
        correctAnswer = "这个,电影,很,好看",
        illustrationRes = 0,
        audioToSpeak = "这个电影很好看。"
    ),

    // 6. Soal 6: Pilihan Kalimat
    Exercise(
        id = "u14_s3_p2_q6",
        type = ExerciseType.SENTENCE_CHOICE,
        title = "Pilih terjemahan yang benar",
        targetHanzi = "我们 去 电影院 吧。",
        targetPinyin = "Wǒmen qù diànyǐngyuàn ba.",
        targetTranslation = "Mari kita pergi ke bioskop.",
        correctAnswer = "Wǒmen qù diànyǐngyuàn ba.\n我们 去 电影院 吧。",
        options = listOf(
            "Wǒmen qù diànyǐngyuàn ba.\n我们 去 电影院 吧。",
            "Wǒmen qù shūdiàn ba.\n我们 去 书店 吧。",
            "Tāmen qù diànyǐngyuàn ba.\n他们 去 电影院 吧。"
        ),
        audioToSpeak = "我们去电影院吧。"
    ),

    // 7. Soal 7: Pilihan Gambar (电影院 -> bioskop)
    Exercise(
        id = "u14_s3_p2_q7",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "电影院",
        targetPinyin = "diànyǐngyuàn",
        targetTranslation = "bioskop",
        correctAnswer = "bioskop",
        audioToSpeak = "电影院",
        pictureOptions = listOf(
            PictureOption("u14_s3_p2_opt7_1", "bioskop", "", R.drawable.ic_hobby_cinema, true),
            PictureOption("u14_s3_p2_opt7_2", "sekolah", "", R.drawable.ic_edu_school, false),
            PictureOption("u14_s3_p2_opt7_3", "rumah", "", R.drawable.ic_fam_home, false),
            PictureOption("u14_s3_p2_opt7_4", "rumah sakit", "", R.drawable.ic_med_hospital, false)
        )
    ),

    // 8. Soal 8: Ketik Pinyin (bagus/menarik -> hǎokàn)
    Exercise(
        id = "u14_s3_p2_q8",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "bagus / menarik",
        sentenceWithBlank = "好看 (________)",
        targetHanzi = "好看",
        targetPinyin = "hǎokàn",
        correctAnswer = "haokan",
        keyboardKeys = listOf("h", "a", "o", "k", "n", "e", "i", "u", "b", "d", "g"),
        audioToSpeak = "好看"
    ),

    // 9. Soal 9: Susun Kalimat (Saya melihat Tuan Wang.)
    Exercise(
        id = "u14_s3_p2_q9",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Saya melihat Tuan Wang.",
        targetHanzi = "我 看见 王 先生 了。",
        targetPinyin = "Wǒ kànjiàn Wáng xiānsheng le.",
        wordChips = listOf("我:wǒ", "看见:kànjiàn", "王:Wáng", "先生:xiānsheng", "了:le", "李:Lǐ"),
        correctAnswer = "我,看见,王,先生,了",
        audioToSpeak = "我看看见王先生了。"
    ),

    // 10. Soal 10: Ketuk Pasangan yang Sesuai (Rangkuman Bioskop & Film)
    Exercise(
        id = "u14_s3_p2_m10_1",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u14_s3_p2_m10_1", "电影院", "diànyǐngyuàn", "bioskop"),
            MatchPairItem("u14_s3_p2_m10_2", "电影", "diànyǐng", "film"),
            MatchPairItem("u14_s3_p2_m10_3", "好看", "hǎokàn", "bagus ditonton"),
            MatchPairItem("u14_s3_p2_m10_4", "看见", "kànjiàn", "melihat / tampak")
        )
    )
)
