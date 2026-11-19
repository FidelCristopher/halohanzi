package com.example.chineselearning.data.repository

import com.example.chineselearning.R
import com.example.chineselearning.data.model.Exercise
import com.example.chineselearning.data.model.ExerciseType
import com.example.chineselearning.data.model.MatchPairItem
import com.example.chineselearning.data.model.PictureOption

val bab5Stage3Part1Exercises = listOf(
    // 1. Soal 1: Pilihan Gambar (早饭 -> sarapan)
    Exercise(
        id = "u5_s3_p1_q1",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "早饭",
        targetPinyin = "zǎofàn",
        targetTranslation = "sarapan",
        correctAnswer = "sarapan",
        audioToSpeak = "早饭",
        pictureOptions = listOf(
            PictureOption("u5_s3_p1_opt1", "sarapan", "🍳", R.drawable.ic_story_timer, true),
            PictureOption("u5_s3_p1_opt2", "makan siang", "🍱", R.drawable.ic_target, false),
            PictureOption("u5_s3_p1_opt3", "makan malam", "🍲", R.drawable.ic_book, false),
            PictureOption("u5_s3_p1_opt4", "teh", "🍵", R.drawable.ic_crown, false)
        )
    ),

    // 2. Soal 2: Susun Kalimat (Saya makan sarapan.)
    Exercise(
        id = "u5_s3_p1_q2",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Saya makan sarapan.",
        targetHanzi = "我 吃 早饭。",
        targetPinyin = "Wǒ chī zǎofàn.",
        wordChips = listOf("我:wǒ", "吃:chī", "早饭:zǎofàn", "午饭:wǔfàn", "他:tā"),
        correctAnswer = "我,吃,早饭",
        audioToSpeak = "我吃早饭。"
    ),

    // 3. Soal 3: Ketuk Pasangan yang Sesuai (Sarapan & Makan Siang)
    Exercise(
        id = "u5_s3_p1_q3",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u5_s3_p1_m1", "早饭", "zǎofàn", "sarapan"),
            MatchPairItem("u5_s3_p1_m2", "午饭", "wǔfàn", "makan siang"),
            MatchPairItem("u5_s3_p1_m3", "吃早饭", "chī zǎofàn", "makan sarapan"),
            MatchPairItem("u5_s3_p1_m4", "吃午饭", "chī wǔfàn", "makan siang")
        )
    ),

    // 4. Soal 4: Ketik Pinyin (sarapan -> zǎofàn)
    Exercise(
        id = "u5_s3_p1_q4",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "sarapan",
        sentenceWithBlank = "早饭 (________)",
        targetHanzi = "早饭",
        targetPinyin = "zǎofàn",
        correctAnswer = "zaofan",
        keyboardKeys = listOf("z", "a", "o", "f", "n", "e", "i", "u", "b", "d", "g"),
        audioToSpeak = "早饭"
    ),

    // 5. Soal 5: Mendengar Kalimat (Rule 10: illustrationRes = 0)
    Exercise(
        id = "u5_s3_p1_q5",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Apa yang Anda dengar?",
        targetTranslation = "Jam 12 makan siang.",
        targetHanzi = "十二 点 吃 午饭。",
        targetPinyin = "Shí'èr diǎn chī wǔfàn.",
        wordChips = listOf("十二:shí'èr", "点:diǎn", "吃:chī", "午饭:wǔfàn", "早饭:zǎofàn", "七:qī"),
        correctAnswer = "十二,点,吃,午饭",
        illustrationRes = 0,
        audioToSpeak = "十二点吃午饭。"
    ),

    // 6. Soal 6: Pilihan Kalimat
    Exercise(
        id = "u5_s3_p1_q6",
        type = ExerciseType.SENTENCE_CHOICE,
        title = "Pilih terjemahan yang benar",
        targetHanzi = "你 吃 早饭 了 吗？",
        targetPinyin = "Nǐ chī zǎofàn le ma?",
        targetTranslation = "Apakah kamu sudah sarapan?",
        correctAnswer = "Nǐ chī zǎofàn le ma?\n你 吃 早饭 了 吗？",
        options = listOf(
            "Nǐ chī zǎofàn le ma?\n你 吃 早饭 了 吗？",
            "Nǐ chī wǔfàn le ma?\n你 吃 午饭 了 吗？",
            "Tā chī zǎofàn le ma?\n他 吃 早饭 了 吗？"
        ),
        audioToSpeak = "你吃早饭了吗？"
    ),

    // 7. Soal 7: Pilihan Gambar (午饭 -> makan siang)
    Exercise(
        id = "u5_s3_p1_q7",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "午饭",
        targetPinyin = "wǔfàn",
        targetTranslation = "makan siang",
        correctAnswer = "makan siang",
        audioToSpeak = "午饭",
        pictureOptions = listOf(
            PictureOption("u5_s3_p1_opt7_1", "makan siang", "🍱", R.drawable.ic_story_timer, true),
            PictureOption("u5_s3_p1_opt7_2", "sarapan", "🍳", R.drawable.ic_book, false),
            PictureOption("u5_s3_p1_opt7_3", "makan malam", "🍲", R.drawable.ic_crown, false),
            PictureOption("u5_s3_p1_opt7_4", "air", "💧", R.drawable.ic_target, false)
        )
    ),

    // 8. Soal 8: Ketik Pinyin (makan siang -> wǔfàn)
    Exercise(
        id = "u5_s3_p1_q8",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "makan siang",
        sentenceWithBlank = "午饭 (________)",
        targetHanzi = "午饭",
        targetPinyin = "wǔfàn",
        correctAnswer = "wufan",
        keyboardKeys = listOf("w", "u", "f", "a", "n", "e", "i", "o", "b", "d", "g"),
        audioToSpeak = "午饭"
    ),

    // 9. Soal 9: Susun Kalimat (Saya jam tujuh makan sarapan.)
    Exercise(
        id = "u5_s3_p1_q9",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Saya jam tujuh sarapan.",
        targetHanzi = "我 七 点 吃 早饭。",
        targetPinyin = "Wǒ qī diǎn chī zǎofàn.",
        wordChips = listOf("我:wǒ", "七:qī", "点:diǎn", "吃:chī", "早饭:zǎofàn", "八:bā"),
        correctAnswer = "我,七,点,吃,早饭",
        audioToSpeak = "我七点吃早饭。"
    ),

    // 10. Soal 10: Ketuk Pasangan yang Sesuai (Pola Jam Makan)
    Exercise(
        id = "u5_s3_p1_q10",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u5_s3_p1_m10_1", "早饭", "zǎofàn", "sarapan"),
            MatchPairItem("u5_s3_p1_m10_2", "午饭", "wǔfàn", "makan siang"),
            MatchPairItem("u5_s3_p1_m10_3", "七点", "qīdiǎn", "jam tujuh"),
            MatchPairItem("u5_s3_p1_m10_4", "十二点", "shí'èrdiǎn", "jam dua belas")
        )
    )
)

val bab5Stage3Part2Exercises = listOf(
    // 1. Soal 1: Pilihan Gambar (晚饭 -> makan malam)
    Exercise(
        id = "u5_s3_p2_q1",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "晚饭",
        targetPinyin = "wǎnfàn",
        targetTranslation = "makan malam",
        correctAnswer = "makan malam",
        audioToSpeak = "晚饭",
        pictureOptions = listOf(
            PictureOption("u5_s3_p2_opt1", "makan malam", "🍲", R.drawable.ic_story_timer, true),
            PictureOption("u5_s3_p2_opt2", "sarapan", "🍳", R.drawable.ic_target, false),
            PictureOption("u5_s3_p2_opt3", "makan siang", "🍱", R.drawable.ic_book, false),
            PictureOption("u5_s3_p2_opt4", "teh", "🍵", R.drawable.ic_crown, false)
        )
    ),

    // 2. Soal 2: Susun Kalimat (Kita jam berapa makan malam?)
    Exercise(
        id = "u5_s3_p2_q2",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Kita jam berapa makan malam?",
        targetHanzi = "我们 几 点 吃 晚饭？",
        targetPinyin = "Wǒmen jǐ diǎn chī wǎnfàn?",
        wordChips = listOf("我们:wǒmen", "几:jǐ", "点:diǎn", "吃:chī", "晚饭:wǎnfàn", "早饭:zǎofàn"),
        correctAnswer = "我们,几,点,吃,晚饭",
        audioToSpeak = "我们几点吃晚饭？"
    ),

    // 3. Soal 3: Ketuk Pasangan yang Sesuai (Rangkuman 3 Kali Makan)
    Exercise(
        id = "u5_s3_p2_q3",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u5_s3_p2_m1", "早饭", "zǎofàn", "sarapan"),
            MatchPairItem("u5_s3_p2_m2", "午饭", "wǔfàn", "makan siang"),
            MatchPairItem("u5_s3_p2_m3", "晚饭", "wǎnfàn", "makan malam"),
            MatchPairItem("u5_s3_p2_m4", "吃饭", "chīfàn", "makan nasi / makan")
        )
    ),

    // 4. Soal 4: Ketik Pinyin (makan malam -> wǎnfàn)
    Exercise(
        id = "u5_s3_p2_q4",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "makan malam",
        sentenceWithBlank = "晚饭 (________)",
        targetHanzi = "晚饭",
        targetPinyin = "wǎnfàn",
        correctAnswer = "wanfan",
        keyboardKeys = listOf("w", "a", "n", "f", "e", "i", "o", "u", "b", "d", "g"),
        audioToSpeak = "晚饭"
    ),

    // 5. Soal 5: Mendengar Kalimat (Rule 10: illustrationRes = 0)
    Exercise(
        id = "u5_s3_p2_q5",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Apa yang Anda dengar?",
        targetTranslation = "Jam tujuh malam makan malam.",
        targetHanzi = "晚上 七 点 吃 晚饭。",
        targetPinyin = "Wǎnshang qī diǎn chī wǎnfàn.",
        wordChips = listOf("晚上:wǎnshang", "七:qī", "点:diǎn", "吃:chī", "晚饭:wǎnfàn", "早上:zǎoshang"),
        correctAnswer = "晚上,七,点,吃,晚饭",
        illustrationRes = 0,
        audioToSpeak = "晚上七点吃晚饭。"
    ),

    // 6. Soal 6: Pilihan Kalimat
    Exercise(
        id = "u5_s3_p2_q6",
        type = ExerciseType.SENTENCE_CHOICE,
        title = "Pilih terjemahan yang benar",
        targetHanzi = "我和朋友 吃 午饭。",
        targetPinyin = "Wǒ hé péngyou chī wǔfàn.",
        targetTranslation = "Saya dan teman makan siang.",
        correctAnswer = "Wǒ hé péngyou chī wǔfàn.\n我和朋友 吃 午饭。",
        options = listOf(
            "Wǒ hé péngyou chī wǔfàn.\n我和朋友 吃 午饭。",
            "Wǒ hé lǎoshī chī zǎofàn.\n我和老师 吃 早饭。",
            "Tā hé péngyou chī wǎnfàn.\n他 和 朋友 吃 晚饭。"
        ),
        audioToSpeak = "我和朋友吃午饭。"
    ),

    // 7. Soal 7: Pilihan Gambar (吃饭 -> makan)
    Exercise(
        id = "u5_s3_p2_q7",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "吃饭",
        targetPinyin = "chīfàn",
        targetTranslation = "makan",
        correctAnswer = "makan",
        audioToSpeak = "吃饭",
        pictureOptions = listOf(
            PictureOption("u5_s3_p2_opt7_1", "makan", "🍚", R.drawable.ic_coin, true),
            PictureOption("u5_s3_p2_opt7_2", "tidur", "🛌", R.drawable.ic_book, false),
            PictureOption("u5_s3_p2_opt7_3", "minum", "🍵", R.drawable.ic_story_timer, false),
            PictureOption("u5_s3_p2_opt7_4", "belajar", "📖", R.drawable.ic_crown, false)
        )
    ),

    // 8. Soal 8: Ketik Pinyin (makan -> chīfàn)
    Exercise(
        id = "u5_s3_p2_q8",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "makan",
        sentenceWithBlank = "吃饭 (________)",
        targetHanzi = "吃饭",
        targetPinyin = "chīfàn",
        correctAnswer = "chifan",
        keyboardKeys = listOf("c", "h", "i", "f", "a", "n", "e", "o", "u", "b", "d"),
        audioToSpeak = "吃饭"
    ),

    // 9. Soal 9: Susun Kalimat (Saya makan malam di rumah.)
    Exercise(
        id = "u5_s3_p2_q9",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Saya makan malam di rumah.",
        targetHanzi = "我 在 家 吃 晚饭。",
        targetPinyin = "Wǒ zài jiā chī wǎnfàn.",
        wordChips = listOf("我:wǒ", "在:zài", "家:jiā", "吃:chī", "晚饭:wǎnfàn", "学校:xuéxiào"),
        correctAnswer = "我,在,家,吃,晚饭",
        audioToSpeak = "我在家吃晚饭。"
    ),

    // 10. Soal 10: Ketuk Pasangan yang Sesuai (Rangkuman Makanan Harian)
    Exercise(
        id = "u5_s3_p2_m10_1",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u5_s3_p2_m10_1", "吃晚饭", "chī wǎnfàn", "makan malam"),
            MatchPairItem("u5_s3_p2_m10_2", "吃早饭", "chī zǎofàn", "makan sarapan"),
            MatchPairItem("u5_s3_p2_m10_3", "吃午饭", "chī wǔfàn", "makan siang"),
            MatchPairItem("u5_s3_p2_m10_4", "在家", "zài jiā", "di rumah")
        )
    )
)
