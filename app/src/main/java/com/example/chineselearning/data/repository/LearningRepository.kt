package com.example.chineselearning.data.repository

import com.example.chineselearning.data.model.*

object LearningRepository {

    // --- DAFTAR KATA LENGKAP UNTUK KAMUS CEPAT ---
    private val globalWordDictionary = mutableMapOf<String, WordToken>()

    // Simpanan kata bookmark pengguna
    private val savedWords = mutableListOf<Word>()

    init {
        // Register token kata umum ke kamus instan
        registerToken("你好", "nǐ hǎo", "Halo / Salam", "Kata sapaan paling umum dalam bahasa Mandarin.")
        registerToken("我", "wǒ", "Saya / Aku", "Kata ganti orang pertama tunggal.")
        registerToken("叫", "jiào", "Bernama / Dipanggil", "Digunakan untuk memperkenalkan nama: 我叫...")
        registerToken("大卫", "Dàwèi", "David (Nama orang)", "Nama Barat yang ditransliterasikan ke Hanzi.")
        registerToken("是", "shì", "Adalah / Ialah", "Kata kerja penghubung (to be), mirip 'is/am/are'.")
        registerToken("学生", "xuéshēng", "Murid / Siswa", "Kombinasi 学 (belajar) + 生 (orang/kelahiran).")
        registerToken("不", "bù", "Tidak / Bukan", "Kata ingkar negasi. Berubah nada jadi 'bú' jika di depan nada ke-4.")
        registerToken("老师", "lǎoshī", "Guru / Pengajar", "Sapaan hormat untuk pengajar.")
        registerToken("她", "tā", "Dia (perempuan)", "Memiliki radikal perempuan 女 di sisi kiri.")
        registerToken("他", "tā", "Dia (laki-laki)", "Memiliki radikal orang 亻 di sisi kiri.")
        registerToken("中国人", "Zhōngguó rén", "Orang Tiongkok", "中国 (Negara Tiongkok) + 人 (orang).")
        registerToken("印尼人", "Yìnní rén", "Orang Indonesia", "印尼 (Indonesia) + 人 (orang).")
        registerToken("在", "zài", "Di / Sedang berada di", "Kata depan penunjuk lokasi.")
        registerToken("学校", "xuéxiào", "Sekolah / Kampus", "Tempat belajar dan menuntut ilmu.")
        registerToken("认识", "rènshi", "Mengenal / Berkenalan", "认识你很高兴 = Senang berkenalan denganmu.")
        registerToken("说", "shuō", "Berkata / Berbicara", "Kata kerja berbicara atau mengatakan sesuatu.")
        registerToken("很", "hěn", "Sangat / Cukup", "Kata keterangan tingkat. Sering diletakkan sebelum kata sifat.")
        registerToken("高兴", "gāoxìng", "Senang / Gembira", "Merasa bahagia atau senang.")
        registerToken("也", "yě", "Juga / Pula", "Selalu diletakkan sebelum kata kerja atau kata sifat.")
        registerToken("谢谢", "xièxie", "Terima kasih", "Ucapan rasa terima kasih.")
        registerToken("再见", "zàijiàn", "Sampai jumpa", "Secara harfiah berarti 'bertemu lagi' (再 = lagi, 见 = bertemu).")
        
        // Makanan & Minuman
        registerToken("吃", "chī", "Makan", "Kata kerja mengonsumsi makanan.")
        registerToken("喝", "hē", "Minum", "Kata kerja mengonsumsi minuman.")
        registerToken("茶", "chá", "Teh", "Minuman teh tradisional Tiongkok.")
        registerToken("绿茶", "lǜchá", "Teh Hijau", "Teh tanpa fermentasi yang populer.")
        registerToken("水", "shuǐ", "Air", "Air mineral atau air putih.")
        registerToken("包子", "bāozi", "Bakpao", "Roti kukus dengan aneka isian daging atau sayur.")
        registerToken("米饭", "mǐfàn", "Nasi putih", "Nasi yang sudah dimasak matang.")
        registerToken("炒面", "chǎomiàn", "Mie goreng", "Mie yang dimasak dengan cara ditumis.")
        registerToken("喜欢", "xǐhuan", "Suka / Menyukai", "Menyatakan rasa suka terhadap benda atau aktivitas.")
        registerToken("好吃", "hǎochī", "Enak / Lezat (makanan)", "Gabungan 好 (bagus) + 吃 (makan).")
        registerToken("好喝", "hǎohē", "Enak / Segar (minuman)", "Gabungan 好 (bagus) + 喝 (minum).")
        registerToken("多少钱", "duōshao qián", "Berapa harganya?", "Kata tanya menanyakan harga barang.")
        registerToken("块", "kuài", "Yuan (mata uang)", "Satuan lisan untuk mata uang Renminbi/Yuan.")
        
        // Keluarga & Angka
        registerToken("家", "jiā", "Keluarga / Rumah", "Tempat tinggal atau anggota keluarga.")
        registerToken("爸爸", "bàba", "Ayah / Papa", "Orang tua laki-laki.")
        registerToken("妈妈", "māma", "Ibu / Mama", "Orang tua perempuan.")
        registerToken("哥哥", "gēge", "Kakak laki-laki", "Saudara laki-laki yang lebih tua.")
        registerToken("妹妹", "mèimei", "Adik perempuan", "Saudara perempuan yang lebih muda.")
        registerToken("有", "yǒu", "Mempunyai / Ada", "Kata kerja kepemilikan atau keberadaan.")
        registerToken("没有", "méiyǒu", "Tidak punya / Tidak ada", "Bentuk negasi dari 有.")
        registerToken("岁", "suì", "Tahun (umur / usia)", "Satuan penghitung usia seseorang.")
        registerToken("几", "jǐ", "Berapa (untuk angka kecil)", "Kata tanya jumlah biasanya < 10.")
        registerToken("今天", "jīntiān", "Hari ini", "Waktu hari sekarang.")
        registerToken("明天", "míngtiān", "Besok", "Hari berikutnya.")
        registerToken("昨天", "zuótiān", "Kemarin", "Hari sebelum hari ini.")
        
        // Belanja & Arah
        registerToken("买", "mǎi", "Membeli", "Kata kerja transaksi pembelian barang.")
        registerToken("苹果", "píngguǒ", "Buah apel", "Buah-buahan manis berair.")
        registerToken("太贵了", "tài guì le", "Terlalu mahal!", "Ungkapan tawar menawar di pasar.")
        registerToken("便宜", "piányi", "Murah", "Harga yang terjangkau.")
        registerToken("去", "qù", "Pergi ke", "Berpindah ke suatu tempat tujuan.")
        registerToken("火车站", "huǒchēzhàn", "Stasiun kereta api", "Tempat naik dan turun kereta api.")
        registerToken("怎么走", "zěnme zǒu", "Bagaimana jalannya?", "Menanyakan rute perjalanan.")
        registerToken("左", "zuǒ", "Kiri", "Arah sebelah kiri.")
        registerToken("右", "yòu", "Kanan", "Arah sebelah kanan.")
        registerToken("前", "qián", "Depan", "Arah depan / muka.")
    }

    private fun registerToken(hanzi: String, pinyin: String, meaning: String, detail: String = "") {
        globalWordDictionary[hanzi] = WordToken(hanzi, pinyin, meaning, detail)
    }

    fun findToken(hanzi: String): WordToken {
        return globalWordDictionary[hanzi] ?: WordToken(
            hanzi = hanzi,
            pinyin = "",
            meaning = "Arti kata Mandarin",
            detail = "Klik dengarkan audio untuk melafalkan kata ini."
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
    // DATA CERITA BERJENJANG (GRADED READERS)
    // ==========================================
    val stories: List<Story> = listOf(
        // Cerita 1 - HSK 1 Pemula
        Story(
            id = "story_1",
            titleHanzi = "我的新朋友",
            titlePinyin = "Wǒ de Xīn Péngyou",
            titleTranslation = "Teman Baru Saya",
            level = "HSK 1",
            category = "Perkenalan & Sekolah",
            description = "Cerita pendek tentang pertemuan pertama David dengan teman barunya di kampus Beijing.",
            coverEmoji = "🎓",
            estimatedReadMinutes = 2,
            sentences = listOf(
                Sentence(
                    id = "s1_1",
                    hanzi = "你好！我叫大卫。",
                    pinyin = "Nǐ hǎo! Wǒ jiào Dàwèi.",
                    translation = "Halo! Nama saya David.",
                    tokens = listOf(
                        findToken("你好"),
                        findToken("我"),
                        findToken("叫"),
                        findToken("大卫")
                    )
                ),
                Sentence(
                    id = "s1_2",
                    hanzi = "我是学生，我不是老师。",
                    pinyin = "Wǒ shì xuésheng, wǒ bú shì lǎoshī.",
                    translation = "Saya seorang murid, saya bukan guru.",
                    tokens = listOf(
                        findToken("我"),
                        findToken("是"),
                        findToken("学生"),
                        findToken("不"),
                        findToken("是"),
                        findToken("老师")
                    )
                ),
                Sentence(
                    id = "s1_3",
                    hanzi = "她是李华，她是中国人。",
                    pinyin = "Tā shì Lǐ Huá, tā shì Zhōngguó rén.",
                    translation = "Dia adalah Li Hua, dia orang Tiongkok.",
                    tokens = listOf(
                        findToken("她"),
                        findToken("是"),
                        WordToken("李华", "Lǐ Huá", "Li Hua (Nama orang)", "Nama populer perempuan di Tiongkok."),
                        findToken("她"),
                        findToken("是"),
                        findToken("中国人")
                    )
                ),
                Sentence(
                    id = "s1_4",
                    hanzi = "我们在学校认识。",
                    pinyin = "Wǒmen zài xuéxiào rènshi.",
                    translation = "Kami berkenalan di sekolah.",
                    tokens = listOf(
                        WordToken("我们", "wǒmen", "Kami / Kita", "Kata ganti jamak pertama."),
                        findToken("在"),
                        findToken("学校"),
                        findToken("认识")
                    )
                ),
                Sentence(
                    id = "s1_5",
                    hanzi = "李华说：“很高兴认识你！”",
                    pinyin = "Lǐ Huá shuō: \"Hěn gāoxìng rènshi nǐ!\"",
                    translation = "Li Hua berkata: \"Sangat senang berkenalan denganmu!\"",
                    tokens = listOf(
                        WordToken("李华", "Lǐ Huá", "Li Hua", "Nama orang"),
                        findToken("说"),
                        findToken("很"),
                        findToken("高兴"),
                        findToken("认识"),
                        findToken("你好").copy(hanzi = "你", pinyin = "nǐ", meaning = "Kamu")
                    )
                ),
                Sentence(
                    id = "s1_6",
                    hanzi = "我说：“我也很高兴认识你，谢谢！”",
                    pinyin = "Wǒ shuō: \"Wǒ yě hěn gāoxìng rènshi nǐ, xièxie!\"",
                    translation = "Saya berkata: \"Saya juga sangat senang berkenalan denganmu, terima kasih!\"",
                    tokens = listOf(
                        findToken("我"),
                        findToken("说"),
                        findToken("我"),
                        findToken("也"),
                        findToken("很"),
                        findToken("高兴"),
                        findToken("认识"),
                        WordToken("你", "nǐ", "Kamu"),
                        findToken("谢谢")
                    )
                ),
                Sentence(
                    id = "s1_7",
                    hanzi = "到了下午，我们说再见。",
                    pinyin = "Dào le xiàwǔ, wǒmen shuō zàijiàn.",
                    translation = "Saat sore tiba, kami mengucapkan sampai jumpa.",
                    tokens = listOf(
                        WordToken("到了", "dào le", "Tiba / Sampai"),
                        WordToken("下午", "xiàwǔ", "Sore hari / Siang menjelang sore"),
                        WordToken("我们", "wǒmen", "Kami"),
                        findToken("说"),
                        findToken("再见")
                    )
                )
            ),
            questions = listOf(
                StoryQuestion(
                    id = "q1_1",
                    questionText = "大卫是谁？(Siapakah David?)",
                    options = listOf("老师 (Guru)", "学生 (Murid)", "医生 (Dokter)", "老板 (Bos)"),
                    correctAnswerIndex = 1,
                    explanation = "Di teks kalimat ke-2 tertulis: '我是学生，我不是老师' (Saya murid, bukan guru)."
                ),
                StoryQuestion(
                    id = "q1_2",
                    questionText = "李华是哪国人？(Li Hua berasal dari negara mana?)",
                    options = listOf("印尼人 (Orang Indonesia)", "中国人 (Orang Tiongkok)", "美国人 (Orang Amerika)", "日本人 (Orang Jepang)"),
                    correctAnswerIndex = 1,
                    explanation = "Di teks kalimat ke-3 tertulis: '她是李华，她是中国人' (Dia adalah Li Hua, dia orang Tiongkok)."
                ),
                StoryQuestion(
                    id = "q1_3",
                    questionText = "他们在哪里认识？(Di mana mereka saling berkenalan?)",
                    options = listOf("在茶馆 (Di kedai teh)", "在学校 (Di sekolah)", "在火车站 (Di stasiun)", "在家里 (Di rumah)"),
                    correctAnswerIndex = 1,
                    explanation = "Kalimat ke-4 menyatakan: '我们在学校认识' (Kami berkenalan di sekolah)."
                )
            )
        ),

        // Cerita 2 - HSK 1/2 Makanan & Restoran
        Story(
            id = "story_2",
            titleHanzi = "在茶馆点点心",
            titlePinyin = "Zài Cháguǎn Diǎn Diǎnxin",
            titleTranslation = "Di Kedai Teh Memesan Dimsum",
            level = "HSK 1+",
            category = "Kuliner & Restoran",
            description = "Suasana santai sore memesan teh melati harum dan seporsi bakpao kukus hangat.",
            coverEmoji = "🥟",
            estimatedReadMinutes = 3,
            sentences = listOf(
                Sentence(
                    id = "s2_1",
                    hanzi = "今天下午，我去中国茶馆。",
                    pinyin = "Jīntiān xiàwǔ, wǒ qù Zhōngguó cháguǎn.",
                    translation = "Sore hari ini, saya pergi ke kedai teh tradisional Tiongkok.",
                    tokens = listOf(
                        findToken("今天"),
                        WordToken("下午", "xiàwǔ", "Sore"),
                        findToken("我"),
                        findToken("去"),
                        WordToken("中国", "Zhōngguó", "Tiongkok"),
                        WordToken("茶馆", "cháguǎn", "Kedai teh", "Tempat santai minum teh khas budaya Tionghoa.")
                    )
                ),
                Sentence(
                    id = "s2_2",
                    hanzi = "服务员问：“请问，您喝什么？”",
                    pinyin = "Fúwùyuán wèn: \"Qǐngwèn, nín hē shénme?\"",
                    translation = "Pelayan bertanya: \"Permisi, Anda mau minum apa?\"",
                    tokens = listOf(
                        WordToken("服务员", "fúwùyuán", "Pelayan / Waiter"),
                        WordToken("问", "wèn", "Bertanya"),
                        WordToken("请问", "qǐngwèn", "Bolehkah saya bertanya / Permisi"),
                        WordToken("您", "nín", "Anda (sopan)"),
                        findToken("喝"),
                        WordToken("什么", "shénme", "Apa")
                    )
                ),
                Sentence(
                    id = "s2_3",
                    hanzi = "我说：“我喝绿茶，谢谢。”",
                    pinyin = "Wǒ shuō: \"Wǒ hē lǜchá, xièxie.\"",
                    translation = "Saya menjawab: \"Saya minum teh hijau, terima kasih.\"",
                    tokens = listOf(
                        findToken("我"),
                        findToken("说"),
                        findToken("我"),
                        findToken("喝"),
                        findToken("绿茶"),
                        findToken("谢谢")
                    )
                ),
                Sentence(
                    id = "s2_4",
                    hanzi = "这里的包子非常有名，也很好吃。",
                    pinyin = "Zhèlǐ de bāozi fēicháng yǒumíng, yě hěn hǎochī.",
                    translation = "Bakpao di sini sangat terkenal, dan juga sangat lezat.",
                    tokens = listOf(
                        WordToken("这里", "zhèlǐ", "Di sini"),
                        WordToken("的", "de", "Partikel kepemilikan"),
                        findToken("包子"),
                        WordToken("非常", "fēicháng", "Luar biasa / Sangat"),
                        WordToken("有名", "yǒumíng", "Terkenal"),
                        findToken("也"),
                        findToken("很"),
                        findToken("好吃")
                    )
                ),
                Sentence(
                    id = "s2_5",
                    hanzi = "我点了三个热包子。",
                    pinyin = "Wǒ diǎn le sān ge rè bāozi.",
                    translation = "Saya memesan tiga buah bakpao yang masih hangat.",
                    tokens = listOf(
                        findToken("我"),
                        WordToken("点了", "diǎn le", "Memesan (makanan)"),
                        WordToken("三个", "sān ge", "Tiga buah"),
                        WordToken("热", "rè", "Hangat / Panas"),
                        findToken("包子")
                    )
                ),
                Sentence(
                    id = "s2_6",
                    hanzi = "一共多少钱？一共二十五块。",
                    pinyin = "Yígòng duōshao qián? Yígòng èrshíwǔ kuài.",
                    translation = "Totalnya berapa harganya? Semuanya 25 yuan.",
                    tokens = listOf(
                        WordToken("一共", "yígòng", "Semuanya / Total"),
                        findToken("多少钱"),
                        WordToken("一共", "yígòng", "Total"),
                        WordToken("二十五", "èrshíwǔ", "Dua puluh lima (25)"),
                        findToken("块")
                    )
                ),
                Sentence(
                    id = "s2_7",
                    hanzi = "这里的茶好喝，我很喜欢！",
                    pinyin = "Zhèlǐ de chá hǎohē, wǒ hěn xǐhuan!",
                    translation = "Teh di sini enak diminum, saya sangat menyukainya!",
                    tokens = listOf(
                        WordToken("这里", "zhèlǐ", "Di sini"),
                        WordToken("的", "de", "Milik"),
                        findToken("茶"),
                        findToken("好喝"),
                        findToken("我"),
                        findToken("很"),
                        findToken("喜欢")
                    )
                )
            ),
            questions = listOf(
                StoryQuestion(
                    id = "q2_1",
                    questionText = "大卫喝了什么茶？(David minum teh apa?)",
                    options = listOf("红茶 (Teh hitam)", "绿茶 (Teh hijau)", "咖啡 (Kopi)", "白开水 (Air putih biasa)"),
                    correctAnswerIndex = 1,
                    explanation = "Di kalimat ke-3 David mengatakan: '我喝绿茶' (Saya minum teh hijau)."
                ),
                StoryQuestion(
                    id = "q2_2",
                    questionText = "大卫点了几个包子？(Berapa banyak bakpao yang dipesan David?)",
                    options = listOf("一个 (1 buah)", "两个 (2 buah)", "三个 (3 buah)", "五个 (5 buah)"),
                    correctAnswerIndex = 2,
                    explanation = "Kalimat ke-5 menyatakan: '我点了三个热包子' (Saya memesan 3 bakpao hangat)."
                ),
                StoryQuestion(
                    id = "q2_3",
                    questionText = "一共多少钱？(Berapa total biaya semuanya?)",
                    options = listOf("15块 (15 yuan)", "20块 (20 yuan)", "25块 (25 yuan)", "50块 (50 yuan)"),
                    correctAnswerIndex = 2,
                    explanation = "Kalimat ke-6 menyebutkan: '一共二十五块' (Total 25 yuan)."
                )
            )
        ),

        // Cerita 3 - HSK 2 Belanja & Tawar Menawar
        Story(
            id = "story_3",
            titleHanzi = "在水果市场买苹果",
            titlePinyin = "Zài Shuǐguǒ Shìchǎng Mǎi Píngguǒ",
            titleTranslation = "Membeli Apel di Pasar Buah",
            level = "HSK 2",
            category = "Belanja & Pasar",
            description = "Percakapan seru tawar menawar membeli apel merah segar di pasar tradisional.",
            coverEmoji = "🍎",
            estimatedReadMinutes = 3,
            sentences = listOf(
                Sentence(
                    id = "s3_1",
                    hanzi = "周末，李华去水果市场买东西。",
                    pinyin = "Zhōumò, Lǐ Huá qù shuǐguǒ shìchǎng mǎi dōngxi.",
                    translation = "Akhir pekan, Li Hua pergi ke pasar buah untuk berbelanja.",
                    tokens = listOf(
                        WordToken("周末", "zhōumò", "Akhir pekan / Weekend"),
                        WordToken("李华", "Lǐ Huá", "Li Hua"),
                        findToken("去"),
                        WordToken("水果市场", "shuǐguǒ shìchǎng", "Pasar buah"),
                        findToken("买"),
                        WordToken("东西", "dōngxi", "Barang / Benda")
                    )
                ),
                Sentence(
                    id = "s3_2",
                    hanzi = "老板说：“红苹果很甜，十块钱一斤。”",
                    pinyin = "Lǎobǎn shuō: \"Hóng píngguǒ hěn tián, shí kuài qián yì jīn.\"",
                    translation = "Pemilik toko berkata: \"Apel merah sangat manis, 10 yuan per setengah kilo (1 jin).\"",
                    tokens = listOf(
                        WordToken("老板", "lǎobǎn", "Pemilik toko / Bos"),
                        findToken("说"),
                        WordToken("红苹果", "hóng píngguǒ", "Apel merah"),
                        WordToken("很甜", "hěn tián", "Sangat manis"),
                        WordToken("十块钱", "shí kuài qián", "Sepuluh yuan"),
                        WordToken("一斤", "yì jīn", "Satu jin (500 gram)")
                    )
                ),
                Sentence(
                    id = "s3_3",
                    hanzi = "李华笑着说：“太贵了，便宜一点儿吧！”",
                    pinyin = "Lǐ Huá xiào zhe shuō: \"Tài guì le, piányi yìdiǎnr ba!\"",
                    translation = "Li Hua tersenyum dan berkata: \"Terlalu mahal, beri diskon sedikit dong!\"",
                    tokens = listOf(
                        WordToken("李华", "Lǐ Huá", "Li Hua"),
                        WordToken("笑着说", "xiào zhe shuō", "Berkata sambil tersenyum"),
                        findToken("太贵了"),
                        findToken("便宜"),
                        WordToken("一点儿", "yìdiǎnr", "Sedikit"),
                        WordToken("吧", "ba", "Partikel ajakan / saran")
                    )
                ),
                Sentence(
                    id = "s3_4",
                    hanzi = "老板说：“如果你买两斤，八块钱一斤。”",
                    pinyin = "Lǎobǎn shuō: \"Rúguǒ nǐ mǎi liǎng jīn, bā kuài qián yì jīn.\"",
                    translation = "Pemilik toko berkata: \"Jika kamu beli 2 jin, 8 yuan per jin.\"",
                    tokens = listOf(
                        WordToken("老板", "lǎobǎn", "Bos toko"),
                        findToken("说"),
                        WordToken("如果", "rúguǒ", "Jika / Kalau"),
                        WordToken("你买", "nǐ mǎi", "Kamu membeli"),
                        WordToken("两斤", "liǎng jīn", "Dua jin (1 kg)"),
                        WordToken("八块钱", "bā kuài qián", "Delapan yuan"),
                        WordToken("一斤", "yì jīn", "Per jin")
                    )
                ),
                Sentence(
                    id = "s3_5",
                    hanzi = "李华很高兴，买了三斤大苹果。",
                    pinyin = "Lǐ Huá hěn gāoxìng, mǎi le sān jīn dà píngguǒ.",
                    translation = "Li Hua sangat senang, membeli 3 jin apel berukuran besar.",
                    tokens = listOf(
                        WordToken("李华", "Lǐ Huá", "Li Hua"),
                        findToken("很"),
                        findToken("高兴"),
                        WordToken("买了", "mǎi le", "Sudah membeli"),
                        WordToken("三斤", "sān jīn", "Tiga jin"),
                        WordToken("大苹果", "dà píngguǒ", "Apel besar")
                    )
                )
            ),
            questions = listOf(
                StoryQuestion(
                    id = "q3_1",
                    questionText = "老板最开始说一斤苹果多少钱？(Berapa harga awal apel per jin?)",
                    options = listOf("6块 (6 yuan)", "8块 (8 yuan)", "10块 (10 yuan)", "12块 (12 yuan)"),
                    correctAnswerIndex = 2,
                    explanation = "Di awal pemilik toko berkata: '十块钱一斤' (10 yuan per jin)."
                ),
                StoryQuestion(
                    id = "q3_2",
                    questionText = "李华最后买了多少斤？(Berapa jin apel yang akhirnya dibeli Li Hua?)",
                    options = listOf("一斤 (1 jin)", "两斤 (2 jin)", "三斤 (3 jin)", "五斤 (5 jin)"),
                    correctAnswerIndex = 2,
                    explanation = "Kalimat terakhir: '李华很高兴，买了三斤大苹果' (Li Hua membeli 3 jin)."
                )
            )
        )
    )

    // ==========================================
    // DAFTAR UNIT KURSUS (LEARNING PATH)
    // ==========================================
    val units: List<UnitCourse> = listOf(
        UnitCourse(
            id = "unit_1",
            unitNumber = 1,
            title = "Sapaan & Perkenalan Diri",
            subtitle = "Kuasai kata dasar untuk berkenalan dalam hitungan menit",
            emoji = "👋",
            level = "HSK 1",
            story = stories[0],
            lessons = listOf(
                Lesson(
                    id = "l1_1",
                    title = "Menyapa Orang Lain",
                    subtitle = "Pelajari 'Halo' dan 'Terima Kasih'",
                    grammarNote = "Pola salam: 你 (kamu) + 好 (baik) = 你好 (Halo!). Untuk berterima kasih, cukup ulangi karakter 谢 (xiè) dua kali menjadi 谢谢 (xièxie) dengan nada kedua berupa nada netral ringkas.",
                    newWords = listOf(
                        Word("w1", "你好", "nǐ hǎo", "Halo", "Salam", "你好！很高兴认识你。", "Nǐ hǎo! Hěn gāoxìng rènshi nǐ.", "Halo! Senang berkenalan denganmu.", 1),
                        Word("w2", "谢谢", "xièxie", "Terima kasih", "Ungkapan", "非常感谢你！", "Fēicháng gǎnxiè nǐ!", "Sangat berterima kasih padamu!", 1),
                        Word("w3", "再见", "zàijiàn", "Sampai jumpa", "Ungkapan", "明天见，再见！", "Míngtiān jiàn, zàijiàn!", "Sampai jumpa besok, dadah!", 1)
                    ),
                    exercises = listOf(
                        Exercise(
                            id = "ex1_1",
                            type = ExerciseType.MULTIPLE_CHOICE,
                            prompt = "Apa arti dari frasa berikut?",
                            targetHanzi = "你好",
                            targetPinyin = "nǐ hǎo",
                            targetTranslation = "Halo",
                            options = listOf("Halo", "Terima kasih", "Sampai jumpa", "Maaf"),
                            correctAnswer = "Halo",
                            audioToSpeak = "你好"
                        ),
                        Exercise(
                            id = "ex1_2",
                            type = ExerciseType.TONE_DRILL,
                            prompt = "Dengarkan pelafalan dan tentukan nada kata 谢 (xiè):",
                            targetHanzi = "谢",
                            targetPinyin = "xiè",
                            targetTranslation = "Terima kasih",
                            options = listOf("Nada 1 (Datar ¯)", "Nada 2 (Naik ˊ)", "Nada 3 (Lembah ˇ)", "Nada 4 (Turun tegas ˋ)"),
                            correctAnswer = "Nada 4 (Turun tegas ˋ)",
                            audioToSpeak = "谢"
                        ),
                        Exercise(
                            id = "ex1_3",
                            type = ExerciseType.SENTENCE_BUILDER,
                            prompt = "Susun kalimat: 'Halo! Terima kasih.'",
                            targetHanzi = "你好！谢谢。",
                            targetPinyin = "Nǐ hǎo! Xièxie.",
                            targetTranslation = "Halo! Terima kasih.",
                            wordChips = listOf("谢谢", "再见", "你好", "我"),
                            correctAnswer = "你好,谢谢",
                            audioToSpeak = "你好，谢谢。"
                        )
                    )
                ),
                Lesson(
                    id = "l1_2",
                    title = "Menyatakan Identitas Diri",
                    subtitle = "Pelajari 'Saya adalah...' dan pekerjaan",
                    grammarNote = "Rumus kalimat predikat adalah 'Subjek + 是 (shì) + Objek'. Untuk menyatakan negasi/bukan, gunakan '不是 (bú shì)'.",
                    newWords = listOf(
                        Word("w4", "我", "wǒ", "Saya / Aku", "Kata ganti", "我是印尼人。", "Wǒ shì Yìnní rén.", "Saya orang Indonesia.", 1),
                        Word("w5", "是", "shì", "Adalah / Ialah", "Kata kerja", "他是我的好朋友。", "Tā shì wǒ de hǎo péngyou.", "Dia adalah teman baik saya.", 1),
                        Word("w6", "学生", "xuéshēng", "Murid / Siswa", "Kata benda", "我们都是大学学生。", "Wǒmen dōu shì dàxué xuésheng.", "Kami semua adalah mahasiswa.", 1),
                        Word("w7", "老师", "lǎoshī", "Guru", "Kata benda", "李老师很好。", "Lǐ lǎoshī hěn hǎo.", "Guru Li sangat baik.", 1)
                    ),
                    exercises = listOf(
                        Exercise(
                            id = "ex2_1",
                            type = ExerciseType.SENTENCE_BUILDER,
                            prompt = "Susun kalimat: 'Saya adalah seorang murid.'",
                            targetHanzi = "我是学生。",
                            targetPinyin = "Wǒ shì xuésheng.",
                            targetTranslation = "Saya adalah murid.",
                            wordChips = listOf("学生", "我", "老师", "是"),
                            correctAnswer = "我,是,学生",
                            audioToSpeak = "我是学生。"
                        ),
                        Exercise(
                            id = "ex2_2",
                            type = ExerciseType.LISTENING,
                            prompt = "Dengarkan audio dan pilih terjemahan yang tepat:",
                            targetHanzi = "他不是老师",
                            targetPinyin = "tā bú shì lǎoshī",
                            targetTranslation = "Dia bukan guru",
                            options = listOf("Dia adalah guru", "Dia bukan guru", "Saya adalah murid", "Guru sedang mengajar"),
                            correctAnswer = "Dia bukan guru",
                            audioToSpeak = "他不是老师。"
                        )
                    )
                )
            )
        ),

        UnitCourse(
            id = "unit_2",
            unitNumber = 2,
            title = "Makanan & Minuman di Kafe",
            subtitle = "Pesan makanan lezat dan teh khas Beijing tanpa canggung",
            emoji = "🍜",
            level = "HSK 1+",
            story = stories[1],
            lessons = listOf(
                Lesson(
                    id = "l2_1",
                    title = "Memesan Teh & Air",
                    subtitle = "Kata kerja 'Makan' dan 'Minum'",
                    grammarNote = "Pola kalimat sederhana: 'Subjek + 吃/喝 + Makanan/Minuman'. Contoh: 我喝水 (Saya minum air), 我吃包子 (Saya makan bakpao).",
                    newWords = listOf(
                        Word("w8", "吃", "chī", "Makan", "Kata kerja", "你吃什么？", "Nǐ chī shénme?", "Kamu makan apa?", 1),
                        Word("w9", "喝", "hē", "Minum", "Kata kerja", "我想喝茶。", "Wǒ xiǎng hē chá.", "Saya ingin minum teh.", 1),
                        Word("w10", "茶", "chá", "Teh", "Kata benda", "中国茶非常好喝。", "Zhōngguó chá fēicháng hǎohē.", "Teh Tiongkok sangat enak diminum.", 1),
                        Word("w11", "包子", "bāozi", "Bakpao", "Kata benda", "早餐吃包子。", "Zǎocān chī bāozi.", "Sarapan makan bakpao.", 1)
                    ),
                    exercises = listOf(
                        Exercise(
                            id = "ex3_1",
                            type = ExerciseType.MULTIPLE_CHOICE,
                            prompt = "Pilih kata yang berarti 'Minum Teh':",
                            targetHanzi = "喝茶",
                            targetPinyin = "hē chá",
                            targetTranslation = "Minum teh",
                            options = listOf("喝茶", "吃茶", "喝水", "吃包子"),
                            correctAnswer = "喝茶",
                            audioToSpeak = "喝茶"
                        ),
                        Exercise(
                            id = "ex3_2",
                            type = ExerciseType.SENTENCE_BUILDER,
                            prompt = "Susun kalimat: 'Saya makan bakpao, minum teh.'",
                            targetHanzi = "我吃包子，喝茶。",
                            targetPinyin = "Wǒ chī bāozi, hē chá.",
                            targetTranslation = "Saya makan bakpao, minum teh.",
                            wordChips = listOf("包子", "喝茶", "吃", "我"),
                            correctAnswer = "我,吃,包子,喝茶",
                            audioToSpeak = "我吃包子，喝茶。"
                        )
                    )
                )
            )
        ),

        UnitCourse(
            id = "unit_3",
            unitNumber = 3,
            title = "Belanja Buah & Tawar Menawar",
            subtitle = "Trik menanyakan harga dan meminta diskon di pasar",
            emoji = "🛍️",
            level = "HSK 2",
            story = stories[2],
            lessons = listOf(
                Lesson(
                    id = "l3_1",
                    title = "Menanyakan Berapa Harganya",
                    subtitle = "Ungkapan '太贵了' dan '多少钱'",
                    grammarNote = "Menanyakan harga: '[Nama Barang] + 多少钱？'. Menyatakan terlalu mahal: '太...了' (contoh: 太贵了！- Terlalu mahal!).",
                    newWords = listOf(
                        Word("w12", "买", "mǎi", "Membeli", "Kata kerja", "你要买什么？", "Nǐ yào mǎi shénme?", "Kamu mau beli apa?", 1),
                        Word("w13", "多少钱", "duōshao qián", "Berapa harganya", "Frasa tanya", "这个苹果多少钱？", "Zhège píngguǒ duōshao qián?", "Apel ini berapa harganya?", 1),
                        Word("w14", "便宜", "piányi", "Murah", "Kata sifat", "这个很便宜！", "Zhège hěn piányi!", "Yang ini sangat murah!", 2)
                    ),
                    exercises = listOf(
                        Exercise(
                            id = "ex4_1",
                            type = ExerciseType.MULTIPLE_CHOICE,
                            prompt = "Bagaimana cara menanyakan harga dalam bahasa Mandarin?",
                            targetHanzi = "多少钱？",
                            targetPinyin = "duōshao qián?",
                            targetTranslation = "Berapa harganya?",
                            options = listOf("多少钱？", "太贵了！", "很好吃！", "你在哪？"),
                            correctAnswer = "多少钱？",
                            audioToSpeak = "这个多少钱？"
                        )
                    )
                )
            )
        )
    )
}
