package com.example.chineselearning.data.repository

import com.example.chineselearning.R
import com.example.chineselearning.data.model.Exercise
import com.example.chineselearning.data.model.ExerciseType
import com.example.chineselearning.data.model.MatchPairItem
import com.example.chineselearning.data.model.PictureOption

val bab14Stage5Part1Exercises = listOf(
    // 1. Soal 1: Pilihan Gambar (看电影 -> nonton film)
    Exercise(
        id = "u14_s5_p1_q1",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "电影",
        targetPinyin = "diànyǐng",
        targetTranslation = "film",
        correctAnswer = "film",
        audioToSpeak = "电影",
        pictureOptions = listOf(
            PictureOption("u14_s5_p1_opt1", "film", "🎬", R.drawable.ic_coin, true),
            PictureOption("u14_s5_p1_opt2", "buku", "📖", R.drawable.ic_book, false),
            PictureOption("u14_s5_p1_opt3", "mobil", "🚗", R.drawable.ic_target, false),
            PictureOption("u14_s5_p1_opt4", "uang", "💰", R.drawable.ic_crown, false)
        )
    ),

    // 2. Soal 2: Susun Kalimat (Saya ingin pergi nonton film bersamamu.)
    Exercise(
        id = "u14_s5_p1_q2",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Saya ingin bersamamu nonton film.",
        targetHanzi = "我 想 和 你 去 看 电影。",
        targetPinyin = "Wǒ xiǎng hé nǐ qù kàn diànyǐng.",
        wordChips = listOf("我:wǒ", "想:xiǎng", "和:hé", "你:nǐ", "去:qù", "看:kàn", "电影:diànyǐng"),
        correctAnswer = "我,想,和,你,去,看,电影",
        audioToSpeak = "我想和你去看电影。"
    ),

    // 3. Soal 3: Ketuk Pasangan yang Sesuai (Aktivitas Liburan)
    Exercise(
        id = "u14_s5_p1_q3",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u14_s5_p1_m1", "看电影", "kàn diànyǐng", "nonton film"),
            MatchPairItem("u14_s5_p1_m2", "听歌", "tīng gē", "dengar lagu"),
            MatchPairItem("u14_s5_p1_m3", "唱歌", "chànggē", "bernyanyi"),
            MatchPairItem("u14_s5_p1_m4", "出去玩", "chūqù wán", "main keluar")
        )
    ),

    // 4. Soal 4: Ketik Pinyin (film -> diànyǐng)
    Exercise(
        id = "u14_s5_p1_q4",
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
        id = "u14_s5_p1_q5",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Apa yang Anda dengar?",
        targetTranslation = "Film ini sungguh bagus.",
        targetHanzi = "这 个 电影 真 好看。",
        targetPinyin = "Zhè gè diànyǐng zhēn hǎokàn.",
        wordChips = listOf("这:zhè", "个:gè", "电影:diànyǐng", "真:zhēn", "好看:hǎokàn", "书:shū"),
        correctAnswer = "这,个,电影,真,好看",
        illustrationRes = 0,
        audioToSpeak = "这个电影真好看。"
    ),

    // 6. Soal 6: Pilihan Kalimat
    Exercise(
        id = "u14_s5_p1_q6",
        type = ExerciseType.SENTENCE_CHOICE,
        title = "Pilih terjemahan yang benar",
        targetHanzi = "明天 我们 一起 去 玩 吧。",
        targetPinyin = "Míngtiān wǒmen yìqǐ qù wán ba.",
        targetTranslation = "Besok mari kita pergi main bersama.",
        correctAnswer = "Míngtiān wǒmen yìqǐ qù wán ba.\n明天 我们 一起 去 玩 吧。",
        options = listOf(
            "Míngtiān wǒmen yìqǐ qù wán ba.\n明天 我们 一起 去 玩 吧。",
            "Jīntiān wǒmen yìqǐ qù wán ba.\n今天 我们 一起 去 玩 吧。",
            "Míngtiān wǒmen yìqǐ qù xuéxí ba.\n明天 我们 一起 去 学习 吧。"
        ),
        audioToSpeak = "明天我们一起去玩吧。"
    ),

    // 7. Soal 7: Pilihan Gambar (喜欢 -> suka)
    Exercise(
        id = "u14_s5_p1_q7",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "喜欢",
        targetPinyin = "xǐhuan",
        targetTranslation = "suka",
        correctAnswer = "suka",
        audioToSpeak = "喜欢",
        pictureOptions = listOf(
            PictureOption("u14_s5_p1_opt7_1", "suka", "❤️", R.drawable.ic_coin, true),
            PictureOption("u14_s5_p1_opt7_2", "benci", "💔", R.drawable.ic_target, false),
            PictureOption("u14_s5_p1_opt7_3", "tidur", "🛌", R.drawable.ic_book, false),
            PictureOption("u14_s5_p1_opt7_4", "makan", "🍚", R.drawable.ic_crown, false)
        )
    ),

    // 8. Soal 8: Ketik Pinyin (suka -> xǐhuan)
    Exercise(
        id = "u14_s5_p1_q8",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "suka",
        sentenceWithBlank = "喜欢 (________)",
        targetHanzi = "喜欢",
        targetPinyin = "xǐhuan",
        correctAnswer = "xihuan",
        keyboardKeys = listOf("x", "i", "h", "u", "a", "n", "e", "o", "b", "d", "g"),
        audioToSpeak = "喜欢"
    ),

    // 9. Soal 9: Susun Kalimat (Saya suka mendengarkan dia menyanyi.)
    Exercise(
        id = "u14_s5_p1_q9",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Saya suka dengar dia bernyanyi.",
        targetHanzi = "我 喜欢 听 她 唱歌。",
        targetPinyin = "Wǒ xǐhuan tīng tā chànggē.",
        wordChips = listOf("我:wǒ", "喜欢:xǐhuan", "听:tīng", "她:tā", "唱歌:chànggē", "看:kàn"),
        correctAnswer = "我,喜欢,听,她,唱歌",
        audioToSpeak = "我喜欢听她唱歌。"
    ),

    // 10. Soal 10: Ketuk Pasangan yang Sesuai (Rangkuman Waktu Luang)
    Exercise(
        id = "u14_s5_p1_m10_1",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u14_s5_p1_m10_1", "听她唱歌", "tīng tā chànggē", "dengar dia bernyanyi"),
            MatchPairItem("u14_s5_p1_m10_2", "一起玩", "yìqǐ wán", "main bersama"),
            MatchPairItem("u14_s5_p1_m10_3", "看电影", "kàn diànyǐng", "nonton film"),
            MatchPairItem("u14_s5_p1_m10_4", "真好看", "zhēn hǎokàn", "sungguh bagus")
        )
    )
)

val bab14Stage5Part2Exercises = listOf(
    // 1. Soal 1: Pilihan Gambar (电影院 -> bioskop)
    Exercise(
        id = "u14_s5_p2_q1",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "电影院",
        targetPinyin = "diànyǐngyuàn",
        targetTranslation = "bioskop",
        correctAnswer = "bioskop",
        audioToSpeak = "电影院",
        pictureOptions = listOf(
            PictureOption("u14_s5_p2_opt1", "bioskop", "🎦", R.drawable.ic_coin, true),
            PictureOption("u14_s5_p2_opt2", "toko", "🏪", R.drawable.ic_target, false),
            PictureOption("u14_s5_p2_opt3", "sekolah", "🏫", R.drawable.ic_cap, false),
            PictureOption("u14_s5_p2_opt4", "rumah", "🏠", R.drawable.ic_book, false)
        )
    ),

    // 2. Soal 2: Susun Kalimat (Hari Minggu kita pergi ke bioskop.)
    Exercise(
        id = "u14_s5_p2_q2",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Hari Minggu kita ke bioskop.",
        targetHanzi = "星期天 我们 去 电影院。",
        targetPinyin = "Xīngqītiān wǒmen qù diànyǐngyuàn.",
        wordChips = listOf("星期天:xīngqītiān", "我们:wǒmen", "去:qù", "电影院:diànyǐngyuàn", "学校:xuéxiào"),
        correctAnswer = "星期天,我们,去,电影院",
        audioToSpeak = "星期天我们去电影院。"
    ),

    // 3. Soal 3: Ketuk Pasangan yang Sesuai (Rencana Akhir Pekan)
    Exercise(
        id = "u14_s5_p2_m3",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u14_s5_p2_m1", "去电影院", "qù diànyǐngyuàn", "ke bioskop"),
            MatchPairItem("u14_s5_p2_m2", "看电影", "kàn diànyǐng", "nonton film"),
            MatchPairItem("u14_s5_p2_m3", "唱歌", "chànggē", "bernyanyi"),
            MatchPairItem("u14_s5_p2_m4", "好玩儿", "hǎowánr", "menyenangkan")
        )
    ),

    // 4. Soal 4: Ketik Pinyin (nonton film -> kàndiànyǐng)
    Exercise(
        id = "u14_s5_p2_q4",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "menonton film",
        sentenceWithBlank = "看电影 (________)",
        targetHanzi = "看电影",
        targetPinyin = "kàndiànyǐng",
        correctAnswer = "kandianying",
        keyboardKeys = listOf("k", "a", "n", "d", "i", "y", "g", "e", "o", "u", "b"),
        audioToSpeak = "看电影"
    ),

    // 5. Soal 5: Mendengar Kalimat (Rule 10: illustrationRes = 0)
    Exercise(
        id = "u14_s5_p2_q5",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Apa yang Anda dengar?",
        targetTranslation = "Dia sangat suka hewan kecil.",
        targetHanzi = "他 很 喜欢 小 动物。",
        targetPinyin = "Tā hěn xǐhuan xiǎo dòngwù.",
        wordChips = listOf("他:tā", "很:hěn", "喜欢:xǐhuan", "小:xiǎo", "动物:dòngwù", "猫:māo"),
        correctAnswer = "他,很,喜欢,小,动物",
        illustrationRes = 0,
        audioToSpeak = "他很喜欢小动物。"
    ),

    // 6. Soal 6: Pilihan Kalimat
    Exercise(
        id = "u14_s5_p2_q6",
        type = ExerciseType.SENTENCE_CHOICE,
        title = "Pilih terjemahan yang benar",
        targetHanzi = "你想 去 哪儿 玩？",
        targetPinyin = "Nǐxiǎng qù nǎr wán?",
        targetTranslation = "Kamu ingin pergi main ke mana?",
        correctAnswer = "Nǐxiǎng qù nǎr wán?\n你想 去 哪儿 玩？",
        options = listOf(
            "Nǐxiǎng qù nǎr wán?\n你想 去 哪儿 玩？",
            "Nǐxiǎng qù nǎr xuéxí?\n你想 去 哪儿 学习？",
            "Tāxiǎng qù nǎr wán?\n他想 去 哪儿 玩？"
        ),
        audioToSpeak = "你想去哪儿玩？"
    ),

    // 7. Soal 7: Pilihan Gambar (唱歌 -> bernyanyi)
    Exercise(
        id = "u14_s5_p2_q7",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "唱歌",
        targetPinyin = "chànggē",
        targetTranslation = "bernyanyi",
        correctAnswer = "bernyanyi",
        audioToSpeak = "唱歌",
        pictureOptions = listOf(
            PictureOption("u14_s5_p2_opt7_1", "bernyanyi", "🎤", R.drawable.ic_coin, true),
            PictureOption("u14_s5_p2_opt7_2", "tidur", "🛌", R.drawable.ic_book, false),
            PictureOption("u14_s5_p2_opt7_3", "makan", "🍚", R.drawable.ic_target, false),
            PictureOption("u14_s5_p2_opt7_4", "lari", "🏃", R.drawable.ic_crown, false)
        )
    ),

    // 8. Soal 8: Ketik Pinyin (bernyanyi -> chànggē)
    Exercise(
        id = "u14_s5_p2_q8",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "bernyanyi",
        sentenceWithBlank = "唱歌 (________)",
        targetHanzi = "唱歌",
        targetPinyin = "chànggē",
        correctAnswer = "changge",
        keyboardKeys = listOf("c", "h", "a", "n", "g", "e", "i", "o", "u", "b", "d"),
        audioToSpeak = "唱歌"
    ),

    // 9. Soal 9: Susun Kalimat (Kami bernyanyi bersama.)
    Exercise(
        id = "u14_s5_p2_q9",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Kami bernyanyi bersama.",
        targetHanzi = "我们 一起 唱歌。",
        targetPinyin = "Wǒmen yìqǐ chànggē.",
        wordChips = listOf("我们:wǒmen", "一起:yìqǐ", "唱歌:chànggē", "看书:kànshū", "去:qù"),
        correctAnswer = "我们,一起,唱歌",
        audioToSpeak = "我们一起唱歌。"
    ),

    // 10. Soal 10: Ketuk Pasangan yang Sesuai (Rangkuman Rekreasi)
    Exercise(
        id = "u14_s5_p2_m10_1",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u14_s5_p2_m10_1", "唱歌", "chànggē", "bernyanyi"),
            MatchPairItem("u14_s5_p2_m10_2", "一起玩", "yìqǐ wán", "main bersama"),
            MatchPairItem("u14_s5_p2_m10_3", "好听", "hǎotīng", "merdu"),
            MatchPairItem("u14_s5_p2_m10_4", "好看", "hǎokàn", "bagus ditonton")
        )
    )
)
