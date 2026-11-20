package com.example.chineselearning.data.repository

import com.example.chineselearning.R
import com.example.chineselearning.data.model.Exercise
import com.example.chineselearning.data.model.ExerciseType
import com.example.chineselearning.data.model.MatchPairItem
import com.example.chineselearning.data.model.PictureOption

val bab17Stage2Part1Exercises = listOf(
    // 1. Soal 1: Pilihan Gambar (男孩儿 -> anak laki-laki)
    Exercise(
        id = "u17_s2_p1_q1",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "男孩儿",
        targetPinyin = "nánháiér",
        targetTranslation = "anak laki-laki",
        correctAnswer = "anak laki-laki",
        audioToSpeak = "男孩儿",
        pictureOptions = listOf(
            PictureOption("u17_s2_p1_opt1", "anak laki-laki", "", R.drawable.ic_child_boy, true),
            PictureOption("u17_s2_p1_opt2", "anak perempuan", "", R.drawable.ic_child_girl, false),
            PictureOption("u17_s2_p1_opt3", "ayah", "", R.drawable.ic_fam_father, false),
            PictureOption("u17_s2_p1_opt4", "ibu", "", R.drawable.ic_fam_mother, false)
        )
    ),

    // 2. Soal 2: Susun Kalimat (Anak laki-laki itu adalah siapa?)
    Exercise(
        id = "u17_s2_p1_q2",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Anak laki-laki itu siapa?",
        targetHanzi = "那个 男孩儿 是 谁？",
        targetPinyin = "Nàge nánháiér shì shéi?",
        wordChips = listOf("那个:nàge", "男孩儿:nánháiér", "是:shì", "谁？:shéi?", "女孩儿:nǚháiér"),
        correctAnswer = "那个,男孩儿,是,谁？",
        audioToSpeak = "那个男孩儿是谁？"
    ),

    // 3. Soal 3: Ketuk Pasangan yang Sesuai (Laki-laki & Perempuan)
    Exercise(
        id = "u17_s2_p1_q3",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u17_s2_p1_m1", "男孩儿", "nánháiér", "anak laki-laki"),
            MatchPairItem("u17_s2_p1_m2", "女孩儿", "nǚháiér", "anak perempuan"),
            MatchPairItem("u17_s2_p1_m3", "那个", "nàge", "yang itu"),
            MatchPairItem("u17_s2_p1_m4", "漂亮", "piàoliang", "cantik")
        )
    ),

    // 4. Soal 4: Ketik Pinyin (anak laki-laki -> nánháiér)
    Exercise(
        id = "u17_s2_p1_q4",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "anak laki-laki",
        sentenceWithBlank = "男孩儿 (________)",
        targetHanzi = "男孩儿",
        targetPinyin = "nánháiér",
        correctAnswer = "nanhair",
        keyboardKeys = listOf("n", "a", "h", "i", "r", "e", "o", "u", "b", "d", "g", "j"),
        audioToSpeak = "男孩儿"
    ),

    // 5. Soal 5: Mendengar Kalimat (Rule 10: illustrationRes = 0)
    Exercise(
        id = "u17_s2_p1_q5",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Apa yang Anda dengar?",
        targetTranslation = "Anak perempuan itu sangat cantik.",
        targetHanzi = "那个 女孩儿 很 漂亮。",
        targetPinyin = "Nàge nǚháiér hěn piàoliang.",
        wordChips = listOf("那个:nàge", "女孩儿:nǚháiér", "很:hěn", "漂亮。:piàoliang.", "男孩儿:nánháiér"),
        correctAnswer = "那个,女孩儿,很,漂亮。",
        illustrationRes = 0,
        audioToSpeak = "那个女孩儿很漂亮。"
    ),

    // 6. Soal 6: Pilihan Kalimat
    Exercise(
        id = "u17_s2_p1_q6",
        type = ExerciseType.SENTENCE_CHOICE,
        title = "Pilih terjemahan yang benar",
        targetHanzi = "前面 有 一 个 小 女孩儿。",
        targetPinyin = "Qiánmiàn yǒu yí gè xiǎo nǚháiér.",
        targetTranslation = "Di depan ada seorang anak perempuan kecil.",
        correctAnswer = "Qiánmiàn yǒu yí gè xiǎo nǚháiér.\n前面 有 一 个 小 女孩儿。",
        options = listOf(
            "Qiánmiàn yǒu yí gè xiǎo nǚháiér.\n前面 有 一 个 小 女孩儿。",
            "Hòumiàn yǒu yí gè xiǎo nǚháiér.\n后面 有 一 个 小 女孩儿。",
            "Qiánmiàn yǒu yí gè xiǎo nánháiér.\n前面 有 一 个 小 男孩儿。"
        ),
        audioToSpeak = "前面有一个小女孩儿。"
    ),

    // 7. Soal 7: Pilihan Gambar (女孩儿 -> anak perempuan)
    Exercise(
        id = "u17_s2_p1_q7",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "女孩儿",
        targetPinyin = "nǚháiér",
        targetTranslation = "anak perempuan",
        correctAnswer = "anak perempuan",
        audioToSpeak = "女孩儿",
        pictureOptions = listOf(
            PictureOption("u17_s2_p1_opt7_1", "anak perempuan", "", R.drawable.ic_child_girl, true),
            PictureOption("u17_s2_p1_opt7_2", "anak laki-laki", "", R.drawable.ic_child_boy, false),
            PictureOption("u17_s2_p1_opt7_3", "ayah", "", R.drawable.ic_fam_father, false),
            PictureOption("u17_s2_p1_opt7_4", "ibu", "", R.drawable.ic_fam_mother, false)
        )
    ),

    // 8. Soal 8: Ketik Pinyin (anak perempuan -> nǚháiér)
    Exercise(
        id = "u17_s2_p1_q8",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "anak perempuan",
        sentenceWithBlank = "女孩儿 (________)",
        targetHanzi = "女孩儿",
        targetPinyin = "nǚháiér",
        correctAnswer = "nvhair",
        keyboardKeys = listOf("n", "v", "h", "a", "i", "r", "e", "o", "u", "b", "d", "g"),
        audioToSpeak = "女孩儿"
    ),

    // 9. Soal 9: Susun Kalimat (Dua anak laki-laki sedang bermain sepak bola.)
    Exercise(
        id = "u17_s2_p1_q9",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Dua anak laki-laki bermain bola.",
        targetHanzi = "两个 男孩儿 在 踢 足球。",
        targetPinyin = "Liǎng gè nánháiér zài tī zúqiú.",
        wordChips = listOf("两个:liǎng gè", "男孩儿:nánháiér", "在:zài", "踢:tī", "足球。:zúqiú.", "女孩儿:nǚháiér"),
        correctAnswer = "两个,男孩儿,在,踢,足球。",
        audioToSpeak = "两个男孩儿在踢足球。"
    ),

    // 10. Soal 10: Ketuk Pasangan yang Sesuai (Rangkuman Anak Laki & Perempuan)
    Exercise(
        id = "u17_s2_p1_m10",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u17_s2_p1_m10_1", "男孩儿", "nánháiér", "anak laki-laki"),
            MatchPairItem("u17_s2_p1_m10_2", "女孩儿", "nǚháiér", "anak perempuan"),
            MatchPairItem("u17_s2_p1_m10_3", "足球", "zúqiú", "sepak bola"),
            MatchPairItem("u17_s2_p1_m10_4", "前面", "qiánmiàn", "di depan")
        )
    )
)

val bab17Stage2Part2Exercises = listOf(
    // 1. Soal 1: Pilihan Gambar (小孩儿 -> anak kecil / bocah)
    Exercise(
        id = "u17_s2_p2_q1",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "小孩儿",
        targetPinyin = "xiǎoháiér",
        targetTranslation = "anak kecil / bocah",
        correctAnswer = "anak kecil / bocah",
        audioToSpeak = "小孩儿",
        pictureOptions = listOf(
            PictureOption("u17_s2_p2_opt1", "anak kecil", "", R.drawable.ic_fam_child, true),
            PictureOption("u17_s2_p2_opt2", "ayah", "", R.drawable.ic_fam_father, false),
            PictureOption("u17_s2_p2_opt3", "pria dewasa", "", R.drawable.ic_work_gentleman, false),
            PictureOption("u17_s2_p2_opt4", "rumah", "", R.drawable.ic_fam_home, false)
        )
    ),

    // 2. Soal 2: Susun Kalimat (Bocah itu sedang bermain di kamar.)
    Exercise(
        id = "u17_s2_p2_q2",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Bocah itu bermain di kamar.",
        targetHanzi = "小孩儿 在 房间 里 玩。",
        targetPinyin = "Xiǎoháiér zài fángjiān lǐ wán.",
        wordChips = listOf("小孩儿:xiǎoháiér", "在:zài", "房间:fángjiān", "里:lǐ", "玩。:wán.", "看书:kànshū"),
        correctAnswer = "小孩儿,在,房间,里,玩。",
        audioToSpeak = "小孩儿在房间里玩。"
    ),

    // 3. Soal 3: Ketuk Pasangan yang Sesuai (Bocah & Ruangan)
    Exercise(
        id = "u17_s2_p2_m3",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u17_s2_p2_m1", "小孩儿", "xiǎoháiér", "bocah / anak kecil"),
            MatchPairItem("u17_s2_p2_m2", "房间", "fángjiān", "kamar / ruangan"),
            MatchPairItem("u17_s2_p2_m3", "玩", "wán", "bermain"),
            MatchPairItem("u17_s2_p2_m4", "很多", "hěn duō", "banyak")
        )
    ),

    // 4. Soal 4: Ketik Pinyin (anak kecil -> xiǎoháiér)
    Exercise(
        id = "u17_s2_p2_q4",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "anak kecil / bocah",
        sentenceWithBlank = "小孩儿 (________)",
        targetHanzi = "小孩儿",
        targetPinyin = "xiǎoháiér",
        correctAnswer = "xiaohair",
        keyboardKeys = listOf("x", "i", "a", "o", "h", "r", "e", "u", "b", "d", "g", "j"),
        audioToSpeak = "小孩儿"
    ),

    // 5. Soal 5: Mendengar Kalimat (Rule 10: illustrationRes = 0)
    Exercise(
        id = "u17_s2_p2_q5",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Apa yang Anda dengar?",
        targetTranslation = "Tiga bocah itu sangat senang.",
        targetHanzi = "三个 小孩儿 都 很 高兴。",
        targetPinyin = "Sān gè xiǎoháiér dōu hěn gāoxìng.",
        wordChips = listOf("三个:sān gè", "小孩儿:xiǎoháiér", "都:dōu", "很:hěn", "高兴。:gāoxìng.", "一个:yí gè"),
        correctAnswer = "三个,小孩儿,都,很,高兴。",
        illustrationRes = 0,
        audioToSpeak = "三个小孩儿都很高兴。"
    ),

    // 6. Soal 6: Pilihan Kalimat
    Exercise(
        id = "u17_s2_p2_q6",
        type = ExerciseType.SENTENCE_CHOICE,
        title = "Pilih terjemahan yang benar",
        targetHanzi = "公园 里 有 很多 小孩儿。",
        targetPinyin = "Gōngyuán lǐ yǒu hěn duō xiǎoháiér.",
        targetTranslation = "Di dalam taman ada banyak anak kecil.",
        correctAnswer = "Gōngyuán lǐ yǒu hěn duō xiǎoháiér.\n公园 里 有 很多 小孩儿。",
        options = listOf(
            "Gōngyuán lǐ yǒu hěn duō xiǎoháiér.\n公园 里 有 很多 小孩儿。",
            "Gōngyuán lǐ méiyǒu xiǎoháiér.\n公园 里 没有 小孩儿。",
            "Xuéxiào lǐ yǒu hěn duō xiǎoháiér.\n学校 里 有 很多 小孩儿。"
        ),
        audioToSpeak = "公园里有很多小孩儿。"
    ),

    // 7. Soal 7: Pilihan Gambar (小孩儿 -> anak kecil)
    Exercise(
        id = "u17_s2_p2_q7",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "小孩儿",
        targetPinyin = "xiǎoháiér",
        targetTranslation = "anak kecil",
        correctAnswer = "anak kecil",
        audioToSpeak = "小孩儿",
        pictureOptions = listOf(
            PictureOption("u17_s2_p2_opt7_1", "anak kecil", "", R.drawable.ic_fam_child, true),
            PictureOption("u17_s2_p2_opt7_2", "wanita", "", R.drawable.ic_work_lady, false),
            PictureOption("u17_s2_p2_opt7_3", "pria", "", R.drawable.ic_work_gentleman, false),
            PictureOption("u17_s2_p2_opt7_4", "rumah", "", R.drawable.ic_fam_home, false)
        )
    ),

    // 8. Soal 8: Ketik Pinyin (anak kecil -> xiǎoháiér)
    Exercise(
        id = "u17_s2_p2_q8",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "anak kecil",
        sentenceWithBlank = "小孩儿 (________)",
        targetHanzi = "小孩儿",
        targetPinyin = "xiǎoháiér",
        correctAnswer = "xiaohair",
        keyboardKeys = listOf("x", "i", "a", "o", "h", "r", "e", "u", "b", "d", "g", "j"),
        audioToSpeak = "小孩儿"
    ),

    // 9. Soal 9: Susun Kalimat (Anak kecil suka makan buah apel.)
    Exercise(
        id = "u17_s2_p2_q9",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Anak kecil suka makan apel.",
        targetHanzi = "小孩儿 喜欢 吃 苹果。",
        targetPinyin = "Xiǎoháiér xǐhuan chī píngguǒ.",
        wordChips = listOf("小孩儿:xiǎoháiér", "喜欢:xǐhuan", "吃:chī", "苹果。:píngguǒ.", "西瓜:xīguā"),
        correctAnswer = "小孩儿,喜欢,吃,苹果。",
        audioToSpeak = "小孩儿喜欢吃苹果。"
    ),

    // 10. Soal 10: Ketuk Pasangan yang Sesuai (Rangkuman Generasi Anak)
    Exercise(
        id = "u17_s2_p2_m10",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u17_s2_p2_m10_1", "小孩儿", "xiǎoháiér", "anak kecil"),
            MatchPairItem("u17_s2_p2_m10_2", "吃苹果", "chī píngguǒ", "makan apel"),
            MatchPairItem("u17_s2_p2_m10_3", "在玩", "zài wán", "sedang main"),
            MatchPairItem("u17_s2_p2_m10_4", "公园", "gōngyuán", "taman")
        )
    )
)
