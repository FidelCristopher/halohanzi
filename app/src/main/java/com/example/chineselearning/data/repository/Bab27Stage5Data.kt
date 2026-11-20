package com.example.chineselearning.data.repository

import com.example.chineselearning.R
import com.example.chineselearning.data.model.Exercise
import com.example.chineselearning.data.model.ExerciseType
import com.example.chineselearning.data.model.MatchPairItem
import com.example.chineselearning.data.model.PictureOption

val bab27Stage5Part1Exercises = listOf(
    // 1. Soal 1: Pilihan Gambar (画 -> melukis karya seni)
    Exercise(
        id = "u27_s5_p1_q1",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "画",
        targetPinyin = "huà",
        targetTranslation = "melukis",
        correctAnswer = "melukis",
        audioToSpeak = "画",
        pictureOptions = listOf(
            PictureOption("u27_s5_p1_opt1", "melukis", "", R.drawable.ic_hobby_painting, true),
            PictureOption("u27_s5_p1_opt2", "bunga", "", R.drawable.ic_nature_flower_bloom, false),
            PictureOption("u27_s5_p1_opt3", "burung", "", R.drawable.ic_nature_bird_singing, false),
            PictureOption("u27_s5_p1_opt4", "internet", "", R.drawable.ic_digi_surf_internet, false)
        )
    ),

    // 2. Soal 2: Susun Kalimat (Saya suka menggambar bunga dan burung kecil di waktu luang.)
    Exercise(
        id = "u27_s5_p1_q2",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Saya suka melukis bunga dan burung.",
        targetHanzi = "我 喜欢 画 花 和 鸟。",
        targetPinyin = "Wǒ xǐhuan huà huā hé niǎo.",
        wordChips = listOf("我:wǒ", "喜欢:xǐhuan", "画:huà", "花:huā", "和:hé", "鸟。:niǎo.", "看:kàn"),
        correctAnswer = "我,喜欢,画,花,和,鸟。",
        audioToSpeak = "我喜欢画花和鸟。"
    ),

    // 3. Soal 3: Ketuk Pasangan yang Sesuai (Sintesis Alam & Seni)
    Exercise(
        id = "u27_s5_p1_m3",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u27_s5_p1_m1", "爱好", "àihào", "hobi"),
            MatchPairItem("u27_s5_p1_m2", "画花", "huà huā", "melukis bunga"),
            MatchPairItem("u27_s5_p1_m3", "鸟儿", "niǎor", "burung"),
            MatchPairItem("u27_s5_p1_m4", "真可爱", "zhēn kě'ài", "sangat imut")
        )
    ),

    // 4. Soal 4: Ketik Pinyin (hobi -> àihào)
    Exercise(
        id = "u27_s5_p1_q4",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "hobi / kegemaran",
        sentenceWithBlank = "爱好 (________)",
        targetHanzi = "爱好",
        targetPinyin = "àihào",
        correctAnswer = "aihao",
        keyboardKeys = listOf("a", "i", "h", "o", "e", "u", "b", "d", "g", "j", "l", "m"),
        audioToSpeak = "爱好"
    ),

    // 5. Soal 5: Mendengar Kalimat (Rule 10: illustrationRes = 0)
    Exercise(
        id = "u27_s5_p1_q5",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Apa yang Anda dengar?",
        targetTranslation = "Bunga di taman bermekaran sangat indah.",
        targetHanzi = "花园 里的 花 真 美丽。",
        targetPinyin = "Huāyuán lǐ de huā zhēn měilì.",
        wordChips = listOf("花园:huāyuán", "里的:lǐ de", "花:huā", "真:zhēn", "美丽。:měilì.", "草:cǎo"),
        correctAnswer = "花园,里的,花,真,美丽。",
        illustrationRes = 0,
        audioToSpeak = "花园里的花真美丽。"
    ),

    // 6. Soal 6: Pilihan Kalimat
    Exercise(
        id = "u27_s5_p1_q6",
        type = ExerciseType.SENTENCE_CHOICE,
        title = "Pilih terjemahan yang benar",
        targetHanzi = "树上 的 小鸟 在 快乐 地 唱歌。",
        targetPinyin = "Shùshang de xiǎoniǎo zài kuàilè de chànggē.",
        targetTranslation = "Burung di atas pohon bernyanyi dengan riang.",
        correctAnswer = "Shùshang de xiǎoniǎo zài kuàilè de chànggē.\n树上 的 小鸟 在 快乐 地 唱歌。",
        options = listOf(
            "Shùshang de xiǎoniǎo zài kuàilè de chànggē.\n树上 的 小鸟 在 快乐 地 唱歌。",
            "Shùshang de xiǎoniǎo zài kuàilè de tiàowǔ.\n树上 的 小鸟 在 快乐 地 跳舞。",
            "Dìshang de xiǎoniǎo zài kuàilè de chànggē.\n地上 的 小鸟 在 快乐 地 唱歌。"
        ),
        audioToSpeak = "树上的小鸟在快乐地唱歌。"
    ),

    // 7. Soal 7: Pilihan Gambar (花 -> bunga merekah)
    Exercise(
        id = "u27_s5_p1_q7",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "花",
        targetPinyin = "huā",
        targetTranslation = "bunga",
        correctAnswer = "bunga",
        audioToSpeak = "花",
        pictureOptions = listOf(
            PictureOption("u27_s5_p1_opt7_1", "bunga", "", R.drawable.ic_nature_flower_bloom, true),
            PictureOption("u27_s5_p1_opt7_2", "burung", "", R.drawable.ic_nature_bird_singing, false),
            PictureOption("u27_s5_p1_opt7_3", "melukis", "", R.drawable.ic_hobby_painting, false),
            PictureOption("u27_s5_p1_opt7_4", "foto", "", R.drawable.ic_digi_camera_photo, false)
        )
    ),

    // 8. Soal 8: Ketik Pinyin (bunga -> huā)
    Exercise(
        id = "u27_s5_p1_q8",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "bunga",
        sentenceWithBlank = "花 (________)",
        targetHanzi = "花",
        targetPinyin = "huā",
        correctAnswer = "hua",
        keyboardKeys = listOf("h", "u", "a", "e", "i", "o", "b", "d", "g", "j", "l", "m"),
        audioToSpeak = "花"
    ),

    // 9. Soal 9: Susun Kalimat (Setiap orang tersenyum dengan gembira.)
    Exercise(
        id = "u27_s5_p1_q9",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Setiap orang tersenyum gembira.",
        targetHanzi = "每个人 都 笑 了。",
        targetPinyin = "Měi gè rén dōu xiào le.",
        wordChips = listOf("每个人:měi gè rén", "都:dōu", "笑:xiào", "了。:le.", "走:zǒu"),
        correctAnswer = "每个人,都,笑,了。",
        audioToSpeak = "每个人都笑了。"
    ),

    // 10. Soal 10: Ketuk Pasangan yang Sesuai (Rangkuman Sintesis 1)
    Exercise(
        id = "u27_s5_p1_m10",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u27_s5_p1_m10_1", "开花", "kāihuā", "bunga mekar"),
            MatchPairItem("u27_s5_p1_m10_2", "小鸟", "xiǎoniǎo", "burung kecil"),
            MatchPairItem("u27_s5_p1_m10_3", "笑了", "xiào le", "tersenyum"),
            MatchPairItem("u27_s5_p1_m10_4", "真美丽", "zhēn měilì", "sungguh cantik")
        )
    )
)

val bab27Stage5Part2Exercises = listOf(
    // 1. Soal 1: Pilihan Gambar (上网 -> berselancar daring)
    Exercise(
        id = "u27_s5_p2_q1",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "上网",
        targetPinyin = "shàngwǎng",
        targetTranslation = "online",
        correctAnswer = "online",
        audioToSpeak = "上网",
        pictureOptions = listOf(
            PictureOption("u27_s5_p2_opt1", "internet", "", R.drawable.ic_digi_surf_internet, true),
            PictureOption("u27_s5_p2_opt2", "bunga", "", R.drawable.ic_nature_flower_bloom, false),
            PictureOption("u27_s5_p2_opt3", "burung", "", R.drawable.ic_nature_bird_singing, false),
            PictureOption("u27_s5_p2_opt4", "musik", "", R.drawable.ic_digi_music_sing, false)
        )
    ),

    // 2. Soal 2: Susun Kalimat (Saya menyalakan komputer berselancar daring.)
    Exercise(
        id = "u27_s5_p2_q2",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Saya buka komputer berinternet.",
        targetHanzi = "我 打开 电脑 上网。",
        targetPinyin = "Wǒ dǎkāi diànnǎo shàngwǎng.",
        wordChips = listOf("我:wǒ", "打开:dǎkāi", "电脑:diànnǎo", "上网。:shàngwǎng.", "关上:guānshàng"),
        correctAnswer = "我,打开,电脑,上网。",
        audioToSpeak = "我打开电脑上网。"
    ),

    // 3. Soal 3: Ketuk Pasangan yang Sesuai (Grand Sintesis Bab 27)
    Exercise(
        id = "u27_s5_p2_m3",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u27_s5_p2_m1", "上网", "shàngwǎng", "berinternet"),
            MatchPairItem("u27_s5_p2_m2", "打开", "dǎkāi", "membuka"),
            MatchPairItem("u27_s5_p2_m3", "快乐", "kuàilè", "bahagia"),
            MatchPairItem("u27_s5_p2_m4", "别忘", "bié wàng", "jangan lupa")
        )
    ),

    // 4. Soal 4: Ketik Pinyin (internetan -> shàngwǎng)
    Exercise(
        id = "u27_s5_p2_q4",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "berselancar di internet",
        sentenceWithBlank = "上网 (________)",
        targetHanzi = "上网",
        targetPinyin = "shàngwǎng",
        correctAnswer = "shangwang",
        keyboardKeys = listOf("s", "h", "a", "n", "g", "w", "e", "i", "o", "u", "b", "d"),
        audioToSpeak = "上网"
    ),

    // 5. Soal 5: Mendengar Kalimat (Rule 10: illustrationRes = 0)
    Exercise(
        id = "u27_s5_p2_q5",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Apa yang Anda dengar?",
        targetTranslation = "Setiap hari harus hidup dengan bahagia.",
        targetHanzi = "每天 都 要 快乐 生活。",
        targetPinyin = "Měitiān dōu yào kuàilè shēnghuó.",
        wordChips = listOf("每天:měitiān", "都:dōu", "要:yào", "快乐:kuàilè", "生活。:shēnghuó.", "难过:nánguò"),
        correctAnswer = "每天,都,要,快乐,生活。",
        illustrationRes = 0,
        audioToSpeak = "每天都要快乐生活。"
    ),

    // 6. Soal 6: Pilihan Kalimat
    Exercise(
        id = "u27_s5_p2_q6",
        type = ExerciseType.SENTENCE_CHOICE,
        title = "Pilih terjemahan yang benar",
        targetHanzi = "别 忘 了 明天 有 很多 事情 要 做。",
        targetPinyin = "Bié wàng le míngtiān yǒu hěn duō shìqing yào zuò.",
        targetTranslation = "Jangan lupa besok ada banyak urusan yang harus dikerjakan.",
        correctAnswer = "Bié wàng le míngtiān yǒu hěn duō shìqing yào zuò.\n别 忘 了 明天 有 很多 事情 要 做。",
        options = listOf(
            "Bié wàng le míngtiān yǒu hěn duō shìqing yào zuò.\n别 忘 了 明天 有 很多 事情 要 做。",
            "Yǐjīng wàng le míngtiān yǒu shìqing yào zuò.\n已经 忘 了 明天 有 事情 要 做。",
            "Míngtiān méiyǒu shìqing yào zuò.\n明天 没有 事情 要 做。"
        ),
        audioToSpeak = "别忘了明天有很多事情要做。"
    ),

    // 7. Soal 7: Pilihan Gambar (快乐 -> bahagia bersukacita)
    Exercise(
        id = "u27_s5_p2_q7",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "快乐",
        targetPinyin = "kuàilè",
        targetTranslation = "bahagia",
        correctAnswer = "bahagia",
        audioToSpeak = "快乐",
        pictureOptions = listOf(
            PictureOption("u27_s5_p2_opt7_1", "bahagia", "", R.drawable.ic_digi_music_sing, true),
            PictureOption("u27_s5_p2_opt7_2", "foto", "", R.drawable.ic_digi_camera_photo, false),
            PictureOption("u27_s5_p2_opt7_3", "internet", "", R.drawable.ic_digi_surf_internet, false),
            PictureOption("u27_s5_p2_opt7_4", "lukisan", "", R.drawable.ic_hobby_painting, false)
        )
    ),

    // 8. Soal 8: Ketik Pinyin (bahagia -> kuàilè)
    Exercise(
        id = "u27_s5_p2_q8",
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

    // 9. Soal 9: Susun Kalimat (Saya tidak melupakan hal ini.)
    Exercise(
        id = "u27_s5_p2_q9",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Saya tidak lupa urusan ini.",
        targetHanzi = "我 没 忘 这 件 事。",
        targetPinyin = "Wǒ méi wàng zhè jiàn shì.",
        wordChips = listOf("我:wǒ", "没:méi", "忘:wàng", "这:zhè", "件:jiàn", "事。:shì.", "了:le"),
        correctAnswer = "我,没,忘,这,件,事。",
        audioToSpeak = "我没忘这件事。"
    ),

    // 10. Soal 10: Ketuk Pasangan yang Sesuai (Grand Review Final Bab 27)
    Exercise(
        id = "u27_s5_p2_m10",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u27_s5_p2_m10_1", "天天快乐", "tiāntiān kuàilè", "bahagia tiap hari"),
            MatchPairItem("u27_s5_p2_m10_2", "做事情", "zuò shìqing", "kerja urusan"),
            MatchPairItem("u27_s5_p2_m10_3", "没忘记", "méi wàngjì", "tak terlupa"),
            MatchPairItem("u27_s5_p2_m10_4", "上网看", "shàngwǎng kàn", "nonton daring")
        )
    )
)
