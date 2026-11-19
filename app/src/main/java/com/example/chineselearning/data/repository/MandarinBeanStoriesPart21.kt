package com.example.chineselearning.data.repository

import com.example.chineselearning.R
import com.example.chineselearning.data.model.Sentence
import com.example.chineselearning.data.model.Story
import com.example.chineselearning.data.model.StoryQuestion
import com.example.chineselearning.data.model.WordToken

val mandarinBeanStoriesPart21: List<Story> by lazy {
    listOf(
        // Cerita Mandarin Bean 224 (HSK 3): Do you have WeChat account? (Apakah Kamu Punya Akun WeChat?)
        Story(
            id = "story_wechat_account",
            titleHanzi = "你有微信吗？",
            titlePinyin = "Nǐ Yǒu Wēixìn Ma?",
            titleTranslation = "Do you have WeChat account? (Bertukar Kontak WeChat)",
            level = "HSK 3",
            category = "Komunikasi & Teknologi",
            description = "Teman-teman sekelas saling menanyakan jurusan kuliah dan bertukar kontak WeChat menggunakan nomor ponsel, scan QR code, hingga panggilan telepon pertama.",
            coverEmoji = "💬",
            coverImageRes = R.drawable.cover_story_wechat_account,
            estimatedReadMinutes = 2,
            sentences = listOf(
                Sentence(
                    id = "s_wchacc_1",
                    hanzi = "吴小咪的主修专业是汉语言文学，大龙和铃美是边工作边进修中文，苏南则是全职大学本科生。",
                    pinyin = "Wú Xiǎo mī de zhǔ xiū zhuān yè shì Hàn yǔ yán wén xué Dà lóng hé Líng měi shì biān gōng zuò biān jìn xiū Zhōng wén Sū nán zé shì quán zhí dà xué běn kē shēng",
                    translation = "Jurusan utama Wu Xiaomi adalah Sastra Bahasa Mandarin, Da Long dan Ling Mei bekerja sembari memperdalam bahasa Mandarin, sedangkan Su Nan adalah mahasiswa universitas penuh waktu.",
                    tokens = listOf(
                        WordToken("专业", "zhuān yè", "major / specialty", "Kosakata HSK 3: 专业 (zhuān yè)"),
                        WordToken("汉语言文学", "Hàn yǔ yán wén xué", "Chinese language and literature", "Jurusan akademik"),
                        WordToken("大学", "dà xué", "university", "Kosakata HSK 2: 大学 (dà xué)")
                    )
                ),
                Sentence(
                    id = "s_wchacc_2",
                    hanzi = "小咪提议大家互加微信好友保持联络，铃美通过搜索手机号成功添加，大龙则让小咪扫描自己的二维码名片。",
                    pinyin = "Xiǎo mī tí yì dà jiā hù jiā Wēi xìn hǎo yǒu bǎo chí lián luò Líng měi tōng guò sōu suǒ shǒu jī hào chéng gōng tiān jiā Dà lóng zé ràng Xiǎo mī sǎo miáo zì jǐ de èr wéi mǎ míng piàn",
                    translation = "Xiaomi mengusulkan agar mereka saling berteman di WeChat untuk menjaga komunikasi; Ling Mei berhasil ditambahkan lewat pencarian nomor ponsel, sementara Da Long meminta Xiaomi memindai kode QR miliknya.",
                    tokens = listOf(
                        WordToken("微信", "Wēi xìn", "WeChat messaging app", "Aplikasi sosial populer"),
                        WordToken("联系", "lián xì", "to contact", "Kosakata HSK 3: 联系 (lián xì)"),
                        WordToken("扫", "sǎo", "to scan", "Kosakata HSK 3: 扫 (sǎo)"),
                        WordToken("二维码", "èr wéi mǎ", "QR code", "Kosakata HSK 3: 二维码")
                    )
                ),
                Sentence(
                    id = "s_wchacc_3",
                    hanzi = "苏南还没有注册微信账号，便把手机号留给小咪，小咪当场拨通响铃，两人顺利互留了电话号码。",
                    pinyin = "Sū nán hái méi yǒu zhù cè Wēi xìn zhàng hào biàn bǎ shǒu jī hào liú gěi Xiǎo mī Xiǎo mī dāng chǎng bō tōng xiǎng líng liǎng rén shùn lì hù liú le diàn huà hào mǎ",
                    translation = "Su Nan belum mendaftarkan akun WeChat, sehingga ia memberikan nomor ponselnya kepada Xiaomi; Xiaomi langsung melakukan panggilan uji coba dan keduanya berhasil bertukar nomor telepon.",
                    tokens = listOf(
                        WordToken("手机号", "shǒu jī hào", "mobile phone number", "Kosakata HSK 2: 手机号"),
                        WordToken("打给", "dǎ gěi", "to call (someone)", "Kosakata HSK 1: 打 (dǎ)"),
                        WordToken("接到", "jiē dào", "to receive (a call)", "Kosakata HSK 2: 接 (jiē)")
                    )
                )
            ),
            questions = listOf(
                StoryQuestion(
                    id = "q_wchacc_1",
                    questionText = "吴小咪在大学攻读的主修专业是什么？ (Apa jurusan utama yang ditekuni Wu Xiaomi di universitas?)",
                    options = listOf("计算机科学 (Ilmu komputer)", "汉语言文学 (Sastra dan Bahasa Mandarin)", "国际金融与贸易 (Keuangan dan perdagangan internasional)", "临床医学 (Kedokteran klinis)"),
                    correctAnswerIndex = 1,
                    explanation = "Teks menyatakan: '我的专业是汉语言文学'."
                ),
                StoryQuestion(
                    id = "q_wchacc_2",
                    questionText = "大龙通过何种便捷方式让吴小咪成功添加上了自己的微信？ (Cara praktis apa yang digunakan Da Long agar Xiaomi bisa menambahkannya di WeChat?)",
                    options = listOf("让小咪扫描自己的微信个人二维码 (Menyuruh Xiaomi memindai kode QR profil WeChat-nya)", "把微信号手写在纸条上 (Menulis ID di kertas)", "通过蓝牙配对 (Lewat pairing Bluetooth)", "互发电子邮件验证 (Kirim email verifikasi)"),
                    correctAnswerIndex = 0,
                    explanation = "Teks menyebutkan: '来，你扫我的二维码加我'."
                ),
                StoryQuestion(
                    id = "q_wchacc_3",
                    questionText = "苏南因为暂时还没有微信，大家最终通过什么方式建立联系？ (Karena Su Nan belum punya WeChat, bagaimana cara mereka saling terhubung?)",
                    options = listOf("互相邮寄纸质明信片 (Saling kirim kartu pos)", "直接拨打并保存对方的手机号码 (Langsung menelepon dan menyimpan nomor ponselnya)", "相约每天下午在图书馆碰面 (Janjian setiap sore di perpus)", "加QQ好友 (Menambah akun QQ)"),
                    correctAnswerIndex = 1,
                    explanation = "Teks menjelaskan: '我还没有微信。我给你们我的手机号吧... 我打给你了，你接到了吗？'."
                )
            )
        ),

        // Cerita Mandarin Bean 225 (HSK 3): Where is the subway station? (Ke Yu Garden Naik Bus atau Subway?)
        Story(
            id = "story_subway_station",
            titleHanzi = "去豫园怎么走？",
            titlePinyin = "Qù Yùyuán Zěnme Zǒu?",
            titleTranslation = "Where is the subway station? (Panduan Transportasi ke Yu Garden)",
            level = "HSK 3",
            category = "Transportasi & Arah",
            description = "Da Long bertanya arah ke Yu Garden Shanghai: membandingkan bus kota yang memakan waktu tunggu lama vs kombinasi subway Jalur 2 dan Jalur 10 yang jauh lebih efisien.",
            coverEmoji = "🚇",
            coverImageRes = R.drawable.cover_story_subway_station,
            estimatedReadMinutes = 2,
            sentences = listOf(
                Sentence(
                    id = "s_sbystn_1",
                    hanzi = "大龙向热心路人打听去豫园的路线，路人告知友谊大厦有34路公交直达，但手机实时查询显示下一班还要苦等45分钟。",
                    pinyin = "Dà lóng xiàng rè xīn lù rén dǎ ting qù Yù yuán de lù xiàn lù rén gào zhī Yǒu yì Dà shà yǒu sān shí sì lù gōng jiāo zhí dá dàn shǒu jī shí shí chá xún xiǎn shì xià yī bān hái yào kǔ děng sì shí wǔ fēn zhōng",
                    translation = "Da Long menanyakan rute menuju Yu Garden kepada orang di jalan; orang tersebut memberi tahu di Menara Persahabatan ada bus 34 langsung, namun cek langsung di ponsel menunjukkan bus berikutnya masih harus ditunggu 45 menit lagi.",
                    tokens = listOf(
                        WordToken("公交车站", "gōng jiāo chē zhàn", "bus station / stop", "Kosakata HSK 2: 车站"),
                        WordToken("过马路", "guò mǎ lù", "cross the street", "Kosakata HSK 2: 过马路"),
                        WordToken("直达", "zhí dá", "direct / non-stop", "Kosakata HSK 3: 直达 (zhí dá)"),
                        WordToken("查", "chá", "to check / look up", "Kosakata HSK 3: 查 (chá)")
                    )
                ),
                Sentence(
                    id = "s_sbystn_2",
                    hanzi = "路人随即推荐更为快捷的地铁方案：乘2号线到体育馆站换乘10号线直达豫园站，从3号口出站步行700米即到。",
                    pinyin = "lù rén suí jí tuī jiàn gèng wéi kuài jié de dì tiě fāng àn chéng èr hào xiàn dào tǐ yù guǎn zhàn huàn chéng shí hào xiàn zhí dá Yù yuán zhàn cóng sān hào kǒu chū zhàn bù xíng qī bǎi mǐ jí dào",
                    translation = "Orang tersebut lantas merekomendasikan opsi kereta bawah tanah (subway) yang jauh lebih cepat: naik Jalur 2 ke Stasiun Gelanggang Olahraga, transit ke Jalur 10 langsung ke Stasiun Yu Garden, lalu keluar dari Pintu 3 jalan kaki 700 meter.",
                    tokens = listOf(
                        WordToken("地铁", "dì tiě", "subway / metro", "Kosakata HSK 3: 地铁 (dì tiě)"),
                        WordToken("体育馆", "tǐ yù guǎn", "gymnasium / stadium", "Kosakata HSK 3: 体育馆"),
                        WordToken("转", "zhuǎn", "to transfer / turn", "Kosakata HSK 3: 转 (zhuǎn)"),
                        WordToken("米", "mǐ", "meter", "Kosakata HSK 2: 米 (mǐ)")
                    )
                ),
                Sentence(
                    id = "s_sbystn_3",
                    hanzi = "最近的地铁站只需步行十分钟，直行不过马路在前方的路口左拐即可到达，大龙由衷道谢。",
                    pinyin = "zuì jìn de dì tiě zhàn zhǐ xū bù xíng shí fēn zhōng zhí xíng bù guò mǎ lù zài qián miàn de lù kǒu zuǒ guǎi jí kě dào dá Dà lóng yóu zhōng dào xiè",
                    translation = "Stasiun subway terdekat hanya berjarak 10 menit jalan kaki, cukup berjalan lurus tanpa menyeberang jalan lalu belok kiri di persimpangan depan; Da Long pun mengucapkan terima kasih dengan tulus.",
                    tokens = listOf(
                        WordToken("路口", "lù kǒu", "intersection / crossing", "Kosakata HSK 3: 路口 (lù kǒu)"),
                        WordToken("左拐", "zuǒ guǎi", "turn left", "Kosakata HSK 3: 拐 (guǎi)"),
                        WordToken("离", "lí", "distance from / away from", "Kosakata HSK 2: 离 (lí)")
                    )
                )
            ),
            questions = listOf(
                StoryQuestion(
                    id = "q_sbystn_1",
                    questionText = "大龙为何最终放弃了乘坐直达34路公交车前往豫园的打算？ (Mengapa Da Long akhirnya membatalkan rencana naik bus langsung nomor 34 ke Yu Garden?)",
                    options = listOf("公交车上没有空座位 (Bus tidak ada kursi kosong)", "实时查询显示下一班公交车还需要漫长等待45分钟 (Aplikasi menunjukkan bus berikutnya masih harus ditunggu 45 menit)", "车费比地铁贵十倍 (Ongkos bus sepuluh kali lebih mahal)", "公交路线临时取消 (Rute bus ditutup sementara)"),
                    correctAnswerIndex = 1,
                    explanation = "Teks menyatakan: '34路还有45分钟到友谊大厦... 都还要等很久呢。我坐地铁可以到豫园吗？'."
                ),
                StoryQuestion(
                    id = "q_sbystn_2",
                    questionText = "乘坐地铁去往豫园，需要在哪个换乘车站将2号线换乘为10号线？ (Di stasiun transit manakah penumpang harus berpindah dari Jalur 2 ke Jalur 10?)",
                    options = listOf("机场站 (Stasiun Bandara)", "体育馆站 (Stasiun Gelanggang Olahraga / Tiyuguan)", "北京路站 (Stasiun Jalan Beijing)", "友谊大厦站 (Stasiun Gedung Persahabatan)"),
                    correctAnswerIndex = 1,
                    explanation = "Teks menerangkan: '你坐地铁二号线到体育馆站，再转十号线，到豫园站下'."
                ),
                StoryQuestion(
                    id = "q_sbystn_3",
                    questionText = "从大龙当前所在的位置步行去往最近的地铁站需要怎样走？ (Bagaimana rute jalan kaki menuju stasiun subway terdekat dari posisi Da Long?)",
                    options = listOf("过马路右转走两公里 (Seberang jalan belok kanan jalan 2 km)", "往前走不过马路，在前面的路口左拐步行约十分钟 (Jalan lurus tanpa seberang jalan, lalu belok kiri di persimpangan depan sekitar 10 menit)", "必须坐出租车才能到达 (Wajib naik taksi)", "往后退三百米上天桥 (Mundur 300 meter naik jembatan penyeberangan)"),
                    correctAnswerIndex = 1,
                    explanation = "Teks menyatakan: '往前面走，但是不过马路，在前面的路口左拐... 十分种就走到了'."
                )
            )
        ),

        // Cerita Mandarin Bean 226 (HSK 3): Book a hotel (Memesan Kamar Hotel)
        Story(
            id = "story_book_a_hotel",
            titleHanzi = "预订酒店",
            titlePinyin = "Yùdìng Jiǔdiàn",
            titleTranslation = "Book a hotel (Memesan Kamar Hotel)",
            level = "HSK 3",
            category = "Perjalanan & Akomodasi",
            description = "Da Long memesan kamar hotel Sofitel rekomendasi keluarga Yang: fasilitas AC sentral yang nyaman, sarapan variatif, WiFi stabil, hingga harga kamar per malam.",
            coverEmoji = "🏨",
            coverImageRes = R.drawable.cover_story_book_a_hotel,
            estimatedReadMinutes = 2,
            sentences = listOf(
                Sentence(
                    id = "s_bkhot_1",
                    hanzi = "杨欢欢向大龙推荐家附近品质极佳的索菲特酒店，大龙用手机查询，选定了一间舒适的单人房。",
                    pinyin = "Yáng Huān huān xiàng Dà lóng tuī jiàn jiā fù jìn pǐn zhì jí jiā de Suǒ fēi tè jiǔ diàn Dà lóng yòng shǒu jī chá xún xuǎn dìng le yī jiān shū shì de dān rén fáng",
                    translation = "Yang Huanhuan merekomendasikan Hotel Sofitel berkualitas bagus di dekat rumahnya; Da Long mencari lewat ponsel dan memilih memesan satu kamar single (dān rén fáng).",
                    tokens = listOf(
                        WordToken("订", "dìng", "to book / reserve", "Kosakata HSK 3: 订 (dìng)"),
                        WordToken("附近", "fù jìn", "nearby / vicinity", "Kosakata HSK 3: 附近 (fù jìn)"),
                        WordToken("单人房", "dān rén fáng", "single room", "Istilah hotel: 单人房"),
                        WordToken("大床房", "dà chuáng fáng", "king-bed room", "Istilah hotel: 大床房")
                    )
                ),
                Sentence(
                    id = "s_bkhot_2",
                    hanzi = "欢欢介绍该酒店中央空调温度宜人，客房用品干净齐全，早餐种类丰盛且无线网络稳定，服务格外贴心。",
                    pinyin = "Huān huān jiè shào gāi jiǔ diàn zhōng yāng kōng tiáo wēn dù yí rén kè fáng yòng pǐn gān jìng qí quán zǎo cān zhǒng lèi fēng shèng qiě wú xiàn wǎng luò wěn dìng fú wù gé wài tiē xīn",
                    translation = "Huanhuan menceritakan bahwa AC sentral hotel tersebut suhunya pas, perlengkapan kamar bersih dan lengkap, pilihan sarapannya amat berlimpah, sinyal WiFi stabil, serta pelayanannya sangat memuaskan.",
                    tokens = listOf(
                        WordToken("空调", "kōng tiáo", "air conditioner", "Kosakata HSK 3: 空调 (kōng tiáo)"),
                        WordToken("温度", "wēn dù", "temperature", "Kosakata HSK 3: 温度 (wēn dù)"),
                        WordToken("干净", "gān jìng", "clean", "Kosakata HSK 3: 干净 (gān jìng)"),
                        WordToken("齐全", "qí quán", "complete / all-inclusive", "Kosakata HSK 3: 齐全 (qí quán)"),
                        WordToken("服务", "fú wù", "service", "Kosakata HSK 2: 服务 (fú wù)"),
                        WordToken("稳定", "wěn dìng", "stable", "Kosakata HSK 3: 稳定 (wěn dìng)")
                    )
                ),
                Sentence(
                    id = "s_bkhot_3",
                    hanzi = "单人房价格为每晚899元，大龙预订了七个晚上，达达表示饭后开车仅需十分钟即可亲自送大龙前往入住。",
                    pinyin = "dān rén fáng jià gé wèi měi wǎn bā bǎi jiǔ shí jiǔ yuán Dà lóng yù dìng le qī gè wǎn shang Dá dá biǎo shì fàn hòu kāi chē jǐn xū shí fēn zhōng jí kě qīn zì sòng Dà lóng qián wǎng rù zhù",
                    translation = "Harga kamar single adalah 899 yuan per malam, dan Da Long memesan untuk tujuh malam; Dada mengatakan sehabis makan mereka bisa mengantarkan Da Long dengan mobil hanya 10 menit saja.",
                    tokens = listOf(
                        WordToken("元", "yuán", "yuan currency unit", "Kosakata HSK 2: 元 (yuán)"),
                        WordToken("晚上", "wǎn shang", "night", "Kosakata HSK 1: 晚上 (wǎn shang)"),
                        WordToken("开车", "kāi chē", "drive a car", "Kosakata HSK 1: 开车 (kāi chē)")
                    )
                )
            ),
            questions = listOf(
                StoryQuestion(
                    id = "q_bkhot_1",
                    questionText = "大龙在索菲特酒店最终选定预订了哪种房型？ (Tipe kamar apa yang akhirnya dipesan oleh Da Long di Hotel Sofitel?)",
                    options = listOf("总统套房 (Presidential suite)", "单人房 (Kamar single / satu orang)", "豪华双床房 (Twin room mewah)", "三人家庭房 (Family room untuk 3 orang)"),
                    correctAnswerIndex = 1,
                    explanation = "Teks mencatat: '我订一间单人房就行了'."
                ),
                StoryQuestion(
                    id = "q_bkhot_2",
                    questionText = "根据杨欢欢叔叔此前的入住体验，该酒店具有哪些令人满意的优点？ (Menurut ulasan paman Huanhuan, kelebihan apa saja yang dimiliki hotel tersebut?)",
                    options = listOf("价格是全城最便宜的 (Harganya termurah sekota)", "中央空调适宜、用品干净齐全、早餐丰富且Wifi稳定 (AC sentral nyaman, kamar bersih lengkap, sarapan variatif, WiFi stabil)", "允许在房间内做烧烤 (Boleh bakar sate di kamar)", "距离机场步行仅两分钟 (Hanya 2 menit jalan ke bandara)"),
                    correctAnswerIndex = 1,
                    explanation = "Teks merinci: '中央空调温度合适，房间和各种用品又干净又齐全。不但服务很好，酒店早餐的种类也很多，Wifi信号还很稳定'."
                ),
                StoryQuestion(
                    id = "q_bkhot_3",
                    questionText = "大龙以899元一晚的价格总共预订了几个晚上的住宿？ (Berapa malam total reservasi menginap yang dipesan Da Long seharga 899 yuan per malam?)",
                    options = listOf("三个晚上 (3 malam)", "整整七个晚上 (7 malam)", "半个月 (Setengah bulan)", "仅住一个晚上 (Hanya 1 malam)"),
                    correctAnswerIndex = 1,
                    explanation = "Teks menyatakan: '单人房899元一晚，我订了七个晚上'."
                )
            )
        ),

        // Cerita Mandarin Bean 227 (HSK 3): Room Service (Layanan Kamar Hotel)
        Story(
            id = "story_room_service",
            titleHanzi = "客房服务",
            titlePinyin = "Kèfáng Fúwù",
            titleTranslation = "Room Service (Layanan Kamar & Morning Call)",
            level = "HSK 3",
            category = "Perjalanan & Pelayanan",
            description = "Da Long menghubungi resepsionis hotel terkait TV kamar yang mendadak bermasalah, memesan layanan morning call bangun pagi jam 8, santap malam, dan jasa binatu pakaian.",
            coverEmoji = "🛎️",
            coverImageRes = R.drawable.cover_story_room_service,
            estimatedReadMinutes = 2,
            sentences = listOf(
                Sentence(
                    id = "s_rmsrv_1",
                    hanzi = "1513号房的大龙致电酒店前台反映电视故障，前台回电致歉说明维修师傅已下班，将于明日清晨第一时间派员检修。",
                    pinyin = "yī wǔ yī sān hào fáng de Dà lóng zhì diàn jiǔ diàn qián tái fǎn yìng diàn shì gù zhàng qián tái huí diàn zhì qiàn shuō míng wéi xiū shī fu yǐ xià bān jiāng yú míng rì qīng chén dì yī shí jiān pài yuán jiǎn xiū",
                    translation = "Da Long dari kamar 1513 menelpon resepsionis hotel mengabarkan TV kamar yang tidak bisa menyala; resepsionis menelpon balik meminta maaf karena teknisi telah pulang dan berjanji memperbaikinya besok pagi paling awal.",
                    tokens = listOf(
                        WordToken("前台", "qián tái", "front desk / reception", "Kosakata HSK 3: 前台 (qián tái)"),
                        WordToken("检查", "jiǎn chá", "to inspect / check", "Kosakata HSK 3: 检查 (jiǎn chá)"),
                        WordToken("抱歉", "bào qiàn", "sorry / apologize", "Kosakata HSK 3: 抱歉 (bào qiàn)"),
                        WordToken("师傅", "shī fu", "master worker / technician", "Kosakata HSK 3: 师傅 (shī fu)"),
                        WordToken("修理", "xiū lǐ", "to repair / fix", "Kosakata HSK 3: 修理 (xiū lǐ)")
                    )
                ),
                Sentence(
                    id = "s_rmsrv_2",
                    hanzi = "大龙顺便预订了次日早上八点的叫醒服务，并因腹中饥饿点了一份热气腾腾的牛肉汉堡和一盘意大利面。",
                    pinyin = "Dà lóng shùn biàn yù dìng le cì rì zǎo shang bā diǎn de jiào xǐng fú wù bìng yīn fù zhōng jī è diǎn le yī fèn rè qì téng téng de niú ròu hàn bǎo hé yī pán yì dà lì miàn",
                    translation = "Da Long sekalian memesan layanan panggilan bangun pagi (morning call) untuk besok pukul 08:00, serta memesan burger daging sapi dan sepiring spaghetti karena merasa lapar.",
                    tokens = listOf(
                        WordToken("叫醒服务", "jiào xǐng fú wù", "wake-up call service", "Layanan hotel"),
                        WordToken("饿", "è", "hungry", "Kosakata HSK 2: 饿 (è)"),
                        WordToken("汉堡", "hàn bǎo", "hamburger", "Kosakata makanan: 汉堡"),
                        WordToken("盘", "pán", "plate / dish (measure word)", "Kosakata HSK 3: 盘 (pán)"),
                        WordToken("意大利面", "yì dà lì miàn", "spaghetti / pasta", "Kuliner barat")
                    )
                ),
                Sentence(
                    id = "s_rmsrv_3",
                    hanzi = "大龙还请服务员在送餐时顺路收取需要清洗换洗的几件衣物，前台专业礼貌地承诺尽快备妥餐点并送达房中。",
                    pinyin = "Dà lóng hái qǐng fú wù yuán zài sòng cān shí shùn lù shōu qǔ xū yào qīng xǐ huàn xǐ de jǐ jiàn yī fu qián tái zhuān yè lǐ mào de chéng nuò jǐn kuài bèi tuǒ cān diǎn bìng sòng dá fáng zhōng",
                    translation = "Da Long juga meminta agar staf saat mengantar makanan sekalian mengambil beberapa potong pakaian yang hendak dicucikan (laundry); pihak resepsionis dengan sopan berjanji akan mengantarkan hidangan secepatnya.",
                    tokens = listOf(
                        WordToken("清洗", "qīng xǐ", "to wash / laundry", "Kosakata HSK 3: 洗 (xǐ)"),
                        WordToken("顺便", "shùn biàn", "conveniently / in passing", "Kosakata HSK 3: 顺便 (shùn biàn)"),
                        WordToken("尽快", "jǐn kuài", "as soon as possible", "Kosakata HSK 3: 尽快 (jǐn kuài)")
                    )
                )
            ),
            questions = listOf(
                StoryQuestion(
                    id = "q_rmsrv_1",
                    questionText = "大龙房间的电视机当晚无法收看，前台给出的具体解释是什么？ (Alasan apa yang diberikan resepsionis terkait TV Da Long yang tak bisa ditonton malam itu?)",
                    options = listOf("大龙没有缴纳电视费 (Da Long belum bayar iuran TV)", "维修师傅们已经全部下班，必须等到次日上班第一时间检修 (Teknisi reparasi sudah selesai jam kerja, baru bisa diperbaiki besok pagi)", "整座城市停电 (Listrik sekota padam)", "电视机被小偷搬走了 (TV dicuri orang)"),
                    correctAnswerIndex = 1,
                    explanation = "Resepsionis memohon maaf: '很抱歉，由于现在工人师傅们都下班了，今天没办法给您修理电视了。等到明天上班，我们第一时间给您安排修理'."
                ),
                StoryQuestion(
                    id = "q_rmsrv_2",
                    questionText = "大龙向酒店前台预订的次日早晨叫醒服务（Wake-up call）时间是几点？ (Pukul berapa jadwal morning call bangun pagi yang dipesan Da Long?)",
                    options = listOf("早上6点 (Pukul 06:00)", "早上8点整 (Pukul 08:00 tepat)", "上午9点半 (Pukul 09:30)", "早上7点一刻 (Pukul 07:15)"),
                    correctAnswerIndex = 1,
                    explanation = "Da Long meminta: '我需要明天早上八点起床，请到时候叫醒我'."
                ),
                StoryQuestion(
                    id = "q_rmsrv_3",
                    questionText = "除了呼叫客房送餐外，大龙还委托服务员在送餐时顺便处理什么日常事务？ (Selain memesan makanan, bantuan apa yang diminta Da Long saat pengantaran makanan?)",
                    options = listOf("代买香烟和啤酒 (Membelikan rokok dan bir)", "取走需要酒店干洗清洗的几件脏衣服 (Mengambil beberapa helai pakaian kotor untuk dicuci/laundry)", "协助搬运超重行李箱 (Membantu angkat koper berat)", "更换全新的床垫 (Mengganti kasur baru)"),
                    correctAnswerIndex = 1,
                    explanation = "Da Long berpesan: '我还有几件衣服需要清洗，请你们送餐的时候顺便来取吧'."
                )
            )
        ),

        // Cerita Mandarin Bean 228 (HSK 3): Where is this? (Pemandangan Kota Shanghai)
        Story(
            id = "story_where_is_this",
            titleHanzi = "俯瞰上海与文化街",
            titlePinyin = "Fǔkàn Shànghǎi yǔ Wénhuà Jiē",
            titleTranslation = "Where is this? (Indahnya Shanghai & Jalan Budaya)",
            level = "HSK 3",
            category = "Pariwisata & Kota",
            description = "Menikmati lanskap megah Shanghai dari ketinggian: pertemuan Sungai Huangpu dan Sungai Suzhou, Grand Theatre, Museum Astronomi, hingga bersepeda ke Jalan Huaihai.",
            coverEmoji = "🏙️",
            coverImageRes = R.drawable.cover_story_where_is_this,
            estimatedReadMinutes = 2,
            sentences = listOf(
                Sentence(
                    id = "s_wheris_1",
                    hanzi = "站在高处俯瞰，右边是波光粼粼的黄浦江，左边是宁静的苏州河，对面矗立着气派的上海大剧院与上海天文馆。",
                    pinyin = "zhàn zài gāo chù fǔ kàn yòu bian shì bō guāng lín lín de Huáng pǔ Jiāng zuǒ bian shì níng jìng de Sū zhōu Hé duì miàn chù lì zhe qì pài de Shàng hǎi Dà jù yuàn yǔ Shàng hǎi tiān wén guǎn",
                    translation = "Berdiri memandang dari ketinggian, di sisi kanan mengalir Sungai Huangpu yang berkilauan, di sisi kiri membentang Sungai Suzhou yang tenang, dan di seberang sana berdiri megah Shanghai Grand Theatre dan Museum Astronomi Shanghai.",
                    tokens = listOf(
                        WordToken("黄浦江", "Huáng pǔ Jiāng", "Huangpu River", "Nama sungai ikonik Shanghai"),
                        WordToken("苏州河", "Sū zhōu Hé", "Suzhou Creek", "Nama sungai bersejarah"),
                        WordToken("大剧院", "dà jù yuàn", "grand theatre", "Kosakata HSK 3: 剧院 (jù yuàn)"),
                        WordToken("天文馆", "tiān wén guǎn", "planetarium / astronomy museum", "Tempat sains: 天文馆")
                    )
                ),
                Sentence(
                    id = "s_wheris_2",
                    hanzi = "大龙对充满新潮特色小店的文化街格外好奇，欢欢提议下午先去天文馆参观探索，随后再去文化街漫步拍照打卡。",
                    pinyin = "Dà lóng duì chōng mǎn xīn cháo tè sè xiǎo diàn de wén huà jiē gé wài hào qí Huān huān tí yì xià wǔ xiān qù tiān wén guǎn cān guān tàn suǒ suí hòu zài qù wén huà jiē màn bù pāi zhào dǎ kǎ",
                    translation = "Da Long sangat penasaran dengan Jalan Budaya yang dipenuhi butik-butik trendi yang baru buka; Huanhuan mengusulkan siang hari terlebih dahulu mengunjungi Museum Astronomi, baru kemudian jalan-jalan santai sambil berfoto di Jalan Budaya.",
                    tokens = listOf(
                        WordToken("热闹", "rè nao", "lively / bustling", "Kosakata HSK 3: 热闹 (rè nao)"),
                        WordToken("文化", "wén huà", "culture", "Kosakata HSK 2: 文化 (wén huà)"),
                        WordToken("拍照", "pāi zhào", "to take photos", "Kosakata HSK 3: 拍照 (pāi zhào)")
                    )
                ),
                Sentence(
                    id = "s_wheris_3",
                    hanzi = "中午淮海路新开的上海本帮菜馆人气火爆难以叫车，三人决定骑共享单车十几分钟惬意前往，饭前大龙先去书店与咖啡厅中间的洗手间。",
                    pinyin = "zhōng wǔ Huái hǎi lù xīn kāi de Shàng hǎi běn bāng cài guǎn rén qì huǒ bào nán yǐ jiào chē sān rén jué dìng qí gòng xiǎng dān chē shí jǐ fēn zhōng qiè yì qián wǎng fàn qián Dà lóng xiān qù shū diàn hé kā fēi tīng zhōng jiān de xǐ shǒu jiān",
                    translation = "Menjelang siang, restoran kuliner lokal khas Shanghai di Jalan Huaihai ramai pengunjung sehingga sulit menyetop taksi; mereka bertiga memutuskan bersepeda santai 10 menit lebih ke sana, dan sebelum makan Da Long ke toilet yang berada di antara toko buku dan kafe.",
                    tokens = listOf(
                        WordToken("饭馆", "fàn guǎn", "restaurant", "Kosakata HSK 2: 饭馆 (fàn guǎn)"),
                        WordToken("打车", "dǎ chē", "to take a taxi", "Kosakata HSK 2: 打车 (dǎ chē)"),
                        WordToken("共享单车", "gòng xiǎng dān chē", "shared bike", "Kosakata HSK 3: 共享单车"),
                        WordToken("咖啡厅", "kā fēi tīng", "café / coffee shop", "Kosakata HSK 3: 咖啡厅")
                    )
                )
            ),
            questions = listOf(
                StoryQuestion(
                    id = "q_wheris_1",
                    questionText = "站在城市观景高处，主角一行人右侧和左侧分别俯瞰到的是哪两条著名江河？ (Dua sungai ternama apa yang tampak di sebelah kanan dan kiri dari titik ketinggian tersebut?)",
                    options = listOf("长江与黄河 (Sungai Yangtze dan Sungai Kuning)", "右边是黄浦江，左边是苏州河 (Di sebelah kanan Sungai Huangpu, di sebelah kiri Sungai Suzhou)", "珠江与松花江 (Sungai Mutiara dan Sungai Songhua)", "鸭绿江与海河 (Sungai Yalu dan Sungai Haihe)"),
                    correctAnswerIndex = 1,
                    explanation = "Teks menyatakan: '右边这条是黄浦江吧？... 对，右边这条是黄浦江。左边那条是苏州河'."
                ),
                StoryQuestion(
                    id = "q_wheris_2",
                    questionText = "正午前往淮海路品尝本帮特色午餐时，达达为何提议骑共享单车而不是打车？ (Mengapa Dada menyarankan naik sepeda sewaan daripada naik taksi menuju Jalan Huaihai?)",
                    options = listOf("出租车全都拒绝载客 (Semua taksi mogok)", "中午正值用餐高峰期打车困难，骑共享单车十几分钟即可通达且避开拥堵 (Jam makan siang sibuk sulit dapat taksi, naik sepeda belasan menit sudah sampai tanpa macet)", "他们想沿途看电影 (Mau nonton film di jalan)", "天气太冷需要剧烈运动 (Udara terlalu dingin butuh pemanasan)"),
                    correctAnswerIndex = 1,
                    explanation = "Teks menjelaskan: '中午出来吃午饭的人不少，可能不好打车。我们骑共享单车去吧，十几分钟就到了'."
                ),
                StoryQuestion(
                    id = "q_wheris_3",
                    questionText = "根据达达的指引，大龙想要前往的洗手间坐落在什么具体位置？ (Di manakah posisi persis toilet yang ditanyakan oleh Da Long?)",
                    options = listOf("在地铁车厢连接处 (Di sambungan gerbong kereta)", "出门左拐，位于书店和咖啡厅的正中间 (Keluar belok kiri, tepat di antara toko buku dan kafe)", "在大剧院楼顶天台 (Di atap teater)", "在地下停车库底层 (Di basemen parkir)"),
                    correctAnswerIndex = 1,
                    explanation = "Dada menunjukkan jalan: '从这儿出去后左拐，洗手间在书店和咖啡厅的中间'."
                )
            )
        ),

        // Cerita Mandarin Bean 229 (HSK 3): Airport: Drop off (Melepas Keberangkatan di Bandara)
        Story(
            id = "story_airport_drop_off",
            titleHanzi = "机场送机：一路顺风",
            titlePinyin = "Jīchǎng Sòngjī: Yīlù Shùnfēng",
            titleTranslation = "Airport: Drop off (Salam Hangat: Semoga Selamat di Jalan)",
            level = "HSK 3",
            category = "Persahabatan & Bandara",
            description = "Perpisahan hangat di bandara saat Yang Dada mengantar Da Long kembali ke Xi'an: penyerahan oleh-oleh khas Shanghai, boarding gate CZ3524, dan doa keselamatan perjalanan.",
            coverEmoji = "🛫",
            coverImageRes = R.drawable.cover_story_airport_drop_off,
            estimatedReadMinutes = 2,
            sentences = listOf(
                Sentence(
                    id = "s_arpdrp_1",
                    hanzi = "大龙办好了CZ3524次航班的值机手续，预计十点二十五分登机，达达悄悄买来精致的本地特色特产赠予大龙品尝。",
                    pinyin = "Dà lóng bàn hǎo le CZ3524 cì háng bān de zhí jī shǒu xù yù jì shí diǎn èr shí wǔ fēn dēng jī Dá dá qiāo qiāo mǎi lái jīng zhì de běn dì tè sè tè chǎn zèng yǔ Dà lóng pǐn cháng",
                    translation = "Da Long telah menyelesaikan proses check-in penerbangan CZ3524 dengan waktu naik pesawat pukul 10:25; diam-diam Dada telah membelikan oleh-oleh khas daerah setempat agar bisa dicicipi Da Long di rumah.",
                    tokens = listOf(
                        WordToken("值机", "zhí jī", "check-in (airport)", "Kosakata HSK 3: 值机 (zhí jī)"),
                        WordToken("登机", "dēng jī", "boarding", "Kosakata HSK 3: 登机 (dēng jī)"),
                        WordToken("航班", "háng bān", "flight number", "Kosakata HSK 3: 航班 (háng bān)"),
                        WordToken("特产", "tè chǎn", "local specialty / souvenir", "Kosakata HSK 3: 特产 (tè chǎn)")
                    )
                ),
                Sentence(
                    id = "s_arpdrp_2",
                    hanzi = "达达还转交了欢欢因事无法亲自送行而特意准备的送别礼物，大龙十分感激这几天朋友们热情周到的款待与陪伴。",
                    pinyin = "Dá dá hái zhuǎn jiāo le Huān huān yīn shì wú fǎ qīn zì sòng xíng ér tè yì zhǔn bèi de sòng bié lǐ wù Dà lóng shí fēn gǎn jī zhè jǐ tiān péng you men rè qíng zhōu dào de kuǎn dài yǔ péi bàn",
                    translation = "Dada juga menyerahkan bingkisan hadiah dari Huanhuan yang berhalangan hadir mengantar karena ada urusan lain; Da Long sungguh berterima kasih atas jamuan hangat dan pendampingan menyenangkan sahabat-sahabatnya selama beberapa hari ini.",
                    tokens = listOf(
                        WordToken("好不容易", "hǎo bù róng yì", "with great difficulty / rare occasion", "Tata bahasa HSK 3: 好不容易"),
                        WordToken("招待", "zhāo dài", "to receive / entertain guests", "Kosakata HSK 3: 招待 (zhāo dài)"),
                        WordToken("开心", "kāi xīn", "happy", "Kosakata HSK 2: 开心 (kāi xīn)")
                    )
                ),
                Sentence(
                    id = "s_arpdrp_3",
                    hanzi = "大龙热忱欢迎朋友们日后前往古都西安做客游玩，在前往安全检查通道前，达达真挚祝愿他一路顺风、落地报平安。",
                    pinyin = "Dà lóng rè chén huān yíng péng you men rì hòu qián wǎng gǔ dū Xī ān zuò kè yóu wán zài qián wǎng ān quán jiǎn chá tōng dào qián Dá dá zhēn zhì zhù yuàn tā yī lù shùn fēng luò dì bào píng ān",
                    translation = "Da Long menyambut sahabatnya kelak berkunjung tamasya ke kota bersejarah Xi'an; menjelang masuk ke jalur pemeriksaan keamanan (security check), Dada mendoakannya selamat lancar di perjalanan dan lekas mengabari setibanya di Xi'an.",
                    tokens = listOf(
                        WordToken("欢迎", "huān yíng", "welcome", "Kosakata HSK 1: 欢迎 (huān yíng)"),
                        WordToken("安检", "ān jiǎn", "security check", "Kosakata bandara: 安检 (ān jiǎn)"),
                        WordToken("一路顺风", "yī lù shùn fēng", "bon voyage / have a smooth journey", "Doa salam perpisahan HSK 3")
                    )
                )
            ),
            questions = listOf(
                StoryQuestion(
                    id = "q_arpdrp_1",
                    questionText = "杨达达在候机楼大厅悄悄给即将返程的大龙准备了什么心意礼物？ (Oleh-oleh apa yang diam-diam dibelikan Yang Dada untuk Da Long?)",
                    options = listOf("一本厚重的英汉大词典 (Kamus tebal Inggris-Mandarin)", "当地精心采购的特色特产与欢欢托付的礼物 (Oleh-oleh makanan khas setempat dan hadiah titipan dari Huanhuan)", "一双昂贵的篮球鞋 (Sepatu basket mahal)", "一张全新的国内机票 (Tiket pesawat baru)"),
                    correctAnswerIndex = 1,
                    explanation = "Teks menyatakan: '这是刚才在那边买的一些特产，你带回去尝尝。这些是欢欢让我给你的礼物'."
                ),
                StoryQuestion(
                    id = "q_arpdrp_2",
                    questionText = "成语“一路顺风”在机场或车站送别亲友时常用来表达什么祝福？ (Apa makna peribahasa 'yī lù shùn fēng' yang diucapkan saat melepas kawan di bandara?)",
                    options = listOf("祝愿路上有大风吹拂 (Semoga bertiup angin kencang)", "祝愿旅途一帆风顺、平平安安抵达目的地 (Mendoakan perjalanan lancar sentosa dan selamat sampai tujuan)", "提醒飞机不要飞得太快 (Mengingatkan pesawat jangan terlalu cepat)", "祝贺朋友考试拿第一 (Selamat ujian juara pertama)"),
                    correctAnswerIndex = 1,
                    explanation = "'一路顺风' (yī lù shùn fēng) adalah ungkapan klasik Tionghoa untuk mendoakan keselamatan perjalanan bagi seseorang yang bepergian jauh."
                ),
                StoryQuestion(
                    id = "q_arpdrp_3",
                    questionText = "大龙在通过机场安检登机后，与达达约定到达目的地城市后做哪件事？ (Apa yang disepakati Da Long setelah mendarat di kota tujuan?)",
                    options = listOf("立刻在社交平台发视频 (Posting video di sosmed)", "顺利抵达西安后第一时间给达达打电话报平安 (Segera menelepon Dada memberi kabar selamat tiba di Xi'an)", "马上去大吃一顿火锅 (Langsung makan hotpot)", "把行李退回上海 (Mengirim balik koper ke Shanghai)"),
                    correctAnswerIndex = 1,
                    explanation = "Dada berpesan: '行，祝你一路顺风。到了西安就给我打个电话' dan disanggupi oleh Da Long."
                )
            )
        ),

        // Cerita Mandarin Bean 230 (HSK 3): Airport: Pick up (Menjemput Teman di Bandara)
        Story(
            id = "story_airport_pick_up",
            titleHanzi = "机场接机：好久不见",
            titlePinyin = "Jīchǎng Jiējī: Hǎojiǔ Bùjiàn",
            titleTranslation = "Airport: Pick up (Penjemputan di Bandara: Jumpa Kawan Lama)",
            level = "HSK 3",
            category = "Persahabatan & Bandara",
            description = "Dada dan Huanhuan menanti kedatangan Da Long dari Xi'an di Bandara Shanghai: kemacetan jalur baru jalan tol, menanti bagasi, hingga reuni hangat di Gate 11.",
            coverEmoji = "🛬",
            coverImageRes = R.drawable.cover_story_airport_pick_up,
            estimatedReadMinutes = 2,
            sentences = listOf(
                Sentence(
                    id = "s_arppck_1",
                    hanzi = "杨达达打车走新路遭遇严重交通拥堵迟到，欢欢已在航站楼等候，大龙乘坐的CA6686航班两点四十五已降落上海。",
                    pinyin = "Yáng Dá dá dǎ chē zǒu xīn lù zāo yù yán zhòng jiāo tōng yōng dǔ chí dào Huān huān yǐ zài háng zhàn lóu děng hòu Dà lóng chéng zuò de CA6686 háng bān liǎng diǎn sì shí wǔ yǐ jiàng luò Shàng hǎi",
                    translation = "Yang Dada menaiki taksi lewat jalur baru yang mengalami macet parah sehingga terlambat tiba; Huanhuan telah menunggu di terminal bandara, di mana penerbangan CA6686 yang dinaiki Da Long dari Xi'an telah mendarat pukul 14:45.",
                    tokens = listOf(
                        WordToken("堵", "dǔ", "congested / jammed", "Kosakata HSK 3: 堵 (dǔ)"),
                        WordToken("降落", "jiàng luò", "to land (aircraft)", "Kosakata HSK 3: 降落 (jiàng luò)"),
                        WordToken("行李", "xíng li", "luggage", "Kosakata HSK 3: 行李 (xíng li)")
                    )
                ),
                Sentence(
                    id = "s_arppck_2",
                    hanzi = "三点多大龙还没出来，达达宽慰欢欢取行李也需要时间；正准备打电话时大龙来电，相约在11号出口碰头。",
                    pinyin = "sān diǎn duō Dà lóng hái méi chū lái Dá dá kuān wèi Huān huān qǔ xíng li yě xū yào shí jiān zhèng zhǔn bèi dǎ diàn huà shí Dà lóng lái diàn xiāng yuē zài shí yī hào chū kǒu pèng tóu",
                    translation = "Sudah lewat pukul tiga Da Long belum keluar dari pintu kedatangan, Dada menenangkan Huanhuan bahwa pengambilan bagasi koper juga butuh waktu; saat hendak menelepon, Da Long lebih dulu menelpon dan mereka sepakat bertemu di Exit 11.",
                    tokens = listOf(
                        WordToken("着急", "zháo jí", "anxious / impatient", "Kosakata HSK 3: 着急 (zháo jí)"),
                        WordToken("出口", "chū kǒu", "exit", "Kosakata HSK 3: 出口 (chū kǒu)"),
                        WordToken("看见", "kàn jiàn", "to see", "Kosakata HSK 1: 看见 (kàn jiàn)")
                    )
                ),
                Sentence(
                    id = "s_arppck_3",
                    hanzi = "时隔整整两年再次相聚，大家激动万分互道“好久不见”，达达热情招呼大龙回家吃父母精心准备的团聚大餐。",
                    pinyin = "shí gé zhěng zhěng liǎng nián zài cì xiāng jù dà jiā jī dòng wàn fēn hù dào hǎo jiǔ bu jiàn Dá dá rè qíng zhāo hu Dà lóng huí jiā chī fù mǔ jīng xīn zhǔn bèi de tuán jù dà cān",
                    translation = "Setelah dua tahun berlalu akhirnya mereka bisa berkumpul kembali, semuanya dengan gembira saling menyapa 'sudah lama tak bersua', dan Dada dengan hangat mengajak Da Long lekas pulang ke rumah menyantap hidangan lezat yang disiapkan orang tua.",
                    tokens = listOf(
                        WordToken("好久不见", "hǎo jiǔ bu jiàn", "long time no see", "Salam reuni HSK 3"),
                        WordToken("见面", "jiàn miàn", "to meet", "Kosakata HSK 3: 见面 (jiàn miàn)"),
                        WordToken("饿", "è", "hungry", "Kosakata HSK 2: 饿 (è)")
                    )
                )
            ),
            questions = listOf(
                StoryQuestion(
                    id = "q_arppck_1",
                    questionText = "杨达达在前往机场接机时为何会比妹妹欢欢明显晚到？ (Mengapa Yang Dada datang terlambat ke bandara menyusul adiknya?)",
                    options = listOf("睡过头起晚了 (Bangun kesiangan)", "误以为走新修公路会更快，结果遇上严重交通堵塞花了一个多小时 (Mengira lewat jalan baru lebih cepat, ternyata jalanan macet parah memakan waktu sejam lebih)", "地铁坐反了方向 (Naik subway salah arah)", "在路上帮别人换轮胎 (Membantu orang ganti ban)"),
                    correctAnswerIndex = 1,
                    explanation = "Teks menyatakan: '对不起，我来晚了。路上太堵了... 我以为走新路会快一点儿。我今天也是走新路，花了一个多小时才到'."
                ),
                StoryQuestion(
                    id = "q_arppck_2",
                    questionText = "两兄妹与刚下飞机的大龙最终在航站楼的几号出口顺利碰面会合？ (Di pintu keluar nomor berapakah mereka berdua akhirnya bertemu Da Long?)",
                    options = listOf("3号出口 (Exit 3)", "11号出口 (Exit 11)", "8号行李转盘 (Baggage claim 8)", "地下车库入口 (Pintu masuk parkir)"),
                    correctAnswerIndex = 1,
                    explanation = "Dada memberi tahu di telepon: '喂，大龙，你出来了吗？我和欢欢在11号口等你'."
                ),
                StoryQuestion(
                    id = "q_arppck_3",
                    questionText = "大龙与达达、欢欢上一次见面是在多长时间以前？ (Berapa lama waktu berselang sejak pertemuan terakhir Da Long dengan mereka?)",
                    options = listOf("上个月 (Bulan lalu)", "整整两年前 (Dua tahun yang lalu)", "十年前 (Sepuluh tahun lalu)", "昨天下午 (Kemarin sore)"),
                    correctAnswerIndex = 1,
                    explanation = "Huanhuan berseru: '好久不见！上次见面还是两年前呢'."
                )
            )
        ),

        // Cerita Mandarin Bean 231 (HSK 3): Where do you feel uncomfortable? (Berobat ke Dokter Saat Demam)
        Story(
            id = "story_see_a_doctor",
            titleHanzi = "你哪里不舒服？",
            titlePinyin = "Nǐ Nǎlǐ Bù Shūfu?",
            titleTranslation = "Where do you feel uncomfortable? (Berobat Saat Sakit)",
            level = "HSK 3",
            category = "Kesehatan & Medis",
            description = "Wu Xiaomi menjenguk Ling Mei yang izin sakit demam 38°C: mengukur suhu tubuh dengan termometer, mengantarnya ke rumah sakit, cara meminum resep obat dokter, dan istirahat.",
            coverEmoji = "🩺",
            coverImageRes = R.drawable.cover_story_see_a_doctor,
            estimatedReadMinutes = 2,
            sentences = listOf(
                Sentence(
                    id = "s_sedoct_1",
                    hanzi = "小咪听说铃美头晕咽痛请假未来上课，特意登门探望，用体温计测量发现体温高达38度已经发烧，立刻陪同她前往医院。",
                    pinyin = "Xiǎo mī tīng shuō Líng měi tóu yūn yān tòng qǐng jià wèi lái shàng kè tè yì dēng mén tàn wàng yòng tǐ wēn jì cè liáng fā xiàn tǐ wēn gāo dá sān shí bā dù yǐ jīng fā shāo lì kè péi tóng tā qián wǎng yī yuàn",
                    translation = "Xiaomi mendengar Ling Mei izin tidak masuk kelas karena pusing dan radang tenggorokan, ia sengaja datang menjenguk; saat diukur dengan termometer suhu tubuhnya mencapai 38°C (demam), dan segera mendampinginya ke rumah sakit.",
                    tokens = listOf(
                        WordToken("请假", "qǐng jià", "ask for leave / absence", "Kosakata HSK 3: 请假 (qǐng jià)"),
                        WordToken("发烧", "fā shāo", "to have a fever", "Kosakata HSK 3: 发烧 (fā shāo)"),
                        WordToken("体温计", "tǐ wēn jì", "clinical thermometer", "Alat medis: 体温计"),
                        WordToken("度", "dù", "degree (temperature)", "Kosakata HSK 3: 度 (dù)")
                    )
                ),
                Sentence(
                    id = "s_sedoct_2",
                    hanzi = "医生为头痛咽痛的铃美开具了感冒药与退烧药，详细嘱咐一日三次、一次两片、饭后服用，并叮嘱多喝温水、清淡饮食少吃辛辣。",
                    pinyin = "yī shēng wèi tóu tòng yān tòng de Líng měi kāi jù le gǎn mào yào yǔ tuì shāo yào xiáng xì zhǔ fù yī rì sān cì yī cì liǎng piàn fàn hòu fú yòng bìng dīng zhǔ duō hē wēn shuǐ qīng dàn yǐn shí shǎo chī xīn là",
                    translation = "Dokter meresepkan obat flu dan penurun demam untuk Ling Mei yang mengeluh sakit kepala dan tenggorokan, menginstruksikan aturan minum sehari 3 kali, sekali minum 2 tablet sesudah makan, serta banyak minum air hangat dan menghindari makanan pedas.",
                    tokens = listOf(
                        WordToken("感冒", "gǎn mào", "cold / flu", "Kosakata HSK 3: 感冒 (gǎn mào)"),
                        WordToken("药", "yào", "medicine", "Kosakata HSK 2: 药 (yào)"),
                        WordToken("片", "piàn", "tablet / pill (measure word)", "Kosakata HSK 3: 片 (piàn)"),
                        WordToken("辣", "là", "spicy / hot", "Kosakata HSK 3: 辣 (là)")
                    )
                ),
                Sentence(
                    id = "s_sedoct_3",
                    hanzi = "小咪悉心劝慰害怕吃苦药的铃美遵照医嘱按时服药多加休息，越充分休养身体才能康复得越快，铃美深表谢意。",
                    pinyin = "Xiǎo mī xī xīn quàn wèi hài pà chī kǔ yào de Líng měi zūn zhào yī zhǔ àn shí fú yào duō jiā xiū xi yuè chōng fèn xiū yǎng shēn tǐ cái néng kāng fù de yuè kuài Líng měi shēn biǎo xiè yì",
                    translation = "Xiaomi dengan telaten menasihati Ling Mei yang tidak suka minum obat pahit agar menuruti instruksi dokter, minum obat tepat waktu, dan banyak beristirahat, karena semakin cukup istirahat badan akan semakin lekas pulih sehat kembali.",
                    tokens = listOf(
                        WordToken("按时", "àn shí", "on schedule / on time", "Kosakata HSK 3: 按时 (àn shí)"),
                        WordToken("越来越", "yuè lái yuè", "more and more", "Tata bahasa HSK 3: 越...越..."),
                        WordToken("生病", "shēng bìng", "to fall ill", "Kosakata HSK 2: 生病 (shēng bìng)")
                    )
                )
            ),
            questions = listOf(
                StoryQuestion(
                    id = "q_sedoct_1",
                    questionText = "小咪前往铃美家中探视时，用体温计测出的发烧温度是多少摄氏度？ (Berapa suhu tubuh demam Ling Mei yang terukur di termometer oleh Xiaomi?)",
                    options = listOf("36.5度 (36,5°C - normal)", "38度 (38°C - demam)", "42度超高热 (42°C panas ekstrem)", "35度 (35°C hipotermia)"),
                    correctAnswerIndex = 1,
                    explanation = "Teks menyatakan: '啊呀，38度，你发烧了！难怪我觉得有点儿晕'."
                ),
                StoryQuestion(
                    id = "q_sedoct_2",
                    questionText = "医院接诊医生对处方药的服用频次与用量给出了怎样的医嘱？ (Petunjuk aturan minum obat apa yang diberikan oleh dokter rumah sakit?)",
                    options = listOf("一天一次，睡前吃半片 (Sehari sekali setengah tablet sebelum tidur)", "一天三次，一次两片，饭后服用 (Sehari tiga kali, sekali minum dua tablet, diminum sesudah makan)", "每小时吃一颗 (Tiap jam satu butir)", "空腹一次性喝完全部药水 (Minum sekaligus saat perut kosong)"),
                    correctAnswerIndex = 1,
                    explanation = "Dokter menjelaskan: '上面写了，一天三次，一次两片，饭后吃'."
                ),
                StoryQuestion(
                    id = "q_sedoct_3",
                    questionText = "除了按时吃药，医生和小咪都一致强调了哪项最关键的康复原则？ (Selain teratur minum obat, prinsip penting apa yang ditekankan dokter dan Xiaomi?)",
                    options = listOf("立刻去操场跑步出汗 (Lari keliling lapangan agar berkeringat)", "多喝水、多休息，少吃辛辣刺激食物 (Banyak minum air, perbanyak istirahat, kurangi makanan pedas)", "天天通宵看电视剧 (Begadang nonton drama tiap malam)", "大鱼大肉暴饮暴食 (Makan daging berlebihan)"),
                    correctAnswerIndex = 1,
                    explanation = "Dokter berpesan: '回去多喝水，多休息，少吃辣的... 休息得越多，你好像得越快'."
                )
            )
        ),

        // Cerita Mandarin Bean 232 (HSK 3): Rent a house (Menyewa Tempat Tinggal di Luar Kampus)
        Story(
            id = "story_rent_a_house",
            titleHanzi = "校外租房",
            titlePinyin = "Xiàowài Zūfáng",
            titleTranslation = "Rent a house (Mencari Kontrakan Dekat Kampus)",
            level = "HSK 3",
            category = "Tempat Tinggal & Kampus",
            description = "Da Long yang letih menempuh 1,5 jam perjalanan subway ke kampus baru berencana mencari rumah kontrakan baru: menimbang sewa kamar di dalam kampus vs kenyamanan di luar kampus.",
            coverEmoji = "🏢",
            coverImageRes = R.drawable.cover_story_rent_a_house,
            estimatedReadMinutes = 2,
            sentences = listOf(
                Sentence(
                    id = "s_renths_1",
                    hanzi = "大龙开学前误在老校区租了房，因已付半年房租无法退租，每天坐地铁一个半小时去新校区上课频繁迟到。",
                    pinyin = "Dà lóng kāi xué qián wù zài lǎo xiào qū zū le fáng yīn yǐ fù bàn nián fáng zū wú fǎ tuì zū měi tiān zuò dì tiě yī gè bàn xiǎo shí qù xīn xiào qū shàng kè pín fán chí dào",
                    translation = "Sebelum semester dimulai Da Long keliru menyewa kamar di dekat kampus lama, karena sudah membayar uang sewa enam bulan di muka dan tak bisa dibatalkan, setiap hari ia harus naik MRT 1,5 jam ke kampus baru dan kerap terlambat.",
                    tokens = listOf(
                        WordToken("房租", "fáng zū", "house rent", "Kosakata HSK 3: 房租 (fáng zū)"),
                        WordToken("校区", "xiào qū", "campus", "Kosakata HSK 3: 校区 (xiào qū)"),
                        WordToken("退", "tuì", "to return / refund", "Kosakata HSK 3: 退 (tuì)"),
                        WordToken("到期", "dào qī", "to expire / mature", "Kosakata HSK 3: 到期 (dào qī)")
                    )
                ),
                Sentence(
                    id = "s_renths_2",
                    hanzi = "得知合同月底终于到期，小咪分析校内宿舍去教室食堂方便，而校外租房面积更大、地铁交通便利且商场配套多。",
                    pinyin = "dé zhī hé tong yuè dǐ zhōng yú dào qī Xiǎo mī fēn xī xiào nèi sù shè qù jiào shì shí táng fāng biàn ér xiào wài zū fáng miàn jī gèng dà dì tiě jiāo tōng biàn lì qiě shāng chǎng pèi tào duō",
                    translation = "Mendengar kontrak sewa akhirnya akan habis akhir bulan ini, Xiaomi menguraikan perbandingannya: kamar di dalam kampus dekat dengan ruang kelas dan kantin, sedangkan kontrakan luar kampus ruangannya lebih lega, dekat pintu subway, dan banyak pusat perbelanjaan.",
                    tokens = listOf(
                        WordToken("校内", "xiào nèi", "on campus", "Kosakata HSK 3: 内 (nèi)"),
                        WordToken("校外", "xiào wài", "off campus", "Kosakata HSK 3: 外 (wài)"),
                        WordToken("交通", "jiāo tōng", "transportation / traffic", "Kosakata HSK 3: 交通 (jiāo tōng)"),
                        WordToken("商场", "shāng chǎng", "shopping mall", "Kosakata HSK 3: 商场 (shāng chǎng)")
                    )
                ),
                Sentence(
                    id = "s_renths_3",
                    hanzi = "大龙权衡后决定在校外租房，图租金性价比高且空间宽敞，两人相约周六下午两点一起实地看房挑选。",
                    pinyin = "Dà lóng quán héng hòu jué dìng zài xiào wài zū fáng tú zū jīn xìng jià bǐ gāo qiě kōng jiān kuān chang liǎng rén xiāng yuē zhōu liù xià wǔ liǎng diǎn yī qǐ shí dì kàn fáng tiāo xuǎn",
                    translation = "Setelah mempertimbangkan masak-masak, Da Long memutuskan menyewa rumah di luar kampus dengan pertimbangan harga sewa lebih hemat dan tempatnya lebih luas; mereka berdua berjanji Sabtu jam dua siang untuk survei melihat rumah kontrakan bersama.",
                    tokens = listOf(
                        WordToken("想来想去", "xiǎng lái xiǎng qù", "thinking over and over", "Tata bahasa HSK 3"),
                        WordToken("便宜", "pián yi", "cheap", "Kosakata HSK 2: 便宜 (pián yi)"),
                        WordToken("陪", "péi", "to accompany", "Kosakata HSK 3: 陪 (péi)")
                    )
                )
            ),
            questions = listOf(
                StoryQuestion(
                    id = "q_renths_1",
                    questionText = "大龙此前每天去新校区上学单程路上耗时多久？ (Berapa lama waktu tempuh sekali jalan yang harus dijalani Da Long ke kampus baru?)",
                    options = listOf("走路仅需五分钟 (Cukup jalan 5 menit)", "乘坐地铁需要整整一个半小时（90分钟） (Naik MRT membutuhkan waktu 1,5 jam / 90 menit)", "骑车十五分钟 (Bersepeda 15 menit)", "半个小时 (Setengah jam)"),
                    correctAnswerIndex = 1,
                    explanation = "Teks menyatakan: '坐地铁一个半小时才能到。天啊，你怎么住那么远？'."
                ),
                StoryQuestion(
                    id = "q_renths_2",
                    questionText = "大龙为什么之前明知路途遥远却迟迟无法马上搬家？ (Mengapa sebelumnya Da Long tak bisa langsung pindah rumah meski tahu jaraknya sangat jauh?)",
                    options = listOf("因为已经提前预付了整整六个月的房租且不可退款 (Karena sudah terlanjur bayar sewa 6 bulan di muka dan tak bisa dikembalikan)", "因为新校区周围没有任何房子出租 (Tidak ada kontrakan di kampus baru)", "因为房东是他亲戚 (Karena pemilik rumah kerabatnya)", "因为行李太多搬不动 (Barang terlalu banyak)"),
                    correctAnswerIndex = 0,
                    explanation = "Teks mencatat: '我已经付了六个月的房租，不能退... 谢天谢地，这个月底就到期了'."
                ),
                StoryQuestion(
                    id = "q_renths_3",
                    questionText = "综合考虑各项条件后，大龙为什么更倾向于选择在“校外”租房？ (Mengapa Da Long akhirnya lebih memilih menyewa hunian di 'luar kampus'?)",
                    options = listOf("因为校内不准留学生住宿 (Kampus melarang mahasiswa asing tinggal di asrama)", "一来校外房租相对更划算，二来房间整体面积更加宽敞、周边配套繁华 (Sewa lebih terjangkau dan ruangan lebih luas serta fasilitas sekitar lengkap)", "因为校外可以养马 (Bisa pelihara kuda)", "为了每天多走路上学 (Agar jalan kaki lebih jauh)"),
                    correctAnswerIndex = 1,
                    explanation = "Da Long beralasan: '我想要去，还是住在校外吧！一来房租更便宜，二来地方也更大'."
                )
            )
        ),

        // Cerita Mandarin Bean 233 (HSK 3): What to do on the weekend? (Memancing & Barbeku di Rumah Kakek)
        Story(
            id = "story_weekend_grandpa",
            titleHanzi = "去郊区爷爷家",
            titlePinyin = "Qù Jiāoqū Yéye Jiā",
            titleTranslation = "What to do on the weekend? (Memancing & Barbeku di Desa)",
            level = "HSK 3",
            category = "Keluarga & Liburan Alam",
            description = "Su Nan menceritakan rencananya berkunjung ke rumah kakek-nenek Wu Xiaomi di pedesaan yang asri: memancing di sungai, barbeku di halaman, dan menatap bintang malam hari.",
            coverEmoji = "🎣",
            coverImageRes = R.drawable.cover_story_weekend_grandpa,
            estimatedReadMinutes = 2,
            sentences = listOf(
                Sentence(
                    id = "s_wkgp_1",
                    hanzi = "周末大龙打算打扫屋子，铃美想睡懒觉看书，而苏南则受小咪热情相邀，前往郊区探望已退休归隐的爷爷奶奶。",
                    pinyin = "zhōu mò Dà lóng dǎ suàn dǎ sǎo wū zi Líng měi xiǎng shuì lǎn jiào kàn shū ér Sū nán zé shòu Xiǎo mī rè qíng xiāng yāo qián wǎng jiāo qū tàn wàng yǐ tuì xiū guī yǐn de yé ye nǎi nai",
                    translation = "Di akhir pekan Da Long berencana membersihkan kamar, Ling Mei ingin bermalas-malasan dan membaca buku, sedangkan Su Nan menerima undangan hangat Xiaomi untuk berlibur ke rumah kakek-neneknya di pinggiran kota pedesaan.",
                    tokens = listOf(
                        WordToken("打扫", "dǎ sǎo", "to clean / sweep", "Kosakata HSK 3: 打扫 (dǎ sǎo)"),
                        WordToken("睡懒觉", "shuì lǎn jiào", "sleep in late", "Kosakata HSK 3: 睡懒觉"),
                        WordToken("郊区", "jiāo qū", "suburbs / countryside", "Kosakata HSK 3: 郊区 (jiāo qū)"),
                        WordToken("退休", "tuì xiū", "to retire", "Kosakata HSK 3: 退休 (tuì xiū)")
                    )
                ),
                Sentence(
                    id = "s_wkgp_2",
                    hanzi = "两位老人在乡间庭院侍弄花草、自种蔬菜，还养了忠诚的护家小狗和温顺可爱的小猫，田园生活怡然自得。",
                    pinyin = "liǎng wèi lǎo rén zài xiāng jiān tíng yuàn shì nòng huā cǎo zì zhòng shū cài hái yǎng le zhōng chéng de hù jiā xiǎo gǒu hé wēn shùn kě ài de xiǎo māo tián yuán shēng huó yí rán zì dé",
                    translation = "Kedua sesepuh itu di pekarangan rumah pedesaan gemar merawat aneka tanaman bunga dan sayuran segar, memelihara seekor anjing setia dan kucing lucu, menikmati kehidupan pedesaan yang damai tenteram.",
                    tokens = listOf(
                        WordToken("养花", "yǎng huā", "grow flowers", "Kosakata HSK 3: 养 (yǎng)"),
                        WordToken("种菜", "zhòng cài", "plant vegetables", "Kosakata HSK 3: 种 (zhòng)"),
                        WordToken("可爱", "kě ài", "cute / lovely", "Kosakata HSK 2: 可爱 (kě ài)")
                    )
                ),
                Sentence(
                    id = "s_wkgp_3",
                    hanzi = "小院近临清澈小河，可垂钓观景、在院中露天烧烤，入夜更能仰望漫天繁星，诱人的行程让铃美和大龙当场动心请求加入同往。",
                    pinyin = "xiǎo yuàn jìn lín qīng chè xiǎo hé kě chuí diào guān jǐng zài yuàn zhōng lù tiān shāo kǎo rù yè gèng néng yǎng wàng màn tiān fán xīng yòu rén de xíng chéng ràng Líng měi hé Dà lóng dāng chǎng dòng xīn qǐng qiú jiā rù tóng wǎng",
                    translation = "Rumah itu berdekatan dengan aliran sungai jernih yang asyik untuk memancing dan menikmati pemandangan alam, mengadakan barbeku di pekarangan, serta menatap gemerlap bintang di malam hari; rencana seru ini membuat Ling Mei dan Da Long seketika terpesona dan ingin ikut serta.",
                    tokens = listOf(
                        WordToken("风景", "fēng jǐng", "scenery", "Kosakata HSK 3: 风景 (fēng jǐng)"),
                        WordToken("钓鱼", "diào yú", "to go fishing", "Kosakata HSK 3: 钓 (diào)"),
                        WordToken("院子", "yuàn zi", "courtyard / yard", "Kosakata HSK 3: 院子 (yuàn zi)"),
                        WordToken("烧烤", "shāo kǎo", "barbecue / BBQ", "Kuliner HSK 3: 烧烤 (shāo kǎo)"),
                        WordToken("星星", "xīng xing", "star in the sky", "Kosakata HSK 3: 星星 (xīng xing)")
                    )
                )
            ),
            questions = listOf(
                StoryQuestion(
                    id = "q_wkgp_1",
                    questionText = "吴小咪的爷爷奶奶退休后在郊区农庄享受着怎样的田园生活？ (Kehidupan pedesaan asri seperti apa yang dinikmati kakek-nenek Xiaomi setelah pensiun?)",
                    options = listOf("每天闭门不出看报纸 (Tiap hari mengurung diri baca koran)", "养花种菜，家里还养了小狗和可爱小猫 (Menanam bunga dan sayuran, serta memelihara anjing dan kucing lucu)", "在市中心开饭馆 (Membuka restoran di pusat kota)", "到处参加高尔夫球赛 (Ikut turnamen golf di mana-mana)"),
                    correctAnswerIndex = 1,
                    explanation = "Teks menyatakan: '平时养养花，种种菜，还有一条小狗和一只可爱的小猫'."
                ),
                StoryQuestion(
                    id = "q_wkgp_2",
                    questionText = "根据苏南的生动描绘，在爷爷家附近的自然小河边能体验什么乐趣？ (Aktivitas mengasyikkan apa yang bisa dinikmati di sungai dekat rumah sang kakek?)",
                    options = listOf("乘坐大型游轮 (Naik kapal pesiar besar)", "观赏美丽自然风景，悠闲垂钓（钓鱼） (Menikmati pemandangan alam permai dan santai memancing ikan)", "建造水坝 (Membangun bendungan)", "练习深海潜水 (Latihan selam laut dalam)"),
                    correctAnswerIndex = 1,
                    explanation = "Teks menyebutkan: '那附近有条小河，风景很不错，可以看看风景，钓钓鱼'."
                ),
                StoryQuestion(
                    id = "q_wkgp_3",
                    questionText = "原本打算在宿舍睡懒觉的铃美，听完活动计划后做出了怎样的反应？ (Bagaimana reaksi Ling Mei yang awalnya berniat tidur-tiduran setelah mendengar rencana ini?)",
                    options = listOf("坚决不同意前往 (Menolak keras)", "觉得去郊区钓鱼烧烤看星星比在家睡懒觉有趣得多，当即请求一同前往 (Merasa mancing, barbeku, dan melihat bintang jauh lebih asyik daripada tidur seharian, dan langsung meminta ikut)", "建议大家留在图书馆做题 (Menyarankan tetap di perpus)", "劝苏南也不要去 (Menyuruh Su Nan jangan pergi)"),
                    correctAnswerIndex = 1,
                    explanation = "Ling Mei berseru: '我觉得钓鱼比我在家睡懒觉有意思，我可以去吗？' dan Da Long pun ikut ingin bergabung."
                )
            )
        )
    )
}
