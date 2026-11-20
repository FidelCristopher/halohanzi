package com.example.chineselearning.data.repository

import com.example.chineselearning.R
import com.example.chineselearning.data.model.Exercise
import com.example.chineselearning.data.model.ExerciseType
import com.example.chineselearning.data.model.MatchPairItem
import com.example.chineselearning.data.model.PictureOption

val bab25Stage2Part1Exercises = listOf(
    // 1. Soal 1: Pilihan Gambar (足球 -> sepak bola)
    Exercise(
        id = "u25_s2_p1_q1",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "足球",
        targetPinyin = "zúqiú",
        targetTranslation = "sepak bola",
        correctAnswer = "sepak bola",
        audioToSpeak = "足球",
        pictureOptions = listOf(
            PictureOption("u25_s2_p1_opt1", "sepak bola", "", R.drawable.ic_sport_soccer, true),
            PictureOption("u25_s2_p1_opt2", "basket", "", R.drawable.ic_sport_basketball, false),
            PictureOption("u25_s2_p1_opt3", "menendang bola", "", R.drawable.ic_sport_kick_ball, false),
            PictureOption("u25_s2_p1_opt4", "renang", "", R.drawable.ic_sport_swim, false)
        )
    ),

    // 2. Soal 2: Susun Kalimat (Anak-anak laki-laki bermain sepak bola di lapangan.)
    Exercise(
        id = "u25_s2_p1_q2",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Anak-anak bermain bola di lapangan.",
        targetHanzi = "男孩子们 在 操场 踢球。",
        targetPinyin = "Nánháizimen zài cāochǎng tīqiú.",
        wordChips = listOf("男孩子们:nánháizimen", "在:zài", "操场:cāochǎng", "踢球。:tīqiú.", "教室:jiàoshì"),
        correctAnswer = "男孩子们,在,操场,踢球。",
        audioToSpeak = "男孩子们在操场踢球。"
    ),

    // 3. Soal 3: Ketuk Pasangan yang Sesuai (Menendang & Sepak Bola)
    Exercise(
        id = "u25_s2_p1_q3",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u25_s2_p1_m1", "踢", "tī", "menendang"),
            MatchPairItem("u25_s2_p1_m2", "足球", "zúqiú", "sepak bola"),
            MatchPairItem("u25_s2_p1_m3", "踢足球", "tī zúqiú", "main sepak bola"),
            MatchPairItem("u25_s2_p1_m4", "操场", "cāochǎng", "lapangan")
        )
    ),

    // 4. Soal 4: Ketik Pinyin (menendang -> tī)
    Exercise(
        id = "u25_s2_p1_q4",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "menendang",
        sentenceWithBlank = "踢 (________)",
        targetHanzi = "踢",
        targetPinyin = "tī",
        correctAnswer = "ti",
        keyboardKeys = listOf("t", "i", "a", "e", "o", "u", "b", "d", "g", "h", "j", "l"),
        audioToSpeak = "踢"
    ),

    // 5. Soal 5: Mendengar Kalimat (Rule 10: illustrationRes = 0)
    Exercise(
        id = "u25_s2_p1_q5",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Apa yang Anda dengar?",
        targetTranslation = "Saya suka menonton pertandingan sepak bola.",
        targetHanzi = "我 喜欢 看 足球 比赛。",
        targetPinyin = "Wǒ xǐhuan kàn zúqiú bǐsài.",
        wordChips = listOf("我:wǒ", "喜欢:xǐhuan", "看:kàn", "足球:zúqiú", "比赛。:bǐsài.", "电影:diànyǐng"),
        correctAnswer = "我,喜欢,看,足球,比赛。",
        illustrationRes = 0,
        audioToSpeak = "我喜欢看足球比赛。"
    ),

    // 6. Soal 6: Pilihan Kalimat
    Exercise(
        id = "u25_s2_p1_q6",
        type = ExerciseType.SENTENCE_CHOICE,
        title = "Pilih terjemahan yang benar",
        targetHanzi = "下午 我们 一起 去 踢 足球 吧。",
        targetPinyin = "Xiàwǔ wǒmen yìqǐ qù tī zúqiú ba.",
        targetTranslation = "Sore hari ayo kita main sepak bola bersama-sama.",
        correctAnswer = "Xiàwǔ wǒmen yìqǐ qù tī zúqiú ba.\n下午 我们 一起 去 踢 足球 吧。",
        options = listOf(
            "Xiàwǔ wǒmen yìqǐ qù tī zúqiú ba.\n下午 我们 一起 去 踢 足球 吧。",
            "Xiàwǔ wǒmen yìqǐ qù dǎ lánqiú ba.\n下午 我们 一起 去 打 篮球 吧。",
            "Shàngwǔ wǒmen yìqǐ qù tī zúqiú ba.\n上午 我们 一起 去 踢 足球 吧。"
        ),
        audioToSpeak = "下午我们一起去踢足球吧。"
    ),

    // 7. Soal 7: Pilihan Gambar (踢 -> menendang bola)
    Exercise(
        id = "u25_s2_p1_q7",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "踢",
        targetPinyin = "tī",
        targetTranslation = "menendang",
        correctAnswer = "menendang",
        audioToSpeak = "踢",
        pictureOptions = listOf(
            PictureOption("u25_s2_p1_opt7_1", "menendang bola", "", R.drawable.ic_sport_kick_ball, true),
            PictureOption("u25_s2_p1_opt7_2", "sepak bola", "", R.drawable.ic_sport_soccer, false),
            PictureOption("u25_s2_p1_opt7_3", "basket", "", R.drawable.ic_sport_basketball, false),
            PictureOption("u25_s2_p1_opt7_4", "renang", "", R.drawable.ic_sport_swim, false)
        )
    ),

    // 8. Soal 8: Ketik Pinyin (sepak bola -> zúqiú)
    Exercise(
        id = "u25_s2_p1_q8",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "sepak bola",
        sentenceWithBlank = "足球 (________)",
        targetHanzi = "足球",
        targetPinyin = "zúqiú",
        correctAnswer = "zuqiu",
        keyboardKeys = listOf("z", "u", "q", "i", "a", "e", "o", "b", "d", "g", "h", "j"),
        audioToSpeak = "足球"
    ),

    // 9. Soal 9: Susun Kalimat (Dia menendang bola ke dalam gawang.)
    Exercise(
        id = "u25_s2_p1_q9",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Dia menendang bola masuk.",
        targetHanzi = "他 把 球 踢 进去 了。",
        targetPinyin = "Tā bǎ qiú tī jìnqù le.",
        wordChips = listOf("他:tā", "把:bǎ", "球:qiú", "踢:tī", "进去:jìnqù", "了。:le.", "出来:chūlái"),
        correctAnswer = "他,把,球,踢,进去,了。",
        audioToSpeak = "他把球踢进去了。"
    ),

    // 10. Soal 10: Ketuk Pasangan yang Sesuai (Rangkuman Sepak Bola)
    Exercise(
        id = "u25_s2_p1_m10",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u25_s2_p1_m10_1", "踢", "tī", "menendang"),
            MatchPairItem("u25_s2_p1_m2", "足球", "zúqiú", "sepak bola"),
            MatchPairItem("u25_s2_p1_m3", "足球比赛", "zúqiú bǐsài", "laga sepak bola"),
            MatchPairItem("u25_s2_p1_m4", "看比赛", "kàn bǐsài", "nonton tanding")
        )
    )
)

val bab25Stage2Part2Exercises = listOf(
    // 1. Soal 1: Pilihan Gambar (篮球 -> bola basket)
    Exercise(
        id = "u25_s2_p2_q1",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "篮球",
        targetPinyin = "lánqiú",
        targetTranslation = "bola basket",
        correctAnswer = "bola basket",
        audioToSpeak = "篮球",
        pictureOptions = listOf(
            PictureOption("u25_s2_p2_opt1", "basket", "", R.drawable.ic_sport_basketball, true),
            PictureOption("u25_s2_p2_opt2", "sepak bola", "", R.drawable.ic_sport_soccer, false),
            PictureOption("u25_s2_p2_opt3", "menendang bola", "", R.drawable.ic_sport_kick_ball, false),
            PictureOption("u25_s2_p2_opt4", "renang", "", R.drawable.ic_sport_swim, false)
        )
    ),

    // 2. Soal 2: Susun Kalimat (Adik laki-laki badannya tinggi, sangat pandai bermain basket.)
    Exercise(
        id = "u25_s2_p2_q2",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Adik tinggi, pintar main basket.",
        targetHanzi = "弟弟 很 会 打 篮球。",
        targetPinyin = "Dìdi hěn huì dǎ lánqiú.",
        wordChips = listOf("弟弟:dìdi", "很:hěn", "会:huì", "打:dǎ", "篮球。:lánqiú.", "踢:tī"),
        correctAnswer = "弟弟,很,会,打,篮球。",
        audioToSpeak = "弟弟很会打篮球。"
    ),

    // 3. Soal 3: Ketuk Pasangan yang Sesuai (Basket & Bola)
    Exercise(
        id = "u25_s2_p2_m3",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u25_s2_p2_m1", "篮球", "lánqiú", "bola basket"),
            MatchPairItem("u25_s2_p2_m2", "打", "dǎ", "bermain (tangan)"),
            MatchPairItem("u25_s2_p2_m3", "球", "qiú", "bola"),
            MatchPairItem("u25_s2_p2_m4", "打篮球", "dǎ lánqiú", "main basket")
        )
    ),

    // 4. Soal 4: Ketik Pinyin (bola basket -> lánqiú)
    Exercise(
        id = "u25_s2_p2_q4",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "bola basket",
        sentenceWithBlank = "篮球 (________)",
        targetHanzi = "篮球",
        targetPinyin = "lánqiú",
        correctAnswer = "lanqiu",
        keyboardKeys = listOf("l", "a", "n", "q", "i", "u", "e", "o", "b", "d", "g", "h"),
        audioToSpeak = "篮球"
    ),

    // 5. Soal 5: Mendengar Kalimat (Rule 10: illustrationRes = 0)
    Exercise(
        id = "u25_s2_p2_q5",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Apa yang Anda dengar?",
        targetTranslation = "Sore hari kami bersama-sama pergi bermain bulu tangkis.",
        targetHanzi = "下午 我们 一起 去 打球。",
        targetPinyin = "Xiàwǔ wǒmen yìqǐ qù dǎqiú.",
        wordChips = listOf("下午:xiàwǔ", "我们:wǒmen", "一起:yìqǐ", "去:qù", "打球。:dǎqiú.", "游泳:yóuyǒng"),
        correctAnswer = "下午,我们,一起,去,打球。",
        illustrationRes = 0,
        audioToSpeak = "下午我们一起去打球。"
    ),

    // 6. Soal 6: Pilihan Kalimat
    Exercise(
        id = "u25_s2_p2_q6",
        type = ExerciseType.SENTENCE_CHOICE,
        title = "Pilih terjemahan yang benar",
        targetHanzi = "这个 球 是 谁 踢 到 草丛 里的？",
        targetPinyin = "Zhège qiú shì shéi tī dào cǎocóng lǐ de?",
        targetTranslation = "Bola ini siapa yang menendangnya ke dalam semak rumput?",
        correctAnswer = "Zhège qiú shì shéi tī dào cǎocóng lǐ de?\n这个 球 是 谁 踢 到 草丛 里的？",
        options = listOf(
            "Zhège qiú shì shéi tī dào cǎocóng lǐ de?\n这个 球 是 谁 踢 到 草丛 里的？",
            "Zhège qiú shì shéi rēng dào shuǐ lǐ de?\n这个 球 是 谁 扔 到 水 里的？",
            "Zhège qiú bú shì wǒ de.\n这个 球 不 是 我 的。"
        ),
        audioToSpeak = "这个球是谁踢到草丛里的？"
    ),

    // 7. Soal 7: Pilihan Gambar (打 -> bermain olahraga tangan)
    Exercise(
        id = "u25_s2_p2_q7",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "打",
        targetPinyin = "dǎ",
        targetTranslation = "bermain (tangan)",
        correctAnswer = "bermain (tangan)",
        audioToSpeak = "打",
        pictureOptions = listOf(
            PictureOption("u25_s2_p2_opt7_1", "main basket", "", R.drawable.ic_sport_basketball, true),
            PictureOption("u25_s2_p2_opt7_2", "tendang bola", "", R.drawable.ic_sport_kick_ball, false),
            PictureOption("u25_s2_p2_opt7_3", "lari", "", R.drawable.ic_sport_running, false),
            PictureOption("u25_s2_p2_opt7_4", "renang", "", R.drawable.ic_sport_swim, false)
        )
    ),

    // 8. Soal 8: Ketik Pinyin (bermain/memukul -> dǎ)
    Exercise(
        id = "u25_s2_p2_q8",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "bermain / memukul",
        sentenceWithBlank = "打 (________)",
        targetHanzi = "打",
        targetPinyin = "dǎ",
        correctAnswer = "da",
        keyboardKeys = listOf("d", "a", "e", "i", "o", "u", "b", "g", "h", "j", "l", "m"),
        audioToSpeak = "打"
    ),

    // 9. Soal 9: Susun Kalimat (Saya suka bermain bola basket.)
    Exercise(
        id = "u25_s2_p2_q9",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Saya suka bermain basket.",
        targetHanzi = "我 喜欢 打 篮球。",
        targetPinyin = "Wǒ xǐhuan dǎ lánqiú.",
        wordChips = listOf("我:wǒ", "喜欢:xǐhuan", "打:dǎ", "篮球。:lánqiú.", "踢:tī"),
        correctAnswer = "我,喜欢,打,篮球。",
        audioToSpeak = "我喜欢打篮球。"
    ),

    // 10. Soal 10: Ketuk Pasangan yang Sesuai (Rangkuman Olahraga Bola)
    Exercise(
        id = "u25_s2_p2_m10",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u25_s2_p2_m10_1", "打篮球", "dǎ lánqiú", "main basket"),
            MatchPairItem("u25_s2_p2_m2", "踢足球", "tī zúqiú", "main sepak bola"),
            MatchPairItem("u25_s2_p2_m3", "打球", "dǎqiú", "main bola"),
            MatchPairItem("u25_s2_p2_m4", "很喜欢", "hěn xǐhuan", "sangat suka")
        )
    )
)
