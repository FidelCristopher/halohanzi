package com.example.chineselearning.data.repository

import com.example.chineselearning.R
import com.example.chineselearning.data.model.Exercise
import com.example.chineselearning.data.model.ExerciseType
import com.example.chineselearning.data.model.MatchPairItem
import com.example.chineselearning.data.model.PictureOption

val bab26Stage2Part1Exercises = listOf(
    // 1. Soal 1: Pilihan Gambar (药 -> obat)
    Exercise(
        id = "u26_s2_p1_q1",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "药",
        targetPinyin = "yào",
        targetTranslation = "obat",
        correctAnswer = "obat",
        audioToSpeak = "药",
        pictureOptions = listOf(
            PictureOption("u26_s2_p1_opt1", "obat", "", R.drawable.ic_med_pharmacy_drug, true),
            PictureOption("u26_s2_p1_opt2", "ranjang", "", R.drawable.ic_med_bed_rest, false),
            PictureOption("u26_s2_p1_opt3", "tidur", "", R.drawable.ic_med_rest_sleep, false),
            PictureOption("u26_s2_p1_opt4", "pusing", "", R.drawable.ic_med_headache, false)
        )
    ),

    // 2. Soal 2: Susun Kalimat (Dokter berkata obat ini harus diminum tiga kali sehari.)
    Exercise(
        id = "u26_s2_p1_q2",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Obat ini diminum tiga kali sehari.",
        targetHanzi = "这 种 药 一天 吃 三 次。",
        targetPinyin = "Zhè zhǒng yào yìtiān chī sān cì.",
        wordChips = listOf("这:zhè", "种:zhǒng", "药:yào", "一天:yìtiān", "吃:chī", "三:sān", "次。:cì.", "两:liǎng"),
        correctAnswer = "这,种,药,一天,吃,三,次。",
        audioToSpeak = "这种药一天吃三次。"
    ),

    // 3. Soal 3: Ketuk Pasangan yang Sesuai (Obat & Apotek)
    Exercise(
        id = "u26_s2_p1_q3",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u26_s2_p1_m1", "药", "yào", "obat"),
            MatchPairItem("u26_s2_p1_m2", "药店", "yàodiàn", "apotek / toko obat"),
            MatchPairItem("u26_s2_p1_m3", "吃药", "chī yào", "minum obat"),
            MatchPairItem("u26_s2_p1_m4", "三次", "sān cì", "tiga kali")
        )
    ),

    // 4. Soal 4: Ketik Pinyin (obat -> yào)
    Exercise(
        id = "u26_s2_p1_q4",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "obat",
        sentenceWithBlank = "药 (________)",
        targetHanzi = "药",
        targetPinyin = "yào",
        correctAnswer = "yao",
        keyboardKeys = listOf("y", "a", "o", "e", "i", "u", "b", "d", "g", "h", "j", "l"),
        audioToSpeak = "药"
    ),

    // 5. Soal 5: Mendengar Kalimat (Rule 10: illustrationRes = 0)
    Exercise(
        id = "u26_s2_p1_q5",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Apa yang Anda dengar?",
        targetTranslation = "Di seberang jalan ada sebuah apotek.",
        targetHanzi = "马路 对面 有 一 家 药店。",
        targetPinyin = "Mǎlù duìmiàn yǒu yì jiā yàodiàn.",
        wordChips = listOf("马路:mǎlù", "对面:duìmiàn", "有:yǒu", "一:yì", "家:jiā", "药店。:yàodiàn.", "饭馆:fànguǎn"),
        correctAnswer = "马路,对面,有,一,家,药店。",
        illustrationRes = 0,
        audioToSpeak = "马路对面有一家药店。"
    ),

    // 6. Soal 6: Pilihan Kalimat
    Exercise(
        id = "u26_s2_p1_q6",
        type = ExerciseType.SENTENCE_CHOICE,
        title = "Pilih terjemahan yang benar",
        targetHanzi = "你 吃 药 了 没有？",
        targetPinyin = "Nǐ chī yào le méiyǒu?",
        targetTranslation = "Kamu sudah minum obat belum?",
        correctAnswer = "Nǐ chī yào le méiyǒu?\n你 吃 药 了 没有？",
        options = listOf(
            "Nǐ chī yào le méiyǒu?\n你 吃 药 了 没有？",
            "Nǐ chī fàn le méiyǒu?\n你 吃 饭 了 没有？",
            "Tā chī yào le méiyǒu?\n他 吃 药 了 没有？"
        ),
        audioToSpeak = "你吃药了没有？"
    ),

    // 7. Soal 7: Pilihan Gambar (药店 -> apotek)
    Exercise(
        id = "u26_s2_p1_q7",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "药店",
        targetPinyin = "yàodiàn",
        targetTranslation = "apotek",
        correctAnswer = "apotek",
        audioToSpeak = "药店",
        pictureOptions = listOf(
            PictureOption("u26_s2_p1_opt7_1", "apotek", "", R.drawable.ic_med_pharmacy_drug, true),
            PictureOption("u26_s2_p1_opt7_2", "ranjang", "", R.drawable.ic_med_bed_rest, false),
            PictureOption("u26_s2_p1_opt7_3", "sehat", "", R.drawable.ic_med_comfort_healthy, false),
            PictureOption("u26_s2_p1_opt7_4", "tidur", "", R.drawable.ic_med_rest_sleep, false)
        )
    ),

    // 8. Soal 8: Ketik Pinyin (apotek -> yàodiàn)
    Exercise(
        id = "u26_s2_p1_q8",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "apotek / toko obat",
        sentenceWithBlank = "药店 (________)",
        targetHanzi = "药店",
        targetPinyin = "yàodiàn",
        correctAnswer = "yaodian",
        keyboardKeys = listOf("y", "a", "o", "d", "i", "n", "e", "u", "b", "g", "h", "j"),
        audioToSpeak = "药店"
    ),

    // 9. Soal 9: Susun Kalimat (Saya pergi ke apotek membeli obat.)
    Exercise(
        id = "u26_s2_p1_q9",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Saya ke apotek beli obat.",
        targetHanzi = "我 去 药店 买 药。",
        targetPinyin = "Wǒ qù yàodiàn mǎi yào.",
        wordChips = listOf("我:wǒ", "去:qù", "药店:yàodiàn", "买:mǎi", "药。:yào.", "卖:mài"),
        correctAnswer = "我,去,药店,买,药。",
        audioToSpeak = "我去药店买药。"
    ),

    // 10. Soal 10: Ketuk Pasangan yang Sesuai (Rangkuman Obat & Apotek)
    Exercise(
        id = "u26_s2_p1_m10",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u26_s2_p1_m10_1", "买药", "mǎi yào", "beli obat"),
            MatchPairItem("u26_s2_p1_m10_2", "去药店", "qù yàodiàn", "ke apotek"),
            MatchPairItem("u26_s2_p1_m10_3", "吃完药", "chī wán yào", "selesai minum obat"),
            MatchPairItem("u26_s2_p1_m10_4", "一家药店", "yì jiā yàodiàn", "sebuah apotek")
        )
    )
)

val bab26Stage2Part2Exercises = listOf(
    // 1. Soal 1: Pilihan Gambar (床 -> ranjang / tempat tidur)
    Exercise(
        id = "u26_s2_p2_q1",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "床",
        targetPinyin = "chuáng",
        targetTranslation = "ranjang / tempat tidur",
        correctAnswer = "ranjang / tempat tidur",
        audioToSpeak = "床",
        pictureOptions = listOf(
            PictureOption("u26_s2_p2_opt1", "ranjang", "", R.drawable.ic_med_bed_rest, true),
            PictureOption("u26_s2_p2_opt2", "istirahat", "", R.drawable.ic_med_rest_sleep, false),
            PictureOption("u26_s2_p2_opt3", "obat", "", R.drawable.ic_med_pharmacy_drug, false),
            PictureOption("u26_s2_p2_opt4", "sehat", "", R.drawable.ic_med_comfort_healthy, false)
        )
    ),

    // 2. Soal 2: Susun Kalimat (Pasien sedang beristirahat dengan baik di atas ranjang.)
    Exercise(
        id = "u26_s2_p2_q2",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Pasien istirahat di ranjang.",
        targetHanzi = "病人 在 床 上 休息。",
        targetPinyin = "Bìngrén zài chuáng shang xiūxi.",
        wordChips = listOf("病人:bìngrén", "在:zài", "床:chuáng", "上:shang", "休息。:xiūxi.", "坐:zuò"),
        correctAnswer = "病人,在,床,上,休息。",
        audioToSpeak = "病人在床上休息。"
    ),

    // 3. Soal 3: Ketuk Pasangan yang Sesuai (Ranjang & Istirahat)
    Exercise(
        id = "u26_s2_p2_m3",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u26_s2_p2_m1", "床", "chuáng", "ranjang"),
            MatchPairItem("u26_s2_p2_m2", "休息", "xiūxi", "beristirahat"),
            MatchPairItem("u26_s2_p2_m3", "起床", "qǐchuáng", "bangun tidur"),
            MatchPairItem("u26_s2_p2_m4", "一张床", "yì zhāng chuáng", "sebuah ranjang")
        )
    ),

    // 4. Soal 4: Ketik Pinyin (ranjang -> chuáng)
    Exercise(
        id = "u26_s2_p2_q4",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "ranjang / tempat tidur",
        sentenceWithBlank = "床 (________)",
        targetHanzi = "床",
        targetPinyin = "chuáng",
        correctAnswer = "chuang",
        keyboardKeys = listOf("c", "h", "u", "a", "n", "g", "e", "i", "o", "b", "d", "j"),
        audioToSpeak = "床"
    ),

    // 5. Soal 5: Mendengar Kalimat (Rule 10: illustrationRes = 0)
    Exercise(
        id = "u26_s2_p2_q5",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Apa yang Anda dengar?",
        targetTranslation = "Kamu cepatlah berbaring di atas ranjang istirahat.",
        targetHanzi = "你 快 躺 在 床 上 休息。",
        targetPinyin = "Nǐ kuài tǎng zài chuáng shang xiūxi.",
        wordChips = listOf("你:nǐ", "快:kuài", "躺:tǎng", "在:zài", "床:chuáng", "上:shang", "休息。:xiūxi.", "看书:kànshū"),
        correctAnswer = "你,快,躺,在,床,上,休息。",
        illustrationRes = 0,
        audioToSpeak = "你快躺在床上休息。"
    ),

    // 6. Soal 6: Pilihan Kalimat
    Exercise(
        id = "u26_s2_p2_q6",
        type = ExerciseType.SENTENCE_CHOICE,
        title = "Pilih terjemahan yang benar",
        targetHanzi = "这 张 床 非常 大， 也 很 舒服。",
        targetPinyin = "Zhè zhāng chuáng fēicháng dà, yě hěn shūfu.",
        targetTranslation = "Ranjang ini sangat besar, dan juga sangat nyaman.",
        correctAnswer = "Zhè zhāng chuáng fēicháng dà, yě hěn shūfu.\n这 张 床 非常 大， 也 很 舒服。",
        options = listOf(
            "Zhè zhāng chuáng fēicháng dà, yě hěn shūfu.\n这 张 床 非常 大， 也 很 舒服。",
            "Zhè zhāng chuáng fēicháng xiǎo, bù shūfu.\n这 张 床 非常 小， 不 舒服。",
            "Zhè bǎ yǐzi fēicháng dà, yě hěn shūfu.\n这 把 椅子 非常 大， 也 很 舒服。"
        ),
        audioToSpeak = "这张床非常大，也很舒服。"
    ),

    // 7. Soal 7: Pilihan Gambar (床 -> tempat tidur)
    Exercise(
        id = "u26_s2_p2_q7",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "床",
        targetPinyin = "chuáng",
        targetTranslation = "tempat tidur",
        correctAnswer = "tempat tidur",
        audioToSpeak = "床",
        pictureOptions = listOf(
            PictureOption("u26_s2_p2_opt7_1", "tempat tidur", "", R.drawable.ic_med_bed_rest, true),
            PictureOption("u26_s2_p2_opt7_2", "obat", "", R.drawable.ic_med_pharmacy_drug, false),
            PictureOption("u26_s2_p2_opt7_3", "sehat", "", R.drawable.ic_med_comfort_healthy, false),
            PictureOption("u26_s2_p2_opt7_4", "pusing", "", R.drawable.ic_med_headache, false)
        )
    ),

    // 8. Soal 8: Ketik Pinyin (minum obat -> chīyào)
    Exercise(
        id = "u26_s2_p2_q8",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "minum obat",
        sentenceWithBlank = "吃药 (________)",
        targetHanzi = "吃药",
        targetPinyin = "chīyào",
        correctAnswer = "chiyao",
        keyboardKeys = listOf("c", "h", "i", "y", "a", "o", "e", "u", "b", "d", "g", "j"),
        audioToSpeak = "吃药"
    ),

    // 9. Soal 9: Susun Kalimat (Minum obat lalu tidur di ranjang.)
    Exercise(
        id = "u26_s2_p2_q9",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Minum obat lalu tidur di ranjang.",
        targetHanzi = "吃 了 药 在 床 上 睡。",
        targetPinyin = "Chī le yào zài chuáng shang shuì.",
        wordChips = listOf("吃:chī", "了:le", "药:yào", "在:zài", "床:chuáng", "上:shang", "睡。:shuì.", "玩:wán"),
        correctAnswer = "吃,了,药,在,床,上,睡。",
        audioToSpeak = "吃了药在床上睡。"
    ),

    // 10. Soal 10: Ketuk Pasangan yang Sesuai (Rangkuman Istirahat di Ranjang)
    Exercise(
        id = "u26_s2_p2_m10",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u26_s2_p2_m10_1", "床", "chuáng", "tempat tidur"),
            MatchPairItem("u26_s2_p2_m10_2", "吃药", "chī yào", "minum obat"),
            MatchPairItem("u26_s2_p2_m10_3", "躺在床上", "tǎng zài chuáng shang", "baring di kasur"),
            MatchPairItem("u26_s2_p2_m10_4", "好好休息", "hǎohāo xiūxi", "istirahat nyenyak")
        )
    )
)
