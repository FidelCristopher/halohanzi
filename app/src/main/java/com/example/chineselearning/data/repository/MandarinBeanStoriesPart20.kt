package com.example.chineselearning.data.repository

import com.example.chineselearning.R
import com.example.chineselearning.data.model.Sentence
import com.example.chineselearning.data.model.Story
import com.example.chineselearning.data.model.StoryQuestion
import com.example.chineselearning.data.model.WordToken

val mandarinBeanStoriesPart20: List<Story> by lazy {
    listOf(
        // Cerita Mandarin Bean 214 (HSK 3): Congratulations (Kegembiraan Ganda: Selamat!)
        Story(
            id = "story_congratulations",
            titleHanzi = "双喜临门",
            titlePinyin = "Shuāng Xǐ Lín Mén",
            titleTranslation = "Congratulations (Kegembiraan Ganda: Selamat!)",
            level = "HSK 3",
            category = "Kehidupan Kampus & Karier",
            description = "Su Nan merayakan kebahagiaan ganda: bertepatan dengan hari ulang tahunnya, ia dinyatakan lolos wawancara kerja magang di bidang media baru yang diimpikannya.",
            coverEmoji = "🎉",
            coverImageRes = R.drawable.cover_story_congratulations,
            estimatedReadMinutes = 2,
            sentences = listOf(
                Sentence(
                    id = "s_cong_1",
                    hanzi = "苏南问铃美：“你去哪儿啊？”铃美说：“我正打算去找你呢！今晚一起去吃饭吧，我们给你庆祝庆祝。”",
                    pinyin = "Sū nán wèn Líng měi nǐ qù nǎr a Líng měi shuō wǒ zhèng dǎ suàn qù zhǎo nǐ ne jīn wǎn yī qǐ qù chī fàn ba wǒ men gěi nǐ qìng zhù qìng zhù",
                    translation = "Su Nan bertanya pada Ling Mei: 'Kamu mau ke mana?' Ling Mei menjawab: 'Aku justru baru mau mencarimu! Nanti malam mari makan bersama, kami ingin merayakannya untukmu.'",
                    tokens = listOf(
                        WordToken("打算", "dǎ suàn", "to plan / intend", "Kosakata HSK 3: 打算 (dǎ suàn)"),
                        WordToken("庆祝", "qìng zhù", "to celebrate", "Kosakata HSK 3: 庆祝 (qìng zhù)"),
                        WordToken("礼物", "lǐ wù", "gift / present", "Kosakata HSK 2: 礼物 (lǐ wù)")
                    )
                ),
                Sentence(
                    id = "s_cong_2",
                    hanzi = "铃美拿出礼物：“祝你生日快乐，天天开心！”苏南惊讶地说：“啊？今天是我生日... 你不说我都忘了，谢谢你！”",
                    pinyin = "Líng měi ná chū lǐ wù zhù nǐ shēng rì kuài lè tiān tiān kāi xīn Sū nán jīng yà de shuō a jīn tiān shì wǒ de shēng rì nǐ bù shuō wǒ dōu wàng le xiè xie nǐ",
                    translation = "Ling Mei mengeluarkan kado: 'Selamat ulang tahun untukmu, semoga selalu gembira setiap hari!' Su Nan heran berucap: 'Hah? Hari ini ulang tahunku ya... Kalau kamu tidak bilang, aku sendiri sampai lupa, terima kasih banyak!'",
                    tokens = listOf(
                        WordToken("拿出", "ná chū", "to take out", "Kosakata HSK 3: 拿 (ná)"),
                        WordToken("忘", "wàng", "to forget", "Kosakata HSK 3: 忘 (wàng)"),
                        WordToken("惊讶", "jīng yà", "surprised", "Kosakata HSK 3: 惊讶 (jīng yà)")
                    )
                ),
                Sentence(
                    id = "s_cong_3",
                    hanzi = "铃美笑着问：“原来你今天那么高兴不是因为过生日啊，那是为什么？”苏南高兴地说：“我通过应聘面试了，下个星期开始去公司实习，做新媒体实习生。”",
                    pinyin = "Líng měi xiào zhe wèn yuán lái nǐ jīn tiān nà me gāo xìng bù shì yīn wèi guò shēng rì a nà shì wèi shén me Sū nán gāo xìng de shuō wǒ tōng guò yìng pìn miàn shì le xià gè xīng qī kāi shǐ qù gōng sī shí xí zuò xīn méi tǐ shí xí shēng",
                    translation = "Ling Mei tersenyum bertanya: 'Ternyata rasa gembiramu hari ini bukan karena ulang tahun ya, lalu ada apa gerangan?' Su Nan menjawab riang: 'Aku berhasil lolos wawancara lamaran kerja! Mulai minggu depan aku mulai magang di perusahaan sebagai intern media baru.'",
                    tokens = listOf(
                        WordToken("原来", "yuán lái", "originally / as it turns out", "Kosakata HSK 3: 原来 (yuán lái)"),
                        WordToken("通过", "tōng guò", "to pass (exam/interview)", "Kosakata HSK 3: 通过 (tōng guò)"),
                        WordToken("面试", "miàn shì", "interview", "Kosakata HSK 3: 面试 (miàn shì)"),
                        WordToken("实习", "shí xí", "internship", "Kosakata HSK 3: 实习 (shí xí)")
                    )
                ),
                Sentence(
                    id = "s_cong_4",
                    hanzi = "铃美说：“那今天真是双喜临门！王老师今天还订了自助餐给你庆祝呢。”苏南说：“太好了，今天我请客！”",
                    pinyin = "Líng měi shuō nà jīn tiān zhēn shì shuāng xǐ lín mén Wáng lǎo shī jīn tiān hái dìng le zì zhù cān gěi nǐ qìng zhù ne Sū nán shuō tài hǎo le jīn tiān wǒ qǐng kè",
                    translation = "Ling Mei berkata: 'Kalau begitu hari ini benar-benar kegembiraan ganda (shuāng xǐ lín mén)! Guru Wang hari ini bahkan sudah memesankan prasmanan (buffet) untuk merayakannya bersamamu.' Su Nan berseru: 'Bagus sekali, hari ini biar aku yang traktir!'",
                    tokens = listOf(
                        WordToken("双喜临门", "shuāng xǐ lín mén", "two good things happen at same time", "Peribahasa HSK 3: 双喜临门"),
                        WordToken("自助餐", "zì zhù cān", "buffet meal", "Kosakata HSK 3: 自助餐 (zì zhù cān)"),
                        WordToken("请客", "qǐng kè", "to treat / pay for others", "Kosakata HSK 3: 请客 (qǐng kè)")
                    )
                )
            ),
            questions = listOf(
                StoryQuestion(
                    id = "q_cong_1",
                    questionText = "成语“双喜临门”在故事中具体指的是苏南迎来了哪两件喜事？ (Apa dua kabar gembira ganda yang dialami oleh Su Nan dalam cerita?)",
                    options = listOf("买彩票中大奖和乔迁新居 (Menang undian dan pindah rumah)", "正好迎来自己的生日，并且成功通过了心仪公司的求职面试 (Hari ulang tahunnya tiba, dan ia lolos wawancara kerja magang)", "考试得满分和获得奖学金 (Dapat nilai sempurna dan beasiswa)", "在运动会拿到冠军并结交外国女友 (Juara lomba lari dan dapat pacar baru)"),
                    correctAnswerIndex = 1,
                    explanation = "Teks menyatakan: bertepatan dengan ulang tahunnya ('今天是我生日'), Su Nan juga berhasil lulus wawancara kerja magang ('我通过应聘面试了')."
                ),
                StoryQuestion(
                    id = "q_cong_2",
                    questionText = "苏南即将前往实习的公司岗位属于哪个领域？ (Posisi magang apa yang akan dijalani oleh Su Nan minggu depan?)",
                    options = listOf("新媒体实习生 (Intern / pemagang media baru)", "外语翻译 (Penerjemah bahasa asing)", "银行柜员 (Teller bank)", "厨师学徒 (Koki magang)"),
                    correctAnswerIndex = 0,
                    explanation = "Teks menyebutkan: '做新媒体实习生。我一直都对这方面挺感兴趣的'."
                ),
                StoryQuestion(
                    id = "q_cong_3",
                    questionText = "得知王老师订了自助餐后，心情大好的苏南做出了什么豪爽决定？ (Keputusan bermurah hati apa yang diambil Su Nan setelah mendengar perayaan tersebut?)",
                    options = listOf("拒绝参加聚餐 (Menolak datang makan)", "今天全部由自己主动请客买单 (Hari ini memutuskan mentraktir semua teman)", "要求打包带回家 (Minta dibungkus bawa pulang)", "邀请全校同学都来吃 (Mengundang seluruh siswa sekolah)"),
                    correctAnswerIndex = 1,
                    explanation = "Su Nan berseru dengan antusias: '好，我要去告诉大家我通过面试了。今天我请客！'."
                )
            )
        ),

        // Cerita Mandarin Bean 215 (HSK 3): Happy Birthday (Selamat Ulang Tahun Guru Wang)
        Story(
            id = "story_happy_birthday",
            titleHanzi = "祝王老师生日快乐",
            titlePinyin = "Zhù Wáng Lǎoshī Shēngrì Kuàilè",
            titleTranslation = "Happy Birthday to Teacher Wang (Selamat Ulang Tahun Guru Wang)",
            level = "HSK 3",
            category = "Pendidikan & Kasih Sayang",
            description = "Para murid berkumpul merayakan ulang tahun Guru Wang secara kejutan: mempersembahkan bunga, teko teh, kue buatan sendiri, serta doa tradisi penuh berkah.",
            coverEmoji = "🎂",
            coverImageRes = R.drawable.cover_story_happy_birthday,
            estimatedReadMinutes = 2,
            sentences = listOf(
                Sentence(
                    id = "s_hpbth_1",
                    hanzi = "苏南把一束鲜花送给老师：“祝您生日快乐，天天开心！”铃美送上一个精美的茶壶：“王老师，我知道您喜欢喝茶，祝您身体健康！”",
                    pinyin = "Sū nán bǎ yī shù xiān huā sòng gěi lǎo shī zhù nín shēng rì kuài lè tiān tiān kāi xīn Líng měi sòng shàng yī gè jīng měi de chá hú Wáng lǎo shī wǒ zhī dào nín xǐ huan hē chá zhù nín shēn tǐ jiàn kāng",
                    translation = "Su Nan menyerahkan seikat bunga segar kepada gurunya: 'Semoga Guru selamat ulang tahun dan selalu gembira!' Ling Mei mempersembahkan teko teh keramik yang indah: 'Guru Wang, saya tahu Anda gemar minum teh, semoga Anda sehat selalu!'",
                    tokens = listOf(
                        WordToken("鲜花", "xiān huā", "fresh flower", "Kosakata HSK 2: 花 (huā)"),
                        WordToken("茶壶", "chá hú", "teapot", "Kosakata HSK 3: 茶壶 (chá hú)"),
                        WordToken("健康", "jiàn kāng", "healthy", "Kosakata HSK 3: 健康 (jiàn kāng)")
                    )
                ),
                Sentence(
                    id = "s_hpbth_2",
                    hanzi = "吴小咪和小宇捧出生日蛋糕：“祝您福如东海，寿比南山！”王老师感动地说：“你们不说，我都忘了今天是我的生日。谢谢大家！”",
                    pinyin = "Wú Xiǎo mī hé Xiǎo yǔ pěng chū shēng rì dàn gāo zhù nín fú rú Dōng Hǎi shòu bǐ Nán Shān Wáng lǎo shī gǎn dòng de shuō nǐ men bù shuō wǒ dōu wàng le jīn tiān shì wǒ de shēng rì xiè xie dà jiā",
                    translation = "Wu Xiaomi dan Xiaoyu membawa kue ulang tahun buatan sendiri: 'Semoga rezeki Anda seluas Laut Timur dan panjang umur setinggi Gunung Selatan!' Guru Wang terharu berucap: 'Kalian kalau tidak mengucapkannya, saya sendiri sampai lupa hari ini hari ulang tahun saya. Terima kasih semuanya!'",
                    tokens = listOf(
                        WordToken("蛋糕", "dàn gāo", "cake", "Kosakata HSK 3: 蛋糕 (dàn gāo)"),
                        WordToken("福如东海", "fú rú Dōng Hǎi", "fortune as vast as Eastern Sea", "Doa berkat tradisional"),
                        WordToken("寿比南山", "shòu bǐ Nán Shān", "longevity as high as Southern Mountain", "Doa panjang umur"),
                        WordToken("感动", "gǎn dòng", "moved / touched", "Kosakata HSK 3: 感动 (gǎn dòng)")
                    )
                ),
                Sentence(
                    id = "s_hpbth_3",
                    hanzi = "大龙也送上新学的吉祥祝词：“年年有今日，岁岁有今朝！”大家决定今晚一起去吃热气腾腾的火锅为老师庆生。",
                    pinyin = "Dà lóng yě sòng shàng xīn xué de jí xiáng zhù cí nián nián yǒu jīn rì suì suì yǒu jīn zhāo dà jiā jué dìng jīn wǎn yī qǐ qù chī rè qì téng téng de huǒ guō wèi lǎo shī qìng shēng",
                    translation = "Da Long tak ketinggalan menyampaikan ungkapan selamat yang baru dipelajarinya: 'Semoga hari bahagia ini terulang kembali setiap tahun dan setiap masa!' Mereka semua pun sepakat malam ini pergi makan hotpot hangat bersama untuk merayakan ulang tahun sang guru.",
                    tokens = listOf(
                        WordToken("祝福", "zhù fú", "blessing / wish", "Kosakata HSK 3: 祝福 (zhù fú)"),
                        WordToken("火锅", "huǒ guō", "hotpot", "Kosakata HSK 3: 火锅 (huǒ guō)"),
                        WordToken("庆祝", "qìng zhù", "to celebrate", "Kosakata HSK 3: 庆祝 (qìng zhù)")
                    )
                )
            ),
            questions = listOf(
                StoryQuestion(
                    id = "q_hpbth_1",
                    questionText = "铃美根据王老师平时爱喝茶的雅好，为老师精心挑选了什么生日礼物？ (Hadiah ulang tahun apa yang dipilihkan Ling Mei karena Guru Wang suka minum teh?)",
                    options = listOf("一本古诗词字帖 (Buku kaligrafi puisi)", "一个精美的茶壶 (Sebuah teko teh yang indah)", "一套咖啡机 (Mesin pembuat kopi)", "一副近视眼镜 (Sepasang kacamata minus)"),
                    correctAnswerIndex = 1,
                    explanation = "Teks menyatakan: '铃美：王老师，我知道您喜欢喝茶，这个茶壶送给您'."
                ),
                StoryQuestion(
                    id = "q_hpbth_2",
                    questionText = "成语“福如东海，寿比南山”在中国文化中主要用于表达哪类美好祝愿？ (Peribahasa 'fú rú Dōng Hǎi, shòu bǐ Nán Shān' dalam budaya Tiongkok digunakan untuk mendoakan apa?)",
                    options = listOf("庆祝乔迁新居 (Mendoakan pindahan rumah)", "为长辈祈祝福泽深厚、健康长寿 (Mendoakan keberkahan mendalam dan panjang umur bagi sesepuh/guru)", "祝福新婚夫妇百年好合 (Mendoakan pasangan pengantin baru)", "预祝高考金榜题名 (Mendoakan lulus ujian masuk kampus)"),
                    correctAnswerIndex = 1,
                    explanation = "Ungkapan ini adalah doa klasik tradisional Tionghoa untuk mendoakan rezeki berlimpah dan umur panjang bagi sosok yang dihormati."
                ),
                StoryQuestion(
                    id = "q_hpbth_3",
                    questionText = "庆生活动的最后，学生们提议今晚大家集体去享用哪种温馨美食？ (Kuliner hangat apa yang diusulkan para murid untuk dinikmati bersama malam ini?)",
                    options = listOf("西式快餐披萨 (Pizza cepat saji)", "热气腾腾的火锅 (Makan hidangan hotpot bersama)", "路边烧烤摊 (Sate bakar kaki lima)", "冷饮冰淇淋 (Es krim dingin)"),
                    correctAnswerIndex = 1,
                    explanation = "Da Long berseru: '今晚大家一起去吃火锅吧，我们给王老师庆祝生日！'."
                )
            )
        ),

        // Cerita Mandarin Bean 216 (HSK 3): The Ambulance is Coming (Ambulans Datang)
        Story(
            id = "story_the_ambulance_is_coming",
            titleHanzi = "救护车来了",
            titlePinyin = "Jiùhùchē Lái Le",
            titleTranslation = "The Ambulance is Coming (Ambulans Segera Tiba)",
            level = "HSK 3",
            category = "Keselamatan & Darurat Medis",
            description = "Percakapan penting situasi darurat lalu lintas saat Da Long tertabrak skuter listrik: pemeriksaan cedera, pertolongan pertama pendarahan, dan memanggil ambulans 120.",
            coverEmoji = "🚑",
            coverImageRes = R.drawable.cover_story_ambulance,
            estimatedReadMinutes = 2,
            sentences = listOf(
                Sentence(
                    id = "s_amblc_1",
                    hanzi = "大龙在街头被一辆电动车撞倒在地，后背剧痛，腿部流血无法站立，急切地向路过的好心人求助。",
                    pinyin = "Dà lóng zài jiē tóu bèi yī liàng diàn dòng chē zhuàng dǎo zài dì hòu bèi jù tòng tuǐ bù liú xuè wú fǎ zhàn lì jí qiè de xiàng lù guò de hǎo xīn rén qiú zhù",
                    translation = "Da Long ditabrak oleh sebuah skuter listrik di pinggir jalan hingga jatuh terhempas, punggungnya terasa amat sakit dan kakinya berdarah sehingga tak mampu bangkit berdiri, ia pun segera meminta pertolongan pada pejalan kaki yang melintas.",
                    tokens = listOf(
                        WordToken("电动车", "diàn dòng chē", "electric bicycle / scooter", "Kosakata HSK 3: 电动车"),
                        WordToken("撞", "zhuàng", "to collide / bump", "Kosakata HSK 3: 撞 (zhuàng)"),
                        WordToken("疼", "téng", "painful / sore", "Kosakata HSK 2: 疼 (téng)"),
                        WordToken("流血", "liú xuè", "to bleed", "Kosakata HSK 3: 流血 (liú xuè)")
                    )
                ),
                Sentence(
                    id = "s_amblc_2",
                    hanzi = "好心路人帮忙从包里取出手机联系同学，但得知同学赶来需要一个小时，情况紧急，立刻拨打120急救电话呼叫救护车。",
                    pinyin = "hǎo xīn lù rén bāng máng cóng bāo lǐ qǔ chū shǒu jī lián xì tóng xué dàn dé zhī tóng xué gǎn lái xū yào yī gè xiǎo shí qíng kuàng jǐn jí lì kè bō dǎ yāo èr líng jí jiù diàn huà hū jiào jiù hù chē",
                    translation = "Orang yang lewat itu berbaik hati membantunya mengambil ponsel dari tas untuk mengabari teman, namun mengetahui temannya butuh satu jam untuk tiba, ia segera menelpon nomor darurat 120 untuk memanggil ambulans.",
                    tokens = listOf(
                        WordToken("救护车", "jiù hù chē", "ambulance", "Kosakata HSK 3: 救护车 (jiù hù chē)"),
                        WordToken("难受", "nán shòu", "uncomfortable / in pain", "Kosakata HSK 3: 难受 (nán shòu)"),
                        WordToken("拨打", "bō dǎ", "to dial (phone)", "Kosakata HSK 3: 打 (dǎ)")
                    )
                ),
                Sentence(
                    id = "s_amblc_3",
                    hanzi = "大龙担心骨折不敢乱动，请路人协助按住伤口止血。救护车迅速赶到，路人答应留下来配合交警说明目击事故真相。",
                    pinyin = "Dà lóng dān xīn gǔ zhé bù gǎn luàn dòng qǐng lù rén xié zhù àn zhù shāng kǒu zhǐ xuè jiù hù chē xùn sù gǎn dào lù rén dā ying liú xià lái pèi hé jiāo jǐng shuō míng mù jī shì gù zhēn xiàng",
                    translation = "Da Long khawatir tulangnya retak sehingga tidak berani bergerak sembarangan, lalu memohon bantuan pejalan kaki untuk menekan luka guna menghentikan pendarahan. Tak lama kemudian ambulans tiba, dan sang penolong berjanji tetap di lokasi untuk menjelaskan kronologi kecelakaan kepada polisi.",
                    tokens = listOf(
                        WordToken("骨折", "gǔ zhé", "fracture / broken bone", "Istilah medis HSK 3: 骨折"),
                        WordToken("伤口", "shāng kǒu", "wound / cut", "Kosakata HSK 3: 伤口 (shāng kǒu)"),
                        WordToken("警察", "jǐng chá", "police officer", "Kosakata HSK 3: 警察 (jǐng chá)"),
                        WordToken("担心", "dān xīn", "to worry", "Kosakata HSK 3: 担心 (dān xīn)")
                    )
                )
            ),
            questions = listOf(
                StoryQuestion(
                    id = "q_amblc_1",
                    questionText = "在中国遇到突发伤病需要紧急呼叫医疗救护车时，正确的官方急救电话号码是多少？ (Berapakah nomor telepon darurat resmi untuk memanggil ambulans medis di Tiongkok?)",
                    options = listOf("110 (Nomor darurat kepolisian)", "120 (Nomor resmi ambulans medis darurat)", "119 (Nomor pemadam kebakaran)", "114 (Layanan informasi umum)"),
                    correctAnswerIndex = 1,
                    explanation = "Di Tiongkok daratan, 120 adalah nomor panggilan darurat medis ambulans, sedangkan 110 untuk polisi dan 119 untuk pemadam kebakaran."
                ),
                StoryQuestion(
                    id = "q_amblc_2",
                    questionText = "面对疑似骨折的情况，大龙做出了怎样正确的急救防护应对？ (Langkah penanganan cedera tepat apa yang diambil Da Long saat menduga tulangnya retak?)",
                    options = listOf("坚持立刻强行站立跑步 (Memaksakan diri segera berdiri dan lari)", "绝不随意盲目翻动起身，保持平卧等待专业医护救援并就地压迫止血 (Tidak sembarangan bergerak, berbaring tenang menunggu ambulans sambil menekan luka pendarahan)", "立刻喝大量烈酒止痛 (Minum arak untuk pereda nyeri)", "让路人猛烈拉扯受伤的双腿 (Menyuruh orang menarik kakinya kuat-kuat)"),
                    correctAnswerIndex = 1,
                    explanation = "Teks menyatakan: '我可能骨折了，还是等救护车来吧... 可以请你帮我按住伤口止血吗？'."
                ),
                StoryQuestion(
                    id = "q_amblc_3",
                    questionText = "好心路人在救护车接走大龙后，还承诺主动协助做哪件富有责任感的事？ (Tindakan bertanggung jawab apa yang dijanjikan orang baik tersebut setelah ambulans tiba?)",
                    options = listOf("帮大龙向学校请假 (Memintakan izin ke sekolah)", "留在现场向赶来的交警据实说明目击事故真相 (Tinggal di tempat untuk menjelaskan kejadian yang dilihatnya kepada polisi)", "替肇事电动车逃跑 (Membantu pelaku kabur)", "去商场帮大龙买新衣服 (Membelikan baju baru di mall)"),
                    correctAnswerIndex = 1,
                    explanation = "Orang baik itu berjanji: '好，你别担心，如果警察来了，我会跟警察说明看到的情况的'."
                )
            )
        ),

        // Cerita Mandarin Bean 217 (HSK 3): Be a Guest (Bertamu ke Rumah Guru)
        Story(
            id = "story_be_a_guest",
            titleHanzi = "去老师家做客",
            titlePinyin = "Qù Lǎoshī Jiā Zuòkè",
            titleTranslation = "Be a Guest (Bertamu ke Rumah Guru Wang)",
            level = "HSK 3",
            category = "Budaya & Etika",
            description = "Kisah hangat para mahasiswa bertamu ke kediaman Guru Wang, mengenal etika sopan santun bertamu, hingga pantangan budaya memotong buah pir (分梨 = 分离).",
            coverEmoji = "🍵",
            coverImageRes = R.drawable.cover_story_be_a_guest,
            estimatedReadMinutes = 3,
            sentences = listOf(
                Sentence(
                    id = "s_beagst_1",
                    hanzi = "铃美按老师指引乘坐地铁5号线到中山路，骑共享单车十分钟顺利抵达王老师家，并特意买来新鲜水果作为登门心意。",
                    pinyin = "Líng měi àn lǎo shī zhǐ yǐn chéng zuò dì tiě wǔ hào xiàn dào Zhōng shān lù qí gòng xiǎng dān chē shí fēn zhōng shùn lì dǐ dá Wáng lǎo shī jiā bìng tè yì mǎi lái xīn xiān shuǐ guǒ zuò wéi dēng mén xīn yì",
                    translation = "Ling Mei mengikuti petunjuk sang guru naik MRT Jalur 5 turun di Jalan Zhongshan, bersepeda sewaan selama 10 menit dan berhasil sampai di kediaman Guru Wang dengan lancar, seraya membawa buah-buahan segar sebagai buah tangan tanda hormat.",
                    tokens = listOf(
                        WordToken("共享单车", "gòng xiǎng dān chē", "shared bicycle", "Kosakata HSK 3: 共享单车"),
                        WordToken("新鲜", "xīn xiān", "fresh", "Kosakata HSK 3: 新鲜 (xīn xiān)"),
                        WordToken("水果", "shuǐ guǒ", "fruit", "Kosakata HSK 1: 水果 (shuǐ guǒ)"),
                        WordToken("心意", "xīn yì", "kind intention / regard", "Kosakata HSK 3: 心意 (xīn yì)")
                    )
                ),
                Sentence(
                    id = "s_beagst_2",
                    hanzi = "俗话说“说曹操曹操到”，苏南、吴小咪和弟弟吴小宇也在门外巧遇并一同上楼，苏南还特地为爱茶的王老师带了名优茶叶。",
                    pinyin = "sú huà shuō shuō Cáo cāo Cáo cāo dào Sū nán Wú Xiǎo mī hé dì di Wú Xiǎo yǔ yě zài mén wài qiǎo yù bìng yī tóng shàng lóu Sū nán hái tè dì wèi ài chá de Wáng lǎo shī dài le míng yōu chá yè",
                    translation = "Bak kata pepatah 'panjang umur yang dibicarakan' (shuō Cáo Cāo Cáo Cāo dào), Su Nan, Wu Xiaomi dan adiknya Wu Xiaoyu berpapasan di jalan lalu bersama-sama naik, di mana Su Nan juga khusus membawakan teh bermutu tinggi untuk Guru Wang.",
                    tokens = listOf(
                        WordToken("说曹操曹操到", "shuō Cáo cāo Cáo cāo dào", "speak of the devil", "Peribahasa Tionghoa populer"),
                        WordToken("茶叶", "chá yè", "tea leaves", "Kosakata HSK 3: 茶叶 (chá yè)"),
                        WordToken("巧", "qiǎo", "coincidental / fortuitous", "Kosakata HSK 3: 巧 (qiǎo)")
                    )
                ),
                Sentence(
                    id = "s_beagst_3",
                    hanzi = "铃美想把新鲜的梨子切开与大家分享，小宇连忙提醒：在中国习俗中梨不能切开分着吃，因为“分梨”谐音“分离”，寓意不太吉利。",
                    pinyin = "Líng měi xiǎng bǎ xīn xiān de lí zi qiē kāi yǔ dà jiā fēn xiǎng Xiǎo yǔ lián máng tí xǐng zài Zhōng guó xí sú zhōng lí bù néng qiē kāi fēn zhe chī yīn wèi fēn lí xié yīn fēn lí yù yì bù tài jí lì",
                    translation = "Ling Mei hendak memotong buah pir segar untuk dinikmati bersama, namun Xiaoyu bergegas mengingatkan: menurut tradisi adat Tionghoa buah pir tidak boleh dipotong dibagi-bagi, sebab 'fēn lí' (membagi buah pir) terdengar persis seperti 'fēnlí' (perpisahan/perceraian), yang maknanya kurang baik.",
                    tokens = listOf(
                        WordToken("梨", "lí", "pear", "Kosakata HSK 3: 梨 (lí)"),
                        WordToken("切", "qiē", "to cut / slice", "Kosakata HSK 3: 切 (qiē)"),
                        WordToken("分梨", "fēn lí", "to share a pear", "Pelesetan budaya homofon"),
                        WordToken("分离", "fēn lí", "to separate / part ways", "Kosakata HSK 3: 分离 (fēn lí)"),
                        WordToken("吉利", "jí lì", "lucky / auspicious", "Kosakata budaya HSK 3: 吉利")
                    )
                )
            ),
            questions = listOf(
                StoryQuestion(
                    id = "q_beagst_1",
                    questionText = "俗语“说曹操曹操到”在故事语境中表达什么含义？ (Apa makna dari ungkapan klasik 'shuō Cáo Cāo Cáo Cāo dào' dalam konteks cerita?)",
                    options = listOf("三国的曹操将军突然复活 (Jenderal Cao Cao zaman Tiga Kerajaan bangkit lagi)", "刚提起谈论某个人，这个人正好就在此时意外出现到达 (Baru saja membicarakan seseorang, orang tersebut kebetulan langsung muncul tiba di depan mata)", "批评别人迟到不守时 (Mengkritik orang yang telat)", "大家在一起讨论三国演义历史 (Sedang berdiskusi novel sejarah)"),
                    correctAnswerIndex = 1,
                    explanation = "'说曹操曹操到' adalah peribahasa umum bahasa Mandarin yang maknanya sama dengan 'speak of the devil' (baru saja dibicarakan, orangnya langsung datang)."
                ),
                StoryQuestion(
                    id = "q_beagst_2",
                    questionText = "在中国传统待客送礼或分食习俗中，为什么忌讳把“梨”切开分给大家吃？ (Mengapa dalam adat tradisi Tionghoa terdapat pantangan memotong buah pir untuk dibagi bersama?)",
                    options = listOf("梨皮含糖量太高容易变质 (Kulit pir mengandung gula tinggi)", "“分梨”（fēn lí）与代表分别拆散的“分离”谐音，民间认为不吉利 (Membagi buah pir 'fēn lí' bunyinya sama persis dengan 'fēnlí' yang berarti perpisahan, dianggap kurang membawa berkah keharmonisan)", "梨肉遇到空气会瞬间变黑 (Daging pir cepat menghitam)", "老师规定只能吃苹果 (Guru mewajibkan hanya boleh makan apel)"),
                    correctAnswerIndex = 1,
                    explanation = "Dalam kebudayaan Tiongkok, '分梨' (fēn lí) memiliki homofon dengan '分离' (fēnlí = berpisah/bercerai), sehingga dihindari dipotong bagi antar kerabat atau sahabat."
                ),
                StoryQuestion(
                    id = "q_beagst_3",
                    questionText = "得知分梨的文化禁忌后，大家最终改吃什么象征平平安安的水果？ (Setelah tahu pantangan tersebut, buah apa yang akhirnya dipilih untuk dimakan bersama?)",
                    options = listOf("香蕉 (Pisang)", "苹果（寓意平平安安） (Apel - yang berakar pada kata píng'ān / damai sentosa)", "西瓜 (Semangka)", "葡萄 (Anggur)"),
                    correctAnswerIndex = 1,
                    explanation = "Ling Mei berkata: '原来是这样啊，那我们吃苹果吧' (Ternyata begitu ya, kalau begitu kita makan apel saja)."
                )
            )
        ),

        // Cerita Mandarin Bean 218 (HSK 3): Mid-Autumn Festival Gathering (Merayakan Festival Musim Gugur)
        Story(
            id = "story_treat_dinner",
            titleHanzi = "一起过中秋节",
            titlePinyin = "Yīqǐ Guò Zhōngqiūjié",
            titleTranslation = "Mid-Autumn Festival Gathering (Bersama Rayakan Festival Kue Bulan)",
            level = "HSK 3",
            category = "Budaya & Festival",
            description = "Guru Wang mengundang para murid internasional dan domestik berkumpul di rumahnya saat Festival Musim Gugur: menyeduh teh harum, berbincang hangat, dan mencicipi kue bulan.",
            coverEmoji = "🥮",
            coverImageRes = R.drawable.cover_story_treat_dinner,
            estimatedReadMinutes = 2,
            sentences = listOf(
                Sentence(
                    id = "s_trtdin_1",
                    hanzi = "铃美到办公室交作业时，王老师热情邀请她周六去家里共度中秋节，铃美欣喜答应，这将是她在中国的第一个中秋节。",
                    pinyin = "Líng měi dào bàn gōng shì jiāo zuò yè shí Wáng lǎo shī rè qíng yāo qǐng tā zhōu liù qù jiā lǐ gòng dù Zhōng qiū jié Líng měi xīn xǐ dā ying zhè jiāng shì tā zài Zhōng guó de dì yī gè Zhōng qiū jié",
                    translation = "Saat Ling Mei menyerahkan PR di kantor, Guru Wang dengan hangat mengundangnya ke rumah pada hari Sabtu untuk merayakan Festival Musim Gugur bersama; Ling Mei menyanggupi dengan riang, ini akan menjadi pengalaman festival kue bulan pertamanya di Tiongkok.",
                    tokens = listOf(
                        WordToken("中秋节", "Zhōng qiū jié", "Mid-Autumn Festival", "Festival tradisional Tionghoa"),
                        WordToken("留学生", "liú xué shēng", "international student", "Kosakata HSK 3: 留学生"),
                        WordToken("答应", "dā ying", "to promise / agree", "Kosakata HSK 3: 答应 (dā ying)")
                    )
                ),
                Sentence(
                    id = "s_trtdin_2",
                    hanzi = "大龙因为早与球友约好打篮球看电影而遗憾无法出席，并表示下次一定做东请大家到自己家品尝拿手厨艺。",
                    pinyin = "Dà lóng yīn wèi zǎo yǔ qiú yǒu yuē hǎo dǎ lán qiú kàn diàn yǐng ér yí hàn wú fǎ chū xí bìng biǎo shì xià cì yī dìng zuò dōng qǐng dà jiā dào zì jǐ jiā pǐn cháng ná shǒu chú yì",
                    translation = "Da Long karena sudah terlanjur janjian main basket dan nonton film bersama teman-temannya terpaksa berhalangan hadir, dan berjanji di lain kesempatan akan mengundang semuanya ke rumahnya untuk mencicipi keahlian memasaknya.",
                    tokens = listOf(
                        WordToken("不好意思", "bù hǎo yì si", "feel embarrassed / sorry", "Kosakata HSK 3: 不好意思"),
                        WordToken("打篮球", "dǎ lán qiú", "play basketball", "Kosakata HSK 2: 打篮球"),
                        WordToken("手艺", "shǒu yì", "craft / cooking skill", "Kosakata HSK 3: 手艺 (shǒu yì)")
                    )
                ),
                Sentence(
                    id = "s_trtdin_3",
                    hanzi = "苏南得知后欣然赴约，与铃美约好周六下午两点半早点前往老师家喝茶畅谈，并在晚餐后一同品尝象征团圆的月饼。",
                    pinyin = "Sū nán dé zhī hòu xīn rán fù yuē yǔ Líng měi yuē hǎo zhōu liù xià wǔ liǎng diǎn bàn zǎo diǎn qián wǎng lǎo shī jiā hē chá chàng tán bìng zài wǎn cān hòu yī tóng pǐn cháng xiàng zhēng tuán yuán de yuè bing",
                    translation = "Su Nan menyambut gembira undangan tersebut dan berjanji dengan Ling Mei untuk datang ke rumah guru lebih awal pada Sabtu pukul 14:30 untuk menikmati teh harum, serta menyantap kue bulan simbol persatuan sehabis makan malam.",
                    tokens = listOf(
                        WordToken("邀请", "yāo qǐng", "to invite", "Kosakata HSK 3: 邀请 (yāo qǐng)"),
                        WordToken("月饼", "yuè bing", "mooncake", "Kuliner khas festival: 月饼"),
                        WordToken("聊聊天", "liáo liáo tiān", "chat leisure", "Kosakata HSK 3: 聊天 (liáo tiān)")
                    )
                )
            ),
            questions = listOf(
                StoryQuestion(
                    id = "q_trtdin_1",
                    questionText = "王老师邀请中外学子本周六相聚家中的节日由头是什么？ (Hari raya apakah yang melatari Guru Wang mengundang para murid ke rumahnya?)",
                    options = listOf("端午节 (Festival Perahu Naga / Bakcang)", "象征阖家团圆的传统中秋节 (Tradisi Festival Pertengahan Musim Gugur / Kue Bulan)", "重阳节 (Festival Chongyang)", "元宵节 (Festival Lampion Cap Go Meh)"),
                    correctAnswerIndex = 1,
                    explanation = "Teks menyatakan: '这周六是中秋节，我想请你们几个留学生和中国学生去我家里面吃饭，一起庆祝中秋节'."
                ),
                StoryQuestion(
                    id = "q_trtdin_2",
                    questionText = "同学大龙为何不得不惋惜地婉拒王老师的周六中秋邀约？ (Mengapa Da Long terpaksa berhalangan hadir memenuhi undangan Guru Wang?)",
                    options = listOf("突然重感冒卧床 (Sakit flu berat)", "之前已和朋友提前订好周六打篮球、看电影的完整日程 (Sudah terlanjur membuat janji main basket dan nonton film seharian dengan kawannya)", "要赶火车回老家 (Harus naik kereta pulang kampung)", "忘记带钥匙被锁在门外 (Terkunci di luar rumah)"),
                    correctAnswerIndex = 1,
                    explanation = "Da Long menjelaskan: '真不好意思，我已经跟朋友约好了。周六上午一起打篮球，下午去看电影，晚上我们一起吃饭'."
                ),
                StoryQuestion(
                    id = "q_trtdin_3",
                    questionText = "中秋节当晚聚餐结束后，按照中华传统习俗大家会共同享用哪种节令糕点？ (Seusai makan malam Imlek/Festival Musim Gugur, kue khas apa yang disantap bersama?)",
                    options = listOf("粽子 (Kue bacang)", "月饼 (Kue bulan / mooncake)", "年糕 (Kue keranjang)", "饺子 (Pangsit jiaozi)"),
                    correctAnswerIndex = 1,
                    explanation = "Guru Wang mengatakan: '晚上吃了饭我们就吃月饼' (Malam hari sehabis santap makan kita akan menikmati kue bulan bersama)."
                )
            )
        ),

        // Cerita Mandarin Bean 219 (HSK 3): What Time Do You Finish Class? (Hari Ini Jam Berapa Pulang Sekolah?)
        Story(
            id = "story_finish_class",
            titleHanzi = "今天几点下课？",
            titlePinyin = "Jīntiān Jǐ Diǎn Xiàkè?",
            titleTranslation = "What Time Do You Finish Class? (Hari Ini Jam Berapa Pulang?)",
            level = "HSK 3",
            category = "Keluarga & Kehidupan Harian",
            description = "Keluarga Wu menyusun koordinasi waktu yang cermat untuk berkumpul makan malam di restoran: jam bubar sekolah, jam pulang kerja, hingga perjalanan bus dan ketepatan waktu.",
            coverEmoji = "🕔",
            coverImageRes = R.drawable.cover_story_finish_class,
            estimatedReadMinutes = 2,
            sentences = listOf(
                Sentence(
                    id = "s_fincls_1",
                    hanzi = "吴小咪下午三点半下课，小宇四点二十下课，两人商定放学后直接从学校赶往餐馆，预计五点一刻到达。",
                    pinyin = "Wú Xiǎo mī xià wǔ sān diǎn bàn xià kè Xiǎo yǔ sì diǎn èr shí xià kè liǎng rén shāng dìng fàng xué hòu zhí jiē cóng xué xiào gǎn wǎng cān guǎn yù jì wǔ diǎn yī kè dào dá",
                    translation = "Wu Xiaomi selesai kelas pukul 15:30 sore, sedangkan Xiaoyu selesai pukul 16:20; keduanya bersepakat langsung menuju restoran dari sekolah seusai kelas dan diperkirakan tiba pukul 17:15.",
                    tokens = listOf(
                        WordToken("下课", "xià kè", "finish class", "Kosakata HSK 2: 下课 (xià kè)"),
                        WordToken("直接", "zhí jiē", "directly / straight", "Kosakata HSK 3: 直接 (zhí jiē)"),
                        WordToken("饭馆", "fàn guǎn", "restaurant", "Kosakata HSK 2: 饭馆 (fàn guǎn)"),
                        WordToken("一刻", "yī kè", "quarter of an hour (15m)", "Kosakata HSK 3: 刻 (kè)")
                    )
                ),
                Sentence(
                    id = "s_fincls_2",
                    hanzi = "哥哥五点下班也直接去饭馆；父母决定四点三刻从家出门，大概五点十分左右到达，一家人正好汇合聚餐。",
                    pinyin = "gē ge wǔ diǎn xià bān yě zhí jiē qù fàn guǎn fù mǔ jué dìng sì diǎn sān kè cóng jiā chū mén dà gài wǔ diǎn shí fēn zuǒ yòu dào dá yī jiā rén zhèng hǎo huì hé jù cān",
                    translation = "Kakak laki-laki mereka selesai bekerja jam 17:00 dan juga langsung ke restoran; kedua orang tua memutuskan keluar rumah pukul 16:45 dan tiba sekitar jam 17:10, sehingga sekeluarga bisa berkumpul bersama menikmati makan malam.",
                    tokens = listOf(
                        WordToken("下班", "xià bān", "get off work", "Kosakata HSK 2: 下班 (xià bān)"),
                        WordToken("三刻", "sān kè", "three quarters (45m)", "Kosakata HSK 3: 刻 (kè)"),
                        WordToken("出门", "chū mén", "leave home", "Kosakata HSK 2: 出门 (chū mén)"),
                        WordToken("左右", "zuǒ yòu", "around / approximately", "Kosakata HSK 3: 左右 (zuǒ yòu)")
                    )
                ),
                Sentence(
                    id = "s_fincls_3",
                    hanzi = "定好晚饭计划后，一看现在差一刻八点，小宇八点上课快迟到了急忙出门，小咪也赶去乘八点零五分的公交车。",
                    pinyin = "dìng hǎo wǎn fàn jì huà hòu yī kàn xiàn zài chà yī kè bā diǎn Xiǎo yǔ bā diǎn shàng kè kuài chí dào le jí máng chū mén Xiǎo mī yě gǎn qù chéng bā diǎn líng wǔ fēn de gōng jiāo chē",
                    translation = "Setelah rencana makan malam disepakati, mereka menyadari waktu sekarang sudah jam delapan kurang lima belas (07:45); Xiaoyu yang masuk kelas jam 08:00 hampir terlambat dan bergegas berangkat, begitu pula Xiaomi yang buru-buru mengejar bus pukul 08:05.",
                    tokens = listOf(
                        WordToken("差一刻", "chà yī kè", "a quarter to (15 mins to)", "Kosakata HSK 3: 差 (chà), 刻 (kè)"),
                        WordToken("迟到", "chí dào", "to be late", "Kosakata HSK 3: 迟到 (chí dào)"),
                        WordToken("公交车", "gōng jiāo chē", "public bus", "Kosakata HSK 2: 公交车")
                    )
                )
            ),
            questions = listOf(
                StoryQuestion(
                    id = "q_fincls_1",
                    questionText = "吴小宇和姐姐吴小咪放学后预计几点在饭馆与家人碰头？ (Pukul berapa Xiaoyu dan Xiaomi diperkirakan tiba di restoran bertemu keluarga?)",
                    options = listOf("下午三点半 (Pukul 15:30 sore)", "五点一刻（17:15） (Pukul 17:15 / jam lima lewat seperempat)", "晚上八点整 (Pukul 20:00)", "四点二十分 (Pukul 16:20)"),
                    correctAnswerIndex = 1,
                    explanation = "Teks menyatakan: '我们从学校过去，大概五点一刻到' (Kami berangkat dari sekolah, kira-kira pukul 17:15 sampai)."
                ),
                StoryQuestion(
                    id = "q_fincls_2",
                    questionText = "在中文时间表达中，“差一刻八点”所对应的数字时间是几点几分？ (Dalam bahasa Mandarin, 'chà yī kè bā diǎn' menunjukkan pukul berapa?)",
                    options = listOf("8点15分 (08:15)", "7点45分（差15分钟到8点） (07:45 / jam delapan kurang lima belas menit)", "8点45分 (08:45)", "7点15分 (07:15)"),
                    correctAnswerIndex = 1,
                    explanation = "'差一刻八点' berarti kurang 15 menit menuju pukul 8, yakni pukul 07:45."
                ),
                StoryQuestion(
                    id = "q_fincls_3",
                    questionText = "早上聊完后，弟弟吴小宇为何急匆匆拔腿就跑？ (Mengapa Xiaoyu buru-buru bergegas pamit pergi di pagi hari?)",
                    options = listOf("他八点有课，眼看就要迟到了 (Ia ada kelas pukul 08:00 dan hampir telat)", "他要帮妈妈去买菜 (Mau bantu ibu belanja)", "饭馆已经开门了 (Restoran sudah buka)", "公交车胎破了 (Ban bus kempes)"),
                    correctAnswerIndex = 0,
                    explanation = "Xiaoyu berseru: '哎呀，我八点上课。我先走了，又要迟到了'."
                )
            )
        ),

        // Cerita Mandarin Bean 220 (HSK 3): Living Habit (Pola Hidup dan Kebiasaan)
        Story(
            id = "story_living_habit",
            titleHanzi = "生活作息习惯",
            titlePinyin = "Shēnghuó Zuòxī Xíguàn",
            titleTranslation = "Living Habit (Menjaga Kebiasaan Hidup Sehat)",
            level = "HSK 3",
            category = "Kesehatan & Gaya Hidup",
            description = "Diskusi jujur antara Da Long dan Wu Xiaomi mengenai kebiasaan tidur larut malam akibat kerja lembur, pentingnya sarapan pagi bergizi, serta olahraga akhir pekan.",
            coverEmoji = "🏃‍♂️",
            coverImageRes = R.drawable.cover_story_living_habit,
            estimatedReadMinutes = 2,
            sentences = listOf(
                Sentence(
                    id = "s_livhab_1",
                    hanzi = "大龙早上一边晨练一边洗澡六点就得起床，上课不停打哈欠；小咪建议他改变以前加班熬夜到深夜十二点半的作息，坚持早睡早起。",
                    pinyin = "Dà lóng zǎo shang yī biān chén liàn yī biān xǐ zǎo liù diǎn jiù děi qǐ chuáng shàng kè bù tíng dǎ hā qian Xiǎo mī jiàn yì tā gǎi biàn yǐ qián jiā bān áo yè dào shēn yè shí èr diǎn bàn de zuò xī jiān chí zǎo shuì zǎo qǐ",
                    translation = "Da Long karena terbiasa olahraga pagi dan mandi harus bangun pukul enam, membuatnya terus-menerus menguap di kelas; Xiaomi menyarankannya mengubah kebiasaan lama begadang kerja lembur hingga pukul 00:30, dan mulai membiasakan tidur awal dan bangun pagi.",
                    tokens = listOf(
                        WordToken("打哈欠", "dǎ hā qian", "to yawn", "Kosakata HSK 3: 打哈欠"),
                        WordToken("迟到", "chí dào", "to be late", "Kosakata HSK 3: 迟到 (chí dào)"),
                        WordToken("习惯", "xí guàn", "habit / accustomed to", "Kosakata HSK 3: 习惯 (xí guàn)"),
                        WordToken("加班", "jiā bān", "to work overtime", "Kosakata HSK 3: 加班 (jiā bān)"),
                        WordToken("坚持", "jiān chí", "to persist / persevere", "Kosakata HSK 3: 坚持 (jiān chí)")
                    )
                ),
                Sentence(
                    id = "s_livhab_2",
                    hanzi = "得知大龙因以前忙碌养成了不吃早饭的不良习惯，小咪坚决督促他去食堂吃最爱的牛肉拉面，因为不吃早饭极伤身体。",
                    pinyin = "dé zhī Dà lóng yīn yǐ qián máng lù yǎng chéng le bù chī zǎo fàn de bù liáng xí guàn Xiǎo mī jiān jué dū cù tā qù shí táng chī zuì ài de niú ròu lā miàn yīn wèi bù chī zǎo fàn jí shāng shēn tǐ",
                    translation = "Mengetahui bahwa akibat kesibukan kerja dulu Da Long memiliki kebiasaan buruk melewatkan sarapan, Xiaomi berkeras mengajaknya ke kantin makan mi tarik daging sapi favoritnya, karena tidak sarapan sangat merusak kesehatan badan.",
                    tokens = listOf(
                        WordToken("难道", "nán dào", "could it be that", "Tata bahasa HSK 3: 难道 (nán dào)"),
                        WordToken("改", "gǎi", "to change / correct", "Kosakata HSK 3: 改 (gǎi)"),
                        WordToken("牛肉拉面", "niú ròu lā miàn", "beef lamian noodles", "Kuliner HSK 3: 牛肉 (niú ròu)")
                    )
                ),
                Sentence(
                    id = "s_livhab_3",
                    hanzi = "大龙也趁机反指出小咪周末只爱在家里睡懒觉看电视不运动的毛病，两人爽快约定这个周末一起去球场打羽毛球强身健体。",
                    pinyin = "Dà lóng yě chèn jī fǎn zhǐ chū Xiǎo mī zhōu mò zhǐ ài zài jiā lǐ shuì lǎn jiào kàn diàn shì bù yùn dòng de máo bìng liǎng rén shuǎng kuai yuē dìng zhè ge zhōu mò yī qǐ qù qiú chǎng dǎ yǔ máo qiú qiáng shēn jiàn tǐ",
                    translation = "Da Long pun bergantian mengingatkan kebiasaan Xiaomi sendiri yang saat akhir pekan hanya gemar bermalas-malasan tidur dan menonton TV tanpa olahraga, dan keduanya pun sepakat akhir pekan ini berolahraga bulu tangkis bersama.",
                    tokens = listOf(
                        WordToken("睡懒觉", "shuì lǎn jiào", "to sleep in / late", "Kosakata HSK 3: 睡懒觉"),
                        WordToken("羽毛球", "yǔ máo qiú", "badminton", "Kosakata HSK 3: 羽毛球 (yǔ máo qiú)"),
                        WordToken("锻炼", "duàn liàn", "to exercise / workout", "Kosakata HSK 3: 锻炼 (duàn liàn)")
                    )
                )
            ),
            questions = listOf(
                StoryQuestion(
                    id = "q_livhab_1",
                    questionText = "大龙在早上八点上课时为什么会不停疲倦地打哈欠？ (Mengapa Da Long terus menguap kelelahan saat jam pelajaran pagi?)",
                    options = listOf("夜里失眠整宿没合眼 (Insomnia semalaman suntuk)", "习惯夜里12点半熬夜，早上又因为晨练洗澡6点早起导致睡眠不足 (Terbiasa tidur pukul 00:30, namun harus bangun jam 6 pagi untuk olahraga dan mandi sehingga kurang tidur)", "教室暖气太热 (Pemanas ruangan terlalu gerah)", "听不懂老师讲的课文 (Tidak paham materi pelajaran)"),
                    correctAnswerIndex = 1,
                    explanation = "Teks menyatakan: Da Long tidur jam 12:30 malam karena kebiasaan lembur, tetapi jam 6 pagi harus bangun untuk olahraga dan mandi."
                ),
                StoryQuestion(
                    id = "q_livhab_2",
                    questionText = "小咪认为大龙哪项危害身体健康的生活习惯“一定得改”？ (Kebiasaan buruk apa dari Da Long yang menurut Xiaomi wajib diperbaiki demi kesehatan?)",
                    options = listOf("喜欢大声唱歌 (Suka bernyanyi keras)", "长年累月不吃早饭的坏习惯 (Kebiasaan buruk bertahun-tahun tidak sarapan pagi)", "天天喝冰水 (Minum air es setiap hari)", "衣服穿得太少 (Pakaian terlalu tipis)"),
                    correctAnswerIndex = 1,
                    explanation = "Teks menegaskan: '这样不行，不吃早饭对身体不好。这个习惯一定得改'."
                ),
                StoryQuestion(
                    id = "q_livhab_3",
                    questionText = "为了互勉改善体质，大龙与小咪最终约定本周末一起从事什么运动？ (Olahraga apa yang disepakati Da Long dan Xiaomi untuk dilakukan bersama akhir pekan ini?)",
                    options = listOf("去体育馆打羽毛球 (Pergi bermain bulu tangkis bersama)", "参加马拉松比赛 (Ikut lomba maraton)", "去深海潜水 (Menyelam ke laut dalam)", "在宿舍练举重 (Latihan angkat beban di asrama)"),
                    correctAnswerIndex = 0,
                    explanation = "Teks diakhiri dengan ajakan: '那这个周末我们一起去打羽毛球吧'."
                )
            )
        ),

        // Cerita Mandarin Bean 221 (HSK 3): What is Your Hobby? (Apa Hobi Kegemaranmu?)
        Story(
            id = "story_what_is_your_hobby",
            titleHanzi = "你的爱好是什么？",
            titlePinyin = "Nǐ de Àihào Shì Shénme?",
            titleTranslation = "What is Your Hobby? (Beragam Hobi Positif)",
            level = "HSK 3",
            category = "Gaya Hidup & Minat",
            description = "Percakapan ceria antara Ling Mei dan Wu Xiaoyu mengeksplorasi ragam hobi menarik: menyanyi, berenang, yoga di gym, bermain piano sejak kecil, hingga seni fotografi.",
            coverEmoji = "🎸",
            coverImageRes = R.drawable.cover_story_what_is_your_hobby,
            estimatedReadMinutes = 2,
            sentences = listOf(
                Sentence(
                    id = "s_wthob_1",
                    hanzi = "小宇特别喜欢唱歌但自谦唱得不好，铃美则喜欢听歌；两人惊喜发现彼此都热爱游泳，并相约日后一同去泳池畅游。",
                    pinyin = "Xiǎo yǔ tè bié xǐ huan chàng gē dàn zì qiān chàng de bù hǎo Líng měi zé xǐ huan tīng gē liǎng rén jīng xǐ fā xiàn bǐ cǐ dōu rè ài yóu yǒng bìng xiāng yuē rì hòu yī tóng qù yǒng chí chàng yóu",
                    translation = "Xiaoyu sangat menyukai bernyanyi walau merendah suaranya kurang bagus, sedangkan Ling Mei senang mendengarkan musik; keduanya terkejut mendapati mereka sama-sama gemar berenang dan berjanji akan berenang bersama kelak.",
                    tokens = listOf(
                        WordToken("唱歌", "chàng gē", "to sing", "Kosakata HSK 1: 唱歌 (chàng gē)"),
                        WordToken("爱好", "ài hào", "hobby / interest", "Kosakata HSK 3: 爱好 (ài hào)"),
                        WordToken("游泳", "yóu yǒng", "to swim", "Kosakata HSK 2: 游泳 (yóu yǒng)")
                    )
                ),
                Sentence(
                    id = "s_wthob_2",
                    hanzi = "铃美分享了自己在健身房跟着教练学习瑜伽的体会，小宇则提到自己早晨偶尔会跟随爷爷去公园练习中国传统太极拳。",
                    pinyin = "Líng měi fēn xiǎng le zì jǐ zài jiàn shēn fáng gēn zhe jiào liàn xué xí yú jiā de tǐ huì Xiǎo yǔ zé tí dào zì jǐ zǎo chen ǒu ěr huì gēn suí yé ye qù gōng yuán liàn xí Zhōng guó chuán tǒng Tài jí quán",
                    translation = "Ling Mei berbagi pengalamannya berlatih yoga di pusat kebugaran bersama instruktur, sementara Xiaoyu menceritakan terkadang di pagi hari ia menemani kakeknya ke taman berlatih seni bela diri tradisional Tai Chi.",
                    tokens = listOf(
                        WordToken("健身房", "jiàn shēn fáng", "gym / fitness center", "Kosakata HSK 3: 健身房"),
                        WordToken("教练", "jiào liàn", "coach / instructor", "Kosakata HSK 3: 教练 (jiào liàn)"),
                        WordToken("瑜伽", "yú jiā", "yoga", "Kosakata olahraga modern: 瑜伽"),
                        WordToken("太极", "Tài jí", "Tai Chi martial art", "Istilah budaya Tionghoa: 太极")
                    )
                ),
                Sentence(
                    id = "s_wthob_3",
                    hanzi = "得知铃美从七岁便开始弹钢琴，而小宇正在潜心研习摄影技巧，两人当即敲定趁着好天气相约下周末外出采风拍照。",
                    pinyin = "dé zhī Líng měi cóng qī suì biàn kāi shǐ tán gāng qín ér Xiǎo yǔ zhèng zài qián xīn yán xí shè yǐng jì qiǎo liǎng rén dāng jí qiāo dìng chèn zhe hǎo tiān qì xiāng yuē xià zhōu mò wài chū cǎi fēng pāi zhào",
                    translation = "Mendengar Ling Mei sudah piawai memainkan piano sejak usia tujuh tahun, dan Xiaoyu kini sedang giat mendalami fotografi, keduanya langsung sepakat memanfaatkan cuaca cerah akhir pekan depan untuk hunting foto ke luar.",
                    tokens = listOf(
                        WordToken("弹钢琴", "tán gāng qín", "to play the piano", "Kosakata HSK 3: 钢琴 (gāng qín)"),
                        WordToken("乐器", "yuè qì", "musical instrument", "Kosakata HSK 3: 乐器 (yuè qì)"),
                        WordToken("摄影", "shè yǐng", "photography", "Kosakata HSK 3: 摄影 (shè yǐng)"),
                        WordToken("拍照", "pāi zhào", "to take pictures", "Kosakata HSK 3: 拍照 (pāi zhào)")
                    )
                )
            ),
            questions = listOf(
                StoryQuestion(
                    id = "q_wthob_1",
                    questionText = "铃美从几岁幼年时期开始学习弹奏钢琴这项乐器？ (Sejak usia berapa tahun Ling Mei mulai belajar bermain alat musik piano?)",
                    options = listOf("3岁 (3 tahun)", "7岁 (7 tahun)", "15岁 (15 tahun)", "上大学后才学 (Baru belajar saat kuliah)"),
                    correctAnswerIndex = 1,
                    explanation = "Ling Mei menuturkan: '是的，我从7岁就开始弹钢琴了'."
                ),
                StoryQuestion(
                    id = "q_wthob_2",
                    questionText = "吴小宇早晨偶尔会陪伴爷爷前往公园练习哪种富有东方韵味的运动？ (Olahraga khas apa yang kadang dilakukan Xiaoyu bersama kakeknya di taman pada pagi hari?)",
                    options = listOf("打太极（太极拳） (Berlatih seni bela diri Tai Chi)", "练习西洋击剑 (Latihan anggar)", "打网球 (Main tenis)", "踢足球 (Sepak bola)"),
                    correctAnswerIndex = 0,
                    explanation = "Teks mencatat: '我有时候早上跟我爷爷去公园打太极'."
                ),
                StoryQuestion(
                    id = "q_wthob_3",
                    questionText = "考虑到小宇目前正在学习摄影，两人达成了下周末怎样的出行约定？ (Mengingat Xiaoyu sedang belajar fotografi, kesepakatan apa yang mereka buat untuk akhir pekan depan?)",
                    options = listOf("去电影院看演唱会 (Nonton konser di bioskop)", "趁着明媚的好天气一起出门拍照采风 (Pergi hunting foto bersama memanfaatkan cuaca yang bagus)", "去琴行挑选新钢琴 (Pergi ke toko musik beli piano)", "在健身房泡一整天 (Seharian di gym)"),
                    correctAnswerIndex = 1,
                    explanation = "Ling Mei mengusulkan: '那下个周末我们出去拍照吧，最近的天气很好' dan disetujui Xiaoyu."
                )
            )
        ),

        // Cerita Mandarin Bean 222 (HSK 3): Family Portrait (Melihat Foto Keluarga Besar)
        Story(
            id = "story_family_portrait",
            titleHanzi = "全家福照片",
            titlePinyin = "Quánjiāfú Zhàopiàn",
            titleTranslation = "Family Portrait (Foto Keluarga Besar yang Hangat)",
            level = "HSK 3",
            category = "Keluarga & Deskripsi Orang",
            description = "Su Nan dan Da Long saling memperlihatkan foto keluarga besar di ponsel mereka, mengenalkan silsilah kerabat, profesi orang tua, hingga kemiripan fisik antar generasi.",
            coverEmoji = "🖼️",
            coverImageRes = R.drawable.cover_story_family_portrait,
            estimatedReadMinutes = 3,
            sentences = listOf(
                Sentence(
                    id = "s_famprt_1",
                    hanzi = "大龙家里是个十口人的热闹大家庭，全家福里有祖父母、父母、兄妹四人，以及当教师的姑姑和留长发胡须的钢琴家叔叔。",
                    pinyin = "Dà lóng jiā lǐ shì gè shí kǒu rén de rè nao dà jiā tíng quán jiā fú lǐ yǒu zǔ fù mǔ fù mǔ xiōng mèi sì rén yǐ jí dāng jiào shī de gū gu hé liú cháng fà hú xū de gāng qín jiā shū shu",
                    translation = "Keluarga Da Long adalah sebuah keluarga besar yang ramai beranggotakan 10 orang; di foto keluarga terdapat kakek-nenek, orang tua, empat bersaudara, bibi yang berprofesi sebagai guru, dan paman berambut panjang serta berjenggot yang merupakan seorang pianis.",
                    tokens = listOf(
                        WordToken("全家福", "quán jiā fú", "family portrait / photograph", "Kosakata HSK 3: 全家福"),
                        WordToken("口", "kǒu", "measure word for family members", "Kosakata HSK 1: 口 (kǒu)"),
                        WordToken("姑姑", "gū gu", "paternal aunt", "Sebutan kerabat: 姑姑 (gū gu)"),
                        WordToken("叔叔", "shū shu", "paternal uncle", "Sebutan kerabat: 叔叔 (shū shu)"),
                        WordToken("胡须", "hú xū", "beard / mustache", "Kosakata HSK 3: 胡须 (hú xū)")
                    )
                ),
                Sentence(
                    id = "s_famprt_2",
                    hanzi = "大龙的爸爸是即将退休的银行经理，哥哥是留利落短发的小提琴家，大龙自己长着高鼻梁和浓密的卷发，相貌格外像父亲。",
                    pinyin = "Dà lóng de bà ba shì jí jiāng tuì xiū de yín háng jīng lǐ gē ge shì liú lì luo duǎn fà de xiǎo tí qín jiā Dà lóng zì jǐ zhǎng zhe gāo bí liang hé nóng mì de juǎn fà xiàng mào gé wài xiàng fù qīn",
                    translation = "Ayah Da Long adalah seorang manajer bank yang akan segera pensiun, kakak lelakinya seorang pemain biola berambut pendek rapi, sedangkan Da Long sendiri memiliki hidung mancung dan rambut ikal tebal, parasnya sangat mirip dengan sang ayah.",
                    tokens = listOf(
                        WordToken("经理", "jīng lǐ", "manager", "Kosakata HSK 3: 经理 (jīng lǐ)"),
                        WordToken("退休", "tuì xiū", "to retire", "Kosakata HSK 3: 退休 (tuì xiū)"),
                        WordToken("小提琴", "xiǎo tí qín", "violin", "Kosakata HSK 3: 小提琴"),
                        WordToken("卷", "juǎn", "curly (hair)", "Kosakata HSK 3: 卷 (juǎn)")
                    )
                ),
                Sentence(
                    id = "s_famprt_3",
                    hanzi = "苏南也展示了手机里的全家福：外公外婆慈祥温和，当警察的父亲身材瘦高，苏南的脸型五官最像母亲，弟弟今年十七岁正在读高中。",
                    pinyin = "Sū nán yě zhǎn shì le shǒu jī lǐ de quán jiā fú wài gōng wài pó cí xiáng wēn hé dāng jǐng chá de fù qīn shēn cái shòu gāo Sū nán de liǎn xíng wǔ guān zuì xiàng mǔ qīn dì di jīn nián shí qī suì zhèng zài dú gāo zhōng",
                    translation = "Su Nan turut memperlihatkan foto keluarga di ponselnya: kakek dan nenek dari pihak ibu tampak ramah, ayahnya yang seorang polisi berperawakan tinggi kurus, wajah Su Nan sendiri paling mirip dengan ibunya, dan adik lelakinya berusia 17 tahun duduk di bangku SMA.",
                    tokens = listOf(
                        WordToken("外公", "wài gōng", "maternal grandfather", "Kosakata HSK 3: 外公 (wài gōng)"),
                        WordToken("外婆", "wài pó", "maternal grandmother", "Kosakata HSK 3: 外婆 (wài pó)"),
                        WordToken("身材", "shēn cái", "figure / physique", "Kosakata HSK 3: 身材 (shēn cái)"),
                        WordToken("警察", "jǐng chá", "police officer", "Kosakata HSK 3: 警察 (jǐng chá)"),
                        WordToken("高中", "gāo zhōng", "senior high school", "Kosakata HSK 3: 高中 (gāo zhōng)")
                    )
                )
            ),
            questions = listOf(
                StoryQuestion(
                    id = "q_famprt_1",
                    questionText = "在全家福合影中，大龙家里总共有多少位家庭成员同框？ (Berapa total anggota keluarga yang berfoto dalam potret keluarga Da Long?)",
                    options = listOf("五口人 (5 orang)", "十口人 (10 orang)", "三口人 (3 orang)", "整整二十口人 (20 orang)"),
                    correctAnswerIndex = 1,
                    explanation = "Teks menyatakan: '我数数啊……十口，我们家有十口人'."
                ),
                StoryQuestion(
                    id = "q_famprt_2",
                    questionText = "根据大龙的介绍，他那位留着飘逸长发与胡须的叔叔从事的是什么艺术职业？ (Profesi seni apa yang ditekuni paman Da Long yang berambut panjang dan berjenggot?)",
                    options = listOf("中学体育老师 (Guru olahraga SMP)", "专业钢琴家 (Pianis profesional)", "电影导演 (Sutradara film)", "银行大堂经理 (Manajer lobi bank)"),
                    correctAnswerIndex = 1,
                    explanation = "Teks menerangkan: '他（叔叔）是钢琴家，他留长头发很久了'."
                ),
                StoryQuestion(
                    id = "q_famprt_3",
                    questionText = "苏南的父亲在社会上从事的是哪项光荣职业？ (Profesi apa yang digeluti oleh ayah dari Su Nan?)",
                    options = listOf("警察 (Petugas polisi)", "医生 (Dokter)", "出租车司机 (Sopir taksi)", "小学数学教师 (Guru matematika SD)"),
                    correctAnswerIndex = 0,
                    explanation = "Teks menyebutkan: '我爸爸是警察，妈妈是家庭主妇'."
                )
            )
        ),

        // Cerita Mandarin Bean 223 (HSK 3): Weekend Trip (Akhir Pekan Pergi ke Mana?)
        Story(
            id = "story_weekend_trip",
            titleHanzi = "周末去哪儿了？",
            titlePinyin = "Zhōumò Qù Nǎr Le?",
            titleTranslation = "Weekend Trip (Akhir Pekan: Belanja vs Arung Jeram)",
            level = "HSK 3",
            category = "Kehidupan & Rekreasi",
            description = "Perbedaan gaya rekreasi akhir pekan kakak-beradik: Wu Xiaomi yang gemar berburu busana diskon di mall seharian, versus Wu Xiaoyu yang memacu adrenalin dengan arung jeram di sungai pedesaan.",
            coverEmoji = "🛶",
            coverImageRes = R.drawable.cover_story_weekend_trip,
            estimatedReadMinutes = 2,
            sentences = listOf(
                Sentence(
                    id = "s_wktrip_1",
                    hanzi = "小咪周末和铃美从早逛到晚买了一堆物美价廉的漂亮衣服，虽然累得走不动，但她戏称逛街既能购物又是最好的身体锻炼。",
                    pinyin = "Xiǎo mī zhōu mò hé Líng měi cóng zǎo guàng dào wǎn mǎi le yī duī wù měi jià lián de piào liang yī fu suī rán lèi de zǒu bu dòng dàn tā xì chēng guàng jiē jì néng gòu wù yòu shì zuì hǎo de shēn tǐ duàn liàn",
                    translation = "Xiaomi dan Ling Mei menghabiskan akhir pekan berbelanja dari pagi hingga malam memborong banyak pakaian murah dan cantik; walau letih sampai tak sanggup melangkah, ia bercanda bahwa cuci mata di mall bisa belanja sekaligus sarana olahraga jalan kaki.",
                    tokens = listOf(
                        WordToken("逛街", "guàng jiē", "shopping / window shopping", "Kosakata HSK 3: 逛 (guàng)"),
                        WordToken("走不动", "zǒu bu dòng", "cannot walk anymore", "Kosakata HSK 3: 动 (dòng)"),
                        WordToken("便宜", "pián yi", "cheap", "Kosakata HSK 2: 便宜 (pián yi)"),
                        WordToken("锻炼", "duàn liàn", "to exercise", "Kosakata HSK 3: 锻炼 (duàn liàn)")
                    )
                ),
                Sentence(
                    id = "s_wktrip_2",
                    hanzi = "弟弟小宇则与同学前往郊区水春河体验橡皮艇漂流，近日河水充沛，水流湍急，漂流过程非常刺激好玩。",
                    pinyin = "dì di Xiǎo yǔ zé yǔ tóng xué qián wǎng jiāo qū shuǐ chūn hé tǐ yàn xiàng pí tǐng piāo liú jìn rì shuǐ shuǐ liàng dà shuǐ liú tuān jí piāo liú guò chéng fēi cháng cì jī hǎo wán",
                    translation = "Sang adik, Xiaoyu, bersama kawan-kawannya pergi ke Sungai Shuichun di pinggiran kota untuk mencoba arung jeram (rafting); debit air sungai yang melimpah membuat arung jeram terasa sangat memicu adrenalin dan seru.",
                    tokens = listOf(
                        WordToken("郊区", "jiāo qū", "suburbs / rural area", "Kosakata HSK 3: 郊区 (jiāo qū)"),
                        WordToken("漂流", "piāo liú", "rafting / drifting", "Kosakata rekreasi: 漂流 (piāo liú)"),
                        WordToken("刺激", "cì jī", "exciting / thrilling", "Kosakata HSK 3: 刺激 (cì jī)")
                    )
                ),
                Sentence(
                    id = "s_wktrip_3",
                    hanzi = "小宇热情邀请姐姐下次同去，并保证叫上哥哥划船护航，小咪却犹豫不决，坦白自己不是怕水湿衣服，而是格外害怕皮肤被烈日晒黑。",
                    pinyin = "Xiǎo yǔ rè qíng yāo qǐng jiě jie xià cì tóng qù bìng bǎo zhèng jiào shàng gē ge huá chuán hù háng Xiǎo mī què yóu yù bù jué tǎn bái zì jǐ bù shì pà shuǐ shī yī fu ér shì gé wài hài pà pí fū bèi liè rì shài hēi",
                    translation = "Xiaoyu mengajak kakaknya ikut serta lain kali dan berjanji akan mengajak kakak laki-laki mendayung perahu di depan-belakang, namun Xiaomi tampak ragu-ragu dan mengaku ia bukan takut baju basah kuyup, melainkan takut kulitnya terbakar matahari menjadi gosong/hitam.",
                    tokens = listOf(
                        WordToken("害怕", "hài pà", "afraid of", "Kosakata HSK 3: 害怕 (hài pà)"),
                        WordToken("湿", "shī", "wet", "Kosakata HSK 3: 湿 (shī)"),
                        WordToken("划船", "huá chuán", "to row a boat", "Kosakata HSK 3: 划船 (huá chuán)"),
                        WordToken("晒黑", "shài hēi", "tanned / sunburnt", "Kosakata HSK 3: 晒 (shài)")
                    )
                )
            ),
            questions = listOf(
                StoryQuestion(
                    id = "q_wktrip_1",
                    questionText = "吴小宇在周末与同伴前往郊区河流体验了哪项充满活力的户外运动？ (Aktivitas luar ruangan energik apa yang dilakukan Wu Xiaoyu bersama temannya di pinggiran kota?)",
                    options = listOf("高山滑雪 (Bermain ski salju)", "河流皮艇漂流（户外漂流） (Arung jeram / rafting di sungai)", "野外攀岩 (Panjat tebing liar)", "湖畔垂钓 (Memancing di tepi danau)"),
                    correctAnswerIndex = 1,
                    explanation = "Teks mencatat: '我周末跟同学去郊区漂流了... 漂流特别刺激'."
                ),
                StoryQuestion(
                    id = "q_wktrip_2",
                    questionText = "姐姐吴小咪为什么把“逛街一整天”戏称为自己最好的锻炼身体方式？ (Mengapa kakaknya, Xiaomi, menyebut belanja seharian di mall sebagai olahraga terbaiknya?)",
                    options = listOf("商场里有免费健身教练 (Di mall ada pelatih kebugaran gratis)", "因为从早到晚连续步行走了一整天，既能买到心仪衣物又能消耗热量 (Karena berjalan kaki terus-menerus dari pagi hingga malam)", "她在商场参加跳绳比赛 (Ia ikut lomba lompat tali di mall)", "商场电梯全坏了只能爬楼梯 (Semua eskalator rusak harus naik tangga)"),
                    correctAnswerIndex = 1,
                    explanation = "Xiaomi bergurau: '我们从上午一直逛到晚上，都累得走不动了... 不但能买东西，还能锻炼身体'."
                ),
                StoryQuestion(
                    id = "q_wktrip_3",
                    questionText = "面对弟弟的极力劝说邀请，小咪对参加漂流最大的顾虑是什么？ (Kekhawatiran terbesar apa yang membuat Xiaomi ragu untuk ikut arung jeram?)",
                    options = listOf("怕水里的水怪 (Takut monster air)", "害怕烈日曝晒把原本白皙的皮肤晒黑 (Takut kulit putihnya terbakar matahari menjadi hitam/gosong)", "觉得门票太昂贵 (Merasa tiket terlalu mahal)", "自己不会穿救生衣 (Tidak bisa memakai pelampung)"),
                    correctAnswerIndex = 1,
                    explanation = "Teks diakhiri dengan pengakuan Xiaomi: '不是，我是怕被晒黑' (Bukan takut air, tapi aku takut kulitku jadi hitam kena matahari)."
                )
            )
        )
    )
}
