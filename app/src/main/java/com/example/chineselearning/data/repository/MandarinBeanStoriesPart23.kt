package com.example.chineselearning.data.repository

import com.example.chineselearning.R
import com.example.chineselearning.data.model.Sentence
import com.example.chineselearning.data.model.Story
import com.example.chineselearning.data.model.StoryQuestion
import com.example.chineselearning.data.model.WordToken

val mandarinBeanStoriesPart23: List<Story> by lazy {
    listOf(
        // Cerita Mandarin Bean 244 (HSK 3): Blind Date (Budaya Kencan Buta)
        Story(
            id = "story_blind_date",
            titleHanzi = "相亲文化",
            titlePinyin = "Xiāngqīn Wénhuà",
            titleTranslation = "Blind Date (Tren Kencan Buta / Perjodohan Modern)",
            level = "HSK 3",
            category = "Sosial & Pernikahan",
            description = "Fenomena kencan buta (xiāngqīn) di Tiongkok: kriteria pemilihan pasangan (penampilan, karier, kepribadian), perkenalan keluarga, hingga perdebatan cinta romantis.",
            coverEmoji = "💐",
            coverImageRes = R.drawable.cover_story_blind_date,
            estimatedReadMinutes = 2,
            sentences = listOf(
                Sentence(
                    id = "s_blnddt_1",
                    hanzi = "许多年轻人渴望寻觅理想的伴侣，但在日常交际圈难以结识合适对象，于是相亲逐渐成为广受欢迎的选择。",
                    pinyin = "xǔ duō nián qīng rén kě wàng xún mì lǐ xiǎng de bàn lǚ dàn zài rì cháng jiāo jì quān nán yǐ jié shí hé shì de rén yīn cǐ xiāng qīn zhú jiàn chéng wéi guǎng shòu huān yíng de xuǎn zé",
                    translation = "Banyak generasi muda mendambakan pasangan ideal, namun di lingkaran pergaulan sehari-hari sulit menemukan orang yang cocok, sehingga kencan buta (xiāngqīn) kian populer sebagai alternatif pilihan.",
                    tokens = listOf(
                        WordToken("选择", "xuǎn zé", "to choose / select", "Kosakata HSK 3: 选择 (xuǎn zé)"),
                        WordToken("合适", "hé shì", "suitable / appropriate", "Kosakata HSK 3: 合适 (hé shì)"),
                        WordToken("相亲", "xiāng qīn", "blind date / matchmaking", "Istilah sosial: 相亲 (xiāng qīn)"),
                        WordToken("越来越", "yuè lái yuè", "more and more", "Tata bahasa HSK 3: 越来越")
                    )
                ),
                Sentence(
                    id = "s_blnddt_2",
                    hanzi = "相亲时人们常综合考量对方的长相、职业、经济基础以及性格爱好，往往先通过互看照片或在线聊天建立初步了解，再决定是否线下奔现。",
                    pinyin = "xiāng qīn shí rén men cháng zōng hé kǎo liang duì fāng de zhǎng xiàng zhí yè jīng jì jī chǔ yǐ jí xìng gé ài hào wǎng wǎng xiān tōng guò hù kàn zhào piàn huò zài xiàn liáo tiān jiàn lì chū bù liǎo jiě zài jué dìng shì fǒu xiàn xià bēn xiàn",
                    translation = "Saat kencan buta orang biasanya mempertimbangkan rupa paras, profesi kerja, kondisi finansial, serta kepribadian dan minat; biasanya mereka bertukar foto dan mengobrol lewat ponsel terlebih dahulu sebelum memutuskan bertemu langsung.",
                    tokens = listOf(
                        WordToken("考虑", "kǎo lǜ", "to consider / ponder", "Kosakata HSK 3: 考虑 (kǎo lǜ)"),
                        WordToken("长相", "zhǎng xiàng", "appearance / looks", "Kosakata HSK 3: 长相 (zhǎng xiàng)"),
                        WordToken("性格", "xìng gé", "personality / character", "Kosakata HSK 3: 性格 (xìng gé)"),
                        WordToken("爱好", "ài hào", "hobby", "Kosakata HSK 3: 爱好 (ài hào)"),
                        WordToken("放心", "fàng xīn", "to feel relieved", "Kosakata HSK 3: 放心 (fàng xīn)")
                    )
                ),
                Sentence(
                    id = "s_blnddt_3",
                    hanzi = "虽然亲友引荐的相亲令人倍感踏实，但仍有部分青年崇尚自然浪漫的偶遇邂逅，渴望通过自主恋爱携手步入婚姻殿堂。",
                    pinyin = "suī rán qīn yǒu yǐn jiàn de xiāng qīn lìng rén bèi gǎn tā shí dàn réng yǒu bù fèn qīng nián chóng shàng zì rán làng màn de ǒu yù xiè hòu kě wàng tōng guò zì zhǔ liàn ài xié shǒu bù rù hūn yīn diàn táng",
                    translation = "Meskipun kencan buta dari rekomendasi kerabat terasa lebih aman dan menenangkan, ada pula sebagian kalangan muda yang lebih mendambakan pertemuan romantis alami, berpacaran bebas, hingga akhirnya melangkah ke jenjang pernikahan.",
                    tokens = listOf(
                        WordToken("浪漫", "làng màn", "romantic", "Kosakata HSK 3: 浪漫 (làng màn)"),
                        WordToken("恋爱", "liàn ài", "romantic love / to date", "Kosakata HSK 3: 恋爱 (liàn ài)"),
                        WordToken("结婚", "jié hūn", "to marry", "Kosakata HSK 3: 结婚 (jié hūn)"),
                        WordToken("自然", "zì rán", "natural", "Kosakata HSK 3: 自然 (zì rán)")
                    )
                )
            ),
            questions = listOf(
                StoryQuestion(
                    id = "q_blnddt_1",
                    questionText = "现代许多单身青年之所以选择“相亲”认识伴侣的最主要现实背景是什么？ (Alasan praktis apa yang membuat banyak anak muda memilih kencan buta?)",
                    options = listOf("父母强迫断绝生活费 (Orang tua memutus uang saku)", "在日常学习或工作圈子中较难结识到各方面条件合适的异性 (Di lingkaran kerja/kuliah sulit menemukan orang yang cocok)", "为了在电视节目上成名 (Ingin terkenal di acara televisi)", "工作太闲打发时间 (Terlalu menganggur)"),
                    correctAnswerIndex = 1,
                    explanation = "Teks menyatakan: '很多年轻人都想找一个男朋友或者女朋友，但是不知道在哪认识合适的人，所以越来越多的人选择相亲'."
                ),
                StoryQuestion(
                    id = "q_blnddt_2",
                    questionText = "很多相亲对象之所以让年轻人感到“比较放心”的信任来源是什么？ (Apa sumber rasa percaya yang membuat kencan buta terasa lebih aman?)",
                    options = listOf("通过昂贵的付费中介公司匹配 (Lewat agensi mak comblang mahal)", "大多由信得过的亲朋好友或家人牵线介绍 (Sebagian besar diperkenalkan oleh kawan atau keluarga terpercaya)", "对方都是同名同姓的熟人 (Semua punya nama kembar)", "警察局提供安全担保 (Polisi menjamin keamanan)"),
                    correctAnswerIndex = 1,
                    explanation = "Teks menjelaskan: '很多相亲对象都是朋友或者亲人介绍的，所以大家也比较放心'."
                ),
                StoryQuestion(
                    id = "q_blnddt_3",
                    questionText = "部分年轻人排斥或反感相亲的原因通常在于什么观念？ (Alasan apa yang membuat sebagian anak muda kurang menyukai kencan buta?)",
                    options = listOf("相亲门票太贵 (Tiket kencan buta mahal)", "认为形式过于目的化与现实，缺乏偶遇和自然恋爱的浪漫情调 (Menganggapnya terlalu kaku dan tidak romantis dibanding jatuh cinta secara alami)", "害怕对方长得太漂亮 (Takut pasangannya terlalu cantik)", "相亲必须穿正装打领带 (Wajib pakai jas dasi)"),
                    correctAnswerIndex = 1,
                    explanation = "Teks menyebutkan: '他们认为相亲认识不太浪漫，希望能自然地、浪漫地认识一个人，然后恋爱，最后可以结婚'."
                )
            )
        ),

        // Cerita Mandarin Bean 245 (HSK 3): Favorite Food (Selera Makanan Anggota Keluarga)
        Story(
            id = "story_favorite_food",
            titleHanzi = "全家人的饮食偏好",
            titlePinyin = "Quán Jiā Rén de Yǐnshí Piānhào",
            titleTranslation = "Favorite Food (Ragam Selera Makan Keluarga)",
            level = "HSK 3",
            category = "Keluarga & Nutrisi Sehat",
            description = "Dinamika selera makan keluarga tiga orang: istri pencinta sayur pedas tanpa nasi, suami penyuka masakan tawar seimbang, dan sang anak yang hanya gemar camilan manis.",
            coverEmoji = "🥗",
            coverImageRes = R.drawable.cover_story_favorite_food,
            estimatedReadMinutes = 2,
            sentences = listOf(
                Sentence(
                    id = "s_favfod_1",
                    hanzi = "我们一家三口各有所好：我酷爱各类新鲜蔬菜并嗜辣如命，唯独不爱吃主食米饭。",
                    pinyin = "wǒ men yī jiā sān kǒu gè yǒu suǒ hào wǒ kù ài gè lèi xīn xiān shū cài bìng shì là rú mìng wéi dú bù ài chī zhǔ shí mǐ fàn",
                    translation = "Keluarga kami yang beranggotakan tiga orang memiliki selera berbeda: saya sangat menyukai aneka sayuran segar dan masakan bercita rasa pedas, tetapi saya kurang menyukai nasi putih.",
                    tokens = listOf(
                        WordToken("食物", "shí wù", "food", "Kosakata HSK 3: 食物 (shí wù)"),
                        WordToken("蔬菜", "shū cài", "vegetables", "Kosakata HSK 3: 蔬菜 (shū cài)"),
                        WordToken("辣", "là", "spicy", "Kosakata HSK 3: 辣 (là)"),
                        WordToken("米饭", "mǐ fàn", "cooked rice", "Kosakata HSK 1: 米饭 (mǐ fàn)")
                    )
                ),
                Sentence(
                    id = "s_favfod_2",
                    hanzi = "丈夫荤素均衡兼爱肉食与蔬菜，但肠胃敏感耐不得半点辛辣，平日只喜清淡爽口的烹调风味。",
                    pinyin = "zhàng fu hūn sù jūn héng jiān ài ròu shí yǔ shū cài dàn cháng wèi mǐn gǎn nài bu dé bàn diǎn xīn là píng rì zhǐ xǐ qīng dàn shuǎng kǒu de pēng tiáo fēng wèi",
                    translation = "Suami saya seimbang memakan daging dan sayur, namun sama sekali tidak tahan makanan pedas dan hanya menyukai hidangan bercita rasa gurih tawar yang menyehatkan.",
                    tokens = listOf(
                        WordToken("丈夫", "zhàng fu", "husband", "Kosakata HSK 2: 丈夫 (zhàng fu)"),
                        WordToken("不仅...也", "bù dàn yě", "not only... but also", "Tata bahasa HSK 3: 不但...也"),
                        WordToken("肉", "ròu", "meat", "Kosakata HSK 2: 肉 (ròu)"),
                        WordToken("清淡", "qīng dàn", "light / non-greasy / mild", "Kosakata HSK 3: 清淡 (qīng dàn)")
                    )
                ),
                Sentence(
                    id = "s_favfod_3",
                    hanzi = "年幼的孩子则被面包蛋糕等甜食深深吸引，却对肉菜挑食厌拒，父母正竭力引导孩子建立均衡营养的健康饮食习惯。",
                    pinyin = "nián yòu de hái zi zé bèi miàn bāo dàn gāo děng tián shí shēn shēn xī yǐn què duì ròu cài tiāo shí yàn jù fù mǔ zhèng jié lì yǐn dǎo hái zi jiàn lì jūn héng yíng yǎng de jiàn kāng yǐn shí xí guàn",
                    translation = "Anak kami sangat tergila-gila pada makanan manis seperti roti dan kue tart, namun sangat pilih-pilih makanan terhadap daging dan sayuran; kami sebagai orang tua sedang mencari cara agar anak mau mengonsumsi makanan bergizi sehat.",
                    tokens = listOf(
                        WordToken("甜", "tián", "sweet", "Kosakata HSK 3: 甜 (tián)"),
                        WordToken("面包", "miàn bāo", "bread", "Kosakata HSK 3: 面包 (miàn bāo)"),
                        WordToken("蛋糕", "dàn gāo", "cake", "Kosakata HSK 3: 蛋糕 (dàn gāo)"),
                        WordToken("担心", "dān xīn", "worried", "Kosakata HSK 3: 担心 (dān xīn)"),
                        WordToken("健康", "jiàn kāng", "healthy", "Kosakata HSK 3: 健康 (jiàn kāng)")
                    )
                )
            ),
            questions = listOf(
                StoryQuestion(
                    id = "q_favfod_1",
                    questionText = "故事中女主人公在个人饮食结构上表现出怎样鲜明的独特偏好？ (Preferensi makan apa yang dimiliki oleh tokoh ibu dalam cerita?)",
                    options = listOf("极度爱吃肥肉和油炸食品 (Sangat suka daging berlemak dan gorengan)", "爱吃蔬菜，特别喜欢吃辣，但不喜欢吃米饭 (Menyukai aneka sayuran, gemar makanan pedas, namun tidak suka makan nasi)", "每顿饭必须吃三大碗白米饭 (Tiap makan wajib habis 3 mangkok nasi)", "只吃西餐汉堡 (Hanya makan burger)"),
                    correctAnswerIndex = 1,
                    explanation = "Teks menyatakan: '我喜欢吃蔬菜，特别喜欢辣的东西，但是不喜欢吃米饭'."
                ),
                StoryQuestion(
                    id = "q_favfod_2",
                    questionText = "丈夫虽然荤素不拒，但在口味辣度上有着怎样的严格限制？ (Batasan rasa apa yang harus dipatuhi oleh sang suami?)",
                    options = listOf("非超辣不可 (Wajib sangat pedas)", "完全不能吃辣，只喜欢吃清淡口味的食物 (Sama sekali tidak bisa makan pedas, hanya suka makanan tawar)", "只吃酸甜苦辣调和的怪味菜 (Suka rasa campur aduk)", "只在深夜吃川菜 (Cuma makan makanan pedas tengah malam)"),
                    correctAnswerIndex = 1,
                    explanation = "Teks menjelaskan: '但是他不能吃辣，只喜欢吃清淡的食物'."
                ),
                StoryQuestion(
                    id = "q_favfod_3",
                    questionText = "家里的孩子有着怎样的不良饮食偏好令父母深感忧虑？ (Kebiasaan makan buruk apa dari sang anak yang mencemaskan kedua orang tua?)",
                    options = listOf("只爱吃甜食面包和蛋糕，严重抗拒挑食蔬菜和肉类 (Hanya gemar makan roti dan kue manis, enggan makan sayuran dan daging)", "喝太多咖啡导致失眠 (Minum kopi berlebihan)", "只喝冰镇碳酸饮料 (Cuma minum soda dingin)", "每次吃饭都要吃整整两个小时 (Makan butuh 2 jam)"),
                    correctAnswerIndex = 0,
                    explanation = "Teks menyatakan: '我们的孩子最喜欢甜的东西，面包、蛋糕、水果都是他的最爱... 他总是不喜欢吃肉和蔬菜'."
                )
            )
        ),

        // Cerita Mandarin Bean 246 (HSK 3): Ask for leave (Trik Lucu Minta Izin Bolos)
        Story(
            id = "story_kid_ask_leave",
            titleHanzi = "又生了一个小弟弟",
            titlePinyin = "Yòu Shēng Le Yī Gè Xiǎo Dìdi",
            titleTranslation = "Ask for leave (Alasan Cerdik Izin Membolos)",
            level = "HSK 3",
            category = "Cerita Lucu & Humor",
            description = "Lelucon polos seorang bocah bernama Dadan yang malas sekolah: ia izin pulang karena ibu melahirkan adik perempuan, dan sengaja menyimpan kabar adik laki-laki kembar untuk membolos minggu depan.",
            coverEmoji = "👶",
            coverImageRes = R.drawable.cover_story_kid_ask_leave,
            estimatedReadMinutes = 1,
            sentences = listOf(
                Sentence(
                    id = "s_kdaskl_1",
                    hanzi = "厌学的达达频频编造头痛脑热的借口请假逃学，在家闲散消磨的时光远超在校求学的日子。",
                    pinyin = "yàn xué de Dá dá pín pín biān zào tóu tòng nǎo rè de jiè kǒu qǐng jià táo xué zài jiā xián sǎn xiāo mó de shí guāng yuǎn chāo zài xiào qiú xué de rì zi",
                    translation = "Dadan yang enggan belajar kerap mencari-cari alasan pusing atau sakit ke rumah sakit demi izin membolos, waktu yang dihabiskannya di rumah bahkan jauh lebih banyak daripada waktu belajar di sekolah.",
                    tokens = listOf(
                        WordToken("上学", "shàng xué", "to attend school", "Kosakata HSK 2: 上学 (shàng xué)"),
                        WordToken("经常", "jīng cháng", "often", "Kosakata HSK 2: 经常 (jīng cháng)"),
                        WordToken("头痛", "tóu tòng", "headache", "Kosakata HSK 2: 疼 / 痛"),
                        WordToken("医院", "yī yuàn", "hospital", "Kosakata HSK 1: 医院 (yī yuàn)")
                    )
                ),
                Sentence(
                    id = "s_kdaskl_2",
                    hanzi = "一日清晨他又早早溜回了家，面对父亲的诧异盘问，他自得声称以“母亲新诞下一位小妹妹需回家照应”为由向老师准假。",
                    pinyin = "yī rì qīng chén tā yòu zǎo zǎo liū huí le jiā miàn duì fù qīn de chà yì pán wèn tā zì dé shēng chēng yǐ mǔ qīn xīn dàn xià yī wèi xiǎo mèi mei xū huí jiā zhào ying wèi yóu xiàng lǎo shī zhǔn jià",
                    translation = "Suatu pagi ia tiba-tiba pulang lebih awal; menghadapi pertanyaan heran sang ayah, ia berbangga mengaku kepada guru bahwa ibunya baru saja melahirkan seorang adik perempuan sehingga ia harus pulang membantu di rumah.",
                    tokens = listOf(
                        WordToken("惊讶", "jīng yà", "surprised", "Kosakata HSK 3: 惊讶 (jīng yà)"),
                        WordToken("妹妹", "mèi mei", "younger sister", "Kosakata HSK 2: 妹妹 (mèi mei)"),
                        WordToken("帮忙", "bāng máng", "to help", "Kosakata HSK 2: 帮忙 (bāng máng)")
                    )
                ),
                Sentence(
                    id = "s_kdaskl_3",
                    hanzi = "父亲提醒母亲实则生下的是龙凤双胞胎，达达得意洋洋狡黠笑道：下周正好可以用“又添小弟弟”再名正言顺请假一周。",
                    pinyin = "fù qīn tí xǐng mǔ qīn shí zé shēng xià de shì lóng fèng shuāng bāo tāi Dá dá dé yì yáng yáng jiǎo xiá xiào dào xià zhōu zhèng hǎo kě yǐ yòng yòu tiān xiǎo dì di zài míng zhèng yán shùn qǐng jià yī zhōu",
                    translation = "Sang ayah mengingatkan bahwa ibunya sebenarnya melahirkan anak kembar (seorang adik perempuan dan seorang adik laki-laki); Dadan tertawa cerdik menyahut: 'Tentu saja aku tahu, kabar adik laki-laki sengaja kusimpan untuk alasan izin membolos lagi minggu depan!'",
                    tokens = listOf(
                        WordToken("不但...还", "bù dàn hái", "not only... but also", "Tata bahasa HSK 3: 不但...还"),
                        WordToken("弟弟", "dì di", "younger brother", "Kosakata HSK 2: 弟弟 (dì di)"),
                        WordToken("准备", "zhǔn bèi", "to plan / prepare", "Kosakata HSK 2: 准备 (zhǔn bèi)"),
                        WordToken("又", "yòu", "again", "Kosakata HSK 2: 又 (yòu)")
                    )
                )
            ),
            questions = listOf(
                StoryQuestion(
                    id = "q_kdaskl_1",
                    questionText = "小顽童达达今天早晨突然向学校老师请假早退的荒诞借口是什么？ (Alasan izin apa yang dipakai bocah Dadan saat membolos pulang sekolah pagi itu?)",
                    options = listOf("家里水管爆裂需要抢修 (Pipa air di rumah jebol)", "声称妈妈给自己生了一个小妹妹，需要回家帮忙照看 (Mengaku ibunya baru melahirkan adik perempuan dan ia harus pulang membantu)", "自己被流浪狗咬伤 (Digigit anjing liar)", "去机场给亲戚送行 (Mengantar kerabat di bandara)"),
                    correctAnswerIndex = 1,
                    explanation = "Dadan menjawab: '我告诉老师我有了一个小妹妹，我要回家帮忙'."
                ),
                StoryQuestion(
                    id = "q_kdaskl_2",
                    questionText = "当爸爸指出妈妈其实同时生下了一个妹妹和一个弟弟（双胞胎）时，达达如何机灵作答？ (Bagaimana reaksi cerdik Dadan saat ayahnya memberitahu bahwa bayinya kembar?)",
                    options = listOf("当场哭闹不信 (Menangis tidak percaya)", "得意表示自己早就心知肚明，打算留着“小弟弟”的理由下周再向老师请假一次 (Mengaku sengaja menyimpan kabar adik laki-laki untuk izin membolos lagi minggu depan)", "责怪爸爸没有通知学校 (Menyalahkan ayahnya)", "决定以后再也不请假 (Berjanji tidak bolos lagi)"),
                    correctAnswerIndex = 1,
                    explanation = "Dadan tertawa cerdik: '我当然知道。我准备下个星期再跟老师说，妈妈又生了一个小弟弟'."
                ),
                StoryQuestion(
                    id = "q_kdaskl_3",
                    questionText = "这则故事的幽默笑点主要源自于小主人公怎样的思维心理？ (Di manakah letak kejenakaan dari alur cerita ini?)",
                    options = listOf("他不认识自己的双胞胎弟妹 (Ia tidak kenal adik kandungnya)", "把生双胞胎的喜讯精明地分割成两次连续逃课请假的奇葩计谋 (Membagi kabar kelahiran bayi kembar menjadi dua alasan izin terpisah demi membolos dua kali)", "把老师的名字叫错了 (Salah sebut nama guru)", "把书包遗忘在医院 (Ranselnya tertinggal di RS)"),
                    correctAnswerIndex = 1,
                    explanation = "Kejenakaannya adalah kelicikan cerdik anak sekolah yang sengaja memecah kelahiran adik kembarnya menjadi dua kali alasan izin membolos secara berurutan."
                )
            )
        ),

        // Cerita Mandarin Bean 247 (HSK 3): The Best Car (Mobil Terbaik Nilai 100)
        Story(
            id = "story_the_best_car",
            titleHanzi = "满分的车",
            titlePinyin = "Mǎnfēn de Chē",
            titleTranslation = "The Best Car (Mobil Bernilai Seratus)",
            level = "HSK 3",
            category = "Cerita Lucu & Anak-Anak",
            description = "Kepolosan seorang cucu perempuan saat diajak kakeknya ke pameran otomotif: ia memilih mobil nomor 100 karena mengira angka itu adalah nilai sempurna (mǎnfēn) seperti di ujian sekolah.",
            coverEmoji = "🏎️",
            coverImageRes = R.drawable.cover_story_the_best_car,
            estimatedReadMinutes = 1,
            sentences = listOf(
                Sentence(
                    id = "s_bstcar_1",
                    hanzi = "商场门前盛大举行大型名车展览，爷爷兴致勃勃地带着心爱的小孙女前来参观，五彩斑斓、各具造型的豪华跑车令人目不暇接。",
                    pinyin = "shāng chǎng mén qián shèng dà jǔ xíng dà xíng míng chē zhǎn lǎn yé ye xìng zhì bó bó de dài zhe xīn ài de xiǎo sūn nǚ qián lái cān guān wǔ cǎi bān lán gè jù zào xíng de háo huá pǎo chē lìng rén mù bù xiá jiē",
                    translation = "Di depan pusat perbelanjaan diadakan pameran otomotif mobil ternama yang megah; sang kakek dengan antusias mengajak cucu perempuan tersayangnya berkeliling, di mana aneka mobil dengan beragam ukuran dan warna memikat mata.",
                    tokens = listOf(
                        WordToken("商场", "shāng chǎng", "shopping mall", "Kosakata HSK 3: 商场 (shāng chǎng)"),
                        WordToken("车展", "chē zhǎn", "auto show / car exhibition", "Istilah pameran: 车展"),
                        WordToken("孙女", "sūn nǚ", "granddaughter", "Sebutan keluarga: 孙女"),
                        WordToken("极了", "jí le", "extremely / exceedingly", "Tata bahasa HSK 3: ...极了")
                    )
                ),
                Sentence(
                    id = "s_bstcar_2",
                    hanzi = "爷爷指着满场车队笑眯眯考问孙女全场最钟爱哪一辆，小女孩毫不犹豫地指向了编号为第100号的参展赛车。",
                    pinyin = "yé ye zhǐ zhe mǎn chǎng chē duì xiào mī mī kǎo wèn sūn nǚ quán chǎng zuì zhōng ài nǎ yī liàng xiǎo nǚ hái háo bù yóu yù de zhǐ xiàng le biān hào wèi dì yī bǎi hào de cān zhǎn sài chē",
                    translation = "Sang kakek tersenyum menanyakan kepada sang cucu mobil mana yang paling disukainya dari seluruh mobil di sana; gadis kecil itu tanpa ragu menunjuk ke arah mobil pameran bernomor 100.",
                    tokens = listOf(
                        WordToken("哪一辆", "nǎ yī liàng", "which (car)", "Kosakata HSK 2: 辆 (liàng)"),
                        WordToken("号", "hào", "number / mark", "Kosakata HSK 1: 号 (hào)"),
                        WordToken("最喜欢", "zuì xǐ huan", "favorite / like best", "Kosakata HSK 1: 喜欢 (xǐ huan)")
                    )
                ),
                Sentence(
                    id = "s_bstcar_3",
                    hanzi = "被问及心爱缘由时，孙女天真浪漫地宣称：100分代表满分无瑕，100号车肯定代表全场性能品质最拔尖的满分冠军！",
                    pinyin = "bèi wèn jí xīn ài yuán yóu shí sūn nǚ tiān zhēn làng màn de xuān chēng yī bǎi fēn dài biǎo mǎn fēn wú xiá yī bǎi hào chē kěn dìng dài biǎo quán chǎng xìng néng pǐn zhì zuì bá jiān de mǎn fēn guàn jūn",
                    translation = "Saat ditanya alasannya, sang cucu dengan polos mengumumkan: nilai 100 adalah nilai sempurna (mǎnfēn) di sekolah, jadi mobil nomor 100 pasti adalah mobil yang terbaik dan paling sempurna di dunia!",
                    tokens = listOf(
                        WordToken("为什么", "wèi shén me", "why", "Kosakata HSK 2: 为什么 (wèi shén me)"),
                        WordToken("满分", "mǎn fēn", "full marks / perfect score", "Kosakata sekolah: 满分"),
                        WordToken("肯定", "kěn dìng", "definitely / surely", "Kosakata HSK 3: 肯定 (kěn dìng)")
                    )
                )
            ),
            questions = listOf(
                StoryQuestion(
                    id = "q_bstcar_1",
                    questionText = "小孙女在一众参展车辆中毫不迟疑地挑选了哪一辆汽车作为自己的最爱？ (Mobil manakah yang dipilih gadis kecil sebagai mobil favoritnya?)",
                    options = listOf("第1号红色敞篷跑车 (Mobil sport merah nomor 1)", "编号第100号的汽车 (Mobil pameran bernomor urut 100)", "价格最便宜的小货车 (Mobil pikap termurah)", "金黄色的大巴车 (Bus besar warna emas)"),
                    correctAnswerIndex = 1,
                    explanation = "Teks menyatakan: '孙女说：我最喜欢第100号车'."
                ),
                StoryQuestion(
                    id = "q_bstcar_2",
                    questionText = "小女孩之所以断定100号车“肯定最好”的童真逻辑是什么？ (Logika polos anak-anak apa yang membuat sang cucu yakin mobil 100 adalah yang terbaik?)",
                    options = listOf("这辆车的时速能跑100公里 (Kecepatan mobil 100 km/jam)", "把车辆编号‘100’联想成了学校考试里的‘100分满分’ (Menghubungkan nomor 100 dengan nilai sempurna 100 di ujian sekolah)", "这辆车正好值100块钱 (Harganya 100 perak)", "该车由100名工程师打造 (Dibuat oleh 100 insinyur)"),
                    correctAnswerIndex = 1,
                    explanation = "Gadis cilik itu menjawab polos: '因为这辆车是满分，100分！它肯定最好的'."
                ),
                StoryQuestion(
                    id = "q_bstcar_3",
                    questionText = "在中文里，用来表示汽车、卡车等轮式交通载具的专属量词是哪一个？ (Kata penggolong satuan khusus untuk mobil dan kendaraan roda empat adalah?)",
                    options = listOf("只 (zhī - untuk hewan)", "辆 (liàng - kata penggolong kendaraan mobil/sepeda)", "张 (zhāng - untuk kertas/meja)", "把 (bǎ - untuk kursi/kunci)"),
                    correctAnswerIndex = 1,
                    explanation = "Dalam bahasa Mandarin, kata penggolong resmi untuk kendaraan beroda seperti mobil (汽车) dan sepeda (自行车) adalah '辆' (liàng)."
                )
            )
        ),

        // Cerita Mandarin Bean 248 (HSK 3): Stereotype (Menghapus Stereotip dan Prasangka)
        Story(
            id = "story_stereotype",
            titleHanzi = "消除刻板印象",
            titlePinyin = "Xiāochú Kèbǎn Yìnxiàng",
            titleTranslation = "Stereotype (Menghapus Stereotip & Prasangka Budaya)",
            level = "HSK 3",
            category = "Budaya & Wawasan Global",
            description = "Refleksi mendalam tentang prasangka orang asing terhadap Tiongkok (seperti mitos kungfu dan hewan peliharaan), pentingnya komunikasi lintas budaya, dan melihat dunia secara obyektif.",
            coverEmoji = "🌏",
            coverImageRes = R.drawable.cover_story_stereotype,
            estimatedReadMinutes = 2,
            sentences = listOf(
                Sentence(
                    id = "s_sterop_1",
                    hanzi = "许多未经实地考察的外界人士对中国与中国人常存刻板印象，例如误以为人人身手敏捷会功夫、户户蓄养国宝大熊猫等等。",
                    pinyin = "xǔ duō wèi jīng shí dì kǎo chá de wài jiè rén shì duì Zhōng guó yǔ Zhōng guó rén cháng cún kè bǎn yìn xiàng lì rú wù yǐ wéi rén rén shēn shǒu mǐn jié huì gōng fu hù hù xù yǎng guó bǎo dà xióng māo děng děng",
                    translation = "Banyak orang luar yang belum pernah berkunjung langsung sering memiliki stereotip terhadap Tiongkok; contohnya mengira setiap orang Tionghoa jago bela diri kungfu, atau di setiap rumah memelihara seekor panda raksasa.",
                    tokens = listOf(
                        WordToken("刻板印象", "kè bǎn yìn xiàng", "stereotype / preconception", "Kosakata sosiologi HSK 3"),
                        WordToken("功夫", "gōng fu", "Kung Fu martial arts", "Kosakata budaya Tionghoa"),
                        WordToken("大熊猫", "dà xióng māo", "giant panda", "Kosakata HSK 2: 熊猫"),
                        WordToken("事实", "shì shí", "fact / reality", "Kosakata HSK 3: 事实 (shì shí)")
                    )
                ),
                Sentence(
                    id = "s_sterop_2",
                    hanzi = "事实上，中国人并非全都生性内敛不苟言笑，中国学生也绝非千篇一律只专攻数学，绝大多数偏见源于缺乏客观认知。",
                    pinyin = "shì shí shàng Zhōng guó rén bìng fēi quán dōu shēng xìng nèi liǎn bù gǒu yán xiào Zhōng guó xué shēng yě jué fēi qiān piān yī lǜ zhǐ zhuān gōng shù xué jué dà duō shù piān jiàn yuán yú quē fá kè guān rèn zhī",
                    translation = "Pada kenyataannya, orang Tionghoa tidaklah pendiam dan kaku semua, murid-murid Tiongkok juga tidak melulu hanya pandai dalam bidang matematika; sebagian besar prasangka lahir akibat kurangnya pemahaman mendalam yang nyata.",
                    tokens = listOf(
                        WordToken("擅长", "shàn cháng", "good at / excel in", "Kosakata HSK 3: 擅长 (shàn cháng)"),
                        WordToken("数学", "shù xué", "mathematics", "Kosakata HSK 3: 数学 (shù xué)"),
                        WordToken("大多数", "dà duō shù", "majority / most", "Kosakata HSK 3: 大多数"),
                        WordToken("了解", "liǎo jiě", "to understand / comprehend", "Kosakata HSK 3: 了解 (liǎo jiě)")
                    )
                ),
                Sentence(
                    id = "s_sterop_3",
                    hanzi = "唯有亲自走访不同国度、深入民间坦诚交流，方能真切感知他乡生活脉搏与璀璨人文，从而消除误解、增进包容友谊。",
                    pinyin = "wéi yǒu qīn zì zǒu fǎng bù tóng guó dù shēn rù mín jiān tǎn chéng jiāo liú fāng néng zhēn qiè gǎn zhī tā xiāng shēng huó mài bǒ yǔ cuǐ càn rén wén cóng ér xiāo chú wù jiě zēng jìn bāo róng yǒu yì",
                    translation = "Hanya dengan berkunjung langsung ke berbagai negara dan berinteraksi secara terbuka dengan warganya, kita dapat benar-benar memahami cara hidup dan kebudayaan mereka, sehingga dapat melenyapkan kesalahpahaman dan merajut persahabatan sejati.",
                    tokens = listOf(
                        WordToken("国家", "guó jiā", "country / nation", "Kosakata HSK 2: 国家 (guó jiā)"),
                        WordToken("交流", "jiāo liú", "to communicate / exchange", "Kosakata HSK 3: 交流 (jiāo liú)"),
                        WordToken("文化", "wén huà", "culture", "Kosakata HSK 2: 文化 (wén huà)"),
                        WordToken("消除", "xiāo chú", "to eliminate / remove", "Kosakata HSK 3: 消除 (xiāo chú)"),
                        WordToken("误解", "wù jiě", "misunderstanding", "Kosakata HSK 3: 误解 (wù jiě)")
                    )
                )
            ),
            questions = listOf(
                StoryQuestion(
                    id = "q_sterop_1",
                    questionText = "文章列举了部分对中国缺乏了解的外界人士常有的哪种典型荒谬刻板印象？ (Stereotip klise apa yang sering dimiliki orang luar yang belum paham tentang Tiongkok?)",
                    options = listOf("误以为中国所有人都住在大帐篷里 (Mengira semua tinggal di tenda)", "误以为中国人个个都会中国功夫、每人家里都养着一只大熊猫 (Mengira semua orang Tionghoa bisa kungfu dan pelihara panda di rumah)", "误以为中国四季都在下雪 (Mengira selalu bersalju sepanjang tahun)", "误以为中国人不使用货币 (Mengira tidak memakai uang)"),
                    correctAnswerIndex = 1,
                    explanation = "Teks menyatakan: '比如，中国人都会功夫，每个人家里都有一只大熊猫... 事实上，如果你来过中国，就会发现中国并不是这样的'."
                ),
                StoryQuestion(
                    id = "q_sterop_2",
                    questionText = "造成人们对不同国家与民族产生种种刻板印象与偏见的根本根源是什么？ (Apa akar penyebab timbulnya stereotip dan prasangka antar bangsa?)",
                    options = listOf("因为地理教科书太厚 (Buku geografi terlalu tebal)", "缺乏真实深入的实地走访与人际了解 (Kurangnya pemahaman nyata dan interaksi mendalam secara langsung)", "外语太难学 (Bahasa asing terlalu sulit)", "地球面积太大 (Bumi terlalu luas)"),
                    correctAnswerIndex = 1,
                    explanation = "Teks menegaskan: '大多数人其实对中国并不了解。不仅是对中国，人们对其他国家也会有一些刻板印象'."
                ),
                StoryQuestion(
                    id = "q_sterop_3",
                    questionText = "作者给出的能够有效消除国家与文化间隔阂误解的最佳途径是什么？ (Solusi terbaik apa yang disarankan penulis untuk mengikis kesalahpahaman budaya?)",
                    options = listOf("上网与陌生网友激烈辩论 (Berdebat keras di internet)", "多和不同国家的人真诚交流，亲自走出国门去实地看看，感知真实文化 (Banyak berinteraksi tulus dengan orang dari negara lain dan berkunjung langsung)", "拒绝学习任何外国语言 (Menolak belajar bahasa asing)", "只呆在自己出生的小镇生活 (Hanya tinggal di kota kelahiran)"),
                    correctAnswerIndex = 1,
                    explanation = "Teks menyimpulkan: '我们能做的就是多和这个国家的人交流，去这个国家看看，才能真正了解他们的生活和文化，消除误解'."
                )
            )
        ),

        // Cerita Mandarin Bean 249 (HSK 3): Bargain (Kiat Praktis Menawar Harga di Pasar)
        Story(
            id = "story_bargain",
            titleHanzi = "小市场讲价实用攻略",
            titlePinyin = "Xiǎo Shìchǎng Jiǎngjià Gōnglüè",
            titleTranslation = "Bargain (Kiat Praktis Menawar Harga di Pasar)",
            level = "HSK 3",
            category = "Belanja & Bahasa Praktis",
            description = "Panduan percakapan menawar harga (*jiǎngjià*) di pasar tradisional Tiongkok: frasa ampuh minta diskon, membandingkan harga dengan toko lain, hingga taktik pelanggan setia.",
            coverEmoji = "🏷️",
            coverImageRes = R.drawable.cover_story_bargain,
            estimatedReadMinutes = 2,
            sentences = listOf(
                Sentence(
                    id = "s_bargan_1",
                    hanzi = "在传统小集市购物务必掌握讨价还价的艺术，因为档口摊主往往开价较高，若不讲价极易买贵吃亏。",
                    pinyin = "zài chuán tǒng xiǎo jí shì gòu wù wù bì zhǎng wò tǎo jià huán jià de yì shù yīn wèi dàng kǒu tān zhǔ wǎng wǎng kāi jià jiào gāo ruò bù jiǎng jià jí yì mǎi guì chī kuī",
                    translation = "Saat berbelanja di pasar tradisional, kita perlu menguasai seni tawar-menawar harga (*jiǎngjià*), sebab pemilik kios sering memasang harga awal yang cukup tinggi sehingga mudah kemahalan jika tidak menawar.",
                    tokens = listOf(
                        WordToken("市场", "shì chǎng", "market", "Kosakata HSK 3: 市场 (shì chǎng)"),
                        WordToken("讲价", "jiǎng jià", "to bargain / haggle", "Kosakata HSK 3: 讲价 (jiǎng jià)"),
                        WordToken("价格", "jià gé", "price", "Kosakata HSK 3: 价格 (jià gé)"),
                        WordToken("便宜", "pián yi", "cheap", "Kosakata HSK 2: 便宜 (pián yi)")
                    )
                ),
                Sentence(
                    id = "s_bargan_2",
                    hanzi = "经典实用的讲价句式包括：“卖得太贵了！再便宜一点”、“一百块我就买”、“如果多买一些有折扣吗？”等等。",
                    pinyin = "jīng diǎn shí yòng de jiǎng jià jù shì bāo kuò mài de tài guì le zài pián yi yī diǎn yī bǎi kuài wǒ jiù mǎi rú guǒ duō mǎi yī xiē yǒu zhé kòu ma děng děng",
                    translation = "Ungkapan menawar yang sangat praktis antara lain: 'Kemahalan nih, murahin dikit lagi dong!', 'Seratus kuai langsung kubeli deh', 'Kalau ambil banyak ada diskon potongan harga nggak?' dan seterusnya.",
                    tokens = listOf(
                        WordToken("块", "kuài", "kuai / yuan (colloquial)", "Kosakata HSK 1: 块 (kuài)"),
                        WordToken("考虑", "kǎo lǜ", "to consider", "Kosakata HSK 3: 考虑 (kǎo lǜ)"),
                        WordToken("折扣", "zhé kòu", "discount / rebate", "Kosakata HSK 3: 折扣 (zhé kòu)")
                    )
                ),
                Sentence(
                    id = "s_bargan_3",
                    hanzi = "此外还可运用诚意策略：“老板，我第一次来买，你给个诚心价，货好我下次一定常来并介绍朋友”，往往能如愿斩获公道实惠价。",
                    pinyin = "cǐ wài hái kě yùn yòng chéng yì cè lüè lǎo bǎn wǒ dì yī cì lái mǎi nǐ gěi gè chéng xīn jià huò hǎo wǒ xià cì yī dìng cháng lái bìng jiè shào péng you wǎng wǎng néng rú yuàn zhǎn huò gōng dao shí huì jià",
                    translation = "Selain itu bisa menggunakan taktik ketulusan: 'Bos, ini pertama kali saya beli di toko Anda, tolong beri harga bersahabat; kalau barangnya bagus, lain kali saya pasti langganan dan ajak teman-teman ke sini', cara ini kerap berhasil mendapatkan harga yang hemat.",
                    tokens = listOf(
                        WordToken("介绍", "jiè shào", "to introduce / recommend", "Kosakata HSK 2: 介绍 (jiè shào)"),
                        WordToken("诚心", "chéng xīn", "sincerity / wholehearted", "Kosakata HSK 3: 诚心"),
                        WordToken("老板", "lǎo bǎn", "shop owner / boss", "Kosakata HSK 2: 老板 (lǎo bǎn)")
                    )
                )
            ),
            questions = listOf(
                StoryQuestion(
                    id = "q_bargan_1",
                    questionText = "在中国的传统集市或小摊档口购物时，顾客通常为什么最好要学会“讲价”？ (Mengapa saat belanja di pasar tradisional sebaiknya kita bisa menawar harga?)",
                    options = listOf("这是法律强制要求的仪式 (Prosedur hukum wajib)", "商家开出的初始标价往往偏高留有水分，不砍价容易多花冤枉钱 (Harga awal penjual sering dipatok tinggi, tak menawar membuat dompet boros)", "摊主会惩罚不讲价的人 (Penjual marah jika tidak ditawar)", "不讲价无法取得收据 (Tidak dapat kuitansi)"),
                    correctAnswerIndex = 1,
                    explanation = "Teks menyatakan: '商店老板给你的价格可能会比较高，容易买得贵。今天我就来告诉你怎么讲价'."
                ),
                StoryQuestion(
                    id = "q_bargan_2",
                    questionText = "当顾客打算一次性购买较多件商品时，最地道得体的询问优惠短语是哪一句？ (Frasa paling tepat untuk menanyakan potongan harga saat membeli banyak barang?)",
                    options = listOf("你这里的破烂别卖了 (Barang jelek jangan dijual)", "“如果多买一些，有折扣吗？” ('Kalau beli lebih banyak, apakah ada diskon potongan?')", "能不能把所有的货白送我？ (Bisa gratiskan semua barang?)", "你这价格真丢人 (Harganya bikin malu)"),
                    correctAnswerIndex = 1,
                    explanation = "Teks mencantumkan kalimat ampuh: '如果多买一些，有折扣吗？'."
                ),
                StoryQuestion(
                    id = "q_bargan_3",
                    questionText = "运用“我是诚心买的，如果满意下次多带朋友来”这一沟通技巧主要是向店主传达什么？ (Pesan apa yang disampaikan saat berjanji akan mengajak kawan jika diberi harga bagus?)",
                    options = listOf("威胁要带人来闹事 (Mengancam penjual)", "以长期回购的潜在客流信任，换取商家当下的合理优惠让利 (Menunjukkan komitmen menjadi pelanggan setia demi mendapat harga pantas)", "要求老板退还一半货款 (Minta uang kembali separuh)", "索要免费高档赠品 (Minta bonus gratis)"),
                    correctAnswerIndex = 1,
                    explanation = "Teks menuliskan: '老板，我诚心买你的东西，你也诚心给个价。如果东西好，下次还来，也会介绍朋友来'."
                )
            )
        ),

        // Cerita Mandarin Bean 250 (HSK 3): The Last Birthday (Hari Ulang Tahun Terakhir)
        Story(
            id = "story_the_last_birthday",
            titleHanzi = "最后一个生日",
            titlePinyin = "Zuìhòu de Shēngrì",
            titleTranslation = "The Last Birthday (Ulang Tahun Terakhir yang Bikin Salah Paham)",
            level = "HSK 3",
            category = "Cerita Lucu & Humor",
            description = "Kesalahpahaman menggelikan saat pengantar bunga menyampaikan selamat 'ulang tahun terakhir' dengan wajah berduka, padahal sang penerima hanya berniat berhenti merayakan ulang tahun.",
            coverEmoji = "💐",
            coverImageRes = R.drawable.cover_story_the_last_birthday,
            estimatedReadMinutes = 2,
            sentences = listOf(
                Sentence(
                    id = "s_lstbth_1",
                    hanzi = "今日寿辰，送花店员登门呈上鲜花时神色凝重悲戚，满怀哀伤叹道：“祝您生日快乐，感到非常遗憾，愿您剩下的日子充满快乐。”",
                    pinyin = "jīn rì shòu chén sòng huā diàn yuán dēng mén chéng shàng xiān huā shí shén sè níng zhòng bēi qī mǎn huái āi shāng tàn dào zhù nín shēng rì kuài lè gǎn dào fēi cháng yí hàn yuàn nín shèng xià de rì zi chōng mǎn kuài lè",
                    translation = "Di hari ulang tahunku, staf toko bunga mengantarkan karangan bunga dengan raut wajah sangat sedih dan berduka, sambil mendesah berucap: 'Selamat ulang tahun untuk Anda, kami sangat berduka dan menyayangkan kondisi ini, semoga sisa hari-hari Anda dipenuhi kebahagiaan.'",
                    tokens = listOf(
                        WordToken("难过", "nán guò", "sad / sorrowful", "Kosakata HSK 3: 难过 (nán guò)"),
                        WordToken("遗憾", "yí hàn", "regret / pity", "Kosakata HSK 3: 遗憾 (yí hàn)"),
                        WordToken("剩下", "shèng xià", "remaining / left over", "Kosakata HSK 3: 剩下 (shèng xià)"),
                        WordToken("日子", "rì zi", "days / life", "Kosakata HSK 3: 日子 (rì zi)")
                    )
                ),
                Sentence(
                    id = "s_lstbth_2",
                    hanzi = "我满头雾水拆开花束里的贺卡，上面赫然写着同伴们的亲笔字迹：“祝我们最亲爱的朋友最后一个生日快乐！”",
                    pinyin = "wǒ mǎn tóu wù shuǐ chāi kāi huā shù lǐ de hè kǎ shàng miàn hè rán xiě zhe tóng bàn men de qīn bǐ zì jì zhù wǒ men zuì qīn ài de péng you zuì hòu de shēng rì kuài lè",
                    translation = "Aku merasa sangat bingung dan heran; seusai menerima bunga aku membuka kartu ucapan di dalamnya, yang ternyata bertuliskan pesan dari para sahabat: 'Selamat ulang tahun yang terakhir untuk sahabat kami yang paling tercinta!'",
                    tokens = listOf(
                        WordToken("奇怪", "qí guài", "strange / puzzled", "Kosakata HSK 3: 奇怪 (qí guài)"),
                        WordToken("卡片", "kǎ piàn", "card", "Kosakata HSK 3: 卡片 (kǎ piàn)"),
                        WordToken("亲爱", "qīn ài", "dear / beloved", "Kosakata HSK 3: 亲爱 (qīn ài)"),
                        WordToken("最后", "zuì hòu", "final / last", "Kosakata HSK 3: 最后 (zuì hòu)")
                    )
                ),
                Sentence(
                    id = "s_lstbth_3",
                    hanzi = "我猛然忆起一周前曾昭告诸友：自今年起自己将永不庆生亦不再收礼，店员显然将卡片上的“最后的生日”严重误解成了身患绝症的时日无多。",
                    pinyin = "wǒ měng rán yì qǐ yī zhōu qián céng zhāo gào zhū yǒu zì jīn nián qǐ zì jǐ jiāng yǒng bù qìng shēng yì bù zài shōu lǐ diàn yuán xiǎn rán jiāng kǎ piàn shàng de zuì hòu de shēng rì yán zhòng wù jiě chéng le shēn huàn jué zhèng de shí rì wú duō",
                    translation = "Aku baru teringat, seminggu yang lalu aku pernah memberi tahu teman-teman bahwa mulai tahun ini aku tidak akan merayakan ulang tahun lagi dan tak perlu kado; pengantar bunga itu rupanya salah paham mengira ucapan 'ulang tahun terakhir' bermakna aku sakit parah dan hidupku tak lama lagi!",
                    tokens = listOf(
                        WordToken("想起来", "xiǎng qǐ lái", "to remember / recall", "Kosakata HSK 3: 起来"),
                        WordToken("以前", "yǐ qián", "ago / previously", "Kosakata HSK 2: 以前 (yǐ qián)"),
                        WordToken("不再", "bù zài", "no longer", "Kosakata HSK 3: 不再 (bù zài)"),
                        WordToken("庆祝", "qìng zhù", "to celebrate", "Kosakata HSK 3: 庆祝 (qìng zhù)")
                    )
                )
            ),
            questions = listOf(
                StoryQuestion(
                    id = "q_lstbth_1",
                    questionText = "送花人员在将生日鲜花递给寿星时，为什么会表现出极度悲伤难过的异常反应？ (Mengapa petugas pengantar bunga menunjukkan ekspresi amat sedih dan berduka?)",
                    options = listOf("自己被花刺扎伤了手指 (Jarinya tertusuk duri)", "看到卡片写着“最后的生日”，误以为寿星身患绝症大限将至、时日无多 (Melihat kartu bertuliskan 'ulang tahun terakhir', mengira penerima sakit parah dan ajal sudah dekat)", "客户拒绝支付配送费 (Pelanggan menolak bayar ongkir)", "自己在半路上弄丢了钱包 (Dompetnya hilang di jalan)"),
                    correctAnswerIndex = 1,
                    explanation = "Teks menjelaskan: Pengantar bunga salah mengira arti tulisan '最后的生日' (ulang tahun terakhir) dan berujar: '感到很遗憾，希望你剩下的日子都开心'."
                ),
                StoryQuestion(
                    id = "q_lstbth_2",
                    questionText = "朋友们之所以在贺卡上题写“祝最后一个生日快乐”的真正事实原因是什么？ (Apa alasan sesungguhnya mengapa teman-temannya menulis 'ulang tahun terakhir'?)",
                    options = listOf("朋友们打算与主角彻底断绝往来 (Teman-temannya mau putus hubungan)", "主角一周前曾明确宣布从今年起自己不再过生日、也不再收礼物 (Seminggu lalu tokoh utama mengumumkan mulai tahun ini ia tidak mau merayakan ultah dan menerima kado lagi)", "主角马上要移居外星球 (Mau pindah planet)", "大家共同凑钱买的最后一次聚会 (Pertemuan terakhir patungan)"),
                    correctAnswerIndex = 1,
                    explanation = "Teks menyatakan: '我一个星期以前告诉朋友们，从今年开始我不再庆祝生日了，大家以后也不要送我礼物了'."
                ),
                StoryQuestion(
                    id = "q_lstbth_3",
                    questionText = "这则故事中的幽默荒诞笑点源于汉语词汇在什么层面的误读？ (Kejenakaan cerita ini bersumber dari salah tafsir kata apa?)",
                    options = listOf("送花人把客户的名字念错了 (Salah sebut nama pelanggan)", "将主观选择“最后一次搞庆生仪式”的“最后”，悲情误读成了生命终点的“最后” (Menafsirkan 'terakhir merayakan ultah' menjadi 'hari-hari terakhir menjelang ajal')", "花朵的数量少了一朵 (Jumlah tangkai bunga kurang)", "卡片写成了结婚祝词 (Kartu ucapan tertukar ucapan nikah)"),
                    correctAnswerIndex = 1,
                    explanation = "Kata '最后' (zuìhòu - terakhir) yang dimaksud teman-temannya adalah momen penutup tradisi merayakan ulang tahun, namun disalahartikan toko bunga sebagai akhir hidup."
                )
            )
        ),

        // Cerita Mandarin Bean 251 (HSK 3): Count Numbers (Berhitung Sampai Seratus)
        Story(
            id = "story_count_numbers",
            titleHanzi = "数数与着火",
            titlePinyin = "Shǔshù yǔ Zháohuǒ",
            titleTranslation = "Count Numbers (Berhitung Seratus & Baju Terbakar)",
            level = "HSK 3",
            category = "Cerita Lucu & Sekolah",
            description = "Guru mengajarkan murid untuk selalu berpikir sebelum berbicara dengan berhitung 1 sampai 100 untuk hal sangat penting; ketika jubah guru terjilat api, murid pun taat berhitung sampai 100.",
            coverEmoji = "🔥",
            coverImageRes = R.drawable.cover_story_count_numbers,
            estimatedReadMinutes = 1,
            sentences = listOf(
                Sentence(
                    id = "s_cntnum_1",
                    hanzi = "老师谆谆告诫学生发言前务必三思而行：凡遇重要事项须在心底自一默数至五十，若逢极端重要大事则须数满一百方可启齿。",
                    pinyin = "lǎo shī zhūn zhūn gào jiè xué shēng fā yán qián wù bì sān sī ér xíng fán yù zhòng yào shì xiàng xū zài xīn dǐ zì yī mò shǔ zhì wǔ shí ruò féng jí duān zhòng yào dà shì zé xū shǔ mǎn yī bǎi fāng kě qǐ chǐ",
                    translation = "Guru menasihati murid-muridnya agar selalu berpikir matang sebelum berbicara: jika hendak menyampaikan hal penting harus berhitung dari 1 sampai 50 di dalam hati, dan jika perkaranya luar biasa penting wajib berhitung hingga 100 baru boleh bicara.",
                    tokens = listOf(
                        WordToken("思考", "sī kǎo", "to ponder / think deeply", "Kosakata HSK 3: 思考 (sī kǎo)"),
                        WordToken("数数", "shǔ shù", "to count numbers", "Kosakata HSK 3: 数 (shǔ)"),
                        WordToken("重要", "zhòng yào", "important", "Kosakata HSK 2: 重要 (zhòng yào)"),
                        WordToken("事情", "shì qing", "matter / affair", "Kosakata HSK 2: 事情 (shì qing)")
                    )
                ),
                Sentence(
                    id = "s_cntnum_2",
                    hanzi = "一日先生倚立教室火炉旁讲课，忽见全班幼童神情紧绷、嘴唇翻飞以极快语速默契计数，场面甚是奇异。",
                    pinyin = "yī rì xiān sheng yǐ lì jiào shì huǒ lú páng jiǎng kè hū jiàn quán bān yòu tóng shén qíng jǐn bēng zuǐ chún fān fēi yǐ jí kuài yǔ sù mò qì jì shù chǎng miàn shèn shì qí yì",
                    translation = "Suatu hari sang guru berdiri mengajar di dekat tungku api pemanas ruangan; ia heran melihat seisi kelas anak-anak dengan wajah tegang kompak berhitung dengan kecepatan sangat tinggi.",
                    tokens = listOf(
                        WordToken("火炉", "huǒ lú", "stove / heating stove", "Benda perapian"),
                        WordToken("旁边", "páng biān", "next to / side", "Kosakata HSK 2: 旁边 (páng biān)"),
                        WordToken("快", "kuài", "fast / quickly", "Kosakata HSK 2: 快 (kuài)")
                    )
                ),
                Sentence(
                    id = "s_cntnum_3",
                    hanzi = "数至最后全班齐声高呼：“九十八、九十九、一百！老师，您的后背衣服着火了！”",
                    pinyin = "shǔ zhì zuì hòu quán bān qí shēng gāo hū jiǔ shí bā jiǔ shí jiǔ yī bǎi lǎo shī nǐ de yī fu zháo huǒ le",
                    translation = "Begitu hitungan mencapai akhir, seluruh murid serentak berteriak: 'Sembilan puluh delapan, sembilan puluh sembilan, seratus! Guru, baju di punggung Anda terbakar api!'",
                    tokens = listOf(
                        WordToken("喊", "hǎn", "to shout / yell", "Kosakata HSK 3: 喊 (hǎn)"),
                        WordToken("衣服", "yī fu", "clothes", "Kosakata HSK 1: 衣服 (yī fu)"),
                        WordToken("着火", "zháo huǒ", "catch fire / on fire", "Kosakata HSK 3: 着火 (zháo huǒ)")
                    )
                )
            ),
            questions = listOf(
                StoryQuestion(
                    id = "q_cntnum_1",
                    questionText = "老师为了培养学生三思而后行的沉稳习惯，规定在说出“非常重要的事情”前必须先做什么？ (Aturan apa yang dibuat guru sebelum murid menyampaikan perkara 'amat sangat penting'?)",
                    options = listOf("原地做二十个俯卧撑 (Push up 20 kali)", "在心里按照顺序从一数到一百 (Berhitung tertib di dalam hati dari 1 sampai 100)", "大声朗读一篇古文 (Membaca lantang puisi kuno)", "先举手站立十分钟 (Berdiri angkat tangan 10 menit)"),
                    correctAnswerIndex = 1,
                    explanation = "Teks menyatakan: '如果想说非常重要的事情，就先从一数到一百，再说'."
                ),
                StoryQuestion(
                    id = "q_cntnum_2",
                    questionText = "全班学生在台下神色紧张、以前所未有的极快语速拼命数数，是因为讲台前发生了什么危急险情？ (Kejadian darurat apa di depan kelas yang membuat murid-murid buru-buru berhitung kencang?)",
                    options = listOf("教室天花板漏雨 (Atap kelas bocor)", "站在火炉旁的老师后背衣服已经被炉火引燃着火了 (Pakaian guru yang berdiri dekat tungku perapian sudah terbakar api)", "窗外有一只大老虎 (Ada harimau di luar)", "下课铃声响了 (Bel pulang berbunyi)"),
                    correctAnswerIndex = 1,
                    explanation = "Murid-murid berteriak di akhir hitungan 100: '老师，你的衣服着火了！'."
                ),
                StoryQuestion(
                    id = "q_cntnum_3",
                    questionText = "这则幽默故事通过极端场景主要讽刺了怎样的僵化思维方式？ (Apa sindiran jenaka dari cerita lelucon di ruang kelas ini?)",
                    options = listOf("学生数学计算能力太差 (Murid lemah matematika)", "机械教条、不懂得在生死紧急险情下变通行动的刻板规则死板遵守 (Kepatuhan aturan kaku secara membabi-buta tanpa akal sehat saat darurat)", "火炉质量不过关 (Kualitas tungku jelek)", "教师上课不认真 (Guru tidak sungguh-sungguh)"),
                    correctAnswerIndex = 1,
                    explanation = "Cerita ini menyindir kepatuhan yang kaku dan konyol terhadap aturan formalitas tanpa fleksibilitas akal sehat saat menghadapi musibah darurat."
                )
            )
        ),

        // Cerita Mandarin Bean 252 (HSK 3): Birthday Present (Kado Ulang Tahun dan Cincin Lamaran)
        Story(
            id = "story_birthday_ring",
            titleHanzi = "生日礼物与求婚",
            titlePinyin = "Shēngrì Lǐwù yǔ Qiúhūn",
            titleTranslation = "Birthday Present (Kado Ulang Tahun & Kejutan Cincin)",
            level = "HSK 3",
            category = "Cerita Lucu & Hubungan Cinta",
            description = "Percakapan kocak sepasang kekasih: sang pria mengeluh liburan 2 bulan ke Eropa terlalu lama, namun begitu sang wanita meminta cincin nikah, ia seketika berubah pikiran ingin libur 2 bulan.",
            coverEmoji = "💍",
            coverImageRes = R.drawable.cover_story_birthday_ring,
            estimatedReadMinutes = 2,
            sentences = listOf(
                Sentence(
                    id = "s_bthrng_1",
                    hanzi = "女友迎来三十岁生日，男友苦思冥想提出皮包、新衣或豪华大餐皆被嫌弃平淡无奇。",
                    pinyin = "nǚ yǒu yíng lái sān shí suì shēng rì nán yǒu kǔ sī míng xiǎng tí chū pí bāo xīn yī huò háo huá dà cān jiē bèi xián qì píng dàn wú qí",
                    translation = "Sang kekasih menyambut ulang tahun ke-30; sang pacar memeras otak menawarkan tas kulit bermerek, setelan baju baru, atau makan malam mewah, namun semuanya ditolak karena dianggap biasa saja.",
                    tokens = listOf(
                        WordToken("礼物", "lǐ wù", "gift", "Kosakata HSK 2: 礼物 (lǐ wù)"),
                        WordToken("皮包", "pí bāo", "leather bag / handbag", "Barang fashion"),
                        WordToken("感兴趣", "gǎn xìng qù", "interested in", "Kosakata HSK 3: 感兴趣"),
                        WordToken("豪华", "háo huá", "luxurious", "Kosakata HSK 3: 豪华 (háo huá)")
                    )
                ),
                Sentence(
                    id = "s_bthrng_2",
                    hanzi = "女友转而提议两人同赴欧洲深度旅游两个月，男友连连摇头叫苦不迭：时间太久工作绝不允许，换作其他礼物哪怕再贵都给买。",
                    pinyin = "nǚ yǒu zhuǎn ér tí yì liǎng rén tóng fù Ōu zhōu shēn dù lǚ yóu liǎng gè yuè nán yǒu lián lián yáo tóu jiào kǔ bù dié shí jiān tài jiǔ gōng zuò jué bù yǔn xǔ huàn zuò qí tā lǐ wù nǎ pà zài guì dōu gěi mǎi",
                    translation = "Sang kekasih lantas mengusulkan agar mereka berdua berlibur ke Eropa selama dua bulan penuh; sang pria buru-buru menolak bahwa cuti dua bulan terlalu lama dan pekerjaan tak mengizinkan, namun ia berjanji membelikan kado apa pun asalkan ganti permintaan.",
                    tokens = listOf(
                        WordToken("欧洲", "Ōu zhōu", "Europe", "Benua: 欧洲"),
                        WordToken("旅游", "lǚ yóu", "travel", "Kosakata HSK 2: 旅游 (lǚ yóu)"),
                        WordToken("肯定", "kěn dìng", "definitely / surely", "Kosakata HSK 3: 肯定 (kěn dìng)")
                    )
                ),
                Sentence(
                    id = "s_bthrng_3",
                    hanzi = "女友当即直截了当摊牌：“我要结婚戒指！你何时求婚？”吓得男友瞬间改口改主意：“我马上打电话跟公司请假两月去欧洲！”",
                    pinyin = "nǚ yǒu dāng jí zhí jié liǎo dàng tān pái wǒ yào jié hūn jiè zhi nǐ hé shí qiú hūn xià de nán yǒu shùn jiān gǎi kǒu gǎi zhǔ yi wǒ mǎ shàng dǎ diàn huà gēn gōng sī qǐng jià liǎng yuè qù Ōu zhōu",
                    translation = "Sang kekasih langsung menyodorkan permintaan sesungguhnya: 'Aku minta cincin kawin! Kapan kamu melamarku?!' Sang pria yang panik mendadak berbalik arah: 'Waduh... Aku telepon kantor sekarang juga minta cuti dua bulan liburan ke Eropa ya!'",
                    tokens = listOf(
                        WordToken("结婚戒指", "jié hūn jiè zhi", "wedding ring", "Kosakata cincin kawin"),
                        WordToken("求婚", "qiú hūn", "to propose marriage", "Kosakata HSK 3: 求婚 (qiú hūn)"),
                        WordToken("请假", "qǐng jià", "to ask for leave", "Kosakata HSK 3: 请假 (qǐng jià)")
                    )
                )
            ),
            questions = listOf(
                StoryQuestion(
                    id = "q_bthrng_1",
                    questionText = "女友最初提出长达两个月的欧洲跨国旅行时，男友以什么冠冕堂皇的理由一口回绝？ (Alasan apa yang dipakai sang pria saat awalnya menolak liburan 2 bulan ke Eropa?)",
                    options = listOf("自己没有护照签证 (Belum punya paspor)", "请假两个月时间太漫长，公司工作绝不可能批准 (Dua bulan terlalu lama dan kantor tak mungkin mengizinkan cuti)", "自己晕机严重 (Mabuk pesawat)", "欧洲天气太寒冷 (Eropa terlalu dingin)"),
                    correctAnswerIndex = 1,
                    explanation = "Pria itu mengeluh: '两个月啊？时间太长了！我肯定不行。再想想，你想要什么？我都给你买'."
                ),
                StoryQuestion(
                    id = "q_bthrng_2",
                    questionText = "女友紧接着提出的哪项终极生日礼物要求，把心存退缩的男友吓了一大跳？ (Permintaan kado pamungkas apa yang membuat sang pria seketika terperanjat?)",
                    options = listOf("一套独栋豪华别墅 (Rumah vila mewah)", "正式的结婚戒指并当场质问何时求婚 (Cincin pernikahan dan menuntut kepastian kapan dilamar)", "一辆最新款跑车 (Mobil sport terbaru)", "一只纯种名犬 (Anjing ras murni)"),
                    correctAnswerIndex = 1,
                    explanation = "Sang wanita menembak langsung: '真的吗？我要结婚戒指！你什么时候跟我求婚？'."
                ),
                StoryQuestion(
                    id = "q_bthrng_3",
                    questionText = "听到“求婚与婚戒”后，男友态度发生180度滑稽大逆转的搞笑结局是什么？ (Ending kocak apa yang terjadi setelah pria itu mendengar kata cincin lamaran?)",
                    options = listOf("立刻掏出戒指下跪 (Langsung berlutut kasih cincin)", "宁愿立刻冒着丢饭碗风险去跟公司强请两个月长假去欧洲，也不敢面对结婚承诺 (Lebih memilih buru-buru cuti 2 bulan ke Eropa daripada harus berkomitmen menikah)", "当场假装昏倒 (Pura-pura pingsan)", "转头夺门而逃 (Kabur keluar rumah)"),
                    correctAnswerIndex = 1,
                    explanation = "Pria itu panik mengalihkan pembicaraan: '哎呀，这个……我现在就打电话问问公司，可能我可以请假两个月去欧洲呢！'."
                )
            )
        ),

        // Cerita Mandarin Bean 253 (HSK 3): Go Dutch (Budaya Bayar Makan di Tiongkok)
        Story(
            id = "story_go_dutch",
            titleHanzi = "请客与AA制",
            titlePinyin = "Qǐngkè yǔ AA Zhì",
            titleTranslation = "Go Dutch (Pergeseran Budaya: Traktir vs AA制)",
            level = "HSK 3",
            category = "Budaya Makan & Sosiologi",
            description = "Menelaah tradisi menjamu makan di Tiongkok: dari budaya saling mentraktir bergantian demi menjaga gengsi dan keakraban, hingga pergeseran ke sistem patungan 'AA制' yang kian diminati anak muda.",
            coverEmoji = "🥢",
            coverImageRes = R.drawable.cover_story_go_dutch,
            estimatedReadMinutes = 2,
            sentences = listOf(
                Sentence(
                    id = "s_godtch_1",
                    hanzi = "在传统中国社交聚餐文化中，结账买单向来习惯由其中一人全额包揽，讲究你来我往、轮流做东请客以示深厚交情。",
                    pinyin = "zài chuán tǒng Zhōng guó shè jiāo jù cān wén huà zhōng jié zhàng mǎi dān xiàng lái xí guàn yóu qí zhōng yī rén quán é bāo lǎn jiǎng jiu nǐ lái wǒ wǎng lún liú zuò dōng qǐng kè yǐ shì shēn hòu jiāo qing",
                    translation = "Dalam etika sosial makan bersama di Tiongkok tradisional, tagihan biasanya dibayar lunas oleh satu orang saja, dengan prinsip bergantian mentraktir di lain waktu untuk mempererat tali persahabatan.",
                    tokens = listOf(
                        WordToken("中国", "Zhōng guó", "China", "Kosakata HSK 1: 中国 (Zhōng guó)"),
                        WordToken("吃饭", "chī fàn", "to eat a meal", "Kosakata HSK 1: 吃饭 (chī fàn)"),
                        WordToken("请客", "qǐng kè", "to treat (pay for others)", "Kosakata HSK 3: 请客 (qǐng kè)"),
                        WordToken("习惯", "xí guàn", "accustomed / habit", "Kosakata HSK 3: 习惯 (xí guàn)")
                    )
                ),
                Sentence(
                    id = "s_godtch_2",
                    hanzi = "然而在现代大都市里，年轻群体聚餐越发崇尚“AA制”各付己资，既轻松平等又免去繁重的人情心理包袱，广受都市白领推崇。",
                    pinyin = "rán ér zài xiàn dài dà dū shì lǐ nián qīng qún tǐ jù cān yuè fā chóng shàng AA zhì gè fù jǐ zī jì qīng sōng píng děng yòu miǎn qù fán zhòng de rén qíng xīn lǐ bāo fu guǎng shòu dū shì bái lǐng tuī chóng",
                    translation = "Namun di kota-kota metropolitan modern, generasi muda semakin menggandrungi sistem patungan 'AA制' di mana masing-masing membayar porsinya sendiri; sistem ini terasa adil dan membebaskan dari beban utang budi sosial.",
                    tokens = listOf(
                        WordToken("大城市", "dà chéng shì", "metropolis / big city", "Kosakata HSK 2: 城市"),
                        WordToken("AA制", "AA zhì", "splitting the bill / go Dutch", "Istilah sosial Tiongkok"),
                        WordToken("欢迎", "huān yíng", "welcome / popular", "Kosakata HSK 1: 欢迎 (huān yíng)"),
                        WordToken("压力", "yā lì", "pressure / burden", "Kosakata HSK 3: 压力 (yā lì)")
                    )
                ),
                Sentence(
                    id = "s_godtch_3",
                    hanzi = "尽管如此，许多恪守传统礼仪的长辈与部分友人仍旧难以适应平摊做法，展现出中国当代人际交往中新旧观念的有趣交融。",
                    pinyin = "jǐn guǎn rú cǐ xǔ duō kè shǒu chuán tǒng lǐ yí de zhǎng bèi yǔ bù fèn yǒu rén réng jiù nán yǐ shì yìng píng tān zuò fǎ zhǎn xiàn chū Zhōng guó dāng dài rén jì jiāo wǎng zhōng xīn jiù guān niàn de yǒu qù jiāo róng",
                    translation = "Meski demikian, banyak kalangan generasi tua yang menjunjung tinggi adat kesantunan tradisional masih merasa canggung dengan sistem bagi rata ini, memperlihatkan perpaduan menarik antara norma klasik dan gaya hidup modern.",
                    tokens = listOf(
                        WordToken("做法", "zuò fǎ", "way of doing things / practice", "Kosakata HSK 3: 做法 (zuò fǎ)"),
                        WordToken("传统", "chuán tǒng", "tradition", "Kosakata HSK 3: 传统 (chuán tǒng)")
                    )
                )
            ),
            questions = listOf(
                StoryQuestion(
                    id = "q_godtch_1",
                    questionText = "按照中国较为传统的民间社交待客习惯，朋友一同聚餐时通常采用怎样的买单方式？ (Dalam kebiasaan jamuan sosial tradisional di Tiongkok, bagaimana biasanya cara membayar makan?)",
                    options = listOf("每个人自备干粮进餐馆 (Bawa bekal makanan sendiri ke resto)", "由其中一人全额请客买单，下次聚会再由其他人轮流回请 (Dibayar lunas oleh salah satu orang, lalu bergantian di pertemuan berikutnya)", "用餐结束后洗碗抵账 (Cuci piring sebagai ganti bayar)", "完全由年纪最长者强行摊派 (Dipaksa dibayar yang paling tua)"),
                    correctAnswerIndex = 1,
                    explanation = "Teks menyatakan: '中国人一起吃饭的时候，一般都是一个人付钱。这次这个人请客，下次另一个人请客'."
                ),
                StoryQuestion(
                    id = "q_godtch_2",
                    questionText = "现代大都市的年轻人之所以越来越喜爱并推崇“AA制”就餐模式，核心原因是什么？ (Alasan utama anak muda kota besar kian menggemari sistem AA制 adalah apa?)",
                    options = listOf("因为大家都没有智能手机 (Karena tidak punya ponsel)", "大家各自承担自己的消费，经济人情负担小、相处轻松自在 (Beban finansial dan utang budi ringan, hubungan terasa lebih santai tanpa gengsi)", "餐馆严禁单人结账 (Restoran melarang satu orang bayar)", "国家法律规定必须平摊 (Peraturan hukum negara)"),
                    correctAnswerIndex = 1,
                    explanation = "Teks menjelaskan: '这样做很受年轻人欢迎，因为压力不大' (Sistem ini sangat digemari anak muda karena tidak menimbulkan tekanan beban pikiran)."
                ),
                StoryQuestion(
                    id = "q_godtch_3",
                    questionText = "对于年轻人推崇的“AA制”做法，社会上其他人尤其是老一辈群体普遍持有怎样的心理接受度？ (Bagaimana penerimaan masyarakat luas terutama generasi yang lebih tua terhadap sistem AA制?)",
                    options = listOf("所有人从第一天起就完全赞同 (Semua orang langsung setuju)", "仍有很多注重传统礼数和人情往来的人并不太习惯这种做法 (Masih banyak orang terbiasa tradisi lama yang merasa canggung dan belum terbiasa)", "老年人比年轻人更热爱AA制 (Orang tua lebih suka AA dibanding pemuda)", "所有的中餐馆都全面取缔了AA制 (Semua resto melarang AA)"),
                    correctAnswerIndex = 1,
                    explanation = "Teks mencatat: '但也还是有很多人不习惯这样的做法' (Namun masih ada banyak orang yang belum terbiasa dengan cara seperti ini)."
                )
            )
        )
    )
}
