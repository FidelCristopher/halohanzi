package com.example.chineselearning.data.repository

import com.example.chineselearning.R
import com.example.chineselearning.data.model.Sentence
import com.example.chineselearning.data.model.Story
import com.example.chineselearning.data.model.StoryQuestion
import com.example.chineselearning.data.model.WordToken

val mandarinBeanStoriesPart13: List<Story> by lazy {
    listOf(
        // Cerita Mandarin Bean 146 (HSK 2): Dad's Birthday (Ulang Tahun Ayah)
        Story(
            id = "story_dads_birthday",
            titleHanzi = "爸爸的生日",
            titlePinyin = "Bàba De Shēngrì",
            titleTranslation = "Dad's Birthday (Ulang Tahun Ayah)",
            level = "HSK 2",
            category = "Keluarga & Humor",
            description = "Logika menggemaskan anak berusia 5 tahun yang mengira ulang tahun adalah rutinitas bulanan untuk bisa makan kue lezat bersama ayah.",
            coverEmoji = "🎂",
            coverImageRes = R.drawable.cover_story_dads_birthday,
            estimatedReadMinutes = 2,
            sentences = listOf(
                Sentence(
                    id = "s_dadbday_1",
                    hanzi = "爸爸回家后高兴地对五岁的儿子说：\"今天是我的生日，我们今天吃蛋糕。”",
                    pinyin = "bà ba huí jiā hòu gāo xìng de duì wǔ suì de ér zi shuō jīn tiān shì wǒ de shēng rì wǒ men jīn tiān chī dàn gāo",
                    translation = "Setibanya di rumah, sang ayah dengan gembira berkata kepada putranya yang berusia lima tahun: “Hari ini adalah hari ulang tahun ayah, hari ini kita akan makan kue bersama!”",
                    tokens = listOf(
                        WordToken("爸爸", "bà ba", "(coll.) father; dad", "Kosakata HSK 2: 爸爸 (bà ba)"),
                        WordToken("回", "huí", "to go back / to turn around / to answer / to return", "Kosakata HSK 2: 回 (huí)"),
                        WordToken("家", "jiā", "home / family / (polite) my (sister, uncle etc)", "Kosakata HSK 2: 家 (jiā)"),
                        WordToken("后", "hòu", "afterwards / after", "Kosakata HSK 2: 后 (hòu)"),
                        WordToken("高兴", "gāo xìng", "happy / glad / in a cheerful mood", "Kosakata HSK 2: 高兴 (gāo xìng)"),
                        WordToken("地", "de", "-ly / structural particle: used before a verb or adjective, linking it to preceding modifying adverbial adjunct", "Kosakata HSK 2: 地 (de)"),
                        WordToken("对", "duì", "towards; at; for / concerning; regarding", "Kosakata HSK 2: 对 (duì)"),
                        WordToken("五", "wǔ", "five / 5", "Kosakata HSK 2: 五 (wǔ)"),
                        WordToken("岁", "suì", "classifier for years (of age)", "Kosakata HSK 2: 岁 (suì)"),
                        WordToken("的", "de", "possessive particle (of; 's) / modifying particle (used after an attribute to modify a noun or to form a nominal expression)", "Kosakata HSK 2: 的 (de)"),
                        WordToken("儿子", "ér zi", "son", "Kosakata HSK 2: 儿子 (ér zi)"),
                        WordToken("说", "shuō", "to speak; to talk; to say", "Kosakata HSK 2: 说 (shuō)"),
                        WordToken("今天", "jīn tiān", "today", "Kosakata HSK 2: 今天 (jīn tiān)"),
                        WordToken("是", "shì", "to be (followed by substantives only)", "Kosakata HSK 2: 是 (shì)"),
                        WordToken("我", "wǒ", "I; me; my", "Kosakata HSK 2: 我 (wǒ)"),
                        WordToken("的", "de", "possessive particle (of; 's) / modifying particle (used after an attribute to modify a noun or to form a nominal expression)", "Kosakata HSK 2: 的 (de)"),
                        WordToken("生日", "shēng rì", "birthday", "Kosakata HSK 2: 生日 (shēng rì)"),
                        WordToken("我们", "wǒ men", "we; us; ourselves; our", "Kosakata HSK 2: 我们 (wǒ men)"),
                        WordToken("今天", "jīn tiān", "today", "Kosakata HSK 2: 今天 (jīn tiān)"),
                        WordToken("吃", "chī", "to eat; to consume / to eat at", "Kosakata HSK 2: 吃 (chī)"),
                        WordToken("蛋糕", "dàn gāo", "cake", "Kosakata HSK 2: 蛋糕 (dàn gāo)")
                    )
                ),
                Sentence(
                    id = "s_dadbday_2",
                    hanzi = "儿子问：\"生日是什么意思？”",
                    pinyin = "ér zi wèn shēng rì shì shén me yì si",
                    translation = "Putranya bertanya penasaran: “Ayah, apa artinya ulang tahun?”",
                    tokens = listOf(
                        WordToken("儿子", "ér zi", "son", "Kosakata HSK 2: 儿子 (ér zi)"),
                        WordToken("问", "wèn", "to ask; to inquire", "Kosakata HSK 2: 问 (wèn)"),
                        WordToken("生日", "shēng rì", "birthday", "Kosakata HSK 2: 生日 (shēng rì)"),
                        WordToken("是", "shì", "to be (followed by substantives only)", "Kosakata HSK 2: 是 (shì)"),
                        WordToken("什么", "shén me", "what?", "Kosakata HSK 2: 什么 (shén me)"),
                        WordToken("意思", "yì si", "idea / opinion / meaning", "Kosakata HSK 2: 意思 (yì si)")
                    )
                ),
                Sentence(
                    id = "s_dadbday_3",
                    hanzi = "爸爸回答：\"生日就是出生的日子。”",
                    pinyin = "bà ba huí dá shēng rì jiù shì chū shēng de rì zi",
                    translation = "Ayah menjawab lembut: “Ulang tahun itu artinya hari di mana seseorang dilahirkan.”",
                    tokens = listOf(
                        WordToken("爸爸", "bà ba", "(coll.) father; dad", "Kosakata HSK 2: 爸爸 (bà ba)"),
                        WordToken("回答", "huí dá", "to reply; to answer / reply; answer", "Kosakata HSK 2: 回答 (huí dá)"),
                        WordToken("生日", "shēng rì", "birthday", "Kosakata HSK 2: 生日 (shēng rì)"),
                        WordToken("就", "jiù", "merely; nothing else but; simply; just; precisely; exactly", "Kosakata HSK 2: 就 (jiù)"),
                        WordToken("是", "shì", "to be (followed by substantives only)", "Kosakata HSK 2: 是 (shì)"),
                        WordToken("出生", "chū shēng", "to be born", "Kosakata HSK 2: 出生 (chū shēng)"),
                        WordToken("的", "de", "possessive particle (of; 's) / modifying particle (used after an attribute to modify a noun or to form a nominal expression)", "Kosakata HSK 2: 的 (de)"),
                        WordToken("日子", "rì zi", "day / a (calendar) date", "Kosakata HSK 2: 日子 (rì zi)")
                    )
                ),
                Sentence(
                    id = "s_dadbday_4",
                    hanzi = "儿子听了，感到到很奇怪，问：\"爸爸，今天是你出生的日子，那你怎么马上就长这么大了呀！”",
                    pinyin = "ér zi tīng le gǎn dào dào hěn qí guài wèn bà ba jīn tiān shì nǐ chū shēng de rì zi nà nǐ zěn me mǎ shàng jiù zhǎng zhè me dà le ya",
                    translation = "Mendengar hal itu sang anak heran bukan main dan bertanya: “Ayah, kalau hari ini adalah hari ayah dilahirkan, bagaimana bisa dalam sekejap ayah langsung tumbuh menjadi sebesar ini?!”",
                    tokens = listOf(
                        WordToken("儿子", "ér zi", "son", "Kosakata HSK 2: 儿子 (ér zi)"),
                        WordToken("听", "tīng", "to listen to; to hear", "Kosakata HSK 2: 听 (tīng)"),
                        WordToken("了", "le", "(completed action marker) / (modal particle indicating change of state, situation now)", "Kosakata HSK 2: 了 (le)"),
                        WordToken("感到", "gǎn dào", "to feel; to sense; to perceive", "Kosakata HSK 2: 感到 (gǎn dào)"),
                        WordToken("到", "dào", "to reach; to arrive / to (a place); until (a time); up to (a point) / (verb complement indicating arriving at a place or reaching a point)", "Kosakata HSK 2: 到 (dào)"),
                        WordToken("很", "hěn", "very; quite", "Kosakata HSK 2: 很 (hěn)"),
                        WordToken("奇怪", "qí guài", "strange / odd", "Kosakata HSK 2: 奇怪 (qí guài)"),
                        WordToken("问", "wèn", "to ask; to inquire", "Kosakata HSK 2: 问 (wèn)"),
                        WordToken("爸爸", "bà ba", "(coll.) father; dad", "Kosakata HSK 2: 爸爸 (bà ba)"),
                        WordToken("今天", "jīn tiān", "today", "Kosakata HSK 2: 今天 (jīn tiān)"),
                        WordToken("是", "shì", "to be (followed by substantives only)", "Kosakata HSK 2: 是 (shì)"),
                        WordToken("你", "nǐ", "you", "Kosakata HSK 2: 你 (nǐ)"),
                        WordToken("出生", "chū shēng", "to be born", "Kosakata HSK 2: 出生 (chū shēng)"),
                        WordToken("的", "de", "possessive particle (of; 's) / modifying particle (used after an attribute to modify a noun or to form a nominal expression)", "Kosakata HSK 2: 的 (de)"),
                        WordToken("日子", "rì zi", "day / a (calendar) date", "Kosakata HSK 2: 日子 (rì zi)"),
                        WordToken("那", "nà", "then (in that case)", "Kosakata HSK 2: 那 (nà)"),
                        WordToken("你", "nǐ", "you", "Kosakata HSK 2: 你 (nǐ)"),
                        WordToken("怎么", "zěn me", "how? / what? / why?", "Kosakata HSK 2: 怎么 (zěn me)"),
                        WordToken("马上", "mǎ shàng", "at once / right away / immediately", "Kosakata HSK 2: 马上 (mǎ shàng)"),
                        WordToken("就", "jiù", "as soon as; immediately after", "Kosakata HSK 2: 就 (jiù)"),
                        WordToken("长", "zhǎng", "to grow / to develop / to increase / to enhance", "Kosakata HSK 2: 长 (zhǎng)"),
                        WordToken("这么", "zhè me", "so much / this much / how much?", "Kosakata HSK 2: 这么 (zhè me)"),
                        WordToken("大", "dà", "big; large; great / older (than another person) / eldest", "Kosakata HSK 2: 大 (dà)"),
                        WordToken("了", "le", "(completed action marker) / (modal particle indicating change of state, situation now)", "Kosakata HSK 2: 了 (le)"),
                        WordToken("呀", "ya", "(particle equivalent to 啊 after a vowel, expressing surprise or doubt)", "Kosakata HSK 2: 呀 (ya)")
                    )
                ),
                Sentence(
                    id = "s_dadbday_5",
                    hanzi = "爸爸笑着回答：\"傻孩子，爸爸是三十年前的今天出生的！”",
                    pinyin = "bà ba xiào zhe huí dá shǎ hái zi bà ba shì sān shí nián qián de jīn tiān chū shēng de",
                    translation = "Sang ayah tertawa terbahak-bahak lalu menjawab: “Anakku sayang, ayah dilahirkan pada tanggal hari ini tiga puluh tahun yang lalu!”",
                    tokens = listOf(
                        WordToken("爸爸", "bà ba", "(coll.) father; dad", "Kosakata HSK 2: 爸爸 (bà ba)"),
                        WordToken("笑", "xiào", "to laugh; to smile", "Kosakata HSK 2: 笑 (xiào)"),
                        WordToken("着", "zhe", "aspect particle indicating action in progress or ongoing state", "Kosakata HSK 2: 着 (zhe)"),
                        WordToken("回答", "huí dá", "to reply; to answer / reply; answer", "Kosakata HSK 2: 回答 (huí dá)"),
                        WordToken("傻", "shǎ", "foolish", "Kosakata HSK 2: 傻 (shǎ)"),
                        WordToken("孩子", "hái zi", "child", "Kosakata HSK 2: 孩子 (hái zi)"),
                        WordToken("爸爸", "bà ba", "(coll.) father; dad", "Kosakata HSK 2: 爸爸 (bà ba)"),
                        WordToken("是", "shì", "to be (followed by substantives only)", "Kosakata HSK 2: 是 (shì)"),
                        WordToken("三", "sān", "three / 3", "Kosakata HSK 2: 三 (sān)"),
                        WordToken("十", "shí", "ten / 10", "Kosakata HSK 2: 十 (shí)"),
                        WordToken("年", "nián", "year", "Kosakata HSK 2: 年 (nián)"),
                        WordToken("前", "qián", "ago / before / BC / former / formerly", "Kosakata HSK 2: 前 (qián)"),
                        WordToken("的", "de", "possessive particle (of; 's) / modifying particle (used after an attribute to modify a noun or to form a nominal expression)", "Kosakata HSK 2: 的 (de)"),
                        WordToken("今天", "jīn tiān", "today", "Kosakata HSK 2: 今天 (jīn tiān)"),
                        WordToken("出生", "chū shēng", "to be born", "Kosakata HSK 2: 出生 (chū shēng)"),
                        WordToken("的", "de", "emphatic particle (used at the end of a declarative sentence for emphasis)", "Kosakata HSK 2: 的 (de)")
                    )
                )
            ),
            questions = listOf(
                StoryQuestion(
                    id = "q_dadbday_1",
                    questionText = "爸爸回家后高兴地向五岁的儿子宣布了什么好消息？ (Kabar gembira apa yang diumumkan sang ayah kepada putranya yang berusia lima tahun?)",
                    options = listOf("今天要去游乐园玩 (Hari ini mau pergi bermain ke taman hiburan)", "今天是爸爸的生日，全家人要一起吃美味的蛋糕 (Hari ini adalah ulang tahun ayah dan mereka akan makan kue bersama)", "爸爸升职当经理了 (Ayah naik jabatan menjadi manajer)", "给儿子买了一辆新自行车 (Membelikan sepeda baru untuk putranya)"),
                    correctAnswerIndex = 1,
                    explanation = "Sang ayah pulang ke rumah dengan riang mengumumkan hari ulang tahunnya dan acara makan kue bersama."
                ),
                StoryQuestion(
                    id = "q_dadbday_2",
                    questionText = "当儿子问起“生日”的含义时，爸爸是如何简明解释的？ (Bagaimana ayah menjelaskan secara sederhana makna kata 'ulang tahun'?)",
                    options = listOf("可以放假不用上班的日子 (Hari libur tidak perlu bekerja)", "生日就是一个人出生的日子 (Ulang tahun adalah hari di mana seseorang dilahirkan)", "必须吃大餐的日子 (Hari wajib makan makanan mewah)", "去超市大采购的日子 (Hari belanja besar di supermarket)"),
                    correctAnswerIndex = 1,
                    explanation = "Ayah menerangkan bahwa ulang tahun adalah hari peringatan kelahiran seseorang."
                ),
                StoryQuestion(
                    id = "q_dadbday_3",
                    questionText = "五岁的儿子听完解释后，提出了什么充满童趣的疑问？ (Pertanyaan lugu apa yang diajukan sang anak setelah mendengar penjelasan sang ayah?)",
                    options = listOf("为什么蛋糕没有蜡烛？ (Mengapa kuenya tidak ada lilinnya?)", "既然今天是爸爸出生的日子，怎么一眨眼就长成这么大的大人了？ (Jika hari ini hari ayah dilahirkan, bagaimana bisa secepat itu langsung tumbuh menjadi orang dewasa sebesar ini?!)", "妈妈什么时候过生日？ (Kapan ibu berulang tahun?)", "可以分给小狗一块蛋糕吗？ (Bolehkah memberikan sepotong kue kepada anak anjing?)"),
                    correctAnswerIndex = 1,
                    explanation = "Anak kecil mengira 'hari lahir' berarti baru lahir hari ini ke dunia, sehingga heran ayahnya sudah berbadan besar!"
                ),
                StoryQuestion(
                    id = "q_dadbday_4",
                    questionText = "爸爸笑着说出的“三十年前的今天”体现了儿童在哪个维度的认知局限？ (Dimensi kognitif apa yang belum sepenuhnya dipahami anak usia 5 tahun dalam percakapan ini?)",
                    options = listOf("无法识别甜品滋味 (Tidak bisa membedakan rasa manis)", "对“年度周期循环”与“时间流逝历史”的抽象认知阶段 (Pemahaman konsep tahunan dan linimasa waktu yang masih dalam tahap awal perkembangan)", "缺乏语言表达能力 (Kurangnya kemampuan berbahasa)", "性格孤僻冷淡 (Sifat anak yang tertutup)"),
                    correctAnswerIndex = 1,
                    explanation = "Anak prasekolah belum memahami konsep kalender tahunan berulang bahwa ulang tahun merayakan peristiwa puluhan tahun silam."
                )
            )
        ),
        // Cerita Mandarin Bean 147 (HSK 2): Fishing (Memancing Ikan)
        Story(
            id = "story_fishing",
            titleHanzi = "钓鱼",
            titlePinyin = "Diàoyú",
            titleTranslation = "Fishing (Memancing Ikan)",
            level = "HSK 2",
            category = "Filosofi & Kebijaksanaan",
            description = "Nasihat mendalam tentang kemandirian dan cara mendapatkan hasil: bukan meminta ikan yang sudah ditangkap, melainkan meminta kail pancingnya.",
            coverEmoji = "🎣",
            coverImageRes = R.drawable.cover_story_fishing,
            estimatedReadMinutes = 2,
            sentences = listOf(
                Sentence(
                    id = "s_fishng_1",
                    hanzi = "有个老人在钓鱼，一个小孩走过去看他。",
                    pinyin = "yǒu gè lǎo rén zài diào yú yī gè xiǎo hái zǒu guò qù kàn tā",
                    translation = "Ada seorang kakek tua yang sedang memancing di tepi danau, lalu seorang anak kecil berjalan mendekat untuk memperhatikannya.",
                    tokens = listOf(
                        WordToken("有", "yǒu", "to have; there is", "Kosakata HSK 2: 有 (yǒu)"),
                        WordToken("个", "gè", "classifier for people or objects in general", "Kosakata HSK 2: 个 (gè)"),
                        WordToken("老人", "lǎo rén", "old man or woman / the elderly", "Kosakata HSK 2: 老人 (lǎo rén)"),
                        WordToken("在", "zài", "(used before a verb to indicate an action in progress)", "Kosakata HSK 2: 在 (zài)"),
                        WordToken("钓", "diào", "to fish with a hook and line; to angle", "Kosakata HSK 2: 钓 (diào)"),
                        WordToken("鱼", "yú", "fish", "Kosakata HSK 2: 鱼 (yú)"),
                        WordToken("一", "yī", "one / single / a (article)", "Kosakata HSK 2: 一 (yī)"),
                        WordToken("个", "gè", "classifier for people or objects in general", "Kosakata HSK 2: 个 (gè)"),
                        WordToken("小孩", "xiǎo hái", "child", "Kosakata HSK 2: 小孩 (xiǎo hái)"),
                        WordToken("走", "zǒu", "to walk / to go / to run / to move (of vehicle) / to visit / to leave / to go away / to die (euph.) / to change (shape, form, meaning)", "Kosakata HSK 2: 走 (zǒu)"),
                        WordToken("过", "guò", "to cross / to go over / to pass (time) / to celebrate (a holiday) / to live / to get along", "Kosakata HSK 2: 过 (guò)"),
                        WordToken("去", "qù", "(after a verb of motion) movement away from the speaker; (after certain verbs) detachment or separation", "Kosakata HSK 2: 去 (qù)"),
                        WordToken("看", "kàn", "to see; to look at / to read / to watch / to visit; to call on / to consider; to regard as / to look after / to treat (a patient or illness) / to depend on / to feel (that) / (after a verb) to give it a try / to watch out for", "Kosakata HSK 2: 看 (kàn)"),
                        WordToken("他", "tā", "he; him; his", "Kosakata HSK 2: 他 (tā)")
                    )
                ),
                Sentence(
                    id = "s_fishng_2",
                    hanzi = "老人觉得小孩很可爱，要把所有的鱼都送给他，但是小孩摇摇头，老人感到很奇怪，问：“为什么不要呢？”",
                    pinyin = "lǎo rén jué de xiǎo hái hěn kě ài yào bǎ suǒ yǒu de yú dōu sòng gěi tā dàn shì xiǎo hái yáo yáo tóu lǎo rén gǎn dào hěn qí guài wèn wèi shén me bù yào ne",
                    translation = "Kakek itu merasa anak tersebut sangat menggemaskan, sehingga berniat memberikan semua ikan hasil tangkapannya secara cuma-cuma, namun anak kecil itu menggelengkan kepala.",
                    tokens = listOf(
                        WordToken("老人", "lǎo rén", "old man or woman / the elderly", "Kosakata HSK 2: 老人 (lǎo rén)"),
                        WordToken("觉得", "jué de", "to think that ...; to feel that ...", "Kosakata HSK 2: 觉得 (jué de)"),
                        WordToken("小孩", "xiǎo hái", "child", "Kosakata HSK 2: 小孩 (xiǎo hái)"),
                        WordToken("很", "hěn", "very; quite", "Kosakata HSK 2: 很 (hěn)"),
                        WordToken("可爱", "kě ài", "adorable / cute / lovely", "Kosakata HSK 2: 可爱 (kě ài)"),
                        WordToken("要", "yào", "will; shall; about to / need to; should / if", "Kosakata HSK 2: 要 (yào)"),
                        WordToken("把", "bǎ", "(used to put the object before the verb: 把[ba3] + {noun} + {verb})", "Kosakata HSK 2: 把 (bǎ)"),
                        WordToken("所有", "suǒ yǒu", "all", "Kosakata HSK 2: 所有 (suǒ yǒu)"),
                        WordToken("的", "de", "possessive particle (of; 's) / modifying particle (used after an attribute to modify a noun or to form a nominal expression)", "Kosakata HSK 2: 的 (de)"),
                        WordToken("鱼", "yú", "fish", "Kosakata HSK 2: 鱼 (yú)"),
                        WordToken("都", "dōu", "all; both; entirely", "Kosakata HSK 2: 都 (dōu)"),
                        WordToken("送", "sòng", "to give (as a present)", "Kosakata HSK 2: 送 (sòng)"),
                        WordToken("给", "gěi", "to / for / for the benefit of / to do sth (for sb)", "Kosakata HSK 2: 给 (gěi)"),
                        WordToken("他", "tā", "he; him; his", "Kosakata HSK 2: 他 (tā)"),
                        WordToken("但是", "dàn shì", "but; however", "Kosakata HSK 2: 但是 (dàn shì)"),
                        WordToken("小孩", "xiǎo hái", "child", "Kosakata HSK 2: 小孩 (xiǎo hái)"),
                        WordToken("摇", "yáo", "to shake / to rock / to row / to crank", "Kosakata HSK 2: 摇 (yáo)"),
                        WordToken("摇", "yáo", "to shake / to rock / to row / to crank", "Kosakata HSK 2: 摇 (yáo)"),
                        WordToken("头", "tóu", "head / the top / end / beginning or end / chief / boss / side / aspect", "Kosakata HSK 2: 头 (tóu)"),
                        WordToken("老人", "lǎo rén", "old man or woman / the elderly", "Kosakata HSK 2: 老人 (lǎo rén)"),
                        WordToken("感", "gǎn", "to feel", "Kosakata HSK 2: 感 (gǎn)"),
                        WordToken("到", "dào", "to reach; to arrive / to (a place); until (a time); up to (a point) / (verb complement indicating arriving at a place or reaching a point)", "Kosakata HSK 2: 到 (dào)"),
                        WordToken("很", "hěn", "very; quite", "Kosakata HSK 2: 很 (hěn)"),
                        WordToken("奇怪", "qí guài", "strange / odd", "Kosakata HSK 2: 奇怪 (qí guài)"),
                        WordToken("问", "wèn", "to ask; to inquire", "Kosakata HSK 2: 问 (wèn)"),
                        WordToken("为什么", "wèi shén me", "why? / for what reason?", "Kosakata HSK 2: 为什么 (wèi shén me)"),
                        WordToken("不", "bù", "no; not so", "Kosakata HSK 2: 不 (bù)"),
                        WordToken("要", "yào", "to want; to need; to ask for", "Kosakata HSK 2: 要 (yào)"),
                        WordToken("呢", "ne", "(sentence-final particle) used in questions to link back to prior discourse or context (\"what about...?\", \"and...?\")", "Kosakata HSK 2: 呢 (ne)")
                    )
                ),
                Sentence(
                    id = "s_fishng_3",
                    hanzi = "小孩回答：“爷爷，我很喜欢吃鱼，但是这些鱼很快就会吃完。如果你教我学会了钓鱼，我就可以自己钓，这样一辈子也吃不完。”",
                    pinyin = "xiǎo hái huí dá yé ye wǒ hěn xǐ huan chī yú dàn shì zhè xiē yú hěn kuài jiù huì chī wán rú guǒ nǐ jiāo wǒ xué huì le diào yú wǒ jiù kě yǐ zì jǐ diào zhè yàng yī bèi zi yě chī bù wán",
                    translation = "Kakek merasa heran dan bertanya: “Mengapa kamu menolaknya?” Anak itu menjawab bijak: “Kakek, saya memang sangat suka makan ikan, tetapi ikan-ikan ini akan cepat habis dimakan. Namun jika Kakek mengajari saya cara memancing, saya bisa memancing sendiri dan ikannya tidak akan pernah habis seumur hidup.”",
                    tokens = listOf(
                        WordToken("小孩", "xiǎo hái", "child", "Kosakata HSK 2: 小孩 (xiǎo hái)"),
                        WordToken("回答", "huí dá", "to reply; to answer / reply; answer", "Kosakata HSK 2: 回答 (huí dá)"),
                        WordToken("爷爷", "yé ye", "(coll.) paternal grandfather; grandpa", "Kosakata HSK 2: 爷爷 (yé ye)"),
                        WordToken("我", "wǒ", "I; me; my", "Kosakata HSK 2: 我 (wǒ)"),
                        WordToken("很", "hěn", "very; quite", "Kosakata HSK 2: 很 (hěn)"),
                        WordToken("喜欢", "xǐ huan", "to like; to be fond of", "Kosakata HSK 2: 喜欢 (xǐ huan)"),
                        WordToken("吃", "chī", "to eat; to consume / to eat at", "Kosakata HSK 2: 吃 (chī)"),
                        WordToken("鱼", "yú", "fish", "Kosakata HSK 2: 鱼 (yú)"),
                        WordToken("但是", "dàn shì", "but; however", "Kosakata HSK 2: 但是 (dàn shì)"),
                        WordToken("这些", "zhè xiē", "these", "Kosakata HSK 2: 这些 (zhè xiē)"),
                        WordToken("鱼", "yú", "fish", "Kosakata HSK 2: 鱼 (yú)"),
                        WordToken("很", "hěn", "very; quite", "Kosakata HSK 2: 很 (hěn)"),
                        WordToken("快", "kuài", "soon / almost", "Kosakata HSK 2: 快 (kuài)"),
                        WordToken("就", "jiù", "as soon as; immediately after", "Kosakata HSK 2: 就 (jiù)"),
                        WordToken("会", "huì", "to be likely to; to be sure to", "Kosakata HSK 2: 会 (huì)"),
                        WordToken("吃", "chī", "to eat; to consume / to eat at", "Kosakata HSK 2: 吃 (chī)"),
                        WordToken("完", "wán", "to finish / to be over", "Kosakata HSK 2: 完 (wán)"),
                        WordToken("如果", "rú guǒ", "if; in case; in the event that", "Kosakata HSK 2: 如果 (rú guǒ)"),
                        WordToken("你", "nǐ", "you", "Kosakata HSK 2: 你 (nǐ)"),
                        WordToken("教", "jiāo", "to teach; to instruct", "Kosakata HSK 2: 教 (jiāo)"),
                        WordToken("我", "wǒ", "I; me; my", "Kosakata HSK 2: 我 (wǒ)"),
                        WordToken("学", "xué", "to learn / to study / to imitate", "Kosakata HSK 2: 学 (xué)"),
                        WordToken("会", "huì", "can; to have the skill; to know how to", "Kosakata HSK 2: 会 (huì)"),
                        WordToken("了", "le", "(completed action marker) / (modal particle indicating change of state, situation now)", "Kosakata HSK 2: 了 (le)"),
                        WordToken("钓", "diào", "to fish with a hook and line; to angle", "Kosakata HSK 2: 钓 (diào)"),
                        WordToken("鱼", "yú", "fish", "Kosakata HSK 2: 鱼 (yú)"),
                        WordToken("我", "wǒ", "I; me; my", "Kosakata HSK 2: 我 (wǒ)"),
                        WordToken("就", "jiù", "merely; nothing else but; simply; just; precisely; exactly", "Kosakata HSK 2: 就 (jiù)"),
                        WordToken("可以", "kě yǐ", "can / may / possible / able to", "Kosakata HSK 2: 可以 (kě yǐ)"),
                        WordToken("自己", "zì jǐ", "oneself; (attributive) one's own", "Kosakata HSK 2: 自己 (zì jǐ)"),
                        WordToken("钓", "diào", "to fish with a hook and line; to angle", "Kosakata HSK 2: 钓 (diào)"),
                        WordToken("这样", "zhè yàng", "this way; like this; so", "Kosakata HSK 2: 这样 (zhè yàng)"),
                        WordToken("一辈子", "yī bèi zi", "(for) a lifetime", "Kosakata HSK 2: 一辈子 (yī bèi zi)"),
                        WordToken("也", "yě", "even (extreme or unexpected case)", "Kosakata HSK 2: 也 (yě)"),
                        WordToken("吃", "chī", "to eat; to consume / to eat at", "Kosakata HSK 2: 吃 (chī)"),
                        WordToken("不", "bù", "no; not so", "Kosakata HSK 2: 不 (bù)"),
                        WordToken("完", "wán", "to finish / to be over", "Kosakata HSK 2: 完 (wán)")
                    )
                )
            ),
            questions = listOf(
                StoryQuestion(
                    id = "q_fishng_1",
                    questionText = "老人在湖边钓鱼时，看见走过来的可爱小孩，心生了什么善意的举动？ (Tindakan baik hati apa yang hendak dilakukan sang kakek pemancing kepada anak kecil yang mendekat?)",
                    options = listOf("把小孩赶走免得吵到鱼 (Mengusir anak itu agar tidak mengganggu ikan)", "要把自己辛辛苦苦钓到的所有鲜鱼全部送给孩子 (Ingin memberikan seluruh ikan hasil tangkapannya secara cuma-cuma)", "向小孩索要零花钱 (Meminta uang saku kepada anak kecil)", "让小孩帮忙下水捞鱼 (Menyuruh anak itu turun ke air mengambil ikan)"),
                    correctAnswerIndex = 1,
                    explanation = "Kakek pemancing merasa anak itu sangat menggemaskan dan bermurah hati ingin menghadiahkan seluruh ikannya."
                ),
                StoryQuestion(
                    id = "q_fishng_2",
                    questionText = "出乎老人的意料，小孩对送上门的鲜鱼做出了什么反应？ (Bagaimana reaksi tak terduga anak kecil tersebut saat hendak diberi ikan?)",
                    options = listOf("高兴地全部装进书包 (Dengan gembira memasukkan semua ikan ke dalam tas)", "礼貌地摇摇头拒绝了老人的赠与 (Menggelengkan kepala menolak pemberian ikan tersebut secara sopan)", "大声哭闹嫌鱼太小 (Menangis kencang karena menganggap ikannya terlalu kecil)", "直接把鱼扔回水里 (Langsung membuang ikannya kembali ke air)"),
                    correctAnswerIndex = 1,
                    explanation = "Anak tersebut menggelengkan kepala menolak hadiah ikan segar itu."
                ),
                StoryQuestion(
                    id = "q_fishng_3",
                    questionText = "小孩向老人说明了他不要现成鲜鱼的深刻原因是什么？ (Alasan bijak apa yang diutarakan sang anak mengapa ia tidak menginginkan ikan jadi?)",
                    options = listOf("自己对鱼肉严重过敏 (Dirinya alergi berat terhadap daging ikan)", "现成的鱼很快就会吃完，但如果学会了钓鱼技巧，一辈子都有鱼吃 (Ikan yang diberikan akan cepat habis, tapi jika diajari cara memancing maka seumur hidup ikannya tak akan habis)", "家里没有锅可以煮鱼 (Di rumah tidak ada wajan untuk memasak)", "嫌鱼身上有腥味 (Merasa bau amis pada ikan)"),
                    correctAnswerIndex = 1,
                    explanation = "Prinsip legendaris 'berilah kail bukan ikan': keterampilan memancing memberikan kemandirian berkelanjutan seumur hidup."
                ),
                StoryQuestion(
                    id = "q_fishng_4",
                    questionText = "这篇经典故事最贴切地对应了中国哪一句流传千古的教育哲理？ (Pepatah pendidikan Tiongkok mana yang paling tepat menggambarkan makna kisah ini?)",
                    options = listOf("授人以鱼不如授人以渔 (Memberi seseorang ikan tidak sebaik mengajarinya cara memancing)", "三天打鱼两天晒网 (Tiga hari memancing dua hari menjemur jala - tidak konsisten)", "姜太公钓鱼愿者上钩 (Kail Jiang Taigong yang rela yang memakan umpan)", "临渊羡鱼不如退而结网 (Daripada berdiri di tepi telaga mengagumi ikan, lebih baik pulang merajut jala)"),
                    correctAnswerIndex = 0,
                    explanation = "Filosofi 'Shòu rén yǐ yú bù rú shòu rén yǐ yú' (Memberi ikan tak sebanding dengan mengajarkan keterampilan memancing) adalah inti utama cerita ini."
                )
            )
        ),
        // Cerita Mandarin Bean 148 (HSK 2): Not My Dog (Bukan Anjing Saya)
        Story(
            id = "story_not_my_dog",
            titleHanzi = "不是我的狗",
            titlePinyin = "Bù Shì Wǒ De Gǒu",
            titleTranslation = "Not My Dog (Bukan Anjing Saya)",
            level = "HSK 2",
            category = "Humor Sehari-hari",
            description = "Kesalahpahaman jenaka seorang pengunjung toko yang mengelus anjing penjaga toko setelah bertanya apakah anjing milik sang pemilik menggigit.",
            coverEmoji = "🐕",
            coverImageRes = R.drawable.cover_story_not_my_dog,
            estimatedReadMinutes = 2,
            sentences = listOf(
                Sentence(
                    id = "s_notmydog_1",
                    hanzi = "一个女人走进一个商店，看见一只很可爱的小狗。",
                    pinyin = "yī gè nǚ rén zǒu jìn yī gè shāng diàn kàn jiàn yī zhī hěn kě ài de xiǎo gǒu",
                    translation = "Seorang wanita melangkah masuk ke dalam sebuah toko, lalu melihat seekor anak anjing yang tampak sangat lucu dan jinak.",
                    tokens = listOf(
                        WordToken("一", "yī", "one / single / a (article)", "Kosakata HSK 2: 一 (yī)"),
                        WordToken("个", "gè", "classifier for people or objects in general", "Kosakata HSK 2: 个 (gè)"),
                        WordToken("女人", "nǚ rén", "woman", "Kosakata HSK 2: 女人 (nǚ rén)"),
                        WordToken("走", "zǒu", "to walk / to go / to run / to move (of vehicle) / to visit / to leave / to go away / to die (euph.) / to change (shape, form, meaning)", "Kosakata HSK 2: 走 (zǒu)"),
                        WordToken("进", "jìn", "to go in / to enter / to put in / to submit / to take in / to admit", "Kosakata HSK 2: 进 (jìn)"),
                        WordToken("一", "yī", "one / single / a (article)", "Kosakata HSK 2: 一 (yī)"),
                        WordToken("个", "gè", "classifier for people or objects in general", "Kosakata HSK 2: 个 (gè)"),
                        WordToken("商店", "shāng diàn", "store; shop", "Kosakata HSK 2: 商店 (shāng diàn)"),
                        WordToken("看见", "kàn jiàn", "to see; to catch sight of", "Kosakata HSK 2: 看见 (kàn jiàn)"),
                        WordToken("一", "yī", "one / single / a (article)", "Kosakata HSK 2: 一 (yī)"),
                        WordToken("只", "zhī", "classifier for birds and certain animals, one of a pair, some utensils, vessels etc", "Kosakata HSK 2: 只 (zhī)"),
                        WordToken("很", "hěn", "very; quite", "Kosakata HSK 2: 很 (hěn)"),
                        WordToken("可爱", "kě ài", "adorable / cute / lovely", "Kosakata HSK 2: 可爱 (kě ài)"),
                        WordToken("的", "de", "possessive particle (of; 's) / modifying particle (used after an attribute to modify a noun or to form a nominal expression)", "Kosakata HSK 2: 的 (de)"),
                        WordToken("小", "xiǎo", "small / tiny / few", "Kosakata HSK 2: 小 (xiǎo)"),
                        WordToken("狗", "gǒu", "dog", "Kosakata HSK 2: 狗 (gǒu)")
                    )
                ),
                Sentence(
                    id = "s_notmydog_2",
                    hanzi = "她问老板：你的狗咬人吗？",
                    pinyin = "tā wèn lǎo bǎn nǐ de gǒu yǎo rén ma",
                    translation = "Ia bertanya kepada pemilik toko: “Apakah anjingmu ini suka menggigit orang?”",
                    tokens = listOf(
                        WordToken("她", "tā", "she", "Kosakata HSK 2: 她 (tā)"),
                        WordToken("问", "wèn", "to ask; to inquire", "Kosakata HSK 2: 问 (wèn)"),
                        WordToken("老板", "lǎo bǎn", "boss / business proprietor", "Kosakata HSK 2: 老板 (lǎo bǎn)"),
                        WordToken("你", "nǐ", "you", "Kosakata HSK 2: 你 (nǐ)"),
                        WordToken("的", "de", "possessive particle (of; 's) / modifying particle (used after an attribute to modify a noun or to form a nominal expression)", "Kosakata HSK 2: 的 (de)"),
                        WordToken("狗", "gǒu", "dog", "Kosakata HSK 2: 狗 (gǒu)"),
                        WordToken("咬", "yǎo", "to bite / to nip", "Kosakata HSK 2: 咬 (yǎo)"),
                        WordToken("人", "rén", "person; people", "Kosakata HSK 2: 人 (rén)"),
                        WordToken("吗", "ma", "(question particle for \"yes-no\" questions)", "Kosakata HSK 2: 吗 (ma)")
                    )
                ),
                Sentence(
                    id = "s_notmydog_3",
                    hanzi = "老板说：不，我的狗不咬人。",
                    pinyin = "lǎo bǎn shuō bù wǒ de gǒu bù yǎo rén",
                    translation = "Pemilik toko menjawab: “Tidak, anjing saya sama sekali tidak pernah menggigit orang.”",
                    tokens = listOf(
                        WordToken("老板", "lǎo bǎn", "boss / business proprietor", "Kosakata HSK 2: 老板 (lǎo bǎn)"),
                        WordToken("说", "shuō", "to speak; to talk; to say", "Kosakata HSK 2: 说 (shuō)"),
                        WordToken("不", "bù", "no; not so", "Kosakata HSK 2: 不 (bù)"),
                        WordToken("我", "wǒ", "I; me; my", "Kosakata HSK 2: 我 (wǒ)"),
                        WordToken("的", "de", "possessive particle (of; 's) / modifying particle (used after an attribute to modify a noun or to form a nominal expression)", "Kosakata HSK 2: 的 (de)"),
                        WordToken("狗", "gǒu", "dog", "Kosakata HSK 2: 狗 (gǒu)"),
                        WordToken("不", "bù", "no; not so", "Kosakata HSK 2: 不 (bù)"),
                        WordToken("咬", "yǎo", "to bite / to nip", "Kosakata HSK 2: 咬 (yǎo)"),
                        WordToken("人", "rén", "person; people", "Kosakata HSK 2: 人 (rén)")
                    )
                ),
                Sentence(
                    id = "s_notmydog_4",
                    hanzi = "这个女人就开始摸小狗，但是小狗还是咬了她。",
                    pinyin = "zhè gè nǚ rén jiù kāi shǐ mō xiǎo gǒu dàn shì xiǎo gǒu hái shi yǎo le tā",
                    translation = "Mendengar itu, sang wanita pun mulai mengelus-elus anak anjing tersebut, namun tiba-tiba anak anjing itu langsung menggigit tangannya!",
                    tokens = listOf(
                        WordToken("这", "zhè", "this; these", "Kosakata HSK 2: 这 (zhè)"),
                        WordToken("个", "gè", "classifier for people or objects in general", "Kosakata HSK 2: 个 (gè)"),
                        WordToken("女人", "nǚ rén", "woman", "Kosakata HSK 2: 女人 (nǚ rén)"),
                        WordToken("就", "jiù", "in that case; then", "Kosakata HSK 2: 就 (jiù)"),
                        WordToken("开始", "kāi shǐ", "to begin / to start", "Kosakata HSK 2: 开始 (kāi shǐ)"),
                        WordToken("摸", "mō", "to feel with the hand / to touch / to stroke / to grope / to steal / to abstract", "Kosakata HSK 2: 摸 (mō)"),
                        WordToken("小", "xiǎo", "young", "Kosakata HSK 2: 小 (xiǎo)"),
                        WordToken("狗", "gǒu", "dog", "Kosakata HSK 2: 狗 (gǒu)"),
                        WordToken("但是", "dàn shì", "but; however", "Kosakata HSK 2: 但是 (dàn shì)"),
                        WordToken("小", "xiǎo", "young", "Kosakata HSK 2: 小 (xiǎo)"),
                        WordToken("狗", "gǒu", "dog", "Kosakata HSK 2: 狗 (gǒu)"),
                        WordToken("还是", "hái shi", "still (as before)", "Kosakata HSK 2: 还是 (hái shi)"),
                        WordToken("咬", "yǎo", "to bite / to nip", "Kosakata HSK 2: 咬 (yǎo)"),
                        WordToken("了", "le", "(completed action marker) / (modal particle indicating change of state, situation now)", "Kosakata HSK 2: 了 (le)"),
                        WordToken("她", "tā", "she", "Kosakata HSK 2: 她 (tā)")
                    )
                ),
                Sentence(
                    id = "s_notmydog_5",
                    hanzi = "她很生气：你说你的狗不咬人！",
                    pinyin = "tā hěn shēng qì nǐ shuō nǐ de gǒu bù yǎo rén",
                    translation = "Wanita itu marah besar dan berteriak: “Kamu tadi bilang anjingmu tidak menggigit!”",
                    tokens = listOf(
                        WordToken("她", "tā", "she", "Kosakata HSK 2: 她 (tā)"),
                        WordToken("很", "hěn", "very; quite", "Kosakata HSK 2: 很 (hěn)"),
                        WordToken("生气", "shēng qì", "to get angry; to be furious", "Kosakata HSK 2: 生气 (shēng qì)"),
                        WordToken("你", "nǐ", "you", "Kosakata HSK 2: 你 (nǐ)"),
                        WordToken("说", "shuō", "to speak; to talk; to say", "Kosakata HSK 2: 说 (shuō)"),
                        WordToken("你", "nǐ", "you", "Kosakata HSK 2: 你 (nǐ)"),
                        WordToken("的", "de", "possessive particle (of; 's) / modifying particle (used after an attribute to modify a noun or to form a nominal expression)", "Kosakata HSK 2: 的 (de)"),
                        WordToken("狗", "gǒu", "dog", "Kosakata HSK 2: 狗 (gǒu)"),
                        WordToken("不", "bù", "no; not so", "Kosakata HSK 2: 不 (bù)"),
                        WordToken("咬", "yǎo", "to bite / to nip", "Kosakata HSK 2: 咬 (yǎo)"),
                        WordToken("人", "rén", "person; people", "Kosakata HSK 2: 人 (rén)")
                    )
                ),
                Sentence(
                    id = "s_notmydog_6",
                    hanzi = "老板回答：是的，但是那不是我的狗。",
                    pinyin = "lǎo bǎn huí dá shì de dàn shì nà bù shì wǒ de gǒu",
                    translation = "Pemilik toko dengan tenang menjawab: “Benar, tapi itu tadi kan bukan anjing milik saya.”",
                    tokens = listOf(
                        WordToken("老板", "lǎo bǎn", "boss / business proprietor", "Kosakata HSK 2: 老板 (lǎo bǎn)"),
                        WordToken("回答", "huí dá", "to reply; to answer / reply; answer", "Kosakata HSK 2: 回答 (huí dá)"),
                        WordToken("是的", "shì de", "yes, that's right", "Kosakata HSK 2: 是的 (shì de)"),
                        WordToken("但是", "dàn shì", "but; however", "Kosakata HSK 2: 但是 (dàn shì)"),
                        WordToken("那", "nà", "(specifier) that; the; those / (pronoun) that (referring to persons, things or situations)", "Kosakata HSK 2: 那 (nà)"),
                        WordToken("不是", "bù shì", "is not", "Kosakata HSK 2: 不是 (bù shì)"),
                        WordToken("我", "wǒ", "I; me; my", "Kosakata HSK 2: 我 (wǒ)"),
                        WordToken("的", "de", "possessive particle (of; 's) / modifying particle (used after an attribute to modify a noun or to form a nominal expression)", "Kosakata HSK 2: 的 (de)"),
                        WordToken("狗", "gǒu", "dog", "Kosakata HSK 2: 狗 (gǒu)")
                    )
                )
            ),
            questions = listOf(
                StoryQuestion(
                    id = "q_notmydog_1",
                    questionText = "那位女士走进商店后，被什么事物所吸引？ (Hal apa yang menarik perhatian wanita tersebut begitu masuk ke dalam toko?)",
                    options = listOf("漂亮的衣服 (Pakaian yang indah)", "一只看起来非常可爱乖巧的小狗 (Seekor anak anjing yang tampak sangat lucu dan menggemaskan)", "柜台上的名贵香水 (Parfum mahal di etalase)", "店里打折的商品 (Barang diskon di toko)"),
                    correctAnswerIndex = 1,
                    explanation = "Wanita itu tertarik melihat seekor anak anjing berbulu lebat yang tampak ramah di dalam toko."
                ),
                StoryQuestion(
                    id = "q_notmydog_2",
                    questionText = "在伸手抚摸小狗之前，女士向店老板做出了怎样的确认？ (Konfirmasi apa yang dilakukan sang wanita kepada pemilik toko sebelum mengelus anjing itu?)",
                    options = listOf("询问小狗多少钱可以买走 (Menanyakan berapa harga untuk membeli anjing itu)", "询问老板他的狗会不会咬人 (Menanyakan kepada pemilik toko apakah anjing miliknya menggigit)", "询问小狗吃过午饭没有 (Menanyakan apakah anjingnya sudah makan siang)", "询问小狗叫什么名字 (Menanyakan nama anjing tersebut)"),
                    correctAnswerIndex = 1,
                    explanation = "Wanita tersebut bertanya untuk memastikan keamanan: 'Apakah anjingmu ini suka menggigit orang?'"
                ),
                StoryQuestion(
                    id = "q_notmydog_3",
                    questionText = "当女士放心地去摸小狗时，发生了什么意外事故？ (Kejadian mengejutkan apa yang dialami wanita tersebut saat mengelus anak anjing?)",
                    options = listOf("小狗跳到她怀里撒娇 (Anjing melompat bermanja ke pelukannya)", "小狗突然张嘴狠狠咬了她一口 (Anak anjing tersebut mendadak menggigit tangannya)", "小狗吓得跑出商店 (Anjing ketakutan lari keluar toko)", "小狗把店里的花瓶打碎了 (Anjing memecahkan vas bunga toko)"),
                    correctAnswerIndex = 1,
                    explanation = "Meskipun sudah bertanya, anak anjing itu ternyata langsung menggigit tangannya."
                ),
                StoryQuestion(
                    id = "q_notmydog_4",
                    questionText = "店老板面对女士的愤怒质问，给出的荒诞回答体现了什么逻辑漏洞？ (Kelemahan logika apa yang menjadi dalih absurd sang pemilik toko?)",
                    options = listOf("老板根本听不懂中文 (Pemilik toko tidak paham bahasa Mandarin)", "女士问的是“你的狗”，老板答的是“我的狗不咬人”，但眼前这只狗根本不是老板的狗 (Wanita bertanya 'anjingmu', pemilik menjawab 'anjingku tidak menggigit', padahal anjing di depannya itu bukan anjing miliknya!)", "老板记性不好 (Pemilik toko pelupa)", "小狗认错人了 (Anjing salah mengenali orang)"),
                    correctAnswerIndex = 1,
                    explanation = "Kelakar miskomunikasi: anjing pemilik toko memang jinak di rumah, tapi anjing liar yang ada di toko itu milik orang lain!"
                )
            )
        ),
        // Cerita Mandarin Bean 149 (HSK 2): Barking Dogs Don't Bite (Anjing Menggonggong Tak Menggigit)
        Story(
            id = "story_barking_dogs_dont_bite",
            titleHanzi = "叫的狗不咬人",
            titlePinyin = "Jiào De Gǒu Bù Yǎo Rén",
            titleTranslation = "Barking Dogs Don't Bite (Anjing Menggonggong Tak Menggigit)",
            level = "HSK 2",
            category = "Keluarga & Humor",
            description = "Percakapan ayah dan anak saat bertemu anjing galak di taman: anak mengerti peribahasa itu, tapi ragu apakah anjingnya juga tahu peribahasa tersebut.",
            coverEmoji = "🐶",
            coverImageRes = R.drawable.cover_story_barking_dogs_dont_bite,
            estimatedReadMinutes = 2,
            sentences = listOf(
                Sentence(
                    id = "s_barkdog_1",
                    hanzi = "吃完晚饭后，爸爸和儿子一起在公园散步。",
                    pinyin = "chī wán wǎn fàn hòu bà ba hé ér zi yī qǐ zài gōng yuán sàn bù",
                    translation = "Seusai makan malam, ayah dan putranya berjalan-jalan santai di taman kota.",
                    tokens = listOf(
                        WordToken("吃", "chī", "to eat; to consume / to eat at", "Kosakata HSK 2: 吃 (chī)"),
                        WordToken("完", "wán", "to finish / to be over", "Kosakata HSK 2: 完 (wán)"),
                        WordToken("晚饭", "wǎn fàn", "evening meal / dinner / supper", "Kosakata HSK 2: 晚饭 (wǎn fàn)"),
                        WordToken("后", "hòu", "afterwards / after", "Kosakata HSK 2: 后 (hòu)"),
                        WordToken("爸爸", "bà ba", "(coll.) father; dad", "Kosakata HSK 2: 爸爸 (bà ba)"),
                        WordToken("和", "hé", "and; together with", "Kosakata HSK 2: 和 (hé)"),
                        WordToken("儿子", "ér zi", "son", "Kosakata HSK 2: 儿子 (ér zi)"),
                        WordToken("一起", "yī qǐ", "together; in company (with)", "Kosakata HSK 2: 一起 (yī qǐ)"),
                        WordToken("在", "zài", "(of sb or sth) to be (located) at", "Kosakata HSK 2: 在 (zài)"),
                        WordToken("公园", "gōng yuán", "park (for public recreation)", "Kosakata HSK 2: 公园 (gōng yuán)"),
                        WordToken("散步", "sàn bù", "to take a walk; to go for a walk", "Kosakata HSK 2: 散步 (sàn bù)")
                    )
                ),
                Sentence(
                    id = "s_barkdog_2",
                    hanzi = "突然，一只大黑狗从前面跑过来对着他们叫。",
                    pinyin = "tū rán yī zhī dà hēi gǒu cóng qián miàn pǎo guò lái duì zhe tā men jiào",
                    translation = "Tiba-tiba, seekor anjing hitam berukuran besar berlari kencang dari arah depan sambil menggonggong garang ke arah mereka berdua.",
                    tokens = listOf(
                        WordToken("突然", "tū rán", "sudden; abrupt; unexpected", "Kosakata HSK 2: 突然 (tū rán)"),
                        WordToken("一", "yī", "one / single / a (article)", "Kosakata HSK 2: 一 (yī)"),
                        WordToken("只", "zhī", "classifier for birds and certain animals, one of a pair, some utensils, vessels etc", "Kosakata HSK 2: 只 (zhī)"),
                        WordToken("大", "dà", "big; large; great / older (than another person) / eldest", "Kosakata HSK 2: 大 (dà)"),
                        WordToken("黑", "hēi", "black / dark / sinister / secret / shady / illegal", "Kosakata HSK 2: 黑 (hēi)"),
                        WordToken("狗", "gǒu", "dog", "Kosakata HSK 2: 狗 (gǒu)"),
                        WordToken("从", "cóng", "from; through; via / (bound form) retainer; attendant / (bound form) assistant; auxiliary; subordinate / (bound form) related by common paternal grandfather or earlier ancestor", "Kosakata HSK 2: 从 (cóng)"),
                        WordToken("前面", "qián miàn", "ahead / in front / preceding / above", "Kosakata HSK 2: 前面 (qián miàn)"),
                        WordToken("跑", "pǎo", "to run / to run away / to escape / to run around (on errands etc) / (of a gas or liquid) to leak or evaporate", "Kosakata HSK 2: 跑 (pǎo)"),
                        WordToken("过", "guò", "to cross / to go over / to pass (time) / to celebrate (a holiday) / to live / to get along", "Kosakata HSK 2: 过 (guò)"),
                        WordToken("来", "lái", "hither (directional complement for motion toward the speaker)", "Kosakata HSK 2: 来 (lái)"),
                        WordToken("对", "duì", "towards; at; for / concerning; regarding", "Kosakata HSK 2: 对 (duì)"),
                        WordToken("着", "zhe", "aspect particle indicating action in progress or ongoing state", "Kosakata HSK 2: 着 (zhe)"),
                        WordToken("他们", "tā men", "they; them", "Kosakata HSK 2: 他们 (tā men)"),
                        WordToken("叫", "jiào", "to shout", "Kosakata HSK 2: 叫 (jiào)")
                    )
                ),
                Sentence(
                    id = "s_barkdog_3",
                    hanzi = "儿子非常害怕，躲到了爸爸后面。",
                    pinyin = "ér zi fēi cháng hài pà duǒ dào le bà ba hòu miàn",
                    translation = "Sang anak sangat ketakutan dan langsung bersembunyi di balik punggung ayahnya.",
                    tokens = listOf(
                        WordToken("儿子", "ér zi", "son", "Kosakata HSK 2: 儿子 (ér zi)"),
                        WordToken("非常", "fēi cháng", "very; really", "Kosakata HSK 2: 非常 (fēi cháng)"),
                        WordToken("害怕", "hài pà", "to be afraid; to be scared", "Kosakata HSK 2: 害怕 (hài pà)"),
                        WordToken("躲", "duǒ", "to hide / to dodge / to avoid", "Kosakata HSK 2: 躲 (duǒ)"),
                        WordToken("到", "dào", "to reach; to arrive / to (a place); until (a time); up to (a point) / (verb complement indicating arriving at a place or reaching a point)", "Kosakata HSK 2: 到 (dào)"),
                        WordToken("了", "le", "(completed action marker) / (modal particle indicating change of state, situation now)", "Kosakata HSK 2: 了 (le)"),
                        WordToken("爸爸", "bà ba", "(coll.) father; dad", "Kosakata HSK 2: 爸爸 (bà ba)"),
                        WordToken("后面", "hòu miàn", "behind; near the end; at the back / later; afterwards", "Kosakata HSK 2: 后面 (hòu miàn)")
                    )
                ),
                Sentence(
                    id = "s_barkdog_4",
                    hanzi = "爸爸说：“别怕，孩子。你知道吗？叫的狗是不咬人的，不叫的狗才危险呢。”",
                    pinyin = "bà ba shuō bié pà hái zi nǐ zhī dào ma jiào de gǒu shì bù yǎo rén de bù jiào de gǒu cái wēi xiǎn ne",
                    translation = "Ayah menenangkan: “Jangan takut, Nak. Tahukah kamu bahwa pepatah mengatakan ‘anjing yang menggonggong itu tidak akan menggigit’, justru anjing yang diam tidak menggonggong itulah yang berbahaya!”",
                    tokens = listOf(
                        WordToken("爸爸", "bà ba", "(coll.) father; dad", "Kosakata HSK 2: 爸爸 (bà ba)"),
                        WordToken("说", "shuō", "to speak; to talk; to say", "Kosakata HSK 2: 说 (shuō)"),
                        WordToken("别", "bié", "don't ...! / (noun suffix) category", "Kosakata HSK 2: 别 (bié)"),
                        WordToken("怕", "pà", "to be afraid / to fear / to dread / to be unable to endure", "Kosakata HSK 2: 怕 (pà)"),
                        WordToken("孩子", "hái zi", "child", "Kosakata HSK 2: 孩子 (hái zi)"),
                        WordToken("你", "nǐ", "you", "Kosakata HSK 2: 你 (nǐ)"),
                        WordToken("知道", "zhī dào", "to know; to become aware of", "Kosakata HSK 2: 知道 (zhī dào)"),
                        WordToken("吗", "ma", "(question particle for \"yes-no\" questions)", "Kosakata HSK 2: 吗 (ma)"),
                        WordToken("叫", "jiào", "to shout", "Kosakata HSK 2: 叫 (jiào)"),
                        WordToken("的", "de", "possessive particle (of; 's) / modifying particle (used after an attribute to modify a noun or to form a nominal expression)", "Kosakata HSK 2: 的 (de)"),
                        WordToken("狗", "gǒu", "dog", "Kosakata HSK 2: 狗 (gǒu)"),
                        WordToken("是", "shì", "indeed (used for emphasis)", "Kosakata HSK 2: 是 (shì)"),
                        WordToken("不", "bù", "no; not so", "Kosakata HSK 2: 不 (bù)"),
                        WordToken("咬", "yǎo", "to bite / to nip", "Kosakata HSK 2: 咬 (yǎo)"),
                        WordToken("人", "rén", "person; people", "Kosakata HSK 2: 人 (rén)"),
                        WordToken("的", "de", "emphatic particle (used at the end of a declarative sentence for emphasis)", "Kosakata HSK 2: 的 (de)"),
                        WordToken("不", "bù", "no; not so", "Kosakata HSK 2: 不 (bù)"),
                        WordToken("叫", "jiào", "to shout", "Kosakata HSK 2: 叫 (jiào)"),
                        WordToken("的", "de", "possessive particle (of; 's) / modifying particle (used after an attribute to modify a noun or to form a nominal expression)", "Kosakata HSK 2: 的 (de)"),
                        WordToken("狗", "gǒu", "dog", "Kosakata HSK 2: 狗 (gǒu)"),
                        WordToken("才", "cái", "then and only then", "Kosakata HSK 2: 才 (cái)"),
                        WordToken("危险", "wēi xiǎn", "dangerous", "Kosakata HSK 2: 危险 (wēi xiǎn)"),
                        WordToken("呢", "ne", "(discourse particle) used to mark a slight pause or emphasis in speech", "Kosakata HSK 2: 呢 (ne)")
                    )
                ),
                Sentence(
                    id = "s_barkdog_5",
                    hanzi = "儿子说：“我知道，爸爸。可是那只狗可能不知道这个道理。”",
                    pinyin = "ér zi shuō wǒ zhī dào bà ba kě shì nà zhī gǒu kě néng bù zhī dào zhè gè dào lǐ",
                    translation = "Sang anak gemetar menjawab: “Aku paham pepatah itu, Ayah... tapi masalahnya, anjing itu mungkin belum pernah belajar peribahasa tersebut!”",
                    tokens = listOf(
                        WordToken("儿子", "ér zi", "son", "Kosakata HSK 2: 儿子 (ér zi)"),
                        WordToken("说", "shuō", "to speak; to talk; to say", "Kosakata HSK 2: 说 (shuō)"),
                        WordToken("我", "wǒ", "I; me; my", "Kosakata HSK 2: 我 (wǒ)"),
                        WordToken("知道", "zhī dào", "to know; to become aware of", "Kosakata HSK 2: 知道 (zhī dào)"),
                        WordToken("爸爸", "bà ba", "(coll.) father; dad", "Kosakata HSK 2: 爸爸 (bà ba)"),
                        WordToken("可是", "kě shì", "but; however", "Kosakata HSK 2: 可是 (kě shì)"),
                        WordToken("那", "nà", "(specifier) that; the; those / (pronoun) that (referring to persons, things or situations)", "Kosakata HSK 2: 那 (nà)"),
                        WordToken("只", "zhī", "classifier for birds and certain animals, one of a pair, some utensils, vessels etc", "Kosakata HSK 2: 只 (zhī)"),
                        WordToken("狗", "gǒu", "dog", "Kosakata HSK 2: 狗 (gǒu)"),
                        WordToken("可能", "kě néng", "might (happen) / maybe / perhaps", "Kosakata HSK 2: 可能 (kě néng)"),
                        WordToken("不", "bù", "no; not so", "Kosakata HSK 2: 不 (bù)"),
                        WordToken("知道", "zhī dào", "to know; to become aware of", "Kosakata HSK 2: 知道 (zhī dào)"),
                        WordToken("这", "zhè", "this; these", "Kosakata HSK 2: 这 (zhè)"),
                        WordToken("个", "gè", "classifier for people or objects in general", "Kosakata HSK 2: 个 (gè)"),
                        WordToken("道理", "dào lǐ", "reason / argument / sense / principle / basis / justification", "Kosakata HSK 2: 道理 (dào lǐ)")
                    )
                )
            ),
            questions = listOf(
                StoryQuestion(
                    id = "q_barkdog_1",
                    questionText = "散步时突然冲出一只大黑狗狂叫，儿子的本能反应是什么？ (Apa respon spontan sang anak saat seekor anjing hitam besar mendadak menggonggong galak?)",
                    options = listOf("捡起地上的石头去砸狗 (Mengambil batu di tanah untuk melempar anjing)", "吓得心惊胆战，迅速躲到了爸爸的身后 (Sangat ketakutan dan langsung bersembunyi di balik punggung ayahnya)", "高兴地跑上去拥抱大狗 (Berlari gembira memeluk anjing besar itu)", "大声吹口哨叫伙伴 (Bersiul memanggil temannya)"),
                    correctAnswerIndex = 1,
                    explanation = "Gonggongan anjing hitam besar yang tiba-tiba membuat sang anak gemetar ketakutan dan bersembunyi di balik tubuh ayah."
                ),
                StoryQuestion(
                    id = "q_barkdog_2",
                    questionText = "爸爸为了给身后的儿子壮胆，引用了哪一句著名的俗语常识？ (Pepatah populer apa yang diucapkan sang ayah untuk menenangkan ketakutan putranya?)",
                    options = listOf("初生牛犊不怕虎 (Anak sapi yang baru lahir tak takut harimau)", "“叫的狗是不咬人的，不叫的狗才危险呢” (Anjing yang menggonggong itu tidak menggigit, justru anjing yang diam tidak menggonggonglah yang berbahaya)", "狗仗人势 (Anjing yang sombong karena majikannya)", "画虎不成反类犬 (Hendak menggambar harimau malah jadi mirip anjing)"),
                    correctAnswerIndex = 1,
                    explanation = "Ayah mengutip peribahasa umum bahwa anjing yang menyalak kencang biasanya hanya menggertak dan tidak menggigit."
                ),
                StoryQuestion(
                    id = "q_barkdog_3",
                    questionText = "儿子听到父亲的大道理后，给出了怎样绝妙的反驳？ (Sanggahan cerdik apa yang disampaikan sang anak merespons teori sang ayah?)",
                    options = listOf("“那条狗太丑了” (Anjing itu terlalu jelek)", "“我知道这个道理，但是那只狗可能不知道这个道理啊！” (Aku tahu peribahasa itu, Ayah... tapi masalahnya anjing itu mungkin tidak tahu pepatah tersebut!)", "“爸爸你快跑吧” (Ayah lari saja duluan)", "“我们报警抓狗吧” (Ayo kita lapor polisi)"),
                    correctAnswerIndex = 1,
                    explanation = "Puncak humor: teori manusia tentang pepatah anjing belum tentu dipatuhi oleh anjing yang sedang marah!"
                ),
                StoryQuestion(
                    id = "q_barkdog_4",
                    questionText = "这个小故事在幽默之余，给人们在面对真实危险时带来什么安全警示？ (Peringatan keselamatan apa yang tersirat dari kelakar anjing menggonggong ini?)",
                    options = listOf("只要大声背诵谚语狗就会被吓跑 (Menghafal peribahasa bisa mengusir anjing buas)", "书本理论与俗语经验不能生搬硬套，在现实危险面前必须保持高度警戒与防范措施 (Teori buku dan peribahasa tak boleh ditelan mentah-mentah; kewaspadaan fisik tetap wajib dijaga di depan ancaman nyata)", "所有黑色的狗都是好朋友 (Semua anjing berbulu hitam adalah teman)", "遇到野狗立刻躺下装死 (Jika bertemu anjing liar segera pura-pura mati)"),
                    correctAnswerIndex = 1,
                    explanation = "Anak kecil mengingatkan kita bahwa keselamatan praktis jauh lebih penting daripada sekadar teori di atas kertas."
                )
            )
        ),
        // Cerita Mandarin Bean 150 (HSK 2): Make the Loss Cute (Sepatu Kedua yang Dibuang)
        Story(
            id = "story_make_the_loss_cute",
            titleHanzi = "第二只鞋子",
            titlePinyin = "Dì Èr Zhī Xiézi",
            titleTranslation = "Make the Loss Cute (Sepatu Kedua yang Dibuang)",
            level = "HSK 2",
            category = "Kebijaksanaan Hidup",
            description = "Kisah inspiratif tentang merelakan kehilangan: membuang sepatu sebelah lainnya ke luar kereta agar siapa pun yang menemukannya bisa memakai sepasang sepatu utuh.",
            coverEmoji = "👟",
            coverImageRes = R.drawable.cover_story_make_the_loss_cute,
            estimatedReadMinutes = 2,
            sentences = listOf(
                Sentence(
                    id = "s_lossloss_1",
                    hanzi = "有个人买了一双新鞋子，他非常喜欢，所以他穿着新鞋子坐火车去见女朋友。",
                    pinyin = "yǒu gè rén mǎi le yī shuāng xīn xié zi tā fēi cháng xǐ huan suǒ yǐ tā chuān zhe xīn xié zi zuò huǒ chē qù jiàn nǚ péng you",
                    translation = "Seseorang membeli sepasang sepatu baru bermerek yang sangat ia sukai, lalu ia mengenakan sepatu baru tersebut naik kereta api untuk pergi menemui sang kekasih.",
                    tokens = listOf(
                        WordToken("有", "yǒu", "to have; there is", "Kosakata HSK 2: 有 (yǒu)"),
                        WordToken("个", "gè", "classifier for people or objects in general", "Kosakata HSK 2: 个 (gè)"),
                        WordToken("人", "rén", "person; people", "Kosakata HSK 2: 人 (rén)"),
                        WordToken("买", "mǎi", "to buy / to purchase", "Kosakata HSK 2: 买 (mǎi)"),
                        WordToken("了", "le", "(completed action marker) / (modal particle indicating change of state, situation now)", "Kosakata HSK 2: 了 (le)"),
                        WordToken("一", "yī", "one / single / a (article)", "Kosakata HSK 2: 一 (yī)"),
                        WordToken("双", "shuāng", "pair", "Kosakata HSK 2: 双 (shuāng)"),
                        WordToken("新", "xīn", "new; newly", "Kosakata HSK 2: 新 (xīn)"),
                        WordToken("鞋子", "xié zi", "shoe", "Kosakata HSK 2: 鞋子 (xié zi)"),
                        WordToken("他", "tā", "he; him; his", "Kosakata HSK 2: 他 (tā)"),
                        WordToken("非常", "fēi cháng", "very; really", "Kosakata HSK 2: 非常 (fēi cháng)"),
                        WordToken("喜欢", "xǐ huan", "to like; to be fond of", "Kosakata HSK 2: 喜欢 (xǐ huan)"),
                        WordToken("所以", "suǒ yǐ", "therefore / as a result / so", "Kosakata HSK 2: 所以 (suǒ yǐ)"),
                        WordToken("他", "tā", "he; him; his", "Kosakata HSK 2: 他 (tā)"),
                        WordToken("穿", "chuān", "to wear / to put on / to dress", "Kosakata HSK 2: 穿 (chuān)"),
                        WordToken("着", "zhe", "aspect particle indicating action in progress or ongoing state", "Kosakata HSK 2: 着 (zhe)"),
                        WordToken("新", "xīn", "new; newly", "Kosakata HSK 2: 新 (xīn)"),
                        WordToken("鞋子", "xié zi", "shoe", "Kosakata HSK 2: 鞋子 (xié zi)"),
                        WordToken("坐", "zuò", "to sit / to take a seat / to take (a bus, airplane etc) / to bear fruit", "Kosakata HSK 2: 坐 (zuò)"),
                        WordToken("火车", "huǒ chē", "train", "Kosakata HSK 2: 火车 (huǒ chē)"),
                        WordToken("去", "qù", "to go, to go to", "Kosakata HSK 2: 去 (qù)"),
                        WordToken("见", "jiàn", "to see / to meet / to appear (to be sth) / to interview", "Kosakata HSK 2: 见 (jiàn)"),
                        WordToken("女", "nǚ", "female", "Kosakata HSK 2: 女 (nǚ)"),
                        WordToken("朋友", "péng you", "friend", "Kosakata HSK 2: 朋友 (péng you)")
                    )
                ),
                Sentence(
                    id = "s_lossloss_2",
                    hanzi = "但是在火车上，他的一只鞋子从火车上掉了下去。",
                    pinyin = "dàn shì zài huǒ chē shàng tā de yī zhī xié zi cóng huǒ chē shàng diào le xià qù",
                    translation = "Namun di tengah perjalanan kereta yang melaju kencang, sebelah sepatunya tanpa sengaja terlepas dan jatuh keluar dari jendela kereta.",
                    tokens = listOf(
                        WordToken("但是", "dàn shì", "but; however", "Kosakata HSK 2: 但是 (dàn shì)"),
                        WordToken("在", "zài", "(of sb or sth) to be (located) at", "Kosakata HSK 2: 在 (zài)"),
                        WordToken("火车", "huǒ chē", "train", "Kosakata HSK 2: 火车 (huǒ chē)"),
                        WordToken("上", "shàng", "(noun suffix) on; above", "Kosakata HSK 2: 上 (shàng)"),
                        WordToken("他", "tā", "he; him; his", "Kosakata HSK 2: 他 (tā)"),
                        WordToken("的", "de", "possessive particle (of; 's) / modifying particle (used after an attribute to modify a noun or to form a nominal expression)", "Kosakata HSK 2: 的 (de)"),
                        WordToken("一", "yī", "one / single / a (article)", "Kosakata HSK 2: 一 (yī)"),
                        WordToken("只", "zhī", "classifier for birds and certain animals, one of a pair, some utensils, vessels etc", "Kosakata HSK 2: 只 (zhī)"),
                        WordToken("鞋子", "xié zi", "shoe", "Kosakata HSK 2: 鞋子 (xié zi)"),
                        WordToken("从", "cóng", "from; through; via / (bound form) retainer; attendant / (bound form) assistant; auxiliary; subordinate / (bound form) related by common paternal grandfather or earlier ancestor", "Kosakata HSK 2: 从 (cóng)"),
                        WordToken("火车", "huǒ chē", "train", "Kosakata HSK 2: 火车 (huǒ chē)"),
                        WordToken("上", "shàng", "(noun suffix) on; above", "Kosakata HSK 2: 上 (shàng)"),
                        WordToken("掉", "diào", "to fall / to drop / to lag behind / to lose / to go missing / to reduce / fall (in prices) / to lose (value, weight etc) / to wag / to swing / to turn / to change / to exchange / to swap / to show off / to shed (hair)", "Kosakata HSK 2: 掉 (diào)"),
                        WordToken("了", "le", "(completed action marker) / (modal particle indicating change of state, situation now)", "Kosakata HSK 2: 了 (le)"),
                        WordToken("下", "xià", "down / downwards / below", "Kosakata HSK 2: 下 (xià)"),
                        WordToken("去", "qù", "(after a verb of motion) movement away from the speaker; (after certain verbs) detachment or separation", "Kosakata HSK 2: 去 (qù)")
                    )
                ),
                Sentence(
                    id = "s_lossloss_3",
                    hanzi = "大家都觉得很可惜，但是他立即把第二只鞋子也扔了下去。",
                    pinyin = "dà jiā dōu jué de hěn kě xī dàn shì tā lì jí bǎ dì èr zhī xié zi yě rēng le xià qù",
                    translation = "Semua penumpang di gerbong merasa sangat menyayangkan kejadian itu, tetapi pria tersebut tanpa ragu langsung melepas sepatu yang tersisa dan melemparkannya pula ke luar jendela!",
                    tokens = listOf(
                        WordToken("大家", "dà jiā", "everyone", "Kosakata HSK 2: 大家 (dà jiā)"),
                        WordToken("都", "dōu", "all; both; entirely", "Kosakata HSK 2: 都 (dōu)"),
                        WordToken("觉得", "jué de", "to think that ...; to feel that ...", "Kosakata HSK 2: 觉得 (jué de)"),
                        WordToken("很", "hěn", "very; quite", "Kosakata HSK 2: 很 (hěn)"),
                        WordToken("可惜", "kě xī", "it is a pity / what a pity", "Kosakata HSK 2: 可惜 (kě xī)"),
                        WordToken("但是", "dàn shì", "but; however", "Kosakata HSK 2: 但是 (dàn shì)"),
                        WordToken("他", "tā", "he; him; his", "Kosakata HSK 2: 他 (tā)"),
                        WordToken("立即", "lì jí", "immediately", "Kosakata HSK 2: 立即 (lì jí)"),
                        WordToken("把", "bǎ", "(used to put the object before the verb: 把[ba3] + {noun} + {verb})", "Kosakata HSK 2: 把 (bǎ)"),
                        WordToken("第", "dì", "(prefix indicating ordinal number)", "Kosakata HSK 2: 第 (dì)"),
                        WordToken("二", "èr", "two / 2", "Kosakata HSK 2: 二 (èr)"),
                        WordToken("只", "zhī", "classifier for birds and certain animals, one of a pair, some utensils, vessels etc", "Kosakata HSK 2: 只 (zhī)"),
                        WordToken("鞋子", "xié zi", "shoe", "Kosakata HSK 2: 鞋子 (xié zi)"),
                        WordToken("也", "yě", "also; too; as well; (not ...) either", "Kosakata HSK 2: 也 (yě)"),
                        WordToken("扔", "rēng", "to throw / to throw away", "Kosakata HSK 2: 扔 (rēng)"),
                        WordToken("了", "le", "(completed action marker) / (modal particle indicating change of state, situation now)", "Kosakata HSK 2: 了 (le)"),
                        WordToken("下", "xià", "down / downwards / below", "Kosakata HSK 2: 下 (xià)"),
                        WordToken("去", "qù", "(after a verb of motion) movement away from the speaker; (after certain verbs) detachment or separation", "Kosakata HSK 2: 去 (qù)")
                    )
                ),
                Sentence(
                    id = "s_lossloss_4",
                    hanzi = "大家觉得很奇怪，这个人说：“这一只鞋子对我来说已经没有用了，但是如果有人能捡到一双鞋子，说不定他还能穿呢！”",
                    pinyin = "dà jiā jué de hěn qí guài zhè gè rén shuō zhè yī zhī xié zi duì wǒ lái shuō yǐ jīng méi yǒu yòng le dàn shì rú guǒ yǒu rén néng jiǎn dào yī shuāng xié zi shuō bu dìng tā hái néng chuān ne",
                    translation = "Semua orang memandangnya penuh keheranan, lalu pria itu tersenyum dan berkata: “Sepatu sebelah ini sudah tidak ada gunanya lagi bagi saya, tetapi jika ada seseorang di luar sana yang berhasil memungut sepasang sepatu utuh, barangkali sepatu itu masih bisa ia pakai!”",
                    tokens = listOf(
                        WordToken("大家", "dà jiā", "everyone", "Kosakata HSK 2: 大家 (dà jiā)"),
                        WordToken("觉得", "jué de", "to think that ...; to feel that ...", "Kosakata HSK 2: 觉得 (jué de)"),
                        WordToken("很", "hěn", "very; quite", "Kosakata HSK 2: 很 (hěn)"),
                        WordToken("奇怪", "qí guài", "strange / odd", "Kosakata HSK 2: 奇怪 (qí guài)"),
                        WordToken("这", "zhè", "this; these", "Kosakata HSK 2: 这 (zhè)"),
                        WordToken("个", "gè", "classifier for people or objects in general", "Kosakata HSK 2: 个 (gè)"),
                        WordToken("人", "rén", "person; people", "Kosakata HSK 2: 人 (rén)"),
                        WordToken("说", "shuō", "to speak; to talk; to say", "Kosakata HSK 2: 说 (shuō)"),
                        WordToken("这", "zhè", "this; these", "Kosakata HSK 2: 这 (zhè)"),
                        WordToken("一", "yī", "one / single / a (article)", "Kosakata HSK 2: 一 (yī)"),
                        WordToken("只", "zhī", "classifier for birds and certain animals, one of a pair, some utensils, vessels etc", "Kosakata HSK 2: 只 (zhī)"),
                        WordToken("鞋子", "xié zi", "shoe", "Kosakata HSK 2: 鞋子 (xié zi)"),
                        WordToken("对", "duì", "towards; at; for / concerning; regarding", "Kosakata HSK 2: 对 (duì)"),
                        WordToken("我", "wǒ", "I; me; my", "Kosakata HSK 2: 我 (wǒ)"),
                        WordToken("来", "lái", "(used as a substitute for a more specific verb)", "Kosakata HSK 2: 来 (lái)"),
                        WordToken("说", "shuō", "to speak; to talk; to say", "Kosakata HSK 2: 说 (shuō)"),
                        WordToken("已经", "yǐ jīng", "already", "Kosakata HSK 2: 已经 (yǐ jīng)"),
                        WordToken("没有", "méi yǒu", "doesn't exist / to not be", "Kosakata HSK 2: 没有 (méi yǒu)"),
                        WordToken("用", "yòng", "usefulness; utility", "Kosakata HSK 2: 用 (yòng)"),
                        WordToken("了", "le", "(completed action marker) / (modal particle indicating change of state, situation now)", "Kosakata HSK 2: 了 (le)"),
                        WordToken("但是", "dàn shì", "but; however", "Kosakata HSK 2: 但是 (dàn shì)"),
                        WordToken("如果", "rú guǒ", "if; in case; in the event that", "Kosakata HSK 2: 如果 (rú guǒ)"),
                        WordToken("有", "yǒu", "to have; there is", "Kosakata HSK 2: 有 (yǒu)"),
                        WordToken("人", "rén", "person; people", "Kosakata HSK 2: 人 (rén)"),
                        WordToken("能", "néng", "can / to be able to / might possibly", "Kosakata HSK 2: 能 (néng)"),
                        WordToken("捡", "jiǎn", "to pick up; to collect; to gather", "Kosakata HSK 2: 捡 (jiǎn)"),
                        WordToken("到", "dào", "to reach; to arrive / to (a place); until (a time); up to (a point) / (verb complement indicating arriving at a place or reaching a point)", "Kosakata HSK 2: 到 (dào)"),
                        WordToken("一", "yī", "one / single / a (article)", "Kosakata HSK 2: 一 (yī)"),
                        WordToken("双", "shuāng", "pair", "Kosakata HSK 2: 双 (shuāng)"),
                        WordToken("鞋子", "xié zi", "shoe", "Kosakata HSK 2: 鞋子 (xié zi)"),
                        WordToken("说不定", "shuō bu dìng", "can't say for sure / maybe", "Kosakata HSK 2: 说不定 (shuō bu dìng)"),
                        WordToken("他", "tā", "he; him; his", "Kosakata HSK 2: 他 (tā)"),
                        WordToken("还", "hái", "still, still in progress, yet", "Kosakata HSK 2: 还 (hái)"),
                        WordToken("能", "néng", "can / to be able to / might possibly", "Kosakata HSK 2: 能 (néng)"),
                        WordToken("穿", "chuān", "to wear / to put on / to dress", "Kosakata HSK 2: 穿 (chuān)"),
                        WordToken("呢", "ne", "(sentence-final particle) indicating that a state or situation still holds", "Kosakata HSK 2: 呢 (ne)")
                    )
                )
            ),
            questions = listOf(
                StoryQuestion(
                    id = "q_lossloss_1",
                    questionText = "主人公特意穿着心爱的新鞋子坐火车，是为了去见谁？ (Demi menemui siapakah sang protagonis rela mengenakan sepatu baru kesayangannya naik kereta api?)",
                    options = listOf("去见学校的老师 (Pergi menemui dosennya di kampus)", "去见自己心爱的女朋友 (Pergi menemui pacar tercintanya)", "去参加朋友的婚礼 (Pergi menghadiri pesta pernikahan teman)", "去大公司面试求职 (Pergi wawancara kerja di perusahaan besar)"),
                    correctAnswerIndex = 1,
                    explanation = "Pria tersebut sangat bahagia mengenakan sepatu barunya dalam perjalanan kereta api untuk menemui kekasihnya."
                ),
                StoryQuestion(
                    id = "q_lossloss_2",
                    questionText = "在疾驰的火车上发生了什么令人扼腕叹息的意外？ (Kejadian malang apa yang menimpa dirinya di dalam kereta yang sedang melaju?)",
                    options = listOf("车票被风吹走了 (Tiket keretanya tertiup angin kencang)", "他的一只新鞋子不慎从火车窗户掉了下去 (Sebelah sepatu barunya tak sengaja terlepas dan jatuh ke luar jendela kereta)", "他的行李箱被小偷偷走了 (Kopernya dibawa kabur pencuri)", "他在车厢里睡过站了 (Ia tertidur pulas hingga terlewat stasiun tujuan)"),
                    correctAnswerIndex = 1,
                    explanation = "Sebelah sepatu kesayangannya jatuh meluncur ke luar jendela kereta saat melintasi jalur rel."
                ),
                StoryQuestion(
                    id = "q_lossloss_3",
                    questionText = "面对大家的惋惜与同情，这个人做出了什么让全车厢乘客震惊的举动？ (Tindakan mengejutkan apa yang dilakukan pria tersebut sesaat setelah kehilangan sebelah sepatunya?)",
                    options = listOf("在车厢里失声痛哭 (Menangis histeris di dalam gerbong kereta)", "毫不犹豫地把剩下的第二只鞋子也从窗口扔了下去 (Tanpa ragu melepas sepatu sebelahnya lagi dan melemparkannya pula ke luar jendela!)", "跳下火车去捡鞋子 (Nekat melompat dari kereta untuk mencari sepatunya)", "要求火车司机立刻紧急停车 (Menuntut masinis segera menghentikan laju kereta)"),
                    correctAnswerIndex = 1,
                    explanation = "Ia langsung melemparkan sepatu sebelahnya lagi ke jalur yang sama di luar jendela kereta."
                ),
                StoryQuestion(
                    id = "q_lossloss_4",
                    questionText = "这个人解释把第二只鞋也扔下去的崇高利他理由是什么？ (Alasan mulia apa yang dijelaskan sang pria atas tindakannya membuang sepatu kedua?)",
                    options = listOf("鞋子太便宜不值得心疼 (Sepatu itu murah jadi tidak sayang jika dibuang)", "单只鞋子对自己已无用，但若路人能捡到完整的一双鞋，便还能派上用场 (Sebelah sepatu sudah tak berguna baginya, namun bila orang menemukan sepasang utuh, sepatu itu bisa bermanfaat)", "为了发泄心中的愤怒 (Demi melampiaskan rasa amarah dalam hati)", "给铁路工人添麻烦 (Ingin merepotkan petugas jalan rel)"),
                    correctAnswerIndex = 1,
                    explanation = "Kearifan melepaskan: mengubah kerugian diri menjadi manfaat utuh bagi orang lain yang menemukannya."
                )
            )
        ),
        // Cerita Mandarin Bean 151 (HSK 2): Puppy and Kitten (Anak Anjing dan Anak Kucing)
        Story(
            id = "story_puppy_and_kitten",
            titleHanzi = "小狗和小猫",
            titlePinyin = "Xiǎogǒu Hé Xiǎomāo",
            titleTranslation = "Puppy and Kitten (Anak Anjing dan Anak Kucing)",
            level = "HSK 2",
            category = "Hewan & Persahabatan",
            description = "Proses perkenalan manis antara anak anjing yang awalnya penakut dengan anak kucing hingga mereka akhirnya bermain bersama.",
            coverEmoji = "🐱",
            coverImageRes = R.drawable.cover_story_puppy_and_kitten,
            estimatedReadMinutes = 2,
            sentences = listOf(
                Sentence(
                    id = "s_pupkit_1",
                    hanzi = "我的小狗第一次看见朋友的小猫，很害怕。",
                    pinyin = "wǒ de xiǎo gǒu dì yī cì kàn jiàn péng you de xiǎo māo hěn hài pà",
                    translation = "Anak anjing peliharaanku pertama kali melihat anak kucing milik temanku, ia merasa sangat takut dan menjauh.",
                    tokens = listOf(
                        WordToken("我", "wǒ", "I; me; my", "Kosakata HSK 2: 我 (wǒ)"),
                        WordToken("的", "de", "possessive particle (of; 's) / modifying particle (used after an attribute to modify a noun or to form a nominal expression)", "Kosakata HSK 2: 的 (de)"),
                        WordToken("小", "xiǎo", "small / tiny / few", "Kosakata HSK 2: 小 (xiǎo)"),
                        WordToken("狗", "gǒu", "dog", "Kosakata HSK 2: 狗 (gǒu)"),
                        WordToken("第", "dì", "(prefix indicating ordinal number)", "Kosakata HSK 2: 第 (dì)"),
                        WordToken("一", "yī", "one / single / a (article)", "Kosakata HSK 2: 一 (yī)"),
                        WordToken("次", "cì", "classifier for enumerated events: time", "Kosakata HSK 2: 次 (cì)"),
                        WordToken("看见", "kàn jiàn", "to see; to catch sight of", "Kosakata HSK 2: 看见 (kàn jiàn)"),
                        WordToken("朋友", "péng you", "friend", "Kosakata HSK 2: 朋友 (péng you)"),
                        WordToken("的", "de", "possessive particle (of; 's) / modifying particle (used after an attribute to modify a noun or to form a nominal expression)", "Kosakata HSK 2: 的 (de)"),
                        WordToken("小", "xiǎo", "young", "Kosakata HSK 2: 小 (xiǎo)"),
                        WordToken("猫", "māo", "cat / (loanword) (coll.) modem", "Kosakata HSK 2: 猫 (māo)"),
                        WordToken("很", "hěn", "very; quite", "Kosakata HSK 2: 很 (hěn)"),
                        WordToken("害怕", "hài pà", "to be afraid; to be scared", "Kosakata HSK 2: 害怕 (hài pà)")
                    )
                ),
                Sentence(
                    id = "s_pupkit_2",
                    hanzi = "小狗第二次看见小猫时，它站在小猫旁边，看着小猫。",
                    pinyin = "xiǎo gǒu dì èr cì kàn jiàn xiǎo māo shí tā zhàn zài xiǎo māo páng biān kàn zhe xiǎo māo",
                    translation = "Saat anak anjing melihat anak kucing untuk kedua kalinya, ia memberanikan diri berdiri di samping anak kucing sambil mengamatinya lekat-lekat.",
                    tokens = listOf(
                        WordToken("小", "xiǎo", "young", "Kosakata HSK 2: 小 (xiǎo)"),
                        WordToken("狗", "gǒu", "dog", "Kosakata HSK 2: 狗 (gǒu)"),
                        WordToken("第", "dì", "(prefix indicating ordinal number)", "Kosakata HSK 2: 第 (dì)"),
                        WordToken("二", "èr", "two / 2", "Kosakata HSK 2: 二 (èr)"),
                        WordToken("次", "cì", "classifier for enumerated events: time", "Kosakata HSK 2: 次 (cì)"),
                        WordToken("看见", "kàn jiàn", "to see; to catch sight of", "Kosakata HSK 2: 看见 (kàn jiàn)"),
                        WordToken("小", "xiǎo", "young", "Kosakata HSK 2: 小 (xiǎo)"),
                        WordToken("猫", "māo", "cat / (loanword) (coll.) modem", "Kosakata HSK 2: 猫 (māo)"),
                        WordToken("时", "shí", "when", "Kosakata HSK 2: 时 (shí)"),
                        WordToken("它", "tā", "it", "Kosakata HSK 2: 它 (tā)"),
                        WordToken("站", "zhàn", "to stand / to halt / to stop", "Kosakata HSK 2: 站 (zhàn)"),
                        WordToken("在", "zài", "(of sb or sth) to be (located) at", "Kosakata HSK 2: 在 (zài)"),
                        WordToken("小", "xiǎo", "young", "Kosakata HSK 2: 小 (xiǎo)"),
                        WordToken("猫", "māo", "cat / (loanword) (coll.) modem", "Kosakata HSK 2: 猫 (māo)"),
                        WordToken("旁边", "páng biān", "side; adjacent place", "Kosakata HSK 2: 旁边 (páng biān)"),
                        WordToken("看", "kàn", "to see; to look at / to read / to watch / to visit; to call on / to consider; to regard as / to look after / to treat (a patient or illness) / to depend on / to feel (that) / (after a verb) to give it a try / to watch out for", "Kosakata HSK 2: 看 (kàn)"),
                        WordToken("着", "zhe", "aspect particle indicating action in progress or ongoing state", "Kosakata HSK 2: 着 (zhe)"),
                        WordToken("小", "xiǎo", "young", "Kosakata HSK 2: 小 (xiǎo)"),
                        WordToken("猫", "māo", "cat / (loanword) (coll.) modem", "Kosakata HSK 2: 猫 (māo)")
                    )
                ),
                Sentence(
                    id = "s_pupkit_3",
                    hanzi = "第三次看见小猫时，它走过去，和小猫玩。",
                    pinyin = "dì sān cì kàn jiàn xiǎo māo shí tā zǒu guò qù hé xiǎo māo wán",
                    translation = "Ketika melihat anak kucing untuk ketiga kalinya, ia dengan riang melangkah mendekat lalu mulai bermain bersama anak kucing tersebut.",
                    tokens = listOf(
                        WordToken("第", "dì", "(prefix indicating ordinal number)", "Kosakata HSK 2: 第 (dì)"),
                        WordToken("三", "sān", "three / 3", "Kosakata HSK 2: 三 (sān)"),
                        WordToken("次", "cì", "classifier for enumerated events: time", "Kosakata HSK 2: 次 (cì)"),
                        WordToken("看见", "kàn jiàn", "to see; to catch sight of", "Kosakata HSK 2: 看见 (kàn jiàn)"),
                        WordToken("小", "xiǎo", "young", "Kosakata HSK 2: 小 (xiǎo)"),
                        WordToken("猫", "māo", "cat / (loanword) (coll.) modem", "Kosakata HSK 2: 猫 (māo)"),
                        WordToken("时", "shí", "when", "Kosakata HSK 2: 时 (shí)"),
                        WordToken("它", "tā", "it", "Kosakata HSK 2: 它 (tā)"),
                        WordToken("走", "zǒu", "to walk / to go / to run / to move (of vehicle) / to visit / to leave / to go away / to die (euph.) / to change (shape, form, meaning)", "Kosakata HSK 2: 走 (zǒu)"),
                        WordToken("过去", "guò qù", "to go over; to pass by", "Kosakata HSK 2: 过去 (guò qù)"),
                        WordToken("和", "hé", "and; together with", "Kosakata HSK 2: 和 (hé)"),
                        WordToken("小", "xiǎo", "small / tiny / few", "Kosakata HSK 2: 小 (xiǎo)"),
                        WordToken("猫", "māo", "cat / (loanword) (coll.) modem", "Kosakata HSK 2: 猫 (māo)"),
                        WordToken("玩", "wán", "to play / to have fun / to trifle with / to keep sth for entertainment", "Kosakata HSK 2: 玩 (wán)")
                    )
                ),
                Sentence(
                    id = "s_pupkit_4",
                    hanzi = "很快，它们成了好朋友。",
                    pinyin = "hěn kuài tā men chéng le hǎo péng you",
                    translation = "Tak butuh waktu lama, kedua hewan kecil itu pun akhirnya menjadi sahabat baik yang tak terpisahkan.",
                    tokens = listOf(
                        WordToken("很", "hěn", "very; quite", "Kosakata HSK 2: 很 (hěn)"),
                        WordToken("快", "kuài", "rapid / quick", "Kosakata HSK 2: 快 (kuài)"),
                        WordToken("它们", "tā men", "they; them", "Kosakata HSK 2: 它们 (tā men)"),
                        WordToken("成", "chéng", "to succeed / to finish / to complete / to accomplish / to become / to turn into / to be all right", "Kosakata HSK 2: 成 (chéng)"),
                        WordToken("了", "le", "(completed action marker) / (modal particle indicating change of state, situation now)", "Kosakata HSK 2: 了 (le)"),
                        WordToken("好", "hǎo", "good / appropriate; proper", "Kosakata HSK 2: 好 (hǎo)"),
                        WordToken("朋友", "péng you", "friend", "Kosakata HSK 2: 朋友 (péng you)")
                    )
                )
            ),
            questions = listOf(
                StoryQuestion(
                    id = "q_pupkit_1",
                    questionText = "小狗第一次遇见朋友家的小猫时，表现出怎样的心理状态？ (Bagaimana reaksi emosional anak anjing saat pertama kali bertatap muka dengan anak kucing temannya?)",
                    options = listOf("凶猛地冲上去打架 (Langsung menerkam garang hendak berkelahi)", "感到十分害怕与警惕，不敢靠近 (Merasa sangat ketakutan dan waspada, tak berani mendekat)", "开心地摇尾巴跳舞 (Menggoyangkan ekor menari gembira)", "呼呼大睡 (Tertidur pulas)"),
                    correctAnswerIndex = 1,
                    explanation = "Pertemuan pertama memicu ketakutan alami karena belum saling mengenal aroma dan bahasa tubuh."
                ),
                StoryQuestion(
                    id = "q_pupkit_2",
                    questionText = "在第二次相遇时，小狗的行为发生了什么微妙的变化？ (Perubahan perilaku apa yang diperlihatkan anak anjing pada pertemuan kedua?)",
                    options = listOf("吓得拔腿就跑 (Kabur terbirit-birit ketakutan)", "敢于站在小猫身边，安静好奇地打量观察小猫 (Berani berdiri di dekatnya sambil mengamati dengan tenang dan rasa penasaran)", "把小猫的食物吃光了 (Menghabiskan jatah makanan anak kucing)", "对着小猫狂叫不止 (Menggonggong keras tanpa henti ke arah anak kucing)"),
                    correctAnswerIndex = 1,
                    explanation = "Pada pertemuan kedua, rasa takut mereda menjadi pengamatan rasa penasaran dari jarak dekat."
                ),
                StoryQuestion(
                    id = "q_pupkit_3",
                    questionText = "第三次见面时，小狗和小猫之间建立了怎样的互动？ (Interaksi apa yang akhirnya terjalin pada pertemuan ketiga mereka?)",
                    options = listOf("小狗主动走过去，和小猫欢快地玩耍在一起 (Anak anjing melangkah mendekat dan mereka mulai bermain bersama dengan ceria)", "依然各走各的路互不理睬 (Tetap saling cuek dan tidak peduli)", "小猫把小狗抓伤了 (Kucing mencakar hidung anak anjing)", "躲在主人身后不出来 (Sembunyi ketakutan di balik kaki majikan)"),
                    correctAnswerIndex = 0,
                    explanation = "Rasa saling percaya mulai tumbuh sehingga kedua hewan kecil itu bisa bermain bersama."
                ),
                StoryQuestion(
                    id = "q_pupkit_4",
                    questionText = "小狗和小猫从陌生到成为好朋友的渐进过程，展现了社交关系的什么智慧？ (Pelajaran sosial apa yang dapat dipelajari dari proses adaptasi persahabatan kedua hewan ini?)",
                    options = listOf("跨物种之间绝不可能成为朋友 (Hewan beda spesies mustahil bersahabat)", "友谊的建立需要时间、包容、耐心观察与真诚的主动靠近 (Membangun hubungan baru membutuhkan waktu, kesabaran mengamati, dan keberanian saling mendekat)", "只要第一次害怕就该永远远离 (Bila pertama takut sebaiknya selamanya menjauh)", "必须强迫他们立刻亲密接触 (Harus dipaksa langsung akrab sejak detik pertama)"),
                    correctAnswerIndex = 1,
                    explanation = "Persahabatan sejati bertumbuh melalui fase adaptasi yang sabar dari rasa takut, observasi, hingga keakraban hangat."
                )
            )
        ),
        // Cerita Mandarin Bean 152 (HSK 2): Whiteboard (Papan Tulis Putih)
        Story(
            id = "story_whiteboard",
            titleHanzi = "白板",
            titlePinyin = "Báibǎn",
            titleTranslation = "Whiteboard (Papan Tulis Putih)",
            level = "HSK 2",
            category = "Filsafat & Refleksi",
            description = "Pelajaran berharga dari seorang guru tentang persepsi manusia: kita kerap hanya melihat satu noda hitam kecil, dan melupakan bidang putih yang begitu luas di sekitarnya.",
            coverEmoji = "🖊️",
            coverImageRes = R.drawable.cover_story_whiteboard,
            estimatedReadMinutes = 2,
            sentences = listOf(
                Sentence(
                    id = "s_whitbrd_1",
                    hanzi = "有个老师进了教室，在白板上画了一个黑点。",
                    pinyin = "yǒu gè lǎo shī jìn le jiào shì zài bái bǎn shàng huà le yī gè hēi diǎn",
                    translation = "Seorang guru melangkah masuk ke dalam ruang kelas, lalu menggambar sebuah titik hitam kecil di atas papan tulis putih yang besar.",
                    tokens = listOf(
                        WordToken("有", "yǒu", "to have; there is", "Kosakata HSK 2: 有 (yǒu)"),
                        WordToken("个", "gè", "classifier for people or objects in general", "Kosakata HSK 2: 个 (gè)"),
                        WordToken("老师", "lǎo shī", "teacher", "Kosakata HSK 2: 老师 (lǎo shī)"),
                        WordToken("进", "jìn", "to go in / to enter / to put in / to submit / to take in / to admit", "Kosakata HSK 2: 进 (jìn)"),
                        WordToken("了", "le", "(completed action marker) / (modal particle indicating change of state, situation now)", "Kosakata HSK 2: 了 (le)"),
                        WordToken("教室", "jiào shì", "classroom", "Kosakata HSK 2: 教室 (jiào shì)"),
                        WordToken("在", "zài", "(of sb or sth) to be (located) at", "Kosakata HSK 2: 在 (zài)"),
                        WordToken("白板", "bái bǎn", "whiteboard / tabula rasa / blank slate", "Kosakata HSK 2: 白板 (bái bǎn)"),
                        WordToken("上", "shàng", "(noun suffix) on; above", "Kosakata HSK 2: 上 (shàng)"),
                        WordToken("画", "huà", "to draw; to paint / to draw (a line)", "Kosakata HSK 2: 画 (huà)"),
                        WordToken("了", "le", "(completed action marker) / (modal particle indicating change of state, situation now)", "Kosakata HSK 2: 了 (le)"),
                        WordToken("一", "yī", "one / single / a (article)", "Kosakata HSK 2: 一 (yī)"),
                        WordToken("个", "gè", "classifier for people or objects in general", "Kosakata HSK 2: 个 (gè)"),
                        WordToken("黑", "hēi", "black / dark / sinister / secret / shady / illegal", "Kosakata HSK 2: 黑 (hēi)"),
                        WordToken("点", "diǎn", "point; dot; spot; speck / dot stroke in Chinese characters / (math.) decimal point / point in time or space / (after a number) o'clock", "Kosakata HSK 2: 点 (diǎn)")
                    )
                ),
                Sentence(
                    id = "s_whitbrd_2",
                    hanzi = "他问学生：“这是什么？”",
                    pinyin = "tā wèn xué shēng zhè shì shén me",
                    translation = "Beliau bertanya kepada murid-muridnya: “Benda apakah ini?”",
                    tokens = listOf(
                        WordToken("他", "tā", "he; him; his", "Kosakata HSK 2: 他 (tā)"),
                        WordToken("问", "wèn", "to ask; to inquire", "Kosakata HSK 2: 问 (wèn)"),
                        WordToken("学生", "xué shēng", "student / schoolchild", "Kosakata HSK 2: 学生 (xué shēng)"),
                        WordToken("这", "zhè", "this; these", "Kosakata HSK 2: 这 (zhè)"),
                        WordToken("是", "shì", "to be (followed by substantives only)", "Kosakata HSK 2: 是 (shì)"),
                        WordToken("什么", "shén me", "what?", "Kosakata HSK 2: 什么 (shén me)")
                    )
                ),
                Sentence(
                    id = "s_whitbrd_3",
                    hanzi = "大家都回答：“一个黑点。”",
                    pinyin = "dà jiā dōu huí dá yī gè hēi diǎn",
                    translation = "Seluruh murid serentak menjawab kompak: “Sebuah titik hitam.”",
                    tokens = listOf(
                        WordToken("大家", "dà jiā", "everyone", "Kosakata HSK 2: 大家 (dà jiā)"),
                        WordToken("都", "dōu", "all; both; entirely", "Kosakata HSK 2: 都 (dōu)"),
                        WordToken("回答", "huí dá", "to reply; to answer / reply; answer", "Kosakata HSK 2: 回答 (huí dá)"),
                        WordToken("一", "yī", "one / single / a (article)", "Kosakata HSK 2: 一 (yī)"),
                        WordToken("个", "gè", "classifier for people or objects in general", "Kosakata HSK 2: 个 (gè)"),
                        WordToken("黑", "hēi", "black / dark / sinister / secret / shady / illegal", "Kosakata HSK 2: 黑 (hēi)"),
                        WordToken("点", "diǎn", "point; dot; spot; speck / dot stroke in Chinese characters / (math.) decimal point / point in time or space / (after a number) o'clock", "Kosakata HSK 2: 点 (diǎn)")
                    )
                ),
                Sentence(
                    id = "s_whitbrd_4",
                    hanzi = "老师说：“只有一个黑点吗？这么大的白板大家都没有看见吗？”",
                    pinyin = "lǎo shī shuō zhǐ yǒu yī gè hēi diǎn ma zhè me dà de bái bǎn dà jiā dōu méi yǒu kàn jiàn ma",
                    translation = "Guru itu tersenyum bijak lalu berkata: “Apakah hanya ada sebuah titik hitam saja? Papan tulis putih yang terbentang begitu luas ini apakah tidak ada yang melihatnya?”",
                    tokens = listOf(
                        WordToken("老师", "lǎo shī", "teacher", "Kosakata HSK 2: 老师 (lǎo shī)"),
                        WordToken("说", "shuō", "to speak; to talk; to say", "Kosakata HSK 2: 说 (shuō)"),
                        WordToken("只", "zhǐ", "only; merely; just", "Kosakata HSK 2: 只 (zhǐ)"),
                        WordToken("有", "yǒu", "to have; there is", "Kosakata HSK 2: 有 (yǒu)"),
                        WordToken("一", "yī", "one / single / a (article)", "Kosakata HSK 2: 一 (yī)"),
                        WordToken("个", "gè", "classifier for people or objects in general", "Kosakata HSK 2: 个 (gè)"),
                        WordToken("黑", "hēi", "black / dark / sinister / secret / shady / illegal", "Kosakata HSK 2: 黑 (hēi)"),
                        WordToken("点", "diǎn", "point; dot; spot; speck / dot stroke in Chinese characters / (math.) decimal point / point in time or space / (after a number) o'clock", "Kosakata HSK 2: 点 (diǎn)"),
                        WordToken("吗", "ma", "(question particle for \"yes-no\" questions)", "Kosakata HSK 2: 吗 (ma)"),
                        WordToken("这么", "zhè me", "so much / this much / how much?", "Kosakata HSK 2: 这么 (zhè me)"),
                        WordToken("大", "dà", "big; large; great / older (than another person) / eldest", "Kosakata HSK 2: 大 (dà)"),
                        WordToken("的", "de", "possessive particle (of; 's) / modifying particle (used after an attribute to modify a noun or to form a nominal expression)", "Kosakata HSK 2: 的 (de)"),
                        WordToken("白板", "bái bǎn", "whiteboard / tabula rasa / blank slate", "Kosakata HSK 2: 白板 (bái bǎn)"),
                        WordToken("大家", "dà jiā", "everyone", "Kosakata HSK 2: 大家 (dà jiā)"),
                        WordToken("都", "dōu", "all; both; entirely", "Kosakata HSK 2: 都 (dōu)"),
                        WordToken("没有", "méi yǒu", "haven't / hasn't", "Kosakata HSK 2: 没有 (méi yǒu)"),
                        WordToken("看见", "kàn jiàn", "to see; to catch sight of", "Kosakata HSK 2: 看见 (kàn jiàn)"),
                        WordToken("吗", "ma", "(question particle for \"yes-no\" questions)", "Kosakata HSK 2: 吗 (ma)")
                    )
                ),
                Sentence(
                    id = "s_whitbrd_5",
                    hanzi = "你看到的是什么呢？",
                    pinyin = "nǐ kàn dào de shì shén me ne",
                    translation = "Sebenarnya, apa yang sedang kalian lihat dalam kehidupan ini?",
                    tokens = listOf(
                        WordToken("你", "nǐ", "you", "Kosakata HSK 2: 你 (nǐ)"),
                        WordToken("看", "kàn", "to see; to look at / to read / to watch / to visit; to call on / to consider; to regard as / to look after / to treat (a patient or illness) / to depend on / to feel (that) / (after a verb) to give it a try / to watch out for", "Kosakata HSK 2: 看 (kàn)"),
                        WordToken("到", "dào", "to reach; to arrive / to (a place); until (a time); up to (a point) / (verb complement indicating arriving at a place or reaching a point)", "Kosakata HSK 2: 到 (dào)"),
                        WordToken("的", "de", "possessive particle (of; 's) / modifying particle (used after an attribute to modify a noun or to form a nominal expression)", "Kosakata HSK 2: 的 (de)"),
                        WordToken("是", "shì", "to be (followed by substantives only)", "Kosakata HSK 2: 是 (shì)"),
                        WordToken("什么", "shén me", "what?", "Kosakata HSK 2: 什么 (shén me)"),
                        WordToken("呢", "ne", "(sentence-final particle) used in questions to link back to prior discourse or context (\"what about...?\", \"and...?\")", "Kosakata HSK 2: 呢 (ne)")
                    )
                ),
                Sentence(
                    id = "s_whitbrd_6",
                    hanzi = "每个人都有一些缺点，但是也一定会有很多的优点。",
                    pinyin = "měi gè rén dōu yǒu yī xiē quē diǎn dàn shì yě yī dìng huì yǒu hěn duō de yōu diǎn",
                    translation = "Setiap orang pasti memiliki beberapa kekurangan, namun di balik itu tentu juga tersimpan sangat banyak kelebihan.",
                    tokens = listOf(
                        WordToken("每", "měi", "each / every", "Kosakata HSK 2: 每 (měi)"),
                        WordToken("个", "gè", "classifier for people or objects in general", "Kosakata HSK 2: 个 (gè)"),
                        WordToken("人", "rén", "person; people", "Kosakata HSK 2: 人 (rén)"),
                        WordToken("都", "dōu", "all; both; entirely", "Kosakata HSK 2: 都 (dōu)"),
                        WordToken("有", "yǒu", "to have; there is", "Kosakata HSK 2: 有 (yǒu)"),
                        WordToken("一些", "yī xiē", "some; a few; a little; (following an adjective) slightly ...er", "Kosakata HSK 2: 一些 (yī xiē)"),
                        WordToken("缺点", "quē diǎn", "weak point / fault / shortcoming / disadvantage", "Kosakata HSK 2: 缺点 (quē diǎn)"),
                        WordToken("但是", "dàn shì", "but; however", "Kosakata HSK 2: 但是 (dàn shì)"),
                        WordToken("也", "yě", "also; too; as well; (not ...) either", "Kosakata HSK 2: 也 (yě)"),
                        WordToken("一定", "yī dìng", "surely; certainly; definitely", "Kosakata HSK 2: 一定 (yī dìng)"),
                        WordToken("会", "huì", "to be likely to; to be sure to", "Kosakata HSK 2: 会 (huì)"),
                        WordToken("有", "yǒu", "to have; there is", "Kosakata HSK 2: 有 (yǒu)"),
                        WordToken("很多", "hěn duō", "many; a lot of", "Kosakata HSK 2: 很多 (hěn duō)"),
                        WordToken("的", "de", "possessive particle (of; 's) / modifying particle (used after an attribute to modify a noun or to form a nominal expression)", "Kosakata HSK 2: 的 (de)"),
                        WordToken("优点", "yōu diǎn", "merit / benefit / strong point / advantage", "Kosakata HSK 2: 优点 (yōu diǎn)")
                    )
                ),
                Sentence(
                    id = "s_whitbrd_7",
                    hanzi = "换一个角度去看吧！",
                    pinyin = "huàn yī gè jiǎo dù qù kàn ba",
                    translation = "Cobalah mengubah sudut pandang kalian saat memandang orang lain!",
                    tokens = listOf(
                        WordToken("换", "huàn", "to exchange / to change / to substitute / to switch / to convert (currency)", "Kosakata HSK 2: 换 (huàn)"),
                        WordToken("一", "yī", "one / single / a (article)", "Kosakata HSK 2: 一 (yī)"),
                        WordToken("个", "gè", "classifier for people or objects in general", "Kosakata HSK 2: 个 (gè)"),
                        WordToken("角度", "jiǎo dù", "angle / (fig.) point of view", "Kosakata HSK 2: 角度 (jiǎo dù)"),
                        WordToken("去", "qù", "to go, to go to", "Kosakata HSK 2: 去 (qù)"),
                        WordToken("看", "kàn", "to see; to look at / to read / to watch / to visit; to call on / to consider; to regard as / to look after / to treat (a patient or illness) / to depend on / to feel (that) / (after a verb) to give it a try / to watch out for", "Kosakata HSK 2: 看 (kàn)"),
                        WordToken("吧", "ba", "(modal particle indicating suggestion or surmise) / ...right? / ...OK? / ...I presume.", "Kosakata HSK 2: 吧 (ba)")
                    )
                ),
                Sentence(
                    id = "s_whitbrd_8",
                    hanzi = "你会有更多新的发现。",
                    pinyin = "nǐ huì yǒu gèng duō xīn de fā xiàn",
                    translation = "Niscaya kalian akan menemukan jauh lebih banyak hal baru yang indah.",
                    tokens = listOf(
                        WordToken("你", "nǐ", "you", "Kosakata HSK 2: 你 (nǐ)"),
                        WordToken("会", "huì", "to be likely to; to be sure to", "Kosakata HSK 2: 会 (huì)"),
                        WordToken("有", "yǒu", "to have; there is", "Kosakata HSK 2: 有 (yǒu)"),
                        WordToken("更", "gèng", "more / even more / further / still / still more", "Kosakata HSK 2: 更 (gèng)"),
                        WordToken("多", "duō", "many; much; more; a lot of", "Kosakata HSK 2: 多 (duō)"),
                        WordToken("新", "xīn", "new; newly", "Kosakata HSK 2: 新 (xīn)"),
                        WordToken("的", "de", "possessive particle (of; 's) / modifying particle (used after an attribute to modify a noun or to form a nominal expression)", "Kosakata HSK 2: 的 (de)"),
                        WordToken("发现", "fā xiàn", "a discovery", "Kosakata HSK 2: 发现 (fā xiàn)")
                    )
                )
            ),
            questions = listOf(
                StoryQuestion(
                    id = "q_whitbrd_1",
                    questionText = "老师走进教室后，在巨大的白板上做了一个什么简单的动作？ (Tindakan sederhana apa yang dilakukan sang guru di atas papan tulis putih besar?)",
                    options = listOf("写下了十道复杂的数学题 (Menulis sepuluh rumus matematika yang rumit)", "用黑色笔画了一个小黑点 (Menggambar sebuah titik hitam kecil menggunakan spidol hitam)", "画了一幅美丽的风景画 (Menggambar pemandangan alam yang indah)", "把白板擦得干干净净 (Menghapus papan tulis hingga bersih total)"),
                    correctAnswerIndex = 1,
                    explanation = "Guru sengaja hanya membubuhkan satu titik hitam kecil di atas hamparan papan tulis putih yang luas."
                ),
                StoryQuestion(
                    id = "q_whitbrd_2",
                    questionText = "当老师询问“这是什么”时，全班学生的统一回答是什么？ (Apa jawaban serentak dari seluruh murid di kelas saat ditanya apa yang mereka lihat?)",
                    options = listOf("“一片广阔的白板” (Papan tulis putih yang sangat luas)", "“一个黑点” (Sebuah titik hitam kecil)", "“太阳系中的黑洞” (Lubang hitam di tata surya)", "“一只小蚂蚁” (Seekor semut kecil)"),
                    correctAnswerIndex = 1,
                    explanation = "Semua mata murid langsung terpaku pada satu titik noda hitam kecil tersebut."
                ),
                StoryQuestion(
                    id = "q_whitbrd_3",
                    questionText = "老师借由“大家都没看见这么大的白板吗”这一反问，传达了什么核心思想？ (Pesan moral apa yang ditekankan guru melalui analogi papan tulis putih tersebut?)",
                    options = listOf("教室白板质量太差需要更换 (Papan tulis kelas mutunya jelek dan perlu diganti)", "人们常常只死盯别人的少许缺点，却忽视了对方身上如白板般辽阔的大量优点 (Manusia kerap terpaku pada segelintir kekurangan orang lain, namun abai melihat hamparan kelebihan yang melimpah)", "学生们的视力普遍下降了 (Mata para murid rata-rata mengalami rabun)", "画点是艺术的最高境界 (Menggambar titik adalah puncak seni lukis)"),
                    correctAnswerIndex = 1,
                    explanation = "Titik hitam ibarat cela kecil, sedangkan papan putih melambangkan samudera kebaikan yang jauh lebih luas."
                ),
                StoryQuestion(
                    id = "q_whitbrd_4",
                    questionText = "文章最后建议读者在审视生活与人际关系时，应当采取怎样的处世态度？ (Sikap hidup apa yang disarankan penulis di akhir bacaan saat memandang orang lain?)",
                    options = listOf("挑剔每一个人的微小毛病 (Mencari-cari kesalahan sepele setiap orang)", "换一个包容的广角角度去看待人与事，会有更多美好的新发现 (Mengubah sudut pandang dengan empati luas, niscaya menemukan keindahan dan harapan baru)", "对一切缺点视而不见自欺欺人 (Berpura-pura buta dan menutup mata dari realitas)", "拒绝和有缺点的人来往 (Memutuskan pertemanan dengan siapa pun yang punya kekurangan)"),
                    correctAnswerIndex = 1,
                    explanation = "Mengubah cara pandang dengan memfokuskan perhatian pada kebaikan dan potensi positif orang lain."
                )
            )
        ),
        // Cerita Mandarin Bean 153 (HSK 2): I Got Angry Today (Hari Ini Aku Marah)
        Story(
            id = "story_i_got_angry_today",
            titleHanzi = "今天生气了",
            titlePinyin = "Jīntiān Shēngqì Le",
            titleTranslation = "I Got Angry Today (Hari Ini Aku Marah)",
            level = "HSK 2",
            category = "Romansa & Humor",
            description = "Rasa kesal seorang perempuan saat pacarnya salah mengingat tanggal ulang tahunnya, namun tetap berujung pada makan malam berdua.",
            coverEmoji = "😠",
            coverImageRes = R.drawable.cover_story_i_got_angry_today,
            estimatedReadMinutes = 2,
            sentences = listOf(
                Sentence(
                    id = "s_gotang_1",
                    hanzi = "我的男朋友今天早上说，晚上我们一起吃饭，因为他想给我过生日。",
                    pinyin = "wǒ de nán péng you jīn tiān zǎo shang shuō wǎn shang wǒ men yī qǐ chī fàn yīn wèi tā xiǎng gěi wǒ guò shēng rì",
                    translation = "Pagi ini pacarku mengajakku makan malam bersama sepulang kerja, dengan alasan ia ingin merayakan hari ulang tahunku.",
                    tokens = listOf(
                        WordToken("我", "wǒ", "I; me; my", "Kosakata HSK 2: 我 (wǒ)"),
                        WordToken("的", "de", "possessive particle (of; 's) / modifying particle (used after an attribute to modify a noun or to form a nominal expression)", "Kosakata HSK 2: 的 (de)"),
                        WordToken("男", "nán", "(bound form) male", "Kosakata HSK 2: 男 (nán)"),
                        WordToken("朋友", "péng you", "friend", "Kosakata HSK 2: 朋友 (péng you)"),
                        WordToken("今天", "jīn tiān", "today", "Kosakata HSK 2: 今天 (jīn tiān)"),
                        WordToken("早上", "zǎo shang", "early morning", "Kosakata HSK 2: 早上 (zǎo shang)"),
                        WordToken("说", "shuō", "to speak; to talk; to say", "Kosakata HSK 2: 说 (shuō)"),
                        WordToken("晚上", "wǎn shang", "in the evening", "Kosakata HSK 2: 晚上 (wǎn shang)"),
                        WordToken("我们", "wǒ men", "we; us; ourselves; our", "Kosakata HSK 2: 我们 (wǒ men)"),
                        WordToken("一起", "yī qǐ", "together; in company (with)", "Kosakata HSK 2: 一起 (yī qǐ)"),
                        WordToken("吃", "chī", "to eat; to consume / to eat at", "Kosakata HSK 2: 吃 (chī)"),
                        WordToken("饭", "fàn", "meal", "Kosakata HSK 2: 饭 (fàn)"),
                        WordToken("因为", "yīn wèi", "because; owing to; on account of", "Kosakata HSK 2: 因为 (yīn wèi)"),
                        WordToken("他", "tā", "he; him; his", "Kosakata HSK 2: 他 (tā)"),
                        WordToken("想", "xiǎng", "to desire; to want (to)", "Kosakata HSK 2: 想 (xiǎng)"),
                        WordToken("给", "gěi", "to / for / for the benefit of / to do sth (for sb)", "Kosakata HSK 2: 给 (gěi)"),
                        WordToken("我", "wǒ", "I; me; my", "Kosakata HSK 2: 我 (wǒ)"),
                        WordToken("过", "guò", "to cross / to go over / to pass (time) / to celebrate (a holiday) / to live / to get along", "Kosakata HSK 2: 过 (guò)"),
                        WordToken("生日", "shēng rì", "birthday", "Kosakata HSK 2: 生日 (shēng rì)")
                    )
                ),
                Sentence(
                    id = "s_gotang_2",
                    hanzi = "我有点儿生气，因为我的生日不是今天，下个星期才是我的生日。",
                    pinyin = "wǒ yǒu diǎn r shēng qì yīn wèi wǒ de shēng rì bù shì jīn tiān xià gè xīng qī cái shì wǒ de shēng rì",
                    translation = "Aku merasa agak kesal, karena hari ulang tahunku bukan hari ini, melainkan minggu depan.",
                    tokens = listOf(
                        WordToken("我", "wǒ", "I; me; my", "Kosakata HSK 2: 我 (wǒ)"),
                        WordToken("有点儿", "yǒu diǎn r", "slightly / a little / somewhat", "Kosakata HSK 2: 有点儿 (yǒu diǎn r)"),
                        WordToken("生气", "shēng qì", "to get angry; to be furious", "Kosakata HSK 2: 生气 (shēng qì)"),
                        WordToken("因为", "yīn wèi", "because; owing to; on account of", "Kosakata HSK 2: 因为 (yīn wèi)"),
                        WordToken("我", "wǒ", "I; me; my", "Kosakata HSK 2: 我 (wǒ)"),
                        WordToken("的", "de", "possessive particle (of; 's) / modifying particle (used after an attribute to modify a noun or to form a nominal expression)", "Kosakata HSK 2: 的 (de)"),
                        WordToken("生日", "shēng rì", "birthday", "Kosakata HSK 2: 生日 (shēng rì)"),
                        WordToken("不是", "bù shì", "is not", "Kosakata HSK 2: 不是 (bù shì)"),
                        WordToken("今天", "jīn tiān", "today", "Kosakata HSK 2: 今天 (jīn tiān)"),
                        WordToken("下", "xià", "later / next (week etc)", "Kosakata HSK 2: 下 (xià)"),
                        WordToken("个", "gè", "classifier for people or objects in general", "Kosakata HSK 2: 个 (gè)"),
                        WordToken("星期", "xīng qī", "week", "Kosakata HSK 2: 星期 (xīng qī)"),
                        WordToken("才", "cái", "then and only then", "Kosakata HSK 2: 才 (cái)"),
                        WordToken("是", "shì", "to be (followed by substantives only)", "Kosakata HSK 2: 是 (shì)"),
                        WordToken("我", "wǒ", "I; me; my", "Kosakata HSK 2: 我 (wǒ)"),
                        WordToken("的", "de", "possessive particle (of; 's) / modifying particle (used after an attribute to modify a noun or to form a nominal expression)", "Kosakata HSK 2: 的 (de)"),
                        WordToken("生日", "shēng rì", "birthday", "Kosakata HSK 2: 生日 (shēng rì)")
                    )
                ),
                Sentence(
                    id = "s_gotang_3",
                    hanzi = "他知道我不高兴，就告诉我，因为下个星期他要去北京，不能给我过生日。",
                    pinyin = "tā zhī dào wǒ bù gāo xìng jiù gào su wǒ yīn wèi xià gè xīng qī tā yào qù Běi jīng bù néng gěi wǒ guò shēng rì",
                    translation = "Melihat aku cemberut, ia pun menjelaskan bahwa minggu depan ia harus pergi dinas ke Beijing sehingga tidak bisa menemaniku merayakan ulang tahun.",
                    tokens = listOf(
                        WordToken("他", "tā", "he; him; his", "Kosakata HSK 2: 他 (tā)"),
                        WordToken("知道", "zhī dào", "to know; to become aware of", "Kosakata HSK 2: 知道 (zhī dào)"),
                        WordToken("我", "wǒ", "I; me; my", "Kosakata HSK 2: 我 (wǒ)"),
                        WordToken("不", "bù", "no; not so", "Kosakata HSK 2: 不 (bù)"),
                        WordToken("高兴", "gāo xìng", "happy / glad / in a cheerful mood", "Kosakata HSK 2: 高兴 (gāo xìng)"),
                        WordToken("就", "jiù", "merely; nothing else but; simply; just; precisely; exactly", "Kosakata HSK 2: 就 (jiù)"),
                        WordToken("告诉", "gào su", "to tell; to inform; to let know", "Kosakata HSK 2: 告诉 (gào su)"),
                        WordToken("我", "wǒ", "I; me; my", "Kosakata HSK 2: 我 (wǒ)"),
                        WordToken("因为", "yīn wèi", "because; owing to; on account of", "Kosakata HSK 2: 因为 (yīn wèi)"),
                        WordToken("下", "xià", "later / next (week etc)", "Kosakata HSK 2: 下 (xià)"),
                        WordToken("个", "gè", "classifier for people or objects in general", "Kosakata HSK 2: 个 (gè)"),
                        WordToken("星期", "xīng qī", "week", "Kosakata HSK 2: 星期 (xīng qī)"),
                        WordToken("他", "tā", "he; him; his", "Kosakata HSK 2: 他 (tā)"),
                        WordToken("要", "yào", "will; shall; about to / need to; should / if", "Kosakata HSK 2: 要 (yào)"),
                        WordToken("去", "qù", "to go, to go to", "Kosakata HSK 2: 去 (qù)"),
                        WordToken("北京", "Běi jīng", "Beijing municipality, capital of the People's Republic of China", "Kosakata HSK 2: 北京 (Běi jīng)"),
                        WordToken("不", "bù", "no; not so", "Kosakata HSK 2: 不 (bù)"),
                        WordToken("能", "néng", "can / to be able to / might possibly", "Kosakata HSK 2: 能 (néng)"),
                        WordToken("给", "gěi", "to / for / for the benefit of / to do sth (for sb)", "Kosakata HSK 2: 给 (gěi)"),
                        WordToken("我", "wǒ", "I; me; my", "Kosakata HSK 2: 我 (wǒ)"),
                        WordToken("过", "guò", "to cross / to go over / to pass (time) / to celebrate (a holiday) / to live / to get along", "Kosakata HSK 2: 过 (guò)"),
                        WordToken("生日", "shēng rì", "birthday", "Kosakata HSK 2: 生日 (shēng rì)")
                    )
                ),
                Sentence(
                    id = "s_gotang_4",
                    hanzi = "他又说，去公司旁边的饭馆吃饭。",
                    pinyin = "tā yòu shuō qù gōng sī páng biān de fàn guǎn chī fàn",
                    translation = "Ia kemudian mengusulkan agar kami makan malam di restoran persis di sebelah gedung kantornya.",
                    tokens = listOf(
                        WordToken("他", "tā", "he; him; his", "Kosakata HSK 2: 他 (tā)"),
                        WordToken("又", "yòu", "(once) again", "Kosakata HSK 2: 又 (yòu)"),
                        WordToken("说", "shuō", "to speak; to talk; to say", "Kosakata HSK 2: 说 (shuō)"),
                        WordToken("去", "qù", "to go, to go to", "Kosakata HSK 2: 去 (qù)"),
                        WordToken("公司", "gōng sī", "company; firm; corporation", "Kosakata HSK 2: 公司 (gōng sī)"),
                        WordToken("旁边", "páng biān", "side; adjacent place", "Kosakata HSK 2: 旁边 (páng biān)"),
                        WordToken("的", "de", "possessive particle (of; 's) / modifying particle (used after an attribute to modify a noun or to form a nominal expression)", "Kosakata HSK 2: 的 (de)"),
                        WordToken("饭馆", "fàn guǎn", "restaurant", "Kosakata HSK 2: 饭馆 (fàn guǎn)"),
                        WordToken("吃饭", "chī fàn", "to have a meal / to eat", "Kosakata HSK 2: 吃饭 (chī fàn)")
                    )
                ),
                Sentence(
                    id = "s_gotang_5",
                    hanzi = "我更生气了，因为那个饭馆的菜都是我非常不喜欢的。",
                    pinyin = "wǒ gèng shēng qì le yīn wèi nà gè fàn guǎn de cài dōu shì wǒ fēi cháng bù xǐ huan de",
                    translation = "Mendengar itu aku justru semakin marah, sebab hidangan di restoran tersebut merupakan makanan yang paling tidak kusukai di dunia.",
                    tokens = listOf(
                        WordToken("我", "wǒ", "I; me; my", "Kosakata HSK 2: 我 (wǒ)"),
                        WordToken("更", "gèng", "more / even more / further / still / still more", "Kosakata HSK 2: 更 (gèng)"),
                        WordToken("生气", "shēng qì", "to get angry; to be furious", "Kosakata HSK 2: 生气 (shēng qì)"),
                        WordToken("了", "le", "(completed action marker) / (modal particle indicating change of state, situation now)", "Kosakata HSK 2: 了 (le)"),
                        WordToken("因为", "yīn wèi", "because; owing to; on account of", "Kosakata HSK 2: 因为 (yīn wèi)"),
                        WordToken("那", "nà", "(specifier) that; the; those / (pronoun) that (referring to persons, things or situations)", "Kosakata HSK 2: 那 (nà)"),
                        WordToken("个", "gè", "classifier for people or objects in general", "Kosakata HSK 2: 个 (gè)"),
                        WordToken("饭馆", "fàn guǎn", "restaurant", "Kosakata HSK 2: 饭馆 (fàn guǎn)"),
                        WordToken("的", "de", "possessive particle (of; 's) / modifying particle (used after an attribute to modify a noun or to form a nominal expression)", "Kosakata HSK 2: 的 (de)"),
                        WordToken("菜", "cài", "dish (of food)", "Kosakata HSK 2: 菜 (cài)"),
                        WordToken("都", "dōu", "all; both; entirely", "Kosakata HSK 2: 都 (dōu)"),
                        WordToken("是", "shì", "to be (followed by substantives only)", "Kosakata HSK 2: 是 (shì)"),
                        WordToken("我", "wǒ", "I; me; my", "Kosakata HSK 2: 我 (wǒ)"),
                        WordToken("非常", "fēi cháng", "very; really", "Kosakata HSK 2: 非常 (fēi cháng)"),
                        WordToken("不", "bù", "no; not so", "Kosakata HSK 2: 不 (bù)"),
                        WordToken("喜欢", "xǐ huan", "to like; to be fond of", "Kosakata HSK 2: 喜欢 (xǐ huan)"),
                        WordToken("的", "de", "possessive particle (of; 's) / modifying particle (used after an attribute to modify a noun or to form a nominal expression)", "Kosakata HSK 2: 的 (de)")
                    )
                ),
                Sentence(
                    id = "s_gotang_6",
                    hanzi = "我问他为什么，他说因为很近，很方便。",
                    pinyin = "wǒ wèn tā wèi shén me tā shuō yīn wèi hěn jìn hěn fāng biàn",
                    translation = "Saat kutanya mengapa memilih tempat itu, ia menjawab santai bahwa tempatnya sangat dekat dan praktis baginya.",
                    tokens = listOf(
                        WordToken("我", "wǒ", "I; me; my", "Kosakata HSK 2: 我 (wǒ)"),
                        WordToken("问", "wèn", "to ask; to inquire", "Kosakata HSK 2: 问 (wèn)"),
                        WordToken("他", "tā", "he; him; his", "Kosakata HSK 2: 他 (tā)"),
                        WordToken("为什么", "wèi shén me", "why? / for what reason?", "Kosakata HSK 2: 为什么 (wèi shén me)"),
                        WordToken("他", "tā", "he; him; his", "Kosakata HSK 2: 他 (tā)"),
                        WordToken("说", "shuō", "to speak; to talk; to say", "Kosakata HSK 2: 说 (shuō)"),
                        WordToken("因为", "yīn wèi", "because; owing to; on account of", "Kosakata HSK 2: 因为 (yīn wèi)"),
                        WordToken("很", "hěn", "very; quite", "Kosakata HSK 2: 很 (hěn)"),
                        WordToken("近", "jìn", "near / close to", "Kosakata HSK 2: 近 (jìn)"),
                        WordToken("很", "hěn", "very; quite", "Kosakata HSK 2: 很 (hěn)"),
                        WordToken("方便", "fāng biàn", "convenient; suitable", "Kosakata HSK 2: 方便 (fāng biàn)")
                    )
                ),
                Sentence(
                    id = "s_gotang_7",
                    hanzi = "我现在一点儿也不想和他见面了。",
                    pinyin = "wǒ xiàn zài yī diǎn r yě bù xiǎng hé tā jiàn miàn le",
                    translation = "Sekarang rasanya aku benar-benar enggan untuk menemuinya sama sekali malam ini!",
                    tokens = listOf(
                        WordToken("我", "wǒ", "I; me; my", "Kosakata HSK 2: 我 (wǒ)"),
                        WordToken("现在", "xiàn zài", "now; at present; currently", "Kosakata HSK 2: 现在 (xiàn zài)"),
                        WordToken("一点儿", "yī diǎn r", "erhua", "Kosakata HSK 2: 一点儿 (yī diǎn r)"),
                        WordToken("也", "yě", "even (extreme or unexpected case)", "Kosakata HSK 2: 也 (yě)"),
                        WordToken("不", "bù", "no; not so", "Kosakata HSK 2: 不 (bù)"),
                        WordToken("想", "xiǎng", "to desire; to want (to)", "Kosakata HSK 2: 想 (xiǎng)"),
                        WordToken("和", "hé", "and; together with", "Kosakata HSK 2: 和 (hé)"),
                        WordToken("他", "tā", "he; him; his", "Kosakata HSK 2: 他 (tā)"),
                        WordToken("见面", "jiàn miàn", "to meet; to see each other", "Kosakata HSK 2: 见面 (jiàn miàn)"),
                        WordToken("了", "le", "(completed action marker) / (modal particle indicating change of state, situation now)", "Kosakata HSK 2: 了 (le)")
                    )
                )
            ),
            questions = listOf(
                StoryQuestion(
                    id = "q_gotang_1",
                    questionText = "女主角今天早上听说男朋友要请她吃晚饭过生日，为什么不仅没开心反而有点生气？ (Mengapa sang wanita agak kesal saat pacarnya mengajak makan malam ulang tahun hari ini?)",
                    options = listOf("因为她身体不舒服不能吃大餐 (Karena ia sedang sakit dan tidak bisa makan enak)", "因为今天根本不是她的生日，下个星期才是她的真实生日 (Karena hari ini bukan hari ulang tahunnya, ulang tahun aslinya baru minggu depan!)", "因为男朋友没有买花 (Karena pacarnya tidak membelikan bunga)", "因为她晚上要加班 (Karena ia harus lembur di kantor)"),
                    correctAnswerIndex = 1,
                    explanation = "Pacarnya salah mengingat tanggal dan mengira ulang tahun sang kekasih jatuh pada hari ini."
                ),
                StoryQuestion(
                    id = "q_gotang_2",
                    questionText = "男朋友解释之所以提前今天过生日，是因为下星期有什么安排？ (Alasan apa yang diutarakan sang pacar mengapa ia memajukan perayaan ulang tahun?)",
                    options = listOf("他下周要和朋友去钓鱼 (Minggu depan ia mau pergi memancing bersama kawan)", "他下个星期需要去北京出差，无法陪她 (Minggu depan ia harus melakukan perjalanan dinas kerja ke Beijing)", "他下周准备换工作 (Minggu depan ia bersiap pindah kantor)", "他下周要出国旅游 (Minggu depan ia mau liburan ke luar negeri)"),
                    correctAnswerIndex = 1,
                    explanation = "Tuntutan tugas luar kota ke Beijing membuatnya terpaksa merayakan lebih awal sebelum berangkat."
                ),
                StoryQuestion(
                    id = "q_gotang_3",
                    questionText = "当男朋友说出吃晚饭的餐厅地点后，为什么女主角心里更加火冒三丈？ (Mengapa wanita itu justru semakin marah besar saat mendengar pilihan restoran yang diusulkan?)",
                    options = listOf("那家餐厅消费实在太昂贵了 (Restoran tersebut harganya teramat mahal)", "选中的餐厅所有菜品恰好都是女主角平时最讨厌吃的食物 (Menu di restoran tersebut kebetulan merupakan hidangan yang paling ia benci di dunia!)", "餐厅离市区太远了 (Restorannya terlalu jauh di pelosok pinggiran kota)", "餐厅要求穿晚礼服 (Restoran mewajibkan pakaian formal gaun malam)"),
                    correctAnswerIndex = 1,
                    explanation = "Bukannya memilih tempat favorit pacar, sang pria malah memilih restoran yang masakannya dibenci kekasihnya."
                ),
                StoryQuestion(
                    id = "q_gotang_4",
                    questionText = "男朋友挑选这家饭馆的真正动机是什么，彻底让女主角心灰意冷不想赴约？ (Apa alasan egois sang pacar memilih restoran tersebut yang membuat wanita itu enggan menemuinya?)",
                    options = listOf("厨师是他的老同学 (Koki di restoran itu adalah teman lamanya)", "仅仅是因为饭馆就在他自己公司隔壁，离他很近很方便而已 (Hanya karena restoran itu persis di samping kantornya, sangat dekat dan nyaman bagi dirinya sendiri!)", "饭馆有特价五折优惠券 (Restoran sedang ada kupon diskon 50%)", "饭馆环境非常浪漫 (Suasana restoran sangat romantis)"),
                    correctAnswerIndex = 1,
                    explanation = "Sikap tidak peka dan mengutamakan kenyamanan pribadi sang pacar merusak suasana ulang tahun yang romantis."
                )
            )
        ),
        // Cerita Mandarin Bean 154 (HSK 2): Stratagem (Siasat Cerdik)
        Story(
            id = "story_stratagem",
            titleHanzi = "计谋",
            titlePinyin = "Jìmóu",
            titleTranslation = "Stratagem (Siasat Cerdik)",
            level = "HSK 2",
            category = "Humor Anak",
            description = "Akal bulus Xiao Ming yang menangis mengaku ayahnya yang tertabrak demi bisa menerobos kerumunan orang yang menonton kecelakaan di jalan.",
            coverEmoji = "💡",
            coverImageRes = R.drawable.cover_story_stratagem,
            estimatedReadMinutes = 2,
            sentences = listOf(
                Sentence(
                    id = "s_stratag_1",
                    hanzi = "一天，路上发生了交通事故，小明看见有很多人围在那里，他也想看看。",
                    pinyin = "yī tiān lù shàng fā shēng le jiāo tōng shì gù xiǎo míng kàn jiàn yǒu hěn duō rén wéi zài nà lǐ tā yě xiǎng kàn kàn",
                    translation = "Suatu hari, terjadi sebuah kecelakaan lalu lintas di tengah jalan raya, dan Xiao Ming melihat kerumunan orang berkumpul mengelilingi lokasi kejadian.",
                    tokens = listOf(
                        WordToken("一天", "yī tiān", "one day; a day", "Kosakata HSK 2: 一天 (yī tiān)"),
                        WordToken("路", "lù", "road / journey / route / line (bus etc) / sort; kind", "Kosakata HSK 2: 路 (lù)"),
                        WordToken("上", "shàng", "(noun suffix) on; above", "Kosakata HSK 2: 上 (shàng)"),
                        WordToken("发生", "fā shēng", "to happen; to occur; to take place; to break out", "Kosakata HSK 2: 发生 (fā shēng)"),
                        WordToken("了", "le", "(completed action marker) / (modal particle indicating change of state, situation now)", "Kosakata HSK 2: 了 (le)"),
                        WordToken("交通", "jiāo tōng", "traffic / transportation / communications / liaison", "Kosakata HSK 2: 交通 (jiāo tōng)"),
                        WordToken("事故", "shì gù", "accident", "Kosakata HSK 2: 事故 (shì gù)"),
                        WordToken("小明", "xiǎo míng", "a placeholder personal name, literally “Little Ming”; often used like “John Doe” in examples", "Kosakata HSK 2: 小明 (xiǎo míng)"),
                        WordToken("看见", "kàn jiàn", "to see; to catch sight of", "Kosakata HSK 2: 看见 (kàn jiàn)"),
                        WordToken("有", "yǒu", "to have; there is", "Kosakata HSK 2: 有 (yǒu)"),
                        WordToken("很多", "hěn duō", "many; a lot of", "Kosakata HSK 2: 很多 (hěn duō)"),
                        WordToken("人", "rén", "person; people", "Kosakata HSK 2: 人 (rén)"),
                        WordToken("围", "wéi", "to encircle / to surround / to wear by wrapping around (scarf, shawl)", "Kosakata HSK 2: 围 (wéi)"),
                        WordToken("在", "zài", "(of sb or sth) to be (located) at", "Kosakata HSK 2: 在 (zài)"),
                        WordToken("那", "nà", "(specifier) that; the; those / (pronoun) that (referring to persons, things or situations)", "Kosakata HSK 2: 那 (nà)"),
                        WordToken("里", "lǐ", "lining / interior / inside", "Kosakata HSK 2: 里 (lǐ)"),
                        WordToken("他", "tā", "he; him; his", "Kosakata HSK 2: 他 (tā)"),
                        WordToken("也", "yě", "also; too; as well; (not ...) either", "Kosakata HSK 2: 也 (yě)"),
                        WordToken("想", "xiǎng", "to desire; to want (to)", "Kosakata HSK 2: 想 (xiǎng)"),
                        WordToken("看", "kàn", "to see; to look at / to read / to watch / to visit; to call on / to consider; to regard as / to look after / to treat (a patient or illness) / to depend on / to feel (that) / (after a verb) to give it a try / to watch out for", "Kosakata HSK 2: 看 (kàn)"),
                        WordToken("看", "kàn", "to see; to look at / to read / to watch / to visit; to call on / to consider; to regard as / to look after / to treat (a patient or illness) / to depend on / to feel (that) / (after a verb) to give it a try / to watch out for", "Kosakata HSK 2: 看 (kàn)")
                    )
                ),
                Sentence(
                    id = "s_stratag_2",
                    hanzi = "但是人太多了，他进不去。",
                    pinyin = "dàn shì rén tài duō le tā jìn bù qù",
                    translation = "Ia sangat penasaran ingin melihat apa yang terjadi, namun karena terlalu banyak orang berjejal, ia tidak bisa masuk.",
                    tokens = listOf(
                        WordToken("但是", "dàn shì", "but; however", "Kosakata HSK 2: 但是 (dàn shì)"),
                        WordToken("人", "rén", "person; people", "Kosakata HSK 2: 人 (rén)"),
                        WordToken("太", "tài", "too (much) / very / extremely", "Kosakata HSK 2: 太 (tài)"),
                        WordToken("多", "duō", "too many; in excess", "Kosakata HSK 2: 多 (duō)"),
                        WordToken("了", "le", "(completed action marker) / (modal particle indicating change of state, situation now)", "Kosakata HSK 2: 了 (le)"),
                        WordToken("他", "tā", "he; him; his", "Kosakata HSK 2: 他 (tā)"),
                        WordToken("进", "jìn", "to go in / to enter / to put in / to submit / to take in / to admit", "Kosakata HSK 2: 进 (jìn)"),
                        WordToken("不", "bù", "no; not so", "Kosakata HSK 2: 不 (bù)"),
                        WordToken("去", "qù", "(after a verb of motion) movement away from the speaker; (after certain verbs) detachment or separation", "Kosakata HSK 2: 去 (qù)")
                    )
                ),
                Sentence(
                    id = "s_stratag_3",
                    hanzi = "这时候，他想了一个办法，哭着说：“让我进去！让我进去！那个人是我的爸爸！”",
                    pinyin = "zhè shí hou tā xiǎng le yī gè bàn fǎ kū zhe shuō ràng wǒ jìn qù ràng wǒ jìn qù nà gè rén shì wǒ de bà ba",
                    translation = "Pada saat itu, tercetuslah sebuah ide licik di kepalanya; ia mulai menangis histeris sambil berteriak: “Tolong biarkan saya masuk! Biarkan saya lewat! Orang yang tertabrak itu adalah ayah kandung saya!”",
                    tokens = listOf(
                        WordToken("这", "zhè", "this; these", "Kosakata HSK 2: 这 (zhè)"),
                        WordToken("时候", "shí hou", "time / length of time / moment / period", "Kosakata HSK 2: 时候 (shí hou)"),
                        WordToken("他", "tā", "he; him; his", "Kosakata HSK 2: 他 (tā)"),
                        WordToken("想", "xiǎng", "to think (about) / to think of; to devise / to think (that); to believe (that)", "Kosakata HSK 2: 想 (xiǎng)"),
                        WordToken("了", "le", "(completed action marker) / (modal particle indicating change of state, situation now)", "Kosakata HSK 2: 了 (le)"),
                        WordToken("一", "yī", "one / single / a (article)", "Kosakata HSK 2: 一 (yī)"),
                        WordToken("个", "gè", "classifier for people or objects in general", "Kosakata HSK 2: 个 (gè)"),
                        WordToken("办法", "bàn fǎ", "way of handling sth; means; measure; (practical) solution to a problem", "Kosakata HSK 2: 办法 (bàn fǎ)"),
                        WordToken("哭", "kū", "to cry; to weep", "Kosakata HSK 2: 哭 (kū)"),
                        WordToken("着", "zhe", "aspect particle indicating action in progress or ongoing state", "Kosakata HSK 2: 着 (zhe)"),
                        WordToken("说", "shuō", "to speak; to talk; to say", "Kosakata HSK 2: 说 (shuō)"),
                        WordToken("让", "ràng", "to permit / to let sb do sth / to have sb do sth / to make sb (feel sad etc)", "Kosakata HSK 2: 让 (ràng)"),
                        WordToken("我", "wǒ", "I; me; my", "Kosakata HSK 2: 我 (wǒ)"),
                        WordToken("进", "jìn", "to go in / to enter / to put in / to submit / to take in / to admit", "Kosakata HSK 2: 进 (jìn)"),
                        WordToken("去", "qù", "(after a verb of motion) movement away from the speaker; (after certain verbs) detachment or separation", "Kosakata HSK 2: 去 (qù)"),
                        WordToken("让", "ràng", "to permit / to let sb do sth / to have sb do sth / to make sb (feel sad etc)", "Kosakata HSK 2: 让 (ràng)"),
                        WordToken("我", "wǒ", "I; me; my", "Kosakata HSK 2: 我 (wǒ)"),
                        WordToken("进", "jìn", "to go in / to enter / to put in / to submit / to take in / to admit", "Kosakata HSK 2: 进 (jìn)"),
                        WordToken("去", "qù", "(after a verb of motion) movement away from the speaker; (after certain verbs) detachment or separation", "Kosakata HSK 2: 去 (qù)"),
                        WordToken("那", "nà", "(specifier) that; the; those / (pronoun) that (referring to persons, things or situations)", "Kosakata HSK 2: 那 (nà)"),
                        WordToken("个", "gè", "classifier for people or objects in general", "Kosakata HSK 2: 个 (gè)"),
                        WordToken("人", "rén", "person; people", "Kosakata HSK 2: 人 (rén)"),
                        WordToken("是", "shì", "to be (followed by substantives only)", "Kosakata HSK 2: 是 (shì)"),
                        WordToken("我", "wǒ", "I; me; my", "Kosakata HSK 2: 我 (wǒ)"),
                        WordToken("的", "de", "possessive particle (of; 's) / modifying particle (used after an attribute to modify a noun or to form a nominal expression)", "Kosakata HSK 2: 的 (de)"),
                        WordToken("爸爸", "bà ba", "(coll.) father; dad", "Kosakata HSK 2: 爸爸 (bà ba)")
                    )
                ),
                Sentence(
                    id = "s_stratag_4",
                    hanzi = "人们听了，觉得很奇怪，但还是让他进去了。",
                    pinyin = "rén men tīng le jué de hěn qí guài dàn hái shi ràng tā jìn qù le",
                    translation = "Mendengar teriakannya yang memilukan, orang-orang merasa iba bercampur heran, lalu segera membuka jalan memberi celah baginya untuk masuk.",
                    tokens = listOf(
                        WordToken("人们", "rén men", "people", "Kosakata HSK 2: 人们 (rén men)"),
                        WordToken("听", "tīng", "to listen to; to hear", "Kosakata HSK 2: 听 (tīng)"),
                        WordToken("了", "le", "(completed action marker) / (modal particle indicating change of state, situation now)", "Kosakata HSK 2: 了 (le)"),
                        WordToken("觉得", "jué de", "to think that ...; to feel that ...", "Kosakata HSK 2: 觉得 (jué de)"),
                        WordToken("很", "hěn", "very; quite", "Kosakata HSK 2: 很 (hěn)"),
                        WordToken("奇怪", "qí guài", "strange / odd", "Kosakata HSK 2: 奇怪 (qí guài)"),
                        WordToken("但", "dàn", "but; yet; however; still", "Kosakata HSK 2: 但 (dàn)"),
                        WordToken("还是", "hái shi", "still (as before)", "Kosakata HSK 2: 还是 (hái shi)"),
                        WordToken("让", "ràng", "to permit / to let sb do sth / to have sb do sth / to make sb (feel sad etc)", "Kosakata HSK 2: 让 (ràng)"),
                        WordToken("他", "tā", "he; him; his", "Kosakata HSK 2: 他 (tā)"),
                        WordToken("进", "jìn", "to go in / to enter / to put in / to submit / to take in / to admit", "Kosakata HSK 2: 进 (jìn)"),
                        WordToken("去", "qù", "(after a verb of motion) movement away from the speaker; (after certain verbs) detachment or separation", "Kosakata HSK 2: 去 (qù)"),
                        WordToken("了", "le", "(completed action marker) / (modal particle indicating change of state, situation now)", "Kosakata HSK 2: 了 (le)")
                    )
                ),
                Sentence(
                    id = "s_stratag_5",
                    hanzi = "他走近一看，只见一只狗正躺在地上。",
                    pinyin = "tā zǒu jìn yī kàn zhǐ jiàn yī zhī gǒu zhèng tǎng zài dì shàng",
                    translation = "Begitu ia melangkah mendekat dan melihat ke tanah, ternyata yang tergeletak di sana adalah seekor anjing jalanan!",
                    tokens = listOf(
                        WordToken("他", "tā", "he; him; his", "Kosakata HSK 2: 他 (tā)"),
                        WordToken("走", "zǒu", "to walk / to go / to run / to move (of vehicle) / to visit / to leave / to go away / to die (euph.) / to change (shape, form, meaning)", "Kosakata HSK 2: 走 (zǒu)"),
                        WordToken("近", "jìn", "near / close to", "Kosakata HSK 2: 近 (jìn)"),
                        WordToken("一", "yī", "as soon as", "Kosakata HSK 2: 一 (yī)"),
                        WordToken("看", "kàn", "to see; to look at / to read / to watch / to visit; to call on / to consider; to regard as / to look after / to treat (a patient or illness) / to depend on / to feel (that) / (after a verb) to give it a try / to watch out for", "Kosakata HSK 2: 看 (kàn)"),
                        WordToken("只", "zhǐ", "only; merely; just", "Kosakata HSK 2: 只 (zhǐ)"),
                        WordToken("见", "jiàn", "to see / to meet / to appear (to be sth) / to interview", "Kosakata HSK 2: 见 (jiàn)"),
                        WordToken("一", "yī", "one / single / a (article)", "Kosakata HSK 2: 一 (yī)"),
                        WordToken("只", "zhī", "classifier for birds and certain animals, one of a pair, some utensils, vessels etc", "Kosakata HSK 2: 只 (zhī)"),
                        WordToken("狗", "gǒu", "dog", "Kosakata HSK 2: 狗 (gǒu)"),
                        WordToken("正", "zhèng", "exactly / just (at that time) / right (in that place)", "Kosakata HSK 2: 正 (zhèng)"),
                        WordToken("躺", "tǎng", "to recline / to lie down", "Kosakata HSK 2: 躺 (tǎng)"),
                        WordToken("在", "zài", "(of sb or sth) to be (located) at", "Kosakata HSK 2: 在 (zài)"),
                        WordToken("地", "dì", "earth / ground / field / place / land", "Kosakata HSK 2: 地 (dì)"),
                        WordToken("上", "shàng", "(noun suffix) on; above", "Kosakata HSK 2: 上 (shàng)")
                    )
                )
            ),
            questions = listOf(
                StoryQuestion(
                    id = "q_stratag_1",
                    questionText = "小明在路上遇到交通事故时，心里产生了一种怎样的强烈好奇驱使？ (Dorongan rasa ingin tahu apa yang dirasakan Xiao Ming saat melihat kerumunan kecelakaan di jalan?)",
                    options = listOf("想要立即打电话叫救护车救人 (Ingin segera menelepon ambulans menolong korban)", "看到许多人围观，自己也迫切地想挤进去凑热闹看个究竟 (Melihat banyak orang berkerumun, ia pun sangat ingin mendesak masuk ikut menonton kejadian)", "害怕地绕道而行 (Ketakutan dan memilih memutar jalan lain)", "想要在路边指挥交通 (Ingin membantu mengatur arus lalu lintas)"),
                    correctAnswerIndex = 1,
                    explanation = "Rasa ingin tahu yang berlebihan membuatnya bersikeras ingin melihat apa yang terjadi di tengah kerumunan."
                ),
                StoryQuestion(
                    id = "q_stratag_2",
                    questionText = "面对密不透风、根本挤不进去的围观人群，小明生出了什么惊世骇俗的计谋？ (Akal bulus licik apa yang dirancang Xiao Ming agar diberi jalan oleh orang-orang?)",
                    options = listOf("在人群外大喊“警察来了” (Berteriak 'polisi datang' di luar kerumunan)", "假装大声痛哭并撕心裂肺地喊道“躺在地上的那个人是我爸爸” (Pura-pura menangis tersedu-sedu sambil berteriak 'orang yang tergeletak itu adalah ayah saya!')", "拿出钱包给围观群众发钱 (Membagikan uang tunai kepada orang-orang)", "坐在地上放声大笑 (Duduk tertawa terbahak-bahak di tanah)"),
                    correctAnswerIndex = 1,
                    explanation = "Ia berakting menangis dan mengaku sebagai anak kandung dari korban yang tertabrak demi membuka jalan."
                ),
                StoryQuestion(
                    id = "q_stratag_3",
                    questionText = "围观的人们听到小明痛哭流涕的呼喊后，做出了怎样的反应？ (Bagaimana reaksi kerumunan warga setelah mendengar jeritan pilu Xiao Ming?)",
                    options = listOf("认出小明在撒谎并当面斥责他 (Mengenali bahwa Xiao Ming berbohong lalu memakinya)", "感到非常惊奇同情，纷纷主动闪开让出一条通道让他进去 (Merasa kaget bercampur iba, lalu serentak memberi jalan baginya untuk masuk)", "强行把他抱离现场 (Memeluk dan menggendongnya menjauhi TKP)", "完全无动于衷继续挡着 (Sama sekali cuek dan terus memblokir jalannya)"),
                    correctAnswerIndex = 1,
                    explanation = "Rasa simpati kemanusiaan membuat kerumunan orang seketika membuka jalan bagi sang 'anak korban'."
                ),
                StoryQuestion(
                    id = "q_stratag_4",
                    questionText = "当小明满怀期待终于走近现场中央时，映入眼帘的滑稽景象是什么？ (Pemandangan memalukan apa yang menyambut Xiao Ming begitu sampai di tengah jalan?)",
                    options = listOf("地上躺着一具崭新的机器人 (Sebuah robot canggih terkapar di tanah)", "躺在路中间地上的居然只是一只被撞倒的小狗 (Yang tergeletak di tengah jalan ternyata cuma seekor anak anjing!)", "地上散落着满满一箱金币 (Sekotak penuh koin emas berserakan di aspal)", "根本什么都没有，大家在拍戏 (Tidak ada apa-apa, orang-orang hanya sedang syuting film)"),
                    correctAnswerIndex = 1,
                    explanation = "Puncak bumerang komedi: Xiao Ming baru saja mempermalukan dirinya sendiri dengan mengakui seekor anjing sebagai ayahnya!"
                )
            )
        )
    )
}
