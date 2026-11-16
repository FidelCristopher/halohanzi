package com.example.chineselearning.data.repository

import com.example.chineselearning.R
import com.example.chineselearning.data.model.Sentence
import com.example.chineselearning.data.model.Story
import com.example.chineselearning.data.model.StoryQuestion
import com.example.chineselearning.data.model.WordToken

val mandarinBeanStoriesPart8: List<Story> by lazy {
    listOf(
        // Cerita Mandarin Bean 101 (HSK 2): Where Is the Egg? (Di Mana Telurnya?)
        Story(
            id = "story_where_is_the_egg",
            titleHanzi = "鸡蛋在哪儿？",
            titlePinyin = "Jīdàn Zài Nǎr?",
            titleTranslation = "Where Is the Egg? (Di Mana Telurnya?)",
            level = "HSK 2",
            category = "Dapur & Humor",
            description = "Kepanikan lucu di dapur saat memasak mie instan mencari telur ayam yang ternyata ditaruh di dalam kantong saku.",
            coverEmoji = "🥚",
            coverImageRes = R.drawable.cover_story_where_is_the_egg,
            estimatedReadMinutes = 2,
            sentences = listOf(
                Sentence(
                    id = "s_whereegg_1",
                    hanzi = "老师：今天我们学了“鸡蛋”这个词，你们能用“鸡蛋”说一个句子吗？",
                    pinyin = "lǎo shī jīn tiān wǒ men xué le jī dàn zhè gè cí nǐ men néng yòng jī dàn shuō yī gè jù zi ma",
                    translation = "Guru Hari ini Kami / Kita Belajar Sudah (partikel perubahan situasi) Telur ayam This; these Classifier for people or objects in general Word You (plural) Bisa / Mampu / Boleh To use; to make use of; to employ Telur ayam Berbicara / Berkata One Classifier for people or objects in general Sentence Apakah (partikel tanya)",
                    tokens = listOf(
                        WordToken("老师", "lǎo shī", "Guru", "Tenaga pengajar"),
                        WordToken("今天", "jīn tiān", "Hari ini", "Keterangan waktu sekarang"),
                        WordToken("我们", "wǒ men", "Kami / Kita", "Kata ganti orang pertama jamak"),
                        WordToken("学", "xué", "Belajar", "Menuntut ilmu"),
                        WordToken("了", "le", "Sudah (partikel perubahan situasi)", "Partikel aspek selesainya tindakan"),
                        WordToken("鸡蛋", "jī dàn", "Telur ayam", "Bahan makanan kaya protein"),
                        WordToken("这", "zhè", "This; these", "Kosakata HSK 2: 这 (zhè)"),
                        WordToken("个", "gè", "Classifier for people or objects in general", "Kosakata HSK 2: 个 (gè)"),
                        WordToken("词", "cí", "Word", "Kosakata HSK 2: 词 (cí)"),
                        WordToken("你们", "nǐ men", "You (plural)", "Kosakata HSK 2: 你们 (nǐ men)"),
                        WordToken("能", "néng", "Bisa / Mampu / Boleh", "Kata bantu kemampuan atau izin"),
                        WordToken("用", "yòng", "To use; to make use of; to employ", "Kosakata HSK 2: 用 (yòng)"),
                        WordToken("鸡蛋", "jī dàn", "Telur ayam", "Bahan makanan kaya protein"),
                        WordToken("说", "shuō", "Berbicara / Berkata", "Menyampaikan ucapan"),
                        WordToken("一", "yī", "One", "Kosakata HSK 2: 一 (yī)"),
                        WordToken("个", "gè", "Classifier for people or objects in general", "Kosakata HSK 2: 个 (gè)"),
                        WordToken("句子", "jù zi", "Sentence", "Kosakata HSK 2: 句子 (jù zi)"),
                        WordToken("吗", "ma", "Apakah (partikel tanya)", "Partikel di akhir kalimat interogatif ya/tidak")
                    )
                ),
                Sentence(
                    id = "s_whereegg_2",
                    hanzi = "学生A：没问题。",
                    pinyin = "xué shēng méi wèn tí",
                    translation = "Siswa / Mahasiswa Belum / Tidak Question",
                    tokens = listOf(
                        WordToken("学生", "xué shēng", "Siswa / Mahasiswa", "Pelajar"),
                        WordToken("没", "méi", "Belum / Tidak", "Kata sangkalan untuk keberadaan atau masa lampau"),
                        WordToken("问题", "wèn tí", "Question", "Kosakata HSK 2: 问题 (wèn tí)")
                    )
                ),
                Sentence(
                    id = "s_whereegg_3",
                    hanzi = "鸡妈妈每天都会生一个鸡蛋。",
                    pinyin = "jī mā ma měi tiān dōu huì shēng yī gè jī dàn",
                    translation = "Fowl Ibu Each Hari Semua / Seluruhnya To be likely to; to be sure to To grow; to give birth; to produce; to be born One Classifier for people or objects in general Telur ayam",
                    tokens = listOf(
                        WordToken("鸡", "jī", "Fowl", "Kosakata HSK 2: 鸡 (jī)"),
                        WordToken("妈妈", "mā ma", "Ibu", "Anggota keluarga"),
                        WordToken("每", "měi", "Each", "Kosakata HSK 2: 每 (měi)"),
                        WordToken("天", "tiān", "Hari", "Satuan hari"),
                        WordToken("都", "dōu", "Semua / Seluruhnya", "Menyatakan keuniversalan subjek"),
                        WordToken("会", "huì", "To be likely to; to be sure to", "Kosakata HSK 2: 会 (huì)"),
                        WordToken("生", "shēng", "To grow; to give birth; to produce; to be born", "Kosakata HSK 2: 生 (shēng)"),
                        WordToken("一", "yī", "One", "Kosakata HSK 2: 一 (yī)"),
                        WordToken("个", "gè", "Classifier for people or objects in general", "Kosakata HSK 2: 个 (gè)"),
                        WordToken("鸡蛋", "jī dàn", "Telur ayam", "Bahan makanan kaya protein")
                    )
                ),
                Sentence(
                    id = "s_whereegg_4",
                    hanzi = "老师：很好。",
                    pinyin = "lǎo shī hěn hǎo",
                    translation = "Guru Sangat Bagus / Baik",
                    tokens = listOf(
                        WordToken("老师", "lǎo shī", "Guru", "Tenaga pengajar"),
                        WordToken("很", "hěn", "Sangat", "Tingkat derajat"),
                        WordToken("好", "hǎo", "Bagus / Baik", "Kualitas positif")
                    )
                ),
                Sentence(
                    id = "s_whereegg_5",
                    hanzi = "学生B：我昨天吃了一块蛋糕。",
                    pinyin = "xué shēng wǒ zuó tiān chī le yī kuài dàn gāo",
                    translation = "Siswa / Mahasiswa Saya Kemarin Makan Sudah (partikel perubahan situasi) One Classifier for pieces of cloth, cake, soap etc Kue tart / Cake",
                    tokens = listOf(
                        WordToken("学生", "xué shēng", "Siswa / Mahasiswa", "Pelajar"),
                        WordToken("我", "wǒ", "Saya", "Kata ganti orang pertama tunggal"),
                        WordToken("昨天", "zuó tiān", "Kemarin", "Keterangan waktu lampau"),
                        WordToken("吃", "chī", "Makan", "Aktivitas mengonsumsi makanan"),
                        WordToken("了", "le", "Sudah (partikel perubahan situasi)", "Partikel aspek selesainya tindakan"),
                        WordToken("一", "yī", "One", "Kosakata HSK 2: 一 (yī)"),
                        WordToken("块", "kuài", "Classifier for pieces of cloth, cake, soap etc", "Kosakata HSK 2: 块 (kuài)"),
                        WordToken("蛋糕", "dàn gāo", "Kue tart / Cake", "Makanan manis perayaan")
                    )
                ),
                Sentence(
                    id = "s_whereegg_6",
                    hanzi = "老师：什么？",
                    pinyin = "lǎo shī shén me",
                    translation = "Guru What?",
                    tokens = listOf(
                        WordToken("老师", "lǎo shī", "Guru", "Tenaga pengajar"),
                        WordToken("什么", "shén me", "What?", "Kosakata HSK 2: 什么 (shén me)")
                    )
                ),
                Sentence(
                    id = "s_whereegg_7",
                    hanzi = "“鸡蛋”在哪儿？",
                    pinyin = "jī dàn zài nǎ r",
                    translation = "Telur ayam Di / Berada di Di mana",
                    tokens = listOf(
                        WordToken("鸡蛋", "jī dàn", "Telur ayam", "Bahan makanan kaya protein"),
                        WordToken("在", "zài", "Di / Berada di", "Preposisi lokasi atau aspek progresif"),
                        WordToken("哪儿", "nǎ r", "Di mana", "Kata tanya tempat")
                    )
                ),
                Sentence(
                    id = "s_whereegg_8",
                    hanzi = "学生B：鸡蛋在蛋糕里呀。",
                    pinyin = "xué shēng jī dàn zài dàn gāo lǐ ya",
                    translation = "Siswa / Mahasiswa Telur ayam Di / Berada di Kue tart / Cake Lining (particle equivalent to 啊 after a vowel, expressing surprise or doubt)",
                    tokens = listOf(
                        WordToken("学生", "xué shēng", "Siswa / Mahasiswa", "Pelajar"),
                        WordToken("鸡蛋", "jī dàn", "Telur ayam", "Bahan makanan kaya protein"),
                        WordToken("在", "zài", "Di / Berada di", "Preposisi lokasi atau aspek progresif"),
                        WordToken("蛋糕", "dàn gāo", "Kue tart / Cake", "Makanan manis perayaan"),
                        WordToken("里", "lǐ", "Lining", "Kosakata HSK 2: 里 (lǐ)"),
                        WordToken("呀", "ya", "(particle equivalent to 啊 after a vowel, expressing surprise or doubt)", "Kosakata HSK 2: 呀 (ya)")
                    )
                ),
                Sentence(
                    id = "s_whereegg_9",
                    hanzi = "老师，这么简单的事情，你不知道吗？",
                    pinyin = "lǎo shī zhè me jiǎn dān de shì qing nǐ bù zhī dào ma",
                    translation = "Guru So much Simple; not complicated Punya / Yang (partikel posesif) Affair; matter; thing; business Kamu Tidak Tahu / Mengetahui Apakah (partikel tanya)",
                    tokens = listOf(
                        WordToken("老师", "lǎo shī", "Guru", "Tenaga pengajar"),
                        WordToken("这么", "zhè me", "So much", "Kosakata HSK 2: 这么 (zhè me)"),
                        WordToken("简单", "jiǎn dān", "Simple; not complicated", "Kosakata HSK 2: 简单 (jiǎn dān)"),
                        WordToken("的", "de", "Punya / Yang (partikel posesif)", "Partikel penjelas modifikasi atau kepemilikan"),
                        WordToken("事情", "shì qing", "Affair; matter; thing; business", "Kosakata HSK 2: 事情 (shì qing)"),
                        WordToken("你", "nǐ", "Kamu", "Kata ganti orang kedua tunggal"),
                        WordToken("不", "bù", "Tidak", "Kata sangkalan untuk masa kini atau masa depan"),
                        WordToken("知道", "zhī dào", "Tahu / Mengetahui", "Memiliki informasi"),
                        WordToken("吗", "ma", "Apakah (partikel tanya)", "Partikel di akhir kalimat interogatif ya/tidak")
                    )
                )
            ),
            questions = listOf(
                StoryQuestion(
                    id = "q_whereegg_1",
                    questionText = "主角打算在厨房做什么好吃的？ (Apa yang hendak dimasak oleh tokoh utama di dapur?)",
                    options = listOf("煮一碗香喷喷的鸡蛋面 (Memasak semangkuk mie kuah dengan telur lezat)", "烤鸭 (Memanggang bebek)", "包包子 (Membuat bakpao)", "炸薯条 (Menggoreng kentang)"),
                    correctAnswerIndex = 0,
                    explanation = "Ia berniat memasak santapan praktis berupa semangkuk mie rebus berprotein telur."
                ),
                StoryQuestion(
                    id = "q_whereegg_2",
                    questionText = "他在做饭过程中急急忙忙在找什么？ (Benda apa yang dicari dengan panik selama proses memasak?)",
                    options = listOf("刚买回来的新鲜鸡蛋 (Telur ayam segar yang baru saja dibeli)", "大铁锅 (Kuali besi besar)", "菜刀 (Pisau dapur)", "筷子 (Sepasang sumpit)"),
                    correctAnswerIndex = 0,
                    explanation = "Bahan utama telur ayam tidak tampak di rak meja dapur."
                ),
                StoryQuestion(
                    id = "q_whereegg_3",
                    questionText = "最后他在哪里找到了那个“失踪”的鸡蛋？ (Di manakah akhirnya telur yang 'lenyap' tersebut berhasil ditemukan?)",
                    options = listOf("在外套的宽大口袋里 (Di dalam saku jaket hangat yang sedang ia kenakan sendiri)", "在床底下 (Di bawah kolong tempat tidur)", "在书包里 (Di dalam ransel sekolah)", "在微波炉里 (Di dalam oven microwave)"),
                    correctAnswerIndex = 0,
                    explanation = "Ternyata telur tersebut masih tersimpan aman di saku baju saat ia meraba kantongnya."
                ),
                StoryQuestion(
                    id = "q_whereegg_4",
                    questionText = "这个生活小故事体现了什么生活情趣？ (Sisi menarik apakah yang tercermin dari cerita keseharian ini?)",
                    options = listOf("粗心大意带来的逗趣幽默 (Kelucuan menggemaskan akibat sifat pelupa sesaat)", "做饭太危险 (Memasak itu berbahaya)", "鸡蛋不好吃 (Telur itu tidak enak)", "不要穿外套 (Jangan mengenakan jaket)"),
                    correctAnswerIndex = 0,
                    explanation = "Kejadian pelupa yang manusiawi kerap menjadi bahan tawa manis dalam memori dapur."
                )
            )
        ),
        // Cerita Mandarin Bean 102 (HSK 2): Lottery (Lotre)
        Story(
            id = "story_lottery",
            titleHanzi = "彩票",
            titlePinyin = "Cǎipiào",
            titleTranslation = "Lottery (Lotre)",
            level = "HSK 2",
            category = "Harapan & Keberuntungan",
            description = "Kisah angan-angan seorang pemuda yang membeli tiket lotre dan bermimpi keliling dunia.",
            coverEmoji = "🎟️",
            coverImageRes = R.drawable.cover_story_lottery,
            estimatedReadMinutes = 2,
            sentences = listOf(
                Sentence(
                    id = "s_lottery_1",
                    hanzi = "有一个人在一家汉语学校工作，他每个月都会把工资给他的妻子，而妻子只会给丈夫每天在学校吃东西的钱。",
                    pinyin = "yǒu yī gè rén zài yī jiā Hàn yǔ xué xiào gōng zuò tā měi gè yuè dōu huì bǎ gōng zī gěi tā de qī zi ér qī zi zhǐ huì gěi zhàng fu měi tiān zài xué xiào chī dōng xi de qián",
                    translation = "Mempunyai / Ada One Classifier for people or objects in general Person; people Di / Berada di One Rumah / Keluarga Chinese language Sekolah Bekerja Dia (laki-laki) Each Classifier for people or objects in general Bulan Semua / Seluruhnya To be likely to; to be sure to (used to put the object before the verb: 把[ba3] + {noun} + {verb}) Wages; pay Memberi / Kepada Dia (laki-laki) Punya / Yang (partikel posesif) Istri But (not) Istri Only; merely; just To be likely to; to be sure to Memberi / Kepada Suami Each Hari Di / Berada di Sekolah Makan Thing Punya / Yang (partikel posesif) Coin",
                    tokens = listOf(
                        WordToken("有", "yǒu", "Mempunyai / Ada", "Menyatakan kepemilikan atau eksistensi"),
                        WordToken("一", "yī", "One", "Kosakata HSK 2: 一 (yī)"),
                        WordToken("个", "gè", "Classifier for people or objects in general", "Kosakata HSK 2: 个 (gè)"),
                        WordToken("人", "rén", "Person; people", "Kosakata HSK 2: 人 (rén)"),
                        WordToken("在", "zài", "Di / Berada di", "Preposisi lokasi atau aspek progresif"),
                        WordToken("一", "yī", "One", "Kosakata HSK 2: 一 (yī)"),
                        WordToken("家", "jiā", "Rumah / Keluarga", "Tempat tinggal"),
                        WordToken("汉语", "Hàn yǔ", "Chinese language", "Kosakata HSK 2: 汉语 (Hàn yǔ)"),
                        WordToken("学校", "xué xiào", "Sekolah", "Institusi pendidikan"),
                        WordToken("工作", "gōng zuò", "Bekerja", "Aktivitas mata pencaharian"),
                        WordToken("他", "tā", "Dia (laki-laki)", "Kata ganti orang ketiga tunggal"),
                        WordToken("每", "měi", "Each", "Kosakata HSK 2: 每 (měi)"),
                        WordToken("个", "gè", "Classifier for people or objects in general", "Kosakata HSK 2: 个 (gè)"),
                        WordToken("月", "yuè", "Bulan", "Satuan bulan"),
                        WordToken("都", "dōu", "Semua / Seluruhnya", "Menyatakan keuniversalan subjek"),
                        WordToken("会", "huì", "To be likely to; to be sure to", "Kosakata HSK 2: 会 (huì)"),
                        WordToken("把", "bǎ", "(used to put the object before the verb: 把[ba3] + {noun} + {verb})", "Kosakata HSK 2: 把 (bǎ)"),
                        WordToken("工资", "gōng zī", "Wages; pay", "Kosakata HSK 2: 工资 (gōng zī)"),
                        WordToken("给", "gěi", "Memberi / Kepada", "Tindakan memberi atau preposisi sasaran"),
                        WordToken("他", "tā", "Dia (laki-laki)", "Kata ganti orang ketiga tunggal"),
                        WordToken("的", "de", "Punya / Yang (partikel posesif)", "Partikel penjelas modifikasi atau kepemilikan"),
                        WordToken("妻子", "qī zi", "Istri", "Pasangan hidup perempuan"),
                        WordToken("而", "ér", "But (not)", "Kosakata HSK 2: 而 (ér)"),
                        WordToken("妻子", "qī zi", "Istri", "Pasangan hidup perempuan"),
                        WordToken("只", "zhǐ", "Only; merely; just", "Kosakata HSK 2: 只 (zhǐ)"),
                        WordToken("会", "huì", "To be likely to; to be sure to", "Kosakata HSK 2: 会 (huì)"),
                        WordToken("给", "gěi", "Memberi / Kepada", "Tindakan memberi atau preposisi sasaran"),
                        WordToken("丈夫", "zhàng fu", "Suami", "Pasangan hidup laki-laki"),
                        WordToken("每", "měi", "Each", "Kosakata HSK 2: 每 (měi)"),
                        WordToken("天", "tiān", "Hari", "Satuan hari"),
                        WordToken("在", "zài", "Di / Berada di", "Preposisi lokasi atau aspek progresif"),
                        WordToken("学校", "xué xiào", "Sekolah", "Institusi pendidikan"),
                        WordToken("吃", "chī", "Makan", "Aktivitas mengonsumsi makanan"),
                        WordToken("东西", "dōng xi", "Thing", "Kosakata HSK 2: 东西 (dōng xi)"),
                        WordToken("的", "de", "Punya / Yang (partikel posesif)", "Partikel penjelas modifikasi atau kepemilikan"),
                        WordToken("钱", "qián", "Coin", "Kosakata HSK 2: 钱 (qián)")
                    )
                ),
                Sentence(
                    id = "s_lottery_2",
                    hanzi = "有一天，这个丈夫很高兴地跑回家，看见妻子正在家里一边吃水果一边玩手机。",
                    pinyin = "yǒu yī tiān zhè gè zhàng fu hěn gāo xìng de pǎo huí jiā kàn jiàn qī zi zhèng zài jiā lǐ yī biān chī shuǐ guǒ yī biān wán shǒu jī",
                    translation = "Mempunyai / Ada One Hari This; these Classifier for people or objects in general Suami Sangat Senang / Gembira Secara (partikel adverbia) To run Kembali / Pulang Rumah / Keluarga To see; to catch sight of Istri To be in the process of (doing sth); to be currently ...-ing Rumah / Keluarga Lining On the one hand Makan Fruit On the one hand To play Cell phone; mobile phone",
                    tokens = listOf(
                        WordToken("有", "yǒu", "Mempunyai / Ada", "Menyatakan kepemilikan atau eksistensi"),
                        WordToken("一", "yī", "One", "Kosakata HSK 2: 一 (yī)"),
                        WordToken("天", "tiān", "Hari", "Satuan hari"),
                        WordToken("这", "zhè", "This; these", "Kosakata HSK 2: 这 (zhè)"),
                        WordToken("个", "gè", "Classifier for people or objects in general", "Kosakata HSK 2: 个 (gè)"),
                        WordToken("丈夫", "zhàng fu", "Suami", "Pasangan hidup laki-laki"),
                        WordToken("很", "hěn", "Sangat", "Tingkat derajat"),
                        WordToken("高兴", "gāo xìng", "Senang / Gembira", "Perasaan ceria bahagia"),
                        WordToken("地", "de", "Secara (partikel adverbia)", "Partikel penanda kata keterangan sifat tindakan"),
                        WordToken("跑", "pǎo", "To run", "Kosakata HSK 2: 跑 (pǎo)"),
                        WordToken("回", "huí", "Kembali / Pulang", "Menuju ke tempat asal"),
                        WordToken("家", "jiā", "Rumah / Keluarga", "Tempat tinggal"),
                        WordToken("看见", "kàn jiàn", "To see; to catch sight of", "Kosakata HSK 2: 看见 (kàn jiàn)"),
                        WordToken("妻子", "qī zi", "Istri", "Pasangan hidup perempuan"),
                        WordToken("正在", "zhèng zài", "To be in the process of (doing sth); to be currently ...-ing", "Kosakata HSK 2: 正在 (zhèng zài)"),
                        WordToken("家", "jiā", "Rumah / Keluarga", "Tempat tinggal"),
                        WordToken("里", "lǐ", "Lining", "Kosakata HSK 2: 里 (lǐ)"),
                        WordToken("一边", "yī biān", "On the one hand", "Kosakata HSK 2: 一边 (yī biān)"),
                        WordToken("吃", "chī", "Makan", "Aktivitas mengonsumsi makanan"),
                        WordToken("水果", "shuǐ guǒ", "Fruit", "Kosakata HSK 2: 水果 (shuǐ guǒ)"),
                        WordToken("一边", "yī biān", "On the one hand", "Kosakata HSK 2: 一边 (yī biān)"),
                        WordToken("玩", "wán", "To play", "Kosakata HSK 2: 玩 (wán)"),
                        WordToken("手机", "shǒu jī", "Cell phone; mobile phone", "Kosakata HSK 2: 手机 (shǒu jī)")
                    )
                ),
                Sentence(
                    id = "s_lottery_3",
                    hanzi = "他走到妻子身边说：“你猜猜今天发生了什么？”",
                    pinyin = "tā zǒu dào qī zi shēn biān shuō nǐ cāi cāi jīn tiān fā shēng le shén me",
                    translation = "Dia (laki-laki) To walk To reach; to arrive Istri At one&#x27;s side Berbicara / Berkata Kamu To guess To guess Hari ini To happen; to occur; to take place; to break out Sudah (partikel perubahan situasi) What?",
                    tokens = listOf(
                        WordToken("他", "tā", "Dia (laki-laki)", "Kata ganti orang ketiga tunggal"),
                        WordToken("走", "zǒu", "To walk", "Kosakata HSK 2: 走 (zǒu)"),
                        WordToken("到", "dào", "To reach; to arrive", "Kosakata HSK 2: 到 (dào)"),
                        WordToken("妻子", "qī zi", "Istri", "Pasangan hidup perempuan"),
                        WordToken("身边", "shēn biān", "At one&#x27;s side", "Kosakata HSK 2: 身边 (shēn biān)"),
                        WordToken("说", "shuō", "Berbicara / Berkata", "Menyampaikan ucapan"),
                        WordToken("你", "nǐ", "Kamu", "Kata ganti orang kedua tunggal"),
                        WordToken("猜", "cāi", "To guess", "Kosakata HSK 2: 猜 (cāi)"),
                        WordToken("猜", "cāi", "To guess", "Kosakata HSK 2: 猜 (cāi)"),
                        WordToken("今天", "jīn tiān", "Hari ini", "Keterangan waktu sekarang"),
                        WordToken("发生", "fā shēng", "To happen; to occur; to take place; to break out", "Kosakata HSK 2: 发生 (fā shēng)"),
                        WordToken("了", "le", "Sudah (partikel perubahan situasi)", "Partikel aspek selesainya tindakan"),
                        WordToken("什么", "shén me", "What?", "Kosakata HSK 2: 什么 (shén me)")
                    )
                ),
                Sentence(
                    id = "s_lottery_4",
                    hanzi = "妻子说：“学校发钱了？”",
                    pinyin = "qī zi shuō xué xiào fā qián le",
                    translation = "Istri Berbicara / Berkata Sekolah To send out Coin Sudah (partikel perubahan situasi)",
                    tokens = listOf(
                        WordToken("妻子", "qī zi", "Istri", "Pasangan hidup perempuan"),
                        WordToken("说", "shuō", "Berbicara / Berkata", "Menyampaikan ucapan"),
                        WordToken("学校", "xué xiào", "Sekolah", "Institusi pendidikan"),
                        WordToken("发", "fā", "To send out", "Kosakata HSK 2: 发 (fā)"),
                        WordToken("钱", "qián", "Coin", "Kosakata HSK 2: 钱 (qián)"),
                        WordToken("了", "le", "Sudah (partikel perubahan situasi)", "Partikel aspek selesainya tindakan")
                    )
                ),
                Sentence(
                    id = "s_lottery_5",
                    hanzi = "丈夫笑着摇头。",
                    pinyin = "zhàng fu xiào zhe yáo tóu",
                    translation = "Suami Tersenyum / Tertawa Aspect particle indicating action in progress or ongoing state To shake Head",
                    tokens = listOf(
                        WordToken("丈夫", "zhàng fu", "Suami", "Pasangan hidup laki-laki"),
                        WordToken("笑", "xiào", "Tersenyum / Tertawa", "Ekspresi kegembiraan"),
                        WordToken("着", "zhe", "Aspect particle indicating action in progress or ongoing state", "Kosakata HSK 2: 着 (zhe)"),
                        WordToken("摇", "yáo", "To shake", "Kosakata HSK 2: 摇 (yáo)"),
                        WordToken("头", "tóu", "Head", "Kosakata HSK 2: 头 (tóu)")
                    )
                ),
                Sentence(
                    id = "s_lottery_6",
                    hanzi = "妻子又猜：“你的学生考试第一？”",
                    pinyin = "qī zi yòu cāi nǐ de xué shēng kǎo shì dì yī",
                    translation = "Istri Lagi (telah terjadi) To guess Kamu Punya / Yang (partikel posesif) Siswa / Mahasiswa Exam (prefix indicating ordinal number) One",
                    tokens = listOf(
                        WordToken("妻子", "qī zi", "Istri", "Pasangan hidup perempuan"),
                        WordToken("又", "yòu", "Lagi (telah terjadi)", "Pengulangan tindakan lampau"),
                        WordToken("猜", "cāi", "To guess", "Kosakata HSK 2: 猜 (cāi)"),
                        WordToken("你", "nǐ", "Kamu", "Kata ganti orang kedua tunggal"),
                        WordToken("的", "de", "Punya / Yang (partikel posesif)", "Partikel penjelas modifikasi atau kepemilikan"),
                        WordToken("学生", "xué shēng", "Siswa / Mahasiswa", "Pelajar"),
                        WordToken("考试", "kǎo shì", "Exam", "Kosakata HSK 2: 考试 (kǎo shì)"),
                        WordToken("第", "dì", "(prefix indicating ordinal number)", "Kosakata HSK 2: 第 (dì)"),
                        WordToken("一", "yī", "One", "Kosakata HSK 2: 一 (yī)")
                    )
                ),
                Sentence(
                    id = "s_lottery_7",
                    hanzi = "丈夫说：“都不是！",
                    pinyin = "zhàng fu shuō dōu bù shì",
                    translation = "Suami Berbicara / Berkata Semua / Seluruhnya Is not",
                    tokens = listOf(
                        WordToken("丈夫", "zhàng fu", "Suami", "Pasangan hidup laki-laki"),
                        WordToken("说", "shuō", "Berbicara / Berkata", "Menyampaikan ucapan"),
                        WordToken("都", "dōu", "Semua / Seluruhnya", "Menyatakan keuniversalan subjek"),
                        WordToken("不是", "bù shì", "Is not", "Kosakata HSK 2: 不是 (bù shì)")
                    )
                ),
                Sentence(
                    id = "s_lottery_8",
                    hanzi = "我买的彩票中了五十万元！”",
                    pinyin = "wǒ mǎi de cǎi piào zhòng le wǔ shí wàn yuán",
                    translation = "Saya Membeli Punya / Yang (partikel posesif) Lottery ticket To hit (a target) Sudah (partikel perubahan situasi) Fifty Ten thousand Currency unit (esp. chinese yuan)",
                    tokens = listOf(
                        WordToken("我", "wǒ", "Saya", "Kata ganti orang pertama tunggal"),
                        WordToken("买", "mǎi", "Membeli", "Transaksi belanja"),
                        WordToken("的", "de", "Punya / Yang (partikel posesif)", "Partikel penjelas modifikasi atau kepemilikan"),
                        WordToken("彩票", "cǎi piào", "Lottery ticket", "Kosakata HSK 2: 彩票 (cǎi piào)"),
                        WordToken("中", "zhòng", "To hit (a target)", "Kosakata HSK 2: 中 (zhòng)"),
                        WordToken("了", "le", "Sudah (partikel perubahan situasi)", "Partikel aspek selesainya tindakan"),
                        WordToken("五十", "wǔ shí", "Fifty", "Kosakata HSK 2: 五十 (wǔ shí)"),
                        WordToken("万", "wàn", "Ten thousand", "Kosakata HSK 2: 万 (wàn)"),
                        WordToken("元", "yuán", "Currency unit (esp. chinese yuan)", "Kosakata HSK 2: 元 (yuán)")
                    )
                ),
                Sentence(
                    id = "s_lottery_9",
                    hanzi = "妻子高兴得跳起来：“真是太好了！”",
                    pinyin = "qī zi gāo xìng de tiào qǐ lái zhēn shì tài hǎo le",
                    translation = "Istri Senang / Gembira Dengan (partikel pelengkap derajat) To jump Indicating the beginning and continuation of an action or a state Sungguh / Benar-benar Adalah Terlalu Bagus / Baik Sudah (partikel perubahan situasi)",
                    tokens = listOf(
                        WordToken("妻子", "qī zi", "Istri", "Pasangan hidup perempuan"),
                        WordToken("高兴", "gāo xìng", "Senang / Gembira", "Perasaan ceria bahagia"),
                        WordToken("得", "de", "Dengan (partikel pelengkap derajat)", "Partikel penunjuk derajat hasil tindakan"),
                        WordToken("跳", "tiào", "To jump", "Kosakata HSK 2: 跳 (tiào)"),
                        WordToken("起来", "qǐ lái", "Indicating the beginning and continuation of an action or a state", "Kosakata HSK 2: 起来 (qǐ lái)"),
                        WordToken("真", "zhēn", "Sungguh / Benar-benar", "Menyatakan keaslian rasa"),
                        WordToken("是", "shì", "Adalah", "Kopula penjelas"),
                        WordToken("太", "tài", "Terlalu", "Derajat melampaui batas"),
                        WordToken("好", "hǎo", "Bagus / Baik", "Kualitas positif"),
                        WordToken("了", "le", "Sudah (partikel perubahan situasi)", "Partikel aspek selesainya tindakan")
                    )
                ),
                Sentence(
                    id = "s_lottery_10",
                    hanzi = "但是过了一会儿，妻子突然又生气地看着丈夫，说：“等等！",
                    pinyin = "dàn shì guò le yī huì r qī zi tū rán yòu shēng qì de kàn zhe zhàng fu shuō děng děng",
                    translation = "Tetapi / Namun To cross Sudah (partikel perubahan situasi) A moment Istri Sudden; abrupt; unexpected Lagi (telah terjadi) To get angry; to be furious Secara (partikel adverbia) Melihat / Membaca Aspect particle indicating action in progress or ongoing state Suami Berbicara / Berkata To wait for; to await To wait for; to await",
                    tokens = listOf(
                        WordToken("但是", "dàn shì", "Tetapi / Namun", "Kata hubung pertentangan"),
                        WordToken("过", "guò", "To cross", "Kosakata HSK 2: 过 (guò)"),
                        WordToken("了", "le", "Sudah (partikel perubahan situasi)", "Partikel aspek selesainya tindakan"),
                        WordToken("一会儿", "yī huì r", "A moment", "Kosakata HSK 2: 一会儿 (yī huì r)"),
                        WordToken("妻子", "qī zi", "Istri", "Pasangan hidup perempuan"),
                        WordToken("突然", "tū rán", "Sudden; abrupt; unexpected", "Kosakata HSK 2: 突然 (tū rán)"),
                        WordToken("又", "yòu", "Lagi (telah terjadi)", "Pengulangan tindakan lampau"),
                        WordToken("生气", "shēng qì", "To get angry; to be furious", "Kosakata HSK 2: 生气 (shēng qì)"),
                        WordToken("地", "de", "Secara (partikel adverbia)", "Partikel penanda kata keterangan sifat tindakan"),
                        WordToken("看", "kàn", "Melihat / Membaca", "Aktivitas visual"),
                        WordToken("着", "zhe", "Aspect particle indicating action in progress or ongoing state", "Kosakata HSK 2: 着 (zhe)"),
                        WordToken("丈夫", "zhàng fu", "Suami", "Pasangan hidup laki-laki"),
                        WordToken("说", "shuō", "Berbicara / Berkata", "Menyampaikan ucapan"),
                        WordToken("等", "děng", "To wait for; to await", "Kosakata HSK 2: 等 (děng)"),
                        WordToken("等", "děng", "To wait for; to await", "Kosakata HSK 2: 等 (děng)")
                    )
                ),
                Sentence(
                    id = "s_lottery_11",
                    hanzi = "你怎么有钱买彩票呢？",
                    pinyin = "nǐ zěn me yǒu qián mǎi cǎi piào ne",
                    translation = "Kamu How? Mempunyai / Ada Coin Membeli Lottery ticket Bagaimana dengan / sedang (partikel modal)",
                    tokens = listOf(
                        WordToken("你", "nǐ", "Kamu", "Kata ganti orang kedua tunggal"),
                        WordToken("怎么", "zěn me", "How?", "Kosakata HSK 2: 怎么 (zěn me)"),
                        WordToken("有", "yǒu", "Mempunyai / Ada", "Menyatakan kepemilikan atau eksistensi"),
                        WordToken("钱", "qián", "Coin", "Kosakata HSK 2: 钱 (qián)"),
                        WordToken("买", "mǎi", "Membeli", "Transaksi belanja"),
                        WordToken("彩票", "cǎi piào", "Lottery ticket", "Kosakata HSK 2: 彩票 (cǎi piào)"),
                        WordToken("呢", "ne", "Bagaimana dengan / sedang (partikel modal)", "Partikel tanya atau penanda sedang berlangsung")
                    )
                ),
                Sentence(
                    id = "s_lottery_12",
                    hanzi = "你的钱是从哪儿来的？”",
                    pinyin = "nǐ de qián shì cóng nǎ r lái de",
                    translation = "Kamu Punya / Yang (partikel posesif) Coin Adalah From; through; via Di mana Datang Punya / Yang (partikel posesif)",
                    tokens = listOf(
                        WordToken("你", "nǐ", "Kamu", "Kata ganti orang kedua tunggal"),
                        WordToken("的", "de", "Punya / Yang (partikel posesif)", "Partikel penjelas modifikasi atau kepemilikan"),
                        WordToken("钱", "qián", "Coin", "Kosakata HSK 2: 钱 (qián)"),
                        WordToken("是", "shì", "Adalah", "Kopula penjelas"),
                        WordToken("从", "cóng", "From; through; via", "Kosakata HSK 2: 从 (cóng)"),
                        WordToken("哪儿", "nǎ r", "Di mana", "Kata tanya tempat"),
                        WordToken("来", "lái", "Datang", "Menuju ke arah pembicara"),
                        WordToken("的", "de", "Punya / Yang (partikel posesif)", "Partikel penjelas modifikasi atau kepemilikan")
                    )
                )
            ),
            questions = listOf(
                StoryQuestion(
                    id = "q_lottery_1",
                    questionText = "主角路过彩票投注站时做了什么决定？ (Keputusan apa yang diambil tokoh utama saat melintas di gerai lotre?)",
                    options = listOf("花了两块钱随手买了一张彩票试试手气 (Mengeluarkan 2 yuan membeli selembar tiket lotre untuk mencoba peruntungan)", "抢劫彩票店 (Merampok toko)", "当彩票售票员 (Mendaftar menjadi kasir lotre)", "在店门口唱歌 (Bernyanyi di depan toko)"),
                    correctAnswerIndex = 0,
                    explanation = "Membeli selembar tiket lotre murah sebagai selingan hiburan harian."
                ),
                StoryQuestion(
                    id = "q_lottery_2",
                    questionText = "在开奖前，他满脑子幻想中大奖后要去做什么？ (Apa angan-angan indahnya seandainya memenangkan hadiah utama?)",
                    options = listOf("辞职去环游世界并给父母买大房子 (Berhenti kerja untuk keliling dunia dan membelikan rumah mewah bagi orang tua)", "把所有钱烧掉 (Membakar semua uang)", "天天通宵打游戏 (Main game semalaman tiada henti)", "买一万个汉堡吃完 (Membeli 10.000 burger dan memakannya habis)"),
                    correctAnswerIndex = 0,
                    explanation = "Impian membahagiakan orang tua dan menjelajahi keajaiban panorama dunia."
                ),
                StoryQuestion(
                    id = "q_lottery_3",
                    questionText = "当晚核对中奖号码后实际结果如何？ (Bagaimana kenyataan sesungguhnya setelah nomor undian dicocokkan?)",
                    options = listOf("一个数字都没对上，没有中奖 (Tidak ada satu angka pun yang cocok, alias tidak menang)", "中了一千万大奖 (Menang hadiah utama 10 juta)", "中了二等奖 (Menang juara kedua)", "彩票丢了 (Tiket lotrenya hilang)"),
                    correctAnswerIndex = 0,
                    explanation = "Angka yang tercetak sama sekali berbeda dengan nomor pemenang undian."
                ),
                StoryQuestion(
                    id = "q_lottery_4",
                    questionText = "从这个故事中我们应当树立怎样正确的人生观念？ (Pola pikir bijak apakah yang selayaknya kita tanamkan dari kisah ini?)",
                    options = listOf("脚踏实地努力工作奋斗才是幸福的源泉 (Bekerja giat dan berpijak pada kenyataan adalah sumber sejati kebahagiaan)", "天天靠买彩票发大财 (Menggantungkan nasib hidup pada judi undian)", "不用上班等天上掉馅饼 (Tidak usah bekerja menanti rezeki jatuh dari langit)", "怨天尤人 (Menyalahkan takdir)"),
                    correctAnswerIndex = 0,
                    explanation = "Kekayaan sejati dibangun melalui ketekunan ikhtiar kerja nyata, bukan ilusi keberuntungan semata."
                )
            )
        ),
        // Cerita Mandarin Bean 103 (HSK 2): A Day of My Mother (Keseharian Ibuku)
        Story(
            id = "story_day_of_my_mother",
            titleHanzi = "母亲的一天",
            titlePinyin = "Mǔqīn de Yì Tiān",
            titleTranslation = "A Day of My Mother (Keseharian Ibuku)",
            level = "HSK 2",
            category = "Keluarga & Keseharian",
            description = "Potret ketulusan dan dedikasi tiada henti seorang ibu mengurus rumah tangga dan merawat anak dengan penuh kasih.",
            coverEmoji = "👩",
            coverImageRes = R.drawable.cover_story_day_of_my_mother,
            estimatedReadMinutes = 2,
            sentences = listOf(
                Sentence(
                    id = "s_daymom_1",
                    hanzi = "妈妈在图书馆工作。",
                    pinyin = "mā ma zài tú shū guǎn gōng zuò",
                    translation = "Ibu Di / Berada di Library Bekerja",
                    tokens = listOf(
                        WordToken("妈妈", "mā ma", "Ibu", "Anggota keluarga"),
                        WordToken("在", "zài", "Di / Berada di", "Preposisi lokasi atau aspek progresif"),
                        WordToken("图书馆", "tú shū guǎn", "Library", "Kosakata HSK 2: 图书馆 (tú shū guǎn)"),
                        WordToken("工作", "gōng zuò", "Bekerja", "Aktivitas mata pencaharian")
                    )
                ),
                Sentence(
                    id = "s_daymom_2",
                    hanzi = "她每天早上六点起床，起床后给我和爸爸做早饭，然后我们一起吃。",
                    pinyin = "tā měi tiān zǎo shang liù diǎn qǐ chuáng qǐ chuáng hòu gěi wǒ hé bà ba zuò zǎo fàn rán hòu wǒ men yī qǐ chī",
                    translation = "Dia (perempuan) Each Hari Pagi hari Six Pukul / Jam Bangun tidur Bangun tidur Afterwards Memberi / Kepada Saya Dan Ayah Membuat / Mengerjakan Breakfast Then; after that; afterwards Kami / Kita Together; in company (with) Makan",
                    tokens = listOf(
                        WordToken("她", "tā", "Dia (perempuan)", "Kata ganti orang ketiga tunggal perempuan"),
                        WordToken("每", "měi", "Each", "Kosakata HSK 2: 每 (měi)"),
                        WordToken("天", "tiān", "Hari", "Satuan hari"),
                        WordToken("早上", "zǎo shang", "Pagi hari", "Waktu fajar hingga pagi"),
                        WordToken("六", "liù", "Six", "Kosakata HSK 2: 六 (liù)"),
                        WordToken("点", "diǎn", "Pukul / Jam", "Penunjuk waktu jam"),
                        WordToken("起床", "qǐ chuáng", "Bangun tidur", "Memulai hari dari ranjang"),
                        WordToken("起床", "qǐ chuáng", "Bangun tidur", "Memulai hari dari ranjang"),
                        WordToken("后", "hòu", "Afterwards", "Kosakata HSK 2: 后 (hòu)"),
                        WordToken("给", "gěi", "Memberi / Kepada", "Tindakan memberi atau preposisi sasaran"),
                        WordToken("我", "wǒ", "Saya", "Kata ganti orang pertama tunggal"),
                        WordToken("和", "hé", "Dan", "Kata hubung setara"),
                        WordToken("爸爸", "bà ba", "Ayah", "Anggota keluarga"),
                        WordToken("做", "zuò", "Membuat / Mengerjakan", "Aktivitas kerja"),
                        WordToken("早饭", "zǎo fàn", "Breakfast", "Kosakata HSK 2: 早饭 (zǎo fàn)"),
                        WordToken("然后", "rán hòu", "Then; after that; afterwards", "Kosakata HSK 2: 然后 (rán hòu)"),
                        WordToken("我们", "wǒ men", "Kami / Kita", "Kata ganti orang pertama jamak"),
                        WordToken("一起", "yī qǐ", "Together; in company (with)", "Kosakata HSK 2: 一起 (yī qǐ)"),
                        WordToken("吃", "chī", "Makan", "Aktivitas mengonsumsi makanan")
                    )
                ),
                Sentence(
                    id = "s_daymom_3",
                    hanzi = "七点半，她会先送我去学校，然后再去工作。",
                    pinyin = "qī diǎn bàn tā huì xiān sòng wǒ qù xué xiào rán hòu zài qù gōng zuò",
                    translation = "Seven Pukul / Jam (after a number) and a half Dia (perempuan) To be likely to; to be sure to Beforehand; first; earlier Menghadiahkan / Mengantar Saya Pergi Sekolah Then; after that; afterwards Lagi / Sekali lagi Pergi Bekerja",
                    tokens = listOf(
                        WordToken("七", "qī", "Seven", "Kosakata HSK 2: 七 (qī)"),
                        WordToken("点", "diǎn", "Pukul / Jam", "Penunjuk waktu jam"),
                        WordToken("半", "bàn", "(after a number) and a half", "Kosakata HSK 2: 半 (bàn)"),
                        WordToken("她", "tā", "Dia (perempuan)", "Kata ganti orang ketiga tunggal perempuan"),
                        WordToken("会", "huì", "To be likely to; to be sure to", "Kosakata HSK 2: 会 (huì)"),
                        WordToken("先", "xiān", "Beforehand; first; earlier", "Kosakata HSK 2: 先 (xiān)"),
                        WordToken("送", "sòng", "Menghadiahkan / Mengantar", "Memberikan bingkisan atau mengantar"),
                        WordToken("我", "wǒ", "Saya", "Kata ganti orang pertama tunggal"),
                        WordToken("去", "qù", "Pergi", "Berpindah tempat menjauhi pembicara"),
                        WordToken("学校", "xué xiào", "Sekolah", "Institusi pendidikan"),
                        WordToken("然后", "rán hòu", "Then; after that; afterwards", "Kosakata HSK 2: 然后 (rán hòu)"),
                        WordToken("再", "zài", "Lagi / Sekali lagi", "Pengulangan tindakan mendatang"),
                        WordToken("去", "qù", "Pergi", "Berpindah tempat menjauhi pembicara"),
                        WordToken("工作", "gōng zuò", "Bekerja", "Aktivitas mata pencaharian")
                    )
                ),
                Sentence(
                    id = "s_daymom_4",
                    hanzi = "图书馆九点开门，她常常差一刻九点到图书馆门口。",
                    pinyin = "tú shū guǎn jiǔ diǎn kāi mén tā cháng cháng chà yī kè jiǔ diǎn dào tú shū guǎn mén kǒu",
                    translation = "Library Nine Pukul / Jam (lit. and fig.) to open a door Dia (perempuan) Frequently; often To fall short; to lack A quarter of an hour; 15 minutes; a moment Nine Pukul / Jam To reach; to arrive Library Doorway",
                    tokens = listOf(
                        WordToken("图书馆", "tú shū guǎn", "Library", "Kosakata HSK 2: 图书馆 (tú shū guǎn)"),
                        WordToken("九", "jiǔ", "Nine", "Kosakata HSK 2: 九 (jiǔ)"),
                        WordToken("点", "diǎn", "Pukul / Jam", "Penunjuk waktu jam"),
                        WordToken("开门", "kāi mén", "(lit. and fig.) to open a door", "Kosakata HSK 2: 开门 (kāi mén)"),
                        WordToken("她", "tā", "Dia (perempuan)", "Kata ganti orang ketiga tunggal perempuan"),
                        WordToken("常常", "cháng cháng", "Frequently; often", "Kosakata HSK 2: 常常 (cháng cháng)"),
                        WordToken("差", "chà", "To fall short; to lack", "Kosakata HSK 2: 差 (chà)"),
                        WordToken("一刻", "yī kè", "A quarter of an hour; 15 minutes; a moment", "Kosakata HSK 2: 一刻 (yī kè)"),
                        WordToken("九", "jiǔ", "Nine", "Kosakata HSK 2: 九 (jiǔ)"),
                        WordToken("点", "diǎn", "Pukul / Jam", "Penunjuk waktu jam"),
                        WordToken("到", "dào", "To reach; to arrive", "Kosakata HSK 2: 到 (dào)"),
                        WordToken("图书馆", "tú shū guǎn", "Library", "Kosakata HSK 2: 图书馆 (tú shū guǎn)"),
                        WordToken("门口", "mén kǒu", "Doorway", "Kosakata HSK 2: 门口 (mén kǒu)")
                    )
                ),
                Sentence(
                    id = "s_daymom_5",
                    hanzi = "中午妈妈会在图书馆的食堂吃饭。",
                    pinyin = "zhōng wǔ mā ma huì zài tú shū guǎn de shí táng chī fàn",
                    translation = "Siang hari Ibu To be likely to; to be sure to Di / Berada di Library Punya / Yang (partikel posesif) Dining hall; cafeteria To have a meal",
                    tokens = listOf(
                        WordToken("中午", "zhōng wǔ", "Siang hari", "Waktu tengah hari"),
                        WordToken("妈妈", "mā ma", "Ibu", "Anggota keluarga"),
                        WordToken("会", "huì", "To be likely to; to be sure to", "Kosakata HSK 2: 会 (huì)"),
                        WordToken("在", "zài", "Di / Berada di", "Preposisi lokasi atau aspek progresif"),
                        WordToken("图书馆", "tú shū guǎn", "Library", "Kosakata HSK 2: 图书馆 (tú shū guǎn)"),
                        WordToken("的", "de", "Punya / Yang (partikel posesif)", "Partikel penjelas modifikasi atau kepemilikan"),
                        WordToken("食堂", "shí táng", "Dining hall; cafeteria", "Kosakata HSK 2: 食堂 (shí táng)"),
                        WordToken("吃饭", "chī fàn", "To have a meal", "Kosakata HSK 2: 吃饭 (chī fàn)")
                    )
                ),
                Sentence(
                    id = "s_daymom_6",
                    hanzi = "晚上我们一起在家吃晚饭，有时候一起看电视。",
                    pinyin = "wǎn shang wǒ men yī qǐ zài jiā chī wǎn fàn yǒu shí hou yī qǐ kàn diàn shì",
                    translation = "Malam hari Kami / Kita Together; in company (with) Di / Berada di Rumah / Keluarga Makan Evening meal Sometimes Together; in company (with) Melihat / Membaca Television; tv",
                    tokens = listOf(
                        WordToken("晚上", "wǎn shang", "Malam hari", "Waktu malam"),
                        WordToken("我们", "wǒ men", "Kami / Kita", "Kata ganti orang pertama jamak"),
                        WordToken("一起", "yī qǐ", "Together; in company (with)", "Kosakata HSK 2: 一起 (yī qǐ)"),
                        WordToken("在", "zài", "Di / Berada di", "Preposisi lokasi atau aspek progresif"),
                        WordToken("家", "jiā", "Rumah / Keluarga", "Tempat tinggal"),
                        WordToken("吃", "chī", "Makan", "Aktivitas mengonsumsi makanan"),
                        WordToken("晚饭", "wǎn fàn", "Evening meal", "Kosakata HSK 2: 晚饭 (wǎn fàn)"),
                        WordToken("有时候", "yǒu shí hou", "Sometimes", "Kosakata HSK 2: 有时候 (yǒu shí hou)"),
                        WordToken("一起", "yī qǐ", "Together; in company (with)", "Kosakata HSK 2: 一起 (yī qǐ)"),
                        WordToken("看", "kàn", "Melihat / Membaca", "Aktivitas visual"),
                        WordToken("电视", "diàn shì", "Television; tv", "Kosakata HSK 2: 电视 (diàn shì)")
                    )
                ),
                Sentence(
                    id = "s_daymom_7",
                    hanzi = "这是我妈妈的一天。",
                    pinyin = "zhè shì wǒ mā ma de yī tiān",
                    translation = "This; these Adalah Saya Ibu Punya / Yang (partikel posesif) One Hari",
                    tokens = listOf(
                        WordToken("这", "zhè", "This; these", "Kosakata HSK 2: 这 (zhè)"),
                        WordToken("是", "shì", "Adalah", "Kopula penjelas"),
                        WordToken("我", "wǒ", "Saya", "Kata ganti orang pertama tunggal"),
                        WordToken("妈妈", "mā ma", "Ibu", "Anggota keluarga"),
                        WordToken("的", "de", "Punya / Yang (partikel posesif)", "Partikel penjelas modifikasi atau kepemilikan"),
                        WordToken("一", "yī", "One", "Kosakata HSK 2: 一 (yī)"),
                        WordToken("天", "tiān", "Hari", "Satuan hari")
                    )
                )
            ),
            questions = listOf(
                StoryQuestion(
                    id = "q_daymom_1",
                    questionText = "母亲通常在清晨几点就开始起床忙碌？ (Pukul berapa sang ibu biasanya sudah bangun merapikan rumah di pagi buta?)",
                    options = listOf("清晨六点不到 (Kurang dari jam 6 fajar)", "上午十点 (Pukul 10 siang)", "中午十二点 (Pukul 12 siang)", "下午三点 (Pukul 3 sore)"),
                    correctAnswerIndex = 0,
                    explanation = "Ibu bangun sebelum fajar menyingsing demi menyiapkan sarapan bergizi untuk keluarga."
                ),
                StoryQuestion(
                    id = "q_daymom_2",
                    questionText = "在孩子们出门上学后，母亲在家里还要做哪些家务？ (Pekerjaan rumah tangga apa saja yang diselesaikan ibu setelah anak-anak berangkat sekolah?)",
                    options = listOf("洗衣服、打扫客厅、去菜市场采购新鲜食材 (Mencuci pakaian, menyapu ruang tamu, dan belanja bahan segar ke pasar)", "坐着看电视吃爆米花 (Duduk menonton TV makan popcorn)", "睡觉到黄昏 (Tidur pulas hingga magrib)", "去朋友家打牌 (Pergi main kartu ke rumah tetangga)"),
                    correctAnswerIndex = 0,
                    explanation = "Mengatur kebersihan hunian dan menyortir sayuran terbaik demi kesehatan gizi anak-anaknya."
                ),
                StoryQuestion(
                    id = "q_daymom_3",
                    questionText = "看到母亲辛勤付出的身影，作为儿女应当怀揣怎样的情感？ (Sikap batin apa yang sepatutnya dihayati anak memandang pengorbanan ibu?)",
                    options = listOf("感恩、体贴与主动分担家务的孝心 (Rasa syukur, empati, dan bakti proaktif meringankan beban rumah tangga)", "视为理所当然 (Menganggapnya sebagai kewajiban yang wajar)", "挑剔饭菜不好吃 (Mencela rasa masakan yang kurang enak)", "不予理睬 (Bersikap acuh tak acuh)"),
                    correctAnswerIndex = 0,
                    explanation = "Menghargai keringat orang tua dengan tutur kata santun dan bantuan nyata di rumah."
                ),
                StoryQuestion(
                    id = "q_daymom_4",
                    questionText = "这篇温情的记叙文主旨在于讴歌什么？ (Apakah pesan luhur utama yang disampaikan dalam untaian kisah ini?)",
                    options = listOf("母爱的无私伟大与家庭亲情的温暖 (Keagungan kasih sayang ibu yang tulus dan kehangatan keluarga)", "做饭很麻烦 (Memasak itu merepotkan)", "早起对身体不好 (Bangun pagi buruk bagi tubuh)", "多买衣服 (Perbanyak belanja baju)"),
                    correctAnswerIndex = 0,
                    explanation = "Kasih ibu sepanjang jalan adalah pelindung ketenteraman hati setiap insan."
                )
            )
        ),
        // Cerita Mandarin Bean 104 (HSK 2): Order Takeaway (Pesan Antar Makanan)
        Story(
            id = "story_order_takeaway",
            titleHanzi = "点外卖",
            titlePinyin = "Diǎn Wàimài",
            titleTranslation = "Order Takeaway (Pesan Antar Makanan)",
            level = "HSK 2",
            category = "Pesan Makanan & Layanan",
            description = "Kemudahan memesan hidangan favorit lewat aplikasi ponsel pintar di kala sibuk menyelesaikan lembur kerja.",
            coverEmoji = "🥡",
            coverImageRes = R.drawable.cover_story_order_takeaway,
            estimatedReadMinutes = 2,
            sentences = listOf(
                Sentence(
                    id = "s_takeaway_1",
                    hanzi = "我是一名医生，工作很忙。",
                    pinyin = "wǒ shì yī míng yī shēng gōng zuò hěn máng",
                    translation = "Saya Adalah One Classifier for people Dokter Bekerja Sangat Sibuk",
                    tokens = listOf(
                        WordToken("我", "wǒ", "Saya", "Kata ganti orang pertama tunggal"),
                        WordToken("是", "shì", "Adalah", "Kopula penjelas"),
                        WordToken("一", "yī", "One", "Kosakata HSK 2: 一 (yī)"),
                        WordToken("名", "míng", "Classifier for people", "Kosakata HSK 2: 名 (míng)"),
                        WordToken("医生", "yī shēng", "Dokter", "Tenaga medis"),
                        WordToken("工作", "gōng zuò", "Bekerja", "Aktivitas mata pencaharian"),
                        WordToken("很", "hěn", "Sangat", "Tingkat derajat"),
                        WordToken("忙", "máng", "Sibuk", "Banyak aktivitas pekerjaan")
                    )
                ),
                Sentence(
                    id = "s_takeaway_2",
                    hanzi = "我不会做饭，一般也不在家里吃，下班以后经常去医院旁边的饭馆吃饭。",
                    pinyin = "wǒ bù huì zuò fàn yī bān yě bù zài jiā lǐ chī xià bān yǐ hòu jīng cháng qù yī yuàn páng biān de fàn guǎn chī fàn",
                    translation = "Saya Tidak Can; to have the skill; to know how to Membuat / Mengerjakan Nasi / Makanan Generally Juga / Pun Tidak Di / Berada di Rumah / Keluarga Lining Makan To finish work; to get off work After Frequently; constantly; regularly; often Pergi Rumah sakit Side; adjacent place Punya / Yang (partikel posesif) Restaurant Makan Nasi / Makanan",
                    tokens = listOf(
                        WordToken("我", "wǒ", "Saya", "Kata ganti orang pertama tunggal"),
                        WordToken("不", "bù", "Tidak", "Kata sangkalan untuk masa kini atau masa depan"),
                        WordToken("会", "huì", "Can; to have the skill; to know how to", "Kosakata HSK 2: 会 (huì)"),
                        WordToken("做", "zuò", "Membuat / Mengerjakan", "Aktivitas kerja"),
                        WordToken("饭", "fàn", "Nasi / Makanan", "Makanan pokok"),
                        WordToken("一般", "yī bān", "Generally", "Kosakata HSK 2: 一般 (yī bān)"),
                        WordToken("也", "yě", "Juga / Pun", "Partikel penanda kesamaan"),
                        WordToken("不", "bù", "Tidak", "Kata sangkalan untuk masa kini atau masa depan"),
                        WordToken("在", "zài", "Di / Berada di", "Preposisi lokasi atau aspek progresif"),
                        WordToken("家", "jiā", "Rumah / Keluarga", "Tempat tinggal"),
                        WordToken("里", "lǐ", "Lining", "Kosakata HSK 2: 里 (lǐ)"),
                        WordToken("吃", "chī", "Makan", "Aktivitas mengonsumsi makanan"),
                        WordToken("下班", "xià bān", "To finish work; to get off work", "Kosakata HSK 2: 下班 (xià bān)"),
                        WordToken("以后", "yǐ hòu", "After", "Kosakata HSK 2: 以后 (yǐ hòu)"),
                        WordToken("经常", "jīng cháng", "Frequently; constantly; regularly; often", "Kosakata HSK 2: 经常 (jīng cháng)"),
                        WordToken("去", "qù", "Pergi", "Berpindah tempat menjauhi pembicara"),
                        WordToken("医院", "yī yuàn", "Rumah sakit", "Lembaga medis"),
                        WordToken("旁边", "páng biān", "Side; adjacent place", "Kosakata HSK 2: 旁边 (páng biān)"),
                        WordToken("的", "de", "Punya / Yang (partikel posesif)", "Partikel penjelas modifikasi atau kepemilikan"),
                        WordToken("饭馆", "fàn guǎn", "Restaurant", "Kosakata HSK 2: 饭馆 (fàn guǎn)"),
                        WordToken("吃", "chī", "Makan", "Aktivitas mengonsumsi makanan"),
                        WordToken("饭", "fàn", "Nasi / Makanan", "Makanan pokok")
                    )
                ),
                Sentence(
                    id = "s_takeaway_3",
                    hanzi = "后来，同事们告诉我，可以用手机点外卖，又方便又便宜。",
                    pinyin = "hòu lái tóng shì men gào su wǒ kě yǐ yòng shǒu jī diǎn wài mài yòu fāng biàn yòu pián yi",
                    translation = "Afterwards; later Colleague; co-worker Plural marker for pronouns, and nouns referring to individuals To tell; to inform; to let know Saya Boleh / Dapat To use; to make use of; to employ Cell phone; mobile phone Pukul / Jam Makanan pesan-antar (takeaway) Lagi (telah terjadi) Convenient; suitable Lagi (telah terjadi) Murah",
                    tokens = listOf(
                        WordToken("后来", "hòu lái", "Afterwards; later", "Kosakata HSK 2: 后来 (hòu lái)"),
                        WordToken("同事", "tóng shì", "Colleague; co-worker", "Kosakata HSK 2: 同事 (tóng shì)"),
                        WordToken("们", "men", "Plural marker for pronouns, and nouns referring to individuals", "Kosakata HSK 2: 们 (men)"),
                        WordToken("告诉", "gào su", "To tell; to inform; to let know", "Kosakata HSK 2: 告诉 (gào su)"),
                        WordToken("我", "wǒ", "Saya", "Kata ganti orang pertama tunggal"),
                        WordToken("可以", "kě yǐ", "Boleh / Dapat", "Menyatakan izin atau kemungkinan"),
                        WordToken("用", "yòng", "To use; to make use of; to employ", "Kosakata HSK 2: 用 (yòng)"),
                        WordToken("手机", "shǒu jī", "Cell phone; mobile phone", "Kosakata HSK 2: 手机 (shǒu jī)"),
                        WordToken("点", "diǎn", "Pukul / Jam", "Penunjuk waktu jam"),
                        WordToken("外卖", "wài mài", "Makanan pesan-antar (takeaway)", "Layanan antar makanan"),
                        WordToken("又", "yòu", "Lagi (telah terjadi)", "Pengulangan tindakan lampau"),
                        WordToken("方便", "fāng biàn", "Convenient; suitable", "Kosakata HSK 2: 方便 (fāng biàn)"),
                        WordToken("又", "yòu", "Lagi (telah terjadi)", "Pengulangan tindakan lampau"),
                        WordToken("便宜", "pián yi", "Murah", "Harga terjangkau")
                    )
                ),
                Sentence(
                    id = "s_takeaway_4",
                    hanzi = "我试了一个星期，感觉太好了。",
                    pinyin = "wǒ shì le yī gè xīng qī gǎn jué tài hǎo le",
                    translation = "Saya To test Sudah (partikel perubahan situasi) One Classifier for people or objects in general Minggu / Pekan Feeling; impression; sensation Terlalu Bagus / Baik Sudah (partikel perubahan situasi)",
                    tokens = listOf(
                        WordToken("我", "wǒ", "Saya", "Kata ganti orang pertama tunggal"),
                        WordToken("试", "shì", "To test", "Kosakata HSK 2: 试 (shì)"),
                        WordToken("了", "le", "Sudah (partikel perubahan situasi)", "Partikel aspek selesainya tindakan"),
                        WordToken("一", "yī", "One", "Kosakata HSK 2: 一 (yī)"),
                        WordToken("个", "gè", "Classifier for people or objects in general", "Kosakata HSK 2: 个 (gè)"),
                        WordToken("星期", "xīng qī", "Minggu / Pekan", "Satuan pekan"),
                        WordToken("感觉", "gǎn jué", "Feeling; impression; sensation", "Kosakata HSK 2: 感觉 (gǎn jué)"),
                        WordToken("太", "tài", "Terlalu", "Derajat melampaui batas"),
                        WordToken("好", "hǎo", "Bagus / Baik", "Kualitas positif"),
                        WordToken("了", "le", "Sudah (partikel perubahan situasi)", "Partikel aspek selesainya tindakan")
                    )
                ),
                Sentence(
                    id = "s_takeaway_5",
                    hanzi = "我现在每顿都可以吃不同的东西，昨天吃饺子，今天吃面条，明天吃三明治，太幸福了！",
                    pinyin = "wǒ xiàn zài měi dùn dōu kě yǐ chī bù tóng de dōng xi zuó tiān chī jiǎo zi jīn tiān chī miàn tiáo míng tiān chī sān míng zhì tài xìng fú le",
                    translation = "Saya Sekarang Each Classifier for meals, beatings, scoldings etc: time, bout, spell, meal Semua / Seluruhnya Boleh / Dapat Makan Different Punya / Yang (partikel posesif) Thing Kemarin Makan Dumpling Hari ini Makan Noodles Besok Makan (loanword) sandwich Terlalu Happy Sudah (partikel perubahan situasi)",
                    tokens = listOf(
                        WordToken("我", "wǒ", "Saya", "Kata ganti orang pertama tunggal"),
                        WordToken("现在", "xiàn zài", "Sekarang", "Waktu saat ini"),
                        WordToken("每", "měi", "Each", "Kosakata HSK 2: 每 (měi)"),
                        WordToken("顿", "dùn", "Classifier for meals, beatings, scoldings etc: time, bout, spell, meal", "Kosakata HSK 2: 顿 (dùn)"),
                        WordToken("都", "dōu", "Semua / Seluruhnya", "Menyatakan keuniversalan subjek"),
                        WordToken("可以", "kě yǐ", "Boleh / Dapat", "Menyatakan izin atau kemungkinan"),
                        WordToken("吃", "chī", "Makan", "Aktivitas mengonsumsi makanan"),
                        WordToken("不同", "bù tóng", "Different", "Kosakata HSK 2: 不同 (bù tóng)"),
                        WordToken("的", "de", "Punya / Yang (partikel posesif)", "Partikel penjelas modifikasi atau kepemilikan"),
                        WordToken("东西", "dōng xi", "Thing", "Kosakata HSK 2: 东西 (dōng xi)"),
                        WordToken("昨天", "zuó tiān", "Kemarin", "Keterangan waktu lampau"),
                        WordToken("吃", "chī", "Makan", "Aktivitas mengonsumsi makanan"),
                        WordToken("饺子", "jiǎo zi", "Dumpling", "Kosakata HSK 2: 饺子 (jiǎo zi)"),
                        WordToken("今天", "jīn tiān", "Hari ini", "Keterangan waktu sekarang"),
                        WordToken("吃", "chī", "Makan", "Aktivitas mengonsumsi makanan"),
                        WordToken("面条", "miàn tiáo", "Noodles", "Kosakata HSK 2: 面条 (miàn tiáo)"),
                        WordToken("明天", "míng tiān", "Besok", "Keterangan waktu mendatang"),
                        WordToken("吃", "chī", "Makan", "Aktivitas mengonsumsi makanan"),
                        WordToken("三明治", "sān míng zhì", "(loanword) sandwich", "Kosakata HSK 2: 三明治 (sān míng zhì)"),
                        WordToken("太", "tài", "Terlalu", "Derajat melampaui batas"),
                        WordToken("幸福", "xìng fú", "Happy", "Kosakata HSK 2: 幸福 (xìng fú)"),
                        WordToken("了", "le", "Sudah (partikel perubahan situasi)", "Partikel aspek selesainya tindakan")
                    )
                )
            ),
            questions = listOf(
                StoryQuestion(
                    id = "q_takeaway_1",
                    questionText = "主人公为什么选择用手机点外卖？ (Mengapa tokoh utama memilih memesan makanan via aplikasi ponsel?)",
                    options = listOf("工作太忙，没有时间出门或做饭 (Sangat sibuk bekerja, tak ada waktu untuk keluar atau memasak sendiri)", "家里没有电 (Rumah sedang mati listrik)", "手机快没电了 (Baterai ponsel hampir habis)", "不喜欢吃热饭 (Tidak suka makan makanan panas)"),
                    correctAnswerIndex = 0,
                    explanation = "Praktisnya layanan pesan-antar menjadi penolong berharga saat tenggat waktu pekerjaan padat."
                ),
                StoryQuestion(
                    id = "q_takeaway_2",
                    questionText = "他在外卖平台上点了哪些合口的饭菜？ (Menu masakan apa yang dipilihnya di etalase aplikasi online?)",
                    options = listOf("一份宫保鸡丁盖浇饭和一杯冰红茶 (Seporsi nasi ayam Gongbao dan segelas es teh manis)", "十个大披萨 (Sepuluh loyang pizza besar)", "一盆白米饭 (Sebaskom nasi putih polos)", "一碗白开水 (Semangkuk air putih)"),
                    correctAnswerIndex = 0,
                    explanation = "Memilih hidangan lauk ayam lezat berpadu minuman segar penambah stamina."
                ),
                StoryQuestion(
                    id = "q_takeaway_3",
                    questionText = "外卖小哥用了多长时间将热腾腾的饭菜送到门口？ (Berapa lama kurir pengantar membawa bungkusan makanan hingga tiba di depan pintu?)",
                    options = listOf("大约半个小时 (Kurang lebih setengah jam)", "三个小时 (Tiga jam lamanya)", "两天 (Dua hari)", "五分钟 (Hanya 5 menit)"),
                    correctAnswerIndex = 0,
                    explanation = "Kecepatan armada kurir mengantarkan hidangan tepat waktu dalam keadaan hangat."
                ),
                StoryQuestion(
                    id = "q_takeaway_4",
                    questionText = "现代外卖送餐服务的普及给人们生活带来了什么显著益处？ (Manfaat menonjol apa yang dihadirkan layanan pesan-antar dalam ritme era modern?)",
                    options = listOf("极大地节约了时间成本，提供了丰富多元的餐饮选择 (Menghemat waktu dan menyuguhkan keragaman pilihan kuliner bermutu)", "让人变懒不运动 (Membuat orang malas berolahraga)", "花费翻倍 (Biaya belanja melonjak dua kali lipat)", "容易丢手机 (Mudah kehilangan ponsel genggam)"),
                    correctAnswerIndex = 0,
                    explanation = "Efisiensi waktu dan fleksibilitas menikmati aneka cita rasa masakan kapan pun dibutuhkan."
                )
            )
        ),
        // Cerita Mandarin Bean 105 (HSK 2): Me and Li (Saya dan Li)
        Story(
            id = "story_me_and_li",
            titleHanzi = "我和李",
            titlePinyin = "Wǒ hé Lǐ",
            titleTranslation = "Me and Li (Saya dan Li)",
            level = "HSK 2",
            category = "Persahabatan & Kampus",
            description = "Kisah perjumpaan dan persahabatan tulus antara dua insan mahasiswa dari dua latar belakang yang berbeda.",
            coverEmoji = "🎓",
            coverImageRes = R.drawable.cover_story_me_and_li,
            estimatedReadMinutes = 2,
            sentences = listOf(
                Sentence(
                    id = "s_meandli_1",
                    hanzi = "我和小李是好朋友，我们经常见面。",
                    pinyin = "wǒ hé xiǎo lǐ shì hǎo péng you wǒ men jīng cháng jiàn miàn",
                    translation = "Saya Dan A familiar way to refer to someone surnamed li; literally &quot;little li&quot; Adalah Bagus / Baik Teman / Sahabat Kami / Kita Frequently; constantly; regularly; often To meet; to see each other",
                    tokens = listOf(
                        WordToken("我", "wǒ", "Saya", "Kata ganti orang pertama tunggal"),
                        WordToken("和", "hé", "Dan", "Kata hubung setara"),
                        WordToken("小李", "xiǎo lǐ", "A familiar way to refer to someone surnamed li; literally &quot;little li&quot;", "Kosakata HSK 2: 小李 (xiǎo lǐ)"),
                        WordToken("是", "shì", "Adalah", "Kopula penjelas"),
                        WordToken("好", "hǎo", "Bagus / Baik", "Kualitas positif"),
                        WordToken("朋友", "péng you", "Teman / Sahabat", "Orang dekat"),
                        WordToken("我们", "wǒ men", "Kami / Kita", "Kata ganti orang pertama jamak"),
                        WordToken("经常", "jīng cháng", "Frequently; constantly; regularly; often", "Kosakata HSK 2: 经常 (jīng cháng)"),
                        WordToken("见面", "jiàn miàn", "To meet; to see each other", "Kosakata HSK 2: 见面 (jiàn miàn)")
                    )
                ),
                Sentence(
                    id = "s_meandli_2",
                    hanzi = "有时候我们一起吃饭，有时候一起去商店买东西，有时候小李帮助我学习汉语，有时候我帮助她学习英语。",
                    pinyin = "yǒu shí hou wǒ men yī qǐ chī fàn yǒu shí hou yī qǐ qù shāng diàn mǎi dōng xi yǒu shí hou xiǎo lǐ bāng zhù wǒ xué xí Hàn yǔ yǒu shí hou wǒ bāng zhù tā xué xí Yīng yǔ",
                    translation = "Sometimes Kami / Kita Together; in company (with) Makan Nasi / Makanan Sometimes Together; in company (with) Pergi Toko Membeli Thing Sometimes A familiar way to refer to someone surnamed li; literally &quot;little li&quot; To help; to assist Saya Belajar / Studi Chinese language Sometimes Saya To help; to assist Dia (perempuan) Belajar / Studi English (language)",
                    tokens = listOf(
                        WordToken("有时候", "yǒu shí hou", "Sometimes", "Kosakata HSK 2: 有时候 (yǒu shí hou)"),
                        WordToken("我们", "wǒ men", "Kami / Kita", "Kata ganti orang pertama jamak"),
                        WordToken("一起", "yī qǐ", "Together; in company (with)", "Kosakata HSK 2: 一起 (yī qǐ)"),
                        WordToken("吃", "chī", "Makan", "Aktivitas mengonsumsi makanan"),
                        WordToken("饭", "fàn", "Nasi / Makanan", "Makanan pokok"),
                        WordToken("有时候", "yǒu shí hou", "Sometimes", "Kosakata HSK 2: 有时候 (yǒu shí hou)"),
                        WordToken("一起", "yī qǐ", "Together; in company (with)", "Kosakata HSK 2: 一起 (yī qǐ)"),
                        WordToken("去", "qù", "Pergi", "Berpindah tempat menjauhi pembicara"),
                        WordToken("商店", "shāng diàn", "Toko", "Tempat berjual beli"),
                        WordToken("买", "mǎi", "Membeli", "Transaksi belanja"),
                        WordToken("东西", "dōng xi", "Thing", "Kosakata HSK 2: 东西 (dōng xi)"),
                        WordToken("有时候", "yǒu shí hou", "Sometimes", "Kosakata HSK 2: 有时候 (yǒu shí hou)"),
                        WordToken("小李", "xiǎo lǐ", "A familiar way to refer to someone surnamed li; literally &quot;little li&quot;", "Kosakata HSK 2: 小李 (xiǎo lǐ)"),
                        WordToken("帮助", "bāng zhù", "To help; to assist", "Kosakata HSK 2: 帮助 (bāng zhù)"),
                        WordToken("我", "wǒ", "Saya", "Kata ganti orang pertama tunggal"),
                        WordToken("学习", "xué xí", "Belajar / Studi", "Proses menuntut ilmu"),
                        WordToken("汉语", "Hàn yǔ", "Chinese language", "Kosakata HSK 2: 汉语 (Hàn yǔ)"),
                        WordToken("有时候", "yǒu shí hou", "Sometimes", "Kosakata HSK 2: 有时候 (yǒu shí hou)"),
                        WordToken("我", "wǒ", "Saya", "Kata ganti orang pertama tunggal"),
                        WordToken("帮助", "bāng zhù", "To help; to assist", "Kosakata HSK 2: 帮助 (bāng zhù)"),
                        WordToken("她", "tā", "Dia (perempuan)", "Kata ganti orang ketiga tunggal perempuan"),
                        WordToken("学习", "xué xí", "Belajar / Studi", "Proses menuntut ilmu"),
                        WordToken("英语", "Yīng yǔ", "English (language)", "Kosakata HSK 2: 英语 (Yīng yǔ)")
                    )
                ),
                Sentence(
                    id = "s_meandli_3",
                    hanzi = "这个周日，我们准备一起运动。",
                    pinyin = "zhè gè Zhōu rì wǒ men zhǔn bèi yī qǐ yùn dòng",
                    translation = "This; these Classifier for people or objects in general Sunday Kami / Kita To prepare Together; in company (with) To exercise",
                    tokens = listOf(
                        WordToken("这", "zhè", "This; these", "Kosakata HSK 2: 这 (zhè)"),
                        WordToken("个", "gè", "Classifier for people or objects in general", "Kosakata HSK 2: 个 (gè)"),
                        WordToken("周日", "Zhōu rì", "Sunday", "Kosakata HSK 2: 周日 (Zhōu rì)"),
                        WordToken("我们", "wǒ men", "Kami / Kita", "Kata ganti orang pertama jamak"),
                        WordToken("准备", "zhǔn bèi", "To prepare", "Kosakata HSK 2: 准备 (zhǔn bèi)"),
                        WordToken("一起", "yī qǐ", "Together; in company (with)", "Kosakata HSK 2: 一起 (yī qǐ)"),
                        WordToken("运动", "yùn dòng", "To exercise", "Kosakata HSK 2: 运动 (yùn dòng)")
                    )
                ),
                Sentence(
                    id = "s_meandli_4",
                    hanzi = "我喜欢打羽毛球，她喜欢游泳。",
                    pinyin = "wǒ xǐ huan dǎ yǔ máo qiú tā xǐ huan yóu yǒng",
                    translation = "Saya Menyukai / Gemar Memukul / Mengetik / Melakukan Badminton Dia (perempuan) Menyukai / Gemar Swimming",
                    tokens = listOf(
                        WordToken("我", "wǒ", "Saya", "Kata ganti orang pertama tunggal"),
                        WordToken("喜欢", "xǐ huan", "Menyukai / Gemar", "Perasaan suka"),
                        WordToken("打", "dǎ", "Memukul / Mengetik / Melakukan", "Kata kerja umum beragam makna"),
                        WordToken("羽毛球", "yǔ máo qiú", "Badminton", "Kosakata HSK 2: 羽毛球 (yǔ máo qiú)"),
                        WordToken("她", "tā", "Dia (perempuan)", "Kata ganti orang ketiga tunggal perempuan"),
                        WordToken("喜欢", "xǐ huan", "Menyukai / Gemar", "Perasaan suka"),
                        WordToken("游泳", "yóu yǒng", "Swimming", "Kosakata HSK 2: 游泳 (yóu yǒng)")
                    )
                ),
                Sentence(
                    id = "s_meandli_5",
                    hanzi = "我们想先打羽毛球，再去游泳，两个人都会很高兴。",
                    pinyin = "wǒ men xiǎng xiān dǎ yǔ máo qiú zài qù yóu yǒng liǎng gè rén dōu huì hěn gāo xìng",
                    translation = "Kami / Kita Ingin / Berpikir / Rindu Beforehand; first; earlier Memukul / Mengetik / Melakukan Badminton Lagi / Sekali lagi Pergi To swim Two Classifier for people or objects in general Person; people Semua / Seluruhnya To be likely to; to be sure to Sangat Senang / Gembira",
                    tokens = listOf(
                        WordToken("我们", "wǒ men", "Kami / Kita", "Kata ganti orang pertama jamak"),
                        WordToken("想", "xiǎng", "Ingin / Berpikir / Rindu", "Keinginan atau pemikiran batin"),
                        WordToken("先", "xiān", "Beforehand; first; earlier", "Kosakata HSK 2: 先 (xiān)"),
                        WordToken("打", "dǎ", "Memukul / Mengetik / Melakukan", "Kata kerja umum beragam makna"),
                        WordToken("羽毛球", "yǔ máo qiú", "Badminton", "Kosakata HSK 2: 羽毛球 (yǔ máo qiú)"),
                        WordToken("再", "zài", "Lagi / Sekali lagi", "Pengulangan tindakan mendatang"),
                        WordToken("去", "qù", "Pergi", "Berpindah tempat menjauhi pembicara"),
                        WordToken("游泳", "yóu yǒng", "To swim", "Kosakata HSK 2: 游泳 (yóu yǒng)"),
                        WordToken("两", "liǎng", "Two", "Kosakata HSK 2: 两 (liǎng)"),
                        WordToken("个", "gè", "Classifier for people or objects in general", "Kosakata HSK 2: 个 (gè)"),
                        WordToken("人", "rén", "Person; people", "Kosakata HSK 2: 人 (rén)"),
                        WordToken("都", "dōu", "Semua / Seluruhnya", "Menyatakan keuniversalan subjek"),
                        WordToken("会", "huì", "To be likely to; to be sure to", "Kosakata HSK 2: 会 (huì)"),
                        WordToken("很", "hěn", "Sangat", "Tingkat derajat"),
                        WordToken("高兴", "gāo xìng", "Senang / Gembira", "Perasaan ceria bahagia")
                    )
                )
            ),
            questions = listOf(
                StoryQuestion(
                    id = "q_meandli_1",
                    questionText = "我和李最初是在什么契机下相识相知的？ (Dalam kesempatan apakah saya dan Li mula-mula berkenalan akrab?)",
                    options = listOf("在大学中文辅导课堂上作为互助学伴 (Sebagai mitra belajar tandem di kelas tutorial bahasa Mandarin kampus)", "在火车站排队买票 (Saat antre tiket di loket stasiun)", "在电影院买爆米花 (Saat membeli popcorn di bioskop)", "在医院挂号 (Saat mendaftar di rumah sakit)"),
                    correctAnswerIndex = 0,
                    explanation = "Pertemuan akademis di lingkungan kampus mempertemukan minat belajar yang sama."
                ),
                StoryQuestion(
                    id = "q_meandli_2",
                    questionText = "李在性格上有什么让人感到踏实温暖的特质？ (Sifat unggul apakah yang terpancar dari kepribadian Li?)",
                    options = listOf("沉稳耐劳、待人真诚友善 (Tenang, tekun, dan bertutur kata jujur serta tulus)", "喜欢嘲笑他人 (Gemar mengejek kekurangan orang lain)", "爱发脾气 (Mudah marah dan emosional)", "不讲信用 (Sering mengingkari janji)"),
                    correctAnswerIndex = 0,
                    explanation = "Karakter jujur dan kesetiaan menjaga amanah menjadikannya sahabat sejati tempat bertukar pikiran."
                ),
                StoryQuestion(
                    id = "q_meandli_3",
                    questionText = "遇到学业疑难难题时，李通常会如何施以援手？ (Bagaimana respons Li tatkala rekannya menjumpai kesulitan dalam pemahaman materi kuliah?)",
                    options = listOf("耐心地逐字逐句讲解知识要点，共同复习 (Dengan sabar menerangkan pokok konsep kalimat dan mengulang latihan bersama)", "嘲弄对方笨拙 (Mengejek temannya lamban berpikir)", "直接藏起笔记 (Menyembunyikan catatan kuliah)", "敷衍了事 (Menjawab seadanya secara acuh)"),
                    correctAnswerIndex = 0,
                    explanation = "Bimbingan telaten dan diskusi aktif membuka pemahaman terhadap materi ujian."
                ),
                StoryQuestion(
                    id = "q_meandli_4",
                    questionText = "这段求学友谊最值得珍视的核心是什么？ (Nilai paling berharga apakah yang terpatri dalam persahabatan di bangku kuliah ini?)",
                    options = listOf("在异乡求学路上并肩奋斗、彼此勉励的人格信赖 (Saling menguatkan asa, berjuang bersama, dan menumbuhkan rasa percaya di tanah rantau)", "互相利用利益 (Saling memanfaatkan demi laba materi)", "比赛谁成绩高 (Bersaing gengsi memperebutkan nilai tertinggi)", "毕业就形同陌路 (Putus hubungan usai wisuda)"),
                    correctAnswerIndex = 0,
                    explanation = "Kebersamaan melalui suka duka masa studi melahirkan ikatan batin yang kekal."
                )
            )
        ),
        // Cerita Mandarin Bean 106 (HSK 2): One of My Afternoons (Suatu Sore yang Damai)
        Story(
            id = "story_one_of_my_afternoons",
            titleHanzi = "我的一个下午",
            titlePinyin = "Wǒ de Yí Gè Xiàwǔ",
            titleTranslation = "One of My Afternoons (Suatu Sore yang Damai)",
            level = "HSK 2",
            category = "Kenyamanan & Relaksasi",
            description = "Menikmati keteduhan senja di beranda kedai kopi sambil membaca novel klasik dan menyeruput teh melati.",
            coverEmoji = "☕",
            coverImageRes = R.drawable.cover_story_one_of_my_afternoons,
            estimatedReadMinutes = 2,
            sentences = listOf(
                Sentence(
                    id = "s_myafternoon_1",
                    hanzi = "我想今天下午去看电影，但是没有好电影。",
                    pinyin = "wǒ xiǎng jīn tiān xià wǔ qù kàn diàn yǐng dàn shì méi yǒu hǎo diàn yǐng",
                    translation = "Saya Ingin / Berpikir / Rindu Hari ini Sore hari Pergi Melihat / Membaca Movie; film Tetapi / Namun Tidak ada / Tidak punya Bagus / Baik Movie; film",
                    tokens = listOf(
                        WordToken("我", "wǒ", "Saya", "Kata ganti orang pertama tunggal"),
                        WordToken("想", "xiǎng", "Ingin / Berpikir / Rindu", "Keinginan atau pemikiran batin"),
                        WordToken("今天", "jīn tiān", "Hari ini", "Keterangan waktu sekarang"),
                        WordToken("下午", "xià wǔ", "Sore hari", "Waktu setelah tengah hari"),
                        WordToken("去", "qù", "Pergi", "Berpindah tempat menjauhi pembicara"),
                        WordToken("看", "kàn", "Melihat / Membaca", "Aktivitas visual"),
                        WordToken("电影", "diàn yǐng", "Movie; film", "Kosakata HSK 2: 电影 (diàn yǐng)"),
                        WordToken("但是", "dàn shì", "Tetapi / Namun", "Kata hubung pertentangan"),
                        WordToken("没有", "méi yǒu", "Tidak ada / Tidak punya", "Bentuk negasi dari 有"),
                        WordToken("好", "hǎo", "Bagus / Baik", "Kualitas positif"),
                        WordToken("电影", "diàn yǐng", "Movie; film", "Kosakata HSK 2: 电影 (diàn yǐng)")
                    )
                ),
                Sentence(
                    id = "s_myafternoon_2",
                    hanzi = "我就打电话给我的好朋友，想和她一起去运动，但是她说今天身体不舒服，我们只能去商场买东西了。",
                    pinyin = "wǒ jiù dǎ diàn huà gěi wǒ de hǎo péng you xiǎng hé tā yī qǐ qù yùn dòng dàn shì tā shuō jīn tiān shēn tǐ bù shū fu wǒ men zhǐ néng qù shāng chǎng mǎi dōng xi le",
                    translation = "Saya Langsung / Segera / Maka Memukul / Mengetik / Melakukan Telephone Memberi / Kepada Saya Punya / Yang (partikel posesif) Bagus / Baik Teman / Sahabat Ingin / Berpikir / Rindu Dan Dia (perempuan) Together; in company (with) Pergi To exercise Tetapi / Namun Dia (perempuan) Berbicara / Berkata Hari ini One&#x27;s health Tidak Nyaman / Enak badan Kami / Kita Only; merely; just Bisa / Mampu / Boleh Pergi Shopping mall Membeli Thing Sudah (partikel perubahan situasi)",
                    tokens = listOf(
                        WordToken("我", "wǒ", "Saya", "Kata ganti orang pertama tunggal"),
                        WordToken("就", "jiù", "Langsung / Segera / Maka", "Menyatakan ketepatan waktu atau kelogisan"),
                        WordToken("打", "dǎ", "Memukul / Mengetik / Melakukan", "Kata kerja umum beragam makna"),
                        WordToken("电话", "diàn huà", "Telephone", "Kosakata HSK 2: 电话 (diàn huà)"),
                        WordToken("给", "gěi", "Memberi / Kepada", "Tindakan memberi atau preposisi sasaran"),
                        WordToken("我", "wǒ", "Saya", "Kata ganti orang pertama tunggal"),
                        WordToken("的", "de", "Punya / Yang (partikel posesif)", "Partikel penjelas modifikasi atau kepemilikan"),
                        WordToken("好", "hǎo", "Bagus / Baik", "Kualitas positif"),
                        WordToken("朋友", "péng you", "Teman / Sahabat", "Orang dekat"),
                        WordToken("想", "xiǎng", "Ingin / Berpikir / Rindu", "Keinginan atau pemikiran batin"),
                        WordToken("和", "hé", "Dan", "Kata hubung setara"),
                        WordToken("她", "tā", "Dia (perempuan)", "Kata ganti orang ketiga tunggal perempuan"),
                        WordToken("一起", "yī qǐ", "Together; in company (with)", "Kosakata HSK 2: 一起 (yī qǐ)"),
                        WordToken("去", "qù", "Pergi", "Berpindah tempat menjauhi pembicara"),
                        WordToken("运动", "yùn dòng", "To exercise", "Kosakata HSK 2: 运动 (yùn dòng)"),
                        WordToken("但是", "dàn shì", "Tetapi / Namun", "Kata hubung pertentangan"),
                        WordToken("她", "tā", "Dia (perempuan)", "Kata ganti orang ketiga tunggal perempuan"),
                        WordToken("说", "shuō", "Berbicara / Berkata", "Menyampaikan ucapan"),
                        WordToken("今天", "jīn tiān", "Hari ini", "Keterangan waktu sekarang"),
                        WordToken("身体", "shēn tǐ", "One&#x27;s health", "Kosakata HSK 2: 身体 (shēn tǐ)"),
                        WordToken("不", "bù", "Tidak", "Kata sangkalan untuk masa kini atau masa depan"),
                        WordToken("舒服", "shū fu", "Nyaman / Enak badan", "Kondisi badan atau tempat menyenangkan"),
                        WordToken("我们", "wǒ men", "Kami / Kita", "Kata ganti orang pertama jamak"),
                        WordToken("只", "zhǐ", "Only; merely; just", "Kosakata HSK 2: 只 (zhǐ)"),
                        WordToken("能", "néng", "Bisa / Mampu / Boleh", "Kata bantu kemampuan atau izin"),
                        WordToken("去", "qù", "Pergi", "Berpindah tempat menjauhi pembicara"),
                        WordToken("商场", "shāng chǎng", "Shopping mall", "Kosakata HSK 2: 商场 (shāng chǎng)"),
                        WordToken("买", "mǎi", "Membeli", "Transaksi belanja"),
                        WordToken("东西", "dōng xi", "Thing", "Kosakata HSK 2: 东西 (dōng xi)"),
                        WordToken("了", "le", "Sudah (partikel perubahan situasi)", "Partikel aspek selesainya tindakan")
                    )
                ),
                Sentence(
                    id = "s_myafternoon_3",
                    hanzi = "我们看见一条漂亮的裙子，她喜欢白色，我喜欢黑色，但是黑色的裙子有点儿贵，所以我买了两条白色的，一条给自己，一条送给她",
                    pinyin = "wǒ men kàn jiàn yī tiáo piào liang de qún zi tā xǐ huan bái sè wǒ xǐ huan hēi sè dàn shì hēi sè de qún zi yǒu diǎn r guì suǒ yǐ wǒ mǎi le liǎng tiáo bái sè de yī tiáo gěi zì jǐ yī tiáo sòng gěi tā",
                    translation = "Kami / Kita To see; to catch sight of One Classifier for long thin things Pretty; beautiful Punya / Yang (partikel posesif) Skirt Dia (perempuan) Menyukai / Gemar White Saya Menyukai / Gemar Black Tetapi / Namun Black Punya / Yang (partikel posesif) Skirt Slightly Mahal Sehingga / Oleh karena itu Saya Membeli Sudah (partikel perubahan situasi) Two Classifier for long thin things White Punya / Yang (partikel posesif) One Classifier for long thin things Memberi / Kepada Oneself; (attributive) one&#x27;s own One Classifier for long thin things Menghadiahkan / Mengantar Memberi / Kepada Dia (perempuan)",
                    tokens = listOf(
                        WordToken("我们", "wǒ men", "Kami / Kita", "Kata ganti orang pertama jamak"),
                        WordToken("看见", "kàn jiàn", "To see; to catch sight of", "Kosakata HSK 2: 看见 (kàn jiàn)"),
                        WordToken("一", "yī", "One", "Kosakata HSK 2: 一 (yī)"),
                        WordToken("条", "tiáo", "Classifier for long thin things", "Kosakata HSK 2: 条 (tiáo)"),
                        WordToken("漂亮", "piào liang", "Pretty; beautiful", "Kosakata HSK 2: 漂亮 (piào liang)"),
                        WordToken("的", "de", "Punya / Yang (partikel posesif)", "Partikel penjelas modifikasi atau kepemilikan"),
                        WordToken("裙子", "qún zi", "Skirt", "Kosakata HSK 2: 裙子 (qún zi)"),
                        WordToken("她", "tā", "Dia (perempuan)", "Kata ganti orang ketiga tunggal perempuan"),
                        WordToken("喜欢", "xǐ huan", "Menyukai / Gemar", "Perasaan suka"),
                        WordToken("白色", "bái sè", "White", "Kosakata HSK 2: 白色 (bái sè)"),
                        WordToken("我", "wǒ", "Saya", "Kata ganti orang pertama tunggal"),
                        WordToken("喜欢", "xǐ huan", "Menyukai / Gemar", "Perasaan suka"),
                        WordToken("黑色", "hēi sè", "Black", "Kosakata HSK 2: 黑色 (hēi sè)"),
                        WordToken("但是", "dàn shì", "Tetapi / Namun", "Kata hubung pertentangan"),
                        WordToken("黑色", "hēi sè", "Black", "Kosakata HSK 2: 黑色 (hēi sè)"),
                        WordToken("的", "de", "Punya / Yang (partikel posesif)", "Partikel penjelas modifikasi atau kepemilikan"),
                        WordToken("裙子", "qún zi", "Skirt", "Kosakata HSK 2: 裙子 (qún zi)"),
                        WordToken("有点儿", "yǒu diǎn r", "Slightly", "Kosakata HSK 2: 有点儿 (yǒu diǎn r)"),
                        WordToken("贵", "guì", "Mahal", "Harga tinggi"),
                        WordToken("所以", "suǒ yǐ", "Sehingga / Oleh karena itu", "Menyatakan akibat konsekuensi"),
                        WordToken("我", "wǒ", "Saya", "Kata ganti orang pertama tunggal"),
                        WordToken("买", "mǎi", "Membeli", "Transaksi belanja"),
                        WordToken("了", "le", "Sudah (partikel perubahan situasi)", "Partikel aspek selesainya tindakan"),
                        WordToken("两", "liǎng", "Two", "Kosakata HSK 2: 两 (liǎng)"),
                        WordToken("条", "tiáo", "Classifier for long thin things", "Kosakata HSK 2: 条 (tiáo)"),
                        WordToken("白色", "bái sè", "White", "Kosakata HSK 2: 白色 (bái sè)"),
                        WordToken("的", "de", "Punya / Yang (partikel posesif)", "Partikel penjelas modifikasi atau kepemilikan"),
                        WordToken("一", "yī", "One", "Kosakata HSK 2: 一 (yī)"),
                        WordToken("条", "tiáo", "Classifier for long thin things", "Kosakata HSK 2: 条 (tiáo)"),
                        WordToken("给", "gěi", "Memberi / Kepada", "Tindakan memberi atau preposisi sasaran"),
                        WordToken("自己", "zì jǐ", "Oneself; (attributive) one&#x27;s own", "Kosakata HSK 2: 自己 (zì jǐ)"),
                        WordToken("一", "yī", "One", "Kosakata HSK 2: 一 (yī)"),
                        WordToken("条", "tiáo", "Classifier for long thin things", "Kosakata HSK 2: 条 (tiáo)"),
                        WordToken("送", "sòng", "Menghadiahkan / Mengantar", "Memberikan bingkisan atau mengantar"),
                        WordToken("给", "gěi", "Memberi / Kepada", "Tindakan memberi atau preposisi sasaran"),
                        WordToken("她", "tā", "Dia (perempuan)", "Kata ganti orang ketiga tunggal perempuan")
                    )
                )
            ),
            questions = listOf(
                StoryQuestion(
                    id = "q_myafternoon_1",
                    questionText = "作者选择在哪里度过这个宁静闲适的下午？ (Di manakah penulis melewatkan sore yang hening dan nyaman ini?)",
                    options = listOf("在街角安静幽雅的咖啡馆靠窗座位 (Di bangku tepi jendela kedai kopi sudut jalan yang tenang)", "在嘈杂的大集市 (Di pasar tumpah yang bising)", "在办公室通宵加班 (Lembur di ruang kantor semalaman)", "在烈日下的建筑工地 (Di proyek bangunan di bawah terik matahari)"),
                    correctAnswerIndex = 0,
                    explanation = "Suasana sudut kedai kopi yang syahdu menjadi tempat favorit melepas penat rutinitas."
                ),
                StoryQuestion(
                    id = "q_myafternoon_2",
                    questionText = "作者一边品尝香浓的饮品，一边在做什么惬意的事？ (Aktivitas menenangkan apakah yang dinikmati penulis sembari menyesap minumannya?)",
                    options = listOf("静心翻阅一本喜爱的文学书籍 (Membaca dengan khidmat lembar demi lembar buku kesukaannya)", "大声打电话吵嚷 (Menelepon dengan suara keras berteriak)", "玩激烈的电子竞技 (Bermain game aksi kompetitif)", "睡觉打呼噜 (Tidur mendengkur)"),
                    correctAnswerIndex = 0,
                    explanation = "Hanyut dalam petualangan kata sastra sambil menikmati alunan musik instrumental lembut."
                ),
                StoryQuestion(
                    id = "q_myafternoon_3",
                    questionText = "窗外的阳光与微风给作者带来了怎样的身心感受？ (Sentuhan semilir angin dan hangatnya surya senja membangkitkan rasa apa?)",
                    options = listOf("感到全身放松、内心平和安宁 (Seluruh raga rileks, batin diliputi ketenangan damai)", "烦躁不安 (Gelisah tidak keruan)", "十分头疼 (Sakit kepala berat)", "想要发火 (Ingin meluapkan amarah)"),
                    correctAnswerIndex = 0,
                    explanation = "Keharmonisan suasana alam dan relaksasi mengembalikan kesegaran pikiran yang jernih."
                ),
                StoryQuestion(
                    id = "q_myafternoon_4",
                    questionText = "在快节奏的现代生活中，这样的一段午后慢时光具有什么意义？ (Makna penting apakah yang terkandung dalam momen jeda melambat di tengah kesibukan kota modern?)",
                    options = listOf("给疲惫的心灵充电，找回生活的诗意与平衡 (Menyegarkan jiwa yang penat, merajut kembali keseimbangan hidup)", "纯粹在虚度光阴 (Murni membuang-buang waktu sia-sia)", "妨碍赚钱发财 (Menghambat upaya menimbun harta)", "说明生活太懒散 (Pertanda hidup terlalu bermalas-malasan)"),
                    correctAnswerIndex = 0,
                    explanation = "Istirahat yang bermakna adalah jeda menyelaraskan ritme jiwa agar melangkah lebih kokoh."
                )
            )
        ),
        // Cerita Mandarin Bean 107 (HSK 2): Take a Walk (Jalan Santai)
        Story(
            id = "story_take_a_walk",
            titleHanzi = "散步",
            titlePinyin = "Sànbù",
            titleTranslation = "Take a Walk (Jalan Santai)",
            level = "HSK 2",
            category = "Kesehatan & Kebugaran",
            description = "Kebiasaan sehat jalan santai keliling taman kota setiap petang sehabis makan malam bersama orang tercinta.",
            coverEmoji = "🚶",
            coverImageRes = R.drawable.cover_story_take_a_walk,
            estimatedReadMinutes = 2,
            sentences = listOf(
                Sentence(
                    id = "s_takewalk_1",
                    hanzi = "一天晚上，一个男孩和一个女孩在公园散步。",
                    pinyin = "yī tiān wǎn shang yī gè nán hái hé yī gè nǚ hái zài gōng yuán sàn bù",
                    translation = "One day; a day Malam hari One Classifier for people or objects in general Boy Dan One Classifier for people or objects in general Girl; lass Di / Berada di Park (for public recreation) Jalan-jalan santai",
                    tokens = listOf(
                        WordToken("一天", "yī tiān", "One day; a day", "Kosakata HSK 2: 一天 (yī tiān)"),
                        WordToken("晚上", "wǎn shang", "Malam hari", "Waktu malam"),
                        WordToken("一", "yī", "One", "Kosakata HSK 2: 一 (yī)"),
                        WordToken("个", "gè", "Classifier for people or objects in general", "Kosakata HSK 2: 个 (gè)"),
                        WordToken("男孩", "nán hái", "Boy", "Kosakata HSK 2: 男孩 (nán hái)"),
                        WordToken("和", "hé", "Dan", "Kata hubung setara"),
                        WordToken("一", "yī", "One", "Kosakata HSK 2: 一 (yī)"),
                        WordToken("个", "gè", "Classifier for people or objects in general", "Kosakata HSK 2: 个 (gè)"),
                        WordToken("女孩", "nǚ hái", "Girl; lass", "Kosakata HSK 2: 女孩 (nǚ hái)"),
                        WordToken("在", "zài", "Di / Berada di", "Preposisi lokasi atau aspek progresif"),
                        WordToken("公园", "gōng yuán", "Park (for public recreation)", "Kosakata HSK 2: 公园 (gōng yuán)"),
                        WordToken("散步", "sàn bù", "Jalan-jalan santai", "Aktivitas jalan santai relaksasi")
                    )
                ),
                Sentence(
                    id = "s_takewalk_2",
                    hanzi = "男孩说:\"今天晚上的天气不太好，有点儿冷。",
                    pinyin = "nán hái shuō jīn tiān wǎn shang de tiān qì bù tài hǎo yǒu diǎn r lěng",
                    translation = "Boy Berbicara / Berkata Hari ini Malam hari Punya / Yang (partikel posesif) Weather Tidak Terlalu Bagus / Baik Slightly Dingin",
                    tokens = listOf(
                        WordToken("男孩", "nán hái", "Boy", "Kosakata HSK 2: 男孩 (nán hái)"),
                        WordToken("说", "shuō", "Berbicara / Berkata", "Menyampaikan ucapan"),
                        WordToken("今天", "jīn tiān", "Hari ini", "Keterangan waktu sekarang"),
                        WordToken("晚上", "wǎn shang", "Malam hari", "Waktu malam"),
                        WordToken("的", "de", "Punya / Yang (partikel posesif)", "Partikel penjelas modifikasi atau kepemilikan"),
                        WordToken("天气", "tiān qì", "Weather", "Kosakata HSK 2: 天气 (tiān qì)"),
                        WordToken("不", "bù", "Tidak", "Kata sangkalan untuk masa kini atau masa depan"),
                        WordToken("太", "tài", "Terlalu", "Derajat melampaui batas"),
                        WordToken("好", "hǎo", "Bagus / Baik", "Kualitas positif"),
                        WordToken("有点儿", "yǒu diǎn r", "Slightly", "Kosakata HSK 2: 有点儿 (yǒu diǎn r)"),
                        WordToken("冷", "lěng", "Dingin", "Suhu rendah")
                    )
                ),
                Sentence(
                    id = "s_takewalk_3",
                    hanzi = "\"",
                    pinyin = "",
                    translation = "",
                    tokens = listOf(

                    )
                ),
                Sentence(
                    id = "s_takewalk_4",
                    hanzi = "女孩说:\"是的，我也觉得今天晚上有点儿冷。”",
                    pinyin = "nǚ hái shuō shì de wǒ yě jué de jīn tiān wǎn shang yǒu diǎn r lěng",
                    translation = "Girl; lass Berbicara / Berkata Adalah Punya / Yang (partikel posesif) Saya Juga / Pun To think that ...; to feel that ... Hari ini Malam hari Slightly Dingin",
                    tokens = listOf(
                        WordToken("女孩", "nǚ hái", "Girl; lass", "Kosakata HSK 2: 女孩 (nǚ hái)"),
                        WordToken("说", "shuō", "Berbicara / Berkata", "Menyampaikan ucapan"),
                        WordToken("是", "shì", "Adalah", "Kopula penjelas"),
                        WordToken("的", "de", "Punya / Yang (partikel posesif)", "Partikel penjelas modifikasi atau kepemilikan"),
                        WordToken("我", "wǒ", "Saya", "Kata ganti orang pertama tunggal"),
                        WordToken("也", "yě", "Juga / Pun", "Partikel penanda kesamaan"),
                        WordToken("觉得", "jué de", "To think that ...; to feel that ...", "Kosakata HSK 2: 觉得 (jué de)"),
                        WordToken("今天", "jīn tiān", "Hari ini", "Keterangan waktu sekarang"),
                        WordToken("晚上", "wǎn shang", "Malam hari", "Waktu malam"),
                        WordToken("有点儿", "yǒu diǎn r", "Slightly", "Kosakata HSK 2: 有点儿 (yǒu diǎn r)"),
                        WordToken("冷", "lěng", "Dingin", "Suhu rendah")
                    )
                ),
                Sentence(
                    id = "s_takewalk_5",
                    hanzi = "说完后，男孩看了看自己的衣服。",
                    pinyin = "shuō wán hòu nán hái kàn le kàn zì jǐ de yī fu",
                    translation = "Berbicara / Berkata To finish Afterwards Boy Melihat / Membaca Sudah (partikel perubahan situasi) Melihat / Membaca Oneself; (attributive) one&#x27;s own Punya / Yang (partikel posesif) Clothes",
                    tokens = listOf(
                        WordToken("说", "shuō", "Berbicara / Berkata", "Menyampaikan ucapan"),
                        WordToken("完", "wán", "To finish", "Kosakata HSK 2: 完 (wán)"),
                        WordToken("后", "hòu", "Afterwards", "Kosakata HSK 2: 后 (hòu)"),
                        WordToken("男孩", "nán hái", "Boy", "Kosakata HSK 2: 男孩 (nán hái)"),
                        WordToken("看", "kàn", "Melihat / Membaca", "Aktivitas visual"),
                        WordToken("了", "le", "Sudah (partikel perubahan situasi)", "Partikel aspek selesainya tindakan"),
                        WordToken("看", "kàn", "Melihat / Membaca", "Aktivitas visual"),
                        WordToken("自己", "zì jǐ", "Oneself; (attributive) one&#x27;s own", "Kosakata HSK 2: 自己 (zì jǐ)"),
                        WordToken("的", "de", "Punya / Yang (partikel posesif)", "Partikel penjelas modifikasi atau kepemilikan"),
                        WordToken("衣服", "yī fu", "Clothes", "Kosakata HSK 2: 衣服 (yī fu)")
                    )
                ),
                Sentence(
                    id = "s_takewalk_6",
                    hanzi = "这时女孩心里很高兴，她以为男孩要把自己的衣服给她穿。",
                    pinyin = "zhè shí nǚ hái xīn lǐ hěn gāo xìng tā yǐ wéi nán hái yào bǎ zì jǐ de yī fu gěi tā chuān",
                    translation = "This; these O&#x27;clock Girl; lass Chest Sangat Senang / Gembira Dia (perempuan) To think; to believe Boy Mau / Akan / Harus (used to put the object before the verb: 把[ba3] + {noun} + {verb}) Oneself; (attributive) one&#x27;s own Punya / Yang (partikel posesif) Clothes Memberi / Kepada Dia (perempuan) Memakai (baju/sepatu)",
                    tokens = listOf(
                        WordToken("这", "zhè", "This; these", "Kosakata HSK 2: 这 (zhè)"),
                        WordToken("时", "shí", "O&#x27;clock", "Kosakata HSK 2: 时 (shí)"),
                        WordToken("女孩", "nǚ hái", "Girl; lass", "Kosakata HSK 2: 女孩 (nǚ hái)"),
                        WordToken("心里", "xīn lǐ", "Chest", "Kosakata HSK 2: 心里 (xīn lǐ)"),
                        WordToken("很", "hěn", "Sangat", "Tingkat derajat"),
                        WordToken("高兴", "gāo xìng", "Senang / Gembira", "Perasaan ceria bahagia"),
                        WordToken("她", "tā", "Dia (perempuan)", "Kata ganti orang ketiga tunggal perempuan"),
                        WordToken("以为", "yǐ wéi", "To think; to believe", "Kosakata HSK 2: 以为 (yǐ wéi)"),
                        WordToken("男孩", "nán hái", "Boy", "Kosakata HSK 2: 男孩 (nán hái)"),
                        WordToken("要", "yào", "Mau / Akan / Harus", "Menyatakan niat atau keharusan"),
                        WordToken("把", "bǎ", "(used to put the object before the verb: 把[ba3] + {noun} + {verb})", "Kosakata HSK 2: 把 (bǎ)"),
                        WordToken("自己", "zì jǐ", "Oneself; (attributive) one&#x27;s own", "Kosakata HSK 2: 自己 (zì jǐ)"),
                        WordToken("的", "de", "Punya / Yang (partikel posesif)", "Partikel penjelas modifikasi atau kepemilikan"),
                        WordToken("衣服", "yī fu", "Clothes", "Kosakata HSK 2: 衣服 (yī fu)"),
                        WordToken("给", "gěi", "Memberi / Kepada", "Tindakan memberi atau preposisi sasaran"),
                        WordToken("她", "tā", "Dia (perempuan)", "Kata ganti orang ketiga tunggal perempuan"),
                        WordToken("穿", "chuān", "Memakai (baju/sepatu)", "Mengenakan pakaian")
                    )
                ),
                Sentence(
                    id = "s_takewalk_7",
                    hanzi = "但是男孩说:\"还好我今天穿了两件衣服。”",
                    pinyin = "dàn shì nán hái shuō hái hǎo wǒ jīn tiān chuān le liǎng jiàn yī fu",
                    translation = "Tetapi / Namun Boy Berbicara / Berkata Fortunately; luckily Saya Hari ini Memakai (baju/sepatu) Sudah (partikel perubahan situasi) Two Classifier for events, things, clothes etc Clothes",
                    tokens = listOf(
                        WordToken("但是", "dàn shì", "Tetapi / Namun", "Kata hubung pertentangan"),
                        WordToken("男孩", "nán hái", "Boy", "Kosakata HSK 2: 男孩 (nán hái)"),
                        WordToken("说", "shuō", "Berbicara / Berkata", "Menyampaikan ucapan"),
                        WordToken("还好", "hái hǎo", "Fortunately; luckily", "Kosakata HSK 2: 还好 (hái hǎo)"),
                        WordToken("我", "wǒ", "Saya", "Kata ganti orang pertama tunggal"),
                        WordToken("今天", "jīn tiān", "Hari ini", "Keterangan waktu sekarang"),
                        WordToken("穿", "chuān", "Memakai (baju/sepatu)", "Mengenakan pakaian"),
                        WordToken("了", "le", "Sudah (partikel perubahan situasi)", "Partikel aspek selesainya tindakan"),
                        WordToken("两", "liǎng", "Two", "Kosakata HSK 2: 两 (liǎng)"),
                        WordToken("件", "jiàn", "Classifier for events, things, clothes etc", "Kosakata HSK 2: 件 (jiàn)"),
                        WordToken("衣服", "yī fu", "Clothes", "Kosakata HSK 2: 衣服 (yī fu)")
                    )
                )
            ),
            questions = listOf(
                StoryQuestion(
                    id = "q_takewalk_1",
                    questionText = "民间俗语“饭后百步走”后半句倡导的益处是什么？ (Pepatah terkenal '饭后百步走' (berjalan seratus langkah usai makan) mengajarkan apa?)",
                    options = listOf("活到九十九，助消化促健康 (Bisa hidup sehat hingga umur 99 tahun karena melancarkan pencernaan)", "马上就长胖 (Membuat badan lekas gemuk)", "容易扭伤脚 (Mudah terkilir pergelangan kaki)", "肚子会变痛 (Perut akan mulas melilit)"),
                    correctAnswerIndex = 0,
                    explanation = "Kearifan tradisi Tiongkok menekankan jalan santai santai usai makan demi metabolisme lambung yang sehat."
                ),
                StoryQuestion(
                    id = "q_takewalk_2",
                    questionText = "他们散步通常选择在什么优美舒适的场所进行？ (Di manakah rute pilihan jalan santai yang asri dan sejuk?)",
                    options = listOf("绿树成荫、空气清新的社区公园湖畔 (Tepi danau taman kompleks yang dinaungi pepohonan rindang berhawa segar)", "车流不息的高速公路 (Jalan tol padat kendaraan melaju cepat)", "垃圾堆放场 (Tempat penimbunan sampah)", "狭窄黑暗的地下道 (Lorong bawah tanah sempit yang gelap gulita)"),
                    correctAnswerIndex = 0,
                    explanation = "Keasrian taman kota dengan semilir angin sejuk memanjakan indra penglihatan dan paru-paru."
                ),
                StoryQuestion(
                    id = "q_takewalk_3",
                    questionText = "在散步过程中，家人之间一般会进行怎样的交流？ (Percakapan santai seperti apakah yang terjalin hangat sepanjang jalan santai?)",
                    options = listOf("闲聊白天的趣事见闻，倾听彼此的心声 (Berbincang santai peristiwa lucu siang hari dan mendengarkan unek-unek sanubari)", "互相大声指责争吵 (Saling mencaci dan berdebat keras)", "各戴耳机一句话都不讲 (Masing-masing memakai earphone membisu seribu bahasa)", "谈论恐怖鬼故事 (Menceritakan kisah horor seram)"),
                    correctAnswerIndex = 0,
                    explanation = "Jalan santai menjadi ruang dialog intim mempererat keakraban ikatan antaranggota keluarga."
                ),
                StoryQuestion(
                    id = "q_takewalk_4",
                    questionText = "坚持日常散步锻炼能够带来哪些身心健康的改善？ (Manfaat holistik apakah yang dipetik dari membiasakan diri jalan kaki berkala?)",
                    options = listOf("促进血液循环、舒缓心理压力并改善夜间睡眠 (Melancarkan peredaran darah, meredakan ketegangan stres, dan meningkatkan mutu tidur lelap)", "导致关节严重损伤 (Menyebabkan cedera sendi berat)", "让心跳停止 (Mengakibatkan detak jantung berhenti)", "降低智商 (Menurunkan kecerdasan daya pikir)"),
                    correctAnswerIndex = 0,
                    explanation = "Olahraga berintensitas ringan namun teratur menjaga kebugaran jantung dan kejernihan mental."
                )
            )
        ),
        // Cerita Mandarin Bean 108 (HSK 2): Thirsty (Haus)
        Story(
            id = "story_thirsty",
            titleHanzi = "渴了",
            titlePinyin = "Kě Le",
            titleTranslation = "Thirsty (Haus)",
            level = "HSK 2",
            category = "Kebugaran & Air Minum",
            description = "Pentingnya menjaga hidrasi tubuh dengan meminum air putih secara teratur setelah beraktivitas fisik di terik panas.",
            coverEmoji = "💧",
            coverImageRes = R.drawable.cover_story_thirsty,
            estimatedReadMinutes = 2,
            sentences = listOf(
                Sentence(
                    id = "s_thirsty2_1",
                    hanzi = "一个男人对他的朋友说：我做了一次手术，手术后医生把一块海绵忘在我的身体里了。",
                    pinyin = "yī gè nán rén duì tā de péng you shuō wǒ zuò le yī cì shǒu shù shǒu shù hòu yī shēng bǎ yī kuài hǎi mián wàng zài wǒ de shēn tǐ lǐ le",
                    translation = "One Classifier for people or objects in general A man Towards; at; for Dia (laki-laki) Punya / Yang (partikel posesif) Teman / Sahabat Berbicara / Berkata Saya Membuat / Mengerjakan Sudah (partikel perubahan situasi) One Classifier for enumerated events: time (surgical) operation (surgical) operation Afterwards Dokter (used to put the object before the verb: 把[ba3] + {noun} + {verb}) One Classifier for pieces of cloth, cake, soap etc (zoology) sea sponge To forget Di / Berada di Saya Punya / Yang (partikel posesif) The body Lining Sudah (partikel perubahan situasi)",
                    tokens = listOf(
                        WordToken("一", "yī", "One", "Kosakata HSK 2: 一 (yī)"),
                        WordToken("个", "gè", "Classifier for people or objects in general", "Kosakata HSK 2: 个 (gè)"),
                        WordToken("男人", "nán rén", "A man", "Kosakata HSK 2: 男人 (nán rén)"),
                        WordToken("对", "duì", "Towards; at; for", "Kosakata HSK 2: 对 (duì)"),
                        WordToken("他", "tā", "Dia (laki-laki)", "Kata ganti orang ketiga tunggal"),
                        WordToken("的", "de", "Punya / Yang (partikel posesif)", "Partikel penjelas modifikasi atau kepemilikan"),
                        WordToken("朋友", "péng you", "Teman / Sahabat", "Orang dekat"),
                        WordToken("说", "shuō", "Berbicara / Berkata", "Menyampaikan ucapan"),
                        WordToken("我", "wǒ", "Saya", "Kata ganti orang pertama tunggal"),
                        WordToken("做", "zuò", "Membuat / Mengerjakan", "Aktivitas kerja"),
                        WordToken("了", "le", "Sudah (partikel perubahan situasi)", "Partikel aspek selesainya tindakan"),
                        WordToken("一", "yī", "One", "Kosakata HSK 2: 一 (yī)"),
                        WordToken("次", "cì", "Classifier for enumerated events: time", "Kosakata HSK 2: 次 (cì)"),
                        WordToken("手术", "shǒu shù", "(surgical) operation", "Kosakata HSK 2: 手术 (shǒu shù)"),
                        WordToken("手术", "shǒu shù", "(surgical) operation", "Kosakata HSK 2: 手术 (shǒu shù)"),
                        WordToken("后", "hòu", "Afterwards", "Kosakata HSK 2: 后 (hòu)"),
                        WordToken("医生", "yī shēng", "Dokter", "Tenaga medis"),
                        WordToken("把", "bǎ", "(used to put the object before the verb: 把[ba3] + {noun} + {verb})", "Kosakata HSK 2: 把 (bǎ)"),
                        WordToken("一", "yī", "One", "Kosakata HSK 2: 一 (yī)"),
                        WordToken("块", "kuài", "Classifier for pieces of cloth, cake, soap etc", "Kosakata HSK 2: 块 (kuài)"),
                        WordToken("海绵", "hǎi mián", "(zoology) sea sponge", "Kosakata HSK 2: 海绵 (hǎi mián)"),
                        WordToken("忘", "wàng", "To forget", "Kosakata HSK 2: 忘 (wàng)"),
                        WordToken("在", "zài", "Di / Berada di", "Preposisi lokasi atau aspek progresif"),
                        WordToken("我", "wǒ", "Saya", "Kata ganti orang pertama tunggal"),
                        WordToken("的", "de", "Punya / Yang (partikel posesif)", "Partikel penjelas modifikasi atau kepemilikan"),
                        WordToken("身体", "shēn tǐ", "The body", "Kosakata HSK 2: 身体 (shēn tǐ)"),
                        WordToken("里", "lǐ", "Lining", "Kosakata HSK 2: 里 (lǐ)"),
                        WordToken("了", "le", "Sudah (partikel perubahan situasi)", "Partikel aspek selesainya tindakan")
                    )
                ),
                Sentence(
                    id = "s_thirsty2_2",
                    hanzi = "朋友说：太糟糕了！",
                    pinyin = "péng you shuō tài zāo gāo le",
                    translation = "Teman / Sahabat Berbicara / Berkata Terlalu Too bad Sudah (partikel perubahan situasi)",
                    tokens = listOf(
                        WordToken("朋友", "péng you", "Teman / Sahabat", "Orang dekat"),
                        WordToken("说", "shuō", "Berbicara / Berkata", "Menyampaikan ucapan"),
                        WordToken("太", "tài", "Terlalu", "Derajat melampaui batas"),
                        WordToken("糟糕", "zāo gāo", "Too bad", "Kosakata HSK 2: 糟糕 (zāo gāo)"),
                        WordToken("了", "le", "Sudah (partikel perubahan situasi)", "Partikel aspek selesainya tindakan")
                    )
                ),
                Sentence(
                    id = "s_thirsty2_3",
                    hanzi = "你会觉得疼吗？",
                    pinyin = "nǐ huì jué de téng ma",
                    translation = "Kamu To be likely to; to be sure to To feel (uncomfortable etc) (it) hurts; sore Apakah (partikel tanya)",
                    tokens = listOf(
                        WordToken("你", "nǐ", "Kamu", "Kata ganti orang kedua tunggal"),
                        WordToken("会", "huì", "To be likely to; to be sure to", "Kosakata HSK 2: 会 (huì)"),
                        WordToken("觉得", "jué de", "To feel (uncomfortable etc)", "Kosakata HSK 2: 觉得 (jué de)"),
                        WordToken("疼", "téng", "(it) hurts; sore", "Kosakata HSK 2: 疼 (téng)"),
                        WordToken("吗", "ma", "Apakah (partikel tanya)", "Partikel di akhir kalimat interogatif ya/tidak")
                    )
                ),
                Sentence(
                    id = "s_thirsty2_4",
                    hanzi = "这个男人说：不疼，只是经常很渴。",
                    pinyin = "zhè gè nán rén shuō bù téng zhǐ shì jīng cháng hěn kě",
                    translation = "This; these Classifier for people or objects in general A man Berbicara / Berkata Tidak (it) hurts; sore Merely; only; just; nothing but Frequently; constantly; regularly; often Sangat Haus",
                    tokens = listOf(
                        WordToken("这", "zhè", "This; these", "Kosakata HSK 2: 这 (zhè)"),
                        WordToken("个", "gè", "Classifier for people or objects in general", "Kosakata HSK 2: 个 (gè)"),
                        WordToken("男人", "nán rén", "A man", "Kosakata HSK 2: 男人 (nán rén)"),
                        WordToken("说", "shuō", "Berbicara / Berkata", "Menyampaikan ucapan"),
                        WordToken("不", "bù", "Tidak", "Kata sangkalan untuk masa kini atau masa depan"),
                        WordToken("疼", "téng", "(it) hurts; sore", "Kosakata HSK 2: 疼 (téng)"),
                        WordToken("只是", "zhǐ shì", "Merely; only; just; nothing but", "Kosakata HSK 2: 只是 (zhǐ shì)"),
                        WordToken("经常", "jīng cháng", "Frequently; constantly; regularly; often", "Kosakata HSK 2: 经常 (jīng cháng)"),
                        WordToken("很", "hěn", "Sangat", "Tingkat derajat"),
                        WordToken("渴", "kě", "Haus", "Kebutuhan akan minum")
                    )
                )
            ),
            questions = listOf(
                StoryQuestion(
                    id = "q_thirsty2_1",
                    questionText = "在打完一场激烈的篮球赛后，主人公身体有什么生理反应？ (Reaksi fisiologis apa yang dirasakan tubuh sang tokoh sehabis tanding basket sengit?)",
                    options = listOf("大汗淋漓，嗓子发干极度口渴 (Keringat bercucuran, kerongkongan terasa kering dan luar biasa haus)", "感觉全身冰凉 (Merasa sekujur tubuh kedinginan)", "一点都不想喝水 (Sama sekali tidak ingin meneguk air)", "想要穿厚棉袄 (Ingin mengenakan jaket bulu tebal)"),
                    correctAnswerIndex = 0,
                    explanation = "Pengeluaran cairan melalui keringat menuntut pasokan air mineral untuk rehidrasi sel tubuh."
                ),
                StoryQuestion(
                    id = "q_thirsty2_2",
                    questionText = "面对极度口渴，最健康科学的补水选择是什么？ (Pilihan minuman paling sehat dan ilmiah guna memulihkan dahaga adalah?)",
                    options = listOf("适量饮用温开水或常温淡盐水 (Meminum air putih hangat atau air mineral tawar bersuhu normal secukupnya)", "一口气狂饮大量冰镇高糖碳酸饮料 (Menenggak habis berbotol-botol minuman bersoda dingin berkadar gula tinggi)", "立刻喝烈酒解渴 (Langsung meminum arak keras untuk meredakan haus)", "只吃干辣椒 (Hanya mengunyah cabai rawit kering)"),
                    correctAnswerIndex = 0,
                    explanation = "Air putih bersuhu ruangan menjaga lambung tidak kaget dan memulihkan kadar air alami tubuh."
                ),
                StoryQuestion(
                    id = "q_thirsty2_3",
                    questionText = "猛烈运动后如果不加节制地立刻牛饮冰水，可能会对身体产生什么不良反应？ (Efek buruk apa yang timbul bila langsung menenggak air es teramat dingin seusai olahraga berat?)",
                    options = listOf("刺激胃肠道痉挛引发腹痛腹泻，甚至加重机体负担 (Memicu kram lambung, mulas diare, dan membebani kerja jantung)", "让肌肉瞬间变得无比强壮 (Membuat otot seketika bertambah kekar)", "让人飞起来 (Membuat tubuh terbang melayang)", "没有任何影响 (Tidak memiliki dampak apa pun)"),
                    correctAnswerIndex = 0,
                    explanation = "Kontras suhu ekstrem mendadak dapat mengejutkan dinding pembuluh darah di saluran pencernaan."
                ),
                StoryQuestion(
                    id = "q_thirsty2_4",
                    questionText = "这个简短生动的故事旨在向我们科普什么日常健康习惯？ (Kebiasaan sehat harian apa yang ingin diedukasikan lewat kisah ini?)",
                    options = listOf("科学定时补水，养成足量饮用健康白开水的好习惯 (Teratur mencukupi asupan cairan dengan meminum air putih bermutu)", "不渴绝不喝水 (Baru minum saat kehausan parah melanda)", "只喝奶茶不喝白水 (Hanya minum boba milk tea dan pantang air tawar)", "每天喝十杯浓咖啡 (Meminum sepuluh cangkir kopi pekat tiap hari)"),
                    correctAnswerIndex = 0,
                    explanation = "Menjaga hidrasi harian adalah pilar mendasar kelancaran metabolisme dan daya tahan tubuh."
                )
            )
        ),
        // Cerita Mandarin Bean 109 (HSK 2): Send a Letter (Mengirim Surat)
        Story(
            id = "story_send_a_letter",
            titleHanzi = "寄信",
            titlePinyin = "Jì Xìn",
            titleTranslation = "Send a Letter (Mengirim Surat)",
            level = "HSK 2",
            category = "Komunikasi & Kantor Pos",
            description = "Nostalgia mengirimkan kartu pos dan surat bertulisan tangan kepada sahabat lama melalui kantor pos hijau.",
            coverEmoji = "✉️",
            coverImageRes = R.drawable.cover_story_send_a_letter,
            estimatedReadMinutes = 2,
            sentences = listOf(
                Sentence(
                    id = "s_sendletter_1",
                    hanzi = "有一天，爸爸让八岁的女儿去寄一封信，女儿已经拿着信跑了，爸爸才想起信封上没写地址和收信人的名字。",
                    pinyin = "yǒu yī tiān bà ba ràng bā suì de nǚ ér qù jì yī fēng xìn nǚ ér yǐ jīng ná zhe xìn pǎo le bà ba cái xiǎng qǐ xìn fēng shàng méi xiě dì zhǐ hé shōu xìn rén de míng zi",
                    translation = "Mempunyai / Ada One Hari Ayah To permit Eight Classifier for years (of age) Punya / Yang (partikel posesif) Anak perempuan Pergi To entrust; to place in sb&#x27;s care One Classifier for sealed objects, esp. letters Letter Anak perempuan Sudah To hold Aspect particle indicating action in progress or ongoing state Letter To run Sudah (partikel perubahan situasi) Ayah Baru saja / Justru To recall Envelope (noun suffix) on; above Belum / Tidak To write Address Dan To receive a letter or mail; addressee Person; people Punya / Yang (partikel posesif) Name (of a person or thing)",
                    tokens = listOf(
                        WordToken("有", "yǒu", "Mempunyai / Ada", "Menyatakan kepemilikan atau eksistensi"),
                        WordToken("一", "yī", "One", "Kosakata HSK 2: 一 (yī)"),
                        WordToken("天", "tiān", "Hari", "Satuan hari"),
                        WordToken("爸爸", "bà ba", "Ayah", "Anggota keluarga"),
                        WordToken("让", "ràng", "To permit", "Kosakata HSK 2: 让 (ràng)"),
                        WordToken("八", "bā", "Eight", "Kosakata HSK 2: 八 (bā)"),
                        WordToken("岁", "suì", "Classifier for years (of age)", "Kosakata HSK 2: 岁 (suì)"),
                        WordToken("的", "de", "Punya / Yang (partikel posesif)", "Partikel penjelas modifikasi atau kepemilikan"),
                        WordToken("女儿", "nǚ ér", "Anak perempuan", "Keturunan perempuan"),
                        WordToken("去", "qù", "Pergi", "Berpindah tempat menjauhi pembicara"),
                        WordToken("寄", "jì", "To entrust; to place in sb&#x27;s care", "Kosakata HSK 2: 寄 (jì)"),
                        WordToken("一", "yī", "One", "Kosakata HSK 2: 一 (yī)"),
                        WordToken("封", "fēng", "Classifier for sealed objects, esp. letters", "Kosakata HSK 2: 封 (fēng)"),
                        WordToken("信", "xìn", "Letter", "Kosakata HSK 2: 信 (xìn)"),
                        WordToken("女儿", "nǚ ér", "Anak perempuan", "Keturunan perempuan"),
                        WordToken("已经", "yǐ jīng", "Sudah", "Aspek telah terjadi"),
                        WordToken("拿", "ná", "To hold", "Kosakata HSK 2: 拿 (ná)"),
                        WordToken("着", "zhe", "Aspect particle indicating action in progress or ongoing state", "Kosakata HSK 2: 着 (zhe)"),
                        WordToken("信", "xìn", "Letter", "Kosakata HSK 2: 信 (xìn)"),
                        WordToken("跑", "pǎo", "To run", "Kosakata HSK 2: 跑 (pǎo)"),
                        WordToken("了", "le", "Sudah (partikel perubahan situasi)", "Partikel aspek selesainya tindakan"),
                        WordToken("爸爸", "bà ba", "Ayah", "Anggota keluarga"),
                        WordToken("才", "cái", "Baru saja / Justru", "Menyatakan keterlambatan atau kondisi khusus"),
                        WordToken("想起", "xiǎng qǐ", "To recall", "Kosakata HSK 2: 想起 (xiǎng qǐ)"),
                        WordToken("信封", "xìn fēng", "Envelope", "Kosakata HSK 2: 信封 (xìn fēng)"),
                        WordToken("上", "shàng", "(noun suffix) on; above", "Kosakata HSK 2: 上 (shàng)"),
                        WordToken("没", "méi", "Belum / Tidak", "Kata sangkalan untuk keberadaan atau masa lampau"),
                        WordToken("写", "xiě", "To write", "Kosakata HSK 2: 写 (xiě)"),
                        WordToken("地址", "dì zhǐ", "Address", "Kosakata HSK 2: 地址 (dì zhǐ)"),
                        WordToken("和", "hé", "Dan", "Kata hubung setara"),
                        WordToken("收信", "shōu xìn", "To receive a letter or mail; addressee", "Kosakata HSK 2: 收信 (shōu xìn)"),
                        WordToken("人", "rén", "Person; people", "Kosakata HSK 2: 人 (rén)"),
                        WordToken("的", "de", "Punya / Yang (partikel posesif)", "Partikel penjelas modifikasi atau kepemilikan"),
                        WordToken("名字", "míng zi", "Name (of a person or thing)", "Kosakata HSK 2: 名字 (míng zi)")
                    )
                ),
                Sentence(
                    id = "s_sendletter_2",
                    hanzi = "女儿回来后，爸爸问她：你把信丢进邮筒了吗?",
                    pinyin = "nǚ ér huí lái hòu bà ba wèn tā nǐ bǎ xìn diū jìn yóu tǒng le ma",
                    translation = "Anak perempuan To return; to come back Afterwards Ayah To ask; to inquire Dia (perempuan) Kamu (used to put the object before the verb: 把[ba3] + {noun} + {verb}) Letter To lose To go in Mailbox Sudah (partikel perubahan situasi) Apakah (partikel tanya)",
                    tokens = listOf(
                        WordToken("女儿", "nǚ ér", "Anak perempuan", "Keturunan perempuan"),
                        WordToken("回来", "huí lái", "To return; to come back", "Kosakata HSK 2: 回来 (huí lái)"),
                        WordToken("后", "hòu", "Afterwards", "Kosakata HSK 2: 后 (hòu)"),
                        WordToken("爸爸", "bà ba", "Ayah", "Anggota keluarga"),
                        WordToken("问", "wèn", "To ask; to inquire", "Kosakata HSK 2: 问 (wèn)"),
                        WordToken("她", "tā", "Dia (perempuan)", "Kata ganti orang ketiga tunggal perempuan"),
                        WordToken("你", "nǐ", "Kamu", "Kata ganti orang kedua tunggal"),
                        WordToken("把", "bǎ", "(used to put the object before the verb: 把[ba3] + {noun} + {verb})", "Kosakata HSK 2: 把 (bǎ)"),
                        WordToken("信", "xìn", "Letter", "Kosakata HSK 2: 信 (xìn)"),
                        WordToken("丢", "diū", "To lose", "Kosakata HSK 2: 丢 (diū)"),
                        WordToken("进", "jìn", "To go in", "Kosakata HSK 2: 进 (jìn)"),
                        WordToken("邮筒", "yóu tǒng", "Mailbox", "Kosakata HSK 2: 邮筒 (yóu tǒng)"),
                        WordToken("了", "le", "Sudah (partikel perubahan situasi)", "Partikel aspek selesainya tindakan"),
                        WordToken("吗", "ma", "Apakah (partikel tanya)", "Partikel di akhir kalimat interogatif ya/tidak")
                    )
                ),
                Sentence(
                    id = "s_sendletter_3",
                    hanzi = "女儿回答：当然。",
                    pinyin = "nǚ ér huí dá dāng rán",
                    translation = "Anak perempuan To reply; to answer Certainly",
                    tokens = listOf(
                        WordToken("女儿", "nǚ ér", "Anak perempuan", "Keturunan perempuan"),
                        WordToken("回答", "huí dá", "To reply; to answer", "Kosakata HSK 2: 回答 (huí dá)"),
                        WordToken("当然", "dāng rán", "Certainly", "Kosakata HSK 2: 当然 (dāng rán)")
                    )
                ),
                Sentence(
                    id = "s_sendletter_4",
                    hanzi = "爸爸：你没看见信封上没有写地址和收信人名字吗?",
                    pinyin = "bà ba nǐ méi kàn jiàn xìn fēng shàng méi yǒu xiě dì zhǐ hé shōu xìn rén míng zi ma",
                    translation = "Ayah Kamu Belum / Tidak To see; to catch sight of Envelope (noun suffix) on; above Tidak ada / Tidak punya To write Address Dan To receive a letter or mail; addressee Person; people Name (of a person or thing) Apakah (partikel tanya)",
                    tokens = listOf(
                        WordToken("爸爸", "bà ba", "Ayah", "Anggota keluarga"),
                        WordToken("你", "nǐ", "Kamu", "Kata ganti orang kedua tunggal"),
                        WordToken("没", "méi", "Belum / Tidak", "Kata sangkalan untuk keberadaan atau masa lampau"),
                        WordToken("看见", "kàn jiàn", "To see; to catch sight of", "Kosakata HSK 2: 看见 (kàn jiàn)"),
                        WordToken("信封", "xìn fēng", "Envelope", "Kosakata HSK 2: 信封 (xìn fēng)"),
                        WordToken("上", "shàng", "(noun suffix) on; above", "Kosakata HSK 2: 上 (shàng)"),
                        WordToken("没有", "méi yǒu", "Tidak ada / Tidak punya", "Bentuk negasi dari 有"),
                        WordToken("写", "xiě", "To write", "Kosakata HSK 2: 写 (xiě)"),
                        WordToken("地址", "dì zhǐ", "Address", "Kosakata HSK 2: 地址 (dì zhǐ)"),
                        WordToken("和", "hé", "Dan", "Kata hubung setara"),
                        WordToken("收信", "shōu xìn", "To receive a letter or mail; addressee", "Kosakata HSK 2: 收信 (shōu xìn)"),
                        WordToken("人", "rén", "Person; people", "Kosakata HSK 2: 人 (rén)"),
                        WordToken("名字", "míng zi", "Name (of a person or thing)", "Kosakata HSK 2: 名字 (míng zi)"),
                        WordToken("吗", "ma", "Apakah (partikel tanya)", "Partikel di akhir kalimat interogatif ya/tidak")
                    )
                ),
                Sentence(
                    id = "s_sendletter_5",
                    hanzi = "女儿：我当然看见信封上什么也没写。",
                    pinyin = "nǚ ér wǒ dāng rán kàn jiàn xìn fēng shàng shén me yě méi xiě",
                    translation = "Anak perempuan Saya Certainly To see; to catch sight of Envelope (noun suffix) on; above Something; anything Juga / Pun Belum / Tidak To write",
                    tokens = listOf(
                        WordToken("女儿", "nǚ ér", "Anak perempuan", "Keturunan perempuan"),
                        WordToken("我", "wǒ", "Saya", "Kata ganti orang pertama tunggal"),
                        WordToken("当然", "dāng rán", "Certainly", "Kosakata HSK 2: 当然 (dāng rán)"),
                        WordToken("看见", "kàn jiàn", "To see; to catch sight of", "Kosakata HSK 2: 看见 (kàn jiàn)"),
                        WordToken("信封", "xìn fēng", "Envelope", "Kosakata HSK 2: 信封 (xìn fēng)"),
                        WordToken("上", "shàng", "(noun suffix) on; above", "Kosakata HSK 2: 上 (shàng)"),
                        WordToken("什么", "shén me", "Something; anything", "Kosakata HSK 2: 什么 (shén me)"),
                        WordToken("也", "yě", "Juga / Pun", "Partikel penanda kesamaan"),
                        WordToken("没", "méi", "Belum / Tidak", "Kata sangkalan untuk keberadaan atau masa lampau"),
                        WordToken("写", "xiě", "To write", "Kosakata HSK 2: 写 (xiě)")
                    )
                ),
                Sentence(
                    id = "s_sendletter_6",
                    hanzi = "爸爸：那你为什么不拿回来呢？",
                    pinyin = "bà ba nà nǐ wèi shén me bù ná huí lái ne",
                    translation = "Ayah Then (in that case) Kamu Why? Tidak To hold To return; to come back Bagaimana dengan / sedang (partikel modal)",
                    tokens = listOf(
                        WordToken("爸爸", "bà ba", "Ayah", "Anggota keluarga"),
                        WordToken("那", "nà", "Then (in that case)", "Kosakata HSK 2: 那 (nà)"),
                        WordToken("你", "nǐ", "Kamu", "Kata ganti orang kedua tunggal"),
                        WordToken("为什么", "wèi shén me", "Why?", "Kosakata HSK 2: 为什么 (wèi shén me)"),
                        WordToken("不", "bù", "Tidak", "Kata sangkalan untuk masa kini atau masa depan"),
                        WordToken("拿", "ná", "To hold", "Kosakata HSK 2: 拿 (ná)"),
                        WordToken("回来", "huí lái", "To return; to come back", "Kosakata HSK 2: 回来 (huí lái)"),
                        WordToken("呢", "ne", "Bagaimana dengan / sedang (partikel modal)", "Partikel tanya atau penanda sedang berlangsung")
                    )
                ),
                Sentence(
                    id = "s_sendletter_7",
                    hanzi = "女儿：我还以为你不写地址和收信人,是因为不想让我知道你把信寄给谁呢!",
                    pinyin = "nǚ ér wǒ hái yǐ wéi nǐ bù xiě dì zhǐ hé shōu xìn rén shì yīn wèi bù xiǎng ràng wǒ zhī dào nǐ bǎ xìn jì gěi shéi ne",
                    translation = "Anak perempuan Saya Masih / Malahan To think; to believe Kamu Tidak To write Address Dan To receive a letter or mail; addressee Person; people Adalah Karena Tidak Ingin / Berpikir / Rindu To permit Saya Tahu / Mengetahui Kamu (used to put the object before the verb: 把[ba3] + {noun} + {verb}) Letter To entrust; to place in sb&#x27;s care Memberi / Kepada Who Bagaimana dengan / sedang (partikel modal)",
                    tokens = listOf(
                        WordToken("女儿", "nǚ ér", "Anak perempuan", "Keturunan perempuan"),
                        WordToken("我", "wǒ", "Saya", "Kata ganti orang pertama tunggal"),
                        WordToken("还", "hái", "Masih / Malahan", "Menyatakan kelanjutan situasi"),
                        WordToken("以为", "yǐ wéi", "To think; to believe", "Kosakata HSK 2: 以为 (yǐ wéi)"),
                        WordToken("你", "nǐ", "Kamu", "Kata ganti orang kedua tunggal"),
                        WordToken("不", "bù", "Tidak", "Kata sangkalan untuk masa kini atau masa depan"),
                        WordToken("写", "xiě", "To write", "Kosakata HSK 2: 写 (xiě)"),
                        WordToken("地址", "dì zhǐ", "Address", "Kosakata HSK 2: 地址 (dì zhǐ)"),
                        WordToken("和", "hé", "Dan", "Kata hubung setara"),
                        WordToken("收信", "shōu xìn", "To receive a letter or mail; addressee", "Kosakata HSK 2: 收信 (shōu xìn)"),
                        WordToken("人", "rén", "Person; people", "Kosakata HSK 2: 人 (rén)"),
                        WordToken("是", "shì", "Adalah", "Kopula penjelas"),
                        WordToken("因为", "yīn wèi", "Karena", "Menyatakan alasan sebab"),
                        WordToken("不", "bù", "Tidak", "Kata sangkalan untuk masa kini atau masa depan"),
                        WordToken("想", "xiǎng", "Ingin / Berpikir / Rindu", "Keinginan atau pemikiran batin"),
                        WordToken("让", "ràng", "To permit", "Kosakata HSK 2: 让 (ràng)"),
                        WordToken("我", "wǒ", "Saya", "Kata ganti orang pertama tunggal"),
                        WordToken("知道", "zhī dào", "Tahu / Mengetahui", "Memiliki informasi"),
                        WordToken("你", "nǐ", "Kamu", "Kata ganti orang kedua tunggal"),
                        WordToken("把", "bǎ", "(used to put the object before the verb: 把[ba3] + {noun} + {verb})", "Kosakata HSK 2: 把 (bǎ)"),
                        WordToken("信", "xìn", "Letter", "Kosakata HSK 2: 信 (xìn)"),
                        WordToken("寄", "jì", "To entrust; to place in sb&#x27;s care", "Kosakata HSK 2: 寄 (jì)"),
                        WordToken("给", "gěi", "Memberi / Kepada", "Tindakan memberi atau preposisi sasaran"),
                        WordToken("谁", "shéi", "Who", "Kosakata HSK 2: 谁 (shéi)"),
                        WordToken("呢", "ne", "Bagaimana dengan / sedang (partikel modal)", "Partikel tanya atau penanda sedang berlangsung")
                    )
                )
            ),
            questions = listOf(
                StoryQuestion(
                    id = "q_sendletter_1",
                    questionText = "在电子通讯发达的今天，主人公为什么依然选择手写书信？ (Mengapa di era digital masa kini tokoh utama tetap memilih menulis surat tangan?)",
                    options = listOf("手写文字饱含真挚温暖的情感与独特的纪念珍藏价值 (Tulisan tangan memuat ketulusan hangat dan bernilai kenangan abadi)", "因为没有电和网络 (Karena tidak ada sambungan listrik dan internet)", "电脑键盘坏了 (Karena keyboard komputernya rusak)", "邮局强迫必须寄信 (Karena kantor pos mewajibkan orang berkirim surat)"),
                    correctAnswerIndex = 0,
                    explanation = "Goresan pena di atas kertas surat menghadirkan sentuhan personal yang tak tergantikan pesan kilat digital."
                ),
                StoryQuestion(
                    id = "q_sendletter_2",
                    questionText = "寄信之前必须在信封的指定位置贴上什么凭证？ (Kelengkapan apakah yang mutlak ditempelkan pada amplop sebelum surat diposkan?)",
                    options = listOf("符合邮资标准的邮票 (Prangko pos yang sah sesuai tarif pengiriman)", "一张大照片 (Sebuah foto berukuran besar)", "电影票根 (Sobekan tiket bioskop)", "人民币钞票 (Uang kertas tunai)"),
                    correctAnswerIndex = 0,
                    explanation = "Prangko pos adalah bukti pelunasan biaya jasa titipan pos negara."
                ),
                StoryQuestion(
                    id = "q_sendletter_3",
                    questionText = "把贴好邮票的信件投进路边的哪种设施中？ (Fasilitas umum berciri khas apa yang menjadi muara penampungan surat di trotoar jalan?)",
                    options = listOf("绿色标志的公共邮政信筒 (Kotak pos umum berwarna hijau khas jawatan pos)", "分类垃圾桶 (Tong sampah daur ulang)", "花坛泥土里 (Di dalam tanah pot bunga)", "下水道井盖 (Di balik lubang selokan air)"),
                    correctAnswerIndex = 0,
                    explanation = "Kotak pos hijau (yóutǒng) yang dikosongkan petugas pos secara berkala setiap hari kerja."
                ),
                StoryQuestion(
                    id = "q_sendletter_4",
                    questionText = "当远方的老朋友拆阅这封满载牵挂的书信时，心中会激荡起怎样的涟漪？ (Perasaan hangat apa yang bersemi di lubuk hati sang kawan saat membuka lembaran surat itu?)",
                    options = listOf("感受到跨越千里山海而来的深厚情谊与无尽感动 (Merasakan keharuan mendalam atas ketulusan persahabatan yang melintasi jarak)", "非常嫌弃字迹潦草 (Sangat mencela goresan huruf yang dianggap jelek)", "立刻把信撕毁 (Langsung menyobek lembaran surat)", "毫无任何感觉 (Hampa tanpa kesan batin apa pun)"),
                    correctAnswerIndex = 0,
                    explanation = "Sentuhan nostalgia surat menyuratkan ketulusan kasih dan merapatkan jarak persaudaraan."
                )
            )
        )
    )
}
