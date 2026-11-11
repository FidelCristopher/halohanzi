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
    // 6 BAB CERITA BERJENJANG LENGKAP (GRADED READERS) HSK 1
    // =========================================================================
    val stories: List<Story> = listOf(
        // Cerita Mandarin Bean: I Didn't Laugh (我没笑)
        Story(
            id = "story_i_didnt_laugh",
            titleHanzi = "我没笑",
            titlePinyin = "Wǒ Méi Xiào",
            titleTranslation = "I Didn't Laugh (Saya Tidak Tertawa)",
            level = "HSK 1",
            category = "Humor & Sekolah",
            description = "Anekdot lucu tentang Xiao Wang yang pulang ke rumah dan bercerita kepada ibunya tentang kejadian di sekolah.",
            coverEmoji = "😂",
            coverImageRes = R.drawable.cover_story_i_didnt_laugh,
            estimatedReadMinutes = 2,
            sentences = listOf(
                Sentence(
                    "s_idl_1",
                    "小王从学校回家，妈妈问他今天怎么样，他告诉妈妈：",
                    "Xiǎo Wáng cóng xuéxiào huí jiā, māma wèn tā jīntiān zěnmeyàng, tā gàosu māma:",
                    "Wang kecil pulang ke rumah dari sekolah, ibu bertanya padanya bagaimana hari ini, dia memberi tahu ibunya:",
                    listOf(
                        WordToken("小王", "Xiǎo Wáng", "Wang kecil", "Nama orang"),
                        WordToken("从", "cóng", "Dari", "Preposisi asal"),
                        WordToken("学校", "xuéxiào", "Sekolah", "Tempat belajar"),
                        WordToken("回家", "huí jiā", "Pulang ke rumah", "Kembali ke kediaman"),
                        WordToken("妈妈", "māma", "Ibu", "Orang tua perempuan"),
                        WordToken("问", "wèn", "Bertanya", "Mengajukan pertanyaan"),
                        WordToken("他", "tā", "Dia / -nya", "Kata ganti orang ketiga"),
                        WordToken("今天", "jīntiān", "Hari ini", "Waktu saat ini"),
                        WordToken("怎么样", "zěnmeyàng", "Bagaimana", "Menanyakan keadaan"),
                        WordToken("告诉", "gàosu", "Memberitahu", "Menyampaikan informasi"),
                        WordToken("妈妈", "māma", "Ibu", "Orang tua perempuan")
                    )
                ),
                Sentence(
                    "s_idl_2",
                    "“今天有一个孩子掉进水里了，同学们都大笑，只有我没笑。”",
                    "“Jīntiān yǒu yī gè háizi diào jìn shuǐ lǐ le, tóngxuémen dōu dà xiào, zhǐyǒu wǒ méi xiào.”",
                    "“Hari ini ada seorang anak jatuh ke dalam air, teman-teman sekelas semua tertawa terbahak-bahak, hanya aku yang tidak tertawa.”",
                    listOf(
                        WordToken("今天", "jīntiān", "Hari ini", "Waktu saat ini"),
                        WordToken("有", "yǒu", "Ada", "Kata kerja keberadaan"),
                        WordToken("一个", "yī gè", "Seorang", "Bilangan dan kata bantu"),
                        WordToken("孩子", "háizi", "Anak", "Anak kecil"),
                        WordToken("掉进", "diào jìn", "Jatuh ke dalam", "Terperosok ke dalam"),
                        WordToken("水里", "shuǐ lǐ", "Di dalam air", "Tempat berisi air"),
                        WordToken("了", "le", "Sudah", "Partikel aspek"),
                        WordToken("同学们", "tóngxuémen", "Teman-teman sekelas", "Sesama pelajar"),
                        WordToken("都", "dōu", "Semua", "Menunjukkan keseluruhan"),
                        WordToken("大笑", "dà xiào", "Tertawa keras", "Tertawa terbahak-bahak"),
                        WordToken("只有", "zhǐyǒu", "Hanya", "Menunjukkan perkecualian"),
                        WordToken("我", "wǒ", "Saya / aku", "Kata ganti orang pertama"),
                        WordToken("没笑", "méi xiào", "Tidak tertawa", "Bentuk negasi lampau tertawa")
                    )
                ),
                Sentence(
                    "s_idl_3",
                    "妈妈很高兴：“好孩子，我们当然不能笑别人。谁掉进水里了？”",
                    "Māma hěn gāoxìng: “Hǎo háizi, wǒmen dāngrán bù néng xiào biérén. Shéi diào jìn shuǐ lǐ le?”",
                    "Ibu sangat senang: “Anak pintar, kita tentu saja tidak boleh menertawakan orang lain. Siapa yang jatuh ke dalam air?”",
                    listOf(
                        WordToken("妈妈", "māma", "Ibu", "Orang tua perempuan"),
                        WordToken("很", "hěn", "Sangat", "Tingkat intensitas"),
                        WordToken("高兴", "gāoxìng", "Senang / gembira", "Perasaan bahagia"),
                        WordToken("好", "hǎo", "Baik / pintar", "Karakter terpuji"),
                        WordToken("孩子", "háizi", "Anak", "Anak kecil"),
                        WordToken("我们", "wǒmen", "Kita / kami", "Kata ganti orang pertama jamak"),
                        WordToken("当然", "dāngrán", "Tentu saja", "Kepastian / wajar"),
                        WordToken("不能", "bù néng", "Tidak boleh", "Larangan moral"),
                        WordToken("笑", "xiào", "Menertawakan", "Tertawa pada sesuatu"),
                        WordToken("别人", "biérén", "Orang lain", "Selain diri sendiri"),
                        WordToken("谁", "shéi", "Siapa", "Kata tanya orang"),
                        WordToken("掉进", "diào jìn", "Jatuh ke dalam", "Terperosok ke dalam"),
                        WordToken("水里", "shuǐ lǐ", "Di dalam air", "Tempat berisi air"),
                        WordToken("了", "le", "Partikel", "Penanda situasi")
                    )
                ),
                Sentence(
                    "s_idl_4",
                    "小王说：“我。”",
                    "Xiǎo Wáng shuō: “Wǒ.”",
                    "Wang kecil berkata: “Saya.”",
                    listOf(
                        WordToken("小王", "Xiǎo Wáng", "Wang kecil", "Nama orang"),
                        WordToken("说", "shuō", "Berkata", "Menyatakan sesuatu"),
                        WordToken("我", "wǒ", "Saya", "Kata ganti orang pertama")
                    )
                )
            ),
            questions = listOf(
                StoryQuestion(
                    "q_idl_1",
                    "谁掉进水里了？(Siapa yang jatuh ke dalam air?)",
                    listOf("妈妈 (Ibu)", "同学 (Teman sekelas)", "小王 (Wang kecil)", "老师 (Guru)"),
                    2,
                    "Di akhir cerita, saat ibu bertanya siapa yang jatuh ke air, Xiao Wang menjawab: \"我\" (Saya)."
                ),
                StoryQuestion(
                    "q_idl_2",
                    "小王为什么没笑？(Mengapa Xiao Wang tidak tertawa?)",
                    listOf(
                        "因为他是好孩子 (Karena dia anak baik)",
                        "因为是他掉进水里了 (Karena dia yang jatuh ke air)",
                        "因为他不高兴 (Karena dia tidak senang)",
                        "因为他没看到 (Karena dia tidak melihatnya)"
                    ),
                    1,
                    "Xiao Wang tidak tertawa bukan karena menahan diri, tetapi karena dialah yang jatuh ke dalam air sehingga tidak bisa menertawakan diri sendiri."
                ),
                StoryQuestion(
                    "q_idl_3",
                    "妈妈一开始的心情怎么样？(Bagaimana perasaan ibu pada awalnya?)",
                    listOf(
                        "很高兴 (Sangat senang)",
                        "很生气 (Sangat marah)",
                        "害怕 (Takut)",
                        "难过 (Sedih)"
                    ),
                    0,
                    "Di kalimat ke-3 tertulis: '妈妈很高兴: 好孩子，我们当然不能笑别人' (Ibu sangat senang mengira anaknya berbuat terpuji)."
                )
            )
        ),

        // Cerita Mandarin Bean 2: Dad's Work (爸爸的工作)
        Story(
            id = "story_dads_work",
            titleHanzi = "爸爸的工作",
            titlePinyin = "Bàba de Gōngzuò",
            titleTranslation = "Dad's Work (Pekerjaan Ayah)",
            level = "HSK 1",
            category = "Humor & Keluarga",
            description = "Percakapan jenaka antara seorang guru TK dengan murid perempuan kecil berusia lima tahun tentang pekerjaan ayahnya.",
            coverEmoji = "👨‍👧",
            coverImageRes = R.drawable.cover_story_dads_work,
            estimatedReadMinutes = 1,
            sentences = listOf(
                Sentence(
                    "s_dw_1",
                    "老师问五岁的小女孩：“你的爸爸是做什么的？”",
                    "Lǎoshī wèn wǔ suì de xiǎo nǚhái: “Nǐ de bàba shì zuò shénme de?”",
                    "Guru bertanya kepada anak perempuan kecil berusia lima tahun: “Apa pekerjaan ayahmu?”",
                    listOf(
                        WordToken("老师", "lǎoshī", "Guru", "Profesi pengajar"),
                        WordToken("问", "wèn", "Bertanya", "Mengajukan pertanyaan"),
                        WordToken("五岁", "wǔ suì", "Berusia lima tahun", "Keterangan umur"),
                        WordToken("的", "de", "Yang", "Partikel penghubung atributif"),
                        WordToken("小女孩", "xiǎo nǚhái", "Anak perempuan kecil", "Gadis cilik"),
                        WordToken("你的", "nǐ de", "Milikmu / -mu", "Kata ganti kepemilikan"),
                        WordToken("爸爸", "bàba", "Ayah / papa", "Orang tua laki-laki"),
                        WordToken("是", "shì", "Adalah", "Kopula"),
                        WordToken("做什么", "zuò shénme", "Mengerjakan apa", "Frasa menanyakan profesi"),
                        WordToken("的", "de", "Partikel penekanan profesi", "Pola 是...的")
                    )
                ),
                Sentence(
                    "s_dw_2",
                    "小女孩说：“我的妈妈让他做什么，他就做什么。”",
                    "Xiǎo nǚhái shuō: “Wǒ de māma ràng tā zuò shénme, tā jiù zuò shénme.”",
                    "Gadis kecil itu berkata: “Apa pun yang ibuku suruh dia lakukan, itu yang dia lakukan.”",
                    listOf(
                        WordToken("小女孩", "xiǎo nǚhái", "Gadis kecil", "Anak perempuan cilik"),
                        WordToken("说", "shuō", "Berkata", "Menyatakan sesuatu"),
                        WordToken("我的", "wǒ de", "Milikku / -ku", "Kata ganti kepemilikan"),
                        WordToken("妈妈", "māma", "Ibu / mama", "Orang tua perempuan"),
                        WordToken("让", "ràng", "Menyuruh / meminta", "Kata kerja kausatif"),
                        WordToken("他", "tā", "Dia / -nya", "Merujuk ke ayah"),
                        WordToken("做", "zuò", "Melakukan / mengerjakan", "Kata kerja tindakan"),
                        WordToken("什么", "shénme", "Apa / apa pun", "Kata tanya / pronomina tak tentu"),
                        WordToken("他", "tā", "Dia", "Merujuk ke ayah"),
                        WordToken("就", "jiù", "Maka / langsung", "Adverbia penegas urutan"),
                        WordToken("做", "zuò", "Mengerjakan", "Melakukan tindakan"),
                        WordToken("什么", "shénme", "Itu / apa", "Korelasi dengan kata apa pun sebelumnya")
                    )
                )
            ),
            questions = listOf(
                StoryQuestion(
                    "q_dw_1",
                    "小女孩几岁？(Berapa usia anak perempuan itu?)",
                    listOf("三岁 (3 tahun)", "四岁 (4 tahun)", "五岁 (5 tahun)", "六岁 (6 tahun)"),
                    2,
                    "Di kalimat pertama tertulis: '老师问五岁的小女孩' (Guru bertanya kepada gadis kecil berusia 5 tahun)."
                ),
                StoryQuestion(
                    "q_dw_2",
                    "老师问了小女孩什么问题？(Pertanyaan apa yang diajukan oleh guru?)",
                    listOf(
                        "妈妈漂亮吗？(Apakah ibumu cantik?)",
                        "你的爸爸是做什么的？(Apa pekerjaan ayahmu?)",
                        "你喜欢学校吗？(Apakah kamu suka sekolah?)",
                        "你有几个朋友？(Berapa banyak teman yang kamu punya?)"
                    ),
                    1,
                    "Guru menanyakan pekerjaan ayah si anak: '你的爸爸是做什么的？'."
                ),
                StoryQuestion(
                    "q_dw_3",
                    "小女孩的意思是什么？(Apa maksud jawaban gadis kecil itu?)",
                    listOf(
                        "爸爸听妈妈的话 (Ayah selalu patuh pada perintah ibu)",
                        "爸爸是老师 (Ayah bekerja sebagai guru)",
                        "爸爸没有工作 (Ayah tidak punya pekerjaan)",
                        "爸爸不回家 (Ayah tidak pulang ke rumah)"
                    ),
                    0,
                    "Maksud dari '妈妈让他做什么，他就做什么' adalah sang ayah sangat patuh dan mendengarkan segala suruhan/perintah sang ibu di rumah."
                )
            )
        ),

        // Cerita Mandarin Bean 3: Who I am (我是谁)
        Story(
            id = "story_who_i_am",
            titleHanzi = "我是谁",
            titlePinyin = "Wǒ Shì Shéi",
            titleTranslation = "Who I Am (Siapa Saya)",
            level = "HSK 1",
            category = "Profil & Pekerjaan",
            description = "Perkenalan diri David Lee, seorang guru bahasa Inggris asal Amerika yang tumbuh di Jepang, kuliah di Inggris, dan kini mengajar di Tiongkok.",
            coverEmoji = "👨‍🏫",
            coverImageRes = R.drawable.cover_story_who_i_am,
            estimatedReadMinutes = 2,
            sentences = listOf(
                Sentence(
                    "s_wia_1",
                    "我的名字叫李大卫，我是美国人，但是在日本长大，在英国上大学，现在在中国工作。",
                    "Wǒ de míngzi jiào Lǐ Dàwèi, wǒ shì Měiguó rén, dànshì zài Rìběn zhǎngdà, zài Yīngguó shàng dàxué, xiànzài zài Zhōngguó gōngzuò.",
                    "Nama saya David Lee, saya orang Amerika, tetapi besar di Jepang, kuliah di Inggris, dan sekarang bekerja di Tiongkok.",
                    listOf(
                        WordToken("我的", "wǒ de", "Milikku / saya punya", "Kata ganti kepemilikan"),
                        WordToken("名字", "míngzi", "Nama", "Kata benda identitas"),
                        WordToken("叫", "jiào", "Dipanggil / bernama", "Kata kerja menyebut nama"),
                        WordToken("李大卫", "Lǐ Dàwèi", "David Lee", "Nama orang"),
                        WordToken("我", "wǒ", "Saya", "Kata ganti orang pertama"),
                        WordToken("是", "shì", "Adalah", "Kopula"),
                        WordToken("美国人", "Měiguó rén", "Orang Amerika", "Kewarganegaraan"),
                        WordToken("但是", "dànshì", "Tetapi / namun", "Konjungsi pertentangan"),
                        WordToken("在", "zài", "Di", "Preposisi lokasi"),
                        WordToken("日本", "Rìběn", "Jepang", "Nama negara"),
                        WordToken("长大", "zhǎngdà", "Tumbuh besar", "Frasa perkembangan hidup"),
                        WordToken("在", "zài", "Di", "Preposisi lokasi"),
                        WordToken("英国", "Yīngguó", "Inggris", "Nama negara"),
                        WordToken("上大学", "shàng dàxué", "Kuliah / masuk universitas", "Aktivitas pendidikan tinggi"),
                        WordToken("现在", "xiànzài", "Sekarang", "Keterangan waktu saat ini"),
                        WordToken("在", "zài", "Di", "Preposisi lokasi"),
                        WordToken("中国", "Zhōngguó", "Tiongkok", "Nama negara"),
                        WordToken("工作", "gōngzuò", "Bekerja", "Aktivitas profesi")
                    )
                ),
                Sentence(
                    "s_wia_2",
                    "我在大学学习历史和英语，现在是一个英语老师，我非常喜欢我的工作。",
                    "Wǒ zài dàxué xuéxí lìshǐ hé Yīngyǔ, xiànzài shì yī gè Yīngyǔ lǎoshī, wǒ fēicháng xǐhuan wǒ de gōngzuò.",
                    "Saya belajar sejarah dan bahasa Inggris di universitas, sekarang adalah seorang guru bahasa Inggris, saya sangat menyukai pekerjaan saya.",
                    listOf(
                        WordToken("我", "wǒ", "Saya", "Kata ganti orang pertama"),
                        WordToken("在", "zài", "Di", "Preposisi"),
                        WordToken("大学", "dàxué", "Universitas", "Perguruan tinggi"),
                        WordToken("学习", "xuéxí", "Belajar", "Kata kerja menuntut ilmu"),
                        WordToken("历史", "lìshǐ", "Sejarah", "Mata kuliah / ilmu masa lalu"),
                        WordToken("和", "hé", "Dan", "Kata hubung setara"),
                        WordToken("英语", "Yīngyǔ", "Bahasa Inggris", "Bahasa asing"),
                        WordToken("现在", "xiànzài", "Sekarang", "Keterangan waktu"),
                        WordToken("是", "shì", "Adalah", "Kopula"),
                        WordToken("一个", "yī gè", "Seorang", "Satuan jumlah"),
                        WordToken("英语老师", "Yīngyǔ lǎoshī", "Guru bahasa Inggris", "Profesi pengajar bahasa"),
                        WordToken("我", "wǒ", "Saya", "Kata ganti orang pertama"),
                        WordToken("非常", "fēicháng", "Sangat / luar biasa", "Adverbia penegas intensitas tinggi"),
                        WordToken("喜欢", "xǐhuan", "Menyukai / gemar", "Perasaan suka"),
                        WordToken("我的", "wǒ de", "Milik saya", "Kepemilikan"),
                        WordToken("工作", "gōngzuò", "Pekerjaan", "Karir / tugas")
                    )
                ),
                Sentence(
                    "s_wia_3",
                    "学生们很好，学校也很好。",
                    "Xuéshengmen hěn hǎo, xuéxiào yě hěn hǎo.",
                    "Para murid sangat baik, sekolahnya juga sangat baik.",
                    listOf(
                        WordToken("学生们", "xuéshengmen", "Para murid / siswa", "Bentuk jamak pelajar"),
                        WordToken("很", "hěn", "Sangat", "Adverbia derajat"),
                        WordToken("好", "hǎo", "Baik / ramah", "Kata sifat"),
                        WordToken("学校", "xuéxiào", "Sekolah", "Tempat mengajar"),
                        WordToken("也", "yě", "Juga", "Adverbia inklusi"),
                        WordToken("很好", "hěn hǎo", "Sangat baik", "Kondisi memuaskan")
                    )
                )
            ),
            questions = listOf(
                StoryQuestion(
                    "q_wia_1",
                    "李大卫是哪国人？(Dari negara mana David Lee berasal?)",
                    listOf("中国 (Tiongkok)", "美国 (Amerika Serikat)", "日本 (Jepang)", "英国 (Inggris)"),
                    1,
                    "Di kalimat pertama tertulis: '我是美国人' (Saya adalah orang Amerika)."
                ),
                StoryQuestion(
                    "q_wia_2",
                    "李大卫现在做什么工作？(Apa pekerjaan David Lee sekarang?)",
                    listOf(
                        "学生 (Murid)",
                        "医生 (Dokter)",
                        "英语老师 (Guru Bahasa Inggris)",
                        "历史老师 (Guru Sejarah)"
                    ),
                    2,
                    "Di kalimat ke-2 tertulis: '现在是一个英语老师' (Sekarang adalah seorang guru bahasa Inggris)."
                ),
                StoryQuestion(
                    "q_wia_3",
                    "李大卫现在在哪里工作？(Di mana David Lee bekerja sekarang?)",
                    listOf(
                        "在日本 (Di Jepang)",
                        "在英国 (Di Inggris)",
                        "在美国 (Di Amerika Serikat)",
                        "在中国 (Di Tiongkok)"
                    ),
                    3,
                    "Di kalimat pertama tertulis: '现在在中国工作' (Sekarang bekerja di Tiongkok)."
                )
            )
        ),

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
            coverImageRes = R.drawable.img_two_students_studying,
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
            coverImageRes = R.drawable.img_student_boy,
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
            coverImageRes = R.drawable.img_female_doctor_syringe,
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
            coverImageRes = R.drawable.img_girl_in_car,
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
        ),

        // Cerita 7 - HSK 2: Belanja Buah di Supermarket
        Story(
            id = "story_hsk2_market",
            titleHanzi = "在超市买水果",
            titlePinyin = "Zài Chāoshì Mǎi Shuǐguǒ",
            titleTranslation = "Membeli Buah di Supermarket",
            level = "HSK 2",
            category = "Belanja & Makanan",
            description = "Mingming dan ibu pergi ke supermarket untuk memilih apel merah dan semangka manis di hari musim panas.",
            coverEmoji = "🍎",
            coverImageRes = 0,
            estimatedReadMinutes = 3,
            sentences = listOf(
                Sentence(
                    "s_hsk2_m_1",
                    "今天星期六，明明和妈妈一起去超市买东西。",
                    "Jīntiān xīngqīliù, Míngming hé māma yìqǐ qù chāoshì mǎi dōngxi.",
                    "Hari ini hari Sabtu, Mingming dan ibu bersama-sama pergi ke supermarket berbelanja.",
                    listOf(
                        WordToken("今天", "jīntiān", "Hari ini"),
                        WordToken("星期六", "xīngqīliù", "Hari Sabtu"),
                        WordToken("明明", "Míngming", "Mingming"),
                        WordToken("和", "hé", "Dan / bersama"),
                        WordToken("妈妈", "māma", "Ibu"),
                        WordToken("一起", "yìqǐ", "Bersama-sama"),
                        WordToken("去", "qù", "Pergi"),
                        WordToken("超市", "chāoshì", "Supermarket"),
                        WordToken("买", "mǎi", "Membeli"),
                        WordToken("东西", "dōngxi", "Barang / belanjaan")
                    )
                ),
                Sentence(
                    "s_hsk2_m_2",
                    "超市里的水果真多，有红色的苹果，也有大西瓜。",
                    "Chāoshì lǐ de shuǐguǒ zhēn duō, yǒu hóngsè de píngguǒ, yě yǒu dà xīguā.",
                    "Buah di supermarket sungguh banyak, ada apel merah, juga ada semangka besar.",
                    listOf(
                        WordToken("超市", "chāoshì", "Supermarket"),
                        WordToken("里", "lǐ", "Di dalam"),
                        WordToken("的", "de", "Partikel kepemilikan"),
                        WordToken("水果", "shuǐguǒ", "Buah-buahan"),
                        WordToken("真", "zhēn", "Sungguh / benar-benar"),
                        WordToken("多", "duō", "Banyak"),
                        WordToken("有", "yǒu", "Ada"),
                        WordToken("红色", "hóngsè", "Warna merah"),
                        WordToken("的", "de", "Partikel"),
                        WordToken("苹果", "píngguǒ", "Apel"),
                        WordToken("也", "yě", "Juga"),
                        WordToken("有", "yǒu", "Ada"),
                        WordToken("大", "dà", "Besar"),
                        WordToken("西瓜", "xīguā", "Semangka")
                    )
                ),
                Sentence(
                    "s_hsk2_m_3",
                    "明明问妈妈：“妈妈，今天的西瓜甜不甜？”",
                    "Míngming wèn māma: “Māma, jīntiān de xīguā tián bu tián?”",
                    "Mingming bertanya pada ibu: “Ibu, apakah semangka hari ini manis?”",
                    listOf(
                        WordToken("明明", "Míngming", "Mingming"),
                        WordToken("问", "wèn", "Bertanya"),
                        WordToken("妈妈", "māma", "Ibu"),
                        WordToken("今天", "jīntiān", "Hari ini"),
                        WordToken("的", "de", "Partikel"),
                        WordToken("西瓜", "xīguā", "Semangka"),
                        WordToken("甜不甜", "tián bu tián", "Manis atau tidak")
                    )
                ),
                Sentence(
                    "s_hsk2_m_4",
                    "妈妈笑着回答：“你看，这里的西瓜又大又新鲜，一定很甜。”",
                    "Māma xiào zhe huídá: “Nǐ kàn, zhèlǐ de xīguā yòu dà yòu xīnxiān, yídìng hěn tián.”",
                    "Ibu tersenyum menjawab: “Coba lihat, semangka di sini besar dan segar, pasti manis sekali.”",
                    listOf(
                        WordToken("妈妈", "māma", "Ibu"),
                        WordToken("笑着", "xiào zhe", "Tersenyum sambil"),
                        WordToken("回答", "huídá", "Menjawab"),
                        WordToken("你", "nǐ", "Kamu"),
                        WordToken("看", "kàn", "Lihat"),
                        WordToken("这里", "zhèlǐ", "Di sini"),
                        WordToken("的", "de", "Partikel"),
                        WordToken("西瓜", "xīguā", "Semangka"),
                        WordToken("又大又新鲜", "yòu dà yòu xīnxiān", "Sudah besar juga segar"),
                        WordToken("一定", "yídìng", "Pasti"),
                        WordToken("很", "hěn", "Sangat"),
                        WordToken("甜", "tián", "Manis")
                    )
                ),
                Sentence(
                    "s_hsk2_m_5",
                    "他们买了两斤苹果和一个西瓜，高高兴兴地回家了。",
                    "Tāmen mǎi le liǎng jīn píngguǒ hé yí gè xīguā, gāogāoxìngxìng de huí jiā le.",
                    "Mereka membeli dua jin apel dan satu semangka, lalu pulang ke rumah dengan riang gembira.",
                    listOf(
                        WordToken("他们", "tāmen", "Mereka"),
                        WordToken("买", "mǎi", "Membeli"),
                        WordToken("了", "le", "Sudah"),
                        WordToken("两斤", "liǎng jīn", "Dua jin (1 kg)"),
                        WordToken("苹果", "píngguǒ", "Apel"),
                        WordToken("和", "hé", "Dan"),
                        WordToken("一个", "yí gè", "Satu buah"),
                        WordToken("西瓜", "xīguā", "Semangka"),
                        WordToken("高高兴兴地", "gāogāoxìngxìng de", "Dengan senang gembira"),
                        WordToken("回家", "huí jiā", "Pulang ke rumah"),
                        WordToken("了", "le", "Sudah")
                    )
                )
            ),
            questions = listOf(
                StoryQuestion(
                    "q_hsk2_m_1",
                    "明明和谁一起去超市？(Mingming pergi ke supermarket bersama siapa?)",
                    listOf("老师 (Guru)", "朋友 (Teman)", "妈妈 (Ibu)", "同学 (Teman sekelas)"),
                    2,
                    "Di kalimat ke-1 tertulis: '明明和妈妈一起去超市买东西' (bersama ibu)."
                ),
                StoryQuestion(
                    "q_hsk2_m_2",
                    "他们在超市买了什么？(Apa yang mereka beli di supermarket?)",
                    listOf(
                        "苹果和西瓜 (Apel dan semangka)",
                        "米饭和茶 (Nasi dan teh)",
                        "书和电脑 (Buku dan komputer)",
                        "衣服和鞋子 (Baju dan sepatu)"
                    ),
                    0,
                    "Di kalimat terakhir tertulis: '他们买了两斤苹果和一个西瓜' (dua jin apel dan satu semangka)."
                )
            )
        ),

        // Cerita 8 - HSK 2: Mengantar Teman ke Bandara
        Story(
            id = "story_hsk2_airport",
            titleHanzi = "去机场送朋友",
            titlePinyin = "Qù Jīchǎng Sòng Péngyou",
            titleTranslation = "Mengantar Teman ke Bandara",
            level = "HSK 2",
            category = "Perjalanan & Transportasi",
            description = "Wang Lei bangun pagi untuk mengantar sahabatnya yang akan terbang pulang ke negaranya dari Bandara Ibu Kota.",
            coverEmoji = "✈️",
            coverImageRes = 0,
            estimatedReadMinutes = 3,
            sentences = listOf(
                Sentence(
                    "s_hsk2_a_1",
                    "早上七点，王磊就起床准备去首都机场。",
                    "Zǎoshang qī diǎn, Wáng Lěi jiù qǐchuáng zhǔnbèi qù shǒudū jīchǎng.",
                    "Pukul 7 pagi, Wang Lei sudah bangun bersiap pergi ke Bandara Ibu Kota.",
                    listOf(
                        WordToken("早上", "zǎoshang", "Pagi hari"),
                        WordToken("七点", "qī diǎn", "Pukul 7"),
                        WordToken("王磊", "Wáng Lěi", "Wang Lei"),
                        WordToken("就", "jiù", "Sudah / langsung"),
                        WordToken("起床", "qǐchuáng", "Bangun tidur"),
                        WordToken("准备", "zhǔnbèi", "Bersiap-siap"),
                        WordToken("去", "qù", "Pergi"),
                        WordToken("首都", "shǒudū", "Ibu kota"),
                        WordToken("机场", "jīchǎng", "Bandara")
                    )
                ),
                Sentence(
                    "s_hsk2_a_2",
                    "今天他的好朋友大卫要坐飞机回自己的国家。",
                    "Jīntiān tā de hǎo péngyou Dàwèi yào zuò fēijī huí zìjǐ de guójiā.",
                    "Hari ini sahabatnya David hendak naik pesawat kembali ke negaranya.",
                    listOf(
                        WordToken("今天", "jīntiān", "Hari ini"),
                        WordToken("他的", "tā de", "Miliknya"),
                        WordToken("好朋友", "hǎo péngyou", "Sahabat baik"),
                        WordToken("大卫", "Dàwèi", "David"),
                        WordToken("要", "yào", "Hendak / akan"),
                        WordToken("坐", "zuò", "Naik"),
                        WordToken("飞机", "fēijī", "Pesawat terbang"),
                        WordToken("回", "huí", "Kembali"),
                        WordToken("自己", "zìjǐ", "Sendiri"),
                        WordToken("的", "de", "Partikel kepemilikan"),
                        WordToken("国家", "guójiā", "Negara")
                    )
                ),
                Sentence(
                    "s_hsk2_a_3",
                    "在机场的大厅里，王磊见到了大卫和他的家人。",
                    "Zài jīchǎng de dàtīng lǐ, Wáng Lěi jiàndào le Dàwèi hé tā de jiārén.",
                    "Di aula bandara, Wang Lei bertemu dengan David dan keluarganya.",
                    listOf(
                        WordToken("在", "zài", "Di"),
                        WordToken("机场", "jīchǎng", "Bandara"),
                        WordToken("的", "de", "Partikel"),
                        WordToken("大厅", "dàtīng", "Aula / terminal"),
                        WordToken("里", "lǐ", "Di dalam"),
                        WordToken("王磊", "Wáng Lěi", "Wang Lei"),
                        WordToken("见到", "jiàndào", "Melihat / bertemu"),
                        WordToken("了", "le", "Sudah"),
                        WordToken("大卫", "Dàwèi", "David"),
                        WordToken("和", "hé", "Dan"),
                        WordToken("他的", "tā de", "Keluarganya"),
                        WordToken("家人", "jiārén", "Keluarga")
                    )
                ),
                Sentence(
                    "s_hsk2_a_4",
                    "大卫笑着说：“谢谢你来送我，我会经常想念你的！”",
                    "Dàwèi xiào zhe shuō: “Xièxie nǐ lái sòng wǒ, wǒ huì jīngcháng xiǎngniàn nǐ de!”",
                    "David tersenyum berkata: “Terima kasih telah datang mengantarku, aku akan selalu merindukanmu!”",
                    listOf(
                        WordToken("大卫", "Dàwèi", "David"),
                        WordToken("笑着", "xiào zhe", "Sambil tersenyum"),
                        WordToken("说", "shuō", "Berkata"),
                        WordToken("谢谢", "xièxie", "Terima kasih"),
                        WordToken("你", "nǐ", "Kamu"),
                        WordToken("来", "lái", "Datang"),
                        WordToken("送", "sòng", "Mengantar"),
                        WordToken("我", "wǒ", "Saya"),
                        WordToken("我会", "wǒ huì", "Saya akan"),
                        WordToken("经常", "jīngcháng", "Sering / selalu"),
                        WordToken("想念", "xiǎngniàn", "Merindukan"),
                        WordToken("你", "nǐ", "Kamu")
                    )
                ),
                Sentence(
                    "s_hsk2_a_5",
                    "王磊说：“祝你一路平安，到了以后记得给我打电话。”",
                    "Wáng Lěi shuō: “Zhù nǐ yílù píng'ān, dào le yǐhòu jìde gěi wǒ dǎ diànhuà.”",
                    "Wang Lei berkata: “Semoga selamat sampai tujuan, setelah tiba ingatlah untuk meneleponku.”",
                    listOf(
                        WordToken("王磊", "Wáng Lěi", "Wang Lei"),
                        WordToken("说", "shuō", "Berkata"),
                        WordToken("祝你", "zhù nǐ", "Mendoakanmu"),
                        WordToken("一路平安", "yílù píng'ān", "Selamat sepanjang jalan"),
                        WordToken("到了", "dào le", "Setelah tiba"),
                        WordToken("以后", "yǐhòu", "Nanti / setelah"),
                        WordToken("记得", "jìde", "Ingat"),
                        WordToken("给", "gěi", "Kepada"),
                        WordToken("我", "wǒ", "Saya"),
                        WordToken("打电话", "dǎ diànhuà", "Menelepon")
                    )
                )
            ),
            questions = listOf(
                StoryQuestion(
                    "q_hsk2_a_1",
                    "大卫今天要回哪里？(David hari ini hendak kembali ke mana?)",
                    listOf("学校 (Sekolah)", "医院 (Rumah sakit)", "自己的国家 (Negaranya sendiri)", "饭馆 (Restoran)"),
                    2,
                    "Di kalimat ke-2: '今天他的好朋友大卫要坐飞机回自己的国家'."
                ),
                StoryQuestion(
                    "q_hsk2_a_2",
                    "王磊对大卫说了什么祝福？(Ucapan doa apa yang diberikan Wang Lei untuk David?)",
                    listOf(
                        "祝你一路平安 (Semoga selamat sampai tujuan)",
                        "祝你生日快乐 (Selamat ulang tahun)",
                        "祝你新年好 (Selamat tahun baru)",
                        "祝你身体健康 (Semoga sehat selalu)"
                    ),
                    0,
                    "Di kalimat ke-5: '王磊说：祝你一路平安' (Semoga perjalananmu aman dan damai)."
                )
            )
        )
    )

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
                            targetHanzi = "你好，我 叫 布迪 。",
                            targetPinyin = "Nǐhǎo    wǒ jiào  Bùdí",
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
                            targetHanzi = "我 叫 王 飞 。",
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
                                "Nǐhǎo        Bùdí\n你好，布迪。",
                                "WángFēi        nǐhǎo\n王 飞 ， 你 好 。",
                                "Wǒ jiào    Bùdí\n我 叫 布迪 。"
                            ),
                            correctAnswer = "Wǒ jiào    Bùdí\n我 叫 布迪 。",
                            audioToSpeak = "我叫布迪。"
                        ),
                        // 7. Soal 7: Susun Kalimat Audio Imersif (你好，我叫王飞。)
                        Exercise(
                            id = "u1_p1_q7",
                            type = ExerciseType.SENTENCE_BUILDER,
                            title = "Apa yang Anda dengar?",
                            targetHanzi = "你好，我叫王飞。",
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
                            targetHanzi = "你好，王飞，我叫布迪。",
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
                            targetHanzi = "我 是 印度尼西亚 人 。",
                            targetPinyin = "Wǒ shì  Yìndùníxīyà  rén",
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
                            targetHanzi = "老师 ， 你好 ， 我 是\n印尼 人 。",
                            targetPinyin = "Lǎoshī    nǐhǎo    wǒ shì\nYìnní  rén",
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
                            targetHanzi = "布迪是印尼人。",
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
                                "Bùdí  shì  xuéshēng\n布迪 是  学生 。",
                                "Bùdí  shì  lǎoshī\n布迪 是  老师 。",
                                "WángFēi  shì  xuéshēng\n王 飞  是  学生 。",
                                "Wǒ  shì  xuéshēng\n我 是  学生 。"
                            ),
                            correctAnswer = "Bùdí  shì  xuéshēng\n布迪 是  学生 。",
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
                            targetHanzi = "王飞是老师。",
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
                            targetHanzi = "你好，我叫布迪。",
                            targetPinyin = "Nǐhǎo, wǒ jiào Bùdí.",
                            staticTrailingText = "叫 布迪 。",
                            staticTrailingPinyin = "jiào  Bùdí",
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
                            targetHanzi = "王飞，你好，我叫布迪。",
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
                                "Nǐhǎo        wǒ jiào  Bùdí\n你好，我叫布迪。",
                                "Nǐhǎo        Bùdí\n你好，布迪。",
                                "Wǒ jiào    WángFēi\n我叫王飞。"
                            ),
                            correctAnswer = "Nǐhǎo        wǒ jiào  Bùdí\n你好，我叫布迪。",
                            audioToSpeak = "你好，我叫王飞。"
                        ),
                        // 6. Soal 6: Tata Bahasa Susunan Kata (我叫布迪。)
                        Exercise(
                            id = "u1_l2_q6",
                            type = ExerciseType.SENTENCE_CHOICE,
                            title = "Pilih kalimat yang benar secara tata bahasa",
                            options = listOf(
                                "Wǒ jiào  Bùdí\n我 叫 布迪 。",
                                "Wǒ  Bùdí  jiào\n我 布迪 叫 。"
                            ),
                            correctAnswer = "Wǒ jiào  Bùdí\n我 叫 布迪 。"
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
                            targetHanzi = "你好，我叫王飞。",
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
                            targetHanzi = "我是老师。",
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
                            targetHanzi = "布迪是学生。",
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
                            targetHanzi = "老师，你好，我是印尼人。",
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
                                "Nǐhǎo    lǎoshī shì wǒ\n你好 ， 老师 是 我 。",
                                "Nǐhǎo    wǒ shì lǎoshī\n你好 ， 我 是 老师 。"
                            ),
                            correctAnswer = "Nǐhǎo    wǒ shì lǎoshī\n你好 ， 我 是 老师 。"
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
                            targetHanzi = "我是印度尼西亚人。",
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
                            targetHanzi = "布迪是老师。",
                            targetPinyin = "Bùdí shì lǎoshī.",
                            targetTranslation = "Budi adalah seorang guru.",
                            illustrationRes = R.drawable.img_teacher_budi,
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
                            targetHanzi = "我叫王飞。",
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
                            targetHanzi = "我是学生。",
                            targetPinyin = "Wǒ shì xuéshēng.",
                            targetTranslation = "Saya adalah seorang murid.",
                            illustrationRes = R.drawable.img_student_boy,
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
                            targetHanzi = "你好，我叫布迪。",
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
                            targetHanzi = "我是印度尼西亚人。",
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
                            targetHanzi = "我是老师。",
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
                            targetHanzi = "你是中国 人吗？",
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
                            targetHanzi = "你是老师吗？",
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
                                "Bùdí  shì  Yìnní  rén ma\n布迪是印尼人吗？",
                                "Bùdí  shì Zhōngguó  rén ma\n布迪是 中国 人吗？",
                                "Tā  shì Zhōngguó  rén ma\n他是 中国 人吗？",
                                "Nǐ  shì Zhōngguó  rén ma\n你是 中国 人吗？"
                            ),
                            correctAnswer = "Bùdí  shì Zhōngguó  rén ma\n布迪是 中国 人吗？",
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
                            targetHanzi = "他是 学生 吗？",
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
                            targetHanzi = "你是中国人吗？",
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
                            targetHanzi = "你是学生吗？",
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
                            targetHanzi = "你是中国 人吗？",
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
                            targetHanzi = "你是老师吗？",
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
                                "Bùdí  shì  Yìnní  rén ma\n布迪是印尼人吗？",
                                "Bùdí  shì Zhōngguó  rén ma\n布迪是 中国 人吗？",
                                "Wǒ  shì  Zhōngguó  rén ma\n我是中国 人吗？",
                                "Bùdí  shì  lǎoshī  ma\n布迪是老师吗？"
                            ),
                            correctAnswer = "Bùdí  shì Zhōngguó  rén ma\n布迪是 中国 人吗？",
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
                            targetHanzi = "他是 学生 吗？",
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
                            targetHanzi = "你是中国人吗？",
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
                            targetHanzi = "你是学生吗？",
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
                            targetHanzi = "我不是 学生 。",
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
                            targetHanzi = "她不叫 王飞 。",
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
                            targetHanzi = "我不是医生。",
                            targetPinyin = "Wǒ bú shì yīshēng.",
                            targetTranslation = "Saya bukan seorang dokter.",
                            wordChips = listOf("叫:jiào", "不:bù", "学生:xuéshēng", "老师:lǎoshī", "人:rén", "医生:yīshēng"),
                            correctAnswer = "不,医生",
                            audioToSpeak = "我不是医生。",
                            isImmersiveSpeaker = true,
                            illustrationRes = R.drawable.img_girl_cap_glasses
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
                                "Wǒ bú shì yīshēng\n我不是 医生 。",
                                "Tā bú jiào WángFēi\n她不叫 王飞 。",
                                "Tā bú shì lǎoshī\n她不是 老师 。",
                                "Wǒ bú shì xuéshēng\n我不是 学生 。"
                            ),
                            correctAnswer = "Tā bú shì lǎoshī\n她不是 老师 。",
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
                            targetHanzi = "她不是印度尼西亚人。",
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
                            targetHanzi = "她不叫 王飞 。",
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
                            targetHanzi = "你是老师吗？",
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
                            targetHanzi = "他是学生吗？",
                            targetPinyin = "Tā shì xuéshēng ma?",
                            targetTranslation = "Apakah dia seorang murid?",
                            wordChips = listOf("人:rén", "叫:jiào", "你:nǐ", "他:tā", "是:shì", "吗:ma"),
                            correctAnswer = "他,是,吗",
                            audioToSpeak = "他是学生吗？",
                            isImmersiveSpeaker = true,
                            illustrationRes = R.drawable.img_two_students_studying
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
                                "Bùdí  shì  Yìnní  rén ma\n布迪是印尼人吗？",
                                "Nǐ jiào Bùdí ma\n你叫布迪吗？",
                                "Bùdí  shì  lǎoshī  ma\n布迪是老师吗？"
                            ),
                            correctAnswer = "Bùdí  shì  Yìnní  rén ma\n布迪是印尼人吗？"
                        ),
                        // 5. Soal 5: Pilih kalimat yang benar secara tata bahasa
                        Exercise(
                            id = "u1_l4_p1_q5",
                            type = ExerciseType.SENTENCE_CHOICE,
                            title = "Pilih kalimat yang benar secara tata bahasa",
                            options = listOf(
                                "Shì  nǐ  Zhōngguó  rén ma\n是你 中国 人吗？",
                                "Nǐ  shì  Zhōngguó  rén ma\n你是 中国 人吗？"
                            ),
                            correctAnswer = "Nǐ  shì  Zhōngguó  rén ma\n你是 中国 人吗？",
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
                                "Wǒ  shì  Zhōngguó  rén\n我是 中国 人。",
                                "Wǒ  shì  lǎoshī\n我是 老师 。",
                                "Tā  jiào  Wáng  Fēi\n他叫 王飞 。"
                            ),
                            correctAnswer = "Wǒ  shì  Zhōngguó  rén\n我是 中国 人。"
                        ),
                        // 8. Soal 8: Terjemahkan kalimat ini (Apakah kamu seorang murid? -> 你是学生吗？)
                        Exercise(
                            id = "u1_l4_p1_q8",
                            type = ExerciseType.SENTENCE_BUILDER,
                            title = "Terjemahkan kalimat ini",
                            targetTranslation = "Apakah kamu seorang murid?",
                            targetHanzi = "你是学生吗？",
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
                            targetHanzi = "你是老师吗？",
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
                            targetHanzi = "他是学生吗？",
                            targetPinyin = "Tā shì xuéshēng ma?",
                            targetTranslation = "Apakah dia seorang murid?",
                            wordChips = listOf("人:rén", "叫:jiào", "你:nǐ", "他:tā", "是:shì", "吗:ma"),
                            correctAnswer = "他,是,吗",
                            audioToSpeak = "他是学生吗？",
                            isImmersiveSpeaker = true,
                            illustrationRes = R.drawable.img_two_students_studying
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
                                "Bùdí  shì  Yìnní  rén ma\n布迪是印尼人吗？",
                                "Nǐ jiào Bùdí ma\n你叫布迪吗？",
                                "Bùdí  shì  lǎoshī  ma\n布迪是老师吗？"
                            ),
                            correctAnswer = "Bùdí  shì  Yìnní  rén ma\n布迪是印尼人吗？"
                        ),
                        // 5. Soal 5: Pilih kalimat yang benar secara tata bahasa
                        Exercise(
                            id = "u1_l4_p1_q5",
                            type = ExerciseType.SENTENCE_CHOICE,
                            title = "Pilih kalimat yang benar secara tata bahasa",
                            options = listOf(
                                "Shì  nǐ  Zhōngguó  rén ma\n是你 中国 人吗？",
                                "Nǐ  shì  Zhōngguó  rén ma\n你是 中国 人吗？"
                            ),
                            correctAnswer = "Nǐ  shì  Zhōngguó  rén ma\n你是 中国 人吗？",
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
                                "Wǒ  shì  Zhōngguó  rén\n我是 中国 人。",
                                "Wǒ  shì  lǎoshī\n我是 老师 。",
                                "Tā  jiào  Wáng  Fēi\n他叫 王飞 。"
                            ),
                            correctAnswer = "Wǒ  shì  Zhōngguó  rén\n我是 中国 人。"
                        ),
                        // 8. Soal 8: Terjemahkan kalimat ini (Apakah kamu seorang murid? -> 你是学生吗？)
                        Exercise(
                            id = "u1_l4_p1_q8",
                            type = ExerciseType.SENTENCE_BUILDER,
                            title = "Terjemahkan kalimat ini",
                            targetTranslation = "Apakah kamu seorang murid?",
                            targetHanzi = "你是学生吗？",
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
                                "Tā  bú  shì  yīshēng\n她不是 医生 。",
                                "Tā  bú  jiào  WángFēi\n她不叫 王飞 。",
                                "WángFēi  bú  shì  Zhōngguó  rén\n王飞 不是 中国 人。"
                            ),
                            correctAnswer = "Tā  bú  jiào  WángFēi\n她不叫 王飞 。"
                        ),
                        // 2. Soal 2: Lengkapi terjemahan (Sampai jumpa, Wang Fei. -> 王飞，[再见] 。)
                        Exercise(
                            id = "u1_l4_p2_q2",
                            type = ExerciseType.SENTENCE_BUILDER,
                            title = "Lengkapi terjemahan",
                            targetTranslation = "Sampai jumpa, Wang Fei.",
                            targetHanzi = "王飞，再见。",
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
                            illustrationRes = R.drawable.img_couple_peace_sign,
                            targetHanzi = "她不是中国人。",
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
                            targetHanzi = "她不是学生。",
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
                                "Tā  bú  jiào  WángFēi\n她不叫 王飞 。",
                                "Tā  jiào  bù  WángFēi\n她叫不 王飞 。",
                                "Tā  bù  WángFēi\n她不 王飞 。"
                            ),
                            correctAnswer = "Tā  bú  jiào  WángFēi\n她不叫 王飞 。",
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
                            targetHanzi = "我不是医生。",
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
                            targetHanzi = "布迪是老师。",
                            targetPinyin = "Bùdí shì lǎoshī.",
                            targetTranslation = "Budi adalah seorang guru.",
                            illustrationRes = R.drawable.img_teacher_budi,
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
                            targetHanzi = "我叫王飞。",
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
                            targetHanzi = "我是学生。",
                            targetPinyin = "Wǒ shì xuéshēng.",
                            targetTranslation = "Saya adalah seorang murid.",
                            illustrationRes = R.drawable.img_student_boy,
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
                            targetHanzi = "你好，我叫布迪。",
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
                            targetHanzi = "我是印度尼西亚人。",
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
                            targetHanzi = "我是老师。",
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
                            targetHanzi = "你是中国 人吗？",
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
                            targetHanzi = "你是老师吗？",
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
                                "Bùdí  shì  Yìnní  rén ma\n布迪是印尼人吗？",
                                "Bùdí  shì Zhōngguó  rén ma\n布迪是 中国 人吗？",
                                "Tā  shì Zhōngguó  rén ma\n他是 中国 人吗？",
                                "Nǐ  shì Zhōngguó  rén ma\n你是 中国 人吗？"
                            ),
                            correctAnswer = "Bùdí  shì Zhōngguó  rén ma\n布迪是 中国 人吗？",
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
                            targetHanzi = "他是 学生 吗？",
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
                            targetHanzi = "你是中国人吗？",
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
                            targetHanzi = "你是学生吗？",
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
                            targetHanzi = "你是中国 人吗？",
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
                            targetHanzi = "你是老师吗？",
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
                                "Bùdí  shì  Yìnní  rén ma\n布迪是印尼人吗？",
                                "Bùdí  shì Zhōngguó  rén ma\n布迪是 中国 人吗？",
                                "Wǒ  shì  Zhōngguó  rén ma\n我是中国 人吗？",
                                "Bùdí  shì  lǎoshī  ma\n布迪是老师吗？"
                            ),
                            correctAnswer = "Bùdí  shì Zhōngguó  rén ma\n布迪是 中国 人吗？",
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
                            targetHanzi = "他是 学生 吗？",
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
                            targetHanzi = "你是中国人吗？",
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
                            targetHanzi = "你是学生吗？",
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
                            targetHanzi = "我不是 学生 。",
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
                            targetHanzi = "她不叫 王飞 。",
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
                            targetHanzi = "我不是医生。",
                            targetPinyin = "Wǒ bú shì yīshēng.",
                            targetTranslation = "Saya bukan seorang dokter.",
                            wordChips = listOf("叫:jiào", "不:bù", "学生:xuéshēng", "老师:lǎoshī", "人:rén", "医生:yīshēng"),
                            correctAnswer = "不,医生",
                            audioToSpeak = "我不是医生。",
                            isImmersiveSpeaker = true,
                            illustrationRes = R.drawable.img_girl_cap_glasses
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
                                "Wǒ bú shì yīshēng\n我不是 医生 。",
                                "Tā bú jiào WángFēi\n她不叫 王飞 。",
                                "Tā bú shì lǎoshī\n她不是 老师 。",
                                "Wǒ bú shì xuéshēng\n我不是 学生 。"
                            ),
                            correctAnswer = "Tā bú shì lǎoshī\n她不是 老师 。",
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
                            targetHanzi = "她不是印度尼西亚人。",
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
                            targetHanzi = "她不叫 王飞 。",
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
                            targetHanzi = "你是老师吗？",
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
                            targetHanzi = "他是学生吗？",
                            targetPinyin = "Tā shì xuéshēng ma?",
                            targetTranslation = "Apakah dia seorang murid?",
                            wordChips = listOf("人:rén", "叫:jiào", "你:nǐ", "他:tā", "是:shì", "吗:ma"),
                            correctAnswer = "他,是,吗",
                            audioToSpeak = "他是学生吗？",
                            isImmersiveSpeaker = true,
                            illustrationRes = R.drawable.img_two_students_studying
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
                                "Bùdí  shì  Yìnní  rén ma\n布迪是印尼人吗？",
                                "Nǐ jiào Bùdí ma\n你叫布迪吗？",
                                "Bùdí  shì  lǎoshī  ma\n布迪是老师吗？"
                            ),
                            correctAnswer = "Bùdí  shì  Yìnní  rén ma\n布迪是印尼人吗？"
                        ),
                        // 5. Soal 5: Pilih kalimat yang benar secara tata bahasa
                        Exercise(
                            id = "u1_l4_p1_q5",
                            type = ExerciseType.SENTENCE_CHOICE,
                            title = "Pilih kalimat yang benar secara tata bahasa",
                            options = listOf(
                                "Shì  nǐ  Zhōngguó  rén ma\n是你 中国 人吗？",
                                "Nǐ  shì  Zhōngguó  rén ma\n你是 中国 人吗？"
                            ),
                            correctAnswer = "Nǐ  shì  Zhōngguó  rén ma\n你是 中国 人吗？",
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
                                "Wǒ  shì  Zhōngguó  rén\n我是 中国 人。",
                                "Wǒ  shì  lǎoshī\n我是 老师 。",
                                "Tā  jiào  Wáng  Fēi\n他叫 王飞 。"
                            ),
                            correctAnswer = "Wǒ  shì  Zhōngguó  rén\n我是 中国 人。"
                        ),
                        // 8. Soal 8: Terjemahkan kalimat ini (Apakah kamu seorang murid? -> 你是学生吗？)
                        Exercise(
                            id = "u1_l4_p1_q8",
                            type = ExerciseType.SENTENCE_BUILDER,
                            title = "Terjemahkan kalimat ini",
                            targetTranslation = "Apakah kamu seorang murid?",
                            targetHanzi = "你是学生吗？",
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
                            targetHanzi = "你是老师吗？",
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
                            targetHanzi = "他是学生吗？",
                            targetPinyin = "Tā shì xuéshēng ma?",
                            targetTranslation = "Apakah dia seorang murid?",
                            wordChips = listOf("人:rén", "叫:jiào", "你:nǐ", "他:tā", "是:shì", "吗:ma"),
                            correctAnswer = "他,是,吗",
                            audioToSpeak = "他是学生吗？",
                            isImmersiveSpeaker = true,
                            illustrationRes = R.drawable.img_two_students_studying
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
                                "Bùdí  shì  Yìnní  rén ma\n布迪是印尼人吗？",
                                "Nǐ jiào Bùdí ma\n你叫布迪吗？",
                                "Bùdí  shì  lǎoshī  ma\n布迪是老师吗？"
                            ),
                            correctAnswer = "Bùdí  shì  Yìnní  rén ma\n布迪是印尼人吗？"
                        ),
                        // 5. Soal 5: Pilih kalimat yang benar secara tata bahasa
                        Exercise(
                            id = "u1_l4_p1_q5",
                            type = ExerciseType.SENTENCE_CHOICE,
                            title = "Pilih kalimat yang benar secara tata bahasa",
                            options = listOf(
                                "Shì  nǐ  Zhōngguó  rén ma\n是你 中国 人吗？",
                                "Nǐ  shì  Zhōngguó  rén ma\n你是 中国 人吗？"
                            ),
                            correctAnswer = "Nǐ  shì  Zhōngguó  rén ma\n你是 中国 人吗？",
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
                                "Wǒ  shì  Zhōngguó  rén\n我是 中国 人。",
                                "Wǒ  shì  lǎoshī\n我是 老师 。",
                                "Tā  jiào  Wáng  Fēi\n他叫 王飞 。"
                            ),
                            correctAnswer = "Wǒ  shì  Zhōngguó  rén\n我是 中国 人。"
                        ),
                        // 8. Soal 8: Terjemahkan kalimat ini (Apakah kamu seorang murid? -> 你是学生吗？)
                        Exercise(
                            id = "u1_l4_p1_q8",
                            type = ExerciseType.SENTENCE_BUILDER,
                            title = "Terjemahkan kalimat ini",
                            targetTranslation = "Apakah kamu seorang murid?",
                            targetHanzi = "你是学生吗？",
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
                                "Tā  bú  shì  yīshēng\n她不是 医生 。",
                                "Tā  bú  jiào  WángFēi\n她不叫 王飞 。",
                                "WángFēi  bú  shì  Zhōngguó  rén\n王飞 不是 中国 人。"
                            ),
                            correctAnswer = "Tā  bú  jiào  WángFēi\n她不叫 王飞 。"
                        ),
                        // 2. Soal 2: Lengkapi terjemahan (Sampai jumpa, Wang Fei. -> 王飞，[再见] 。)
                        Exercise(
                            id = "u1_l4_p2_q2",
                            type = ExerciseType.SENTENCE_BUILDER,
                            title = "Lengkapi terjemahan",
                            targetTranslation = "Sampai jumpa, Wang Fei.",
                            targetHanzi = "王飞，再见。",
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
                            illustrationRes = R.drawable.img_couple_peace_sign,
                            targetHanzi = "她不是中国人。",
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
                            targetHanzi = "她不是学生。",
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
                                "Tā  bú  jiào  WángFēi\n她不叫 王飞 。",
                                "Tā  jiào  bù  WángFēi\n她叫不 王飞 。",
                                "Tā  bù  WángFēi\n她不 王飞 。"
                            ),
                            correctAnswer = "Tā  bú  jiào  WángFēi\n她不叫 王飞 。",
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
                            targetHanzi = "我不是医生。",
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
                            targetHanzi = "她是中国人吗？",
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
                            illustrationRes = R.drawable.img_buddy_elf_school,
                            targetHanzi = "我不是学生。",
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
                            targetHanzi = "他不是医生。",
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
                            targetHanzi = "中国再见。",
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
                            illustrationRes = R.drawable.img_shifu_kungfu_panda,
                            targetHanzi = "他是老师吗？",
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
                            targetHanzi = "她是医生吗？",
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
                            targetHanzi = "布迪是学生吗？",
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
                                "Wǒ  bú  shì  lǎoshī\n我不是老师。",
                                "Wǒ  bú  shì  Zhōngguó  rén\n我不是 中国 人。",
                                "Wǒ  shì  Yìnní  rén\n我是 印尼 人。"
                            ),
                            correctAnswer = "Wǒ  shì  Yìnní  rén\n我是 印尼 人。"
                        ),
                        // 3. Soal 3: Masukkan kata yang hilang (nǐhǎo -> 你好，我叫布迪，我是医生。)
                        Exercise(
                            id = "u1_l5_p1_q3",
                            type = ExerciseType.PINYIN_KEYBOARD,
                            title = "Masukkan kata yang hilang",
                            targetHanzi = "你好，我叫布迪，我是医生。",
                            targetPinyin = "Nǐhǎo, wǒ jiào Bùdí, wǒ shì yīshēng.",
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
                                "Wǒ  bú  shì  Zhōngguó  rén\n我不是 中国 人。",
                                "Wǒ  bú  jiào  WángFēi\n我不叫 王飞 。",
                                "Wǒ  bú  shì  lǎoshī\n我不是老师。"
                            ),
                            correctAnswer = "Wǒ  bú  jiào  WángFēi\n我不叫 王飞 。",
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
                            targetHanzi = "布迪不是中国人。",
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
                            targetHanzi = "他不叫布迪。",
                            targetPinyin = "Tā bú jiào Bùdí.",
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
                            targetHanzi = "你叫王飞吗？",
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
                            targetHanzi = "你是医生吗？",
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
                            targetHanzi = "王飞不是中国人。",
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
                            targetHanzi = "她是中国人。",
                            targetPinyin = "Tā shì Zhōngguó rén.",
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
                            targetHanzi = "他不叫王飞。",
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
                PathNode("u2_n1", "Angka 1-10", Color(0xFF03A9F4), NodeIconType.CAP, isCompleted = false, lessonId = "u2_l1"),
                PathNode("u2_n2", "Umur & Tahun", Color(0xFFFFC107), NodeIconType.CAP, isCompleted = false, lessonId = "u2_l1"),
                PathNode("u2_n3", "Latihan Waktu", Color(0xFFFFC107), NodeIconType.DUMBBELL, isCompleted = false, lessonId = "u2_l1"),
                PathNode("u2_n4", "Jam & Menit", Color(0xFFFFC107), NodeIconType.CAP, isCompleted = false, lessonId = "u2_l1"),
                PathNode("u2_n5", "Latihan Menit", Color(0xFFFFC107), NodeIconType.DUMBBELL, isCompleted = false, lessonId = "u2_l1"),
                PathNode("u2_n6", "Latihan Komprehensif", Color(0xFFFFC107), NodeIconType.SHUFFLE, isCompleted = false, lessonId = "u2_l1"),
                PathNode("u2_n7", "Kuis Cerita", Color(0xFFFFC107), NodeIconType.BOOK, isCompleted = false, lessonId = "u2_l1"),
                PathNode("u2_n8", "Checkpoint Peti", Color(0xFFFFB300), NodeIconType.CHEST, isCompleted = false, lessonId = "u2_l1"),
                PathNode("u2_n9", "Rest area", Color(0xFF03A9F4), NodeIconType.REST_AREA, isCompleted = false, lessonId = "u2_l1")
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
