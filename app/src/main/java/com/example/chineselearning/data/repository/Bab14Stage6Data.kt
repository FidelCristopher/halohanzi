package com.example.chineselearning.data.repository

import com.example.chineselearning.R
import com.example.chineselearning.data.model.Exercise
import com.example.chineselearning.data.model.ExerciseType
import com.example.chineselearning.data.model.MatchPairItem
import com.example.chineselearning.data.model.PictureOption

val bab14Stage6Part1Exercises = listOf(
    // 1. Soal 1: Pilihan Gambar (电影 -> film)
    Exercise(
        id = "u14_s6_p1_q1",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "电影",
        targetPinyin = "diànyǐng",
        targetTranslation = "film",
        correctAnswer = "film",
        audioToSpeak = "电影",
        pictureOptions = listOf(
            PictureOption("u14_s6_p1_opt1", "film", "", R.drawable.ic_hobby_movie, true),
            PictureOption("u14_s6_p1_opt2", "buku", "", R.drawable.ic_book_chinese, false),
            PictureOption("u14_s6_p1_opt3", "mobil", "", R.drawable.ic_trans_car, false),
            PictureOption("u14_s6_p1_opt4", "teh", "", R.drawable.ic_food_tea, false)
        )
    ),

    // 2. Soal 2: Susun Kalimat (Saya suka mendengarkan lagu dan membaca buku.)
    Exercise(
        id = "u14_s6_p1_q2",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Saya suka dengar lagu.",
        targetHanzi = "我 喜欢 听 歌。",
        targetPinyin = "Wǒ xǐhuan tīng gē.",
        wordChips = listOf("我:wǒ", "喜欢:xǐhuan", "听:tīng", "歌:gē", "唱:chàng", "看:kàn"),
        correctAnswer = "我,喜欢,听,歌",
        audioToSpeak = "我喜欢听歌。"
    ),

    // 3. Soal 3: Ketuk Pasangan yang Sesuai (Rangkuman Bab 14 Bagian 1)
    Exercise(
        id = "u14_s6_p1_q3",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u14_s6_p1_m1", "喜欢", "xǐhuan", "suka"),
            MatchPairItem("u14_s6_p1_m2", "电影", "diànyǐng", "film"),
            MatchPairItem("u14_s6_p1_m3", "唱歌", "chànggē", "bernyanyi"),
            MatchPairItem("u14_s6_p1_m4", "好玩儿", "hǎowánr", "menyenangkan")
        )
    ),

    // 4. Soal 4: Ketik Pinyin (suka -> xǐhuan)
    Exercise(
        id = "u14_s6_p1_q4",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "suka / gemar",
        sentenceWithBlank = "喜欢 (________)",
        targetHanzi = "喜欢",
        targetPinyin = "xǐhuan",
        correctAnswer = "xihuan",
        keyboardKeys = listOf("x", "i", "h", "u", "a", "n", "e", "o", "b", "d", "g"),
        audioToSpeak = "喜欢"
    ),

    // 5. Soal 5: Mendengar Kalimat (Rule 10: illustrationRes = 0)
    Exercise(
        id = "u14_s6_p1_q5",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Apa yang Anda dengar?",
        targetTranslation = "Kucing ini sangat cantik.",
        targetHanzi = "这 只 猫 很 漂亮。",
        targetPinyin = "Zhè zhī māo hěn piàoliang.",
        wordChips = listOf("这:zhè", "只:zhī", "猫:māo", "很:hěn", "漂亮:piàoliang", "狗:gǒu"),
        correctAnswer = "这,只,猫,很,漂亮",
        illustrationRes = 0,
        audioToSpeak = "这只猫很漂亮。"
    ),

    // 6. Soal 6: Pilihan Kalimat
    Exercise(
        id = "u14_s6_p1_q6",
        type = ExerciseType.SENTENCE_CHOICE,
        title = "Pilih terjemahan yang benar",
        targetHanzi = "这个 电影 真 好看。",
        targetPinyin = "Zhège diànyǐng zhēn hǎokàn.",
        targetTranslation = "Film ini sungguh bagus ditonton.",
        correctAnswer = "Zhège diànyǐng zhēn hǎokàn.\n这个 电影 真 好看。",
        options = listOf(
            "Zhège diànyǐng zhēn hǎokàn.\n这个 电影 真 好看。",
            "Zhège diànyǐng zhēn hǎotīng.\n这个 电影 真 好听。",
            "Nàge diànyǐng zhēn hǎokàn.\n那个 电影 真 好看。"
        ),
        audioToSpeak = "这个电影真好看。"
    ),

    // 7. Soal 7: Pilihan Gambar (电影院 -> bioskop)
    Exercise(
        id = "u14_s6_p1_q7",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "电影院",
        targetPinyin = "diànyǐngyuàn",
        targetTranslation = "bioskop",
        correctAnswer = "bioskop",
        audioToSpeak = "电影院",
        pictureOptions = listOf(
            PictureOption("u14_s6_p1_opt7_1", "bioskop", "", R.drawable.ic_hobby_cinema, true),
            PictureOption("u14_s6_p1_opt7_2", "sekolah", "", R.drawable.ic_edu_school, false),
            PictureOption("u14_s6_p1_opt7_3", "rumah", "", R.drawable.ic_fam_home, false),
            PictureOption("u14_s6_p1_opt7_4", "toko", "", R.drawable.ic_shop_store, false)
        )
    ),

    // 8. Soal 8: Ketik Pinyin (film -> diànyǐng)
    Exercise(
        id = "u14_s6_p1_q8",
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

    // 9. Soal 9: Susun Kalimat (Saya punya seekor anak anjing.)
    Exercise(
        id = "u14_s6_p1_q9",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Saya punya seekor anjing kecil.",
        targetHanzi = "我 有 一 只 小狗。",
        targetPinyin = "Wǒ yǒu yì zhī xiǎogǒu.",
        wordChips = listOf("我:wǒ", "有:yǒu", "一:yì", "只:zhī", "小狗:xiǎogǒu", "小猫:xiǎomāo"),
        correctAnswer = "我,有,一,只,小狗",
        audioToSpeak = "我有一只小狗。"
    ),

    // 10. Soal 10: Ketuk Pasangan yang Sesuai (Rangkuman Seni & Hiburan)
    Exercise(
        id = "u14_s6_p1_m10_1",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u14_s6_p1_m10_1", "看电影", "kàn diànyǐng", "nonton film"),
            MatchPairItem("u14_s6_p1_m10_2", "听音乐", "tīng yīnyuè", "dengar musik"),
            MatchPairItem("u14_s6_p1_m10_3", "一只猫", "yì zhī māo", "seekor kucing"),
            MatchPairItem("u14_s6_p1_m10_4", "一只狗", "yì zhī gǒu", "seekor anjing")
        )
    )
)

val bab14Stage6Part2Exercises = listOf(
    // 1. Soal 1: Pilihan Gambar (猫 -> kucing)
    Exercise(
        id = "u14_s6_p2_q1",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "猫",
        targetPinyin = "māo",
        targetTranslation = "kucing",
        correctAnswer = "kucing",
        audioToSpeak = "猫",
        pictureOptions = listOf(
            PictureOption("u14_s6_p2_opt1", "kucing", "", R.drawable.ic_pet_cat, true),
            PictureOption("u14_s6_p2_opt2", "anjing", "", R.drawable.ic_pet_dog, false),
            PictureOption("u14_s6_p2_opt3", "buah", "", R.drawable.ic_food_fruits, false),
            PictureOption("u14_s6_p2_opt4", "apel", "", R.drawable.ic_food_apple, false)
        )
    ),

    // 2. Soal 2: Susun Kalimat (Lagu ini sangat merdu didengarkan.)
    Exercise(
        id = "u14_s6_p2_q2",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Lagu ini sangat enak didengar.",
        targetHanzi = "这 首 歌 很 好听。",
        targetPinyin = "Zhè shǒu gē hěn hǎotīng.",
        wordChips = listOf("这:zhè", "首:shǒu", "歌:gē", "很:hěn", "好听:hǎotīng", "好看:hǎokàn"),
        correctAnswer = "这,首,歌,很,好听",
        audioToSpeak = "这首歌很好听。"
    ),

    // 3. Soal 3: Ketuk Pasangan yang Sesuai (Grand Review Bab 14)
    Exercise(
        id = "u14_s6_p2_m3",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u14_s6_p2_m1", "好听", "hǎotīng", "enak didengar"),
            MatchPairItem("u14_s6_p2_m2", "好看", "hǎokàn", "bagus ditonton"),
            MatchPairItem("u14_s6_p2_m3", "漂亮", "piàoliang", "cantik"),
            MatchPairItem("u14_s6_p2_m4", "好玩儿", "hǎowánr", "asyik")
        )
    ),

    // 4. Soal 4: Ketik Pinyin (merdu -> hǎotīng)
    Exercise(
        id = "u14_s6_p2_q4",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "merdu / enak didengar",
        sentenceWithBlank = "好听 (________)",
        targetHanzi = "好听",
        targetPinyin = "hǎotīng",
        correctAnswer = "haoting",
        keyboardKeys = listOf("h", "a", "o", "t", "i", "n", "g", "e", "u", "b", "d"),
        audioToSpeak = "好听"
    ),

    // 5. Soal 5: Mendengar Kalimat (Rule 10: illustrationRes = 0)
    Exercise(
        id = "u14_s6_p2_q5",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Apa yang Anda dengar?",
        targetTranslation = "Hari Minggu kita pergi nonton film.",
        targetHanzi = "星期日 我们 去 看 电影。",
        targetPinyin = "Xīngqīrì wǒmen qù kàn diànyǐng.",
        wordChips = listOf("星期日:xīngqīrì", "我们:wǒmen", "去:qù", "看:kàn", "电影:diànyǐng", "电视:diànshì"),
        correctAnswer = "星期日,我们,去,看,电影",
        illustrationRes = 0,
        audioToSpeak = "星期日我们去看电影。"
    ),

    // 6. Soal 6: Pilihan Kalimat
    Exercise(
        id = "u14_s6_p2_q6",
        type = ExerciseType.SENTENCE_CHOICE,
        title = "Pilih terjemahan yang benar",
        targetHanzi = "妹妹 爱 唱 中文 歌。",
        targetPinyin = "Mèimei ài chàng Zhōngwén gē.",
        targetTranslation = "Adik gemar bernyanyi lagu Mandarin.",
        correctAnswer = "Mèimei ài chàng Zhōngwén gē.\n妹妹 爱 唱 中文 歌。",
        options = listOf(
            "Mèimei ài chàng Zhōngwén gē.\n妹妹 爱 唱 中文 歌。",
            "Jiějie ài chàng Zhōngwén gē.\n姐姐 爱 唱 中文 歌。",
            "Mèimei ài tīng Zhōngwén gē.\n妹妹 爱 听 中文 歌。"
        ),
        audioToSpeak = "妹妹爱唱中文歌。"
    ),

    // 7. Soal 7: Pilihan Gambar (漂亮 -> cantik)
    Exercise(
        id = "u14_s6_p2_q7",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "漂亮",
        targetPinyin = "piàoliang",
        targetTranslation = "cantik / indah",
        correctAnswer = "cantik / indah",
        audioToSpeak = "漂亮",
        pictureOptions = listOf(
            PictureOption("u14_s6_p2_opt7_1", "cantik", "", R.drawable.ic_hobby_pretty, true),
            PictureOption("u14_s6_p2_opt7_2", "buruk", "", R.drawable.ic_mod_wrong, false),
            PictureOption("u14_s6_p2_opt7_3", "makanan", "", R.drawable.ic_food_rice, false),
            PictureOption("u14_s6_p2_opt7_4", "mobil", "", R.drawable.ic_trans_car, false)
        )
    ),

    // 8. Soal 8: Ketik Pinyin (cantik -> piàoliang)
    Exercise(
        id = "u14_s6_p2_q8",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "cantik / indah",
        sentenceWithBlank = "漂亮 (________)",
        targetHanzi = "漂亮",
        targetPinyin = "piàoliang",
        correctAnswer = "piaoliang",
        keyboardKeys = listOf("p", "i", "a", "o", "l", "n", "g", "e", "u", "b", "d"),
        audioToSpeak = "漂亮"
    ),

    // 9. Soal 9: Susun Kalimat (Grand Evaluasi Bab 14)
    Exercise(
        id = "u14_s6_p2_q9",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Kami bersama mendengarkan musik.",
        targetHanzi = "我们 一起 听 音乐。",
        targetPinyin = "Wǒmen yìqǐ tīng yīnyuè.",
        wordChips = listOf("我们:wǒmen", "一起:yìqǐ", "听:tīng", "音乐:yīnyuè", "唱歌:chànggē"),
        correctAnswer = "我们,一起,听,音乐",
        audioToSpeak = "我们一起听音乐。"
    ),

    // 10. Soal 10: Ketuk Pasangan yang Sesuai (Grand Review Akhir Bab 14)
    Exercise(
        id = "u14_s6_p2_m10_1",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u14_s6_p2_m10_1", "看电视", "kàn diànshì", "nonton TV"),
            MatchPairItem("u14_s6_p2_m10_2", "看电影", "kàn diànyǐng", "nonton film"),
            MatchPairItem("u14_s6_p2_m10_3", "一只猫", "yì zhī māo", "seekor kucing"),
            MatchPairItem("u14_s6_p2_m10_4", "真漂亮", "zhēn piàoliang", "sungguh cantik")
        )
    )
)
