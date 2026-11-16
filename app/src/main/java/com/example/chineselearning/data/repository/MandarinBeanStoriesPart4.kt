package com.example.chineselearning.data.repository

import com.example.chineselearning.R
import com.example.chineselearning.data.model.Sentence
import com.example.chineselearning.data.model.Story
import com.example.chineselearning.data.model.StoryQuestion
import com.example.chineselearning.data.model.WordToken

val mandarinBeanStoriesPart4: List<Story> by lazy {
    listOf(
        // Cerita Mandarin Bean 56 (HSK 2): Visiting Sister (Menjenguk Kakak Perempuan)
        Story(
            id = "story_visiting_sister",
            titleHanzi = "看姐姐",
            titlePinyin = "Kàn Jiějie",
            titleTranslation = "Visiting Sister (Menjenguk Kakak Perempuan)",
            level = "HSK 2",
            category = "Keluarga & Perjalanan",
            description = "Perjalanan naik kereta ke Shanghai untuk mengunjungi kakak perempuan yang berprofesi sebagai dokter di rumah sakit.",
            coverEmoji = "👭",
            coverImageRes = R.drawable.cover_story_visiting_sister,
            estimatedReadMinutes = 2,
            sentences = listOf(
                Sentence(
                    "s_vissis_1",
                    "昨天天气很好，不冷也不热。",
                    "Zuótiān tiānqì hěn hǎo, bù lěng yě bú rè.",
                    "Kemarin cuacanya sangat bagus, tidak dingin juga tidak panas.",
                    listOf(
                        WordToken("昨天", "zuó tiān", "Kemarin", "Keterangan waktu"),
                        WordToken("天气", "tiān qì", "Cuaca", "Kondisi hawa"),
                        WordToken("很好", "hěn hǎo", "Sangat bagus", "Kondisi sejuk"),
                        WordToken("不冷", "bù lěng", "Tidak dingin", "Suhu nyaman"),
                        WordToken("也不热", "yě bú rè", "Juga tidak panas", "Suhu seimbang")
                    )
                ),
                Sentence(
                    "s_vissis_2",
                    "下午两点，我坐火车去上海看姐姐。",
                    "Xiàwǔ liǎng diǎn, wǒ zuò huǒchē qù Shànghǎi kàn jiějie.",
                    "Pukul 2 siang, saya naik kereta api pergi ke Shanghai menjenguk kakak perempuan.",
                    listOf(
                        WordToken("下午", "xià wǔ", "Siang / sore", "Waktu siang"),
                        WordToken("两点", "liǎng diǎn", "Pukul 2", "Waktu jam 2"),
                        WordToken("我", "wǒ", "Saya", "Pronomina"),
                        WordToken("坐火车", "zuò huǒ chē", "Naik kereta api", "Moda transportasi rel"),
                        WordToken("去", "qù", "Pergi ke", "Perjalanan menuju"),
                        WordToken("上海", "Shàng hǎi", "Shanghai", "Kota Shanghai"),
                        WordToken("看", "kàn", "Menjenguk / melihat", "Mengunjungi kerabat"),
                        WordToken("姐姐", "jiě jie", "Kakak perempuan", "Saudari tertua")
                    )
                ),
                Sentence(
                    "s_vissis_3",
                    "姐姐在上海的医院工作，她是一个医生。",
                    "Jiějie zài Shànghǎi de yīyuàn gōngzuò, tā shì yí gè yīshēng.",
                    "Kakak bekerja di sebuah rumah sakit di Shanghai, dia adalah seorang dokter.",
                    listOf(
                        WordToken("姐姐", "jiě jie", "Kakak perempuan", "Subjek"),
                        WordToken("在", "zài", "Di", "Preposisi lokasi"),
                        WordToken("上海的", "Shàng hǎi de", "Shanghai punya", "Lokasi rumah sakit"),
                        WordToken("医院", "yī yuàn", "Rumah sakit", "Tempat layanan medis"),
                        WordToken("工作", "gōng zuò", "Bekerja", "Aktivitas profesi"),
                        WordToken("她是", "tā shì", "Dia adalah", "Kopula penjelas"),
                        WordToken("一个", "yí gè", "Seorang", "Penggolong orang"),
                        WordToken("医生", "yī shēng", "Dokter", "Tenaga medis kesehatan")
                    )
                ),
                Sentence(
                    "s_vissis_4",
                    "我买了一些水果和面包。",
                    "Wǒ mǎi le yìxiē shuǐguǒ hé miànbāo.",
                    "Saya membeli beberapa buah-buahan dan roti.",
                    listOf(
                        WordToken("我", "wǒ", "Saya", "Pronomina"),
                        WordToken("买了一些", "mǎi le yì xiē", "Membeli beberapa", "Belanja oleh-oleh"),
                        WordToken("水果", "shuǐ guǒ", "Buah-buahan", "Buah tangan segar"),
                        WordToken("和", "hé", "Dan", "Kata hubung"),
                        WordToken("面包", "miàn bāo", "Roti", "Makanan pokok gandum")
                    )
                ),
                Sentence(
                    "s_vissis_5",
                    "姐姐看见我，非常高兴。",
                    "Jiějie kànjiàn wǒ, fēicháng gāoxìng.",
                    "Kakak melihat saya dan merasa sangat gembira.",
                    listOf(
                        WordToken("姐姐", "jiě jie", "Kakak", "Subjek"),
                        WordToken("看见我", "kàn jiàn wǒ", "Melihat saya", "Momen perjumpaan"),
                        WordToken("非常", "fēi cháng", "Sangat", "Intensitas rasa"),
                        WordToken("高兴", "gāo xìng", "Senang / gembira", "Ekspresi bahagia")
                    )
                ),
                Sentence(
                    "s_vissis_6",
                    "晚上，姐姐做饭。",
                    "Wǎnshang, jiějie zuò fàn.",
                    "Malam harinya, kakak memasak makanan.",
                    listOf(
                        WordToken("晚上", "wǎn shang", "Malam hari", "Waktu malam"),
                        WordToken("姐姐", "jiě jie", "Kakak", "Subjek"),
                        WordToken("做饭", "zuò fàn", "Memasak makanan", "Aktivitas masak")
                    )
                ),
                Sentence(
                    "s_vissis_7",
                    "我们吃米饭和鸡蛋，很好吃。",
                    "Wǒmen chī mǐfàn hé jīdàn, hěn hǎochī.",
                    "Kami makan nasi dan telur, enak sekali rasanya.",
                    listOf(
                        WordToken("我们", "wǒ men", "Kami", "Pronomina jamak"),
                        WordToken("吃", "chī", "Makan", "Aktivitas makan"),
                        WordToken("米饭", "mǐ fàn", "Nasi putih", "Makanan pokok"),
                        WordToken("和", "hé", "Dan", "Konjungsi"),
                        WordToken("鸡蛋", "jī dàn", "Telur ayam", "Lauk pauk bergizi"),
                        WordToken("很好吃", "hěn hǎo chī", "Sangat lezat", "Pujian rasa")
                    )
                ),
                Sentence(
                    "s_vissis_8",
                    "今天下雨，天气很冷。",
                    "Jīntiān xià yǔ, tiānqì hěn lěng.",
                    "Hari ini turun hujan, cuacanya sangat dingin.",
                    listOf(
                        WordToken("今天", "jīn tiān", "Hari ini", "Waktu sekarang"),
                        WordToken("下雨", "xià yǔ", "Turun hujan", "Hujan deras"),
                        WordToken("天气", "tiān qì", "Cuaca", "Hawa udara"),
                        WordToken("很冷", "hěn lěng", "Sangat dingin", "Suhu menggigil")
                    )
                ),
                Sentence(
                    "s_vissis_9",
                    "我们没有出去，就在房间里看电视、说话。",
                    "Wǒmen méiyǒu chūqù, jiù zài fángjiān lǐ kàn diànshì, shuōhuà.",
                    "Kami tidak keluar rumah, hanya menonton televisi dan mengobrol di dalam kamar.",
                    listOf(
                        WordToken("我们", "wǒ men", "Kami", "Subjek"),
                        WordToken("没有出去", "méi yǒu chū qù", "Tidak keluar", "Berada di dalam rumah"),
                        WordToken("就在", "jiù zài", "Langsung di", "Penegasan lokasi"),
                        WordToken("房间里", "fáng jiān lǐ", "Di dalam kamar", "Ruangan kamar hangat"),
                        WordToken("看电视", "kàn diàn shì", "Menonton TV", "Hiburan santai"),
                        WordToken("说话", "shuō huà", "Mengobrol / bercakap-cakap", "Bercengkerama akrab")
                    )
                ),
                Sentence(
                    "s_vissis_10",
                    "明天上午我坐火车回学校。",
                    "Míngtiān shàngwǔ wǒ zuò huǒchē huí xuéxiào.",
                    "Besok pagi saya naik kereta api kembali ke sekolah / kampus.",
                    listOf(
                        WordToken("明天", "míng tiān", "Besok", "Hari esok"),
                        WordToken("上午", "shàng wǔ", "Pagi menjelang siang", "Waktu pagi"),
                        WordToken("我", "wǒ", "Saya", "Subjek"),
                        WordToken("坐火车", "zuò huǒ chē", "Naik kereta api", "Transportasi rel"),
                        WordToken("回", "huí", "Kembali ke", "Arah pulang"),
                        WordToken("学校", "xué xiào", "Sekolah / kampus", "Tempat kuliah")
                    )
                )
            ),
            questions = listOf(
                StoryQuestion(
                    "q_vissis_1",
                    "我坐什么交通工具去上海看姐姐？(Naik transportasi apa saya pergi ke Shanghai menjenguk kakak?)",
                    listOf(
                        "飞机 (Pesawat)",
                        "火车 (Kereta api)",
                        "出租车 (Taksi)",
                        "自行车 (Sepeda)"
                    ),
                    1,
                    "Di kalimat ke-2: '下午两点，我坐火车去上海看姐姐'."
                ),
                StoryQuestion(
                    "q_vissis_2",
                    "姐姐在上海做什么工作？(Apa pekerjaan kakak perempuan di Shanghai?)",
                    listOf(
                        "老师 (Guru)",
                        "医生 (Dokter)",
                        "服务员 (Pelayan)",
                        "司机 (Supir)"
                    ),
                    1,
                    "Di kalimat ke-3: '姐姐在上海的医院工作，她是一个医生'."
                ),
                StoryQuestion(
                    "q_vissis_3",
                    "今天因为天气下雨很冷，他们做了什么？(Karena hari ini hujan dan dingin, apa yang mereka lakukan?)",
                    listOf(
                        "去商场买衣服 (Pergi ke mall)",
                        "在房间里看电视、说话 (Di dalam kamar menonton TV dan mengobrol)",
                        "去公园散步 (Jalan-jalan di taman)",
                        "去火车站 (Pergi ke stasiun)"
                    ),
                    1,
                    "Di kalimat ke-9: '我们没有出去，就在房间里看电视、说话'."
                ),
                StoryQuestion(
                    "q_vissis_4",
                    "我什么时候坐火车回学校？(Kapan saya naik kereta kembali ke sekolah?)",
                    listOf(
                        "今天晚上 (Malam ini)",
                        "明天上午 (Besok pagi)",
                        "昨天下午 (Kemarin sore)",
                        "下个星期 (Pekan depan)"
                    ),
                    1,
                    "Di kalimat ke-10: '明天上午我坐火车回学校'."
                )
            )
        ),

        // Cerita Mandarin Bean 57 (HSK 2): A Happy Day (Hari yang Menyenangkan)
        Story(
            id = "story_a_happy_day",
            titleHanzi = "高兴的一天",
            titlePinyin = "Gāoxìng de Yì Tiān",
            titleTranslation = "A Happy Day (Hari yang Menyenangkan)",
            level = "HSK 2",
            category = "Kehidupan Pelajar",
            description = "Dua mahasiswa sahabat di Tiongkok menikmati akhir pekan dengan berbelanja, nonton bioskop, dan memasak bersama.",
            coverEmoji = "🎉",
            coverImageRes = R.drawable.cover_story_a_happy_day,
            estimatedReadMinutes = 2,
            sentences = listOf(
                Sentence(
                    "s_hapday_1",
                    "我叫大伟，我是一个学生。",
                    "Wǒ jiào Dàwěi, wǒ shì yí gè xuésheng.",
                    "Nama saya Dawei, saya adalah seorang pelajar.",
                    listOf(
                        WordToken("我叫", "wǒ jiào", "Nama saya dipanggil", "Perkenalan nama"),
                        WordToken("大伟", "Dà wěi", "Dawei", "Nama tokoh David"),
                        WordToken("我是", "wǒ shì", "Saya adalah", "Kopula status"),
                        WordToken("一个", "yí gè", "Seorang", "Kuantitas tunggal"),
                        WordToken("学生", "xué sheng", "Pelajar / mahasiswa", "Status akademis")
                    )
                ),
                Sentence(
                    "s_hapday_2",
                    "现在我在中国学习汉语。",
                    "Xiànzài wǒ zài Zhōngguó xuéxí Hànyǔ.",
                    "Sekarang saya belajar bahasa Mandarin di Tiongkok.",
                    listOf(
                        WordToken("现在", "xiàn zài", "Sekarang", "Waktu kini"),
                        WordToken("我在", "wǒ zài", "Saya di", "Pronomina + lokasi"),
                        WordToken("中国", "Zhōng guó", "Tiongkok", "Negara studi"),
                        WordToken("学习", "xué xí", "Belajar", "Aktivitas belajar"),
                        WordToken("汉语", "Hàn yǔ", "Bahasa Mandarin", "Bahasa Tionghoa")
                    )
                ),
                Sentence(
                    "s_hapday_3",
                    "我有一个好朋友，他叫马丁。",
                    "Wǒ yǒu yí gè hǎo péngyou, tā jiào Mǎdīng.",
                    "Saya punya seorang teman baik, namanya Martin.",
                    listOf(
                        WordToken("我有一个", "wǒ yǒu yí gè", "Saya mempunyai seorang", "Kepemilikan sahabat"),
                        WordToken("好朋友", "hǎo péng you", "Teman baik / sahabat", "Sahabat karib"),
                        WordToken("他叫", "tā jiào", "Dia bernama", "Nama sahabat"),
                        WordToken("马丁", "Mǎ dīng", "Martin", "Nama sahabat Martin")
                    )
                ),
                Sentence(
                    "s_hapday_4",
                    "我们都是大学生，我们也都很喜欢中国。",
                    "Wǒmen dōu shì dàxuéshēng, wǒmen yě dōu hěn xǐhuan Zhōngguó.",
                    "Kami berdua adalah mahasiswa, kami berdua juga sangat menyukai Tiongkok.",
                    listOf(
                        WordToken("我们都是", "wǒ men dōu shì", "Kami berdua adalah", "Status bersama"),
                        WordToken("大学生", "dà xué shēng", "Mahasiswa perguruan tinggi", "Jenjang pendidikan"),
                        WordToken("我们也都很", "wǒ men yě dōu hěn", "Kami juga sama-sama sangat", "Kekompakan rasa"),
                        WordToken("喜欢", "xǐ huan", "Suka / gemar", "Perasaan positif"),
                        WordToken("中国", "Zhōng guó", "Tiongkok", "Negara yang disukai")
                    )
                ),
                Sentence(
                    "s_hapday_5",
                    "我们喜欢吃中国菜。",
                    "Wǒmen xǐhuan chī Zhōngguó cài.",
                    "Kami suka makan masakan Tiongkok.",
                    listOf(
                        WordToken("我们", "wǒ men", "Kami", "Subjek"),
                        WordToken("喜欢吃", "xǐ huan chī", "Suka makan", "Kegemaran kuliner"),
                        WordToken("中国菜", "Zhōng guó cài", "Masakan Tiongkok", "Kuliner lezat")
                    )
                ),
                Sentence(
                    "s_hapday_6",
                    "包子、饺子和面条都很好吃。",
                    "Bāozi, jiǎozi hé miàntiáo dōu hěn hǎochī.",
                    "Baozi, pangsit (jiaozi), dan mi semuanya sangat enak.",
                    listOf(
                        WordToken("包子", "bāo zi", "Baozi (roti kukus isi)", "Roti kukus"),
                        WordToken("饺子", "jiǎo zi", "Pangsit jiaozi", "Pangsit kukus"),
                        WordToken("和", "hé", "Dan", "Kata hubung"),
                        WordToken("面条", "miàn tiáo", "Mi", "Olahan mi"),
                        WordToken("都很好吃", "dōu hěn hǎo chī", "Semuanya sangat lezat", "Pujian rasa")
                    )
                ),
                Sentence(
                    "s_hapday_7",
                    "我们也喜欢喝中国茶。",
                    "Wǒmen yě xǐhuan hē Zhōngguó chá.",
                    "Kami juga suka minum teh Tiongkok.",
                    listOf(
                        WordToken("我们也", "wǒ men yě", "Kami juga", "Pronomina + partikel"),
                        WordToken("喜欢喝", "xǐ huan hē", "Suka minum", "Kegemaran minum"),
                        WordToken("中国茶", "Zhōng guó chá", "Teh Tiongkok", "Minuman teh aromatik")
                    )
                ),
                Sentence(
                    "s_hapday_8",
                    "今天星期六，我们都不上课。",
                    "Jīntiān xīngqīliù, wǒmen dōu bù shàngkè.",
                    "Hari ini hari Sabtu, kami semua tidak ada kelas perkuliahan.",
                    listOf(
                        WordToken("今天", "jīn tiān", "Hari ini", "Waktu"),
                        WordToken("星期六", "xīng qī liù", "Hari Sabtu", "Akhir pekan"),
                        WordToken("我们都", "wǒ men dōu", "Kami semua", "Subjek bersama"),
                        WordToken("不上课", "bù shàng kè", "Tidak masuk kelas / libur", "Hari libur kuliah")
                    )
                ),
                Sentence(
                    "s_hapday_9",
                    "上午十点，我们去商场买衣服。",
                    "Shàngwǔ shí diǎn, wǒmen qù shāngchǎng mǎi yīfu.",
                    "Pukul 10 pagi, kami pergi ke pusat perbelanjaan (mall) membeli pakaian.",
                    listOf(
                        WordToken("上午", "shàng wǔ", "Pagi menjelang siang", "Waktu pagi"),
                        WordToken("十点", "shí diǎn", "Pukul 10", "Jam 10 tepat"),
                        WordToken("我们去", "wǒ men qù", "Kami pergi ke", "Aktivitas bepergian"),
                        WordToken("商场", "shāng chǎng", "Pusat perbelanjaan / mall", "Tempat belanja"),
                        WordToken("买衣服", "mǎi yī fu", "Membeli pakaian", "Berbelanja baju")
                    )
                ),
                Sentence(
                    "s_hapday_10",
                    "下午我们去看电影。",
                    "Xiàwǔ wǒmen qù kàn diànyǐng.",
                    "Sore hari kami pergi menonton film bioskop.",
                    listOf(
                        WordToken("下午", "xià wǔ", "Sore hari", "Waktu sore"),
                        WordToken("我们去", "wǒ men qù", "Kami pergi", "Aktivitas rekreasi"),
                        WordToken("看电影", "kàn diàn yǐng", "Menonton film bioskop", "Hiburan sinema")
                    )
                ),
                Sentence(
                    "s_hapday_11",
                    "晚上我们自己做饭。",
                    "Wǎnshang wǒmen zìjǐ zuò fàn.",
                    "Malam harinya kami memasak makanan sendiri.",
                    listOf(
                        WordToken("晚上", "wǎn shang", "Malam hari", "Waktu malam"),
                        WordToken("我们自己", "wǒ men zì jǐ", "Kami sendiri", "Memasak mandiri"),
                        WordToken("做饭", "zuò fàn", "Memasak makanan", "Aktivitas masak di dapur")
                    )
                ),
                Sentence(
                    "s_hapday_12",
                    "今天我们非常高兴。",
                    "Jīntiān wǒmen fēicháng gāoxìng.",
                    "Hari ini kami merasa sangat gembira.",
                    listOf(
                        WordToken("今天", "jīn tiān", "Hari ini", "Hari menyenangkan"),
                        WordToken("我们", "wǒ men", "Kami", "Subjek"),
                        WordToken("非常", "fēi cháng", "Sangat", "Tingkat intensitas"),
                        WordToken("高兴", "gāo xìng", "Senang / gembira", "Ekspresi bahagia")
                    )
                )
            ),
            questions = listOf(
                StoryQuestion(
                    "q_hapday_1",
                    "大伟的好朋友叫什么名字？(Siapa nama sahabat baik Dawei?)",
                    listOf(
                        "李明 (Li Ming)",
                        "马丁 (Martin)",
                        "张伟 (Zhang Wei)",
                        "王磊 (Wang Lei)"
                    ),
                    1,
                    "Di kalimat ke-3: '我有一个好朋友，他叫马丁'."
                ),
                StoryQuestion(
                    "q_hapday_2",
                    "今天星期六上午十点，他们去了哪里？(Hari Sabtu jam 10 pagi, ke mana mereka pergi?)",
                    listOf(
                        "去图书馆看书 (Pergi ke perpustakaan)",
                        "去商场买衣服 (Pergi ke mall membeli pakaian)",
                        "去火车站 (Pergi ke stasiun)",
                        "去医院看医生 (Pergi ke rumah sakit)"
                    ),
                    1,
                    "Di kalimat ke-9: '上午十点，我们去商场买衣服'."
                ),
                StoryQuestion(
                    "q_hapday_3",
                    "下午他们安排了什么娱乐活动？(Aktivitas hiburan apa yang mereka lakukan di sore hari?)",
                    listOf(
                        "打篮球 (Bermain basket)",
                        "去看电影 (Menonton film bioskop)",
                        "游泳 (Berenang)",
                        "睡觉 (Tidur)"
                    ),
                    1,
                    "Di kalimat ke-10: '下午我们去看电影'."
                ),
                StoryQuestion(
                    "q_hapday_4",
                    "文章中提到了哪些他们觉得很好吃的中国食物？(Makanan Tiongkok apa saja yang mereka sebut sangat lezat?)",
                    listOf(
                        "西瓜和苹果 (Semangka dan apel)",
                        "包子、饺子和面条 (Baozi, jiaozi, dan mi)",
                        "咖啡和面包 (Kopi dan roti)",
                        "蛋糕和冰淇淋 (Kue dan es krim)"
                    ),
                    1,
                    "Di kalimat ke-6: '包子、饺子和面条都很好吃'."
                )
            )
        ),

        // Cerita Mandarin Bean 58 (HSK 2): Chinese Children Are Too Overweight (Anak-Anak di Tiongkok Terlalu Gemuk)
        Story(
            id = "story_chinese_children_overweight",
            titleHanzi = "中国孩子太胖了",
            titlePinyin = "Zhōngguó Háizi Tài Pàng Le",
            titleTranslation = "Chinese Children Are Too Overweight (Anak-Anak di Tiongkok Terlalu Gemuk)",
            level = "HSK 2",
            category = "Kesehatan & Gaya Hidup",
            description = "Ulasan edukatif mengenai fenomena obesitas anak di Tiongkok, penyebabnya, serta solusi hidup sehat dan berolahraga.",
            coverEmoji = "🏃",
            coverImageRes = R.drawable.cover_story_chinese_children_overweight,
            estimatedReadMinutes = 2,
            sentences = listOf(
                Sentence(
                    "s_childovw_1",
                    "现在，中国的孩子有点儿太胖了，男孩子比女孩子更胖。",
                    "Xiànzài, Zhōngguó de háizi yǒudiǎnr tài pàng le, nánháizi bǐ nǚháizi gèng pàng.",
                    "Saat ini, anak-anak di Tiongkok agak terlalu gemuk, anak laki-laki bahkan lebih gemuk daripada anak perempuan.",
                    listOf(
                        WordToken("现在", "xiàn zài", "Saat ini / sekarang", "Keterangan waktu kini"),
                        WordToken("中国的", "Zhōng guó de", "Tiongkok punya", "Konteks negara"),
                        WordToken("孩子", "hái zi", "Anak-anak", "Generasi anak-anak"),
                        WordToken("有点儿", "yǒu diǎn r", "Agak sedikit", "Keterangan tingkat"),
                        WordToken("太胖了", "tài pàng le", "Terlalu gemuk", "Kondisi kelebihan berat badan"),
                        WordToken("男孩子", "nán hái zi", "Anak laki-laki", "Kelompok pria muda"),
                        WordToken("比", "bǐ", "Dibandingkan", "Struktur komparasi"),
                        WordToken("女孩子", "nǚ hái zi", "Anak perempuan", "Kelompok wanita muda"),
                        WordToken("更胖", "gèng pàng", "Lebih gemuk lagi", "Tingkat komparasi lebih tinggi")
                    )
                ),
                Sentence(
                    "s_childovw_2",
                    "很多爸爸和妈妈觉得孩子胖一点儿是好事，因为胖看起来身体好。",
                    "Hěn duō bàba hé māma juéde háizi pàng yìdiǎnr shì hǎo shì, yīnwèi pàng kàn qǐlai shēntǐ hǎo.",
                    "Banyak ayah dan ibu merasa bahwa anak yang agak gemuk adalah hal yang baik, karena terlihat gemuk menandakan tubuh yang sehat.",
                    listOf(
                        WordToken("很多", "hěn duō", "Banyak", "Kuantitas jamak"),
                        WordToken("爸爸和妈妈", "bà ba hé mā ma", "Ayah dan ibu (orang tua)", "Persepsi orang tua"),
                        WordToken("觉得", "jué de", "Merasa / menganggap", "Pandangan persepsi"),
                        WordToken("孩子", "hái zi", "Anak", "Anak tercinta"),
                        WordToken("胖一点儿", "pàng yì diǎn r", "Lebih berisi / gemuk sedikit", "Kondisi fisik montok"),
                        WordToken("是好事", "shì hǎo shì", "Merupakan hal baik", "Penilaian positif"),
                        WordToken("因为", "yīn wèi", "Karena", "Konjungsi alasan"),
                        WordToken("胖", "pàng", "Gemuk", "Bentuk fisik berisi"),
                        WordToken("看起来", "kàn qǐ lai", "Terlihat / tampak dari luar", "Kesan visual"),
                        WordToken("身体好", "shēn tǐ hǎo", "Tubuh sehat bugar", "Kebugaran fisik")
                    )
                ),
                Sentence(
                    "s_childovw_3",
                    "但是，医生说，太胖了对身体不好。",
                    "Dànshì, yīshēng shuō, tài pàng le duì shēntǐ bù hǎo.",
                    "Tetapi dokter menyatakan bahwa terlalu gemuk itu tidak baik untuk kesehatan tubuh.",
                    listOf(
                        WordToken("但是", "dàn shì", "Namun / tetapi", "Konjungsi pertentangan"),
                        WordToken("医生", "yī shēng", "Dokter medis", "Tenaga ahli kesehatan"),
                        WordToken("说", "shuō", "Menyatakan / berkata", "Nasihat medis"),
                        WordToken("太胖了", "tài pàng le", "Terlalu gemuk / obesitas", "Kondisi berlebih"),
                        WordToken("对身体", "duì shēn tǐ", "Terhadap kesehatan tubuh", "Objek pengaruh kesehatan"),
                        WordToken("不好", "bù hǎo", "Tidak baik / berbahaya", "Efek negatif")
                    )
                ),
                Sentence(
                    "s_childovw_4",
                    "在一些地方，比如湖南，孩子吃了很多油，所以胖孩子很多。",
                    "Zài yìxiē dìfang, bǐrú Húnán, háizi chī le hěn duō yóu, suǒyǐ pàng háizi hěn duō.",
                    "Di beberapa daerah, seperti Hunan, anak-anak mengonsumsi banyak minyak, sehingga ada banyak anak yang gemuk.",
                    listOf(
                        WordToken("在一些", "zài yì xiē", "Di beberapa", "Preposisi lokasi jamak"),
                        WordToken("地方", "dì fang", "Tempat / daerah", "Kawasan wilayah"),
                        WordToken("比如", "bǐ rú", "Contohnya seperti", "Penjelasan contoh"),
                        WordToken("湖南", "Hú nán", "Provinsi Hunan", "Daerah kuliner berminyak"),
                        WordToken("孩子", "hái zi", "Anak-anak", "Generasi muda"),
                        WordToken("吃了很多", "chī le hěn duō", "Mengonsumsi banyak", "Asupan berlebih"),
                        WordToken("油", "yóu", "Minyak goreng / lemak", "Zat lemak makanan"),
                        WordToken("所以", "suǒ yǐ", "Oleh karena itu", "Konjungsi konsekuensi"),
                        WordToken("胖孩子", "pàng hái zi", "Anak-anak bertubuh gemuk", "Kondisi anak"),
                        WordToken("很多", "hěn duō", "Sangat banyak", "Jumlah prevalensi tinggi")
                    )
                ),
                Sentence(
                    "s_childovw_5",
                    "为什么孩子会变胖？",
                    "Wèi shénme háizi huì biàn pàng?",
                    "Mengapa anak-anak bisa menjadi gemuk?",
                    listOf(
                        WordToken("为什么", "wèi shénme", "Mengapa / apa alasannya", "Pertanyaan kausalitas"),
                        WordToken("孩子", "hái zi", "Anak-anak", "Subjek"),
                        WordToken("会变胖", "huì biàn pàng", "Bisa menjadi gemuk", "Perubahan berat badan")
                    )
                ),
                Sentence(
                    "s_childovw_6",
                    "第一，孩子吃饭太快，吃得太多。",
                    "Dì-yī, háizi chīfàn tài kuài, chī de tài duō.",
                    "Pertama, anak-anak makan terlalu cepat dan porsinya terlalu banyak.",
                    listOf(
                        WordToken("第一", "dì yī", "Faktor pertama", "Poin nomor satu"),
                        WordToken("孩子", "hái zi", "Anak", "Subjek"),
                        WordToken("吃饭太快", "chī fàn tài kuài", "Makan tergesa-gesa / terlalu cepat", "Kebiasaan makan buruk"),
                        WordToken("吃得太多", "chī de tài duō", "Makan terlalu berlebihan", "Porsi berlebih")
                    )
                ),
                Sentence(
                    "s_childovw_7",
                    "第二，很多孩子喜欢玩手机，不喜欢运动。",
                    "Dì-èr, hěn duō háizi xǐhuan wán shǒujī, bù xǐhuan yùndòng.",
                    "Kedua, banyak anak suka bermain ponsel (gadget) dan tidak suka berolahraga.",
                    listOf(
                        WordToken("第二", "dì èr", "Faktor kedua", "Poin nomor dua"),
                        WordToken("很多孩子", "hěn duō hái zi", "Banyak anak-anak", "Populasi anak"),
                        WordToken("喜欢", "xǐ huan", "Gemar / suka", "Preferensi"),
                        WordToken("玩手机", "wán shǒu jī", "Bermain ponsel / gadget", "Gaya hidup pasif"),
                        WordToken("不喜欢", "bù xǐ huan", "Tidak suka", "Keengganan"),
                        WordToken("运动", "yùn dòng", "Berolahraga gerak fisik", "Aktivitas fisik penting")
                    )
                ),
                Sentence(
                    "s_childovw_8",
                    "第三，如果爸爸妈妈很胖，孩子也可能很胖。",
                    "Dì-sān, rúguǒ bàba māma hěn pàng, háizi yě kěnéng hěn pàng.",
                    "Ketiga, jika ayah dan ibu sangat gemuk, anak juga berpotensi gemuk karena faktor genetik.",
                    listOf(
                        WordToken("第三", "dì sān", "Faktor ketiga", "Poin nomor tiga"),
                        WordToken("如果", "rú guǒ", "Jika / seandainya", "Kondisi pengandaian"),
                        WordToken("爸爸妈妈", "bà ba mā ma", "Ayah dan ibu", "Orang tua"),
                        WordToken("很胖", "hěn pàng", "Sangat gemuk", "Kondisi fisik orang tua"),
                        WordToken("孩子", "hái zi", "Anak", "Generasi keturunan"),
                        WordToken("也可能", "yě kě néng", "Juga berkemungkinan besar", "Peluang genetik"),
                        WordToken("很胖", "hěn pàng", "Sangat gemuk", "Potensi obesitas")
                    )
                ),
                Sentence(
                    "s_childovw_9",
                    "太胖了会让人生病。",
                    "Tài pàng le huì ràng rén shēngbìng.",
                    "Terlalu gemuk dapat menyebabkan orang jatuh sakit.",
                    listOf(
                        WordToken("太胖了", "tài pàng le", "Kelebihan berat badan ekstrem", "Kondisi obesitas"),
                        WordToken("会让人", "huì ràng rén", "Bisa menyebabkan orang", "Penyebab dampak"),
                        WordToken("生病", "shēng bìng", "Jatuh sakit / terserang penyakit", "Gangguan kesehatan")
                    )
                ),
                Sentence(
                    "s_childovw_10",
                    "大家要多运动，多吃水果和菜，慢慢地吃饭。",
                    "Dàjiā yào duō yùndòng, duō chī shuǐguǒ hé cài, mànmàn de chīfàn.",
                    "Setiap orang perlu lebih banyak berolahraga, banyak makan buah dan sayur, serta makan dengan perlahan.",
                    listOf(
                        WordToken("大家", "dà jiā", "Semua orang", "Ajakan bersama"),
                        WordToken("要多运动", "yào duō yùn dòng", "Harus lebih banyak berolahraga", "Solusi kebugaran"),
                        WordToken("多吃", "duō chī", "Memperbanyak makan", "Asupan serat sehat"),
                        WordToken("水果和菜", "shuǐ guǒ hé cài", "Buah-buahan dan sayuran", "Makanan bergizi seimbang"),
                        WordToken("慢慢地", "màn màn de", "Dengan perlahan-lahan", "Cara mengunyah sehat"),
                        WordToken("吃饭", "chī fàn", "Makan makanan", "Kebiasaan makan baik")
                    )
                )
            ),
            questions = listOf(
                StoryQuestion(
                    "q_childovw_1",
                    "为什么有些父母一开始觉得孩子胖一点是好事？(Mengapa sebagian orang tua awalnya menganggap anak gemuk adalah hal baik?)",
                    listOf(
                        "因为省钱 (Hemat biaya)",
                        "因为看起来身体好 (Karena tampak montok dan berbadan sehat)",
                        "因为不用穿衣服 (Tidak perlu beli baju)",
                        "因为孩子喜欢 (Anak suka)"
                    ),
                    1,
                    "Di kalimat ke-2: '因为胖看起来身体好'."
                ),
                StoryQuestion(
                    "q_childovw_2",
                    "医生对于太胖有什么警告？(Apa peringatan dokter mengenai obesitas?)",
                    listOf(
                        "太胖了对身体不好，会让人生病 (Terlalu gemuk tidak baik untuk tubuh dan bisa menimbulkan penyakit)",
                        "太胖了会飞 (Bisa terbang)",
                        "太胖了不用睡觉 (Tidak perlu tidur)",
                        "太胖了会变高 (Bisa makin tinggi)"
                    ),
                    0,
                    "Di kalimat ke-3 & 9: '医生说，太胖了对身体不好。太胖了会让人生病'."
                ),
                StoryQuestion(
                    "q_childovw_3",
                    "文章中列举的孩子变胖的第二个原因是什么？(Apa penyebab kedua anak menjadi gemuk dalam artikel?)",
                    listOf(
                        "爱去图书馆 (Suka ke perpustakaan)",
                        "喜欢玩手机，不喜欢运动 (Suka main ponsel dan tidak suka olahraga)",
                        "爱做作业 (Suka kerjakan PR)",
                        "爱喝热茶 (Suka minum teh hangat)"
                    ),
                    1,
                    "Di kalimat ke-7: '第二，很多孩子喜欢玩手机，不喜欢运动'."
                ),
                StoryQuestion(
                    "q_childovw_4",
                    "文章在结尾给出了什么保持健康的建议？(Saran kesehatan apa yang diberikan di akhir bacaan?)",
                    listOf(
                        "只喝可乐 (Hanya minum kola)",
                        "多运动，多吃水果和菜，慢慢地吃饭 (Banyak olahraga, perbanyak makan buah & sayur, serta makan perlahan)",
                        "每天玩电脑 (Main komputer setiap hari)",
                        "不吃早饭 (Tidak sarapan)"
                    ),
                    1,
                    "Di kalimat ke-10: '大家要多运动，多吃水果和菜，慢慢地吃饭'."
                )
            )
        ),

        // Cerita Mandarin Bean 59 (HSK 2): Swimming Lesson (Les Renang)
        Story(
            id = "story_swimming_lesson",
            titleHanzi = "游泳课",
            titlePinyin = "Yóuyǒng Kè",
            titleTranslation = "Swimming Lesson (Les Renang)",
            level = "Fun, HSK 2",
            category = "Humor & Olahraga",
            description = "Cerita kocak tentang seorang anak laki-laki yang baru 30 menit les renang sudah ingin berhenti karena terlalu banyak menelan air kolam.",
            coverEmoji = "🏊",
            coverImageRes = R.drawable.cover_story_swimming_lesson,
            estimatedReadMinutes = 2,
            sentences = listOf(
                Sentence(
                    "s_swim_1",
                    "儿子第一次去上游泳课，上了三十分钟，他就对老师说：“老师，我今天不想游泳了。”",
                    "Érzi dì-yī cì qù shàng yóuyǒng kè, shàng le sānshí fēnzhōng, tā jiù duì lǎoshī shuō: “Lǎoshī, wǒ jīntiān bù xiǎng yóuyǒng le.”",
                    "Sang anak pertama kali pergi mengikuti les renang, setelah berlatih selama 30 menit, dia langsung berkata pada guru: “Pak guru, hari ini saya tidak mau berenang lagi.”",
                    listOf(
                        WordToken("儿子", "ér zi", "Anak laki-laki", "Subjek anak"),
                        WordToken("第一次去", "dì yī cì qù", "Pertama kali pergi ke", "Pengalaman perdana"),
                        WordToken("上游泳课", "shàng yóu yǒng kè", "Mengikuti les pelajaran berenang", "Aktivitas les olahraga"),
                        WordToken("上了", "shàng le", "Telah berjalan selama", "Aspek durasi waktu"),
                        WordToken("三十分钟", "sān shí fēn zhōng", "Tiga puluh menit", "Durasi 30 menit"),
                        WordToken("他就对", "tā jiù duì", "Dia lantas kepada", "Tindakan spontan mengadu"),
                        WordToken("老师说", "lǎo shī shuō", "Guru berkata / menyapa guru", "Percakapan kepada pelatih"),
                        WordToken("老师", "lǎo shī", "Pak guru pelatih", "Panggilan guru"),
                        WordToken("我今天", "wǒ jīn tiān", "Saya hari ini", "Pronomina + keterangan hari"),
                        WordToken("不想", "bù xiǎng", "Tidak ingin / enggan", "Penolakan halus"),
                        WordToken("游泳了", "yóu yǒng le", "Berenang lagi", "Aktivitas di dalam air")
                    )
                ),
                Sentence(
                    "s_swim_2",
                    "老师问：“为什么呢？”",
                    "Lǎoshī wèn: “Wèi shénme ne?”",
                    "Guru pun bertanya: “Mengapa begitu?”",
                    listOf(
                        WordToken("老师问", "lǎo shī wèn", "Guru bertanya", "Pertanyaan rasa penasaran"),
                        WordToken("为什么呢", "wèi shénme ne", "Kenapa begitu ya?", "Pertanyaan alasan")
                    )
                ),
                Sentence(
                    "s_swim_3",
                    "儿子说：“我真的不想再喝水了，今天喝得太多了。”",
                    "Érzi shuō: “Wǒ zhēnde bù xiǎng zài hē shuǐ le, jīntiān hē de tài duō le.”",
                    "Sang anak menjawab: “Saya sungguh tidak mau minum air lagi, hari ini sudah terlalu banyak minum air kolam!”",
                    listOf(
                        WordToken("儿子说", "ér zi shuō", "Anak menjawab", "Pernyataan anak jujur"),
                        WordToken("我真的", "wǒ zhēn de", "Saya sungguh-sungguh", "Penegasan kejujuran"),
                        WordToken("不想", "bù xiǎng", "Tidak ingin", "Keengganan"),
                        WordToken("再喝水了", "zài hē shuǐ le", "Minum air lagi", "Kekenyangan tertelan air kolam"),
                        WordToken("今天", "jīn tiān", "Hari ini", "Keterangan waktu"),
                        WordToken("喝得太多了", "hē de tài duō le", "Minum terlalu banyak sekali", "Puncak humor tersedak air renang")
                    )
                )
            ),
            questions = listOf(
                StoryQuestion(
                    "q_swim_1",
                    "儿子上游泳课坚持了多长时间就想放弃？(Berapa lama sang anak bertahan dalam les renang sebelum ingin berhenti?)",
                    listOf(
                        "十分钟 (10 menit)",
                        "三十分钟 (30 menit)",
                        "两个小时 (2 jam)",
                        "一整天 (Seharian)"
                    ),
                    1,
                    "Di kalimat pertama: '上了三十分钟，他就对老师说：老师，我今天不想游泳了'."
                ),
                StoryQuestion(
                    "q_swim_2",
                    "儿子不想继续游泳的真实搞笑原因是什么？(Apa alasan lucu yang sebenarnya mengapa anak itu tidak mau berenang lagi?)",
                    listOf(
                        "水太冷了 (Airnya terlalu dingin)",
                        "游泳池里喝水喝得太多了 (Terlalu banyak menelan air kolam renang)",
                        "肚子很饿想吃汉堡 (Lapar ingin burger)",
                        "老师太凶了 (Gurunya galak)"
                    ),
                    1,
                    "Puncak humor di kalimat ke-3: '我真的不想再喝水了，今天喝得太多了'."
                ),
                StoryQuestion(
                    "q_swim_3",
                    "“儿子第一次去上游泳课”中的“第一次”是什么意思？(Apa arti kata '第一次' dalam kalimat tersebut?)",
                    listOf(
                        "Terakhir kali",
                        "Pertama kali",
                        "Setiap hari",
                        "Kadang-kadang"
                    ),
                    1,
                    "'第一次' (dì-yī cì) berarti pertama kali melakukan suatu aktivitas."
                ),
                StoryQuestion(
                    "q_swim_4",
                    "这个幽默故事描绘了初学游泳者常常遇到的什么真实尴尬？(Humor ini menggambarkan situasi canggung apa yang dialami pemula saat les renang?)",
                    listOf(
                        "Baju renang robek",
                        "Belum mahir bernapas sehingga sering tak sengaja tersedak dan terminum air kolam",
                        "Kacamata renang hilang",
                        "Kaki kram kaku"
                    ),
                    1,
                    "Pemula yang belajar mengapung dan meluncur sering kali tidak sengaja menelan banyak air kolam renang."
                )
            )
        ),

        // Cerita Mandarin Bean 60 (HSK 2): How Old Is Your Dad? (Berapa Umur Ayahmu?)
        Story(
            id = "story_how_old_is_dad",
            titleHanzi = "爸爸多少岁？",
            titlePinyin = "Bàba Duōshao Suì?",
            titleTranslation = "How Old Is Your Dad? (Berapa Umur Ayahmu?)",
            level = "Fun, HSK 2",
            category = "Humor & Keluarga",
            description = "Logika polos anak kecil bernama Xiaoming yang mengira ayahnya baru berumur 7 tahun karena baru resmi menjadi 'ayah' saat dirinya lahir.",
            coverEmoji = "🧒",
            coverImageRes = R.drawable.cover_story_how_old_is_dad,
            estimatedReadMinutes = 2,
            sentences = listOf(
                Sentence(
                    "s_howolddad_1",
                    "老师问小明：“你爸爸今年多少岁？”",
                    "Lǎoshī wèn Xiǎomíng: “Nǐ bàba jīnnián duōshao suì?”",
                    "Guru bertanya kepada Xiaoming: “Berapa umur ayahmu tahun ini?”",
                    listOf(
                        WordToken("老师问", "lǎo shī wèn", "Guru bertanya", "Pertanyaan di kelas"),
                        WordToken("小明", "Xiǎo míng", "Xiaoming", "Nama murid jenius ceria"),
                        WordToken("你爸爸", "nǐ bà ba", "Ayahmu", "Sosok orang tua"),
                        WordToken("今年", "jīn nián", "Tahun ini", "Keterangan waktu tahun kini"),
                        WordToken("多少岁", "duō shao suì", "Berapa umur / usianya?", "Pertanyaan menanyakan umur")
                    )
                ),
                Sentence(
                    "s_howolddad_2",
                    "小明说：“和我一样大，他今年七岁。”",
                    "Xiǎomíng shuō: “Hé wǒ yíyàng dà, tā jīnnián qī suì.”",
                    "Xiaoming menjawab: “Sebaya dengan saya, beliau tahun ini berumur 7 tahun.”",
                    listOf(
                        WordToken("小明说", "Xiǎo míng shuō", "Xiaoming menjawab", "Jawaban polos Xiaoming"),
                        WordToken("和我一样大", "hé wǒ yí yàng dà", "Sebaya / seumuran dengan saya", "Pola komparasi kesetaraan"),
                        WordToken("他今年", "tā jīn nián", "Beliau tahun ini", "Subjek ayah"),
                        WordToken("七岁", "qī suì", "Tujuh tahun", "Umur tujuh tahun")
                    )
                ),
                Sentence(
                    "s_howolddad_3",
                    "老师问：“为什么？”",
                    "Lǎoshī wèn: “Wèi shénme?”",
                    "Guru heran dan bertanya: “Mengapa begitu?”",
                    listOf(
                        WordToken("老师问", "lǎo shī wèn", "Guru bertanya heran", "Pertanyaan guru penasaran"),
                        WordToken("为什么", "wèi shénme", "Mengapa / kenapa?", "Pertanyaan klarifikasi")
                    )
                ),
                Sentence(
                    "s_howolddad_4",
                    "小明说：“因为他在我出生的那一天，才变成爸爸的呀！”",
                    "Xiǎomíng shuō: “Yīnwèi tā zài wǒ chūshēng de nà yì tiān, cái biànchéng bàba de ya!”",
                    "Xiaoming berkata: “Karena beliau kan baru berubah menjadi seorang ayah tepat pada hari ketika saya dilahirkan!”",
                    listOf(
                        WordToken("小明说", "Xiǎo míng shuō", "Xiaoming berkata", "Penjelasan logika polos"),
                        WordToken("因为他在", "yīn wèi tā zài", "Karena beliau pada saat", "Konjungsi alasan"),
                        WordToken("我出生", "wǒ chū shēng", "Saya lahir ke dunia", "Peristiwa kelahiran"),
                        WordToken("的那一天", "de nà yì tiān", "Pada hari itu", "Waktu persis kejadian"),
                        WordToken("才变成", "cái biàn chéng", "Baru kemudian berubah status menjadi", "Perubahan peran"),
                        WordToken("爸爸的呀", "bà ba de ya", "Sebagai seorang ayah lho!", "Penegasan status ayah")
                    )
                )
            ),
            questions = listOf(
                StoryQuestion(
                    "q_howolddad_1",
                    "老师向小明提出了什么问题？(Pertanyaan apa yang diajukan guru kepada Xiaoming?)",
                    listOf(
                        "小明几岁 (Berapa umur Xiaoming)",
                        "小明的爸爸今年多少岁 (Berapa usia ayah Xiaoming tahun ini)",
                        "小明的妈妈叫什么名字 (Nama ibu)",
                        "小明家住哪里 (Alamat rumah)"
                    ),
                    1,
                    "Di kalimat pertama: '老师问小明：你爸爸今年多少岁？'."
                ),
                StoryQuestion(
                    "q_howolddad_2",
                    "小明说他的爸爸今年几岁？(Berapa umur ayah yang dijawab oleh Xiaoming?)",
                    listOf(
                        "三十岁 (30 tahun)",
                        "七岁 (7 tahun)",
                        "四十岁 (40 tahun)",
                        "五十岁 (50 tahun)"
                    ),
                    1,
                    "Di kalimat ke-2: '小明说：和我一样大，他今年七岁'."
                ),
                StoryQuestion(
                    "q_howolddad_3",
                    "小明认为爸爸只有7岁的搞笑逻辑是什么？(Apa logika lucu Xiaoming menganggap ayahnya baru berusia 7 tahun?)",
                    listOf(
                        "Ayah suka main kelereng",
                        "Karena sang ayah baru resmi berubah status menjadi 'ayah' sejak hari Xiaoming dilahirkan ke dunia!",
                        "Ayah lupa umur sendiri",
                        "Ayah masih bersekolah SD"
                    ),
                    1,
                    "Puncak kelucuan anak-anak: '因为他在我出生的那一天，才变成爸爸的呀！'."
                ),
                StoryQuestion(
                    "q_howolddad_4",
                    "由小明的回答可以推算出小明自己今年多大？(Dari jawaban Xiaoming, berapakah umur Xiaoming sendiri?)",
                    listOf(
                        "5岁",
                        "7岁",
                        "10岁",
                        "12岁"
                    ),
                    1,
                    "Xiaoming berkata: '和我一样大，他今年七岁' (Sebaya dengan saya, beliau 7 tahun). Berarti Xiaoming sendiri berumur 7 tahun."
                )
            )
        ),

        // Cerita Mandarin Bean 61 (HSK 2): Ice Cream (Es Krim)
        Story(
            id = "story_ice_cream",
            titleHanzi = "冰淇淋",
            titlePinyin = "Bīngqílín",
            titleTranslation = "Ice Cream (Es Krim)",
            level = "Fun, HSK 2",
            category = "Humor & Makanan",
            description = "Ibu menyuruh anaknya yang gemar makan untuk mengucapkan sopan santun setelah diberi es krim oleh nenek tetangga, namun jawabannya mengejutkan.",
            coverEmoji = "🍦",
            coverImageRes = R.drawable.cover_story_ice_cream,
            estimatedReadMinutes = 2,
            sentences = listOf(
                Sentence(
                    "s_icecrm_1",
                    "妈妈和儿子见到邻居奶奶。",
                    "Māma hé érzi jiàndào línjū nǎinai.",
                    "Ibu dan anak laki-lakinya berpapasan dengan nenek tetangga sebelah.",
                    listOf(
                        WordToken("妈妈和儿子", "mā ma hé ér zi", "Ibu dan anak laki-lakinya", "Subjek keluarga"),
                        WordToken("见到", "jiàn dào", "Bertemu / berpapasan", "Momen perjumpaan"),
                        WordToken("邻居", "lín jū", "Tetangga sekitar", "Orang terdekat rumah"),
                        WordToken("奶奶", "nǎi nai", "Nenek", "Panggilan hormat wanita lansia")
                    )
                ),
                Sentence(
                    "s_icecrm_2",
                    "奶奶喜欢这个胖孩子，就送了一个冰淇淋给他。",
                    "Nǎinai xǐhuan zhè gè pàng háizi, jiù sòng le yí gè bīngqílín gěi tā.",
                    "Nenek sangat menyukai anak montok ini, lalu menghadiahkan sebuah es krim kepadanya.",
                    listOf(
                        WordToken("奶奶", "nǎi nai", "Nenek tetangga", "Pemberi hadiah"),
                        WordToken("喜欢", "xǐ huan", "Menyukai / gemas", "Rasa sayang"),
                        WordToken("这个", "zhè gè", "Ini", "Kata penunjuk"),
                        WordToken("胖孩子", "pàng hái zi", "Anak gemuk montok", "Karakteristik fisik anak"),
                        WordToken("就送了一个", "jiù sòng le yí gè", "Lantas menghadiahkan sebuah", "Kebaikan spontan"),
                        WordToken("冰淇淋", "bīng qí lín", "Es krim manis dingin", "Camilan manis"),
                        WordToken("给他", "gěi tā", "Kepadanya", "Penerima hadiah es krim")
                    )
                ),
                Sentence(
                    "s_icecrm_3",
                    "妈妈对儿子说：“奶奶送给你冰淇淋，你应该说什么？”",
                    "Māma duì érzi shuō: “Nǎinai sòng gěi nǐ bīngqílín, nǐ yīnggāi shuō shénme?”",
                    "Ibu menasihati putranya: “Nenek memberimu es krim, seharusnya kamu bilang apa?”",
                    listOf(
                        WordToken("妈妈对儿子说", "mā ma duì ér zi shuō", "Ibu menasihati anak", "Pengajaran etika sopan santun"),
                        WordToken("奶奶送给你", "nǎi nai sòng gěi nǐ", "Nenek menghadiahkan padamu", "Pemberian orang"),
                        WordToken("冰淇淋", "bīng qí lín", "Es krim", "Objek pemberian"),
                        WordToken("你应该", "nǐ yīng gāi", "Kamu seharusnya", "Kewajiban etika"),
                        WordToken("说", "shuō", "Mengucapkan", "Kata tutur"),
                        WordToken("什么", "shén me", "Apa?", "Pertanyaan etika")
                    )
                ),
                Sentence(
                    "s_icecrm_4",
                    "儿子看着奶奶问：“还有吗？”",
                    "Érzi kàn zhe nǎinai wèn: “Hái yǒu ma?”",
                    "Sang anak menatap nenek dan bertanya: “Apakah masih ada lagi?”",
                    listOf(
                        WordToken("儿子", "ér zi", "Anak laki-laki", "Subjek anak"),
                        WordToken("看着奶奶", "kàn zhe nǎi nai", "Menatap ke arah nenek", "Kontak mata polos"),
                        WordToken("问", "wèn", "Bertanya", "Pertanyaan spontan"),
                        WordToken("还有吗", "hái yǒu ma", "Masih adakah lagi?", "Puncak humor rakus polos")
                    )
                )
            ),
            questions = listOf(
                StoryQuestion(
                    "q_icecrm_1",
                    "邻居奶奶为什么送给儿子一个冰淇淋？(Mengapa nenek tetangga memberi es krim kepada anak itu?)",
                    listOf(
                        "因为他是班长 (Karena ketua kelas)",
                        "因为奶奶喜欢这个胖孩子 (Karena nenek gemas dan menyukai anak montok ini)",
                        "因为他帮奶奶拿东西 (Membantu bawa barang)",
                        "因为今天是奶奶生日 (Ulang tahun nenek)"
                    ),
                    1,
                    "Di kalimat ke-2: '奶奶喜欢这个胖孩子，就送了一个冰淇淋给他'."
                ),
                StoryQuestion(
                    "q_icecrm_2",
                    "妈妈原本期望儿子对奶奶说什么礼貌用语？(Kata sopan apa yang sebenarnya diharapkan ibu untuk diucapkan anaknya?)",
                    listOf(
                        "对不起 (Maaf)",
                        "谢谢奶奶 (Terima kasih, Nenek)",
                        "再见 (Sampai jumpa)",
                        "请进 (Silakan masuk)"
                    ),
                    1,
                    "Ibu mengajarkan etika sopan santun untuk mengucapkan '谢谢' (Terima kasih) saat menerima pemberian."
                ),
                StoryQuestion(
                    "q_icecrm_3",
                    "儿子看着奶奶，居然问出了什么让人哭笑不得的话？(Apa pertanyaan mengejutkan dan mengocok perut yang justru ditanyakan anak itu?)",
                    listOf(
                        "多少钱一个？ (Berapa harganya?)",
                        "还有吗？ (Masih adakah es krim lagi?)",
                        "这个好吃吗？ (Enak tidak?)",
                        "我可以回家吗？ (Boleh pulang?)"
                    ),
                    1,
                    "Puncak komedi di kalimat ke-4: '儿子看着奶奶问：还有吗？'."
                ),
                StoryQuestion(
                    "q_icecrm_4",
                    "这个故事生动展现了小孩子面对美食时的什么心理？(Cerita ini menggambarkan psikologi anak seperti apa saat berhadapan dengan makanan enak?)",
                    listOf(
                        "Malas makan",
                        "Kepolosan dan keinginan tak tertahan untuk meminta porsi tambahan tanpa memikirkan basa-basi",
                        "Takut gemuk",
                        "Ingin menjual kembali es krim"
                    ),
                    1,
                    "Kepolosan anak-anak yang belum mengerti basa-basi sosial dan hanya fokus pada kelezatan es krim."
                )
            )
        ),

        // Cerita Mandarin Bean 62 (HSK 2): Stop Talking (Jangan Mengobrol Terus!)
        Story(
            id = "story_stop_talking",
            titleHanzi = "别说话了",
            titlePinyin = "Bié Shuōhuà Le",
            titleTranslation = "Stop Talking (Jangan Mengobrol Terus!)",
            level = "Fun, HSK 2",
            category = "Humor & Sekolah",
            description = "Dua siswa yang berisik di kelas ditegur oleh guru yang kesal, namun siswa membalas dengan alasan yang bikin guru tak bisa berkata-kata.",
            coverEmoji = "🤫",
            coverImageRes = R.drawable.cover_story_stop_talking,
            estimatedReadMinutes = 2,
            sentences = listOf(
                Sentence(
                    "s_stoptalk_1",
                    "老师在上课，两个学生在说话，老师对他们说：“别说话了！”",
                    "Lǎoshī zài shàngkè, liǎng gè xuésheng zài shuōhuà, lǎoshī duì tāmen shuō: “Bié shuōhuà le!”",
                    "Guru sedang mengajar di kelas, dua orang siswa asyik mengobrol, guru pun menegur mereka: “Jangan mengobrol lagi!”",
                    listOf(
                        WordToken("老师", "lǎo shī", "Guru", "Pendidik di kelas"),
                        WordToken("在上课", "zài shàng kè", "Sedang mengajar pelajaran", "Aktivitas belajar-mengajar"),
                        WordToken("两个学生", "liǎng gè xué sheng", "Dua orang siswa", "Pelaku keributan"),
                        WordToken("在说话", "zài shuō huà", "Sedang mengobrol / bercakap-cakap", "Mengganggu suasana kelas"),
                        WordToken("老师", "lǎo shī", "Guru", "Subjek penegur"),
                        WordToken("对他们说", "duì tā men shuō", "Berkata kepada mereka", "Teguran langsung"),
                        WordToken("别说话了", "bié shuō huà le", "Jangan berbicara lagi!", "Perintah larangan tegas")
                    )
                ),
                Sentence(
                    "s_stoptalk_2",
                    "但是过了一会儿，他们又开始说，老师有点儿生气：“来，你们上来说，我下去听。”",
                    "Dànshì guò le yíhuìr, tāmen yòu kāishǐ shuō, lǎoshī yǒudiǎnr shēngqì: “Lái, nǐmen shànglái shuō, wǒ xiàqu tīng.”",
                    "Tetapi selang sebentar kemudian, mereka mulai mengobrol lagi, guru mulai kesal: “Ayo, kalian berdua maju ke depan podium untuk bicara, biar saya yang duduk di bawah mendengarkan!”",
                    listOf(
                        WordToken("但是", "dàn shì", "Tetapi", "Konjungsi pertentangan"),
                        WordToken("过了一会儿", "guò le yí huì r", "Selang beberapa saat kemudian", "Jeda waktu singkat"),
                        WordToken("他们", "tā men", "Mereka berdua", "Siswa bandel"),
                        WordToken("又开始说", "yòu kāi shǐ shuō", "Mulai mengobrol lagi", "Perilaku berulang"),
                        WordToken("老师", "lǎo shī", "Guru", "Subjek"),
                        WordToken("有点儿生气", "yǒu diǎn r shēng qì", "Agak marah / kesal", "Emosi kejengkelan guru"),
                        WordToken("来", "lái", "Ayo mari", "Seruan tantangan"),
                        WordToken("你们上来", "nǐ men shàng lái", "Kalian naik ke depan podium", "Perintah maju ke depan"),
                        WordToken("说", "shuō", "Bicara", "Berbicara di depan kelas"),
                        WordToken("我下去", "wǒ xià qu", "Biar saya yang turun ke bangku bawah", "Tindakan guru"),
                        WordToken("听", "tīng", "Mendengarkan", "Menjadi pendengar")
                    )
                ),
                Sentence(
                    "s_stoptalk_3",
                    "学生：“但我们不是老师。”",
                    "Xuésheng: “Dàn wǒmen bú shì lǎoshī.”",
                    "Siswa menyahut: “Tetapi kami kan bukan guru.”",
                    listOf(
                        WordToken("学生", "xué sheng", "Siswa", "Panggilan siswa"),
                        WordToken("但我们", "dàn wǒ men", "Tetapi kami", "Alasan bantahan"),
                        WordToken("不是", "bú shì", "Bukanlah", "Negasi kopula"),
                        WordToken("老师", "lǎo shī", "Guru", "Peran pengajar")
                    )
                ),
                Sentence(
                    "s_stoptalk_4",
                    "老师说：“不是老师，你们为什么一直说话？”",
                    "Lǎoshī shuō: “Bú shì lǎoshī, nǐmen wèi shénme yìzhí shuōhuà?”",
                    "Guru mendesak: “Kalau bukan guru, lantas kenapa kalian dari tadi terus berbicara tanpa henti?”",
                    listOf(
                        WordToken("老师说", "lǎo shī shuō", "Guru membalas", "Pertanyaan desakan guru"),
                        WordToken("不是老师", "bú shì lǎoshī", "Bukan guru", "Pengulangan alasan murid"),
                        WordToken("你们", "nǐ men", "Kalian", "Pronomina jamak"),
                        WordToken("为什么", "wèi shénme", "Mengapa / kenapa?", "Pertanyaan alasan"),
                        WordToken("一直说话", "yì zhí shuō huà", "Terus berbicara tiada henti", "Tindakan cerewet berisik")
                    )
                ),
                Sentence(
                    "s_stoptalk_5",
                    "学生说：“所以我们在下面说。”",
                    "Xuésheng shuō: “Suǒyǐ wǒmen zài xiàmiàn shuō.”",
                    "Siswa menjawab: “Makanya dari tadi kami bicaranya di bawah (di bangku), bukan di atas podium!”",
                    listOf(
                        WordToken("学生说", "xué sheng shuō", "Siswa menjawab", "Jawaban kocak murid"),
                        WordToken("所以我们在", "suǒ yǐ wǒ men zài", "Oleh karena itu kami di", "Konjungsi alasan konyol"),
                        WordToken("下面说", "xià miàn shuō", "Berbicara di bangku bawah", "Puncak pembalikan logika guru")
                    )
                )
            ),
            questions = listOf(
                StoryQuestion(
                    "q_stoptalk_1",
                    "老师上课时，那两个学生在做什么不听话的事？(Apa yang dilakukan kedua murid tidak patuh saat guru mengajar?)",
                    listOf(
                        "在睡觉 (Tidur)",
                        "在一直说话 (Terus mengobrol)",
                        "在吃零食 (Makan camilan)",
                        "在画画 (Menggambar)"
                    ),
                    1,
                    "Di kalimat pertama: '老师在上课，两个学生在说话'."
                ),
                StoryQuestion(
                    "q_stoptalk_2",
                    "老师生气时对两个学生说了什么反讽的话？(Kalimat sindiran apa yang diucapkan guru saat mulai kesal?)",
                    listOf(
                        "出去罚站 (Keluar dihukum berdiri)",
                        "来，你们上来说，我下去听 (Ayo, kalian maju ke depan bicara, biar saya duduk di bawah mendengarkan)",
                        "把作业交上来 (Kumpulkan PR)",
                        "请家长来学校 (Panggil orang tua)"
                    ),
                    1,
                    "Di kalimat ke-2: '老师有点儿生气：来，你们上来说，我下去听'."
                ),
                StoryQuestion(
                    "q_stoptalk_3",
                    "学生最后如何机智又搞笑地解释自己在下面说话？(Bagaimana murid membalas dengan cerdik dan kocak?)",
                    listOf(
                        "Karena takut gelap",
                        "Karena mereka bukan guru, makanya mereka tidak bicara di depan podium melainkan di bangku bawah!",
                        "Karena guru menyuruhnya",
                        "Karena suara mereka kecil"
                    ),
                    1,
                    "Puncak humor di kalimat ke-5: '所以我们在下面说' (Makanya kami bicaranya di bangku bawah, bukan di podium atas!)."
                ),
                StoryQuestion(
                    "q_stoptalk_4",
                    "故事中的生词“生气”是什么意思？(Apa arti kosakata '生气' dalam cerita?)",
                    listOf(
                        "Gembira",
                        "Marah / kesal",
                        "Lelah",
                        "Kenyang"
                    ),
                    1,
                    "'生气' (shēngqì) berarti marah, dongkol, atau kesal."
                )
            )
        ),

        // Cerita Mandarin Bean 63 (HSK 2): Lantern Festival (Festival Lampion)
        Story(
            id = "story_lantern_festival",
            titleHanzi = "元宵节",
            titlePinyin = "Yuánxiāojié",
            titleTranslation = "Lantern Festival (Festival Lampion)",
            level = "HSK 2",
            category = "Budaya & Tradisi",
            description = "Perayaan malam bulan purnama penutup rangkaian Imlek dengan menikmati ronde yuanxiao manis dan parade ribuan lampion merah indah.",
            coverEmoji = "🏮",
            coverImageRes = R.drawable.cover_story_lantern_festival,
            estimatedReadMinutes = 2,
            sentences = listOf(
                Sentence(
                    "s_lanfest_1",
                    "元宵节是一个中国节日。",
                    "Yuánxiāojié shì yí gè Zhōngguó jiérì.",
                    "Festival Lampion (Yuanxiao Jie) adalah salah satu hari raya tradisional Tiongkok.",
                    listOf(
                        WordToken("元宵节", "Yuán xiāo jié", "Festival Lampion (Yuan Xiao)", "Perayaan lampion 15 bulan 1 Imlek"),
                        WordToken("是一个", "shì yí gè", "Adalah sebuah", "Kopula"),
                        WordToken("中国节日", "Zhōng guó jié rì", "Hari raya festival Tiongkok", "Warisan budaya Tiongkok")
                    )
                ),
                Sentence(
                    "s_lanfest_2",
                    "意思是春节过完了，春天要来了。",
                    "Yìsi shì Chūnjié guò wán le, chūntiān yào lái le.",
                    "Maknanya menandai bahwa Festival Musim Semi (Imlek) telah selesai dirayakan, dan musim semi segera tiba.",
                    listOf(
                        WordToken("意思是", "yì si shì", "Artinya / maknanya adalah", "Penjelasan makna filosofis"),
                        WordToken("春节", "Chūn jié", "Festival Musim Semi (Tahun Baru Imlek)", "Perayaan Imlek utama"),
                        WordToken("过完了", "guò wán le", "Telah usai berlalu", "Berakhirnya masa perayaan"),
                        WordToken("春天", "chūn tiān", "Musim semi", "Musim mekar dan hangat"),
                        WordToken("要来了", "yào lái le", "Akan segera tiba", "Waktu yang segera hadir")
                    )
                ),
                Sentence(
                    "s_lanfest_3",
                    "在这一天，家人会在一起吃元宵。",
                    "Zài zhè yì tiān, jiārén huì zài yìqǐ chī yuánxiāo.",
                    "Pada hari ini, segenap anggota keluarga akan berkumpul bersama menyantap kue bola ronde (yuanxiao).",
                    listOf(
                        WordToken("在这一天", "zài zhè yì tiān", "Pada hari raya ini", "Waktu perayaan"),
                        WordToken("家人", "jiā rén", "Anggota keluarga", "Keluarga tercinta"),
                        WordToken("会在一起", "huì zài yì qǐ", "Akan bersama-sama berkumpul", "Kebersamaan hangat"),
                        WordToken("吃元宵", "chī yuán xiāo", "Memakan bola ketan ronde yuanxiao", "Tradisi santapan khas")
                    )
                ),
                Sentence(
                    "s_lanfest_4",
                    "元宵是白色的，圆圆的，非常好吃。",
                    "Yuánxiāo shì báisè de, yuányuán de, fēicháng hǎochī.",
                    "Yuanxiao berwarna putih, bulat-bulat bentuknya, dan sangat lezat manis rasanya.",
                    listOf(
                        WordToken("元宵是", "yuán xiāo shì", "Yuanxiao adalah", "Subjek makanan ketan"),
                        WordToken("白色的", "bái sè de", "Berwarna putih bersih", "Warna ketan beras"),
                        WordToken("圆圆的", "yuán yuán de", "Bulat-bulat mungil", "Bentuk bundar perlambang keutuhan"),
                        WordToken("非常好吃", "fēi cháng hǎo chī", "Sangat amat lezat", "Cita rasa manis gurih")
                    )
                ),
                Sentence(
                    "s_lanfest_5",
                    "晚上外面很漂亮，可以看到很多红色的灯笼。",
                    "Wǎnshang wàimiàn hěn piàoliang, kěyǐ kàndào hěn duō hóngsè de dēnglong.",
                    "Di malam hari suasana di luar sangat indah, orang-orang dapat menyaksikan begitu banyak lampion berwarna merah.",
                    listOf(
                        WordToken("晚上", "wǎn shang", "Malam hari", "Suasana malam"),
                        WordToken("外面", "wài miàn", "Di luar ruangan / jalan raya", "Pemandangan jalanan"),
                        WordToken("很漂亮", "hěn piào liang", "Sangat cantik mempesona", "Estetika malam"),
                        WordToken("可以看到", "kě yǐ kàn dào", "Dapat menyaksikan", "Pemandangan visual"),
                        WordToken("很多", "hěn duō", "Banyak sekali", "Jumlah melimpah"),
                        WordToken("红色的", "hóng sè de", "Berwarna merah terang", "Warna pembawa hoki"),
                        WordToken("灯笼", "dēng long", "Lampion lentera", "Dekorasi festival lampion")
                    )
                ),
                Sentence(
                    "s_lanfest_6",
                    "月亮也很大、很圆。",
                    "Yuèliang yě hěn dà, hěn yuán.",
                    "Bulan purnama di langit juga tampak sangat besar dan bulat sempurna.",
                    listOf(
                        WordToken("月亮", "yuè liang", "Bulan purnama di langit", "Bulan ke-15"),
                        WordToken("也很大", "yě hěn dà", "Juga sangat besar", "Ukuran bulan purnama"),
                        WordToken("很圆", "hěn yuán", "Sangat bundar bulat", "Simbol kebersamaan utuh")
                    )
                ),
                Sentence(
                    "s_lanfest_7",
                    "我们会去外面看灯笼和月亮，大家一起说话、笑，非常快乐。",
                    "Wǒmen huì qù wàimiàn kàn dēnglong hé yuèliang, dàjiā yìqǐ shuōhuà, xiào, fēicháng kuàilè.",
                    "Kami sekeluarga akan berjalan ke luar menikmati lampion dan bulan purnama, semua orang saling bercengkerama, tertawa, dan merasa sangat bahagia.",
                    listOf(
                        WordToken("我们会", "wǒ men huì", "Kami akan", "Aktivitas keluarga"),
                        WordToken("去外面", "qù wài miàn", "Pergi ke luar rumah", "Jalan-jalan malam"),
                        WordToken("看灯笼", "kàn dēng long", "Menikmati pemandangan lampion", "Wisata budaya lampion"),
                        WordToken("和月亮", "hé yuè liang", "Dan bulan purnama", "Menikmati indahnya rembulan"),
                        WordToken("大家一起", "dà jiā yì qǐ", "Semua orang bersama-sama", "Suasana guyub rukun"),
                        WordToken("说话", "shuō huà", "Mengobrol akrab", "Bercakap-cakap"),
                        WordToken("笑", "xiào", "Tertawa riang", "Tawa gembira"),
                        WordToken("非常快乐", "fēi cháng kuài lè", "Sangat bahagia penuh sukacita", "Ekspresi sukacita perayaan")
                    )
                ),
                Sentence(
                    "s_lanfest_8",
                    "我非常喜欢元宵节！",
                    "Wǒ fēicháng xǐhuan Yuánxiāojié!",
                    "Saya sungguh sangat menyukai Festival Lampion!",
                    listOf(
                        WordToken("我非常", "wǒ fēi cháng", "Saya amat sangat", "Tingkat kecintaan"),
                        WordToken("喜欢", "xǐ huan", "Suka / menggemari", "Perasaan antusias"),
                        WordToken("元宵节", "Yuán xiāo jié", "Festival Lampion", "Festival favorit")
                    )
                )
            ),
            questions = listOf(
                StoryQuestion(
                    "q_lanfest_1",
                    "元宵节象征着什么季节的到来？(Festival Lampion menandai tibanya musim apa?)",
                    listOf(
                        "冬天 (Musim dingin)",
                        "春天 (Musim semi)",
                        "夏天 (Musim panas)",
                        "秋天 (Musim gugur)"
                    ),
                    1,
                    "Di kalimat ke-2: '意思是春节过完了，春天要来了' (Musim semi segera tiba)."
                ),
                StoryQuestion(
                    "q_lanfest_2",
                    "在元宵节这一天，家人聚在一起吃什么传统美食？(Makanan tradisional apa yang disantap bersama keluarga di Festival Lampion?)",
                    listOf(
                        "粽子 (Bacang)",
                        "月饼 (Kue bulan)",
                        "元宵 (Bola ketan ronde yuanxiao)",
                        "烤鸭 (Bebek panggang)"
                    ),
                    2,
                    "Di kalimat ke-3: '在这一天，家人会在一起吃元宵'."
                ),
                StoryQuestion(
                    "q_lanfest_3",
                    "文章中描写元宵的外形和颜色是怎样的？(Bagaimana teks mendeskripsikan bentuk dan warna yuanxiao?)",
                    listOf(
                        "黑色的，长长的 (Hitam dan panjang)",
                        "白色的，圆圆的 (Putih dan bulat)",
                        "红色的，方方的 (Merah dan kotak)",
                        "黄色的，扁扁的 (Kuning dan pipih)"
                    ),
                    1,
                    "Di kalimat ke-4: '元宵是白色的，圆圆的，非常好吃'."
                ),
                StoryQuestion(
                    "q_lanfest_4",
                    "晚上大家去外面散步时会观赏什么景致？(Pemandangan apa yang dinikmati orang-orang saat berjalan keluar di malam hari?)",
                    listOf(
                        "红色的灯笼和圆圆的月亮 (Lampion merah dan bulan bulat purnama)",
                        "太阳和白云 (Matahari dan awan)",
                        "大海和游船 (Laut dan kapal)",
                        "雪花 (Salju)"
                    ),
                    0,
                    "Di kalimat ke-5 & 7: '可以看到很多红色的灯笼。月亮也很大、很圆。我们会去外面看灯笼和月亮'."
                )
            )
        ),

        // Cerita Mandarin Bean 64 (HSK 2): Spring Festival (Tahun Baru Imlek)
        Story(
            id = "story_spring_festival",
            titleHanzi = "春节",
            titlePinyin = "Chūnjié",
            titleTranslation = "Spring Festival (Tahun Baru Imlek)",
            level = "HSK 2",
            category = "Budaya & Tradisi",
            description = "Perayaan hari raya terbesar dan terpenting di Tiongkok: belanja makanan lezat, baju baru merah, reuni keluarga, dan bagi-bagi angpao.",
            coverEmoji = "🧧",
            coverImageRes = R.drawable.cover_story_spring_festival,
            estimatedReadMinutes = 2,
            sentences = listOf(
                Sentence(
                    "s_sprfest_1",
                    "二零二六年二月十七日是春节。",
                    "Èr líng èr liù nián èr yuè shíqī rì shì Chūnjié.",
                    "Tanggal 17 Februari 2026 adalah Tahun Baru Imlek.",
                    listOf(
                        WordToken("二零二六年", "èr líng èr liù nián", "Tahun 2026", "Tahun 2026"),
                        WordToken("二月十七日", "èr yuè shí qī rì", "17 Februari", "Tanggal 17 Feb"),
                        WordToken("是", "shì", "Adalah", "Kopula"),
                        WordToken("春节", "Chūn jié", "Festival Musim Semi (Imlek)", "Hari raya Imlek")
                    )
                ),
                Sentence(
                    "s_sprfest_2",
                    "这是新年的第一天，也是中国最大的节日。",
                    "Zhè shì xīnnián de dì-yī tiān, yě shì Zhōngguó zuì dà de jiérì.",
                    "Ini adalah hari pertama tahun baru, dan juga merupakan festival terbesar di Tiongkok.",
                    listOf(
                        WordToken("这是", "zhè shì", "Ini adalah", "Penjelasan status"),
                        WordToken("新年的", "xīn nián de", "Tahun baru punya", "Tahun baru"),
                        WordToken("第一天", "dì yī tiān", "Hari pertama", "Awal tahun"),
                        WordToken("也是", "yě shì", "Juga adalah", "Kopula"),
                        WordToken("中国", "Zhōng guó", "Tiongkok", "Negara"),
                        WordToken("最大的", "zuì dà de", "Yang paling besar / agung", "Skala terbesar"),
                        WordToken("节日", "jié rì", "Hari raya / festival", "Perayaan nasional")
                    )
                ),
                Sentence(
                    "s_sprfest_3",
                    "在这一天，天气很冷，但是大家都很高兴。",
                    "Zài zhè yì tiān, tiānqì hěn lěng, dànshì dàjiā dōu hěn gāoxìng.",
                    "Pada hari ini, cuaca sangat dingin, namun semua orang merasa sangat gembira.",
                    listOf(
                        WordToken("在这一天", "zài zhè yì tiān", "Pada hari ini", "Waktu perayaan"),
                        WordToken("天气很冷", "tiān qì hěn lěng", "Cuaca sangat dingin", "Musim dingin"),
                        WordToken("但是", "dàn shì", "Tetapi", "Konjungsi"),
                        WordToken("大家都很", "dà jiā dōu hěn", "Semua orang sama-sama sangat", "Kekompakan suasana"),
                        WordToken("高兴", "gāo xìng", "Senang / bahagia", "Ekspresi gembira")
                    )
                ),
                Sentence(
                    "s_sprfest_4",
                    "我们会买很多东西：有鱼、有肉、有水果，还有新衣服。",
                    "Wǒmen huì mǎi hěn duō dōngxi: yǒu yú, yǒu ròu, yǒu shuǐguǒ, hái yǒu xīn yīfu.",
                    "Kami akan berbelanja banyak barang: ada ikan, ada daging, ada buah-buahan, dan juga ada baju baru.",
                    listOf(
                        WordToken("我们会买", "wǒ men huì mǎi", "Kami akan berbelanja", "Aktivitas belanja persiapan"),
                        WordToken("很多东西", "hěn duō dōng xi", "Banyak sekali barang", "Keperluan melimpah"),
                        WordToken("有鱼", "yǒu yú", "Ada ikan", "Ikan simbol kemakmuran"),
                        WordToken("有肉", "yǒu ròu", "Ada aneka daging", "Hidangan lezat"),
                        WordToken("有水果", "yǒu shuǐ guǒ", "Ada buah-buahan", "Buah segar"),
                        WordToken("还有", "hái yǒu", "Dan juga masih ada", "Tambahan"),
                        WordToken("新衣服", "xīn yī fu", "Pakaian baju baru", "Baju baru perayaan")
                    )
                ),
                Sentence(
                    "s_sprfest_5",
                    "家人们会在一起吃饭，有很多好吃的东西。",
                    "Jiārénmen huì zài yìqǐ chīfàn, yǒu hěn duō hǎochī de dōngxi.",
                    "Segenap anggota keluarga akan berkumpul makan bersama, ada banyak makanan lezat tersaji.",
                    listOf(
                        WordToken("家人们", "jiā rén men", "Segenap anggota keluarga", "Keluarga besar"),
                        WordToken("会在一起", "huì zài yì qǐ", "Akan bersama-sama", "Reuni keluarga"),
                        WordToken("吃饭", "chī fàn", "Makan bersama", "Santap malam tahun baru"),
                        WordToken("有很多", "yǒu hěn duō", "Ada banyak sekali", "Kelimpahan"),
                        WordToken("好吃的东西", "hǎo chī de dōng xi", "Makanan lezat enak", "Hidangan istimewa")
                    )
                ),
                Sentence(
                    "s_sprfest_6",
                    "大家一起说话、吃东西、喝茶、看电视。",
                    "Dàjiā yìqǐ shuōhuà, chī dōngxi, hē chá, kàn diànshì.",
                    "Semua orang mengobrol, makan camilan, minum teh hangat, dan menonton televisi bersama.",
                    listOf(
                        WordToken("大家一起", "dà jiā yì qǐ", "Semua orang bersama", "Kebersamaan"),
                        WordToken("说话", "shuō huà", "Mengobrol", "Bercengkerama"),
                        WordToken("吃东西", "chī dōng xi", "Makan makanan", "Menikmati hidangan"),
                        WordToken("喝茶", "hē chá", "Minum teh", "Menyesap teh hangat"),
                        WordToken("看电视", "kàn diàn shì", "Menonton TV", "Menonton gala TV Imlek")
                    )
                ),
                Sentence(
                    "s_sprfest_7",
                    "大人会给孩子们红包，里面有钱。",
                    "Dàren huì gěi háizimen hóngbāo, lǐmiàn yǒu qián.",
                    "Orang dewasa akan membagikan amplop merah (angpao) kepada anak-anak, yang di dalamnya berisi uang.",
                    listOf(
                        WordToken("大人会给", "dà ren huì gěi", "Orang dewasa akan memberi", "Tradisi sesepuh"),
                        WordToken("孩子们", "hái zi men", "Anak-anak", "Penerima angpao"),
                        WordToken("红包", "hóng bāo", "Amplop merah angpao", "Simbol rezeki keberuntungan"),
                        WordToken("里面有钱", "lǐ miàn yǒu qián", "Di dalamnya berisi uang", "Hadiah uang berkah")
                    )
                ),
                Sentence(
                    "s_sprfest_8",
                    "我们会穿红色的新衣服，非常漂亮。",
                    "Wǒmen huì chuān hóngsè de xīn yīfu, fēicháng piàoliang.",
                    "Kami akan mengenakan baju baru berwarna merah yang sangat indah.",
                    listOf(
                        WordToken("我们会穿", "wǒ men huì chuān", "Kami akan mengenakan", "Pakaian Imlek"),
                        WordToken("红色的", "hóng sè de", "Berwarna merah", "Warna pembawa hoki"),
                        WordToken("新衣服", "xīn yī fu", "Pakaian baru", "Baju anyar"),
                        WordToken("非常", "fēi cháng", "Sangat", "Tingkat"),
                        WordToken("漂亮", "piào liang", "Cantik / indah", "Penampilan menawan")
                    )
                ),
                Sentence(
                    "s_sprfest_9",
                    "大家见面的时候会说：“新年快乐！”",
                    "Dàjiā jiànmiàn de shíhou huì shuō: “Xīnnián kuàilè!”",
                    "Saat orang-orang saling berjumpa, mereka akan berseru: “Selamat Tahun Baru!”",
                    listOf(
                        WordToken("大家见面", "dà jiā jiàn miàn", "Semua orang saling berjumpa", "Momen silaturahmi"),
                        WordToken("的时候", "de shí hou", "Pada saat / ketika", "Keterangan waktu"),
                        WordToken("会说", "huì shuō", "Akan mengucapkan", "Tuturan salam"),
                        WordToken("新年快乐", "xīn nián kuài lè", "Selamat Tahun Baru!", "Ucapan salam Imlek")
                    )
                ),
                Sentence(
                    "s_sprfest_10",
                    "我非常喜欢春节。",
                    "Wǒ fēicháng xǐhuan Chūnjié.",
                    "Saya amat sangat menyukai Tahun Baru Imlek.",
                    listOf(
                        WordToken("我非常", "wǒ fēi cháng", "Saya amat sangat", "Tingkat rasa"),
                        WordToken("喜欢", "xǐ huan", "Menyukai", "Antusiasme"),
                        WordToken("春节", "Chūn jié", "Tahun Baru Imlek", "Hari raya Imlek")
                    )
                )
            ),
            questions = listOf(
                StoryQuestion(
                    "q_sprfest_1",
                    "文章中提到2026年的春节是在哪一天？(Kapan Tahun Baru Imlek tahun 2026 dalam artikel?)",
                    listOf(
                        "一月一日 (1 Januari)",
                        "二月十七日 (17 Februari)",
                        "三月五日 (5 Maret)",
                        "十二月三十日 (30 Desember)"
                    ),
                    1,
                    "Di kalimat pertama: '二零二六年二月十七日是春节'."
                ),
                StoryQuestion(
                    "q_sprfest_2",
                    "大人会给孩子们准备什么传统的节日礼物？(Hadiah festival tradisional apa yang diberikan orang dewasa kepada anak-anak?)",
                    listOf(
                        "玩具车 (Mobil mainan)",
                        "红包，里面有钱 (Angpao merah berisi uang)",
                        "作业本 (Buku PR)",
                        "手机 (Ponsel)"
                    ),
                    1,
                    "Di kalimat ke-7: '大人会给孩子们红包，里面有钱'."
                ),
                StoryQuestion(
                    "q_sprfest_3",
                    "过春节时，大家通常穿什么颜色的新衣服以示喜庆？(Pakaian baru warna apa yang biasa dipakai orang saat Imlek sebagai lambang kemeriahan?)",
                    listOf(
                        "黑色 (Hitam)",
                        "红色 (Merah)",
                        "绿色 (Hijau)",
                        "灰色 (Abu-abu)"
                    ),
                    1,
                    "Di kalimat ke-8: '我们会穿红色的新衣服，非常漂亮'."
                ),
                StoryQuestion(
                    "q_sprfest_4",
                    "大家见面互相拜年时最常说的吉祥话是什么？(Salam ucapan apa yang paling sering diucapkan saat saling berpapasan di hari Imlek?)",
                    listOf(
                        "再见 (Sampai jumpa)",
                        "新年快乐！ (Selamat Tahun Baru!)",
                        "对不起 (Maaf)",
                        "你吃了吗 (Sudah makan?)"
                    ),
                    1,
                    "Di kalimat ke-9: '大家见面的时候会说：新年快乐！'."
                )
            )
        ),

        // Cerita Mandarin Bean 65 (HSK 2): Year of the Horse (Tahun Kuda)
        Story(
            id = "story_year_of_horse",
            titleHanzi = "马年",
            titlePinyin = "Mǎnián",
            titleTranslation = "Year of the Horse (Tahun Kuda)",
            level = "HSK 2",
            category = "Budaya & Tradisi",
            description = "Filosofi shio Kuda dalam budaya Tionghoa: sifat pekerja keras, kegemaran bertualang, pepatah 'Ma Dao Cheng Gong', dan kemeriahan lampion.",
            coverEmoji = "🐎",
            coverImageRes = R.drawable.cover_story_year_of_horse,
            estimatedReadMinutes = 2,
            sentences = listOf(
                Sentence(
                    "s_horse_1",
                    "2026年是马年。",
                    "Èr líng èr liù nián shì mǎnián.",
                    "Tahun 2026 adalah Tahun Shio Kuda.",
                    listOf(
                        WordToken("2026", "2026", "2026", "Angka tahun"),
                        WordToken("年是", "nián shì", "Tahun adalah", "Kopula"),
                        WordToken("马年", "mǎ nián", "Tahun Kuda (Shio Kuda)", "Zodiak Tionghoa")
                    )
                ),
                Sentence(
                    "s_horse_2",
                    "马年很好，很多人喜欢马。",
                    "Mǎnián hěn hǎo, hěn duō rén xǐhuan mǎ.",
                    "Tahun Kuda sangatlah baik, banyak orang menyukai hewan kuda.",
                    listOf(
                        WordToken("马年很好", "mǎ nián hěn hǎo", "Tahun Kuda sangat baik", "Pujian tahun shio"),
                        WordToken("很多人", "hěn duō rén", "Banyak orang", "Populasi masyarakat"),
                        WordToken("喜欢马", "xǐ huan mǎ", "Menyukai kuda", "Kecintaan pada kuda")
                    )
                ),
                Sentence(
                    "s_horse_3",
                    "马年出生的人工作很努力。",
                    "Mǎnián chūshēng de rén gōngzuò hěn nǔlì.",
                    "Orang yang terlahir di Tahun Kuda biasanya bekerja dengan sangat giat dan tekun.",
                    listOf(
                        WordToken("马年出生的", "mǎ nián chū shēng de", "Yang lahir di tahun Kuda", "Karakter shio"),
                        WordToken("人", "rén", "Orang", "Manusia"),
                        WordToken("工作很努力", "gōng zuò hěn nǔ lì", "Bekerja sangat rajin / tekun", "Sifat pekerja keras")
                    )
                ),
                Sentence(
                    "s_horse_4",
                    "他们喜欢去很多地方，认识很多人。",
                    "Tāmen xǐhuan qù hěn duō dìfang, rènshi hěn duō rén.",
                    "Mereka gemar bepergian ke berbagai tempat dan berkenalan dengan banyak orang baru.",
                    listOf(
                        WordToken("他们喜欢去", "tā men xǐ huan qù", "Mereka suka pergi ke", "Jiwa petualang"),
                        WordToken("很多地方", "hěn duō dì fang", "Banyak tempat", "Destinasi luas"),
                        WordToken("认识", "rèn shi", "Mengenal / berteman", "Sosialisasi"),
                        WordToken("很多人", "hěn duō rén", "Banyak orang", "Relasi luas")
                    )
                ),
                Sentence(
                    "s_horse_5",
                    "在中国，马年有很多有意思的事。",
                    "Zài Zhōngguó, mǎnián yǒu hěn duō yǒuyìsi de shì.",
                    "Di Tiongkok, pada Tahun Kuda terdapat banyak hal yang sangat menarik.",
                    listOf(
                        WordToken("在中国", "zài Zhōng guó", "Di Tiongkok", "Konteks negara"),
                        WordToken("马年有", "mǎ nián yǒu", "Tahun Kuda terdapat", "Tradisi tahun kuda"),
                        WordToken("很多", "hěn duō", "Banyak sekali", "Jumlah"),
                        WordToken("有意思的事", "yǒu yì si de shì", "Hal-hal yang menarik", "Keseruan budaya")
                    )
                ),
                Sentence(
                    "s_horse_6",
                    "很多人家里会放马的字和画，非常好看。",
                    "Hěn duō rén jiā lǐ huì fàng mǎ de zì hé huà, fēicháng hǎokàn.",
                    "Banyak orang memajang kaligrafi karakter dan lukisan kuda di rumah mereka, tampak sangat indah.",
                    listOf(
                        WordToken("很多人家里", "hěn duō rén jiā lǐ", "Banyak rumah orang", "Dekorasi rumah"),
                        WordToken("会放", "huì fàng", "Akan memajang / menempatkan", "Dekorasi"),
                        WordToken("马的", "mǎ de", "Bertema kuda punya", "Karakter kuda"),
                        WordToken("字和画", "zì hé huà", "Kaligrafi tulisan dan lukisan seni", "Karya seni tradisional"),
                        WordToken("非常好看", "fēi cháng hǎo kàn", "Sangat bagus dipandang", "Nilai estetika")
                    )
                ),
                Sentence(
                    "s_horse_7",
                    "大家也会说“马到成功”，意思是工作很快有好结果。",
                    "Dàjiā yě huì shuō “mǎ dào chéng gōng”, yìsi shì gōngzuò hěn kuài yǒu hǎo jiéguǒ.",
                    "Orang-orang juga kerap mengucapkan peribahasa 'Ma Dao Cheng Gong' (kuda tiba sukses tercapai), yang bermakna pekerjaan akan segera membuahkan hasil yang gemilang.",
                    listOf(
                        WordToken("大家也会说", "dà jiā yě huì shuō", "Semua orang juga akan berkata", "Ungkapan populer"),
                        WordToken("马到成功", "mǎ dào chéng gōng", "Kuda tiba sukses tercapai (sukses seketika)", "Peribahasa chengyu kesuksesan"),
                        WordToken("意思是", "yì si shì", "Artinya adalah", "Penjelasan makna filosofis"),
                        WordToken("工作很快", "gōng zuò hěn kuài", "Pekerjaan dengan cepat", "Kecepatan keberhasilan"),
                        WordToken("有好结果", "yǒu hǎo jié guǒ", "Mendapatkan hasil baik / sukses", "Hasil memuaskan")
                    )
                ),
                Sentence(
                    "s_horse_8",
                    "新年的时候，大家会吃很多好吃的东西。",
                    "Xīnnián de shíhou, dàjiā huì chī hěn duō hǎochī de dōngxi.",
                    "Saat momen tahun baru tiba, semua orang akan menyantap aneka hidangan yang sangat lezat.",
                    listOf(
                        WordToken("新年的时候", "xīn nián de shí hou", "Pada saat tahun baru", "Momen perayaan"),
                        WordToken("大家会吃", "dà jiā huì chī", "Semua orang akan makan", "Santap kuliner"),
                        WordToken("很多", "hěn duō", "Banyak sekali", "Jumlah"),
                        WordToken("好吃的东西", "hǎo chī de dōng xi", "Makanan lezat enak", "Kuliner pesta")
                    )
                ),
                Sentence(
                    "s_horse_9",
                    "街上很热闹，有很多人，也有很多红色的灯笼，非常漂亮。",
                    "Jiē shang hěn rènao, yǒu hěn duō rén, yě yǒu hěn duō hóngsè de dēnglong, fēicháng piàoliang.",
                    "Suasana di jalanan sangat meriah dan ramai, ada begitu banyak orang, serta berhias banyak lampion merah yang sangat menawan.",
                    listOf(
                        WordToken("街上很热闹", "jiē shang hěn rè nao", "Di jalanan sangat meriah dan ramai", "Suasana semarak"),
                        WordToken("有很多人", "yǒu hěn duō rén", "Ada banyak orang", "Keramaian warga"),
                        WordToken("也有很多", "yě yǒu hěn duō", "Juga ada banyak", "Kelimpahan hiasan"),
                        WordToken("红色的", "hóng sè de", "Berwarna merah", "Warna hoki"),
                        WordToken("灯笼", "dēng long", "Lampion merah", "Dekorasi jalanan"),
                        WordToken("非常漂亮", "fēi cháng piào liang", "Sangat cantik mempesona", "Pemandangan indah")
                    )
                ),
                Sentence(
                    "s_horse_10",
                    "马年，希望大家每天都快乐，身体好、工作好、学习也好。",
                    "Mǎnián, xīwàng dàjiā měi tiān dōu kuàilè, shēntǐ hǎo, gōngzuò hǎo, xuéxí yě hǎo.",
                    "Di Tahun Kuda ini, semoga semua orang berbahagia setiap hari, berbadan sehat, sukses dalam pekerjaan, dan juga berprestasi dalam studi.",
                    listOf(
                        WordToken("马年", "mǎ nián", "Tahun Kuda", "Tahun shio"),
                        WordToken("希望大家", "xī wàng dà jiā", "Berharap semua orang", "Doa harapan tulus"),
                        WordToken("每天都快乐", "měi tiān dōu kuài lè", "Setiap hari selalu berbahagia", "Kebahagiaan tiada akhir"),
                        WordToken("身体好", "shēn tǐ hǎo", "Tubuh sehat bugar", "Kesehatan prima"),
                        WordToken("工作好", "gōng zuò hǎo", "Pekerjaan lancar sukses", "Kesuksesan karier"),
                        WordToken("学习也好", "xué xí yě hǎo", "Belajar juga berprestasi cemerlang", "Prestasi studi")
                    )
                )
            ),
            questions = listOf(
                StoryQuestion(
                    "q_horse_1",
                    "文章中提到出生在马年的人有什么性格特点？(Ciri kepribadian apa yang dimiliki orang bershio Kuda menurut teks?)",
                    listOf(
                        "很懒惰 (Malas)",
                        "工作很努力，喜欢去很多地方认识很多人 (Bekerja giat, suka bertualang & berelasi luas)",
                        "害怕出门 (Takut keluar rumah)",
                        "不喜欢说话 (Pendiam)"
                    ),
                    1,
                    "Di kalimat ke-3 & 4: '马年出生的人工作很努力。他们喜欢去很多地方，认识很多人'."
                ),
                StoryQuestion(
                    "q_horse_2",
                    "成语“马到成功”表达了怎样的美好祝愿？(Makna doa baik apa yang terkandung dalam peribahasa 'Ma Dao Cheng Gong'?)",
                    listOf(
                        "工作很快有好结果 / 顺利成功 (Pekerjaan segera membuahkan hasil baik / sukses cepat)",
                        "马跑得很快 (Kuda lari kencang)",
                        "去马场骑马 (Pergi naik kuda)",
                        "回家睡觉 (Pulang tidur)"
                    ),
                    0,
                    "Di kalimat ke-7: '大家也会说“马到成功”，意思是工作很快有好结果'."
                ),
                StoryQuestion(
                    "q_horse_3",
                    "在马年，很多人家里会摆放什么装饰品？(Hiasan apa yang dipajang banyak orang di rumah pada Tahun Kuda?)",
                    listOf(
                        "马的字和画 (Kaligrafi dan lukisan bertema kuda)",
                        "花瓶 (Vas bunga biasa)",
                        "电脑 (Komputer)",
                        "自行车 (Sepeda)"
                    ),
                    0,
                    "Di kalimat ke-6: '很多人家里会放马的字和画，非常好看'."
                ),
                StoryQuestion(
                    "q_horse_4",
                    "作者在文章最后向大家送上了哪些祝福？(Doa apa yang disampaikan penulis di akhir bacaan?)",
                    listOf(
                        "身体好、工作好、学习也好 (Kesehatan prima, pekerjaan lancar, studi berprestasi)",
                        "多吃汉堡 (Banyak makan burger)",
                        "天天睡觉 (Tidur setiap hari)",
                        "不用工作 (Tidak usah kerja)"
                    ),
                    0,
                    "Di kalimat ke-10: '希望大家每天都快乐，身体好、工作好、学习也好'."
                )
            )
        ),

        // Cerita Mandarin Bean 66 (HSK 2): Two Pieces of Cake (Dua Potong Kue)
        Story(
            id = "story_two_pieces_of_cake",
            titleHanzi = "两块蛋糕",
            titlePinyin = "Liǎng Kuài Dàngāo",
            titleTranslation = "Two Pieces of Cake (Dua Potong Kue)",
            level = "Fun, HSK 2",
            category = "Humor & Keluarga",
            description = "Anak meminta jatah dua potong kue kepada sang ibu, dan ibu dengan cerdik mengabulkannya hanya dengan membelah sepotong kue menjadi dua bagian.",
            coverEmoji = "🍰",
            coverImageRes = R.drawable.cover_story_two_pieces_of_cake,
            estimatedReadMinutes = 2,
            sentences = listOf(
                Sentence(
                    "s_twocake_1",
                    "妈妈：给你一块蛋糕，吃吧！",
                    "Māma: Gěi nǐ yí kuài dàngāo, chī ba!",
                    "Ibu: Ini untukmu sepotong kue, makanlah ya!",
                    listOf(
                        WordToken("妈妈", "mā ma", "Ibu", "Panggilan ibu"),
                        WordToken("给你", "gěi nǐ", "Diberikan kepadamu", "Menyerahkan kue"),
                        WordToken("一块蛋糕", "yí kuài dàn gāo", "Sepotong kue manis", "Porsi awal satu potong"),
                        WordToken("吃吧", "chī ba", "Makanlah ya", "Ajakan ramah")
                    )
                ),
                Sentence(
                    "s_twocake_2",
                    "孩子：妈妈，我想吃两块蛋糕，可以吗？",
                    "Háizi: Māma, wǒ xiǎng chī liǎng kuài dàngāo, kěyǐ ma?",
                    "Anak: Ibu, saya ingin makan dua potong kue, bolehkah?",
                    listOf(
                        WordToken("孩子", "hái zi", "Anak", "Panggilan anak"),
                        WordToken("妈妈", "mā ma", "Ibu", "Panggilan anak pada ibu"),
                        WordToken("我想吃", "wǒ xiǎng chī", "Saya ingin makan", "Permintaan anak"),
                        WordToken("两块蛋糕", "liǎng kuài dàn gāo", "Dua potong kue", "Permintaan porsi dobel"),
                        WordToken("可以吗", "kě yǐ ma", "Bolehkah?", "Pertanyaan izin")
                    )
                ),
                Sentence(
                    "s_twocake_3",
                    "妈妈：当然可以！",
                    "Māma: Dāngrán kěyǐ!",
                    "Ibu: Tentu saja boleh!",
                    listOf(
                        WordToken("妈妈", "mā ma", "Ibu", "Panggilan ibu"),
                        WordToken("当然可以", "dāng rán kě yǐ", "Tentu saja boleh!", "Persetujuan tanpa ragu")
                    )
                ),
                Sentence(
                    "s_twocake_4",
                    "妈妈拿走孩子的这块蛋糕，切成两半，说：给你，两块。",
                    "Māma ná zǒu háizi de zhè kuài dàngāo, qiē chéng liǎng bàn, shuō: gěi nǐ, liǎng kuài.",
                    "Ibu mengambil sepotong kue milik anaknya tersebut, memotongnya menjadi dua belahan, lalu berkata: Ini untukmu, sekarang sudah dua potong!",
                    listOf(
                        WordToken("妈妈拿走", "mā ma ná zǒu", "Ibu mengambil kembali", "Tindakan cerdik ibu"),
                        WordToken("孩子的", "hái zi de", "Milik sang anak", "Kepemilikan anak"),
                        WordToken("这块蛋糕", "zhè kuài dàn gāo", "Sepotong kue ini", "Kue awal"),
                        WordToken("切成两半", "qiē chéng liǎng bàn", "Memotong menjadi dua belahan", "Membelah kue"),
                        WordToken("说", "shuō", "Berkata", "Tuturan"),
                        WordToken("给你", "gěi nǐ", "Ini untukmu", "Menyerahkan kembali"),
                        WordToken("两块", "liǎng kuài", "Dua potong!", "Puncak humor logika ibu")
                    )
                )
            ),
            questions = listOf(
                StoryQuestion(
                    "q_twocake_1",
                    "孩子向妈妈提出了什么要求？(Permintaan apa yang diajukan anak kepada ibunya?)",
                    listOf(
                        "想喝可乐 (Mau minum kola)",
                        "想吃两块蛋糕 (Ingin makan dua potong kue)",
                        "想出去玩 (Mau main keluar)",
                        "想买新衣服 (Mau beli baju baru)"
                    ),
                    1,
                    "Di kalimat ke-2: '孩子：妈妈，我想吃两块蛋糕，可以吗？'."
                ),
                StoryQuestion(
                    "q_twocake_2",
                    "妈妈是如何‘机智’地满足孩子想吃两块蛋糕的要求的？(Bagaimana cara cerdik ibu mengabulkan permintaan dua potong kue anaknya?)",
                    listOf(
                        "Pergi ke toko kue membeli kue baru",
                        "Mengambil kue awal lalu membelahnya menjadi dua bagian sehingga menjadi dua potong!",
                        "Membuat adonan kue dari awal",
                        "Menolak dan memarahi anak"
                    ),
                    1,
                    "Puncak kelucuan di kalimat ke-4: '妈妈拿走孩子的这块蛋糕，切成两半，说：给你，两块'."
                ),
                StoryQuestion(
                    "q_twocake_3",
                    "经过妈妈的切分后，蛋糕的实际总量有没有增加？(Setelah dipotong ibu, apakah jumlah volume kue sebenarnya bertambah?)",
                    listOf(
                        "Bertambah dua kali lipat",
                        "Sama persis (hanya ukurannya saja yang menjadi setengahnya)",
                        "Berkurang drastis",
                        "Menjadi tiga potong"
                    ),
                    1,
                    "Hukum kekekalan volume: satu kue dipotong dua tetaplah satu porsi kue yang sama!"
                ),
                StoryQuestion(
                    "q_twocake_4",
                    "词组“当然可以”中的“当然”是什么意思？(Apa arti kata '当然' dalam frasa tersebut?)",
                    listOf(
                        "Mungkin",
                        "Tentu saja / pasti",
                        "Sangat sulit",
                        "Tidak boleh"
                    ),
                    1,
                    "'当然' (dāngrán) berarti tentu saja atau sudah sewajarnya."
                )
            )
        ),

        // Cerita Mandarin Bean 67 (HSK 2): My Bicycle (Sepeda Kesayanganku)
        Story(
            id = "story_my_bicycle",
            titleHanzi = "我的自行车",
            titlePinyin = "Wǒ de Zìxíngchē",
            titleTranslation = "My Bicycle (Sepeda Kesayanganku)",
            level = "HSK 2",
            category = "Kendaraan & Kehidupan",
            description = "Kisah cinta seorang anak pada sepeda biru hadiah ulang tahun ke-6 dari ibu yang menemaninya menjelajah taman, jembatan, dan sudut kota.",
            coverEmoji = "🚲",
            coverImageRes = R.drawable.cover_story_my_bicycle,
            estimatedReadMinutes = 2,
            sentences = listOf(
                Sentence(
                    "s_bicycle_1",
                    "我最喜欢的车是自行车。",
                    "Wǒ zuì xǐhuan de chē shì zìxíngchē.",
                    "Kendaraan yang paling saya sukai adalah sepeda pancal.",
                    listOf(
                        WordToken("我最喜欢的", "wǒ zuì xǐ huan de", "Yang paling saya sukai punya", "Preferensi utama"),
                        WordToken("车是", "chē shì", "Kendaraan adalah", "Kopula"),
                        WordToken("自行车", "zì xíng chē", "Sepeda pancal gowes", "Kendaraan ramah lingkungan")
                    )
                ),
                Sentence(
                    "s_bicycle_2",
                    "我六岁的时候，妈妈就给我买了一辆小自行车。",
                    "Wǒ liù suì de shíhou, māma jiù gěi wǒ mǎi le yí liàng xiǎo zìxíngchē.",
                    "Ketika saya berusia 6 tahun, ibu telah membelikan saya sebuah sepeda kecil.",
                    listOf(
                        WordToken("我六岁的", "wǒ liù suì de", "Saya berusia enam tahun punya", "Usia masa kecil"),
                        WordToken("时候", "shí hou", "Pada saat / ketika", "Keterangan waktu"),
                        WordToken("妈妈就给我", "mā ma jiù gěi wǒ", "Ibu langsung untuk saya", "Kasih sayang ibu"),
                        WordToken("买了一辆", "mǎi le yí liàng", "Membelikan sebuah", "Pembelian hadiah"),
                        WordToken("小自行车", "xiǎo zì xíng chē", "Sepeda kecil", "Sepeda anak")
                    )
                ),
                Sentence(
                    "s_bicycle_3",
                    "那辆车非常漂亮，像天空一样蓝。",
                    "Nà liàng chē fēicháng piàoliang, xiàng tiānkōng yíyàng lán.",
                    "Sepeda itu sangatlah indah, berwarna biru secerah birunya langit.",
                    listOf(
                        WordToken("那辆车", "nà liàng chē", "Sepeda itu", "Subjek sepeda"),
                        WordToken("非常漂亮", "fēi cháng piào liang", "Sangat cantik elok", "Keindahan visual"),
                        WordToken("像天空一样", "xiàng tiān kōng yí yàng", "Bagaikan birunya langit", "Gaya bahasa perumpamaan"),
                        WordToken("蓝", "lán", "Biru", "Warna biru cerah")
                    )
                ),
                Sentence(
                    "s_bicycle_4",
                    "虽然车很小，但是我可以骑得很快。",
                    "Suīrán chē hěn xiǎo, dànshì wǒ kěyǐ qí de hěn kuài.",
                    "Meskipun sepedanya kecil, namun saya bisa mengendarainya melaju kencang.",
                    listOf(
                        WordToken("虽然车很小", "suī rán chē hěn xiǎo", "Meskipun sepedanya kecil", "Klausa pengakutan"),
                        WordToken("但是", "dàn shì", "Namun / tetapi", "Konjungsi pertentangan"),
                        WordToken("我可以", "wǒ kě yǐ", "Saya dapat / mampu", "Kemampuan diri"),
                        WordToken("骑得很快", "qí de hěn kuài", "Menggowes melaju sangat cepat", "Kelincahan bersepeda")
                    )
                ),
                Sentence(
                    "s_bicycle_5",
                    "我经常骑着我的自行车去公园或者图书馆，经过街道和大桥，穿过整个城市。",
                    "Wǒ jīngcháng qí zhe wǒ de zìxíngchē qù gōngyuán huòzhě túshūguǎn, jīngguò jiēdào hé dàqiáo, chuān guò zhěng gè chéngshì.",
                    "Saya sering mengendarai sepeda saya pergi ke taman atau perpustakaan, melintasi jalanan dan jembatan besar, menjelajahi seisi kota.",
                    listOf(
                        WordToken("我经常", "wǒ jīng cháng", "Saya kerap kali / sering", "Frekuensi kebiasaan"),
                        WordToken("骑着我的", "qí zhe wǒ de", "Mengendarai sepeda saya punya", "Aksi bersepeda"),
                        WordToken("自行车", "zì xíng chē", "Sepeda", "Kendaraan"),
                        WordToken("去公园", "qù gōng yuán", "Pergi ke taman kota", "Destinasi rekreasi"),
                        WordToken("或者", "huò zhě", "Atau", "Pilihan alternatif"),
                        WordToken("图书馆", "tú shū guǎn", "Gedung perpustakaan", "Destinasi membaca"),
                        WordToken("经过", "jīng guò", "Melewati / melintasi", "Rute perjalanan"),
                        WordToken("街道和大桥", "jiē dào hé dà qiáo", "Jalanan dan jembatan besar", "Infrastruktur kota"),
                        WordToken("穿过", "chuān guò", "Menerobos / menyeberangi", "Jelajah kota"),
                        WordToken("整个城市", "zhěng gè chéng shì", "Seluruh penjuru kota", "Wilayah kota luas")
                    )
                ),
                Sentence(
                    "s_bicycle_6",
                    "自行车就是我最好的朋友。",
                    "Zìxíngchē jiù shì wǒ zuì hǎo de péngyou.",
                    "Sepeda inilah sahabat terbaik yang selalu menemani hidup saya.",
                    listOf(
                        WordToken("自行车", "zì xíng chē", "Sepeda", "Subjek setia"),
                        WordToken("就是我", "jiù shì wǒ", "Tepatlah bagi saya", "Penegasan ikatan emosional"),
                        WordToken("最好的", "zuì hǎo de", "Yang paling terbaik", "Peringkat superlatif"),
                        WordToken("朋友", "péng you", "Sahabat karib", "Teman setia")
                    )
                )
            ),
            questions = listOf(
                StoryQuestion(
                    "q_bicycle_1",
                    "作者在几岁的时候收到了妈妈送的小自行车？(Pada usia berapa penulis menerima sepeda kecil dari ibunya?)",
                    listOf(
                        "四岁 (4 tahun)",
                        "六岁 (6 tahun)",
                        "八岁 (8 tahun)",
                        "十岁 (10 tahun)"
                    ),
                    1,
                    "Di kalimat ke-2: '我六岁的时候，妈妈就给我买了一辆小自行车'."
                ),
                StoryQuestion(
                    "q_bicycle_2",
                    "作者的小自行车是什么颜色的？(Apa warna sepeda kecil milik penulis?)",
                    listOf(
                        "像太阳一样红 (Merah)",
                        "像天空一样蓝 (Biru seperti langit)",
                        "像树叶一样绿 (Hijau)",
                        "像雪一样白 (Putih)"
                    ),
                    1,
                    "Di kalimat ke-3: '那辆车非常漂亮，像天空一样蓝'."
                ),
                StoryQuestion(
                    "q_bicycle_3",
                    "作者经常骑着自行车去哪些地方？(Ke tempat mana saja penulis sering bersepeda?)",
                    listOf(
                        "电影院和商场 (Bioskop dan mall)",
                        "公园或者图书馆 (Taman atau perpustakaan)",
                        "火车站 (Stasiun)",
                        "飞机场 (Bandara)"
                    ),
                    1,
                    "Di kalimat ke-5: '我经常骑着我的自行车去公园或者图书馆'."
                ),
                StoryQuestion(
                    "q_bicycle_4",
                    "作者在文章最后把自行车比作什么？(Penulis mengibaratkan sepedanya sebagai apa di akhir teks?)",
                    listOf(
                        "玩具 (Mainan)",
                        "最好的朋友 (Sahabat terbaik)",
                        "老师 (Guru)",
                        "医生 (Dokter)"
                    ),
                    1,
                    "Di kalimat ke-6: '自行车就是我最好的朋友'."
                )
            )
        ),

        // Cerita Mandarin Bean 68 (HSK 2): Which One Should I Buy? (Beli Baju yang Mana?)
        Story(
            id = "story_which_one_should_i_buy",
            titleHanzi = "买哪件？",
            titlePinyin = "Mǎi Nǎ Jiàn?",
            titleTranslation = "Which One Should I Buy? (Beli Baju yang Mana?)",
            level = "HSK 2",
            category = "Belanja & Fesyen",
            description = "Dilema memilih baju di toko: baju merah sangat cantik namun mahal, sedangkan baju hitam lebih murah namun warnanya kurang menarik.",
            coverEmoji = "👗",
            coverImageRes = R.drawable.cover_story_which_one_should_i_buy,
            estimatedReadMinutes = 2,
            sentences = listOf(
                Sentence(
                    "s_whichbuy_1",
                    "我在商场买衣服。",
                    "Wǒ zài shāngchǎng mǎi yīfu.",
                    "Saya sedang berada di pusat perbelanjaan (mall) untuk membeli pakaian.",
                    listOf(
                        WordToken("我在商场", "wǒ zài shāng chǎng", "Saya di dalam mall perbelanjaan", "Lokasi berbelanja"),
                        WordToken("买衣服", "mǎi yī fu", "Membeli pakaian baju", "Aktivitas belanja")
                    )
                ),
                Sentence(
                    "s_whichbuy_2",
                    "红色的衣服很好看，但是很贵。",
                    "Hóngsè de yīfu hěn hǎokàn, dànshì hěn guì.",
                    "Baju yang berwarna merah sangatlah cantik menawan, tetapi harganya sangat mahal.",
                    listOf(
                        WordToken("红色的", "hóng sè de", "Berwarna merah", "Ciri warna pertama"),
                        WordToken("衣服", "yī fu", "Baju pakaian", "Pilihan pakaian"),
                        WordToken("很好看", "hěn hǎo kàn", "Sangat elok dipandang / cantik", "Kualitas estetika"),
                        WordToken("但是", "dàn shì", "Namun / tetapi", "Konjungsi pertentangan"),
                        WordToken("很贵", "hěn guì", "Sangat mahal harganya", "Kendala harga mahal")
                    )
                ),
                Sentence(
                    "s_whichbuy_3",
                    "黑色的衣服便宜一点儿，但是颜色不好。",
                    "Hēisè de yīfu piányi yìdiǎnr, dànshì yánsè bù hǎo.",
                    "Baju yang berwarna hitam harganya agak lebih murah sedikit, tetapi warnanya kurang menarik hati.",
                    listOf(
                        WordToken("黑色的", "hēi sè de", "Berwarna hitam elegan", "Ciri warna kedua"),
                        WordToken("衣服", "yī fu", "Pakaian", "Pilihan pakaian"),
                        WordToken("便宜一点儿", "pián yi yì diǎn r", "Lebih murah sedikit harganya", "Keunggulan harga"),
                        WordToken("但是", "dàn shì", "Tetapi", "Konjungsi"),
                        WordToken("颜色不好", "yán sè bù hǎo", "Warnanya kurang bagus", "Kekurangan estetika")
                    )
                ),
                Sentence(
                    "s_whichbuy_4",
                    "两件衣服的大小都合适，我应该买哪件呢？",
                    "Liǎng jiàn yīfu de dàxiǎo dōu héshì, wǒ yīnggāi mǎi nǎ jiàn ne?",
                    "Ukuran kedua potong baju ini sama-sama pas di badan saya, saya sebaiknya membeli yang mana ya?",
                    listOf(
                        WordToken("两件衣服的", "liǎng jiàn yī fu de", "Dua helai pakaian punya", "Objek perbandingan"),
                        WordToken("大小", "dà xiǎo", "Ukuran size baju", "Kesesuaian tubuh"),
                        WordToken("都合适", "dōu hé shì", "Semuanya sama-sama pas cocok", "Kecocokan ukuran"),
                        WordToken("我应该", "wǒ yīng gāi", "Saya seharusnya", "Dilema pertimbangan"),
                        WordToken("买哪件呢", "mǎi nǎ jiàn ne", "Membeli helai yang mana ya?", "Pertanyaan kebimbangan")
                    )
                )
            ),
            questions = listOf(
                StoryQuestion(
                    "q_whichbuy_1",
                    "红色的衣服有什么优点和缺点？(Apa kelebihan dan kekurangan baju warna merah?)",
                    listOf(
                        "便宜但不好看 (Murah tapi jelek)",
                        "很好看，但是很贵 (Sangat cantik, tetapi harganya mahal)",
                        "太大了 (Terlalu besar)",
                        "颜色不好 (Warna kurang bagus)"
                    ),
                    1,
                    "Di kalimat ke-2: '红色的衣服很好看，但是很贵'."
                ),
                StoryQuestion(
                    "q_whichbuy_2",
                    "黑色的衣服有什么特点？(Bagaimana karakteristik baju warna hitam?)",
                    listOf(
                        "比红色的贵 (Lebih mahal)",
                        "便宜一点儿，但是颜色不好 (Lebih murah sedikit, tapi warnanya kurang bagus)",
                        "很小穿不上 (Kekecilan)",
                        "破了 (Robek)"
                    ),
                    1,
                    "Di kalimat ke-3: '黑色的衣服便宜一点儿，但是颜色不好'."
                ),
                StoryQuestion(
                    "q_whichbuy_3",
                    "关于这两件衣服的大小，文章中是如何描述的？(Bagaimana teks mendeskripsikan ukuran kedua baju tersebut?)",
                    listOf(
                        "一件大，一件小 (Satu besar satu kecil)",
                        "两件衣服的大小都合适 (Ukuran kedua baju sama-sama pas)",
                        "都很小 (Semuanya kekecilan)",
                        "都太大 (Semuanya kebesaran)"
                    ),
                    1,
                    "Di kalimat ke-4: '两件衣服的大小都合适'."
                ),
                StoryQuestion(
                    "q_whichbuy_4",
                    "文章反映了日常购物时常常遇到的什么普遍心理？(Psikologi umum apa yang sering dihadapi saat belanja dalam cerita ini?)",
                    listOf(
                        "Dilema memilih antara barang yang disukai tapi mahal vs barang terjangkau tapi kurang disukai",
                        "Tidak membawa uang",
                        "Toko sudah tutup",
                        "Pelayan toko galak"
                    ),
                    0,
                    "Pertimbangan klasik antara estetika harga tinggi dan kepraktisan harga murah."
                )
            )
        ),

        // Cerita Mandarin Bean 69 (HSK 2): My Daughter (Putri Kecilku)
        Story(
            id = "story_my_daughter",
            titleHanzi = "我的女儿",
            titlePinyin = "Wǒ de Nǚ'ér",
            titleTranslation = "My Daughter (Putri Kecilku)",
            level = "HSK 2",
            category = "Keluarga & Cinta",
            description = "Potret manis putri kecil berusia 5 tahun bernama Xiaobao yang gemar sarapan telur susu dan suka mendengarkan dongeng sebelum tidur.",
            coverEmoji = "👧",
            coverImageRes = R.drawable.cover_story_my_daughter,
            estimatedReadMinutes = 2,
            sentences = listOf(
                Sentence(
                    "s_daughter_1",
                    "我有一个女儿，她今年五岁。",
                    "Wǒ yǒu yí gè nǚ'ér, tā jīnnián wǔ suì.",
                    "Saya memiliki seorang anak perempuan, tahun ini dia berusia 5 tahun.",
                    listOf(
                        WordToken("我有一个", "wǒ yǒu yí gè", "Saya memiliki seorang", "Anugerah buah hati"),
                        WordToken("女儿", "nǚ ér", "Anak perempuan / putri", "Putri kandung tercinta"),
                        WordToken("她今年", "tā jīn nián", "Dia tahun ini", "Subjek anak"),
                        WordToken("五岁", "wǔ suì", "Lima tahun usianya", "Usia balita 5 tahun")
                    )
                ),
                Sentence(
                    "s_daughter_2",
                    "她的名字叫小宝。",
                    "Tā de míngzi jiào Xiǎobǎo.",
                    "Nama panggilannya adalah Xiaobao (Harta Karun Kecil).",
                    listOf(
                        WordToken("她的名字", "tā de míng zi", "Namanya punya", "Identitas"),
                        WordToken("叫", "jiào", "Dipanggil bernama", "Panggilan"),
                        WordToken("小宝", "Xiǎo bǎo", "Xiaobao (Harta Kecil)", "Nama panggilan sayang")
                    )
                ),
                Sentence(
                    "s_daughter_3",
                    "她很可爱，也很聪明。",
                    "Tā hěn kě'ài, yě hěn cōngmíng.",
                    "Dia sangat imut dan lucu, serta sangat cerdas pintar.",
                    listOf(
                        WordToken("她很可爱", "tā hěn kě ài", "Dia sangat menggemaskan / lucu", "Daya tarik imut"),
                        WordToken("也很聪明", "yě hěn cōng míng", "Juga sangat cerdas pandai", "Kecerdasan anak")
                    )
                ),
                Sentence(
                    "s_daughter_4",
                    "她每天早上七点起床，穿衣服，洗脸，吃东西。",
                    "Tā měitiān zǎoshang qī diǎn qǐchuáng, chuān yīfu, xǐ liǎn, chī dōngxi.",
                    "Setiap pagi pukul 7 dia bangun tidur, memakai baju, mencuci muka, lalu sarapan.",
                    listOf(
                        WordToken("她每天早上", "tā měi tiān zǎo shang", "Dia setiap pagi hari", "Rutinitas harian"),
                        WordToken("七点起床", "qī diǎn qǐ chuáng", "Bangun tidur pukul 7", "Jam bangun tidur"),
                        WordToken("穿衣服", "chuān yī fu", "Mengenakan pakaian", "Berpakaian rapi"),
                        WordToken("洗脸", "xǐ liǎn", "Mencuci muka", "Kebersihan pagi"),
                        WordToken("吃东西", "chī dōng xi", "Makan makanan sarapan", "Sarapan berenergi")
                    )
                ),
                Sentence(
                    "s_daughter_5",
                    "她最喜欢鸡蛋和牛奶。",
                    "Tā zuì xǐhuan jīdàn hé niúnǎi.",
                    "Makanan yang paling disukainya adalah telur ayam dan susu sapi.",
                    listOf(
                        WordToken("她最喜欢", "tā zuì xǐ huan", "Dia paling gemar / suka", "Menu favorit"),
                        WordToken("鸡蛋和牛奶", "jī dàn hé niú nǎi", "Telur ayam dan susu segar", "Nutrisi sehat sarapan")
                    )
                ),
                Sentence(
                    "s_daughter_6",
                    "她不喜欢学校，每次去学校都会哭。",
                    "Tā bù xǐhuan xuéxiào, měi cì qù xuéxiào dōu huì kū.",
                    "Dia tidak suka pergi ke sekolah TK, setiap kali diantar ke sekolah dia pasti menangis.",
                    listOf(
                        WordToken("她不喜欢", "tā bù xǐ huan", "Dia tidak menyukai", "Keengganan"),
                        WordToken("学校", "xué xiào", "Sekolah / taman kanak-kanak", "Lembaga sekolah"),
                        WordToken("每次去学校", "měi cì qù xué xiào", "Setiap kali berangkat sekolah", "Frekuensi"),
                        WordToken("都会哭", "dōu huì kū", "Pasti selalu menangis", "Tingkah wajar balita")
                    )
                ),
                Sentence(
                    "s_daughter_7",
                    "她喜欢晚上，因为晚上可以听我讲故事。",
                    "Tā xǐhuan wǎnshang, yīnwèi wǎnshang kěyǐ tīng wǒ jiǎng gùshi.",
                    "Dia paling suka malam hari, karena di malam hari dia bisa mendengarkan saya mendongengkan cerita.",
                    listOf(
                        WordToken("她喜欢晚上", "tā xǐ huan wǎn shang", "Dia menyukai malam hari", "Waktu favorit keluarga"),
                        WordToken("因为晚上", "yīn wèi wǎn shang", "Karena di malam hari", "Alasan kehangatan"),
                        WordToken("可以听我", "kě yǐ tīng wǒ", "Bisa mendengarkan saya", "Mendengarkan dongeng"),
                        WordToken("讲故事", "jiǎng gù shi", "Mendongengkan cerita", "Aktivitas cerita pengantar tidur")
                    )
                ),
                Sentence(
                    "s_daughter_8",
                    "我爱我的女儿。",
                    "Wǒ ài wǒ de nǚ'ér.",
                    "Saya amat menyayangi putri kecil saya.",
                    listOf(
                        WordToken("我爱", "wǒ ài", "Saya mencintai / menyayangi", "Ungkapan kasih sayang tulus"),
                        WordToken("我的女儿", "wǒ de nǚ ér", "Putri anak perempuan saya", "Buah hati tercinta")
                    )
                )
            ),
            questions = listOf(
                StoryQuestion(
                    "q_daughter_1",
                    "女儿小宝今年几岁？(Berapa usia Xiaobao tahun ini?)",
                    listOf(
                        "三岁 (3 tahun)",
                        "五岁 (5 tahun)",
                        "七岁 (7 tahun)",
                        "九岁 (9 tahun)"
                    ),
                    1,
                    "Di kalimat pertama: '我有一个女儿，她今年五岁'."
                ),
                StoryQuestion(
                    "q_daughter_2",
                    "小宝早上最喜欢吃什么健康早餐？(Sarapan sehat apa yang paling disukai Xiaobao di pagi hari?)",
                    listOf(
                        "面包和茶 (Roti dan teh)",
                        "鸡蛋和牛奶 (Telur ayam dan susu segar)",
                        "米饭和菜 (Nasi dan sayur)",
                        "冰淇淋 (Es krim)"
                    ),
                    1,
                    "Di kalimat ke-5: '她最喜欢鸡蛋和牛奶'."
                ),
                StoryQuestion(
                    "q_daughter_3",
                    "小宝每次去学校都会有怎样的反应？(Bagaimana reaksi Xiaobao setiap kali pergi ke sekolah?)",
                    listOf(
                        "很高兴地笑 (Tertawa gembira)",
                        "都会哭 (Pasti menangis)",
                        "大声唱歌 (Bernyanyi kencang)",
                        "在地上睡觉 (Tidur di lantai)"
                    ),
                    1,
                    "Di kalimat ke-6: '她不喜欢学校，每次去学校都会哭'."
                ),
                StoryQuestion(
                    "q_daughter_4",
                    "为什么小宝特别喜欢晚上？(Mengapa Xiaobao sangat menyukai malam hari?)",
                    listOf(
                        "因为不用吃早饭 (Karena tidak sarapan)",
                        "因为晚上可以听我讲故事 (Karena di malam hari bisa mendengarkan dongeng)",
                        "因为可以看电视 (Bisa nonton TV)",
                        "因为可以去商场 (Bisa ke mall)"
                    ),
                    1,
                    "Di kalimat ke-7: '她喜欢晚上，因为晚上可以听我讲故事'."
                )
            )
        ),

        // Cerita Mandarin Bean 70 (HSK 2): My friend (Teman Baikku Li Ming)
        Story(
            id = "story_my_friend_liming",
            titleHanzi = "我的朋友",
            titlePinyin = "Wǒ de Péngyou",
            titleTranslation = "My friend (Teman Baikku Li Ming)",
            level = "HSK 2",
            category = "Persahabatan & Dilema",
            description = "Kisah persahabatan 4 tahun di bangku kuliah bersama Li Ming yang gemar makan, hingga muncul pengakuan tak terduga tentang sang pacar.",
            coverEmoji = "🤝",
            coverImageRes = R.drawable.cover_story_my_friend_liming,
            estimatedReadMinutes = 2,
            sentences = listOf(
                Sentence(
                    "s_frdlim_1",
                    "我有一个好朋友，他叫李明。",
                    "Wǒ yǒu yí gè hǎo péngyou, tā jiào Lǐ Míng.",
                    "Saya mempunyai seorang sahabat baik, namanya Li Ming.",
                    listOf(
                        WordToken("我有一个", "wǒ yǒu yí gè", "Saya mempunyai seorang", "Kepemilikan sahabat"),
                        WordToken("好朋友", "hǎo péng you", "Sahabat baik", "Pertemanan akrab"),
                        WordToken("他叫", "tā jiào", "Dia bernama", "Nama panggilan"),
                        WordToken("李明", "Lǐ Míng", "Li Ming", "Nama sahabat")
                    )
                ),
                Sentence(
                    "s_frdlim_2",
                    "他是我的大学同学，现在二十二岁，我们认识四年了。",
                    "Tā shì wǒ de dàxué tóngxué, xiànzài èrshí'èr suì, wǒmen rènshi sì nián le.",
                    "Dia adalah teman sekelas saya di universitas, sekarang berusia 22 tahun, kami sudah saling mengenal selama 4 tahun.",
                    listOf(
                        WordToken("他是我的", "tā shì wǒ de", "Dia adalah saya punya", "Kopula relasi"),
                        WordToken("大学同学", "dà xué tóng xué", "Teman kuliah universitas", "Kawan satu almamater"),
                        WordToken("现在", "xiàn zài", "Sekarang", "Waktu kini"),
                        WordToken("二十二岁", "èr shí èr suì", "Dua puluh dua tahun umurnya", "Usia 22 tahun"),
                        WordToken("我们认识", "wǒ men rèn shi", "Kami saling kenal", "Durasi pertemanan"),
                        WordToken("四年了", "sì nián le", "Sudah 4 tahun lamanya", "Lama hubungan")
                    )
                ),
                Sentence(
                    "s_frdlim_3",
                    "李明很高，也很胖。",
                    "Lǐ Míng hěn gāo, yě hěn pàng.",
                    "Tubuh Li Ming sangat tinggi, dan juga cukup gemuk berisi.",
                    listOf(
                        WordToken("李明", "Lǐ Míng", "Li Ming", "Subjek"),
                        WordToken("很高", "hěn gāo", "Sangat tinggi perawakannya", "Ciri fisik tinggi"),
                        WordToken("也很胖", "yě hěn pàng", "Juga bertubuh gemuk kekar", "Ciri fisik berisi")
                    )
                ),
                Sentence(
                    "s_frdlim_4",
                    "他喜欢运动，更喜欢吃东西。",
                    "Tā xǐhuan yùndòng, gèng xǐhuan chī dōngxi.",
                    "Dia gemar berolahraga, namun lebih gemar lagi menyantap makanan enak.",
                    listOf(
                        WordToken("他喜欢运动", "tā xǐ huan yùn dòng", "Dia suka berolahraga fisik", "Hobi olahraga"),
                        WordToken("更喜欢", "gèng xǐ huan", "Bahkan lebih menyukai lagi", "Tingkat preferensi lebih tinggi"),
                        WordToken("吃东西", "chī dōng xi", "Makan makanan lezat", "Hobi kuliner")
                    )
                ),
                Sentence(
                    "s_frdlim_5",
                    "我们经常一起上课、吃饭。",
                    "Wǒmen jīngcháng yìqǐ shàngkè, chīfàn.",
                    "Kami sering bersama-sama masuk kuliah dan makan siang bersama.",
                    listOf(
                        WordToken("我们经常", "wǒ men jīng cháng", "Kami sering kali", "Rutinitas sahabat"),
                        WordToken("一起上课", "yì qǐ shàng kè", "Bersama-sama masuk kelas kuliah", "Aktivitas kampus"),
                        WordToken("吃饭", "chī fàn", "Makan bersama", "Makan siang")
                    )
                ),
                Sentence(
                    "s_frdlim_6",
                    "我们也会一起跑步、看电影。",
                    "Wǒmen yě huì yìqǐ pǎobù, kàn diànyǐng.",
                    "Kami terkadang juga joging lari bersama dan menonton bioskop berdua.",
                    listOf(
                        WordToken("我们也会", "wǒ men yě huì", "Kami juga terkadang", "Kegiatan luang"),
                        WordToken("一起跑步", "yì qǐ pǎo bù", "Bersama-sama joging berlari", "Olahraga lari"),
                        WordToken("看电影", "kàn diàn yǐng", "Menonton film bioskop", "Hiburan santai")
                    )
                ),
                Sentence(
                    "s_frdlim_7",
                    "但是有一天，他说他喜欢我的女朋友，我很不高兴。",
                    "Dànshì yǒu yì tiān, tā shuō tā xǐhuan wǒ de nǚpéngyou, wǒ hěn bù gāoxìng.",
                    "Tetapi pada suatu hari, dia berterus terang bahwa dia menyukai pacar saya, saya pun merasa sangat tidak senang.",
                    listOf(
                        WordToken("但是有一天", "dàn shì yǒu yì tiān", "Tetapi pada suatu hari", "Titik balik konflik drama"),
                        WordToken("他说", "tā shuō", "Dia berkata jujur", "Pengakuan tak terduga"),
                        WordToken("他喜欢", "tā xǐ huan", "Dia menaruh hati / suka pada", "Rasa suka asmara"),
                        WordToken("我的女朋友", "wǒ de nǚ péng you", "Pacar wanita saya", "Kekasih tercinta"),
                        WordToken("我很不高兴", "wǒ hěn bù gāo xìng", "Saya sangat tidak senang / kecewa", "Reaksi emosional")
                    )
                ),
                Sentence(
                    "s_frdlim_8",
                    "我们还能做朋友吗？我不知道怎么办。",
                    "Wǒmen hái néng zuò péngyou ma? Wǒ bù zhīdào zěnme bàn.",
                    "Apakah kami masih bisa berteman lagi? Saya sungguh tidak tahu harus berbuat apa.",
                    listOf(
                        WordToken("我们还能", "wǒ men hái néng", "Apakah kami masih mampu / bisa", "Keraguan hubungan"),
                        WordToken("做朋友吗", "zuò péng you ma", "Tetap menjadi sahabat?", "Pertanyaan dilema pertemanan"),
                        WordToken("我不知道", "wǒ bù zhī dào", "Saya tidak mengerti / tahu", "Ketidakpastian rasa"),
                        WordToken("怎么办", "zěn me bàn", "Bagaimana harus menyikapinya?", "Kebingungan batin")
                    )
                )
            ),
            questions = listOf(
                StoryQuestion(
                    "q_frdlim_1",
                    "李明和作者是什么关系，认识多久了？(Apa hubungan Li Ming dengan penulis dan sudah berapa lama saling kenal?)",
                    listOf(
                        "高中同学，认识一年 (Teman SMA, 1 tahun)",
                        "大学同学，认识四年了 (Teman kuliah, sudah kenal 4 tahun)",
                        "邻居，认识一个月 (Tetangga, 1 bulan)",
                        "同事，认识十年 (Rekan kerja, 10 tahun)"
                    ),
                    1,
                    "Di kalimat ke-2: '他是我的大学同学，现在二十二岁，我们认识四年了'."
                ),
                StoryQuestion(
                    "q_frdlim_2",
                    "李明的外貌和爱好是什么？(Bagaimana penampilan fisik dan kegemaran Li Ming?)",
                    listOf(
                        "矮小瘦弱，爱看书 (Pendek kurus, suka baca)",
                        "很高很胖，喜欢运动，更喜欢吃东西 (Tinggi gemuk, suka olahraga, lebih suka makan)",
                        "只喜欢睡觉 (Hanya suka tidur)",
                        "喜欢开出租车 (Suka menyetir taksi)"
                    ),
                    1,
                    "Di kalimat ke-3 & 4: '李明很高，也很胖。他喜欢运动，更喜欢吃东西'."
                ),
                StoryQuestion(
                    "q_frdlim_3",
                    "发生了什么突发事件让作者感到非常不高兴？(Kejadian mendadak apa yang membuat penulis merasa sangat tidak senang?)",
                    listOf(
                        "李明借钱不还 (Li Ming tidak kembalikan uang)",
                        "李明坦言喜欢上了作者的女朋友 (Li Ming mengaku menyukai pacar perempuan penulis)",
                        "李明打破了杯子 (Li Ming memecahkan cangkir)",
                        "李明上课迟到 (Li Ming telat masuk kelas)"
                    ),
                    1,
                    "Di kalimat ke-7: '但是有一天，他说他喜欢我的女朋友，我很不高兴'."
                ),
                StoryQuestion(
                    "q_frdlim_4",
                    "作者在文章结尾表达了怎样的内心困惑？(Kebingungan batin apa yang diungkapkan penulis di akhir cerita?)",
                    listOf(
                        "不知道买什么衣服 (Bingung beli baju apa)",
                        "不知道两人还能否继续做朋友，不知如何是好 (Bingung apakah mereka masih bisa berteman dan harus bagaimana)",
                        "不知道何时毕业 (Kapan lulus)",
                        "不知道去哪吃饭 (Makan di mana)"
                    ),
                    1,
                    "Di kalimat ke-8: '我们还能做朋友吗？我不知道怎么办'."
                )
            )
        ),

        // Cerita Mandarin Bean 71 (HSK 2): Music (Musik)
        Story(
            id = "story_music",
            titleHanzi = "音乐",
            titlePinyin = "Yīnyuè",
            titleTranslation = "Music (Musik)",
            level = "HSK 2",
            category = "Seni & Hobi",
            description = "Bagaimana melodi musik mewarnai kehidupan sehari-hari: selera musik unik anggota keluarga, kegemaran bernyanyi bersama sahabat, dan ekspresi diri.",
            coverEmoji = "🎵",
            coverImageRes = R.drawable.cover_story_music,
            estimatedReadMinutes = 2,
            sentences = listOf(
                Sentence(
                    "s_music_1",
                    "我喜欢音乐，每天我都听很多音乐。",
                    "Wǒ xǐhuan yīnyuè, měitiān wǒ dōu tīng hěn duō yīnyuè.",
                    "Saya menyukai musik, setiap hari saya mendengarkan begitu banyak lantunan musik.",
                    listOf(
                        WordToken("我喜欢音乐", "wǒ xǐ huan yīn yuè", "Saya menyukai alunan musik", "Kecintaan pada musik"),
                        WordToken("每天我都", "měi tiān wǒ dōu", "Setiap hari saya pasti", "Kebiasaan rutin"),
                        WordToken("听很多音乐", "tīng hěn duō yīn yuè", "Mendengarkan banyak lagu musik", "Asupan nada")
                    )
                ),
                Sentence(
                    "s_music_2",
                    "早上，我在车里听音乐；晚上，我在家听音乐。",
                    "Zǎoshang, wǒ zài chē lǐ tīng yīnyuè; wǎnshang, wǒ zài jiā tīng yīnyuè.",
                    "Pagi hari saya mendengarkan musik di dalam mobil; malam hari saya mendengarkan musik di rumah.",
                    listOf(
                        WordToken("早上", "zǎo shang", "Pagi hari", "Waktu pagi"),
                        WordToken("我在车里", "wǒ zài chē lǐ", "Saya di dalam mobil perjalanan", "Lokasi di mobil"),
                        WordToken("听音乐", "tīng yīn yuè", "Mendengarkan musik", "Aktivitas dengar musik"),
                        WordToken("晚上", "wǎn shang", "Malam hari", "Waktu malam"),
                        WordToken("我在家", "wǒ zài jiā", "Saya di rumah", "Lokasi di rumah"),
                        WordToken("听音乐", "tīng yīn yuè", "Mendengarkan musik", "Relaksasi malam")
                    )
                ),
                Sentence(
                    "s_music_3",
                    "音乐是我的好朋友。",
                    "Yīnyuè shì wǒ de hǎo péngyou.",
                    "Musik adalah sahabat karib bagi jiwa saya.",
                    listOf(
                        WordToken("音乐是", "yīn yuè shì", "Musik adalah", "Kopula"),
                        WordToken("我的好朋友", "wǒ de hǎo péng you", "Sahabat baik saya", "Metafora sahabat sejati")
                    )
                ),
                Sentence(
                    "s_music_4",
                    "我的妈妈喜欢听慢的音乐，爸爸喜欢听老的音乐，姐姐喜欢听快的音乐，这些我都喜欢。",
                    "Wǒ de māma xǐhuan tīng màn de yīnyuè, bàba xǐhuan tīng lǎo de yīnyuè, jiějie xǐhuan tīng kuài de yīnyuè, zhèxiē wǒ dōu xǐhuan.",
                    "Ibu saya suka mendengarkan musik tempo lambat, ayah suka musik tempo lama (klasik), kakak perempuan suka musik bertempo cepat, dan semua jenis musik ini saya sukai.",
                    listOf(
                        WordToken("我的妈妈", "wǒ de mā ma", "Ibu saya", "Subjek ibu"),
                        WordToken("喜欢听", "xǐ huan tīng", "Gemar mendengarkan", "Selera musik"),
                        WordToken("慢的音乐", "màn de yīn yuè", "Musik bertempo lambat tenang", "Musik kalem"),
                        WordToken("爸爸喜欢听", "bà ba xǐ huan tīng", "Ayah suka mendengarkan", "Selera ayah"),
                        WordToken("老的音乐", "lǎo de yīn yuè", "Musik lawas / klasik tempo dulu", "Lagu nostalgia"),
                        WordToken("姐姐喜欢听", "jiě jie xǐ huan tīng", "Kakak perempuan suka mendengar", "Selera kakak"),
                        WordToken("快的音乐", "kuài de yīn yuè", "Musik berirama cepat energik", "Lagu ritme cepat"),
                        WordToken("这些我都喜欢", "zhè xiē wǒ dōu xǐ huan", "Semuanya ini saya sukai", "Apresiasi musik luas")
                    )
                ),
                Sentence(
                    "s_music_5",
                    "因为喜欢听音乐，所以我也喜欢唱歌。",
                    "Yīnwèi xǐhuan tīng yīnyuè, suǒyǐ wǒ yě xǐhuan chànggē.",
                    "Karena senang mendengarkan musik, oleh sebab itu saya juga sangat gemar bernyanyi lagu.",
                    listOf(
                        WordToken("因为喜欢", "yīn wèi xǐ huan", "Karena menyukai", "Pola kausalitas"),
                        WordToken("听音乐", "tīng yīn yuè", "Mendengarkan lagu musik", "Hobi mendengar"),
                        WordToken("所以我也", "suǒ yǐ wǒ yě", "Oleh karena itu saya juga", "Konsekuensi hobi"),
                        WordToken("喜欢唱歌", "xǐ huan chàng gē", "Gemar bernyanyi vokal", "Hobi vokal")
                    )
                ),
                Sentence(
                    "s_music_6",
                    "我会唱很多歌，我和我的好朋友经常一起唱。",
                    "Wǒ huì chàng hěn duō gē, wǒ hé wǒ de hǎo péngyou jīngcháng yìqǐ chàng.",
                    "Saya bisa menyanyikan banyak lagu, saya dan sahabat baik saya sering bernyanyi bersama-sama.",
                    listOf(
                        WordToken("我会唱很多歌", "wǒ huì chàng hěn duō gē", "Saya bisa menyanyikan banyak lagu", "Repertoar lagu"),
                        WordToken("我和我的", "wǒ hé wǒ de", "Saya dan saya punya", "Subjek"),
                        WordToken("好朋友", "hǎo péng you", "Sahabat baik", "Teman duet"),
                        WordToken("经常一起唱", "jīng cháng yì qǐ chàng", "Kerap bernyanyi bersama", "Karaoke bersama sahabat")
                    )
                ),
                Sentence(
                    "s_music_7",
                    "我不会跳舞，但是我觉得不会跳也没关系。",
                    "Wǒ bú huì tiàowǔ, dànshì wǒ juéde bú huì tiào yě méi guānxi.",
                    "Saya memang tidak bisa menari, namun saya merasa tidak bisa menari pun bukanlah suatu masalah.",
                    listOf(
                        WordToken("我不会跳舞", "wǒ bú huì tiào wǔ", "Saya tidak mahir menari dansa", "Keterbatasan gerak tari"),
                        WordToken("但是我觉得", "dàn shì wǒ jué de", "Tetapi menurut pandangan saya", "Sikap santai percaya diri"),
                        WordToken("不会跳", "bú huì tiào", "Tidak pandai menari", "Tanpa tarian"),
                        WordToken("也没关系", "yě méi guān xi", "Juga tidak apa-apa / bukan masalah", "Pikiran positif lega")
                    )
                )
            ),
            questions = listOf(
                StoryQuestion(
                    "q_music_1",
                    "作者的家人各自喜欢听什么类型的音乐？(Jenis musik apa yang disukai masing-masing anggota keluarga penulis?)",
                    listOf(
                        "妈妈喜欢快的，爸爸喜欢慢的 (Ibu suka cepat, ayah suka lambat)",
                        "妈妈喜欢慢的，爸爸喜欢老的，姐姐喜欢快的 (Ibu suka lambat, ayah suka lagu lawas, kakak suka cepat)",
                        "大家都不听音乐 (Semua tidak dengar musik)",
                        "只听摇滚乐 (Hanya rock)"
                    ),
                    1,
                    "Di kalimat ke-4: '我的妈妈喜欢听慢的音乐，爸爸喜欢听老的音乐，姐姐喜欢听快的音乐'."
                ),
                StoryQuestion(
                    "q_music_2",
                    "作者平时在什么时间与地点听音乐？(Kapan dan di mana biasanya penulis mendengarkan musik?)",
                    listOf(
                        "早上在车里，晚上在家 (Pagi di mobil, malam di rumah)",
                        "只在图书馆 (Hanya di perpustakaan)",
                        "在医院里 (Di rumah sakit)",
                        "在游泳池 (Di kolam renang)"
                    ),
                    0,
                    "Di kalimat ke-2: '早上，我在车里听音乐；晚上，我在家听音乐'."
                ),
                StoryQuestion(
                    "q_music_3",
                    "作者虽然很喜欢唱歌，但他有什么不会的才艺？(Meskipun gemar bernyanyi, keterampilan seni apa yang tidak bisa dilakukan penulis?)",
                    listOf(
                        "不会弹琴 (Tidak bisa main piano)",
                        "不会跳舞 (Tidak bisa menari)",
                        "不会画画 (Tidak bisa melukis)",
                        "不会做饭 (Tidak bisa masak)"
                    ),
                    1,
                    "Di kalimat ke-7: '我不会跳舞，但是我觉得不会跳也没关系'."
                ),
                StoryQuestion(
                    "q_music_4",
                    "由文章可知作者对于“不会跳舞”持有什么心态？(Sikap apa yang dimiliki penulis mengenai kekurangannya yang tak bisa menari?)",
                    listOf(
                        "Sangat malu dan sedih",
                        "Santai dan percaya diri, menganggap tidak bisa menari pun tidak masalah asalkan bisa menikmati musik dan bernyanyi",
                        "Memaksa ikut lomba tari",
                        "Berhenti mendengar musik"
                    ),
                    1,
                    "Sikap optimis: '我觉得不会跳也没关系'."
                )
            )
        ),

        // Cerita Mandarin Bean 72 (HSK 2): Mother's Day (Hari Ibu)
        Story(
            id = "story_mothers_day",
            titleHanzi = "母亲节",
            titlePinyin = "Mǔqīnjié",
            titleTranslation = "Mother's Day (Hari Ibu)",
            level = "HSK 2",
            category = "Keluarga & Cinta",
            description = "Ungkapan bakti dan cinta sepasang anak di Hari Ibu: membelikan baju baru yang anggun serta buket bunga segar yang membuat ibu tersenyum bahagia.",
            coverEmoji = "💐",
            coverImageRes = R.drawable.cover_story_mothers_day,
            estimatedReadMinutes = 2,
            sentences = listOf(
                Sentence(
                    "s_motday_1",
                    "今天是母亲节。",
                    "Jīntiān shì Mǔqīnjié.",
                    "Hari ini adalah Hari Ibu.",
                    listOf(
                        WordToken("今天是", "jīn tiān shì", "Hari ini adalah", "Keterangan momen"),
                        WordToken("母亲节", "Mǔ qīn jié", "Hari Ibu", "Hari penghormatan ibu")
                    )
                ),
                Sentence(
                    "s_motday_2",
                    "早上，女儿和儿子对妈妈说：“妈妈，母亲节快乐。我们爱你！”",
                    "Zǎoshang, nǚ'ér hé érzi duì māma shuō: “Māma, Mǔqīnjié kuàilè. Wǒmen ài nǐ!”",
                    "Di pagi hari, anak perempuan dan anak laki-laki kompak berkata pada ibu: “Ibu, Selamat Hari Ibu! Kami sangat mencintaimu!”",
                    listOf(
                        WordToken("早上", "zǎo shang", "Pagi hari", "Waktu pagi"),
                        WordToken("女儿和儿子", "nǚ ér hé ér zi", "Putri dan putra", "Sepasang anak berbakti"),
                        WordToken("对妈妈说", "duì mā ma shuō", "Berkata kepada ibu", "Ucapan cinta kasih"),
                        WordToken("妈妈", "mā ma", "Ibu", "Panggilan hormat ibu"),
                        WordToken("母亲节快乐", "Mǔ qīn jié kuài lè", "Selamat Hari Ibu!", "Salam hari raya ibu"),
                        WordToken("我们爱你", "wǒ men ài nǐ", "Kami mencintaimu!", "Pernyataan cinta anak")
                    )
                ),
                Sentence(
                    "s_motday_3",
                    "妈妈笑了。",
                    "Māma xiào le.",
                    "Ibu pun tersenyum manis bahagia.",
                    listOf(
                        WordToken("妈妈笑了", "mā ma xiào le", "Ibu tersenyum bahagia", "Senyum haru bahagia")
                    )
                ),
                Sentence(
                    "s_motday_4",
                    "女儿给妈妈买了一件衣服，儿子给妈妈买了花，这些都是妈妈喜欢的东西，妈妈非常高兴。",
                    "Nǚ'ér gěi māma mǎi le yí jiàn yīfu, érzi gěi māma mǎi le huā, zhèxiē dōu shì māma xǐhuan de dōngxi, māma fēicháng gāoxìng.",
                    "Putri membelikan sehelai baju baru untuk ibu, putra membelikan rangkaian bunga segar untuk ibu, semua ini adalah benda kesukaan ibu, dan ibu merasa luar biasa gembira.",
                    listOf(
                        WordToken("女儿给妈妈", "nǚ ér gěi mā ma", "Anak perempuan untuk ibu", "Hadiah dari anak perempuan"),
                        WordToken("买了一件衣服", "mǎi le yí jiàn yī fu", "Membelikan sehelai pakaian", "Hadiah pakaian anggun"),
                        WordToken("儿子给妈妈", "ér zi gěi mā ma", "Anak laki-laki untuk ibu", "Hadiah dari anak laki-laki"),
                        WordToken("买了花", "mǎi le huā", "Membeli bunga segar", "Kado buket bunga"),
                        WordToken("这些都是", "zhè xiē dōu shì", "Semuanya ini adalah", "Keselarasan hadiah"),
                        WordToken("妈妈喜欢的东西", "mā ma xǐ huan de dōng xi", "Benda-benda yang disukai ibu", "Hadiah tepat sasaran"),
                        WordToken("妈妈非常高兴", "mā ma fēi cháng gāo xìng", "Ibu merasa sangat gembira bahagia", "Puncak sukacita ibu")
                    )
                )
            ),
            questions = listOf(
                StoryQuestion(
                    "q_motday_1",
                    "今天是什么特别的温情节日？(Hari istimewa apa yang dirayakan dalam cerita?)",
                    listOf(
                        "儿童节 (Hari Anak)",
                        "母亲节 (Hari Ibu)",
                        "教师节 (Hari Guru)",
                        "中秋节 (Festival Musim Gugur)"
                    ),
                    1,
                    "Di kalimat pertama: '今天是母亲节'."
                ),
                StoryQuestion(
                    "q_motday_2",
                    "早上孩子们一见到妈妈就说了什么暖心的话？(Ucapan hangat apa yang disampaikan anak-anak saat bertemu ibu di pagi hari?)",
                    listOf(
                        "我们饿了 (Kami lapar)",
                        "妈妈，母亲节快乐。我们爱你！ (Ibu, Selamat Hari Ibu. Kami mencintaimu!)",
                        "我们要去学校 (Kami mau ke sekolah)",
                        "请给我们零花钱 (Minta uang saku)"
                    ),
                    1,
                    "Di kalimat ke-2: '女儿和儿子对妈妈说：妈妈，母亲节快乐。我们爱你！'."
                ),
                StoryQuestion(
                    "q_motday_3",
                    "女儿和儿子分别送了妈妈什么礼物？(Hadiah apa yang masing-masing diberikan oleh anak perempuan dan anak laki-laki?)",
                    listOf(
                        "女儿送蛋糕，儿子送水果 (Kue dan buah)",
                        "女儿送了一件衣服，儿子送了花 (Anak perempuan memberi baju, anak laki-laki memberi bunga)",
                        "女儿送电脑，儿子送手机 (Laptop dan ponsel)",
                        "女儿送自行车，儿子送书 (Sepeda dan buku)"
                    ),
                    1,
                    "Di kalimat ke-4: '女儿给妈妈买了一件衣服，儿子给妈妈买了花'."
                ),
                StoryQuestion(
                    "q_motday_4",
                    "看到孩子们送上的礼物，妈妈的心情是怎样的？(Bagaimana perasaan ibu melihat hadiah dari anak-anaknya?)",
                    listOf(
                        "生气的 (Marah)",
                        "非常高兴，笑了起来 (Sangat bahagia dan tersenyum haru)",
                        "很累 (Lelah)",
                        "很着急 (Cemas)"
                    ),
                    1,
                    "Di kalimat ke-3 & 4: '妈妈笑了... 妈妈非常高兴'."
                )
            )
        ),

        // Cerita Mandarin Bean 73 (HSK 2): Have meeting (Menghadiri Rapat Penting)
        Story(
            id = "story_have_meeting",
            titleHanzi = "开会",
            titlePinyin = "Kāi Huì",
            titleTranslation = "Have meeting (Menghadiri Rapat Penting)",
            level = "HSK 2",
            category = "Karier & Kantor",
            description = "Ketegangan karyawan yang harus mempersiapkan materi rapat penting dadakan hingga rela makan siang roti kopi di meja kantor demi kesiapan sempurna.",
            coverEmoji = "💼",
            coverImageRes = R.drawable.cover_story_have_meeting,
            estimatedReadMinutes = 2,
            sentences = listOf(
                Sentence(
                    "s_havmeet_1",
                    "今天下午我要开会，这个会很重要，但是我没准备好。",
                    "Jīntiān xiàwǔ wǒ yào kāi huì, zhè gè huì hěn zhòngyào, dànshì wǒ méi zhǔnbèi hǎo.",
                    "Sore hari ini saya harus menghadiri rapat pertemuan, rapat ini sangat penting, namun saya belum menyiapkannya dengan matang.",
                    listOf(
                        WordToken("今天下午", "jīn tiān xià wǔ", "Hari ini sore", "Waktu sore"),
                        WordToken("我要开会", "wǒ yào kāi huì", "Saya harus mengadakan/ikut rapat", "Tanggung jawab kerja"),
                        WordToken("这个会", "zhè gè huì", "Rapat pertemuan ini", "Subjek rapat"),
                        WordToken("很重要", "hěn zhòng yào", "Sangatlah penting krusial", "Tingkat kepentingan tinggi"),
                        WordToken("但是我", "dàn shì wǒ", "Namun saya", "Konjungsi"),
                        WordToken("没准备好", "méi zhǔn bèi hǎo", "Belum tuntas bersiap", "Kondisi belum siap")
                    )
                ),
                Sentence(
                    "s_havmeet_2",
                    "中午，我没时间吃东西，就在办公室里一边喝咖啡、吃面包，一边准备开会的东西。",
                    "Zhōngwǔ, wǒ méi shíjiān chī dōngxi, jiù zài bàngōngshì lǐ yìbiān hē kāfēi, chī miànbāo, yìbiān zhǔnbèi kāi huì de dōngxi.",
                    "Siang hari, saya tidak sempat meluangkan waktu makan keluar, sehingga di dalam ruang kantor saya sambil minum kopi dan mengunyah roti, sambil menyiapkan dokumen rapat.",
                    listOf(
                        WordToken("中午", "zhōng wǔ", "Tengah hari / siang", "Waktu makan siang"),
                        WordToken("我没时间", "wǒ méi shí jiān", "Saya tidak ada waktu luang", "Keterbatasan waktu mepet"),
                        WordToken("吃东西", "chī dōng xi", "Makan makanan", "Makan siang"),
                        WordToken("就在", "jiù zài", "Lantas langsung di", "Lokasi darurat"),
                        WordToken("办公室里", "bàn gōng shì lǐ", "Di dalam ruang kantor", "Tempat kerja"),
                        WordToken("一边喝咖啡", "yì biān hē kā fēi", "Sambil menyeruput kopi penyegar", "Pola sambil lakukan A"),
                        WordToken("吃面包", "chī miàn bāo", "Memakan roti gandum", "Konsumsi cepat"),
                        WordToken("一边准备", "yì biān zhǔn bèi", "Sambil mempersiapkan materi", "Pola sambil lakukan B"),
                        WordToken("开会的东西", "kāi huì de dōng xi", "Segala berkas keperluan rapat", "Materi presentasi")
                    )
                ),
                Sentence(
                    "s_havmeet_3",
                    "终于，在开会前，我准备好了。",
                    "Zhōngyú, zài kāi huì qián, wǒ zhǔnbèi hǎo le.",
                    "Akhirnya, tepat sebelum rapat dimulai, saya berhasil menyiapkannya dengan tuntas dan sempurna.",
                    listOf(
                        WordToken("终于", "zhōng yú", "Akhirnya", "Keberhasilan setelah perjuangan keras"),
                        WordToken("在开会前", "zài kāi huì qián", "Tepat sebelum rapat dimulai", "Keterangan waktu krusial"),
                        WordToken("我准备好了", "wǒ zhǔn bèi hǎo le", "Saya sudah siap tuntas sepenuhnya", "Kelegaan dan kesiapan penuh")
                    )
                )
            ),
            questions = listOf(
                StoryQuestion(
                    "q_havmeet_1",
                    "作者为什么在中午没有时间去正规餐厅吃午饭？(Mengapa penulis tidak sempat pergi makan siang di restoran?)",
                    listOf(
                        "因为餐厅关门了 (Restoran tutup)",
                        "因为下午有非常重要且未准备妥当的会议 (Karena sore hari ada rapat sangat penting yang belum siap)",
                        "因为没有钱 (Tidak ada uang)",
                        "因为想睡觉 (Mau tidur)"
                    ),
                    1,
                    "Di kalimat pertama & 2: '这个会很重要，但是我没准备好。中午，我没时间吃东西'."
                ),
                StoryQuestion(
                    "q_havmeet_2",
                    "作者为了赶时间，在办公室里一边做什么一边准备会议材料？(Apa yang dikonsumsi penulis di meja kantor sambil menyiapkan materi rapat?)",
                    listOf(
                        "一边吃米饭一边唱歌 (Makan nasi sambil bernyanyi)",
                        "一边喝咖啡、吃面包，一边准备开会的东西 (Sambil minum kopi, makan roti, dan menyiapkan materi rapat)",
                        "一边玩手机一边看电视 (Main ponsel sambil nonton TV)",
                        "一边游泳一边喝水 (Berenang sambil minum air)"
                    ),
                    1,
                    "Di kalimat ke-2: '在办公室里一边喝咖啡、吃面包，一边准备开会的东西'."
                ),
                StoryQuestion(
                    "q_havmeet_3",
                    "作者最终是否在开会前完成了所有的准备工作？(Apakah pada akhirnya penulis berhasil menyelesaikan persiapan sebelum rapat dimulai?)",
                    listOf(
                        "没有准备好，被批评了 (Tidak siap dan dimarahi)",
                        "终于，在开会前，准备好了 (Akhirnya, tepat sebelum rapat dimulai, persiapan berhasil dituntaskan)",
                        "会议取消了 (Rapat dibatalkan)",
                        "迟到了两个小时 (Terlambat 2 jam)"
                    ),
                    1,
                    "Di kalimat ke-3: '终于，在开会前，我准备好了'."
                ),
                StoryQuestion(
                    "q_havmeet_4",
                    "句型“一边……一边……”常用来表达什么语法含义？(Pola kalimat '一边……一边……' digunakan untuk menyatakan apa?)",
                    listOf(
                        "Dua tindakan yang dikerjakan secara bersamaan dalam satu waktu (sambil... sambil...)",
                        "Perbandingan ukuran barang",
                        "Urutan hari dalam seminggu",
                        "Negasi kalimat lampau"
                    ),
                    0,
                    "'一边……一边……' (yìbiān... yìbiān...) adalah tata bahasa HSK 2 untuk menyatakan dua aktivitas yang berlangsung simultan/bersamaan."
                )
            )
        )
    )
}
