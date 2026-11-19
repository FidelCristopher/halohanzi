package com.example.chineselearning.data.repository

import com.example.chineselearning.R
import com.example.chineselearning.data.model.Exercise
import com.example.chineselearning.data.model.ExerciseType
import com.example.chineselearning.data.model.MatchPairItem
import com.example.chineselearning.data.model.PictureOption

val bab5Stage5Part1Exercises = listOf(
    // 1. Soal 1: Pilihan Gambar (早上 -> pagi)
    Exercise(
        id = "u5_s5_p1_q1",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "早上",
        targetPinyin = "zǎoshang",
        targetTranslation = "pagi",
        correctAnswer = "pagi",
        audioToSpeak = "早上",
        pictureOptions = listOf(
            PictureOption("u5_s5_p1_opt1", "pagi", "🌅", R.drawable.ic_story_timer, true),
            PictureOption("u5_s5_p1_opt2", "malam", "🌙", R.drawable.ic_book, false),
            PictureOption("u5_s5_p1_opt3", "siang", "☀️", R.drawable.ic_target, false),
            PictureOption("u5_s5_p1_opt4", "sore", "🌇", R.drawable.ic_crown, false)
        )
    ),

    // 2. Soal 2: Susun Kalimat (Saya jam tujuh pagi bangun tidur.)
    Exercise(
        id = "u5_s5_p1_q2",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Saya jam tujuh pagi bangun.",
        targetHanzi = "我 早上 七 点 起床。",
        targetPinyin = "Wǒ zǎoshang qī diǎn qǐchuáng.",
        wordChips = listOf("我:wǒ", "早上:zǎoshang", "七:qī", "点:diǎn", "起床:qǐchuáng", "晚上:wǎnshang"),
        correctAnswer = "我,早上,七,点,起床",
        audioToSpeak = "我早上七点起床。"
    ),

    // 3. Soal 3: Ketuk Pasangan yang Sesuai (Rangkuman Waktu & Aksi Bab 5)
    Exercise(
        id = "u5_s5_p1_q3",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u5_s5_p1_m1", "早上", "zǎoshang", "pagi"),
            MatchPairItem("u5_s5_p1_m2", "中午", "zhōngwǔ", "siang"),
            MatchPairItem("u5_s5_p1_m3", "晚上", "wǎnshang", "malam"),
            MatchPairItem("u5_s5_p1_m4", "起床", "qǐchuáng", "bangun tidur")
        )
    ),

    // 4. Soal 4: Ketik Pinyin (bangun tidur -> qǐchuáng)
    Exercise(
        id = "u5_s5_p1_q4",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "bangun tidur",
        sentenceWithBlank = "起床 (________)",
        targetHanzi = "起床",
        targetPinyin = "qǐchuáng",
        correctAnswer = "qichuang",
        keyboardKeys = listOf("q", "i", "c", "h", "u", "a", "n", "g", "e", "o", "b"),
        audioToSpeak = "起床"
    ),

    // 5. Soal 5: Mendengar Kalimat (Rule 10: illustrationRes = 0)
    Exercise(
        id = "u5_s5_p1_q5",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Apa yang Anda dengar?",
        targetTranslation = "Saya sedang makan malam.",
        targetHanzi = "我 正在 吃 晚饭。",
        targetPinyin = "Wǒ zhèngzài chī wǎnfàn.",
        wordChips = listOf("我:wǒ", "正在:zhèngzài", "吃:chī", "晚饭:wǎnfàn", "早饭:zǎofàn", "他:tā"),
        correctAnswer = "我,正在,吃,晚饭",
        illustrationRes = 0,
        audioToSpeak = "我正在吃晚饭。"
    ),

    // 6. Soal 6: Pilihan Kalimat
    Exercise(
        id = "u5_s5_p1_q6",
        type = ExerciseType.SENTENCE_CHOICE,
        title = "Pilih terjemahan yang benar",
        targetHanzi = "他 晚上 十 点 睡觉。",
        targetPinyin = "Tā wǎnshang shí diǎn shuìjiào.",
        targetTranslation = "Dia jam sepuluh malam tidur.",
        correctAnswer = "Tā wǎnshang shí diǎn shuìjiào.\n他 晚上 十 点 睡觉。",
        options = listOf(
            "Tā wǎnshang shí diǎn shuìjiào.\n他 晚上 十 点 睡觉。",
            "Wǒ wǎnshang shí diǎn shuìjiào.\n我 晚上 十 点 睡觉。",
            "Tā zǎoshang shí diǎn qǐchuáng.\n他 早上 十 点 起床。"
        ),
        audioToSpeak = "他晚上十点睡觉。"
    ),

    // 7. Soal 7: Pilihan Gambar (睡觉 -> tidur)
    Exercise(
        id = "u5_s5_p1_q7",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "睡觉",
        targetPinyin = "shuìjiào",
        targetTranslation = "tidur",
        correctAnswer = "tidur",
        audioToSpeak = "睡觉",
        pictureOptions = listOf(
            PictureOption("u5_s5_p1_opt7_1", "tidur", "🛌", R.drawable.ic_book, true),
            PictureOption("u5_s5_p1_opt7_2", "makan", "🍳", R.drawable.ic_story_timer, false),
            PictureOption("u5_s5_p1_opt7_3", "minum", "🍵", R.drawable.ic_coin, false),
            PictureOption("u5_s5_p1_opt7_4", "belajar", "✍️", R.drawable.ic_crown, false)
        )
    ),

    // 8. Soal 8: Ketik Pinyin (tidur -> shuìjiào)
    Exercise(
        id = "u5_s5_p1_q8",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "tidur",
        sentenceWithBlank = "睡觉 (________)",
        targetHanzi = "睡觉",
        targetPinyin = "shuìjiào",
        correctAnswer = "shuijiao",
        keyboardKeys = listOf("s", "h", "u", "i", "j", "a", "o", "e", "b", "d", "g"),
        audioToSpeak = "睡觉"
    ),

    // 9. Soal 9: Susun Kalimat (Siang jam dua belas makan siang.)
    Exercise(
        id = "u5_s5_p1_q9",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Siang jam 12 makan siang.",
        targetHanzi = "中午 十二 点 吃 午饭。",
        targetPinyin = "Zhōngwǔ shí'èr diǎn chī wǔfàn.",
        wordChips = listOf("中午:zhōngwǔ", "十二:shí'èr", "点:diǎn", "吃:chī", "午饭:wǔfàn", "晚上:wǎnshang"),
        correctAnswer = "中午,十二,点,吃,午饭",
        audioToSpeak = "中午十二点吃午饭。"
    ),

    // 10. Soal 10: Ketuk Pasangan yang Sesuai (Rangkuman Harian)
    Exercise(
        id = "u5_s5_p1_q10",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u5_s5_p1_m10_1", "睡觉", "shuìjiào", "tidur"),
            MatchPairItem("u5_s5_p1_m10_2", "休息", "xiūxi", "istirahat"),
            MatchPairItem("u5_s5_p1_m10_3", "早饭", "zǎofàn", "sarapan"),
            MatchPairItem("u5_s5_p1_m10_4", "午饭", "wǔfàn", "makan siang")
        )
    )
)

val bab5Stage5Part2Exercises = listOf(
    // 1. Soal 1: Pilihan Gambar (早饭 -> sarapan)
    Exercise(
        id = "u5_s5_p2_q1",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "早饭",
        targetPinyin = "zǎofàn",
        targetTranslation = "sarapan",
        correctAnswer = "sarapan",
        audioToSpeak = "早饭",
        pictureOptions = listOf(
            PictureOption("u5_s5_p2_opt1", "sarapan", "🍳", R.drawable.ic_story_timer, true),
            PictureOption("u5_s5_p2_opt2", "makan malam", "🍲", R.drawable.ic_book, false),
            PictureOption("u5_s5_p2_opt3", "tidur", "🛌", R.drawable.ic_crown, false),
            PictureOption("u5_s5_p2_opt4", "sekolah", "🏫", R.drawable.ic_cap, false)
        )
    ),

    // 2. Soal 2: Susun Kalimat (Kamu sedang apa?)
    Exercise(
        id = "u5_s5_p2_q2",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Kamu sedang apa?",
        targetHanzi = "你 正在 做 什么？",
        targetPinyin = "Nǐ zhèngzài zuò shénme?",
        wordChips = listOf("你:nǐ", "正在:zhèngzài", "做:zuò", "什么:shénme", "他:tā", "在:zài"),
        correctAnswer = "你,正在,做,什么",
        audioToSpeak = "你正在做什么？"
    ),

    // 3. Soal 3: Ketuk Pasangan yang Sesuai (Rangkuman Akhir Bab 5)
    Exercise(
        id = "u5_s5_p2_q3",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u5_s5_p2_m1", "正在", "zhèngzài", "sedang"),
            MatchPairItem("u5_s5_p2_m2", "一下", "yíxià", "sebentar"),
            MatchPairItem("u5_s5_p2_m3", "晚饭", "wǎnfàn", "makan malam"),
            MatchPairItem("u5_s5_p2_m4", "看书", "kànshū", "membaca buku")
        )
    ),

    // 4. Soal 4: Ketik Pinyin (sedang -> zhèngzài)
    Exercise(
        id = "u5_s5_p2_q4",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "sedang",
        sentenceWithBlank = "正在 (________)",
        targetHanzi = "正在",
        targetPinyin = "zhèngzài",
        correctAnswer = "zhengzai",
        keyboardKeys = listOf("z", "h", "e", "n", "g", "a", "i", "o", "u", "b", "d"),
        audioToSpeak = "正在"
    ),

    // 5. Soal 5: Mendengar Kalimat (Rule 10: illustrationRes = 0)
    Exercise(
        id = "u5_s5_p2_q5",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Apa yang Anda dengar?",
        targetTranslation = "Istirahatlah sebentar.",
        targetHanzi = "你 休息 一下 吧。",
        targetPinyin = "Nǐ xiūxi yíxià ba.",
        wordChips = listOf("你:nǐ", "休息:xiūxi", "一下:yíxià", "吧:ba", "我:wǒ", "去:qù"),
        correctAnswer = "你,休息,一下,吧",
        illustrationRes = 0,
        audioToSpeak = "你休息一下吧。"
    ),

    // 6. Soal 6: Pilihan Kalimat
    Exercise(
        id = "u5_s5_p2_q6",
        type = ExerciseType.SENTENCE_CHOICE,
        title = "Pilih terjemahan yang benar",
        targetHanzi = "我 早上 八 点 吃 早饭。",
        targetPinyin = "Wǒ zǎoshang bā diǎn chī zǎofàn.",
        targetTranslation = "Saya jam delapan pagi makan sarapan.",
        correctAnswer = "Wǒ zǎoshang bā diǎn chī zǎofàn.\n我 早上 八 点 吃 早饭。",
        options = listOf(
            "Wǒ zǎoshang bā diǎn chī zǎofàn.\n我 早上 八 点 吃 早饭。",
            "Tā zǎoshang bā diǎn chī zǎofàn.\n他 早上 八 点 吃 早饭。",
            "Wǒ wǎnshang bā diǎn chī wǎnfàn.\n我 晚上 八 点 吃 晚饭。"
        ),
        audioToSpeak = "我早上八点吃早饭。"
    ),

    // 7. Soal 7: Pilihan Gambar (休息 -> istirahat)
    Exercise(
        id = "u5_s5_p2_q7",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "休息",
        targetPinyin = "xiūxi",
        targetTranslation = "beristirahat",
        correctAnswer = "beristirahat",
        audioToSpeak = "休息",
        pictureOptions = listOf(
            PictureOption("u5_s5_p2_opt7_1", "beristirahat", "☕", R.drawable.ic_story_timer, true),
            PictureOption("u5_s5_p2_opt7_2", "olahraga", "🏃", R.drawable.ic_dumbbell, false),
            PictureOption("u5_s5_p2_opt7_3", "membaca", "📖", R.drawable.ic_book, false),
            PictureOption("u5_s5_p2_opt7_4", "makan", "🍲", R.drawable.ic_coin, false)
        )
    ),

    // 8. Soal 8: Ketik Pinyin (sarapan -> zǎofàn)
    Exercise(
        id = "u5_s5_p2_q8",
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

    // 9. Soal 9: Susun Kalimat (Grand Evaluasi Aktivitas Harian)
    Exercise(
        id = "u5_s5_p2_q9",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Malam ini kita makan malam bersama.",
        targetHanzi = "今天 晚上 我们 吃 晚饭。",
        targetPinyin = "Jīntiān wǎnshang wǒmen chī wǎnfàn.",
        wordChips = listOf("今天:jīntiān", "晚上:wǎnshang", "我们:wǒmen", "吃:chī", "晚饭:wǎnfàn", "昨天:zuótiān"),
        correctAnswer = "今天,晚上,我们,吃,晚饭",
        audioToSpeak = "今天晚上我们吃晚饭。"
    ),

    // 10. Soal 10: Ketuk Pasangan yang Sesuai (Grand Review Bab 5)
    Exercise(
        id = "u5_s5_p2_q10",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u5_s5_p2_m10_1", "起床", "qǐchuáng", "bangun tidur"),
            MatchPairItem("u5_s5_p2_m10_2", "睡觉", "shuìjiào", "tidur"),
            MatchPairItem("u5_s5_p2_m10_3", "吃早饭", "chī zǎofàn", "sarapan"),
            MatchPairItem("u5_s5_p2_m10_4", "休息一下", "xiūxi yíxià", "istirahat sebentar")
        )
    )
)
