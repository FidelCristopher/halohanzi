package com.example.chineselearning.data.repository

import com.example.chineselearning.R
import com.example.chineselearning.data.model.Exercise
import com.example.chineselearning.data.model.ExerciseType
import com.example.chineselearning.data.model.MatchPairItem
import com.example.chineselearning.data.model.PictureOption

val bab26Stage4Part1Exercises = listOf(
    // 1. Soal 1: Pilihan Gambar (告诉 -> memberitahu / mengabari)
    Exercise(
        id = "u26_s4_p1_q1",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "告诉",
        targetPinyin = "gàosu",
        targetTranslation = "memberitahu / mengabari",
        correctAnswer = "memberitahu / mengabari",
        audioToSpeak = "告诉",
        pictureOptions = listOf(
            PictureOption("u26_s4_p1_opt1", "memberitahu", "", R.drawable.ic_med_comfort_healthy, true),
            PictureOption("u26_s4_p1_opt2", "sakit", "", R.drawable.ic_med_headache, false),
            PictureOption("u26_s4_p1_opt3", "obat", "", R.drawable.ic_med_pharmacy_drug, false),
            PictureOption("u26_s4_p1_opt4", "ranjang", "", R.drawable.ic_med_bed_rest, false)
        )
    ),

    // 2. Soal 2: Susun Kalimat (Tolong beritahukan dokter saya sakit kepala.)
    Exercise(
        id = "u26_s4_p1_q2",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Tolong beritahu dokter saya pusing.",
        targetHanzi = "请 告诉 医生 我 头疼。",
        targetPinyin = "Qǐng gàosu yīshēng wǒ tóuténg.",
        wordChips = listOf("请:qǐng", "告诉:gàosu", "医生:yīshēng", "我:wǒ", "头疼。:tóuténg.", "脚疼:jiǎoténg"),
        correctAnswer = "请,告诉,医生,我,头疼。",
        audioToSpeak = "请告诉医生我头疼。"
    ),

    // 3. Soal 3: Ketuk Pasangan yang Sesuai (Mengabari & Berharap)
    Exercise(
        id = "u26_s4_p1_q3",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u26_s4_p1_m1", "告诉", "gàosu", "memberitahu"),
            MatchPairItem("u26_s4_p1_m2", "希望", "xīwàng", "berharap / semoga"),
            MatchPairItem("u26_s4_p1_m3", "早日康复", "zǎorì kāngfù", "lekas sembuh"),
            MatchPairItem("u26_s4_p1_m4", "好起来", "hǎo qǐlai", "membaik sembuh")
        )
    ),

    // 4. Soal 4: Ketik Pinyin (memberitahu -> gàosu)
    Exercise(
        id = "u26_s4_p1_q4",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "memberitahu / mengabarkan",
        sentenceWithBlank = "告诉 (________)",
        targetHanzi = "告诉",
        targetPinyin = "gàosu",
        correctAnswer = "gaosu",
        keyboardKeys = listOf("g", "a", "o", "s", "u", "e", "i", "b", "d", "h", "j", "l"),
        audioToSpeak = "告诉"
    ),

    // 5. Soal 5: Mendengar Kalimat (Rule 10: illustrationRes = 0)
    Exercise(
        id = "u26_s4_p1_q5",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Apa yang Anda dengar?",
        targetTranslation = "Saya berharap kamu bisa segera sembuh membaik.",
        targetHanzi = "我 希望 你 快点 好起来。",
        targetPinyin = "Wǒ xīwàng nǐ kuàidiǎn hǎoqǐlai.",
        wordChips = listOf("我:wǒ", "希望:xīwàng", "你:nǐ", "快点:kuàidiǎn", "好起来。:hǎoqǐlai.", "慢:màn"),
        correctAnswer = "我,希望,你,快点,好起来。",
        illustrationRes = 0,
        audioToSpeak = "我希望你快点好起来。"
    ),

    // 6. Soal 6: Pilihan Kalimat
    Exercise(
        id = "u26_s4_p1_q6",
        type = ExerciseType.SENTENCE_CHOICE,
        title = "Pilih terjemahan yang benar",
        targetHanzi = "请 把 这 件 事 告诉 老师。",
        targetPinyin = "Qǐng bǎ zhè jiàn shì gàosu lǎoshī.",
        targetTranslation = "Tolong beritahukan hal ini kepada guru.",
        correctAnswer = "Qǐng bǎ zhè jiàn shì gàosu lǎoshī.\n请 把 这 件 事 告诉 老师。",
        options = listOf(
            "Qǐng bǎ zhè jiàn shì gàosu lǎoshī.\n请 把 这 件 事 告诉 老师。",
            "Qǐng bǎ zhè jiàn shì gàosu yīshēng.\n请 把 这 件 事 告诉 医生。",
            "Qǐng bǎ zhè běn shū sòng gěi lǎoshī.\n请 把 这 本 书 送 给 老师。"
        ),
        audioToSpeak = "请把这件事告诉老师。"
    ),

    // 7. Soal 7: Pilihan Gambar (希望 -> berharap semoga)
    Exercise(
        id = "u26_s4_p1_q7",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "希望",
        targetPinyin = "xīwàng",
        targetTranslation = "berharap / semoga",
        correctAnswer = "berharap / semoga",
        audioToSpeak = "希望",
        pictureOptions = listOf(
            PictureOption("u26_s4_p1_opt7_1", "harapan sembuh", "", R.drawable.ic_med_comfort_healthy, true),
            PictureOption("u26_s4_p1_opt7_2", "demam", "", R.drawable.ic_med_thermometer_fever, false),
            PictureOption("u26_s4_p1_opt7_3", "pusing", "", R.drawable.ic_med_headache, false),
            PictureOption("u26_s4_p1_opt7_4", "istirahat", "", R.drawable.ic_med_rest_sleep, false)
        )
    ),

    // 8. Soal 8: Ketik Pinyin (berharap/semoga -> xīwàng)
    Exercise(
        id = "u26_s4_p1_q8",
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

    // 9. Soal 9: Susun Kalimat (Semoga semua orang sehat selalu.)
    Exercise(
        id = "u26_s4_p1_q9",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Semoga semua orang sehat.",
        targetHanzi = "希望 大家 身体 健康。",
        targetPinyin = "Xīwàng dàjiā shēntǐ jiànkāng.",
        wordChips = listOf("希望:xīwàng", "大家:dàjiā", "身体:shēntǐ", "健康。:jiànkāng.", "生病:shēngbìng"),
        correctAnswer = "希望,大家,身体,健康。",
        audioToSpeak = "希望大家身体健康。"
    ),

    // 10. Soal 10: Ketuk Pasangan yang Sesuai (Rangkuman Doa Kesembuhan)
    Exercise(
        id = "u26_s4_p1_m10",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u26_s4_p1_m10_1", "希望", "xīwàng", "semoga"),
            MatchPairItem("u26_s4_p1_m10_2", "告诉", "gàosu", "memberitahu"),
            MatchPairItem("u26_s4_p1_m3", "身体健康", "shēntǐ jiànkāng", "badan sehat"),
            MatchPairItem("u26_s4_p1_m4", "快点好", "kuàidiǎn hǎo", "lekas baik")
        )
    )
)

val bab26Stage4Part2Exercises = listOf(
    // 1. Soal 1: Pilihan Gambar (好起来 -> membaik / sembuh)
    Exercise(
        id = "u26_s4_p2_q1",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "好起来",
        targetPinyin = "hǎo qǐlai",
        targetTranslation = "sembuh membaik",
        correctAnswer = "sembuh membaik",
        audioToSpeak = "好起来",
        pictureOptions = listOf(
            PictureOption("u26_s4_p2_opt1", "sembuh", "", R.drawable.ic_med_comfort_healthy, true),
            PictureOption("u26_s4_p2_opt2", "demam", "", R.drawable.ic_med_thermometer_fever, false),
            PictureOption("u26_s4_p2_opt3", "pusing", "", R.drawable.ic_med_headache, false),
            PictureOption("u26_s4_p2_opt4", "ranjang", "", R.drawable.ic_med_bed_rest, false)
        )
    ),

    // 2. Soal 2: Susun Kalimat (Penyakitnya sudah sembuh membaik.)
    Exercise(
        id = "u26_s4_p2_q2",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Penyakitnya sudah sembuh.",
        targetHanzi = "他 的 病 好 了。",
        targetPinyin = "Tā de bìng hǎo le.",
        wordChips = listOf("他:tā", "的:de", "病:bìng", "好:hǎo", "了。:le.", "坏:huài"),
        correctAnswer = "他,的,病,好,了。",
        audioToSpeak = "他的病好了。"
    ),

    // 3. Soal 3: Ketuk Pasangan yang Sesuai (Pemulihan & Sehat)
    Exercise(
        id = "u26_s4_p2_m3",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u26_s4_p2_m1", "好起来", "hǎo qǐlai", "sembuh pulih"),
            MatchPairItem("u26_s4_p2_m2", "病好了", "bìng hǎo le", "penyakit sembuh"),
            MatchPairItem("u26_s4_p2_m3", "快点", "kuàidiǎn", "segera / lekas"),
            MatchPairItem("u26_s4_p2_m4", "心情好", "xīnqíng hǎo", "hati senang")
        )
    ),

    // 4. Soal 4: Ketik Pinyin (lekas / cepat sedikit -> kuàidiǎn)
    Exercise(
        id = "u26_s4_p2_q4",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "segera / lekas",
        sentenceWithBlank = "快点 (________)",
        targetHanzi = "快点",
        targetPinyin = "kuàidiǎn",
        correctAnswer = "kuaidian",
        keyboardKeys = listOf("k", "u", "a", "i", "d", "n", "e", "o", "b", "g", "h", "j"),
        audioToSpeak = "快点"
    ),

    // 5. Soal 5: Mendengar Kalimat (Rule 10: illustrationRes = 0)
    Exercise(
        id = "u26_s4_p2_q5",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Apa yang Anda dengar?",
        targetTranslation = "Saya memberitahunya besok tidak perlu datang.",
        targetHanzi = "我 告诉 他 明天 不用 来。",
        targetPinyin = "Wǒ gàosu tā míngtiān búyòng lái.",
        wordChips = listOf("我:wǒ", "告诉:gàosu", "他:tā", "明天:míngtiān", "不用:búyòng", "来。:lái.", "去:qù"),
        correctAnswer = "我,告诉,他,明天,不用,来。",
        illustrationRes = 0,
        audioToSpeak = "我告诉他明天不用来。"
    ),

    // 6. Soal 6: Pilihan Kalimat
    Exercise(
        id = "u26_s4_p2_q6",
        type = ExerciseType.SENTENCE_CHOICE,
        title = "Pilih terjemahan yang benar",
        targetHanzi = "祝 你 身体 健康， 万事 如意！",
        targetPinyin = "Zhù nǐ shēntǐ jiànkāng, wànshì rúyì!",
        targetTranslation = "Mendoakanmu sehat walafiat, segala hal lancar!",
        correctAnswer = "Zhù nǐ shēntǐ jiànkāng, wànshì rúyì!\n祝 你 身体 健康， 万事 如意！",
        options = listOf(
            "Zhù nǐ shēntǐ jiànkāng, wànshì rúyì!\n祝 你 身体 健康， 万事 如意！",
            "Zhù nǐ shēngrì kuàilè, wànshì rúyì!\n祝 你 生日 快乐， 万事 如意！",
            "Zhù nǐ xīnnián kuàilè, wànshì rúyì!\n祝 你 新年 快乐， 万事 如意！"
        ),
        audioToSpeak = "祝你身体健康，万事如意！"
    ),

    // 7. Soal 7: Pilihan Gambar (康复 -> sembuh sehat)
    Exercise(
        id = "u26_s4_p2_q7",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "健康",
        targetPinyin = "jiànkāng",
        targetTranslation = "sehat",
        correctAnswer = "sehat",
        audioToSpeak = "健康",
        pictureOptions = listOf(
            PictureOption("u26_s4_p2_opt7_1", "sehat", "", R.drawable.ic_med_comfort_healthy, true),
            PictureOption("u26_s4_p2_opt7_2", "demam", "", R.drawable.ic_med_thermometer_fever, false),
            PictureOption("u26_s4_p2_opt7_3", "pusing", "", R.drawable.ic_med_headache, false),
            PictureOption("u26_s4_p2_opt7_4", "ranjang", "", R.drawable.ic_med_bed_rest, false)
        )
    ),

    // 8. Soal 8: Ketik Pinyin (membaik/sembuh -> hǎoqǐlai)
    Exercise(
        id = "u26_s4_p2_q8",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "sembuh / membaik",
        sentenceWithBlank = "好起来 (________)",
        targetHanzi = "好起来",
        targetPinyin = "hǎoqǐlai",
        correctAnswer = "haoqilai",
        keyboardKeys = listOf("h", "a", "o", "q", "i", "l", "e", "u", "b", "d", "g", "j"),
        audioToSpeak = "好起来"
    ),

    // 9. Soal 9: Susun Kalimat (Ibu menyuruh saya beristirahat dengan baik di rumah.)
    Exercise(
        id = "u26_s4_p2_q9",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Ibu menyuruh saya istirahat.",
        targetHanzi = "妈妈 叫 我 好好 休息。",
        targetPinyin = "Māma jiào wǒ hǎohāo xiūxi.",
        wordChips = listOf("妈妈:māma", "叫:jiào", "我:wǒ", "好好:hǎohāo", "休息。:xiūxi.", "去:qù"),
        correctAnswer = "妈妈,叫,我,好好,休息。",
        audioToSpeak = "妈妈叫我好好休息。"
    ),

    // 10. Soal 10: Ketuk Pasangan yang Sesuai (Rangkuman Harapan Kesembuhan)
    Exercise(
        id = "u26_s4_p2_m10",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u26_s4_p2_m10_1", "好起来", "hǎo qǐlai", "membaik"),
            MatchPairItem("u26_s4_p2_m10_2", "好好休息", "hǎohāo xiūxi", "istirahat baik"),
            MatchPairItem("u26_s4_p2_m10_3", "不用来", "búyòng lái", "tak perlu datang"),
            MatchPairItem("u26_s4_p2_m10_4", "万事如意", "wànshì rúyì", "semua lancar")
        )
    )
)
