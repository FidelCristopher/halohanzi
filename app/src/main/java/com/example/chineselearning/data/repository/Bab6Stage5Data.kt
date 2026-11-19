package com.example.chineselearning.data.repository

import com.example.chineselearning.R
import com.example.chineselearning.data.model.Exercise
import com.example.chineselearning.data.model.ExerciseType
import com.example.chineselearning.data.model.MatchPairItem
import com.example.chineselearning.data.model.PictureOption

val bab6Stage5Part1Exercises = listOf(
    // 1. Soal 1: Pilihan Gambar (岁 -> tahun umur)
    Exercise(
        id = "u6_s5_p1_q1",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "岁",
        targetPinyin = "suì",
        targetTranslation = "tahun (umur)",
        correctAnswer = "tahun (umur)",
        audioToSpeak = "岁",
        pictureOptions = listOf(
            PictureOption("u6_s5_p1_opt1", "tahun (umur)", "🎂", R.drawable.ic_crown, true),
            PictureOption("u6_s5_p1_opt2", "jam", "⏰", R.drawable.ic_story_timer, false),
            PictureOption("u6_s5_p1_opt3", "uang", "🪙", R.drawable.ic_coin, false),
            PictureOption("u6_s5_p1_opt4", "buku", "📖", R.drawable.ic_book, false)
        )
    ),

    // 2. Soal 2: Susun Kalimat (Kakak laki-laki saya tahun ini 20 tahun.)
    Exercise(
        id = "u6_s5_p1_q2",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Kakak saya tahun ini 20 tahun.",
        targetHanzi = "我 哥哥 今年 二十 岁。",
        targetPinyin = "Wǒ gēge jīnnián èrshí suì.",
        wordChips = listOf("我:wǒ", "哥哥:gēge", "今年:jīnnián", "二十:èrshí", "岁:suì", "弟弟:dìdi"),
        correctAnswer = "我,哥哥,今年,二十,岁",
        audioToSpeak = "我哥哥今年二十岁。"
    ),

    // 3. Soal 3: Ketuk Pasangan yang Sesuai (Usia Anggota Keluarga)
    Exercise(
        id = "u6_s5_p1_q3",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u6_s5_p1_m1", "二十岁", "èrshí suì", "dua puluh tahun"),
            MatchPairItem("u6_s5_p1_m2", "五岁", "wǔ suì", "lima tahun"),
            MatchPairItem("u6_s5_p1_m3", "多大", "duō dà", "berapa umur (dewasa)"),
            MatchPairItem("u6_s5_p1_m4", "几岁", "jǐ suì", "berapa umur (anak)")
        )
    ),

    // 4. Soal 4: Ketik Pinyin (tahun umur -> suì)
    Exercise(
        id = "u6_s5_p1_q4",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "tahun (umur)",
        sentenceWithBlank = "岁 (________)",
        targetHanzi = "岁",
        targetPinyin = "suì",
        correctAnswer = "sui",
        keyboardKeys = listOf("s", "u", "i", "a", "e", "o", "b", "d", "g", "h", "j"),
        audioToSpeak = "岁"
    ),

    // 5. Soal 5: Mendengar Kalimat (Rule 10: illustrationRes = 0)
    Exercise(
        id = "u6_s5_p1_q5",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Apa yang Anda dengar?",
        targetTranslation = "Anak perempuannya berumur lima tahun.",
        targetHanzi = "他 女儿 五 岁。",
        targetPinyin = "Tā nǚ'ér wǔ suì.",
        wordChips = listOf("他:tā", "女儿:nǚ'ér", "五:wǔ", "岁:suì", "儿子:érzi", "六:liù"),
        correctAnswer = "他,女儿,五,岁",
        illustrationRes = 0,
        audioToSpeak = "他女儿五岁。"
    ),

    // 6. Soal 6: Pilihan Kalimat
    Exercise(
        id = "u6_s5_p1_q6",
        type = ExerciseType.SENTENCE_CHOICE,
        title = "Pilih terjemahan yang benar",
        targetHanzi = "你 儿子 几 岁？",
        targetPinyin = "Nǐ érzi jǐ suì?",
        targetTranslation = "Berapa umur anak laki-lakimu?",
        correctAnswer = "Nǐ érzi jǐ suì?\n你 儿子 几 岁？",
        options = listOf(
            "Nǐ érzi jǐ suì?\n你 儿子 几 岁？",
            "Nǐ nǚ'ér jǐ suì?\n你 女儿 几 岁？",
            "Tā érzi jǐ suì?\n他 儿子 几 岁？"
        ),
        audioToSpeak = "你儿子几岁？"
    ),

    // 7. Soal 7: Pilihan Gambar (多大 -> berapa umur)
    Exercise(
        id = "u6_s5_p1_q7",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "多大",
        targetPinyin = "duō dà",
        targetTranslation = "berapa umur",
        correctAnswer = "berapa umur",
        audioToSpeak = "多大",
        pictureOptions = listOf(
            PictureOption("u6_s5_p1_opt7_1", "berapa umur", "🎂", R.drawable.ic_crown, true),
            PictureOption("u6_s5_p1_opt7_2", "berapa harga", "💰", R.drawable.ic_coin, false),
            PictureOption("u6_s5_p1_opt7_3", "kapan", "⏰", R.drawable.ic_story_timer, false),
            PictureOption("u6_s5_p1_opt7_4", "siapa", "👤", R.drawable.ic_person_guru, false)
        )
    ),

    // 8. Soal 8: Ketik Pinyin (berapa umur -> duōdà)
    Exercise(
        id = "u6_s5_p1_q8",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "berapa umur",
        sentenceWithBlank = "多大 (________)",
        targetHanzi = "多大",
        targetPinyin = "duōdà",
        correctAnswer = "duoda",
        keyboardKeys = listOf("d", "u", "o", "a", "e", "i", "b", "g", "h", "j", "l"),
        audioToSpeak = "多大"
    ),

    // 9. Soal 9: Susun Kalimat (Ibu saya tahun ini 45 tahun.)
    Exercise(
        id = "u6_s5_p1_q9",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Ibu saya tahun ini 45 tahun.",
        targetHanzi = "我 妈妈 今年 四十五 岁。",
        targetPinyin = "Wǒ māma jīnnián sìshíwǔ suì.",
        wordChips = listOf("我:wǒ", "妈妈:māma", "今年:jīnnián", "四十五:sìshíwǔ", "岁:suì", "爸爸:bàba"),
        correctAnswer = "我,妈妈,今年,四十五,岁",
        audioToSpeak = "我妈妈今年四十五岁。"
    ),

    // 10. Soal 10: Ketuk Pasangan yang Sesuai (Rangkuman Umur Keluarga)
    Exercise(
        id = "u6_s5_p1_m10_1",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u6_s5_p1_m10_1", "我哥哥", "wǒ gēge", "kakak laki-laki"),
            MatchPairItem("u6_s5_p1_m10_2", "我妹妹", "wǒ mèimei", "adik perempuan"),
            MatchPairItem("u6_s5_p1_m10_3", "今年多大", "jīnnián duō dà", "berapa umur tahun ini"),
            MatchPairItem("u6_s5_p1_m10_4", "七岁", "qī suì", "tujuh tahun")
        )
    )
)

val bab6Stage5Part2Exercises = listOf(
    // 1. Soal 1: Pilihan Gambar (今年 -> tahun ini)
    Exercise(
        id = "u6_s5_p2_q1",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "今年",
        targetPinyin = "jīnnián",
        targetTranslation = "tahun ini",
        correctAnswer = "tahun ini",
        audioToSpeak = "今年",
        pictureOptions = listOf(
            PictureOption("u6_s5_p2_opt1", "tahun ini", "📅", R.drawable.ic_story_timer, true),
            PictureOption("u6_s5_p2_opt2", "tahun lalu", "⏮️", R.drawable.ic_book, false),
            PictureOption("u6_s5_p2_opt3", "tahun depan", "⏭️", R.drawable.ic_crown, false),
            PictureOption("u6_s5_p2_opt4", "hari ini", "☀️", R.drawable.ic_target, false)
        )
    ),

    // 2. Soal 2: Susun Kalimat (Ayahmu tahun ini berapa umur?)
    Exercise(
        id = "u6_s5_p2_q2",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Ayahmu tahun ini berapa umur?",
        targetHanzi = "你 爸爸 今年 多大？",
        targetPinyin = "Nǐ bàba jīnnián duō dà?",
        wordChips = listOf("你:nǐ", "爸爸:bàba", "今年:jīnnián", "多大:duō dà", "妈妈:māma", "岁:suì"),
        correctAnswer = "你,爸爸,今年,多大",
        audioToSpeak = "你爸爸今年多大？"
    ),

    // 3. Soal 3: Ketuk Pasangan yang Sesuai (Relasi Umur & Keluarga)
    Exercise(
        id = "u6_s5_p2_q3",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u6_s5_p2_m1", "你爸爸", "nǐ bàba", "ayahmu"),
            MatchPairItem("u6_s5_p2_m2", "你妈妈", "nǐ māma", "ibumu"),
            MatchPairItem("u6_s5_p2_m3", "今年多大", "jīnnián duō dà", "berapa umur tahun ini"),
            MatchPairItem("u6_s5_p2_m4", "五十岁", "wǔshí suì", "lima puluh tahun")
        )
    ),

    // 4. Soal 4: Ketik Pinyin (tahun ini -> jīnnián)
    Exercise(
        id = "u6_s5_p2_q4",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "tahun ini",
        sentenceWithBlank = "今年 (________)",
        targetHanzi = "今年",
        targetPinyin = "jīnnián",
        correctAnswer = "jinnian",
        keyboardKeys = listOf("j", "i", "n", "a", "e", "o", "u", "b", "d", "g", "h"),
        audioToSpeak = "今年"
    ),

    // 5. Soal 5: Mendengar Kalimat (Rule 10: illustrationRes = 0)
    Exercise(
        id = "u6_s5_p2_q5",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Apa yang Anda dengar?",
        targetTranslation = "Adik laki-laki saya berumur sepuluh tahun.",
        targetHanzi = "我 弟弟 十 岁。",
        targetPinyin = "Wǒ dìdi shí suì.",
        wordChips = listOf("我:wǒ", "弟弟:dìdi", "十:shí", "岁:suì", "哥哥:gēge", "九:jiǔ"),
        correctAnswer = "我,弟弟,十,岁",
        illustrationRes = 0,
        audioToSpeak = "我弟弟十岁。"
    ),

    // 6. Soal 6: Pilihan Kalimat
    Exercise(
        id = "u6_s5_p2_q6",
        type = ExerciseType.SENTENCE_CHOICE,
        title = "Pilih terjemahan yang benar",
        targetHanzi = "我 妹妹 六 岁。",
        targetPinyin = "Wǒ mèimei liù suì.",
        targetTranslation = "Adik perempuan saya berumur enam tahun.",
        correctAnswer = "Wǒ mèimei liù suì.\n我 妹妹 六 岁。",
        options = listOf(
            "Wǒ mèimei liù suì.\n我 妹妹 六 岁。",
            "Wǒ jiějie liù suì.\n我 姐姐 六 岁。",
            "Tā mèimei liù suì.\n他 妹妹 六 岁。"
        ),
        audioToSpeak = "我妹妹六岁。"
    ),

    // 7. Soal 7: Pilihan Gambar (几岁 -> berapa umur anak)
    Exercise(
        id = "u6_s5_p2_q7",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "几岁",
        targetPinyin = "jǐ suì",
        targetTranslation = "berapa umur (anak)",
        correctAnswer = "berapa umur (anak)",
        audioToSpeak = "几岁",
        pictureOptions = listOf(
            PictureOption("u6_s5_p2_opt7_1", "berapa umur (anak)", "🎂", R.drawable.ic_crown, true),
            PictureOption("u6_s5_p2_opt7_2", "berapa orang", "👥", R.drawable.ic_people_group, false),
            PictureOption("u6_s5_p2_opt7_3", "berapa jam", "⏰", R.drawable.ic_story_timer, false),
            PictureOption("u6_s5_p2_opt7_4", "berapa harga", "💰", R.drawable.ic_coin, false)
        )
    ),

    // 8. Soal 8: Ketik Pinyin (berapa umur -> jǐsuì)
    Exercise(
        id = "u6_s5_p2_q8",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "berapa umur (anak)",
        sentenceWithBlank = "几岁 (________)",
        targetHanzi = "几岁",
        targetPinyin = "jǐsuì",
        correctAnswer = "jisui",
        keyboardKeys = listOf("j", "i", "s", "u", "a", "e", "o", "b", "d", "g", "h"),
        audioToSpeak = "几岁"
    ),

    // 9. Soal 9: Susun Kalimat (Dia berumur delapan belas tahun.)
    Exercise(
        id = "u6_s5_p2_q9",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Dia berumur delapan belas tahun.",
        targetHanzi = "他 十八 岁。",
        targetPinyin = "Tā shíbā suì.",
        wordChips = listOf("他:tā", "十八:shíbā", "岁:suì", "我:wǒ", "二十:èrshí"),
        correctAnswer = "他,十八,岁",
        audioToSpeak = "他十八岁。"
    ),

    // 10. Soal 10: Ketuk Pasangan yang Sesuai (Rangkuman Usia & Saudara)
    Exercise(
        id = "u6_s5_p2_m10_1",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u6_s5_p2_m10_1", "十八岁", "shíbā suì", "18 tahun"),
            MatchPairItem("u6_s5_p2_m10_2", "十岁", "shí suì", "10 tahun"),
            MatchPairItem("u6_s5_p2_m10_3", "六岁", "liù suì", "6 tahun"),
            MatchPairItem("u6_s5_p2_m10_4", "几岁", "jǐ suì", "berapa umur")
        )
    )
)
