package com.example.chineselearning.data.repository

import com.example.chineselearning.R
import com.example.chineselearning.data.model.Exercise
import com.example.chineselearning.data.model.ExerciseType
import com.example.chineselearning.data.model.MatchPairItem
import com.example.chineselearning.data.model.PictureOption

val bab26Stage5Part1Exercises = listOf(
    // 1. Soal 1: Pilihan Gambar (头疼 -> sakit kepala)
    Exercise(
        id = "u26_s5_p1_q1",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "头疼",
        targetPinyin = "tóuténg",
        targetTranslation = "sakit kepala",
        correctAnswer = "sakit kepala",
        audioToSpeak = "头疼",
        pictureOptions = listOf(
            PictureOption("u26_s5_p1_opt1", "sakit kepala", "", R.drawable.ic_med_headache, true),
            PictureOption("u26_s5_p1_opt2", "obat", "", R.drawable.ic_med_pharmacy_drug, false),
            PictureOption("u26_s5_p1_opt3", "ranjang", "", R.drawable.ic_med_bed_rest, false),
            PictureOption("u26_s5_p1_opt4", "sehat", "", R.drawable.ic_med_comfort_healthy, false)
        )
    ),

    // 2. Soal 2: Susun Kalimat (Saya sakit kepala pergi ke apotek membeli obat.)
    Exercise(
        id = "u26_s5_p1_q2",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Saya pusing ke apotek beli obat.",
        targetHanzi = "我 头疼 去 药店 买 药。",
        targetPinyin = "Wǒ tóuténg qù yàodiàn mǎi yào.",
        wordChips = listOf("我:wǒ", "头疼:tóuténg", "去:qù", "药店:yàodiàn", "买:mǎi", "药。:yào.", "医院:yīyuàn"),
        correctAnswer = "我,头疼,去,药店,买,药。",
        audioToSpeak = "我头疼去药店买药。"
    ),

    // 3. Soal 3: Ketuk Pasangan yang Sesuai (Sintesis Apotek & Sakit)
    Exercise(
        id = "u26_s5_p1_m3",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u26_s5_p1_m1", "头疼", "tóuténg", "pusing"),
            MatchPairItem("u26_s5_p1_m2", "药店", "yàodiàn", "apotek"),
            MatchPairItem("u26_s5_p1_m3", "买药", "mǎi yào", "beli obat"),
            MatchPairItem("u26_s5_p1_m4", "吃药", "chī yào", "minum obat")
        )
    ),

    // 4. Soal 4: Ketik Pinyin (apotek -> yàodiàn)
    Exercise(
        id = "u26_s5_p1_q4",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "apotek",
        sentenceWithBlank = "药店 (________)",
        targetHanzi = "药店",
        targetPinyin = "yàodiàn",
        correctAnswer = "yaodian",
        keyboardKeys = listOf("y", "a", "o", "d", "i", "n", "e", "u", "b", "g", "h", "j"),
        audioToSpeak = "药店"
    ),

    // 5. Soal 5: Mendengar Kalimat (Rule 10: illustrationRes = 0)
    Exercise(
        id = "u26_s5_p1_q5",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Apa yang Anda dengar?",
        targetTranslation = "Minum obat ini badan akan merasa nyaman.",
        targetHanzi = "吃 了 药 身体 很 舒服。",
        targetPinyin = "Chī le yào shēntǐ hěn shūfu.",
        wordChips = listOf("吃:chī", "了:le", "药:yào", "身体:shēntǐ", "很:hěn", "舒服。:shūfu.", "累:lèi"),
        correctAnswer = "吃,了,药,身体,很,舒服。",
        illustrationRes = 0,
        audioToSpeak = "吃了药身体很舒服。"
    ),

    // 6. Soal 6: Pilihan Kalimat
    Exercise(
        id = "u26_s5_p1_q6",
        type = ExerciseType.SENTENCE_CHOICE,
        title = "Pilih terjemahan yang benar",
        targetHanzi = "请 你 帮 我 倒 一 杯 热水。",
        targetPinyin = "Qǐng nǐ bāng wǒ dào yì bēi rèshuǐ.",
        targetTranslation = "Tolong bantu saya tuangkan segelas air hangat.",
        correctAnswer = "Qǐng nǐ bāng wǒ dào yì bēi rèshuǐ.\n请 你 帮 我 倒 一 杯 热水。",
        options = listOf(
            "Qǐng nǐ bāng wǒ dào yì bēi rèshuǐ.\n请 你 帮 我 倒 一 杯 热水。",
            "Qǐng nǐ bāng wǒ dào yì bēi lěngshuǐ.\n请 你 帮 我 倒 一 杯 冷水。",
            "Tā bāng wǒ dào yì bēi rèshuǐ.\n他 帮 我 倒 一 杯 热水。"
        ),
        audioToSpeak = "请你帮我倒一杯热水。"
    ),

    // 7. Soal 7: Pilihan Gambar (药 -> obat tablet kapsul)
    Exercise(
        id = "u26_s5_p1_q7",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "药",
        targetPinyin = "yào",
        targetTranslation = "obat",
        correctAnswer = "obat",
        audioToSpeak = "药",
        pictureOptions = listOf(
            PictureOption("u26_s5_p1_opt7_1", "obat", "", R.drawable.ic_med_pharmacy_drug, true),
            PictureOption("u26_s5_p1_opt7_2", "ranjang", "", R.drawable.ic_med_bed_rest, false),
            PictureOption("u26_s5_p1_opt7_3", "sehat", "", R.drawable.ic_med_comfort_healthy, false),
            PictureOption("u26_s5_p1_opt7_4", "tidur", "", R.drawable.ic_med_rest_sleep, false)
        )
    ),

    // 8. Soal 8: Ketik Pinyin (sakit kepala -> tóuténg)
    Exercise(
        id = "u26_s5_p1_q8",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "sakit kepala",
        sentenceWithBlank = "头疼 (________)",
        targetHanzi = "头疼",
        targetPinyin = "tóuténg",
        correctAnswer = "touteng",
        keyboardKeys = listOf("t", "o", "u", "e", "n", "g", "a", "i", "b", "d", "h", "j"),
        audioToSpeak = "头疼"
    ),

    // 9. Soal 9: Susun Kalimat (Ibu menyuruh saya minum obat tepat waktu.)
    Exercise(
        id = "u26_s5_p1_q9",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Ibu suruh saya minum obat.",
        targetHanzi = "妈妈 叫 我 吃 药。",
        targetPinyin = "Māma jiào wǒ chī yào.",
        wordChips = listOf("妈妈:māma", "叫:jiào", "我:wǒ", "吃:chī", "药。:yào.", "饭:fàn"),
        correctAnswer = "妈妈,叫,我,吃,药。",
        audioToSpeak = "妈妈叫我吃药。"
    ),

    // 10. Soal 10: Ketuk Pasangan yang Sesuai (Rangkuman Sintesis 1)
    Exercise(
        id = "u26_s5_p1_m10",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u26_s5_p1_m10_1", "吃药", "chī yào", "minum obat"),
            MatchPairItem("u26_s5_p1_m10_2", "喝热水", "hē rèshuǐ", "minum air panas"),
            MatchPairItem("u26_s5_p1_m10_3", "身体舒服", "shēntǐ shūfu", "badan enak"),
            MatchPairItem("u26_s5_p1_m10_4", "去药店", "qù yàodiàn", "pergi apotek")
        )
    )
)

val bab26Stage5Part2Exercises = listOf(
    // 1. Soal 1: Pilihan Gambar (床 -> ranjang istirahat pemulihan)
    Exercise(
        id = "u26_s5_p2_q1",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "床",
        targetPinyin = "chuáng",
        targetTranslation = "ranjang",
        correctAnswer = "ranjang",
        audioToSpeak = "床",
        pictureOptions = listOf(
            PictureOption("u26_s5_p2_opt1", "ranjang", "", R.drawable.ic_med_bed_rest, true),
            PictureOption("u26_s5_p2_opt2", "obat", "", R.drawable.ic_med_pharmacy_drug, false),
            PictureOption("u26_s5_p2_opt3", "sehat", "", R.drawable.ic_med_comfort_healthy, false),
            PictureOption("u26_s5_p2_opt4", "istirahat", "", R.drawable.ic_med_rest_sleep, false)
        )
    ),

    // 2. Soal 2: Susun Kalimat (Saya berbaring di atas ranjang istirahat satu hari.)
    Exercise(
        id = "u26_s5_p2_q2",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Saya istirahat di ranjang seharian.",
        targetHanzi = "我 在 床 上 休息 一天。",
        targetPinyin = "Wǒ zài chuáng shang xiūxi yìtiān.",
        wordChips = listOf("我:wǒ", "在:zài", "床:chuáng", "上:shang", "休息:xiūxi", "一天。:yìtiān.", "跑:pǎo"),
        correctAnswer = "我,在,床,上,休息,一天。",
        audioToSpeak = "我在床上休息一天。"
    ),

    // 3. Soal 3: Ketuk Pasangan yang Sesuai (Grand Sintesis Bab 26)
    Exercise(
        id = "u26_s5_p2_m3",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u26_s5_p2_m1", "头疼", "tóuténg", "pusing"),
            MatchPairItem("u26_s5_p2_m2", "舒服", "shūfu", "nyaman"),
            MatchPairItem("u26_s5_p2_m3", "药店", "yàodiàn", "apotek"),
            MatchPairItem("u26_s5_p2_m4", "希望", "xīwàng", "berharap")
        )
    ),

    // 4. Soal 4: Ketik Pinyin (nyaman -> shūfu)
    Exercise(
        id = "u26_s5_p2_q4",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "nyaman / enak badan",
        sentenceWithBlank = "舒服 (________)",
        targetHanzi = "舒服",
        targetPinyin = "shūfu",
        correctAnswer = "shufu",
        keyboardKeys = listOf("s", "h", "u", "f", "a", "e", "i", "o", "b", "d", "g", "j"),
        audioToSpeak = "舒服"
    ),

    // 5. Soal 5: Mendengar Kalimat (Rule 10: illustrationRes = 0)
    Exercise(
        id = "u26_s5_p2_q5",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Apa yang Anda dengar?",
        targetTranslation = "Semoga kamu lekas sembuh membaik!",
        targetHanzi = "希望 你 快点 好起来！",
        targetPinyin = "Xīwàng nǐ kuàidiǎn hǎoqǐlai!",
        wordChips = listOf("希望:xīwàng", "你:nǐ", "快点:kuàidiǎn", "好起来！:hǎoqǐlai!", "生病:shēngbìng"),
        correctAnswer = "希望,你,快点,好起来！",
        illustrationRes = 0,
        audioToSpeak = "希望你快点好起来！"
    ),

    // 6. Soal 6: Pilihan Kalimat
    Exercise(
        id = "u26_s5_p2_q6",
        type = ExerciseType.SENTENCE_CHOICE,
        title = "Pilih terjemahan yang benar",
        targetHanzi = "他 帮 我 去 药店 买 了 药。",
        targetPinyin = "Tā bāng wǒ qù yàodiàn mǎi le yào.",
        targetTranslation = "Dia membantu saya pergi ke apotek membeli obat.",
        correctAnswer = "Tā bāng wǒ qù yàodiàn mǎi le yào.\n他 帮 我 去 药店 买 了 药。",
        options = listOf(
            "Tā bāng wǒ qù yàodiàn mǎi le yào.\n他 帮 我 去 药店 买 了 药。",
            "Wǒ bāng tā qù yàodiàn mǎi le yào.\n我 帮 他 去 药店 买 了 药。",
            "Tā bāng wǒ qù fànguǎn mǎi le cài.\n他 帮 我 去 饭馆 买 了 菜。"
        ),
        audioToSpeak = "他帮我去药店买了药。"
    ),

    // 7. Soal 7: Pilihan Gambar (希望康复 -> semoga sembuh)
    Exercise(
        id = "u26_s5_p2_q7",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "希望",
        targetPinyin = "xīwàng",
        targetTranslation = "harapan sembuh",
        correctAnswer = "harapan sembuh",
        audioToSpeak = "希望",
        pictureOptions = listOf(
            PictureOption("u26_s5_p2_opt7_1", "sehat", "", R.drawable.ic_med_comfort_healthy, true),
            PictureOption("u26_s5_p2_opt7_2", "obat", "", R.drawable.ic_med_pharmacy_drug, false),
            PictureOption("u26_s5_p2_opt7_3", "pusing", "", R.drawable.ic_med_headache, false),
            PictureOption("u26_s5_p2_opt7_4", "ranjang", "", R.drawable.ic_med_bed_rest, false)
        )
    ),

    // 8. Soal 8: Ketik Pinyin (berharap/semoga -> xīwàng)
    Exercise(
        id = "u26_s5_p2_q8",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "berharap / semoga",
        sentenceWithBlank = "希望 (________)",
        targetHanzi = "希望",
        targetPinyin = "xīwàng",
        correctAnswer = "xiwang",
        keyboardKeys = listOf("x", "i", "w", "a", "n", "g", "e", "o", "u", "b", "d", "h"),
        audioToSpeak = "希望"
    ),

    // 9. Soal 9: Susun Kalimat (Dokter memberitahu saya harus banyak minum air hangat.)
    Exercise(
        id = "u26_s5_p2_q9",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Dokter menyuruh saya banyak minum air hangat.",
        targetHanzi = "医生 叫 我 多 喝 热水。",
        targetPinyin = "Yīshēng jiào wǒ duō hē rèshuǐ.",
        wordChips = listOf("医生:yīshēng", "叫:jiào", "我:wǒ", "多:duō", "喝:hē", "热水。:rèshuǐ.", "冰水:bīngshuǐ"),
        correctAnswer = "医生,叫,我,多,喝,热水。",
        audioToSpeak = "医生叫我多喝热水。"
    ),

    // 10. Soal 10: Ketuk Pasangan yang Sesuai (Grand Review Final Bab 26)
    Exercise(
        id = "u26_s5_p2_m10",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u26_s5_p2_m10_1", "多喝热水", "duō hē rèshuǐ", "banyak minum air"),
            MatchPairItem("u26_s5_p2_m10_2", "快点好", "kuàidiǎn hǎo", "lekas sembuh"),
            MatchPairItem("u26_s5_p2_m10_3", "躺在床上", "tǎng zài chuáng shang", "baring di kasur"),
            MatchPairItem("u26_s5_p2_m10_4", "帮大忙", "bāng dàmáng", "bantuan besar")
        )
    )
)
