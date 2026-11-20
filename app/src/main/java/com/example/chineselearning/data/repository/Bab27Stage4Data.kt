package com.example.chineselearning.data.repository

import com.example.chineselearning.R
import com.example.chineselearning.data.model.Exercise
import com.example.chineselearning.data.model.ExerciseType
import com.example.chineselearning.data.model.MatchPairItem
import com.example.chineselearning.data.model.PictureOption

val bab27Stage4Part1Exercises = listOf(
    // 1. Soal 1: Pilihan Gambar (笑 -> tersenyum / tertawa)
    Exercise(
        id = "u27_s4_p1_q1",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "笑",
        targetPinyin = "xiào",
        targetTranslation = "tersenyum / tertawa",
        correctAnswer = "tersenyum / tertawa",
        audioToSpeak = "笑",
        pictureOptions = listOf(
            PictureOption("u27_s4_p1_opt1", "senyum", "", R.drawable.ic_digi_camera_photo, true),
            PictureOption("u27_s4_p1_opt2", "musik", "", R.drawable.ic_digi_music_sing, false),
            PictureOption("u27_s4_p1_opt3", "lukisan", "", R.drawable.ic_hobby_painting, false),
            PictureOption("u27_s4_p1_opt4", "bunga", "", R.drawable.ic_nature_flower_bloom, false)
        )
    ),

    // 2. Soal 2: Susun Kalimat (Melihat temannya datang, dia tersenyum dengan sangat gembira.)
    Exercise(
        id = "u27_s4_p1_q2",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Melihat teman datang, dia tersenyum senang.",
        targetHanzi = "看到 朋友 她 高兴 地 笑 了。",
        targetPinyin = "Kàndào péngyou tā gāoxìng de xiào le.",
        wordChips = listOf("看到:kàndào", "朋友:péngyou", "她:tā", "高兴:gāoxìng", "地:de", "笑:xiào", "了。:le.", "哭:kū"),
        correctAnswer = "看到,朋友,她,高兴,地,笑,了。",
        audioToSpeak = "看到朋友她高兴地笑了。"
    ),

    // 3. Soal 3: Ketuk Pasangan yang Sesuai (Senyum & Bahagia)
    Exercise(
        id = "u27_s4_p1_q3",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u27_s4_p1_m1", "笑", "xiào", "senyum / tawa"),
            MatchPairItem("u27_s4_p1_m2", "快乐", "kuàilè", "bahagia / gembira"),
            MatchPairItem("u27_s4_p1_m3", "新年快乐", "xīnnián kuàilè", "selamat tahun baru"),
            MatchPairItem("u27_s4_p1_m4", "笑了", "xiào le", "tersenyum")
        )
    ),

    // 4. Soal 4: Ketik Pinyin (senyum/tertawa -> xiào)
    Exercise(
        id = "u27_s4_p1_q4",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "tersenyum / tertawa",
        sentenceWithBlank = "笑 (________)",
        targetHanzi = "笑",
        targetPinyin = "xiào",
        correctAnswer = "xiao",
        keyboardKeys = listOf("x", "i", "a", "o", "e", "u", "b", "d", "g", "h", "j", "l"),
        audioToSpeak = "笑"
    ),

    // 5. Soal 5: Mendengar Kalimat (Rule 10: illustrationRes = 0)
    Exercise(
        id = "u27_s4_p1_q5",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Apa yang Anda dengar?",
        targetTranslation = "Mendoakan kalian semua selamat tahun baru!",
        targetHanzi = "祝 大家 新年 快乐！",
        targetPinyin = "Zhù dàjiā xīnnián kuàilè!",
        wordChips = listOf("祝:zhù", "大家:dàjiā", "新年:xīnnián", "快乐！:kuàilè!", "高兴:gāoxìng"),
        correctAnswer = "祝,大家,新年,快乐！",
        illustrationRes = 0,
        audioToSpeak = "祝大家新年快乐！"
    ),

    // 6. Soal 6: Pilihan Kalimat
    Exercise(
        id = "u27_s4_p1_q6",
        type = ExerciseType.SENTENCE_CHOICE,
        title = "Pilih terjemahan yang benar",
        targetHanzi = "他 笑 得 很 开心。",
        targetPinyin = "Tā xiào de hěn kāixīn.",
        targetTranslation = "Dia tertawa dengan sangat gembira.",
        correctAnswer = "Tā xiào de hěn kāixīn.\n他 笑 得 很 开心。",
        options = listOf(
            "Tā xiào de hěn kāixīn.\n他 笑 得 很 开心。",
            "Tā kū de hěn shāngxīn.\n他 哭 得 很 伤心。",
            "Wǒ xiào de hěn kāixīn.\n我 笑 得 很 开心。"
        ),
        audioToSpeak = "他笑得很开心。"
    ),

    // 7. Soal 7: Pilihan Gambar (快乐 -> bahagia gembira)
    Exercise(
        id = "u27_s4_p1_q7",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "快乐",
        targetPinyin = "kuàilè",
        targetTranslation = "bahagia / gembira",
        correctAnswer = "bahagia / gembira",
        audioToSpeak = "快乐",
        pictureOptions = listOf(
            PictureOption("u27_s4_p1_opt7_1", "bahagia", "", R.drawable.ic_digi_music_sing, true),
            PictureOption("u27_s4_p1_opt7_2", "foto", "", R.drawable.ic_digi_camera_photo, false),
            PictureOption("u27_s4_p1_opt7_3", "internet", "", R.drawable.ic_digi_surf_internet, false),
            PictureOption("u27_s4_p1_opt7_4", "lukisan", "", R.drawable.ic_hobby_painting, false)
        )
    ),

    // 8. Soal 8: Ketik Pinyin (bahagia -> kuàilè)
    Exercise(
        id = "u27_s4_p1_q8",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "bahagia / gembira",
        sentenceWithBlank = "快乐 (________)",
        targetHanzi = "快乐",
        targetPinyin = "kuàilè",
        correctAnswer = "kuaile",
        keyboardKeys = listOf("k", "u", "a", "i", "l", "e", "o", "b", "d", "g", "h", "j"),
        audioToSpeak = "快乐"
    ),

    // 9. Soal 9: Susun Kalimat (Hari ini semua orang sangat bahagia.)
    Exercise(
        id = "u27_s4_p1_q9",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Hari ini semua orang sangat bahagia.",
        targetHanzi = "今天 大家 都 很 快乐。",
        targetPinyin = "Jīntiān dàjiā dōu hěn kuàilè.",
        wordChips = listOf("今天:jīntiān", "大家:dàjiā", "都:dōu", "很:hěn", "快乐。:kuàilè.", "累:lèi"),
        correctAnswer = "今天,大家,都,很,快乐。",
        audioToSpeak = "今天大家都很快乐。"
    ),

    // 10. Soal 10: Ketuk Pasangan yang Sesuai (Rangkuman Kebahagiaan)
    Exercise(
        id = "u27_s4_p1_m10",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u27_s4_p1_m10_1", "笑", "xiào", "senyum"),
            MatchPairItem("u27_s4_p1_m10_2", "快乐", "kuàilè", "bahagia"),
            MatchPairItem("u27_s4_p1_m10_3", "开心", "kāixīn", "gembira"),
            MatchPairItem("u27_s4_p1_m10_4", "大笑", "dàxiào", "tertawa lebar")
        )
    )
)

val bab27Stage4Part2Exercises = listOf(
    // 1. Soal 1: Pilihan Gambar (事情 -> perkara / urusan)
    Exercise(
        id = "u27_s4_p2_q1",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "事情",
        targetPinyin = "shìqing",
        targetTranslation = "urusan / perkara",
        correctAnswer = "urusan / perkara",
        audioToSpeak = "事情",
        pictureOptions = listOf(
            PictureOption("u27_s4_p2_opt1", "urusan", "", R.drawable.ic_digi_surf_internet, true),
            PictureOption("u27_s4_p2_opt2", "foto", "", R.drawable.ic_digi_camera_photo, false),
            PictureOption("u27_s4_p2_opt3", "musik", "", R.drawable.ic_digi_music_sing, false),
            PictureOption("u27_s4_p2_opt4", "bunga", "", R.drawable.ic_nature_flower_bloom, false)
        )
    ),

    // 2. Soal 2: Susun Kalimat (Hari ini di perusahaan ada banyak urusan yang harus diselesaikan.)
    Exercise(
        id = "u27_s4_p2_q2",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Hari ini kantor banyak urusan.",
        targetHanzi = "今天 公司 有 很多 事情。",
        targetPinyin = "Jīntiān gōngsī yǒu hěn duō shìqing.",
        wordChips = listOf("今天:jīntiān", "公司:gōngsī", "有:yǒu", "很多:hěn duō", "事情。:shìqing.", "少:shǎo"),
        correctAnswer = "今天,公司,有,很多,事情。",
        audioToSpeak = "今天公司有很多事情。"
    ),

    // 3. Soal 3: Ketuk Pasangan yang Sesuai (Urusan & Lupa)
    Exercise(
        id = "u27_s4_p2_m3",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u27_s4_p2_m1", "每", "měi", "setiap"),
            MatchPairItem("u27_s4_p2_m2", "事情", "shìqing", "urusan / persoalan"),
            MatchPairItem("u27_s4_p2_m3", "忘", "wàng", "lupa"),
            MatchPairItem("u27_s4_p2_m4", "别忘了", "bié wàng le", "jangan lupa")
        )
    ),

    // 4. Soal 4: Ketik Pinyin (urusan -> shìqing)
    Exercise(
        id = "u27_s4_p2_q4",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "urusan / perkara",
        sentenceWithBlank = "事情 (________)",
        targetHanzi = "事情",
        targetPinyin = "shìqing",
        correctAnswer = "shiqing",
        keyboardKeys = listOf("s", "h", "i", "q", "n", "g", "a", "e", "o", "u", "b", "d"),
        audioToSpeak = "事情"
    ),

    // 5. Soal 5: Mendengar Kalimat (Rule 10: illustrationRes = 0)
    Exercise(
        id = "u27_s4_p2_q5",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Apa yang Anda dengar?",
        targetTranslation = "Maaf, saya lupa membawa buku pelajaran hari ini.",
        targetHanzi = "对不起， 我 忘 了 带 课本。",
        targetPinyin = "Duìbuqǐ, wǒ wàng le dài kèběn.",
        wordChips = listOf("对不起，:duìbuqǐ,", "我:wǒ", "忘:wàng", "了:le", "带:dài", "课本。:kèběn.", "拿:ná"),
        correctAnswer = "对不起，,我,忘,了,带,课本。",
        illustrationRes = 0,
        audioToSpeak = "对不起，我忘了带课本。"
    ),

    // 6. Soal 6: Pilihan Kalimat
    Exercise(
        id = "u27_s4_p2_q6",
        type = ExerciseType.SENTENCE_CHOICE,
        title = "Pilih terjemahan yang benar",
        targetHanzi = "我 每天 早上 都 喝 一 杯 牛奶。",
        targetPinyin = "Wǒ měitiān zǎoshang dōu hē yì bēi niúnǎi.",
        targetTranslation = "Saya setiap pagi selalu minum segelas susu.",
        correctAnswer = "Wǒ měitiān zǎoshang dōu hē yì bēi niúnǎi.\n我 每天 早上 都 喝 一 杯 牛奶。",
        options = listOf(
            "Wǒ měitiān zǎoshang dōu hē yì bēi niúnǎi.\n我 每天 早上 都 喝 一 杯 牛奶。",
            "Wǒ měitiān wǎnshang dōu hē yì bēi niúnǎi.\n我 每天 晚上 都 喝 一 杯 牛奶。",
            "Tā měitiān zǎoshang dōu hē yì bēi niúnǎi.\n他 每天 早上 都 喝 一 杯 牛奶。"
        ),
        audioToSpeak = "我每天早上都喝一杯牛奶。"
    ),

    // 7. Soal 7: Pilihan Gambar (忘 -> lupa)
    Exercise(
        id = "u27_s4_p2_q7",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "忘",
        targetPinyin = "wàng",
        targetTranslation = "lupa",
        correctAnswer = "lupa",
        audioToSpeak = "忘",
        pictureOptions = listOf(
            PictureOption("u27_s4_p2_opt7_1", "lupa", "", R.drawable.ic_digi_camera_photo, true),
            PictureOption("u27_s4_p2_opt7_2", "bunga", "", R.drawable.ic_nature_flower_bloom, false),
            PictureOption("u27_s4_p2_opt7_3", "burung", "", R.drawable.ic_nature_bird_singing, false),
            PictureOption("u27_s4_p2_opt7_4", "musik", "", R.drawable.ic_digi_music_sing, false)
        )
    ),

    // 8. Soal 8: Ketik Pinyin (lupa -> wàng)
    Exercise(
        id = "u27_s4_p2_q8",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "lupa",
        sentenceWithBlank = "忘 (________)",
        targetHanzi = "忘",
        targetPinyin = "wàng",
        correctAnswer = "wang",
        keyboardKeys = listOf("w", "a", "n", "g", "e", "i", "o", "u", "b", "d", "h", "j"),
        audioToSpeak = "忘"
    ),

    // 9. Soal 9: Susun Kalimat (Setiap orang memiliki urusannya masing-masing.)
    Exercise(
        id = "u27_s4_p2_q9",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Tiap orang ada urusan masing-masing.",
        targetHanzi = "每个人 都有 自己的 事情。",
        targetPinyin = "Měi gè rén dōu yǒu zìjǐ de shìqing.",
        wordChips = listOf("每个人:měi gè rén", "都有:dōu yǒu", "自己的:zìjǐ de", "事情。:shìqing.", "没有:méiyǒu"),
        correctAnswer = "每个人,都有,自己的,事情。",
        audioToSpeak = "每个人都有自己的事情。"
    ),

    // 10. Soal 10: Ketuk Pasangan yang Sesuai (Rangkuman Urusan Harian)
    Exercise(
        id = "u27_s4_p2_m10",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u27_s4_p2_m10_1", "每天", "měitiān", "setiap hari"),
            MatchPairItem("u27_s4_p2_m10_2", "办事情", "bàn shìqing", "mengurus perkara"),
            MatchPairItem("u27_s4_p2_m10_3", "没忘", "méi wàng", "tidak lupa"),
            MatchPairItem("u27_s4_p2_m10_4", "每个人", "měi gè rén", "setiap orang")
        )
    )
)
