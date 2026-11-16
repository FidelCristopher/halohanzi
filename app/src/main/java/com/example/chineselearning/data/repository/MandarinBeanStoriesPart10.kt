package com.example.chineselearning.data.repository

import com.example.chineselearning.R
import com.example.chineselearning.data.model.Sentence
import com.example.chineselearning.data.model.Story
import com.example.chineselearning.data.model.StoryQuestion
import com.example.chineselearning.data.model.WordToken

val mandarinBeanStoriesPart10: List<Story> by lazy {
    listOf(
        // Cerita Mandarin Bean 119 (HSK 2): Too Many Hobbies (Terlalu Banyak Hobi)
        Story(
            id = "story_too_many_hobbies",
            titleHanzi = "爱好太多",
            titlePinyin = "Àihào Tài Duō",
            titleTranslation = "Too Many Hobbies (Terlalu Banyak Hobi)",
            level = "HSK 2",
            category = "Hobi & Minat",
            description = "Kebiasaan seorang anak yang gampang penasaran mencoba aneka hobi baru namun cepat bosan dan tidak pernah bertahan lama.",
            coverEmoji = "🎨",
            coverImageRes = R.drawable.cover_story_too_many_hobbies,
            estimatedReadMinutes = 2,
            sentences = listOf(
                Sentence(
                    id = "s_toomany_1",
                    hanzi = "小杨今年8岁，常常让爸爸妈妈不高兴。",
                    pinyin = "Xiǎo Yáng jīn nián suì cháng cháng ràng bà ba mā ma bù gāo xìng",
                    translation = "Xiao Yang tahun ini berusia 8 tahun, dan sering kali membuat ayah dan ibunya merasa serba salah.",
                    tokens = listOf(
                        WordToken("小杨", "Xiǎo Yáng", "Xiao yang; a common personal name", "Kosakata HSK 2: 小杨 (Xiǎo Yáng)"),
                        WordToken("今年", "jīn nián", "This year", "Kosakata HSK 2: 今年 (jīn nián)"),
                        WordToken("岁", "suì", "Classifier for years (of age)", "Kosakata HSK 2: 岁 (suì)"),
                        WordToken("常常", "cháng cháng", "Frequently; often", "Kosakata HSK 2: 常常 (cháng cháng)"),
                        WordToken("让", "ràng", "To permit", "Kosakata HSK 2: 让 (ràng)"),
                        WordToken("爸爸", "bà ba", "(coll.) father; dad", "Kosakata HSK 2: 爸爸 (bà ba)"),
                        WordToken("妈妈", "mā ma", "Mama", "Kosakata HSK 2: 妈妈 (mā ma)"),
                        WordToken("不", "bù", "No; not so", "Kosakata HSK 2: 不 (bù)"),
                        WordToken("高兴", "gāo xìng", "Happy", "Kosakata HSK 2: 高兴 (gāo xìng)")
                    )
                ),
                Sentence(
                    id = "s_toomany_2",
                    hanzi = "他说他想学画画，每个星期天妈妈都不休息，和他一起坐车到学校去。",
                    pinyin = "tā shuō tā xiǎng xué huà huà měi gè Xīng qī tiān mā ma dōu bù xiū xi hé tā yī qǐ zuò chē dào xué xiào qù",
                    translation = "Awalnya dia bilang ingin belajar melukis, setiap hari Minggu ibu merelakan waktu liburnya untuk naik bus mengantarnya ke sanggar seni.",
                    tokens = listOf(
                        WordToken("他", "tā", "He; him; his", "Kosakata HSK 2: 他 (tā)"),
                        WordToken("说", "shuō", "To speak; to talk; to say", "Kosakata HSK 2: 说 (shuō)"),
                        WordToken("他", "tā", "He; him; his", "Kosakata HSK 2: 他 (tā)"),
                        WordToken("想", "xiǎng", "To desire; to want (to)", "Kosakata HSK 2: 想 (xiǎng)"),
                        WordToken("学", "xué", "To learn", "Kosakata HSK 2: 学 (xué)"),
                        WordToken("画画", "huà huà", "To draw; to paint", "Kosakata HSK 2: 画画 (huà huà)"),
                        WordToken("每", "měi", "Each", "Kosakata HSK 2: 每 (měi)"),
                        WordToken("个", "gè", "Classifier for people or objects in general", "Kosakata HSK 2: 个 (gè)"),
                        WordToken("星期天", "Xīng qī tiān", "Sunday", "Kosakata HSK 2: 星期天 (Xīng qī tiān)"),
                        WordToken("妈妈", "mā ma", "Mama", "Kosakata HSK 2: 妈妈 (mā ma)"),
                        WordToken("都", "dōu", "All; both; entirely", "Kosakata HSK 2: 都 (dōu)"),
                        WordToken("不", "bù", "No; not so", "Kosakata HSK 2: 不 (bù)"),
                        WordToken("休息", "xiū xi", "To rest", "Kosakata HSK 2: 休息 (xiū xi)"),
                        WordToken("和", "hé", "And; together with", "Kosakata HSK 2: 和 (hé)"),
                        WordToken("他", "tā", "He; him; his", "Kosakata HSK 2: 他 (tā)"),
                        WordToken("一起", "yī qǐ", "Together; in company (with)", "Kosakata HSK 2: 一起 (yī qǐ)"),
                        WordToken("坐", "zuò", "To sit", "Kosakata HSK 2: 坐 (zuò)"),
                        WordToken("车", "chē", "Car", "Kosakata HSK 2: 车 (chē)"),
                        WordToken("到", "dào", "To reach; to arrive", "Kosakata HSK 2: 到 (dào)"),
                        WordToken("学校", "xué xiào", "School", "Kosakata HSK 2: 学校 (xué xiào)"),
                        WordToken("去", "qù", "(after a verb of motion) movement away from the speaker; (after certain verbs) detachment or separation", "Kosakata HSK 2: 去 (qù)")
                    )
                ),
                Sentence(
                    id = "s_toomany_3",
                    hanzi = "可是只学了两个月，他说画画不容易，不想学了。",
                    pinyin = "kě shì zhǐ xué le liǎng gè yuè tā shuō huà huà bù róng yì bù xiǎng xué le",
                    translation = "Namun baru belajar dua bulan, dia mengeluh melukis itu sulit dan tidak mau belajar lagi.",
                    tokens = listOf(
                        WordToken("可是", "kě shì", "But; however", "Kosakata HSK 2: 可是 (kě shì)"),
                        WordToken("只", "zhǐ", "Only; merely; just", "Kosakata HSK 2: 只 (zhǐ)"),
                        WordToken("学", "xué", "To learn", "Kosakata HSK 2: 学 (xué)"),
                        WordToken("了", "le", "(completed action marker)", "Kosakata HSK 2: 了 (le)"),
                        WordToken("两", "liǎng", "Two", "Kosakata HSK 2: 两 (liǎng)"),
                        WordToken("个", "gè", "Classifier for people or objects in general", "Kosakata HSK 2: 个 (gè)"),
                        WordToken("月", "yuè", "Month", "Kosakata HSK 2: 月 (yuè)"),
                        WordToken("他", "tā", "He; him; his", "Kosakata HSK 2: 他 (tā)"),
                        WordToken("说", "shuō", "To speak; to talk; to say", "Kosakata HSK 2: 说 (shuō)"),
                        WordToken("画画", "huà huà", "To draw; to paint", "Kosakata HSK 2: 画画 (huà huà)"),
                        WordToken("不", "bù", "No; not so", "Kosakata HSK 2: 不 (bù)"),
                        WordToken("容易", "róng yì", "Easy; straightforward", "Kosakata HSK 2: 容易 (róng yì)"),
                        WordToken("不", "bù", "No; not so", "Kosakata HSK 2: 不 (bù)"),
                        WordToken("想", "xiǎng", "To desire; to want (to)", "Kosakata HSK 2: 想 (xiǎng)"),
                        WordToken("学", "xué", "To learn", "Kosakata HSK 2: 学 (xué)"),
                        WordToken("了", "le", "(completed action marker)", "Kosakata HSK 2: 了 (le)")
                    )
                ),
                Sentence(
                    id = "s_toomany_4",
                    hanzi = "他又说想学唱歌，爸爸就请老师来家里教他，现在刚学了一个月，他就说唱歌也没意思。",
                    pinyin = "tā yòu shuō xiǎng xué chàng gē bà ba jiù qǐng lǎo shī lái jiā lǐ jiāo tā xiàn zài gāng xué le yī gè yuè tā jiù shuō chàng gē yě méi yì si",
                    translation = "Lalu dia bilang ingin belajar menyanyi, ayah pun mendatangkan guru les vokal ke rumah, tetapi baru belajar sebulan dia sudah bilang menyanyi itu membosankan.",
                    tokens = listOf(
                        WordToken("他", "tā", "He; him; his", "Kosakata HSK 2: 他 (tā)"),
                        WordToken("又", "yòu", "(once) again", "Kosakata HSK 2: 又 (yòu)"),
                        WordToken("说", "shuō", "To speak; to talk; to say", "Kosakata HSK 2: 说 (shuō)"),
                        WordToken("想", "xiǎng", "To desire; to want (to)", "Kosakata HSK 2: 想 (xiǎng)"),
                        WordToken("学", "xué", "To learn", "Kosakata HSK 2: 学 (xué)"),
                        WordToken("唱歌", "chàng gē", "To sing a song", "Kosakata HSK 2: 唱歌 (chàng gē)"),
                        WordToken("爸爸", "bà ba", "(coll.) father; dad", "Kosakata HSK 2: 爸爸 (bà ba)"),
                        WordToken("就", "jiù", "In that case; then", "Kosakata HSK 2: 就 (jiù)"),
                        WordToken("请", "qǐng", "To invite", "Kosakata HSK 2: 请 (qǐng)"),
                        WordToken("老师", "lǎo shī", "Teacher", "Kosakata HSK 2: 老师 (lǎo shī)"),
                        WordToken("来", "lái", "To come", "Kosakata HSK 2: 来 (lái)"),
                        WordToken("家", "jiā", "Home", "Kosakata HSK 2: 家 (jiā)"),
                        WordToken("里", "lǐ", "Lining", "Kosakata HSK 2: 里 (lǐ)"),
                        WordToken("教", "jiāo", "To teach; to instruct", "Kosakata HSK 2: 教 (jiāo)"),
                        WordToken("他", "tā", "He; him; his", "Kosakata HSK 2: 他 (tā)"),
                        WordToken("现在", "xiàn zài", "Now; at present; currently", "Kosakata HSK 2: 现在 (xiàn zài)"),
                        WordToken("刚", "gāng", "Just", "Kosakata HSK 2: 刚 (gāng)"),
                        WordToken("学", "xué", "To learn", "Kosakata HSK 2: 学 (xué)"),
                        WordToken("了", "le", "(completed action marker)", "Kosakata HSK 2: 了 (le)"),
                        WordToken("一", "yī", "One", "Kosakata HSK 2: 一 (yī)"),
                        WordToken("个", "gè", "Classifier for people or objects in general", "Kosakata HSK 2: 个 (gè)"),
                        WordToken("月", "yuè", "Month", "Kosakata HSK 2: 月 (yuè)"),
                        WordToken("他", "tā", "He; him; his", "Kosakata HSK 2: 他 (tā)"),
                        WordToken("就", "jiù", "Merely; nothing else but; simply; just; precisely; exactly", "Kosakata HSK 2: 就 (jiù)"),
                        WordToken("说", "shuō", "To speak; to talk; to say", "Kosakata HSK 2: 说 (shuō)"),
                        WordToken("唱歌", "chàng gē", "To sing a song", "Kosakata HSK 2: 唱歌 (chàng gē)"),
                        WordToken("也", "yě", "Also; too; as well; (not ...) either", "Kosakata HSK 2: 也 (yě)"),
                        WordToken("没", "méi", "(negative prefix for verbs) have not; not", "Kosakata HSK 2: 没 (méi)"),
                        WordToken("意思", "yì si", "Interest", "Kosakata HSK 2: 意思 (yì si)")
                    )
                ),
                Sentence(
                    id = "s_toomany_5",
                    hanzi = "爱好太多，但是不能坚持。",
                    pinyin = "ài hào tài duō dàn shì bù néng jiān chí",
                    translation = "Hobinya terlalu banyak berganti-ganti, tetapi tidak ada yang ditekuni dengan gigih.",
                    tokens = listOf(
                        WordToken("爱好", "ài hào", "Interest; hobby", "Kosakata HSK 2: 爱好 (ài hào)"),
                        WordToken("太", "tài", "Too (much)", "Kosakata HSK 2: 太 (tài)"),
                        WordToken("多", "duō", "Too many; in excess", "Kosakata HSK 2: 多 (duō)"),
                        WordToken("但是", "dàn shì", "But; however", "Kosakata HSK 2: 但是 (dàn shì)"),
                        WordToken("不", "bù", "No; not so", "Kosakata HSK 2: 不 (bù)"),
                        WordToken("能", "néng", "Can", "Kosakata HSK 2: 能 (néng)"),
                        WordToken("坚持", "jiān chí", "To persevere with", "Kosakata HSK 2: 坚持 (jiān chí)")
                    )
                ),
                Sentence(
                    id = "s_toomany_6",
                    hanzi = "现在爸爸妈妈不知道怎么办了，是不是别的孩子也这样呢？",
                    pinyin = "xiàn zài bà ba mā ma bù zhī dào zěn me bàn le shì bù shì bié de hái zi yě zhè yàng ne",
                    translation = "Sekarang ayah dan ibu bingung harus bersikap bagaimana, apakah anak-anak lain juga memiliki tabiat serupa?",
                    tokens = listOf(
                        WordToken("现在", "xiàn zài", "Now; at present; currently", "Kosakata HSK 2: 现在 (xiàn zài)"),
                        WordToken("爸爸", "bà ba", "(coll.) father; dad", "Kosakata HSK 2: 爸爸 (bà ba)"),
                        WordToken("妈妈", "mā ma", "Mama", "Kosakata HSK 2: 妈妈 (mā ma)"),
                        WordToken("不", "bù", "No; not so", "Kosakata HSK 2: 不 (bù)"),
                        WordToken("知道", "zhī dào", "To know; to become aware of", "Kosakata HSK 2: 知道 (zhī dào)"),
                        WordToken("怎么办", "zěn me bàn", "What&#x27;s to be done", "Kosakata HSK 2: 怎么办 (zěn me bàn)"),
                        WordToken("了", "le", "(completed action marker)", "Kosakata HSK 2: 了 (le)"),
                        WordToken("是", "shì", "To be (followed by substantives only)", "Kosakata HSK 2: 是 (shì)"),
                        WordToken("不是", "bù shì", "Is not", "Kosakata HSK 2: 不是 (bù shì)"),
                        WordToken("别的", "bié de", "Else", "Kosakata HSK 2: 别的 (bié de)"),
                        WordToken("孩子", "hái zi", "Child", "Kosakata HSK 2: 孩子 (hái zi)"),
                        WordToken("也", "yě", "Also; too; as well; (not ...) either", "Kosakata HSK 2: 也 (yě)"),
                        WordToken("这样", "zhè yàng", "This way; like this; so", "Kosakata HSK 2: 这样 (zhè yàng)"),
                        WordToken("呢", "ne", "(sentence-final particle) used in questions to link back to prior discourse or context (&quot;what about...?&quot;, &quot;and...?&quot;)", "Kosakata HSK 2: 呢 (ne)")
                    )
                )
            ),
            questions = listOf(
                StoryQuestion(
                    id = "q_toomany_1",
                    questionText = "小杨在业余时间先后尝试了哪些兴趣爱好？ (Hobi apa saja yang sempat dicoba oleh Xiao Yang?)",
                    options = listOf("画画和唱歌 (Melukis dan menyanyi)", "骑马和游泳 (Berkuda dan berenang)", "弹钢琴和下棋 (Main piano dan catur)", "踢足球和打篮球 (Main sepak bola dan basket)"),
                    correctAnswerIndex = 0,
                    explanation = "Xiao Yang sempat mengambil les melukis lalu berganti les menyanyi vokal."
                ),
                StoryQuestion(
                    id = "q_toomany_2",
                    questionText = "小杨在学习这些特长时表现出了什么共同缺点？ (Kelemahan apa yang selalu berulang dalam setiap les yang diikutinya?)",
                    options = listOf("三分钟热度，遇到困难就无法坚持 (Hangat-hangat tahi ayam, lekas menyerah tatkala menghadapi rintangan)", "学得太快让老师害怕 (Belajar terlalu cepat hingga guru kewalahan)", "花费太少 (Biayanya terlalu sedikit)", "每天都练十个小时 (Latihan 10 jam setiap hari)"),
                    correctAnswerIndex = 0,
                    explanation = "Cepat bosan dan enggan berproses melalui kesulitan awal."
                ),
                StoryQuestion(
                    id = "q_toomany_3",
                    questionText = "父母为了支持小杨发展特长付出了哪些努力？ (Pengorbanan apa yang telah dicurahkan orang tua demi bakat sang anak?)",
                    options = listOf("不管不顾 (Masa bodoh tanpa kepedulian)", "放弃周末休息接送，甚至花钱请老师上门辅导 (Mengorbankan libur akhir pekan dan mengundang guru privat ke rumah)", "打骂惩罚 (Memukul dan menghukum)", "逼他退学 (Memaksa keluar sekolah)"),
                    correctAnswerIndex = 1,
                    explanation = "Orang tua mengerahkan segenap waktu dan biaya untuk memfasilitasi anak."
                ),
                StoryQuestion(
                    id = "q_toomany_4",
                    questionText = "培养一门真正的特长最重要的品质是什么？ (Kunci pokok apakah yang paling esensial dalam menguasai sebuah keahlian?)",
                    options = listOf("频繁更换新项目 (Kerap bergonta-ganti bidang baru)", "持之以恒的毅力、耐得住寂寞的专注与刻苦练习 (Ketekunan yang gigih, fokus mendalam, dan latihan berkelanjutan)", "随心所欲 (Bertindak sesuka hati tanpa arah)", "完全靠天赋 (Murni mengandalkan bakat alam tanpa usaha)"),
                    correctAnswerIndex = 1,
                    explanation = "Ketekunan melampaui kebosanan adalah jembatan menuju penguasaan sejati."
                )
            )
        ),
        // Cerita Mandarin Bean 120 (HSK 2): My Good Friend (Sahabat Baikku)
        Story(
            id = "story_my_good_friend",
            titleHanzi = "我的好朋友",
            titlePinyin = "Wǒ de Hǎo Péngyou",
            titleTranslation = "My Good Friend (Sahabat Baikku)",
            level = "HSK 2",
            category = "Persahabatan & Santai",
            description = "Kisah ikatan persahabatan sejati yang terjalin sejak kecil dan tetap awet meski menempuh jalan hidup dan kota yang berbeda.",
            coverEmoji = "🍻",
            coverImageRes = R.drawable.cover_story_my_good_friend,
            estimatedReadMinutes = 2,
            sentences = listOf(
                Sentence(
                    id = "s_mygoodf_1",
                    hanzi = "我的好朋友名字叫陈陈。",
                    pinyin = "wǒ de hǎo péng you míng zi jiào Chén Chén",
                    translation = "Sahabat karib saya bernama Chen Chen.",
                    tokens = listOf(
                        WordToken("我", "wǒ", "I; me; my", "Kosakata HSK 2: 我 (wǒ)"),
                        WordToken("的", "de", "Possessive particle (of; &#x27;s)", "Kosakata HSK 2: 的 (de)"),
                        WordToken("好", "hǎo", "(of two people) close; on intimate terms", "Kosakata HSK 2: 好 (hǎo)"),
                        WordToken("朋友", "péng you", "Friend", "Kosakata HSK 2: 朋友 (péng you)"),
                        WordToken("名字", "míng zi", "Name (of a person or thing)", "Kosakata HSK 2: 名字 (míng zi)"),
                        WordToken("叫", "jiào", "To be called", "Kosakata HSK 2: 叫 (jiào)"),
                        WordToken("陈陈", "Chén Chén", "A personal name; chen chen", "Kosakata HSK 2: 陈陈 (Chén Chén)")
                    )
                ),
                Sentence(
                    id = "s_mygoodf_2",
                    hanzi = "他喜欢喝酒，我喜欢运动。",
                    pinyin = "tā xǐ huan hē jiǔ wǒ xǐ huan yùn dòng",
                    translation = "Dia gemar minum bir bersantai, sedangkan saya gemar berolahraga bugar.",
                    tokens = listOf(
                        WordToken("他", "tā", "He; him; his", "Kosakata HSK 2: 他 (tā)"),
                        WordToken("喜欢", "xǐ huan", "To like; to be fond of", "Kosakata HSK 2: 喜欢 (xǐ huan)"),
                        WordToken("喝", "hē", "To drink", "Kosakata HSK 2: 喝 (hē)"),
                        WordToken("酒", "jiǔ", "Wine (esp. rice wine)", "Kosakata HSK 2: 酒 (jiǔ)"),
                        WordToken("我", "wǒ", "I; me; my", "Kosakata HSK 2: 我 (wǒ)"),
                        WordToken("喜欢", "xǐ huan", "To like; to be fond of", "Kosakata HSK 2: 喜欢 (xǐ huan)"),
                        WordToken("运动", "yùn dòng", "To exercise", "Kosakata HSK 2: 运动 (yùn dòng)")
                    )
                ),
                Sentence(
                    id = "s_mygoodf_3",
                    hanzi = "小学和中学，我们都是一个班的同学。",
                    pinyin = "xiǎo xué hé zhōng xué wǒ men dōu shì yī gè bān de tóng xué",
                    translation = "Waktu SD dan SMP, kami selalu menjadi teman sekelas di satu ruangan.",
                    tokens = listOf(
                        WordToken("小学", "xiǎo xué", "Elementary school; primary school", "Kosakata HSK 2: 小学 (xiǎo xué)"),
                        WordToken("和", "hé", "And; together with", "Kosakata HSK 2: 和 (hé)"),
                        WordToken("中学", "zhōng xué", "Middle school", "Kosakata HSK 2: 中学 (zhōng xué)"),
                        WordToken("我们", "wǒ men", "We; us; ourselves; our", "Kosakata HSK 2: 我们 (wǒ men)"),
                        WordToken("都", "dōu", "All; both; entirely", "Kosakata HSK 2: 都 (dōu)"),
                        WordToken("是", "shì", "To be (followed by substantives only)", "Kosakata HSK 2: 是 (shì)"),
                        WordToken("一", "yī", "One", "Kosakata HSK 2: 一 (yī)"),
                        WordToken("个", "gè", "Classifier for people or objects in general", "Kosakata HSK 2: 个 (gè)"),
                        WordToken("班", "bān", "Team; class; grade", "Kosakata HSK 2: 班 (bān)"),
                        WordToken("的", "de", "Possessive particle (of; &#x27;s)", "Kosakata HSK 2: 的 (de)"),
                        WordToken("同学", "tóng xué", "Fellow student", "Kosakata HSK 2: 同学 (tóng xué)")
                    )
                ),
                Sentence(
                    id = "s_mygoodf_4",
                    hanzi = "大学我们不在一个学校，但是我们还在一个城市生活。",
                    pinyin = "dà xué wǒ men bù zài yī gè xué xiào dàn shì wǒ men hái zài yī gè chéng shì shēng huó",
                    translation = "Di bangku kuliah kampus kami berbeda, tetapi kami tetap tinggal dan beraktivitas di kota yang sama.",
                    tokens = listOf(
                        WordToken("大学", "dà xué", "University", "Kosakata HSK 2: 大学 (dà xué)"),
                        WordToken("我们", "wǒ men", "We; us; ourselves; our", "Kosakata HSK 2: 我们 (wǒ men)"),
                        WordToken("不", "bù", "No; not so", "Kosakata HSK 2: 不 (bù)"),
                        WordToken("在", "zài", "(of sb or sth) to be (located) at", "Kosakata HSK 2: 在 (zài)"),
                        WordToken("一", "yī", "One", "Kosakata HSK 2: 一 (yī)"),
                        WordToken("个", "gè", "Classifier for people or objects in general", "Kosakata HSK 2: 个 (gè)"),
                        WordToken("学校", "xué xiào", "School", "Kosakata HSK 2: 学校 (xué xiào)"),
                        WordToken("但是", "dàn shì", "But; however", "Kosakata HSK 2: 但是 (dàn shì)"),
                        WordToken("我们", "wǒ men", "We; us; ourselves; our", "Kosakata HSK 2: 我们 (wǒ men)"),
                        WordToken("还", "hái", "Still, still in progress, yet", "Kosakata HSK 2: 还 (hái)"),
                        WordToken("在", "zài", "(of sb or sth) to be (located) at", "Kosakata HSK 2: 在 (zài)"),
                        WordToken("一", "yī", "One", "Kosakata HSK 2: 一 (yī)"),
                        WordToken("个", "gè", "Classifier for people or objects in general", "Kosakata HSK 2: 个 (gè)"),
                        WordToken("城市", "chéng shì", "City; town", "Kosakata HSK 2: 城市 (chéng shì)"),
                        WordToken("生活", "shēng huó", "To live", "Kosakata HSK 2: 生活 (shēng huó)")
                    )
                ),
                Sentence(
                    id = "s_mygoodf_5",
                    hanzi = "后来他去了杭州工作，我去了上海，但是我们还是经常见面。",
                    pinyin = "hòu lái tā qù le Háng zhōu gōng zuò wǒ qù le Shàng hǎi dàn shì wǒ men hái shi jīng cháng jiàn miàn",
                    translation = "Kelak setelah lulus dia bekerja di Hangzhou dan saya bekerja di Shanghai, namun kami berdua tetap rutin saling mengunjungi dan bertemu.",
                    tokens = listOf(
                        WordToken("后来", "hòu lái", "Afterwards; later", "Kosakata HSK 2: 后来 (hòu lái)"),
                        WordToken("他", "tā", "He; him; his", "Kosakata HSK 2: 他 (tā)"),
                        WordToken("去", "qù", "To go, to go to", "Kosakata HSK 2: 去 (qù)"),
                        WordToken("了", "le", "(completed action marker)", "Kosakata HSK 2: 了 (le)"),
                        WordToken("杭州", "Háng zhōu", "Hangzhou, a city in zhejiang province, china.", "Kosakata HSK 2: 杭州 (Háng zhōu)"),
                        WordToken("工作", "gōng zuò", "To work", "Kosakata HSK 2: 工作 (gōng zuò)"),
                        WordToken("我", "wǒ", "I; me; my", "Kosakata HSK 2: 我 (wǒ)"),
                        WordToken("去", "qù", "To go, to go to", "Kosakata HSK 2: 去 (qù)"),
                        WordToken("了", "le", "(completed action marker)", "Kosakata HSK 2: 了 (le)"),
                        WordToken("上海", "Shàng hǎi", "Shanghai municipality", "Kosakata HSK 2: 上海 (Shàng hǎi)"),
                        WordToken("但是", "dàn shì", "But; however", "Kosakata HSK 2: 但是 (dàn shì)"),
                        WordToken("我们", "wǒ men", "We; us; ourselves; our", "Kosakata HSK 2: 我们 (wǒ men)"),
                        WordToken("还是", "hái shi", "Still (as before)", "Kosakata HSK 2: 还是 (hái shi)"),
                        WordToken("经常", "jīng cháng", "Frequently; constantly; regularly; often", "Kosakata HSK 2: 经常 (jīng cháng)"),
                        WordToken("见面", "jiàn miàn", "To meet; to see each other", "Kosakata HSK 2: 见面 (jiàn miàn)")
                    )
                )
            ),
            questions = listOf(
                StoryQuestion(
                    id = "q_mygoodf_1",
                    questionText = "我和好朋友陈陈从什么时候就开始相识相伴？ (Sejak kapan pertemanan antara saya dan Chen Chen bermula?)",
                    options = listOf("大学毕业后 (Setelah lulus kuliah)", "从小学和初中就在同一个班级 (Sejak masa SD dan SMP di kelas yang sama)", "在去杭州的火车上 (Di dalam kereta jurusan Hangzhou)", "上周才认识 (Baru kenal minggu lalu)"),
                    correctAnswerIndex = 1,
                    explanation = "Jalinan persahabatan masa kecil yang tumbuh bersama di bangku sekolah."
                ),
                StoryQuestion(
                    id = "q_mygoodf_2",
                    questionText = "我和陈陈在日常爱好上有什么有趣的互补与不同？ (Perbedaan minat apa yang mewarnai keseharian kami berdua?)",
                    options = listOf("两个人都爱看电视 (Keduanya sama-sama suka nonton TV)", "他喜欢喝酒小聚，我偏爱体育运动 (Dia gemar minum santai, sedangkan saya gemar olahraga bugar)", "他不喜欢交朋友 (Dia tidak suka berteman)", "我们每天都吵架 (Kami bertengkar setiap hari)"),
                    correctAnswerIndex = 1,
                    explanation = "Perbedaan karakter kegemaran tidak menghalangi kedekatan rasa persaudaraan."
                ),
                StoryQuestion(
                    id = "q_mygoodf_3",
                    questionText = "毕业工作后，我们分别前往了哪两座城市发展？ (Ke dua kota manakah kami masing-masing merantau meniti karier?)",
                    options = listOf("北京和广州 (Beijing dan Guangzhou)", "陈陈去了杭州，我去了上海 (Chen Chen bekerja di Hangzhou, saya di Shanghai)", "深圳和成都 (Shenzhen dan Chengdu)", "南京和武汉 (Nanjing dan Wuhan)"),
                    correctAnswerIndex = 1,
                    explanation = "Meski terpisah di dua kota metropolitan yang berlainan, komunikasi tetap erat."
                ),
                StoryQuestion(
                    id = "q_mygoodf_4",
                    questionText = "维系一段跨越漫长岁月深厚友谊的秘诀在于什么？ (Pilar kokoh apakah yang menjaga keabadian persahabatan sejati?)",
                    options = listOf("彼此珍视、常怀挂念与不论距离多远依然常相聚 (Saling menghargai, menjaga kepedulian tulus, dan meluangkan waktu bertemu)", "天天在一起攀比薪水 (Saling memamerkan gaji penghasilan)", "有事才联系无事不登门 (Hanya menghubungi saat butuh bantuan saja)", "毕业就断绝往来 (Putus kontak begitu kelulusan tiba)"),
                    correctAnswerIndex = 0,
                    explanation = "Ketulusan ikatan batin mampu melintasi batas geografis kota dan kesibukan hidup."
                )
            )
        ),
        // Cerita Mandarin Bean 121 (HSK 2): Prepare for Travel (Bersiap Liburan)
        Story(
            id = "story_prepare_for_travel",
            titleHanzi = "准备旅游",
            titlePinyin = "Zhǔnbèi Lǚyóu",
            titleTranslation = "Prepare for Travel (Bersiap Liburan)",
            level = "HSK 2",
            category = "Liburan & Perjalanan",
            description = "Antusiasme dan kebimbangan saat merencanakan destinasi liburan serta godaan membawa barang bawaan berlebih ke dalam koper.",
            coverEmoji = "🧳",
            coverImageRes = R.drawable.cover_story_prepare_for_travel,
            estimatedReadMinutes = 2,
            sentences = listOf(
                Sentence(
                    id = "s_prepare_1",
                    hanzi = "下个月我想去旅游，但是还没想好去哪儿。",
                    pinyin = "xià gè yuè wǒ xiǎng qù lǚ yóu dàn shì hái méi xiǎng hǎo qù nǎ r",
                    translation = "Bulan depan saya ingin pergi berlibur, tetapi sampai sekarang belum memutuskan hendak pergi ke mana.",
                    tokens = listOf(
                        WordToken("下", "xià", "Later", "Kosakata HSK 2: 下 (xià)"),
                        WordToken("个", "gè", "Classifier for people or objects in general", "Kosakata HSK 2: 个 (gè)"),
                        WordToken("月", "yuè", "Month", "Kosakata HSK 2: 月 (yuè)"),
                        WordToken("我", "wǒ", "I; me; my", "Kosakata HSK 2: 我 (wǒ)"),
                        WordToken("想", "xiǎng", "To desire; to want (to)", "Kosakata HSK 2: 想 (xiǎng)"),
                        WordToken("去", "qù", "To go, to go to", "Kosakata HSK 2: 去 (qù)"),
                        WordToken("旅游", "lǚ yóu", "To travel", "Kosakata HSK 2: 旅游 (lǚ yóu)"),
                        WordToken("但是", "dàn shì", "But; however", "Kosakata HSK 2: 但是 (dàn shì)"),
                        WordToken("还", "hái", "Still, still in progress, yet", "Kosakata HSK 2: 还 (hái)"),
                        WordToken("没", "méi", "(negative prefix for verbs) have not; not", "Kosakata HSK 2: 没 (méi)"),
                        WordToken("想", "xiǎng", "To think (about)", "Kosakata HSK 2: 想 (xiǎng)"),
                        WordToken("好", "hǎo", "(verb complement indicating completion)", "Kosakata HSK 2: 好 (hǎo)"),
                        WordToken("去", "qù", "To go, to go to", "Kosakata HSK 2: 去 (qù)"),
                        WordToken("哪儿", "nǎ r", "Where?", "Kosakata HSK 2: 哪儿 (nǎ r)")
                    )
                ),
                Sentence(
                    id = "s_prepare_2",
                    hanzi = "朋友觉得北方好玩，但是下个月北方太冷了，南方好一些，不冷也不热。",
                    pinyin = "péng you jué de běi fāng hǎo wán dàn shì xià gè yuè běi fāng tài lěng le nán fāng hǎo yī xiē bù lěng yě bù rè",
                    translation = "Teman saya menyarankan wilayah utara sangat seru, namun bulan depan wilayah utara terlalu dingin bersalju, wilayah selatan rasanya lebih nyaman karena suhunya sejuk pas.",
                    tokens = listOf(
                        WordToken("朋友", "péng you", "Friend", "Kosakata HSK 2: 朋友 (péng you)"),
                        WordToken("觉得", "jué de", "To think that ...; to feel that ...", "Kosakata HSK 2: 觉得 (jué de)"),
                        WordToken("北方", "běi fāng", "North", "Kosakata HSK 2: 北方 (běi fāng)"),
                        WordToken("好玩", "hǎo wán", "Amusing", "Kosakata HSK 2: 好玩 (hǎo wán)"),
                        WordToken("但是", "dàn shì", "But; however", "Kosakata HSK 2: 但是 (dàn shì)"),
                        WordToken("下", "xià", "Later", "Kosakata HSK 2: 下 (xià)"),
                        WordToken("个", "gè", "Classifier for people or objects in general", "Kosakata HSK 2: 个 (gè)"),
                        WordToken("月", "yuè", "Month", "Kosakata HSK 2: 月 (yuè)"),
                        WordToken("北方", "běi fāng", "North", "Kosakata HSK 2: 北方 (běi fāng)"),
                        WordToken("太", "tài", "Too (much)", "Kosakata HSK 2: 太 (tài)"),
                        WordToken("冷", "lěng", "Cold", "Kosakata HSK 2: 冷 (lěng)"),
                        WordToken("了", "le", "(completed action marker)", "Kosakata HSK 2: 了 (le)"),
                        WordToken("南方", "nán fāng", "South; southern direction", "Kosakata HSK 2: 南方 (nán fāng)"),
                        WordToken("好", "hǎo", "Good", "Kosakata HSK 2: 好 (hǎo)"),
                        WordToken("一些", "yī xiē", "Some; a few; a little; (following an adjective) slightly ...er", "Kosakata HSK 2: 一些 (yī xiē)"),
                        WordToken("不", "bù", "No; not so", "Kosakata HSK 2: 不 (bù)"),
                        WordToken("冷", "lěng", "Cold", "Kosakata HSK 2: 冷 (lěng)"),
                        WordToken("也", "yě", "Also; too; as well; (not ...) either", "Kosakata HSK 2: 也 (yě)"),
                        WordToken("不", "bù", "No; not so", "Kosakata HSK 2: 不 (bù)"),
                        WordToken("热", "rè", "Hot (of weather)", "Kosakata HSK 2: 热 (rè)")
                    )
                ),
                Sentence(
                    id = "s_prepare_3",
                    hanzi = "旅游的时候水果、面包、手机、电脑、地图，我都想带去。",
                    pinyin = "lǚ yóu de shí hou shuǐ guǒ miàn bāo shǒu jī diàn nǎo dì tú wǒ dōu xiǎng dài qù",
                    translation = "Saat mengepak barang liburan, buah-buahan, roti, ponsel, laptop, hingga peta semuanya ingin saya masukkan ke koper.",
                    tokens = listOf(
                        WordToken("旅游", "lǚ yóu", "To travel", "Kosakata HSK 2: 旅游 (lǚ yóu)"),
                        WordToken("的", "de", "Possessive particle (of; &#x27;s)", "Kosakata HSK 2: 的 (de)"),
                        WordToken("时候", "shí hou", "Time", "Kosakata HSK 2: 时候 (shí hou)"),
                        WordToken("水果", "shuǐ guǒ", "Fruit", "Kosakata HSK 2: 水果 (shuǐ guǒ)"),
                        WordToken("面包", "miàn bāo", "Bread", "Kosakata HSK 2: 面包 (miàn bāo)"),
                        WordToken("手机", "shǒu jī", "Cell phone; mobile phone", "Kosakata HSK 2: 手机 (shǒu jī)"),
                        WordToken("电脑", "diàn nǎo", "Computer", "Kosakata HSK 2: 电脑 (diàn nǎo)"),
                        WordToken("地图", "dì tú", "Map", "Kosakata HSK 2: 地图 (dì tú)"),
                        WordToken("我", "wǒ", "I; me; my", "Kosakata HSK 2: 我 (wǒ)"),
                        WordToken("都", "dōu", "All; both; entirely", "Kosakata HSK 2: 都 (dōu)"),
                        WordToken("想", "xiǎng", "To desire; to want (to)", "Kosakata HSK 2: 想 (xiǎng)"),
                        WordToken("带", "dài", "To wear", "Kosakata HSK 2: 带 (dài)"),
                        WordToken("去", "qù", "(after a verb of motion) movement away from the speaker; (after certain verbs) detachment or separation", "Kosakata HSK 2: 去 (qù)")
                    )
                ),
                Sentence(
                    id = "s_prepare_4",
                    hanzi = "朋友说应该少带一些东西，因为这是旅游，不是搬家。",
                    pinyin = "péng you shuō yīng gāi shǎo dài yī xiē dōng xi yīn wèi zhè shì lǚ yóu bù shì bān jiā",
                    translation = "Teman saya mengingatkan agar membawa barang secukupnya saja, karena ini perjalanan wisata santai, bukan pindahan rumah.",
                    tokens = listOf(
                        WordToken("朋友", "péng you", "Friend", "Kosakata HSK 2: 朋友 (péng you)"),
                        WordToken("说", "shuō", "To speak; to talk; to say", "Kosakata HSK 2: 说 (shuō)"),
                        WordToken("应该", "yīng gāi", "Ought to; should; must", "Kosakata HSK 2: 应该 (yīng gāi)"),
                        WordToken("少", "shǎo", "Few", "Kosakata HSK 2: 少 (shǎo)"),
                        WordToken("带", "dài", "To wear", "Kosakata HSK 2: 带 (dài)"),
                        WordToken("一些", "yī xiē", "Some; a few; a little; (following an adjective) slightly ...er", "Kosakata HSK 2: 一些 (yī xiē)"),
                        WordToken("东西", "dōng xi", "Thing", "Kosakata HSK 2: 东西 (dōng xi)"),
                        WordToken("因为", "yīn wèi", "Because; owing to; on account of", "Kosakata HSK 2: 因为 (yīn wèi)"),
                        WordToken("这", "zhè", "This; these", "Kosakata HSK 2: 这 (zhè)"),
                        WordToken("是", "shì", "To be (followed by substantives only)", "Kosakata HSK 2: 是 (shì)"),
                        WordToken("旅游", "lǚ yóu", "Trip", "Kosakata HSK 2: 旅游 (lǚ yóu)"),
                        WordToken("不是", "bù shì", "No", "Kosakata HSK 2: 不是 (bù shì)"),
                        WordToken("搬家", "bān jiā", "To move house; to relocate", "Kosakata HSK 2: 搬家 (bān jiā)")
                    )
                ),
                Sentence(
                    id = "s_prepare_5",
                    hanzi = "但是我还是想多带一些衣服，这样每天都可以穿漂亮的衣服照相。",
                    pinyin = "dàn shì wǒ hái shi xiǎng duō dài yī xiē yī fu zhè yàng měi tiān dōu kě yǐ chuān piào liang de yī fu zhào xiàng",
                    translation = "Namun saya tetap bersikukuh ingin membawa banyak pakaian modis, agar setiap hari bisa berfoto cantik dengan aneka busana yang berbeda.",
                    tokens = listOf(
                        WordToken("但是", "dàn shì", "But; however", "Kosakata HSK 2: 但是 (dàn shì)"),
                        WordToken("我", "wǒ", "I; me; my", "Kosakata HSK 2: 我 (wǒ)"),
                        WordToken("还是", "hái shi", "Still (as before)", "Kosakata HSK 2: 还是 (hái shi)"),
                        WordToken("想", "xiǎng", "To desire; to want (to)", "Kosakata HSK 2: 想 (xiǎng)"),
                        WordToken("多", "duō", "Many; much; more; a lot of", "Kosakata HSK 2: 多 (duō)"),
                        WordToken("带", "dài", "To wear", "Kosakata HSK 2: 带 (dài)"),
                        WordToken("一些", "yī xiē", "Some; a few; a little; (following an adjective) slightly ...er", "Kosakata HSK 2: 一些 (yī xiē)"),
                        WordToken("衣服", "yī fu", "Clothes", "Kosakata HSK 2: 衣服 (yī fu)"),
                        WordToken("这样", "zhè yàng", "This way; like this; so", "Kosakata HSK 2: 这样 (zhè yàng)"),
                        WordToken("每", "měi", "Each", "Kosakata HSK 2: 每 (měi)"),
                        WordToken("天", "tiān", "Day", "Kosakata HSK 2: 天 (tiān)"),
                        WordToken("都", "dōu", "All; both; entirely", "Kosakata HSK 2: 都 (dōu)"),
                        WordToken("可以", "kě yǐ", "Can", "Kosakata HSK 2: 可以 (kě yǐ)"),
                        WordToken("穿", "chuān", "To wear", "Kosakata HSK 2: 穿 (chuān)"),
                        WordToken("漂亮", "piào liang", "Pretty; beautiful", "Kosakata HSK 2: 漂亮 (piào liang)"),
                        WordToken("的", "de", "Possessive particle (of; &#x27;s)", "Kosakata HSK 2: 的 (de)"),
                        WordToken("衣服", "yī fu", "Clothes", "Kosakata HSK 2: 衣服 (yī fu)"),
                        WordToken("照相", "zhào xiàng", "To take a photograph", "Kosakata HSK 2: 照相 (zhào xiàng)")
                    )
                )
            ),
            questions = listOf(
                StoryQuestion(
                    id = "q_prepare_1",
                    questionText = "作者在选择下个月旅游目的地时面临什么气候顾虑？ (Pertimbangan cuaca apa yang dihadapi penulis dalam menentukan arah liburan?)",
                    options = listOf("到处都下暴雨 (Semua daerah diguyur badai)", "北方下个月气候过于寒冷，南方温度适宜不冷不热 (Wilayah utara terlalu dingin bersalju, wilayah selatan sejuk nyaman)", "南方天气太干 (Wilayah selatan terlalu gersang)", "国外无法办理护照 (Tidak bisa mengurus paspor ke luar negeri)"),
                    correctAnswerIndex = 1,
                    explanation = "Suhu udara kawasan selatan yang hangat menjadikannya opsi destinasi terbaik."
                ),
                StoryQuestion(
                    id = "q_prepare_2",
                    questionText = "朋友在看到作者准备打包的物品后提出了什么中肯建议？ (Nasihat apa yang dilontarkan teman melihat tumpukan barang yang hendak dikemas?)",
                    options = listOf("东西带得太少了 (Barang yang dibawa masih terlalu sedikit)", "应该少带些物品，这是去度假旅游而不是搬家 (Bawalah barang secukupnya, ini perjalanan wisata bukan pindahan rumah)", "不要带手机 (Jangan membawa ponsel)", "必须带三口大锅 (Wajib membawa tiga wajan besar)"),
                    correctAnswerIndex = 1,
                    explanation = "Teman mengingatkan kepraktisan ransel agar tidak membebani mobilitas rute perjalanan."
                ),
                StoryQuestion(
                    id = "q_prepare_3",
                    questionText = "作者为什么执意想在行李箱里多塞进几套漂亮的衣服？ (Mengapa sang penulis tetap berhasrat mengemas banyak pakaian modis?)",
                    options = listOf("为了每天都能穿上不同的漂亮服装拍照留念 (Agar setiap hari bisa berganti busana anggun untuk difoto)", "拿去景点卖掉 (Untuk dijual di tempat wisata)", "送给当地居民 (Untuk disedekahkan ke penduduk setempat)", "天气太冷需要全套套在身上 (Karena kedinginan ingin memakai semua baju rangkap)"),
                    correctAnswerIndex = 0,
                    explanation = "Hasrat mengabadikan momen perjalanan dalam jepretan foto kamera yang menawan."
                ),
                StoryQuestion(
                    id = "q_prepare_4",
                    questionText = "合理的旅行行囊规划应当遵循怎样的原则？ (Prinsip berkemas ideal apakah yang dianjurkan dalam perjalanan santai?)",
                    options = listOf("能塞多少就塞多少 (Bawa sebanyak mungkin barang yang muat)", "轻装简行、按需携带与注重实用舒适 (Berkemas praktis, bawa yang pokok sesuai kebutuhan, dan utamakan kenyamanan)", "只带现金不带衣物 (Hanya membawa uang tunai tanpa baju ganti)", "把整个衣柜搬走 (Membawa seluruh isi lemari pakaian)"),
                    correctAnswerIndex = 1,
                    explanation = "Beban koper yang ringkas memudahkan mobilitas menikmati panorama alam secara leluasa."
                )
            )
        ),
        // Cerita Mandarin Bean 122 (HSK 2): Dancing (Menari)
        Story(
            id = "story_dancing",
            titleHanzi = "跳舞",
            titlePinyin = "Tiàowǔ",
            titleTranslation = "Dancing (Menari)",
            level = "HSK 2",
            category = "Aktivitas & Kebugaran",
            description = "Kisah bijak seorang instruktur tari yang menyadarkan orang tua agar tidak memaksakan impian masa lalunya kepada anak.",
            coverEmoji = "💃",
            coverImageRes = R.drawable.cover_story_dancing,
            estimatedReadMinutes = 2,
            sentences = listOf(
                Sentence(
                    id = "s_dancing_1",
                    hanzi = "张老师最近有了一个新学生，她是个八岁的小女孩，她的妈妈带着她来学跳舞。",
                    pinyin = "Zhāng lǎo shī zuì jìn yǒu le yī gè xīn xué shēng tā shì gè bā suì de xiǎo nǚ hái tā de mā ma dài zhe tā lái xué tiào wǔ",
                    translation = "Guru Zhang baru-baru ini kedatangan murid baru, seorang gadis kecil berusia delapan tahun yang diantar ibunya belajar menari.",
                    tokens = listOf(
                        WordToken("张", "Zhāng", "Surname zhang", "Kosakata HSK 2: 张 (Zhāng)"),
                        WordToken("老师", "lǎo shī", "Teacher", "Kosakata HSK 2: 老师 (lǎo shī)"),
                        WordToken("最近", "zuì jìn", "Recently", "Kosakata HSK 2: 最近 (zuì jìn)"),
                        WordToken("有", "yǒu", "To have; there is", "Kosakata HSK 2: 有 (yǒu)"),
                        WordToken("了", "le", "(completed action marker)", "Kosakata HSK 2: 了 (le)"),
                        WordToken("一", "yī", "One", "Kosakata HSK 2: 一 (yī)"),
                        WordToken("个", "gè", "Classifier for people or objects in general", "Kosakata HSK 2: 个 (gè)"),
                        WordToken("新", "xīn", "New; newly", "Kosakata HSK 2: 新 (xīn)"),
                        WordToken("学生", "xué shēng", "Student", "Kosakata HSK 2: 学生 (xué shēng)"),
                        WordToken("她", "tā", "She", "Kosakata HSK 2: 她 (tā)"),
                        WordToken("是", "shì", "To be (followed by substantives only)", "Kosakata HSK 2: 是 (shì)"),
                        WordToken("个", "gè", "Classifier for people or objects in general", "Kosakata HSK 2: 个 (gè)"),
                        WordToken("八", "bā", "Eight", "Kosakata HSK 2: 八 (bā)"),
                        WordToken("岁", "suì", "Classifier for years (of age)", "Kosakata HSK 2: 岁 (suì)"),
                        WordToken("的", "de", "Possessive particle (of; &#x27;s)", "Kosakata HSK 2: 的 (de)"),
                        WordToken("小", "xiǎo", "Young", "Kosakata HSK 2: 小 (xiǎo)"),
                        WordToken("女孩", "nǚ hái", "Girl; lass", "Kosakata HSK 2: 女孩 (nǚ hái)"),
                        WordToken("她的", "tā de", "Her; hers", "Kosakata HSK 2: 她的 (tā de)"),
                        WordToken("妈妈", "mā ma", "Mama", "Kosakata HSK 2: 妈妈 (mā ma)"),
                        WordToken("带", "dài", "To wear", "Kosakata HSK 2: 带 (dài)"),
                        WordToken("着", "zhe", "Aspect particle indicating action in progress or ongoing state", "Kosakata HSK 2: 着 (zhe)"),
                        WordToken("她", "tā", "She", "Kosakata HSK 2: 她 (tā)"),
                        WordToken("来", "lái", "(between two verbs) in order to", "Kosakata HSK 2: 来 (lái)"),
                        WordToken("学", "xué", "To learn", "Kosakata HSK 2: 学 (xué)"),
                        WordToken("跳舞", "tiào wǔ", "To dance", "Kosakata HSK 2: 跳舞 (tiào wǔ)")
                    )
                ),
                Sentence(
                    id = "s_dancing_2",
                    hanzi = "上课一个月以后，老师发现这个女孩每次上课都不笑。",
                    pinyin = "shàng kè yī gè yuè yǐ hòu lǎo shī fā xiàn zhè gè nǚ hái měi cì shàng kè dōu bù xiào",
                    translation = "Setelah sebulan berlatih, sang guru mengamati bahwa gadis kecil itu sama sekali tidak pernah tersenyum di kelas.",
                    tokens = listOf(
                        WordToken("上课", "shàng kè", "To go to class", "Kosakata HSK 2: 上课 (shàng kè)"),
                        WordToken("一", "yī", "One", "Kosakata HSK 2: 一 (yī)"),
                        WordToken("个", "gè", "Classifier for people or objects in general", "Kosakata HSK 2: 个 (gè)"),
                        WordToken("月", "yuè", "Month", "Kosakata HSK 2: 月 (yuè)"),
                        WordToken("以后", "yǐ hòu", "After", "Kosakata HSK 2: 以后 (yǐ hòu)"),
                        WordToken("老师", "lǎo shī", "Teacher", "Kosakata HSK 2: 老师 (lǎo shī)"),
                        WordToken("发现", "fā xiàn", "To notice; to become aware of", "Kosakata HSK 2: 发现 (fā xiàn)"),
                        WordToken("这", "zhè", "This; these", "Kosakata HSK 2: 这 (zhè)"),
                        WordToken("个", "gè", "Classifier for people or objects in general", "Kosakata HSK 2: 个 (gè)"),
                        WordToken("女孩", "nǚ hái", "Girl; lass", "Kosakata HSK 2: 女孩 (nǚ hái)"),
                        WordToken("每", "měi", "Each", "Kosakata HSK 2: 每 (měi)"),
                        WordToken("次", "cì", "Classifier for enumerated events: time", "Kosakata HSK 2: 次 (cì)"),
                        WordToken("上课", "shàng kè", "To go to class", "Kosakata HSK 2: 上课 (shàng kè)"),
                        WordToken("都", "dōu", "All; both; entirely", "Kosakata HSK 2: 都 (dōu)"),
                        WordToken("不", "bù", "No; not so", "Kosakata HSK 2: 不 (bù)"),
                        WordToken("笑", "xiào", "To laugh; to smile", "Kosakata HSK 2: 笑 (xiào)")
                    )
                ),
                Sentence(
                    id = "s_dancing_3",
                    hanzi = "原来是这个女孩的妈妈逼她来学跳舞，但是小女孩不喜欢。",
                    pinyin = "yuán lái shì zhè gè nǚ hái de mā ma bī tā lái xué tiào wǔ dàn shì xiǎo nǚ hái bù xǐ huan",
                    translation = "Usut punya usut, rupanya sang ibu lah yang memaksanya ikut kursus tari, padahal si anak sama sekali tidak menyukainya.",
                    tokens = listOf(
                        WordToken("原来", "yuán lái", "So, actually, as it turns out", "Kosakata HSK 2: 原来 (yuán lái)"),
                        WordToken("是", "shì", "Indeed (used for emphasis)", "Kosakata HSK 2: 是 (shì)"),
                        WordToken("这", "zhè", "This; these", "Kosakata HSK 2: 这 (zhè)"),
                        WordToken("个", "gè", "Classifier for people or objects in general", "Kosakata HSK 2: 个 (gè)"),
                        WordToken("女孩", "nǚ hái", "Girl; lass", "Kosakata HSK 2: 女孩 (nǚ hái)"),
                        WordToken("的", "de", "Possessive particle (of; &#x27;s)", "Kosakata HSK 2: 的 (de)"),
                        WordToken("妈妈", "mā ma", "Mama", "Kosakata HSK 2: 妈妈 (mā ma)"),
                        WordToken("逼", "bī", "To force (sb to do sth)", "Kosakata HSK 2: 逼 (bī)"),
                        WordToken("她", "tā", "She", "Kosakata HSK 2: 她 (tā)"),
                        WordToken("来", "lái", "(between two verbs) in order to", "Kosakata HSK 2: 来 (lái)"),
                        WordToken("学", "xué", "To learn", "Kosakata HSK 2: 学 (xué)"),
                        WordToken("跳舞", "tiào wǔ", "To dance", "Kosakata HSK 2: 跳舞 (tiào wǔ)"),
                        WordToken("但是", "dàn shì", "But; however", "Kosakata HSK 2: 但是 (dàn shì)"),
                        WordToken("小", "xiǎo", "Young", "Kosakata HSK 2: 小 (xiǎo)"),
                        WordToken("女孩", "nǚ hái", "Girl; lass", "Kosakata HSK 2: 女孩 (nǚ hái)"),
                        WordToken("不", "bù", "No; not so", "Kosakata HSK 2: 不 (bù)"),
                        WordToken("喜欢", "xǐ huan", "To like; to be fond of", "Kosakata HSK 2: 喜欢 (xǐ huan)")
                    )
                ),
                Sentence(
                    id = "s_dancing_4",
                    hanzi = "老师问这个妈妈为什么一定要让孩子学跳舞？",
                    pinyin = "lǎo shī wèn zhè gè mā ma wèi shén me yī dìng yào ràng hái zi xué tiào wǔ",
                    translation = "Guru Zhang pun bertanya kepada sang ibu mengapa bersikeras mewajibkan anaknya belajar menari.",
                    tokens = listOf(
                        WordToken("老师", "lǎo shī", "Teacher", "Kosakata HSK 2: 老师 (lǎo shī)"),
                        WordToken("问", "wèn", "To ask; to inquire", "Kosakata HSK 2: 问 (wèn)"),
                        WordToken("这", "zhè", "This; these", "Kosakata HSK 2: 这 (zhè)"),
                        WordToken("个", "gè", "Classifier for people or objects in general", "Kosakata HSK 2: 个 (gè)"),
                        WordToken("妈妈", "mā ma", "Mama", "Kosakata HSK 2: 妈妈 (mā ma)"),
                        WordToken("为什么", "wèi shén me", "Why?", "Kosakata HSK 2: 为什么 (wèi shén me)"),
                        WordToken("一定", "yī dìng", "Surely; certainly; definitely", "Kosakata HSK 2: 一定 (yī dìng)"),
                        WordToken("要", "yào", "Will; shall; about to", "Kosakata HSK 2: 要 (yào)"),
                        WordToken("让", "ràng", "To permit", "Kosakata HSK 2: 让 (ràng)"),
                        WordToken("孩子", "hái zi", "Child", "Kosakata HSK 2: 孩子 (hái zi)"),
                        WordToken("学", "xué", "To learn", "Kosakata HSK 2: 学 (xué)"),
                        WordToken("跳舞", "tiào wǔ", "To dance", "Kosakata HSK 2: 跳舞 (tiào wǔ)")
                    )
                ),
                Sentence(
                    id = "s_dancing_5",
                    hanzi = "这个妈妈说，因为她从小就觉得会跳舞的人都很美，所以想让孩子来学。",
                    pinyin = "zhè gè mā ma shuō yīn wèi tā cóng xiǎo jiù jué de huì tiào wǔ de rén dōu hěn měi suǒ yǐ xiǎng ràng hái zi lái xué",
                    translation = "Sang ibu beralasan bahwa sejak kecil ia mengagumi para penari yang tampak begitu anggun dan cantik, sehingga ingin anaknya mewujudkan impian itu.",
                    tokens = listOf(
                        WordToken("这", "zhè", "This; these", "Kosakata HSK 2: 这 (zhè)"),
                        WordToken("个", "gè", "Classifier for people or objects in general", "Kosakata HSK 2: 个 (gè)"),
                        WordToken("妈妈", "mā ma", "Mama", "Kosakata HSK 2: 妈妈 (mā ma)"),
                        WordToken("说", "shuō", "To speak; to talk; to say", "Kosakata HSK 2: 说 (shuō)"),
                        WordToken("因为", "yīn wèi", "Because; owing to; on account of", "Kosakata HSK 2: 因为 (yīn wèi)"),
                        WordToken("她", "tā", "She", "Kosakata HSK 2: 她 (tā)"),
                        WordToken("从", "cóng", "From; through; via", "Kosakata HSK 2: 从 (cóng)"),
                        WordToken("小", "xiǎo", "Young", "Kosakata HSK 2: 小 (xiǎo)"),
                        WordToken("就", "jiù", "Merely; nothing else but; simply; just; precisely; exactly", "Kosakata HSK 2: 就 (jiù)"),
                        WordToken("觉得", "jué de", "To think that ...; to feel that ...", "Kosakata HSK 2: 觉得 (jué de)"),
                        WordToken("会", "huì", "Can; to have the skill; to know how to", "Kosakata HSK 2: 会 (huì)"),
                        WordToken("跳舞", "tiào wǔ", "To dance", "Kosakata HSK 2: 跳舞 (tiào wǔ)"),
                        WordToken("的", "de", "Possessive particle (of; &#x27;s)", "Kosakata HSK 2: 的 (de)"),
                        WordToken("人", "rén", "Person; people", "Kosakata HSK 2: 人 (rén)"),
                        WordToken("都", "dōu", "All; both; entirely", "Kosakata HSK 2: 都 (dōu)"),
                        WordToken("很", "hěn", "Very; quite", "Kosakata HSK 2: 很 (hěn)"),
                        WordToken("美", "měi", "Beautiful", "Kosakata HSK 2: 美 (měi)"),
                        WordToken("所以", "suǒ yǐ", "Therefore", "Kosakata HSK 2: 所以 (suǒ yǐ)"),
                        WordToken("想", "xiǎng", "To desire; to want (to)", "Kosakata HSK 2: 想 (xiǎng)"),
                        WordToken("让", "ràng", "To permit", "Kosakata HSK 2: 让 (ràng)"),
                        WordToken("孩子", "hái zi", "Child", "Kosakata HSK 2: 孩子 (hái zi)"),
                        WordToken("来", "lái", "(between two verbs) in order to", "Kosakata HSK 2: 来 (lái)"),
                        WordToken("学", "xué", "To learn", "Kosakata HSK 2: 学 (xué)")
                    )
                ),
                Sentence(
                    id = "s_dancing_6",
                    hanzi = "老师说：那么下次孩子就不用来了，她不喜欢，也不快乐，喜欢跳舞的是你，你才应该来当我的学生。",
                    pinyin = "lǎo shī shuō nà me xià cì hái zi jiù bù yòng lái le tā bù xǐ huan yě bù kuài lè xǐ huan tiào wǔ de shì nǐ nǐ cái yīng gāi lái dāng wǒ de xué shēng",
                    translation = "Guru Zhang dengan bijak menasihati: “Kalau begitu mulai minggu depan anak ini tidak perlu datang lagi; dia tidak suka dan tidak bahagia di sini. Yang gemar menari adalah Anda, maka Anda lah yang seharusnya menjadi murid saya.”",
                    tokens = listOf(
                        WordToken("老师", "lǎo shī", "Teacher", "Kosakata HSK 2: 老师 (lǎo shī)"),
                        WordToken("说", "shuō", "To speak; to talk; to say", "Kosakata HSK 2: 说 (shuō)"),
                        WordToken("那么", "nà me", "Then; in that case", "Kosakata HSK 2: 那么 (nà me)"),
                        WordToken("下", "xià", "Later", "Kosakata HSK 2: 下 (xià)"),
                        WordToken("次", "cì", "Classifier for enumerated events: time", "Kosakata HSK 2: 次 (cì)"),
                        WordToken("孩子", "hái zi", "Child", "Kosakata HSK 2: 孩子 (hái zi)"),
                        WordToken("就", "jiù", "In that case; then", "Kosakata HSK 2: 就 (jiù)"),
                        WordToken("不", "bù", "No; not so", "Kosakata HSK 2: 不 (bù)"),
                        WordToken("用", "yòng", "To need; to have to (usu. used in the negative or in questions)", "Kosakata HSK 2: 用 (yòng)"),
                        WordToken("来", "lái", "To come", "Kosakata HSK 2: 来 (lái)"),
                        WordToken("了", "le", "(completed action marker)", "Kosakata HSK 2: 了 (le)"),
                        WordToken("她", "tā", "She", "Kosakata HSK 2: 她 (tā)"),
                        WordToken("不", "bù", "No; not so", "Kosakata HSK 2: 不 (bù)"),
                        WordToken("喜欢", "xǐ huan", "To like; to be fond of", "Kosakata HSK 2: 喜欢 (xǐ huan)"),
                        WordToken("也", "yě", "Also; too; as well; (not ...) either", "Kosakata HSK 2: 也 (yě)"),
                        WordToken("不", "bù", "No; not so", "Kosakata HSK 2: 不 (bù)"),
                        WordToken("快乐", "kuài lè", "Happy; joyful", "Kosakata HSK 2: 快乐 (kuài lè)"),
                        WordToken("喜欢", "xǐ huan", "To like; to be fond of", "Kosakata HSK 2: 喜欢 (xǐ huan)"),
                        WordToken("跳舞", "tiào wǔ", "To dance", "Kosakata HSK 2: 跳舞 (tiào wǔ)"),
                        WordToken("的", "de", "Possessive particle (of; &#x27;s)", "Kosakata HSK 2: 的 (de)"),
                        WordToken("是", "shì", "To be (followed by substantives only)", "Kosakata HSK 2: 是 (shì)"),
                        WordToken("你", "nǐ", "You", "Kosakata HSK 2: 你 (nǐ)"),
                        WordToken("你", "nǐ", "You", "Kosakata HSK 2: 你 (nǐ)"),
                        WordToken("才", "cái", "Then and only then", "Kosakata HSK 2: 才 (cái)"),
                        WordToken("应该", "yīng gāi", "Ought to; should; must", "Kosakata HSK 2: 应该 (yīng gāi)"),
                        WordToken("来", "lái", "To come", "Kosakata HSK 2: 来 (lái)"),
                        WordToken("当", "dāng", "To be", "Kosakata HSK 2: 当 (dāng)"),
                        WordToken("我的", "wǒ de", "My; mine", "Kosakata HSK 2: 我的 (wǒ de)"),
                        WordToken("学生", "xué shēng", "Student", "Kosakata HSK 2: 学生 (xué shēng)")
                    )
                )
            ),
            questions = listOf(
                StoryQuestion(
                    id = "q_dancing_1",
                    questionText = "张老师在上课一个月后发现了新学生身上的什么反常现象？ (Kejanggalan apa yang disadari Guru Zhang pada diri murid ciliknya sebulan berlatih?)",
                    options = listOf("女孩学得太快 (Murid itu belajar terlalu kilat)", "女孩每次来上课脸上都毫无笑容，显得很不快乐 (Gadis kecil itu tidak pernah tersenyum di kelas dan tampak murung)", "女孩总是在课堂上吃零食 (Murid sering makan camilan di studio)", "女孩每天都迟到 (Murid selalu telat tiba)"),
                    correctAnswerIndex = 1,
                    explanation = "Raut muka muram tanpa senyuman mencerminkan batin yang tertekan."
                ),
                StoryQuestion(
                    id = "q_dancing_2",
                    questionText = "这位八岁的小女孩为什么会被送来学习舞蹈？ (Mengapa anak berusia delapan tahun itu diikutkan ke kelas tari?)",
                    options = listOf("出于自身极度强烈的爱好 (Murni atas kemauan hobi diri sendiri)", "母亲出于自己从小对舞蹈之美的执念而强行强迫她来学 (Ibu memaksanya demi mewujudkan impian pribadi masa lalunya)", "医生开的药方 (Resep rujukan dokter medis)", "学校的强制考试 (Tuntutan wajib ujian sekolah)"),
                    correctAnswerIndex = 1,
                    explanation = "Obsesi sang ibu memproyeksikan kerinduan pribadinya kepada putrinya."
                ),
                StoryQuestion(
                    id = "q_dancing_3",
                    questionText = "面对这种状况，张老师做出了什么令人赞许的开明决定？ (Keputusan bijak apa yang diambil oleh Guru Zhang menghadapi situasi tersebut?)",
                    options = listOf("狠狠斥责女孩不努力 (Memarahi gadis kecil itu)", "劝阻孩子继续来上课，并直言真正该学跳舞的是这位母亲 (Menyarankan anak berhenti dan mengajak sang ibu yang justru belajar menari)", "要求翻倍缴纳学费 (Meminta bayaran SPP dua kali lipat)", "将孩子关在练功房 (Mengurung anak di sanggar latihan)"),
                    correctAnswerIndex = 1,
                    explanation = "Menghargai kebahagiaan anak dan menyadarkan ego sang orang tua."
                ),
                StoryQuestion(
                    id = "q_dancing_4",
                    questionText = "这个故事给广大家长带来了怎样深刻的教育启迪？ (Refleksi pengasuhan mendalam apa yang dihadirkan lewat kisah ini?)",
                    options = listOf("孩子必须毫无保留地实现父母未竟的心愿 (Anak wajib menuntaskan cita-cita orang tua)", "应当尊重孩子的个性天赋与真实兴趣，勿将成年人的意愿强加于下一代 (Hormati bakat minat asli anak, jangan memaksakan kehendak orang tua)", "禁止让孩子学艺术 (Larang anak belajar seni)", "上课只要交钱就行 (Asal bayar les urusan beres)"),
                    correctAnswerIndex = 1,
                    explanation = "Membiarkan anak bertumbuh sesuai benih potensinya dengan gembira dan merdeka."
                )
            )
        ),
        // Cerita Mandarin Bean 123 (HSK 2): Ten Fruits (Sepuluh Buah)
        Story(
            id = "story_ten_fruits",
            titleHanzi = "十个水果",
            titlePinyin = "Shí Gè Shuǐguǒ",
            titleTranslation = "Ten Fruits (Sepuluh Buah)",
            level = "HSK 2",
            category = "Humor & Belanja",
            description = "Jawaban matematika lucu seorang anak yang beranggapan buah yang sudah masuk ke perut tetap miliknya.",
            coverEmoji = "🍉",
            coverImageRes = R.drawable.cover_story_ten_fruits,
            estimatedReadMinutes = 2,
            sentences = listOf(
                Sentence(
                    id = "s_tenfrui_1",
                    hanzi = "妈妈问儿子：儿子，如果你有十个水果，吃了四个，那么你还有几个水果？",
                    pinyin = "mā ma wèn ér zi ér zi rú guǒ nǐ yǒu shí gè shuǐ guǒ chī le sì gè nà me nǐ hái yǒu jǐ gè shuǐ guǒ",
                    translation = "Ibu memberikan tebak-tebakan matematika kepada putranya: “Nak, jika kamu punya sepuluh buah, lalu kamu memakan empat buah, tinggal berapa buah yang kamu miliki?”",
                    tokens = listOf(
                        WordToken("妈妈", "mā ma", "Mama", "Kosakata HSK 2: 妈妈 (mā ma)"),
                        WordToken("问", "wèn", "To ask; to inquire", "Kosakata HSK 2: 问 (wèn)"),
                        WordToken("儿子", "ér zi", "Son", "Kosakata HSK 2: 儿子 (ér zi)"),
                        WordToken("儿子", "ér zi", "Son", "Kosakata HSK 2: 儿子 (ér zi)"),
                        WordToken("如果", "rú guǒ", "If; in case; in the event that", "Kosakata HSK 2: 如果 (rú guǒ)"),
                        WordToken("你", "nǐ", "You", "Kosakata HSK 2: 你 (nǐ)"),
                        WordToken("有", "yǒu", "To have; there is", "Kosakata HSK 2: 有 (yǒu)"),
                        WordToken("十", "shí", "Ten", "Kosakata HSK 2: 十 (shí)"),
                        WordToken("个", "gè", "Classifier for people or objects in general", "Kosakata HSK 2: 个 (gè)"),
                        WordToken("水果", "shuǐ guǒ", "Fruit", "Kosakata HSK 2: 水果 (shuǐ guǒ)"),
                        WordToken("吃", "chī", "To eat; to consume", "Kosakata HSK 2: 吃 (chī)"),
                        WordToken("了", "le", "(completed action marker)", "Kosakata HSK 2: 了 (le)"),
                        WordToken("四", "sì", "Four", "Kosakata HSK 2: 四 (sì)"),
                        WordToken("个", "gè", "Classifier for people or objects in general", "Kosakata HSK 2: 个 (gè)"),
                        WordToken("那么", "nà me", "Then; in that case", "Kosakata HSK 2: 那么 (nà me)"),
                        WordToken("你", "nǐ", "You", "Kosakata HSK 2: 你 (nǐ)"),
                        WordToken("还", "hái", "Still, still in progress, yet", "Kosakata HSK 2: 还 (hái)"),
                        WordToken("有", "yǒu", "To have; there is", "Kosakata HSK 2: 有 (yǒu)"),
                        WordToken("几", "jǐ", "How much", "Kosakata HSK 2: 几 (jǐ)"),
                        WordToken("个", "gè", "Classifier for people or objects in general", "Kosakata HSK 2: 个 (gè)"),
                        WordToken("水果", "shuǐ guǒ", "Fruit", "Kosakata HSK 2: 水果 (shuǐ guǒ)")
                    )
                ),
                Sentence(
                    id = "s_tenfrui_2",
                    hanzi = "儿子说：十个。",
                    pinyin = "ér zi shuō shí gè",
                    translation = "Putranya menjawab yakin: “Sepuluh buah!”",
                    tokens = listOf(
                        WordToken("儿子", "ér zi", "Son", "Kosakata HSK 2: 儿子 (ér zi)"),
                        WordToken("说", "shuō", "To speak; to talk; to say", "Kosakata HSK 2: 说 (shuō)"),
                        WordToken("十", "shí", "Ten", "Kosakata HSK 2: 十 (shí)"),
                        WordToken("个", "gè", "Classifier for people or objects in general", "Kosakata HSK 2: 个 (gè)")
                    )
                ),
                Sentence(
                    id = "s_tenfrui_3",
                    hanzi = "妈妈说：不对，为什么是十个？",
                    pinyin = "mā ma shuō bù duì wèi shén me shì shí gè",
                    translation = "Ibu heran: “Salah dong, kenapa bisa tetap sepuluh?”",
                    tokens = listOf(
                        WordToken("妈妈", "mā ma", "Mama", "Kosakata HSK 2: 妈妈 (mā ma)"),
                        WordToken("说", "shuō", "To speak; to talk; to say", "Kosakata HSK 2: 说 (shuō)"),
                        WordToken("不", "bù", "No; not so", "Kosakata HSK 2: 不 (bù)"),
                        WordToken("对", "duì", "Right; correct", "Kosakata HSK 2: 对 (duì)"),
                        WordToken("为什么", "wèi shén me", "Why?", "Kosakata HSK 2: 为什么 (wèi shén me)"),
                        WordToken("是", "shì", "To be (followed by substantives only)", "Kosakata HSK 2: 是 (shì)"),
                        WordToken("十", "shí", "Ten", "Kosakata HSK 2: 十 (shí)"),
                        WordToken("个", "gè", "Classifier for people or objects in general", "Kosakata HSK 2: 个 (gè)")
                    )
                ),
                Sentence(
                    id = "s_tenfrui_4",
                    hanzi = "儿子说：因为四个水果在我的肚子里面，还有六个在外面，四加六等于十，不对吗？",
                    pinyin = "ér zi shuō yīn wèi sì gè shuǐ guǒ zài wǒ de dù zi lǐ miàn hái yǒu liù gè zài wài miàn sì jiā liù děng yú shí bù duì ma",
                    translation = "Putranya tersenyum cerdik menjawab: “Karena empat buah sudah masuk tersimpan aman di dalam perut saya, dan enam buah lagi ada di atas meja; empat tambah enam bukankah tetap sepuluh buah?”",
                    tokens = listOf(
                        WordToken("儿子", "ér zi", "Son", "Kosakata HSK 2: 儿子 (ér zi)"),
                        WordToken("说", "shuō", "To speak; to talk; to say", "Kosakata HSK 2: 说 (shuō)"),
                        WordToken("因为", "yīn wèi", "Because; owing to; on account of", "Kosakata HSK 2: 因为 (yīn wèi)"),
                        WordToken("四", "sì", "Four", "Kosakata HSK 2: 四 (sì)"),
                        WordToken("个", "gè", "Classifier for people or objects in general", "Kosakata HSK 2: 个 (gè)"),
                        WordToken("水果", "shuǐ guǒ", "Fruit", "Kosakata HSK 2: 水果 (shuǐ guǒ)"),
                        WordToken("在", "zài", "(of sb or sth) to be (located) at", "Kosakata HSK 2: 在 (zài)"),
                        WordToken("我", "wǒ", "I; me; my", "Kosakata HSK 2: 我 (wǒ)"),
                        WordToken("的", "de", "Possessive particle (of; &#x27;s)", "Kosakata HSK 2: 的 (de)"),
                        WordToken("肚子", "dù zi", "Belly", "Kosakata HSK 2: 肚子 (dù zi)"),
                        WordToken("里面", "lǐ miàn", "Inside", "Kosakata HSK 2: 里面 (lǐ miàn)"),
                        WordToken("还", "hái", "Still, still in progress, yet", "Kosakata HSK 2: 还 (hái)"),
                        WordToken("有", "yǒu", "To have; there is", "Kosakata HSK 2: 有 (yǒu)"),
                        WordToken("六", "liù", "Six", "Kosakata HSK 2: 六 (liù)"),
                        WordToken("个", "gè", "Classifier for people or objects in general", "Kosakata HSK 2: 个 (gè)"),
                        WordToken("在", "zài", "(of sb or sth) to be (located) at", "Kosakata HSK 2: 在 (zài)"),
                        WordToken("外面", "wài miàn", "Outside", "Kosakata HSK 2: 外面 (wài miàn)"),
                        WordToken("四", "sì", "Four", "Kosakata HSK 2: 四 (sì)"),
                        WordToken("加", "jiā", "(math.) plus", "Kosakata HSK 2: 加 (jiā)"),
                        WordToken("六", "liù", "Six", "Kosakata HSK 2: 六 (liù)"),
                        WordToken("等于", "děng yú", "To equal", "Kosakata HSK 2: 等于 (děng yú)"),
                        WordToken("十", "shí", "Ten", "Kosakata HSK 2: 十 (shí)"),
                        WordToken("不", "bù", "No; not so", "Kosakata HSK 2: 不 (bù)"),
                        WordToken("对", "duì", "Right; correct", "Kosakata HSK 2: 对 (duì)"),
                        WordToken("吗", "ma", "(question particle for &quot;yes-no&quot; questions)", "Kosakata HSK 2: 吗 (ma)")
                    )
                )
            ),
            questions = listOf(
                StoryQuestion(
                    id = "q_tenfrui_1",
                    questionText = "妈妈给儿子出了一个关于什么的数学算术问题？ (Pertanyaan matematika apa yang diajukan ibu kepada putranya?)",
                    options = listOf("十个水果吃了四个，还剩几个水果 (Ada 10 buah dimakan 4 buah, tersisa berapa buah)", "买十个西瓜多少钱 (Berapa harga membeli 10 semangka)", "十只小鸡有几条腿 (10 anak ayam ada berapa kaki)", "十本书分给两个人 (Membagi 10 buku ke 2 orang)"),
                    correctAnswerIndex = 0,
                    explanation = "Soal pengurangan dasar: sepuluh buah dikurangi empat buah."
                ),
                StoryQuestion(
                    id = "q_tenfrui_2",
                    questionText = "儿子给出的出人意料的答案是多少？ (Berapa jawaban tak terduga yang dilontarkan sang anak?)",
                    options = listOf("零个 (Nol)", "六个 (Enam)", "十个 (Sepuluh)", "一百个 (Seratus)"),
                    correctAnswerIndex = 2,
                    explanation = "Sang anak berkukuh jawabannya tetap utuh sepuluh buah."
                ),
                StoryQuestion(
                    id = "q_tenfrui_3",
                    questionText = "儿子是如何狡黠地辩解自己的“十个”这一答案的？ (Alasan cerdik apa yang dikemukakan anak membenarkan hitungannya?)",
                    options = listOf("四个在肚子里，六个在外面，四加六依然等于十 (Empat buah ada di perut, enam di luar; empat tambah enam bukankah tetap sepuluh)", "他没吃水果 (Dia berdalih belum makan buah)", "水果被小猫偷走了 (Buah dicuri kucing peliharaan)", "算盘坏了 (Sempoa hitung rusak)"),
                    correctAnswerIndex = 0,
                    explanation = "Logika kepemilikan tubuh: buah yang tertelan tidak lenyap dari eksistensinya!"
                ),
                StoryQuestion(
                    id = "q_tenfrui_4",
                    questionText = "这个小故事展现了儿童思维的什么可爱特质？ (Ciri khas imajinasi anak apa yang terpancar dari dialog ini?)",
                    options = listOf("缺乏生活自理能力 (Kurang mandiri)", "不拘泥于死板数字规则的独特观察视角与童真童趣 (Sudut pandang polos yang segar dan tidak terpaku rumus kaku buku teks)", "故意顶撞长辈 (Sengaja melawan nasihat orang tua)", "数学成绩极差 (Sangat bodoh berhitung)"),
                    correctAnswerIndex = 1,
                    explanation = "Kreativitas logika anak kecil menghadirkan tawa dalam interaksi kehangatan keluarga."
                )
            )
        ),
        // Cerita Mandarin Bean 124 (HSK 2): Twice (Dua Kali)
        Story(
            id = "story_twice",
            titleHanzi = "两次",
            titlePinyin = "Liǎng Cì",
            titleTranslation = "Twice (Dua Kali)",
            level = "HSK 2",
            category = "Humor & Pesawat",
            description = "Humor menegangkan saat seorang adik perempuan bersumpah tidak akan pernah naik pesawat terbang kakaknya lagi.",
            coverEmoji = "✈️",
            coverImageRes = R.drawable.cover_story_twice,
            estimatedReadMinutes = 2,
            sentences = listOf(
                Sentence(
                    id = "s_twice_1",
                    hanzi = "哥哥几个月前开始学习驾驶飞机，很快，他就学会了。",
                    pinyin = "gē ge jǐ gè yuè qián kāi shǐ xué xí jià shǐ fēi jī hěn kuài tā jiù xué huì le",
                    translation = "Beberapa bulan lalu kakak laki-laki mulai belajar menerbangkan pesawat terbang, dan dengan cepat ia berhasil menguasainya.",
                    tokens = listOf(
                        WordToken("哥哥", "gē ge", "Older brother", "Kosakata HSK 2: 哥哥 (gē ge)"),
                        WordToken("几", "jǐ", "Several", "Kosakata HSK 2: 几 (jǐ)"),
                        WordToken("个", "gè", "Classifier for people or objects in general", "Kosakata HSK 2: 个 (gè)"),
                        WordToken("月", "yuè", "Month", "Kosakata HSK 2: 月 (yuè)"),
                        WordToken("前", "qián", "Ago", "Kosakata HSK 2: 前 (qián)"),
                        WordToken("开始", "kāi shǐ", "To begin", "Kosakata HSK 2: 开始 (kāi shǐ)"),
                        WordToken("学习", "xué xí", "To learn", "Kosakata HSK 2: 学习 (xué xí)"),
                        WordToken("驾驶", "jià shǐ", "To drive (vehicle); to pilot (ship, airplane etc)", "Kosakata HSK 2: 驾驶 (jià shǐ)"),
                        WordToken("飞机", "fēi jī", "Airplane", "Kosakata HSK 2: 飞机 (fēi jī)"),
                        WordToken("很", "hěn", "Very; quite", "Kosakata HSK 2: 很 (hěn)"),
                        WordToken("快", "kuài", "Rapid", "Kosakata HSK 2: 快 (kuài)"),
                        WordToken("他", "tā", "He; him; his", "Kosakata HSK 2: 他 (tā)"),
                        WordToken("就", "jiù", "As soon as; immediately after", "Kosakata HSK 2: 就 (jiù)"),
                        WordToken("学", "xué", "To learn", "Kosakata HSK 2: 学 (xué)"),
                        WordToken("会", "huì", "Can; to have the skill; to know how to", "Kosakata HSK 2: 会 (huì)"),
                        WordToken("了", "le", "(completed action marker)", "Kosakata HSK 2: 了 (le)")
                    )
                ),
                Sentence(
                    id = "s_twice_2",
                    hanzi = "一天，他请妹妹坐自己的飞机，妹妹同意了。",
                    pinyin = "yī tiān tā qǐng mèi mei zuò zì jǐ de fēi jī mèi mei tóng yì le",
                    translation = "Suatu hari, ia mengajak adik perempuannya naik ke pesawat pribadinya, dan sang adik pun setuju ikut.",
                    tokens = listOf(
                        WordToken("一", "yī", "One", "Kosakata HSK 2: 一 (yī)"),
                        WordToken("天", "tiān", "Day", "Kosakata HSK 2: 天 (tiān)"),
                        WordToken("他", "tā", "He; him; his", "Kosakata HSK 2: 他 (tā)"),
                        WordToken("请", "qǐng", "To invite", "Kosakata HSK 2: 请 (qǐng)"),
                        WordToken("妹妹", "mèi mei", "Younger sister", "Kosakata HSK 2: 妹妹 (mèi mei)"),
                        WordToken("坐", "zuò", "To sit", "Kosakata HSK 2: 坐 (zuò)"),
                        WordToken("自己", "zì jǐ", "Oneself; (attributive) one&#x27;s own", "Kosakata HSK 2: 自己 (zì jǐ)"),
                        WordToken("的", "de", "Possessive particle (of; &#x27;s)", "Kosakata HSK 2: 的 (de)"),
                        WordToken("飞机", "fēi jī", "Airplane", "Kosakata HSK 2: 飞机 (fēi jī)"),
                        WordToken("妹妹", "mèi mei", "Younger sister", "Kosakata HSK 2: 妹妹 (mèi mei)"),
                        WordToken("同意", "tóng yì", "To agree", "Kosakata HSK 2: 同意 (tóng yì)"),
                        WordToken("了", "le", "(completed action marker)", "Kosakata HSK 2: 了 (le)")
                    )
                ),
                Sentence(
                    id = "s_twice_3",
                    hanzi = "在飞机上飞了半个小时以后，他们就下来了。",
                    pinyin = "zài fēi jī shàng fēi le bàn gè xiǎo shí yǐ hòu tā men jiù xià lái le",
                    translation = "Setelah terbang berputar-putar di udara selama setengah jam dengan menegangkan, akhirnya pesawat pun mendarat kembali.",
                    tokens = listOf(
                        WordToken("在", "zài", "(of sb or sth) to be (located) at", "Kosakata HSK 2: 在 (zài)"),
                        WordToken("飞机", "fēi jī", "Airplane", "Kosakata HSK 2: 飞机 (fēi jī)"),
                        WordToken("上", "shàng", "(noun suffix) on; above", "Kosakata HSK 2: 上 (shàng)"),
                        WordToken("飞", "fēi", "To fly", "Kosakata HSK 2: 飞 (fēi)"),
                        WordToken("了", "le", "(completed action marker)", "Kosakata HSK 2: 了 (le)"),
                        WordToken("半", "bàn", "Half", "Kosakata HSK 2: 半 (bàn)"),
                        WordToken("个", "gè", "Classifier for people or objects in general", "Kosakata HSK 2: 个 (gè)"),
                        WordToken("小时", "xiǎo shí", "Hour", "Kosakata HSK 2: 小时 (xiǎo shí)"),
                        WordToken("以后", "yǐ hòu", "After", "Kosakata HSK 2: 以后 (yǐ hòu)"),
                        WordToken("他们", "tā men", "They; them", "Kosakata HSK 2: 他们 (tā men)"),
                        WordToken("就", "jiù", "As soon as; immediately after", "Kosakata HSK 2: 就 (jiù)"),
                        WordToken("下来", "xià lái", "To come down", "Kosakata HSK 2: 下来 (xià lái)"),
                        WordToken("了", "le", "(completed action marker)", "Kosakata HSK 2: 了 (le)")
                    )
                ),
                Sentence(
                    id = "s_twice_4",
                    hanzi = "妹妹说：谢谢你带我坐了两次飞机。",
                    pinyin = "mèi mei shuō xiè xie nǐ dài wǒ zuò le liǎng cì fēi jī",
                    translation = "Adik perempuan menghela napas lega lalu berkata: “Terima kasih sudah mengajakku naik pesawat sebanyak dua kali.”",
                    tokens = listOf(
                        WordToken("妹妹", "mèi mei", "Younger sister", "Kosakata HSK 2: 妹妹 (mèi mei)"),
                        WordToken("说", "shuō", "To speak; to talk; to say", "Kosakata HSK 2: 说 (shuō)"),
                        WordToken("谢谢", "xiè xie", "Thanks", "Kosakata HSK 2: 谢谢 (xiè xie)"),
                        WordToken("你", "nǐ", "You", "Kosakata HSK 2: 你 (nǐ)"),
                        WordToken("带", "dài", "To wear", "Kosakata HSK 2: 带 (dài)"),
                        WordToken("我", "wǒ", "I; me; my", "Kosakata HSK 2: 我 (wǒ)"),
                        WordToken("坐", "zuò", "To sit", "Kosakata HSK 2: 坐 (zuò)"),
                        WordToken("了", "le", "(completed action marker)", "Kosakata HSK 2: 了 (le)"),
                        WordToken("两", "liǎng", "Two", "Kosakata HSK 2: 两 (liǎng)"),
                        WordToken("次", "cì", "Classifier for enumerated events: time", "Kosakata HSK 2: 次 (cì)"),
                        WordToken("飞机", "fēi jī", "Airplane", "Kosakata HSK 2: 飞机 (fēi jī)")
                    )
                ),
                Sentence(
                    id = "s_twice_5",
                    hanzi = "哥哥很奇怪：两次？",
                    pinyin = "gē ge hěn qí guài liǎng cì",
                    translation = "Kakaknya bingung dan heran: “Dua kali?",
                    tokens = listOf(
                        WordToken("哥哥", "gē ge", "Older brother", "Kosakata HSK 2: 哥哥 (gē ge)"),
                        WordToken("很", "hěn", "Very; quite", "Kosakata HSK 2: 很 (hěn)"),
                        WordToken("奇怪", "qí guài", "Strange", "Kosakata HSK 2: 奇怪 (qí guài)"),
                        WordToken("两", "liǎng", "Two", "Kosakata HSK 2: 两 (liǎng)"),
                        WordToken("次", "cì", "Classifier for enumerated events: time", "Kosakata HSK 2: 次 (cì)")
                    )
                ),
                Sentence(
                    id = "s_twice_6",
                    hanzi = "我们只飞了一次呀！",
                    pinyin = "wǒ men zhǐ fēi le yī cì ya",
                    translation = "Kita kan baru saja terbang satu kali saja!”",
                    tokens = listOf(
                        WordToken("我们", "wǒ men", "We; us; ourselves; our", "Kosakata HSK 2: 我们 (wǒ men)"),
                        WordToken("只", "zhǐ", "Only; merely; just", "Kosakata HSK 2: 只 (zhǐ)"),
                        WordToken("飞", "fēi", "To fly", "Kosakata HSK 2: 飞 (fēi)"),
                        WordToken("了", "le", "(completed action marker)", "Kosakata HSK 2: 了 (le)"),
                        WordToken("一", "yī", "One", "Kosakata HSK 2: 一 (yī)"),
                        WordToken("次", "cì", "Classifier for enumerated events: time", "Kosakata HSK 2: 次 (cì)"),
                        WordToken("呀", "ya", "(particle equivalent to 啊 after a vowel, expressing surprise or doubt)", "Kosakata HSK 2: 呀 (ya)")
                    )
                ),
                Sentence(
                    id = "s_twice_7",
                    hanzi = "妹妹说：是的，我的第一次和最后一次。",
                    pinyin = "mèi mei shuō shì de wǒ de dì yī cì hé zuì hòu yī cì",
                    translation = "Adik perempuan menjawab gemetar: “Iya, ini adalah penerbangan pertamaku, sekaligus penerbangan terakhirku seumur hidup!”",
                    tokens = listOf(
                        WordToken("妹妹", "mèi mei", "Younger sister", "Kosakata HSK 2: 妹妹 (mèi mei)"),
                        WordToken("说", "shuō", "To speak; to talk; to say", "Kosakata HSK 2: 说 (shuō)"),
                        WordToken("是的", "shì de", "Yes, that&#x27;s right", "Kosakata HSK 2: 是的 (shì de)"),
                        WordToken("我", "wǒ", "I; me; my", "Kosakata HSK 2: 我 (wǒ)"),
                        WordToken("的", "de", "Possessive particle (of; &#x27;s)", "Kosakata HSK 2: 的 (de)"),
                        WordToken("第一", "dì yī", "First", "Kosakata HSK 2: 第一 (dì yī)"),
                        WordToken("次", "cì", "Classifier for enumerated events: time", "Kosakata HSK 2: 次 (cì)"),
                        WordToken("和", "hé", "And; together with", "Kosakata HSK 2: 和 (hé)"),
                        WordToken("最后", "zuì hòu", "Final; last; ultimate", "Kosakata HSK 2: 最后 (zuì hòu)"),
                        WordToken("一", "yī", "One", "Kosakata HSK 2: 一 (yī)"),
                        WordToken("次", "cì", "Classifier for enumerated events: time", "Kosakata HSK 2: 次 (cì)")
                    )
                )
            ),
            questions = listOf(
                StoryQuestion(
                    id = "q_twice_1",
                    questionText = "哥哥最近学会了一项什么酷炫的本领？ (Keahlian hebat apa yang baru saja dikuasai oleh sang kakak?)",
                    options = listOf("开赛车 (Menyetir mobil balap)", "驾驶飞机 (Menerbangkan pesawat terbang)", "开快艇 (Mengemudikan kapal cepat)", "骑马跨栏 (Menunggang kuda pacu)"),
                    correctAnswerIndex = 1,
                    explanation = "Sang kakak baru saja menyelesaikan lisensi menerbangkan pesawat."
                ),
                StoryQuestion(
                    id = "q_twice_2",
                    questionText = "妹妹在坐完哥哥开的飞机回到地面后说了什么？ (Apa yang diucapkan sang adik begitu kaki kembali menginjak tanah?)",
                    options = listOf("谢谢你带我坐了两次飞机 (Terima kasih sudah mengajakku terbang sebanyak dua kali)", "我想再飞十个小时 (Aku mau terbang 10 jam lagi)", "我要吐了 (Aku mau muntah)", "去买冰淇淋吃 (Ayo beli es krim)"),
                    correctAnswerIndex = 0,
                    explanation = "Ucapan terima kasih yang membuat kakaknya mengerutkan dahi."
                ),
                StoryQuestion(
                    id = "q_twice_3",
                    questionText = "明明只飞了一个架次，妹妹口中的“两次”到底代表什么含义？ (Apa makna sesungguhnya di balik frasa 'dua kali' versi sang adik?)",
                    options = listOf("昨天一次和今天一次 (Kemarin sekali dan hari ini sekali)", "人生中的“第一次”，以及这辈子坚决不干的“最后一次” (Penerbangan pertama dalam hidup, sekaligus penerbangan terakhir seumur hidup!)", "上午一次下午一次 (Pagi sekali dan sore sekali)", "买了两张机票 (Membeli dua tiket pesawat)"),
                    correctAnswerIndex = 1,
                    explanation = "Puncak humor: saking menegangkannya sensasi terbang, ia kapok seumur hidup untuk naik lagi!"
                ),
                StoryQuestion(
                    id = "q_twice_4",
                    questionText = "这个幽默对话生动刻画了兄妹相处时的什么生活氛围？ (Suasana interaksi keluarga apa yang terpancar dalam obrolan lucu ini?)",
                    options = listOf("彼此仇视冷漠 (Saling bermusuhan dingin)", "轻松调侃、互相信任中带着逗趣打趣的温馨亲情 (Canda tawa hangat, saling percaya, dan keakraban persaudaraan yang ceria)", "经常大打出手 (Sering baku hantam bertengkar)", "客套疏离 (Kaku dan berjarak)"),
                    correctAnswerIndex = 1,
                    explanation = "Keakraban adik-kakak yang saling menggoda dengan cara jenaka."
                )
            )
        ),
        // Cerita Mandarin Bean 125 (HSK 2): My Chinese Teacher (Guru Bahasa Mandarinku)
        Story(
            id = "story_my_chinese_teacher",
            titleHanzi = "我的汉语老师",
            titlePinyin = "Wǒ de Hànyǔ Lǎoshī",
            titleTranslation = "My Chinese Teacher (Guru Bahasa Mandarinku)",
            level = "HSK 2",
            category = "Pendidikan & Belajar",
            description = "Pengalaman belajar bahasa Mandarin yang sempat jenuh hingga kembali bersemangat berkat guru yang kreatif.",
            coverEmoji = "👨‍🏫",
            coverImageRes = R.drawable.cover_story_my_chinese_teacher,
            estimatedReadMinutes = 2,
            sentences = listOf(
                Sentence(
                    id = "s_mychine_1",
                    hanzi = "因为工作需要，我必须学习汉语，但是学习了一段时间以后，我觉得汉语越来越难，有点儿无聊，不想学了。",
                    pinyin = "yīn wèi gōng zuò xū yào wǒ bì xū xué xí Hàn yǔ dàn shì xué xí le yī duàn shí jiān yǐ hòu wǒ jué de Hàn yǔ yuè lái yuè nán yǒu diǎn r wú liáo bù xiǎng xué le",
                    translation = "Karena tuntutan pekerjaan kantor, saya diwajibkan belajar bahasa Mandarin; namun setelah belajar beberapa saat, saya merasa materinya kian sulit, membosankan, dan sempat ingin berhenti.",
                    tokens = listOf(
                        WordToken("因为", "yīn wèi", "Because; owing to; on account of", "Kosakata HSK 2: 因为 (yīn wèi)"),
                        WordToken("工作", "gōng zuò", "Job", "Kosakata HSK 2: 工作 (gōng zuò)"),
                        WordToken("需要", "xū yào", "Needs", "Kosakata HSK 2: 需要 (xū yào)"),
                        WordToken("我", "wǒ", "I; me; my", "Kosakata HSK 2: 我 (wǒ)"),
                        WordToken("必须", "bì xū", "To have to", "Kosakata HSK 2: 必须 (bì xū)"),
                        WordToken("学习", "xué xí", "To learn", "Kosakata HSK 2: 学习 (xué xí)"),
                        WordToken("汉语", "Hàn yǔ", "Chinese language", "Kosakata HSK 2: 汉语 (Hàn yǔ)"),
                        WordToken("但是", "dàn shì", "But; however", "Kosakata HSK 2: 但是 (dàn shì)"),
                        WordToken("学习", "xué xí", "To learn", "Kosakata HSK 2: 学习 (xué xí)"),
                        WordToken("了", "le", "(completed action marker)", "Kosakata HSK 2: 了 (le)"),
                        WordToken("一", "yī", "One", "Kosakata HSK 2: 一 (yī)"),
                        WordToken("段", "duàn", "Classifier for stories, periods of time, lengths of thread etc", "Kosakata HSK 2: 段 (duàn)"),
                        WordToken("时间", "shí jiān", "Time", "Kosakata HSK 2: 时间 (shí jiān)"),
                        WordToken("以后", "yǐ hòu", "After", "Kosakata HSK 2: 以后 (yǐ hòu)"),
                        WordToken("我", "wǒ", "I; me; my", "Kosakata HSK 2: 我 (wǒ)"),
                        WordToken("觉得", "jué de", "To think that ...; to feel that ...", "Kosakata HSK 2: 觉得 (jué de)"),
                        WordToken("汉语", "Hàn yǔ", "Chinese language", "Kosakata HSK 2: 汉语 (Hàn yǔ)"),
                        WordToken("越来越", "yuè lái yuè", "More and more", "Kosakata HSK 2: 越来越 (yuè lái yuè)"),
                        WordToken("难", "nán", "Difficult (to...)", "Kosakata HSK 2: 难 (nán)"),
                        WordToken("有点儿", "yǒu diǎn r", "Slightly", "Kosakata HSK 2: 有点儿 (yǒu diǎn r)"),
                        WordToken("无聊", "wú liáo", "Bored", "Kosakata HSK 2: 无聊 (wú liáo)"),
                        WordToken("不", "bù", "No; not so", "Kosakata HSK 2: 不 (bù)"),
                        WordToken("想", "xiǎng", "To desire; to want (to)", "Kosakata HSK 2: 想 (xiǎng)"),
                        WordToken("学", "xué", "To learn", "Kosakata HSK 2: 学 (xué)"),
                        WordToken("了", "le", "(completed action marker)", "Kosakata HSK 2: 了 (le)")
                    )
                ),
                Sentence(
                    id = "s_mychine_2",
                    hanzi = "上个月，一个新的汉语老师来教我，我发现她的方法很不一样。",
                    pinyin = "shàng gè yuè yī gè xīn de Hàn yǔ lǎo shī lái jiāo wǒ wǒ fā xiàn tā de fāng fǎ hěn bù yī yàng",
                    translation = "Bulan lalu, seorang guru bahasa Mandarin baru datang mengajar saya, dan metode mengajarnya ternyata sangat kreatif dan berbeda.",
                    tokens = listOf(
                        WordToken("上", "shàng", "(bound form) up; upper; above; previous", "Kosakata HSK 2: 上 (shàng)"),
                        WordToken("个", "gè", "Classifier for people or objects in general", "Kosakata HSK 2: 个 (gè)"),
                        WordToken("月", "yuè", "Month", "Kosakata HSK 2: 月 (yuè)"),
                        WordToken("一", "yī", "One", "Kosakata HSK 2: 一 (yī)"),
                        WordToken("个", "gè", "Classifier for people or objects in general", "Kosakata HSK 2: 个 (gè)"),
                        WordToken("新", "xīn", "New; newly", "Kosakata HSK 2: 新 (xīn)"),
                        WordToken("的", "de", "Possessive particle (of; &#x27;s)", "Kosakata HSK 2: 的 (de)"),
                        WordToken("汉语", "Hàn yǔ", "Chinese language", "Kosakata HSK 2: 汉语 (Hàn yǔ)"),
                        WordToken("老师", "lǎo shī", "Teacher", "Kosakata HSK 2: 老师 (lǎo shī)"),
                        WordToken("来", "lái", "To come", "Kosakata HSK 2: 来 (lái)"),
                        WordToken("教", "jiāo", "To teach; to instruct", "Kosakata HSK 2: 教 (jiāo)"),
                        WordToken("我", "wǒ", "I; me; my", "Kosakata HSK 2: 我 (wǒ)"),
                        WordToken("我", "wǒ", "I; me; my", "Kosakata HSK 2: 我 (wǒ)"),
                        WordToken("发现", "fā xiàn", "To notice; to become aware of", "Kosakata HSK 2: 发现 (fā xiàn)"),
                        WordToken("她", "tā", "She", "Kosakata HSK 2: 她 (tā)"),
                        WordToken("的", "de", "Possessive particle (of; &#x27;s)", "Kosakata HSK 2: 的 (de)"),
                        WordToken("方法", "fāng fǎ", "Method; way; technique; procedure", "Kosakata HSK 2: 方法 (fāng fǎ)"),
                        WordToken("很", "hěn", "Very; quite", "Kosakata HSK 2: 很 (hěn)"),
                        WordToken("不", "bù", "No; not so", "Kosakata HSK 2: 不 (bù)"),
                        WordToken("一样", "yī yàng", "Same", "Kosakata HSK 2: 一样 (yī yàng)")
                    )
                ),
                Sentence(
                    id = "s_mychine_3",
                    hanzi = "她会让我听中文歌，看中文电影和新闻，我们也会一起讨论很多关于中国的问题。",
                    pinyin = "tā huì ràng wǒ tīng Zhōng wén gē kàn Zhōng wén diàn yǐng hé xīn wén wǒ men yě huì yī qǐ tǎo lùn hěn duō guān yú Zhōng guó de wèn tí",
                    translation = "Beliau mengajak saya mendengarkan lagu-lagu Mandarin populer, menonton cuplikan film dan berita, serta berdiskusi hangat seputar kebudayaan Tiongkok.",
                    tokens = listOf(
                        WordToken("她", "tā", "She", "Kosakata HSK 2: 她 (tā)"),
                        WordToken("会", "huì", "To be likely to; to be sure to", "Kosakata HSK 2: 会 (huì)"),
                        WordToken("让", "ràng", "To permit", "Kosakata HSK 2: 让 (ràng)"),
                        WordToken("我", "wǒ", "I; me; my", "Kosakata HSK 2: 我 (wǒ)"),
                        WordToken("听", "tīng", "To listen to; to hear", "Kosakata HSK 2: 听 (tīng)"),
                        WordToken("中文", "Zhōng wén", "Chinese language", "Kosakata HSK 2: 中文 (Zhōng wén)"),
                        WordToken("歌", "gē", "Song", "Kosakata HSK 2: 歌 (gē)"),
                        WordToken("看", "kàn", "To see; to look at", "Kosakata HSK 2: 看 (kàn)"),
                        WordToken("中文", "Zhōng wén", "Chinese language", "Kosakata HSK 2: 中文 (Zhōng wén)"),
                        WordToken("电影", "diàn yǐng", "Movie; film", "Kosakata HSK 2: 电影 (diàn yǐng)"),
                        WordToken("和", "hé", "And; together with", "Kosakata HSK 2: 和 (hé)"),
                        WordToken("新闻", "xīn wén", "News", "Kosakata HSK 2: 新闻 (xīn wén)"),
                        WordToken("我们", "wǒ men", "We; us; ourselves; our", "Kosakata HSK 2: 我们 (wǒ men)"),
                        WordToken("也", "yě", "Also; too; as well; (not ...) either", "Kosakata HSK 2: 也 (yě)"),
                        WordToken("会", "huì", "To be likely to; to be sure to", "Kosakata HSK 2: 会 (huì)"),
                        WordToken("一起", "yī qǐ", "Together; in company (with)", "Kosakata HSK 2: 一起 (yī qǐ)"),
                        WordToken("讨论", "tǎo lùn", "To discuss; to talk over", "Kosakata HSK 2: 讨论 (tǎo lùn)"),
                        WordToken("很多", "hěn duō", "Many; a lot of", "Kosakata HSK 2: 很多 (hěn duō)"),
                        WordToken("关于", "guān yú", "Pertaining to", "Kosakata HSK 2: 关于 (guān yú)"),
                        WordToken("中国", "Zhōng guó", "China", "Kosakata HSK 2: 中国 (Zhōng guó)"),
                        WordToken("的", "de", "Possessive particle (of; &#x27;s)", "Kosakata HSK 2: 的 (de)"),
                        WordToken("问题", "wèn tí", "Question", "Kosakata HSK 2: 问题 (wèn tí)")
                    )
                ),
                Sentence(
                    id = "s_mychine_4",
                    hanzi = "我现在对汉语又有兴趣了。",
                    pinyin = "wǒ xiàn zài duì Hàn yǔ yòu yǒu xìng qù le",
                    translation = "Kini antusiasme dan minat saya untuk mendalami bahasa Mandarin telah menyala kembali dengan penuh semangat.",
                    tokens = listOf(
                        WordToken("我", "wǒ", "I; me; my", "Kosakata HSK 2: 我 (wǒ)"),
                        WordToken("现在", "xiàn zài", "Now; at present; currently", "Kosakata HSK 2: 现在 (xiàn zài)"),
                        WordToken("对", "duì", "Towards; at; for", "Kosakata HSK 2: 对 (duì)"),
                        WordToken("汉语", "Hàn yǔ", "Chinese language", "Kosakata HSK 2: 汉语 (Hàn yǔ)"),
                        WordToken("又", "yòu", "(once) again", "Kosakata HSK 2: 又 (yòu)"),
                        WordToken("有", "yǒu", "To have; there is", "Kosakata HSK 2: 有 (yǒu)"),
                        WordToken("兴趣", "xìng qù", "Interest (desire to know about sth)", "Kosakata HSK 2: 兴趣 (xìng qù)"),
                        WordToken("了", "le", "(completed action marker)", "Kosakata HSK 2: 了 (le)")
                    )
                )
            ),
            questions = listOf(
                StoryQuestion(
                    id = "q_mychine_1",
                    questionText = "作者最初因为什么原因必须学习汉语？ (Apa motif awal yang mewajibkan penulis mempelajari bahasa Mandarin?)",
                    options = listOf("单纯想去旅游 (Hanya ingin berlibur)", "因为实际工作岗位的发展需要 (Tuntutan kebutuhan profesional di tempat kerja)", "父母强迫学习 (Dipaksa oleh orang tua)", "为了考大学 (Demi lulus masuk perguruan tinggi)"),
                    correctAnswerIndex = 1,
                    explanation = "Kebutuhan tugas profesi kantor menuntut penguasaan komunikasi bahasa Mandarin."
                ),
                StoryQuestion(
                    id = "q_mychine_2",
                    questionText = "在学习了一段时间后，作者的心理状态经历了怎样的低谷？ (Kejenuhan apa yang sempat melanda penulis di tengah proses belajarnya?)",
                    options = listOf("觉得词汇太少不够用 (Merasa kosakata terlalu sedikit)", "觉得汉语语法汉字越学越难、枯燥无聊并萌生退意 (Merasa materi kian sulit, membosankan, dan hampir menyerah ingin berhenti)", "觉得自己已经成为专家 (Merasa diri sudah ahli master)", "想要当老师 (Ingin beralih profesi menjadi guru)"),
                    correctAnswerIndex = 1,
                    explanation = "Tantangan plateau bahasa asing yang terasa menjemukan jika metode kaku."
                ),
                StoryQuestion(
                    id = "q_mychine_3",
                    questionText = "新换的汉语老师运用了哪些生动活泼的创新教学法？ (Metode interaktif apa yang diterapkan oleh guru bahasa Mandarin yang baru?)",
                    options = listOf("死记硬背字典 (Menghafal buta kamus tebal)", "听中文流行歌曲、看影视新闻并探讨多元文化话题 (Mendengarkan lagu pop, menonton film/berita, dan berdiskusi hangat isu budaya)", "每天默写一千个生字 (Mendikte seribu karakter setiap hari)", "不准学生开口提问 (Melarang murid bertanya)"),
                    correctAnswerIndex = 1,
                    explanation = "Mengintegrasikan media populer dan dialog kultural agar pembelajaran hidup."
                ),
                StoryQuestion(
                    id = "q_mychine_4",
                    questionText = "从这个真实的学习历程中可以获得什么教学启示？ (Inspirasi pedagogis apa yang dapat ditarik dari pengalaman belajar ini?)",
                    options = listOf("学外语全靠死背 (Belajar bahasa murni mengandalkan hafalan kaku)", "科学有趣的教学方法能够极大地激发学习内驱力与兴趣 (Metode kreatif dan kontekstual mampu menyalakan api antusiasme pembelajar)", "只要换老师就能考满分 (Ganti guru otomatis dapat nilai sempurna)", "成年人学不会外语 (Orang dewasa mustahil bisa belajar bahasa baru)"),
                    correctAnswerIndex = 1,
                    explanation = "Kreativitas pengajar dalam menghadirkan konteks nyata adalah kunci kesuksesan belajar."
                )
            )
        ),
        // Cerita Mandarin Bean 126 (HSK 2): Perfect Son (Putra yang Sempurna)
        Story(
            id = "story_perfect_son_ballet",
            titleHanzi = "完美儿子",
            titlePinyin = "Wánměi Érzi",
            titleTranslation = "Perfect Son (Putra yang Sempurna)",
            level = "HSK 2",
            category = "Humor & Keluarga",
            description = "Lelucon di kantor tentang seorang rekan kerja yang memuji putranya yang tidak pernah merokok dan selalu tidur awal.",
            coverEmoji = "🩰",
            coverImageRes = R.drawable.cover_story_perfect_son_ballet,
            estimatedReadMinutes = 2,
            sentences = listOf(
                Sentence(
                    id = "s_perfect_1",
                    hanzi = "办公室里大家都在讨论自己的孩子，一个新同事说：我有一个很完美的儿子，不抽烟，不喝酒，不会很晚回家，每天很早就睡觉了。",
                    pinyin = "bàn gōng shì lǐ dà jiā dōu zài tǎo lùn zì jǐ de hái zi yī gè xīn tóng shì shuō wǒ yǒu yī gè hěn wán měi de ér zi bù chōu yān bù hē jiǔ bù huì hěn wǎn huí jiā měi tiān hěn zǎo jiù shuì jiào le",
                    translation = "Di ruang kantor rekan-rekan kerja sedang asyik memperbincangkan anak masing-masing; seorang kolega baru menimpali: “Saya memiliki seorang putra yang sangat sempurna: tidak merokok, tidak minum alkohol, tidak pernah pulang larut malam, dan setiap hari tidur sangat awal.”",
                    tokens = listOf(
                        WordToken("办公室", "bàn gōng shì", "Office; business premises", "Kosakata HSK 2: 办公室 (bàn gōng shì)"),
                        WordToken("里", "lǐ", "Lining", "Kosakata HSK 2: 里 (lǐ)"),
                        WordToken("大家", "dà jiā", "Everyone", "Kosakata HSK 2: 大家 (dà jiā)"),
                        WordToken("都", "dōu", "All; both; entirely", "Kosakata HSK 2: 都 (dōu)"),
                        WordToken("在", "zài", "(used before a verb to indicate an action in progress)", "Kosakata HSK 2: 在 (zài)"),
                        WordToken("讨论", "tǎo lùn", "To discuss; to talk over", "Kosakata HSK 2: 讨论 (tǎo lùn)"),
                        WordToken("自己", "zì jǐ", "Oneself; (attributive) one&#x27;s own", "Kosakata HSK 2: 自己 (zì jǐ)"),
                        WordToken("的", "de", "Possessive particle (of; &#x27;s)", "Kosakata HSK 2: 的 (de)"),
                        WordToken("孩子", "hái zi", "Child", "Kosakata HSK 2: 孩子 (hái zi)"),
                        WordToken("一", "yī", "One", "Kosakata HSK 2: 一 (yī)"),
                        WordToken("个", "gè", "Classifier for people or objects in general", "Kosakata HSK 2: 个 (gè)"),
                        WordToken("新", "xīn", "New; newly", "Kosakata HSK 2: 新 (xīn)"),
                        WordToken("同事", "tóng shì", "Colleague; co-worker", "Kosakata HSK 2: 同事 (tóng shì)"),
                        WordToken("说", "shuō", "To speak; to talk; to say", "Kosakata HSK 2: 说 (shuō)"),
                        WordToken("我", "wǒ", "I; me; my", "Kosakata HSK 2: 我 (wǒ)"),
                        WordToken("有", "yǒu", "To have; there is", "Kosakata HSK 2: 有 (yǒu)"),
                        WordToken("一", "yī", "One", "Kosakata HSK 2: 一 (yī)"),
                        WordToken("个", "gè", "Classifier for people or objects in general", "Kosakata HSK 2: 个 (gè)"),
                        WordToken("很", "hěn", "Very; quite", "Kosakata HSK 2: 很 (hěn)"),
                        WordToken("完美", "wán měi", "Perfect", "Kosakata HSK 2: 完美 (wán měi)"),
                        WordToken("的", "de", "Possessive particle (of; &#x27;s)", "Kosakata HSK 2: 的 (de)"),
                        WordToken("儿子", "ér zi", "Son", "Kosakata HSK 2: 儿子 (ér zi)"),
                        WordToken("不", "bù", "No; not so", "Kosakata HSK 2: 不 (bù)"),
                        WordToken("抽烟", "chōu yān", "To smoke (tobacco)", "Kosakata HSK 2: 抽烟 (chōu yān)"),
                        WordToken("不", "bù", "No; not so", "Kosakata HSK 2: 不 (bù)"),
                        WordToken("喝", "hē", "To drink", "Kosakata HSK 2: 喝 (hē)"),
                        WordToken("酒", "jiǔ", "Wine (esp. rice wine)", "Kosakata HSK 2: 酒 (jiǔ)"),
                        WordToken("不会", "bù huì", "Will not", "Kosakata HSK 2: 不会 (bù huì)"),
                        WordToken("很", "hěn", "Very; quite", "Kosakata HSK 2: 很 (hěn)"),
                        WordToken("晚", "wǎn", "Late", "Kosakata HSK 2: 晚 (wǎn)"),
                        WordToken("回", "huí", "To go back", "Kosakata HSK 2: 回 (huí)"),
                        WordToken("家", "jiā", "Home", "Kosakata HSK 2: 家 (jiā)"),
                        WordToken("每", "měi", "Each", "Kosakata HSK 2: 每 (měi)"),
                        WordToken("天", "tiān", "Day", "Kosakata HSK 2: 天 (tiān)"),
                        WordToken("很", "hěn", "Very; quite", "Kosakata HSK 2: 很 (hěn)"),
                        WordToken("早", "zǎo", "Early", "Kosakata HSK 2: 早 (zǎo)"),
                        WordToken("就", "jiù", "Merely; nothing else but; simply; just; precisely; exactly", "Kosakata HSK 2: 就 (jiù)"),
                        WordToken("睡觉", "shuì jiào", "To go to bed", "Kosakata HSK 2: 睡觉 (shuì jiào)"),
                        WordToken("了", "le", "(completed action marker)", "Kosakata HSK 2: 了 (le)")
                    )
                ),
                Sentence(
                    id = "s_perfect_2",
                    hanzi = "大家都很惊讶：真是太完美了，他多少岁了？",
                    pinyin = "dà jiā dōu hěn jīng yà zhēn shì tài wán měi le tā duō shao suì le",
                    translation = "Semua rekan kantor berdecak kagum takjub: “Luar biasa sempurna didikanmu, berapa usianya sekarang?”",
                    tokens = listOf(
                        WordToken("大家", "dà jiā", "Everyone", "Kosakata HSK 2: 大家 (dà jiā)"),
                        WordToken("都", "dōu", "All; both; entirely", "Kosakata HSK 2: 都 (dōu)"),
                        WordToken("很", "hěn", "Very; quite", "Kosakata HSK 2: 很 (hěn)"),
                        WordToken("惊讶", "jīng yà", "Amazed", "Kosakata HSK 2: 惊讶 (jīng yà)"),
                        WordToken("真", "zhēn", "Really", "Kosakata HSK 2: 真 (zhēn)"),
                        WordToken("是", "shì", "Indeed (used for emphasis)", "Kosakata HSK 2: 是 (shì)"),
                        WordToken("太", "tài", "Too (much)", "Kosakata HSK 2: 太 (tài)"),
                        WordToken("完美", "wán měi", "Perfect", "Kosakata HSK 2: 完美 (wán měi)"),
                        WordToken("了", "le", "(completed action marker)", "Kosakata HSK 2: 了 (le)"),
                        WordToken("他", "tā", "He; him; his", "Kosakata HSK 2: 他 (tā)"),
                        WordToken("多少", "duō shao", "How much?; how many?", "Kosakata HSK 2: 多少 (duō shao)"),
                        WordToken("岁", "suì", "Classifier for years (of age)", "Kosakata HSK 2: 岁 (suì)"),
                        WordToken("了", "le", "(completed action marker)", "Kosakata HSK 2: 了 (le)")
                    )
                ),
                Sentence(
                    id = "s_perfect_3",
                    hanzi = "新同事说：是的，他这个星期就1岁了！",
                    pinyin = "xīn tóng shì shuō shì de tā zhè gè xīng qī jiù suì le",
                    translation = "Kolega baru itu tersenyum bangga menjawab: “Iya, minggu ini dia genap berusia satu tahun!”",
                    tokens = listOf(
                        WordToken("新", "xīn", "New; newly", "Kosakata HSK 2: 新 (xīn)"),
                        WordToken("同事", "tóng shì", "Colleague; co-worker", "Kosakata HSK 2: 同事 (tóng shì)"),
                        WordToken("说", "shuō", "To speak; to talk; to say", "Kosakata HSK 2: 说 (shuō)"),
                        WordToken("是的", "shì de", "Yes, that&#x27;s right", "Kosakata HSK 2: 是的 (shì de)"),
                        WordToken("他", "tā", "He; him; his", "Kosakata HSK 2: 他 (tā)"),
                        WordToken("这", "zhè", "This; these", "Kosakata HSK 2: 这 (zhè)"),
                        WordToken("个", "gè", "Classifier for people or objects in general", "Kosakata HSK 2: 个 (gè)"),
                        WordToken("星期", "xīng qī", "Week", "Kosakata HSK 2: 星期 (xīng qī)"),
                        WordToken("就", "jiù", "Merely; nothing else but; simply; just; precisely; exactly", "Kosakata HSK 2: 就 (jiù)"),
                        WordToken("岁", "suì", "Classifier for years (of age)", "Kosakata HSK 2: 岁 (suì)"),
                        WordToken("了", "le", "(completed action marker)", "Kosakata HSK 2: 了 (le)")
                    )
                )
            ),
            questions = listOf(
                StoryQuestion(
                    id = "q_perfect_1",
                    questionText = "办公室里的同事们闲暇时聚在一起聊什么主题？ (Topik apa yang diperbincangkan rekan-rekan kerja di ruang kantor?)",
                    options = listOf("讨论各自孩子的成长表现 (Membahas tabiat dan kelakuan anak masing-masing)", "讨论股市行情 (Membahas harga saham)", "抱怨老板发奖金少 (Mengeluh bonus bos sedikit)", "讨论午饭吃什么 (Membahas menu makan siang)"),
                    correctAnswerIndex = 0,
                    explanation = "Obrolan santai seputar keluarga dan kebiasaan anak-anak di rumah."
                ),
                StoryQuestion(
                    id = "q_perfect_2",
                    questionText = "新同事是如何自豪地夸奖自己的儿子的？ (Bagaimana rekan kerja baru itu membanggakan putranya?)",
                    options = listOf("儿子会开法拉利 (Anaknya bisa menyetir mobil mewah)", "不抽烟、不喝酒、不晚归且天天早早入睡 (Tidak merokok, tidak minum alkohol, tidak pulang malam, dan selalu tidur lelap tepat waktu)", "儿子当上了大经理 (Anaknya menjadi manajer besar)", "儿子拿了奥运冠军 (Anaknya juara medali emas Olimpiade)"),
                    correctAnswerIndex = 1,
                    explanation = "Kriteria kepatuhan mutlak yang terdengar begitu mengagumkan."
                ),
                StoryQuestion(
                    id = "q_perfect_3",
                    questionText = "新同事口中的这位“完美儿子”实际上有多大？ (Berapa usia sebenarnya sang 'putra sempurna' yang dibanggakan itu?)",
                    options = listOf("刚刚满一岁 (Baru saja genap berusia satu tahun!)", "十八岁成年生日 (Genap berusia 18 tahun)", "二十五岁研究生毕业 (Berusia 25 tahun lulus S2)", "四十岁 (Berusia 40 tahun)"),
                    correctAnswerIndex = 0,
                    explanation = "Titik balik humor: tentu saja bayi satu tahun belum bisa merokok atau nongkrong malam!"
                ),
                StoryQuestion(
                    id = "q_perfect_4",
                    questionText = "这个故事幽默讽刺的核心技巧在于什么？ (Teknik lelucon apakah yang digunakan dalam cerita humor ini?)",
                    options = listOf("制造强烈的预期违背与反差萌 (Menciptakan pelanggaran ekspektasi logis dan kontras yang mengejutkan)", "大声讽刺他人 (Mengejek orang lain secara kasar)", "编造恐怖情节 (Membuat alur cerita menakutkan)", "毫无逻辑的胡扯 (Omong kosong tanpa nalar)"),
                    correctAnswerIndex = 0,
                    explanation = "Kontras tak terduga antara standar orang dewasa dengan kepolosan bayi mungil menghadirkan tawa."
                )
            )
        ),
        // Cerita Mandarin Bean 127 (HSK 2): Thanksgiving (Rasa Syukur)
        Story(
            id = "story_thanksgiving",
            titleHanzi = "感恩",
            titlePinyin = "Gǎn'ēn",
            titleTranslation = "Thanksgiving (Rasa Syukur)",
            level = "HSK 2",
            category = "Keluarga & Syukur",
            description = "Niat sang ayah mengajarkan bakti kepada ibu yang justru dibalas janji sang anak untuk memanjakan calon istrinya kelak.",
            coverEmoji = "🙏",
            coverImageRes = R.drawable.cover_story_thanksgiving,
            estimatedReadMinutes = 2,
            sentences = listOf(
                Sentence(
                    id = "s_thanksg_1",
                    hanzi = "爸爸想让儿子学会感恩，所以就对儿子说：\"妈妈每天都要送你去学校，给你做饭、洗衣服，还要上班赚钱给你买东西，她多不容易呀，你长大了应该怎么做呢？”",
                    pinyin = "bà ba xiǎng ràng ér zi xué huì gǎn ēn suǒ yǐ jiù duì ér zi shuō mā ma měi tiān dōu yào sòng nǐ qù xué xiào gěi nǐ zuò fàn xǐ yī fu hái yào shàng bān zhuàn qián gěi nǐ mǎi dōng xi tā duō bù róng yì ya nǐ zhǎng dà le yīng gāi zěn me zuò ne",
                    translation = "Ayah ingin menanamkan rasa syukur dan bakti kepada putranya, maka ia berkata: “Ibu setiap hari mengantarmu ke sekolah, memasak, mencuci pakaian, dan bekerja mencari nafkah untuk membelikan kebutuhanmu; pengorbanannya sungguh luar biasa besar, kelak saat dewasa apa yang akan kamu lakukan untuk membalasnya?”",
                    tokens = listOf(
                        WordToken("爸爸", "bà ba", "(coll.) father; dad", "Kosakata HSK 2: 爸爸 (bà ba)"),
                        WordToken("想", "xiǎng", "To desire; to want (to)", "Kosakata HSK 2: 想 (xiǎng)"),
                        WordToken("让", "ràng", "To permit", "Kosakata HSK 2: 让 (ràng)"),
                        WordToken("儿子", "ér zi", "Son", "Kosakata HSK 2: 儿子 (ér zi)"),
                        WordToken("学会", "xué huì", "To learn; to master", "Kosakata HSK 2: 学会 (xué huì)"),
                        WordToken("感恩", "gǎn ēn", "To be grateful", "Kosakata HSK 2: 感恩 (gǎn ēn)"),
                        WordToken("所以", "suǒ yǐ", "Therefore", "Kosakata HSK 2: 所以 (suǒ yǐ)"),
                        WordToken("就", "jiù", "In that case; then", "Kosakata HSK 2: 就 (jiù)"),
                        WordToken("对", "duì", "Towards; at; for", "Kosakata HSK 2: 对 (duì)"),
                        WordToken("儿子", "ér zi", "Son", "Kosakata HSK 2: 儿子 (ér zi)"),
                        WordToken("说", "shuō", "To speak; to talk; to say", "Kosakata HSK 2: 说 (shuō)"),
                        WordToken("妈妈", "mā ma", "Mama", "Kosakata HSK 2: 妈妈 (mā ma)"),
                        WordToken("每天", "měi tiān", "Every day", "Kosakata HSK 2: 每天 (měi tiān)"),
                        WordToken("都", "dōu", "All; both; entirely", "Kosakata HSK 2: 都 (dōu)"),
                        WordToken("要", "yào", "Will; shall; about to", "Kosakata HSK 2: 要 (yào)"),
                        WordToken("送", "sòng", "To see (sb) off", "Kosakata HSK 2: 送 (sòng)"),
                        WordToken("你", "nǐ", "You", "Kosakata HSK 2: 你 (nǐ)"),
                        WordToken("去", "qù", "To go, to go to", "Kosakata HSK 2: 去 (qù)"),
                        WordToken("学校", "xué xiào", "School", "Kosakata HSK 2: 学校 (xué xiào)"),
                        WordToken("给", "gěi", "To", "Kosakata HSK 2: 给 (gěi)"),
                        WordToken("你", "nǐ", "You", "Kosakata HSK 2: 你 (nǐ)"),
                        WordToken("做饭", "zuò fàn", "To prepare a meal", "Kosakata HSK 2: 做饭 (zuò fàn)"),
                        WordToken("洗", "xǐ", "To wash; to bathe", "Kosakata HSK 2: 洗 (xǐ)"),
                        WordToken("衣服", "yī fu", "Clothes", "Kosakata HSK 2: 衣服 (yī fu)"),
                        WordToken("还", "hái", "Still, still in progress, yet", "Kosakata HSK 2: 还 (hái)"),
                        WordToken("要", "yào", "Will; shall; about to", "Kosakata HSK 2: 要 (yào)"),
                        WordToken("上班", "shàng bān", "To go to work", "Kosakata HSK 2: 上班 (shàng bān)"),
                        WordToken("赚", "zhuàn", "To earn", "Kosakata HSK 2: 赚 (zhuàn)"),
                        WordToken("钱", "qián", "Coin", "Kosakata HSK 2: 钱 (qián)"),
                        WordToken("给", "gěi", "To", "Kosakata HSK 2: 给 (gěi)"),
                        WordToken("你", "nǐ", "You", "Kosakata HSK 2: 你 (nǐ)"),
                        WordToken("买", "mǎi", "To buy", "Kosakata HSK 2: 买 (mǎi)"),
                        WordToken("东西", "dōng xi", "Thing", "Kosakata HSK 2: 东西 (dōng xi)"),
                        WordToken("她", "tā", "She", "Kosakata HSK 2: 她 (tā)"),
                        WordToken("多", "duō", "How (to what extent)", "Kosakata HSK 2: 多 (duō)"),
                        WordToken("不", "bù", "No; not so", "Kosakata HSK 2: 不 (bù)"),
                        WordToken("容易", "róng yì", "Easy; straightforward", "Kosakata HSK 2: 容易 (róng yì)"),
                        WordToken("呀", "ya", "(particle equivalent to 啊 after a vowel, expressing surprise or doubt)", "Kosakata HSK 2: 呀 (ya)"),
                        WordToken("你", "nǐ", "You", "Kosakata HSK 2: 你 (nǐ)"),
                        WordToken("长大", "zhǎng dà", "To grow up", "Kosakata HSK 2: 长大 (zhǎng dà)"),
                        WordToken("了", "le", "(completed action marker)", "Kosakata HSK 2: 了 (le)"),
                        WordToken("应该", "yīng gāi", "Ought to; should; must", "Kosakata HSK 2: 应该 (yīng gāi)"),
                        WordToken("怎么", "zěn me", "How?", "Kosakata HSK 2: 怎么 (zěn me)"),
                        WordToken("做", "zuò", "To do; to engage in; to hold (a party etc)", "Kosakata HSK 2: 做 (zuò)"),
                        WordToken("呢", "ne", "(discourse particle) used to mark a slight pause or emphasis in speech", "Kosakata HSK 2: 呢 (ne)")
                    )
                ),
                Sentence(
                    id = "s_thanksg_2",
                    hanzi = "儿子想了想，认真地回答：\"爸爸，等我长大了，一定不会让我妻子做这么多事，这些事我自己一个人全包了！”",
                    pinyin = "ér zi xiǎng le xiǎng rèn zhēn de huí dá bà ba děng wǒ zhǎng dà le yī dìng bù huì ràng wǒ qī zi zuò zhè me duō shì zhè xiē shì wǒ zì jǐ yī gè rén quán bāo le",
                    translation = "Putranya berpikir sejenak lalu menjawab dengan sangat bersungguh-sungguh: “Ayah, kelak saat saya dewasa dan menikah, saya berjanji tidak akan membiarkan istri saya melakukan pekerjaan seberat itu; semua cucian dan urusan rumah tangga biar saya sendiri yang kerjakan semuanya!”",
                    tokens = listOf(
                        WordToken("儿子", "ér zi", "Son", "Kosakata HSK 2: 儿子 (ér zi)"),
                        WordToken("想", "xiǎng", "To think (about)", "Kosakata HSK 2: 想 (xiǎng)"),
                        WordToken("了", "le", "(completed action marker)", "Kosakata HSK 2: 了 (le)"),
                        WordToken("想", "xiǎng", "To think (about)", "Kosakata HSK 2: 想 (xiǎng)"),
                        WordToken("认真", "rèn zhēn", "Conscientious", "Kosakata HSK 2: 认真 (rèn zhēn)"),
                        WordToken("地", "de", "-ly", "Kosakata HSK 2: 地 (de)"),
                        WordToken("回答", "huí dá", "To reply; to answer", "Kosakata HSK 2: 回答 (huí dá)"),
                        WordToken("爸爸", "bà ba", "(coll.) father; dad", "Kosakata HSK 2: 爸爸 (bà ba)"),
                        WordToken("等", "děng", "By the time; when; till", "Kosakata HSK 2: 等 (děng)"),
                        WordToken("我", "wǒ", "I; me; my", "Kosakata HSK 2: 我 (wǒ)"),
                        WordToken("长大", "zhǎng dà", "To grow up", "Kosakata HSK 2: 长大 (zhǎng dà)"),
                        WordToken("了", "le", "(completed action marker)", "Kosakata HSK 2: 了 (le)"),
                        WordToken("一定", "yī dìng", "Surely; certainly; definitely", "Kosakata HSK 2: 一定 (yī dìng)"),
                        WordToken("不", "bù", "No; not so", "Kosakata HSK 2: 不 (bù)"),
                        WordToken("会", "huì", "To be likely to; to be sure to", "Kosakata HSK 2: 会 (huì)"),
                        WordToken("让", "ràng", "To permit", "Kosakata HSK 2: 让 (ràng)"),
                        WordToken("我", "wǒ", "I; me; my", "Kosakata HSK 2: 我 (wǒ)"),
                        WordToken("妻子", "qī zi", "Wife", "Kosakata HSK 2: 妻子 (qī zi)"),
                        WordToken("做", "zuò", "To do; to engage in; to hold (a party etc)", "Kosakata HSK 2: 做 (zuò)"),
                        WordToken("这么", "zhè me", "So much", "Kosakata HSK 2: 这么 (zhè me)"),
                        WordToken("多", "duō", "Many; much; more; a lot of", "Kosakata HSK 2: 多 (duō)"),
                        WordToken("事", "shì", "Matter", "Kosakata HSK 2: 事 (shì)"),
                        WordToken("这些", "zhè xiē", "These", "Kosakata HSK 2: 这些 (zhè xiē)"),
                        WordToken("事", "shì", "Matter", "Kosakata HSK 2: 事 (shì)"),
                        WordToken("我", "wǒ", "I; me; my", "Kosakata HSK 2: 我 (wǒ)"),
                        WordToken("自己", "zì jǐ", "Oneself; (attributive) one&#x27;s own", "Kosakata HSK 2: 自己 (zì jǐ)"),
                        WordToken("一", "yī", "One", "Kosakata HSK 2: 一 (yī)"),
                        WordToken("个", "gè", "Classifier for people or objects in general", "Kosakata HSK 2: 个 (gè)"),
                        WordToken("人", "rén", "Person; people", "Kosakata HSK 2: 人 (rén)"),
                        WordToken("全", "quán", "All", "Kosakata HSK 2: 全 (quán)"),
                        WordToken("包", "bāo", "To cover", "Kosakata HSK 2: 包 (bāo)"),
                        WordToken("了", "le", "(completed action marker)", "Kosakata HSK 2: 了 (le)")
                    )
                )
            ),
            questions = listOf(
                StoryQuestion(
                    id = "q_thanksg_1",
                    questionText = "父亲向儿子罗列母亲的日常辛劳是出于什么教育目的？ (Apa tujuan ayah memaparkan segenap jerih payah pengorbanan sang ibu?)",
                    options = listOf("想让儿子学会感恩母亲并主动分担孝敬 (Ingin menanamkan rasa syukur dan bakti membalas budi baik ibu)", "让儿子去打工赚钱 (Menyuruh anak mencari uang)", "抱怨妻子做家务不好 (Mengeluhkan pekerjaan istri)", "炫耀自己很有钱 (Memamerkan kekayaan keluarga)"),
                    correctAnswerIndex = 0,
                    explanation = "Menanamkan budi pekerti empati dan bakti atas peluh keringat orang tua."
                ),
                StoryQuestion(
                    id = "q_thanksg_2",
                    questionText = "母亲每天在家庭生活中承担了哪些琐碎繁重的工作？ (Apa saja rutinitas harian yang diselesaikan ibu dalam rumah tangga?)",
                    options = listOf("送孩子上学、做饭、洗衣并上班赚钱 (Mengantar sekolah, memasak, mencuci baju, serta bekerja mencari nafkah)", "整天在商场买奢侈品 (Seharian belanja barang mewah di mall)", "坐在沙发上看电视 (Hanya duduk santai menonton TV)", "什么都不做 (Tidak mengerjakan apa pun)"),
                    correctAnswerIndex = 0,
                    explanation = "Multi-peran ibu yang menguras energi dan waktu demi kebahagiaan keluarga."
                ),
                StoryQuestion(
                    id = "q_thanksg_3",
                    questionText = "儿子在认真思考后给出的承诺是什么？ (Janji bersungguh-sungguh apa yang diikrarkan sang anak kepada ayahnya?)",
                    options = listOf("长大后一定多给妈妈买礼物 (Kelak akan membelikan banyak kado untuk ibu)", "长大结婚后绝不让妻子受累，把所有家务全包了 (Kelak saat menikah tidak akan membiarkan istrinya lelah, urusan rumah tangga biar dia yang tangani!)", "搬出去一个人住 (Pindah tinggal sendirian)", "永远不结婚 (Berjanji tidak akan pernah menikah)"),
                    correctAnswerIndex = 1,
                    explanation = "Puncak humor: kesimpulan anak yang melenceng dari bakti ke ibu menjadi proteksi untuk calon istrinya!"
                ),
                StoryQuestion(
                    id = "q_thanksg_4",
                    questionText = "父亲听到儿子的豪言壮语后最可能的心情是什么？ (Bagaimana perasaan sang ayah mendengar jawaban tak terduga dari putranya?)",
                    options = listOf("哭笑不得，既无奈又被儿子的护妻决心逗乐 (Campur aduk geli dan pasrah mendengar tekad sang putra)", "暴跳如雷 (Marah membabi buta)", "痛哭流涕 (Menangis tersedu-sedu)", "立刻离家出走 (Langsung minggat dari rumah)"),
                    correctAnswerIndex = 0,
                    explanation = "Kelucuan kepolosan anak yang menarik simpulan tak terduga dari premis nasihat sang ayah."
                )
            )
        )
    )
}
