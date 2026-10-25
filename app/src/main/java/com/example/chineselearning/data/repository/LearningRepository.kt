package com.example.chineselearning.data.repository

import androidx.compose.ui.graphics.Color
import com.example.chineselearning.data.model.*

object LearningRepository {

    // --- KAMUS GLOBAL SEMUA 150 KOSAKATA RESMI HSK 1 ---
    private val globalWordDictionary = mutableMapOf<String, WordToken>()
    private val savedWords = mutableListOf<Word>()

    init {
        // 1. Kata Ganti (Pronouns)
        register("我", "wǒ", "Saya / Aku", "Kata ganti orang pertama tunggal.")
        register("你", "nǐ", "Kamu / Anda", "Kata ganti orang kedua tunggal.")
        register("您", "nín", "Anda (hormat)", "Bentuk sopan untuk menyapa yang lebih tua.")
        register("他", "tā", "Dia (laki-laki)", "Kata ganti orang ketiga laki-laki.")
        register("她", "tā", "Dia (perempuan)", "Kata ganti orang ketiga perempuan.")
        register("我们", "wǒmen", "Kami / Kita", "Kata ganti orang pertama jamak.")
        register("这", "zhè", "Ini", "Menunjuk benda atau hal yang dekat.")
        register("这儿", "zhèr", "Di sini", "Menunjuk lokasi dekat.")
        register("那", "nà", "Itu", "Menunjuk benda atau hal yang jauh.")
        register("那儿", "nàr", "Di sana", "Menunjuk lokasi jauh.")
        register("哪", "nǎ", "Yang mana", "Kata tanya pilihan.")
        register("哪儿", "nǎr", "Di mana", "Kata tanya lokasi.")
        register("谁", "shéi", "Siapa", "Kata tanya orang.")
        register("什么", "shénme", "Apa", "Kata tanya benda / aktivitas.")
        register("多少", "duōshao", "Berapa banyak", "Menanyakan jumlah (biasanya > 10).")
        register("几", "jǐ", "Berapa", "Menanyakan jumlah kecil (< 10).")
        register("怎么", "zěnme", "Bagaimana", "Menanyakan cara atau alasan.")
        register("怎么样", "zěnmeyàng", "Bagaimana keadaannya", "Menanyakan kondisi atau pendapat.")

        // 2. Angka & Bilangan (Numbers)
        register("一", "yī", "Satu (1)", "Angka satu.")
        register("二", "èr", "Dua (2)", "Angka dua.")
        register("三", "sān", "Tiga (3)", "Angka tiga.")
        register("四", "sì", "Empat (4)", "Angka empat.")
        register("五", "wǔ", "Lima (5)", "Angka lima.")
        register("六", "liù", "Enam (6)", "Angka enam.")
        register("七", "qī", "Tujuh (7)", "Angka tujuh.")
        register("八", "bā", "Delapan (8)", "Angka delapan.")
        register("九", "jiǔ", "Sembilan (9)", "Angka sembilan.")
        register("十", "shí", "Sepuluh (10)", "Angka sepuluh.")
        register("零", "líng", "Nol (0)", "Angka nol.")
        register("百", "bǎi", "Ratus / Ratusan", "Satuan ratusan.")

        // 3. Satuan Ukuran (Measure Words)
        register("个", "gè", "Buah / Orang (satuan umum)", "Kata penggolong paling umum.")
        register("岁", "suì", "Tahun (usia)", "Satuan umur.")
        register("本", "běn", "Jilid / Eksemplar (buku)", "Satuan untuk buku.")
        register("些", "xiē", "Beberapa", "Menyatakan jumlah jamak tidak tentu.")
        register("块", "kuài", "Yuan (uang)", "Satuan mata uang lisan.")

        // 4. Keterangan & Hubungan (Adverbs, Prepositions, Particles)
        register("不", "bù", "Tidak / Bukan", "Kata negasi.")
        register("没", "méi", "Tidak ada / Belum", "Negasi untuk kata kerja atau kepemilikan.")
        register("很", "hěn", "Sangat / Cukup", "Kata keterangan tingkat.")
        register("太", "tài", "Terlalu", "Menyatakan tingkat berlebih (太...了).")
        register("都", "dōu", "Semua / Semuanya", "Menyatakan kejamakan subjek.")
        register("和", "hé", "Dan / Dengan", "Kata hubung setara.")
        register("在", "zài", "Di / Sedang berada di", "Kata depan penunjuk tempat.")
        register("的", "de", "Milik / Yang", "Partikel kepemilikan dan deskripsi.")
        register("了", "le", "Sudah / Telah", "Partikel aspek perubahan keadaan.")
        register("吗", "ma", "Apakah? (tanya ya/tidak)", "Partikel tanya di akhir kalimat.")
        register("呢", "ne", "Bagaimana dengan...?", "Partikel tanya balik halus.")
        register("吧", "ba", "...kan? / Ayo", "Partikel saran atau konfirmasi.")

        // 5. Kesopanan & Sapaan
        register("喂", "wèi", "Halo (di telepon)", "Kata sapaan saat mengangkat telepon.")
        register("谢谢", "xièxie", "Terima kasih", "Ucapan syukur.")
        register("不客气", "bú kèqi", "Sama-sama", "Balasan ucapan terima kasih.")
        register("再见", "zàijiàn", "Sampai jumpa", "Salam perpisahan.")
        register("请", "qǐng", "Silakan / Tolong", "Kata santun memohon.")
        register("对不起", "duìbuqǐ", "Maaf / Permisi", "Permohonan maaf.")
        register("没关系", "méi guānxi", "Tidak apa-apa", "Balasan untuk permohonan maaf.")

        // 6. Waktu & Kalender
        register("现在", "xiànzài", "Sekarang", "Waktu saat ini.")
        register("点", "diǎn", "Jam (pukul)", "Penunjuk waktu jam.")
        register("分钟", "fēnzhōng", "Menit", "Satuan durasi menit.")
        register("今天", "jīntiān", "Hari ini", "Hari sekarang.")
        register("明天", "míngtiān", "Besok", "Hari berikutnya.")
        register("昨天", "zuótiān", "Kemarin", "Hari sebelumnya.")
        register("上午", "shàngwǔ", "Pagi menjelang siang", "Sebelum pukul 12 siang.")
        register("中午", "zhōngwǔ", "Tengah hari (siang)", "Sekitar pukul 12 siang.")
        register("下午", "xiàwǔ", "Sore hari", "Setelah pukul 12 siang.")
        register("年", "nián", "Tahun", "Satuan penanggalan tahun.")
        register("月", "yuè", "Bulan", "Bulan dalam kalender.")
        register("号", "hào", "Tanggal", "Nomor hari dalam bulan.")
        register("星期", "xīngqī", "Minggu / Pekan", "Hari dalam seminggu.")
        register("时候", "shíhou", "Waktu / Saat", "Contoh: 什么时候 (kapan).")

        // 7. Tempat & Arah
        register("上", "shàng", "Atas / Naik", "Arah atas atau menaiki kendaraan.")
        register("下", "xià", "Bawah / Turun", "Arah bawah atau menuruni.")
        register("前面", "qiánmiàn", "Bagian depan", "Posisi muka / depan.")
        register("后面", "hòumiàn", "Bagian belakang", "Posisi belakang.")
        register("里", "lǐ", "Dalam / Di dalam", "Posisi bagian dalam.")
        register("学校", "xuéxiào", "Sekolah", "Tempat menuntut ilmu.")
        register("饭馆", "fànguǎn", "Restoran / Rumah makan", "Tempat makan.")
        register("商店", "shāngdiàn", "Toko", "Tempat berbelanja.")
        register("医院", "yīyuàn", "Rumah Sakit", "Fasilitas kesehatan.")
        register("火车站", "huǒchēzhàn", "Stasiun Kereta Api", "Tempat naik kereta.")
        register("中国", "Zhōngguó", "Tiongkok (Negara)", "Negara Tiongkok.")
        register("北京", "Běijīng", "Beijing", "Ibukota Tiongkok.")
        register("印度尼西亚", "Yìndùníxīyà", "(negara) Indonesia", "Negara Indonesia.")
        register("印尼", "Yìnní", "Indonesia", "Singkatan populer Indonesia.")

        // 8. Orang & Hubungan
        register("爸爸", "bàba", "Ayah / Papa", "Orang tua laki-laki.")
        register("妈妈", "māma", "Ibu / Mama", "Orang tua perempuan.")
        register("儿子", "érzi", "Anak laki-laki", "Putra kandung.")
        register("女儿", "nǚ'ér", "Anak perempuan", "Putri kandung.")
        register("老师", "lǎoshī", "(Bapak atau Ibu) Guru", "Pendidik.")
        register("学生", "xuéshēng", "Murid / Siswa", "Pelajar.")
        register("同学", "tóngxué", "Teman sekelas", "Rekan belajar.")
        register("朋友", "péngyou", "Teman / Sahabat", "Sahabat dekat.")
        register("医生", "yīshēng", "Dokter", "Ahli medis.")
        register("人", "rén", "Orang / Manusia", "Sosok manusia.")
        register("名字", "míngzi", "Nama", "Nama panggilan seseorang.")

        // 9. Makanan, Minuman & Benda
        register("菜", "cài", "Sayur / Masakan / Lauk", "Hidangan makanan.")
        register("米饭", "mǐfàn", "Nasi putih", "Nasi yang sudah matang.")
        register("水果", "shuǐguǒ", "Buah-buahan", "Aneka buah.")
        register("苹果", "píngguǒ", "Apel", "Buah apel manis.")
        register("茶", "chá", "Teh", "Minuman teh.")
        register("水", "shuǐ", "Air", "Air minum.")
        register("杯子", "bēizi", "Gelas / Cangkir", "Wadah minum.")
        register("钱", "qián", "Uang", "Alat tukar.")
        register("飞机", "fēijī", "Pesawat terbang", "Kendaraan udara.")
        register("出租车", "chūzūchē", "Taksi", "Mobil angkutan sewa.")
        register("电视", "diànshì", "Televisi (TV)", "Pesawat TV.")
        register("电脑", "diànnǎo", "Komputer", "Perangkat komputer.")
        register("电影", "diànyǐng", "Film / Bioskop", "Tayangan film.")
        register("天气", "tiānqì", "Cuaca", "Kondisi cuaca harian.")
        register("猫", "māo", "Kucing", "Hewan peliharaan lucu.")
        register("狗", "gǒu", "Anjing", "Hewan peliharaan setia.")
        register("东西", "dōngxi", "Barang / Benda", "Objek fisik.")
        register("桌子", "zhuōzi", "Meja", "Perabot meja.")
        register("椅子", "yǐzi", "Kursi", "Perabot duduk.")
        register("汉语", "hànyǔ", "Bahasa Mandarin", "Bahasa Han.")
        register("字", "zì", "Karakter / Aksara Hanzi", "Tulisan huruf Mandarin.")
        register("书", "shū", "Buku", "Bahan bacaan.")

        // 10. Kata Kerja (Verbs)
        register("是", "shì", "Adalah / Ialah", "Kata kerja to be.")
        register("有", "yǒu", "Punya / Ada", "Kepemilikan atau eksistensi.")
        register("看", "kàn", "Melihat / Membaca / Menonton", "Aktivitas indera mata.")
        register("听", "tīng", "Mendengar / Menyimak", "Aktivitas pendengaran.")
        register("说话", "shuōhuà", "Berbicara / Ngobrol", "Aktivitas bertutur kata.")
        register("读", "dú", "Membaca nyaring", "Melafalkan teks.")
        register("写", "xiě", "Menulis", "Menggoreskan aksara.")
        register("看见", "kànjiàn", "Melihat / Tampak", "Hasil dari melihat.")
        register("叫", "jiào", "Bernama / Memanggil", "Menyebut nama.")
        register("来", "lái", "Datang", "Menuju ke arah pembicara.")
        register("回", "huí", "Kembali / Pulang", "Menuju tempat semula.")
        register("去", "qù", "Pergi", "Menjauh dari tempat pembicara.")
        register("吃", "chī", "Makan", "Mengonsumsi santapan.")
        register("喝", "hē", "Minum", "Meneguk minuman.")
        register("睡觉", "shuìjiào", "Tidur", "Beristirahat lelap.")
        register("打电话", "dǎ diànhuà", "Menelepon", "Melakukan panggilan telepon.")
        register("做", "zuò", "Membuat / Melakukan", "Melaksanakan aktivitas.")
        register("买", "mǎi", "Membeli", "Bertransaksi barang.")
        register("开", "kāi", "Mengemudi / Membuka", "Menyetir mobil atau membuka.")
        register("坐", "zuò", "Duduk / Naik (kendaraan)", "Posisi duduk atau naik bus/kereta.")
        register("住", "zhù", "Tinggal / Berdiam", "Menetap di tempat tinggal.")
        register("学习", "xuéxí", "Belajar", "Menuntut pengetahuan.")
        register("工作", "gōngzuò", "Bekerja", "Menjalankan profesi.")
        register("下雨", "xiàyǔ", "Turun hujan", "Kondisi hujan.")
        register("爱", "ài", "Cinta / Sangat suka", "Menyayangi sepenuh hati.")
        register("喜欢", "xǐhuan", "Suka / Gemar", "Menyenangi sesuatu.")
        register("想", "xiǎng", "Ingin / Rindu / Berpikir", "Keinginan batin.")
        register("认识", "rènshi", "Mengenal / Kenal", "Mengetahui sosok seseorang.")
        register("会", "huì", "Bisa / Mampu (hasil belajar)", "Keahlian yang dipelajari.")
        register("能", "néng", "Bisa / Dapat (kondisi memungkinkan)", "Kemampuan fisik atau izin.")

        // 11. Kata Sifat (Adjectives)
        register("好", "hǎo", "Baik / Bagus", "Kualitas positif.")
        register("大", "dà", "Besar", "Ukuran besar.")
        register("小", "xiǎo", "Kecil", "Ukuran mungil.")
        register("多", "duō", "Banyak", "Kuantitas berlimpah.")
        register("少", "shǎo", "Sedikit", "Kuantitas minim.")
        register("冷", "lěng", "Dingin", "Suhu rendah.")
        register("热", "rè", "Panas", "Suhu tinggi.")
        register("高兴", "gāoxìng", "Senang / Gembira", "Perasaan sukacita.")
        register("漂亮", "piàoliang", "Cantik / Indah", "Visual mempesona.")
    }

    private fun register(hanzi: String, pinyin: String, meaning: String, detail: String = "") {
        globalWordDictionary[hanzi] = WordToken(hanzi, pinyin, meaning, detail)
    }

    fun findToken(hanzi: String): WordToken {
        return globalWordDictionary[hanzi] ?: WordToken(
            hanzi = hanzi,
            pinyin = "",
            meaning = "Kosakata HSK 1",
            detail = "Klik dengarkan audio untuk melafalkan."
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

    fun isWordSaved(hanzi: String): Boolean = savedWords.any { it.hanzi == hanzi }

    // =========================================================================
    // 6 BAB CERITA BERJENJANG LENGKAP (GRADED READERS) HSK 1
    // =========================================================================
    val stories: List<Story> = listOf(
        // Cerita 1 - Sapaan & Murid Baru
        Story(
            id = "story_1",
            titleHanzi = "新同学李华",
            titlePinyin = "Xīn Tóngxué Lǐ Huá",
            titleTranslation = "Murid Baru Li Hua",
            level = "HSK 1",
            category = "Sapaan & Sekolah",
            description = "Pertemuan ramah David dengan murid baru asal Beijing di sekolah.",
            coverEmoji = "🎓",
            estimatedReadMinutes = 2,
            sentences = listOf(
                Sentence("s1_1", "你好！我叫大卫。", "Nǐ hǎo! Wǒ jiào Dàwèi.", "Halo! Nama saya David.", listOf(findToken("你好"), findToken("我"), findToken("叫"), findToken("大卫"))),
                Sentence("s1_2", "我是学生，我不是老师。", "Wǒ shì xuésheng, wǒ bú shì lǎoshī.", "Saya murid, saya bukan guru.", listOf(findToken("我"), findToken("是"), findToken("学生"), findToken("不"), findToken("是"), findToken("老师"))),
                Sentence("s1_3", "她是李华，她是中国人。", "Tā shì Lǐ Huá, tā shì Zhōngguó rén.", "Dia adalah Li Hua, dia orang Tiongkok.", listOf(findToken("她"), findToken("是"), WordToken("李华", "Lǐ Huá", "Li Hua"), findToken("她"), findToken("是"), findToken("中国人"))),
                Sentence("s1_4", "我们在学校认识，我们是同学。", "Wǒmen zài xuéxiào rènshi, wǒmen shì tóngxué.", "Kami berkenalan di sekolah, kami teman sekelas.", listOf(findToken("我们"), findToken("在"), findToken("学校"), findToken("认识"), findToken("我们"), findToken("是"), findToken("同学"))),
                Sentence("s1_5", "李华说：“很高兴认识你！”", "Lǐ Huá shuō: \"Hěn gāoxìng rènshi nǐ!\"", "Li Hua berkata: \"Senang berkenalan denganmu!\"", listOf(WordToken("李华", "Lǐ Huá", "Li Hua"), findToken("说"), findToken("很"), findToken("高兴"), findToken("认识"), findToken("你"))),
                Sentence("s1_6", "我说：“我也很高兴，谢谢！”", "Wǒ shuō: \"Wǒ yě hěn gāoxìng, xièxie!\"", "Saya berkata: \"Saya juga senang, terima kasih!\"", listOf(findToken("我"), findToken("说"), findToken("我"), findToken("也"), findToken("很"), findToken("高兴"), findToken("谢谢"))),
                Sentence("s1_7", "下午到了，我们说再见。", "Xiàwǔ dào le, wǒmen shuō zàijiàn.", "Sore hari tiba, kami mengucapkan sampai jumpa.", listOf(findToken("下午"), WordToken("到了", "dào le", "Tiba"), findToken("我们"), findToken("说"), findToken("再见")))
            ),
            questions = listOf(
                StoryQuestion("q1_1", "大卫是谁？(Siapa David?)", listOf("老师 (Guru)", "学生 (Murid)", "医生 (Dokter)", "司机 (Supir)"), 1, "Di kalimat ke-2: '我是学生，我不是老师'."),
                StoryQuestion("q1_2", "李华是哪国人？(Dari mana Li Hua?)", listOf("中国人 (Tiongkok)", "印尼人 (Indonesia)", "美国人 (Amerika)", "日本人 (Jepang)"), 0, "Di kalimat ke-3: '她是李华，她是中国人'.")
            )
        ),

        // Cerita 2 - Angka, Umur & Hari Minggu
        Story(
            id = "story_2",
            titleHanzi = "大卫的星期天",
            titlePinyin = "Dàwèi de Xīngqītiān",
            titleTranslation = "Hari Minggu David",
            level = "HSK 1",
            category = "Waktu & Jadwal",
            description = "Rutinitas hari Minggu David mengatur waktu dari pagi hingga sore.",
            coverEmoji = "⏰",
            estimatedReadMinutes = 2,
            sentences = listOf(
                Sentence("s2_1", "今天是一月十号，星期天。", "Jīntiān shì yī yuè shí hào, xīngqītiān.", "Hari ini tanggal 10 Januari, hari Minggu.", listOf(findToken("今天"), findToken("是"), findToken("一"), findToken("月"), findToken("十"), findToken("号"), findToken("星期"))),
                Sentence("s2_2", "大卫今年二十岁。", "Dàwèi jīnnián èrshí suì.", "David tahun ini berumur 20 tahun.", listOf(findToken("大卫"), WordToken("今年", "jīnnián", "Tahun ini"), findToken("二"), findToken("十"), findToken("岁"))),
                Sentence("s2_3", "上午八点三十分，他起床了。", "Shàngwǔ bā diǎn sānshí fēn, tā qǐchuáng le.", "Pukul 8 lewat 30 menit pagi, dia bangun tidur.", listOf(findToken("上午"), findToken("八"), findToken("点"), findToken("三"), findToken("十"), findToken("分钟"), findToken("他"), findToken("了"))),
                Sentence("s2_4", "中午十二点，他去看朋友。", "Zhōngwǔ shí'èr diǎn, tā qù kàn péngyou.", "Pukul 12 siang, dia pergi menemui teman.", listOf(findToken("中午"), findToken("十"), findToken("二"), findToken("点"), findToken("他"), findToken("去"), findToken("看"), findToken("朋友"))),
                Sentence("s2_5", "现在下午三点，他很高兴！", "Xiànzài xiàwǔ sān diǎn, tā hěn gāoxìng!", "Sekarang pukul 3 sore, dia sangat senang!", listOf(findToken("现在"), findToken("下午"), findToken("三"), findToken("点"), findToken("他"), findToken("很"), findToken("高兴")))
            ),
            questions = listOf(
                StoryQuestion("q2_1", "大卫今年多大？(Berapa umur David tahun ini?)", listOf("十岁 (10 tahun)", "十五岁 (15 tahun)", "二十岁 (20 tahun)", "三十岁 (30 tahun)"), 2, "Di kalimat ke-2 tertulis: '大卫今年二十岁' (20 tahun)."),
                StoryQuestion("q2_2", "今天星期几？(Hari apa hari ini?)", listOf("星期天 (Minggu)", "星期一 (Senin)", "星期五 (Jumat)", "星期六 (Sabtu)"), 0, "Di kalimat ke-1 tertulis: '星期天' (Hari Minggu).")
            )
        ),

        // Cerita 3 - Keluarga & Rumah
        Story(
            id = "story_3",
            titleHanzi = "大卫的家与小猫",
            titlePinyin = "Dàwèi de Jiā yǔ Xiǎomāo",
            titleTranslation = "Keluarga David dan Anak Kucing",
            level = "HSK 1",
            category = "Keluarga & Hewan",
            description = "Suasana hangat di rumah David bersama ayah, ibu, dan kucing lucunya.",
            coverEmoji = "🐱",
            estimatedReadMinutes = 2,
            sentences = listOf(
                Sentence("s3_1", "这是大卫的家，家里有四个人。", "Zhè shì Dàwèi de jiā, jiā lǐ yǒu sì gè rén.", "Ini adalah rumah David, di dalam rumah ada empat orang.", listOf(findToken("这"), findToken("是"), findToken("大卫"), findToken("的"), findToken("家"), findToken("家"), findToken("里"), findToken("有"), findToken("四"), findToken("个"), findToken("人"))),
                Sentence("s3_2", "有爸爸、妈妈、一个儿子和一个女儿。", "Yǒu bàba, māma, yí gè érzi hé yí gè nǚ'ér.", "Ada ayah, ibu, seorang anak laki-laki, dan seorang anak perempuan.", listOf(findToken("有"), findToken("爸爸"), findToken("妈妈"), findToken("一个"), findToken("儿子"), findToken("和"), findToken("一个"), findToken("女儿"))),
                Sentence("s3_3", "大卫家有一只小猫，非常漂亮。", "Dàwèi jiā yǒu yì zhī xiǎomāo, fēicháng piàoliang.", "Keluarga David punya seekor anak kucing, sangat cantik.", listOf(findToken("大卫"), findToken("家"), findToken("有"), findToken("猫"), findToken("很"), findToken("漂亮"))),
                Sentence("s3_4", "小猫在桌子下面睡觉。", "Xiǎomāo zài zhuōzi xiàmiàn shuìjiào.", "Anak kucing sedang tidur di bawah meja.", listOf(findToken("猫"), findToken("在"), findToken("桌子"), findToken("下"), findToken("后面"), findToken("睡觉"))),
                Sentence("s3_5", "大家都爱这只可爱的小猫。", "Dàjiā dōu ài zhè zhī kě'ài de xiǎomāo.", "Semuanya sayang pada anak kucing yang imut ini.", listOf(findToken("都"), findToken("爱"), findToken("这"), findToken("猫")))
            ),
            questions = listOf(
                StoryQuestion("q3_1", "大卫家里有几个人？(Berapa orang di rumah David?)", listOf("两个人 (2 orang)", "三个人 (3 orang)", "四个人 (4 orang)", "五个人 (5 orang)"), 2, "Kalimat 1: '家里有四个人' (ada 4 orang)."),
                StoryQuestion("q3_2", "小猫在哪里睡觉？(Di mana kucing tidur?)", listOf("在桌子下 (Di bawah meja)", "在椅子上 (Di atas kursi)", "在外面 (Di luar)", "在学校 (Di sekolah)"), 0, "Kalimat 4: '小猫在桌子下面睡觉'.")
            )
        ),

        // Cerita 4 - Makanan & Restoran
        Story(
            id = "story_4",
            titleHanzi = "在饭馆吃米饭与炒菜",
            titlePinyin = "Zài Fànguǎn Chī Mǐfàn yǔ Chǎocài",
            titleTranslation = "Di Restoran Makan Nasi & Lauk",
            level = "HSK 1",
            category = "Makanan & Kafe",
            description = "Pengalaman memesan makanan lezat dan minum teh hangat di restoran.",
            coverEmoji = "🥟",
            estimatedReadMinutes = 2,
            sentences = listOf(
                Sentence("s4_1", "中午，我去中国饭馆吃菜。", "Zhōngwǔ, wǒ qù Zhōngguó fànguǎn chī cài.", "Siang hari, saya pergi ke restoran Tiongkok makan lauk pauk.", listOf(findToken("中午"), findToken("我"), findToken("去"), findToken("中国"), findToken("饭馆"), findToken("吃"), findToken("菜"))),
                Sentence("s4_2", "服务员问：“你想吃什么？”", "Fúwùyuán wèn: \"Nǐ xiǎng chī shénme?\"", "Pelayan bertanya: \"Kamu ingin makan apa?\"", listOf(WordToken("服务员", "fúwùyuán", "Pelayan"), WordToken("问", "wèn", "Bertanya"), findToken("你"), findToken("想"), findToken("吃"), findToken("什么"))),
                Sentence("s4_3", "我说：“我想吃米饭，喝一杯茶。”", "Wǒ shuō: \"Wǒ xiǎng chī mǐfàn, hē yì bēi chá.\"", "Saya berkata: \"Saya ingin makan nasi putih, minum secangkir teh.\"", listOf(findToken("我"), findToken("说"), findToken("我"), findToken("想"), findToken("吃"), findToken("米饭"), findToken("喝"), findToken("一"), findToken("杯子"), findToken("茶"))),
                Sentence("s4_4", "这里的米饭和茶都很好吃，太好喝了！", "Zhèlǐ de mǐfàn hé chá dōu hěn hǎochī, tài hǎohē le!", "Nasi dan teh di sini semuanya enak, segar sekali!", listOf(findToken("这儿"), findToken("的"), findToken("米饭"), findToken("和"), findToken("茶"), findToken("都"), findToken("很"), findToken("好吃"), findToken("太"), findToken("了"))),
                Sentence("s4_5", "一共多少钱？一共二十块。", "Yígòng duōshao qián? Yígòng èrshí kuài.", "Totalnya berapa harganya? Semuanya 20 yuan.", listOf(WordToken("一共", "yígòng", "Total"), findToken("多少"), findToken("钱"), findToken("二"), findToken("十"), findToken("块")))
            ),
            questions = listOf(
                StoryQuestion("q4_1", "他想喝什么？(Dia ingin minum apa?)", listOf("喝茶 (Minum teh)", "喝水 (Minum air)", "喝牛奶 (Minum susu)", "喝咖啡 (Minum kopi)"), 0, "Di kalimat ke-3: '喝一杯茶' (minum secangkir teh)."),
                StoryQuestion("q4_2", "一共多少钱？(Berapa total harganya?)", listOf("十块 (10 yuan)", "二十块 (20 yuan)", "三十块 (30 yuan)", "五十块 (50 yuan)"), 1, "Di kalimat ke-5: '一共二十块' (20 yuan).")
            )
        ),

        // Cerita 5 - Belajar & Bekerja
        Story(
            id = "story_5",
            titleHanzi = "在医院工作的李医生",
            titlePinyin = "Zài Yīyuàn Gōngzuò de Lǐ Yīshēng",
            titleTranslation = "Dokter Li yang Bekerja di Rumah Sakit",
            level = "HSK 1",
            category = "Profesi & Belajar",
            description = "Dedikasi dokter Li di rumah sakit dan kegemarannya membaca buku di komputer.",
            coverEmoji = "👨‍⚕️",
            estimatedReadMinutes = 2,
            sentences = listOf(
                Sentence("s5_1", "李先生是一位好医生，在医院工作。", "Lǐ xiānsheng shì yí wèi hǎo yīshēng, zài yīyuàn gōngzuò.", "Tuan Li adalah seorang dokter yang baik, bekerja di rumah sakit.", listOf(findToken("是"), findToken("好"), findToken("医生"), findToken("在"), findToken("医院"), findToken("工作"))),
                Sentence("s5_2", "他每天都很忙，看见很多病人。", "Tā měitiān dōu hěn máng, kànjiàn hěn duō bìngrén.", "Dia setiap hari sangat sibuk, melihat banyak pasien.", listOf(findToken("他"), findToken("都"), findToken("很"), findToken("看见"), findToken("很"), findToken("多"), findToken("人"))),
                Sentence("s5_3", "下午不工作的时候，他喜欢看书。", "Xiàwǔ bù gōngzuò de shíhou, tā xǐhuan kàn shū.", "Sore hari saat tidak bekerja, dia suka membaca buku.", listOf(findToken("下午"), findToken("不"), findToken("工作"), findToken("的"), findToken("时候"), findToken("他"), findToken("喜欢"), findToken("看"), findToken("书"))),
                Sentence("s5_4", "他在电脑上看电影，也写汉字。", "Tā zài diànnǎo shang kàn diànyǐng, yě xiě hànzì.", "Dia menonton film di komputer, dan juga menulis karakter Hanzi.", listOf(findToken("他"), findToken("在"), findToken("电脑"), findToken("上"), findToken("看"), findToken("电影"), findToken("也"), findToken("写"), findToken("汉语"), findToken("字"))),
                Sentence("s5_5", "他会说汉语，说得很好听。", "Tā huì shuō hànyǔ, shuō de hěn hǎotīng.", "Dia bisa berbicara bahasa Mandarin, ucapannya sangat enak didengar.", listOf(findToken("他"), findToken("会"), findToken("说"), findToken("汉语"), findToken("很"), findToken("好"), findToken("听")))
            ),
            questions = listOf(
                StoryQuestion("q5_1", "李先生在哪里工作？(Di mana Tuan Li bekerja?)", listOf("在医院 (Di rumah sakit)", "在学校 (Di sekolah)", "在饭馆 (Di restoran)", "在商店 (Di toko)"), 0, "Kalimat 1: '在医院工作' (bekerja di rumah sakit)."),
                StoryQuestion("q5_2", "不工作的时候，他喜欢做什么？(Saat tidak bekerja, apa yang dia suka lakukan?)", listOf("睡觉 (Tidur)", "看书 (Membaca buku)", "买东西 (Belanja)", "开出租车 (Nyetir taksi)"), 1, "Kalimat 3: '他喜欢看书' (dia suka membaca buku).")
            )
        ),

        // Cerita 6 - Perjalanan, Transportasi & Cuaca
        Story(
            id = "story_6",
            titleHanzi = "去火车站的路上",
            titlePinyin = "Qù Huǒchēzhàn de Lùshang",
            titleTranslation = "Di Perjalanan Menuju Stasiun Kereta",
            level = "HSK 1",
            category = "Transportasi & Cuaca",
            description = "Perjalanan naik taksi di bawah cuaca Beijing yang sejuk menuju stasiun.",
            coverEmoji = "🚕",
            estimatedReadMinutes = 2,
            sentences = listOf(
                Sentence("s6_1", "今天天气很好，不太热，也不冷。", "Jīntiān tiānqì hěn hǎo, bú tài rè, yě bù lěng.", "Cuaca hari ini sangat bagus, tidak terlalu panas dan tidak dingin.", listOf(findToken("今天"), findToken("天气"), findToken("很"), findToken("好"), findToken("不"), findToken("太"), findToken("热"), findToken("也"), findToken("不"), findToken("冷"))),
                Sentence("s6_2", "我们要坐出租车去火车站。", "Wǒmen yào zuò chūzūchē qù huǒchēzhàn.", "Kami mau naik taksi pergi ke stasiun kereta api.", listOf(findToken("我们"), findToken("坐"), findToken("出租车"), findToken("去"), findToken("火车站"))),
                Sentence("s6_3", "前面有一辆车，司机开得很慢。", "Qiánmiàn yǒu yí liàng chē, sījī kāi de hěn màn.", "Di depan ada sebuah mobil, supir mengemudi perlahan.", listOf(findToken("前面"), findToken("有"), findToken("开"), findToken("很"))),
                Sentence("s6_4", "火车站就在前面，我们到了吗？", "Huǒchēzhàn jiù zài qiánmiàn, wǒmen dào le ma?", "Stasiun kereta tepat di depan, apakah kita sudah sampai?", listOf(findToken("火车站"), findToken("在"), findToken("前面"), findToken("我们"), findToken("了"), findToken("吗"))),
                Sentence("s6_5", "司机说：“前面就是，下车吧！”", "Sījī shuō: \"Qiánmiàn jiù shì, xià chē ba!\"", "Supir berkata: \"Depan sana sudah sampai, ayo turun mobil!\"", listOf(findToken("说"), findToken("前面"), findToken("是"), findToken("下"), findToken("吧")))
            ),
            questions = listOf(
                StoryQuestion("q6_1", "今天天气怎么样？(Bagaimana cuaca hari ini?)", listOf("很冷 (Sangat dingin)", "下雨 (Hujan)", "很好，不热也不冷 (Bagus, tidak panas/dingin)", "太热了 (Terlalu panas)"), 2, "Kalimat 1: '今天天气很好，不太热，也不冷'."),
                StoryQuestion("q6_2", "他们坐什么车去火车站？(Naik kendaraan apa ke stasiun?)", listOf("飞机 (Pesawat)", "出租车 (Taksi)", "自行车 (Sepeda)", "火车 (Kereta)"), 1, "Kalimat 2: '坐出租车去火车站'.")
            )
        )
    )

    // =========================================================================
    // 6 BAB UTAMA (UNITS) DENGAN STAGE MENGIKUTI POLA SCREENSHOT HELLOCHINESE
    // =========================================================================
    val units: List<UnitCourse> = listOf(
        // BAB 1: Sapaan, Identitas & Berteman
        UnitCourse(
            id = "unit_1",
            unitNumber = 1,
            title = "Membuat teman baru",
            subtitle = "Sapaan dasar, perkenalan diri, dan kesopanan",
            bannerTitle = "Membuat teman baru",
            emoji = "👋",
            level = "Level 1",
            story = stories[0],
            nodes = listOf(
                PathNode("u1_n1", "Sapaan 1", Color(0xFFE91E63), NodeIconType.CAP, isCompleted = true, lessonId = "u1_l1"),
                PathNode("u1_n2", "Identitas", Color(0xFFFFC107), NodeIconType.CAP, isCompleted = true, lessonId = "u1_l1"),
                PathNode("u1_n3", "Latihan H", Color(0xFFFFC107), NodeIconType.DUMBBELL, isCompleted = true, lessonId = "u1_l1"),
                PathNode("u1_n4", "Teman Baru", Color(0xFFFFC107), NodeIconType.CAP, isCompleted = false, lessonId = "u1_l1"),
                PathNode("u1_n5", "Review H", Color(0xFFFFC107), NodeIconType.DUMBBELL, isCompleted = false, lessonId = "u1_l1"),
                PathNode("u1_n6", "Checkpoint", Color(0xFFFFB300), NodeIconType.CHEST, isCompleted = false, lessonId = "u1_l1"),
                PathNode("u1_n7", "Rest area", Color(0xFF03A9F4), NodeIconType.REST_AREA, isCompleted = false, lessonId = "u1_l1")
            ),
            lessons = listOf(
                Lesson(
                    id = "u1_l1",
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
                        // 1. Screenshot 4: Pilih gambar yang benar
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
                        // 2. Screenshot 6: Lengkapi terjemahan
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
                        // 3. Screenshot 7: Pilih terjemahan yang benar
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
                        // 4. Screenshot 9: Apa yang Anda dengar? (Sentence Builder)
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
                        // 5. Screenshot 10: Pilih terjemahan yang benar
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
                        // 6. Screenshot 11 & 12: Ketuk pasangan yang sesuai
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
        ),

        // BAB 2: Angka, Umur & Waktu
        UnitCourse(
            id = "unit_2",
            unitNumber = 2,
            title = "Angka & Waktu",
            subtitle = "Menyebutkan tanggal, umur, jam, dan menit",
            bannerTitle = "Jam & Jadwal Harian",
            emoji = "⏰",
            level = "Level 2",
            story = stories[1],
            nodes = listOf(
                PathNode("u2_n1", "Angka 1-10", Color(0xFF03A9F4), NodeIconType.CAP, isCompleted = false, lessonId = "u2_l1"),
                PathNode("u2_n2", "Umur & Tahun", Color(0xFFFFC107), NodeIconType.CAP, isCompleted = false, lessonId = "u2_l1"),
                PathNode("u2_n3", "Latihan Waktu", Color(0xFFFFC107), NodeIconType.DUMBBELL, isCompleted = false, lessonId = "u2_l1"),
                PathNode("u2_n4", "Jam & Menit", Color(0xFFFFC107), NodeIconType.CAP, isCompleted = false, lessonId = "u2_l1"),
                PathNode("u2_n5", "Checkpoint", Color(0xFFFFB300), NodeIconType.CHEST, isCompleted = false, lessonId = "u2_l1")
            ),
            lessons = listOf(
                Lesson(
                    id = "u2_l1",
                    title = "Menyatakan Waktu & Usia",
                    subtitle = "Jam, menit, dan usia",
                    grammarNote = "Pola usia: 'Subjek + Angka + 岁'. Jam: '点 (jam) + 分 (menit)'. Contoh: 八点三十分 (jam 8 lewat 30).",
                    newWords = listOf(
                        Word("w2_1", "今天", "jīntiān", "Hari ini", "Waktu", "今天是星期天。", "Jīntiān shì xīngqītiān.", "Hari ini hari Minggu."),
                        Word("w2_2", "点", "diǎn", "Jam (pukul)", "Waktu", "现在八点。", "Xiànzài bā diǎn.", "Sekarang jam 8."),
                        Word("w2_3", "岁", "suì", "Tahun (umur)", "Satuan", "我二十岁。", "Wǒ èrshí suì.", "Saya 20 tahun.")
                    ),
                    exercises = listOf(
                        Exercise(
                            id = "u2_ex1",
                            type = ExerciseType.PICTURE_CHOICE,
                            title = "Pilih gambar yang benar",
                            targetHanzi = "今天",
                            targetPinyin = "jīntiān",
                            targetTranslation = "Hari ini",
                            correctAnswer = "hari ini",
                            audioToSpeak = "今天",
                            pictureOptions = listOf(
                                PictureOption("p2_1", "hari ini", "📅", isCorrect = true),
                                PictureOption("p2_2", "kemarin", "⏮️", isCorrect = false),
                                PictureOption("p2_3", "jam", "⏰", isCorrect = false),
                                PictureOption("p2_4", "tahun", "🌍", isCorrect = false)
                            )
                        ),
                        Exercise(
                            id = "u2_ex2",
                            type = ExerciseType.FILL_BLANK,
                            title = "Lengkapi terjemahan",
                            targetHanzi = "现在 八 点 。",
                            targetPinyin = "Xiànzài bā diǎn .",
                            targetTranslation = "Sekarang jam delapan.",
                            sentenceWithBlank = "Sekarang ________ delapan.",
                            options = listOf("jam", "umur", "hari"),
                            correctAnswer = "jam",
                            audioToSpeak = "现在八点。"
                        ),
                        Exercise(
                            id = "u2_ex3",
                            type = ExerciseType.MATCH_PAIRS,
                            title = "Ketuk pasangan yang sesuai",
                            correctAnswer = "ALL_MATCHED",
                            matchPairs = listOf(
                                MatchPairItem("m2_1", "今天", "jīntiān", "hari ini"),
                                MatchPairItem("m2_2", "现在", "xiànzài", "sekarang"),
                                MatchPairItem("m2_3", "点", "diǎn", "jam"),
                                MatchPairItem("m2_4", "岁", "suì", "umur"),
                                MatchPairItem("m2_5", "分钟", "fēnzhōng", "menit")
                            )
                        )
                    )
                )
            )
        ),

        // BAB 3: Keluarga & Rumah
        UnitCourse(
            id = "unit_3",
            unitNumber = 3,
            title = "Keluarga & Rumah",
            subtitle = "Anggota keluarga, kepemilikan 有, dan hewan peliharaan",
            bannerTitle = "Keluarga & Hewan Peliharaan",
            emoji = "🏡",
            level = "Level 3",
            story = stories[2],
            nodes = listOf(
                PathNode("u3_n1", "Ayah & Ibu", Color(0xFF4CAF50), NodeIconType.CAP, isCompleted = false, lessonId = "u3_l1"),
                PathNode("u3_n2", "Anak & Saudara", Color(0xFFFFC107), NodeIconType.CAP, isCompleted = false, lessonId = "u3_l1"),
                PathNode("u3_n3", "Latihan Keluarga", Color(0xFFFFC107), NodeIconType.DUMBBELL, isCompleted = false, lessonId = "u3_l1"),
                PathNode("u3_n4", "Kucing & Rumah", Color(0xFFFFC107), NodeIconType.CAP, isCompleted = false, lessonId = "u3_l1"),
                PathNode("u3_n5", "Checkpoint", Color(0xFFFFB300), NodeIconType.CHEST, isCompleted = false, lessonId = "u3_l1")
            ),
            lessons = listOf(
                Lesson(
                    id = "u3_l1",
                    title = "Anggota Keluarga",
                    subtitle = "Ayah, ibu, dan hewan peliharaan",
                    grammarNote = "Menyatakan ada / punya: 'Subjek + 有 (yǒu) + Benda/Orang'. Negasi: '没有 (méiyǒu)'. Contoh: 我家有一只猫 (Rumah saya ada seekor kucing).",
                    newWords = listOf(
                        Word("w3_1", "爸爸", "bàba", "Ayah", "Keluarga", "我爸爸很好。", "Wǒ bàba hěn hǎo.", "Ayah saya sangat baik."),
                        Word("w3_2", "妈妈", "māma", "Ibu", "Keluarga", "妈妈爱我。", "Māma ài wǒ.", "Ibu menyayangi saya."),
                        Word("w3_3", "猫", "māo", "Kucing", "Hewan", "小猫很漂亮。", "Xiǎomāo hěn piàoliang.", "Anak kucing sangat cantik.")
                    ),
                    exercises = listOf(
                        Exercise(
                            id = "u3_ex1",
                            type = ExerciseType.PICTURE_CHOICE,
                            title = "Pilih gambar yang benar",
                            targetHanzi = "猫",
                            targetPinyin = "māo",
                            targetTranslation = "Kucing",
                            correctAnswer = "kucing",
                            audioToSpeak = "猫",
                            pictureOptions = listOf(
                                PictureOption("p3_1", "kucing", "🐱", isCorrect = true),
                                PictureOption("p3_2", "anjing", "🐶", isCorrect = false),
                                PictureOption("p3_3", "rumah", "🏠", isCorrect = false),
                                PictureOption("p3_4", "ayah", "👨", isCorrect = false)
                            )
                        ),
                        Exercise(
                            id = "u3_ex2",
                            type = ExerciseType.MATCH_PAIRS,
                            title = "Ketuk pasangan yang sesuai",
                            correctAnswer = "ALL_MATCHED",
                            matchPairs = listOf(
                                MatchPairItem("m3_1", "爸爸", "bàba", "ayah"),
                                MatchPairItem("m3_2", "妈妈", "māma", "ibu"),
                                MatchPairItem("m3_3", "猫", "māo", "kucing"),
                                MatchPairItem("m3_4", "狗", "gǒu", "anjing"),
                                MatchPairItem("m3_5", "家", "jiā", "rumah")
                            )
                        )
                    )
                )
            )
        ),

        // BAB 4: Makanan & Minuman di Restoran
        UnitCourse(
            id = "unit_4",
            unitNumber = 4,
            title = "Makanan & Kafe",
            subtitle = "Memesan nasi, sayur, teh, dan menanyakan harga",
            bannerTitle = "Di Restoran Tiongkok",
            emoji = "🍜",
            level = "Level 4",
            story = stories[3],
            nodes = listOf(
                PathNode("u4_n1", "Makan & Minum", Color(0xFFFF9800), NodeIconType.CAP, isCompleted = false, lessonId = "u4_l1"),
                PathNode("u4_n2", "Nasi & Teh", Color(0xFFFFC107), NodeIconType.CAP, isCompleted = false, lessonId = "u4_l1"),
                PathNode("u4_n3", "Latihan Kafe", Color(0xFFFFC107), NodeIconType.DUMBBELL, isCompleted = false, lessonId = "u4_l1"),
                PathNode("u4_n4", "Berapa Harganya", Color(0xFFFFC107), NodeIconType.CAP, isCompleted = false, lessonId = "u4_l1"),
                PathNode("u4_n5", "Checkpoint", Color(0xFFFFB300), NodeIconType.CHEST, isCompleted = false, lessonId = "u4_l1")
            ),
            lessons = listOf(
                Lesson(
                    id = "u4_l1",
                    title = "Memesan Makanan & Teh",
                    subtitle = "Kata kerja 吃 dan 喝",
                    grammarNote = "Menanyakan harga: '多少钱？ (duōshao qián)'. Satuan uang: '块 (kuài)'. Contoh: 一共多少钱？ (Totalnya berapa harganya?).",
                    newWords = listOf(
                        Word("w4_1", "吃", "chī", "Makan", "Kata kerja", "你想吃什么？", "Nǐ xiǎng chī shénme?", "Kamu mau makan apa?"),
                        Word("w4_2", "喝", "hē", "Minum", "Kata kerja", "我想喝茶。", "Wǒ xiǎng hē chá.", "Saya mau minum teh."),
                        Word("w4_3", "米饭", "mǐfàn", "Nasi putih", "Makanan", "米饭很好吃。", "Mǐfàn hěn hǎochī.", "Nasi putih sangat enak.")
                    ),
                    exercises = listOf(
                        Exercise(
                            id = "u4_ex1",
                            type = ExerciseType.PICTURE_CHOICE,
                            title = "Pilih gambar yang benar",
                            targetHanzi = "茶",
                            targetPinyin = "chá",
                            targetTranslation = "Teh",
                            correctAnswer = "teh",
                            audioToSpeak = "茶",
                            pictureOptions = listOf(
                                PictureOption("p4_1", "teh", "🍵", isCorrect = true),
                                PictureOption("p4_2", "air", "💧", isCorrect = false),
                                PictureOption("p4_3", "apel", "🍎", isCorrect = false),
                                PictureOption("p4_4", "nasi", "🍚", isCorrect = false)
                            )
                        ),
                        Exercise(
                            id = "u4_ex2",
                            type = ExerciseType.FILL_BLANK,
                            title = "Lengkapi terjemahan",
                            targetHanzi = "我 想 喝 茶 。",
                            targetPinyin = "Wǒ xiǎng hē chá .",
                            targetTranslation = "Saya ingin minum teh.",
                            sentenceWithBlank = "Saya ingin ________ teh.",
                            options = listOf("minum", "makan", "beli"),
                            correctAnswer = "minum",
                            audioToSpeak = "我想喝茶。"
                        ),
                        Exercise(
                            id = "u4_ex3",
                            type = ExerciseType.MATCH_PAIRS,
                            title = "Ketuk pasangan yang sesuai",
                            correctAnswer = "ALL_MATCHED",
                            matchPairs = listOf(
                                MatchPairItem("m4_1", "吃", "chī", "makan"),
                                MatchPairItem("m4_2", "喝", "hē", "minum"),
                                MatchPairItem("m4_3", "米饭", "mǐfàn", "nasi"),
                                MatchPairItem("m4_4", "茶", "chá", "teh"),
                                MatchPairItem("m4_5", "苹果", "píngguǒ", "apel")
                            )
                        )
                    )
                )
            )
        ),

        // BAB 5: Belajar, Menulis Hanzi & Bekerja
        UnitCourse(
            id = "unit_5",
            unitNumber = 5,
            title = "Belajar & Profesi",
            subtitle = "Menulis karakter Hanzi, membaca buku, dan profesi dokter",
            bannerTitle = "Di Sekolah & Rumah Sakit",
            emoji = "💻",
            level = "Level 5",
            story = stories[4],
            nodes = listOf(
                PathNode("u5_n1", "Belajar Hanzi", Color(0xFF9C27B0), NodeIconType.CAP, isCompleted = false, lessonId = "u5_l1"),
                PathNode("u5_n2", "Dokter & RS", Color(0xFFFFC107), NodeIconType.CAP, isCompleted = false, lessonId = "u5_l1"),
                PathNode("u5_n3", "Latihan Komputer", Color(0xFFFFC107), NodeIconType.DUMBBELL, isCompleted = false, lessonId = "u5_l1"),
                PathNode("u5_n4", "Buku & TV", Color(0xFFFFC107), NodeIconType.CAP, isCompleted = false, lessonId = "u5_l1"),
                PathNode("u5_n5", "Checkpoint", Color(0xFFFFB300), NodeIconType.CHEST, isCompleted = false, lessonId = "u5_l1")
            ),
            lessons = listOf(
                Lesson(
                    id = "u5_l1",
                    title = "Belajar Bahasa Mandarin",
                    subtitle = "Menulis karakter dan membaca buku",
                    grammarNote = "Menyatakan keahlian: '会 (huì) + Kata kerja'. Contoh: 我会写汉字 (Saya bisa menulis aksara Hanzi).",
                    newWords = listOf(
                        Word("w5_1", "学习", "xuéxí", "Belajar", "Kata kerja", "我在学习汉语。", "Wǒ zài xuéxí hànyǔ.", "Saya sedang belajar bahasa Mandarin."),
                        Word("w5_2", "书", "shū", "Buku", "Benda", "这是一本书。", "Zhè shì yì běn shū.", "Ini adalah sebuah buku."),
                        Word("w5_3", "电脑", "diànnǎo", "Komputer", "Benda", "电脑在桌子上。", "Diànnǎo zài zhuōzi shang.", "Komputer di atas meja.")
                    ),
                    exercises = listOf(
                        Exercise(
                            id = "u5_ex1",
                            type = ExerciseType.PICTURE_CHOICE,
                            title = "Pilih gambar yang benar",
                            targetHanzi = "书",
                            targetPinyin = "shū",
                            targetTranslation = "Buku",
                            correctAnswer = "buku",
                            audioToSpeak = "书",
                            pictureOptions = listOf(
                                PictureOption("p5_1", "buku", "📚", isCorrect = true),
                                PictureOption("p5_2", "komputer", "💻", isCorrect = false),
                                PictureOption("p5_3", "televisi", "📺", isCorrect = false),
                                PictureOption("p5_4", "film", "🎬", isCorrect = false)
                            )
                        ),
                        Exercise(
                            id = "u5_ex2",
                            type = ExerciseType.MATCH_PAIRS,
                            title = "Ketuk pasangan yang sesuai",
                            correctAnswer = "ALL_MATCHED",
                            matchPairs = listOf(
                                MatchPairItem("m5_1", "学习", "xuéxí", "belajar"),
                                MatchPairItem("m5_2", "书", "shū", "buku"),
                                MatchPairItem("m5_3", "电脑", "diànnǎo", "komputer"),
                                MatchPairItem("m5_4", "电影", "diànyǐng", "film"),
                                MatchPairItem("m5_5", "工作", "gōngzuò", "bekerja")
                            )
                        )
                    )
                )
            )
        ),

        // BAB 6: Perjalanan, Transportasi, Arah & Cuaca
        UnitCourse(
            id = "unit_6",
            unitNumber = 6,
            title = "Arah & Transportasi",
            subtitle = "Naik taksi, pesawat, stasiun kereta, dan cuaca",
            bannerTitle = "Di Perjalanan & Cuaca",
            emoji = "🚕",
            level = "Level 6",
            story = stories[5],
            nodes = listOf(
                PathNode("u6_n1", "Taksi & Kereta", Color(0xFF009688), NodeIconType.CAP, isCompleted = false, lessonId = "u6_l1"),
                PathNode("u6_n2", "Arah Depan Belakang", Color(0xFFFFC107), NodeIconType.CAP, isCompleted = false, lessonId = "u6_l1"),
                PathNode("u6_n3", "Latihan Cuaca", Color(0xFFFFC107), NodeIconType.DUMBBELL, isCompleted = false, lessonId = "u6_l1"),
                PathNode("u6_n4", "Stasiun Kereta", Color(0xFFFFC107), NodeIconType.CAP, isCompleted = false, lessonId = "u6_l1"),
                PathNode("u6_n5", "Checkpoint HSK 1", Color(0xFFFFB300), NodeIconType.CHEST, isCompleted = false, lessonId = "u6_l1")
            ),
            lessons = listOf(
                Lesson(
                    id = "u6_l1",
                    title = "Menuju Stasiun Kereta",
                    subtitle = "Taksi, arah jalan, dan cuaca",
                    grammarNote = "Naik kendaraan: '坐 (zuò) + Kendaraan'. Menyetir: '开 (kāi) + Mobil'. Menanyakan cuaca: '天气怎么样？'.",
                    newWords = listOf(
                        Word("w6_1", "出租车", "chūzūchē", "Taksi", "Transportasi", "我们坐出租车。", "Wǒmen zuò chūzūchē.", "Kami naik taksi."),
                        Word("w6_2", "火车站", "huǒchēzhàn", "Stasiun Kereta", "Tempat", "火车站就在前面。", "Huǒchēzhàn jiù zài qiánmiàn.", "Stasiun kereta tepat di depan."),
                        Word("w6_3", "天气", "tiānqì", "Cuaca", "Alam", "今天天气很好。", "Jīntiān tiānqì hěn hǎo.", "Hari ini cuaca sangat bagus.")
                    ),
                    exercises = listOf(
                        Exercise(
                            id = "u6_ex1",
                            type = ExerciseType.PICTURE_CHOICE,
                            title = "Pilih gambar yang benar",
                            targetHanzi = "出租车",
                            targetPinyin = "chūzūchē",
                            targetTranslation = "Taksi",
                            correctAnswer = "taksi",
                            audioToSpeak = "出租车",
                            pictureOptions = listOf(
                                PictureOption("p6_1", "taksi", "🚕", isCorrect = true),
                                PictureOption("p6_2", "pesawat", "✈️", isCorrect = false),
                                PictureOption("p6_3", "hujan", "🌧️", isCorrect = false),
                                PictureOption("p6_4", "stasiun", "🚉", isCorrect = false)
                            )
                        ),
                        Exercise(
                            id = "u6_ex2",
                            type = ExerciseType.MATCH_PAIRS,
                            title = "Ketuk pasangan yang sesuai",
                            correctAnswer = "ALL_MATCHED",
                            matchPairs = listOf(
                                MatchPairItem("m6_1", "出租车", "chūzūchē", "taksi"),
                                MatchPairItem("m6_2", "火车站", "huǒchēzhàn", "stasiun kereta"),
                                MatchPairItem("m6_3", "飞机", "fēijī", "pesawat"),
                                MatchPairItem("m6_4", "天气", "tiānqì", "cuaca"),
                                MatchPairItem("m6_5", "前面", "qiánmiàn", "depan")
                            )
                        )
                    )
                )
            )
        )
    )
}
