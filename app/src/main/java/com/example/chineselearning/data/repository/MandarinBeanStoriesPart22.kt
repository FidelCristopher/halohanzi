package com.example.chineselearning.data.repository

import com.example.chineselearning.R
import com.example.chineselearning.data.model.Sentence
import com.example.chineselearning.data.model.Story
import com.example.chineselearning.data.model.StoryQuestion
import com.example.chineselearning.data.model.WordToken

val mandarinBeanStoriesPart22: List<Story> by lazy {
    listOf(
        // Cerita Mandarin Bean 234 (HSK 3): I have been learning Chinese for three years (Tiga Empat Tahun Belajar Bahasa Mandarin)
        Story(
            id = "story_learn_chinese_three_years",
            titleHanzi = "学汉语三四年",
            titlePinyin = "Xué Hànyǔ Sān Sì Nián",
            titleTranslation = "I Have Been Learning Chinese for Years (Perjalanan Belajar Bahasa Mandarin)",
            level = "HSK 3",
            category = "Bahasa & Pembelajaran",
            description = "Da Long dan Su Nan berbagi pengalaman belajar bahasa Mandarin: tantangan dialek lokal yang beraneka ragam di Tiongkok, hingga motivasi mendalam dari ketertarikan budaya dan kuliner.",
            coverEmoji = "📖",
            coverImageRes = R.drawable.cover_story_learn_chinese_three_years,
            estimatedReadMinutes = 2,
            sentences = listOf(
                Sentence(
                    id = "s_lnch3y_1",
                    hanzi = "大龙在校门口遇上问路的老奶奶，因对方带有浓重的地方方言口音而听不明白，多亏路过的吴小咪热心解围。",
                    pinyin = "Dà lóng zài xiào mén kǒu yù shàng wèn lù de lǎo nǎi nai yīn duì fāng dài yǒu nóng zhòng de dì fāng fāng yán kǒu yin ér tīng bu míng bai duō kuī lù guò de Wú Xiǎo mī rè xīn jiě wéi",
                    translation = "Da Long berpapasan dengan seorang nenek yang menanyakan arah jalan di gerbang sekolah, namun karena sang nenek berbicara dengan logat dialek daerah yang kental ia tidak mengerti, untunglah Wu Xiaomi yang melintas berbaik hati membantu.",
                    tokens = listOf(
                        WordToken("方言", "fāng yán", "dialect", "Kosakata HSK 3: 方言 (fāng yán)"),
                        WordToken("普通话", "pǔ tōng huà", "Mandarin (standard Chinese)", "Kosakata HSK 2: 普通话"),
                        WordToken("口音", "kǒu yin", "accent", "Kosakata HSK 3: 口音 (kǒu yin)"),
                        WordToken("多亏", "duō kuī", "thanks to / luckily", "Tata bahasa HSK 3: 多亏 (duō kuī)")
                    )
                ),
                Sentence(
                    id = "s_lnch3y_2",
                    hanzi = "苏南安慰大龙中国方言众多连国人也未必全懂；大龙学了四年深感汉字博大精深，当初是在高中受中国朋友启蒙而立志赴华留学。",
                    pinyin = "Sū nán ān wèi Dà lóng Zhōng guó fāng yán zhòng duō lián guó rén yě wèi bì quán dǒng Dà lóng xué le sì nián shēn gǎn hàn zì bó dà jīng shēn dāng chū shì zài gāo zhōng shòu Zhōng guó péng you qǐ méng ér lì zhì fù huá liú xué",
                    translation = "Su Nan menenangkan Da Long bahwa dialek daerah di Tiongkok sangat banyak bahkan warga lokal pun belum tentu paham semuanya; Da Long yang telah belajar empat tahun merasa karakter Hanzi sangat unik, terinspirasi oleh teman Tiongkok sejak masa SMA hingga bertekad kuliah ke Tiongkok.",
                    tokens = listOf(
                        WordToken("难过", "nán guò", "sad / upset", "Kosakata HSK 3: 难过 (nán guò)"),
                        WordToken("环境", "huán jìng", "environment", "Kosakata HSK 3: 环境 (huán jìng)"),
                        WordToken("语法", "yǔ fǎ", "grammar", "Kosakata HSK 3: 语法 (yǔ fǎ)"),
                        WordToken("毕业", "bì yè", "to graduate", "Kosakata HSK 3: 毕业 (bì yè)")
                    )
                ),
                Sentence(
                    id = "s_lnch3y_3",
                    hanzi = "学了三年的苏南则透露自己是因儿时随父访华深爱中华美食而萌生求学之志，两人互勉多交中国好友、勤加苦练口语。",
                    pinyin = "xué le sān nián de Sū nán zé tòu lù zì jǐ shì yīn ér shí suí fù fǎng huá shēn ài Zhōng huá měi shí ér méng shēng qiú xué zhī zhì liǎng rén hù miǎn duō jiāo Zhōng guó hǎo yǒu qín jiā kǔ liàn kǒu yǔ",
                    translation = "Su Nan yang telah belajar selama tiga tahun menuturkan bahwa impiannya bermula saat ia kecil diajak ayahnya bepergian ke Tiongkok dan jatuh cinta pada kelezatan kuliner Tionghoa, dan keduanya saling menyemangati untuk memperbanyak teman lokal demi melatih percakapan.",
                    tokens = listOf(
                        WordToken("旅行", "lǚ xíng", "to travel", "Kosakata HSK 2: 旅游 (lǚ yóu) / 旅行"),
                        WordToken("美食", "měi shí", "delicacy / delicious food", "Kosakata HSK 3: 美食 (měi shí)"),
                        WordToken("既然", "jì rán", "since / now that", "Tata bahasa HSK 3: 既然 (jì rán)")
                    )
                )
            ),
            questions = listOf(
                StoryQuestion(
                    id = "q_lnch3y_1",
                    questionText = "大龙在校门口为什么会完全听不懂那位问路老奶奶所说的话？ (Mengapa Da Long sama sekali tidak memahami ucapan nenek yang bertanya arah?)",
                    options = listOf("老奶奶说的是法语 (Nenek berbicara bahasa Prancis)", "老奶奶带着极重的地域方言口音，使得习惯标准普通话的大龙难以分辨 (Nenek memiliki logat dialek daerah yang amat kental sehingga sulit dipahami)", "老奶奶声音太小听不清 (Suara nenek terlalu pelan)", "大龙完全没有学过中文 (Da Long belum pernah belajar Mandarin)"),
                    correctAnswerIndex = 1,
                    explanation = "Teks menyatakan: '她一开始说的是方言，后来才说普通话，但是她普通话的口音很重，我还是不明白'."
                ),
                StoryQuestion(
                    id = "q_lnch3y_2",
                    questionText = "苏南最初下定决心来到中国潜心学习中文的最关键兴趣动力是什么？ (Apa motivasi ketertarikan awal yang mendorong Su Nan datang belajar bahasa Mandarin ke Tiongkok?)",
                    options = listOf("小时候随父亲来华旅行深深爱上了中国传统美食 (Masa kecil bepergian bersama ayah dan jatuh cinta pada kelezatan masakan khas Tiongkok)", "为了做跨国股票投资 (Demi investasi saham)", "喜欢中国武术和京剧 (Suka wushu dan opera Beijing)", "学校安排的公派任务 (Tugas pertukaran wajib sekolah)"),
                    correctAnswerIndex = 0,
                    explanation = "Su Nan bercerita: '我小时候跟爸爸来中国旅行，吃过很多中国的美食，就爱上了中国菜... 所以就来中国学习了'."
                ),
                StoryQuestion(
                    id = "q_lnch3y_3",
                    questionText = "面对汉语口语和听力环境的挑战，两位留学生达成了怎样的共识？ (Kesepakatan bersama apa yang dicapai kedua mahasiswa asing untuk mengasah kemampuan bahasa mereka?)",
                    options = listOf("整天关在宿舍自言自语 (Mengurung diri bicara sendiri di kamar)", "多主动结交中国朋友，在真实语境中好好练习口语 (Memperbanyak teman warga lokal Tiongkok untuk giat berlatih percakapan nyata)", "彻底放弃练习普通话 (Menyerah berlatih)", "只读英文教科书 (Hanya membaca buku teks bahasa Inggris)"),
                    correctAnswerIndex = 1,
                    explanation = "Da Long mengajak: '既然这样，我们就多认识一些中国朋友，好好练习我们的汉语吧！'."
                )
            )
        ),

        // Cerita Mandarin Bean 235 (HSK 3): How did you do on the exam? (Bagaimana Hasil Ujianmu?)
        Story(
            id = "story_exam_result",
            titleHanzi = "考试考得怎么样？",
            titlePinyin = "Kǎoshì Kǎo De Zěnmeyàng?",
            titleTranslation = "How did you do on the exam? (Evaluasi Seusai Ujian)",
            level = "HSK 3",
            category = "Pendidikan & Kampus",
            description = "Tiga sekawan mengevaluasi ujian bahasa Mandarin yang menantang: soal bacaan panjang, lupa menulis karakter Hanzi, hingga pentingnya saling mendukung dan rileks sejenak.",
            coverEmoji = "📝",
            coverImageRes = R.drawable.cover_story_exam_result,
            estimatedReadMinutes = 2,
            sentences = listOf(
                Sentence(
                    id = "s_exmrs_1",
                    hanzi = "昨日考试题量大且难度高，大龙没写完卷子，苏南虽答完但阅读长句理解吃力，最后因时间紧迫只能仓促猜选答案。",
                    pinyin = "zuó rì kǎo shì tí liàng dà qiě nán dù gāo Dà lóng méi xiě wán juàn zi Sū nán suī dá wán dàn yuè dú cháng jù lǐ jiě chī lì zuì hòu yīn shí jiān jǐn pò zhǐ hǎo cāng cù cāi xuǎn dá àn",
                    translation = "Ujian kemarin memiliki jumlah soal yang banyak dan tingkat kesulitan tinggi; Da Long tidak sempat menyelesaikan lembar ujian, Su Nan walau selesai menulis merasa kesulitan memahami kalimat bacaan panjang sehingga di menit akhir terpaksa menebak jawaban.",
                    tokens = listOf(
                        WordToken("考试", "kǎo shì", "examination / test", "Kosakata HSK 2: 考试 (kǎo shì)"),
                        WordToken("不仅...而且", "bù jǐn ér qiě", "not only... but also", "Tata bahasa HSK 3: 不仅...而且"),
                        WordToken("尽管", "jǐn guǎn", "although / despite", "Tata bahasa HSK 3: 尽管 (jǐn guǎn)"),
                        WordToken("来不及", "lái bu jí", "there's not enough time", "Kosakata HSK 3: 来不及 (lái bu jí)")
                    )
                ),
                Sentence(
                    id = "s_exmrs_2",
                    hanzi = "大龙遇到几个生僻字难以下笔，铃美也因一道明明学过却突然卡壳的词汇急得直跳脚，大家这才发现原来全班都深感不易。",
                    pinyin = "Dà lóng yù dào jǐ gè shēng pì zì nán yǐ xià bǐ Líng měi yě yīn yī dào míng míng xué guò què tū rán qiǎ ké de cí huì jí de zhí tiào jiǎo dà jiā zhè cái fā xiàn yuán lái quán bān dōu shēn gǎn bù yì",
                    translation = "Da Long menjumpai beberapa karakter Hanzi yang belum pernah dilihat sehingga tak bisa menulisnya, Ling Mei pun sempat panik karena satu kosakata yang sebenarnya sudah dipelajari mendadak lupa saat ujian; mereka baru tersadar semua orang pun merasakan kesulitan serupa.",
                    tokens = listOf(
                        WordToken("从来", "cóng lái", "always / at all times", "Kosakata HSK 3: 从来 (cóng lái)"),
                        WordToken("明明", "míng míng", "obviously / clearly", "Kosakata HSK 3: 明明 (míng míng)"),
                        WordToken("突然", "tū rán", "suddenly", "Kosakata HSK 3: 突然 (tū rán)"),
                        WordToken("难过", "nán guò", "sad / upset", "Kosakata HSK 3: 难过 (nán guò)")
                    )
                ),
                Sentence(
                    id = "s_exmrs_3",
                    hanzi = "考后大家释怀相劝，决定下阶段认真查漏补缺，眼下结伴去看场精彩电影好好放松紧绷的神经，相约下次再接再厉。",
                    pinyin = "kǎo hòu dà jiā shì huái xiāng quàn jué dìng xià jiē duàn rèn zhēn chá lòu bǔ quē yǎn xià jié bàn qù kàn chǎng jīng cǎi diàn yǐng hǎo hǎo fàng sōng jǐn bēng de shén jīng xiāng yuē xià cì zài jiē zài lì",
                    translation = "Seusai ujian mereka saling menghibur, bertekad memperdalam materi di masa mendatang, dan saat ini sepakat pergi menonton film menarik bersama untuk melepas kepenatan, serta berjanji terus bersemangat pada ujian berikutnya.",
                    tokens = listOf(
                        WordToken("复习", "fù xí", "to review / revise", "Kosakata HSK 3: 复习 (fù xí)"),
                        WordToken("紧张", "jǐn zhāng", "nervous", "Kosakata HSK 3: 紧张 (jǐn zhāng)"),
                        WordToken("放松", "fàng sōng", "to relax", "Kosakata HSK 3: 放松 (fàng sōng)"),
                        WordToken("努力", "nǔ lì", "to strive / work hard", "Kosakata HSK 2: 努力 (nǔ lì)")
                    )
                )
            ),
            questions = listOf(
                StoryQuestion(
                    id = "q_exmrs_1",
                    questionText = "苏南在作答阅读理解部分时遭遇了怎样的做题困惑？ (Kesulitan apa yang dialami Su Nan saat mengerjakan soal bagian membaca?)",
                    options = listOf("眼镜摔碎看不清字 (Kacamatanya pecah)", "单个汉字基本都认识，但连缀成长句后难以透彻领会整体句意 (Hampir semua karakter Hanzi dikenali, namun saat dirangkai dalam kalimat panjang sulit memahami artinya)", "试卷印错漏页 (Lembar ujian salah cetak)", "听力录音声音太嘈杂 (Rekaman listening terlalu bising)"),
                    correctAnswerIndex = 1,
                    explanation = "Su Nan menjelaskan: '大部分汉字我都认识，可是放在一起，我就看不懂了'."
                ),
                StoryQuestion(
                    id = "q_exmrs_2",
                    questionText = "铃美在考试过程中最令她感到焦急沮丧的具体情况是什么？ (Momen paling menjengkelkan apa yang dialami Ling Mei selama ujian?)",
                    options = listOf("铅笔突然折断没有削笔刀 (Pensil patah)", "某个词汇明明之前认真学过，考试当下却怎么也突然想不起来 (Suatu kosakata jelas-jelas pernah dipelajari, namun mendadak lupa saat ujian)", "弄翻了桌上的墨水 (Menumpahkan tinta di meja)", "走错了考场教室 (Salah masuk ruang ujian)"),
                    correctAnswerIndex = 1,
                    explanation = "Ling Mei berkata: '有个词语我明明学过，就是突然想不起来了，急死我了！'."
                ),
                StoryQuestion(
                    id = "q_exmrs_3",
                    questionText = "交流完考试心得后，大家决定通过什么活动排解考前的紧张压力？ (Aktivitas apa yang diputuskan bersama untuk melepas ketegangan seusai ujian?)",
                    options = listOf("立刻关在房间做一百道模拟题 (Mengerjakan 100 soal di kamar)", "结伴去电影院看电影好好放松身心 (Pergi nonton film bersama di bioskop untuk relaksasi)", "向教务处申请退学 (Mengajukan pengunduran diri)", "喝浓咖啡熬夜补课 (Minum kopi pekat begadang belajar)"),
                    correctAnswerIndex = 1,
                    explanation = "Teks menyatakan: '别难过了大龙！我们去看电影吧... 现在已经考完了，我们就一起放松放松吧！'."
                )
            )
        ),

        // Cerita Mandarin Bean 236 (HSK 3): Prepare for a test (Mempersiapkan Diri Menghadapi Ujian)
        Story(
            id = "story_prepare_exam",
            titleHanzi = "准备考试",
            titlePinyin = "Zhǔnbèi Kǎoshì",
            titleTranslation = "Prepare for a test (Persiapan Ujian Hari Senin)",
            level = "HSK 3",
            category = "Pendidikan & Ketekunan",
            description = "Da Long yang sempat tertinggal materi karena sakit mengajak Ling Mei dan Su Nan belajar bersama di perpustakaan demi menghadapi ujian bahasa Mandarin hari Senin.",
            coverEmoji = "📚",
            coverImageRes = R.drawable.cover_story_prepare_exam,
            estimatedReadMinutes = 2,
            sentences = listOf(
                Sentence(
                    id = "s_prpexm_1",
                    hanzi = "下周一即将迎来重要测验，大龙因前次抱恙抱病缺了几节核心课业而心存忐忑，主动相约铃美共同复习。",
                    pinyin = "xià zhōu yī jí jiāng yíng lái zhòng yào cè yàn Dà lóng yīn qián cì bào yàng bào bìng quē le jǐ jié hé xīn kè yè ér xīn cún tǎn tè zhǔ dòng xiāng yuē Líng měi gòng tóng fù xí",
                    translation = "Hari Senin depan akan diadakan ujian penting; Da Long yang sempat tertinggal beberapa materi pelajaran utama saat jatuh sakit merasa khawatir, lalu berinisiatif mengajak Ling Mei belajar bersama.",
                    tokens = listOf(
                        WordToken("考试", "kǎo shì", "exam", "Kosakata HSK 2: 考试 (kǎo shì)"),
                        WordToken("复习", "fù xí", "to review", "Kosakata HSK 3: 复习 (fù xí)"),
                        WordToken("担心", "dān xīn", "to worry", "Kosakata HSK 3: 担心 (dān xīn)"),
                        WordToken("紧张", "jǐn zhāng", "nervous", "Kosakata HSK 3: 紧张 (jǐn zhāng)")
                    )
                ),
                Sentence(
                    id = "s_prpexm_2",
                    hanzi = "铃美原打算课后去影院观影，虽自认平时功课扎实，但深表赞同：即便日常按部就班，考前严谨查缺补漏仍不可松懈。",
                    pinyin = "Líng měi yuán dǎ suàn kè hòu qù yǐng yuàn guān yǐng suī zì rèn píng shí gōng kè zhā shi dàn shēn biǎo zàn tóng jí biàn rì cháng àn bù jiù bān kǎo qián yán jǐn chá quē bǔ lòu réng bù kě sōng xiè",
                    translation = "Ling Mei semula berencana nonton bioskop seusai kelas, dan walau ia terbiasa mengerjakan PR dengan tekun, ia sangat setuju: sekalipun belajar teratur di hari biasa, persiapan ujian yang sungguh-sungguh tetap wajib dilakukan.",
                    tokens = listOf(
                        WordToken("再说", "zài shuō", "moreover / besides", "Tata bahasa HSK 3: 再说 (zài shuō)"),
                        WordToken("作业", "zuò yè", "homework", "Kosakata HSK 3: 作业 (zuò yè)"),
                        WordToken("认真", "rèn zhēn", "conscientious / earnest", "Kosakata HSK 3: 认真 (rèn zhēn)"),
                        WordToken("即使...也", "jí shǐ yě", "even if... still", "Tata bahasa HSK 3: 即使...也")
                    )
                ),
                Sentence(
                    id = "s_prpexm_3",
                    hanzi = "两人随即决定通知并邀约苏南一同加入学习小组，并约定课后直接在安静的学校图书馆研读备战。",
                    pinyin = "liǎng rén suí jí jué dìng tōng zhī bìng yāo yuē Sū nán yī tóng jiā rù xué xí xiǎo zǔ bìng yuē dìng kè hòu zhí jiē zài ān jìng de xué xiào tú shū guǎn yán dú bèi zhàn",
                    translation = "Keduanya lantas sepakat menghubungi dan mengajak Su Nan bergabung dalam kelompok belajar, serta berjanji seusai kelas langsung bertemu di perpustakaan sekolah yang tenang untuk mempersiapkan ujian.",
                    tokens = listOf(
                        WordToken("咱们", "zán men", "we / us (inclusive)", "Kosakata HSK 3: 咱们 (zán men)"),
                        WordToken("图书馆", "tú shū guǎn", "library", "Kosakata HSK 3: 图书馆"),
                        WordToken("见", "jiàn", "to meet / see", "Kosakata HSK 1: 见 (jiàn)")
                    )
                )
            ),
            questions = listOf(
                StoryQuestion(
                    id = "q_prpexm_1",
                    questionText = "大龙之所以对下周一的中文考试感到格外紧张担心的主要原因是什么？ (Apa alasan utama Da Long merasa sangat gugup menghadapi ujian hari Senin depan?)",
                    options = listOf("弄丢了教科书 (Buku pelajarannya hilang)", "之前生病请假缺席了几堂关键的课，心里有些没底 (Sempat izin sakit beberapa pertemuan sehingga merasa kurang percaya diri)", "老师不准他参加入学考 (Guru melarangnya ikut ujian)", "考试全部是口头演讲 (Semua ujian berupa pidato lisan)"),
                    correctAnswerIndex = 1,
                    explanation = "Da Long menjelaskan: '平时我也认真学习了，就是上次生病，有几节课没来，我有点担心。只有好好复习，我才不紧张'."
                ),
                StoryQuestion(
                    id = "q_prpexm_2",
                    questionText = "铃美在对话中表达了哪种严谨端正的备考学习态度？ (Sikap belajar teliti apa yang diungkapkan Ling Mei dalam percakapan?)",
                    options = listOf("只要平时交了作业，考前就可以完全不看书 (Asal sudah kumpul PR, sebelum ujian tidak perlu baca buku)", "即使平时认真听讲完成了作业，考前依然必须高度重视、认真准备 (Sekalipun rajin belajar dan bikin PR, menjelang ujian tetap harus disiapkan sungguh-sungguh)", "考试全凭运气 (Ujian hanya soal hoki)", "考前通宵不睡觉效果最好 (Begadang semalaman sebelum ujian paling baik)"),
                    correctAnswerIndex = 1,
                    explanation = "Ling Mei berujar bijak: '你说得对！即使平时好好学习了，也要认真准备考试'."
                ),
                StoryQuestion(
                    id = "q_prpexm_3",
                    questionText = "大龙、铃美和苏南最终选择在哪里碰头开展考前复习？ (Di manakah Da Long, Ling Mei, dan Su Nan sepakat bertemu untuk belajar bersama?)",
                    options = listOf("喧闹的商业街咖啡馆 (Kafe jalanan yang bising)", "学校图书馆 (Perpustakaan sekolah)", "电影院候影大厅 (Lobi bioskop)", "宿舍楼下餐厅 (Kantin bawah asrama)"),
                    correctAnswerIndex = 1,
                    explanation = "Teks menyatakan: '好，你叫一下苏南，我们图书馆见！'."
                )
            )
        ),

        // Cerita Mandarin Bean 237 (HSK 3): Leave application note (Mengisi Formulir Izin Sakit)
        Story(
            id = "story_leave_note",
            titleHanzi = "请假条与规定",
            titlePinyin = "Qǐngjiàtiáo yǔ Guīdìng",
            titleTranslation = "Leave Application Note (Formulir Izin Sakit & Regulasi)",
            level = "HSK 3",
            category = "Sekolah & Administrasi",
            description = "Su Nan membantu sahabatnya Da Long mengurus surat izin sakit di ruang Guru Wang: mengisi formulir izin resmi, alasan absensi, serta kewajiban melampirkan surat dokter.",
            coverEmoji = "📄",
            coverImageRes = R.drawable.cover_story_leave_note,
            estimatedReadMinutes = 2,
            sentences = listOf(
                Sentence(
                    id = "s_levnot_1",
                    hanzi = "苏南前往王老师办公室协助因重感冒卧床的大龙代办请假两天的手续，并在老师指导下如实填写书面请假条。",
                    pinyin = "Sū nán qián wǎng Wáng lǎo shī bàn gōng shì xié zhù yīn zhòng gǎn mào wò chuáng de Dà lóng dài bàn qǐng jià liǎng tiān de shǒu xù bìng zài lǎo shī zhǐ dǎo xià rú shí tián xiě shū miàn qǐng jià tiáo",
                    translation = "Su Nan datang ke kantor Guru Wang untuk membantu menguruskan izin sakit dua hari bagi Da Long yang terbaring flu berat, dan mengisi formulir surat permohonan izin tertulis sesuai arahan guru.",
                    tokens = listOf(
                        WordToken("请假", "qǐng jià", "to ask for leave", "Kosakata HSK 3: 请假 (qǐng jià)"),
                        WordToken("感冒", "gǎn mào", "cold / flu", "Kosakata HSK 3: 感冒 (gǎn mào)"),
                        WordToken("请假条", "qǐng jià tiáo", "written leave request note", "Istilah administrasi sekolah"),
                        WordToken("填", "tián", "to fill in (a form)", "Kosakata HSK 3: 填 (tián)")
                    )
                ),
                Sentence(
                    id = "s_levnot_2",
                    hanzi = "根据请假规范要求，申请单上须清晰工整载明请假人姓名、详细生病原因以及确切请假天数。",
                    pinyin = "gēn jù qǐng jià guī fàn yāo qiú shēn qǐng dān shàng xū qīng xī gōng zhěng zǎi míng qǐng jià rén xìng míng xiáng xì shēng bìng yuán yīn yǐ jí què qiè qǐng jià tiān shù",
                    translation = "Berdasarkan pedoman pengajuan izin, pada formulir harus tercantum dengan jelas dan rapi nama pemohon, penyebab sakit yang rinci, serta kepastian berapa hari durasi izin yang diambil.",
                    tokens = listOf(
                        WordToken("原因", "yuán yīn", "cause / reason", "Kosakata HSK 3: 原因 (yuán yīn)"),
                        WordToken("清楚", "qīng chu", "clear / distinct", "Kosakata HSK 2: 清楚 (qīng chu)"),
                        WordToken("两", "liǎng", "two", "Kosakata HSK 1: 两 (liǎng)")
                    )
                ),
                Sentence(
                    id = "s_levnot_3",
                    hanzi = "王老师特别关照学校校规：下周必须补交正规医院开具的诊断证明，否则出勤分将依照规定扣除整整十分。",
                    pinyin = "Wáng lǎo shī tè bié guān zhào xué xiào xiào guī xià zhōu bì xū bǔ jiāo zhèng guī yī yuàn kāi jù de zhěn duàn zhèng míng fǒu zé chū qín fēn jiāng yī zhào guī dìng kòu chú zhěng zhěng shí fēn",
                    translation = "Guru Wang secara khusus menegaskan peraturan sekolah: minggu depan wajib menyusulkan surat keterangan resmi dari rumah sakit, jika tidak maka poin presensi kehadiran akan dipotong 10 poin sesuai regulasi kampus.",
                    tokens = listOf(
                        WordToken("证明", "zhèng míng", "certificate / proof", "Kosakata HSK 3: 证明 (zhèng míng)"),
                        WordToken("出勤", "chū qín", "attendance", "Kosakata akademik: 出勤"),
                        WordToken("规定", "guī dìng", "rule / regulation", "Kosakata HSK 3: 规定 (guī dìng)"),
                        WordToken("扣", "kòu", "to deduct (points/marks)", "Kosakata HSK 3: 扣 (kòu)")
                    )
                )
            ),
            questions = listOf(
                StoryQuestion(
                    id = "q_levnot_1",
                    questionText = "根据王老师的要求，在填写正规请假条时必须写清楚哪三项基本核心信息？ (Tiga informasi pokok apa yang wajib dituliskan saat mengisi formulir permohonan izin?)",
                    options = listOf("家庭住址、父母电话和银行账号 (Alamat, telepon ortu, rekening bank)", "姓名、请假原因以及具体请假天数 (Nama lengkap, alasan permohonan izin, dan jumlah hari izin)", "高考成绩、身高和体重 (Nilai ujian, tinggi dan berat badan)", "平时考试排名 (Peringkat ujian harian)"),
                    correctAnswerIndex = 1,
                    explanation = "Guru Wang mengingatkan: '你把名字、请假原因和请几天假写清楚'."
                ),
                StoryQuestion(
                    id = "q_levnot_2",
                    questionText = "按照学校考勤规章制度，因病请假的学生下周必须补交什么证明材料？ (Menurut peraturan sekolah, bukti berkas apa yang harus diserahkan siswa sakit minggu depan?)",
                    options = listOf("学生会主席的推荐信 (Surat rekomendasi ketua BEM)", "正规医院出具的就诊证明（医院证明） (Surat keterangan diagnosis resmi dari pihak rumah sakit)", "家长的视频通话录像 (Rekaman video orang tua)", "药店的付款小票 (Struk bayar apotek)"),
                    correctAnswerIndex = 1,
                    explanation = "Teks menyatakan: '下个星期把医院证明交给我。没有医院证明，他的出勤分要扣十分，这是学校的规定'."
                ),
                StoryQuestion(
                    id = "q_levnot_3",
                    questionText = "如果生病缺课的学生无法在期限内提交合规医院证明，将面临什么处分？ (Konsekuensi apa yang didapat jika siswa tidak melampirkan surat dokter resmi?)",
                    options = listOf("被立即开除学籍 (Dikeluarkan dari kampus)", "该课程出勤成绩将被依规扣除十分 (Nilai presensi kehadiran akan dipotong 10 poin)", "罚抄课文一百遍 (Menyalin teks 100 kali)", "禁止参加期末考试 (Dilarang ikut ujian akhir)"),
                    correctAnswerIndex = 1,
                    explanation = "Teks menyebutkan secara tegas: '他的出勤分要扣十分，这是学校的规定'."
                )
            )
        ),

        // Cerita Mandarin Bean 238 (HSK 3): Ask for leave for me (Minta Tolong Izinkan Sakit)
        Story(
            id = "story_ask_for_leave",
            titleHanzi = "帮我请假",
            titlePinyin = "Bāng Wǒ Qǐngjià",
            titleTranslation = "Ask for leave for me (Minta Tolong Izin & Efek AC)",
            level = "HSK 3",
            category = "Kehidupan Asrama & Persahabatan",
            description = "Da Long yang membaik mendadak kambuh parah akibat menyetel AC ke 16°C di akhir pekan; ia meminta Su Nan memintakan izin ke guru dan meminjam catatan kuliah.",
            coverEmoji = "📱",
            coverImageRes = R.drawable.cover_story_ask_for_leave,
            estimatedReadMinutes = 2,
            sentences = listOf(
                Sentence(
                    id = "s_asklev_1",
                    hanzi = "苏南致电询问大龙缺课原因，大龙懊恼解释昨夜服下感冒药后昏睡沉沉，早晨未听见闹钟响声导致睡过头。",
                    pinyin = "Sū nán zhì diàn xūn wèn Dà lóng quē kè yuán yīn Dà lóng ào nǎo jiě shì zuó yè fú xià gǎn mào yào hòu hūn shuì chén chén zǎo chen wèi tīng jiàn nào zhōng xiǎng shēng dǎo zhì shuì guò tóu",
                    translation = "Su Nan menelepon menanyakan kenapa Da Long tidak masuk kuliah; Da Long menyesal menjelaskan semalam sehabis minum obat flu ia tertidur lelap sehingga pagi harinya tidak mendengar suara alarm dan bangun kesiangan.",
                    tokens = listOf(
                        WordToken("睡过头", "shuì guò tóu", "to oversleep", "Kosakata HSK 3: 睡过头"),
                        WordToken("感冒药", "gǎn mào yào", "cold medicine", "Kosakata HSK 3: 药 (yào)"),
                        WordToken("闹钟", "nào zhōng", "alarm clock", "Kosakata HSK 3: 闹钟 (nào zhōng)"),
                        WordToken("响", "xiǎng", "to ring / sound", "Kosakata HSK 3: 响 (xiǎng)")
                    )
                ),
                Sentence(
                    id = "s_asklev_2",
                    hanzi = "本已好转的感冒之所以急转直下加重，全因周末嫌热贪凉将室内空调一路打到16度极低温度，反导致病情加剧。",
                    pinyin = "běn yǐ hǎo zhuǎn de gǎn mào zhī suǒ yǐ jí zhuǎn zhí xià jiā zhòng quán yīn zhōu mò xián rè tān liáng jiāng shì nèi kōng tiáo yī lù dǎ dào shí liù dù jí dī wēn dù fǎn dǎo zhì bìng qíng jiā jù",
                    translation = "Penyakit flu yang asalnya hampir sembuh malah memburuk kembali, semua itu gara-gara di akhir pekan ia kepanasan dan menyetel suhu AC kamar hingga 16 derajat dingin membeku, bukannya membaik malah sakitnya bertambah parah.",
                    tokens = listOf(
                        WordToken("本来", "běn lái", "originally / at first", "Kosakata HSK 3: 本来 (běn lái)"),
                        WordToken("空调", "kōng tiáo", "air conditioning", "Kosakata HSK 3: 空调 (kōng tiáo)"),
                        WordToken("不但...反而", "bù dàn fǎn ér", "not only not... but on the contrary", "Tata bahasa HSK 3: 反而 (fǎn ér)"),
                        WordToken("严重", "yán zhòng", "serious / severe", "Kosakata HSK 3: 严重 (yán zhòng)")
                    )
                ),
                Sentence(
                    id = "s_asklev_3",
                    hanzi = "大龙请苏南代向王老师请假两日，鉴于今日讲授新章节且周五有考，苏南仗义应承课后携完整课堂笔记登门辅导。",
                    pinyin = "Dà lóng qǐng Sū nán dài xiàng Wáng lǎo shī qǐng jià liǎng rì jiàn yú jīn rì jiǎng shòu xīn zhāng jié qiě zhōu wǔ yǒu kǎo Sū nán zhàng yì yìng chéng kè hòu xié wán zhěng kè táng bǐ jì dēng mén fǔ dǎo",
                    translation = "Da Long memohon bantuan Su Nan memintakan izin dua hari ke Guru Wang; mengingat hari ini ada materi bab baru dan Jumat depan akan ada ujian, Su Nan dengan tulus bersedia membawakan buku catatan kuliah ke rumahnya.",
                    tokens = listOf(
                        WordToken("恐怕", "kǒng pà", "I'm afraid that / perhaps", "Kosakata HSK 3: 恐怕 (kǒng pà)"),
                        WordToken("要是", "yào shi", "if / in case", "Kosakata HSK 3: 要是 (yào shi)"),
                        WordToken("笔记", "bǐ jì", "study notes", "Kosakata HSK 3: 笔记 (bǐ jì)")
                    )
                )
            ),
            questions = listOf(
                StoryQuestion(
                    id = "q_asklev_1",
                    questionText = "大龙本已好转的感冒之所以反常地再次急剧恶化，直接诱因是什么？ (Apa penyebab langsung sakit flu Da Long yang hampir sembuh mendadak kambuh parah?)",
                    options = listOf("淋了一场暴雨 (Kehujanan lebat)", "周末贪凉把房间空调温度降到了16度的极低极冷设定 (Akhir pekan kepanasan dan menyetel suhu AC kamar ke 16°C yang sangat dingin)", "吃了过多变质冰淇淋 (Makan es krim basi)", "去冰水湖里游泳 (Berenang di danau air es)"),
                    correctAnswerIndex = 1,
                    explanation = "Da Long menjelaskan: '周末我太热了，空调开到了16度。现在我的感冒不但没好，反而更严重了'."
                ),
                StoryQuestion(
                    id = "q_asklev_2",
                    questionText = "除了身体抱恙无法起床外，大龙早上没有准时到达教室的另一个直接原因是什么？ (Selain badan lemas sakit, apa penyebab langsung Da Long bangun kesiangan?)",
                    options = listOf("自行车车链断了 (Rantai sepeda putus)", "昨晚服用了强效感冒药睡得很沉，早晨完全没听见闹钟鸣响 (Semalam minum obat flu sehingga tidur sangat lelap dan tak mendengar bunyi alarm)", "宿舍门锁坏了出不来 (Kunci asrama rusak)", "以为今天是周日 (Mengira hari ini hari Minggu)"),
                    correctAnswerIndex = 1,
                    explanation = "Teks menyatakan: '对不起，我睡过头了。昨晚吃了感冒药，今天早上没听见闹钟响'."
                ),
                StoryQuestion(
                    id = "q_asklev_3",
                    questionText = "考虑到本周五将有正式测验，苏南答应以何种贴心方式帮助卧病在家的大龙跟上教学进度？ (Cara suportif apa yang disetujui Su Nan agar Da Long yang sakit tetap bisa mengejar pelajaran jelang ujian Jumat?)",
                    options = listOf("替大龙代考 (Mewakili Da Long ujian)", "抽空前往大龙家，把自己记录的完整课堂笔记借给他研读 (Menyempatkan waktu ke rumah Da Long meminjamkan catatan kuliahnya)", "劝大龙放弃这门课 (Menyarankan drop mata kuliah)", "要求老师取消周五考试 (Minta guru batalkan ujian)"),
                    correctAnswerIndex = 1,
                    explanation = "Da Long meminta: '要是你今天有空，就来我家，给我看看你的笔记，可以吗？' dan Su Nan menyanggupi: '没问题'."
                )
            )
        ),

        // Cerita Mandarin Bean 239 (HSK 3): Going to be late (Buru-buru Takut Terlambat)
        Story(
            id = "story_going_to_be_late",
            titleHanzi = "要迟到了？",
            titlePinyin = "Yào Chídào Le?",
            titleTranslation = "Going to be late (Panik Takut Terlambat Masuk Kelas)",
            level = "HSK 3",
            category = "Cerita Lucu & Kampus",
            description = "Da Long dan Su Nan panik tergesa-gesa memacu kendaraan karena mengira akan terlambat kuliah; begitu tiba di kampus yang sepi melompong, barulah sadar hari itu libur Festival Musim Gugur.",
            coverEmoji = "⏰",
            coverImageRes = R.drawable.cover_story_going_to_be_late,
            estimatedReadMinutes = 2,
            sentences = listOf(
                Sentence(
                    id = "s_gtblat_1",
                    hanzi = "昨夜贪看精彩电影熬至凌晨两点的大龙困倦难支，眼看距八点上课仅剩二十分钟，一路心急如焚催促开车的苏南加快速率。",
                    pinyin = "zuó yè tān kàn jīng cǎi diàn yǐng áo zhì líng chén liǎng diǎn de Dà lóng kùn juàn nán zhī yǎn kàn jù bā diǎn shàng kè jǐn shèng èr shí fēn zhōng yī lù xīn jí rú fén cuī cù kāi chē de Sū nán jiā kuài sù lǜ",
                    translation = "Semalam keasyikan nonton film bagus sampai jam dua dini hari membuat Da Long mengantuk berat; melihat waktu hanya tersisa 20 menit menuju jam 08:00 kelas dimulai, ia sepanjang jalan panik mendesak Su Nan memacu kendaraannya lebih kencang.",
                    tokens = listOf(
                        WordToken("快点", "kuài diǎn", "hurry up / faster", "Kosakata HSK 2: 快 (kuài)"),
                        WordToken("迟到", "chí dào", "to be late", "Kosakata HSK 3: 迟到 (chí dào)"),
                        WordToken("着急", "zháo jí", "anxious", "Kosakata HSK 3: 着急 (zháo jí)"),
                        WordToken("来得及", "lái de jí", "there's still time / can make it", "Kosakata HSK 3: 来得及 (lái de jí)")
                    )
                ),
                Sentence(
                    id = "s_gtblat_2",
                    hanzi = "苏南从容安抚表示时间绰绰有余，两人下车后拎着书包狂奔教学楼，却错愕发现整座大学校园空无一人、格外静谧。",
                    pinyin = "Sū nán cóng róng ān fǔ biǎo shì shí jiān chuò chuò yǒu yú liǎng rén xià chē hòu līn zhe shū bāo kuáng bēn jiào xué lóu què cuò è fā xiàn zhěng zuò dà xué xiào yuán kōng wú yī rén gé wài jìng mì",
                    translation = "Su Nan menenangkannya bahwa waktu masih cukup; begitu turun mobil mereka menenteng ransel berlari kencang menuju gedung kuliah, namun tercengang mendapati kampus universitas begitu sepi melompong tanpa ada seorang pun.",
                    tokens = listOf(
                        WordToken("困", "kùn", "sleepy", "Kosakata HSK 3: 困 (kùn)"),
                        WordToken("书包", "shū bāo", "schoolbag / backpack", "Kosakata HSK 3: 书包 (shū bāo)"),
                        WordToken("不然", "bù rán", "otherwise / or else", "Tata bahasa HSK 3: 不然 (bù rán)")
                    )
                ),
                Sentence(
                    id = "s_gtblat_3",
                    hanzi = "大龙急电询问铃美，才恍然得知今日正值法定中秋佳节全校停课放假，虚惊一场的两人相视大笑，索性悠闲转去享用美味早餐。",
                    pinyin = "Dà lóng jí diàn xún wèn Líng měi cái huǎng rán dé zhī jīn rì zhèng zhí fǎ dìng Zhōng qiū jiā jié quán xiào tíng kè fàng jià xū jīng yī chǎng de liǎng rén xiāng shì dà xiào suǒ xì yōu xián zhuǎn qù xiǎng yòng měi wèi zǎo cān",
                    translation = "Da Long segera menelepon Ling Mei, barulah mereka sadar hari ini bertepatan dengan libur resmi Festival Musim Gugur sehingga seluruh kampus libur; kepanikan berujung tawa geli, dan keduanya pun memutuskan santai pergi sarapan enak.",
                    tokens = listOf(
                        WordToken("星期五", "xīng qī wǔ", "Friday", "Kosakata HSK 1: 星期五"),
                        WordToken("中秋节", "Zhōng qiū jié", "Mid-Autumn Festival", "Hari libur festival"),
                        WordToken("忘", "wàng", "to forget", "Kosakata HSK 3: 忘 (wàng)"),
                        WordToken("早餐", "zǎo cān", "breakfast", "Kosakata HSK 3: 早餐 (zǎo cān)")
                    )
                )
            ),
            questions = listOf(
                StoryQuestion(
                    id = "q_gtblat_1",
                    questionText = "大龙在清晨乘车途中之所以双眼发困、精神不振的起因是什么？ (Apa penyebab Da Long luar biasa mengantuk di jalan pada pagi hari itu?)",
                    options = listOf("生病吃了安眠药 (Minum obat tidur)", "昨夜看了一部非常引人入胜的精彩电影，熬夜直到凌晨两点才睡 (Semalam begadang menonton film yang sangat seru sampai jam 2 subuh)", "夜里通宵打篮球 (Main basket semalaman)", "在公司加班通宵 (Lembur semalam suntuk di kantor)"),
                    correctAnswerIndex = 1,
                    explanation = "Teks menyatakan: '我们昨晚两点才睡，我现在困得睁不开眼睛。昨天那个电影太好看了'."
                ),
                StoryQuestion(
                    id = "q_gtblat_2",
                    questionText = "两人急匆匆冲进校园后，遭遇了怎样出乎意料的怪异景象？ (Pemandangan mengejutkan apa yang mereka temui saat tiba di kampus?)",
                    options = listOf("校门被大铁锁紧锁 (Pintu gerbang digembok)", "整个校园里空荡荡的，连半个人影都没有 (Seluruh lingkungan kampus sepi sunyi, tanpa ada seorang pun)", "全校师生正在操场集合开会 (Semua orang kumpul di lapangan)", "教室被改装成了游乐场 (Ruang kelas berubah jadi tempat main)"),
                    correctAnswerIndex = 1,
                    explanation = "Teks mencatat: '到了，别忘了书包。怎么学校里没有人？'."
                ),
                StoryQuestion(
                    id = "q_gtblat_3",
                    questionText = "经过电话联系铃美，导致两人闹出这场“空跑一场”大乌龙的真正事实是什么？ (Fakta sesungguhnya apa yang memicu kepanikan konyol mereka berdua?)",
                    options = listOf("他们走错了其他大学 (Mereka salah masuk kampus orang)", "当天正好是传统中秋节法定假日，学校全体师生依法停课放假 (Hari itu bertepatan dengan libur resmi Festival Musim Gugur, sekolah libur)", "上课时间推迟到下午 (Jam kuliah diundur ke sore)", "老师临时出差取消了课程 (Guru dinas luar kota)"),
                    correctAnswerIndex = 1,
                    explanation = "Teks menyatakan: '铃美说今天中秋节，不上课。哎呀！我们忘了！才八点，我们吃个早餐再回去吧！'."
                )
            )
        ),

        // Cerita Mandarin Bean 240 (HSK 3): Shopping at the mall (Panduan Lantai Pusat Perbelanjaan)
        Story(
            id = "story_mall_floors",
            titleHanzi = "新商场逛街指南",
            titlePinyin = "Xīn Shāngchǎng Guàngjiē Zhǐnán",
            titleTranslation = "Shopping at the Mall (Navigasi Lantai Mall Modern)",
            level = "HSK 3",
            category = "Kehidupan & Belanja",
            description = "Wu Xiaomi dan Ling Mei menjelajahi pusat perbelanjaan baru: navigasi tata letak lantai dari supermarket basement, pakaian wanita L3, hingga bioskop dan kuliner L6.",
            coverEmoji = "🛍️",
            coverImageRes = R.drawable.cover_story_mall_floors,
            estimatedReadMinutes = 2,
            sentences = listOf(
                Sentence(
                    id = "s_malflr_1",
                    hanzi = "小咪与铃美来到新落成的大型购物中心，商场从负一层超市小吃、一楼珠宝电器到二楼童装家居，品类琳琅满目。",
                    pinyin = "Xiǎo mī yǔ Líng měi lái dào xīn luò chéng de dà xíng gòu wù zhōng xīn shāng chǎng cóng fù yī céng chāo shì xiǎo chī yī lóu zhū bǎo diàn qì dào èr lóu tóng zhuāng jiā jū pǐn lèi lín láng mǎn mù",
                    translation = "Xiaomi dan Ling Mei berkunjung ke pusat perbelanjaan megah yang baru buka; mall ini memiliki tata letak lengkap mulai dari basement B1 untuk supermarket dan jajanan, L1 untuk perhiasan dan elektronik, hingga L2 untuk busana anak dan perabot rumah.",
                    tokens = listOf(
                        WordToken("商场", "shāng chǎng", "shopping mall", "Kosakata HSK 3: 商场 (shāng chǎng)"),
                        WordToken("超市", "chāo shì", "supermarket", "Kosakata HSK 3: 超市 (chāo shì)"),
                        WordToken("层", "céng", "floor / layer", "Kosakata HSK 3: 层 (céng)"),
                        WordToken("电子产品", "diàn zǐ chǎn pǐn", "electronic products", "Kosakata HSK 3: 电子产品")
                    )
                ),
                Sentence(
                    id = "s_malflr_2",
                    hanzi = "楼层指示显示三楼为时尚女装，四楼男装，五楼运动户外，六楼则汇集了高端电影院与各类特色风味餐厅。",
                    pinyin = "lóu céng zhǐ shì xiǎn shì sān lóu wèi shí shàng nǚ zhuāng sì lóu nán zhuāng wǔ lóu yùn dòng hù wài liù lóu zé huì jí le gāo duān diàn yǐng yuàn yǔ gè lèi tè sè fēng wèi cān tīng",
                    translation = "Papan penunjuk lantai menunjukkan lantai 3 adalah busana wanita, lantai 4 pakaian pria, lantai 5 perlengkapan olahraga luar ruangan, dan lantai 6 menghadirkan bioskop modern serta deretan restoran pilihan.",
                    tokens = listOf(
                        WordToken("女装", "nǚ zhuāng", "women's clothing", "Kosakata pakaian"),
                        WordToken("电影院", "diàn yǐng yuàn", "cinema / movie theater", "Kosakata HSK 2: 电影院"),
                        WordToken("餐厅", "cān tīng", "restaurant / dining hall", "Kosakata HSK 3: 餐厅 (cān tīng)")
                    )
                ),
                Sentence(
                    id = "s_malflr_3",
                    hanzi = "铃美提议先在一楼买杯奶茶边喝边上三楼挑选心仪裙装，采买完毕再去六楼共进晚餐，趁着十点半闭店前悠闲尽兴漫游。",
                    pinyin = "Líng měi tí yì xiān zài yī lóu mǎi bēi nǎi chá biān hē biān shàng sān lóu tiāo xuǎn xīn yí qún zhuāng cǎi mǎi wán bì zài qù liù lóu gòng jìn wǎn cān chèn zhe shí diǎn bàn bì diàn qián yōu xián jìn xìng màn yóu",
                    translation = "Ling Mei mengusulkan membeli segelas boba milk tea dulu untuk diminum santai sambil menuju lantai 3 memilih busana wanita, lalu sehabis berbelanja naik ke lantai 6 makan malam, menikmati waktu sebelum mall tutup pukul 22:30.",
                    tokens = listOf(
                        WordToken("奶茶", "nǎi chá", "milk tea", "Kuliner populer"),
                        WordToken("慢慢", "màn màn", "slowly / leisurely", "Kosakata HSK 2: 慢 (màn)"),
                        WordToken("关门", "guān mén", "to close shop", "Kosakata HSK 2: 关门 (guān mén)")
                    )
                )
            ),
            questions = listOf(
                StoryQuestion(
                    id = "q_malflr_1",
                    questionText = "根据商场各楼层功能规划分布，女士想要购买时尚女装应该前往第几层？ (Menurut panduan lantai mall, jika ingin berbelanja pakaian wanita harus ke lantai berapa?)",
                    options = listOf("负一层（B1） (Lantai basement B1)", "三楼 (Lantai 3)", "五楼 (Lantai 5)", "六楼 (Lantai 6)"),
                    correctAnswerIndex = 1,
                    explanation = "Teks merinci: '三楼是女装... 女装在三楼，我们去三楼吧！'."
                ),
                StoryQuestion(
                    id = "q_malflr_2",
                    questionText = "商场的高档电影院以及各类特色美食餐厅集中布局在商场的哪个楼层？ (Bioskop dan deretan restoran makanan berkumpul di lantai berapa?)",
                    options = listOf("一楼 (Lantai 1)", "四楼 (Lantai 4)", "六楼 (Lantai 6)", "二楼 (Lantai 2)"),
                    correctAnswerIndex = 2,
                    explanation = "Teks menyatakan: '六楼是电影院和餐厅'."
                ),
                StoryQuestion(
                    id = "q_malflr_3",
                    questionText = "这座大型购物中心夜间正式打烊关门的标准营业时间是几点？ (Pukul berapakah mall megah tersebut resmi tutup toko di malam hari?)",
                    options = listOf("晚上8点半 (Pukul 20:30)", "晚上10点半（22:30） (Pukul 22:30 malam)", "午夜12点 (Tengah malam)", "傍晚6点 (Pukul 18:00)"),
                    correctAnswerIndex = 1,
                    explanation = "Xiaomi menjelaskan: '现在才三点，商场十点半关门，我们可以慢慢逛'."
                )
            )
        ),

        // Cerita Mandarin Bean 241 (HSK 3): Going to the mall for shopping? (Pusat Perbelanjaan atau Pasar Grosir?)
        Story(
            id = "story_mall_shopping",
            titleHanzi = "商场还是批发市场？",
            titlePinyin = "Shāngchǎng Háishi Pīfā Shìchǎng?",
            titleTranslation = "Mall or Wholesale Market? (Pilihan Cermat Tempat Belanja)",
            level = "HSK 3",
            category = "Belanja & Kualitas Hidup",
            description = "Ling Mei dan Wu Xiaomi membandingkan opsi belanja busana musim gugur: pasar grosir yang murah meriah vs pusat perbelanjaan bergaransi kualitas, diskon pergantian musim, dan fasilitas lengkap.",
            coverEmoji = "👗",
            coverImageRes = R.drawable.cover_story_mall_shopping,
            estimatedReadMinutes = 2,
            sentences = listOf(
                Sentence(
                    id = "s_mlsppg_1",
                    hanzi = "入秋换季之际铃美想添置秋装，小咪询问她是倾向于去品牌专柜商场还是更乐意去服装批发市场淘货。",
                    pinyin = "rù qiū huàn jì zhī jì Líng měi xiǎng tiān zhì qiū zhuāng Xiǎo mī xún wèn tā shì qīng xiàng yú qù pǐn pái zhuān guì shāng chǎng hái shi gèng lè yì qù fú zhuāng pī fā shì chǎng táo huò",
                    translation = "Saat pergantian menuju musim gugur Ling Mei ingin membeli busana hangat, Xiaomi menanyakan apakah ia lebih suka pergi ke pusat perbelanjaan bermerek atau ke pasar grosir pakaian.",
                    tokens = listOf(
                        WordToken("秋天", "qiū tiān", "autumn", "Kosakata HSK 3: 秋天 (qiū tiān)"),
                        WordToken("正好", "zhèng hǎo", "just in time / happen to", "Kosakata HSK 3: 正好 (zhèng hǎo)"),
                        WordToken("市场", "shì chǎng", "market", "Kosakata HSK 3: 市场 (shì chǎng)")
                    )
                ),
                Sentence(
                    id = "s_mlsppg_2",
                    hanzi = "小咪客观指点：服装批发市场虽价格极为低廉新潮，但做工面料品质参差不齐；商场专柜虽略显昂贵但质量信誉极具保障。",
                    pinyin = "Xiǎo mī kè guān zhǐ diǎn fú zhuāng pī fā shì chǎng suī jià gé jí wéi dī lián xīn cháo dàn zuò gōng miàn liào pǐn zhì cān cī bù qí shāng chǎng zhuān guì suī lüè xiǎn áng guì dàn zhì liàng xìn yù jí jù bǎo zhàng",
                    translation = "Xiaomi memberi masukan obyektif: pakaian di pasar grosir memang sangat murah dan modelnya modis, namun kualitas jahitan dan kainnya kurang terjamin; sebaliknya di mall walau sedikit lebih mahal kualitasnya bergaransi prima.",
                    tokens = listOf(
                        WordToken("批发", "pī fā", "wholesale", "Kosakata HSK 3: 批发 (pī fā)"),
                        WordToken("质量", "zhì liàng", "quality", "Kosakata HSK 3: 质量 (zhì liàng)"),
                        WordToken("保证", "bǎo zhèng", "guarantee / assurance", "Kosakata HSK 3: 保证 (bǎo zhèng)")
                    )
                ),
                Sentence(
                    id = "s_mlsppg_3",
                    hanzi = "恰逢换季时节商场不仅款式繁多且常有诱人折扣，两人欣然选定驱车前往新落成的大商场，顺道畅享美馔晚餐。",
                    pinyin = "qià féng huàn jì shí jié shāng chǎng bù jǐn kuǎn shì fán duō qiě cháng yǒu yòu rén zhé kòu liǎng rén xīn rán xuǎn dìng qū chē qián wǎng xīn luò chéng de dà shāng chǎng shùn dào chàng xiǎng měi zhuàn wǎn cān",
                    translation = "Bertepatan dengan pergantian musim mall tidak hanya menghadirkan banyak model baru melainkan juga sering ada diskon potongan harga; keduanya dengan senang hati memutuskan menyetir mobil ke mall besar baru dan sekalian santap malam bersama.",
                    tokens = listOf(
                        WordToken("款式", "kuǎn shì", "style / pattern", "Kosakata HSK 3: 款式 (kuǎn shì)"),
                        WordToken("打折", "dǎ zhé", "to give a discount", "Kosakata HSK 3: 打折 (dǎ zhé)"),
                        WordToken("顺便", "shùn biàn", "conveniently", "Kosakata HSK 3: 顺便 (shùn biàn)")
                    )
                )
            ),
            questions = listOf(
                StoryQuestion(
                    id = "q_mlsppg_1",
                    questionText = "根据小咪的生活经验，服装批发市场和品牌大商场相比各自最大的利弊是什么？ (Menurut pengalaman Xiaomi, apa perbandingan utama pasar grosir vs mall besar?)",
                    options = listOf("商场的衣服没有颜色分类 (Baju mall tidak ada warna)", "批发市场胜在价格低廉，但做工质量缺乏保障；商场价格虽稍贵但品质可靠 (Pasar grosir murah tapi mutu kurang terjamin; mall sedikit mahal tapi kualitas terjamin)", "批发市场只卖童装 (Pasar grosir cuma jual baju anak)", "商场从不接待学生 (Mall menolak pelajar)"),
                    correctAnswerIndex = 1,
                    explanation = "Teks menyatakan: '服装市场的衣服便宜是便宜，但是质量不太好... 商场贵是贵了点儿，但是质量有保证'."
                ),
                StoryQuestion(
                    id = "q_mlsppg_2",
                    questionText = "在季节交替更换时节，大型品牌百货商场通常会推出什么让利顾客的促销举措？ (Saat pergantian musim, promo apa yang biasanya ditawarkan pusat perbelanjaan?)",
                    options = listOf("全场双倍加价 (Harga naik dobel)", "大量上架时尚新颖款式，且往往伴有可观的换季打折优惠 (Banyak model baju baru dan sering ada diskon menarik)", "闭店整修半个月 (Tutup renovasi)", "强制会员制入场 (Wajib kartu member berbayar)"),
                    correctAnswerIndex = 1,
                    explanation = "Teks mencatat: '换季的时候，商场有很多新款式，有时候也会打折'."
                ),
                StoryQuestion(
                    id = "q_mlsppg_3",
                    questionText = "为了便于晚上逛街并安全返程，吴小咪做出了怎样的贴心出行安排？ (Pengaturan transportasi nyaman apa yang disiapkan Xiaomi untuk malam itu?)",
                    options = listOf("让铃美步行走回家 (Menyuruh Ling Mei jalan kaki)", "自己今天正是开车过来的，晚上逛完可以直接开车送铃美回家 (Ia hari ini membawa mobil, malam seusai belanja bisa langsung mengantar Ling Mei pulang)", "两人挤最后一班夜间公交 (Berdesakan naik bus malam terakhir)", "租两辆电动自行车 (Menyewa 2 sepeda listrik)"),
                    correctAnswerIndex = 1,
                    explanation = "Xiaomi mengatakan: '没问题，今天我是开车来的，晚上送你回家'."
                )
            )
        ),

        // Cerita Mandarin Bean 242 (HSK 3): Order takeout (Memesan Makanan Online)
        Story(
            id = "story_order_takeout",
            titleHanzi = "点外卖：美团与饿了么",
            titlePinyin = "Diǎn Wàimài: Měituán yǔ Èlema",
            titleTranslation = "Order Takeout (Memesan Makanan Lewat Aplikasi Daring)",
            level = "HSK 3",
            category = "Gaya Hidup & Aplikasi Daring",
            description = "Seusai lelah pindahan rumah, Su Nan dan Da Long memesan makanan via aplikasi Ele.me dan Meituan: klaim angpao diskon, koreksi alamat antar, catatan tanpa bawang, dan level kepedasan.",
            coverEmoji = "🛵",
            coverImageRes = R.drawable.cover_story_order_takeout,
            estimatedReadMinutes = 2,
            sentences = listOf(
                Sentence(
                    id = "s_ordtkt_1",
                    hanzi = "协助搬家后两人又累又饿，大龙打开常有红包优惠的“饿了么”软件，为苏南挑选马路对面好评如潮的面食分店。",
                    pinyin = "xié zhù bān jiā hòu liǎng rén yòu lèi yòu è Dà lóng dǎ kāi cháng yǒu hóng bāo yōu huì de È le me ruǎn jiàn wèi Sū nán tiāo xuǎn mǎ lù duì miàn hǎo píng rú cháo de miàn shí fēn diàn",
                    translation = "Seusai lelah beres-beres pindahan rumah keduanya lapar dan letih; Da Long membuka aplikasi 'Ele.me' yang memiliki banyak kupon angpao diskon untuk memesan mi lezat dari cabang seberang jalan.",
                    tokens = listOf(
                        WordToken("搬家", "bān jiā", "to move house", "Kosakata HSK 3: 搬家 (bān jiā)"),
                        WordToken("外卖", "wài mài", "takeout / delivery food", "Kosakata HSK 3: 外卖 (wài mài)"),
                        WordToken("红包", "hóng bāo", "red envelope / discount coupon", "Istilah e-commerce"),
                        WordToken("分店", "fēn diàn", "branch store", "Kosakata HSK 3: 分店 (fēn diàn)")
                    )
                ),
                Sentence(
                    id = "s_ordtkt_2",
                    hanzi = "初次下单系统提示超出配送范围，苏南猛然提醒原是大龙未把旧住址切换为新居地址，更正后显示二十分钟内免配送费极速送达。",
                    pinyin = "chū cì xià dān xì tǒng tí shì chāo chū pèi sòng fàn wéi Sū nán měng rán tí xǐng yuán shì Dà lóng wèi bǎ jiù zhù zhǐ qiē huàn wèi xīn jū dì zhǐ gēng zhèng hòu xiǎn shì èr shí fēn zhōng nèi miǎn pèi sòng fèi jí sù sòng dá",
                    translation = "Saat pertama kali memesan sistem memperingatkan alamat berada di luar jangkauan pengantaran; Su Nan segera mengingatkan bahwa Da Long belum mengganti alamat ke rumah barunya, setelah diganti pesanan terkonfirmasi tiba dalam 20 menit bebas ongkos kirim.",
                    tokens = listOf(
                        WordToken("地址", "dì zhǐ", "address", "Kosakata HSK 2: 地址 (dì zhǐ)"),
                        WordToken("难怪", "nán guài", "no wonder", "Tata bahasa HSK 3: 难怪 (nán guài)"),
                        WordToken("配送费", "pèi sòng fèi", "delivery fee", "Istilah pesan antar: 配送费")
                    )
                ),
                Sentence(
                    id = "s_ordtkt_3",
                    hanzi = "大龙贴心地在订单特别备注“免葱免蒜”，口味依据苏南要求选定微辣，顺利完成下单并顺便分享了私藏的美食餐厅清单。",
                    pinyin = "Dà lóng tiē xīn de zài dìng dān tè bié bèi zhù miǎn cōng miǎn suàn kǒu wèi yī jù Sū nán yāo qiú xuǎn dìng wēi là shùn lì wán chéng xià dān bìng shùn biàn fēn xiǎng le sī cáng de měi shí cān tīng qīng dān",
                    translation = "Da Long dengan penuh perhatian menambahkan catatan khusus pada pesanan: 'tanpa daun bawang dan tanpa bawang putih', dengan tingkat kepedasan pedas tipis (wēi là) sesuai selera Su Nan, lalu sukses menyelesaikan pesanan seraya membagikan daftar restoran favoritnya.",
                    tokens = listOf(
                        WordToken("备注", "bèi zhù", "remark / note", "Kosakata HSK 3: 备注 (bèi zhù)"),
                        WordToken("蒜", "suàn", "garlic", "Kosakata HSK 3: 蒜 (suàn)"),
                        WordToken("微辣", "wēi là", "mildly spicy", "Istilah level pedas: 微辣"),
                        WordToken("下单", "xià dān", "to place an order", "Kosakata HSK 3: 下单 (xià dān)")
                    )
                )
            ),
            questions = listOf(
                StoryQuestion(
                    id = "q_ordtkt_1",
                    questionText = "大龙在刚开始提交外卖订单时，APP为何弹出“无法配送”的异常提示？ (Mengapa aplikasi pesan antar awalnya menampilkan peringatan 'tidak bisa diantar'?)",
                    options = listOf("餐馆因下大雨停止营业 (Restoran tutup karena hujan)", "送餐地址仍默认留在遥远的旧家，尚未切换成苏南刚搬进来的新地址 (Alamat kirim masih memakai alamat rumah lamanya yang jauh dan belum diganti ke rumah baru Su Nan)", "大龙银行卡没有余额 (Saldo rekening kosong)", "配送骑手全部罢工 (Kurir mogok kerja)"),
                    correctAnswerIndex = 1,
                    explanation = "Su Nan mengecek: '因为你没有换地址，这个分店送不到你家那儿，你把地址换成我家的'."
                ),
                StoryQuestion(
                    id = "q_ordtkt_2",
                    questionText = "根据苏南个人的饮食偏好禁忌，大龙在订单备注栏特意注明了什么要求？ (Catatan khusus apa yang dicantumkan Da Long terkait pantangan makanan Su Nan?)",
                    options = listOf("多放辣椒油 (Banyakin minyak cabai)", "不要放葱，也不要放蒜 (Jangan pakai daun bawang dan jangan pakai bawang putih)", "只要半份面条 (Hanya setengah porsi mi)", "必须加双份香菜 (Wajib dobel daun ketumbar)"),
                    correctAnswerIndex = 1,
                    explanation = "Teks menyatakan: '我记得你不爱吃，所以写了不要葱也不要蒜'."
                ),
                StoryQuestion(
                    id = "q_ordtkt_3",
                    questionText = "在APP提供的多样化辣度选项中，苏南最终挑选了哪种辣度级别？ (Tingkat kepedasan apa yang dipilih oleh Su Nan di aplikasi?)",
                    options = listOf("特辣（超级重辣） (Sangat pedas / extra spicy)", "微辣（轻微辣度） (Pedas tipis / mild spicy)", "完全不辣 (Sama sekali tidak pedas)", "中辣 (Sedang)"),
                    correctAnswerIndex = 1,
                    explanation = "Su Nan meminta: '我要微辣' (Saya minta yang pedas tipis saja)."
                )
            )
        ),

        // Cerita Mandarin Bean 243 (HSK 3): What do you want to eat? (Etika Membayar Tagihan Makanan)
        Story(
            id = "story_pay_the_bill",
            titleHanzi = "结账买单：AA制还是请客？",
            titlePinyin = "Jiézhàng Mǎidān: AA Zhì Háishi Qǐngkè?",
            titleTranslation = "Paying the Bill (Etika Bayar Makan: AA atau Mentraktir?)",
            level = "HSK 3",
            category = "Sosial & Budaya Makan",
            description = "Etika bersantap bersama di restoran Tiongkok: perdebatan ramah antara sistem patungan 'AA制' versus mentraktir kawan, serta kemudahan transaksi nirsentuh via Alipay / QR code.",
            coverEmoji = "💳",
            coverImageRes = R.drawable.cover_story_pay_the_bill,
            estimatedReadMinutes = 2,
            sentences = listOf(
                Sentence(
                    id = "s_paybil_1",
                    hanzi = "聚餐渐入尾声大家酒足饭饱，小咪提议按照年轻人流行的“AA制”平摊餐费结账。",
                    pinyin = "jù cān jiàn rù wěi shēng dà jiā jiǔ zú fàn bǎo Xiǎo mī tí yì àn zhào nián qīng rén liú xíng de AA zhì píng tān cān fèi jié zhàng",
                    translation = "Santap malam bersama pun usai dan semua orang merasa kenyang dan puas; Xiaomi mengusulkan agar mereka membagi rata biaya makan sesuai sistem patungan 'AA制' yang populer di kalangan muda.",
                    tokens = listOf(
                        WordToken("饱", "bǎo", "full / satisfied (after eating)", "Kosakata HSK 3: 饱 (bǎo)"),
                        WordToken("结账", "jié zhàng", "to pay the bill / check", "Kosakata HSK 3: 结账 (jié zhàng)"),
                        WordToken("AA制", "AA zhì", "go Dutch / split bill", "Istilah sosial modern"),
                        WordToken("客气", "kè qi", "polite / courteous", "Kosakata HSK 1: 客气 (kè qi)")
                    )
                ),
                Sentence(
                    id = "s_paybil_2",
                    hanzi = "大龙坚守提前许下的请客承诺不让大家客气，苏南和小咪欣然感谢，并相约下次一定要回请或去家里尝尝小咪的私房厨艺。",
                    pinyin = "Dà lóng jiān shǒu tí qián xǔ xià de qǐng kè chéng nuò bù ràng dà jiā kè qi Sū nán hé Xiǎo mī xīn rán gǎn xiè bìng xiāng yuē xià cì yī dìng yào huí qǐng huò qù jiā lǐ cháng chang Xiǎo mī de sī fáng chú yì",
                    translation = "Da Long berpegang teguh pada janjinya semula untuk mentraktir semua teman dan meminta mereka jangan sungkan; Su Nan dan Xiaomi mengucapkan terima kasih dan berjanji lain kali gantian mentraktir atau makan di rumah mencicipi masakan Xiaomi.",
                    tokens = listOf(
                        WordToken("请客", "qǐng kè", "to treat (pay for meal)", "Kosakata HSK 3: 请客 (qǐng kè)"),
                        WordToken("做菜", "zuò cài", "to cook", "Kosakata HSK 2: 做菜 (zuò cài)"),
                        WordToken("尝尝", "cháng chang", "to taste / try food", "Kosakata HSK 3: 尝 (cháng)")
                    )
                ),
                Sentence(
                    id = "s_paybil_3",
                    hanzi = "面对服务员出示的移动支付、信用卡和现金等结账方式，大龙掏出手机从容扫码支付宝完成快速买单。",
                    pinyin = "miàn duì fú wù yuán chū shì de yí dòng zhī fù xìn yòng kǎ hé xiàn jīn děng jié zhàng fāng shì Dà lóng tāo chū shǒu jī cóng róng sǎo mǎ Zhī fù bǎo wán chéng kuài sù mǎi dān",
                    translation = "Menghadapi berbagai opsi pembayaran yang ditawarkan pramusaji mulai dari dompet digital, kartu kredit, hingga uang tunai, Da Long mengeluarkan ponselnya memindai kode QR Alipay dan menyelesaikan pembayaran dalam sekejap.",
                    tokens = listOf(
                        WordToken("支付宝", "Zhī fù bǎo", "Alipay digital payment", "Metode pembayaran digital"),
                        WordToken("现金", "xiàn jīn", "cash", "Kosakata HSK 3: 现金 (xiàn jīn)"),
                        WordToken("信用卡", "xìn yòng kǎ", "credit card", "Kosakata HSK 3: 信用卡 (xìn yòng kǎ)"),
                        WordToken("扫码", "sǎo mǎ", "to scan QR code", "Kosakata HSK 3: 扫码 (sǎo mǎ)")
                    )
                )
            ),
            questions = listOf(
                StoryQuestion(
                    id = "q_paybil_1",
                    questionText = "吴小咪最初提出的“AA”或“AA制”聚餐买单方式是指什么？ (Apa maksud dari sistem bayar makan 'AA' atau 'AA制' yang diusulkan Xiaomi?)",
                    options = listOf("全由年纪最小的人请客 (Yang termuda yang mentraktir)", "就餐人员各自分摊、各付各的餐费（平摊账单） (Masing-masing orang membagi rata dan membayar porsi makanannya sendiri / go Dutch)", "完全逃单不付钱 (Kabur tanpa bayar)", "记在老板的账上 (Utang ke pemilik resto)"),
                    correctAnswerIndex = 1,
                    explanation = "'AA制' (AA zhì) adalah istilah populer di Tiongkok untuk sistem pembayaran patungan di mana setiap orang membagi rata tagihan."
                ),
                StoryQuestion(
                    id = "q_paybil_2",
                    questionText = "大龙为什么坚决拒绝了AA制提议并执意由自己独立买单？ (Mengapa Da Long bersikeras menolak patungan dan membayar sendiri tagihan makan malam itu?)",
                    options = listOf("他在饭菜里吃到了异物 (Menemukan kotoran di makanan)", "之前早已事先说好了由自己请客，不愿朋友们见外客气 (Karena sejak awal sudah berjanji hendak mentraktir semua teman)", "他急于炫耀自己的财富 (Ingin pamer)", "餐馆是他的亲戚开的 (Restoran milik kerabatnya)"),
                    correctAnswerIndex = 1,
                    explanation = "Da Long berseru: '说好我请客的，别跟我客气。服务员，结账！'."
                ),
                StoryQuestion(
                    id = "q_paybil_3",
                    questionText = "在服务员提供的多样化结算渠道中，大龙最终使用了哪种中国极为普遍的移动支付工具？ (Metode pembayaran digital apa yang akhirnya dipakai Da Long untuk membayar tagihan?)",
                    options = listOf("支票 (Bilyet giro)", "支付宝扫码支付 (Pindai kode QR via aplikasi Alipay)", "大额纸币现金 (Uang kertas tunai)", "外币转账 (Transfer valas)"),
                    correctAnswerIndex = 1,
                    explanation = "Teks menyatakan: '服务员：您好，您是支付宝还是微信？现金或者信用卡也可以。大龙：支付宝吧，谢谢。服务员：好的，您扫一下这个二维码就行'."
                )
            )
        )
    )
}
