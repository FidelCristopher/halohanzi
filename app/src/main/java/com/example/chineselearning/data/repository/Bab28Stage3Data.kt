package com.example.chineselearning.data.repository

import com.example.chineselearning.R
import com.example.chineselearning.data.model.Exercise
import com.example.chineselearning.data.model.ExerciseType
import com.example.chineselearning.data.model.MatchPairItem
import com.example.chineselearning.data.model.PictureOption

val bab28Stage3Part1Exercises = listOf(
    // 1. Soal 1: Pilihan Gambar (这么 -> sebegitu / begini)
    Exercise(
        id = "u28_s3_p1_q1",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "这么",
        targetPinyin = "zhème",
        targetTranslation = "sebegitu / begini",
        correctAnswer = "sebegitu / begini",
        audioToSpeak = "这么",
        pictureOptions = listOf(
            PictureOption("u28_s3_p1_opt1", "sebegini", "", R.drawable.ic_gram_manner_so_much, true),
            PictureOption("u28_s3_p1_opt2", "waktu", "", R.drawable.ic_gram_timeline_future, false),
            PictureOption("u28_s3_p1_opt3", "skala", "", R.drawable.ic_gram_compare_scale, false),
            PictureOption("u28_s3_p1_opt4", "podium", "", R.drawable.ic_gram_superlative_podium, false)
        )
    ),

    // 2. Soal 2: Susun Kalimat (Pakaian ini bagaimana bisa semurah ini?)
    Exercise(
        id = "u28_s3_p1_q2",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Baju ini kenapa begitu murah?",
        targetHanzi = "这件 衣服 怎么 这么 便宜？",
        targetPinyin = "Zhè jiàn yīfu zěnme zhème piányi?",
        wordChips = listOf("这件:zhè jiàn", "衣服:yīfu", "怎么:zěnme", "这么:zhème", "便宜？:piányi.", "贵:guì"),
        correctAnswer = "这件,衣服,怎么,这么,便宜？",
        audioToSpeak = "这件衣服怎么这么便宜？"
    ),

    // 3. Soal 3: Ketuk Pasangan yang Sesuai (Sebegini & Begini)
    Exercise(
        id = "u28_s3_p1_q3",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u28_s3_p1_m1", "这么", "zhème", "sebegini / begitu"),
            MatchPairItem("u28_s3_p1_m2", "这样", "zhèyàng", "seperti ini / begini"),
            MatchPairItem("u28_s3_p1_m3", "这么好", "zhème hǎo", "sebegitu baik"),
            MatchPairItem("u28_s3_p1_m4", "这样做", "zhèyàng zuò", "berbuat begini")
        )
    ),

    // 4. Soal 4: Ketik Pinyin (sebegini -> zhème)
    Exercise(
        id = "u28_s3_p1_q4",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "sebegini / begini",
        sentenceWithBlank = "这么 (________)",
        targetHanzi = "这么",
        targetPinyin = "zhème",
        correctAnswer = "zheme",
        keyboardKeys = listOf("z", "h", "e", "m", "a", "i", "o", "u", "b", "d", "g", "j"),
        audioToSpeak = "这么"
    ),

    // 5. Soal 5: Mendengar Kalimat (Rule 10: illustrationRes = 0)
    Exercise(
        id = "u28_s3_p1_q5",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Apa yang Anda dengar?",
        targetTranslation = "Melakukan dengan cara begini baru tepat.",
        targetHanzi = "这样 做 才能 学好 汉语。",
        targetPinyin = "Zhèyàng zuò cáinéng xuéhǎo Hànyǔ.",
        wordChips = listOf("这样:zhèyàng", "做:zuò", "才能:cáinéng", "学好:xuéhǎo", "汉语。:Hànyǔ.", "那样:nàyàng"),
        correctAnswer = "这样,做,才能,学好,汉语。",
        illustrationRes = 0,
        audioToSpeak = "这样做才能学好汉语。"
    ),

    // 6. Soal 6: Pilihan Kalimat
    Exercise(
        id = "u28_s3_p1_q6",
        type = ExerciseType.SENTENCE_CHOICE,
        title = "Pilih terjemahan yang benar",
        targetHanzi = "你怎么 走 得 这么 慢？",
        targetPinyin = "Nǐ zěnme zǒu de zhème màn?",
        targetTranslation = "Kenapa kamu berjalan begitu lambat?",
        correctAnswer = "Nǐ zěnme zǒu de zhème màn?\n你怎么 走 得 这么 慢？",
        options = listOf(
            "Nǐ zěnme zǒu de zhème màn?\n你怎么 走 得 这么 慢？",
            "Nǐ zěnme zǒu de zhème kuài?\n你怎么 走 得 这么 快？",
            "Tā zěnme zǒu de zhème màn?\n他 怎么 走 得 这么 慢？"
        ),
        audioToSpeak = "你怎么走得这么慢？"
    ),

    // 7. Soal 7: Pilihan Gambar (这样 -> cara seperti ini)
    Exercise(
        id = "u28_s3_p1_q7",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "这样",
        targetPinyin = "zhèyàng",
        targetTranslation = "seperti ini",
        correctAnswer = "seperti ini",
        audioToSpeak = "这样",
        pictureOptions = listOf(
            PictureOption("u28_s3_p1_opt7_1", "seperti ini", "", R.drawable.ic_gram_manner_running, true),
            PictureOption("u28_s3_p1_opt7_2", "begitu banyak", "", R.drawable.ic_gram_manner_so_much, false),
            PictureOption("u28_s3_p1_opt7_3", "kecepatan", "", R.drawable.ic_gram_degree_speedometer, false),
            PictureOption("u28_s3_p1_opt7_4", "waktu", "", R.drawable.ic_gram_timeline_future, false)
        )
    ),

    // 8. Soal 8: Ketik Pinyin (seperti ini -> zhèyàng)
    Exercise(
        id = "u28_s3_p1_q8",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "seperti ini / begini",
        sentenceWithBlank = "这样 (________)",
        targetHanzi = "这样",
        targetPinyin = "zhèyàng",
        correctAnswer = "zheyang",
        keyboardKeys = listOf("z", "h", "e", "y", "a", "n", "g", "i", "o", "u", "b", "d"),
        audioToSpeak = "这样"
    ),

    // 9. Soal 9: Susun Kalimat (Kenapa kamu begitu bahagia hari ini?)
    Exercise(
        id = "u28_s3_p1_q9",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Kamu kenapa begitu bahagia?",
        targetHanzi = "你 怎么 这么 高兴？",
        targetPinyin = "Nǐ zěnme zhème gāoxìng?",
        wordChips = listOf("你:nǐ", "怎么:zěnme", "这么:zhème", "高兴？:gāoxìng.", "累:lèi"),
        correctAnswer = "你,怎么,这么,高兴？",
        audioToSpeak = "你怎么这么高兴？"
    ),

    // 10. Soal 10: Ketuk Pasangan yang Sesuai (Rangkuman Cara Ini)
    Exercise(
        id = "u28_s3_p1_m10",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u28_s3_p1_m10_1", "这么", "zhème", "sebegini"),
            MatchPairItem("u28_s3_p1_m10_2", "这样", "zhèyàng", "seperti ini"),
            MatchPairItem("u28_s3_p1_m10_3", "这么快", "zhème kuài", "secepat ini"),
            MatchPairItem("u28_s3_p1_m10_4", "这样说", "zhèyàng shuō", "bicara begini")
        )
    )
)

val bab28Stage3Part2Exercises = listOf(
    // 1. Soal 1: Pilihan Gambar (那么 -> sebegitu / kalau begitu)
    Exercise(
        id = "u28_s3_p2_q1",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "那么",
        targetPinyin = "nàme",
        targetTranslation = "sebegitu / kalau begitu",
        correctAnswer = "sebegitu / kalau begitu",
        audioToSpeak = "那么",
        pictureOptions = listOf(
            PictureOption("u28_s3_p2_opt1", "sebegitu", "", R.drawable.ic_gram_manner_so_much, true),
            PictureOption("u28_s3_p2_opt2", "waktu", "", R.drawable.ic_gram_timeline_future, false),
            PictureOption("u28_s3_p2_opt3", "kecepatan", "", R.drawable.ic_gram_degree_speedometer, false),
            PictureOption("u28_s3_p2_opt4", "skala", "", R.drawable.ic_gram_compare_scale, false)
        )
    ),

    // 2. Soal 2: Susun Kalimat (Cuaca sebegini bagus, mari kita ke taman jalan santai.)
    Exercise(
        id = "u28_s3_p2_q2",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Cuaca begitu bagus, ayo ke taman.",
        targetHanzi = "天气 那么 好， 去 公园 吧。",
        targetPinyin = "Tiānqì nàme hǎo, qù gōngyuán ba.",
        wordChips = listOf("天气:tiānqì", "那么:nàme", "好，:hǎo,", "去:qù", "公园:gōngyuán", "吧。:ba.", "家里:jiālǐ"),
        correctAnswer = "天气,那么,好，,去,公园,吧。",
        audioToSpeak = "天气那么好，去公园吧。"
    ),

    // 3. Soal 3: Ketuk Pasangan yang Sesuai (Sebegitu & Begitu)
    Exercise(
        id = "u28_s3_p2_m3",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u28_s3_p2_m1", "那么", "nàme", "sebegitu / begitu"),
            MatchPairItem("u28_s3_p2_m2", "那样", "nàyàng", "seperti itu"),
            MatchPairItem("u28_s3_p2_m3", "那么好", "nàme hǎo", "sebegitu baik"),
            MatchPairItem("u28_s3_p2_m4", "那样做", "nàyàng zuò", "berbuat begitu")
        )
    ),

    // 4. Soal 4: Ketik Pinyin (sebegitu -> nàme)
    Exercise(
        id = "u28_s3_p2_q4",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "sebegitu / kalau begitu",
        sentenceWithBlank = "那么 (________)",
        targetHanzi = "那么",
        targetPinyin = "nàme",
        correctAnswer = "name",
        keyboardKeys = listOf("n", "a", "m", "e", "i", "o", "u", "b", "d", "g", "h", "j"),
        audioToSpeak = "那么"
    ),

    // 5. Soal 5: Mendengar Kalimat (Rule 10: illustrationRes = 0)
    Exercise(
        id = "u28_s3_p2_q5",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Apa yang Anda dengar?",
        targetTranslation = "Anda tidak usah berbuat seperti itu.",
        targetHanzi = "你 不 用 那样 做。",
        targetPinyin = "Nǐ bú yòng nàyàng zuò.",
        wordChips = listOf("你:nǐ", "不:bú", "用:yòng", "那样:nàyàng", "做。:zuò.", "想:xiǎng"),
        correctAnswer = "你,不,用,那样,做。",
        illustrationRes = 0,
        audioToSpeak = "你不用那样做。"
    ),

    // 6. Soal 6: Pilihan Kalimat
    Exercise(
        id = "u28_s3_p2_q6",
        type = ExerciseType.SENTENCE_CHOICE,
        title = "Pilih terjemahan yang benar",
        targetHanzi = "那 里 为什么 那么 多 人？",
        targetPinyin = "Nàlǐ wèishénme nàme duō rén?",
        targetTranslation = "Mengapa di sana ada begitu banyak orang?",
        correctAnswer = "Nàlǐ wèishénme nàme duō rén?\n那 里 为什么 那么 多 人？",
        options = listOf(
            "Nàlǐ wèishénme nàme duō rén?\n那 里 为什么 那么 多 人？",
            "Zhèlǐ wèishénme zhème duō rén?\n这里 为什么 这么 多 人？",
            "Nàlǐ wèishénme méiyǒu rén?\n那 里 为什么 没有 人？"
        ),
        audioToSpeak = "那里为什么那么多人？"
    ),

    // 7. Soal 7: Pilihan Gambar (那样 -> seperti itu)
    Exercise(
        id = "u28_s3_p2_q7",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "那样",
        targetPinyin = "nàyàng",
        targetTranslation = "seperti itu",
        correctAnswer = "seperti itu",
        audioToSpeak = "那样",
        pictureOptions = listOf(
            PictureOption("u28_s3_p2_opt7_1", "seperti itu", "", R.drawable.ic_gram_manner_running, true),
            PictureOption("u28_s3_p2_opt7_2", "begitu banyak", "", R.drawable.ic_gram_manner_so_much, false),
            PictureOption("u28_s3_p2_opt7_3", "derajat", "", R.drawable.ic_gram_degree_speedometer, false),
            PictureOption("u28_s3_p2_opt7_4", "waktu", "", R.drawable.ic_gram_timeline_future, false)
        )
    ),

    // 8. Soal 8: Ketik Pinyin (seperti itu -> nàyàng)
    Exercise(
        id = "u28_s3_p2_q8",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "seperti itu / begitu",
        sentenceWithBlank = "那样 (________)",
        targetHanzi = "那样",
        targetPinyin = "nàyàng",
        correctAnswer = "nayang",
        keyboardKeys = listOf("n", "a", "y", "g", "e", "i", "o", "u", "b", "d", "h", "j"),
        audioToSpeak = "那样"
    ),

    // 9. Soal 9: Susun Kalimat (Kalau begitu kita berangkat sekarang.)
    Exercise(
        id = "u28_s3_p2_q9",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Kalau begitu kita sekarang jalan.",
        targetHanzi = "那么 我们 现在 走 吧。",
        targetPinyin = "Nàme wǒmen xiànzài zǒu ba.",
        wordChips = listOf("那么:nàme", "我们:wǒmen", "现在:xiànzài", "走:zǒu", "吧。:ba.", "等:děng"),
        correctAnswer = "那么,我们,现在,走,吧。",
        audioToSpeak = "那么我们现在走吧。"
    ),

    // 10. Soal 10: Ketuk Pasangan yang Sesuai (Rangkuman Derajat Jauh)
    Exercise(
        id = "u28_s3_p2_m10",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u28_s3_p2_m10_1", "那么", "nàme", "sebegitu"),
            MatchPairItem("u28_s3_p2_m10_2", "那样", "nàyàng", "seperti itu"),
            MatchPairItem("u28_s3_p2_m10_3", "那么远", "nàme yuǎn", "sebegitu jauh"),
            MatchPairItem("u28_s3_p2_m10_4", "那样想", "nàyàng xiǎng", "berpikir begitu")
        )
    )
)
