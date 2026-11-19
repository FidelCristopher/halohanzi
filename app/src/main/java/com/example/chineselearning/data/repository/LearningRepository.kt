package com.example.chineselearning.data.repository

import androidx.compose.runtime.mutableStateMapOf
import androidx.compose.ui.graphics.Color
import com.example.chineselearning.R
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

    val stageProgress = mutableStateMapOf<String, Int>()

    fun getStageProgress(nodeId: String): Int {
        return stageProgress.getOrPut(nodeId) { 1 } // Default is 1 -> "1/2"
    }

    fun toggleStageProgress(nodeId: String, maxParts: Int = 2): Int {
        val curr = getStageProgress(nodeId)
        val next = if (curr >= maxParts) 1 else curr + 1
        stageProgress[nodeId] = next
        return next
    }

    fun setStageProgress(nodeId: String, part: Int) {
        stageProgress[nodeId] = part
    }

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
    // CERITA BERJENJANG (GRADED READERS) RESMI MANDARIN BEAN
    // =========================================================================
    val stories: List<Story> by lazy {
        mandarinBeanStories
    }

    // =========================================================================
    // 6 BAB UTAMA (UNITS) KURIKULUM MANDARIN HSK 1
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
                PathNode("u1_n2", "Halo!", Color(0xFFFFC107), NodeIconType.CAP, isCompleted = true, lessonId = "u1_l1"),
                PathNode("u1_n3", "Halo!", Color(0xFFFFC107), NodeIconType.DUMBBELL, isCompleted = true, lessonId = "u1_l2"),
                PathNode("u1_n4", "Apakah kamu orang Tiongkok?", Color(0xFFFFC107), NodeIconType.CAP, isCompleted = false, lessonId = "u1_l3"),
                PathNode("u1_n5", "Apakah kamu orang Tiongkok?", Color(0xFFFFC107), NodeIconType.DUMBBELL, isCompleted = false, lessonId = "u1_l4"),
                PathNode("u1_n6", "Latihan Komprehensif", Color(0xFFFFC107), NodeIconType.SHUFFLE, isCompleted = false, lessonId = "u1_l5"),
                PathNode("u1_n7", "Kuis Cerita", Color(0xFFFFC107), NodeIconType.BOOK, isCompleted = false, lessonId = "u1_l1"),
                PathNode("u1_n8", "Checkpoint Peti", Color(0xFFFFB300), NodeIconType.CHEST, isCompleted = false, lessonId = "u1_l1"),
                PathNode("u1_n9", "Rest area", Color(0xFF03A9F4), NodeIconType.REST_AREA, isCompleted = false, lessonId = "u1_l1")
            ),
            lessons = listOf(
                Lesson(
                    id = "u1_l1",
                    title = "Halo!",
                    subtitle = "Sapaan dasar & Identitas",
                    grammarNote = "Pola kalimat 'A 是 B' (A adalah B). Negasi menggunakan '不是'. Contoh: 我是印尼人 (Saya orang Indonesia).",
                    newWords = listOf(
                        Word("w1", "你好", "nǐ hǎo", "Halo", "Sapaan", "你好！", "Nǐ hǎo!", "Halo!"),
                        Word("w2", "印度尼西亚", "Yìndùníxīyà", "(negara) Indonesia", "Nama negara", "我是印度尼西亚人。", "Wǒ shì Yìndùníxīyà rén.", "Saya orang Indonesia."),
                        Word("w3", "学生", "xuéshēng", "Murid / Siswa", "Kata benda", "布迪是学生。", "Bùdí shì xuéshēng.", "Budi adalah seorang murid."),
                        Word("w4", "老师", "lǎoshī", "(Bapak atau Ibu) Guru", "Kata benda", "老师好！", "Lǎoshī hǎo!", "Halo Guru!")
                    ),
                    exercisesPart1 = listOf(
                        // 1. Soal 1: Pilihan Gambar Sapaan Dasar (你好)
                        Exercise(
                            id = "u1_p1_q1",
                            type = ExerciseType.PICTURE_CHOICE,
                            title = "Pilih gambar yang benar",
                            targetHanzi = "你好",
                            targetPinyin = "nǐhǎo",
                            targetTranslation = "halo",
                            correctAnswer = "halo",
                            audioToSpeak = "你好",
                            pictureOptions = listOf(
                                PictureOption("pic_saya", "saya", "🙋‍♂️", iconRes = com.example.chineselearning.R.drawable.ill_cartoon_saya, isCorrect = false),
                                PictureOption("pic_indo", "(negara)\nIndonesia", "🇮🇩", iconRes = com.example.chineselearning.R.drawable.ill_cartoon_indonesia, isCorrect = false),
                                PictureOption("pic_halo", "halo", "👋", iconRes = com.example.chineselearning.R.drawable.ill_cartoon_halo, isCorrect = true),
                                PictureOption("pic_guru", "guru", "👩‍🏫", iconRes = com.example.chineselearning.R.drawable.ill_cartoon_guru, isCorrect = false)
                            )
                        ),
                        // 2. Soal 2: Pilihan Gambar Kata Ganti (我)
                        Exercise(
                            id = "u1_p1_q2",
                            type = ExerciseType.PICTURE_CHOICE,
                            title = "Pilih gambar yang benar",
                            targetHanzi = "我",
                            targetPinyin = "wǒ",
                            targetTranslation = "saya",
                            correctAnswer = "saya",
                            audioToSpeak = "我",
                            pictureOptions = listOf(
                                PictureOption("pic2_halo", "halo", "👋", iconRes = com.example.chineselearning.R.drawable.ill_cartoon_halo, isCorrect = false),
                                PictureOption("pic2_saya", "saya", "🙋‍♂️", iconRes = com.example.chineselearning.R.drawable.ill_cartoon_saya, isCorrect = true)
                            )
                        ),
                        // 3. Soal 3: Pilihan Terjemahan Kalimat (你好，我叫布迪。)
                        Exercise(
                            id = "u1_p1_q3",
                            type = ExerciseType.SENTENCE_CHOICE,
                            title = "Pilih terjemahan yang benar",
                            targetHanzi = "你好， 我 叫 布迪。",
                            targetPinyin = "Nǐhǎo wǒ jiào Bùdí",
                            targetTranslation = "Halo, nama saya Budi.",
                            options = listOf(
                                "Halo, Budi.",
                                "Halo, nama saya Budi.",
                                "Halo, nama saya Wang Fei.",
                                "Halo Budi, nama saya Wang Fei."
                            ),
                            correctAnswer = "Halo, nama saya Budi.",
                            audioToSpeak = "你好，我叫布迪。"
                        ),
                        // 4. Soal 4: Lengkapi Terjemahan Slot Kata (我叫王飞。)
                        Exercise(
                            id = "u1_p1_q4",
                            type = ExerciseType.FILL_BLANK,
                            title = "Lengkapi terjemahan",
                            targetHanzi = "我 叫 王飞。",
                            targetPinyin = "Wǒ jiào WángFēi",
                            targetTranslation = "Nama saya Wang Fei.",
                            sentenceWithBlank = "________ saya Wang Fei.",
                            options = listOf("Nama", "Marga", "Identitas"),
                            correctAnswer = "Nama",
                            audioToSpeak = "我叫王飞。"
                        ),
                        // 5. Soal 5: Pilihan Terjemahan Kata Grid (叫)
                        Exercise(
                            id = "u1_p1_q5",
                            type = ExerciseType.SENTENCE_CHOICE,
                            title = "Pilih terjemahan yang benar",
                            targetHanzi = "叫",
                            targetPinyin = "jiào",
                            targetTranslation = "dipanggil",
                            options = listOf(
                                "saya",
                                "(nama) Budi",
                                "halo",
                                "dipanggil"
                            ),
                            correctAnswer = "dipanggil",
                            audioToSpeak = "叫"
                        ),
                        // 6. Soal 6: Pilihan Terjemahan Kalimat Terbalik (Nama saya Budi.)
                        Exercise(
                            id = "u1_p1_q6",
                            type = ExerciseType.SENTENCE_CHOICE,
                            title = "Pilih terjemahan yang benar",
                            targetHanzi = "",
                            targetPinyin = "",
                            targetTranslation = "Nama saya Budi.",
                            options = listOf(
                                "Nǐhǎo Bùdí\n你好， 布迪。",
                                "WángFēi nǐhǎo\n王飞， 你好。",
                                "Wǒ jiào Bùdí\n我 叫 布迪。"
                            ),
                            correctAnswer = "Wǒ jiào Bùdí\n我 叫 布迪。",
                            audioToSpeak = "我叫布迪。"
                        ),
                        // 7. Soal 7: Susun Kalimat Audio Imersif (你好，我叫王飞。)
                        Exercise(
                            id = "u1_p1_q7",
                            type = ExerciseType.SENTENCE_BUILDER,
                            title = "Apa yang Anda dengar?",
                            targetHanzi = "你好， 我 叫 王飞。",
                            targetPinyin = "Nǐhǎo, wǒ jiào WángFēi.",
                            targetTranslation = "Halo, nama saya Wang Fei.",
                            wordChips = listOf("你好:nǐhǎo", "布迪:Bùdí", "我:wǒ", "叫:jiào"),
                            correctAnswer = "你好,我,叫",
                            audioToSpeak = "你好，我叫王飞。",
                            staticTrailingText = "王飞 。",
                            staticTrailingPinyin = "WángFēi",
                            hasCommaAfterSlot1 = true,
                            isImmersiveSpeaker = true
                        ),
                        // 8. Soal 8: Ketuk Pasangan Kata (叫, 我, 你好)
                        Exercise(
                            id = "u1_p1_q8",
                            type = ExerciseType.MATCH_PAIRS,
                            title = "Ketuk pasangan yang sesuai",
                            correctAnswer = "ALL_MATCHED",
                            matchPairs = listOf(
                                MatchPairItem("m1", "叫", "jiào", "dipanggil"),
                                MatchPairItem("m2", "我", "wǒ", "saya"),
                                MatchPairItem("m3", "你好", "nǐhǎo", "halo")
                            )
                        ),
                        // 9. Soal 9: Lengkapi Terjemahan Dua Slot (你好，王飞，我叫布迪。)
                        Exercise(
                            id = "u1_p1_q9",
                            type = ExerciseType.SENTENCE_BUILDER,
                            title = "Lengkapi terjemahan",
                            targetTranslation = "Halo Wang Fei, nama saya Budi.",
                            targetHanzi = "你好， 王飞， 我 叫 布迪。",
                            targetPinyin = "Nǐhǎo, WángFēi, wǒ jiào Bùdí.",
                            wordChips = listOf("你:nǐ", "我:wǒ", "叫:jiào", "印尼:Yìnní"),
                            correctAnswer = "我,叫",
                            audioToSpeak = "你好，王飞，我叫布迪。"
                        )
                    ),
                    exercisesPart2 = listOf(
                        // 1. Soal 1: Pilihan Gambar Negara Indonesia (印度尼西亚)
                        Exercise(
                            id = "u1_p2_q1",
                            type = ExerciseType.PICTURE_CHOICE,
                            title = "Pilih gambar yang benar",
                            targetHanzi = "印度尼西亚",
                            targetPinyin = "Yìndùníxīyà",
                            targetTranslation = "(negara)\nIndonesia",
                            correctAnswer = "(negara)\nIndonesia",
                            audioToSpeak = "印度尼西亚",
                            pictureOptions = listOf(
                                PictureOption("p2_q1_indo", "(negara)\nIndonesia", "🇮🇩", iconRes = com.example.chineselearning.R.drawable.ill_cartoon_indonesia, isCorrect = true),
                                PictureOption("p2_q1_murid", "murid", "🧑‍🎓", iconRes = com.example.chineselearning.R.drawable.ill_cartoon_murid, isCorrect = false),
                                PictureOption("p2_q1_saya", "saya", "🙋‍♂️", iconRes = com.example.chineselearning.R.drawable.ill_cartoon_saya, isCorrect = false),
                                PictureOption("p2_q1_guru", "guru", "👩‍🏫", iconRes = com.example.chineselearning.R.drawable.ill_cartoon_guru, isCorrect = false)
                            )
                        ),
                        // 2. Soal 2: Pilihan Gambar Kata Orang (人)
                        Exercise(
                            id = "u1_p2_q2",
                            type = ExerciseType.PICTURE_CHOICE,
                            title = "Pilih gambar yang benar",
                            targetHanzi = "人",
                            targetPinyin = "rén",
                            targetTranslation = "orang",
                            correctAnswer = "orang",
                            audioToSpeak = "人",
                            pictureOptions = listOf(
                                PictureOption("p2_q2_guru", "guru", "👩‍🏫", iconRes = com.example.chineselearning.R.drawable.ill_cartoon_guru, isCorrect = false),
                                PictureOption("p2_q2_saya", "saya", "🙋‍♂️", iconRes = com.example.chineselearning.R.drawable.ill_cartoon_saya, isCorrect = false),
                                PictureOption("p2_q2_orang", "orang", "👥", iconRes = com.example.chineselearning.R.drawable.ill_cartoon_orang, isCorrect = true),
                                PictureOption("p2_q2_murid", "murid", "🧑‍🎓", iconRes = com.example.chineselearning.R.drawable.ill_cartoon_murid, isCorrect = false)
                            )
                        ),
                        // 3. Soal 3: Lengkapi Terjemahan Kata Adalah (我是印度尼西亚人。)
                        Exercise(
                            id = "u1_p2_q3",
                            type = ExerciseType.FILL_BLANK,
                            title = "Lengkapi terjemahan",
                            targetHanzi = "我 是 印度尼西亚 人。",
                            targetPinyin = "Wǒ shì Yìndùníxīyà rén",
                            targetTranslation = "Saya adalah orang Indonesia.",
                            sentenceWithBlank = "Saya ________ orang Indonesia.",
                            options = listOf("bukan", "adalah", "kenal"),
                            correctAnswer = "adalah",
                            audioToSpeak = "我是印度尼西亚人。"
                        ),
                        // 4. Soal 4: Pilihan Gambar Singkatan Indonesia (印尼)
                        Exercise(
                            id = "u1_p2_q4",
                            type = ExerciseType.PICTURE_CHOICE,
                            title = "Pilih gambar yang benar",
                            targetHanzi = "印尼",
                            targetPinyin = "Yìnní",
                            targetTranslation = "(negara)\nIndonesia",
                            correctAnswer = "(negara)\nIndonesia",
                            audioToSpeak = "印尼",
                            pictureOptions = listOf(
                                PictureOption("p2_q4_saya", "saya", "🙋‍♂️", iconRes = com.example.chineselearning.R.drawable.ill_cartoon_saya, isCorrect = false),
                                PictureOption("p2_q4_murid", "murid", "🧑‍🎓", iconRes = com.example.chineselearning.R.drawable.ill_cartoon_murid, isCorrect = false),
                                PictureOption("p2_q4_guru", "guru", "👩‍🏫", iconRes = com.example.chineselearning.R.drawable.ill_cartoon_guru, isCorrect = false),
                                PictureOption("p2_q4_indo", "(negara)\nIndonesia", "🇮🇩", iconRes = com.example.chineselearning.R.drawable.ill_cartoon_indonesia, isCorrect = true)
                            )
                        ),
                        // 5. Soal 5: Pilihan Gambar Guru (老师)
                        Exercise(
                            id = "u1_p2_q5",
                            type = ExerciseType.PICTURE_CHOICE,
                            title = "Pilih gambar yang benar",
                            targetHanzi = "老师",
                            targetPinyin = "lǎoshī",
                            targetTranslation = "guru",
                            correctAnswer = "guru",
                            audioToSpeak = "老师",
                            pictureOptions = listOf(
                                PictureOption("p2_q5_guru", "guru", "👩‍🏫", iconRes = com.example.chineselearning.R.drawable.ill_cartoon_guru, isCorrect = true),
                                PictureOption("p2_q5_murid", "murid", "🧑‍🎓", iconRes = com.example.chineselearning.R.drawable.ill_cartoon_murid, isCorrect = false),
                                PictureOption("p2_q5_indo", "(negara)\nIndonesia", "🇮🇩", iconRes = com.example.chineselearning.R.drawable.ill_cartoon_indonesia, isCorrect = false),
                                PictureOption("p2_q5_orang", "orang", "👥", iconRes = com.example.chineselearning.R.drawable.ill_cartoon_orang, isCorrect = false)
                            )
                        ),
                        // 6. Soal 6: Pilihan Terjemahan Kalimat Panjang (老师，你好，我是印尼人。)
                        Exercise(
                            id = "u1_p2_q6",
                            type = ExerciseType.SENTENCE_CHOICE,
                            title = "Pilih terjemahan yang benar",
                            targetHanzi = "老师， 你好， 我是 印尼人。",
                            targetPinyin = "Lǎoshī nǐhǎo wǒshì Yìnnírén",
                            targetTranslation = "Halo (Bapak atau Ibu) Guru, saya adalah orang Indonesia.",
                            options = listOf(
                                "Saya adalah orang Indonesia.",
                                "Halo (Bapak atau Ibu) Guru, saya adalah orang Indonesia.",
                                "Halo, saya adalah seorang guru.",
                                "Halo, (Bapak atau Ibu) Guru."
                            ),
                            correctAnswer = "Halo (Bapak atau Ibu) Guru, saya adalah orang Indonesia.",
                            audioToSpeak = "老师，你好，我是印尼人。"
                        ),
                        // 7. Soal 7: Pilihan Gambar Murid (学生 - 1x2 Row)
                        Exercise(
                            id = "u1_p2_q7",
                            type = ExerciseType.PICTURE_CHOICE,
                            title = "Pilih gambar yang benar",
                            targetHanzi = "学生",
                            targetPinyin = "xuéshēng",
                            targetTranslation = "murid",
                            correctAnswer = "murid",
                            audioToSpeak = "学生",
                            pictureOptions = listOf(
                                PictureOption("p2_q7_murid", "murid", "🧑‍🎓", iconRes = com.example.chineselearning.R.drawable.ill_cartoon_murid, isCorrect = true),
                                PictureOption("p2_q7_orang", "orang", "👥", iconRes = com.example.chineselearning.R.drawable.ill_cartoon_orang, isCorrect = false)
                            )
                        ),
                        // 8. Soal 8: Susun Kalimat Audio Imersif (布迪是印尼人。)
                        Exercise(
                            id = "u1_p2_q8",
                            type = ExerciseType.SENTENCE_BUILDER,
                            title = "Apa yang Anda dengar?",
                            targetHanzi = "布迪 是 印尼 人。",
                            targetPinyin = "Bùdí shì Yìnní rén.",
                            targetTranslation = "Budi adalah orang Indonesia.",
                            staticLeadingText = "布迪",
                            staticLeadingPinyin = "Bùdí",
                            staticTrailingText = "。",
                            wordChips = listOf("是:shì", "学生:xuéshēng", "你好:nǐhǎo", "老师:lǎoshī", "人:rén", "印尼:Yìnní"),
                            correctAnswer = "是,印尼,人",
                            audioToSpeak = "布迪是印尼人。",
                            isImmersiveSpeaker = true
                        ),
                        // 9. Soal 9: Pilihan Terjemahan Kalimat (Budi adalah seorang murid.)
                        Exercise(
                            id = "u1_p2_q9",
                            type = ExerciseType.SENTENCE_CHOICE,
                            title = "Pilih terjemahan yang benar",
                            targetHanzi = "",
                            targetPinyin = "",
                            targetTranslation = "Budi adalah seorang murid.",
                            options = listOf(
                                "Bùdí shì xuéshēng\n布迪 是 学生。",
                                "Bùdí shì lǎoshī\n布迪 是 老师。",
                                "WángFēi shì xuéshēng\n王飞 是 学生。",
                                "Wǒ shì xuéshēng\n我 是 学生。"
                            ),
                            correctAnswer = "Bùdí shì xuéshēng\n布迪 是 学生。",
                            audioToSpeak = "布迪是学生。"
                        ),
                        // 10. Soal 10: Ketuk Pasangan yang Sesuai (5 Pasang Kartu)
                        Exercise(
                            id = "u1_p2_q10",
                            type = ExerciseType.MATCH_PAIRS,
                            title = "Ketuk pasangan yang sesuai",
                            correctAnswer = "ALL_MATCHED",
                            matchPairs = listOf(
                                MatchPairItem("m1", "印度尼西亚", "Yìndùníxīyà", "(negara) Indonesia"),
                                MatchPairItem("m2", "老师", "lǎoshī", "guru"),
                                MatchPairItem("m3", "人", "rén", "orang"),
                                MatchPairItem("m4", "学生", "xuéshēng", "murid"),
                                MatchPairItem("m5", "是", "shì", "adalah")
                            )
                        ),
                        // 11. Soal 11: Lengkapi Terjemahan Dua Slot (Wang Fei adalah seorang guru.)
                        Exercise(
                            id = "u1_p2_q11",
                            type = ExerciseType.SENTENCE_BUILDER,
                            title = "Lengkapi terjemahan",
                            targetTranslation = "Wang Fei adalah seorang guru.",
                            targetHanzi = "王飞 是 老师。",
                            targetPinyin = "WángFēi shì lǎoshī.",
                            staticLeadingText = "王飞",
                            staticLeadingPinyin = "WángFēi",
                            staticTrailingText = "。",
                            wordChips = listOf("学生:xuéshēng", "人:rén", "我:wǒ", "你好:nǐhǎo", "是:shì", "老师:lǎoshī"),
                            correctAnswer = "是,老师",
                            audioToSpeak = "王飞是老师。"
                        )
                    )
                ),
                Lesson(
                    id = "u1_l2",
                    title = "Halo!",
                    subtitle = "Latihan kosakata & pola kalimat Halo!",
                    grammarNote = "Latihan penguatan kosakata sapaan dan identitas.",
                    newWords = listOf(
                        Word("w1", "你好", "nǐ hǎo", "Halo", "Sapaan", "你好！", "Nǐ hǎo!", "Halo!"),
                        Word("w4", "老师", "lǎoshī", "Guru", "Kata benda", "老师好！", "Lǎoshī hǎo!", "Halo Guru!")
                    ),
                    exercisesPart1 = listOf(
                        // 1. Soal 1: Susun Audio Imersif (你好。)
                        Exercise(
                            id = "u1_l2_q1",
                            type = ExerciseType.SENTENCE_BUILDER,
                            title = "Apa yang Anda dengar?",
                            targetHanzi = "你好。",
                            targetPinyin = "Nǐhǎo.",
                            targetTranslation = "Halo.",
                            wordChips = listOf("你好:nǐhǎo", "布迪:Bùdí", "王飞:WángFēi", "我:wǒ", "叫:jiào"),
                            correctAnswer = "你好",
                            audioToSpeak = "你好。",
                            isImmersiveSpeaker = true
                        ),
                        // 2. Soal 2: Lengkapi Terjemahan Dua Slot dengan Koma (Halo, nama saya Budi.)
                        Exercise(
                            id = "u1_l2_q2",
                            type = ExerciseType.SENTENCE_BUILDER,
                            title = "Lengkapi terjemahan",
                            targetTranslation = "Halo, nama saya Budi.",
                            targetHanzi = "你好， 我 叫 布迪。",
                            targetPinyin = "Nǐhǎo, wǒ jiào Bùdí.",
                            staticTrailingText = "叫 布迪 。",
                            staticTrailingPinyin = "jiào Bùdí",
                            hasCommaAfterSlot1 = true,
                            wordChips = listOf("我:wǒ", "印度尼西亚:Yìndùníxīyà", "印尼:Yìnní", "老师:lǎoshī", "你好:nǐhǎo", "你:nǐ"),
                            correctAnswer = "你好,我",
                            audioToSpeak = "你好，我叫布迪。"
                        ),
                        // 3. Soal 3: Dengarkan Kalimat dan Pilih Terjemahan yang Benar (我叫王飞。)
                        Exercise(
                            id = "u1_l2_q3",
                            type = ExerciseType.SENTENCE_CHOICE,
                            title = "Dengarkan kalimat dan pilih terjemahan yang benar",
                            options = listOf(
                                "Nama saya Budi.",
                                "Halo, Wang Fei.",
                                "Nama saya Wang Fei.",
                                "Halo, nama saya Budi."
                            ),
                            correctAnswer = "Nama saya Wang Fei.",
                            audioToSpeak = "我叫王飞。"
                        ),
                        // 4. Soal 4: Lengkapi Terjemahan Tiga Slot Multiline (Halo Wang Fei, nama saya Budi.)
                        Exercise(
                            id = "u1_l2_q4",
                            type = ExerciseType.SENTENCE_BUILDER,
                            title = "Lengkapi terjemahan",
                            targetTranslation = "Halo Wang Fei, nama saya Budi.",
                            targetHanzi = "王飞， 你好， 我 叫 布迪。",
                            targetPinyin = "WángFēi, nǐhǎo, wǒ jiào Bùdí.",
                            staticLeadingText = "王飞 ，",
                            staticLeadingPinyin = "WángFēi",
                            hasCommaAfterSlot1 = true,
                            hasTrailingLine2 = true,
                            trailingLine2Text = "布迪 。",
                            trailingLine2Pinyin = "Bùdí",
                            wordChips = listOf("印度尼西亚:Yìndùníxīyà", "老师:lǎoshī", "印尼:Yìnní", "你:nǐ", "我:wǒ", "叫:jiào", "你好:nǐhǎo"),
                            correctAnswer = "你好,我,叫",
                            audioToSpeak = "王飞，你好，我叫布迪。"
                        ),
                        // 5. Soal 5: Percakapan / Respon Dialog (你好，我叫王飞。)
                        Exercise(
                            id = "u1_l2_q5",
                            type = ExerciseType.SENTENCE_CHOICE,
                            title = "Pilih kalimat yang tepat untuk menyelesaikan percakapan",
                            dialogueSpeakerText = "你好，我叫王飞。",
                            dialogueSpeakerPinyin = "Nǐhǎo, wǒ jiào WángFēi",
                            dialogueSpeakerTranslation = "Halo, nama saya Wang Fei.",
                            options = listOf(
                                "Nǐhǎo wǒ jiào Bùdí\n你好， 我 叫 布迪。",
                                "Nǐhǎo Bùdí\n你好， 布迪。",
                                "Wǒ jiào WángFēi\n我 叫 王飞。"
                            ),
                            correctAnswer = "Nǐhǎo wǒ jiào Bùdí\n你好， 我 叫 布迪。",
                            audioToSpeak = "你好，我叫王飞。"
                        ),
                        // 6. Soal 6: Tata Bahasa Susunan Kata (我叫布迪。)
                        Exercise(
                            id = "u1_l2_q6",
                            type = ExerciseType.SENTENCE_CHOICE,
                            title = "Pilih kalimat yang benar secara tata bahasa",
                            options = listOf(
                                "Wǒ jiào Bùdí\n我 叫 布迪。",
                                "Wǒ Bùdí jiào\n我 布迪 叫。"
                            ),
                            correctAnswer = "Wǒ jiào Bùdí\n我 叫 布迪。"
                        ),
                        // 7. Soal 7: Pasangan Kartu dengan Audio Slot (你好, 叫, Audio [我])
                        Exercise(
                            id = "u1_l2_q7",
                            type = ExerciseType.MATCH_PAIRS,
                            title = "Ketuk pasangan yang sesuai",
                            correctAnswer = "ALL_MATCHED",
                            matchPairs = listOf(
                                MatchPairItem("l2_m1", "你好", "nǐhǎo", "halo"),
                                MatchPairItem("l2_m2", "叫", "jiào", "dipanggil"),
                                MatchPairItem("l2_m3", "", "", "saya", isAudioOnly = true, audioToSpeak = "我")
                            )
                        ),
                        // 8. Soal 8: Terjemahkan Kalimat Ini (Halo, nama saya Wang Fei.)
                        Exercise(
                            id = "u1_l2_q8",
                            type = ExerciseType.SENTENCE_BUILDER,
                            title = "Terjemahkan kalimat ini",
                            targetTranslation = "Halo, nama saya Wang Fei.",
                            targetHanzi = "你好， 我 叫 王飞。",
                            targetPinyin = "Nǐhǎo, wǒ jiào WángFēi.",
                            wordChips = listOf("叫:jiào", "王飞:WángFēi", "布迪:Bùdí", "你好:nǐhǎo", "我:wǒ"),
                            correctAnswer = "你好,我,叫,王飞",
                            audioToSpeak = "你好，我叫王飞。"
                        )
                    ),
                    exercisesPart2 = listOf(
                        // 1. Soal 1: Susun Audio Imersif (我是老师。)
                        Exercise(
                            id = "u1_l2_p2_q1",
                            type = ExerciseType.SENTENCE_BUILDER,
                            title = "Apa yang Anda dengar?",
                            targetHanzi = "我 是 老师。",
                            targetPinyin = "Wǒ shì lǎoshī.",
                            targetTranslation = "Saya adalah seorang guru.",
                            staticTrailingText = "。",
                            wordChips = listOf("我:wǒ", "是:shì", "老师:lǎoshī", "学生:xuéshēng", "你好:nǐhǎo"),
                            correctAnswer = "我,是,老师",
                            audioToSpeak = "我是老师。",
                            isImmersiveSpeaker = true
                        ),
                        // 2. Soal 2: Lengkapi Terjemahan 3 Slot (Budi adalah seorang murid.)
                        Exercise(
                            id = "u1_l2_p2_q2",
                            type = ExerciseType.SENTENCE_BUILDER,
                            title = "Lengkapi terjemahan",
                            targetTranslation = "Budi adalah seorang murid.",
                            targetHanzi = "布迪 是 学生。",
                            targetPinyin = "Bùdí shì xuéshēng.",
                            staticTrailingText = "。",
                            wordChips = listOf("人:rén", "学生:xuéshēng", "你好:nǐhǎo", "是:shì", "布迪:Bùdí", "老师:lǎoshī", "我:wǒ"),
                            correctAnswer = "布迪,是,学生",
                            audioToSpeak = "布迪是学生。"
                        ),
                        // 3. Soal 3: Pasangan Kartu dengan Audio Penuh (Ketuk pasangan yang sesuai)
                        Exercise(
                            id = "u1_l2_p2_q3",
                            type = ExerciseType.MATCH_PAIRS,
                            title = "Ketuk pasangan yang sesuai",
                            correctAnswer = "ALL_MATCHED",
                            matchPairs = listOf(
                                MatchPairItem("l2_p2_m1", "是", "shì", "adalah", isAudioOnly = true, audioToSpeak = "是"),
                                MatchPairItem("l2_p2_m2", "老师", "lǎoshī", "guru", isAudioOnly = true, audioToSpeak = "老师"),
                                MatchPairItem("l2_p2_m3", "学生", "xuéshēng", "murid", isAudioOnly = true, audioToSpeak = "学生"),
                                MatchPairItem("l2_p2_m4", "印度尼西亚", "Yìndùníxīyà", "(negara) Indonesia", isAudioOnly = true, audioToSpeak = "印度尼西亚"),
                                MatchPairItem("l2_p2_m5", "人", "rén", "orang", isAudioOnly = true, audioToSpeak = "人")
                            )
                        ),
                        // 4. Soal 4: Lengkapi Terjemahan (Halo (Bapak atau Ibu) Guru, saya adalah orang Indonesia.)
                        Exercise(
                            id = "u1_l2_p2_q4",
                            type = ExerciseType.SENTENCE_BUILDER,
                            title = "Lengkapi terjemahan",
                            targetTranslation = "Halo (Bapak atau Ibu) Guru, saya adalah orang Indonesia.",
                            targetHanzi = "老师， 你好， 我 是 印尼 人。",
                            targetPinyin = "Lǎoshī, nǐhǎo, wǒ shì Yìnní rén.",
                            wordChips = listOf("人:rén", "是:shì", "印尼:Yìnní", "老师:lǎoshī", "学生:xuéshēng", "王飞:WángFēi", "叫:jiào"),
                            correctAnswer = "老师,是,印尼,人",
                            audioToSpeak = "老师，你好，我是印尼人。"
                        ),
                        // 5. Soal 5: Tata Bahasa Susunan Kata (你好，我是老师。)
                        Exercise(
                            id = "u1_l2_p2_q5",
                            type = ExerciseType.SENTENCE_CHOICE,
                            title = "Pilih kalimat yang benar secara tata bahasa",
                            options = listOf(
                                "Nǐhǎo lǎoshī shì wǒ\n你好， 老师 是 我。",
                                "Nǐhǎo wǒ shì lǎoshī\n你好， 我 是 老师。"
                            ),
                            correctAnswer = "Nǐhǎo wǒ shì lǎoshī\n你好， 我 是 老师。"
                        ),
                        // 6. Soal 6: Dengarkan Kalimat Audio (我是学生。)
                        Exercise(
                            id = "u1_l2_p2_q6",
                            type = ExerciseType.SENTENCE_CHOICE,
                            title = "Dengarkan kalimat dan pilih terjemahan yang benar",
                            options = listOf(
                                "Saya adalah seorang guru.",
                                "Saya adalah seorang murid."
                            ),
                            correctAnswer = "Saya adalah seorang murid.",
                            audioToSpeak = "我是学生。"
                        ),
                        // 7. Soal 7: Terjemahkan Kalimat Ini (Saya adalah orang Indonesia.)
                        Exercise(
                            id = "u1_l2_p2_q7",
                            type = ExerciseType.SENTENCE_BUILDER,
                            title = "Terjemahkan kalimat ini",
                            targetTranslation = "Saya adalah orang Indonesia.",
                            targetHanzi = "我 是 印度尼西亚 人。",
                            targetPinyin = "Wǒ shì Yìndùníxīyà rén.",
                            wordChips = listOf("我:wǒ", "是:shì", "印度尼西亚:Yìndùníxīyà", "人:rén", "老师:lǎoshī", "学生:xuéshēng", "你好:nǐhǎo"),
                            correctAnswer = "我,是,印度尼西亚,人",
                            audioToSpeak = "我是印度尼西亚人。"
                        )
                    ),
                    exercisesPart3 = listOf(
                        // 1. Soal 1: Apa yang Anda dengar? (布迪是老师。)
                        Exercise(
                            id = "u1_l2_p3_q1",
                            type = ExerciseType.SENTENCE_BUILDER,
                            title = "Apa yang Anda dengar?",
                            targetHanzi = "布迪 是 老师。",
                            targetPinyin = "Bùdí shì lǎoshī.",
                            targetTranslation = "Budi adalah seorang guru.",
                            illustrationRes = 0,
                            staticTrailingText = "。",
                            wordChips = listOf("布迪:Bùdí", "是:shì", "老师:lǎoshī", "我:wǒ", "学生:xuéshēng"),
                            correctAnswer = "布迪,是,老师",
                            audioToSpeak = "布迪是老师。"
                        ),
                        // 2. Soal 2: Lengkapi kalimat (我叫王飞。)
                        Exercise(
                            id = "u1_l2_p3_q2",
                            type = ExerciseType.SENTENCE_BUILDER,
                            title = "Lengkapi kalimat",
                            targetHanzi = "我 叫 王飞。",
                            targetPinyin = "Wǒ jiào WángFēi.",
                            targetTranslation = "Nama saya Wang Fei.",
                            illustrationRes = R.drawable.img_wang_fei_girl,
                            staticTrailingText = "。",
                            wordChips = listOf("叫:jiào", "王飞:WángFēi", "我:wǒ"),
                            correctAnswer = "我,叫,王飞",
                            audioToSpeak = "我叫王飞。"
                        ),
                        // 3. Soal 3: Apa yang Anda dengar? (我是学生。)
                        Exercise(
                            id = "u1_l2_p3_q3",
                            type = ExerciseType.SENTENCE_BUILDER,
                            title = "Apa yang Anda dengar?",
                            targetHanzi = "我 是 学生。",
                            targetPinyin = "Wǒ shì xuéshēng.",
                            targetTranslation = "Saya adalah seorang murid.",
                            illustrationRes = 0,
                            staticTrailingText = "。",
                            wordChips = listOf("我:wǒ", "是:shì", "学生:xuéshēng", "老师:lǎoshī", "你好:nǐhǎo"),
                            correctAnswer = "我,是,学生",
                            audioToSpeak = "我是学生。"
                        ),
                        // 4. Soal 4: Lengkapi kalimat (你好，我叫布迪。)
                        Exercise(
                            id = "u1_l2_p3_q4",
                            type = ExerciseType.SENTENCE_BUILDER,
                            title = "Lengkapi kalimat",
                            targetHanzi = "你好， 我 叫 布迪。",
                            targetPinyin = "Nǐhǎo, wǒ jiào Bùdí.",
                            targetTranslation = "Halo, nama saya Budi.",
                            illustrationRes = R.drawable.img_budi_waving,
                            hasCommaAfterSlot1 = true,
                            staticTrailingText = "布迪 。",
                            staticTrailingPinyin = "Bùdí",
                            wordChips = listOf("我:wǒ", "叫:jiào", "你好:nǐhǎo"),
                            correctAnswer = "你好,我,叫",
                            audioToSpeak = "你好，我叫布迪。"
                        ),
                        // 5. Soal 5: Buat kalimat berdasarkan gambar (我是印度尼西亚人。)
                        Exercise(
                            id = "u1_l2_p3_q5",
                            type = ExerciseType.SENTENCE_BUILDER,
                            title = "Buat kalimat menggunakan semua kata berdasarkan gambar",
                            targetHanzi = "我 是 印度尼西亚 人。",
                            targetPinyin = "Wǒ shì Yìndùníxīyà rén.",
                            targetTranslation = "Saya adalah orang Indonesia.",
                            illustrationRes = R.drawable.img_indonesia_man,
                            wordChips = listOf("人:rén", "是:shì", "我:wǒ", "印度尼西亚:Yìndùníxīyà"),
                            correctAnswer = "我,是,印度尼西亚,人",
                            audioToSpeak = "我是印度尼西亚人。"
                        ),
                        // 6. Soal 6: Buat kalimat berdasarkan gambar (我是老师。)
                        Exercise(
                            id = "u1_l2_p3_q6",
                            type = ExerciseType.SENTENCE_BUILDER,
                            title = "Buat kalimat menggunakan semua kata berdasarkan gambar",
                            targetHanzi = "我 是 老师。",
                            targetPinyin = "Wǒ shì lǎoshī.",
                            targetTranslation = "Saya adalah seorang guru.",
                            illustrationRes = R.drawable.img_teacher_glasses,
                            wordChips = listOf("是:shì", "我:wǒ", "老师:lǎoshī"),
                            correctAnswer = "我,是,老师",
                            audioToSpeak = "我是老师。"
                        )
                    )
                ),
                Lesson(
                    id = "u1_l3",
                    title = "Apakah kamu orang Tiongkok?",
                    subtitle = "Kewarganegaraan & Partikel Tanya 吗",
                    grammarNote = "Partikel tanya '吗' (ma) diletakkan di akhir kalimat deklaratif untuk mengubahnya menjadi kalimat tanya ya/tidak.",
                    newWords = listOf(
                        Word("w4_1", "你", "nǐ", "Kamu / Anda", "Kata ganti orang kedua", "你是老师吗？", "Nǐ shì lǎoshī ma?", "Apakah kamu seorang guru?"),
                        Word("w4_2", "中国", "Zhōngguó", "(negara) Tiongkok", "Nama negara", "我是中国人。", "Wǒ shì Zhōngguó rén.", "Saya orang Tiongkok."),
                        Word("w4_3", "他", "tā", "(pria) dia", "Kata ganti orang ketiga pria", "他是学生吗？", "Tā shì xuéshēng ma?", "Apakah dia seorang murid?"),
                        Word("w4_4", "吗", "ma", "Apakah (partikel tanya)", "Partikel tanya kalimat", "你是印尼人吗？", "Nǐ shì Yìnní rén ma?", "Apakah kamu orang Indonesia?"),
                        Word("w4_5", "她", "tā", "(perempuan) dia", "Kata ganti orang ketiga perempuan", "她不是老师。", "Tā bú shì lǎoshī.", "Dia bukan seorang guru."),
                        Word("w4_6", "不", "bù", "Tidak / bukan", "Kata ingkar kalimat", "我不是医生。", "Wǒ bú shì yīshēng.", "Saya bukan seorang dokter."),
                        Word("w4_7", "医生", "yīshēng", "Dokter", "Kata benda profesi", "她是医生。", "Tā shì yīshēng.", "Dia seorang dokter."),
                        Word("w4_8", "再见", "zàijiàn", "Sampai jumpa", "Ucapan perpisahan", "再见！", "Zàijiàn!", "Sampai jumpa!")
                    ),
                    exercises = listOf(
                        // 1. Soal 1: Pilihan Gambar 2x2 (你 -> kamu)
                        Exercise(
                            id = "u1_l3_p1_q1",
                            type = ExerciseType.PICTURE_CHOICE,
                            title = "Pilih gambar yang benar",
                            targetHanzi = "你",
                            targetPinyin = "nǐ",
                            targetTranslation = "kamu",
                            correctAnswer = "kamu",
                            audioToSpeak = "你",
                            pictureOptions = listOf(
                                PictureOption("opt_saya", "saya", "我", R.drawable.ill_cartoon_saya, false),
                                PictureOption("opt_kamu", "kamu", "你", R.drawable.ill_cartoon_kamu, true),
                                PictureOption("opt_murid", "murid", "学生", R.drawable.ill_cartoon_murid, false),
                                PictureOption("opt_dia", "(pria) dia", "他", R.drawable.ill_cartoon_dia_pria, false)
                            )
                        ),
                        // 2. Soal 2: Pilihan Gambar 1x2 (中国 -> (negara)\nTiongkok)
                        Exercise(
                            id = "u1_l3_p1_q2",
                            type = ExerciseType.PICTURE_CHOICE,
                            title = "Pilih gambar yang benar",
                            targetHanzi = "中国",
                            targetPinyin = "Zhōngguó",
                            targetTranslation = "(negara)\nTiongkok",
                            correctAnswer = "(negara)\nTiongkok",
                            audioToSpeak = "中国",
                            pictureOptions = listOf(
                                PictureOption("opt_murid", "murid", "学生", R.drawable.ill_cartoon_murid, false),
                                PictureOption("opt_china", "(negara)\nTiongkok", "中国", R.drawable.ill_cartoon_tiongkok, true)
                            )
                        ),
                        // 3. Soal 3: Lengkapi Terjemahan Bahasa Indonesia (你是中国 人吗？ -> [Apakah] kamu orang Tiongkok?)
                        Exercise(
                            id = "u1_l3_p1_q3",
                            type = ExerciseType.FILL_BLANK,
                            title = "Lengkapi terjemahan",
                            targetHanzi = "你 是 中国 人 吗？",
                            targetPinyin = "Nǐ shì Zhōngguó rén ma",
                            sentenceWithBlank = "________ kamu orang Tiongkok?",
                            options = listOf("Jika", "Jadi", "Apakah"),
                            correctAnswer = "Apakah",
                            audioToSpeak = "你是中国人吗？"
                        ),
                        // 4. Soal 4: Pilih Terjemahan (你是老师吗？ -> Apakah kamu seorang guru?)
                        Exercise(
                            id = "u1_l3_p1_q4",
                            type = ExerciseType.SENTENCE_CHOICE,
                            title = "Pilih terjemahan yang benar",
                            targetHanzi = "你 是 老师 吗？",
                            targetPinyin = "Nǐ shì lǎoshī ma",
                            options = listOf(
                                "Apakah kamu seorang guru?",
                                "Apakah kamu seorang murid?",
                                "Apakah dia(L) seorang guru?"
                            ),
                            correctAnswer = "Apakah kamu seorang guru?",
                            audioToSpeak = "你是老师吗？"
                        ),
                        // 5. Soal 5: Pilih Terjemahan Mandarin (Apakah Budi orang Tiongkok? -> 布迪是 中国 人吗？)
                        Exercise(
                            id = "u1_l3_p1_q5",
                            type = ExerciseType.SENTENCE_CHOICE,
                            title = "Pilih terjemahan yang benar",
                            targetTranslation = "Apakah Budi orang Tiongkok?",
                            options = listOf(
                                "Bùdí shì Yìnní rén ma\n布迪 是 印尼 人 吗？",
                                "Bùdí shì Zhōngguó rén ma\n布迪 是 中国 人 吗？",
                                "Tā shì Zhōngguó rén ma\n他 是 中国 人 吗？",
                                "Nǐ shì Zhōngguó rén ma\n你 是 中国 人 吗？"
                            ),
                            correctAnswer = "Bùdí shì Zhōngguó rén ma\n布迪 是 中国 人 吗？",
                            audioToSpeak = "布迪是中国人吗？"
                        ),
                        // 6. Soal 6: Pilihan Gambar 2x2 (他 -> (pria) dia)
                        Exercise(
                            id = "u1_l3_p1_q6",
                            type = ExerciseType.PICTURE_CHOICE,
                            title = "Pilih gambar yang benar",
                            targetHanzi = "他",
                            targetPinyin = "tā",
                            targetTranslation = "(pria) dia",
                            correctAnswer = "(pria) dia",
                            audioToSpeak = "他",
                            pictureOptions = listOf(
                                PictureOption("opt_saya", "saya", "我", R.drawable.ill_cartoon_saya, false),
                                PictureOption("opt_murid", "murid", "学生", R.drawable.ill_cartoon_murid, false),
                                PictureOption("opt_dia", "(pria) dia", "他", R.drawable.ill_cartoon_dia_pria, true),
                                PictureOption("opt_kamu", "kamu", "你", R.drawable.ill_cartoon_kamu, false)
                            )
                        ),
                        // 7. Soal 7: Pilih Terjemahan (他是 学生 吗？ -> Apakah dia(L) seorang murid?)
                        Exercise(
                            id = "u1_l3_p1_q7",
                            type = ExerciseType.SENTENCE_CHOICE,
                            title = "Pilih terjemahan yang benar",
                            targetHanzi = "他 是 学生 吗？",
                            targetPinyin = "Tā shì xuéshēng ma",
                            options = listOf(
                                "Apakah dia(L) seorang guru?",
                                "Apakah dia(L) seorang murid?",
                                "Apakah kamu seorang murid?"
                            ),
                            correctAnswer = "Apakah dia(L) seorang murid?",
                            audioToSpeak = "他是学生吗？"
                        ),
                        // 8. Soal 8: Susun Kalimat Audio Imersif (你是中国人吗？)
                        Exercise(
                            id = "u1_l3_p1_q8",
                            type = ExerciseType.SENTENCE_BUILDER,
                            title = "Apa yang Anda dengar?",
                            targetHanzi = "你 是 中国 人 吗？",
                            targetPinyin = "Nǐ shì Zhōngguó rén ma?",
                            targetTranslation = "Apakah kamu orang Tiongkok?",
                            audioToSpeak = "你是中国人吗？",
                            wordChips = listOf("你:nǐ", "印尼:Yìnní", "他:tā", "中国:Zhōngguó", "吗:ma", "我:wǒ", "叫:jiào"),
                            correctAnswer = "你,中国,吗",
                            isImmersiveSpeaker = true
                        ),
                        // 9. Soal 9: Pasangan Kartu (中国, 他, 你)
                        Exercise(
                            id = "u1_l3_p1_q9",
                            type = ExerciseType.MATCH_PAIRS,
                            title = "Ketuk pasangan yang sesuai",
                            correctAnswer = "ALL_MATCHED",
                            matchPairs = listOf(
                                MatchPairItem("l3_p1_m1", "中国", "Zhōngguó", "(negara) Tiongkok"),
                                MatchPairItem("l3_p1_m2", "他", "tā", "(pria) dia"),
                                MatchPairItem("l3_p1_m3", "你", "nǐ", "kamu")
                            )
                        ),
                        // 10. Soal 10: Lengkapi Terjemahan (Apakah kamu seorang murid? -> [你] 是 学生 [吗] ？)
                        Exercise(
                            id = "u1_l3_p1_q10",
                            type = ExerciseType.SENTENCE_BUILDER,
                            title = "Lengkapi terjemahan",
                            targetTranslation = "Apakah kamu seorang murid?",
                            targetHanzi = "你 是 学生 吗？",
                            targetPinyin = "Nǐ shì xuéshēng ma?",
                            audioToSpeak = "你是学生吗？",
                            wordChips = listOf("叫:jiào", "人:rén", "你:nǐ", "他:tā", "吗:ma", "我:wǒ"),
                            correctAnswer = "你,吗"
                        )
                    ),
                    exercisesPart1 = listOf(
                        // 1. Soal 1: Pilihan Gambar 2x2 (你 -> kamu)
                        Exercise(
                            id = "u1_l3_p1_q1",
                            type = ExerciseType.PICTURE_CHOICE,
                            title = "Pilih gambar yang benar",
                            targetHanzi = "你",
                            targetPinyin = "nǐ",
                            targetTranslation = "kamu",
                            correctAnswer = "kamu",
                            audioToSpeak = "你",
                            pictureOptions = listOf(
                                PictureOption("opt_saya", "saya", "我", R.drawable.ill_cartoon_saya, false),
                                PictureOption("opt_kamu", "kamu", "你", R.drawable.ill_cartoon_kamu, true),
                                PictureOption("opt_murid", "murid", "学生", R.drawable.ill_cartoon_murid, false),
                                PictureOption("opt_dia", "(pria) dia", "他", R.drawable.ill_cartoon_dia_pria, false)
                            )
                        ),
                        // 2. Soal 2: Pilihan Gambar 1x2 (中国 -> (negara)\nTiongkok)
                        Exercise(
                            id = "u1_l3_p1_q2",
                            type = ExerciseType.PICTURE_CHOICE,
                            title = "Pilih gambar yang benar",
                            targetHanzi = "中国",
                            targetPinyin = "Zhōngguó",
                            targetTranslation = "(negara)\nTiongkok",
                            correctAnswer = "(negara)\nTiongkok",
                            audioToSpeak = "中国",
                            pictureOptions = listOf(
                                PictureOption("opt_murid", "murid", "学生", R.drawable.ill_cartoon_murid, false),
                                PictureOption("opt_china", "(negara)\nTiongkok", "中国", R.drawable.ill_cartoon_tiongkok, true)
                            )
                        ),
                        // 3. Soal 3: Lengkapi Terjemahan Bahasa Indonesia (你是中国 人吗？ -> [Apakah] kamu orang Tiongkok?)
                        Exercise(
                            id = "u1_l3_p1_q3",
                            type = ExerciseType.FILL_BLANK,
                            title = "Lengkapi terjemahan",
                            targetHanzi = "你 是 中国 人 吗？",
                            targetPinyin = "Nǐ shì Zhōngguó rén ma",
                            sentenceWithBlank = "________ kamu orang Tiongkok?",
                            options = listOf("Jika", "Jadi", "Apakah"),
                            correctAnswer = "Apakah",
                            audioToSpeak = "你是中国人吗？"
                        ),
                        // 4. Soal 4: Pilih Terjemahan (你是老师吗？ -> Apakah kamu seorang guru?)
                        Exercise(
                            id = "u1_l3_p1_q4",
                            type = ExerciseType.SENTENCE_CHOICE,
                            title = "Pilih terjemahan yang benar",
                            targetHanzi = "你 是 老师 吗？",
                            targetPinyin = "Nǐ shì lǎoshī ma",
                            options = listOf(
                                "Apakah dia(L) seorang murid?",
                                "Apakah kamu seorang guru?",
                                "Apakah kamu seorang murid?",
                                "Apakah Budi seorang guru?"
                            ),
                            correctAnswer = "Apakah kamu seorang guru?",
                            audioToSpeak = "你是老师吗？"
                        ),
                        // 5. Soal 5: Pilih Terjemahan Mandarin (Apakah Budi orang Tiongkok? -> 布迪是 中国 人吗？)
                        Exercise(
                            id = "u1_l3_p1_q5",
                            type = ExerciseType.SENTENCE_CHOICE,
                            title = "Pilih terjemahan yang benar",
                            targetTranslation = "Apakah Budi orang Tiongkok?",
                            options = listOf(
                                "Bùdí shì Yìnní rén ma\n布迪 是 印尼 人 吗？",
                                "Bùdí shì Zhōngguó rén ma\n布迪 是 中国 人 吗？",
                                "Wǒ shì Zhōngguó rén ma\n我 是 中国 人 吗？",
                                "Bùdí shì lǎoshī ma\n布迪 是 老师 吗？"
                            ),
                            correctAnswer = "Bùdí shì Zhōngguó rén ma\n布迪 是 中国 人 吗？",
                            audioToSpeak = "布迪中国人吗？"
                        ),
                        // 6. Soal 6: Pilihan Gambar 2x2 (他 -> (pria) dia)
                        Exercise(
                            id = "u1_l3_p1_q6",
                            type = ExerciseType.PICTURE_CHOICE,
                            title = "Pilih gambar yang benar",
                            targetHanzi = "他",
                            targetPinyin = "tā",
                            targetTranslation = "(pria) dia",
                            correctAnswer = "(pria) dia",
                            audioToSpeak = "他",
                            pictureOptions = listOf(
                                PictureOption("opt_dia_pria", "(pria) dia", "他", R.drawable.ill_cartoon_dia_pria, true),
                                PictureOption("opt_guru", "guru", "老师", R.drawable.ill_cartoon_guru, false),
                                PictureOption("opt_murid", "murid", "学生", R.drawable.ill_cartoon_murid, false),
                                PictureOption("opt_kamu", "kamu", "你", R.drawable.ill_cartoon_kamu, false)
                            )
                        ),
                        // 7. Soal 7: Pilih Terjemahan (他是 学生 吗？ -> Apakah dia(L) seorang murid?)
                        Exercise(
                            id = "u1_l3_p1_q7",
                            type = ExerciseType.SENTENCE_CHOICE,
                            title = "Pilih terjemahan yang benar",
                            targetHanzi = "他 是 学生 吗？",
                            targetPinyin = "Tā shì xuéshēng ma",
                            options = listOf(
                                "Apakah dia(L) seorang guru?",
                                "Apakah kamu seorang murid?",
                                "Apakah dia(L) seorang murid?",
                                "Apakah dia(L) orang Tiongkok?"
                            ),
                            correctAnswer = "Apakah dia(L) seorang murid?",
                            audioToSpeak = "他是学生吗？"
                        ),
                        // 8. Soal 8: Susun Kalimat Audio Imersif (你是中国人吗？)
                        Exercise(
                            id = "u1_l3_p1_q8",
                            type = ExerciseType.SENTENCE_BUILDER,
                            title = "Apa yang Anda dengar?",
                            targetHanzi = "你 是 中国 人 吗？",
                            targetPinyin = "Nǐ shì Zhōngguó rén ma?",
                            targetTranslation = "Apakah kamu orang Tiongkok?",
                            audioToSpeak = "你是中国人吗？",
                            wordChips = listOf("你:nǐ", "中国:Zhōngguó", "叫:jiào", "他:tā", "吗:ma", "我:wǒ", "印尼:Yìnní"),
                            correctAnswer = "你,中国,吗",
                            isImmersiveSpeaker = true
                        ),
                        // 9. Soal 9: Pasangan Kartu (中国, 他, 你)
                        Exercise(
                            id = "u1_l3_p1_q9",
                            type = ExerciseType.MATCH_PAIRS,
                            title = "Ketuk pasangan yang sesuai",
                            correctAnswer = "ALL_MATCHED",
                            matchPairs = listOf(
                                MatchPairItem("l3_p1_m1", "中国", "Zhōngguó", "(negara) Tiongkok"),
                                MatchPairItem("l3_p1_m2", "他", "tā", "(pria) dia"),
                                MatchPairItem("l3_p1_m3", "你", "nǐ", "kamu")
                            )
                        ),
                        // 10. Soal 10: Lengkapi Terjemahan (Apakah kamu seorang murid? -> [你] 是 学生 [吗] ？)
                        Exercise(
                            id = "u1_l3_p1_q10",
                            type = ExerciseType.SENTENCE_BUILDER,
                            title = "Lengkapi terjemahan",
                            targetTranslation = "Apakah kamu seorang murid?",
                            targetHanzi = "你 是 学生 吗？",
                            targetPinyin = "Nǐ shì xuéshēng ma?",
                            audioToSpeak = "你是学生吗？",
                            wordChips = listOf("叫:jiào", "人:rén", "你:nǐ", "他:tā", "吗:ma", "我:wǒ"),
                            correctAnswer = "你,吗"
                        )
                    ),
                    exercisesPart2 = listOf(
                        // 1. Soal 1: Lengkapi terjemahan (Wǒ bú shì xuéshēng / 我不是 学生 。 -> Saya [bukan] seorang murid.)
                        Exercise(
                            id = "u1_l3_p2_q1",
                            type = ExerciseType.FILL_BLANK,
                            title = "Lengkapi terjemahan",
                            targetHanzi = "我 不 是 学生。",
                            targetPinyin = "Wǒ bú shì xuéshēng",
                            sentenceWithBlank = "Saya ________ seorang murid.",
                            options = listOf("adalah", "bukan", "dulu"),
                            correctAnswer = "bukan",
                            audioToSpeak = "我不是学生。"
                        ),
                        // 2. Soal 2: Pilihan Gambar 2x2 (她 -> (perempuan) dia)
                        Exercise(
                            id = "u1_l3_p2_q2",
                            type = ExerciseType.PICTURE_CHOICE,
                            title = "Pilih gambar yang benar",
                            targetHanzi = "她",
                            targetPinyin = "tā",
                            targetTranslation = "(perempuan)\ndia",
                            correctAnswer = "(perempuan)\ndia",
                            audioToSpeak = "她",
                            pictureOptions = listOf(
                                PictureOption("p2_q2_opt1", "saya", "我", R.drawable.ill_cartoon_saya, false),
                                PictureOption("p2_q2_opt2", "(perempuan)\ndia", "她", R.drawable.ill_cartoon_dia_perempuan, true),
                                PictureOption("p2_q2_opt3", "orang", "人", R.drawable.ill_cartoon_orang, false),
                                PictureOption("p2_q2_opt4", "kamu", "你", R.drawable.ill_cartoon_kamu, false)
                            )
                        ),
                        // 3. Soal 3: Pilih terjemahan (她不叫 王飞 。 -> Nama dia(P) bukan Wang Fei.)
                        Exercise(
                            id = "u1_l3_p2_q3",
                            type = ExerciseType.SENTENCE_CHOICE,
                            title = "Pilih terjemahan yang benar",
                            targetHanzi = "她 不 叫 王飞。",
                            targetPinyin = "Tā bú jiào WángFēi",
                            options = listOf(
                                "Dia(P) bukan seorang guru.",
                                "Nama dia(L) bukan Budi.",
                                "Dia(P) bukan seorang murid.",
                                "Nama dia(P) bukan Wang Fei."
                            ),
                            correctAnswer = "Nama dia(P) bukan Wang Fei.",
                            audioToSpeak = "她不叫王飞。"
                        ),
                        // 4. Soal 4: Pilihan Gambar 2x2 (医生 -> dokter)
                        Exercise(
                            id = "u1_l3_p2_q4",
                            type = ExerciseType.PICTURE_CHOICE,
                            title = "Pilih gambar yang benar",
                            targetHanzi = "医生",
                            targetPinyin = "yīshēng",
                            targetTranslation = "dokter",
                            correctAnswer = "dokter",
                            audioToSpeak = "医生",
                            pictureOptions = listOf(
                                PictureOption("p2_q4_opt1", "kamu", "你", R.drawable.ill_cartoon_kamu, false),
                                PictureOption("p2_q4_opt2", "dokter", "医生", R.drawable.ill_cartoon_dokter, true),
                                PictureOption("p2_q4_opt3", "murid", "学生", R.drawable.ill_cartoon_murid, false),
                                PictureOption("p2_q4_opt4", "guru", "老师", R.drawable.ill_cartoon_guru, false)
                            )
                        ),
                        // 5. Soal 5: Apa yang Anda dengar? (我 [不] 是 [医生] 。)
                        Exercise(
                            id = "u1_l3_p2_q5",
                            type = ExerciseType.SENTENCE_BUILDER,
                            title = "Apa yang Anda dengar?",
                            targetHanzi = "我 不 是 医生。",
                            targetPinyin = "Wǒ bú shì yīshēng.",
                            targetTranslation = "Saya bukan seorang dokter.",
                            wordChips = listOf("叫:jiào", "不:bù", "学生:xuéshēng", "老师:lǎoshī", "人:rén", "医生:yīshēng"),
                            correctAnswer = "不,医生",
                            audioToSpeak = "我不是医生。",
                            isImmersiveSpeaker = true,
                            illustrationRes = 0
                        ),
                        // 6. Soal 6: Pilihan Gambar 2x2 (再见 -> sampai jumpa, selamat tinggal)
                        Exercise(
                            id = "u1_l3_p2_q6",
                            type = ExerciseType.PICTURE_CHOICE,
                            title = "Pilih gambar yang benar",
                            targetHanzi = "再见",
                            targetPinyin = "zàijiàn",
                            targetTranslation = "sampai jumpa,\nselamat tinggal",
                            correctAnswer = "sampai jumpa,\nselamat tinggal",
                            audioToSpeak = "再见",
                            pictureOptions = listOf(
                                PictureOption("p2_q6_opt1", "halo", "你好", R.drawable.ill_cartoon_halo, false),
                                PictureOption("p2_q6_opt2", "kamu", "你", R.drawable.ill_cartoon_kamu, false),
                                PictureOption("p2_q6_opt3", "(negara)\nTiongkok", "中国", R.drawable.ill_cartoon_tiongkok, false),
                                PictureOption("p2_q6_opt4", "sampai jumpa,\nselamat tinggal", "再见", R.drawable.ill_cartoon_sampai_jumpa, true)
                            )
                        ),
                        // 7. Soal 7: Pilih Terjemahan (Dia(P) bukan seorang guru. -> 她不是 老师 。)
                        Exercise(
                            id = "u1_l3_p2_q7",
                            type = ExerciseType.SENTENCE_CHOICE,
                            title = "Pilih terjemahan yang benar",
                            targetTranslation = "Dia(P) bukan seorang guru.",
                            options = listOf(
                                "Wǒ bú shì yīshēng\n我 不 是 医生。",
                                "Tā bú jiào WángFēi\n她 不 叫 王飞。",
                                "Tā bú shì lǎoshī\n她 不 是 老师。",
                                "Wǒ bú shì xuéshēng\n我 不 是 学生。"
                            ),
                            correctAnswer = "Tā bú shì lǎoshī\n她 不 是 老师。",
                            audioToSpeak = "她不是老师。"
                        ),
                        // 8. Soal 8: Pilih kata yang sesuai dengan gambar (Gambar Dokter -> yīshēng / 医生)
                        Exercise(
                            id = "u1_l3_p2_q8",
                            type = ExerciseType.SENTENCE_CHOICE,
                            title = "Pilih kata yang sesuai dengan gambar",
                            illustrationRes = R.drawable.ill_cartoon_dokter,
                            options = listOf(
                                "bù\n不",
                                "zàijiàn\n再见",
                                "yīshēng\n医生",
                                "Zhōngguó\n中国"
                            ),
                            correctAnswer = "yīshēng\n医生",
                            audioToSpeak = "医生"
                        ),
                        // 9. Soal 9: Lengkapi Terjemahan (Dia(P) bukan orang Indonesia. -> [她] [不] 是 印度尼西亚 人 。)
                        Exercise(
                            id = "u1_l3_p2_q9",
                            type = ExerciseType.SENTENCE_BUILDER,
                            title = "Lengkapi terjemahan",
                            targetTranslation = "Dia(P) bukan orang Indonesia.",
                            targetHanzi = "她 不 是 印度尼西亚 人。",
                            targetPinyin = "Tā bú shì Yìndùníxīyà rén.",
                            audioToSpeak = "她不是印度尼西亚人。",
                            wordChips = listOf("叫:jiào", "你:nǐ", "她:tā", "不:bù", "中国:Zhōngguó", "我:wǒ"),
                            correctAnswer = "她,不"
                        ),
                        // 10. Soal 10: Pasangan Kartu (她, 不, 医生, 再见)
                        Exercise(
                            id = "u1_l3_p2_q10",
                            type = ExerciseType.MATCH_PAIRS,
                            title = "Ketuk pasangan yang sesuai",
                            correctAnswer = "ALL_MATCHED",
                            matchPairs = listOf(
                                MatchPairItem("l3_p2_m1", "她", "tā", "(perempuan)\ndia"),
                                MatchPairItem("l3_p2_m2", "不", "bù", "tidak, bukan"),
                                MatchPairItem("l3_p2_m3", "医生", "yīshēng", "dokter"),
                                MatchPairItem("l3_p2_m4", "再见", "zàijiàn", "sampai jumpa,\nselamat tinggal")
                            )
                        ),
                        // 11. Soal 11: Pilih kata yang sesuai dengan gambar (Gambar Sampai Jumpa -> zàijiàn / 再见)
                        Exercise(
                            id = "u1_l3_p2_q11",
                            type = ExerciseType.SENTENCE_CHOICE,
                            title = "Pilih kata yang sesuai dengan gambar",
                            illustrationRes = R.drawable.ill_cartoon_sampai_jumpa,
                            options = listOf(
                                "rén\n人",
                                "zàijiàn\n再见",
                                "Zhōngguó\n中国",
                                "ma\n吗"
                            ),
                            correctAnswer = "zàijiàn\n再见",
                            audioToSpeak = "再见"
                        ),
                        // 12. Soal 12: Pilih Terjemahan (她不叫 王飞 。 -> Nama dia(P) bukan Wang Fei.)
                        Exercise(
                            id = "u1_l3_p2_q12",
                            type = ExerciseType.SENTENCE_CHOICE,
                            title = "Pilih terjemahan yang benar",
                            targetHanzi = "她 不 叫 王飞。",
                            targetPinyin = "Tā bú jiào WángFēi",
                            options = listOf(
                                "Dia(P) bukan seorang murid.",
                                "Dia(P) bukan seorang guru.",
                                "Nama dia(P) bukan Wang Fei.",
                                "Nama dia(L) bukan Budi."
                            ),
                            correctAnswer = "Nama dia(P) bukan Wang Fei.",
                            audioToSpeak = "她不叫王飞。"
                        )
                    )
                ),
                Lesson(
                    id = "u1_l4",
                    title = "Apakah kamu orang Tiongkok?",
                    subtitle = "Latihan penguatan materi kewarganegaraan",
                    grammarNote = "Latihan komprehensif kosakata dan pola kalimat tanya 吗.",
                    newWords = listOf(
                        Word("w5_1", "中国", "Zhōngguó", "Tiongkok", "Nama negara", "你是中国人吗？", "Nǐ shì Zhōngguó rén ma?", "Apakah kamu orang Tiongkok?"),
                        Word("w5_2", "学生", "xuéshēng", "Murid", "Profesi", "他是学生吗？", "Tā shì xuéshēng ma?", "Apakah dia seorang murid?")
                    ),
                    exercises = listOf(
                        // 1. Soal 1: Lengkapi terjemahan (Apakah kamu seorang guru? -> [你] [是] 老师 [吗] ？)
                        Exercise(
                            id = "u1_l4_p1_q1",
                            type = ExerciseType.SENTENCE_BUILDER,
                            title = "Lengkapi terjemahan",
                            targetTranslation = "Apakah kamu seorang guru?",
                            targetHanzi = "你 是 老师 吗？",
                            targetPinyin = "Nǐ shì lǎoshī ma?",
                            audioToSpeak = "你是老师吗？",
                            wordChips = listOf("你:nǐ", "他:tā", "叫:jiào", "我:wǒ", "是:shì", "吗:ma", "人:rén"),
                            correctAnswer = "你,是,吗"
                        ),
                        // 2. Soal 2: Pilih terjemahan yang benar ((negara) Tiongkok -> Zhōngguó / 中国)
                        Exercise(
                            id = "u1_l4_p1_q2",
                            type = ExerciseType.SENTENCE_CHOICE,
                            title = "Pilih terjemahan yang benar",
                            targetTranslation = "(negara) Tiongkok",
                            options = listOf(
                                "lǎoshī\n老师",
                                "xuéshēng\n学生",
                                "Yìnní\n印尼",
                                "Zhōngguó\n中国"
                            ),
                            correctAnswer = "Zhōngguó\n中国",
                            audioToSpeak = "中国"
                        ),
                        // 3. Soal 3: Apa yang Anda dengar? ([他] [是] 学生 [吗] ？)
                        Exercise(
                            id = "u1_l4_p1_q3",
                            type = ExerciseType.SENTENCE_BUILDER,
                            title = "Apa yang Anda dengar?",
                            targetHanzi = "他 是 学生 吗？",
                            targetPinyin = "Tā shì xuéshēng ma?",
                            targetTranslation = "Apakah dia seorang murid?",
                            wordChips = listOf("人:rén", "叫:jiào", "你:nǐ", "他:tā", "是:shì", "吗:ma"),
                            correctAnswer = "他,是,吗",
                            audioToSpeak = "他是学生吗？",
                            isImmersiveSpeaker = true,
                            illustrationRes = 0
                        ),
                        // 4. Soal 4: Selesaikan percakapan ([?] -> 他是印尼人。)
                        Exercise(
                            id = "u1_l4_p1_q4",
                            type = ExerciseType.SENTENCE_CHOICE,
                            title = "Selesaikan percakapan",
                            dialogueBlankIsFirst = true,
                            dialogueSpeakerText = "他是印尼人。",
                            dialogueSpeakerPinyin = "Tā shì Yìnní rén",
                            audioToSpeak = "他是印尼人。",
                            options = listOf(
                                "Bùdí shì Yìnní rén ma\n布迪 是 印尼 人 吗？",
                                "Nǐ jiào Bùdí ma\n你 叫 布迪 吗？",
                                "Bùdí shì lǎoshī ma\n布迪 是 老师 吗？"
                            ),
                            correctAnswer = "Bùdí shì Yìnní rén ma\n布迪 是 印尼 人 吗？"
                        ),
                        // 5. Soal 5: Pilih kalimat yang benar secara tata bahasa
                        Exercise(
                            id = "u1_l4_p1_q5",
                            type = ExerciseType.SENTENCE_CHOICE,
                            title = "Pilih kalimat yang benar secara tata bahasa",
                            options = listOf(
                                "Shì nǐ Zhōngguó rén ma\n是 你 中国 人 吗？",
                                "Nǐ shì Zhōngguó rén ma\n你 是 中国 人 吗？"
                            ),
                            correctAnswer = "Nǐ shì Zhōngguó rén ma\n你 是 中国 人 吗？",
                            audioToSpeak = "你是中国人吗？"
                        ),
                        // 6. Soal 6: Ketuk pasangan yang sesuai (中国, 你, audio-only 他)
                        Exercise(
                            id = "u1_l4_p1_q6",
                            type = ExerciseType.MATCH_PAIRS,
                            title = "Ketuk pasangan yang sesuai",
                            correctAnswer = "ALL_MATCHED",
                            matchPairs = listOf(
                                MatchPairItem("l4_p1_m1", "中国", "Zhōngguó", "(negara) Tiongkok"),
                                MatchPairItem("l4_p1_m2", "你", "nǐ", "kamu"),
                                MatchPairItem("l4_p1_m3", "他", "tā", "(pria) dia", isAudioOnly = true, audioToSpeak = "他")
                            )
                        ),
                        // 7. Soal 7: Selesaikan percakapan (A: 你是中国人吗？ -> B: 我是中国人。)
                        Exercise(
                            id = "u1_l4_p1_q7",
                            type = ExerciseType.SENTENCE_CHOICE,
                            title = "Selesaikan percakapan",
                            dialogueBlankIsFirst = false,
                            dialogueThumbnailRes = R.drawable.img_girl_in_car,
                            dialogueSpeakerText = "你是中国人吗？",
                            dialogueSpeakerPinyin = "Nǐ shì Zhōngguó rén ma",
                            audioToSpeak = "你是中国人吗？",
                            options = listOf(
                                "Wǒ shì Zhōngguó rén\n我 是 中国 人。",
                                "Wǒ shì lǎoshī\n我 是 老师。",
                                "Tā jiào Wáng Fēi\n他 叫 王 飞。"
                            ),
                            correctAnswer = "Wǒ shì Zhōngguó rén\n我 是 中国 人。"
                        ),
                        // 8. Soal 8: Terjemahkan kalimat ini (Apakah kamu seorang murid? -> 你是学生吗？)
                        Exercise(
                            id = "u1_l4_p1_q8",
                            type = ExerciseType.SENTENCE_BUILDER,
                            title = "Terjemahkan kalimat ini",
                            targetTranslation = "Apakah kamu seorang murid?",
                            targetHanzi = "你 是 学生 吗？",
                            targetPinyin = "Nǐ shì xuéshēng ma?",
                            audioToSpeak = "你是学生吗？",
                            wordChips = listOf("是:shì", "我:wǒ", "吗:ma", "学生:xuéshēng", "你:nǐ", "人:rén", "叫:jiào"),
                            correctAnswer = "你,是,学生,吗"
                        )
                    ),
                    exercisesPart1 = listOf(
                        // 1. Soal 1: Lengkapi terjemahan (Apakah kamu seorang guru? -> [你] [是] 老师 [吗] ？)
                        Exercise(
                            id = "u1_l4_p1_q1",
                            type = ExerciseType.SENTENCE_BUILDER,
                            title = "Lengkapi terjemahan",
                            targetTranslation = "Apakah kamu seorang guru?",
                            targetHanzi = "你 是 老师 吗？",
                            targetPinyin = "Nǐ shì lǎoshī ma?",
                            audioToSpeak = "你是老师吗？",
                            wordChips = listOf("你:nǐ", "他:tā", "叫:jiào", "我:wǒ", "是:shì", "吗:ma", "人:rén"),
                            correctAnswer = "你,是,吗"
                        ),
                        // 2. Soal 2: Pilih terjemahan yang benar ((negara) Tiongkok -> Zhōngguó / 中国)
                        Exercise(
                            id = "u1_l4_p1_q2",
                            type = ExerciseType.SENTENCE_CHOICE,
                            title = "Pilih terjemahan yang benar",
                            targetTranslation = "(negara) Tiongkok",
                            options = listOf(
                                "lǎoshī\n老师",
                                "xuéshēng\n学生",
                                "Yìnní\n印尼",
                                "Zhōngguó\n中国"
                            ),
                            correctAnswer = "Zhōngguó\n中国",
                            audioToSpeak = "中国"
                        ),
                        // 3. Soal 3: Apa yang Anda dengar? ([他] [是] 学生 [吗] ？)
                        Exercise(
                            id = "u1_l4_p1_q3",
                            type = ExerciseType.SENTENCE_BUILDER,
                            title = "Apa yang Anda dengar?",
                            targetHanzi = "他 是 学生 吗？",
                            targetPinyin = "Tā shì xuéshēng ma?",
                            targetTranslation = "Apakah dia seorang murid?",
                            wordChips = listOf("人:rén", "叫:jiào", "你:nǐ", "他:tā", "是:shì", "吗:ma"),
                            correctAnswer = "他,是,吗",
                            audioToSpeak = "他是学生吗？",
                            isImmersiveSpeaker = true,
                            illustrationRes = 0
                        ),
                        // 4. Soal 4: Selesaikan percakapan ([?] -> 他是印尼人。)
                        Exercise(
                            id = "u1_l4_p1_q4",
                            type = ExerciseType.SENTENCE_CHOICE,
                            title = "Selesaikan percakapan",
                            dialogueBlankIsFirst = true,
                            dialogueSpeakerText = "他是印尼人。",
                            dialogueSpeakerPinyin = "Tā shì Yìnní rén",
                            audioToSpeak = "他是印尼人。",
                            options = listOf(
                                "Bùdí shì Yìnní rén ma\n布迪 是 印尼 人 吗？",
                                "Nǐ jiào Bùdí ma\n你 叫 布迪 吗？",
                                "Bùdí shì lǎoshī ma\n布迪 是 老师 吗？"
                            ),
                            correctAnswer = "Bùdí shì Yìnní rén ma\n布迪 是 印尼 人 吗？"
                        ),
                        // 5. Soal 5: Pilih kalimat yang benar secara tata bahasa
                        Exercise(
                            id = "u1_l4_p1_q5",
                            type = ExerciseType.SENTENCE_CHOICE,
                            title = "Pilih kalimat yang benar secara tata bahasa",
                            options = listOf(
                                "Shì nǐ Zhōngguó rén ma\n是 你 中国 人 吗？",
                                "Nǐ shì Zhōngguó rén ma\n你 是 中国 人 吗？"
                            ),
                            correctAnswer = "Nǐ shì Zhōngguó rén ma\n你 是 中国 人 吗？",
                            audioToSpeak = "你是中国人吗？"
                        ),
                        // 6. Soal 6: Ketuk pasangan yang sesuai (中国, 你, audio-only 他)
                        Exercise(
                            id = "u1_l4_p1_q6",
                            type = ExerciseType.MATCH_PAIRS,
                            title = "Ketuk pasangan yang sesuai",
                            correctAnswer = "ALL_MATCHED",
                            matchPairs = listOf(
                                MatchPairItem("l4_p1_m1", "中国", "Zhōngguó", "(negara) Tiongkok"),
                                MatchPairItem("l4_p1_m2", "你", "nǐ", "kamu"),
                                MatchPairItem("l4_p1_m3", "他", "tā", "(pria) dia", isAudioOnly = true, audioToSpeak = "他")
                            )
                        ),
                        // 7. Soal 7: Selesaikan percakapan (A: 你是中国人吗？ -> B: 我是中国人。)
                        Exercise(
                            id = "u1_l4_p1_q7",
                            type = ExerciseType.SENTENCE_CHOICE,
                            title = "Selesaikan percakapan",
                            dialogueBlankIsFirst = false,
                            dialogueThumbnailRes = R.drawable.img_girl_in_car,
                            dialogueSpeakerText = "你是中国人吗？",
                            dialogueSpeakerPinyin = "Nǐ shì Zhōngguó rén ma",
                            audioToSpeak = "你是中国人吗？",
                            options = listOf(
                                "Wǒ shì Zhōngguó rén\n我 是 中国 人。",
                                "Wǒ shì lǎoshī\n我 是 老师。",
                                "Tā jiào Wáng Fēi\n他 叫 王 飞。"
                            ),
                            correctAnswer = "Wǒ shì Zhōngguó rén\n我 是 中国 人。"
                        ),
                        // 8. Soal 8: Terjemahkan kalimat ini (Apakah kamu seorang murid? -> 你是学生吗？)
                        Exercise(
                            id = "u1_l4_p1_q8",
                            type = ExerciseType.SENTENCE_BUILDER,
                            title = "Terjemahkan kalimat ini",
                            targetTranslation = "Apakah kamu seorang murid?",
                            targetHanzi = "你 是 学生 吗？",
                            targetPinyin = "Nǐ shì xuéshēng ma?",
                            audioToSpeak = "你是学生吗？",
                            wordChips = listOf("是:shì", "我:wǒ", "吗:ma", "学生:xuéshēng", "你:nǐ", "人:rén", "叫:jiào"),
                            correctAnswer = "你,是,学生,吗"
                        )
                    ),
                    exercisesPart2 = listOf(
                        // 1. Soal 1: Selesaikan percakapan (Tā jiào WángFēi ma / 她叫 王飞 吗？ -> 她不叫王飞。)
                        Exercise(
                            id = "u1_l4_p2_q1",
                            type = ExerciseType.SENTENCE_CHOICE,
                            title = "Selesaikan percakapan",
                            dialogueBlankIsFirst = false,
                            dialogueSpeakerText = "她叫 王飞 吗？",
                            dialogueSpeakerPinyin = "Tā jiào WángFēi ma",
                            audioToSpeak = "她叫王飞吗？",
                            options = listOf(
                                "Tā bú shì yīshēng\n她 不 是 医生。",
                                "Tā bú jiào WángFēi\n她 不 叫 王飞。",
                                "WángFēi bú shì Zhōngguó rén\n王飞 不 是 中国 人。"
                            ),
                            correctAnswer = "Tā bú jiào WángFēi\n她 不 叫 王飞。"
                        ),
                        // 2. Soal 2: Lengkapi terjemahan (Sampai jumpa, Wang Fei. -> 王飞，[再见] 。)
                        Exercise(
                            id = "u1_l4_p2_q2",
                            type = ExerciseType.SENTENCE_BUILDER,
                            title = "Lengkapi terjemahan",
                            targetTranslation = "Sampai jumpa, Wang Fei.",
                            targetHanzi = "王飞， 再见。",
                            targetPinyin = "WángFēi, zàijiàn.",
                            audioToSpeak = "王飞，再见。",
                            wordChips = listOf("再见:zàijiàn", "你好:nǐhǎo", "你:nǐ", "中国:Zhōngguó"),
                            correctAnswer = "再见"
                        ),
                        // 3. Soal 3: Apa yang Anda dengar? (couple background -> [她] [不] [是] [中国] [人] 。)
                        Exercise(
                            id = "u1_l4_p2_q3",
                            type = ExerciseType.SENTENCE_BUILDER,
                            title = "Apa yang Anda dengar?",
                            isImmersiveSpeaker = true,
                            illustrationRes = 0,
                            targetHanzi = "她 不 是 中国 人。",
                            targetPinyin = "Tā bú shì Zhōngguó rén.",
                            targetTranslation = "Dia bukan orang Tiongkok.",
                            wordChips = listOf("叫:jiào", "我:wǒ", "你:nǐ", "她:tā", "不:bú", "是:shì", "中国:Zhōngguó", "人:rén"),
                            correctAnswer = "她,不,是,中国,人",
                            audioToSpeak = "她不是中国人。"
                        ),
                        // 4. Soal 4: Lengkapi terjemahan (Dia(P) bukan seorang murid. -> [她] [不] [是] 学生 。)
                        Exercise(
                            id = "u1_l4_p2_q4",
                            type = ExerciseType.SENTENCE_BUILDER,
                            title = "Lengkapi terjemahan",
                            targetTranslation = "Dia(P) bukan seorang murid.",
                            targetHanzi = "她 不 是 学生。",
                            targetPinyin = "Tā bú shì xuéshēng.",
                            audioToSpeak = "她不是学生。",
                            wordChips = listOf("我:wǒ", "你:nǐ", "她:tā", "是:shì", "不:bú", "人:rén", "叫:jiào"),
                            correctAnswer = "她,不,是"
                        ),
                        // 5. Soal 5: Pilih kalimat yang benar secara tata bahasa
                        Exercise(
                            id = "u1_l4_p2_q5",
                            type = ExerciseType.SENTENCE_CHOICE,
                            title = "Pilih kalimat yang benar secara tata bahasa",
                            options = listOf(
                                "Tā bú jiào WángFēi\n她 不 叫 王飞。",
                                "Tā jiào bù WángFēi\n她 叫 不 王飞。",
                                "Tā bù WángFēi\n她 不 王飞。"
                            ),
                            correctAnswer = "Tā bú jiào WángFēi\n她 不 叫 王飞。",
                            audioToSpeak = "她不叫王飞。"
                        ),
                        // 6. Soal 6: Ketuk pasangan yang sesuai (不, 医生, 再见, audio-only 她)
                        Exercise(
                            id = "u1_l4_p2_q6",
                            type = ExerciseType.MATCH_PAIRS,
                            title = "Ketuk pasangan yang sesuai",
                            correctAnswer = "ALL_MATCHED",
                            matchPairs = listOf(
                                MatchPairItem("l4_p2_m1", "不", "bù", "tidak, bukan"),
                                MatchPairItem("l4_p2_m2", "医生", "yīshēng", "dokter"),
                                MatchPairItem("l4_p2_m3", "再见", "zàijiàn", "sampai jumpa,\nselamat tinggal"),
                                MatchPairItem("l4_p2_m4", "她", "tā", "(perempuan) dia", isAudioOnly = true, audioToSpeak = "她")
                            )
                        ),
                        // 7. Soal 7: Dengarkan kalimat dan pilih terjemahan yang benar (Video woman teacher laptop -> Saya bukan seorang guru.)
                        Exercise(
                            id = "u1_l4_p2_q7",
                            type = ExerciseType.SENTENCE_CHOICE,
                            title = "Dengarkan kalimat dan pilih terjemahan yang benar",
                            illustrationRes = R.drawable.img_girl_laptop_teacher,
                            options = listOf(
                                "Saya bukan seorang murid.",
                                "Saya bukan seorang guru."
                            ),
                            correctAnswer = "Saya bukan seorang guru.",
                            audioToSpeak = "我不是老师。"
                        ),
                        // 8. Soal 8: Terjemahkan kalimat ini (Saya bukan seorang dokter. -> 我不是医生。)
                        Exercise(
                            id = "u1_l4_p2_q8",
                            type = ExerciseType.SENTENCE_BUILDER,
                            title = "Terjemahkan kalimat ini",
                            targetTranslation = "Saya bukan seorang dokter.",
                            targetHanzi = "我 不 是 医生。",
                            targetPinyin = "Wǒ bú shì yīshēng.",
                            audioToSpeak = "我不是医生。",
                            wordChips = listOf("医生:yīshēng", "不:bú", "人:rén", "叫:jiào", "老师:lǎoshī", "是:shì", "我:wǒ"),
                            correctAnswer = "我,不,是,医生"
                        )
                    ),
                    exercisesPart3 = listOf(
                        // 1. Soal 1: Apa yang Anda dengar? (布迪是老师。)
                        Exercise(
                            id = "u1_l2_p3_q1",
                            type = ExerciseType.SENTENCE_BUILDER,
                            title = "Apa yang Anda dengar?",
                            targetHanzi = "布迪 是 老师。",
                            targetPinyin = "Bùdí shì lǎoshī.",
                            targetTranslation = "Budi adalah seorang guru.",
                            illustrationRes = 0,
                            staticTrailingText = "。",
                            wordChips = listOf("布迪:Bùdí", "是:shì", "老师:lǎoshī", "我:wǒ", "学生:xuéshēng"),
                            correctAnswer = "布迪,是,老师",
                            audioToSpeak = "布迪是老师。"
                        ),
                        // 2. Soal 2: Lengkapi kalimat (我叫王飞。)
                        Exercise(
                            id = "u1_l2_p3_q2",
                            type = ExerciseType.SENTENCE_BUILDER,
                            title = "Lengkapi kalimat",
                            targetHanzi = "我 叫 王飞。",
                            targetPinyin = "Wǒ jiào WángFēi.",
                            targetTranslation = "Nama saya Wang Fei.",
                            illustrationRes = R.drawable.img_wang_fei_girl,
                            staticTrailingText = "。",
                            wordChips = listOf("叫:jiào", "王飞:WángFēi", "我:wǒ"),
                            correctAnswer = "我,叫,王飞",
                            audioToSpeak = "我叫王飞。"
                        ),
                        // 3. Soal 3: Apa yang Anda dengar? (我是学生。)
                        Exercise(
                            id = "u1_l2_p3_q3",
                            type = ExerciseType.SENTENCE_BUILDER,
                            title = "Apa yang Anda dengar?",
                            targetHanzi = "我 是 学生。",
                            targetPinyin = "Wǒ shì xuéshēng.",
                            targetTranslation = "Saya adalah seorang murid.",
                            illustrationRes = 0,
                            staticTrailingText = "。",
                            wordChips = listOf("我:wǒ", "是:shì", "学生:xuéshēng", "老师:lǎoshī", "你好:nǐhǎo"),
                            correctAnswer = "我,是,学生",
                            audioToSpeak = "我是学生。"
                        ),
                        // 4. Soal 4: Lengkapi kalimat (你好，我叫布迪。)
                        Exercise(
                            id = "u1_l2_p3_q4",
                            type = ExerciseType.SENTENCE_BUILDER,
                            title = "Lengkapi kalimat",
                            targetHanzi = "你好， 我 叫 布迪。",
                            targetPinyin = "Nǐhǎo, wǒ jiào Bùdí.",
                            targetTranslation = "Halo, nama saya Budi.",
                            illustrationRes = R.drawable.img_budi_waving,
                            hasCommaAfterSlot1 = true,
                            staticTrailingText = "布迪 。",
                            staticTrailingPinyin = "Bùdí",
                            wordChips = listOf("我:wǒ", "叫:jiào", "你好:nǐhǎo"),
                            correctAnswer = "你好,我,叫",
                            audioToSpeak = "你好，我叫布迪。"
                        ),
                        // 5. Soal 5: Buat kalimat berdasarkan gambar (我是印度尼西亚人。)
                        Exercise(
                            id = "u1_l2_p3_q5",
                            type = ExerciseType.SENTENCE_BUILDER,
                            title = "Buat kalimat menggunakan semua kata berdasarkan gambar",
                            targetHanzi = "我 是 印度尼西亚 人。",
                            targetPinyin = "Wǒ shì Yìndùníxīyà rén.",
                            targetTranslation = "Saya adalah orang Indonesia.",
                            illustrationRes = R.drawable.img_indonesia_man,
                            wordChips = listOf("人:rén", "是:shì", "我:wǒ", "印度尼西亚:Yìndùníxīyà"),
                            correctAnswer = "我,是,印度尼西亚,人",
                            audioToSpeak = "我是印度尼西亚人。"
                        ),
                        // 6. Soal 6: Buat kalimat berdasarkan gambar (我是老师。)
                        Exercise(
                            id = "u1_l2_p3_q6",
                            type = ExerciseType.SENTENCE_BUILDER,
                            title = "Buat kalimat menggunakan semua kata berdasarkan gambar",
                            targetHanzi = "我 是 老师。",
                            targetPinyin = "Wǒ shì lǎoshī.",
                            targetTranslation = "Saya adalah seorang guru.",
                            illustrationRes = R.drawable.img_teacher_glasses,
                            wordChips = listOf("是:shì", "我:wǒ", "老师:lǎoshī"),
                            correctAnswer = "我,是,老师",
                            audioToSpeak = "我是老师。"
                        )
                    )
                ),
                Lesson(
                    id = "u1_l3",
                    title = "Apakah kamu orang Tiongkok?",
                    subtitle = "Kewarganegaraan & Partikel Tanya 吗",
                    grammarNote = "Partikel tanya '吗' (ma) diletakkan di akhir kalimat deklaratif untuk mengubahnya menjadi kalimat tanya ya/tidak.",
                    newWords = listOf(
                        Word("w4_1", "你", "nǐ", "Kamu / Anda", "Kata ganti orang kedua", "你是老师吗？", "Nǐ shì lǎoshī ma?", "Apakah kamu seorang guru?"),
                        Word("w4_2", "中国", "Zhōngguó", "(negara) Tiongkok", "Nama negara", "我是中国人。", "Wǒ shì Zhōngguó rén.", "Saya orang Tiongkok."),
                        Word("w4_3", "他", "tā", "(pria) dia", "Kata ganti orang ketiga pria", "他是学生吗？", "Tā shì xuéshēng ma?", "Apakah dia seorang murid?"),
                        Word("w4_4", "吗", "ma", "Apakah (partikel tanya)", "Partikel tanya kalimat", "你是印尼人吗？", "Nǐ shì Yìnní rén ma?", "Apakah kamu orang Indonesia?"),
                        Word("w4_5", "她", "tā", "(perempuan) dia", "Kata ganti orang ketiga perempuan", "她不是老师。", "Tā bú shì lǎoshī.", "Dia bukan seorang guru."),
                        Word("w4_6", "不", "bù", "Tidak / bukan", "Kata ingkar kalimat", "我不是医生。", "Wǒ bú shì yīshēng.", "Saya bukan seorang dokter."),
                        Word("w4_7", "医生", "yīshēng", "Dokter", "Kata benda profesi", "她是医生。", "Tā shì yīshēng.", "Dia seorang dokter."),
                        Word("w4_8", "再见", "zàijiàn", "Sampai jumpa", "Ucapan perpisahan", "再见！", "Zàijiàn!", "Sampai jumpa!")
                    ),
                    exercises = listOf(
                        // 1. Soal 1: Pilihan Gambar 2x2 (你 -> kamu)
                        Exercise(
                            id = "u1_l3_p1_q1",
                            type = ExerciseType.PICTURE_CHOICE,
                            title = "Pilih gambar yang benar",
                            targetHanzi = "你",
                            targetPinyin = "nǐ",
                            targetTranslation = "kamu",
                            correctAnswer = "kamu",
                            audioToSpeak = "你",
                            pictureOptions = listOf(
                                PictureOption("opt_saya", "saya", "我", R.drawable.ill_cartoon_saya, false),
                                PictureOption("opt_kamu", "kamu", "你", R.drawable.ill_cartoon_kamu, true),
                                PictureOption("opt_murid", "murid", "学生", R.drawable.ill_cartoon_murid, false),
                                PictureOption("opt_dia", "(pria) dia", "他", R.drawable.ill_cartoon_dia_pria, false)
                            )
                        ),
                        // 2. Soal 2: Pilihan Gambar 1x2 (中国 -> (negara)\nTiongkok)
                        Exercise(
                            id = "u1_l3_p1_q2",
                            type = ExerciseType.PICTURE_CHOICE,
                            title = "Pilih gambar yang benar",
                            targetHanzi = "中国",
                            targetPinyin = "Zhōngguó",
                            targetTranslation = "(negara)\nTiongkok",
                            correctAnswer = "(negara)\nTiongkok",
                            audioToSpeak = "中国",
                            pictureOptions = listOf(
                                PictureOption("opt_murid", "murid", "学生", R.drawable.ill_cartoon_murid, false),
                                PictureOption("opt_china", "(negara)\nTiongkok", "中国", R.drawable.ill_cartoon_tiongkok, true)
                            )
                        ),
                        // 3. Soal 3: Lengkapi Terjemahan Bahasa Indonesia (你是中国 人吗？ -> [Apakah] kamu orang Tiongkok?)
                        Exercise(
                            id = "u1_l3_p1_q3",
                            type = ExerciseType.FILL_BLANK,
                            title = "Lengkapi terjemahan",
                            targetHanzi = "你 是 中国 人 吗？",
                            targetPinyin = "Nǐ shì Zhōngguó rén ma",
                            sentenceWithBlank = "________ kamu orang Tiongkok?",
                            options = listOf("Jika", "Jadi", "Apakah"),
                            correctAnswer = "Apakah",
                            audioToSpeak = "你是中国人吗？"
                        ),
                        // 4. Soal 4: Pilih Terjemahan (你是老师吗？ -> Apakah kamu seorang guru?)
                        Exercise(
                            id = "u1_l3_p1_q4",
                            type = ExerciseType.SENTENCE_CHOICE,
                            title = "Pilih terjemahan yang benar",
                            targetHanzi = "你 是 老师 吗？",
                            targetPinyin = "Nǐ shì lǎoshī ma",
                            options = listOf(
                                "Apakah kamu seorang guru?",
                                "Apakah kamu seorang murid?",
                                "Apakah dia(L) seorang guru?"
                            ),
                            correctAnswer = "Apakah kamu seorang guru?",
                            audioToSpeak = "你是老师吗？"
                        ),
                        // 5. Soal 5: Pilih Terjemahan Mandarin (Apakah Budi orang Tiongkok? -> 布迪是 中国 人吗？)
                        Exercise(
                            id = "u1_l3_p1_q5",
                            type = ExerciseType.SENTENCE_CHOICE,
                            title = "Pilih terjemahan yang benar",
                            targetTranslation = "Apakah Budi orang Tiongkok?",
                            options = listOf(
                                "Bùdí shì Yìnní rén ma\n布迪 是 印尼 人 吗？",
                                "Bùdí shì Zhōngguó rén ma\n布迪 是 中国 人 吗？",
                                "Tā shì Zhōngguó rén ma\n他 是 中国 人 吗？",
                                "Nǐ shì Zhōngguó rén ma\n你 是 中国 人 吗？"
                            ),
                            correctAnswer = "Bùdí shì Zhōngguó rén ma\n布迪 是 中国 人 吗？",
                            audioToSpeak = "布迪是中国人吗？"
                        ),
                        // 6. Soal 6: Pilihan Gambar 2x2 (他 -> (pria) dia)
                        Exercise(
                            id = "u1_l3_p1_q6",
                            type = ExerciseType.PICTURE_CHOICE,
                            title = "Pilih gambar yang benar",
                            targetHanzi = "他",
                            targetPinyin = "tā",
                            targetTranslation = "(pria) dia",
                            correctAnswer = "(pria) dia",
                            audioToSpeak = "他",
                            pictureOptions = listOf(
                                PictureOption("opt_saya", "saya", "我", R.drawable.ill_cartoon_saya, false),
                                PictureOption("opt_murid", "murid", "学生", R.drawable.ill_cartoon_murid, false),
                                PictureOption("opt_dia", "(pria) dia", "他", R.drawable.ill_cartoon_dia_pria, true),
                                PictureOption("opt_kamu", "kamu", "你", R.drawable.ill_cartoon_kamu, false)
                            )
                        ),
                        // 7. Soal 7: Pilih Terjemahan (他是 学生 吗？ -> Apakah dia(L) seorang murid?)
                        Exercise(
                            id = "u1_l3_p1_q7",
                            type = ExerciseType.SENTENCE_CHOICE,
                            title = "Pilih terjemahan yang benar",
                            targetHanzi = "他 是 学生 吗？",
                            targetPinyin = "Tā shì xuéshēng ma",
                            options = listOf(
                                "Apakah dia(L) seorang guru?",
                                "Apakah dia(L) seorang murid?",
                                "Apakah kamu seorang murid?"
                            ),
                            correctAnswer = "Apakah dia(L) seorang murid?",
                            audioToSpeak = "他是学生吗？"
                        ),
                        // 8. Soal 8: Susun Kalimat Audio Imersif (你是中国人吗？)
                        Exercise(
                            id = "u1_l3_p1_q8",
                            type = ExerciseType.SENTENCE_BUILDER,
                            title = "Apa yang Anda dengar?",
                            targetHanzi = "你 是 中国 人 吗？",
                            targetPinyin = "Nǐ shì Zhōngguó rén ma?",
                            targetTranslation = "Apakah kamu orang Tiongkok?",
                            audioToSpeak = "你是中国人吗？",
                            wordChips = listOf("你:nǐ", "印尼:Yìnní", "他:tā", "中国:Zhōngguó", "吗:ma", "我:wǒ", "叫:jiào"),
                            correctAnswer = "你,中国,吗",
                            isImmersiveSpeaker = true
                        ),
                        // 9. Soal 9: Pasangan Kartu (中国, 他, 你)
                        Exercise(
                            id = "u1_l3_p1_q9",
                            type = ExerciseType.MATCH_PAIRS,
                            title = "Ketuk pasangan yang sesuai",
                            correctAnswer = "ALL_MATCHED",
                            matchPairs = listOf(
                                MatchPairItem("l3_p1_m1", "中国", "Zhōngguó", "(negara) Tiongkok"),
                                MatchPairItem("l3_p1_m2", "他", "tā", "(pria) dia"),
                                MatchPairItem("l3_p1_m3", "你", "nǐ", "kamu")
                            )
                        ),
                        // 10. Soal 10: Lengkapi Terjemahan (Apakah kamu seorang murid? -> [你] 是 学生 [吗] ？)
                        Exercise(
                            id = "u1_l3_p1_q10",
                            type = ExerciseType.SENTENCE_BUILDER,
                            title = "Lengkapi terjemahan",
                            targetTranslation = "Apakah kamu seorang murid?",
                            targetHanzi = "你 是 学生 吗？",
                            targetPinyin = "Nǐ shì xuéshēng ma?",
                            audioToSpeak = "你是学生吗？",
                            wordChips = listOf("叫:jiào", "人:rén", "你:nǐ", "他:tā", "吗:ma", "我:wǒ"),
                            correctAnswer = "你,吗"
                        )
                    ),
                    exercisesPart1 = listOf(
                        // 1. Soal 1: Pilihan Gambar 2x2 (你 -> kamu)
                        Exercise(
                            id = "u1_l3_p1_q1",
                            type = ExerciseType.PICTURE_CHOICE,
                            title = "Pilih gambar yang benar",
                            targetHanzi = "你",
                            targetPinyin = "nǐ",
                            targetTranslation = "kamu",
                            correctAnswer = "kamu",
                            audioToSpeak = "你",
                            pictureOptions = listOf(
                                PictureOption("opt_saya", "saya", "我", R.drawable.ill_cartoon_saya, false),
                                PictureOption("opt_kamu", "kamu", "你", R.drawable.ill_cartoon_kamu, true),
                                PictureOption("opt_murid", "murid", "学生", R.drawable.ill_cartoon_murid, false),
                                PictureOption("opt_dia", "(pria) dia", "他", R.drawable.ill_cartoon_dia_pria, false)
                            )
                        ),
                        // 2. Soal 2: Pilihan Gambar 1x2 (中国 -> (negara)\nTiongkok)
                        Exercise(
                            id = "u1_l3_p1_q2",
                            type = ExerciseType.PICTURE_CHOICE,
                            title = "Pilih gambar yang benar",
                            targetHanzi = "中国",
                            targetPinyin = "Zhōngguó",
                            targetTranslation = "(negara)\nTiongkok",
                            correctAnswer = "(negara)\nTiongkok",
                            audioToSpeak = "中国",
                            pictureOptions = listOf(
                                PictureOption("opt_murid", "murid", "学生", R.drawable.ill_cartoon_murid, false),
                                PictureOption("opt_china", "(negara)\nTiongkok", "中国", R.drawable.ill_cartoon_tiongkok, true)
                            )
                        ),
                        // 3. Soal 3: Lengkapi Terjemahan Bahasa Indonesia (你是中国 人吗？ -> [Apakah] kamu orang Tiongkok?)
                        Exercise(
                            id = "u1_l3_p1_q3",
                            type = ExerciseType.FILL_BLANK,
                            title = "Lengkapi terjemahan",
                            targetHanzi = "你 是 中国 人 吗？",
                            targetPinyin = "Nǐ shì Zhōngguó rén ma",
                            sentenceWithBlank = "________ kamu orang Tiongkok?",
                            options = listOf("Jika", "Jadi", "Apakah"),
                            correctAnswer = "Apakah",
                            audioToSpeak = "你是中国人吗？"
                        ),
                        // 4. Soal 4: Pilih Terjemahan (你是老师吗？ -> Apakah kamu seorang guru?)
                        Exercise(
                            id = "u1_l3_p1_q4",
                            type = ExerciseType.SENTENCE_CHOICE,
                            title = "Pilih terjemahan yang benar",
                            targetHanzi = "你 是 老师 吗？",
                            targetPinyin = "Nǐ shì lǎoshī ma",
                            options = listOf(
                                "Apakah dia(L) seorang murid?",
                                "Apakah kamu seorang guru?",
                                "Apakah kamu seorang murid?",
                                "Apakah Budi seorang guru?"
                            ),
                            correctAnswer = "Apakah kamu seorang guru?",
                            audioToSpeak = "你是老师吗？"
                        ),
                        // 5. Soal 5: Pilih Terjemahan Mandarin (Apakah Budi orang Tiongkok? -> 布迪是 中国 人吗？)
                        Exercise(
                            id = "u1_l3_p1_q5",
                            type = ExerciseType.SENTENCE_CHOICE,
                            title = "Pilih terjemahan yang benar",
                            targetTranslation = "Apakah Budi orang Tiongkok?",
                            options = listOf(
                                "Bùdí shì Yìnní rén ma\n布迪 是 印尼 人 吗？",
                                "Bùdí shì Zhōngguó rén ma\n布迪 是 中国 人 吗？",
                                "Wǒ shì Zhōngguó rén ma\n我 是 中国 人 吗？",
                                "Bùdí shì lǎoshī ma\n布迪 是 老师 吗？"
                            ),
                            correctAnswer = "Bùdí shì Zhōngguó rén ma\n布迪 是 中国 人 吗？",
                            audioToSpeak = "布迪中国人吗？"
                        ),
                        // 6. Soal 6: Pilihan Gambar 2x2 (他 -> (pria) dia)
                        Exercise(
                            id = "u1_l3_p1_q6",
                            type = ExerciseType.PICTURE_CHOICE,
                            title = "Pilih gambar yang benar",
                            targetHanzi = "他",
                            targetPinyin = "tā",
                            targetTranslation = "(pria) dia",
                            correctAnswer = "(pria) dia",
                            audioToSpeak = "他",
                            pictureOptions = listOf(
                                PictureOption("opt_dia_pria", "(pria) dia", "他", R.drawable.ill_cartoon_dia_pria, true),
                                PictureOption("opt_guru", "guru", "老师", R.drawable.ill_cartoon_guru, false),
                                PictureOption("opt_murid", "murid", "学生", R.drawable.ill_cartoon_murid, false),
                                PictureOption("opt_kamu", "kamu", "你", R.drawable.ill_cartoon_kamu, false)
                            )
                        ),
                        // 7. Soal 7: Pilih Terjemahan (他是 学生 吗？ -> Apakah dia(L) seorang murid?)
                        Exercise(
                            id = "u1_l3_p1_q7",
                            type = ExerciseType.SENTENCE_CHOICE,
                            title = "Pilih terjemahan yang benar",
                            targetHanzi = "他 是 学生 吗？",
                            targetPinyin = "Tā shì xuéshēng ma",
                            options = listOf(
                                "Apakah dia(L) seorang guru?",
                                "Apakah kamu seorang murid?",
                                "Apakah dia(L) seorang murid?",
                                "Apakah dia(L) orang Tiongkok?"
                            ),
                            correctAnswer = "Apakah dia(L) seorang murid?",
                            audioToSpeak = "他是学生吗？"
                        ),
                        // 8. Soal 8: Susun Kalimat Audio Imersif (你是中国人吗？)
                        Exercise(
                            id = "u1_l3_p1_q8",
                            type = ExerciseType.SENTENCE_BUILDER,
                            title = "Apa yang Anda dengar?",
                            targetHanzi = "你 是 中国 人 吗？",
                            targetPinyin = "Nǐ shì Zhōngguó rén ma?",
                            targetTranslation = "Apakah kamu orang Tiongkok?",
                            audioToSpeak = "你是中国人吗？",
                            wordChips = listOf("你:nǐ", "中国:Zhōngguó", "叫:jiào", "他:tā", "吗:ma", "我:wǒ", "印尼:Yìnní"),
                            correctAnswer = "你,中国,吗",
                            isImmersiveSpeaker = true
                        ),
                        // 9. Soal 9: Pasangan Kartu (中国, 他, 你)
                        Exercise(
                            id = "u1_l3_p1_q9",
                            type = ExerciseType.MATCH_PAIRS,
                            title = "Ketuk pasangan yang sesuai",
                            correctAnswer = "ALL_MATCHED",
                            matchPairs = listOf(
                                MatchPairItem("l3_p1_m1", "中国", "Zhōngguó", "(negara) Tiongkok"),
                                MatchPairItem("l3_p1_m2", "他", "tā", "(pria) dia"),
                                MatchPairItem("l3_p1_m3", "你", "nǐ", "kamu")
                            )
                        ),
                        // 10. Soal 10: Lengkapi Terjemahan (Apakah kamu seorang murid? -> [你] 是 学生 [吗] ？)
                        Exercise(
                            id = "u1_l3_p1_q10",
                            type = ExerciseType.SENTENCE_BUILDER,
                            title = "Lengkapi terjemahan",
                            targetTranslation = "Apakah kamu seorang murid?",
                            targetHanzi = "你 是 学生 吗？",
                            targetPinyin = "Nǐ shì xuéshēng ma?",
                            audioToSpeak = "你是学生吗？",
                            wordChips = listOf("叫:jiào", "人:rén", "你:nǐ", "他:tā", "吗:ma", "我:wǒ"),
                            correctAnswer = "你,吗"
                        )
                    ),
                    exercisesPart2 = listOf(
                        // 1. Soal 1: Lengkapi terjemahan (Wǒ bú shì xuéshēng / 我不是 学生 。 -> Saya [bukan] seorang murid.)
                        Exercise(
                            id = "u1_l3_p2_q1",
                            type = ExerciseType.FILL_BLANK,
                            title = "Lengkapi terjemahan",
                            targetHanzi = "我 不 是 学生。",
                            targetPinyin = "Wǒ bú shì xuéshēng",
                            sentenceWithBlank = "Saya ________ seorang murid.",
                            options = listOf("adalah", "bukan", "dulu"),
                            correctAnswer = "bukan",
                            audioToSpeak = "我不是学生。"
                        ),
                        // 2. Soal 2: Pilihan Gambar 2x2 (她 -> (perempuan) dia)
                        Exercise(
                            id = "u1_l3_p2_q2",
                            type = ExerciseType.PICTURE_CHOICE,
                            title = "Pilih gambar yang benar",
                            targetHanzi = "她",
                            targetPinyin = "tā",
                            targetTranslation = "(perempuan)\ndia",
                            correctAnswer = "(perempuan)\ndia",
                            audioToSpeak = "她",
                            pictureOptions = listOf(
                                PictureOption("p2_q2_opt1", "saya", "我", R.drawable.ill_cartoon_saya, false),
                                PictureOption("p2_q2_opt2", "(perempuan)\ndia", "她", R.drawable.ill_cartoon_dia_perempuan, true),
                                PictureOption("p2_q2_opt3", "orang", "人", R.drawable.ill_cartoon_orang, false),
                                PictureOption("p2_q2_opt4", "kamu", "你", R.drawable.ill_cartoon_kamu, false)
                            )
                        ),
                        // 3. Soal 3: Pilih terjemahan (她不叫 王飞 。 -> Nama dia(P) bukan Wang Fei.)
                        Exercise(
                            id = "u1_l3_p2_q3",
                            type = ExerciseType.SENTENCE_CHOICE,
                            title = "Pilih terjemahan yang benar",
                            targetHanzi = "她 不 叫 王飞。",
                            targetPinyin = "Tā bú jiào WángFēi",
                            options = listOf(
                                "Dia(P) bukan seorang guru.",
                                "Nama dia(L) bukan Budi.",
                                "Dia(P) bukan seorang murid.",
                                "Nama dia(P) bukan Wang Fei."
                            ),
                            correctAnswer = "Nama dia(P) bukan Wang Fei.",
                            audioToSpeak = "她不叫王飞。"
                        ),
                        // 4. Soal 4: Pilihan Gambar 2x2 (医生 -> dokter)
                        Exercise(
                            id = "u1_l3_p2_q4",
                            type = ExerciseType.PICTURE_CHOICE,
                            title = "Pilih gambar yang benar",
                            targetHanzi = "医生",
                            targetPinyin = "yīshēng",
                            targetTranslation = "dokter",
                            correctAnswer = "dokter",
                            audioToSpeak = "医生",
                            pictureOptions = listOf(
                                PictureOption("p2_q4_opt1", "kamu", "你", R.drawable.ill_cartoon_kamu, false),
                                PictureOption("p2_q4_opt2", "dokter", "医生", R.drawable.ill_cartoon_dokter, true),
                                PictureOption("p2_q4_opt3", "murid", "学生", R.drawable.ill_cartoon_murid, false),
                                PictureOption("p2_q4_opt4", "guru", "老师", R.drawable.ill_cartoon_guru, false)
                            )
                        ),
                        // 5. Soal 5: Apa yang Anda dengar? (我 [不] 是 [医生] 。)
                        Exercise(
                            id = "u1_l3_p2_q5",
                            type = ExerciseType.SENTENCE_BUILDER,
                            title = "Apa yang Anda dengar?",
                            targetHanzi = "我 不 是 医生。",
                            targetPinyin = "Wǒ bú shì yīshēng.",
                            targetTranslation = "Saya bukan seorang dokter.",
                            wordChips = listOf("叫:jiào", "不:bù", "学生:xuéshēng", "老师:lǎoshī", "人:rén", "医生:yīshēng"),
                            correctAnswer = "不,医生",
                            audioToSpeak = "我不是医生。",
                            isImmersiveSpeaker = true,
                            illustrationRes = 0
                        ),
                        // 6. Soal 6: Pilihan Gambar 2x2 (再见 -> sampai jumpa, selamat tinggal)
                        Exercise(
                            id = "u1_l3_p2_q6",
                            type = ExerciseType.PICTURE_CHOICE,
                            title = "Pilih gambar yang benar",
                            targetHanzi = "再见",
                            targetPinyin = "zàijiàn",
                            targetTranslation = "sampai jumpa,\nselamat tinggal",
                            correctAnswer = "sampai jumpa,\nselamat tinggal",
                            audioToSpeak = "再见",
                            pictureOptions = listOf(
                                PictureOption("p2_q6_opt1", "halo", "你好", R.drawable.ill_cartoon_halo, false),
                                PictureOption("p2_q6_opt2", "kamu", "你", R.drawable.ill_cartoon_kamu, false),
                                PictureOption("p2_q6_opt3", "(negara)\nTiongkok", "中国", R.drawable.ill_cartoon_tiongkok, false),
                                PictureOption("p2_q6_opt4", "sampai jumpa,\nselamat tinggal", "再见", R.drawable.ill_cartoon_sampai_jumpa, true)
                            )
                        ),
                        // 7. Soal 7: Pilih Terjemahan (Dia(P) bukan seorang guru. -> 她不是 老师 。)
                        Exercise(
                            id = "u1_l3_p2_q7",
                            type = ExerciseType.SENTENCE_CHOICE,
                            title = "Pilih terjemahan yang benar",
                            targetTranslation = "Dia(P) bukan seorang guru.",
                            options = listOf(
                                "Wǒ bú shì yīshēng\n我 不 是 医生。",
                                "Tā bú jiào WángFēi\n她 不 叫 王飞。",
                                "Tā bú shì lǎoshī\n她 不 是 老师。",
                                "Wǒ bú shì xuéshēng\n我 不 是 学生。"
                            ),
                            correctAnswer = "Tā bú shì lǎoshī\n她 不 是 老师。",
                            audioToSpeak = "她不是老师。"
                        ),
                        // 8. Soal 8: Pilih kata yang sesuai dengan gambar (Gambar Dokter -> yīshēng / 医生)
                        Exercise(
                            id = "u1_l3_p2_q8",
                            type = ExerciseType.SENTENCE_CHOICE,
                            title = "Pilih kata yang sesuai dengan gambar",
                            illustrationRes = R.drawable.ill_cartoon_dokter,
                            options = listOf(
                                "bù\n不",
                                "zàijiàn\n再见",
                                "yīshēng\n医生",
                                "Zhōngguó\n中国"
                            ),
                            correctAnswer = "yīshēng\n医生",
                            audioToSpeak = "医生"
                        ),
                        // 9. Soal 9: Lengkapi Terjemahan (Dia(P) bukan orang Indonesia. -> [她] [不] 是 印度尼西亚 人 。)
                        Exercise(
                            id = "u1_l3_p2_q9",
                            type = ExerciseType.SENTENCE_BUILDER,
                            title = "Lengkapi terjemahan",
                            targetTranslation = "Dia(P) bukan orang Indonesia.",
                            targetHanzi = "她 不 是 印度尼西亚 人。",
                            targetPinyin = "Tā bú shì Yìndùníxīyà rén.",
                            audioToSpeak = "她不是印度尼西亚人。",
                            wordChips = listOf("叫:jiào", "你:nǐ", "她:tā", "不:bù", "中国:Zhōngguó", "我:wǒ"),
                            correctAnswer = "她,不"
                        ),
                        // 10. Soal 10: Pasangan Kartu (她, 不, 医生, 再见)
                        Exercise(
                            id = "u1_l3_p2_q10",
                            type = ExerciseType.MATCH_PAIRS,
                            title = "Ketuk pasangan yang sesuai",
                            correctAnswer = "ALL_MATCHED",
                            matchPairs = listOf(
                                MatchPairItem("l3_p2_m1", "她", "tā", "(perempuan)\ndia"),
                                MatchPairItem("l3_p2_m2", "不", "bù", "tidak, bukan"),
                                MatchPairItem("l3_p2_m3", "医生", "yīshēng", "dokter"),
                                MatchPairItem("l3_p2_m4", "再见", "zàijiàn", "sampai jumpa,\nselamat tinggal")
                            )
                        ),
                        // 11. Soal 11: Pilih kata yang sesuai dengan gambar (Gambar Sampai Jumpa -> zàijiàn / 再见)
                        Exercise(
                            id = "u1_l3_p2_q11",
                            type = ExerciseType.SENTENCE_CHOICE,
                            title = "Pilih kata yang sesuai dengan gambar",
                            illustrationRes = R.drawable.ill_cartoon_sampai_jumpa,
                            options = listOf(
                                "rén\n人",
                                "zàijiàn\n再见",
                                "Zhōngguó\n中国",
                                "ma\n吗"
                            ),
                            correctAnswer = "zàijiàn\n再见",
                            audioToSpeak = "再见"
                        ),
                        // 12. Soal 12: Pilih Terjemahan (她不叫 王飞 。 -> Nama dia(P) bukan Wang Fei.)
                        Exercise(
                            id = "u1_l3_p2_q12",
                            type = ExerciseType.SENTENCE_CHOICE,
                            title = "Pilih terjemahan yang benar",
                            targetHanzi = "她 不 叫 王飞。",
                            targetPinyin = "Tā bú jiào WángFēi",
                            options = listOf(
                                "Dia(P) bukan seorang murid.",
                                "Dia(P) bukan seorang guru.",
                                "Nama dia(P) bukan Wang Fei.",
                                "Nama dia(L) bukan Budi."
                            ),
                            correctAnswer = "Nama dia(P) bukan Wang Fei.",
                            audioToSpeak = "她不叫王飞。"
                        )
                    )
                ),
                Lesson(
                    id = "u1_l4",
                    title = "Apakah kamu orang Tiongkok?",
                    subtitle = "Latihan penguatan materi kewarganegaraan",
                    grammarNote = "Latihan komprehensif kosakata dan pola kalimat tanya 吗.",
                    newWords = listOf(
                        Word("w5_1", "中国", "Zhōngguó", "Tiongkok", "Nama negara", "你是中国人吗？", "Nǐ shì Zhōngguó rén ma?", "Apakah kamu orang Tiongkok?"),
                        Word("w5_2", "学生", "xuéshēng", "Murid", "Profesi", "他是学生吗？", "Tā shì xuéshēng ma?", "Apakah dia seorang murid?")
                    ),
                    exercises = listOf(
                        // 1. Soal 1: Lengkapi terjemahan (Apakah kamu seorang guru? -> [你] [是] 老师 [吗] ？)
                        Exercise(
                            id = "u1_l4_p1_q1",
                            type = ExerciseType.SENTENCE_BUILDER,
                            title = "Lengkapi terjemahan",
                            targetTranslation = "Apakah kamu seorang guru?",
                            targetHanzi = "你 是 老师 吗？",
                            targetPinyin = "Nǐ shì lǎoshī ma?",
                            audioToSpeak = "你是老师吗？",
                            wordChips = listOf("你:nǐ", "他:tā", "叫:jiào", "我:wǒ", "是:shì", "吗:ma", "人:rén"),
                            correctAnswer = "你,是,吗"
                        ),
                        // 2. Soal 2: Pilih terjemahan yang benar ((negara) Tiongkok -> Zhōngguó / 中国)
                        Exercise(
                            id = "u1_l4_p1_q2",
                            type = ExerciseType.SENTENCE_CHOICE,
                            title = "Pilih terjemahan yang benar",
                            targetTranslation = "(negara) Tiongkok",
                            options = listOf(
                                "lǎoshī\n老师",
                                "xuéshēng\n学生",
                                "Yìnní\n印尼",
                                "Zhōngguó\n中国"
                            ),
                            correctAnswer = "Zhōngguó\n中国",
                            audioToSpeak = "中国"
                        ),
                        // 3. Soal 3: Apa yang Anda dengar? ([他] [是] 学生 [吗] ？)
                        Exercise(
                            id = "u1_l4_p1_q3",
                            type = ExerciseType.SENTENCE_BUILDER,
                            title = "Apa yang Anda dengar?",
                            targetHanzi = "他 是 学生 吗？",
                            targetPinyin = "Tā shì xuéshēng ma?",
                            targetTranslation = "Apakah dia seorang murid?",
                            wordChips = listOf("人:rén", "叫:jiào", "你:nǐ", "他:tā", "是:shì", "吗:ma"),
                            correctAnswer = "他,是,吗",
                            audioToSpeak = "他是学生吗？",
                            isImmersiveSpeaker = true,
                            illustrationRes = 0
                        ),
                        // 4. Soal 4: Selesaikan percakapan ([?] -> 他是印尼人。)
                        Exercise(
                            id = "u1_l4_p1_q4",
                            type = ExerciseType.SENTENCE_CHOICE,
                            title = "Selesaikan percakapan",
                            dialogueBlankIsFirst = true,
                            dialogueSpeakerText = "他是印尼人。",
                            dialogueSpeakerPinyin = "Tā shì Yìnní rén",
                            audioToSpeak = "他是印尼人。",
                            options = listOf(
                                "Bùdí shì Yìnní rén ma\n布迪 是 印尼 人 吗？",
                                "Nǐ jiào Bùdí ma\n你 叫 布迪 吗？",
                                "Bùdí shì lǎoshī ma\n布迪 是 老师 吗？"
                            ),
                            correctAnswer = "Bùdí shì Yìnní rén ma\n布迪 是 印尼 人 吗？"
                        ),
                        // 5. Soal 5: Pilih kalimat yang benar secara tata bahasa
                        Exercise(
                            id = "u1_l4_p1_q5",
                            type = ExerciseType.SENTENCE_CHOICE,
                            title = "Pilih kalimat yang benar secara tata bahasa",
                            options = listOf(
                                "Shì nǐ Zhōngguó rén ma\n是 你 中国 人 吗？",
                                "Nǐ shì Zhōngguó rén ma\n你 是 中国 人 吗？"
                            ),
                            correctAnswer = "Nǐ shì Zhōngguó rén ma\n你 是 中国 人 吗？",
                            audioToSpeak = "你是中国人吗？"
                        ),
                        // 6. Soal 6: Ketuk pasangan yang sesuai (中国, 你, audio-only 他)
                        Exercise(
                            id = "u1_l4_p1_q6",
                            type = ExerciseType.MATCH_PAIRS,
                            title = "Ketuk pasangan yang sesuai",
                            correctAnswer = "ALL_MATCHED",
                            matchPairs = listOf(
                                MatchPairItem("l4_p1_m1", "中国", "Zhōngguó", "(negara) Tiongkok"),
                                MatchPairItem("l4_p1_m2", "你", "nǐ", "kamu"),
                                MatchPairItem("l4_p1_m3", "他", "tā", "(pria) dia", isAudioOnly = true, audioToSpeak = "他")
                            )
                        ),
                        // 7. Soal 7: Selesaikan percakapan (A: 你是中国人吗？ -> B: 我是中国人。)
                        Exercise(
                            id = "u1_l4_p1_q7",
                            type = ExerciseType.SENTENCE_CHOICE,
                            title = "Selesaikan percakapan",
                            dialogueBlankIsFirst = false,
                            dialogueThumbnailRes = R.drawable.img_girl_in_car,
                            dialogueSpeakerText = "你是中国人吗？",
                            dialogueSpeakerPinyin = "Nǐ shì Zhōngguó rén ma",
                            audioToSpeak = "你是中国人吗？",
                            options = listOf(
                                "Wǒ shì Zhōngguó rén\n我 是 中国 人。",
                                "Wǒ shì lǎoshī\n我 是 老师。",
                                "Tā jiào Wáng Fēi\n他 叫 王 飞。"
                            ),
                            correctAnswer = "Wǒ shì Zhōngguó rén\n我 是 中国 人。"
                        ),
                        // 8. Soal 8: Terjemahkan kalimat ini (Apakah kamu seorang murid? -> 你是学生吗？)
                        Exercise(
                            id = "u1_l4_p1_q8",
                            type = ExerciseType.SENTENCE_BUILDER,
                            title = "Terjemahkan kalimat ini",
                            targetTranslation = "Apakah kamu seorang murid?",
                            targetHanzi = "你 是 学生 吗？",
                            targetPinyin = "Nǐ shì xuéshēng ma?",
                            audioToSpeak = "你是学生吗？",
                            wordChips = listOf("是:shì", "我:wǒ", "吗:ma", "学生:xuéshēng", "你:nǐ", "人:rén", "叫:jiào"),
                            correctAnswer = "你,是,学生,吗"
                        )
                    ),
                    exercisesPart1 = listOf(
                        // 1. Soal 1: Lengkapi terjemahan (Apakah kamu seorang guru? -> [你] [是] 老师 [吗] ？)
                        Exercise(
                            id = "u1_l4_p1_q1",
                            type = ExerciseType.SENTENCE_BUILDER,
                            title = "Lengkapi terjemahan",
                            targetTranslation = "Apakah kamu seorang guru?",
                            targetHanzi = "你 是 老师 吗？",
                            targetPinyin = "Nǐ shì lǎoshī ma?",
                            audioToSpeak = "你是老师吗？",
                            wordChips = listOf("你:nǐ", "他:tā", "叫:jiào", "我:wǒ", "是:shì", "吗:ma", "人:rén"),
                            correctAnswer = "你,是,吗"
                        ),
                        // 2. Soal 2: Pilih terjemahan yang benar ((negara) Tiongkok -> Zhōngguó / 中国)
                        Exercise(
                            id = "u1_l4_p1_q2",
                            type = ExerciseType.SENTENCE_CHOICE,
                            title = "Pilih terjemahan yang benar",
                            targetTranslation = "(negara) Tiongkok",
                            options = listOf(
                                "lǎoshī\n老师",
                                "xuéshēng\n学生",
                                "Yìnní\n印尼",
                                "Zhōngguó\n中国"
                            ),
                            correctAnswer = "Zhōngguó\n中国",
                            audioToSpeak = "中国"
                        ),
                        // 3. Soal 3: Apa yang Anda dengar? ([他] [是] 学生 [吗] ？)
                        Exercise(
                            id = "u1_l4_p1_q3",
                            type = ExerciseType.SENTENCE_BUILDER,
                            title = "Apa yang Anda dengar?",
                            targetHanzi = "他 是 学生 吗？",
                            targetPinyin = "Tā shì xuéshēng ma?",
                            targetTranslation = "Apakah dia seorang murid?",
                            wordChips = listOf("人:rén", "叫:jiào", "你:nǐ", "他:tā", "是:shì", "吗:ma"),
                            correctAnswer = "他,是,吗",
                            audioToSpeak = "他是学生吗？",
                            isImmersiveSpeaker = true,
                            illustrationRes = 0
                        ),
                        // 4. Soal 4: Selesaikan percakapan ([?] -> 他是印尼人。)
                        Exercise(
                            id = "u1_l4_p1_q4",
                            type = ExerciseType.SENTENCE_CHOICE,
                            title = "Selesaikan percakapan",
                            dialogueBlankIsFirst = true,
                            dialogueSpeakerText = "他是印尼人。",
                            dialogueSpeakerPinyin = "Tā shì Yìnní rén",
                            audioToSpeak = "他是印尼人。",
                            options = listOf(
                                "Bùdí shì Yìnní rén ma\n布迪 是 印尼 人 吗？",
                                "Nǐ jiào Bùdí ma\n你 叫 布迪 吗？",
                                "Bùdí shì lǎoshī ma\n布迪 是 老师 吗？"
                            ),
                            correctAnswer = "Bùdí shì Yìnní rén ma\n布迪 是 印尼 人 吗？"
                        ),
                        // 5. Soal 5: Pilih kalimat yang benar secara tata bahasa
                        Exercise(
                            id = "u1_l4_p1_q5",
                            type = ExerciseType.SENTENCE_CHOICE,
                            title = "Pilih kalimat yang benar secara tata bahasa",
                            options = listOf(
                                "Shì nǐ Zhōngguó rén ma\n是 你 中国 人 吗？",
                                "Nǐ shì Zhōngguó rén ma\n你 是 中国 人 吗？"
                            ),
                            correctAnswer = "Nǐ shì Zhōngguó rén ma\n你 是 中国 人 吗？",
                            audioToSpeak = "你是中国人吗？"
                        ),
                        // 6. Soal 6: Ketuk pasangan yang sesuai (中国, 你, audio-only 他)
                        Exercise(
                            id = "u1_l4_p1_q6",
                            type = ExerciseType.MATCH_PAIRS,
                            title = "Ketuk pasangan yang sesuai",
                            correctAnswer = "ALL_MATCHED",
                            matchPairs = listOf(
                                MatchPairItem("l4_p1_m1", "中国", "Zhōngguó", "(negara) Tiongkok"),
                                MatchPairItem("l4_p1_m2", "你", "nǐ", "kamu"),
                                MatchPairItem("l4_p1_m3", "他", "tā", "(pria) dia", isAudioOnly = true, audioToSpeak = "他")
                            )
                        ),
                        // 7. Soal 7: Selesaikan percakapan (A: 你是中国人吗？ -> B: 我是中国人。)
                        Exercise(
                            id = "u1_l4_p1_q7",
                            type = ExerciseType.SENTENCE_CHOICE,
                            title = "Selesaikan percakapan",
                            dialogueBlankIsFirst = false,
                            dialogueThumbnailRes = R.drawable.img_girl_in_car,
                            dialogueSpeakerText = "你是中国人吗？",
                            dialogueSpeakerPinyin = "Nǐ shì Zhōngguó rén ma",
                            audioToSpeak = "你是中国人吗？",
                            options = listOf(
                                "Wǒ shì Zhōngguó rén\n我 是 中国 人。",
                                "Wǒ shì lǎoshī\n我 是 老师。",
                                "Tā jiào Wáng Fēi\n他 叫 王 飞。"
                            ),
                            correctAnswer = "Wǒ shì Zhōngguó rén\n我 是 中国 人。"
                        ),
                        // 8. Soal 8: Terjemahkan kalimat ini (Apakah kamu seorang murid? -> 你是学生吗？)
                        Exercise(
                            id = "u1_l4_p1_q8",
                            type = ExerciseType.SENTENCE_BUILDER,
                            title = "Terjemahkan kalimat ini",
                            targetTranslation = "Apakah kamu seorang murid?",
                            targetHanzi = "你 是 学生 吗？",
                            targetPinyin = "Nǐ shì xuéshēng ma?",
                            audioToSpeak = "你是学生吗？",
                            wordChips = listOf("是:shì", "我:wǒ", "吗:ma", "学生:xuéshēng", "你:nǐ", "人:rén", "叫:jiào"),
                            correctAnswer = "你,是,学生,吗"
                        )
                    ),
                    exercisesPart2 = listOf(
                        // 1. Soal 1: Selesaikan percakapan (Tā jiào WángFēi ma / 她叫 王飞 吗？ -> 她不叫王飞。)
                        Exercise(
                            id = "u1_l4_p2_q1",
                            type = ExerciseType.SENTENCE_CHOICE,
                            title = "Selesaikan percakapan",
                            dialogueBlankIsFirst = false,
                            dialogueSpeakerText = "她叫 王飞 吗？",
                            dialogueSpeakerPinyin = "Tā jiào WángFēi ma",
                            audioToSpeak = "她叫王飞吗？",
                            options = listOf(
                                "Tā bú shì yīshēng\n她 不 是 医生。",
                                "Tā bú jiào WángFēi\n她 不 叫 王飞。",
                                "WángFēi bú shì Zhōngguó rén\n王飞 不 是 中国 人。"
                            ),
                            correctAnswer = "Tā bú jiào WángFēi\n她 不 叫 王飞。"
                        ),
                        // 2. Soal 2: Lengkapi terjemahan (Sampai jumpa, Wang Fei. -> 王飞，[再见] 。)
                        Exercise(
                            id = "u1_l4_p2_q2",
                            type = ExerciseType.SENTENCE_BUILDER,
                            title = "Lengkapi terjemahan",
                            targetTranslation = "Sampai jumpa, Wang Fei.",
                            targetHanzi = "王飞， 再见。",
                            targetPinyin = "WángFēi, zàijiàn.",
                            audioToSpeak = "王飞，再见。",
                            wordChips = listOf("再见:zàijiàn", "你好:nǐhǎo", "你:nǐ", "中国:Zhōngguó"),
                            correctAnswer = "再见"
                        ),
                        // 3. Soal 3: Apa yang Anda dengar? (couple background -> [她] [不] [是] [中国] [人] 。)
                        Exercise(
                            id = "u1_l4_p2_q3",
                            type = ExerciseType.SENTENCE_BUILDER,
                            title = "Apa yang Anda dengar?",
                            isImmersiveSpeaker = true,
                            illustrationRes = 0,
                            targetHanzi = "她 不 是 中国 人。",
                            targetPinyin = "Tā bú shì Zhōngguó rén.",
                            targetTranslation = "Dia bukan orang Tiongkok.",
                            wordChips = listOf("叫:jiào", "我:wǒ", "你:nǐ", "她:tā", "不:bú", "是:shì", "中国:Zhōngguó", "人:rén"),
                            correctAnswer = "她,不,是,中国,人",
                            audioToSpeak = "她不是中国人。"
                        ),
                        // 4. Soal 4: Lengkapi terjemahan (Dia(P) bukan seorang murid. -> [她] [不] [是] 学生 。)
                        Exercise(
                            id = "u1_l4_p2_q4",
                            type = ExerciseType.SENTENCE_BUILDER,
                            title = "Lengkapi terjemahan",
                            targetTranslation = "Dia(P) bukan seorang murid.",
                            targetHanzi = "她 不 是 学生。",
                            targetPinyin = "Tā bú shì xuéshēng.",
                            audioToSpeak = "她不是学生。",
                            wordChips = listOf("我:wǒ", "你:nǐ", "她:tā", "是:shì", "不:bú", "人:rén", "叫:jiào"),
                            correctAnswer = "她,不,是"
                        ),
                        // 5. Soal 5: Pilih kalimat yang benar secara tata bahasa
                        Exercise(
                            id = "u1_l4_p2_q5",
                            type = ExerciseType.SENTENCE_CHOICE,
                            title = "Pilih kalimat yang benar secara tata bahasa",
                            options = listOf(
                                "Tā bú jiào WángFēi\n她 不 叫 王飞。",
                                "Tā jiào bù WángFēi\n她 叫 不 王飞。",
                                "Tā bù WángFēi\n她 不 王飞。"
                            ),
                            correctAnswer = "Tā bú jiào WángFēi\n她 不 叫 王飞。",
                            audioToSpeak = "她不叫王飞。"
                        ),
                        // 6. Soal 6: Ketuk pasangan yang sesuai (不, 医生, 再见, audio-only 她)
                        Exercise(
                            id = "u1_l4_p2_q6",
                            type = ExerciseType.MATCH_PAIRS,
                            title = "Ketuk pasangan yang sesuai",
                            correctAnswer = "ALL_MATCHED",
                            matchPairs = listOf(
                                MatchPairItem("l4_p2_m1", "不", "bù", "tidak, bukan"),
                                MatchPairItem("l4_p2_m2", "医生", "yīshēng", "dokter"),
                                MatchPairItem("l4_p2_m3", "再见", "zàijiàn", "sampai jumpa,\nselamat tinggal"),
                                MatchPairItem("l4_p2_m4", "她", "tā", "(perempuan) dia", isAudioOnly = true, audioToSpeak = "她")
                            )
                        ),
                        // 7. Soal 7: Dengarkan kalimat dan pilih terjemahan yang benar (Video woman teacher laptop -> Saya bukan seorang guru.)
                        Exercise(
                            id = "u1_l4_p2_q7",
                            type = ExerciseType.SENTENCE_CHOICE,
                            title = "Dengarkan kalimat dan pilih terjemahan yang benar",
                            illustrationRes = R.drawable.img_girl_laptop_teacher,
                            options = listOf(
                                "Saya bukan seorang murid.",
                                "Saya bukan seorang guru."
                            ),
                            correctAnswer = "Saya bukan seorang guru.",
                            audioToSpeak = "我不是老师。"
                        ),
                        // 8. Soal 8: Terjemahkan kalimat ini (Saya bukan seorang dokter. -> 我不是医生。)
                        Exercise(
                            id = "u1_l4_p2_q8",
                            type = ExerciseType.SENTENCE_BUILDER,
                            title = "Terjemahkan kalimat ini",
                            targetTranslation = "Saya bukan seorang dokter.",
                            targetHanzi = "我 不 是 医生。",
                            targetPinyin = "Wǒ bú shì yīshēng.",
                            audioToSpeak = "我不是医生。",
                            wordChips = listOf("医生:yīshēng", "不:bú", "人:rén", "叫:jiào", "老师:lǎoshī", "是:shì", "我:wǒ"),
                            correctAnswer = "我,不,是,医生"
                        )
                    ),
                    exercisesPart3 = listOf(
                        // 1. Soal 1: Lengkapi kalimat (China flag pointing to ? connected to girl in red -> [她] 是 [中国] 人 [吗] ?)
                        Exercise(
                            id = "u1_l4_p3_q1",
                            type = ExerciseType.SENTENCE_BUILDER,
                            title = "Lengkapi kalimat",
                            illustrationRes = R.drawable.img_woman_chinese_flag,
                            targetHanzi = "她 是 中国 人 吗？",
                            targetPinyin = "Tā shì Zhōngguó rén ma?",
                            audioToSpeak = "她是中国人吗？",
                            wordChips = listOf("吗:ma", "她:tā", "中国:Zhōngguó"),
                            correctAnswer = "她,中国,吗"
                        ),
                        // 2. Soal 2: Apa yang Anda dengar? (Buddy the Elf school -> 我不是学生。)
                        Exercise(
                            id = "u1_l4_p3_q2",
                            type = ExerciseType.SENTENCE_BUILDER,
                            title = "Apa yang Anda dengar?",
                            illustrationRes = 0,
                            targetHanzi = "我 不 是 学生。",
                            targetPinyin = "Wǒ bú shì xuéshēng.",
                            audioToSpeak = "我不是学生。",
                            wordChips = listOf("中国:Zhōngguó", "我:wǒ", "叫:jiào", "学生:xuéshēng", "人:rén", "不:bú", "是:shì"),
                            correctAnswer = "我,不,是,学生"
                        ),
                        // 3. Soal 3: Lengkapi kalimat (Mr. Bean surgeon -> [他] [不] 是 [医生] 。)
                        Exercise(
                            id = "u1_l4_p3_q3",
                            type = ExerciseType.SENTENCE_BUILDER,
                            title = "Lengkapi kalimat",
                            illustrationRes = R.drawable.img_mr_bean_doctor,
                            targetHanzi = "他 不 是 医生。",
                            targetPinyin = "Tā bú shì yīshēng.",
                            audioToSpeak = "他不是医生。",
                            wordChips = listOf("他:tā", "医生:yīshēng", "不:bú"),
                            correctAnswer = "他,不,医生"
                        ),
                        // 4. Soal 4: Buat kalimat menggunakan semua kata berdasarkan gambar (Jerry Great Wall -> 中国再见。)
                        Exercise(
                            id = "u1_l4_p3_q4",
                            type = ExerciseType.SENTENCE_BUILDER,
                            title = "Buat kalimat menggunakan semua kata berdasarkan gambar",
                            illustrationRes = R.drawable.img_jerry_great_wall,
                            targetHanzi = "中国 再见。",
                            targetPinyin = "Zhōngguó zàijiàn.",
                            audioToSpeak = "中国再见。",
                            wordChips = listOf("中国:Zhōngguó", "再见:zàijiàn"),
                            correctAnswer = "中国,再见"
                        ),
                        // 5. Soal 5: Apa yang Anda dengar? (Master Shifu & Po -> 他是老师吗？)
                        Exercise(
                            id = "u1_l4_p3_q5",
                            type = ExerciseType.SENTENCE_BUILDER,
                            title = "Apa yang Anda dengar?",
                            illustrationRes = 0,
                            targetHanzi = "他 是 老师 吗？",
                            targetPinyin = "Tā shì lǎoshī ma?",
                            audioToSpeak = "他是老师吗？",
                            wordChips = listOf("他:tā", "是:shì", "吗:ma", "人:rén", "叫:jiào", "老师:lǎoshī", "我:wǒ"),
                            correctAnswer = "他,是,老师,吗"
                        ),
                        // 6. Soal 6: Buat kalimat menggunakan semua kata berdasarkan gambar (Female doctor pink syringe -> 她是医生吗？)
                        Exercise(
                            id = "u1_l4_p3_q6",
                            type = ExerciseType.SENTENCE_BUILDER,
                            title = "Buat kalimat menggunakan semua kata berdasarkan gambar",
                            illustrationRes = R.drawable.img_female_doctor_syringe,
                            targetHanzi = "她 是 医生 吗？",
                            targetPinyin = "Tā shì yīshēng ma?",
                            audioToSpeak = "她是医生吗？",
                            wordChips = listOf("医生:yīshēng", "是:shì", "吗:ma", "她:tā"),
                            correctAnswer = "她,是,医生,吗"
                        )
                    )
                ),
                Lesson(
                    id = "u1_l5",
                    title = "Latihan Komprehensif",
                    subtitle = "Latihan pemantapan seluruh kosakata & pola kalimat Bab 1",
                    grammarNote = "Review menyeluruh pola kalimat 'A 是 B', negasi '不是 / 不叫', serta kalimat tanya '吗'.",
                    newWords = emptyList(),
                    exercisesPart1 = listOf(
                        // 1. Soal 1: Lengkapi terjemahan (Apakah Budi seorang murid? -> 布迪 [是] [学生] [吗] ？)
                        Exercise(
                            id = "u1_l5_p1_q1",
                            type = ExerciseType.SENTENCE_BUILDER,
                            title = "Lengkapi terjemahan",
                            targetTranslation = "Apakah Budi seorang murid?",
                            targetHanzi = "布迪 是 学生 吗？",
                            targetPinyin = "Bùdí shì xuéshēng ma?",
                            audioToSpeak = "布迪是学生吗？",
                            wordChips = listOf("老师:lǎoshī", "你好:nǐhǎo", "学生:xuéshēng", "吗:ma", "人:rén", "叫:jiào", "是:shì"),
                            correctAnswer = "是,学生,吗"
                        ),
                        // 2. Soal 2: Pilih kalimat yang benar untuk melengkapi dialog (Waveform audio prompt -> 我是印尼人。)
                        Exercise(
                            id = "u1_l5_p1_q2",
                            type = ExerciseType.SENTENCE_CHOICE,
                            title = "Pilih kalimat yang benar untuk melengkapi dialog",
                            audioToSpeak = "你好，布迪，你是印尼人吗？",
                            options = listOf(
                                "Wǒ bú shì lǎoshī\n我 不 是 老师。",
                                "Wǒ bú shì Zhōngguó rén\n我 不 是 中国 人。",
                                "Wǒ shì Yìnní rén\n我 是 印尼 人。"
                            ),
                            correctAnswer = "Wǒ shì Yìnní rén\n我 是 印尼 人。"
                        ),
                        // 3. Soal 3: Masukkan kata yang hilang (nǐhǎo -> 你好，我叫布迪，我是医生。)
                        Exercise(
                            id = "u1_l5_p1_q3",
                            type = ExerciseType.PINYIN_KEYBOARD,
                            title = "Masukkan kata yang hilang",
                            targetTranslation = "Halo, nama saya Budi, saya adalah seorang dokter.",
                            targetHanzi = "你好， 我 叫 布迪， 我 是 医生。",
                            targetPinyin = "Nǐhǎo, wǒ jiào Bùdí, wǒ shì yīshēng.",
                            sentenceWithBlank = "________ wǒ jiào Bùdí, wǒ shì yīshēng\n你好， 我 叫 布迪， 我 是 医生。",
                            audioToSpeak = "你好，我叫布迪，我是医生。",
                            keyboardKeys = listOf("ǎ", "d", "h", "ǐ", "n", "o", "ǚ", "w", "y"),
                            correctAnswer = "nǐhǎo"
                        ),
                        // 4. Soal 4: Scenario sentence choice (Bos sering salah memanggil nama -> 我不叫王飞。)
                        Exercise(
                            id = "u1_l5_p1_q4",
                            type = ExerciseType.SENTENCE_CHOICE,
                            title = "Kamu sudah bekerja selama setengah tahun, tetapi bosmu masih sering salah memanggil namamu. Hari ini, ketika makan siang, kamu tidak ingin menahannya lagi. Maka, kamu dengan sungkan memberi tahu bosmu bahwa...",
                            options = listOf(
                                "Wǒ bú shì Zhōngguó rén\n我 不 是 中国 人。",
                                "Wǒ bú jiào WángFēi\n我 不 叫 王飞。",
                                "Wǒ bú shì lǎoshī\n我 不 是 老师。"
                            ),
                            correctAnswer = "Wǒ bú jiào WángFēi\n我 不 叫 王飞。",
                            audioToSpeak = "我不叫王飞。"
                        ),
                        // 5. Soal 5: Ketuk pasangan yang sesuai (人, 再见, 叫, audio-only 你好)
                        Exercise(
                            id = "u1_l5_p1_q5",
                            type = ExerciseType.MATCH_PAIRS,
                            title = "Ketuk pasangan yang sesuai",
                            correctAnswer = "ALL_MATCHED",
                            matchPairs = listOf(
                                MatchPairItem("l5_p1_m1", "人", "rén", "orang"),
                                MatchPairItem("l5_p1_m2", "再见", "zàijiàn", "sampai jumpa,\nselamat tinggal"),
                                MatchPairItem("l5_p1_m3", "叫", "jiào", "dipanggil"),
                                MatchPairItem("l5_p1_m4", "你好", "nǐhǎo", "halo", isAudioOnly = true, audioToSpeak = "你好")
                            )
                        ),
                        // 6. Soal 6: Terjemahkan kalimat ini (Budi bukan orang Tiongkok. -> 布迪不是中国人。)
                        Exercise(
                            id = "u1_l5_p1_q6",
                            type = ExerciseType.SENTENCE_BUILDER,
                            title = "Terjemahkan kalimat ini",
                            targetTranslation = "Budi bukan orang Tiongkok.",
                            targetHanzi = "布迪 不 是 中国 人。",
                            targetPinyin = "Bùdí bú shì Zhōngguó rén.",
                            audioToSpeak = "布迪不是中国人。",
                            wordChips = listOf("布迪:Bùdí", "老师:lǎoshī", "中国:Zhōngguó", "叫:jiào", "人:rén", "你好:nǐhǎo", "是:shì", "不:bú"),
                            correctAnswer = "布迪,不,是,中国,人"
                        ),
                        // 7. Soal 7: Lengkapi terjemahan (Nama dia(L) bukan Budi. -> 他 [bú / 不] 叫 布迪 。)
                        Exercise(
                            id = "u1_l5_p1_q7",
                            type = ExerciseType.PINYIN_KEYBOARD,
                            title = "Lengkapi terjemahan",
                            targetTranslation = "Nama dia(L) bukan Budi.",
                            targetHanzi = "他 不 叫 布迪。",
                            targetPinyin = "Tā bú jiào Bùdí.",
                            sentenceWithBlank = "Tā ________ jiào Bùdí\n他 不 叫 布迪。",
                            audioToSpeak = "他不叫布迪。",
                            keyboardKeys = listOf("b", "c", "é", "k", "o", "t", "ú", "w", "y"),
                            correctAnswer = "bú"
                        )
                    ),
                    exercisesPart2 = listOf(
                        // 1. Soal 1: Lengkapi terjemahan (Apakah namamu Wang Fei? -> [你] [叫] 王飞 [吗] ？)
                        Exercise(
                            id = "u1_l5_p2_q1",
                            type = ExerciseType.SENTENCE_BUILDER,
                            title = "Lengkapi terjemahan",
                            targetTranslation = "Apakah namamu Wang Fei?",
                            targetHanzi = "你 叫 王飞 吗？",
                            targetPinyin = "Nǐ jiào WángFēi ma?",
                            audioToSpeak = "你叫王飞吗？",
                            wordChips = listOf("他:tā", "我:wǒ", "人:rén", "吗:ma", "你好:nǐhǎo", "叫:jiào", "你:nǐ"),
                            correctAnswer = "你,叫,吗"
                        ),
                        // 2. Soal 2: Lengkapi percakapan dengan semua kata (Speaker A: [你] [是] [医生] [吗], Speaker B: 我不是医生。)
                        Exercise(
                            id = "u1_l5_p2_q2",
                            type = ExerciseType.SENTENCE_BUILDER,
                            title = "Lengkapi percakapan dengan semua kata",
                            targetHanzi = "你 是 医生 吗？",
                            targetPinyin = "Nǐ shì yīshēng ma?",
                            audioToSpeak = "你是医生吗？",
                            wordChips = listOf("吗:ma", "是:shì", "你:nǐ", "医生:yīshēng"),
                            correctAnswer = "你,是,医生,吗"
                        ),
                        // 3. Soal 3: Ketuk pasangan yang sesuai (老师, 不, 他, audio-only 医生)
                        Exercise(
                            id = "u1_l5_p2_q3",
                            type = ExerciseType.MATCH_PAIRS,
                            title = "Ketuk pasangan yang sesuai",
                            correctAnswer = "ALL_MATCHED",
                            matchPairs = listOf(
                                MatchPairItem("l5_p2_m1", "老师", "lǎoshī", "guru"),
                                MatchPairItem("l5_p2_m2", "不", "bù", "tidak, bukan"),
                                MatchPairItem("l5_p2_m3", "他", "tā", "(pria) dia"),
                                MatchPairItem("l5_p2_m4", "医生", "yīshēng", "dokter", isAudioOnly = true, audioToSpeak = "医生")
                            )
                        ),
                        // 4. Soal 4: Lengkapi terjemahan (Wang Fei bukan orang Tiongkok. -> 王飞 [不] [是] [中国] [人] 。)
                        Exercise(
                            id = "u1_l5_p2_q4",
                            type = ExerciseType.SENTENCE_BUILDER,
                            title = "Lengkapi terjemahan",
                            targetTranslation = "Wang Fei bukan orang Tiongkok.",
                            targetHanzi = "王飞 不 是 中国 人。",
                            targetPinyin = "WángFēi bú shì Zhōngguó rén.",
                            audioToSpeak = "王飞不是中国人。",
                            wordChips = listOf("印尼:Yìnní", "人:rén", "叫:jiào", "你好:nǐhǎo", "是:shì", "不:bú", "学生:xuéshēng", "中国:Zhōngguó"),
                            correctAnswer = "不,是,中国,人"
                        ),
                        // 5. Soal 5: Dengarkan rekaman dan jawab pertanyaan (Orang ini ingin tahu tentang: -> Kewarganegaraan.)
                        Exercise(
                            id = "u1_l5_p2_q5",
                            type = ExerciseType.SENTENCE_CHOICE,
                            title = "Dengarkan rekaman dan jawab pertanyaan",
                            targetTranslation = "Orang ini ingin tahu tentang:",
                            audioToSpeak = "你是中国人吗？",
                            options = listOf(
                                "Pekerjaan.",
                                "Kewarganegaraan.",
                                "Nama."
                            ),
                            correctAnswer = "Kewarganegaraan."
                        ),
                        // 6. Soal 6: Ketuk pasangan yang sesuai (她, 学生, audio-only 是)
                        Exercise(
                            id = "u1_l5_p2_q6",
                            type = ExerciseType.MATCH_PAIRS,
                            title = "Ketuk pasangan yang sesuai",
                            correctAnswer = "ALL_MATCHED",
                            matchPairs = listOf(
                                MatchPairItem("l5_p2_m5", "她", "tā", "(perempuan) dia"),
                                MatchPairItem("l5_p2_m6", "学生", "xuéshēng", "murid"),
                                MatchPairItem("l5_p2_m7", "是", "shì", "adalah", isAudioOnly = true, audioToSpeak = "是")
                            )
                        ),
                        // 7. Soal 7: Lengkapi terjemahan (Dia(P) orang Tiongkok. -> 她 [shì / 是] 中国人。)
                        Exercise(
                            id = "u1_l5_p2_q7",
                            type = ExerciseType.PINYIN_KEYBOARD,
                            title = "Lengkapi terjemahan",
                            targetTranslation = "Dia(P) orang Tiongkok.",
                            targetHanzi = "她 是 中国 人。",
                            targetPinyin = "Tā shì Zhōngguó rén.",
                            sentenceWithBlank = "Tā ________ Zhōngguó rén\n她 是 中国 人。",
                            audioToSpeak = "她是中国人。",
                            keyboardKeys = listOf("ā", "b", "é", "h", "ì", "ǒ", "q", "s", "u"),
                            correctAnswer = "shì"
                        ),
                        // 8. Soal 8: Terjemahkan kalimat ini (Nama dia(L) bukan Wang Fei. -> 他不叫王飞。)
                        Exercise(
                            id = "u1_l5_p2_q8",
                            type = ExerciseType.SENTENCE_BUILDER,
                            title = "Terjemahkan kalimat ini",
                            targetTranslation = "Nama dia(L) bukan Wang Fei.",
                            targetHanzi = "他 不 叫 王飞。",
                            targetPinyin = "Tā bú jiào WángFēi.",
                            audioToSpeak = "他不叫王飞。",
                            wordChips = listOf("王飞:WángFēi", "不:bú", "我:wǒ", "你:nǐ", "你好:nǐhǎo", "叫:jiào", "他:tā"),
                            correctAnswer = "他,不,叫,王飞"
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
                PathNode("u2_n1", "Mereka adalah teman-temanku", Color(0xFFFFC107), NodeIconType.CAP, isCompleted = false, lessonId = "u2_l1"),
                PathNode("u2_n2", "Mereka adalah teman-temanku", Color(0xFFFFC107), NodeIconType.DUMBBELL, isCompleted = false, lessonId = "u2_l2"),
                PathNode("u2_n3", "Siapa ini?", Color(0xFFFFC107), NodeIconType.CAP, isCompleted = false, lessonId = "u2_l3"),
                PathNode("u2_n4", "Siapa ini?", Color(0xFFFFC107), NodeIconType.DUMBBELL, isCompleted = false, lessonId = "u2_l4"),
                PathNode("u2_n5", "Latihan Komprehensif", Color(0xFFFFC107), NodeIconType.SHUFFLE, isCompleted = false, lessonId = "u2_l5"),
                PathNode("u2_n6", "Kuis Cerita", Color(0xFFFFC107), NodeIconType.BOOK, isCompleted = false, lessonId = "u2_l1"),
                PathNode("u2_n7", "Checkpoint Bab", Color(0xFFFFB300), NodeIconType.CHEST, isCompleted = false, lessonId = "u2_l1"),
                PathNode("u2_n8", "Rest area", Color(0xFF03A9F4), NodeIconType.REST_AREA, isCompleted = false, lessonId = "u2_l1")
            ),
            lessons = listOf(
                Lesson(
                    id = "u2_l1",
                    title = "Mereka adalah teman-temanku",
                    subtitle = "Kata ganti jamak 们 & Kosakata Teman",
                    grammarNote = "Akhiran 们 (men) digunakan setelah kata ganti orang (我 -> 我们, 你 -> 你们, 他 -> 他们, 她 -> 她们) atau kata benda manusia untuk menunjukkan bentuk jamak.",
                    newWords = listOf(
                        Word("w2_1", "同学", "tóngxué", "Teman sekolah", "Kata benda", "我们是同学。", "Wǒmen shì tóngxué.", "Kami adalah teman sekolah."),
                        Word("w2_2", "朋友", "péngyou", "Teman", "Kata benda", "我们是朋友。", "Wǒmen shì péngyou.", "Kami adalah teman."),
                        Word("w2_3", "们", "men", "Penanda jamak", "Akhiran", "他们不是朋友。", "Tāmen bú shì péngyou.", "Mereka bukan teman."),
                        Word("w2_4", "男朋友", "nánpéngyou", "Pacar (laki-laki)", "Kata benda", "我的男朋友是医生。", "Wǒ de nánpéngyou shì yīshēng.", "Pacar(L) saya adalah dokter."),
                        Word("w2_5", "女朋友", "nǚpéngyou", "Pacar (perempuan)", "Kata benda", "我的女朋友是老师。", "Wǒ de nǚpéngyou shì lǎoshī.", "Pacar(P) saya adalah guru.")
                    ),
                    exercises = stage1Part1Exercises,
                    exercisesPart1 = stage1Part1Exercises,
                    exercisesPart2 = stage1Part2Exercises
                ),
                Lesson(
                    id = "u2_l2",
                    title = "Mereka adalah teman-temanku",
                    subtitle = "Latihan Kosakata Teman & Jamak",
                    grammarNote = "Latihan penguatan kata ganti jamak 们 (men), teman sekolah (同学), dan teman (朋友) dalam dialog sehari-hari.",
                    newWords = listOf(
                        Word("w2_1", "同学", "tóngxué", "Teman sekolah", "Kata benda", "我们是同学。", "Wǒmen shì tóngxué.", "Kami adalah teman sekolah."),
                        Word("w2_2", "朋友", "péngyou", "Teman", "Kata benda", "我们是朋友。", "Wǒmen shì péngyou.", "Kami adalah teman."),
                        Word("w2_3", "们", "men", "Penanda jamak", "Akhiran", "他们不是朋友。", "Tāmen bú shì péngyou.", "Mereka bukan teman.")
                    ),
                    exercises = stage2Part1Exercises,
                    exercisesPart1 = stage2Part1Exercises,
                    exercisesPart2 = stage2Part2Exercises,
                    exercisesPart3 = stage2Part3Exercises
                ),
                Lesson(
                    id = "u2_l3",
                    title = "Siapa ini?",
                    subtitle = "Kata tanya 谁 & Kosakata Kolega / Tetangga",
                    grammarNote = "Kata tanya 谁 (shéi) digunakan untuk menanyakan identitas seseorang. Kata tunjuk 这 (zhè) berarti 'ini' dan 那 (nà) berarti 'itu'.",
                    newWords = listOf(
                        Word("w2_6", "同事", "tóngshì", "Rekan kerja / kolega", "Kata benda", "那是我们的同事。", "Nà shì wǒmen de tóngshì.", "Itu adalah rekan kerja kita."),
                        Word("w2_7", "老板", "lǎobǎn", "Bos / majikan", "Kata benda", "这是老板的朋友。", "Zhè shì lǎobǎn de péngyou.", "Ini adalah teman bos."),
                        Word("w2_8", "这", "zhè", "Ini", "Kata tunjuk", "这是我的朋友。", "Zhè shì wǒ de péngyou.", "Ini adalah teman saya."),
                        Word("w2_9", "那", "nà", "Itu", "Kata tunjuk", "那是谁？", "Nà shì shéi?", "Itu siapa?"),
                        Word("w2_10", "谁", "shéi", "Siapa", "Kata tanya", "王飞是谁？", "WángFēi shì shéi?", "Siapa Wang Fei?"),
                        Word("w2_11", "邻居", "línjū", "Tetangga", "Kata benda", "你的邻居是谁？", "Nǐ de línjū shì shéi?", "Siapa tetanggamu?"),
                        Word("w2_12", "网友", "wǎngyǒu", "Teman online", "Kata benda", "这是我的网友。", "Zhè shì wǒ de wǎngyǒu.", "Ini adalah teman online saya."),
                        Word("w2_13", "室友", "shìyǒu", "Teman sekamar", "Kata benda", "我的室友是中国人。", "Wǒ de shìyǒu shì Zhōngguó rén.", "Teman sekamar saya adalah orang Tiongkok.")
                    ),
                    exercises = stage3Part1Exercises,
                    exercisesPart1 = stage3Part1Exercises,
                    exercisesPart2 = stage3Part2Exercises
                ),
                Lesson(
                    id = "u2_l4",
                    title = "Siapa ini?",
                    subtitle = "Latihan Kosakata Identitas & Hubungan",
                    grammarNote = "Latihan komprehensif struktur kalimat kepemilikan 的, kata tunjuk 这 / 那, dan kata tanya 谁.",
                    newWords = listOf(
                        Word("w2_6", "同事", "tóngshì", "Rekan kerja / kolega", "Kata benda", "那是我们的同事。", "Nà shì wǒmen de tóngshì.", "Itu adalah rekan kerja kita."),
                        Word("w2_7", "老板", "lǎobǎn", "Bos / majikan", "Kata benda", "这是老板的朋友。", "Zhè shì lǎobǎn de péngyou.", "Ini adalah teman bos."),
                        Word("w2_11", "邻居", "línjū", "Tetangga", "Kata benda", "你的邻居是谁？", "Nǐ de línjū shì shéi?", "Siapa tetanggamu?"),
                        Word("w2_13", "室友", "shìyǒu", "Teman sekamar", "Kata benda", "我的室友是中国人。", "Wǒ de shìyǒu shì Zhōngguó rén.", "Teman sekamar saya adalah orang Tiongkok.")
                    ),
                    exercises = stage4Part1Exercises,
                    exercisesPart1 = stage4Part1Exercises,
                    exercisesPart2 = stage4Part2Exercises,
                    exercisesPart3 = stage4Part3Exercises
                ),
                Lesson(
                    id = "u2_l5",
                    title = "Latihan Komprehensif",
                    subtitle = "Review Seluruh Kosakata & Dialog Bab 2",
                    grammarNote = "Uji pemahaman gabungan bentuk jamak 们, kata ganti kepemilikan 的, kata tunjuk 这/那, kata tanya 谁/吗, dan seluruh kosakata hubungan.",
                    newWords = listOf(
                        Word("w2_1", "同学", "tóngxué", "Teman sekolah", "Kata benda", "我们是同学。", "Wǒmen shì tóngxué.", "Kami adalah teman sekolah."),
                        Word("w2_2", "朋友", "péngyou", "Teman", "Kata benda", "我们是朋友。", "Wǒmen shì péngyou.", "Kami adalah teman."),
                        Word("w2_6", "同事", "tóngshì", "Rekan kerja", "Kata benda", "她们是我的同事。", "Tāmen shì wǒ de tóngshì.", "Mereka adalah rekan kerja saya."),
                        Word("w2_11", "邻居", "línjū", "Tetangga", "Kata benda", "我们是邻居。", "Wǒmen shì línjū.", "Kami adalah tetangga."),
                        Word("w2_13", "室友", "shìyǒu", "Teman sekamar", "Kata benda", "这是我的室友。", "Zhè shì wǒ de shìyǒu.", "Ini adalah teman sekamarku.")
                    ),
                    exercises = stage5Part1Exercises,
                    exercisesPart1 = stage5Part1Exercises,
                    exercisesPart2 = stage5Part2Exercises
                )
            )
        ),

        // BAB 3: Angka, Kuantitas & Berhitung Dasar (数字、数量与基数)
        UnitCourse(
            id = "unit_3",
            unitNumber = 3,
            title = "Angka & Kuantitas",
            subtitle = "Sistem bilangan 0 - 9999, satuan 个, kuantitas, uang, dan umur",
            bannerTitle = "Angka & Berhitung",
            emoji = "🔢",
            level = "Level 3",
            story = stories[2],
            nodes = listOf(
                PathNode("u3_n1", "Angka 1 - 10", Color(0xFFFFC107), NodeIconType.CAP, isCompleted = false, lessonId = "u3_l1"),
                PathNode("u3_n2", "Puluhan & Ratusan", Color(0xFFFFC107), NodeIconType.DUMBBELL, isCompleted = false, lessonId = "u3_l2"),
                PathNode("u3_n3", "Berapa & Uang", Color(0xFFFFC107), NodeIconType.CAP, isCompleted = false, lessonId = "u3_l3"),
                PathNode("u3_n4", "Berapa Umurmu?", Color(0xFFFFC107), NodeIconType.DUMBBELL, isCompleted = false, lessonId = "u3_l4"),
                PathNode("u3_n5", "Latihan Komprehensif", Color(0xFFFFC107), NodeIconType.SHUFFLE, isCompleted = false, lessonId = "u3_l5"),
                PathNode("u3_n6", "Kuis Cerita", Color(0xFFFFC107), NodeIconType.BOOK, isCompleted = false, lessonId = "u3_l1"),
                PathNode("u3_n7", "Checkpoint Bab", Color(0xFFFFB300), NodeIconType.CHEST, isCompleted = false, lessonId = "u3_l1"),
                PathNode("u3_n8", "Rest area", Color(0xFF03A9F4), NodeIconType.REST_AREA, isCompleted = false, lessonId = "u3_l1")
            ),
            lessons = listOf(
                Lesson(
                    id = "u3_l1",
                    title = "Angka 1 - 10",
                    subtitle = "Angka dasar & Satuan 个",
                    grammarNote = "Satuan penggolong 个 (gè) digunakan setelah angka dan sebelum kata benda orang/benda umum. Rumus: Angka + 个 + Kata Benda (一个人 = satu orang, 三个学生 = tiga murid).",
                    newWords = listOf(
                        Word("w3_1", "一", "yī", "Satu", "Angka", "一个人。", "Yí gè rén.", "Satu orang."),
                        Word("w3_2", "二", "èr", "Dua", "Angka", "二、三、四。", "Èr, sān, sì.", "Dua, tiga, empat."),
                        Word("w3_3", "三", "sān", "Tiga", "Angka", "三个朋友。", "Sān gè péngyou.", "Tiga orang teman."),
                        Word("w3_4", "四", "sì", "Empat", "Angka", "四个老师。", "Sì gè lǎoshī.", "Empat orang guru."),
                        Word("w3_5", "五", "wǔ", "Lima", "Angka", "五个人。", "Wǔ gè rén.", "Lima orang."),
                        Word("w3_6", "个", "gè", "Buah / Orang (satuan)", "Satuan", "一个学生。", "Yí gè xuéshēng.", "Seorang murid.")
                    ),
                    exercises = bab3Stage1Part1Exercises,
                    exercisesPart1 = bab3Stage1Part1Exercises,
                    exercisesPart2 = bab3Stage1Part2Exercises
                ),
                Lesson(
                    id = "u3_l2",
                    title = "Puluhan, Ratusan & Ribuan",
                    subtitle = "Sistem puluhan & Perbedaan 两 vs 二",
                    grammarNote = "二 (èr) digunakan untuk menghitung nomor urut dan matematika. 两 (liǎng) wajib digunakan di depan kata penggolong kuantitas (两个, 两百, 两千).",
                    newWords = listOf(
                        Word("w3_7", "两", "liǎng", "Dua (kuantitas)", "Angka", "两个人。", "Liǎng gè rén.", "Dua orang."),
                        Word("w3_8", "零", "líng", "Nol", "Angka", "一百零五。", "Yìbǎi líng wǔ.", "Seratus lima."),
                        Word("w3_9", "百", "bǎi", "Ratus", "Angka", "一百个学生。", "Yìbǎi gè xuéshēng.", "Seratus orang murid."),
                        Word("w3_10", "千", "qiān", "Ribu", "Angka", "一千个人。", "Yìqiān gè rén.", "Seribu orang.")
                    ),
                    exercises = bab3Stage2Part1Exercises,
                    exercisesPart1 = bab3Stage2Part1Exercises,
                    exercisesPart2 = bab3Stage2Part2Exercises
                ),
                Lesson(
                    id = "u3_l3",
                    title = "Kata Tanya Kuantitas & Uang",
                    subtitle = "Kata tanya 几 vs 多少 & Mata uang 块/元",
                    grammarNote = "几 (jǐ) untuk menanyakan kuantitas kecil (<10) dan diikuti satuan (几个). 多少 (duōshao) untuk kuantitas umum/besar (多少钱？). 块 (kuài) adalah yuan lisan, 元 (yuán) adalah yuan tulisan.",
                    newWords = listOf(
                        Word("w3_11", "几", "jǐ", "Berapa (< 10)", "Kata tanya", "你有几个朋友？", "Nǐ yǒu jǐ gè péngyou?", "Kamu punya berapa teman?"),
                        Word("w3_12", "多少", "duōshao", "Berapa banyak", "Kata tanya", "这个多少钱？", "Zhège duōshao qián?", "Ini berapa harganya?"),
                        Word("w3_13", "块", "kuài", "Yuan (uang lisan)", "Satuan", "五块钱。", "Wǔ kuài qián.", "Lima yuan."),
                        Word("w3_14", "元", "yuán", "Yuan (uang resmi)", "Satuan", "二十元。", "Èrshí yuán.", "Dua puluh yuan.")
                    ),
                    exercises = bab3Stage3Part1Exercises,
                    exercisesPart1 = bab3Stage3Part1Exercises,
                    exercisesPart2 = bab3Stage3Part2Exercises
                ),
                Lesson(
                    id = "u3_l4",
                    title = "Menanyakan Umur & Usia",
                    subtitle = "Pola usia: 几岁 / 多大 / 岁",
                    grammarNote = "Menanyakan anak kecil (<10 tahun): 你几岁？. Menanyakan orang dewasa: 你多大？ / 你今年多大？. Menyatakan usia: Subjek + Angka + 岁 (我二十岁).",
                    newWords = listOf(
                        Word("w3_15", "岁", "suì", "Tahun (umur)", "Satuan", "我二十岁。", "Wǒ èrshí suì.", "Saya berumur dua puluh tahun."),
                        Word("w3_16", "今年", "jīnnián", "Tahun ini", "Waktu", "他今年多大？", "Tā jīnnián duō dà?", "Berapa usianya tahun ini?")
                    ),
                    exercises = bab3Stage4Part1Exercises,
                    exercisesPart1 = bab3Stage4Part1Exercises,
                    exercisesPart2 = bab3Stage4Part2Exercises
                ),
                Lesson(
                    id = "u3_l5",
                    title = "Latihan Komprehensif Bab 3",
                    subtitle = "Review seluruh 20 kosakata angka & kuantitas",
                    grammarNote = "Uji pemahaman komprehensif angka 1-9999, satuan 个, kuantitas 几/多少, harga 块/元, dan usia 岁.",
                    newWords = listOf(
                        Word("w3_1", "一", "yī", "Satu", "Angka", "一个人。", "Yí gè rén.", "Satu orang."),
                        Word("w3_7", "两", "liǎng", "Dua (kuantitas)", "Angka", "两块钱。", "Liǎng kuài qián.", "Dua yuan uang."),
                        Word("w3_12", "多少", "duōshao", "Berapa banyak", "Kata tanya", "这个多少钱？", "Zhège duōshao qián?", "Ini berapa harganya?"),
                        Word("w3_15", "岁", "suì", "Tahun (umur)", "Satuan", "王飞二十岁。", "WángFēi èrshí suì.", "Wang Fei berumur dua puluh tahun.")
                    ),
                    exercises = bab3Stage5Part1Exercises,
                    exercisesPart1 = bab3Stage5Part1Exercises,
                    exercisesPart2 = bab3Stage5Part2Exercises
                )
            )
        ),

        // BAB 4: Waktu, Tanggal & Kalender (时间、日期与日历)
        UnitCourse(
            id = "unit_4",
            unitNumber = 4,
            title = "Waktu & Kalender",
            subtitle = "Membaca kalender, jam analog, janji temu, dan durasi",
            bannerTitle = "Waktu, Tanggal & Kalender",
            emoji = "📅",
            level = "Level 4",
            story = stories[3],
            nodes = listOf(
                PathNode("u4_n1", "Hari & Pekan", Color(0xFFFFC107), NodeIconType.CAP, isCompleted = false, lessonId = "u4_l1"),
                PathNode("u4_n2", "Tanggal & Bulan", Color(0xFFFFC107), NodeIconType.DUMBBELL, isCompleted = false, lessonId = "u4_l2"),
                PathNode("u4_n3", "Jam & Menit", Color(0xFFFFC107), NodeIconType.CAP, isCompleted = false, lessonId = "u4_l3"),
                PathNode("u4_n4", "Durasi & Waktu", Color(0xFFFFC107), NodeIconType.DUMBBELL, isCompleted = false, lessonId = "u4_l4"),
                PathNode("u4_n5", "Janji Temu", Color(0xFFFFC107), NodeIconType.CAP, isCompleted = false, lessonId = "u4_l5"),
                PathNode("u4_n6", "Evaluasi Kalender", Color(0xFFFFC107), NodeIconType.SHUFFLE, isCompleted = false, lessonId = "u4_l6"),
                PathNode("u4_n7", "Kuis Cerita", Color(0xFFFFC107), NodeIconType.BOOK, isCompleted = false, lessonId = "u4_l1"),
                PathNode("u4_n8", "Checkpoint Bab", Color(0xFFFFB300), NodeIconType.CHEST, isCompleted = false, lessonId = "u4_l1"),
                PathNode("u4_n9", "Rest area", Color(0xFF03A9F4), NodeIconType.REST_AREA, isCompleted = false, lessonId = "u4_l1")
            ),
            lessons = listOf(
                Lesson(
                    id = "u4_l1",
                    title = "Hari & Pekan",
                    subtitle = "Hari ini, besok, kemarin, dan 星期",
                    grammarNote = "Nama hari dibentuk dari 星期 + Angka 1-6 (星期一 = Senin ... 星期六 = Sabtu). Khusus hari Minggu adalah 星期天 atau 星期日.",
                    newWords = listOf(
                        Word("w4_1", "今天", "jīntiān", "Hari ini", "Waktu", "今天是星期一。", "Jīntiān shì xīngqīyī.", "Hari ini adalah hari Senin."),
                        Word("w4_2", "明天", "míngtiān", "Besok", "Waktu", "明天是星期二。", "Míngtiān shì xīngqī'èr.", "Besok adalah hari Selasa."),
                        Word("w4_3", "昨天", "zuótiān", "Kemarin", "Waktu", "昨天是星期天。", "Zuótiān shì xīngqītiān.", "Kemarin adalah hari Minggu."),
                        Word("w4_4", "星期", "xīngqī", "Minggu / pekan", "Waktu", "今天星期几？", "Jīntiān xīngqī jǐ?", "Hari ini hari apa?"),
                        Word("w4_5", "星期天", "xīngqītiān", "Hari Minggu", "Waktu", "星期天见。", "Xīngqītiān jiàn.", "Sampai jumpa hari Minggu.")
                    ),
                    exercises = bab4Stage1Part1Exercises,
                    exercisesPart1 = bab4Stage1Part1Exercises,
                    exercisesPart2 = bab4Stage1Part2Exercises
                ),
                Lesson(
                    id = "u4_l2",
                    title = "Tanggal & Bulan",
                    subtitle = "Format tanggal makro ke mikro: 年 - 月 - 日/号",
                    grammarNote = "Format kalender Mandarin selalu dari unit terbesar ke terkecil: Tahun (年) -> Bulan (月) -> Tanggal (号/日). Contoh: 2024年10月5号.",
                    newWords = listOf(
                        Word("w4_6", "年", "nián", "Tahun", "Waktu", "今年是二零二四年。", "Jīnnián shì èrlíng'èrsìnián.", "Tahun ini adalah tahun 2024."),
                        Word("w4_7", "今年", "jīnnián", "Tahun ini", "Waktu", "今年很好。", "Jīnnián hěn hǎo.", "Tahun ini sangat baik."),
                        Word("w4_8", "明年", "míngnián", "Tahun depan", "Waktu", "明年我去中国。", "Míngnián wǒ qù Zhōngguó.", "Tahun depan saya pergi ke Tiongkok."),
                        Word("w4_9", "去年", "qùnián", "Tahun lalu", "Waktu", "去年他是学生。", "Qùnián tā shì xuéshēng.", "Tahun lalu dia adalah murid."),
                        Word("w4_10", "月", "yuè", "Bulan", "Waktu", "今天几月几号？", "Jīntiān jǐ yuè jǐ hào?", "Hari ini tanggal berapa?"),
                        Word("w4_11", "号", "hào", "Nomor / tanggal", "Waktu", "十月五号。", "Shíyuè wǔhào.", "Tanggal 5 Oktober.")
                    ),
                    exercises = bab4Stage2Part1Exercises,
                    exercisesPart1 = bab4Stage2Part1Exercises,
                    exercisesPart2 = bab4Stage2Part2Exercises
                ),
                Lesson(
                    id = "u4_l3",
                    title = "Jam Analog & Menit",
                    subtitle = "Menanyakan waktu: 现在几点？ dan penggunaan 半",
                    grammarNote = "Pukul jam: Angka + 点 (diǎn). Menit: Angka + 分 (fēn). Setengah jam (30 menit): 半 (bàn). Contoh: 两点半 (02:30), 九点十分 (09:10).",
                    newWords = listOf(
                        Word("w4_12", "现在", "xiànzài", "Sekarang", "Waktu", "现在几点？", "Xiànzài jǐ diǎn?", "Sekarang jam berapa?"),
                        Word("w4_13", "点", "diǎn", "Jam (pukul)", "Waktu", "现在八点。", "Xiànzài bā diǎn.", "Sekarang jam delapan."),
                        Word("w4_14", "分", "fēn", "Menit", "Waktu", "九点十分。", "Jiǔ diǎn shí fēn.", "Jam 09:10."),
                        Word("w4_15", "半", "bàn", "Setengah / separuh", "Waktu", "十点半。", "Shí diǎn bàn.", "Jam 10:30.")
                    ),
                    exercises = bab4Stage3Part1Exercises,
                    exercisesPart1 = bab4Stage3Part1Exercises,
                    exercisesPart2 = bab4Stage3Part2Exercises
                ),
                Lesson(
                    id = "u4_l4",
                    title = "Durasi & Konsep Waktu",
                    subtitle = "Durasi jam 小时, waktu 时间, dan 什么时候",
                    grammarNote = "Durasi: Angka + 个 + 小时 (一个小时 = 1 jam). Menanyakan kapan: 什么时候 (shénme shíhou). Contoh: 你什么时候去？ (Kapan kamu pergi?).",
                    newWords = listOf(
                        Word("w4_16", "小时", "xiǎoshí", "Jam (durasi)", "Waktu", "一个小时。", "Yí gè xiǎoshí.", "Satu jam."),
                        Word("w4_17", "时间", "shíjiān", "Waktu", "Waktu", "我有时间。", "Wǒ yǒu shíjiān.", "Saya punya waktu."),
                        Word("w4_18", "时候", "shíhou", "Saat / waktu", "Waktu", "什么时候？", "Shénme shíhou?", "Kapan?"),
                        Word("w4_19", "分钟", "fēnzhōng", "Menit (durasi)", "Waktu", "五分钟。", "Wǔ fēnzhōng.", "Lima menit.")
                    ),
                    exercises = bab4Stage4Part1Exercises,
                    exercisesPart1 = bab4Stage4Part1Exercises,
                    exercisesPart2 = bab4Stage4Part2Exercises
                ),
                Lesson(
                    id = "u4_l5",
                    title = "Janji Temu & Jadwal",
                    subtitle = "Pola Waktu + 见 (Sampai jumpa...)",
                    grammarNote = "Pola membuat janji temu: Waktu + 见 (jiàn). Contoh: 明天见 (sampai jumpa besok), 三点见 (jumpa jam 3), 星期天见 (jumpa hari Minggu).",
                    newWords = listOf(
                        Word("w4_20", "见", "jiàn", "Bertemu / melihat", "Kata kerja", "明天见。", "Míngtiān jiàn.", "Sampai jumpa besok."),
                        Word("w4_21", "再见", "zàijiàn", "Selamat tinggal", "Ungkapan", "老师再见。", "Lǎoshī zàijiàn.", "Selamat tinggal guru.")
                    ),
                    exercises = bab4Stage5Part1Exercises,
                    exercisesPart1 = bab4Stage5Part1Exercises,
                    exercisesPart2 = bab4Stage5Part2Exercises
                ),
                Lesson(
                    id = "u4_l6",
                    title = "Evaluasi Komprehensif Kalender",
                    subtitle = "Review 21 kosakata waktu, tanggal & kalender",
                    grammarNote = "Uji pemahaman komprehensif seluruh 21 kosakata Bab 4: hari dalam sepekan, tanggal & bulan kalender, pembacaan jam, durasi, dan janji temu.",
                    newWords = listOf(
                        Word("w4_1", "今天", "jīntiān", "Hari ini", "Waktu", "今天星期几？", "Jīntiān xīngqī jǐ?", "Hari ini hari apa?"),
                        Word("w4_12", "现在", "xiànzài", "Sekarang", "Waktu", "现在几点？", "Xiànzài jǐ diǎn?", "Sekarang jam berapa?"),
                        Word("w4_18", "时候", "shíhou", "Saat / waktu", "Waktu", "什么时候见？", "Shénme shíhou jiàn?", "Kapan kita bertemu?"),
                        Word("w4_20", "见", "jiàn", "Bertemu", "Kata kerja", "明天见。", "Míngtiān jiàn.", "Sampai jumpa besok.")
                    ),
                    exercises = bab4Stage6Part1Exercises,
                    exercisesPart1 = bab4Stage6Part1Exercises,
                    exercisesPart2 = bab4Stage6Part2Exercises
                )
            )
        ),

        // BAB 5: Aktivitas Harian: Pagi Hingga Malam (从早到晚的日常作息)
        UnitCourse(
            id = "unit_5",
            unitNumber = 5,
            title = "Aktivitas Harian",
            subtitle = "Rutinitas bangun, sarapan, bekerja, hingga tidur malam",
            bannerTitle = "Aktivitas Pagi Hingga Malam",
            emoji = "🌅",
            level = "Level 5",
            story = stories[4],
            nodes = listOf(
                PathNode("u5_n1", "Pagi & Malam", Color(0xFFFFC107), NodeIconType.CAP, isCompleted = false, lessonId = "u5_l1"),
                PathNode("u5_n2", "Bangun & Tidur", Color(0xFFFFC107), NodeIconType.DUMBBELL, isCompleted = false, lessonId = "u5_l2"),
                PathNode("u5_n3", "3 Waktu Makan", Color(0xFFFFC107), NodeIconType.CAP, isCompleted = false, lessonId = "u5_l3"),
                PathNode("u5_n4", "Sedang Berlangsung", Color(0xFFFFC107), NodeIconType.DUMBBELL, isCompleted = false, lessonId = "u5_l4"),
                PathNode("u5_n5", "Evaluasi Harian", Color(0xFFFFC107), NodeIconType.SHUFFLE, isCompleted = false, lessonId = "u5_l5"),
                PathNode("u5_n6", "Kuis Cerita", Color(0xFFFFC107), NodeIconType.BOOK, isCompleted = false, lessonId = "u5_l1"),
                PathNode("u5_n7", "Checkpoint Bab", Color(0xFFFFB300), NodeIconType.CHEST, isCompleted = false, lessonId = "u5_l1"),
                PathNode("u5_n8", "Rest area", Color(0xFF03A9F4), NodeIconType.REST_AREA, isCompleted = false, lessonId = "u5_l1")
            ),
            lessons = listOf(
                Lesson(
                    id = "u5_l1",
                    title = "Pagi, Siang & Malam",
                    subtitle = "Pembagian waktu dalam sehari dan salam sapaan",
                    grammarNote = "Keterangan segmen hari diletakkan sebelum jam: 早上 (pagi), 上午 (pagi menjelang siang), 中午 (siang), 下午 (sore), 晚上 (malam). Contoh: 早上八点 (jam 8 pagi).",
                    newWords = listOf(
                        Word("w5_1", "早上", "zǎoshang", "Pagi", "Waktu", "老师早上好！", "Lǎoshī zǎoshang hǎo!", "Selamat pagi guru!"),
                        Word("w5_2", "早", "zǎo", "Pagi / awal", "Kata sifat", "你来得很早。", "Nǐ lái de hěn zǎo.", "Kamu datang sangat awal."),
                        Word("w5_3", "上午", "shàngwǔ", "Pagi menjelang siang", "Waktu", "上午九点。", "Shàngwǔ jiǔ diǎn.", "Jam 9 pagi."),
                        Word("w5_4", "中午", "zhōngwǔ", "Tengah hari", "Waktu", "中午十二点。", "Zhōngwǔ shí'èr diǎn.", "Jam 12 siang."),
                        Word("w5_5", "下午", "xiàwǔ", "Sore", "Waktu", "下午三点。", "Xiàwǔ sān diǎn.", "Jam 3 sore."),
                        Word("w5_6", "晚上", "wǎnshang", "Malam", "Waktu", "晚上八点。", "Wǎnshang bā diǎn.", "Jam 8 malam."),
                        Word("w5_7", "白天", "báitiān", "Siang hari", "Waktu", "白天他在学校。", "Báitiān tā zài xuéxiào.", "Siang hari dia di sekolah.")
                    ),
                    exercises = bab5Stage1Part1Exercises,
                    exercisesPart1 = bab5Stage1Part1Exercises,
                    exercisesPart2 = bab5Stage1Part2Exercises
                ),
                Lesson(
                    id = "u5_l2",
                    title = "Bangun & Tidur",
                    subtitle = "Kosakata 起床, 睡觉, 睡, dan 休息",
                    grammarNote = "Rumus aktivitas: Subjek + Waktu + Aktivitas. Contoh: 我七点起床 (Saya bangun jam 7), 他十点睡觉 (Dia tidur jam 10). Durasi tidur: 睡 + Angka + 个小时.",
                    newWords = listOf(
                        Word("w5_8", "起床", "qǐchuáng", "Bangun tidur", "Kata kerja", "我七点起床。", "Wǒ qī diǎn qǐchuáng.", "Saya bangun jam 7."),
                        Word("w5_9", "睡觉", "shuìjiào", "Tidur", "Kata kerja", "他十点睡觉。", "Tā shí diǎn shuìjiào.", "Dia tidur jam 10."),
                        Word("w5_10", "睡", "shuì", "Tidur", "Kata kerja", "我睡八个小时。", "Wǒ shuì bā gè xiǎoshí.", "Saya tidur 8 jam."),
                        Word("w5_11", "休息", "xiūxi", "Beristirahat", "Kata kerja", "我想休息。", "Wǒ xiǎng xiūxi.", "Saya ingin istirahat.")
                    ),
                    exercises = bab5Stage2Part1Exercises,
                    exercisesPart1 = bab5Stage2Part1Exercises,
                    exercisesPart2 = bab5Stage2Part2Exercises
                ),
                Lesson(
                    id = "u5_l3",
                    title = "3 Waktu Makan",
                    subtitle = "Sarapan 早饭, Makan Siang 午饭 & Makan Malam 晚饭",
                    grammarNote = "Kata 吃 (chī) berpadu dengan 饭 (fàn): 早饭 (sarapan), 午饭 (makan siang), 晚饭 (makan malam). Pola: 吃 + Makanan. Contoh: 你吃早饭了吗？ (Sudah sarapankah?).",
                    newWords = listOf(
                        Word("w5_12", "早饭", "zǎofàn", "Sarapan", "Makanan", "我吃早饭。", "Wǒ chī zǎofàn.", "Saya makan sarapan."),
                        Word("w5_13", "午饭", "wǔfàn", "Makan siang", "Makanan", "十二点吃午饭。", "Shí'èr diǎn chī wǔfàn.", "Jam 12 makan siang."),
                        Word("w5_14", "晚饭", "wǎnfàn", "Makan malam", "Makanan", "晚上七点吃晚饭。", "Wǎnshang qī diǎn chī wǎnfàn.", "Jam 7 malam makan malam.")
                    ),
                    exercises = bab5Stage3Part1Exercises,
                    exercisesPart1 = bab5Stage3Part1Exercises,
                    exercisesPart2 = bab5Stage3Part2Exercises
                ),
                Lesson(
                    id = "u5_l4",
                    title = "Sedang Berlangsung",
                    subtitle = "Aspek progresif 正在 / 在 dan durasi sejenak 一下",
                    grammarNote = "Aspek aksi sedang berlangsung: Subjek + 正在 / 在 + Kata Kerja. Contoh: 我正在吃饭 (Saya sedang makan). Bentuk tindakan sejenak: Kata Kerja + 一下 (休息一下 = istirahat sebentar, 看一下 = lihat sebentar).",
                    newWords = listOf(
                        Word("w5_15", "正在", "zhèngzài", "Sedang dalam proses", "Keterangan", "我正在看书。", "Wǒ zhèngzài kànshū.", "Saya sedang membaca buku."),
                        Word("w5_16", "在", "zài", "Di / sedang", "Keterangan", "你在做什么？", "Nǐ zài zuò shénme?", "Kamu sedang apa?"),
                        Word("w5_17", "一下", "yíxià", "Sebentar / sejenak", "Keterangan", "休息一下吧。", "Xiūxi yíxià ba.", "Istirahatlah sebentar.")
                    ),
                    exercises = bab5Stage4Part1Exercises,
                    exercisesPart1 = bab5Stage4Part1Exercises,
                    exercisesPart2 = bab5Stage4Part2Exercises
                ),
                Lesson(
                    id = "u5_l5",
                    title = "Evaluasi Rutinitas Harian",
                    subtitle = "Review 18 kosakata rutinitas dari pagi hingga malam",
                    grammarNote = "Evaluasi terpadu: menyusun narasi rutinitas harian dari bangun pagi, sarapan, belajar/bekerja, makan siang, hingga istirahat dan tidur malam.",
                    newWords = listOf(
                        Word("w5_1", "早上", "zǎoshang", "Pagi", "Waktu", "早上好！", "Zǎoshang hǎo!", "Selamat pagi!"),
                        Word("w5_8", "起床", "qǐchuáng", "Bangun", "Kata kerja", "七点起床。", "Qī diǎn qǐchuáng.", "Bangun jam 7."),
                        Word("w5_12", "早饭", "zǎofàn", "Sarapan", "Makanan", "吃早饭。", "Chī zǎofàn.", "Makan sarapan."),
                        Word("w5_15", "正在", "zhèngzài", "Sedang", "Keterangan", "正在做什么？", "Zhèngzài zuò shénme?", "Sedang melakukan apa?"),
                        Word("w5_9", "睡觉", "shuìjiào", "Tidur", "Kata kerja", "十点睡觉。", "Shí diǎn shuìjiào.", "Tidur jam 10.")
                    ),
                    exercises = bab5Stage5Part1Exercises,
                    exercisesPart1 = bab5Stage5Part1Exercises,
                    exercisesPart2 = bab5Stage5Part2Exercises
                )
            )
        ),

        // BAB 6: Keluarga & Kehangatan Rumah (家庭成员与温馨居所)
        UnitCourse(
            id = "unit_6",
            unitNumber = 6,
            title = "Keluarga & Rumah",
            subtitle = "Orang tua, saudara, anak, tempat tinggal, dan perabot kamar",
            bannerTitle = "Keluarga & Kehangatan Rumah",
            emoji = "🏡",
            level = "Level 6",
            story = stories[5],
            nodes = listOf(
                PathNode("u6_n1", "Orang Tua & Saudara", Color(0xFFFFC107), NodeIconType.CAP, isCompleted = false, lessonId = "u6_l1"),
                PathNode("u6_n2", "Anak & Satuan 口", Color(0xFFFFC107), NodeIconType.DUMBBELL, isCompleted = false, lessonId = "u6_l2"),
                PathNode("u6_n3", "Tempat Tinggal 住", Color(0xFFFFC107), NodeIconType.CAP, isCompleted = false, lessonId = "u6_l3"),
                PathNode("u6_n4", "Kamar & Perabot", Color(0xFFFFC107), NodeIconType.DUMBBELL, isCompleted = false, lessonId = "u6_l4"),
                PathNode("u6_n5", "Usia & Relasi", Color(0xFFFFC107), NodeIconType.CAP, isCompleted = false, lessonId = "u6_l5"),
                PathNode("u6_n6", "Evaluasi Rumah", Color(0xFFFFC107), NodeIconType.SHUFFLE, isCompleted = false, lessonId = "u6_l6"),
                PathNode("u6_n7", "Kuis Cerita", Color(0xFFFFC107), NodeIconType.BOOK, isCompleted = false, lessonId = "u6_l1"),
                PathNode("u6_n8", "Checkpoint Bab", Color(0xFFFFB300), NodeIconType.CHEST, isCompleted = false, lessonId = "u6_l1"),
                PathNode("u6_n9", "Rest area", Color(0xFF03A9F4), NodeIconType.REST_AREA, isCompleted = false, lessonId = "u6_l1")
            ),
            lessons = listOf(
                Lesson(
                    id = "u6_l1",
                    title = "Orang Tua & Saudara Kandung",
                    subtitle = "Ayah, ibu, kakak, dan adik",
                    grammarNote = "Menyatakan kepemilikan keluarga: '我 + Anggota Keluarga' (de bisa dihilangkan untuk keluarga dekat: 我爸爸, 我妈妈). Pola kepunyaan: 有 (punya) vs 没有 (tidak punya).",
                    newWords = listOf(
                        Word("w6_1", "爸爸", "bàba", "Ayah", "Keluarga", "这是我爸爸。", "Zhè shì wǒ bàba.", "Ini adalah ayah saya."),
                        Word("w6_2", "妈妈", "māma", "Ibu", "Keluarga", "我爱爸爸妈妈。", "Wǒ ài bàba māma.", "Saya menyayangi ayah dan ibu."),
                        Word("w6_3", "哥哥", "gēge", "Kakak laki-laki", "Keluarga", "他是我哥哥。", "Tā shì wǒ gēge.", "Dia adalah kakak laki-laki saya."),
                        Word("w6_4", "姐姐", "jiějie", "Kakak perempuan", "Keluarga", "那是我姐姐。", "Nà shì wǒ jiějie.", "Itu adalah kakak perempuan saya."),
                        Word("w6_5", "弟弟", "dìdi", "Adik laki-laki", "Keluarga", "他有两个弟弟。", "Tā yǒu liǎng gè dìdi.", "Dia punya dua adik laki-laki."),
                        Word("w6_6", "妹妹", "mèimei", "Adik perempuan", "Keluarga", "我有一个妹妹。", "Wǒ yǒu yí gè mèimei.", "Saya punya seorang adik perempuan.")
                    ),
                    exercises = bab6Stage1Part1Exercises,
                    exercisesPart1 = bab6Stage1Part1Exercises,
                    exercisesPart2 = bab6Stage1Part2Exercises
                ),
                Lesson(
                    id = "u6_l2",
                    title = "Anak & Kuantitas Anggota Keluarga",
                    subtitle = "Anak laki-laki, anak perempuan, dan kata bantu 口",
                    grammarNote = "Satuan penggolong anggota keluarga: 口 (kǒu). Rumus: Subjek + 家 + 有 + Angka + 口 + 人 (我家有四口人). Menanyakan jumlah anggota: 你家有几口人？.",
                    newWords = listOf(
                        Word("w6_7", "儿子", "érzi", "Anak laki-laki", "Keluarga", "他是我儿子。", "Tā shì wǒ érzi.", "Dia adalah anak laki-laki saya."),
                        Word("w6_8", "女儿", "nǚ'ér", "Anak perempuan", "Keluarga", "她是我女儿。", "Tā shì wǒ nǚ'ér.", "Dia adalah anak perempuan saya."),
                        Word("w6_9", "孩子", "háizi", "Anak", "Keluarga", "你有几个孩子？", "Nǐ yǒu jǐ gè háizi?", "Kamu punya berapa anak?"),
                        Word("w6_10", "小朋友", "xiǎopéngyǒu", "Anak kecil / teman kecil", "Keluarga", "小朋友们好！", "Xiǎopéngyǒumen hǎo!", "Halo anak-anak!"),
                        Word("w6_11", "口", "kǒu", "Satuan anggota keluarga", "Satuan", "我家有四口人。", "Wǒjiā yǒu sì kǒu rén.", "Keluarga saya ada 4 orang.")
                    ),
                    exercises = bab6Stage2Part1Exercises,
                    exercisesPart1 = bab6Stage2Part1Exercises,
                    exercisesPart2 = bab6Stage2Part2Exercises
                ),
                Lesson(
                    id = "u6_l3",
                    title = "Rumah & Tempat Tinggal",
                    subtitle = "Kata kerja 住 (tinggal) dan makna 家 (rumah/keluarga)",
                    grammarNote = "Menyatakan domisili tempat tinggal: 'Subjek + 住在 + Tempat' (我住在北京). Menanyakan domisili: '你住在哪儿？' (Kamu tinggal di mana?).",
                    newWords = listOf(
                        Word("w6_12", "家", "jiā", "Rumah / keluarga", "Tempat", "我家很大。", "Wǒjiā hěn dà.", "Rumah saya sangat besar."),
                        Word("w6_13", "家人", "jiārén", "Anggota keluarga", "Keluarga", "我爱我的家人。", "Wǒ ài wǒ de jiārén.", "Saya menyayangi keluarga saya."),
                        Word("w6_14", "住", "zhù", "Tinggal / menetap", "Kata kerja", "你住在哪儿？", "Nǐ zhù zài nǎr?", "Kamu tinggal di mana?")
                    ),
                    exercises = bab6Stage3Part1Exercises,
                    exercisesPart1 = bab6Stage3Part1Exercises,
                    exercisesPart2 = bab6Stage3Part2Exercises
                ),
                Lesson(
                    id = "u6_l4",
                    title = "Kamar & Perabot Rumah",
                    subtitle = "Ruangan 房间, meja 桌子, dan kursi 椅子",
                    grammarNote = "Struktur keberadaan di dalam ruang: 'Tempat/Ruang + 里 + 有 + Benda' (房间里有桌子和椅子). Letak di atas permukaan: 'Benda + 上' (桌子上).",
                    newWords = listOf(
                        Word("w6_15", "房间", "fángjiān", "Kamar / ruangan", "Benda", "这是我的房间。", "Zhè shì wǒ de fángjiān.", "Ini adalah kamar saya."),
                        Word("w6_16", "桌子", "zhuōzi", "Meja", "Benda", "书在桌子上。", "Shū zài zhuōzi shang.", "Buku ada di atas meja."),
                        Word("w6_17", "椅子", "yǐzi", "Kursi", "Benda", "他坐在椅子上。", "Tā zuò zài yǐzi shang.", "Dia duduk di kursi.")
                    ),
                    exercises = bab6Stage4Part1Exercises,
                    exercisesPart1 = bab6Stage4Part1Exercises,
                    exercisesPart2 = bab6Stage4Part2Exercises
                ),
                Lesson(
                    id = "u6_l5",
                    title = "Usia & Relasi Keluarga",
                    subtitle = "Menyatakan usia anggota keluarga dengan 岁",
                    grammarNote = "Pola usia anggota keluarga: 'Subjek + 今年 + Angka + 岁' (我哥哥今年二十岁). Pertanyaan usia anak: 几岁 (jǐ suì). Pertanyaan usia dewasa: 多大 (duō dà).",
                    newWords = listOf(
                        Word("w6_18", "岁", "suì", "Tahun (umur)", "Satuan", "我妹妹八岁。", "Wǒ mèimei bā suì.", "Adik perempuan saya 8 tahun."),
                        Word("w6_1", "爸爸", "bàba", "Ayah", "Keluarga", "你爸爸今年多大？", "Nǐ bàba jīnnián duō dà?", "Berapa usia ayahmu tahun ini?")
                    ),
                    exercises = bab6Stage5Part1Exercises,
                    exercisesPart1 = bab6Stage5Part1Exercises,
                    exercisesPart2 = bab6Stage5Part2Exercises
                ),
                Lesson(
                    id = "u6_l6",
                    title = "Evaluasi Komprehensif Rumah",
                    subtitle = "Review seluruh 18 kosakata keluarga & tempat tinggal",
                    grammarNote = "Evaluasi komprehensif seluruh materi Bab 6: silsilah keluarga, jumlah anggota keluarga dengan 口, domisili 住, perabot kamar, dan deskripsi usia.",
                    newWords = listOf(
                        Word("w6_12", "家", "jiā", "Rumah", "Tempat", "我家有五口人。", "Wǒjiā yǒu wǔ kǒu rén.", "Keluarga saya ada 5 orang."),
                        Word("w6_13", "家人", "jiārén", "Anggota keluarga", "Keluarga", "我家人住在北京。", "Wǒ jiārén zhù zài Běijīng.", "Keluarga saya tinggal di Beijing."),
                        Word("w6_15", "房间", "fángjiān", "Kamar", "Benda", "房间里有桌子。", "Fángjiān lǐ yǒu zhuōzi.", "Di dalam kamar ada meja."),
                        Word("w6_18", "岁", "suì", "Umur", "Satuan", "哥哥二十岁。", "Gēge èrshí suì.", "Kakak berumur 20 tahun.")
                    ),
                    exercises = bab6Stage6Part1Exercises,
                    exercisesPart1 = bab6Stage6Part1Exercises,
                    exercisesPart2 = bab6Stage6Part2Exercises
                )
            )
        ),

        // BAB 7: Restoran, Makanan & Kuliner Khas (餐厅、美味与中国美食)
        UnitCourse(
            id = "unit_7",
            unitNumber = 7,
            title = "Makanan & Kuliner",
            subtitle = "Memesan makanan di restoran, kuliner khas Tiongkok, dan rasa",
            bannerTitle = "Restoran & Kuliner Khas",
            emoji = "🍜",
            level = "Level 7",
            story = stories[6],
            nodes = listOf(
                PathNode("u7_n1", "Makan & Minum", Color(0xFFFFC107), NodeIconType.CAP, isCompleted = false, lessonId = "u7_l1"),
                PathNode("u7_n2", "Nasi, Mie & Roti", Color(0xFFFFC107), NodeIconType.DUMBBELL, isCompleted = false, lessonId = "u7_l2"),
                PathNode("u7_n3", "Bakpao & Pangsit", Color(0xFFFFC107), NodeIconType.CAP, isCompleted = false, lessonId = "u7_l3"),
                PathNode("u7_n4", "Sayur & Buah", Color(0xFFFFC107), NodeIconType.DUMBBELL, isCompleted = false, lessonId = "u7_l4"),
                PathNode("u7_n5", "Pesan di Restoran", Color(0xFFFFC107), NodeIconType.CAP, isCompleted = false, lessonId = "u7_l5"),
                PathNode("u7_n6", "Evaluasi Kuliner", Color(0xFFFFC107), NodeIconType.SHUFFLE, isCompleted = false, lessonId = "u7_l6"),
                PathNode("u7_n7", "Kuis Cerita", Color(0xFFFFC107), NodeIconType.BOOK, isCompleted = false, lessonId = "u7_l1"),
                PathNode("u7_n8", "Checkpoint Bab", Color(0xFFFFB300), NodeIconType.CHEST, isCompleted = false, lessonId = "u7_l1"),
                PathNode("u7_n9", "Rest area", Color(0xFF03A9F4), NodeIconType.REST_AREA, isCompleted = false, lessonId = "u7_l1")
            ),
            lessons = listOf(
                Lesson(
                    id = "u7_l1",
                    title = "Makan & Minum",
                    subtitle = "Kata kerja 吃 dan 喝 serta minuman dasar",
                    grammarNote = "Kata kerja konsumsi: 吃 (makan) dan 喝 (minum). Kata bantu wadah: 杯子 (gelas/cangkir) -> 一杯水 (segelas air), 一杯茶 (secangkir teh).",
                    newWords = listOf(
                        Word("w7_1", "吃", "chī", "Makan", "Kata kerja", "我想吃米饭。", "Wǒ xiǎng chī mǐfàn.", "Saya ingin makan nasi."),
                        Word("w7_2", "喝", "hē", "Minum", "Kata kerja", "我想喝茶。", "Wǒ xiǎng hē chá.", "Saya ingin minum teh."),
                        Word("w7_3", "水", "shuǐ", "Air", "Minuman", "给我一杯水。", "Gěi wǒ yì bēi shuǐ.", "Beri saya segelas air."),
                        Word("w7_4", "茶", "chá", "Teh", "Minuman", "中国茶很好喝。", "Zhōngguó chá hěn hǎohē.", "Teh Tiongkok sangat enak diminum."),
                        Word("w7_5", "牛奶", "niúnǎi", "Susu", "Minuman", "喝一杯牛奶。", "Hē yì bēi niúnǎi.", "Minum segelas susu."),
                        Word("w7_6", "杯子", "bēizi", "Cangkir / gelas", "Benda", "桌子上有杯子。", "Zhuōzi shang yǒu bēizi.", "Di atas meja ada cangkir.")
                    ),
                    exercises = bab7Stage1Part1Exercises,
                    exercisesPart1 = bab7Stage1Part1Exercises,
                    exercisesPart2 = bab7Stage1Part2Exercises
                ),
                Lesson(
                    id = "u7_l2",
                    title = "Nasi, Mie & Roti",
                    subtitle = "Makanan pokok: 米饭, 面条儿, 面包, dan 做饭",
                    grammarNote = "Makanan pokok Mandarin: 米饭 (nasi putih), 面条儿 (mie), 面包 (roti). Aktivitas memasak: 做饭 (zuò fàn) atau 做菜 (zuò cài).",
                    newWords = listOf(
                        Word("w7_7", "米饭", "mǐfàn", "Nasi putih", "Makanan", "我吃米饭。", "Wǒ chī mǐfàn.", "Saya makan nasi putih."),
                        Word("w7_8", "面条儿", "miàntiáor", "Mie", "Makanan", "吃一碗面条儿。", "Chī yì wǎn miàntiáor.", "Makan semangkuk mie."),
                        Word("w7_9", "面包", "miànbāo", "Roti", "Makanan", "早饭吃面包。", "Zǎofàn chī miànbāo.", "Sarapan makan roti."),
                        Word("w7_10", "做饭", "zuò fàn", "Memasak", "Kata kerja", "妈妈在做饭。", "Māma zài zuò fàn.", "Ibu sedang memasak.")
                    ),
                    exercises = bab7Stage2Part1Exercises,
                    exercisesPart1 = bab7Stage2Part1Exercises,
                    exercisesPart2 = bab7Stage2Part2Exercises
                ),
                Lesson(
                    id = "u7_l3",
                    title = "Bakpao & Pangsit Tradisional",
                    subtitle = "Kuliner khas Tiongkok: 包子, 饺子, dan 鸡蛋",
                    grammarNote = "Kuliner tradisional: 包子 (bakpao kukus), 饺子 (pangsit jiaozi). Menghitung jumlah: 两个包子 (dua bakpao), 一个鸡蛋 (sebutir telur).",
                    newWords = listOf(
                        Word("w7_11", "包子", "bāozi", "Bakpao", "Makanan", "我吃两个包子。", "Wǒ chī liǎng gè bāozi.", "Saya makan dua bakpao."),
                        Word("w7_12", "饺子", "jiǎozi", "Pangsit", "Makanan", "中国饺子很好吃。", "Zhōngguó jiǎozi hěn hǎochī.", "Pangsit Tiongkok sangat lezat."),
                        Word("w7_13", "鸡蛋", "jīdàn", "Telur", "Makanan", "吃一个鸡蛋。", "Chī yí gè jīdàn.", "Makan sebutir telur.")
                    ),
                    exercises = bab7Stage3Part1Exercises,
                    exercisesPart1 = bab7Stage3Part1Exercises,
                    exercisesPart2 = bab7Stage3Part2Exercises
                ),
                Lesson(
                    id = "u7_l4",
                    title = "Sayur & Buah-buahan",
                    subtitle = "Kosakata 菜, 水果, 苹果, dan rasa 好吃",
                    grammarNote = "Apresiasi kelezatan rasa makanan: 好吃 (hǎochī = enak dimakan). Apresiasi minuman: 好喝 (hǎohē = enak diminum).",
                    newWords = listOf(
                        Word("w7_14", "菜", "cài", "Sayur / hidangan", "Makanan", "中国菜很好吃。", "Zhōngguó cài hěn hǎochī.", "Masakan Tiongkok sangat enak."),
                        Word("w7_15", "水果", "shuǐguǒ", "Buah-buahan", "Makanan", "我想吃水果。", "Wǒ xiǎng chī shuǐguǒ.", "Saya ingin makan buah."),
                        Word("w7_16", "苹果", "píngguǒ", "Apel", "Makanan", "吃两个苹果。", "Chī liǎng gè píngguǒ.", "Makan dua buah apel."),
                        Word("w7_17", "好吃", "hǎochī", "Enak / lezat", "Kata sifat", "这个菜很好吃。", "Zhège cài hěn hǎochī.", "Masakan ini sangat lezat.")
                    ),
                    exercises = bab7Stage4Part1Exercises,
                    exercisesPart1 = bab7Stage4Part1Exercises,
                    exercisesPart2 = bab7Stage4Part2Exercises
                ),
                Lesson(
                    id = "u7_l5",
                    title = "Memesan di Restoran",
                    subtitle = "Makan di 饭店 dan menyapa 服务员",
                    grammarNote = "Dialog restoran: 服务员 (pelayan), 你想吃什么？ (Kamu ingin makan apa?), 我想吃... (Saya ingin makan...), 这个多少钱？ (Ini berapa harganya?).",
                    newWords = listOf(
                        Word("w7_18", "饭店", "fàndiàn", "Restoran", "Tempat", "去饭店吃饭。", "Qù fàndiàn chīfàn.", "Pergi ke restoran untuk makan."),
                        Word("w7_19", "饭", "fàn", "Nasi / makanan", "Makanan", "吃饭了。", "Chīfàn le.", "Sudah makan.")
                    ),
                    exercises = bab7Stage5Part1Exercises,
                    exercisesPart1 = bab7Stage5Part1Exercises,
                    exercisesPart2 = bab7Stage5Part2Exercises
                ),
                Lesson(
                    id = "u7_l6",
                    title = "Evaluasi Komprehensif Kuliner",
                    subtitle = "Review seluruh 19 kosakata kuliner khas Tiongkok",
                    grammarNote = "Evaluasi komprehensif Bab 7: memesan makanan di restoran, menyebutkan menu pokok dan kuliner tradisional, menanyakan harga dan rasa.",
                    newWords = listOf(
                        Word("w7_18", "饭店", "fàndiàn", "Restoran", "Tempat", "在饭店见。", "Zài fàndiàn jiàn.", "Bertemu di restoran."),
                        Word("w7_12", "饺子", "jiǎozi", "Pangsit", "Makanan", "吃饺子。", "Chī jiǎozi.", "Makan pangsit."),
                        Word("w7_14", "菜", "cài", "Masakan", "Makanan", "中国菜很好吃。", "Zhōngguó cài hěn hǎochī.", "Masakan Tiongkok sangat lezat."),
                        Word("w7_4", "茶", "chá", "Teh", "Minuman", "喝茶。", "Hē chá.", "Minum teh.")
                    ),
                    exercises = bab7Stage6Part1Exercises,
                    exercisesPart1 = bab7Stage6Part1Exercises,
                    exercisesPart2 = bab7Stage6Part2Exercises
                )
            )
        ),

        // BAB 8: Belanja, Toko & Nilai Mata Uang (商场购物与价钱结算)
        UnitCourse(
            id = "unit_8",
            unitNumber = 8,
            title = "Belanja & Uang",
            subtitle = "Membeli barang, pakaian baru, menawar harga, dan satuan uang",
            bannerTitle = "Belanja di Toko & Supermarket",
            emoji = "🛍️",
            level = "Level 8",
            story = stories[7],
            nodes = listOf(
                PathNode("u8_n1", "Jual & Beli", Color(0xFFFFC107), NodeIconType.CAP, isCompleted = false, lessonId = "u8_l1"),
                PathNode("u8_n2", "Mata Uang & Harga", Color(0xFFFFC107), NodeIconType.DUMBBELL, isCompleted = false, lessonId = "u8_l2"),
                PathNode("u8_n3", "Mahal vs Murah", Color(0xFFFFC107), NodeIconType.CAP, isCompleted = false, lessonId = "u8_l3"),
                PathNode("u8_n4", "Pakaian Baru", Color(0xFFFFC107), NodeIconType.DUMBBELL, isCompleted = false, lessonId = "u8_l4"),
                PathNode("u8_n5", "Derajat Kuantitas", Color(0xFFFFC107), NodeIconType.CAP, isCompleted = false, lessonId = "u8_l5"),
                PathNode("u8_n6", "Evaluasi Belanja", Color(0xFFFFC107), NodeIconType.SHUFFLE, isCompleted = false, lessonId = "u8_l6"),
                PathNode("u8_n7", "Kuis Cerita", Color(0xFFFFC107), NodeIconType.BOOK, isCompleted = false, lessonId = "u8_l1"),
                PathNode("u8_n8", "Checkpoint Bab", Color(0xFFFFB300), NodeIconType.CHEST, isCompleted = false, lessonId = "u8_l1"),
                PathNode("u8_n9", "Rest area", Color(0xFF03A9F4), NodeIconType.REST_AREA, isCompleted = false, lessonId = "u8_l1")
            ),
            lessons = listOf(
                Lesson(
                    id = "u8_l1",
                    title = "Jual & Beli di Toko",
                    subtitle = "Kosakata 买, 卖, 商店, 超市, dan 东西",
                    grammarNote = "Pasangan kata transaksi: 买 (mǎi = beli) vs 卖 (mài = jual). Tempat belanja: 商店 (toko) dan 超市 (supermarket). Pola: 去 + Tempat + 买东西.",
                    newWords = listOf(
                        Word("w8_1", "买", "mǎi", "Membeli", "Kata kerja", "我想买东西。", "Wǒ xiǎng mǎi dōngxi.", "Saya ingin membeli barang."),
                        Word("w8_2", "卖", "mài", "Menjual", "Kata kerja", "这个店不卖苹果。", "Zhège diàn bù mài píngguǒ.", "Toko ini tidak menjual apel."),
                        Word("w8_3", "东西", "dōngxi", "Barang / benda", "Benda", "买很多东西。", "Mǎi hěnduō dōngxi.", "Membeli banyak barang."),
                        Word("w8_4", "商店", "shāngdiàn", "Toko", "Tempat", "去商店买东西。", "Qù shāngdiàn mǎi dōngxi.", "Pergi ke toko membeli barang."),
                        Word("w8_5", "超市", "chāoshì", "Supermarket", "Tempat", "超市很大。", "Chāoshì hěn dà.", "Supermarket sangat besar.")
                    ),
                    exercises = bab8Stage1Part1Exercises,
                    exercisesPart1 = bab8Stage1Part1Exercises,
                    exercisesPart2 = bab8Stage1Part2Exercises
                ),
                Lesson(
                    id = "u8_l2",
                    title = "Mata Uang & Harga",
                    subtitle = "Kosakata 钱, 块, 元, dan 多少钱",
                    grammarNote = "Menanyakan harga: 'Subjek + 多少钱？' (这个多少钱？). Satuan uang lisan: 块 (kuài), tulisan resmi: 元 (yuán). Contoh: 五块钱 (5 yuan).",
                    newWords = listOf(
                        Word("w8_6", "钱", "qián", "Uang", "Benda", "这本书多少钱？", "Zhè běn shū duōshao qián?", "Buku ini berapa harganya?"),
                        Word("w8_7", "块", "kuài", "Yuan (lisan)", "Satuan", "五块钱。", "Wǔ kuài qián.", "Lima yuan."),
                        Word("w8_8", "元", "yuán", "Yuan (resmi)", "Satuan", "五十元。", "Wǔshí yuán.", "Lima puluh yuan."),
                        Word("w8_9", "一共", "yígòng", "Total / semuanya", "Keterangan", "一共二十块。", "Yígòng èrshí kuài.", "Totalnya dua puluh yuan.")
                    ),
                    exercises = bab8Stage2Part1Exercises,
                    exercisesPart1 = bab8Stage2Part1Exercises,
                    exercisesPart2 = bab8Stage2Part2Exercises
                ),
                Lesson(
                    id = "u8_l3",
                    title = "Mahal vs Murah",
                    subtitle = "Kosakata 贵, 便宜, dan pola eksklamasio 太...了",
                    grammarNote = "Penilaian harga: 贵 (mahal) vs 便宜 (murah). Pola eksklamasio intensitas: 太 + Kata Sifat + 了 (太贵了！= Terlalu mahal!). Tawar menawar: 便宜一点儿 (murah sedikit).",
                    newWords = listOf(
                        Word("w8_10", "贵", "guì", "Mahal", "Kata sifat", "这件衣服太贵了！", "Zhè jiàn yīfu tài guì le!", "Pakaian ini terlalu mahal!"),
                        Word("w8_11", "便宜", "piányi", "Murah", "Kata sifat", "这个很便宜。", "Zhège hěn piányi.", "Ini sangat murah."),
                        Word("w8_12", "太", "tài", "Terlalu / amat", "Keterangan", "太贵了，我不买。", "Tài guì le, wǒ bù mǎi.", "Terlalu mahal, saya tidak beli.")
                    ),
                    exercises = bab8Stage3Part1Exercises,
                    exercisesPart1 = bab8Stage3Part1Exercises,
                    exercisesPart2 = bab8Stage3Part2Exercises
                ),
                Lesson(
                    id = "u8_l4",
                    title = "Pakaian Baru & Kata Penggolong",
                    subtitle = "Kosakata 衣服, 穿, 件, dan 新",
                    grammarNote = "Satuan penggolong pakaian: 件 (jiàn). Pola: 'Angka + 件 + 衣服' (一件衣服 = sehelai baju). Kata kerja mengenakan: 穿 (chuān). Sifat baru: 新 (xīn) -> 新衣服.",
                    newWords = listOf(
                        Word("w8_13", "衣服", "yīfu", "Pakaian / baju", "Benda", "我想买衣服。", "Wǒ xiǎng mǎi yīfu.", "Saya ingin membeli pakaian."),
                        Word("w8_14", "穿", "chuān", "Memakai / mengenakan", "Kata kerja", "穿新衣服。", "Chuān xīn yīfu.", "Memakai baju baru."),
                        Word("w8_15", "件", "jiàn", "Helai (pakaian)", "Satuan", "一件新衣服。", "Yí jiàn xīn yīfu.", "Sehelai pakaian baru."),
                        Word("w8_16", "新", "xīn", "Baru", "Kata sifat", "这是新衣服。", "Zhè shì xīn yīfu.", "Ini adalah pakaian baru.")
                    ),
                    exercises = bab8Stage4Part1Exercises,
                    exercisesPart1 = bab8Stage4Part1Exercises,
                    exercisesPart2 = bab8Stage4Part2Exercises
                ),
                Lesson(
                    id = "u8_l5",
                    title = "Derajat Kuantitas Parsial",
                    subtitle = "Perbedaan 一点儿, 有点儿, 一些, dan 一半",
                    grammarNote = "一点儿 diletakkan SETELAH kata kerja/sifat (吃一点儿 = makan sedikit, 便宜一点儿 = lebih murah sedikit). 有点儿 diletakkan SEBELUM kata sifat bernuansa negatif (有点儿贵 = agak mahal, 有点儿大 = agak kebesaran).",
                    newWords = listOf(
                        Word("w8_17", "一点儿", "yìdiǎnr", "Sedikit", "Kuantitas", "吃一点儿水果。", "Chī yìdiǎnr shuǐguǒ.", "Makan sedikit buah."),
                        Word("w8_18", "有点儿", "yǒudiǎnr", "Agak / sedikit", "Keterangan", "这件衣服有点儿贵。", "Zhè jiàn yīfu yǒudiǎnr guì.", "Baju ini agak mahal."),
                        Word("w8_19", "一些", "yìxiē", "Beberapa", "Kuantitas", "买一些东西。", "Mǎi yìxiē dōngxi.", "Membeli beberapa barang."),
                        Word("w8_20", "一半", "yíbàn", "Setengah / separuh", "Angka", "吃了一半。", "Chī le yíbàn.", "Makan setengahnya.")
                    ),
                    exercises = bab8Stage5Part1Exercises,
                    exercisesPart1 = bab8Stage5Part1Exercises,
                    exercisesPart2 = bab8Stage5Part2Exercises
                ),
                Lesson(
                    id = "u8_l6",
                    title = "Evaluasi Komprehensif Belanja",
                    subtitle = "Review seluruh 21 kosakata belanja, toko & nilai mata uang",
                    grammarNote = "Evaluasi menyeluruh Bab 8: transaksi jual beli di toko/supermarket, menanyakan harga dan satuan uang, menilai mahal/murah, membeli pakaian baru, dan penggunaan kuantitas parsial.",
                    newWords = listOf(
                        Word("w8_1", "买", "mǎi", "Membeli", "Kata kerja", "去超市买衣服。", "Qù chāoshì mǎi yīfu.", "Pergi ke supermarket membeli pakaian."),
                        Word("w8_6", "钱", "qián", "Uang", "Benda", "多少钱？", "Duōshao qián?", "Berapa harganya?"),
                        Word("w8_10", "贵", "guì", "Mahal", "Kata sifat", "太贵了！", "Tài guì le!", "Terlalu mahal!"),
                        Word("w8_11", "便宜", "piányi", "Murah", "Kata sifat", "很便宜。", "Hěn piányi.", "Sangat murah."),
                        Word("w8_15", "件", "jiàn", "Helai", "Satuan", "一件新衣服。", "Yí jiàn xīn yīfu.", "Sehelai baju baru.")
                    ),
                    exercises = bab8Stage6Part1Exercises,
                    exercisesPart1 = bab8Stage6Part1Exercises,
                    exercisesPart2 = bab8Stage6Part2Exercises
                )
            )
        ),

        // BAB 9: Posisi, Arah & Menemukan Tempat (空间方位与位置指引)
        UnitCourse(
            id = "unit_9",
            unitNumber = 9,
            title = "Posisi & Lokasi",
            subtitle = "Petunjuk arah, lokasi barang, depan belakang, dan di mana",
            bannerTitle = "Posisi, Arah & Menemukan Tempat",
            emoji = "📍",
            level = "Level 9",
            story = stories[8],
            nodes = listOf(
                PathNode("u9_n1", "Atas, Bawah, Dalam", Color(0xFFFFC107), NodeIconType.CAP, isCompleted = false, lessonId = "u9_l1"),
                PathNode("u9_n2", "Depan & Belakang", Color(0xFFFFC107), NodeIconType.DUMBBELL, isCompleted = false, lessonId = "u9_l2"),
                PathNode("u9_n3", "Di Sini & Di Sana", Color(0xFFFFC107), NodeIconType.CAP, isCompleted = false, lessonId = "u9_l3"),
                PathNode("u9_n4", "Pilihan & Sampai", Color(0xFFFFC107), NodeIconType.DUMBBELL, isCompleted = false, lessonId = "u9_l4"),
                PathNode("u9_n5", "Evaluasi Posisi", Color(0xFFFFC107), NodeIconType.SHUFFLE, isCompleted = false, lessonId = "u9_l5"),
                PathNode("u9_n6", "Kuis Cerita", Color(0xFFFFC107), NodeIconType.BOOK, isCompleted = false, lessonId = "u9_l1"),
                PathNode("u9_n7", "Checkpoint Bab", Color(0xFFFFB300), NodeIconType.CHEST, isCompleted = false, lessonId = "u9_l1"),
                PathNode("u9_n8", "Rest area", Color(0xFF03A9F4), NodeIconType.REST_AREA, isCompleted = false, lessonId = "u9_l1")
            ),
            lessons = listOf(
                Lesson(
                    id = "u9_l1",
                    title = "Atas, Bawah, Dalam & Luar",
                    subtitle = "Kata posisi 上, 下, 里, dan 外边",
                    grammarNote = "Struktur letak keberadaan: 'Benda A + 在 + Benda B + Posisi'. Contoh: 书在桌子上 (Buku di atas meja), 猫在椅子下 (Kucing di bawah kursi), 他在外边 (Dia di luar).",
                    newWords = listOf(
                        Word("w9_1", "上", "shàng", "Atas", "Arah", "书在桌子上。", "Shū zài zhuōzi shang.", "Buku ada di atas meja."),
                        Word("w9_2", "下", "xià", "Bawah", "Arah", "猫在椅子下。", "Māo zài yǐzi xia.", "Kucing ada di bawah kursi."),
                        Word("w9_3", "里", "lǐ", "Dalam", "Arah", "他在房间里。", "Tā zài fángjiān lǐ.", "Dia ada di dalam kamar."),
                        Word("w9_4", "外边", "wàibian", "Luar", "Arah", "孩子在外边。", "Háizi zài wàibian.", "Anak ada di luar.")
                    ),
                    exercises = bab9Stage1Part1Exercises,
                    exercisesPart1 = bab9Stage1Part1Exercises,
                    exercisesPart2 = bab9Stage1Part2Exercises
                ),
                Lesson(
                    id = "u9_l2",
                    title = "Depan & Belakang",
                    subtitle = "Arah 前面 dan 后面",
                    grammarNote = "Posisi relatif: 前面 (depan) dan 后面 (belakang). Rumus: 'Subjek + 在 + Objek + 前面/后面'. Contoh: 他在我前面 (Dia di depan saya), 学校在商店后面 (Sekolah di belakang toko).",
                    newWords = listOf(
                        Word("w9_5", "前", "qián", "Depan", "Arah", "向前看。", "Xiàng qián kàn.", "Melihat ke depan."),
                        Word("w9_6", "前面", "qiánmiàn", "Di depan", "Arah", "火车站就在前面。", "Huǒchēzhàn jiù zài qiánmiàn.", "Stasiun kereta tepat di depan."),
                        Word("w9_7", "后", "hòu", "Belakang", "Arah", "向后走。", "Xiàng hòu zǒu.", "Berjalan ke belakang."),
                        Word("w9_8", "后面", "hòumiàn", "Di belakang", "Arah", "车在后面。", "Chē zài hòumiàn.", "Mobil ada di belakang.")
                    ),
                    exercises = bab9Stage2Part1Exercises,
                    exercisesPart1 = bab9Stage2Part1Exercises,
                    exercisesPart2 = bab9Stage2Part2Exercises
                ),
                Lesson(
                    id = "u9_l3",
                    title = "Di Sini, Di Sana & Di Mana",
                    subtitle = "Triad penunjuk tempat 这儿, 那儿, dan 哪儿",
                    grammarNote = "Triad demonstratif tempat: 这儿 / 这里 (di sini - dekat pembicara), 那儿 / 那里 (di sana - jauh dari pembicara), 哪儿 / 哪里 (di mana? - kata tanya lokasi).",
                    newWords = listOf(
                        Word("w9_9", "这儿", "zhèr", "Di sini", "Lokasi", "我在这儿。", "Wǒ zài zhèr.", "Saya ada di sini."),
                        Word("w9_10", "这里", "zhèlǐ", "Di sini", "Lokasi", "请坐在这里。", "Qǐng zuò zài zhèlǐ.", "Silakan duduk di sini."),
                        Word("w9_11", "那儿", "nàr", "Di sana", "Lokasi", "他在那儿。", "Tā zài nàr.", "Dia ada di sana."),
                        Word("w9_12", "哪儿", "nǎr", "Di mana", "Kata tanya", "你在哪儿？", "Nǐ zài nǎr?", "Kamu ada di mana?")
                    ),
                    exercises = bab9Stage3Part1Exercises,
                    exercisesPart1 = bab9Stage3Part1Exercises,
                    exercisesPart2 = bab9Stage3Part2Exercises
                ),
                Lesson(
                    id = "u9_l4",
                    title = "Pilihan Benda & Sampai",
                    subtitle = "Kosakata 这个, 那个, 哪个, dan 到 (tiba)",
                    grammarNote = "Menentukan pilihan: 这个 (yang ini), 那个 (yang itu), 哪个 (yang mana?). Kata kerja pergerakan: 到 + Lokasi + 了 (到了 = sudah sampai, 到家 = sampai rumah).",
                    newWords = listOf(
                        Word("w9_13", "这个", "zhège", "Yang ini", "Pilihan", "我要这个。", "Wǒ yào zhège.", "Saya ingin yang ini."),
                        Word("w9_14", "那个", "nàge", "Yang itu", "Pilihan", "那个杯子是我的。", "Nàge bēizi shì wǒ de.", "Gelas yang itu milik saya."),
                        Word("w9_15", "哪个", "nǎge", "Yang mana", "Kata tanya", "你要哪个？", "Nǐ yào nǎge?", "Kamu ingin yang mana?"),
                        Word("w9_16", "到", "dào", "Tiba / sampai", "Kata kerja", "我到家了。", "Wǒ dào jiā le.", "Saya sudah sampai rumah.")
                    ),
                    exercises = bab9Stage4Part1Exercises,
                    exercisesPart1 = bab9Stage4Part1Exercises,
                    exercisesPart2 = bab9Stage4Part2Exercises
                ),
                Lesson(
                    id = "u9_l5",
                    title = "Evaluasi Komprehensif Posisi",
                    subtitle = "Review 21 kosakata posisi, arah & lokasi",
                    grammarNote = "Evaluasi terpadu Bab 9: mendeskripsikan posisi benda (atas/bawah/dalam/luar/depan/belakang), menanyakan dan menunjuk lokasi (di sini/di sana/di mana), dan menentukan pilihan benda.",
                    newWords = listOf(
                        Word("w9_1", "上", "shàng", "Atas", "Arah", "在桌子上。", "Zài zhuōzi shang.", "Di atas meja."),
                        Word("w9_6", "前面", "qiánmiàn", "Depan", "Arah", "在前面。", "Zài qiánmiàn.", "Di depan."),
                        Word("w9_12", "哪儿", "nǎr", "Di mana", "Kata tanya", "你在哪儿？", "Nǐ zài nǎr?", "Kamu di mana?"),
                        Word("w9_16", "到", "dào", "Tiba", "Kata kerja", "我们到了。", "Wǒmen dào le.", "Kita sudah sampai.")
                    ),
                    exercises = bab9Stage5Part1Exercises,
                    exercisesPart1 = bab9Stage5Part1Exercises,
                    exercisesPart2 = bab9Stage5Part2Exercises
                )
            )
        )
    )
}
