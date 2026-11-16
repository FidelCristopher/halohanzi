package com.example.chineselearning.data.repository

import com.example.chineselearning.R
import com.example.chineselearning.data.model.Sentence
import com.example.chineselearning.data.model.Story
import com.example.chineselearning.data.model.StoryQuestion
import com.example.chineselearning.data.model.WordToken

val mandarinBeanStoriesPart5: List<Story> by lazy {
    listOf(
        // Cerita Mandarin Bean 74 (HSK 2): It's Hot Today (Hari Ini Sangat Panas)
        Story(
            id = "story_its_hot_today",
            titleHanzi = "今天很热",
            titlePinyin = "Jīntiān Hěn Rè",
            titleTranslation = "It's Hot Today (Hari Ini Sangat Panas)",
            level = "HSK 2",
            category = "Kehidupan Sehari-hari",
            description = "Cuaca hari ini sangat terik, seorang guru bahasa Mandarin kehausan setelah mengajar tiga kelas berturut-turut.",
            coverEmoji = "☀️",
            coverImageRes = R.drawable.cover_story_its_hot_today,
            estimatedReadMinutes = 2,
            sentences = listOf(
                Sentence(
                    id = "s_hotday_1",
                    hanzi = "今天天气很热， 早上中文老师上了三节课， 非常渴。",
                    pinyin = "jīn tiān tiān qì hěn rè zǎo shang Zhōng wén lǎo shī shàng le sān jié kè fēi cháng kě",
                    translation = "Hari ini cuaca sangat panas, pagi hari guru bahasa Mandarin mengajar tiga sesi kelas dan merasa sangat haus.",
                    tokens = listOf(
                        WordToken("今天", "jīn tiān", "Hari ini", "Keterangan waktu sekarang"),
                        WordToken("天气", "tiān qì", "Weather", "Kosakata HSK 2: 天气 (tiān qì)"),
                        WordToken("很", "hěn", "Sangat", "Tingkat derajat"),
                        WordToken("热", "rè", "Panas", "Suhu tinggi"),
                        WordToken("早上", "zǎo shang", "Pagi hari", "Waktu fajar hingga pagi"),
                        WordToken("中文", "Zhōng wén", "Chinese language", "Kosakata HSK 2: 中文 (Zhōng wén)"),
                        WordToken("老师", "lǎo shī", "Guru", "Tenaga pengajar"),
                        WordToken("上", "shàng", "To attend (class or university)", "Kosakata HSK 2: 上 (shàng)"),
                        WordToken("了", "le", "Sudah (partikel perubahan situasi)", "Partikel aspek selesainya tindakan"),
                        WordToken("三", "sān", "Three", "Kosakata HSK 2: 三 (sān)"),
                        WordToken("节", "jié", "Classifier for segments: lessons, train wagons, biblical verses etc", "Kosakata HSK 2: 节 (jié)"),
                        WordToken("课", "kè", "Subject", "Kosakata HSK 2: 课 (kè)"),
                        WordToken("非常", "fēi cháng", "Sangat / Amat", "Tingkat intensitas tinggi"),
                        WordToken("渴", "kě", "Haus", "Kebutuhan akan minum")
                    )
                ),
                Sentence(
                    id = "s_hotday_2",
                    hanzi = "她去超市买了一瓶水， 又回办公室喝了两杯茶， 舒服多了。",
                    pinyin = "tā qù chāo shì mǎi le yī píng shuǐ yòu huí bàn gōng shì hē le liǎng bēi chá shū fu duō le",
                    translation = "Dia pergi ke supermarket membeli sebotol air, lalu kembali ke kantor minum dua cangkir teh, rasanya jauh lebih nyaman dan segar.",
                    tokens = listOf(
                        WordToken("她", "tā", "Dia (perempuan)", "Kata ganti orang ketiga tunggal perempuan"),
                        WordToken("去", "qù", "Pergi", "Berpindah tempat menjauhi pembicara"),
                        WordToken("超市", "chāo shì", "Supermarket", "Toko swalayan besar"),
                        WordToken("买", "mǎi", "Membeli", "Transaksi belanja"),
                        WordToken("了", "le", "Sudah (partikel perubahan situasi)", "Partikel aspek selesainya tindakan"),
                        WordToken("一", "yī", "One", "Kosakata HSK 2: 一 (yī)"),
                        WordToken("瓶", "píng", "Classifier for wine and liquids", "Kosakata HSK 2: 瓶 (píng)"),
                        WordToken("水", "shuǐ", "Air", "Minuman mineral"),
                        WordToken("又", "yòu", "Lagi (telah terjadi)", "Pengulangan tindakan lampau"),
                        WordToken("回", "huí", "Kembali / Pulang", "Menuju ke tempat asal"),
                        WordToken("办公室", "bàn gōng shì", "Kantor", "Ruang kerja profesional"),
                        WordToken("喝", "hē", "Minum", "Aktivitas mengonsumsi cairan"),
                        WordToken("了", "le", "Sudah (partikel perubahan situasi)", "Partikel aspek selesainya tindakan"),
                        WordToken("两", "liǎng", "Two", "Kosakata HSK 2: 两 (liǎng)"),
                        WordToken("杯", "bēi", "Classifier for certain containers of liquids", "Kosakata HSK 2: 杯 (bēi)"),
                        WordToken("茶", "chá", "Teh", "Minuman seduhan teh"),
                        WordToken("舒服", "shū fu", "Nyaman / Enak badan", "Kondisi badan atau tempat menyenangkan"),
                        WordToken("多", "duō", "Banyak", "Jumlah besar"),
                        WordToken("了", "le", "Sudah (partikel perubahan situasi)", "Partikel aspek selesainya tindakan")
                    )
                )
            ),
            questions = listOf(
                StoryQuestion(
                    id = "q_hotday_1",
                    questionText = "今天的天气怎么样？ (Bagaimana cuaca hari ini?)",
                    options = listOf("很冷 (Sangat dingin)", "很热 (Sangat panas)", "下大雨 (Hujan deras)", "刮大风 (Angin kencang)"),
                    correctAnswerIndex = 1,
                    explanation = "Teks menyatakan '今天天气很热' (Hari ini cuacanya sangat panas)."
                ),
                StoryQuestion(
                    id = "q_hotday_2",
                    questionText = "中文老师早上上了几节课？ (Berapa sesi kelas yang diajar guru Mandarin di pagi hari?)",
                    options = listOf("一节 (1 sesi)", "两节 (2 sesi)", "三节 (3 sesi)", "四节 (4 sesi)"),
                    correctAnswerIndex = 2,
                    explanation = "Teks menyebutkan '早上中文老师上了三节课' (Pagi hari guru Mandarin mengajar 3 sesi kelas)."
                ),
                StoryQuestion(
                    id = "q_hotday_3",
                    questionText = "老师去超市买了什么？ (Apa yang dibeli guru di supermarket?)",
                    options = listOf("一瓶水 (Sebotol air)", "两杯茶 (Dua cangkir teh)", "一个苹果 (Sebuah apel)", "一本书 (Sebuah buku)"),
                    correctAnswerIndex = 0,
                    explanation = "Teks menyatakan '她去超市买了一瓶水' (Dia pergi ke supermarket membeli sebotol air)."
                ),
                StoryQuestion(
                    id = "q_hotday_4",
                    questionText = "老师喝完茶后感觉怎么样？ (Bagaimana perasaan guru setelah minum teh?)",
                    options = listOf("更渴了 (Makin haus)", "想睡觉 (Ingin tidur)", "舒服多了 (Jauh lebih nyaman)", "头疼 (Sakit kepala)"),
                    correctAnswerIndex = 2,
                    explanation = "Teks menyatakan '舒服多了' (Merasa jauh lebih nyaman dan segar)."
                )
            )
        ),
        // Cerita Mandarin Bean 75 (HSK 2): What to Eat Today? (Makan Apa Hari Ini?)
        Story(
            id = "story_what_to_eat_today",
            titleHanzi = "今天吃什么？",
            titlePinyin = "Jīntiān Chī Shénme?",
            titleTranslation = "What to Eat Today? (Makan Apa Hari Ini?)",
            level = "HSK 2",
            category = "Makanan & Kebiasaan",
            description = "Percakapan antara anak dan ibu mengenai pilihan makanan untuk sarapan dan makan siang yang sehat.",
            coverEmoji = "🍜",
            coverImageRes = R.drawable.cover_story_what_to_eat_today,
            estimatedReadMinutes = 2,
            sentences = listOf(
                Sentence(
                    id = "s_eattoday_1",
                    hanzi = "今天早上我说：妈妈，早餐我想吃面包、汉堡和可乐。",
                    pinyin = "jīn tiān zǎo shang wǒ shuō mā ma zǎo cān wǒ xiǎng chī miàn bāo hàn bǎo hé kě lè",
                    translation = "Pagi ini saya berkata: Ibu, untuk sarapan saya ingin makan roti, hamburger, dan kola.",
                    tokens = listOf(
                        WordToken("今天", "jīn tiān", "Hari ini", "Keterangan waktu sekarang"),
                        WordToken("早上", "zǎo shang", "Pagi hari", "Waktu fajar hingga pagi"),
                        WordToken("我", "wǒ", "Saya", "Kata ganti orang pertama tunggal"),
                        WordToken("说", "shuō", "Berbicara / Berkata", "Menyampaikan ucapan"),
                        WordToken("妈妈", "mā ma", "Ibu", "Anggota keluarga"),
                        WordToken("早餐", "zǎo cān", "Breakfast", "Kosakata HSK 2: 早餐 (zǎo cān)"),
                        WordToken("我", "wǒ", "Saya", "Kata ganti orang pertama tunggal"),
                        WordToken("想", "xiǎng", "Ingin / Berpikir / Rindu", "Keinginan atau pemikiran batin"),
                        WordToken("吃", "chī", "Makan", "Aktivitas mengonsumsi makanan"),
                        WordToken("面包", "miàn bāo", "Roti", "Makanan olahan tepung"),
                        WordToken("汉堡", "hàn bǎo", "Hamburger", "Makanan cepat saji"),
                        WordToken("和", "hé", "Dan", "Kata hubung setara"),
                        WordToken("可乐", "kě lè", "Kola", "Minuman bersoda")
                    )
                ),
                Sentence(
                    id = "s_eattoday_2",
                    hanzi = "妈妈说：不行，你只能吃面包、鸡蛋和热牛奶。",
                    pinyin = "mā ma shuō bù xíng nǐ zhǐ néng chī miàn bāo jī dàn hé rè niú nǎi",
                    translation = "Ibu berkata: Tidak boleh, kamu hanya boleh makan roti, telur, dan susu hangat.",
                    tokens = listOf(
                        WordToken("妈妈", "mā ma", "Ibu", "Anggota keluarga"),
                        WordToken("说", "shuō", "Berbicara / Berkata", "Menyampaikan ucapan"),
                        WordToken("不行", "bù xíng", "Won&#x27;t do", "Kosakata HSK 2: 不行 (bù xíng)"),
                        WordToken("你", "nǐ", "Kamu", "Kata ganti orang kedua tunggal"),
                        WordToken("只", "zhǐ", "Only; merely; just", "Kosakata HSK 2: 只 (zhǐ)"),
                        WordToken("能", "néng", "Bisa / Mampu / Boleh", "Kata bantu kemampuan atau izin"),
                        WordToken("吃", "chī", "Makan", "Aktivitas mengonsumsi makanan"),
                        WordToken("面包", "miàn bāo", "Roti", "Makanan olahan tepung"),
                        WordToken("鸡蛋", "jī dàn", "Telur ayam", "Bahan makanan kaya protein"),
                        WordToken("和", "hé", "Dan", "Kata hubung setara"),
                        WordToken("热", "rè", "Panas", "Suhu tinggi"),
                        WordToken("牛奶", "niú nǎi", "Susu", "Minuman bergizi")
                    )
                ),
                Sentence(
                    id = "s_eattoday_3",
                    hanzi = "我说：中午能吃汉堡和可乐吗？",
                    pinyin = "wǒ shuō zhōng wǔ néng chī hàn bǎo hé kě lè ma",
                    translation = "Saya bertanya: Siang hari apakah boleh makan hamburger dan kola?",
                    tokens = listOf(
                        WordToken("我", "wǒ", "Saya", "Kata ganti orang pertama tunggal"),
                        WordToken("说", "shuō", "Berbicara / Berkata", "Menyampaikan ucapan"),
                        WordToken("中午", "zhōng wǔ", "Siang hari", "Waktu tengah hari"),
                        WordToken("能", "néng", "Bisa / Mampu / Boleh", "Kata bantu kemampuan atau izin"),
                        WordToken("吃", "chī", "Makan", "Aktivitas mengonsumsi makanan"),
                        WordToken("汉堡", "hàn bǎo", "Hamburger", "Makanan cepat saji"),
                        WordToken("和", "hé", "Dan", "Kata hubung setara"),
                        WordToken("可乐", "kě lè", "Kola", "Minuman bersoda"),
                        WordToken("吗", "ma", "Apakah (partikel tanya)", "Partikel di akhir kalimat interogatif ya/tidak")
                    )
                ),
                Sentence(
                    id = "s_eattoday_4",
                    hanzi = "妈妈说：中午可以吃汉堡，不可以喝可乐。",
                    pinyin = "mā ma shuō zhōng wǔ kě yǐ chī hàn bǎo bù kě yǐ hē kě lè",
                    translation = "Ibu berkata: Siang hari boleh makan hamburger, tidak boleh minum kola.",
                    tokens = listOf(
                        WordToken("妈妈", "mā ma", "Ibu", "Anggota keluarga"),
                        WordToken("说", "shuō", "Berbicara / Berkata", "Menyampaikan ucapan"),
                        WordToken("中午", "zhōng wǔ", "Siang hari", "Waktu tengah hari"),
                        WordToken("可以", "kě yǐ", "Boleh / Dapat", "Menyatakan izin atau kemungkinan"),
                        WordToken("吃", "chī", "Makan", "Aktivitas mengonsumsi makanan"),
                        WordToken("汉堡", "hàn bǎo", "Hamburger", "Makanan cepat saji"),
                        WordToken("不", "bù", "Tidak", "Kata sangkalan untuk masa kini atau masa depan"),
                        WordToken("可以", "kě yǐ", "Boleh / Dapat", "Menyatakan izin atau kemungkinan"),
                        WordToken("喝", "hē", "Minum", "Aktivitas mengonsumsi cairan"),
                        WordToken("可乐", "kě lè", "Kola", "Minuman bersoda")
                    )
                ),
                Sentence(
                    id = "s_eattoday_5",
                    hanzi = "我说：好吧。",
                    pinyin = "wǒ shuō hǎo ba",
                    translation = "Saya berkata: Baiklah.",
                    tokens = listOf(
                        WordToken("我", "wǒ", "Saya", "Kata ganti orang pertama tunggal"),
                        WordToken("说", "shuō", "Berbicara / Berkata", "Menyampaikan ucapan"),
                        WordToken("好", "hǎo", "Bagus / Baik", "Kualitas positif"),
                        WordToken("吧", "ba", "Kan / Mari (partikel saran)", "Partikel saran, ajakan, atau dugaan")
                    )
                )
            ),
            questions = listOf(
                StoryQuestion(
                    id = "q_eattoday_1",
                    questionText = "今天早上孩子想吃什么？ (Apa yang ingin dimakan anak pagi ini?)",
                    options = listOf("米饭和鱼 (Nasi dan ikan)", "面包、汉堡和可乐 (Roti, burger, dan kola)", "苹果和香蕉 (Apel dan pisang)", "面条和茶 (Mie dan teh)"),
                    correctAnswerIndex = 1,
                    explanation = "Teks menyatakan anak berkata '早餐我想吃面包、汉堡和可乐'."
                ),
                StoryQuestion(
                    id = "q_eattoday_2",
                    questionText = "妈妈允许孩子早餐吃什么？ (Apa yang diizinkan ibu untuk sarapan?)",
                    options = listOf("面包、鸡蛋和热牛奶 (Roti, telur, dan susu hangat)", "汉堡和冷水 (Burger dan air dingin)", "冰淇淋和蛋糕 (Es krim dan kue)", "只能喝水 (Hanya boleh minum air)"),
                    correctAnswerIndex = 0,
                    explanation = "Ibu menjawab: '你只能吃面包、鸡蛋和热牛奶'."
                ),
                StoryQuestion(
                    id = "q_eattoday_3",
                    questionText = "中午妈妈做了什么饭？ (Apa yang dimasak ibu untuk makan siang?)",
                    options = listOf("西瓜和苹果 (Semangka dan apel)", "米饭、蔬菜和肉 (Nasi, sayuran, dan daging)", "汉堡包 (Hamburger)", "面包 (Roti)"),
                    correctAnswerIndex = 1,
                    explanation = "Teks menyebutkan makan siang berupa '米饭、蔬菜和肉'."
                ),
                StoryQuestion(
                    id = "q_eattoday_4",
                    questionText = "这篇故事说明了什么？ (Pesan apa yang disampaikan dalam cerita ini?)",
                    options = listOf("汉堡比米饭好 (Burger lebih baik dari nasi)", "妈妈希望孩子吃得健康 (Ibu ingin anaknya makan makanan sehat)", "孩子不喜欢吃肉 (Anak tidak suka makan daging)", "不应该吃早餐 (Tidak seharusnya sarapan)"),
                    correctAnswerIndex = 1,
                    explanation = "Ibu melarang minuman bersoda dan makanan cepat saji demi kesehatan gizi anak."
                )
            )
        ),
        // Cerita Mandarin Bean 76 (HSK 2): Today is My Birthday (Hari Ini Adalah Hari Ulang Tahunku)
        Story(
            id = "story_today_is_my_birthday",
            titleHanzi = "今天是我的生日",
            titlePinyin = "Jīntiān Shì Wǒ de Shēngrì",
            titleTranslation = "Today is My Birthday (Hari Ini Adalah Hari Ulang Tahunku)",
            level = "HSK 2",
            category = "Keluarga & Perayaan",
            description = "Perayaan ulang tahun yang hangat dengan hadiah sepatu impian dan bingkisan manis dari teman-teman.",
            coverEmoji = "🎂",
            coverImageRes = R.drawable.cover_story_today_is_my_birthday,
            estimatedReadMinutes = 2,
            sentences = listOf(
                Sentence(
                    id = "s_mybday2_1",
                    hanzi = "今天是我的生日。",
                    pinyin = "jīn tiān shì wǒ de shēng rì",
                    translation = "Hari ini adalah hari ulang tahun saya.",
                    tokens = listOf(
                        WordToken("今天", "jīn tiān", "Hari ini", "Keterangan waktu sekarang"),
                        WordToken("是", "shì", "Adalah", "Kopula penjelas"),
                        WordToken("我的", "wǒ de", "My; mine", "Kosakata HSK 2: 我的 (wǒ de)"),
                        WordToken("生日", "shēng rì", "Hari ulang tahun", "Hari kelahiran")
                    )
                ),
                Sentence(
                    id = "s_mybday2_2",
                    hanzi = "我送给自己的礼物是一双鞋，那双鞋有点儿贵，但是我喜欢很久了。",
                    pinyin = "wǒ sòng gěi zì jǐ de lǐ wù shì yī shuāng xié nà shuāng xié yǒu diǎn r guì dàn shì wǒ xǐ huan hěn jiǔ le",
                    translation = "Kado yang saya berikan untuk diri sendiri adalah sepasang sepatu, sepatu itu agak mahal, tetapi saya sudah menyukainya sejak lama.",
                    tokens = listOf(
                        WordToken("我", "wǒ", "Saya", "Kata ganti orang pertama tunggal"),
                        WordToken("送", "sòng", "Menghadiahkan / Mengantar", "Memberikan bingkisan atau mengantar"),
                        WordToken("给", "gěi", "Memberi / Kepada", "Tindakan memberi atau preposisi sasaran"),
                        WordToken("自己", "zì jǐ", "Oneself; (attributive) one&#x27;s own", "Kosakata HSK 2: 自己 (zì jǐ)"),
                        WordToken("的", "de", "Punya / Yang (partikel posesif)", "Partikel penjelas modifikasi atau kepemilikan"),
                        WordToken("礼物", "lǐ wù", "Gift; present", "Kosakata HSK 2: 礼物 (lǐ wù)"),
                        WordToken("是", "shì", "Adalah", "Kopula penjelas"),
                        WordToken("一", "yī", "One", "Kosakata HSK 2: 一 (yī)"),
                        WordToken("双", "shuāng", "Pair", "Kosakata HSK 2: 双 (shuāng)"),
                        WordToken("鞋", "xié", "Shoe", "Kosakata HSK 2: 鞋 (xié)"),
                        WordToken("那", "nà", "(specifier) that; the; those", "Kosakata HSK 2: 那 (nà)"),
                        WordToken("双", "shuāng", "Pair", "Kosakata HSK 2: 双 (shuāng)"),
                        WordToken("鞋", "xié", "Shoe", "Kosakata HSK 2: 鞋 (xié)"),
                        WordToken("有点儿", "yǒu diǎn r", "Slightly", "Kosakata HSK 2: 有点儿 (yǒu diǎn r)"),
                        WordToken("贵", "guì", "Mahal", "Harga tinggi"),
                        WordToken("但是", "dàn shì", "Tetapi / Namun", "Kata hubung pertentangan"),
                        WordToken("我", "wǒ", "Saya", "Kata ganti orang pertama tunggal"),
                        WordToken("喜欢", "xǐ huan", "Menyukai / Gemar", "Perasaan suka"),
                        WordToken("很", "hěn", "Sangat", "Tingkat derajat"),
                        WordToken("久", "jiǔ", "(of a period of time) long", "Kosakata HSK 2: 久 (jiǔ)"),
                        WordToken("了", "le", "Sudah (partikel perubahan situasi)", "Partikel aspek selesainya tindakan")
                    )
                ),
                Sentence(
                    id = "s_mybday2_3",
                    hanzi = "朋友们送给我一束花、一瓶香水、一个大蛋糕，这些东西我都很喜欢。",
                    pinyin = "péng you men sòng gěi wǒ yī shù huā yī píng xiāng shuǐ yī gè dà dàn gāo zhè xiē dōng xi wǒ dōu hěn xǐ huan",
                    translation = "Teman-teman menghadiahkan saya sebuket bunga, sebotol parfum, dan sebuah kue tart besar, barang-barang ini semuanya sangat saya sukai.",
                    tokens = listOf(
                        WordToken("朋友", "péng you", "Teman / Sahabat", "Orang dekat"),
                        WordToken("们", "men", "Plural marker for pronouns, and nouns referring to individuals", "Kosakata HSK 2: 们 (men)"),
                        WordToken("送", "sòng", "Menghadiahkan / Mengantar", "Memberikan bingkisan atau mengantar"),
                        WordToken("给", "gěi", "Memberi / Kepada", "Tindakan memberi atau preposisi sasaran"),
                        WordToken("我", "wǒ", "Saya", "Kata ganti orang pertama tunggal"),
                        WordToken("一", "yī", "One", "Kosakata HSK 2: 一 (yī)"),
                        WordToken("束", "shù", "Classifier for bunches, bundles, beams of light etc", "Kosakata HSK 2: 束 (shù)"),
                        WordToken("花", "huā", "Flower", "Kosakata HSK 2: 花 (huā)"),
                        WordToken("一", "yī", "One", "Kosakata HSK 2: 一 (yī)"),
                        WordToken("瓶", "píng", "Classifier for wine and liquids", "Kosakata HSK 2: 瓶 (píng)"),
                        WordToken("香水", "xiāng shuǐ", "Perfume", "Kosakata HSK 2: 香水 (xiāng shuǐ)"),
                        WordToken("一", "yī", "One", "Kosakata HSK 2: 一 (yī)"),
                        WordToken("个", "gè", "Classifier for people or objects in general", "Kosakata HSK 2: 个 (gè)"),
                        WordToken("大", "dà", "Besar", "Ukuran fisik besar"),
                        WordToken("蛋糕", "dàn gāo", "Kue tart / Cake", "Makanan manis perayaan"),
                        WordToken("这些", "zhè xiē", "These", "Kosakata HSK 2: 这些 (zhè xiē)"),
                        WordToken("东西", "dōng xi", "Thing", "Kosakata HSK 2: 东西 (dōng xi)"),
                        WordToken("我", "wǒ", "Saya", "Kata ganti orang pertama tunggal"),
                        WordToken("都", "dōu", "Semua / Seluruhnya", "Menyatakan keuniversalan subjek"),
                        WordToken("很", "hěn", "Sangat", "Tingkat derajat"),
                        WordToken("喜欢", "xǐ huan", "Menyukai / Gemar", "Perasaan suka")
                    )
                ),
                Sentence(
                    id = "s_mybday2_4",
                    hanzi = "我的爸爸妈妈给我发了一个红包，里面有八百块钱。",
                    pinyin = "wǒ de bà ba mā ma gěi wǒ fā le yī gè hóng bāo lǐ miàn yǒu bā bǎi kuài qián",
                    translation = "Ayah dan ibu saya mengirimi saya sebuah angpao, di dalamnya ada uang delapan ratus yuan.",
                    tokens = listOf(
                        WordToken("我的", "wǒ de", "My; mine", "Kosakata HSK 2: 我的 (wǒ de)"),
                        WordToken("爸爸", "bà ba", "Ayah", "Anggota keluarga"),
                        WordToken("妈妈", "mā ma", "Ibu", "Anggota keluarga"),
                        WordToken("给", "gěi", "Memberi / Kepada", "Tindakan memberi atau preposisi sasaran"),
                        WordToken("我", "wǒ", "Saya", "Kata ganti orang pertama tunggal"),
                        WordToken("发", "fā", "To send out", "Kosakata HSK 2: 发 (fā)"),
                        WordToken("了", "le", "Sudah (partikel perubahan situasi)", "Partikel aspek selesainya tindakan"),
                        WordToken("一", "yī", "One", "Kosakata HSK 2: 一 (yī)"),
                        WordToken("个", "gè", "Classifier for people or objects in general", "Kosakata HSK 2: 个 (gè)"),
                        WordToken("红包", "hóng bāo", "Money wrapped in red as a gift", "Kosakata HSK 2: 红包 (hóng bāo)"),
                        WordToken("里面", "lǐ miàn", "Inside", "Kosakata HSK 2: 里面 (lǐ miàn)"),
                        WordToken("有", "yǒu", "Mempunyai / Ada", "Menyatakan kepemilikan atau eksistensi"),
                        WordToken("八", "bā", "Eight", "Kosakata HSK 2: 八 (bā)"),
                        WordToken("百", "bǎi", "Hundred", "Kosakata HSK 2: 百 (bǎi)"),
                        WordToken("块", "kuài", "Classifier for pieces of cloth, cake, soap etc", "Kosakata HSK 2: 块 (kuài)"),
                        WordToken("钱", "qián", "Coin", "Kosakata HSK 2: 钱 (qián)")
                    )
                ),
                Sentence(
                    id = "s_mybday2_5",
                    hanzi = "我想用这些钱请朋友们吃饭，然后去唱歌。",
                    pinyin = "wǒ xiǎng yòng zhè xiē qián qǐng péng you men chī fàn rán hòu qù chàng gē",
                    translation = "Saya ingin menggunakan uang ini untuk mentraktir teman-teman makan, lalu pergi berkaraoke bersama.",
                    tokens = listOf(
                        WordToken("我", "wǒ", "Saya", "Kata ganti orang pertama tunggal"),
                        WordToken("想", "xiǎng", "Ingin / Berpikir / Rindu", "Keinginan atau pemikiran batin"),
                        WordToken("用", "yòng", "To use; to make use of; to employ", "Kosakata HSK 2: 用 (yòng)"),
                        WordToken("这些", "zhè xiē", "These", "Kosakata HSK 2: 这些 (zhè xiē)"),
                        WordToken("钱", "qián", "Coin", "Kosakata HSK 2: 钱 (qián)"),
                        WordToken("请", "qǐng", "Silakan / Mengundang", "Bentuk kesopanan"),
                        WordToken("朋友", "péng you", "Teman / Sahabat", "Orang dekat"),
                        WordToken("们", "men", "Plural marker for pronouns, and nouns referring to individuals", "Kosakata HSK 2: 们 (men)"),
                        WordToken("吃饭", "chī fàn", "To have a meal", "Kosakata HSK 2: 吃饭 (chī fàn)"),
                        WordToken("然后", "rán hòu", "Then; after that; afterwards", "Kosakata HSK 2: 然后 (rán hòu)"),
                        WordToken("去", "qù", "Pergi", "Berpindah tempat menjauhi pembicara"),
                        WordToken("唱歌", "chàng gē", "To sing a song", "Kosakata HSK 2: 唱歌 (chàng gē)")
                    )
                ),
                Sentence(
                    id = "s_mybday2_6",
                    hanzi = "这就是我的生日。",
                    pinyin = "zhè jiù shì wǒ de shēng rì",
                    translation = "Inilah hari ulang tahun saya.",
                    tokens = listOf(
                        WordToken("这", "zhè", "This; these", "Kosakata HSK 2: 这 (zhè)"),
                        WordToken("就", "jiù", "Langsung / Segera / Maka", "Menyatakan ketepatan waktu atau kelogisan"),
                        WordToken("是", "shì", "Adalah", "Kopula penjelas"),
                        WordToken("我的", "wǒ de", "My; mine", "Kosakata HSK 2: 我的 (wǒ de)"),
                        WordToken("生日", "shēng rì", "Hari ulang tahun", "Hari kelahiran")
                    )
                )
            ),
            questions = listOf(
                StoryQuestion(
                    id = "q_mybday2_1",
                    questionText = "我送给自己什么生日礼物？ (Hadiah ulang tahun apa yang saya belikan untuk diri sendiri?)",
                    options = listOf("一束花 (Sebuket bunga)", "一双鞋 (Sepasang sepatu)", "一个蛋糕 (Sebuah kue)", "一瓶香水 (Sebotol parfum)"),
                    correctAnswerIndex = 1,
                    explanation = "Teks menyatakan '我送给自己的礼物是一双鞋'."
                ),
                StoryQuestion(
                    id = "q_mybday2_2",
                    questionText = "那双鞋怎么样？ (Bagaimana dengan sepatu tersebut?)",
                    options = listOf("很便宜 (Sangat murah)", "有点儿贵，但是喜欢很久了 (Agak mahal tapi sudah lama disukai)", "颜色不好看 (Warnanya tidak bagus)", "太小了 (Terlalu kecil)"),
                    correctAnswerIndex = 1,
                    explanation = "Teks menyatakan '那双鞋有点儿贵，但是我喜欢很久了'."
                ),
                StoryQuestion(
                    id = "q_mybday2_3",
                    questionText = "朋友们送了什么礼物？ (Apa yang dihadiahkan oleh teman-teman?)",
                    options = listOf("花、香水和大蛋糕 (Bunga, parfum, dan kue tart besar)", "新电脑 (Komputer baru)", "自行车 (Sepeda)", "手机 (Ponsel)"),
                    correctAnswerIndex = 0,
                    explanation = "Teman-teman menghadiahkan '一束花、一瓶香水、一个大蛋糕'."
                ),
                StoryQuestion(
                    id = "q_mybday2_4",
                    questionText = "今天我的心情怎么样？ (Bagaimana perasaan saya hari ini?)",
                    options = listOf("非常难过 (Sangat sedih)", "特别高兴 (Sangat bahagia dan senang)", "有点累 (Agak capek)", "很生气 (Sangat marah)"),
                    correctAnswerIndex = 1,
                    explanation = "Mendapat hadiah impian dan berkumpul bersama sahabat membuat hari ulang tahun sangat bahagia."
                )
            )
        ),
        // Cerita Mandarin Bean 77 (HSK 2): Lily Learns Chinese (Lily Belajar Bahasa Mandarin)
        Story(
            id = "story_lily_learns_chinese",
            titleHanzi = "莉莉学中文",
            titlePinyin = "Lìli Xué Zhōngwén",
            titleTranslation = "Lily Learns Chinese (Lily Belajar Bahasa Mandarin)",
            level = "HSK 2",
            category = "Pendidikan & Belajar",
            description = "Pengalaman Lily dari Prancis belajar bahasa Mandarin bersama guru pria dan guru wanita asal Tiongkok.",
            coverEmoji = "📚",
            coverImageRes = R.drawable.cover_story_lily_learns_chinese,
            estimatedReadMinutes = 2,
            sentences = listOf(
                Sentence(
                    id = "s_lilychn_1",
                    hanzi = "Lily是一个法国人，李丽是她的中文名字。",
                    pinyin = "shì yī gè Fǎ guó rén Lǐ Lì shì tā de Zhōng wén míng zi",
                    translation = "Lily adalah orang Prancis, Li Li adalah nama Tionghoanya.",
                    tokens = listOf(
                        WordToken("是", "shì", "Adalah", "Kopula penjelas"),
                        WordToken("一", "yī", "One", "Kosakata HSK 2: 一 (yī)"),
                        WordToken("个", "gè", "Classifier for people or objects in general", "Kosakata HSK 2: 个 (gè)"),
                        WordToken("法国", "Fǎ guó", "Prancis", "Negara Prancis"),
                        WordToken("人", "rén", "Person; people", "Kosakata HSK 2: 人 (rén)"),
                        WordToken("李丽", "Lǐ Lì", "A chinese personal name, li li", "Kosakata HSK 2: 李丽 (Lǐ Lì)"),
                        WordToken("是", "shì", "Adalah", "Kopula penjelas"),
                        WordToken("她的", "tā de", "Her; hers", "Kosakata HSK 2: 她的 (tā de)"),
                        WordToken("中文", "Zhōng wén", "Chinese language", "Kosakata HSK 2: 中文 (Zhōng wén)"),
                        WordToken("名字", "míng zi", "Name (of a person or thing)", "Kosakata HSK 2: 名字 (míng zi)")
                    )
                ),
                Sentence(
                    id = "s_lilychn_2",
                    hanzi = "她在法国学习中文。",
                    pinyin = "tā zài Fǎ guó xué xí Zhōng wén",
                    translation = "Dia belajar bahasa Mandarin di Prancis.",
                    tokens = listOf(
                        WordToken("她", "tā", "Dia (perempuan)", "Kata ganti orang ketiga tunggal perempuan"),
                        WordToken("在", "zài", "Di / Berada di", "Preposisi lokasi atau aspek progresif"),
                        WordToken("法国", "Fǎ guó", "Prancis", "Negara Prancis"),
                        WordToken("学习", "xué xí", "Belajar / Studi", "Proses menuntut ilmu"),
                        WordToken("中文", "Zhōng wén", "Chinese language", "Kosakata HSK 2: 中文 (Zhōng wén)")
                    )
                ),
                Sentence(
                    id = "s_lilychn_3",
                    hanzi = "她有两个来自中国的中文老师，一个是男老师，一个是女老师。",
                    pinyin = "tā yǒu liǎng gè lái zì Zhōng guó de Zhōng wén lǎo shī yī gè shì nán lǎo shī yī gè shì nǚ lǎo shī",
                    translation = "Dia memiliki dua orang guru bahasa Mandarin asal Tiongkok, satu guru pria dan satu guru wanita.",
                    tokens = listOf(
                        WordToken("她", "tā", "Dia (perempuan)", "Kata ganti orang ketiga tunggal perempuan"),
                        WordToken("有", "yǒu", "Mempunyai / Ada", "Menyatakan kepemilikan atau eksistensi"),
                        WordToken("两", "liǎng", "Two", "Kosakata HSK 2: 两 (liǎng)"),
                        WordToken("个", "gè", "Classifier for people or objects in general", "Kosakata HSK 2: 个 (gè)"),
                        WordToken("来自", "lái zì", "To come from (a place)", "Kosakata HSK 2: 来自 (lái zì)"),
                        WordToken("中国", "Zhōng guó", "China / Tiongkok", "Negara Tiongkok"),
                        WordToken("的", "de", "Punya / Yang (partikel posesif)", "Partikel penjelas modifikasi atau kepemilikan"),
                        WordToken("中文", "Zhōng wén", "Chinese language", "Kosakata HSK 2: 中文 (Zhōng wén)"),
                        WordToken("老师", "lǎo shī", "Guru", "Tenaga pengajar"),
                        WordToken("一", "yī", "One", "Kosakata HSK 2: 一 (yī)"),
                        WordToken("个", "gè", "Classifier for people or objects in general", "Kosakata HSK 2: 个 (gè)"),
                        WordToken("是", "shì", "Adalah", "Kopula penjelas"),
                        WordToken("男", "nán", "(bound form) male", "Kosakata HSK 2: 男 (nán)"),
                        WordToken("老师", "lǎo shī", "Guru", "Tenaga pengajar"),
                        WordToken("一", "yī", "One", "Kosakata HSK 2: 一 (yī)"),
                        WordToken("个", "gè", "Classifier for people or objects in general", "Kosakata HSK 2: 个 (gè)"),
                        WordToken("是", "shì", "Adalah", "Kopula penjelas"),
                        WordToken("女", "nǚ", "Female", "Kosakata HSK 2: 女 (nǚ)"),
                        WordToken("老师", "lǎo shī", "Guru", "Tenaga pengajar")
                    )
                ),
                Sentence(
                    id = "s_lilychn_4",
                    hanzi = "他们一起上课，一起说汉语，也一起喝咖啡、看电影，变成了很好的朋友。",
                    pinyin = "tā men yī qǐ shàng kè yī qǐ shuō Hàn yǔ yě yī qǐ hē kā fēi kàn diàn yǐng biàn chéng le hěn hǎo de péng you",
                    translation = "Mereka belajar bersama di kelas, berbicara bahasa Mandarin bersama, dan juga minum kopi serta menonton film bersama, menjadi sahabat yang sangat baik.",
                    tokens = listOf(
                        WordToken("他们", "tā men", "Mereka", "Kata ganti orang ketiga jamak"),
                        WordToken("一起", "yī qǐ", "Together; in company (with)", "Kosakata HSK 2: 一起 (yī qǐ)"),
                        WordToken("上课", "shàng kè", "To go to class", "Kosakata HSK 2: 上课 (shàng kè)"),
                        WordToken("一起", "yī qǐ", "Together; in company (with)", "Kosakata HSK 2: 一起 (yī qǐ)"),
                        WordToken("说", "shuō", "Berbicara / Berkata", "Menyampaikan ucapan"),
                        WordToken("汉语", "Hàn yǔ", "Chinese language", "Kosakata HSK 2: 汉语 (Hàn yǔ)"),
                        WordToken("也", "yě", "Juga / Pun", "Partikel penanda kesamaan"),
                        WordToken("一起", "yī qǐ", "Together; in company (with)", "Kosakata HSK 2: 一起 (yī qǐ)"),
                        WordToken("喝", "hē", "Minum", "Aktivitas mengonsumsi cairan"),
                        WordToken("咖啡", "kā fēi", "Kopi", "Minuman berkafein"),
                        WordToken("看", "kàn", "Melihat / Membaca", "Aktivitas visual"),
                        WordToken("电影", "diàn yǐng", "Movie; film", "Kosakata HSK 2: 电影 (diàn yǐng)"),
                        WordToken("变成", "biàn chéng", "To change into", "Kosakata HSK 2: 变成 (biàn chéng)"),
                        WordToken("了", "le", "Sudah (partikel perubahan situasi)", "Partikel aspek selesainya tindakan"),
                        WordToken("很", "hěn", "Sangat", "Tingkat derajat"),
                        WordToken("好", "hǎo", "Bagus / Baik", "Kualitas positif"),
                        WordToken("的", "de", "Punya / Yang (partikel posesif)", "Partikel penjelas modifikasi atau kepemilikan"),
                        WordToken("朋友", "péng you", "Teman / Sahabat", "Orang dekat")
                    )
                )
            ),
            questions = listOf(
                StoryQuestion(
                    id = "q_lilychn_1",
                    questionText = "Lily是哪国人？ (Lily berasal dari negara mana?)",
                    options = listOf("中国人 (Orang Tiongkok)", "法国人 (Orang Prancis)", "美国人 (Orang Amerika)", "英国人 (Orang Inggris)"),
                    correctAnswerIndex = 1,
                    explanation = "Teks menyatakan 'Lily是一个法国人'."
                ),
                StoryQuestion(
                    id = "q_lilychn_2",
                    questionText = "Lily有几个中文老师？ (Berapa banyak guru Mandarin yang dimiliki Lily?)",
                    options = listOf("一个 (1 orang)", "两个 (2 orang)", "三个 (3 orang)", "四个 (4 orang)"),
                    correctAnswerIndex = 1,
                    explanation = "Teks menyatakan '她有两个来自中国的中文老师，一个是男老师，一个是女老师'."
                ),
                StoryQuestion(
                    id = "q_lilychn_3",
                    questionText = "Lily觉得学习汉字怎么样？ (Bagaimana pendapat Lily tentang belajar karakter Hanzi?)",
                    options = listOf("汉字很有意思，但是有点儿难 (Hanzi sangat menarik tapi agak sulit)", "非常容易 (Sangat gampang)", "一点儿也不喜欢 (Sama sekali tidak suka)", "太无聊了 (Sangat membosankan)"),
                    correctAnswerIndex = 0,
                    explanation = "Lily merasa karakter Hanzi sangat memikat meski membutuhkan ketekunan untuk mengingatnya."
                ),
                StoryQuestion(
                    id = "q_lilychn_4",
                    questionText = "Lily希望将来做什么？ (Apa harapan Lily di masa depan?)",
                    options = listOf("去中国旅游和工作 (Pergi ke Tiongkok untuk berwisata dan bekerja)", "当法国菜厨师 (Menjadi koki masakan Prancis)", "学习英语 (Belajar bahasa Inggris)", "住在美国 (Tinggal di Amerika)"),
                    correctAnswerIndex = 0,
                    explanation = "Tujuan Lily belajar giat adalah ingin mengunjungi Tiongkok dan berkarir di sana."
                )
            )
        ),
        // Cerita Mandarin Bean 78 (HSK 2): Do You Know? (Tahukah Kamu?)
        Story(
            id = "story_do_you_know",
            titleHanzi = "你知道吗？",
            titlePinyin = "Nǐ Zhīdào ma?",
            titleTranslation = "Do You Know? (Tahukah Kamu?)",
            level = "HSK 2",
            category = "Persahabatan & Humor",
            description = "Keseruan tinggal di sebelah universitas ternama dengan puluhan ribu mahasiswa dan ragam kuliner lezat.",
            coverEmoji = "🤔",
            coverImageRes = R.drawable.cover_story_do_you_know,
            estimatedReadMinutes = 2,
            sentences = listOf(
                Sentence(
                    id = "s_doyouknw_1",
                    hanzi = "你知道吗？",
                    pinyin = "nǐ zhī dào ma",
                    translation = "Tahukah kamu?",
                    tokens = listOf(
                        WordToken("你", "nǐ", "Kamu", "Kata ganti orang kedua tunggal"),
                        WordToken("知道", "zhī dào", "Tahu / Mengetahui", "Memiliki informasi"),
                        WordToken("吗", "ma", "Apakah (partikel tanya)", "Partikel di akhir kalimat interogatif ya/tidak")
                    )
                ),
                Sentence(
                    id = "s_doyouknw_2",
                    hanzi = "我家旁边有一所大学。",
                    pinyin = "wǒ jiā páng biān yǒu yī suǒ dà xué",
                    translation = "Di sebelah rumah saya ada sebuah universitas.",
                    tokens = listOf(
                        WordToken("我", "wǒ", "Saya", "Kata ganti orang pertama tunggal"),
                        WordToken("家", "jiā", "Rumah / Keluarga", "Tempat tinggal"),
                        WordToken("旁边", "páng biān", "Side; adjacent place", "Kosakata HSK 2: 旁边 (páng biān)"),
                        WordToken("有", "yǒu", "Mempunyai / Ada", "Menyatakan kepemilikan atau eksistensi"),
                        WordToken("一", "yī", "One", "Kosakata HSK 2: 一 (yī)"),
                        WordToken("所", "suǒ", "Classifier for houses, small buildings, institutions etc", "Kosakata HSK 2: 所 (suǒ)"),
                        WordToken("大学", "dà xué", "Universitas", "Perguruan tinggi")
                    )
                ),
                Sentence(
                    id = "s_doyouknw_3",
                    hanzi = "这所大学有三万个学生，两千多名老师，是这个城市最好的学校。",
                    pinyin = "zhè suǒ dà xué yǒu sān wàn gè xué shēng liǎng qiān duō míng lǎo shī shì zhè gè chéng shì zuì hǎo de xué xiào",
                    translation = "Universitas ini memiliki tiga puluh ribu mahasiswa dan dua ribu lebih dosen, merupakan kampus terbaik di kota ini.",
                    tokens = listOf(
                        WordToken("这", "zhè", "This; these", "Kosakata HSK 2: 这 (zhè)"),
                        WordToken("所", "suǒ", "Classifier for houses, small buildings, institutions etc", "Kosakata HSK 2: 所 (suǒ)"),
                        WordToken("大学", "dà xué", "Universitas", "Perguruan tinggi"),
                        WordToken("有", "yǒu", "Mempunyai / Ada", "Menyatakan kepemilikan atau eksistensi"),
                        WordToken("三", "sān", "Three", "Kosakata HSK 2: 三 (sān)"),
                        WordToken("万", "wàn", "Ten thousand", "Kosakata HSK 2: 万 (wàn)"),
                        WordToken("个", "gè", "Classifier for people or objects in general", "Kosakata HSK 2: 个 (gè)"),
                        WordToken("学生", "xué shēng", "Siswa / Mahasiswa", "Pelajar"),
                        WordToken("两", "liǎng", "Two", "Kosakata HSK 2: 两 (liǎng)"),
                        WordToken("千", "qiān", "Thousand", "Kosakata HSK 2: 千 (qiān)"),
                        WordToken("多", "duō", "Banyak", "Jumlah besar"),
                        WordToken("名", "míng", "Classifier for people", "Kosakata HSK 2: 名 (míng)"),
                        WordToken("老师", "lǎo shī", "Guru", "Tenaga pengajar"),
                        WordToken("是", "shì", "Adalah", "Kopula penjelas"),
                        WordToken("这", "zhè", "This; these", "Kosakata HSK 2: 这 (zhè)"),
                        WordToken("个", "gè", "Classifier for people or objects in general", "Kosakata HSK 2: 个 (gè)"),
                        WordToken("城市", "chéng shì", "City; town", "Kosakata HSK 2: 城市 (chéng shì)"),
                        WordToken("最好", "zuì hǎo", "Best", "Kosakata HSK 2: 最好 (zuì hǎo)"),
                        WordToken("的", "de", "Punya / Yang (partikel posesif)", "Partikel penjelas modifikasi atau kepemilikan"),
                        WordToken("学校", "xué xiào", "Sekolah", "Institusi pendidikan")
                    )
                ),
                Sentence(
                    id = "s_doyouknw_4",
                    hanzi = "也因为我家在大学旁边，所以吃东西、买东西都很方便。",
                    pinyin = "yě yīn wèi wǒ jiā zài dà xué páng biān suǒ yǐ chī dōng xi mǎi dōng xi dōu hěn fāng biàn",
                    translation = "Juga karena rumah saya berada di sebelah universitas, urusan mencari makan dan berbelanja menjadi sangat praktis.",
                    tokens = listOf(
                        WordToken("也", "yě", "Juga / Pun", "Partikel penanda kesamaan"),
                        WordToken("因为", "yīn wèi", "Karena", "Menyatakan alasan sebab"),
                        WordToken("我", "wǒ", "Saya", "Kata ganti orang pertama tunggal"),
                        WordToken("家", "jiā", "Rumah / Keluarga", "Tempat tinggal"),
                        WordToken("在", "zài", "Di / Berada di", "Preposisi lokasi atau aspek progresif"),
                        WordToken("大学", "dà xué", "Universitas", "Perguruan tinggi"),
                        WordToken("旁边", "páng biān", "Side; adjacent place", "Kosakata HSK 2: 旁边 (páng biān)"),
                        WordToken("所以", "suǒ yǐ", "Sehingga / Oleh karena itu", "Menyatakan akibat konsekuensi"),
                        WordToken("吃", "chī", "Makan", "Aktivitas mengonsumsi makanan"),
                        WordToken("东西", "dōng xi", "Thing", "Kosakata HSK 2: 东西 (dōng xi)"),
                        WordToken("买", "mǎi", "Membeli", "Transaksi belanja"),
                        WordToken("东西", "dōng xi", "Thing", "Kosakata HSK 2: 东西 (dōng xi)"),
                        WordToken("都", "dōu", "Semua / Seluruhnya", "Menyatakan keuniversalan subjek"),
                        WordToken("很", "hěn", "Sangat", "Tingkat derajat"),
                        WordToken("方便", "fāng biàn", "Convenient; suitable", "Kosakata HSK 2: 方便 (fāng biàn)")
                    )
                ),
                Sentence(
                    id = "s_doyouknw_5",
                    hanzi = "周围有很多商店和饭馆，云南菜、四川菜、广东菜……你想吃什么就有什么。",
                    pinyin = "zhōu wéi yǒu hěn duō shāng diàn hé fàn guǎn Yún nán cài Sì chuān cài Guǎng dōng cài nǐ xiǎng chī shén me jiù yǒu shén me",
                    translation = "Di sekitarnya ada banyak toko dan restoran, masakan Yunnan, masakan Sichuan, masakan Kanton…… apa pun yang ingin kamu makan semua tersedia.",
                    tokens = listOf(
                        WordToken("周围", "zhōu wéi", "Environs; surroundings; periphery", "Kosakata HSK 2: 周围 (zhōu wéi)"),
                        WordToken("有", "yǒu", "Mempunyai / Ada", "Menyatakan kepemilikan atau eksistensi"),
                        WordToken("很多", "hěn duō", "Many; a lot of", "Kosakata HSK 2: 很多 (hěn duō)"),
                        WordToken("商店", "shāng diàn", "Toko", "Tempat berjual beli"),
                        WordToken("和", "hé", "Dan", "Kata hubung setara"),
                        WordToken("饭馆", "fàn guǎn", "Restaurant", "Kosakata HSK 2: 饭馆 (fàn guǎn)"),
                        WordToken("云南", "Yún nán", "Yunnan province, a province in southwest china", "Kosakata HSK 2: 云南 (Yún nán)"),
                        WordToken("菜", "cài", "Sayuran / Hidangan", "Lauk pauk masakan"),
                        WordToken("四川", "Sì chuān", "Sichuan; a province in southwest china.", "Kosakata HSK 2: 四川 (Sì chuān)"),
                        WordToken("菜", "cài", "Sayuran / Hidangan", "Lauk pauk masakan"),
                        WordToken("广东", "Guǎng dōng", "Guangdong; a province in southern china.", "Kosakata HSK 2: 广东 (Guǎng dōng)"),
                        WordToken("菜", "cài", "Sayuran / Hidangan", "Lauk pauk masakan"),
                        WordToken("你", "nǐ", "Kamu", "Kata ganti orang kedua tunggal"),
                        WordToken("想", "xiǎng", "Ingin / Berpikir / Rindu", "Keinginan atau pemikiran batin"),
                        WordToken("吃", "chī", "Makan", "Aktivitas mengonsumsi makanan"),
                        WordToken("什么", "shén me", "Something; anything", "Kosakata HSK 2: 什么 (shén me)"),
                        WordToken("就", "jiù", "Langsung / Segera / Maka", "Menyatakan ketepatan waktu atau kelogisan"),
                        WordToken("有", "yǒu", "Mempunyai / Ada", "Menyatakan kepemilikan atau eksistensi"),
                        WordToken("什么", "shén me", "Something; anything", "Kosakata HSK 2: 什么 (shén me)")
                    )
                ),
                Sentence(
                    id = "s_doyouknw_6",
                    hanzi = "这个大学后面有一座山，很有名。",
                    pinyin = "zhè gè dà xué hòu miàn yǒu yī zuò shān hěn yǒu míng",
                    translation = "Di belakang universitas ini ada sebuah gunung yang sangat terkenal.",
                    tokens = listOf(
                        WordToken("这", "zhè", "This; these", "Kosakata HSK 2: 这 (zhè)"),
                        WordToken("个", "gè", "Classifier for people or objects in general", "Kosakata HSK 2: 个 (gè)"),
                        WordToken("大学", "dà xué", "Universitas", "Perguruan tinggi"),
                        WordToken("后面", "hòu miàn", "Behind; near the end; at the back", "Kosakata HSK 2: 后面 (hòu miàn)"),
                        WordToken("有", "yǒu", "Mempunyai / Ada", "Menyatakan kepemilikan atau eksistensi"),
                        WordToken("一", "yī", "One", "Kosakata HSK 2: 一 (yī)"),
                        WordToken("座", "zuò", "Classifier for large immovable objects", "Kosakata HSK 2: 座 (zuò)"),
                        WordToken("山", "shān", "Mountain; hill", "Kosakata HSK 2: 山 (shān)"),
                        WordToken("很", "hěn", "Sangat", "Tingkat derajat"),
                        WordToken("有名", "yǒu míng", "Famous", "Kosakata HSK 2: 有名 (yǒu míng)")
                    )
                ),
                Sentence(
                    id = "s_doyouknw_7",
                    hanzi = "很多人来这儿旅游，中国人、外国人都喜欢来这里爬山。",
                    pinyin = "hěn duō rén lái zhè r lǚ yóu Zhōng guó rén wài guó rén dōu xǐ huan lái zhè lǐ pá shān",
                    translation = "Banyak orang datang ke sini untuk berwisata, baik orang Tiongkok maupun orang asing suka datang mendaki gunung di sini.",
                    tokens = listOf(
                        WordToken("很多", "hěn duō", "Many; a lot of", "Kosakata HSK 2: 很多 (hěn duō)"),
                        WordToken("人", "rén", "Person; people", "Kosakata HSK 2: 人 (rén)"),
                        WordToken("来", "lái", "Datang", "Menuju ke arah pembicara"),
                        WordToken("这儿", "zhè r", "Sini", "Kata tunjuk tempat dekat"),
                        WordToken("旅游", "lǚ yóu", "To travel", "Kosakata HSK 2: 旅游 (lǚ yóu)"),
                        WordToken("中国人", "Zhōng guó rén", "Chinese person", "Kosakata HSK 2: 中国人 (Zhōng guó rén)"),
                        WordToken("外国人", "wài guó rén", "Foreigner", "Kosakata HSK 2: 外国人 (wài guó rén)"),
                        WordToken("都", "dōu", "Semua / Seluruhnya", "Menyatakan keuniversalan subjek"),
                        WordToken("喜欢", "xǐ huan", "Menyukai / Gemar", "Perasaan suka"),
                        WordToken("来", "lái", "Datang", "Menuju ke arah pembicara"),
                        WordToken("这里", "zhè lǐ", "Here", "Kosakata HSK 2: 这里 (zhè lǐ)"),
                        WordToken("爬山", "pá shān", "To go for a hike (esp. in the hills or mountains)", "Kosakata HSK 2: 爬山 (pá shān)")
                    )
                ),
                Sentence(
                    id = "s_doyouknw_8",
                    hanzi = "因为我很喜欢爬山，也喜欢和不同的人聊天，所以我成为了一名导游，每天都很快乐。",
                    pinyin = "yīn wèi wǒ hěn xǐ huan pá shān yě xǐ huan hé bù tóng de rén liáo tiān suǒ yǐ wǒ chéng wéi le yī míng dǎo yóu měi tiān dōu hěn kuài lè",
                    translation = "Karena saya sangat suka mendaki gunung dan juga suka mengobrol dengan berbagai orang, saya menjadi seorang pemandu wisata, setiap hari sangat bahagia.",
                    tokens = listOf(
                        WordToken("因为", "yīn wèi", "Karena", "Menyatakan alasan sebab"),
                        WordToken("我", "wǒ", "Saya", "Kata ganti orang pertama tunggal"),
                        WordToken("很", "hěn", "Sangat", "Tingkat derajat"),
                        WordToken("喜欢", "xǐ huan", "Menyukai / Gemar", "Perasaan suka"),
                        WordToken("爬山", "pá shān", "To go for a hike (esp. in the hills or mountains)", "Kosakata HSK 2: 爬山 (pá shān)"),
                        WordToken("也", "yě", "Juga / Pun", "Partikel penanda kesamaan"),
                        WordToken("喜欢", "xǐ huan", "Menyukai / Gemar", "Perasaan suka"),
                        WordToken("和", "hé", "Dan", "Kata hubung setara"),
                        WordToken("不同", "bù tóng", "Different", "Kosakata HSK 2: 不同 (bù tóng)"),
                        WordToken("的", "de", "Punya / Yang (partikel posesif)", "Partikel penjelas modifikasi atau kepemilikan"),
                        WordToken("人", "rén", "Person; people", "Kosakata HSK 2: 人 (rén)"),
                        WordToken("聊天", "liáo tiān", "To chat; to gossip", "Kosakata HSK 2: 聊天 (liáo tiān)"),
                        WordToken("所以", "suǒ yǐ", "Sehingga / Oleh karena itu", "Menyatakan akibat konsekuensi"),
                        WordToken("我", "wǒ", "Saya", "Kata ganti orang pertama tunggal"),
                        WordToken("成为", "chéng wéi", "To become; to turn into", "Kosakata HSK 2: 成为 (chéng wéi)"),
                        WordToken("了", "le", "Sudah (partikel perubahan situasi)", "Partikel aspek selesainya tindakan"),
                        WordToken("一", "yī", "One", "Kosakata HSK 2: 一 (yī)"),
                        WordToken("名", "míng", "Classifier for people", "Kosakata HSK 2: 名 (míng)"),
                        WordToken("导游", "dǎo yóu", "Tour guide", "Kosakata HSK 2: 导游 (dǎo yóu)"),
                        WordToken("每", "měi", "Each", "Kosakata HSK 2: 每 (měi)"),
                        WordToken("天", "tiān", "Hari", "Satuan hari"),
                        WordToken("都", "dōu", "Semua / Seluruhnya", "Menyatakan keuniversalan subjek"),
                        WordToken("很", "hěn", "Sangat", "Tingkat derajat"),
                        WordToken("快乐", "kuài lè", "Happy; joyful", "Kosakata HSK 2: 快乐 (kuài lè)")
                    )
                )
            ),
            questions = listOf(
                StoryQuestion(
                    id = "q_doyouknw_1",
                    questionText = "我家旁边有什么？ (Ada apa di sebelah rumah saya?)",
                    options = listOf("一个大医院 (Sebuah rumah sakit besar)", "一所大学 (Sebuah universitas)", "一个火车站 (Sebuah stasiun kereta)", "一个公园 (Sebuah taman)"),
                    correctAnswerIndex = 1,
                    explanation = "Teks menyatakan '我家旁边有一所大学'."
                ),
                StoryQuestion(
                    id = "q_doyouknw_2",
                    questionText = "这所大学有多少个学生？ (Berapa banyak mahasiswa di universitas ini?)",
                    options = listOf("一万个 (10.000)", "两千个 (2.000)", "三万个 (30.000)", "五千个 (5.000)"),
                    correctAnswerIndex = 2,
                    explanation = "Teks menyebutkan '这所大学有三万个学生'."
                ),
                StoryQuestion(
                    id = "q_doyouknw_3",
                    questionText = "住在大学旁边有什么好处？ (Apa keuntungan tinggal di sebelah universitas?)",
                    options = listOf("吃东西很方便，有很多小吃店 (Makan sangat praktis, banyak kedai jajanan enak)", "每天都很安静 (Setiap hari sangat tenang)", "买火车票便宜 (Beli tiket kereta murah)", "不用去上班 (Tidak usah masuk kerja)"),
                    correctAnswerIndex = 0,
                    explanation = "Di sekitar universitas banyak restoran dan toko makanan lezat dengan harga bersahabat."
                ),
                StoryQuestion(
                    id = "q_doyouknw_4",
                    questionText = "作者对住在这里的生活感觉如何？ (Bagaimana perasaan penulis tentang tinggal di sini?)",
                    options = listOf("很满意也很喜欢 (Sangat puas dan suka)", "想马上搬家 (Ingin segera pindah)", "觉得太吵闹 (Merasa terlalu bising)", "很不高兴 (Sangat tidak senang)"),
                    correctAnswerIndex = 0,
                    explanation = "Penulis menikmati kemudahan fasilitas hidup dan suasana ramai di sekitar kampus."
                )
            )
        ),
        // Cerita Mandarin Bean 79 (HSK 2): This is My Boyfriend (Ini Adalah Pacar Laki-lakiku)
        Story(
            id = "story_this_is_my_boyfriend",
            titleHanzi = "这是我男朋友",
            titlePinyin = "Zhè Shì Wǒ Nánpéngyou",
            titleTranslation = "This is My Boyfriend (Ini Adalah Pacar Laki-lakiku)",
            level = "HSK 2",
            category = "Hubungan & Percintaan",
            description = "Mengenalkan sang kekasih bernama Zhang Yang yang berperawakan atletis dan jago berolahraga.",
            coverEmoji = "💑",
            coverImageRes = R.drawable.cover_story_this_is_my_boyfriend,
            estimatedReadMinutes = 2,
            sentences = listOf(
                Sentence(
                    id = "s_thisbf_1",
                    hanzi = "我有男朋友了，他的名字叫张阳。",
                    pinyin = "wǒ yǒu nán péng you le tā de míng zi jiào Zhāng Yáng",
                    translation = "Saya sudah punya pacar, namanya Zhang Yang.",
                    tokens = listOf(
                        WordToken("我", "wǒ", "Saya", "Kata ganti orang pertama tunggal"),
                        WordToken("有", "yǒu", "Mempunyai / Ada", "Menyatakan kepemilikan atau eksistensi"),
                        WordToken("男朋友", "nán péng you", "Pacar laki-laki", "Pasangan pria"),
                        WordToken("了", "le", "Sudah (partikel perubahan situasi)", "Partikel aspek selesainya tindakan"),
                        WordToken("他的", "tā de", "His; belonging to him", "Kosakata HSK 2: 他的 (tā de)"),
                        WordToken("名字", "míng zi", "Name (of a person or thing)", "Kosakata HSK 2: 名字 (míng zi)"),
                        WordToken("叫", "jiào", "Memanggil / Bernama", "Menyebutkan nama"),
                        WordToken("张阳", "Zhāng Yáng", "A person&#x27;s name, zhang yang", "Kosakata HSK 2: 张阳 (Zhāng Yáng)")
                    )
                ),
                Sentence(
                    id = "s_thisbf_2",
                    hanzi = "他不胖也不瘦，个子很高，喜欢运动。",
                    pinyin = "tā bù pàng yě bù shòu gè zi hěn gāo xǐ huan yùn dòng",
                    translation = "Dia tidak gemuk dan tidak kurus, postur tubuhnya tinggi, dan dia suka berolahraga.",
                    tokens = listOf(
                        WordToken("他", "tā", "Dia (laki-laki)", "Kata ganti orang ketiga tunggal"),
                        WordToken("不", "bù", "Tidak", "Kata sangkalan untuk masa kini atau masa depan"),
                        WordToken("胖", "pàng", "Gemuk", "Bentuk tubuh berisi"),
                        WordToken("也", "yě", "Juga / Pun", "Partikel penanda kesamaan"),
                        WordToken("不", "bù", "Tidak", "Kata sangkalan untuk masa kini atau masa depan"),
                        WordToken("瘦", "shòu", "Kurus", "Bentuk tubuh ramping"),
                        WordToken("个子", "gè zi", "Stature; height; size (of a person or object)", "Kosakata HSK 2: 个子 (gè zi)"),
                        WordToken("很", "hěn", "Sangat", "Tingkat derajat"),
                        WordToken("高", "gāo", "Tinggi", "Postur atau letak tinggi"),
                        WordToken("喜欢", "xǐ huan", "Menyukai / Gemar", "Perasaan suka"),
                        WordToken("运动", "yùn dòng", "To exercise", "Kosakata HSK 2: 运动 (yùn dòng)")
                    )
                ),
                Sentence(
                    id = "s_thisbf_3",
                    hanzi = "我们认识三年半了。",
                    pinyin = "wǒ men rèn shi sān nián bàn le",
                    translation = "Kami sudah saling mengenal selama tiga setengah tahun.",
                    tokens = listOf(
                        WordToken("我们", "wǒ men", "Kami / Kita", "Kata ganti orang pertama jamak"),
                        WordToken("认识", "rèn shi", "Mengenal", "Mengetahui seseorang secara akrab"),
                        WordToken("三", "sān", "Three", "Kosakata HSK 2: 三 (sān)"),
                        WordToken("年", "nián", "Tahun", "Satuan tahun"),
                        WordToken("半", "bàn", "(after a number) and a half", "Kosakata HSK 2: 半 (bàn)"),
                        WordToken("了", "le", "Sudah (partikel perubahan situasi)", "Partikel aspek selesainya tindakan")
                    )
                ),
                Sentence(
                    id = "s_thisbf_4",
                    hanzi = "张阳是我哥哥的同学，但是哥哥对他不满意，因为他没有工作。",
                    pinyin = "Zhāng Yáng shì wǒ gē ge de tóng xué dàn shì gē ge duì tā bù mǎn yì yīn wèi tā méi yǒu gōng zuò",
                    translation = "Zhang Yang adalah teman sekelas kakak laki-laki saya, tetapi kakak kurang sreg dengannya karena dia belum punya pekerjaan.",
                    tokens = listOf(
                        WordToken("张阳", "Zhāng Yáng", "A person&#x27;s name, zhang yang", "Kosakata HSK 2: 张阳 (Zhāng Yáng)"),
                        WordToken("是", "shì", "Adalah", "Kopula penjelas"),
                        WordToken("我", "wǒ", "Saya", "Kata ganti orang pertama tunggal"),
                        WordToken("哥哥", "gē ge", "Kakak laki-laki", "Saudara kandung laki-laki tertua"),
                        WordToken("的", "de", "Punya / Yang (partikel posesif)", "Partikel penjelas modifikasi atau kepemilikan"),
                        WordToken("同学", "tóng xué", "Teman sekelas", "Rekan belajar"),
                        WordToken("但是", "dàn shì", "Tetapi / Namun", "Kata hubung pertentangan"),
                        WordToken("哥哥", "gē ge", "Kakak laki-laki", "Saudara kandung laki-laki tertua"),
                        WordToken("对", "duì", "Towards; at; for", "Kosakata HSK 2: 对 (duì)"),
                        WordToken("他", "tā", "Dia (laki-laki)", "Kata ganti orang ketiga tunggal"),
                        WordToken("不", "bù", "Tidak", "Kata sangkalan untuk masa kini atau masa depan"),
                        WordToken("满意", "mǎn yì", "Satisfied", "Kosakata HSK 2: 满意 (mǎn yì)"),
                        WordToken("因为", "yīn wèi", "Karena", "Menyatakan alasan sebab"),
                        WordToken("他", "tā", "Dia (laki-laki)", "Kata ganti orang ketiga tunggal"),
                        WordToken("没有", "méi yǒu", "Tidak ada / Tidak punya", "Bentuk negasi dari 有"),
                        WordToken("工作", "gōng zuò", "Bekerja", "Aktivitas mata pencaharian")
                    )
                ),
                Sentence(
                    id = "s_thisbf_5",
                    hanzi = "张阳有一个妹妹，还是个中学生，我很喜欢这个女孩，非常聪明可爱。",
                    pinyin = "Zhāng Yáng yǒu yī gè mèi mei hái shì gè zhōng xué shēng wǒ hěn xǐ huan zhè gè nǚ hái fēi cháng cōng míng kě ài",
                    translation = "Zhang Yang memiliki seorang adik perempuan yang masih duduk di bangku SMP, saya sangat menyukai gadis ini, sangat pintar dan lucu.",
                    tokens = listOf(
                        WordToken("张阳", "Zhāng Yáng", "A person&#x27;s name, zhang yang", "Kosakata HSK 2: 张阳 (Zhāng Yáng)"),
                        WordToken("有", "yǒu", "Mempunyai / Ada", "Menyatakan kepemilikan atau eksistensi"),
                        WordToken("一", "yī", "One", "Kosakata HSK 2: 一 (yī)"),
                        WordToken("个", "gè", "Classifier for people or objects in general", "Kosakata HSK 2: 个 (gè)"),
                        WordToken("妹妹", "mèi mei", "Adik perempuan", "Saudari kandung termuda"),
                        WordToken("还", "hái", "Masih / Malahan", "Menyatakan kelanjutan situasi"),
                        WordToken("是", "shì", "Adalah", "Kopula penjelas"),
                        WordToken("个", "gè", "Classifier for people or objects in general", "Kosakata HSK 2: 个 (gè)"),
                        WordToken("中学生", "zhōng xué shēng", "Middle-school student", "Kosakata HSK 2: 中学生 (zhōng xué shēng)"),
                        WordToken("我", "wǒ", "Saya", "Kata ganti orang pertama tunggal"),
                        WordToken("很", "hěn", "Sangat", "Tingkat derajat"),
                        WordToken("喜欢", "xǐ huan", "Menyukai / Gemar", "Perasaan suka"),
                        WordToken("这", "zhè", "This; these", "Kosakata HSK 2: 这 (zhè)"),
                        WordToken("个", "gè", "Classifier for people or objects in general", "Kosakata HSK 2: 个 (gè)"),
                        WordToken("女孩", "nǚ hái", "Girl; lass", "Kosakata HSK 2: 女孩 (nǚ hái)"),
                        WordToken("非常", "fēi cháng", "Sangat / Amat", "Tingkat intensitas tinggi"),
                        WordToken("聪明", "cōng míng", "Intelligent; clever; bright", "Kosakata HSK 2: 聪明 (cōng míng)"),
                        WordToken("可爱", "kě ài", "Adorable", "Kosakata HSK 2: 可爱 (kě ài)")
                    )
                ),
                Sentence(
                    id = "s_thisbf_6",
                    hanzi = "张阳的妈妈是护士，他的爸爸在一个小公司工作，我还没见过他们。",
                    pinyin = "Zhāng Yáng de mā ma shì hù shi tā de bà ba zài yī gè xiǎo gōng sī gōng zuò wǒ hái méi jiàn guo tā men",
                    translation = "Ibu Zhang Yang adalah seorang perawat, ayahnya bekerja di sebuah perusahaan kecil, saya belum pernah bertemu dengan mereka.",
                    tokens = listOf(
                        WordToken("张阳", "Zhāng Yáng", "A person&#x27;s name, zhang yang", "Kosakata HSK 2: 张阳 (Zhāng Yáng)"),
                        WordToken("的", "de", "Punya / Yang (partikel posesif)", "Partikel penjelas modifikasi atau kepemilikan"),
                        WordToken("妈妈", "mā ma", "Ibu", "Anggota keluarga"),
                        WordToken("是", "shì", "Adalah", "Kopula penjelas"),
                        WordToken("护士", "hù shi", "Perawat", "Tenaga kesehatan"),
                        WordToken("他的", "tā de", "His; belonging to him", "Kosakata HSK 2: 他的 (tā de)"),
                        WordToken("爸爸", "bà ba", "Ayah", "Anggota keluarga"),
                        WordToken("在", "zài", "Di / Berada di", "Preposisi lokasi atau aspek progresif"),
                        WordToken("一", "yī", "One", "Kosakata HSK 2: 一 (yī)"),
                        WordToken("个", "gè", "Classifier for people or objects in general", "Kosakata HSK 2: 个 (gè)"),
                        WordToken("小", "xiǎo", "Kecil", "Ukuran fisik kecil"),
                        WordToken("公司", "gōng sī", "Perusahaan", "Entitas bisnis tempat kerja"),
                        WordToken("工作", "gōng zuò", "Bekerja", "Aktivitas mata pencaharian"),
                        WordToken("我", "wǒ", "Saya", "Kata ganti orang pertama tunggal"),
                        WordToken("还", "hái", "Masih / Malahan", "Menyatakan kelanjutan situasi"),
                        WordToken("没", "méi", "Belum / Tidak", "Kata sangkalan untuk keberadaan atau masa lampau"),
                        WordToken("见", "jiàn", "To see", "Kosakata HSK 2: 见 (jiàn)"),
                        WordToken("过", "guo", "(experienced action marker)", "Kosakata HSK 2: 过 (guo)"),
                        WordToken("他们", "tā men", "Mereka", "Kata ganti orang ketiga jamak")
                    )
                ),
                Sentence(
                    id = "s_thisbf_7",
                    hanzi = "这就是我的男朋友和他的家人，你觉得怎么样？",
                    pinyin = "zhè jiù shì wǒ de nán péng you hé tā de jiā rén nǐ jué de zěn me yàng",
                    translation = "Inilah pacar saya dan keluarganya, bagaimana menurutmu?",
                    tokens = listOf(
                        WordToken("这", "zhè", "This; these", "Kosakata HSK 2: 这 (zhè)"),
                        WordToken("就", "jiù", "Langsung / Segera / Maka", "Menyatakan ketepatan waktu atau kelogisan"),
                        WordToken("是", "shì", "Adalah", "Kopula penjelas"),
                        WordToken("我的", "wǒ de", "My; mine", "Kosakata HSK 2: 我的 (wǒ de)"),
                        WordToken("男朋友", "nán péng you", "Pacar laki-laki", "Pasangan pria"),
                        WordToken("和", "hé", "Dan", "Kata hubung setara"),
                        WordToken("他的", "tā de", "His; belonging to him", "Kosakata HSK 2: 他的 (tā de)"),
                        WordToken("家人", "jiā rén", "Family member", "Kosakata HSK 2: 家人 (jiā rén)"),
                        WordToken("你", "nǐ", "Kamu", "Kata ganti orang kedua tunggal"),
                        WordToken("觉得", "jué de", "To think that ...; to feel that ...", "Kosakata HSK 2: 觉得 (jué de)"),
                        WordToken("怎么样", "zěn me yàng", "How?", "Kosakata HSK 2: 怎么样 (zěn me yàng)")
                    )
                )
            ),
            questions = listOf(
                StoryQuestion(
                    id = "q_thisbf_1",
                    questionText = "我的男朋友叫什么名字？ (Siapa nama pacar laki-laki saya?)",
                    options = listOf("王明 (Wang Ming)", "张阳 (Zhang Yang)", "李华 (Li Hua)", "刘洋 (Liu Yang)"),
                    correctAnswerIndex = 1,
                    explanation = "Teks menyatakan '他的名字叫张阳'."
                ),
                StoryQuestion(
                    id = "q_thisbf_2",
                    questionText = "张阳长得怎么样？ (Bagaimana penampilan fisik Zhang Yang?)",
                    options = listOf("很胖很矮 (Sangat gemuk dan pendek)", "不胖也不瘦，个子很高 (Tidak gemuk juga tidak kurus, berpostur tinggi)", "特别瘦小 (Sangat kurus kecil)", "头发很长 (Rambutnya sangat panjang)"),
                    correctAnswerIndex = 1,
                    explanation = "Teks menjelaskan perawakan '他不胖也不瘦，个子很高'."
                ),
                StoryQuestion(
                    id = "q_thisbf_3",
                    questionText = "我们认识多长时间了？ (Berapa lama kami sudah saling kenal?)",
                    options = listOf("一年 (1 tahun)", "两年 (2 tahun)", "三年半 (3 setengah tahun)", "五年 (5 tahun)"),
                    correctAnswerIndex = 2,
                    explanation = "Teks menyatakan '我们认识三年半了'."
                ),
                StoryQuestion(
                    id = "q_thisbf_4",
                    questionText = "张阳有什么爱好？ (Apa hobi kegemaran Zhang Yang?)",
                    options = listOf("喜欢睡觉 (Suka tidur)", "喜欢运动和打球 (Suka olahraga dan bermain bola)", "看电视 (Menonton TV)", "吃甜食 (Makan manis-manis)"),
                    correctAnswerIndex = 1,
                    explanation = "Zhang Yang gemar berolahraga sehingga tubuhnya bugar dan aktif."
                )
            )
        ),
        // Cerita Mandarin Bean 80 (HSK 2): Citizen of the World (Warga Dunia)
        Story(
            id = "story_citizen_of_the_world",
            titleHanzi = "世界公民",
            titlePinyin = "Shìjiè Gōngmín",
            titleTranslation = "Citizen of the World (Warga Dunia)",
            level = "HSK 2",
            category = "Sosial & Budaya",
            description = "Kisah seseorang dengan latar belakang multikultural yang menganggap seluruh dunia sebagai rumahnya.",
            coverEmoji = "🌍",
            coverImageRes = R.drawable.cover_story_citizen_of_the_world,
            estimatedReadMinutes = 2,
            sentences = listOf(
                Sentence(
                    id = "s_worldcit_1",
                    hanzi = "我是哪里人？",
                    pinyin = "wǒ shì nǎ lǐ rén",
                    translation = "Saya orang mana?",
                    tokens = listOf(
                        WordToken("我", "wǒ", "Saya", "Kata ganti orang pertama tunggal"),
                        WordToken("是", "shì", "Adalah", "Kopula penjelas"),
                        WordToken("哪里", "nǎ lǐ", "Where?", "Kosakata HSK 2: 哪里 (nǎ lǐ)"),
                        WordToken("人", "rén", "Person; people", "Kosakata HSK 2: 人 (rén)")
                    )
                ),
                Sentence(
                    id = "s_worldcit_2",
                    hanzi = "这个问题很难回答。",
                    pinyin = "zhè gè wèn tí hěn nán huí dá",
                    translation = "Pertanyaan ini sangat sulit dijawab.",
                    tokens = listOf(
                        WordToken("这", "zhè", "This; these", "Kosakata HSK 2: 这 (zhè)"),
                        WordToken("个", "gè", "Classifier for people or objects in general", "Kosakata HSK 2: 个 (gè)"),
                        WordToken("问题", "wèn tí", "Question", "Kosakata HSK 2: 问题 (wèn tí)"),
                        WordToken("很", "hěn", "Sangat", "Tingkat derajat"),
                        WordToken("难", "nán", "Difficult (to...)", "Kosakata HSK 2: 难 (nán)"),
                        WordToken("回答", "huí dá", "To reply; to answer", "Kosakata HSK 2: 回答 (huí dá)")
                    )
                ),
                Sentence(
                    id = "s_worldcit_3",
                    hanzi = "我的爸爸是美国人，妈妈是韩国人。",
                    pinyin = "wǒ de bà ba shì Měi guó rén mā ma shì Hán guó rén",
                    translation = "Ayah saya orang Amerika, ibu saya orang Korea.",
                    tokens = listOf(
                        WordToken("我的", "wǒ de", "My; mine", "Kosakata HSK 2: 我的 (wǒ de)"),
                        WordToken("爸爸", "bà ba", "Ayah", "Anggota keluarga"),
                        WordToken("是", "shì", "Adalah", "Kopula penjelas"),
                        WordToken("美国", "Měi guó", "Amerika Serikat", "Negara USA"),
                        WordToken("人", "rén", "Person; people", "Kosakata HSK 2: 人 (rén)"),
                        WordToken("妈妈", "mā ma", "Ibu", "Anggota keluarga"),
                        WordToken("是", "shì", "Adalah", "Kopula penjelas"),
                        WordToken("韩国", "Hán guó", "Korea Selatan", "Negara Korea"),
                        WordToken("人", "rén", "Person; people", "Kosakata HSK 2: 人 (rén)")
                    )
                ),
                Sentence(
                    id = "s_worldcit_4",
                    hanzi = "我在泰国出生，在中国长大，现在在法国读大学。",
                    pinyin = "wǒ zài Tài guó chū shēng zài Zhōng guó zhǎng dà xiàn zài zài Fǎ guó dú dà xué",
                    translation = "Saya lahir di Thailand, tumbuh besar di Tiongkok, dan sekarang sedang kuliah di Prancis.",
                    tokens = listOf(
                        WordToken("我", "wǒ", "Saya", "Kata ganti orang pertama tunggal"),
                        WordToken("在", "zài", "Di / Berada di", "Preposisi lokasi atau aspek progresif"),
                        WordToken("泰国", "Tài guó", "Thailand", "Negara Thailand"),
                        WordToken("出生", "chū shēng", "To be born", "Kosakata HSK 2: 出生 (chū shēng)"),
                        WordToken("在", "zài", "Di / Berada di", "Preposisi lokasi atau aspek progresif"),
                        WordToken("中国", "Zhōng guó", "China / Tiongkok", "Negara Tiongkok"),
                        WordToken("长大", "zhǎng dà", "To grow up", "Kosakata HSK 2: 长大 (zhǎng dà)"),
                        WordToken("现在", "xiàn zài", "Sekarang", "Waktu saat ini"),
                        WordToken("在", "zài", "Di / Berada di", "Preposisi lokasi atau aspek progresif"),
                        WordToken("法国", "Fǎ guó", "Prancis", "Negara Prancis"),
                        WordToken("读", "dú", "To attend (school); to study (a subject in school)", "Kosakata HSK 2: 读 (dú)"),
                        WordToken("大学", "dà xué", "Universitas", "Perguruan tinggi")
                    )
                ),
                Sentence(
                    id = "s_worldcit_5",
                    hanzi = "我爱每个地方的文化，也会说不同国家的语言，还有很多不同国家的朋友。",
                    pinyin = "wǒ ài měi gè dì fang de wén huà yě huì shuō bù tóng guó jiā de yǔ yán hái yǒu hěn duō bù tóng guó jiā de péng you",
                    translation = "Saya mencintai budaya setiap tempat, bisa berbicara bahasa berbagai negara, dan juga memiliki banyak teman dari berbagai negara.",
                    tokens = listOf(
                        WordToken("我", "wǒ", "Saya", "Kata ganti orang pertama tunggal"),
                        WordToken("爱", "ài", "Mencintai / Cinta", "Perasaan kasih sayang mendalam"),
                        WordToken("每", "měi", "Each", "Kosakata HSK 2: 每 (měi)"),
                        WordToken("个", "gè", "Classifier for people or objects in general", "Kosakata HSK 2: 个 (gè)"),
                        WordToken("地方", "dì fang", "Place; location; area; space; territory", "Kosakata HSK 2: 地方 (dì fang)"),
                        WordToken("的", "de", "Punya / Yang (partikel posesif)", "Partikel penjelas modifikasi atau kepemilikan"),
                        WordToken("文化", "wén huà", "Culture", "Kosakata HSK 2: 文化 (wén huà)"),
                        WordToken("也", "yě", "Juga / Pun", "Partikel penanda kesamaan"),
                        WordToken("会", "huì", "Can; to have the skill; to know how to", "Kosakata HSK 2: 会 (huì)"),
                        WordToken("说", "shuō", "Berbicara / Berkata", "Menyampaikan ucapan"),
                        WordToken("不同", "bù tóng", "Different", "Kosakata HSK 2: 不同 (bù tóng)"),
                        WordToken("国家", "guó jiā", "Country; nation; state", "Kosakata HSK 2: 国家 (guó jiā)"),
                        WordToken("的", "de", "Punya / Yang (partikel posesif)", "Partikel penjelas modifikasi atau kepemilikan"),
                        WordToken("语言", "yǔ yán", "Language", "Kosakata HSK 2: 语言 (yǔ yán)"),
                        WordToken("还", "hái", "Masih / Malahan", "Menyatakan kelanjutan situasi"),
                        WordToken("有", "yǒu", "Mempunyai / Ada", "Menyatakan kepemilikan atau eksistensi"),
                        WordToken("很多", "hěn duō", "Many; a lot of", "Kosakata HSK 2: 很多 (hěn duō)"),
                        WordToken("不同", "bù tóng", "Different", "Kosakata HSK 2: 不同 (bù tóng)"),
                        WordToken("国家", "guó jiā", "Country; nation; state", "Kosakata HSK 2: 国家 (guó jiā)"),
                        WordToken("的", "de", "Punya / Yang (partikel posesif)", "Partikel penjelas modifikasi atau kepemilikan"),
                        WordToken("朋友", "péng you", "Teman / Sahabat", "Orang dekat")
                    )
                ),
                Sentence(
                    id = "s_worldcit_6",
                    hanzi = "你问我是哪里人，我会说我是世界公民。",
                    pinyin = "nǐ wèn wǒ shì nǎ lǐ rén wǒ huì shuō wǒ shì shì jiè gōng mín",
                    translation = "Jika kamu bertanya saya orang mana, saya akan menjawab bahwa saya adalah warga dunia.",
                    tokens = listOf(
                        WordToken("你", "nǐ", "Kamu", "Kata ganti orang kedua tunggal"),
                        WordToken("问", "wèn", "To ask; to inquire", "Kosakata HSK 2: 问 (wèn)"),
                        WordToken("我", "wǒ", "Saya", "Kata ganti orang pertama tunggal"),
                        WordToken("是", "shì", "Adalah", "Kopula penjelas"),
                        WordToken("哪里", "nǎ lǐ", "Where?", "Kosakata HSK 2: 哪里 (nǎ lǐ)"),
                        WordToken("人", "rén", "Person; people", "Kosakata HSK 2: 人 (rén)"),
                        WordToken("我", "wǒ", "Saya", "Kata ganti orang pertama tunggal"),
                        WordToken("会", "huì", "Can; to have the skill; to know how to", "Kosakata HSK 2: 会 (huì)"),
                        WordToken("说", "shuō", "Berbicara / Berkata", "Menyampaikan ucapan"),
                        WordToken("我", "wǒ", "Saya", "Kata ganti orang pertama tunggal"),
                        WordToken("是", "shì", "Adalah", "Kopula penjelas"),
                        WordToken("世界", "shì jiè", "World", "Kosakata HSK 2: 世界 (shì jiè)"),
                        WordToken("公民", "gōng mín", "Citizen", "Kosakata HSK 2: 公民 (gōng mín)")
                    )
                ),
                Sentence(
                    id = "s_worldcit_7",
                    hanzi = "你呢？",
                    pinyin = "nǐ ne",
                    translation = "Bagaimana denganmu?",
                    tokens = listOf(
                        WordToken("你", "nǐ", "Kamu", "Kata ganti orang kedua tunggal"),
                        WordToken("呢", "ne", "Bagaimana dengan / sedang (partikel modal)", "Partikel tanya atau penanda sedang berlangsung")
                    )
                ),
                Sentence(
                    id = "s_worldcit_8",
                    hanzi = "你是哪里人？",
                    pinyin = "nǐ shì nǎ lǐ rén",
                    translation = "Kamu orang mana?",
                    tokens = listOf(
                        WordToken("你", "nǐ", "Kamu", "Kata ganti orang kedua tunggal"),
                        WordToken("是", "shì", "Adalah", "Kopula penjelas"),
                        WordToken("哪里", "nǎ lǐ", "Where?", "Kosakata HSK 2: 哪里 (nǎ lǐ)"),
                        WordToken("人", "rén", "Person; people", "Kosakata HSK 2: 人 (rén)")
                    )
                )
            ),
            questions = listOf(
                StoryQuestion(
                    id = "q_worldcit_1",
                    questionText = "作者的爸爸是哪国人？ (Berasal dari mana ayah penulis?)",
                    options = listOf("中国人 (Orang Tiongkok)", "美国人 (Orang Amerika)", "韩国人 (Orang Korea)", "泰国人 (Orang Thailand)"),
                    correctAnswerIndex = 1,
                    explanation = "Teks menyatakan '我的爸爸是美国人'."
                ),
                StoryQuestion(
                    id = "q_worldcit_2",
                    questionText = "作者在什么地方出生？ (Di mana penulis dilahirkan?)",
                    options = listOf("在中国 (Di Tiongkok)", "在泰国 (Di Thailand)", "在法国 (Di Prancis)", "在美国 (Di Amerika)"),
                    correctAnswerIndex = 1,
                    explanation = "Teks menyatakan '我在泰国出生'."
                ),
                StoryQuestion(
                    id = "q_worldcit_3",
                    questionText = "作者现在在哪里读大学？ (Di mana penulis sekarang berkuliah?)",
                    options = listOf("美国 (Amerika)", "泰国 (Thailand)", "法国 (Prancis)", "韩国 (Korea)"),
                    correctAnswerIndex = 2,
                    explanation = "Teks menyatakan '现在在法国读大学'."
                ),
                StoryQuestion(
                    id = "q_worldcit_4",
                    questionText = "为什么作者称自己为“世界公民”？ (Mengapa penulis menyebut dirinya 'Warga Dunia'?)",
                    options = listOf("因为他走过很多地方，爱每个地方的文化 (Karena tinggal di banyak negara dan mencintai budaya dunia)", "因为他没有护照 (Karena tidak punya paspor)", "因为他是外交官 (Karena dia diplomat)", "因为他会所有语言 (Karena bisa semua bahasa)"),
                    correctAnswerIndex = 0,
                    explanation = "Pengalaman hidup lintas benua membuatnya merasa menjadi bagian dari komunitas global."
                )
            )
        ),
        // Cerita Mandarin Bean 81 (HSK 2): Hometown (Kampung Halaman)
        Story(
            id = "story_hometown",
            titleHanzi = "家乡",
            titlePinyin = "Jiāxiāng",
            titleTranslation = "Hometown (Kampung Halaman)",
            level = "HSK 2",
            category = "Kampung Halaman & Perjalanan",
            description = "Kerinduan dan cerita seorang sahabat perantau tentang kampung halamannya yang damai dan asri.",
            coverEmoji = "🏡",
            coverImageRes = R.drawable.cover_story_hometown,
            estimatedReadMinutes = 2,
            sentences = listOf(
                Sentence(
                    id = "s_hometown_1",
                    hanzi = "我有一个朋友，他的家乡不是这个城市。",
                    pinyin = "wǒ yǒu yī gè péng you tā de jiā xiāng bù shì zhè gè chéng shì",
                    translation = "Saya mempunyai seorang teman, kampung halamannya bukan di kota ini.",
                    tokens = listOf(
                        WordToken("我", "wǒ", "Saya", "Kata ganti orang pertama tunggal"),
                        WordToken("有", "yǒu", "Mempunyai / Ada", "Menyatakan kepemilikan atau eksistensi"),
                        WordToken("一", "yī", "One", "Kosakata HSK 2: 一 (yī)"),
                        WordToken("个", "gè", "Classifier for people or objects in general", "Kosakata HSK 2: 个 (gè)"),
                        WordToken("朋友", "péng you", "Teman / Sahabat", "Orang dekat"),
                        WordToken("他的", "tā de", "His; belonging to him", "Kosakata HSK 2: 他的 (tā de)"),
                        WordToken("家乡", "jiā xiāng", "Kampung halaman", "Tempat asal kelahiran"),
                        WordToken("不", "bù", "Tidak", "Kata sangkalan untuk masa kini atau masa depan"),
                        WordToken("是", "shì", "Adalah", "Kopula penjelas"),
                        WordToken("这", "zhè", "This; these", "Kosakata HSK 2: 这 (zhè)"),
                        WordToken("个", "gè", "Classifier for people or objects in general", "Kosakata HSK 2: 个 (gè)"),
                        WordToken("城市", "chéng shì", "City; town", "Kosakata HSK 2: 城市 (chéng shì)")
                    )
                ),
                Sentence(
                    id = "s_hometown_2",
                    hanzi = "他经常说，他的家乡和这个城市很不一样。",
                    pinyin = "tā jīng cháng shuō tā de jiā xiāng hé zhè gè chéng shì hěn bù yī yàng",
                    translation = "Dia sering bercerita bahwa kampung halamannya dan kota ini sangat berbeda.",
                    tokens = listOf(
                        WordToken("他", "tā", "Dia (laki-laki)", "Kata ganti orang ketiga tunggal"),
                        WordToken("经常", "jīng cháng", "Frequently; constantly; regularly; often", "Kosakata HSK 2: 经常 (jīng cháng)"),
                        WordToken("说", "shuō", "Berbicara / Berkata", "Menyampaikan ucapan"),
                        WordToken("他的", "tā de", "His; belonging to him", "Kosakata HSK 2: 他的 (tā de)"),
                        WordToken("家乡", "jiā xiāng", "Kampung halaman", "Tempat asal kelahiran"),
                        WordToken("和", "hé", "Dan", "Kata hubung setara"),
                        WordToken("这", "zhè", "This; these", "Kosakata HSK 2: 这 (zhè)"),
                        WordToken("个", "gè", "Classifier for people or objects in general", "Kosakata HSK 2: 个 (gè)"),
                        WordToken("城市", "chéng shì", "City; town", "Kosakata HSK 2: 城市 (chéng shì)"),
                        WordToken("很", "hěn", "Sangat", "Tingkat derajat"),
                        WordToken("不", "bù", "Tidak", "Kata sangkalan untuk masa kini atau masa depan"),
                        WordToken("一样", "yī yàng", "Same", "Kosakata HSK 2: 一样 (yī yàng)")
                    )
                ),
                Sentence(
                    id = "s_hometown_3",
                    hanzi = "我以为他会不开心，因为家人都不在这儿。",
                    pinyin = "wǒ yǐ wéi tā huì bù kāi xīn yīn wèi jiā rén dōu bù zài zhè r",
                    translation = "Semula saya mengira dia akan merasa tidak bahagia karena keluarganya tidak ada di sini.",
                    tokens = listOf(
                        WordToken("我", "wǒ", "Saya", "Kata ganti orang pertama tunggal"),
                        WordToken("以为", "yǐ wéi", "To think; to believe", "Kosakata HSK 2: 以为 (yǐ wéi)"),
                        WordToken("他", "tā", "Dia (laki-laki)", "Kata ganti orang ketiga tunggal"),
                        WordToken("会", "huì", "To be likely to; to be sure to", "Kosakata HSK 2: 会 (huì)"),
                        WordToken("不", "bù", "Tidak", "Kata sangkalan untuk masa kini atau masa depan"),
                        WordToken("开心", "kāi xīn", "To feel happy", "Kosakata HSK 2: 开心 (kāi xīn)"),
                        WordToken("因为", "yīn wèi", "Karena", "Menyatakan alasan sebab"),
                        WordToken("家人", "jiā rén", "Family member", "Kosakata HSK 2: 家人 (jiā rén)"),
                        WordToken("都", "dōu", "Semua / Seluruhnya", "Menyatakan keuniversalan subjek"),
                        WordToken("不", "bù", "Tidak", "Kata sangkalan untuk masa kini atau masa depan"),
                        WordToken("在", "zài", "Di / Berada di", "Preposisi lokasi atau aspek progresif"),
                        WordToken("这儿", "zhè r", "Sini", "Kata tunjuk tempat dekat")
                    )
                ),
                Sentence(
                    id = "s_hometown_4",
                    hanzi = "但是他告诉我，无论在哪儿，只要有好邻居、好朋友，就像在家一样。",
                    pinyin = "dàn shì tā gào su wǒ wú lùn zài nǎ r zhǐ yào yǒu hǎo lín jū hǎo péng you jiù xiàng zài jiā yī yàng",
                    translation = "Tetapi dia mengatakan kepada saya bahwa di mana pun berada, asalkan ada tetangga yang baik dan teman yang baik, rasanya seperti di rumah sendiri.",
                    tokens = listOf(
                        WordToken("但是", "dàn shì", "Tetapi / Namun", "Kata hubung pertentangan"),
                        WordToken("他", "tā", "Dia (laki-laki)", "Kata ganti orang ketiga tunggal"),
                        WordToken("告诉", "gào su", "To tell; to inform; to let know", "Kosakata HSK 2: 告诉 (gào su)"),
                        WordToken("我", "wǒ", "Saya", "Kata ganti orang pertama tunggal"),
                        WordToken("无论", "wú lùn", "No matter what or how", "Kosakata HSK 2: 无论 (wú lùn)"),
                        WordToken("在", "zài", "Di / Berada di", "Preposisi lokasi atau aspek progresif"),
                        WordToken("哪儿", "nǎ r", "Di mana", "Kata tanya tempat"),
                        WordToken("只要", "zhǐ yào", "So long as; provided; if", "Kosakata HSK 2: 只要 (zhǐ yào)"),
                        WordToken("有", "yǒu", "Mempunyai / Ada", "Menyatakan kepemilikan atau eksistensi"),
                        WordToken("好", "hǎo", "Bagus / Baik", "Kualitas positif"),
                        WordToken("邻居", "lín jū", "Neighbor", "Kosakata HSK 2: 邻居 (lín jū)"),
                        WordToken("好", "hǎo", "Bagus / Baik", "Kualitas positif"),
                        WordToken("朋友", "péng you", "Teman / Sahabat", "Orang dekat"),
                        WordToken("就", "jiù", "Langsung / Segera / Maka", "Menyatakan ketepatan waktu atau kelogisan"),
                        WordToken("像", "xiàng", "To resemble", "Kosakata HSK 2: 像 (xiàng)"),
                        WordToken("在", "zài", "Di / Berada di", "Preposisi lokasi atau aspek progresif"),
                        WordToken("家", "jiā", "Rumah / Keluarga", "Tempat tinggal"),
                        WordToken("一样", "yī yàng", "Just like", "Kosakata HSK 2: 一样 (yī yàng)")
                    )
                ),
                Sentence(
                    id = "s_hometown_5",
                    hanzi = "他也经常说家乡话，我觉得太有趣了，我一定要学几句。",
                    pinyin = "tā yě jīng cháng shuō jiā xiāng huà wǒ jué de tài yǒu qù le wǒ yī dìng yào xué jǐ jù",
                    translation = "Dia juga sering berbicara dialek kampung halamannya, menurut saya sangat menarik, saya pasti akan belajar beberapa kalimat.",
                    tokens = listOf(
                        WordToken("他", "tā", "Dia (laki-laki)", "Kata ganti orang ketiga tunggal"),
                        WordToken("也", "yě", "Juga / Pun", "Partikel penanda kesamaan"),
                        WordToken("经常", "jīng cháng", "Frequently; constantly; regularly; often", "Kosakata HSK 2: 经常 (jīng cháng)"),
                        WordToken("说", "shuō", "Berbicara / Berkata", "Menyampaikan ucapan"),
                        WordToken("家乡", "jiā xiāng", "Kampung halaman", "Tempat asal kelahiran"),
                        WordToken("话", "huà", "Dialect", "Kosakata HSK 2: 话 (huà)"),
                        WordToken("我", "wǒ", "Saya", "Kata ganti orang pertama tunggal"),
                        WordToken("觉得", "jué de", "To think that ...; to feel that ...", "Kosakata HSK 2: 觉得 (jué de)"),
                        WordToken("太", "tài", "Terlalu", "Derajat melampaui batas"),
                        WordToken("有趣", "yǒu qù", "Interesting; fascinating; amusing", "Kosakata HSK 2: 有趣 (yǒu qù)"),
                        WordToken("了", "le", "Sudah (partikel perubahan situasi)", "Partikel aspek selesainya tindakan"),
                        WordToken("我", "wǒ", "Saya", "Kata ganti orang pertama tunggal"),
                        WordToken("一定", "yī dìng", "Surely; certainly; definitely", "Kosakata HSK 2: 一定 (yī dìng)"),
                        WordToken("要", "yào", "Mau / Akan / Harus", "Menyatakan niat atau keharusan"),
                        WordToken("学", "xué", "Belajar", "Menuntut ilmu"),
                        WordToken("几", "jǐ", "Several", "Kosakata HSK 2: 几 (jǐ)"),
                        WordToken("句", "jù", "Classifier for phrases or lines of verse", "Kosakata HSK 2: 句 (jù)")
                    )
                )
            ),
            questions = listOf(
                StoryQuestion(
                    id = "q_hometown_1",
                    questionText = "朋友的家乡和现在的城市有什么不同？ (Apa perbedaan kampung halaman teman dibanding kota saat ini?)",
                    options = listOf("很不一样，家乡更安静漂亮 (Sangat berbeda, kampung lebih tenang dan indah)", "完全一模一样 (Sama persis)", "家乡人更多 (Di kampung lebih banyak orang)", "家乡有更多高楼 (Di kampung lebih banyak gedung pencakar langit)"),
                    correctAnswerIndex = 0,
                    explanation = "Teks menceritakan bahwa kampung halamannya memiliki suasana sejuk dan asri."
                ),
                StoryQuestion(
                    id = "q_hometown_2",
                    questionText = "朋友想念家乡的什么？ (Apa yang dirindukan sang sahabat dari kampungnya?)",
                    options = listOf("大商场 (Mall besar)", "家乡的菜和家人 (Masakan khas kampung dan keluarga tercinta)", "上班的地铁 (Kereta MRT kerja)", "电影院 (Bioskop)"),
                    correctAnswerIndex = 1,
                    explanation = "Kehangatan keluarga dan kelezatan hidangan masakan rumah selalu dirindukan."
                ),
                StoryQuestion(
                    id = "q_hometown_3",
                    questionText = "作者觉得朋友离开家乡生活会怎样？ (Apa yang semula dikira penulis tentang temannya?)",
                    options = listOf("以为他会不开心 (Mengira temannya akan merasa tidak bahagia/kesepian)", "以为他很有钱 (Mengira temannya kaya raya)", "以为他天天去玩 (Mengira temannya bermain tiap hari)", "以为他不会说汉语 (Mengira temannya tidak bisa bahasa Mandarin)"),
                    correctAnswerIndex = 0,
                    explanation = "Teks menyatakan '我以为他会不开心，因为家人都不在这儿'."
                ),
                StoryQuestion(
                    id = "q_hometown_4",
                    questionText = "朋友是如何面对新城市生活的？ (Bagaimana sikap teman tersebut menghadapi kehidupan di kota baru?)",
                    options = listOf("积极适应并努力工作 (Menyesuaikan diri secara positif dan bekerja giat)", "天天抱怨 (Mengeluh setiap hari)", "马上回老家 (Langsung pulang kampung)", "不上班 (Tidak mau bekerja)"),
                    correctAnswerIndex = 0,
                    explanation = "Sang sahabat tetap bersemangat berkarya sambil menjaga cinta kasih untuk keluarganya di kampung."
                )
            )
        ),
        // Cerita Mandarin Bean 82 (HSK 2): I Have Been in China for Three Years (Sudah Tiga Tahun Saya di Tiongkok)
        Story(
            id = "story_been_in_china_three_years",
            titleHanzi = "我在中国三年了",
            titlePinyin = "Wǒ Zài Zhōngguó Sān Nián Le",
            titleTranslation = "I Have Been in China for Three Years (Sudah Tiga Tahun Saya di Tiongkok)",
            level = "HSK 2",
            category = "Pengalaman Hidup & Bahasa",
            description = "Kisah perjalanan dari pertama kali berwisata dan jatuh cinta pada kuliner hingga menetap dan bekerja di Tiongkok.",
            coverEmoji = "🇨🇳",
            coverImageRes = R.drawable.cover_story_been_in_china_three_years,
            estimatedReadMinutes = 2,
            sentences = listOf(
                Sentence(
                    id = "s_chinayears_1",
                    hanzi = "我来中国学习和工作三年了。",
                    pinyin = "wǒ lái Zhōng guó xué xí hé gōng zuò sān nián le",
                    translation = "Sudah tiga tahun saya datang ke Tiongkok untuk belajar dan bekerja.",
                    tokens = listOf(
                        WordToken("我", "wǒ", "Saya", "Kata ganti orang pertama tunggal"),
                        WordToken("来", "lái", "Datang", "Menuju ke arah pembicara"),
                        WordToken("中国", "Zhōng guó", "China / Tiongkok", "Negara Tiongkok"),
                        WordToken("学习", "xué xí", "Belajar / Studi", "Proses menuntut ilmu"),
                        WordToken("和", "hé", "Dan", "Kata hubung setara"),
                        WordToken("工作", "gōng zuò", "Bekerja", "Aktivitas mata pencaharian"),
                        WordToken("三", "sān", "Three", "Kosakata HSK 2: 三 (sān)"),
                        WordToken("年", "nián", "Tahun", "Satuan tahun"),
                        WordToken("了", "le", "Sudah (partikel perubahan situasi)", "Partikel aspek selesainya tindakan")
                    )
                ),
                Sentence(
                    id = "s_chinayears_2",
                    hanzi = "五年前，我第一次来中国旅游，爱上了这里吃的东西。",
                    pinyin = "wǔ nián qián wǒ dì yī cì lái Zhōng guó lǚ yóu ài shàng le zhè lǐ chī de dōng xi",
                    translation = "Lima tahun yang lalu, saya pertama kali berkunjung ke Tiongkok untuk berwisata, dan langsung jatuh cinta pada makanan di sini.",
                    tokens = listOf(
                        WordToken("五", "wǔ", "Five", "Kosakata HSK 2: 五 (wǔ)"),
                        WordToken("年", "nián", "Tahun", "Satuan tahun"),
                        WordToken("前", "qián", "Ago", "Kosakata HSK 2: 前 (qián)"),
                        WordToken("我", "wǒ", "Saya", "Kata ganti orang pertama tunggal"),
                        WordToken("第一", "dì yī", "First", "Kosakata HSK 2: 第一 (dì yī)"),
                        WordToken("次", "cì", "Classifier for enumerated events: time", "Kosakata HSK 2: 次 (cì)"),
                        WordToken("来", "lái", "Datang", "Menuju ke arah pembicara"),
                        WordToken("中国", "Zhōng guó", "China / Tiongkok", "Negara Tiongkok"),
                        WordToken("旅游", "lǚ yóu", "To travel", "Kosakata HSK 2: 旅游 (lǚ yóu)"),
                        WordToken("爱", "ài", "Mencintai / Cinta", "Perasaan kasih sayang mendalam"),
                        WordToken("上", "shàng", "(directional complement) up", "Kosakata HSK 2: 上 (shàng)"),
                        WordToken("了", "le", "Sudah (partikel perubahan situasi)", "Partikel aspek selesainya tindakan"),
                        WordToken("这里", "zhè lǐ", "Here", "Kosakata HSK 2: 这里 (zhè lǐ)"),
                        WordToken("吃", "chī", "Makan", "Aktivitas mengonsumsi makanan"),
                        WordToken("的", "de", "Punya / Yang (partikel posesif)", "Partikel penjelas modifikasi atau kepemilikan"),
                        WordToken("东西", "dōng xi", "Thing", "Kosakata HSK 2: 东西 (dōng xi)")
                    )
                ),
                Sentence(
                    id = "s_chinayears_3",
                    hanzi = "回国后，我开始在网上学习汉语，一开始自己学习，后来又在网上找了一位汉语老师帮助我。",
                    pinyin = "huí guó hòu wǒ kāi shǐ zài wǎng shang xué xí Hàn yǔ yī kāi shǐ zì jǐ xué xí hòu lái yòu zài wǎng shang zhǎo le yī wèi Hàn yǔ lǎo shī bāng zhù wǒ",
                    translation = "Setelah pulang ke negara asal, saya mulai belajar bahasa Mandarin di internet; awalnya belajar mandiri, kemudian mencari seorang guru bahasa Mandarin daring untuk membantu saya.",
                    tokens = listOf(
                        WordToken("回", "huí", "Kembali / Pulang", "Menuju ke tempat asal"),
                        WordToken("国", "guó", "Country; nation; state", "Kosakata HSK 2: 国 (guó)"),
                        WordToken("后", "hòu", "Afterwards", "Kosakata HSK 2: 后 (hòu)"),
                        WordToken("我", "wǒ", "Saya", "Kata ganti orang pertama tunggal"),
                        WordToken("开始", "kāi shǐ", "To begin", "Kosakata HSK 2: 开始 (kāi shǐ)"),
                        WordToken("在", "zài", "Di / Berada di", "Preposisi lokasi atau aspek progresif"),
                        WordToken("网上", "wǎng shang", "Online", "Kosakata HSK 2: 网上 (wǎng shang)"),
                        WordToken("学习", "xué xí", "Belajar / Studi", "Proses menuntut ilmu"),
                        WordToken("汉语", "Hàn yǔ", "Chinese language", "Kosakata HSK 2: 汉语 (Hàn yǔ)"),
                        WordToken("一", "yī", "As soon as", "Kosakata HSK 2: 一 (yī)"),
                        WordToken("开始", "kāi shǐ", "Beginning", "Kosakata HSK 2: 开始 (kāi shǐ)"),
                        WordToken("自己", "zì jǐ", "Oneself; (attributive) one&#x27;s own", "Kosakata HSK 2: 自己 (zì jǐ)"),
                        WordToken("学习", "xué xí", "Belajar / Studi", "Proses menuntut ilmu"),
                        WordToken("后来", "hòu lái", "Afterwards; later", "Kosakata HSK 2: 后来 (hòu lái)"),
                        WordToken("又", "yòu", "Lagi (telah terjadi)", "Pengulangan tindakan lampau"),
                        WordToken("在", "zài", "Di / Berada di", "Preposisi lokasi atau aspek progresif"),
                        WordToken("网上", "wǎng shang", "Online", "Kosakata HSK 2: 网上 (wǎng shang)"),
                        WordToken("找", "zhǎo", "To try to find", "Kosakata HSK 2: 找 (zhǎo)"),
                        WordToken("了", "le", "Sudah (partikel perubahan situasi)", "Partikel aspek selesainya tindakan"),
                        WordToken("一", "yī", "One", "Kosakata HSK 2: 一 (yī)"),
                        WordToken("位", "wèi", "Classifier for people (honorific)", "Kosakata HSK 2: 位 (wèi)"),
                        WordToken("汉语", "Hàn yǔ", "Chinese language", "Kosakata HSK 2: 汉语 (Hàn yǔ)"),
                        WordToken("老师", "lǎo shī", "Guru", "Tenaga pengajar"),
                        WordToken("帮助", "bāng zhù", "To help; to assist", "Kosakata HSK 2: 帮助 (bāng zhù)"),
                        WordToken("我", "wǒ", "Saya", "Kata ganti orang pertama tunggal")
                    )
                ),
                Sentence(
                    id = "s_chinayears_4",
                    hanzi = "我考过了HSK4级考试以后，就想来中国继续学习。",
                    pinyin = "wǒ kǎo guo le jí kǎo shì yǐ hòu jiù xiǎng lái Zhōng guó jì xù xué xí",
                    translation = "Setelah lulus ujian HSK level 4, saya ingin datang ke Tiongkok untuk melanjutkan belajar.",
                    tokens = listOf(
                        WordToken("我", "wǒ", "Saya", "Kata ganti orang pertama tunggal"),
                        WordToken("考", "kǎo", "To check", "Kosakata HSK 2: 考 (kǎo)"),
                        WordToken("过", "guo", "(experienced action marker)", "Kosakata HSK 2: 过 (guo)"),
                        WordToken("了", "le", "Sudah (partikel perubahan situasi)", "Partikel aspek selesainya tindakan"),
                        WordToken("级", "jí", "Level", "Kosakata HSK 2: 级 (jí)"),
                        WordToken("考试", "kǎo shì", "Exam", "Kosakata HSK 2: 考试 (kǎo shì)"),
                        WordToken("以后", "yǐ hòu", "After", "Kosakata HSK 2: 以后 (yǐ hòu)"),
                        WordToken("就", "jiù", "Langsung / Segera / Maka", "Menyatakan ketepatan waktu atau kelogisan"),
                        WordToken("想", "xiǎng", "Ingin / Berpikir / Rindu", "Keinginan atau pemikiran batin"),
                        WordToken("来", "lái", "Datang", "Menuju ke arah pembicara"),
                        WordToken("中国", "Zhōng guó", "China / Tiongkok", "Negara Tiongkok"),
                        WordToken("继续", "jì xù", "To continue; to proceed with; to go on with", "Kosakata HSK 2: 继续 (jì xù)"),
                        WordToken("学习", "xué xí", "Belajar / Studi", "Proses menuntut ilmu")
                    )
                ),
                Sentence(
                    id = "s_chinayears_5",
                    hanzi = "到了中国以后，我先在北京学习汉语，后来找到了上海的工作，就来上海生活了。",
                    pinyin = "dào le Zhōng guó yǐ hòu wǒ xiān zài Běi jīng xué xí Hàn yǔ hòu lái zhǎo dào le Shàng hǎi de gōng zuò jiù lái Shàng hǎi shēng huó le",
                    translation = "Setelah tiba di Tiongkok, mula-mula saya belajar bahasa Mandarin di Beijing, kemudian mendapatkan pekerjaan di Shanghai, lalu datang dan tinggal di Shanghai.",
                    tokens = listOf(
                        WordToken("到", "dào", "To reach; to arrive", "Kosakata HSK 2: 到 (dào)"),
                        WordToken("了", "le", "Sudah (partikel perubahan situasi)", "Partikel aspek selesainya tindakan"),
                        WordToken("中国", "Zhōng guó", "China / Tiongkok", "Negara Tiongkok"),
                        WordToken("以后", "yǐ hòu", "After", "Kosakata HSK 2: 以后 (yǐ hòu)"),
                        WordToken("我", "wǒ", "Saya", "Kata ganti orang pertama tunggal"),
                        WordToken("先", "xiān", "Beforehand; first; earlier", "Kosakata HSK 2: 先 (xiān)"),
                        WordToken("在", "zài", "Di / Berada di", "Preposisi lokasi atau aspek progresif"),
                        WordToken("北京", "Běi jīng", "Beijing municipality, capital of the people&#x27;s republic of china", "Kosakata HSK 2: 北京 (Běi jīng)"),
                        WordToken("学习", "xué xí", "Belajar / Studi", "Proses menuntut ilmu"),
                        WordToken("汉语", "Hàn yǔ", "Chinese language", "Kosakata HSK 2: 汉语 (Hàn yǔ)"),
                        WordToken("后来", "hòu lái", "Afterwards; later", "Kosakata HSK 2: 后来 (hòu lái)"),
                        WordToken("找", "zhǎo", "To try to find", "Kosakata HSK 2: 找 (zhǎo)"),
                        WordToken("到", "dào", "To reach; to arrive", "Kosakata HSK 2: 到 (dào)"),
                        WordToken("了", "le", "Sudah (partikel perubahan situasi)", "Partikel aspek selesainya tindakan"),
                        WordToken("上海", "Shàng hǎi", "Shanghai municipality", "Kosakata HSK 2: 上海 (Shàng hǎi)"),
                        WordToken("的", "de", "Punya / Yang (partikel posesif)", "Partikel penjelas modifikasi atau kepemilikan"),
                        WordToken("工作", "gōng zuò", "Bekerja", "Aktivitas mata pencaharian"),
                        WordToken("就", "jiù", "Langsung / Segera / Maka", "Menyatakan ketepatan waktu atau kelogisan"),
                        WordToken("来", "lái", "Datang", "Menuju ke arah pembicara"),
                        WordToken("上海", "Shàng hǎi", "Shanghai municipality", "Kosakata HSK 2: 上海 (Shàng hǎi)"),
                        WordToken("生活", "shēng huó", "To live", "Kosakata HSK 2: 生活 (shēng huó)"),
                        WordToken("了", "le", "Sudah (partikel perubahan situasi)", "Partikel aspek selesainya tindakan")
                    )
                ),
                Sentence(
                    id = "s_chinayears_6",
                    hanzi = "三年了，我越来越了解中国文化，也交了很多中国朋友。",
                    pinyin = "sān nián le wǒ yuè lái yuè liǎo jiě Zhōng guó wén huà yě jiāo le hěn duō Zhōng guó péng you",
                    translation = "Sudah tiga tahun berjalan, saya semakin memahami kebudayaan Tiongkok dan juga berteman dengan banyak orang Tiongkok.",
                    tokens = listOf(
                        WordToken("三", "sān", "Three", "Kosakata HSK 2: 三 (sān)"),
                        WordToken("年", "nián", "Tahun", "Satuan tahun"),
                        WordToken("了", "le", "Sudah (partikel perubahan situasi)", "Partikel aspek selesainya tindakan"),
                        WordToken("我", "wǒ", "Saya", "Kata ganti orang pertama tunggal"),
                        WordToken("越来越", "yuè lái yuè", "More and more", "Kosakata HSK 2: 越来越 (yuè lái yuè)"),
                        WordToken("了解", "liǎo jiě", "To understand", "Kosakata HSK 2: 了解 (liǎo jiě)"),
                        WordToken("中国", "Zhōng guó", "China / Tiongkok", "Negara Tiongkok"),
                        WordToken("文化", "wén huà", "Culture", "Kosakata HSK 2: 文化 (wén huà)"),
                        WordToken("也", "yě", "Juga / Pun", "Partikel penanda kesamaan"),
                        WordToken("交", "jiāo", "To make friends", "Kosakata HSK 2: 交 (jiāo)"),
                        WordToken("了", "le", "Sudah (partikel perubahan situasi)", "Partikel aspek selesainya tindakan"),
                        WordToken("很多", "hěn duō", "Many; a lot of", "Kosakata HSK 2: 很多 (hěn duō)"),
                        WordToken("中国", "Zhōng guó", "China / Tiongkok", "Negara Tiongkok"),
                        WordToken("朋友", "péng you", "Teman / Sahabat", "Orang dekat")
                    )
                ),
                Sentence(
                    id = "s_chinayears_7",
                    hanzi = "我想明年去广东工作。",
                    pinyin = "wǒ xiǎng míng nián qù Guǎng dōng gōng zuò",
                    translation = "Tahun depan saya ingin pergi bekerja ke Guangdong.",
                    tokens = listOf(
                        WordToken("我", "wǒ", "Saya", "Kata ganti orang pertama tunggal"),
                        WordToken("想", "xiǎng", "Ingin / Berpikir / Rindu", "Keinginan atau pemikiran batin"),
                        WordToken("明年", "míng nián", "Next year", "Kosakata HSK 2: 明年 (míng nián)"),
                        WordToken("去", "qù", "Pergi", "Berpindah tempat menjauhi pembicara"),
                        WordToken("广东", "Guǎng dōng", "Guangdong; a province in southern china.", "Kosakata HSK 2: 广东 (Guǎng dōng)"),
                        WordToken("工作", "gōng zuò", "Bekerja", "Aktivitas mata pencaharian")
                    )
                ),
                Sentence(
                    id = "s_chinayears_8",
                    hanzi = "广东是个暖和的地方，还有很多好吃的东西，我应该会很快乐。",
                    pinyin = "Guǎng dōng shì gè nuǎn huo de dì fang hái yǒu hěn duō hǎo chī de dōng xi wǒ yīng gāi huì hěn kuài lè",
                    translation = "Guangdong adalah tempat yang hangat dan banyak makanan lezat, saya pasti akan sangat bahagia di sana.",
                    tokens = listOf(
                        WordToken("广东", "Guǎng dōng", "Guangdong; a province in southern china.", "Kosakata HSK 2: 广东 (Guǎng dōng)"),
                        WordToken("是", "shì", "Adalah", "Kopula penjelas"),
                        WordToken("个", "gè", "Classifier for people or objects in general", "Kosakata HSK 2: 个 (gè)"),
                        WordToken("暖和", "nuǎn huo", "Warm", "Kosakata HSK 2: 暖和 (nuǎn huo)"),
                        WordToken("的", "de", "Punya / Yang (partikel posesif)", "Partikel penjelas modifikasi atau kepemilikan"),
                        WordToken("地方", "dì fang", "Place; location; area; space; territory", "Kosakata HSK 2: 地方 (dì fang)"),
                        WordToken("还", "hái", "Masih / Malahan", "Menyatakan kelanjutan situasi"),
                        WordToken("有", "yǒu", "Mempunyai / Ada", "Menyatakan kepemilikan atau eksistensi"),
                        WordToken("很多", "hěn duō", "Many; a lot of", "Kosakata HSK 2: 很多 (hěn duō)"),
                        WordToken("好吃", "hǎo chī", "Tasty; delicious", "Kosakata HSK 2: 好吃 (hǎo chī)"),
                        WordToken("的", "de", "Punya / Yang (partikel posesif)", "Partikel penjelas modifikasi atau kepemilikan"),
                        WordToken("东西", "dōng xi", "Thing", "Kosakata HSK 2: 东西 (dōng xi)"),
                        WordToken("我", "wǒ", "Saya", "Kata ganti orang pertama tunggal"),
                        WordToken("应该", "yīng gāi", "Ought to; should; must", "Kosakata HSK 2: 应该 (yīng gāi)"),
                        WordToken("会", "huì", "To be likely to; to be sure to", "Kosakata HSK 2: 会 (huì)"),
                        WordToken("很", "hěn", "Sangat", "Tingkat derajat"),
                        WordToken("快乐", "kuài lè", "Happy; joyful", "Kosakata HSK 2: 快乐 (kuài lè)")
                    )
                )
            ),
            questions = listOf(
                StoryQuestion(
                    id = "q_chinayears_1",
                    questionText = "作者第一次来中国是几年前？ (Berapa tahun lalu penulis pertama kali datang ke Tiongkok?)",
                    options = listOf("三年前 (3 tahun lalu)", "五年前 (5 tahun lalu)", "两年前 (2 tahun lalu)", "十年前 (10 tahun lalu)"),
                    correctAnswerIndex = 1,
                    explanation = "Teks menyatakan '五年前，我第一次来中国旅游'."
                ),
                StoryQuestion(
                    id = "q_chinayears_2",
                    questionText = "第一次来中国旅游时，作者爱上了什么？ (Saat pertama berwisata ke Tiongkok, apa yang disukai penulis?)",
                    options = listOf("这里的衣服 (Pakaian di sini)", "这里吃的东西 (Makanan kuliner di sini)", "这里的火车 (Kereta di sini)", "这里的手机 (Ponsel di sini)"),
                    correctAnswerIndex = 1,
                    explanation = "Teks menyebutkan '爱上了这里吃的东西' (Jatuh cinta pada hidangan makanannya)."
                ),
                StoryQuestion(
                    id = "q_chinayears_3",
                    questionText = "作者回国后是如何学习汉语的？ (Bagaimana penulis belajar bahasa Mandarin setelah pulang ke negerinya?)",
                    options = listOf("去大学上课 (Kuliah di kampus)", "开始在网上自学汉语 (Mulai belajar bahasa Mandarin secara mandiri lewat internet)", "请家教老师 (Memanggil guru les privat)", "看电影学习 (Belajar dari film)"),
                    correctAnswerIndex = 1,
                    explanation = "Penulis tekun belajar daring sebelum akhirnya kembali ke Tiongkok."
                ),
                StoryQuestion(
                    id = "q_chinayears_4",
                    questionText = "作者现在在中国做什么？ (Apa yang dilakukan penulis sekarang di Tiongkok?)",
                    options = listOf("只旅游 (Hanya jalan-jalan)", "学习和工作 (Belajar dan bekerja)", "开餐馆 (Membuka restoran)", "当司机 (Menjadi sopir)"),
                    correctAnswerIndex = 1,
                    explanation = "Teks menjelaskan '我来中国学习和工作三年了' (Belajar dan bekerja selama 3 tahun)."
                )
            )
        )
    )
}
