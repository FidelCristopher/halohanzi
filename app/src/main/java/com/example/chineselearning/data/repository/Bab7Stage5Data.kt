package com.example.chineselearning.data.repository

import com.example.chineselearning.R
import com.example.chineselearning.data.model.Exercise
import com.example.chineselearning.data.model.ExerciseType
import com.example.chineselearning.data.model.MatchPairItem
import com.example.chineselearning.data.model.PictureOption

val bab7Stage5Part1Exercises = listOf(
    // 1. Soal 1: Pilihan Gambar (饭店 -> restoran)
    Exercise(
        id = "u7_s5_p1_q1",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "饭店",
        targetPinyin = "fàndiàn",
        targetTranslation = "restoran",
        correctAnswer = "restoran",
        audioToSpeak = "饭店",
        pictureOptions = listOf(
            PictureOption("u7_s5_p1_opt1", "restoran", "🏪", R.drawable.ic_coin, true),
            PictureOption("u7_s5_p1_opt2", "sekolah", "🏫", R.drawable.ic_cap, false),
            PictureOption("u7_s5_p1_opt3", "rumah", "🏠", R.drawable.ic_people_group, false),
            PictureOption("u7_s5_p1_opt4", "kamar", "🚪", R.drawable.ic_book, false)
        )
    ),

    // 2. Soal 2: Susun Kalimat (Hari ini kita pergi ke restoran makan makanan.)
    Exercise(
        id = "u7_s5_p1_q2",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Hari ini kita pergi ke restoran makan.",
        targetHanzi = "今天 我们 去 饭店 吃饭。",
        targetPinyin = "Jīntiān wǒmen qù fàndiàn chīfàn.",
        wordChips = listOf("今天:jīntiān", "我们:wǒmen", "去:qù", "饭店:fàndiàn", "吃饭:chīfàn", "学校:xuéxiào"),
        correctAnswer = "今天,我们,去,饭店,吃饭",
        audioToSpeak = "今天我们去饭店吃饭。"
    ),

    // 3. Soal 3: Ketuk Pasangan yang Sesuai (Di Restoran)
    Exercise(
        id = "u7_s5_p1_q3",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u7_s5_p1_m1", "饭店", "fàndiàn", "restoran"),
            MatchPairItem("u7_s5_p1_m2", "去饭店", "qù fàndiàn", "pergi ke restoran"),
            MatchPairItem("u7_s5_p1_m3", "吃饭", "chīfàn", "makan"),
            MatchPairItem("u7_s5_p1_m4", "很好吃", "hěn hǎochī", "sangat enak")
        )
    ),

    // 4. Soal 4: Ketik Pinyin (restoran -> fàndiàn)
    Exercise(
        id = "u7_s5_p1_q4",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "restoran",
        sentenceWithBlank = "饭店 (________)",
        targetHanzi = "饭店",
        targetPinyin = "fàndiàn",
        correctAnswer = "fandian",
        keyboardKeys = listOf("f", "a", "n", "d", "i", "e", "o", "u", "b", "g", "h"),
        audioToSpeak = "饭店"
    ),

    // 5. Soal 5: Mendengar Kalimat (Rule 10: illustrationRes = 0)
    Exercise(
        id = "u7_s5_p1_q5",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Apa yang Anda dengar?",
        targetTranslation = "Restoran itu sangat besar.",
        targetHanzi = "那个 饭店 很 大。",
        targetPinyin = "Nàgè fàndiàn hěn dà.",
        wordChips = listOf("那个:nàgè", "饭店:fàndiàn", "很:hěn", "大:dà", "小:xiǎo", "这个:zhège"),
        correctAnswer = "那个,饭店,很,大",
        illustrationRes = 0,
        audioToSpeak = "那个饭店很大。"
    ),

    // 6. Soal 6: Pilihan Kalimat
    Exercise(
        id = "u7_s5_p1_q6",
        type = ExerciseType.SENTENCE_CHOICE,
        title = "Pilih terjemahan yang benar",
        targetHanzi = "我们 在 饭店 见。",
        targetPinyin = "Wǒmen zài fàndiàn jiàn.",
        targetTranslation = "Kita bertemu di restoran.",
        correctAnswer = "Wǒmen zài fàndiàn jiàn.\n我们 在 饭店 见。",
        options = listOf(
            "Wǒmen zài fàndiàn jiàn.\n我们 在 饭店 见。",
            "Wǒmen zài xuéxiào jiàn.\n我们 在 学校 见。",
            "Tāmen zài fàndiàn jiàn.\n他们 在 饭店 见。"
        ),
        audioToSpeak = "我们在饭店见。"
    ),

    // 7. Soal 7: Pilihan Gambar (去饭店 -> pergi ke restoran)
    Exercise(
        id = "u7_s5_p1_q7",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "饭店",
        targetPinyin = "fàndiàn",
        targetTranslation = "restoran",
        correctAnswer = "restoran",
        audioToSpeak = "饭店",
        pictureOptions = listOf(
            PictureOption("u7_s5_p1_opt7_1", "restoran", "🏪", R.drawable.ic_coin, true),
            PictureOption("u7_s5_p1_opt7_2", "buku", "📖", R.drawable.ic_book, false),
            PictureOption("u7_s5_p1_opt7_3", "rumah", "🏠", R.drawable.ic_people_group, false),
            PictureOption("u7_s5_p1_opt7_4", "sekolah", "🏫", R.drawable.ic_cap, false)
        )
    ),

    // 8. Soal 8: Ketik Pinyin (pelayan -> fúwùyuán)
    Exercise(
        id = "u7_s5_p1_q8",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "pelayan",
        sentenceWithBlank = "服务员 (________)",
        targetHanzi = "服务员",
        targetPinyin = "fúwùyuán",
        correctAnswer = "fuwuyuan",
        keyboardKeys = listOf("f", "u", "w", "y", "a", "n", "e", "i", "o", "b", "d"),
        audioToSpeak = "服务员"
    ),

    // 9. Soal 9: Susun Kalimat (Pelayan, saya ingin secangkir teh.)
    Exercise(
        id = "u7_s5_p1_q9",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Pelayan, saya ingin secangkir teh.",
        targetHanzi = "服务员， 我 想 喝 一杯 茶。",
        targetPinyin = "Fúwùyuán, wǒ xiǎng hē yìbēi chá.",
        wordChips = listOf("服务员，:fúwùyuán,", "我:wǒ", "想:xiǎng", "喝:hē", "一杯:yìbēi", "茶。:chá.", "水。:shuǐ."),
        correctAnswer = "服务员，,我,想,喝,一杯,茶。",
        audioToSpeak = "服务员，我想喝一杯茶。"
    ),

    // 10. Soal 10: Ketuk Pasangan yang Sesuai (Rangkuman Restoran & Pelayan)
    Exercise(
        id = "u7_s5_p1_m10_1",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u7_s5_p1_m10_1", "饭店", "fàndiàn", "restoran"),
            MatchPairItem("u7_s5_p1_m10_2", "服务员", "fúwùyuán", "pelayan"),
            MatchPairItem("u7_s5_p1_m10_3", "去饭店", "qù fàndiàn", "pergi restoran"),
            MatchPairItem("u7_s5_p1_m10_4", "在饭店", "zài fàndiàn", "di restoran")
        )
    )
)

val bab7Stage5Part2Exercises = listOf(
    // 1. Soal 1: Pilihan Gambar (想吃 -> ingin makan)
    Exercise(
        id = "u7_s5_p2_q1",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "想吃",
        targetPinyin = "xiǎng chī",
        targetTranslation = "ingin makan",
        correctAnswer = "ingin makan",
        audioToSpeak = "想吃",
        pictureOptions = listOf(
            PictureOption("u7_s5_p2_opt1", "ingin makan", "🍽️", R.drawable.ic_coin, true),
            PictureOption("u7_s5_p2_opt2", "tidur", "🛌", R.drawable.ic_book, false),
            PictureOption("u7_s5_p2_opt3", "minum", "🍵", R.drawable.ic_crown, false),
            PictureOption("u7_s5_p2_opt4", "lari", "🏃", R.drawable.ic_dumbbell, false)
        )
    ),

    // 2. Soal 2: Susun Kalimat (Kamu ingin makan apa?)
    Exercise(
        id = "u7_s5_p2_q2",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Kamu ingin makan apa?",
        targetHanzi = "你 想 吃 什么？",
        targetPinyin = "Nǐ xiǎng chī shénme?",
        wordChips = listOf("你:nǐ", "想:xiǎng", "吃:chī", "什么:shénme", "喝:hē", "他:tā"),
        correctAnswer = "你,想,吃,什么",
        audioToSpeak = "你想吃什么？"
    ),

    // 3. Soal 3: Ketuk Pasangan yang Sesuai (Pemesanan Makanan)
    Exercise(
        id = "u7_s5_p2_q3",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u7_s5_p2_m1", "想吃什么", "xiǎng chī shénme", "ingin makan apa"),
            MatchPairItem("u7_s5_p2_m2", "想喝什么", "xiǎng hē shénme", "ingin minum apa"),
            MatchPairItem("u7_s5_p2_m3", "吃米饭", "chī mǐfàn", "makan nasi"),
            MatchPairItem("u7_s5_p2_m4", "吃面条儿", "chī miàntiáor", "makan mie")
        )
    ),

    // 4. Soal 4: Ketik Pinyin (ingin makan -> xiǎngchī)
    Exercise(
        id = "u7_s5_p2_q4",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "ingin makan",
        sentenceWithBlank = "想吃 (________)",
        targetHanzi = "想吃",
        targetPinyin = "xiǎngchī",
        correctAnswer = "xiangchi",
        keyboardKeys = listOf("x", "i", "a", "n", "g", "c", "h", "e", "o", "u", "b"),
        audioToSpeak = "想吃"
    ),

    // 5. Soal 5: Mendengar Kalimat (Rule 10: illustrationRes = 0)
    Exercise(
        id = "u7_s5_p2_q5",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Apa yang Anda dengar?",
        targetTranslation = "Saya ingin makan pangsit dan minum teh.",
        targetHanzi = "我 想 吃 饺子， 喝 茶。",
        targetPinyin = "Wǒ xiǎng chī jiǎozi, hē chá.",
        wordChips = listOf("我:wǒ", "想:xiǎng", "吃:chī", "饺子，:jiǎozi,", "喝:hē", "茶。:chá.", "米饭:mǐfàn"),
        correctAnswer = "我,想,吃,饺子，,喝,茶。",
        illustrationRes = 0,
        audioToSpeak = "我想吃饺子，喝茶。"
    ),

    // 6. Soal 6: Pilihan Kalimat
    Exercise(
        id = "u7_s5_p2_q6",
        type = ExerciseType.SENTENCE_CHOICE,
        title = "Pilih terjemahan yang benar",
        targetHanzi = "你 想 喝 什么？",
        targetPinyin = "Nǐ xiǎng hē shénme?",
        targetTranslation = "Kamu ingin minum apa?",
        correctAnswer = "Nǐ xiǎng hē shénme?\n你 想 喝 什么？",
        options = listOf(
            "Nǐ xiǎng hē shénme?\n你 想 喝 什么？",
            "Nǐ xiǎng chī shénme?\n你 想 吃 什么？",
            "Tā xiǎng hē shénme?\n他 想 喝 什么？"
        ),
        audioToSpeak = "你想喝什么？"
    ),

    // 7. Soal 7: Pilihan Gambar (多少钱 -> berapa harganya)
    Exercise(
        id = "u7_s5_p2_q7",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "多少钱",
        targetPinyin = "duōshao qián",
        targetTranslation = "berapa harganya",
        correctAnswer = "berapa harganya",
        audioToSpeak = "多少钱",
        pictureOptions = listOf(
            PictureOption("u7_s5_p2_opt7_1", "berapa harganya", "💰", R.drawable.ic_coin, true),
            PictureOption("u7_s5_p2_opt7_2", "berapa orang", "👥", R.drawable.ic_people_group, false),
            PictureOption("u7_s5_p2_opt7_3", "jam berapa", "⏰", R.drawable.ic_story_timer, false),
            PictureOption("u7_s5_p2_opt7_4", "di mana", "📍", R.drawable.ic_target, false)
        )
    ),

    // 8. Soal 8: Ketik Pinyin (berapa harga -> duōshao qián)
    Exercise(
        id = "u7_s5_p2_q8",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "berapa harganya",
        sentenceWithBlank = "多少钱 (________)",
        targetHanzi = "多少钱",
        targetPinyin = "duōshaoqián",
        correctAnswer = "duoshaoqian",
        keyboardKeys = listOf("d", "u", "o", "s", "h", "a", "q", "i", "n", "e", "b"),
        audioToSpeak = "多少钱"
    ),

    // 9. Soal 9: Susun Kalimat (Mie ini berapa harganya?)
    Exercise(
        id = "u7_s5_p2_q9",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Mie ini berapa harganya?",
        targetHanzi = "这个 面条儿 多少 钱？",
        targetPinyin = "Zhège miàntiáor duōshao qián?",
        wordChips = listOf("这个:zhège", "面条儿:miàntiáor", "多少:duōshao", "钱？:qián?", "米饭:mǐfàn"),
        correctAnswer = "这个,面条儿,多少,钱？",
        audioToSpeak = "这个面条儿多少钱？"
    ),

    // 10. Soal 10: Ketuk Pasangan yang Sesuai (Rangkuman Pesan & Bayar)
    Exercise(
        id = "u7_s5_p2_m10_1",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u7_s5_p2_m10_1", "多少钱", "duōshao qián", "berapa harganya"),
            MatchPairItem("u7_s5_p2_m10_2", "二十块", "èrshí kuài", "dua puluh yuan"),
            MatchPairItem("u7_s5_p2_m10_3", "想吃", "xiǎng chī", "ingin makan"),
            MatchPairItem("u7_s5_p2_m10_4", "想喝", "xiǎng hē", "ingin minum")
        )
    )
)
