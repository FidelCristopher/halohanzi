package com.example.chineselearning.data.repository

import com.example.chineselearning.R
import com.example.chineselearning.data.model.Sentence
import com.example.chineselearning.data.model.Story
import com.example.chineselearning.data.model.StoryQuestion
import com.example.chineselearning.data.model.WordToken

val mandarinBeanStoriesPart26: List<Story> by lazy {
    listOf(
        // Cerita Mandarin Bean 274 (HSK 3): The Dispute Between Southerners and Northerners (Perbedaan Selera Utara dan Selatan)
        Story(
            id = "story_south_north_taste",
            titleHanzi = "南北风味：咸甜之争",
            titlePinyin = "Nán Běi Fēngwèi: Xián Tián zhī Zhēng",
            titleTranslation = "South vs North: Sweet or Salty? (Perbedaan Selera Kuliner Utara & Selatan)",
            level = "HSK 3",
            category = "Kuliner & Geografi Budaya",
            description = "Perbedaan kontras selera makan antara Tiongkok Selatan dan Utara: kembang tahu manis vs asin, telur orak-arik tomat, hingga tradisi makan bacang daging asin di selatan dan bacang kurma manis di utara.",
            coverEmoji = "🍲",
            coverImageRes = R.drawable.cover_story_south_north_taste,
            estimatedReadMinutes = 2,
            sentences = listOf(
                Sentence(
                    id = "s_snftst_1",
                    hanzi = "中国人常自称南方人或北方人，两地在饮食习俗上差异颇大：南方喜甜，故豆腐脑多浇糖汁，番茄炒蛋也常撒糖提鲜；北方则一律调为咸鲜醇厚。",
                    pinyin = "Zhōng guó rén cháng zì chēng nán fāng rén huò běi fāng rén liǎng dì zài yǐn shí xí sú shàng chā yì pō dà nán fāng xǐ tián gù dòu fu nǎo duō jiāo táng zhī fān qié chǎo dàn yě cháng sǎ táng tí xiān běi fāng zé yī lǜ tiáo wèi xián xiān chún hòu",
                    translation = "Masyarakat Tionghoa sering memperkenalkan diri sebagai orang Selatan atau orang Utara; kedua wilayah ini memiliki perbedaan selera makan yang sangat nyata: orang Selatan menyukai rasa manis, sehingga kembang tahu (dòufunǎo) disajikan manis dan tumis telur tomat diberi gula, sedangkan di Utara keduanya disajikan bercita rasa gurih asin.",
                    tokens = listOf(
                        WordToken("南方", "nán fāng", "south / southern part", "Kosakata HSK 3: 南方 (nán fāng)"),
                        WordToken("北方", "běi fāng", "north / northern part", "Kosakata HSK 3: 北方 (běi fāng)"),
                        WordToken("甜", "tián", "sweet", "Kosakata HSK 3: 甜 (tián)"),
                        WordToken("豆腐脑", "dòu fu nǎo", "jellied bean curd / tofu pudding", "Kuliner tradisional"),
                        WordToken("糖", "táng", "sugar / candy", "Kosakata HSK 3: 糖 (táng)"),
                        WordToken("咸", "xián", "salty", "Kosakata HSK 3: 咸 (xián)")
                    )
                ),
                Sentence(
                    id = "s_snftst_2",
                    hanzi = "奇妙的是在端午粽子风味上却恰恰倒置：南方人偏爱裹入鲜肉蛋黄的咸肉粽，而北方人却钟情包入蜜枣蘸白糖的香甜甜粽。",
                    pinyin = "qí miào de shì zài duān wǔ zòng zi fēng wèi shàng què qià qià dào zhì nán fāng rén piān ài guǒ rù xiān ròu dàn huáng de xián ròu zòng ér běi fāng rén què zhōng qíng bāo rù mì zǎo zhàn bái táng de xiāng tián tián zòng",
                    translation = "Yang menarik, dalam hal tradisi menyantap kue bacang (zòngzi) di Hari Perahu Naga justru terbalik total: orang Selatan menyukai bacang asin isi daging dan kuning telur, sedangkan orang Utara lebih menyukai bacang manis isi kurma merah bertabur gula.",
                    tokens = listOf(
                        WordToken("粽子", "zòng zi", "rice dumpling / zongzi", "Kuliner tradisional"),
                        WordToken("枣子", "zǎo zi", "dates / jujube", "Bahan makanan"),
                        WordToken("味道", "wèi dào", "flavor / taste", "Kosakata HSK 3: 味道 (wèi dào)")
                    )
                ),
                Sentence(
                    id = "s_snftst_3",
                    hanzi = "若有机会漫游神州大地，一定要亲口细细品尝南北两地迥然不同却同样令人回味无穷的千姿风味。",
                    pinyin = "ruò yǒu jī huì màn yóu shén zhōu dà dì yī dìng yào qīn kǒu xì xì pǐn cháng nán běi liǎng dì jiǒng rán bù tóng què tóng yàng lìng rén huí wèi wú qióng de qiān zī fēng wèi",
                    translation = "Jika memiliki kesempatan berkunjung ke Tiongkok, jangan lewatkan untuk mencicipi sendiri kontras cita rasa khas Selatan dan Utara yang masing-masing memiliki keunikan tiada tara.",
                    tokens = listOf(
                        WordToken("机会", "jī huì", "opportunity / chance", "Kosakata HSK 2: 机会 (jī huì)"),
                        WordToken("尝", "cháng", "to taste", "Kosakata HSK 3: 尝 (cháng)"),
                        WordToken("试一试", "shì yī shì", "try it out", "Kosakata HSK 2: 试 (shì)")
                    )
                )
            ),
            questions = listOf(
                StoryQuestion(
                    id = "q_snftst_1",
                    questionText = "在日常家常小吃“豆腐脑”与“西红柿炒蛋”的调味口味上，中国南方和北方通常分别呈现出怎样的口感差异？ (Apa perbedaan rasa kembang tahu dan telur orak-arik tomat antara Tiongkok Selatan dan Utara?)",
                    options = listOf("南方普遍做成酸辣味，北方做成苦味 (Selatan asam pedas, utara pahit)", "南方大多数喜欢调成甜味，而北方则习惯调成咸鲜味 (Selatan dominan manis, sedangkan Utara dominan asin gurih)", "南北方完全没有任何区别 (Sama sekali tidak ada perbedaan)", "两地全都只吃冰冻生的 (Hanya makan beku mentah)"),
                    correctAnswerIndex = 1,
                    explanation = "Teks menyatakan: '豆腐脑在南方是甜的，西红柿炒蛋也会放一点糖，但是这两种吃的东西在北方都是咸的'."
                ),
                StoryQuestion(
                    id = "q_snftst_2",
                    questionText = "端午节传统节庆美食“粽子”在南北口味偏好上出现反常有趣的哪种地理倒置？ (Pembalikan unik apa yang terjadi pada selera kue bacang / zongzi antara Utara dan Selatan?)",
                    options = listOf("南方爱吃无米粽，北方爱吃水草粽 (Selatan tanpa ketan, utara rumput)", "南方人反而普遍偏爱吃咸粽子（如肉粽），北方人却偏偏偏爱加枣子放糖的甜粽子 (Orang Selatan justru suka bacang asin gurih, sedangkan orang Utara suka bacang kurma manis)", "南北方都禁止在粽子里放米 (Dilarang pakai beras)", "只有北方人才吃粽子 (Hanya orang utara yang makan bacang)"),
                    correctAnswerIndex = 1,
                    explanation = "Teks mencatat: '吃粽子的时候，南方人喜欢吃咸粽子，北方人却喜欢有枣子加糖的甜粽子'."
                ),
                StoryQuestion(
                    id = "q_snftst_3",
                    questionText = "作者向所有初到中国的外国友人发出了怎样的真诚美食建议？ (Saran kuliner apa yang disampaikan penulis kepada para pelancong?)",
                    options = listOf("只在西式快餐店用餐 (Hanya makan di resto cepat saji barat)", "一定要亲自走走看看，亲口品尝比较中国南方与北方各有千秋的独特风味 (Wajib mencoba langsung dan membandingkan keragaman rasa khas Utara dan Selatan)", "坚决不要吃任何甜食 (Dilarang makan makanan manis)", "自带所有食材 (Bawa bahan sendiri)"),
                    correctAnswerIndex = 1,
                    explanation = "Teks menyarankan: '如果你到中国来，一定要试一试南方和北方不同的味道'."
                )
            )
        ),

        // Cerita Mandarin Bean 275 (HSK 3): Chinese Characters (Evolusi Karakter Hanzi)
        Story(
            id = "story_chinese_characters",
            titleHanzi = "汉字六千年演变与魅力",
            titlePinyin = "Hànzì Liùqiān Nián Yǎnbiàn yǔ Mèilì",
            titleTranslation = "Chinese Characters (Evolusi 6.000 Tahun & Pesona Hanzi)",
            level = "HSK 3",
            category = "Bahasa & Sejarah Budaya",
            description = "Menelusuri sejarah panjang aksara Hanzi selama lebih dari 6.000 tahun: bermula dari lukisan piktograf kuno, jumlah total hampir 100.000 karakter, hingga 3.000 karakter esensial harian.",
            coverEmoji = "📜",
            coverImageRes = R.drawable.cover_story_chinese_characters,
            estimatedReadMinutes = 2,
            sentences = listOf(
                Sentence(
                    id = "s_chchar_1",
                    hanzi = "汉字是记录汉语的书写符号，拥有六千余年璀璨历史，乃全球最古老且沿用至今的文字体系之一；其最初脱胎于原始图画，历经沧桑演变为现代字形。",
                    pinyin = "hàn zì shì jì lù Hàn yǔ de shū xiě fú hào yōng yǒu liù qiān yú nián cuǐ càn lì shǐ nǎi quán qiú zuì gǔ lǎo qiě yán yòng zhì jīn de wén zì tǐ xì zhī yī qí zuì chū tuō tāi yú yuán shǐ tú huà lì jīng cāng sāng yǎn biàn wèi xiàn dài zì xíng",
                    translation = "Aksara Hanzi adalah simbol tertulis bahasa Mandarin yang memiliki sejarah gemilang lebih dari 6.000 tahun dan merupakan salah satu aksara tertua di dunia yang masih aktif digunakan; bentuk awalnya berasal dari lukisan piktograf alam hingga berevolusi menjadi karakter modern saat ini.",
                    tokens = listOf(
                        WordToken("汉字", "hàn zì", "Chinese characters", "Kosakata HSK 2: 汉字 (hàn zì)"),
                        WordToken("符号", "fú hào", "symbol / mark", "Kosakata HSK 3: 符号"),
                        WordToken("文字", "wén zì", "characters / script", "Kosakata HSK 3: 文字 (wén zì)"),
                        WordToken("历史", "lì shǐ", "history", "Kosakata HSK 2: 历史 (lì shǐ)")
                    )
                ),
                Sentence(
                    id = "s_chchar_2",
                    hanzi = "汉字总数浩繁将近十万之巨，但日常生活高频应用的仅三千余字，现代通行的汉字主要分为繁体字与简体字两大流派。",
                    pinyin = "hàn zì zǒng shù hào fán jiāng jìn shí wàn zhī jù dàn rì cháng shēng huó gāo pín yīng yòng de jǐn sān qiān yú zì xiàn dài tōng xíng de hàn zì zhǔ yào fēn wéi fán tǐ zì yǔ jiǎn tǐ zì liǎng dà liú pài",
                    translation = "Jumlah total aksara Hanzi dalam kamus besar mencapai hampir seratus ribu karakter, namun untuk kehidupan sehari-hari hanya diperlukan sekitar 3.000-an karakter; secara tipografi aksara modern terbagi atas aksara tradisional (fántǐzì) dan aksara sederhana (jiǎntǐzì).",
                    tokens = listOf(
                        WordToken("将近", "jiāng jìn", "nearly / almost", "Kosakata HSK 3: 将近 (jiāng jìn)"),
                        WordToken("准确", "zhǔn què", "accurate / exact", "Kosakata HSK 3: 准确 (zhǔn què)"),
                        WordToken("日常", "rì cháng", "daily / everyday", "Kosakata HSK 3: 日常 (rì cháng)"),
                        WordToken("简体字", "jiǎn tǐ zì", "simplified Chinese characters", "Jenis aksara Mandarin modern")
                    )
                ),
                Sentence(
                    id = "s_chchar_3",
                    hanzi = "每一笔一划皆深植着源远流长的华夏文化密码，若欲透彻研习中文并读懂中国，掌握汉字当属不可或缺的第一步。",
                    pinyin = "měi yī bǐ yī huà jiē shēn zhí zhe yuán yuǎn liú cháng de Huá xià wén huà mì mǎ ruò yù tòu chè yán xí Zhōng wén bìng dú dǒng Zhōng guó zhǎng wò hàn zì dāng shǔ bù kě huò quē de dì yī bù",
                    translation = "Setiap goresan karakter Hanzi menyimpan kode kebudayaan Tiongkok yang luhur; jika ingin sungguh-sungguh mendalami bahasa Mandarin dan memahami Tiongkok seutuhnya, mempelajari aksara Hanzi adalah langkah awal yang fundamental.",
                    tokens = listOf(
                        WordToken("文化", "wén huà", "culture", "Kosakata HSK 2: 文化 (wén huà)"),
                        WordToken("真正", "zhēn zhèng", "genuine / real", "Kosakata HSK 3: 真正 (zhēn zhèng)"),
                        WordToken("了解", "liǎo jiě", "to understand", "Kosakata HSK 3: 了解 (liǎo jiě)")
                    )
                )
            ),
            questions = listOf(
                StoryQuestion(
                    id = "q_chchar_1",
                    questionText = "根据历史学考证，汉字作为世界上最古老的自源文字之一，大约拥有多么悠久的演变历史？ (Menurut catatan sejarah, berapa lama perkiraan usia sejarah perkembangan aksara Hanzi?)",
                    options = listOf("不到300年 (Kurang dari 300 tahun)", "已经有6000多年的悠久历史 (Telah memiliki sejarah lebih dari 6.000 tahun)", "仅从唐朝才开始发明 (Baru ditemukan sejak Dinasti Tang)", "约50年左右 (Sekitar 50 tahun)"),
                    correctAnswerIndex = 1,
                    explanation = "Teks menyatakan: '汉字是世界上最古老的文字之一，已经有六千多年历史了'."
                ),
                StoryQuestion(
                    id = "q_chchar_2",
                    questionText = "虽然汉语字海总字数将近十万之多，但在现代人的日常工作生活交流中，通常仅需掌握多少个常用汉字即可满足基本需求？ (Meski kamus mencatat hampir 100.000 karakter, berapa jumlah karakter Hanzi yang biasa dipakai sehari-hari?)",
                    options = listOf("必须认全十万个字 (Wajib hafal semua 100.000)", "仅仅需要用到3000多个常用字 (Hanya sekitar 3.000-an karakter harian)", "只要认识十个字即可 (Cukup 10 kata saja)", "需要五十万个字 (Butuh 500.000 kata)"),
                    correctAnswerIndex = 1,
                    explanation = "Teks menjelaskan: '汉字有多少个？将近十万个... 我们日常生活中需要用到的汉字只有3000多个'."
                ),
                StoryQuestion(
                    id = "q_chchar_3",
                    questionText = "汉字形态在最初萌芽时期看起来酷似图画，这是因为它的原始起源来自于何种方式？ (Mengapa karakter Hanzi kuno mirip seperti gambar lukisan?)",
                    options = listOf("古代外星人的密码符号 (Kode rahasia alien)", "最早的古汉字本身就是照着自然万物的形状一笔一划“画出来”的象形图画 (Karakter piktograf kuno awalnya dilukis meniru wujud benda alamiah di dunia)", "古代盲人雕刻的盲文 (Huruf braille kuno)", "从欧洲字母改造而来 (Modifikasi huruf alfabet Eropa)"),
                    correctAnswerIndex = 1,
                    explanation = "Teks menyatakan: '很多读者觉得汉字非常难，因为看起来像图画，其实最早的汉字就是画出来的'."
                )
            )
        ),

        // Cerita Mandarin Bean 276 (HSK 3): Kobe Bryant Passed Away in an Accident (Bintang Basket Kobe Bryant)
        Story(
            id = "story_kobe_bryant",
            titleHanzi = "巨星科比意外陨落",
            titlePinyin = "Jùxīng Kēbǐ Yìwài Yǔnluò",
            titleTranslation = "Kobe Bryant Passed Away (Mengenang Legenda Kobe Bryant)",
            level = "HSK 3",
            category = "Olahraga & Tokoh Dunia",
            description = "Mengenang legenda bola basket dunia Kobe Bryant yang wafat dalam kecelakaan helikopter di usia 41 tahun bersama putrinya Gianna pada 26 Januari 2020, serta kenangan mendalam jutaan penggemar.",
            coverEmoji = "🏀",
            coverImageRes = R.drawable.cover_story_kobe_bryant,
            estimatedReadMinutes = 2,
            sentences = listOf(
                Sentence(
                    id = "s_kobeb_1",
                    hanzi = "2020年1月26日，年仅四十一岁的美国著名篮球巨星科比·布莱恩特与其次女吉安娜因直升机突发意外不幸坠机遇难，全球体坛巨星陨落。",
                    pinyin = "èr líng èr líng nián yī yuè èr shí liù rì nián jǐn sì shí yī suì de Měi guó zhù míng lán qiú jù xīng Kē bǐ Bù lái ēn tè yǔ qí cì nǚ Jí ān nà yīn zhí shēng jī tū fā yì wài bù xìng zhuì jī yù nàn quán qiú tǐ tán jù xīng yǔn luò",
                    translation = "Pada 26 Januari 2020, bintang bola basket legendaris Amerika Serikat Kobe Bryant yang baru berusia 41 tahun bersama putri keduanya, Gianna, wafat akibat kecelakaan helikopter, meninggalkan duka mendalam bagi dunia olahraga internasional.",
                    tokens = listOf(
                        WordToken("篮球", "lán qiú", "basketball", "Kosakata HSK 2: 篮球 (lán qiú)"),
                        WordToken("明星", "míng xīng", "star / celebrity", "Kosakata HSK 3: 明星 (míng xīng)"),
                        WordToken("意外", "yì wài", "accident / unexpected", "Kosakata HSK 3: 意外 (yì wài)"),
                        WordToken("去世", "qù shì", "to pass away", "Kosakata HSK 3: 去世 (qù shì)")
                    )
                ),
                Sentence(
                    id = "s_kobeb_2",
                    hanzi = "作为篮球历史上最杰出伟大的传奇球员之一，噩耗传出令五洲各地球迷深感震惊、悲痛难抑，久久不愿相信惨剧真实发生。",
                    pinyin = "zuò wéi lán qiú lì shǐ shàng zuì jié chū wěi dà de chuán qí qiú yuán zhī yī è hào chuán chū lìng wǔ zhōu gè dì qiú mí shēn gǎn zhèn jīng bēi tòng nán yì jiǔ jiǔ bù yuàn xiāng xìn cǎn jù zhēn shí fā shēng",
                    translation = "Sebagai salah satu atlet paling agung dalam sejarah bola basket, kabar duka ini mengejutkan dan menyayat hati jutaan penggemar basket di seluruh dunia yang sulit memercayai musibah tragis tersebut.",
                    tokens = listOf(
                        WordToken("伟大", "wěi dà", "great / magnificent", "Kosakata HSK 3: 伟大 (wěi dà)"),
                        WordToken("震惊", "zhèn jīng", "shocked / astounded", "Kosakata HSK 3: 震惊"),
                        WordToken("难过", "nán guò", "sad / sorrowful", "Kosakata HSK 3: 难过 (nán guò)"),
                        WordToken("球迷", "qiú mí", "ball game fan", "Kosakata HSK 3: 球迷 (qiú mí)")
                    )
                ),
                Sentence(
                    id = "s_kobeb_3",
                    hanzi = "科比不仅留下了数不胜数的赛场辉煌荣耀，更以坚毅卓绝的“黑曼巴精神”鼓舞激励了亿万中国青年在逆境中奋勇拼搏。",
                    pinyin = "Kē bǐ bù jǐn liú xià le shǔ bù shèng shǔ de sài chǎng huī huáng róng yào gèng yǐ jiān yì zhuó jué de hēi màn bā jīng shén gǔ wǔ jī lì le yì wàn Zhōng guó qīng nián zài nì jìng zhōng fèn yǒng pīn bó",
                    translation = "Kobe tidak hanya menorehkan sederet prestasi gemilang di lapangan, tetapi lewat 'Mamba Mentality' yang tak kenal menyerah telah menginspirasi ratusan juta generasi muda Tiongkok untuk gigih berjuang meraih mimpi.",
                    tokens = listOf(
                        WordToken("相信", "xiāng xìn", "to believe", "Kosakata HSK 3: 相信 (xiāng xìn)"),
                        WordToken("回忆", "huí yì", "memory / recollection", "Kosakata HSK 3: 回忆 (huí yì)"),
                        WordToken("激励", "jī lì", "to encourage / inspire", "Kosakata HSK 3: 激励 (jī lì)")
                    )
                )
            ),
            questions = listOf(
                StoryQuestion(
                    id = "q_kobeb_1",
                    questionText = "世界级篮球传奇巨星科比·布莱恩特与其二女儿不幸遭遇空难去世的准确日期是哪一天？ (Tanggal berapakah kecelakaan tragis yang menimpa Kobe Bryant dan putrinya?)",
                    options = listOf("2008年8月8日 (8 Agustus 2008)", "2020年1月26日 (26 Januari 2020)", "2019年12月31日 (31 Desember 2019)", "2021年6月1日 (1 Juni 2021)"),
                    correctAnswerIndex = 1,
                    explanation = "Teks menyatakan: '2020年1月26日，科比·布莱恩特和他的二女儿吉安娜因为直升机意外在美国去世'."
                ),
                StoryQuestion(
                    id = "q_kobeb_2",
                    questionText = "科比罹难时正值壮年，当时的准确年龄是多少岁？ (Berapa usia Kobe Bryant saat berpulang?)",
                    options = listOf("25岁 (25 tahun)", "41岁 (41 tahun)", "58岁 (58 tahun)", "30岁 (30 tahun)"),
                    correctAnswerIndex = 1,
                    explanation = "Teks mencatat: '科比是美国的篮球明星，才41岁'."
                ),
                StoryQuestion(
                    id = "q_kobeb_3",
                    questionText = "在中国乃至全球无数篮球迷心中，科比之所以享有无与伦比崇高地位的原因是什么？ (Mengapa sosok Kobe Bryant sangat dicintai dan dihormati penggemar di Tiongkok dan dunia?)",
                    options = listOf("他曾投资拍摄多部好莱坞电影 (Investasi film)", "他不仅是篮球历史上最伟大的球员之一，更给无数人留下了青春美好回忆与顽强拼搏精神激励 (Salah satu atlet terbesar dan memberi inspirasi semangat juang pantang menyerah bagi jutaan orang)", "他给所有球迷赠送过签名篮球 (Kasih bola tanda tangan)", "他曾经在大学当过校长 (Pernah jadi rektor)"),
                    correctAnswerIndex = 1,
                    explanation = "Teks menyimpulkan: '因为科比给过很多人美好的回忆，也激励过很多人'."
                )
            )
        ),

        // Cerita Mandarin Bean 277 (HSK 3): Total Population of Mainland China (Demografi Tiongkok dan Penuaan Populasi)
        Story(
            id = "story_china_population",
            titleHanzi = "中国大陆人口与老龄化",
            titlePinyin = "Zhōngguó Dàlù Rénkǒu yǔ Lǎolínghuà",
            titleTranslation = "Total Population of Mainland China (Demografi Penduduk & Penuaan)",
            level = "HSK 3",
            category = "Masyarakat & Statistik",
            description = "Statistik resmi demografi Tiongkok: total populasi menembus 1,4 miliar pada 2019, tren penurunan angka kelahiran bayi, proyeksi pertumbuhan negatif, dan tantangan penuaan penduduk (lǎolínghuà).",
            coverEmoji = "👥",
            coverImageRes = R.drawable.cover_story_china_population,
            estimatedReadMinutes = 2,
            sentences = listOf(
                Sentence(
                    id = "s_chnpop_1",
                    hanzi = "截至2019年底中国大陆总人口历史性突破14亿大关，较上一年度净增467万人，体量位居全球首位。",
                    pinyin = "jié zhì èr líng yī jiǔ nián dǐ Zhōng guó Dà lù zǒng rén kǒu lì shǐ xìng tū pò shí sì yì dà guān jiào shàng yī nián dù jìng zēng sì bǎi liù shí qī wàn rén tǐ liàng wèi jū quán qiú shǒu wèi",
                    translation = "Hingga akhir tahun 2019, jumlah total penduduk daratan Tiongkok menembus angka historis 1,4 miliar jiwa, meningkat 4,67 juta orang dibandingkan tahun sebelumnya.",
                    tokens = listOf(
                        WordToken("大陆", "dà lù", "mainland (China)", "Kosakata geografi: 大陆"),
                        WordToken("人口", "rén kǒu", "population", "Kosakata HSK 3: 人口 (rén kǒu)"),
                        WordToken("超过", "chāo guò", "to exceed / surpass", "Kosakata HSK 3: 超过 (chāo guò)"),
                        WordToken("亿", "yì", "hundred million (100,000,000)", "Angka besar HSK 3: 亿")
                    )
                ),
                Sentence(
                    id = "s_chnpop_2",
                    hanzi = "然而2019年全国新生儿仅为1465万人，同比锐减58万，延续了2018年比2017年断崖式减少200万的下滑态势。",
                    pinyin = "rán ér èr líng yī jiǔ nián quán guó xīn shēng ér jǐn wèi yī qiān sì bǎi liù shí wǔ wàn rén tóng bǐ ruì jiǎn wǔ shí bā wàn yán xù le èr líng yī bā nián bǐ èr líng yī qī nián duàn yá shì jiǎn shǎo èr bǎi wàn de xià huá tài shì",
                    translation = "Namun demikian, angka kelahiran bayi baru pada tahun 2019 hanya mencapai 14,65 juta jiwa (turun 580 ribu), melanjutkan tren penurunan dari tahun 2018 yang sebelumnya telah anjlok 2 juta kelahiran dibanding 2017.",
                    tokens = listOf(
                        WordToken("新生", "xīn shēng", "newborn / new birth", "Kosakata HSK 3: 新生"),
                        WordToken("少", "shǎo", "less / decrease", "Kosakata HSK 1: 少 (shǎo)"),
                        WordToken("减少", "jiǎn shǎo", "to decrease / reduce", "Kosakata HSK 3: 减少 (jiǎn shǎo)")
                    )
                ),
                Sentence(
                    id = "s_chnpop_3",
                    hanzi = "统计学模型预测总人口将在2025年前后迎来负增长，老年银发人口比例持续攀升，社会人口老龄化难题亟待化解。",
                    pinyin = "tǒng jì xué mó xíng yù cè zǒng rén kǒu jiāng zài èr líng èr wǔ nián qián hòu yíng lái fù zēng zhǎng lǎo nián yín fà rén kǒu bǐ lì chí xù pān shēng shè huì rén kǒu lǎo líng huà nán tí jí dài huà jiě",
                    translation = "Model statistik memproyeksikan populasi Tiongkok akan mengalami pertumbuhan negatif sekitar tahun 2025; rasio lansia kian bertambah sementara generasi muda menyusut, memunculkan tantangan penuaan populasi (lǎolínghuà) bagi tatanan masyarakat.",
                    tokens = listOf(
                        WordToken("增长", "zēng zhǎng", "to grow / increase", "Kosakata HSK 3: 增长 (zēng zhǎng)"),
                        WordToken("老龄化", "lǎo líng huà", "aging (of society)", "Istilah demografi"),
                        WordToken("问题", "wèn tí", "problem / issue", "Kosakata HSK 2: 问题 (wèn tí)")
                    )
                )
            ),
            questions = listOf(
                StoryQuestion(
                    id = "q_chnpop_1",
                    questionText = "根据官方统计公报，截至2019年年末，中国大陆总人口突破了哪一具有里程碑意义的数量大关？ (Berapa tonggak angka resmi populasi Tiongkok daratan pada akhir 2019?)",
                    options = listOf("8亿人 (800 juta jiwa)", "超过14亿人 (Menembus lebih dari 1,4 miliar jiwa)", "20亿人 (2 miliar)", "5亿人 (500 juta)"),
                    correctAnswerIndex = 1,
                    explanation = "Teks menyatakan: '到2019年底，中国大陆的人口超过14亿人'."
                ),
                StoryQuestion(
                    id = "q_chnpop_2",
                    questionText = "文章数据反映出近年来中国在新生儿出生人口指标上呈现出怎样引人注目的发展走势？ (Tren apa yang tampak pada angka kelahiran bayi di Tiongkok belakangan ini?)",
                    options = listOf("每年翻倍暴增 (Naik dobel tiap tahun)", "新生出生人口数量连年处于持续递减状态 (Angka kelahiran terus mengalami tren penurunan dari tahun ke tahun)", "始终分毫不差保持不变 (Tetap sama persis)", "所有家庭都生三个小孩 (Semua punya 3 anak)"),
                    correctAnswerIndex = 1,
                    explanation = "Teks menjelaskan: '2019年新生人口是1465万人，比上一年少了58万... 现在中国大陆的人口一直在减少'."
                ),
                StoryQuestion(
                    id = "q_chnpop_3",
                    questionText = "随着未来人口负增长的出现，中国社会即将面临的最严峻宏观结构性挑战是什么？ (Tantangan struktural terbesar apa yang dihadapi masyarakat dengan pertumbuhan negatif?)",
                    options = listOf("缺少粮食和淡水 (Kekurangan makanan dan air)", "老人越来越多而年轻人减少，导致社会加速进入深度“老龄化” (Jumlah lansia kian banyak sementara pemuda menyusut, mempercepat penuaan populasi / lǎolínghuà)", "房屋面积过大 (Rumah terlalu besar)", "汽车数量不够 (Mobil tidak cukup)"),
                    correctAnswerIndex = 1,
                    explanation = "Teks menyimpulkan: '老人更多，年轻人更少，老龄化的问题也更多'."
                )
            )
        ),

        // Cerita Mandarin Bean 278 (HSK 3): Auspicious Numbers (Filosofi Angka Keberuntungan Tionghoa)
        Story(
            id = "story_auspicious_numbers",
            titleHanzi = "中国吉祥数字文化",
            titlePinyin = "Zhōngguó Jíxiáng Shùzì Wénhuà",
            titleTranslation = "Auspicious Numbers (Filosofi Angka Keberuntungan Tiongkok)",
            level = "HSK 3",
            category = "Budaya & Tradisi",
            description = "Makna mistis angka dalam budaya Tionghoa: pembukaan Olimpiade Beijing 2008-08-08 pukul 08:00, kecintaan pada angka genap (2, 6, 8 / fā), dan pantangan angka 4 (sì = sǐ).",
            coverEmoji = "🔢",
            coverImageRes = R.drawable.cover_story_auspicious_numbers,
            estimatedReadMinutes = 2,
            sentences = listOf(
                Sentence(
                    id = "s_ausnum_1",
                    hanzi = "熟悉华夏民俗者对北京奥运会开幕时刻决不感意外：2008年8月8日晚8点整，四个“8”汇聚尽显对吉祥吉利的热烈崇尚。",
                    pinyin = "shú xi Huá xià mín sú zhě duì Běi jīng Ào yùn huì kāi mù shí kè jué bù gǎn yì wài èr líng líng bā nián bā yuè bā rì wǎn bā diǎn zhěng sì gè bā huì jù jǐn xiǎn duì jí xiáng jí lì de rè liè chóng shàng",
                    translation = "Bagi yang akrab dengan budaya Tionghoa, waktu pembukaan Olimpiade Beijing sama sekali tidak mengherankan: tahun 2008, tanggal 8 Agustus, pukul 08:00 malam; deretan angka '8' mencerminkan kecintaan mendalam pada simbol keberuntungan.",
                    tokens = listOf(
                        WordToken("熟悉", "shú xi", "familiar with", "Kosakata HSK 3: 熟悉 (shú xi)"),
                        WordToken("奥运会", "Ào yùn huì", "Olympic Games", "Ajang olahraga dunia"),
                        WordToken("吉祥", "jí xiáng", "auspicious / lucky", "Kosakata budaya HSK 3: 吉祥"),
                        WordToken("数字", "shù zì", "number / digit", "Kosakata HSK 3: 数字 (shù zì)")
                    )
                ),
                Sentence(
                    id = "s_ausnum_2",
                    hanzi = "择选门牌、手机号或车牌时人们皆争相竞逐双数吉数：二表成双，六寓顺遂，八因谐音“发财”之“发”更是备受追捧。",
                    pinyin = "zé xuǎn mén pái shǒu jī hào huò chē pái shí rén men jiē zhēng xiāng jìng zhú shuāng shù jí shù èr biǎo chéng shuāng liù yù shùn suì bā yīn xié yīn fā cái zhī fā gèng shì bèi shòu zhuī pěng",
                    translation = "Saat memilih nomor kamar, nomor telepon, atau plat nomor mobil, orang-orang berebut memilih angka genap pembawa rezeki: angka 2 simbol berpasangan, 6 lambang kelancaran, dan 8 yang berbunyi mirip kata 'fā' (makmur kaya raya) menjadi yang paling diperebutkan.",
                    tokens = listOf(
                        WordToken("双数", "shuāng shù", "even number", "Istilah matematika"),
                        WordToken("单数", "dān shù", "odd number", "Istilah matematika"),
                        WordToken("车牌", "chē pái", "license plate", "Plat nomor kendaraan"),
                        WordToken("发财", "fā cái", "to get rich / make a fortune", "Kosakata HSK 3: 发财 (fā cái)")
                    )
                ),
                Sentence(
                    id = "s_ausnum_3",
                    hanzi = "而数字“四”则因同音谐音“死”字沦为最大忌讳，日常楼层编号与重要仪轨中往往竭力回避不取。",
                    pinyin = "ér shù zì sì zé yīn tóng yīn xié yīn sǐ zì lún wèi zuì dà jì huì rì cháng lóu céng biān hào yǔ zhòng yào yí guǐ zhōng wǎng wǎng jié lì huí bì bù qǔ",
                    translation = "Sebaliknya, angka 'empat' (sì) karena bunyinya sama persis dengan kata 'kematian' (sǐ) menjadi angka yang paling dihindari, di mana penomoran lantai gedung dan jadwal acara penting berusaha keras menghindarinya.",
                    tokens = listOf(
                        WordToken("死", "sǐ", "to die / death", "Kosakata HSK 3: 死 (sǐ)"),
                        WordToken("听起来", "tīng qǐ lái", "sounds like", "Tata bahasa HSK 3: 听起来"),
                        WordToken("意思", "yì si", "meaning", "Kosakata HSK 2: 意思 (yì si)")
                    )
                )
            ),
            questions = listOf(
                StoryQuestion(
                    id = "q_ausnum_1",
                    questionText = "举世瞩目的2008年北京夏季奥运会正式开幕时间巧妙契合了哪四个神奇的吉祥数字组合？ (Kombinasi angka keberuntungan apa yang dipilih untuk pembukaan Olimpiade Beijing 2008?)",
                    options = listOf("2008年8月8日晚上8点整（连环四个“8”） (2008, 8 Agustus, pukul 08:00 malam - empat angka 8)", "2008年5月1日早上7点 (1 Mei jam 7 pagi)", "2008年10月1日正午12点 (1 Oktober jam 12)", "2008年1月1日零点 (1 Januari jam 00:00)"),
                    correctAnswerIndex = 0,
                    explanation = "Teks menyatakan: '2008年8月8日晚上8点'."
                ),
                StoryQuestion(
                    id = "q_ausnum_2",
                    questionText = "在中国传统民间观念中，人们挑选电话号码或车牌号码时，普遍更青睐哪类数字属性？ (Saat memilih nomor telepon/plat kendaraan, jenis angka apa yang lebih disukai?)",
                    options = listOf("全部都必须是负数 (Angka negatif)", "寓意“好事成双、顺畅发达”的吉祥双数（如2、6、8） (Angka genap pembawa berkah kelancaran seperti 2, 6, dan 8)", "纯粹毫无规律的单数 (Angka ganjil acak)", "只选带小数点的数字 (Angka desimal)"),
                    correctAnswerIndex = 1,
                    explanation = "Teks menjelaskan: '双数比单数要更吉祥，比如二、六、八等'."
                ),
                StoryQuestion(
                    id = "q_ausnum_3",
                    questionText = "数字“四（4）”在中国社会生活中之所以成为许多建筑楼层和车牌中刻意回避的忌讳数字，根本原因是什么？ (Mengapa angka 4 sangat dihindari dalam penomoran lantai dan plat mobil di Tiongkok?)",
                    options = listOf("阿拉伯数字4字形太难看 (Bentuk angka 4 jelek)", "“四”（sì）在汉语普通话语音中与代表丧亡消逝的“死”（sǐ）谐音近音 (Pelafalan angka 'sì' berbunyi mirip kata kematian 'sǐ')", "因为4是一个偶数 (Karena angka genap)", "古代算盘上没有数字4 (Sempoa kuno tak punya angka 4)"),
                    correctAnswerIndex = 1,
                    explanation = "Teks menegaskan: '四肯定是非常不吉祥的数字，因为“四”听起来像“死”，这是中国人最不喜欢的民思之一了'."
                )
            )
        ),

        // Cerita Mandarin Bean 279 (HSK 3): Too Much Homework (Beban PR Berlebih dan Kesehatan Mata)
        Story(
            id = "story_too_much_homework",
            titleHanzi = "小学生繁重作业与健康",
            titlePinyin = "Xiǎoxuéshēng Fánzhòng Zuòyè yǔ Jiànkāng",
            titleTranslation = "Too Much Homework (Beban PR dan Kesehatan Penglihatan)",
            level = "HSK 3",
            category = "Pendidikan & Kesehatan Anak",
            description = "Kasus nyata seorang siswi kelas 6 SD yang mengalami radang saraf mata akibat kurang tidur karena kerap begadang mengerjakan PR, memicu seruan pengurangan beban akademik anak.",
            coverEmoji = "👓",
            coverImageRes = R.drawable.cover_story_too_much_homework,
            estimatedReadMinutes = 2,
            sentences = listOf(
                Sentence(
                    id = "s_toomhw_1",
                    hanzi = "一名小学六年级女童因眼部剧痛、视物模糊失明被紧急送医，确诊患上急性视神经视网膜炎，经医护抢救视力方得以逐渐恢复。",
                    pinyin = "yī míng xiǎo xué liù nián jí nǚ tóng yīn yǎn bù jù tòng shì wù mó hu shī míng bèi jǐn jí sòng yī què zhěn huàn shàng jí xìng shì shén jīng shì wǎng mó yán jīng yī hù qiǎng jiù shì lì fāng dé yǐ zhú jiàn huī fù",
                    translation = "Seorang siswi kelas enam SD dilarikan ke rumah sakit karena sakit mata parah hingga tak dapat melihat cahaya; dokter mendiagnosisnya menderita radang saraf retina akut, dan setelah penanganan medis penglihatannya mulai pulih perlahan.",
                    tokens = listOf(
                        WordToken("年级", "nián jí", "grade / class year", "Kosakata HSK 2: 年级 (nián jí)"),
                        WordToken("检查", "jiǎn chá", "to inspect / examine", "Kosakata HSK 3: 检查 (jiǎn chá)"),
                        WordToken("视力", "shì lì", "vision / eyesight", "Kosakata medis HSK 3"),
                        WordToken("恢复", "huī fù", "to recover / restore", "Kosakata HSK 3: 恢复 (huī fù)")
                    )
                ),
                Sentence(
                    id = "s_toomhw_2",
                    hanzi = "家长痛心透露女童写字作业速度偏慢，每日不得不频繁熬夜伏案，长年睡眠仅区区六小时，极端疲劳与用眼过度终致免疫崩溃。",
                    pinyin = "jiā zhǎng tòng xīn tòu lù nǚ tóng xiě zì zuò yè sù dù piān màn měi rì bù dé bù pín fán áo yè fú àn cháng nián shuì mián jǐn qū qū liù xiǎo shí jí duān pí láo yǔ yòng yǎn guò dù zhōng zhì miǎn yì bēng kuì",
                    translation = "Orang tua dengan pilu menceritakan bahwa sang anak lambat dalam mencatat PR sehingga setiap hari harus begadang, tidur hanya 6 jam sehari; kelelahan ekstrem dan ketegangan mata berlebih akhirnya memicu penyakit tersebut.",
                    tokens = listOf(
                        WordToken("作业", "zuò yè", "homework", "Kosakata HSK 3: 作业 (zuò yè)"),
                        WordToken("常常", "cháng cháng", "often / frequently", "Kosakata HSK 2: 常常 (cháng cháng)"),
                        WordToken("熬夜", "áo yè", "stay up late", "Kosakata HSK 3: 熬夜 (áo yè)"),
                        WordToken("慢", "màn", "slow", "Kosakata HSK 2: 慢 (màn)")
                    )
                ),
                Sentence(
                    id = "s_toomhw_3",
                    hanzi = "该突发病例引发社会共鸣，家长与医学专家联名呼吁学校应当科学适度布置课外作业，切实保障少年儿童身心茁壮成长。",
                    pinyin = "gāi tū fā bìng lì yǐn fā shè huì gòng míng jiā zhǎng yǔ yī xué zhuān jiā lián míng hū yù xué xiào yīng dāng kē xué shì dù bù zhì kè wài zuò yè qiè shí bǎo zhàng shào nián ér tóng shēn xīn zhuó zhuàng chéng zhǎng",
                    translation = "Kasus ini memicu perhatian luas di masyarakat; orang tua dan pakar medis menyerukan agar sekolah memberikan tugas pekerjaan rumah secara wajar dan terukur, demi menjaga kesehatan jasmani dan rohani anak-anak.",
                    tokens = listOf(
                        WordToken("希望", "xī wàng", "to hope", "Kosakata HSK 2: 希望 (xī wàng)"),
                        WordToken("适当", "shì dàng", "appropriate / suitable", "Kosakata HSK 3: 适当 (shì dàng)"),
                        WordToken("布置", "bù zhì", "to assign (homework) / arrange", "Kosakata HSK 3: 布置")
                    )
                )
            ),
            questions = listOf(
                StoryQuestion(
                    id = "q_toomhw_1",
                    questionText = "故事中送医急救的小学六年级女童出现了怎样危急的突发眼部病症？ (Gejala darurat apa yang dialami siswi kelas 6 SD hingga dilarikan ke rumah sakit?)",
                    options = listOf("眼睛剧烈疼痛，甚至完全看不到外界光线（视力受损） (Mata terasa amat sakit dan sama sekali tidak bisa melihat cahaya)", "眼睫毛突然全部脱落 (Bulu mata rontok)", "眼睛变成奇异蓝色 (Mata berubah warna biru)", "戴眼镜滑落摔碎 (Kacamata pecah)"),
                    correctAnswerIndex = 0,
                    explanation = "Teks menyatakan: '一个中国六年级的小学生因为眼睛痛，看不到光，被带去医院检查'."
                ),
                StoryQuestion(
                    id = "q_toomhw_2",
                    questionText = "导致该幼童眼底神经严重急性病变的日常诱因主要是哪项生活作息负担？ (Penyebab utama beban fisik apa yang memicu radang saraf mata anak tersebut?)",
                    options = listOf("整天在烈日下踢足球 (Main bola di bawah terik)", "做作业速度偏慢而频繁熬夜写作业，每天严重睡眠不足仅睡6小时 (Mengerjakan PR lambat sehingga kerap begadang dan hanya tidur 6 jam sehari)", "天天偷看电脑恐怖片 (Nonton film horor)", "偷吃大量生辣椒 (Makan cabai mentah)"),
                    correctAnswerIndex = 1,
                    explanation = "Teks mencatat: '因为这个孩子做作业做得慢，常常需要熬夜写作业，一天只能睡六个小时'."
                ),
                StoryQuestion(
                    id = "q_toomhw_3",
                    questionText = "家长在孩子病况好转后，向现代学校教育管理制度提出了怎样的诚恳期盼？ (Harapan apa yang disampaikan orang tua kepada pihak sekolah seusai musibah ini?)",
                    options = listOf("废除所有的期末考试 (Hapus ujian akhir)", "学校能够更加科学、合理、适度地布置课外作业 (Pihak sekolah diharapkan memberikan tugas PR secara wajar dan terukur)", "把学生全部转为线上授课 (Ganti kelas online penuh)", "禁止在课堂上使用黑板 (Dilarang pakai papan tulis)"),
                    correctAnswerIndex = 1,
                    explanation = "Teks menyimpulkan: '希望学校能适当布置作业'."
                )
            )
        ),

        // Cerita Mandarin Bean 280 (HSK 3): Green Hat (Makna Budaya Topi Hijau)
        Story(
            id = "story_green_hat",
            titleHanzi = "汉语言语中的“绿帽子”",
            titlePinyin = "Hànyǔ Yányǔ zhōng de Lǜ Màozi",
            titleTranslation = "Green Hat (Makna Kiasan Budaya 'Topi Hijau')",
            level = "HSK 3",
            category = "Budaya & Bahasa Kiasan",
            description = "Edukasi sosiolinguistik penting mengenai kiasan 'dài lǜ màozi' (memakai topi hijau) dalam bahasa Mandarin yang melambangkan pengkhianatan pasangan, serta pantangan menghadiahkan topi hijau.",
            coverEmoji = "🧢",
            coverImageRes = R.drawable.cover_story_green_hat,
            estimatedReadMinutes = 1,
            sentences = listOf(
                Sentence(
                    id = "s_grnhat_1",
                    hanzi = "在中华文化语境中“绿帽子”绝非寻常服饰：若一人伴侣与他人暗生私情出轨，便被称为“戴了绿帽子”或“被戴了绿帽子”。",
                    pinyin = "zài Zhōng huá wén huà yǔ jìng zhōng lǜ mào zi jué fēi xún cháng fú shì ruò yī rén bàn lǚ yǔ tā rén àn shēng sī qíng chū guǐ biàn bèi chēng wèi dài le lǜ mào zi huò bèi dài le lǜ mào zi",
                    translation = "Dalam konteks kebudayaan Tionghoa istilah 'topi hijau' bukanlah pakaian biasa: jika pasangan seseorang berselingkuh dengan pihak lain, maka orang tersebut diistilahkan 'memakai topi hijau' (*dài lǜ màozi*).",
                    tokens = listOf(
                        WordToken("绿色", "lǜ sè", "green", "Kosakata HSK 2: 绿色 (lǜ sè)"),
                        WordToken("帽子", "mào zi", "hat / cap", "Kosakata HSK 3: 帽子 (mào zi)"),
                        WordToken("伴侣", "bàn lǚ", "companion / partner", "Kosakata HSK 3: 伴侣"),
                        WordToken("出轨", "chū guǐ", "infidelity / extramarital affair", "Istilah sosial")
                    )
                ),
                Sentence(
                    id = "s_grnhat_2",
                    hanzi = "因被戴绿帽在传统道德观中被视作极具羞辱丢人之事，故若见真有人懵懂佩戴绿顶帽子，难免招致旁人窃窃取笑暗讽。",
                    pinyin = "yīn bèi dài lǜ mào zài chuán tǒng dào dé guān zhōng bèi shì zuò jí jù xiū rǔ diū rén zhī shì gù ruò jiàn zhēn yǒu rén měng dǒng pèi dài lǜ dǐng mào zi nán miǎn zhāo zhì páng rén qiè qiè qǔ xiào àn fěng",
                    translation = "Karena 'diberi topi hijau' dipandang sebagai aib perselingkuhan yang memalukan (*diūrén*), maka jika ada orang asing yang benar-benar mengenakan topi warna hijau di jalan, orang sekitar sering menertawakannya.",
                    tokens = listOf(
                        WordToken("戴", "dài", "to wear (hat/accessories)", "Kosakata HSK 3: 戴 (dài)"),
                        WordToken("丢人", "diū rén", "humiliating / lose face", "Kosakata HSK 3: 丢人 (diū rén)"),
                        WordToken("笑话", "xiào hua", "to laugh at / joke", "Kosakata HSK 3: 笑话 (xiào hua)")
                    )
                ),
                Sentence(
                    id = "s_grnhat_3",
                    hanzi = "正因如此，人际馈赠礼品之际必须恪守严明常识规矩，切勿向任何中国朋友赠送绿色帽饰以免招致难堪大忌。",
                    pinyin = "zhèng yīn rú cǐ rén jì kuì zèng lǐ pǐn zhī jì bì xū kè shǒu yán míng cháng shí guī ju qiè wù xiàng rèn hé Zhōng guó péng you zèng sòng lǜ sè mào shì yǐ miǎn zhāo zhì nán kān dà jì",
                    translation = "Oleh sebab itu, dalam etika memberi bingkisan hadiah kepada rekan atau sahabat Tionghoa, dilarang keras menghadiahkan topi warna hijau demi menjaga perasaan dan kesopanan.",
                    tokens = listOf(
                        WordToken("礼物", "lǐ wù", "gift / present", "Kosakata HSK 2: 礼物 (lǐ wù)"),
                        WordToken("送", "sòng", "to give as gift", "Kosakata HSK 2: 送 (sòng)"),
                        WordToken("别人", "bié ren", "other people", "Kosakata HSK 2: 别人 (bié ren)")
                    )
                )
            ),
            questions = listOf(
                StoryQuestion(
                    id = "q_grnhat_1",
                    questionText = "在现代汉语惯用俗语中，“戴绿帽子”或“被戴绿帽子”通常指代遭遇了何种感情变故？ (Dalam ungkapan bahasa Mandarin sehari-hari, 'dài lǜ màozi' bermakna apa?)",
                    options = listOf("自己的恋爱伴侣或配偶对感情不忠、与他人出轨背叛 (Pasangan/istri berselingkuh dan mengkhianati hubungan percintaan)", "在森林公园迷路 (Tersesat di hutan)", "被提拔为环保局长 (Diangkat jadi kepala dinas lingkungan)", "购买了全套绿色西装 (Membeli setelan jas hijau)"),
                    correctAnswerIndex = 0,
                    explanation = "Teks menyatakan: '因为如果一个人的伴侣和别人出轨了，那这个人就是戴了绿帽子，或者说这个人被戴了绿帽子'."
                ),
                StoryQuestion(
                    id = "q_grnhat_2",
                    questionText = "在中国公众街头，如果有一位不明就里的外国人真的戴了一顶鲜绿色的帽子，可能会遭遇什么尴尬场面？ (Apa yang bisa terjadi jika ada orang yang benar-benar memakai topi hijau di jalan?)",
                    options = listOf("被警察当场扣押 (Ditahan polisi)", "可能招来路人不解的侧目和善意的暗暗笑话（耻笑嘲弄） (Dilihat heran dan ditertawakan geli oleh orang-orang di jalan)", "商家免费赠送矿泉水 (Dikasih air gratis)", "被邀请上电视新闻当模特 (Diundang jadi model)"),
                    correctAnswerIndex = 1,
                    explanation = "Teks menjelaskan: '被戴绿帽子是很丢人的事情，所以如果中国人看到有人真的戴绿色的帽子可能会笑话这个人'."
                ),
                StoryQuestion(
                    id = "q_grnhat_3",
                    questionText = "基于深厚的文化禁忌，在向中国友人挑选赠送礼品时，必须牢记哪项避讳准则？ (Pantangan baku apa yang harus diingat saat membelikan hadiah bagi kawan Tionghoa?)",
                    options = listOf("严禁赠送任何甜味点心 (Dilarang kasih kue)", "绝对不要把绿颜色的帽子作为礼物赠送给别人 (Jangan pernah membelikan atau menghadiahkan topi warna hijau kepada orang lain)", "不能赠送书籍 (Tidak boleh kasih buku)", "只能在清晨送礼 (Hanya boleh beri kado pagi hari)"),
                    correctAnswerIndex = 1,
                    explanation = "Teks mengingatkan: '我们在送礼物的时候，也不会送给别人绿色的帽子'."
                )
            )
        ),

        // Cerita Mandarin Bean 281 (HSK 3): Know the ropes (Kuda Tua yang Mengenal Jalan)
        Story(
            id = "story_know_the_ropes",
            titleHanzi = "成语：老马识途",
            titlePinyin = "Chéngyǔ: Lǎomǎ Shítú",
            titleTranslation = "Know the ropes (Peribahasa: Kuda Tua Tahu Jalan Pulang)",
            level = "HSK 3",
            category = "Sejarah & Peribahasa (Chengyu)",
            description = "Kisah klasik zaman Negara Berperang: Pasukan Qi tersesat di lembah gunung saat pulang; penasihat militer melepaskan kuda-kuda tua yang secara alami hafal jalan pulang dan menyelamatkan pasukan.",
            coverEmoji = "🐎",
            coverImageRes = R.drawable.cover_story_know_the_ropes,
            estimatedReadMinutes = 2,
            sentences = listOf(
                Sentence(
                    id = "s_laomst_1",
                    hanzi = "中国古代战国时期齐国军队出征获胜班师回朝，因地形生疏误入险峻山谷陷入迷途，全军困顿难脱。",
                    pinyin = "Zhōng guó gǔ dài Zhàn guó shí qī Qí guó jūn duì chū zhēng huò shèng bān shī huí cháo yīn dì xíng shēng shū wù rù xiǎn jùn shān gǔ xiàn rù mí tú quán jūn kùn dùn nán tuō",
                    translation = "Pada zaman Negara Berperang di Tiongkok kuno, pasukan militer Negeri Qi menang perang dan bersiap pulang; namun karena tidak akrab dengan rute perjalanan mereka tersesat di sebuah lembah pegunungan terjal yang berbahaya.",
                    tokens = listOf(
                        WordToken("古代", "gǔ dài", "ancient times", "Kosakata HSK 3: 古代 (gǔ dài)"),
                        WordToken("军队", "jūn duì", "army / troops", "Pasukan militer"),
                        WordToken("危险", "wēi xiǎn", "dangerous", "Kosakata HSK 3: 危险 (wēi xiǎn)"),
                        WordToken("山谷", "shān gǔ", "valley / canyon", "Bentang alam: 山谷"),
                        WordToken("迷路", "mí lù", "to lose one's way / get lost", "Kosakata HSK 3: 迷路 (mí lù)")
                    )
                ),
                Sentence(
                    id = "s_laomst_2",
                    hanzi = "足智多谋的齐国军师献策：老马无论行路多远皆能本能铭记归途；全军遂纵放老马在前引路，果然从容寻得生路脱离险境。",
                    pinyin = "zú zhì duō móu de Qí guó jūn shī xiàn cè lǎo mǎ wú lùn xíng lù duō yuǎn jiē néng běn néng míng jì guī tú quán jūn suì zòng fàng lǎo mǎ zài qián yǐn lù guǒ rán cóng róng xún dé shēng lù tuō lí xiǎn jìng",
                    translation = "Penasihat militer Negeri Qi yang cerdik memberikan strategi: kuda tua betapa pun jauhnya berjalan pasti mampu mengingat rute jalan pulang saat ia datang; seluruh prajurit lalu berbaris mengikuti di belakang kuda-kuda tua dan benar saja mereka berhasil menemukan jalan keluar.",
                    tokens = listOf(
                        WordToken("聪明", "cōng míng", "clever / smart", "Kosakata HSK 2: 聪明 (cōng míng)"),
                        WordToken("不论", "bù lùn", "no matter how / regardless", "Tata bahasa HSK 3: 不论 (bù lùn)"),
                        WordToken("果然", "guǒ rán", "sure enough / as expected", "Kosakata HSK 3: 果然 (guǒ rán)")
                    )
                ),
                Sentence(
                    id = "s_laomst_3",
                    hanzi = "成语“老马识途”由此流传千古，用以赞誉资深富有经验之人深谙门道规律，在迷津中能够独具慧眼指引正确方向。",
                    pinyin = "chéng yǔ lǎo mǎ shí tú yóu cǐ liú chuán qiān gǔ yòng yǐ zàn yù zī shēn fù yǒu jīng yàn zhī rén shēn ān mén dào guī lǜ zài mí jīn zhōng néng gòu dú jù huì yǎn zhǐ yǐn zhèng què fāng xiàng",
                    translation = "Peribahasa 'lǎo mǎ shí tú' (kuda tua mengenal jalan) semenjak itu menjadi ungkapan yang populer hingga kini, yang digunakan sebagai pujian bagi orang yang kaya pengalaman dan menguasai seluk-beluk suatu persoalan.",
                    tokens = listOf(
                        WordToken("成语", "chéng yǔ", "idiom / set phrase", "Kosakata HSK 3: 成语 (chéng yǔ)"),
                        WordToken("老马识途", "lǎo mǎ shí tú", "old horse knows the way / experienced", "Peribahasa HSK 3"),
                        WordToken("经验", "jīng yàn", "experience", "Kosakata HSK 3: 经验 (jīng yàn)"),
                        WordToken("熟悉", "shú xi", "familiar with", "Kosakata HSK 3: 熟悉 (shú xi)")
                    )
                )
            ),
            questions = listOf(
                StoryQuestion(
                    id = "q_laomst_1",
                    questionText = "战国时期齐国军队在打完胜仗胜利班师归途时，遇到了什么危急难题？ (Kesulitan genting apa yang dihadapi tentara Negeri Qi saat pulang?)",
                    options = listOf("遭遇洪水冲走粮草 (Banjir hanyutkan logistik)", "因对沿途地形地貌完全不熟悉，大军误入险峻山谷彻底迷路 (Karena tidak hafal rute, pasukan masuk lembah dan tersesat total)", "兵器被敌人全部偷走 (Senjata dicuri)", "马匹全部中暑生病 (Semua kuda sakit)"),
                    correctAnswerIndex = 1,
                    explanation = "Teks menyatakan: '在齐国的军队胜利返回时，因为不熟悉路，走进了一个危险的山谷，迷路了'."
                ),
                StoryQuestion(
                    id = "q_laomst_2",
                    questionText = "齐国军师想出了什么巧妙独特的脱困妙计带领全军成功突围寻回出路？ (Taktik cerdik apa yang diusulkan penasihat perang Negeri Qi untuk keluar dari lembah?)",
                    options = listOf("就地放火烧山开路 (Membakar gunung)", "利用老马具有无论走多远都能凭借本能认出来时老路的生物习性，让大军跟在老马后面走 (Memanfaatkan insting kuda tua yang selalu ingat jalan pulang dan menyuruh pasukan mengikutinya)", "全军原地等待直升机 (Tunggu helikopter)", "向敌军投降求饶问路 (Menyerah demi tanya jalan)"),
                    correctAnswerIndex = 1,
                    explanation = "Teks menjelaskan: '齐国军师说：老马不论走多远，总是能从来时的路走回去。果然，齐国的这些军队跟在老马后面，走出了这个地方，找到了路'."
                ),
                StoryQuestion(
                    id = "q_laomst_3",
                    questionText = "经典成语“老马识途”在现代汉语表达中，通常用来比喻或夸奖什么样的人？ (Peribahasa 'lǎo mǎ shí tú' dalam bahasa Mandarin modern digunakan untuk memuji orang yang bagaimana?)",
                    options = listOf("擅长骑马的驯马师 (Pelatih kuda)", "富有丰富实践经验、熟悉业务门道从而能够独当一面的资深人士 (Orang yang banyak pengalaman, menguasai bidangnya, dan tahu cara mengatasi masalah)", "年纪虽大但记忆力极差的老人 (Orang tua pikun)", "从来不听别人意见的人 (Orang keras kepala)"),
                    correctAnswerIndex = 1,
                    explanation = "Teks menyimpulkan: '“老马识途”这个成语的意思就是说有经验的人对事情比较熟悉，是一种夸奖'."
                )
            )
        ),

        // Cerita Mandarin Bean 282 (HSK 3): The Skilled-Art of Slaughtering Dragons (Keahlian Menyembelih Naga)
        Story(
            id = "story_slaughtering_dragons",
            titleHanzi = "成语：屠龙之技",
            titlePinyin = "Chéngyǔ: Túlóng zhī Jì",
            titleTranslation = "The Skilled-Art of Slaughtering Dragons (Keahlian Tanpa Guna)",
            level = "HSK 3",
            category = "Filsafat & Peribahasa (Chengyu)",
            description = "Fabel filsafat Zhuangzi: Zhu Pingman menghabiskan seluruh harta dan waktu 3 tahun belajar ilmu menyembelih naga; setelah mahir sempurna, baru tersadar di dunia ini tak ada naga sama sekali.",
            coverEmoji = "🐉",
            coverImageRes = R.drawable.cover_story_slaughtering_dragons,
            estimatedReadMinutes = 1,
            sentences = listOf(
                Sentence(
                    id = "s_tulngj_1",
                    hanzi = "古人朱泙漫一心渴望习得冠绝天下的奇特绝技，得悉世间有人精通神乎其神的“屠龙之术”，便倾慕登门拜师学艺。",
                    pinyin = "gǔ rén Zhū Píng màn yī xīn kě wàng xí dé guàn jué tiān xià de qí tè jué jì dé xī shì jiān yǒu rén jīng tōng shén hū qí shén de tú lóng zhī shù biàn qīng mù dēng mén bài shī xué yì",
                    translation = "Pada zaman dahulu ada seseorang bernama Zhu Pingman yang sangat berhasrat mempelajari suatu keahlian luar biasa yang tiada tandingannya; mendengar ada orang yang konon pandai menyembelih naga (túlóng), ia segera berguru kepadanya.",
                    tokens = listOf(
                        WordToken("从前", "cóng qián", "once upon a time", "Kosakata HSK 3: 从前 (cóng qián)"),
                        WordToken("奇特", "qí tè", "peculiar / unique", "Kosakata HSK 3: 奇特"),
                        WordToken("本领", "běn lǐng", "skill / ability", "Kosakata HSK 3: 本领 (běn lǐng)"),
                        WordToken("屠龙", "tú lóng", "slaughter dragon", "Keahlian membunuh naga")
                    )
                ),
                Sentence(
                    id = "s_tulngj_2",
                    hanzi = "他在师傅门下苦学整整三载，不仅耗尽了家中所积攒的全部金银钱财，终于炉火纯青全面掌握了屠龙的精湛本领。",
                    pinyin = "tā zài shī fu mén xià kǔ xué zhěng zhěng sān zǎi bù jǐn hào jìn le jiā zhōng suǒ jī zǎn de quán bù jīn yín qián cái zhōng yú lú huǒ chún qīng quán miàn zhǎng wò le tú lóng de jīng zhàn běn lǐng",
                    translation = "Ia tekun belajar di padepokan sang guru selama tiga tahun penuh, menghabiskan seluruh harta kekayaan milik keluarganya sampai tandas, hingga akhirnya benar-benar menguasai ilmu menyembelih naga tersebut.",
                    tokens = listOf(
                        WordToken("所有", "suǒ yǒu", "all / everything", "Kosakata HSK 3: 所有 (suǒ yǒu)"),
                        WordToken("花光", "huā guāng", "to spend all / exhaust money", "Kosakata HSK 3: 光 (guāng)"),
                        WordToken("学会", "xué huì", "to learn and master", "Kosakata HSK 2: 学会")
                    )
                ),
                Sentence(
                    id = "s_tulngj_3",
                    hanzi = "然而现实世界原本就不存在龙这种神话虚幻生物，成语“屠龙之技”因而辛辣讽刺那些徒有虚名、脱离实际毫无用途的高深本领。",
                    pinyin = "rán ér xiàn shí shì jiè yuán běn jiù bù cún zài lóng zhè zhǒng shén huà xū huàn shēng wù chéng yǔ tú lóng zhī jì yīn ér xīn là fěng cì nà xiē tú yǒu xū míng tuō lí shí jì háo wú yòng tu de gāo shēn běn lǐng",
                    translation = "Namun di dunia nyata alam semesta ini pada dasarnya sama sekali tidak ada makhluk bernama naga; peribahasa 'tú lóng zhī jì' (keahlian membantai naga) digunakan untuk menyindir keahlian rumit yang sama sekali tidak memiliki guna praktis.",
                    tokens = listOf(
                        WordToken("本来", "běn lái", "originally", "Kosakata HSK 3: 本来 (běn lái)"),
                        WordToken("实际", "shí jì", "practical / actual", "Kosakata HSK 3: 实际 (shí jì)"),
                        WordToken("用处", "yòng chu", "use / usefulness", "Kosakata HSK 3: 用处 (yòng chu)"),
                        WordToken("比喻", "bǐ yù", "metaphor / to compare", "Kosakata sastra HSK 3: 比喻")
                    )
                )
            ),
            questions = listOf(
                StoryQuestion(
                    id = "q_tulngj_1",
                    questionText = "朱泙漫为了学到世间罕见的“屠龙高超本领”，付出了怎样巨大沉重的人生代价？ (Pengorbanan besar apa yang dikeluarkan Zhu Pingman demi mempelajari ilmu memotong naga?)",
                    options = listOf("在深山服苦役十年 (Kerja paksa 10 tahun)", "耗费了整整三年青春时间，把家里所有的积蓄钱财全部花光 (Menghabiskan waktu 3 tahun dan menguras habis seluruh harta keluarga)", "自断一条手臂 (Memotong lengan sendiri)", "放弃了状元及第的仕途 (Lepas jabatan menteri)"),
                    correctAnswerIndex = 1,
                    explanation = "Teks menyatakan: '朱泙漫在老师那儿学习了三年，把家里所有的钱都花光了，才把屠龙的本领学会'."
                ),
                StoryQuestion(
                    id = "q_tulngj_2",
                    questionText = "朱泙漫学成出师之后，所面临的最大尴尬荒谬困境是什么？ (Situasi konyol apa yang dihadapi Zhu Pingman setelah menguasai ilmunya?)",
                    options = listOf("龙身躯太大搬不动 (Naga terlalu besar)", "现实世界里本来就根本没有任何真正龙的存在，高深绝技毫无用武之地 (Di dunia nyata sama sekali tidak ada naga, sehingga ilmunya tak bisa terpakai)", "他的宝刀生锈断裂 (Pedangnya karatan)", "村民们禁止他杀生 (Warga melarang membunuh hewan)"),
                    correctAnswerIndex = 1,
                    explanation = "Teks menjelaskan: '但是这个世界上本来就没有龙，他到哪里去用这个奇特的本领呢？'."
                ),
                StoryQuestion(
                    id = "q_tulngj_3",
                    questionText = "出自庄子哲学的成语“屠龙之技”在现代生活中用来比喻什么？ (Peribahasa filsafat 'tú lóng zhī jì' digunakan untuk mengibaratkan apa dalam kehidupan?)",
                    options = listOf("高超的厨艺切肉刀功 (Keahlian memotong daging di dapur)", "看似高深奇特、实则脱离实际毫无现实用处的本领或空洞学问 (Keahlian rumit muluk-muluk yang pada kenyataannya tidak ada manfaat praktisnya sama sekali)", "勇敢与恶势力作斗争的英雄 (Pahlawan melawan kejahatan)", "善于捕蛇的民间艺人 (Pawang ular)"),
                    correctAnswerIndex = 1,
                    explanation = "Teks menyimpulkan: '“屠龙之技”的意思就是杀龙的本领，用来比喻那些没有实际用处的所谓的奇特本领'."
                )
            )
        ),

        // Cerita Mandarin Bean 283 (HSK 3): Gild the Lily (Menggambar Kaki Ular)
        Story(
            id = "story_gild_the_lily",
            titleHanzi = "成语：画蛇添足",
            titlePinyin = "Chéngyǔ: Huà Shé Tiān Zú",
            titleTranslation = "Gild the Lily (Peribahasa: Menggambar Kaki Ular)",
            level = "HSK 3",
            category = "Sejarah & Peribahasa (Chengyu)",
            description = "Kisah klasik Negara Chu: Beberapa orang bertanding menggambar ular tercepat di tanah demi memperebutkan guci anggur; sang juara yang sudah selesai malah iseng menambahkan kaki pada ular dan kehilangan hadiahnya.",
            coverEmoji = "🐍",
            coverImageRes = R.drawable.cover_story_gild_the_lily,
            estimatedReadMinutes = 1,
            sentences = listOf(
                Sentence(
                    id = "s_huastz_1",
                    hanzi = "战国楚国祠堂执事祭祀完毕分酒，因美酒仅有一壶人多不足，众人便立约竞赛：在地上画蛇最先完工者独享美酒。",
                    pinyin = "Zhàn guó Chǔ guó cí táng zhí shì jì sì wán bì fēn jiǔ yīn měi jiǔ jǐn yǒu yī hú rén duō bù zú zhòng rén biàn lì yuē jìng sài zài dì shàng huà shé zuì xiān wán gōng zhě dú xiǎng měi jiǔ",
                    translation = "Pada zaman Negara Berperang, seorang pengurus kuil di Negeri Chu hendak membagikan arak setelah upacara; karena araknya hanya ada satu guci dan tidak cukup untuk semua staf, mereka membuat perlombaan: siapa yang paling cepat menggambar ular di tanah berhak meminumnya.",
                    tokens = listOf(
                        WordToken("比赛", "bǐ sài", "competition / match", "Kosakata HSK 2: 比赛 (bǐ sài)"),
                        WordToken("画", "huà", "to draw / paint", "Kosakata HSK 3: 画 (huà)"),
                        WordToken("蛇", "shé", "snake", "Hewan reptil: 蛇"),
                        WordToken("酒", "jiǔ", "alcohol / wine", "Kosakata HSK 3: 酒 (jiǔ)")
                    )
                ),
                Sentence(
                    id = "s_huastz_2",
                    hanzi = "一人飞速画毕，自矜速度冠绝全场，见旁人尚在涂抹，得意忘形之下又擅自给画中的长蛇添画上四只爪脚。",
                    pinyin = "yī rén fēi sù huà bì zì jīn sù dù guàn jué quán chǎng jiàn páng rén shàng zài tú mǒ dé yì wàng xíng zhī xià yòu shàn zì gěi huà zhōng de cháng shé tiān huà shàng sì zhī zhǎo jiǎo",
                    translation = "Salah satu orang berhasil menggambar ular paling cepat; namun setelah selesai melihat orang lain belum rampung, ia terlalu percaya diri dan iseng menambahkan kaki-kaki pada gambar ularnya.",
                    tokens = listOf(
                        WordToken("发现", "fā xiàn", "to discover / find", "Kosakata HSK 3: 发现 (fā xiàn)"),
                        WordToken("脚", "jiǎo", "foot / leg", "Kosakata HSK 3: 脚 (jiǎo)"),
                        WordToken("快", "kuài", "fast", "Kosakata HSK 2: 快 (kuài)")
                    )
                ),
                Sentence(
                    id = "s_huastz_3",
                    hanzi = "此时次席画成者当机立断夺酒一饮而尽嘲讽道：“蛇本无脚，安能添足！”成语“画蛇添足”遂用以讥讽画蛇添足、多此一举弄巧成拙。",
                    pinyin = "cǐ shí cì xí huà chéng zhě dāng jī lì duàn duó jiǔ yī yǐn ér jìn cháo fěng dào shé běn wú jiǎo ān néng tiān zú chéng yǔ huà shé tiān zú suì yòng yǐ jī fěng huà shé tiān zú duō cǐ yī jǔ nòng qiǎo chéng zhuō",
                    translation = "Tepat pada saat itu orang kedua selesai menggambar dan langsung merebut guci arak lalu meminumnya seraya berujar: 'Ular pada dasarnya tidak punya kaki, kenapa kamu malah menambahkan kaki?!'; peribahasa 'huà shé tiān zú' (menggambar kaki ular) digunakan untuk menyindir tindakan berlebihan yang mubazir dan merusak.",
                    tokens = listOf(
                        WordToken("抢", "qiǎng", "to snatch / grab", "Kosakata HSK 3: 抢 (qiǎng)"),
                        WordToken("画蛇添足", "huà shé tiān zú", "draw legs on a snake / ruin by adding superfluous", "Peribahasa klasik populer"),
                        WordToken("形容", "xíng róng", "to describe", "Kosakata HSK 3: 形容 (xíng róng)"),
                        WordToken("多余", "duō yú", "superfluous / unnecessary", "Kosakata HSK 3: 多余 (duō yú)")
                    )
                )
            ),
            questions = listOf(
                StoryQuestion(
                    id = "q_huastz_1",
                    questionText = "战国楚国祭祀执事人员在瓜分仅存的一壶美酒时，达成了怎样的竞技获胜规则？ (Aturan lomba apa yang disepakati untuk memperebutkan satu guci arak?)",
                    options = listOf("比赛射箭谁最准 (Lomba memanah)", "在地面上画蛇，谁最先最快画好，谁就可以赢得这壶酒 (Berlomba menggambar ular di tanah, siapa tercepat selesai berhak meminum arak)", "看谁跑得最远 (Lomba lari terjauh)", "背诵古书最多的得酒 (Menghafal buku terbanyak)"),
                    correctAnswerIndex = 1,
                    explanation = "Teks menyatakan: '大家比赛在地上画蛇，画得最快的人就可以喝酒'."
                ),
                StoryQuestion(
                    id = "q_huastz_2",
                    questionText = "那个最先画完蛇的人，为什么不仅没能喝到酒，反而把美酒拱手输给了第二名？ (Mengapa orang yang menggambar paling cepat malah kehilangan hadiah araknya?)",
                    options = listOf("他在画完蛇后得意忘形，又多此一举地给蛇画上了几只脚 (Karena merasa sudah menang, ia iseng menambahkan kaki pada gambar ular)", "他把酒壶不小心碰翻摔碎了 (Menjatuhkan guci)", "第二名用武力打晕了他 (Dipukul orang kedua)", "他的墨水被风吹干了 (Tintanya mengering tertiup angin)"),
                    correctAnswerIndex = 0,
                    explanation = "Teks menjelaskan: '画好以后他发现其他人都没有画完，他就又给蛇画了脚。另一个人刚好画完，就把酒抢了过来，说：蛇本来就没有脚'."
                ),
                StoryQuestion(
                    id = "q_huastz_3",
                    questionText = "家喻户晓的汉语成语“画蛇添足”在现代语文表达中用来形容什么行为？ (Apa makna peribahasa klasik terkenal 'huà shé tiān zú' dalam percakapan sehari-hari?)",
                    options = listOf("形容绘画技艺炉火纯青 (Keahlian melukis sangat tinggi)", "形容做了多余、毫无益处甚至反而把事情办坏办砸的愚蠢举动 (Melakukan perbuatan berlebihan yang mubazir, tidak ada faedahnya, dan justru merusak hasil)", "形容蛇的种类非常多 (Menggambarkan jenis ular banyak)", "形容冬天动物需要穿鞋 (Hewan butuh sepatu di musim dingin)"),
                    correctAnswerIndex = 1,
                    explanation = "Teks menyimpulkan: '这个故事就叫“画蛇添足”。用来形容做了多余的事，不但没有好处，也不合适'."
                )
            )
        )
    )
}
