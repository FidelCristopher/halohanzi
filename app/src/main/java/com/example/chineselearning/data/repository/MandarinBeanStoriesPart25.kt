package com.example.chineselearning.data.repository

import com.example.chineselearning.R
import com.example.chineselearning.data.model.Sentence
import com.example.chineselearning.data.model.Story
import com.example.chineselearning.data.model.StoryQuestion
import com.example.chineselearning.data.model.WordToken

val mandarinBeanStoriesPart25: List<Story> by lazy {
    listOf(
        // Cerita Mandarin Bean 264 (HSK 3): Camel Escaped (Unta Kabur ke Kedai Sate)
        Story(
            id = "story_camel_escaped",
            titleHanzi = "骆驼逃跑进烧烤店",
            titlePinyin = "Luòtuo Táopǎo Jìn Shāokǎodiàn",
            titleTranslation = "Camel Escaped (Unta Kabur Masuk Warung Sate)",
            level = "HSK 3",
            category = "Berita Unik & Hewan",
            description = "Kejadian menggelikan di Jiangsu saat seekor unta kabur dari kebun binatang, jalan-jalan santai di trotoar kota, dan mampir ke sebuah kedai sate barbeku.",
            coverEmoji = "🐫",
            coverImageRes = R.drawable.cover_story_camel_escaped,
            estimatedReadMinutes = 1,
            sentences = listOf(
                Sentence(
                    id = "s_cmlesc_1",
                    hanzi = "江苏某动物园的一只骆驼悄悄越栏出逃，在热闹街头悠闲散步，途中或因走累索性踱步拐进了街边一家烧烤店。",
                    pinyin = "Jiāng sū mǒu dòng wù yuán de yī zhī luò tuo qiāo qiāo yuè lán chū táo zài rè nao jiē tóu yōu xián sàn bù tú zhōng huò yīn zǒu lèi suǒ xì duó bù guǎi jìn le jiē biān yī jiā shāo kǎo diàn",
                    translation = "Di sebuah kebun binatang di Jiangsu, seekor unta diam-diam melarikan diri melompati pagar, berjalan santai di jalanan kota yang ramai, dan mungkin karena merasa lelah berjalan ia melangkah masuk ke dalam sebuah kedai sate barbeku.",
                    tokens = listOf(
                        WordToken("动物园", "dòng wù yuán", "zoo", "Kosakata HSK 2: 动物园"),
                        WordToken("骆驼", "luò tuo", "camel", "Hewan gurun: 骆驼"),
                        WordToken("逃跑", "táo pǎo", "to escape / flee", "Kosakata HSK 3: 逃跑 (táo pǎo)"),
                        WordToken("散步", "sàn bù", "to take a walk", "Kosakata HSK 3: 散步 (sàn bù)"),
                        WordToken("烧烤", "shāo kǎo", "barbecue / BBQ", "Kuliner HSK 3: 烧烤 (shāo kǎo)")
                    )
                ),
                Sentence(
                    id = "s_cmlesc_2",
                    hanzi = "闻讯火速赶抵的民警向附近摊贩借来甜玉米诱导投喂，小心翼翼护送这庞然大物转至开阔安全的空旷地带。",
                    pinyin = "wén xùn huǒ sù gǎn dǐ de mín jǐng xiàng fù jìn tān fàn jiè lái tián yù mǐ yòu dǎo tóu wèi xiǎo xīn yì yì hù sòng zhè páng rán dà wù zhuǎn zhì kāi kuò ān quán de kōng kuàng dì dài",
                    translation = "Mendapat laporan petugas polisi segera tiba dan meminjam jagung manis dari pedagang sekitar untuk memancing sang unta, membimbingnya dengan hati-hati menuju lokasi yang aman dan lapang.",
                    tokens = listOf(
                        WordToken("警察", "jǐng chá", "police officer", "Kosakata HSK 3: 警察 (jǐng chá)"),
                        WordToken("借", "jiè", "to borrow", "Kosakata HSK 3: 借 (jiè)"),
                        WordToken("玉米", "yù mǐ", "corn / maize", "Bahan makanan"),
                        WordToken("安全", "ān quán", "safe / safety", "Kosakata HSK 3: 安全 (ān quán)")
                    )
                ),
                Sentence(
                    id = "s_cmlesc_3",
                    hanzi = "二十分钟后动物园专业饲养人员风尘仆仆驱车抵达，在警民合力协助下顺利将出走的大骆驼安全接运回园。",
                    pinyin = "èr shí fēn zhōng hòu dòng wù yuán zhuān yè sì yǎng rén yuán fēng chén pú pú qū chē dǐ dá zài jǐng mín hé lì xié zhù xià shùn lì jiāng chū zǒu de dà luò tuo ān quán jiē yùn huí yuán",
                    translation = "Dua puluh menit kemudian para pawang kebun binatang tiba dengan mobil khusus, dan dengan kerja sama warga dan polisi unta yang kabur berhasil dibawa pulang kembali ke kebun binatang dengan selamat.",
                    tokens = listOf(
                        WordToken("工作人员", "gōng zuò rén yuán", "staff / personnel", "Kosakata HSK 3: 工作人员"),
                        WordToken("接回", "jiē huí", "pick up and bring back", "Kosakata HSK 2: 接 (jiē)")
                    )
                )
            ),
            questions = listOf(
                StoryQuestion(
                    id = "q_cmlesc_1",
                    questionText = "在江苏省这桩趣味新闻中，从动物园悄悄越狱逃跑并在街头散步的动物是什么？ (Hewan apa yang diam-diam kabur dari kebun binatang di Jiangsu?)",
                    options = listOf("凶猛的东北虎 (Harimau siberia)", "一只温和的大骆驼 (Seekor unta besar)", "金丝猴 (Monyet emas)", "两只大熊猫 (Dua ekor panda)"),
                    correctAnswerIndex = 1,
                    explanation = "Teks menyatakan: '江苏的一个动物园里，一只骆驼悄悄地逃跑了'."
                ),
                StoryQuestion(
                    id = "q_cmlesc_2",
                    questionText = "走在街上的骆驼走累之后，出人意料地踱步走进了街边的什么特色店铺中？ (Ketika lelah berjalan, unta tersebut secara mengejutkan melangkah masuk ke toko apa?)",
                    options = listOf("一家街边烧烤店 (Sebuah kedai sate barbeku)", "一家高档珠宝店 (Toko perhiasan mewah)", "电影院售票处 (Loket bioskop)", "大型新华书店 (Toko buku)"),
                    correctAnswerIndex = 0,
                    explanation = "Teks mencatat: '后来可能是走累了，骆驼走进了街边的一家烧烤店'."
                ),
                StoryQuestion(
                    id = "q_cmlesc_3",
                    questionText = "赶到现场的警察使用什么聪明的食物将这只庞大的骆驼成功引诱至安全地带？ (Makanan apa yang dipinjam polisi untuk memikat unta ke tempat aman?)",
                    options = listOf("烤羊肉串 (Sate kambing)", "从摊贩借来的新鲜玉米 (Jagung manis yang dipinjam dari pedagang)", "冰镇矿泉水 (Air es)", "甜巧克力 (Cokelat manis)"),
                    correctAnswerIndex = 1,
                    explanation = "Teks menyebutkan: '警察赶到后，借来玉米喂骆驼，引导它到安全的地方'."
                )
            )
        ),

        // Cerita Mandarin Bean 265 (HSK 3): Live and Learn (Nenek Usia 70 Raih Sarjana Seni)
        Story(
            id = "story_live_and_learn",
            titleHanzi = "70岁美院双学士",
            titlePinyin = "Qīshí Suì Měiyuàn Shuāng Xuéshì",
            titleTranslation = "Live and Learn (Nenek 70 Tahun Raih Gelar Sarjana Seni Lukis)",
            level = "HSK 3",
            category = "Pendidikan & Sosok Inspiratif",
            description = "Kisah nyata ketekunan Xu Anling: pensiun di usia 58 lalu kembali melukis, belajar di kampus bersama mahasiswa muda, dan sukses lulus sarjana ganda seni rupa di usia 70 tahun.",
            coverEmoji = "🎨",
            coverImageRes = R.drawable.cover_story_live_and_learn,
            estimatedReadMinutes = 2,
            sentences = listOf(
                Sentence(
                    id = "s_lvnln_1",
                    hanzi = "年逾古稀七十岁的上海老人徐安玲今年六月荣获中国美术学院双学士学位，以优异成绩从国画专业圆满毕业。",
                    pinyin = "nián yú gǔ xī qī shí suì de Shàng hǎi lǎo rén Xú Ān líng jīn nián liù yuè róng huò Zhōng guó Měi shù Xué yuàn shuāng xué shì xué wèi yǐ yōu yì chéng jì cóng guó huà zhuān yè yuán mǎn bì yè",
                    translation = "Nenek berusia 70 tahun asal Shanghai, Xu Anling, pada bulan Juni tahun ini resmi meraih gelar sarjana ganda (shuāng xuéshì) dari Akademi Seni Rupa Tiongkok (CAA), lulus dengan gemilang dari jurusan lukisan tradisional Tionghoa.",
                    tokens = listOf(
                        WordToken("获得", "huò dé", "to obtain / acquire", "Kosakata HSK 3: 获得 (huò dé)"),
                        WordToken("学位", "xué wèi", "academic degree", "Istilah akademik: 学位"),
                        WordToken("毕业", "bì yè", "to graduate", "Kosakata HSK 3: 毕业 (bì yè)"),
                        WordToken("出生", "chū shēng", "to be born", "Kosakata HSK 3: 出生 (chū shēng)")
                    )
                ),
                Sentence(
                    id = "s_lvnln_2",
                    hanzi = "入学之初旁人误以为她是考生家长，面对繁重课业她以超常勤勉弥补短板，每日最早踏入画室、最晚熄灯离去。",
                    pinyin = "rù xué zhī chū páng rén wù yǐ wéi tā shì kǎo shēng jiā zhǎng miàn duì fán zhòng kè yè tā yǐ chāo cháng qín miǎn mí bǔ duǎn bǎn měi rì zuì zǎo tà rù huà shì zuì wǎn xī dēng lí qù",
                    translation = "Pada awal kuliah teman-teman muda mengiranya orang tua murid; menghadapi beban studi yang berat ia menunjukkan ketekunan luar biasa melampaui usia, selalu menjadi orang yang pertama tiba di kelas dan yang paling terakhir pulang.",
                    tokens = listOf(
                        WordToken("压力", "yā lì", "pressure", "Kosakata HSK 3: 压力 (yā lì)"),
                        WordToken("年轻", "nián qīng", "young", "Kosakata HSK 3: 年轻 (nián qīng)"),
                        WordToken("勤奋", "qín fèn", "diligent / hardworking", "Kosakata HSK 3: 勤奋"),
                        WordToken("离开", "lí kāi", "to leave / depart", "Kosakata HSK 2: 离开 (lí kāi)")
                    )
                ),
                Sentence(
                    id = "s_lvnln_3",
                    hanzi = "自幼挚爱画艺的她在五十八岁退休后毅然重拾画笔终遂梦想，在全家支持下她将心血佳作赠留故里以谢桑梓之恩。",
                    pinyin = "zì yòu zhì ài huà yì de tā zài wǔ shí bā suì tuì xiū hòu yì rán chóng shí huà bǐ zhōng suì mèng xiǎng zài quán jiā zhī chí xià tā jiāng xīn xuè jiā zuò zèng liú gù lǐ yǐ xiè sāng zǐ zhī ēn",
                    translation = "Sejak kecil gemar melukis namun terhenti oleh tuntutan kerja, di usia 58 tahun setelah pensiun ia mantap mengambil kembali kuas lukisnya; dengan dukungan penuh keluarga kini mimpinya terwujud dan ia mendonasikan sebagian karyanya untuk kampung halaman tempat mimpinya bermula.",
                    tokens = listOf(
                        WordToken("铅笔", "qiān bǐ", "pencil", "Kosakata HSK 2: 铅笔 (qiān bǐ)"),
                        WordToken("重新", "chóng xīn", "again / anew", "Kosakata HSK 3: 重新 (chóng xīn)"),
                        WordToken("支持", "zhī chí", "to support", "Kosakata HSK 3: 支持 (zhī chí)"),
                        WordToken("梦想", "mèng xiǎng", "dream", "Kosakata HSK 3: 梦想 (mèng xiǎng)")
                    )
                )
            ),
            questions = listOf(
                StoryQuestion(
                    id = "q_lvnln_1",
                    questionText = "上海老人徐安玲在年满70岁高龄时，达成了哪项令人由衷钦佩的终身学习求学壮举？ (Prestasi belajar apa yang dicapai Xu Anling di usia 70 tahun?)",
                    options = listOf("横渡英吉利海峡 (Berenang melintasi Selat Inggris)", "从顶级学府中国美术学院中国画专业顺利毕业，并斩获双学士学位 (Lulus dari China Academy of Art jurusan lukisan tradisional dan raih gelar sarjana ganda)", "创办跨国互联网企业 (Mendirikan perusahaan internet)", "打破世界马拉松长跑纪录 (Memecahkan rekor maraton)"),
                    correctAnswerIndex = 1,
                    explanation = "Teks menyatakan: '今年6月，家住上海的一位老人获得了中国美术学院的双学士学位，从中国画专业顺利毕业... 今年已经70岁了'."
                ),
                StoryQuestion(
                    id = "q_lvnln_2",
                    questionText = "面对大学期间繁重专业的专业美术训练，徐安玲是如何克服年龄劣势完成学业的？ (Bagaimana Xu Anling mengatasi kendala usia dalam menyelesaikan tugas-tugas seni yang berat?)",
                    options = listOf("请年轻同学代画作业 (Menyuruh anak muda menggantikan tugasnya)", "以超乎常人的勤奋自律刻苦练习，永远是全班最早到教室、最晚离开教室的人 (Dengan ketekunan luar biasa: selalu jadi orang pertama yang datang ke kelas dan terakhir yang pulang)", "花重金买通考试考官 (Menyuap penguji)", "只选修最简单的理论课程 (Hanya mengambil teori mudah)"),
                    correctAnswerIndex = 1,
                    explanation = "Teks mencatat: '她只能靠更勤奋的练习来弥补自己的不足。她永远是班上第一个到教室，最后一个离开的人'."
                ),
                StoryQuestion(
                    id = "q_lvnln_3",
                    questionText = "徐安玲在忙碌工作大半生之后，是在多少岁那一年下定决心重新拿起画笔追寻童年梦想的？ (Pada usia berapa tahun Xu Anling memutuskan kembali melukis demi mengejar mimpi masa kecilnya?)",
                    options = listOf("30岁 (30 tahun)", "退休后的58岁 (Usia 58 tahun setelah pensiun)", "68岁 (68 tahun)", "刚参加工作20岁 (Usia 20 tahun saat baru kerja)"),
                    correctAnswerIndex = 1,
                    explanation = "Teks menyebutkan: '退休后，在她58岁那年，她重新拿起了画笔。现在她终于顺利毕业了'."
                )
            )
        ),

        // Cerita Mandarin Bean 266 (HSK 3): Stealing (Pencuri Modal Taksi 1000 Yuan)
        Story(
            id = "story_thief_hangzhou",
            titleHanzi = "千里打车来偷窃",
            titlePinyin = "Qiānlǐ Dǎchē Lái Tōuqiè",
            titleTranslation = "Stealing (Kisah Konyol Pencuri Modal Taksi)",
            level = "HSK 3",
            category = "Hukum & Cerita Lucu",
            description = "Tiga pencuri asal Fujian rela merogoh kocek seribu yuan naik taksi ke Hangzhou untuk beraksi; belum genap 7 jam mereka diringkus polisi canggih, tekor 7 yuan dari modal ongkos.",
            coverEmoji = "🚓",
            coverImageRes = R.drawable.cover_story_thief_hangzhou,
            estimatedReadMinutes = 1,
            sentences = listOf(
                Sentence(
                    id = "s_thfhgz_1",
                    hanzi = "三名来自福建的不法之徒在地图上随意选定杭州行窃，不惜豪掷千元巨资包乘出租车连夜跨省潜入作案。",
                    pinyin = "sān míng lái zì Fú jiàn de bù fǎ zhī tú zài dì tú shàng suí biàn xuǎn dìng Háng zhōu xíng qiè bù xī háo zhì qiān yuán jù zī bāo chéng chū zū chē lián yè kuà shěng qián rù zuò àn",
                    translation = "Tiga pelaku pencurian asal Fujian secara asal memilih kota Hangzhou di peta sebagai sasaran, rela merogoh kocek hingga seribu yuan lebih untuk menyewa taksi antarprovinsi demi mencuri di malam hari.",
                    tokens = listOf(
                        WordToken("抓到", "zhuā dào", "to catch / capture", "Kosakata HSK 3: 抓 (zhuā)"),
                        WordToken("小偷", "xiǎo tōu", "thief", "Kosakata HSK 3: 小偷 (xiǎo tōu)"),
                        WordToken("地图", "dì tú", "map", "Kosakata HSK 3: 地图 (dì tú)"),
                        WordToken("随便", "suí biàn", "casually / at random", "Kosakata HSK 3: 随便 (suí biàn)")
                    )
                ),
                Sentence(
                    id = "s_thfhgz_2",
                    hanzi = "孰料杭州街头商铺防范严密、报警器警力密布寸步难行，得手后不足七小时便被当地公安民警神速人赃俱获。",
                    pinyin = "shú liào Háng zhōu jiē tóu shāng pù fáng fàn yán mì bào jǐng qì jǐng lì mì bù cùn bù nán xíng dé shǒu hòu bù zú qī xiǎo shí biàn bèi dāng dì gōng ān mín jǐng shén sù rén zāng jù huò",
                    translation = "Tak disangka toko-toko di Hangzhou memiliki sistem keamanan ketat penuh alarm dan polisi; belum genap 7 jam beraksi, mereka bertiga langsung diringkus oleh kepolisian setempat.",
                    tokens = listOf(
                        WordToken("结果", "jié guǒ", "as a result / result", "Kosakata HSK 3: 结果 (jié guǒ)"),
                        WordToken("报警器", "bào jǐng qì", "alarm / detector", "Alat keamanan"),
                        WordToken("到处", "dào chù", "everywhere", "Kosakata HSK 3: 到处 (dào chù)"),
                        WordToken("逃", "táo", "to escape / flee", "Kosakata HSK 3: 逃 (táo)")
                    )
                ),
                Sentence(
                    id = "s_thfhgz_3",
                    hanzi = "小偷落网后哭诉防盗森严无从脱逃，清点赃物总额折算下来竟比来程单程车费还要倒亏七元钱，贻笑大方。",
                    pinyin = "xiǎo tōu luò wǎng hòu kū sù fáng dào sēn yán wú cóng tuō táo qīng diǎn zāng wù zǒng é zhé suàn xià lái jìng bǐ lái chéng dān chéng chē fèi hái yào dào kuī qī yuán qián yí xiào dà fāng",
                    translation = "Saat tertangkap para pencuri itu mengeluh sistem keamanan kota terlalu ketat; setelah dihitung total nilai barang curian mereka malah tekor 7 yuan dibanding ongkos taksi yang mereka bayarkan saat datang.",
                    tokens = listOf(
                        WordToken("路费", "lù fèi", "travel expenses / fare", "Kosakata transportasi"),
                        WordToken("块", "kuài", "yuan (money)", "Kosakata HSK 1: 块 (kuài)"),
                        WordToken("少", "shǎo", "less / few", "Kosakata HSK 1: 少 (shǎo)")
                    )
                )
            ),
            questions = listOf(
                StoryQuestion(
                    id = "q_thfhgz_1",
                    questionText = "三名来自福建的小偷为了前往杭州实施盗窃，付出了怎样匪夷所思的交通成本？ (Ongkos transportasi tak lazim apa yang dikeluarkan 3 pencuri asal Fujian untuk ke Hangzhou?)",
                    options = listOf("买了三张头等舱飞机票 (Beli 3 tiket pesawat first class)", "花了1000多元包乘出租车长途跨省前往 (Menghabiskan lebih dari 1.000 yuan naik taksi antarprovinsi)", "骑共享单车骑了半个月 (Naik sepeda 2 minggu)", "徒步翻山越岭 (Jalan kaki mendaki gunung)"),
                    correctAnswerIndex = 1,
                    explanation = "Teks menyatakan: '就花了1000多元钱打车来到杭州'."
                ),
                StoryQuestion(
                    id = "q_thfhgz_2",
                    questionText = "小偷作案后潜逃仅过了多长时间，就迅速被杭州警方的严密天网缉捕归案？ (Berapa lama setelah beraksi ketiga pencuri itu langsung berhasil ditangkap polisi?)",
                    options = listOf("整整三年后 (Tiga tahun kemudian)", "不到7个小时 (Kurang dari 7 jam)", "一个月之后 (Sebulan kemudian)", "刚好三天 (Tepat 3 hari)"),
                    correctAnswerIndex = 1,
                    explanation = "Teks mencatat: '结果偷了东西之后不到7个小时，就被警察抓到了'."
                ),
                StoryQuestion(
                    id = "q_thfhgz_3",
                    questionText = "案件最终收场时，最为滑稽荒唐的“经济核算”事实是什么？ (Fakta 'perhitungan finansial' paling menggelikan apa di akhir kasus pencurian ini?)",
                    options = listOf("他们偷到的全是一文不值的假钞 (Mencuri uang palsu)", "偷到的财物总价值算下来，比他们来杭州的路费倒亏了整整7块钱 (Total nilai barang curian malah tekor 7 yuan dibanding ongkos taksi mereka)", "出租车司机把他们当场送到了派出所 (Sopir taksi mengantar ke kantor polisi)", "小偷把自己的金项链遗失在现场 (Pencuri ketinggalan kalung emas)"),
                    correctAnswerIndex = 1,
                    explanation = "Teks diakhiri dengan fakta lucu: '小偷们最后偷到的东西比他们来时的路费还少7块钱' (Nilai barang yang dicuri tekor 7 yuan dibanding modal ongkos perjalanan)."
                )
            )
        ),

        // Cerita Mandarin Bean 267 (HSK 3): The food that helps sleep (Tiga Makanan Alami Pembantu Tidur)
        Story(
            id = "story_sleep_food",
            titleHanzi = "有助睡眠的三种食物",
            titlePinyin = "Yǒuzhù Shuìmián de Sān Zhǒng Shíwù",
            titleTranslation = "The Food That Helps Sleep (Tiga Makanan Pembantu Tidur Nyenyak)",
            level = "HSK 3",
            category = "Kesehatan & Nutrisi",
            description = "Rahasia nutrisi alami pengantar tidur pulas: konsumsi madu hangat penenang saraf, pisang pencegah kegemukan, hingga kacang almond pelega rasa cemas.",
            coverEmoji = "🍯",
            coverImageRes = R.drawable.cover_story_sleep_food,
            estimatedReadMinutes = 1,
            sentences = listOf(
                Sentence(
                    id = "s_slpfod_1",
                    hanzi = "高糖虽令人精神振奋，但夜间适量微量摄取特定甜味滋养品却能安神助眠，例如温水或温热牛奶中溶入一匙纯天然蜂蜜。",
                    pinyin = "gāo táng suī lìng rén jīng shén zhèn fèn dàn yè jiān shì liàng wēi liàng shè qǔ tè dìng tián wèi zī yǎng pǐn què néng ān shén zhù mián lì rú wēn shuǐ huò wēn rè niú nǎi zhōng róng rù yī chí chún tiān rán fēng mì",
                    translation = "Makanan manis berlebih memang bisa memicu rasa gembira bersemangat, namun mengonsumsi sedikit pemanis alami di malam hari justru dapat menenangkan saraf dan membantu tidur nyenyak; contohnya menambahkan sedikit madu ke dalam segelas air hangat atau susu hangat.",
                    tokens = listOf(
                        WordToken("甜", "tián", "sweet", "Kosakata HSK 3: 甜 (tián)"),
                        WordToken("兴奋", "xīng fèn", "excited", "Kosakata HSK 3: 兴奋 (xīng fèn)"),
                        WordToken("睡眠", "shuì mián", "sleep / slumber", "Kosakata HSK 3: 睡眠 (shuì mián)"),
                        WordToken("蜂蜜", "fēng mì", "honey", "Bahan alami: 蜂蜜")
                    )
                ),
                Sentence(
                    id = "s_slpfod_2",
                    hanzi = "第二种优质助眠佳品是富含镁质的香蕉，睡前适度食用不仅能有效抚平心绪，且热量低廉不易蓄积多余脂肪导致长胖。",
                    pinyin = "dì èr zhǒng yōu zhì zhù mián jiā pǐn shì fù hán měi zhì de xiāng jiāo shuì qián shì dù shí yòng bù jǐn néng yǒu xiào fǔ píng xīn xù qiě rè liàng dī lián bù yì xù jī duō yú zhī fáng dǎo zhì zhǎng pàng",
                    translation = "Pilihan sehat kedua adalah buah pisang; menyantap sedikit buah pisang sebelum tidur tidak hanya membantu meningkatkan mutu tidur, melainkan juga tidak mudah membuat tubuh menjadi gemuk.",
                    tokens = listOf(
                        WordToken("香蕉", "xiāng jiāo", "banana", "Kosakata HSK 3: 香蕉 (xiāng jiāo)"),
                        WordToken("长胖", "zhǎng pàng", "to gain weight / put on weight", "Kosakata HSK 3: 胖 (pàng)")
                    )
                ),
                Sentence(
                    id = "s_slpfod_3",
                    hanzi = "第三种妙品为香脆杏仁，日常规律适量品嚼杏仁能卓有成效地舒缓精神焦虑，全方位提升夜间深度睡眠品质。",
                    pinyin = "dì sān zhǒng miào pǐn wèi xiāng cuì xìng rén rì cháng guī lǜ shì liàng pǐn jiáo xìng rén néng zhuó yǒu chéng xiào de shū huǎn jīng shén jiāo lǜ quán fāng wèi tí shēng yè jiān shēn dù shuì mián pǐn zhì",
                    translation = "Makanan ketiga yang berkhasiat adalah kacang almond (xìngrén); rutin mengonsumsi sedikit kacang almond dapat meredakan rasa cemas dan ketegangan pikiran, serta meningkatkan kualitas tidur secara menyeluruh.",
                    tokens = listOf(
                        WordToken("杏仁", "xìng rén", "almond", "Kacang-kacangan bernutrisi"),
                        WordToken("缓解", "huǎn jiě", "to relieve / alleviate", "Kosakata HSK 3: 缓解 (huǎn jiě)"),
                        WordToken("焦虑", "jiāo lǜ", "anxiety", "Kosakata psikologi"),
                        WordToken("提高", "tí gāo", "to improve / increase", "Kosakata HSK 2: 提高 (tí gāo)")
                    )
                )
            ),
            questions = listOf(
                StoryQuestion(
                    id = "q_slpfod_1",
                    questionText = "睡前如果喝水或饮用温牛奶，适量添加哪种天然甜味滋补品能有效改善睡眠质量？ (Menambahkan bahan manis apa ke dalam air/susu hangat sebelum tidur yang terbukti meningkatkan kualitas tidur?)",
                    options = listOf("白砂糖 (Gula pasir putih)", "少量天然蜂蜜 (Sedikit madu alami)", "辣椒酱 (Saus cabai)", "浓缩咖啡原浆 (Ekstrak konsentrat kopi)"),
                    correctAnswerIndex = 1,
                    explanation = "Teks menyatakan: '如果你在晚上喝水或者喝牛奶的时候加一点蜂蜜，那就会让你的睡眠更好'."
                ),
                StoryQuestion(
                    id = "q_slpfod_2",
                    questionText = "文章推荐睡前适量食用香蕉促进安眠，同时还特别指出了香蕉的哪项健康优势？ (Keunggulan gizi apa dari pisang yang disebut dalam teks selain membantu tidur?)",
                    options = listOf("吃了不容易引起身体长胖发福 (Tidak mudah menyebabkan badan bertambah gemuk)", "可以立刻治疗骨折 (Menyembuhkan patah tulang)", "能够替代全部正餐 (Menggantikan seluruh makan)", "可以让视力提高五倍 (Mempertajam mata)"),
                    correctAnswerIndex = 0,
                    explanation = "Teks menjelaskan: '在睡觉前吃一点香蕉也对你的睡眠有帮助，并且吃香蕉还不容易长胖'."
                ),
                StoryQuestion(
                    id = "q_slpfod_3",
                    questionText = "第三种有益安眠的食物“坚果杏仁”在心理生理调节上具有什么独特功效？ (Manfaat fisiologis apa yang dimiliki kacang almond untuk kesehatan tubuh?)",
                    options = listOf("让人通宵保持极度兴奋 (Membuat melek semalaman)", "能帮助有效缓解精神焦虑，从而大幅提高整体睡眠质量 (Membantu meredakan kecemasan pikiran dan mendongkrak mutu tidur lelap)", "使人立刻进入深度昏迷 (Membuat pingsan)", "能让牙齿变白 (Memutihkan gigi)"),
                    correctAnswerIndex = 1,
                    explanation = "Teks menyebutkan: '第三种帮助睡眠的食物是杏仁，平时多吃点杏仁能帮助缓解你的焦虑，提高睡眠的质量'."
                )
            )
        ),

        // Cerita Mandarin Bean 268 (HSK 3): Language Learning Skills (Kiat Menguasai Bahasa Asing)
        Story(
            id = "story_language_skills",
            titleHanzi = "学好外语的实用秘诀",
            titlePinyin = "Xuéhǎo Wàiyǔ de Shíyòng Mìjué",
            titleTranslation = "Language Learning Skills (Kiat Menguasai Bahasa Asing)",
            level = "HSK 3",
            category = "Pendidikan & Metode Belajar",
            description = "Prinsip ilmiah menguasai bahasa baru: usia bukan halangan, kekuatan konsistensi 30 menit setiap hari, serta memanfaatkan media film dan musik untuk membangun lingkungan bahasa.",
            coverEmoji = "🎧",
            coverImageRes = R.drawable.cover_story_language_skills,
            estimatedReadMinutes = 2,
            sentences = listOf(
                Sentence(
                    id = "s_lngskl_1",
                    hanzi = "年龄从不是语言学习的绊脚石，好奇心与恒心才是关键；每日坚持三十至六十分钟，远胜隔三差五的突击恶补。",
                    pinyin = "nián líng cóng bù shì yǔ yán xué xí de bàn jiǎo shí hào qí xīn yǔ héng xīn cái shì guān jiàn měi rì jiān chí sān shí zhì liù shí fēn zhōng yuǎn shèng gé sān chà wǔ de tū jī è bǔ",
                    translation = "Faktor usia sama sekali bukanlah hambatan dalam mempelajari bahasa baru, rasa ingin tahu dan ketekunanlah kuncinya; belajar konsisten 30 hingga 60 menit setiap hari jauh lebih efektif daripada belajar sekaligus dengan jeda waktu panjang.",
                    tokens = listOf(
                        WordToken("掌握", "zhǎng wò", "to master / grasp", "Kosakata HSK 3: 掌握 (zhǎng wò)"),
                        WordToken("好奇心", "hào qí xīn", "curiosity", "Kosakata HSK 3: 好奇心"),
                        WordToken("效果", "xiào guǒ", "effect / result", "Kosakata HSK 3: 效果 (xiào guǒ)"),
                        WordToken("间隔", "jiàn gé", "interval / gap", "Kosakata HSK 3: 间隔")
                    )
                ),
                Sentence(
                    id = "s_lngskl_2",
                    hanzi = "初学者宜从高频简明词句入门，多听多读培养语感，待熟稔后再依托优质教材或网络名师展开系统化阶梯深造。",
                    pinyin = "chū xué zhě yí cóng gāo pín jiǎn míng cí jù rù mén duō tīng duō dú péi yǎng yǔ gǎn dài shú rěn hòu zài yī tuō yōu zhì jiào cái huò wǎng luò míng shī zhǎn kāi xì tǒng huà jiē tī shēn zào",
                    translation = "Pemula sebaiknya memulai dari kosakata dan kalimat sederhana sehari-hari, banyak menyimak dan membaca guna membiasakan telinga, baru kemudian mengikuti kurikulum terstruktur lewat buku atau kursus daring.",
                    tokens = listOf(
                        WordToken("词语", "cí yǔ", "words and phrases", "Kosakata HSK 3: 词语 (cí yǔ)"),
                        WordToken("句子", "jù zi", "sentence", "Kosakata HSK 2: 句子 (jù zi)"),
                        WordToken("熟悉", "shú xi", "familiar with", "Kosakata HSK 3: 熟悉 (shú xi)"),
                        WordToken("课程", "kè chéng", "curriculum / course", "Kosakata HSK 3: 课程 (kè chéng)")
                    )
                ),
                Sentence(
                    id = "s_lngskl_3",
                    hanzi = "营造生动语境乃制胜之道：借助原声影视原声与流行音乐，置身真实生动的交际画面中自然习得地道表达。",
                    pinyin = "yíng zào shēng dòng yǔ jìng nǎi zhì shèng zhī dào jiè zhù yuán shēng yǐng shì yuán shēng yǔ liú xíng yīn yuè zhì shēn zhēn shí shēng dòng de jiāo jì huà miàn zhōng zì rán xí dé dì dao biǎo dá",
                    translation = "Menciptakan lingkungan bahasa yang hidup adalah kunci keberhasilan: memanfaatkan tayangan film dan alunan musik untuk membenamkan diri dalam konteks visual nyata agar dapat menyerap kosakata dan ungkapan autentik secara alami.",
                    tokens = listOf(
                        WordToken("环境", "huán jìng", "environment", "Kosakata HSK 3: 环境 (huán jìng)"),
                        WordToken("真实", "zhēn shí", "authentic / real", "Kosakata HSK 3: 真实 (zhēn shí)"),
                        WordToken("画面", "huà miàn", "scene / picture / screen", "Kosakata HSK 3: 画面 (huà miàn)")
                    )
                )
            ),
            questions = listOf(
                StoryQuestion(
                    id = "q_lngskl_1",
                    questionText = "文章针对外语学习者的年龄问题开宗明义阐明了什么科学观点？ (Pandangan ilmiah apa yang ditegaskan penulis mengenai faktor usia pembelajar bahasa?)",
                    options = listOf("过了18岁就绝对学不会任何新语言 (Lewat 18 tahun mustahil bisa bahasa baru)", "年龄从来不是问题，无论何时起步都不算晚，好奇心与持久努力才是核心 (Usia bukanlah halangan, kapan pun mulai tidak pernah terlambat, rasa ingin tahu dan ketekunanlah kuncinya)", "老年人必须每天背诵词典 (Orang tua harus hafal kamus)", "学外语只能全靠遗传基因 (Bahasa hanya faktor genetika)"),
                    correctAnswerIndex = 1,
                    explanation = "Teks menyatakan: '年龄永远不是问题... 什么时候开始学习都不晚。好奇心和努力才是最重要的'."
                ),
                StoryQuestion(
                    id = "q_lngskl_2",
                    questionText = "在学习频率时间规划上，文章认为哪种作息安排能够产生显著优异的学习成效？ (Jadwal belajar seperti apa yang menghasilkan kemajuan jauh lebih efektif?)",
                    options = listOf("平时完全不碰，每个月月底通宵苦读24小时 (Tidak belajar, hanya kebut semalam 24 jam di akhir bulan)", "每天雷打不动坚持学习半小时或一个小时 (Konsisten belajar setiap hari 30 menit hingga 1 jam)", "一年只在寒假集中学习一次 (Setahun cuma belajar saat libur musim dingin)", "每隔三个月突击做一套试卷 (Tiga bulan sekali ngerjain soal)"),
                    correctAnswerIndex = 1,
                    explanation = "Teks menegaskan: '每天学习一个小时或者半个小时会比间隔很长的学习效果好很多'."
                ),
                StoryQuestion(
                    id = "q_lngskl_3",
                    questionText = "为了沉浸式营造生动自然的语言微环境，文章推荐了哪些富有趣味性的多媒体辅助载体？ (Media menyenangkan apa yang disarankan untuk membangun lingkungan bahasa?)",
                    options = listOf("纯英文学术论文 (Makalah akademis bahasa Inggris)", "欣赏目标外语的优质原声电影、经典流行音乐及电视画面 (Menonton film, mendengar lagu musik, dan tayangan TV berbahasa asli)", "关掉所有音响静坐冥想 (Duduk hening mematikan suara)", "只做枯燥的选择题 (Hanya mengerjakan pilihan ganda)"),
                    correctAnswerIndex = 1,
                    explanation = "Teks menerangkan: '很多人都会通过电影或者音乐来熟悉一门语言。电视上的很多画面也对语言学习者很有帮助，能学习到更真实的、常用的句子和词语'."
                )
            )
        ),

        // Cerita Mandarin Bean 269 (HSK 3): Whose Surname? (Perdebatan Marga Anak)
        Story(
            id = "story_whose_surname",
            titleHanzi = "孩子跟谁姓的风波",
            titlePinyin = "Háizi Gēn Shéi Xìng de Fēngbō",
            titleTranslation = "Whose Surname? (Dilema Marga Anak dalam Pernikahan)",
            level = "HSK 3",
            category = "Keluarga & Hukum Sipil",
            description = "Kasus nyata perdebatan keluarga di Zhejiang mengenai nama marga anak pertama (ikut marga ibu atau ayah): komitmen masa pacaran vs penentangan mertua, hingga berujung perpisahan.",
            coverEmoji = "⚖️",
            coverImageRes = R.drawable.cover_story_whose_surname,
            estimatedReadMinutes = 2,
            sentences = listOf(
                Sentence(
                    id = "s_whosrn_1",
                    hanzi = "浙江一对新婚燕尔仅三个月的小夫妻因新生儿冠姓权争议闹僵，最终竟走向了分道扬镳的离婚结局。",
                    pinyin = "Zhè jiāng yī duì xīn hūn yàn ěr jǐn sān gè yuè de xiǎo fū qī yīn xīn shēng ér guàn xìng quán zhēng yì nào jiāng zuì zhōng jìng zǒu xiàng le fēn dào yáng biāo de lí hūn jié jú",
                    translation = "Sepasang suami istri muda di Zhejiang yang baru menikah tiga bulan berselisih paham hebat terkait marga anak yang baru lahir, hingga akhirnya berujung pada perceraian.",
                    tokens = listOf(
                        WordToken("夫妻", "fū qī", "husband and wife / couple", "Kosakata HSK 3: 夫妻 (fū qī)"),
                        WordToken("姓名", "xìng míng", "name", "Kosakata HSK 2: 名字"),
                        WordToken("离婚", "lí hūn", "to divorce", "Kosakata HSK 3: 离婚 (lí hūn)")
                    )
                ),
                Sentence(
                    id = "s_whosrn_2",
                    hanzi = "昔日热恋期两人曾默契约定首胎随母姓，岂料孩子呱呱坠地后男方父母坚决阻挠反对，女方亦毫不退让寸步不让。",
                    pinyin = "xī rì rè liàn qī liǎng rén céng mò qì yuē dìng shǒu tāi suí mǔ xìng qǐ liào hái zi gū gū zhuì dì hòu nán fāng fù mǔ jiān jué zǔ náo fǎn duì nǚ fāng yì háo bù tuì ràng cùn bù bù ràng",
                    translation = "Saat masih berpacaran mereka telah bersepakat bahwa jika kelak melahirkan anak pertama akan mengikuti marga sang ibu; namun saat bayi lahir orang tua pihak pria menentang keras tradisi tersebut, sementara keluarga wanita pun bersikukuh pada komitmen awal.",
                    tokens = listOf(
                        WordToken("恋爱", "liàn ài", "in love / courtship", "Kosakata HSK 3: 恋爱 (liàn ài)"),
                        WordToken("传统", "chuán tǒng", "tradition / traditional", "Kosakata HSK 3: 传统 (chuán tǒng)"),
                        WordToken("坚持", "jiān chí", "to insist / persist", "Kosakata HSK 3: 坚持 (jiān chí)")
                    )
                ),
                Sentence(
                    id = "s_whosrn_3",
                    hanzi = "现行国家民法典明文规定子女随父姓或母姓均享同等合法权利，但顽固的观念冲突终致家庭隔阂加剧、劳燕分飞。",
                    pinyin = "xiàn xíng guó jiā mín fǎ diǎn míng wén guī dìng zǐ nǚ suí fù xìng huò mǔ xìng jūn xiǎng tóng děng hé fǎ quán lì dàn wán gù de guān niàn chōng tū zhōng zhì jiā tíng gé hé jiā jù láo yàn fēn fēi",
                    translation = "Undang-undang sipil menegaskan bahwa anak berhak mengikuti marga ayah maupun ibu secara bebas menurut kesepakatan orang tua; namun benturan ego keluarga yang meruncing akhirnya merusak hubungan dan membubarkan mahligai rumah tangga.",
                    tokens = listOf(
                        WordToken("法律", "fǎ lǜ", "law", "Kosakata HSK 3: 法律 (fǎ lǜ)"),
                        WordToken("规定", "guī dìng", "stipulation / rule", "Kosakata HSK 3: 规定 (guī dìng)"),
                        WordToken("自由", "zì yóu", "freedom / free", "Kosakata HSK 3: 自由 (zì yóu)"),
                        WordToken("矛盾", "máo dùn", "contradiction / conflict", "Kosakata HSK 3: 矛盾 (máo dùn)")
                    )
                )
            ),
            questions = listOf(
                StoryQuestion(
                    id = "q_whosrn_1",
                    questionText = "导致浙江这对结婚仅3个月的年轻夫妻迅速爆发家庭危机乃至走向离婚的导火索是什么？ (Apa pemicu perselisihan yang membuat pasangan muda di Zhejiang ini bercerai setelah 3 bulan menikah?)",
                    options = listOf("双方因购房地段发生争执 (Ribut lokasi beli rumah)", "对新生儿究竟跟随父亲姓氏还是母亲姓氏的冠姓权争执不下 (Perdebatan marga anak: apakah mengikuti marga ayah atau ibu)", "因为家庭琐事做家务分工不均 (Ribut pembagian cuci piring)", "女方隐瞒了真实工作 (Pihak wanita sembunyikan profesi)"),
                    correctAnswerIndex = 1,
                    explanation = "Teks menyatakan: '因为孩子的姓名问题离婚了... 女方想让孩子跟妈妈姓，而男方的父母却不愿意第一个孩子就跟妈妈姓'."
                ),
                StoryQuestion(
                    id = "q_whosrn_2",
                    questionText = "现行国家法律法规在婴儿姓氏选定权方面有着怎样明确开明的法定条文规定？ (Apa ketetapan hukum undang-undang mengenai penentuan marga bayi?)",
                    options = listOf("强制必须全部跟随祖父姓氏 (Wajib ikut kakek)", "孩子既可以随父姓也可以随母姓，由父母双方自主协商决定 (Anak boleh mengikuti marga ayah maupun ibu sesuai kesepakatan bersama)", "只有男孩可以随父姓 (Hanya anak lelaki yang boleh ikut ayah)", "必须由当地派出所抽签决定 (Diundi polisi)"),
                    correctAnswerIndex = 1,
                    explanation = "Teks menjelaskan: '法律规定孩子可以跟爸爸姓，也可以跟妈妈姓，由父母自己自由决定'."
                ),
                StoryQuestion(
                    id = "q_whosrn_3",
                    questionText = "这则真实生活案例生动反映出当代理念与传统习俗在何种层面的激烈碰撞？ (Kasus ini mencerminkan benturan pandangan modern dan tradisional di aspek apa?)",
                    options = listOf("传统父系宗族冠姓观念与现代男女平等、婚前契约精神之间的观念冲突 (Benturan tradisi patriarki marga ayah vs prinsip kesetaraan gender dan komitmen pranikah)", "古代历法与公历的计算差异 (Perhitungan kalender)", "城乡户籍制度变迁 (Sistem kependudukan kota dan desa)", "中医与西医的医疗分歧 (Perbedaan medis barat dan timur)"),
                    correctAnswerIndex = 0,
                    explanation = "Kisah ini mencerminkan pergeseran nilai dalam masyarakat modern Tiongkok antara tradisi patriarki lama dan kesetaraan gender serta kesepakatan antarpasangan."
                )
            )
        ),

        // Cerita Mandarin Bean 270 (HSK 3): Ask for help (Malu Minta Tolong Saat Tenggelam)
        Story(
            id = "story_ask_for_help_lake",
            titleHanzi = "掉进湖里不好意思呼救",
            titlePinyin = "Diàojìn Hú Lǐ Bù Hǎoyìsi Hūjiù",
            titleTranslation = "Ask for help (Malu Berteriak Minta Tolong Saat Tercebur)",
            level = "HSK 3",
            category = "Berita Unik & Keselamatan",
            description = "Kisah nyata yang bikin tepuk jidat di Nanjing: pemuda 20 tahun terpeleset jatuh ke danau, mengapung selama dua hari tanpa berteriak minta tolong karena malu banyak orang di tepi danau.",
            coverEmoji = "🏊",
            coverImageRes = R.drawable.cover_story_ask_for_help_lake,
            estimatedReadMinutes = 2,
            sentences = listOf(
                Sentence(
                    id = "s_askhlp_1",
                    hanzi = "南京一名二十岁务工青年不慎失足跌落湖泊，在湖心漂流泅浮整整两日终被发现获救，其延误求援的原由令人啼笑皆非。",
                    pinyin = "Nán jīng yī míng èr shí suì wù gōng qīng nián bù shèn shī zú diē luò hú pō zài hú xīn piāo liú qiú fú zhěng zhěng liǎng rì zhōng bèi fā xiàn huò jiù qí yán wù qiú yuán de yuán yóu lìng rén tí xiào jiē fēi",
                    translation = "Seorang pemuda usia 20 tahun di Nanjing tak sengaja terpeleset jatuh ke danau dan mengapung selama dua hari penuh sebelum akhirnya diselamatkan polisi; alasan keterlambatannya meminta tolong membuat orang tertawa geli bercampur heran.",
                    tokens = listOf(
                        WordToken("落水", "luò shuǐ", "fall into water", "Kosakata HSK 3: 落水"),
                        WordToken("湖", "hú", "lake", "Kosakata HSK 3: 湖 (hú)"),
                        WordToken("漂流", "piāo liú", "to drift / float", "Kosakata HSK 3: 漂流 (piāo liú)"),
                        WordToken("哭笑不得", "kū xiào bù dé", "not know whether to laugh or cry", "Peribahasa HSK 3: 哭笑不得")
                    )
                ),
                Sentence(
                    id = "s_askhlp_2",
                    hanzi = "原来该小伙在湖畔拍照失足后惊觉身体竟能自然浮起，但因岸边游人如织，年轻气盛的他深感当众高呼呼救“极为不好意思”。",
                    pinyin = "yuán lái gāi xiǎo huǒ zài hú pàn pāi zhào shī zú hòu jīng jué shēn tǐ jìng néng zì rán fú qǐ dàn yīn àn biān yóu rén rú zhī nián qīng qì shèng de tā shēn gǎn dāng zhòng gāo hū hū jiù jí wéi bù hǎo yì si",
                    translation = "Rupanya setelah terpeleset saat berfoto ia mendapati badannya bisa mengapung di air; namun karena di tepi danau banyak sekali orang berlalu-lalang, rasa gengsi membuatnya merasa 'sangat malu' untuk berteriak minta tolong di depan umum.",
                    tokens = listOf(
                        WordToken("打工", "dǎ gōng", "to work (away from home)", "Kosakata HSK 3: 打工 (dǎ gōng)"),
                        WordToken("拍照", "pāi zhào", "to take pictures", "Kosakata HSK 3: 拍照 (pāi zhào)"),
                        WordToken("不好意思", "bù hǎo yì si", "embarrassed / shy", "Kosakata HSK 3: 不好意思")
                    )
                ),
                Sentence(
                    id = "s_askhlp_3",
                    hanzi = "硬生生强忍漂浮四十八小时后方才微弱呼救，警方严正告诫公众：生命重于泰山，生死危急关头决不可因虚荣羞涩而放弃求救！",
                    pinyin = "yìng shēng shēng qiǎng rěn piāo fú sì shí bā xiǎo shí hòu fāng cái wēi ruò hū jiù jǐng fāng yán zhèng gào jiè gōng zhòng shēng mìng zhòng yú tài shān shēng sǐ wēi jí guān tóu jué bù kě yīn xū róng xiū sè ér fàng qì qiú jiù",
                    translation = "Setelah bertahan mengapung selama dua hari ia barulah berteriak memanggil pertolongan; polisi mengingatkan masyarakat dengan tegas: keselamatan nyawa berada di atas segalanya, dalam situasi bahaya maut jangan pernah gengsi atau malu untuk berteriak minta tolong!",
                    tokens = listOf(
                        WordToken("提醒", "tí xǐng", "to remind / warn", "Kosakata HSK 3: 提醒 (tí xǐng)"),
                        WordToken("危险", "wēi xiǎn", "danger / dangerous", "Kosakata HSK 3: 危险 (wēi xiǎn)"),
                        WordToken("放弃", "fàng qì", "to give up / abandon", "Kosakata HSK 3: 放弃 (fàng qì)")
                    )
                )
            ),
            questions = listOf(
                StoryQuestion(
                    id = "q_askhlp_1",
                    questionText = "南京这位二十岁青年在失足掉进湖水后，之所以两天两夜迟迟不肯大声求救的奇葩原因是什么？ (Alasan ganjil apa yang membuat pemuda ini menolak minta tolong selama 2 hari di danau?)",
                    options = listOf("他在水下发现了大宝藏 (Menemukan harta karun)", "岸边散步游玩的行人太多，他觉得在这么多人面前大声呼救“不好意思”（太丢脸） (Banyak orang di pinggir danau dan ia merasa 'sangat malu' untuk berteriak di depan umum)", "他在水里睡觉不想被打扰 (Tidur di air tidak mau diganggu)", "他以为自己在参加游泳选拔 (Mengira ikut seleksi renang)"),
                    correctAnswerIndex = 1,
                    explanation = "Teks menyatakan: '警察问他为什么不及时求救，他的回答让人哭笑不得：因为人太多，不好意思'."
                ),
                StoryQuestion(
                    id = "q_askhlp_2",
                    questionText = "该青年在湖心水面上不可思议地靠着浮力整整随波漂流了多久才最终获救？ (Berapa lama pemuda tersebut mengapung di danau sebelum akhirnya ditolong?)",
                    options = listOf("两小时 (2 jam)", "整整两天两夜 (Dua hari penuh)", "半个月 (Setengah bulan)", "十分钟 (10 menit)"),
                    correctAnswerIndex = 1,
                    explanation = "Teks mencatat: '在湖里漂流了两天被发现... 在水里漂浮了两天才终于求救'."
                ),
                StoryQuestion(
                    id = "q_askhlp_3",
                    questionText = "当地警方向全体公众敲响了哪记至关重要的生命安全警钟？ (Peringatan keselamatan penting apa yang disampaikan pihak kepolisian?)",
                    options = listOf("禁止所有人靠近湖泊拍照 (Dilarang foto di tepi danau)", "遇有突发危险绝不可因毫无意义的虚荣害羞（不好意思）而贻误生命、放弃呼救 (Dalam bahaya jangan pernah menahan diri minta tolong hanya karena rasa malu/gengsi)", "湖里不准养鱼 (Danau dilarang ternak ikan)", "所有人必须学会闭气 (Semua wajib belajar tahan napas)"),
                    correctAnswerIndex = 1,
                    explanation = "Teks menegaskan nasihat polisi: '警察提醒大家，如果有危险，不能因为不好意思而放弃求救！'."
                )
            )
        ),

        // Cerita Mandarin Bean 271 (HSK 3): Qingdao Beer Festival (Festival Bir Internasional Qingdao)
        Story(
            id = "story_qingdao_beer",
            titleHanzi = "青岛国际啤酒节",
            titlePinyin = "Qīngdǎo Guójì Píjiǔjié",
            titleTranslation = "Qingdao Beer Festival (Festival Bir Internasional Qingdao)",
            level = "HSK 3",
            category = "Budaya & Festival Kota",
            description = "Mengenal kemeriahan Festival Bir Qingdao yang melegenda sejak 1991: digelar setiap akhir pekan kedua bulan Agustus selama 16 hari, aneka bir dunia, dan pertunjukan karnaval seni.",
            coverEmoji = "🍺",
            coverImageRes = R.drawable.cover_story_qingdao_beer,
            estimatedReadMinutes = 2,
            sentences = listOf(
                Sentence(
                    id = "s_qndber_1",
                    hanzi = "享誉中外的青岛啤酒是这座滨海名城的闪亮名片，在青岛除传统新春中秋之外，啤酒节已跃升为举城狂欢的标志盛会。",
                    pinyin = "xiǎng yù zhōng wài de Qīng dǎo pí jiǔ shì zhè zuò bīn hǎi míng chéng de shǎn liàng míng piàn zài Qīng dǎo chú chuán tǒng xīn chūn Zhōng qiū zhī wài pí jiǔ jié yǐ yuè shēng wèi jǔ chéng kuáng huān de biāo zhì shèng huì",
                    translation = "Bir Qingdao yang tersohor di dalam dan luar negeri adalah ikon kebanggaan kota pesisir ini; di Qingdao selain tradisi Imlek dan Festival Musim Gugur, Festival Bir telah menjelma menjadi perayaan akbar kebanggaan seluruh warga.",
                    tokens = listOf(
                        WordToken("啤酒", "pí jiǔ", "beer", "Kosakata HSK 3: 啤酒 (pí jiǔ)"),
                        WordToken("有名", "yǒu míng", "famous", "Kosakata HSK 2: 有名 (yǒu míng)"),
                        WordToken("除了...以外", "chú le yǐ wài", "besides / in addition to", "Tata bahasa HSK 3"),
                        WordToken("重要", "zhòng yào", "important", "Kosakata HSK 2: 重要 (zhòng yào)")
                    )
                ),
                Sentence(
                    id = "s_qndber_2",
                    hanzi = "该盛典始于1991年，固定于每年八月的第二个周末盛大开幕，持续长达十六天之久，广邀四海宾朋共襄盛举。",
                    pinyin = "gāi shèng diǎn shǐ yú yī jiǔ jiǔ yī nián gù dìng yú měi nián bā yuè de dì èr gè zhōu mò shèng dà kāi mù chí xù cháng dá shí liù tiān zhī jiǔ guǎng yāo sì hǎi bīn péng gòng xiāng shèng jǔ",
                    translation = "Festival akbar ini berakar sejak tahun 1991, resmi dibuka setiap akhir pekan kedua di bulan Agustus, berlangsung semarak selama 16 hari penuh menyambut para pelancong dari seluruh penjuru dunia.",
                    tokens = listOf(
                        WordToken("周末", "zhōu mò", "weekend", "Kosakata HSK 3: 周末 (zhōu mò)"),
                        WordToken("开幕", "kāi mù", "to open (festival / conference)", "Kosakata HSK 3: 开幕"),
                        WordToken("一共", "yī gòng", "in total / altogether", "Kosakata HSK 2: 一共 (yī gòng)")
                    )
                ),
                Sentence(
                    id = "s_qndber_3",
                    hanzi = "游人不仅可畅饮本土纯正青啤，更能品鉴五洲多元佳酿，街巷两旁歌舞巡游精彩纷呈，浓郁醇香的啤酒文化令人如痴如醉。",
                    pinyin = "yóu rén bù jǐn kě chàng yǐn běn tǔ chún zhèng Qīng pí gèng néng pǐn jiàn wǔ zhōu duō yuán jiā niàng jiē xiàng liǎng páng gē wǔ xún yóu jīng cǎi fēn chéng nóng yù chún xiāng de pí jiǔ wén huà lìng rén rú chī rú zuì",
                    translation = "Para pengunjung tidak hanya dapat menikmati bir segar lokal Qingdao, melainkan juga dapat mencicipi aneka racikan bir terkenal dari berbagai belahan benua, ditemani atraksi tarian panggung di sepanjang jalan yang memikat hati.",
                    tokens = listOf(
                        WordToken("世界", "shì jiè", "world", "Kosakata HSK 3: 世界 (shì jiè)"),
                        WordToken("街道", "jiē dào", "street", "Kosakata HSK 3: 街道 (jiē dào)"),
                        WordToken("精彩", "jīng cǎi", "splendid / brilliant", "Kosakata HSK 3: 精彩 (jīng cǎi)"),
                        WordToken("文化", "wén huà", "culture", "Kosakata HSK 2: 文化 (wén huà)")
                    )
                )
            ),
            questions = listOf(
                StoryQuestion(
                    id = "q_qndber_1",
                    questionText = "青岛国际啤酒节这一标志性城市节庆最早创办于哪一年？ (Pada tahun berapakah Festival Bir Internasional Qingdao pertama kali diadakan?)",
                    options = listOf("1991年 (Tahun 1991)", "2008年奥运会 (Tahun Olimpiade 2008)", "1949年 (Tahun 1949)", "2020年 (Tahun 2020)"),
                    correctAnswerIndex = 0,
                    explanation = "Teks menyatakan: '这个啤酒节开始于1991年'."
                ),
                StoryQuestion(
                    id = "q_qndber_2",
                    questionText = "每年的青岛啤酒节通常在几月份正式开幕，全期一共狂欢庆祝多少天？ (Bulan apa festival ini dibuka dan berapa hari durasi perayaannya?)",
                    options = listOf("每年5月开幕，为期3天 (Bulan Mei selama 3 hari)", "每年8月的第二个周末开幕，一共持续狂欢16天 (Bulan Agustus akhir pekan kedua, berlangsung 16 hari)", "每年10月国庆节期间举办一天 (Bulan Oktober sehari)", "农历腊月举办一个月 (Bulan ke-12 sebulan)"),
                    correctAnswerIndex = 1,
                    explanation = "Teks menjelaskan: '每年8月的第二个周末开幕，一共16天'."
                ),
                StoryQuestion(
                    id = "q_qndber_3",
                    questionText = "游客漫步在啤酒节现场，除了能够喝到世界各地的啤酒，还能体验到什么文化盛宴？ (Selain mencicipi aneka bir dunia, atraksi budaya apa yang dapat dinikmati pengunjung di sana?)",
                    options = listOf("全天候学术论文答辩 (Sidang skripsi)", "街道两旁精彩纷呈的歌舞表演与丰富活动，领略浓厚啤酒文化 (Pertunjukan tari, musik jalanan, dan aneka aktivitas seru budaya bir)", "大型计算机编程竞赛 (Lomba koding)", "严格的体能军训 (Latihan fisik militer)"),
                    correctAnswerIndex = 1,
                    explanation = "Teks menerangkan: '街道两边有各种歌舞和活动，非常精彩有意思。你想不想来了解一下啤酒文化？快来参加吧！'."
                )
            )
        ),

        // Cerita Mandarin Bean 272 (HSK 3): My marriage (Refleksi Sepuluh Tahun Pernikahan)
        Story(
            id = "story_my_marriage",
            titleHanzi = "十年婚姻的取舍",
            titlePinyin = "Shí Nián Hūnyīn de Qǔshě",
            titleTranslation = "My Marriage (Refleksi 10 Tahun: Karier & Waktu Bersama)",
            level = "HSK 3",
            category = "Kehidupan & Refleksi Jiwa",
            description = "Refleksi mengharukan seorang dokter wanita: 10 tahun lalu hidup sederhana bahagia bersama suami guru, namun seiring naiknya jabatan menjadi direktur RS dan kepala sekolah, waktu bersama hilang dan berujung perpisahan.",
            coverEmoji = "🕰️",
            coverImageRes = R.drawable.cover_story_my_marriage,
            estimatedReadMinutes = 2,
            sentences = listOf(
                Sentence(
                    id = "s_mymrg_1",
                    hanzi = "新婚初期的日子简朴规律：我是一名普通门诊医生，丈夫是普通中学教员，每日清晨同用早餐、同看新闻、携手通勤，满溢平淡温馨。",
                    pinyin = "xīn hūn chū qī de rì zi jiǎn pǔ guī lǜ wǒ shì yī míng pǔ tōng mén zhěn yī shēng zhàng fu shì pǔ tōng zhōng xué jiào yuán měi rì qīng chén tóng yòng zǎo cān tóng kàn xīn wén xié shǒu tōng qín mǎn yì píng dàn wēn xīn",
                    translation = "Di masa awal pernikahan hari-hari berjalan sederhana teratur: saya seorang dokter umum biasa dan suami seorang guru SMP biasa, setiap pagi sarapan bersama, membaca berita bersama, lalu berangkat kerja berdampingan, hidup terasa sangat bahagia.",
                    tokens = listOf(
                        WordToken("普通", "pǔ tōng", "ordinary / common", "Kosakata HSK 3: 普通 (pǔ tōng)"),
                        WordToken("规律", "guī lǜ", "regular / disciplined", "Kosakata HSK 3: 规律"),
                        WordToken("新闻", "xīn wén", "news", "Kosakata HSK 3: 新闻 (xīn wén)"),
                        WordToken("幸福", "xìng fú", "happy / happiness", "Kosakata HSK 3: 幸福 (xìng fú)")
                    )
                ),
                Sentence(
                    id = "s_mymrg_2",
                    hanzi = "十年光阴飞逝，他擢升为一校之长，我也晋升为医院科室主任，职位显赫繁重，晨起只见空榻，夜归唯余沉睡，倾心促膝之机几近于无。",
                    pinyin = "shí nián guāng yīn fēi shì tā zhuó shēng wèi yī xiào zhī zhǎng wǒ yě jìn shēng wèi yī yuàn kē shì zhǔ rèn zhí wèi xiǎn hè fán zhòng chén qǐ zhǐ jiàn kōng tà yè guī wéi yú chén shuì qīng xīn cù xī zhī jī jǐ jìn yú wú",
                    translation = "Sepuluh tahun berlalu cepat, ia kini telah menjadi kepala sekolah dan saya menjabat sebagai kepala divisi rumah sakit; jabatan semakin tinggi dan kesibukan menyita waktu, bangun pagi tak melihat sosoknya dan pulang malam ia telah tertidur pulas, kesempatan berkomunikasi pun lenyap.",
                    tokens = listOf(
                        WordToken("校长", "xiào zhǎng", "principal / headmaster", "Kosakata HSK 3: 校长 (xiào zhǎng)"),
                        WordToken("主任", "zhǔ rèn", "director / department head", "Kosakata HSK 3: 主任 (zhǔ rèn)"),
                        WordToken("偶尔", "ǒu ěr", "occasionally / once in a while", "Kosakata HSK 3: 偶尔 (ǒu ěr)")
                    )
                ),
                Sentence(
                    id = "s_mymrg_3",
                    hanzi = "曾祈盼减少繁冗会议回归旧日温情，但面对各自倾注心血的辉煌事业谁也不愿割舍止步，两颗渐行渐远的心最终唯有平静选择离婚散场。",
                    pinyin = "céng qí pàn jiǎn shǎo fán rǒng huì yì huí guī jiù rì wēn qíng dàn miàn duì gè zì qīng zhù xīn xuè de huī huáng shì yè shéi yě bù yuàn gē shě zhǐ bù liǎng kē jiàn xíng jiàn yuǎn de xīn zuì zhōng wéi yǒu píng jìng xuǎn zé lí hūn sàn chǎng",
                    translation = "Dulu pernah berharap bisa mengurangi rapat dinas agar bisa sering bersama seperti dahulu, namun di hadapan karier yang dibangun dengan cucuran keringat tak seorang pun rela mengalah dan berkorban, hingga akhirnya kami hanya bisa berpisah melalui perceraian.",
                    tokens = listOf(
                        WordToken("会议", "huì yì", "meeting / conference", "Kosakata HSK 3: 会议 (huì yì)"),
                        WordToken("放弃", "fàng qì", "to give up / renounce", "Kosakata HSK 3: 放弃 (fàng qì)"),
                        WordToken("事业", "shì yè", "career / undertaking", "Kosakata HSK 3: 事业 (shì yè)"),
                        WordToken("离婚", "lí hūn", "divorce", "Kosakata HSK 3: 离婚 (lí hūn)")
                    )
                )
            ),
            questions = listOf(
                StoryQuestion(
                    id = "q_mymrg_1",
                    questionText = "在刚结婚的第一年，女主人公与丈夫原本享受着怎样幸福规律的平凡生活？ (Bagaimana kehidupan awal yang bahagia dari pasutri ini di masa pengantin baru?)",
                    options = listOf("分居两个不同国家 (Tinggal terpisah di dua negara)", "每天早晨起床后一起吃早餐、看新闻，携手出门上班 (Setiap pagi sarapan bersama, nonton berita bersama, dan berangkat kerja berdua)", "每天忙着四处借债 (Sibuk berutang)", "天天吵架不可开交 (Tiap hari bertengkar)"),
                    correctAnswerIndex = 1,
                    explanation = "Teks menyatakan: '刚结婚的时候，我只是一个普通的医生，我丈夫还是个中学老师... 每天早上起床后，一起吃早餐，看新闻，然后一起出门上班，生活很幸福'."
                ),
                StoryQuestion(
                    id = "q_mymrg_2",
                    questionText = "十年过去，当丈夫升为校长、妻子升为医院主任后，夫妻俩的情感交流面临怎样的毁灭性变化？ (Setelah 10 tahun sukses menjadi pimpinan, masalah apa yang menghancurkan komunikasi mereka?)",
                    options = listOf("被调往不同的省份 (Dipindahtugaskan ke provinsi lain)", "工作越来越忙导致起居作息完全错开，连一起吃顿饭交谈的机会都屈指可数 (Saking sibuknya jam istirahat bertolak belakang, bahkan kesempatan makan bersama dan bicara hampir tak ada lagi)", "双方收入完全不够用 (Gaji tidak cukup)", "家里添了六个孩子 (Punya 6 anak)"),
                    correctAnswerIndex = 1,
                    explanation = "Teks menjelaskan: '早上我起床后都看不到他，晚上我回家的时候他已经睡了。我们一起吃饭、交流的机会越来越少，偶尔见面，也不知道应该说什么了'."
                ),
                StoryQuestion(
                    id = "q_mymrg_3",
                    questionText = "原本恩爱的夫妻最终导致和平分手离婚的核心矛盾是什么？ (Akar masalah mendasar apa yang akhirnya membuat keduanya memilih perceraian?)",
                    options = listOf("家庭经济彻底破产 (Bangkrut ekonomi)", "双方都不愿意为了挽救家庭陪伴彼此而放弃或放缓各自成功的事业追求 (Keduanya tak ada yang rela mengalah mengorbankan karier demi menyelamatkan rumah tangga)", "长辈插手逼迫离婚 (Paksaan mertua)", "买房投资失败 (Gagal investasi)"),
                    correctAnswerIndex = 1,
                    explanation = "Teks menyimpulkan: '曾经希望我们可以少一些会议，多一些休息... 但是大家都不愿意放弃自己的事业，最后我们只能离婚了'."
                )
            )
        ),

        // Cerita Mandarin Bean 273 (HSK 3): Return Computer (Pencuri yang Mengembalikan Laptop)
        Story(
            id = "story_return_computer",
            titleHanzi = "有原则的小偷还电脑",
            titlePinyin = "Yǒu Yuánzé de Xiǎotōu Huán Diànnǎo",
            titleTranslation = "Return Computer (Pencuri yang Mengembalikan Laptop)",
            level = "HSK 3",
            category = "Hukum & Kisah Unik",
            description = "Kisah nyata di Shenzhen: seorang pencuri yang menggondol tas berisi uang tunai di mobil yang lupa dikunci, namun satu jam kemudian kembali mengembalikan tas laptop karena khawatir data pemiliknya hilang.",
            coverEmoji = "💻",
            coverImageRes = R.drawable.cover_story_return_computer,
            estimatedReadMinutes = 2,
            sentences = listOf(
                Sentence(
                    id = "s_rtncmp_1",
                    hanzi = "深圳一停车场内车主粗心忘锁车门，车后座电脑包内的大笔现金不翼而飞，失主发觉后紧急向公安民警报警求助。",
                    pinyin = "Shēn zhèn yī tíng chē chǎng nèi chē zhǔ cū xīn wàng suǒ chē mén chē hòu zuò diàn nǎo bāo nèi de dà bǐ xiàn jīn bù yì ér fēi shī zhǔ fā jué hòu jǐn jí xiàng gōng ān mín jǐng bào jǐng qiú zhù",
                    translation = "Di sebuah tempat parkir di Shenzhen, seorang pemilik mobil ceroboh lupa mengunci pintu mobil; sejumlah besar uang tunai di dalam tas laptop di jok belakang raib dicuri, dan sang pemilik lekas melapor ke polisi.",
                    tokens = listOf(
                        WordToken("停车场", "tíng chē chǎng", "parking lot", "Kosakata HSK 3: 停车场"),
                        WordToken("车主", "chē zhǔ", "car owner", "Kosakata HSK 3: 车主"),
                        WordToken("电脑包", "diàn nǎo bāo", "laptop bag", "Benda bawaan"),
                        WordToken("现金", "xiàn jīn", "cash", "Kosakata HSK 3: 现金 (xiàn jīn)")
                    )
                ),
                Sentence(
                    id = "s_rtncmp_2",
                    hanzi = "监控录像完整拍下窃贼提走提包的铁证，但令人称奇的是：失主坚称笔记本电脑及证件原封未动，仅现金被洗劫一空。",
                    pinyin = "jiān kòng lù xiàng wán zhěng pāi xià qiè zéi tí zǒu tí bāo de tiě zhèng dàn lìng rén chēng qí de shì shī zhǔ jiān chēng bǐ jì běn diàn nǎo jí zhèng jiàn yuán fēng wèi dòng jǐn xiàn jīn bèi xǐ jié yī kōng",
                    translation = "Rekaman CCTV dengan jelas memperlihatkan pencuri mengambil tas itu; namun anehnya sang korban menegaskan bahwa laptop dan berkas dokumennya masih utuh di dalam mobil, hanya uang tunai yang raib.",
                    tokens = listOf(
                        WordToken("视频", "shì pín", "video / monitor recording", "Kosakata HSK 3: 视频 (shì pín)"),
                        WordToken("惊讶", "jīng yà", "surprised / amazed", "Kosakata HSK 3: 惊讶 (jīng yà)"),
                        WordToken("继续", "jì xù", "to continue", "Kosakata HSK 3: 继续 (jì xù)")
                    )
                ),
                Sentence(
                    id = "s_rtncmp_3",
                    hanzi = "侦查追踪显示嫌疑人在一小时后悄悄潜回原车归还电脑，受审时坦白：唯恐机内商业机密遗失令失主陷入绝境，遂只取现金物归原主。",
                    pinyin = "zhēn chá zhuī zōng xiǎn shì xián yí rén zài yī xiǎo shí hòu qiāo qiāo qián huí yuán chē guī huán diàn nǎo shòu shěn shí tǎn bái wéi kǒng jī nèi shāng yè jī mì yí shī lìng shī zhǔ xiàn rù jué jìng suì zhǐ qǔ xiàn jīn wù guī yuán zhǔ",
                    translation = "Penyelidikan rekaman menunjukkan pencuri itu satu jam kemudian mengendap-endap kembali ke mobil untuk mengembalikan tas laptop; saat diinterogasi ia mengaku khawatir laptop tersebut memuat dokumen berharga milik korban sehingga ia mengambil uang tunainya saja dan mengembalikan laptop serta kartu identitas.",
                    tokens = listOf(
                        WordToken("资料", "zī liào", "data / material / document", "Kosakata HSK 3: 资料 (zī liào)"),
                        WordToken("着急", "zháo jí", "anxious / frantic", "Kosakata HSK 3: 着急 (zháo jí)"),
                        WordToken("证件", "zhèng jiàn", "certificate / credentials", "Kosakata HSK 3: 证件 (zhèng jiàn)")
                    )
                )
            ),
            questions = listOf(
                StoryQuestion(
                    id = "q_rtncmp_1",
                    questionText = "深圳这位车主在停车场之所以给小偷提供了可乘之机，其个人过失是什么？ (Kelalaian apa dari pemilik mobil di tempat parkir Shenzhen yang memicu pencurian?)",
                    options = listOf("把车钥匙插在车门上 (Kunci mobil tertancap di luar pintu)", "停车离开时粗心大意忘记锁闭车门 (Lupa mengunci pintu mobil saat pergi meninggalkan kendaraannya)", "车窗玻璃完全被砸碎 (Kaca jendela dipecahkan)", "在车顶放了大笔现金 (Taruh uang di atap mobil)"),
                    correctAnswerIndex = 1,
                    explanation = "Teks menyatakan: '一个车主在停车后忘记锁车门，结果放在车后座电脑包里的很多现金被偷了'."
                ),
                StoryQuestion(
                    id = "q_rtncmp_2",
                    questionText = "查看案发监控录像时，让接警办案警察感到极为不可思议的奇特反转画面是什么？ (Adegan aneh apa di rekaman CCTV yang membuat para polisi tercengang?)",
                    options = listOf("小偷在车旁跳舞 (Pencuri joget di samping mobil)", "小偷提走电脑包一个多小时后，居然又折返回来把电脑、手机和重要证件原封不动放回车内 (Pencuri kembali satu jam kemudian mengembalikan tas berisi laptop, HP, dan kartu identitas ke mobil)", "车主和小偷是孪生兄弟 (Korban dan pelaku saudara kembar)", "小偷把自己的私家车留在了现场 (Pencuri meninggalkan mobilnya)"),
                    correctAnswerIndex = 1,
                    explanation = "Teks menerangkan: '一个多小时以后，小偷回到了这辆车旁边，把电脑包放回去了'."
                ),
                StoryQuestion(
                    id = "q_rtncmp_3",
                    questionText = "这名被抓获的小偷在接受审讯时，为自己“偷钱却退还电脑”的行为给出了怎样的荒唐心理辩解？ (Alasan apa yang diungkapkan sang pencuri mengapa ia mengambil uang tapi mengembalikan laptop?)",
                    options = listOf("嫌电脑太重背不动 (Laptop terlalu berat)", "担心电脑里有车主极为重要的工作资料，若丢失车主肯定万分着急，所以只拿走现金、退还电脑与证件 (Khawatir di laptop ada data penting kerjaan korban yang bisa bikin panik, jadi ia cuma ambil uang dan memulangkan laptop)", "发现电脑密码解不开 (Tak bisa buka password)", "电脑品牌太老旧卖不出价 (Merek laptop terlalu kuno)"),
                    correctAnswerIndex = 1,
                    explanation = "Teks menyatakan: '小偷担心电脑里可能有重要的资料，如果电脑不见了，车主肯定很着急，他就拿走了现金，把电脑、手机和一些重要的证件放回了车里'."
                )
            )
        )
    )
}
