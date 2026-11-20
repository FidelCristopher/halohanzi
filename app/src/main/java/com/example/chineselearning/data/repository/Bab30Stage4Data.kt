package com.example.chineselearning.data.repository

import com.example.chineselearning.R
import com.example.chineselearning.data.model.Exercise
import com.example.chineselearning.data.model.ExerciseType
import com.example.chineselearning.data.model.MatchPairItem
import com.example.chineselearning.data.model.PictureOption

val bab30Stage4Part1Exercises = listOf(
    // 1. Soal 1: Pilihan Gambar (从 -> dari arah asal waktu)
    Exercise(
        id = "u30_s4_p1_q1",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "从",
        targetPinyin = "cóng",
        targetTranslation = "dari (arah / asal / waktu)",
        correctAnswer = "dari (arah / asal / waktu)",
        audioToSpeak = "从",
        pictureOptions = listOf(
            PictureOption("u30_s4_p1_opt1", "dari", "", R.drawable.ic_eval_mastery_trophy, true),
            PictureOption("u30_s4_p1_opt2", "pekan", "", R.drawable.ic_cal_week_cycle, false),
            PictureOption("u30_s4_p1_opt3", "mall", "", R.drawable.ic_shop_mall_plaza, false),
            PictureOption("u30_s4_p1_opt4", "10.000", "", R.drawable.ic_fin_ten_thousand, false)
        )
    ),

    // 2. Soal 2: Susun Kalimat (Dari sekolah ke rumah saya hanya butuh sepuluh menit.)
    Exercise(
        id = "u30_s4_p1_q2",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Dari sekolah ke rumah 10 menit.",
        targetHanzi = "从 学校 到 我家 只要 十 分钟。",
        targetPinyin = "Cóng xuéxiào dào wǒjiā zhǐyào shí fēnzhōng.",
        wordChips = listOf("从:cóng", "学校:xuéxiào", "到:dào", "我家:wǒjiā", "只要:zhǐyào", "十:shí", "分钟。:fēnzhōng.", "小时:xiǎoshí"),
        correctAnswer = "从,学校,到,我家,只要,十,分钟。",
        audioToSpeak = "从学校到我家只要十分钟。"
    ),

    // 3. Soal 3: Ketuk Pasangan yang Sesuai (Dari & Langsung)
    Exercise(
        id = "u30_s4_p1_q3",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u30_s4_p1_m1", "从", "cóng", "dari (asal)"),
            MatchPairItem("u30_s4_p1_m2", "就", "jiù", "langsung / maka"),
            MatchPairItem("u30_s4_p1_m3", "从头到尾", "cóngtóu dào wěi", "dari awal sampai akhir"),
            MatchPairItem("u30_s4_p1_m4", "就到了", "jiù dào le", "langsung sampai")
        )
    ),

    // 4. Soal 4: Ketik Pinyin (dari -> cóng)
    Exercise(
        id = "u30_s4_p1_q4",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "dari",
        sentenceWithBlank = "从 (________)",
        targetHanzi = "从",
        targetPinyin = "cóng",
        correctAnswer = "cong",
        keyboardKeys = listOf("c", "o", "n", "g", "a", "e", "i", "u", "b", "d", "h", "j"),
        audioToSpeak = "从"
    ),

    // 5. Soal 5: Mendengar Kalimat (Rule 10: illustrationRes = 0)
    Exercise(
        id = "u30_s4_p1_q5",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Apa yang Anda dengar?",
        targetTranslation = "Meminum teh panas, kepala saya langsung tidak sakit lagi.",
        targetHanzi = "喝 热茶 头 就 不 疼 了。",
        targetPinyin = "Hē rèchá tóu jiù bù téng le.",
        wordChips = listOf("喝:hē", "热茶:rèchá", "头:tóu", "就:jiù", "不:bù", "疼:téng", "了。:le.", "很:hěn"),
        correctAnswer = "喝,热茶,头,就,不,疼,了。",
        illustrationRes = 0,
        audioToSpeak = "喝热茶头就不疼了。"
    ),

    // 6. Soal 6: Pilihan Kalimat
    Exercise(
        id = "u30_s4_p1_q6",
        type = ExerciseType.SENTENCE_CHOICE,
        title = "Pilih terjemahan yang benar",
        targetHanzi = "走 过 车站 就 到 了。",
        targetPinyin = "Zǒu guò chēzhàn jiù dào le.",
        targetTranslation = "Berjalan melewati stasiun langsung sampai.",
        correctAnswer = "Zǒu guò chēzhàn jiù dào le.\n走 过 车站 就 到 了。",
        options = listOf(
            "Zǒu guò chēzhàn jiù dào le.\n走 过 车站 就 到 了。",
            "Zǒu guò xuéxiào jiù dào le.\n走 过 学校 就 到 了。",
            "Zǒu guò chēzhàn hái méi dào.\n走 过 车站 还 没 到。"
        ),
        audioToSpeak = "走过车站就到了。"
    ),

    // 7. Soal 7: Pilihan Gambar (就 -> langsung / segera)
    Exercise(
        id = "u30_s4_p1_q7",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "就",
        targetPinyin = "jiù",
        targetTranslation = "langsung",
        correctAnswer = "langsung",
        audioToSpeak = "就",
        pictureOptions = listOf(
            PictureOption("u30_s4_p1_opt7_1", "langsung", "", R.drawable.ic_eval_mastery_trophy, true),
            PictureOption("u30_s4_p1_opt7_2", "pekan", "", R.drawable.ic_cal_week_cycle, false),
            PictureOption("u30_s4_p1_opt7_3", "mendung", "", R.drawable.ic_weather_overcast_cloud, false),
            PictureOption("u30_s4_p1_opt7_4", "cerah", "", R.drawable.ic_weather_sunny_clear, false)
        )
    ),

    // 8. Soal 8: Ketik Pinyin (langsung -> jiù)
    Exercise(
        id = "u30_s4_p1_q8",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "langsung / maka",
        sentenceWithBlank = "就 (________)",
        targetHanzi = "就",
        targetPinyin = "jiù",
        correctAnswer = "jiu",
        keyboardKeys = listOf("j", "i", "u", "a", "e", "o", "b", "d", "g", "h", "l", "m"),
        audioToSpeak = "就"
    ),

    // 9. Soal 9: Susun Kalimat (Dari sini jalan kaki sangat dekat.)
    Exercise(
        id = "u30_s4_p1_q9",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Dari sini jalan kaki sangat dekat.",
        targetHanzi = "从 这里 走路 很 近。",
        targetPinyin = "Cóng zhèlǐ zǒulù hěn jìn.",
        wordChips = listOf("从:cóng", "这里:zhèlǐ", "走路:zǒulù", "很:hěn", "近。:jìn.", "远:yuǎn"),
        correctAnswer = "从,这里,走路,很,近。",
        audioToSpeak = "从这里走路很近。"
    ),

    // 10. Soal 10: Ketuk Pasangan yang Sesuai (Rangkuman Asal Arah)
    Exercise(
        id = "u30_s4_p1_m10",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u30_s4_p1_m10_1", "从这里", "cóng zhèlǐ", "dari sini"),
            MatchPairItem("u30_s4_p1_m10_2", "到了", "dào le", "sudah sampai"),
            MatchPairItem("u30_s4_p1_m3", "这就去", "zhè jiù qù", "segera berangkat"),
            MatchPairItem("u30_s4_p1_m4", "从小", "cóngxiǎo", "sejak kecil")
        )
    )
)

val bab30Stage4Part2Exercises = listOf(
    // 1. Soal 1: Pilihan Gambar (着 -> partikel aspek duratif keadaan)
    Exercise(
        id = "u30_s4_p2_q1",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "着",
        targetPinyin = "zhe",
        targetTranslation = "partikel duratif (berlangsung)",
        correctAnswer = "partikel duratif (berlangsung)",
        audioToSpeak = "着",
        pictureOptions = listOf(
            PictureOption("u30_s4_p2_opt1", "duratif keadaan", "", R.drawable.ic_eval_mastery_trophy, true),
            PictureOption("u30_s4_p2_opt2", "pekan", "", R.drawable.ic_cal_week_cycle, false),
            PictureOption("u30_s4_p2_opt3", "mall", "", R.drawable.ic_shop_mall_plaza, false),
            PictureOption("u30_s4_p2_opt4", "10.000", "", R.drawable.ic_fin_ten_thousand, false)
        )
    ),

    // 2. Soal 2: Susun Kalimat (Saat bersantap makan tolong jangan berbicara dengan suara keras.)
    Exercise(
        id = "u30_s4_p2_q2",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Saat makan jangan bicara keras.",
        targetHanzi = "吃饭 时 别 大声 说话。",
        targetPinyin = "Chīfàn shí bié dàshēng shuōhuà.",
        wordChips = listOf("吃饭:chīfàn", "时:shí", "别:bié", "大声:dàshēng", "说话。:shuōhuà.", "请:qǐng"),
        correctAnswer = "吃饭,时,别,大声,说话。",
        audioToSpeak = "吃饭时别大声说话。"
    ),

    // 3. Soal 3: Ketuk Pasangan yang Sesuai (Saat Waktu & Keadaan Duratif)
    Exercise(
        id = "u30_s4_p2_m3",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u30_s4_p2_m1", "时", "shí", "saat / ketika"),
            MatchPairItem("u30_s4_p2_m2", "着", "zhe", "sedang berstatus"),
            MatchPairItem("u30_s4_p2_m3", "开着门", "kāi zhe mén", "pintu terbuka"),
            MatchPairItem("u30_s4_p2_m4", "下着雨", "xià zhe yǔ", "sedang hujan")
        )
    ),

    // 4. Soal 4: Ketik Pinyin (saat/ketika -> shí)
    Exercise(
        id = "u30_s4_p2_q4",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "saat / waktu / ketika",
        sentenceWithBlank = "时 (________)",
        targetHanzi = "时",
        targetPinyin = "shí",
        correctAnswer = "shi",
        keyboardKeys = listOf("s", "h", "i", "a", "e", "o", "u", "b", "d", "g", "j", "l"),
        audioToSpeak = "时"
    ),

    // 5. Soal 5: Mendengar Kalimat (Rule 10: illustrationRes = 0)
    Exercise(
        id = "u30_s4_p2_q5",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Apa yang Anda dengar?",
        targetTranslation = "Pintu terbuka, silakan langsung masuk.",
        targetHanzi = "门 开 着， 请 进。",
        targetPinyin = "Mén kāi zhe, qǐng jìn.",
        wordChips = listOf("门:mén", "开:kāi", "着，:zhe,", "请:qǐng", "进。:jìn.", "关:guān"),
        correctAnswer = "门,开,着，,请,进。",
        illustrationRes = 0,
        audioToSpeak = "门开着，请进。"
    ),

    // 6. Soal 6: Pilihan Kalimat
    Exercise(
        id = "u30_s4_p2_q6",
        type = ExerciseType.SENTENCE_CHOICE,
        title = "Pilih terjemahan yang benar",
        targetHanzi = "他 穿 着 一 件 黑色 衣服。",
        targetPinyin = "Tā chuān zhe yí jiàn hēisè yīfu.",
        targetTranslation = "Dia sedang mengenakan sehelai pakaian berwarna hitam.",
        correctAnswer = "Tā chuān zhe yí jiàn hēisè yīfu.\n他 穿 着 一 件 黑色 衣服。",
        options = listOf(
            "Tā chuān zhe yí jiàn hēisè yīfu.\n他 穿 着 一 件 黑色 衣服。",
            "Tā chuān zhe yí jiàn báisè yīfu.\n他 穿 着 一 件 白色 衣服。",
            "Tā méiyǒu chuān yīfu.\n他 没有 穿 衣服。"
        ),
        audioToSpeak = "他穿着一件黑色衣服。"
    ),

    // 7. Soal 7: Pilihan Gambar (开着门 -> pintu dalam kondisi terbuka)
    Exercise(
        id = "u30_s4_p2_q7",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "开着",
        targetPinyin = "kāi zhe",
        targetTranslation = "terbuka (berstatus)",
        correctAnswer = "terbuka (berstatus)",
        audioToSpeak = "开着",
        pictureOptions = listOf(
            PictureOption("u30_s4_p2_opt7_1", "terbuka", "", R.drawable.ic_eval_mastery_trophy, true),
            PictureOption("u30_s4_p2_opt7_2", "pekan", "", R.drawable.ic_cal_week_cycle, false),
            PictureOption("u30_s4_p2_opt7_3", "mall", "", R.drawable.ic_shop_mall_plaza, false),
            PictureOption("u30_s4_p2_opt7_4", "cerah", "", R.drawable.ic_weather_sunny_clear, false)
        )
    ),

    // 8. Soal 8: Ketik Pinyin (partikel duratif -> zhe)
    Exercise(
        id = "u30_s4_p2_q8",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "partikel duratif",
        sentenceWithBlank = "着 (________)",
        targetHanzi = "着",
        targetPinyin = "zhe",
        correctAnswer = "zhe",
        keyboardKeys = listOf("z", "h", "e", "a", "i", "o", "u", "b", "d", "g", "j", "l"),
        audioToSpeak = "着"
    ),

    // 9. Soal 9: Susun Kalimat (Di atas meja diletakkan secangkir teh.)
    Exercise(
        id = "u30_s4_p2_q9",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Di atas meja ada secangkir teh.",
        targetHanzi = "桌子 上 放 着 茶。",
        targetPinyin = "Zhuōzi shang fàng zhe chá.",
        wordChips = listOf("桌子:zhuōzi", "上:shang", "放:fàng", "着:zhe", "茶。:chá.", "水:shuǐ"),
        correctAnswer = "桌子,上,放,着,茶。",
        audioToSpeak = "桌子上放着茶。"
    ),

    // 10. Soal 10: Ketuk Pasangan yang Sesuai (Rangkuman Status Tindakan)
    Exercise(
        id = "u30_s4_p2_m10",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u30_s4_p2_m10_1", "放着", "fàng zhe", "ditaruh"),
            MatchPairItem("u30_s4_p2_m10_2", "拿着", "ná zhe", "dipegang"),
            MatchPairItem("u30_s4_p2_m3", "看书时", "kànshū shí", "kala membaca"),
            MatchPairItem("u30_s4_p2_m4", "别大声", "bié dàshēng", "jangan bersuara")
        )
    )
)
