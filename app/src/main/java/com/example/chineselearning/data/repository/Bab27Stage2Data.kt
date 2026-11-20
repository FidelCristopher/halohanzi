package com.example.chineselearning.data.repository

import com.example.chineselearning.R
import com.example.chineselearning.data.model.Exercise
import com.example.chineselearning.data.model.ExerciseType
import com.example.chineselearning.data.model.MatchPairItem
import com.example.chineselearning.data.model.PictureOption

val bab27Stage2Part1Exercises = listOf(
    // 1. Soal 1: Pilihan Gambar (花 -> bunga)
    Exercise(
        id = "u27_s2_p1_q1",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "花",
        targetPinyin = "huā",
        targetTranslation = "bunga",
        correctAnswer = "bunga",
        audioToSpeak = "花",
        pictureOptions = listOf(
            PictureOption("u27_s2_p1_opt1", "bunga", "", R.drawable.ic_nature_flower_bloom, true),
            PictureOption("u27_s2_p1_opt2", "burung", "", R.drawable.ic_nature_bird_singing, false),
            PictureOption("u27_s2_p1_opt3", "lukisan", "", R.drawable.ic_hobby_painting, false),
            PictureOption("u27_s2_p1_opt4", "kamera", "", R.drawable.ic_digi_camera_photo, false)
        )
    ),

    // 2. Soal 2: Susun Kalimat (Di dalam taman mekar penuh aneka bunga warna-warni.)
    Exercise(
        id = "u27_s2_p1_q2",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Di taman penuh dengan bunga.",
        targetHanzi = "花园 里 开 满 了 花。",
        targetPinyin = "Huāyuán lǐ kāi mǎn le huā.",
        wordChips = listOf("花园:huāyuán", "里:lǐ", "开:kāi", "满:mǎn", "了:le", "花。:huā.", "草:cǎo"),
        correctAnswer = "花园,里,开,满,了,花。",
        audioToSpeak = "花园里开满了花。"
    ),

    // 3. Soal 3: Ketuk Pasangan yang Sesuai (Bunga & Burung)
    Exercise(
        id = "u27_s2_p1_q3",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u27_s2_p1_m1", "花", "huā", "bunga"),
            MatchPairItem("u27_s2_p1_m2", "鸟", "niǎo", "burung"),
            MatchPairItem("u27_s2_p1_m3", "小鸟唱歌", "xiǎoniǎo chànggē", "burung berkicau"),
            MatchPairItem("u27_s2_p1_m4", "花开了", "huā kāi le", "bunga mekar")
        )
    ),

    // 4. Soal 4: Ketik Pinyin (bunga -> huā)
    Exercise(
        id = "u27_s2_p1_q4",
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

    // 5. Soal 5: Mendengar Kalimat (Rule 10: illustrationRes = 0)
    Exercise(
        id = "u27_s2_p1_q5",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Apa yang Anda dengar?",
        targetTranslation = "Di atas pohon ada banyak burung kecil sedang bernyanyi dengan riang.",
        targetHanzi = "树上 有 小鸟 在 唱歌。",
        targetPinyin = "Shùshang yǒu xiǎoniǎo zài chànggē.",
        wordChips = listOf("树上:shùshang", "有:yǒu", "小鸟:xiǎoniǎo", "在:zài", "唱歌。:chànggē.", "跳舞:tiàowǔ"),
        correctAnswer = "树上,有,小鸟,在,唱歌。",
        illustrationRes = 0,
        audioToSpeak = "树上有小鸟在唱歌。"
    ),

    // 6. Soal 6: Pilihan Kalimat
    Exercise(
        id = "u27_s2_p1_q6",
        type = ExerciseType.SENTENCE_CHOICE,
        title = "Pilih terjemahan yang benar",
        targetHanzi = "春天 到 了， 花儿 都 开 了。",
        targetPinyin = "Chūntiān dào le, huār dōu kāi le.",
        targetTranslation = "Musim semi tiba, bunga-bunga semua telah bermekaran.",
        correctAnswer = "Chūntiān dào le, huār dōu kāi le.\n春天 到 了， 花儿 都 开 了。",
        options = listOf(
            "Chūntiān dào le, huār dōu kāi le.\n春天 到 了， 花儿 都 开 了。",
            "Dōngtiān dào le, huār dōu xiè le.\n冬天 到 了， 花儿 都 谢 了。",
            "Chūntiān dào le, tiānqì hěn lěng.\n春天 到 了， 天气 很 冷。"
        ),
        audioToSpeak = "春天到了，花儿都开了。"
    ),

    // 7. Soal 7: Pilihan Gambar (鸟 -> burung bernyanyi)
    Exercise(
        id = "u27_s2_p1_q7",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "鸟",
        targetPinyin = "niǎo",
        targetTranslation = "burung",
        correctAnswer = "burung",
        audioToSpeak = "鸟",
        pictureOptions = listOf(
            PictureOption("u27_s2_p1_opt7_1", "burung", "", R.drawable.ic_nature_bird_singing, true),
            PictureOption("u27_s2_p1_opt7_2", "bunga", "", R.drawable.ic_nature_flower_bloom, false),
            PictureOption("u27_s2_p1_opt7_3", "melukis", "", R.drawable.ic_hobby_painting, false),
            PictureOption("u27_s2_p1_opt7_4", "kamera", "", R.drawable.ic_digi_camera_photo, false)
        )
    ),

    // 8. Soal 8: Ketik Pinyin (burung -> niǎo)
    Exercise(
        id = "u27_s2_p1_q8",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "burung",
        sentenceWithBlank = "鸟 (________)",
        targetHanzi = "鸟",
        targetPinyin = "niǎo",
        correctAnswer = "niao",
        keyboardKeys = listOf("n", "i", "a", "o", "e", "u", "b", "d", "g", "h", "j", "l"),
        audioToSpeak = "鸟"
    ),

    // 9. Soal 9: Susun Kalimat (Burung kecil bisa terbang sangat tinggi.)
    Exercise(
        id = "u27_s2_p1_q9",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Burung kecil terbang sangat tinggi.",
        targetHanzi = "小鸟 飞 得 很 高。",
        targetPinyin = "Xiǎoniǎo fēi de hěn gāo.",
        wordChips = listOf("小鸟:xiǎoniǎo", "飞:fēi", "得:de", "很:hěn", "高。:gāo.", "快:kuài"),
        correctAnswer = "小鸟,飞,得,很,高。",
        audioToSpeak = "小鸟飞得很高。"
    ),

    // 10. Soal 10: Ketuk Pasangan yang Sesuai (Rangkuman Alam Semesta)
    Exercise(
        id = "u27_s2_p1_m10",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u27_s2_p1_m10_1", "花", "huā", "bunga"),
            MatchPairItem("u27_s2_p1_m10_2", "鸟", "niǎo", "burung"),
            MatchPairItem("u27_s2_p1_m10_3", "飞得高", "fēi de gāo", "terbang tinggi"),
            MatchPairItem("u27_s2_p1_m10_4", "满园花", "mǎn yuán huā", "kebun bunga")
        )
    )
)

val bab27Stage2Part2Exercises = listOf(
    // 1. Soal 1: Pilihan Gambar (花钱 -> menghabiskan uang)
    Exercise(
        id = "u27_s2_p2_q1",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "花钱",
        targetPinyin = "huāqián",
        targetTranslation = "menghabiskan uang",
        correctAnswer = "menghabiskan uang",
        audioToSpeak = "花钱",
        pictureOptions = listOf(
            PictureOption("u27_s2_p2_opt1", "biaya", "", R.drawable.ic_digi_surf_internet, true),
            PictureOption("u27_s2_p2_opt2", "bunga", "", R.drawable.ic_nature_flower_bloom, false),
            PictureOption("u27_s2_p2_opt3", "burung", "", R.drawable.ic_nature_bird_singing, false),
            PictureOption("u27_s2_p2_opt4", "lukisan", "", R.drawable.ic_hobby_painting, false)
        )
    ),

    // 2. Soal 2: Susun Kalimat (Memperbaiki mobil ini menghabiskan lima ratus yuan uang saya.)
    Exercise(
        id = "u27_s2_p2_q2",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Perbaiki mobil habis 500 yuan.",
        targetHanzi = "修 车 花 了 五百 块 钱。",
        targetPinyin = "Xiū chē huā le wǔbǎi kuài qián.",
        wordChips = listOf("修:xiū", "车:chē", "花:huā", "了:le", "五百:wǔbǎi", "块:kuài", "钱。:qián.", "买:mǎi"),
        correctAnswer = "修,车,花,了,五百,块,钱。",
        audioToSpeak = "修车花了五百块钱。"
    ),

    // 3. Soal 3: Ketuk Pasangan yang Sesuai (Menghabiskan Biaya & Waktu)
    Exercise(
        id = "u27_s2_p2_m3",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u27_s2_p2_m1", "花钱", "huāqián", "menghabiskan uang"),
            MatchPairItem("u27_s2_p2_m2", "花时间", "huā shíjiān", "menghabiskan waktu"),
            MatchPairItem("u27_s2_p2_m3", "花了很多", "huā le hěn duō", "menghabiskan banyak"),
            MatchPairItem("u27_s2_p2_m4", "太贵了", "tài guì le", "terlalu mahal")
        )
    ),

    // 4. Soal 4: Ketik Pinyin (menghabiskan waktu -> huāshíjiān)
    Exercise(
        id = "u27_s2_p2_q4",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "menghabiskan waktu",
        sentenceWithBlank = "花时间 (________)",
        targetHanzi = "花时间",
        targetPinyin = "huāshíjiān",
        correctAnswer = "huashijian",
        keyboardKeys = listOf("h", "u", "a", "s", "i", "j", "n", "e", "o", "b", "d", "g"),
        audioToSpeak = "花时间"
    ),

    // 5. Soal 5: Mendengar Kalimat (Rule 10: illustrationRes = 0)
    Exercise(
        id = "u27_s2_p2_q5",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Apa yang Anda dengar?",
        targetTranslation = "Belajar bahasa Mandarin perlu menghabiskan banyak waktu.",
        targetHanzi = "学 汉语 要 花 很多 时间。",
        targetPinyin = "Xué Hànyǔ yào huā hěn duō shíjiān.",
        wordChips = listOf("学:xué", "汉语:Hànyǔ", "要:yào", "花:huā", "很多:hěn duō", "时间。:shíjiān.", "钱:qián"),
        correctAnswer = "学,汉语,要,花,很多,时间。",
        illustrationRes = 0,
        audioToSpeak = "学汉语要花很多时间。"
    ),

    // 6. Soal 6: Pilihan Kalimat
    Exercise(
        id = "u27_s2_p2_q6",
        type = ExerciseType.SENTENCE_CHOICE,
        title = "Pilih terjemahan yang benar",
        targetHanzi = "买 这 件 衣服 花 了 多少 钱？",
        targetPinyin = "Mǎi zhè jiàn yīfu huā le duōshao qián?",
        targetTranslation = "Membeli pakaian ini menghabiskan berapa banyak uang?",
        correctAnswer = "Mǎi zhè jiàn yīfu huā le duōshao qián?\n买 这 件 衣服 花 了 多少 钱？",
        options = listOf(
            "Mǎi zhè jiàn yīfu huā le duōshao qián?\n买 这 件 衣服 花 了 多少 钱？",
            "Mǎi zhè tiáo kùzi huā le duōshao qián?\n买 这 条 裤子 花 了 多少 钱？",
            "Mǎi zhè kuài shǒubiǎo huā le duōshao qián?\n买 这 块 手表 花 了 多少 钱？"
        ),
        audioToSpeak = "买这件衣服花了多少钱？"
    ),

    // 7. Soal 7: Pilihan Gambar (花 -> menghabiskan biaya)
    Exercise(
        id = "u27_s2_p2_q7",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "花",
        targetPinyin = "huā",
        targetTranslation = "menghabiskan biaya",
        correctAnswer = "menghabiskan biaya",
        audioToSpeak = "花",
        pictureOptions = listOf(
            PictureOption("u27_s2_p2_opt7_1", "menghabiskan", "", R.drawable.ic_digi_surf_internet, true),
            PictureOption("u27_s2_p2_opt7_2", "bunga", "", R.drawable.ic_nature_flower_bloom, false),
            PictureOption("u27_s2_p2_opt7_3", "burung", "", R.drawable.ic_nature_bird_singing, false),
            PictureOption("u27_s2_p2_opt7_4", "lukisan", "", R.drawable.ic_hobby_painting, false)
        )
    ),

    // 8. Soal 8: Ketik Pinyin (menghabiskan uang -> huāqián)
    Exercise(
        id = "u27_s2_p2_q8",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "menghabiskan uang",
        sentenceWithBlank = "花钱 (________)",
        targetHanzi = "花钱",
        targetPinyin = "huāqián",
        correctAnswer = "huaqian",
        keyboardKeys = listOf("h", "u", "o", "q", "i", "a", "n", "e", "b", "d", "g", "j"),
        audioToSpeak = "花钱"
    ),

    // 9. Soal 9: Susun Kalimat (Saya menghabiskan dua jam membaca buku.)
    Exercise(
        id = "u27_s2_p2_q9",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Saya habis dua jam membaca buku.",
        targetHanzi = "我 花 了 两个 小时 看书。",
        targetPinyin = "Wǒ huā le liǎng gè xiǎoshí kànshū.",
        wordChips = listOf("我:wǒ", "花:huā", "了:le", "两个:liǎng gè", "小时:xiǎoshí", "看书。:kànshū.", "睡觉:shuìjiào"),
        correctAnswer = "我,花,了,两个,小时,看书。",
        audioToSpeak = "我花了两个小时看书。"
    ),

    // 10. Soal 10: Ketuk Pasangan yang Sesuai (Rangkuman Waktu & Pengeluaran)
    Exercise(
        id = "u27_s2_p2_m10",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u27_s2_p2_m10_1", "花时间", "huā shíjiān", "pakai waktu"),
            MatchPairItem("u27_s2_p2_m10_2", "花钱", "huāqián", "keluar uang"),
            MatchPairItem("u27_s2_p2_m10_3", "两个小时", "liǎng gè xiǎoshí", "dua jam"),
            MatchPairItem("u27_s2_p2_m10_4", "很值得", "hěn zhíde", "sangat berharga")
        )
    )
)
