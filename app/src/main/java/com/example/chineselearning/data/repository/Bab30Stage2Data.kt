package com.example.chineselearning.data.repository

import com.example.chineselearning.R
import com.example.chineselearning.data.model.Exercise
import com.example.chineselearning.data.model.ExerciseType
import com.example.chineselearning.data.model.MatchPairItem
import com.example.chineselearning.data.model.PictureOption

val bab30Stage2Part1Exercises = listOf(
    // 1. Soal 1: Pilihan Gambar (周 -> minggu / pekan)
    Exercise(
        id = "u30_s2_p1_q1",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "周",
        targetPinyin = "zhōu",
        targetTranslation = "minggu / pekan",
        correctAnswer = "minggu / pekan",
        audioToSpeak = "周",
        pictureOptions = listOf(
            PictureOption("u30_s2_p1_opt1", "pekan", "", R.drawable.ic_cal_week_cycle, true),
            PictureOption("u30_s2_p1_opt2", "cerah", "", R.drawable.ic_weather_sunny_clear, false),
            PictureOption("u30_s2_p1_opt3", "mendung", "", R.drawable.ic_weather_overcast_cloud, false),
            PictureOption("u30_s2_p1_opt4", "mall", "", R.drawable.ic_shop_mall_plaza, false)
        )
    ),

    // 2. Soal 2: Susun Kalimat (Pekan depan kita akan mengadakan lomba karakter Hanzi.)
    Exercise(
        id = "u30_s2_p1_q2",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Pekan depan kita ada lomba Hanzi.",
        targetHanzi = "下周 我们 有 汉字 比赛。",
        targetPinyin = "Xiàzhōu wǒmen yǒu Hànzì bǐsài.",
        wordChips = listOf("下周:xiàzhōu", "我们:wǒmen", "有:yǒu", "汉字:Hànzì", "比赛。:bǐsài.", "考试:kǎoshì"),
        correctAnswer = "下周,我们,有,汉字,比赛。",
        audioToSpeak = "下周我们有汉字比赛。"
    ),

    // 3. Soal 3: Ketuk Pasangan yang Sesuai (Pekan & Langit Cerah)
    Exercise(
        id = "u30_s2_p1_q3",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u30_s2_p1_m1", "周", "zhōu", "minggu / pekan"),
            MatchPairItem("u30_s2_p1_m2", "晴", "qíng", "cerah"),
            MatchPairItem("u30_s2_p1_m3", "晴天", "qíngtiān", "hari cerah"),
            MatchPairItem("u30_s2_p1_m4", "下周", "xiàzhōu", "minggu depan")
        )
    ),

    // 4. Soal 4: Ketik Pinyin (minggu/pekan -> zhōu)
    Exercise(
        id = "u30_s2_p1_q4",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "minggu / pekan",
        sentenceWithBlank = "周 (________)",
        targetHanzi = "周",
        targetPinyin = "zhōu",
        correctAnswer = "zhou",
        keyboardKeys = listOf("z", "h", "o", "u", "a", "e", "i", "b", "d", "g", "j", "l"),
        audioToSpeak = "周"
    ),

    // 5. Soal 5: Mendengar Kalimat (Rule 10: illustrationRes = 0)
    Exercise(
        id = "u30_s2_p1_q5",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Apa yang Anda dengar?",
        targetTranslation = "Hari ini adalah hari yang cerah, matahari sangat terik.",
        targetHanzi = "今天 是 个 晴天， 太阳 大。",
        targetPinyin = "Jīntiān shì gè qíngtiān, tàiyáng dà.",
        wordChips = listOf("今天:jīntiān", "是:shì", "个:gè", "晴天，:qíngtiān,", "太阳:tàiyáng", "大。:dà.", "阴天:yīntiān"),
        correctAnswer = "今天,是,个,晴天，,太阳,大。",
        illustrationRes = 0,
        audioToSpeak = "今天是个晴天，太阳大。"
    ),

    // 6. Soal 6: Pilihan Kalimat
    Exercise(
        id = "u30_s2_p1_q6",
        type = ExerciseType.SENTENCE_CHOICE,
        title = "Pilih terjemahan yang benar",
        targetHanzi = "这 周 我 非常 忙。",
        targetPinyin = "Zhè zhōu wǒ fēicháng máng.",
        targetTranslation = "Pekan ini saya sangat sibuk.",
        correctAnswer = "Zhè zhōu wǒ fēicháng máng.\n这 周 我 非常 忙。",
        options = listOf(
            "Zhè zhōu wǒ fēicháng máng.\n这 周 我 非常 忙。",
            "Xià zhōu wǒ fēicháng máng.\n下 周 我 非常 忙。",
            "Zhè zhōu wǒ fēicháng qīngsōng.\n这 周 我 非常 轻松。"
        ),
        audioToSpeak = "这周我非常忙。"
    ),

    // 7. Soal 7: Pilihan Gambar (晴 -> langit cerah bersinar)
    Exercise(
        id = "u30_s2_p1_q7",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "晴",
        targetPinyin = "qíng",
        targetTranslation = "cerah",
        correctAnswer = "cerah",
        audioToSpeak = "晴",
        pictureOptions = listOf(
            PictureOption("u30_s2_p1_opt7_1", "cerah", "", R.drawable.ic_weather_sunny_clear, true),
            PictureOption("u30_s2_p1_opt7_2", "mendung", "", R.drawable.ic_weather_overcast_cloud, false),
            PictureOption("u30_s2_p1_opt7_3", "pekan", "", R.drawable.ic_cal_week_cycle, false),
            PictureOption("u30_s2_p1_opt7_4", "mall", "", R.drawable.ic_shop_mall_plaza, false)
        )
    ),

    // 8. Soal 8: Ketik Pinyin (cerah -> qíng)
    Exercise(
        id = "u30_s2_p1_q8",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "cerah",
        sentenceWithBlank = "晴 (________)",
        targetHanzi = "晴",
        targetPinyin = "qíng",
        correctAnswer = "qing",
        keyboardKeys = listOf("q", "i", "n", "g", "a", "e", "o", "u", "b", "d", "h", "j"),
        audioToSpeak = "晴"
    ),

    // 9. Soal 9: Susun Kalimat (Hari cerah kita pergi ke taman bermain bola.)
    Exercise(
        id = "u30_s2_p1_q9",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Hari cerah kita ke taman main bola.",
        targetHanzi = "晴天 我们 去 踢球。",
        targetPinyin = "Qíngtiān wǒmen qù tīqiú.",
        wordChips = listOf("晴天:qíngtiān", "我们:wǒmen", "去:qù", "踢球。:tīqiú.", "阴天:yīntiān"),
        correctAnswer = "晴天,我们,去,踢球。",
        audioToSpeak = "晴天我们去踢球。"
    ),

    // 10. Soal 10: Ketuk Pasangan yang Sesuai (Rangkuman Pekan & Cerah)
    Exercise(
        id = "u30_s2_p1_m10",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u30_s2_p1_m10_1", "周", "zhōu", "pekan"),
            MatchPairItem("u30_s2_p1_m10_2", "晴", "qíng", "cuaca cerah"),
            MatchPairItem("u30_s2_p1_m10_3", "大太阳", "dà tàiyáng", "mentari terik"),
            MatchPairItem("u30_s2_p1_m10_4", "踢足球", "tī zúqiú", "sepak bola")
        )
    )
)

val bab30Stage2Part2Exercises = listOf(
    // 1. Soal 1: Pilihan Gambar (阴 -> mendung / berawan)
    Exercise(
        id = "u30_s2_p2_q1",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "阴",
        targetPinyin = "yīn",
        targetTranslation = "mendung / berawan",
        correctAnswer = "mendung / berawan",
        audioToSpeak = "阴",
        pictureOptions = listOf(
            PictureOption("u30_s2_p2_opt1", "mendung", "", R.drawable.ic_weather_overcast_cloud, true),
            PictureOption("u30_s2_p2_opt2", "cerah", "", R.drawable.ic_weather_sunny_clear, false),
            PictureOption("u30_s2_p2_opt3", "pekan", "", R.drawable.ic_cal_week_cycle, false),
            PictureOption("u30_s2_p2_opt4", "trofi", "", R.drawable.ic_eval_mastery_trophy, false)
        )
    ),

    // 2. Soal 2: Susun Kalimat (Hari ini cuaca sangat mendung, sepertinya akan turun hujan.)
    Exercise(
        id = "u30_s2_p2_q2",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Hari ini mendung, sepertinya mau hujan.",
        targetHanzi = "今天 天 阴， 要 下雨 了。",
        targetPinyin = "Jīntiān tiān yīn, yào xiàyǔ le.",
        wordChips = listOf("今天:jīntiān", "天:tiān", "阴，:yīn,", "要:yào", "下雨:xiàyǔ", "了。:le.", "晴:qíng"),
        correctAnswer = "今天,天,阴，,要,下雨,了。",
        audioToSpeak = "今天天阴，要下雨了。"
    ),

    // 3. Soal 3: Ketuk Pasangan yang Sesuai (Cuaca Mendung & Kalender Pekan)
    Exercise(
        id = "u30_s2_p2_m3",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u30_s2_p2_m1", "阴", "yīn", "mendung"),
            MatchPairItem("u30_s2_p2_m2", "阴天", "yīntiān", "hari mendung"),
            MatchPairItem("u30_s2_p2_m3", "下周五", "xiàzhōuwǔ", "Jumat depan"),
            MatchPairItem("u30_s2_p2_m4", "要下雨", "yào xiàyǔ", "akan hujan")
        )
    ),

    // 4. Soal 4: Ketik Pinyin (mendung -> yīn)
    Exercise(
        id = "u30_s2_p2_q4",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "mendung / berawan",
        sentenceWithBlank = "阴 (________)",
        targetHanzi = "阴",
        targetPinyin = "yīn",
        correctAnswer = "yin",
        keyboardKeys = listOf("y", "i", "n", "a", "e", "o", "u", "b", "d", "g", "h", "j"),
        audioToSpeak = "阴"
    ),

    // 5. Soal 5: Mendengar Kalimat (Rule 10: illustrationRes = 0)
    Exercise(
        id = "u30_s2_p2_q5",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Apa yang Anda dengar?",
        targetTranslation = "Minggu depan kita akan pergi bersama-sama.",
        targetHanzi = "下周 我们 一起 去。",
        targetPinyin = "Xiàzhōu wǒmen yìqǐ qù.",
        wordChips = listOf("下周:xiàzhōu", "我们:wǒmen", "一起:yìqǐ", "去。:qù.", "来:lái"),
        correctAnswer = "下周,我们,一起,去。",
        illustrationRes = 0,
        audioToSpeak = "下周我们一起去。"
    ),

    // 6. Soal 6: Pilihan Kalimat
    Exercise(
        id = "u30_s2_p2_q6",
        type = ExerciseType.SENTENCE_CHOICE,
        title = "Pilih terjemahan yang benar",
        targetHanzi = "今天 阴天， 出门 记得 带 伞。",
        targetPinyin = "Jīntiān yīntiān, chūmén jìde dài sǎn.",
        targetTranslation = "Hari ini mendung, keluar rumah ingat bawa payung.",
        correctAnswer = "Jīntiān yīntiān, chūmén jìde dài sǎn.\n今天 阴天， 出门 记得 带 伞。",
        options = listOf(
            "Jīntiān yīntiān, chūmén jìde dài sǎn.\n今天 阴天， 出门 记得 带 伞。",
            "Jīntiān qíngtiān, chūmén jìde dài sǎn.\n今天 晴天， 出门 记得 带 伞。",
            "Jīntiān xiàyǔ, bié chūmén.\n今天 下雨， 别 出门。"
        ),
        audioToSpeak = "今天阴天，出门记得带伞。"
    ),

    // 7. Soal 7: Pilihan Gambar (下周 -> pekan depan)
    Exercise(
        id = "u30_s2_p2_q7",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "下周",
        targetPinyin = "xiàzhōu",
        targetTranslation = "pekan depan",
        correctAnswer = "pekan depan",
        audioToSpeak = "下周",
        pictureOptions = listOf(
            PictureOption("u30_s2_p2_opt7_1", "pekan", "", R.drawable.ic_cal_week_cycle, true),
            PictureOption("u30_s2_p2_opt7_2", "mendung", "", R.drawable.ic_weather_overcast_cloud, false),
            PictureOption("u30_s2_p2_opt7_3", "cerah", "", R.drawable.ic_weather_sunny_clear, false),
            PictureOption("u30_s2_p2_opt7_4", "mall", "", R.drawable.ic_shop_mall_plaza, false)
        )
    ),

    // 8. Soal 8: Ketik Pinyin (pekan depan -> xiàzhōu)
    Exercise(
        id = "u30_s2_p2_q8",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "pekan depan",
        sentenceWithBlank = "下周 (________)",
        targetHanzi = "下周",
        targetPinyin = "xiàzhōu",
        correctAnswer = "xiazhou",
        keyboardKeys = listOf("x", "i", "a", "z", "h", "o", "u", "e", "b", "d", "g", "j"),
        audioToSpeak = "下周"
    ),

    // 9. Soal 9: Susun Kalimat (Hari ini mendung, tidak ada matahari.)
    Exercise(
        id = "u30_s2_p2_q9",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Hari ini mendung, tidak ada matahari.",
        targetHanzi = "今天 阴天， 没有 太阳。",
        targetPinyin = "Jīntiān yīntiān, méiyǒu tàiyáng.",
        wordChips = listOf("今天:jīntiān", "阴天，:yīntiān,", "没有:méiyǒu", "太阳。:tàiyáng.", "有:yǒu"),
        correctAnswer = "今天,阴天，,没有,太阳。",
        audioToSpeak = "今天阴天，没有太阳。"
    ),

    // 10. Soal 10: Ketuk Pasangan yang Sesuai (Rangkuman Cuaca & Waktu)
    Exercise(
        id = "u30_s2_p2_m10",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u30_s2_p2_m10_1", "阴天", "yīntiān", "mendung berawan"),
            MatchPairItem("u30_s2_p2_m10_2", "下周见", "xiàzhōu jiàn", "jumpa pekan depan"),
            MatchPairItem("u30_s2_p2_m3", "带雨伞", "dài yǔsǎn", "membawa payung"),
            MatchPairItem("u30_s2_p2_m4", "天气阴", "tiānqì yīn", "cuaca kelabu")
        )
    )
)
