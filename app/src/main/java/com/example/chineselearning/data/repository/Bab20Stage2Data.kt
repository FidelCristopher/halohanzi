package com.example.chineselearning.data.repository

import com.example.chineselearning.R
import com.example.chineselearning.data.model.Exercise
import com.example.chineselearning.data.model.ExerciseType
import com.example.chineselearning.data.model.MatchPairItem
import com.example.chineselearning.data.model.PictureOption

val bab20Stage2Part1Exercises = listOf(
    // 1. Soal 1: Pilihan Gambar (前面 -> bagian depan / di depan)
    Exercise(
        id = "u20_s2_p1_q1",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "前面",
        targetPinyin = "qiánmiàn",
        targetTranslation = "bagian depan / di depan",
        correctAnswer = "bagian depan / di depan",
        audioToSpeak = "前面",
        pictureOptions = listOf(
            PictureOption("u20_s2_p1_opt1", "di depan", "", R.drawable.ic_pos_front, true),
            PictureOption("u20_s2_p1_opt2", "di belakang", "", R.drawable.ic_pos_back, false),
            PictureOption("u20_s2_p1_opt3", "di kiri", "", R.drawable.ic_pos_left, false),
            PictureOption("u20_s2_p1_opt4", "di kanan", "", R.drawable.ic_pos_right, false)
        )
    ),

    // 2. Soal 2: Susun Kalimat (Halte bus berada di depan perusahaan.)
    Exercise(
        id = "u20_s2_p1_q2",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Halte di depan perusahaan.",
        targetHanzi = "车站 在 公司 前面。",
        targetPinyin = "Chēzhàn zài gōngsī qiánmiàn.",
        wordChips = listOf("车站:chēzhàn", "在:zài", "公司:gōngsī", "前面。:qiánmiàn.", "后面:hòumiàn"),
        correctAnswer = "车站,在,公司,前面。",
        audioToSpeak = "车站在公司前面。"
    ),

    // 3. Soal 3: Ketuk Pasangan yang Sesuai (Depan & Belakang)
    Exercise(
        id = "u20_s2_p1_q3",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u20_s2_p1_m1", "前面", "qiánmiàn", "di depan"),
            MatchPairItem("u20_s2_p1_m2", "后面", "hòumiàn", "di belakang"),
            MatchPairItem("u20_s2_p1_m3", "车站", "chēzhàn", "halte / stasiun"),
            MatchPairItem("u20_s2_p1_m4", "公司", "gōngsī", "perusahaan")
        )
    ),

    // 4. Soal 4: Ketik Pinyin (di depan -> qiánmiàn)
    Exercise(
        id = "u20_s2_p1_q4",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "bagian depan / di depan",
        sentenceWithBlank = "前面 (________)",
        targetHanzi = "前面",
        targetPinyin = "qiánmiàn",
        correctAnswer = "qianmian",
        keyboardKeys = listOf("q", "i", "a", "n", "m", "e", "o", "u", "b", "d", "g", "h"),
        audioToSpeak = "前面"
    ),

    // 5. Soal 5: Mendengar Kalimat (Rule 10: illustrationRes = 0)
    Exercise(
        id = "u20_s2_p1_q5",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Apa yang Anda dengar?",
        targetTranslation = "Di belakang rumah ada sebuah taman kecil.",
        targetHanzi = "房子 后面 有 一个 花园。",
        targetPinyin = "Fángzi hòumiàn yǒu yí gè huāyuán.",
        wordChips = listOf("房子:fángzi", "后面:hòumiàn", "有:yǒu", "一个:yí gè", "花园。:huāyuán.", "前面:qiánmiàn"),
        correctAnswer = "房子,后面,有,一个,花园。",
        illustrationRes = 0,
        audioToSpeak = "房子后面有一个花园。"
    ),

    // 6. Soal 6: Pilihan Kalimat
    Exercise(
        id = "u20_s2_p1_q6",
        type = ExerciseType.SENTENCE_CHOICE,
        title = "Pilih terjemahan yang benar",
        targetHanzi = "他 走 在 我 的 前面。",
        targetPinyin = "Tā zǒu zài wǒ de qiánmiàn.",
        targetTranslation = "Dia berjalan di depan saya.",
        correctAnswer = "Tā zǒu zài wǒ de qiánmiàn.\n他 走 在 我 的 前面。",
        options = listOf(
            "Tā zǒu zài wǒ de qiánmiàn.\n他 走 在 我 的 前面。",
            "Tā zǒu zài wǒ de hòumiàn.\n他 走 在 我 的 后面。",
            "Wǒ zǒu zài tā de qiánmiàn.\n我 走 在 他 的 前面。"
        ),
        audioToSpeak = "他走在我的前面。"
    ),

    // 7. Soal 7: Pilihan Gambar (后面 -> di belakang)
    Exercise(
        id = "u20_s2_p1_q7",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "后面",
        targetPinyin = "hòumiàn",
        targetTranslation = "bagian belakang / di belakang",
        correctAnswer = "bagian belakang / di belakang",
        audioToSpeak = "后面",
        pictureOptions = listOf(
            PictureOption("u20_s2_p1_opt7_1", "di belakang", "", R.drawable.ic_pos_back, true),
            PictureOption("u20_s2_p1_opt7_2", "di depan", "", R.drawable.ic_pos_front, false),
            PictureOption("u20_s2_p1_opt7_3", "di kanan", "", R.drawable.ic_pos_right, false),
            PictureOption("u20_s2_p1_opt7_4", "di kiri", "", R.drawable.ic_pos_left, false)
        )
    ),

    // 8. Soal 8: Ketik Pinyin (di belakang -> hòumiàn)
    Exercise(
        id = "u20_s2_p1_q8",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "bagian belakang / di belakang",
        sentenceWithBlank = "后面 (________)",
        targetHanzi = "后面",
        targetPinyin = "hòumiàn",
        correctAnswer = "houmian",
        keyboardKeys = listOf("h", "o", "u", "m", "i", "a", "n", "e", "b", "d", "g", "j"),
        audioToSpeak = "后面"
    ),

    // 9. Soal 9: Susun Kalimat (Di belakang sekolah ada lapangan bola.)
    Exercise(
        id = "u20_s2_p1_q9",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Di belakang sekolah ada lapangan.",
        targetHanzi = "学校 后面 有 操场。",
        targetPinyin = "Xuéxiào hòumiàn yǒu cāochǎng.",
        wordChips = listOf("学校:xuéxiào", "后面:hòumiàn", "有:yǒu", "操场。:cāochǎng.", "前面:qiánmiàn"),
        correctAnswer = "学校,后面,有,操场。",
        audioToSpeak = "学校后面有操场。"
    ),

    // 10. Soal 10: Ketuk Pasangan yang Sesuai (Rangkuman Depan Belakang)
    Exercise(
        id = "u20_s2_p1_m10",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u20_s2_p1_m10_1", "前面", "qiánmiàn", "di depan"),
            MatchPairItem("u20_s2_p1_m10_2", "后面", "hòumiàn", "di belakang"),
            MatchPairItem("u20_s2_p1_m10_3", "学校前", "xuéxiào qián", "depan sekolah"),
            MatchPairItem("u20_s2_p1_m10_4", "房子后", "fángzi hòu", "belakang rumah")
        )
    )
)

val bab20Stage2Part2Exercises = listOf(
    // 1. Soal 1: Pilihan Gambar (旁边 -> di samping / sebelah)
    Exercise(
        id = "u20_s2_p2_q1",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "旁边",
        targetPinyin = "pángbiān",
        targetTranslation = "samping / sebelah",
        correctAnswer = "samping / sebelah",
        audioToSpeak = "旁边",
        pictureOptions = listOf(
            PictureOption("u20_s2_p2_opt1", "di samping", "", R.drawable.ic_pos_left, true),
            PictureOption("u20_s2_p2_opt2", "di atas", "", R.drawable.ic_pos_up, false),
            PictureOption("u20_s2_p2_opt3", "di bawah", "", R.drawable.ic_pos_down, false),
            PictureOption("u20_s2_p2_opt4", "di dalam", "", R.drawable.ic_pos_in, false)
        )
    ),

    // 2. Soal 2: Susun Kalimat (Saya duduk tepat di sebelahmu.)
    Exercise(
        id = "u20_s2_p2_q2",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Saya duduk di sampingmu.",
        targetHanzi = "我 就 坐 在 你 的 旁边。",
        targetPinyin = "Wǒ jiù zuò zài nǐ de pángbiān.",
        wordChips = listOf("我:wǒ", "就:jiù", "坐:zuò", "在:zài", "你:nǐ", "的:de", "旁边。:pángbiān.", "后面:hòumiàn"),
        correctAnswer = "我,就,坐,在,你,的,旁边。",
        audioToSpeak = "我就坐在你的旁边。"
    ),

    // 3. Soal 3: Ketuk Pasangan yang Sesuai (Samping & Sisi Mata Angin)
    Exercise(
        id = "u20_s2_p2_m3",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u20_s2_p2_m1", "旁边", "pángbiān", "samping / sebelah"),
            MatchPairItem("u20_s2_p2_m2", "面", "miàn", "sisi / arah"),
            MatchPairItem("u20_s2_p2_m3", "坐在旁边", "zuò zài pángbiān", "duduk di samping"),
            MatchPairItem("u20_s2_p2_m4", "东面", "dōngmiàn", "sisi timur")
        )
    ),

    // 4. Soal 4: Ketik Pinyin (samping -> pángbiān)
    Exercise(
        id = "u20_s2_p2_q4",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "samping / sebelah",
        sentenceWithBlank = "旁边 (________)",
        targetHanzi = "旁边",
        targetPinyin = "pángbiān",
        correctAnswer = "pangbian",
        keyboardKeys = listOf("p", "a", "n", "g", "b", "i", "e", "o", "u", "d", "h", "j"),
        audioToSpeak = "旁边"
    ),

    // 5. Soal 5: Mendengar Kalimat (Rule 10: illustrationRes = 0)
    Exercise(
        id = "u20_s2_p2_q5",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Apa yang Anda dengar?",
        targetTranslation = "Di sisi timur ada sebuah gunung besar.",
        targetHanzi = "东面 有 一 座 大 山。",
        targetPinyin = "Dōngmiàn yǒu yí zuò dà shān.",
        wordChips = listOf("东面:dōngmiàn", "有:yǒu", "一:yí", "座:zuò", "大:dà", "山。:shān.", "西面:xīmiàn"),
        correctAnswer = "东面,有,一,座,大,山。",
        illustrationRes = 0,
        audioToSpeak = "东面有一座大山。"
    ),

    // 6. Soal 6: Pilihan Kalimat
    Exercise(
        id = "u20_s2_p2_q6",
        type = ExerciseType.SENTENCE_CHOICE,
        title = "Pilih terjemahan yang benar",
        targetHanzi = "商场 旁边 有 一 家 饭馆。",
        targetPinyin = "Shāngchǎng pángbiān yǒu yì jiā fànguǎn.",
        targetTranslation = "Di samping mall ada sebuah restoran.",
        correctAnswer = "Shāngchǎng pángbiān yǒu yì jiā fànguǎn.\n商场 旁边 有 一 家 饭馆。",
        options = listOf(
            "Shāngchǎng pángbiān yǒu yì jiā fànguǎn.\n商场 旁边 有 一 家 饭馆。",
            "Shāngchǎng lǐmiàn yǒu yì jiā fànguǎn.\n商场 里面 有 一 家 饭馆。",
            "Fànguǎn pángbiān yǒu yí gè shāngchǎng.\n饭馆 旁边 有 一 个 商场。"
        ),
        audioToSpeak = "商场旁边有一家饭馆。"
    ),

    // 7. Soal 7: Pilihan Gambar (面 -> sisi / arah)
    Exercise(
        id = "u20_s2_p2_q7",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "面",
        targetPinyin = "miàn",
        targetTranslation = "sisi / arah",
        correctAnswer = "sisi / arah",
        audioToSpeak = "面",
        pictureOptions = listOf(
            PictureOption("u20_s2_p2_opt7_1", "sisi / arah", "", R.drawable.ic_pos_right, true),
            PictureOption("u20_s2_p2_opt7_2", "di dalam", "", R.drawable.ic_pos_in, false),
            PictureOption("u20_s2_p2_opt7_3", "di atas", "", R.drawable.ic_pos_up, false),
            PictureOption("u20_s2_p2_opt7_4", "di bawah", "", R.drawable.ic_pos_down, false)
        )
    ),

    // 8. Soal 8: Ketik Pinyin (sisi/arah -> miàn)
    Exercise(
        id = "u20_s2_p2_q8",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "sisi / arah",
        sentenceWithBlank = "面 (________)",
        targetHanzi = "面",
        targetPinyin = "miàn",
        correctAnswer = "mian",
        keyboardKeys = listOf("m", "i", "a", "n", "e", "o", "u", "b", "d", "g", "h", "j"),
        audioToSpeak = "面"
    ),

    // 9. Soal 9: Susun Kalimat (Siapa yang duduk di sebelah Anda?)
    Exercise(
        id = "u20_s2_p2_q9",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Siapa yang duduk di sampingmu?",
        targetHanzi = "谁 坐 在 你 旁边？",
        targetPinyin = "Shéi zuò zài nǐ pángbiān?",
        wordChips = listOf("谁:shéi", "坐:zuò", "在:zài", "你:nǐ", "旁边？:pángbiān.", "前面:qiánmiàn"),
        correctAnswer = "谁,坐,在,你,旁边？",
        audioToSpeak = "谁坐在你旁边？"
    ),

    // 10. Soal 10: Ketuk Pasangan yang Sesuai (Rangkuman Sisi & Posisi)
    Exercise(
        id = "u20_s2_p2_m10",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u20_s2_p2_m10_1", "旁边", "pángbiān", "samping"),
            MatchPairItem("u20_s2_p2_m2", "前面", "qiánmiàn", "depan"),
            MatchPairItem("u20_s2_p2_m3", "南面", "nánmiàn", "arah selatan"),
            MatchPairItem("u20_s2_p2_m4", "商场旁", "shāngchǎng páng", "sebelah mall")
        )
    )
)
