package com.example.chineselearning.data.repository

import com.example.chineselearning.R
import com.example.chineselearning.data.model.Exercise
import com.example.chineselearning.data.model.ExerciseType
import com.example.chineselearning.data.model.MatchPairItem
import com.example.chineselearning.data.model.PictureOption

val bab14Stage4Part1Exercises = listOf(
    // 1. Soal 1: Pilihan Gambar (狗 -> anjing)
    Exercise(
        id = "u14_s4_p1_q1",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "狗",
        targetPinyin = "gǒu",
        targetTranslation = "anjing",
        correctAnswer = "anjing",
        audioToSpeak = "狗",
        pictureOptions = listOf(
            PictureOption("u14_s4_p1_opt1", "anjing", "", R.drawable.ic_pet_dog, true),
            PictureOption("u14_s4_p1_opt2", "kucing", "", R.drawable.ic_pet_cat, false),
            PictureOption("u14_s4_p1_opt3", "apel", "", R.drawable.ic_food_apple, false),
            PictureOption("u14_s4_p1_opt4", "teh", "", R.drawable.ic_food_tea, false)
        )
    ),

    // 2. Soal 2: Susun Kalimat (Saya punya seekor anjing kecil.)
    Exercise(
        id = "u14_s4_p1_q2",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Saya punya seekor anjing kecil.",
        targetHanzi = "我 有 一 只 小狗。",
        targetPinyin = "Wǒ yǒu yì zhī xiǎogǒu.",
        wordChips = listOf("我:wǒ", "有:yǒu", "一:yì", "只:zhī", "小狗:xiǎogǒu", "小猫:xiǎomāo"),
        correctAnswer = "我,有,一,只,小狗",
        audioToSpeak = "我有一只小狗。"
    ),

    // 3. Soal 3: Ketuk Pasangan yang Sesuai (Anjing & Kucing)
    Exercise(
        id = "u14_s4_p1_q3",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u14_s4_p1_m1", "狗", "gǒu", "anjing"),
            MatchPairItem("u14_s4_p1_m2", "猫", "māo", "kucing"),
            MatchPairItem("u14_s4_p1_m3", "小狗", "xiǎogǒu", "anak anjing"),
            MatchPairItem("u14_s4_p1_m4", "小猫", "xiǎomāo", "anak kucing")
        )
    ),

    // 4. Soal 4: Ketik Pinyin (anjing -> gǒu)
    Exercise(
        id = "u14_s4_p1_q4",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "anjing",
        sentenceWithBlank = "狗 (________)",
        targetHanzi = "狗",
        targetPinyin = "gǒu",
        correctAnswer = "gou",
        keyboardKeys = listOf("g", "o", "u", "a", "e", "i", "b", "d", "h", "j", "l"),
        audioToSpeak = "狗"
    ),

    // 5. Soal 5: Mendengar Kalimat (Rule 10: illustrationRes = 0)
    Exercise(
        id = "u14_s4_p1_q5",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Apa yang Anda dengar?",
        targetTranslation = "Kucing itu di bawah kursi.",
        targetHanzi = "猫 在 椅子 下。",
        targetPinyin = "Māo zài yǐzi xia.",
        wordChips = listOf("猫:māo", "在:zài", "椅子:yǐzi", "下:xia", "上:shang", "狗:gǒu"),
        correctAnswer = "猫,在,椅子,下",
        illustrationRes = 0,
        audioToSpeak = "猫在椅子下。"
    ),

    // 6. Soal 6: Pilihan Kalimat
    Exercise(
        id = "u14_s4_p1_q6",
        type = ExerciseType.SENTENCE_CHOICE,
        title = "Pilih terjemahan yang benar",
        targetHanzi = "这 只 小猫 很 漂亮。",
        targetPinyin = "Zhè zhī xiǎomāo hěn piàoliang.",
        targetTranslation = "Anak kucing ini sangat cantik.",
        correctAnswer = "Zhè zhī xiǎomāo hěn piàoliang.\n这 只 小猫 很 漂亮。",
        options = listOf(
            "Zhè zhī xiǎomāo hěn piàoliang.\n这 只 小猫 很 漂亮。",
            "Zhè zhī xiǎogǒu hěn piàoliang.\n这 只 小狗 很 漂亮。",
            "Nà zhī xiǎomāo hěn piàoliang.\n那 只 小猫 很 漂亮。"
        ),
        audioToSpeak = "这只小猫很漂亮。"
    ),

    // 7. Soal 7: Pilihan Gambar (猫 -> kucing)
    Exercise(
        id = "u14_s4_p1_q7",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "猫",
        targetPinyin = "māo",
        targetTranslation = "kucing",
        correctAnswer = "kucing",
        audioToSpeak = "猫",
        pictureOptions = listOf(
            PictureOption("u14_s4_p1_opt7_1", "kucing", "", R.drawable.ic_pet_cat, true),
            PictureOption("u14_s4_p1_opt7_2", "anjing", "", R.drawable.ic_pet_dog, false),
            PictureOption("u14_s4_p1_opt7_3", "buah", "", R.drawable.ic_food_fruits, false),
            PictureOption("u14_s4_p1_opt7_4", "air", "", R.drawable.ic_food_water, false)
        )
    ),

    // 8. Soal 8: Ketik Pinyin (kucing -> māo)
    Exercise(
        id = "u14_s4_p1_q8",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "kucing",
        sentenceWithBlank = "猫 (________)",
        targetHanzi = "猫",
        targetPinyin = "māo",
        correctAnswer = "mao",
        keyboardKeys = listOf("m", "a", "o", "e", "i", "u", "b", "d", "g", "h", "j"),
        audioToSpeak = "猫"
    ),

    // 9. Soal 9: Susun Kalimat (Saya punya dua ekor kucing.)
    Exercise(
        id = "u14_s4_p1_q9",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Saya punya dua ekor kucing.",
        targetHanzi = "我 有 两 只 猫。",
        targetPinyin = "Wǒ yǒu liǎng zhī māo.",
        wordChips = listOf("我:wǒ", "有:yǒu", "两:liǎng", "只:zhī", "猫:māo", "二:èr", "狗:gǒu"),
        correctAnswer = "我,有,两,只,猫",
        audioToSpeak = "我有两只猫。"
    ),

    // 10. Soal 10: Ketuk Pasangan yang Sesuai (Rangkuman Fauna)
    Exercise(
        id = "u14_s4_p1_m10_1",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u14_s4_p1_m10_1", "狗", "gǒu", "anjing"),
            MatchPairItem("u14_s4_p1_m10_2", "猫", "māo", "kucing"),
            MatchPairItem("u14_s4_p1_m10_3", "一只狗", "yì zhī gǒu", "seekor anjing"),
            MatchPairItem("u14_s4_p1_m10_4", "一只猫", "yì zhī māo", "seekor kucing")
        )
    )
)

val bab14Stage4Part2Exercises = listOf(
    // 1. Soal 1: Pilihan Gambar (只 -> ekor)
    Exercise(
        id = "u14_s4_p2_q1",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "只",
        targetPinyin = "zhī",
        targetTranslation = "ekor (hewan)",
        correctAnswer = "ekor (hewan)",
        audioToSpeak = "只",
        pictureOptions = listOf(
            PictureOption("u14_s4_p2_opt1", "ekor (hewan)", "", R.drawable.ic_pet_tail, true),
            PictureOption("u14_s4_p2_opt2", "buah (benda)", "", R.drawable.ic_shop_some_items, false),
            PictureOption("u14_s4_p2_opt3", "helai (baju)", "", R.drawable.ic_shop_piece_clothes, false),
            PictureOption("u14_s4_p2_opt4", "jilid (buku)", "", R.drawable.ic_edu_book_volume, false)
        )
    ),

    // 2. Soal 2: Susun Kalimat (Kucing ini sangat cantik.)
    Exercise(
        id = "u14_s4_p2_q2",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Kucing ini sangat cantik.",
        targetHanzi = "这 只 猫 很 漂亮。",
        targetPinyin = "Zhè zhī māo hěn piàoliang.",
        wordChips = listOf("这:zhè", "只:zhī", "猫:māo", "很:hěn", "漂亮:piàoliang", "那:nà"),
        correctAnswer = "这,只,猫,很,漂亮",
        audioToSpeak = "这只猫很漂亮。"
    ),

    // 3. Soal 3: Ketuk Pasangan yang Sesuai (Satuan Hewan & Sifat)
    Exercise(
        id = "u14_s4_p2_m3",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u14_s4_p2_m1", "只", "zhī", "ekor (kata bantu hewan)"),
            MatchPairItem("u14_s4_p2_m2", "漂亮", "piàoliang", "cantik / indah"),
            MatchPairItem("u14_s4_p2_m3", "很漂亮", "hěn piàoliang", "sangat cantik"),
            MatchPairItem("u14_s4_p2_m4", "三只小猫", "sān zhī xiǎomāo", "tiga ekor kucing")
        )
    ),

    // 4. Soal 4: Ketik Pinyin (ekor hewan -> zhī)
    Exercise(
        id = "u14_s4_p2_q4",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "ekor (satuan hewan)",
        sentenceWithBlank = "只 (________)",
        targetHanzi = "只",
        targetPinyin = "zhī",
        correctAnswer = "zhi",
        keyboardKeys = listOf("z", "h", "i", "a", "e", "o", "u", "b", "d", "g", "j"),
        audioToSpeak = "只"
    ),

    // 5. Soal 5: Mendengar Kalimat (Rule 10: illustrationRes = 0)
    Exercise(
        id = "u14_s4_p2_q5",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Apa yang Anda dengar?",
        targetTranslation = "Anjing itu sangat lucu.",
        targetHanzi = "那 只 小狗 很 漂亮。",
        targetPinyin = "Nà zhī xiǎogǒu hěn piàoliang.",
        wordChips = listOf("那:nà", "只:zhī", "小狗:xiǎogǒu", "很:hěn", "漂亮:piàoliang", "这:zhè"),
        correctAnswer = "那,只,小狗,很,漂亮",
        illustrationRes = 0,
        audioToSpeak = "那只小狗很漂亮。"
    ),

    // 6. Soal 6: Pilihan Kalimat
    Exercise(
        id = "u14_s4_p2_q6",
        type = ExerciseType.SENTENCE_CHOICE,
        title = "Pilih terjemahan yang benar",
        targetHanzi = "我家 有 三 只 猫。",
        targetPinyin = "Wǒjiā yǒu sān zhī māo.",
        targetTranslation = "Rumah saya ada tiga ekor kucing.",
        correctAnswer = "Wǒjiā yǒu sān zhī māo.\n我家 有 三 只 猫。",
        options = listOf(
            "Wǒjiā yǒu sān zhī māo.\n我家 有 三 只 猫。",
            "Wǒjiā yǒu sān zhī gǒu.\n我家 有 三 只 狗。",
            "Tājiā yǒu sān zhī māo.\n他家 有 三 只 猫。"
        ),
        audioToSpeak = "我家有三只猫。"
    ),

    // 7. Soal 7: Pilihan Gambar (漂亮 -> cantik / indah)
    Exercise(
        id = "u14_s4_p2_q7",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "漂亮",
        targetPinyin = "piàoliang",
        targetTranslation = "cantik / indah",
        correctAnswer = "cantik / indah",
        audioToSpeak = "漂亮",
        pictureOptions = listOf(
            PictureOption("u14_s4_p2_opt7_1", "cantik", "", R.drawable.ic_hobby_pretty, true),
            PictureOption("u14_s4_p2_opt7_2", "jelek", "", R.drawable.ic_mod_wrong, false),
            PictureOption("u14_s4_p2_opt7_3", "makanan", "", R.drawable.ic_food_rice, false),
            PictureOption("u14_s4_p2_opt7_4", "mobil", "", R.drawable.ic_trans_car, false)
        )
    ),

    // 8. Soal 8: Ketik Pinyin (cantik -> piàoliang)
    Exercise(
        id = "u14_s4_p2_q8",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "cantik / indah",
        sentenceWithBlank = "漂亮 (________)",
        targetHanzi = "漂亮",
        targetPinyin = "piàoliang",
        correctAnswer = "piaoliang",
        keyboardKeys = listOf("p", "i", "a", "o", "l", "n", "g", "e", "u", "b", "d"),
        audioToSpeak = "漂亮"
    ),

    // 9. Soal 9: Susun Kalimat (Saya menyukai anjing kecil ini.)
    Exercise(
        id = "u14_s4_p2_q9",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Saya suka anjing kecil ini.",
        targetHanzi = "我 喜欢 这 只 小狗。",
        targetPinyin = "Wǒ xǐhuan zhè zhī xiǎogǒu.",
        wordChips = listOf("我:wǒ", "喜欢:xǐhuan", "这:zhè", "只:zhī", "小狗:xiǎogǒu", "小猫:xiǎomāo"),
        correctAnswer = "我,喜欢,这,只,小狗",
        audioToSpeak = "我喜欢这只小狗。"
    ),

    // 10. Soal 10: Ketuk Pasangan yang Sesuai (Rangkuman Hewan Peliharaan)
    Exercise(
        id = "u14_s4_p2_m10_1",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u14_s4_p2_m10_1", "只", "zhī", "ekor"),
            MatchPairItem("u14_s4_p2_m10_2", "漂亮", "piàoliang", "cantik"),
            MatchPairItem("u14_s4_p2_m10_3", "小狗", "xiǎogǒu", "anak anjing"),
            MatchPairItem("u14_s4_p2_m10_4", "小猫", "xiǎomāo", "anak kucing")
        )
    )
)
