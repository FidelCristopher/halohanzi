package com.example.chineselearning.data.repository

import com.example.chineselearning.R
import com.example.chineselearning.data.model.Exercise
import com.example.chineselearning.data.model.ExerciseType
import com.example.chineselearning.data.model.MatchPairItem
import com.example.chineselearning.data.model.PictureOption

val bab28Stage2Part1Exercises = listOf(
    // 1. Soal 1: Pilihan Gambar (得 -> partikel komplemen hasil)
    Exercise(
        id = "u28_s2_p1_q1",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "得",
        targetPinyin = "de",
        targetTranslation = "partikel komplemen derajat",
        correctAnswer = "partikel komplemen derajat",
        audioToSpeak = "得",
        pictureOptions = listOf(
            PictureOption("u28_s2_p1_opt1", "derajat", "", R.drawable.ic_gram_degree_speedometer, true),
            PictureOption("u28_s2_p1_opt2", "timbangan", "", R.drawable.ic_gram_compare_scale, false),
            PictureOption("u28_s2_p1_opt3", "podium", "", R.drawable.ic_gram_superlative_podium, false),
            PictureOption("u28_s2_p1_opt4", "waktu", "", R.drawable.ic_gram_timeline_future, false)
        )
    ),

    // 2. Soal 2: Susun Kalimat (Xiao Ming menulis karakter Hanzi dengan sangat indah.)
    Exercise(
        id = "u28_s2_p1_q2",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Xiao Ming menulis Hanzi sangat indah.",
        targetHanzi = "小明 汉字 写 得 很 漂亮。",
        targetPinyin = "Xiǎomíng Hànzì xiě de hěn piàoliang.",
        wordChips = listOf("小明:Xiǎomíng", "汉字:Hànzì", "写:xiě", "得:de", "很:hěn", "漂亮。:piàoliang.", "快:kuài"),
        correctAnswer = "小明,汉字,写,得,很,漂亮。",
        audioToSpeak = "小明汉字写得非常漂亮。"
    ),

    // 3. Soal 3: Ketuk Pasangan yang Sesuai (Partikel 得)
    Exercise(
        id = "u28_s2_p1_q3",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u28_s2_p1_m1", "写得好", "xiě de hǎo", "menulis dengan baik"),
            MatchPairItem("u28_s2_p1_m2", "跑得快", "pǎo de kuài", "berlari kencang"),
            MatchPairItem("u28_s2_p1_m3", "起得早", "qǐ de zǎo", "bangun pagi"),
            MatchPairItem("u28_s2_p1_m4", "吃得饱", "chī de bǎo", "makan kenyang")
        )
    ),

    // 4. Soal 4: Ketik Pinyin (partikel komplemen -> de)
    Exercise(
        id = "u28_s2_p1_q4",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "partikel derajat",
        sentenceWithBlank = "得 (________)",
        targetHanzi = "得",
        targetPinyin = "de",
        correctAnswer = "de",
        keyboardKeys = listOf("d", "e", "a", "i", "o", "u", "b", "g", "h", "j", "l", "m"),
        audioToSpeak = "得"
    ),

    // 5. Soal 5: Mendengar Kalimat (Rule 10: illustrationRes = 0)
    Exercise(
        id = "u28_s2_p1_q5",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Apa yang Anda dengar?",
        targetTranslation = "Adik perempuan bernyanyi dengan sangat merdu.",
        targetHanzi = "妹妹 唱歌 唱 得 很 好听。",
        targetPinyin = "Mèimei chànggē chàng de hěn hǎotīng.",
        wordChips = listOf("妹妹:mèimei", "唱歌:chànggē", "唱:chàng", "得:de", "很:hěn", "好听。:hǎotīng.", "快:kuài"),
        correctAnswer = "妹妹,唱歌,唱,得,很,好听。",
        illustrationRes = 0,
        audioToSpeak = "妹妹唱歌唱得很好听。"
    ),

    // 6. Soal 6: Pilihan Kalimat
    Exercise(
        id = "u28_s2_p1_q6",
        type = ExerciseType.SENTENCE_CHOICE,
        title = "Pilih terjemahan yang benar",
        targetHanzi = "他 汉语 讲 得 很 流利。",
        targetPinyin = "Tā Hànyǔ jiǎng de hěn liúlì.",
        targetTranslation = "Dia berbicara bahasa Mandarin dengan sangat lancar.",
        correctAnswer = "Tā Hànyǔ jiǎng de hěn liúlì.\n他 汉语 讲 得 很 流利。",
        options = listOf(
            "Tā Hànyǔ jiǎng de hěn liúlì.\n他 汉语 讲 得 很 流利。",
            "Tā Hànyǔ jiǎng de bù liúlì.\n他 汉语 讲 得 不 流利。",
            "Wǒ Hànyǔ jiǎng de hěn liúlì.\n我 汉语 讲 得 很 流利。"
        ),
        audioToSpeak = "他汉语讲得很流利。"
    ),

    // 7. Soal 7: Pilihan Gambar (写得好 -> menulis dengan elok)
    Exercise(
        id = "u28_s2_p1_q7",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "写得好",
        targetPinyin = "xiě de hǎo",
        targetTranslation = "menulis dengan baik",
        correctAnswer = "menulis dengan baik",
        audioToSpeak = "写得好",
        pictureOptions = listOf(
            PictureOption("u28_s2_p1_opt7_1", "derajat baik", "", R.drawable.ic_gram_degree_speedometer, true),
            PictureOption("u28_s2_p1_opt7_2", "berlari", "", R.drawable.ic_gram_manner_running, false),
            PictureOption("u28_s2_p1_opt7_3", "podium", "", R.drawable.ic_gram_superlative_podium, false),
            PictureOption("u28_s2_p1_opt7_4", "timbangan", "", R.drawable.ic_gram_compare_scale, false)
        )
    ),

    // 8. Soal 8: Ketik Pinyin (menulis dengan baik -> xiěde)
    Exercise(
        id = "u28_s2_p1_q8",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "menulis dengan baik",
        sentenceWithBlank = "写的 (________)",
        targetHanzi = "写的",
        targetPinyin = "xiěde",
        correctAnswer = "xiede",
        keyboardKeys = listOf("x", "i", "e", "d", "a", "o", "u", "b", "g", "h", "j", "l"),
        audioToSpeak = "写的"
    ),

    // 9. Soal 9: Susun Kalimat (Ibu memasak dengan sangat lezat.)
    Exercise(
        id = "u28_s2_p1_q9",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Ibu memasak dengan sangat lezat.",
        targetHanzi = "妈妈 做饭 做 得 很 好吃。",
        targetPinyin = "Māma zuòfàn zuò de hěn hǎochī.",
        wordChips = listOf("妈妈:māma", "做饭:zuòfàn", "做:zuò", "得:de", "很:hěn", "好吃。:hǎochī.", "难吃:nánchī"),
        correctAnswer = "妈妈,做饭,做,得,很,好吃。",
        audioToSpeak = "妈妈做饭做得很好吃。"
    ),

    // 10. Soal 10: Ketuk Pasangan yang Sesuai (Rangkuman Komplemen Derajat)
    Exercise(
        id = "u28_s2_p1_m10",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u28_s2_p1_m10_1", "做得好", "zuò de hǎo", "buat dengan bagus"),
            MatchPairItem("u28_s2_p1_m2", "睡得香", "shuì de xiāng", "tidur lelap"),
            MatchPairItem("u28_s2_p1_m3", "走得慢", "zǒu de màn", "jalan lambat"),
            MatchPairItem("u28_s2_p1_m4", "玩得开心", "wán de kāixīn", "main gembira")
        )
    )
)

val bab28Stage2Part2Exercises = listOf(
    // 1. Soal 1: Pilihan Gambar (地 -> partikel penanda cara adverbial)
    Exercise(
        id = "u28_s2_p2_q1",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "地",
        targetPinyin = "de",
        targetTranslation = "partikel adverbial cara",
        correctAnswer = "partikel adverbial cara",
        audioToSpeak = "地",
        pictureOptions = listOf(
            PictureOption("u28_s2_p2_opt1", "cara bertindak", "", R.drawable.ic_gram_manner_running, true),
            PictureOption("u28_s2_p2_opt2", "kecepatan", "", R.drawable.ic_gram_degree_speedometer, false),
            PictureOption("u28_s2_p2_opt3", "timbangan", "", R.drawable.ic_gram_compare_scale, false),
            PictureOption("u28_s2_p2_opt4", "podium", "", R.drawable.ic_gram_superlative_podium, false)
        )
    ),

    // 2. Soal 2: Susun Kalimat (Para murid mendengarkan penjelasan guru dengan sungguh-sungguh.)
    Exercise(
        id = "u28_s2_p2_q2",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Siswa mendengarkan guru dengan sungguh-sungguh.",
        targetHanzi = "同学们 认真 地 听课。",
        targetPinyin = "Tóngxuémen rènzhēn de tīngkè.",
        wordChips = listOf("同学们:tóngxuémen", "认真:rènzhēn", "地:de", "听课。:tīngkè.", "玩:wán"),
        correctAnswer = "同学们,认真,地,听课。",
        audioToSpeak = "同学们认真地听课。"
    ),

    // 3. Soal 3: Ketuk Pasangan yang Sesuai (Partikel Cara 地)
    Exercise(
        id = "u28_s2_p2_m3",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u28_s2_p2_m1", "慢慢地", "mànmàn de", "dengan perlahan"),
            MatchPairItem("u28_s2_p2_m2", "飞快地", "fēikuài de", "dengan melesat"),
            MatchPairItem("u28_s2_p2_m3", "高兴地", "gāoxìng de", "dengan gembira"),
            MatchPairItem("u28_s2_p2_m4", "认真地", "rènzhēn de", "dengan sungguh-sungguh")
        )
    ),

    // 4. Soal 4: Ketik Pinyin (berlari dengan kencang -> pǎode)
    Exercise(
        id = "u28_s2_p2_q4",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "berlari kencang",
        sentenceWithBlank = "跑的 (________)",
        targetHanzi = "跑的",
        targetPinyin = "pǎode",
        correctAnswer = "paode",
        keyboardKeys = listOf("p", "a", "o", "d", "e", "i", "u", "b", "g", "h", "j", "l"),
        audioToSpeak = "跑的"
    ),

    // 5. Soal 5: Mendengar Kalimat (Rule 10: illustrationRes = 0)
    Exercise(
        id = "u28_s2_p2_q5",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Apa yang Anda dengar?",
        targetTranslation = "Kakek berjalan dengan perlahan-lahan.",
        targetHanzi = "爷爷 慢慢 地 走。",
        targetPinyin = "Yéye mànmàn de zǒu.",
        wordChips = listOf("爷爷:yéye", "慢慢:mànmàn", "地:de", "走。:zǒu.", "快:kuài"),
        correctAnswer = "爷爷,慢慢,地,走。",
        illustrationRes = 0,
        audioToSpeak = "爷爷慢慢地走。"
    ),

    // 6. Soal 6: Pilihan Kalimat
    Exercise(
        id = "u28_s2_p2_q6",
        type = ExerciseType.SENTENCE_CHOICE,
        title = "Pilih terjemahan yang benar",
        targetHanzi = "他 高兴 地 笑 了 起来。",
        targetPinyin = "Tā gāoxìng de xiào le qǐlai.",
        targetTranslation = "Dia mulai tertawa dengan gembira.",
        correctAnswer = "Tā gāoxìng de xiào le qǐlai.\n他 高兴 地 笑 了 起来。",
        options = listOf(
            "Tā gāoxìng de xiào le qǐlai.\n他 高兴 地 笑 了 起来。",
            "Tā shāngxīn de kū le qǐlai.\n他 伤心 地 哭 了 起来。",
            "Wǒ gāoxìng de xiào le qǐlai.\n我 高兴 地 笑 了 起来。"
        ),
        audioToSpeak = "他高兴地笑了起来。"
    ),

    // 7. Soal 7: Pilihan Gambar (慢慢地 -> berjalan perlahan)
    Exercise(
        id = "u28_s2_p2_q7",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "慢慢地",
        targetPinyin = "mànmàn de",
        targetTranslation = "dengan perlahan",
        correctAnswer = "dengan perlahan",
        audioToSpeak = "慢慢地",
        pictureOptions = listOf(
            PictureOption("u28_s2_p2_opt7_1", "perlahan", "", R.drawable.ic_gram_manner_running, true),
            PictureOption("u28_s2_p2_opt7_2", "podium", "", R.drawable.ic_gram_superlative_podium, false),
            PictureOption("u28_s2_p2_opt7_3", "skala", "", R.drawable.ic_gram_compare_scale, false),
            PictureOption("u28_s2_p2_opt7_4", "kecepatan", "", R.drawable.ic_gram_degree_speedometer, false)
        )
    ),

    // 8. Soal 8: Ketik Pinyin (pelan-pelan -> mànmande)
    Exercise(
        id = "u28_s2_p2_q8",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "dengan pelan",
        sentenceWithBlank = "慢的 (________)",
        targetHanzi = "慢的",
        targetPinyin = "mànde",
        correctAnswer = "mande",
        keyboardKeys = listOf("m", "a", "n", "d", "e", "i", "o", "u", "b", "g", "h", "j"),
        audioToSpeak = "慢的"
    ),

    // 9. Soal 9: Susun Kalimat (Anak kecil bernyanyi dengan sangat gembira.)
    Exercise(
        id = "u28_s2_p2_q9",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Anak kecil menyanyi dengan gembira.",
        targetHanzi = "小孩儿 快乐 地 唱歌。",
        targetPinyin = "Xiǎoháiér kuàilè de chànggē.",
        wordChips = listOf("小孩儿:xiǎoháiér", "快乐:kuàilè", "地:de", "唱歌。:chànggē.", "哭:kū"),
        correctAnswer = "小孩儿,快乐,地,唱歌。",
        audioToSpeak = "小孩儿快乐地唱歌。"
    ),

    // 10. Soal 10: Ketuk Pasangan yang Sesuai (Rangkuman Cara & Sikap)
    Exercise(
        id = "u28_s2_p2_m10",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u28_s2_p2_m10_1", "认真地", "rènzhēn de", "sungguh-sungguh"),
            MatchPairItem("u28_s2_p2_m10_2", "慢慢地", "mànmàn de", "pelan-pelan"),
            MatchPairItem("u28_s2_p2_m3", "快乐地", "kuàilè de", "dengan riang"),
            MatchPairItem("u28_s2_p2_m4", "高声地", "gāoshēng de", "dengan lantang")
        )
    )
)
