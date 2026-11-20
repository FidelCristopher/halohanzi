package com.example.chineselearning.data.repository

import com.example.chineselearning.R
import com.example.chineselearning.data.model.Exercise
import com.example.chineselearning.data.model.ExerciseType
import com.example.chineselearning.data.model.MatchPairItem
import com.example.chineselearning.data.model.PictureOption

val bab21Stage3Part1Exercises = listOf(
    // 1. Soal 1: Pilihan Gambar (上来 -> naik ke sini)
    Exercise(
        id = "u21_s3_p1_q1",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "上来",
        targetPinyin = "shànglái",
        targetTranslation = "naik ke sini",
        correctAnswer = "naik ke sini",
        audioToSpeak = "上来",
        pictureOptions = listOf(
            PictureOption("u21_s3_p1_opt1", "naik ke sini", "", R.drawable.ic_pos_up, true),
            PictureOption("u21_s3_p1_opt2", "turun ke bawah", "", R.drawable.ic_pos_down, false),
            PictureOption("u21_s3_p1_opt3", "masuk ke dalam", "", R.drawable.ic_pos_in, false),
            PictureOption("u21_s3_p1_opt4", "keluar ke luar", "", R.drawable.ic_pos_out, false)
        )
    ),

    // 2. Soal 2: Susun Kalimat (Saya di lantai dua, cepatlah kamu naik kemari.)
    Exercise(
        id = "u21_s3_p1_q2",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Saya di lantai dua, cepat naik kemari.",
        targetHanzi = "我 在 二 楼， 你 快 上来 吧。",
        targetPinyin = "Wǒ zài èr lóu, nǐ kuài shànglái ba.",
        wordChips = listOf("我:wǒ", "在:zài", "二:èr", "楼，:lóu,", "你:nǐ", "快:kuài", "上来:shànglái", "吧。:ba.", "下去:xiàqù"),
        correctAnswer = "我,在,二,楼，,你,快,上来,吧。",
        audioToSpeak = "我在二楼，你快上来吧。"
    ),

    // 3. Soal 3: Ketuk Pasangan yang Sesuai (Naik Kemari)
    Exercise(
        id = "u21_s3_p1_q3",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u21_s3_p1_m1", "上来", "shànglái", "naik ke sini"),
            MatchPairItem("u21_s3_p1_m2", "二楼", "èr lóu", "lantai dua"),
            MatchPairItem("u21_s3_p1_m3", "走上来", "zǒu shànglái", "jalan naik kemari"),
            MatchPairItem("u21_s3_p1_m4", "快上来", "kuài shànglái", "cepat naik")
        )
    ),

    // 4. Soal 4: Ketik Pinyin (naik ke sini -> shànglái)
    Exercise(
        id = "u21_s3_p1_q4",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "naik ke sini",
        sentenceWithBlank = "上来 (________)",
        targetHanzi = "上来",
        targetPinyin = "shànglái",
        correctAnswer = "shanglai",
        keyboardKeys = listOf("s", "h", "a", "n", "g", "l", "i", "e", "o", "u", "b", "d"),
        audioToSpeak = "上来"
    ),

    // 5. Soal 5: Mendengar Kalimat (Rule 10: illustrationRes = 0)
    Exercise(
        id = "u21_s3_p1_q5",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Apa yang Anda dengar?",
        targetTranslation = "Silakan naik ke mobil.",
        targetHanzi = "请 大家 快 上 车 来。",
        targetPinyin = "Qǐng dàjiā kuài shàng chē lái.",
        wordChips = listOf("请:qǐng", "大家:dàjiā", "快:kuài", "上:shàng", "车:chē", "来。:lái.", "下:xià"),
        correctAnswer = "请,大家,快,上,车,来。",
        illustrationRes = 0,
        audioToSpeak = "请大家快上车来。"
    ),

    // 6. Soal 6: Pilihan Kalimat
    Exercise(
        id = "u21_s3_p1_q6",
        type = ExerciseType.SENTENCE_CHOICE,
        title = "Pilih terjemahan yang benar",
        targetHanzi = "他 拿 着 一 本 书 走 上来 了。",
        targetPinyin = "Tā ná zhe yì běn shū zǒu shànglái le.",
        targetTranslation = "Dia membawa buku berjalan naik kemari.",
        correctAnswer = "Tā ná zhe yì běn shū zǒu shànglái le.\n他 拿 着 一 本 书 走 上来 了。",
        options = listOf(
            "Tā ná zhe yì běn shū zǒu shànglái le.\n他 拿 着 一 本 书 走 上来 了。",
            "Tā ná zhe yì běn shū zǒu xiàlái le.\n他 拿 着 一 本 书 走 下来 了。",
            "Wǒ ná zhe yì běn shū zǒu shànglái le.\n我 拿 着 一 本 书 走 上来 了。"
        ),
        audioToSpeak = "他拿着一本书走上来了。"
    ),

    // 7. Soal 7: Pilihan Gambar (走上来 -> berjalan naik kemari)
    Exercise(
        id = "u21_s3_p1_q7",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "走上来",
        targetPinyin = "zǒu shànglái",
        targetTranslation = "berjalan naik kemari",
        correctAnswer = "berjalan naik kemari",
        audioToSpeak = "走上来",
        pictureOptions = listOf(
            PictureOption("u21_s3_p1_opt7_1", "naik kemari", "", R.drawable.ic_pos_up, true),
            PictureOption("u21_s3_p1_opt7_2", "turun ke bawah", "", R.drawable.ic_pos_down, false),
            PictureOption("u21_s3_p1_opt7_3", "keluar ke sana", "", R.drawable.ic_pos_out, false),
            PictureOption("u21_s3_p1_opt7_4", "masuk ke dalam", "", R.drawable.ic_pos_in, false)
        )
    ),

    // 8. Soal 8: Ketik Pinyin (naik ke sini -> shànglái)
    Exercise(
        id = "u21_s3_p1_q8",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "naik ke sini",
        sentenceWithBlank = "上来 (________)",
        targetHanzi = "上来",
        targetPinyin = "shànglái",
        correctAnswer = "shanglai",
        keyboardKeys = listOf("s", "h", "a", "n", "g", "l", "i", "e", "o", "u", "b", "d"),
        audioToSpeak = "上来"
    ),

    // 9. Soal 9: Susun Kalimat (Kucing kecil melompat naik kemari.)
    Exercise(
        id = "u21_s3_p1_q9",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Kucing melompat naik kemari.",
        targetHanzi = "小猫 跳 上来 了。",
        targetPinyin = "Xiǎomāo tiào shànglái le.",
        wordChips = listOf("小猫:xiǎomāo", "跳:tiào", "上来:shànglái", "了。:le.", "下去:xiàqù"),
        correctAnswer = "小猫,跳,上来,了。",
        audioToSpeak = "小猫跳上来了。"
    ),

    // 10. Soal 10: Ketuk Pasangan yang Sesuai (Rangkuman Naik Mendekat)
    Exercise(
        id = "u21_s3_p1_m10",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u21_s3_p1_m10_1", "上来", "shànglái", "naik kemari"),
            MatchPairItem("u21_s3_p1_m10_2", "跳上来", "tiào shànglái", "lompat naik"),
            MatchPairItem("u21_s3_p1_m10_3", "快上来", "kuài shànglái", "cepat naik"),
            MatchPairItem("u21_s3_p1_m10_4", "二楼上", "èr lóu shàng", "di lantai dua")
        )
    )
)

val bab21Stage3Part2Exercises = listOf(
    // 1. Soal 1: Pilihan Gambar (上去 -> naik ke sana)
    Exercise(
        id = "u21_s3_p2_q1",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "上去",
        targetPinyin = "shàngqù",
        targetTranslation = "naik ke sana",
        correctAnswer = "naik ke sana",
        audioToSpeak = "上去",
        pictureOptions = listOf(
            PictureOption("u21_s3_p2_opt1", "naik ke sana", "", R.drawable.ic_pos_up, true),
            PictureOption("u21_s3_p2_opt2", "turun ke bawah", "", R.drawable.ic_pos_down, false),
            PictureOption("u21_s3_p2_opt3", "masuk ke sini", "", R.drawable.ic_pos_in, false),
            PictureOption("u21_s3_p2_opt4", "keluar ke sana", "", R.drawable.ic_pos_out, false)
        )
    ),

    // 2. Soal 2: Susun Kalimat (Mereka sudah mendaki naik ke atas.)
    Exercise(
        id = "u21_s3_p2_q2",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Mereka sudah naik ke atas sana.",
        targetHanzi = "他们 已经 爬 上去 了。",
        targetPinyin = "Tāmen yǐjīng pá shàngqù le.",
        wordChips = listOf("他们:tāmen", "已经:yǐjīng", "爬:pá", "上去:shàngqù", "了。:le.", "下来:xiàlái"),
        correctAnswer = "他们,已经,爬,上去,了。",
        audioToSpeak = "他们已经爬上去了。"
    ),

    // 3. Soal 3: Ketuk Pasangan yang Sesuai (Naik Menjauh)
    Exercise(
        id = "u21_s3_p2_m3",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u21_s3_p2_m1", "上去", "shàngqù", "naik ke sana"),
            MatchPairItem("u21_s3_p2_m2", "爬上去", "pá shàngqù", "mendaki naik"),
            MatchPairItem("u21_s3_p2_m3", "走上去", "zǒu shàngqù", "berjalan naik"),
            MatchPairItem("u21_s3_p2_m4", "楼顶", "lóudǐng", "atap gedung")
        )
    ),

    // 4. Soal 4: Ketik Pinyin (naik ke sana -> shàngqù)
    Exercise(
        id = "u21_s3_p2_q4",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "naik ke sana",
        sentenceWithBlank = "上去 (________)",
        targetHanzi = "上去",
        targetPinyin = "shàngqù",
        correctAnswer = "shangqu",
        keyboardKeys = listOf("s", "h", "a", "n", "g", "q", "u", "e", "i", "o", "b", "d"),
        audioToSpeak = "上去"
    ),

    // 5. Soal 5: Mendengar Kalimat (Rule 10: illustrationRes = 0)
    Exercise(
        id = "u21_s3_p2_q5",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Apa yang Anda dengar?",
        targetTranslation = "Buku-buku ini tolong bawakan naik ke atas.",
        targetHanzi = "这些 书 请 拿 上去。",
        targetPinyin = "Zhèxiē shū qǐng ná shàngqù.",
        wordChips = listOf("这些:zhèxiē", "书:shū", "请:qǐng", "拿:ná", "上去。:shàngqù.", "下来:xiàlái"),
        correctAnswer = "这些,书,请,拿,上去。",
        illustrationRes = 0,
        audioToSpeak = "这些书请拿上去。"
    ),

    // 6. Soal 6: Pilihan Kalimat
    Exercise(
        id = "u21_s3_p2_q6",
        type = ExerciseType.SENTENCE_CHOICE,
        title = "Pilih terjemahan yang benar",
        targetHanzi = "电梯 坏 了， 我们 走 上去 吧。",
        targetPinyin = "Diàntī huài le, wǒmen zǒu shàngqù ba.",
        targetTranslation = "Lift rusak, ayo kita berjalan naik ke atas.",
        correctAnswer = "Diàntī huài le, wǒmen zǒu shàngqù ba.\n电梯 坏 了， 我们 走 上去 吧。",
        options = listOf(
            "Diàntī huài le, wǒmen zǒu shàngqù ba.\n电梯 坏 了， 我们 走 上去 吧。",
            "Diàntī huài le, wǒmen zǒu xiàqù ba.\n电梯 坏 了， 我们 走 下去 吧。",
            "Diàntī hǎo le, wǒmen zuò diàntī ba.\n电梯 好 了， 我们 坐 电梯 吧。"
        ),
        audioToSpeak = "电梯坏了，我们走上去吧。"
    ),

    // 7. Soal 7: Pilihan Gambar (走上去 -> berjalan naik)
    Exercise(
        id = "u21_s3_p2_q7",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "走上去",
        targetPinyin = "zǒu shàngqù",
        targetTranslation = "berjalan naik ke sana",
        correctAnswer = "berjalan naik ke sana",
        audioToSpeak = "走上去",
        pictureOptions = listOf(
            PictureOption("u21_s3_p2_opt7_1", "naik ke sana", "", R.drawable.ic_pos_up, true),
            PictureOption("u21_s3_p2_opt7_2", "turun ke bawah", "", R.drawable.ic_pos_down, false),
            PictureOption("u21_s3_p2_opt7_3", "keluar ke sana", "", R.drawable.ic_pos_out, false),
            PictureOption("u21_s3_p2_opt7_4", "masuk ke sini", "", R.drawable.ic_pos_in, false)
        )
    ),

    // 8. Soal 8: Ketik Pinyin (naik ke sana -> shàngqù)
    Exercise(
        id = "u21_s3_p2_q8",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "naik ke sana",
        sentenceWithBlank = "上去 (________)",
        targetHanzi = "上去",
        targetPinyin = "shàngqù",
        correctAnswer = "shangqu",
        keyboardKeys = listOf("s", "h", "a", "n", "g", "q", "u", "e", "i", "o", "b", "d"),
        audioToSpeak = "上去"
    ),

    // 9. Soal 9: Susun Kalimat (Dia berlari naik ke lantai atas.)
    Exercise(
        id = "u21_s3_p2_q9",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Dia lari naik ke lantai atas.",
        targetHanzi = "他 跑 上去 了。",
        targetPinyin = "Tā pǎo shàngqù le.",
        wordChips = listOf("他:tā", "跑:pǎo", "上去:shàngqù", "了。:le.", "下来:xiàlái"),
        correctAnswer = "他,跑,上去,了。",
        audioToSpeak = "他跑上去了。"
    ),

    // 10. Soal 10: Ketuk Pasangan yang Sesuai (Rangkuman Naik Menjauh)
    Exercise(
        id = "u21_s3_p2_m10",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u21_s3_p2_m10_1", "上去", "shàngqù", "naik ke sana"),
            MatchPairItem("u21_s3_p2_m10_2", "跑上去", "pǎo shàngqù", "lari naik"),
            MatchPairItem("u21_s3_p2_m10_3", "拿上去", "ná shàngqù", "bawa naik"),
            MatchPairItem("u21_s3_p2_m10_4", "上楼梯", "shàng lóutī", "naik tangga")
        )
    )
)
