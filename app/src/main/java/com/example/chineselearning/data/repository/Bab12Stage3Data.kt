package com.example.chineselearning.data.repository

import com.example.chineselearning.R
import com.example.chineselearning.data.model.Exercise
import com.example.chineselearning.data.model.ExerciseType
import com.example.chineselearning.data.model.MatchPairItem
import com.example.chineselearning.data.model.PictureOption

val bab12Stage3Part1Exercises = listOf(
    // 1. Soal 1: Pilihan Gambar (先生 -> Tuan / Bapak)
    Exercise(
        id = "u12_s3_p1_q1",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "先生",
        targetPinyin = "xiānsheng",
        targetTranslation = "tuan / bapak",
        correctAnswer = "tuan / bapak",
        audioToSpeak = "先生",
        pictureOptions = listOf(
            PictureOption("u12_s3_p1_opt1", "tuan / bapak", "", R.drawable.ic_work_gentleman, true),
            PictureOption("u12_s3_p1_opt2", "nyonya", "", R.drawable.ic_work_lady, false),
            PictureOption("u12_s3_p1_opt3", "murid", "", R.drawable.ic_edu_primary_school, false),
            PictureOption("u12_s3_p1_opt4", "anak", "", R.drawable.ic_fam_child, false)
        )
    ),

    // 2. Soal 2: Susun Kalimat (Halo Tuan Wang!)
    Exercise(
        id = "u12_s3_p1_q2",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Halo Tuan Wang!",
        targetHanzi = "王 先生， 你好！",
        targetPinyin = "Wáng xiānsheng, nǐhǎo!",
        wordChips = listOf("王:Wáng", "先生，:xiānsheng,", "你好！:nǐhǎo!", "女士，:nǚshì,", "李:Lǐ"),
        correctAnswer = "王,先生，,你好！",
        audioToSpeak = "王先生，你好！"
    ),

    // 3. Soal 3: Ketuk Pasangan yang Sesuai (Panggilan Hormat)
    Exercise(
        id = "u12_s3_p1_q3",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u12_s3_p1_m1", "先生", "xiānsheng", "tuan / bapak"),
            MatchPairItem("u12_s3_p1_m2", "女士", "nǚshì", "nyonya / nona"),
            MatchPairItem("u12_s3_p1_m3", "王先生", "Wáng xiānsheng", "Tuan Wang"),
            MatchPairItem("u12_s3_p1_m4", "李女士", "Lǐ nǚshì", "Nyonya Li")
        )
    ),

    // 4. Soal 4: Ketik Pinyin (tuan -> xiānsheng)
    Exercise(
        id = "u12_s3_p1_q4",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "tuan / bapak",
        sentenceWithBlank = "先生 (________)",
        targetHanzi = "先生",
        targetPinyin = "xiānsheng",
        correctAnswer = "xiansheng",
        keyboardKeys = listOf("x", "i", "a", "n", "s", "h", "e", "g", "o", "u", "b"),
        audioToSpeak = "先生"
    ),

    // 5. Soal 5: Mendengar Kalimat (Rule 10: illustrationRes = 0)
    Exercise(
        id = "u12_s3_p1_q5",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Apa yang Anda dengar?",
        targetTranslation = "Apakah Nyonya Li ada di kantor?",
        targetHanzi = "李 女士 在 公司 吗？",
        targetPinyin = "Lǐ nǚshì zài gōngsī ma?",
        wordChips = listOf("李:Lǐ", "女士:nǚshì", "在:zài", "公司:gōngsī", "吗？:ma?", "王:Wáng"),
        correctAnswer = "李,女士,在,公司,吗？",
        illustrationRes = 0,
        audioToSpeak = "李女士在公司吗？"
    ),

    // 6. Soal 6: Pilihan Kalimat
    Exercise(
        id = "u12_s3_p1_q6",
        type = ExerciseType.SENTENCE_CHOICE,
        title = "Pilih terjemahan yang benar",
        targetHanzi = "张 先生 在 看 电脑。",
        targetPinyin = "Zhāng xiānsheng zài kàn diànnǎo.",
        targetTranslation = "Tuan Zhang sedang melihat komputer.",
        correctAnswer = "Zhāng xiānsheng zài kàn diànnǎo.\n张 先生 在 看 电脑。",
        options = listOf(
            "Zhāng xiānsheng zài kàn diànnǎo.\n张 先生 在 看 电脑。",
            "Zhāng nǚshì zài kàn diànnǎo.\n张 女士 在 看 电脑。",
            "Zhāng xiānsheng zài kàn shū.\n张 先生 在 看 书。"
        ),
        audioToSpeak = "张先生在看电脑。"
    ),

    // 7. Soal 7: Pilihan Gambar (女士 -> Nyonya / Nona)
    Exercise(
        id = "u12_s3_p1_q7",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "女士",
        targetPinyin = "nǚshì",
        targetTranslation = "nyonya / nona",
        correctAnswer = "nyonya / nona",
        audioToSpeak = "女士",
        pictureOptions = listOf(
            PictureOption("u12_s3_p1_opt7_1", "nyonya / nona", "", R.drawable.ic_work_lady, true),
            PictureOption("u12_s3_p1_opt7_2", "tuan / bapak", "", R.drawable.ic_work_gentleman, false),
            PictureOption("u12_s3_p1_opt7_3", "murid", "", R.drawable.ic_edu_primary_school, false),
            PictureOption("u12_s3_p1_opt7_4", "guru", "", R.drawable.ic_teacher_avatar, false)
        )
    ),

    // 8. Soal 8: Ketik Pinyin (nyonya/nona -> nǚshì)
    Exercise(
        id = "u12_s3_p1_q8",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "nyonya / nona",
        sentenceWithBlank = "女士 (________)",
        targetHanzi = "女士",
        targetPinyin = "nǚshì",
        correctAnswer = "nvshi",
        keyboardKeys = listOf("n", "v", "s", "h", "i", "a", "e", "o", "u", "b", "d"),
        audioToSpeak = "女士"
    ),

    // 9. Soal 9: Susun Kalimat (Nyonya Wang sangat baik.)
    Exercise(
        id = "u12_s3_p1_q9",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Nyonya Wang sangat baik.",
        targetHanzi = "王 女士 很 好。",
        targetPinyin = "Wáng nǚshì hěn hǎo.",
        wordChips = listOf("王:Wáng", "女士:nǚshì", "很:hěn", "好:hǎo", "先生:xiānsheng"),
        correctAnswer = "王,女士,很,好",
        audioToSpeak = "王女士很好。"
    ),

    // 10. Soal 10: Ketuk Pasangan yang Sesuai (Rangkuman Panggilan Hormat)
    Exercise(
        id = "u12_s3_p1_m10_1",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u12_s3_p1_m10_1", "先生", "xiānsheng", "tuan"),
            MatchPairItem("u12_s3_p1_m10_2", "女士", "nǚshì", "nyonya"),
            MatchPairItem("u12_s3_p1_m10_3", "老师", "lǎoshī", "guru"),
            MatchPairItem("u12_s3_p1_m10_4", "你好", "nǐhǎo", "halo")
        )
    )
)

val bab12Stage3Part2Exercises = listOf(
    // 1. Soal 1: Pilihan Gambar (找 -> mencari)
    Exercise(
        id = "u12_s3_p2_q1",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "找",
        targetPinyin = "zhǎo",
        targetTranslation = "mencari",
        correctAnswer = "mencari",
        audioToSpeak = "找",
        pictureOptions = listOf(
            PictureOption("u12_s3_p2_opt1", "mencari", "", R.drawable.ic_work_search, true),
            PictureOption("u12_s3_p2_opt2", "memberi", "", R.drawable.ic_work_give, false),
            PictureOption("u12_s3_p2_opt3", "makan", "", R.drawable.ic_action_eat, false),
            PictureOption("u12_s3_p2_opt4", "tidur", "", R.drawable.ic_action_sleep, false)
        )
    ),

    // 2. Soal 2: Susun Kalimat (Anda mencari siapa?)
    Exercise(
        id = "u12_s3_p2_q2",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Anda mencari siapa?",
        targetHanzi = "你 找 谁？",
        targetPinyin = "Nǐ zhǎo shéi?",
        wordChips = listOf("你:nǐ", "找:zhǎo", "谁？:shéi?", "他:tā", "做:zuò"),
        correctAnswer = "你,找,谁？",
        audioToSpeak = "你找谁？"
    ),

    // 3. Soal 3: Ketuk Pasangan yang Sesuai (Mencari & Melakukan)
    Exercise(
        id = "u12_s3_p2_q3",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u12_s3_p2_m1", "找", "zhǎo", "mencari"),
            MatchPairItem("u12_s3_p2_m2", "做", "zuò", "membuat / melakukan"),
            MatchPairItem("u12_s3_p2_m3", "找人", "zhǎo rén", "mencari orang"),
            MatchPairItem("u12_s3_p2_m4", "做什么", "zuò shénme", "melakukan apa")
        )
    ),

    // 4. Soal 4: Ketik Pinyin (mencari -> zhǎo)
    Exercise(
        id = "u12_s3_p2_q4",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "mencari",
        sentenceWithBlank = "找 (________)",
        targetHanzi = "找",
        targetPinyin = "zhǎo",
        correctAnswer = "zhao",
        keyboardKeys = listOf("z", "h", "a", "o", "e", "i", "u", "b", "d", "g", "j"),
        audioToSpeak = "找"
    ),

    // 5. Soal 5: Mendengar Kalimat (Rule 10: illustrationRes = 0)
    Exercise(
        id = "u12_s3_p2_q5",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Apa yang Anda dengar?",
        targetTranslation = "Saya mencari Tuan Wang.",
        targetHanzi = "我 找 王 先生。",
        targetPinyin = "Wǒ zhǎo Wáng xiānsheng.",
        wordChips = listOf("我:wǒ", "找:zhǎo", "王:Wáng", "先生:xiānsheng", "李:Lǐ", "女士:nǚshì"),
        correctAnswer = "我,找,王,先生",
        illustrationRes = 0,
        audioToSpeak = "我找王先生。"
    ),

    // 6. Soal 6: Pilihan Kalimat
    Exercise(
        id = "u12_s3_p2_q6",
        type = ExerciseType.SENTENCE_CHOICE,
        title = "Pilih terjemahan yang benar",
        targetHanzi = "你 在 做 什么 工作？",
        targetPinyin = "Nǐ zài zuò shénme gōngzuò?",
        targetTranslation = "Kamu sedang melakukan pekerjaan apa?",
        correctAnswer = "Nǐ zài zuò shénme gōngzuò?\n你 在 做 什么 工作？",
        options = listOf(
            "Nǐ zài zuò shénme gōngzuò?\n你 在 做 什么 工作？",
            "Tā zài zuò shénme gōngzuò?\n他 在 做 什么 工作？",
            "Nǐ zài zhǎo shénme gōngzuò?\n你 在 找 什么 工作？"
        ),
        audioToSpeak = "你在做什么工作？"
    ),

    // 7. Soal 7: Pilihan Gambar (做 -> melakukan / membuat)
    Exercise(
        id = "u12_s3_p2_q7",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "做",
        targetPinyin = "zuò",
        targetTranslation = "melakukan / membuat",
        correctAnswer = "melakukan / membuat",
        audioToSpeak = "做",
        pictureOptions = listOf(
            PictureOption("u12_s3_p2_opt7_1", "melakukan / membuat", "", R.drawable.ic_work_job, true),
            PictureOption("u12_s3_p2_opt7_2", "mencari", "", R.drawable.ic_work_search, false),
            PictureOption("u12_s3_p2_opt7_3", "makan", "", R.drawable.ic_action_eat, false),
            PictureOption("u12_s3_p2_opt7_4", "tidur", "", R.drawable.ic_action_sleep, false)
        )
    ),

    // 8. Soal 8: Ketik Pinyin (melakukan/membuat -> zuò)
    Exercise(
        id = "u12_s3_p2_q8",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "melakukan / membuat",
        sentenceWithBlank = "做 (________)",
        targetHanzi = "做",
        targetPinyin = "zuò",
        correctAnswer = "zuo",
        keyboardKeys = listOf("z", "u", "o", "a", "e", "i", "b", "d", "g", "h", "j"),
        audioToSpeak = "做"
    ),

    // 9. Soal 9: Susun Kalimat (Saya sedang mencari buku.)
    Exercise(
        id = "u12_s3_p2_q9",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Saya sedang mencari buku.",
        targetHanzi = "我 在 找 书。",
        targetPinyin = "Wǒ zài zhǎo shū.",
        wordChips = listOf("我:wǒ", "在:zài", "找:zhǎo", "书:shū", "看:kàn", "电脑:diànnǎo"),
        correctAnswer = "我,在,找,书",
        audioToSpeak = "我在找书。"
    ),

    // 10. Soal 10: Ketuk Pasangan yang Sesuai (Rangkuman Aksi Kerja)
    Exercise(
        id = "u12_s3_p2_m10_1",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u12_s3_p2_m10_1", "找人", "zhǎo rén", "cari orang"),
            MatchPairItem("u12_s3_p2_m10_2", "找工作", "zhǎo gōngzuò", "cari kerja"),
            MatchPairItem("u12_s3_p2_m10_3", "做饭", "zuò fàn", "memasak"),
            MatchPairItem("u12_s3_p2_m10_4", "做工作", "zuò gōngzuò", "melakukan kerja")
        )
    )
)
