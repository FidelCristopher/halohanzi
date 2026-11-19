package com.example.chineselearning.data.repository

import com.example.chineselearning.R
import com.example.chineselearning.data.model.Sentence
import com.example.chineselearning.data.model.Story
import com.example.chineselearning.data.model.StoryQuestion
import com.example.chineselearning.data.model.WordToken

val mandarinBeanStoriesPart18: List<Story> by lazy {
    listOf(
        // Cerita Mandarin Bean 195 (HSK 3): Wang Peng's Day (Hari Wang Peng)
        Story(
            id = "story_wang_pengs_day",
            titleHanzi = "王朋的一天",
            titlePinyin = "Wáng Péng de Yītiān",
            titleTranslation = "Wang Peng's Day (Hari Wang Peng)",
            level = "HSK 3",
            category = "Cerita & Aktivitas",
            description = "Mengikuti kegiatan akhir pekan Wang Peng mulai dari joging pagi bersama sahabatnya hingga bersiap naik kereta untuk berlibur.",
            coverEmoji = "🏃",
            coverImageRes = R.drawable.cover_story_wang_pengs_day,
            estimatedReadMinutes = 3,
            sentences = listOf(
                Sentence(
                    id = "s_wpday_1",
                    hanzi = "王朋在北京一家公司工作。因为平时的工作非常忙，所以到了星期六，他就会做一些自己喜欢的运动。",
                    pinyin = "Wáng Péng zài Běi jīng yī jiā gōng sī gōng zuò yīn wèi píng shí de gōng zuò fēi cháng máng suǒ yǐ dào le xīng qī liù tā jiù huì zuò yī xiē zì jǐ xǐ huan de yùn dòng",
                    translation = "Wang Peng bekerja di sebuah perusahaan di Beijing. Karena hari-hari biasa pekerjaannya sangat sibuk, maka saat hari Sabtu tiba, ia akan melakukan beberapa olahraga yang disukainya.",
                    tokens = listOf(
                        WordToken("王朋", "Wáng Péng", "Wang Peng (name)", "Nama tokoh: 王朋 (Wáng Péng)"),
                        WordToken("在", "zài", "at / in", "Kosakata HSK 1: 在 (zài)"),
                        WordToken("北京", "Běi jīng", "Beijing", "Kosakata HSK 1: 北京 (Běi jīng)"),
                        WordToken("一家", "yī jiā", "a / one (company)", "Kosakata HSK 2: 一家 (yī jiā)"),
                        WordToken("公司", "gōng sī", "company / firm", "Kosakata HSK 2: 公司 (gōng sī)"),
                        WordToken("工作", "gōng zuò", "to work / job", "Kosakata HSK 1: 工作 (gōng zuò)"),
                        WordToken("因为", "yīn wèi", "because", "Kosakata HSK 2: 因为 (yīn wèi)"),
                        WordToken("平时", "píng shí", "ordinarily / normally", "Kosakata HSK 3: 平时 (píng shí)"),
                        WordToken("的", "de", "possessive particle", "Kosakata HSK 1: 的 (de)"),
                        WordToken("工作", "gōng zuò", "work", "Kosakata HSK 1: 工作 (gōng zuò)"),
                        WordToken("非常", "fēi cháng", "very / extraordinarily", "Kosakata HSK 2: 非常 (fēi cháng)"),
                        WordToken("忙", "máng", "busy", "Kosakata HSK 2: 忙 (máng)"),
                        WordToken("所以", "suǒ yǐ", "therefore / so", "Kosakata HSK 2: 所以 (suǒ yǐ)"),
                        WordToken("到了", "dào le", "arrived at / when reaching", "Kosakata HSK 2: 到了 (dào le)"),
                        WordToken("星期六", "xīng qī liù", "Saturday", "Kosakata HSK 1: 星期六 (xīng qī liù)"),
                        WordToken("他", "tā", "he", "Kosakata HSK 1: 他 (tā)"),
                        WordToken("就", "jiù", "then / at once", "Kosakata HSK 2: 就 (jiù)"),
                        WordToken("会", "huì", "will / can", "Kosakata HSK 1: 会 (huì)"),
                        WordToken("做", "zuò", "to do", "Kosakata HSK 1: 做 (zuò)"),
                        WordToken("一些", "yī xiē", "some / a few", "Kosakata HSK 2: 一些 (yī xiē)"),
                        WordToken("自己", "zì jǐ", "oneself / own", "Kosakata HSK 2: 自己 (zì jǐ)"),
                        WordToken("喜欢", "xǐ huan", "to like", "Kosakata HSK 1: 喜欢 (xǐ huan)"),
                        WordToken("的", "de", "modifying particle", "Kosakata HSK 1: 的 (de)"),
                        WordToken("运动", "yùn dòng", "exercise / sports", "Kosakata HSK 2: 运动 (yùn dòng)")
                    )
                ),
                Sentence(
                    id = "s_wpday_2",
                    hanzi = "上个星期六是晴天。王朋起得比工作日早。早上七点半，他穿上运动的衣服，和朋友李明一起出门跑步。",
                    pinyin = "shàng gè xīng qī liù shì qíng tiān Wáng Péng qǐ de bǐ gōng zuò rì zǎo zǎo shang qī diǎn bàn tā chuān shàng yùn dòng de yī fu hé péng you Lǐ Míng yī qǐ chū mén pǎo bù",
                    translation = "Sabtu lalu cuaca cerah. Wang Peng bangun lebih awal dibandingkan hari kerja biasa. Pukul setengah delapan pagi, ia mengenakan pakaian olahraga lalu pergi joging ke luar bersama sahabatnya, Li Ming.",
                    tokens = listOf(
                        WordToken("上个", "shàng gè", "last / previous", "Kosakata HSK 2: 上个 (shàng gè)"),
                        WordToken("星期六", "xīng qī liù", "Saturday", "Kosakata HSK 1: 星期六 (xīng qī liù)"),
                        WordToken("是", "shì", "to be", "Kosakata HSK 1: 是 (shì)"),
                        WordToken("晴天", "qíng tiān", "sunny day / clear weather", "Kosakata HSK 2: 晴天 (qíng tiān)"),
                        WordToken("王朋", "Wáng Péng", "Wang Peng", "Nama tokoh: 王朋 (Wáng Péng)"),
                        WordToken("起得", "qǐ de", "to get up (degree)", "Kosakata HSK 2: 起得 (qǐ de)"),
                        WordToken("比", "bǐ", "compared to", "Kosakata HSK 2: 比 (bǐ)"),
                        WordToken("工作日", "gōng zuò rì", "working day / weekday", "Kosakata HSK 3: 工作日 (gōng zuò rì)"),
                        WordToken("早", "zǎo", "early", "Kosakata HSK 2: 早 (zǎo)"),
                        WordToken("早上", "zǎo shang", "morning", "Kosakata HSK 1: 早上 (zǎo shang)"),
                        WordToken("七点半", "qī diǎn bàn", "7:30 (half past seven)", "Kosakata HSK 2: 七点半 (qī diǎn bàn)"),
                        WordToken("他", "tā", "he", "Kosakata HSK 1: 他 (tā)"),
                        WordToken("穿上", "chuān shàng", "to put on / wear", "Kosakata HSK 2: 穿上 (chuān shàng)"),
                        WordToken("运动", "yùn dòng", "sports / athletic", "Kosakata HSK 2: 运动 (yùn dòng)"),
                        WordToken("的", "de", "modifying particle", "Kosakata HSK 1: 的 (de)"),
                        WordToken("衣服", "yī fu", "clothes", "Kosakata HSK 1: 衣服 (yī fu)"),
                        WordToken("和", "hé", "with / and", "Kosakata HSK 1: 和 (hé)"),
                        WordToken("朋友", "péng you", "friend", "Kosakata HSK 1: 朋友 (péng you)"),
                        WordToken("李明", "Lǐ Míng", "Li Ming", "Nama tokoh: 李明 (Lǐ Míng)"),
                        WordToken("一起", "yī qǐ", "together", "Kosakata HSK 2: 一起 (yī qǐ)"),
                        WordToken("出门", "chū mén", "to go out / leave home", "Kosakata HSK 2: 出门 (chū mén)"),
                        WordToken("跑步", "pǎo bù", "to jog / run", "Kosakata HSK 2: 跑步 (pǎo bù)")
                    )
                ),
                Sentence(
                    id = "s_wpday_3",
                    hanzi = "家门口的车很少，几只小鸟在路边飞来飞去。他们一起跑了三十分钟。虽然他们觉得有点儿累，但是身体很舒服，心里也很快乐。",
                    pinyin = "jiā mén kǒu de chē hěn shǎo jǐ zhī xiǎo niǎo zài lù biān fēi lái fēi qù tā men yī qǐ pǎo le sān shí fēn zhōng suī rán tā men jué de yǒu diǎnr lèi dàn shì shēn tǐ hěn shū fu xīn lǐ yě hěn kuài lè",
                    translation = "Kendaraan di depan rumah sangat sedikit, beberapa burung beterbangan kian kemari di tepi jalan. Mereka joging bersama selama 30 menit. Walaupun merasa agak lelah, badan mereka terasa sangat segar dan hati mereka pun gembira.",
                    tokens = listOf(
                        WordToken("家门口", "jiā mén kǒu", "doorway / gate of home", "Kosakata HSK 2: 家门口 (jiā mén kǒu)"),
                        WordToken("的", "de", "possessive particle", "Kosakata HSK 1: 的 (de)"),
                        WordToken("车", "chē", "cars / vehicles", "Kosakata HSK 2: 车 (chē)"),
                        WordToken("很少", "hěn shǎo", "very few / rare", "Kosakata HSK 2: 很少 (hěn shǎo)"),
                        WordToken("几只", "jǐ zhī", "a few (birds)", "Kosakata HSK 2: 几只 (jǐ zhī)"),
                        WordToken("小鸟", "xiǎo niǎo", "little bird", "Kosakata HSK 2: 小鸟 (xiǎo niǎo)"),
                        WordToken("在", "zài", "at / on", "Kosakata HSK 1: 在 (zài)"),
                        WordToken("路边", "lù biān", "roadside / curb", "Kosakata HSK 2: 路边 (lù biān)"),
                        WordToken("飞来飞去", "fēi lái fēi qù", "to fly back and forth", "Kosakata HSK 3: 飞来飞去 (fēi lái fēi qù)"),
                        WordToken("他们", "tā men", "they", "Kosakata HSK 1: 他们 (tā men)"),
                        WordToken("一起", "yī qǐ", "together", "Kosakata HSK 2: 一起 (yī qǐ)"),
                        WordToken("跑了", "pǎo le", "ran / jogged", "Kosakata HSK 2: 跑了 (pǎo le)"),
                        WordToken("三十分钟", "sān shí fēn zhōng", "30 minutes", "Kosakata HSK 2: 三十分钟 (sān shí fēn zhōng)"),
                        WordToken("虽然", "suī rán", "although / even though", "Kosakata HSK 2: 虽然 (suī rán)"),
                        WordToken("觉得", "jué de", "to feel / think", "Kosakata HSK 2: 觉得 (jué de)"),
                        WordToken("有点儿", "yǒu diǎnr", "a little bit / slightly", "Kosakata HSK 2: 有点儿 (yǒu diǎnr)"),
                        WordToken("累", "lèi", "tired", "Kosakata HSK 2: 累 (lèi)"),
                        WordToken("但是", "dàn shì", "but / however", "Kosakata HSK 2: 但是 (dàn shì)"),
                        WordToken("身体", "shēn tǐ", "body / health", "Kosakata HSK 2: 身体 (shēn tǐ)"),
                        WordToken("很", "hěn", "very", "Kosakata HSK 1: 很 (hěn)"),
                        WordToken("舒服", "shū fu", "comfortable / feeling well", "Kosakata HSK 3: 舒服 (shū fu)"),
                        WordToken("心里", "xīn lǐ", "in one's heart / mood", "Kosakata HSK 2: 心里 (xīn lǐ)"),
                        WordToken("也", "yě", "also", "Kosakata HSK 1: 也 (yě)"),
                        WordToken("快乐", "kuài lè", "happy / joyful", "Kosakata HSK 2: 快乐 (kuài lè)")
                    )
                ),
                Sentence(
                    id = "s_wpday_4",
                    hanzi = "跑完步，他们去家门口的一家店吃早饭。王朋吃了一碗面条，李明喝了一杯热牛奶、吃了一个鸡蛋。",
                    pinyin = "pǎo wán bù tā men qù jiā mén kǒu de yī jiā diàn chī zǎo fàn Wáng Péng chī le yī wǎn miàn tiáo Lǐ Míng hē le yī bēi rè niú nǎi chī le yī gè jī dàn",
                    translation = "Setelah selesai joging, mereka pergi ke sebuah kedai di dekat rumah untuk sarapan. Wang Peng makan semangkuk mi, sedangkan Li Ming minum segelas susu hangat dan makan sebutir telur.",
                    tokens = listOf(
                        WordToken("跑完步", "pǎo wán bù", "finished running", "Kosakata HSK 2: 跑完步 (pǎo wán bù)"),
                        WordToken("他们", "tā men", "they", "Kosakata HSK 1: 他们 (tā men)"),
                        WordToken("去", "qù", "to go", "Kosakata HSK 1: 去 (qù)"),
                        WordToken("家门口", "jiā mén kǒu", "near home", "Kosakata HSK 2: 家门口 (jiā mén kǒu)"),
                        WordToken("的一家店", "de yī jiā diàn", "a shop / restaurant", "Kosakata HSK 2: 一家店 (yī jiā diàn)"),
                        WordToken("吃早饭", "chī zǎo fàn", "to eat breakfast", "Kosakata HSK 2: 吃早饭 (chī zǎo fàn)"),
                        WordToken("王朋", "Wáng Péng", "Wang Peng", "Nama tokoh: 王朋 (Wáng Péng)"),
                        WordToken("吃了一碗", "chī le yī wǎn", "ate a bowl of", "Kosakata HSK 2: 吃了一碗 (chī le yī wǎn)"),
                        WordToken("面条", "miàn tiáo", "noodles", "Kosakata HSK 2: 面条 (miàn tiáo)"),
                        WordToken("李明", "Lǐ Míng", "Li Ming", "Nama tokoh: 李明 (Lǐ Míng)"),
                        WordToken("喝了一杯", "hē le yī bēi", "drank a cup of", "Kosakata HSK 2: 喝了一杯 (hē le yī bēi)"),
                        WordToken("热牛奶", "rè niú nǎi", "hot milk", "Kosakata HSK 2: 热牛奶 (rè niú nǎi)"),
                        WordToken("吃了一个", "chī le yī gè", "ate one", "Kosakata HSK 2: 吃了一个 (chī le yī gè)"),
                        WordToken("鸡蛋", "jī dàn", "egg", "Kosakata HSK 2: 鸡蛋 (jī dàn)")
                    )
                ),
                Sentence(
                    id = "s_wpday_5",
                    hanzi = "李明问王朋：“今天下午你想在家，还是去打篮球？”王朋笑着说：“今天下午我想坐地铁去火车站买票。下个星期公司不上班，我准备坐火车去旅游。坐火车去旅游是一件很有意思的事情，你在路上可以看见很多漂亮的风景，也能认识新的朋友。”",
                    pinyin = "Lǐ Míng wèn Wáng Péng jīn tiān xià wǔ nǐ xiǎng zài jiā hái shi qù dǎ lán qiú Wáng Péng xiào zhe shuō jīn tiān xià wǔ wǒ xiǎng zuò dì tiě qù huǒ chē zhàn mǎi piào xià gè xīng qī gōng sī bù shàng bān wǒ zhǔn bèi zuò huǒ chē qù lǚ yóu zuò huǒ chē qù lǚ yóu shì yī jiàn hěn yǒu yì si de shì qing nǐ zài lù shang kě yǐ kàn jiàn hěn duō piào liang de fēng jǐng yě néng rèn shi xīn de péng you",
                    translation = "Li Ming bertanya kepada Wang Peng: 'Siang hari ini kamu ingin di rumah saja atau pergi bermain basket?' Wang Peng tersenyum menjawab: 'Siang ini saya ingin naik MRT ke stasiun kereta untuk membeli tiket. Minggu depan kantor libur, saya berencana naik kereta untuk bertamasya. Berlibur dengan kereta api adalah hal yang sangat mengasyikkan, di perjalanan kita bisa melihat pemandangan indah dan mengenal teman-teman baru.'",
                    tokens = listOf(
                        WordToken("打篮球", "dǎ lán qiú", "to play basketball", "Kosakata HSK 2: 打篮球 (dǎ lán qiú)"),
                        WordToken("笑着说", "xiào zhe shuō", "smiled and said", "Kosakata HSK 2: 笑着说 (xiào zhe shuō)"),
                        WordToken("坐地铁", "zuò dì tiě", "to take subway / MRT", "Kosakata HSK 3: 坐地铁 (zuò dì tiě)"),
                        WordToken("火车站", "huǒ chē zhàn", "train station", "Kosakata HSK 2: 火车站 (huǒ chē zhàn)"),
                        WordToken("买票", "mǎi piào", "to buy tickets", "Kosakata HSK 2: 买票 (mǎi piào)"),
                        WordToken("准备", "zhǔn bèi", "to prepare / plan to", "Kosakata HSK 2: 准备 (zhǔn bèi)"),
                        WordToken("坐火车", "zuò huǒ chē", "to take train", "Kosakata HSK 2: 坐火车 (zuò huǒ chē)"),
                        WordToken("旅游", "lǚ yóu", "to travel / tour", "Kosakata HSK 2: 旅游 (lǚ yóu)"),
                        WordToken("风景", "fēng jǐng", "scenery / landscape", "Kosakata HSK 3: 风景 (fēng jǐng)"),
                        WordToken("认识", "rèn shi", "to know / meet (friends)", "Kosakata HSK 1: 认识 (rèn shi)")
                    )
                ),
                Sentence(
                    id = "s_wpday_6",
                    hanzi = "到了晚上，王朋回到自己的家，开始准备旅游要用的东西。他拿了钱、衣服、书、手机和手表放进大包里，早早地睡了。因为明天早上八点，他就要坐火车出门了。",
                    pinyin = "dào le wǎn shang Wáng Péng huí dào zì jǐ de jiā kāi shǐ zhǔn bèi lǚ yóu yào yòng de dōng xi tā ná le qián yī fu shū shǒu jī hé shǒu biǎo fàng jìn dà bāo lǐ zǎo zǎo de shuì le yīn wèi míng tiān zǎo shang bā diǎn tā jiù yào zuò huǒ chē chū mén le",
                    translation = "Malam harinya, Wang Peng kembali ke rumahnya dan mulai menyiapkan perlengkapan untuk bepergian. Ia mengambil uang, pakaian, buku, ponsel, dan jam tangan lalu memasukkannya ke dalam tas ransel besar, kemudian tidur lebih awal. Sebab besok pagi jam delapan, ia harus berangkat naik kereta api.",
                    tokens = listOf(
                        WordToken("晚上", "wǎn shang", "evening / night", "Kosakata HSK 1: 晚上 (wǎn shang)"),
                        WordToken("回到", "huí dào", "to return to", "Kosakata HSK 2: 回到 (huí dào)"),
                        WordToken("开始", "kāi shǐ", "to begin / start", "Kosakata HSK 2: 开始 (kāi shǐ)"),
                        WordToken("准备", "zhǔn bèi", "to prepare", "Kosakata HSK 2: 准备 (zhǔn bèi)"),
                        WordToken("东西", "dōng xi", "things / items", "Kosakata HSK 1: 东西 (dōng xi)"),
                        WordToken("拿了", "ná le", "took / picked up", "Kosakata HSK 3: 拿 (ná)"),
                        WordToken("手机", "shǒu jī", "mobile phone", "Kosakata HSK 2: 手机 (shǒu jī)"),
                        WordToken("手表", "shǒu biǎo", "wrist watch", "Kosakata HSK 2: 手表 (shǒu biǎo)"),
                        WordToken("放进", "fàng jìn", "to put into", "Kosakata HSK 3: 放 (fàng)"),
                        WordToken("大包", "dà bāo", "big bag / backpack", "Kosakata HSK 2: 大包 (dà bāo)"),
                        WordToken("早早地", "zǎo zǎo de", "very early", "Kosakata HSK 2: 早早地 (zǎo zǎo de)"),
                        WordToken("睡了", "shuì le", "slept", "Kosakata HSK 1: 睡 (shuì)")
                    )
                )
            ),
            questions = listOf(
                StoryQuestion(
                    id = "q_wpday_1",
                    questionText = "星期六早上王朋和朋友李明一起做了什么活动？ (Aktivitas apa yang dilakukan Wang Peng bersama Li Ming pada Sabtu pagi?)",
                    options = listOf("在家里打电脑游戏 (Bermain game komputer di rumah)", "出门晨跑了三十分钟 (Pergi joging pagi selama 30 menit)", "去火车站排队买票 (Pergi ke stasiun antre tiket)", "在公司加班开会 (Lembur rapat di kantor)"),
                    correctAnswerIndex = 1,
                    explanation = "Teks menyatakan: '早上七点半，他穿上运动的衣服，和朋友李明一起出门跑步... 他们一起跑了三十分钟'."
                ),
                StoryQuestion(
                    id = "q_wpday_2",
                    questionText = "晨跑结束后，王朋早餐吃了什么食物？ (Sarapan apa yang dimakan Wang Peng setelah selesai lari pagi?)",
                    options = listOf("一杯热牛奶和一个鸡蛋 (Segelas susu hangat dan satu telur)", "一碗面条 (Semangkuk mi)", "两块甜蛋糕 (Dua potong kue manis)", "什么都没吃就回家了 (Pulang tanpa makan apapun)"),
                    correctAnswerIndex = 1,
                    explanation = "Teks menyebutkan: '王朋吃了一碗面条，李明喝了一杯热牛奶、吃了一个鸡蛋'."
                ),
                StoryQuestion(
                    id = "q_wpday_3",
                    questionText = "王朋为什么在星期六下午打算坐地铁去火车站？ (Mengapa Wang Peng berencana naik subway ke stasiun kereta pada Sabtu siang?)",
                    options = listOf("接远道而来的父母 (Menjemput orang tua dari luar kota)", "为下周假期的火车旅行提前买票 (Membeli tiket untuk perjalanan liburan naik kereta minggu depan)", "帮公司运送重要货物 (Membantu mengirim kargo penting perusahaan)", "去找李明打篮球 (Menemui Li Ming bermain basket)"),
                    correctAnswerIndex = 1,
                    explanation = "Wang Peng menjelaskan: '今天下午我想坐地铁去火车站买票。下个星期公司不上班，我准备坐火车去旅游'."
                ),
                StoryQuestion(
                    id = "q_wpday_4",
                    questionText = "王朋为什么在晚上早早就上床睡觉？ (Mengapa Wang Peng tidur sangat awal pada malam harinya?)",
                    options = listOf("身体突然发烧生病 (Tiba-tiba badannya demam dan sakit)", "因为明天早上八点就要坐火车出门旅游 (Karena besok pagi jam delapan ia harus berangkat naik kereta)", "房间没有网络可以上网 (Kamar tidak ada jaringan internet)", "跑完步一直感到头晕 (Merasa pusing setelah lari)"),
                    correctAnswerIndex = 1,
                    explanation = "Teks menyatakan: '早早地睡了。因为明天早上八点，他就要坐火车出门了'."
                )
            )
        ),

        // Cerita Mandarin Bean 196 (HSK 3): Ears (Telinga)
        Story(
            id = "story_ears",
            titleHanzi = "耳朵",
            titlePinyin = "Ěrduo",
            titleTranslation = "Ears (Telinga)",
            level = "HSK 3",
            category = "Cerita Lucu & Humor",
            description = "Percakapan kocak Xiao Wang dan Xiao Li mengenai fungsi telinga manusia yang berakhir dengan alasan tak terduga.",
            coverEmoji = "👂",
            coverImageRes = R.drawable.cover_story_ears,
            estimatedReadMinutes = 1,
            sentences = listOf(
                Sentence(
                    id = "s_ears_1",
                    hanzi = "小王问小李：“如果你没有左耳朵，会怎么样？”",
                    pinyin = "Xiǎo Wáng wèn Xiǎo Lǐ rú guǒ nǐ méi yǒu zuǒ ěr duo huì zěn me yàng",
                    translation = "Xiao Wang bertanya kepada Xiao Li: 'Seandainya kamu tidak punya daun telinga kiri, apa yang akan terjadi?'",
                    tokens = listOf(
                        WordToken("小王", "Xiǎo Wáng", "Xiao Wang (name)", "Nama tokoh: 小王 (Xiǎo Wáng)"),
                        WordToken("问", "wèn", "to ask", "Kosakata HSK 1: 问 (wèn)"),
                        WordToken("小李", "Xiǎo Lǐ", "Xiao Li (name)", "Nama tokoh: 小李 (Xiǎo Lǐ)"),
                        WordToken("如果", "rú guǒ", "if / in case", "Kosakata HSK 3: 如果 (rú guǒ)"),
                        WordToken("你", "nǐ", "you", "Kosakata HSK 1: 你 (nǐ)"),
                        WordToken("没有", "méi yǒu", "do not have / without", "Kosakata HSK 1: 没有 (méi yǒu)"),
                        WordToken("左", "zuǒ", "left", "Kosakata HSK 2: 左 (zuǒ)"),
                        WordToken("耳朵", "ěr duo", "ear", "Kosakata HSK 3: 耳朵 (ěr duo)"),
                        WordToken("会", "huì", "would / will", "Kosakata HSK 1: 会 (huì)"),
                        WordToken("怎么样", "zěn me yàng", "how / what about", "Kosakata HSK 1: 怎么样 (zěn me yàng)")
                    )
                ),
                Sentence(
                    id = "s_ears_2",
                    hanzi = "小李说：“我会听不见。”小王又问：“如果你的右耳朵也没有了呢？”",
                    pinyin = "Xiǎo Lǐ shuō wǒ huì tīng bu jiàn Xiǎo Wáng yòu wèn rú guǒ nǐ de yòu ěr duo yě méi yǒu le ne",
                    translation = "Xiao Li menjawab: 'Saya tidak akan bisa mendengar.' Xiao Wang bertanya lagi: 'Kalau telinga kananmu juga hilang, bagaimana?'",
                    tokens = listOf(
                        WordToken("小李", "Xiǎo Lǐ", "Xiao Li", "Nama tokoh: 小李 (Xiǎo Lǐ)"),
                        WordToken("说", "shuō", "to say", "Kosakata HSK 1: 说 (shuō)"),
                        WordToken("听不见", "tīng bu jiàn", "cannot hear", "Kosakata HSK 3: 听不见 (tīng bu jiàn)"),
                        WordToken("小王", "Xiǎo Wáng", "Xiao Wang", "Nama tokoh: 小王 (Xiǎo Wáng)"),
                        WordToken("又问", "yòu wèn", "asked again", "Kosakata HSK 2: 又 (yòu)"),
                        WordToken("右", "yòu", "right", "Kosakata HSK 2: 右 (yòu)"),
                        WordToken("耳朵", "ěr duo", "ear", "Kosakata HSK 3: 耳朵 (ěr duo)"),
                        WordToken("也没有了", "yě méi yǒu le", "also gone / no longer have", "Kosakata HSK 2: 也 (yě)")
                    )
                ),
                Sentence(
                    id = "s_ears_3",
                    hanzi = "小李说：“我会看不见。”小王很惊讶：“为什么？”小李说：“因为我要戴眼镜才能看见。”",
                    pinyin = "Xiǎo Lǐ shuō wǒ huì kàn bu jiàn Xiǎo Wáng hěn jīng yà wèi shén me Xiǎo Lǐ shuō yīn wèi wǒ yào dài yǎn jìng cái néng kàn jiàn",
                    translation = "Xiao Li menjawab: 'Saya tidak akan bisa melihat.' Xiao Wang heran terperangah: 'Kok bisa begitu?' Xiao Li berkata: 'Karena saya butuh cantolan telinga untuk memakai kacamata agar bisa melihat.'",
                    tokens = listOf(
                        WordToken("看不见", "kàn bu jiàn", "cannot see", "Kosakata HSK 3: 看不见 (kàn bu jiàn)"),
                        WordToken("很", "hěn", "very", "Kosakata HSK 1: 很 (hěn)"),
                        WordToken("惊讶", "jīng yà", "surprised / astonished", "Kosakata HSK 3: 惊讶 (jīng yà)"),
                        WordToken("为什么", "wèi shén me", "why", "Kosakata HSK 2: 为什么 (wèi shén me)"),
                        WordToken("因为", "yīn wèi", "because", "Kosakata HSK 2: 因为 (yīn wèi)"),
                        WordToken("要", "yào", "need to / must", "Kosakata HSK 2: 要 (yào)"),
                        WordToken("戴", "dài", "to wear (glasses)", "Kosakata HSK 3: 戴 (dài)"),
                        WordToken("眼镜", "yǎn jìng", "glasses / spectacles", "Kosakata HSK 3: 眼镜 (yǎn jìng)"),
                        WordToken("才能", "cái néng", "only then can", "Kosakata HSK 3: 才能 (cái néng)"),
                        WordToken("看见", "kàn jiàn", "to see", "Kosakata HSK 1: 看见 (kàn jiàn)")
                    )
                )
            ),
            questions = listOf(
                StoryQuestion(
                    id = "q_ears_1",
                    questionText = "当小王问如果失去左耳朵会如何时，小李给出的正常回答是什么？ (Ketika ditanya jika kehilangan telinga kiri apa yang terjadi, apa jawaban wajar Xiao Li?)",
                    options = listOf("头会非常痛 (Kepala akan terasa sangat sakit)", "会听不见声音 (Tidak akan bisa mendengar suara)", "吃不下饭 (Tidak berselera makan)", "无法跑步 (Tidak bisa berlari)"),
                    correctAnswerIndex = 1,
                    explanation = "Xiao Li menjawab: '我会听不见' (Saya tidak akan bisa mendengar)."
                ),
                StoryQuestion(
                    id = "q_ears_2",
                    questionText = "当连右耳朵也没有时，小李为什么出人意料地说自己会“看不见”？ (Ketika kedua telinganya tidak ada, mengapa Xiao Li tak terduga mengatakan akan 'tidak bisa melihat'?)",
                    options = listOf("眼睛会长在耳朵的位置 (Matanya tumbuh di posisi telinga)", "因为没有耳朵就无法架戴眼镜，高度近视导致看不见 (Karena tanpa daun telinga ia tidak bisa menyangga kacamata sehingga tidak bisa melihat)", "耳朵连着视觉神经 (Daun telinga terhubung langsung dengan saraf mata)", "他因为太害怕而闭上眼睛 (Ia menutup mata karena ketakutan)"),
                    correctAnswerIndex = 1,
                    explanation = "Xiao Li menjelaskan: '因为我要戴眼镜才能看见' (Karena saya harus memakai kacamata agar bisa melihat)."
                ),
                StoryQuestion(
                    id = "q_ears_3",
                    questionText = "在中文里，佩戴眼镜应该使用哪个动词？ (Dalam bahasa Mandarin, kata kerja manakah yang tepat untuk mengenakan kacamata?)",
                    options = listOf("穿 (chuān - untuk pakaian / celana)", "戴 (dài - untuk kacamata / topi / jam)", "拿 (ná - memegang)", "装 (zhuāng - memasang / memuat)"),
                    correctAnswerIndex = 1,
                    explanation = "Untuk aksesoris kepala/wajah seperti kacamata (眼镜) dan topi (帽子), kata kerja yang benar adalah '戴' (dài)."
                )
            )
        ),

        // Cerita Mandarin Bean 197 (HSK 3): The Strange Person (Orang yang Aneh)
        Story(
            id = "story_the_strange_person",
            titleHanzi = "奇怪的人",
            titlePinyin = "Qíguài de Rén",
            titleTranslation = "The Strange Person (Orang yang Aneh)",
            level = "HSK 3",
            category = "Cerita Lucu & Humor",
            description = "Kejadian salah paham menggelikan di bilik toilet umum ketika seseorang mengira orang di sebelahnya sedang berbicara dengannya.",
            coverEmoji = "🚻",
            coverImageRes = R.drawable.cover_story_the_strange_person,
            estimatedReadMinutes = 1,
            sentences = listOf(
                Sentence(
                    id = "s_strper_1",
                    hanzi = "一个男人去洗手间。第一间有人，他就去了第二间。他刚坐下，就听见旁边有人问：“你好，你还好吗？”",
                    pinyin = "yī gè nán rén qù xǐ shǒu jiān dì yī jiān yǒu rén tā jiù qù le dì èr jiān tā gāng zuò xià jiù tīng jiàn páng biān yǒu rén wèn nǐ hǎo nǐ hái hǎo ma",
                    translation = "Seorang pria pergi ke toilet. Bilik pertama ada orang, jadi ia masuk ke bilik kedua. Baru saja ia duduk, ia mendengar seseorang di bilik sebelah bertanya: 'Halo, kamu apa kabar?'",
                    tokens = listOf(
                        WordToken("洗手间", "xǐ shǒu jiān", "restroom / bathroom", "Kosakata HSK 3: 洗手间 (xǐ shǒu jiān)"),
                        WordToken("第一间", "dì yī jiān", "first cubicle / room", "Kosakata HSK 2: 第一间 (dì yī jiān)"),
                        WordToken("有人", "yǒu rén", "occupied / someone inside", "Kosakata HSK 1: 有人 (yǒu rén)"),
                        WordToken("第二间", "dì èr jiān", "second cubicle", "Kosakata HSK 2: 第二间 (dì èr jiān)"),
                        WordToken("刚坐下", "gāng zuò xià", "just sat down", "Kosakata HSK 3: 刚 (gāng)"),
                        WordToken("就听见", "jiù tīng jiàn", "then heard", "Kosakata HSK 2: 听见 (tīng jiàn)"),
                        WordToken("旁边", "páng biān", "next to / side", "Kosakata HSK 2: 旁边 (páng biān)"),
                        WordToken("你好", "nǐ hǎo", "hello", "Kosakata HSK 1: 你好 (nǐ hǎo)"),
                        WordToken("还差", "hái hǎo", "fine / alright", "Kosakata HSK 2: 还好 (hái hǎo)")
                    )
                ),
                Sentence(
                    id = "s_strper_2",
                    hanzi = "男人觉得很奇怪，但是还是回答：“我还好。”旁边的人又问：“你在做什么？”男人更奇怪了，但还是回答：“我在上厕所。”",
                    pinyin = "nán rén jué de hěn qí guài dàn shì hái shi huí dá wǒ hái hǎo páng biān de rén yòu wèn nǐ zài zuò shén me nán rén gèng qí guài le dàn hái shi huí dá wǒ zài shàng cè suǒ",
                    translation = "Pria itu merasa sangat aneh, namun tetap membalas: 'Saya baik-baik saja.' Orang di sebelah bertanya lagi: 'Kamu lagi bikin apa?' Pria itu makin heran, tapi tetap menjawab: 'Saya sedang buang air di toilet.'",
                    tokens = listOf(
                        WordToken("男人", "nán rén", "man", "Kosakata HSK 2: 男人 (nán rén)"),
                        WordToken("觉得", "jué de", "to feel / think", "Kosakata HSK 2: 觉得 (jué de)"),
                        WordToken("奇怪", "qí guài", "strange / odd", "Kosakata HSK 3: 奇怪 (qí guài)"),
                        WordToken("还是", "hái shi", "still / nevertheless", "Kosakata HSK 2: 还是 (hái shi)"),
                        WordToken("回答", "huí dá", "to reply / answer", "Kosakata HSK 3: 回答 (huí dá)"),
                        WordToken("上厕所", "shàng cè suǒ", "to go to toilet", "Kosakata HSK 2: 厕所 (cè suǒ)")
                    )
                ),
                Sentence(
                    id = "s_strper_3",
                    hanzi = "这时，旁边的人说：“我等一下再给你打电话。我旁边有一个很奇怪的人，我跟你说话，他一直回答我。”",
                    pinyin = "zhè shí páng biān de rén shuō wǒ děng yī xià zài gěi nǐ dǎ diàn huà wǒ páng biān yǒu yī gè hěn qí guài de rén wǒ gēn nǐ shuō huà tā yī zhí huí dá wǒ",
                    translation = "Pada saat itu, orang di bilik sebelah berkata ke teleponnya: 'Nanti sebentar lagi saya telepon balik ya. Di sebelahku ada orang aneh banget, aku lagi ngomong sama kamu di telepon, eh dia malah terus-terusan ngejawab omonganku.'",
                    tokens = listOf(
                        WordToken("这时", "zhè shí", "at this moment", "Kosakata HSK 2: 这时 (zhè shí)"),
                        WordToken("等一下", "děng yī xià", "wait a moment", "Kosakata HSK 2: 等一下 (děng yī xià)"),
                        WordToken("打电话", "dǎ diàn huà", "to make a phone call", "Kosakata HSK 1: 打电话 (dǎ diàn huà)"),
                        WordToken("奇怪", "qí guài", "strange", "Kosakata HSK 3: 奇怪 (qí guài)"),
                        WordToken("跟", "gēn", "with / to", "Kosakata HSK 2: 跟 (gēn)"),
                        WordToken("说话", "shuō huà", "to speak / talk", "Kosakata HSK 1: 说话 (shuō huà)"),
                        WordToken("一直", "yī zhí", "continuously / all along", "Kosakata HSK 3: 一直 (yī zhí)"),
                        WordToken("回答", "huí dá", "to answer", "Kosakata HSK 3: 回答 (huí dá)")
                    )
                )
            ),
            questions = listOf(
                StoryQuestion(
                    id = "q_strper_1",
                    questionText = "故事发生在哪里？ (Di manakah latar tempat terjadinya cerita ini?)",
                    options = listOf("图书馆自习室 (Ruang belajar perpustakaan)", "公共洗手间隔间 (Bilik toilet umum)", "地铁列车车厢 (Gerbong kereta MRT)", "公司会议室 (Ruang rapat kantor)"),
                    correctAnswerIndex = 1,
                    explanation = "Teks menyatakan: '一个男人去洗手间。第一间有人，他就去了第二间'."
                ),
                StoryQuestion(
                    id = "q_strper_2",
                    questionText = "隔壁的人说话的真正对象是谁？ (Siapakah lawan bicara sesungguhnya dari orang di bilik sebelah?)",
                    options = listOf("敲门的保洁阿姨 (Petugas kebersihan yang mengetuk pintu)", "正在用耳机通话的电话另一端朋友 (Teman di ujung telepon yang sedang dihubunginya)", "主角本人 (Tokoh pria utama)", "自言自语背诵课文 (Sedang menghafal teks sendiri)"),
                    correctAnswerIndex = 1,
                    explanation = "Orang di sebelah ternyata sedang menelepon: '我等一下再给你打电话... 我跟你说话，他一直回答我'."
                ),
                StoryQuestion(
                    id = "q_strper_3",
                    questionText = "这个故事的搞笑核心是什么？ (Apa inti kelucuan dari cerita ini?)",
                    options = listOf("洗手间停水停电 (Toilet mati air dan listrik)", "主角误以为隔壁在跟自己搭讪并认真作答，反被对方当成了‘奇怪的人’ (Tokoh utama mengira orang sebelah menyapanya lalu menjawab jujur, padahal orang itu lagi menelepon dan malah menganggapnya orang aneh)", "主角把手机掉进了厕所 (Ponsel tokoh utama terjatuh ke toilet)", "两个人穿了一模一样的衣服 (Kedua orang memakai pakaian kembar)"),
                    correctAnswerIndex = 1,
                    explanation = "Keduanya saling menganggap orang lain 'aneh' karena salah paham komunikasi di bilik toilet."
                )
            )
        ),

        // Cerita Mandarin Bean 198 (HSK 3): Eating Pizza (Makan Pizza)
        Story(
            id = "story_eating_pizza",
            titleHanzi = "吃披萨",
            titlePinyin = "Chī Pīsà",
            titleTranslation = "Eating Pizza (Makan Pizza & Pelesetan Kata)",
            level = "HSK 3",
            category = "Cerita Lucu & Humor",
            description = "Lelucon bahasa Mandarin cerdas yang memanfaatkan kemiripan bunyi antara 'qī piàn' (tujuh potong pizza) dan 'qīpiàn' (kebohongan/penipuan).",
            coverEmoji = "🍕",
            coverImageRes = R.drawable.cover_story_eating_pizza,
            estimatedReadMinutes = 1,
            sentences = listOf(
                Sentence(
                    id = "s_eatpiz_1",
                    hanzi = "小王说：“我什么都不相信了，生活中总是有欺骗。”",
                    pinyin = "Xiǎo Wáng shuō wǒ shén me dōu bù xiāng xìn le shēng huó zhōng zǒng shì yǒu qī piàn",
                    translation = "Xiao Wang mengeluh: 'Saya sudah tidak percaya pada apa pun lagi, di dalam hidup ini selalu saja ada kebohongan dan penipuan.'",
                    tokens = listOf(
                        WordToken("什么都", "shén me dōu", "anything / whatever", "Kosakata HSK 3: 什么都 (shén me dōu)"),
                        WordToken("不相信", "bù xiāng xìn", "do not believe", "Kosakata HSK 3: 相信 (xiāng xìn)"),
                        WordToken("生活", "shēng huó", "life", "Kosakata HSK 3: 生活 (shēng huó)"),
                        WordToken("中", "zhōng", "in / within", "Kosakata HSK 1: 中 (zhōng)"),
                        WordToken("总是", "zǒng shì", "always", "Kosakata HSK 3: 总是 (zǒng shì)"),
                        WordToken("欺骗", "qī piàn", "deception / cheating", "Kosakata HSK 3: 欺骗 (qī piàn)")
                    )
                ),
                Sentence(
                    id = "s_eatpiz_2",
                    hanzi = "小李说：“如果你不想要欺骗，我建议你吃披萨。”小王很奇怪：“为什么？”",
                    pinyin = "Xiǎo Lǐ shuō rú guǒ nǐ bù xiǎng yào qī piàn wǒ jiàn yì nǐ chī pī sà Xiǎo Wáng hěn qí guài wèi shén me",
                    translation = "Xiao Li berkata: 'Kalau kamu tidak ingin ada tipu daya, saya sarankan kamu makan pizza saja.' Xiao Wang bingung heran: 'Lho, memangnya kenapa?'",
                    tokens = listOf(
                        WordToken("如果", "rú guǒ", "if", "Kosakata HSK 3: 如果 (rú guǒ)"),
                        WordToken("不想要", "bù xiǎng yào", "do not want", "Kosakata HSK 2: 想要 (xiǎng yào)"),
                        WordToken("欺骗", "qī piàn", "deception", "Kosakata HSK 3: 欺骗 (qī piàn)"),
                        WordToken("建议", "jiàn yì", "to suggest / recommend", "Kosakata HSK 3: 建议 (jiàn yì)"),
                        WordToken("吃", "chī", "to eat", "Kosakata HSK 1: 吃 (chī)"),
                        WordToken("披萨", "pī sà", "pizza", "Kosakata HSK 3: 披萨 (pī sà)"),
                        WordToken("奇怪", "qí guài", "strange / puzzled", "Kosakata HSK 3: 奇怪 (qí guài)"),
                        WordToken("为什么", "wèi shén me", "why", "Kosakata HSK 2: 为什么 (wèi shén me)")
                    )
                ),
                Sentence(
                    id = "s_eatpiz_3",
                    hanzi = "小李说：“因为披萨有六片、八片，但是没有七片（欺骗）。”",
                    pinyin = "Xiǎo Lǐ shuō yīn wèi pī sà yǒu liù piàn bā piàn dàn shì méi yǒu qī piàn qī piàn",
                    translation = "Xiao Li tersenyum menjawab: 'Karena pizza biasanya dipotong enam potong atau delapan potong, tapi tak pernah dipotong tujuh potong (qī piàn / 欺骗 = penipuan)!'",
                    tokens = listOf(
                        WordToken("因为", "yīn wèi", "because", "Kosakata HSK 2: 因为 (yīn wèi)"),
                        WordToken("披萨", "pī sà", "pizza", "Kosakata HSK 3: 披萨 (pī sà)"),
                        WordToken("六片", "liù piàn", "six slices", "Kosakata HSK 3: 片 (piàn)"),
                        WordToken("八片", "bā piàn", "eight slices", "Kosakata HSK 3: 片 (piàn)"),
                        WordToken("但是", "dàn shì", "but", "Kosakata HSK 2: 但是 (dàn shì)"),
                        WordToken("没有", "méi yǒu", "there is no", "Kosakata HSK 1: 没有 (méi yǒu)"),
                        WordToken("七片", "qī piàn", "seven slices (homophone for deception)", "Kosakata HSK 3: 七片 (qī piàn)")
                    )
                )
            ),
            questions = listOf(
                StoryQuestion(
                    id = "q_eatpiz_1",
                    questionText = "小王一开始为什么感到非常沮丧和失望？ (Mengapa Xiao Wang pada awalnya merasa sangat kecewa dan terpuruk?)",
                    options = listOf("没考上大学 (Tidak lulus ujian universitas)", "觉得生活中充斥着太多欺骗和虚伪 (Merasa di dunia ini terlalu banyak penipuan dan kepalsuan)", "披萨店关门打烊了 (Kedai pizza sudah tutup)", "钱包不小心丢了 (Dompetnya tidak sengaja hilang)"),
                    correctAnswerIndex = 1,
                    explanation = "Xiao Wang mengeluh: '我什么都不相信了，生活中总是有欺骗'."
                ),
                StoryQuestion(
                    id = "q_eatpiz_2",
                    questionText = "小李建议吃披萨来避开欺骗的幽默逻辑是什么？ (Logika humor apa yang mendasari saran Xiao Li menyuruh makan pizza agar terhindar dari tipu daya?)",
                    options = listOf("吃披萨会让人脑子变聪明 (Makan pizza membuat otak jadi pintar)", "披萨通常切成6片或8片，从来没有‘七片’（谐音‘欺骗’） (Pizza biasanya dipotong 6 atau 8 bagian genap, tidak ada potongan 'tujuh iris' yang bunyinya persis 'penipuan')", "披萨是用真材实料做的 (Pizza dibuat dari bahan asli)", "意大利人从来不说谎 (Orang Italia tidak pernah bohong)"),
                    correctAnswerIndex = 1,
                    explanation = "Ini adalah pelesetan homofon: '七片' (qī piàn - 7 potong) berbunyi sama persis dengan '欺骗' (qī piàn - menipu/penipuan)."
                ),
                StoryQuestion(
                    id = "q_eatpiz_3",
                    questionText = "在中文里，用来表示披萨或面包等扁平薄片状物品的量词是什么？ (Kata penggolong/satuan yang tepat untuk irisan pizza atau roti tawar adalah?)",
                    options = listOf("只 (zhī - untuk hewan)", "片 (piàn - untuk irisan/lembaran tipis)", "条 (tiáo - untuk benda panjang)", "个 (gè - satuan umum)"),
                    correctAnswerIndex = 1,
                    explanation = "Kata '片' (piàn) digunakan untuk benda tipis berbentuk lembaran atau irisan seperti pizza (披萨) atau roti (面包)."
                )
            )
        ),

        // Cerita Mandarin Bean 199 (HSK 3): Colors and Mood (Warna dan Suasana Hati)
        Story(
            id = "story_colors_and_mood",
            titleHanzi = "颜色和心情",
            titlePinyin = "Yánsè hé Xīnqíng",
            titleTranslation = "Colors and Mood (Warna dan Suasana Hati)",
            level = "HSK 3",
            category = "Gaya Hidup & Psikologi",
            description = "Menjelaskan bagaimana beragam warna di sekitar kita seperti merah, kuning, biru, dan hijau memengaruhi psikologi dan suasana hati manusia.",
            coverEmoji = "🎨",
            coverImageRes = R.drawable.cover_story_colors_and_mood,
            estimatedReadMinutes = 2,
            sentences = listOf(
                Sentence(
                    id = "s_colmod_1",
                    hanzi = "我们每天的心情都不一样。有时候很开心，有时候不开心。很多人说，颜色和心情有关系。",
                    pinyin = "wǒ men měi tiān de xīn qíng dōu bù yī yàng yǒu shí hou hěn kāi xīn yǒu shí hou bù kāi xīn hěn duō rén shuō yán sè hé xīn qíng yǒu guān xi",
                    translation = "Suasana hati kita setiap hari tidaklah sama. Terkadang sangat gembira, terkadang sedang sedih. Banyak orang berpendapat bahwa warna memiliki kaitan erat dengan suasana hati.",
                    tokens = listOf(
                        WordToken("心情", "xīn qíng", "mood / state of mind", "Kosakata HSK 3: 心情 (xīn qíng)"),
                        WordToken("不一样", "bù yī yàng", "different / not the same", "Kosakata HSK 2: 不一样 (bù yī yàng)"),
                        WordToken("有时候", "yǒu shí hou", "sometimes", "Kosakata HSK 2: 有时候 (yǒu shí hou)"),
                        WordToken("开心", "kāi xīn", "happy / joyful", "Kosakata HSK 2: 开心 (kāi xīn)"),
                        WordToken("颜色", "yán sè", "color", "Kosakata HSK 2: 颜色 (yán sè)"),
                        WordToken("关系", "guān xi", "relation / connection", "Kosakata HSK 3: 关系 (guān xi)")
                    )
                ),
                Sentence(
                    id = "s_colmod_2",
                    hanzi = "红色让人开心。新年的时候，家里有很多红色的东西，比如红色的灯、红色的衣服。看到红色，人会觉得很高兴。",
                    pinyin = "hóng sè ràng rén kāi xīn xīn nián de shí hou jiā lǐ yǒu hěn duō hóng sè de dōng xi bǐ rú hóng sè de dēng hóng sè de yī fu kàn dào hóng sè rén huì jué de hěn gāo xìng",
                    translation = "Warna merah membuat orang merasa gembira. Saat tahun baru, di rumah terdapat banyak sekali benda berwarna merah, misalnya lampion merah dan pakaian serba merah. Melihat warna merah, orang-orang akan merasa sangat bersukacita.",
                    tokens = listOf(
                        WordToken("红色", "hóng sè", "red color", "Kosakata HSK 2: 红色 (hóng sè)"),
                        WordToken("让", "ràng", "to make / let", "Kosakata HSK 2: 让 (ràng)"),
                        WordToken("新年", "xīn nián", "New Year", "Kosakata HSK 2: 新年 (xīn nián)"),
                        WordToken("比如", "bǐ rú", "for example", "Kosakata HSK 3: 比如 (bǐ rú)"),
                        WordToken("灯", "dēng", "lamp / lantern", "Kosakata HSK 3: 灯 (dēng)"),
                        WordToken("高兴", "gāo xìng", "happy / glad", "Kosakata HSK 1: 高兴 (gāo xìng)")
                    )
                ),
                Sentence(
                    id = "s_colmod_3",
                    hanzi = "黄色是太阳的颜色。太阳出来，人也会觉得很暖和、很高兴。所以很多人喜欢黄色。",
                    pinyin = "huáng sè shì tài yáng de yán sè tài yáng chū lái rén yě huì jué de hěn nuǎn huo hěn gāo xìng suǒ yǐ hěn duō rén xǐ huan huáng sè",
                    translation = "Kuning adalah warna matahari. Ketika matahari bersinar terbit, orang pun akan merasa hangat dan bersemangat. Karena itulah banyak orang menyukai warna kuning.",
                    tokens = listOf(
                        WordToken("黄色", "huáng sè", "yellow color", "Kosakata HSK 2: 黄色 (huáng sè)"),
                        WordToken("太阳", "tài yáng", "sun", "Kosakata HSK 3: 太阳 (tài yáng)"),
                        WordToken("出来", "chū lái", "to come out", "Kosakata HSK 2: 出来 (chū lái)"),
                        WordToken("暖和", "nuǎn huo", "warm", "Kosakata HSK 3: 暖和 (nuǎn huo)"),
                        WordToken("喜欢", "xǐ huan", "to like", "Kosakata HSK 1: 喜欢 (xǐ huan)")
                    )
                ),
                Sentence(
                    id = "s_colmod_4",
                    hanzi = "蓝色是天和海的颜色。天很蓝，海也很蓝，看起来很安静。如果一个人很累，看一看蓝色的天和海，心情会好一点。",
                    pinyin = "lán sè shì tiān hé hǎi de yán sè tiān hěn lán hǎi yě hěn lán kàn qǐ lái hěn ān jìng rú guǒ yī gè rén hěn lèi kàn yī kàn lán sè de tiān hé hǎi xīn qíng huì hǎo yī diǎn",
                    translation = "Biru adalah warna langit dan lautan. Langit sangat biru, laut juga sangat biru, tampak sangat tenang dan damai. Jika seseorang merasa lelah, memandangi langit dan laut yang biru akan membuat perasaannya menjadi lebih baik.",
                    tokens = listOf(
                        WordToken("蓝色", "lán sè", "blue color", "Kosakata HSK 2: 蓝色 (lán sè)"),
                        WordToken("天", "tiān", "sky", "Kosakata HSK 1: 天 (tiān)"),
                        WordToken("海", "hǎi", "sea / ocean", "Kosakata HSK 3: 海 (hǎi)"),
                        WordToken("看起来", "kàn qǐ lái", "looks like / appears", "Kosakata HSK 3: 看起来 (kàn qǐ lái)"),
                        WordToken("安静", "ān jìng", "quiet / calm / peaceful", "Kosakata HSK 3: 安静 (ān jìng)"),
                        WordToken("累", "lèi", "tired", "Kosakata HSK 2: 累 (lèi)")
                    )
                ),
                Sentence(
                    id = "s_colmod_5",
                    hanzi = "绿色是树和草的颜色。春天来了，很多地方都是绿色的。很多人去公园，看一下绿色的树和草，会觉得身体很舒服。",
                    pinyin = "lǜ sè shì shù hé cǎo de yán sè chūn tiān lái le hěn duō dì fang dōu shì lǜ sè de hěn duō rén qù gōng yuán kàn yī xià lǜ sè de shù hé cǎo huì jué de shēn tǐ hěn shū fu",
                    translation = "Hijau adalah warna pepohonan dan rerumputan. Ketika musim semi tiba, banyak tempat menjadi hijau asri. Banyak orang pergi ke taman menikmati pepohonan dan rumput hijau, sehingga badan terasa sangat rileks dan segar.",
                    tokens = listOf(
                        WordToken("绿色", "lǜ sè", "green color", "Kosakata HSK 2: 绿色 (lǜ sè)"),
                        WordToken("树", "shù", "tree", "Kosakata HSK 3: 树 (shù)"),
                        WordToken("草", "cǎo", "grass", "Kosakata HSK 3: 草 (cǎo)"),
                        WordToken("春天", "chūn tiān", "spring", "Kosakata HSK 3: 春天 (chūn tiān)"),
                        WordToken("公园", "gōng yuán", "park", "Kosakata HSK 3: 公园 (gōng yuán)"),
                        WordToken("舒服", "shū fu", "comfortable / relaxed", "Kosakata HSK 3: 舒服 (shū fu)")
                    )
                ),
                Sentence(
                    id = "s_colmod_6",
                    hanzi = "黑色是晚上的颜色。有的人觉得黑色有一点安静，也有一点不开心。但是黑色的衣服也很好看。每个人喜欢的颜色不一样。颜色可以让我们每天的生活更有意思。心情不好的时候，看一看你喜欢的颜色，也许心情就会好起来。",
                    pinyin = "hēi sè shì wǎn shang de yán sè yǒu de rén jué de hēi sè yǒu yī diǎn ān jìng yě yǒu yī diǎn bù kāi xīn dàn shì hēi sè de yī fu yě hěn hǎo kàn měi gè rén xǐ huan de yán sè bù yī yàng yán sè kě yǐ ràng wǒ men měi tiān de shēng huó gèng yǒu yì si xīn qíng bù hǎo de shí hou kàn yī kàn nǐ xǐ huan de yán sè yě xǔ xīn qíng jiù huì hǎo qǐ lái",
                    translation = "Hitam adalah warna malam hari. Sebagian orang merasa warna hitam membawa sedikit ketenangan, namun juga sedikit muram. Meski demikian, pakaian berwarna hitam juga tampak sangat elegan. Warna kesukaan tiap orang berbeda. Warna dapat membuat kehidupan sehari-hari kita semakin menarik. Saat suasana hati sedang buruk, pandanglah warna kesukaanmu, barangkali suasana hatimu akan membaik kembali.",
                    tokens = listOf(
                        WordToken("黑色", "hēi sè", "black color", "Kosakata HSK 2: 黑色 (hēi sè)"),
                        WordToken("衣服", "yī fu", "clothes", "Kosakata HSK 1: 衣服 (yī fu)"),
                        WordToken("生活", "shēng huó", "life", "Kosakata HSK 3: 生活 (shēng huó)"),
                        WordToken("有意思", "yǒu yì si", "interesting / fun", "Kosakata HSK 2: 有意思 (yǒu yì si)"),
                        WordToken("也许", "yě xǔ", "perhaps / maybe", "Kosakata HSK 3: 也许 (yě xǔ)"),
                        WordToken("好起来", "hǎo qǐ lái", "to get better", "Kosakata HSK 3: 好起来 (hǎo qǐ lái)")
                    )
                )
            ),
            questions = listOf(
                StoryQuestion(
                    id = "q_colmod_1",
                    questionText = "根据文章描述，哪种颜色最能给人带来喜庆、欢快的心情，常用于新年？ (Menurut teks, warna manakah yang paling membawa sukacita dan sering dipakai saat tahun baru?)",
                    options = listOf("黑色 (Warna hitam)", "红色 (Warna merah)", "白色 (Warna putih)", "灰色 (Warna abu-abu)"),
                    correctAnswerIndex = 1,
                    explanation = "Teks menyatakan: '红色让人开心。新年的时候，家里有很多红色的东西... 看到红色，人会觉得很高兴'."
                ),
                StoryQuestion(
                    id = "q_colmod_2",
                    questionText = "当一个人感到身心疲惫时，文章建议欣赏哪种颜色来帮助平复心情？ (Ketika lelah, warna apakah yang disarankan untuk dinikmati agar hati menjadi tenang?)",
                    options = listOf("像天空与海洋一样深邃宁静的蓝色 (Warna biru yang tenang seperti langit dan laut)", "刺眼的亮紫色 (Warna ungu menyala)", "深沉沉的纯黑夜色 (Warna hitam pekat malam)", "金光闪烁的金色 (Warna emas gemerlap)"),
                    correctAnswerIndex = 0,
                    explanation = "Teks menyebutkan: '蓝色是天和海的颜色... 如果一个人很累，看一看蓝色的天和海，心情会好一点'."
                ),
                StoryQuestion(
                    id = "q_colmod_3",
                    questionText = "为什么许多人喜欢在春天漫步公园欣赏绿色？ (Mengapa banyak orang suka ke taman menikmati warna hijau di musim semi?)",
                    options = listOf("公园门票在绿色季节免费 (Tiket taman gratis)", "绿色是树和草的生机之色，能让人身体感觉格外舒服 (Warna hijau dedaunan dan rumput membuat tubuh merasa rileks dan segar)", "为了寻找掉落的树叶 (Untuk mencari daun jatuh)", "想在树下躲雨 (Ingin berteduh dari hujan)"),
                    correctAnswerIndex = 1,
                    explanation = "Teks mencatat: '很多人去公园，看一下绿色的树和草，会觉得身体很舒服'."
                ),
                StoryQuestion(
                    id = "q_colmod_4",
                    questionText = "作者最后给心情不好的人提出了什么贴心的建议？ (Saran hangat apa yang diberikan penulis bagi orang yang sedang gundah?)",
                    options = listOf("彻底蒙头大睡一整天 (Tidur seharian penuh)", "看一看自己所喜爱的颜色，心情也许就会渐渐好转 (Lihatlah warna kesukaanmu, suasana hati mungkin akan membaik)", "立刻去商场大肆购物 (Segera belanja banyak di mall)", "独自坐在黑暗房间不说话 (Duduk diam sendirian di kamar gelap)"),
                    correctAnswerIndex = 1,
                    explanation = "Kalimat penutup menyatakan: '心情不好的时候，看一看你喜欢的颜色，也许心情就会好起来'."
                )
            )
        ),

        // Cerita Mandarin Bean 200 (HSK 3): Strawberry Flavor (Rasa Stroberi / Rumput Hambar)
        Story(
            id = "story_strawberry_flavor",
            titleHanzi = "草莓味",
            titlePinyin = "Cǎomèi Wèi",
            titleTranslation = "Strawberry Flavor (Rasa Stroberi / Rumput Tak Berasa)",
            level = "HSK 3",
            category = "Cerita Lucu & Humor",
            description = "Cerita lucu dua ekor sapi di padang rumput yang salah paham karena kemiripan lafal antara cǎomèi wèi (rasa stroberi) dan cǎo méi wèi (rumputnya tidak ada rasa).",
            coverEmoji = "🍓",
            coverImageRes = R.drawable.cover_story_strawberry_flavor,
            estimatedReadMinutes = 1,
            sentences = listOf(
                Sentence(
                    id = "s_stbflv_1",
                    hanzi = "两头牛在草地的两边吃草。黑牛问黄牛：“你那边的草什么味？”",
                    pinyin = "liǎng tóu niú zài cǎo dì de liǎng biān chī cǎo hēi niú wèn huáng niú nǐ nà biān de cǎo shén me wèi",
                    translation = "Dua ekor sapi sedang merumput di kedua sisi padang rumput. Sapi hitam bertanya pada sapi kuning: 'Rumput di tempatmu itu rasanya seperti apa?'",
                    tokens = listOf(
                        WordToken("两头牛", "liǎng tóu niú", "two cows", "Kosakata HSK 2: 两头牛 (liǎng tóu niú)"),
                        WordToken("草地", "cǎo dì", "grassland / lawn", "Kosakata HSK 3: 草地 (cǎo dì)"),
                        WordToken("吃草", "chī cǎo", "to eat grass / graze", "Kosakata HSK 3: 草 (cǎo)"),
                        WordToken("黑牛", "hēi niú", "black cow", "Kosakata HSK 2: 黑牛 (hēi niú)"),
                        WordToken("黄牛", "huáng niú", "yellow cattle / ox", "Kosakata HSK 2: 黄牛 (huáng niú)"),
                        WordToken("什么味", "shén me wèi", "what flavor / taste", "Kosakata HSK 3: 味 (wèi)")
                    )
                ),
                Sentence(
                    id = "s_stbflv_2",
                    hanzi = "黄牛说：“我这边的草莓味。”黑牛马上跑过去，吃了一口黄牛的草，很生气：“你骗我！这边的草根本不是草莓味。”",
                    pinyin = "huáng niú shuō wǒ zhè biān de cǎo méi wèi hēi niú mǎ shàng pǎo guò qù chī le yī kǒu huáng niú de cǎo hěn shēng qì nǐ piàn wǒ zhè biān de cǎo gēn běn bù shì cǎo méi wèi",
                    translation = "Sapi kuning berkata: 'Di tempat saya ini rumputnya tidak berasa (cǎo méi wèi / terdengar: rasa stroberi).' Sapi hitam langsung berlari ke sana, menyantap sesuap rumput milik sapi kuning, lalu marah besar: 'Kamu membohongiku! Rumput di sini sama sekali bukan rasa stroberi!'",
                    tokens = listOf(
                        WordToken("草莓味", "cǎo méi wèi", "strawberry flavor", "Kosakata HSK 3: 草莓 (cǎo méi)"),
                        WordToken("马上", "mǎ shàng", "immediately / at once", "Kosakata HSK 2: 马上 (mǎ shàng)"),
                        WordToken("跑过去", "pǎo guò qù", "ran over", "Kosakata HSK 2: 跑过去 (pǎo guò qù)"),
                        WordToken("吃了一口", "chī le yī kǒu", "took a bite of", "Kosakata HSK 2: 一口 (yī kǒu)"),
                        WordToken("生气", "shēng qì", "angry", "Kosakata HSK 2: 生气 (shēng qì)"),
                        WordToken("骗我", "piàn wǒ", "cheated me / lied to me", "Kosakata HSK 3: 骗 (piàn)"),
                        WordToken("根本", "gēn běn", "at all / simply", "Kosakata HSK 3: 根本 (gēn běn)")
                    )
                ),
                Sentence(
                    id = "s_stbflv_3",
                    hanzi = "黄牛说：“我没骗你啊，我说这边的草没味。”",
                    pinyin = "huáng niú shuō wǒ méi piàn nǐ a wǒ shuō zhè biān de cǎo méi wèi",
                    translation = "Sapi kuning berkata polos: 'Saya tidak membohongimu kok, maksud saya tadi rumput di sini tak ada rasanya (cǎo méi wèi)!'",
                    tokens = listOf(
                        WordToken("黄牛", "huáng niú", "ox / yellow cow", "Kosakata HSK 2: 黄牛 (huáng niú)"),
                        WordToken("没骗你", "méi piàn nǐ", "did not lie to you", "Kosakata HSK 3: 骗 (piàn)"),
                        WordToken("草", "cǎo", "grass", "Kosakata HSK 3: 草 (cǎo)"),
                        WordToken("没味", "méi wèi", "tasteless / no flavor", "Kosakata HSK 3: 没味 (méi wèi)")
                    )
                )
            ),
            questions = listOf(
                StoryQuestion(
                    id = "q_stbflv_1",
                    questionText = "黑牛听到黄牛的回答后，为什么急匆匆地飞奔过去吃草？ (Mengapa sapi hitam langsung buru-buru berlari untuk mencicipi rumput?)",
                    options = listOf("因为它以为那里的草是甜美可口的‘草莓味’ (Karena mengira rumput di sana memiliki rasa stroberi yang lezat)", "因为草地上有猛兽追赶 (Karena ada hewan buas mengejar)", "黄牛邀请它一起睡觉 (Sapi kuning mengajaknya tidur bersama)", "黑牛自己的草地起火了 (Padang rumputnya terbakar)"),
                    correctAnswerIndex = 0,
                    explanation = "Sapi hitam salah mendengar '草没味' (rumput tak berasa) sebagai '草莓味' (rasa buah stroberi)."
                ),
                StoryQuestion(
                    id = "q_stbflv_2",
                    questionText = "尝了一口之后，黑牛为什么非常生气？ (Setelah mencicipi rumput itu, mengapa sapi hitam sangat marah?)",
                    options = listOf("草太硬咬不动 (Rumputnya terlalu keras)", "根本没有草莓甜味，觉得自己被黄牛耍弄欺骗了 (Sama sekali tidak berasa stroberi, merasa ditipu oleh sapi kuning)", "草里藏着小虫子 (Ada ulat di dalam rumput)", "黄牛把所有的草都吃光了 (Sapi kuning menghabiskan semua rumput)"),
                    correctAnswerIndex = 1,
                    explanation = "Teks menyatakan: '很生气：你骗我！这边的草根本不是草莓味'."
                ),
                StoryQuestion(
                    id = "q_stbflv_3",
                    questionText = "黄牛口中的“草没味”真正表达的意思是什么？ (Apa maksud sesungguhnya dari ucapan sapi kuning 'cǎo méi wèi'?)",
                    options = listOf("草上有新鲜草莓酱 (Ada selai stroberi di rumput)", "这边的青草清淡寡淡、没有任何味道 (Rumput di sini tawar dan hambar tanpa rasa)", "青草散发着花香 (Rumput beraroma bunga)", "草莓已经成熟了 (Stroberi sudah matang)"),
                    correctAnswerIndex = 1,
                    explanation = "Maksud sapi kuning adalah '草（没有）味' = rumputnya tidak berasa (hambar), bukan buah '草莓' (stroberi)."
                )
            )
        ),

        // Cerita Mandarin Bean 201 (HSK 3): Different Working Hours (Beragam Pola Jam Kerja)
        Story(
            id = "story_different_working_hours",
            titleHanzi = "不同的工作时间",
            titlePinyin = "Bùtóng de Gōngzuò Shíjiān",
            titleTranslation = "Different Working Hours (Beragam Pola Jam Kerja)",
            level = "HSK 3",
            category = "Gaya Hidup & Pekerjaan",
            description = "Mengenal berbagai istilah pola waktu kerja di era modern seperti 9 to 5 (朝九晚五), 996, 007, sistem libur dua hari (双休), serta pentingnya keseimbangan istirahat.",
            coverEmoji = "⏰",
            coverImageRes = R.drawable.cover_story_different_working_hours,
            estimatedReadMinutes = 2,
            sentences = listOf(
                Sentence(
                    id = "s_difwrk_1",
                    hanzi = "每个人工作的时间都不一样。有的人早上九点上班，下午五点下班，每天工作八个小时，这叫“朝九晚五”。",
                    pinyin = "měi gè rén gōng zuò de shí jiān dōu bù yī yàng yǒu de rén zǎo shang jiǔ diǎn shàng bān xià wǔ wǔ diǎn xià bān měi tiān gōng zuò bā gè xiǎo shí zhè jiào zhāo jiǔ wǎn wǔ",
                    translation = "Jam kerja setiap orang tidaklah sama. Ada orang yang masuk kerja jam sembilan pagi dan pulang jam lima sore, bekerja 8 jam per hari, pola ini disebut 'zhāo jiǔ wǎn wǔ' (kerja 9 to 5).",
                    tokens = listOf(
                        WordToken("每个人", "měi gè rén", "everyone", "Kosakata HSK 2: 每个人 (měi gè rén)"),
                        WordToken("工作时间", "gōng zuò shí jiān", "working hours", "Kosakata HSK 2: 工作时间 (gōng zuò shí jiān)"),
                        WordToken("上班", "shàng bān", "to go to work", "Kosakata HSK 1: 上班 (shàng bān)"),
                        WordToken("下班", "xià bān", "to get off work", "Kosakata HSK 2: 下班 (xià bān)"),
                        WordToken("小时", "xiǎo shí", "hour", "Kosakata HSK 2: 小时 (xiǎo shí)"),
                        WordToken("朝九晚五", "zhāo jiǔ wǎn wǔ", "nine-to-five routine", "Kosakata HSK 3: 朝九晚五 (zhāo jiǔ wǎn wǔ)")
                    )
                ),
                Sentence(
                    id = "s_difwrk_2",
                    hanzi = "现在，还有一些新的工作方式。比如“996”，意思是早上九点上班，晚上九点下班，一个星期工作六天。“007”就更辛苦了，意思是从每天零点工作到第二天零点，一个星期工作七天，没有休息。",
                    pinyin = "xiàn zài hái yǒu yī xiē xīn de gōng zuò fāng shì bǐ rú 996 yì si shì zǎo shang jiǔ diǎn shàng bān wǎn shang jiǔ diǎn xià bān yī gè xīng qī gōng zuò liù tiān 007 jiù gèng xīn kǔ le yì si shì cóng měi tiān líng diǎn gōng zuò dào dì èr tiān líng diǎn yī gè xīng qī gōng zuò qī tiān méi yǒu xiū xi",
                    translation = "Sekarang, terdapat pula beberapa pola kerja baru. Contohnya '996', yang berarti masuk kerja jam 9 pagi, pulang jam 9 malam, dan bekerja enam hari seminggu. Pola '007' bahkan jauh lebih berat lagi, artinya bekerja dari jam 00.00 hingga jam 00.00 keesokan harinya (24 jam non-stop), tujuh hari seminggu tanpa henti istirahat.",
                    tokens = listOf(
                        WordToken("工作方式", "gōng zuò fāng shì", "work style / mode", "Kosakata HSK 3: 方式 (fāng shì)"),
                        WordToken("意思", "yì si", "meaning", "Kosakata HSK 2: 意思 (yì si)"),
                        WordToken("辛苦", "xīn kǔ", "hard / laborious", "Kosakata HSK 3: 辛苦 (xīn kǔ)"),
                        WordToken("零点", "líng diǎn", "midnight / 00:00", "Kosakata HSK 3: 零点 (líng diǎn)"),
                        WordToken("休息", "xiū xi", "to rest", "Kosakata HSK 2: 休息 (xiū xi)")
                    )
                ),
                Sentence(
                    id = "s_difwrk_3",
                    hanzi = "如果星期六和星期天常常不用工作，可以休息或者出去玩，这叫“双休”。但是，也有的人星期六要工作，只有星期天可以休息，这叫“单休”。还有的人工作一天，休息一天，这叫“做一休一”。",
                    pinyin = "rú guǒ xīng qī liù hé xīng qī tiān cháng cháng bù yòng gōng zuò kě yǐ xiū xi huò zhě chū qù wán zhè jiào shuāng xiū dàn shì yě yǒu de rén xīng qī liù yào gōng zuò zhǐ yǒu xīng qī tiān kě yǐ xiū xi zhè jiào dān xiū hái yǒu de rén gōng zuò yī tiān xiū xi yī tiān zhè jiào zuò yī xiū yī",
                    translation = "Jika hari Sabtu dan Minggu biasanya libur tidak bekerja, sehingga bisa beristirahat atau jalan-jalan rekreasi, ini dinamakan 'shuāngxiū' (libur 2 hari akhir pekan). Namun, ada pula yang hari Sabtu tetap harus bekerja dan hanya hari Minggu yang libur, ini dinamakan 'dānxiū' (libur 1 hari). Ada pula yang bekerja satu hari lalu libur satu hari, ini disebut sistem 'zuò yī xiū yī' (kerja sehari libur sehari).",
                    tokens = listOf(
                        WordToken("不用", "bù yòng", "need not", "Kosakata HSK 2: 不用 (bù yòng)"),
                        WordToken("或者", "huò zhě", "or", "Kosakata HSK 3: 或者 (huò zhě)"),
                        WordToken("双休", "shuāng xiū", "two-day weekend", "Kosakata HSK 3: 双休 (shuāng xiū)"),
                        WordToken("单休", "dān xiū", "one-day weekend", "Kosakata HSK 3: 单休 (dān xiū)"),
                        WordToken("做一休一", "zuò yī xiū yī", "work one day rest one day", "Kosakata HSK 3: 做一休一 (zuò yī xiū yī)")
                    )
                ),
                Sentence(
                    id = "s_difwrk_4",
                    hanzi = "工作很重要，但是休息也很重要。我们需要有足够的休息时间，这样才能生活得开心、健康。",
                    pinyin = "gōng zuò hěn zhòng yào dàn shì xiū xi yě hěn zhòng yào wǒ men xū yào yǒu zú gòu de xiū xi shí jiān zhè yàng cái néng shēng huó de kāi xīn jiàn kāng",
                    translation = "Bekerja itu penting, namun istirahat juga sama pentingnya. Kita perlu memiliki waktu istirahat yang memadai, barulah kita dapat menjalani hidup dengan bahagia dan sehat.",
                    tokens = listOf(
                        WordToken("重要", "zhòng yào", "important", "Kosakata HSK 2: 重要 (zhòng yào)"),
                        WordToken("休息", "xiū xi", "rest", "Kosakata HSK 2: 休息 (xiū xi)"),
                        WordToken("需要", "xū yào", "to need / require", "Kosakata HSK 3: 需要 (xū yào)"),
                        WordToken("足够", "zú gòu", "enough / sufficient", "Kosakata HSK 3: 足够 (zú gòu)"),
                        WordToken("这样", "zhè yàng", "in this way / like this", "Kosakata HSK 2: 这样 (zhè yàng)"),
                        WordToken("健康", "jiàn kāng", "healthy / health", "Kosakata HSK 3: 健康 (jiàn kāng)")
                    )
                )
            ),
            questions = listOf(
                StoryQuestion(
                    id = "q_difwrk_1",
                    questionText = "职场中常说的“朝九晚五”指代的是怎样的作息安排？ (Apa maksud dari jadwal kerja 'zhāo jiǔ wǎn wǔ' / 9 to 5?)",
                    options = listOf("早上5点上班，晚上9点下班 (Masuk jam 5 pagi, pulang jam 9 malam)", "早上9点上班，下午5点下班，日工作8小时 (Masuk jam 9 pagi, pulang jam 5 sore, bekerja 8 jam per hari)", "每隔9天休息5天 (Tiap 9 hari libur 5 hari)", "一个月只上9天班 (Sebulan hanya masuk kerja 9 hari)"),
                    correctAnswerIndex = 1,
                    explanation = "Teks menyatakan: '有的人早上九点上班，下午五点下班，每天工作八个小时，这叫朝九晚五'."
                ),
                StoryQuestion(
                    id = "q_difwrk_2",
                    questionText = "高强度工作模式“996”具体代表什么含义？ (Apa arti spesifik dari model kerja intensitas tinggi '996'?)",
                    options = listOf("早上9点上班、晚上9点下班、每周工作6天 (Masuk jam 9 pagi, pulang jam 9 malam, bekerja 6 hari dalam seminggu)", "月薪9960元 (Gaji bulanan 9960 yuan)", "每天工作9.96个小时 (Bekerja 9,96 jam setiap hari)", "9月9日到6月放假 (Libur dari 9 September sampai Juni)"),
                    correctAnswerIndex = 0,
                    explanation = "Teks menjelaskan: '996意思是早上九点上班，晚上九点下班，一个星期工作六天'."
                ),
                StoryQuestion(
                    id = "q_difwrk_3",
                    questionText = "在公司制度中，周末“双休”通常意味着哪两天可以休息？ (Dalam sistem kerja, 'shuāngxiū' biasanya berarti libur pada hari apa?)",
                    options = listOf("星期一和星期二 (Senin dan Selasa)", "星期六和星期天 (Sabtu dan Minggu)", "星期三和星期五 (Rabu dan Jumat)", "每个月末的两天 (Dua hari di akhir bulan)"),
                    correctAnswerIndex = 1,
                    explanation = "Teks menyatakan: '如果星期六和星期天常常不用工作，可以休息或者出去玩，这叫双休'."
                ),
                StoryQuestion(
                    id = "q_difwrk_4",
                    questionText = "文章对于‘工作’与‘休息’的关系得出了什么结论？ (Kesimpulan apa yang ditarik penulis mengenai hubungan kerja dan istirahat?)",
                    options = listOf("年轻人应该完全放弃休息全力拼搏 (Anak muda harus melupakan istirahat demi kerja)", "工作虽然重要，但充足的休息对于开心和健康同样不可或缺 (Bekerja memang penting, namun istirahat cukup sama pentingnya demi kebahagiaan dan kesehatan)", "只要工资高就不需要休息 (Asal gaji tinggi tidak butuh istirahat)", "休假会降低公司的竞争力 (Cuti akan menurunkan daya saing perusahaan)"),
                    correctAnswerIndex = 1,
                    explanation = "Teks menegaskan: '工作很重要，但是休息也很重要。我们需要有足够的休息时间，这样才能生活得开心、健康'."
                )
            )
        ),

        // Cerita Mandarin Bean 202 (HSK 3): Autumn Outing (Wisata Musim Gugur)
        Story(
            id = "story_autumn_outing",
            titleHanzi = "秋游",
            titlePinyin = "Qiūyóu",
            titleTranslation = "Autumn Outing (Wisata Musim Gugur)",
            level = "HSK 3",
            category = "Kehidupan & Alam",
            description = "Tips dan panduan penting saat bertamasya di musim gugur: memperhatikan cuaca, persiapan pakaian hangat berlapis, hingga menjaga keselamatan di tempat wisata.",
            coverEmoji = "🍁",
            coverImageRes = R.drawable.cover_story_autumn_outing,
            estimatedReadMinutes = 2,
            sentences = listOf(
                Sentence(
                    id = "s_autout_1",
                    hanzi = "秋天的天气不冷不热，是出去玩的好时候，但我们也要注意安全。首先要去大家都知道的地方玩，不要去没有人去的地方，也不要爬没有路的山。",
                    pinyin = "qiū tiān de tiān qì bù lěng bù rè shì chū qù wán de hǎo shí hou dàn wǒ men yě yào zhù yì ān quán shǒu xiān yào qù dà jiā dōu zhī dào de dì fang wán bù yào qù méi yǒu rén qù de dì fang yě bù yào pá méi yǒu lù de shān",
                    translation = "Cuaca di musim gugur tidak dingin dan tidak panas, saat yang sangat tepat untuk jalan-jalan ke luar, namun kita juga harus memperhatikan keselamatan. Pertama-tama pergilah ke tempat wisata yang sudah umum dikenal orang, jangan pergi ke tempat antah berantah yang sepi pengunjung, dan jangan mendaki gunung yang tidak ada jalurnya.",
                    tokens = listOf(
                        WordToken("秋天", "qiū tiān", "autumn / fall", "Kosakata HSK 3: 秋天 (qiū tiān)"),
                        WordToken("不冷不热", "bù lěng bù rè", "neither cold nor hot", "Kosakata HSK 2: 冷 (lěng), 热 (rè)"),
                        WordToken("注意安全", "zhù yì ān quán", "pay attention to safety", "Kosakata HSK 3: 注意 (zhù yì), 安全 (ān quán)"),
                        WordToken("首先", "shǒu xiān", "first of all", "Kosakata HSK 3: 首先 (shǒu xiān)"),
                        WordToken("爬山", "pá shān", "to climb a mountain", "Kosakata HSK 2: 爬山 (pá shān)")
                    )
                ),
                Sentence(
                    id = "s_autout_2",
                    hanzi = "出门前要先看看天气，如果有大风或者下雨，就不要出去玩了。早上和晚上天气比较冷，我们可以多穿几件衣服，这样热了可以脱掉。",
                    pinyin = "chū mén qián yào xiān kàn kàn tiān qì rú guǒ yǒu dà fēng huò zhě xià yǔ jiù bù yào chū qù wán le zǎo shang hé wǎn shang tiān qì bǐ jiào lěng wǒ men kě yǐ duō chuān jǐ jiàn yī fu zhè yàng rè le kě yǐ tuō diào",
                    translation = "Sebelum keluar rumah periksalah ramalan cuaca terlebih dahulu, jika ada angin kencang atau hujan deras sebaiknya urungkan bepergian. Pagi dan malam hari udaranya relatif dingin, kita bisa memakai pakaian berlapis, sehingga jika siang terasa gerah bisa dilepas.",
                    tokens = listOf(
                        WordToken("出门前", "chū mén qián", "before leaving home", "Kosakata HSK 2: 出门前 (chū mén qián)"),
                        WordToken("大风", "dà fēng", "strong wind", "Kosakata HSK 3: 风 (fēng)"),
                        WordToken("或者", "huò zhě", "or", "Kosakata HSK 3: 或者 (huò zhě)"),
                        WordToken("下雨", "xià yǔ", "to rain", "Kosakata HSK 1: 下雨 (xià yǔ)"),
                        WordToken("比较", "bǐ jiào", "relatively / comparatively", "Kosakata HSK 3: 比较 (bǐ jiào)"),
                        WordToken("穿衣服", "chuān yī fu", "to wear clothes", "Kosakata HSK 1: 穿衣服 (chuān yī fu)"),
                        WordToken("脱掉", "tuō diào", "to take off (clothes)", "Kosakata HSK 3: 脱 (tuō)")
                    )
                ),
                Sentence(
                    id = "s_autout_3",
                    hanzi = "还要记得带上热水、吃的东西和一些常用的药。在景点玩的时候要听工作人员的话，不要乱扔东西，也不能玩火。",
                    pinyin = "hái yào jì de dài shàng rè shuǐ chī de dōng xi hé yī xiē cháng yòng de yào zài jǐng diǎn wán de shí hou yào tīng gōng zuò rén yuán de huà bù yào luàn rēng dōng xi yě bù néng wán huǒ",
                    translation = "Ingatlah pula untuk membawa air hangat, bekal makanan, serta obat-obatan yang biasa dipakai. Saat berekreasi di tempat wisata, dengarkanlah arahan petugas, jangan membuang sampah sembarangan, dan dilarang bermain api.",
                    tokens = listOf(
                        WordToken("记得", "jì de", "to remember", "Kosakata HSK 3: 记得 (jì de)"),
                        WordToken("热水", "rè shuǐ", "hot water", "Kosakata HSK 2: 热水 (rè shuǐ)"),
                        WordToken("常用", "cháng yòng", "commonly used", "Kosakata HSK 3: 常用 (cháng yòng)"),
                        WordToken("药", "yào", "medicine", "Kosakata HSK 2: 药 (yào)"),
                        WordToken("景点", "jǐng diǎn", "scenic spot / tourist attraction", "Kosakata HSK 3: 景点 (jǐng diǎn)"),
                        WordToken("工作人员", "gōng zuò rén yuán", "staff / worker", "Kosakata HSK 3: 工作人员 (gōng zuò rén yuán)"),
                        WordToken("乱扔", "luàn rēng", "to litter carelessly", "Kosakata HSK 3: 乱 (luàn), 扔 (rēng)"),
                        WordToken("玩火", "wán huǒ", "to play with fire", "Kosakata HSK 3: 玩火 (wán huǒ)")
                    )
                ),
                Sentence(
                    id = "s_autout_4",
                    hanzi = "最后要穿舒服的鞋，走路不要太累，做自己能做到的事就好。希望大家都玩得开心！",
                    pinyin = "zuì hòu yào chuān shū fu de xié zǒu lù bù yào tài lèi zuò zì jǐ néng zuò dào de shì jiù hǎo xī wàng dà jiā dōu wán de kāi xīn",
                    translation = "Terakhir, kenakanlah sepatu yang nyaman, jangan berjalan sampai kelewat lelah, sesuaikan dengan batas kemampuan fisik masing-masing. Semoga teman-teman sekalian bersenang-senang dan gembira!",
                    tokens = listOf(
                        WordToken("最后", "zuì hòu", "finally / lastly", "Kosakata HSK 3: 最后 (zuì hòu)"),
                        WordToken("舒服", "shū fu", "comfortable", "Kosakata HSK 3: 舒服 (shū fu)"),
                        WordToken("鞋", "xié", "shoes", "Kosakata HSK 3: 鞋 (xié)"),
                        WordToken("走路", "zǒu lù", "to walk", "Kosakata HSK 2: 走路 (zǒu lù)"),
                        WordToken("希望", "xī wàng", "to hope / wish", "Kosakata HSK 2: 希望 (xī wàng)"),
                        WordToken("开心", "kāi xīn", "happy", "Kosakata HSK 2: 开心 (kāi xīn)")
                    )
                )
            ),
            questions = listOf(
                StoryQuestion(
                    id = "q_autout_1",
                    questionText = "秋季出游在选择目的地时，文章强调的首要安全准则是什么？ (Prinsip keamanan utama apa yang ditekankan saat memilih tempat wisata di musim gugur?)",
                    options = listOf("专挑人迹罕至的未开发荒山探险 (Khusus memilih gunung terjal tak berpenghuni)", "去大家都熟知正规的地方，切勿去偏僻险境或攀爬没有路径的山 (Kunjungi tempat resmi yang umum dikenal, jangan ke daerah terpencil atau mendaki buatan tanpa jalur)", "只要风景美，即使有危险警告也无妨 (Asal pemandangan bagus, abaikan peringatan bahaya)", "只去收费最昂贵的高档度假村 (Hanya ke resor termahal)"),
                    correctAnswerIndex = 1,
                    explanation = "Teks menyatakan: '首先要去大家都知道的地方玩，不要去没有人去的地方，也不要爬没有路的山'."
                ),
                StoryQuestion(
                    id = "q_autout_2",
                    questionText = "应对秋天早晚温差大的气候特征，文章推荐了怎样的穿衣策略？ (Strategi berpakaian apa yang dianjurkan untuk menghadapi perbedaan suhu siang dan malam?)",
                    options = listOf("只穿单薄的短袖 (Hanya memakai kaus tipis pendek)", "多穿几件衣服，热的时候可以脱下调整 (Memakai pakaian berlapis sehingga bisa dilepas saat terasa gerah)", "从早到晚裹着厚重羽绒服绝不脱下 (Mengenakan jaket bulu tebal sepanjang hari tanpa dilepas)", "完全不用考虑温度变化 (Sama sekali tidak perlu memperhatikan suhu)"),
                    correctAnswerIndex = 1,
                    explanation = "Teks menyebutkan: '早上和晚上天气比较冷，我们可以多穿几件衣服，这样热了可以脱掉'."
                ),
                StoryQuestion(
                    id = "q_autout_3",
                    questionText = "在秋游景区游玩时，游客应当严格遵守哪些行为规范？ (Aturan perilaku apa yang wajib dipatuhi pengunjung saat di area objek wisata?)",
                    options = listOf("服从工作人员指引，不乱扔垃圾，严禁在野外玩火 (Patuhi arahan staf, jangan buang sampah sembarangan, dilarang bermain api)", "随地生火野炊烤肉 (Menyalakan api unggun sembarangan)", "随意采摘景区名贵植物花草 (Memetik tanaman langka sekehendak hati)", "攀爬古迹雕像拍照 (Memanjat patung monumen untuk berfoto)"),
                    correctAnswerIndex = 0,
                    explanation = "Teks mengingatkan: '在景点玩的时候要听工作人员的话，不要乱扔东西，也不能玩火'."
                )
            )
        ),

        // Cerita Mandarin Bean 203 (HSK 3): Walking in High Temperatures (Berjalan di Bawah Terik Suhu Tinggi)
        Story(
            id = "story_walking_in_high_temperatures",
            titleHanzi = "高温下行走",
            titlePinyin = "Gāowēn Xià Xíngzǒu",
            titleTranslation = "Walking in High Temperatures (Berjalan di Bawah Terik Suhu Tinggi)",
            level = "HSK 3",
            category = "Berita & Kesehatan",
            description = "Fenomena unik seorang wanita di Xi'an yang berjalan bertelanjang kaki dan berjemur di bawah terik matahari 40°C demi terapi menghangatkan tubuh.",
            coverEmoji = "☀️",
            coverImageRes = R.drawable.cover_story_walking_in_high_temperatures,
            estimatedReadMinutes = 2,
            sentences = listOf(
                Sentence(
                    id = "s_wlkhtp_1",
                    hanzi = "在陕西西安，夏天天气非常热，中午的温度甚至超过了40摄氏度。一位姓李的女士会在下午三点左右出门，不穿鞋袜，赤脚走路，还在太阳下晒背，时间大约一个小时。",
                    pinyin = "zài Shǎn xī Xī ān xià tiān tiān qì fēi cháng rè zhōng wǔ de wēn dù shèn zhì chāo guò le sì shí Shè shì dù yī wèi xìng Lǐ de nǚ shì huì zài xià wǔ sān diǎn zuǒ yòu chū mén bù chuān xié wà chì jiǎo zǒu lù hái zài tài yáng xià shài bèi shí jiān dà yuē yī gè xiǎo shí",
                    translation = "Di kota Xi'an, Shaanxi, cuaca di musim panas luar biasa terik, di mana suhu tengah hari bahkan menembus lebih dari 40 derajat Celsius. Seorang wanita bermarga Li kerap keluar rumah sekitar jam tiga sore tanpa memakai sepatu maupun kaus kaki, berjalan kaki telanjang (nyeker), dan berjemur punggung di bawah sinar matahari selama sekitar satu jam.",
                    tokens = listOf(
                        WordToken("陕西西安", "Shǎn xī Xī ān", "Xi'an, Shaanxi", "Nama tempat: 陕西西安"),
                        WordToken("温度", "wēn dù", "temperature", "Kosakata HSK 3: 温度 (wēn dù)"),
                        WordToken("甚至", "shèn zhì", "even / so much as to", "Kosakata HSK 3: 甚至 (shèn zhì)"),
                        WordToken("超过", "chāo guò", "to exceed / surpass", "Kosakata HSK 3: 超过 (chāo guò)"),
                        WordToken("摄氏度", "Shè shì dù", "degrees Celsius", "Kosakata HSK 3: 摄氏度 (Shè shì dù)"),
                        WordToken("女士", "nǚ shì", "lady / madam", "Kosakata HSK 3: 女士 (nǚ shì)"),
                        WordToken("左右", "zuǒ yòu", "around / approximately", "Kosakata HSK 3: 左右 (zuǒ yòu)"),
                        WordToken("赤脚", "chì jiǎo", "barefoot", "Kosakata HSK 3: 赤脚 (chì jiǎo)"),
                        WordToken("太阳", "tài yáng", "sun", "Kosakata HSK 3: 太阳 (tài yáng)"),
                        WordToken("晒背", "shài bèi", "sunbathe one's back", "Kosakata HSK 3: 晒 (shài)")
                    )
                ),
                Sentence(
                    id = "s_wlkhtp_2",
                    hanzi = "李女士说，她的身体比较冷，有很多“寒气”，所以她想用晒太阳的方法让身体变暖。她自己很喜欢这样做，觉得对身体有好处。",
                    pinyin = "Lǐ nǚ shì shuō tā de shēn tǐ bǐ jiào lěng yǒu hěn duō hán qì suǒ yǐ tā xiǎng yòng shài tài yáng de fāng fǎ ràng shēn tǐ biàn nuǎn tā zì jǐ hěn xǐ huan zhè yàng zuò jué de duì shēn tǐ yǒu hǎo chu",
                    translation = "Ibu Li menuturkan bahwa fisiknya cenderung dingin dan menyimpan banyak hawa dingin ('hánqì'), oleh karena itu ia ingin memanfaatkan metode berjemur sinar mentari untuk menghangatkan tubuhnya. Ia sendiri sangat menyukai metode ini dan merasa ini mendatangkan khasiat baik bagi kesehatannya.",
                    tokens = listOf(
                        WordToken("比较", "bǐ jiào", "relatively / quite", "Kosakata HSK 3: 比较 (bǐ jiào)"),
                        WordToken("寒气", "hán qì", "cold qi / internal chill", "Istilah tradisional: 寒气 (hán qì)"),
                        WordToken("方法", "fāng fǎ", "method / way", "Kosakata HSK 3: 方法 (fāng fǎ)"),
                        WordToken("变暖", "biàn nuǎn", "become warm", "Kosakata HSK 3: 变 (biàn), 暖 (nuǎn)"),
                        WordToken("好处", "hǎo chu", "benefit / advantage", "Kosakata HSK 3: 好处 (hǎo chu)")
                    )
                ),
                Sentence(
                    id = "s_wlkhtp_3",
                    hanzi = "不过，她也说，不是每个人都可以这样做。刚开始的人要特别小心，时间不要太久，也不要在太热的时候晒太阳。",
                    pinyin = "bù guò tā yě shuō bù shì měi gè rén dōu kě yǐ zhè yàng zuò gāng kāi shǐ de rén yào tè bié xiǎo xīn shí jiān bù yào tài jiǔ yě bù yào zài tài rè de shí hou shài tài yáng",
                    translation = "Namun demikian, ia juga mengingatkan bahwa tidak semua orang cocok melakukan terapi ekstrem seperti ini. Bagi pemula harus ekstra waspada, jangan berjemur terlalu lama, dan jangan berjemur pada saat suhu sedang luar biasa membakar.",
                    tokens = listOf(
                        WordToken("不过", "bù guò", "however / but", "Kosakata HSK 3: 不过 (bù guò)"),
                        WordToken("刚开始", "gāng kāi shǐ", "just beginning / novice", "Kosakata HSK 3: 刚 (gāng)"),
                        WordToken("特别", "tè bié", "especially / particularly", "Kosakata HSK 2: 特别 (tè bié)"),
                        WordToken("小心", "xiǎo xīn", "careful / cautious", "Kosakata HSK 3: 小心 (xiǎo xīn)"),
                        WordToken("太久", "tài jiǔ", "too long (time)", "Kosakata HSK 3: 久 (jiǔ)"),
                        WordToken("晒太阳", "shài tài yáng", "to sunbathe", "Kosakata HSK 3: 晒太阳 (shài tài yáng)")
                    )
                )
            ),
            questions = listOf(
                StoryQuestion(
                    id = "q_wlkhtp_1",
                    questionText = "西安的李女士在盛夏炎热午后有着怎样不同寻常的锻炼习惯？ (Kebiasaan berolahraga tidak biasa apa yang dilakukan Ibu Li di Xi'an pada siang musim panas?)",
                    options = listOf("在室内开零下空调滑冰 (Berseluncur es di dalam ruangan)", "在40度高温下赤脚在地面行走并在烈日下晒背约一小时 (Berjalan telanjang kaki di atas tanah dan berjemur punggung di bawah terik 40 derajat selama sekitar 1 jam)", "泡在冰水桶里游泳 (Berenang di tong air es)", "每天下午三点吃麻辣火锅 (Makan hotpot pedas setiap jam 3 sore)"),
                    correctAnswerIndex = 1,
                    explanation = "Teks menyatakan: '中午的温度甚至超过了40摄氏度。一位姓李的女士会在下午三点左右出门，不穿鞋袜，赤脚走路，还在太阳下晒背，时间大约一个小时'."
                ),
                StoryQuestion(
                    id = "q_wlkhtp_2",
                    questionText = "李女士之所以坚持顶着高温暴晒背部的初衷是什么？ (Apa alasan awal Ibu Li bersikeras berjemur di bawah suhu panas?)",
                    options = listOf("为了将皮肤晒成古铜色 (Demi mendapatkan kulit cokelat eksotis)", "自感体质偏寒、寒气较重，希望借助日光阳气驱寒暖身 (Merasa tubuhnya dingin dan banyak hawa dingin, ingin memanfaatkan energi matahari menghangatkan badan)", "躲避家里的蚊虫 (Menghindari nyamuk di rumah)", "跟邻居打赌比试耐热能力 (Bertaruh ketahanan panas dengan tetangga)"),
                    correctAnswerIndex = 1,
                    explanation = "Ibu Li menjelaskan: '她的身体比较冷，有很多“寒气”，所以她想用晒太阳的方法让身体变暖'."
                ),
                StoryQuestion(
                    id = "q_wlkhtp_3",
                    questionText = "针对这种晒背疗法，李女士对公众做出了怎样的谨慎提醒？ (Peringatan kehati-hatian apa yang disampaikan Ibu Li kepada masyarakat terkait terapi berjemur ini?)",
                    options = listOf("建议所有人不论体质都可以放胆模仿 (Menyarankan semua orang meniru tanpa pandang bulu)", "体质因人而异，初学者须极其小心，不可暴晒过久或在极热时段贸然尝试 (Kondisi tubuh tiap orang berbeda; pemula harus sangat hati-hati, jangan terlalu lama atau di saat suhu terlalu ekstrem)", "晒太阳前必须喝大量热茶 (Wajib minum banyak teh panas sebelum berjemur)", "暴晒时间越长效果越好 (Makin lama berjemur makin bagus)"),
                    correctAnswerIndex = 1,
                    explanation = "Teks memperingatkan: '不是每个人都可以这样做。刚开始的人要特别小心，时间不要太久，也不要在太热的时候晒太阳'."
                )
            )
        )
    )
}
