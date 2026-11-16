package com.example.chineselearning.data.repository

import com.example.chineselearning.R
import com.example.chineselearning.data.model.Sentence
import com.example.chineselearning.data.model.Story
import com.example.chineselearning.data.model.StoryQuestion
import com.example.chineselearning.data.model.WordToken

val mandarinBeanStoriesPart11: List<Story> by lazy {
    listOf(
        // Cerita Mandarin Bean 128 (HSK 2): Social Engagement (Jamuan Dinas Terpaksa)
        Story(
            id = "story_social_engagement",
            titleHanzi = "应酬",
            titlePinyin = "Yìngchou",
            titleTranslation = "Social Engagement (Jamuan Dinas Terpaksa)",
            level = "HSK 2",
            category = "Pekerjaan & Relasi",
            description = "Kepolosan seorang anak kecil yang menganggap pergi ke sekolah di pagi hari adalah 'jamuan dinas terpaksa'.",
            coverEmoji = "🥂",
            coverImageRes = R.drawable.cover_story_social_engagement,
            estimatedReadMinutes = 2,
            sentences = listOf(
                Sentence(
                    id = "s_sociale_1",
                    hanzi = "爸爸给家里打电话，儿子接电话后，爸爸说：\"儿子，告诉你妈妈，我今天晚上有应酬，不能回来吃饭了。”",
                    pinyin = "bà ba gěi jiā lǐ dǎ diàn huà ér zi jiē diàn huà hòu bà ba shuō ér zi gào su nǐ mā ma wǒ jīn tiān wǎn shang yǒu yìng chou bù néng huí lái chī fàn le",
                    translation = "Ayah menelepon ke rumah, begitu putranya yang mengangkat gagang telepon, ayah berpesan: “Nak, tolong sampaikan kepada ibumu, malam ini ayah ada jamuan dinas luar (yìngchou), jadi tidak bisa pulang makan malam di rumah.”",
                    tokens = listOf(
                        WordToken("爸爸", "bà ba", "(coll.) father; dad", "Kosakata HSK 2: 爸爸 (bà ba)"),
                        WordToken("给", "gěi", "To", "Kosakata HSK 2: 给 (gěi)"),
                        WordToken("家", "jiā", "Home", "Kosakata HSK 2: 家 (jiā)"),
                        WordToken("里", "lǐ", "Lining", "Kosakata HSK 2: 里 (lǐ)"),
                        WordToken("打电话", "dǎ diàn huà", "To make a telephone call", "Kosakata HSK 2: 打电话 (dǎ diàn huà)"),
                        WordToken("儿子", "ér zi", "Son", "Kosakata HSK 2: 儿子 (ér zi)"),
                        WordToken("接", "jiē", "To receive", "Kosakata HSK 2: 接 (jiē)"),
                        WordToken("电话", "diàn huà", "Telephone", "Kosakata HSK 2: 电话 (diàn huà)"),
                        WordToken("后", "hòu", "Afterwards", "Kosakata HSK 2: 后 (hòu)"),
                        WordToken("爸爸", "bà ba", "(coll.) father; dad", "Kosakata HSK 2: 爸爸 (bà ba)"),
                        WordToken("说", "shuō", "To speak; to talk; to say", "Kosakata HSK 2: 说 (shuō)"),
                        WordToken("儿子", "ér zi", "Son", "Kosakata HSK 2: 儿子 (ér zi)"),
                        WordToken("告诉", "gào su", "To tell; to inform; to let know", "Kosakata HSK 2: 告诉 (gào su)"),
                        WordToken("你", "nǐ", "You", "Kosakata HSK 2: 你 (nǐ)"),
                        WordToken("妈妈", "mā ma", "Mama", "Kosakata HSK 2: 妈妈 (mā ma)"),
                        WordToken("我", "wǒ", "I; me; my", "Kosakata HSK 2: 我 (wǒ)"),
                        WordToken("今天", "jīn tiān", "Today", "Kosakata HSK 2: 今天 (jīn tiān)"),
                        WordToken("晚上", "wǎn shang", "Evening", "Kosakata HSK 2: 晚上 (wǎn shang)"),
                        WordToken("有", "yǒu", "To have; there is", "Kosakata HSK 2: 有 (yǒu)"),
                        WordToken("应酬", "yìng chou", "Dinner party; banquet; social engagement", "Kosakata HSK 2: 应酬 (yìng chou)"),
                        WordToken("不", "bù", "No; not so", "Kosakata HSK 2: 不 (bù)"),
                        WordToken("能", "néng", "Can", "Kosakata HSK 2: 能 (néng)"),
                        WordToken("回来", "huí lái", "To return; to come back", "Kosakata HSK 2: 回来 (huí lái)"),
                        WordToken("吃饭", "chī fàn", "To have a meal", "Kosakata HSK 2: 吃饭 (chī fàn)"),
                        WordToken("了", "le", "(completed action marker)", "Kosakata HSK 2: 了 (le)")
                    )
                ),
                Sentence(
                    id = "s_sociale_2",
                    hanzi = "儿子不明白\"应酬”的意思，好奇地问：\"什么叫应酬啊?”",
                    pinyin = "ér zi bù míng bai yìng chou de yì si hào qí de wèn shén me jiào yìng chou a",
                    translation = "Sang anak tidak mengerti makna istilah tersebut, lalu bertanya penasaran: “Ayah, apa artinya ‘yìngchou’ itu?”",
                    tokens = listOf(
                        WordToken("儿子", "ér zi", "Son", "Kosakata HSK 2: 儿子 (ér zi)"),
                        WordToken("不", "bù", "No; not so", "Kosakata HSK 2: 不 (bù)"),
                        WordToken("明白", "míng bai", "To understand; to realize", "Kosakata HSK 2: 明白 (míng bai)"),
                        WordToken("应酬", "yìng chou", "To engage in social activities; to socialize", "Kosakata HSK 2: 应酬 (yìng chou)"),
                        WordToken("的", "de", "Possessive particle (of; &#x27;s)", "Kosakata HSK 2: 的 (de)"),
                        WordToken("意思", "yì si", "Idea", "Kosakata HSK 2: 意思 (yì si)"),
                        WordToken("好奇", "hào qí", "Inquisitive", "Kosakata HSK 2: 好奇 (hào qí)"),
                        WordToken("地", "de", "-ly", "Kosakata HSK 2: 地 (de)"),
                        WordToken("问", "wèn", "To ask; to inquire", "Kosakata HSK 2: 问 (wèn)"),
                        WordToken("什么", "shén me", "What?", "Kosakata HSK 2: 什么 (shén me)"),
                        WordToken("叫", "jiào", "To be called", "Kosakata HSK 2: 叫 (jiào)"),
                        WordToken("应酬", "yìng chou", "To engage in social activities; to socialize", "Kosakata HSK 2: 应酬 (yìng chou)"),
                        WordToken("啊", "a", "Modal particle ending sentence, showing affirmation, approval, or consent", "Kosakata HSK 2: 啊 (a)")
                    )
                ),
                Sentence(
                    id = "s_sociale_3",
                    hanzi = "爸爸回答：\"不想去，但是又不得不去的叫应酬。”",
                    pinyin = "bà ba huí dá bù xiǎng qù dàn shì yòu bù dé bù qù de jiào yìng chou",
                    translation = "Ayah menerangkan: “Acara yang sebenarnya enggan kamu datangi, tetapi terpaksa harus kamu hadiri, itulah yang disebut jamuan dinas.”",
                    tokens = listOf(
                        WordToken("爸爸", "bà ba", "(coll.) father; dad", "Kosakata HSK 2: 爸爸 (bà ba)"),
                        WordToken("回答", "huí dá", "To reply; to answer", "Kosakata HSK 2: 回答 (huí dá)"),
                        WordToken("不", "bù", "No; not so", "Kosakata HSK 2: 不 (bù)"),
                        WordToken("想", "xiǎng", "To desire; to want (to)", "Kosakata HSK 2: 想 (xiǎng)"),
                        WordToken("去", "qù", "To go, to go to", "Kosakata HSK 2: 去 (qù)"),
                        WordToken("但是", "dàn shì", "But; however", "Kosakata HSK 2: 但是 (dàn shì)"),
                        WordToken("又", "yòu", "And yet", "Kosakata HSK 2: 又 (yòu)"),
                        WordToken("不得不", "bù dé bù", "Have no choice or option but to", "Kosakata HSK 2: 不得不 (bù dé bù)"),
                        WordToken("去", "qù", "To go, to go to", "Kosakata HSK 2: 去 (qù)"),
                        WordToken("的", "de", "Possessive particle (of; &#x27;s)", "Kosakata HSK 2: 的 (de)"),
                        WordToken("叫", "jiào", "To be called", "Kosakata HSK 2: 叫 (jiào)"),
                        WordToken("应酬", "yìng chou", "To engage in social activities; to socialize", "Kosakata HSK 2: 应酬 (yìng chou)")
                    )
                ),
                Sentence(
                    id = "s_sociale_4",
                    hanzi = "第二天，去学校前，儿子说：\"爸爸，我要去应酬了。",
                    pinyin = "dì èr tiān qù xué xiào qián ér zi shuō bà ba wǒ yào qù yìng chou le",
                    translation = "Keesokan paginya saat hendak melangkah keluar rumah, sang anak menoleh dan berkata: “Ayah, sekarang giliran saya yang harus pergi dinas terpaksa ke sekolah!",
                    tokens = listOf(
                        WordToken("第", "dì", "(prefix indicating ordinal number)", "Kosakata HSK 2: 第 (dì)"),
                        WordToken("二", "èr", "Two", "Kosakata HSK 2: 二 (èr)"),
                        WordToken("天", "tiān", "Day", "Kosakata HSK 2: 天 (tiān)"),
                        WordToken("去", "qù", "To go, to go to", "Kosakata HSK 2: 去 (qù)"),
                        WordToken("学校", "xué xiào", "School", "Kosakata HSK 2: 学校 (xué xiào)"),
                        WordToken("前", "qián", "Ago", "Kosakata HSK 2: 前 (qián)"),
                        WordToken("儿子", "ér zi", "Son", "Kosakata HSK 2: 儿子 (ér zi)"),
                        WordToken("说", "shuō", "To speak; to talk; to say", "Kosakata HSK 2: 说 (shuō)"),
                        WordToken("爸爸", "bà ba", "(coll.) father; dad", "Kosakata HSK 2: 爸爸 (bà ba)"),
                        WordToken("我", "wǒ", "I; me; my", "Kosakata HSK 2: 我 (wǒ)"),
                        WordToken("要", "yào", "Will; shall; about to", "Kosakata HSK 2: 要 (yào)"),
                        WordToken("去", "qù", "To go, to go to", "Kosakata HSK 2: 去 (qù)"),
                        WordToken("应酬", "yìng chou", "To engage in social activities; to socialize", "Kosakata HSK 2: 应酬 (yìng chou)"),
                        WordToken("了", "le", "(completed action marker)", "Kosakata HSK 2: 了 (le)")
                    )
                ),
                Sentence(
                    id = "s_sociale_5",
                    hanzi = "\"",
                    pinyin = "",
                    translation = "”",
                    tokens = listOf(

                    )
                )
            ),
            questions = listOf(
                StoryQuestion(
                    id = "q_sociale_1",
                    questionText = "父亲在电话里用“应酬”一词向儿子表达了什么意思？ (Apa maksud kata 'jamuan dinas / yìngchou' yang disampaikan ayah lewat telepon?)",
                    options = listOf("要去参加好玩的电子竞技 (Mau ikut turnamen game)", "晚上有不得不去的社交公务聚会，无法回家吃晚饭 (Malam hari ada urusan jamuan dinas yang terpaksa dihadiri sehingga tak bisa pulang makan)", "要在办公室睡大觉 (Mau tidur di kantor)", "要去旅游度假 (Mau pergi liburan)"),
                    correctAnswerIndex = 1,
                    explanation = "Urusan sosialisasi profesional yang mengikat waktu makan malam di luar rumah."
                ),
                StoryQuestion(
                    id = "q_sociale_2",
                    questionText = "面对儿子的好奇发问，父亲是如何向孩子通俗解释“应酬”的？ (Bagaimana ayah menjelaskan makna kata tersebut secara sederhana kepada anaknya?)",
                    options = listOf("赚钱最多的活动 (Aktivitas yang menghasilkan paling banyak uang)", "不想去但是又不得不去的事情就叫应酬 (Hal yang sebenarnya enggan didatangi tetapi terpaksa harus dijalani)", "非常好玩的游戏 (Permainan yang sangat seru)", "必须穿西装的宴会 (Pesta yang mewajibkan jas resmi)"),
                    correctAnswerIndex = 1,
                    explanation = "Definisi realistis dari beban keterpaksaan agenda dunia orang dewasa."
                ),
                StoryQuestion(
                    id = "q_sociale_3",
                    questionText = "第二天清晨上学前，儿子说了一句什么令人捧腹的趣话？ (Ucapan jenaka apa yang dilontarkan anak sebelum melangkah pergi ke sekolah?)",
                    options = listOf("妈妈再见我爱你们 (Sampai jumpa ibu aku mencintai kalian)", "爸爸，我要去“应酬”上学了！ (Ayah, sekarang giliran saya yang harus pergi dinas terpaksa ke sekolah!)", "我今天不去上课了 (Saya tidak mau sekolah hari ini)", "给我五百块钱 (Beri saya uang 500 yuan)"),
                    correctAnswerIndex = 1,
                    explanation = "Anak langsung mengaplikasikan konsep 'keterpaksaan' tersebut untuk rutinitas masuk kelasnya!"
                ),
                StoryQuestion(
                    id = "q_sociale_4",
                    questionText = "这个家庭小品展现了儿童语言习得中的什么机制？ (Pola belajar bahasa apa yang tercermin dalam perilaku sang anak?)",
                    options = listOf("死记硬背不求甚解 (Menghafal buta tanpa paham)", "将成年人灌输的概念迅速类比迁移到自身经验的生活情境中 (Cepat mengasosiasikan konsep baru ke dalam pengalaman dunia pribadinya)", "恶意曲解长辈的话 (Sengaja mendistorsi ucapan orang tua)", "语言理解力障碍 (Gangguan pemahaman bahasa)"),
                    correctAnswerIndex = 1,
                    explanation = "Kemampuan analogi anak yang cerdas dan mengundang senyum hangat keluarga."
                )
            )
        ),
        // Cerita Mandarin Bean 129 (HSK 2): Signature (Tanda Tangan)
        Story(
            id = "story_signature",
            titleHanzi = "签名",
            titlePinyin = "Qiānmíng",
            titleTranslation = "Signature (Tanda Tangan)",
            level = "HSK 2",
            category = "Keluarga & Sekolah",
            description = "Trik cerdik Xiao Ming yang merayu ayahnya agar menandatangani lembar ujian dengan mata terpejam rapat.",
            coverEmoji = "✍️",
            coverImageRes = R.drawable.cover_story_signature,
            estimatedReadMinutes = 2,
            sentences = listOf(
                Sentence(
                    id = "s_signatu_1",
                    hanzi = "有一天，数学考试后，老师要求大家回家后让自己的爸爸妈妈在试卷上签名。",
                    pinyin = "yǒu yì tiān shù xué kǎo shì hòu lǎo shī yāo qiú dà jiā huí jiā hòu ràng zì jǐ de bà ba mā ma zài shì juàn shàng qiān míng",
                    translation = "Suatu hari seusai ujian matematika, guru mewajibkan seluruh murid membawa pulang kertas ujian untuk ditandatangani oleh orang tua masing-masing.",
                    tokens = listOf(
                        WordToken("有一天", "yǒu yì tiān", "One day; at some unspecified day in the past or future", "Kosakata HSK 2: 有一天 (yǒu yì tiān)"),
                        WordToken("数学", "shù xué", "Mathematics", "Kosakata HSK 2: 数学 (shù xué)"),
                        WordToken("考试", "kǎo shì", "Exam", "Kosakata HSK 2: 考试 (kǎo shì)"),
                        WordToken("后", "hòu", "Afterwards", "Kosakata HSK 2: 后 (hòu)"),
                        WordToken("老师", "lǎo shī", "Teacher", "Kosakata HSK 2: 老师 (lǎo shī)"),
                        WordToken("要求", "yāo qiú", "To request", "Kosakata HSK 2: 要求 (yāo qiú)"),
                        WordToken("大家", "dà jiā", "Everyone", "Kosakata HSK 2: 大家 (dà jiā)"),
                        WordToken("回家", "huí jiā", "To return home", "Kosakata HSK 2: 回家 (huí jiā)"),
                        WordToken("后", "hòu", "Afterwards", "Kosakata HSK 2: 后 (hòu)"),
                        WordToken("让", "ràng", "To permit", "Kosakata HSK 2: 让 (ràng)"),
                        WordToken("自己", "zì jǐ", "Oneself; (attributive) one&#x27;s own", "Kosakata HSK 2: 自己 (zì jǐ)"),
                        WordToken("的", "de", "Possessive particle (of; &#x27;s)", "Kosakata HSK 2: 的 (de)"),
                        WordToken("爸爸", "bà ba", "(coll.) father; dad", "Kosakata HSK 2: 爸爸 (bà ba)"),
                        WordToken("妈妈", "mā ma", "Mama", "Kosakata HSK 2: 妈妈 (mā ma)"),
                        WordToken("在", "zài", "(of sb or sth) to be (located) at", "Kosakata HSK 2: 在 (zài)"),
                        WordToken("试卷", "shì juàn", "Examination paper", "Kosakata HSK 2: 试卷 (shì juàn)"),
                        WordToken("上", "shàng", "(noun suffix) on; above", "Kosakata HSK 2: 上 (shàng)"),
                        WordToken("签名", "qiān míng", "To sign (one&#x27;s name with a pen etc)", "Kosakata HSK 2: 签名 (qiān míng)")
                    )
                ),
                Sentence(
                    id = "s_signatu_2",
                    hanzi = "小明考得不太好，不希望爸爸妈妈看见自己的成绩。",
                    pinyin = "xiǎo míng kǎo de bù tài hǎo bù xī wàng bà ba mā ma kàn jiàn zì jǐ de chéng jì",
                    translation = "Nilai ujian Xiao Ming agak jeblok, dan dia takut jika ayah atau ibunya melihat angka merah di kertas tersebut.",
                    tokens = listOf(
                        WordToken("小明", "xiǎo míng", "A placeholder personal name, literally “little ming”; often used like “john doe” in examples", "Kosakata HSK 2: 小明 (xiǎo míng)"),
                        WordToken("考", "kǎo", "To check", "Kosakata HSK 2: 考 (kǎo)"),
                        WordToken("得", "de", "Structural particle: used after a verb (or adjective as main verb), linking it to following phrase indicating effect, degree, possibility etc", "Kosakata HSK 2: 得 (de)"),
                        WordToken("不", "bù", "No; not so", "Kosakata HSK 2: 不 (bù)"),
                        WordToken("太", "tài", "Too (much)", "Kosakata HSK 2: 太 (tài)"),
                        WordToken("好", "hǎo", "Good", "Kosakata HSK 2: 好 (hǎo)"),
                        WordToken("不", "bù", "No; not so", "Kosakata HSK 2: 不 (bù)"),
                        WordToken("希望", "xī wàng", "To hope", "Kosakata HSK 2: 希望 (xī wàng)"),
                        WordToken("爸爸", "bà ba", "(coll.) father; dad", "Kosakata HSK 2: 爸爸 (bà ba)"),
                        WordToken("妈妈", "mā ma", "Mama", "Kosakata HSK 2: 妈妈 (mā ma)"),
                        WordToken("看见", "kàn jiàn", "To see; to catch sight of", "Kosakata HSK 2: 看见 (kàn jiàn)"),
                        WordToken("自己", "zì jǐ", "Oneself; (attributive) one&#x27;s own", "Kosakata HSK 2: 自己 (zì jǐ)"),
                        WordToken("的", "de", "Possessive particle (of; &#x27;s)", "Kosakata HSK 2: 的 (de)"),
                        WordToken("成绩", "chéng jì", "Achievement", "Kosakata HSK 2: 成绩 (chéng jì)")
                    )
                ),
                Sentence(
                    id = "s_signatu_3",
                    hanzi = "所以他对爸爸说：\"好爸爸,你会闭着眼睛在纸上写名字吗?”",
                    pinyin = "suǒ yǐ tā duì bà ba shuō hǎo bà ba nǐ huì bì zhe yǎn jing zài zhǐ shàng xiě míng zi ma",
                    translation = "Maka dia merayu ayahnya: “Ayahku yang hebat, bisakah Ayah menuliskan tanda tangan di atas kertas dengan mata terpejam rapat?”",
                    tokens = listOf(
                        WordToken("所以", "suǒ yǐ", "Therefore", "Kosakata HSK 2: 所以 (suǒ yǐ)"),
                        WordToken("他", "tā", "He; him; his", "Kosakata HSK 2: 他 (tā)"),
                        WordToken("对", "duì", "Towards; at; for", "Kosakata HSK 2: 对 (duì)"),
                        WordToken("爸爸", "bà ba", "(coll.) father; dad", "Kosakata HSK 2: 爸爸 (bà ba)"),
                        WordToken("说", "shuō", "To speak; to talk; to say", "Kosakata HSK 2: 说 (shuō)"),
                        WordToken("好", "hǎo", "Good", "Kosakata HSK 2: 好 (hǎo)"),
                        WordToken("爸爸", "bà ba", "(coll.) father; dad", "Kosakata HSK 2: 爸爸 (bà ba)"),
                        WordToken("你", "nǐ", "You", "Kosakata HSK 2: 你 (nǐ)"),
                        WordToken("会", "huì", "Can; to have the skill; to know how to", "Kosakata HSK 2: 会 (huì)"),
                        WordToken("闭", "bì", "To close", "Kosakata HSK 2: 闭 (bì)"),
                        WordToken("着", "zhe", "Aspect particle indicating action in progress or ongoing state", "Kosakata HSK 2: 着 (zhe)"),
                        WordToken("眼睛", "yǎn jing", "Eye", "Kosakata HSK 2: 眼睛 (yǎn jing)"),
                        WordToken("在", "zài", "(of sb or sth) to be (located) at", "Kosakata HSK 2: 在 (zài)"),
                        WordToken("纸", "zhǐ", "Paper", "Kosakata HSK 2: 纸 (zhǐ)"),
                        WordToken("上", "shàng", "(noun suffix) on; above", "Kosakata HSK 2: 上 (shàng)"),
                        WordToken("写", "xiě", "To write", "Kosakata HSK 2: 写 (xiě)"),
                        WordToken("名字", "míng zi", "Name (of a person or thing)", "Kosakata HSK 2: 名字 (míng zi)"),
                        WordToken("吗", "ma", "(question particle for &quot;yes-no&quot; questions)", "Kosakata HSK 2: 吗 (ma)")
                    )
                ),
                Sentence(
                    id = "s_signatu_4",
                    hanzi = "爸爸回答：\"当然会啊，这很容易。”",
                    pinyin = "bà ba huí dá dāng rán huì a zhè hěn róng yì",
                    translation = "Ayah menjawab bangga: “Tentu saja bisa, itu kan hal yang sangat mudah!”",
                    tokens = listOf(
                        WordToken("爸爸", "bà ba", "(coll.) father; dad", "Kosakata HSK 2: 爸爸 (bà ba)"),
                        WordToken("回答", "huí dá", "To reply; to answer", "Kosakata HSK 2: 回答 (huí dá)"),
                        WordToken("当然", "dāng rán", "Certainly", "Kosakata HSK 2: 当然 (dāng rán)"),
                        WordToken("会", "huì", "Can; to have the skill; to know how to", "Kosakata HSK 2: 会 (huì)"),
                        WordToken("啊", "a", "Modal particle ending sentence, showing affirmation, approval, or consent", "Kosakata HSK 2: 啊 (a)"),
                        WordToken("这", "zhè", "This; these", "Kosakata HSK 2: 这 (zhè)"),
                        WordToken("很", "hěn", "Very; quite", "Kosakata HSK 2: 很 (hěn)"),
                        WordToken("容易", "róng yì", "Easy; straightforward", "Kosakata HSK 2: 容易 (róng yì)")
                    )
                ),
                Sentence(
                    id = "s_signatu_5",
                    hanzi = "儿子接着说：\"爸爸，请你闭着眼睛在这张试卷上写个名字吧。”",
                    pinyin = "ér zi jiē zhe shuō bà ba qǐng nǐ bì zhe yǎn jing zài zhè zhāng shì juàn shàng xiě gè míng zi ba",
                    translation = "Xiao Ming langsung menyodorkan kertas ujiannya: “Kalau begitu tolong Ayah pejamkan mata rapat-rapat lalu tanda tangani kertas ujian ini!”",
                    tokens = listOf(
                        WordToken("儿子", "ér zi", "Son", "Kosakata HSK 2: 儿子 (ér zi)"),
                        WordToken("接着", "jiē zhe", "Then", "Kosakata HSK 2: 接着 (jiē zhe)"),
                        WordToken("说", "shuō", "To speak; to talk; to say", "Kosakata HSK 2: 说 (shuō)"),
                        WordToken("爸爸", "bà ba", "(coll.) father; dad", "Kosakata HSK 2: 爸爸 (bà ba)"),
                        WordToken("请", "qǐng", "Please (do sth)", "Kosakata HSK 2: 请 (qǐng)"),
                        WordToken("你", "nǐ", "You", "Kosakata HSK 2: 你 (nǐ)"),
                        WordToken("闭", "bì", "To close", "Kosakata HSK 2: 闭 (bì)"),
                        WordToken("着", "zhe", "Aspect particle indicating action in progress or ongoing state", "Kosakata HSK 2: 着 (zhe)"),
                        WordToken("眼睛", "yǎn jing", "Eye", "Kosakata HSK 2: 眼睛 (yǎn jing)"),
                        WordToken("在", "zài", "(of sb or sth) to be (located) at", "Kosakata HSK 2: 在 (zài)"),
                        WordToken("这", "zhè", "This; these", "Kosakata HSK 2: 这 (zhè)"),
                        WordToken("张", "zhāng", "Classifier for flat objects, sheet", "Kosakata HSK 2: 张 (zhāng)"),
                        WordToken("试卷", "shì juàn", "Examination paper", "Kosakata HSK 2: 试卷 (shì juàn)"),
                        WordToken("上", "shàng", "(noun suffix) on; above", "Kosakata HSK 2: 上 (shàng)"),
                        WordToken("写", "xiě", "To write", "Kosakata HSK 2: 写 (xiě)"),
                        WordToken("个", "gè", "Classifier for people or objects in general", "Kosakata HSK 2: 个 (gè)"),
                        WordToken("名字", "míng zi", "Name (of a person or thing)", "Kosakata HSK 2: 名字 (míng zi)"),
                        WordToken("吧", "ba", "(modal particle indicating suggestion or surmise)", "Kosakata HSK 2: 吧 (ba)")
                    )
                )
            ),
            questions = listOf(
                StoryQuestion(
                    id = "q_signatu_1",
                    questionText = "数学考试结束后，学校老师对学生提出了什么要求？ (Tugas apa yang diinstruksikan oleh guru matematika seusai ujian?)",
                    options = listOf("把试卷撕掉重做 (Merobek kertas ujian dan mengulang)", "拿回家让父母在试卷上亲笔签名确认 (Membawa pulang lembar ujian untuk ditandatangani orang tua)", "把试卷藏在床底 (Menyembunyikan kertas ujian di bawah kasur)", "找高年级同学签字 (Minta tanda tangan kakak kelas)"),
                    correctAnswerIndex = 1,
                    explanation = "Kewajiban konfirmasi evaluasi belajar kepada wali murid di rumah."
                ),
                StoryQuestion(
                    id = "q_signatu_2",
                    questionText = "小明为什么极力想阻止父亲看清试卷上的内容？ (Mengapa Xiao Ming berusaha keras agar ayahnya tidak melihat isi lembar ujian?)",
                    options = listOf("因为考得太差，害怕挨批评 (Karena nilainya buruk dan takut dimarahi)", "因为写了给爸爸的情书 (Karena menulis surat cinta)", "因为试卷太脏 (Karena kertasnya kotor)", "因为这是国家机密 (Karena dokumen rahasia)"),
                    correctAnswerIndex = 0,
                    explanation = "Kekhawatiran khas anak sekolah saat menerima nilai ulangan yang kurang memuaskan."
                ),
                StoryQuestion(
                    id = "q_signatu_3",
                    questionText = "小明设计了怎样机智的圈套让父亲上钩？ (Jebakan muslihat cerdik apa yang dirancang Xiao Ming?)",
                    options = listOf("骗爸爸说是中奖彩票 (Membohongi ayah bahwa itu tiket lotre hadiah)", "先夸耀父亲能不能闭着眼睛写名字，引诱父亲闭眼在试卷上签字 (Memancing kebanggaan ayah apakah bisa tanda tangan sambil pejam mata lalu menyodorkan kertas)", "趁父亲睡觉偷盖手指印 (Mencuri sidik jari saat ayah tidur lelap)", "自己伪造笔迹 (Memalsukan tanda tangan sendiri)"),
                    correctAnswerIndex = 1,
                    explanation = "Strategi psikologis menantang kehebatan ayah agar mata sang ayah terpejam rapat."
                ),
                StoryQuestion(
                    id = "q_signatu_4",
                    questionText = "面对学习成绩波动，健康的亲子沟通应该提倡什么？ (Sikap komunikasi ideal apakah yang seharusnya dibangun antara orang tua dan anak?)",
                    options = listOf("以坦诚包容代替恐惧隐瞒，共同分析失分原因并查漏补缺 (Gantikan rasa takut dengan keterbukaan, bedah materi yang belum dikuasai bersama-sama)", "只要考砸就严厉惩罚 (Asal nilai turun langsung hukum keras)", "伪造签名应付差事 (Memalsukan tanda tangan demi formalitas)", "再也不去学校 (Putus asa tidak mau sekolah lagi)"),
                    correctAnswerIndex = 0,
                    explanation = "Membangun ruang aman keterbukaan agar anak tidak merasa perlu berbohong."
                )
            )
        ),
        // Cerita Mandarin Bean 130 (HSK 2): Wife's Singing (Nyanyian Istri)
        Story(
            id = "story_wifes_singing",
            titleHanzi = "妻子的歌声",
            titlePinyin = "Qīzi de Gēshēng",
            titleTranslation = "Wife's Singing (Nyanyian Istri)",
            level = "HSK 2",
            category = "Humor & Musik",
            description = "Kisah lucu seorang suami yang selalu lari ke balkon saat istrinya bernyanyi agar tetangga tidak mengira ada KDRT.",
            coverEmoji = "🎤",
            coverImageRes = R.drawable.cover_story_wifes_singing,
            estimatedReadMinutes = 2,
            sentences = listOf(
                Sentence(
                    id = "s_wifessi_1",
                    hanzi = "妻子很喜欢唱歌，但是她唱得非常难听，好像在哭一样。",
                    pinyin = "qī zi hěn xǐ huan chàng gē dàn shì tā chàng de fēi cháng nán tīng hǎo xiàng zài kū yī yàng",
                    translation = "Sang istri sangat gemar bernyanyi, namun nada suaranya sangat fals dan melengking menyeramkan seperti orang sedang meratap menangis.",
                    tokens = listOf(
                        WordToken("妻子", "qī zi", "Wife", "Kosakata HSK 2: 妻子 (qī zi)"),
                        WordToken("很", "hěn", "Very; quite", "Kosakata HSK 2: 很 (hěn)"),
                        WordToken("喜欢", "xǐ huan", "To like; to be fond of", "Kosakata HSK 2: 喜欢 (xǐ huan)"),
                        WordToken("唱歌", "chàng gē", "To sing a song", "Kosakata HSK 2: 唱歌 (chàng gē)"),
                        WordToken("但是", "dàn shì", "But; however", "Kosakata HSK 2: 但是 (dàn shì)"),
                        WordToken("她", "tā", "She", "Kosakata HSK 2: 她 (tā)"),
                        WordToken("唱", "chàng", "To sing", "Kosakata HSK 2: 唱 (chàng)"),
                        WordToken("得", "de", "Structural particle: used after a verb (or adjective as main verb), linking it to following phrase indicating effect, degree, possibility etc", "Kosakata HSK 2: 得 (de)"),
                        WordToken("非常", "fēi cháng", "Very; really", "Kosakata HSK 2: 非常 (fēi cháng)"),
                        WordToken("难听", "nán tīng", "Unpleasant to hear", "Kosakata HSK 2: 难听 (nán tīng)"),
                        WordToken("好像", "hǎo xiàng", "To seem like", "Kosakata HSK 2: 好像 (hǎo xiàng)"),
                        WordToken("在", "zài", "(used before a verb to indicate an action in progress)", "Kosakata HSK 2: 在 (zài)"),
                        WordToken("哭", "kū", "To cry; to weep", "Kosakata HSK 2: 哭 (kū)"),
                        WordToken("一样", "yī yàng", "Just like", "Kosakata HSK 2: 一样 (yī yàng)")
                    )
                ),
                Sentence(
                    id = "s_wifessi_2",
                    hanzi = "所以妻子一唱歌，丈夫就会离开房间去阳台。",
                    pinyin = "suǒ yǐ qī zi yī chàng gē zhàng fu jiù huì lí kāi fáng jiān qù yáng tái",
                    translation = "Karena itu setiap kali sang istri mulai bernyanyi, sang suami selalu bergegas keluar kamar dan berdiri di balkon luar.",
                    tokens = listOf(
                        WordToken("所以", "suǒ yǐ", "Therefore", "Kosakata HSK 2: 所以 (suǒ yǐ)"),
                        WordToken("妻子", "qī zi", "Wife", "Kosakata HSK 2: 妻子 (qī zi)"),
                        WordToken("一", "yī", "As soon as", "Kosakata HSK 2: 一 (yī)"),
                        WordToken("唱歌", "chàng gē", "To sing a song", "Kosakata HSK 2: 唱歌 (chàng gē)"),
                        WordToken("丈夫", "zhàng fu", "Husband", "Kosakata HSK 2: 丈夫 (zhàng fu)"),
                        WordToken("就", "jiù", "In that case; then", "Kosakata HSK 2: 就 (jiù)"),
                        WordToken("会", "huì", "To be likely to; to be sure to", "Kosakata HSK 2: 会 (huì)"),
                        WordToken("离开", "lí kāi", "To depart; to leave", "Kosakata HSK 2: 离开 (lí kāi)"),
                        WordToken("房间", "fáng jiān", "Room", "Kosakata HSK 2: 房间 (fáng jiān)"),
                        WordToken("去", "qù", "To go, to go to", "Kosakata HSK 2: 去 (qù)"),
                        WordToken("阳台", "yáng tái", "Balcony", "Kosakata HSK 2: 阳台 (yáng tái)")
                    )
                ),
                Sentence(
                    id = "s_wifessi_3",
                    hanzi = "有一天，妻子难过地问丈夫：\"为什么每次我唱歌的时候，你总是到阳台去？",
                    pinyin = "yǒu yī tiān qī zi nán guò de wèn zhàng fu wèi shén me měi cì wǒ chàng gē de shí hou nǐ zǒng shì dào yáng tái qù",
                    translation = "Suatu hari, sang istri dengan raut sedih bertanya: “Kenapa setiap kali aku bernyanyi kamu selalu kabur berdiri di balkon luar?",
                    tokens = listOf(
                        WordToken("有", "yǒu", "To have; there is", "Kosakata HSK 2: 有 (yǒu)"),
                        WordToken("一天", "yī tiān", "One day; a day", "Kosakata HSK 2: 一天 (yī tiān)"),
                        WordToken("妻子", "qī zi", "Wife", "Kosakata HSK 2: 妻子 (qī zi)"),
                        WordToken("难过", "nán guò", "To feel sad", "Kosakata HSK 2: 难过 (nán guò)"),
                        WordToken("地", "de", "-ly", "Kosakata HSK 2: 地 (de)"),
                        WordToken("问", "wèn", "To ask; to inquire", "Kosakata HSK 2: 问 (wèn)"),
                        WordToken("丈夫", "zhàng fu", "Husband", "Kosakata HSK 2: 丈夫 (zhàng fu)"),
                        WordToken("为什么", "wèi shén me", "Why?", "Kosakata HSK 2: 为什么 (wèi shén me)"),
                        WordToken("每", "měi", "Each", "Kosakata HSK 2: 每 (měi)"),
                        WordToken("次", "cì", "Classifier for enumerated events: time", "Kosakata HSK 2: 次 (cì)"),
                        WordToken("我", "wǒ", "I; me; my", "Kosakata HSK 2: 我 (wǒ)"),
                        WordToken("唱歌", "chàng gē", "To sing a song", "Kosakata HSK 2: 唱歌 (chàng gē)"),
                        WordToken("的", "de", "Possessive particle (of; &#x27;s)", "Kosakata HSK 2: 的 (de)"),
                        WordToken("时候", "shí hou", "Time", "Kosakata HSK 2: 时候 (shí hou)"),
                        WordToken("你", "nǐ", "You", "Kosakata HSK 2: 你 (nǐ)"),
                        WordToken("总是", "zǒng shì", "Always", "Kosakata HSK 2: 总是 (zǒng shì)"),
                        WordToken("到", "dào", "To leave for; to go to", "Kosakata HSK 2: 到 (dào)"),
                        WordToken("阳台", "yáng tái", "Balcony", "Kosakata HSK 2: 阳台 (yáng tái)"),
                        WordToken("去", "qù", "(after a verb of motion) movement away from the speaker; (after certain verbs) detachment or separation", "Kosakata HSK 2: 去 (qù)")
                    )
                ),
                Sentence(
                    id = "s_wifessi_4",
                    hanzi = "你不喜欢我的歌声吗？”",
                    pinyin = "nǐ bù xǐ huan wǒ de gē shēng ma",
                    translation = "Apakah kamu begitu membenci suaraku?”",
                    tokens = listOf(
                        WordToken("你", "nǐ", "You", "Kosakata HSK 2: 你 (nǐ)"),
                        WordToken("不", "bù", "No; not so", "Kosakata HSK 2: 不 (bù)"),
                        WordToken("喜欢", "xǐ huan", "To like; to be fond of", "Kosakata HSK 2: 喜欢 (xǐ huan)"),
                        WordToken("我", "wǒ", "I; me; my", "Kosakata HSK 2: 我 (wǒ)"),
                        WordToken("的", "de", "Possessive particle (of; &#x27;s)", "Kosakata HSK 2: 的 (de)"),
                        WordToken("歌声", "gē shēng", "Singing voice", "Kosakata HSK 2: 歌声 (gē shēng)"),
                        WordToken("吗", "ma", "(question particle for &quot;yes-no&quot; questions)", "Kosakata HSK 2: 吗 (ma)")
                    )
                ),
                Sentence(
                    id = "s_wifessi_5",
                    hanzi = "丈夫回答：\"我喜欢你的歌声，但是我也想让大家知道，我并没有打你。”",
                    pinyin = "zhàng fu huí dá wǒ xǐ huan nǐ de gē shēng dàn shì wǒ yě xiǎng ràng dà jiā zhī dào wǒ bìng méi yǒu dǎ nǐ",
                    translation = "Sang suami buru-buru menjawab: “Bukan begitu sayang, aku suka nyanyianmu, tapi aku berdiri di balkon agar para tetangga di luar tahu bahwa aku sama sekali tidak sedang memukuli atau menyiksamu!”",
                    tokens = listOf(
                        WordToken("丈夫", "zhàng fu", "Husband", "Kosakata HSK 2: 丈夫 (zhàng fu)"),
                        WordToken("回答", "huí dá", "To reply; to answer", "Kosakata HSK 2: 回答 (huí dá)"),
                        WordToken("我", "wǒ", "I; me; my", "Kosakata HSK 2: 我 (wǒ)"),
                        WordToken("喜欢", "xǐ huan", "To like; to be fond of", "Kosakata HSK 2: 喜欢 (xǐ huan)"),
                        WordToken("你", "nǐ", "You", "Kosakata HSK 2: 你 (nǐ)"),
                        WordToken("的", "de", "Possessive particle (of; &#x27;s)", "Kosakata HSK 2: 的 (de)"),
                        WordToken("歌声", "gē shēng", "Singing voice", "Kosakata HSK 2: 歌声 (gē shēng)"),
                        WordToken("但是", "dàn shì", "But; however", "Kosakata HSK 2: 但是 (dàn shì)"),
                        WordToken("我", "wǒ", "I; me; my", "Kosakata HSK 2: 我 (wǒ)"),
                        WordToken("也", "yě", "Also; too; as well; (not ...) either", "Kosakata HSK 2: 也 (yě)"),
                        WordToken("想", "xiǎng", "To desire; to want (to)", "Kosakata HSK 2: 想 (xiǎng)"),
                        WordToken("让", "ràng", "To permit", "Kosakata HSK 2: 让 (ràng)"),
                        WordToken("大家", "dà jiā", "Everyone", "Kosakata HSK 2: 大家 (dà jiā)"),
                        WordToken("知道", "zhī dào", "To know; to become aware of", "Kosakata HSK 2: 知道 (zhī dào)"),
                        WordToken("我", "wǒ", "I; me; my", "Kosakata HSK 2: 我 (wǒ)"),
                        WordToken("并", "bìng", "(not) at all", "Kosakata HSK 2: 并 (bìng)"),
                        WordToken("没有", "méi yǒu", "Haven&#x27;t", "Kosakata HSK 2: 没有 (méi yǒu)"),
                        WordToken("打", "dǎ", "To hit; to strike", "Kosakata HSK 2: 打 (dǎ)"),
                        WordToken("你", "nǐ", "You", "Kosakata HSK 2: 你 (nǐ)")
                    )
                )
            ),
            questions = listOf(
                StoryQuestion(
                    id = "q_wifessi_1",
                    questionText = "妻子的歌喉唱功在故事中有着怎样的生动描写？ (Bagaimana penggambaran mutu vokal nyanyian sang istri dalam cerita?)",
                    options = listOf("宛如天籁之音动人心弦 (Merdu bagaikan suara bidadari)", "非常难听刺耳，凄厉得好像在号啕大哭一样 (Sangat fals dan melengking menyayat hati mirip orang menangis ratapan)", "嗓音非常低沉 (Suaranya sangat ngebass)", "唱得和歌星一模一样 (Persis penyanyi rekaman profesional)"),
                    correctAnswerIndex = 1,
                    explanation = "Nada vokal yang fals meliuk-liuk menyerupai jeritan orang kesakitan."
                ),
                StoryQuestion(
                    id = "q_wifessi_2",
                    questionText = "每当妻子一展歌喉时，丈夫都会做出什么固定举动？ (Tindakan rutin apa yang selalu dilakukan suami begitu sang istri mulai bernyanyi?)",
                    options = listOf("跟着一起引吭高歌 (Ikut bernyanyi keras)", "迅速离开房间跑到阳台外面站着 (Bergegas keluar kamar dan berdiri di balkon pekarangan)", "把耳朵堵住睡觉 (Menyumbat telinga lalu tidur)", "立刻关紧窗户 (Menutup rapat semua jendela)"),
                    correctAnswerIndex = 1,
                    explanation = "Suami langsung mengungsi keluar ke balkon rumah."
                ),
                StoryQuestion(
                    id = "q_wifessi_3",
                    questionText = "丈夫坚决站在阳台上的真正“自保”动机是什么？ (Motif sejati apa di balik kebiasaan suami berdiri di balkon?)",
                    options = listOf("在阳台上欣赏夜空风景 (Menikmati udara sejuk pemandangan malam)", "向大楼邻居们自证清白，证明自己并没有在家里殴打施暴妻子 (Membuktikan kepada para tetangga bahwa jeritan itu bukan akibat KDRT atau pukulan suami!)", "练习广播体操 (Latihan senam kesegaran jasmani)", "接听秘密电话 (Menerima telepon rahasia)"),
                    correctAnswerIndex = 1,
                    explanation = "Puncak humor: saking melengkingnya nada sang istri, ia takut tetangga melapor polisi menduga ada penyiksaan di rumah!"
                ),
                StoryQuestion(
                    id = "q_wifessi_4",
                    questionText = "这个幽默段子以夸张手法调侃了夫妻生活中的什么情趣？ (Sisi interaksi rumah tangga apa yang disorot jenaka dalam lelucon ini?)",
                    options = listOf("夫妻反目成仇 (Permusuhan suami istri)", "彼此包容缺点，在善意自嘲与诙谐化解中维系的融洽默契 (Penerimaan tulus atas kekurangan pasangan dengan humor yang mencairkan suasana)", "家庭暴力的严重性 (Bahaya kekerasan nyata)", "邻里关系的恶劣 (Keretakan hubungan bertetangga)"),
                    correctAnswerIndex = 1,
                    explanation = "Canda tawa khas pasangan yang menerima keunikan pasangan dengan lapang dada."
                )
            )
        ),
        // Cerita Mandarin Bean 131 (HSK 2): The Simplest Common Sense (Akal Sehat yang Paling Sederhana)
        Story(
            id = "story_simplest_common_sense",
            titleHanzi = "简单的常识",
            titlePinyin = "Jiǎndān de Chángshí",
            titleTranslation = "The Simplest Common Sense (Akal Sehat yang Paling Sederhana)",
            level = "HSK 2",
            category = "Sains & Humor",
            description = "Kritik cerdas terhadap kaum terpelajar yang sibuk berteori rumit hingga melupakan fakta nyata bahwa hujan tidak mematikan orang.",
            coverEmoji = "💧",
            coverImageRes = R.drawable.cover_story_simplest_common_sense,
            estimatedReadMinutes = 2,
            sentences = listOf(
                Sentence(
                    id = "s_thesimp_1",
                    hanzi = "大学生们在公园聊天，有一个人问：”一滴水如果从很高的地方落下来，会不会把人砸死？”",
                    pinyin = "dà xué shēng men zài gōng yuán liáo tiān yǒu yī gè rén wèn yī dī shuǐ rú guǒ cóng hěn gāo de dì fang luò xià lái huì bù huì bǎ rén zá sǐ",
                    translation = "Sekelompok mahasiswa sedang berkumpul di taman mendiskusikan teori fisika; salah seorang bertanya: “Jika setetes air jatuh dari tempat yang teramat tinggi di angkasa, apakah tetesan air itu bisa menimpa orang hingga tewas?”",
                    tokens = listOf(
                        WordToken("大学生", "dà xué shēng", "University student; college student", "Kosakata HSK 2: 大学生 (dà xué shēng)"),
                        WordToken("们", "men", "Plural marker for pronouns, and nouns referring to individuals", "Kosakata HSK 2: 们 (men)"),
                        WordToken("在", "zài", "(of sb or sth) to be (located) at", "Kosakata HSK 2: 在 (zài)"),
                        WordToken("公园", "gōng yuán", "Park (for public recreation)", "Kosakata HSK 2: 公园 (gōng yuán)"),
                        WordToken("聊天", "liáo tiān", "To chat; to gossip", "Kosakata HSK 2: 聊天 (liáo tiān)"),
                        WordToken("有", "yǒu", "To have; there is", "Kosakata HSK 2: 有 (yǒu)"),
                        WordToken("一", "yī", "One", "Kosakata HSK 2: 一 (yī)"),
                        WordToken("个", "gè", "Classifier for people or objects in general", "Kosakata HSK 2: 个 (gè)"),
                        WordToken("人", "rén", "Person; people", "Kosakata HSK 2: 人 (rén)"),
                        WordToken("问", "wèn", "To ask; to inquire", "Kosakata HSK 2: 问 (wèn)"),
                        WordToken("一", "yī", "One", "Kosakata HSK 2: 一 (yī)"),
                        WordToken("滴", "dī", "Classifier for drops of liquid", "Kosakata HSK 2: 滴 (dī)"),
                        WordToken("水", "shuǐ", "Water", "Kosakata HSK 2: 水 (shuǐ)"),
                        WordToken("如果", "rú guǒ", "If; in case; in the event that", "Kosakata HSK 2: 如果 (rú guǒ)"),
                        WordToken("从", "cóng", "From; through; via", "Kosakata HSK 2: 从 (cóng)"),
                        WordToken("很", "hěn", "Very; quite", "Kosakata HSK 2: 很 (hěn)"),
                        WordToken("高", "gāo", "High", "Kosakata HSK 2: 高 (gāo)"),
                        WordToken("的", "de", "Possessive particle (of; &#x27;s)", "Kosakata HSK 2: 的 (de)"),
                        WordToken("地方", "dì fang", "Place; location; area; space; territory", "Kosakata HSK 2: 地方 (dì fang)"),
                        WordToken("落", "luò", "To fall or drop", "Kosakata HSK 2: 落 (luò)"),
                        WordToken("下来", "xià lái", "(after verb of motion, indicates motion down and towards us, also fig.)", "Kosakata HSK 2: 下来 (xià lái)"),
                        WordToken("会", "huì", "To be likely to; to be sure to", "Kosakata HSK 2: 会 (huì)"),
                        WordToken("不会", "bù huì", "Will not", "Kosakata HSK 2: 不会 (bù huì)"),
                        WordToken("把", "bǎ", "(used to put the object before the verb: 把[ba3] + {noun} + {verb})", "Kosakata HSK 2: 把 (bǎ)"),
                        WordToken("人", "rén", "Person; people", "Kosakata HSK 2: 人 (rén)"),
                        WordToken("砸", "zá", "To smash", "Kosakata HSK 2: 砸 (zá)"),
                        WordToken("死", "sǐ", "To die", "Kosakata HSK 2: 死 (sǐ)")
                    )
                ),
                Sentence(
                    id = "s_thesimp_2",
                    hanzi = "大家想了很多办法去计算，用了近一个小时，还是没有计算出来。",
                    pinyin = "dà jiā xiǎng le hěn duō bàn fǎ qù jì suàn yòng le jìn yī gè xiǎo shí hái shi méi yǒu jì suàn chu lai",
                    translation = "Mereka pun sibuk menyusun aneka rumus rumit dan menghitung gravitasi hampir selama satu jam penuh, namun belum juga menemukan kesimpulan pasti.",
                    tokens = listOf(
                        WordToken("大家", "dà jiā", "Everyone", "Kosakata HSK 2: 大家 (dà jiā)"),
                        WordToken("想", "xiǎng", "To think (about)", "Kosakata HSK 2: 想 (xiǎng)"),
                        WordToken("了", "le", "(completed action marker)", "Kosakata HSK 2: 了 (le)"),
                        WordToken("很", "hěn", "Very; quite", "Kosakata HSK 2: 很 (hěn)"),
                        WordToken("多", "duō", "Many; much; more; a lot of", "Kosakata HSK 2: 多 (duō)"),
                        WordToken("办法", "bàn fǎ", "Way of handling sth; means; measure; (practical) solution to a problem", "Kosakata HSK 2: 办法 (bàn fǎ)"),
                        WordToken("去", "qù", "To go, to go to", "Kosakata HSK 2: 去 (qù)"),
                        WordToken("计算", "jì suàn", "To calculate; to compute", "Kosakata HSK 2: 计算 (jì suàn)"),
                        WordToken("用", "yòng", "To use; to make use of; to employ", "Kosakata HSK 2: 用 (yòng)"),
                        WordToken("了", "le", "(completed action marker)", "Kosakata HSK 2: 了 (le)"),
                        WordToken("近", "jìn", "Approximately", "Kosakata HSK 2: 近 (jìn)"),
                        WordToken("一", "yī", "One", "Kosakata HSK 2: 一 (yī)"),
                        WordToken("个", "gè", "Classifier for people or objects in general", "Kosakata HSK 2: 个 (gè)"),
                        WordToken("小时", "xiǎo shí", "Hour", "Kosakata HSK 2: 小时 (xiǎo shí)"),
                        WordToken("还是", "hái shi", "Still (as before)", "Kosakata HSK 2: 还是 (hái shi)"),
                        WordToken("没有", "méi yǒu", "Haven&#x27;t", "Kosakata HSK 2: 没有 (méi yǒu)"),
                        WordToken("计算", "jì suàn", "To calculate; to compute", "Kosakata HSK 2: 计算 (jì suàn)"),
                        WordToken("出来", "chu lai", "(after a verb, indicates coming out, completion of an action, or ability to discern or detect)", "Kosakata HSK 2: 出来 (chu lai)")
                    )
                ),
                Sentence(
                    id = "s_thesimp_3",
                    hanzi = "有一个人路过时听到了他们的谈话，就问：”你们没有看见过雨吗？",
                    pinyin = "yǒu yī gè rén lù guò shí tīng dào le tā men de tán huà jiù wèn nǐ men méi yǒu kàn jiàn guo yǔ ma",
                    translation = "Seorang kakek tua yang melintas mendengar perdebatan mereka lalu berseru heran: “Apakah kalian semua seumur hidup belum pernah melihat air hujan turun dari langit?",
                    tokens = listOf(
                        WordToken("有", "yǒu", "To have; there is", "Kosakata HSK 2: 有 (yǒu)"),
                        WordToken("一", "yī", "One", "Kosakata HSK 2: 一 (yī)"),
                        WordToken("个", "gè", "Classifier for people or objects in general", "Kosakata HSK 2: 个 (gè)"),
                        WordToken("人", "rén", "Person; people", "Kosakata HSK 2: 人 (rén)"),
                        WordToken("路过", "lù guò", "To pass by or through", "Kosakata HSK 2: 路过 (lù guò)"),
                        WordToken("时", "shí", "When", "Kosakata HSK 2: 时 (shí)"),
                        WordToken("听到", "tīng dào", "To hear", "Kosakata HSK 2: 听到 (tīng dào)"),
                        WordToken("了", "le", "(completed action marker)", "Kosakata HSK 2: 了 (le)"),
                        WordToken("他们", "tā men", "They; them", "Kosakata HSK 2: 他们 (tā men)"),
                        WordToken("的", "de", "Possessive particle (of; &#x27;s)", "Kosakata HSK 2: 的 (de)"),
                        WordToken("谈话", "tán huà", "Talk", "Kosakata HSK 2: 谈话 (tán huà)"),
                        WordToken("就", "jiù", "Merely; nothing else but; simply; just; precisely; exactly", "Kosakata HSK 2: 就 (jiù)"),
                        WordToken("问", "wèn", "To ask; to inquire", "Kosakata HSK 2: 问 (wèn)"),
                        WordToken("你们", "nǐ men", "You (plural)", "Kosakata HSK 2: 你们 (nǐ men)"),
                        WordToken("没有", "méi yǒu", "Haven&#x27;t", "Kosakata HSK 2: 没有 (méi yǒu)"),
                        WordToken("看见", "kàn jiàn", "To see; to catch sight of", "Kosakata HSK 2: 看见 (kàn jiàn)"),
                        WordToken("过", "guo", "(experienced action marker)", "Kosakata HSK 2: 过 (guo)"),
                        WordToken("雨", "yǔ", "Rain", "Kosakata HSK 2: 雨 (yǔ)"),
                        WordToken("吗", "ma", "(question particle for &quot;yes-no&quot; questions)", "Kosakata HSK 2: 吗 (ma)")
                    )
                ),
                Sentence(
                    id = "s_thesimp_4",
                    hanzi = "雨能砸死人吗？”",
                    pinyin = "yǔ néng zá sǐ rén ma",
                    translation = "Pernahkah kalian mendengar ada orang tewas terbentur tetesan air hujan?”",
                    tokens = listOf(
                        WordToken("雨", "yǔ", "Rain", "Kosakata HSK 2: 雨 (yǔ)"),
                        WordToken("能", "néng", "Can", "Kosakata HSK 2: 能 (néng)"),
                        WordToken("砸", "zá", "To smash", "Kosakata HSK 2: 砸 (zá)"),
                        WordToken("死", "sǐ", "To die", "Kosakata HSK 2: 死 (sǐ)"),
                        WordToken("人", "rén", "Person; people", "Kosakata HSK 2: 人 (rén)"),
                        WordToken("吗", "ma", "(question particle for &quot;yes-no&quot; questions)", "Kosakata HSK 2: 吗 (ma)")
                    )
                ),
                Sentence(
                    id = "s_thesimp_5",
                    hanzi = "这时，学生们发现自己忘记了最简单的常识。",
                    pinyin = "zhè shí xué shēng men fā xiàn zì jǐ wàng jì le zuì jiǎn dān de cháng shí",
                    translation = "Seketika itu juga para mahasiswa tersadar bahwa mereka telah melupakan akal sehat paling mendasar dalam kehidupan nyata.",
                    tokens = listOf(
                        WordToken("这", "zhè", "This; these", "Kosakata HSK 2: 这 (zhè)"),
                        WordToken("时", "shí", "O&#x27;clock", "Kosakata HSK 2: 时 (shí)"),
                        WordToken("学生", "xué shēng", "Student", "Kosakata HSK 2: 学生 (xué shēng)"),
                        WordToken("们", "men", "Plural marker for pronouns, and nouns referring to individuals", "Kosakata HSK 2: 们 (men)"),
                        WordToken("发现", "fā xiàn", "To notice; to become aware of", "Kosakata HSK 2: 发现 (fā xiàn)"),
                        WordToken("自己", "zì jǐ", "Oneself; (attributive) one&#x27;s own", "Kosakata HSK 2: 自己 (zì jǐ)"),
                        WordToken("忘记", "wàng jì", "To forget", "Kosakata HSK 2: 忘记 (wàng jì)"),
                        WordToken("了", "le", "(completed action marker)", "Kosakata HSK 2: 了 (le)"),
                        WordToken("最", "zuì", "(before an adjective or verb) to the highest degree; (the) most ...; -est", "Kosakata HSK 2: 最 (zuì)"),
                        WordToken("简单", "jiǎn dān", "Simple; not complicated", "Kosakata HSK 2: 简单 (jiǎn dān)"),
                        WordToken("的", "de", "Possessive particle (of; &#x27;s)", "Kosakata HSK 2: 的 (de)"),
                        WordToken("常识", "cháng shí", "Common sense; general knowledge", "Kosakata HSK 2: 常识 (cháng shí)")
                    )
                )
            ),
            questions = listOf(
                StoryQuestion(
                    id = "q_thesimp_1",
                    questionText = "一群大学生在公园里热火朝天地争辩探讨什么学术命题？ (Topik fisika apakah yang didebatkan para mahasiswa di taman?)",
                    options = listOf("一滴水从极高空坠落会不会把人当场砸死 (Apakah setetes air yang jatuh dari ketinggian langit bisa menghantam orang hingga tewas)", "树叶为什么会在秋天变黄 (Kenapa daun menguning di musim gugur)", "鸟儿为什么会飞翔 (Kenapa burung bisa terbang)", "太阳从哪边升起 (Dari arah mana matahari terbit)"),
                    correctAnswerIndex = 0,
                    explanation = "Eksperimen pikiran teoretis tentang percepatan gravitasi dan massa terminal tetesan air."
                ),
                StoryQuestion(
                    id = "q_thesimp_2",
                    questionText = "为了得出结论，学生们付出了怎样大费周章的努力？ (Usaha rumit apa yang dikerahkan oleh mahasiswa dalam diskusi tersebut?)",
                    options = listOf("用了近一个小时列出海量复杂公式计算重力加速度与阻力 (Menghabiskan hampir satu jam merumuskan aneka persamaan rumit dan kalkulasi)", "直接做高空实验 (Langsung naik helikopter uji coba)", "上网搜索正确答案 (Mencari di mesin pencari)", "问了十个教授 (Bertanya ke sepuluh profesor)"),
                    correctAnswerIndex = 0,
                    explanation = "Terjebak dalam belantara kalkulasi abstrak di atas kertas."
                ),
                StoryQuestion(
                    id = "q_thesimp_3",
                    questionText = "路过的普通路人是如何一针见血点破这一荒谬讨论的？ (Pertanyaan lugas apa yang dilontarkan orang lewat meruntuhkan perdebatan rumit itu?)",
                    options = listOf("建议他们去买高精度计算机 (Menyarankan beli superkomputer)", "反问他们难道从没见过天上下雨？雨水何曾砸死过路人？ (Menanyakan apakah mereka belum pernah melihat hujan turun dan pernahkah ada orang tewas kena tetes hujan?)", "给他们一人一把伞 (Membagikan payung ke setiap mahasiswa)", "大骂他们浪费时间 (Memarahi mereka membuang waktu)"),
                    correctAnswerIndex = 1,
                    explanation = "Fakta empiris alamiah: tetesan air hujan dari awan ribuan meter tidak pernah melukai manusia karena gesekan udara."
                ),
                StoryQuestion(
                    id = "q_thesimp_4",
                    questionText = "这个寓言式的小故事揭示了认识论上的什么深刻真理？ (Kearifan filosofis mendalam apa yang disimpulkan dari kisah ini?)",
                    options = listOf("理论公式毫无价值 (Teori rumus tidak ada gunanya)", "实践出真知，切莫脱离生活常识与客观实际闭门造车 (Kebenaran lahir dari kenyataan hidup, jangan mengawang-awang memutus nalar dari akal sehat objektif)", "雨水有毒不要淋雨 (Air hujan beracun jangan mandi hujan)", "不要去公园讨论学习 (Dilarang berdiskusi di taman)"),
                    correctAnswerIndex = 1,
                    explanation = "Ilmu pengetahuan sejati harus selalu berakar pada observasi realitas dan logika akal sehat."
                )
            )
        ),
        // Cerita Mandarin Bean 132 (HSK 2): Be Afraid of the Axe (Takut Pada Kapak)
        Story(
            id = "story_be_afraid_of_the_axe",
            titleHanzi = "害怕斧头",
            titlePinyin = "Hàipà Fǔtóu",
            titleTranslation = "Be Afraid of the Axe (Takut Pada Kapak)",
            level = "HSK 2",
            category = "Humor & Alam",
            description = "Kepolosan logika seorang anak kecil yang menyimpulkan sang paman tidak berani memarahi penebang karena kapak masih dipegang.",
            coverEmoji = "🪓",
            coverImageRes = R.drawable.cover_story_be_afraid_of_the_axe,
            estimatedReadMinutes = 2,
            sentences = listOf(
                Sentence(
                    id = "s_beafrai_1",
                    hanzi = "一天晚上，吃完饭后，妈妈对七岁的女儿说：”有一个叔叔请一个男孩去砍柴，没想到男孩把他最爱的树砍掉了。",
                    pinyin = "yī tiān wǎn shang chī wán fàn hòu mā ma duì qī suì de nǚ ér shuō yǒu yī gè shū shu qǐng yī gè nán hái qù kǎn chái méi xiǎng dào nán hái bǎ tā zuì ài de shù kǎn diào le",
                    translation = "Suatu malam sehabis makan malam, ibu menceritakan sebuah dongeng kepada putrinya yang berusia tujuh tahun: “Ada seorang paman meminta bantuan anak tetangga untuk menebang kayu bakar, tak disangka anak itu malah keliru menebang pohon buah kesayangan sang paman. Paman itu sangat marah, tetapi dia tidak langsung memarahi anak itu di tempat; menurutmu kenapa?”",
                    tokens = listOf(
                        WordToken("一天", "yī tiān", "One day; a day", "Kosakata HSK 2: 一天 (yī tiān)"),
                        WordToken("晚上", "wǎn shang", "Evening", "Kosakata HSK 2: 晚上 (wǎn shang)"),
                        WordToken("吃", "chī", "To eat; to consume", "Kosakata HSK 2: 吃 (chī)"),
                        WordToken("完", "wán", "To finish", "Kosakata HSK 2: 完 (wán)"),
                        WordToken("饭", "fàn", "Meal", "Kosakata HSK 2: 饭 (fàn)"),
                        WordToken("后", "hòu", "Afterwards", "Kosakata HSK 2: 后 (hòu)"),
                        WordToken("妈妈", "mā ma", "Mama", "Kosakata HSK 2: 妈妈 (mā ma)"),
                        WordToken("对", "duì", "Towards; at; for", "Kosakata HSK 2: 对 (duì)"),
                        WordToken("七", "qī", "Seven", "Kosakata HSK 2: 七 (qī)"),
                        WordToken("岁", "suì", "Classifier for years (of age)", "Kosakata HSK 2: 岁 (suì)"),
                        WordToken("的", "de", "Possessive particle (of; &#x27;s)", "Kosakata HSK 2: 的 (de)"),
                        WordToken("女儿", "nǚ ér", "Daughter", "Kosakata HSK 2: 女儿 (nǚ ér)"),
                        WordToken("说", "shuō", "To speak; to talk; to say", "Kosakata HSK 2: 说 (shuō)"),
                        WordToken("有", "yǒu", "To have; there is", "Kosakata HSK 2: 有 (yǒu)"),
                        WordToken("一", "yī", "One", "Kosakata HSK 2: 一 (yī)"),
                        WordToken("个", "gè", "Classifier for people or objects in general", "Kosakata HSK 2: 个 (gè)"),
                        WordToken("叔叔", "shū shu", "Father&#x27;s younger brother; paternal uncle", "Kosakata HSK 2: 叔叔 (shū shu)"),
                        WordToken("请", "qǐng", "To ask", "Kosakata HSK 2: 请 (qǐng)"),
                        WordToken("一", "yī", "One", "Kosakata HSK 2: 一 (yī)"),
                        WordToken("个", "gè", "Classifier for people or objects in general", "Kosakata HSK 2: 个 (gè)"),
                        WordToken("男孩", "nán hái", "Boy", "Kosakata HSK 2: 男孩 (nán hái)"),
                        WordToken("去", "qù", "To go, to go to", "Kosakata HSK 2: 去 (qù)"),
                        WordToken("砍", "kǎn", "To chop", "Kosakata HSK 2: 砍 (kǎn)"),
                        WordToken("柴", "chái", "Firewood", "Kosakata HSK 2: 柴 (chái)"),
                        WordToken("没", "méi", "(negative prefix for verbs) have not; not", "Kosakata HSK 2: 没 (méi)"),
                        WordToken("想到", "xiǎng dào", "To think of", "Kosakata HSK 2: 想到 (xiǎng dào)"),
                        WordToken("男孩", "nán hái", "Boy", "Kosakata HSK 2: 男孩 (nán hái)"),
                        WordToken("把", "bǎ", "(used to put the object before the verb: 把[ba3] + {noun} + {verb})", "Kosakata HSK 2: 把 (bǎ)"),
                        WordToken("他", "tā", "He; him; his", "Kosakata HSK 2: 他 (tā)"),
                        WordToken("最", "zuì", "(before an adjective or verb) to the highest degree; (the) most ...; -est", "Kosakata HSK 2: 最 (zuì)"),
                        WordToken("爱", "ài", "To love; to be fond of; to like", "Kosakata HSK 2: 爱 (ài)"),
                        WordToken("的", "de", "Possessive particle (of; &#x27;s)", "Kosakata HSK 2: 的 (de)"),
                        WordToken("树", "shù", "Tree", "Kosakata HSK 2: 树 (shù)"),
                        WordToken("砍", "kǎn", "To chop", "Kosakata HSK 2: 砍 (kǎn)"),
                        WordToken("掉", "diào", "(used after certain verbs to express completion, fulfillment, removal etc)", "Kosakata HSK 2: 掉 (diào)"),
                        WordToken("了", "le", "(completed action marker)", "Kosakata HSK 2: 了 (le)")
                    )
                ),
                Sentence(
                    id = "s_beafrai_2",
                    hanzi = "这位叔叔非常生气，但是他没有马上去骂那个男孩，你觉得是为什么?”",
                    pinyin = "zhè wèi shū shu fēi cháng shēng qì dàn shì tā méi yǒu mǎ shàng qù mà nà gè nán hái nǐ jué de shì wèi shén me",
                    translation = "Putrinya dengan cerdik menjawab: “Paman itu melihat anak tersebut masih memegang kapak tajam di tangannya, jadi dia memilih menunggu sampai kapak itu diletakkan barulah berani memarahinya!”",
                    tokens = listOf(
                        WordToken("这", "zhè", "This; these", "Kosakata HSK 2: 这 (zhè)"),
                        WordToken("位", "wèi", "Classifier for people (honorific)", "Kosakata HSK 2: 位 (wèi)"),
                        WordToken("叔叔", "shū shu", "Father&#x27;s younger brother; paternal uncle", "Kosakata HSK 2: 叔叔 (shū shu)"),
                        WordToken("非常", "fēi cháng", "Very; really", "Kosakata HSK 2: 非常 (fēi cháng)"),
                        WordToken("生气", "shēng qì", "To get angry; to be furious", "Kosakata HSK 2: 生气 (shēng qì)"),
                        WordToken("但是", "dàn shì", "But; however", "Kosakata HSK 2: 但是 (dàn shì)"),
                        WordToken("他", "tā", "He; him; his", "Kosakata HSK 2: 他 (tā)"),
                        WordToken("没有", "méi yǒu", "Haven&#x27;t", "Kosakata HSK 2: 没有 (méi yǒu)"),
                        WordToken("马上", "mǎ shàng", "At once", "Kosakata HSK 2: 马上 (mǎ shàng)"),
                        WordToken("去", "qù", "To go, to go to", "Kosakata HSK 2: 去 (qù)"),
                        WordToken("骂", "mà", "To scold", "Kosakata HSK 2: 骂 (mà)"),
                        WordToken("那", "nà", "(specifier) that; the; those", "Kosakata HSK 2: 那 (nà)"),
                        WordToken("个", "gè", "Classifier for people or objects in general", "Kosakata HSK 2: 个 (gè)"),
                        WordToken("男孩", "nán hái", "Boy", "Kosakata HSK 2: 男孩 (nán hái)"),
                        WordToken("你", "nǐ", "You", "Kosakata HSK 2: 你 (nǐ)"),
                        WordToken("觉得", "jué de", "To think that ...; to feel that ...", "Kosakata HSK 2: 觉得 (jué de)"),
                        WordToken("是", "shì", "To be (followed by substantives only)", "Kosakata HSK 2: 是 (shì)"),
                        WordToken("为什么", "wèi shén me", "Why?", "Kosakata HSK 2: 为什么 (wèi shén me)")
                    )
                ),
                Sentence(
                    id = "s_beafrai_3",
                    hanzi = "女儿回答：”这位叔叔看到了男孩手上的斧头，所以他想等男孩放下斧头后再去骂他。”",
                    pinyin = "nǚ ér huí dá zhè wèi shū shu kàn dào le nán hái shǒu shàng de fǔ tóu suǒ yǐ tā xiǎng děng nán hái fàng xià fǔ tóu hòu zài qù mà tā",
                    translation = "Ibu tertawa mendengar logika tajam putrinya yang mengutamakan keselamatan diri.",
                    tokens = listOf(
                        WordToken("女儿", "nǚ ér", "Daughter", "Kosakata HSK 2: 女儿 (nǚ ér)"),
                        WordToken("回答", "huí dá", "To reply; to answer", "Kosakata HSK 2: 回答 (huí dá)"),
                        WordToken("这", "zhè", "This; these", "Kosakata HSK 2: 这 (zhè)"),
                        WordToken("位", "wèi", "Classifier for people (honorific)", "Kosakata HSK 2: 位 (wèi)"),
                        WordToken("叔叔", "shū shu", "Father&#x27;s younger brother; paternal uncle", "Kosakata HSK 2: 叔叔 (shū shu)"),
                        WordToken("看到", "kàn dào", "To see", "Kosakata HSK 2: 看到 (kàn dào)"),
                        WordToken("了", "le", "(completed action marker)", "Kosakata HSK 2: 了 (le)"),
                        WordToken("男孩", "nán hái", "Boy", "Kosakata HSK 2: 男孩 (nán hái)"),
                        WordToken("手", "shǒu", "Hand", "Kosakata HSK 2: 手 (shǒu)"),
                        WordToken("上", "shàng", "(noun suffix) on; above", "Kosakata HSK 2: 上 (shàng)"),
                        WordToken("的", "de", "Possessive particle (of; &#x27;s)", "Kosakata HSK 2: 的 (de)"),
                        WordToken("斧头", "fǔ tóu", "Ax", "Kosakata HSK 2: 斧头 (fǔ tóu)"),
                        WordToken("所以", "suǒ yǐ", "Therefore", "Kosakata HSK 2: 所以 (suǒ yǐ)"),
                        WordToken("他", "tā", "He; him; his", "Kosakata HSK 2: 他 (tā)"),
                        WordToken("想", "xiǎng", "To desire; to want (to)", "Kosakata HSK 2: 想 (xiǎng)"),
                        WordToken("等", "děng", "To wait for; to await", "Kosakata HSK 2: 等 (děng)"),
                        WordToken("男孩", "nán hái", "Boy", "Kosakata HSK 2: 男孩 (nán hái)"),
                        WordToken("放下", "fàng xià", "To lay down; to put down", "Kosakata HSK 2: 放下 (fàng xià)"),
                        WordToken("斧头", "fǔ tóu", "Ax", "Kosakata HSK 2: 斧头 (fǔ tóu)"),
                        WordToken("后", "hòu", "Afterwards", "Kosakata HSK 2: 后 (hòu)"),
                        WordToken("再", "zài", "Then (after sth, and not until then)", "Kosakata HSK 2: 再 (zài)"),
                        WordToken("去", "qù", "To go, to go to", "Kosakata HSK 2: 去 (qù)"),
                        WordToken("骂", "mà", "To scold", "Kosakata HSK 2: 骂 (mà)"),
                        WordToken("他", "tā", "He; him; his", "Kosakata HSK 2: 他 (tā)")
                    )
                )
            ),
            questions = listOf(
                StoryQuestion(
                    id = "q_beafrai_1",
                    questionText = "故事中那位生气的叔叔面临了什么令人心疼的损失？ (Kerugian apa yang dialami sang paman dalam dongeng ibu?)",
                    options = listOf("钱包被偷了 (Dompet uang dicuri)", "请来砍柴的少年不慎将他最心爱珍视的果树砍倒了 (Pohon buah kesayangannya keliru ditebang habis oleh penebang kayu)", "房子被火烧了 (Rumahnya terbakar)", "马跑丢了 (Kudanya kabur)"),
                    correctAnswerIndex = 1,
                    explanation = "Pohon kesayangan sang paman hancur tertebang karena salah paham."
                ),
                StoryQuestion(
                    id = "q_beafrai_2",
                    questionText = "叔叔虽然怒火中烧，但在现场却反常地克制没有立刻发作斥责，为什么？ (Tindakan pengendalian diri apa yang ditunjukkan sang paman di tempat kejadian?)",
                    options = listOf("他非常大度毫不介意 (Dia sangat dermawan tidak peduli)", "他极其愤怒却没有立刻冲上前去痛骂男孩 (Dia sangat murka namun menahan diri tidak langsung melabrak anak itu)", "他立刻打了那个男孩 (Dia langsung memukul anak itu)", "他哭着跑回家 (Dia menangis lari pulang)"),
                    correctAnswerIndex = 1,
                    explanation = "Menahan amarah demi keselamatan situasi."
                ),
                StoryQuestion(
                    id = "q_beafrai_3",
                    questionText = "七岁女儿站在儿童直觉视角给出了什么逗趣的解释？ (Jawaban cerdik apa yang dilontarkan anak perempuan saat ditanya alasannya?)",
                    options = listOf("叔叔哑巴不会说话 (Paman itu bisu)", "因为男孩手里还紧握着锋利的斧头，叔叔打算等他放下武器再骂！ (Karena anak itu masih memegang kapak tajam, paman menunggu sampai kapak ditaruh barulah berani memarahi!)", "因为那棵树本来就枯死了 (Karena pohonnya memang sudah kering)", "因为天黑看不清 (Karena gelap gulita)"),
                    correctAnswerIndex = 1,
                    explanation = "Logika instingtif anak kecil: jangan memprovokasi orang yang sedang memegang benda tajam!"
                ),
                StoryQuestion(
                    id = "q_beafrai_4",
                    questionText = "这个小故事展示了儿童在面对冲突情境时怎样的心理直觉？ (Insting naluriah apa yang tercermin dalam cara berpikir sang anak?)",
                    options = listOf("好勇斗狠 (Gemar bertindak nekat)", "高度敏锐的安全自保本能与生动朴素的因果推理 (Naluri keselamatan diri yang tajam dan logika sebab-akibat yang natural)", "懦弱胆怯 (Sifat pengecut tanpa nyali)", "毫无判断力 (Tidak punya akal pertimbangan)"),
                    correctAnswerIndex = 1,
                    explanation = "Kepolosan anak yang mengutamakan keamanan fisik secara jernih dan spontan."
                )
            )
        ),
        // Cerita Mandarin Bean 133 (HSK 2): Reason for Failing (Alasan Tidak Lulus)
        Story(
            id = "story_reason_for_failing",
            titleHanzi = "不及格的原因",
            titlePinyin = "Bù Jígé de Yuányīn",
            titleTranslation = "Reason for Failing (Alasan Tidak Lulus)",
            level = "HSK 2",
            category = "Sekolah & Ujian",
            description = "Jawaban polos seorang siswi SD yang menjawab 'kan hasilnya sama saja' saat ditanya rumus perkalian bolak-balik 2x3 dan 3x2.",
            coverEmoji = "🔢",
            coverImageRes = R.drawable.cover_story_reason_for_failing,
            estimatedReadMinutes = 2,
            sentences = listOf(
                Sentence(
                    id = "s_reasonf_1",
                    hanzi = "上二年级的女儿数学考试不及格，妈妈问：\"为什么？",
                    pinyin = "shàng èr nián jí de nǚ ér shù xué kǎo shì bù jí gé mā ma wèn wèi shén me",
                    translation = "Putri kecil yang duduk di bangku kelas dua SD mendapatkan nilai tidak lulus pada ujian matematika; ibu bertanya cemas: “Kenapa nilaimu bisa merah?",
                    tokens = listOf(
                        WordToken("上", "shàng", "To attend (class or university)", "Kosakata HSK 2: 上 (shàng)"),
                        WordToken("二", "èr", "Two", "Kosakata HSK 2: 二 (èr)"),
                        WordToken("年级", "nián jí", "Grade", "Kosakata HSK 2: 年级 (nián jí)"),
                        WordToken("的", "de", "Possessive particle (of; &#x27;s)", "Kosakata HSK 2: 的 (de)"),
                        WordToken("女儿", "nǚ ér", "Daughter", "Kosakata HSK 2: 女儿 (nǚ ér)"),
                        WordToken("数学", "shù xué", "Mathematics", "Kosakata HSK 2: 数学 (shù xué)"),
                        WordToken("考试", "kǎo shì", "Exam", "Kosakata HSK 2: 考试 (kǎo shì)"),
                        WordToken("不", "bù", "No; not so", "Kosakata HSK 2: 不 (bù)"),
                        WordToken("及格", "jí gé", "To pass an exam or a test", "Kosakata HSK 2: 及格 (jí gé)"),
                        WordToken("妈妈", "mā ma", "Mama", "Kosakata HSK 2: 妈妈 (mā ma)"),
                        WordToken("问", "wèn", "To ask; to inquire", "Kosakata HSK 2: 问 (wèn)"),
                        WordToken("为什么", "wèi shén me", "Why?", "Kosakata HSK 2: 为什么 (wèi shén me)")
                    )
                ),
                Sentence(
                    id = "s_reasonf_2",
                    hanzi = "今天的考试很难吗？”",
                    pinyin = "jīn tiān de kǎo shì hěn nán ma",
                    translation = "Apakah soal ujiannya terlalu sulit?”",
                    tokens = listOf(
                        WordToken("今天", "jīn tiān", "Today", "Kosakata HSK 2: 今天 (jīn tiān)"),
                        WordToken("的", "de", "Possessive particle (of; &#x27;s)", "Kosakata HSK 2: 的 (de)"),
                        WordToken("考试", "kǎo shì", "Exam", "Kosakata HSK 2: 考试 (kǎo shì)"),
                        WordToken("很", "hěn", "Very; quite", "Kosakata HSK 2: 很 (hěn)"),
                        WordToken("难", "nán", "Difficult (to...)", "Kosakata HSK 2: 难 (nán)"),
                        WordToken("吗", "ma", "(question particle for &quot;yes-no&quot; questions)", "Kosakata HSK 2: 吗 (ma)")
                    )
                ),
                Sentence(
                    id = "s_reasonf_3",
                    hanzi = "女儿回答：\"不难，我都会做。",
                    pinyin = "nǚ ér huí dá bù nán wǒ dōu huì zuò",
                    translation = "Putrinya menjawab percaya diri: “Tidak sulit kok Bu, semuanya bisa saya jawab.",
                    tokens = listOf(
                        WordToken("女儿", "nǚ ér", "Daughter", "Kosakata HSK 2: 女儿 (nǚ ér)"),
                        WordToken("回答", "huí dá", "To reply; to answer", "Kosakata HSK 2: 回答 (huí dá)"),
                        WordToken("不", "bù", "No; not so", "Kosakata HSK 2: 不 (bù)"),
                        WordToken("难", "nán", "Difficult (to...)", "Kosakata HSK 2: 难 (nán)"),
                        WordToken("我", "wǒ", "I; me; my", "Kosakata HSK 2: 我 (wǒ)"),
                        WordToken("都", "dōu", "All; both; entirely", "Kosakata HSK 2: 都 (dōu)"),
                        WordToken("会", "huì", "Can; to have the skill; to know how to", "Kosakata HSK 2: 会 (huì)"),
                        WordToken("做", "zuò", "To do; to engage in; to hold (a party etc)", "Kosakata HSK 2: 做 (zuò)")
                    )
                ),
                Sentence(
                    id = "s_reasonf_4",
                    hanzi = "老师问我2乘3等于多少？",
                    pinyin = "lǎo shī wèn wǒ chéng děng yú duō shao",
                    translation = "Ibu Guru bertanya kepada saya berapa hasil dua kali tiga?",
                    tokens = listOf(
                        WordToken("老师", "lǎo shī", "Teacher", "Kosakata HSK 2: 老师 (lǎo shī)"),
                        WordToken("问", "wèn", "To ask; to inquire", "Kosakata HSK 2: 问 (wèn)"),
                        WordToken("我", "wǒ", "I; me; my", "Kosakata HSK 2: 我 (wǒ)"),
                        WordToken("乘", "chéng", "To ride", "Kosakata HSK 2: 乘 (chéng)"),
                        WordToken("等于", "děng yú", "To equal", "Kosakata HSK 2: 等于 (děng yú)"),
                        WordToken("多少", "duō shao", "How much?; how many?", "Kosakata HSK 2: 多少 (duō shao)")
                    )
                ),
                Sentence(
                    id = "s_reasonf_5",
                    hanzi = "我说等于6。”",
                    pinyin = "wǒ shuō děng yú",
                    translation = "Saya jawab hasilnya enam.”",
                    tokens = listOf(
                        WordToken("我", "wǒ", "I; me; my", "Kosakata HSK 2: 我 (wǒ)"),
                        WordToken("说", "shuō", "To speak; to talk; to say", "Kosakata HSK 2: 说 (shuō)"),
                        WordToken("等于", "děng yú", "To equal", "Kosakata HSK 2: 等于 (děng yú)")
                    )
                ),
                Sentence(
                    id = "s_reasonf_6",
                    hanzi = "妈妈说：\"这没有错啊！”",
                    pinyin = "mā ma shuō zhè méi yǒu cuò a",
                    translation = "Ibu berkata: “Jawaban itu kan benar, tidak ada yang salah!”",
                    tokens = listOf(
                        WordToken("妈妈", "mā ma", "Mama", "Kosakata HSK 2: 妈妈 (mā ma)"),
                        WordToken("说", "shuō", "To speak; to talk; to say", "Kosakata HSK 2: 说 (shuō)"),
                        WordToken("这", "zhè", "This; these", "Kosakata HSK 2: 这 (zhè)"),
                        WordToken("没有", "méi yǒu", "Doesn&#x27;t exist", "Kosakata HSK 2: 没有 (méi yǒu)"),
                        WordToken("错", "cuò", "Mistake", "Kosakata HSK 2: 错 (cuò)"),
                        WordToken("啊", "a", "Modal particle ending sentence, showing affirmation, approval, or consent", "Kosakata HSK 2: 啊 (a)")
                    )
                ),
                Sentence(
                    id = "s_reasonf_7",
                    hanzi = "女儿接着说：\"老师又问我3乘2等于多少？”",
                    pinyin = "nǚ ér jiē zhe shuō lǎo shī yòu wèn wǒ chéng děng yú duō shao",
                    translation = "Putrinya melanjutkan ceritanya: “Lalu Ibu Guru bertanya lagi berapa hasil tiga kali dua?”",
                    tokens = listOf(
                        WordToken("女儿", "nǚ ér", "Daughter", "Kosakata HSK 2: 女儿 (nǚ ér)"),
                        WordToken("接着", "jiē zhe", "Then", "Kosakata HSK 2: 接着 (jiē zhe)"),
                        WordToken("说", "shuō", "To speak; to talk; to say", "Kosakata HSK 2: 说 (shuō)"),
                        WordToken("老师", "lǎo shī", "Teacher", "Kosakata HSK 2: 老师 (lǎo shī)"),
                        WordToken("又", "yòu", "(once) again", "Kosakata HSK 2: 又 (yòu)"),
                        WordToken("问", "wèn", "To ask; to inquire", "Kosakata HSK 2: 问 (wèn)"),
                        WordToken("我", "wǒ", "I; me; my", "Kosakata HSK 2: 我 (wǒ)"),
                        WordToken("乘", "chéng", "To ride", "Kosakata HSK 2: 乘 (chéng)"),
                        WordToken("等于", "děng yú", "To equal", "Kosakata HSK 2: 等于 (děng yú)"),
                        WordToken("多少", "duō shao", "How much?; how many?", "Kosakata HSK 2: 多少 (duō shao)")
                    )
                ),
                Sentence(
                    id = "s_reasonf_8",
                    hanzi = "妈妈说：\"这不是一样吗？”",
                    pinyin = "mā ma shuō zhè bù shì yī yàng ma",
                    translation = "Ibu menyahut heran: “Lho, bukankah hasilnya sama-sama enam?”",
                    tokens = listOf(
                        WordToken("妈妈", "mā ma", "Mama", "Kosakata HSK 2: 妈妈 (mā ma)"),
                        WordToken("说", "shuō", "To speak; to talk; to say", "Kosakata HSK 2: 说 (shuō)"),
                        WordToken("这", "zhè", "This; these", "Kosakata HSK 2: 这 (zhè)"),
                        WordToken("不", "bù", "No; not so", "Kosakata HSK 2: 不 (bù)"),
                        WordToken("是", "shì", "To be (followed by substantives only)", "Kosakata HSK 2: 是 (shì)"),
                        WordToken("一样", "yī yàng", "Same", "Kosakata HSK 2: 一样 (yī yàng)"),
                        WordToken("吗", "ma", "(question particle for &quot;yes-no&quot; questions)", "Kosakata HSK 2: 吗 (ma)")
                    )
                ),
                Sentence(
                    id = "s_reasonf_9",
                    hanzi = "女儿说：\"对啊，我当时也是这么说的。”",
                    pinyin = "nǚ ér shuō duì a wǒ dāng shí yě shì zhè me shuō de",
                    translation = "Putrinya berseru polos: “Nah betul kan Bu, waktu di kelas saya juga menjawab persis seperti itu: ‘Bukankah hasilnya sama saja, ngapain ditanya lagi!’”",
                    tokens = listOf(
                        WordToken("女儿", "nǚ ér", "Daughter", "Kosakata HSK 2: 女儿 (nǚ ér)"),
                        WordToken("说", "shuō", "To speak; to talk; to say", "Kosakata HSK 2: 说 (shuō)"),
                        WordToken("对", "duì", "Right; correct", "Kosakata HSK 2: 对 (duì)"),
                        WordToken("啊", "a", "Modal particle ending sentence, showing affirmation, approval, or consent", "Kosakata HSK 2: 啊 (a)"),
                        WordToken("我", "wǒ", "I; me; my", "Kosakata HSK 2: 我 (wǒ)"),
                        WordToken("当时", "dāng shí", "Then; at that time", "Kosakata HSK 2: 当时 (dāng shí)"),
                        WordToken("也", "yě", "Also; too; as well; (not ...) either", "Kosakata HSK 2: 也 (yě)"),
                        WordToken("是", "shì", "Indeed (used for emphasis)", "Kosakata HSK 2: 是 (shì)"),
                        WordToken("这么", "zhè me", "This way", "Kosakata HSK 2: 这么 (zhè me)"),
                        WordToken("说", "shuō", "To speak; to talk; to say", "Kosakata HSK 2: 说 (shuō)"),
                        WordToken("的", "de", "Emphatic particle (used at the end of a declarative sentence for emphasis)", "Kosakata HSK 2: 的 (de)")
                    )
                )
            ),
            questions = listOf(
                StoryQuestion(
                    id = "q_reasonf_1",
                    questionText = "小女孩在学校二年级数学考试中遭遇了什么学业挫折？ (Hasil evaluasi apa yang diperoleh sang putri pada ulangan matematika?)",
                    options = listOf("考了满分一百分 (Memperoleh nilai seratus sempurna)", "考试成绩不及格 (Mendapatkan nilai tidak lulus / nilai merah)", "把试卷弄丢了 (Kehilangan lembar ujian)", "被评为数学代表 (Terpilih menjadi juara olimpiade)"),
                    correctAnswerIndex = 1,
                    explanation = "Hasil nilai ujian sang siswi berada di bawah batas ketuntasan."
                ),
                StoryQuestion(
                    id = "q_reasonf_2",
                    questionText = "当老师提问“2乘3等于几”时，女孩的回答是正确的吗？ (Apakah jawaban pertama saat ditanya '2 dikali 3' sudah tepat?)",
                    options = listOf("不正确，她回答了十 (Salah, ia menjawab sepuluh)", "完全正确，她回答等于6 (Sangat tepat, ia menjawab enam)", "她交了白卷 (Ia mengosongkan jawaban)", "她回答等于五 (Ia menjawab lima)"),
                    correctAnswerIndex = 1,
                    explanation = "Jawaban perkalian pertama dijawab dengan benar yaitu 6."
                ),
                StoryQuestion(
                    id = "q_reasonf_3",
                    questionText = "真正导致女孩被扣分判错的关键症结发生在哪里？ (Di manakah letak masalah fatal yang membuat nilainya hangus?)",
                    options = listOf("她把试卷撕了 (Ia menyobek kertas)", "老师又问“3乘2等于几”，她没有算数而是当面顶撞说“这不是和刚才一样吗” (Saat guru bertanya '3 dikali 2', alih-alih menjawab angka 6 ia malah menyahut 'Lho bukankah hasilnya sama saja ngapain ditanya lagi!')", "她在考场睡觉 (Ia tidur di kelas)", "她抄同桌的答案 (Ia menyontek teman)"),
                    correctAnswerIndex = 1,
                    explanation = "Puncak humor: sifat komutatif matematika diartikan sebagai pertanyaan berulang yang tidak perlu dijawab lagi!"
                ),
                StoryQuestion(
                    id = "q_reasonf_4",
                    questionText = "这个幽默对话生动展现了低年级儿童认知中的什么盲区？ (Karakter kognitif anak usia dini apa yang diilustrasikan dalam adegan ini?)",
                    options = listOf("故意与老师对抗 (Sengaja melawan guru)", "理解了算理等价性却忽略了应试规则中规范作答的程式要求 (Paham substansi kesamaan hasil namun belum paham etika formalitas lembar ujian)", "完全没有数学智商 (Sama sekali tidak paham hitungan)", "语言表达障碍 (Gangguan tutur kata)"),
                    correctAnswerIndex = 1,
                    explanation = "Kepolosan anak yang menjawab secara logika praktis tanpa menyadari aturan formal evaluasi."
                )
            )
        ),
        // Cerita Mandarin Bean 134 (HSK 2): Mother's Joke (Candaan Ibu)
        Story(
            id = "story_mothers_joke",
            titleHanzi = "妈妈的玩笑",
            titlePinyin = "Māma de Wánxiào",
            titleTranslation = "Mother's Joke (Candaan Ibu)",
            level = "HSK 2",
            category = "Keluarga & Humor",
            description = "Candaan klasik orang tua kepada anaknya yang bertanya apakah dirinya anak angkat, lalu dijawab 'bukan, kamu anak pungut dari sampah'.",
            coverEmoji = "📺",
            coverImageRes = R.drawable.cover_story_mothers_joke,
            estimatedReadMinutes = 2,
            sentences = listOf(
                Sentence(
                    id = "s_mothers_1",
                    hanzi = "星期日，五岁的小天和妈妈一起在家看电视。",
                    pinyin = "Xīng qī rì wǔ suì de xiǎo tiān hé mā ma yī qǐ zài jiā kàn diàn shì",
                    translation = "Hari Minggu, Xiao Tian yang berusia lima tahun sedang menonton siaran televisi bersama ibunya di ruang tengah.",
                    tokens = listOf(
                        WordToken("星期日", "Xīng qī rì", "Sunday", "Kosakata HSK 2: 星期日 (Xīng qī rì)"),
                        WordToken("五", "wǔ", "Five", "Kosakata HSK 2: 五 (wǔ)"),
                        WordToken("岁", "suì", "Classifier for years (of age)", "Kosakata HSK 2: 岁 (suì)"),
                        WordToken("的", "de", "Possessive particle (of; &#x27;s)", "Kosakata HSK 2: 的 (de)"),
                        WordToken("小天", "xiǎo tiān", "A personal name, literally “little sky", "Kosakata HSK 2: 小天 (xiǎo tiān)"),
                        WordToken("和", "hé", "And; together with", "Kosakata HSK 2: 和 (hé)"),
                        WordToken("妈妈", "mā ma", "Mama", "Kosakata HSK 2: 妈妈 (mā ma)"),
                        WordToken("一起", "yī qǐ", "Together; in company (with)", "Kosakata HSK 2: 一起 (yī qǐ)"),
                        WordToken("在", "zài", "(of sb or sth) to be (located) at", "Kosakata HSK 2: 在 (zài)"),
                        WordToken("家", "jiā", "Home", "Kosakata HSK 2: 家 (jiā)"),
                        WordToken("看", "kàn", "To see; to look at", "Kosakata HSK 2: 看 (kàn)"),
                        WordToken("电视", "diàn shì", "Television; tv", "Kosakata HSK 2: 电视 (diàn shì)")
                    )
                ),
                Sentence(
                    id = "s_mothers_2",
                    hanzi = "电视里说到领养孩子，小天很担心自己是被领养的孩子，所以问妈妈：\"妈妈，我是你领养的吗？”",
                    pinyin = "diàn shì lǐ shuō dào lǐng yǎng hái zi xiǎo tiān hěn dān xīn zì jǐ shì bèi lǐng yǎng de hái zi suǒ yǐ wèn mā ma mā ma wǒ shì nǐ lǐng yǎng de ma",
                    translation = "Di televisi sedang menayangkan kisah tentang anak angkat adopsi, Xiao Tian menjadi cemas dan takut jangan-jangan dirinya juga anak angkat, maka ia bertanya: “Ibu, apakah aku ini anak angkat adopsi Ibu?”",
                    tokens = listOf(
                        WordToken("电视", "diàn shì", "Television; tv", "Kosakata HSK 2: 电视 (diàn shì)"),
                        WordToken("里", "lǐ", "Lining", "Kosakata HSK 2: 里 (lǐ)"),
                        WordToken("说", "shuō", "To speak; to talk; to say", "Kosakata HSK 2: 说 (shuō)"),
                        WordToken("到", "dào", "To reach; to arrive", "Kosakata HSK 2: 到 (dào)"),
                        WordToken("领养", "lǐng yǎng", "To adopt (a child, pet etc)", "Kosakata HSK 2: 领养 (lǐng yǎng)"),
                        WordToken("孩子", "hái zi", "Child", "Kosakata HSK 2: 孩子 (hái zi)"),
                        WordToken("小天", "xiǎo tiān", "A personal name, literally “little sky", "Kosakata HSK 2: 小天 (xiǎo tiān)"),
                        WordToken("很", "hěn", "Very; quite", "Kosakata HSK 2: 很 (hěn)"),
                        WordToken("担心", "dān xīn", "To worry", "Kosakata HSK 2: 担心 (dān xīn)"),
                        WordToken("自己", "zì jǐ", "Oneself; (attributive) one&#x27;s own", "Kosakata HSK 2: 自己 (zì jǐ)"),
                        WordToken("是", "shì", "To be (followed by substantives only)", "Kosakata HSK 2: 是 (shì)"),
                        WordToken("被", "bèi", "Used to indicate passive voice (placed before the doer of the action like &quot;by&quot; in english passive-voice sentences, or, if the doer is not mentioned, before the verb)", "Kosakata HSK 2: 被 (bèi)"),
                        WordToken("领养", "lǐng yǎng", "To adopt (a child, pet etc)", "Kosakata HSK 2: 领养 (lǐng yǎng)"),
                        WordToken("的", "de", "Possessive particle (of; &#x27;s)", "Kosakata HSK 2: 的 (de)"),
                        WordToken("孩子", "hái zi", "Child", "Kosakata HSK 2: 孩子 (hái zi)"),
                        WordToken("所以", "suǒ yǐ", "Therefore", "Kosakata HSK 2: 所以 (suǒ yǐ)"),
                        WordToken("问", "wèn", "To ask; to inquire", "Kosakata HSK 2: 问 (wèn)"),
                        WordToken("妈妈", "mā ma", "Mama", "Kosakata HSK 2: 妈妈 (mā ma)"),
                        WordToken("妈妈", "mā ma", "Mama", "Kosakata HSK 2: 妈妈 (mā ma)"),
                        WordToken("我", "wǒ", "I; me; my", "Kosakata HSK 2: 我 (wǒ)"),
                        WordToken("是", "shì", "To be (followed by substantives only)", "Kosakata HSK 2: 是 (shì)"),
                        WordToken("你", "nǐ", "You", "Kosakata HSK 2: 你 (nǐ)"),
                        WordToken("领养", "lǐng yǎng", "To adopt (a child, pet etc)", "Kosakata HSK 2: 领养 (lǐng yǎng)"),
                        WordToken("的", "de", "Possessive particle (of; &#x27;s)", "Kosakata HSK 2: 的 (de)"),
                        WordToken("吗", "ma", "(question particle for &quot;yes-no&quot; questions)", "Kosakata HSK 2: 吗 (ma)")
                    )
                ),
                Sentence(
                    id = "s_mothers_3",
                    hanzi = "\"傻孩子，当然不是！”",
                    pinyin = "shǎ hái zi dāng rán bù shì",
                    translation = "“Anak bodoh, tentu saja bukan!”",
                    tokens = listOf(
                        WordToken("傻", "shǎ", "Foolish", "Kosakata HSK 2: 傻 (shǎ)"),
                        WordToken("孩子", "hái zi", "Child", "Kosakata HSK 2: 孩子 (hái zi)"),
                        WordToken("当然", "dāng rán", "Certainly", "Kosakata HSK 2: 当然 (dāng rán)"),
                        WordToken("不", "bù", "No; not so", "Kosakata HSK 2: 不 (bù)"),
                        WordToken("是", "shì", "To be (followed by substantives only)", "Kosakata HSK 2: 是 (shì)")
                    )
                ),
                Sentence(
                    id = "s_mothers_4",
                    hanzi = "妈妈回答。",
                    pinyin = "mā ma huí dá",
                    translation = "ibu menenangkan.",
                    tokens = listOf(
                        WordToken("妈妈", "mā ma", "Mama", "Kosakata HSK 2: 妈妈 (mā ma)"),
                        WordToken("回答", "huí dá", "To reply; to answer", "Kosakata HSK 2: 回答 (huí dá)")
                    )
                ),
                Sentence(
                    id = "s_mothers_5",
                    hanzi = "小天高兴地说：\"我就知道我是你亲生的!",
                    pinyin = "xiǎo tiān gāo xìng de shuō wǒ jiù zhī dào wǒ shì nǐ qīn shēng de",
                    translation = "Xiao Tian tersenyum lega dan gembira: “Aku sudah menduga bahwa aku adalah anak kandung yang dilahirkan Ibu!",
                    tokens = listOf(
                        WordToken("小天", "xiǎo tiān", "A personal name, literally “little sky", "Kosakata HSK 2: 小天 (xiǎo tiān)"),
                        WordToken("高兴", "gāo xìng", "Happy", "Kosakata HSK 2: 高兴 (gāo xìng)"),
                        WordToken("地", "de", "-ly", "Kosakata HSK 2: 地 (de)"),
                        WordToken("说", "shuō", "To speak; to talk; to say", "Kosakata HSK 2: 说 (shuō)"),
                        WordToken("我", "wǒ", "I; me; my", "Kosakata HSK 2: 我 (wǒ)"),
                        WordToken("就", "jiù", "Merely; nothing else but; simply; just; precisely; exactly", "Kosakata HSK 2: 就 (jiù)"),
                        WordToken("知道", "zhī dào", "To know; to become aware of", "Kosakata HSK 2: 知道 (zhī dào)"),
                        WordToken("我", "wǒ", "I; me; my", "Kosakata HSK 2: 我 (wǒ)"),
                        WordToken("是", "shì", "To be (followed by substantives only)", "Kosakata HSK 2: 是 (shì)"),
                        WordToken("你", "nǐ", "You", "Kosakata HSK 2: 你 (nǐ)"),
                        WordToken("亲生", "qīn shēng", "One&#x27;s own (child)", "Kosakata HSK 2: 亲生 (qīn shēng)"),
                        WordToken("的", "de", "Emphatic particle (used at the end of a declarative sentence for emphasis)", "Kosakata HSK 2: 的 (de)")
                    )
                ),
                Sentence(
                    id = "s_mothers_6",
                    hanzi = "\"",
                    pinyin = "",
                    translation = "”",
                    tokens = listOf(

                    )
                ),
                Sentence(
                    id = "s_mothers_7",
                    hanzi = "妈妈想和小天开个玩笑，就说：\"也不是，你是我捡来的！”",
                    pinyin = "mā ma xiǎng hé xiǎo tiān kāi gè wán xiào jiù shuō yě bù shì nǐ shì wǒ jiǎn lái de",
                    translation = "Ibu berniat bercanda menggoda kepolosannya lalu menambahkan: “Bukan anak angkat, kamu itu anak yang Ibu pungut dari tumpukan sampah!”",
                    tokens = listOf(
                        WordToken("妈妈", "mā ma", "Mama", "Kosakata HSK 2: 妈妈 (mā ma)"),
                        WordToken("想", "xiǎng", "To desire; to want (to)", "Kosakata HSK 2: 想 (xiǎng)"),
                        WordToken("和", "hé", "And; together with", "Kosakata HSK 2: 和 (hé)"),
                        WordToken("小天", "xiǎo tiān", "A personal name, literally “little sky", "Kosakata HSK 2: 小天 (xiǎo tiān)"),
                        WordToken("开", "kāi", "(of ships, vehicles, troops etc) to start", "Kosakata HSK 2: 开 (kāi)"),
                        WordToken("个", "gè", "Classifier for people or objects in general", "Kosakata HSK 2: 个 (gè)"),
                        WordToken("玩笑", "wán xiào", "Joke", "Kosakata HSK 2: 玩笑 (wán xiào)"),
                        WordToken("就", "jiù", "Merely; nothing else but; simply; just; precisely; exactly", "Kosakata HSK 2: 就 (jiù)"),
                        WordToken("说", "shuō", "To speak; to talk; to say", "Kosakata HSK 2: 说 (shuō)"),
                        WordToken("也", "yě", "Also; too; as well; (not ...) either", "Kosakata HSK 2: 也 (yě)"),
                        WordToken("不", "bù", "No; not so", "Kosakata HSK 2: 不 (bù)"),
                        WordToken("是", "shì", "To be (followed by substantives only)", "Kosakata HSK 2: 是 (shì)"),
                        WordToken("你", "nǐ", "You", "Kosakata HSK 2: 你 (nǐ)"),
                        WordToken("是", "shì", "To be (followed by substantives only)", "Kosakata HSK 2: 是 (shì)"),
                        WordToken("我", "wǒ", "I; me; my", "Kosakata HSK 2: 我 (wǒ)"),
                        WordToken("捡", "jiǎn", "To pick up; to collect; to gather", "Kosakata HSK 2: 捡 (jiǎn)"),
                        WordToken("来", "lái", "Hither (directional complement for motion toward the speaker)", "Kosakata HSK 2: 来 (lái)"),
                        WordToken("的", "de", "Emphatic particle (used at the end of a declarative sentence for emphasis)", "Kosakata HSK 2: 的 (de)")
                    )
                )
            ),
            questions = listOf(
                StoryQuestion(
                    id = "q_mothers_1",
                    questionText = "五岁的小天在看电视时产生了怎样的心理担忧？ (Kecemasan apa yang membayangi pikiran Xiao Tian saat menonton televisi?)",
                    options = listOf("担心电视机要爆炸 (Takut televisi meledak)", "看到关于领养孤儿的节目，害怕自己也是父母抱养的养子 (Melihat tayangan adopsi anak, cemas jangan-jangan dirinya juga anak angkat)", "担心明天要去上幼儿园 (Takut besok masuk sekolah)", "害怕晚上做噩梦 (Takut bermimpi buruk)"),
                    correctAnswerIndex = 1,
                    explanation = "Kekhawatiran kepolosan anak yang terpicu tayangan siaran televisi."
                ),
                StoryQuestion(
                    id = "q_mothers_2",
                    questionText = "当母亲斩钉截铁否认“不是领养的”之后，小天的反应是什么？ (Bagaimana respons lega Xiao Tian mendengar penegasan pertama ibunya?)",
                    options = listOf("放声大哭 (Menangis kencang)", "高兴地欢呼我就知道自己是妈妈亲生的骨肉 (Bersorak gembira yakin bahwa dirinya adalah anak kandung)", "依然怀疑不信 (Tetap tidak percaya)", "跑去问爸爸 (Berlari bertanya ke ayah)"),
                    correctAnswerIndex = 1,
                    explanation = "Rasa lega yang meluap mengukuhkan ikatan batin dengan sang ibu."
                ),
                StoryQuestion(
                    id = "q_mothers_3",
                    questionText = "母亲为了逗弄孩子的稚气，随后开了一句什么中式家庭经典玩笑？ (Candaan legendaris khas orang tua apa yang dilontarkan sang ibu menggoda anaknya?)",
                    options = listOf("说他是外星人带来的 (Mengatakan dia dibawa makhluk luar angkasa)", "半开玩笑地说“你不是抱养的，你是妈妈从路上捡来的！” (Bergurau mengatakan 'Kamu bukan anak adopsi, tapi kamu anak yang Ibu pungut di jalan!')", "说要送他去少林寺 (Mau mengirimnya ke kuil)", "说要换一个新的儿子 (Mau menukarnya dengan anak baru)"),
                    correctAnswerIndex = 1,
                    explanation = "Lelucon klasik sejuta orang tua di Asia yang kerap memicu tawa haru anak kecil."
                ),
                StoryQuestion(
                    id = "q_mothers_4",
                    questionText = "这种亲子间的日常逗趣体现了家庭关系的什么风貌？ (Atmosfer kasih sayang apa yang terlukis dari gurauan hangat ini?)",
                    options = listOf("缺乏关爱冷漠虐待 (Kurang kasih sayang dan kejam)", "轻松诙谐、充满人间烟火气与深厚包容的温暖亲情 (Suasana akrab, jenaka, dan penuh kehangatan cinta tulus orang tua)", "家庭矛盾激化 (Pertikaian keluarga memuncak)", "家长权威专制 (Otoritarianisme orang tua)"),
                    correctAnswerIndex = 1,
                    explanation = "Humor kasih sayang sederhana yang menjadi memori manis masa kecil."
                )
            )
        ),
        // Cerita Mandarin Bean 135 (HSK 2): Swimming Lesson (Les Renang Xiao Ming)
        Story(
            id = "story_swimming_lesson_xiaoming",
            titleHanzi = "游泳课",
            titlePinyin = "Yóuyǒng Kè",
            titleTranslation = "Swimming Lesson (Les Renang Xiao Ming)",
            level = "HSK 2",
            category = "Olahraga & Humor",
            description = "Kisah lucu Xiao Ming yang baru dua jam les renang sudah ingin berhenti karena terlalu banyak menelan air kolam hingga kenyang.",
            coverEmoji = "🏊",
            coverImageRes = R.drawable.cover_story_swimming_lesson_xiaoming,
            estimatedReadMinutes = 2,
            sentences = listOf(
                Sentence(
                    id = "s_swimmin_1",
                    hanzi = "小明的妈妈想让儿子学会游泳，就给他报了游泳班。",
                    pinyin = "xiǎo míng de mā ma xiǎng ràng ér zi xué huì yóu yǒng jiù gěi tā bào le yóu yǒng bān",
                    translation = "Ibu Xiao Ming ingin agar putranya pandai berenang, maka mendaftarkannya ke les renang.",
                    tokens = listOf(
                        WordToken("小明", "xiǎo míng", "A placeholder personal name, literally “little ming”; often used like “john doe” in examples", "Kosakata HSK 2: 小明 (xiǎo míng)"),
                        WordToken("的", "de", "Possessive particle (of; &#x27;s)", "Kosakata HSK 2: 的 (de)"),
                        WordToken("妈妈", "mā ma", "Mama", "Kosakata HSK 2: 妈妈 (mā ma)"),
                        WordToken("想", "xiǎng", "To desire; to want (to)", "Kosakata HSK 2: 想 (xiǎng)"),
                        WordToken("让", "ràng", "To permit", "Kosakata HSK 2: 让 (ràng)"),
                        WordToken("儿子", "ér zi", "Son", "Kosakata HSK 2: 儿子 (ér zi)"),
                        WordToken("学会", "xué huì", "To learn; to master", "Kosakata HSK 2: 学会 (xué huì)"),
                        WordToken("游泳", "yóu yǒng", "Swimming", "Kosakata HSK 2: 游泳 (yóu yǒng)"),
                        WordToken("就", "jiù", "Merely; nothing else but; simply; just; precisely; exactly", "Kosakata HSK 2: 就 (jiù)"),
                        WordToken("给", "gěi", "To", "Kosakata HSK 2: 给 (gěi)"),
                        WordToken("他", "tā", "He; him; his", "Kosakata HSK 2: 他 (tā)"),
                        WordToken("报", "bào", "To report; to inform; to announce", "Kosakata HSK 2: 报 (bào)"),
                        WordToken("了", "le", "(completed action marker)", "Kosakata HSK 2: 了 (le)"),
                        WordToken("游泳", "yóu yǒng", "Swimming", "Kosakata HSK 2: 游泳 (yóu yǒng)"),
                        WordToken("班", "bān", "Team; class; grade", "Kosakata HSK 2: 班 (bān)")
                    )
                ),
                Sentence(
                    id = "s_swimmin_2",
                    hanzi = "妈妈说：\"小明，我给你报了游泳班，这样你就可以玩水了！”",
                    pinyin = "mā ma shuō xiǎo míng wǒ gěi nǐ bào le yóu yǒng bān zhè yàng nǐ jiù kě yǐ wán shuǐ le",
                    translation = "Ibu menyemangati: “Xiao Ming, Ibu sudah mendaftarkan les renang untukmu, dengan begitu kamu bisa bebas bermain air sepuasnya!”",
                    tokens = listOf(
                        WordToken("妈妈", "mā ma", "Mama", "Kosakata HSK 2: 妈妈 (mā ma)"),
                        WordToken("说", "shuō", "To speak; to talk; to say", "Kosakata HSK 2: 说 (shuō)"),
                        WordToken("小明", "xiǎo míng", "A placeholder personal name, literally “little ming”; often used like “john doe” in examples", "Kosakata HSK 2: 小明 (xiǎo míng)"),
                        WordToken("我", "wǒ", "I; me; my", "Kosakata HSK 2: 我 (wǒ)"),
                        WordToken("给", "gěi", "To", "Kosakata HSK 2: 给 (gěi)"),
                        WordToken("你", "nǐ", "You", "Kosakata HSK 2: 你 (nǐ)"),
                        WordToken("报", "bào", "To report; to inform; to announce", "Kosakata HSK 2: 报 (bào)"),
                        WordToken("了", "le", "(completed action marker)", "Kosakata HSK 2: 了 (le)"),
                        WordToken("游泳", "yóu yǒng", "Swimming", "Kosakata HSK 2: 游泳 (yóu yǒng)"),
                        WordToken("班", "bān", "Team; class; grade", "Kosakata HSK 2: 班 (bān)"),
                        WordToken("这样", "zhè yàng", "This way; like this; so", "Kosakata HSK 2: 这样 (zhè yàng)"),
                        WordToken("你", "nǐ", "You", "Kosakata HSK 2: 你 (nǐ)"),
                        WordToken("就", "jiù", "In that case; then", "Kosakata HSK 2: 就 (jiù)"),
                        WordToken("可以", "kě yǐ", "Can", "Kosakata HSK 2: 可以 (kě yǐ)"),
                        WordToken("玩", "wán", "To play", "Kosakata HSK 2: 玩 (wán)"),
                        WordToken("水", "shuǐ", "Water", "Kosakata HSK 2: 水 (shuǐ)"),
                        WordToken("了", "le", "(completed action marker)", "Kosakata HSK 2: 了 (le)")
                    )
                ),
                Sentence(
                    id = "s_swimmin_3",
                    hanzi = "小明喜欢玩水，所以很高兴。",
                    pinyin = "xiǎo míng xǐ huan wán shuǐ suǒ yǐ hěn gāo xìng",
                    translation = "Xiao Ming sangat gemar bermain air, sehingga ia menyambutnya dengan sangat antusias gembira.",
                    tokens = listOf(
                        WordToken("小明", "xiǎo míng", "A placeholder personal name, literally “little ming”; often used like “john doe” in examples", "Kosakata HSK 2: 小明 (xiǎo míng)"),
                        WordToken("喜欢", "xǐ huan", "To like; to be fond of", "Kosakata HSK 2: 喜欢 (xǐ huan)"),
                        WordToken("玩", "wán", "To play", "Kosakata HSK 2: 玩 (wán)"),
                        WordToken("水", "shuǐ", "Water", "Kosakata HSK 2: 水 (shuǐ)"),
                        WordToken("所以", "suǒ yǐ", "Therefore", "Kosakata HSK 2: 所以 (suǒ yǐ)"),
                        WordToken("很", "hěn", "Very; quite", "Kosakata HSK 2: 很 (hěn)"),
                        WordToken("高兴", "gāo xìng", "Happy", "Kosakata HSK 2: 高兴 (gāo xìng)")
                    )
                ),
                Sentence(
                    id = "s_swimmin_4",
                    hanzi = "上课第一天，练习了2个小时后，小明就对游泳老师说：\"老师，上午就练习到这儿吧。",
                    pinyin = "shàng kè dì yī tiān liàn xí le gè xiǎo shí hòu xiǎo míng jiù duì yóu yǒng lǎo shī shuō lǎo shī shàng wǔ jiù liàn xí dào zhè r ba",
                    translation = "Pada hari pertama latihan, setelah berenang selama dua jam, Xiao Ming menghampiri pelatih renang lalu berkata: “Pak Pelatih, untuk sesi pagi ini latihannya cukup sampai di sini saja ya.",
                    tokens = listOf(
                        WordToken("上课", "shàng kè", "To go to class", "Kosakata HSK 2: 上课 (shàng kè)"),
                        WordToken("第", "dì", "(prefix indicating ordinal number)", "Kosakata HSK 2: 第 (dì)"),
                        WordToken("一", "yī", "One", "Kosakata HSK 2: 一 (yī)"),
                        WordToken("天", "tiān", "Day", "Kosakata HSK 2: 天 (tiān)"),
                        WordToken("练习", "liàn xí", "To practice", "Kosakata HSK 2: 练习 (liàn xí)"),
                        WordToken("了", "le", "(completed action marker)", "Kosakata HSK 2: 了 (le)"),
                        WordToken("个", "gè", "Classifier for people or objects in general", "Kosakata HSK 2: 个 (gè)"),
                        WordToken("小时", "xiǎo shí", "Hour", "Kosakata HSK 2: 小时 (xiǎo shí)"),
                        WordToken("后", "hòu", "Afterwards", "Kosakata HSK 2: 后 (hòu)"),
                        WordToken("小明", "xiǎo míng", "A placeholder personal name, literally “little ming”; often used like “john doe” in examples", "Kosakata HSK 2: 小明 (xiǎo míng)"),
                        WordToken("就", "jiù", "In that case; then", "Kosakata HSK 2: 就 (jiù)"),
                        WordToken("对", "duì", "Towards; at; for", "Kosakata HSK 2: 对 (duì)"),
                        WordToken("游泳", "yóu yǒng", "Swimming", "Kosakata HSK 2: 游泳 (yóu yǒng)"),
                        WordToken("老师", "lǎo shī", "Teacher", "Kosakata HSK 2: 老师 (lǎo shī)"),
                        WordToken("说", "shuō", "To speak; to talk; to say", "Kosakata HSK 2: 说 (shuō)"),
                        WordToken("老师", "lǎo shī", "Teacher", "Kosakata HSK 2: 老师 (lǎo shī)"),
                        WordToken("上午", "shàng wǔ", "Morning", "Kosakata HSK 2: 上午 (shàng wǔ)"),
                        WordToken("就", "jiù", "Merely; nothing else but; simply; just; precisely; exactly", "Kosakata HSK 2: 就 (jiù)"),
                        WordToken("练习", "liàn xí", "To practice", "Kosakata HSK 2: 练习 (liàn xí)"),
                        WordToken("到", "dào", "To reach; to arrive", "Kosakata HSK 2: 到 (dào)"),
                        WordToken("这儿", "zhè r", "Here", "Kosakata HSK 2: 这儿 (zhè r)"),
                        WordToken("吧", "ba", "(modal particle indicating suggestion or surmise)", "Kosakata HSK 2: 吧 (ba)")
                    )
                ),
                Sentence(
                    id = "s_swimmin_5",
                    hanzi = "\"",
                    pinyin = "",
                    translation = "”",
                    tokens = listOf(

                    )
                ),
                Sentence(
                    id = "s_swimmin_6",
                    hanzi = "\"为什么呢？”",
                    pinyin = "wèi shén me ne",
                    translation = "“Memangnya kenapa Nak?”",
                    tokens = listOf(
                        WordToken("为什么", "wèi shén me", "Why?", "Kosakata HSK 2: 为什么 (wèi shén me)"),
                        WordToken("呢", "ne", "(discourse particle) used to mark a slight pause or emphasis in speech", "Kosakata HSK 2: 呢 (ne)")
                    )
                ),
                Sentence(
                    id = "s_swimmin_7",
                    hanzi = "老师问。",
                    pinyin = "lǎo shī wèn",
                    translation = "tanya sang pelatih penasaran.",
                    tokens = listOf(
                        WordToken("老师", "lǎo shī", "Teacher", "Kosakata HSK 2: 老师 (lǎo shī)"),
                        WordToken("问", "wèn", "To ask; to inquire", "Kosakata HSK 2: 问 (wèn)")
                    )
                ),
                Sentence(
                    id = "s_swimmin_8",
                    hanzi = "小明不好意思地说：\"池子里的水太难喝了！",
                    pinyin = "xiǎo míng bù hǎo yì si de shuō chí zi lǐ de shuǐ tài nán hē le",
                    translation = "Xiao Ming tersipu malu menjawab: “Air di kolam renang ini rasanya tidak enak sekali!",
                    tokens = listOf(
                        WordToken("小明", "xiǎo míng", "A placeholder personal name, literally “little ming”; often used like “john doe” in examples", "Kosakata HSK 2: 小明 (xiǎo míng)"),
                        WordToken("不好意思", "bù hǎo yì si", "To feel embarrassed", "Kosakata HSK 2: 不好意思 (bù hǎo yì si)"),
                        WordToken("地", "de", "-ly", "Kosakata HSK 2: 地 (de)"),
                        WordToken("说", "shuō", "To speak; to talk; to say", "Kosakata HSK 2: 说 (shuō)"),
                        WordToken("池子", "chí zi", "Pond", "Kosakata HSK 2: 池子 (chí zi)"),
                        WordToken("里", "lǐ", "Lining", "Kosakata HSK 2: 里 (lǐ)"),
                        WordToken("的", "de", "Possessive particle (of; &#x27;s)", "Kosakata HSK 2: 的 (de)"),
                        WordToken("水", "shuǐ", "Water", "Kosakata HSK 2: 水 (shuǐ)"),
                        WordToken("太", "tài", "Too (much)", "Kosakata HSK 2: 太 (tài)"),
                        WordToken("难", "nán", "Not good", "Kosakata HSK 2: 难 (nán)"),
                        WordToken("喝", "hē", "To drink", "Kosakata HSK 2: 喝 (hē)"),
                        WordToken("了", "le", "Modal particle (emphasis)", "Kosakata HSK 2: 了 (le)")
                    )
                ),
                Sentence(
                    id = "s_swimmin_9",
                    hanzi = "我都快喝饱了。”",
                    pinyin = "wǒ dōu kuài hē bǎo le",
                    translation = "Saya menelan airnya terlalu banyak sampai perut saya kenyang begah.”",
                    tokens = listOf(
                        WordToken("我", "wǒ", "I; me; my", "Kosakata HSK 2: 我 (wǒ)"),
                        WordToken("都", "dōu", "Already", "Kosakata HSK 2: 都 (dōu)"),
                        WordToken("快", "kuài", "Soon", "Kosakata HSK 2: 快 (kuài)"),
                        WordToken("喝", "hē", "To drink", "Kosakata HSK 2: 喝 (hē)"),
                        WordToken("饱", "bǎo", "To eat till full", "Kosakata HSK 2: 饱 (bǎo)"),
                        WordToken("了", "le", "(completed action marker)", "Kosakata HSK 2: 了 (le)")
                    )
                )
            ),
            questions = listOf(
                StoryQuestion(
                    id = "q_swimmin_1",
                    questionText = "母亲当初给小明报名参加游泳班的初衷是什么？ (Apa tujuan ibu mendaftarkan Xiao Ming ke kursus renang?)",
                    options = listOf("为了培养世界冠军 (Mencetak juara renang dunia)", "想让儿子学会生存游泳技能，同时满足他爱玩水的天性 (Ingin putranya bisa berenang dan menyalurkan kegemarannya bermain air)", "因为家里水费太贵 (Karena tagihan air di rumah mahal)", "老师强迫报名的 (Karena paksaan pihak sekolah)"),
                    correctAnswerIndex = 1,
                    explanation = "Ibu ingin Xiao Ming menguasai keahlian renang sambil bergembira bermain air."
                ),
                StoryQuestion(
                    id = "q_swimmin_2",
                    questionText = "上课第一天训练了两个小时后，小明向教练提出了什么请求？ (Permintaan apa yang diajukan Xiao Ming kepada pelatih setelah berlatih 2 jam?)",
                    options = listOf("要求再游五个小时 (Minta tambah latihan lima jam lagi)", "请求上午的训练就先练习到这里结束 (Memohon agar sesi latihan pagi disudahi sampai di situ saja)", "要求教练跳水表演 (Menyuruh pelatih salto melompat)", "想要退费回家 (Minta uang kursus dikembalikan)"),
                    correctAnswerIndex = 1,
                    explanation = "Xiao Ming meminta izin menyudahi sesi renang di pagi hari."
                ),
                StoryQuestion(
                    id = "q_swimmin_3",
                    questionText = "小明想要提前结束练习的真正“难言之隐”是什么？ (Alasan menggelikan apa yang diakui Xiao Ming kepada sang pelatih?)",
                    options = listOf("肌肉拉伤腿抽筋 (Kram otot kaki)", "泳池里的水太难喝了，自己呛水喝得肚子都快胀饱了 (Air di kolam renang rasanya tidak enak dan ia terlalu banyak menelan air sampai perutnya kenyang begah!)", "泳衣破了洞 (Baju renangnya robek)", "肚子太饿想吃烤鸭 (Sangat lapar ingin makan bebek panggang)"),
                    correctAnswerIndex = 1,
                    explanation = "Puncak humor: alih-alih capek otot, ia berhenti karena kenyang meminum air kolam renang!"
                ),
                StoryQuestion(
                    id = "q_swimmin_4",
                    questionText = "这个幽默小品真实折射了初学游泳者常有的什么体验？ (Pengalaman umum apa yang kerap dialami anak saat pertama kali belajar berenang?)",
                    options = listOf("瞬间学会蝶泳 (Seketika mahir gaya kupu-kupu)", "初学水性时难免呛水吞水、既滑稽又充满挑战的必经阶段 (Fase adaptasi menelan air yang wajar, lucu, dan penuh tantangan bagi pemula)", "完全不怕水 (Sama sekali tidak takut air)", "直接沉在水底睡觉 (Tidur di dasar kolam renang)"),
                    correctAnswerIndex = 1,
                    explanation = "Pengalaman universal belajar renang yang digambarkan secara jenaka dan menghibur."
                )
            )
        ),
        // Cerita Mandarin Bean 136 (HSK 2): Give Birth to a Puppy (Melahirkan Seekor Anak Anjing)
        Story(
            id = "story_give_birth_to_puppy",
            titleHanzi = "生一条小狗",
            titlePinyin = "Shēng Yī Tiáo Xiǎogǒu",
            titleTranslation = "Give Birth to a Puppy (Melahirkan Seekor Anak Anjing)",
            level = "HSK 2",
            category = "Hewan & Humor",
            description = "Kepolosan seorang anak kecil yang meminta ibunya melahirkan seekor anak anjing saja daripada adik bayi manusia.",
            coverEmoji = "🐶",
            coverImageRes = R.drawable.cover_story_give_birth_to_puppy,
            estimatedReadMinutes = 2,
            sentences = listOf(
                Sentence(
                    id = "s_givebir_1",
                    hanzi = "儿子已经五岁了，很喜欢小狗，希望爸爸妈妈能给他买一条小狗。",
                    pinyin = "ér zi yǐ jīng wǔ suì le hěn xǐ huan xiǎo gǒu xī wàng bà ba mā ma néng gěi tā mǎi yī tiáo xiǎo gǒu",
                    translation = "Putra kecil kami sudah berusia lima tahun, ia sangat menyukai anak anjing dan selalu merajuk meminta dibelikan seekor anak anjing peliharaan.",
                    tokens = listOf(
                        WordToken("儿子", "ér zi", "Son", "Kosakata HSK 2: 儿子 (ér zi)"),
                        WordToken("已经", "yǐ jīng", "Already", "Kosakata HSK 2: 已经 (yǐ jīng)"),
                        WordToken("五", "wǔ", "Five", "Kosakata HSK 2: 五 (wǔ)"),
                        WordToken("岁", "suì", "Classifier for years (of age)", "Kosakata HSK 2: 岁 (suì)"),
                        WordToken("了", "le", "(completed action marker)", "Kosakata HSK 2: 了 (le)"),
                        WordToken("很", "hěn", "Very; quite", "Kosakata HSK 2: 很 (hěn)"),
                        WordToken("喜欢", "xǐ huan", "To like; to be fond of", "Kosakata HSK 2: 喜欢 (xǐ huan)"),
                        WordToken("小", "xiǎo", "Young", "Kosakata HSK 2: 小 (xiǎo)"),
                        WordToken("狗", "gǒu", "Dog", "Kosakata HSK 2: 狗 (gǒu)"),
                        WordToken("希望", "xī wàng", "To hope", "Kosakata HSK 2: 希望 (xī wàng)"),
                        WordToken("爸爸", "bà ba", "(coll.) father; dad", "Kosakata HSK 2: 爸爸 (bà ba)"),
                        WordToken("妈妈", "mā ma", "Mama", "Kosakata HSK 2: 妈妈 (mā ma)"),
                        WordToken("能", "néng", "Can", "Kosakata HSK 2: 能 (néng)"),
                        WordToken("给", "gěi", "To", "Kosakata HSK 2: 给 (gěi)"),
                        WordToken("他", "tā", "He; him; his", "Kosakata HSK 2: 他 (tā)"),
                        WordToken("买", "mǎi", "To buy", "Kosakata HSK 2: 买 (mǎi)"),
                        WordToken("一", "yī", "One", "Kosakata HSK 2: 一 (yī)"),
                        WordToken("条", "tiáo", "Classifier for long thin things", "Kosakata HSK 2: 条 (tiáo)"),
                        WordToken("小", "xiǎo", "Young", "Kosakata HSK 2: 小 (xiǎo)"),
                        WordToken("狗", "gǒu", "Dog", "Kosakata HSK 2: 狗 (gǒu)")
                    )
                ),
                Sentence(
                    id = "s_givebir_2",
                    hanzi = "有一天，妈妈问儿子：\"我想再生一个孩子，你喜欢弟弟还是妹妹？”",
                    pinyin = "yǒu yī tiān mā ma wèn ér zi wǒ xiǎng zài shēng yī gè hái zi nǐ xǐ huan dì di hái shi mèi mei",
                    translation = "Suatu hari ibu bertanya memancing pendapatnya: “Ibu berencana melahirkan satu adik bayi lagi untukmu, kamu lebih suka punya adik laki-laki atau adik perempuan?”",
                    tokens = listOf(
                        WordToken("有", "yǒu", "To have; there is", "Kosakata HSK 2: 有 (yǒu)"),
                        WordToken("一天", "yī tiān", "One day; a day", "Kosakata HSK 2: 一天 (yī tiān)"),
                        WordToken("妈妈", "mā ma", "Mama", "Kosakata HSK 2: 妈妈 (mā ma)"),
                        WordToken("问", "wèn", "To ask; to inquire", "Kosakata HSK 2: 问 (wèn)"),
                        WordToken("儿子", "ér zi", "Son", "Kosakata HSK 2: 儿子 (ér zi)"),
                        WordToken("我", "wǒ", "I; me; my", "Kosakata HSK 2: 我 (wǒ)"),
                        WordToken("想", "xiǎng", "To desire; to want (to)", "Kosakata HSK 2: 想 (xiǎng)"),
                        WordToken("再", "zài", "Again; once more; re-", "Kosakata HSK 2: 再 (zài)"),
                        WordToken("生", "shēng", "To grow; to give birth; to produce; to be born", "Kosakata HSK 2: 生 (shēng)"),
                        WordToken("一", "yī", "One", "Kosakata HSK 2: 一 (yī)"),
                        WordToken("个", "gè", "Classifier for people or objects in general", "Kosakata HSK 2: 个 (gè)"),
                        WordToken("孩子", "hái zi", "Child", "Kosakata HSK 2: 孩子 (hái zi)"),
                        WordToken("你", "nǐ", "You", "Kosakata HSK 2: 你 (nǐ)"),
                        WordToken("喜欢", "xǐ huan", "To like; to be fond of", "Kosakata HSK 2: 喜欢 (xǐ huan)"),
                        WordToken("弟弟", "dì di", "Younger brother", "Kosakata HSK 2: 弟弟 (dì di)"),
                        WordToken("还是", "hái shi", "Or", "Kosakata HSK 2: 还是 (hái shi)"),
                        WordToken("妹妹", "mèi mei", "Younger sister", "Kosakata HSK 2: 妹妹 (mèi mei)")
                    )
                ),
                Sentence(
                    id = "s_givebir_3",
                    hanzi = "儿子回答：\"小弟弟和小妹妹都一样——我有其他的选择吗？”",
                    pinyin = "ér zi huí dá xiǎo dì di hé xiǎo mèi mei dōu yī yàng wǒ yǒu qí tā de xuǎn zé ma",
                    translation = "Putranya menjawab datar: “Adik laki-laki maupun adik perempuan sama saja membosankannya — apakah saya punya pilihan lain?”",
                    tokens = listOf(
                        WordToken("儿子", "ér zi", "Son", "Kosakata HSK 2: 儿子 (ér zi)"),
                        WordToken("回答", "huí dá", "To reply; to answer", "Kosakata HSK 2: 回答 (huí dá)"),
                        WordToken("小", "xiǎo", "Young", "Kosakata HSK 2: 小 (xiǎo)"),
                        WordToken("弟弟", "dì di", "Younger brother", "Kosakata HSK 2: 弟弟 (dì di)"),
                        WordToken("和", "hé", "And; together with", "Kosakata HSK 2: 和 (hé)"),
                        WordToken("小", "xiǎo", "Young", "Kosakata HSK 2: 小 (xiǎo)"),
                        WordToken("妹妹", "mèi mei", "Younger sister", "Kosakata HSK 2: 妹妹 (mèi mei)"),
                        WordToken("都", "dōu", "All; both; entirely", "Kosakata HSK 2: 都 (dōu)"),
                        WordToken("一样", "yī yàng", "Same", "Kosakata HSK 2: 一样 (yī yàng)"),
                        WordToken("我", "wǒ", "I; me; my", "Kosakata HSK 2: 我 (wǒ)"),
                        WordToken("有", "yǒu", "To have; there is", "Kosakata HSK 2: 有 (yǒu)"),
                        WordToken("其他", "qí tā", "Other", "Kosakata HSK 2: 其他 (qí tā)"),
                        WordToken("的", "de", "Possessive particle (of; &#x27;s)", "Kosakata HSK 2: 的 (de)"),
                        WordToken("选择", "xuǎn zé", "Choice; option; alternative", "Kosakata HSK 2: 选择 (xuǎn zé)"),
                        WordToken("吗", "ma", "(question particle for &quot;yes-no&quot; questions)", "Kosakata HSK 2: 吗 (ma)")
                    )
                ),
                Sentence(
                    id = "s_givebir_4",
                    hanzi = "\"啊？",
                    pinyin = "á",
                    translation = "“Hah?",
                    tokens = listOf(
                        WordToken("啊", "á", "Interjection expressing doubt or requiring answer", "Kosakata HSK 2: 啊 (á)")
                    )
                ),
                Sentence(
                    id = "s_givebir_5",
                    hanzi = "除了弟弟妹妹，还能有什么其他选择？”",
                    pinyin = "chú le dì di mèi mei hái néng yǒu shén me qí tā xuǎn zé",
                    translation = "Selain adik laki-laki atau adik perempuan, memangnya bisa ada pilihan apa lagi?”",
                    tokens = listOf(
                        WordToken("除了", "chú le", "Apart from; besides; in addition to", "Kosakata HSK 2: 除了 (chú le)"),
                        WordToken("弟弟", "dì di", "Younger brother", "Kosakata HSK 2: 弟弟 (dì di)"),
                        WordToken("妹妹", "mèi mei", "Younger sister", "Kosakata HSK 2: 妹妹 (mèi mei)"),
                        WordToken("还", "hái", "Still, still in progress, yet", "Kosakata HSK 2: 还 (hái)"),
                        WordToken("能", "néng", "Can", "Kosakata HSK 2: 能 (néng)"),
                        WordToken("有", "yǒu", "To have; there is", "Kosakata HSK 2: 有 (yǒu)"),
                        WordToken("什么", "shén me", "What?", "Kosakata HSK 2: 什么 (shén me)"),
                        WordToken("其他", "qí tā", "Other", "Kosakata HSK 2: 其他 (qí tā)"),
                        WordToken("选择", "xuǎn zé", "Choice; option; alternative", "Kosakata HSK 2: 选择 (xuǎn zé)")
                    )
                ),
                Sentence(
                    id = "s_givebir_6",
                    hanzi = "妈妈想。",
                    pinyin = "mā ma xiǎng",
                    translation = "pikir sang ibu keheranan.",
                    tokens = listOf(
                        WordToken("妈妈", "mā ma", "Mama", "Kosakata HSK 2: 妈妈 (mā ma)"),
                        WordToken("想", "xiǎng", "To think (about)", "Kosakata HSK 2: 想 (xiǎng)")
                    )
                ),
                Sentence(
                    id = "s_givebir_7",
                    hanzi = "儿子继续说：\"你给我生一条小狗吧，男的女的都可以。”",
                    pinyin = "ér zi jì xù shuō nǐ gěi wǒ shēng yī tiáo xiǎo gǒu ba nán de nǚ de dōu kě yǐ",
                    translation = "Putranya melanjutkan dengan mata berbinar: “Ibu tolong lahirkan seekor anak anjing saja untukku, jantan atau betina aku tidak masalah!”",
                    tokens = listOf(
                        WordToken("儿子", "ér zi", "Son", "Kosakata HSK 2: 儿子 (ér zi)"),
                        WordToken("继续", "jì xù", "To continue; to proceed with; to go on with", "Kosakata HSK 2: 继续 (jì xù)"),
                        WordToken("说", "shuō", "To speak; to talk; to say", "Kosakata HSK 2: 说 (shuō)"),
                        WordToken("你", "nǐ", "You", "Kosakata HSK 2: 你 (nǐ)"),
                        WordToken("给", "gěi", "To", "Kosakata HSK 2: 给 (gěi)"),
                        WordToken("我", "wǒ", "I; me; my", "Kosakata HSK 2: 我 (wǒ)"),
                        WordToken("生", "shēng", "To grow; to give birth; to produce; to be born", "Kosakata HSK 2: 生 (shēng)"),
                        WordToken("一", "yī", "One", "Kosakata HSK 2: 一 (yī)"),
                        WordToken("条", "tiáo", "Classifier for long thin things", "Kosakata HSK 2: 条 (tiáo)"),
                        WordToken("小", "xiǎo", "Young", "Kosakata HSK 2: 小 (xiǎo)"),
                        WordToken("狗", "gǒu", "Dog", "Kosakata HSK 2: 狗 (gǒu)"),
                        WordToken("吧", "ba", "(modal particle indicating suggestion or surmise)", "Kosakata HSK 2: 吧 (ba)"),
                        WordToken("男", "nán", "(bound form) male", "Kosakata HSK 2: 男 (nán)"),
                        WordToken("的", "de", "Possessive particle (of; &#x27;s)", "Kosakata HSK 2: 的 (de)"),
                        WordToken("女", "nǚ", "Female", "Kosakata HSK 2: 女 (nǚ)"),
                        WordToken("的", "de", "Possessive particle (of; &#x27;s)", "Kosakata HSK 2: 的 (de)"),
                        WordToken("都", "dōu", "All; both; entirely", "Kosakata HSK 2: 都 (dōu)"),
                        WordToken("可以", "kě yǐ", "Can", "Kosakata HSK 2: 可以 (kě yǐ)")
                    )
                )
            ),
            questions = listOf(
                StoryQuestion(
                    id = "q_givebir_1",
                    questionText = "五岁的小男孩一直心心念念向父母恳求什么愿望？ (Keinginan apa yang selalu diidam-idamkan oleh anak berusia lima tahun itu?)",
                    options = listOf("买一辆崭新的玩具赛车 (Membeli mobil mainan baru)", "希望能养一条可爱忠诚的小狗 (Ingin memiliki dan memelihara seekor anak anjing lucu)", "天天不用去幼儿园 (Tiap hari tidak usah sekolah)", "去游乐园坐过山车 (Pergi ke taman hiburan naik roller coaster)"),
                    correctAnswerIndex = 1,
                    explanation = "Kecintaan mendalam sang anak pada hewan peliharaan anjing."
                ),
                StoryQuestion(
                    id = "q_givebir_2",
                    questionText = "当母亲征求他关于二胎想要“弟弟还是妹妹”时，儿子的态度如何？ (Bagaimana tanggapan sang anak saat ibu menanyakan pilihan adik laki-laki atau adik perempuan?)",
                    options = listOf("强烈要求必须生弟弟 (Bersikeras harus adik laki-laki)", "觉得小弟弟和小妹妹都一样没意思，反问有没有其他选项 (Menganggap adik laki-laki atau perempuan sama saja membosankan, lalu menanyakan alternatif lain)", "高兴得手舞足蹈 (Menari-nari gembira)", "坚决离家出走 (Mengancam minggat dari rumah)"),
                    correctAnswerIndex = 1,
                    explanation = "Bagi anak kecil, kehadiran adik bayi manusia sama-sama tidak menarik dibanding hewan peliharaan."
                ),
                StoryQuestion(
                    id = "q_givebir_3",
                    questionText = "儿子向母亲提出的最终“二胎订单”是什么令人绝倒的提议？ (Permintaan kocak apa yang akhirnya diusulkan sang anak kepada ibunya?)",
                    options = listOf("生一个机器人 (Melahirkan robot canggih)", "让妈妈生一条小狗，公的母的都可以 (Meminta ibu melahirkan seekor anak anjing saja, jantan atau betina ia tidak masalah!)", "生一对双胞胎 (Melahirkan bayi kembar)", "什么都不要生 (Jangan melahirkan apa pun)"),
                    correctAnswerIndex = 1,
                    explanation = "Puncak humor: kepolosan anak yang mengira ibu manusia bisa melahirkan anak anjing!"
                ),
                StoryQuestion(
                    id = "q_givebir_4",
                    questionText = "这个温馨搞笑的家庭对话体现了幼儿时期怎样的心理认知？ (Ciri kognitif anak usia prasekolah apa yang tercermin dari kelakar ini?)",
                    options = listOf("心理阴暗孤僻 (Sifat tertutup dan muram)", "泛灵论与纯粹童真构筑的无拘无束的愿望世界 (Imajinasi animisme murni yang bebas dan tanpa batas prasangka kedewasaan)", "严重忤逆不孝 (Bentuk kedurhakaan kepada orang tua)", "完全没有爱心 (Tidak memiliki rasa kasih sayang)"),
                    correctAnswerIndex = 1,
                    explanation = "Kepolosan dunia imajinasi anak yang mengundang tawa manis kehangatan rumah tangga."
                )
            )
        )
    )
}
