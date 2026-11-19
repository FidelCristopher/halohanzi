package com.example.chineselearning.data.repository

import com.example.chineselearning.R
import com.example.chineselearning.data.model.Sentence
import com.example.chineselearning.data.model.Story
import com.example.chineselearning.data.model.StoryQuestion
import com.example.chineselearning.data.model.WordToken

val mandarinBeanStoriesPart30: List<Story> by lazy {
    listOf(
        // Cerita Mandarin Bean 314 (HSK 3): Today Is the Festival of Father and Daughter (Hari Perempuan atau Hari Ayah dan Anak?)
        Story(
            id = "story_father_daughter_day",
            titleHanzi = "今天是我们的“父女节”",
            titlePinyin = "Jīntiān Shì Wǒmen de Fùnǚjié",
            titleTranslation = "Today Is Father-Daughter Day (Lelucon Hari Perempuan)",
            level = "HSK 3",
            category = "Keluarga & Cerita Lucu",
            description = "Kepolosan anak perempuan 6 tahun di Hari Perempuan Sedunia (3 Maret / Fùnǚjié): ia mengira itu adalah singkatan Hari Ayah dan Anak Perempuan (Fù-Nǚ), lalu menyuruh ibunya yang memasak makan malam.",
            coverEmoji = "👧",
            coverImageRes = R.drawable.cover_story_father_daughter_day,
            estimatedReadMinutes = 1,
            sentences = listOf(
                Sentence(
                    id = "s_ftdgt_1",
                    hanzi = "三月八日国际妇女节傍晚，六岁幼女小小与父亲手牵手依偎在客厅沙发上优哉游哉收看电视节目。",
                    pinyin = "sān yuè bā rì guó jì fù nǚ jié bàng wǎn liù suì yòu nǚ Xiǎo xiǎo yǔ fù qīn shǒu qiān shǒu yī wēi zài kè tīng shā fā shàng yōu zāi yóu zāi shōu kàn diàn shì jié mù",
                    translation = "Pada malam Hari Perempuan Internasional 8 Maret, gadis kecil berusia 6 tahun bernama Xiaoxiao menggandeng tangan ayahnya duduk santai di sofa ruang tamu menonton televisi.",
                    tokens = listOf(
                        WordToken("妇女节", "Fù nǚ jié", "Women's Day (March 8th)", "Hari Perempuan Sedunia"),
                        WordToken("女儿", "nǚ ér", "daughter", "Kosakata HSK 1: 女儿 (nǚ ér)"),
                        WordToken("沙发", "shā fā", "sofa", "Kosakata perabot HSK 3"),
                        WordToken("电视", "diàn shì", "television", "Kosakata HSK 1: 电视 (diàn shì)")
                    )
                ),
                Sentence(
                    id = "s_ftdgt_2",
                    hanzi = "母亲买菜风尘仆仆推门归家，小小认真劝告母亲今晚下厨操劳，以便平日包揽厨务的父亲与自己尽情享用节日天伦之乐。",
                    pinyin = "mǔ qīn mǎi cài fēng chén pú pú tuī mén guī jiā Xiǎo xiǎo rèn zhēn quàn gào mǔ qīn jīn wǎn xià chú cāo láo yǐ biàn píng shí bāo lǎn chú wù de fù qīn yǔ zì jǐ jìn qíng xiǎng yòng jié rì tiān lún zhī lè",
                    translation = "Sang ibu pulang sehabis membeli bahan makanan; Xiaoxiao dengan wajah bersungguh-sungguh menyuruh ibunya memasak malam ini, agar ayah yang biasanya selalu memasak bisa bersantai menikmati hari raya bersamanya.",
                    tokens = listOf(
                        WordToken("做饭", "zuò fàn", "to cook a meal", "Kosakata HSK 2: 做饭 (zuò fàn)"),
                        WordToken("平时", "píng shí", "ordinarily / in normal times", "Kosakata HSK 3: 平时 (píng shí)"),
                        WordToken("享受", "xiǎng shòu", "to enjoy", "Kosakata HSK 3: 享受 (xiǎng shòu)"),
                        WordToken("节日", "jié rì", "festival / holiday", "Kosakata HSK 2: 节日 (jié rì)")
                    )
                ),
                Sentence(
                    id = "s_ftdgt_3",
                    hanzi = "母亲困惑探问，小姑娘振振有词认定此乃“父亲与女儿之节”（父女节），母亲失笑释疑：傻孩子，此乃全体伟大女性之妇女节！",
                    pinyin = "mǔ qīn kùn huò tàn wèn xiǎo gū niang zhèn zhèn yǒu cí rèn dìng cǐ nǎi fù qīn yǔ nǚ ér zhī jié fù nǚ jié mǔ qīn shī xiào shì yí shǎ hái zi cǐ nǎi quán tǐ wěi dà nǚ xìng zhī fù nǚ jié",
                    translation = "Sang ibu heran bertanya; gadis cilik itu dengan yakin berpendapat hari ini adalah 'Hari Ayah dan Anak Perempuan' (Fù-Nǚ Jié); sang ibu pun tertawa geli meluruskan: 'Anak pintar, ini Hari Perempuan Sedunia, hari raya bagi kaum wanita!'.",
                    tokens = listOf(
                        WordToken("奇怪", "qí guài", "strange / surprised", "Kosakata HSK 3: 奇怪 (qí guài)"),
                        WordToken("难道", "nán dào", "could it be that", "Tata bahasa HSK 3: 难道 (nán dào)"),
                        WordToken("女人", "nǚ rén", "woman / female", "Kosakata HSK 2: 女人 (nǚ rén)")
                    )
                )
            ),
            questions = listOf(
                StoryQuestion(
                    id = "q_ftdgt_1",
                    questionText = "六岁的小女孩小小在3月8日傍晚，向买菜回家的妈妈提出了怎样让人啼笑皆非的要求？ (Permintaan lucu apa yang diajukan Xiaoxiao kepada ibunya pada sore 8 Maret?)",
                    options = listOf("让妈妈给她买一百个气球 (Minta dibelikan 100 balon)", "让妈妈今晚下厨做晚饭，好让自己和爸爸在沙发上好好享受节日 (Menyuruh ibu memasak agar ia dan ayahnya bisa bersantai menikmati hari raya)", "让全家立刻去电影院 (Minta ke bioskop)", "要求爸爸把电视关掉 (Minta TV dimatikan)"),
                    correctAnswerIndex = 1,
                    explanation = "Teks menyatakan: '小小对妈妈说：平时总是爸爸做饭，今天你做饭吧，让我和爸爸好好享受一下节日的快乐！'."
                ),
                StoryQuestion(
                    id = "q_ftdgt_2",
                    questionText = "小女孩之所以理直气壮要求妈妈做饭，是因为她把“妇女节”童真误解成了什么节日？ (Mengapa Xiaoxiao merasa berhak santai bersama ayahnya?)",
                    options = listOf("以为是国际劳动节 (Mengira Hari Buruh)", "把“妇女节”（Fùnǚjié）根据发音误解成了“爸爸和女儿共同庆祝的父女节” (Salah paham mengira Fùnǚjié adalah Hari Ayah dan Anak / Fù-Nǚ)", "以为是全家人的生日 (Mengira hari ultah)", "以为是学校儿童节 (Mengira Hari Anak)"),
                    correctAnswerIndex = 1,
                    explanation = "Teks mencatat: '小小认真地说：今天是我和爸爸的节日啊！妈妈，你难道不知道父女节吗？'."
                ),
                StoryQuestion(
                    id = "q_ftdgt_3",
                    questionText = "听完女儿童趣盎然的解释后，妈妈是如何笑着向孩子普及常识的？ (Bagaimana sang ibu menjelaskan fakta sebenarnya kepada sang anak?)",
                    options = listOf("生气地训斥女儿 (Memarahi anaknya)", "笑着纠正：今天是三八妇女节，是全世界所有伟大女人们的专属节日 (Tersenyum meluruskan: hari ini Hari Perempuan Sedunia bagi seluruh kaum wanita)", "直接摔门离去 (Banting pintu)", "答应以后天天都由妈妈做饭 (Janji masak terus)"),
                    correctAnswerIndex = 1,
                    explanation = "Teks menyimpulkan: '妈妈笑了合起来，说：傻孩子，今天妇女节，是女人们的节日！'."
                )
            )
        ),

        // Cerita Mandarin Bean 315 (HSK 3): Doctor and Fisherman (Cendekiawan dan Nelayan)
        Story(
            id = "story_doctor_and_fisherman",
            titleHanzi = "学者与智勇渔夫",
            titlePinyin = "Xuézhě yǔ Zhìyǒng Yúfū",
            titleTranslation = "Doctor and Fisherman (Kisah Cendekiawan dan Nelayan)",
            level = "HSK 3",
            category = "Filsafat & Kebijaksanaan Praktis",
            description = "Fabel terkenal tentang seorang cendekiawan bergelar doktor yang menyombongkan teori matematika, filsafat, dan sains kepada tukang perahu; saat perahu terancam badai, nelayan membalas: 'Apakah kamu bisa berenang?'.",
            coverEmoji = "🛶",
            coverImageRes = R.drawable.cover_story_doctor_and_fisherman,
            estimatedReadMinutes = 2,
            sentences = listOf(
                Sentence(
                    id = "s_dctfsh_1",
                    hanzi = "一位饱学鸿儒的博士乘舟泛湖，傲慢连番质问摇橹渔夫是否通晓高等数学、深奥哲学与现代自然科学。",
                    pinyin = "yī wèi bǎo xué hóng rú de bó shì chéng zhōu fàn hú ào màn lián fān zhì wèn yáo lǔ yú fū shì fǒu tōng xiǎo gāo děng shù xué shēn ào zhé xué yǔ xiàn dài zì rán kē xué",
                    translation = "Seorang cendekiawan bergelar doktor menaiki perahu menikmati pemandangan; dengan sombong ia berturut-turut menanyai sang pendayung apakah nelayan itu paham matematika, filsafat, dan ilmu sains.",
                    tokens = listOf(
                        WordToken("博士", "bó shì", "doctorate / scholar", "Kosakata HSK 3: 博士 (bó shì)"),
                        WordToken("欣赏", "xīn shǎng", "to appreciate / admire", "Kosakata HSK 3: 欣赏 (xīn shǎng)"),
                        WordToken("风景", "fēng jǐng", "scenery", "Kosakata HSK 3: 风景 (fēng jǐng)"),
                        WordToken("渔夫", "yú fū", "fisherman", "Profesi nelayan"),
                        WordToken("数学", "shù xué", "mathematics", "Kosakata HSK 3: 数学 (shù xué)"),
                        WordToken("哲学", "zhé xué", "philosophy", "Kosakata HSK 3: 哲学")
                    )
                ),
                Sentence(
                    id = "s_dctfsh_2",
                    hanzi = "质朴渔夫皆茫然摇头以对，自负学者遂屡屡宣判嘲弄：不谙学问，你的人生早已先后枉费折损了四分之三的光阴！",
                    pinyin = "zhì pǔ yú fū jiē máng rán yáo tóu yǐ duì zì fù xué zhě suì lǚ lǚ xuān pàn cháo nòng bù ān xué wèn nǐ de rén shēng zǎo yǐ xiān hòu wǎng fèi zhé sǔn le sì fēn zhī sān de guāng yīn",
                    translation = "Sang nelayan jujur menggelengkan kepala mengaku tidak bisa; sang sarjana yang congkak berulang kali mencibir: 'Tanpa ilmu-ilmu itu, hidupmu sudah sia-sia kehilangan tiga perempat nilainya!'.",
                    tokens = listOf(
                        WordToken("科学", "kē xué", "science", "Kosakata HSK 3: 科学 (kē xué)"),
                        WordToken("生命", "shēng mìng", "life", "Kosakata HSK 3: 生命 (shēng mìng)"),
                        WordToken("失去", "shī qù", "to lose", "Kosakata HSK 3: 失去 (shī qù)"),
                        WordToken("四分之一", "sì fēn zhī yī", "one quarter (1/4)", "Angka pecahan HSK 3")
                    )
                ),
                Sentence(
                    id = "s_dctfsh_3",
                    hanzi = "骤然狂飙突起波涛汹涌轻舟将倾，渔夫反问学者是否谙习水性，闻得“不会游泳”之绝望答复，渔夫叹道：那你的一命呜呼休矣！",
                    pinyin = "zhòu rán kuáng biāo tū qǐ bō tāo xiōng yǒng qīng zhōu jiāng qīng yú fū fǎn wèn xué zhě shì fǒu ān xí shuǐ xìng wén dé bù huì yóu yǒng zhī jué wàng dá fù yú fū tàn dào nà nǐ de shēng mìng kě néng jiù yào jié shù le",
                    translation = "Mendadak angin badai kencang menerjang dan perahu terancam terbalik; nelayan balik bertanya: 'Apakah Tuan bisa berenang?'; mendengar jawaban panik 'tidak bisa', nelayan berucap: 'Kalau begitu seluruh hidup Tuan akan segera berakhir!'.",
                    tokens = listOf(
                        WordToken("突然", "tū rán", "suddenly", "Kosakata HSK 3: 突然 (tū rán)"),
                        WordToken("大风", "dà fēng", "strong wind", "Kosakata HSK 3: 风 (fēng)"),
                        WordToken("游泳", "yóu yǒng", "to swim", "Kosakata HSK 2: 游泳 (yóu yǒng)"),
                        WordToken("结束", "jié shù", "to end / finish", "Kosakata HSK 3: 结束 (jié shù)")
                    )
                )
            ),
            questions = listOf(
                StoryQuestion(
                    id = "q_dctfsh_1",
                    questionText = "自视甚高的学者在乘舟游湖时，连续三次向划船渔夫提出了关于哪些学科知识的傲慢盘问？ (Tiga bidang ilmu apa yang ditanyakan sang sarjana kepada nelayan?)",
                    options = listOf("烹饪、织网和修船 (Memasak, merajut jaring, membetulkan perahu)", "数学、哲学以及现代自然科学 (Matematika, filsafat, dan ilmu sains)", "骑马、射箭和击剑 (Berkuda, memanah, anggar)", "诗词、书法和绘画 (Puisi, kaligrafi, melukis)"),
                    correctAnswerIndex = 1,
                    explanation = "Teks merinci tiga pertanyaan: '你会数学吗？... 你会哲学吗？... 你会科学吗？'."
                ),
                StoryQuestion(
                    id = "q_dctfsh_2",
                    questionText = "每次当目不识丁的渔夫坦言“不会”时，学者都自负地给出了怎样缺乏尊重的刻薄断语？ (Cibiran apa yang dilontarkan sarjana tiap kali nelayan menjawab tidak tahu?)",
                    options = listOf("立刻掏钱资助渔夫读书 (Memberikan beasiswa)", "声称渔夫这样的人生已经先后失去了四分之一、四分之二、四分之三 (Menyatakan hidup sang nelayan telah hilang seperempat demi seperempat nilainya)", "决定给渔夫当场讲课 (Mengajarinya langsung)", "要求渔夫立刻靠岸 (Minta perahu menepi)"),
                    correctAnswerIndex = 1,
                    explanation = "Teks menyatakan: '博士就说：那你的人生命就要失去四分之一了……那你的生命又要失去四分之一了'."
                ),
                StoryQuestion(
                    id = "q_dctfsh_3",
                    questionText = "当湖面突然狂风大作小船即将倾覆的生死危急关头，渔夫的一句什么致命反问彻底击碎了学者的理论优越感？ (Pertanyaan maut apa yang dilontarkan nelayan saat badai datang?)",
                    options = listOf("“你带雨衣了吗？” (Bawa jas hujan?)", "“你会游泳吗？（如果不会，你的全部生命可能就要结束了！）” (Apakah kamu bisa berenang? Kalau tidak, hidupmu akan berakhir!)", "“你的船票买了吗？” (Beli tiket kapal?)", "“风是从哪边吹来的？” (Dari mana angin berhembus?)"),
                    correctAnswerIndex = 1,
                    explanation = "Teks menyajikan klimaks dramatis: '渔夫问博士：你会游泳吗？博士说不会，渔夫说：那你的生命可能就要结束了！'."
                )
            )
        ),

        // Cerita Mandarin Bean 316 (HSK 3): Encouragement (Kakek Tua dan Gadis Kecil yang Bernyanyi)
        Story(
            id = "story_singing_encouragement",
            titleHanzi = "公园里的知音老人",
            titlePinyin = "Gōngyuán Lǐ de Zhīyīn Lǎorén",
            titleTranslation = "Encouragement (Kakek Penyemangat di Taman Kota)",
            level = "HSK 3",
            category = "Kebaikan & Perjalanan Hidup",
            description = "Gadis kecil ditolak dari paduan suara sekolah dan menangis di taman; seorang kakek tua yang ramah memujinya dan setia mendengarkannya bernyanyi setiap hari hingga ia tumbuh menjadi penyanyi terkenal.",
            coverEmoji = "🎶",
            coverImageRes = R.drawable.cover_story_singing_encouragement,
            estimatedReadMinutes = 2,
            sentences = listOf(
                Sentence(
                    id = "s_sngenc_1",
                    hanzi = "小女孩因资质见绌被学校合唱团拒之门外，孤单落寞躲在僻静公园角落饮泣吞声，随后情不自禁试着轻声哼唱。",
                    pinyin = "xiǎo nǚ hái yīn zī zhì jiàn chù bèi xué xiào hé chàng tuán jù zhī mén wài gū dān luò mò duǒ zài pì jìng gōng yuán jiǎo luò yǐn qì tūn shēng suí hòu qíng bù zì jìn shì zhe qīng shēng hēng chàng",
                    translation = "Seorang gadis kecil ditolak dari kelompok paduan suara sekolah dan menangis sedih sendirian di sudut taman; setelah beberapa saat ia mulai memberanikan diri bernyanyi pelan-pelan.",
                    tokens = listOf(
                        WordToken("合唱团", "hé chàng tuán", "chorus / choir", "Kelompok paduan suara"),
                        WordToken("伤心", "shāng xīn", "sad / heartbroken", "Kosakata HSK 3: 伤心 (shāng xīn)"),
                        WordToken("流泪", "liú lèi", "to shed tears / weep", "Kosakata HSK 3: 流泪"),
                        WordToken("轻轻", "qīng qīng", "gently / softly", "Kosakata HSK 3: 轻 (qīng)")
                    )
                ),
                Sentence(
                    id = "s_sngenc_2",
                    hanzi = "一位长椅老人由衷鼓掌赞叹天籁，并感谢其纯真歌声为自己带来了欢愉午后，更在此后每日准时静坐倾听相伴。",
                    pinyin = "yī wèi cháng yǐ lǎo rén yóu zhōng gǔ zhǎng zàn tàn tiān lài bìng gǎn xiè qí chún zhēn gē shēng wèi zì jǐ dài lái le huān yú wǔ hòu gèng zài cǐ hòu měi rì zhǔn shí jìng zuò qīng tīng xiāng bàn",
                    translation = "Seorang kakek tua yang ramah berseru memujinya: 'Suaramu sungguh merdu, terima kasih Nak, nyanyianmu membuat siang hariku menyenangkan'; keesokan harinya sang kakek kembali duduk di bangku taman mendengarkannya dengan penuh kasih.",
                    tokens = listOf(
                        WordToken("声音", "shēng yīn", "sound / voice", "Kosakata HSK 3: 声音 (shēng yīn)"),
                        WordToken("愉快", "yú kuài", "pleasant / happy", "Kosakata HSK 3: 愉快 (yú kuài)"),
                        WordToken("慈祥", "cí xiáng", "kind / benevolent", "Kosakata sifat HSK 3"),
                        WordToken("听", "tīng", "to listen", "Kosakata HSK 1: 听 (tīng)")
                    )
                ),
                Sentence(
                    id = "s_sngenc_3",
                    hanzi = "数十年后昔日自卑幼童蜕变为享誉四方的殿堂级歌星，当功成名就欲重访恩人致谢时，老者却已化鹤西归长眠地下。",
                    pinyin = "shù shí nián hòu xī rì zì bēi yòu tóng tuì biàn wèi xiǎng yù sì fāng de diàn táng jí gē xīng dāng gōng chéng míng jiù yù chóng fǎng ēn rén zhì xiè shí lǎo zhě què yǐ huà hè xī guī cháng mián dì xià",
                    translation = "Bertahun-tahun kemudian gadis kecil itu telah tumbuh menjadi bintang penyanyi terkenal (*gēxīng*); ketika ia ingin kembali mencari sang kakek bijak untuk berterima kasih, barulah ia mengetahui kakek tua itu telah tiada.",
                    tokens = listOf(
                        WordToken("歌星", "gē xīng", "singing star / famous singer", "Kosakata profesi seni"),
                        WordToken("记着", "jì zhe", "to remember / keep in mind", "Kosakata HSK 2: 记 (jì)"),
                        WordToken("表示", "biǎo shì", "to express", "Kosakata HSK 3: 表示 (biǎo shì)"),
                        WordToken("不在了", "bù zài le", "passed away / no longer here", "Eufemisme meninggal dunia")
                    )
                )
            ),
            questions = listOf(
                StoryQuestion(
                    id = "q_sngenc_1",
                    questionText = "小女孩最初一个人躲在公园角落里伤心流泪的失意起因是什么？ (Apa penyebab awal gadis kecil menangis sedih sendirian di taman?)",
                    options = listOf("书包和零花钱全被抢劫 (Dirampok)", "被学校合唱团的指导老师排斥拒绝在合唱团队伍之外 (Ditolak guru dari kelompok paduan suara sekolah)", "迷路找不到回家的路 (Tersesat)", "衣服被泥巴弄脏 (Baju kotor)"),
                    correctAnswerIndex = 1,
                    explanation = "Teks menyatakan: '一个小女孩被老师排除在合唱团之外，所以一个人在公园里伤心流泪'."
                ),
                StoryQuestion(
                    id = "q_sngenc_2",
                    questionText = "那位坐在长椅上的慈祥老人在听完小女孩怯生生的歌声后，给予了怎样扭转乾坤的暖心鼓舞？ (Dukungan berharga apa yang diberikan sang kakek kepada anak itu?)",
                    options = listOf("批评她唱得太跑调 (Mengkritik suaranya sumbang)", "盛赞她“唱得真好！”，真诚感谢女孩的歌声带给了自己一个极度愉快的下午，并日日前来倾听 (Memuji suaranya sangat merdu dan berterima kasih telah membahagiakan siang harinya)", "给女孩买了一台收音机 (Membelikan radio)", "劝她以后改行去画画 (Menyuruh beralih melukis)"),
                    correctAnswerIndex = 1,
                    explanation = "Teks mencatat: '“唱得真好！”这时一个声音响起来，“谢谢你，孩子，你让我度过了一个愉快的下午”'."
                ),
                StoryQuestion(
                    id = "q_sngenc_3",
                    questionText = "多年后女孩成长为万众瞩目的歌星，当她重回旧地欲登门报恩时，迎来了怎样令人感伤怀缅的结局？ (Ending mengharukan apa yang dialami sang penyanyi ketika hendak membalas budi?)",
                    options = listOf("老人成了她的经纪人 (Kakek jadi manajernya)", "得知那位曾经在至暗时刻赋予自己无限力量与信心的慈祥老人已经安详辞世不在人世了 (Mengetahui sang kakek yang menyemangatinya di masa sulit telah meninggal dunia)", "老人搬去了国外大城市 (Pindah ke luar negeri)", "发现老人是一位千万富翁 (Ternyata kakek miliarder)"),
                    correctAnswerIndex = 1,
                    explanation = "Teks menyimpulkan: '她想去找那位老人表示感谢，才晓得，老人已经不在了'."
                )
            )
        ),

        // Cerita Mandarin Bean 317 (HSK 3): Catching Thief With Wisdom (Menangkap Pencuri Kapas dengan Cerdik)
        Story(
            id = "story_catch_cotton_thief",
            titleHanzi = "智慧舞会捉拿棉花贼",
            titlePinyin = "Zhìhuì Wǔhuì Zhuōná Miánhuā Zéi",
            titleTranslation = "Catching Thief With Wisdom (Cerdik Menjebak Pencuri Kapas)",
            level = "HSK 3",
            category = "Cerita Rakyat & Kecerdikan",
            description = "Kapas milik sang petani dicuri orang; adiknya yang cerdik bernama Mike mengadakan pesta dansa dan mengumumkan pencuri hadir dengan kapas menempel di wajah; sang pencuri panik meraba mukanya dan tertangkap basah.",
            coverEmoji = "🕵️",
            coverImageRes = R.drawable.cover_story_catch_cotton_thief,
            estimatedReadMinutes = 2,
            sentences = listOf(
                Sentence(
                    id = "s_cththf_1",
                    hanzi = "农夫夜间目击黑影携大包遁入邻村，次晨发觉自家仓库棉花遭窃，急商于多谋善断的胞弟麦克。",
                    pinyin = "nóng fū yè jiān mù jī hēi yǐng xié dà bāo dùn rù lín cūn cì chén fā jué zì jiā cāng kù mián hua zāo qiè jí shāng yú duō móu shàn duàn de bāo dì Mài kè",
                    translation = "Seorang petani di malam hari melihat bayangan seseorang membawa bungkusan besar lari ke desa tetangga; keesokan harinya ia menyadari kapas miliknya telah dicuri orang, lalu segera berunding dengan adiknya yang cerdas bernama Mike.",
                    tokens = listOf(
                        WordToken("农夫", "nóng fū", "farmer / peasant", "Profesi petani"),
                        WordToken("棉花", "mián hua", "cotton", "Hasil bumi perkebunan"),
                        WordToken("聪明", "cōng míng", "clever / smart", "Kosakata HSK 2: 聪明 (cōng míng)"),
                        WordToken("商量", "shāng liang", "to discuss / consult", "Kosakata HSK 3: 商量 (shāng liang)")
                    )
                ),
                Sentence(
                    id = "s_cththf_2",
                    hanzi = "麦克略施小计盛情延请邻村全体村民欢聚舞会，席间当众朗声宣称盗贼不打自招潜入现场，且须发尚沾挂显眼棉絮白丝。",
                    pinyin = "Mài kè lüè shī xiǎo jì shèng qíng yán qǐng lín cūn quán tǐ cūn mín huān jù wǔ huì xí jiān dāng zhòng lǎng shēng xuān chēng dào zéi bù dǎ zì zhāo qián rù xiàn chǎng qiě xū fà shàng zhān guà xiǎn yǎn mián xù bái sī",
                    translation = "Mike berpikir sejenak lalu mengundang seluruh warga desa tetangga datang menghadiri pesta dansa (*wǔhuì*); di tengah pesta ia berseru: 'Pencuri kapas semalam ternyata datang ke sini, coba lihat di wajah dan rambutnya masih menempel sisa serat kapas!'.",
                    tokens = listOf(
                        WordToken("邀请", "yāo qǐng", "to invite", "Kosakata HSK 3: 邀请 (yāo qǐng)"),
                        WordToken("舞会", "wǔ huì", "dance party / ball", "Kosakata HSK 3: 舞会"),
                        WordToken("小偷", "xiǎo tōu", "thief", "Kosakata HSK 3: 小偷 (xiǎo tōu)"),
                        WordToken("头发", "tóu fa", "hair", "Kosakata HSK 2: 头发 (tóu fa)")
                    )
                ),
                Sentence(
                    id = "s_cththf_3",
                    hanzi = "做贼心虚的真正窃贼虽头面无物却下意识惊惶失措反复摩挲头面擦拭，麦克当机立断拨云见日当场人赃俱获。",
                    pinyin = "zuò zéi xīn xū de zhēn zhèng qiè zéi suī tóu miàn wú wù què xià yì shí jīng huáng shī cuò fǎn fù mó suō tóu miàn cā shì Mài kè dāng jī lì duàn bō yún jiàn rì dāng chǎng rén zāng jù huò",
                    translation = "Sang pencuri yang merasa bersalah dan ketakutan langsung secara refleks meraba-raba wajah dan rambutnya berulang kali; Mike seketika melangkah ke sampingnya dan menangkap basah pencuri kapas tersebut dengan cerdik.",
                    tokens = listOf(
                        WordToken("紧张", "jǐn zhāng", "nervous / tense", "Kosakata HSK 3: 紧张 (jǐn zhāng)"),
                        WordToken("反复", "fǎn fù", "repeatedly / over and over", "Kosakata HSK 3: 反复"),
                        WordToken("摸", "mō", "to touch / feel", "Kosakata HSK 3: 摸 (mō)"),
                        WordToken("抓住", "zhuā zhù", "to catch / seize", "Kosakata HSK 3: 抓 (zhuā)")
                    )
                )
            ),
            questions = listOf(
                StoryQuestion(
                    id = "q_cththf_1",
                    questionText = "聪明的弟弟麦克为了在茫茫人海中锁定偷走棉花的真凶，策划了怎样的巧妙引蛇出洞之计？ (Rencana cerdik apa yang dirancang Mike untuk menjebak pencuri kapas?)",
                    options = listOf("持兵器挨家挨户暴力搜查 (Menggeledah rumah warga dengan senjata)", "大办盛大热闹的村民舞会，热情把邻村的所有人都邀请过来参加 (Mengadakan pesta dansa meriah dan mengundang seluruh warga desa tetangga)", "在田野里设置巨大的捕兽夹 (Memasang perangkap hewan)", "向衙门悬赏重金通缉 (Membuat sayembara hadiah uang)"),
                    correctAnswerIndex = 1,
                    explanation = "Teks menyatakan: '麦克想了想，然后把邻村的人都邀请过来参加舞会'."
                ),
                StoryQuestion(
                    id = "q_cththf_2",
                    questionText = "在歌舞喧闹的舞会正酣时，麦克当着全体宾客的面大声喊出了哪句震撼全场的话？ (Kalimat mengejutkan apa yang diserukan Mike di depan para tamu pesta dansa?)",
                    options = listOf("“大家的衣服全都被偷了！” (Baju kalian dicuri semua!)", "“昨天偷我哥棉花的小偷今天自己来了，到现在他的脸上和头发上还沾着棉花呢！” ('Pencuri kapas semalam hadir di sini, lihatlah di wajah dan rambutnya masih menempel kapas!')", "“舞会由于停电立刻解散！” (Pesta bubar mati lampu)", "“今晚由我全额买单！” (Malam ini saya traktir)"),
                    correctAnswerIndex = 1,
                    explanation = "Teks menjelaskan: '麦克对大家说：不好意思，昨天我哥哥的棉花被偷了，而今天小偷却自己来了。你们看，到现在他的脸上和头发上还沾着棉花呢！'."
                ),
                StoryQuestion(
                    id = "q_cththf_3",
                    questionText = "麦克是如何仅凭微表情与肢体破绽，在一秒之内准确揪出真正小偷的？ (Bagaimana Mike dalam sekejap bisa memastikan siapa pencuri sesungguhnya?)",
                    options = listOf("小偷当场大声认罪求饶 (Pencuri langsung mengaku)", "小偷做贼心虚，虽无棉花却极其慌张地反复用双手去摸自己的脸颊和头发 (Pencuri yang panik dan ketakutan secara refleks meraba-raba wajah dan rambutnya berulang kali)", "小偷口袋里掉出了棉花包裹 (Kapas jatuh dari kantong)", "警犬直接咬住了小偷 (Digigit anjing pelacak)"),
                    correctAnswerIndex = 1,
                    explanation = "Teks menyimpulkan: '有一个人脸上和头发上没有沾棉花，却紧张地反复摸着他的脸和头发。麦克走到那个人旁边说：小偷就是他！'."
                )
            )
        ),

        // Cerita Mandarin Bean 318 (HSK 3): One Chance (Anak Panah Kedua yang Dibuang Guru)
        Story(
            id = "story_one_chance_arrow",
            titleHanzi = "师傅扔掉的那支箭",
            titlePinyin = "Shīfu Rēngdiào de Nà Zhī Jiàn",
            titleTranslation = "One Chance (Pelajaran Memanah: Menghargai Peluang Tunggal)",
            level = "HSK 3",
            category = "Filsafat & Konsentrasi",
            description = "Murid memanah membawa dua anak panah untuk latihan; sang guru mengambil satu dan membuangnya ke tanah seraya menasihati: jika dalam pikiran selalu ada cadangan, engkau tak akan pernah sungguh-sungguh pada kesempatan pertama.",
            coverEmoji = "🏹",
            coverImageRes = R.drawable.cover_story_one_chance_arrow,
            estimatedReadMinutes = 1,
            sentences = listOf(
                Sentence(
                    id = "s_onchnc_1",
                    hanzi = "初学射箭之徒携弓引两矢跃跃欲试，名师趋前信手抽走其第二支飞箭弃之于地，令徒弟大惑不解。",
                    pinyin = "chū xué shè jiàn zhī tú xié gōng yǐn liǎng shǐ yuè yuè yù shì míng shī qū qián xìn shǒu chōu zǒu qí dì èr zhī fēi jiàn qì zhī yú dì lìng tú dì dà huò bù jiě",
                    translation = "Seorang murid yang baru belajar memanah membawa sebuah busur dan dua bilah anak panah siap mencoba membidik; sang guru pemanah ulung melangkah mendekat, mencabut anak panah kedua lalu membuangnya ke tanah.",
                    tokens = listOf(
                        WordToken("射箭", "shè jiàn", "archery / to shoot arrows", "Keahlian memanah"),
                        WordToken("师傅", "shī fu", "master / teacher", "Kosakata HSK 3: 师傅 (shī fu)"),
                        WordToken("扔", "rēng", "to throw / toss", "Kosakata HSK 3: 扔 (rēng)"),
                        WordToken("徒弟", "tú dì", "apprentice / disciple", "Kosakata HSK 3: 徒弟")
                    )
                ),
                Sentence(
                    id = "s_onchnc_2",
                    hanzi = "面对徒弟诧异质问，师傅断言所弃实为“第一箭”，因心存退路寄望于次箭补救者，首发必敷衍难中心靶。",
                    pinyin = "miàn duì tú dì chà yì zhì wèn shī fu duàn yán suǒ qì shí wèi dì yī jiàn yīn xīn cún tuì lù jì wàng yú cì jiàn bǔ jiù zhě shǒu fā bì fū yǎn nán zhòng xīn bǎ",
                    translation = "Menghadapi pertanyaan heran muridnya, sang guru berujar bahwa yang ia buang sebenarnya adalah 'anak panah pertama', sebab pemanah yang selalu mengandalkan anak panah cadangan pasti tidak akan pernah membidik tepat sasaran pada tembakan pertamanya.",
                    tokens = listOf(
                        WordToken("惊讶", "jīng yà", "surprised / astonished", "Kosakata HSK 3: 惊讶 (jīng yà)"),
                        WordToken("反正", "fǎn zhèng", "anyway / in any case", "Kosakata HSK 3: 反正 (fǎn zhèng)"),
                        WordToken("箭靶", "jiàn bǎ", "archery target / bullseye", "Sasaran panah")
                    )
                ),
                Sentence(
                    id = "s_onchnc_3",
                    hanzi = "师傅点醒武道玄机：若临发时刻意依赖还有一次补救契机，便断难全力以赴珍惜当下机缘，破釜沉舟方能一发中的。",
                    pinyin = "shī fu diǎn xǐng wǔ dào xuán jī ruò lín fā shí kè yì yī lài hái yǒu yī cì bǔ jiù qì jī biàn duàn nán quán lì yǐ fù zhēn xī dāng xià jī yuán pò fǔ chén zhōu fāng néng yī fā zhòng dì",
                    translation = "Sang guru menasihatkan rahasia fokus sejati: jika saat melepaskan panah pikiranmu selalu mengira masih ada kesempatan kedua, kamu tidak akan pernah menghargai peluang pertamamu; hanya dengan memusatkan seluruh jiwa ragalah engkau bisa mengenai sasaran.",
                    tokens = listOf(
                        WordToken("机会", "jī huì", "chance / opportunity", "Kosakata HSK 2: 机会 (jī huì)"),
                        WordToken("珍惜", "zhēn xī", "to cherish / treasure", "Kosakata HSK 3: 珍惜"),
                        WordToken("解释", "jiě shì", "to explain", "Kosakata HSK 3: 解释 (jiě shì)")
                    )
                )
            ),
            questions = listOf(
                StoryQuestion(
                    id = "q_onchnc_1",
                    questionText = "当徒弟拿起一张弓和两支箭兴冲冲准备试射时，身旁的射箭师傅做出了什么令人意外的举动？ (Tindakan mengejutkan apa yang dilakukan sang guru saat murid memegang busur dan dua anak panah?)",
                    options = listOf("夸奖徒弟力大无穷 (Memuji kekuatan fisik murid)", "走上前去，果断拿走其中一支箭直接扔到了地上 (Maju ke depan, mengambil satu anak panah dan langsung membuangnya ke tanah)", "把徒弟的弓弦剪断 (Memotong tali busur)", "让徒弟闭上双眼射击 (Menyuruh menembak sambil tutup mata)"),
                    correctAnswerIndex = 1,
                    explanation = "Teks menyatakan: '师傅走过来，拿走一支箭扔到了地上'."
                ),
                StoryQuestion(
                    id = "q_onchnc_2",
                    questionText = "师傅宣称自己扔掉的并非第二支箭，而是“第一支箭”，这句禅机话语的深意何在？ (Apa makna mendalam ucapan guru bahwa yang ia buang adalah 'anak panah pertama'?)",
                    options = listOf("第一支箭制造工艺粗糙 (Panah pertama jelek)", "只要你脑海里惦记着“还有第二支箭可以补救”，第一支箭就必定无法全神贯注射中靶心 (Jika pikiran mengandalkan cadangan panah kedua, tembakan pertama pasti tak akan fokus mengenai sasaran)", "第二支箭涂了剧毒 (Panah kedua beracun)", "箭靶的尺寸太小 (Sasaran panah terlalu kecil)"),
                    correctAnswerIndex = 1,
                    explanation = "Teks menjelaskan: '我拿走的不是第二支箭，是第一支，反正这支箭你也射不中箭靶'."
                ),
                StoryQuestion(
                    id = "q_onchnc_3",
                    questionText = "这则寓意深刻的射箭修行故事旨在告诫我们在面对人生机遇时应当持有什么专注态度？ (Pesan moral apa yang diajarkan fabel memanah ini dalam menghadapi peluang hidup?)",
                    options = listOf("无论做什么事都要准备十种备选退路 (Harus selalu siapkan 10 jalan mundur)", "切勿抱存侥幸依赖心理，必须倾注全副身心牢牢珍惜并把握当下的每一次宝贵机会 (Jangan mengandalkan kesempatan kedua; curahkan seluruh konsentrasi menghargai peluang di depan mata)", "射箭比赛应该废除裁判 (Hapus wasit panahan)", "一次只能买一把弓 (Cuma boleh beli satu busur)"),
                    correctAnswerIndex = 1,
                    explanation = "Guru memanah menyimpulkan: '如果你射箭的时候，一直想着你还有一次机会，你就不会珍惜第一次机会，所以有没有第一支箭都一样'."
                )
            )
        ),

        // Cerita Mandarin Bean 319 (HSK 3): Smart Child (Bocah Cerdik Makan Apel Gratis)
        Story(
            id = "story_smart_kid_apple",
            titleHanzi = "白吃苹果的机灵小孩",
            titlePinyin = "Bái Chī Píngguǒ de Jīling Xiǎohái",
            titleTranslation = "Smart Child (Bocah Cerdik & Apel Gratis)",
            level = "HSK 3",
            category = "Cerita Lucu & Humor",
            description = "Nenek Wang membeli 8 apel seharga 16 yuan; penjual menagih 18 yuan karena mengira bocah yang mengambil satu apel adalah cucunya, sementara si nenek mengira bocah itu anak sang penjual.",
            coverEmoji = "🍎",
            coverImageRes = R.drawable.cover_story_smart_kid_apple,
            estimatedReadMinutes = 2,
            sentences = listOf(
                Sentence(
                    id = "s_smtchd_1",
                    hanzi = "王奶奶在路边水果摊精挑细选两元一个的红富士，一位素不相识的男童蹦跳而至盛赞苹果又大又红、催促奶奶多挑几个。",
                    pinyin = "Wáng nǎi nai zài lù biān shuǐ guǒ tān jīng tiāo xì xuǎn liǎng yuán yī gè de hóng fù shì yī wèi sù bù xiāng shí de nán tóng bèng tiào ér zhì shèng zàn píng guǒ yòu dà yòu hóng cuī cù nǎi nai duō tiāo jǐ gè",
                    translation = "Nenek Wang sedang teliti memilih apel seharga dua yuan per butir di kios buah pinggir jalan; tiba-tiba seorang anak laki-laki berlari menghampiri memuji apelnya besar dan merah serta membujuk sang nenek membeli lebih banyak.",
                    tokens = listOf(
                        WordToken("苹果", "píng guǒ", "apple", "Kosakata HSK 1: 苹果 (píng guǒ)"),
                        WordToken("随便", "suí biàn", "casually / as one pleases", "Kosakata HSK 3: 随便 (suí biàn)"),
                        WordToken("挑", "tiāo", "to pick / select", "Kosakata HSK 3: 挑 (tiāo)"),
                        WordToken("仔细", "zǐ xì", "carefully / attentively", "Kosakata HSK 3: 仔细 (zǐ xì)")
                    )
                ),
                Sentence(
                    id = "s_smtchd_2",
                    hanzi = "男童顺手抄走一个新鲜大苹果啃着溜之大吉，挑好八枚苹果的王奶奶如数递付十六元，摊主却坚索十八元声称“尊孙适才吃了一只”。",
                    pinyin = "nán tóng shùn shǒu chāo zǒu yī gè xīn xiān dà píng guǒ kěn zhe liū zhī dà jí tiāo hǎo bā méi píng guǒ de Wáng nǎi nai rú shù dì fù shí liù yuán tān zhǔ què jiān suǒ shí bā yuán shēng chēng zūn sūn shì cái chī le yī zhī",
                    translation = "Bocah itu langsung mengambil sebutir apel lalu kabur memakannya; Nenek Wang yang selesai memilih 8 apel menyerahkan uang 16 yuan pas, namun penjual menagih 18 yuan beralasan 'cucu Nenek tadi memakan satu apel'.",
                    tokens = listOf(
                        WordToken("孙子", "sūn zi", "grandson", "Sebutan keluarga: 孙子"),
                        WordToken("差", "chà", "short of / lacking", "Kosakata HSK 3: 差 (chà)"),
                        WordToken("块", "kuài", "yuan (money)", "Kosakata HSK 1: 块 (kuài)")
                    )
                ),
                Sentence(
                    id = "s_smtchd_3",
                    hanzi = "王奶奶愕然抗辩自己根本膝下无孙，面面相觑之下二人方才如梦初醒：那顽童竟巧妙利用二人互认亲属的心理盲区白吃了苹果！",
                    pinyin = "Wáng nǎi nai è rán kàng biàn zì jǐ gēn běn xī xià wú sūn miàn miàn xiāng qù zhī xià èr rén fāng cái rú mèng chū xǐng nà wán tóng jìng qiǎo miào lì yòng èr rén hù rèn qīn shǔ de xīn lǐ máng qū bái chī le píng guǒ",
                    translation = "Nenek Wang kaget berseru bahwa ia sama sekali tidak punya cucu; keduanya saling pandang tertegun dan baru tersadar: bocah asing itu secara cerdik memanfaatkan celah saling mengira untuk mendapatkan apel gratis!",
                    tokens = listOf(
                        WordToken("惊讶", "jīng yà", "surprised", "Kosakata HSK 3: 惊讶 (jīng yà)"),
                        WordToken("明白", "míng bai", "to understand / realize", "Kosakata HSK 2: 明白 (míng bai)"),
                        WordToken("儿子", "ér zi", "son", "Kosakata HSK 1: 儿子 (ér zi)")
                    )
                )
            ),
            questions = listOf(
                StoryQuestion(
                    id = "q_smtchd_1",
                    questionText = "王奶奶在路边挑了八个两元一只的新鲜苹果，如数付给摊主16元时，摊主为何坚称还差两块钱？ (Mengapa penjual menagih 18 yuan saat Nenek Wang membayar 16 yuan untuk 8 apel?)",
                    options = listOf("苹果突然临时涨价 (Harga apel naik mendadak)", "摊主误以为刚才拿走苹果吃掉的小男孩是王奶奶的亲孙子，故将那只苹果算在奶奶账上 (Penjual mengira bocah yang mengambil apel adalah cucu si nenek sehingga dimasukkan ke tagihannya)", "包装袋需要额外收费两元 (Kantung plastik bayar 2 yuan)", "摊主算术乘法算错了 (Penjual salah hitung)"),
                    correctAnswerIndex = 1,
                    explanation = "Teks menyatakan: '师傅说：不好意思，还差两块钱，刚才你孙子还吃了一个呢'."
                ),
                StoryQuestion(
                    id = "q_smtchd_2",
                    questionText = "在听到摊主索要“孙子吃的那只苹果钱”后，王奶奶给出了怎样令人瞠目结舌的真实回应？ (Jawaban mengejutkan apa yang diberikan Nenek Wang?)",
                    options = listOf("立刻替孙子道歉 (Minta maaf atas cucunya)", "声明自己根本就没有孙子，原以为那个顽皮小男孩是摊主自己的亲生儿子 (Menyatakan ia sama sekali tak punya cucu, dan semula mengira bocah itu anak kandung sang penjual)", "立刻报警抓孙子 (Telepon polisi tangkap cucu)", "多付了一百元小费 (Kasih tip 100 yuan)"),
                    correctAnswerIndex = 1,
                    explanation = "Nenek Wang kaget berseru: '王奶奶惊讶地说：我没有孙子啊……我明白了！原来那个男孩不是你儿子啊！'."
                ),
                StoryQuestion(
                    id = "q_smtchd_3",
                    questionText = "那个陌生小男孩之所以能大摇大摆在两人眼皮底下“白吃苹果”，凭借的是怎样的心理错觉陷阱？ (Trik psikologis apa yang dimanfaatkan bocah asing itu untuk makan apel gratis?)",
                    options = listOf("他使用了隐身魔法 (Sihir menghilang)", "在奶奶面前装作摊主的孩子招揽生意，在摊主面前装成奶奶的孙子撒娇拿果，巧妙利用双方的信息差 (Di depan nenek pura-pura jadi anak penjual, di depan penjual pura-pura jadi cucu si nenek)", "他手脚敏捷偷窃未被察觉 (Mencuri tanpa ketahuan)", "摊主主动赠送 (Penjual yang kasih)"),
                    correctAnswerIndex = 1,
                    explanation = "Kejenakaannya adalah sang bocah cerdik memperdaya kedua orang dewasa dengan berpura-pura menjadi keluarga satu sama lain sehingga berhasil memakan apel gratis tanpa membayar."
                )
            )
        ),

        // Cerita Mandarin Bean 320 (HSK 3): The Result of Coveting Little Advantages (Akibat Tergiur Keuntungan Kecil)
        Story(
            id = "story_covet_little_advantages",
            titleHanzi = "贪小便宜吃大亏",
            titlePinyin = "Tān Xiǎopiányi Chī Dàkuī",
            titleTranslation = "Coveting Little Advantages (Tergiur Untung Kecil Menuai Rugi Besar)",
            level = "HSK 3",
            category = "Karakter & Pelajaran Moral",
            description = "Xiao Zhang yang pelit terpaksa mentraktir Xiao Li saat gajian; ketika giliran Xiao Li membalas mentraktir, Xiao Zhang makan membabi buta agar tak rugi hingga lambungnya jebol masuk rumah sakit dengan biaya fantastis.",
            coverEmoji = "💸",
            coverImageRes = R.drawable.cover_story_covet_little_advantages,
            estimatedReadMinutes = 2,
            sentences = listOf(
                Sentence(
                    id = "s_cvtltt_1",
                    hanzi = "小张平生最嗜贪占便宜，一次领了丰厚薪水被同事小李起哄请客，心怀肉痛之余刻意约定下回小李领薪必须礼尚往来如数回请。",
                    pinyin = "Xiǎo zhāng píng shēng zuì shì tān zhàn pián yi yī cì lǐng le fēng hòu xīn shui bèi tóng shì Xiǎo lǐ qǐ hòng qǐng kè xīn huái ròu tòng zhī yú kè yì yuē dìng xià huí Xiǎo lǐ lǐng xīn bì xū lǐ shàng wǎng lái rú shù huí qǐng",
                    translation = "Xiao Zhang adalah sosok yang sangat gemar mencari keuntungan kecil (tān xiǎopiányi); suatu kali saat menerima gaji ia dipaksa mentraktir temannya Xiao Li, dengan terpaksa ia menyanggupi seraya menuntut janji giliran ditraktir balik saat Xiao Li gajian kelak.",
                    tokens = listOf(
                        WordToken("便宜", "pián yi", "small advantage / cheap", "Kosakata HSK 2: 便宜 (pián yi)"),
                        WordToken("薪水", "xīn shui", "salary / wage", "Kosakata dunia kerja: 薪水"),
                        WordToken("请客", "qǐng kè", "to treat (to a meal)", "Kosakata HSK 3: 请客 (qǐng kè)"),
                        WordToken("约定", "yuē dìng", "agreement / appointment", "Kosakata HSK 3: 约定")
                    )
                ),
                Sentence(
                    id = "s_cvtltt_2",
                    hanzi = "数周后小李如约请客做东，小张打定主意欲本利兼收吃回本钱，餐桌上如饿虎扑食疯狂暴饮暴食直至胃脘严重胀痛难当。",
                    pinyin = "shù zhōu hòu Xiǎo lǐ rú yuē qǐng kè zuò dōng Xiǎo zhāng dǎ dìng zhǔ yi yù běn lì jiān shōu chī huí běn qián cān zhuō shàng rú è hǔ pū shí fēng kuáng bào yǐn bào shí zhí zhì wèi wǎn yán zhòng zhàng tòng nán dāng",
                    translation = "Beberapa waktu kemudian Xiao Li menepati janji mentraktir makan; berniat meraup untung sebesar-besarnya agar tidak rugi, Xiao Zhang makan secara membabi buta dan rakus hingga perut lambungnya membengkak luar biasa.",
                    tokens = listOf(
                        WordToken("疯狂", "fēng kuáng", "crazy / frenzied", "Kosakata HSK 3: 疯狂"),
                        WordToken("饱", "bǎo", "full (food)", "Kosakata HSK 3: 饱 (bǎo)"),
                        WordToken("胃", "wèi", "stomach", "Organ tubuh"),
                        WordToken("撑", "chēng", "burst with full / overfilled", "Kosakata kekenyangan")
                    )
                ),
                Sentence(
                    id = "s_cvtltt_3",
                    hanzi = "当晚急性胃扩张送急诊抢救，不仅所贪微利付之东流，数倍于饭资的昂贵医药费更生动诠释了“贪小便宜吃大亏”的古训。",
                    pinyin = "dāng wǎn jí xìng wèi kuò zhāng sòng jí zhěn qiǎng jiù bù jǐn suǒ tān wēi lì fù zhī dōng liú shù bèi yú fàn zī de áng guì yī yào fèi gèng shēng dòng quán shì le tān xiǎo pián yi chī dà kuī de gǔ xùn",
                    translation = "Malam itu lambungnya bermasalah serius dan harus dilarikan ke rumah sakit; biaya perawatan medis dokter yang harus dibayarnya berlipat-lipat jauh lebih mahal daripada harga makanan traktiran, membuktikan pepatah klasik: 'tergiur keuntungan kecil menuai kerugian besar'.",
                    tokens = listOf(
                        WordToken("结果", "jié guǒ", "result / as a result", "Kosakata HSK 3: 结果 (jié guǒ)"),
                        WordToken("医院", "yī yuàn", "hospital", "Kosakata HSK 1: 医院 (yī yuàn)"),
                        WordToken("医生", "yī shēng", "doctor", "Kosakata HSK 1: 医生 (yī shēng)")
                    )
                )
            ),
            questions = listOf(
                StoryQuestion(
                    id = "q_cvtltt_1",
                    questionText = "生性喜欢贪图小便宜的小张，在同事小李按照约定回请吃饭时怀着怎样的不健康心态？ (Pola pikir tidak sehat apa yang ada di kepala Xiao Zhang saat ditraktir makan oleh Xiao Li?)",
                    options = listOf("打算只喝白开水帮朋友省钱 (Mau hemat uang kawan)", "因为是别人出资请客，打定主意疯狂暴食多吃昂贵大餐吃回本钱 (Karena ditraktir, berniat makan gila-gilaan sebanyak mungkin agar untung besar)", "准备打包带回家喂宠物 (Bungkus buat hewan)", "只想吃素食青菜 (Cuma mau sayur)"),
                    correctAnswerIndex = 1,
                    explanation = "Teks menyatakan: '原来这次因为是小李请客，于是他疯狂地吃，结果吃得太饱了'."
                ),
                StoryQuestion(
                    id = "q_cvtltt_2",
                    questionText = "小张在聚餐宴席上不知克制地暴饮暴食，最终导致了怎样自作自受的身体与经济惨剧？ (Akibat fisik dan finansial menyakitkan apa yang menimpa Xiao Zhang karena kerakusannya?)",
                    options = listOf("体重减轻了十斤 (Berat badan turun)", "把胃部严重撑出急性病症，不得不送往医院就医，掏出高昂的看病医药费 (Lambungnya jebol sakit parah hingga masuk RS dan harus membayar biaya medis yang sangat mahal)", "当场成为大胃王比赛冠军 (Juara lomba makan)", "获得了餐厅免费终身免单卡 (Dapat makan gratis seumur hidup)"),
                    correctAnswerIndex = 1,
                    explanation = "Teks menjelaskan: '把胃撑出了问题，最后只能去医院看医生了。这顿饭小张花的钱更多'."
                ),
                StoryQuestion(
                    id = "q_cvtltt_3",
                    questionText = "成语俗语“贪小便宜吃大亏”在故事中给全体读者的深刻人生警示是什么？ (Pelajaran moral apa yang dipetik dari peribahasa 'tān xiǎopiányi chī dàkuī'?)",
                    options = listOf("吃饭必须顿顿由自己全额请客 (Wajib traktir terus)", "处世切忌心术不正钻营蝇头小利，过分自私贪婪往往会招致数倍于前的巨大反噬代价 (Jangan tamak pada keuntungan sepele; keserakahan egois sering kali berujung kerugian yang berlipat-lipat)", "去餐馆决不能喝半碗水 (Jangan minum air)", "薪水绝不能告诉任何朋友 (Jangan bocorkan gaji)"),
                    correctAnswerIndex = 1,
                    explanation = "Cerita ini mengilustrasikan hikmah '贪小便宜吃大亏': orang yang serakah ingin untung kecil dari traktiran teman, akhirnya malah rugi uang berlipat ganda untuk biaya berobat ke rumah sakit."
                )
            )
        ),

        // Cerita Mandarin Bean 321 (HSK 3): Sowing and Harvesting (Kakek Tua Menanam Pohon Kurma)
        Story(
            id = "story_sowing_date_palms",
            titleHanzi = "老汉栽种椰枣树",
            titlePinyin = "Lǎohàn Zāizhòng Yēzǎoshù",
            titleTranslation = "Sowing and Harvesting (Kakek Penanam Pohon Kurma)",
            level = "HSK 3",
            category = "Filsafat & Kebijaksanaan Abadi",
            description = "Seorang kakek berusia lanjut tekun menanam bibit pohon kurma di oase gurun yang baru akan berbuah 50 tahun lagi; saat ditanya pemuda, ia menjawab: 'Kurma yang kukecap ditanam pendahulu, kurma kutanam ini demi generasi penerus'.",
            coverEmoji = "🌴",
            coverImageRes = R.drawable.cover_story_sowing_date_palms,
            estimatedReadMinutes = 2,
            sentences = listOf(
                Sentence(
                    id = "s_sowhrv_1",
                    hanzi = "年轻旅者途经沙漠绿洲，见一白发皤然古稀老翁顶着烈日酷暑躬耕黄土、悉心播撒幼小树种，好奇上前攀谈探问。",
                    pinyin = "nián qīng lǚ zhě tú jīng shā mò lǜ zhōu jiàn yī bái fà pó rán gǔ xī lǎo wēng dǐng zhe liè rì kù shǔ gōng gēng huáng tǔ xī xīn bō sǎ yòu xiǎo shù zhǒng hào qí shàng qián pān tán tàn wèn",
                    translation = "Seorang pemuda musafir melewati oase padang pasir dan melihat seorang kakek tua berambut putih membungkuk menanam bibit tanaman di tengah terik matahari; ia menghampiri dan menyapa dengan penasaran.",
                    tokens = listOf(
                        WordToken("绿洲", "lǜ zhōu", "oasis", "Oase gurun pasir"),
                        WordToken("播种", "bō zhǒng", "to sow seeds", "Kosakata pertanian: 播种"),
                        WordToken("大爷", "dà ye", "uncle / grandpa (respectful)", "Panggilan hormat HSK 3"),
                        WordToken("年纪", "nián jì", "age", "Kosakata HSK 3: 年纪 (nián jì)")
                    )
                ),
                Sentence(
                    id = "s_sowhrv_2",
                    hanzi = "老者微笑告知正在栽植椰枣树，青年直言相劝：椰枣树参天挂果须历经五十余载漫长光阴，大爷年事已高势必难享成熟甘甜，何苦徒劳。",
                    pinyin = "lǎo zhě wēi xiào gào zhī zhèng zài zāi zhí yē zǎo shù qīng nián zhí yán xiāng quàn yē zǎo shù cān tiān guà guǒ xū lì jīng wǔ shí yú zǎi màn cháng guāng yīn dà ye nián shì yǐ gāo shì bì nán xiǎng chéng shú gān tián hé kǔ tú láo",
                    translation = "Sang kakek tersenyum menjawab sedang menanam pohon kurma (*yēzǎo*); pemuda itu menasihati: 'Pohon kurma membutuhkan waktu lebih dari 50 tahun baru dapat berbuah lebat, Kakek sudah lanjut usia sangat mungkin tak akan sempat menikmati buahnya, kenapa repot bersusah payah?'.",
                    tokens = listOf(
                        WordToken("椰枣树", "yē zǎo shù", "date palm tree", "Pohon kurma gurun"),
                        WordToken("果实", "guǒ shí", "fruit / gains", "Kosakata HSK 3: 果实"),
                        WordToken("收获", "shōu huò", "to harvest / reap", "Kosakata HSK 3: 收获 (shōu huò)")
                    )
                ),
                Sentence(
                    id = "s_sowhrv_3",
                    hanzi = "老农淡然释怀吐露千古真理：“我一生口中所甘咽的甜枣皆前代先人所植，今日我挥汗播种，乃为让后世儿孙皆能尝到我植下的甘霖美果！”",
                    pinyin = "lǎo nóng dàn rán shì huái tǔ lù qiān gǔ zhēn lǐ wǒ yī shēng kǒu zhōng suǒ gān yān de tián zǎo jiē qián dài xiān rén suǒ zhí jīn rì wǒ huī hàn bō zhòng nǎi wèi ràng hòu shì ér sūn jiē néng cháng dào wǒ zhí xià de gān lín měi guǒ",
                    translation = "Kakek itu menjawab dengan bijak dan mulia: 'Buah kurma manis yang kunikmati seumur hidupku adalah hasil tanaman orang-orang terdahulu; hari ini aku menabur benih, adalah agar generasi masa depan kelak dapat memakan buah kurma yang kutanam!'.",
                    tokens = listOf(
                        WordToken("前人", "qián rén", "predecessors / forefathers", "Generasi terdahulu"),
                        WordToken("后人", "hòu rén", "future generations / descendants", "Generasi penerus"),
                        WordToken("为了", "wèi le", "in order to / for the sake of", "Kosakata HSK 2: 为了 (wèi le)")
                    )
                )
            ),
            questions = listOf(
                StoryQuestion(
                    id = "q_sowhrv_1",
                    questionText = "年迈的老人在绿洲酷热的艳阳下，独自一人躬身辛勤栽种的是哪种植物？ (Tanaman apa yang sedang tekun ditanam oleh kakek tua di oase gurun?)",
                    options = listOf("普通向日葵 (Bunga matahari)", "需要生长五十年以上才能挂果的椰枣树 (Pohon kurma yang butuh 50 tahun lebih untuk berbuah)", "速生青菜 (Sayur cepat panen)", "人工草坪 (Rumput sintetis)"),
                    correctAnswerIndex = 1,
                    explanation = "Teks menyatakan: '老人回答：“我在种椰枣树”'."
                ),
                StoryQuestion(
                    id = "q_sowhrv_2",
                    questionText = "途经此处的年轻旅人为何好心劝阻老汉“还是别干了”？ (Mengapa pemuda musafir menyarankan kakek berhenti menanam pohon tersebut?)",
                    options = listOf("因为地上有剧毒毒蛇 (Ada ular berbisa)", "椰枣树生长周期漫长长达50多年，老汉年事已高极大概率自己一生都无法活到收获果实的那一天 (Pohon kurma butuh 50 tahun untuk berbuah, kakek yang sudah tua kemungkinan besar tak akan sempat memanen buahnya)", "绿洲井水彻底枯竭了 (Air sumur kering)", "政府禁止种植树木 (Pemerintah melarang tanam pohon)"),
                    correctAnswerIndex = 1,
                    explanation = "Teks mencatat: '一棵椰枣树长成要五十多年，长成之后才能结出果实，所以最后您很可能无法收获果实，还是别干了吧'."
                ),
                StoryQuestion(
                    id = "q_sowhrv_3",
                    questionText = "老人给出的那句传诵百世的哲理回答，彰显了中华与人类文明怎样的无私奉献传承精神？ (Pesan kearifan luhur apa yang terkandung dalam jawaban sang kakek?)",
                    options = listOf("做人必须追求当下的及时行乐 (Hidup harus memikirkan kesenangan sesaat)", "“前人栽树，后人乘凉”：自己享受着前人福荫，今日当甘为后代子孙默默栽种播撒希望与幸福 (Generasi terdahulu menanam, generasi penerus menikmati; kita membalas budi peradaban untuk masa depan)", "卖椰枣树苗能发横财 (Menjual bibit pohon menguntungkan)", "老年人必须每天在烈日下劳作 (Orang tua wajib kerja di terik)"),
                    correctAnswerIndex = 1,
                    explanation = "Teks menyimpulkan keagungan budi pekerti: '老人却说：我吃的椰枣是前人种下的，我今天播种，是为了让后人能吃到我种的椰枣'."
                )
            )
        ),

        // Cerita Mandarin Bean 322 (HSK 3): Fairness (Dua Anjing Kecil dan Keadilan Sang Anjing Besar)
        Story(
            id = "story_fairness_dogs",
            titleHanzi = "大狗咬饼干的“公平”",
            titlePinyin = "Dàgǒu Yǎo Bǐnggān de Gōngpíng",
            titleTranslation = "Fairness (Keadilan Anjing Besar Membagi Biskuit)",
            level = "HSK 3",
            category = "Fabel & Perenungan Hidup",
            description = "Fabel cerdik: dua anak anjing berebut biskuit dan meminta anjing besar membagi adil; yang satu merasa lebih kecil anjing besar menggigit yang lain, bolak-balik hingga biskuit habis dimakan sang anjing besar.",
            coverEmoji = "🐕",
            coverImageRes = R.drawable.cover_story_fairness_dogs,
            estimatedReadMinutes = 1,
            sentences = listOf(
                Sentence(
                    id = "s_fairdg_1",
                    hanzi = "两只体型相仿的幼犬为争夺一块松脆饼干撕咬难解，忽见身形魁梧的大狗昂首踱步而来，便央求大犬充当裁判主持公道均分美食。",
                    pinyin = "liǎng zhī tǐ xíng xiāng fǎng de yòu quǎn wèi zhēng duó yī kuài sōng cuì bǐng gān sī yǎo nán jiě hū jiàn shēn xíng kuí wu de dà gǒu áng shǒu duó bù ér lái biàn yāng qiú dà quǎn chōng dāng cái pàn zhǔ chí gōng dào jūn fēn měi shí",
                    translation = "Dua ekor anak anjing berebut sepotong biskuit dengan sengit; melihat seekor anjing besar berbadan tegap berjalan mendekat, keduanya meminta anjing besar menjadi penengah untuk membagi biskuit tersebut secara adil.",
                    tokens = listOf(
                        WordToken("争", "zhēng", "to fight for / compete", "Kosakata HSK 3: 争 (zhēng)"),
                        WordToken("饼干", "bǐng gān", "biscuit / cracker", "Camilan HSK 3: 饼干"),
                        WordToken("希望", "xī wàng", "hope", "Kosakata HSK 2: 希望 (xī wàng)"),
                        WordToken("分", "fēn", "to divide / split", "Kosakata HSK 2: 分 (fēn)")
                    )
                ),
                Sentence(
                    id = "s_fairdg_2",
                    hanzi = "大狗将饼干掰成两半，A犬嫌自身份量偏小，大狗便将B犬之块咬去一口；B犬旋即抗议受损失衡，大狗复将A犬之块再嚼一口。",
                    pinyin = "dà gǒu jiāng bǐng gān bāi chéng liǎng bàn A quǎn xián zì shēn fèn liang piān xiǎo dà gǒu biàn jiāng B quǎn zhī kuài yǎo qù yī kǒu B quǎn xuán jí kàng yì shòu sǔn shī héng dà gǒu fù jiāng A quǎn zhī kuài zài jiáo yī kǒu",
                    translation = "Anjing besar membagi biskuit menjadi dua bagian; anak anjing A mengeluh miliknya lebih kecil, maka anjing besar menggigit seporsi biskuit milik anjing B; anjing B langsung protes miliknya kini jadi lebih kecil, maka anjing besar menggigit lagi biskuit anjing A.",
                    tokens = listOf(
                        WordToken("咬", "yǎo", "to bite", "Kosakata HSK 3: 咬 (yǎo)"),
                        WordToken("告诉", "gào su", "to tell", "Kosakata HSK 2: 告诉 (gào su)"),
                        WordToken("口", "kǒu", "mouthful / bite (measure word)", "Kosakata HSK 1: 口 (kǒu)")
                    )
                ),
                Sentence(
                    id = "s_fairdg_3",
                    hanzi = "如此反反复复龃龉不断，整块珍美饼干在仲裁中悉数入了大狗巨口；原来世俗所谓的盲目“公平”，往往只为求得一时心安却失尽所得！",
                    pinyin = "rú cǐ fǎn fǎn fù fù jǔ yǔ bù duàn zhěng kuài zhēn měi bǐng gān zài zhòng cái zhōng xī shù rù le dà gǒu jù kǒu yuán lái shì sú suǒ wèi de máng mù gōng píng wǎng wǎng zhǐ wèi qiú dé yī shí xīn ān què shī jìn suǒ dé",
                    translation = "Begitulah mereka berdua terus meributkan selisih ukuran dan anjing besar terus menggigit selangkah demi selangkah; alhasil sepotong biskuit utuh tandas dilahap kenyang oleh anjing besar; terkadang 'keadilan mutlak' yang dicari dengan saling cemburu justru merugikan kedua belah pihak!",
                    tokens = listOf(
                        WordToken("吵", "chǎo", "to quarrel / bicker", "Kosakata HSK 3: 吵 (chǎo)"),
                        WordToken("结果", "jié guǒ", "result / consequence", "Kosakata HSK 3: 结果 (jié guǒ)"),
                        WordToken("公平", "gōng píng", "fairness / justice", "Kosakata HSK 3: 公平 (gōng píng)"),
                        WordToken("平衡", "píng héng", "balance / equilibrium", "Kosakata HSK 3: 平衡")
                    )
                )
            ),
            questions = listOf(
                StoryQuestion(
                    id = "q_fairdg_1",
                    questionText = "两只争抢饼干不可开交的小狗，在看到体型威猛的大狗走过来时做出了什么愚蠢的决定？ (Keputusan apa yang diambil kedua anak anjing saat anjing besar mendekat?)",
                    options = listOf("立刻叼着饼干狂奔逃跑 (Langsung bawa kabur biskuit)", "停止争斗，请求大狗出面作为公正的仲裁者替它们平分饼干 (Berhenti bertengkar dan meminta anjing besar membagikan biskuit secara adil)", "合力攻击大狗 (Bersatu menyerang anjing besar)", "把饼干扔进水井里 (Melempar biskuit ke sumur)"),
                    correctAnswerIndex = 1,
                    explanation = "Teks menyatakan: '两只小狗看到了希望，不再争了，而是让大狗给它们分那块饼干'."
                ),
                StoryQuestion(
                    id = "q_fairdg_2",
                    questionText = "大狗在替两只幼犬“维护均等公平”的荒唐调解过程中，采取了怎样的操作套路？ (Prosedur apa yang dijalankan anjing besar dalam membagi biskuit?)",
                    options = listOf("用尺子精确测量毫克 (Menimbang dengan timbangan presisi)", "哪边嫌小，就去把另一只狗的饼干狠咬一口；反过来又把这只狗的咬一口，轮流蚕食 (Jika satu mengeluh kecil, ia menggigit biskuit milik anjing lainnya; bergantian hingga habis)", "把饼干全部吐出来 (Memuntahkan biskuit)", "去厨房多拿了两块饼干 (Ambil biskuit tambahan di dapur)"),
                    correctAnswerIndex = 1,
                    explanation = "Teks menjelaskan: 'A小狗说它的那块小一些，大狗就咬掉B小狗的一口；B小狗又说自己的小了，大狗又把A的咬了一口……'."
                ),
                StoryQuestion(
                    id = "q_fairdg_3",
                    questionText = "这则风趣幽默的寓言故事最终落下了怎样令人啼笑皆非的荒诞结局与讽刺反思？ (Akhir cerita konyol dan refleksi apa yang tersirat dari fabel ini?)",
                    options = listOf("两只小狗都吃饱了 (Kedua anjing kenyang)", "整块饼干最终在两只小狗无休止的斤斤计较吵闹中，全被坐收渔利的第三方大狗吃光了 (Seluruh biskuit akhirnya habis dilahap pihak ketiga, anjing besar penengah)", "饼干变成了石头 (Biskuit jadi batu)", "大狗被主人罚站 (Anjing besar dihukum)"),
                    correctAnswerIndex = 1,
                    explanation = "Teks menyimpulkan: '结果，一块饼干全让大狗吃了。原来，公平只是让双方心里平衡啊！'."
                )
            )
        ),

        // Cerita Mandarin Bean 323 (HSK 3): A Cup (Master Zen Menuang Air Cangkir Kekayaan)
        Story(
            id = "story_zen_cup_wealth",
            titleHanzi = "禅师溢水论财富",
            titlePinyin = "Chánshī Yìshuǐ Lùn Cáifù",
            titleTranslation = "A Cup (Filosofi Master Zen: Cangkir & Batas Harta)",
            level = "HSK 3",
            category = "Filsafat Zen & Nilai Hidup",
            description = "Seorang hartawan bertanya kepada guru Zen kapan harus berhenti mengejar kekayaan; Zen master menuang teko air hingga meluber membanjiri meja: harta yang melebihi kapasitas kebutuhan hidup hanya akan meluap sia-sia tanpa bisa disimpan.",
            coverEmoji = "🍵",
            coverImageRes = R.drawable.cover_story_zen_cup_wealth,
            estimatedReadMinutes = 2,
            sentences = listOf(
                Sentence(
                    id = "s_zencup_1",
                    hanzi = "一位终日汲汲营营追名逐利的巨贾富豪求教禅师：“弟子毕生疲于奔命聚敛财富，敢问钱财当聚积至何等田地始可止步收手？”",
                    pinyin = "yī wèi zhōng rì jí jí yíng yíng zhuī míng zhú lì de jù gǔ fù háo qiú jiào chán shī dì zǐ bì shēng pí yú bēn mìng jù liǎn cái fù gǎn wèn qián cái dāng jù jī zhì hé děng tián dì shǐ kě zhǐ bù shōu shǒu",
                    translation = "Seorang pria kaya raya yang seumur hidupnya sibuk mencari uang memohon petuah kepada seorang master Zen: 'Sepanjang hidup saya lelah memburu kekayaan, mohon petunjuk sampai batas berapakah saya seharusnya berhenti mencari uang?'.",
                    tokens = listOf(
                        WordToken("富人", "fù rén", "rich person / wealthy man", "Kosakata HSK 3: 富人"),
                        WordToken("禅师", "chán shī", "Zen master", "Guru spiritual Zen"),
                        WordToken("赚钱", "zhuàn qián", "to earn money", "Kosakata HSK 3: 赚钱 (zhuàn qián)"),
                        WordToken("停止", "tíng zhǐ", "to stop / cease", "Kosakata HSK 3: 停止 (tíng zhǐ)")
                    )
                ),
                Sentence(
                    id = "s_zencup_2",
                    hanzi = "禅师默不作声于案头安放小巧瓷杯，手执大容量水壶倾注不止；任凭清泉溢漫书桌四溅横流，老僧神色安详直至壶水倾尽方休。",
                    pinyin = "chán shī mò bù zuò shēng yú àn tóu ān fàng xiǎo qiǎo cí bēi shǒu zhí dà róng liàng shuǐ hú qīng zhù bù zhǐ rèn píng qīng quán yì màn shū zhuō sì jiàn héng liú lǎo sēng shén sè ān xiáng zhí zhì hú shuǐ qīng jìn fāng xiū",
                    translation = "Master Zen tidak menjawab dengan kata-kata; ia meletakkan sebuah cangkir kecil di atas meja lalu menuangkan air dari teko; air telah meluap membanjiri seluruh meja, namun master Zen terus menuang hingga seluruh air di teko habis tak bersisa.",
                    tokens = listOf(
                        WordToken("杯子", "bēi zi", "cup / glass", "Kosakata HSK 1: 杯子 (bēi zi)"),
                        WordToken("水壶", "shuǐ hú", "kettle / water jug", "Poci air: 水壶"),
                        WordToken("倒水", "dào shuǐ", "to pour water", "Kosakata tindakan"),
                        WordToken("溢满", "yì mǎn", "to overflow / brim over", "Meluap melimpah"),
                        WordToken("直到", "zhí dào", "until / up to", "Kosakata HSK 3: 直到 (zhí dào)")
                    )
                ),
                Sentence(
                    id = "s_zencup_3",
                    hanzi = "禅师悠然点化：整壶之水乃生平所聚之万贯资财，杯子容量乃一生真实所需之口腹开销；贪求溢出自身承载之多余财富，徒然泛滥于外无处可留！",
                    pinyin = "chán shī yōu rán diǎn huà zhěng hú zhī shuǐ nǎi shēng píng suǒ jù zhī wàn guàn zī cái bēi zi róng liàng nǎi yī shēng zhēn shí suǒ xū zhī kǒu fù kāi xiāo tān qiú yì chū zì shēn chéng zài zhī duō yú cái fù tú rán fàn làn yú wài wú chù kě liú",
                    translation = "Master Zen memberikan wejangan bijak: 'Air seisi teko adalah seluruh kekayaan yang engkau kumpulkan seumur hidupmu, sedangkan kapasitas cangkir ini adalah kebutuhan nyata yang engkau habiskan; mengumpulkan harta melebihi kapasitas cangkir kebutuhanmu hanya akan meluap sia-sia tanpa pernah bisa engkau simpan!'.",
                    tokens = listOf(
                        WordToken("容量", "róng liàng", "capacity / volume", "Kosakata HSK 3: 容量"),
                        WordToken("需要", "xū yào", "to need / require", "Kosakata HSK 2: 需要 (xū yào)"),
                        WordToken("财富", "cái fù", "wealth / riches", "Kosakata HSK 3: 财富 (cái fù)"),
                        WordToken("留住", "liú zhù", "to retain / keep", "Kosakata HSK 3: 留 (liú)")
                    )
                )
            ),
            questions = listOf(
                StoryQuestion(
                    id = "q_zencup_1",
                    questionText = "终日忙于敛财的富人登门拜访禅师时，心中最大的精神困惑与请教主题是什么？ (Pertanyaan batin apa yang diajukan pria kaya kepada guru Zen?)",
                    options = listOf("如何投资能够每年赚取十倍利润 (Cara investasi untung 10x)", "自己一生汲汲营营忙于赚钱，究竟应该赚到多少才应当适时停手止步 (Seumur hidup sibuk mengejar uang, sampai batas berapakah harusnya berhenti)", "禅师是否愿意借给他一千两黄金 (Pinjam emas)", "怎样才能长生不老 (Cara hidup abadi)"),
                    correctAnswerIndex = 1,
                    explanation = "Teks menyatakan: '一个富人问禅师：我一生忙于赚钱，请问我应该赚多少才停止？'."
                ),
                StoryQuestion(
                    id = "q_zencup_2",
                    questionText = "禅师没有立刻进行言语说教，而是借助了哪项极具启发性的实物示范开导富人？ (Peragaan fisik apa yang dilakukan master Zen untuk mendidik sang pria kaya?)",
                    options = listOf("在宣纸上画了一座大金山 (Menggambar gunung emas)", "在桌上放一个小杯子，拿着大水壶不断倒水，即使水溢满整张桌子依然一直倒完 (Menaruh cangkir kecil di meja dan menuang air teko terus-menerus hingga meluap membanjiri meja)", "让富人把钱包扔进火炉 (Membakar dompet)", "领着富人去农田拔草 (Mencabuti rumput di ladang)"),
                    correctAnswerIndex = 1,
                    explanation = "Teks mencatat: '禅师在桌子上放了一个杯子，然后用水壶给杯子倒水。水都溢满整张桌子了，禅师还是继续倒，直到把水壶里的水都倒完为止'."
                ),
                StoryQuestion(
                    id = "q_zencup_3",
                    questionText = "在这则禅宗哲理示范中，“溢出杯子流淌到桌上的水”生动隐喻了什么深刻人生哲理？ (Apa makna kiasan dari air yang meluap tumpah ke meja?)",
                    options = listOf("证明水壶的质量非常低劣 (Teko air jelek)", "杯子容量代表人一生真正实际所需的花费，超出自身真实需求过度的多余财富，只会如同溢出的水一样徒增负担且根本无法真正占有 (Kapasitas cangkir adalah kebutuhan nyata manusia, harta berlebih di luar kapasitas hanya akan meluber sia-sia tanpa bisa disimpan sejati)", "下雨天不要把杯子放在桌上 (Jangan taruh cangkir di luar)", "多喝水对身体特别好 (Banyak minum air baik)"),
                    correctAnswerIndex = 1,
                    explanation = "Teks menyimpulkan nasihat Zen agung: '整壶水是你一生所赚的钱，杯子的容量是你一生所需要花的钱，赚超过自己所需要的财富，只会溢出来，但不能留住'."
                )
            )
        )
    )
}
