package com.example.chineselearning.data.repository

import com.example.chineselearning.R
import com.example.chineselearning.data.model.Exercise
import com.example.chineselearning.data.model.ExerciseType
import com.example.chineselearning.data.model.MatchPairItem
import com.example.chineselearning.data.model.PictureOption

val bab21Stage1Part1Exercises = listOf(
    // 1. Soal 1: Pilihan Gambar (进来 -> masuk ke sini)
    Exercise(
        id = "u21_s1_p1_q1",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "进来",
        targetPinyin = "jìnlái",
        targetTranslation = "masuk ke sini",
        correctAnswer = "masuk ke sini",
        audioToSpeak = "进来",
        pictureOptions = listOf(
            PictureOption("u21_s1_p1_opt1", "masuk ke sini", "", R.drawable.ic_dir_enter, true),
            PictureOption("u21_s1_p1_opt2", "keluar ke sana", "", R.drawable.ic_dir_exit, false),
            PictureOption("u21_s1_p1_opt3", "naik ke atas", "", R.drawable.ic_pos_up, false),
            PictureOption("u21_s1_p1_opt4", "turun ke bawah", "", R.drawable.ic_pos_down, false)
        )
    ),

    // 2. Soal 2: Susun Kalimat (Pintu terbuka, cepatlah kamu masuk ke sini.)
    Exercise(
        id = "u21_s1_p1_q2",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Pintu buka, cepatlah kamu masuk.",
        targetHanzi = "门 开 着， 你 快 进来 吧。",
        targetPinyin = "Mén kāi zhe, nǐ kuài jìnlái ba.",
        wordChips = listOf("门:mén", "开:kāi", "着，:zhe,", "你:nǐ", "快:kuài", "进来:jìnlái", "吧。:ba.", "出去:chūqù"),
        correctAnswer = "门,开,着，,你,快,进来,吧。",
        audioToSpeak = "门开着，你快进来吧。"
    ),

    // 3. Soal 3: Ketuk Pasangan yang Sesuai (Masuk & Masuk Ke Sini)
    Exercise(
        id = "u21_s1_p1_q3",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u21_s1_p1_m1", "进", "jìn", "masuk"),
            MatchPairItem("u21_s1_p1_m2", "进来", "jìnlái", "masuk ke sini"),
            MatchPairItem("u21_s1_p1_m3", "请进", "qǐng jìn", "silakan masuk"),
            MatchPairItem("u21_s1_p1_m4", "快来", "kuài lái", "cepat datang")
        )
    ),

    // 4. Soal 4: Ketik Pinyin (masuk ke sini -> jìnlái)
    Exercise(
        id = "u21_s1_p1_q4",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "masuk ke sini",
        sentenceWithBlank = "进来 (________)",
        targetHanzi = "进来",
        targetPinyin = "jìnlái",
        correctAnswer = "jinlai",
        keyboardKeys = listOf("j", "i", "n", "l", "a", "e", "o", "u", "b", "d", "g", "h"),
        audioToSpeak = "进来"
    ),

    // 5. Soal 5: Mendengar Kalimat (Rule 10: illustrationRes = 0)
    Exercise(
        id = "u21_s1_p1_q5",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Apa yang Anda dengar?",
        targetTranslation = "Di luar sangat dingin, silakan masuk ke dalam kamar.",
        targetHanzi = "外面 冷， 请 进 房间 吧。",
        targetPinyin = "Wàimiàn lěng, qǐng jìn fángjiān ba.",
        wordChips = listOf("外面:wàimiàn", "冷，:lěng,", "请:qǐng", "进:jìn", "房间:fángjiān", "吧。:ba.", "出:chū"),
        correctAnswer = "外面,冷，,请,进,房间,吧。",
        illustrationRes = 0,
        audioToSpeak = "外面冷，请进房间吧。"
    ),

    // 6. Soal 6: Pilihan Kalimat
    Exercise(
        id = "u21_s1_p1_q6",
        type = ExerciseType.SENTENCE_CHOICE,
        title = "Pilih terjemahan yang benar",
        targetHanzi = "老师 进 教室 来 了。",
        targetPinyin = "Lǎoshī jìn jiàoshì lái le.",
        targetTranslation = "Guru telah masuk ke dalam ruang kelas.",
        correctAnswer = "Lǎoshī jìn jiàoshì lái le.\n老师 进 教室 来 了。",
        options = listOf(
            "Lǎoshī jìn jiàoshì lái le.\n老师 进 教室 来 了。",
            "Lǎoshī chū jiàoshì qù le.\n老师 出 教室 去 了。",
            "Xuéshēng jìn jiàoshì lái le.\n学生 进 教室 来 了。"
        ),
        audioToSpeak = "老师进教室来了。"
    ),

    // 7. Soal 7: Pilihan Gambar (进 -> masuk)
    Exercise(
        id = "u21_s1_p1_q7",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "进",
        targetPinyin = "jìn",
        targetTranslation = "masuk",
        correctAnswer = "masuk",
        audioToSpeak = "进",
        pictureOptions = listOf(
            PictureOption("u21_s1_p1_opt7_1", "masuk", "", R.drawable.ic_dir_enter, true),
            PictureOption("u21_s1_p1_opt7_2", "keluar", "", R.drawable.ic_dir_exit, false),
            PictureOption("u21_s1_p1_opt7_3", "naik", "", R.drawable.ic_pos_up, false),
            PictureOption("u21_s1_p1_opt7_4", "turun", "", R.drawable.ic_pos_down, false)
        )
    ),

    // 8. Soal 8: Ketik Pinyin (masuk -> jìn)
    Exercise(
        id = "u21_s1_p1_q8",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "masuk",
        sentenceWithBlank = "进 (________)",
        targetHanzi = "进",
        targetPinyin = "jìn",
        correctAnswer = "jin",
        keyboardKeys = listOf("j", "i", "n", "a", "e", "o", "u", "b", "d", "g", "h", "l"),
        audioToSpeak = "进"
    ),

    // 9. Soal 9: Susun Kalimat (Silakan masuk ke dalam rumah dan duduk.)
    Exercise(
        id = "u21_s1_p1_q9",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Silakan masuk rumah dan duduk.",
        targetHanzi = "请 进 屋 坐。",
        targetPinyin = "Qǐng jìn wū zuò.",
        wordChips = listOf("请:qǐng", "进:jìn", "屋:wū", "坐。:zuò.", "出:chū"),
        correctAnswer = "请,进,屋,坐。",
        audioToSpeak = "请进屋坐。"
    ),

    // 10. Soal 10: Ketuk Pasangan yang Sesuai (Rangkuman Masuk)
    Exercise(
        id = "u21_s1_p1_m10",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u21_s1_p1_m10_1", "进", "jìn", "masuk"),
            MatchPairItem("u21_s1_p1_m10_2", "进来", "jìnlái", "masuk kemari"),
            MatchPairItem("u21_s1_p1_m10_3", "进门", "jìn mén", "masuk pintu"),
            MatchPairItem("u21_s1_p1_m10_4", "坐下", "zuò xià", "duduk")
        )
    )
)

val bab21Stage1Part2Exercises = listOf(
    // 1. Soal 1: Pilihan Gambar (进去 -> masuk ke sana)
    Exercise(
        id = "u21_s1_p2_q1",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "进去",
        targetPinyin = "jìnqù",
        targetTranslation = "masuk ke sana",
        correctAnswer = "masuk ke sana",
        audioToSpeak = "进去",
        pictureOptions = listOf(
            PictureOption("u21_s1_p2_opt1", "masuk ke sana", "", R.drawable.ic_dir_enter, true),
            PictureOption("u21_s1_p2_opt2", "keluar ke sini", "", R.drawable.ic_dir_exit, false),
            PictureOption("u21_s1_p2_opt3", "naik ke atas", "", R.drawable.ic_pos_up, false),
            PictureOption("u21_s1_p2_opt4", "turun ke bawah", "", R.drawable.ic_pos_down, false)
        )
    ),

    // 2. Soal 2: Susun Kalimat (Dia berdiri di depan pintu, belum masuk ke sana.)
    Exercise(
        id = "u21_s1_p2_q2",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Dia di pintu, belum masuk ke sana.",
        targetHanzi = "他 在 门口， 还没 进去。",
        targetPinyin = "Tā zài ménkǒu, hái méi jìnqù.",
        wordChips = listOf("他:tā", "在:zài", "门口，:ménkǒu,", "还没:hái méi", "进去。:jìnqù.", "出来:chūlái"),
        correctAnswer = "他,在,门口，,还没,进去。",
        audioToSpeak = "他在门口，还没进去。"
    ),

    // 3. Soal 3: Ketuk Pasangan yang Sesuai (Masuk Ke Sana)
    Exercise(
        id = "u21_s1_p2_m3",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u21_s1_p2_m1", "进去", "jìnqù", "masuk ke sana"),
            MatchPairItem("u21_s1_p2_m2", "门口", "ménkǒu", "ambang pintu"),
            MatchPairItem("u21_s1_p2_m3", "还没", "hái méi", "belum"),
            MatchPairItem("u21_s1_p2_m4", "走进去", "zǒu jìnqù", "berjalan masuk")
        )
    ),

    // 4. Soal 4: Ketik Pinyin (masuk ke sana -> jìnqù)
    Exercise(
        id = "u21_s1_p2_q4",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "masuk ke sana",
        sentenceWithBlank = "进去 (________)",
        targetHanzi = "进去",
        targetPinyin = "jìnqù",
        correctAnswer = "jinqu",
        keyboardKeys = listOf("j", "i", "n", "q", "u", "a", "e", "o", "b", "d", "g", "h"),
        audioToSpeak = "进去"
    ),

    // 5. Soal 5: Mendengar Kalimat (Rule 10: illustrationRes = 0)
    Exercise(
        id = "u21_s1_p2_q5",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Apa yang Anda dengar?",
        targetTranslation = "Kita bersama-sama berjalan masuk ke sana.",
        targetHanzi = "我们 一起 走 进去 吧。",
        targetPinyin = "Wǒmen yìqǐ zǒu jìnqù ba.",
        wordChips = listOf("我们:wǒmen", "一起:yìqǐ", "走:zǒu", "进去:jìnqù", "吧。:ba.", "出来:chūlái"),
        correctAnswer = "我们,一起,走,进去,吧。",
        illustrationRes = 0,
        audioToSpeak = "我们一起走进去吧。"
    ),

    // 6. Soal 6: Pilihan Kalimat
    Exercise(
        id = "u21_s1_p2_q6",
        type = ExerciseType.SENTENCE_CHOICE,
        title = "Pilih terjemahan yang benar",
        targetHanzi = "里面 太 黑 了， 我 不 敢 进去。",
        targetPinyin = "Lǐmiàn tài hēi le, wǒ bù gǎn jìnqù.",
        targetTranslation = "Di dalam terlalu gelap, saya tidak berani masuk ke sana.",
        correctAnswer = "Lǐmiàn tài hēi le, wǒ bù gǎn jìnqù.\n里面 太 黑 了， 我 不 敢 进去。",
        options = listOf(
            "Lǐmiàn tài hēi le, wǒ bù gǎn jìnqù.\n里面 太 黑 了， 我 不 敢 进去。",
            "Wàimiàn tài hēi le, wǒ bù gǎn jìnqù.\n外面 太 黑 了， 我 不 敢 进去。",
            "Lǐmiàn tài liàng le, wǒ bù gǎn jìnqù.\n里面 太 亮 了， 我 不 敢 进去。"
        ),
        audioToSpeak = "里面太黑了，我不敢进去。"
    ),

    // 7. Soal 7: Pilihan Gambar (进去 -> masuk menjauhi penutur)
    Exercise(
        id = "u21_s1_p2_q7",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "进去",
        targetPinyin = "jìnqù",
        targetTranslation = "masuk ke sana",
        correctAnswer = "masuk ke sana",
        audioToSpeak = "进去",
        pictureOptions = listOf(
            PictureOption("u21_s1_p2_opt7_1", "masuk ke sana", "", R.drawable.ic_dir_enter, true),
            PictureOption("u21_s1_p2_opt7_2", "keluar ke sana", "", R.drawable.ic_dir_exit, false),
            PictureOption("u21_s1_p2_opt7_3", "datang", "", R.drawable.ic_trans_come, false),
            PictureOption("u21_s1_p2_opt7_4", "pulang", "", R.drawable.ic_trans_return_home, false)
        )
    ),

    // 8. Soal 8: Ketik Pinyin (silakan masuk -> qǐngjìn)
    Exercise(
        id = "u21_s1_p2_q8",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "silakan masuk",
        sentenceWithBlank = "请进 (________)",
        targetHanzi = "请进",
        targetPinyin = "qǐngjìn",
        correctAnswer = "qingjin",
        keyboardKeys = listOf("q", "i", "n", "g", "j", "a", "e", "o", "u", "b", "d", "h"),
        audioToSpeak = "请进"
    ),

    // 9. Soal 9: Susun Kalimat (Semua orang sudah masuk ke sana.)
    Exercise(
        id = "u21_s1_p2_q9",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Semua orang sudah masuk ke sana.",
        targetHanzi = "大家 都 已经 进去 了。",
        targetPinyin = "Dàjiā dōu yǐjīng jìnqù le.",
        wordChips = listOf("大家:dàjiā", "都:dōu", "已经:yǐjīng", "进去:jìnqù", "了。:le.", "出来:chūlái"),
        correctAnswer = "大家,都,已经,进去,了。",
        audioToSpeak = "大家都已经进去了。"
    ),

    // 10. Soal 10: Ketuk Pasangan yang Sesuai (Rangkuman Komplemen Masuk)
    Exercise(
        id = "u21_s1_p2_m10",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u21_s1_p2_m10_1", "进去", "jìnqù", "masuk ke sana"),
            MatchPairItem("u21_s1_p2_m10_2", "已经进", "yǐjīng jìn", "sudah masuk"),
            MatchPairItem("u21_s1_p2_m10_3", "走进去", "zǒu jìnqù", "berjalan masuk"),
            MatchPairItem("u21_s1_p2_m10_4", "黑夜", "hēiyè", "malam gelap")
        )
    )
)
