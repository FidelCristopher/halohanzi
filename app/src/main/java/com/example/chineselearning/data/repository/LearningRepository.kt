package com.example.chineselearning.data.repository

import androidx.compose.ui.graphics.Color
import com.example.chineselearning.data.model.*

object LearningRepository {

    private val globalWordDictionary = mutableMapOf<String, WordToken>()
    private val savedWords = mutableListOf<Word>()

    init {
        registerToken("你好", "nǐ hǎo", "Halo / Salam", "Kata sapaan paling umum dalam bahasa Mandarin.")
        registerToken("我", "wǒ", "Saya / Aku", "Kata ganti orang pertama tunggal.")
        registerToken("叫", "jiào", "Bernama / Dipanggil", "Digunakan untuk memperkenalkan nama: 我叫...")
        registerToken("大卫", "Dàwèi", "David (Nama)", "Nama Barat yang ditransliterasikan ke Hanzi.")
        registerToken("布迪", "Bùdí", "Budi (Nama)", "Nama populer Indonesia dalam transliterasi Mandarin.")
        registerToken("王飞", "Wáng Fēi", "Wang Fei (Nama)", "Nama orang di Tiongkok.")
        registerToken("是", "shì", "Adalah / Ialah", "Kata kerja penghubung (to be).")
        registerToken("学生", "xuéshēng", "Murid / Siswa", "Kombinasi 学 (belajar) + 生 (orang).")
        registerToken("不", "bù", "Tidak / Bukan", "Kata negasi.")
        registerToken("老师", "lǎoshī", "(Bapak atau Ibu) Guru", "Sapaan hormat untuk pengajar.")
        registerToken("她", "tā", "Dia (perempuan)", "Kata ganti orang ketiga perempuan.")
        registerToken("他", "tā", "Dia (laki-laki)", "Kata ganti orang ketiga laki-laki.")
        registerToken("人", "rén", "Orang", "Manusia / warga.")
        registerToken("中国人", "Zhōngguó rén", "Orang Tiongkok", "中国 + 人.")
        registerToken("印尼", "Yìnní", "Indonesia (singkatan)", "Nama negara Indonesia.")
        registerToken("印尼人", "Yìnní rén", "Orang Indonesia", "Warga negara Indonesia.")
        registerToken("印度尼西亚", "Yìndùníxīyà", "(negara) Indonesia", "Nama lengkap resmi negara Indonesia dalam bahasa Mandarin.")
        registerToken("在", "zài", "Di / Sedang berada di", "Kata depan lokasi.")
        registerToken("学校", "xuéxiào", "Sekolah", "Tempat belajar.")
        registerToken("认识", "rènshi", "Mengenal / Kenal", "认识你很高兴 = Senang berkenalan denganmu.")
        registerToken("说", "shuō", "Berkata / Berbicara", "Kata kerja bicara.")
        registerToken("很", "hěn", "Sangat / Cukup", "Kata keterangan tingkat.")
        registerToken("高兴", "gāoxìng", "Senang / Gembira", "Merasa bahagia.")
        registerToken("也", "yě", "Juga / Pula", "Sebelum kata kerja.")
        registerToken("谢谢", "xièxie", "Terima kasih", "Ucapan syukur.")
        registerToken("再见", "zàijiàn", "Sampai jumpa", "Sampai bertemu lagi.")

        // Food & Daily Life
        registerToken("吃", "chī", "Makan", "Mengonsumsi makanan.")
        registerToken("喝", "hē", "Minum", "Mengonsumsi minuman.")
        registerToken("茶", "chá", "Teh", "Minuman teh.")
        registerToken("绿茶", "lǜchá", "Teh Hijau", "Teh hijau khas.")
        registerToken("水", "shuǐ", "Air", "Air minum.")
        registerToken("包子", "bāozi", "Bakpao", "Roti kukus isi.")
        registerToken("米饭", "mǐfàn", "Nasi", "Nasi putih matang.")
        registerToken("炒面", "chǎomiàn", "Mie Goreng", "Mie tumis.")
        registerToken("喜欢", "xǐhuan", "Suka / Menyukai", "Menyatakan rasa suka.")
        registerToken("好吃", "hǎochī", "Enak / Lezat", "Makanan lezat.")
        registerToken("多少钱", "duōshao qián", "Berapa harganya?", "Menanyakan harga.")
        registerToken("块", "kuài", "Yuan (mata uang)", "Satuan mata uang.")
    }

    private fun registerToken(hanzi: String, pinyin: String, meaning: String, detail: String = "") {
        globalWordDictionary[hanzi] = WordToken(hanzi, pinyin, meaning, detail)
    }

    fun findToken(hanzi: String): WordToken {
        return globalWordDictionary[hanzi] ?: WordToken(
            hanzi = hanzi,
            pinyin = "",
            meaning = "Kosakata Mandarin",
            detail = "Ketuk ikon audio untuk melafalkan kata ini."
        )
    }

    fun getSavedWords(): List<Word> = savedWords

    fun toggleSaveWord(word: Word): Boolean {
        val existingIndex = savedWords.indexOfFirst { it.hanzi == word.hanzi }
        return if (existingIndex >= 0) {
            savedWords.removeAt(existingIndex)
            false
        } else {
            savedWords.add(word.copy(isSaved = true))
            true
        }
    }

    fun isWordSaved(hanzi: String): Boolean {
        return savedWords.any { it.hanzi == hanzi }
    }

    // ==========================================
    // STORIES (GRADED READERS)
    // ==========================================
    val stories: List<Story> = listOf(
        Story(
            id = "story_1",
            titleHanzi = "我的新朋友",
            titlePinyin = "Wǒ de Xīn Péngyou",
            titleTranslation = "Teman Baru Saya",
            level = "HSK 1",
            category = "Perkenalan & Kampus",
            description = "Cerita tentang pertemuan pertama David dengan teman barunya Li Hua di kampus.",
            coverEmoji = "🎓",
            estimatedReadMinutes = 2,
            sentences = listOf(
                Sentence(
                    id = "s1_1",
                    hanzi = "你好！我叫大卫。",
                    pinyin = "Nǐ hǎo! Wǒ jiào Dàwèi.",
                    translation = "Halo! Nama saya David.",
                    tokens = listOf(findToken("你好"), findToken("我"), findToken("叫"), findToken("大卫"))
                ),
                Sentence(
                    id = "s1_2",
                    hanzi = "我是学生，我不是老师。",
                    pinyin = "Wǒ shì xuésheng, wǒ bú shì lǎoshī.",
                    translation = "Saya murid, saya bukan guru.",
                    tokens = listOf(findToken("我"), findToken("是"), findToken("学生"), findToken("不"), findToken("是"), findToken("老师"))
                ),
                Sentence(
                    id = "s1_3",
                    hanzi = "她是李华，她是中国人。",
                    pinyin = "Tā shì Lǐ Huá, tā shì Zhōngguó rén.",
                    translation = "Dia adalah Li Hua, dia orang Tiongkok.",
                    tokens = listOf(findToken("她"), findToken("是"), WordToken("李华", "Lǐ Huá", "Li Hua"), findToken("她"), findToken("是"), findToken("中国人"))
                ),
                Sentence(
                    id = "s1_4",
                    hanzi = "我们在学校认识。",
                    pinyin = "Wǒmen zài xuéxiào rènshi.",
                    translation = "Kami berkenalan di sekolah.",
                    tokens = listOf(WordToken("我们", "wǒmen", "Kami"), findToken("在"), findToken("学校"), findToken("认识"))
                ),
                Sentence(
                    id = "s1_5",
                    hanzi = "李华说：“很高兴认识你！”",
                    pinyin = "Lǐ Huá shuō: \"Hěn gāoxìng rènshi nǐ!\"",
                    translation = "Li Hua berkata: \"Senang berkenalan denganmu!\"",
                    tokens = listOf(WordToken("李华", "Lǐ Huá", "Li Hua"), findToken("说"), findToken("很"), findToken("高兴"), findToken("认识"), WordToken("你", "nǐ", "Kamu"))
                ),
                Sentence(
                    id = "s1_6",
                    hanzi = "我说：“我也很高兴认识你，谢谢！”",
                    pinyin = "Wǒ shuō: \"Wǒ yě hěn gāoxìng rènshi nǐ, xièxie!\"",
                    translation = "Saya berkata: \"Saya juga senang berkenalan denganmu, terima kasih!\"",
                    tokens = listOf(findToken("我"), findToken("说"), findToken("我"), findToken("也"), findToken("很"), findToken("高兴"), findToken("认识"), WordToken("你", "nǐ", "Kamu"), findToken("谢谢"))
                ),
                Sentence(
                    id = "s1_7",
                    hanzi = "到了下午，我们说再见。",
                    pinyin = "Dào le xiàwǔ, wǒmen shuō zàijiàn.",
                    translation = "Sore hari tiba, kami mengucapkan sampai jumpa.",
                    tokens = listOf(WordToken("到了", "dào le", "Tiba"), WordToken("下午", "xiàwǔ", "Sore"), WordToken("我们", "wǒmen", "Kami"), findToken("说"), findToken("再见"))
                )
            ),
            questions = listOf(
                StoryQuestion(
                    id = "q1_1",
                    questionText = "Siapakah David? (大卫是谁？)",
                    options = listOf("Guru (老师)", "Murid (学生)", "Dokter (医生)", "Pelayan (服务员)"),
                    correctAnswerIndex = 1,
                    explanation = "Di teks kalimat ke-2: '我是学生，我不是老师' (Saya murid, bukan guru)."
                ),
                StoryQuestion(
                    id = "q1_2",
                    questionText = "Di mana mereka berkenalan? (他们在哪里认识？)",
                    options = listOf("Di pasar (在市场)", "Di sekolah (在学校)", "Di restoran (在饭馆)", "Di rumah (在家里)"),
                    correctAnswerIndex = 1,
                    explanation = "Kalimat ke-4: '我们在学校认识' (Kami berkenalan di sekolah)."
                )
            )
        )
    )

    // ==========================================
    // EXERCISES FROM SCREENSHOTS (HELLO CHINESE)
    // ==========================================
    private val unit1Lessons = listOf(
        Lesson(
            id = "lesson_1",
            title = "Membuat teman baru (1)",
            subtitle = "Sapaan dasar & Identitas",
            grammarNote = "Pola kalimat 'A 是 B' (A adalah B). Negasi menggunakan '不是'. Contoh: 我是印尼人 (Saya orang Indonesia).",
            newWords = listOf(
                Word("w1", "你好", "nǐ hǎo", "Halo", "Sapaan", "你好！", "Nǐ hǎo!", "Halo!"),
                Word("w2", "印度尼西亚", "Yìndùníxīyà", "(negara) Indonesia", "Nama negara", "我是印度尼西亚人。", "Wǒ shì Yìndùníxīyà rén.", "Saya orang Indonesia."),
                Word("w3", "学生", "xuéshēng", "Murid / Siswa", "Kata benda", "布迪是学生。", "Bùdí shì xuéshēng.", "Budi adalah seorang murid."),
                Word("w4", "老师", "lǎoshī", "(Bapak atau Ibu) Guru", "Kata benda", "老师好！", "Lǎoshī hǎo!", "Halo Guru!")
            ),
            exercises = listOf(
                // 1. Screenshot 4: "Pilih gambar yang benar"
                Exercise(
                    id = "ex_pic_1",
                    type = ExerciseType.PICTURE_CHOICE,
                    title = "Pilih gambar yang benar",
                    targetHanzi = "印度尼西亚",
                    targetPinyin = "Yìndùníxīyà",
                    targetTranslation = "(negara) Indonesia",
                    correctAnswer = "(negara) Indonesia",
                    audioToSpeak = "印度尼西亚",
                    pictureOptions = listOf(
                        PictureOption("pic_1", "(negara)\nIndonesia", "🇮🇩", isCorrect = true),
                        PictureOption("pic_2", "murid", "👨‍🎓", isCorrect = false),
                        PictureOption("pic_3", "saya", "🙋‍♂️", isCorrect = false),
                        PictureOption("pic_4", "guru", "👩‍🏫", isCorrect = false)
                    )
                ),

                // 2. Screenshot 6: "Lengkapi terjemahan"
                Exercise(
                    id = "ex_fill_1",
                    type = ExerciseType.FILL_BLANK,
                    title = "Lengkapi terjemahan",
                    targetHanzi = "我 是 印度尼西亚 人 。",
                    targetPinyin = "Wǒ shì Yìndùníxīyà rén .",
                    targetTranslation = "Saya adalah orang Indonesia.",
                    sentenceWithBlank = "Saya ________ orang Indonesia.",
                    options = listOf("adalah", "kenal", "bukan"),
                    correctAnswer = "adalah",
                    audioToSpeak = "我是印度尼西亚人。"
                ),

                // 3. Screenshot 7 & 8: "Pilih terjemahan yang benar"
                Exercise(
                    id = "ex_trans_1",
                    type = ExerciseType.SENTENCE_CHOICE,
                    title = "Pilih terjemahan yang benar",
                    targetHanzi = "老师，你好，我是印尼人。",
                    targetPinyin = "Lǎoshī, nǐhǎo, wǒ shì Yìnní rén.",
                    targetTranslation = "Halo (Bapak atau Ibu) Guru, saya adalah orang Indonesia.",
                    options = listOf(
                        "Halo (Bapak atau Ibu) Guru, saya adalah orang Indonesia.",
                        "Halo, (Bapak atau Ibu) Guru.",
                        "Budi adalah orang Indonesia.",
                        "Halo, saya adalah seorang guru."
                    ),
                    correctAnswer = "Halo (Bapak atau Ibu) Guru, saya adalah orang Indonesia.",
                    audioToSpeak = "老师，你好，我是印尼人。"
                ),

                // 4. Screenshot 9: "Apa yang Anda dengar?" (Sentence Builder)
                Exercise(
                    id = "ex_builder_1",
                    type = ExerciseType.SENTENCE_BUILDER,
                    title = "Apa yang Anda dengar?",
                    targetHanzi = "布迪 是 学生 。",
                    targetPinyin = "Bùdí shì xuéshēng .",
                    targetTranslation = "Budi adalah seorang murid.",
                    wordChips = listOf("是", "人", "你好", "学生", "老师", "印尼"),
                    correctAnswer = "是,学生",
                    audioToSpeak = "布迪是学生。"
                ),

                // 5. Screenshot 10: "Pilih terjemahan yang benar"
                Exercise(
                    id = "ex_trans_2",
                    type = ExerciseType.SENTENCE_CHOICE,
                    title = "Pilih terjemahan yang benar",
                    targetHanzi = "Budi adalah seorang murid.",
                    targetTranslation = "Budi adalah seorang murid.",
                    options = listOf(
                        "王飞 是 学生 。",
                        "我 是 学生 。",
                        "布迪 是 学生 。",
                        "我 是 布迪 。"
                    ),
                    correctAnswer = "布迪 是 学生 。",
                    audioToSpeak = "布迪是学生。"
                ),

                // 6. Screenshot 11 & 12: "Ketuk pasangan yang sesuai" (Match Pairs)
                Exercise(
                    id = "ex_match_1",
                    type = ExerciseType.MATCH_PAIRS,
                    title = "Ketuk pasangan yang sesuai",
                    correctAnswer = "ALL_MATCHED",
                    matchPairs = listOf(
                        MatchPairItem("m1", "印度尼西亚", "Yìndùníxīyà", "(negara) Indonesia"),
                        MatchPairItem("m2", "学生", "xuéshēng", "murid"),
                        MatchPairItem("m3", "老师", "lǎoshī", "guru"),
                        MatchPairItem("m4", "人", "rén", "orang"),
                        MatchPairItem("m5", "是", "shì", "adalah")
                    )
                )
            )
        )
    )

    // ==========================================
    // UNITS (LEARNING PATH)
    // ==========================================
    val units: List<UnitCourse> = listOf(
        UnitCourse(
            id = "unit_1",
            unitNumber = 1,
            title = "Membuat teman baru",
            subtitle = "Sapaan dasar & Perkenalan diri",
            bannerTitle = "Membuat teman baru",
            emoji = "👋",
            level = "Level 1",
            story = stories[0],
            lessons = unit1Lessons,
            nodes = listOf(
                PathNode("node_1", "Sapaan 1", Color(0xFFE91E63), NodeIconType.CAP, isCompleted = true, lessonId = "lesson_1"),
                PathNode("node_2", "Sapaan 2", Color(0xFFFFC107), NodeIconType.CAP, isCompleted = true, lessonId = "lesson_1"),
                PathNode("node_3", "Latihan H", Color(0xFFFFC107), NodeIconType.DUMBBELL, isCompleted = true, lessonId = "lesson_1"),
                PathNode("node_4", "Identitas", Color(0xFFFFC107), NodeIconType.CAP, isCompleted = false, lessonId = "lesson_1"),
                PathNode("node_5", "Review H", Color(0xFFFFC107), NodeIconType.DUMBBELL, isCompleted = false, lessonId = "lesson_1"),
                PathNode("node_6", "Checkpoint", Color(0xFFFFB300), NodeIconType.CHEST, isCompleted = false, lessonId = "lesson_1"),
                PathNode("node_7", "Rest area", Color(0xFF03A9F4), NodeIconType.REST_AREA, isCompleted = false, lessonId = "lesson_1")
            )
        )
    )
}
