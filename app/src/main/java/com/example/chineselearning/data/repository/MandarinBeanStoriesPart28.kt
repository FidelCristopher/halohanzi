package com.example.chineselearning.data.repository

import com.example.chineselearning.R
import com.example.chineselearning.data.model.Sentence
import com.example.chineselearning.data.model.Story
import com.example.chineselearning.data.model.StoryQuestion
import com.example.chineselearning.data.model.WordToken

val mandarinBeanStoriesPart28: List<Story> by lazy {
    listOf(
        // Cerita Mandarin Bean 294 (HSK 3): Reading (Kebahagiaan Membaca Buku)
        Story(
            id = "story_reading_joy",
            titleHanzi = "读书的快乐",
            titlePinyin = "Dúshū de Kuàilè",
            titleTranslation = "Reading (Menemukan Kebahagiaan dalam Membaca)",
            level = "HSK 3",
            category = "Pendidikan & Hobi",
            description = "Banyak orang memandang belajar sebagai beban kewajiban yang membosankan; namun membaca buku membuka jendela peradaban dunia, memperkaya wawasan, dan membawa sukacita sejati.",
            coverEmoji = "📖",
            coverImageRes = R.drawable.cover_story_reading,
            estimatedReadMinutes = 1,
            sentences = listOf(
                Sentence(
                    id = "s_rdjoy_1",
                    hanzi = "许多人常将读书研习视作枯燥差事，缺乏探究书中浩瀚知识的热忱，更宁愿外出闲逛或在家沉溺电视娱乐。",
                    pinyin = "xǔ duō rén cháng jiāng dú shū yán xí shì zuò kū zào chāi shì quē fá tàn jiū shū zhōng hào hàn zhī shi de rè chén gèng nìng yuàn wài chū xián guàng huò zài jiā chén nì diàn shì yú lè",
                    translation = "Banyak orang sering memandang membaca buku dan belajar sebagai tugas yang melelahkan tanpa gairah untuk menyerap ilmu pengetahuan, lebih memilih bermain di luar atau menonton televisi.",
                    tokens = listOf(
                        WordToken("任务", "rèn wu", "task / mission", "Kosakata HSK 3: 任务 (rèn wu)"),
                        WordToken("热情", "rè qíng", "passion / enthusiasm", "Kosakata HSK 3: 热情 (rè qíng)"),
                        WordToken("知识", "zhī shi", "knowledge", "Kosakata HSK 3: 知识 (zhī shi)"),
                        WordToken("电视", "diàn shì", "television", "Kosakata HSK 1: 电视 (diàn shì)")
                    )
                ),
                Sentence(
                    id = "s_rdjoy_2",
                    hanzi = "而我却唯独钟情静坐案前卷帙浩繁：书卷引领我洞悉寰宇大千世界、领略五洲多元文化、结识古今先贤与饱览丰饶智识。",
                    pinyin = "ér wǒ què wéi dú zhōng qíng jìng zuò àn qián juàn zhì hào fán shū juàn yǐn lǐng wǒ dòng xī huán yǔ dà qiān shì jiè lǐng lüè wǔ zhōu duō yuán wén huà jié shí gǔ jīn xiān xián yǔ bǎo lǎn fēng ráo zhì shí",
                    translation = "Namun sebaliknya saya sangat gemar duduk membaca buku: buku menuntun saya memahami dunia luas, menyelami aneka ragam kebudayaan, mengenal kepribadian manusia yang berbeda, dan merengkuh ilmu baru.",
                    tokens = listOf(
                        WordToken("了解", "liǎo jiě", "to understand", "Kosakata HSK 3: 了解 (liǎo jiě)"),
                        WordToken("世界", "shì jiè", "world", "Kosakata HSK 3: 世界 (shì jiè)"),
                        WordToken("文化", "wén huà", "culture", "Kosakata HSK 2: 文化 (wén huà)")
                    )
                ),
                Sentence(
                    id = "s_rdjoy_3",
                    hanzi = "徜徉于墨香字里行间为我的心灵注入了无穷无尽的宁静与喜乐，开卷有益确是生命最美好的馈赠。",
                    pinyin = "cháng yáng yú mò xiāng zì lǐ háng jiān wèi wǒ de xīn líng zhù rù le wú qióng wú jìn de níng jìng yǔ xǐ lè kāi juàn yǒu yì què shì shēng mìng zuì měi hǎo de kuì zèng",
                    translation = "Menyelami baris-baris aksara memberikan ketenteraman batin dan sukacita berlimpah bagi jiwa saya; membaca buku sungguh menghadirkan kebahagiaan sejati dalam hidup.",
                    tokens = listOf(
                        WordToken("读书", "dú shū", "to read books / study", "Kosakata HSK 2: 读 (dú)"),
                        WordToken("快乐", "kuài lè", "happy / joy", "Kosakata HSK 2: 快乐 (kuài lè)")
                    )
                )
            ),
            questions = listOf(
                StoryQuestion(
                    id = "q_rdjoy_1",
                    questionText = "根据文章观察，现代很多普通人在对待学习与阅读时常抱有怎样的消极心态？ (Sikap negatif apa yang sering dimiliki orang dalam memandang kegiatan belajar?)",
                    options = listOf("把学习单纯当作一种必须应付的枯燥“任务”，宁愿看电视打发时间也不愿读书 (Memandang belajar sekadar tugas beban yang membosankan dan lebih suka nonton TV)", "把所有的书倒背如流 (Hafal semua buku)", "每天阅读十本大部头巨著 (Baca 10 buku tebal)", "只喜欢在船上看书 (Cuma baca di kapal)"),
                    correctAnswerIndex = 0,
                    explanation = "Teks menyatakan: '很多人把学习当任务，他们没有什么热情学习书里的知识。他们喜欢出去玩或者在家看电视，而不是坐在桌子前读书'."
                ),
                StoryQuestion(
                    id = "q_rdjoy_2",
                    questionText = "在作者个人眼中，坚持静心阅读究竟能够给人带来哪些深远丰沛的精神滋养？ (Nutrisi batin apa yang diperoleh penulis lewat ketekunan membaca buku?)",
                    options = listOf("快速提升视力 (Mempertajam mata)", "深入了解广阔大千世界、认识多元灿烂文化并掌握有益知识 (Mengenal dunia luas, memahami keragaman budaya, dan menyerap pengetahuan)", "可以不用参加考试 (Bebas ujian)", "让头发变浓密 (Rambut lebat)"),
                    correctAnswerIndex = 1,
                    explanation = "Teks mencatat: '书让我了解世界，了解不同的文化，知道不同的人，学习不同的知识。读书带给我很多快乐'."
                ),
                StoryQuestion(
                    id = "q_rdjoy_3",
                    questionText = "作者用自己的亲身体会向读者传递的核心读书观是什么？ (Pesan inti apa yang disampaikan penulis tentang membaca buku?)",
                    options = listOf("买书纯粹是为了装饰书架 (Beli buku cuma buat pajangan)", "读书不是受苦受难的差事，而是一件能够赋予内心充实与纯粹快乐的乐事 (Membaca bukanlah siksaan, melainkan sumber sukacita dan kebahagiaan sejati)", "只有成为科学家才需要读书 (Hanya ilmuwan yang butuh baca)", "电子屏幕比纸质书更好 (Layar gadget lebih baik)"),
                    correctAnswerIndex = 1,
                    explanation = "Teks menegaskan: '读书带给我很多快乐' (Membaca membawakan kebahagiaan berlimpah bagi saya)."
                )
            )
        ),

        // Cerita Mandarin Bean 295 (HSK 3): Forget getting off the bus (Tertidur di Bus Hingga Pool Terakhir)
        Story(
            id = "story_bus_sleep",
            titleHanzi = "小学生坐车睡过站",
            titlePinyin = "Xiǎoxuéshēng Zuòchē Shuì Guò Zhàn",
            titleTranslation = "Forget Getting Off the Bus (Tertidur di Bus Hingga Terminal)",
            level = "HSK 3",
            category = "Masyarakat & Kebaikan",
            description = "Kisah humanis di Wuhan, Hubei: seorang murid SD yang kelelahan tertidur di bus hingga terminal akhir; supir bus yang berhati mulia mengantarnya pulang sampai ke pelukan orang tua menggunakan mobil pribadi.",
            coverEmoji = "🚌",
            coverImageRes = R.drawable.cover_story_bus_sleep,
            estimatedReadMinutes = 1,
            sentences = listOf(
                Sentence(
                    id = "s_busslp_1",
                    hanzi = "湖北武汉一名小学生放学后乘公车回家，因过度困倦上车后沉沉睡去，直至车辆抵达终点站停场，当班司机方才察觉。",
                    pinyin = "Hú běi Wǔ hàn yī míng xiǎo xué shēng fàng xué hòu chéng gōng chē huí jiā yīn guò dù kùn juàn shàng chē hòu chén chén shuì qù zhí zhì chē liàng dǐ dá zhōng diǎn zhàn tíng chǎng dāng bān sī jī fāng cái chá jué",
                    translation = "Di Wuhan, Hubei, seorang murid SD menaiki bus umum untuk pulang ke rumah seusai sekolah; karena amat mengantuk ia tertidur pulas hingga bus tiba di terminal terakhir, barulah sang supir menyadari keberadaannya.",
                    tokens = listOf(
                        WordToken("小学生", "xiǎo xué shēng", "primary school pupil", "Pelajar SD"),
                        WordToken("放学", "fàng xué", "school dismiss", "Kosakata HSK 2: 放学 (fàng xué)"),
                        WordToken("公共汽车", "gōng gòng qì chē", "bus", "Kosakata HSK 2: 公共汽车"),
                        WordToken("终点", "zhōng diǎn", "terminal / terminus", "Kosakata HSK 3: 终点 (zhōng diǎn)"),
                        WordToken("司机", "sī jī", "driver", "Kosakata HSK 3: 司机 (sī jī)")
                    )
                ),
                Sentence(
                    id = "s_busslp_2",
                    hanzi = "孩童因惊慌迷惘无法准确复述家庭住址与父母电话，公交调度站当机立断派司机驾驶私家车一路耐心护送寻访其归途。",
                    pinyin = "hái tóng yīn jīng huāng mí wǎng wú fǎ zhǔn què fù shù jiā tíng zhù zhǐ yǔ fù mǔ diàn huà gōng jiāo diào dù zhàn dāng jī lì duàn pài sī jī jià shǐ sī jiā chē yī lù nài xīn hù sòng xún fǎng qí guī tú",
                    translation = "Anak kecil tersebut dalam keadaan linglung tidak bisa mengingat dengan jelas alamat rumah maupun nomor telepon orang tuanya; pihak stasiun bus pun memutuskan menugaskan supir mengantarnya pulang menggunakan mobil pribadi.",
                    tokens = listOf(
                        WordToken("地址", "dì zhǐ", "address", "Kosakata HSK 2: 地址 (dì zhǐ)"),
                        WordToken("决定", "jué dìng", "to decide", "Kosakata HSK 2: 决定 (jué dìng)"),
                        WordToken("私家车", "sī jiā chē", "private car", "Kendaraan pribadi")
                    )
                ),
                Sentence(
                    id = "s_busslp_3",
                    hanzi = "当安然无恙的学童被平安送抵家门，早已急如焚灼的家长热泪盈眶，对公交人员的崇高爱心与强烈责任感深表万分谢忱。",
                    pinyin = "dāng ān rán wú yàng de xué tóng bèi píng ān sòng dǐ jiā mén zǎo yǐ jí rú fén zhuó de jiā zhǎng rè lèi yíng kuàng duì gōng jiāo rén yuán de chóng gāo ài xīn yǔ qiáng liè zé rèn gǎn shēn biǎo wàn fēn xiè chén",
                    translation = "Ketika murid tersebut diantar pulang dengan selamat sampai ke pintu rumah, orang tua yang dari tadi panik cemas merasa sangat bersyukur dan menyampaikan terima kasih mendalam atas kepedulian tulus sang supir bus.",
                    tokens = listOf(
                        WordToken("担心", "dān xīn", "worried / anxious", "Kosakata HSK 3: 担心 (dān xīn)"),
                        WordToken("家长", "jiā zhǎng", "parents / guardian", "Kosakata HSK 3: 家长 (jiā zhǎng)"),
                        WordToken("感谢", "gǎn xiè", "grateful / to thank", "Kosakata HSK 3: 感谢 (gǎn xiè)")
                    )
                )
            ),
            questions = listOf(
                StoryQuestion(
                    id = "q_busslp_1",
                    questionText = "武汉这名小学生放学乘坐公交车时发生了什么突发状况导致一路坐到了终点站？ (Apa yang dialami murid SD di Wuhan hingga terbawa sampai terminal akhir bus?)",
                    options = listOf("在车上玩游戏入迷 (Keasyikan main game)", "上车后因困倦一路熟睡，直接坐过了自己的下车站点直到终点站 (Tertidur pulas di bus sehingga terlewat halte rumahnya)", "被人挟持 (Diculik orang)", "公交车半路抛锚 (Bus mogok di jalan)"),
                    correctAnswerIndex = 1,
                    explanation = "Teks menyatakan: '一个小学生放学坐公共汽车回家，上车后一直睡觉，到了终点以后司机才发现这个孩子'."
                ),
                StoryQuestion(
                    id = "q_busslp_2",
                    questionText = "公交调度车站在孩子记不清家庭准确住址与联系方式时，采取了怎样暖心的负责处置方案？ (Solusi bertanggung jawab apa yang diambil pengelola bus untuk menolong anak tersebut?)",
                    options = listOf("把孩子独自留在车站大厅过夜 (Meninggalkan anak sendirian)", "指派热心公交司机特意开着私家车，将迷途幼童亲自安全护送送回家 (Menugaskan supir mengantar langsung anak pulang dengan mobil pribadinya)", "罚款孩子的学校 (Denda pihak sekolah)", "让孩子自己沿着铁路线走回去 (Menyuruh anak jalan kaki di rel)"),
                    correctAnswerIndex = 1,
                    explanation = "Teks mencatat: '公交站决定让司机开私家车送他回家'."
                ),
                StoryQuestion(
                    id = "q_busslp_3",
                    questionText = "见到焦急等待的孩子被平安护送归来，学生家长做出了怎样的情感反馈？ (Bagaimana reaksi orang tua saat melihat anaknya diantar pulang dengan selamat?)",
                    options = listOf("责怪司机为什么不开公交车来 (Memarahi supir)", "心头的悬石终于落地，对好心司机表达了由衷的万分感激 (Sangat lega dan berterima kasih mendalam kepada supir bus yang baik hati)", "拒绝给司机开门 (Menolak buka pintu)", "给电视台打电话投诉 (Lapor komplain ke TV)"),
                    correctAnswerIndex = 1,
                    explanation = "Teks menegaskan: '当孩子被司机送回家时，担心的家长表示非常感谢'."
                )
            )
        ),

        // Cerita Mandarin Bean 296 (HSK 3): World Artificial Intelligence Conference (Konferensi AI Dunia: Visi Jack Ma)
        Story(
            id = "story_ai_conference",
            titleHanzi = "世界人工智能大会：展望未来",
            titlePinyin = "Shìjiè Réngōng Zhìnéng Dàhuì: Zhǎnwàng Wèilái",
            titleTranslation = "World AI Conference (Masa Depan AI Menurut Jack Ma)",
            level = "HSK 3",
            category = "Teknologi & Visi Masa Depan",
            description = "Sorotan Konferensi Kecerdasan Buatan Dunia (WAIC) di Shanghai: Jack Ma memaparkan visi AI yang membebaskan manusia dari beban kerja berat menjadi 4 jam sehari dan 3 hari seminggu.",
            coverEmoji = "🤖",
            coverImageRes = R.drawable.cover_story_ai_conference,
            estimatedReadMinutes = 1,
            sentences = listOf(
                Sentence(
                    id = "s_aiconf_1",
                    hanzi = "2019年8月29日上海世界人工智能大会上，商界领袖马云语出惊人：人若长寿至一百二十岁未必全然是福，若连祖父辈亦须日夜奔波苦干将成沉重负累。",
                    pinyin = "èr líng yī jiǔ nián bā yuè èr shí jiǔ rì Shàng hǎi shì jiè rén gōng zhì néng dà huì shàng shāng jiè lǐng xiù Mǎ Yún yǔ chū jīng rén rén ruò cháng shòu zhì yī bǎi èr shí suì wèi bì quán rán shì fú ruò lián zǔ fù bèi yì xū rì yè bēn bō kǔ gàn jiāng chéng chén zhòng fù lèi",
                    translation = "Pada Konferensi Kecerdasan Buatan Dunia di Shanghai tanggal 29 Agustus 2019, Jack Ma mengemukakan pandangan menarik: manusia hidup sampai 120 tahun belum tentu sebuah kebaikan jika kakek bahkan buyut sekalipun masih harus bekerja banting tulang.",
                    tokens = listOf(
                        WordToken("人工智能", "rén gōng zhì néng", "Artificial Intelligence (AI)", "Istilah teknologi: AI"),
                        WordToken("表示", "biǎo shì", "to state / express", "Kosakata HSK 3: 表示 (biǎo shì)"),
                        WordToken("必须", "bì xū", "must / have to", "Kosakata HSK 3: 必须 (bì xū)"),
                        WordToken("努力", "nǔ lì", "strive / hard-working", "Kosakata HSK 2: 努力 (nǔ lì)")
                    )
                ),
                Sentence(
                    id = "s_aiconf_2",
                    hanzi = "他前瞻断言：依托人工智能的磅礴算力与自动化，人类未来每日仅需高效工作四小时、每周仅上工三天便已绰绰有余。",
                    pinyin = "tā qián zhān duàn yán yī tuō rén gōng zhì néng de páng bó suàn lì yǔ zì dòng huà rén lèi wèi lái měi rì jǐn xū gāo xiào gōng zuò sì xiǎo shí měi zhōu jǐn shàng gōng sān tiān biàn yǐ chuò chuò yǒu yú",
                    translation = "Ia berpandangan visioner: dengan bantuan efisiensi kecerdasan buatan, di masa depan manusia cukup bekerja 4 jam sehari dan 3 hari seminggu saja sudah sangat mencukupi kebutuhan hidup.",
                    tokens = listOf(
                        WordToken("小时", "xiǎo shí", "hour", "Kosakata HSK 2: 小时 (xiǎo shí)"),
                        WordToken("足够", "zú gòu", "enough / sufficient", "Kosakata HSK 3: 足够 (zú gòu)"),
                        WordToken("唱歌", "chàng gē", "to sing", "Kosakata HSK 1: 唱歌 (chàng gē)"),
                        WordToken("跳舞", "tiào wǔ", "to dance", "Kosakata HSK 2: 跳舞 (tiào wǔ)")
                    )
                ),
                Sentence(
                    id = "s_aiconf_3",
                    hanzi = "夜晚与漫长假期当留与载歌载舞、寄情艺术；科技之终极使命应是解放肉身劳役，赋予人类更加辽阔的自由去拥抱生活意趣。",
                    pinyin = "yè wǎn yǔ màn cháng jià qī dāng liú yǔ zài gē zài wǔ jì qíng yì shù kē jì zhī zhōng jí shǐ mìng yīng shì jiě fàng ròu shēn láo yì fù yǔ rén lèi gèng jiā liáo kuò de zì yóu qù yōng bào shēng huó yì qù",
                    translation = "Malam hari dan waktu luang dapat dimanfaatkan untuk menyanyi, menari, dan menikmati hidup; misi sejati kemajuan AI adalah membebaskan manusia dari keletihan kerja agar lebih leluasa menikmati kebahagiaan.",
                    tokens = listOf(
                        WordToken("应该", "yīng gāi", "should / ought to", "Kosakata HSK 2: 应该 (yīng gāi)"),
                        WordToken("自由", "zì yóu", "free / freedom", "Kosakata HSK 3: 自由 (zì yóu)"),
                        WordToken("感受", "gǎn shòu", "to feel / experience", "Kosakata HSK 3: 感受 (gǎn shòu)"),
                        WordToken("乐趣", "lè qù", "delight / pleasure", "Kosakata HSK 3: 乐趣 (lè qù)")
                    )
                )
            ),
            questions = listOf(
                StoryQuestion(
                    id = "q_aiconf_1",
                    questionText = "马云在2019上海世界人工智能大会上发表主旨演讲时，就人类未来的工时制度描绘了怎样的理想图景？ (Jadwal kerja ideal apa yang digambarkan Jack Ma di konferensi AI dunia?)",
                    options = listOf("提倡每天工作18个小时全年无休 (Kerja 18 jam setahun tanpa libur)", "认为未来依托科技人们每天只需工作4小时、每周仅需工作3天就足够了 (Cukup bekerja 4 jam sehari dan 3 hari seminggu berkat kemajuan teknologi)", "所有人彻底不从事任何工作 (Semua berhenti kerja total)", "只能在清晨五点上班 (Cuma kerja jam 5 subuh)"),
                    correctAnswerIndex = 1,
                    explanation = "Teks menyatakan: '他认为人们每天工作四个小时，每周工作三天就足够了，晚上可以去唱歌和跳舞'."
                ),
                StoryQuestion(
                    id = "q_aiconf_2",
                    questionText = "马云为什么认为单纯追求“寿命活到120岁”在缺乏技术赋能下并不一定是一件纯粹的好事？ (Mengapa hidup sampai 120 tahun belum tentu baik jika tanpa kemajuan teknologi?)",
                    options = listOf("世界上的粮食全部吃光 (Makanan dunia habis)", "如果生产力落后，连爷爷、曾祖父辈都不得不为了生计高龄辛苦拼命工作 (Jika belum maju, bahkan sesepuh kakek-buyut tetap harus banting tulang bekerja)", "没有那么大的生日蛋糕 (Kue ultah tak muat)", "衣服生产跟不上 (Pabrik baju kewalahan)"),
                    correctAnswerIndex = 1,
                    explanation = "Teks menjelaskan: '马云表示人活到120岁不一定是好事，爷爷、爷爷的爸爸还必须努力工作'."
                ),
                StoryQuestion(
                    id = "q_aiconf_3",
                    questionText = "在马云看来，人工智能（AI）技术的蓬勃发展最终应当为人类社会创造的核心人文价值是什么？ (Menurut Jack Ma, nilai luhur apa yang harus dihadirkan oleh perkembangan AI bagi manusia?)",
                    options = listOf("全面取代人类统治地球 (Menggantikan manusia menguasai bumi)", "让人类获得更多身心自由，从繁重劳动中解放出来去享受人生的乐趣 (Memberikan kebebasan lebih luas agar manusia terbebas dari jerih payah berat dan menikmati hidup)", "禁止人类所有的文娱艺术创作 (Melarang seni)", "让所有人整天在家里闭门睡觉 (Bikin orang tidur seharian)"),
                    correctAnswerIndex = 1,
                    explanation = "Teks menyimpulkan: '人工智能应该可以让人更自由，感受乐趣'."
                )
            )
        ),

        // Cerita Mandarin Bean 297 (HSK 3): Watch movie (Belajar Bahasa Asing Lewat Film)
        Story(
            id = "story_watch_movie_learning",
            titleHanzi = "看电影学外语",
            titlePinyin = "Kàn Diànyǐng Xué Wàiyǔ",
            titleTranslation = "Watch Movie (Nonton Film: Belajar Budaya & Bahasa)",
            level = "HSK 3",
            category = "Pendidikan & Hiburan",
            description = "Menonton film bukanlah membuang-buang waktu; film membuka wawasan budaya, meraba sejarah, memperkaya kosakata, serta melatih kemampuan listening bahasa asing secara natural dan asyik.",
            coverEmoji = "🎬",
            coverImageRes = R.drawable.cover_story_watch_movie_learning,
            estimatedReadMinutes = 2,
            sentences = listOf(
                Sentence(
                    id = "s_wtchmv_1",
                    hanzi = "自幼随母亲观影无数的我常遭旁人指责是在虚掷光阴，但我坚信此种偏颇成见大错特错，观赏电影实乃极具成效的启智学习捷径。",
                    pinyin = "zì yòu suí mǔ qīn guān yǐng wú shù de wǒ cháng zāo páng rén zhǐ zé shì zài xū zhì guāng yīn dàn wǒ jiān xìn cǐ zhǒng piān pǒ chéng jiàn dà cuò tè cuò guān shǎng diàn yǐng shí nǎi jí jù chéng xiào de qǐ zhì xué xí jié jìng",
                    translation = "Sejak kecil sering menonton film bersama ibu, saya kerap dikritik orang bahwa menonton film adalah membuang-buang waktu; namun saya tegaskan pandangan itu keliru, menonton film justru merupakan sarana belajar yang amat berfaedah.",
                    tokens = listOf(
                        WordToken("电影", "diàn yǐng", "movie / film", "Kosakata HSK 1: 电影 (diàn yǐng)"),
                        WordToken("浪费", "làng fèi", "to waste", "Kosakata HSK 3: 浪费 (làng fèi)"),
                        WordToken("想法", "xiǎng fǎ", "opinion / idea", "Kosakata HSK 3: 想法 (xiǎng fǎ)"),
                        WordToken("方法", "fāng fǎ", "method / way", "Kosakata HSK 3: 方法 (fāng fǎ)")
                    )
                ),
                Sentence(
                    id = "s_wtchmv_2",
                    hanzi = "方寸荧幕生动折射出百味人生、深厚民俗与波澜历史；沉浸于原声外国大片更能潜移默化淬炼外语听力素养、广泛扩充实用生词量。",
                    pinyin = "fāng cùn yíng mù shēng dòng zhé shè chū bǎi wèi rén shēng shēn hòu mín sú yǔ bō lán lì shǐ chén jìn yú yuán shēng wài guó dà piān gèng néng qián yí mò huà cuì liàn wài yǔ tīng lì sù yǎng guǎng fàn kuò chōng shí yòng shēng cí liàng",
                    translation = "Melalui layar bioskop kita dapat menyaksikan beraneka dinamika kehidupan manusia, menyelami budaya bangsa lain, bahkan peristiwa sejarah; terlebih lagi menonton film asing melatih kemampuan mendengarkan dan memperkaya perbendaharaan kosakata.",
                    tokens = listOf(
                        WordToken("精彩", "jīng cǎi", "brilliant / splendid", "Kosakata HSK 3: 精彩 (jīng cǎi)"),
                        WordToken("外语", "wài yǔ", "foreign language", "Kosakata HSK 3: 外语 (wài yǔ)"),
                        WordToken("听力", "tīng lì", "listening skill", "Kosakata HSK 3: 听力 (tīng lì)"),
                        WordToken("历史", "lì shǐ", "history", "Kosakata HSK 2: 历史 (lì shǐ)")
                    )
                ),
                Sentence(
                    id = "s_wtchmv_3",
                    hanzi = "寓教于乐、情智并举，观影实乃一种寓意深远且趣味盎然的沉浸式卓越进阶途径。",
                    pinyin = "yù jiào yú lè qíng zhì bìng jǔ guān yǐng shí nǎi yī zhǒng yù yì shēn yuǎn qiě qù wèi àng rán de chén jìn shì zhuó yuè jìn jiē tú jìng",
                    translation = "Belajar sembari menikmati alur cerita yang memikat menjadikan menonton film sebagai metode pembelajaran yang luar biasa seru dan sangat bermanfaat bagi wawasan hidup kita.",
                    tokens = listOf(
                        WordToken("有趣", "yǒu qù", "interesting / fun", "Kosakata HSK 3: 有趣 (yǒu qù)"),
                        WordToken("方式", "fāng shì", "way / mode", "Kosakata HSK 3: 方式 (fāng shì)")
                    )
                )
            ),
            questions = listOf(
                StoryQuestion(
                    id = "q_wtchmv_1",
                    questionText = "针对社会上部分人将看电影片面贬低为“纯属浪费时间”的偏见，作者给出了怎样的有力反驳？ (Bantahan apa yang disampaikan penulis terhadap anggapan bahwa nonton film buang waktu?)",
                    options = listOf("看电影能让眼睛变得特别大 (Bikin mata jadi besar)", "看电影不仅不是浪费时间，反而是一种兼具文化开拓与外语熏陶的极佳学习方法 (Nonton film bukan membuang waktu, melainkan metode belajar yang efektif mengenal budaya dan mengasah bahasa)", "看电影可以不用花钱吃饭 (Bisa hemat makan)", "电影院比图书馆更安静 (Bioskop lebih sepi dari perpus)"),
                    correctAnswerIndex = 1,
                    explanation = "Teks menegaskan: '有些人认为这是浪费时间，但是我想告诉他们，他们的想法是错的。看电影也可以是一种好的学习方法'."
                ),
                StoryQuestion(
                    id = "q_wtchmv_2",
                    questionText = "根据作者的亲身实证，大量观看优质外国电影对于外语素养的哪两项核心技能带来了立竿见影的飞跃提升？ (Dua keterampilan bahasa asing apa yang meningkat pesat berkat menonton film asing?)",
                    options = listOf("外语听力理解与大量生活化核心词汇量 (Kemampuan menyimak/listening dan penguasaan perbendaharaan kosakata harian)", "毛笔书写速度 (Kecepatan kaligrafi)", "古诗词朗诵韵律 (Melafalkan puisi)", "打字敲键盘的速度 (Kecepatan ngetik)"),
                    correctAnswerIndex = 0,
                    explanation = "Teks menjelaskan: '因为看了很多外国电影，我的外语听力和词汇也学习了很多'."
                ),
                StoryQuestion(
                    id = "q_wtchmv_3",
                    questionText = "除了语言工具性收益之外，电影艺术在精神文化层面还能赋予观众哪些收获？ (Selain kemahiran bahasa, wawasan apa yang diperkaya oleh seni film?)",
                    options = listOf("直接赠送海外房产 (Dapat rumah gratis)", "能直观领略不同国度的精彩人生经历、厚重历史风云与多元文化魅力 (Melihat pengalaman hidup luar biasa, menyelami sejarah, dan mengenal budaya dunia)", "免除全部外语学费 (Bebas SPP)", "让人学会驾驶飞机 (Bisa mengemudikan pesawat)"),
                    correctAnswerIndex = 1,
                    explanation = "Teks mencatat: '我们可以从电影中看到很多精彩的人生，了解不同的文化，甚至是历史'."
                )
            )
        ),

        // Cerita Mandarin Bean 298 (HSK 3): I love hot pot (Ikon Kuliner Tiongkok: Hot Pot)
        Story(
            id = "story_hot_pot",
            titleHanzi = "中国美食名片：火锅",
            titlePinyin = "Zhōngguó Měishí Míngpiàn: Huǒguō",
            titleTranslation = "I Love Hot Pot (Pesona Hotpot Kuliner Ikonik Tiongkok)",
            level = "HSK 3",
            category = "Kuliner & Kebersamaan",
            description = "Setiap kali bingung memilih menu makan, hotpot adalah jawaban sempurna: kuah bervariasi sesuai selera, suasana hangat kumpul bersama, hingga menjadi ikon kuliner Tiongkok layaknya jiaozi.",
            coverEmoji = "🍲",
            coverImageRes = R.drawable.cover_story_hot_pot,
            estimatedReadMinutes = 1,
            sentences = listOf(
                Sentence(
                    id = "s_hotpot_1",
                    hanzi = "每逢聚餐难决吃何珍馐时热腾腾的火锅总是不二法宝，食客可随心所欲自主挑选专属的底料汤底、佐料与食材荤素。",
                    pinyin = "měi féng jù cān nán jué chī hé zhēn xiū shí rè téng téng de huǒ guō zǒng shì bù èr fǎ bǎo shí kè kě suí xīn suǒ yù zì zhǔ tiāo xuǎn zhuān shǔ de dǐ liào tāng dǐ zuǒ liào yǔ shí cái hūn sù",
                    translation = "Setiap kali bingung hendak makan apa, menyantap hidangan hotpot selalu menjadi pilihan utama yang tepat; kita bebas memilih sendiri racikan rasa kuah dasar dan aneka bahan makanan yang disukai.",
                    tokens = listOf(
                        WordToken("火锅", "huǒ guō", "hotpot", "Kuliner khas Tiongkok: 火锅"),
                        WordToken("好吃", "hǎo chī", "delicious", "Kosakata HSK 1: 好吃 (hǎo chī)"),
                        WordToken("选择", "xuǎn zé", "to choose / select", "Kosakata HSK 3: 选择 (xuǎn zé)"),
                        WordToken("味道", "wèi dào", "taste / flavor", "Kosakata HSK 3: 味道 (wèi dào)")
                    )
                ),
                Sentence(
                    id = "s_hotpot_2",
                    hanzi = "三五知己或阖家亲友围炉而坐同涮一锅、品味百味佳肴，不仅用餐格外便捷随和，围炉氤氲间更洋溢着欢腾热烈的浓厚情谊。",
                    pinyin = "sān wǔ zhī jǐ huò hé jiā qīn yǒu wéi lú ér zuò tóng shuàn yī guō pǐn wèi bǎi wèi jiā yáo bù jǐn yòng cān gé wài biàn jié suí he wéi lú yīn yūn jiān gèng yáng yì zhe huān téng rè liè de nóng hòu qíng yì",
                    translation = "Sekelompok teman atau keluarga duduk melingkari satu meja menikmati kuah dengan beragam cita rasa yang pas bagi selera masing-masing, sangat praktis sekaligus menghadirkan kehangatan suasana yang meriah.",
                    tokens = listOf(
                        WordToken("口味", "kǒu wèi", "taste / flavor", "Kosakata HSK 3: 口味 (kǒu wèi)"),
                        WordToken("方便", "fāng biàn", "convenient", "Kosakata HSK 2: 方便 (fāng biàn)"),
                        WordToken("热闹", "rè nao", "lively / bustling", "Kosakata HSK 3: 热闹 (rè nao)")
                    )
                ),
                Sentence(
                    id = "s_hotpot_3",
                    hanzi = "众多海外友人远涉重洋踏足华夏皆首屈一指沉醉于火锅魅力，火锅如今已与传统水饺并驾齐驱，跃升为中华饮食文明最耀眼的文化象征。",
                    pinyin = "zhòng duō hǎi wài yǒu rén yuǎn shè zhòng yáng tà zú Huá xià jiē shǒu qū yī zhǐ chén zuì yú huǒ guō mèi lì huǒ guō rú jīn yǐ yǔ chuán tǒng shuǐ jiǎo bìng jià qí qū yuè shēng wèi Zhōng huá yǐn shí wén míng zuì yào yǎn de wén huà xiàng zhēng",
                    translation = "Banyak wisatawan asing setibanya di Tiongkok jatuh cinta pada kenikmatan hotpot; kini hidangan hotpot telah sejajar dengan pangsit jiaozi sebagai lambang keagungan seni kuliner Tiongkok.",
                    tokens = listOf(
                        WordToken("饺子", "jiǎo zi", "dumpling", "Kuliner tradisional: 饺子"),
                        WordToken("象征", "xiàng zhēng", "symbol / to symbolize", "Kosakata HSK 3: 象征 (xiàng zhēng)"),
                        WordToken("饮食", "yǐn shí", "diet / food and drink", "Kosakata HSK 3: 饮食")
                    )
                )
            ),
            questions = listOf(
                StoryQuestion(
                    id = "q_hotpot_1",
                    questionText = "朋友聚餐在众口难调不知道吃什么好时，大家往往首选去吃火锅的最大便利优势是什么？ (Keunggulan utama apa yang membuat hotpot selalu jadi pilihan utama saat bingung memilih menu?)",
                    options = listOf("必须每个人完全吃一模一样口味 (Harus makan rasa yang seragam)", "同一张餐桌上每个人都可以自由挑选自己喜欢的锅底口味与食材荤素 (Setiap orang bebas memilih rasa kuah dan bahan sayur/daging kesukaannya)", "火锅从来不需要付钱 (Gratis)", "火锅只能一个人单独吃 (Cuma bisa dimakan sendirian)"),
                    correctAnswerIndex = 1,
                    explanation = "Teks menyatakan: '每次不知道吃什么的时候，我们就会去吃火锅... 我们可以选择自己喜欢的味道和食物。一群人坐在一起吃不同口味的菜，真的很方便，也很热闹'."
                ),
                StoryQuestion(
                    id = "q_hotpot_2",
                    questionText = "很多外国朋友来到中国旅游生活后，在众多中华传统美食中最让他们着迷钟爱的是哪一种？ (Kuliner Tiongkok apa yang paling digemari turis asing setelah berkunjung ke Tiongkok?)",
                    options = listOf("白水煮青菜 (Sayur rebus tawar)", "丰富美味、氛围热闹的中国火锅 (Hidangan hotpot yang lezat dan meriah)", "纯黑咖啡 (Kopi hitam)", "法式长棍面包 (Roti baguette Prancis)"),
                    correctAnswerIndex = 1,
                    explanation = "Teks mencatat: '许多外国人来到中国以后最喜欢的就是火锅了'."
                ),
                StoryQuestion(
                    id = "q_hotpot_3",
                    questionText = "在当今中华饮食文化中，热气腾腾的火锅已经与哪种历史悠久的节庆食物一样，成为了中国饮食文化的代表象征？ (Hotpot kini disejajarkan dengan makanan tradisional apa sebagai simbol budaya kuliner Tiongkok?)",
                    options = listOf("饺子 (Pangsit jiaozi)", "月饼 (Kue bulan)", "烤鸭 (Bebek panggang)", "粽子 (Kue bacang)"),
                    correctAnswerIndex = 0,
                    explanation = "Teks menyimpulkan: '现在火锅已经像饺子一样成为了中国饮食的象征'."
                )
            )
        ),

        // Cerita Mandarin Bean 299 (HSK 3): Change of life (Adaptasi Hidup di Tiongkok)
        Story(
            id = "story_change_of_life",
            titleHanzi = "初到中国的适应与成长",
            titlePinyin = "Chūdào Zhōngguó de Shìyìng yǔ Chéngzhǎng",
            titleTranslation = "Change of Life (Adaptasi Pelajar Asing & Rumah Kedua)",
            level = "HSK 3",
            category = "Kehidupan & Inspirasi",
            description = "Kisah pelajar asing yang berani meninggalkan kenyamanan demi belajar bahasa Mandarin: dari kesepian di lingkungan asing, menjelajahi kafe buku, hingga menemukan teman suportif yang membuatnya merasa seperti di rumah sendiri.",
            coverEmoji = "☕",
            coverImageRes = R.drawable.cover_story_change_of_life,
            estimatedReadMinutes = 2,
            sentences = listOf(
                Sentence(
                    id = "s_chglfe_1",
                    hanzi = "为追寻汉语梦想我只身远赴中国求学，初至全新天地意味着不得不暂别故土挚友与故乡熟悉的美丽景致。",
                    pinyin = "wèi zhuī xún Hàn yǔ mèng xiǎng wǒ zhī shēn yuǎn fù Zhōng guó qiú xué chū zhì quán xīn tiān dì yì wèi zhe bù dé bù zàn bié gù tǔ zhì yǒu yǔ gù xiāng shú xi de měi lì jǐng zhì",
                    translation = "Demi mempelajari bahasa Mandarin saya datang merantau hidup di Tiongkok; tiba di lingkungan baru berarti saya harus rela melepaskan banyak hal, termasuk sahabat-sahabat lama tercinta dan keindahan pemandangan kampung halaman.",
                    tokens = listOf(
                        WordToken("放弃", "fàng qì", "to give up / leave behind", "Kosakata HSK 3: 放弃 (fàng qì)"),
                        WordToken("不得不", "bù dé bù", "have to / cannot but", "Kosakata HSK 3: 不得不 (bù dé bù)"),
                        WordToken("风景", "fēng jǐng", "scenery / landscape", "Kosakata HSK 3: 风景 (fēng jǐng)")
                    )
                ),
                Sentence(
                    id = "s_chglfe_2",
                    hanzi = "我努力调适融入陌生环境：闲暇穿梭街巷熟稔商铺，惊喜偶遇静谧温馨的社区书吧咖啡馆，捧卷研读消弭初期的孤寂。",
                    pinyin = "wǒ nǔ lì tiáo shì róng rù mò shēng huán jìng xián xiá chuān suō jiē xiàng shú rěn shāng pù jīng xǐ ǒu yù jìng mì wēn xīn de shè qū shū bā kā fēi guǎn pěng juàn yán dú xiāo mǐ chū qī de gū jì",
                    translation = "Pertama-tama saya harus belajar beradaptasi dengan lingkungan yang asing: saat senggang saya menyusuri jalan dan mengenal pertokoan, lalu menemukan sudut-sudut kafe buku kecil yang tenang untuk membaca buku guna mengatasi rasa sepi.",
                    tokens = listOf(
                        WordToken("适应", "shì yìng", "to adapt to / adjust", "Kosakata HSK 3: 适应 (shì yìng)"),
                        WordToken("陌生", "mò shēng", "strange / unfamiliar", "Kosakata HSK 3: 陌生 (mò shēng)"),
                        WordToken("孤独", "gū dú", "lonely / solitary", "Kosakata HSK 3: 孤独 (gū dú)"),
                        WordToken("提供", "tí gōng", "to provide / offer", "Kosakata HSK 3: 提供 (tí gōng)")
                    )
                ),
                Sentence(
                    id = "s_chglfe_3",
                    hanzi = "热情同窗的无私解难让我收获挚友无数，如今身处异乡却如居家般温暖妥帖，坚信这片土地定将馈赠更多美好惊喜。",
                    pinyin = "rè qíng tóng chuāng de wú sī jiě nán ràng wǒ shōu huò zhì yǒu wú shù rú jīn shēn chǔ yì xiāng què rú jū jiā bān wēn nuǎn tuǒ tiē jiān xìn zhè piàn tǔ dì dìng jiāng kuì zèng gèng duō měi hǎo jīng xǐ",
                    translation = "Kebaikan teman-teman sekelas yang tulus membantu menyelesaikan setiap kendala membuat saya kini memiliki banyak sahabat baik; sekarang tinggal di Tiongkok terasa nyaman laksana di rumah sendiri, dan saya yakin akan menemukan lebih banyak kejutan indah di sini.",
                    tokens = listOf(
                        WordToken("解决", "jiě jué", "to solve / resolve", "Kosakata HSK 3: 解决 (jiě jué)"),
                        WordToken("惊喜", "jīng xǐ", "pleasant surprise", "Kosakata HSK 3: 惊喜 (jīng xǐ)")
                    )
                )
            ),
            questions = listOf(
                StoryQuestion(
                    id = "q_chglfe_1",
                    questionText = "作者初次孤身一人来到中国面对全然陌生的环境时，起初经历了怎样的心理状态？ (Keadaan batin apa yang sempat dialami penulis saat pertama kali tiba di Tiongkok sendirian?)",
                    options = listOf("立刻买了返程机票回国 (Langsung beli tiket pulang)", "因为朋友很少而感到些许孤独迷惘，需要努力去适应全新陌生的环境 (Merasa agak sepi karena belum punya kawan dan harus berjuang beradaptasi)", "整天在家开派对 (Tiap hari pesta)", "在街上与人争吵 (Ribut dengan orang di jalan)"),
                    correctAnswerIndex = 1,
                    explanation = "Teks menyatakan: '首先，我必须学会适应陌生的环境... 我没有多少朋友，我有点孤独'."
                ),
                StoryQuestion(
                    id = "q_chglfe_2",
                    questionText = "在适应融入异国生活的过程中，作者在街头探索到了什么能够安顿身心的美好去处？ (Tempat nyaman apa yang ditemukan penulis saat menjelajahi jalanan kota?)",
                    options = listOf("喧嚣的地下游戏厅 (Ruang game bising)", "提供丰富藏书能够让人静心阅读的安静小咖啡店 (Kafe kecil tenang yang menyediakan banyak buku untuk dibaca)", "废弃的古旧仓库 (Gudang tua)", "火车站候车大厅 (Ruang tunggu stasiun)"),
                    correctAnswerIndex = 1,
                    explanation = "Teks mencatat: '我发现了一些有趣的地方，比如一些小咖啡店。小店提供了很多书，我可以在里面看书'."
                ),
                StoryQuestion(
                    id = "q_chglfe_3",
                    questionText = "作者最终克服孤独、在中国产生“宾至如归（就像在家一样）”深切归属感的最核心原因是什么？ (Faktor penentu apa yang membuat penulis akhirnya merasa nyaman seperti di rumah sendiri?)",
                    options = listOf("中国的美食太便宜 (Makanan murah)", "学校同学非常善良热心，主动帮助排忧解难，使自己结交了许多知心好友 (Kawan sekelas yang sangat baik hati tulus membantu mengatasi kesulitan hingga jadi sahabat karib)", "自己学会了跳广场舞 (Bisa senam pagi)", "自己买了一辆汽车 (Beli mobil pribadi)"),
                    correctAnswerIndex = 1,
                    explanation = "Teks menyimpulkan: '但是我的同学都很好，他们帮助我解决问题。现在我有了很多好朋友，感觉在中国就像在家一样'."
                )
            )
        ),

        // Cerita Mandarin Bean 300 (HSK 3): Get Drunk (Ayah Mabuk dan Dua Polisi)
        Story(
            id = "story_get_drunk",
            titleHanzi = "父子论“醉”",
            titlePinyin = "Fù Zǐ Lùn Zuì",
            titleTranslation = "Get Drunk (Ayah Mabuk dan Dua Polisi)",
            level = "HSK 3",
            category = "Cerita Lucu & Humor",
            description = "Percakapan kocak ayah dan anak dalam perjalanan pulang makan malam: sang ayah yang teler mengajari definisi mabuk dengan mengira melihat 4 polisi, padahal di sana hanya berdiri satu polisi.",
            coverEmoji = "🍺",
            coverImageRes = R.drawable.cover_story_get_drunk,
            estimatedReadMinutes = 1,
            sentences = listOf(
                Sentence(
                    id = "s_getdrk_1",
                    hanzi = "晚宴散席父子步行归家，求知欲旺盛的孩童对世间万物充满好奇，仰头请教父亲：“爸爸，‘醉’字究竟是何涵义？”",
                    pinyin = "wǎn yàn sàn xí fù zǐ bù xíng guī jiā qiú zhī yù wàng shèng de hái tóng duì shì jiān wàn wù chōng mǎn hào qí yǎng tóu qǐng jiào fù qīn bà ba zuì zì jiū jìng shì hé hán yì",
                    translation = "Seusai jamuan makan malam ayah dan anak berjalan kaki pulang; sang anak yang penuh rasa ingin tahu menanyakan hal baru kepada ayahnya: 'Ayah, apa sih sebenarnya arti dari kata mabuk (zuì)?'",
                    tokens = listOf(
                        WordToken("父亲", "fù qīn", "father", "Kosakata HSK 3: 父亲 (fù qīn)"),
                        WordToken("儿子", "ér zi", "son", "Kosakata HSK 1: 儿子 (ér zi)"),
                        WordToken("感兴趣", "gǎn xìng qù", "interested in", "Kosakata HSK 3: 感兴趣"),
                        WordToken("问题", "wèn tí", "question / problem", "Kosakata HSK 2: 问题 (wèn tí)"),
                        WordToken("醉", "zuì", "drunk / intoxicated", "Kosakata HSK 3: 醉 (zuì)")
                    )
                ),
                Sentence(
                    id = "s_getdrk_2",
                    hanzi = "醉意朦胧的父亲指着路边言传身教：“你看那边站着两个警察，若在我眼中幻化重影变成了四个，那便证明我喝醉了。”",
                    pinyin = "zuì yì méng lóng de fù qīn zhǐ zhe lù biān yán chuán shēn jiào nǐ kàn nà biān zhàn zhe liǎng gè jǐng chá ruò zài wǒ yǎn zhōng huàn huà chóng yǐng biàn chéng le sì gè nà biàn zhèng míng wǒ hē zuì le",
                    translation = "Sang ayah yang mulai teler memberi contoh nyata: 'Coba kamu lihat di seberang sana ada dua orang polisi; seandainya di mata Ayah mereka berbayang tampak menjadi empat orang, berarti Ayah sudah mabuk.'",
                    tokens = listOf(
                        WordToken("警察", "jǐng chá", "police officer", "Kosakata HSK 3: 警察 (jǐng chá)"),
                        WordToken("成", "chéng", "to become / turn into", "Kosakata HSK 3: 成 (chéng)"),
                        WordToken("算", "suàn", "to calculate / consider as", "Kosakata HSK 3: 算 (suàn)")
                    )
                ),
                Sentence(
                    id = "s_getdrk_3",
                    hanzi = "幼童揉了揉眼睛困惑不解地脆生答道：“可是爸爸，马路对面分明从头到尾只有一位警察叔叔站着呀！”",
                    pinyin = "yòu tóng róu le róu yǎn jing kùn huò bù jiě de cuì shēng dá dào kě shì bà ba mǎ lù duì miàn fēn míng cóng tóu dào wěi zhǐ yǒu yī wèi jǐng chá shū shu zhàn zhe ya",
                    translation = "Sang anak mengucek mata lalu dengan polos berseru heran: 'Tetapi Ayah... di seberang jalan sana kan aslinya cuma ada berdiri satu orang polisi saja!'",
                    tokens = listOf(
                        WordToken("瞧", "qiáo", "to look / see", "Kosakata HSK 3: 瞧 (qiáo)"),
                        WordToken("回答", "huí dá", "to reply / answer", "Kosakata HSK 3: 回答 (huí dá)"),
                        WordToken("可是", "kě shì", "but / however", "Kosakata HSK 2: 可是 (kě shì)")
                    )
                )
            ),
            questions = listOf(
                StoryQuestion(
                    id = "q_getdrk_1",
                    questionText = "儿子在吃完饭散步回家的路上，向父亲提出了关于哪个汉语字词含义的提问？ (Kata apa yang ditanyakan artinya oleh sang anak kepada ayahnya?)",
                    options = listOf("“累”（疲惫） (Kata lelah)", "“醉”（饮酒过量神志不清） (Karakter 'zuì' yang bermakna mabuk)", "“饿”（腹中饥饿） (Kata lapar)", "“跑”（跑步） (Kata lari)"),
                    correctAnswerIndex = 1,
                    explanation = "Teks menyatakan: '他问父亲：爸爸，“醉”字是什么意思？'."
                ),
                StoryQuestion(
                    id = "q_getdrk_2",
                    questionText = "微醺的父亲为了直观向儿子解释何为“醉酒视物重影”，举出了怎样看似头头是道的例子？ (Contoh apa yang diberikan sang ayah untuk menjelaskan penglihatan ganda saat mabuk?)",
                    options = listOf("把一辆汽车看成一架大飞机 (Melihat mobil seperti pesawat)", "声称如果自己把那边站着的“两个警察”看成了“四个”，就算醉了 (Mengaku jika ia melihat 'dua polisi' berbayang jadi 'empat', berarti ia mabuk)", "把月亮看成了太阳 (Melihat bulan jadi matahari)", "把石桥看成木船 (Melihat jembatan jadi perahu)"),
                    correctAnswerIndex = 1,
                    explanation = "Ayah berujar: '你瞧那儿站着两个警察。如果我把他们看成了四个，那么我就算醉了'."
                ),
                StoryQuestion(
                    id = "q_getdrk_3",
                    questionText = "这则幽默对话的爆笑反转结局是什么？ (Apa ending kocak yang menjadi puncak lelucon cerita ini?)",
                    options = listOf("警察把父亲带走了 (Polisi menangkap ayahnya)", "儿子立刻童真拆穿：路边实际上原本只站着“一个”警察，证明父亲其实早就已经严重醉酒 (Anak membocorkan bahwa di sana aslinya cuma ada 'satu' polisi, membuktikan sang ayah sudah mabuk parah duluan)", "儿子也喝醉了 (Anaknya ikutan mabuk)", "路边的警察其实是假人雕像 (Polisinya patung)"),
                    correctAnswerIndex = 1,
                    explanation = "Anak itu berkata polos: '可是，爸爸，那儿只有一个警察呀！' (Ayah sudah melihat 1 polisi jadi 2, yang berarti ayahnya memang sudah teler berat)."
                )
            )
        ),

        // Cerita Mandarin Bean 301 (HSK 3): Making money is not easy (Pengalaman Menjual Kacang di Hari Panas)
        Story(
            id = "story_making_money",
            titleHanzi = "摆摊体验赚钱不易",
            titlePinyin = "Bǎitān Tǐyàn Zhuànqián Bù Yì",
            titleTranslation = "Making Money is Not Easy (Belajar Menghargai Uang)",
            level = "HSK 3",
            category = "Pendidikan Anak & Keluarga",
            description = "Ibu di Nanjing menyewa lapak pasar di hari terik musim panas agar putranya 11 tahun dan putrinya 3 tahun belajar menjual kacang tanah, demi mendidik anak memahami sulitnya mencari nafkah.",
            coverEmoji = "🥜",
            coverImageRes = R.drawable.cover_story_making_money,
            estimatedReadMinutes = 2,
            sentences = listOf(
                Sentence(
                    id = "s_mkmney_1",
                    hanzi = "南京一位母亲察觉两名幼童金钱观念极度淡薄、花销挥霍无度，遂决意租下一处街头集市摊位开展劳动教育。",
                    pinyin = "Nán jīng yī wèi nián qīng mǔ qīn chá jué liǎng míng yòu tóng jīn qián guān niàn jí dù dàn bó huā xiāo huī huò wú dù suì jué yì zū xià yī chù jiē tóu jí shì tān wèi kāi zhǎn láo dòng jiào yù",
                    translation = "Seorang ibu di Nanjing menyadari bahwa kedua anaknya sama sekali tidak memiliki konsep nilai uang dan sangat mudah bersikap boros; ia lantas berinisiatif menyewa sebuah lapak di pasar kaki lima untuk mendidik anaknya.",
                    tokens = listOf(
                        WordToken("概念", "gài niàn", "concept", "Kosakata HSK 3: 概念"),
                        WordToken("浪费", "làng fèi", "to waste", "Kosakata HSK 3: 浪费 (làng fèi)"),
                        WordToken("摊位", "tān wèi", "vendor booth / stall", "Lapak jualan"),
                        WordToken("租", "zū", "to rent", "Kosakata HSK 3: 租 (zū)")
                    )
                ),
                Sentence(
                    id = "s_mkmney_2",
                    hanzi = "她让十一岁的长子与仅三岁的幼女顶着酷暑高温在烈日下叫卖花生，亲身体验汗流浃背以物易财的艰辛历程。",
                    pinyin = "tā ràng shí yī suì de zhǎng zǐ yǔ jǐn sān suì de yòu nǚ dǐng zhe kù shǔ gāo wēn zài liè rì xià jiào mài huā shēng qīn shēn tǐ yàn hàn liú jiā bèi yǐ wù yì cái de jiān xīn lì chéng",
                    translation = "Ia mengajak putranya yang berusia 11 tahun dan putri kecilnya yang berumur 3 tahun untuk berpanas-panas menjual kacang tanah (*huāshēng*) di bawah terik matahari, agar mereka merasakan sendiri betapa susahnya mencari nafkah.",
                    tokens = listOf(
                        WordToken("高温", "gāo wēn", "high temperature", "Kosakata HSK 3: 高温"),
                        WordToken("花生", "huā shēng", "peanut", "Bahan makanan"),
                        WordToken("赚钱", "zhuàn qián", "to earn money", "Kosakata HSK 3: 赚钱 (zhuàn qián)")
                    )
                ),
                Sentence(
                    id = "s_mkmney_3",
                    hanzi = "这堂生动的人生体验课收效显著：三岁女儿在商场目睹心仪玩具标价昂贵时，深知钱财来之不易，主动懂事地放弃了购买要求。",
                    pinyin = "zhè táng shēng dòng de rén shēng tǐ yàn kè shōu xiào xiǎn zhù sān suì nǚ ér zài shāng chǎng mù dǔ xīn yí wán jù biāo jià áng guì shí shēn zhī qián cái lái zhī bù yì zhǔ dòng dǒng shì de fàng qì le gòu mǎi yāo qiú",
                    translation = "Pelajaran hidup nyata ini memberikan hasil yang sangat nyata: saat melihat mainan yang harganya mahal di mall, putrinya yang berusia 3 tahun kini paham bahwa mencari uang itu tidak mudah dan tidak lagi merengek meminta dibelikan.",
                    tokens = listOf(
                        WordToken("体验", "tǐ yàn", "to experience for oneself", "Kosakata HSK 3: 体验"),
                        WordToken("玩具", "wán jù", "toy", "Kosakata HSK 3: 玩具 (wán jù)"),
                        WordToken("要求", "yāo qiú", "to demand / require", "Kosakata HSK 3: 要求 (yāo qiú)")
                    )
                )
            ),
            questions = listOf(
                StoryQuestion(
                    id = "q_mkmney_1",
                    questionText = "南京这位母亲之所以花费租金租下一个摊位让年幼的孩子去体验摆摊，其最直接的初衷是什么？ (Apa alasan awal sang ibu menyewa lapak jualan untuk anak-anaknya?)",
                    options = listOf("家里穷得揭不开锅需要孩子养家 (Keluarga miskin butuh makan)", "发现孩子们花钱完全没有概念、容易铺张浪费，希望让他们切身体会“赚钱不易” (Menyadari anak tidak punya konsep uang dan boros, ingin mengajari susahnya mencari uang)", "想把孩子培养成未来超级大富豪 (Ingin jadi miliarder)", "让孩子在街头招揽顾客练口才 (Latih bicara di jalan)"),
                    correctAnswerIndex = 1,
                    explanation = "Teks menyatakan: '因为发现自己的两个孩子对花钱没有概念，特别容易浪费... 想通过这种方式让孩子们明白赚钱不容易，花钱要注意'."
                ),
                StoryQuestion(
                    id = "q_mkmney_2",
                    questionText = "母亲让11岁的儿子和3岁的女儿在炎热的高温天气里在摊位上具体售卖什么商品？ (Barang dagangan apa yang dijual sang anak di bawah terik matahari?)",
                    options = listOf("冰镇汽水 (Minuman soda dingin)", "平平常常的花生米（花生） (Kacang tanah biasa)", "二手儿童绘本书 (Buku cerita anak)", "手工编织毛衣 (Rajutan wol)"),
                    correctAnswerIndex = 1,
                    explanation = "Teks mencatat: '让自己的11岁儿子和3岁的女儿一起在高温天气卖花生'."
                ),
                StoryQuestion(
                    id = "q_mkmney_3",
                    questionText = "经过这次酷暑摆摊的切身生活磨砺，3岁幼女在后续消费行为上展现了怎样令人欣慰的懂事转变？ (Perubahan perilaku positif apa yang tampak pada putri kecilnya seusai pengalaman ini?)",
                    options = listOf("要求母亲把所有的零用钱没收 (Minta uang saku disita)", "在商场看到价格太昂贵的玩具时，懂得克制欲望不再哭闹要求购买 (Melihat mainan mahal di mall, ia tahu diri dan tidak merengek minta dibeli)", "偷偷把玩具塞进口袋 (Mencuri mainan)", "以后拒绝再去逛商场 (Tak mau ke mall lagi)"),
                    correctAnswerIndex = 1,
                    explanation = "Teks menyimpulkan: '在这次体验以后，三岁的女儿看到玩具太贵，也不要求买了'."
                )
            )
        ),

        // Cerita Mandarin Bean 302 (HSK 3): Get Free Changes (Kotak Koin Receh Gratis untuk Bus)
        Story(
            id = "story_free_changes",
            titleHanzi = "小学生设爱心零钱盒",
            titlePinyin = "Xiǎoxuéshēng Shè Àixīn Língqiánhé",
            titleTranslation = "Get Free Changes (Kotak Koin Receh Gratis di Halte Bus)",
            level = "HSK 3",
            category = "Kebaikan & Pelayanan Publik",
            description = "Inisiatif mulia seorang murid SD di Hebei: menukarkan uang tabungan 700 yuan miliknya menjadi koin receh dan menaruhnya di halte bus agar warga yang kekurangan ongkos bisa mengambil 2 yuan.",
            coverEmoji = "🪙",
            coverImageRes = R.drawable.cover_story_free_changes,
            estimatedReadMinutes = 1,
            sentences = listOf(
                Sentence(
                    id = "s_frchng_1",
                    hanzi = "河北一名心地善良的小学生将自己积攒的近七百元零花钱储蓄全数兑换为一枚枚硬币零钱，置于街头公交站点。",
                    pinyin = "Hé běi yī míng xīn dì shàn liáng de xiǎo xué shēng jiāng zì jǐ jī zǎn de jìn qī bǎi yuán líng huā qián chǔ xù quán shù duì huàn wèi yī méi méi yìng bì líng qián zhì yú jiē tóu gōng jiāo zhàn diǎn",
                    translation = "Seorang murid SD yang berhati mulia di Hebei menukarkan seluruh uang tabungannya yang berjumlah hampir 700 yuan menjadi kepingan uang koin receh, lalu meletakkannya di halte bus jalan raya.",
                    tokens = listOf(
                        WordToken("积蓄", "jī xù", "savings", "Kosakata HSK 3: 积蓄"),
                        WordToken("换", "huàn", "to exchange / change", "Kosakata HSK 3: 换 (huàn)"),
                        WordToken("硬币", "yìng bì", "coin", "Kosakata mata uang"),
                        WordToken("零钱", "líng qián", "small change / coins", "Kosakata HSK 3: 零钱 (líng qián)")
                    )
                ),
                Sentence(
                    id = "s_frchng_2",
                    hanzi = "爱心盒子面向全社会急需用钱乘车的市民无偿免费提供，醒目约定“急用自取、每次限取两元”，精准化解无零钱乘车的燃眉之急。",
                    pinyin = "ài xīn hé zi miàn xiàng quán shè huì jí xū yòng qián chéng chē de shì mín wú cháng miǎn fèi tí gōng xǐng mù yuē dìng jí yòng zì qǔ měi cì xiàn qǔ liǎng yuán jīng zhǔn huà jiě wú líng qián chéng chē de rán méi zhī jí",
                    translation = "Kotak kasih ini disediakan secara gratis bagi seluruh warga yang membutuhkan ongkos bus, dengan aturan tertulis: 'Gunakan saat darurat, maksimal ambil 2 yuan per orang', secara tepat mengatasi kendala penumpang yang tidak memiliki uang pas.",
                    tokens = listOf(
                        WordToken("免费", "miǎn fèi", "free of charge", "Kosakata HSK 3: 免费 (miǎn fèi)"),
                        WordToken("提供", "tí gōng", "to provide / offer", "Kosakata HSK 3: 提供 (tí gōng)"),
                        WordToken("麻烦", "má fan", "trouble / inconvenience", "Kosakata HSK 3: 麻烦 (má fan)")
                    )
                ),
                Sentence(
                    id = "s_frchng_3",
                    hanzi = "少年的崇高公德善举在互联网引发热烈反响，广大网民纷纷肃然起敬为小少年的纯真爱心与社会公德慷慨点赞嘉许。",
                    pinyin = "shào nián de chóng gāo gōng dé shàn jǔ zài hù lián wǎng yǐn fā rè liè fǎn xiǎng guǎng dà wǎng mín fēn fēn sù rán qǐ jìng wèi xiǎo shào nián de chún zhēn ài xīn yǔ shè huì gōng dé kāng kǎi diǎn zàn jiā xǔ",
                    translation = "Kebaikan tulus bocah ini menuai apresiasi luas di dunia maya; para warganet beramai-ramai memberikan acungan jempol (*diǎnzàn*) memuji kepedulian sosial dan hati emas anak tersebut.",
                    tokens = listOf(
                        WordToken("解决", "jiě jué", "to solve / settle", "Kosakata HSK 3: 解决 (jiě jué)"),
                        WordToken("网友", "wǎng yǒu", "netizen / internet friend", "Kosakata internet"),
                        WordToken("点赞", "diǎn zàn", "to give a like / thumb up", "Kosakata HSK 3: 点赞")
                    )
                )
            ),
            questions = listOf(
                StoryQuestion(
                    id = "q_frchng_1",
                    questionText = "河北这位富有爱心的小学生把自己的近700元零花钱储蓄，全额兑换成了什么特殊的物资无偿奉献给社会？ (Tabungan 700 yuan anak SD di Hebei ini ditukarkan menjadi apa demi membantu sesama?)",
                    options = listOf("全买成了冰淇淋 (Beli es krim semua)", "全部兑换成一枚枚硬币零钱，设立便民零钱盒 (Ditukarkan menjadi koin-koin receh dan ditaruh di kotak halte)", "全部购买了漫画书 (Beli buku komik)", "换成美元带去国外 (Tukar dolar ke luar negeri)"),
                    correctAnswerIndex = 1,
                    explanation = "Teks menyatakan: '一个来自中国河北省的小学生把自己的差不多700元钱的积蓄都换成了硬币零钱，免费提供给所有需要帮助的人们'."
                ),
                StoryQuestion(
                    id = "q_frchng_2",
                    questionText = "设立在车站旁的爱心硬币零钱盒，对每位临时急需乘车的市民做出了怎样的合理用款约定？ (Aturan pemakaian uang koin receh darurat apa yang disepakati?)",
                    options = listOf("可以一次性把整盒钱全端走 (Boleh ambil semuanya)", "急用自取，但是为了照顾更多需要的人每次只能拿取两元（乘车公资） (Boleh ambil saat darurat, tapi dibatasi hanya 2 yuan per orang sesuai tarif bus)", "必须出示房产证抵押 (Wajib jaminan sertifikat)", "必须当场唱一首歌 (Wajib bernyanyi)"),
                    correctAnswerIndex = 1,
                    explanation = "Teks mencatat: '免费提供给所有需要帮助的人们，但是每次只能拿两元'."
                ),
                StoryQuestion(
                    id = "q_frchng_3",
                    questionText = "小学生用自己的零花钱设置这个爱心投币箱，最直接想帮市民解决什么日常出行烦恼？ (Masalah transportasi praktis apa yang ingin dibantu selesaikan oleh anak tersebut?)",
                    options = listOf("解决公交车司机开车口渴的问题 (Supir bus haus)", "解决很多市民乘坐公交车因身上没有零钱硬币投币而上不了车的尴尬麻烦 (Mengatasi masalah penumpang yang tidak punya uang pas pecahan kecil untuk bayar bus)", "解决车站刮风下雨的避雨问题 (Masalah hujan di halte)", "解决路灯不亮的问题 (Masalah lampu jalan padam)"),
                    correctAnswerIndex = 1,
                    explanation = "Teks menegaskan: '他说想帮助解决大家坐公共汽车，但是却没有零钱的麻烦。网友们纷纷为小朋友点赞'."
                )
            )
        ),

        // Cerita Mandarin Bean 303 (HSK 3): Shoulder (Kekuatan Pundak / Bahu Sandaran)
        Story(
            id = "story_shoulder",
            titleHanzi = "肩膀的力量",
            titlePinyin = "Jiānbǎng de Lìliang",
            titleTranslation = "Shoulder (Bahu: Tempat Bersandar di Saat Berduka)",
            level = "HSK 3",
            category = "Filosofi Jiwa & Kasih Sayang",
            description = "Refleksi filosofis mendalam tentang anatomi tubuh: dari mata dan telinga, hingga rahasia bahwa bagian tubuh paling mulia adalah bahu (*jiānbǎng*) sebagai tempat bersandar bagi orang yang menangis.",
            coverEmoji = "🫂",
            coverImageRes = R.drawable.cover_story_shoulder,
            estimatedReadMinutes = 2,
            sentences = listOf(
                Sentence(
                    id = "s_shldrp_1",
                    hanzi = "年少时我以为眼睛最重要因能览青天白云挚爱，祖母叹世多盲人；学乐后以为耳口最重因能聆仙乐颂雅歌，祖父念世多聋哑。",
                    pinyin = "nián shào shí wǒ yǐ wéi yǎn jing zuì zhòng yào yīn néng lǎn qīng tiān bái yún zhì ài zǔ mǔ tàn shì duō máng rén xué yuè hòu yǐ wéi ěr kǒu zuì zhòng yīn néng líng xiān yuè sòng yǎ gē zǔ fù niàn shì duō lóng yǎ",
                    translation = "Di masa kecil aku mengira mata adalah anggota tubuh terpenting karena bisa memandang langit biru dan orang terkasih, namun nenek berkata banyak orang buta di dunia; saat belajar musik kukira telinga dan mulut terpenting karena bisa mendengar melodi dan bernyanyi, namun kakek mengingatkan ada banyak tuna rungu dan wicara.",
                    tokens = listOf(
                        WordToken("部位", "bù wèi", "part / section (of body)", "Bagian tubuh"),
                        WordToken("眼睛", "yǎn jing", "eyes", "Kosakata HSK 1: 眼睛 (yǎn jing)"),
                        WordToken("耳朵", "ěr duo", "ears", "Kosakata HSK 3: 耳朵 (ěr duo)"),
                        WordToken("声音", "shēng yīn", "voice / sound", "Kosakata HSK 3: 声音 (shēng yīn)")
                    )
                ),
                Sentence(
                    id = "s_shldrp_2",
                    hanzi = "直至挚友丧父悲恸欲绝，我默然相伴扶持其熬过阴霾岁月，母亲方语重心长点醒玄机：世间至重之部位乃是坚实的“肩膀”。",
                    pinyin = "zhí zhì zhì yǒu sàng fù bēi tòng yù jué wǒ mò rán xiāng bàn fú chí qí áo guò yīn mái suì yuè mǔ qīn fāng yǔ zhòng xīn cháng diǎn xǐng xuán jī shì jiān zhì zhòng zhī bù wèi nǎi shì jiān shí de jiān bǎng",
                    translation = "Hingga suatu ketika ayah sahabat baikku meninggal dunia dan ia sangat terpukul; aku menemaninya melewati masa-masa kelam itu, dan sesampai di rumah ibu menasihatiku: tahukah kamu bagian tubuh yang paling penting sesungguhnya? Benar sekali, itulah bahu (jiānbǎng).",
                    tokens = listOf(
                        WordToken("去世", "qù shì", "to pass away", "Kosakata HSK 3: 去世 (qù shì)"),
                        WordToken("伤心", "shāng xīn", "heartbroken / sad", "Kosakata HSK 3: 伤心 (shāng xīn)"),
                        WordToken("陪", "péi", "to accompany", "Kosakata HSK 3: 陪 (péi)"),
                        WordToken("肩膀", "jiān bǎng", "shoulder", "Bagian tubuh: 肩膀")
                    )
                ),
                Sentence(
                    id = "s_shldrp_3",
                    hanzi = "因为当深爱之人掩面痛哭之际，肩膀可供其无依之首沉静倚靠；世人皆需坚强肩膀，我们亦当砥砺强健脊梁留作他人遮风港湾。",
                    pinyin = "yīn wèi dāng shēn ài zhī rén yǎn miàn tòng kū zhī jì jiān bǎng kě gōng qí wú yī zhī shǒu chén jìng yǐ kào shì rén jiē xū jiān qiáng jiān bǎng wǒ men yì dāng dǐ lì qiáng jiàn jǐ liáng liú zuò tā rén zhē fēng gǎng wān",
                    translation = "Sebab di saat orang yang kita cintai menangis pilu, bahu kitalah yang menjadi tempat sandaran bagi mereka; setiap insan membutuhkan sandaran bahu, dan kita sendiri pun harus memiliki pundak yang kokoh untuk bersandar bagi sesama.",
                    tokens = listOf(
                        WordToken("哭泣", "kū qì", "to weep / cry", "Kosakata sastra: 哭泣"),
                        WordToken("依靠", "yī kào", "to lean on / rely on", "Kosakata HSK 3: 依靠 (yī kào)"),
                        WordToken("强壮", "qiáng zhuàng", "strong / sturdy", "Kosakata HSK 3: 强壮 (qiáng zhuàng)")
                    )
                )
            ),
            questions = listOf(
                StoryQuestion(
                    id = "q_shldrp_1",
                    questionText = "作者在童年时期和少年学音乐时期，曾经分别天真地认为人体最重要的地方是哪里？ (Di masa kecil dan saat belajar musik, bagian tubuh apa yang dikira paling penting oleh penulis?)",
                    options = listOf("脚掌和头发 (Kaki dan rambut)", "先后误以为是能看世界的眼睛，以及能听音歌唱的耳朵或嘴巴 (Mula-mula mengira mata yang melihat dunia, lalu telinga dan mulut untuk bermusik)", "手指甲 (Kuku)", "胃和牙齿 (Lambung dan gigi)"),
                    correctAnswerIndex = 1,
                    explanation = "Teks menyatakan: '很小的时候认为身体最重要的是眼睛... 后来学习音乐，我认为身体最重要是耳朵或者嘴'."
                ),
                StoryQuestion(
                    id = "q_shldrp_2",
                    questionText = "在经历陪伴好友经历丧亲之痛后，母亲慈爱地揭示出人体最为伟大而珍贵的部位究竟是哪里？ (Bagian tubuh apakah yang menurut ibu paling mulia dan berharga?)",
                    options = listOf("结实发达的手臂肌肉 (Otot lengan)", "温暖有力的“肩膀”（肩部） (Pundak / bahu yang kokoh dan hangat)", "挺拔的鼻子 (Hidung mancung)", "修长的双腿 (Kaki jenjang)"),
                    correctAnswerIndex = 1,
                    explanation = "Teks menegaskan: '妈妈对我说：现在，你知道最重要的地方是哪了吗？没错，是肩膀'."
                ),
                StoryQuestion(
                    id = "q_shldrp_3",
                    questionText = "母亲之所以深情将“肩膀”确立为人体最核心重器的崇高哲学内涵是什么？ (Makna filosofis luhur apa yang terkandung di balik kekuatan sebuah bahu?)",
                    options = listOf("肩膀能够挑起沉重的扁担 (Bisa memikul beban)", "在我们所深爱的人痛苦哭泣时，肩膀能够提供坚实可靠的温暖依靠 (Saat orang terkasih menangis, bahu dapat menjadi tempat sandaran yang aman dan menenangkan)", "肩膀骨骼最容易受伤 (Tulang bahu rapuh)", "肩膀可以用来撞门 (Bisa mendobrak pintu)"),
                    correctAnswerIndex = 1,
                    explanation = "Teks menyimpulkan keindahan kasih sayang: '因为在我们爱的人哭泣的时候，肩膀可以让他们依靠。我们每个人都需要肩膀，我们自己也要有强壮的肩膀留给别人'."
                )
            )
        )
    )
}
