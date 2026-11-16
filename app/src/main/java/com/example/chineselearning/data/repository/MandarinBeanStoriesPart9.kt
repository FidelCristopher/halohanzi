package com.example.chineselearning.data.repository

import com.example.chineselearning.R
import com.example.chineselearning.data.model.Sentence
import com.example.chineselearning.data.model.Story
import com.example.chineselearning.data.model.StoryQuestion
import com.example.chineselearning.data.model.WordToken

val mandarinBeanStoriesPart9: List<Story> by lazy {
    listOf(
        // Cerita Mandarin Bean 110 (HSK 2): Do Things (Mengerjakan Tugas)
        Story(
            id = "story_do_things",
            titleHanzi = "做事",
            titlePinyin = "Zuò Shì",
            titleTranslation = "Do Things (Mengerjakan Tugas)",
            level = "HSK 2",
            category = "Kehidupan Sehari-hari",
            description = "Kisah cerdik seorang anak yang menggunakan nasihat ibunya tentang 'menyelesaikan hal hari ini' untuk meminta kue.",
            coverEmoji = "📝",
            coverImageRes = R.drawable.cover_story_do_things,
            estimatedReadMinutes = 2,
            sentences = listOf(
                Sentence(
                    id = "s_dothing_1",
                    hanzi = "李明刚上一年级，非常不喜欢做作业。",
                    pinyin = "Lǐ Míng gāng shàng yī nián jí fēi cháng bù xǐ huan zuò zuò yè",
                    translation = "Li Ming baru saja masuk kelas satu SD, dan dia sangat tidak suka mengerjakan pekerjaan rumah (PR).",
                    tokens = listOf(
                        WordToken("李明", "Lǐ Míng", "A common chinese personal name", "Kosakata HSK 2: 李明 (Lǐ Míng)"),
                        WordToken("刚", "gāng", "Just", "Kosakata HSK 2: 刚 (gāng)"),
                        WordToken("上", "shàng", "To attend (class or university)", "Kosakata HSK 2: 上 (shàng)"),
                        WordToken("一", "yī", "One", "Kosakata HSK 2: 一 (yī)"),
                        WordToken("年级", "nián jí", "Grade", "Kosakata HSK 2: 年级 (nián jí)"),
                        WordToken("非常", "fēi cháng", "Very; really", "Kosakata HSK 2: 非常 (fēi cháng)"),
                        WordToken("不", "bù", "No; not so", "Kosakata HSK 2: 不 (bù)"),
                        WordToken("喜欢", "xǐ huan", "To like; to be fond of", "Kosakata HSK 2: 喜欢 (xǐ huan)"),
                        WordToken("做", "zuò", "To do; to engage in; to hold (a party etc)", "Kosakata HSK 2: 做 (zuò)"),
                        WordToken("作业", "zuò yè", "School assignment", "Kosakata HSK 2: 作业 (zuò yè)")
                    )
                ),
                Sentence(
                    id = "s_dothing_2",
                    hanzi = "一天晚上，他对妈妈说：”妈妈，我今天不想写作业了，明天写可以吗？”",
                    pinyin = "yī tiān wǎn shang tā duì mā ma shuō mā ma wǒ jīn tiān bù xiǎng xiě zuò yè le míng tiān xiě kě yǐ ma",
                    translation = "Suatu malam, dia berkata kepada ibunya: “Ibu, hari ini saya tidak ingin menulis PR, bolehkah saya kerjakan besok saja?”",
                    tokens = listOf(
                        WordToken("一天", "yī tiān", "One day; a day", "Kosakata HSK 2: 一天 (yī tiān)"),
                        WordToken("晚上", "wǎn shang", "Evening", "Kosakata HSK 2: 晚上 (wǎn shang)"),
                        WordToken("他", "tā", "He; him; his", "Kosakata HSK 2: 他 (tā)"),
                        WordToken("对", "duì", "Towards; at; for", "Kosakata HSK 2: 对 (duì)"),
                        WordToken("妈妈", "mā ma", "Mama", "Kosakata HSK 2: 妈妈 (mā ma)"),
                        WordToken("说", "shuō", "To speak; to talk; to say", "Kosakata HSK 2: 说 (shuō)"),
                        WordToken("妈妈", "mā ma", "Mama", "Kosakata HSK 2: 妈妈 (mā ma)"),
                        WordToken("我", "wǒ", "I; me; my", "Kosakata HSK 2: 我 (wǒ)"),
                        WordToken("今天", "jīn tiān", "Today", "Kosakata HSK 2: 今天 (jīn tiān)"),
                        WordToken("不", "bù", "No; not so", "Kosakata HSK 2: 不 (bù)"),
                        WordToken("想", "xiǎng", "To desire; to want (to)", "Kosakata HSK 2: 想 (xiǎng)"),
                        WordToken("写", "xiě", "To write", "Kosakata HSK 2: 写 (xiě)"),
                        WordToken("作业", "zuò yè", "School assignment", "Kosakata HSK 2: 作业 (zuò yè)"),
                        WordToken("了", "le", "(completed action marker)", "Kosakata HSK 2: 了 (le)"),
                        WordToken("明天", "míng tiān", "Tomorrow", "Kosakata HSK 2: 明天 (míng tiān)"),
                        WordToken("写", "xiě", "To write", "Kosakata HSK 2: 写 (xiě)"),
                        WordToken("可以", "kě yǐ", "Can", "Kosakata HSK 2: 可以 (kě yǐ)"),
                        WordToken("吗", "ma", "(question particle for &quot;yes-no&quot; questions)", "Kosakata HSK 2: 吗 (ma)")
                    )
                ),
                Sentence(
                    id = "s_dothing_3",
                    hanzi = "妈妈说：”自己的事情要自己做，今天的事情也要今天完成，不要留到明天。”",
                    pinyin = "mā ma shuō zì jǐ de shì qing yào zì jǐ zuò jīn tiān de shì qing yě yào jīn tiān wán chéng bù yào liú dào míng tiān",
                    translation = "Ibu menasihati: “Urusan sendiri harus dikerjakan sendiri, dan urusan hari ini juga harus diselesaikan hari ini, jangan ditunda sampai besok.”",
                    tokens = listOf(
                        WordToken("妈妈", "mā ma", "Mama", "Kosakata HSK 2: 妈妈 (mā ma)"),
                        WordToken("说", "shuō", "To speak; to talk; to say", "Kosakata HSK 2: 说 (shuō)"),
                        WordToken("自己", "zì jǐ", "Oneself; (attributive) one&#x27;s own", "Kosakata HSK 2: 自己 (zì jǐ)"),
                        WordToken("的", "de", "Possessive particle (of; &#x27;s)", "Kosakata HSK 2: 的 (de)"),
                        WordToken("事情", "shì qing", "Affair; matter; thing; business", "Kosakata HSK 2: 事情 (shì qing)"),
                        WordToken("要", "yào", "Will; shall; about to", "Kosakata HSK 2: 要 (yào)"),
                        WordToken("自己", "zì jǐ", "Oneself; (attributive) one&#x27;s own", "Kosakata HSK 2: 自己 (zì jǐ)"),
                        WordToken("做", "zuò", "To do; to engage in; to hold (a party etc)", "Kosakata HSK 2: 做 (zuò)"),
                        WordToken("今天", "jīn tiān", "Today", "Kosakata HSK 2: 今天 (jīn tiān)"),
                        WordToken("的", "de", "Possessive particle (of; &#x27;s)", "Kosakata HSK 2: 的 (de)"),
                        WordToken("事情", "shì qing", "Affair; matter; thing; business", "Kosakata HSK 2: 事情 (shì qing)"),
                        WordToken("也", "yě", "Also; too; as well; (not ...) either", "Kosakata HSK 2: 也 (yě)"),
                        WordToken("要", "yào", "Will; shall; about to", "Kosakata HSK 2: 要 (yào)"),
                        WordToken("今天", "jīn tiān", "Today", "Kosakata HSK 2: 今天 (jīn tiān)"),
                        WordToken("完成", "wán chéng", "To complete; to accomplish", "Kosakata HSK 2: 完成 (wán chéng)"),
                        WordToken("不", "bù", "No; not so", "Kosakata HSK 2: 不 (bù)"),
                        WordToken("要", "yào", "Will; shall; about to", "Kosakata HSK 2: 要 (yào)"),
                        WordToken("留", "liú", "To retain", "Kosakata HSK 2: 留 (liú)"),
                        WordToken("到", "dào", "To reach; to arrive", "Kosakata HSK 2: 到 (dào)"),
                        WordToken("明天", "míng tiān", "Tomorrow", "Kosakata HSK 2: 明天 (míng tiān)")
                    )
                ),
                Sentence(
                    id = "s_dothing_4",
                    hanzi = "李明说：”好吧，妈妈，你可以把刚才的蛋糕给我吗？",
                    pinyin = "Lǐ Míng shuō hǎo ba mā ma nǐ kě yǐ bǎ gāng cái de dàn gāo gěi wǒ ma",
                    translation = "Li Ming berkata: “Baiklah Ibu, bisakah Ibu berikan kue yang tadi kepada saya?",
                    tokens = listOf(
                        WordToken("李明", "Lǐ Míng", "A common chinese personal name", "Kosakata HSK 2: 李明 (Lǐ Míng)"),
                        WordToken("说", "shuō", "To speak; to talk; to say", "Kosakata HSK 2: 说 (shuō)"),
                        WordToken("好", "hǎo", "All right!", "Kosakata HSK 2: 好 (hǎo)"),
                        WordToken("吧", "ba", "(modal particle indicating suggestion or surmise)", "Kosakata HSK 2: 吧 (ba)"),
                        WordToken("妈妈", "mā ma", "Mama", "Kosakata HSK 2: 妈妈 (mā ma)"),
                        WordToken("你", "nǐ", "You", "Kosakata HSK 2: 你 (nǐ)"),
                        WordToken("可以", "kě yǐ", "Can", "Kosakata HSK 2: 可以 (kě yǐ)"),
                        WordToken("把", "bǎ", "(used to put the object before the verb: 把[ba3] + {noun} + {verb})", "Kosakata HSK 2: 把 (bǎ)"),
                        WordToken("刚才", "gāng cái", "Just now", "Kosakata HSK 2: 刚才 (gāng cái)"),
                        WordToken("的", "de", "Possessive particle (of; &#x27;s)", "Kosakata HSK 2: 的 (de)"),
                        WordToken("蛋糕", "dàn gāo", "Cake", "Kosakata HSK 2: 蛋糕 (dàn gāo)"),
                        WordToken("给", "gěi", "To give", "Kosakata HSK 2: 给 (gěi)"),
                        WordToken("我", "wǒ", "I; me; my", "Kosakata HSK 2: 我 (wǒ)"),
                        WordToken("吗", "ma", "(question particle for &quot;yes-no&quot; questions)", "Kosakata HSK 2: 吗 (ma)")
                    )
                ),
                Sentence(
                    id = "s_dothing_5",
                    hanzi = "这是今天的蛋糕，所以我要今天把它吃完。”",
                    pinyin = "zhè shì jīn tiān de dàn gāo suǒ yǐ wǒ yào jīn tiān bǎ tā chī wán",
                    translation = "Itu kan kue untuk hari ini, jadi saya harus menghabiskannya hari ini juga.”",
                    tokens = listOf(
                        WordToken("这", "zhè", "This; these", "Kosakata HSK 2: 这 (zhè)"),
                        WordToken("是", "shì", "To be (followed by substantives only)", "Kosakata HSK 2: 是 (shì)"),
                        WordToken("今天", "jīn tiān", "Today", "Kosakata HSK 2: 今天 (jīn tiān)"),
                        WordToken("的", "de", "Possessive particle (of; &#x27;s)", "Kosakata HSK 2: 的 (de)"),
                        WordToken("蛋糕", "dàn gāo", "Cake", "Kosakata HSK 2: 蛋糕 (dàn gāo)"),
                        WordToken("所以", "suǒ yǐ", "Therefore", "Kosakata HSK 2: 所以 (suǒ yǐ)"),
                        WordToken("我", "wǒ", "I; me; my", "Kosakata HSK 2: 我 (wǒ)"),
                        WordToken("要", "yào", "Will; shall; about to", "Kosakata HSK 2: 要 (yào)"),
                        WordToken("今天", "jīn tiān", "Today", "Kosakata HSK 2: 今天 (jīn tiān)"),
                        WordToken("把", "bǎ", "(used to put the object before the verb: 把[ba3] + {noun} + {verb})", "Kosakata HSK 2: 把 (bǎ)"),
                        WordToken("它", "tā", "It", "Kosakata HSK 2: 它 (tā)"),
                        WordToken("吃", "chī", "To eat; to consume", "Kosakata HSK 2: 吃 (chī)"),
                        WordToken("完", "wán", "To finish", "Kosakata HSK 2: 完 (wán)")
                    )
                )
            ),
            questions = listOf(
                StoryQuestion(
                    id = "q_dothing_1",
                    questionText = "李明平时对待写作业的态度是怎样的？ (Bagaimana sikap Li Ming terhadap pekerjaan rumah?)",
                    options = listOf("非常喜欢，主动完成 (Sangat suka dan inisiatif)", "非常不喜欢做作业 (Sangat tidak suka mengerjakan PR)", "天天在学校写完 (Selalu selesai di sekolah)", "让同学帮忙做 (Minta teman mengerjakannya)"),
                    correctAnswerIndex = 1,
                    explanation = "Teks menyebutkan '非常不喜欢做作业' (sangat tidak suka mengerjakan PR)."
                ),
                StoryQuestion(
                    id = "q_dothing_2",
                    questionText = "妈妈告诉李明一个什么做事的道理？ (Nasihat apa yang disampaikan ibu tentang cara menyelesaikan urusan?)",
                    options = listOf("明天再做也不迟 (Besok pun belum terlambat)", "今天的事情要今天完成，不要留到明天 (Urusan hari ini harus selesai hari ini, jangan tunda ke esok hari)", "作业不用全做 (PR tidak usah dikerjakan semua)", "可以让别人替你做 (Bisa menyuruh orang lain mengerjakannya)"),
                    correctAnswerIndex = 1,
                    explanation = "Prinsip disiplin tidak menunda pekerjaan hingga keesokan harinya."
                ),
                StoryQuestion(
                    id = "q_dothing_3",
                    questionText = "李明最后借用妈妈的话提出了什么要求？ (Permintaan apa yang diajukan Li Ming dengan meminjam kata-kata ibunya?)",
                    options = listOf("要买新玩具 (Minta beli mainan baru)", "要把今天的蛋糕今天吃完 (Meminta kue agar dihabiskan hari ini juga)", "要出去踢足球 (Minta izin main sepak bola)", "要买新衣服 (Minta baju baru)"),
                    correctAnswerIndex = 1,
                    explanation = "Li Ming berdalih kue itu untuk hari ini jadi harus dihabiskan hari ini juga."
                ),
                StoryQuestion(
                    id = "q_dothing_4",
                    questionText = "从故事中可以看出李明是一个怎样的孩子？ (Sifat apa yang tercermin dari sosok Li Ming dalam cerita?)",
                    options = listOf("笨拙呆板 (Kaku dan bodoh)", "机灵逗趣但需要引导学习自律 (Cerdik lucu namun perlu diarahkan untuk disiplin)", "特别勤劳 (Sangat rajin bekerja)", "害怕妈妈 (Sangat penakut)"),
                    correctAnswerIndex = 1,
                    explanation = "Kepolosannya yang cerdik mencari celah menghadirkan kelucuan yang menggemaskan."
                )
            )
        ),
        // Cerita Mandarin Bean 111 (HSK 2): Ballet (Tarian Balet)
        Story(
            id = "story_ballet",
            titleHanzi = "芭蕾舞",
            titlePinyin = "Bālěiwǔ",
            titleTranslation = "Ballet (Tarian Balet)",
            level = "HSK 2",
            category = "Seni & Hiburan",
            description = "Kepolosan seorang anak kecil yang heran mengapa penari balet harus bersusah payah menari dengan ujung jari kaki.",
            coverEmoji = "🩰",
            coverImageRes = R.drawable.cover_story_ballet,
            estimatedReadMinutes = 2,
            sentences = listOf(
                Sentence(
                    id = "s_ballet_1",
                    hanzi = "有一天,小明的妈妈带小明去看芭蕾舞表演。",
                    pinyin = "yǒu yī tiān xiǎo míng de mā ma dài xiǎo míng qù kàn bā lěi wǔ biǎo yǎn",
                    translation = "Suatu hari, ibu Xiao Ming mengajak Xiao Ming pergi menonton pertunjukan balet.",
                    tokens = listOf(
                        WordToken("有", "yǒu", "To have; there is", "Kosakata HSK 2: 有 (yǒu)"),
                        WordToken("一天", "yī tiān", "One day; a day", "Kosakata HSK 2: 一天 (yī tiān)"),
                        WordToken("小明", "xiǎo míng", "A placeholder personal name, literally “little ming”; often used like “john doe” in examples", "Kosakata HSK 2: 小明 (xiǎo míng)"),
                        WordToken("的", "de", "Possessive particle (of; &#x27;s)", "Kosakata HSK 2: 的 (de)"),
                        WordToken("妈妈", "mā ma", "Mama", "Kosakata HSK 2: 妈妈 (mā ma)"),
                        WordToken("带", "dài", "To wear", "Kosakata HSK 2: 带 (dài)"),
                        WordToken("小明", "xiǎo míng", "A placeholder personal name, literally “little ming”; often used like “john doe” in examples", "Kosakata HSK 2: 小明 (xiǎo míng)"),
                        WordToken("去", "qù", "To go, to go to", "Kosakata HSK 2: 去 (qù)"),
                        WordToken("看", "kàn", "To see; to look at", "Kosakata HSK 2: 看 (kàn)"),
                        WordToken("芭蕾舞", "bā lěi wǔ", "Ballet (loanword)", "Kosakata HSK 2: 芭蕾舞 (bā lěi wǔ)"),
                        WordToken("表演", "biǎo yǎn", "Play", "Kosakata HSK 2: 表演 (biǎo yǎn)")
                    )
                ),
                Sentence(
                    id = "s_ballet_2",
                    hanzi = "小明很喜欢看表演，所以他非常高兴。",
                    pinyin = "xiǎo míng hěn xǐ huan kàn biǎo yǎn suǒ yǐ tā fēi cháng gāo xìng",
                    translation = "Xiao Ming sangat suka menonton pertunjukan pentas, jadi dia merasa sangat gembira.",
                    tokens = listOf(
                        WordToken("小明", "xiǎo míng", "A placeholder personal name, literally “little ming”; often used like “john doe” in examples", "Kosakata HSK 2: 小明 (xiǎo míng)"),
                        WordToken("很", "hěn", "Very; quite", "Kosakata HSK 2: 很 (hěn)"),
                        WordToken("喜欢", "xǐ huan", "To like; to be fond of", "Kosakata HSK 2: 喜欢 (xǐ huan)"),
                        WordToken("看", "kàn", "To see; to look at", "Kosakata HSK 2: 看 (kàn)"),
                        WordToken("表演", "biǎo yǎn", "Play", "Kosakata HSK 2: 表演 (biǎo yǎn)"),
                        WordToken("所以", "suǒ yǐ", "Therefore", "Kosakata HSK 2: 所以 (suǒ yǐ)"),
                        WordToken("他", "tā", "He; him; his", "Kosakata HSK 2: 他 (tā)"),
                        WordToken("非常", "fēi cháng", "Very; really", "Kosakata HSK 2: 非常 (fēi cháng)"),
                        WordToken("高兴", "gāo xìng", "Happy", "Kosakata HSK 2: 高兴 (gāo xìng)")
                    )
                ),
                Sentence(
                    id = "s_ballet_3",
                    hanzi = "但是他看见演员们都踮着脚跳舞,就问妈妈：\"妈妈，演员踮着脚跳舞多累啊，他们为什么不找一些高一点儿的演员呢?”",
                    pinyin = "dàn shì tā kàn jiàn yǎn yuán men dōu diǎn zhe jiǎo tiào wǔ jiù wèn mā ma mā ma yǎn yuán diǎn zhe jiǎo tiào wǔ duō lèi a tā men wèi shén me bù zhǎo yī xiē gāo yī diǎn r de yǎn yuán ne",
                    translation = "Namun ketika melihat para penari semuanya berjinjit saat menari, dia bertanya kepada ibunya: “Ibu, menari sambil berjinjit kan sangat melelahkan, kenapa mereka tidak mencari penari yang badannya lebih tinggi saja?”",
                    tokens = listOf(
                        WordToken("但是", "dàn shì", "But; however", "Kosakata HSK 2: 但是 (dàn shì)"),
                        WordToken("他", "tā", "He; him; his", "Kosakata HSK 2: 他 (tā)"),
                        WordToken("看见", "kàn jiàn", "To see; to catch sight of", "Kosakata HSK 2: 看见 (kàn jiàn)"),
                        WordToken("演员", "yǎn yuán", "Actor; actress; performer", "Kosakata HSK 2: 演员 (yǎn yuán)"),
                        WordToken("们", "men", "Plural marker for pronouns, and nouns referring to individuals", "Kosakata HSK 2: 们 (men)"),
                        WordToken("都", "dōu", "All; both; entirely", "Kosakata HSK 2: 都 (dōu)"),
                        WordToken("踮", "diǎn", "To stand on tiptoe", "Kosakata HSK 2: 踮 (diǎn)"),
                        WordToken("着", "zhe", "Aspect particle indicating action in progress or ongoing state", "Kosakata HSK 2: 着 (zhe)"),
                        WordToken("脚", "jiǎo", "Foot", "Kosakata HSK 2: 脚 (jiǎo)"),
                        WordToken("跳舞", "tiào wǔ", "To dance", "Kosakata HSK 2: 跳舞 (tiào wǔ)"),
                        WordToken("就", "jiù", "In that case; then", "Kosakata HSK 2: 就 (jiù)"),
                        WordToken("问", "wèn", "To ask; to inquire", "Kosakata HSK 2: 问 (wèn)"),
                        WordToken("妈妈", "mā ma", "Mama", "Kosakata HSK 2: 妈妈 (mā ma)"),
                        WordToken("妈妈", "mā ma", "Mama", "Kosakata HSK 2: 妈妈 (mā ma)"),
                        WordToken("演员", "yǎn yuán", "Actor; actress; performer", "Kosakata HSK 2: 演员 (yǎn yuán)"),
                        WordToken("踮", "diǎn", "To stand on tiptoe", "Kosakata HSK 2: 踮 (diǎn)"),
                        WordToken("着", "zhe", "Aspect particle indicating action in progress or ongoing state", "Kosakata HSK 2: 着 (zhe)"),
                        WordToken("脚", "jiǎo", "Foot", "Kosakata HSK 2: 脚 (jiǎo)"),
                        WordToken("跳舞", "tiào wǔ", "To dance", "Kosakata HSK 2: 跳舞 (tiào wǔ)"),
                        WordToken("多", "duō", "How (to what extent)", "Kosakata HSK 2: 多 (duō)"),
                        WordToken("累", "lèi", "Tired", "Kosakata HSK 2: 累 (lèi)"),
                        WordToken("啊", "a", "Modal particle ending sentence, showing affirmation, approval, or consent", "Kosakata HSK 2: 啊 (a)"),
                        WordToken("他们", "tā men", "They; them", "Kosakata HSK 2: 他们 (tā men)"),
                        WordToken("为什么", "wèi shén me", "Why?", "Kosakata HSK 2: 为什么 (wèi shén me)"),
                        WordToken("不", "bù", "No; not so", "Kosakata HSK 2: 不 (bù)"),
                        WordToken("找", "zhǎo", "To try to find", "Kosakata HSK 2: 找 (zhǎo)"),
                        WordToken("一些", "yī xiē", "Some; a few; a little; (following an adjective) slightly ...er", "Kosakata HSK 2: 一些 (yī xiē)"),
                        WordToken("高", "gāo", "High", "Kosakata HSK 2: 高 (gāo)"),
                        WordToken("一点儿", "yī diǎn r", "Erhua", "Kosakata HSK 2: 一点儿 (yī diǎn r)"),
                        WordToken("的", "de", "Possessive particle (of; &#x27;s)", "Kosakata HSK 2: 的 (de)"),
                        WordToken("演员", "yǎn yuán", "Actor; actress; performer", "Kosakata HSK 2: 演员 (yǎn yuán)"),
                        WordToken("呢", "ne", "(sentence-final particle) used in questions to link back to prior discourse or context (&quot;what about...?&quot;, &quot;and...?&quot;)", "Kosakata HSK 2: 呢 (ne)")
                    )
                ),
                Sentence(
                    id = "s_ballet_4",
                    hanzi = "妈妈笑着回答：\"傻孩子，芭蕾舞就是一种用脚尖跳的舞蹈！”",
                    pinyin = "mā ma xiào zhe huí dá shǎ hái zi bā lěi wǔ jiù shì yī zhǒng yòng jiǎo jiān tiào de wǔ dǎo",
                    translation = "Ibu tersenyum geli menjawab: “Anak pintar, tarian balet itu memang jenis tarian yang ditarikan dengan ujung jari kaki!”",
                    tokens = listOf(
                        WordToken("妈妈", "mā ma", "Mama", "Kosakata HSK 2: 妈妈 (mā ma)"),
                        WordToken("笑", "xiào", "To laugh; to smile", "Kosakata HSK 2: 笑 (xiào)"),
                        WordToken("着", "zhe", "Aspect particle indicating action in progress or ongoing state", "Kosakata HSK 2: 着 (zhe)"),
                        WordToken("回答", "huí dá", "To reply; to answer", "Kosakata HSK 2: 回答 (huí dá)"),
                        WordToken("傻", "shǎ", "Foolish", "Kosakata HSK 2: 傻 (shǎ)"),
                        WordToken("孩子", "hái zi", "Child", "Kosakata HSK 2: 孩子 (hái zi)"),
                        WordToken("芭蕾舞", "bā lěi wǔ", "Ballet (loanword)", "Kosakata HSK 2: 芭蕾舞 (bā lěi wǔ)"),
                        WordToken("就", "jiù", "Merely; nothing else but; simply; just; precisely; exactly", "Kosakata HSK 2: 就 (jiù)"),
                        WordToken("是", "shì", "To be (followed by substantives only)", "Kosakata HSK 2: 是 (shì)"),
                        WordToken("一", "yī", "One", "Kosakata HSK 2: 一 (yī)"),
                        WordToken("种", "zhǒng", "Classifier for types, kinds, sorts", "Kosakata HSK 2: 种 (zhǒng)"),
                        WordToken("用", "yòng", "To use; to make use of; to employ", "Kosakata HSK 2: 用 (yòng)"),
                        WordToken("脚尖", "jiǎo jiān", "The extremity of the foot", "Kosakata HSK 2: 脚尖 (jiǎo jiān)"),
                        WordToken("跳", "tiào", "To jump", "Kosakata HSK 2: 跳 (tiào)"),
                        WordToken("的", "de", "Possessive particle (of; &#x27;s)", "Kosakata HSK 2: 的 (de)"),
                        WordToken("舞蹈", "wǔ dǎo", "Dance (performance art)", "Kosakata HSK 2: 舞蹈 (wǔ dǎo)")
                    )
                )
            ),
            questions = listOf(
                StoryQuestion(
                    id = "q_ballet_1",
                    questionText = "小明和妈妈一起去看了什么精彩表演？ (Pertunjukan apa yang ditonton Xiao Ming bersama ibunya?)",
                    options = listOf("京剧 (Opera Beijing)", "芭蕾舞表演 (Pertunjukan seni tari balet)", "杂技魔术 (Sirkus sulap)", "电影 (Film bioskop)"),
                    correctAnswerIndex = 1,
                    explanation = "Xiao Ming diajak ibunya menyaksikan pertunjukan tarian balet."
                ),
                StoryQuestion(
                    id = "q_ballet_2",
                    questionText = "小明看表演时产生了什么天真的疑问？ (Pertanyaan polos apa yang muncul di benak Xiao Ming saat menonton?)",
                    options = listOf("为什么演员不找一些更高一点儿的 (Kenapa tidak mencari penari yang berpostur lebih tinggi saja daripada harus jinjit)", "舞台为什么那么大 (Kenapa panggungnya sangat luas)", "音乐为什么那么响 (Kenapa musiknya sangat keras)", "衣服为什么是白色的 (Kenapa bajunya berwarna putih)"),
                    correctAnswerIndex = 0,
                    explanation = "Xiao Ming mengira penari berjinjit karena badannya kurang tinggi."
                ),
                StoryQuestion(
                    id = "q_ballet_3",
                    questionText = "芭蕾舞最显著的舞蹈艺术特征是什么？ (Ciri khas utama dari seni tari balet adalah?)",
                    options = listOf("坐在椅子上跳舞 (Menari di atas kursi)", "用脚尖和脚趾立地跳舞 (Menari dengan bertumpu pada ujung jari kaki/pointe)", "蒙着眼睛跳舞 (Menari dengan mata tertutup)", "在水里跳舞 (Menari di dalam air)"),
                    correctAnswerIndex = 1,
                    explanation = "Teknik khas tarian balet bertumpu pada ujung jari kaki yang anggun."
                ),
                StoryQuestion(
                    id = "q_ballet_4",
                    questionText = "妈妈听了小明的问题后有什么反应？ (Bagaimana reaksi ibu mendengar pertanyaan polos Xiao Ming?)",
                    options = listOf("非常生气地责备 (Memarahi dengan kesal)", "笑着给小明耐心解释 (Tersenyum geli lalu menerangkan dengan sabar)", "立刻带他离开 (Langsung membawanya pulang)", "假装没听见 (Pura-pura tidak mendengar)"),
                    correctAnswerIndex = 1,
                    explanation = "Ibu tersenyum maklum atas ketidaktahuan anak kecil."
                )
            )
        ),
        // Cerita Mandarin Bean 112 (HSK 2): Son and Daughter (Anak Laki-laki dan Anak Perempuan)
        Story(
            id = "story_son_and_daughter",
            titleHanzi = "儿子和女儿",
            titlePinyin = "Érzi hé Nǚ'ér",
            titleTranslation = "Son and Daughter (Anak Laki-laki dan Anak Perempuan)",
            level = "HSK 2",
            category = "Keluarga & Hubungan",
            description = "Satir tentang standar ganda seorang ibu mertua dalam menilai menantu perempuan vs menantu laki-lakinya.",
            coverEmoji = "👨‍👩‍👧‍👦",
            coverImageRes = R.drawable.cover_story_son_and_daughter,
            estimatedReadMinutes = 2,
            sentences = listOf(
                Sentence(
                    id = "s_sonandd_1",
                    hanzi = "有两个老太太在一起说话，她们中的一个问：“你儿子还好吧？”",
                    pinyin = "yǒu liǎng gè lǎo tài tai zài yī qǐ shuō huà tā men zhōng de yī gè wèn nǐ ér zi hái hǎo ba",
                    translation = "Dua orang wanita tua sedang duduk mengobrol bersama, salah satu dari mereka bertanya: “Bagaimana kabar anak laki-lakimu?”",
                    tokens = listOf(
                        WordToken("有", "yǒu", "To have; there is", "Kosakata HSK 2: 有 (yǒu)"),
                        WordToken("两", "liǎng", "Two", "Kosakata HSK 2: 两 (liǎng)"),
                        WordToken("个", "gè", "Classifier for people or objects in general", "Kosakata HSK 2: 个 (gè)"),
                        WordToken("老太太", "lǎo tài tai", "Elderly lady (respectful)", "Kosakata HSK 2: 老太太 (lǎo tài tai)"),
                        WordToken("在", "zài", "(of sb or sth) to be (located) at", "Kosakata HSK 2: 在 (zài)"),
                        WordToken("一起", "yī qǐ", "Together; in company (with)", "Kosakata HSK 2: 一起 (yī qǐ)"),
                        WordToken("说话", "shuō huà", "To speak", "Kosakata HSK 2: 说话 (shuō huà)"),
                        WordToken("她们", "tā men", "They; them (females)", "Kosakata HSK 2: 她们 (tā men)"),
                        WordToken("中", "zhōng", "Within; among; in", "Kosakata HSK 2: 中 (zhōng)"),
                        WordToken("的", "de", "Possessive particle (of; &#x27;s)", "Kosakata HSK 2: 的 (de)"),
                        WordToken("一", "yī", "One", "Kosakata HSK 2: 一 (yī)"),
                        WordToken("个", "gè", "Classifier for people or objects in general", "Kosakata HSK 2: 个 (gè)"),
                        WordToken("问", "wèn", "To ask; to inquire", "Kosakata HSK 2: 问 (wèn)"),
                        WordToken("你", "nǐ", "You", "Kosakata HSK 2: 你 (nǐ)"),
                        WordToken("儿子", "ér zi", "Son", "Kosakata HSK 2: 儿子 (ér zi)"),
                        WordToken("还", "hái", "Fairly, passably (good)", "Kosakata HSK 2: 还 (hái)"),
                        WordToken("好", "hǎo", "Good", "Kosakata HSK 2: 好 (hǎo)"),
                        WordToken("吧", "ba", "(modal particle indicating suggestion or surmise)", "Kosakata HSK 2: 吧 (ba)")
                    )
                ),
                Sentence(
                    id = "s_sonandd_2",
                    hanzi = "“真是不幸！”",
                    pinyin = "zhēn shì bù xìng",
                    translation = "“Sungguh malang nasibnya!”",
                    tokens = listOf(
                        WordToken("真", "zhēn", "Really", "Kosakata HSK 2: 真 (zhēn)"),
                        WordToken("是", "shì", "Indeed (used for emphasis)", "Kosakata HSK 2: 是 (shì)"),
                        WordToken("不幸", "bù xìng", "Unfortunate", "Kosakata HSK 2: 不幸 (bù xìng)")
                    )
                ),
                Sentence(
                    id = "s_sonandd_3",
                    hanzi = "老太太说：“他的老婆太不好了，不做饭、不洗衣服、不带孩子，天天就是睡觉，我儿子还每天做好饭，送到房间里给她吃呢！”",
                    pinyin = "lǎo tài tai shuō tā de lǎo po tài bù hǎo le bù zuò fàn bù xǐ yī fu bù dài hái zi tiān tiān jiù shì shuì jiào wǒ ér zi hái měi tiān zuò hǎo fàn sòng dào fáng jiān lǐ gěi tā chī ne",
                    translation = "Wanita tua itu mengeluh: “Istrinya sangat pemalas, tidak mau memasak, tidak mau mencuci baju, tidak mau mengurus anak, kerjaannya cuma tidur seharian; anak laki-laki saya bahkan setiap hari harus memasak makanan lalu mengantarkannya ke dalam kamar untuk dimakan istrinya!”",
                    tokens = listOf(
                        WordToken("老太太", "lǎo tài tai", "Elderly lady (respectful)", "Kosakata HSK 2: 老太太 (lǎo tài tai)"),
                        WordToken("说", "shuō", "To speak; to talk; to say", "Kosakata HSK 2: 说 (shuō)"),
                        WordToken("他", "tā", "He; him; his", "Kosakata HSK 2: 他 (tā)"),
                        WordToken("的", "de", "Possessive particle (of; &#x27;s)", "Kosakata HSK 2: 的 (de)"),
                        WordToken("老婆", "lǎo po", "(coll.) wife", "Kosakata HSK 2: 老婆 (lǎo po)"),
                        WordToken("太", "tài", "Too (much)", "Kosakata HSK 2: 太 (tài)"),
                        WordToken("不", "bù", "No; not so", "Kosakata HSK 2: 不 (bù)"),
                        WordToken("好", "hǎo", "Good", "Kosakata HSK 2: 好 (hǎo)"),
                        WordToken("了", "le", "(completed action marker)", "Kosakata HSK 2: 了 (le)"),
                        WordToken("不", "bù", "No; not so", "Kosakata HSK 2: 不 (bù)"),
                        WordToken("做饭", "zuò fàn", "To prepare a meal", "Kosakata HSK 2: 做饭 (zuò fàn)"),
                        WordToken("不", "bù", "No; not so", "Kosakata HSK 2: 不 (bù)"),
                        WordToken("洗", "xǐ", "To wash; to bathe", "Kosakata HSK 2: 洗 (xǐ)"),
                        WordToken("衣服", "yī fu", "Clothes", "Kosakata HSK 2: 衣服 (yī fu)"),
                        WordToken("不", "bù", "No; not so", "Kosakata HSK 2: 不 (bù)"),
                        WordToken("带", "dài", "To look after", "Kosakata HSK 2: 带 (dài)"),
                        WordToken("孩子", "hái zi", "Child", "Kosakata HSK 2: 孩子 (hái zi)"),
                        WordToken("天天", "tiān tiān", "Every day", "Kosakata HSK 2: 天天 (tiān tiān)"),
                        WordToken("就是", "jiù shì", "Exactly; precisely", "Kosakata HSK 2: 就是 (jiù shì)"),
                        WordToken("睡觉", "shuì jiào", "To go to bed", "Kosakata HSK 2: 睡觉 (shuì jiào)"),
                        WordToken("我", "wǒ", "I; me; my", "Kosakata HSK 2: 我 (wǒ)"),
                        WordToken("儿子", "ér zi", "Son", "Kosakata HSK 2: 儿子 (ér zi)"),
                        WordToken("还", "hái", "Still, still in progress, yet", "Kosakata HSK 2: 还 (hái)"),
                        WordToken("每", "měi", "Each", "Kosakata HSK 2: 每 (měi)"),
                        WordToken("天", "tiān", "Day", "Kosakata HSK 2: 天 (tiān)"),
                        WordToken("做好", "zuò hǎo", "To make or prepare well; to do well; to have something ready", "Kosakata HSK 2: 做好 (zuò hǎo)"),
                        WordToken("饭", "fàn", "Meal", "Kosakata HSK 2: 饭 (fàn)"),
                        WordToken("送", "sòng", "To send; to deliver; to transmit", "Kosakata HSK 2: 送 (sòng)"),
                        WordToken("到", "dào", "To reach; to arrive", "Kosakata HSK 2: 到 (dào)"),
                        WordToken("房间", "fáng jiān", "Room", "Kosakata HSK 2: 房间 (fáng jiān)"),
                        WordToken("里", "lǐ", "Lining", "Kosakata HSK 2: 里 (lǐ)"),
                        WordToken("给", "gěi", "To", "Kosakata HSK 2: 给 (gěi)"),
                        WordToken("她", "tā", "She", "Kosakata HSK 2: 她 (tā)"),
                        WordToken("吃", "chī", "To eat; to consume", "Kosakata HSK 2: 吃 (chī)"),
                        WordToken("呢", "ne", "(discourse particle) used to mark a slight pause or emphasis in speech", "Kosakata HSK 2: 呢 (ne)")
                    )
                ),
                Sentence(
                    id = "s_sonandd_4",
                    hanzi = "“那女儿呢？”",
                    pinyin = "nà nǚ ér ne",
                    translation = "“Lalu bagaimana dengan anak perempuanmu?” tanya temannya.",
                    tokens = listOf(
                        WordToken("那", "nà", "(specifier) that; the; those", "Kosakata HSK 2: 那 (nà)"),
                        WordToken("女儿", "nǚ ér", "Daughter", "Kosakata HSK 2: 女儿 (nǚ ér)"),
                        WordToken("呢", "ne", "(sentence-final particle) used in questions to link back to prior discourse or context (&quot;what about...?&quot;, &quot;and...?&quot;)", "Kosakata HSK 2: 呢 (ne)")
                    )
                ),
                Sentence(
                    id = "s_sonandd_5",
                    hanzi = "“那她可就好了。”",
                    pinyin = "nà tā kě jiù hǎo le",
                    translation = "“Wah, kalau anak perempuan saya sungguh sangat beruntung!”",
                    tokens = listOf(
                        WordToken("那", "nà", "Then (in that case)", "Kosakata HSK 2: 那 (nà)"),
                        WordToken("她", "tā", "She", "Kosakata HSK 2: 她 (tā)"),
                        WordToken("可", "kě", "(particle used for emphasis) certainly; very", "Kosakata HSK 2: 可 (kě)"),
                        WordToken("就", "jiù", "In that case; then", "Kosakata HSK 2: 就 (jiù)"),
                        WordToken("好", "hǎo", "To heal, to recover", "Kosakata HSK 2: 好 (hǎo)"),
                        WordToken("了", "le", "(completed action marker)", "Kosakata HSK 2: 了 (le)")
                    )
                ),
                Sentence(
                    id = "s_sonandd_6",
                    hanzi = "老太太笑了：“她有一个不错的老公。",
                    pinyin = "lǎo tài tai xiào le tā yǒu yī gè bù cuò de lǎo gōng",
                    translation = "Wanita tua itu tersenyum lebar: “Dia memiliki suami yang luar biasa baik.",
                    tokens = listOf(
                        WordToken("老太太", "lǎo tài tai", "Elderly lady (respectful)", "Kosakata HSK 2: 老太太 (lǎo tài tai)"),
                        WordToken("笑", "xiào", "To laugh; to smile", "Kosakata HSK 2: 笑 (xiào)"),
                        WordToken("了", "le", "(completed action marker)", "Kosakata HSK 2: 了 (le)"),
                        WordToken("她", "tā", "She", "Kosakata HSK 2: 她 (tā)"),
                        WordToken("有", "yǒu", "To have; there is", "Kosakata HSK 2: 有 (yǒu)"),
                        WordToken("一", "yī", "One", "Kosakata HSK 2: 一 (yī)"),
                        WordToken("个", "gè", "Classifier for people or objects in general", "Kosakata HSK 2: 个 (gè)"),
                        WordToken("不错", "bù cuò", "Not bad", "Kosakata HSK 2: 不错 (bù cuò)"),
                        WordToken("的", "de", "Possessive particle (of; &#x27;s)", "Kosakata HSK 2: 的 (de)"),
                        WordToken("老公", "lǎo gōng", "(coll.) husband", "Kosakata HSK 2: 老公 (lǎo gōng)")
                    )
                ),
                Sentence(
                    id = "s_sonandd_7",
                    hanzi = "所有的事都是老公来做，洗衣服、带孩子，她老公还每天做好饭，送到房间里给她吃呢！”",
                    pinyin = "suǒ yǒu de shì dōu shì lǎo gōng lái zuò xǐ yī fu dài hái zi tā lǎo gōng hái měi tiān zuò hǎo fàn sòng dào fáng jiān lǐ gěi tā chī ne",
                    translation = "Semua pekerjaan rumah suaminya yang mengerjakan: mencuci baju, mengasuh anak, bahkan suaminya setiap hari memasak makanan lezat lalu mengantarkannya ke dalam kamar untuk dimakan anak perempuan saya!”",
                    tokens = listOf(
                        WordToken("所有", "suǒ yǒu", "All", "Kosakata HSK 2: 所有 (suǒ yǒu)"),
                        WordToken("的", "de", "Possessive particle (of; &#x27;s)", "Kosakata HSK 2: 的 (de)"),
                        WordToken("事", "shì", "Matter", "Kosakata HSK 2: 事 (shì)"),
                        WordToken("都", "dōu", "All; both; entirely", "Kosakata HSK 2: 都 (dōu)"),
                        WordToken("是", "shì", "Indeed (used for emphasis)", "Kosakata HSK 2: 是 (shì)"),
                        WordToken("老公", "lǎo gōng", "(coll.) husband", "Kosakata HSK 2: 老公 (lǎo gōng)"),
                        WordToken("来", "lái", "(used as a substitute for a more specific verb)", "Kosakata HSK 2: 来 (lái)"),
                        WordToken("做", "zuò", "To do; to engage in; to hold (a party etc)", "Kosakata HSK 2: 做 (zuò)"),
                        WordToken("洗", "xǐ", "To wash; to bathe", "Kosakata HSK 2: 洗 (xǐ)"),
                        WordToken("衣服", "yī fu", "Clothes", "Kosakata HSK 2: 衣服 (yī fu)"),
                        WordToken("带", "dài", "To look after", "Kosakata HSK 2: 带 (dài)"),
                        WordToken("孩子", "hái zi", "Child", "Kosakata HSK 2: 孩子 (hái zi)"),
                        WordToken("她", "tā", "She", "Kosakata HSK 2: 她 (tā)"),
                        WordToken("老公", "lǎo gōng", "(coll.) husband", "Kosakata HSK 2: 老公 (lǎo gōng)"),
                        WordToken("还", "hái", "Still, still in progress, yet", "Kosakata HSK 2: 还 (hái)"),
                        WordToken("每天", "měi tiān", "Every day", "Kosakata HSK 2: 每天 (měi tiān)"),
                        WordToken("做好", "zuò hǎo", "To make or prepare well; to do well; to have something ready", "Kosakata HSK 2: 做好 (zuò hǎo)"),
                        WordToken("饭", "fàn", "Meal", "Kosakata HSK 2: 饭 (fàn)"),
                        WordToken("送", "sòng", "To send; to deliver; to transmit", "Kosakata HSK 2: 送 (sòng)"),
                        WordToken("到", "dào", "To reach; to arrive", "Kosakata HSK 2: 到 (dào)"),
                        WordToken("房间", "fáng jiān", "Room", "Kosakata HSK 2: 房间 (fáng jiān)"),
                        WordToken("里", "lǐ", "Lining", "Kosakata HSK 2: 里 (lǐ)"),
                        WordToken("给", "gěi", "To", "Kosakata HSK 2: 给 (gěi)"),
                        WordToken("她", "tā", "She", "Kosakata HSK 2: 她 (tā)"),
                        WordToken("吃", "chī", "To eat; to consume", "Kosakata HSK 2: 吃 (chī)"),
                        WordToken("呢", "ne", "(discourse particle) used to mark a slight pause or emphasis in speech", "Kosakata HSK 2: 呢 (ne)")
                    )
                )
            ),
            questions = listOf(
                StoryQuestion(
                    id = "q_sonandd_1",
                    questionText = "老太太觉得自己的儿子过得怎么样？ (Bagaimana pandangan wanita tua itu tentang kehidupan anak laki-lakinya?)",
                    options = listOf("非常幸福 (Sangat bahagia)", "真是不幸，娶了不做家务的老婆 (Sungguh malang, memperistri wanita yang tidak mau mengurus rumah)", "很有钱 (Sangat kaya raya)", "不用上班 (Tidak usah bekerja)"),
                    correctAnswerIndex = 1,
                    explanation = "Ibu itu mengeluh anaknya harus melayani menantunya."
                ),
                StoryQuestion(
                    id = "q_sonandd_2",
                    questionText = "老太太又是如何夸奖女儿的婚姻生活的？ (Bagaimana wanita tua itu memuji kehidupan rumah tangga putrinya?)",
                    options = listOf("夸女婿把所有家务全包了，伺候女儿很周到 (Memuji menantu prianya yang mengerjakan seluruh urusan rumah tangga)", "抱怨女婿太懒 (Mengeluhkan menantu prianya pemalas)", "劝女儿快离婚 (Menyuruh putrinya lekas bercerai)", "觉得女儿太辛苦 (Merasa putrinya terlalu lelah)"),
                    correctAnswerIndex = 0,
                    explanation = "Perlakuan yang sama persis justru dipuji setinggi langit ketika dilakukan menantu pria."
                ),
                StoryQuestion(
                    id = "q_sonandd_3",
                    questionText = "这个幽默小故事讽刺了生活中的什么现象？ (Fenomena sosial apa yang disindir dalam lelucon satir ini?)",
                    options = listOf("双重标准与偏袒心理 (Standar ganda dan sikap pilih kasih mertua)", "年轻人不爱做饭 (Anak muda malas memasak)", "老人喜欢散步 (Orang tua gemar jalan santai)", "洗衣服很麻烦 (Mencuci baju itu merepotkan)"),
                    correctAnswerIndex = 0,
                    explanation = "Standar ganda orang tua memandang situasi yang sama dari sudut kepentingan anaknya."
                ),
                StoryQuestion(
                    id = "q_sonandd_4",
                    questionText = "健康的家庭关系应当提倡怎样的观念？ (Pola pikir bijak apa yang selayaknya dibangun dalam keluarga?)",
                    options = listOf("互相体谅、分担责任与不偏不倚 (Saling pengertian, membagi beban rumah tangga, dan adil tanpa prasangka)", "谁赚钱多谁说了算 (Yang berpenghasilan lebih besar boleh berkuasa)", "男主外女主内不能变 (Aturan kaku tidak boleh berubah)", "只心疼自己的孩子 (Hanya memedulikan anak kandung sendiri)"),
                    correctAnswerIndex = 0,
                    explanation = "Saling menghargai dan adil mempererat kerukunan antar keluarga besar."
                )
            )
        ),
        // Cerita Mandarin Bean 113 (HSK 2): Sleep Earlier (Tidur Lebih Awal)
        Story(
            id = "story_sleep_earlier",
            titleHanzi = "早点儿睡觉",
            titlePinyin = "Zǎodiǎnr Shuìjiào",
            titleTranslation = "Sleep Earlier (Tidur Lebih Awal)",
            level = "HSK 2",
            category = "Kesehatan & Kebiasaan",
            description = "Humor tentang seseorang yang berniat tidur lebih awal tetapi justru bergadang berjam-jam hanya demi mengingat niatnya.",
            coverEmoji = "⏰",
            coverImageRes = R.drawable.cover_story_sleep_earlier,
            estimatedReadMinutes = 2,
            sentences = listOf(
                Sentence(
                    id = "s_sleepea_1",
                    hanzi = "哥哥今天很累，我问他为什么，他说昨天晚上睡得太晚了。",
                    pinyin = "gē ge jīn tiān hěn lèi wǒ wèn tā wèi shén me tā shuō zuó tiān wǎn shang shuì de tài wǎn le",
                    translation = "Hari ini kakak laki-laki tampak sangat kelelahan, saya bertanya kepadanya ada apa, dia menjawab bahwa tadi malam tidurnya terlalu larut.",
                    tokens = listOf(
                        WordToken("哥哥", "gē ge", "Older brother", "Kosakata HSK 2: 哥哥 (gē ge)"),
                        WordToken("今天", "jīn tiān", "Today", "Kosakata HSK 2: 今天 (jīn tiān)"),
                        WordToken("很", "hěn", "Very; quite", "Kosakata HSK 2: 很 (hěn)"),
                        WordToken("累", "lèi", "Tired", "Kosakata HSK 2: 累 (lèi)"),
                        WordToken("我", "wǒ", "I; me; my", "Kosakata HSK 2: 我 (wǒ)"),
                        WordToken("问", "wèn", "To ask; to inquire", "Kosakata HSK 2: 问 (wèn)"),
                        WordToken("他", "tā", "He; him; his", "Kosakata HSK 2: 他 (tā)"),
                        WordToken("为什么", "wèi shén me", "Why?", "Kosakata HSK 2: 为什么 (wèi shén me)"),
                        WordToken("他", "tā", "He; him; his", "Kosakata HSK 2: 他 (tā)"),
                        WordToken("说", "shuō", "To speak; to talk; to say", "Kosakata HSK 2: 说 (shuō)"),
                        WordToken("昨天", "zuó tiān", "Yesterday", "Kosakata HSK 2: 昨天 (zuó tiān)"),
                        WordToken("晚上", "wǎn shang", "Evening", "Kosakata HSK 2: 晚上 (wǎn shang)"),
                        WordToken("睡", "shuì", "To sleep", "Kosakata HSK 2: 睡 (shuì)"),
                        WordToken("得", "de", "Structural particle: used after a verb (or adjective as main verb), linking it to following phrase indicating effect, degree, possibility etc", "Kosakata HSK 2: 得 (de)"),
                        WordToken("太", "tài", "Too (much)", "Kosakata HSK 2: 太 (tài)"),
                        WordToken("晚", "wǎn", "Late", "Kosakata HSK 2: 晚 (wǎn)"),
                        WordToken("了", "le", "(completed action marker)", "Kosakata HSK 2: 了 (le)")
                    )
                ),
                Sentence(
                    id = "s_sleepea_2",
                    hanzi = "我觉得很奇怪，因为他昨天晚上9点就说要睡觉了。",
                    pinyin = "wǒ jué de hěn qí guài yīn wèi tā zuó tiān wǎn shang diǎn jiù shuō yào shuì jiào le",
                    translation = "Saya merasa heran, karena kemarin malam jam 9 dia sudah pamit hendak tidur.",
                    tokens = listOf(
                        WordToken("我", "wǒ", "I; me; my", "Kosakata HSK 2: 我 (wǒ)"),
                        WordToken("觉得", "jué de", "To think that ...; to feel that ...", "Kosakata HSK 2: 觉得 (jué de)"),
                        WordToken("很", "hěn", "Very; quite", "Kosakata HSK 2: 很 (hěn)"),
                        WordToken("奇怪", "qí guài", "Strange", "Kosakata HSK 2: 奇怪 (qí guài)"),
                        WordToken("因为", "yīn wèi", "Because; owing to; on account of", "Kosakata HSK 2: 因为 (yīn wèi)"),
                        WordToken("他", "tā", "He; him; his", "Kosakata HSK 2: 他 (tā)"),
                        WordToken("昨天", "zuó tiān", "Yesterday", "Kosakata HSK 2: 昨天 (zuó tiān)"),
                        WordToken("晚上", "wǎn shang", "Evening", "Kosakata HSK 2: 晚上 (wǎn shang)"),
                        WordToken("点", "diǎn", "Point; dot; spot; speck", "Kosakata HSK 2: 点 (diǎn)"),
                        WordToken("就", "jiù", "Merely; nothing else but; simply; just; precisely; exactly", "Kosakata HSK 2: 就 (jiù)"),
                        WordToken("说", "shuō", "To speak; to talk; to say", "Kosakata HSK 2: 说 (shuō)"),
                        WordToken("要", "yào", "Will; shall; about to", "Kosakata HSK 2: 要 (yào)"),
                        WordToken("睡觉", "shuì jiào", "To go to bed", "Kosakata HSK 2: 睡觉 (shuì jiào)"),
                        WordToken("了", "le", "(completed action marker)", "Kosakata HSK 2: 了 (le)")
                    )
                ),
                Sentence(
                    id = "s_sleepea_3",
                    hanzi = "他说在睡觉前想起来有一件事要做，可是忘记了是什么事情，想了很长时间，最后终于想起来了，这件事就是要早点儿上床睡觉。",
                    pinyin = "tā shuō zài shuì jiào qián xiǎng qǐ lái yǒu yī jiàn shì yào zuò kě shì wàng jì le shì shén me shì qing xiǎng le hěn cháng shí jiān zuì hòu zhōng yú xiǎng qǐ lái le zhè jiàn shì jiù shì yào zǎo diǎn r shàng chuáng shuì jiào",
                    translation = "Kakak menceritakan bahwa sebelum tidur dia teringat ada satu hal penting yang harus dikerjakan, tetapi lupa apa itu; setelah berpikir keras berjam-jam, akhirnya dia baru teringat: hal penting itu adalah harus lekas tidur lebih awal!",
                    tokens = listOf(
                        WordToken("他", "tā", "He; him; his", "Kosakata HSK 2: 他 (tā)"),
                        WordToken("说", "shuō", "To speak; to talk; to say", "Kosakata HSK 2: 说 (shuō)"),
                        WordToken("在", "zài", "(of sb or sth) to be (located) at", "Kosakata HSK 2: 在 (zài)"),
                        WordToken("睡觉", "shuì jiào", "To go to bed", "Kosakata HSK 2: 睡觉 (shuì jiào)"),
                        WordToken("前", "qián", "Ago", "Kosakata HSK 2: 前 (qián)"),
                        WordToken("想", "xiǎng", "To think (about)", "Kosakata HSK 2: 想 (xiǎng)"),
                        WordToken("起来", "qǐ lái", "Indicating the beginning and continuation of an action or a state", "Kosakata HSK 2: 起来 (qǐ lái)"),
                        WordToken("有", "yǒu", "To have; there is", "Kosakata HSK 2: 有 (yǒu)"),
                        WordToken("一", "yī", "One", "Kosakata HSK 2: 一 (yī)"),
                        WordToken("件", "jiàn", "Classifier for events, things, clothes etc", "Kosakata HSK 2: 件 (jiàn)"),
                        WordToken("事", "shì", "Matter", "Kosakata HSK 2: 事 (shì)"),
                        WordToken("要", "yào", "Will; shall; about to", "Kosakata HSK 2: 要 (yào)"),
                        WordToken("做", "zuò", "To do; to engage in; to hold (a party etc)", "Kosakata HSK 2: 做 (zuò)"),
                        WordToken("可是", "kě shì", "But; however", "Kosakata HSK 2: 可是 (kě shì)"),
                        WordToken("忘记", "wàng jì", "To forget", "Kosakata HSK 2: 忘记 (wàng jì)"),
                        WordToken("了", "le", "(completed action marker)", "Kosakata HSK 2: 了 (le)"),
                        WordToken("是", "shì", "To be (followed by substantives only)", "Kosakata HSK 2: 是 (shì)"),
                        WordToken("什么", "shén me", "What?", "Kosakata HSK 2: 什么 (shén me)"),
                        WordToken("事情", "shì qing", "Affair; matter; thing; business", "Kosakata HSK 2: 事情 (shì qing)"),
                        WordToken("想", "xiǎng", "To think (about)", "Kosakata HSK 2: 想 (xiǎng)"),
                        WordToken("了", "le", "(completed action marker)", "Kosakata HSK 2: 了 (le)"),
                        WordToken("很", "hěn", "Very; quite", "Kosakata HSK 2: 很 (hěn)"),
                        WordToken("长", "cháng", "Long", "Kosakata HSK 2: 长 (cháng)"),
                        WordToken("时间", "shí jiān", "Time", "Kosakata HSK 2: 时间 (shí jiān)"),
                        WordToken("最后", "zuì hòu", "Finally; in the end", "Kosakata HSK 2: 最后 (zuì hòu)"),
                        WordToken("终于", "zhōng yú", "At last", "Kosakata HSK 2: 终于 (zhōng yú)"),
                        WordToken("想", "xiǎng", "To think (about)", "Kosakata HSK 2: 想 (xiǎng)"),
                        WordToken("起来", "qǐ lái", "Indicating the beginning and continuation of an action or a state", "Kosakata HSK 2: 起来 (qǐ lái)"),
                        WordToken("了", "le", "(completed action marker)", "Kosakata HSK 2: 了 (le)"),
                        WordToken("这", "zhè", "This; these", "Kosakata HSK 2: 这 (zhè)"),
                        WordToken("件", "jiàn", "Classifier for events, things, clothes etc", "Kosakata HSK 2: 件 (jiàn)"),
                        WordToken("事", "shì", "Matter", "Kosakata HSK 2: 事 (shì)"),
                        WordToken("就", "jiù", "Merely; nothing else but; simply; just; precisely; exactly", "Kosakata HSK 2: 就 (jiù)"),
                        WordToken("是", "shì", "Indeed (used for emphasis)", "Kosakata HSK 2: 是 (shì)"),
                        WordToken("要", "yào", "Will; shall; about to", "Kosakata HSK 2: 要 (yào)"),
                        WordToken("早", "zǎo", "Early", "Kosakata HSK 2: 早 (zǎo)"),
                        WordToken("点儿", "diǎn r", "Erhua", "Kosakata HSK 2: 点儿 (diǎn r)"),
                        WordToken("上", "shàng", "To climb; to get onto; to go up", "Kosakata HSK 2: 上 (shàng)"),
                        WordToken("床", "chuáng", "Bed; couch (furniture that one can lie down on)", "Kosakata HSK 2: 床 (chuáng)"),
                        WordToken("睡觉", "shuì jiào", "To go to bed", "Kosakata HSK 2: 睡觉 (shuì jiào)")
                    )
                )
            ),
            questions = listOf(
                StoryQuestion(
                    id = "q_sleepea_1",
                    questionText = "哥哥今天白天的身体状态感觉如何？ (Bagaimana kondisi fisik sang kakak di siang hari dalam cerita?)",
                    options = listOf("精神抖擞 (Sangat bersemangat bugar)", "非常疲惫劳累 (Sangat kelelahan karena kurang tidur)", "生病发烧 (Sakit demam)", "非常兴奋 (Sangat gembira)"),
                    correctAnswerIndex = 1,
                    explanation = "Kakak merasa sangat capek akibat tidur terlalu larut malam."
                ),
                StoryQuestion(
                    id = "q_sleepea_2",
                    questionText = "哥哥昨天晚上原本打算几点睡觉？ (Pukul berapa sebenarnya sang kakak berencana tidur kemarin malam?)",
                    options = listOf("晚上九点钟 (Pukul sembilan malam)", "半夜十二点 (Pukul dua belas malam)", "凌晨三点 (Pukul tiga subuh)", "下午五点 (Pukul lima sore)"),
                    correctAnswerIndex = 0,
                    explanation = "Rencana awalnya sangat disiplin ingin tidur jam 21.00."
                ),
                StoryQuestion(
                    id = "q_sleepea_3",
                    questionText = "是什么事情让哥哥在床上苦苦思索了很久？ (Hal apa yang membuat kakak termenung keras di ranjang berjam-jam?)",
                    options = listOf("想着明天穿什么衣服 (Memikirkan baju apa yang dipakai besok)", "想一件忘记了的重要事情 (Mencoba mengingat satu hal penting yang terlupa)", "在算数学题 (Menghitung rumus matematika)", "背英语单词 (Menghafal kosakata bahasa Inggris)"),
                    correctAnswerIndex = 1,
                    explanation = "Ia merasa ada satu urusan penting yang mendesak untuk diselesaikan."
                ),
                StoryQuestion(
                    id = "q_sleepea_4",
                    questionText = "哥哥最后想起来的那件“重要事情”到底是什么？ (Apakah hal penting yang akhirnya diingat sang kakak?)",
                    options = listOf("把门关好 (Mengunci pintu rumah)", "早点儿上床睡觉 (Harus lekas pergi tidur lebih awal!)", "给手机充电 (Mengisi daya baterai ponsel)", "洗脸刷牙 (Mencuci muka dan sikat gigi)"),
                    correctAnswerIndex = 1,
                    explanation = "Puncak humor: menghabiskan waktu bergadang hanya untuk mengingat bahwa ia harus tidur lebih awal!"
                )
            )
        ),
        // Cerita Mandarin Bean 114 (HSK 2): My Bag (Tas Saya)
        Story(
            id = "story_my_bag",
            titleHanzi = "我的包",
            titlePinyin = "Wǒ de Bāo",
            titleTranslation = "My Bag (Tas Saya)",
            level = "HSK 2",
            category = "Humor & Transportasi",
            description = "Kecerdikan seorang kakek di bus kota menghadapi pemuda egois yang menduduki kursi kosong dengan tas bawaannya.",
            coverEmoji = "🎒",
            coverImageRes = R.drawable.cover_story_my_bag,
            estimatedReadMinutes = 2,
            sentences = listOf(
                Sentence(
                    id = "s_mybag_1",
                    hanzi = "今天公共汽车上有很多人。",
                    pinyin = "jīn tiān gōng gòng qì chē shàng yǒu hěn duō rén",
                    translation = "Hari ini di dalam bus kota ada banyak sekali penumpang.",
                    tokens = listOf(
                        WordToken("今天", "jīn tiān", "Today", "Kosakata HSK 2: 今天 (jīn tiān)"),
                        WordToken("公共", "gōng gòng", "Public; common; communal", "Kosakata HSK 2: 公共 (gōng gòng)"),
                        WordToken("汽车", "qì chē", "Car", "Kosakata HSK 2: 汽车 (qì chē)"),
                        WordToken("上", "shàng", "(noun suffix) on; above", "Kosakata HSK 2: 上 (shàng)"),
                        WordToken("有", "yǒu", "To have; there is", "Kosakata HSK 2: 有 (yǒu)"),
                        WordToken("很多", "hěn duō", "Many; a lot of", "Kosakata HSK 2: 很多 (hěn duō)"),
                        WordToken("人", "rén", "Person; people", "Kosakata HSK 2: 人 (rén)")
                    )
                ),
                Sentence(
                    id = "s_mybag_2",
                    hanzi = "一个老人上车后看见一个空座位，他走过去想坐。",
                    pinyin = "yī gè lǎo rén shàng chē hòu kàn jiàn yī gè kòng zuò wèi tā zǒu guò qù xiǎng zuò",
                    translation = "Seorang kakek tua naik ke bus dan melihat ada satu kursi kosong, dia melangkah ke sana hendak duduk.",
                    tokens = listOf(
                        WordToken("一", "yī", "One", "Kosakata HSK 2: 一 (yī)"),
                        WordToken("个", "gè", "Classifier for people or objects in general", "Kosakata HSK 2: 个 (gè)"),
                        WordToken("老", "lǎo", "Old (of people)", "Kosakata HSK 2: 老 (lǎo)"),
                        WordToken("人", "rén", "Person; people", "Kosakata HSK 2: 人 (rén)"),
                        WordToken("上", "shàng", "To climb; to get onto; to go up", "Kosakata HSK 2: 上 (shàng)"),
                        WordToken("车", "chē", "Car", "Kosakata HSK 2: 车 (chē)"),
                        WordToken("后", "hòu", "Afterwards", "Kosakata HSK 2: 后 (hòu)"),
                        WordToken("看见", "kàn jiàn", "To see; to catch sight of", "Kosakata HSK 2: 看见 (kàn jiàn)"),
                        WordToken("一", "yī", "One", "Kosakata HSK 2: 一 (yī)"),
                        WordToken("个", "gè", "Classifier for people or objects in general", "Kosakata HSK 2: 个 (gè)"),
                        WordToken("空", "kòng", "Vacant", "Kosakata HSK 2: 空 (kòng)"),
                        WordToken("座位", "zuò wèi", "Seat", "Kosakata HSK 2: 座位 (zuò wèi)"),
                        WordToken("他", "tā", "He; him; his", "Kosakata HSK 2: 他 (tā)"),
                        WordToken("走", "zǒu", "To walk", "Kosakata HSK 2: 走 (zǒu)"),
                        WordToken("过", "guò", "To cross", "Kosakata HSK 2: 过 (guò)"),
                        WordToken("去", "qù", "(after a verb of motion) movement away from the speaker; (after certain verbs) detachment or separation", "Kosakata HSK 2: 去 (qù)"),
                        WordToken("想", "xiǎng", "To desire; to want (to)", "Kosakata HSK 2: 想 (xiǎng)"),
                        WordToken("坐", "zuò", "To sit", "Kosakata HSK 2: 坐 (zuò)")
                    )
                ),
                Sentence(
                    id = "s_mybag_3",
                    hanzi = "但是一个小包在空座位上，一个年轻人坐在旁边。",
                    pinyin = "dàn shì yī gè xiǎo bāo zài kòng zuò wèi shàng yī gè nián qīng rén zuò zài páng biān",
                    translation = "Namun ada sebuah tas kecil ditaruh di atas kursi kosong itu, dan seorang pemuda duduk di sebelahnya.",
                    tokens = listOf(
                        WordToken("但是", "dàn shì", "But; however", "Kosakata HSK 2: 但是 (dàn shì)"),
                        WordToken("一", "yī", "One", "Kosakata HSK 2: 一 (yī)"),
                        WordToken("个", "gè", "Classifier for people or objects in general", "Kosakata HSK 2: 个 (gè)"),
                        WordToken("小", "xiǎo", "Small", "Kosakata HSK 2: 小 (xiǎo)"),
                        WordToken("包", "bāo", "Package", "Kosakata HSK 2: 包 (bāo)"),
                        WordToken("在", "zài", "(of sb or sth) to be (located) at", "Kosakata HSK 2: 在 (zài)"),
                        WordToken("空", "kòng", "Vacant", "Kosakata HSK 2: 空 (kòng)"),
                        WordToken("座位", "zuò wèi", "Seat", "Kosakata HSK 2: 座位 (zuò wèi)"),
                        WordToken("上", "shàng", "(noun suffix) on; above", "Kosakata HSK 2: 上 (shàng)"),
                        WordToken("一", "yī", "One", "Kosakata HSK 2: 一 (yī)"),
                        WordToken("个", "gè", "Classifier for people or objects in general", "Kosakata HSK 2: 个 (gè)"),
                        WordToken("年轻", "nián qīng", "Young", "Kosakata HSK 2: 年轻 (nián qīng)"),
                        WordToken("人", "rén", "Person; people", "Kosakata HSK 2: 人 (rén)"),
                        WordToken("坐", "zuò", "To sit", "Kosakata HSK 2: 坐 (zuò)"),
                        WordToken("在", "zài", "(of sb or sth) to be (located) at", "Kosakata HSK 2: 在 (zài)"),
                        WordToken("旁边", "páng biān", "Side; adjacent place", "Kosakata HSK 2: 旁边 (páng biān)")
                    )
                ),
                Sentence(
                    id = "s_mybag_4",
                    hanzi = "老人问：这个座位有人吗？",
                    pinyin = "lǎo rén wèn zhè gè zuò wèi yǒu rén ma",
                    translation = "Kakek itu bertanya: “Apakah kursi ini ada orangnya?”",
                    tokens = listOf(
                        WordToken("老", "lǎo", "Old (of people)", "Kosakata HSK 2: 老 (lǎo)"),
                        WordToken("人", "rén", "Person; people", "Kosakata HSK 2: 人 (rén)"),
                        WordToken("问", "wèn", "To ask; to inquire", "Kosakata HSK 2: 问 (wèn)"),
                        WordToken("这", "zhè", "This; these", "Kosakata HSK 2: 这 (zhè)"),
                        WordToken("个", "gè", "Classifier for people or objects in general", "Kosakata HSK 2: 个 (gè)"),
                        WordToken("座位", "zuò wèi", "Seat", "Kosakata HSK 2: 座位 (zuò wèi)"),
                        WordToken("有", "yǒu", "To have; there is", "Kosakata HSK 2: 有 (yǒu)"),
                        WordToken("人", "rén", "Person; people", "Kosakata HSK 2: 人 (rén)"),
                        WordToken("吗", "ma", "(question particle for &quot;yes-no&quot; questions)", "Kosakata HSK 2: 吗 (ma)")
                    )
                ),
                Sentence(
                    id = "s_mybag_5",
                    hanzi = "年轻人说：有，这是一个老太太的座位。",
                    pinyin = "nián qīng rén shuō yǒu zhè shì yī gè lǎo tài tai de zuò wèi",
                    translation = "Pemuda itu menjawab: “Ada, ini kursi milik seorang nenek tua.",
                    tokens = listOf(
                        WordToken("年轻", "nián qīng", "Young", "Kosakata HSK 2: 年轻 (nián qīng)"),
                        WordToken("人", "rén", "Person; people", "Kosakata HSK 2: 人 (rén)"),
                        WordToken("说", "shuō", "To speak; to talk; to say", "Kosakata HSK 2: 说 (shuō)"),
                        WordToken("有", "yǒu", "To have; there is", "Kosakata HSK 2: 有 (yǒu)"),
                        WordToken("这", "zhè", "This; these", "Kosakata HSK 2: 这 (zhè)"),
                        WordToken("是", "shì", "To be (followed by substantives only)", "Kosakata HSK 2: 是 (shì)"),
                        WordToken("一", "yī", "One", "Kosakata HSK 2: 一 (yī)"),
                        WordToken("个", "gè", "Classifier for people or objects in general", "Kosakata HSK 2: 个 (gè)"),
                        WordToken("老", "lǎo", "Old (of people)", "Kosakata HSK 2: 老 (lǎo)"),
                        WordToken("太太", "tài tai", "Married woman", "Kosakata HSK 2: 太太 (tài tai)"),
                        WordToken("的", "de", "Possessive particle (of; &#x27;s)", "Kosakata HSK 2: 的 (de)"),
                        WordToken("座位", "zuò wèi", "Seat", "Kosakata HSK 2: 座位 (zuò wèi)")
                    )
                ),
                Sentence(
                    id = "s_mybag_6",
                    hanzi = "她买东西去了。",
                    pinyin = "tā mǎi dōng xi qù le",
                    translation = "Dia sedang turun belanja sebentar.”",
                    tokens = listOf(
                        WordToken("她", "tā", "She", "Kosakata HSK 2: 她 (tā)"),
                        WordToken("买", "mǎi", "To buy", "Kosakata HSK 2: 买 (mǎi)"),
                        WordToken("东西", "dōng xi", "Thing", "Kosakata HSK 2: 东西 (dōng xi)"),
                        WordToken("去", "qù", "(after a verb of motion) movement away from the speaker; (after certain verbs) detachment or separation", "Kosakata HSK 2: 去 (qù)"),
                        WordToken("了", "le", "(completed action marker)", "Kosakata HSK 2: 了 (le)")
                    )
                ),
                Sentence(
                    id = "s_mybag_7",
                    hanzi = "但是汽车开了，也没有人回来。",
                    pinyin = "dàn shì qì chē kāi le yě méi yǒu rén huí lái",
                    translation = "Namun bus mulai melaju jalan, dan tidak ada seorang pun yang kembali.",
                    tokens = listOf(
                        WordToken("但是", "dàn shì", "But; however", "Kosakata HSK 2: 但是 (dàn shì)"),
                        WordToken("汽车", "qì chē", "Car", "Kosakata HSK 2: 汽车 (qì chē)"),
                        WordToken("开", "kāi", "(of ships, vehicles, troops etc) to start", "Kosakata HSK 2: 开 (kāi)"),
                        WordToken("了", "le", "(completed action marker)", "Kosakata HSK 2: 了 (le)"),
                        WordToken("也", "yě", "Also; too; as well; (not ...) either", "Kosakata HSK 2: 也 (yě)"),
                        WordToken("没有", "méi yǒu", "Doesn&#x27;t exist", "Kosakata HSK 2: 没有 (méi yǒu)"),
                        WordToken("人", "rén", "Person; people", "Kosakata HSK 2: 人 (rén)"),
                        WordToken("回来", "huí lái", "To return; to come back", "Kosakata HSK 2: 回来 (huí lái)")
                    )
                ),
                Sentence(
                    id = "s_mybag_8",
                    hanzi = "老人说：她还没回来，可是她的包还在这，我们扔到外面还给她吧！",
                    pinyin = "lǎo rén shuō tā hái méi huí lái kě shì tā de bāo hái zài zhè wǒ men rēng dào wài miàn huán gěi tā ba",
                    translation = "Kakek itu berkata: “Nenek itu belum kembali tapi tasnya tertinggal di sini, mari kita lempar tas ini ke luar jendela agar kembali kepadanya!”",
                    tokens = listOf(
                        WordToken("老", "lǎo", "Old (of people)", "Kosakata HSK 2: 老 (lǎo)"),
                        WordToken("人", "rén", "Person; people", "Kosakata HSK 2: 人 (rén)"),
                        WordToken("说", "shuō", "To speak; to talk; to say", "Kosakata HSK 2: 说 (shuō)"),
                        WordToken("她", "tā", "She", "Kosakata HSK 2: 她 (tā)"),
                        WordToken("还", "hái", "Still, still in progress, yet", "Kosakata HSK 2: 还 (hái)"),
                        WordToken("没", "méi", "(negative prefix for verbs) have not; not", "Kosakata HSK 2: 没 (méi)"),
                        WordToken("回来", "huí lái", "To return; to come back", "Kosakata HSK 2: 回来 (huí lái)"),
                        WordToken("可是", "kě shì", "But; however", "Kosakata HSK 2: 可是 (kě shì)"),
                        WordToken("她", "tā", "She", "Kosakata HSK 2: 她 (tā)"),
                        WordToken("的", "de", "Possessive particle (of; &#x27;s)", "Kosakata HSK 2: 的 (de)"),
                        WordToken("包", "bāo", "Package", "Kosakata HSK 2: 包 (bāo)"),
                        WordToken("还", "hái", "Still, still in progress, yet", "Kosakata HSK 2: 还 (hái)"),
                        WordToken("在", "zài", "(of sb or sth) to be (located) at", "Kosakata HSK 2: 在 (zài)"),
                        WordToken("这", "zhè", "Here", "Kosakata HSK 2: 这 (zhè)"),
                        WordToken("我们", "wǒ men", "We; us; ourselves; our", "Kosakata HSK 2: 我们 (wǒ men)"),
                        WordToken("扔", "rēng", "To throw", "Kosakata HSK 2: 扔 (rēng)"),
                        WordToken("到", "dào", "To reach; to arrive", "Kosakata HSK 2: 到 (dào)"),
                        WordToken("外面", "wài miàn", "Outside", "Kosakata HSK 2: 外面 (wài miàn)"),
                        WordToken("还", "huán", "To pay back", "Kosakata HSK 2: 还 (huán)"),
                        WordToken("给", "gěi", "To", "Kosakata HSK 2: 给 (gěi)"),
                        WordToken("她", "tā", "She", "Kosakata HSK 2: 她 (tā)"),
                        WordToken("吧", "ba", "(modal particle indicating suggestion or surmise)", "Kosakata HSK 2: 吧 (ba)")
                    )
                ),
                Sentence(
                    id = "s_mybag_9",
                    hanzi = "年轻人大叫：不！",
                    pinyin = "nián qīng rén dà jiào bù",
                    translation = "Pemuda itu langsung berteriak panik: “Jangan!",
                    tokens = listOf(
                        WordToken("年轻", "nián qīng", "Young", "Kosakata HSK 2: 年轻 (nián qīng)"),
                        WordToken("人", "rén", "Person; people", "Kosakata HSK 2: 人 (rén)"),
                        WordToken("大", "dà", "Greatly; freely; fully", "Kosakata HSK 2: 大 (dà)"),
                        WordToken("叫", "jiào", "To shout", "Kosakata HSK 2: 叫 (jiào)"),
                        WordToken("不", "bù", "No; not so", "Kosakata HSK 2: 不 (bù)")
                    )
                ),
                Sentence(
                    id = "s_mybag_10",
                    hanzi = "那是我的包！",
                    pinyin = "nà shì wǒ de bāo",
                    translation = "Itu tas milik saya!”",
                    tokens = listOf(
                        WordToken("那", "nà", "(specifier) that; the; those", "Kosakata HSK 2: 那 (nà)"),
                        WordToken("是", "shì", "To be (followed by substantives only)", "Kosakata HSK 2: 是 (shì)"),
                        WordToken("我", "wǒ", "I; me; my", "Kosakata HSK 2: 我 (wǒ)"),
                        WordToken("的", "de", "Possessive particle (of; &#x27;s)", "Kosakata HSK 2: 的 (de)"),
                        WordToken("包", "bāo", "Package", "Kosakata HSK 2: 包 (bāo)")
                    )
                )
            ),
            questions = listOf(
                StoryQuestion(
                    id = "q_mybag_1",
                    questionText = "老人上公共汽车后为什么没能马上坐下？ (Mengapa kakek tua itu tidak bisa langsung duduk di kursi kosong?)",
                    options = listOf("因为椅子坏了 (Karena kursinya rusak)", "因为座位上放着一个包，旁边年轻人说是别人的 (Karena kursi diduduki tas kecil dan pemuda bilang itu milik orang lain)", "因为司机不让坐 (Karena sopir melarang duduk)", "因为车上没有空位 (Karena bus penuh tanpa kursi kosong)"),
                    correctAnswerIndex = 1,
                    explanation = "Pemuda sengaja menaruh tas untuk memblokir kursi demi kenyamanan pribadinya."
                ),
                StoryQuestion(
                    id = "q_mybag_2",
                    questionText = "车开走后，老人提出了一个什么机智的建议？ (Usulan cerdik apa yang dilontarkan kakek saat bus melaju jalan?)",
                    options = listOf("把包扔到窗外还给“老太太” (Melempar tas itu ke luar jendela agar kembali ke pemiliknya)", "报警抓小偷 (Lapor polisi)", "自己站着不管 (Memilih berdiri pasrah)", "坐在年轻人的腿上 (Duduk di pangkuan pemuda)"),
                    correctAnswerIndex = 0,
                    explanation = "Strategi cerdik kakek untuk memaksa pemilik tas mengakui kepemilikannya."
                ),
                StoryQuestion(
                    id = "q_mybag_3",
                    questionText = "年轻人听到要把包扔出去后反应如何？ (Bagaimana reaksi pemuda itu mendengar usulan kakek?)",
                    options = listOf("大喊不要扔，那是我的包 (Berteriak panik melarang dan mengaku itu tas miliknya)", "冷眼旁观 (Menonton dengan acuh)", "高兴地拍手 (Bertepuk tangan senang)", "立刻跳车 (Langsung melompat dari bus)"),
                    correctAnswerIndex = 0,
                    explanation = "Kepura-puraannya langsung terbongkar karena takut tasnya dibuang."
                ),
                StoryQuestion(
                    id = "q_mybag_4",
                    questionText = "这个故事给我们的社会公德启示是什么？ (Pesan moral etika umum apa yang dipetik dari cerita ini?)",
                    options = listOf("在公共场所切勿自私占座，应当主动尊老爱幼 (Jangan egois memonopoli fasilitas umum, hormati orang tua dan utamakan yang membutuhkan)", "出门不要带包 (Jangan bawa tas saat bepergian)", "老人不该坐公交车 (Orang tua tidak boleh naik bus kota)", "有空位就抢 (Rebutan kursi kosong sekuat tenaga)"),
                    correctAnswerIndex = 0,
                    explanation = "Menjaga sopan santun dan fasilitas bersama di moda transportasi publik."
                )
            )
        ),
        // Cerita Mandarin Bean 115 (HSK 2): Lend Money (Meminjamkan Uang)
        Story(
            id = "story_lend_money",
            titleHanzi = "借钱",
            titlePinyin = "Jiè Qián",
            titleTranslation = "Lend Money (Meminjamkan Uang)",
            level = "HSK 2",
            category = "Keuangan & Humor",
            description = "Pandangan bijak tentang menjaga keutuhan persahabatan sejati agar tidak retak oleh urusan pinjam-meminjam uang.",
            coverEmoji = "💵",
            coverImageRes = R.drawable.cover_story_lend_money,
            estimatedReadMinutes = 2,
            sentences = listOf(
                Sentence(
                    id = "s_lendmon_1",
                    hanzi = "我不会借给朋友一大笔钱。",
                    pinyin = "wǒ bù huì jiè gěi péng you yī dà bǐ qián",
                    translation = "Saya tidak akan meminjamkan uang dalam jumlah besar kepada seorang teman.",
                    tokens = listOf(
                        WordToken("我", "wǒ", "I; me; my", "Kosakata HSK 2: 我 (wǒ)"),
                        WordToken("不会", "bù huì", "Will not", "Kosakata HSK 2: 不会 (bù huì)"),
                        WordToken("借", "jiè", "To borrow", "Kosakata HSK 2: 借 (jiè)"),
                        WordToken("给", "gěi", "To", "Kosakata HSK 2: 给 (gěi)"),
                        WordToken("朋友", "péng you", "Friend", "Kosakata HSK 2: 朋友 (péng you)"),
                        WordToken("一", "yī", "One", "Kosakata HSK 2: 一 (yī)"),
                        WordToken("大", "dà", "Big; large; great", "Kosakata HSK 2: 大 (dà)"),
                        WordToken("笔", "bǐ", "(classifier) stroke of a chinese character", "Kosakata HSK 2: 笔 (bǐ)"),
                        WordToken("钱", "qián", "Coin", "Kosakata HSK 2: 钱 (qián)")
                    )
                ),
                Sentence(
                    id = "s_lendmon_2",
                    hanzi = "不是因为不想帮助朋友，是因为我觉得我们的友谊更珍贵，友谊是无价的。",
                    pinyin = "bù shì yīn wèi bù xiǎng bāng zhù péng you shì yīn wèi wǒ jué de wǒ men de yǒu yì gèng zhēn guì yǒu yì shì wú jià de",
                    translation = "Bukan karena saya tidak ingin membantu teman, melainkan karena saya merasa persahabatan kami jauh lebih berharga, dan persahabatan sejati tak ternilai harganya.",
                    tokens = listOf(
                        WordToken("不是", "bù shì", "No", "Kosakata HSK 2: 不是 (bù shì)"),
                        WordToken("因为", "yīn wèi", "Because; owing to; on account of", "Kosakata HSK 2: 因为 (yīn wèi)"),
                        WordToken("不", "bù", "No; not so", "Kosakata HSK 2: 不 (bù)"),
                        WordToken("想", "xiǎng", "To desire; to want (to)", "Kosakata HSK 2: 想 (xiǎng)"),
                        WordToken("帮助", "bāng zhù", "To help; to assist", "Kosakata HSK 2: 帮助 (bāng zhù)"),
                        WordToken("朋友", "péng you", "Friend", "Kosakata HSK 2: 朋友 (péng you)"),
                        WordToken("是", "shì", "Indeed (used for emphasis)", "Kosakata HSK 2: 是 (shì)"),
                        WordToken("因为", "yīn wèi", "Because; owing to; on account of", "Kosakata HSK 2: 因为 (yīn wèi)"),
                        WordToken("我", "wǒ", "I; me; my", "Kosakata HSK 2: 我 (wǒ)"),
                        WordToken("觉得", "jué de", "To think that ...; to feel that ...", "Kosakata HSK 2: 觉得 (jué de)"),
                        WordToken("我们", "wǒ men", "We; us; ourselves; our", "Kosakata HSK 2: 我们 (wǒ men)"),
                        WordToken("的", "de", "Possessive particle (of; &#x27;s)", "Kosakata HSK 2: 的 (de)"),
                        WordToken("友谊", "yǒu yì", "Companionship", "Kosakata HSK 2: 友谊 (yǒu yì)"),
                        WordToken("更", "gèng", "More", "Kosakata HSK 2: 更 (gèng)"),
                        WordToken("珍贵", "zhēn guì", "Precious", "Kosakata HSK 2: 珍贵 (zhēn guì)"),
                        WordToken("友谊", "yǒu yì", "Companionship", "Kosakata HSK 2: 友谊 (yǒu yì)"),
                        WordToken("是", "shì", "To be (followed by substantives only)", "Kosakata HSK 2: 是 (shì)"),
                        WordToken("无价", "wú jià", "Invaluable", "Kosakata HSK 2: 无价 (wú jià)"),
                        WordToken("的", "de", "Emphatic particle (used at the end of a declarative sentence for emphasis)", "Kosakata HSK 2: 的 (de)")
                    )
                ),
                Sentence(
                    id = "s_lendmon_3",
                    hanzi = "我不想我的朋友因为不能还钱而避开我。",
                    pinyin = "wǒ bù xiǎng wǒ de péng you yīn wèi bù néng huán qián ér bì kāi wǒ",
                    translation = "Saya tidak ingin sahabat saya menjauhi saya hanya gara-gara merasa terbebani belum bisa mengembalikan pinjaman uang.",
                    tokens = listOf(
                        WordToken("我", "wǒ", "I; me; my", "Kosakata HSK 2: 我 (wǒ)"),
                        WordToken("不", "bù", "No; not so", "Kosakata HSK 2: 不 (bù)"),
                        WordToken("想", "xiǎng", "To desire; to want (to)", "Kosakata HSK 2: 想 (xiǎng)"),
                        WordToken("我的", "wǒ de", "My; mine", "Kosakata HSK 2: 我的 (wǒ de)"),
                        WordToken("朋友", "péng you", "Friend", "Kosakata HSK 2: 朋友 (péng you)"),
                        WordToken("因为", "yīn wèi", "Because; owing to; on account of", "Kosakata HSK 2: 因为 (yīn wèi)"),
                        WordToken("不能", "bù néng", "Cannot", "Kosakata HSK 2: 不能 (bù néng)"),
                        WordToken("还", "huán", "To pay back", "Kosakata HSK 2: 还 (huán)"),
                        WordToken("钱", "qián", "Coin", "Kosakata HSK 2: 钱 (qián)"),
                        WordToken("而", "ér", "And so", "Kosakata HSK 2: 而 (ér)"),
                        WordToken("避开", "bì kāi", "To avoid", "Kosakata HSK 2: 避开 (bì kāi)"),
                        WordToken("我", "wǒ", "I; me; my", "Kosakata HSK 2: 我 (wǒ)")
                    )
                ),
                Sentence(
                    id = "s_lendmon_4",
                    hanzi = "如果他因为我不借钱而避开我，那可能他觉得我们的友谊不如那些钱。",
                    pinyin = "rú guǒ tā yīn wèi wǒ bù jiè qián ér bì kāi wǒ nà kě néng tā jué de wǒ men de yǒu yì bù rú nà xiē qián",
                    translation = "Jika dia menjauhi saya karena saya menolak meminjamkan uang, itu pertanda dia menganggap nilai persahabatan kami tidak sebanding dengan lembaran uang itu.",
                    tokens = listOf(
                        WordToken("如果", "rú guǒ", "If; in case; in the event that", "Kosakata HSK 2: 如果 (rú guǒ)"),
                        WordToken("他", "tā", "He; him; his", "Kosakata HSK 2: 他 (tā)"),
                        WordToken("因为", "yīn wèi", "Because; owing to; on account of", "Kosakata HSK 2: 因为 (yīn wèi)"),
                        WordToken("我", "wǒ", "I; me; my", "Kosakata HSK 2: 我 (wǒ)"),
                        WordToken("不", "bù", "No; not so", "Kosakata HSK 2: 不 (bù)"),
                        WordToken("借", "jiè", "To borrow", "Kosakata HSK 2: 借 (jiè)"),
                        WordToken("钱", "qián", "Coin", "Kosakata HSK 2: 钱 (qián)"),
                        WordToken("而", "ér", "And so", "Kosakata HSK 2: 而 (ér)"),
                        WordToken("避开", "bì kāi", "To avoid", "Kosakata HSK 2: 避开 (bì kāi)"),
                        WordToken("我", "wǒ", "I; me; my", "Kosakata HSK 2: 我 (wǒ)"),
                        WordToken("那", "nà", "Then (in that case)", "Kosakata HSK 2: 那 (nà)"),
                        WordToken("可能", "kě néng", "Might (happen)", "Kosakata HSK 2: 可能 (kě néng)"),
                        WordToken("他", "tā", "He; him; his", "Kosakata HSK 2: 他 (tā)"),
                        WordToken("觉得", "jué de", "To think that ...; to feel that ...", "Kosakata HSK 2: 觉得 (jué de)"),
                        WordToken("我们", "wǒ men", "We; us; ourselves; our", "Kosakata HSK 2: 我们 (wǒ men)"),
                        WordToken("的", "de", "Possessive particle (of; &#x27;s)", "Kosakata HSK 2: 的 (de)"),
                        WordToken("友谊", "yǒu yì", "Companionship", "Kosakata HSK 2: 友谊 (yǒu yì)"),
                        WordToken("不如", "bù rú", "Not equal to; not as good as; inferior to", "Kosakata HSK 2: 不如 (bù rú)"),
                        WordToken("那些", "nà xiē", "Those", "Kosakata HSK 2: 那些 (nà xiē)"),
                        WordToken("钱", "qián", "Coin", "Kosakata HSK 2: 钱 (qián)")
                    )
                ),
                Sentence(
                    id = "s_lendmon_5",
                    hanzi = "所以我不会借钱给朋友，但是我会把钱送给朋友，不能拿回钱也没关系。",
                    pinyin = "suǒ yǐ wǒ bù huì jiè qián gěi péng you dàn shì wǒ huì bǎ qián sòng gěi péng you bù néng ná huí qián yě méi guān xi",
                    translation = "Maka dari itu saya tidak meminjamkan uang, tetapi saya rela memberikannya secara cuma-cuma sebagai hadiah; tidak dikembalikan pun saya ikhlas tanpa beban.",
                    tokens = listOf(
                        WordToken("所以", "suǒ yǐ", "Therefore", "Kosakata HSK 2: 所以 (suǒ yǐ)"),
                        WordToken("我", "wǒ", "I; me; my", "Kosakata HSK 2: 我 (wǒ)"),
                        WordToken("不会", "bù huì", "Will not", "Kosakata HSK 2: 不会 (bù huì)"),
                        WordToken("借", "jiè", "To borrow", "Kosakata HSK 2: 借 (jiè)"),
                        WordToken("钱", "qián", "Coin", "Kosakata HSK 2: 钱 (qián)"),
                        WordToken("给", "gěi", "To", "Kosakata HSK 2: 给 (gěi)"),
                        WordToken("朋友", "péng you", "Friend", "Kosakata HSK 2: 朋友 (péng you)"),
                        WordToken("但是", "dàn shì", "But; however", "Kosakata HSK 2: 但是 (dàn shì)"),
                        WordToken("我", "wǒ", "I; me; my", "Kosakata HSK 2: 我 (wǒ)"),
                        WordToken("会", "huì", "To be likely to; to be sure to", "Kosakata HSK 2: 会 (huì)"),
                        WordToken("把", "bǎ", "(used to put the object before the verb: 把[ba3] + {noun} + {verb})", "Kosakata HSK 2: 把 (bǎ)"),
                        WordToken("钱", "qián", "Coin", "Kosakata HSK 2: 钱 (qián)"),
                        WordToken("送", "sòng", "To give (as a present)", "Kosakata HSK 2: 送 (sòng)"),
                        WordToken("给", "gěi", "To", "Kosakata HSK 2: 给 (gěi)"),
                        WordToken("朋友", "péng you", "Friend", "Kosakata HSK 2: 朋友 (péng you)"),
                        WordToken("不能", "bù néng", "Cannot", "Kosakata HSK 2: 不能 (bù néng)"),
                        WordToken("拿", "ná", "To hold", "Kosakata HSK 2: 拿 (ná)"),
                        WordToken("回", "huí", "To go back", "Kosakata HSK 2: 回 (huí)"),
                        WordToken("钱", "qián", "Coin", "Kosakata HSK 2: 钱 (qián)"),
                        WordToken("也", "yě", "Even (extreme or unexpected case)", "Kosakata HSK 2: 也 (yě)"),
                        WordToken("没关系", "méi guān xi", "It doesn&#x27;t matter", "Kosakata HSK 2: 没关系 (méi guān xi)")
                    )
                )
            ),
            questions = listOf(
                StoryQuestion(
                    id = "q_lendmon_1",
                    questionText = "作者为什么不主张借给朋友大笔金钱？ (Mengapa penulis enggan meminjamkan uang dalam jumlah besar kepada sahabat?)",
                    options = listOf("因为他自己非常缺钱 (Karena dia sendiri kekurangan uang)", "因为他觉得真正的友谊是无价的，不愿因债务损害感情 (Karena menganggap persahabatan sejati tak ternilai dan tak ingin rusak oleh beban utang)", "因为他看不起朋友 (Karena meremehkan kemampuan temannya)", "因为银行有利息 (Karena bank memberi bunga tabungan)"),
                    correctAnswerIndex = 1,
                    explanation = "Urusan utang piutang kerap merenggangkan hubungan pertemanan."
                ),
                StoryQuestion(
                    id = "q_lendmon_2",
                    questionText = "如果朋友因为还不起钱会产生什么尴尬心理？ (Rasa canggung apa yang sering dialami peminjam yang belum bisa melunasi utang?)",
                    options = listOf("会变得更加傲慢 (Menjadi makin sombong)", "会因为内疚和压力而选择避开朋友 (Merasa tertekan dan memilih menjauh karena rasa malu)", "天天去找朋友聚餐 (Makin sering mengajak makan bersama)", "四处炫耀 (Kerap memamerkan kekayaan)"),
                    correctAnswerIndex = 1,
                    explanation = "Beban psikologis belum bisa melunasi uang pinjaman membuat orang menjauh."
                ),
                StoryQuestion(
                    id = "q_lendmon_3",
                    questionText = "面对真正急需用钱的知心好友，作者更倾向于怎么做？ (Langkah alternatif apa yang lebih dipilih penulis saat membantu sahabat sejati?)",
                    options = listOf("直接将钱作为心意赠送给对方，不再计较归还 (Memberikan uang secara cuma-cuma sebagai hadiah ikhlas tanpa menuntut kembali)", "收取高额利息 (Menagih bunga tinggi)", "绝不理睬 (Mengabaikannya sama sekali)", "到处说坏话 (Menceritakan kejelekannya ke orang lain)"),
                    correctAnswerIndex = 0,
                    explanation = "Memberi secara tulus menghilangkan beban tagihan di kedua belah pihak."
                ),
                StoryQuestion(
                    id = "q_lendmon_4",
                    questionText = "这篇短文阐释了金钱与友谊之间的什么深刻哲理？ (Filosofi mendalam apa yang diuraikan terkait relasi uang dan pertemanan?)",
                    options = listOf("有钱才能有朋友 (Hanya orang beruang yang punya teman)", "金钱有价，真挚情谊无价，切勿让金钱玷污纯洁信任 (Uang ada nilainya, persahabatan tulus tak ternilai; jangan biarkan materi mengikis kepercayaan)", "借钱不用还 (Pinjam uang tak usah dikembalikan)", "不要交任何朋友 (Jangan berteman dengan siapa pun)"),
                    correctAnswerIndex = 1,
                    explanation = "Menjaga martabat dan ketulusan hubungan di atas kepentingan materi sesaat."
                )
            )
        ),
        // Cerita Mandarin Bean 116 (HSK 2): It's All His Fault (Semua Adalah Salah Dia)
        Story(
            id = "story_all_his_fault",
            titleHanzi = "都是他的错",
            titlePinyin = "Dōu Shì Tā de Cuò",
            titleTranslation = "It's All His Fault (Semua Adalah Salah Dia)",
            level = "HSK 2",
            category = "Keluarga & Humor",
            description = "Tingkah konyol seorang anak yang menyalahkan saudaranya karena menghindar dari lemparan batu hingga memecahkan jendela.",
            coverEmoji = "🍎",
            coverImageRes = R.drawable.cover_story_all_his_fault,
            estimatedReadMinutes = 2,
            sentences = listOf(
                Sentence(
                    id = "s_itsallh_1",
                    hanzi = "大龙和小波是我的两个儿子。",
                    pinyin = "Dà lóng hé xiǎo bō shì wǒ de liǎng gè ér zi",
                    translation = "Da Long dan Xiao Bo adalah dua putra kembar saya.",
                    tokens = listOf(
                        WordToken("大龙", "Dà lóng", "A name", "Kosakata HSK 2: 大龙 (Dà lóng)"),
                        WordToken("和", "hé", "And; together with", "Kosakata HSK 2: 和 (hé)"),
                        WordToken("小波", "xiǎo bō", "Wavelet (math.)", "Kosakata HSK 2: 小波 (xiǎo bō)"),
                        WordToken("是", "shì", "To be (followed by substantives only)", "Kosakata HSK 2: 是 (shì)"),
                        WordToken("我的", "wǒ de", "My; mine", "Kosakata HSK 2: 我的 (wǒ de)"),
                        WordToken("两", "liǎng", "Two", "Kosakata HSK 2: 两 (liǎng)"),
                        WordToken("个", "gè", "Classifier for people or objects in general", "Kosakata HSK 2: 个 (gè)"),
                        WordToken("儿子", "ér zi", "Son", "Kosakata HSK 2: 儿子 (ér zi)")
                    )
                ),
                Sentence(
                    id = "s_itsallh_2",
                    hanzi = "今年他们八岁了，但是经常打架。",
                    pinyin = "jīn nián tā men bā suì le dàn shì jīng cháng dǎ jià",
                    translation = "Tahun ini mereka berusia delapan tahun, tetapi mereka sering sekali bertengkar dan berkelahi.",
                    tokens = listOf(
                        WordToken("今年", "jīn nián", "This year", "Kosakata HSK 2: 今年 (jīn nián)"),
                        WordToken("他们", "tā men", "They; them", "Kosakata HSK 2: 他们 (tā men)"),
                        WordToken("八", "bā", "Eight", "Kosakata HSK 2: 八 (bā)"),
                        WordToken("岁", "suì", "Classifier for years (of age)", "Kosakata HSK 2: 岁 (suì)"),
                        WordToken("了", "le", "(completed action marker)", "Kosakata HSK 2: 了 (le)"),
                        WordToken("但是", "dàn shì", "But; however", "Kosakata HSK 2: 但是 (dàn shì)"),
                        WordToken("经常", "jīng cháng", "Frequently; constantly; regularly; often", "Kosakata HSK 2: 经常 (jīng cháng)"),
                        WordToken("打架", "dǎ jià", "To fight", "Kosakata HSK 2: 打架 (dǎ jià)")
                    )
                ),
                Sentence(
                    id = "s_itsallh_3",
                    hanzi = "上个星期六，我对他们说：我现在要做午饭了,你们去花园玩吧。",
                    pinyin = "shàng gè Xīng qī liù wǒ duì tā men shuō wǒ xiàn zài yào zuò wǔ fàn le nǐ men qù huā yuán wán ba",
                    translation = "Hari Sabtu lalu, saya berkata kepada mereka: “Ibu sekarang mau memasak makan siang, kalian pergilah bermain di taman pekarangan.”",
                    tokens = listOf(
                        WordToken("上", "shàng", "(bound form) up; upper; above; previous", "Kosakata HSK 2: 上 (shàng)"),
                        WordToken("个", "gè", "Classifier for people or objects in general", "Kosakata HSK 2: 个 (gè)"),
                        WordToken("星期六", "Xīng qī liù", "Saturday", "Kosakata HSK 2: 星期六 (Xīng qī liù)"),
                        WordToken("我", "wǒ", "I; me; my", "Kosakata HSK 2: 我 (wǒ)"),
                        WordToken("对", "duì", "Towards; at; for", "Kosakata HSK 2: 对 (duì)"),
                        WordToken("他们", "tā men", "They; them", "Kosakata HSK 2: 他们 (tā men)"),
                        WordToken("说", "shuō", "To speak; to talk; to say", "Kosakata HSK 2: 说 (shuō)"),
                        WordToken("我", "wǒ", "I; me; my", "Kosakata HSK 2: 我 (wǒ)"),
                        WordToken("现在", "xiàn zài", "Now; at present; currently", "Kosakata HSK 2: 现在 (xiàn zài)"),
                        WordToken("要", "yào", "Will; shall; about to", "Kosakata HSK 2: 要 (yào)"),
                        WordToken("做", "zuò", "To make; to produce", "Kosakata HSK 2: 做 (zuò)"),
                        WordToken("午饭", "wǔ fàn", "Lunch", "Kosakata HSK 2: 午饭 (wǔ fàn)"),
                        WordToken("了", "le", "(completed action marker)", "Kosakata HSK 2: 了 (le)"),
                        WordToken("你们", "nǐ men", "You (plural)", "Kosakata HSK 2: 你们 (nǐ men)"),
                        WordToken("去", "qù", "To go, to go to", "Kosakata HSK 2: 去 (qù)"),
                        WordToken("花园", "huā yuán", "Garden (for flowers, ornamental plants etc); (landscaped) park; yard with decorative plants", "Kosakata HSK 2: 花园 (huā yuán)"),
                        WordToken("玩", "wán", "To play", "Kosakata HSK 2: 玩 (wán)"),
                        WordToken("吧", "ba", "(modal particle indicating suggestion or surmise)", "Kosakata HSK 2: 吧 (ba)")
                    )
                ),
                Sentence(
                    id = "s_itsallh_4",
                    hanzi = "然后他们就一起去花园了。",
                    pinyin = "rán hòu tā men jiù yī qǐ qù huā yuán le",
                    translation = "Lalu mereka berdua bersama-sama pergi ke taman.",
                    tokens = listOf(
                        WordToken("然后", "rán hòu", "Then; after that; afterwards", "Kosakata HSK 2: 然后 (rán hòu)"),
                        WordToken("他们", "tā men", "They; them", "Kosakata HSK 2: 他们 (tā men)"),
                        WordToken("就", "jiù", "In that case; then", "Kosakata HSK 2: 就 (jiù)"),
                        WordToken("一起", "yī qǐ", "Together; in company (with)", "Kosakata HSK 2: 一起 (yī qǐ)"),
                        WordToken("去", "qù", "To go, to go to", "Kosakata HSK 2: 去 (qù)"),
                        WordToken("花园", "huā yuán", "Garden (for flowers, ornamental plants etc); (landscaped) park; yard with decorative plants", "Kosakata HSK 2: 花园 (huā yuán)"),
                        WordToken("了", "le", "(completed action marker)", "Kosakata HSK 2: 了 (le)")
                    )
                ),
                Sentence(
                    id = "s_itsallh_5",
                    hanzi = "半个小时以后，大龙跑进家说：妈妈，小波打碎了邻居家的窗户，他不是好孩子。",
                    pinyin = "bàn gè xiǎo shí yǐ hòu Dà lóng pǎo jìn jiā shuō mā ma xiǎo bō dǎ suì le lín jū jiā de chuāng hu tā bù shì hǎo hái zi",
                    translation = "Setengah jam kemudian, Da Long berlari masuk ke rumah dan melapor: “Ibu, Xiao Bo memecahkan kaca jendela rumah tetangga, dia anak nakal!”",
                    tokens = listOf(
                        WordToken("半", "bàn", "Half", "Kosakata HSK 2: 半 (bàn)"),
                        WordToken("个", "gè", "Classifier for people or objects in general", "Kosakata HSK 2: 个 (gè)"),
                        WordToken("小时", "xiǎo shí", "Hour", "Kosakata HSK 2: 小时 (xiǎo shí)"),
                        WordToken("以后", "yǐ hòu", "After", "Kosakata HSK 2: 以后 (yǐ hòu)"),
                        WordToken("大龙", "Dà lóng", "A name", "Kosakata HSK 2: 大龙 (Dà lóng)"),
                        WordToken("跑", "pǎo", "To run", "Kosakata HSK 2: 跑 (pǎo)"),
                        WordToken("进", "jìn", "To go in", "Kosakata HSK 2: 进 (jìn)"),
                        WordToken("家", "jiā", "Home", "Kosakata HSK 2: 家 (jiā)"),
                        WordToken("说", "shuō", "To speak; to talk; to say", "Kosakata HSK 2: 说 (shuō)"),
                        WordToken("妈妈", "mā ma", "Mama", "Kosakata HSK 2: 妈妈 (mā ma)"),
                        WordToken("小波", "xiǎo bō", "Wavelet (math.)", "Kosakata HSK 2: 小波 (xiǎo bō)"),
                        WordToken("打碎", "dǎ suì", "To shatter; to smash; to break into pieces", "Kosakata HSK 2: 打碎 (dǎ suì)"),
                        WordToken("了", "le", "(completed action marker)", "Kosakata HSK 2: 了 (le)"),
                        WordToken("邻居", "lín jū", "Neighbor", "Kosakata HSK 2: 邻居 (lín jū)"),
                        WordToken("家", "jiā", "Home", "Kosakata HSK 2: 家 (jiā)"),
                        WordToken("的", "de", "Possessive particle (of; &#x27;s)", "Kosakata HSK 2: 的 (de)"),
                        WordToken("窗户", "chuāng hu", "Window", "Kosakata HSK 2: 窗户 (chuāng hu)"),
                        WordToken("他", "tā", "He; him; his", "Kosakata HSK 2: 他 (tā)"),
                        WordToken("不", "bù", "No; not so", "Kosakata HSK 2: 不 (bù)"),
                        WordToken("是", "shì", "To be (followed by substantives only)", "Kosakata HSK 2: 是 (shì)"),
                        WordToken("好", "hǎo", "Good", "Kosakata HSK 2: 好 (hǎo)"),
                        WordToken("孩子", "hái zi", "Child", "Kosakata HSK 2: 孩子 (hái zi)")
                    )
                ),
                Sentence(
                    id = "s_itsallh_6",
                    hanzi = "我问：他是怎么打碎窗户的？",
                    pinyin = "wǒ wèn tā shì zěn me dǎ suì chuāng hu de",
                    translation = "Saya bertanya: “Bagaimana caranya dia bisa memecahkan jendela tetangga?”",
                    tokens = listOf(
                        WordToken("我", "wǒ", "I; me; my", "Kosakata HSK 2: 我 (wǒ)"),
                        WordToken("问", "wèn", "To ask; to inquire", "Kosakata HSK 2: 问 (wèn)"),
                        WordToken("他", "tā", "He; him; his", "Kosakata HSK 2: 他 (tā)"),
                        WordToken("是", "shì", "Indeed (used for emphasis)", "Kosakata HSK 2: 是 (shì)"),
                        WordToken("怎么", "zěn me", "How?", "Kosakata HSK 2: 怎么 (zěn me)"),
                        WordToken("打碎", "dǎ suì", "To shatter; to smash; to break into pieces", "Kosakata HSK 2: 打碎 (dǎ suì)"),
                        WordToken("窗户", "chuāng hu", "Window", "Kosakata HSK 2: 窗户 (chuāng hu)"),
                        WordToken("的", "de", "Emphatic particle (used at the end of a declarative sentence for emphasis)", "Kosakata HSK 2: 的 (de)")
                    )
                ),
                Sentence(
                    id = "s_itsallh_7",
                    hanzi = "大龙回答：我朝他扔了一个石头，他蹲下了！",
                    pinyin = "Dà lóng huí dá wǒ cháo tā rēng le yī gè shí tou tā dūn xià le",
                    translation = "Da Long menjawab dengan polos: “Tadi saya melempar batu ke arah kepalanya, tapi dia malah jongkok menghindar!”",
                    tokens = listOf(
                        WordToken("大龙", "Dà lóng", "A name", "Kosakata HSK 2: 大龙 (Dà lóng)"),
                        WordToken("回答", "huí dá", "To reply; to answer", "Kosakata HSK 2: 回答 (huí dá)"),
                        WordToken("我", "wǒ", "I; me; my", "Kosakata HSK 2: 我 (wǒ)"),
                        WordToken("朝", "cháo", "Facing", "Kosakata HSK 2: 朝 (cháo)"),
                        WordToken("他", "tā", "He; him; his", "Kosakata HSK 2: 他 (tā)"),
                        WordToken("扔", "rēng", "To throw", "Kosakata HSK 2: 扔 (rēng)"),
                        WordToken("了", "le", "(completed action marker)", "Kosakata HSK 2: 了 (le)"),
                        WordToken("一", "yī", "One", "Kosakata HSK 2: 一 (yī)"),
                        WordToken("个", "gè", "Classifier for people or objects in general", "Kosakata HSK 2: 个 (gè)"),
                        WordToken("石头", "shí tou", "Stone", "Kosakata HSK 2: 石头 (shí tou)"),
                        WordToken("他", "tā", "He; him; his", "Kosakata HSK 2: 他 (tā)"),
                        WordToken("蹲下", "dūn xià", "To squat down", "Kosakata HSK 2: 蹲下 (dūn xià)"),
                        WordToken("了", "le", "(completed action marker)", "Kosakata HSK 2: 了 (le)")
                    )
                )
            ),
            questions = listOf(
                StoryQuestion(
                    id = "q_itsallh_1",
                    questionText = "大龙和小波是什么关系？ (Apa hubungan persaudaraan antara Da Long dan Xiao Bo?)",
                    options = listOf("同学关系 (Teman sekelas)", "一对八岁的亲兄弟 (Dua saudara kandung berusia 8 tahun)", "邻居朋友 (Tetangga sebelah)", "表兄弟 (Sepupu jauh)"),
                    correctAnswerIndex = 1,
                    explanation = "Keduanya adalah putra kandung yang berusia delapan tahun."
                ),
                StoryQuestion(
                    id = "q_itsallh_2",
                    questionText = "邻居家窗户的玻璃是怎么被打破的？ (Bagaimana kaca jendela rumah tetangga bisa pecah?)",
                    options = listOf("被大风吹破的 (Tertipu angin kencang)", "大龙朝小波扔石头，小波蹲下躲开砸中了窗户 (Da Long melempar batu ke arah Xiao Bo, lalu Xiao Bo merunduk menghindar hingga batu mengenai kaca)", "小鸟撞碎的 (Tertabrak burung terbang)", "踢足球踢碎的 (Tertendang bola sepak)"),
                    correctAnswerIndex = 1,
                    explanation = "Batu yang dilempar meleset mengenai kaca rumah tetangga."
                ),
                StoryQuestion(
                    id = "q_itsallh_3",
                    questionText = "大龙为什么理直气壮地说“这都是小波的错”？ (Mengapa Da Long berdalih bahwa semua itu adalah kesalahan Xiao Bo?)",
                    options = listOf("因为小波没有站着挨砸，而是蹲下了 (Karena menganggap jika Xiao Bo tidak jongkok menghindar, kaca jendela tidak akan pecah!)", "因为是小波扔的石头 (Karena Xiao Bo yang melempar batu)", "因为窗户很便宜 (Karena harga jendelanya murah)", "因为邻居不在家 (Karena tetangga sedang bepergian)"),
                    correctAnswerIndex = 0,
                    explanation = "Logika terbalik anak kecil yang mengambinghitamkan saudaranya sendiri."
                ),
                StoryQuestion(
                    id = "q_itsallh_4",
                    questionText = "作为家长面对孩子犯错应如何引导？ (Bagaimana sikap bijak orang tua membimbing anak yang berselisih?)",
                    options = listOf("严厉毒打一顿 (Memukul anak dengan keras)", "讲明道理，教育孩子勇于承担责任并向邻居诚恳道歉赔偿 (Menjelaskan etika, mengajarkan tanggung jawab atas perbuatan, dan meminta maaf kepada tetangga)", "帮着孩子隐瞒 (Membantu anak menutupi kesalahan)", "去骂邻居 (Memarahi tetangga pemilik rumah)"),
                    correctAnswerIndex = 1,
                    explanation = "Mendidik anak berani bertanggung jawab atas dampak perilakunya."
                )
            )
        ),
        // Cerita Mandarin Bean 117 (HSK 2): Didn't Take the Wrong Place (Tidak Salah Kursi)
        Story(
            id = "story_didnt_take_wrong_place",
            titleHanzi = "没坐错",
            titlePinyin = "Méi Zuò Cuò",
            titleTranslation = "Didn't Take the Wrong Place (Tidak Salah Kursi)",
            level = "HSK 2",
            category = "Humor & Bioskop",
            description = "Humor menggelikan di bioskop saat seseorang memastikan kursinya dengan menanyakan bekas injakan kaki penonton sebelah.",
            coverEmoji = "🎟️",
            coverImageRes = R.drawable.cover_story_didnt_take_wrong_place,
            estimatedReadMinutes = 2,
            sentences = listOf(
                Sentence(
                    id = "s_didntta_1",
                    hanzi = "在一家电影院里，电影在播放的时候，一个坐在中间的人站起来走去厕所了。",
                    pinyin = "zài yī jiā diàn yǐng yuàn lǐ diàn yǐng zài bō fàng de shí hou yī gè zuò zài zhōng jiān de rén zhàn qǐ lái zǒu qù cè suǒ le",
                    translation = "Di dalam sebuah bioskop, saat film sedang diputar, seorang penonton yang duduk di baris tengah berdiri dan berjalan menuju toilet.",
                    tokens = listOf(
                        WordToken("在", "zài", "(of sb or sth) to be (located) at", "Kosakata HSK 2: 在 (zài)"),
                        WordToken("一", "yī", "One", "Kosakata HSK 2: 一 (yī)"),
                        WordToken("家", "jiā", "Classifier for families or businesses", "Kosakata HSK 2: 家 (jiā)"),
                        WordToken("电影院", "diàn yǐng yuàn", "Cinema; movie theater", "Kosakata HSK 2: 电影院 (diàn yǐng yuàn)"),
                        WordToken("里", "lǐ", "Lining", "Kosakata HSK 2: 里 (lǐ)"),
                        WordToken("电影", "diàn yǐng", "Movie; film", "Kosakata HSK 2: 电影 (diàn yǐng)"),
                        WordToken("在", "zài", "(used before a verb to indicate an action in progress)", "Kosakata HSK 2: 在 (zài)"),
                        WordToken("播放", "bō fàng", "To broadcast; to transmit (by radio or tv)", "Kosakata HSK 2: 播放 (bō fàng)"),
                        WordToken("的", "de", "Possessive particle (of; &#x27;s)", "Kosakata HSK 2: 的 (de)"),
                        WordToken("时候", "shí hou", "Time", "Kosakata HSK 2: 时候 (shí hou)"),
                        WordToken("一", "yī", "One", "Kosakata HSK 2: 一 (yī)"),
                        WordToken("个", "gè", "Classifier for people or objects in general", "Kosakata HSK 2: 个 (gè)"),
                        WordToken("坐", "zuò", "To sit", "Kosakata HSK 2: 坐 (zuò)"),
                        WordToken("在", "zài", "(of sb or sth) to be (located) at", "Kosakata HSK 2: 在 (zài)"),
                        WordToken("中间", "zhōng jiān", "The middle; the inside", "Kosakata HSK 2: 中间 (zhōng jiān)"),
                        WordToken("的", "de", "Possessive particle (of; &#x27;s)", "Kosakata HSK 2: 的 (de)"),
                        WordToken("人", "rén", "Person; people", "Kosakata HSK 2: 人 (rén)"),
                        WordToken("站", "zhàn", "To stand", "Kosakata HSK 2: 站 (zhàn)"),
                        WordToken("起来", "qǐ lái", "To stand up; to get up", "Kosakata HSK 2: 起来 (qǐ lái)"),
                        WordToken("走", "zǒu", "To walk", "Kosakata HSK 2: 走 (zǒu)"),
                        WordToken("去", "qù", "(after a verb of motion) movement away from the speaker; (after certain verbs) detachment or separation", "Kosakata HSK 2: 去 (qù)"),
                        WordToken("厕所", "cè suǒ", "Toilet; lavatory", "Kosakata HSK 2: 厕所 (cè suǒ)"),
                        WordToken("了", "le", "(completed action marker)", "Kosakata HSK 2: 了 (le)")
                    )
                ),
                Sentence(
                    id = "s_didntta_2",
                    hanzi = "五分钟后他回到自己的座位，问坐在旁边的男人：对不起，请问我刚才出去的时候踩到你的脚了吗？",
                    pinyin = "wǔ fēn zhōng hòu tā huí dào zì jǐ de zuò wèi wèn zuò zài páng biān de nán rén duì bu qǐ qǐng wèn wǒ gāng cái chū qù de shí hou cǎi dào nǐ de jiǎo le ma",
                    translation = "Lima menit kemudian dia kembali ke barisan kursi, lalu bertanya kepada pria yang duduk di sebelahnya: “Permisi, maaf apakah tadi saat saya keluar saya sempat menginjak kakimu?”",
                    tokens = listOf(
                        WordToken("五", "wǔ", "Five", "Kosakata HSK 2: 五 (wǔ)"),
                        WordToken("分钟", "fēn zhōng", "Minute", "Kosakata HSK 2: 分钟 (fēn zhōng)"),
                        WordToken("后", "hòu", "Afterwards", "Kosakata HSK 2: 后 (hòu)"),
                        WordToken("他", "tā", "He; him; his", "Kosakata HSK 2: 他 (tā)"),
                        WordToken("回", "huí", "To go back", "Kosakata HSK 2: 回 (huí)"),
                        WordToken("到", "dào", "To reach; to arrive", "Kosakata HSK 2: 到 (dào)"),
                        WordToken("自己", "zì jǐ", "Oneself; (attributive) one&#x27;s own", "Kosakata HSK 2: 自己 (zì jǐ)"),
                        WordToken("的", "de", "Possessive particle (of; &#x27;s)", "Kosakata HSK 2: 的 (de)"),
                        WordToken("座位", "zuò wèi", "Seat", "Kosakata HSK 2: 座位 (zuò wèi)"),
                        WordToken("问", "wèn", "To ask; to inquire", "Kosakata HSK 2: 问 (wèn)"),
                        WordToken("坐", "zuò", "To sit", "Kosakata HSK 2: 坐 (zuò)"),
                        WordToken("在", "zài", "(of sb or sth) to be (located) at", "Kosakata HSK 2: 在 (zài)"),
                        WordToken("旁边", "páng biān", "Side; adjacent place", "Kosakata HSK 2: 旁边 (páng biān)"),
                        WordToken("的", "de", "Possessive particle (of; &#x27;s)", "Kosakata HSK 2: 的 (de)"),
                        WordToken("男人", "nán rén", "A man", "Kosakata HSK 2: 男人 (nán rén)"),
                        WordToken("对不起", "duì bu qǐ", "I&#x27;m sorry; excuse me; i beg your pardon", "Kosakata HSK 2: 对不起 (duì bu qǐ)"),
                        WordToken("请", "qǐng", "Please (do sth)", "Kosakata HSK 2: 请 (qǐng)"),
                        WordToken("问", "wèn", "To ask; to inquire", "Kosakata HSK 2: 问 (wèn)"),
                        WordToken("我", "wǒ", "I; me; my", "Kosakata HSK 2: 我 (wǒ)"),
                        WordToken("刚才", "gāng cái", "Just now", "Kosakata HSK 2: 刚才 (gāng cái)"),
                        WordToken("出去", "chū qù", "To go out", "Kosakata HSK 2: 出去 (chū qù)"),
                        WordToken("的", "de", "Possessive particle (of; &#x27;s)", "Kosakata HSK 2: 的 (de)"),
                        WordToken("时候", "shí hou", "Time", "Kosakata HSK 2: 时候 (shí hou)"),
                        WordToken("踩", "cǎi", "To step on", "Kosakata HSK 2: 踩 (cǎi)"),
                        WordToken("到", "dào", "To reach; to arrive", "Kosakata HSK 2: 到 (dào)"),
                        WordToken("你", "nǐ", "You", "Kosakata HSK 2: 你 (nǐ)"),
                        WordToken("的", "de", "Possessive particle (of; &#x27;s)", "Kosakata HSK 2: 的 (de)"),
                        WordToken("脚", "jiǎo", "Foot", "Kosakata HSK 2: 脚 (jiǎo)"),
                        WordToken("了", "le", "(completed action marker)", "Kosakata HSK 2: 了 (le)"),
                        WordToken("吗", "ma", "(question particle for &quot;yes-no&quot; questions)", "Kosakata HSK 2: 吗 (ma)")
                    )
                ),
                Sentence(
                    id = "s_didntta_3",
                    hanzi = "男人回答：是的，但没关系，不疼。",
                    pinyin = "nán rén huí dá shì de dàn méi guān xi bù téng",
                    translation = "Pria itu menjawab ramah: “Iya betul, tapi tidak apa-apa, tidak sakit kok.”",
                    tokens = listOf(
                        WordToken("男人", "nán rén", "A man", "Kosakata HSK 2: 男人 (nán rén)"),
                        WordToken("回答", "huí dá", "To reply; to answer", "Kosakata HSK 2: 回答 (huí dá)"),
                        WordToken("是的", "shì de", "Yes, that&#x27;s right", "Kosakata HSK 2: 是的 (shì de)"),
                        WordToken("但", "dàn", "But; yet; however; still", "Kosakata HSK 2: 但 (dàn)"),
                        WordToken("没关系", "méi guān xi", "It doesn&#x27;t matter", "Kosakata HSK 2: 没关系 (méi guān xi)"),
                        WordToken("不", "bù", "No; not so", "Kosakata HSK 2: 不 (bù)"),
                        WordToken("疼", "téng", "(it) hurts; sore", "Kosakata HSK 2: 疼 (téng)")
                    )
                ),
                Sentence(
                    id = "s_didntta_4",
                    hanzi = "这个人说：不，我不是这个意思，我只是想知道这是不是我的座位。",
                    pinyin = "zhè gè rén shuō bù wǒ bù shì zhè gè yì si wǒ zhǐ shì xiǎng zhī dào zhè shì bù shì wǒ de zuò wèi",
                    translation = "Penonton itu berkata lega: “Bukan, maksud saya bukan mau minta maaf, saya cuma ingin memastikan apakah ini benar kursi tempat duduk saya.",
                    tokens = listOf(
                        WordToken("这", "zhè", "This; these", "Kosakata HSK 2: 这 (zhè)"),
                        WordToken("个", "gè", "Classifier for people or objects in general", "Kosakata HSK 2: 个 (gè)"),
                        WordToken("人", "rén", "Person; people", "Kosakata HSK 2: 人 (rén)"),
                        WordToken("说", "shuō", "To speak; to talk; to say", "Kosakata HSK 2: 说 (shuō)"),
                        WordToken("不", "bù", "No; not so", "Kosakata HSK 2: 不 (bù)"),
                        WordToken("我", "wǒ", "I; me; my", "Kosakata HSK 2: 我 (wǒ)"),
                        WordToken("不是", "bù shì", "Is not", "Kosakata HSK 2: 不是 (bù shì)"),
                        WordToken("这", "zhè", "This; these", "Kosakata HSK 2: 这 (zhè)"),
                        WordToken("个", "gè", "Classifier for people or objects in general", "Kosakata HSK 2: 个 (gè)"),
                        WordToken("意思", "yì si", "Idea", "Kosakata HSK 2: 意思 (yì si)"),
                        WordToken("我", "wǒ", "I; me; my", "Kosakata HSK 2: 我 (wǒ)"),
                        WordToken("只", "zhǐ", "Only; merely; just", "Kosakata HSK 2: 只 (zhǐ)"),
                        WordToken("是", "shì", "Indeed (used for emphasis)", "Kosakata HSK 2: 是 (shì)"),
                        WordToken("想", "xiǎng", "To desire; to want (to)", "Kosakata HSK 2: 想 (xiǎng)"),
                        WordToken("知道", "zhī dào", "To know; to become aware of", "Kosakata HSK 2: 知道 (zhī dào)"),
                        WordToken("这", "zhè", "This; these", "Kosakata HSK 2: 这 (zhè)"),
                        WordToken("是", "shì", "To be (followed by substantives only)", "Kosakata HSK 2: 是 (shì)"),
                        WordToken("不是", "bù shì", "Is not", "Kosakata HSK 2: 不是 (bù shì)"),
                        WordToken("我", "wǒ", "I; me; my", "Kosakata HSK 2: 我 (wǒ)"),
                        WordToken("的", "de", "Possessive particle (of; &#x27;s)", "Kosakata HSK 2: 的 (de)"),
                        WordToken("座位", "zuò wèi", "Seat", "Kosakata HSK 2: 座位 (zuò wèi)")
                    )
                ),
                Sentence(
                    id = "s_didntta_5",
                    hanzi = "看来我没坐错。",
                    pinyin = "kàn lái wǒ méi zuò cuò",
                    translation = "Rupanya saya tidak salah mencari tempat duduk.”",
                    tokens = listOf(
                        WordToken("看来", "kàn lái", "Apparently", "Kosakata HSK 2: 看来 (kàn lái)"),
                        WordToken("我", "wǒ", "I; me; my", "Kosakata HSK 2: 我 (wǒ)"),
                        WordToken("没", "méi", "(negative prefix for verbs) have not; not", "Kosakata HSK 2: 没 (méi)"),
                        WordToken("坐", "zuò", "To sit", "Kosakata HSK 2: 坐 (zuò)"),
                        WordToken("错", "cuò", "Mistake", "Kosakata HSK 2: 错 (cuò)")
                    )
                )
            ),
            questions = listOf(
                StoryQuestion(
                    id = "q_didntta_1",
                    questionText = "故事的发生地点在哪里？ (Di manakah latar tempat terjadinya cerita lucu ini?)",
                    options = listOf("在图书馆 (Di perpustakaan)", "在电影院放映厅里 (Di dalam ruang bioskop)", "在火车站台 (Di peron stasiun)", "在医院病房 (Di bangsal rumah sakit)"),
                    correctAnswerIndex = 1,
                    explanation = "Kejadian berlangsung di deretan kursi gedung bioskop saat film diputar."
                ),
                StoryQuestion(
                    id = "q_didntta_2",
                    questionText = "这名观众从中途去洗手间回来后问了邻座什么奇怪的问题？ (Pertanyaan ganjil apa yang diajukan penonton itu kepada orang di sebelahnya?)",
                    options = listOf("电影好不好看 (Apakah filmnya bagus)", "刚才出去时有没有踩到对方的脚 (Apakah saat keluar tadi ia sempat menginjak kaki orang tersebut)", "借一点爆米花 (Meminjam sedikit popcorn)", "问现在几点 (Menanyakan waktu saat ini)"),
                    correctAnswerIndex = 1,
                    explanation = "Ia menanyakan insiden injakan kaki beberapa menit sebelumnya."
                ),
                StoryQuestion(
                    id = "q_didntta_3",
                    questionText = "他为什么非要确认自己刚才踩了对方的脚？ (Mengapa ia bersikeras memastikan insiden injak kaki tersebut?)",
                    options = listOf("为了当面赔礼道歉 (Untuk meminta maaf secara resmi)", "为了以此作为记号确认自己没有找错座位 (Sebagai penanda patokan untuk memastikan ia tidak salah menemukan kursinya)", "为了索要赔偿 (Untuk menuntut ganti rugi)", "为了找对方借钱 (Untuk meminjam uang)"),
                    correctAnswerIndex = 1,
                    explanation = "Puncak humor: rasa sakit orang lain malah dijadikan patokan penunjuk jalan pulang ke kursinya!"
                ),
                StoryQuestion(
                    id = "q_didntta_4",
                    questionText = "邻座观众听到真相后最可能的感受是什么？ (Bagaimana perkiraan perasaan penonton yang diinjak setelah mendengar penjelasan konyol itu?)",
                    options = listOf("感到啼笑皆非、哭笑不得 (Merasa geli sekaligus heran terheran-heran)", "非常感动 (Sangat terharu)", "立刻报警 (Langsung lapor polisi)", "吓得跑出电影院 (Lari ketakutan keluar gedung)"),
                    correctAnswerIndex = 0,
                    explanation = "Reaksi tercengang mendapati alasan ganjil di balik pertanyaan tersebut."
                )
            )
        ),
        // Cerita Mandarin Bean 118 (HSK 2): Math Exam (Ujian Matematika)
        Story(
            id = "story_math_exam",
            titleHanzi = "数学考试",
            titlePinyin = "Shùxué Kǎoshì",
            titleTranslation = "Math Exam (Ujian Matematika)",
            level = "HSK 2",
            category = "Sekolah & Ujian",
            description = "Kesalahpahaman lucu karena homofon nada bahasa Mandarin antara kata '难的' (yang sulit) dan '男的' (laki-laki).",
            coverEmoji = "📐",
            coverImageRes = R.drawable.cover_story_math_exam,
            estimatedReadMinutes = 2,
            sentences = listOf(
                Sentence(
                    id = "s_mathexa_1",
                    hanzi = "星期一上午有数学课，老师一进教室就说：\"今天，我们考试，请大家认真完成试卷，难的可以先不做。”",
                    pinyin = "xīng qī yī shàng wǔ yǒu shù xué kè lǎo shī yī jìn jiào shì jiù shuō jīn tiān wǒ men kǎo shì qǐng dà jiā rèn zhēn wán chéng shì juàn nán de kě yǐ xiān bù zuò",
                    translation = "Senin pagi ada pelajaran matematika, begitu guru masuk kelas beliau langsung mengumumkan: “Hari ini kita ada ujian, silakan kerjakan soal dengan teliti, soal yang sulit (nán de) boleh dilewati dulu dan dikerjakan nanti.”",
                    tokens = listOf(
                        WordToken("星期", "xīng qī", "Day of the week", "Kosakata HSK 2: 星期 (xīng qī)"),
                        WordToken("一", "yī", "One", "Kosakata HSK 2: 一 (yī)"),
                        WordToken("上午", "shàng wǔ", "Morning", "Kosakata HSK 2: 上午 (shàng wǔ)"),
                        WordToken("有", "yǒu", "To have; there is", "Kosakata HSK 2: 有 (yǒu)"),
                        WordToken("数学", "shù xué", "Mathematics", "Kosakata HSK 2: 数学 (shù xué)"),
                        WordToken("课", "kè", "Subject", "Kosakata HSK 2: 课 (kè)"),
                        WordToken("老师", "lǎo shī", "Teacher", "Kosakata HSK 2: 老师 (lǎo shī)"),
                        WordToken("一", "yī", "As soon as", "Kosakata HSK 2: 一 (yī)"),
                        WordToken("进", "jìn", "To go in", "Kosakata HSK 2: 进 (jìn)"),
                        WordToken("教室", "jiào shì", "Classroom", "Kosakata HSK 2: 教室 (jiào shì)"),
                        WordToken("就", "jiù", "As soon as; immediately after", "Kosakata HSK 2: 就 (jiù)"),
                        WordToken("说", "shuō", "To speak; to talk; to say", "Kosakata HSK 2: 说 (shuō)"),
                        WordToken("今天", "jīn tiān", "Today", "Kosakata HSK 2: 今天 (jīn tiān)"),
                        WordToken("我们", "wǒ men", "We; us; ourselves; our", "Kosakata HSK 2: 我们 (wǒ men)"),
                        WordToken("考试", "kǎo shì", "To take an exam", "Kosakata HSK 2: 考试 (kǎo shì)"),
                        WordToken("请", "qǐng", "Please (do sth)", "Kosakata HSK 2: 请 (qǐng)"),
                        WordToken("大家", "dà jiā", "Everyone", "Kosakata HSK 2: 大家 (dà jiā)"),
                        WordToken("认真", "rèn zhēn", "Conscientious", "Kosakata HSK 2: 认真 (rèn zhēn)"),
                        WordToken("完成", "wán chéng", "To complete; to accomplish", "Kosakata HSK 2: 完成 (wán chéng)"),
                        WordToken("试卷", "shì juàn", "Examination paper", "Kosakata HSK 2: 试卷 (shì juàn)"),
                        WordToken("难", "nán", "Difficult (to...)", "Kosakata HSK 2: 难 (nán)"),
                        WordToken("的", "de", "Possessive particle (of; &#x27;s)", "Kosakata HSK 2: 的 (de)"),
                        WordToken("可以", "kě yǐ", "Can", "Kosakata HSK 2: 可以 (kě yǐ)"),
                        WordToken("先", "xiān", "Beforehand; first; earlier", "Kosakata HSK 2: 先 (xiān)"),
                        WordToken("不", "bù", "No; not so", "Kosakata HSK 2: 不 (bù)"),
                        WordToken("做", "zuò", "To do; to engage in; to hold (a party etc)", "Kosakata HSK 2: 做 (zuò)")
                    )
                ),
                Sentence(
                    id = "s_mathexa_2",
                    hanzi = "45分钟后，考试结束了。",
                    pinyin = "fēn zhōng hòu kǎo shì jié shù le",
                    translation = "Empat puluh lima menit kemudian, waktu ujian pun selesai.",
                    tokens = listOf(
                        WordToken("分钟", "fēn zhōng", "Minute", "Kosakata HSK 2: 分钟 (fēn zhōng)"),
                        WordToken("后", "hòu", "Afterwards", "Kosakata HSK 2: 后 (hòu)"),
                        WordToken("考试", "kǎo shì", "Exam", "Kosakata HSK 2: 考试 (kǎo shì)"),
                        WordToken("结束", "jié shù", "To finish", "Kosakata HSK 2: 结束 (jié shù)"),
                        WordToken("了", "le", "(completed action marker)", "Kosakata HSK 2: 了 (le)")
                    )
                ),
                Sentence(
                    id = "s_mathexa_3",
                    hanzi = "老师在收试卷的时候，发现小明的试卷上什么也没有写。",
                    pinyin = "lǎo shī zài shōu shì juàn de shí hou fā xiàn xiǎo míng de shì juàn shàng shén me yě méi yǒu xiě",
                    translation = "Saat mengumpulkan lembar jawaban, guru mendapati kertas ujian Xiao Ming kosong melompong tanpa ada tulisan sedikit pun.",
                    tokens = listOf(
                        WordToken("老师", "lǎo shī", "Teacher", "Kosakata HSK 2: 老师 (lǎo shī)"),
                        WordToken("在", "zài", "(used before a verb to indicate an action in progress)", "Kosakata HSK 2: 在 (zài)"),
                        WordToken("收", "shōu", "To receive", "Kosakata HSK 2: 收 (shōu)"),
                        WordToken("试卷", "shì juàn", "Examination paper", "Kosakata HSK 2: 试卷 (shì juàn)"),
                        WordToken("的", "de", "Possessive particle (of; &#x27;s)", "Kosakata HSK 2: 的 (de)"),
                        WordToken("时候", "shí hou", "Time", "Kosakata HSK 2: 时候 (shí hou)"),
                        WordToken("发现", "fā xiàn", "To notice; to become aware of", "Kosakata HSK 2: 发现 (fā xiàn)"),
                        WordToken("小明", "xiǎo míng", "A placeholder personal name, literally “little ming”; often used like “john doe” in examples", "Kosakata HSK 2: 小明 (xiǎo míng)"),
                        WordToken("的", "de", "Possessive particle (of; &#x27;s)", "Kosakata HSK 2: 的 (de)"),
                        WordToken("试卷", "shì juàn", "Examination paper", "Kosakata HSK 2: 试卷 (shì juàn)"),
                        WordToken("上", "shàng", "(noun suffix) on; above", "Kosakata HSK 2: 上 (shàng)"),
                        WordToken("什么", "shén me", "Something; anything", "Kosakata HSK 2: 什么 (shén me)"),
                        WordToken("也", "yě", "Even (extreme or unexpected case)", "Kosakata HSK 2: 也 (yě)"),
                        WordToken("没有", "méi yǒu", "Haven&#x27;t", "Kosakata HSK 2: 没有 (méi yǒu)"),
                        WordToken("写", "xiě", "To write", "Kosakata HSK 2: 写 (xiě)")
                    )
                ),
                Sentence(
                    id = "s_mathexa_4",
                    hanzi = "老师问他：\"你怎么不做题？”",
                    pinyin = "lǎo shī wèn tā nǐ zěn me bù zuò tí",
                    translation = "Guru menegurnya dengan heran: “Kenapa kamu sama sekali tidak mengerjakan soal?”",
                    tokens = listOf(
                        WordToken("老师", "lǎo shī", "Teacher", "Kosakata HSK 2: 老师 (lǎo shī)"),
                        WordToken("问", "wèn", "To ask; to inquire", "Kosakata HSK 2: 问 (wèn)"),
                        WordToken("他", "tā", "He; him; his", "Kosakata HSK 2: 他 (tā)"),
                        WordToken("你", "nǐ", "You", "Kosakata HSK 2: 你 (nǐ)"),
                        WordToken("怎么", "zěn me", "How?", "Kosakata HSK 2: 怎么 (zěn me)"),
                        WordToken("不", "bù", "No; not so", "Kosakata HSK 2: 不 (bù)"),
                        WordToken("做", "zuò", "To do; to engage in; to hold (a party etc)", "Kosakata HSK 2: 做 (zuò)"),
                        WordToken("题", "tí", "Topic", "Kosakata HSK 2: 题 (tí)")
                    )
                ),
                Sentence(
                    id = "s_mathexa_5",
                    hanzi = "小明回答：\"你说男的可以不做。",
                    pinyin = "xiǎo míng huí dá nǐ shuō nán de kě yǐ bù zuò",
                    translation = "Xiao Ming menjawab dengan santai: “Tadi Ibu Guru bilang murid laki-laki (nán de) boleh tidak usah mengerjakan soal.",
                    tokens = listOf(
                        WordToken("小明", "xiǎo míng", "A placeholder personal name, literally “little ming”; often used like “john doe” in examples", "Kosakata HSK 2: 小明 (xiǎo míng)"),
                        WordToken("回答", "huí dá", "To reply; to answer", "Kosakata HSK 2: 回答 (huí dá)"),
                        WordToken("你", "nǐ", "You", "Kosakata HSK 2: 你 (nǐ)"),
                        WordToken("说", "shuō", "To speak; to talk; to say", "Kosakata HSK 2: 说 (shuō)"),
                        WordToken("男", "nán", "(bound form) male", "Kosakata HSK 2: 男 (nán)"),
                        WordToken("的", "de", "Possessive particle (of; &#x27;s)", "Kosakata HSK 2: 的 (de)"),
                        WordToken("可以", "kě yǐ", "Can", "Kosakata HSK 2: 可以 (kě yǐ)"),
                        WordToken("不", "bù", "No; not so", "Kosakata HSK 2: 不 (bù)"),
                        WordToken("做", "zuò", "To do; to engage in; to hold (a party etc)", "Kosakata HSK 2: 做 (zuò)")
                    )
                ),
                Sentence(
                    id = "s_mathexa_6",
                    hanzi = "\"老师很生气，说：\"我说的是难的题可以不做！”",
                    pinyin = "lǎo shī hěn shēng qì shuō wǒ shuō de shì nán de tí kě yǐ bù zuò",
                    translation = "” Guru sangat marah lalu membentak: “Maksud saya soal yang sulit (nán de) boleh tidak dikerjakan, bukan murid laki-laki!”",
                    tokens = listOf(
                        WordToken("老师", "lǎo shī", "Teacher", "Kosakata HSK 2: 老师 (lǎo shī)"),
                        WordToken("很", "hěn", "Very; quite", "Kosakata HSK 2: 很 (hěn)"),
                        WordToken("生气", "shēng qì", "To get angry; to be furious", "Kosakata HSK 2: 生气 (shēng qì)"),
                        WordToken("说", "shuō", "To speak; to talk; to say", "Kosakata HSK 2: 说 (shuō)"),
                        WordToken("我", "wǒ", "I; me; my", "Kosakata HSK 2: 我 (wǒ)"),
                        WordToken("说", "shuō", "To speak; to talk; to say", "Kosakata HSK 2: 说 (shuō)"),
                        WordToken("的", "de", "Possessive particle (of; &#x27;s)", "Kosakata HSK 2: 的 (de)"),
                        WordToken("是", "shì", "To be (followed by substantives only)", "Kosakata HSK 2: 是 (shì)"),
                        WordToken("难", "nán", "Difficult (to...)", "Kosakata HSK 2: 难 (nán)"),
                        WordToken("的", "de", "Possessive particle (of; &#x27;s)", "Kosakata HSK 2: 的 (de)"),
                        WordToken("题", "tí", "Topic", "Kosakata HSK 2: 题 (tí)"),
                        WordToken("可以", "kě yǐ", "Can", "Kosakata HSK 2: 可以 (kě yǐ)"),
                        WordToken("不", "bù", "No; not so", "Kosakata HSK 2: 不 (bù)"),
                        WordToken("做", "zuò", "To do; to engage in; to hold (a party etc)", "Kosakata HSK 2: 做 (zuò)")
                    )
                )
            ),
            questions = listOf(
                StoryQuestion(
                    id = "q_mathexa_1",
                    questionText = "数学老师在开考前给全班交代了什么做题建议？ (Saran apa yang disampaikan guru matematika sebelum ujian dimulai?)",
                    options = listOf("大家都不要写名字 (Semua orang jangan menulis nama)", "难的题可以先不做 (Soal yang sulit / nán de tí boleh dilewati dulu)", "可以互相抄答案 (Boleh saling menyontek)", "只做最后一道题 (Hanya kerjakan soal terakhir)"),
                    correctAnswerIndex = 1,
                    explanation = "Guru menyarankan mendahulukan soal mudah dan melewati soal yang rumit."
                ),
                StoryQuestion(
                    id = "q_mathexa_2",
                    questionText = "收卷时老师惊讶地发现了什么情况？ (Hal mengejutkan apa yang dijumpai guru saat mengumpulkan lembar jawaban?)",
                    options = listOf("小明的试卷上写满了画 (Kertas ujian Xiao Ming penuh coretan gambar)", "小明的试卷上干干净净，一个字都没写 (Lembar ujian Xiao Ming kosong melompong tanpa tulisan)", "试卷被撕破了 (Kertas ujian robek)", "小明交了十张卷子 (Xiao Ming mengumpulkan 10 lembar)"),
                    correctAnswerIndex = 1,
                    explanation = "Tidak ada satupun soal yang dikerjakan oleh Xiao Ming."
                ),
                StoryQuestion(
                    id = "q_mathexa_3",
                    questionText = "小明为什么认为自己可以完全不做题？ (Mengapa Xiao Ming beranggapan dirinya berhak tidak mengerjakan soal?)",
                    options = listOf("因为把“难的（nán de）”听成了“男的（nán de）” (Karena keliru mendengar kata 'soal sulit' menjadi 'murid laki-laki')", "因为他肚子痛 (Karena perutnya sakit)", "因为笔坏了 (Karena pulpennya macet)", "因为他全都会 (Karena sudah menguasai semuanya)"),
                    correctAnswerIndex = 0,
                    explanation = "Homofon pelafalan 'nán de' (sulit) disangka 'nán de' (laki-laki)."
                ),
                StoryQuestion(
                    id = "q_mathexa_4",
                    questionText = "这个语言幽默提醒汉语学习者应当注意什么？ (Pelajaran linguistik apa yang dapat dipetik oleh pembelajar bahasa Mandarin?)",
                    options = listOf("不需要学声调 (Tidak perlu belajar nada pelafalan)", "汉语同音词丰富，必须紧密结合上下文语境准确理解 (Bahasa Mandarin kaya akan homofon, mutlak dicerna sesuai konteks kalimat)", "汉字太容易学 (Karakter Hanzi sangat gampang)", "考试可以不写答案 (Ujian boleh dibiarkan kosong)"),
                    correctAnswerIndex = 1,
                    explanation = "Ketelitian memahami konteks semantik mencegah salah tafsir kata homofon."
                )
            )
        )
    )
}
