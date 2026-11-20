package com.example.chineselearning.data.repository

import com.example.chineselearning.R
import com.example.chineselearning.data.model.Exercise
import com.example.chineselearning.data.model.ExerciseType
import com.example.chineselearning.data.model.MatchPairItem
import com.example.chineselearning.data.model.PictureOption

val bab17Stage1Part1Exercises = listOf(
    // 1. Soal 1: Pilihan Gambar (爷爷 -> kakek)
    Exercise(
        id = "u17_s1_p1_q1",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "爷爷",
        targetPinyin = "yéye",
        targetTranslation = "kakek",
        correctAnswer = "kakek",
        audioToSpeak = "爷爷",
        pictureOptions = listOf(
            PictureOption("u17_s1_p1_opt1", "kakek", "", R.drawable.ic_fam_grandfather, true),
            PictureOption("u17_s1_p1_opt2", "nenek", "", R.drawable.ic_fam_grandmother, false),
            PictureOption("u17_s1_p1_opt3", "anak", "", R.drawable.ic_fam_child, false),
            PictureOption("u17_s1_p1_opt4", "rumah", "", R.drawable.ic_fam_home, false)
        )
    ),

    // 2. Soal 2: Susun Kalimat (Kakek saya tahun ini berusia 70 tahun.)
    Exercise(
        id = "u17_s1_p1_q2",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Kakek saya tahun ini 70 tahun.",
        targetHanzi = "我 爷爷 今年 七十 岁。",
        targetPinyin = "Wǒ yéye jīnnián qīshí suì.",
        wordChips = listOf("我:wǒ", "爷爷:yéye", "今年:jīnnián", "七十:qīshí", "岁。:suì.", "奶奶:nǎinai"),
        correctAnswer = "我,爷爷,今年,七十,岁。",
        audioToSpeak = "我爷爷今年七十岁。"
    ),

    // 3. Soal 3: Ketuk Pasangan yang Sesuai (Kakek & Nenek)
    Exercise(
        id = "u17_s1_p1_q3",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u17_s1_p1_m1", "爷爷", "yéye", "kakek"),
            MatchPairItem("u17_s1_p1_m2", "奶奶", "nǎinai", "nenek"),
            MatchPairItem("u17_s1_p1_m3", "今年", "jīnnián", "tahun ini"),
            MatchPairItem("u17_s1_p1_m4", "做饭", "zuòfàn", "memasak")
        )
    ),

    // 4. Soal 4: Ketik Pinyin (kakek -> yéye)
    Exercise(
        id = "u17_s1_p1_q4",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "kakek",
        sentenceWithBlank = "爷爷 (________)",
        targetHanzi = "爷爷",
        targetPinyin = "yéye",
        correctAnswer = "yeye",
        keyboardKeys = listOf("y", "e", "a", "i", "o", "u", "b", "d", "g", "h", "j", "l"),
        audioToSpeak = "爷爷"
    ),

    // 5. Soal 5: Mendengar Kalimat (Rule 10: illustrationRes = 0)
    Exercise(
        id = "u17_s1_p1_q5",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Apa yang Anda dengar?",
        targetTranslation = "Nenek memasak sangat enak.",
        targetHanzi = "奶奶 做饭 很 好吃。",
        targetPinyin = "Nǎinai zuòfàn hěn hǎochī.",
        wordChips = listOf("奶奶:nǎinai", "做饭:zuòfàn", "很:hěn", "好吃。:hǎochī.", "爷爷:yéye"),
        correctAnswer = "奶奶,做饭,很,好吃。",
        illustrationRes = 0,
        audioToSpeak = "奶奶做饭很好吃。"
    ),

    // 6. Soal 6: Pilihan Kalimat
    Exercise(
        id = "u17_s1_p1_q6",
        type = ExerciseType.SENTENCE_CHOICE,
        title = "Pilih terjemahan yang benar",
        targetHanzi = "我 常常 去 看 爷爷 和 奶奶。",
        targetPinyin = "Wǒ chángcháng qù kàn yéye hé nǎinai.",
        targetTranslation = "Saya sering pergi menjenguk kakek dan nenek.",
        correctAnswer = "Wǒ chángcháng qù kàn yéye hé nǎinai.\n我 常常 去 看 爷爷 和 奶奶。",
        options = listOf(
            "Wǒ chángcháng qù kàn yéye hé nǎinai.\n我 常常 去 看 爷爷 和 奶奶。",
            "Wǒ bú qù kàn yéye hé nǎinai.\n我 不 去 看 爷爷 和 奶奶。",
            "Tā chángcháng qù kàn yéye hé nǎinai.\n他 常常 去 看 爷爷 和 奶奶。"
        ),
        audioToSpeak = "我常常去看爷爷和奶奶。"
    ),

    // 7. Soal 7: Pilihan Gambar (奶奶 -> nenek)
    Exercise(
        id = "u17_s1_p1_q7",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "奶奶",
        targetPinyin = "nǎinai",
        targetTranslation = "nenek",
        correctAnswer = "nenek",
        audioToSpeak = "奶奶",
        pictureOptions = listOf(
            PictureOption("u17_s1_p1_opt7_1", "nenek", "", R.drawable.ic_fam_grandmother, true),
            PictureOption("u17_s1_p1_opt7_2", "kakek", "", R.drawable.ic_fam_grandfather, false),
            PictureOption("u17_s1_p1_opt7_3", "anak", "", R.drawable.ic_fam_child, false),
            PictureOption("u17_s1_p1_opt7_4", "rumah", "", R.drawable.ic_fam_home, false)
        )
    ),

    // 8. Soal 8: Ketik Pinyin (nenek -> nǎinai)
    Exercise(
        id = "u17_s1_p1_q8",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "nenek",
        sentenceWithBlank = "奶奶 (________)",
        targetHanzi = "奶奶",
        targetPinyin = "nǎinai",
        correctAnswer = "nainai",
        keyboardKeys = listOf("n", "a", "i", "e", "o", "u", "b", "d", "g", "h", "j", "l"),
        audioToSpeak = "奶奶"
    ),

    // 9. Soal 9: Susun Kalimat (Kakek dan nenek ada di rumah.)
    Exercise(
        id = "u17_s1_p1_q9",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Kakek dan nenek ada di rumah.",
        targetHanzi = "爷爷 和 奶奶 都 在 家。",
        targetPinyin = "Yéye hé nǎinai dōu zài jiā.",
        wordChips = listOf("爷爷:yéye", "和:hé", "奶奶:nǎinai", "都:dōu", "在:zài", "家。:jiā.", "学校:xuéxiào"),
        correctAnswer = "爷爷,和,奶奶,都,在,家。",
        audioToSpeak = "爷爷和奶奶都在家。"
    ),

    // 10. Soal 10: Ketuk Pasangan yang Sesuai (Rangkuman Kakek & Nenek)
    Exercise(
        id = "u17_s1_p1_m10",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u17_s1_p1_m10_1", "爷爷", "yéye", "kakek"),
            MatchPairItem("u17_s1_p1_m10_2", "奶奶", "nǎinai", "nenek"),
            MatchPairItem("u17_s1_p1_m10_3", "在家", "zài jiā", "di rumah"),
            MatchPairItem("u17_s1_p1_m10_4", "好吃", "hǎochī", "enak")
        )
    )
)

val bab17Stage1Part2Exercises = listOf(
    // 1. Soal 1: Pilihan Gambar (丈夫 -> suami)
    Exercise(
        id = "u17_s1_p2_q1",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "丈夫",
        targetPinyin = "zhàngfu",
        targetTranslation = "suami",
        correctAnswer = "suami",
        audioToSpeak = "丈夫",
        pictureOptions = listOf(
            PictureOption("u17_s1_p2_opt1", "suami", "", R.drawable.ic_work_gentleman, true),
            PictureOption("u17_s1_p2_opt2", "istri", "", R.drawable.ic_work_lady, false),
            PictureOption("u17_s1_p2_opt3", "anak", "", R.drawable.ic_fam_child, false),
            PictureOption("u17_s1_p2_opt4", "rumah", "", R.drawable.ic_fam_home, false)
        )
    ),

    // 2. Soal 2: Susun Kalimat (Suaminya adalah seorang dokter.)
    Exercise(
        id = "u17_s1_p2_q2",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Suaminya adalah dokter.",
        targetHanzi = "她 的 丈夫 是 医生。",
        targetPinyin = "Tā de zhàngfu shì yīshēng.",
        wordChips = listOf("她:tā", "的:de", "丈夫:zhàngfu", "是:shì", "医生。:yīshēng.", "妻子:qīzi"),
        correctAnswer = "她,的,丈夫,是,医生。",
        audioToSpeak = "她的丈夫是医生。"
    ),

    // 3. Soal 3: Ketuk Pasangan yang Sesuai (Suami & Istri)
    Exercise(
        id = "u17_s1_p2_m3",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u17_s1_p2_m1", "丈夫", "zhàngfu", "suami"),
            MatchPairItem("u17_s1_p2_m2", "妻子", "qīzi", "istri"),
            MatchPairItem("u17_s1_p2_m3", "医生", "yīshēng", "dokter"),
            MatchPairItem("u17_s1_p2_m4", "旅游", "lǚyóu", "berwisata")
        )
    ),

    // 4. Soal 4: Ketik Pinyin (suami -> zhàngfu)
    Exercise(
        id = "u17_s1_p2_q4",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "suami",
        sentenceWithBlank = "丈夫 (________)",
        targetHanzi = "丈夫",
        targetPinyin = "zhàngfu",
        correctAnswer = "zhangfu",
        keyboardKeys = listOf("z", "h", "a", "n", "g", "f", "u", "e", "i", "o", "b", "d"),
        audioToSpeak = "丈夫"
    ),

    // 5. Soal 5: Mendengar Kalimat (Rule 10: illustrationRes = 0)
    Exercise(
        id = "u17_s1_p2_q5",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Apa yang Anda dengar?",
        targetTranslation = "Saya dan istri suka berwisata.",
        targetHanzi = "我 和 妻子 都 喜欢 旅游。",
        targetPinyin = "Wǒ hé qīzi dōu xǐhuan lǚyóu.",
        wordChips = listOf("我:wǒ", "和:hé", "妻子:qīzi", "都:dōu", "喜欢:xǐhuan", "旅游。:lǚyóu.", "丈夫:zhàngfu"),
        correctAnswer = "我,和,妻子,都,喜欢,旅游。",
        illustrationRes = 0,
        audioToSpeak = "我和妻子都喜欢旅游。"
    ),

    // 6. Soal 6: Pilihan Kalimat
    Exercise(
        id = "u17_s1_p2_q6",
        type = ExerciseType.SENTENCE_CHOICE,
        title = "Pilih terjemahan yang benar",
        targetHanzi = "他 的 妻子 是 一 名 老师。",
        targetPinyin = "Tā de qīzi shì yì míng lǎoshī.",
        targetTranslation = "Istrinya adalah seorang guru.",
        correctAnswer = "Tā de qīzi shì yì míng lǎoshī.\n他 的 妻子 是 一 名 老师。",
        options = listOf(
            "Tā de qīzi shì yì míng lǎoshī.\n他 的 妻子 是 一 名 老师。",
            "Tā de zhàngfu shì yì míng lǎoshī.\n他 的 丈夫 是 一 名 老师。",
            "Wǒ de qīzi shì yì míng yīshēng.\n我 的 妻子 是 一 名 医生。"
        ),
        audioToSpeak = "他的妻子是一名老师。"
    ),

    // 7. Soal 7: Pilihan Gambar (妻子 -> istri)
    Exercise(
        id = "u17_s1_p2_q7",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "妻子",
        targetPinyin = "qīzi",
        targetTranslation = "istri",
        correctAnswer = "istri",
        audioToSpeak = "妻子",
        pictureOptions = listOf(
            PictureOption("u17_s1_p2_opt7_1", "istri", "", R.drawable.ic_work_lady, true),
            PictureOption("u17_s1_p2_opt7_2", "suami", "", R.drawable.ic_work_gentleman, false),
            PictureOption("u17_s1_p2_opt7_3", "anak", "", R.drawable.ic_fam_child, false),
            PictureOption("u17_s1_p2_opt7_4", "rumah", "", R.drawable.ic_fam_home, false)
        )
    ),

    // 8. Soal 8: Ketik Pinyin (istri -> qīzi)
    Exercise(
        id = "u17_s1_p2_q8",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "istri",
        sentenceWithBlank = "妻子 (________)",
        targetHanzi = "妻子",
        targetPinyin = "qīzi",
        correctAnswer = "qizi",
        keyboardKeys = listOf("q", "i", "z", "a", "e", "o", "u", "b", "d", "g", "h", "j"),
        audioToSpeak = "妻子"
    ),

    // 9. Soal 9: Susun Kalimat (Suami dan istri saling mencintai.)
    Exercise(
        id = "u17_s1_p2_q9",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Suami dan istri saling mencintai.",
        targetHanzi = "丈夫 和 妻子 很 相爱。",
        targetPinyin = "Zhàngfu hé qīzi hěn xiāng'ài.",
        wordChips = listOf("丈夫:zhàngfu", "和:hé", "妻子:qīzi", "很:hěn", "相爱。:xiāng'ài.", "都:dōu"),
        correctAnswer = "丈夫,和,妻子,很,相爱。",
        audioToSpeak = "丈夫和妻子很相爱。"
    ),

    // 10. Soal 10: Ketuk Pasangan yang Sesuai (Rangkuman Suami Istri)
    Exercise(
        id = "u17_s1_p2_m10",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u17_s1_p2_m10_1", "丈夫", "zhàngfu", "suami"),
            MatchPairItem("u17_s1_p2_m10_2", "妻子", "qīzi", "istri"),
            MatchPairItem("u17_s1_p2_m10_3", "老师", "lǎoshī", "guru"),
            MatchPairItem("u17_s1_p2_m10_4", "喜欢", "xǐhuan", "suka")
        )
    )
)
