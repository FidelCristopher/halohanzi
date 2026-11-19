package com.example.chineselearning.data.repository

import com.example.chineselearning.R
import com.example.chineselearning.data.model.Sentence
import com.example.chineselearning.data.model.Story
import com.example.chineselearning.data.model.StoryQuestion
import com.example.chineselearning.data.model.WordToken

val mandarinBeanStoriesPart19: List<Story> by lazy {
    listOf(
        // Cerita Mandarin Bean 204 (HSK 3): An email —— Thank You for Helping Me Move (Surat Elektronik Terima Kasih Bantu Pindahan)
        Story(
            id = "story_email_thank_you_for_helping_me_move",
            titleHanzi = "谢谢你帮我搬家",
            titlePinyin = "Xièxie Nǐ Bāng Wǒ Bānjiā",
            titleTranslation = "An Email: Thank You for Helping Me Move (Email Terima Kasih Bantu Pindahan)",
            level = "HSK 3",
            category = "Kehidupan & Surat",
            description = "Surel ucapan terima kasih tulus dari Zhang Yi kepada Xiao Yang yang telah membantunya pindahan rumah, disertai undangan makan malam santai di rumah barunya.",
            coverEmoji = "📦",
            coverImageRes = R.drawable.cover_story_thank_you_for_helping_me_move,
            estimatedReadMinutes = 2,
            sentences = listOf(
                Sentence(
                    id = "s_emmv_1",
                    hanzi = "寄件人：zhangyi@email.com；收件人：yangchen@email.com；主题：谢谢你帮我搬家。",
                    pinyin = "jì jiàn rén zhangyi@email.com shōu jiàn rén yangchen@email.com zhǔ tí xiè xie nǐ bāng wǒ bān jiā",
                    translation = "Pengirim: zhangyi@email.com; Penerima: yangchen@email.com; Subjek: Terima kasih sudah membantuku pindah rumah.",
                    tokens = listOf(
                        WordToken("寄件人", "jì jiàn rén", "sender (mail)", "Kosakata HSK 3: 寄 (jì)"),
                        WordToken("收件人", "shōu jiàn rén", "recipient", "Kosakata HSK 3: 收 (shōu)"),
                        WordToken("主题", "zhǔ tí", "subject / topic", "Kosakata HSK 3: 主题 (zhǔ tí)"),
                        WordToken("谢谢", "xiè xie", "thank you", "Kosakata HSK 1: 谢谢 (xiè xie)"),
                        WordToken("搬家", "bān jiā", "to move house", "Kosakata HSK 3: 搬家 (bān jiā)")
                    )
                ),
                Sentence(
                    id = "s_emmv_2",
                    hanzi = "小杨，你好！谢谢你上周末帮我搬家，你一定累坏了吧。",
                    pinyin = "Xiǎo Yáng nǐ hǎo xiè xie nǐ shàng zhōu mò bāng wǒ bān jiā nǐ yī dìng lèi huài le ba",
                    translation = "Xiao Yang, halo! Terima kasih banyak akhir pekan lalu sudah membantuku pindah rumah, kamu pasti sangat kelelahan sekali ya.",
                    tokens = listOf(
                        WordToken("周末", "zhōu mò", "weekend", "Kosakata HSK 3: 周末 (zhōu mò)"),
                        WordToken("搬家", "bān jiā", "to move house", "Kosakata HSK 3: 搬家 (bān jiā)"),
                        WordToken("一定", "yī dìng", "certainly / must be", "Kosakata HSK 3: 一定 (yī dìng)"),
                        WordToken("累坏了", "lèi huài le", "exhausted / tired out", "Kosakata HSK 3: 坏 (huài)")
                    )
                ),
                Sentence(
                    id = "s_emmv_3",
                    hanzi = "我刚到这个城市，没有很多朋友，对这里的环境也不熟悉。你给了我很多帮助和温暖，真的非常感谢你！",
                    pinyin = "wǒ gāng dào zhè ge chéng shì méi yǒu hěn duō péng you duì zhè lǐ de huán jìng yě bù shú xi nǐ gěi le wǒ hěn duō bāng zhù hé wēn nuǎn zhēn de fēi cháng gǎn xiè nǐ",
                    translation = "Saya baru saja tiba di kota ini, belum memiliki banyak teman, dan juga belum terbiasa dengan lingkungan di sini. Kamu telah memberikan begitu banyak bantuan dan kehangatan, saya sungguh amat berterima kasih kepadamu!",
                    tokens = listOf(
                        WordToken("刚到", "gāng dào", "just arrived", "Kosakata HSK 3: 刚 (gāng)"),
                        WordToken("城市", "chéng shì", "city", "Kosakata HSK 2: 城市 (chéng shì)"),
                        WordToken("环境", "huán jìng", "environment / surroundings", "Kosakata HSK 3: 环境 (huán jìng)"),
                        WordToken("熟悉", "shú xi", "familiar with", "Kosakata HSK 3: 熟悉 (shú xi)"),
                        WordToken("帮助", "bāng zhù", "help / assistance", "Kosakata HSK 2: 帮助 (bāng zhù)"),
                        WordToken("温暖", "wēn nuǎn", "warmth", "Kosakata HSK 3: 温暖 (wēn nuǎn)"),
                        WordToken("感谢", "gǎn xiè", "to thank / grateful", "Kosakata HSK 3: 感谢 (gǎn xiè)")
                    )
                ),
                Sentence(
                    id = "s_emmv_4",
                    hanzi = "这个周末我想请你来我的新家吃饭。我们可以一起聊天、听音乐。你喜欢吃什么菜？我中餐、西餐都会做。希望你能来。盼复！张一",
                    pinyin = "zhè ge zhōu mò wǒ xiǎng qǐng nǐ lái wǒ de xīn jiā chī fàn wǒ men kě yǐ yī qǐ liáo tiān tīng yīn yuè nǐ xǐ huan chī shén me cài wǒ zhōng cān xī cān dōu huì zuò xī wàng nǐ néng lái pàn fù Zhāng Yī",
                    translation = "Akhir pekan ini saya ingin mengundangmu datang makan di rumah baru saya. Kita bisa mengobrol santai dan mendengarkan musik bersama. Kamu suka masakan apa? Masakan Tionghoa maupun barat saya bisa memasaknya. Semoga kamu bisa datang ya. Menantikan balasanmu! Zhang Yi.",
                    tokens = listOf(
                        WordToken("请", "qǐng", "to invite / treat", "Kosakata HSK 1: 请 (qǐng)"),
                        WordToken("新家", "xīn jiā", "new home", "Kosakata HSK 2: 新 (xīn)"),
                        WordToken("聊天", "liáo tiān", "to chat", "Kosakata HSK 3: 聊天 (liáo tiān)"),
                        WordToken("听音乐", "tīng yīn yuè", "listen to music", "Kosakata HSK 2: 音乐 (yīn yuè)"),
                        WordToken("中餐", "zhōng cān", "Chinese food", "Kosakata HSK 3: 中餐 (zhōng cān)"),
                        WordToken("西餐", "xī cān", "Western food", "Kosakata HSK 3: 西餐 (xī cān)"),
                        WordToken("盼复", "pàn fù", "looking forward to reply", "Kosakata formal: 盼复 (pàn fù)")
                    )
                )
            ),
            questions = listOf(
                StoryQuestion(
                    id = "q_emmv_1",
                    questionText = "张一写这封电子邮件的最主要目的是什么？ (Apa tujuan utama Zhang Yi menulis email ini?)",
                    options = listOf("向小杨借钱买新家具 (Meminjam uang untuk beli furnitur)", "感谢小杨上周末帮忙搬家，并邀请他到新家做客用餐 (Mengucapkan terima kasih atas bantuan pindahan dan mengundangnya makan di rumah baru)", "请小杨帮忙找新工作 (Meminta Xiao Yang mencarikan pekerjaan)", "抱怨新城市的房子太贵 (Mengeluhkan harga sewa rumah yang mahal)"),
                    correctAnswerIndex = 1,
                    explanation = "Zhang Yi menulis email untuk berterima kasih: '谢谢你上周末帮我搬家... 这个周末我想请你来我的新家吃饭'."
                ),
                StoryQuestion(
                    id = "q_emmv_2",
                    questionText = "张一初到这座城市时面临怎样的处境？ (Bagaimana keadaan Zhang Yi ketika pertama kali tiba di kota ini?)",
                    options = listOf("有很多亲戚住在一起 (Tinggal bersama banyak kerabat)", "没有很多朋友，对这里的周边环境也不熟悉 (Belum punya banyak teman dan belum akrab dengan lingkungan sekitar)", "已经在这里生活了十年 (Sudah tinggal sepuluh tahun di sana)", "中文说得非常不流利 (Bahasa Mandarinnya belum lancar)"),
                    correctAnswerIndex = 1,
                    explanation = "Teks menyatakan: '我刚到这个城市，没有很多朋友，对这里的环境也不熟悉'."
                ),
                StoryQuestion(
                    id = "q_emmv_3",
                    questionText = "张一在邮件中提到自己会做哪些菜肴招待客人？ (Masakan apa yang bisa dibuat oleh Zhang Yi untuk menjamu tamunya?)",
                    options = listOf("只会煮方便面 (Hanya bisa merebus mi instan)", "中餐和西餐都会做 (Bisa memasak masakan Tionghoa maupun barat)", "只会做日本料理 (Hanya bisa membuat kuliner Jepang)", "不会做饭，打算叫外卖 (Tidak bisa masak, mau beli pesan antar)"),
                    correctAnswerIndex = 1,
                    explanation = "Zhang Yi menulis: '你喜欢吃什么菜？我中餐、西餐都会做'."
                ),
                StoryQuestion(
                    id = "q_emmv_4",
                    questionText = "邮件末尾的“盼复”在中文书信中通常表达什么礼貌意思？ (Apa makna sopan dari istilah 'pàn fù' di akhir surat?)",
                    options = listOf("请不要回复邮件 (Mohon jangan dibalas)", "盼望收到对方的答复与回信 (Menantikan kabar/balasan dari penerima)", "祝对方身体健康 (Semoga sehat selalu)", "催促对方尽快还钱 (Menagih utang secepatnya)"),
                    correctAnswerIndex = 1,
                    explanation = "'盼复' (pàn fù) adalah ungkapan sopan formal dalam surat/surel yang berarti 'mengharapkan balasan'."
                )
            )
        ),

        // Cerita Mandarin Bean 205 (HSK 3): Blind Boxes (Kotak Misteri / Blind Box)
        Story(
            id = "story_blind_boxes",
            titleHanzi = "盲盒",
            titlePinyin = "Mánghé",
            titleTranslation = "Blind Boxes (Tren Kotak Misteri Mainan)",
            level = "HSK 3",
            category = "Gaya Hidup & Tren",
            description = "Mengenal tren kotak misteri 'blind box' yang digemari anak muda, sensasi kejutan di dalamnya, serta tips bijak agar tidak boros berbelanja.",
            coverEmoji = "🎁",
            coverImageRes = R.drawable.cover_story_blind_boxes,
            estimatedReadMinutes = 2,
            sentences = listOf(
                Sentence(
                    id = "s_blndbx_1",
                    hanzi = "什么是盲盒？盲盒是一种你买的时候不知道里面是什么的盒子。你打开后，才知道里面是什么。有时候是一个小玩具，有时候是一个小动物。每个盲盒里面的东西都不一样，所以很多人喜欢买来看看自己能得到什么。",
                    pinyin = "shén me shì máng hé máng hé shì yī zhǒng nǐ mǎi de shí hou bù zhī dào lǐ miàn shì shén me de hé zi nǐ dǎ kāi hòu cái zhī dào lǐ miàn shì shén me yǒu shí hou shì yī gè xiǎo wán jù yǒu shí hou shì yī gè xiǎo dòng wù měi gè máng hé lǐ miàn de dōng xi dōu bù yī yàng suǒ yǐ hěn duō rén xǐ huan mǎi lái kàn kàn zì jǐ néng dé dào shén me",
                    translation = "Apa itu blind box? Blind box adalah sejenis kotak yang saat kamu beli, kamu tidak mengetahui apa isi di dalamnya. Setelah dibuka, barulah kamu tahu isinya. Terkadang berupa mainan mini, terkadang patung hewan kecil. Isi setiap kotak berbeda-beda, sehingga banyak orang gemar membelinya untuk melihat apa yang akan mereka dapatkan.",
                    tokens = listOf(
                        WordToken("盲盒", "máng hé", "blind box", "Istilah tren: 盲盒 (máng hé)"),
                        WordToken("盒子", "hé zi", "box / case", "Kosakata HSK 3: 盒子 (hé zi)"),
                        WordToken("打开", "dǎ kāi", "to open", "Kosakata HSK 2: 打开 (dǎ kāi)"),
                        WordToken("玩具", "wán jù", "toy", "Kosakata HSK 3: 玩具 (wán jù)"),
                        WordToken("动物", "dòng wù", "animal", "Kosakata HSK 2: 动物 (dòng wù)"),
                        WordToken("得到", "dé dào", "to get / obtain", "Kosakata HSK 3: 得到 (dé dào)")
                    )
                ),
                Sentence(
                    id = "s_blndbx_2",
                    hanzi = "很多人喜欢盲盒，因为你不知道会得到什么东西。有的人想要收集一整套的玩具，所以会买很多盲盒。有时候，里面会有特别的玩具，大家都想得到。",
                    pinyin = "hěn duō rén xǐ huan máng hé yīn wèi nǐ bù zhī dào huì dé dào shén me dōng xi yǒu de rén xiǎng yào shōu jí yī zhěng tào de wán jù suǒ yǐ huì mǎi hěn duō máng hé yǒu shí hou lǐ miàn huì yǒu tè bié de wán jù dà jiā dōu xiǎng dé dào",
                    translation = "Banyak orang menyukai blind box karena sensasi penasaran tidak tahu apa yang akan diperoleh. Sebagian orang ingin mengoleksi satu set mainan lengkap, sehingga mereka membeli banyak blind box. Terkadang, ada edisi mainan rahasia yang sangat langka yang ingin didapatkan semua orang.",
                    tokens = listOf(
                        WordToken("收集", "shōu jí", "to collect", "Kosakata HSK 3: 收集 (shōu jí)"),
                        WordToken("整套", "zhěng tào", "whole set", "Kosakata HSK 3: 套 (tào)"),
                        WordToken("特别", "tè bié", "special / unique", "Kosakata HSK 2: 特别 (tè bié)"),
                        WordToken("大家", "dà jiā", "everyone", "Kosakata HSK 1: 大家 (dà jiā)")
                    )
                ),
                Sentence(
                    id = "s_blndbx_3",
                    hanzi = "有些人买了很多盲盒，花了很多钱，但还是没有得到自己想要的那一个。有时候，盲盒里面的东西不太好，或者不喜欢。还有一些人买了太多盲盒，家里都放不下了。",
                    pinyin = "yǒu xiē rén mǎi le hěn duō máng hé huā le hěn duō qián dàn hái shi méi yǒu dé dào zì jǐ xiǎng yào de nà yī gè yǒu shí hou máng hé lǐ miàn de dōng xi bù tài hǎo huò zhě bù xǐ huan hái yǒu yī xiē rén mǎi le tài duō máng hé jiā lǐ dōu fàng bu xià le",
                    translation = "Beberapa orang telah membeli amat banyak blind box dan menghabiskan banyak uang, namun tetap saja belum mendapatkan varian yang sangat diinginkannya. Kadang kala barang di dalamnya tidak terlalu bagus atau tidak disukai. Ada pula yang membeli terlalu banyak hingga rumah mereka tak muat lagi menampungnya.",
                    tokens = listOf(
                        WordToken("花钱", "huā qián", "to spend money", "Kosakata HSK 3: 花 (huā)"),
                        WordToken("想要", "xiǎng yào", "to want", "Kosakata HSK 2: 想要 (xiǎng yào)"),
                        WordToken("或者", "huò zhě", "or", "Kosakata HSK 3: 或者 (huò zhě)"),
                        WordToken("放不下", "fàng bu xià", "cannot fit / no room", "Kosakata HSK 3: 放 (fàng)")
                    )
                ),
                Sentence(
                    id = "s_blndbx_4",
                    hanzi = "盲盒很有意思，但是不要买太多。大家可以和朋友交换自己不喜欢的玩具。这样，不但可以省钱，还可以交到新朋友。",
                    pinyin = "máng hé hěn yǒu yì si dàn shì bù yào mǎi tài duō dà jiā kě yǐ hé péng you jiāo huàn zì jǐ bù xǐ huan de wán jù zhè yàng bù dàn kě yǐ shěng qián hái kě yǐ jiāo dào xīn péng you",
                    translation = "Blind box memang sangat mengasyikkan, tetapi janganlah membeli berlebihan. Kita bisa saling bertukar mainan yang tidak kita sukai dengan teman. Dengan cara ini, kita tidak hanya bisa berhemat uang, melainkan juga bisa menambah teman-teman baru.",
                    tokens = listOf(
                        WordToken("有意思", "yǒu yì si", "interesting / fun", "Kosakata HSK 2: 有意思 (yǒu yì si)"),
                        WordToken("交换", "jiāo huàn", "to exchange / swap", "Kosakata HSK 3: 交换 (jiāo huàn)"),
                        WordToken("不但", "bù dàn", "not only", "Kosakata HSK 3: 不但 (bù dàn)"),
                        WordToken("省钱", "shěng qián", "to save money", "Kosakata HSK 3: 省 (shěng)"),
                        WordToken("交朋友", "jiāo péng you", "to make friends", "Kosakata HSK 3: 交 (jiāo)")
                    )
                )
            ),
            questions = listOf(
                StoryQuestion(
                    id = "q_blndbx_1",
                    questionText = "“盲盒”之所以被称为盲盒，主要特点是什么？ (Apa ciri khas utama mengapa dinamakan 'blind box' / kotak misteri?)",
                    options = listOf("盒子里装的全部是盲人眼镜 (Isi kotaknya kacamata tunanetra)", "购买前无法直接看到内部装有什么具体款式玩具 (Pembeli tidak bisa melihat varian mainan spesifik di dalam sebelum dibuka)", "盒子外观全是一片黑色 (Tampilan kotaknya serba hitam)", "只能在夜晚闭着眼睛购买 (Hanya boleh dibeli malam hari sambil menutup mata)"),
                    correctAnswerIndex = 1,
                    explanation = "Teks menjelaskan: '盲盒是一种你买的时候不知道里面是什么的盒子。你打开后，才知道里面是什么'."
                ),
                StoryQuestion(
                    id = "q_blndbx_2",
                    questionText = "为什么许多消费者会忍不住一次购买大量的盲盒？ (Mengapa banyak pembeli terdorong membeli kotak misteri dalam jumlah besar?)",
                    options = listOf("想集齐全套系列或抽中稀有的隐藏特别款 (Ingin mengoleksi satu set lengkap atau memburu edisi rahasia langka)", "盲盒可以当饭吃 (Mainan bisa dimakan)", "买了可以抵扣税款 (Bisa memotong pajak)", "商家规定一人必须买一百个 (Toko mewajibkan beli minimal 100 buah)"),
                    correctAnswerIndex = 0,
                    explanation = "Teks menyebutkan: '有的人想要收集一整套的玩具... 里面会有特别的玩具，大家都想得到'."
                ),
                StoryQuestion(
                    id = "q_blndbx_3",
                    questionText = "盲盒过度消费可能会带来哪些负面烦恼？ (Masalah negatif apa yang timbul bila konsumsi blind box berlebihan?)",
                    options = listOf("玩具会自动跑掉 (Mainannya kabur sendiri)", "花费大量金钱却抽不到心仪款式，家里堆积过多放不下 (Menghabiskan banyak uang tanpa dapat varian impian, dan rumah sesak)", "警察会没收盲盒 (Polisi akan menyita blind box)", "会导致视力下降 (Menyebabkan mata minus)"),
                    correctAnswerIndex = 1,
                    explanation = "Teks menyatakan: '花了很多钱，但还是没有得到自己想要的那一个... 家里都放不下了'."
                ),
                StoryQuestion(
                    id = "q_blndbx_4",
                    questionText = "作者建议大家如何理性对待抽到重复或不喜欢的盲盒玩具？ (Saran bijak apa yang diberikan penulis terhadap mainan yang dobel atau tak disukai?)",
                    options = listOf("直接扔进垃圾桶 (Langsung buang ke tempat sampah)", "与朋友互相交换，既能省钱又能结交新朋友 (Saling bertukar dengan teman: berhemat sekaligus dapat kawan baru)", "找商家大吵大闹要求退货 (Memarahi toko minta retur)", "偷偷塞给陌生人 (Memberikan diam-diam ke orang asing)"),
                    correctAnswerIndex = 1,
                    explanation = "Teks menganjurkan: '大家可以和朋友交换自己不喜欢的玩具。这样，不但可以省钱，还可以交到新朋友'."
                )
            )
        ),

        // Cerita Mandarin Bean 206 (HSK 3): How to Get to People's Park? (Bagaimana Menuju Taman Rakyat?)
        Story(
            id = "story_how_to_get_to_peoples_park",
            titleHanzi = "怎么去人民公园？",
            titlePinyin = "Zěnme Qù Rénmín Gōngyuán?",
            titleTranslation = "How to Get to People's Park? (Menuju Taman Rakyat)",
            level = "HSK 3",
            category = "Transportasi & Arah",
            description = "Percakapan menanyakan arah jalan yang cukup rumit antara bus dan beberapa kali transfer jalur subway, yang berakhir dengan keputusan praktis naik taksi.",
            coverEmoji = "🚏",
            coverImageRes = R.drawable.cover_story_how_to_get_to_peoples_park,
            estimatedReadMinutes = 1,
            sentences = listOf(
                Sentence(
                    id = "s_peoprk_1",
                    hanzi = "A：“请问人民公园怎么走？”",
                    pinyin = "qǐng wèn rén mín gōng yuán zěn me zǒu",
                    translation = "A: 'Permisi, numpang tanya bagaimana cara menuju ke Taman Rakyat ya?'",
                    tokens = listOf(
                        WordToken("请问", "qǐng wèn", "excuse me / may I ask", "Kosakata HSK 2: 请问 (qǐng wèn)"),
                        WordToken("人民公园", "rén mín gōng yuán", "People's Park", "Nama tempat: 人民公园"),
                        WordToken("怎么走", "zěn me zǒu", "how to get there / which way", "Kosakata HSK 2: 怎么走 (zěn me zǒu)")
                    )
                ),
                Sentence(
                    id = "s_peoprk_2",
                    hanzi = "B：“你先去等92路公共汽车，坐四站下车，然后换地铁二号线，往机场方向坐三站，换乘六号线，再坐两站就到人民公园站了。出了地铁站你就能看到人民公园的大门。”",
                    pinyin = "nǐ xiān qù děng jiǔ shí èr lù gōng gòng qì chē zuò sì zhàn xià chē rán hòu huàn dì tiě èr hào xiàn wǎng jī chǎng fāng xiàng zuò sān zhàn huàn chéng liù hào xiàn zài zuò liǎng zhàn jiù dào rén mín gōng yuán zhàn le chū le dì tiě zhàn nǐ jiù néng kàn dào rén mín gōng yuán de dà mén",
                    translation = "B: 'Kamu pergi tunggu bus umum nomor 92 dulu, naik sejauh 4 halte lalu turun, setelah itu pindah ke MRT Jalur 2 menuju arah bandara sebanyak 3 stasiun, transit ke Jalur 6 naik 2 stasiun lagi, kamu akan sampai di Stasiun Taman Rakyat. Begitu keluar stasiun MRT, kamu akan langsung melihat gerbang utama Taman Rakyat.'",
                    tokens = listOf(
                        WordToken("公共汽车", "gōng gòng qì chē", "bus", "Kosakata HSK 2: 公共汽车 (gōng gòng qì chē)"),
                        WordToken("换", "huàn", "to change / transfer", "Kosakata HSK 3: 换 (huàn)"),
                        WordToken("地铁", "dì tiě", "subway / MRT", "Kosakata HSK 3: 地铁 (dì tiě)"),
                        WordToken("方向", "fāng xiàng", "direction", "Kosakata HSK 3: 方向 (fāng xiàng)"),
                        WordToken("换乘", "huàn chéng", "to transfer (transit line)", "Kosakata HSK 3: 换乘 (huàn chéng)"),
                        WordToken("大门", "dà mén", "main gate / entrance", "Kosakata HSK 2: 大门 (dà mén)")
                    )
                ),
                Sentence(
                    id = "s_peoprk_3",
                    hanzi = "A：“太麻烦了，我还是打车吧。谢谢！”",
                    pinyin = "tài má fan le wǒ hái shi dǎ chē ba xiè xie",
                    translation = "A: 'Waduh terlalu ribet ya, saya lebih baik naik taksi saja. Terima kasih banyak!'",
                    tokens = listOf(
                        WordToken("麻烦", "má fan", "troublesome / inconvenient", "Kosakata HSK 3: 麻烦 (má fan)"),
                        WordToken("还是", "hái shi", "had better / still", "Kosakata HSK 2: 还是 (hái shi)"),
                        WordToken("打车", "dǎ chē", "to hail a taxi", "Kosakata HSK 2: 打车 (dǎ chē)"),
                        WordToken("谢谢", "xiè xie", "thank you", "Kosakata HSK 1: 谢谢 (xiè xie)")
                    )
                )
            ),
            questions = listOf(
                StoryQuestion(
                    id = "q_peoprk_1",
                    questionText = "根据路人B的指引，乘坐公共交通去人民公园总共需要倒换几次车？ (Menurut arahan orang B, berapa kali perpindahan rute kendaraan yang harus dilakukan?)",
                    options = listOf("直达不用换车 (Langsung tanpa ganti kendaraan)", "一次92路公交加两次地铁换乘（2号线与6号线） (Satu bus 92 ditambah dua kali transit MRT jalur 2 dan jalur 6)", "需要坐三次轮渡 (Harus naik kapal feri 3 kali)", "必须换乘高铁 (Wajib pindah kereta cepat)"),
                    correctAnswerIndex = 1,
                    explanation = "Teks menerangkan: naik bus 92, lalu ganti subway Jalur 2, lalu transit ke Jalur 6."
                ),
                StoryQuestion(
                    id = "q_peoprk_2",
                    questionText = "提问者A听完详细路线后为什么改变主意选择打出租车？ (Mengapa si A membatalkan rencana naik angkutan umum lalu memilih naik taksi?)",
                    options = listOf("公交车车票太贵 (Tiket bus terlalu mahal)", "换乘步骤过于复杂繁琐（太麻烦了） (Proses transit terlalu rumit dan merepotkan)", "下起了暴风雨 (Turun hujan badai)", "人民公园临时闭园 (Taman Rakyat tutup sementara)"),
                    correctAnswerIndex = 1,
                    explanation = "Tokoh A mengatakan: '太麻烦了，我还是打车吧' (Terlalu repot, saya mending naik taksi saja)."
                ),
                StoryQuestion(
                    id = "q_peoprk_3",
                    questionText = "在中文日常出行表达中，“打车”通常指代什么行为？ (Dalam aktivitas harian, istilah 'dǎ chē' berarti apa?)",
                    options = listOf("修理自行车 (Memperbaiki sepeda)", "乘坐/叫出租车或网约车 (Memanggil/menaiki taksi konvensional atau taksi daring)", "驾驶私家车 (Mengemudikan mobil pribadi)", "在公交车上打瞌睡 (Tertidur di dalam bus)"),
                    correctAnswerIndex = 1,
                    explanation = "'打车' (dǎ chē) berarti menyetop atau memesan taksi / transportasi kendaraan umum sewaan."
                )
            )
        ),

        // Cerita Mandarin Bean 207 (HSK 3): A Letter — Language Class (Surat: Kelas Bahasa)
        Story(
            id = "story_letter_language_class",
            titleHanzi = "一封信——语言班",
            titlePinyin = "Yī Fēng Xìn —— Yǔyán Bān",
            titleTranslation = "A Letter: Language Class (Surat Sahabat: Kursus Bahasa)",
            level = "HSK 3",
            category = "Kehidupan & Surat",
            description = "Surat persahabatan dari Linda kepada Wang Bei menceritakan pengalaman serunya di kelas bahasa Mandarin yang diajar oleh guru penutur asli yang disiplin.",
            coverEmoji = "✉️",
            coverImageRes = R.drawable.cover_story_letter_language_class,
            estimatedReadMinutes = 2,
            sentences = listOf(
                Sentence(
                    id = "s_ltlang_1",
                    hanzi = "亲爱的王贝：好久不见！你最近怎么样？这个春天我很忙，除了工作以外，还要上汉语课。",
                    pinyin = "qīn ài de Wáng Bèi hǎo jiǔ bu jiàn nǐ zuì jìn zěn me yàng zhè ge chūn tiān wǒ hěn máng chú le gōng zuò yǐ wài hái yào shàng Hàn yǔ kè",
                    translation = "Wang Bei tersayang: Sudah lama tak berjumpa! Bagaimana kabarmu belakangan ini? Musim semi ini aku sangat sibuk, selain bekerja, aku juga harus mengikuti kelas bahasa Mandarin.",
                    tokens = listOf(
                        WordToken("亲爱的", "qīn ài de", "dear / beloved", "Kosakata HSK 3: 亲爱的 (qīn ài de)"),
                        WordToken("好久不见", "hǎo jiǔ bu jiàn", "long time no see", "Kosakata HSK 3: 久 (jiǔ)"),
                        WordToken("最近", "zuì jìn", "recently", "Kosakata HSK 2: 最近 (zuì jìn)"),
                        WordToken("除了...以外", "chú le yǐ wài", "besides / in addition to", "Tata bahasa HSK 3: 除了...以外"),
                        WordToken("汉语课", "Hàn yǔ kè", "Chinese class", "Kosakata HSK 1: 汉语 (Hàn yǔ)")
                    )
                ),
                Sentence(
                    id = "s_ltlang_2",
                    hanzi = "我们的汉语课有点儿难，因为这个汉语老师只说汉语，不说英语。开始我们以为她不会说英语，后来发现她的英语非常好，但是她不说。",
                    pinyin = "wǒ men de Hàn yǔ kè yǒu diǎnr nán yīn wèi zhè ge Hàn yǔ lǎo shī zhǐ shuō Hàn yǔ bù shuō Yīng yǔ kāi shǐ wǒ men yǐ wéi tā bù huì shuō Yīng yǔ hòu lái fā xiàn tā de Yīng yǔ fēi cháng hǎo dàn shì tā bù shuō",
                    translation = "Kelas bahasa Mandarin kami agak susah, karena guru Mandarin ini hanya berbicara bahasa Mandarin dan tidak pernah mau berbicara bahasa Inggris. Awalnya kami mengira beliau tidak bisa bahasa Inggris, belakangan baru kami sadari kemampuan bahasa Inggrisnya luar biasa fasih, hanya saja beliau sengaja tidak menggunakannya.",
                    tokens = listOf(
                        WordToken("难", "nán", "difficult / hard", "Kosakata HSK 2: 难 (nán)"),
                        WordToken("老师", "lǎo shī", "teacher", "Kosakata HSK 1: 老师 (lǎo shī)"),
                        WordToken("以为", "yǐ wéi", "to mistakenly believe / think", "Kosakata HSK 3: 以为 (yǐ wéi)"),
                        WordToken("后来", "hòu lái", "later / afterwards", "Kosakata HSK 3: 后来 (hòu lái)"),
                        WordToken("发现", "fā xiàn", "to discover / find out", "Kosakata HSK 3: 发现 (fā xiàn)")
                    )
                ),
                Sentence(
                    id = "s_ltlang_3",
                    hanzi = "不过，上了两个月的汉语课，我发现我的汉语进步得非常快，尤其是听力和口语。现在我开始喜欢这个汉语老师了，因为她，我们不得不每天练习汉语。",
                    pinyin = "bù guò shàng le liǎng gè yuè de Hàn yǔ kè wǒ fā xiàn wǒ de Hàn yǔ jìn bù de fēi cháng kuài yóu qí shì tīng lì hé kǒu yǔ xiàn zài wǒ kāi shǐ xǐ huan zhè ge Hàn yǔ lǎo shī le yīn wèi tā wǒ men bù dé bù měi tiān liàn xí Hàn yǔ",
                    translation = "Namun demikian, setelah dua bulan belajar di kelas Mandarin, aku menyadari kemampuanku meningkat pesat sekali, khususnya dalam hal kemampuan mendengarkan dan berbicara. Sekarang aku mulai menyukai guru Mandarin ini; berkat ketegasannya, kami 'terpaksa' harus rajin berlatih bahasa Mandarin setiap hari.",
                    tokens = listOf(
                        WordToken("进步", "jìn bù", "progress / improve", "Kosakata HSK 3: 进步 (jìn bù)"),
                        WordToken("尤其", "yóu qí", "especially / particularly", "Kosakata HSK 3: 尤其 (yóu qí)"),
                        WordToken("听力", "tīng lì", "listening skill", "Kosakata HSK 3: 听力 (tīng lì)"),
                        WordToken("口语", "kǒu yǔ", "spoken language", "Kosakata HSK 3: 口语 (kǒu yǔ)"),
                        WordToken("不得不", "bù dé bù", "cannot but / have to", "Kosakata HSK 3: 不得不 (bù dé bù)"),
                        WordToken("练习", "liàn xí", "to practice", "Kosakata HSK 3: 练习 (liàn xí)")
                    )
                ),
                Sentence(
                    id = "s_ltlang_4",
                    hanzi = "听说你开始学法语了，你的法语怎么样了？老师教得好吗？期待你的回信！祝一切顺利！你的朋友，林达。2025年6月30日。",
                    pinyin = "tīng shuō nǐ kāi shǐ xué Fǎ yǔ le nǐ de Fǎ yǔ zěn me yàng le lǎo shī jiāo de hǎo ma qī dài nǐ de huí xìn zhù yī qiè shùn lì nǐ de péng you Lín Dá èr líng èr wǔ nián liù yuè sān shí rì",
                    translation = "Kudengar kamu mulai belajar bahasa Prancis ya, bagaimana kemampuan bahasa Prancismu sekarang? Apakah gurumu mengajar dengan baik? Aku sangat menantikan surat balasan darimu! Semoga semuanya lancar! Sahabatmu, Linda. 30 Juni 2025.",
                    tokens = listOf(
                        WordToken("听说", "tīng shuō", "to hear that", "Kosakata HSK 2: 听说 (tīng shuō)"),
                        WordToken("法语", "Fǎ yǔ", "French language", "Kosakata HSK 3: 法语 (Fǎ yǔ)"),
                        WordToken("期待", "qī dài", "look forward to", "Kosakata HSK 3: 期待 (qī dài)"),
                        WordToken("回信", "huí xìn", "reply letter", "Kosakata HSK 3: 信 (xìn)"),
                        WordToken("一切顺利", "yī qiè shùn lì", "everything goes smoothly", "Salam HSK 3: 顺利 (shùn lì)")
                    )
                )
            ),
            questions = listOf(
                StoryQuestion(
                    id = "q_ltlang_1",
                    questionText = "林达的汉语老师在课堂教学上有何与众不同的坚持？ (Prinsip mengajar istimewa apa yang dipegang teguh oleh guru Mandarin Linda?)",
                    options = listOf("整堂课全程只说中文，坚决不说一句英语 (Sepanjang kelas hanya berbicara Mandarin dan tidak mau bicara bahasa Inggris)", "只用英语讲解语法 (Hanya memakai bahasa Inggris)", "从来不给学生布置任何作业 (Tidak pernah memberikan PR)", "要求学生每天默写唐诗 (Mewajibkan siswa menghafal puisi Tang)"),
                    correctAnswerIndex = 0,
                    explanation = "Teks menyatakan: '这个汉语老师只说汉语，不说英语... 发现她的英语非常好，但是她不说'."
                ),
                StoryQuestion(
                    id = "q_ltlang_2",
                    questionText = "经过两个月的强化学习，林达的哪两项语言技能进步最为显著？ (Setelah dua bulan, dua aspek keterampilan bahasa apa yang meningkat paling drastis?)",
                    options = listOf("汉字书法与篆刻 (Seni kaligrafi dan stempel)", "听力与口语表达能力 (Kemampuan menyimak/listening dan berbicara/speaking)", "古代汉语阅读 (Membaca Mandarin klasik)", "同声传译能力 (Penerjemahan simultan)"),
                    correctAnswerIndex = 1,
                    explanation = "Teks menjelaskan: '我发现我的汉语进步得非常快，尤其是听力和口语'."
                ),
                StoryQuestion(
                    id = "q_ltlang_3",
                    questionText = "林达在信中向王贝打听了关于哪门外语课程的学习情况？ (Pembelajaran bahasa asing apa yang ditanyakan Linda kepada sahabatnya Wang Bei?)",
                    options = listOf("德语 (Bahasa Jerman)", "法语 (Bahasa Prancis)", "西班牙语 (Bahasa Spanyol)", "俄语 (Bahasa Rusia)"),
                    correctAnswerIndex = 1,
                    explanation = "Linda bertanya: '听说你开始学法语了，你的法语怎么样了？'."
                )
            )
        ),

        // Cerita Mandarin Bean 208 (HSK 3): Diary — My Day (Buku Harian: Hariku)
        Story(
            id = "story_diary_my_day",
            titleHanzi = "日记——我的一天",
            titlePinyin = "Rìjì —— Wǒ de Yītiān",
            titleTranslation = "Diary: My Day (Catatan Buku Harian: Keseharianku)",
            level = "HSK 3",
            category = "Kehidupan Pelajar",
            description = "Catatan harian seorang siswa sekolah yang penuh dinamika: mulai dari kelas pelajaran, santap siang di kantin, meminjam buku fauna di perpustakaan, hingga membantu ibu memasak.",
            coverEmoji = "📔",
            coverImageRes = R.drawable.cover_story_diary_my_day,
            estimatedReadMinutes = 2,
            sentences = listOf(
                Sentence(
                    id = "s_diarday_1",
                    hanzi = "2025年5月20日 | 星期二 | 晴天。今天天气不错，不冷也不热。早上，我七点起床，吃了早饭后去学校上课。我们学习了中文、数学和英语。老师们讲得很认真，但是我有点儿想睡觉，好困呀。",
                    pinyin = "èr líng èr wǔ nián wǔ yuè èr shí rì xīng qī èr qíng tiān jīn tiān tiān qì bù cuò bù lěng yě bù rè zǎo shang wǒ qī diǎn qǐ chuáng chī le zǎo fàn hòu qù xué xiào shàng kè wǒ men xué xí le Zhōng wén shù xué hé Yīng yǔ lǎo shī men jiǎng de hěn rèn zhēn dàn shì wǒ yǒu diǎnr xiǎng shuì jiào hǎo kùn ya",
                    translation = "20 Mei 2025 | Selasa | Cerah. Hari ini cuaca lumayan bagus, tidak dingin maupun panas. Pagi hari, aku bangun pukul tujuh, sarapan lalu berangkat ke sekolah. Kami belajar bahasa Mandarin, matematika, dan bahasa Inggris. Para guru mengajar dengan amat sungguh-sungguh, tetapi aku agak mengantuk, rasanya lelah sekali.",
                    tokens = listOf(
                        WordToken("晴天", "qíng tiān", "sunny day", "Kosakata HSK 2: 晴天 (qíng tiān)"),
                        WordToken("数学", "shù xué", "mathematics", "Kosakata HSK 3: 数学 (shù xué)"),
                        WordToken("认真", "rèn zhēn", "serious / conscientious", "Kosakata HSK 3: 认真 (rèn zhēn)"),
                        WordToken("困", "kùn", "sleepy / tired", "Kosakata HSK 3: 困 (kùn)")
                    )
                ),
                Sentence(
                    id = "s_diarday_2",
                    hanzi = "中午，我和朋友一起在学校食堂吃饭。食堂的菜虽然便宜，但是味道一般。我们聊了很多有趣的事情，大家都很开心。",
                    pinyin = "zhōng wǔ wǒ hé péng you yī qǐ zài xué xiào shí táng chī fàn shí táng de cài suī rán pián yi dàn shì wèi dào yī bān wǒ men liáo le hěn duō yǒu qù de shì qing dà jiā dōu hěn kāi xīn",
                    translation = "Siang harinya, aku bersama kawan-kawan makan di kantin sekolah. Makanan kantin walaupun murah, tapi rasanya biasa saja. Kami mengobrolkan banyak hal yang lucu dan menyenangkan, semuanya merasa senang.",
                    tokens = listOf(
                        WordToken("食堂", "shí táng", "canteen / cafeteria", "Kosakata HSK 3: 食堂 (shí táng)"),
                        WordToken("便宜", "pián yi", "cheap", "Kosakata HSK 2: 便宜 (pián yi)"),
                        WordToken("味道", "wèi dào", "taste / flavor", "Kosakata HSK 3: 味道 (wèi dào)"),
                        WordToken("一般", "yī bān", "ordinary / so-so", "Kosakata HSK 3: 一般 (yī bān)"),
                        WordToken("有趣", "yǒu qù", "interesting / amusing", "Kosakata HSK 3: 有趣 (yǒu qù)")
                    )
                ),
                Sentence(
                    id = "s_diarday_3",
                    hanzi = "下午又上了三节课。放学后，我去图书馆借书。我借了一本关于动物的书，觉得很有意思。晚上回家，我帮妈妈做晚饭，然后写作业。",
                    pinyin = "xià wǔ yòu shàng le sān jié kè fàng xué hòu wǒ qù tú shū guǎn jiè shū wǒ jiè le yī běn guān yú dòng wù de shū jué de hěn yǒu yì si wǎn shang huí jiā wǒ bāng mā ma zuò wǎn fàn rán hòu xiě zuò yè",
                    translation = "Sore harinya mengikuti tiga jam pelajaran lagi. Seusai pulang sekolah, aku ke perpustakaan untuk meminjam buku. Aku meminjam sebuah buku tentang dunia fauna yang terasa sangat seru. Malam harinya di rumah, aku membantu ibu menyiapkan makan malam lalu mengerjakan PR.",
                    tokens = listOf(
                        WordToken("节", "jié", "measure word for class period", "Kosakata HSK 3: 节 (jié)"),
                        WordToken("放学", "fàng xué", "school dismissal", "Kosakata HSK 2: 放学 (fàng xué)"),
                        WordToken("借书", "jiè shū", "to borrow books", "Kosakata HSK 3: 借 (jiè)"),
                        WordToken("关于", "guān yú", "about / concerning", "Kosakata HSK 3: 关于 (guān yú)"),
                        WordToken("作业", "zuò yè", "homework", "Kosakata HSK 3: 作业 (zuò yè)")
                    )
                ),
                Sentence(
                    id = "s_diarday_4",
                    hanzi = "今天有点儿忙，时间不够了，洗澡后准备早点儿睡觉。明天再看那部新电影吧。",
                    pinyin = "jīn tiān yǒu diǎnr máng shí jiān bù gòu le xǐ zǎo hòu zhǔn bèi zǎo diǎnr shuì jiào míng tiān zài kàn nà bù xīn diàn yǐng ba",
                    translation = "Hari ini agak sibuk dan waktu terasa tidak cukup, sehabis mandi aku bersiap tidur lebih awal. Film baru itu besok saja baru kutonton.",
                    tokens = listOf(
                        WordToken("不够", "bù gòu", "not enough", "Kosakata HSK 3: 够 (gòu)"),
                        WordToken("洗澡", "xǐ zǎo", "to take a shower/bath", "Kosakata HSK 2: 洗澡 (xǐ zǎo)"),
                        WordToken("部", "bù", "measure word for films", "Kosakata HSK 3: 部 (bù)"),
                        WordToken("电影", "diàn yǐng", "movie", "Kosakata HSK 1: 电影 (diàn yǐng)")
                    )
                )
            ),
            questions = listOf(
                StoryQuestion(
                    id = "q_diarday_1",
                    questionText = "日记作者在中午对学校食堂的伙食给出了怎样的客观评价？ (Penilaian apa yang diberikan penulis terhadap makanan kantin sekolah?)",
                    options = listOf("价格昂贵但极为美味 (Sangat mahal tapi lezat sekali)", "价格虽然实惠便宜，但味道水平比较一般 (Harganya memang murah, namun rasanya standar/biasa saja)", "完全难以下咽 (Sama sekali tidak bisa ditelan)", "每天都免费供应 (Setiap hari disajikan gratis)"),
                    correctAnswerIndex = 1,
                    explanation = "Teks menyatakan: '食堂的菜虽然便宜，但是味道一般'."
                ),
                StoryQuestion(
                    id = "q_diarday_2",
                    questionText = "放学之后，作者在学校图书馆借阅了关于什么主题的书籍？ (Buku bertema apa yang dipinjam oleh penulis di perpustakaan?)",
                    options = listOf("世界历史地图 (Atlas sejarah dunia)", "关于动物的有趣书籍 (Buku seru tentang dunia hewan/fauna)", "高等数学难题集 (Kumpulan soal matematika rumit)", "科幻小说 (Novel fiksi ilmiah)"),
                    correctAnswerIndex = 1,
                    explanation = "Teks mencatat: '我借了一本关于动物的书，觉得很有意思'."
                ),
                StoryQuestion(
                    id = "q_diarday_3",
                    questionText = "作者为什么决定推迟看新电影，改为早早入睡？ (Mengapa penulis menunda nonton film baru dan memilih lekas tidur?)",
                    options = listOf("家里电视坏了 (TV di rumah rusak)", "白天比较忙碌导致时间不够用，且身体有些犯困 (Siang hari cukup sibuk hingga kehabisan waktu dan tubuh merasa ngantuk)", "电影票卖光了 (Tiket film habis)", "妈妈不许看电影 (Ibu melarang nonton film)"),
                    correctAnswerIndex = 1,
                    explanation = "Teks menyatakan: '今天有点儿忙，时间不够了，洗澡后准备早点儿睡觉。明天再看那部新电影吧'."
                )
            )
        ),

        // Cerita Mandarin Bean 209 (HSK 3): Mom is Missing (Ibu Menghilang di Rest Area)
        Story(
            id = "story_mom_is_missing",
            titleHanzi = "妈妈不见了",
            titlePinyin = "Māma Bù Jiàn Le",
            titleTranslation = "Mom is Missing (Ibu Ketinggalan di Jalan)",
            level = "HSK 3",
            category = "Keluarga & Perjalanan",
            description = "Kisah dramatis sekaligus mengharukan saat mudik Imlek: sang ibu tak sengaja tertinggal di toilet SPBU jalan tol dan kepanikan anak yang mencari tanpa sinyal HP.",
            coverEmoji = "🚗",
            coverImageRes = R.drawable.cover_story_mom_is_missing,
            estimatedReadMinutes = 2,
            sentences = listOf(
                Sentence(
                    id = "s_mommis_1",
                    hanzi = "春节到了，女儿和女婿开车带妈妈从广东回湖北过年。路上，他们在加油站停车加油。",
                    pinyin = "Chūn jié dào le nǚ ér hé nǚ xu kāi chē dài mā ma cóng Guǎng dōng huí Hú běi guò nián lù shang tā men zài jiā yóu zhàn tíng chē jiā yóu",
                    translation = "Hari raya Imlek telah tiba, anak perempuan dan menantu lelakinya mengemudikan mobil membawa sang ibu pulang dari Guangdong ke Hubei untuk merayakan tahun baru. Di perjalanan, mereka menepikan mobil di pom bensin (SPBU) untuk mengisi bensin.",
                    tokens = listOf(
                        WordToken("春节", "Chūn jié", "Spring Festival / CNY", "Kosakata HSK 2: 春节 (Chūn jié)"),
                        WordToken("女婿", "nǚ xu", "son-in-law", "Kosakata HSK 3: 女婿 (nǚ xu)"),
                        WordToken("过年", "guò nián", "celebrate the new year", "Kosakata HSK 2: 过年 (guò nián)"),
                        WordToken("加油站", "jiā yóu zhàn", "gas station", "Kosakata HSK 3: 加油站 (jiā yóu zhàn)"),
                        WordToken("停车", "tíng chē", "to park / stop a car", "Kosakata HSK 2: 停车 (tíng chē)")
                    )
                ),
                Sentence(
                    id = "s_mommis_2",
                    hanzi = "妈妈想上厕所，没有告诉他们就下车了。女儿在车里睡觉，女婿加完油没有看妈妈在不在车上，就开车走了。",
                    pinyin = "mā ma xiǎng shàng cè suǒ méi yǒu gào su tā men jiù xià chē le nǚ ér zài chē lǐ shuì jiào nǚ xu jiā wán yóu méi yǒu kàn mā ma zài bu zài chē shàng jiù kāi chē zǒu le",
                    translation = "Sang ibu ingin ke toilet, dan langsung turun dari mobil tanpa memberi tahu mereka terlebih dahulu. Sang putri sedang tertidur pulas di jok mobil, sedangkan sang menantu selesai mengisi bensin tidak mengecek apakah ibu mertuanya ada di dalam mobil atau tidak, lalu langsung tancap gas pergi.",
                    tokens = listOf(
                        WordToken("上厕所", "shàng cè suǒ", "go to restroom", "Kosakata HSK 2: 厕所 (cè suǒ)"),
                        WordToken("告诉", "gào su", "to tell / inform", "Kosakata HSK 2: 告诉 (gào su)"),
                        WordToken("睡觉", "shuì jiào", "to sleep", "Kosakata HSK 1: 睡觉 (shuì jiào)"),
                        WordToken("加完油", "jiā wán yóu", "finished refueling", "Kosakata HSK 3: 加油 (jiā yóu)")
                    )
                ),
                Sentence(
                    id = "s_mommis_3",
                    hanzi = "车开了一公里，女婿问：“妈妈，你想吃东西吗？”可是没有人说话。这时候他们才发现妈妈不在车里。两个人都很着急，可是手机没有信号，他们不知道怎么办。",
                    pinyin = "chē kāi le yī gōng lǐ nǚ xu wèn mā ma nǐ xiǎng chī dōng xi ma kě shì méi yǒu rén shuō huà zhè shí hou tā men cái fā xiàn mā ma bù zài chē lǐ liǎng gè rén dōu hěn zháo jí kě shì shǒu jī méi yǒu xìn hào tā men bù zhī dào zěn me bàn",
                    translation = "Setelah mobil berjalan sekitar satu kilometer, menantu bertanya: 'Ibu, apakah Ibu ingin makan camilan?' Tetapi tidak ada seorang pun yang menyahut. Pada saat itulah mereka baru terkejut menyadari ibu tidak berada di dalam mobil! Keduanya luar biasa panik, terlebih lagi sinyal ponsel mereka hilang total sehingga mereka tidak tahu harus bagaimana.",
                    tokens = listOf(
                        WordToken("公里", "gōng lǐ", "kilometer", "Kosakata HSK 3: 公里 (gōng lǐ)"),
                        WordToken("发现", "fā xiàn", "to discover / realize", "Kosakata HSK 3: 发现 (fā xiàn)"),
                        WordToken("着急", "zháo jí", "anxious / panicked", "Kosakata HSK 3: 着急 (zháo jí)"),
                        WordToken("信号", "xìn hào", "signal", "Kosakata HSK 3: 信号 (xìn hào)"),
                        WordToken("怎么办", "zěn me bàn", "what to do", "Kosakata HSK 2: 怎么办 (zěn me bàn)")
                    )
                ),
                Sentence(
                    id = "s_mommis_4",
                    hanzi = "幸好路上有工作人员发现了他们。工作人员开车找到了妈妈，安全地把妈妈送回女儿女婿那里。一家人终于又在一起了。",
                    pinyin = "xìng hǎo lù shang yǒu gōng zuò rén yuán fā xiàn le tā men gōng zuò rén yuán kāi chē zhǎo dào le mā ma ān quán de bǎ mā ma sòng huí nǚ ér nǚ xu nà lǐ yī jiā rén zhōng yú yòu zài yī qǐ le",
                    translation = "Untunglah di jalan ada petugas yang memperhatikan kepanikan mereka. Petugas segera mengendarai mobil patroli menyusuri jalan dan berhasil menemukan sang ibu, lalu mengantarkannya kembali dengan selamat kepada anak dan menantunya. Akhirnya sekeluarga bisa berkumpul bersama kembali.",
                    tokens = listOf(
                        WordToken("幸好", "xìng hǎo", "fortunately / luckily", "Kosakata HSK 3: 幸好 (xìng hǎo)"),
                        WordToken("工作人员", "gōng zuò rén yuán", "staff / personnel", "Kosakata HSK 3: 工作人员 (gōng zuò rén yuán)"),
                        WordToken("安全地", "ān quán de", "safely", "Kosakata HSK 3: 安全 (ān quán)"),
                        WordToken("终于", "zhōng yú", "finally / at last", "Kosakata HSK 3: 终于 (zhōng yú)")
                    )
                )
            ),
            questions = listOf(
                StoryQuestion(
                    id = "q_mommis_1",
                    questionText = "妈妈最初为什么会与开车的女儿和女婿不小心走散？ (Mengapa ibu bisa sampai terpisah dari anak dan menantunya?)",
                    options = listOf("妈妈在加油站下车去上厕所，却忘了提前跟睡着的女儿和加油的女婿打招呼 (Ibu turun ke toilet SPBU tanpa memberi tahu anak yang tertidur dan menantu yang sibuk isi bensin)", "妈妈在服务区迷路坐上了别人的车 (Ibu tersesat naik mobil orang lain)", "女儿把妈妈故意留在服务区 (Anak sengaja meninggalkan ibu)", "妈妈自己走回了老家 (Ibu jalan kaki pulang ke kampung)"),
                    correctAnswerIndex = 0,
                    explanation = "Teks menyatakan: '妈妈想上厕所，没有告诉他们就下车了。女儿在车里睡觉，女婿加完油没有看妈妈在不在车上，就开车走了'."
                ),
                StoryQuestion(
                    id = "q_mommis_2",
                    questionText = "当女儿女婿开出1公里发现妈妈不见时，雪上加霜的困境是什么？ (Kesulitan tambahan apa yang membuat situasi makin gawat saat mereka sadar ibu tertinggal?)",
                    options = listOf("车子轮胎突然爆胎 (Ban mobil meledak)", "手机偏偏在这个路段没有任何通信信号 (Ponsel mereka sama sekali tidak ada sinyal)", "天黑下起了大暴雪 (Turun badai salju lebat)", "汽油完全耗尽了 (Bensin habis total)"),
                    correctAnswerIndex = 1,
                    explanation = "Teks menjelaskan: '两个人都很着急，可是手机没有信号，他们不知道怎么办'."
                ),
                StoryQuestion(
                    id = "q_mommis_3",
                    questionText = "走失的妈妈最终是如何安全回到家人身边的？ (Bagaimana akhirnya sang ibu bisa kembali dengan selamat ke keluarganya?)",
                    options = listOf("妈妈自己租了辆出租车追上 (Ibu menyewa taksi mengejar)", "热心的路段巡查工作人员发现情况后，开车协助寻回并安全护送 (Petugas patroli jalan menemukan mereka, lalu mencari dan mengantarkan ibu kembali dengan aman)", "通过广播寻人启事 (Lewat siaran radio pencarian orang hilang)", "妈妈在原地一直等到天亮 (Ibu menunggu di tempat sampai fajar)"),
                    correctAnswerIndex = 1,
                    explanation = "Teks menegaskan: '工作人员开车找到了妈妈，安全地把妈妈送回女儿女婿那里。一家人终于又在一起了'."
                )
            )
        ),

        // Cerita Mandarin Bean 210 (HSK 3): My Bedroom (Kamar Tidurku)
        Story(
            id = "story_my_bedroom",
            titleHanzi = "我的卧室",
            titlePinyin = "Wǒ de Wòshì",
            titleTranslation = "My Bedroom (Kamar Tidur Idaman)",
            level = "HSK 3",
            category = "Kehidupan & Tempat Tinggal",
            description = "Deskripsi mendalam tentang kamar tidur yang mungil namun nyaman, dihiasi dinding dan gorden warna hijau alami, serta sudut membaca yang damai.",
            coverEmoji = "🛏️",
            coverImageRes = R.drawable.cover_story_my_bedroom,
            estimatedReadMinutes = 1,
            sentences = listOf(
                Sentence(
                    id = "s_mybedr_1",
                    hanzi = "我的卧室很小，但是我非常喜欢。卧室中间有一张大床，床边有一张书桌，书桌前放着一把椅子。床的另一边放着一个衣柜和一个书架。",
                    pinyin = "wǒ de wò shì hěn xiǎo dàn shì wǒ fēi cháng xǐ huan wò shì zhōng jiān yǒu yī zhāng dà chuáng chuáng biān yǒu yī zhāng shū zhuō shū zhuō qián fàng zhe yī bǎ yǐ zi chuáng de lìng yī biān fàng zhe yī gè yī guì hé yī gè shū jià",
                    translation = "Kamar tidurku berukuran mungil, tetapi aku sangat menyukainya. Di bagian tengah kamar terdapat sebuah ranjang besar, di sebelah ranjang terdapat meja belajar, dan di depan meja belajar diletakkan sebuah kursi. Di sisi lain ranjang terdapat lemari pakaian dan rak buku.",
                    tokens = listOf(
                        WordToken("卧室", "wò shì", "bedroom", "Kosakata HSK 3: 卧室 (wò shì)"),
                        WordToken("书桌", "shū zhuō", "desk / study table", "Kosakata HSK 3: 桌子 (zhuō zi)"),
                        WordToken("椅子", "yǐ zi", "chair", "Kosakata HSK 1: 椅子 (yǐ zi)"),
                        WordToken("衣柜", "yī guì", "wardrobe / closet", "Kosakata HSK 3: 衣柜 (yī guì)"),
                        WordToken("书架", "shū jià", "bookshelf", "Kosakata HSK 3: 书架 (shū jià)")
                    )
                ),
                Sentence(
                    id = "s_mybedr_2",
                    hanzi = "书架上都是我最喜欢的书，每天晚上坐在窗前看书是我最幸福的时候。卧室的墙是绿色的，窗帘也是绿色的，那是我最喜欢的颜色。书桌上有我的画和花，真是太美了。",
                    pinyin = "shū jià shàng dōu shì wǒ zuì xǐ huan de shū měi tiān wǎn shang zuò zài chuāng qián kàn shū shì wǒ zuì xìng fú de shí hou wò shì de qiáng shì lǜ sè de chuāng lián yě shì lǜ sè de nà shì wǒ zuì xǐ huan de yán sè shū zhuō shàng yǒu wǒ de huà hé huā zhēn shì tài měi le",
                    translation = "Di atas rak buku tersusun semua buku favoritku, setiap malam duduk membaca di depan jendela adalah momen yang paling membahagiakan bagiku. Dinding kamar berwarna hijau, tirai jendelanya juga hijau, itulah warna favoritku. Di atas meja belajar terdapat lukisan dan bunga milikku, sungguh indah sekali.",
                    tokens = listOf(
                        WordToken("幸福", "xìng fú", "happiness / happy", "Kosakata HSK 3: 幸福 (xìng fú)"),
                        WordToken("墙", "qiáng", "wall", "Kosakata HSK 3: 墙 (qiáng)"),
                        WordToken("绿色", "lǜ sè", "green color", "Kosakata HSK 2: 绿色 (lǜ sè)"),
                        WordToken("窗帘", "chuāng lián", "curtain", "Kosakata HSK 3: 窗帘 (chuāng lián)"),
                        WordToken("画", "huà", "painting / drawing", "Kosakata HSK 3: 画 (huà)"),
                        WordToken("花", "huā", "flower", "Kosakata HSK 2: 花 (huā)")
                    )
                )
            ),
            questions = listOf(
                StoryQuestion(
                    id = "q_mybedr_1",
                    questionText = "作者房间的墙壁和窗帘主要采用了哪种心仪的颜色？ (Warna kesukaan apa yang mendominasi dinding dan gorden kamar penulis?)",
                    options = listOf("淡粉色 (Merah muda lembut)", "自然生机的绿色 (Warna hijau alami)", "沉稳的深蓝色 (Biru tua tenang)", "金黄色 (Kuning keemasan)"),
                    correctAnswerIndex = 1,
                    explanation = "Teks menyatakan: '卧室的墙是绿色的，窗帘也是绿色的，那是我最喜欢的颜色'."
                ),
                StoryQuestion(
                    id = "q_mybedr_2",
                    questionText = "在作者看来，每天晚上最感幸福治愈的惬意时刻是什么？ (Bagi penulis, saat-saat paling membahagiakan di malam hari adalah apa?)",
                    options = listOf("躺在床上刷短视频 (Rebahan nonton video pendek)", "坐在窗前静静读书 (Duduk tenang membaca buku di depan jendela)", "和室友通宵打游戏 (Main game semalaman)", "练习弹钢琴 (Latihan main piano)"),
                    correctAnswerIndex = 1,
                    explanation = "Teks menegaskan: '每天晚上坐在窗前看书是我最幸福的时候'."
                ),
                StoryQuestion(
                    id = "q_mybedr_3",
                    questionText = "作者书桌上除了摆放文具之外，还点缀了什么美好物品？ (Selain alat tulis, benda indah apa yang menghiasi meja belajarnya?)",
                    options = listOf("自己的画作与鲜花 (Lukisan karyanya sendiri dan bunga-bunga segar)", "一堆空咖啡杯 (Tumpukan cangkir kopi)", "几只机械手表 (Beberapa jam tangan mekanik)", "昂贵的照相机 (Kamera mahal)"),
                    correctAnswerIndex = 0,
                    explanation = "Teks mencatat: '书桌上有我的画和花，真是太美了'."
                )
            )
        ),

        // Cerita Mandarin Bean 211 (HSK 3): My Day — Business Trip to Shenzhen (Hariku: Perjalanan Dinas ke Shenzhen)
        Story(
            id = "story_my_day_trip",
            titleHanzi = "准备出差",
            titlePinyin = "Zhǔnbèi Chūchāi",
            titleTranslation = "My Day: Business Trip to Shenzhen (Persiapan Dinas ke Shenzhen)",
            level = "HSK 3",
            category = "Bisnis & Perjalanan",
            description = "Rencana jadwal padat seorang karyawan profesional yang hendak melakukan perjalanan dinas bisnis ke Shenzhen: penerbangan pagi, rapat virtual di pesawat, hingga pertemuan klien.",
            coverEmoji = "✈️",
            coverImageRes = R.drawable.cover_story_my_day_trip,
            estimatedReadMinutes = 2,
            sentences = listOf(
                Sentence(
                    id = "s_mydaytr_1",
                    hanzi = "明天要去深圳出差，我计划今晚就准备好出差的东西。明天早上七点一刻起床，洗漱完就出发。坐地铁太浪费时间了，所以我准备打车去机场，车上还能再睡四十五分钟。",
                    pinyin = "míng tiān yào qù Shēn zhèn chū chāi wǒ jì huà jīn wǎn jiù zhǔn bèi hǎo chū chāi de dōng xi míng tiān zǎo shang qī diǎn yī kè qǐ chuáng xǐ shù wán jiù chū fā zuò dì tiě tài làng fèi shí jiān le suǒ yǐ wǒ zhǔn bèi dǎ chē qù jī chǎng chē shàng hái néng zài shuì sì shí wǔ fēn zhōng",
                    translation = "Besok saya harus pergi dinas tugas ke Shenzhen, saya berencana malam ini sudah menyiapkan semua barang keperluan dinas. Besok pagi bangun pukul 07:15, selesai bebenah langsung berangkat. Naik MRT terlalu membuang waktu, jadi saya berencana naik taksi ke bandara, di dalam mobil masih bisa tidur 45 menit lagi.",
                    tokens = listOf(
                        WordToken("深圳", "Shēn zhèn", "Shenzhen", "Nama kota: 深圳"),
                        WordToken("出差", "chū chāi", "to go on business trip", "Kosakata HSK 3: 出差 (chū chāi)"),
                        WordToken("计划", "jì huà", "to plan", "Kosakata HSK 3: 计划 (jì huà)"),
                        WordToken("一刻", "yī kè", "a quarter (15 mins)", "Kosakata HSK 3: 刻 (kè)"),
                        WordToken("浪费", "làng fèi", "to waste", "Kosakata HSK 3: 浪费 (làng fèi)"),
                        WordToken("机场", "jī chǎng", "airport", "Kosakata HSK 2: 机场 (jī chǎng)")
                    )
                ),
                Sentence(
                    id = "s_mydaytr_2",
                    hanzi = "到了机场差不多八点半，可以吃个早餐，然后准备登机。上飞机以后，买个空中wifi，然后准时参加公司九点的线上会议。",
                    pinyin = "dào le jī chǎng chà bu duō bā diǎn bàn kě yǐ chī gè zǎo cān rán hòu zhǔn bèi dēng jī shàng fēi jī yǐ hòu mǎi gè kōng zhōng wifi rán hòu zhǔn shí cān jiā gōng sī jiǔ diǎn de xiàn shàng huì yì",
                    translation = "Tiba di bandara kira-kira pukul setengah sembilan, bisa menyantap sarapan lalu bersiap naik ke pesawat (boarding). Setelah di dalam pesawat, membeli akses WiFi penerbangan, kemudian menghadiri rapat online kantor jam sembilan tepat waktu.",
                    tokens = listOf(
                        WordToken("差不多", "chà bu duō", "almost / about", "Kosakata HSK 3: 差不多 (chà bu duō)"),
                        WordToken("登机", "dēng jī", "to board a plane", "Kosakata HSK 3: 登机 (dēng jī)"),
                        WordToken("准时", "zhǔn shí", "on time / punctual", "Kosakata HSK 3: 准时 (zhǔn shí)"),
                        WordToken("参加", "cān jiā", "to participate / attend", "Kosakata HSK 2: 参加 (cān jiā)"),
                        WordToken("会议", "huì yì", "meeting / conference", "Kosakata HSK 3: 会议 (huì yì)")
                    )
                ),
                Sentence(
                    id = "s_mydaytr_3",
                    hanzi = "下飞机以后等同事来接我，然后去酒店放行李。中午约朋友吃午饭。下午两点差十分准时到达公司的深圳办公室，开始下午的工作。大概工作四个小时左右，我就可以回酒店休息了。这就是我一天的计划。",
                    pinyin = "xià fēi jī yǐ hòu děng tóng shì lái jiē wǒ rán hòu qù jiǔ diàn fàng xíng li zhōng wǔ yuē péng you chī wǔ fàn xià wǔ liǎng diǎn chà shí fēn zhǔn shí dào dá gōng sī de Shēn zhèn bàn gōng shì kāi shǐ xià wǔ de gōng zuò dà gài gōng zuò sì gè xiǎo shí zuǒ yòu wǒ jiù kě yǐ huí jiǔ diàn xiū xi le zhè jiù shì wǒ yī tiān de jì huà",
                    translation = "Turun dari pesawat menunggu rekan kerja menjemputku, lalu menuju hotel untuk menaruh koper bagasi. Siang harinya janjian makan siang bersama kawan. Pukul dua kurang sepuluh menit tiba tepat waktu di kantor cabang Shenzhen untuk memulai pekerjaan sore. Bekerja kira-kira sekitar empat jam, aku sudah bisa kembali ke hotel untuk beristirahat. Begitulah rangkaian rencanaku seharian penuh.",
                    tokens = listOf(
                        WordToken("同事", "tóng shì", "colleague / coworker", "Kosakata HSK 3: 同事 (tóng shì)"),
                        WordToken("酒店", "jiǔ diàn", "hotel", "Kosakata HSK 2: 酒店 (jiǔ diàn)"),
                        WordToken("行李", "xíng li", "luggage / baggage", "Kosakata HSK 3: 行李 (xíng li)"),
                        WordToken("差十分", "chà shí fēn", "ten minutes to", "Kosakata HSK 3: 差 (chà)"),
                        WordToken("到达", "dào dá", "to arrive", "Kosakata HSK 3: 到达 (dào dá)"),
                        WordToken("办公室", "bàn gōng shì", "office", "Kosakata HSK 3: 办公室 (bàn gōng shì)")
                    )
                )
            ),
            questions = listOf(
                StoryQuestion(
                    id = "q_mydaytr_1",
                    questionText = "主角为什么没有选择坐地铁，而是决定打出租车前往机场？ (Mengapa tokoh utama memilih naik taksi ke bandara alih-alih naik MRT?)",
                    options = listOf("地铁票比打车贵 (Tiket MRT lebih mahal dari taksi)", "坐地铁太浪费时间，打车可以在车上多睡45分钟补觉 (Naik MRT terlalu buang waktu, naik taksi bisa tidur 45 menit lagi di jalan)", "今天地铁全线停运 (Hari ini semua jalur MRT mogok)", "他的行李太多地铁不让进 (Bagasi terlalu banyak ditolak MRT)"),
                    correctAnswerIndex = 1,
                    explanation = "Teks menyatakan: '坐地铁太浪费时间了，所以我准备打车去机场，车上还能再睡四十五分钟'."
                ),
                StoryQuestion(
                    id = "q_mydaytr_2",
                    questionText = "在飞机起飞飞行期间，主角安排了哪项重要的工作任务？ (Tugas kerja penting apa yang dijadwalkan tokoh utama saat di dalam pesawat?)",
                    options = listOf("购买空中WiFi准时参加公司9点的线上会议 (Beli in-flight WiFi untuk ikut rapat daring kantor jam 9)", "写完整整一百页的项目报告 (Menulis laporan proyek 100 halaman)", "给所有客户发手写信 (Kirim surat tulis tangan ke semua klien)", "完全关机不处理任何公务 (Mematikan HP tanpa urus tugas kantor)"),
                    correctAnswerIndex = 0,
                    explanation = "Teks menjelaskan: '买个空中wifi，然后准时参加公司九点的线上会议'."
                ),
                StoryQuestion(
                    id = "q_mydaytr_3",
                    questionText = "下午前往深圳办公室展开工作的准确时间是几点？ (Jam berapakah tokoh utama tiba di kantor Shenzhen untuk bekerja?)",
                    options = listOf("上午11点整 (Pukul 11:00 pagi)", "下午两点差十分（13:50） (Pukul 13:50 / jam dua kurang sepuluh)", "傍晚6点 (Pukul 18:00)", "中午12点半 (Pukul 12:30 siang)"),
                    correctAnswerIndex = 1,
                    explanation = "Teks menyebutkan: '下午两点差十分准时到达公司的深圳办公室'."
                )
            )
        ),

        // Cerita Mandarin Bean 212 (HSK 3): Age and Address (Etika Panggilan Berdasarkan Usia)
        Story(
            id = "story_age_and_address",
            titleHanzi = "年龄和称呼",
            titlePinyin = "Niánlíng hé Chēnghu",
            titleTranslation = "Age and Address (Etika Panggilan Berdasarkan Usia)",
            level = "HSK 3",
            category = "Budaya & Etika",
            description = "Panduan budaya Tionghoa dalam menyapa orang lain: mengapa istilah kekeluargaan seperti ge, jie, shushu, dan ayi digunakan secara santun di masyarakat umum.",
            coverEmoji = "🏷️",
            coverImageRes = R.drawable.cover_story_age_and_address,
            estimatedReadMinutes = 2,
            sentences = listOf(
                Sentence(
                    id = "s_ageadr_1",
                    hanzi = "中国人经常聊年龄，人们也经常根据年龄来选择称呼。中国人也常用家庭成员的称呼来叫其他人，这是一种礼貌。",
                    pinyin = "Zhōng guó rén jīng cháng liáo nián líng rén men yě jīng cháng gēn jù nián líng lái xuǎn zé chēng hu Zhōng guó rén yě cháng yòng jiā tíng chéng yuán de chēng hu lái jiào qí tā rén zhè shì yī zhǒng lǐ mào",
                    translation = "Orang Tionghoa sering membicarakan usia, dan orang-orang kerap menentukan panggilan sapaan berdasarkan usia lawan bicara. Orang Tiongkok juga terbiasa menyapa orang lain menggunakan sebutan anggota keluarga, ini merupakan suatu bentuk kesopanan yang ramah.",
                    tokens = listOf(
                        WordToken("年龄", "nián líng", "age", "Kosakata HSK 3: 年龄 (nián líng)"),
                        WordToken("经常", "jīng cháng", "often / frequently", "Kosakata HSK 2: 经常 (jīng cháng)"),
                        WordToken("根据", "gēn jù", "according to / based on", "Kosakata HSK 3: 根据 (gēn jù)"),
                        WordToken("选择", "xuǎn zé", "to choose / select", "Kosakata HSK 3: 选择 (xuǎn zé)"),
                        WordToken("称呼", "chēng hu", "form of address / title", "Kosakata HSK 3: 称呼 (chēng hu)"),
                        WordToken("家庭", "jiā tíng", "family", "Kosakata HSK 3: 家庭 (jiā tíng)"),
                        WordToken("成员", "chéng yuán", "member", "Kosakata HSK 3: 成员 (chéng yuán)"),
                        WordToken("礼貌", "lǐ mào", "politeness / courtesy", "Kosakata HSK 3: 礼貌 (lǐ mào)")
                    )
                ),
                Sentence(
                    id = "s_ageadr_2",
                    hanzi = "比如，比自己年龄大的，我们常叫“哥”“姐”，有时候会加上他们的姓，比如“张哥”“王姐”，不认识的人可以叫“大哥”“大姐”。",
                    pinyin = "bǐ rú bǐ zì jǐ nián líng dà de wǒ men cháng jiào gē jiě yǒu shí hou huì jiā shàng tā men de xìng bǐ rú Zhāng gē Wáng jiě bù rèn shi de rén kě yǐ jiào dà gē dà jiě",
                    translation = "Sebagai contoh, kepada orang yang usianya sedikit lebih tua dari diri kita, kita biasa menyapa 'Gē' (abang) atau 'Jiě' (kakak perempuan), terkadang ditambah marga mereka seperti 'Zhang Ge' atau 'Wang Jie'. Untuk orang yang belum saling kenal bisa dipanggil 'Da Ge' atau 'Da Jie'.",
                    tokens = listOf(
                        WordToken("比", "bǐ", "compared to", "Kosakata HSK 2: 比 (bǐ)"),
                        WordToken("姓", "xìng", "surname", "Kosakata HSK 1: 姓 (xìng)"),
                        WordToken("认识", "rèn shi", "to know", "Kosakata HSK 1: 认识 (rèn shi)"),
                        WordToken("大哥", "dà gē", "elder brother / sir", "Panggilan hormat: 大哥 (dà gē)"),
                        WordToken("大姐", "dà jiě", "elder sister / ma'am", "Panggilan hormat: 大姐 (dà jiě)")
                    )
                ),
                Sentence(
                    id = "s_ageadr_3",
                    hanzi = "如果这个人与自己父母的年龄差不多，可以叫他们“叔叔”“阿姨”。如果这个人的年龄和自己的爷爷、奶奶差不多，可以叫他们“爷爷”“奶奶”。如果认识，在称呼前面加上姓就可以了。",
                    pinyin = "rú guǒ zhè ge rén yǔ zì jǐ fù mǔ de nián líng chà bu duō kě yǐ jiào tā men shū shu ā yí rú guǒ zhè ge rén de nián líng hé zì jǐ de yé ye nǎi nai chà bu duō kě yǐ jiào tā men yé ye nǎi nai rú guǒ rèn shi zài chēng hu qián miàn jiā shàng xìng jiù kě yǐ le",
                    translation = "Jika usia orang tersebut sebaya dengan orang tua kita, kita bisa memanggil mereka 'Shūshu' (paman) atau 'Āyí' (tante). Jika usianya sebaya kakek-nenek kita, kita bisa memanggil mereka 'Yéye' (kakek) atau 'Nǎinai' (nenek). Jika sudah kenal, cukup tambahkan marga di depan sebutan panggilan tersebut.",
                    tokens = listOf(
                        WordToken("父母", "fù mǔ", "parents", "Kosakata HSK 3: 父母 (fù mǔ)"),
                        WordToken("差不多", "chà bu duō", "almost similar", "Kosakata HSK 3: 差不多 (chà bu duō)"),
                        WordToken("叔叔", "shū shu", "uncle", "Kosakata HSK 3: 叔叔 (shū shu)"),
                        WordToken("阿姨", "ā yí", "auntie", "Kosakata HSK 3: 阿姨 (ā yí)"),
                        WordToken("爷爷", "yé ye", "grandfather", "Kosakata HSK 2: 爷爷 (yé ye)"),
                        WordToken("奶奶", "nǎi nai", "grandmother", "Kosakata HSK 2: 奶奶 (nǎi nai)")
                    )
                )
            ),
            questions = listOf(
                StoryQuestion(
                    id = "q_ageadr_1",
                    questionText = "在中国传统人际交往中，人们为什么习惯借用家庭亲属称谓来称呼社会他人？ (Mengapa orang Tionghoa terbiasa memakai sebutan kerabat keluarga untuk menyapa orang lain di masyarakat?)",
                    options = listOf("因为整个城市都是同一家族 (Karena sekota satu marga)", "这是一种拉近人际距离、表达尊敬与友好的礼貌文化 (Bentuk budaya sopan santun untuk mengakrabkan dan menunjukkan rasa hormat)", "法律强制规定 (Peraturan wajib hukum)", "因为记不住别人的真实名字 (Karena lupa nama orang)"),
                    correctAnswerIndex = 1,
                    explanation = "Teks menyatakan: '中国人也常用家庭成员的称呼来叫其他人，这是一种礼貌'."
                ),
                StoryQuestion(
                    id = "q_ageadr_2",
                    questionText = "遇到年龄与自己父母相仿的中年长辈，最恰当礼貌的称呼是什么？ (Apa panggilan paling sopan kepada orang paruh baya yang seumuran dengan orang tua kita?)",
                    options = listOf("小弟、小妹 (Xiao di / Xiao mei)", "叔叔、阿姨 (Shūshu / Āyí)", "老头、老太太 (Lǎotóu / Lǎotàitai)", "同学 (Tóngxué)"),
                    correctAnswerIndex = 1,
                    explanation = "Teks menyebutkan: '如果这个人与自己父母的年龄差不多，可以叫他们“叔叔”“阿姨”'."
                ),
                StoryQuestion(
                    id = "q_ageadr_3",
                    questionText = "在街头遇到完全不相识但年龄略大一点的成年人，通常可以怎样礼貌称呼？ (Bagaimana menyapa orang dewasa asing yang sedikit lebih tua di jalan?)",
                    options = listOf("叫名字缩写 (Singkatan nama)", "称呼“大哥”或“大姐” (Menyapa 'Dà Gē' atau 'Dà Jiě')", "喂！ (Wei!)", "大爷 (Dà yé)"),
                    correctAnswerIndex = 1,
                    explanation = "Teks menegaskan: '不认识的人可以叫“大哥”“大姐”'."
                )
            )
        ),

        // Cerita Mandarin Bean 213 (HSK 3): Age (Menebak Usia)
        Story(
            id = "story_age_guess",
            titleHanzi = "猜年龄",
            titlePinyin = "Cāi Niánlíng",
            titleTranslation = "Age: Guessing Game (Menebak Usia Pelayan Toko)",
            level = "HSK 3",
            category = "Cerita Lucu & Kehidupan",
            description = "Percakapan hangat di sebuah toko saat sang pelayan wanita disangka berusia jauh lebih muda dari usia aslinya, lalu berlanjut ke perbincangan seru seputar shio lahir.",
            coverEmoji = "🎂",
            coverImageRes = R.drawable.cover_story_age,
            estimatedReadMinutes = 1,
            sentences = listOf(
                Sentence(
                    id = "s_agegs_1",
                    hanzi = "商店的服务员阿姨觉得妈妈看起来很年轻，爸爸也很高兴。他们开始猜阿姨多大年纪。",
                    pinyin = "shāng diàn de fú wù yuán ā yí jué de mā ma kàn qǐ lái hěn nián qīng bà ba yě hěn gāo xìng tā men kāi shǐ cāi ā yí duō dà nián jì",
                    translation = "Bibi pelayan di toko merasa bahwa ibu tampak awet muda sekali, ayah pun turut merasa senang. Mereka kemudian mulai saling menebak berapa gerangan usia si bibi pelayan toko tersebut.",
                    tokens = listOf(
                        WordToken("服务员", "fú wù yuán", "waiter / store clerk", "Kosakata HSK 2: 服务员 (fú wù yuán)"),
                        WordToken("看起来", "kàn qǐ lái", "looks like", "Kosakata HSK 3: 看起来 (kàn qǐ lái)"),
                        WordToken("年轻", "nián qīng", "young", "Kosakata HSK 3: 年轻 (nián qīng)"),
                        WordToken("猜", "cāi", "to guess", "Kosakata HSK 3: 猜 (cāi)"),
                        WordToken("年纪", "nián jì", "age (of person)", "Kosakata HSK 3: 年纪 (nián jì)")
                    )
                ),
                Sentence(
                    id = "s_agegs_2",
                    hanzi = "阿姨说：“你们猜猜我多少岁？”妈妈想了想，说：“我觉得你四十岁左右。”阿姨笑了，说：“不对，我今年五十岁了。”大家都感到惊讶。然后，他们又聊起了属相，哪年出生的问题也变得有趣起来。",
                    pinyin = "ā yí shuō nǐ men cāi cāi wǒ duō shao suì mā ma xiǎng le xiǎng shuō wǒ jué de nǐ sì shí suì zuǒ yòu ā yí xiào le shuō bù duì wǒ jīn nián wǔ shí suì le dà jiā dōu gǎn dào jīng yà rán hòu tā men yòu liáo qǐ le shǔ xiàng nǎ nián chū shēng de wèn tí yě biàn de yǒu qù qǐ lái",
                    translation = "Bibi itu tersenyum berucap: 'Coba kalian tebak berapa umur saya?' Ibu berpikir sejenak lalu berkata: 'Saya rasa usia Anda sekitar 40 tahunan.' Bibi itu tertawa gembira dan berkata: 'Salah, tahun ini saya sudah genap 50 tahun lho!' Semua orang pun merasa kagum dan terkejut. Setelah itu, mereka mengobrol seru tentang shio (zodiak Tionghoa), dan topik tahun kelahiran pun menjadi obrolan yang amat menyenangkan.",
                    tokens = listOf(
                        WordToken("岁", "suì", "years old", "Kosakata HSK 1: 岁 (suì)"),
                        WordToken("左右", "zuǒ yòu", "around / approximately", "Kosakata HSK 3: 左右 (zuǒ yòu)"),
                        WordToken("感到", "gǎn dào", "to feel / sense", "Kosakata HSK 3: 感到 (gǎn dào)"),
                        WordToken("惊讶", "jīng yà", "surprised / astonished", "Kosakata HSK 3: 惊讶 (jīng yà)"),
                        WordToken("属相", "shǔ xiàng", "Chinese zodiac animal", "Istilah budaya: 属相 (shǔ xiàng)"),
                        WordToken("出生", "chū shēng", "to be born", "Kosakata HSK 3: 出生 (chū shēng)"),
                        WordToken("有趣", "yǒu qù", "interesting / fun", "Kosakata HSK 3: 有趣 (yǒu qù)")
                    )
                )
            ),
            questions = listOf(
                StoryQuestion(
                    id = "q_agegs_1",
                    questionText = "妈妈最初猜测商店服务员阿姨的大致年龄是多少岁？ (Berapa perkiraan usia pelayan toko yang ditebak oleh ibu pada awalnya?)",
                    options = listOf("大约20岁 (Kira-kira 20 tahun)", "四十岁左右 (Sekitar 40 tahunan)", "六十多岁 (Enam puluh tahun lebih)", "三十岁整 (Tepat 30 tahun)"),
                    correctAnswerIndex = 1,
                    explanation = "Teks menyatakan: '妈妈想了想，说：“我觉得你四十岁左右”'."
                ),
                StoryQuestion(
                    id = "q_agegs_2",
                    questionText = "服务员阿姨公布的真实实际年龄是多少？ (Berapakah usia asli sesungguhnya dari bibi pelayan toko tersebut?)",
                    options = listOf("45岁 (45 tahun)", "50岁 (50 tahun)", "58岁 (58 tahun)", "38岁 (38 tahun)"),
                    correctAnswerIndex = 1,
                    explanation = "Bibi pelayan toko berujar: '不对，我今年五十岁了' (Salah, tahun ini saya sudah 50 tahun)."
                ),
                StoryQuestion(
                    id = "q_agegs_3",
                    questionText = "在公布年龄后，大家接着热烈探讨了哪个富有中国传统文化色彩的话题？ (Setelah mengetahui usia, topik budaya tradisional apa yang lanjut mereka bahas dengan hangat?)",
                    options = listOf("退休养老金 (Uang pensiun)", "中国生肖属相与出生年份 (Zodiak shio hewan Tionghoa dan tahun kelahiran)", "房产税率 (Pajak properti)", "天气预报 (Prakiraan cuaca)"),
                    correctAnswerIndex = 1,
                    explanation = "Teks mencatat: '然后，他们又聊起了属相，哪年出生的问题也变得有趣起来'."
                )
            )
        )
    )
}
