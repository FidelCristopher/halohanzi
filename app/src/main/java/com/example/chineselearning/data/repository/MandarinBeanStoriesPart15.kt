package com.example.chineselearning.data.repository

import com.example.chineselearning.R
import com.example.chineselearning.data.model.Sentence
import com.example.chineselearning.data.model.Story
import com.example.chineselearning.data.model.StoryQuestion
import com.example.chineselearning.data.model.WordToken

val mandarinBeanStoriesPart15: List<Story> by lazy {
    listOf(
        // Cerita Mandarin Bean 164 (HSK 2): Boss (Bos Toko Burung Beo)
        Story(
            id = "story_boss",
            titleHanzi = "老板",
            titlePinyin = "Lǎobǎn",
            titleTranslation = "Boss (Bos Toko Burung Beo)",
            level = "HSK 2",
            category = "Humor & Peliharaan",
            description = "Kisah lucu seorang bos toko hewan yang merasa pintar mengajari burung beo berbicara, namun justru berbalik diskakmat oleh sang burung beo.",
            coverEmoji = "🦜",
            coverImageRes = R.drawable.cover_story_boss,
            estimatedReadMinutes = 2,
            sentences = listOf(
                Sentence(
                    id = "s_boss_1",
                    hanzi = "有一个人去商店买鹦鹉。",
                    pinyin = "yǒu yī gè rén qù shāng diàn mǎi yīng wǔ",
                    translation = "Ada seorang pembeli yang pergi ke toko hewan untuk membeli burung beo peliharaan.",
                    tokens = listOf(
                        WordToken("有", "yǒu", "to have; there is", "Kosakata HSK 2: 有 (yǒu)"),
                        WordToken("一", "yī", "one / single / a (article)", "Kosakata HSK 2: 一 (yī)"),
                        WordToken("个", "gè", "classifier for people or objects in general", "Kosakata HSK 2: 个 (gè)"),
                        WordToken("人", "rén", "person; people", "Kosakata HSK 2: 人 (rén)"),
                        WordToken("去", "qù", "to go, to go to", "Kosakata HSK 2: 去 (qù)"),
                        WordToken("商店", "shāng diàn", "store; shop", "Kosakata HSK 2: 商店 (shāng diàn)"),
                        WordToken("买", "mǎi", "to buy / to purchase", "Kosakata HSK 2: 买 (mǎi)"),
                        WordToken("鹦鹉", "yīng wǔ", "parrot", "Kosakata HSK 2: 鹦鹉 (yīng wǔ)")
                    )
                ),
                Sentence(
                    id = "s_boss_2",
                    hanzi = "商店有三只鹦鹉。",
                    pinyin = "shāng diàn yǒu sān zhī yīng wǔ",
                    translation = "Di toko hewan tersebut sedang dipajang tiga ekor burung beo yang menarik perhatian.",
                    tokens = listOf(
                        WordToken("商店", "shāng diàn", "store; shop", "Kosakata HSK 2: 商店 (shāng diàn)"),
                        WordToken("有", "yǒu", "to have; there is", "Kosakata HSK 2: 有 (yǒu)"),
                        WordToken("三", "sān", "three / 3", "Kosakata HSK 2: 三 (sān)"),
                        WordToken("只", "zhī", "classifier for birds and certain animals, one of a pair, some utensils, vessels etc", "Kosakata HSK 2: 只 (zhī)"),
                        WordToken("鹦鹉", "yīng wǔ", "parrot", "Kosakata HSK 2: 鹦鹉 (yīng wǔ)")
                    )
                ),
                Sentence(
                    id = "s_boss_3",
                    hanzi = "第一只卖300块，第二只卖500块，第三只卖800块。",
                    pinyin = "dì yī zhī mài kuài dì èr zhī mài kuài dì sān zhī mài kuài",
                    translation = "Burung beo pertama dijual seharga 300 yuan, yang kedua 500 yuan, dan yang ketiga paling mahal seharga 800 yuan.",
                    tokens = listOf(
                        WordToken("第", "dì", "(prefix indicating ordinal number)", "Kosakata HSK 2: 第 (dì)"),
                        WordToken("一", "yī", "one / single / a (article)", "Kosakata HSK 2: 一 (yī)"),
                        WordToken("只", "zhī", "classifier for birds and certain animals, one of a pair, some utensils, vessels etc", "Kosakata HSK 2: 只 (zhī)"),
                        WordToken("卖", "mài", "to sell", "Kosakata HSK 2: 卖 (mài)"),
                        WordToken("块", "kuài", "classifier for pieces of cloth, cake, soap etc / (coll.) classifier for money and currency units", "Kosakata HSK 2: 块 (kuài)"),
                        WordToken("第", "dì", "(prefix indicating ordinal number)", "Kosakata HSK 2: 第 (dì)"),
                        WordToken("二", "èr", "two / 2", "Kosakata HSK 2: 二 (èr)"),
                        WordToken("只", "zhī", "classifier for birds and certain animals, one of a pair, some utensils, vessels etc", "Kosakata HSK 2: 只 (zhī)"),
                        WordToken("卖", "mài", "to sell", "Kosakata HSK 2: 卖 (mài)"),
                        WordToken("块", "kuài", "classifier for pieces of cloth, cake, soap etc / (coll.) classifier for money and currency units", "Kosakata HSK 2: 块 (kuài)"),
                        WordToken("第", "dì", "(prefix indicating ordinal number)", "Kosakata HSK 2: 第 (dì)"),
                        WordToken("三", "sān", "three / 3", "Kosakata HSK 2: 三 (sān)"),
                        WordToken("只", "zhī", "classifier for birds and certain animals, one of a pair, some utensils, vessels etc", "Kosakata HSK 2: 只 (zhī)"),
                        WordToken("卖", "mài", "to sell", "Kosakata HSK 2: 卖 (mài)"),
                        WordToken("块", "kuài", "classifier for pieces of cloth, cake, soap etc / (coll.) classifier for money and currency units", "Kosakata HSK 2: 块 (kuài)")
                    )
                ),
                Sentence(
                    id = "s_boss_4",
                    hanzi = "这个人觉得有点儿贵。",
                    pinyin = "zhè gè rén jué de yǒu diǎn r guì",
                    translation = "Pembeli tersebut merasa harga burung-burung beo itu agak terlalu mahal.",
                    tokens = listOf(
                        WordToken("这", "zhè", "this; these", "Kosakata HSK 2: 这 (zhè)"),
                        WordToken("个", "gè", "classifier for people or objects in general", "Kosakata HSK 2: 个 (gè)"),
                        WordToken("人", "rén", "person; people", "Kosakata HSK 2: 人 (rén)"),
                        WordToken("觉得", "jué de", "to think that ...; to feel that ...", "Kosakata HSK 2: 觉得 (jué de)"),
                        WordToken("有点儿", "yǒu diǎn r", "slightly / a little / somewhat", "Kosakata HSK 2: 有点儿 (yǒu diǎn r)"),
                        WordToken("贵", "guì", "expensive", "Kosakata HSK 2: 贵 (guì)")
                    )
                ),
                Sentence(
                    id = "s_boss_5",
                    hanzi = "服务员说因为第一只会说很多话！",
                    pinyin = "fú wù yuán shuō yīn wèi dì yī zhī huì shuō hěn duō huà",
                    translation = "Pelayan toko menerangkan: “Harga yang pertama 300 yuan karena ia sangat pandai berbicara banyak kalimat!”",
                    tokens = listOf(
                        WordToken("服务员", "fú wù yuán", "waiter / waitress / attendant / customer service personnel", "Kosakata HSK 2: 服务员 (fú wù yuán)"),
                        WordToken("说", "shuō", "to speak; to talk; to say", "Kosakata HSK 2: 说 (shuō)"),
                        WordToken("因为", "yīn wèi", "because; owing to; on account of", "Kosakata HSK 2: 因为 (yīn wèi)"),
                        WordToken("第", "dì", "(prefix indicating ordinal number)", "Kosakata HSK 2: 第 (dì)"),
                        WordToken("一", "yī", "one / single / a (article)", "Kosakata HSK 2: 一 (yī)"),
                        WordToken("只", "zhī", "classifier for birds and certain animals, one of a pair, some utensils, vessels etc", "Kosakata HSK 2: 只 (zhī)"),
                        WordToken("会", "huì", "can; to have the skill; to know how to", "Kosakata HSK 2: 会 (huì)"),
                        WordToken("说", "shuō", "to speak; to talk; to say", "Kosakata HSK 2: 说 (shuō)"),
                        WordToken("很多", "hěn duō", "many; a lot of", "Kosakata HSK 2: 很多 (hěn duō)"),
                        WordToken("话", "huà", "spoken words / speech / talk / words / conversation / what sb said", "Kosakata HSK 2: 话 (huà)")
                    )
                ),
                Sentence(
                    id = "s_boss_6",
                    hanzi = "第二只会说话，还会跳舞！",
                    pinyin = "dì èr zhī huì shuō huà hái huì tiào wǔ",
                    translation = "“Burung beo kedua 500 yuan karena ia bukan hanya pintar bicara, melainkan juga mahir menari lincah!”",
                    tokens = listOf(
                        WordToken("第", "dì", "(prefix indicating ordinal number)", "Kosakata HSK 2: 第 (dì)"),
                        WordToken("二", "èr", "two / 2", "Kosakata HSK 2: 二 (èr)"),
                        WordToken("只", "zhī", "classifier for birds and certain animals, one of a pair, some utensils, vessels etc", "Kosakata HSK 2: 只 (zhī)"),
                        WordToken("会", "huì", "can; to have the skill; to know how to", "Kosakata HSK 2: 会 (huì)"),
                        WordToken("说话", "shuō huà", "to speak / to say / to talk / to gossip / to tell stories", "Kosakata HSK 2: 说话 (shuō huà)"),
                        WordToken("还", "hái", "still, still in progress, yet", "Kosakata HSK 2: 还 (hái)"),
                        WordToken("会", "huì", "can; to have the skill; to know how to", "Kosakata HSK 2: 会 (huì)"),
                        WordToken("跳舞", "tiào wǔ", "to dance", "Kosakata HSK 2: 跳舞 (tiào wǔ)")
                    )
                ),
                Sentence(
                    id = "s_boss_7",
                    hanzi = "这个人问第三只呢？",
                    pinyin = "zhè gè rén wèn dì sān zhī ne",
                    translation = "Pembeli itu penasaran dan bertanya: “Lalu bagaimana dengan burung beo ketiga yang paling mahal ini?”",
                    tokens = listOf(
                        WordToken("这", "zhè", "this; these", "Kosakata HSK 2: 这 (zhè)"),
                        WordToken("个", "gè", "classifier for people or objects in general", "Kosakata HSK 2: 个 (gè)"),
                        WordToken("人", "rén", "person; people", "Kosakata HSK 2: 人 (rén)"),
                        WordToken("问", "wèn", "to ask; to inquire", "Kosakata HSK 2: 问 (wèn)"),
                        WordToken("第", "dì", "(prefix indicating ordinal number)", "Kosakata HSK 2: 第 (dì)"),
                        WordToken("三", "sān", "three / 3", "Kosakata HSK 2: 三 (sān)"),
                        WordToken("只", "zhī", "classifier for birds and certain animals, one of a pair, some utensils, vessels etc", "Kosakata HSK 2: 只 (zhī)"),
                        WordToken("呢", "ne", "(sentence-final particle) used in questions to link back to prior discourse or context (\"what about...?\", \"and...?\")", "Kosakata HSK 2: 呢 (ne)")
                    )
                ),
                Sentence(
                    id = "s_boss_8",
                    hanzi = "服务员说不知道它会做什么，但是第一只和第二只都叫它：老板！",
                    pinyin = "fú wù yuán shuō bù zhī dào tā huì zuò shén me dàn shì dì yī zhī hé dì èr zhī dōu jiào tā lǎo bǎn",
                    translation = "Pelayan toko tersenyum kecut lalu berbisik: “Jujur saya sendiri tidak tahu apa keahliannya, tetapi burung beo pertama dan kedua selalu memanggilnya: ‘Bos’!”",
                    tokens = listOf(
                        WordToken("服务员", "fú wù yuán", "waiter / waitress / attendant / customer service personnel", "Kosakata HSK 2: 服务员 (fú wù yuán)"),
                        WordToken("说", "shuō", "to speak; to talk; to say", "Kosakata HSK 2: 说 (shuō)"),
                        WordToken("不", "bù", "no; not so", "Kosakata HSK 2: 不 (bù)"),
                        WordToken("知道", "zhī dào", "to know; to become aware of", "Kosakata HSK 2: 知道 (zhī dào)"),
                        WordToken("它", "tā", "it", "Kosakata HSK 2: 它 (tā)"),
                        WordToken("会", "huì", "can; to have the skill; to know how to", "Kosakata HSK 2: 会 (huì)"),
                        WordToken("做", "zuò", "to do; to engage in; to hold (a party etc)", "Kosakata HSK 2: 做 (zuò)"),
                        WordToken("什么", "shén me", "what?", "Kosakata HSK 2: 什么 (shén me)"),
                        WordToken("但是", "dàn shì", "but; however", "Kosakata HSK 2: 但是 (dàn shì)"),
                        WordToken("第", "dì", "(prefix indicating ordinal number)", "Kosakata HSK 2: 第 (dì)"),
                        WordToken("一", "yī", "one / single / a (article)", "Kosakata HSK 2: 一 (yī)"),
                        WordToken("只", "zhī", "classifier for birds and certain animals, one of a pair, some utensils, vessels etc", "Kosakata HSK 2: 只 (zhī)"),
                        WordToken("和", "hé", "and; together with", "Kosakata HSK 2: 和 (hé)"),
                        WordToken("第", "dì", "(prefix indicating ordinal number)", "Kosakata HSK 2: 第 (dì)"),
                        WordToken("二", "èr", "two / 2", "Kosakata HSK 2: 二 (èr)"),
                        WordToken("只", "zhī", "classifier for birds and certain animals, one of a pair, some utensils, vessels etc", "Kosakata HSK 2: 只 (zhī)"),
                        WordToken("都", "dōu", "all; both; entirely", "Kosakata HSK 2: 都 (dōu)"),
                        WordToken("叫", "jiào", "to call", "Kosakata HSK 2: 叫 (jiào)"),
                        WordToken("它", "tā", "it", "Kosakata HSK 2: 它 (tā)"),
                        WordToken("老板", "lǎo bǎn", "boss / business proprietor", "Kosakata HSK 2: 老板 (lǎo bǎn)")
                    )
                )
            ),
            questions = listOf(
                StoryQuestion(
                    id = "q_boss_1",
                    questionText = "顾客在宠物店看到的这三只鹦鹉，售价分别是多少？ (Berapa harga jual masing-masing dari ketiga burung beo di toko hewan tersebut?)",
                    options = listOf("第一只100块，第二只200块，第三只300块 (Burung ke-1 100 yuan, ke-2 200 yuan, ke-3 300 yuan)", "第一只300块，第二只500块，第三只800块 (Burung ke-1 300 yuan, ke-2 500 yuan, ke-3 800 yuan)", "三只统一售价都是500块 (Semua burung dibanderol seragam 500 yuan)", "按斤称重论价 (Dijual berdasarkan timbangan berat badan)"),
                    correctAnswerIndex = 1,
                    explanation = "Burung beo pertama dibanderol 300 yuan, kedua 500 yuan, dan yang ketiga paling mahal yaitu 800 yuan."
                ),
                StoryQuestion(
                    id = "q_boss_2",
                    questionText = "店员解释第二只鹦鹉之所以比第一只贵200块，是因为它拥有什么技能？ (Mengapa burung beo kedua lebih mahal 200 yuan dibanding yang pertama?)",
                    options = listOf("它的羽毛全都是纯金色的 (Bulu-bulunya berwarna emas murni)", "它不仅会模仿说话，还会跳欢快的舞蹈！ (Ia bukan hanya bisa berbicara, tetapi juga mahir menari!)", "它会帮主人算账看门 (Bisa membantu majikan berhitung dan jaga toko)", "它的寿命比第一只长一百年 (Umurnya seratus tahun lebih panjang)"),
                    correctAnswerIndex = 1,
                    explanation = "Burung beo kedua memiliki keahlian ganda yaitu bisa berbicara sekaligus menari lincah."
                ),
                StoryQuestion(
                    id = "q_boss_3",
                    questionText = "当顾客好奇询问售价最昂贵的第三只鹦鹉有什么绝技时，店员如何坦白回答？ (Apa jawaban pelayan toko saat ditanya keahlian burung beo ketiga yang termahal?)",
                    options = listOf("它会说八国不同语言 (Bisa berbicara delapan bahasa asing)", "自己也不知道它究竟会干什么，但前两只鹦鹉都恭敬地喊它“老板”！ (Tidak tahu apa keahliannya, tapi dua burung beo lainnya selalu memanggilnya 'Bos'!)", "它每天会自己下金蛋 (Setiap hari bertelur emas)", "它曾经是动物园的明星 (Pernah menjadi artis kebun binatang)"),
                    correctAnswerIndex = 1,
                    explanation = "Puncak humor: burung termahal tidak punya keahlian fisik apa pun, tetapi dihormati sebagai 'Bos' oleh rekan-rekannya!"
                ),
                StoryQuestion(
                    id = "q_boss_4",
                    questionText = "这则职场动物寓言幽默地讽刺了人类社会管理层中的什么常见现象？ (Sindiran sosial apa mengenai dunia manajemen yang tersirat dari kelakar burung beo ini?)",
                    options = listOf("长得胖的人才能当店员 (Hanya orang bertubuh gemuk yang bisa jadi pelayan)", "职场中真正身居高位拿最高薪酬的“领导/老板”，往往不需要亲力亲为做具体技能工作 (Di dunia kerja, figur pemimpin/bos bergaji tertinggi kerap tidak perlu memiliki keterampilan teknis, melainkan memiliki otoritas kepemimpinan)", "养宠物必须挑选最便宜的买 (Memelihara hewan harus selalu memilih yang paling murah)", "会跳舞的人工资最高 (Orang yang bisa menari gajinya paling besar)"),
                    correctAnswerIndex = 1,
                    explanation = "Satir dunia korporat: staf teknis bekerja keras dengan aneka keterampilan, sementara 'bos' dibayar termahal cukup dengan memimpin."
                )
            )
        ),
        // Cerita Mandarin Bean 165 (HSK 2): What to Do on Weekend (Apa Kegiatan di Akhir Pekan)
        Story(
            id = "story_what_to_do_on_weekend",
            titleHanzi = "周末做什么",
            titlePinyin = "Zhōumò Zuò Shénme",
            titleTranslation = "What to Do on Weekend (Apa Kegiatan di Akhir Pekan)",
            level = "HSK 2",
            category = "Gaya Hidup & Teman",
            description = "Rencana santai dua sahabat menghabiskan akhir pekan di musim panas dengan berenang, menonton bioskop, dan makan masakan lezat.",
            coverEmoji = "🏖️",
            coverImageRes = R.drawable.cover_story_what_to_do_on_weekend,
            estimatedReadMinutes = 2,
            sentences = listOf(
                Sentence(
                    id = "s_wkend_1",
                    hanzi = "周末又到了，朋友问我要做什么，我说不知道。",
                    pinyin = "zhōu mò yòu dào le péng you wèn wǒ yào zuò shén me wǒ shuō bù zhī dào",
                    translation = "Akhir pekan telah tiba kembali, temanku bertanya apa rencana kegiatanku, namun aku menjawab bingung tidak tahu.",
                    tokens = listOf(
                        WordToken("周末", "zhōu mò", "weekend", "Kosakata HSK 2: 周末 (zhōu mò)"),
                        WordToken("又", "yòu", "(once) again", "Kosakata HSK 2: 又 (yòu)"),
                        WordToken("到", "dào", "to reach; to arrive / to (a place); until (a time); up to (a point) / (verb complement indicating arriving at a place or reaching a point)", "Kosakata HSK 2: 到 (dào)"),
                        WordToken("了", "le", "(completed action marker) / (modal particle indicating change of state, situation now)", "Kosakata HSK 2: 了 (le)"),
                        WordToken("朋友", "péng you", "friend", "Kosakata HSK 2: 朋友 (péng you)"),
                        WordToken("问", "wèn", "to ask; to inquire", "Kosakata HSK 2: 问 (wèn)"),
                        WordToken("我", "wǒ", "I; me; my", "Kosakata HSK 2: 我 (wǒ)"),
                        WordToken("要", "yào", "to want; to need; to ask for", "Kosakata HSK 2: 要 (yào)"),
                        WordToken("做", "zuò", "to do; to engage in; to hold (a party etc)", "Kosakata HSK 2: 做 (zuò)"),
                        WordToken("什么", "shén me", "what?", "Kosakata HSK 2: 什么 (shén me)"),
                        WordToken("我", "wǒ", "I; me; my", "Kosakata HSK 2: 我 (wǒ)"),
                        WordToken("说", "shuō", "to speak; to talk; to say", "Kosakata HSK 2: 说 (shuō)"),
                        WordToken("不", "bù", "no; not so", "Kosakata HSK 2: 不 (bù)"),
                        WordToken("知道", "zhī dào", "to know; to become aware of", "Kosakata HSK 2: 知道 (zhī dào)")
                    )
                ),
                Sentence(
                    id = "s_wkend_2",
                    hanzi = "旅游不行，只有两天，时间太短。",
                    pinyin = "lǚ yóu bù xíng zhǐ yǒu liǎng tiān shí jiān tài duǎn",
                    translation = "Pergi liburan ke luar kota jelas tidak mungkin, karena libur cuma dua hari dan waktunya terlalu singkat.",
                    tokens = listOf(
                        WordToken("旅游", "lǚ yóu", "trip / journey / tourism / travel / tour", "Kosakata HSK 2: 旅游 (lǚ yóu)"),
                        WordToken("不行", "bù xíng", "won't do / be out of the question / be no good / not work / not be capable", "Kosakata HSK 2: 不行 (bù xíng)"),
                        WordToken("只", "zhǐ", "only; merely; just", "Kosakata HSK 2: 只 (zhǐ)"),
                        WordToken("有", "yǒu", "to have; there is", "Kosakata HSK 2: 有 (yǒu)"),
                        WordToken("两", "liǎng", "two / both / some / a few", "Kosakata HSK 2: 两 (liǎng)"),
                        WordToken("天", "tiān", "day", "Kosakata HSK 2: 天 (tiān)"),
                        WordToken("时间", "shí jiān", "time", "Kosakata HSK 2: 时间 (shí jiān)"),
                        WordToken("太", "tài", "too (much) / very / extremely", "Kosakata HSK 2: 太 (tài)"),
                        WordToken("短", "duǎn", "short / brief", "Kosakata HSK 2: 短 (duǎn)")
                    )
                ),
                Sentence(
                    id = "s_wkend_3",
                    hanzi = "打球和跑步不行，天气太热。",
                    pinyin = "dǎ qiú hé pǎo bù bù xíng tiān qì tài rè",
                    translation = "Bermain basket atau lari pagi juga tidak bisa, karena cuaca di luar terik dan sangat panas.",
                    tokens = listOf(
                        WordToken("打", "dǎ", "a semantically light, transitive verb that is combined with various grammatical objects to form compound verbs and verb-object phrases with a diverse range of meanings", "Kosakata HSK 2: 打 (dǎ)"),
                        WordToken("球", "qiú", "ball / sphere / globe / ball game / match", "Kosakata HSK 2: 球 (qiú)"),
                        WordToken("和", "hé", "and; together with", "Kosakata HSK 2: 和 (hé)"),
                        WordToken("跑步", "pǎo bù", "to run / to jog / (military) to march at the double", "Kosakata HSK 2: 跑步 (pǎo bù)"),
                        WordToken("不行", "bù xíng", "won't do / be out of the question / be no good / not work / not be capable", "Kosakata HSK 2: 不行 (bù xíng)"),
                        WordToken("天气", "tiān qì", "weather", "Kosakata HSK 2: 天气 (tiān qì)"),
                        WordToken("太", "tài", "too (much) / very / extremely", "Kosakata HSK 2: 太 (tài)"),
                        WordToken("热", "rè", "hot (of weather)", "Kosakata HSK 2: 热 (rè)")
                    )
                ),
                Sentence(
                    id = "s_wkend_4",
                    hanzi = "学习语言，但是每个星期学5天汉语，周末我不想学了。",
                    pinyin = "xué xí yǔ yán dàn shì měi gè xīng qī xué tiān Hàn yǔ zhōu mò wǒ bù xiǎng xué le",
                    translation = "Belajar bahasa pun enggan, sebab setiap minggu aku sudah 5 hari penuh belajar bahasa Mandarin, jadi di akhir pekan aku ingin mengistirahatkan otak.",
                    tokens = listOf(
                        WordToken("学习", "xué xí", "to learn / to study", "Kosakata HSK 2: 学习 (xué xí)"),
                        WordToken("语言", "yǔ yán", "language", "Kosakata HSK 2: 语言 (yǔ yán)"),
                        WordToken("但是", "dàn shì", "but; however", "Kosakata HSK 2: 但是 (dàn shì)"),
                        WordToken("每", "měi", "each / every", "Kosakata HSK 2: 每 (měi)"),
                        WordToken("个", "gè", "classifier for people or objects in general", "Kosakata HSK 2: 个 (gè)"),
                        WordToken("星期", "xīng qī", "week", "Kosakata HSK 2: 星期 (xīng qī)"),
                        WordToken("学", "xué", "to learn / to study / to imitate", "Kosakata HSK 2: 学 (xué)"),
                        WordToken("天", "tiān", "day", "Kosakata HSK 2: 天 (tiān)"),
                        WordToken("汉语", "Hàn yǔ", "Chinese language", "Kosakata HSK 2: 汉语 (Hàn yǔ)"),
                        WordToken("周末", "zhōu mò", "weekend", "Kosakata HSK 2: 周末 (zhōu mò)"),
                        WordToken("我", "wǒ", "I; me; my", "Kosakata HSK 2: 我 (wǒ)"),
                        WordToken("不", "bù", "no; not so", "Kosakata HSK 2: 不 (bù)"),
                        WordToken("想", "xiǎng", "to desire; to want (to)", "Kosakata HSK 2: 想 (xiǎng)"),
                        WordToken("学", "xué", "to learn / to study / to imitate", "Kosakata HSK 2: 学 (xué)"),
                        WordToken("了", "le", "(completed action marker) / (modal particle indicating change of state, situation now)", "Kosakata HSK 2: 了 (le)")
                    )
                ),
                Sentence(
                    id = "s_wkend_5",
                    hanzi = "妈妈想去商店买东西，但是我不想买东西，也不喜欢去商店。",
                    pinyin = "mā ma xiǎng qù shāng diàn mǎi dōng xi dàn shì wǒ bù xiǎng mǎi dōng xi yě bù xǐ huan qù shāng diàn",
                    translation = "Ibu mengajak pergi belanja ke pasar swalayan, tetapi aku sedang tidak ingin membeli apa-apa dan malas berdesakan di toko.",
                    tokens = listOf(
                        WordToken("妈妈", "mā ma", "mama / mommy / mother", "Kosakata HSK 2: 妈妈 (mā ma)"),
                        WordToken("想", "xiǎng", "to desire; to want (to)", "Kosakata HSK 2: 想 (xiǎng)"),
                        WordToken("去", "qù", "to go, to go to", "Kosakata HSK 2: 去 (qù)"),
                        WordToken("商店", "shāng diàn", "store; shop", "Kosakata HSK 2: 商店 (shāng diàn)"),
                        WordToken("买", "mǎi", "to buy / to purchase", "Kosakata HSK 2: 买 (mǎi)"),
                        WordToken("东西", "dōng xi", "thing / stuff / person", "Kosakata HSK 2: 东西 (dōng xi)"),
                        WordToken("但是", "dàn shì", "but; however", "Kosakata HSK 2: 但是 (dàn shì)"),
                        WordToken("我", "wǒ", "I; me; my", "Kosakata HSK 2: 我 (wǒ)"),
                        WordToken("不", "bù", "no; not so", "Kosakata HSK 2: 不 (bù)"),
                        WordToken("想", "xiǎng", "to desire; to want (to)", "Kosakata HSK 2: 想 (xiǎng)"),
                        WordToken("买", "mǎi", "to buy / to purchase", "Kosakata HSK 2: 买 (mǎi)"),
                        WordToken("东西", "dōng xi", "thing / stuff / person", "Kosakata HSK 2: 东西 (dōng xi)"),
                        WordToken("也", "yě", "also; too; as well; (not ...) either", "Kosakata HSK 2: 也 (yě)"),
                        WordToken("不", "bù", "no; not so", "Kosakata HSK 2: 不 (bù)"),
                        WordToken("喜欢", "xǐ huan", "to like; to be fond of", "Kosakata HSK 2: 喜欢 (xǐ huan)"),
                        WordToken("去", "qù", "to go, to go to", "Kosakata HSK 2: 去 (qù)"),
                        WordToken("商店", "shāng diàn", "store; shop", "Kosakata HSK 2: 商店 (shāng diàn)")
                    )
                ),
                Sentence(
                    id = "s_wkend_6",
                    hanzi = "做什么呢？",
                    pinyin = "zuò shén me ne",
                    translation = "Lalu sebaiknya apa yang harus kulakukan?",
                    tokens = listOf(
                        WordToken("做", "zuò", "to do; to engage in; to hold (a party etc)", "Kosakata HSK 2: 做 (zuò)"),
                        WordToken("什么", "shén me", "what?", "Kosakata HSK 2: 什么 (shén me)"),
                        WordToken("呢", "ne", "(sentence-final particle) used in questions to link back to prior discourse or context (\"what about...?\", \"and...?\")", "Kosakata HSK 2: 呢 (ne)")
                    )
                ),
                Sentence(
                    id = "s_wkend_7",
                    hanzi = "还是在家睡觉吧！",
                    pinyin = "hái shi zài jiā shuì jiào ba",
                    translation = "Lebih baik aku rebahan dan tidur pulas saja di rumah!",
                    tokens = listOf(
                        WordToken("还是", "hái shi", "had better", "Kosakata HSK 2: 还是 (hái shi)"),
                        WordToken("在", "zài", "(of sb or sth) to be (located) at", "Kosakata HSK 2: 在 (zài)"),
                        WordToken("家", "jiā", "home / family / (polite) my (sister, uncle etc)", "Kosakata HSK 2: 家 (jiā)"),
                        WordToken("睡觉", "shuì jiào", "to go to bed / to sleep", "Kosakata HSK 2: 睡觉 (shuì jiào)"),
                        WordToken("吧", "ba", "(modal particle indicating suggestion or surmise) / ...right? / ...OK? / ...I presume.", "Kosakata HSK 2: 吧 (ba)")
                    )
                )
            ),
            questions = listOf(
                StoryQuestion(
                    id = "q_wkend_1",
                    questionText = "周末到来时，当朋友问起活动计划，主人公起初的态度是怎样的？ (Bagaimana respons awal tokoh utama saat ditanya rencana kegiatannya di akhir pekan?)",
                    options = listOf("早已制订了完美的旅行攻略 (Sudah menyusun rencana liburan yang sempurna)", "感到十分纠结和茫然，回答说不知道做什么 (Merasa bingung dan gamang, menjawab bahwa ia tidak tahu harus berbuat apa)", "迫不及待地要去公司加班 (Tak sabar ingin segera lembur ke kantor)", "打算通宵达旦地玩电子游戏 (Berencana main game online semalam suntuk)"),
                    correctAnswerIndex = 1,
                    explanation = "Banyaknya pertimbangan membuat narator bingung dan belum memiliki rencana pasti untuk akhir pekannya."
                ),
                StoryQuestion(
                    id = "q_wkend_2",
                    questionText = "主人公为什么果断排除了“外出旅游”和“户外运动”这两项周末选项？ (Mengapa opsi liburan ke luar kota dan olahraga luar ruangan langsung dikesampingkan?)",
                    options = listOf("因为身上没有任何零花钱 (Karena tidak punya uang saku)", "旅游时间仅两天太短仓促，而户外天气又过于炎热难耐 (Waktu libur cuma 2 hari terlalu sempit, dan cuaca di luar sangat terik panas)", "因为所有景区都因雨停业了 (Semua tempat wisata tutup karena hujan)", "因为他的运动鞋坏了 (Sepatu olahraganya rusak)"),
                    correctAnswerIndex = 1,
                    explanation = "Dua hari terlalu singkat untuk bepergian jauh, sementara terik matahari musim panas membuat olahraga melelahkan."
                ),
                StoryQuestion(
                    id = "q_wkend_3",
                    questionText = "主人公为什么也不愿意在周末继续学习外语或陪妈妈逛街购物？ (Mengapa narator enggan belajar bahasa Mandarin atau menemani ibunya berbelanja di akhir pekan?)",
                    options = listOf("因为平时周一到周五已连续学了5天汉语想休息，且自己讨厌人多拥挤的商场 (Hari kerja sudah 5 hari penuh belajar Mandarin sehingga butuh rehat, serta malas ke toko ramai)", "因为汉语老师生病住院了 (Guru bahasa Mandarinnya sakit)", "妈妈严禁他周末进书房 (Ibu melarangnya masuk ruang baca)", "商场距离家里太遥远 (Pusat perbelanjaan terlalu jauh dari rumah)"),
                    correctAnswerIndex = 0,
                    explanation = "Beban belajar hari kerja yang padat membuatnya jenuh belajar, dan ia pun tidak menyukai keramaian toko."
                ),
                StoryQuestion(
                    id = "q_wkend_4",
                    questionText = "经过一番瞻前顾后的纠结之后，主人公做出的最惬意、最真实的周末终极决定是什么？ (Keputusan akhir apa yang paling melegakan yang akhirnya dipilih narator untuk akhir pekannya?)",
                    options = listOf("去朋友家举办通宵派对 (Pergi ke rumah teman mengadakan pesta)", "索性安心留在家里蒙头大睡、好好补觉 (Memilih diam santai di rumah dan tidur pulas sepuasnya)", "一个人去图书馆看书 (Pergi sendirian membaca buku di perpustakaan)", "买机票飞往外地 (Membeli tiket pesawat terbang ke luar kota)"),
                    correctAnswerIndex = 1,
                    explanation = "Rebahan dan tidur nyenyak di rumah menjadi pilihan akhir pekan paling realistis dan membahagiakan."
                )
            )
        ),
        // Cerita Mandarin Bean 166 (HSK 2): Pick Up Friend (Menjemput Teman di Bandara)
        Story(
            id = "story_pick_up_friend",
            titleHanzi = "接朋友",
            titlePinyin = "Jiē Péngyou",
            titleTranslation = "Pick Up Friend (Menjemput Teman di Bandara)",
            level = "HSK 2",
            category = "Perjalanan & Persahabatan",
            description = "Kisah penjemputan teman akrab di bandara ibu kota setelah sekian lama tidak berjumpa dan rencana menjelajahi kota bersama.",
            coverEmoji = "✈️",
            coverImageRes = R.drawable.cover_story_pick_up_friend,
            estimatedReadMinutes = 2,
            sentences = listOf(
                Sentence(
                    id = "s_pkfrnd_1",
                    hanzi = "我的好朋友明天在上海有一个工作面试，所以她今天会从北京飞到上海，晚上住在我家。",
                    pinyin = "wǒ de hǎo péng you míng tiān zài Shàng hǎi yǒu yī gè gōng zuò miàn shì suǒ yǐ tā jīn tiān huì cóng Běi jīng fēi dào Shàng hǎi wǎn shang zhù zài wǒ jiā",
                    translation = "Sahabat baikku besok ada jadwal wawancara kerja penting di Shanghai, jadi hari ini ia terbang dari Beijing ke Shanghai dan malam ini akan menginap di rumahku.",
                    tokens = listOf(
                        WordToken("我", "wǒ", "I; me; my", "Kosakata HSK 2: 我 (wǒ)"),
                        WordToken("的", "de", "possessive particle (of; 's) / modifying particle (used after an attribute to modify a noun or to form a nominal expression)", "Kosakata HSK 2: 的 (de)"),
                        WordToken("好", "hǎo", "good / appropriate; proper", "Kosakata HSK 2: 好 (hǎo)"),
                        WordToken("朋友", "péng you", "friend", "Kosakata HSK 2: 朋友 (péng you)"),
                        WordToken("明天", "míng tiān", "tomorrow", "Kosakata HSK 2: 明天 (míng tiān)"),
                        WordToken("在", "zài", "(of sb or sth) to be (located) at", "Kosakata HSK 2: 在 (zài)"),
                        WordToken("上海", "Shàng hǎi", "Shanghai municipality", "Kosakata HSK 2: 上海 (Shàng hǎi)"),
                        WordToken("有", "yǒu", "to have; there is", "Kosakata HSK 2: 有 (yǒu)"),
                        WordToken("一", "yī", "one / single / a (article)", "Kosakata HSK 2: 一 (yī)"),
                        WordToken("个", "gè", "classifier for people or objects in general", "Kosakata HSK 2: 个 (gè)"),
                        WordToken("工作", "gōng zuò", "job / work / task", "Kosakata HSK 2: 工作 (gōng zuò)"),
                        WordToken("面试", "miàn shì", "interview", "Kosakata HSK 2: 面试 (miàn shì)"),
                        WordToken("所以", "suǒ yǐ", "therefore / as a result / so", "Kosakata HSK 2: 所以 (suǒ yǐ)"),
                        WordToken("她", "tā", "she", "Kosakata HSK 2: 她 (tā)"),
                        WordToken("今天", "jīn tiān", "today", "Kosakata HSK 2: 今天 (jīn tiān)"),
                        WordToken("会", "huì", "to be likely to; to be sure to", "Kosakata HSK 2: 会 (huì)"),
                        WordToken("从", "cóng", "from; through; via / (bound form) retainer; attendant / (bound form) assistant; auxiliary; subordinate / (bound form) related by common paternal grandfather or earlier ancestor", "Kosakata HSK 2: 从 (cóng)"),
                        WordToken("北京", "Běi jīng", "Beijing municipality, capital of the People's Republic of China", "Kosakata HSK 2: 北京 (Běi jīng)"),
                        WordToken("飞", "fēi", "to fly", "Kosakata HSK 2: 飞 (fēi)"),
                        WordToken("到", "dào", "to reach; to arrive / to (a place); until (a time); up to (a point) / (verb complement indicating arriving at a place or reaching a point)", "Kosakata HSK 2: 到 (dào)"),
                        WordToken("上海", "Shàng hǎi", "Shanghai municipality", "Kosakata HSK 2: 上海 (Shàng hǎi)"),
                        WordToken("晚上", "wǎn shang", "in the evening", "Kosakata HSK 2: 晚上 (wǎn shang)"),
                        WordToken("住", "zhù", "to live; to reside; to stay", "Kosakata HSK 2: 住 (zhù)"),
                        WordToken("在", "zài", "(of sb or sth) to be (located) at", "Kosakata HSK 2: 在 (zài)"),
                        WordToken("我", "wǒ", "I; me; my", "Kosakata HSK 2: 我 (wǒ)"),
                        WordToken("家", "jiā", "home / family / (polite) my (sister, uncle etc)", "Kosakata HSK 2: 家 (jiā)")
                    )
                ),
                Sentence(
                    id = "s_pkfrnd_2",
                    hanzi = "她的飞机是晚上八点，我到了机场发现飞机会晚两个小时。",
                    pinyin = "tā de fēi jī shì wǎn shang bā diǎn wǒ dào le jī chǎng fā xiàn fēi jī huì wǎn liǎng gè xiǎo shí",
                    translation = "Jadwal pesawatnya seharusnya mendarat jam delapan malam, tetapi setibanya di bandara aku mendapati pesawatnya mengalami keterlambatan (delay) dua jam.",
                    tokens = listOf(
                        WordToken("她", "tā", "she", "Kosakata HSK 2: 她 (tā)"),
                        WordToken("的", "de", "possessive particle (of; 's) / modifying particle (used after an attribute to modify a noun or to form a nominal expression)", "Kosakata HSK 2: 的 (de)"),
                        WordToken("飞机", "fēi jī", "airplane", "Kosakata HSK 2: 飞机 (fēi jī)"),
                        WordToken("是", "shì", "to be (followed by substantives only)", "Kosakata HSK 2: 是 (shì)"),
                        WordToken("晚上", "wǎn shang", "evening / night", "Kosakata HSK 2: 晚上 (wǎn shang)"),
                        WordToken("八", "bā", "eight", "Kosakata HSK 2: 八 (bā)"),
                        WordToken("点", "diǎn", "point; dot; spot; speck / dot stroke in Chinese characters / (math.) decimal point / point in time or space / (after a number) o'clock", "Kosakata HSK 2: 点 (diǎn)"),
                        WordToken("我", "wǒ", "I; me; my", "Kosakata HSK 2: 我 (wǒ)"),
                        WordToken("到", "dào", "to reach; to arrive / to (a place); until (a time); up to (a point) / (verb complement indicating arriving at a place or reaching a point)", "Kosakata HSK 2: 到 (dào)"),
                        WordToken("了", "le", "(completed action marker) / (modal particle indicating change of state, situation now)", "Kosakata HSK 2: 了 (le)"),
                        WordToken("机场", "jī chǎng", "airport; airfield / (slang) service provider for Shadowsocks or similar software for circumventing Internet censorship", "Kosakata HSK 2: 机场 (jī chǎng)"),
                        WordToken("发现", "fā xiàn", "to notice; to become aware of / to discover; to find; to detect", "Kosakata HSK 2: 发现 (fā xiàn)"),
                        WordToken("飞机", "fēi jī", "airplane", "Kosakata HSK 2: 飞机 (fēi jī)"),
                        WordToken("会", "huì", "to be likely to; to be sure to", "Kosakata HSK 2: 会 (huì)"),
                        WordToken("晚", "wǎn", "late", "Kosakata HSK 2: 晚 (wǎn)"),
                        WordToken("两", "liǎng", "two / both / some / a few", "Kosakata HSK 2: 两 (liǎng)"),
                        WordToken("个", "gè", "classifier for people or objects in general", "Kosakata HSK 2: 个 (gè)"),
                        WordToken("小时", "xiǎo shí", "hour", "Kosakata HSK 2: 小时 (xiǎo shí)")
                    )
                ),
                Sentence(
                    id = "s_pkfrnd_3",
                    hanzi = "我有点担心，因为晚上十点半可能就没有地铁了，我们只能坐出租车。",
                    pinyin = "wǒ yǒu diǎn dān xīn yīn wèi wǎn shang shí diǎn bàn kě néng jiù méi yǒu dì tiě le wǒ men zhǐ néng zuò chū zū chē",
                    translation = "Aku merasa agak cemas, karena lewat pukul setengah sebelas malam kereta bawah tanah (subway) kemungkinan sudah berhenti beroperasi, sehingga kami terpaksa naik taksi.",
                    tokens = listOf(
                        WordToken("我", "wǒ", "I; me; my", "Kosakata HSK 2: 我 (wǒ)"),
                        WordToken("有点", "yǒu diǎn", "a little", "Kosakata HSK 2: 有点 (yǒu diǎn)"),
                        WordToken("担心", "dān xīn", "to worry / to be anxious", "Kosakata HSK 2: 担心 (dān xīn)"),
                        WordToken("因为", "yīn wèi", "because; owing to; on account of", "Kosakata HSK 2: 因为 (yīn wèi)"),
                        WordToken("晚上", "wǎn shang", "evening / night", "Kosakata HSK 2: 晚上 (wǎn shang)"),
                        WordToken("十", "shí", "ten / 10", "Kosakata HSK 2: 十 (shí)"),
                        WordToken("点", "diǎn", "point; dot; spot; speck / dot stroke in Chinese characters / (math.) decimal point / point in time or space / (after a number) o'clock", "Kosakata HSK 2: 点 (diǎn)"),
                        WordToken("半", "bàn", "(after a number) and a half", "Kosakata HSK 2: 半 (bàn)"),
                        WordToken("可能", "kě néng", "might (happen) / maybe / perhaps", "Kosakata HSK 2: 可能 (kě néng)"),
                        WordToken("就", "jiù", "in that case; then", "Kosakata HSK 2: 就 (jiù)"),
                        WordToken("没有", "méi yǒu", "doesn't exist / to not be", "Kosakata HSK 2: 没有 (méi yǒu)"),
                        WordToken("地铁", "dì tiě", "underground railway; subway / subway train", "Kosakata HSK 2: 地铁 (dì tiě)"),
                        WordToken("了", "le", "(completed action marker) / (modal particle indicating change of state, situation now)", "Kosakata HSK 2: 了 (le)"),
                        WordToken("我们", "wǒ men", "we; us; ourselves; our", "Kosakata HSK 2: 我们 (wǒ men)"),
                        WordToken("只", "zhǐ", "only; merely; just", "Kosakata HSK 2: 只 (zhǐ)"),
                        WordToken("能", "néng", "can / to be able to / might possibly", "Kosakata HSK 2: 能 (néng)"),
                        WordToken("坐", "zuò", "to sit / to take a seat / to take (a bus, airplane etc) / to bear fruit", "Kosakata HSK 2: 坐 (zuò)"),
                        WordToken("出租车", "chū zū chē", "taxi / rental car", "Kosakata HSK 2: 出租车 (chū zū chē)")
                    )
                ),
                Sentence(
                    id = "s_pkfrnd_4",
                    hanzi = "机场到我家很远，坐车要两个小时呢，可能会很贵，到家也会很晚。",
                    pinyin = "jī chǎng dào wǒ jiā hěn yuǎn zuò chē yào liǎng gè xiǎo shí ne kě néng huì hěn guì dào jiā yě huì hěn wǎn",
                    translation = "Jarak dari bandara ke rumahku sangat jauh, memakan waktu perjalanan dua jam dengan mobil, ongkosnya pasti mahal dan tiba di rumah sudah larut malam.",
                    tokens = listOf(
                        WordToken("机场", "jī chǎng", "airport; airfield / (slang) service provider for Shadowsocks or similar software for circumventing Internet censorship", "Kosakata HSK 2: 机场 (jī chǎng)"),
                        WordToken("到", "dào", "to reach; to arrive / to (a place); until (a time); up to (a point) / (verb complement indicating arriving at a place or reaching a point)", "Kosakata HSK 2: 到 (dào)"),
                        WordToken("我", "wǒ", "I; me; my", "Kosakata HSK 2: 我 (wǒ)"),
                        WordToken("家", "jiā", "home / family / (polite) my (sister, uncle etc)", "Kosakata HSK 2: 家 (jiā)"),
                        WordToken("很", "hěn", "very; quite", "Kosakata HSK 2: 很 (hěn)"),
                        WordToken("远", "yuǎn", "far / distant / remote", "Kosakata HSK 2: 远 (yuǎn)"),
                        WordToken("坐", "zuò", "to sit / to take a seat / to take (a bus, airplane etc) / to bear fruit", "Kosakata HSK 2: 坐 (zuò)"),
                        WordToken("车", "chē", "car / vehicle / machine", "Kosakata HSK 2: 车 (chē)"),
                        WordToken("要", "yào", "will; shall; about to / need to; should / if", "Kosakata HSK 2: 要 (yào)"),
                        WordToken("两", "liǎng", "two / both / some / a few", "Kosakata HSK 2: 两 (liǎng)"),
                        WordToken("个", "gè", "classifier for people or objects in general", "Kosakata HSK 2: 个 (gè)"),
                        WordToken("小时", "xiǎo shí", "hour", "Kosakata HSK 2: 小时 (xiǎo shí)"),
                        WordToken("呢", "ne", "(discourse particle) used to mark a slight pause or emphasis in speech", "Kosakata HSK 2: 呢 (ne)"),
                        WordToken("可能", "kě néng", "might (happen) / maybe / perhaps", "Kosakata HSK 2: 可能 (kě néng)"),
                        WordToken("会", "huì", "to be likely to; to be sure to", "Kosakata HSK 2: 会 (huì)"),
                        WordToken("很", "hěn", "very; quite", "Kosakata HSK 2: 很 (hěn)"),
                        WordToken("贵", "guì", "expensive", "Kosakata HSK 2: 贵 (guì)"),
                        WordToken("到", "dào", "to reach; to arrive / to (a place); until (a time); up to (a point) / (verb complement indicating arriving at a place or reaching a point)", "Kosakata HSK 2: 到 (dào)"),
                        WordToken("家", "jiā", "home / family / (polite) my (sister, uncle etc)", "Kosakata HSK 2: 家 (jiā)"),
                        WordToken("也", "yě", "also; too; as well; (not ...) either", "Kosakata HSK 2: 也 (yě)"),
                        WordToken("会", "huì", "to be likely to; to be sure to", "Kosakata HSK 2: 会 (huì)"),
                        WordToken("很", "hěn", "very; quite", "Kosakata HSK 2: 很 (hěn)"),
                        WordToken("晚", "wǎn", "late", "Kosakata HSK 2: 晚 (wǎn)")
                    )
                ),
                Sentence(
                    id = "s_pkfrnd_5",
                    hanzi = "明她还要早起去公司，祝她好运吧！",
                    pinyin = "míng tā hái yào zǎo qǐ qù gōng sī zhù tā hǎo yùn ba",
                    translation = "Padahal besok pagi-pagi sekali ia sudah harus bangun pergi ke kantor perusahaan, semoga ia beruntung dan sukses!",
                    tokens = listOf(
                        WordToken("明", "míng", "bright / opposite: dark 暗 / (of meaning) clear / next / public or open / wise / generic term for a sacrifice to the gods", "Kosakata HSK 2: 明 (míng)"),
                        WordToken("她", "tā", "she", "Kosakata HSK 2: 她 (tā)"),
                        WordToken("还", "hái", "still, still in progress, yet", "Kosakata HSK 2: 还 (hái)"),
                        WordToken("要", "yào", "will; shall; about to / need to; should / if", "Kosakata HSK 2: 要 (yào)"),
                        WordToken("早", "zǎo", "early", "Kosakata HSK 2: 早 (zǎo)"),
                        WordToken("起", "qǐ", "to rise / to raise / to get up / to set out / to start / to appear / to launch / to initiate (action) / to draft / to establish / to get (from a depot or counter)", "Kosakata HSK 2: 起 (qǐ)"),
                        WordToken("去", "qù", "to go, to go to", "Kosakata HSK 2: 去 (qù)"),
                        WordToken("公司", "gōng sī", "company; firm; corporation", "Kosakata HSK 2: 公司 (gōng sī)"),
                        WordToken("祝", "zhù", "to pray for / to wish", "Kosakata HSK 2: 祝 (zhù)"),
                        WordToken("她", "tā", "she", "Kosakata HSK 2: 她 (tā)"),
                        WordToken("好", "hǎo", "good / appropriate; proper", "Kosakata HSK 2: 好 (hǎo)"),
                        WordToken("运", "yùn", "fortune / luck / fate", "Kosakata HSK 2: 运 (yùn)"),
                        WordToken("吧", "ba", "(modal particle indicating suggestion or surmise) / ...right? / ...OK? / ...I presume.", "Kosakata HSK 2: 吧 (ba)")
                    )
                )
            ),
            questions = listOf(
                StoryQuestion(
                    id = "q_pkfrnd_1",
                    questionText = "主人公的好朋友专程从北京飞到上海，核心的目的是参加什么重要活动？ (Tujuan utama apa yang membuat sang sahabat rela terbang dari Beijing ke Shanghai?)",
                    options = listOf("参加知名歌手的演唱会 (Menghadiri konser penyanyi terkenal)", "明天在上海有一场非常关键的工作面试 (Besok ada jadwal wawancara kerja penting di Shanghai)", "专程送一份紧急文件 (Khusus mengantarkan dokumen darurat)", "去外滩看东方明珠夜景 (Melihat pemandangan malam Menara Oriental Pearl)"),
                    correctAnswerIndex = 1,
                    explanation = "Sahabatnya datang ke Shanghai untuk menghadiri wawancara kerja penting keesokan harinya."
                ),
                StoryQuestion(
                    id = "q_pkfrnd_2",
                    questionText = "当主人公提前赶到机场接机大厅时，机场航班信息大屏幕显示了什么突发情况？ (Kabar apa yang tertera di layar informasi kedatangan bandara saat narator tiba di sana?)",
                    options = listOf("航班已经提前半小时降落 (Penerbangan mendarat lebih awal 30 menit)", "好朋友搭乘的飞机将延误晚点两个小时 (Penerbangan yang dinaiki temannya mengalami delay selama dua jam)", "该趟航班不幸被彻底取消了 (Penerbangan tersebut dibatalkan total)", "飞机降落到了另一个备降机场 (Pesawat mendarat darurat di kota lain)"),
                    correctAnswerIndex = 1,
                    explanation = "Jadwal pendaratan pukul 20.00 malam terpaksa mundur 2 jam hingga pukul 22.00 malam."
                ),
                StoryQuestion(
                    id = "q_pkfrnd_3",
                    questionText = "航班严重晚点让主人公产生了什么现实的交通与经济担忧？ (Kekhawatiran praktis apa yang dicemaskan narator akibat keterlambatan pesawat tersebut?)",
                    options = listOf("担心机场餐厅饭菜卖完了 (Khawatir makanan di restoran bandara habis)", "十点半后地铁停运只能打车，且机场到家车程长达两小时，车费昂贵且到家太晚 (Lewat 22.30 subway tutup terpaksa naik taksi, ongkosnya mahal dan perjalanan 2 jam bikin larut malam)", "担心出租车司机拒绝载客 (Takut sopir taksi menolak penumpang)", "担心家里停水停电 (Khawatir rumah mati lampu)"),
                    correctAnswerIndex = 1,
                    explanation = "Tutupnya layanan transportasi umum kereta bawah tanah di malam hari memaksa mereka menempuh perjalanan taksi mahal berdurasi 2 jam."
                ),
                StoryQuestion(
                    id = "q_pkfrnd_4",
                    questionText = "考虑到好朋友明早还要早起赶赴公司面试，主人公在文末表达了怎样真挚的祝愿？ (Harapan tulus apa yang diungkapkan narator untuk sahabatnya di akhir bacaan?)",
                    options = listOf("希望她今晚通宵复习资料 (Berharap temannya belajar semalaman tanpa tidur)", "祝愿她明天面试一切顺利，好运相伴！ (Mendoakan agar ia beruntung dan sukses dalam wawancara kerjanya besok!)", "劝她放弃明天的面试回北京 (Menyarankannya membatalkan wawancara dan pulang ke Beijing)", "希望她改天再去面试 (Berharap ia menjadwal ulang wawancara)"),
                    correctAnswerIndex = 1,
                    explanation = "Di tengah kelelahan perjalanan malam, narator dengan tulus mendoakan keberhasilan sahabatnya."
                )
            )
        ),
        // Cerita Mandarin Bean 167 (HSK 2): Too Late (Sudah Terlambat)
        Story(
            id = "story_too_late",
            titleHanzi = "太晚了",
            titlePinyin = "Tài Wǎn Le",
            titleTranslation = "Too Late (Sudah Terlambat)",
            level = "HSK 2",
            category = "Kesehatan & Humor",
            description = "Kelakar seorang pasien di ranjang rumah sakit yang baru menyadari pentingnya hidup sehat dan berhenti merokok setelah jatuh sakit parah.",
            coverEmoji = "🏥",
            coverImageRes = R.drawable.cover_story_too_late,
            estimatedReadMinutes = 2,
            sentences = listOf(
                Sentence(
                    id = "s_toolate_1",
                    hanzi = "丈夫生病很严重，妻子在丈夫身边哭，丈夫说：“别难过了！你会再找到一个好丈夫的！”",
                    pinyin = "zhàng fu shēng bìng hěn yán zhòng qī zi zài zhàng fu shēn biān kū zhàng fu shuō bié nán guò le nǐ huì zài zhǎo dào yī gè hǎo zhàng fu de",
                    translation = "Sang suami jatuh sakit sangat parah di ranjang rumah sakit, sementara sang istri menangis tersedu-sedu di sampingnya; sang suami berbisik lirih: “Sudahlah jangan bersedih lagi! Kelak kamu pasti akan menemukan suami baru yang jauh lebih baik!”",
                    tokens = listOf(
                        WordToken("丈夫", "zhàng fu", "husband", "Kosakata HSK 2: 丈夫 (zhàng fu)"),
                        WordToken("生病", "shēng bìng", "to fall ill", "Kosakata HSK 2: 生病 (shēng bìng)"),
                        WordToken("很", "hěn", "very; quite", "Kosakata HSK 2: 很 (hěn)"),
                        WordToken("严重", "yán zhòng", "grave; serious; severe; critical", "Kosakata HSK 2: 严重 (yán zhòng)"),
                        WordToken("妻子", "qī zi", "wife", "Kosakata HSK 2: 妻子 (qī zi)"),
                        WordToken("在", "zài", "(of sb or sth) to be (located) at", "Kosakata HSK 2: 在 (zài)"),
                        WordToken("丈夫", "zhàng fu", "husband", "Kosakata HSK 2: 丈夫 (zhàng fu)"),
                        WordToken("身边", "shēn biān", "at one's side / on hand", "Kosakata HSK 2: 身边 (shēn biān)"),
                        WordToken("哭", "kū", "to cry; to weep", "Kosakata HSK 2: 哭 (kū)"),
                        WordToken("丈夫", "zhàng fu", "husband", "Kosakata HSK 2: 丈夫 (zhàng fu)"),
                        WordToken("说", "shuō", "to speak; to talk; to say", "Kosakata HSK 2: 说 (shuō)"),
                        WordToken("别", "bié", "don't ...! / (noun suffix) category", "Kosakata HSK 2: 别 (bié)"),
                        WordToken("难过", "nán guò", "to feel sad", "Kosakata HSK 2: 难过 (nán guò)"),
                        WordToken("了", "le", "(completed action marker) / (modal particle indicating change of state, situation now)", "Kosakata HSK 2: 了 (le)"),
                        WordToken("你", "nǐ", "you", "Kosakata HSK 2: 你 (nǐ)"),
                        WordToken("会", "huì", "to be likely to; to be sure to", "Kosakata HSK 2: 会 (huì)"),
                        WordToken("再", "zài", "again; once more; re-", "Kosakata HSK 2: 再 (zài)"),
                        WordToken("找", "zhǎo", "to try to find / to look for / to call on sb / to find / to seek", "Kosakata HSK 2: 找 (zhǎo)"),
                        WordToken("到", "dào", "to reach; to arrive / to (a place); until (a time); up to (a point) / (verb complement indicating arriving at a place or reaching a point)", "Kosakata HSK 2: 到 (dào)"),
                        WordToken("一", "yī", "one / single / a (article)", "Kosakata HSK 2: 一 (yī)"),
                        WordToken("个", "gè", "classifier for people or objects in general", "Kosakata HSK 2: 个 (gè)"),
                        WordToken("好", "hǎo", "good / appropriate; proper", "Kosakata HSK 2: 好 (hǎo)"),
                        WordToken("丈夫", "zhàng fu", "husband", "Kosakata HSK 2: 丈夫 (zhàng fu)"),
                        WordToken("的", "de", "emphatic particle (used at the end of a declarative sentence for emphasis)", "Kosakata HSK 2: 的 (de)")
                    )
                ),
                Sentence(
                    id = "s_toolate_2",
                    hanzi = "妻子更难过了：“太晚了！如果你10年前生病的话就好了。”",
                    pinyin = "qī zi gèng nán guò le tài wǎn le rú guǒ nǐ nián qián shēng bìng de huà jiù hǎo le",
                    translation = "Mendengar itu sang istri justru menangis semakin histeris: “Sudah terlambat! Coba saja kalau kamu sakit parah seperti ini sepuluh tahun yang lalu, alangkah bahagianya!”",
                    tokens = listOf(
                        WordToken("妻子", "qī zi", "wife", "Kosakata HSK 2: 妻子 (qī zi)"),
                        WordToken("更", "gèng", "more / even more / further / still / still more", "Kosakata HSK 2: 更 (gèng)"),
                        WordToken("难过", "nán guò", "to feel sad", "Kosakata HSK 2: 难过 (nán guò)"),
                        WordToken("了", "le", "(completed action marker) / (modal particle indicating change of state, situation now)", "Kosakata HSK 2: 了 (le)"),
                        WordToken("太", "tài", "too (much) / very / extremely", "Kosakata HSK 2: 太 (tài)"),
                        WordToken("晚", "wǎn", "late", "Kosakata HSK 2: 晚 (wǎn)"),
                        WordToken("了", "le", "(completed action marker) / (modal particle indicating change of state, situation now)", "Kosakata HSK 2: 了 (le)"),
                        WordToken("如果", "rú guǒ", "if; in case; in the event that", "Kosakata HSK 2: 如果 (rú guǒ)"),
                        WordToken("你", "nǐ", "you", "Kosakata HSK 2: 你 (nǐ)"),
                        WordToken("年", "nián", "year", "Kosakata HSK 2: 年 (nián)"),
                        WordToken("前", "qián", "ago / before / BC / former / formerly", "Kosakata HSK 2: 前 (qián)"),
                        WordToken("生病", "shēng bìng", "to fall ill", "Kosakata HSK 2: 生病 (shēng bìng)"),
                        WordToken("的", "de", "possessive particle (of; 's) / modifying particle (used after an attribute to modify a noun or to form a nominal expression)", "Kosakata HSK 2: 的 (de)"),
                        WordToken("话", "huà", "spoken words / speech / talk / words / conversation / what sb said", "Kosakata HSK 2: 话 (huà)"),
                        WordToken("就", "jiù", "in that case; then", "Kosakata HSK 2: 就 (jiù)"),
                        WordToken("好", "hǎo", "good / appropriate; proper", "Kosakata HSK 2: 好 (hǎo)"),
                        WordToken("了", "le", "(completed action marker) / (modal particle indicating change of state, situation now)", "Kosakata HSK 2: 了 (le)")
                    )
                )
            ),
            questions = listOf(
                StoryQuestion(
                    id = "q_toolate_1",
                    questionText = "病榻前面对悲痛欲绝哭泣的妻子，病入膏肓的丈夫展现了怎样的宽慰之词？ (Kata-kata penghiburan apa yang dibisikkan sang suami yang sakit parah kepada istrinya?)",
                    options = listOf("叮嘱妻子把家里银行存款藏好 (Berpesan agar menyembunyikan uang tabungan keluarga)", "安慰妻子不要难过，并祝福她将来能再找到一个好丈夫共度余生 (Menghibur istri agar jangan bersedih dan mendoakannya kelak bisa menemukan suami baru yang baik)", "埋怨妻子没有按时给他喂药 (Menyalahkan istri karena telat memberi obat)", "要求妻子在他死后不要改嫁 (Menuntut istri agar tidak menikah lagi)"),
                    correctAnswerIndex = 1,
                    explanation = "Suami berlapang dada merelakan kepergiannya dan mendoakan istrinya bisa menemukan pendamping hidup baru."
                ),
                StoryQuestion(
                    id = "q_toolate_2",
                    questionText = "听到丈夫这番感人肺腑的临终体贴，妻子的悲伤情绪发生了怎样意想不到的逆转？ (Bagaimana reaksi emosional tak terduga yang diungkapkan sang istri mendengar perkataan suaminya?)",
                    options = listOf("破涕为笑立刻拿出手机给朋友报喜 (Langsung tertawa dan mengabari teman lewat ponsel)", "哭得更加撕心裂肺并抱怨“太晚了，如果你10年前生病就好了！” (Menangis semakin histeris sambil mengeluh: 'Sudah terlambat, coba kalau kamu sakitnya 10 tahun lalu!')", "感动得扑在丈夫怀里晕了过去 (Pingsan terharu di pelukan sang suami)", "生气地摔门走出病房 (Membanting pintu keluar ruangan)"),
                    correctAnswerIndex = 1,
                    explanation = "Puncak humor hitam (black comedy): bukannya bersyukur atas usia pernikahan, sang istri malah menyesal kenapa suaminya tidak sakit sejak 10 tahun silam!"
                ),
                StoryQuestion(
                    id = "q_toolate_3",
                    questionText = "妻子嘴里脱口而出的“如果你10年前生病就好了”，暗含了夫妻生活中的什么讽刺意味？ (Makna ironis apa yang tersirat dari ucapan spontan sang istri tentang 'sepuluh tahun lalu'?)",
                    options = listOf("十年前医院的医疗技术更加发达 (Sepuluh tahun lalu teknologi kedokteran lebih canggih)", "十年前她正值年轻美貌，更容易改嫁找到更好的高富帅丈夫 (Sepuluh tahun lalu ia masih muda belia sehingga jauh lebih mudah menikah lagi dengan pria kaya tampan!)", "十年前她没有工作没有收入 (Sepuluh tahun lalu ia belum memiliki penghasilan)", "十年前生病医药费更便宜 (Sepuluh tahun lalu biaya rumah sakit lebih murah)"),
                    correctAnswerIndex = 1,
                    explanation = "Kekesalan sang istri yang merasa masa mudanya terlanjur habis bersama suaminya tersebut."
                ),
                StoryQuestion(
                    id = "q_toolate_4",
                    questionText = "这篇极为短小精悍的黑色幽默故事，属于汉语幽默文学中的哪种典型手法？ (Gaya penulisan humor apa yang digunakan dalam lelucon rumah sakit dua kalimat ini?)",
                    options = listOf("平铺直叙的流水账叙事 (Narasi datar kronologis)", "极度反差与意想不到的黑色冷幽默反转 (Pembalikan klimaks kontras tinggi khas komedi satir berdarah dingin)", "悲惨严肃的正剧正史 (Drama tragedi sejarah serius)", "浪漫主义的神话传说 (Cerita legenda mitologi romantis)"),
                    correctAnswerIndex = 1,
                    explanation = "Kejeniusan lelucon terletak pada twist emosional ekstrem antara empati suami dan kejujuran pedas sang istri."
                )
            )
        ),
        // Cerita Mandarin Bean 168 (HSK 2): I Want to Revenge (Aku Ingin Membalas Dendam)
        Story(
            id = "story_i_want_to_revenge",
            titleHanzi = "我要报复",
            titlePinyin = "Wǒ Yào Bàofu",
            titleTranslation = "I Want to Revenge (Aku Ingin Membalas Dendam)",
            level = "HSK 2",
            category = "Pernikahan & Humor",
            description = "Kekesalan sepasang suami istri yang bertengkar sengit hingga sang suami mengancam akan membalas dendam dengan cara yang tak terduga.",
            coverEmoji = "🗯️",
            coverImageRes = R.drawable.cover_story_i_want_to_revenge,
            estimatedReadMinutes = 2,
            sentences = listOf(
                Sentence(
                    id = "s_revnge_1",
                    hanzi = "一个人对他朋友说：“这家公司对我不好！我要离开，我要报复！”",
                    pinyin = "yī gè rén duì tā péng you shuō zhè jiā gōng sī duì wǒ bù hǎo wǒ yào lí kāi wǒ yào bào fù",
                    translation = "Seorang karyawan mengeluh kepada sahabatnya: “Perusahaan tempatku bekerja memperlakukanku dengan sangat buruk! Aku berniat mengundurkan diri dan membalas dendam kepada mereka!”",
                    tokens = listOf(
                        WordToken("一", "yī", "one / single / a (article)", "Kosakata HSK 2: 一 (yī)"),
                        WordToken("个", "gè", "classifier for people or objects in general", "Kosakata HSK 2: 个 (gè)"),
                        WordToken("人", "rén", "person; people", "Kosakata HSK 2: 人 (rén)"),
                        WordToken("对", "duì", "towards; at; for / concerning; regarding", "Kosakata HSK 2: 对 (duì)"),
                        WordToken("他", "tā", "he; him; his", "Kosakata HSK 2: 他 (tā)"),
                        WordToken("朋友", "péng you", "friend", "Kosakata HSK 2: 朋友 (péng you)"),
                        WordToken("说", "shuō", "to speak; to talk; to say", "Kosakata HSK 2: 说 (shuō)"),
                        WordToken("这", "zhè", "this; these", "Kosakata HSK 2: 这 (zhè)"),
                        WordToken("家", "jiā", "classifier for families or businesses", "Kosakata HSK 2: 家 (jiā)"),
                        WordToken("公司", "gōng sī", "company; firm; corporation", "Kosakata HSK 2: 公司 (gōng sī)"),
                        WordToken("对", "duì", "to treat (sb a certain way)", "Kosakata HSK 2: 对 (duì)"),
                        WordToken("我", "wǒ", "I; me; my", "Kosakata HSK 2: 我 (wǒ)"),
                        WordToken("不", "bù", "no; not so", "Kosakata HSK 2: 不 (bù)"),
                        WordToken("好", "hǎo", "good / appropriate; proper", "Kosakata HSK 2: 好 (hǎo)"),
                        WordToken("我", "wǒ", "I; me; my", "Kosakata HSK 2: 我 (wǒ)"),
                        WordToken("要", "yào", "will; shall; about to / need to; should / if", "Kosakata HSK 2: 要 (yào)"),
                        WordToken("离开", "lí kāi", "to depart; to leave", "Kosakata HSK 2: 离开 (lí kāi)"),
                        WordToken("我", "wǒ", "I; me; my", "Kosakata HSK 2: 我 (wǒ)"),
                        WordToken("要", "yào", "to want; to need; to ask for", "Kosakata HSK 2: 要 (yào)"),
                        WordToken("报复", "bào fù", "to make reprisals; to retaliate", "Kosakata HSK 2: 报复 (bào fù)")
                    )
                ),
                Sentence(
                    id = "s_revnge_2",
                    hanzi = "他朋友说：“我同意。不过，你现在离开，不是很好，因为公司不会失去什么。”",
                    pinyin = "tā péng you shuō wǒ tóng yì bù guò nǐ xiàn zài lí kāi bù shì hěn hǎo yīn wèi gōng sī bù huì shī qù shén me",
                    translation = "Sahabatnya menyahut bijak: “Aku sangat setuju. Namun jika kamu mengundurkan diri sekarang, balas dendammu tidak akan terasa, karena perusahaan sama sekali tidak kehilangan apa-apa.”",
                    tokens = listOf(
                        WordToken("他", "tā", "he; him; his", "Kosakata HSK 2: 他 (tā)"),
                        WordToken("朋友", "péng you", "friend", "Kosakata HSK 2: 朋友 (péng you)"),
                        WordToken("说", "shuō", "to speak; to talk; to say", "Kosakata HSK 2: 说 (shuō)"),
                        WordToken("我", "wǒ", "I; me; my", "Kosakata HSK 2: 我 (wǒ)"),
                        WordToken("同意", "tóng yì", "to agree / to consent / to approve", "Kosakata HSK 2: 同意 (tóng yì)"),
                        WordToken("不过", "bù guò", "but / however", "Kosakata HSK 2: 不过 (bù guò)"),
                        WordToken("你", "nǐ", "you", "Kosakata HSK 2: 你 (nǐ)"),
                        WordToken("现在", "xiàn zài", "now; at present; currently", "Kosakata HSK 2: 现在 (xiàn zài)"),
                        WordToken("离开", "lí kāi", "to depart; to leave", "Kosakata HSK 2: 离开 (lí kāi)"),
                        WordToken("不是", "bù shì", "no / not", "Kosakata HSK 2: 不是 (bù shì)"),
                        WordToken("很", "hěn", "very; quite", "Kosakata HSK 2: 很 (hěn)"),
                        WordToken("好", "hǎo", "good / appropriate; proper", "Kosakata HSK 2: 好 (hǎo)"),
                        WordToken("因为", "yīn wèi", "because; owing to; on account of", "Kosakata HSK 2: 因为 (yīn wèi)"),
                        WordToken("公司", "gōng sī", "company; firm; corporation", "Kosakata HSK 2: 公司 (gōng sī)"),
                        WordToken("不", "bù", "no; not so", "Kosakata HSK 2: 不 (bù)"),
                        WordToken("会", "huì", "to be likely to; to be sure to", "Kosakata HSK 2: 会 (huì)"),
                        WordToken("失去", "shī qù", "to lose", "Kosakata HSK 2: 失去 (shī qù)"),
                        WordToken("什么", "shén me", "something; anything", "Kosakata HSK 2: 什么 (shén me)")
                    )
                ),
                Sentence(
                    id = "s_revnge_3",
                    hanzi = "这个人问：“那我要怎么做？”",
                    pinyin = "zhè gè rén wèn nà wǒ yào zěn me zuò",
                    translation = "Pria itu bertanya penasaran: “Lantas bagaimana langkah terbaik yang harus kulakukan?”",
                    tokens = listOf(
                        WordToken("这", "zhè", "this; these", "Kosakata HSK 2: 这 (zhè)"),
                        WordToken("个", "gè", "classifier for people or objects in general", "Kosakata HSK 2: 个 (gè)"),
                        WordToken("人", "rén", "person; people", "Kosakata HSK 2: 人 (rén)"),
                        WordToken("问", "wèn", "to ask; to inquire", "Kosakata HSK 2: 问 (wèn)"),
                        WordToken("那", "nà", "then (in that case)", "Kosakata HSK 2: 那 (nà)"),
                        WordToken("我", "wǒ", "I; me; my", "Kosakata HSK 2: 我 (wǒ)"),
                        WordToken("要", "yào", "will; shall; about to / need to; should / if", "Kosakata HSK 2: 要 (yào)"),
                        WordToken("怎么", "zěn me", "how? / what? / why?", "Kosakata HSK 2: 怎么 (zěn me)"),
                        WordToken("做", "zuò", "to do; to engage in; to hold (a party etc)", "Kosakata HSK 2: 做 (zuò)")
                    )
                ),
                Sentence(
                    id = "s_revnge_4",
                    hanzi = "朋友说：“我觉得你要好好工作，先找到很多客户，再离开公司，让公司失去这些客户。”",
                    pinyin = "péng you shuō wǒ jué de nǐ yào hǎo hǎo gōng zuò xiān zhǎo dào hěn duō kè hù zài lí kāi gōng sī ràng gōng sī shī qù zhè xiē kè hù",
                    translation = "Sahabatnya memberi saran: “Menurutku kamu harus bekerja mati-matian, rangkul dan dapatkan sebanyak mungkin klien besar, barulah kemudian kamu resign agar perusahaan rugi besar kehilangan semua klien tersebut.”",
                    tokens = listOf(
                        WordToken("朋友", "péng you", "friend", "Kosakata HSK 2: 朋友 (péng you)"),
                        WordToken("说", "shuō", "to speak; to talk; to say", "Kosakata HSK 2: 说 (shuō)"),
                        WordToken("我", "wǒ", "I; me; my", "Kosakata HSK 2: 我 (wǒ)"),
                        WordToken("觉得", "jué de", "to think that ...; to feel that ...", "Kosakata HSK 2: 觉得 (jué de)"),
                        WordToken("你", "nǐ", "you", "Kosakata HSK 2: 你 (nǐ)"),
                        WordToken("要", "yào", "will; shall; about to / need to; should / if", "Kosakata HSK 2: 要 (yào)"),
                        WordToken("好好", "hǎo hǎo", "well; carefully; nicely; properly", "Kosakata HSK 2: 好好 (hǎo hǎo)"),
                        WordToken("工作", "gōng zuò", "to work / (of a machine) to operate", "Kosakata HSK 2: 工作 (gōng zuò)"),
                        WordToken("先", "xiān", "beforehand; first; earlier / at first; originally / for the time being; for now", "Kosakata HSK 2: 先 (xiān)"),
                        WordToken("找到", "zhǎo dào", "to find", "Kosakata HSK 2: 找到 (zhǎo dào)"),
                        WordToken("很多", "hěn duō", "many; a lot of", "Kosakata HSK 2: 很多 (hěn duō)"),
                        WordToken("客户", "kè hù", "client; customer", "Kosakata HSK 2: 客户 (kè hù)"),
                        WordToken("再", "zài", "again; once more; re-", "Kosakata HSK 2: 再 (zài)"),
                        WordToken("离开", "lí kāi", "to depart; to leave", "Kosakata HSK 2: 离开 (lí kāi)"),
                        WordToken("公司", "gōng sī", "company; firm; corporation", "Kosakata HSK 2: 公司 (gōng sī)"),
                        WordToken("让", "ràng", "to permit / to let sb do sth / to have sb do sth / to make sb (feel sad etc)", "Kosakata HSK 2: 让 (ràng)"),
                        WordToken("公司", "gōng sī", "company; firm; corporation", "Kosakata HSK 2: 公司 (gōng sī)"),
                        WordToken("失去", "shī qù", "to lose", "Kosakata HSK 2: 失去 (shī qù)"),
                        WordToken("这些", "zhè xiē", "these", "Kosakata HSK 2: 这些 (zhè xiē)"),
                        WordToken("客户", "kè hù", "client; customer", "Kosakata HSK 2: 客户 (kè hù)")
                    )
                ),
                Sentence(
                    id = "s_revnge_5",
                    hanzi = "这个人觉得朋友说得很对，就好好工作。",
                    pinyin = "zhè gè rén jué de péng you shuō de hěn duì jiù hǎo hǎo gōng zuò",
                    translation = "Pria itu menganggap saran sahabatnya sangat masuk akal, lalu ia pun mulai bekerja keras dengan giat.",
                    tokens = listOf(
                        WordToken("这", "zhè", "this; these", "Kosakata HSK 2: 这 (zhè)"),
                        WordToken("个", "gè", "classifier for people or objects in general", "Kosakata HSK 2: 个 (gè)"),
                        WordToken("人", "rén", "person; people", "Kosakata HSK 2: 人 (rén)"),
                        WordToken("觉得", "jué de", "to think that ...; to feel that ...", "Kosakata HSK 2: 觉得 (jué de)"),
                        WordToken("朋友", "péng you", "friend", "Kosakata HSK 2: 朋友 (péng you)"),
                        WordToken("说", "shuō", "to speak; to talk; to say", "Kosakata HSK 2: 说 (shuō)"),
                        WordToken("得", "de", "structural particle: used after a verb (or adjective as main verb), linking it to following phrase indicating effect, degree, possibility etc", "Kosakata HSK 2: 得 (de)"),
                        WordToken("很", "hěn", "very; quite", "Kosakata HSK 2: 很 (hěn)"),
                        WordToken("对", "duì", "right; correct", "Kosakata HSK 2: 对 (duì)"),
                        WordToken("就", "jiù", "merely; nothing else but; simply; just; precisely; exactly", "Kosakata HSK 2: 就 (jiù)"),
                        WordToken("好好", "hǎo hǎo", "well; carefully; nicely; properly", "Kosakata HSK 2: 好好 (hǎo hǎo)"),
                        WordToken("工作", "gōng zuò", "to work / (of a machine) to operate", "Kosakata HSK 2: 工作 (gōng zuò)")
                    )
                ),
                Sentence(
                    id = "s_revnge_6",
                    hanzi = "一年后，他有了很多客户。",
                    pinyin = "yī nián hòu tā yǒu le hěn duō kè hù",
                    translation = "Satu tahun kemudian, ia berhasil memegang jaringan klien yang sangat banyak dan bernilai tinggi.",
                    tokens = listOf(
                        WordToken("一", "yī", "one / single / a (article)", "Kosakata HSK 2: 一 (yī)"),
                        WordToken("年", "nián", "year", "Kosakata HSK 2: 年 (nián)"),
                        WordToken("后", "hòu", "afterwards / after", "Kosakata HSK 2: 后 (hòu)"),
                        WordToken("他", "tā", "he; him; his", "Kosakata HSK 2: 他 (tā)"),
                        WordToken("有", "yǒu", "to have; there is", "Kosakata HSK 2: 有 (yǒu)"),
                        WordToken("了", "le", "(completed action marker) / (modal particle indicating change of state, situation now)", "Kosakata HSK 2: 了 (le)"),
                        WordToken("很多", "hěn duō", "many; a lot of", "Kosakata HSK 2: 很多 (hěn duō)"),
                        WordToken("客户", "kè hù", "client; customer", "Kosakata HSK 2: 客户 (kè hù)")
                    )
                ),
                Sentence(
                    id = "s_revnge_7",
                    hanzi = "再见面时，朋友对他说：“现在是报复的好时机，你快离开公司！”",
                    pinyin = "zài jiàn miàn shí péng you duì tā shuō xiàn zài shì bào fù de hǎo shí jī nǐ kuài lí kāi gōng sī",
                    translation = "Saat bertemu kembali, sahabatnya mengingatkan: “Nah, sekarang adalah waktu terbaik untuk membalas dendam, segeralah ajukan surat resign dari perusahaan itu!”",
                    tokens = listOf(
                        WordToken("再", "zài", "again; once more; re-", "Kosakata HSK 2: 再 (zài)"),
                        WordToken("见面", "jiàn miàn", "to meet; to see each other", "Kosakata HSK 2: 见面 (jiàn miàn)"),
                        WordToken("时", "shí", "when", "Kosakata HSK 2: 时 (shí)"),
                        WordToken("朋友", "péng you", "friend", "Kosakata HSK 2: 朋友 (péng you)"),
                        WordToken("对", "duì", "towards; at; for / concerning; regarding", "Kosakata HSK 2: 对 (duì)"),
                        WordToken("他", "tā", "he; him; his", "Kosakata HSK 2: 他 (tā)"),
                        WordToken("说", "shuō", "to speak; to talk; to say", "Kosakata HSK 2: 说 (shuō)"),
                        WordToken("现在", "xiàn zài", "now; at present; currently", "Kosakata HSK 2: 现在 (xiàn zài)"),
                        WordToken("是", "shì", "to be (followed by substantives only)", "Kosakata HSK 2: 是 (shì)"),
                        WordToken("报复", "bào fù", "revenge; retaliation", "Kosakata HSK 2: 报复 (bào fù)"),
                        WordToken("的", "de", "possessive particle (of; 's) / modifying particle (used after an attribute to modify a noun or to form a nominal expression)", "Kosakata HSK 2: 的 (de)"),
                        WordToken("好", "hǎo", "good / appropriate; proper", "Kosakata HSK 2: 好 (hǎo)"),
                        WordToken("时机", "shí jī", "opportunity; opportune moment", "Kosakata HSK 2: 时机 (shí jī)"),
                        WordToken("你", "nǐ", "you", "Kosakata HSK 2: 你 (nǐ)"),
                        WordToken("快", "kuài", "rapid / quick", "Kosakata HSK 2: 快 (kuài)"),
                        WordToken("离开", "lí kāi", "to depart; to leave", "Kosakata HSK 2: 离开 (lí kāi)"),
                        WordToken("公司", "gōng sī", "company; firm; corporation", "Kosakata HSK 2: 公司 (gōng sī)")
                    )
                ),
                Sentence(
                    id = "s_revnge_8",
                    hanzi = "这个人笑着说：“经理告诉我，准备让我做经理助理，我现在不想离开公司了。”",
                    pinyin = "zhè gè rén xiào zhe shuō jīng lǐ gào su wǒ zhǔn bèi ràng wǒ zuò jīng lǐ zhù lǐ wǒ xiàn zài bù xiǎng lí kāi gōng sī le",
                    translation = "Pria itu tersenyum lebar lalu berbisik: “Manajer baru saja mengabarkan bahwa aku akan dipromosikan menjadi asisten manajer; sekarang aku justru betah dan tak ingin keluar dari perusahaan!”",
                    tokens = listOf(
                        WordToken("这", "zhè", "this; these", "Kosakata HSK 2: 这 (zhè)"),
                        WordToken("个", "gè", "classifier for people or objects in general", "Kosakata HSK 2: 个 (gè)"),
                        WordToken("人", "rén", "person; people", "Kosakata HSK 2: 人 (rén)"),
                        WordToken("笑", "xiào", "to laugh; to smile", "Kosakata HSK 2: 笑 (xiào)"),
                        WordToken("着", "zhe", "aspect particle indicating action in progress or ongoing state", "Kosakata HSK 2: 着 (zhe)"),
                        WordToken("说", "shuō", "to speak; to talk; to say", "Kosakata HSK 2: 说 (shuō)"),
                        WordToken("经理", "jīng lǐ", "manager / director", "Kosakata HSK 2: 经理 (jīng lǐ)"),
                        WordToken("告诉", "gào su", "to tell; to inform; to let know", "Kosakata HSK 2: 告诉 (gào su)"),
                        WordToken("我", "wǒ", "I; me; my", "Kosakata HSK 2: 我 (wǒ)"),
                        WordToken("准备", "zhǔn bèi", "to prepare / to intend / to be about to", "Kosakata HSK 2: 准备 (zhǔn bèi)"),
                        WordToken("让", "ràng", "to permit / to let sb do sth / to have sb do sth / to make sb (feel sad etc)", "Kosakata HSK 2: 让 (ràng)"),
                        WordToken("我", "wǒ", "I; me; my", "Kosakata HSK 2: 我 (wǒ)"),
                        WordToken("做", "zuò", "(of a person) to be (an intermediary, a good student etc); to become (husband and wife, friends etc)", "Kosakata HSK 2: 做 (zuò)"),
                        WordToken("经理", "jīng lǐ", "manager / director", "Kosakata HSK 2: 经理 (jīng lǐ)"),
                        WordToken("助理", "zhù lǐ", "assistant", "Kosakata HSK 2: 助理 (zhù lǐ)"),
                        WordToken("我", "wǒ", "I; me; my", "Kosakata HSK 2: 我 (wǒ)"),
                        WordToken("现在", "xiàn zài", "now; at present; currently", "Kosakata HSK 2: 现在 (xiàn zài)"),
                        WordToken("不", "bù", "no; not so", "Kosakata HSK 2: 不 (bù)"),
                        WordToken("想", "xiǎng", "to desire; to want (to)", "Kosakata HSK 2: 想 (xiǎng)"),
                        WordToken("离开", "lí kāi", "to depart; to leave", "Kosakata HSK 2: 离开 (lí kāi)"),
                        WordToken("公司", "gōng sī", "company; firm; corporation", "Kosakata HSK 2: 公司 (gōng sī)"),
                        WordToken("了", "le", "(completed action marker) / (modal particle indicating change of state, situation now)", "Kosakata HSK 2: 了 (le)")
                    )
                )
            ),
            questions = listOf(
                StoryQuestion(
                    id = "q_revnge_1",
                    questionText = "主人公最初怒气冲冲地向朋友控诉公司，并打算采取什么极端的反抗行动？ (Rencana tindakan apa yang hendak dilakukan sang karyawan di awal cerita?)",
                    options = listOf("去法庭起诉老板克扣工资 (Menuntut bos ke pengadilan atas pemotongan gaji)", "立即辞职走人，并设法对这家苛待员工的公司展开报复 (Segera mengajukan resign dan mencari cara membalas dendam kepada perusahaan)", "在公司食堂里大吵大闹 (Membuat keributan di kantin kantor)", "把办公室电脑砸毁 (Merusak komputer kantor)"),
                    correctAnswerIndex = 1,
                    explanation = "Merasa diperlakukan tidak adil, ia bertekad mengundurkan diri dan membalas dendam kepada kantornya."
                ),
                StoryQuestion(
                    id = "q_revnge_2",
                    questionText = "深谙职场之道的智囊朋友，为他提出了怎样一条“以退为进”的高明复仇妙计？ (Siasat balas dendam cerdik apa yang diusulkan oleh sahabatnya?)",
                    options = listOf("给竞争对手公司发送商业机密 (Membocorkan rahasia dagang ke perusahaan saingan)", "先拼命努力工作拉拢大量核心大客户，然后再携客出走让公司承受惨重损失 (Bekerja keras menggaet banyak klien besar, baru kemudian keluar agar perusahaan merugi besar)", "在网络上发帖抹黑公司声誉 (Membuat postingan negatif mencoreng nama perusahaan di media sosial)", "每天在工位上偷懒摸鱼 (Bermalas-malasan di meja kerja setiap hari)"),
                    correctAnswerIndex = 1,
                    explanation = "Strategi membesarkan nilai tawar: menjadi aset kunci perusahaan terlebih dahulu sebelum meninggalkannya."
                ),
                StoryQuestion(
                    id = "q_revnge_3",
                    questionText = "一年之后当朋友再次提醒他“时机成熟该辞职报仇”时，主人公的态度发生了什么戏剧性逆转？ (Perubahan sikap apa yang terjadi saat sang sahabat mengingatkan waktu balas dendam setahun kemudian?)",
                    options = listOf("早已被老板开除流落街头 (Sudah dipecat dan menganggur)", "因为业绩斐然即将升任经理助理，待遇优渥，所以满心欢喜根本不想辞职了！ (Karena kinerjanya hebat ia dipromosikan menjadi asisten manajer bergaji tinggi, sehingga betah dan tak mau resign!)", "和老板结为了干兄弟 (Menjadi saudara angkat bos)", "把所有客户资料都弄丢了 (Semua berkas data kliennya hilang)"),
                    correctAnswerIndex = 1,
                    explanation = "Puncak transformasi diri: dalam proses 'berpura-pura rajin demi balas dendam', ia justru menjelma menjadi bintang perusahaan yang sukses."
                ),
                StoryQuestion(
                    id = "q_revnge_4",
                    questionText = "这篇充满智慧的职场寓言给所有身处逆境的打工人带来了什么核心心理启示？ (Pelajaran karier apa yang dapat dipetik dari strategi balas dendam yang berbuah sukses ini?)",
                    options = listOf("最好的报复绝不是盲目赌气自毁前程，而是通过专注提升自我价值与核心竞争力来赢得主动权与话语权 (Balas dendam terbaik bukanlah merajuk merugikan diri, melainkan membuktikan kompetensi diri hingga bernilai tinggi)", "永远不要听信朋友的任何职场建议 (Jangan pernah mendengarkan nasihat karier dari sahabat)", "做经理助理工作非常轻松 (Tugas asisten manajer sangat santai)", "客户越多越容易被辞退 (Makin banyak klien makin mudah dipecat)"),
                    correctAnswerIndex = 0,
                    explanation = "Fokus pada pertumbuhan kapasitas pribadi akan mengubah rasa dendam menjadi batu loncatan kesuksesan sejati."
                )
            )
        ),
        // Cerita Mandarin Bean 169 (HSK 2): Why Learning Chinese (Mengapa Belajar Bahasa Mandarin)
        Story(
            id = "story_why_learning_chinese",
            titleHanzi = "为什么学汉语",
            titlePinyin = "Wèishénme Xué Hànyǔ",
            titleTranslation = "Why Learning Chinese (Mengapa Belajar Bahasa Mandarin)",
            level = "HSK 2",
            category = "Pendidikan & Motivasi",
            description = "Alasan mendalam seorang pembelajar internasional menekuni bahasa Mandarin demi masa depan karier dan kecintaannya pada kebudayaan Tiongkok.",
            coverEmoji = "🗣️",
            coverImageRes = R.drawable.cover_story_why_learning_chinese,
            estimatedReadMinutes = 2,
            sentences = listOf(
                Sentence(
                    id = "s_whylrn_1",
                    hanzi = "我的中国朋友喜欢问我：为什么要学汉语？",
                    pinyin = "wǒ de Zhōng guó péng you xǐ huan wèn wǒ wèi shén me yào xué Hàn yǔ",
                    translation = "Teman-teman orang Tiongkok kerap bertanya kepadaku: Mengapa kamu tertarik mempelajari bahasa Mandarin?",
                    tokens = listOf(
                        WordToken("我", "wǒ", "I; me; my", "Kosakata HSK 2: 我 (wǒ)"),
                        WordToken("的", "de", "possessive particle (of; 's) / modifying particle (used after an attribute to modify a noun or to form a nominal expression)", "Kosakata HSK 2: 的 (de)"),
                        WordToken("中国", "Zhōng guó", "China", "Kosakata HSK 2: 中国 (Zhōng guó)"),
                        WordToken("朋友", "péng you", "friend", "Kosakata HSK 2: 朋友 (péng you)"),
                        WordToken("喜欢", "xǐ huan", "to like; to be fond of", "Kosakata HSK 2: 喜欢 (xǐ huan)"),
                        WordToken("问", "wèn", "to ask; to inquire", "Kosakata HSK 2: 问 (wèn)"),
                        WordToken("我", "wǒ", "I; me; my", "Kosakata HSK 2: 我 (wǒ)"),
                        WordToken("为什么", "wèi shén me", "why? / for what reason?", "Kosakata HSK 2: 为什么 (wèi shén me)"),
                        WordToken("要", "yào", "will; shall; about to / need to; should / if", "Kosakata HSK 2: 要 (yào)"),
                        WordToken("学", "xué", "to learn / to study / to imitate", "Kosakata HSK 2: 学 (xué)"),
                        WordToken("汉语", "Hàn yǔ", "Chinese language", "Kosakata HSK 2: 汉语 (Hàn yǔ)")
                    )
                ),
                Sentence(
                    id = "s_whylrn_2",
                    hanzi = "因为我喜欢旅游，如果会说汉语，在中国旅行很方便。",
                    pinyin = "yīn wèi wǒ xǐ huan lǚ yóu rú guǒ huì shuō Hàn yǔ zài Zhōng guó lǚ xíng hěn fāng biàn",
                    translation = "Aku menjawab karena aku sangat gemar bepergian traveling; jika mahir berbahasa Mandarin, menjelajahi berbagai pelosok Tiongkok akan terasa sangat mudah dan praktis.",
                    tokens = listOf(
                        WordToken("因为", "yīn wèi", "because; owing to; on account of", "Kosakata HSK 2: 因为 (yīn wèi)"),
                        WordToken("我", "wǒ", "I; me; my", "Kosakata HSK 2: 我 (wǒ)"),
                        WordToken("喜欢", "xǐ huan", "to like; to be fond of", "Kosakata HSK 2: 喜欢 (xǐ huan)"),
                        WordToken("旅游", "lǚ yóu", "to travel", "Kosakata HSK 2: 旅游 (lǚ yóu)"),
                        WordToken("如果", "rú guǒ", "if; in case; in the event that", "Kosakata HSK 2: 如果 (rú guǒ)"),
                        WordToken("会", "huì", "can; to have the skill; to know how to", "Kosakata HSK 2: 会 (huì)"),
                        WordToken("说", "shuō", "to speak; to talk; to say", "Kosakata HSK 2: 说 (shuō)"),
                        WordToken("汉语", "Hàn yǔ", "Chinese language", "Kosakata HSK 2: 汉语 (Hàn yǔ)"),
                        WordToken("在", "zài", "(of sb or sth) to be (located) at", "Kosakata HSK 2: 在 (zài)"),
                        WordToken("中国", "Zhōng guó", "China", "Kosakata HSK 2: 中国 (Zhōng guó)"),
                        WordToken("旅行", "lǚ xíng", "to travel", "Kosakata HSK 2: 旅行 (lǚ xíng)"),
                        WordToken("很", "hěn", "very; quite", "Kosakata HSK 2: 很 (hěn)"),
                        WordToken("方便", "fāng biàn", "convenient; suitable", "Kosakata HSK 2: 方便 (fāng biàn)")
                    )
                ),
                Sentence(
                    id = "s_whylrn_3",
                    hanzi = "现在不会汉语也能在中国旅行，可是会汉语可以和中国人聊天，了解中国文化很喜欢中国，也想在中国工作。",
                    pinyin = "xiàn zài bù huì Hàn yǔ yě néng zài Zhōng guó lǚ xíng kě shì huì Hàn yǔ kě yǐ hé Zhōng guó rén liáo tiān liǎo jiě Zhōng guó wén huà hěn xǐ huan Zhōng guó yě xiǎng zài Zhōng guó gōng zuò",
                    translation = "Di era sekarang memang tanpa bisa bahasa Mandarin pun kita tetap bisa berwisata di Tiongkok, namun dengan menguasai bahasanya kita bisa mengobrol akrab dengan penduduk lokal, menyelami kebudayaan luhur, dan kelak membuka peluang karier kerja di Tiongkok.",
                    tokens = listOf(
                        WordToken("现在", "xiàn zài", "now; at present; currently", "Kosakata HSK 2: 现在 (xiàn zài)"),
                        WordToken("不会", "bù huì", "not able", "Kosakata HSK 2: 不会 (bù huì)"),
                        WordToken("汉语", "Hàn yǔ", "Chinese language", "Kosakata HSK 2: 汉语 (Hàn yǔ)"),
                        WordToken("也", "yě", "even (extreme or unexpected case)", "Kosakata HSK 2: 也 (yě)"),
                        WordToken("能", "néng", "can / to be able to / might possibly", "Kosakata HSK 2: 能 (néng)"),
                        WordToken("在", "zài", "(of sb or sth) to be (located) at", "Kosakata HSK 2: 在 (zài)"),
                        WordToken("中国", "Zhōng guó", "China", "Kosakata HSK 2: 中国 (Zhōng guó)"),
                        WordToken("旅行", "lǚ xíng", "to travel", "Kosakata HSK 2: 旅行 (lǚ xíng)"),
                        WordToken("可是", "kě shì", "but; however", "Kosakata HSK 2: 可是 (kě shì)"),
                        WordToken("会", "huì", "can; to have the skill; to know how to", "Kosakata HSK 2: 会 (huì)"),
                        WordToken("汉语", "Hàn yǔ", "Chinese language", "Kosakata HSK 2: 汉语 (Hàn yǔ)"),
                        WordToken("可以", "kě yǐ", "can / may / possible / able to", "Kosakata HSK 2: 可以 (kě yǐ)"),
                        WordToken("和", "hé", "and; together with", "Kosakata HSK 2: 和 (hé)"),
                        WordToken("中国人", "Zhōng guó rén", "Chinese person", "Kosakata HSK 2: 中国人 (Zhōng guó rén)"),
                        WordToken("聊天", "liáo tiān", "to chat; to gossip", "Kosakata HSK 2: 聊天 (liáo tiān)"),
                        WordToken("了解", "liǎo jiě", "to understand / to realize / to find out", "Kosakata HSK 2: 了解 (liǎo jiě)"),
                        WordToken("中国", "Zhōng guó", "China", "Kosakata HSK 2: 中国 (Zhōng guó)"),
                        WordToken("文化", "wén huà", "culture / civilization", "Kosakata HSK 2: 文化 (wén huà)"),
                        WordToken("很", "hěn", "very; quite", "Kosakata HSK 2: 很 (hěn)"),
                        WordToken("喜欢", "xǐ huan", "to like; to be fond of", "Kosakata HSK 2: 喜欢 (xǐ huan)"),
                        WordToken("中国", "Zhōng guó", "China", "Kosakata HSK 2: 中国 (Zhōng guó)"),
                        WordToken("也", "yě", "also; too; as well; (not ...) either", "Kosakata HSK 2: 也 (yě)"),
                        WordToken("想", "xiǎng", "to desire; to want (to)", "Kosakata HSK 2: 想 (xiǎng)"),
                        WordToken("在", "zài", "(of sb or sth) to be (located) at", "Kosakata HSK 2: 在 (zài)"),
                        WordToken("中国", "Zhōng guó", "China", "Kosakata HSK 2: 中国 (Zhōng guó)"),
                        WordToken("工作", "gōng zuò", "to work / (of a machine) to operate", "Kosakata HSK 2: 工作 (gōng zuò)")
                    )
                )
            ),
            questions = listOf(
                StoryQuestion(
                    id = "q_whylrn_1",
                    questionText = "面对中国朋友关于“为何要学中文”的好奇询问，作者给出的最直接初衷是什么？ (Apa alasan pertama yang mendorong sang penulis tertarik mempelajari bahasa Mandarin?)",
                    options = listOf("为了通过高难度外语等级考试 (Demi lulus ujian sertifikasi bahasa asing tingkat tinggi)", "因为自己酷爱旅游，掌握汉语能够让在中国各地的旅行变得极其便利顺畅 (Karena gemar bertualang traveling, dan mahir bahasa Mandarin membuat perjalanan di Tiongkok sangat praktis)", "父母强制要求他必须学习中文 (Orang tuanya yang memaksa belajar Mandarin)", "为了到中国开一家西餐厅 (Demi membuka restoran barat di Tiongkok)"),
                    correctAnswerIndex = 1,
                    explanation = "Hobi jalan-jalan traveling ke berbagai penjuru Tiongkok menjadi motivasi awal belajar bahasa Mandarin."
                ),
                StoryQuestion(
                    id = "q_whylrn_2",
                    questionText = "作者认为即便现代翻译软件发达，亲自“会说汉语”相比于“不会汉语”具有什么不可替代的巨大优势？ (Keuntungan utama apa yang dirasakan jika bisa berbicara bahasa Mandarin dibanding hanya mengandalkan penerjemah?)",
                    options = listOf("买火车票可以享受五折优惠 (Bisa mendapat diskon tiket kereta 50%)", "能直接与中国老百姓谈天说地，深入体会源远流长的中华文化真谛 (Bisa mengobrol akrab langsung dengan warga lokal dan menyelami esensi kebudayaan Tiongkok)", "在餐厅吃饭不用排队 (Makan di restoran tidak perlu mengantre)", "可以免费入住所有高档酒店 (Bisa menginap gratis di hotel berbintang)"),
                    correctAnswerIndex = 1,
                    explanation = "Kemampuan bahasa membuka pintu interaksi emosional akrab dan pertukaran budaya yang autentik dengan masyarakat."
                ),
                StoryQuestion(
                    id = "q_whylrn_3",
                    questionText = "除了旅游观光与文化体验之外，作者学习中文还怀揣着怎样长远的职业抱负？ (Selain traveling dan budaya, cita-cita karier apa yang dimiliki penulis terkait bahasa Mandarin?)",
                    options = listOf("成为一名全职的跨国代购 (Menjadi perantara jastip barang belanjaan)", "非常渴望将来能够在中国长期工作与生活发展 (Sangat berhasrat kelak bisa bekerja dan berkarier jangka panjang di Tiongkok)", "回国当一名中文书法鉴赏家 (Pulang ke negara asal menjadi penilai kaligrafi)", "在国外教外国人做中国菜 (Mengajar kursus memasak masakan Tiongkok di luar negeri)"),
                    correctAnswerIndex = 1,
                    explanation = "Kecintaan mendalam pada negeri tirai bambu membuatnya ingin bekerja dan membangun masa depan di Tiongkok."
                ),
                StoryQuestion(
                    id = "q_whylrn_4",
                    questionText = "作者的语言学习动力模型最契合第二语言习得中的哪种健康心理机制？ (Konsep motivasi belajar bahasa apa yang tercermin dari sikap penulis?)",
                    options = listOf("纯粹工具性动机与被迫应试压力 (Motivasi instrumental kaku akibat tekanan ujian)", "融合理性实用与情感热爱的“综合型/融入型学习动机” (Motivasi integratif yang memadukan kebutuhan fungsional dengan kecintaan tulus pada budaya)", "盲目跟风的从众心理 (Ikut-ikutan tren secara membabi buta)", "对本国语言文化的厌弃 (Rasa bosan terhadap bahasa ibu sendiri)"),
                    correctAnswerIndex = 1,
                    explanation = "Motivasi integratif (cinta budaya, ingin berinteraksi, dan berbaur) terbukti menjadi faktor pendorong kelancaran berbahasa yang paling berkelanjutan."
                )
            )
        ),
        // Cerita Mandarin Bean 170 (HSK 2): Help Each Other (Saling Membantu Belajar)
        Story(
            id = "story_help_each_other",
            titleHanzi = "互相帮助",
            titlePinyin = "Hùxiāng Bāngzhù",
            titleTranslation = "Help Each Other (Saling Membantu Belajar)",
            level = "HSK 2",
            category = "Persahabatan & Bahasa",
            description = "Pertukaran bahasa yang saling menguntungkan antara mahasiswa asing dan teman lokal Tiongkok di kedai kopi kampus.",
            coverEmoji = "🤝",
            coverImageRes = R.drawable.cover_story_help_each_other,
            estimatedReadMinutes = 2,
            sentences = listOf(
                Sentence(
                    id = "s_hlpech_1",
                    hanzi = "我是一个留学生，在北京学习汉语。",
                    pinyin = "wǒ shì yī gè liú xué shēng zài Běi jīng xué xí Hàn yǔ",
                    translation = "Saya adalah seorang mahasiswa internasional (perantau asing) yang sedang menempuh studi bahasa Mandarin di Beijing.",
                    tokens = listOf(
                        WordToken("我", "wǒ", "I; me; my", "Kosakata HSK 2: 我 (wǒ)"),
                        WordToken("是", "shì", "to be (followed by substantives only)", "Kosakata HSK 2: 是 (shì)"),
                        WordToken("一", "yī", "one / single / a (article)", "Kosakata HSK 2: 一 (yī)"),
                        WordToken("个", "gè", "classifier for people or objects in general", "Kosakata HSK 2: 个 (gè)"),
                        WordToken("留学生", "liú xué shēng", "student studying abroad; returned student; foreign student; international student", "Kosakata HSK 2: 留学生 (liú xué shēng)"),
                        WordToken("在", "zài", "(of sb or sth) to be (located) at", "Kosakata HSK 2: 在 (zài)"),
                        WordToken("北京", "Běi jīng", "Beijing municipality, capital of the People's Republic of China", "Kosakata HSK 2: 北京 (Běi jīng)"),
                        WordToken("学习", "xué xí", "to learn / to study", "Kosakata HSK 2: 学习 (xué xí)"),
                        WordToken("汉语", "Hàn yǔ", "Chinese language", "Kosakata HSK 2: 汉语 (Hàn yǔ)")
                    )
                ),
                Sentence(
                    id = "s_hlpech_2",
                    hanzi = "现在我想找一份工作，不知道留学生可不可以打工。",
                    pinyin = "xiàn zài wǒ xiǎng zhǎo yī fèn gōng zuò bù zhī dào liú xué shēng kě bù kě yǐ dǎ gōng",
                    translation = "Sekarang saya berniat mencari pekerjaan sampingan, tetapi belum tahu pasti apakah mahasiswa asing diperbolehkan bekerja paruh waktu.",
                    tokens = listOf(
                        WordToken("现在", "xiàn zài", "now; at present; currently", "Kosakata HSK 2: 现在 (xiàn zài)"),
                        WordToken("我", "wǒ", "I; me; my", "Kosakata HSK 2: 我 (wǒ)"),
                        WordToken("想", "xiǎng", "to desire; to want (to)", "Kosakata HSK 2: 想 (xiǎng)"),
                        WordToken("找", "zhǎo", "to try to find / to look for / to call on sb / to find / to seek", "Kosakata HSK 2: 找 (zhǎo)"),
                        WordToken("一", "yī", "one / single / a (article)", "Kosakata HSK 2: 一 (yī)"),
                        WordToken("份", "fèn", "classifier for gifts, newspaper, magazine, papers, reports, contracts etc", "Kosakata HSK 2: 份 (fèn)"),
                        WordToken("工作", "gōng zuò", "job / work / task", "Kosakata HSK 2: 工作 (gōng zuò)"),
                        WordToken("不", "bù", "no; not so", "Kosakata HSK 2: 不 (bù)"),
                        WordToken("知道", "zhī dào", "to know; to become aware of", "Kosakata HSK 2: 知道 (zhī dào)"),
                        WordToken("留学生", "liú xué shēng", "student studying abroad; returned student; foreign student; international student", "Kosakata HSK 2: 留学生 (liú xué shēng)"),
                        WordToken("可", "kě", "(prefix) can; may; able to; -able", "Kosakata HSK 2: 可 (kě)"),
                        WordToken("不", "bù", "no; not so", "Kosakata HSK 2: 不 (bù)"),
                        WordToken("可以", "kě yǐ", "can / may / possible / able to", "Kosakata HSK 2: 可以 (kě yǐ)"),
                        WordToken("打工", "dǎ gōng", "to work a temporary or casual job / (of students) to have a job outside of class time, or during vacation", "Kosakata HSK 2: 打工 (dǎ gōng)")
                    )
                ),
                Sentence(
                    id = "s_hlpech_3",
                    hanzi = "我学过怎么教英语。",
                    pinyin = "wǒ xué guo zěn me jiāo Yīng yǔ",
                    translation = "Sebelumnya di negara asal saya pernah mempelajari metode mengajar bahasa Inggris.",
                    tokens = listOf(
                        WordToken("我", "wǒ", "I; me; my", "Kosakata HSK 2: 我 (wǒ)"),
                        WordToken("学", "xué", "to learn / to study / to imitate", "Kosakata HSK 2: 学 (xué)"),
                        WordToken("过", "guo", "(experienced action marker)", "Kosakata HSK 2: 过 (guo)"),
                        WordToken("怎么", "zěn me", "how? / what? / why?", "Kosakata HSK 2: 怎么 (zěn me)"),
                        WordToken("教", "jiāo", "to teach; to instruct", "Kosakata HSK 2: 教 (jiāo)"),
                        WordToken("英语", "Yīng yǔ", "English (language)", "Kosakata HSK 2: 英语 (Yīng yǔ)")
                    )
                ),
                Sentence(
                    id = "s_hlpech_4",
                    hanzi = "所以我的朋友说，可以找一个中国学生，我教他英语，他教我汉语。",
                    pinyin = "suǒ yǐ wǒ de péng you shuō kě yǐ zhǎo yī gè Zhōng guó xué shēng wǒ jiāo tā Yīng yǔ tā jiāo wǒ Hàn yǔ",
                    translation = "Oleh karena itu temanku menyarankan agar mencari mitra mahasiswa lokal Tiongkok: saya mengajarkannya bahasa Inggris, dan ia mengajarkan saya percakapan bahasa Mandarin.",
                    tokens = listOf(
                        WordToken("所以", "suǒ yǐ", "therefore / as a result / so", "Kosakata HSK 2: 所以 (suǒ yǐ)"),
                        WordToken("我的", "wǒ de", "my; mine", "Kosakata HSK 2: 我的 (wǒ de)"),
                        WordToken("朋友", "péng you", "friend", "Kosakata HSK 2: 朋友 (péng you)"),
                        WordToken("说", "shuō", "to speak; to talk; to say", "Kosakata HSK 2: 说 (shuō)"),
                        WordToken("可以", "kě yǐ", "can / may / possible / able to", "Kosakata HSK 2: 可以 (kě yǐ)"),
                        WordToken("找", "zhǎo", "to try to find / to look for / to call on sb / to find / to seek", "Kosakata HSK 2: 找 (zhǎo)"),
                        WordToken("一", "yī", "one / single / a (article)", "Kosakata HSK 2: 一 (yī)"),
                        WordToken("个", "gè", "classifier for people or objects in general", "Kosakata HSK 2: 个 (gè)"),
                        WordToken("中国", "Zhōng guó", "China", "Kosakata HSK 2: 中国 (Zhōng guó)"),
                        WordToken("学生", "xué shēng", "student / schoolchild", "Kosakata HSK 2: 学生 (xué shēng)"),
                        WordToken("我", "wǒ", "I; me; my", "Kosakata HSK 2: 我 (wǒ)"),
                        WordToken("教", "jiāo", "to teach; to instruct", "Kosakata HSK 2: 教 (jiāo)"),
                        WordToken("他", "tā", "he; him; his", "Kosakata HSK 2: 他 (tā)"),
                        WordToken("英语", "Yīng yǔ", "English (language)", "Kosakata HSK 2: 英语 (Yīng yǔ)"),
                        WordToken("他", "tā", "he; him; his", "Kosakata HSK 2: 他 (tā)"),
                        WordToken("教", "jiāo", "to teach; to instruct", "Kosakata HSK 2: 教 (jiāo)"),
                        WordToken("我", "wǒ", "I; me; my", "Kosakata HSK 2: 我 (wǒ)"),
                        WordToken("汉语", "Hàn yǔ", "Chinese language", "Kosakata HSK 2: 汉语 (Hàn yǔ)")
                    )
                ),
                Sentence(
                    id = "s_hlpech_5",
                    hanzi = "我们可以互相帮助，还可以认识新的朋友。",
                    pinyin = "wǒ men kě yǐ hù xiāng bāng zhù hái kě yǐ rèn shi xīn de péng you",
                    translation = "Dengan metode tandem ini kami bisa saling membantu belajar bahasa secara gratis, sekaligus memperluas jaringan pertemanan baru.",
                    tokens = listOf(
                        WordToken("我们", "wǒ men", "we; us; ourselves; our", "Kosakata HSK 2: 我们 (wǒ men)"),
                        WordToken("可以", "kě yǐ", "can / may / possible / able to", "Kosakata HSK 2: 可以 (kě yǐ)"),
                        WordToken("互相", "hù xiāng", "each other / mutually", "Kosakata HSK 2: 互相 (hù xiāng)"),
                        WordToken("帮助", "bāng zhù", "to help; to assist", "Kosakata HSK 2: 帮助 (bāng zhù)"),
                        WordToken("还", "hái", "in addition, also, else, even", "Kosakata HSK 2: 还 (hái)"),
                        WordToken("可以", "kě yǐ", "can / may / possible / able to", "Kosakata HSK 2: 可以 (kě yǐ)"),
                        WordToken("认识", "rèn shi", "to know / to recognize / to be familiar with / to get acquainted with sb", "Kosakata HSK 2: 认识 (rèn shi)"),
                        WordToken("新", "xīn", "new; newly", "Kosakata HSK 2: 新 (xīn)"),
                        WordToken("的", "de", "possessive particle (of; 's) / modifying particle (used after an attribute to modify a noun or to form a nominal expression)", "Kosakata HSK 2: 的 (de)"),
                        WordToken("朋友", "péng you", "friend", "Kosakata HSK 2: 朋友 (péng you)")
                    )
                ),
                Sentence(
                    id = "s_hlpech_6",
                    hanzi = "我觉得这个主意非常好。",
                    pinyin = "wǒ jué de zhè gè zhǔ yi fēi cháng hǎo",
                    translation = "Menurut saya ide pertukaran belajar ini benar-benar luar biasa cemerlang.",
                    tokens = listOf(
                        WordToken("我", "wǒ", "I; me; my", "Kosakata HSK 2: 我 (wǒ)"),
                        WordToken("觉得", "jué de", "to think that ...; to feel that ...", "Kosakata HSK 2: 觉得 (jué de)"),
                        WordToken("这", "zhè", "this; these", "Kosakata HSK 2: 这 (zhè)"),
                        WordToken("个", "gè", "classifier for people or objects in general", "Kosakata HSK 2: 个 (gè)"),
                        WordToken("主意", "zhǔ yi", "plan / idea / decision", "Kosakata HSK 2: 主意 (zhǔ yi)"),
                        WordToken("非常", "fēi cháng", "very; really", "Kosakata HSK 2: 非常 (fēi cháng)"),
                        WordToken("好", "hǎo", "good / appropriate; proper", "Kosakata HSK 2: 好 (hǎo)")
                    )
                )
            ),
            questions = listOf(
                StoryQuestion(
                    id = "q_hlpech_1",
                    questionText = "在北京留学的主人公在想要找工作时，遇到了什么法律与政策上的困惑？ (Kebingungan regulasi apa yang dialami sang mahasiswa asing saat ingin mencari pekerjaan di Beijing?)",
                    options = listOf("不知道自己的汉语水平能否通过面试 (Tidak yakin apakah kemampuan bahasanya lolos wawancara)", "不确定国家政策法规是否允许在读外国留学生合法勤工俭学 (Belum yakin apakah regulasi memperbolehkan mahasiswa internasional bekerja paruh waktu)", "找不到任何招聘兼职的网站 (Tidak menemukan lowongan kerja paruh waktu)", "学校禁止学生在校外租房 (Kampus melarang mahasiswa tinggal di luar asrama)"),
                    correctAnswerIndex = 1,
                    explanation = "Kekhawatiran tentang izin kerja sampingan (part-time) legal bagi pemegang visa pelajar di Tiongkok."
                ),
                StoryQuestion(
                    id = "q_hlpech_2",
                    questionText = "主人公自身拥有一项怎样的专业特长，成为他解决语言学习与交流的最佳资本？ (Keahlian apa yang dimiliki sang mahasiswa perantau yang bisa dimanfaatkan sebagai modal?)",
                    options = listOf("拥有高超的中国书法技巧 (Mahir seni kaligrafi Tiongkok)", "曾在本国系统学习过专业英语教学法与辅导经验 (Pernah mempelajari metode pengajaran bahasa Inggris secara profesional)", "精通专业厨师中西餐烹饪 (Ahli memasak hidangan ala chef)", "擅长修理各种电脑硬件设备 (Jago mereparasi perangkat keras komputer)"),
                    correctAnswerIndex = 1,
                    explanation = "Latar belakang pengalaman mengajar bahasa Inggris memberikannya modal berharga untuk program tandem bahasa."
                ),
                StoryQuestion(
                    id = "q_hlpech_3",
                    questionText = "朋友为他量身打造的“互帮互助”双赢学习方案具体是如何运作的？ (Bagaimana skema solusi 'saling membantu' yang disarankan sahabatnya berjalan?)",
                    options = listOf("去培训机构打黑工当代课老师 (Bekerja gelap di tempat bimbingan belajar)", "结对一名中国大学生：自己教对方地道英语，对方教自己地道汉语交流 (Bermitra dengan mahasiswa lokal: ia mengajar bahasa Inggris, dan temannya mengajari bahasa Mandarin)", "让中国同学替他做所有的课程作业 (Menyuruh mahasiswa lokal mengerjakan tugas kuliahnya)", "一起合伙在大学城开奶茶店 (Membuka usaha kedai teh boba bersama di kampus)"),
                    correctAnswerIndex = 1,
                    explanation = "Pertukaran bahasa tandem (Language Exchange): metode saling bertukar keahlian bahasa ibu masing-masing secara cuma-cuma."
                ),
                StoryQuestion(
                    id = "q_hlpech_4",
                    questionText = "主人公对这个“语言交换”方案给予极高评价的核心原因是什么？ (Alasan utama apa yang membuat narator sangat menyetujui ide tandem bahasa tersebut?)",
                    options = listOf("每月能拿到数万元的高额薪水 (Bisa menghasilkan puluhan ribu yuan per bulan)", "既能零成本提升汉语实战水平，又能结识志同道合的本土挚友 (Dapat memperlancar bahasa Mandarin gratis sekaligus menjalin persahabatan sejati dengan warga lokal)", "从此不用再去大学上正课了 (Tidak perlu lagi masuk kelas kuliah formal)", "可以在图书馆拥有专属自习座位 (Mendapat jatah meja khusus di perpustakaan)"),
                    correctAnswerIndex = 1,
                    explanation = "Keuntungan ganda: peningkatan kemampuan percakapan autentik sekaligus perluasan relasi sosial di negeri rantau."
                )
            )
        ),
        // Cerita Mandarin Bean 171 (HSK 2): Fruits (Buah-buahan Segar)
        Story(
            id = "story_fruits",
            titleHanzi = "水果",
            titlePinyin = "Shuǐguǒ",
            titleTranslation = "Fruits (Buah-buahan Segar)",
            level = "HSK 2",
            category = "Kesehatan & Nutrisi",
            description = "Mengenal aneka ragam buah-buahan favorit di pasar tradisional Tiongkok serta manfaat kesehatannya bagi tubuh.",
            coverEmoji = "🍎",
            coverImageRes = R.drawable.cover_story_fruits,
            estimatedReadMinutes = 2,
            sentences = listOf(
                Sentence(
                    id = "s_fruits_1",
                    hanzi = "妹妹喜欢吃水果。",
                    pinyin = "mèi mei xǐ huan chī shuǐ guǒ",
                    translation = "Adik perempuanku sangat suka menikmati aneka buah-buahan segar.",
                    tokens = listOf(
                        WordToken("妹妹", "mèi mei", "younger sister / young woman", "Kosakata HSK 2: 妹妹 (mèi mei)"),
                        WordToken("喜欢", "xǐ huan", "to like; to be fond of", "Kosakata HSK 2: 喜欢 (xǐ huan)"),
                        WordToken("吃", "chī", "to eat; to consume / to eat at", "Kosakata HSK 2: 吃 (chī)"),
                        WordToken("水果", "shuǐ guǒ", "fruit", "Kosakata HSK 2: 水果 (shuǐ guǒ)")
                    )
                ),
                Sentence(
                    id = "s_fruits_2",
                    hanzi = "她的生日快到了，哥哥和姐姐一起去山上找好吃的水果给妹妹。",
                    pinyin = "tā de shēng rì kuài dào le gē ge hé jiě jie yī qǐ qù shān shàng zhǎo hǎo chī de shuǐ guǒ gěi mèi mei",
                    translation = "Menjelang hari ulang tahunnya yang kian dekat, kakak laki-laki dan kakak perempuannya pergi bersama mendaki bukit mencari buah-buahan lezat di alam untuk hadiah sang adik.",
                    tokens = listOf(
                        WordToken("她", "tā", "she", "Kosakata HSK 2: 她 (tā)"),
                        WordToken("的", "de", "possessive particle (of; 's) / modifying particle (used after an attribute to modify a noun or to form a nominal expression)", "Kosakata HSK 2: 的 (de)"),
                        WordToken("生日", "shēng rì", "birthday", "Kosakata HSK 2: 生日 (shēng rì)"),
                        WordToken("快", "kuài", "soon / almost", "Kosakata HSK 2: 快 (kuài)"),
                        WordToken("到", "dào", "to reach; to arrive / to (a place); until (a time); up to (a point) / (verb complement indicating arriving at a place or reaching a point)", "Kosakata HSK 2: 到 (dào)"),
                        WordToken("了", "le", "(completed action marker) / (modal particle indicating change of state, situation now)", "Kosakata HSK 2: 了 (le)"),
                        WordToken("哥哥", "gē ge", "older brother", "Kosakata HSK 2: 哥哥 (gē ge)"),
                        WordToken("和", "hé", "and; together with", "Kosakata HSK 2: 和 (hé)"),
                        WordToken("姐姐", "jiě jie", "older sister", "Kosakata HSK 2: 姐姐 (jiě jie)"),
                        WordToken("一起", "yī qǐ", "together; in company (with)", "Kosakata HSK 2: 一起 (yī qǐ)"),
                        WordToken("去", "qù", "to go, to go to", "Kosakata HSK 2: 去 (qù)"),
                        WordToken("山上", "shān shàng", "on the mountain; on the hill", "Kosakata HSK 2: 山上 (shān shàng)"),
                        WordToken("找", "zhǎo", "to try to find / to look for / to call on sb / to find / to seek", "Kosakata HSK 2: 找 (zhǎo)"),
                        WordToken("好吃", "hǎo chī", "tasty; delicious", "Kosakata HSK 2: 好吃 (hǎo chī)"),
                        WordToken("的", "de", "possessive particle (of; 's) / modifying particle (used after an attribute to modify a noun or to form a nominal expression)", "Kosakata HSK 2: 的 (de)"),
                        WordToken("水果", "shuǐ guǒ", "fruit", "Kosakata HSK 2: 水果 (shuǐ guǒ)"),
                        WordToken("给", "gěi", "to / for / for the benefit of / to do sth (for sb)", "Kosakata HSK 2: 给 (gěi)"),
                        WordToken("妹妹", "mèi mei", "younger sister / young woman", "Kosakata HSK 2: 妹妹 (mèi mei)")
                    )
                ),
                Sentence(
                    id = "s_fruits_3",
                    hanzi = "一个小时以后，姐姐找到了很多水果，哥哥只有一个水果。",
                    pinyin = "yī gè xiǎo shí yǐ hòu jiě jie zhǎo dào le hěn duō shuǐ guǒ gē ge zhǐ yǒu yī gè shuǐ guǒ",
                    translation = "Satu jam kemudian, kakak perempuan berhasil memetik sangat banyak buah, sedangkan kakak laki-laki hanya membawa satu buah saja.",
                    tokens = listOf(
                        WordToken("一", "yī", "one / single / a (article)", "Kosakata HSK 2: 一 (yī)"),
                        WordToken("个", "gè", "classifier for people or objects in general", "Kosakata HSK 2: 个 (gè)"),
                        WordToken("小时", "xiǎo shí", "hour", "Kosakata HSK 2: 小时 (xiǎo shí)"),
                        WordToken("以后", "yǐ hòu", "after / later / afterwards / following / later on / in the future", "Kosakata HSK 2: 以后 (yǐ hòu)"),
                        WordToken("姐姐", "jiě jie", "older sister", "Kosakata HSK 2: 姐姐 (jiě jie)"),
                        WordToken("找到", "zhǎo dào", "to find", "Kosakata HSK 2: 找到 (zhǎo dào)"),
                        WordToken("了", "le", "(completed action marker) / (modal particle indicating change of state, situation now)", "Kosakata HSK 2: 了 (le)"),
                        WordToken("很多", "hěn duō", "many; a lot of", "Kosakata HSK 2: 很多 (hěn duō)"),
                        WordToken("水果", "shuǐ guǒ", "fruit", "Kosakata HSK 2: 水果 (shuǐ guǒ)"),
                        WordToken("哥哥", "gē ge", "older brother", "Kosakata HSK 2: 哥哥 (gē ge)"),
                        WordToken("只", "zhǐ", "only; merely; just", "Kosakata HSK 2: 只 (zhǐ)"),
                        WordToken("有", "yǒu", "to have; there is", "Kosakata HSK 2: 有 (yǒu)"),
                        WordToken("一", "yī", "one / single / a (article)", "Kosakata HSK 2: 一 (yī)"),
                        WordToken("个", "gè", "classifier for people or objects in general", "Kosakata HSK 2: 个 (gè)"),
                        WordToken("水果", "shuǐ guǒ", "fruit", "Kosakata HSK 2: 水果 (shuǐ guǒ)")
                    )
                ),
                Sentence(
                    id = "s_fruits_4",
                    hanzi = "姐姐问哥哥：你怎么只找到一个？",
                    pinyin = "jiě jie wèn gē ge nǐ zěn me zhǐ zhǎo dào yī gè",
                    translation = "Kakak perempuan bertanya heran: “Mengapa kamu cuma memetik satu buah saja?”",
                    tokens = listOf(
                        WordToken("姐姐", "jiě jie", "older sister", "Kosakata HSK 2: 姐姐 (jiě jie)"),
                        WordToken("问", "wèn", "to ask; to inquire", "Kosakata HSK 2: 问 (wèn)"),
                        WordToken("哥哥", "gē ge", "older brother", "Kosakata HSK 2: 哥哥 (gē ge)"),
                        WordToken("你", "nǐ", "you", "Kosakata HSK 2: 你 (nǐ)"),
                        WordToken("怎么", "zěn me", "how? / what? / why?", "Kosakata HSK 2: 怎么 (zěn me)"),
                        WordToken("只", "zhǐ", "only; merely; just", "Kosakata HSK 2: 只 (zhǐ)"),
                        WordToken("找到", "zhǎo dào", "to find", "Kosakata HSK 2: 找到 (zhǎo dào)"),
                        WordToken("一", "yī", "one / single / a (article)", "Kosakata HSK 2: 一 (yī)"),
                        WordToken("个", "gè", "classifier for people or objects in general", "Kosakata HSK 2: 个 (gè)")
                    )
                ),
                Sentence(
                    id = "s_fruits_5",
                    hanzi = "哥哥说：好吃的水果很多，但我只要一个最好吃的就可以了。",
                    pinyin = "gē ge shuō hǎo chī de shuǐ guǒ hěn duō dàn wǒ zhǐ yào yī gè zuì hǎo chī de jiù kě yǐ le",
                    translation = "Kakak laki-laki tersenyum bijak menjawab: “Buah yang enak di bukit ini memang sangat banyak, namun bagiku cukup memilih satu buah yang paling ranum dan paling manis saja.”",
                    tokens = listOf(
                        WordToken("哥哥", "gē ge", "older brother", "Kosakata HSK 2: 哥哥 (gē ge)"),
                        WordToken("说", "shuō", "to speak; to talk; to say", "Kosakata HSK 2: 说 (shuō)"),
                        WordToken("好吃", "hǎo chī", "tasty; delicious", "Kosakata HSK 2: 好吃 (hǎo chī)"),
                        WordToken("的", "de", "possessive particle (of; 's) / modifying particle (used after an attribute to modify a noun or to form a nominal expression)", "Kosakata HSK 2: 的 (de)"),
                        WordToken("水果", "shuǐ guǒ", "fruit", "Kosakata HSK 2: 水果 (shuǐ guǒ)"),
                        WordToken("很多", "hěn duō", "many; a lot of", "Kosakata HSK 2: 很多 (hěn duō)"),
                        WordToken("但", "dàn", "but; yet; however; still", "Kosakata HSK 2: 但 (dàn)"),
                        WordToken("我", "wǒ", "I; me; my", "Kosakata HSK 2: 我 (wǒ)"),
                        WordToken("只", "zhǐ", "only; merely; just", "Kosakata HSK 2: 只 (zhǐ)"),
                        WordToken("要", "yào", "to want; to need; to ask for", "Kosakata HSK 2: 要 (yào)"),
                        WordToken("一", "yī", "one / single / a (article)", "Kosakata HSK 2: 一 (yī)"),
                        WordToken("个", "gè", "classifier for people or objects in general", "Kosakata HSK 2: 个 (gè)"),
                        WordToken("最", "zuì", "(before an adjective or verb) to the highest degree; (the) most ...; -est", "Kosakata HSK 2: 最 (zuì)"),
                        WordToken("好吃", "hǎo chī", "tasty; delicious", "Kosakata HSK 2: 好吃 (hǎo chī)"),
                        WordToken("的", "de", "possessive particle (of; 's) / modifying particle (used after an attribute to modify a noun or to form a nominal expression)", "Kosakata HSK 2: 的 (de)"),
                        WordToken("就", "jiù", "merely; nothing else but; simply; just; precisely; exactly", "Kosakata HSK 2: 就 (jiù)"),
                        WordToken("可以", "kě yǐ", "can / may / possible / able to", "Kosakata HSK 2: 可以 (kě yǐ)"),
                        WordToken("了", "le", "(completed action marker) / (modal particle indicating change of state, situation now)", "Kosakata HSK 2: 了 (le)")
                    )
                ),
                Sentence(
                    id = "s_fruits_6",
                    hanzi = "姐姐笑哥哥说：那么多好吃的水果，你都不要。",
                    pinyin = "jiě jie xiào gē ge shuō nà me duō hǎo chī de shuǐ guǒ nǐ dōu bù yào",
                    translation = "Kakak perempuan menertawakannya: “Buah manis melimpah ruah kok malah kamu abaikan!”",
                    tokens = listOf(
                        WordToken("姐姐", "jiě jie", "older sister", "Kosakata HSK 2: 姐姐 (jiě jie)"),
                        WordToken("笑", "xiào", "to laugh at", "Kosakata HSK 2: 笑 (xiào)"),
                        WordToken("哥哥", "gē ge", "older brother", "Kosakata HSK 2: 哥哥 (gē ge)"),
                        WordToken("说", "shuō", "to speak; to talk; to say", "Kosakata HSK 2: 说 (shuō)"),
                        WordToken("那么", "nà me", "like that; in that way; to that extent", "Kosakata HSK 2: 那么 (nà me)"),
                        WordToken("多", "duō", "many; much; more; a lot of", "Kosakata HSK 2: 多 (duō)"),
                        WordToken("好吃", "hǎo chī", "tasty; delicious", "Kosakata HSK 2: 好吃 (hǎo chī)"),
                        WordToken("的", "de", "possessive particle (of; 's) / modifying particle (used after an attribute to modify a noun or to form a nominal expression)", "Kosakata HSK 2: 的 (de)"),
                        WordToken("水果", "shuǐ guǒ", "fruit", "Kosakata HSK 2: 水果 (shuǐ guǒ)"),
                        WordToken("你", "nǐ", "you", "Kosakata HSK 2: 你 (nǐ)"),
                        WordToken("都", "dōu", "all; both; entirely", "Kosakata HSK 2: 都 (dōu)"),
                        WordToken("不", "bù", "no; not so", "Kosakata HSK 2: 不 (bù)"),
                        WordToken("要", "yào", "to want; to need; to ask for", "Kosakata HSK 2: 要 (yào)")
                    )
                ),
                Sentence(
                    id = "s_fruits_7",
                    hanzi = "可是，下山的路上，姐姐觉得水果太多太重了，得拿一些水果出来。",
                    pinyin = "kě shì xià shān de lù shang jiě jie jué de shuǐ guǒ tài duō tài zhòng le děi ná yī xiē shuǐ guǒ chu lai",
                    translation = "Namun di tengah perjalanan terjal menuruni bukit, kakak perempuan merasa keranjangnya teramat berat dan melelahkan, sehingga terpaksa membuang buah-buahnya satu per satu di jalan.",
                    tokens = listOf(
                        WordToken("可是", "kě shì", "but; however", "Kosakata HSK 2: 可是 (kě shì)"),
                        WordToken("下山", "xià shān", "to go down a hill / (of the sun or moon) to set", "Kosakata HSK 2: 下山 (xià shān)"),
                        WordToken("的", "de", "possessive particle (of; 's) / modifying particle (used after an attribute to modify a noun or to form a nominal expression)", "Kosakata HSK 2: 的 (de)"),
                        WordToken("路上", "lù shang", "on the way; en route", "Kosakata HSK 2: 路上 (lù shang)"),
                        WordToken("姐姐", "jiě jie", "older sister", "Kosakata HSK 2: 姐姐 (jiě jie)"),
                        WordToken("觉得", "jué de", "to think that ...; to feel that ...", "Kosakata HSK 2: 觉得 (jué de)"),
                        WordToken("水果", "shuǐ guǒ", "fruit", "Kosakata HSK 2: 水果 (shuǐ guǒ)"),
                        WordToken("太", "tài", "too (much) / very / extremely", "Kosakata HSK 2: 太 (tài)"),
                        WordToken("多", "duō", "too many; in excess", "Kosakata HSK 2: 多 (duō)"),
                        WordToken("太", "tài", "too (much) / very / extremely", "Kosakata HSK 2: 太 (tài)"),
                        WordToken("重", "zhòng", "heavy / serious", "Kosakata HSK 2: 重 (zhòng)"),
                        WordToken("了", "le", "(completed action marker) / (modal particle indicating change of state, situation now)", "Kosakata HSK 2: 了 (le)"),
                        WordToken("得", "děi", "to have to / to need to", "Kosakata HSK 2: 得 (děi)"),
                        WordToken("拿", "ná", "to hold / to seize / to catch / to apprehend / to take", "Kosakata HSK 2: 拿 (ná)"),
                        WordToken("一些", "yī xiē", "some; a few; a little; (following an adjective) slightly ...er", "Kosakata HSK 2: 一些 (yī xiē)"),
                        WordToken("水果", "shuǐ guǒ", "fruit", "Kosakata HSK 2: 水果 (shuǐ guǒ)"),
                        WordToken("出来", "chu lai", "(after a verb, indicates coming out, completion of an action, or ability to discern or detect)", "Kosakata HSK 2: 出来 (chu lai)")
                    )
                ),
                Sentence(
                    id = "s_fruits_8",
                    hanzi = "最后，回到家，姐姐也只有一个水果了。",
                    pinyin = "zuì hòu huí dào jiā jiě jie yě zhǐ yǒu yī gè shuǐ guǒ le",
                    translation = "Pada akhirnya setibanya di rumah, kakak perempuan ternyata juga hanya tersisa membawa satu buah saja!",
                    tokens = listOf(
                        WordToken("最后", "zuì hòu", "finally; in the end", "Kosakata HSK 2: 最后 (zuì hòu)"),
                        WordToken("回", "huí", "to go back / to turn around / to answer / to return", "Kosakata HSK 2: 回 (huí)"),
                        WordToken("到", "dào", "to reach; to arrive / to (a place); until (a time); up to (a point) / (verb complement indicating arriving at a place or reaching a point)", "Kosakata HSK 2: 到 (dào)"),
                        WordToken("家", "jiā", "home / family / (polite) my (sister, uncle etc)", "Kosakata HSK 2: 家 (jiā)"),
                        WordToken("姐姐", "jiě jie", "older sister", "Kosakata HSK 2: 姐姐 (jiě jie)"),
                        WordToken("也", "yě", "also; too; as well; (not ...) either", "Kosakata HSK 2: 也 (yě)"),
                        WordToken("只", "zhǐ", "only; merely; just", "Kosakata HSK 2: 只 (zhǐ)"),
                        WordToken("有", "yǒu", "to have; there is", "Kosakata HSK 2: 有 (yǒu)"),
                        WordToken("一", "yī", "one / single / a (article)", "Kosakata HSK 2: 一 (yī)"),
                        WordToken("个", "gè", "classifier for people or objects in general", "Kosakata HSK 2: 个 (gè)"),
                        WordToken("水果", "shuǐ guǒ", "fruit", "Kosakata HSK 2: 水果 (shuǐ guǒ)"),
                        WordToken("了", "le", "(completed action marker) / (modal particle indicating change of state, situation now)", "Kosakata HSK 2: 了 (le)")
                    )
                )
            ),
            questions = listOf(
                StoryQuestion(
                    id = "q_fruits_1",
                    questionText = "哥哥和姐姐为了给即将过生日的小妹妹准备礼物，特意跑到哪里去采摘水果？ (Ke manakah kakak laki-laki dan perempuan pergi memetik buah untuk hadiah ulang tahun adik mereka?)",
                    options = listOf("去市中心最昂贵的精品水果进口超市 (Ke supermarket buah impor termewah di pusat kota)", "结伴一起爬到野外硕果累累的山上去寻找最甜美的野果 (Pergi bersama mendaki bukit di alam bebas mencari buah-buahan segar yang manis)", "在自家庭院的果园里采摘 (Memetik di kebun buah halaman rumah sendiri)", "向邻居果农家购买整箱苹果 (Membeli sekotak buah apel dari tetangga petani)"),
                    correctAnswerIndex = 1,
                    explanation = "Kedua kakak pergi menjelajahi bukit demi memetik buah segar terbaik dari alam sebagai kado ulang tahun sang adik."
                ),
                StoryQuestion(
                    id = "q_fruits_2",
                    questionText = "一小时后当姐姐采了满满一大筐水果时，哥哥手中却只有几颗水果？ (Berapa banyak buah yang diperoleh sang kakak laki-laki setelah satu jam mencari?)",
                    options = listOf("足足采摘了三大箱 (Berhasil memetik tiga peti penuh)", "仅仅只有一颗精心挑选的果子 (Hanya membawa satu buah terbaik saja)", "两手空空什么也没找到 (Pulang dengan tangan hampa tanpa buah)", "口袋里装了二十多颗 (Mengantongi dua puluh butir buah)"),
                    correctAnswerIndex = 1,
                    explanation = "Berbeda dengan keranjang saudari perempuannya yang penuh, kakak laki-laki hanya memetik satu buah pilihan."
                ),
                StoryQuestion(
                    id = "q_fruits_3",
                    questionText = "面对姐姐的嘲笑，哥哥道出了怎样崇尚“少而精”的处世智慧？ (Filosofi apa yang diutarakan sang kakak laki-laki menanggapi ejekan saudari perempuannya?)",
                    options = listOf("他自己太懒惰不想弯腰采摘 (Dirinya terlalu malas untuk membungkuk memetik)", "山上好吃的果子固然很多，但只要挑出一颗最甜最完美的就足够了 (Buah enak memang melimpah, namun cukup memilih satu yang paling sempurna dan paling lezat)", "他在山上睡着了耽误了时间 (Ia tertidur di atas bukit sehingga kehabisan waktu)", "他害怕果树上有毛毛虫 (Ia takut ada ulat bulu di pohon buah)"),
                    correctAnswerIndex = 1,
                    explanation = "Prinsip mutu di atas kuantitas: daripada serakah mengumpulkan banyak, lebih baik fokus pada satu kualitas terbaik."
                ),
                StoryQuestion(
                    id = "q_fruits_4",
                    questionText = "在险峻的下山路途中发生的事情，如何以滑稽的方式验证了哥哥的先见之明？ (Bagaimana peristiwa di jalan turun bukit membuktikan kebenaran pandangan sang kakak?)",
                    options = listOf("姐姐的水果在路上全部烂掉了 (Semua buah milik saudari perempuannya membusuk di jalan)", "因为水果太多太沉重走不动路，姐姐不得不一路丢弃，最后到家也只剩下一颗果子！ (Karena muatan terlalu berat, saudari terpaksa membuang buahnya satu per satu hingga di rumah cuma tersisa satu butir!)", "哥哥的果子被山上的猴子抢走了 (Buah milik kakak direbut monyet bukit)", "姐姐在半路上被果筐绊倒骨折了 (Saudari tersandung keranjang buahnya sendiri)"),
                    correctAnswerIndex = 1,
                    explanation = "Keserakahan membawa beban sia-sia: setelah lelah memikul beban berat, ujung-ujungnya sisa buah yang dibawa pulang sama persis dengan kakaknya!"
                )
            )
        ),
        // Cerita Mandarin Bean 172 (HSK 2): Blind and Lantern (Orang Buta dan Lampion)
        Story(
            id = "story_blind_and_lantern",
            titleHanzi = "盲人和灯笼",
            titlePinyin = "Mángrén Hé Dēnglong",
            titleTranslation = "Blind and Lantern (Orang Buta dan Lampion)",
            level = "HSK 2",
            category = "Filsafat & Kebajikan",
            description = "Kisah inspiratif tentang orang buta yang berjalan di malam hari membawa lampion menyala, bukan untuk dirinya sendiri melainkan agar orang lain tidak menabraknya.",
            coverEmoji = "🏮",
            coverImageRes = R.drawable.cover_story_blind_and_lantern,
            estimatedReadMinutes = 2,
            sentences = listOf(
                Sentence(
                    id = "s_bldlnt_1",
                    hanzi = "在还没有灯的时候，人们晚上都会点灯笼照路。",
                    pinyin = "zài hái méi yǒu dēng de shí hou rén men wǎn shang dōu huì diǎn dēng long zhào lù",
                    translation = "Pada zaman dahulu sebelum ditemukannya lampu listrik, orang-orang di malam hari selalu menyalakan lampion lilin untuk menerangi jalanan yang gelap gulita.",
                    tokens = listOf(
                        WordToken("在", "zài", "(of sb or sth) to be (located) at", "Kosakata HSK 2: 在 (zài)"),
                        WordToken("还", "hái", "still, still in progress, yet", "Kosakata HSK 2: 还 (hái)"),
                        WordToken("没有", "méi yǒu", "doesn't exist / to not be", "Kosakata HSK 2: 没有 (méi yǒu)"),
                        WordToken("灯", "dēng", "lamp / light / lantern", "Kosakata HSK 2: 灯 (dēng)"),
                        WordToken("的", "de", "possessive particle (of; 's) / modifying particle (used after an attribute to modify a noun or to form a nominal expression)", "Kosakata HSK 2: 的 (de)"),
                        WordToken("时候", "shí hou", "time / length of time / moment / period", "Kosakata HSK 2: 时候 (shí hou)"),
                        WordToken("人们", "rén men", "people", "Kosakata HSK 2: 人们 (rén men)"),
                        WordToken("晚上", "wǎn shang", "in the evening", "Kosakata HSK 2: 晚上 (wǎn shang)"),
                        WordToken("都", "dōu", "all; both; entirely", "Kosakata HSK 2: 都 (dōu)"),
                        WordToken("会", "huì", "to be likely to; to be sure to", "Kosakata HSK 2: 会 (huì)"),
                        WordToken("点", "diǎn", "to touch briefly; to tap / to mark with a dot; to check off (on a list) / to order (food etc); to select / to mention; to bring up (a topic or person) / to hint at; to imply / to administer (eye medicine etc) in drops / to light (a fire, a lamp etc); to ignite / to nod (one's head) in agreement; to beckon by moving (one's hand) up and down", "Kosakata HSK 2: 点 (diǎn)"),
                        WordToken("灯笼", "dēng long", "lantern", "Kosakata HSK 2: 灯笼 (dēng long)"),
                        WordToken("照", "zhào", "to shine / to illuminate / to reflect / to look at (one's reflection) / to take (a photo)", "Kosakata HSK 2: 照 (zhào)"),
                        WordToken("路", "lù", "road / journey / route / line (bus etc) / sort; kind", "Kosakata HSK 2: 路 (lù)")
                    )
                ),
                Sentence(
                    id = "s_bldlnt_2",
                    hanzi = "有一天，一个盲人到朋友家做客，天黑后，他的朋友为他点了个灯笼，说：“天晚了，路黑，你打个灯笼回家吧!”",
                    pinyin = "yǒu yī tiān yī gè máng rén dào péng you jiā zuò kè tiān hēi hòu tā de péng you wèi tā diǎn le gè dēng long shuō tiān wǎn le lù hēi nǐ dǎ gè dēng long huí jiā ba",
                    translation = "Suatu hari, seorang tunanetra bertamu ke rumah sahabatnya; setelah malam larut, sang sahabat menyalakan sebuah lampion dan berpesan: “Hari sudah larut dan jalanan gelap, bawalah lampion ini untuk menerangi jalan pulangmu!”",
                    tokens = listOf(
                        WordToken("有", "yǒu", "to have; there is", "Kosakata HSK 2: 有 (yǒu)"),
                        WordToken("一", "yī", "one / single / a (article)", "Kosakata HSK 2: 一 (yī)"),
                        WordToken("天", "tiān", "day", "Kosakata HSK 2: 天 (tiān)"),
                        WordToken("一", "yī", "one / single / a (article)", "Kosakata HSK 2: 一 (yī)"),
                        WordToken("个", "gè", "classifier for people or objects in general", "Kosakata HSK 2: 个 (gè)"),
                        WordToken("盲人", "máng rén", "blind person", "Kosakata HSK 2: 盲人 (máng rén)"),
                        WordToken("到", "dào", "to leave for; to go to", "Kosakata HSK 2: 到 (dào)"),
                        WordToken("朋友", "péng you", "friend", "Kosakata HSK 2: 朋友 (péng you)"),
                        WordToken("家", "jiā", "home / family / (polite) my (sister, uncle etc)", "Kosakata HSK 2: 家 (jiā)"),
                        WordToken("做客", "zuò kè", "to be a guest or visitor", "Kosakata HSK 2: 做客 (zuò kè)"),
                        WordToken("天", "tiān", "sky", "Kosakata HSK 2: 天 (tiān)"),
                        WordToken("黑", "hēi", "black / dark / sinister / secret / shady / illegal", "Kosakata HSK 2: 黑 (hēi)"),
                        WordToken("后", "hòu", "afterwards / after", "Kosakata HSK 2: 后 (hòu)"),
                        WordToken("他", "tā", "he; him; his", "Kosakata HSK 2: 他 (tā)"),
                        WordToken("的", "de", "possessive particle (of; 's) / modifying particle (used after an attribute to modify a noun or to form a nominal expression)", "Kosakata HSK 2: 的 (de)"),
                        WordToken("朋友", "péng you", "friend", "Kosakata HSK 2: 朋友 (péng you)"),
                        WordToken("为", "wèi", "because of / for / to", "Kosakata HSK 2: 为 (wèi)"),
                        WordToken("他", "tā", "he; him; his", "Kosakata HSK 2: 他 (tā)"),
                        WordToken("点", "diǎn", "to touch briefly; to tap / to mark with a dot; to check off (on a list) / to order (food etc); to select / to mention; to bring up (a topic or person) / to hint at; to imply / to administer (eye medicine etc) in drops / to light (a fire, a lamp etc); to ignite / to nod (one's head) in agreement; to beckon by moving (one's hand) up and down", "Kosakata HSK 2: 点 (diǎn)"),
                        WordToken("了", "le", "(completed action marker) / (modal particle indicating change of state, situation now)", "Kosakata HSK 2: 了 (le)"),
                        WordToken("个", "gè", "classifier for people or objects in general", "Kosakata HSK 2: 个 (gè)"),
                        WordToken("灯笼", "dēng long", "lantern", "Kosakata HSK 2: 灯笼 (dēng long)"),
                        WordToken("说", "shuō", "to speak; to talk; to say", "Kosakata HSK 2: 说 (shuō)"),
                        WordToken("天", "tiān", "day", "Kosakata HSK 2: 天 (tiān)"),
                        WordToken("晚", "wǎn", "late", "Kosakata HSK 2: 晚 (wǎn)"),
                        WordToken("了", "le", "(completed action marker) / (modal particle indicating change of state, situation now)", "Kosakata HSK 2: 了 (le)"),
                        WordToken("路", "lù", "road / journey / route / line (bus etc) / sort; kind", "Kosakata HSK 2: 路 (lù)"),
                        WordToken("黑", "hēi", "black / dark / sinister / secret / shady / illegal", "Kosakata HSK 2: 黑 (hēi)"),
                        WordToken("你", "nǐ", "you", "Kosakata HSK 2: 你 (nǐ)"),
                        WordToken("打", "dǎ", "a semantically light, transitive verb that is combined with various grammatical objects to form compound verbs and verb-object phrases with a diverse range of meanings", "Kosakata HSK 2: 打 (dǎ)"),
                        WordToken("个", "gè", "classifier for people or objects in general", "Kosakata HSK 2: 个 (gè)"),
                        WordToken("灯笼", "dēng long", "lantern", "Kosakata HSK 2: 灯笼 (dēng long)"),
                        WordToken("回", "huí", "to go back / to turn around / to answer / to return", "Kosakata HSK 2: 回 (huí)"),
                        WordToken("家", "jiā", "home / family / (polite) my (sister, uncle etc)", "Kosakata HSK 2: 家 (jiā)"),
                        WordToken("吧", "ba", "(modal particle indicating suggestion or surmise) / ...right? / ...OK? / ...I presume.", "Kosakata HSK 2: 吧 (ba)")
                    )
                ),
                Sentence(
                    id = "s_bldlnt_3",
                    hanzi = "盲人很生气地说：“你知道我看不见，还让我打个灯笼照路，不是笑话我吗?”",
                    pinyin = "máng rén hěn shēng qì de shuō nǐ zhī dào wǒ kàn bù jiàn hái ràng wǒ dǎ gè dēng long zhào lù bù shì xiào hua wǒ ma",
                    translation = "Orang buta itu merasa tersinggung dan marah: “Kamu tahu jelas kedua mataku buta tak bisa melihat, mengapa malah menyuruhku menenteng lampion? Bukankah kamu sengaja mengejek kekuranganku?!”",
                    tokens = listOf(
                        WordToken("盲人", "máng rén", "blind person", "Kosakata HSK 2: 盲人 (máng rén)"),
                        WordToken("很", "hěn", "very; quite", "Kosakata HSK 2: 很 (hěn)"),
                        WordToken("生气", "shēng qì", "to get angry; to be furious", "Kosakata HSK 2: 生气 (shēng qì)"),
                        WordToken("地", "de", "-ly / structural particle: used before a verb or adjective, linking it to preceding modifying adverbial adjunct", "Kosakata HSK 2: 地 (de)"),
                        WordToken("说", "shuō", "to speak; to talk; to say", "Kosakata HSK 2: 说 (shuō)"),
                        WordToken("你", "nǐ", "you", "Kosakata HSK 2: 你 (nǐ)"),
                        WordToken("知道", "zhī dào", "to know; to become aware of", "Kosakata HSK 2: 知道 (zhī dào)"),
                        WordToken("我", "wǒ", "I; me; my", "Kosakata HSK 2: 我 (wǒ)"),
                        WordToken("看", "kàn", "to see; to look at / to read / to watch / to visit; to call on / to consider; to regard as / to look after / to treat (a patient or illness) / to depend on / to feel (that) / (after a verb) to give it a try / to watch out for", "Kosakata HSK 2: 看 (kàn)"),
                        WordToken("不见", "bù jiàn", "not to see / not to meet / to have disappeared / to be missing", "Kosakata HSK 2: 不见 (bù jiàn)"),
                        WordToken("还", "hái", "in addition, also, else, even", "Kosakata HSK 2: 还 (hái)"),
                        WordToken("让", "ràng", "to permit / to let sb do sth / to have sb do sth / to make sb (feel sad etc)", "Kosakata HSK 2: 让 (ràng)"),
                        WordToken("我", "wǒ", "I; me; my", "Kosakata HSK 2: 我 (wǒ)"),
                        WordToken("打", "dǎ", "a semantically light, transitive verb that is combined with various grammatical objects to form compound verbs and verb-object phrases with a diverse range of meanings", "Kosakata HSK 2: 打 (dǎ)"),
                        WordToken("个", "gè", "classifier for people or objects in general", "Kosakata HSK 2: 个 (gè)"),
                        WordToken("灯笼", "dēng long", "lantern", "Kosakata HSK 2: 灯笼 (dēng long)"),
                        WordToken("照", "zhào", "to shine / to illuminate / to reflect / to look at (one's reflection) / to take (a photo)", "Kosakata HSK 2: 照 (zhào)"),
                        WordToken("路", "lù", "road / journey / route / line (bus etc) / sort; kind", "Kosakata HSK 2: 路 (lù)"),
                        WordToken("不是", "bù shì", "no / not", "Kosakata HSK 2: 不是 (bù shì)"),
                        WordToken("笑话", "xiào hua", "to laugh at; to mock", "Kosakata HSK 2: 笑话 (xiào hua)"),
                        WordToken("我", "wǒ", "I; me; my", "Kosakata HSK 2: 我 (wǒ)"),
                        WordToken("吗", "ma", "(question particle for \"yes-no\" questions)", "Kosakata HSK 2: 吗 (ma)")
                    )
                ),
                Sentence(
                    id = "s_bldlnt_4",
                    hanzi = "他的朋友说：“你错了。你在路上走，别人也在路上走，你打着灯笼，别人就可以看到你，就不会撞到你了。",
                    pinyin = "tā de péng you shuō nǐ cuò le nǐ zài lù shang zǒu bié rén yě zài lù shang zǒu nǐ dǎ zhe dēng long bié rén jiù kě yǐ kàn dào nǐ jiù bù huì zhuàng dào nǐ le",
                    translation = "Sahabatnya tersenyum lembut lalu menerangkan: “Sahabatku, kamu salah paham. Kamu berjalan di jalanan malam, orang lain pun melangkah di jalan yang sama. Dengan menenteng lampion yang menyala terang, orang lain dari kejauhan bisa melihat keberadaanmu, sehingga mereka tidak akan menabrakmu di kegelapan.”",
                    tokens = listOf(
                        WordToken("他", "tā", "he; him; his", "Kosakata HSK 2: 他 (tā)"),
                        WordToken("的", "de", "possessive particle (of; 's) / modifying particle (used after an attribute to modify a noun or to form a nominal expression)", "Kosakata HSK 2: 的 (de)"),
                        WordToken("朋友", "péng you", "friend", "Kosakata HSK 2: 朋友 (péng you)"),
                        WordToken("说", "shuō", "to speak; to talk; to say", "Kosakata HSK 2: 说 (shuō)"),
                        WordToken("你", "nǐ", "you", "Kosakata HSK 2: 你 (nǐ)"),
                        WordToken("错", "cuò", "wrong / bad / interlocking / complex", "Kosakata HSK 2: 错 (cuò)"),
                        WordToken("了", "le", "(completed action marker) / (modal particle indicating change of state, situation now)", "Kosakata HSK 2: 了 (le)"),
                        WordToken("你", "nǐ", "you", "Kosakata HSK 2: 你 (nǐ)"),
                        WordToken("在", "zài", "(of sb or sth) to be (located) at", "Kosakata HSK 2: 在 (zài)"),
                        WordToken("路上", "lù shang", "on the road", "Kosakata HSK 2: 路上 (lù shang)"),
                        WordToken("走", "zǒu", "to walk / to go / to run / to move (of vehicle) / to visit / to leave / to go away / to die (euph.) / to change (shape, form, meaning)", "Kosakata HSK 2: 走 (zǒu)"),
                        WordToken("别人", "bié rén", "other people; others; other person", "Kosakata HSK 2: 别人 (bié rén)"),
                        WordToken("也", "yě", "also; too; as well; (not ...) either", "Kosakata HSK 2: 也 (yě)"),
                        WordToken("在", "zài", "(of sb or sth) to be (located) at", "Kosakata HSK 2: 在 (zài)"),
                        WordToken("路上", "lù shang", "on the road", "Kosakata HSK 2: 路上 (lù shang)"),
                        WordToken("走", "zǒu", "to walk / to go / to run / to move (of vehicle) / to visit / to leave / to go away / to die (euph.) / to change (shape, form, meaning)", "Kosakata HSK 2: 走 (zǒu)"),
                        WordToken("你", "nǐ", "you", "Kosakata HSK 2: 你 (nǐ)"),
                        WordToken("打着", "dǎ zhe", "to be holding or carrying something while doing an action", "Kosakata HSK 2: 打着 (dǎ zhe)"),
                        WordToken("灯笼", "dēng long", "lantern", "Kosakata HSK 2: 灯笼 (dēng long)"),
                        WordToken("别人", "bié rén", "other people; others; other person", "Kosakata HSK 2: 别人 (bié rén)"),
                        WordToken("就", "jiù", "in that case; then", "Kosakata HSK 2: 就 (jiù)"),
                        WordToken("可以", "kě yǐ", "can / may / possible / able to", "Kosakata HSK 2: 可以 (kě yǐ)"),
                        WordToken("看到", "kàn dào", "to see", "Kosakata HSK 2: 看到 (kàn dào)"),
                        WordToken("你", "nǐ", "you", "Kosakata HSK 2: 你 (nǐ)"),
                        WordToken("就", "jiù", "in that case; then", "Kosakata HSK 2: 就 (jiù)"),
                        WordToken("不会", "bù huì", "will not", "Kosakata HSK 2: 不会 (bù huì)"),
                        WordToken("撞", "zhuàng", "to knock against / to bump into / to run into / to meet by accident", "Kosakata HSK 2: 撞 (zhuàng)"),
                        WordToken("到", "dào", "to reach; to arrive / to (a place); until (a time); up to (a point) / (verb complement indicating arriving at a place or reaching a point)", "Kosakata HSK 2: 到 (dào)"),
                        WordToken("你", "nǐ", "you", "Kosakata HSK 2: 你 (nǐ)"),
                        WordToken("了", "le", "(completed action marker) / (modal particle indicating change of state, situation now)", "Kosakata HSK 2: 了 (le)")
                    )
                )
            ),
            questions = listOf(
                StoryQuestion(
                    id = "q_bldlnt_1",
                    questionText = "古代在没有现代电灯路灯的漆黑夜晚，人们出行通常依赖什么照明工具？ (Alat penerangan apa yang digunakan masyarakat pada malam gelap gulita sebelum adanya lampu listrik?)",
                    options = listOf("手电筒与荧光棒 (Senter baterai dan tongkat fosfor)", "点燃蜡烛并打着灯笼照路 (Menyalakan lilin dan menenteng lampion kertas untuk menerangi jalan)", "依靠天上的北极星辨认方向 (Hanya mengandalkan bintang kutub utara di langit)", "点燃篝火堆 (Menyalakan api unggun unggun)"),
                    correctAnswerIndex = 1,
                    explanation = "Lampion kertas dengan lilin di dalamnya adalah sarana penerangan jalan kaki utama di zaman dahulu."
                ),
                StoryQuestion(
                    id = "q_bldlnt_2",
                    questionText = "当朋友在深夜为盲人点亮一盏灯笼让他带上时，盲人的第一反应为何极为愤怒？ (Mengapa orang buta tersebut justru merasa sangat tersinggung dan marah saat diberi lampion?)",
                    options = listOf("嫌灯笼的做工不够精致华美 (Menganggap bentuk lampion kurang bagus dan mewah)", "认为朋友明知自己双目失明看不见光，递灯笼纯粹是在当面挖苦嘲弄自己！ (Mengira temannya sengaja mengejek kekurangannya karena tahu matanya buta tak bisa melihat cahaya!)", "害怕蜡烛的火苗烧毁自己的衣裳 (Takut api lilin membakar ujung bajunya)", "觉得灯笼太沉重拿在手里累 (Merasa lampion terlalu berat dijinjing)"),
                    correctAnswerIndex = 1,
                    explanation = "Keterbatasan fisik membuatnya sensitif dan mengira pemberian lentera adalah bentuk olok-olok atas kebutaannya."
                ),
                StoryQuestion(
                    id = "q_bldlnt_3",
                    questionText = "善良的朋友如何用一句充满慈悲的话语解开了盲人心中的巨大误会？ (Penjelasan mulia apa yang disampaikan sahabatnya untuk meluruskan kesalahpahaman tersebut?)",
                    options = listOf("告诉他灯笼可以在黑夜里驱赶野狼 (Memberitahu bahwa lentera bisa mengusir serigala malam)", "解释说打着灯笼是为了让迎面走来的明眼路人能看见他，从而在漆黑路上绝不会撞到他！ (Menerangkan bahwa lampion menyala bertujuan agar orang lain di kegelapan bisa melihatnya sehingga tidak menabraknya!)", "告诉他明天白天可以把灯笼卖钱换米 (Menyarankan agar besok lampionnya dijual untuk membeli beras)", "承认自己确实是在和他开玩笑 (Mengakui bahwa dirinya memang sedang bercanda)"),
                    correctAnswerIndex = 1,
                    explanation = "Pencerahan sejati: lentera bukan untuk mata orang buta, melainkan sebagai penanda bagi orang lain agar tidak celaka saling bertabrakan."
                ),
                StoryQuestion(
                    id = "q_bldlnt_4",
                    questionText = "“盲人提灯”这则流传千古的禅意寓言，向世人阐释了怎样的利他利己哲学？ (Nilai luhur tentang altruisme apa yang diajarkan dari kisah filosofis 'Orang Buta Membawa Lampion' ini?)",
                    options = listOf("视力好的人应当向盲人学习夜行技能 (Orang bermata normal harus belajar cara berjalan malam dari tunanetra)", "点亮一盏照亮他人的善意之灯，最终最坚实保护的其实正是我们自己本身 (Menyalakan lentera kebaikan bagi orang lain, pada hakikatnya justru melindungi dan menyelamatkan keselamatan diri kita sendiri)", "走夜路永远不要理会路人的提醒 (Jangan pernah memedulikan nasihat orang lain saat berjalan malam)", "盲人在夜晚出门应该佩戴铃铛 (Orang buta sebaiknya mengenakan lonceng saat bepergian malam)"),
                    correctAnswerIndex = 1,
                    explanation = "Filosofi luhur: berbuat baik dan memberi kemudahan bagi orang lain secara bersamaan mendatangkan perlindungan terbaik bagi diri kita sendiri."
                )
            )
        ),
        // Cerita Mandarin Bean 173 (HSK 2): Learn Chinese in China (Belajar Bahasa Mandarin di Tiongkok)
        Story(
            id = "story_learn_hanyu_in_china",
            titleHanzi = "在中国学汉语",
            titlePinyin = "Zài Zhōngguó Xué Hànyǔ",
            titleTranslation = "Learn Chinese in China (Belajar Bahasa Mandarin di Tiongkok)",
            level = "HSK 2",
            category = "Edukasi & Pengalaman",
            description = "Pengalaman belajar bahasa Mandarin langsung di lingkungan penutur asli di Beijing serta interaksi akrab dengan warga lokal.",
            coverEmoji = "🇨🇳",
            coverImageRes = R.drawable.cover_story_learn_hanyu_in_china,
            estimatedReadMinutes = 2,
            sentences = listOf(
                Sentence(
                    id = "s_lrnhny_1",
                    hanzi = "现在，很多外国学生来中国学习。",
                    pinyin = "xiàn zài hěn duō wài guó xué shēng lái Zhōng guó xué xí",
                    translation = "Dewasa ini, semakin banyak mahasiswa dari berbagai penjuru dunia datang ke Tiongkok untuk menuntut ilmu.",
                    tokens = listOf(
                        WordToken("现在", "xiàn zài", "now; at present; currently", "Kosakata HSK 2: 现在 (xiàn zài)"),
                        WordToken("很多", "hěn duō", "many; a lot of", "Kosakata HSK 2: 很多 (hěn duō)"),
                        WordToken("外国", "wài guó", "foreign country", "Kosakata HSK 2: 外国 (wài guó)"),
                        WordToken("学生", "xué shēng", "student / schoolchild", "Kosakata HSK 2: 学生 (xué shēng)"),
                        WordToken("来", "lái", "to come", "Kosakata HSK 2: 来 (lái)"),
                        WordToken("中国", "Zhōng guó", "China", "Kosakata HSK 2: 中国 (Zhōng guó)"),
                        WordToken("学习", "xué xí", "to learn / to study", "Kosakata HSK 2: 学习 (xué xí)")
                    )
                ),
                Sentence(
                    id = "s_lrnhny_2",
                    hanzi = "很多人学习汉语。",
                    pinyin = "hěn duō rén xué xí Hàn yǔ",
                    translation = "Sebagian besar di antara mereka memilih untuk mendalami kemahiran bahasa Mandarin.",
                    tokens = listOf(
                        WordToken("很多", "hěn duō", "many; a lot of", "Kosakata HSK 2: 很多 (hěn duō)"),
                        WordToken("人", "rén", "person; people", "Kosakata HSK 2: 人 (rén)"),
                        WordToken("学习", "xué xí", "to learn / to study", "Kosakata HSK 2: 学习 (xué xí)"),
                        WordToken("汉语", "Hàn yǔ", "Chinese language", "Kosakata HSK 2: 汉语 (Hàn yǔ)")
                    )
                ),
                Sentence(
                    id = "s_lrnhny_3",
                    hanzi = "美国人、英国人、泰国人……大家一起上课，一起说汉语。",
                    pinyin = "Měi guó rén Yīng guó rén Tài guó rén dà jiā yī qǐ shàng kè yī qǐ shuō Hàn yǔ",
                    translation = "Ada mahasiswa asal Amerika, Inggris, Thailand, dan berbagai negara lainnya; mereka semua belajar di kelas yang sama dan saling berinteraksi menggunakan bahasa Mandarin.",
                    tokens = listOf(
                        WordToken("美国人", "Měi guó rén", "American / American person / American people", "Kosakata HSK 2: 美国人 (Měi guó rén)"),
                        WordToken("英国人", "Yīng guó rén", "British person; British people", "Kosakata HSK 2: 英国人 (Yīng guó rén)"),
                        WordToken("泰国人", "Tài guó rén", "Thai people; a Thai person.", "Kosakata HSK 2: 泰国人 (Tài guó rén)"),
                        WordToken("大家", "dà jiā", "everyone", "Kosakata HSK 2: 大家 (dà jiā)"),
                        WordToken("一起", "yī qǐ", "together; in company (with)", "Kosakata HSK 2: 一起 (yī qǐ)"),
                        WordToken("上课", "shàng kè", "to go to class / to attend class / to go to teach a class", "Kosakata HSK 2: 上课 (shàng kè)"),
                        WordToken("一起", "yī qǐ", "together; in company (with)", "Kosakata HSK 2: 一起 (yī qǐ)"),
                        WordToken("说", "shuō", "to speak; to talk; to say", "Kosakata HSK 2: 说 (shuō)"),
                        WordToken("汉语", "Hàn yǔ", "Chinese language", "Kosakata HSK 2: 汉语 (Hàn yǔ)")
                    )
                ),
                Sentence(
                    id = "s_lrnhny_4",
                    hanzi = "因为喜欢中国，他们认识了很多不同国家的同学和朋友，非常有意思。",
                    pinyin = "yīn wèi xǐ huan Zhōng guó tā men rèn shi le hěn duō bù tóng guó jiā de tóng xué hé péng you fēi cháng yǒu yì si",
                    translation = "Kecintaan pada Tiongkok mempertemukan mereka dengan sahabat-sahabat baru dari berbagai latar belakang budaya yang sangat menarik.",
                    tokens = listOf(
                        WordToken("因为", "yīn wèi", "because; owing to; on account of", "Kosakata HSK 2: 因为 (yīn wèi)"),
                        WordToken("喜欢", "xǐ huan", "to like; to be fond of", "Kosakata HSK 2: 喜欢 (xǐ huan)"),
                        WordToken("中国", "Zhōng guó", "China", "Kosakata HSK 2: 中国 (Zhōng guó)"),
                        WordToken("他们", "tā men", "they; them", "Kosakata HSK 2: 他们 (tā men)"),
                        WordToken("认识", "rèn shi", "to know / to recognize / to be familiar with / to get acquainted with sb", "Kosakata HSK 2: 认识 (rèn shi)"),
                        WordToken("了", "le", "(completed action marker) / (modal particle indicating change of state, situation now)", "Kosakata HSK 2: 了 (le)"),
                        WordToken("很多", "hěn duō", "many; a lot of", "Kosakata HSK 2: 很多 (hěn duō)"),
                        WordToken("不同", "bù tóng", "different / distinct / not the same / not alike", "Kosakata HSK 2: 不同 (bù tóng)"),
                        WordToken("国家", "guó jiā", "country; nation; state", "Kosakata HSK 2: 国家 (guó jiā)"),
                        WordToken("的", "de", "possessive particle (of; 's) / modifying particle (used after an attribute to modify a noun or to form a nominal expression)", "Kosakata HSK 2: 的 (de)"),
                        WordToken("同学", "tóng xué", "fellow student / classmate", "Kosakata HSK 2: 同学 (tóng xué)"),
                        WordToken("和", "hé", "and; together with", "Kosakata HSK 2: 和 (hé)"),
                        WordToken("朋友", "péng you", "friend", "Kosakata HSK 2: 朋友 (péng you)"),
                        WordToken("非常", "fēi cháng", "very; really", "Kosakata HSK 2: 非常 (fēi cháng)"),
                        WordToken("有意思", "yǒu yì si", "interesting / meaningful / enjoyable / fun", "Kosakata HSK 2: 有意思 (yǒu yì si)")
                    )
                ),
                Sentence(
                    id = "s_lrnhny_5",
                    hanzi = "很多外国学生也希望以后可以在中国工作。",
                    pinyin = "hěn duō wài guó xué shēng yě xī wàng yǐ hòu kě yǐ zài Zhōng guó gōng zuò",
                    translation = "Banyak dari para mahasiswa asing tersebut juga berharap kelak setelah lulus dapat meniti karier dan bekerja di Tiongkok.",
                    tokens = listOf(
                        WordToken("很多", "hěn duō", "many; a lot of", "Kosakata HSK 2: 很多 (hěn duō)"),
                        WordToken("外国", "wài guó", "foreign country", "Kosakata HSK 2: 外国 (wài guó)"),
                        WordToken("学生", "xué shēng", "student / schoolchild", "Kosakata HSK 2: 学生 (xué shēng)"),
                        WordToken("也", "yě", "also; too; as well; (not ...) either", "Kosakata HSK 2: 也 (yě)"),
                        WordToken("希望", "xī wàng", "to hope", "Kosakata HSK 2: 希望 (xī wàng)"),
                        WordToken("以后", "yǐ hòu", "after / later / afterwards / following / later on / in the future", "Kosakata HSK 2: 以后 (yǐ hòu)"),
                        WordToken("可以", "kě yǐ", "can / may / possible / able to", "Kosakata HSK 2: 可以 (kě yǐ)"),
                        WordToken("在", "zài", "(of sb or sth) to be (located) at", "Kosakata HSK 2: 在 (zài)"),
                        WordToken("中国", "Zhōng guó", "China", "Kosakata HSK 2: 中国 (Zhōng guó)"),
                        WordToken("工作", "gōng zuò", "to work / (of a machine) to operate", "Kosakata HSK 2: 工作 (gōng zuò)")
                    )
                )
            ),
            questions = listOf(
                StoryQuestion(
                    id = "q_lrnhny_1",
                    questionText = "如今世界各国的年轻学子纷至沓来到中国留学，他们首选学习的核心学科是什么？ (Subjek utama apa yang paling banyak diminati oleh para pelajar internasional yang datang ke Tiongkok?)",
                    options = listOf("中国古代陶瓷制作工艺 (Seni keramik kuno Tiongkok)", "汉语言文字与应用交流能力 (Keterampilan berbahasa Mandarin dan komunikasi praktis)", "传统太极拳与少林武术 (Seni bela diri Shaolin dan Tai Chi tradisional)", "传统中式古典园林设计 (Arsitektur taman klasik Tiongkok)"),
                    correctAnswerIndex = 1,
                    explanation = "Mempelajari bahasa Mandarin merupakan pilihan utama bagi sebagian besar mahasiswa asing di berbagai universitas Tiongkok."
                ),
                StoryQuestion(
                    id = "q_lrnhny_2",
                    questionText = "在跨国多文化融合的留学生课堂里，来自美、英、泰等国学子是如何打破国界壁垒的？ (Bagaimana para mahasiswa multinasional berinteraksi di ruang kelas kampus?)",
                    options = listOf("各自使用自己国家的母语互不交流 (Menggunakan bahasa ibu masing-masing tanpa berkomunikasi)", "大家坐在一起上课，统一使用汉语作为共同的交流语言畅所欲言 (Duduk belajar di satu kelas dan menggunakan bahasa Mandarin sebagai bahasa pemersatu komunikasi bersama)", "全程戴着同传耳机依赖机器翻译 (Memakai earphone terjemahan mesin sepanjang waktu)", "只通过写小纸条进行文字沟通 (Hanya bertukar pesan lewat secarik kertas)"),
                    correctAnswerIndex = 1,
                    explanation = "Bahasa Mandarin menjadi lingua franca yang menjembatani keakraban para mahasiswa dari berbagai benua."
                ),
                StoryQuestion(
                    id = "q_lrnhny_3",
                    questionText = "这种多元文化汇聚一堂的留学生活，给外国留学生们带来了怎样宝贵的成长财富？ (Manfaat berharga apa yang dipetik para mahasiswa asing dari lingkungan kampus multikultural ini?)",
                    options = listOf("学会在宿舍里做各国西餐 (Belajar memasak makanan barat di asrama)", "结识了来自五湖四海不同国家的深厚友谊，视野极其开阔有趣 (Memperoleh jaringan persahabatan global yang hangat serta wawasan internasional yang kaya)", "每天可以不用参加期末考试 (Bebas dari ujian akhir semester)", "能够免费环游世界所有免签国家 (Bisa keliling dunia gratis tanpa visa)"),
                    correctAnswerIndex = 1,
                    explanation = "Interaksi lintas budaya memperkaya cara pandang hidup dan melahirkan persahabatan sejati di kancah global."
                ),
                StoryQuestion(
                    id = "q_lrnhny_4",
                    questionText = "在学业圆满结束后，许多外国留学生对自己的未来规划怀抱着怎样的憧憬？ (Cita-cita masa depan apa yang banyak diimpikan para lulusan asing setelah menamatkan studi mereka?)",
                    options = listOf("彻底忘掉学过的所有中文知识 (Melupakan seluruh ilmu bahasa Mandarin yang telah dipelajari)", "热切期望毕业后能继续留在飞速发展的中国工作与开创事业 (Berharap kelak dapat terus tinggal dan mengembangkan karier kerja profesional di Tiongkok)", "立即移民去寒冷的南极洲定居 (Pindah menetap ke benua Antartika)", "劝阻身边的朋友不要学习中文 (Melarang teman-temannya belajar bahasa Mandarin)"),
                    correctAnswerIndex = 1,
                    explanation = "Peluang ekonomi dan kedekatan emosional mendorong banyak lulusan asing untuk berkarir di Tiongkok."
                )
            )
        ),
        // Cerita Mandarin Bean 174 (HSK 2): Rain Season (Musim Hujan)
        Story(
            id = "story_rain_season",
            titleHanzi = "雨季",
            titlePinyin = "Yǔjì",
            titleTranslation = "Rain Season (Musim Hujan)",
            level = "HSK 2",
            category = "Alam & Musim",
            description = "Suasana khas kota di selatan Tiongkok saat musim hujan tiba, aroma tanah basah, dan payung warna-warni di jalanan.",
            coverEmoji = "🌧️",
            coverImageRes = R.drawable.cover_story_rain_season,
            estimatedReadMinutes = 2,
            sentences = listOf(
                Sentence(
                    id = "s_rainsn_1",
                    hanzi = "现在中国进入了雨季，经常有雨。",
                    pinyin = "xiàn zài Zhōng guó jìn rù le yǔ jì jīng cháng yǒu yǔ",
                    translation = "Saat ini wilayah Tiongkok telah memasuki musim hujan, di mana curah hujan turun sangat sering dan lebat.",
                    tokens = listOf(
                        WordToken("现在", "xiàn zài", "now; at present; currently", "Kosakata HSK 2: 现在 (xiàn zài)"),
                        WordToken("中国", "Zhōng guó", "China", "Kosakata HSK 2: 中国 (Zhōng guó)"),
                        WordToken("进入", "jìn rù", "to enter / to join / to go into", "Kosakata HSK 2: 进入 (jìn rù)"),
                        WordToken("了", "le", "(completed action marker) / (modal particle indicating change of state, situation now)", "Kosakata HSK 2: 了 (le)"),
                        WordToken("雨", "yǔ", "rain", "Kosakata HSK 2: 雨 (yǔ)"),
                        WordToken("季", "jì", "season / the last month of a season / fourth or youngest amongst brothers", "Kosakata HSK 2: 季 (jì)"),
                        WordToken("经常", "jīng cháng", "frequently; constantly; regularly; often", "Kosakata HSK 2: 经常 (jīng cháng)"),
                        WordToken("有", "yǒu", "to have; there is", "Kosakata HSK 2: 有 (yǒu)"),
                        WordToken("雨", "yǔ", "rain", "Kosakata HSK 2: 雨 (yǔ)")
                    )
                ),
                Sentence(
                    id = "s_rainsn_2",
                    hanzi = "雨季，是一年中下雨很多的季节。",
                    pinyin = "yǔ jì shì yī nián zhōng xià yǔ hěn duō de jì jié",
                    translation = "Musim hujan merupakan periode dalam satu tahun kalender dengan frekuensi dan volume curah hujan tertinggi.",
                    tokens = listOf(
                        WordToken("雨", "yǔ", "rain", "Kosakata HSK 2: 雨 (yǔ)"),
                        WordToken("季", "jì", "season / the last month of a season / fourth or youngest amongst brothers", "Kosakata HSK 2: 季 (jì)"),
                        WordToken("是", "shì", "to be (followed by substantives only)", "Kosakata HSK 2: 是 (shì)"),
                        WordToken("一", "yī", "one / single / a (article)", "Kosakata HSK 2: 一 (yī)"),
                        WordToken("年", "nián", "year", "Kosakata HSK 2: 年 (nián)"),
                        WordToken("中", "zhōng", "within; among; in", "Kosakata HSK 2: 中 (zhōng)"),
                        WordToken("下雨", "xià yǔ", "to rain", "Kosakata HSK 2: 下雨 (xià yǔ)"),
                        WordToken("很", "hěn", "very; quite", "Kosakata HSK 2: 很 (hěn)"),
                        WordToken("多", "duō", "many; much; more; a lot of", "Kosakata HSK 2: 多 (duō)"),
                        WordToken("的", "de", "possessive particle (of; 's) / modifying particle (used after an attribute to modify a noun or to form a nominal expression)", "Kosakata HSK 2: 的 (de)"),
                        WordToken("季节", "jì jié", "time / season / period", "Kosakata HSK 2: 季节 (jì jié)")
                    )
                ),
                Sentence(
                    id = "s_rainsn_3",
                    hanzi = "在中国，南方的雨季是4-9月，北方是6-9月。",
                    pinyin = "zài Zhōng guó nán fāng de yǔ jì shì yuè běi fāng shì yuè",
                    translation = "Di Tiongkok, musim hujan di wilayah selatan biasanya berlangsung dari bulan April hingga September, sedangkan di wilayah utara berkisar antara bulan Juni hingga September.",
                    tokens = listOf(
                        WordToken("在", "zài", "(of sb or sth) to be (located) at", "Kosakata HSK 2: 在 (zài)"),
                        WordToken("中国", "Zhōng guó", "China", "Kosakata HSK 2: 中国 (Zhōng guó)"),
                        WordToken("南方", "nán fāng", "south; southern direction / (in China) southern regions, often referring to areas south of the Yangtze River", "Kosakata HSK 2: 南方 (nán fāng)"),
                        WordToken("的", "de", "possessive particle (of; 's) / modifying particle (used after an attribute to modify a noun or to form a nominal expression)", "Kosakata HSK 2: 的 (de)"),
                        WordToken("雨", "yǔ", "rain", "Kosakata HSK 2: 雨 (yǔ)"),
                        WordToken("季", "jì", "season / the last month of a season / fourth or youngest amongst brothers", "Kosakata HSK 2: 季 (jì)"),
                        WordToken("是", "shì", "to be (followed by substantives only)", "Kosakata HSK 2: 是 (shì)"),
                        WordToken("月", "yuè", "month / monthly", "Kosakata HSK 2: 月 (yuè)"),
                        WordToken("北方", "běi fāng", "north / the northern part a country / China north of the Yellow River", "Kosakata HSK 2: 北方 (běi fāng)"),
                        WordToken("是", "shì", "to be (followed by substantives only)", "Kosakata HSK 2: 是 (shì)"),
                        WordToken("月", "yuè", "month / monthly", "Kosakata HSK 2: 月 (yuè)")
                    )
                ),
                Sentence(
                    id = "s_rainsn_4",
                    hanzi = "大家要注意。",
                    pinyin = "dà jiā yào zhù yì",
                    translation = "Masyarakat dihimbau untuk selalu membawa payung dan berhati-hati dalam menjaga keselamatan di jalan.",
                    tokens = listOf(
                        WordToken("大家", "dà jiā", "everyone", "Kosakata HSK 2: 大家 (dà jiā)"),
                        WordToken("要", "yào", "will; shall; about to / need to; should / if", "Kosakata HSK 2: 要 (yào)"),
                        WordToken("注意", "zhù yì", "to take note of; to pay attention to", "Kosakata HSK 2: 注意 (zhù yì)")
                    )
                )
            ),
            questions = listOf(
                StoryQuestion(
                    id = "q_rainsn_1",
                    questionText = "气象学与日常生活中所谓的“雨季”，指的是一年之中具有什么显著特征的时段？ (Apa karakteristik iklim yang menandai periode musim hujan dalam satu tahun kalender?)",
                    options = listOf("狂风呼啸、漫天黄沙飞舞的干旱期 (Periode kering berangin kencang dengan badai pasir)", "降雨频率最高、累计降雨量最为丰沛集中的特殊季节 (Periode dengan frekuensi dan akumulasi curah hujan tertinggi dan paling pekat)", "全天候晴空万里、气温居高不下的盛夏 (Musim kemarau cerah sepanjang hari tanpa awan)", "千里冰封、白雪皑皑的严冬 (Musim dingin bersalju beku)"),
                    correctAnswerIndex = 1,
                    explanation = "Musim hujan (雨季 / Yǔjì) merupakan musim di mana hujan turun dengan intensitas tinggi dan berkala."
                ),
                StoryQuestion(
                    id = "q_rainsn_2",
                    questionText = "在中国广袤的地理版图上，南方地区的雨季通常涵盖哪几个月份？ (Bulan apa sajakah rentang musim hujan yang melanda kawasan selatan Tiongkok?)",
                    options = listOf("每年的一月到三月 (Bulan Januari hingga Maret setiap tahun)", "每年的四月持续至九月份 (Bulan April hingga bulan September)", "每年的十月到十二月 (Bulan Oktober hingga Desember)", "仅仅只有春节前后的两周时间 (Hanya dua minggu sekitar Hari Raya Imlek)"),
                    correctAnswerIndex = 1,
                    explanation = "Wilayah Tiongkok selatan mengalami musim hujan panjang yang merentang dari bulan April hingga September."
                ),
                StoryQuestion(
                    id = "q_rainsn_3",
                    questionText = "与南方相比，中国北方地区的雨季在时间跨度上有着怎样的差异分布？ (Bagaimana perbedaan periode musim hujan di kawasan utara Tiongkok dibanding selatan?)",
                    options = listOf("北方根本就从来不下任何一滴雨 (Kawasan utara tidak pernah turun hujan sama sekali)", "北方的雨季相对集中且短暂，主要分布在六月至九月份 (Musim hujan utara lebih terkonsentrasi singkat, terutama di bulan Juni hingga September)", "北方的雨季比南方整整多出三个月 (Musim hujan utara tiga bulan lebih lama dibanding selatan)", "北方全年每天二十四小时都在下大雨 (Kawasan utara diguyur hujan 24 jam nonstop sepanjang tahun)"),
                    correctAnswerIndex = 1,
                    explanation = "Di utara Tiongkok musim hujan lebih singkat dan terkonsentrasi pada puncak musim panas (Juni–September)."
                ),
                StoryQuestion(
                    id = "q_rainsn_4",
                    questionText = "在漫长而连绵不断的雨季期间，官方与生活常识最着重提醒居民防范什么？ (Langkah kewaspadaan apa yang paling ditekankan kepada masyarakat selama musim hujan?)",
                    options = listOf("注意备齐雨具、防滑防涝，并关注出行安全与居家人身防护 (Mempersiapkan payung, mewaspadai jalan licin/banjir, serta menjaga keselamatan diri)", "尽量不要穿衣服出门 (Sebaiknya tidak berpakaian saat keluar rumah)", "把家里的自来水阀门全部拆掉 (Mencopot kran air pipa ledeng rumah)", "每天在马路上快速飞车 (Mengendarai mobil dengan kecepatan tinggi di jalanan basah)"),
                    correctAnswerIndex = 0,
                    explanation = "Keselamatan transportasi, kebersihan sanitasi, dan kewaspadaan terhadap genangan air merupakan edukasi publik utama saat musim hujan."
                )
            )
        )
    )
}
