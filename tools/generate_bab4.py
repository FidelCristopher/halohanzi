#!/usr/bin/env python3
import os
import re

def create_bab4_files():
    base_dir = "app/src/main/java/com/example/chineselearning/data/repository"
    
    # Let's define the 6 stages content
    stages = {}
    
    # STAGE 1: Hari Dalam Seminggu & Relasi Hari
    stages[1] = {
        "p1": [
            """    // 1. Soal 1: Pilihan Gambar (今天 -> hari ini)
    Exercise(
        id = "u4_s1_p1_q1",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "今天",
        targetPinyin = "jīntiān",
        targetTranslation = "hari ini",
        correctAnswer = "hari ini",
        audioToSpeak = "今天",
        pictureOptions = listOf(
            PictureOption("u4_s1_p1_opt1", "hari ini", "📅", R.drawable.ic_story_timer, true),
            PictureOption("u4_s1_p1_opt2", "kemarin", "⏮️", R.drawable.ic_book, false),
            PictureOption("u4_s1_p1_opt3", "besok", "⏭️", R.drawable.ic_target, false),
            PictureOption("u4_s1_p1_opt4", "tahun lalu", "🗓️", R.drawable.ic_pouch, false)
        )
    )""",
            """    // 2. Soal 2: Susun Kalimat (今天是星期一。 -> Hari ini adalah hari Senin.)
    Exercise(
        id = "u4_s1_p1_q2",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Hari ini adalah hari Senin.",
        targetHanzi = "今天 是 星期一。",
        targetPinyin = "Jīntiān shì xīngqīyī.",
        wordChips = listOf("今天:jīntiān", "是:shì", "星期一:xīngqīyī", "明天:míngtiān", "星期二:xīngqī'èr"),
        correctAnswer = "今天,是,星期一",
        audioToSpeak = "今天是星期一。"
    )""",
            """    // 3. Soal 3: Ketuk Pasangan yang Sesuai (Hari dalam Seminggu)
    Exercise(
        id = "u4_s1_p1_q3",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u4_s1_p1_m1", "今天", "jīntiān", "hari ini"),
            MatchPairItem("u4_s1_p1_m2", "明天", "míngtiān", "besok"),
            MatchPairItem("u4_s1_p1_m3", "昨天", "zuótiān", "kemarin"),
            MatchPairItem("u4_s1_p1_m4", "星期", "xīngqī", "minggu / pekan")
        )
    )""",
            """    // 4. Soal 4: Ketik Pinyin (besok -> míngtiān)
    Exercise(
        id = "u4_s1_p1_q4",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "besok",
        sentenceWithBlank = "明天 (________)",
        targetHanzi = "明天",
        targetPinyin = "míngtiān",
        correctAnswer = "mingtian",
        audioToSpeak = "明天"
    )""",
            """    // 5. Soal 5: Mendengar Kalimat (Rule 10: illustrationRes = 0)
    Exercise(
        id = "u4_s1_p1_q5",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Apa yang Anda dengar?",
        targetTranslation = "Kemarin adalah hari Minggu.",
        targetHanzi = "昨天 是 星期天。",
        targetPinyin = "Zuótiān shì xīngqītiān.",
        wordChips = listOf("昨天:zuótiān", "是:shì", "星期天:xīngqītiān", "今天:jīntiān", "星期日:xīngqīrì"),
        correctAnswer = "昨天,是,星期天",
        illustrationRes = 0,
        audioToSpeak = "昨天是星期天。"
    )""",
            """    // 6. Soal 6: Pilihan Kalimat
    Exercise(
        id = "u4_s1_p1_q6",
        type = ExerciseType.SENTENCE_CHOICE,
        title = "Pilih terjemahan yang benar",
        targetHanzi = "明天 是 星期二。",
        targetPinyin = "Míngtiān shì xīngqī'èr.",
        targetTranslation = "Besok adalah hari Selasa.",
        correctAnswer = "Míngtiān shì xīngqī'èr.\n明天 是 星期二。",
        options = listOf(
            "Míngtiān shì xīngqī'èr.\n明天 是 星期二。",
            "Jīntiān shì xīngqī'èr.\n今天 是 星期二。",
            "Zuótiān shì xīngqīyī.\n昨天 是 星期一。"
        ),
        audioToSpeak = "明天是星期二。"
    )""",
            """    // 7. Soal 7: Pilihan Gambar (昨天 -> kemarin)
    Exercise(
        id = "u4_s1_p1_q7",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "昨天",
        targetPinyin = "zuótiān",
        targetTranslation = "kemarin",
        correctAnswer = "kemarin",
        audioToSpeak = "昨天",
        pictureOptions = listOf(
            PictureOption("u4_s1_p1_opt7_1", "kemarin", "⏮️", R.drawable.ic_book, true),
            PictureOption("u4_s1_p1_opt7_2", "hari ini", "📅", R.drawable.ic_story_timer, false),
            PictureOption("u4_s1_p1_opt7_3", "besok", "⏭️", R.drawable.ic_crown, false),
            PictureOption("u4_s1_p1_opt7_4", "minggu", "🗓️", R.drawable.ic_cap, false)
        )
    )""",
            """    // 8. Soal 8: Ketik Pinyin (kemarin -> zuótiān)
    Exercise(
        id = "u4_s1_p1_q8",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "kemarin",
        sentenceWithBlank = "昨天 (________)",
        targetHanzi = "昨天",
        targetPinyin = "zuótiān",
        correctAnswer = "zuotian",
        audioToSpeak = "昨天"
    )""",
            """    // 9. Soal 9: Susun Kalimat (Hari ini hari Minggu.)
    Exercise(
        id = "u4_s1_p1_q9",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Hari ini adalah hari Minggu.",
        targetHanzi = "今天 是 星期日。",
        targetPinyin = "Jīntiān shì xīngqīrì.",
        wordChips = listOf("今天:jīntiān", "是:shì", "星期日:xīngqīrì", "明天:míngtiān", "星期三:xīngqīsān"),
        correctAnswer = "今天,是,星期日",
        audioToSpeak = "今天是星期日。"
    )""",
            """    // 10. Soal 10: Ketuk Pasangan yang Sesuai (Hari Minggu)
    Exercise(
        id = "u4_s1_p1_q10",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u4_s1_p1_m10_1", "星期一", "xīngqīyī", "hari senin"),
            MatchPairItem("u4_s1_p1_m10_2", "星期二", "xīngqī'èr", "hari selasa"),
            MatchPairItem("u4_s1_p1_m10_3", "星期天", "xīngqītiān", "hari minggu"),
            MatchPairItem("u4_s1_p1_m10_4", "星期日", "xīngqīrì", "hari minggu (resmi)")
        )
    )"""
        ],
        "p2": [
            """    // 1. Soal 1: Pilihan Gambar (星期 -> minggu/pekan)
    Exercise(
        id = "u4_s1_p2_q1",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "星期",
        targetPinyin = "xīngqī",
        targetTranslation = "minggu / pekan",
        correctAnswer = "minggu / pekan",
        audioToSpeak = "星期",
        pictureOptions = listOf(
            PictureOption("u4_s1_p2_opt1", "minggu / pekan", "🗓️", R.drawable.ic_story_timer, true),
            PictureOption("u4_s1_p2_opt2", "tahun", "📆", R.drawable.ic_book, false),
            PictureOption("u4_s1_p2_opt3", "bulan", "🌙", R.drawable.ic_crown, false),
            PictureOption("u4_s1_p2_opt4", "hari ini", "☀️", R.drawable.ic_pouch, false)
        )
    )""",
            """    // 2. Soal 2: Susun Kalimat (Hari ini hari apa?)
    Exercise(
        id = "u4_s1_p2_q2",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Hari ini hari apa?",
        targetHanzi = "今天 星期 几？",
        targetPinyin = "Jīntiān xīngqī jǐ?",
        wordChips = listOf("今天:jīntiān", "星期:xīngqī", "几:jǐ", "明天:míngtiān", "什么:shénme"),
        correctAnswer = "今天,星期,几",
        audioToSpeak = "今天星期几？"
    )""",
            """    // 3. Soal 3: Ketuk Pasangan yang Sesuai (Pertanyaan Hari)
    Exercise(
        id = "u4_s1_p2_q3",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u4_s1_p2_m1", "星期三", "xīngqīsān", "hari rabu"),
            MatchPairItem("u4_s1_p2_m2", "星期四", "xīngqīsì", "hari kamis"),
            MatchPairItem("u4_s1_p2_m3", "星期五", "xīngqīwǔ", "hari jumat"),
            MatchPairItem("u4_s1_p2_m4", "星期六", "xīngqīliù", "hari sabtu")
        )
    )""",
            """    // 4. Soal 4: Ketik Pinyin (minggu / pekan -> xīngqī)
    Exercise(
        id = "u4_s1_p2_q4",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "minggu / pekan",
        sentenceWithBlank = "星期 (________)",
        targetHanzi = "星期",
        targetPinyin = "xīngqī",
        correctAnswer = "xingqi",
        audioToSpeak = "星期"
    )""",
            """    // 5. Soal 5: Mendengar Kalimat (Rule 10: illustrationRes = 0)
    Exercise(
        id = "u4_s1_p2_q5",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Apa yang Anda dengar?",
        targetTranslation = "Besok hari apa?",
        targetHanzi = "明天 星期 几？",
        targetPinyin = "Míngtiān xīngqī jǐ?",
        wordChips = listOf("明天:míngtiān", "星期:xīngqī", "几:jǐ", "昨天:zuótiān", "今天:jīntiān"),
        correctAnswer = "明天,星期,几",
        illustrationRes = 0,
        audioToSpeak = "明天星期几？"
    )""",
            """    // 6. Soal 6: Pilihan Kalimat
    Exercise(
        id = "u4_s1_p2_q6",
        type = ExerciseType.SENTENCE_CHOICE,
        title = "Pilih terjemahan yang benar",
        targetHanzi = "昨天 是 星期五。",
        targetPinyin = "Zuótiān shì xīngqīwǔ.",
        targetTranslation = "Kemarin adalah hari Jumat.",
        correctAnswer = "Zuótiān shì xīngqīwǔ.\n昨天 是 星期五。",
        options = listOf(
            "Zuótiān shì xīngqīwǔ.\n昨天 是 星期五。",
            "Jīntiān shì xīngqīwǔ.\n今天 是 星期五。",
            "Míngtiān shì xīngqīliù.\n明天 是 星期六。"
        ),
        audioToSpeak = "昨天是星期五。"
    )""",
            """    // 7. Soal 7: Susun Kalimat (Besok adalah hari Sabtu.)
    Exercise(
        id = "u4_s1_p2_q7",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Besok adalah hari Sabtu.",
        targetHanzi = "明天 是 星期六。",
        targetPinyin = "Míngtiān shì xīngqīliù.",
        wordChips = listOf("明天:míngtiān", "是:shì", "星期六:xīngqīliù", "昨天:zuótiān", "星期天:xīngqītiān"),
        correctAnswer = "明天,是,星期六",
        audioToSpeak = "明天是星期六。"
    )""",
            """    // 8. Soal 8: Ketik Pinyin (hari apa -> jǐ)
    Exercise(
        id = "u4_s1_p2_q8",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "berapa / hari apa",
        sentenceWithBlank = "星期几 (xīngqī ________)",
        targetHanzi = "几",
        targetPinyin = "jǐ",
        correctAnswer = "ji",
        audioToSpeak = "几"
    )""",
            """    // 9. Soal 9: Pilihan Gambar (hari Minggu -> 星期天)
    Exercise(
        id = "u4_s1_p2_q9",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "星期天",
        targetPinyin = "xīngqītiān",
        targetTranslation = "hari Minggu",
        correctAnswer = "hari Minggu",
        audioToSpeak = "星期天",
        pictureOptions = listOf(
            PictureOption("u4_s1_p2_opt9_1", "hari Minggu", "☀️", R.drawable.ic_story_timer, true),
            PictureOption("u4_s1_p2_opt9_2", "hari Senin", "💼", R.drawable.ic_book, false),
            PictureOption("u4_s1_p2_opt9_3", "hari Sabtu", "🏖️", R.drawable.ic_target, false),
            PictureOption("u4_s1_p2_opt9_4", "hari Jumat", "🕌", R.drawable.ic_coin, false)
        )
    )""",
            """    // 10. Soal 10: Ketuk Pasangan yang Sesuai (Rangkuman Hari & Relasi)
    Exercise(
        id = "u4_s1_p2_q10",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u4_s1_p2_m10_1", "今天", "jīntiān", "hari ini"),
            MatchPairItem("u4_s1_p2_m10_2", "明天", "míngtiān", "besok"),
            MatchPairItem("u4_s1_p2_m10_3", "昨天", "zuótiān", "kemarin"),
            MatchPairItem("u4_s1_p2_m10_4", "星期几", "xīngqī jǐ", "hari apa")
        )
    )"""
        ]
    }

    # STAGE 2: Format Tanggal & Kalender (Tahun, Bulan, Tanggal)
    stages[2] = {
        "p1": [
            """    // 1. Soal 1: Pilihan Gambar (月 -> bulan)
    Exercise(
        id = "u4_s2_p1_q1",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "月",
        targetPinyin = "yuè",
        targetTranslation = "bulan",
        correctAnswer = "bulan",
        audioToSpeak = "月",
        pictureOptions = listOf(
            PictureOption("u4_s2_p1_opt1", "bulan", "🌙", R.drawable.ic_story_timer, true),
            PictureOption("u4_s2_p1_opt2", "matahari / hari", "☀️", R.drawable.ic_book, false),
            PictureOption("u4_s2_p1_opt3", "tahun", "📆", R.drawable.ic_crown, false),
            PictureOption("u4_s2_p1_opt4", "jam", "⏰", R.drawable.ic_target, false)
        )
    )""",
            """    // 2. Soal 2: Susun Kalimat (Hari ini tanggal 5 Oktober.)
    Exercise(
        id = "u4_s2_p1_q2",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Hari ini tanggal 5 Oktober.",
        targetHanzi = "今天 是 十月 五号。",
        targetPinyin = "Jīntiān shì shíyuè wǔhào.",
        wordChips = listOf("今天:jīntiān", "是:shì", "十月:shíyuè", "五号:wǔhào", "明天:míngtiān", "九月:jiǔyuè"),
        correctAnswer = "今天,是,十月,五号",
        audioToSpeak = "今天是十月五号。"
    )""",
            """    // 3. Soal 3: Ketuk Pasangan yang Sesuai (Bulan & Tanggal)
    Exercise(
        id = "u4_s2_p1_q3",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u4_s2_p1_m1", "月", "yuè", "bulan"),
            MatchPairItem("u4_s2_p1_m2", "号", "hào", "nomor / tanggal"),
            MatchPairItem("u4_s2_p1_m3", "日", "rì", "hari / tanggal (resmi)"),
            MatchPairItem("u4_s2_p1_m4", "一月", "yīyuè", "bulan januari")
        )
    )""",
            """    // 4. Soal 4: Ketik Pinyin (bulan -> yuè)
    Exercise(
        id = "u4_s2_p1_q4",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "bulan",
        sentenceWithBlank = "月 (________)",
        targetHanzi = "月",
        targetPinyin = "yuè",
        correctAnswer = "yue",
        audioToSpeak = "月"
    )""",
            """    // 5. Soal 5: Mendengar Kalimat (Rule 10: illustrationRes = 0)
    Exercise(
        id = "u4_s2_p1_q5",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Apa yang Anda dengar?",
        targetTranslation = "Hari ini tanggal berapa?",
        targetHanzi = "今天 几 月 几 号？",
        targetPinyin = "Jīntiān jǐ yuè jǐ hào?",
        wordChips = listOf("今天:jīntiān", "几:jǐ", "月:yuè", "几:jǐ", "号:hào", "明天:míngtiān"),
        correctAnswer = "今天,几,月,几,号",
        illustrationRes = 0,
        audioToSpeak = "今天几月几号？"
    )""",
            """    // 6. Soal 6: Pilihan Kalimat
    Exercise(
        id = "u4_s2_p1_q6",
        type = ExerciseType.SENTENCE_CHOICE,
        title = "Pilih terjemahan yang benar",
        targetHanzi = "明天 是 三月 八号。",
        targetPinyin = "Míngtiān shì sānyuè bāhào.",
        targetTranslation = "Besok adalah tanggal 8 Maret.",
        correctAnswer = "Míngtiān shì sānyuè bāhào.\n明天 是 三月 八号。",
        options = listOf(
            "Míngtiān shì sānyuè bāhào.\n明天 是 三月 八号。",
            "Jīntiān shì sānyuè bāhào.\n今天 是 三月 八号。",
            "Míngtiān shì sìyuè bāhào.\n明天 是 四月 八号。"
        ),
        audioToSpeak = "明天是三月八号。"
    )""",
            """    // 7. Soal 7: Pilihan Gambar (号 -> tanggal/nomor)
    Exercise(
        id = "u4_s2_p1_q7",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "号",
        targetPinyin = "hào",
        targetTranslation = "nomor / tanggal",
        correctAnswer = "nomor / tanggal",
        audioToSpeak = "号",
        pictureOptions = listOf(
            PictureOption("u4_s2_p1_opt7_1", "nomor / tanggal", "🔢", R.drawable.ic_story_timer, true),
            PictureOption("u4_s2_p1_opt7_2", "nama", "📛", R.drawable.ic_cap, false),
            PictureOption("u4_s2_p1_opt7_3", "uang", "💰", R.drawable.ic_coin, false),
            PictureOption("u4_s2_p1_opt7_4", "orang", "👤", R.drawable.ic_people_group, false)
        )
    )""",
            """    // 8. Soal 8: Ketik Pinyin (tanggal / nomor -> hào)
    Exercise(
        id = "u4_s2_p1_q8",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "nomor / tanggal",
        sentenceWithBlank = "号 (________)",
        targetHanzi = "号",
        targetPinyin = "hào",
        correctAnswer = "hao",
        audioToSpeak = "号"
    )""",
            """    // 9. Soal 9: Susun Kalimat (Kemarin tanggal 1 Januari.)
    Exercise(
        id = "u4_s2_p1_q9",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Kemarin tanggal 1 Januari.",
        targetHanzi = "昨天 是 一月 一号。",
        targetPinyin = "Zuótiān shì yīyuè yīhào.",
        wordChips = listOf("昨天:zuótiān", "是:shì", "一月:yīyuè", "一号:yīhào", "今天:jīntiān", "二号:èrhào"),
        correctAnswer = "昨天,是,一月,一号",
        audioToSpeak = "昨天是一月一号。"
    )""",
            """    // 10. Soal 10: Ketuk Pasangan yang Sesuai (Bulan-Bulan Penting)
    Exercise(
        id = "u4_s2_p1_q10",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u4_s2_p1_m10_1", "五月", "wǔyuè", "bulan mei"),
            MatchPairItem("u4_s2_p1_m10_2", "八月", "bāyuè", "bulan agustus"),
            MatchPairItem("u4_s2_p1_m10_3", "十月", "shíyuè", "bulan oktober"),
            MatchPairItem("u4_s2_p1_m10_4", "十二月", "shí'èryuè", "bulan desember")
        )
    )"""
        ],
        "p2": [
            """    // 1. Soal 1: Pilihan Gambar (年 -> tahun)
    Exercise(
        id = "u4_s2_p2_q1",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "年",
        targetPinyin = "nián",
        targetTranslation = "tahun",
        correctAnswer = "tahun",
        audioToSpeak = "年",
        pictureOptions = listOf(
            PictureOption("u4_s2_p2_opt1", "tahun", "📅", R.drawable.ic_story_timer, true),
            PictureOption("u4_s2_p2_opt2", "hari", "☀️", R.drawable.ic_target, false),
            PictureOption("u4_s2_p2_opt3", "bulan", "🌙", R.drawable.ic_book, false),
            PictureOption("u4_s2_p2_opt4", "jam", "⏰", R.drawable.ic_crown, false)
        )
    )""",
            """    // 2. Soal 2: Susun Kalimat (Tahun ini adalah tahun 2024.)
    Exercise(
        id = "u4_s2_p2_q2",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Tahun ini adalah tahun 2024.",
        targetHanzi = "今年 是 二零二四年。",
        targetPinyin = "Jīnnián shì èrlíng'èrsìnián.",
        wordChips = listOf("今年:jīnnián", "是:shì", "二零二四年:èrlíng'èrsìnián", "明年:míngnián", "去年:qùnián"),
        correctAnswer = "今年,是,二零二四年",
        audioToSpeak = "今年是二零二四年。"
    )""",
            """    // 3. Soal 3: Ketuk Pasangan yang Sesuai (Relasi Tahun)
    Exercise(
        id = "u4_s2_p2_q3",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u4_s2_p2_m1", "年", "nián", "tahun"),
            MatchPairItem("u4_s2_p2_m2", "今年", "jīnnián", "tahun ini"),
            MatchPairItem("u4_s2_p2_m3", "明年", "míngnián", "tahun depan"),
            MatchPairItem("u4_s2_p2_m4", "去年", "qùnián", "tahun lalu")
        )
    )""",
            """    // 4. Soal 4: Ketik Pinyin (tahun ini -> jīnnián)
    Exercise(
        id = "u4_s2_p2_q4",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "tahun ini",
        sentenceWithBlank = "今年 (________)",
        targetHanzi = "今年",
        targetPinyin = "jīnnián",
        correctAnswer = "jinnian",
        audioToSpeak = "今年"
    )""",
            """    // 5. Soal 5: Mendengar Kalimat (Rule 10: illustrationRes = 0)
    Exercise(
        id = "u4_s2_p2_q5",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Apa yang Anda dengar?",
        targetTranslation = "Tahun depan saya pergi ke Tiongkok.",
        targetHanzi = "明年 我 去 中国。",
        targetPinyin = "Míngnián wǒ qù Zhōngguó.",
        wordChips = listOf("明年:míngnián", "我:wǒ", "去:qù", "中国:Zhōngguó", "去年:qùnián", "北京:Běijīng"),
        correctAnswer = "明年,我,去,中国",
        illustrationRes = 0,
        audioToSpeak = "明年我去中国。"
    )""",
            """    // 6. Soal 6: Pilihan Kalimat
    Exercise(
        id = "u4_s2_p2_q6",
        type = ExerciseType.SENTENCE_CHOICE,
        title = "Pilih terjemahan yang benar",
        targetHanzi = "去年 他 是 学生。",
        targetPinyin = "Qùnián tā shì xuéshēng.",
        targetTranslation = "Tahun lalu dia adalah murid.",
        correctAnswer = "Qùnián tā shì xuéshēng.\n去年 他 是 学生。",
        options = listOf(
            "Qùnián tā shì xuéshēng.\n去年 他 是 学生。",
            "Jīnnián tā shì xuéshēng.\n今年 他 是 学生。",
            "Míngnián tā shì lǎoshī.\n明年 他 是 老师。"
        ),
        audioToSpeak = "去年他是学生。"
    )""",
            """    // 7. Soal 7: Pilihan Gambar (明年 -> tahun depan)
    Exercise(
        id = "u4_s2_p2_q7",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "明年",
        targetPinyin = "míngnián",
        targetTranslation = "tahun depan",
        correctAnswer = "tahun depan",
        audioToSpeak = "明年",
        pictureOptions = listOf(
            PictureOption("u4_s2_p2_opt7_1", "tahun depan", "⏭️", R.drawable.ic_story_timer, true),
            PictureOption("u4_s2_p2_opt7_2", "tahun ini", "📅", R.drawable.ic_book, false),
            PictureOption("u4_s2_p2_opt7_3", "tahun lalu", "⏮️", R.drawable.ic_pouch, false),
            PictureOption("u4_s2_p2_opt7_4", "besok", "☀️", R.drawable.ic_target, false)
        )
    )""",
            """    // 8. Soal 8: Ketik Pinyin (tahun lalu -> qùnián)
    Exercise(
        id = "u4_s2_p2_q8",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "tahun lalu",
        sentenceWithBlank = "去年 (________)",
        targetHanzi = "去年",
        targetPinyin = "qùnián",
        correctAnswer = "qunian",
        audioToSpeak = "去年"
    )""",
            """    // 9. Soal 9: Susun Kalimat (Format Lengkap Kalender Mandarin)
    Exercise(
        id = "u4_s2_p2_q9",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Hari ini tanggal 1 Januari 2024.",
        targetHanzi = "今天 是 二零二四年 一月 一日。",
        targetPinyin = "Jīntiān shì èrlíng'èrsìnián yīyuè yīrì.",
        wordChips = listOf("今天:jīntiān", "是:shì", "二零二四年:èrlíng'èrsìnián", "一月:yīyuè", "一日:yīrì", "明天:míngtiān"),
        correctAnswer = "今天,是,二零二四年,一月,一日",
        audioToSpeak = "今天是二零二四年一月一日。"
    )""",
            """    // 10. Soal 10: Ketuk Pasangan yang Sesuai (Rangkuman Kalender)
    Exercise(
        id = "u4_s2_p2_q10",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u4_s2_p2_m10_1", "今年", "jīnnián", "tahun ini"),
            MatchPairItem("u4_s2_p2_m10_2", "明年", "míngnián", "tahun depan"),
            MatchPairItem("u4_s2_p2_m10_3", "去年", "qùnián", "tahun lalu"),
            MatchPairItem("u4_s2_p2_m10_4", "日", "rì", "hari / tanggal")
        )
    )"""
        ]
    }

    # STAGE 3: Jam Analog & Waktu Sekarang (现在, 点, 分, 半)
    stages[3] = {
        "p1": [
            """    // 1. Soal 1: Pilihan Gambar (点 -> jam / pukul)
    Exercise(
        id = "u4_s3_p1_q1",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "点",
        targetPinyin = "diǎn",
        targetTranslation = "jam (pukul)",
        correctAnswer = "jam (pukul)",
        audioToSpeak = "点",
        pictureOptions = listOf(
            PictureOption("u4_s3_p1_opt1", "jam (pukul)", "⏰", R.drawable.ic_story_timer, true),
            PictureOption("u4_s3_p1_opt2", "menit", "⏱️", R.drawable.ic_target, false),
            PictureOption("u4_s3_p1_opt3", "tanggal", "📅", R.drawable.ic_book, false),
            PictureOption("u4_s3_p1_opt4", "tahun", "🗓️", R.drawable.ic_crown, false)
        )
    )""",
            """    // 2. Soal 2: Susun Kalimat (Sekarang jam berapa?)
    Exercise(
        id = "u4_s3_p1_q2",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Sekarang jam berapa?",
        targetHanzi = "现在 几 点？",
        targetPinyin = "Xiànzài jǐ diǎn?",
        wordChips = listOf("现在:xiànzài", "几:jǐ", "点:diǎn", "分:fēn", "什么时候:shénme shíhou"),
        correctAnswer = "现在,几,点",
        audioToSpeak = "现在几点？"
    )""",
            """    // 3. Soal 3: Ketuk Pasangan yang Sesuai (Jam & Waktu Sekarang)
    Exercise(
        id = "u4_s3_p1_q3",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u4_s3_p1_m1", "现在", "xiànzài", "sekarang"),
            MatchPairItem("u4_s3_p1_m2", "点", "diǎn", "jam (pukul)"),
            MatchPairItem("u4_s3_p1_m3", "半", "bàn", "setengah (30 menit)"),
            MatchPairItem("u4_s3_p1_m4", "三点", "sāndiǎn", "jam tiga")
        )
    )""",
            """    // 4. Soal 4: Ketik Pinyin (sekarang -> xiànzài)
    Exercise(
        id = "u4_s3_p1_q4",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "sekarang",
        sentenceWithBlank = "现在 (________)",
        targetHanzi = "现在",
        targetPinyin = "xiànzài",
        correctAnswer = "xianzai",
        audioToSpeak = "现在"
    )""",
            """    // 5. Soal 5: Mendengar Kalimat (Rule 10: illustrationRes = 0)
    Exercise(
        id = "u4_s3_p1_q5",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Apa yang Anda dengar?",
        targetTranslation = "Sekarang jam delapan tepat.",
        targetHanzi = "现在 八 点。",
        targetPinyin = "Xiànzài bā diǎn.",
        wordChips = listOf("现在:xiànzài", "八:bā", "点:diǎn", "九:jiǔ", "分:fēn"),
        correctAnswer = "现在,八,点",
        illustrationRes = 0,
        audioToSpeak = "现在八点。"
    )""",
            """    // 6. Soal 6: Pilihan Kalimat
    Exercise(
        id = "u4_s3_p1_q6",
        type = ExerciseType.SENTENCE_CHOICE,
        title = "Pilih terjemahan yang benar",
        targetHanzi = "现在 两 点 半。",
        targetPinyin = "Xiànzài liǎng diǎn bàn.",
        targetTranslation = "Sekarang jam setengah tiga (2:30).",
        correctAnswer = "Xiànzài liǎng diǎn bàn.\n现在 两 点 半。",
        options = listOf(
            "Xiànzài liǎng diǎn bàn.\n现在 两 点 半。",
            "Xiànzài sān diǎn bàn.\n现在 三 点 半。",
            "Xiànzài èr diǎn bàn.\n现在 二 点 半。"
        ),
        audioToSpeak = "现在两点半。"
    )""",
            """    // 7. Soal 7: Pilihan Gambar (半 -> setengah)
    Exercise(
        id = "u4_s3_p1_q7",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "半",
        targetPinyin = "bàn",
        targetTranslation = "setengah / separuh",
        correctAnswer = "setengah / separuh",
        audioToSpeak = "半",
        pictureOptions = listOf(
            PictureOption("u4_s3_p1_opt7_1", "setengah / separuh", "🌗", R.drawable.ic_story_timer, true),
            PictureOption("u4_s3_p1_opt7_2", "penuh", "🌕", R.drawable.ic_coin, false),
            PictureOption("u4_s3_p1_opt7_3", "kosong", "⭕", R.drawable.ic_crown, false),
            PictureOption("u4_s3_p1_opt7_4", "ganda", "👥", R.drawable.ic_people_group, false)
        )
    )""",
            """    // 8. Soal 8: Ketik Pinyin (jam / pukul -> diǎn)
    Exercise(
        id = "u4_s3_p1_q8",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "jam (pukul)",
        sentenceWithBlank = "点 (________)",
        targetHanzi = "点",
        targetPinyin = "diǎn",
        correctAnswer = "dian",
        audioToSpeak = "点"
    )""",
            """    // 9. Soal 9: Susun Kalimat (Sekarang jam sepuluh tiga puluh.)
    Exercise(
        id = "u4_s3_p1_q9",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Sekarang jam setengah sebelas.",
        targetHanzi = "现在 十 点 半。",
        targetPinyin = "Xiànzài shí diǎn bàn.",
        wordChips = listOf("现在:xiànzài", "十:shí", "点:diǎn", "半:bàn", "八:bā", "分:fēn"),
        correctAnswer = "现在,十,点,半",
        audioToSpeak = "现在十点半。"
    )""",
            """    // 10. Soal 10: Ketuk Pasangan yang Sesuai (Pukul & Jam)
    Exercise(
        id = "u4_s3_p1_q10",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u4_s3_p1_m10_1", "两点", "liǎngdiǎn", "jam dua"),
            MatchPairItem("u4_s3_p1_m10_2", "两点半", "liǎngdiǎnbàn", "jam setengah tiga"),
            MatchPairItem("u4_s3_p1_m10_3", "五点", "wǔdiǎn", "jam lima"),
            MatchPairItem("u4_s3_p1_m10_4", "十二点", "shí'èrdiǎn", "jam dua belas")
        )
    )"""
        ],
        "p2": [
            """    // 1. Soal 1: Pilihan Gambar (分 -> menit)
    Exercise(
        id = "u4_s3_p2_q1",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "分",
        targetPinyin = "fēn",
        targetTranslation = "menit",
        correctAnswer = "menit",
        audioToSpeak = "分",
        pictureOptions = listOf(
            PictureOption("u4_s3_p2_opt1", "menit", "⏱️", R.drawable.ic_story_timer, true),
            PictureOption("u4_s3_p2_opt2", "jam", "⏰", R.drawable.ic_book, false),
            PictureOption("u4_s3_p2_opt3", "detik", "⏳", R.drawable.ic_target, false),
            PictureOption("u4_s3_p2_opt4", "hari", "📅", R.drawable.ic_crown, false)
        )
    )""",
            """    // 2. Soal 2: Susun Kalimat (Sekarang jam sembilan lewat sepuluh menit.)
    Exercise(
        id = "u4_s3_p2_q2",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Sekarang jam 09:10.",
        targetHanzi = "现在 九 点 十 分。",
        targetPinyin = "Xiànzài jiǔ diǎn shí fēn.",
        wordChips = listOf("现在:xiànzài", "九:jiǔ", "点:diǎn", "十:shí", "分:fēn", "八:bā", "半:bàn"),
        correctAnswer = "现在,九,点,十,分",
        audioToSpeak = "现在九点十分。"
    )""",
            """    // 3. Soal 3: Ketuk Pasangan yang Sesuai (Menit & Pukul)
    Exercise(
        id = "u4_s3_p2_q3",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u4_s3_p2_m1", "分", "fēn", "menit"),
            MatchPairItem("u4_s3_p2_m2", "分钟", "fēnzhōng", "menit (durasi)"),
            MatchPairItem("u4_s3_p2_m3", "十分钟", "shí fēnzhōng", "sepuluh menit"),
            MatchPairItem("u4_s3_p2_m4", "三点零五分", "sān diǎn líng wǔ fēn", "jam 03:05")
        )
    )""",
            """    // 4. Soal 4: Ketik Pinyin (menit -> fēn)
    Exercise(
        id = "u4_s3_p2_q4",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "menit",
        sentenceWithBlank = "分 (________)",
        targetHanzi = "分",
        targetPinyin = "fēn",
        correctAnswer = "fen",
        audioToSpeak = "分"
    )""",
            """    // 5. Soal 5: Mendengar Kalimat (Rule 10: illustrationRes = 0)
    Exercise(
        id = "u4_s3_p2_q5",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Apa yang Anda dengar?",
        targetTranslation = "Sekarang jam 07:15.",
        targetHanzi = "现在 七 点 十五 分。",
        targetPinyin = "Xiànzài qī diǎn shíwǔ fēn.",
        wordChips = listOf("现在:xiànzài", "七:qī", "点:diǎn", "十五:shíwǔ", "分:fēn", "八:bā"),
        correctAnswer = "现在,七,点,十五,分",
        illustrationRes = 0,
        audioToSpeak = "现在七点十五分。"
    )""",
            """    // 6. Soal 6: Pilihan Kalimat
    Exercise(
        id = "u4_s3_p2_q6",
        type = ExerciseType.SENTENCE_CHOICE,
        title = "Pilih terjemahan yang benar",
        targetHanzi = "现在 四 点 零 五 分。",
        targetPinyin = "Xiànzài sì diǎn líng wǔ fēn.",
        targetTranslation = "Sekarang jam 04:05.",
        correctAnswer = "Xiànzài sì diǎn líng wǔ fēn.\n现在 四 点 零 五 分。",
        options = listOf(
            "Xiànzài sì diǎn líng wǔ fēn.\n现在 四 点 零 五 分。",
            "Xiànzài wǔ diǎn líng sì fēn.\n现在 五 点 零 四 分。",
            "Xiànzài sì diǎn bàn.\n现在 四 点 半。"
        ),
        audioToSpeak = "现在四点零五分。"
    )""",
            """    // 7. Soal 7: Pilihan Gambar (分钟 -> menit durasi)
    Exercise(
        id = "u4_s3_p2_q7",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "分钟",
        targetPinyin = "fēnzhōng",
        targetTranslation = "menit (durasi)",
        correctAnswer = "menit (durasi)",
        audioToSpeak = "分钟",
        pictureOptions = listOf(
            PictureOption("u4_s3_p2_opt7_1", "menit (durasi)", "⏱️", R.drawable.ic_story_timer, true),
            PictureOption("u4_s3_p2_opt7_2", "jam", "🕰️", R.drawable.ic_book, false),
            PictureOption("u4_s3_p2_opt7_3", "uang", "🪙", R.drawable.ic_coin, false),
            PictureOption("u4_s3_p2_opt7_4", "orang", "🚶", R.drawable.ic_person_saya, false)
        )
    )""",
            """    // 8. Soal 8: Ketik Pinyin (setengah / 30 menit -> bàn)
    Exercise(
        id = "u4_s3_p2_q8",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "setengah / separuh",
        sentenceWithBlank = "半 (________)",
        targetHanzi = "半",
        targetPinyin = "bàn",
        correctAnswer = "ban",
        audioToSpeak = "半"
    )""",
            """    // 9. Soal 9: Susun Kalimat (Tunggu lima menit.)
    Exercise(
        id = "u4_s3_p2_q9",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Lima menit.",
        targetHanzi = "五 分钟。",
        targetPinyin = "Wǔ fēnzhōng.",
        wordChips = listOf("五:wǔ", "分钟:fēnzhōng", "点:diǎn", "小时:xiǎoshí", "三:sān"),
        correctAnswer = "五,分钟",
        audioToSpeak = "五分钟。"
    )""",
            """    // 10. Soal 10: Ketuk Pasangan yang Sesuai (Rangkuman Waktu)
    Exercise(
        id = "u4_s3_p2_q10",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u4_s3_p2_m10_1", "现在", "xiànzài", "sekarang"),
            MatchPairItem("u4_s3_p2_m10_2", "点", "diǎn", "jam (pukul)"),
            MatchPairItem("u4_s3_p2_m10_3", "分", "fēn", "menit"),
            MatchPairItem("u4_s3_p2_m10_4", "半", "bàn", "setengah")
        )
    )"""
        ]
    }

    # STAGE 4: Durasi Jam & Konsep Waktu (小时, 时间, 时候, 什么时候)
    stages[4] = {
        "p1": [
            """    // 1. Soal 1: Pilihan Gambar (小时 -> jam durasi)
    Exercise(
        id = "u4_s4_p1_q1",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "小时",
        targetPinyin = "xiǎoshí",
        targetTranslation = "jam (durasi)",
        correctAnswer = "jam (durasi)",
        audioToSpeak = "小时",
        pictureOptions = listOf(
            PictureOption("u4_s4_p1_opt1", "jam (durasi)", "⏳", R.drawable.ic_story_timer, true),
            PictureOption("u4_s4_p1_opt2", "menit", "⏱️", R.drawable.ic_target, false),
            PictureOption("u4_s4_p1_opt3", "hari", "📅", R.drawable.ic_book, false),
            PictureOption("u4_s4_p1_opt4", "tahun", "🗓️", R.drawable.ic_crown, false)
        )
    )""",
            """    // 2. Soal 2: Susun Kalimat (Satu jam.)
    Exercise(
        id = "u4_s4_p1_q2",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Satu jam.",
        targetHanzi = "一个 小时。",
        targetPinyin = "Yí gè xiǎoshí.",
        wordChips = listOf("一个:yí gè", "小时:xiǎoshí", "两个:liǎng gè", "分钟:fēnzhōng", "点:diǎn"),
        correctAnswer = "一个,小时",
        audioToSpeak = "一个小时。"
    )""",
            """    // 3. Soal 3: Ketuk Pasangan yang Sesuai (Durasi & Waktu)
    Exercise(
        id = "u4_s4_p1_q3",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u4_s4_p1_m1", "小时", "xiǎoshí", "jam (durasi)"),
            MatchPairItem("u4_s4_p1_m2", "时间", "shíjiān", "waktu"),
            MatchPairItem("u4_s4_p1_m3", "时候", "shíhou", "saat / waktu"),
            MatchPairItem("u4_s4_p1_m4", "什么时候", "shénme shíhou", "kapan")
        )
    )""",
            """    // 4. Soal 4: Ketik Pinyin (jam durasi -> xiǎoshí)
    Exercise(
        id = "u4_s4_p1_q4",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "jam (durasi)",
        sentenceWithBlank = "小时 (________)",
        targetHanzi = "小时",
        targetPinyin = "xiǎoshí",
        correctAnswer = "xiaoshi",
        audioToSpeak = "小时"
    )""",
            """    // 5. Soal 5: Mendengar Kalimat (Rule 10: illustrationRes = 0)
    Exercise(
        id = "u4_s4_p1_q5",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Apa yang Anda dengar?",
        targetTranslation = "Saya punya waktu.",
        targetHanzi = "我 有 时间。",
        targetPinyin = "Wǒ yǒu shíjiān.",
        wordChips = listOf("我:wǒ", "有:yǒu", "时间:shíjiān", "没有:méiyǒu", "钱:qián"),
        correctAnswer = "我,有,时间",
        illustrationRes = 0,
        audioToSpeak = "我有时间。"
    )""",
            """    // 6. Soal 6: Pilihan Kalimat
    Exercise(
        id = "u4_s4_p1_q6",
        type = ExerciseType.SENTENCE_CHOICE,
        title = "Pilih terjemahan yang benar",
        targetHanzi = "你 有 时间 吗？",
        targetPinyin = "Nǐ yǒu shíjiān ma?",
        targetTranslation = "Apakah kamu punya waktu?",
        correctAnswer = "Nǐ yǒu shíjiān ma?\n你 有 时间 吗？",
        options = listOf(
            "Nǐ yǒu shíjiān ma?\n你 有 时间 吗？",
            "Nǐ yǒu qián ma?\n你 有 钱 吗？",
            "Tā yǒu shíjiān ma?\n他 有 时间 吗？"
        ),
        audioToSpeak = "你有时间吗？"
    )""",
            """    // 7. Soal 7: Pilihan Gambar (时间 -> waktu)
    Exercise(
        id = "u4_s4_p1_q7",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "时间",
        targetPinyin = "shíjiān",
        targetTranslation = "waktu",
        correctAnswer = "waktu",
        audioToSpeak = "时间",
        pictureOptions = listOf(
            PictureOption("u4_s4_p1_opt7_1", "waktu", "⌚", R.drawable.ic_story_timer, true),
            PictureOption("u4_s4_p1_opt7_2", "tempat", "📍", R.drawable.ic_target, false),
            PictureOption("u4_s4_p1_opt7_3", "buku", "📖", R.drawable.ic_book, false),
            PictureOption("u4_s4_p1_opt7_4", "orang", "👥", R.drawable.ic_people_group, false)
        )
    )""",
            """    // 8. Soal 8: Ketik Pinyin (waktu -> shíjiān)
    Exercise(
        id = "u4_s4_p1_q8",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "waktu",
        sentenceWithBlank = "时间 (________)",
        targetHanzi = "时间",
        targetPinyin = "shíjiān",
        correctAnswer = "shijian",
        audioToSpeak = "时间"
    )""",
            """    // 9. Soal 9: Susun Kalimat (Dua jam.)
    Exercise(
        id = "u4_s4_p1_q9",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Dua jam.",
        targetHanzi = "两个 小时。",
        targetPinyin = "Liǎng gè xiǎoshí.",
        wordChips = listOf("两个:liǎng gè", "小时:xiǎoshí", "二:èr", "个:gè", "分钟:fēnzhōng"),
        correctAnswer = "两个,小时",
        audioToSpeak = "两个小时。"
    )""",
            """    // 10. Soal 10: Ketuk Pasangan yang Sesuai (Durasi Satuan)
    Exercise(
        id = "u4_s4_p1_q10",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u4_s4_p1_m10_1", "一个小时", "yí gè xiǎoshí", "satu jam"),
            MatchPairItem("u4_s4_p1_m10_2", "两个小时", "liǎng gè xiǎoshí", "dua jam"),
            MatchPairItem("u4_s4_p1_m10_3", "没有时间", "méiyǒu shíjiān", "tidak ada waktu"),
            MatchPairItem("u4_s4_p1_m10_4", "有时间", "yǒu shíjiān", "ada waktu")
        )
    )"""
        ],
        "p2": [
            """    // 1. Soal 1: Pilihan Gambar (什么时候 -> kapan)
    Exercise(
        id = "u4_s4_p2_q1",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "什么时候",
        targetPinyin = "shénme shíhou",
        targetTranslation = "kapan",
        correctAnswer = "kapan",
        audioToSpeak = "什么时候",
        pictureOptions = listOf(
            PictureOption("u4_s4_p2_opt1", "kapan", "❓", R.drawable.ic_story_timer, true),
            PictureOption("u4_s4_p2_opt2", "siapa", "👤", R.drawable.ic_person_saya, false),
            PictureOption("u4_s4_p2_opt3", "di mana", "📍", R.drawable.ic_target, false),
            PictureOption("u4_s4_p2_opt4", "berapa", "🔢", R.drawable.ic_coin, false)
        )
    )""",
            """    // 2. Soal 2: Susun Kalimat (Kamu kapan pergi ke Beijing?)
    Exercise(
        id = "u4_s4_p2_q2",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Kamu kapan pergi ke Beijing?",
        targetHanzi = "你 什么时候 去 北京？",
        targetPinyin = "Nǐ shénme shíhou qù Běijīng?",
        wordChips = listOf("你:nǐ", "什么时候:shénme shíhou", "去:qù", "北京:Běijīng", "他:tā", "来:lái"),
        correctAnswer = "你,什么时候,去,北京",
        audioToSpeak = "你什么时候去北京？"
    )""",
            """    // 3. Soal 3: Ketuk Pasangan yang Sesuai (Kata Keterangan Waktu)
    Exercise(
        id = "u4_s4_p2_q3",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u4_s4_p2_m1", "什么时候", "shénme shíhou", "kapan"),
            MatchPairItem("u4_s4_p2_m2", "的时候", "de shíhou", "saat / ketika"),
            MatchPairItem("u4_s4_p2_m3", "现在", "xiànzài", "sekarang"),
            MatchPairItem("u4_s4_p2_m4", "小时", "xiǎoshí", "jam (durasi)")
        )
    )""",
            """    // 4. Soal 4: Ketik Pinyin (kapan -> shénmeshíhou)
    Exercise(
        id = "u4_s4_p2_q4",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "kapan",
        sentenceWithBlank = "什么时候 (________)",
        targetHanzi = "什么时候",
        targetPinyin = "shénme shíhou",
        correctAnswer = "shenmeshíhou",
        audioToSpeak = "什么时候"
    )""",
            """    // 5. Soal 5: Mendengar Kalimat (Rule 10: illustrationRes = 0)
    Exercise(
        id = "u4_s4_p2_q5",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Apa yang Anda dengar?",
        targetTranslation = "Kapan dia datang?",
        targetHanzi = "他 什么时候 来？",
        targetPinyin = "Tā shénme shíhou lái?",
        wordChips = listOf("他:tā", "什么时候:shénme shíhou", "来:lái", "去:qù", "你:nǐ"),
        correctAnswer = "他,什么时候,来",
        illustrationRes = 0,
        audioToSpeak = "他什么时候来？"
    )""",
            """    // 6. Soal 6: Pilihan Kalimat
    Exercise(
        id = "u4_s4_p2_q6",
        type = ExerciseType.SENTENCE_CHOICE,
        title = "Pilih terjemahan yang benar",
        targetHanzi = "我们 什么时候 见？",
        targetPinyin = "Wǒmen shénme shíhou jiàn?",
        targetTranslation = "Kita kapan bertemu?",
        correctAnswer = "Wǒmen shénme shíhou jiàn?\n我们 什么时候 见？",
        options = listOf(
            "Wǒmen shénme shíhou jiàn?\n我们 什么时候 见？",
            "Nǐmen shénme shíhou qù?\n你们 什么时候 去？",
            "Tāmen shénme shíhou lái?\n他们 什么时候 来？"
        ),
        audioToSpeak = "我们什么时候见？"
    )""",
            """    // 7. Soal 7: Pilihan Gambar (的时候 -> saat / ketika)
    Exercise(
        id = "u4_s4_p2_q7",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "时候",
        targetPinyin = "shíhou",
        targetTranslation = "saat / waktu",
        correctAnswer = "saat / waktu",
        audioToSpeak = "时候",
        pictureOptions = listOf(
            PictureOption("u4_s4_p2_opt7_1", "saat / waktu", "⏰", R.drawable.ic_story_timer, true),
            PictureOption("u4_s4_p2_opt7_2", "tempat", "📍", R.drawable.ic_target, false),
            PictureOption("u4_s4_p2_opt7_3", "orang", "👤", R.drawable.ic_person_guru, false),
            PictureOption("u4_s4_p2_opt7_4", "buku", "📚", R.drawable.ic_book, false)
        )
    )""",
            """    // 8. Soal 8: Ketik Pinyin (saat / waktu -> shíhou)
    Exercise(
        id = "u4_s4_p2_q8",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "saat / waktu",
        sentenceWithBlank = "时候 (________)",
        targetHanzi = "时候",
        targetPinyin = "shíhou",
        correctAnswer = "shihou",
        audioToSpeak = "时候"
    )""",
            """    // 9. Soal 9: Susun Kalimat (Kapan Anda makan?)
    Exercise(
        id = "u4_s4_p2_q9",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Kapan kamu makan?",
        targetHanzi = "你 什么时候 吃饭？",
        targetPinyin = "Nǐ shénme shíhou chīfàn?",
        wordChips = listOf("你:nǐ", "什么时候:shénme shíhou", "吃饭:chīfàn", "睡觉:shuìjiào", "去:qù"),
        correctAnswer = "你,什么时候,吃饭",
        audioToSpeak = "你什么时候吃饭？"
    )""",
            """    // 10. Soal 10: Ketuk Pasangan yang Sesuai (Rangkuman Pertanyaan Waktu)
    Exercise(
        id = "u4_s4_p2_q10",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u4_s4_p2_m10_1", "什么时候", "shénme shíhou", "kapan"),
            MatchPairItem("u4_s4_p2_m10_2", "什么时候见", "shénme shíhou jiàn", "kapan bertemu"),
            MatchPairItem("u4_s4_p2_m10_3", "有时间", "yǒu shíjiān", "punya waktu"),
            MatchPairItem("u4_s4_p2_m10_4", "三个小时", "sān gè xiǎoshí", "tiga jam")
        )
    )"""
        ]
    }

    # STAGE 5: Mengatur Janji & Jadwal Terpadu
    stages[5] = {
        "p1": [
            """    // 1. Soal 1: Pilihan Gambar (明天见 -> sampai jumpa besok)
    Exercise(
        id = "u4_s5_p1_q1",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "明天 见",
        targetPinyin = "míngtiān jiàn",
        targetTranslation = "sampai jumpa besok",
        correctAnswer = "sampai jumpa besok",
        audioToSpeak = "明天见",
        pictureOptions = listOf(
            PictureOption("u4_s5_p1_opt1", "sampai jumpa besok", "👋", R.drawable.ic_hand_wave, true),
            PictureOption("u4_s5_p1_opt2", "terima kasih", "🙏", R.drawable.ic_handshake, false),
            PictureOption("u4_s5_p1_opt3", "selamat tinggal", "🚪", R.drawable.ic_story_timer, false),
            PictureOption("u4_s5_p1_opt4", "sama-sama", "😊", R.drawable.ic_crown, false)
        )
    )""",
            """    // 2. Soal 2: Susun Kalimat (Besok jam tiga sore kita bertemu.)
    Exercise(
        id = "u4_s5_p1_q2",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Besok jam tiga kita bertemu.",
        targetHanzi = "明天 三 点 见。",
        targetPinyin = "Míngtiān sān diǎn jiàn.",
        wordChips = listOf("明天:míngtiān", "三:sān", "点:diǎn", "见:jiàn", "今天:jīntiān", "四:sì"),
        correctAnswer = "明天,三,点,见",
        audioToSpeak = "明天三点见。"
    )""",
            """    // 3. Soal 3: Ketuk Pasangan yang Sesuai (Jadwal & Janji Temu)
    Exercise(
        id = "u4_s5_p1_q3",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u4_s5_p1_m1", "明天见", "míngtiān jiàn", "sampai jumpa besok"),
            MatchPairItem("u4_s5_p1_m2", "星期一见", "xīngqīyī jiàn", "sampai jumpa hari senin"),
            MatchPairItem("u4_s5_p1_m3", "八点见", "bā diǎn jiàn", "sampai jumpa jam delapan"),
            MatchPairItem("u4_s5_p1_m4", "再见", "zàijiàn", "sampai jumpa")
        )
    )""",
            """    // 4. Soal 4: Ketik Pinyin (bertemu / melihat -> jiàn)
    Exercise(
        id = "u4_s5_p1_q4",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "bertemu / melihat",
        sentenceWithBlank = "见 (________)",
        targetHanzi = "见",
        targetPinyin = "jiàn",
        correctAnswer = "jian",
        audioToSpeak = "见"
    )""",
            """    // 5. Soal 5: Mendengar Kalimat (Rule 10: illustrationRes = 0)
    Exercise(
        id = "u4_s5_p1_q5",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Apa yang Anda dengar?",
        targetTranslation = "Hari ini jam lima sore bertemu.",
        targetHanzi = "今天 五 点 见。",
        targetPinyin = "Jīntiān wǔ diǎn jiàn.",
        wordChips = listOf("今天:jīntiān", "五:wǔ", "点:diǎn", "见:jiàn", "昨天:zuótiān", "六:liù"),
        correctAnswer = "今天,五,点,见",
        illustrationRes = 0,
        audioToSpeak = "今天五点见。"
    )""",
            """    // 6. Soal 6: Pilihan Kalimat
    Exercise(
        id = "u4_s5_p1_q6",
        type = ExerciseType.SENTENCE_CHOICE,
        title = "Pilih terjemahan yang benar",
        targetHanzi = "星期三 下午 见。",
        targetPinyin = "Xīngqīsān xiàwǔ jiàn.",
        targetTranslation = "Sampai jumpa Rabu sore.",
        correctAnswer = "Xīngqīsān xiàwǔ jiàn.\n星期三 下午 见。",
        options = listOf(
            "Xīngqīsān xiàwǔ jiàn.\n星期三 下午 见。",
            "Xīngqīsān shàngwǔ jiàn.\n星期三 上午 见。",
            "Xīngqīsì xiàwǔ jiàn.\n星期四 下午 见。"
        ),
        audioToSpeak = "星期三下午见。"
    )""",
            """    // 7. Soal 7: Pilihan Gambar (星期日见 -> sampai jumpa hari minggu)
    Exercise(
        id = "u4_s5_p1_q7",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "星期日 见",
        targetPinyin = "xīngqīrì jiàn",
        targetTranslation = "sampai jumpa hari Minggu",
        correctAnswer = "sampai jumpa hari Minggu",
        audioToSpeak = "星期日见",
        pictureOptions = listOf(
            PictureOption("u4_s5_p1_opt7_1", "sampai jumpa hari Minggu", "👋", R.drawable.ic_hand_wave, true),
            PictureOption("u4_s5_p1_opt7_2", "hari ini", "📅", R.drawable.ic_story_timer, false),
            PictureOption("u4_s5_p1_opt7_3", "belajar", "📖", R.drawable.ic_book, false),
            PictureOption("u4_s5_p1_opt7_4", "sekolah", "🏫", R.drawable.ic_cap, false)
        )
    )""",
            """    // 8. Soal 8: Ketik Pinyin (sampai jumpa besok -> míngtiān jiàn)
    Exercise(
        id = "u4_s5_p1_q8",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "sampai jumpa besok",
        sentenceWithBlank = "明天见 (________)",
        targetHanzi = "明天 见",
        targetPinyin = "míngtiān jiàn",
        correctAnswer = "mingtianjian",
        audioToSpeak = "明天见"
    )""",
            """    // 9. Soal 9: Susun Kalimat (Sampai jumpa jam dua.)
    Exercise(
        id = "u4_s5_p1_q9",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Sampai jumpa jam dua.",
        targetHanzi = "两 点 见。",
        targetPinyin = "Liǎng diǎn jiàn.",
        wordChips = listOf("两:liǎng", "点:diǎn", "见:jiàn", "二:èr", "半:bàn", "去:qù"),
        correctAnswer = "两,点,见",
        audioToSpeak = "两点见。"
    )""",
            """    // 10. Soal 10: Ketuk Pasangan yang Sesuai (Rangkuman Janji Temu)
    Exercise(
        id = "u4_s5_p1_q10",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u4_s5_p1_m10_1", "两点见", "liǎng diǎn jiàn", "jumpa jam dua"),
            MatchPairItem("u4_s5_p1_m10_2", "十点半见", "shí diǎn bàn jiàn", "jumpa jam 10:30"),
            MatchPairItem("u4_s5_p1_m10_3", "明天见", "míngtiān jiàn", "jumpa besok"),
            MatchPairItem("u4_s5_p1_m10_4", "什么时候见", "shénme shíhou jiàn", "kapan bertemu")
        )
    )"""
        ],
        "p2": [
            """    // 1. Soal 1: Pilihan Gambar (现在 -> sekarang)
    Exercise(
        id = "u4_s5_p2_q1",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "现在",
        targetPinyin = "xiànzài",
        targetTranslation = "sekarang",
        correctAnswer = "sekarang",
        audioToSpeak = "现在",
        pictureOptions = listOf(
            PictureOption("u4_s5_p2_opt1", "sekarang", "⏰", R.drawable.ic_story_timer, true),
            PictureOption("u4_s5_p2_opt2", "nanti", "⏳", R.drawable.ic_book, false),
            PictureOption("u4_s5_p2_opt3", "kemarin", "⏮️", R.drawable.ic_target, false),
            PictureOption("u4_s5_p2_opt4", "besok", "⏭️", R.drawable.ic_crown, false)
        )
    )""",
            """    // 2. Soal 2: Susun Kalimat (Hari ini tanggal 15 Oktober 2024.)
    Exercise(
        id = "u4_s5_p2_q2",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Hari ini 15 Oktober.",
        targetHanzi = "今天 是 十月 十五号。",
        targetPinyin = "Jīntiān shì shíyuè shíwǔhào.",
        wordChips = listOf("今天:jīntiān", "是:shì", "十月:shíyuè", "十五号:shíwǔhào", "明天:míngtiān", "九月:jiǔyuè"),
        correctAnswer = "今天,是,十月,十五号",
        audioToSpeak = "今天是十月十五号。"
    )""",
            """    // 3. Soal 3: Ketuk Pasangan yang Sesuai (Jadwal Lengkap)
    Exercise(
        id = "u4_s5_p2_q3",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u4_s5_p2_m1", "今天", "jīntiān", "hari ini"),
            MatchPairItem("u4_s5_p2_m2", "星期五", "xīngqīwǔ", "hari jumat"),
            MatchPairItem("u4_s5_p2_m3", "八点", "bā diǎn", "jam delapan"),
            MatchPairItem("u4_s5_p2_m4", "学校见", "xuéxiào jiàn", "bertemu di sekolah")
        )
    )""",
            """    // 4. Soal 4: Ketik Pinyin (jam 10 tepat -> shídiǎn)
    Exercise(
        id = "u4_s5_p2_q4",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "jam sepuluh",
        sentenceWithBlank = "十点 (________)",
        targetHanzi = "十点",
        targetPinyin = "shídiǎn",
        correctAnswer = "shidian",
        audioToSpeak = "十点"
    )""",
            """    // 5. Soal 5: Mendengar Kalimat (Rule 10: illustrationRes = 0)
    Exercise(
        id = "u4_s5_p2_q5",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Apa yang Anda dengar?",
        targetTranslation = "Kapan Anda pergi ke sekolah?",
        targetHanzi = "你 什么时候 去 学校？",
        targetPinyin = "Nǐ shénme shíhou qù xuéxiào?",
        wordChips = listOf("你:nǐ", "什么时候:shénme shíhou", "去:qù", "学校:xuéxiào", "来:lái", "看:kàn"),
        correctAnswer = "你,什么时候,去,学校",
        illustrationRes = 0,
        audioToSpeak = "你什么时候去学校？"
    )""",
            """    // 6. Soal 6: Pilihan Kalimat
    Exercise(
        id = "u4_s5_p2_q6",
        type = ExerciseType.SENTENCE_CHOICE,
        title = "Pilih terjemahan yang benar",
        targetHanzi = "明天 上午 九 点 见。",
        targetPinyin = "Míngtiān shàngwǔ jiǔ diǎn jiàn.",
        targetTranslation = "Sampai jumpa besok pagi jam 9.",
        correctAnswer = "Míngtiān shàngwǔ jiǔ diǎn jiàn.\n明天 上午 九 点 见。",
        options = listOf(
            "Míngtiān shàngwǔ jiǔ diǎn jiàn.\n明天 上午 九 点 见。",
            "Jīntiān xiàwǔ jiǔ diǎn jiàn.\n今天 下午 九 点 见。",
            "Míngtiān wǎnshang jiǔ diǎn jiàn.\n明天 晚上 九 点 见。"
        ),
        audioToSpeak = "明天上午九点见。"
    )""",
            """    // 7. Soal 7: Pilihan Gambar (星期六 -> hari Sabtu)
    Exercise(
        id = "u4_s5_p2_q7",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "星期六",
        targetPinyin = "xīngqīliù",
        targetTranslation = "hari Sabtu",
        correctAnswer = "hari Sabtu",
        audioToSpeak = "星期六",
        pictureOptions = listOf(
            PictureOption("u4_s5_p2_opt7_1", "hari Sabtu", "🏖️", R.drawable.ic_story_timer, true),
            PictureOption("u4_s5_p2_opt7_2", "hari Senin", "💼", R.drawable.ic_book, false),
            PictureOption("u4_s5_p2_opt7_3", "hari Rabu", "🗓️", R.drawable.ic_crown, false),
            PictureOption("u4_s5_p2_opt7_4", "hari Minggu", "☀️", R.drawable.ic_target, false)
        )
    )""",
            """    // 8. Soal 8: Ketik Pinyin (pagi hari -> shàngwǔ)
    Exercise(
        id = "u4_s5_p2_q8",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "pagi hari (menjelang siang)",
        sentenceWithBlank = "上午 (________)",
        targetHanzi = "上午",
        targetPinyin = "shàngwǔ",
        correctAnswer = "shangwu",
        audioToSpeak = "上午"
    )""",
            """    // 9. Soal 9: Susun Kalimat (Kita bertemu hari Minggu.)
    Exercise(
        id = "u4_s5_p2_q9",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Sampai jumpa hari Minggu.",
        targetHanzi = "星期天 见。",
        targetPinyin = "Xīngqītiān jiàn.",
        wordChips = listOf("星期天:xīngqītiān", "见:jiàn", "星期六:xīngqīliù", "去:qù", "明天:míngtiān"),
        correctAnswer = "星期天,见",
        audioToSpeak = "星期天见。"
    )""",
            """    // 10. Soal 10: Ketuk Pasangan yang Sesuai (Rangkuman Waktu & Aksi)
    Exercise(
        id = "u4_s5_p2_q10",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u4_s5_p2_m10_1", "昨天", "zuótiān", "kemarin"),
            MatchPairItem("u4_s5_p2_m10_2", "今天", "jīntiān", "hari ini"),
            MatchPairItem("u4_s5_p2_m10_3", "明天", "míngtiān", "besok"),
            MatchPairItem("u4_s5_p2_m10_4", "再见", "zàijiàn", "sampai jumpa")
        )
    )"""
        ]
    }

    # STAGE 6: Evaluasi Komprehensif Bab 4 (Waktu, Tanggal & Kalender)
    stages[6] = {
        "p1": [
            """    // 1. Soal 1: Pilihan Gambar (时间 -> waktu)
    Exercise(
        id = "u4_s6_p1_q1",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "时间",
        targetPinyin = "shíjiān",
        targetTranslation = "waktu",
        correctAnswer = "waktu",
        audioToSpeak = "时间",
        pictureOptions = listOf(
            PictureOption("u4_s6_p1_opt1", "waktu", "⏰", R.drawable.ic_story_timer, true),
            PictureOption("u4_s6_p1_opt2", "uang", "💰", R.drawable.ic_coin, false),
            PictureOption("u4_s6_p1_opt3", "buku", "📚", R.drawable.ic_book, false),
            PictureOption("u4_s6_p1_opt4", "orang", "👥", R.drawable.ic_people_group, false)
        )
    )""",
            """    // 2. Soal 2: Susun Kalimat (Kemarin tanggal 10 Oktober.)
    Exercise(
        id = "u4_s6_p1_q2",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Kemarin tanggal 10 Oktober.",
        targetHanzi = "昨天 是 十月 十号。",
        targetPinyin = "Zuótiān shì shíyuè shíhào.",
        wordChips = listOf("昨天:zuótiān", "是:shì", "十月:shíyuè", "十号:shíhào", "今天:jīntiān", "九号:jiǔhào"),
        correctAnswer = "昨天,是,十月,十号",
        audioToSpeak = "昨天是十月十号。"
    )""",
            """    // 3. Soal 3: Ketuk Pasangan yang Sesuai (Rangkuman Bab 4)
    Exercise(
        id = "u4_s6_p1_q3",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u4_s6_p1_m1", "年", "nián", "tahun"),
            MatchPairItem("u4_s6_p1_m2", "月", "yuè", "bulan"),
            MatchPairItem("u4_s6_p1_m3", "日", "rì", "hari / tanggal"),
            MatchPairItem("u4_s6_p1_m4", "星期", "xīngqī", "pekan / minggu")
        )
    )""",
            """    // 4. Soal 4: Ketik Pinyin (sekarang jam berapa -> xiànzàijǐdiǎn)
    Exercise(
        id = "u4_s6_p1_q4",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "jam berapa",
        sentenceWithBlank = "几点 (________)",
        targetHanzi = "几点",
        targetPinyin = "jǐdiǎn",
        correctAnswer = "jidian",
        audioToSpeak = "几点"
    )""",
            """    // 5. Soal 5: Mendengar Kalimat (Rule 10: illustrationRes = 0)
    Exercise(
        id = "u4_s6_p1_q5",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Apa yang Anda dengar?",
        targetTranslation = "Sekarang jam setengah enam.",
        targetHanzi = "现在 五 点 半。",
        targetPinyin = "Xiànzài wǔ diǎn bàn.",
        wordChips = listOf("现在:xiànzài", "五:wǔ", "点:diǎn", "半:bàn", "六:liù", "分:fēn"),
        correctAnswer = "现在,五,点,半",
        illustrationRes = 0,
        audioToSpeak = "现在五点半。"
    )""",
            """    // 6. Soal 6: Pilihan Kalimat
    Exercise(
        id = "u4_s6_p1_q6",
        type = ExerciseType.SENTENCE_CHOICE,
        title = "Pilih terjemahan yang benar",
        targetHanzi = "今天 是 星期日。",
        targetPinyin = "Jīntiān shì xīngqīrì.",
        targetTranslation = "Hari ini adalah hari Minggu.",
        correctAnswer = "Jīntiān shì xīngqīrì.\n今天 是 星期日。",
        options = listOf(
            "Jīntiān shì xīngqīrì.\n今天 是 星期日。",
            "Zuótiān shì xīngqīrì.\n昨天 是 星期日。",
            "Míngtiān shì xīngqīyī.\n明天 是 星期一。"
        ),
        audioToSpeak = "今天是星期日。"
    )""",
            """    // 7. Soal 7: Pilihan Gambar (半 -> 30 menit / setengah)
    Exercise(
        id = "u4_s6_p1_q7",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "半",
        targetPinyin = "bàn",
        targetTranslation = "setengah / separuh",
        correctAnswer = "setengah / separuh",
        audioToSpeak = "半",
        pictureOptions = listOf(
            PictureOption("u4_s6_p1_opt7_1", "setengah / separuh", "🌗", R.drawable.ic_story_timer, true),
            PictureOption("u4_s6_p1_opt7_2", "satu", "1️⃣", R.drawable.ic_coin, false),
            PictureOption("u4_s6_p1_opt7_3", "nol", "0️⃣", R.drawable.ic_crown, false),
            PictureOption("u4_s6_p1_opt7_4", "penuh", "🌕", R.drawable.ic_book, false)
        )
    )""",
            """    // 8. Soal 8: Ketik Pinyin (kapan -> shénmeshíhou)
    Exercise(
        id = "u4_s6_p1_q8",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "kapan",
        sentenceWithBlank = "什么时候 (________)",
        targetHanzi = "什么时候",
        targetPinyin = "shénme shíhou",
        correctAnswer = "shenmeshíhou",
        audioToSpeak = "什么时候"
    )""",
            """    // 9. Soal 9: Susun Kalimat (Besok jam dua kita bertemu.)
    Exercise(
        id = "u4_s6_p1_q9",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Besok jam dua kita bertemu.",
        targetHanzi = "明天 两 点 见。",
        targetPinyin = "Míngtiān liǎng diǎn jiàn.",
        wordChips = listOf("明天:míngtiān", "两:liǎng", "点:diǎn", "见:jiàn", "今天:jīntiān", "三:sān"),
        correctAnswer = "明天,两,点,见",
        audioToSpeak = "明天两点见。"
    )""",
            """    // 10. Soal 10: Ketuk Pasangan yang Sesuai (Rangkuman Waktu HSK 1)
    Exercise(
        id = "u4_s6_p1_q10",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u4_s6_p1_m10_1", "点", "diǎn", "jam (pukul)"),
            MatchPairItem("u4_s6_p1_m10_2", "分", "fēn", "menit"),
            MatchPairItem("u4_s6_p1_m10_3", "小时", "xiǎoshí", "jam (durasi)"),
            MatchPairItem("u4_s6_p1_m10_4", "时间", "shíjiān", "waktu")
        )
    )"""
        ],
        "p2": [
            """    // 1. Soal 1: Pilihan Gambar (明天 -> besok)
    Exercise(
        id = "u4_s6_p2_q1",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "明天",
        targetPinyin = "míngtiān",
        targetTranslation = "besok",
        correctAnswer = "besok",
        audioToSpeak = "明天",
        pictureOptions = listOf(
            PictureOption("u4_s6_p2_opt1", "besok", "⏭️", R.drawable.ic_story_timer, true),
            PictureOption("u4_s6_p2_opt2", "kemarin", "⏮️", R.drawable.ic_book, false),
            PictureOption("u4_s6_p2_opt3", "hari ini", "📅", R.drawable.ic_target, false),
            PictureOption("u4_s6_p2_opt4", "tahun lalu", "🗓️", R.drawable.ic_pouch, false)
        )
    )""",
            """    // 2. Soal 2: Susun Kalimat (Kamu ada waktu tidak?)
    Exercise(
        id = "u4_s6_p2_q2",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Apakah kamu punya waktu?",
        targetHanzi = "你 有 时间 吗？",
        targetPinyin = "Nǐ yǒu shíjiān ma?",
        wordChips = listOf("你:nǐ", "有:yǒu", "时间:shíjiān", "吗:ma", "没有:méiyǒu", "他:tā"),
        correctAnswer = "你,有,时间,吗",
        audioToSpeak = "你有时间吗？"
    )""",
            """    // 3. Soal 3: Ketuk Pasangan yang Sesuai (Rangkuman Akhir Bab 4)
    Exercise(
        id = "u4_s6_p2_q3",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u4_s6_p2_m1", "今年", "jīnnián", "tahun ini"),
            MatchPairItem("u4_s6_p2_m2", "明年", "míngnián", "tahun depan"),
            MatchPairItem("u4_s6_p2_m3", "去年", "qùnián", "tahun lalu"),
            MatchPairItem("u4_s6_p2_m4", "现在", "xiànzài", "sekarang")
        )
    )""",
            """    // 4. Soal 4: Ketik Pinyin (menit durasi -> fēnzhōng)
    Exercise(
        id = "u4_s6_p2_q4",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "menit (durasi)",
        sentenceWithBlank = "分钟 (________)",
        targetHanzi = "分钟",
        targetPinyin = "fēnzhōng",
        correctAnswer = "fenzhong",
        audioToSpeak = "分钟"
    )""",
            """    // 5. Soal 5: Mendengar Kalimat (Rule 10: illustrationRes = 0)
    Exercise(
        id = "u4_s6_p2_q5",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Apa yang Anda dengar?",
        targetTranslation = "Tahun depan saya pergi ke Tiongkok.",
        targetHanzi = "明年 我 去 中国。",
        targetPinyin = "Míngnián wǒ qù Zhōngguó.",
        wordChips = listOf("明年:míngnián", "我:wǒ", "去:qù", "中国:Zhōngguó", "去年:qùnián", "来:lái"),
        correctAnswer = "明年,我,去,中国",
        illustrationRes = 0,
        audioToSpeak = "明年我去中国。"
    )""",
            """    // 6. Soal 6: Pilihan Kalimat
    Exercise(
        id = "u4_s6_p2_q6",
        type = ExerciseType.SENTENCE_CHOICE,
        title = "Pilih terjemahan yang benar",
        targetHanzi = "现在 是 两 点。",
        targetPinyin = "Xiànzài shì liǎng diǎn.",
        targetTranslation = "Sekarang adalah jam dua.",
        correctAnswer = "Xiànzài shì liǎng diǎn.\n现在 是 两 点。",
        options = listOf(
            "Xiànzài shì liǎng diǎn.\n现在 是 两 点。",
            "Xiànzài shì èr diǎn.\n现在 是 二 点。",
            "Xiànzài shì sān diǎn.\n现在 是 三 点。"
        ),
        audioToSpeak = "现在是两点。"
    )""",
            """    // 7. Soal 7: Pilihan Gambar (昨天 -> kemarin)
    Exercise(
        id = "u4_s6_p2_q7",
        type = ExerciseType.PICTURE_CHOICE,
        title = "Pilih gambar yang benar",
        targetHanzi = "昨天",
        targetPinyin = "zuótiān",
        targetTranslation = "kemarin",
        correctAnswer = "kemarin",
        audioToSpeak = "昨天",
        pictureOptions = listOf(
            PictureOption("u4_s6_p2_opt7_1", "kemarin", "⏮️", R.drawable.ic_book, true),
            PictureOption("u4_s6_p2_opt7_2", "hari ini", "📅", R.drawable.ic_story_timer, false),
            PictureOption("u4_s6_p2_opt7_3", "besok", "⏭️", R.drawable.ic_target, false),
            PictureOption("u4_s6_p2_opt7_4", "lusa", "⏩", R.drawable.ic_crown, false)
        )
    )""",
            """    // 8. Soal 8: Ketik Pinyin (bertemu besok -> míngtiān jiàn)
    Exercise(
        id = "u4_s6_p2_q8",
        type = ExerciseType.PINYIN_KEYBOARD,
        title = "Ketik pinyin yang tepat",
        targetTranslation = "sampai jumpa besok",
        sentenceWithBlank = "明天见 (________)",
        targetHanzi = "明天 见",
        targetPinyin = "míngtiān jiàn",
        correctAnswer = "mingtianjian",
        audioToSpeak = "明天见"
    )""",
            """    // 9. Soal 9: Susun Kalimat (Evaluasi Akhir Waktu Bab 4)
    Exercise(
        id = "u4_s6_p2_q9",
        type = ExerciseType.SENTENCE_BUILDER,
        title = "Susun kalimat berikut",
        targetTranslation = "Kapan kita bertemu?",
        targetHanzi = "我们 什么时候 见？",
        targetPinyin = "Wǒmen shénme shíhou jiàn?",
        wordChips = listOf("我们:wǒmen", "什么时候:shénme shíhou", "见:jiàn", "他们:tāmen", "去:qù", "哪儿:nǎr"),
        correctAnswer = "我们,什么时候,见",
        audioToSpeak = "我们什么时候见？"
    )""",
            """    // 10. Soal 10: Ketuk Pasangan yang Sesuai (Grand Review Waktu & Kalender)
    Exercise(
        id = "u4_s6_p2_q10",
        type = ExerciseType.MATCH_PAIRS,
        title = "Ketuk pasangan yang sesuai",
        correctAnswer = "ALL_MATCHED",
        matchPairs = listOf(
            MatchPairItem("u4_s6_p2_m10_1", "昨天", "zuótiān", "kemarin"),
            MatchPairItem("u4_s6_p2_m10_2", "今天", "jīntiān", "hari ini"),
            MatchPairItem("u4_s6_p2_m10_3", "明天", "míngtiān", "besok"),
            MatchPairItem("u4_s6_p2_m10_4", "什么时候", "shénme shíhou", "kapan")
        )
    )"""
        ]
    }

    # Write all 6 files
    for s_idx in range(1, 7):
        filename = f"{base_dir}/Bab4Stage{s_idx}Data.kt"
        p1_code = ",\n\n".join(stages[s_idx]["p1"])
        p2_code = ",\n\n".join(stages[s_idx]["p2"])
        
        content = f"""package com.example.chineselearning.data.repository

import com.example.chineselearning.R
import com.example.chineselearning.data.model.Exercise
import com.example.chineselearning.data.model.ExerciseType
import com.example.chineselearning.data.model.MatchPairItem
import com.example.chineselearning.data.model.PictureOption

val bab4Stage{s_idx}Part1Exercises = listOf(
{p1_code}
)

val bab4Stage{s_idx}Part2Exercises = listOf(
{p2_code}
)
"""
        with open(filename, "w", encoding="utf-8") as f:
            f.write(content)
        print(f"Written {filename}")

if __name__ == "__main__":
    create_bab4_files()
