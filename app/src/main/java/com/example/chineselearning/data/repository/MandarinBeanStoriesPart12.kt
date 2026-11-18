package com.example.chineselearning.data.repository

import com.example.chineselearning.R
import com.example.chineselearning.data.model.Sentence
import com.example.chineselearning.data.model.Story
import com.example.chineselearning.data.model.StoryQuestion
import com.example.chineselearning.data.model.WordToken

val mandarinBeanStoriesPart12: List<Story> by lazy {
    listOf(
        // Cerita Mandarin Bean 137 (HSK 2): Five Minutes Early (Datang Lima Menit Lebih Awal)
        Story(
            id = "story_five_minutes_early",
            titleHanzi = "早到五分钟",
            titlePinyin = "Zǎo Dào Wǔ Fēnzhōng",
            titleTranslation = "Five Minutes Early (Datang Lima Menit Lebih Awal)",
            level = "HSK 2",
            category = "Kehidupan Kampus",
            description = "Kisah mahasiswi Zhang Yue yang terburu-buru ke kampus karena bangun kesiangan, namun mendapati kelas sebelumnya belum usai.",
            coverEmoji = "⏰",
            coverImageRes = R.drawable.cover_story_five_minutes_early,
            estimatedReadMinutes = 2,
            sentences = listOf(
                Sentence(
                    id = "s_fivemin_1",
                    hanzi = "上大学的时候，每天早上张月都准时去上英语课。",
                    pinyin = "shàng dà xué de shí hou měi tiān zǎo shang Zhāng Yuè dōu zhǔn shí qù shàng Yīng yǔ kè",
                    translation = "Saat kuliah di universitas, setiap pagi Zhang Yue selalu tepat waktu pergi mengikuti kelas bahasa Inggris.",
                    tokens = listOf(
                        WordToken("上", "shàng", "to attend (class or university)", "Kosakata HSK 2: 上 (shàng)"),
                        WordToken("大学", "dà xué", "university / college", "Kosakata HSK 2: 大学 (dà xué)"),
                        WordToken("的", "de", "possessive particle (of; 's) / modifying particle (used after an attribute to modify a noun or to form a nominal expression)", "Kosakata HSK 2: 的 (de)"),
                        WordToken("时候", "shí hou", "time / length of time / moment / period", "Kosakata HSK 2: 时候 (shí hou)"),
                        WordToken("每", "měi", "each / every", "Kosakata HSK 2: 每 (měi)"),
                        WordToken("天", "tiān", "day", "Kosakata HSK 2: 天 (tiān)"),
                        WordToken("早上", "zǎo shang", "early morning", "Kosakata HSK 2: 早上 (zǎo shang)"),
                        WordToken("张月", "Zhāng Yuè", "a personal name", "Kosakata HSK 2: 张月 (Zhāng Yuè)"),
                        WordToken("都", "dōu", "all; both; entirely", "Kosakata HSK 2: 都 (dōu)"),
                        WordToken("准时", "zhǔn shí", "on time / on schedule", "Kosakata HSK 2: 准时 (zhǔn shí)"),
                        WordToken("去", "qù", "to go, to go to", "Kosakata HSK 2: 去 (qù)"),
                        WordToken("上", "shàng", "to attend (class or university)", "Kosakata HSK 2: 上 (shàng)"),
                        WordToken("英语", "Yīng yǔ", "English (language)", "Kosakata HSK 2: 英语 (Yīng yǔ)"),
                        WordToken("课", "kè", "subject / course / class / lesson", "Kosakata HSK 2: 课 (kè)")
                    )
                ),
                Sentence(
                    id = "s_fivemin_2",
                    hanzi = "有一天，张月起得很晚，着急地跑到学校后，听见教室里正在上课，就赶快开门，对老师说：”不好意思，我迟到了。”",
                    pinyin = "yǒu yī tiān Zhāng Yuè qǐ de hěn wǎn zháo jí de pǎo dào xué xiào hòu tīng jiàn jiào shì lǐ zhèng zài shàng kè jiù gǎn kuài kāi mén duì lǎo shī shuō bù hǎo yì si wǒ chí dào le",
                    translation = "Suatu hari, Zhang Yue bangun sangat kesiangan; setelah tergesa-gesa berlari sampai ke sekolah dan mendengar di dalam kelas sedang berlangsung pelajaran, ia langsung membuka pintu dan berkata kepada dosen: “Mohon maaf, saya terlambat.”",
                    tokens = listOf(
                        WordToken("有", "yǒu", "to have; there is", "Kosakata HSK 2: 有 (yǒu)"),
                        WordToken("一天", "yī tiān", "one day; a day", "Kosakata HSK 2: 一天 (yī tiān)"),
                        WordToken("张月", "Zhāng Yuè", "a personal name", "Kosakata HSK 2: 张月 (Zhāng Yuè)"),
                        WordToken("起", "qǐ", "to rise / to raise / to get up / to set out / to start / to appear / to launch / to initiate (action) / to draft / to establish / to get (from a depot or counter)", "Kosakata HSK 2: 起 (qǐ)"),
                        WordToken("得", "de", "structural particle: used after a verb (or adjective as main verb), linking it to following phrase indicating effect, degree, possibility etc", "Kosakata HSK 2: 得 (de)"),
                        WordToken("很", "hěn", "very; quite", "Kosakata HSK 2: 很 (hěn)"),
                        WordToken("晚", "wǎn", "late", "Kosakata HSK 2: 晚 (wǎn)"),
                        WordToken("着急", "zháo jí", "to worry; to feel anxious / to feel a sense of urgency; to be in a hurry", "Kosakata HSK 2: 着急 (zháo jí)"),
                        WordToken("地", "de", "-ly / structural particle: used before a verb or adjective, linking it to preceding modifying adverbial adjunct", "Kosakata HSK 2: 地 (de)"),
                        WordToken("跑", "pǎo", "to run / to run away / to escape / to run around (on errands etc) / (of a gas or liquid) to leak or evaporate", "Kosakata HSK 2: 跑 (pǎo)"),
                        WordToken("到", "dào", "to reach; to arrive / to (a place); until (a time); up to (a point) / (verb complement indicating arriving at a place or reaching a point)", "Kosakata HSK 2: 到 (dào)"),
                        WordToken("学校", "xué xiào", "school", "Kosakata HSK 2: 学校 (xué xiào)"),
                        WordToken("后", "hòu", "afterwards / after", "Kosakata HSK 2: 后 (hòu)"),
                        WordToken("听见", "tīng jiàn", "to hear", "Kosakata HSK 2: 听见 (tīng jiàn)"),
                        WordToken("教室", "jiào shì", "classroom", "Kosakata HSK 2: 教室 (jiào shì)"),
                        WordToken("里", "lǐ", "lining / interior / inside", "Kosakata HSK 2: 里 (lǐ)"),
                        WordToken("正在", "zhèng zài", "to be in the process of (doing sth); to be currently ...-ing", "Kosakata HSK 2: 正在 (zhèng zài)"),
                        WordToken("上", "shàng", "to attend (class or university)", "Kosakata HSK 2: 上 (shàng)"),
                        WordToken("课", "kè", "subject / course / class / lesson", "Kosakata HSK 2: 课 (kè)"),
                        WordToken("就", "jiù", "in that case; then", "Kosakata HSK 2: 就 (jiù)"),
                        WordToken("赶快", "gǎn kuài", "quickly; at once", "Kosakata HSK 2: 赶快 (gǎn kuài)"),
                        WordToken("开", "kāi", "to open (transitive or intransitive)", "Kosakata HSK 2: 开 (kāi)"),
                        WordToken("门", "mén", "gate / door / gateway / doorway / opening / valve / switch / way to do something / knack / family / house / (religious) sect / school (of thought) / class / category / phylum or division (taxonomy) / (suffix) -gate (i.e. scandal; derived from Watergate)", "Kosakata HSK 2: 门 (mén)"),
                        WordToken("对", "duì", "towards; at; for / concerning; regarding", "Kosakata HSK 2: 对 (duì)"),
                        WordToken("老师", "lǎo shī", "teacher", "Kosakata HSK 2: 老师 (lǎo shī)"),
                        WordToken("说", "shuō", "to speak; to talk; to say", "Kosakata HSK 2: 说 (shuō)"),
                        WordToken("不好意思", "bù hǎo yì si", "to feel embarrassed / to find it embarrassing / to be sorry (for inconveniencing sb)", "Kosakata HSK 2: 不好意思 (bù hǎo yì si)"),
                        WordToken("我", "wǒ", "I; me; my", "Kosakata HSK 2: 我 (wǒ)"),
                        WordToken("迟到", "chí dào", "to arrive late", "Kosakata HSK 2: 迟到 (chí dào)"),
                        WordToken("了", "le", "(completed action marker) / (modal particle indicating change of state, situation now)", "Kosakata HSK 2: 了 (le)")
                    )
                ),
                Sentence(
                    id = "s_fivemin_3",
                    hanzi = "没想到老师笑着说：”同学，你来早了，第一节英语课还没下课呢！”",
                    pinyin = "méi xiǎng dào lǎo shī xiào zhe shuō tóng xué nǐ lái zǎo le dì yī jié Yīng yǔ kè hái méi xià kè ne",
                    translation = "Tak disangka sang dosen tersenyum ramah dan berkata: “Wahai mahasiswa, kamu datang terlalu awal, kelas bahasa Inggris sesi pertama ini bahkan belum selesai!”",
                    tokens = listOf(
                        WordToken("没", "méi", "(negative prefix for verbs) have not; not", "Kosakata HSK 2: 没 (méi)"),
                        WordToken("想到", "xiǎng dào", "to think of / to call to mind / to anticipate", "Kosakata HSK 2: 想到 (xiǎng dào)"),
                        WordToken("老师", "lǎo shī", "teacher", "Kosakata HSK 2: 老师 (lǎo shī)"),
                        WordToken("笑", "xiào", "to laugh; to smile", "Kosakata HSK 2: 笑 (xiào)"),
                        WordToken("着", "zhe", "aspect particle indicating action in progress or ongoing state", "Kosakata HSK 2: 着 (zhe)"),
                        WordToken("说", "shuō", "to speak; to talk; to say", "Kosakata HSK 2: 说 (shuō)"),
                        WordToken("同学", "tóng xué", "fellow student / classmate", "Kosakata HSK 2: 同学 (tóng xué)"),
                        WordToken("你", "nǐ", "you", "Kosakata HSK 2: 你 (nǐ)"),
                        WordToken("来", "lái", "to come", "Kosakata HSK 2: 来 (lái)"),
                        WordToken("早", "zǎo", "early", "Kosakata HSK 2: 早 (zǎo)"),
                        WordToken("了", "le", "(completed action marker) / (modal particle indicating change of state, situation now)", "Kosakata HSK 2: 了 (le)"),
                        WordToken("第", "dì", "(prefix indicating ordinal number)", "Kosakata HSK 2: 第 (dì)"),
                        WordToken("一", "yī", "one / single / a (article)", "Kosakata HSK 2: 一 (yī)"),
                        WordToken("节", "jié", "classifier for segments: lessons, train wagons, biblical verses etc", "Kosakata HSK 2: 节 (jié)"),
                        WordToken("英语", "Yīng yǔ", "English (language)", "Kosakata HSK 2: 英语 (Yīng yǔ)"),
                        WordToken("课", "kè", "subject / course / class / lesson", "Kosakata HSK 2: 课 (kè)"),
                        WordToken("还", "hái", "still, still in progress, yet", "Kosakata HSK 2: 还 (hái)"),
                        WordToken("没", "méi", "(negative prefix for verbs) have not; not", "Kosakata HSK 2: 没 (méi)"),
                        WordToken("下", "xià", "to decline / to go down", "Kosakata HSK 2: 下 (xià)"),
                        WordToken("课", "kè", "subject / course / class / lesson", "Kosakata HSK 2: 课 (kè)"),
                        WordToken("呢", "ne", "(sentence-final particle) indicating that a state or situation still holds", "Kosakata HSK 2: 呢 (ne)")
                    )
                ),
                Sentence(
                    id = "s_fivemin_4",
                    hanzi = "张月一看手表，发现自己早到了5分钟，就赶快跑出了教室。",
                    pinyin = "Zhāng Yuè yī kàn shǒu biǎo fā xiàn zì jǐ zǎo dào le fēn zhōng jiù gǎn kuài pǎo chū le jiào shì",
                    translation = "Zhang Yue melirik jam tangannya dan menyadari bahwa ia justru datang lebih awal 5 menit, lalu ia pun buru-buru berlari keluar kelas dengan tersipu malu.",
                    tokens = listOf(
                        WordToken("张月", "Zhāng Yuè", "a personal name", "Kosakata HSK 2: 张月 (Zhāng Yuè)"),
                        WordToken("一", "yī", "as soon as", "Kosakata HSK 2: 一 (yī)"),
                        WordToken("看", "kàn", "to see; to look at / to read / to watch / to visit; to call on / to consider; to regard as / to look after / to treat (a patient or illness) / to depend on / to feel (that) / (after a verb) to give it a try / to watch out for", "Kosakata HSK 2: 看 (kàn)"),
                        WordToken("手表", "shǒu biǎo", "wristwatch", "Kosakata HSK 2: 手表 (shǒu biǎo)"),
                        WordToken("发现", "fā xiàn", "to notice; to become aware of / to discover; to find; to detect", "Kosakata HSK 2: 发现 (fā xiàn)"),
                        WordToken("自己", "zì jǐ", "oneself; (attributive) one's own", "Kosakata HSK 2: 自己 (zì jǐ)"),
                        WordToken("早", "zǎo", "early", "Kosakata HSK 2: 早 (zǎo)"),
                        WordToken("到", "dào", "to reach; to arrive / to (a place); until (a time); up to (a point) / (verb complement indicating arriving at a place or reaching a point)", "Kosakata HSK 2: 到 (dào)"),
                        WordToken("了", "le", "(completed action marker) / (modal particle indicating change of state, situation now)", "Kosakata HSK 2: 了 (le)"),
                        WordToken("分钟", "fēn zhōng", "minute", "Kosakata HSK 2: 分钟 (fēn zhōng)"),
                        WordToken("就", "jiù", "in that case; then", "Kosakata HSK 2: 就 (jiù)"),
                        WordToken("赶快", "gǎn kuài", "quickly; at once", "Kosakata HSK 2: 赶快 (gǎn kuài)"),
                        WordToken("跑", "pǎo", "to run / to run away / to escape / to run around (on errands etc) / (of a gas or liquid) to leak or evaporate", "Kosakata HSK 2: 跑 (pǎo)"),
                        WordToken("出", "chū", "(used after a verb to indicate an outward direction or a positive result)", "Kosakata HSK 2: 出 (chū)"),
                        WordToken("了", "le", "(completed action marker) / (modal particle indicating change of state, situation now)", "Kosakata HSK 2: 了 (le)"),
                        WordToken("教室", "jiào shì", "classroom", "Kosakata HSK 2: 教室 (jiào shì)")
                    )
                )
            ),
            questions = listOf(
                StoryQuestion(
                    id = "q_fivemin_1",
                    questionText = "张月那天早上发生了什么事情，导致她慌慌张张地跑去学校？ (Apa yang dialami Zhang Yue pagi itu sehingga ia tergesa-gesa lari ke kampus?)",
                    options = listOf("她把英语作业落在了宿舍 (Ia meninggalkan PR bahasa Inggris di asrama)", "她早上睡得很晚才起床，害怕英语课迟到 (Ia bangun sangat kesiangan dan takut terlambat kelas)", "她的自行车坏在了半路上 (Sepedanya mogok di tengah jalan)", "她走错了教学楼 (Ia salah masuk gedung kuliah)"),
                    correctAnswerIndex = 1,
                    explanation = "Zhang Yue bangun sangat terlambat di pagi hari sehingga ia panik terburu-buru lari ke kampus."
                ),
                StoryQuestion(
                    id = "q_fivemin_2",
                    questionText = "张月急匆匆推开教室门向老师道歉时，老师的反应是什么？ (Bagaimana tanggapan dosen saat Zhang Yue membuka pintu dan meminta maaf?)",
                    options = listOf("严厉批评她不遵守校规 (Memarahi habis-habisan karena melanggar aturan)", "笑着告诉她第一节课还没下课，她其实来早了 (Tersenyum dan memberitahu bahwa sesi pertama belum usai, ia justru datang kepagian)", "让她罚站到教室外面 (Menghukumnya berdiri di luar kelas)", "假装没看见她 (Pura-pura tidak melihatnya)"),
                    correctAnswerIndex = 1,
                    explanation = "Dosen kelas sebelumnya tersenyum ramah dan menjelaskan bahwa sesi pertama masih berlangsung."
                ),
                StoryQuestion(
                    id = "q_fivemin_3",
                    questionText = "张月看了看手表后，发现了一个什么令人哭笑不得的事实？ (Fakta mengejutkan apa yang disadari Zhang Yue setelah melirik jam tangannya?)",
                    options = listOf("手表完全停走了 (Jam tangannya mati total)", "自己不但没迟到，反而早到了5分钟 (Dirinya sama sekali tidak telat, melainkan datang 5 menit lebih awal)", "今天其实是星期天不用上课 (Hari itu ternyata hari Minggu libur)", "这节课是数学课而不是英语课 (Kelas itu ternyata matematika bukan bahasa Inggris)"),
                    correctAnswerIndex = 1,
                    explanation = "Ketakutan Zhang Yue ternyata keliru; ia justru datang 5 menit sebelum kelasnya sendiri dimulai."
                ),
                StoryQuestion(
                    id = "q_fivemin_4",
                    questionText = "这个故事给我们在大学生活与日常时间管理上带来什么启发？ (Pelajaran apa yang dapat dipetik dari kisah kebiasaan Zhang Yue ini?)",
                    options = listOf("平时养成早起与核对课程表时间的从容习惯 (Membiasakan diri bangun pagi dan mengecek jadwal agar tidak panik)", "上课随时迟到无所谓 (Bebas terlambat kuliah semaunya)", "不戴手表也能过得很好 (Tidak perlu memakai jam tangan)", "不用去上早八英语课 (Tidak usah masuk kuliah pagi)"),
                    correctAnswerIndex = 0,
                    explanation = "Manajemen waktu yang tertib dan kebiasaan bangun pagi mencegah kepanikan konyol dalam rutinitas belajar."
                )
            )
        ),
        // Cerita Mandarin Bean 138 (HSK 2): Round Off (Pembulatan Angka)
        Story(
            id = "story_round_off",
            titleHanzi = "四舍五入",
            titlePinyin = "Sì Shě Wǔ Rù",
            titleTranslation = "Round Off (Pembulatan Angka)",
            level = "HSK 2",
            category = "Humor & Sekolah",
            description = "Kelakar kepolosan anak sekolah yang memanfaatkan rumus pembulatan matematika demi meminta uang saku lebih kepada ayahnya.",
            coverEmoji = "🔢",
            coverImageRes = R.drawable.cover_story_round_off,
            estimatedReadMinutes = 2,
            sentences = listOf(
                Sentence(
                    id = "s_roundoff_1",
                    hanzi = "儿子高兴地从学校回来，问妈妈：”爸爸呢？”",
                    pinyin = "ér zi gāo xìng de cóng xué xiào huí lái wèn mā ma bà ba ne",
                    translation = "Anak laki-laki pulang dari sekolah dengan wajah gembira, lalu bertanya kepada ibunya: “Ibu, di mana ayah?”",
                    tokens = listOf(
                        WordToken("儿子", "ér zi", "son", "Kosakata HSK 2: 儿子 (ér zi)"),
                        WordToken("高兴", "gāo xìng", "happy / glad / in a cheerful mood", "Kosakata HSK 2: 高兴 (gāo xìng)"),
                        WordToken("地", "de", "-ly / structural particle: used before a verb or adjective, linking it to preceding modifying adverbial adjunct", "Kosakata HSK 2: 地 (de)"),
                        WordToken("从", "cóng", "from; through; via / (bound form) retainer; attendant / (bound form) assistant; auxiliary; subordinate / (bound form) related by common paternal grandfather or earlier ancestor", "Kosakata HSK 2: 从 (cóng)"),
                        WordToken("学校", "xué xiào", "school", "Kosakata HSK 2: 学校 (xué xiào)"),
                        WordToken("回来", "huí lái", "to return; to come back", "Kosakata HSK 2: 回来 (huí lái)"),
                        WordToken("问", "wèn", "to ask; to inquire", "Kosakata HSK 2: 问 (wèn)"),
                        WordToken("妈妈", "mā ma", "mama / mommy / mother", "Kosakata HSK 2: 妈妈 (mā ma)"),
                        WordToken("爸爸", "bà ba", "(coll.) father; dad", "Kosakata HSK 2: 爸爸 (bà ba)"),
                        WordToken("呢", "ne", "(sentence-final particle) used in questions to link back to prior discourse or context (\"what about...?\", \"and...?\")", "Kosakata HSK 2: 呢 (ne)")
                    )
                ),
                Sentence(
                    id = "s_roundoff_2",
                    hanzi = "妈妈奇怪地问：”爸爸在家，你找爸爸做什么？”",
                    pinyin = "mā ma qí guài de wèn bà ba zài jiā nǐ zhǎo bà ba zuò shén me",
                    translation = "Sang ibu bertanya heran: “Ayah ada di rumah, untuk apa kamu mencari ayahmu?”",
                    tokens = listOf(
                        WordToken("妈妈", "mā ma", "mama / mommy / mother", "Kosakata HSK 2: 妈妈 (mā ma)"),
                        WordToken("奇怪", "qí guài", "strange / odd", "Kosakata HSK 2: 奇怪 (qí guài)"),
                        WordToken("地", "de", "-ly / structural particle: used before a verb or adjective, linking it to preceding modifying adverbial adjunct", "Kosakata HSK 2: 地 (de)"),
                        WordToken("问", "wèn", "to ask; to inquire", "Kosakata HSK 2: 问 (wèn)"),
                        WordToken("爸爸", "bà ba", "(coll.) father; dad", "Kosakata HSK 2: 爸爸 (bà ba)"),
                        WordToken("在", "zài", "(of sb or sth) to be (located) at", "Kosakata HSK 2: 在 (zài)"),
                        WordToken("家", "jiā", "home / family / (polite) my (sister, uncle etc)", "Kosakata HSK 2: 家 (jiā)"),
                        WordToken("你", "nǐ", "you", "Kosakata HSK 2: 你 (nǐ)"),
                        WordToken("找", "zhǎo", "to try to find / to look for / to call on sb / to find / to seek", "Kosakata HSK 2: 找 (zhǎo)"),
                        WordToken("爸爸", "bà ba", "(coll.) father; dad", "Kosakata HSK 2: 爸爸 (bà ba)"),
                        WordToken("做", "zuò", "to do; to engage in; to hold (a party etc)", "Kosakata HSK 2: 做 (zuò)"),
                        WordToken("什么", "shén me", "what?", "Kosakata HSK 2: 什么 (shén me)")
                    )
                ),
                Sentence(
                    id = "s_roundoff_3",
                    hanzi = "儿子回答：”我向爸爸要5角钱。”",
                    pinyin = "ér zi huí dá wǒ xiàng bà ba yào jiǎo qián",
                    translation = "Putranya menjawab: “Aku ingin meminta uang 5 jiao (sen) kepada ayah.”",
                    tokens = listOf(
                        WordToken("儿子", "ér zi", "son", "Kosakata HSK 2: 儿子 (ér zi)"),
                        WordToken("回答", "huí dá", "to reply; to answer / reply; answer", "Kosakata HSK 2: 回答 (huí dá)"),
                        WordToken("我", "wǒ", "I; me; my", "Kosakata HSK 2: 我 (wǒ)"),
                        WordToken("向", "xiàng", "towards / shortly before / formerly / always / all along", "Kosakata HSK 2: 向 (xiàng)"),
                        WordToken("爸爸", "bà ba", "(coll.) father; dad", "Kosakata HSK 2: 爸爸 (bà ba)"),
                        WordToken("要", "yào", "to want; to need; to ask for", "Kosakata HSK 2: 要 (yào)"),
                        WordToken("角", "jiǎo", "angle / corner / horn / unit of money equal to 0.1 yuan, or 10 cents (a dime)", "Kosakata HSK 2: 角 (jiǎo)"),
                        WordToken("钱", "qián", "coin / money / unit of weight, one tenth of a tael", "Kosakata HSK 2: 钱 (qián)")
                    )
                ),
                Sentence(
                    id = "s_roundoff_4",
                    hanzi = "”为什么？”妈妈问。",
                    pinyin = "wèi shén me mā ma wèn",
                    translation = "“Mengapa begitu?” tanya sang ibu.",
                    tokens = listOf(
                        WordToken("为什么", "wèi shén me", "why? / for what reason?", "Kosakata HSK 2: 为什么 (wèi shén me)"),
                        WordToken("妈妈", "mā ma", "mama / mommy / mother", "Kosakata HSK 2: 妈妈 (mā ma)"),
                        WordToken("问", "wèn", "to ask; to inquire", "Kosakata HSK 2: 问 (wèn)")
                    )
                ),
                Sentence(
                    id = "s_roundoff_5",
                    hanzi = "儿子回答：”在考数学以前，爸爸对我说‘如果考100分，就给我1元钱，考80分就给8角。’今天，我数学考了45分。数学上要四舍五入，所以爸爸必须给我5角钱。”",
                    pinyin = "ér zi huí dá zài kǎo shù xué yǐ qián bà ba duì wǒ shuō rú guǒ kǎo fēn jiù gěi wǒ yuán qián kǎo fēn jiù gěi jiǎo jīn tiān wǒ shù xué kǎo le fēn shù xué shàng yào sì shě wǔ rù suǒ yǐ bà ba bì xū gěi wǒ jiǎo qián",
                    translation = "Putranya menerangkan: “Sebelum ujian matematika, ayah pernah berjanji kepadaku ‘jika dapat nilai 100, akan diberi uang 1 yuan, jika dapat 80 akan diberi 8 jiao.’ Hari ini, nilai ujian matematikaku dapat 45 poin. Menurut aturan matematika harus dibulatkan ke atas (sìshě wǔrù), jadi ayah wajib memberiku 5 jiao!”",
                    tokens = listOf(
                        WordToken("儿子", "ér zi", "son", "Kosakata HSK 2: 儿子 (ér zi)"),
                        WordToken("回答", "huí dá", "to reply; to answer / reply; answer", "Kosakata HSK 2: 回答 (huí dá)"),
                        WordToken("在", "zài", "(of sb or sth) to be (located) at", "Kosakata HSK 2: 在 (zài)"),
                        WordToken("考", "kǎo", "to check / to verify / to test / to examine / to take an exam / to take an entrance exam for", "Kosakata HSK 2: 考 (kǎo)"),
                        WordToken("数学", "shù xué", "mathematics", "Kosakata HSK 2: 数学 (shù xué)"),
                        WordToken("以前", "yǐ qián", "before / formerly / previous / ago", "Kosakata HSK 2: 以前 (yǐ qián)"),
                        WordToken("爸爸", "bà ba", "(coll.) father; dad", "Kosakata HSK 2: 爸爸 (bà ba)"),
                        WordToken("对", "duì", "towards; at; for / concerning; regarding", "Kosakata HSK 2: 对 (duì)"),
                        WordToken("我", "wǒ", "I; me; my", "Kosakata HSK 2: 我 (wǒ)"),
                        WordToken("说", "shuō", "to speak; to talk; to say", "Kosakata HSK 2: 说 (shuō)"),
                        WordToken("如果", "rú guǒ", "if; in case; in the event that", "Kosakata HSK 2: 如果 (rú guǒ)"),
                        WordToken("考", "kǎo", "to check / to verify / to test / to examine / to take an exam / to take an entrance exam for", "Kosakata HSK 2: 考 (kǎo)"),
                        WordToken("分", "fēn", "a point (in sports or games)", "Kosakata HSK 2: 分 (fēn)"),
                        WordToken("就", "jiù", "only; as little as", "Kosakata HSK 2: 就 (jiù)"),
                        WordToken("给", "gěi", "to give", "Kosakata HSK 2: 给 (gěi)"),
                        WordToken("我", "wǒ", "I; me; my", "Kosakata HSK 2: 我 (wǒ)"),
                        WordToken("元", "yuán", "currency unit (esp. Chinese yuan) / era (of a reign) / (geology) eon", "Kosakata HSK 2: 元 (yuán)"),
                        WordToken("钱", "qián", "coin / money / unit of weight, one tenth of a tael", "Kosakata HSK 2: 钱 (qián)"),
                        WordToken("考", "kǎo", "to check / to verify / to test / to examine / to take an exam / to take an entrance exam for", "Kosakata HSK 2: 考 (kǎo)"),
                        WordToken("分", "fēn", "a point (in sports or games)", "Kosakata HSK 2: 分 (fēn)"),
                        WordToken("就", "jiù", "in that case; then", "Kosakata HSK 2: 就 (jiù)"),
                        WordToken("给", "gěi", "to give", "Kosakata HSK 2: 给 (gěi)"),
                        WordToken("角", "jiǎo", "angle / corner / horn / unit of money equal to 0.1 yuan, or 10 cents (a dime)", "Kosakata HSK 2: 角 (jiǎo)"),
                        WordToken("今天", "jīn tiān", "today", "Kosakata HSK 2: 今天 (jīn tiān)"),
                        WordToken("我", "wǒ", "I; me; my", "Kosakata HSK 2: 我 (wǒ)"),
                        WordToken("数学", "shù xué", "mathematics", "Kosakata HSK 2: 数学 (shù xué)"),
                        WordToken("考", "kǎo", "to check / to verify / to test / to examine / to take an exam / to take an entrance exam for", "Kosakata HSK 2: 考 (kǎo)"),
                        WordToken("了", "le", "(completed action marker) / (modal particle indicating change of state, situation now)", "Kosakata HSK 2: 了 (le)"),
                        WordToken("分", "fēn", "a point (in sports or games)", "Kosakata HSK 2: 分 (fēn)"),
                        WordToken("数学", "shù xué", "mathematics", "Kosakata HSK 2: 数学 (shù xué)"),
                        WordToken("上", "shàng", "(noun suffix) on; above", "Kosakata HSK 2: 上 (shàng)"),
                        WordToken("要", "yào", "will; shall; about to / need to; should / if", "Kosakata HSK 2: 要 (yào)"),
                        WordToken("四舍五入", "sì shě wǔ rù", "(math.) to round up or down / to round off", "Kosakata HSK 2: 四舍五入 (sì shě wǔ rù)"),
                        WordToken("所以", "suǒ yǐ", "therefore / as a result / so", "Kosakata HSK 2: 所以 (suǒ yǐ)"),
                        WordToken("爸爸", "bà ba", "(coll.) father; dad", "Kosakata HSK 2: 爸爸 (bà ba)"),
                        WordToken("必须", "bì xū", "to have to / must / compulsory / necessarily", "Kosakata HSK 2: 必须 (bì xū)"),
                        WordToken("给", "gěi", "to give", "Kosakata HSK 2: 给 (gěi)"),
                        WordToken("我", "wǒ", "I; me; my", "Kosakata HSK 2: 我 (wǒ)"),
                        WordToken("角", "jiǎo", "angle / corner / horn / unit of money equal to 0.1 yuan, or 10 cents (a dime)", "Kosakata HSK 2: 角 (jiǎo)"),
                        WordToken("钱", "qián", "coin / money / unit of weight, one tenth of a tael", "Kosakata HSK 2: 钱 (qián)")
                    )
                )
            ),
            questions = listOf(
                StoryQuestion(
                    id = "q_roundoff_1",
                    questionText = "儿子从学校回家后，向妈妈提出了什么要求？ (Permintaan apa yang diajukan sang anak kepada ibunya setiba dari sekolah?)",
                    options = listOf("要买最新款的玩具书包 (Ingin beli tas sekolah model baru)", "要找爸爸要5角钱 (Ingin mencari ayahnya untuk meminta uang 5 jiao)", "想要吃巧克力冰淇淋 (Ingin makan es krim cokelat)", "想去同学家过夜 (Ingin menginap di rumah teman)"),
                    correctAnswerIndex = 1,
                    explanation = "Anak laki-laki itu mencari ayahnya khusus untuk menagih uang saku sebesar 5 jiao."
                ),
                StoryQuestion(
                    id = "q_roundoff_2",
                    questionText = "爸爸在数学考试前曾给儿子立下过怎样的奖励承诺？ (Janji hadiah apa yang dibuat ayah sebelum anak mengikuti ujian matematika?)",
                    options = listOf("考100分给100元 (Dapat 100 diberi 100 yuan)", "考100分给1元钱，考80分给8角钱 (Dapat nilai 100 diberi 1 yuan, dapat 80 diberi 8 jiao)", "考不及格就要做家务 (Tidak lulus harus mencuci piring)", "考第一名带他去迪士尼 (Juara satu diajak ke Disneyland)"),
                    correctAnswerIndex = 1,
                    explanation = "Ayah berjanji memberikan 1 yuan untuk nilai 100, dan 8 jiao untuk nilai 80."
                ),
                StoryQuestion(
                    id = "q_roundoff_3",
                    questionText = "儿子今天数学考了多少分？ (Berapa nilai ujian matematika yang diperoleh sang anak hari ini?)",
                    options = listOf("95分 (95 poin)", "45分 (45 poin)", "50分 (50 poin)", "60分 (60 poin)"),
                    correctAnswerIndex = 1,
                    explanation = "Nilai ujian matematikanya hanya 45 poin, jauh di bawah standar kelulusan."
                ),
                StoryQuestion(
                    id = "q_roundoff_4",
                    questionText = "儿子依据什么数学概念理直气壮地找爸爸索要5角钱？ (Konsep matematika apa yang dijadikan dalih sang anak untuk menagih uang?)",
                    options = listOf("加减乘除法则 (Operasi hitung dasar)", "“四舍五入”法则，将45分个位数5向上进位成50分 (Aturan pembulatan 'sìshě wǔrù', angka 5 di belakang dibulatkan ke atas jadi 50)", "几何定理 (Teorema geometri)", "概率统计学 (Teori peluang statistik)"),
                    correctAnswerIndex = 1,
                    explanation = "Anak memanfaatkan logika 'empat dibuang, lima dibulatkan ke atas' (四舍五入) untuk menagih uang 5 jiao!"
                )
            )
        ),
        // Cerita Mandarin Bean 139 (HSK 2): Capacity for Liquor (Kapasitas Minum)
        Story(
            id = "story_capacity_for_liquor",
            titleHanzi = "酒量",
            titlePinyin = "Jiǔliàng",
            titleTranslation = "Capacity for Liquor (Kapasitas Minum)",
            level = "HSK 2",
            category = "Humor & Logika",
            description = "Jawaban kocak seorang murid ketika guru matematikanya memberikan soal pengurangan dengan analogi cangkir arak sang ayah.",
            coverEmoji = "🍷",
            coverImageRes = R.drawable.cover_story_capacity_for_liquor,
            estimatedReadMinutes = 2,
            sentences = listOf(
                Sentence(
                    id = "s_capliq_1",
                    hanzi = "数学老师问：”桌子上有三杯酒，我请你父亲喝一杯，还有几杯？”",
                    pinyin = "shù xué lǎo shī wèn zhuō zi shàng yǒu sān bēi jiǔ wǒ qǐng nǐ fù qīn hē yī bēi hái yǒu jǐ bēi",
                    translation = "Guru matematika bertanya: “Di atas meja ada tiga cangkir arak, jika saya mentraktir ayahmu minum satu cangkir, sisa berapa cangkir di meja?”",
                    tokens = listOf(
                        WordToken("数学", "shù xué", "mathematics", "Kosakata HSK 2: 数学 (shù xué)"),
                        WordToken("老师", "lǎo shī", "teacher", "Kosakata HSK 2: 老师 (lǎo shī)"),
                        WordToken("问", "wèn", "to ask; to inquire", "Kosakata HSK 2: 问 (wèn)"),
                        WordToken("桌子", "zhuō zi", "table / desk", "Kosakata HSK 2: 桌子 (zhuō zi)"),
                        WordToken("上", "shàng", "(noun suffix) on; above", "Kosakata HSK 2: 上 (shàng)"),
                        WordToken("有", "yǒu", "to have; there is", "Kosakata HSK 2: 有 (yǒu)"),
                        WordToken("三", "sān", "three / 3", "Kosakata HSK 2: 三 (sān)"),
                        WordToken("杯", "bēi", "classifier for certain containers of liquids", "Kosakata HSK 2: 杯 (bēi)"),
                        WordToken("酒", "jiǔ", "wine (esp. rice wine) / liquor / spirits / alcoholic beverage", "Kosakata HSK 2: 酒 (jiǔ)"),
                        WordToken("我", "wǒ", "I; me; my", "Kosakata HSK 2: 我 (wǒ)"),
                        WordToken("请", "qǐng", "to treat (to a meal etc)", "Kosakata HSK 2: 请 (qǐng)"),
                        WordToken("你", "nǐ", "you", "Kosakata HSK 2: 你 (nǐ)"),
                        WordToken("父亲", "fù qīn", "father", "Kosakata HSK 2: 父亲 (fù qīn)"),
                        WordToken("喝", "hē", "to drink", "Kosakata HSK 2: 喝 (hē)"),
                        WordToken("一", "yī", "one / single / a (article)", "Kosakata HSK 2: 一 (yī)"),
                        WordToken("杯", "bēi", "classifier for certain containers of liquids", "Kosakata HSK 2: 杯 (bēi)"),
                        WordToken("还", "hái", "still, still in progress, yet", "Kosakata HSK 2: 还 (hái)"),
                        WordToken("有", "yǒu", "to have; there is", "Kosakata HSK 2: 有 (yǒu)"),
                        WordToken("几", "jǐ", "how much / how many", "Kosakata HSK 2: 几 (jǐ)"),
                        WordToken("杯", "bēi", "classifier for certain containers of liquids", "Kosakata HSK 2: 杯 (bēi)")
                    )
                ),
                Sentence(
                    id = "s_capliq_2",
                    hanzi = "小学生回答：”一杯也没有了。”",
                    pinyin = "xiǎo xué shēng huí dá yī bēi yě méi yǒu le",
                    translation = "Murid SD itu menjawab lugas: “Tidak tersisa satu cangkir pun!”",
                    tokens = listOf(
                        WordToken("小学生", "xiǎo xué shēng", "primary school student / schoolchild / (fig.) beginner", "Kosakata HSK 2: 小学生 (xiǎo xué shēng)"),
                        WordToken("回答", "huí dá", "to reply; to answer / reply; answer", "Kosakata HSK 2: 回答 (huí dá)"),
                        WordToken("一", "yī", "one / single / a (article)", "Kosakata HSK 2: 一 (yī)"),
                        WordToken("杯", "bēi", "classifier for certain containers of liquids", "Kosakata HSK 2: 杯 (bēi)"),
                        WordToken("也", "yě", "even (extreme or unexpected case)", "Kosakata HSK 2: 也 (yě)"),
                        WordToken("没有", "méi yǒu", "doesn't exist / to not be", "Kosakata HSK 2: 没有 (méi yǒu)"),
                        WordToken("了", "le", "(completed action marker) / (modal particle indicating change of state, situation now)", "Kosakata HSK 2: 了 (le)")
                    )
                ),
                Sentence(
                    id = "s_capliq_3",
                    hanzi = "数学老师说：”你好像还没有听懂，那我再说一遍吧。桌子上有三杯酒，我请你父亲喝一杯，还有几杯？”",
                    pinyin = "shù xué lǎo shī shuō nǐ hǎo xiàng hái méi yǒu tīng dǒng nà wǒ zài shuō yī biàn ba zhuō zi shàng yǒu sān bēi jiǔ wǒ qǐng nǐ fù qīn hē yī bēi hái yǒu jǐ bēi",
                    translation = "Guru matematika berkata: “Sepertinya kamu belum paham soalnya, biar Bapak ulangi sekali lagi ya. Di atas meja ada tiga cangkir arak, jika saya mentraktir ayahmu minum satu cangkir, masih tersisa berapa cangkir?”",
                    tokens = listOf(
                        WordToken("数学", "shù xué", "mathematics", "Kosakata HSK 2: 数学 (shù xué)"),
                        WordToken("老师", "lǎo shī", "teacher", "Kosakata HSK 2: 老师 (lǎo shī)"),
                        WordToken("说", "shuō", "to speak; to talk; to say", "Kosakata HSK 2: 说 (shuō)"),
                        WordToken("你", "nǐ", "you", "Kosakata HSK 2: 你 (nǐ)"),
                        WordToken("好像", "hǎo xiàng", "to seem like", "Kosakata HSK 2: 好像 (hǎo xiàng)"),
                        WordToken("还", "hái", "still, still in progress, yet", "Kosakata HSK 2: 还 (hái)"),
                        WordToken("没有", "méi yǒu", "haven't / hasn't", "Kosakata HSK 2: 没有 (méi yǒu)"),
                        WordToken("听", "tīng", "to listen to; to hear", "Kosakata HSK 2: 听 (tīng)"),
                        WordToken("懂", "dǒng", "to understand / to comprehend", "Kosakata HSK 2: 懂 (dǒng)"),
                        WordToken("那", "nà", "then (in that case)", "Kosakata HSK 2: 那 (nà)"),
                        WordToken("我", "wǒ", "I; me; my", "Kosakata HSK 2: 我 (wǒ)"),
                        WordToken("再", "zài", "again; once more; re-", "Kosakata HSK 2: 再 (zài)"),
                        WordToken("说", "shuō", "to speak; to talk; to say", "Kosakata HSK 2: 说 (shuō)"),
                        WordToken("一", "yī", "one / single / a (article)", "Kosakata HSK 2: 一 (yī)"),
                        WordToken("遍", "biàn", "classifier for actions: one time", "Kosakata HSK 2: 遍 (biàn)"),
                        WordToken("吧", "ba", "(modal particle indicating suggestion or surmise) / ...right? / ...OK? / ...I presume.", "Kosakata HSK 2: 吧 (ba)"),
                        WordToken("桌子", "zhuō zi", "table / desk", "Kosakata HSK 2: 桌子 (zhuō zi)"),
                        WordToken("上", "shàng", "(noun suffix) on; above", "Kosakata HSK 2: 上 (shàng)"),
                        WordToken("有", "yǒu", "to have; there is", "Kosakata HSK 2: 有 (yǒu)"),
                        WordToken("三", "sān", "three / 3", "Kosakata HSK 2: 三 (sān)"),
                        WordToken("杯", "bēi", "classifier for certain containers of liquids", "Kosakata HSK 2: 杯 (bēi)"),
                        WordToken("酒", "jiǔ", "wine (esp. rice wine) / liquor / spirits / alcoholic beverage", "Kosakata HSK 2: 酒 (jiǔ)"),
                        WordToken("我", "wǒ", "I; me; my", "Kosakata HSK 2: 我 (wǒ)"),
                        WordToken("请", "qǐng", "to treat (to a meal etc)", "Kosakata HSK 2: 请 (qǐng)"),
                        WordToken("你", "nǐ", "you", "Kosakata HSK 2: 你 (nǐ)"),
                        WordToken("父亲", "fù qīn", "father", "Kosakata HSK 2: 父亲 (fù qīn)"),
                        WordToken("喝", "hē", "to drink", "Kosakata HSK 2: 喝 (hē)"),
                        WordToken("一", "yī", "one / single / a (article)", "Kosakata HSK 2: 一 (yī)"),
                        WordToken("杯", "bēi", "classifier for certain containers of liquids", "Kosakata HSK 2: 杯 (bēi)"),
                        WordToken("还", "hái", "still, still in progress, yet", "Kosakata HSK 2: 还 (hái)"),
                        WordToken("有", "yǒu", "to have; there is", "Kosakata HSK 2: 有 (yǒu)"),
                        WordToken("几", "jǐ", "how much / how many", "Kosakata HSK 2: 几 (jǐ)"),
                        WordToken("杯", "bēi", "classifier for certain containers of liquids", "Kosakata HSK 2: 杯 (bēi)")
                    )
                ),
                Sentence(
                    id = "s_capliq_4",
                    hanzi = "小学生回答：”老师，真的一杯也没有了，你不了解我父亲的脾气，如果他看见桌子上有酒，一定一杯也不会剩的。”",
                    pinyin = "xiǎo xué shēng huí dá lǎo shī zhēn dí yī bēi yě méi yǒu le nǐ bù liǎo jiě wǒ fù qīn de pí qi rú guǒ tā kàn jiàn zhuō zi shàng yǒu jiǔ yī dìng yī bēi yě bù huì shèng de",
                    translation = "Murid SD itu tetap menjawab: “Pak Guru, sungguh tidak ada yang tersisa sama sekali. Bapak tidak mengenal watak ayah saya; jika beliau melihat ada arak di meja, pasti tak akan disisakan walau secangkir pun!”",
                    tokens = listOf(
                        WordToken("小学生", "xiǎo xué shēng", "primary school student / schoolchild / (fig.) beginner", "Kosakata HSK 2: 小学生 (xiǎo xué shēng)"),
                        WordToken("回答", "huí dá", "to reply; to answer / reply; answer", "Kosakata HSK 2: 回答 (huí dá)"),
                        WordToken("老师", "lǎo shī", "teacher", "Kosakata HSK 2: 老师 (lǎo shī)"),
                        WordToken("真", "zhēn", "really / truly / indeed", "Kosakata HSK 2: 真 (zhēn)"),
                        WordToken("的", "dí", "really and truly", "Kosakata HSK 2: 的 (dí)"),
                        WordToken("一", "yī", "one / single / a (article)", "Kosakata HSK 2: 一 (yī)"),
                        WordToken("杯", "bēi", "classifier for certain containers of liquids", "Kosakata HSK 2: 杯 (bēi)"),
                        WordToken("也", "yě", "even (extreme or unexpected case)", "Kosakata HSK 2: 也 (yě)"),
                        WordToken("没有", "méi yǒu", "doesn't exist / to not be", "Kosakata HSK 2: 没有 (méi yǒu)"),
                        WordToken("了", "le", "(completed action marker) / (modal particle indicating change of state, situation now)", "Kosakata HSK 2: 了 (le)"),
                        WordToken("你", "nǐ", "you", "Kosakata HSK 2: 你 (nǐ)"),
                        WordToken("不", "bù", "no; not so", "Kosakata HSK 2: 不 (bù)"),
                        WordToken("了解", "liǎo jiě", "to understand / to realize / to find out", "Kosakata HSK 2: 了解 (liǎo jiě)"),
                        WordToken("我", "wǒ", "I; me; my", "Kosakata HSK 2: 我 (wǒ)"),
                        WordToken("父亲", "fù qīn", "father", "Kosakata HSK 2: 父亲 (fù qīn)"),
                        WordToken("的", "de", "possessive particle (of; 's) / modifying particle (used after an attribute to modify a noun or to form a nominal expression)", "Kosakata HSK 2: 的 (de)"),
                        WordToken("脾气", "pí qi", "character; temperament; disposition / bad temper", "Kosakata HSK 2: 脾气 (pí qi)"),
                        WordToken("如果", "rú guǒ", "if; in case; in the event that", "Kosakata HSK 2: 如果 (rú guǒ)"),
                        WordToken("他", "tā", "he; him; his", "Kosakata HSK 2: 他 (tā)"),
                        WordToken("看见", "kàn jiàn", "to see; to catch sight of", "Kosakata HSK 2: 看见 (kàn jiàn)"),
                        WordToken("桌子", "zhuō zi", "table / desk", "Kosakata HSK 2: 桌子 (zhuō zi)"),
                        WordToken("上", "shàng", "(noun suffix) on; above", "Kosakata HSK 2: 上 (shàng)"),
                        WordToken("有", "yǒu", "to have; there is", "Kosakata HSK 2: 有 (yǒu)"),
                        WordToken("酒", "jiǔ", "wine (esp. rice wine) / liquor / spirits / alcoholic beverage", "Kosakata HSK 2: 酒 (jiǔ)"),
                        WordToken("一定", "yī dìng", "surely; certainly; definitely", "Kosakata HSK 2: 一定 (yī dìng)"),
                        WordToken("一", "yī", "one / single / a (article)", "Kosakata HSK 2: 一 (yī)"),
                        WordToken("杯", "bēi", "classifier for certain containers of liquids", "Kosakata HSK 2: 杯 (bēi)"),
                        WordToken("也", "yě", "even (extreme or unexpected case)", "Kosakata HSK 2: 也 (yě)"),
                        WordToken("不", "bù", "no; not so", "Kosakata HSK 2: 不 (bù)"),
                        WordToken("会", "huì", "to be likely to; to be sure to", "Kosakata HSK 2: 会 (huì)"),
                        WordToken("剩", "shèng", "to remain / to be left / to have as remainder", "Kosakata HSK 2: 剩 (shèng)"),
                        WordToken("的", "de", "emphatic particle (used at the end of a declarative sentence for emphasis)", "Kosakata HSK 2: 的 (de)")
                    )
                )
            ),
            questions = listOf(
                StoryQuestion(
                    id = "q_capliq_1",
                    questionText = "数学老师在上课时向小学生提出了怎样的一道应用算术题？ (Soal hitungan matematika apa yang diajukan guru kepada sang murid?)",
                    options = listOf("桌上有十个苹果吃了五个剩几个 (Ada 10 apel dimakan 5 sisa berapa)", "桌上有三杯酒，请父亲喝一杯，还剩几杯 (Di meja ada 3 cangkir arak, jika ayah minum 1 cangkir, sisa berapa cangkir)", "买三本书花多少钱 (Beli 3 buku habis berapa uang)", "火车时速多少公里 (Berapa kecepatan kereta api)"),
                    correctAnswerIndex = 1,
                    explanation = "Guru membuat perumpamaan soal pengurangan dengan tiga cangkir arak di meja."
                ),
                StoryQuestion(
                    id = "q_capliq_2",
                    questionText = "面对这道简单的“3减1”算术题，小学生的坚定回答是什么？ (Apa jawaban mantap dari murid SD atas soal 3 dikurang 1 tersebut?)",
                    options = listOf("还剩两杯 (Tersisa dua cangkir)", "一杯也没有了 (Tidak tersisa satu cangkir pun!)", "还剩四杯 (Tersisa empat cangkir)", "不知道 (Saya tidak tahu)"),
                    correctAnswerIndex = 1,
                    explanation = "Murid bersikeras bahwa meja akan bersih tanpa sisa arak sedikit pun."
                ),
                StoryQuestion(
                    id = "q_capliq_3",
                    questionText = "当老师以为孩子没听清再次出题后，孩子道出了什么让人捧腹的家庭真相？ (Fakta lucu apa yang diungkapkan sang anak mengenai ayahnya?)",
                    options = listOf("父亲从来不喝酒 (Ayahnya tidak pernah minum arak)", "父亲是个海量酒鬼，只要桌上有酒就绝对一杯不剩全喝光 (Ayahnya peminum berat, jika ada arak di meja pasti dihabiskan semua tanpa sisa)", "家里酒杯碎了 (Cangkir di rumah sudah pecah)", "父亲害怕喝酒生病 (Ayahnya takut sakit jika minum arak)"),
                    correctAnswerIndex = 1,
                    explanation = "Kebiasaan minum sang ayah di rumah membuat teori matematika murni tidak berlaku baginya!"
                ),
                StoryQuestion(
                    id = "q_capliq_4",
                    questionText = "这个幽默故事展示了儿童在应用数学逻辑时的什么思维特征？ (Karakteristik berpikir apa yang tercermin dari kelakar murid ini?)",
                    options = listOf("数学成绩极度恶劣 (Murid yang tidak punya masa depan)", "将生活现实经验与纯抽象数学符号生动融合的具象思维 (Berpikir berbasis pengalaman konkret keseharian dibanding logika rumus kaku)", "对老师极度不礼貌 (Bentuk pembangkangan kepada guru)", "完全不懂加减法 (Sama sekali tidak tahu berhitung)"),
                    correctAnswerIndex = 1,
                    explanation = "Anak kecil menghubungkan soal matematika secara polos dengan realitas watak orang tuanya di rumah."
                )
            )
        ),
        // Cerita Mandarin Bean 140 (HSK 2): Change a Doctor (Ganti Dokter)
        Story(
            id = "story_change_a_doctor",
            titleHanzi = "换医生",
            titlePinyin = "Huàn Yīshēng",
            titleTranslation = "Change a Doctor (Ganti Dokter)",
            level = "HSK 2",
            category = "Kesehatan & Anak",
            description = "Kepolosan anak kecil di klinik yang mengira dokternya tidak kompeten hanya karena dokter bercanda memegang telinganya.",
            coverEmoji = "🩺",
            coverImageRes = R.drawable.cover_story_change_a_doctor,
            estimatedReadMinutes = 2,
            sentences = listOf(
                Sentence(
                    id = "s_chgdoc_1",
                    hanzi = "小亮身体不舒服，被妈妈带去医院看病。",
                    pinyin = "Xiǎo Liàng shēn tǐ bù shū fu bèi mā ma dài qù yī yuàn kàn bìng",
                    translation = "Xiao Liang sedang merasa tidak enak badan, lalu dibawa oleh ibunya pergi berobat ke rumah sakit.",
                    tokens = listOf(
                        WordToken("小亮", "Xiǎo Liàng", "a personal name, Xiaoliang", "Kosakata HSK 2: 小亮 (Xiǎo Liàng)"),
                        WordToken("身体", "shēn tǐ", "one's health", "Kosakata HSK 2: 身体 (shēn tǐ)"),
                        WordToken("不", "bù", "no; not so", "Kosakata HSK 2: 不 (bù)"),
                        WordToken("舒服", "shū fu", "comfortable / feeling well", "Kosakata HSK 2: 舒服 (shū fu)"),
                        WordToken("被", "bèi", "used to indicate passive voice (placed before the doer of the action like \"by\" in English passive-voice sentences, or, if the doer is not mentioned, before the verb) / (sarcastic or jocular) used to indicate that the following word should be regarded as being in air quotes", "Kosakata HSK 2: 被 (bèi)"),
                        WordToken("妈妈", "mā ma", "mama / mommy / mother", "Kosakata HSK 2: 妈妈 (mā ma)"),
                        WordToken("带", "dài", "to wear / to carry / to take along / to bear / to bring", "Kosakata HSK 2: 带 (dài)"),
                        WordToken("去", "qù", "to go, to go to", "Kosakata HSK 2: 去 (qù)"),
                        WordToken("医院", "yī yuàn", "hospital", "Kosakata HSK 2: 医院 (yī yuàn)"),
                        WordToken("看病", "kàn bìng", "to visit a doctor / to see a patient", "Kosakata HSK 2: 看病 (kàn bìng)")
                    )
                ),
                Sentence(
                    id = "s_chgdoc_2",
                    hanzi = "小亮很害怕，刚到医院就想走。",
                    pinyin = "Xiǎo Liàng hěn hài pà gāng dào yī yuàn jiù xiǎng zǒu",
                    translation = "Xiao Liang sangat ketakutan, baru saja tiba di klinik rumah sakit ia sudah merengek ingin segera pulang.",
                    tokens = listOf(
                        WordToken("小亮", "Xiǎo Liàng", "a personal name, Xiaoliang", "Kosakata HSK 2: 小亮 (Xiǎo Liàng)"),
                        WordToken("很", "hěn", "very; quite", "Kosakata HSK 2: 很 (hěn)"),
                        WordToken("害怕", "hài pà", "to be afraid; to be scared", "Kosakata HSK 2: 害怕 (hài pà)"),
                        WordToken("刚", "gāng", "just / barely / exactly", "Kosakata HSK 2: 刚 (gāng)"),
                        WordToken("到", "dào", "to reach; to arrive / to (a place); until (a time); up to (a point) / (verb complement indicating arriving at a place or reaching a point)", "Kosakata HSK 2: 到 (dào)"),
                        WordToken("医院", "yī yuàn", "hospital", "Kosakata HSK 2: 医院 (yī yuàn)"),
                        WordToken("就", "jiù", "as soon as; immediately after", "Kosakata HSK 2: 就 (jiù)"),
                        WordToken("想", "xiǎng", "to desire; to want (to)", "Kosakata HSK 2: 想 (xiǎng)"),
                        WordToken("走", "zǒu", "to walk / to go / to run / to move (of vehicle) / to visit / to leave / to go away / to die (euph.) / to change (shape, form, meaning)", "Kosakata HSK 2: 走 (zǒu)")
                    )
                ),
                Sentence(
                    id = "s_chgdoc_3",
                    hanzi = "医生为了让他不那么害怕，就指着他的耳朵对他说：”小朋友，你知道这是什么吗？这是你的鼻子吗？”",
                    pinyin = "yī shēng wèi le ràng tā bù nà me hài pà jiù zhǐ zhe tā de ěr duo duì tā shuō xiǎo péng yǒu nǐ zhī dào zhè shì shén me ma zhè shì nǐ de bí zi ma",
                    translation = "Demi menenangkannya agar tidak terlalu takut, sang dokter dengan ramah menunjuk ke telinganya lalu berkata: “Adik kecil, tahukah kamu ini apa? Apakah ini hidungmu?”",
                    tokens = listOf(
                        WordToken("医生", "yī shēng", "doctor", "Kosakata HSK 2: 医生 (yī shēng)"),
                        WordToken("为了", "wèi le", "for; for the purpose of; in order to", "Kosakata HSK 2: 为了 (wèi le)"),
                        WordToken("让", "ràng", "to permit / to let sb do sth / to have sb do sth / to make sb (feel sad etc)", "Kosakata HSK 2: 让 (ràng)"),
                        WordToken("他", "tā", "he; him; his", "Kosakata HSK 2: 他 (tā)"),
                        WordToken("不", "bù", "no; not so", "Kosakata HSK 2: 不 (bù)"),
                        WordToken("那么", "nà me", "like that; in that way; to that extent", "Kosakata HSK 2: 那么 (nà me)"),
                        WordToken("害怕", "hài pà", "to be afraid; to be scared", "Kosakata HSK 2: 害怕 (hài pà)"),
                        WordToken("就", "jiù", "in that case; then", "Kosakata HSK 2: 就 (jiù)"),
                        WordToken("指", "zhǐ", "to point at or to / to indicate or refer to", "Kosakata HSK 2: 指 (zhǐ)"),
                        WordToken("着", "zhe", "aspect particle indicating action in progress or ongoing state", "Kosakata HSK 2: 着 (zhe)"),
                        WordToken("他", "tā", "he; him; his", "Kosakata HSK 2: 他 (tā)"),
                        WordToken("的", "de", "possessive particle (of; 's) / modifying particle (used after an attribute to modify a noun or to form a nominal expression)", "Kosakata HSK 2: 的 (de)"),
                        WordToken("耳朵", "ěr duo", "ear / handle (on a cup)", "Kosakata HSK 2: 耳朵 (ěr duo)"),
                        WordToken("对", "duì", "towards; at; for / concerning; regarding", "Kosakata HSK 2: 对 (duì)"),
                        WordToken("他", "tā", "he; him; his", "Kosakata HSK 2: 他 (tā)"),
                        WordToken("说", "shuō", "to speak; to talk; to say", "Kosakata HSK 2: 说 (shuō)"),
                        WordToken("小朋友", "xiǎo péng yǒu", "child; kid (used to refer to a child, or by an adult to address a child, or, in Taiwan, to refer to sb's own child)", "Kosakata HSK 2: 小朋友 (xiǎo péng yǒu)"),
                        WordToken("你", "nǐ", "you", "Kosakata HSK 2: 你 (nǐ)"),
                        WordToken("知道", "zhī dào", "to know; to become aware of", "Kosakata HSK 2: 知道 (zhī dào)"),
                        WordToken("这", "zhè", "this; these", "Kosakata HSK 2: 这 (zhè)"),
                        WordToken("是", "shì", "to be (followed by substantives only)", "Kosakata HSK 2: 是 (shì)"),
                        WordToken("什么", "shén me", "what?", "Kosakata HSK 2: 什么 (shén me)"),
                        WordToken("吗", "ma", "(question particle for \"yes-no\" questions)", "Kosakata HSK 2: 吗 (ma)"),
                        WordToken("这", "zhè", "this; these", "Kosakata HSK 2: 这 (zhè)"),
                        WordToken("是", "shì", "to be (followed by substantives only)", "Kosakata HSK 2: 是 (shì)"),
                        WordToken("你", "nǐ", "you", "Kosakata HSK 2: 你 (nǐ)"),
                        WordToken("的", "de", "possessive particle (of; 's) / modifying particle (used after an attribute to modify a noun or to form a nominal expression)", "Kosakata HSK 2: 的 (de)"),
                        WordToken("鼻子", "bí zi", "nose", "Kosakata HSK 2: 鼻子 (bí zi)"),
                        WordToken("吗", "ma", "(question particle for \"yes-no\" questions)", "Kosakata HSK 2: 吗 (ma)")
                    )
                ),
                Sentence(
                    id = "s_chgdoc_4",
                    hanzi = "小亮看了看医生，对妈妈说：”妈妈，我们需要换一个医生了。他连鼻子和耳朵都不知道，怎么给我看病呀?\"",
                    pinyin = "Xiǎo Liàng kàn le kàn yī shēng duì mā ma shuō mā ma wǒ men xū yào huàn yī gè yī shēng le tā lián bí zi hé ěr duo dōu bù zhī dào zěn me gěi wǒ kàn bìng ya",
                    translation = "Xiao Liang menatap sang dokter lekat-lekat, lalu menoleh dan berkata kepada ibunya: “Ibu, kita harus segera ganti dokter lain. Membedakan hidung dan telinga saja dia tidak tahu, bagaimana mungkin dia bisa mengobatiku?!”",
                    tokens = listOf(
                        WordToken("小亮", "Xiǎo Liàng", "a personal name, Xiaoliang", "Kosakata HSK 2: 小亮 (Xiǎo Liàng)"),
                        WordToken("看", "kàn", "to see; to look at / to read / to watch / to visit; to call on / to consider; to regard as / to look after / to treat (a patient or illness) / to depend on / to feel (that) / (after a verb) to give it a try / to watch out for", "Kosakata HSK 2: 看 (kàn)"),
                        WordToken("了", "le", "(completed action marker) / (modal particle indicating change of state, situation now)", "Kosakata HSK 2: 了 (le)"),
                        WordToken("看", "kàn", "to see; to look at / to read / to watch / to visit; to call on / to consider; to regard as / to look after / to treat (a patient or illness) / to depend on / to feel (that) / (after a verb) to give it a try / to watch out for", "Kosakata HSK 2: 看 (kàn)"),
                        WordToken("医生", "yī shēng", "doctor", "Kosakata HSK 2: 医生 (yī shēng)"),
                        WordToken("对", "duì", "towards; at; for / concerning; regarding", "Kosakata HSK 2: 对 (duì)"),
                        WordToken("妈妈", "mā ma", "mama / mommy / mother", "Kosakata HSK 2: 妈妈 (mā ma)"),
                        WordToken("说", "shuō", "to speak; to talk; to say", "Kosakata HSK 2: 说 (shuō)"),
                        WordToken("妈妈", "mā ma", "mama / mommy / mother", "Kosakata HSK 2: 妈妈 (mā ma)"),
                        WordToken("我们", "wǒ men", "we; us; ourselves; our", "Kosakata HSK 2: 我们 (wǒ men)"),
                        WordToken("需要", "xū yào", "to need; to want; to demand; to require", "Kosakata HSK 2: 需要 (xū yào)"),
                        WordToken("换", "huàn", "to exchange / to change / to substitute / to switch / to convert (currency)", "Kosakata HSK 2: 换 (huàn)"),
                        WordToken("一", "yī", "one / single / a (article)", "Kosakata HSK 2: 一 (yī)"),
                        WordToken("个", "gè", "classifier for people or objects in general", "Kosakata HSK 2: 个 (gè)"),
                        WordToken("医生", "yī shēng", "doctor", "Kosakata HSK 2: 医生 (yī shēng)"),
                        WordToken("了", "le", "(completed action marker) / (modal particle indicating change of state, situation now)", "Kosakata HSK 2: 了 (le)"),
                        WordToken("他", "tā", "he; him; his", "Kosakata HSK 2: 他 (tā)"),
                        WordToken("连", "lián", "continuously / in succession / including / even", "Kosakata HSK 2: 连 (lián)"),
                        WordToken("鼻子", "bí zi", "nose", "Kosakata HSK 2: 鼻子 (bí zi)"),
                        WordToken("和", "hé", "and; together with", "Kosakata HSK 2: 和 (hé)"),
                        WordToken("耳朵", "ěr duo", "ear / handle (on a cup)", "Kosakata HSK 2: 耳朵 (ěr duo)"),
                        WordToken("都", "dōu", "(used for emphasis) even", "Kosakata HSK 2: 都 (dōu)"),
                        WordToken("不", "bù", "no; not so", "Kosakata HSK 2: 不 (bù)"),
                        WordToken("知道", "zhī dào", "to know; to become aware of", "Kosakata HSK 2: 知道 (zhī dào)"),
                        WordToken("怎么", "zěn me", "how? / what? / why?", "Kosakata HSK 2: 怎么 (zěn me)"),
                        WordToken("给", "gěi", "to / for / for the benefit of / to do sth (for sb)", "Kosakata HSK 2: 给 (gěi)"),
                        WordToken("我", "wǒ", "I; me; my", "Kosakata HSK 2: 我 (wǒ)"),
                        WordToken("看病", "kàn bìng", "to visit a doctor / to see a patient", "Kosakata HSK 2: 看病 (kàn bìng)"),
                        WordToken("呀", "ya", "(particle equivalent to 啊 after a vowel, expressing surprise or doubt)", "Kosakata HSK 2: 呀 (ya)")
                    )
                )
            ),
            questions = listOf(
                StoryQuestion(
                    id = "q_chgdoc_1",
                    questionText = "小亮因为身体不适被妈妈带到医院后，表现出怎样的情绪？ (Bagaimana perasaan Xiao Liang saat dibawa berobat ke rumah sakit?)",
                    options = listOf("非常兴奋到处乱跑 (Sangat antusias berlari-larian)", "非常害怕，刚到医院门口就想拔腿就跑 (Sangat ketakutan, baru sampai klinik sudah ingin segera kabur pulang)", "安静地坐在椅子上看漫画 (Duduk manis membaca komik)", "大声唱歌 (Menyanyi kencang)"),
                    correctAnswerIndex = 1,
                    explanation = "Xiao Liang takut jarum suntik dan dokter, sehingga langsung ingin kabur setibanya di rumah sakit."
                ),
                StoryQuestion(
                    id = "q_chgdoc_2",
                    questionText = "医生为了安抚小亮的紧张害怕心理，采取了什么趣味互动方法？ (Cara apa yang dilakukan dokter untuk mencairkan suasana takut sang anak?)",
                    options = listOf("给他吃美味的棒棒糖 (Memberinya permen lolipop lezat)", "指着小亮的耳朵开玩笑问是不是鼻子 (Menunjuk telinga Xiao Liang dan bercanda menanyakan apakah itu hidungnya)", "给他看好玩的卡通片 (Memutarkan film kartun)", "假装睡觉 (Pura-pura tertidur)"),
                    correctAnswerIndex = 1,
                    explanation = "Dokter sengaja bercanda menunjuk telinga dan menanyakan apakah itu hidung untuk membuatnya tertawa."
                ),
                StoryQuestion(
                    id = "q_chgdoc_3",
                    questionText = "小亮把医生的幽默玩笑当真后，向妈妈提出了什么惊人提议？ (Usulan apa yang diajukan Xiao Liang kepada ibunya setelah mendengar candaan itu?)",
                    options = listOf("再也不要生病 (Jangan pernah sakit lagi)", "必须马上换一个医生，因为这个医生连耳朵和鼻子都分不清 (Harus segera ganti dokter lain, karena dokter ini bahkan tidak tahu beda telinga dan hidung!)", "要求住院打针 (Minta dirawat inap)", "要跟医生交朋友 (Ingin berteman dengan dokter)"),
                    correctAnswerIndex = 1,
                    explanation = "Kepolosan anak yang mengira sang dokter bodoh karena tidak tahu letak organ telinga dan hidung."
                ),
                StoryQuestion(
                    id = "q_chgdoc_4",
                    questionText = "小亮的这种反应最体现了幼儿心理学的哪种特点？ (Prinsip kognitif anak apa yang digambarkan dari percakapan ini?)",
                    options = listOf("字面理解倾向与缺乏反讽幽默识别能力 (Kecenderungan memahami ucapan secara harfiah tanpa menangkap nuansa candaan)", "智商低下 (Kurangnya tingkat kecerdasan)", "目无尊长 (Sikap tidak sopan)", "天生具有医学天赋 (Memiliki bakat kedokteran alami)"),
                    correctAnswerIndex = 0,
                    explanation = "Anak-anak mencerna kalimat orang dewasa secara literal sehingga candaan dokter dianggap ketidaktahuan medis."
                )
            )
        ),
        // Cerita Mandarin Bean 141 (HSK 2): Birthday Present (Kado Ulang Tahun)
        Story(
            id = "story_birthday_present",
            titleHanzi = "生日礼物",
            titlePinyin = "Shēngrì Lǐwù",
            titleTranslation = "Birthday Present (Kado Ulang Tahun)",
            level = "HSK 2",
            category = "Hubungan & Asmara",
            description = "Percakapan sepasang kekasih di taman tentang janji kado ulang tahun yang ternyata berujung pada janji kosong yang sama.",
            coverEmoji = "🎁",
            coverImageRes = R.drawable.cover_story_birthday_present,
            estimatedReadMinutes = 2,
            sentences = listOf(
                Sentence(
                    id = "s_bdaypres_1",
                    hanzi = "一对情侣在公园散步，女孩高兴地问男孩：”明天是我的生日，你想好送我什么礼物了吗？”",
                    pinyin = "yī duì qíng lǚ zài gōng yuán sàn bù nǚ hái gāo xìng de wèn nán hái míng tiān shì wǒ de shēng rì nǐ xiǎng hǎo sòng wǒ shén me lǐ wù le ma",
                    translation = "Sepasang kekasih sedang berjalan santai di taman kota, sang gadis dengan ceria bertanya kepada pacarnya: “Besok adalah hari ulang tahunku, apakah kamu sudah memikirkan kado apa yang akan kamu berikan untukku?”",
                    tokens = listOf(
                        WordToken("一", "yī", "one / single / a (article)", "Kosakata HSK 2: 一 (yī)"),
                        WordToken("对", "duì", "classifier: couple; pair", "Kosakata HSK 2: 对 (duì)"),
                        WordToken("情侣", "qíng lǚ", "sweethearts / lovers", "Kosakata HSK 2: 情侣 (qíng lǚ)"),
                        WordToken("在", "zài", "(of sb or sth) to be (located) at", "Kosakata HSK 2: 在 (zài)"),
                        WordToken("公园", "gōng yuán", "park (for public recreation)", "Kosakata HSK 2: 公园 (gōng yuán)"),
                        WordToken("散步", "sàn bù", "to take a walk; to go for a walk", "Kosakata HSK 2: 散步 (sàn bù)"),
                        WordToken("女孩", "nǚ hái", "girl; lass", "Kosakata HSK 2: 女孩 (nǚ hái)"),
                        WordToken("高兴", "gāo xìng", "happy / glad / in a cheerful mood", "Kosakata HSK 2: 高兴 (gāo xìng)"),
                        WordToken("地", "de", "-ly / structural particle: used before a verb or adjective, linking it to preceding modifying adverbial adjunct", "Kosakata HSK 2: 地 (de)"),
                        WordToken("问", "wèn", "to ask; to inquire", "Kosakata HSK 2: 问 (wèn)"),
                        WordToken("男孩", "nán hái", "boy", "Kosakata HSK 2: 男孩 (nán hái)"),
                        WordToken("明天", "míng tiān", "tomorrow", "Kosakata HSK 2: 明天 (míng tiān)"),
                        WordToken("是", "shì", "to be (followed by substantives only)", "Kosakata HSK 2: 是 (shì)"),
                        WordToken("我", "wǒ", "I; me; my", "Kosakata HSK 2: 我 (wǒ)"),
                        WordToken("的", "de", "possessive particle (of; 's) / modifying particle (used after an attribute to modify a noun or to form a nominal expression)", "Kosakata HSK 2: 的 (de)"),
                        WordToken("生日", "shēng rì", "birthday", "Kosakata HSK 2: 生日 (shēng rì)"),
                        WordToken("你", "nǐ", "you", "Kosakata HSK 2: 你 (nǐ)"),
                        WordToken("想", "xiǎng", "to think (about) / to think of; to devise / to think (that); to believe (that)", "Kosakata HSK 2: 想 (xiǎng)"),
                        WordToken("好", "hǎo", "(verb complement indicating completion)", "Kosakata HSK 2: 好 (hǎo)"),
                        WordToken("送", "sòng", "to give (as a present)", "Kosakata HSK 2: 送 (sòng)"),
                        WordToken("我", "wǒ", "I; me; my", "Kosakata HSK 2: 我 (wǒ)"),
                        WordToken("什么", "shén me", "what?", "Kosakata HSK 2: 什么 (shén me)"),
                        WordToken("礼物", "lǐ wù", "gift; present", "Kosakata HSK 2: 礼物 (lǐ wù)"),
                        WordToken("了", "le", "(completed action marker) / (modal particle indicating change of state, situation now)", "Kosakata HSK 2: 了 (le)"),
                        WordToken("吗", "ma", "(question particle for \"yes-no\" questions)", "Kosakata HSK 2: 吗 (ma)")
                    )
                ),
                Sentence(
                    id = "s_bdaypres_2",
                    hanzi = "男孩回答：”和去年一样。”",
                    pinyin = "nán hái huí dá hé qù nián yī yàng",
                    translation = "Sang pemuda menjawab santai: “Sama persis seperti kado tahun lalu.”",
                    tokens = listOf(
                        WordToken("男孩", "nán hái", "boy", "Kosakata HSK 2: 男孩 (nán hái)"),
                        WordToken("回答", "huí dá", "to reply; to answer / reply; answer", "Kosakata HSK 2: 回答 (huí dá)"),
                        WordToken("和", "hé", "and; together with", "Kosakata HSK 2: 和 (hé)"),
                        WordToken("去年", "qù nián", "last year", "Kosakata HSK 2: 去年 (qù nián)"),
                        WordToken("一样", "yī yàng", "same / like / equal to / the same as", "Kosakata HSK 2: 一样 (yī yàng)")
                    )
                ),
                Sentence(
                    id = "s_bdaypres_3",
                    hanzi = "女孩问：”去年你送了我什么？”",
                    pinyin = "nǚ hái wèn qù nián nǐ sòng le wǒ shén me",
                    translation = "Gadis itu penasaran: “Tahun lalu memangnya kamu memberiku kado apa?”",
                    tokens = listOf(
                        WordToken("女孩", "nǚ hái", "girl; lass", "Kosakata HSK 2: 女孩 (nǚ hái)"),
                        WordToken("问", "wèn", "to ask; to inquire", "Kosakata HSK 2: 问 (wèn)"),
                        WordToken("去年", "qù nián", "last year", "Kosakata HSK 2: 去年 (qù nián)"),
                        WordToken("你", "nǐ", "you", "Kosakata HSK 2: 你 (nǐ)"),
                        WordToken("送", "sòng", "to give (as a present)", "Kosakata HSK 2: 送 (sòng)"),
                        WordToken("了", "le", "(completed action marker) / (modal particle indicating change of state, situation now)", "Kosakata HSK 2: 了 (le)"),
                        WordToken("我", "wǒ", "I; me; my", "Kosakata HSK 2: 我 (wǒ)"),
                        WordToken("什么", "shén me", "what?", "Kosakata HSK 2: 什么 (shén me)")
                    )
                ),
                Sentence(
                    id = "s_bdaypres_4",
                    hanzi = "男孩回答：”和前年一样。”",
                    pinyin = "nán hái huí dá hé qián nián yī yàng",
                    translation = "Pemuda itu membalas: “Sama seperti dua tahun yang lalu.”",
                    tokens = listOf(
                        WordToken("男孩", "nán hái", "boy", "Kosakata HSK 2: 男孩 (nán hái)"),
                        WordToken("回答", "huí dá", "to reply; to answer / reply; answer", "Kosakata HSK 2: 回答 (huí dá)"),
                        WordToken("和", "hé", "and; together with", "Kosakata HSK 2: 和 (hé)"),
                        WordToken("前年", "qián nián", "the year before last", "Kosakata HSK 2: 前年 (qián nián)"),
                        WordToken("一样", "yī yàng", "same / like / equal to / the same as", "Kosakata HSK 2: 一样 (yī yàng)")
                    )
                ),
                Sentence(
                    id = "s_bdaypres_5",
                    hanzi = "女孩又问：”前年你送了什么呢？”",
                    pinyin = "nǚ hái yòu wèn qián nián nǐ sòng le shén me ne",
                    translation = "Gadis itu bertanya lagi semakin penasaran: “Lalu dua tahun yang lalu kamu memberi kado apa?”",
                    tokens = listOf(
                        WordToken("女孩", "nǚ hái", "girl; lass", "Kosakata HSK 2: 女孩 (nǚ hái)"),
                        WordToken("又", "yòu", "(once) again", "Kosakata HSK 2: 又 (yòu)"),
                        WordToken("问", "wèn", "to ask; to inquire", "Kosakata HSK 2: 问 (wèn)"),
                        WordToken("前年", "qián nián", "the year before last", "Kosakata HSK 2: 前年 (qián nián)"),
                        WordToken("你", "nǐ", "you", "Kosakata HSK 2: 你 (nǐ)"),
                        WordToken("送", "sòng", "to give (as a present)", "Kosakata HSK 2: 送 (sòng)"),
                        WordToken("了", "le", "(completed action marker) / (modal particle indicating change of state, situation now)", "Kosakata HSK 2: 了 (le)"),
                        WordToken("什么", "shén me", "what?", "Kosakata HSK 2: 什么 (shén me)"),
                        WordToken("呢", "ne", "(sentence-final particle) used in questions to link back to prior discourse or context (\"what about...?\", \"and...?\")", "Kosakata HSK 2: 呢 (ne)")
                    )
                ),
                Sentence(
                    id = "s_bdaypres_6",
                    hanzi = "男孩回答：”前年我不认识你，所以什么也没送。”",
                    pinyin = "nán hái huí dá qián nián wǒ bù rèn shi nǐ suǒ yǐ shén me yě méi sòng",
                    translation = "Pemuda itu tersenyum tanpa rasa bersalah: “Dua tahun lalu aku belum mengenalmu, jadi aku sama sekali tidak memberi kado apa pun!”",
                    tokens = listOf(
                        WordToken("男孩", "nán hái", "boy", "Kosakata HSK 2: 男孩 (nán hái)"),
                        WordToken("回答", "huí dá", "to reply; to answer / reply; answer", "Kosakata HSK 2: 回答 (huí dá)"),
                        WordToken("前年", "qián nián", "the year before last", "Kosakata HSK 2: 前年 (qián nián)"),
                        WordToken("我", "wǒ", "I; me; my", "Kosakata HSK 2: 我 (wǒ)"),
                        WordToken("不", "bù", "no; not so", "Kosakata HSK 2: 不 (bù)"),
                        WordToken("认识", "rèn shi", "to know / to recognize / to be familiar with / to get acquainted with sb", "Kosakata HSK 2: 认识 (rèn shi)"),
                        WordToken("你", "nǐ", "you", "Kosakata HSK 2: 你 (nǐ)"),
                        WordToken("所以", "suǒ yǐ", "therefore / as a result / so", "Kosakata HSK 2: 所以 (suǒ yǐ)"),
                        WordToken("什么", "shén me", "something; anything", "Kosakata HSK 2: 什么 (shén me)"),
                        WordToken("也", "yě", "even (extreme or unexpected case)", "Kosakata HSK 2: 也 (yě)"),
                        WordToken("没", "méi", "(negative prefix for verbs) have not; not", "Kosakata HSK 2: 没 (méi)"),
                        WordToken("送", "sòng", "to give (as a present)", "Kosakata HSK 2: 送 (sòng)")
                    )
                )
            ),
            questions = listOf(
                StoryQuestion(
                    id = "q_bdaypres_1",
                    questionText = "在公园散步时，女孩怀着怎样的心情向男朋友询问生日礼物？ (Dengan perasaan apa sang gadis bertanya kepada pacarnya tentang kado ulang tahun?)",
                    options = listOf("非常愤怒与不信任 (Sangat marah dan curiga)", "满心欢喜与期待 (Penuh kegembiraan dan rasa penasaran manis)", "悲伤哭泣 (Menangis bersedih)", "漠不关心 (Sikap dingin tak acuh)"),
                    correctAnswerIndex = 1,
                    explanation = "Gadis tersebut dengan gembira dan antusias menanyakan kejutan kado yang dipersiapkan sang kekasih."
                ),
                StoryQuestion(
                    id = "q_bdaypres_2",
                    questionText = "当女孩询问今年送什么时，男孩给出的第一句回答是什么？ (Apa jawaban pertama pemuda itu saat ditanya kado tahun ini?)",
                    options = listOf("送最新款的智能手机 (Memberikan ponsel pintar terbaru)", "和去年送的一样 (Sama persis seperti kado tahun lalu)", "送一束红玫瑰花 (Memberikan sebuket bunga mawar merah)", "请她去吃大餐 (Mentraktirnya makan di restoran mewah)"),
                    correctAnswerIndex = 1,
                    explanation = "Pemuda menjawab santai bahwa hadiahnya sama persis dengan tahun kemarin."
                ),
                StoryQuestion(
                    id = "q_bdaypres_3",
                    questionText = "当女孩追问前年送了什么时，男孩揭露了怎样的爆笑真相？ (Kenyataan kocak apa yang diakui sang pemuda saat ditanya kado dua tahun lalu?)",
                    options = listOf("前年送了一条金项链 (Dua tahun lalu memberi kalung emas)", "前年还没认识她，所以根本什么都没送 (Dua tahun lalu belum mengenalnya, jadi sama sekali tidak memberi kado apa pun!)", "前年送了一只小猫 (Dua tahun lalu memberi anak kucing)", "前年他忘记了 (Dua tahun lalu ia lupa)"),
                    correctAnswerIndex = 1,
                    explanation = "Ternyata hadiah 'sama seperti tahun-tahun sebelumnya' berarti tidak ada kado sama sekali alias nol!"
                ),
                StoryQuestion(
                    id = "q_bdaypres_4",
                    questionText = "这个故事里的男孩展现了一种怎样的幽默沟通套路？ (Trik kelakar apa yang dipakai sang pemuda dalam kisah percintaan ini?)",
                    options = listOf("套娃式推脱与冷幽默反差 (Logika berkelit bertingkat yang berujung pada klimaks jenaka)", "真诚的浪漫主义 (Sikap romantis sejati)", "暴力对抗 (Konflik permusuhan)", "物质拜金主义 (Sikap materialistis)"),
                    correctAnswerIndex = 0,
                    explanation = "Jawaban berkelit bersusun (tahun ini = tahun lalu = dua tahun lalu = tidak ada) menjadi puncak tawa kelakar romansa."
                )
            )
        ),
        // Cerita Mandarin Bean 142 (HSK 2): This Is a Sad Story (Ini Kisah yang Menyedihkan)
        Story(
            id = "story_this_is_a_sad_story",
            titleHanzi = "这是一个伤心的故事",
            titlePinyin = "Zhè Shì Yī Gè Shāngxīn De Gùshi",
            titleTranslation = "This Is a Sad Story (Ini Kisah yang Menyedihkan)",
            level = "HSK 2",
            category = "Petualangan & Humor",
            description = "Tiga sekawan yang harus menaiki tangga hotel hingga lantai 45 karena lift rusak, hanya untuk mendengar sebuah kabar paling menyedihkan di depan pintu kamar.",
            coverEmoji = "🏢",
            coverImageRes = R.drawable.cover_story_this_is_a_sad_story,
            estimatedReadMinutes = 2,
            sentences = listOf(
                Sentence(
                    id = "s_sadstory_1",
                    hanzi = "有三个人去北京玩，他们在一个宾馆的第45层订了一个房间。",
                    pinyin = "yǒu sān gè rén qù Běi jīng wán tā men zài yī gè bīn guǎn de dì céng dìng le yī gè fáng jiān",
                    translation = "Ada tiga orang pergi berlibur ke Beijing, dan mereka memesan satu kamar hotel di lantai ke-45 sebuah penginapan megah.",
                    tokens = listOf(
                        WordToken("有", "yǒu", "to have; there is", "Kosakata HSK 2: 有 (yǒu)"),
                        WordToken("三", "sān", "three / 3", "Kosakata HSK 2: 三 (sān)"),
                        WordToken("个", "gè", "classifier for people or objects in general", "Kosakata HSK 2: 个 (gè)"),
                        WordToken("人", "rén", "person; people", "Kosakata HSK 2: 人 (rén)"),
                        WordToken("去", "qù", "to go, to go to", "Kosakata HSK 2: 去 (qù)"),
                        WordToken("北京", "Běi jīng", "Beijing municipality, capital of the People's Republic of China", "Kosakata HSK 2: 北京 (Běi jīng)"),
                        WordToken("玩", "wán", "to play / to have fun / to trifle with / to keep sth for entertainment", "Kosakata HSK 2: 玩 (wán)"),
                        WordToken("他们", "tā men", "they; them", "Kosakata HSK 2: 他们 (tā men)"),
                        WordToken("在", "zài", "(of sb or sth) to be (located) at", "Kosakata HSK 2: 在 (zài)"),
                        WordToken("一", "yī", "one / single / a (article)", "Kosakata HSK 2: 一 (yī)"),
                        WordToken("个", "gè", "classifier for people or objects in general", "Kosakata HSK 2: 个 (gè)"),
                        WordToken("宾馆", "bīn guǎn", "guesthouse / lodge / hotel", "Kosakata HSK 2: 宾馆 (bīn guǎn)"),
                        WordToken("的", "de", "possessive particle (of; 's) / modifying particle (used after an attribute to modify a noun or to form a nominal expression)", "Kosakata HSK 2: 的 (de)"),
                        WordToken("第", "dì", "(prefix indicating ordinal number)", "Kosakata HSK 2: 第 (dì)"),
                        WordToken("层", "céng", "layer; stratum / floor (of a building); story / (math.) sheaf", "Kosakata HSK 2: 层 (céng)"),
                        WordToken("订", "dìng", "to agree / to conclude / to draw up / to subscribe to (a newspaper etc) / to order", "Kosakata HSK 2: 订 (dìng)"),
                        WordToken("了", "le", "(completed action marker) / (modal particle indicating change of state, situation now)", "Kosakata HSK 2: 了 (le)"),
                        WordToken("一", "yī", "one / single / a (article)", "Kosakata HSK 2: 一 (yī)"),
                        WordToken("个", "gè", "classifier for people or objects in general", "Kosakata HSK 2: 个 (gè)"),
                        WordToken("房间", "fáng jiān", "room", "Kosakata HSK 2: 房间 (fáng jiān)")
                    )
                ),
                Sentence(
                    id = "s_sadstory_2",
                    hanzi = "一天晚上，电梯坏了，他们决定走回房间。",
                    pinyin = "yī tiān wǎn shang diàn tī huài le tā men jué dìng zǒu huí fáng jiān",
                    translation = "Pada suatu malam, lift hotel rusak total, sehingga mereka bertiga memutuskan untuk mendaki tangga menuju kamar mereka.",
                    tokens = listOf(
                        WordToken("一", "yī", "one / single / a (article)", "Kosakata HSK 2: 一 (yī)"),
                        WordToken("天", "tiān", "day", "Kosakata HSK 2: 天 (tiān)"),
                        WordToken("晚上", "wǎn shang", "evening / night", "Kosakata HSK 2: 晚上 (wǎn shang)"),
                        WordToken("电梯", "diàn tī", "elevator / escalator", "Kosakata HSK 2: 电梯 (diàn tī)"),
                        WordToken("坏", "huài", "bad / spoiled / broken", "Kosakata HSK 2: 坏 (huài)"),
                        WordToken("了", "le", "(completed action marker) / (modal particle indicating change of state, situation now)", "Kosakata HSK 2: 了 (le)"),
                        WordToken("他们", "tā men", "they; them", "Kosakata HSK 2: 他们 (tā men)"),
                        WordToken("决定", "jué dìng", "to decide; to determine; to make up one's mind", "Kosakata HSK 2: 决定 (jué dìng)"),
                        WordToken("走", "zǒu", "to walk / to go / to run / to move (of vehicle) / to visit / to leave / to go away / to die (euph.) / to change (shape, form, meaning)", "Kosakata HSK 2: 走 (zǒu)"),
                        WordToken("回", "huí", "to go back / to turn around / to answer / to return", "Kosakata HSK 2: 回 (huí)"),
                        WordToken("房间", "fáng jiān", "room", "Kosakata HSK 2: 房间 (fáng jiān)")
                    )
                ),
                Sentence(
                    id = "s_sadstory_3",
                    hanzi = "他们一起唱歌、讲故事，感觉走得很快，也很高兴。",
                    pinyin = "tā men yī qǐ chàng gē jiǎng gù shi gǎn jué zǒu de hěn kuài yě hěn gāo xìng",
                    translation = "Sambil mendaki mereka bersama-sama bernyanyi dan saling bercerita, sehingga langkah kaki terasa cepat dan hati tetap riang gembira.",
                    tokens = listOf(
                        WordToken("他们", "tā men", "they; them", "Kosakata HSK 2: 他们 (tā men)"),
                        WordToken("一起", "yī qǐ", "together; in company (with)", "Kosakata HSK 2: 一起 (yī qǐ)"),
                        WordToken("唱歌", "chàng gē", "to sing a song", "Kosakata HSK 2: 唱歌 (chàng gē)"),
                        WordToken("讲", "jiǎng", "to speak / to explain / to negotiate", "Kosakata HSK 2: 讲 (jiǎng)"),
                        WordToken("故事", "gù shi", "narrative; story; tale", "Kosakata HSK 2: 故事 (gù shi)"),
                        WordToken("感觉", "gǎn jué", "to feel; to perceive", "Kosakata HSK 2: 感觉 (gǎn jué)"),
                        WordToken("走", "zǒu", "to walk / to go / to run / to move (of vehicle) / to visit / to leave / to go away / to die (euph.) / to change (shape, form, meaning)", "Kosakata HSK 2: 走 (zǒu)"),
                        WordToken("得", "de", "structural particle: used after a verb (or adjective as main verb), linking it to following phrase indicating effect, degree, possibility etc", "Kosakata HSK 2: 得 (de)"),
                        WordToken("很", "hěn", "very; quite", "Kosakata HSK 2: 很 (hěn)"),
                        WordToken("快", "kuài", "rapid / quick", "Kosakata HSK 2: 快 (kuài)"),
                        WordToken("也", "yě", "also; too; as well; (not ...) either", "Kosakata HSK 2: 也 (yě)"),
                        WordToken("很", "hěn", "very; quite", "Kosakata HSK 2: 很 (hěn)"),
                        WordToken("高兴", "gāo xìng", "happy / glad / in a cheerful mood", "Kosakata HSK 2: 高兴 (gāo xìng)")
                    )
                ),
                Sentence(
                    id = "s_sadstory_4",
                    hanzi = "但是走到34层的时候，大家都累了，有一个人让麦克讲一个故事。",
                    pinyin = "dàn shì zǒu dào céng de shí hou dà jiā dōu lèi le yǒu yī gè rén ràng Mài kè jiǎng yī gè gù shi",
                    translation = "Namun ketika sampai di lantai 34, mereka semua sudah kehabisan tenaga dan sangat lelah, lalu seseorang meminta Mike menceritakan sebuah kisah untuk menghibur mereka.",
                    tokens = listOf(
                        WordToken("但是", "dàn shì", "but; however", "Kosakata HSK 2: 但是 (dàn shì)"),
                        WordToken("走", "zǒu", "to walk / to go / to run / to move (of vehicle) / to visit / to leave / to go away / to die (euph.) / to change (shape, form, meaning)", "Kosakata HSK 2: 走 (zǒu)"),
                        WordToken("到", "dào", "to reach; to arrive / to (a place); until (a time); up to (a point) / (verb complement indicating arriving at a place or reaching a point)", "Kosakata HSK 2: 到 (dào)"),
                        WordToken("层", "céng", "layer; stratum / floor (of a building); story / (math.) sheaf", "Kosakata HSK 2: 层 (céng)"),
                        WordToken("的", "de", "possessive particle (of; 's) / modifying particle (used after an attribute to modify a noun or to form a nominal expression)", "Kosakata HSK 2: 的 (de)"),
                        WordToken("时候", "shí hou", "time / length of time / moment / period", "Kosakata HSK 2: 时候 (shí hou)"),
                        WordToken("大家", "dà jiā", "everyone", "Kosakata HSK 2: 大家 (dà jiā)"),
                        WordToken("都", "dōu", "all; both; entirely", "Kosakata HSK 2: 都 (dōu)"),
                        WordToken("累", "lèi", "tired / weary", "Kosakata HSK 2: 累 (lèi)"),
                        WordToken("了", "le", "(completed action marker) / (modal particle indicating change of state, situation now)", "Kosakata HSK 2: 了 (le)"),
                        WordToken("有", "yǒu", "to have; there is", "Kosakata HSK 2: 有 (yǒu)"),
                        WordToken("一", "yī", "one / single / a (article)", "Kosakata HSK 2: 一 (yī)"),
                        WordToken("个", "gè", "classifier for people or objects in general", "Kosakata HSK 2: 个 (gè)"),
                        WordToken("人", "rén", "person; people", "Kosakata HSK 2: 人 (rén)"),
                        WordToken("让", "ràng", "to permit / to let sb do sth / to have sb do sth / to make sb (feel sad etc)", "Kosakata HSK 2: 让 (ràng)"),
                        WordToken("麦克", "Mài kè", "(name) Mike; Michael / (prefix) Mac-; Mc-", "Kosakata HSK 2: 麦克 (Mài kè)"),
                        WordToken("讲", "jiǎng", "to speak / to explain / to negotiate", "Kosakata HSK 2: 讲 (jiǎng)"),
                        WordToken("一", "yī", "one / single / a (article)", "Kosakata HSK 2: 一 (yī)"),
                        WordToken("个", "gè", "classifier for people or objects in general", "Kosakata HSK 2: 个 (gè)"),
                        WordToken("故事", "gù shi", "narrative; story; tale", "Kosakata HSK 2: 故事 (gù shi)")
                    )
                ),
                Sentence(
                    id = "s_sadstory_5",
                    hanzi = "麦克说：”这是一个让人伤心的故事，我把房间的钥匙忘在一层了。”",
                    pinyin = "Mài kè shuō zhè shì yī gè ràng rén shāng xīn de gù shi wǒ bǎ fáng jiān de yào shi wàng zài yī céng le",
                    translation = "Mike berkata dengan wajah lesu: “Ini adalah cerita yang sangat menyedihkan: kunci kamar hotel kita tertinggal di lobi lantai satu!”",
                    tokens = listOf(
                        WordToken("麦克", "Mài kè", "(name) Mike; Michael / (prefix) Mac-; Mc-", "Kosakata HSK 2: 麦克 (Mài kè)"),
                        WordToken("说", "shuō", "to speak; to talk; to say", "Kosakata HSK 2: 说 (shuō)"),
                        WordToken("这", "zhè", "this; these", "Kosakata HSK 2: 这 (zhè)"),
                        WordToken("是", "shì", "to be (followed by substantives only)", "Kosakata HSK 2: 是 (shì)"),
                        WordToken("一", "yī", "one / single / a (article)", "Kosakata HSK 2: 一 (yī)"),
                        WordToken("个", "gè", "classifier for people or objects in general", "Kosakata HSK 2: 个 (gè)"),
                        WordToken("让", "ràng", "to permit / to let sb do sth / to have sb do sth / to make sb (feel sad etc)", "Kosakata HSK 2: 让 (ràng)"),
                        WordToken("人", "rén", "person; people", "Kosakata HSK 2: 人 (rén)"),
                        WordToken("伤心", "shāng xīn", "to grieve / to be broken-hearted / to feel deeply hurt", "Kosakata HSK 2: 伤心 (shāng xīn)"),
                        WordToken("的", "de", "possessive particle (of; 's) / modifying particle (used after an attribute to modify a noun or to form a nominal expression)", "Kosakata HSK 2: 的 (de)"),
                        WordToken("故事", "gù shi", "narrative; story; tale", "Kosakata HSK 2: 故事 (gù shi)"),
                        WordToken("我", "wǒ", "I; me; my", "Kosakata HSK 2: 我 (wǒ)"),
                        WordToken("把", "bǎ", "(used to put the object before the verb: 把[ba3] + {noun} + {verb})", "Kosakata HSK 2: 把 (bǎ)"),
                        WordToken("房间", "fáng jiān", "room", "Kosakata HSK 2: 房间 (fáng jiān)"),
                        WordToken("的", "de", "possessive particle (of; 's) / modifying particle (used after an attribute to modify a noun or to form a nominal expression)", "Kosakata HSK 2: 的 (de)"),
                        WordToken("钥匙", "yào shi", "key", "Kosakata HSK 2: 钥匙 (yào shi)"),
                        WordToken("忘", "wàng", "to forget / to overlook / to neglect", "Kosakata HSK 2: 忘 (wàng)"),
                        WordToken("在", "zài", "(of sb or sth) to be (located) at", "Kosakata HSK 2: 在 (zài)"),
                        WordToken("一", "yī", "one / single / a (article)", "Kosakata HSK 2: 一 (yī)"),
                        WordToken("层", "céng", "layer; stratum / floor (of a building); story / (math.) sheaf", "Kosakata HSK 2: 层 (céng)"),
                        WordToken("了", "le", "(completed action marker) / (modal particle indicating change of state, situation now)", "Kosakata HSK 2: 了 (le)")
                    )
                )
            ),
            questions = listOf(
                StoryQuestion(
                    id = "q_sadstory_1",
                    questionText = "三个朋友去北京旅游时，把房间订在了宾馆的哪一层？ (Di lantai berapakah ketiga sahabat itu memesan kamar hotel di Beijing?)",
                    options = listOf("第1层 (Lantai 1)", "第14层 (Lantai 14)", "第45层 (Lantai 45)", "第100层 (Lantai 100)"),
                    correctAnswerIndex = 2,
                    explanation = "Kamar mereka berada di ketinggian lantai 45 sebuah hotel di Beijing."
                ),
                StoryQuestion(
                    id = "q_sadstory_2",
                    questionText = "为什么这三个人在夜晚不得不爬楼梯走回房间？ (Mengapa mereka bertiga terpaksa mendaki tangga menuju kamar mereka malam itu?)",
                    options = listOf("想要借爬楼梯锻炼身体减肥 (Ingin berolahraga mendaki tangga untuk diet)", "宾馆的电梯突然发生故障坏了 (Lift hotel mendadak mengalami kerusakan total)", "宾馆停电了 (Listrik hotel padam total)", "钥匙丢在楼梯间 (Kunci jatuh di tangga)"),
                    correctAnswerIndex = 1,
                    explanation = "Lift hotel rusak malam itu sehingga mereka harus mendaki tangga darurat secara manual."
                ),
                StoryQuestion(
                    id = "q_sadstory_3",
                    questionText = "为了消除漫长爬楼的劳累，他们在前几十层是怎样互相打气的？ (Bagaimana cara mereka menghibur diri selama mendaki puluhan lantai pertama?)",
                    options = listOf("一直抱怨不停 (Mengeluh tanpa henti)", "一起唱歌、讲有趣的故事 (Bersama-sama bernyanyi riang dan bercerita seru)", "在台阶上打牌 (Bermain kartu di anak tangga)", "坐在楼梯上睡觉 (Duduk tidur di tangga)"),
                    correctAnswerIndex = 1,
                    explanation = "Bernyanyi dan bercerita membuat mereka merasa perjalanan mendaki terasa cepat dan gembira."
                ),
                StoryQuestion(
                    id = "q_sadstory_4",
                    questionText = "当他们精疲力竭爬到第34层时，麦克讲出的“伤心故事”是什么惊天噩耗？ (Kabar buruk menyedihkan apa yang disampaikan Mike di lantai 34?)",
                    options = listOf("宾馆发生了火灾 (Hotel mengalami kebakaran)", "他把房间的钥匙忘在一层大厅了 (Ia meninggalkan kunci kamar hotel di lantai 1!)", "他的钱包被小偷偷走了 (Dompetnya dicuri copet)", "北京明天要下大暴雨 (Besok Beijing akan diguyur badai)"),
                    correctAnswerIndex = 1,
                    explanation = "Puncak ironi komedi: setelah bersusah payah mendaki 34 lantai, kuncinya tertinggal di lobi lantai 1!"
                )
            )
        ),
        // Cerita Mandarin Bean 143 (HSK 2): Learn Chinese in China (Belajar Bahasa Mandarin di Tiongkok)
        Story(
            id = "story_learn_chinese_in_china",
            titleHanzi = "在中国学中文",
            titlePinyin = "Zài Zhōngguó Xué Zhōngwén",
            titleTranslation = "Learn Chinese in China (Belajar Bahasa Mandarin di Tiongkok)",
            level = "HSK 2",
            category = "Pendidikan & Budaya",
            description = "Kisah seorang pelajar internasional yang menceritakan adaptasi dan kemajuannya selama 11 bulan menimba ilmu bahasa di Tiongkok.",
            coverEmoji = "🇨🇳",
            coverImageRes = R.drawable.cover_story_learn_chinese_in_china,
            estimatedReadMinutes = 2,
            sentences = listOf(
                Sentence(
                    id = "s_lrnchn_1",
                    hanzi = "去年夏天，我来到中国。",
                    pinyin = "qù nián xià tiān wǒ lái dào Zhōng guó",
                    translation = "Musim panas tahun lalu, saya tiba di Tiongkok.",
                    tokens = listOf(
                        WordToken("去年", "qù nián", "last year", "Kosakata HSK 2: 去年 (qù nián)"),
                        WordToken("夏天", "xià tiān", "summer", "Kosakata HSK 2: 夏天 (xià tiān)"),
                        WordToken("我", "wǒ", "I; me; my", "Kosakata HSK 2: 我 (wǒ)"),
                        WordToken("来", "lái", "to come", "Kosakata HSK 2: 来 (lái)"),
                        WordToken("到", "dào", "to reach; to arrive / to (a place); until (a time); up to (a point) / (verb complement indicating arriving at a place or reaching a point)", "Kosakata HSK 2: 到 (dào)"),
                        WordToken("中国", "Zhōng guó", "China", "Kosakata HSK 2: 中国 (Zhōng guó)")
                    )
                ),
                Sentence(
                    id = "s_lrnchn_2",
                    hanzi = "现在我在中国已经学习11个月了。",
                    pinyin = "xiàn zài wǒ zài Zhōng guó yǐ jīng xué xí gè yuè le",
                    translation = "Sekarang saya sudah belajar di Tiongkok selama 11 bulan lamanya.",
                    tokens = listOf(
                        WordToken("现在", "xiàn zài", "now; at present; currently", "Kosakata HSK 2: 现在 (xiàn zài)"),
                        WordToken("我", "wǒ", "I; me; my", "Kosakata HSK 2: 我 (wǒ)"),
                        WordToken("在", "zài", "(of sb or sth) to be (located) at", "Kosakata HSK 2: 在 (zài)"),
                        WordToken("中国", "Zhōng guó", "China", "Kosakata HSK 2: 中国 (Zhōng guó)"),
                        WordToken("已经", "yǐ jīng", "already", "Kosakata HSK 2: 已经 (yǐ jīng)"),
                        WordToken("学习", "xué xí", "to learn / to study", "Kosakata HSK 2: 学习 (xué xí)"),
                        WordToken("个", "gè", "classifier for people or objects in general", "Kosakata HSK 2: 个 (gè)"),
                        WordToken("月", "yuè", "month / monthly", "Kosakata HSK 2: 月 (yuè)"),
                        WordToken("了", "le", "(completed action marker) / (modal particle indicating change of state, situation now)", "Kosakata HSK 2: 了 (le)")
                    )
                ),
                Sentence(
                    id = "s_lrnchn_3",
                    hanzi = "我很快会结束在中国的学习，下个月我就要回国了。",
                    pinyin = "wǒ hěn kuài huì jié shù zài Zhōng guó de xué xí xià gè yuè wǒ jiù yào huí guó le",
                    translation = "Tak lama lagi saya akan menyelesaikan masa studi saya di Tiongkok, dan bulan depan saya sudah harus kembali ke negara asal.",
                    tokens = listOf(
                        WordToken("我", "wǒ", "I; me; my", "Kosakata HSK 2: 我 (wǒ)"),
                        WordToken("很", "hěn", "very; quite", "Kosakata HSK 2: 很 (hěn)"),
                        WordToken("快", "kuài", "soon / almost", "Kosakata HSK 2: 快 (kuài)"),
                        WordToken("会", "huì", "to be likely to; to be sure to", "Kosakata HSK 2: 会 (huì)"),
                        WordToken("结束", "jié shù", "to finish / to end / to conclude / to close", "Kosakata HSK 2: 结束 (jié shù)"),
                        WordToken("在", "zài", "(of sb or sth) to be (located) at", "Kosakata HSK 2: 在 (zài)"),
                        WordToken("中国", "Zhōng guó", "China", "Kosakata HSK 2: 中国 (Zhōng guó)"),
                        WordToken("的", "de", "possessive particle (of; 's) / modifying particle (used after an attribute to modify a noun or to form a nominal expression)", "Kosakata HSK 2: 的 (de)"),
                        WordToken("学习", "xué xí", "to learn / to study", "Kosakata HSK 2: 学习 (xué xí)"),
                        WordToken("下", "xià", "later / next (week etc)", "Kosakata HSK 2: 下 (xià)"),
                        WordToken("个", "gè", "classifier for people or objects in general", "Kosakata HSK 2: 个 (gè)"),
                        WordToken("月", "yuè", "month / monthly", "Kosakata HSK 2: 月 (yuè)"),
                        WordToken("我", "wǒ", "I; me; my", "Kosakata HSK 2: 我 (wǒ)"),
                        WordToken("就", "jiù", "as soon as; immediately after", "Kosakata HSK 2: 就 (jiù)"),
                        WordToken("要", "yào", "will; shall; about to / need to; should / if", "Kosakata HSK 2: 要 (yào)"),
                        WordToken("回", "huí", "to go back / to turn around / to answer / to return", "Kosakata HSK 2: 回 (huí)"),
                        WordToken("国", "guó", "country; nation; state", "Kosakata HSK 2: 国 (guó)"),
                        WordToken("了", "le", "(completed action marker) / (modal particle indicating change of state, situation now)", "Kosakata HSK 2: 了 (le)")
                    )
                ),
                Sentence(
                    id = "s_lrnchn_4",
                    hanzi = "一开始，我觉得很难用中文和别人交流。",
                    pinyin = "yī kāi shǐ wǒ jué de hěn nán yòng Zhōng wén hé bié rén jiāo liú",
                    translation = "Pada mulanya, saya merasa sangat sulit untuk berkomunikasi dengan orang lain menggunakan bahasa Mandarin.",
                    tokens = listOf(
                        WordToken("一", "yī", "as soon as", "Kosakata HSK 2: 一 (yī)"),
                        WordToken("开始", "kāi shǐ", "beginning", "Kosakata HSK 2: 开始 (kāi shǐ)"),
                        WordToken("我", "wǒ", "I; me; my", "Kosakata HSK 2: 我 (wǒ)"),
                        WordToken("觉得", "jué de", "to think that ...; to feel that ...", "Kosakata HSK 2: 觉得 (jué de)"),
                        WordToken("很", "hěn", "very; quite", "Kosakata HSK 2: 很 (hěn)"),
                        WordToken("难", "nán", "difficult (to...) / difficult", "Kosakata HSK 2: 难 (nán)"),
                        WordToken("用", "yòng", "to use; to make use of; to employ / (coverb) with; using", "Kosakata HSK 2: 用 (yòng)"),
                        WordToken("中文", "Zhōng wén", "Chinese language", "Kosakata HSK 2: 中文 (Zhōng wén)"),
                        WordToken("和", "hé", "and; together with", "Kosakata HSK 2: 和 (hé)"),
                        WordToken("别人", "bié rén", "other people; others; other person", "Kosakata HSK 2: 别人 (bié rén)"),
                        WordToken("交流", "jiāo liú", "communication / interaction / to have social contact (with sb)", "Kosakata HSK 2: 交流 (jiāo liú)")
                    )
                ),
                Sentence(
                    id = "s_lrnchn_5",
                    hanzi = "现在我中文说得好多了，甚至可以看懂中文电视，这是因为我学习很努力，老师和同学对我的帮助也很大。",
                    pinyin = "xiàn zài wǒ Zhōng wén shuō de hǎo duō le shèn zhì kě yǐ kàn dǒng Zhōng wén diàn shì zhè shì yīn wèi wǒ xué xí hěn nǔ lì lǎo shī hé tóng xué duì wǒ de bāng zhù yě hěn dà",
                    translation = "Kini kemampuan bahasa Mandarin saya sudah jauh lebih baik, bahkan saya sudah bisa memahami siaran televisi Tiongkok; semua ini berkat kerja keras saya dalam belajar, serta bantuan luar biasa dari para guru dan teman sekelas.",
                    tokens = listOf(
                        WordToken("现在", "xiàn zài", "now; at present; currently", "Kosakata HSK 2: 现在 (xiàn zài)"),
                        WordToken("我", "wǒ", "I; me; my", "Kosakata HSK 2: 我 (wǒ)"),
                        WordToken("中文", "Zhōng wén", "Chinese language", "Kosakata HSK 2: 中文 (Zhōng wén)"),
                        WordToken("说", "shuō", "to speak; to talk; to say", "Kosakata HSK 2: 说 (shuō)"),
                        WordToken("得", "de", "structural particle: used after a verb (or adjective as main verb), linking it to following phrase indicating effect, degree, possibility etc", "Kosakata HSK 2: 得 (de)"),
                        WordToken("好", "hǎo", "good / appropriate; proper", "Kosakata HSK 2: 好 (hǎo)"),
                        WordToken("多", "duō", "many; much; more; a lot of", "Kosakata HSK 2: 多 (duō)"),
                        WordToken("了", "le", "(completed action marker) / (modal particle indicating change of state, situation now)", "Kosakata HSK 2: 了 (le)"),
                        WordToken("甚至", "shèn zhì", "even; so much so that", "Kosakata HSK 2: 甚至 (shèn zhì)"),
                        WordToken("可以", "kě yǐ", "can / may / possible / able to", "Kosakata HSK 2: 可以 (kě yǐ)"),
                        WordToken("看", "kàn", "to see; to look at / to read / to watch / to visit; to call on / to consider; to regard as / to look after / to treat (a patient or illness) / to depend on / to feel (that) / (after a verb) to give it a try / to watch out for", "Kosakata HSK 2: 看 (kàn)"),
                        WordToken("懂", "dǒng", "to understand / to comprehend", "Kosakata HSK 2: 懂 (dǒng)"),
                        WordToken("中文", "Zhōng wén", "Chinese language", "Kosakata HSK 2: 中文 (Zhōng wén)"),
                        WordToken("电视", "diàn shì", "television; TV", "Kosakata HSK 2: 电视 (diàn shì)"),
                        WordToken("这是", "zhè shì", "this is; this is the case", "Kosakata HSK 2: 这是 (zhè shì)"),
                        WordToken("因为", "yīn wèi", "because; owing to; on account of", "Kosakata HSK 2: 因为 (yīn wèi)"),
                        WordToken("我", "wǒ", "I; me; my", "Kosakata HSK 2: 我 (wǒ)"),
                        WordToken("学习", "xué xí", "to learn / to study", "Kosakata HSK 2: 学习 (xué xí)"),
                        WordToken("很", "hěn", "very; quite", "Kosakata HSK 2: 很 (hěn)"),
                        WordToken("努力", "nǔ lì", "hard-working; conscientious", "Kosakata HSK 2: 努力 (nǔ lì)"),
                        WordToken("老师", "lǎo shī", "teacher", "Kosakata HSK 2: 老师 (lǎo shī)"),
                        WordToken("和", "hé", "and; together with", "Kosakata HSK 2: 和 (hé)"),
                        WordToken("同学", "tóng xué", "fellow student / classmate", "Kosakata HSK 2: 同学 (tóng xué)"),
                        WordToken("对", "duì", "towards; at; for / concerning; regarding", "Kosakata HSK 2: 对 (duì)"),
                        WordToken("我", "wǒ", "I; me; my", "Kosakata HSK 2: 我 (wǒ)"),
                        WordToken("的", "de", "possessive particle (of; 's) / modifying particle (used after an attribute to modify a noun or to form a nominal expression)", "Kosakata HSK 2: 的 (de)"),
                        WordToken("帮助", "bāng zhù", "assistance; aid", "Kosakata HSK 2: 帮助 (bāng zhù)"),
                        WordToken("也", "yě", "also; too; as well; (not ...) either", "Kosakata HSK 2: 也 (yě)"),
                        WordToken("很", "hěn", "very; quite", "Kosakata HSK 2: 很 (hěn)"),
                        WordToken("大", "dà", "big; large; great / older (than another person) / eldest", "Kosakata HSK 2: 大 (dà)")
                    )
                ),
                Sentence(
                    id = "s_lrnchn_6",
                    hanzi = "现在我有许多中国朋友。",
                    pinyin = "xiàn zài wǒ yǒu xǔ duō Zhōng guó péng you",
                    translation = "Sekarang saya memiliki banyak teman orang Tiongkok.",
                    tokens = listOf(
                        WordToken("现在", "xiàn zài", "now; at present; currently", "Kosakata HSK 2: 现在 (xiàn zài)"),
                        WordToken("我", "wǒ", "I; me; my", "Kosakata HSK 2: 我 (wǒ)"),
                        WordToken("有", "yǒu", "to have; there is", "Kosakata HSK 2: 有 (yǒu)"),
                        WordToken("许多", "xǔ duō", "many / a lot of / much", "Kosakata HSK 2: 许多 (xǔ duō)"),
                        WordToken("中国", "Zhōng guó", "China", "Kosakata HSK 2: 中国 (Zhōng guó)"),
                        WordToken("朋友", "péng you", "friend", "Kosakata HSK 2: 朋友 (péng you)")
                    )
                ),
                Sentence(
                    id = "s_lrnchn_7",
                    hanzi = "一些朋友会邀请我去他们家吃饭。",
                    pinyin = "yī xiē péng you huì yāo qǐng wǒ qù tā men jiā chī fàn",
                    translation = "Beberapa teman bahkan kerap mengundang saya untuk makan bersama di rumah keluarga mereka.",
                    tokens = listOf(
                        WordToken("一些", "yī xiē", "some; a few; a little; (following an adjective) slightly ...er", "Kosakata HSK 2: 一些 (yī xiē)"),
                        WordToken("朋友", "péng you", "friend", "Kosakata HSK 2: 朋友 (péng you)"),
                        WordToken("会", "huì", "to be likely to; to be sure to", "Kosakata HSK 2: 会 (huì)"),
                        WordToken("邀请", "yāo qǐng", "to invite", "Kosakata HSK 2: 邀请 (yāo qǐng)"),
                        WordToken("我", "wǒ", "I; me; my", "Kosakata HSK 2: 我 (wǒ)"),
                        WordToken("去", "qù", "to go, to go to", "Kosakata HSK 2: 去 (qù)"),
                        WordToken("他们", "tā men", "they; them", "Kosakata HSK 2: 他们 (tā men)"),
                        WordToken("家", "jiā", "home / family / (polite) my (sister, uncle etc)", "Kosakata HSK 2: 家 (jiā)"),
                        WordToken("吃饭", "chī fàn", "to have a meal / to eat", "Kosakata HSK 2: 吃饭 (chī fàn)")
                    )
                ),
                Sentence(
                    id = "s_lrnchn_8",
                    hanzi = "我对中国文化和中国人都很感兴趣。",
                    pinyin = "wǒ duì Zhōng guó wén huà hé Zhōng guó rén dōu hěn gǎn xìng qù",
                    translation = "Saya sangat tertarik mendalami kebudayaan Tiongkok serta mengenal masyarakatnya yang ramah.",
                    tokens = listOf(
                        WordToken("我", "wǒ", "I; me; my", "Kosakata HSK 2: 我 (wǒ)"),
                        WordToken("对", "duì", "towards; at; for / concerning; regarding", "Kosakata HSK 2: 对 (duì)"),
                        WordToken("中国", "Zhōng guó", "China", "Kosakata HSK 2: 中国 (Zhōng guó)"),
                        WordToken("文化", "wén huà", "culture / civilization", "Kosakata HSK 2: 文化 (wén huà)"),
                        WordToken("和", "hé", "and; together with", "Kosakata HSK 2: 和 (hé)"),
                        WordToken("中国", "Zhōng guó", "China", "Kosakata HSK 2: 中国 (Zhōng guó)"),
                        WordToken("人", "rén", "person; people", "Kosakata HSK 2: 人 (rén)"),
                        WordToken("都", "dōu", "all; both; entirely", "Kosakata HSK 2: 都 (dōu)"),
                        WordToken("很", "hěn", "very; quite", "Kosakata HSK 2: 很 (hěn)"),
                        WordToken("感", "gǎn", "to feel", "Kosakata HSK 2: 感 (gǎn)"),
                        WordToken("兴趣", "xìng qù", "interest (desire to know about sth) / interest; hobby", "Kosakata HSK 2: 兴趣 (xìng qù)")
                    )
                ),
                Sentence(
                    id = "s_lrnchn_9",
                    hanzi = "谢谢他们，我希望以后可以来中国工作。",
                    pinyin = "xiè xie tā men wǒ xī wàng yǐ hòu kě yǐ lái Zhōng guó gōng zuò",
                    translation = "Terima kasih banyak kepada mereka semua, dan saya berharap di masa depan dapat kembali ke Tiongkok untuk bekerja.",
                    tokens = listOf(
                        WordToken("谢谢", "xiè xie", "to thank", "Kosakata HSK 2: 谢谢 (xiè xie)"),
                        WordToken("他们", "tā men", "they; them", "Kosakata HSK 2: 他们 (tā men)"),
                        WordToken("我", "wǒ", "I; me; my", "Kosakata HSK 2: 我 (wǒ)"),
                        WordToken("希望", "xī wàng", "to hope", "Kosakata HSK 2: 希望 (xī wàng)"),
                        WordToken("以后", "yǐ hòu", "after / later / afterwards / following / later on / in the future", "Kosakata HSK 2: 以后 (yǐ hòu)"),
                        WordToken("可以", "kě yǐ", "can / may / possible / able to", "Kosakata HSK 2: 可以 (kě yǐ)"),
                        WordToken("来", "lái", "to come", "Kosakata HSK 2: 来 (lái)"),
                        WordToken("中国", "Zhōng guó", "China", "Kosakata HSK 2: 中国 (Zhōng guó)"),
                        WordToken("工作", "gōng zuò", "to work / (of a machine) to operate", "Kosakata HSK 2: 工作 (gōng zuò)")
                    )
                )
            ),
            questions = listOf(
                StoryQuestion(
                    id = "q_lrnchn_1",
                    questionText = "作者来到中国学习中文到现在已经有多长时间了？ (Berapa lama sang narator telah belajar bahasa Mandarin di Tiongkok?)",
                    options = listOf("3个月 (3 bulan)", "6个月 (6 bulan)", "11个月 (11 bulan)", "3年 (3 tahun)"),
                    correctAnswerIndex = 2,
                    explanation = "Penulis telah menempuh masa studi selama 11 bulan di Tiongkok."
                ),
                StoryQuestion(
                    id = "q_lrnchn_2",
                    questionText = "刚开始学习中文时，作者面临的主要困难是什么？ (Kesulitan utama apa yang dialami penulis pada masa-masa awal belajarnya?)",
                    options = listOf("吃不惯中餐的辣味 (Tidak terbiasa dengan masakan Tiongkok yang pedas)", "很难用中文顺畅地和他人交流 (Sangat sulit berkomunikasi menggunakan bahasa Mandarin dengan orang lain)", "找不到合适的宿舍 (Tidak menemukan asrama yang layak)", "买不起车票 (Tidak mampu membeli tiket perjalanan)"),
                    correctAnswerIndex = 1,
                    explanation = "Di awal kedatangannya, berkomunikasi secara aktif dengan orang lokal terasa sangat menantang."
                ),
                StoryQuestion(
                    id = "q_lrnchn_3",
                    questionText = "作者的中文水平现在取得了怎样的显著进步？ (Kemajuan signifikan apa yang kini telah diraih oleh penulis?)",
                    options = listOf("中文说得好多了，甚至能够看懂中文电视节目 (Kemampuan bicaranya meningkat pesat, bahkan sudah mampu memahami siaran TV Mandarin)", "学会了所有的中国方言 (Menguasai semua dialek bahasa Tiongkok)", "写出了一本中文小说 (Menulis sebuah novel berbahasa Mandarin)", "通过了HSK六级最高难度 (Lulus ujian HSK level 6 tertinggi)"),
                    correctAnswerIndex = 0,
                    explanation = "Kini ia bisa bertutur jauh lebih lancar dan bahkan menikmati siaran televisi berbahasa Mandarin."
                ),
                StoryQuestion(
                    id = "q_lrnchn_4",
                    questionText = "在结束学业回国之后，作者对未来怀有怎样美好的职业愿望？ (Harapan masa depan apa yang diimpikan penulis setelah menyelesaikan studinya?)",
                    options = listOf("再也不回中国 (Tidak ingin kembali lagi ke Tiongkok)", "希望以后能有机会再次回到中国工作与发展 (Berharap kelak di masa depan memiliki kesempatan bekerja dan berkarier di Tiongkok)", "成为一名专职导游 (Menjadi pemandu wisata penuh waktu)", "改学其他外语 (Beralih mempelajari bahasa asing lain)"),
                    correctAnswerIndex = 1,
                    explanation = "Kecintaan pada budaya dan persahabatan di Tiongkok membuatnya bercita-cita kembali berkarier di sana."
                )
            )
        ),
        // Cerita Mandarin Bean 144 (HSK 2): Smart Policeman (Polisi yang Cerdik)
        Story(
            id = "story_smart_policeman",
            titleHanzi = "聪明的警察",
            titlePinyin = "Cōngmíng De Jǐngchá",
            titleTranslation = "Smart Policeman (Polisi yang Cerdik)",
            level = "HSK 2",
            category = "Masyarakat & Humor",
            description = "Kecerdikan seorang polisi kantor yang berhasil menghentikan perdebatan sengit tiga wanita hanya dengan satu pertanyaan tentang usia.",
            coverEmoji = "👮",
            coverImageRes = R.drawable.cover_story_smart_policeman,
            estimatedReadMinutes = 2,
            sentences = listOf(
                Sentence(
                    id = "s_smartpol_1",
                    hanzi = "有一天，三位女士因为一件小事来到警察局。",
                    pinyin = "yǒu yī tiān sān wèi nǚ shì yīn wèi yī jiàn xiǎo shì lái dào jǐng chá jú",
                    translation = "Suatu hari, tiga orang wanita mendatangi kantor polisi karena berselisih paham mengenai masalah sepele.",
                    tokens = listOf(
                        WordToken("有", "yǒu", "to have; there is", "Kosakata HSK 2: 有 (yǒu)"),
                        WordToken("一", "yī", "one / single / a (article)", "Kosakata HSK 2: 一 (yī)"),
                        WordToken("天", "tiān", "day", "Kosakata HSK 2: 天 (tiān)"),
                        WordToken("三", "sān", "three / 3", "Kosakata HSK 2: 三 (sān)"),
                        WordToken("位", "wèi", "classifier for people (honorific)", "Kosakata HSK 2: 位 (wèi)"),
                        WordToken("女士", "nǚ shì", "lady / madam / Miss / Ms", "Kosakata HSK 2: 女士 (nǚ shì)"),
                        WordToken("因为", "yīn wèi", "because; owing to; on account of", "Kosakata HSK 2: 因为 (yīn wèi)"),
                        WordToken("一", "yī", "one / single / a (article)", "Kosakata HSK 2: 一 (yī)"),
                        WordToken("件", "jiàn", "classifier for events, things, clothes etc", "Kosakata HSK 2: 件 (jiàn)"),
                        WordToken("小", "xiǎo", "small / tiny / few", "Kosakata HSK 2: 小 (xiǎo)"),
                        WordToken("事", "shì", "matter / thing / item / affair", "Kosakata HSK 2: 事 (shì)"),
                        WordToken("来", "lái", "to come", "Kosakata HSK 2: 来 (lái)"),
                        WordToken("到", "dào", "to reach; to arrive / to (a place); until (a time); up to (a point) / (verb complement indicating arriving at a place or reaching a point)", "Kosakata HSK 2: 到 (dào)"),
                        WordToken("警察局", "jǐng chá jú", "police station / police department / police headquarters", "Kosakata HSK 2: 警察局 (jǐng chá jú)")
                    )
                ),
                Sentence(
                    id = "s_smartpol_2",
                    hanzi = "她们吵得很厉害，谁都不让别人先说，大家都没有办法。",
                    pinyin = "tā men chǎo de hěn lì hai shéi dōu bù ràng bié rén xiān shuō dà jiā dōu méi yǒu bàn fǎ",
                    translation = "Mereka saling bertengkar dengan sangat sengit, tiada yang mau mengalah membiarkan orang lain berbicara terlebih dahulu, sehingga semua petugas polisi kebingungan.",
                    tokens = listOf(
                        WordToken("她们", "tā men", "they; them (females)", "Kosakata HSK 2: 她们 (tā men)"),
                        WordToken("吵", "chǎo", "to quarrel / to make a noise / to disturb by making a noise", "Kosakata HSK 2: 吵 (chǎo)"),
                        WordToken("得", "de", "structural particle: used after a verb (or adjective as main verb), linking it to following phrase indicating effect, degree, possibility etc", "Kosakata HSK 2: 得 (de)"),
                        WordToken("很", "hěn", "very; quite", "Kosakata HSK 2: 很 (hěn)"),
                        WordToken("厉害", "lì hai", "(used to describe sb or sth that makes a very strong impression, whether favorable or unfavorable) terrible; intense; severe; devastating; amazing; awesome; outstanding / (of a person) stern; strict; harsh; shrewd; tough / (of an animal) fierce / (of a resemblance) striking / (of liquor or chili pepper) strong / (of bacteria) virulent", "Kosakata HSK 2: 厉害 (lì hai)"),
                        WordToken("谁", "shéi", "who", "Kosakata HSK 2: 谁 (shéi)"),
                        WordToken("都", "dōu", "all; both; entirely", "Kosakata HSK 2: 都 (dōu)"),
                        WordToken("不", "bù", "no; not so", "Kosakata HSK 2: 不 (bù)"),
                        WordToken("让", "ràng", "to permit / to let sb do sth / to have sb do sth / to make sb (feel sad etc)", "Kosakata HSK 2: 让 (ràng)"),
                        WordToken("别人", "bié rén", "other people; others; other person", "Kosakata HSK 2: 别人 (bié rén)"),
                        WordToken("先", "xiān", "beforehand; first; earlier / at first; originally / for the time being; for now", "Kosakata HSK 2: 先 (xiān)"),
                        WordToken("说", "shuō", "to speak; to talk; to say", "Kosakata HSK 2: 说 (shuō)"),
                        WordToken("大家", "dà jiā", "everyone", "Kosakata HSK 2: 大家 (dà jiā)"),
                        WordToken("都", "dōu", "all; both; entirely", "Kosakata HSK 2: 都 (dōu)"),
                        WordToken("没有", "méi yǒu", "to not have", "Kosakata HSK 2: 没有 (méi yǒu)"),
                        WordToken("办法", "bàn fǎ", "way of handling sth; means; measure; (practical) solution to a problem", "Kosakata HSK 2: 办法 (bàn fǎ)")
                    )
                ),
                Sentence(
                    id = "s_smartpol_3",
                    hanzi = "这时候，聪明的杰瑞问：”你们先别吵，谁先说？”",
                    pinyin = "zhè shí hou cōng míng de Jié ruì wèn nǐ men xiān bié chǎo shéi xiān shuō",
                    translation = "Pada saat itu, petugas Jerry yang cerdik menenangkan: “Kalian bertiga tenanglah dulu, siapa yang ingin berbicara duluan?”",
                    tokens = listOf(
                        WordToken("这", "zhè", "this; these", "Kosakata HSK 2: 这 (zhè)"),
                        WordToken("时候", "shí hou", "time / length of time / moment / period", "Kosakata HSK 2: 时候 (shí hou)"),
                        WordToken("聪明", "cōng míng", "intelligent; clever; bright / acute (of sight and hearing)", "Kosakata HSK 2: 聪明 (cōng míng)"),
                        WordToken("的", "de", "possessive particle (of; 's) / modifying particle (used after an attribute to modify a noun or to form a nominal expression)", "Kosakata HSK 2: 的 (de)"),
                        WordToken("杰瑞", "Jié ruì", "Jerry or Gerry (name)", "Kosakata HSK 2: 杰瑞 (Jié ruì)"),
                        WordToken("问", "wèn", "to ask; to inquire", "Kosakata HSK 2: 问 (wèn)"),
                        WordToken("你们", "nǐ men", "you (plural)", "Kosakata HSK 2: 你们 (nǐ men)"),
                        WordToken("先", "xiān", "beforehand; first; earlier / at first; originally / for the time being; for now", "Kosakata HSK 2: 先 (xiān)"),
                        WordToken("别", "bié", "don't ...! / (noun suffix) category", "Kosakata HSK 2: 别 (bié)"),
                        WordToken("吵", "chǎo", "to quarrel / to make a noise / to disturb by making a noise", "Kosakata HSK 2: 吵 (chǎo)"),
                        WordToken("谁", "shéi", "who", "Kosakata HSK 2: 谁 (shéi)"),
                        WordToken("先", "xiān", "beforehand; first; earlier / at first; originally / for the time being; for now", "Kosakata HSK 2: 先 (xiān)"),
                        WordToken("说", "shuō", "to speak; to talk; to say", "Kosakata HSK 2: 说 (shuō)")
                    )
                ),
                Sentence(
                    id = "s_smartpol_4",
                    hanzi = "三位女士都觉得自己是对的，都想先说。",
                    pinyin = "sān wèi nǚ shì dōu jué de zì jǐ shì duì de dōu xiǎng xiān shuō",
                    translation = "Ketiga wanita itu merasa diri merekalah yang paling benar, dan berebut ingin bicara paling pertama.",
                    tokens = listOf(
                        WordToken("三", "sān", "three / 3", "Kosakata HSK 2: 三 (sān)"),
                        WordToken("位", "wèi", "classifier for people (honorific)", "Kosakata HSK 2: 位 (wèi)"),
                        WordToken("女士", "nǚ shì", "lady / madam / Miss / Ms", "Kosakata HSK 2: 女士 (nǚ shì)"),
                        WordToken("都", "dōu", "all; both; entirely", "Kosakata HSK 2: 都 (dōu)"),
                        WordToken("觉得", "jué de", "to think that ...; to feel that ...", "Kosakata HSK 2: 觉得 (jué de)"),
                        WordToken("自己", "zì jǐ", "oneself; (attributive) one's own", "Kosakata HSK 2: 自己 (zì jǐ)"),
                        WordToken("是", "shì", "indeed (used for emphasis)", "Kosakata HSK 2: 是 (shì)"),
                        WordToken("对", "duì", "right; correct", "Kosakata HSK 2: 对 (duì)"),
                        WordToken("的", "de", "emphatic particle (used at the end of a declarative sentence for emphasis)", "Kosakata HSK 2: 的 (de)"),
                        WordToken("都", "dōu", "all; both; entirely", "Kosakata HSK 2: 都 (dōu)"),
                        WordToken("想", "xiǎng", "to desire; to want (to)", "Kosakata HSK 2: 想 (xiǎng)"),
                        WordToken("先", "xiān", "beforehand; first; earlier / at first; originally / for the time being; for now", "Kosakata HSK 2: 先 (xiān)"),
                        WordToken("说", "shuō", "to speak; to talk; to say", "Kosakata HSK 2: 说 (shuō)")
                    )
                ),
                Sentence(
                    id = "s_smartpol_5",
                    hanzi = "杰瑞说：”那就请你们中间最大的一位先说吧。”",
                    pinyin = "Jié ruì shuō nà jiù qǐng nǐ men zhōng jiān zuì dà de yī wèi xiān shuō ba",
                    translation = "Jerry tersenyum lalu berkata: “Kalau begitu, silakan wanita yang usianya paling tua di antara kalian bertiga berbicara duluan!”",
                    tokens = listOf(
                        WordToken("杰瑞", "Jié ruì", "Jerry or Gerry (name)", "Kosakata HSK 2: 杰瑞 (Jié ruì)"),
                        WordToken("说", "shuō", "to speak; to talk; to say", "Kosakata HSK 2: 说 (shuō)"),
                        WordToken("那", "nà", "then (in that case)", "Kosakata HSK 2: 那 (nà)"),
                        WordToken("就", "jiù", "in that case; then", "Kosakata HSK 2: 就 (jiù)"),
                        WordToken("请", "qǐng", "please (do sth)", "Kosakata HSK 2: 请 (qǐng)"),
                        WordToken("你们", "nǐ men", "you (plural)", "Kosakata HSK 2: 你们 (nǐ men)"),
                        WordToken("中间", "zhōng jiān", "in the middle; within; between; among", "Kosakata HSK 2: 中间 (zhōng jiān)"),
                        WordToken("最", "zuì", "(before an adjective or verb) to the highest degree; (the) most ...; -est", "Kosakata HSK 2: 最 (zuì)"),
                        WordToken("大", "dà", "big; large; great / older (than another person) / eldest", "Kosakata HSK 2: 大 (dà)"),
                        WordToken("的", "de", "possessive particle (of; 's) / modifying particle (used after an attribute to modify a noun or to form a nominal expression)", "Kosakata HSK 2: 的 (de)"),
                        WordToken("一", "yī", "one / single / a (article)", "Kosakata HSK 2: 一 (yī)"),
                        WordToken("位", "wèi", "classifier for people (honorific)", "Kosakata HSK 2: 位 (wèi)"),
                        WordToken("先", "xiān", "beforehand; first; earlier / at first; originally / for the time being; for now", "Kosakata HSK 2: 先 (xiān)"),
                        WordToken("说", "shuō", "to speak; to talk; to say", "Kosakata HSK 2: 说 (shuō)"),
                        WordToken("吧", "ba", "(modal particle indicating suggestion or surmise) / ...right? / ...OK? / ...I presume.", "Kosakata HSK 2: 吧 (ba)")
                    )
                ),
                Sentence(
                    id = "s_smartpol_6",
                    hanzi = "他说完后，房间就安静了。",
                    pinyin = "tā shuō wán hòu fáng jiān jiù ān jìng le",
                    translation = "Begitu ia selesai berbicara, seketika seluruh ruangan kantor polisi langsung sunyi senyap.",
                    tokens = listOf(
                        WordToken("他", "tā", "he; him; his", "Kosakata HSK 2: 他 (tā)"),
                        WordToken("说", "shuō", "to speak; to talk; to say", "Kosakata HSK 2: 说 (shuō)"),
                        WordToken("完", "wán", "to finish / to be over", "Kosakata HSK 2: 完 (wán)"),
                        WordToken("后", "hòu", "afterwards / after", "Kosakata HSK 2: 后 (hòu)"),
                        WordToken("房间", "fáng jiān", "room", "Kosakata HSK 2: 房间 (fáng jiān)"),
                        WordToken("就", "jiù", "in that case; then", "Kosakata HSK 2: 就 (jiù)"),
                        WordToken("安静", "ān jìng", "quiet / peaceful / calm", "Kosakata HSK 2: 安静 (ān jìng)"),
                        WordToken("了", "le", "(completed action marker) / (modal particle indicating change of state, situation now)", "Kosakata HSK 2: 了 (le)")
                    )
                )
            ),
            questions = listOf(
                StoryQuestion(
                    id = "q_smartpol_1",
                    questionText = "三位女士因为琐事来到警察局时，现场处于怎样混乱的局面？ (Kondisi kacau seperti apa yang terjadi saat ketiga wanita itu tiba di kantor polisi?)",
                    options = listOf("大家都坐在椅子上沉默不语 (Semua orang duduk terdiam membisu)", "三个人吵得很厉害，谁都不肯让别人先说 (Mereka bertengkar hebat berebut bicara dan tak ada yang mau mengalah)", "她们在跟警察一起吃午餐 (Mereka sedang makan siang bersama polisi)", "她们在互相握手道歉 (Mereka saling bersalaman meminta maaf)"),
                    correctAnswerIndex = 1,
                    explanation = "Ketiga wanita itu berselisih sengit dan berebut bicara tanpa mau mendengarkan orang lain."
                ),
                StoryQuestion(
                    id = "q_smartpol_2",
                    questionText = "看到场面失控，警局里的其他警察最初感觉如何？ (Bagaimana perasaan petugas polisi lain melihat kegaduhan tersebut?)",
                    options = listOf("毫无办法，束手无策 (Kewalahan dan kehabisan akal menghadapinya)", "非常开心 (Sangat gembira)", "立即把她们关起来 (Langsung mengurung mereka)", "全部请假回家 (Semua mengambil cuti pulang)"),
                    correctAnswerIndex = 0,
                    explanation = "Petugas polisi lain kebingungan dan kehabisan cara untuk menenangkan pertengkaran tersebut."
                ),
                StoryQuestion(
                    id = "q_smartpol_3",
                    questionText = "聪明的警察杰瑞想出了什么巧妙的一句话来决定发言顺序？ (Kalimat cerdik apa yang diucapkan polisi Jerry untuk menentukan giliran bicara?)",
                    options = listOf("“有钱的人先说” (Yang paling kaya silakan bicara duluan)", "“请你们中间年龄最大的一位先说吧” (Silakan wanita yang usianya paling tua di antara kalian bicara duluan)", "“声音最大的人先说” (Yang suaranya paling kencang silakan bicara)", "“长得最漂亮的人先说” (Yang paling cantik silakan bicara)"),
                    correctAnswerIndex = 1,
                    explanation = "Jerry mengundang wanita yang paling tua untuk berbicara duluan."
                ),
                StoryQuestion(
                    id = "q_smartpol_4",
                    questionText = "杰瑞说完这句话后，为什么整个房间瞬间变得鸦雀无声？ (Mengapa ruangan seketika sunyi senyap setelah Jerry mengucapkan kalimat tersebut?)",
                    options = listOf("三位女士都被警察抓走了 (Ketiga wanita itu ditangkap polisi)", "没有女人愿意公开承认自己是三人中年龄最大的那一个 (Tiada satu pun wanita yang sudi mengakui dirinya sebagai yang paling berumur!)", "她们突然想不起案情了 (Mereka mendadak lupa masalahnya)", "杰瑞请她们吃蛋糕了 (Jerry membagikan kue untuk mereka)"),
                    correctAnswerIndex = 1,
                    explanation = "Sensitivitas wanita terhadap pengakuan usia tua membuat mereka semua serempak menutup mulut."
                )
            )
        ),
        // Cerita Mandarin Bean 145 (HSK 2): Out of Sight (Tidak Kelihatan)
        Story(
            id = "story_out_of_sight",
            titleHanzi = "看不到",
            titlePinyin = "Kàn Bù Dào",
            titleTranslation = "Out of Sight (Tidak Kelihatan)",
            level = "HSK 2",
            category = "Keluarga & Sekolah",
            description = "Trik cerdik anak laki-laki yang mematikan lampu kamar agar ayahnya tidak bisa melihat nilai ujian matematikanya yang merah.",
            coverEmoji = "📄",
            coverImageRes = R.drawable.cover_story_out_of_sight,
            estimatedReadMinutes = 2,
            sentences = listOf(
                Sentence(
                    id = "s_outsight_1",
                    hanzi = "有一天，爸爸回家后，问儿子：”今天的数学考试怎么样？”",
                    pinyin = "yǒu yī tiān bà ba huí jiā hòu wèn ér zi jīn tiān de shù xué kǎo shì zěn me yàng",
                    translation = "Suatu hari setibanya di rumah, sang ayah bertanya kepada putranya: “Bagaimana hasil ujian matematikamu hari ini?”",
                    tokens = listOf(
                        WordToken("有", "yǒu", "to have; there is", "Kosakata HSK 2: 有 (yǒu)"),
                        WordToken("一", "yī", "one / single / a (article)", "Kosakata HSK 2: 一 (yī)"),
                        WordToken("天", "tiān", "day", "Kosakata HSK 2: 天 (tiān)"),
                        WordToken("爸爸", "bà ba", "(coll.) father; dad", "Kosakata HSK 2: 爸爸 (bà ba)"),
                        WordToken("回", "huí", "to go back / to turn around / to answer / to return", "Kosakata HSK 2: 回 (huí)"),
                        WordToken("家", "jiā", "home / family / (polite) my (sister, uncle etc)", "Kosakata HSK 2: 家 (jiā)"),
                        WordToken("后", "hòu", "afterwards / after", "Kosakata HSK 2: 后 (hòu)"),
                        WordToken("问", "wèn", "to ask; to inquire", "Kosakata HSK 2: 问 (wèn)"),
                        WordToken("儿子", "ér zi", "son", "Kosakata HSK 2: 儿子 (ér zi)"),
                        WordToken("今天", "jīn tiān", "today", "Kosakata HSK 2: 今天 (jīn tiān)"),
                        WordToken("的", "de", "possessive particle (of; 's) / modifying particle (used after an attribute to modify a noun or to form a nominal expression)", "Kosakata HSK 2: 的 (de)"),
                        WordToken("数学", "shù xué", "mathematics", "Kosakata HSK 2: 数学 (shù xué)"),
                        WordToken("考试", "kǎo shì", "exam", "Kosakata HSK 2: 考试 (kǎo shì)"),
                        WordToken("怎么样", "zěn me yàng", "how? / how about? / how was it? / how are things?", "Kosakata HSK 2: 怎么样 (zěn me yàng)")
                    )
                ),
                Sentence(
                    id = "s_outsight_2",
                    hanzi = "儿子只考了59分，他非常害怕爸爸会打他，所以紧张地把试卷给了爸爸。",
                    pinyin = "ér zi zhǐ kǎo le fēn tā fēi cháng hài pà bà ba huì dǎ tā suǒ yǐ jǐn zhāng de bǎ shì juàn gěi le bà ba",
                    translation = "Anak itu hanya mendapatkan nilai 59 poin; ia sangat takut ayahnya akan memarahinya atau memukulnya, sehingga dengan gugup ia menyerahkan kertas ujian itu kepada sang ayah.",
                    tokens = listOf(
                        WordToken("儿子", "ér zi", "son", "Kosakata HSK 2: 儿子 (ér zi)"),
                        WordToken("只", "zhǐ", "only; merely; just", "Kosakata HSK 2: 只 (zhǐ)"),
                        WordToken("考", "kǎo", "to check / to verify / to test / to examine / to take an exam / to take an entrance exam for", "Kosakata HSK 2: 考 (kǎo)"),
                        WordToken("了", "le", "(completed action marker) / (modal particle indicating change of state, situation now)", "Kosakata HSK 2: 了 (le)"),
                        WordToken("分", "fēn", "a point (in sports or games)", "Kosakata HSK 2: 分 (fēn)"),
                        WordToken("他", "tā", "he; him; his", "Kosakata HSK 2: 他 (tā)"),
                        WordToken("非常", "fēi cháng", "very; really", "Kosakata HSK 2: 非常 (fēi cháng)"),
                        WordToken("害怕", "hài pà", "to be afraid; to be scared", "Kosakata HSK 2: 害怕 (hài pà)"),
                        WordToken("爸爸", "bà ba", "(coll.) father; dad", "Kosakata HSK 2: 爸爸 (bà ba)"),
                        WordToken("会", "huì", "to be likely to; to be sure to", "Kosakata HSK 2: 会 (huì)"),
                        WordToken("打", "dǎ", "to hit; to strike / to fight", "Kosakata HSK 2: 打 (dǎ)"),
                        WordToken("他", "tā", "he; him; his", "Kosakata HSK 2: 他 (tā)"),
                        WordToken("所以", "suǒ yǐ", "therefore / as a result / so", "Kosakata HSK 2: 所以 (suǒ yǐ)"),
                        WordToken("紧张", "jǐn zhāng", "nervous / keyed up / intense / tense / strained", "Kosakata HSK 2: 紧张 (jǐn zhāng)"),
                        WordToken("地", "de", "-ly / structural particle: used before a verb or adjective, linking it to preceding modifying adverbial adjunct", "Kosakata HSK 2: 地 (de)"),
                        WordToken("把", "bǎ", "(used to put the object before the verb: 把[ba3] + {noun} + {verb})", "Kosakata HSK 2: 把 (bǎ)"),
                        WordToken("试卷", "shì juàn", "examination paper / test paper", "Kosakata HSK 2: 试卷 (shì juàn)"),
                        WordToken("给", "gěi", "to give", "Kosakata HSK 2: 给 (gěi)"),
                        WordToken("了", "le", "(completed action marker) / (modal particle indicating change of state, situation now)", "Kosakata HSK 2: 了 (le)"),
                        WordToken("爸爸", "bà ba", "(coll.) father; dad", "Kosakata HSK 2: 爸爸 (bà ba)")
                    )
                ),
                Sentence(
                    id = "s_outsight_3",
                    hanzi = "没想到，爸爸看完试卷后说：”虽然你考得很差，但是看到你的成绩，有一点我可以相信，就是你考试的时候没有看别人。”",
                    pinyin = "méi xiǎng dào bà ba kàn wán shì juàn hòu shuō suī rán nǐ kǎo de hěn chà dàn shì kàn dào nǐ de chéng jì yǒu yī diǎn wǒ kě yǐ xiāng xìn jiù shì nǐ kǎo shì de shí hou méi yǒu kàn bié rén",
                    translation = "Tak disangka, setelah mengamati kertas ujian itu ayah justru berkata: “Meskipun nilaimu sangat jelek, tetapi melihat hasil ini ada satu hal terpuji yang bisa kupercaya, yaitu kamu tidak menyontek hasil temanmu saat ujian!”",
                    tokens = listOf(
                        WordToken("没", "méi", "(negative prefix for verbs) have not; not", "Kosakata HSK 2: 没 (méi)"),
                        WordToken("想", "xiǎng", "to think (about) / to think of; to devise / to think (that); to believe (that)", "Kosakata HSK 2: 想 (xiǎng)"),
                        WordToken("到", "dào", "to reach; to arrive / to (a place); until (a time); up to (a point) / (verb complement indicating arriving at a place or reaching a point)", "Kosakata HSK 2: 到 (dào)"),
                        WordToken("爸爸", "bà ba", "(coll.) father; dad", "Kosakata HSK 2: 爸爸 (bà ba)"),
                        WordToken("看", "kàn", "to see; to look at / to read / to watch / to visit; to call on / to consider; to regard as / to look after / to treat (a patient or illness) / to depend on / to feel (that) / (after a verb) to give it a try / to watch out for", "Kosakata HSK 2: 看 (kàn)"),
                        WordToken("完", "wán", "to finish / to be over", "Kosakata HSK 2: 完 (wán)"),
                        WordToken("试卷", "shì juàn", "examination paper / test paper", "Kosakata HSK 2: 试卷 (shì juàn)"),
                        WordToken("后", "hòu", "afterwards / after", "Kosakata HSK 2: 后 (hòu)"),
                        WordToken("说", "shuō", "to speak; to talk; to say", "Kosakata HSK 2: 说 (shuō)"),
                        WordToken("虽然", "suī rán", "although; even though", "Kosakata HSK 2: 虽然 (suī rán)"),
                        WordToken("你", "nǐ", "you", "Kosakata HSK 2: 你 (nǐ)"),
                        WordToken("考", "kǎo", "to check / to verify / to test / to examine / to take an exam / to take an entrance exam for", "Kosakata HSK 2: 考 (kǎo)"),
                        WordToken("得", "de", "structural particle: used after a verb (or adjective as main verb), linking it to following phrase indicating effect, degree, possibility etc", "Kosakata HSK 2: 得 (de)"),
                        WordToken("很", "hěn", "very; quite", "Kosakata HSK 2: 很 (hěn)"),
                        WordToken("差", "chà", "different / wrong; mistaken / not up to standard; inferior", "Kosakata HSK 2: 差 (chà)"),
                        WordToken("但是", "dàn shì", "but; however", "Kosakata HSK 2: 但是 (dàn shì)"),
                        WordToken("看", "kàn", "to see; to look at / to read / to watch / to visit; to call on / to consider; to regard as / to look after / to treat (a patient or illness) / to depend on / to feel (that) / (after a verb) to give it a try / to watch out for", "Kosakata HSK 2: 看 (kàn)"),
                        WordToken("到", "dào", "to reach; to arrive / to (a place); until (a time); up to (a point) / (verb complement indicating arriving at a place or reaching a point)", "Kosakata HSK 2: 到 (dào)"),
                        WordToken("你", "nǐ", "you", "Kosakata HSK 2: 你 (nǐ)"),
                        WordToken("的", "de", "possessive particle (of; 's) / modifying particle (used after an attribute to modify a noun or to form a nominal expression)", "Kosakata HSK 2: 的 (de)"),
                        WordToken("成绩", "chéng jì", "achievement / performance records / grades", "Kosakata HSK 2: 成绩 (chéng jì)"),
                        WordToken("有", "yǒu", "to have; there is", "Kosakata HSK 2: 有 (yǒu)"),
                        WordToken("一", "yī", "one / single / a (article)", "Kosakata HSK 2: 一 (yī)"),
                        WordToken("点", "diǎn", "a small amount; a bit; (after a verb or adjective) a bit more", "Kosakata HSK 2: 点 (diǎn)"),
                        WordToken("我", "wǒ", "I; me; my", "Kosakata HSK 2: 我 (wǒ)"),
                        WordToken("可以", "kě yǐ", "can / may / possible / able to", "Kosakata HSK 2: 可以 (kě yǐ)"),
                        WordToken("相信", "xiāng xìn", "to believe; to be convinced; to accept as true", "Kosakata HSK 2: 相信 (xiāng xìn)"),
                        WordToken("就", "jiù", "merely; nothing else but; simply; just; precisely; exactly", "Kosakata HSK 2: 就 (jiù)"),
                        WordToken("是", "shì", "indeed (used for emphasis)", "Kosakata HSK 2: 是 (shì)"),
                        WordToken("你", "nǐ", "you", "Kosakata HSK 2: 你 (nǐ)"),
                        WordToken("考试", "kǎo shì", "to take an exam", "Kosakata HSK 2: 考试 (kǎo shì)"),
                        WordToken("的", "de", "possessive particle (of; 's) / modifying particle (used after an attribute to modify a noun or to form a nominal expression)", "Kosakata HSK 2: 的 (de)"),
                        WordToken("时候", "shí hou", "time / length of time / moment / period", "Kosakata HSK 2: 时候 (shí hou)"),
                        WordToken("没有", "méi yǒu", "haven't / hasn't", "Kosakata HSK 2: 没有 (méi yǒu)"),
                        WordToken("看", "kàn", "to see; to look at / to read / to watch / to visit; to call on / to consider; to regard as / to look after / to treat (a patient or illness) / to depend on / to feel (that) / (after a verb) to give it a try / to watch out for", "Kosakata HSK 2: 看 (kàn)"),
                        WordToken("别人", "bié rén", "other people; others; other person", "Kosakata HSK 2: 别人 (bié rén)")
                    )
                ),
                Sentence(
                    id = "s_outsight_4",
                    hanzi = "儿子回答：”不是没有看，是看不到！\"",
                    pinyin = "ér zi huí dá bù shì méi yǒu kàn shì kàn bù dào",
                    translation = "Sang anak dengan polos dan gugup menjawab: “Bukannya aku tidak mau menyontek, Ayah... tapi tempat duduknya terlalu jauh sehingga tidak kelihatan!”",
                    tokens = listOf(
                        WordToken("儿子", "ér zi", "son", "Kosakata HSK 2: 儿子 (ér zi)"),
                        WordToken("回答", "huí dá", "to reply; to answer / reply; answer", "Kosakata HSK 2: 回答 (huí dá)"),
                        WordToken("不", "bù", "no; not so", "Kosakata HSK 2: 不 (bù)"),
                        WordToken("是", "shì", "indeed (used for emphasis)", "Kosakata HSK 2: 是 (shì)"),
                        WordToken("没有", "méi yǒu", "haven't / hasn't", "Kosakata HSK 2: 没有 (méi yǒu)"),
                        WordToken("看", "kàn", "to see; to look at / to read / to watch / to visit; to call on / to consider; to regard as / to look after / to treat (a patient or illness) / to depend on / to feel (that) / (after a verb) to give it a try / to watch out for", "Kosakata HSK 2: 看 (kàn)"),
                        WordToken("是", "shì", "indeed (used for emphasis)", "Kosakata HSK 2: 是 (shì)"),
                        WordToken("看", "kàn", "to see; to look at / to read / to watch / to visit; to call on / to consider; to regard as / to look after / to treat (a patient or illness) / to depend on / to feel (that) / (after a verb) to give it a try / to watch out for", "Kosakata HSK 2: 看 (kàn)"),
                        WordToken("不", "bù", "no; not so", "Kosakata HSK 2: 不 (bù)"),
                        WordToken("到", "dào", "to reach; to arrive / to (a place); until (a time); up to (a point) / (verb complement indicating arriving at a place or reaching a point)", "Kosakata HSK 2: 到 (dào)")
                    )
                )
            ),
            questions = listOf(
                StoryQuestion(
                    id = "q_outsight_1",
                    questionText = "儿子数学考试只考了59分，把试卷交给爸爸时心理状态如何？ (Bagaimana perasaan sang anak saat menyerahkan kertas ujian bernilai 59 kepada ayahnya?)",
                    options = listOf("非常骄傲自豪 (Sangat bangga dan jemawa)", "非常害怕紧张，担心挨爸爸的打骂 (Sangat takut dan tegang, khawatir dimarahi atau dipukul ayah)", "无所谓 (Sangat cuek)", "高兴地跳舞 (Menari gembira)"),
                    correctAnswerIndex = 1,
                    explanation = "Nilai 59 adalah nilai merah di bawah batas lulus 60, sehingga anak gemetar ketakutan."
                ),
                StoryQuestion(
                    id = "q_outsight_2",
                    questionText = "出乎意料的是，爸爸看完试卷后竟然对儿子有什么赞扬之意？ (Secara tak terduga, pujian apa yang diutarakan ayah setelah menatap hasil ujian itu?)",
                    options = listOf("赞扬儿子字迹工整 (Memuji tulisan tangan anaknya yang rapi)", "相信儿子在考试时保持诚信，没有偷看别人的试卷作弊 (Percaya bahwa anaknya jujur dan tidak menyontek lembar jawaban murid lain)", "赞扬儿子考及格了 (Memuji bahwa nilainya lulus)", "赞扬儿子答题速度最快 (Memuji kecepatan mengerjakan soal)"),
                    correctAnswerIndex = 1,
                    explanation = "Ayah mengira nilai jelek tersebut adalah bukti kejujuran murni anak yang tidak menyontek teman."
                ),
                StoryQuestion(
                    id = "q_outsight_3",
                    questionText = "儿子面对父亲的赞扬，脱口而出的真心话是什么？ (Jawaban jujur apa yang terlontar polos dari mulut sang anak menanggapi pujian ayah?)",
                    options = listOf("“我很诚实” (Saya anak yang sangat jujur)", "“不是我不想看，而是距离太远根本看不到！” (Bukan tidak mau melihat, tapi tempat duduknya terlalu jauh jadi tidak kelihatan!)", "“我下次一定考第一” (Lain kali saya pasti juara satu)", "“我忘记戴眼镜了” (Saya lupa membawa kacamata)"),
                    correctAnswerIndex = 1,
                    explanation = "Sang anak membongkar rahasianya sendiri: niat menyontek ada, hanya saja matanya tak mampu menjangkau!"
                ),
                StoryQuestion(
                    id = "q_outsight_4",
                    questionText = "这个小幽默反映了家庭教育中关于“诚实”与“分数”的什么现实？ (Refleksi pendidikan keluarga apa yang tersirat dari humor nilai 59 ini?)",
                    options = listOf("只要不被抓到作弊就是好学生 (Asal tidak ketahuan menyontek berarti murid teladan)", "孩子往往迫于高压才试图作弊，需要父母理性的引导而非单纯的恐惧威慑 (Tekanan nilai membuat anak berniat curang, membutuhkan bimbingan empati bukan sekadar ancaman hukuman)", "考试59分比100分更值得夸奖 (Nilai 59 lebih pantas dipuji daripada 100)", "近视眼更适合考试 (Mata minus lebih cocok saat ujian)"),
                    correctAnswerIndex = 1,
                    explanation = "Kepolosan anak mengingatkan pentingnya menanamkan integritas moral sejati tanpa tekanan berlebihan."
                )
            )
        )
    )
}
