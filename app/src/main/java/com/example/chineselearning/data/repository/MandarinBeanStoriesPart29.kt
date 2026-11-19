package com.example.chineselearning.data.repository

import com.example.chineselearning.R
import com.example.chineselearning.data.model.Sentence
import com.example.chineselearning.data.model.Story
import com.example.chineselearning.data.model.StoryQuestion
import com.example.chineselearning.data.model.WordToken

val mandarinBeanStoriesPart29: List<Story> by lazy {
    listOf(
        // Cerita Mandarin Bean 304 (HSK 3): Stupid Question (Jangan Tanya Pertanyaan Konyol)
        Story(
            id = "story_stupid_question",
            titleHanzi = "别问愚蠢的问题",
            titlePinyin = "Bié Wèn Yúchǔn de Wèntí",
            titleTranslation = "Stupid Question (Hargai Perasaan Anak Kecil)",
            level = "HSK 3",
            category = "Keluarga & Psikologi Anak",
            description = "Banyak orang dewasa gemar menggoda anak dengan pertanyaan buntu: 'Kamu lebih sayang papa atau mama?'. Pertanyaan ini membuat anak serba salah dan menyakiti keharmonisan orang tua.",
            coverEmoji = "👶",
            coverImageRes = R.drawable.cover_story_stupid_question,
            estimatedReadMinutes = 1,
            sentences = listOf(
                Sentence(
                    id = "s_stpqts_1",
                    hanzi = "许多大人在逗弄幼童时总偏爱提出令人左右为难的棘手问题，例如：“你更爱爸爸还是妈妈？”这实则是一个极度愚蠢的问题。",
                    pinyin = "xǔ duō dà ren zài dòu nòng yòu tóng shí zǒng piān ài tí chū lìng rén zuǒ yòu wéi nán de jí shǒu wèn tí lì rú nǐ gèng ài bà ba hái shi mā ma zhè shí zé shì yī gè fēi cháng yú chǔn de wèn tí",
                    translation = "Banyak orang dewasa saat menggoda anak kecil selalu suka menanyakan pertanyaan yang sulit dijawab, misalnya: 'Kamu lebih sayang ayah atau ibu?'. Pertanyaan ini sesungguhnya adalah pertanyaan yang sangat konyol.",
                    tokens = listOf(
                        WordToken("小孩", "xiǎo hái", "child / kid", "Kosakata HSK 2: 孩子"),
                        WordToken("回答", "huí dá", "to answer / reply", "Kosakata HSK 3: 回答 (huí dá)"),
                        WordToken("愚蠢", "yú chǔn", "foolish / stupid", "Kosakata HSK 3: 愚蠢"),
                        WordToken("其实", "qí shí", "actually / in fact", "Kosakata HSK 3: 其实 (qí shí)")
                    )
                ),
                Sentence(
                    id = "s_stpqts_2",
                    hanzi = "世间孩童皆全心深爱自己的生身父母，双亲之爱浑然一体原本无需高下攀比；此类强行比较不仅令纯真孩童进退失据陷入为难，更极易无端刺伤父母之间的温情信任。",
                    pinyin = "shì jiān hái tóng jiē quán xīn shēn ài zì jǐ de shēng shēn fù mǔ shuāng qīn zhī ài hún rán yī tǐ yuán běn wú xū gāo xià pān bǐ cǐ lèi qiáng xíng bǐ jiào bù jǐn lìng chún zhēn hái tóng jìn tuì shī jù xiàn rù wéi nán gèng jí yì wú duān cì shāng fù mǔ zhī jiān de wēn qíng xìn rèn",
                    translation = "Setiap anak menyayangi kedua orang tuanya tanpa perlu dibanding-bandingkan; pembandingan semacam ini tidak hanya membuat anak merasa serba salah, melainkan juga melukai keharmonisan dan perasaan orang tua.",
                    tokens = listOf(
                        WordToken("比较", "bǐ jiào", "to compare / comparison", "Kosakata HSK 3: 比较 (bǐ jiào)"),
                        WordToken("为难", "wéi nán", "feel awkward / in a dilemma", "Kosakata HSK 3: 为难"),
                        WordToken("伤害", "shāng hài", "to hurt / harm", "Kosakata HSK 3: 伤害 (shāng hài)"),
                        WordToken("感情", "gǎn qíng", "emotion / feelings", "Kosakata HSK 3: 感情 (gǎn qíng)")
                    )
                ),
                Sentence(
                    id = "s_stpqts_3",
                    hanzi = "诚挚呼吁全社会停止抛出此类缺乏同理心的荒唐问话，学会以真诚平等的身段尊重稚子幼童的心灵天地。",
                    pinyin = "chéng zhì hū yù quán shè huì tíng zhǐ pāo chū cǐ lèi quē fá tóng lǐ xīn de huāng táng wèn huà xué huì yǐ zhēn chéng píng děng de shēn duàn zūn zhòng zhì zǐ yòu tóng de xīn líng tiān dì",
                    translation = "Marilah kita berhenti melontarkan pertanyaan-pertanyaan konyol seperti ini, dan belajarlah untuk senantiasa menghargai perasaan serta martabat anak-anak dengan tulus.",
                    tokens = listOf(
                        WordToken("不要", "bù yào", "do not", "Kosakata HSK 1: 不要 (bù yào)"),
                        WordToken("总是", "zǒng shì", "always", "Kosakata HSK 3: 总是 (zǒng shì)"),
                        WordToken("尊重", "zūn zhòng", "to respect", "Kosakata HSK 3: 尊重 (zūn zhòng)")
                    )
                )
            ),
            questions = listOf(
                StoryQuestion(
                    id = "q_stpqts_1",
                    questionText = "文章开篇直言不讳地将哪句大人们在逗小孩时常挂在嘴边的问话斥责为“非常愚蠢的问题”？ (Pertanyaan klise apa yang ditegur penulis sebagai pertanyaan yang konyol saat menggoda anak?)",
                    options = listOf("“你今天作业写完了吗？” (Sudah selesai PR belum?)", "“你更爱爸爸还是妈妈？” (Kamu lebih sayang papa atau mama?)", "“你喜欢吃苹果吗？” (Suka makan apel?)", "“你长大了想当什么？” (Mau jadi apa kalau besar?)"),
                    correctAnswerIndex = 1,
                    explanation = "Teks menyatakan: '很多人逗小孩的时候总是喜欢问他们一些很难回答的问题，比如：你更爱爸爸还是妈妈？这其实是一个非常愚蠢的问题'."
                ),
                StoryQuestion(
                    id = "q_stpqts_2",
                    questionText = "强迫年幼的孩子在父母亲情之间分出高下，往往会带来哪些负面心理与家庭伤害？ (Dampak negatif apa yang timbul bila anak dipaksa memilih antara ayah dan ibu?)",
                    options = listOf("孩子会变得越来越聪明 (Anak makin pintar)", "不仅让懵懂的孩子陷入两难尴尬境地，还极易无形中挑拨伤害父母之间的深厚感情 (Membuat anak serba salah dan melukai keharmonisan orang tua)", "孩子的身高停止生长 (Tinggi badan berhenti)", "孩子会立刻不吃晚饭 (Anak mogok makan)"),
                    correctAnswerIndex = 1,
                    explanation = "Teks menjelaskan: '这样的比较不但会让孩子为难，也会伤害父母的感情'."
                ),
                StoryQuestion(
                    id = "q_stpqts_3",
                    questionText = "作者针对成年人与孩子的人际日常交往提出了怎样发人深省的倡议？ (Nasihat penting apa yang disampaikan penulis bagi orang dewasa dalam memperlakukan anak kecil?)",
                    options = listOf("不要总是问这些无聊愚蠢的问题，学会发自内心地尊重孩子 (Jangan sering bertanya konyol, belajarlah menghargai perasaan anak)", "每天给孩子买十个新玩具 (Belikan 10 mainan)", "绝对不要跟任何小孩说话 (Jangan bicara pada anak)", "让孩子提前进入大学读书 (Suruh anak cepat kuliah)"),
                    correctAnswerIndex = 0,
                    explanation = "Teks menyimpulkan: '所以，请大家不要总是问这些愚蠢的问题，要尊重孩子'."
                )
            )
        ),

        // Cerita Mandarin Bean 305 (HSK 3): Be late (Mimpi Nonton Sepak Bola)
        Story(
            id = "story_football_dream",
            titleHanzi = "做梦踢球迟到了",
            titlePinyin = "Zuòmèng Tīqiú Chídào Le",
            titleTranslation = "Be Late (Alasan Lucu: Mimpi Nonton Sepak Bola)",
            level = "HSK 3",
            category = "Cerita Lucu & Sekolah",
            description = "Xiao Ming datang terlambat ke kelas bahasa Mandarin; saat guru menanyakan alasannya, ia dengan polos beralasan semalam bermimpi menonton pertandingan sepak bola yang skornya imbang dan adu penalti lama.",
            coverEmoji = "⚽",
            coverImageRes = R.drawable.cover_story_football_dream,
            estimatedReadMinutes = 1,
            sentences = listOf(
                Sentence(
                    id = "s_ftbdrm_1",
                    hanzi = "顽皮小学生小明在中文课上气喘吁吁迟到了，向讲台上的中文老师深鞠一躬致歉：“对不起老师，我今天梦见了一场极其激烈的足球赛。”",
                    pinyin = "wán pí xiǎo xué shēng Xiǎo míng zài Zhōng wén kè shàng qì chuǎn xū xū chí dào le xiàng jiǎng tái shàng de Zhōng wén lǎo shī shēn jū yī gōng zhì qiàn duì bu qǐ lǎo shī wǒ jīn tiān mèng jiàn le yī chǎng jí qí jī liè de zú qiú sài",
                    translation = "Murid SD nakal, Xiao Ming, datang terengah-engah terlambat masuk kelas bahasa Mandarin; ia meminta maaf kepada gurunya: 'Maaf Guru, saya terlambat karena semalam bermimpi menonton laga sepak bola yang sangat sengit.'",
                    tokens = listOf(
                        WordToken("迟到", "chí dào", "to be late", "Kosakata HSK 3: 迟到 (chí dào)"),
                        WordToken("对不起", "duì bu qǐ", "sorry / excuse me", "Kosakata HSK 1: 对不起"),
                        WordToken("梦见", "mèng jiàn", "to dream of / see in a dream", "Kosakata HSK 3: 梦 (mèng)"),
                        WordToken("足球赛", "zú qiú sài", "football match / soccer game", "Kosakata olahraga")
                    )
                ),
                Sentence(
                    id = "s_ftbdrm_2",
                    hanzi = "老师闻言满脸惊诧困惑地反问：“做梦看球固然有趣，但这与你早晨上课迟到究竟有何必然干系？”",
                    pinyin = "lǎo shī wén yán mǎn liǎn jīng chà kùn huò de fǎn wèn zuò mèng kàn qiú gù rán yǒu qù dàn zhè yǔ nǐ zǎo chen shàng kè chí dào jiū jìng yǒu hé bì rán gān xì",
                    translation = "Sang guru mendengar alasannya dengan wajah heran lalu bertanya: 'Bermimpi menonton bola memang seru, tapi apa hubungannya mimpi itu sampai membuatmu telat masuk kelas pagi ini?'",
                    tokens = listOf(
                        WordToken("为什么", "wèi shén me", "why", "Kosakata HSK 2: 为什么 (wèi shén me)"),
                        WordToken("回答", "huí dá", "to reply / answer", "Kosakata HSK 3: 回答 (huí dá)")
                    )
                ),
                Sentence(
                    id = "s_ftbdrm_3",
                    hanzi = "小明一本正经振振有词答道：“因为两支球队势均力敌始终不分胜负，加时赛踢了漫长时间，所以我就在梦里看球看晚了！”",
                    pinyin = "Xiǎo míng yī běn zhèng jīng zhèn zhèn yǒu cí dá dào yīn wèi liǎng zhī qiú duì shì jūn lì dí shǐ zhōng bù fēn shèng fù jiā shí sài tī le màn cháng shí jiān suǒ yǐ wǒ jiù zài mèng lǐ kàn qiú kàn wǎn le",
                    translation = "Xiao Ming dengan wajah polos tanpa dosa menjawab: 'Karena kedua tim sama kuatnya dan tidak ada yang menang maupun kalah, mereka bermain perpanjangan waktu sangat lama, jadinya saya di dalam mimpi menontonnya sampai kesiangan!'",
                    tokens = listOf(
                        WordToken("队", "duì", "team", "Kosakata HSK 3: 队 (duì)"),
                        WordToken("不分胜负", "bù fēn shèng fù", "tied / unable to determine victor", "Istilah pertandingan"),
                        WordToken("踢", "tī", "to kick / play (soccer)", "Kosakata HSK 2: 踢足球"),
                        WordToken("长时间", "cháng shí jiān", "long time", "Kosakata HSK 2: 时间")
                    )
                )
            ),
            questions = listOf(
                StoryQuestion(
                    id = "q_ftbdrm_1",
                    questionText = "小明在中文课上气喘吁吁迟到后，向老师抛出的第一个荒唐借口是什么？ (Alasan konyol pertama apa yang dilontarkan Xiao Ming saat telat masuk kelas?)",
                    options = listOf("路上自行车爆胎 (Ban sepeda pecah)", "自己昨夜做梦梦见了一场足球赛 (Semalam ia bermimpi menonton pertandingan sepak bola)", "闹钟电池被老鼠咬断 (Baterai alarm digigit tikus)", "路上扶老奶奶过马路 (Menuntun nenek menyeberang)"),
                    correctAnswerIndex = 1,
                    explanation = "Teks menyatakan: '我对中文老师说：对不起，我迟到了，老师。我梦见了一场足球赛'."
                ),
                StoryQuestion(
                    id = "q_ftbdrm_2",
                    questionText = "当老师追问“梦见球赛与迟到有何关联”时，小明给出了怎样令人捧腹大笑的神奇逻辑？ (Logika jenaka apa yang dipakai Xiao Ming untuk menjelaskan hubungan mimpinya dengan keterlambatannya?)",
                    options = listOf("球赛裁判把红牌扔到了他头上 (Wasit melempar kartu merah)", "因为梦里的两支足球队势均力敌、不分胜负，加时赛踢了极长时间，导致自己在梦中看球看晚了起不来 (Karena kedua tim di mimpi sama kuat tak ada yang menang/kalah dan main perpanjangan waktu lama, ia keasyikan nonton di mimpi sampai kesiangan)", "足球赛门票太贵 (Tiket bola mahal)", "他梦见自己成了守门员扑救一百次 (Mimpi jadi kiper)"),
                    correctAnswerIndex = 1,
                    explanation = "Xiao Ming menjawab: '因为两个队不分胜负，所以踢了很长时间'."
                ),
                StoryQuestion(
                    id = "q_ftbdrm_3",
                    questionText = "这则幽默微型故事的喜剧张力主要来自小明将什么事物与现实混为一谈？ (Kelucuan cerita ini berasal dari tercampurnya hal apa dengan kenyataan?)",
                    options = listOf("把梦境中虚幻的球赛时长荒谬当作现实生活中上课迟到的正当理由 (Menjadikan durasi perpanjangan waktu pertandingan di alam mimpi sebagai alasan telat di dunia nyata)", "把语文老师当成了足球裁判 (Mengira guru wasit sepak bola)", "把教室当成了绿茵球场 (Mengira kelas stadion bola)", "把书包当成了足球 (Mengira ransel bola)"),
                    correctAnswerIndex = 0,
                    explanation = "Kejenakaannya adalah kepolosan anak yang menganggap durasi perpanjangan waktu pertandingan di dalam mimpinya berimbas nyata pada jam bangun tidurnya di pagi hari."
                )
            )
        ),

        // Cerita Mandarin Bean 306 (HSK 3): A Beautiful Word (Menemukan Kembali Kepercayaan Diri)
        Story(
            id = "story_beautiful_word",
            titleHanzi = "找回自信的凯丽",
            titlePinyin = "Zhǎohuí Zìxìn de Kǎilì",
            titleTranslation = "A Beautiful Word (Kasih Ayah & Pulihnya Kepercayaan Diri)",
            level = "HSK 3",
            category = "Pendidikan Jiwa & Kasih Keluarga",
            description = "Kelly, mahasiswi berprestasi yang mendadak minder dan terpuruk saat kuliah di Oxford; sang ayah diam-diam menyewa seseorang menobatkannya sebagai gadis tercantik di kelas demi membangkitkan rasa percaya dirinya.",
            coverEmoji = "🌟",
            coverImageRes = R.drawable.cover_story_beautiful_word,
            estimatedReadMinutes = 2,
            sentences = listOf(
                Sentence(
                    id = "s_btfwd_1",
                    hanzi = "牛津大学女孩凯丽入学前始终品学兼优，但进入顶级名校后深陷自卑泥潭成绩骤降为班级末流，并非她资智不足，实为自我怀疑击垮了心神。",
                    pinyin = "Niú jīn Dà xué nǚ hái Kǎi lì rù xué qián shǐ zhōng pǐn xué jiān yōu dàn jìn rù dǐng jí míng xiào hòu shēn xiàn zì bēi ní tán chéng jì zhòu jiàng wèi bān jí mò liú bìng fēi tā zī zhì bù zú shí wèi zì wǒ huái yí jī kuǎ le xīn shén",
                    translation = "Kelly, seorang mahasiswi di Universitas Oxford, selalu menjadi siswi teladan sebelum kuliah; namun setelah masuk Oxford ia merasa minder dan terpuruk menjadi mahasiswa terbawah di kelasnya, bukan karena ia tidak pintar, melainkan karena rasa rendah diri (zìbēi) yang mengikis jiwanya.",
                    tokens = listOf(
                        WordToken("聪明", "cōng míng", "clever / smart", "Kosakata HSK 2: 聪明 (cōng míng)"),
                        WordToken("努力", "nǔ lì", "diligent / hard-working", "Kosakata HSK 2: 努力 (nǔ lì)"),
                        WordToken("自卑", "zì bēi", "inferior / feel low self-esteem", "Kosakata psikologi HSK 3"),
                        WordToken("学生", "xué sheng", "student", "Kosakata HSK 1: 学生 (xué sheng)")
                    )
                ),
                Sentence(
                    id = "s_btfwd_2",
                    hanzi = "一日课堂上一位星探男子蓦然登门宣称要在全班物色形象代言人，环顾满堂才俊后，他神色坚定指向角落的凯丽：“正是她，她是我眼中最美丽的女孩！”",
                    pinyin = "yī rì kè táng shàng yī wèi xīng tàn nán zǐ mò rán dēng mén xuān chēng yào zài quán bān wù sè xíng xiàng dài yán rén huán gù mǎn táng cái jùn hòu tā shén sè jiān dìng zhǐ xiàng jiǎo luò de Kǎi lì zhèng shì tā tā shì wǒ yǎn zhōng zuì měi lì de nǚ hái",
                    translation = "Suatu hari di tengah jam kuliah, seorang pria masuk ke kelas dan mengumumkan sedang mencari gadis tercantik di kelas untuk menjadi duta citra perusahaannya; setelah memandang seisi kelas, ia menunjuk ke arah Kelly: 'Dialah orangnya, ia adalah gadis paling cantik di mata saya!'",
                    tokens = listOf(
                        WordToken("漂亮", "piào liang", "pretty / beautiful", "Kosakata HSK 1: 漂亮 (piào liang)"),
                        WordToken("代言人", "dài yán rén", "spokesperson / ambassador", "Istilah periklanan"),
                        WordToken("美丽", "měi lì", "beautiful", "Kosakata HSK 3: 美丽 (měi lì)")
                    )
                ),
                Sentence(
                    id = "s_btfwd_3",
                    hanzi = "原来这位“星探”实为关爱备至的老父亲暗中托请的演员，旨在用一句真挚赞美驱散女儿的心魔；从此凯丽重拾自信容光焕发，再度跃升为顶尖学霸。",
                    pinyin = "yuán lái zhè wèi xīng tàn shí wèi guān ài bèi zhì de lǎo fù qīn àn zhōng tuō qǐng de yǎn yuán zhǐ zài yòng yī jù zhēn zhì zàn měi qū sàn nǚ ér de xīn mó cóng cǐ Kǎi lì chóng shí zì xìn róng guāng huàn fā zài dù yuè shēng wèi dǐng jiān xué bà",
                    translation = "Rupanya pria pencari bakat itu adalah seseorang yang sengaja disewa oleh sang ayah demi memulihkan rasa percaya diri putrinya; semenjak hari itu Kelly kembali memancarkan kepercayaan diri (zìxìn) dan sukses menjadi mahasiswi yang sangat berprestasi.",
                    tokens = listOf(
                        WordToken("父亲", "fù qīn", "father", "Kosakata HSK 3: 父亲 (fù qīn)"),
                        WordToken("自信", "zì xìn", "confidence / self-confident", "Kosakata HSK 3: 自信 (zì xìn)"),
                        WordToken("从此", "cóng cǐ", "from then on", "Kosakata HSK 3: 从此 (cóng cǐ)"),
                        WordToken("优秀", "yōu xiù", "outstanding / excellent", "Kosakata HSK 3: 优秀 (yōu xiù)")
                    )
                )
            ),
            questions = listOf(
                StoryQuestion(
                    id = "q_btfwd_1",
                    questionText = "原本一直品学兼优的女孩凯丽，在进入世界名校牛津大学后成绩沦为末流的最根本心理心结是什么？ (Apa penyebab mendasar mengapa prestasi Kelly anjlok setelah masuk Universitas Oxford?)",
                    options = listOf("每天沉迷电脑游戏 (Kecanduan game)", "并非不够聪明或不用功，而是陷入了严重的自我怀疑与内心自卑 (Bukan karena bodoh atau malas, melainkan terpuruk dalam rasa minder dan rendah diri / zìbēi)", "遭遇了车祸 (Mengalami kecelakaan)", "选错了全英文专业 (Salah jurusan)"),
                    correctAnswerIndex = 1,
                    explanation = "Teks menyatakan: '其实，并不是凯丽不聪明，也不是她不努力，而是她太自卑了'."
                ),
                StoryQuestion(
                    id = "q_btfwd_2",
                    questionText = "课堂上那位推门而入宣称要在班里寻找“最美女孩做公司代言人”并当众盛赞凯丽的神秘男士，其真实身份背景是什么？ (Siapa sebenarnya sosok pria misterius yang masuk ke kelas dan memuji Kelly?)",
                    options = listOf("好莱坞知名大导演 (Sutradara Hollywood)", "凯丽的慈爱父亲为了帮女儿打破心魔、重塑自信而特意托请雇佣的人 (Seseorang yang khusus disewa oleh ayah Kelly demi membangkitkan kembali rasa percaya diri sang putri)", "牛津大学新上任的校长 (Rektor baru Oxford)", "大商场的推销员 (Sales mall)"),
                    correctAnswerIndex = 1,
                    explanation = "Teks mengungkapkan rahasia kasih orang tua: '其实，这个人是凯丽的父亲找来的，为的是帮助凯丽找回自信'."
                ),
                StoryQuestion(
                    id = "q_btfwd_3",
                    questionText = "在收获了那句珍贵真挚的认可赞美之后，凯丽的人生精神面貌发生了怎样脱胎换骨的蜕变？ (Perubahan positif apa yang dialami Kelly setelah mendapatkan pujian berharga tersebut?)",
                    options = listOf("立刻退学去当职业模特 (Putus kuliah jadi model)", "彻底找回了宝贵的自信心，重新奋发图强并再度成为了一名极为优秀的好学生 (Memperoleh kembali rasa percaya diri dan kembali menjadi mahasiswi teladan berprestasi)", "变得目中无人狂妄自大 (Menjadi sombong)", "拒绝去图书馆看书 (Menolak ke perpustakaan)"),
                    correctAnswerIndex = 1,
                    explanation = "Teks menyimpulkan: '从此，凯丽又有了自信，并成为了一个优秀的学生'."
                )
            )
        ),

        // Cerita Mandarin Bean 307 (HSK 3): Three Doctoral Brothers (Tiga Saudara Doktor Memasak Mi)
        Story(
            id = "story_three_doctors",
            titleHanzi = "三个博士兄弟煮面",
            titlePinyin = "Sān Gè Bóshì Xiōngdì Zhǔ Miàn",
            titleTranslation = "Three Doctoral Brothers (Tiga Saudara Doktor & Semangkuk Mi)",
            level = "HSK 3",
            category = "Keluarga & Nilai Kehidupan",
            description = "Tiga bersaudara peneliti luar angkasa bergelar doktor membuat para istri minder saat berdiskusi; sang ibu menenangkan menantunya dengan kisah masa lalu ketiga doktor butuh 2 jam hanya untuk memasak semangkuk mi yang gagal.",
            coverEmoji = "👨‍🔬",
            coverImageRes = R.drawable.cover_story_three_doctors,
            estimatedReadMinutes = 2,
            sentences = listOf(
                Sentence(
                    id = "s_thrdoc_1",
                    hanzi = "一家三兄弟皆是高精尖太空天体物理领域的顶尖博士，餐后聚首家中便激烈高深地研讨起常人难以企及的深奥宇宙学术课题。",
                    pinyin = "yī jiā sān xiōng dì jiē shì gāo jīng jiān tài kōng tiān tǐ wù lǐ lǐng yù de dǐng jiān bó shì cān hòu jù shǒu jiā zhōng biàn jī liè gāo shēn de yán tǎo qǐ cháng rén nán yǐ qǐ jí de shēn ào yǔ zhòu xué shù kè tí",
                    translation = "Tiga bersaudara dalam sebuah keluarga semuanya meraih gelar doktor (bóshì) dan bekerja di bidang penelitian luar angkasa; seusai makan malam di rumah ibu, mereka asyik mendiskusikan topik sains antariksa yang amat rumit.",
                    tokens = listOf(
                        WordToken("兄弟", "xiōng dì", "brothers", "Kosakata HSK 3: 兄弟 (xiōng dì)"),
                        WordToken("博士", "bó shì", "doctorate / Ph.D.", "Kosakata HSK 3: 博士 (bó shì)"),
                        WordToken("太空", "tài kōng", "outer space", "Kosakata HSK 3: 太空"),
                        WordToken("研究", "yán jiū", "research / study", "Kosakata HSK 3: 研究 (yán jiū)")
                    )
                ),
                Sentence(
                    id = "s_thrdoc_2",
                    hanzi = "厨房洗碗的妯娌们面对天书般的对话深感自惭形秽自叹愚笨，慈祥睿智的婆婆见状娓娓道出一桩令人绝倒的家庭旧闻。",
                    pinyin = "chú fáng xǐ wǎn de zhóu li men miàn duì tiān shū bān de duì huà shēn gǎn zì cán xíng huì zì tàn yú bèn cí xiáng ruì zhì de pó po jiàn zhuàng wěi wěi dào chū yī zhuāng lìng rén jué dǎo de jiā tíng jiù wén",
                    translation = "Para istri yang sedang mencuci piring di dapur bersama sang ibu merasa minder dan merasa diri mereka bodoh mendengar perbincangan ilmiah tersebut; sang ibu mertua yang bijak lantas membagikan sebuah cerita masa lalu yang mengocok perut.",
                    tokens = listOf(
                        WordToken("妻子", "qī zi", "wife", "Kosakata HSK 2: 妻子 (qī zi)"),
                        WordToken("厨房", "chú fáng", "kitchen", "Kosakata HSK 3: 厨房 (chú fáng)"),
                        WordToken("笨", "bèn", "stupid / clumsy", "Kosakata HSK 3: 笨 (bèn)"),
                        WordToken("恢复", "huī fù", "to restore / recover", "Kosakata HSK 3: 恢复 (huī fù)")
                    )
                ),
                Sentence(
                    id = "s_thrdoc_3",
                    hanzi = "原来这三位能算天体的学者曾合力苦战整整两个小时，才折腾出一碗难以下咽的半生面条；尺有所短寸有所长，各展所长方是真谛。",
                    pinyin = "yuán lái zhè sān wèi néng suàn tiān tǐ de xué zhě céng hé lì kǔ zhàn zhěng zhěng liǎng gè xiǎo shí cái zhē teng chū yī wǎn nán yǐ xià yān de bàn shēng miàn tiáo chǐ yǒu suǒ duǎn cùn yǒu suǒ cháng gè zhǎn suǒ cháng fāng shì zhēn dì",
                    translation = "Rupanya ketiga ilmuwan antariksa itu dulu pernah menghabiskan waktu dua jam penuh hanya untuk memasak semangkuk mi yang rasanya sangat tidak enak; dari situ sang ibu menyadarkan bahwa setiap orang memiliki kelebihan (*chángchù*) dan kekurangan (*duǎnchù*) masing-masing.",
                    tokens = listOf(
                        WordToken("面条", "miàn tiáo", "noodles", "Kosakata HSK 2: 面条 (miàn tiáo)"),
                        WordToken("长处", "cháng chù", "strength / strong point", "Kosakata HSK 3: 长处"),
                        WordToken("短处", "duǎn chù", "shortcoming / weak point", "Kosakata HSK 3: 短处")
                    )
                )
            ),
            questions = listOf(
                StoryQuestion(
                    id = "q_thrdoc_1",
                    questionText = "家庭聚餐时，为什么三位儿媳在厨房洗碗时会产生“觉得自己很笨”的严重挫败感？ (Mengapa para menantu merasa minder dan merasa diri mereka bodoh di dapur?)",
                    options = listOf("她们洗坏了珍贵的古董瓷碗 (Memecahkan piring antik)", "听见三位身为太空研究博士的丈夫在客厅讨论常人完全听不懂的高深专业理论 (Mendengar ketiga suami bergelar doktor antariksa berdiskusi teori ilmiah rumit yang tak mereka pahami)", "婆婆严厉批评了她们的厨艺 (Dimarahi mertua)", "她们没有考取驾照 (Tidak punya SIM)"),
                    correctAnswerIndex = 1,
                    explanation = "Teks menyatakan: '其中一个妻子说：他们讨论的事是我完全不懂的，听着会让我觉得自己很笨'."
                ),
                StoryQuestion(
                    id = "q_thrdoc_2",
                    questionText = "老母亲为了帮助儿媳们重塑自信、破除对名牌博士的光环盲从，讲述了这三兄弟早年的什么滑稽糗事？ (Kisah konyol apa yang diceritakan sang ibu demi memulihkan kepercayaan diri para menantu?)",
                    options = listOf("三兄弟出门迷路走了一星期 (Tersesat seminggu)", "这三位看似高深莫测的博士曾经在厨房折腾了整整两小时，才煮出一碗极其难吃的面条 (Ketiga doktor itu pernah butuh 2 jam hanya untuk memasak semangkuk mi yang sangat tidak enak)", "他们三个人都不会骑自行车 (Tak bisa naik sepeda)", "三兄弟经常把衣服穿反 (Sering pakai baju terbalik)"),
                    correctAnswerIndex = 1,
                    explanation = "Teks menjelaskan: '可是有一次，他们花了两个小时才做了一碗非常不好吃的面条。从那以后，我就不再那么想了'."
                ),
                StoryQuestion(
                    id = "q_thrdoc_3",
                    questionText = "老母亲在故事尾声向大家阐述的富有普世智慧的人性格言是什么？ (Pesan kebijaksanaan universal apa yang disampaikan sang ibu mertua?)",
                    options = listOf("学历高的人生活技能必然最差 (Gelar tinggi pasti tak bisa hidup)", "每个人都有自己的长处和短处，尺有所短寸有所长，不必妄自菲薄 (Setiap manusia memiliki kelebihan / chángchù dan kekurangan / duǎnchù masing-masing)", "只有学会做饭才能当科学家 (Hanya yang bisa masak boleh jadi ilmuwan)", "所有的学术研究都是毫无意义的 (Riset tidak berguna)"),
                    correctAnswerIndex = 1,
                    explanation = "Teks menyimpulkan: '因为每个人都有自己的长处和短处' (Karena setiap orang memiliki kelebihan dan kekurangannya masing-masing)."
                )
            )
        ),

        // Cerita Mandarin Bean 308 (HSK 3): Please Take the First Step (Melangkahlah pada Langkah Pertama)
        Story(
            id = "story_take_first_step",
            titleHanzi = "请迈出第一步",
            titlePinyin = "Qǐng Màichū Dì Yī Bù",
            titleTranslation = "Please Take the First Step (Melangkahlah pada Langkah Pertama)",
            level = "HSK 3",
            category = "Filsafat & Motivasi Hidup",
            description = "Fabel filosofis tentang seseorang yang ingin pergi ke kota indah yang sangat dekat (hanya 1 jam jalan kaki), tetapi selalu menunda-nunda dan tak pernah melangkah hingga seumur hidup tak pernah sampai.",
            coverEmoji = "👣",
            coverImageRes = R.drawable.cover_story_take_first_step,
            estimatedReadMinutes = 2,
            sentences = listOf(
                Sentence(
                    id = "s_tkfstp_1",
                    hanzi = "有位旅人夙愿前往一座风光旖旎的名城，该城近在咫尺徒步仅需一小时，正因路途太近他反而毫不紧迫、迟迟不肯启程。",
                    pinyin = "yǒu wèi lǚ rén sù yuàn qián wǎng yī zuò fēng guāng yǐ nǐ de míng chéng gāi chéng jìn zài zhǐ chǐ tú bù jǐn xū yī xiǎo shí zhèng yīn lù tú tài jìn tā fǎn ér háo bù jǐn pò chí chí bù kěn qǐ chéng",
                    translation = "Ada seseorang yang ingin pergi ke sebuah kota indah; kota itu sangat dekat dan hanya membutuhkan waktu satu jam jalan kaki, namun justru karena terlalu dekat ia tidak terburu-buru dan enggan melangkahkan kaki pertamanya.",
                    tokens = listOf(
                        WordToken("美丽", "měi lì", "beautiful", "Kosakata HSK 3: 美丽 (měi lì)"),
                        WordToken("城市", "chéng shì", "city", "Kosakata HSK 2: 城市 (chéng shì)"),
                        WordToken("愿意", "yuàn yì", "willing to", "Kosakata HSK 2: 愿意 (yuàn yì)"),
                        WordToken("第一步", "dì yī bù", "first step", "Kosakata HSK 2: 第一")
                    )
                ),
                Sentence(
                    id = "s_tkfstp_2",
                    hanzi = "他每日忙于品茗闲谈、看电视听音乐，琐事纷繁借口连篇；每当偶发启程决心，又心存侥幸自我宽慰：“反正须臾可达，何须匆忙”。",
                    pinyin = "tā měi rì máng yú pǐn míng xián tán kàn diàn shì tīng yīn yuè suǒ shì fēn fán jiè kǒu lián piān měi dāng ǒu fā qǐ chéng jué xīn yòu xīn cún jiǎo xìng zì wǒ kuān wèi fǎn zhèng xū yú kě dá hé xū cōng máng",
                    translation = "Setiap hari ia sibuk minum teh, menonton TV, dan mendengarkan musik; urusannya selalu terasa banyak; setiap kali hendak bertekad melangkah, ia kembali menghibur diri: 'Toh cuma satu jam saja sudah sampai, santai saja lah.'",
                    tokens = listOf(
                        WordToken("总之", "zǒng zhī", "in short / in a word", "Kosakata HSK 3: 总之 (zǒng zhī)"),
                        WordToken("下决心", "xià jué xīn", "make up one's mind", "Kosakata HSK 3: 决定"),
                        WordToken("安慰", "ān wèi", "to comfort / console", "Kosakata HSK 3: 安慰 (ān wèi)"),
                        WordToken("反正", "fǎn zhèng", "anyway / in any case", "Kosakata HSK 3: 反正 (fǎn zhèng)")
                    )
                ),
                Sentence(
                    id = "s_tkfstp_3",
                    hanzi = "韶华易逝岁月蹉跎，终其一生他竟从未抵达咫尺之遥的胜景；世间万千宏愿若不毅然迈出破冰第一步，再近的彼岸亦是天涯绝壁！",
                    pinyin = "sháo huá yì shì suì yuè cuō tuó zhōng qí yī shēng tā jìng cóng wèi dǐ dá zhǐ chǐ zhī yáo de shèng jǐng shì jiān wàn qiān hóng yuàn ruò bù yì rán mài chū pò bīng dì yī bù zài jìn de bǐ àn yì shì tiān yá jué bì",
                    translation = "Waktu terus berlalu hingga usianya berakhir, dan seumur hidup ia sama sekali tak pernah sampai di kota impiannya; betapa pun dekatnya tujuan yang hendak kita capai, tanpa melangkahkan kaki pertama, ia tak akan pernah sampai selamanya!",
                    tokens = listOf(
                        WordToken("一生", "yī shēng", "all one's life / lifetime", "Kosakata HSK 3: 一生 (yī shēng)"),
                        WordToken("到达", "dào dá", "to arrive / reach", "Kosakata HSK 3: 到达 (dào dá)"),
                        WordToken("目的地", "mù dì dì", "destination", "Kosakata HSK 3: 目的地")
                    )
                )
            ),
            questions = listOf(
                StoryQuestion(
                    id = "q_tkfstp_1",
                    questionText = "故事中那个渴望去往美丽城市的人，其目的地距离他的出发地究竟有多远？ (Berapa jauh jarak kota indah impian tersebut dari tempat tinggalnya?)",
                    options = listOf("需要坐飞机跨越三大洋 (Harus naik pesawat seberang samudra)", "步行仅仅只需要一个小时即可到达（非常近） (Hanya butuh 1 jam jalan kaki - sangat dekat)", "需要徒步十年 (Butuh jalan kaki 10 tahun)", "隔着不可逾越的大沙漠 (Terhalang gurun pasir)"),
                    correctAnswerIndex = 1,
                    explanation = "Teks menyatakan: '那个城市很近，走路只要1个小时'."
                ),
                StoryQuestion(
                    id = "q_tkfstp_2",
                    questionText = "正是因为目的地近在咫尺，这个人在行动实践上陷入了怎样的心理误区？ (Kesalahan pola pikir apa yang dialami orang tersebut karena kotanya terlalu dekat?)",
                    options = listOf("以为城市已经沉入海底 (Mengira kotanya tenggelam)", "总觉得自己随时都能走到而丝毫不着急，终日借口忙于琐事而始终不愿迈出第一步 (Merasa bisa sampai kapan saja sehingga tak buru-buru, teralihkan hal sepele dan tak pernah melangkah)", "害怕走路磨破新鞋 (Takut sepatu rusak)", "因为城市里没有水喝 (Tak ada air minum)"),
                    correctAnswerIndex = 1,
                    explanation = "Teks menjelaskan: '正因为近，这个人就不着急，始终不愿意迈出第一步... 反正1个小时就到了，不用着急'."
                ),
                StoryQuestion(
                    id = "q_tkfstp_3",
                    questionText = "这则寓言故事最终向世人揭示了怎样发人深省的人生行动哲理？ (Pesan moral apa yang dipetik dari fabel filosofis ini?)",
                    options = listOf("只要目标足够近就可以永远躺在家里 (Boleh rebahan terus)", "千里之行始于足下，如果不愿切实迈出行动的第一步，目标哪怕近在眼前也一生无法抵达 (Tanpa melangkahkan langkah pertama, betapa pun dekatnya tujuan tak akan pernah tercapai seumur hidup)", "走路比坐车更健康 (Jalan kaki lebih sehat)", "美丽城市根本不值得去 (Kota indah tak layak dikunjungi)"),
                    correctAnswerIndex = 1,
                    explanation = "Teks menyimpulkan: '虽然那个美丽的城市很近，但是这个人一生都没能到达目的地。不迈出第一步，再近也到不了呀！'."
                )
            )
        ),

        // Cerita Mandarin Bean 309 (HSK 3): Ten Minutes of Life (Permainan 10 Menit Emas Kehidupan)
        Story(
            id = "story_ten_minutes_life",
            titleHanzi = "十分钟的人生游戏",
            titlePinyin = "Shí Fēnzhōng de Rénshēng Yóuxì",
            titleTranslation = "Ten Minutes of Life (Permainan Hidup 10 Menit: Waktu vs Emas)",
            level = "HSK 3",
            category = "Keluarga & Filosofi Waktu",
            description = "Permainan edukatif ayah dan anak: waktu 10 menit diibaratkan umur seumur hidup, anak berhasil mengumpulkan 10 kata emas dan menang, namun sang ayah menyadarkan bahwa waktu jauh lebih berharga daripada emas.",
            coverEmoji = "⏳",
            coverImageRes = R.drawable.cover_story_ten_minutes_life,
            estimatedReadMinutes = 2,
            sentences = listOf(
                Sentence(
                    id = "s_tenmlf_1",
                    hanzi = "父亲与幼子开展启发式竞赛：以十分钟沙漏象征人之一生，两人限时在书册中搜寻“黄金”二字，多者折桂获胜。",
                    pinyin = "fù qīn yǔ yòu zǐ kāi zhǎn qǐ fā shì jìng sài yǐ shí fēn zhōng shā lòu xiàng zhēng rén zhī yī shēng liǎng rén xiàn shí zài shū cè zhōng sōu xún huáng jīn èr zì duō zhě zhé guì huò shèng",
                    translation = "Seorang ayah mengajak putranya memainkan permainan edukatif: waktu 10 menit melambangkan kehidupan seseorang seumur hidup; dalam waktu 10 menit ini mereka berlomba mencari kata 'emas' (huángjīn) di dalam sebuah buku, siapa terbanyak dialah pemenangnya.",
                    tokens = listOf(
                        WordToken("游戏", "yóu xì", "game", "Kosakata HSK 3: 游戏 (yóu xì)"),
                        WordToken("代表", "dài biǎo", "to represent / stand for", "Kosakata HSK 3: 代表 (dài biǎo)"),
                        WordToken("一生", "yī shēng", "lifetime", "Kosakata HSK 3: 一生 (yī shēng)"),
                        WordToken("黄金", "huáng jīn", "gold", "Benda berharga: 黄金"),
                        WordToken("赢", "yíng", "to win", "Kosakata HSK 3: 赢 (yíng)")
                    )
                ),
                Sentence(
                    id = "s_tenmlf_2",
                    hanzi = "至九分钟时儿子心无旁骛搜得十处“黄金”，父亲仅得四处，胜券在握的儿子按捺不住满心雀跃宣告凯旋。",
                    pinyin = "zhì jiǔ fēn zhōng shí ér zi xīn wú páng wù sōu dé shí chù huáng jīn fù qīn jǐn dé sì chù shèng quàn zài wò de ér zi àn nà bù zhù mǎn xīn què yuè xuān gào kǎi xuán",
                    translation = "Saat menit ke-9 tiba, sang anak berhasil menemukan 10 kata 'emas', sedangkan sang ayah hanya menemukan 4 kata; sang anak pun bersorak girang merasa dirinya telah menang mutlak.",
                    tokens = listOf(
                        WordToken("一共", "yī gòng", "in total", "Kosakata HSK 2: 一共 (yī gòng)"),
                        WordToken("输", "shū", "to lose / defeated", "Kosakata HSK 3: 输 (shū)"),
                        WordToken("兴奋", "xīng fèn", "excited", "Kosakata HSK 3: 兴奋 (xīng fèn)"),
                        WordToken("承认", "chéng rèn", "to admit / acknowledge", "Kosakata HSK 3: 承认 (chéng rèn)")
                    )
                ),
                Sentence(
                    id = "s_tenmlf_3",
                    hanzi = "父亲平静指针点拨：九分四十秒已逝，一生行将落幕；虽坐拥万镒黄金却再无寸阴可供享用，光阴岁月实比真金更弥足珍贵！",
                    pinyin = "fù qīn píng jìng zhǐ zhēn diǎn bō jiǔ fēn sì shí miǎo yǐ shì yī shēng xíng jiāng luò mù suī zuò yōng wàn yì huáng jīn què zài wú cùn yīn kě gōng xiǎng yòng guāng yīn suì yuè shí bǐ zhēn jīn gèng mí zú zhēn guì",
                    translation = "Sang ayah menunjuk jarum jam dengan tenang: waktu sudah berjalan 9 menit 40 detik, kehidupan 10 menit ini akan segera berakhir; meskipun memiliki banyak emas, kamu sudah tidak memiliki waktu lagi untuk menikmatinya, sesungguhnya waktu jauh lebih berharga daripada emas!",
                    tokens = listOf(
                        WordToken("秒", "miǎo", "second (unit of time)", "Kosakata waktu: 秒"),
                        WordToken("享用", "xiǎng yòng", "to enjoy (use)", "Kosakata HSK 3: 享受"),
                        WordToken("宝贵", "bǎo guì", "valuable / precious", "Kosakata HSK 3: 宝贵 (bǎo guì)")
                    )
                )
            ),
            questions = listOf(
                StoryQuestion(
                    id = "q_tenmlf_1",
                    questionText = "在这场极具寓意的父子读书比赛中，父亲设定的“十分钟游戏时限”在现实隐喻中代表什么？ (Waktu permainan 10 menit yang ditetapkan sang ayah melambangkan apa?)",
                    options = listOf("一节数学课的时间 (Satu jam pelajaran matematika)", "一个人短暂而宝贵的“一生” (Kehidupan seseorang seumur hidup)", "煮一碗泡面的时间 (Waktu merebus mi)", "去超市购物的时间 (Waktu ke supermarket)"),
                    correctAnswerIndex = 1,
                    explanation = "Teks menyatakan: '10分钟代表一个人的一生'."
                ),
                StoryQuestion(
                    id = "q_tenmlf_2",
                    questionText = "在九分钟倒计时节点上，儿子凭借全神贯注的努力取得了怎样的战果？ (Hasil apa yang diperoleh sang anak pada menit ke-9?)",
                    options = listOf("一个黄金都没找到 (Tak nemu kata emas sama sekali)", "一共找到了10个“黄金”，以压倒性优势领先父亲的4个 (Menemukan 10 kata 'emas', unggul dari ayahnya yang cuma dapat 4)", "把整本书撕坏了 (Merobek buku)", "中途睡着了 (Tertidur)"),
                    correctAnswerIndex = 1,
                    explanation = "Teks mencatat: '9分钟的时候，儿子一共找到了10个，而父亲却只找到了4个。“爸爸，你输了。”儿子兴奋地说'."
                ),
                StoryQuestion(
                    id = "q_tenmlf_3",
                    questionText = "父亲在游戏临近尾声时，借着仅剩的20秒钟向儿子传递了哪记醍醐灌顶的人生真谛？ (Pelajaran hidup apa yang disampaikan sang ayah di 20 detik terakhir?)",
                    options = listOf("黄金越多越幸福 (Makin banyak emas makin bahagia)", "任凭你拥有再多黄金，若生命时间耗尽便无法享用，时间远比黄金更宝贵 (Betapa pun banyaknya emas, tanpa sisa waktu tak akan bisa dinikmati; waktu jauh lebih berharga daripada emas)", "看书的速度必须比别人快十倍 (Baca buku harus 10x lebih cepat)", "下次比赛谁先吃完饭 (Lomba makan)"),
                    correctAnswerIndex = 1,
                    explanation = "Teks menegaskan: '虽然你有很多黄金，但是你已经没有时间去享用了，其实时间比黄金更宝贵！'."
                )
            )
        ),

        // Cerita Mandarin Bean 310 (HSK 3): Borrow One Dollar (Orang Kaya yang Meminjam Satu Dolar di Bank)
        Story(
            id = "story_borrow_one_dollar",
            titleHanzi = "借一美元的聪明富翁",
            titlePinyin = "Jiè Yī Měiyuán de Cōngmíng Fùwēng",
            titleTranslation = "Borrow One Dollar (Trik Cerdas Meminjam Satu Dolar)",
            level = "HSK 3",
            category = "Finansial & Kecerdikan Hidup",
            description = "Seorang pria kaya mendatangi bank dan menjaminkan surat berharga senilai 500.000 USD hanya untuk meminjam uang 1 dolar; manajer bank heran, namun sang pria tersenyum mendapatkan brankas penitipan paling aman dan murah.",
            coverEmoji = "💵",
            coverImageRes = R.drawable.cover_story_borrow_one_dollar,
            estimatedReadMinutes = 2,
            sentences = listOf(
                Sentence(
                    id = "s_borodl_1",
                    hanzi = "一名着装考究的绅士步入华尔街银行借贷，经理热情声称只要出具足额资产担保并支付年息6%，额度上不封顶。",
                    pinyin = "yī míng zhuó zhuāng kǎo jiu de shēn shì bù rù Huá ěr jiē yín háng jiè dài jīng lǐ rè qíng shēng chēng zhǐ yào chū jù zú é zī chǎn dān bǎo bìng zhī fù nián xī bǎi fēn zhī liù é dù shàng bù fēng dǐng",
                    translation = "Seorang pria berpakaian rapi memasuki sebuah bank untuk meminjam uang; sang manajer dengan ramah menyatakan selama ada jaminan aset berharga dan membayar bunga pinjaman 6% per tahun, berapa pun jumlah pinjamannya pasti disetujui.",
                    tokens = listOf(
                        WordToken("银行", "yín háng", "bank", "Kosakata HSK 2: 银行 (yín háng)"),
                        WordToken("经理", "jīng lǐ", "manager", "Kosakata HSK 3: 经理 (jīng lǐ)"),
                        WordToken("担保", "dān bǎo", "guarantee / collateral", "Istilah perbankan"),
                        WordToken("利息", "lì xī", "interest (loan/deposit)", "Kosakata HSK 3: 利息")
                    )
                ),
                Sentence(
                    id = "s_borodl_2",
                    hanzi = "经理原以为其将贷出天文巨款，不料男子平静启齿“仅借一美元”，随之豪迈掏出一沓价值五十万美元的超级国债票据作为质押物。",
                    pinyin = "jīng lǐ yuán yǐ wéi qí jiāng dài chū tiān wén jù kuǎn bù liào nán zǐ píng jìng qǐ chǐ jǐn jiè yī měi yuán suí zhī háo mài tāo chū yī dá jià zhí wǔ shí wàn měi yuán de chāo jí guó zhài piào jù zuò wéi zhì yā wù",
                    translation = "Sang manajer mengira ia akan meminjam uang dalam jumlah fantastis; tak disangka pria itu dengan tenang berkata: 'Saya cuma ingin meminjam 1 dolar saja', seraya mengeluarkan segepok surat obligasi berharga senilai 500.000 dolar sebagai jaminan.",
                    tokens = listOf(
                        WordToken("美元", "měi yuán", "US dollar", "Mata uang"),
                        WordToken("价值", "jià zhí", "value / worth", "Kosakata HSK 3: 价值"),
                        WordToken("票据", "piào jù", "bill / note / securities", "Dokumen finansial")
                    )
                ),
                Sentence(
                    id = "s_borodl_3",
                    hanzi = "面对惊诧万分的经理，富翁从容笑答：年息6%借一美元仅费6美分，却能在顶级金库中以近乎免费之资为巨额票据购得绝对安全之保管！",
                    pinyin = "miàn duì jīng chà wàn fēn de jīng lǐ fù wēng cóng róng xiào dá nián xī bǎi fēn zhī liù jiè yī měi yuán jǐn fèi liù měi fēn què néng zài dǐng jí jīn kù zhōng yǐ jìn hū miǎn fèi zhī zī wèi jù é piào jù gòu dé jué duì ān quán zhī bǎo guǎn",
                    translation = "Menghadapi manajer yang terperangah heran, pria kaya itu tersenyum menjelaskan: bunga 6% dari 1 dolar setahun hanyalah 6 sen, namun dengan biaya nyaris gratis tersebut surat berharga miliknya mendapatkan fasilitas brankas bank kelas satu yang paling aman!",
                    tokens = listOf(
                        WordToken("奇怪", "qí guài", "strange / puzzled", "Kosakata HSK 3: 奇怪 (qí guài)"),
                        WordToken("形式", "xíng shì", "form / shape", "Kosakata HSK 3: 形式"),
                        WordToken("安全", "ān quán", "safe / secure", "Kosakata HSK 3: 安全 (ān quán)"),
                        WordToken("便宜", "pián yi", "cheap", "Kosakata HSK 2: 便宜 (pián yi)")
                    )
                )
            ),
            questions = listOf(
                StoryQuestion(
                    id = "q_borodl_1",
                    questionText = "这位神秘借贷客户在银行办理质押贷款手续时，实际提出的借款金额是多少？ (Berapa jumlah pinjaman yang diajukan pria misterius tersebut?)",
                    options = listOf("五十万美元 (500.000 USD)", "区区一美元（1 USD） (Hanya 1 dolar saja)", "一百万人民币 (1 juta yuan)", "借了一整箱金条 (Satu peti emas)"),
                    correctAnswerIndex = 1,
                    explanation = "Teks menyatakan: '经理以为他会借很多，可是他却说：想借一美元'."
                ),
                StoryQuestion(
                    id = "q_borodl_2",
                    questionText = "男子为了仅仅借出一美元，向银行柜台呈递了怎样货真价实的高额担保质押凭据？ (Jaminan bernilai berapa yang diserahkan pria itu untuk meminjam 1 dolar?)",
                    options = listOf("一把生锈的自行车钥匙 (Kunci sepeda)", "一沓总价值高达50万美元的贵重票据 (Segepok surat berharga senilai 500.000 dolar AS)", "一张过期的假支票 (Cek kedaluwarsa)", "一块普通电子手表 (Jam tangan biasa)"),
                    correctAnswerIndex = 1,
                    explanation = "Teks mencatat: '并且拿出了一沓价值50万美元的票据，说：这些做担保可以吗？'."
                ),
                StoryQuestion(
                    id = "q_borodl_3",
                    questionText = "这名坐拥巨款的客户“借一美元”的真正精明动机是什么？ (Apa tujuan cerdik sesungguhnya dari pria kaya tersebut?)",
                    options = listOf("戏弄银行职员 (Mengerjai pegawai bank)", "利用极低廉的借贷利息（年息6美分），将价值50万的巨额票据安全妥善地寄存锁进银行最高级金库中保管 (Menitipkan surat berharga senilai 500.000 USD di brankas bank teraman dengan biaya bunga cuma 6 sen setahun)", "在银行大厅打地铺睡觉 (Tidur di bank)", "为了在柜台免费喝咖啡 (Demi kopi gratis)"),
                    correctAnswerIndex = 1,
                    explanation = "Pria itu menjelaskan kecerdikannya: '其实我只是想以担保的形式把票据寄存治在这儿，这样又安全又便宜'."
                )
            )
        ),

        // Cerita Mandarin Bean 311 (HSK 3): The Weather I Like (Cuaca yang Selalu Aku Sukai)
        Story(
            id = "story_weather_i_like",
            titleHanzi = "永远是我喜欢的天气",
            titlePinyin = "Yǒngyuǎn Shì Wǒ Xǐhuan de Tiānqì",
            titleTranslation = "The Weather I Like (Sikap Mental Positif Menentukan Kebahagiaan)",
            level = "HSK 3",
            category = "Filsafat & Kebahagiaan Jiwa",
            description = "Dialog sarat makna di sebuah restoran: ketika tamu bertanya cuaca besok, sang pelayan tersenyum menjawab 'pasti cuaca yang saya sukai'; sikap positiflah yang menentukan suasana hati dan nasib kita.",
            coverEmoji = "☀️",
            coverImageRes = R.drawable.cover_story_weather_i_like,
            estimatedReadMinutes = 2,
            sentences = listOf(
                Sentence(
                    id = "s_wthlik_1",
                    hanzi = "饭馆食客探问服务员明日天象，服务员面带如沐春风的微笑从容断言：“明天必定会是我最喜爱的好天气。”",
                    pinyin = "fàn guǎn shí kè tàn wèn fú wù yuán míng rì tiān xiàng fú wù yuán miàn dài rú mù chūn fēng de wēi xiào cóng róng duàn yán míng tiān bì dìng huì shì wǒ zuì xǐ hào de hǎo tiān qì",
                    translation = "Di sebuah restoran, seorang tamu menanyakan perkiraan cuaca esok hari kepada pelayan; sang pelayan tersenyum hangat dan menjawab penuh kepastian: 'Besok pasti akan menjadi cuaca yang sangat saya sukai.'",
                    tokens = listOf(
                        WordToken("客人", "kè rén", "guest / customer", "Kosakata HSK 2: 客人 (kè rén)"),
                        WordToken("服务员", "fú wù yuán", "waiter / waitress", "Kosakata HSK 2: 服务员 (fú wù yuán)"),
                        WordToken("天气", "tiān qì", "weather", "Kosakata HSK 1: 天气 (tiān qì)"),
                        WordToken("一定", "yī dìng", "certainly / definitely", "Kosakata HSK 3: 一定 (yī dìng)")
                    )
                ),
                Sentence(
                    id = "s_wthlik_2",
                    hanzi = "客人甚感惊诧追问因由，服务员睿智应答：纵不知阴晴雨雪，但我誓以笃定积极的心态直面人生境遇，故无论何种天气皆能为我所悦。",
                    pinyin = "kè rén shèn gǎn jīng chà zhuī wèn yīn yóu fú wù yuán ruì zhì yìng dá zòng bù zhī yīn qíng yǔ xuě dàn wǒ shì yǐ dǔ dìng jī jí de xīn tài zhí miàn rén shēng jìng yù gù wú lùn hé zhǒng tiān qì jiē néng wèi wǒ suǒ yuè",
                    translation = "Tamu merasa heran dan bertanya bagaimana ia bisa begitu yakin; pelayan menjawab: 'Saya selalu memilih bersikap positif menghadapi segala hal yang datang dalam hidup; jadi sekalipun saya belum tahu besok cerah atau hujan, cuaca itu pasti cuaca yang saya sukai.'",
                    tokens = listOf(
                        WordToken("奇怪", "qí guài", "strange / surprised", "Kosakata HSK 3: 奇怪 (qí guài)"),
                        WordToken("积极", "jī jí", "positive / active", "Kosakata HSK 3: 积极 (jī jí)"),
                        WordToken("态度", "tài du", "attitude", "Kosakata HSK 3: 态度 (tài du)"),
                        WordToken("面对", "miàn duì", "to face / confront", "Kosakata HSK 3: 面对 (miàn duì)")
                    )
                ),
                Sentence(
                    id = "s_wthlik_3",
                    hanzi = "欢愉的生活源自愉悦的思想：个人的处世心态决定你的喜怒哀乐、牵系身体健康，更能从根本上重塑人生的最终命运。",
                    pinyin = "huān yú de shēng huó yuán zì yú yuè de sī xiǎng gè rén de chǔ shì xīn tài jué dìng nǐ de xǐ nù āi lè qiān xì shēn tǐ jiàn kāng gèng néng cóng gēn běn shàng chóng sù rén shēng de zuì zhōng mìng yùn",
                    translation = "Hidup yang bahagia berakar dari pikiran yang senantiasa ceria; sikap mentalmu menentukan suasana hatimu, memengaruhi kesehatan ragamu, bahkan mampu mengubah takdir hidupmu seutuhnya.",
                    tokens = listOf(
                        WordToken("愉快", "yú kuài", "pleasant / happy", "Kosakata HSK 3: 愉快 (yú kuài)"),
                        WordToken("思想", "sī xiǎng", "thought / ideology", "Kosakata HSK 3: 思想"),
                        WordToken("决定", "jué dìng", "to decide / determine", "Kosakata HSK 2: 决定 (jué dìng)"),
                        WordToken("影响", "yǐng xiǎng", "to influence / affect", "Kosakata HSK 3: 影响 (yǐng xiǎng)"),
                        WordToken("改变", "gǎi biàn", "to change / alter", "Kosakata HSK 3: 改变 (gǎi biàn)")
                    )
                )
            ),
            questions = listOf(
                StoryQuestion(
                    id = "q_wthlik_1",
                    questionText = "饭馆服务员在面对客人关于“明天天气如何”的探问时，给出了怎样出人意料的自信作答？ (Jawaban unik apa yang diberikan pelayan restoran saat ditanya cuaca besok?)",
                    options = listOf("明天必然是狂风暴雨 (Besok pasti badai)", "一定会是我喜欢的天气 (Pasti akan menjadi cuaca yang saya sukai)", "天气预报从来不准 (Ramalan cuaca tak pernah akurat)", "我不知道，请问天气预报员 (Tanya peramal cuaca saja)"),
                    correctAnswerIndex = 1,
                    explanation = "Teks menyatakan: '这位服务员笑着说：一定是我喜欢的天气'."
                ),
                StoryQuestion(
                    id = "q_wthlik_2",
                    questionText = "服务员之所以能够断定明天的天气“一定是自己所喜欢的”，其背后的生活处世哲学是什么？ (Filosofi hidup apa di balik keyakinan pelayan bahwa ia pasti menyukai cuaca besok?)",
                    options = listOf("他能用意念操纵风雨 (Ia bisa mengendalikan cuaca)", "他习惯用积极阳光的主观态度去面对遇见的任何客观境遇 (Ia selalu memilih sikap mental positif menghadapi keadaan apa pun yang datang)", "因为他有两顶大雨伞 (Punya 2 payung)", "他明天放假不用上班 (Besok libur)"),
                    correctAnswerIndex = 1,
                    explanation = "Pelayan menjelaskan: '我喜欢用积极的态度去面对我遇到的事情。所以，虽然我不知道明天是什么天气，但是一定会是我喜欢的'."
                ),
                StoryQuestion(
                    id = "q_wthlik_3",
                    questionText = "文章在结尾升华阐明的心理学与人生真谛是什么？ (Kebenaran psikologis apa yang diuraikan di akhir teks?)",
                    options = listOf("只要有钱每天都开心 (Asal banyak uang selalu bahagia)", "积极愉快的生活源自积极愉快的思想；心态决定心情，影响健康，甚至改变命运 (Hidup bahagia bersumber dari pikiran yang positif; sikap mental menentukan suasana hati, kesehatan, dan takdir)", "所有天气预报都不可信 (Ramalan cuaca tak bisa dipercaya)", "饭馆的服务员比天文学家更懂气象 (Pelayan lebih paham iklim)"),
                    correctAnswerIndex = 1,
                    explanation = "Teks menyimpulkan: '愉快的生活是由愉快的思想造成的。你的态度决定你的心情，影响你的健康，甚至改变你的命运'."
                )
            )
        ),

        // Cerita Mandarin Bean 312 (HSK 3): Six Steamed Bread (Pelajaran Enam Buah Roti Mantau)
        Story(
            id = "story_six_steamed_bread",
            titleHanzi = "六个馒头的教训",
            titlePinyin = "Liù Gè Mántou de Jiàoxun",
            titleTranslation = "Six Steamed Breads (Pelajaran 6 Buah Roti Mantau)",
            level = "HSK 3",
            category = "Filsafat Zen & Kebijaksanaan",
            description = "Kisah biksu cilik yang merasa tidak adil karena hanya mendapat 4 roti mantau sementara guru dan senior mendapat 6; setelah memaksakan makan 6 buah hingga perutnya kembung sakit, barulah mengerti makna 'merasa cukup adalah bahagia (知足常乐)'.",
            coverEmoji = "🥟",
            coverImageRes = R.drawable.cover_story_six_steamed_bread,
            estimatedReadMinutes = 2,
            sentences = listOf(
                Sentence(
                    id = "s_sxstmb_1",
                    hanzi = "晨光熹微晨膳开斋，小和尚见师父与大师兄皆获配六个馒头而自己独得四个，心生不平以为不公，遂向师尊执拗索满六枚。",
                    pinyin = "chén guāng xī wēi chén shàn kāi zhāi xiǎo hé shang jiàn shī fu yǔ dà shī xiōng jiē huò pèi liù gè mán tou ér zì jǐ dú dé sì gè xīn shēng bù píng yǐ wéi bù gōng suì xiàng shī zūn zhí niù suǒ mǎn liù méi",
                    translation = "Di suatu pagi sarapan vihara, seorang biksu cilik melihat guru dan kakak seperguruannya masing-masing mendapatkan 6 buah roti mantau, sementara ia hanya mendapatkan 4; merasa diperlakukan tidak adil, ia menghadap sang guru dan memaksakan diri meminta 6 buah roti mantau.",
                    tokens = listOf(
                        WordToken("和尚", "hé shang", "Buddhist monk", "Tokoh vihara: 和尚"),
                        WordToken("发现", "fā xiàn", "to discover / notice", "Kosakata HSK 3: 发现 (fā xiàn)"),
                        WordToken("师傅", "shī fu", "master / teacher", "Kosakata HSK 3: 师傅 (shī fu)"),
                        WordToken("馒头", "mán tou", "steamed bread / mantou", "Makanan tradisional"),
                        WordToken("公平", "gōng píng", "fair / just", "Kosakata HSK 3: 公平")
                    )
                ),
                Sentence(
                    id = "s_sxstmb_2",
                    hanzi = "小沙弥狼吞虎咽风卷残云将六枚馒头尽数填下腹中，未几腹胀如鼓、口干舌燥，再饮半碗甘泉后更是胃脘剧痛难忍。",
                    pinyin = "xiǎo shā mí láng tūn hǔ yàn fēng juǎn cán yún jiāng liù méi mán tou jìn shù tián xià fù zhōng wèi jǐ fù zhàng rú gǔ kǒu gān shé zào zài yǐn bàn wǎn gān quán hòu gèng shì wèi wǎn jù tòng nán rěn",
                    translation = "Biksu cilik itu melahap habis keenam roti mantau hingga kekenyangan; tak lama berselang perutnya terasa begah kembung dan tenggorokannya haus, sehabis minum setengah mangkok air perutnya mengembang dan mulai menderita kesakitan luar biasa.",
                    tokens = listOf(
                        WordToken("饱", "bǎo", "full (eating)", "Kosakata HSK 3: 饱 (bǎo)"),
                        WordToken("肚子", "dù zi", "belly / stomach", "Kosakata HSK 3: 肚子 (dù zi)"),
                        WordToken("渴", "kě", "thirsty", "Kosakata HSK 2: 渴 (kě)"),
                        WordToken("难受", "nán shòu", "uncomfortable / in pain", "Kosakata HSK 3: 难受 (nán shòu)")
                    )
                ),
                Sentence(
                    id = "s_sxstmb_3",
                    hanzi = "师尊慈悲警示：多得两枚馒头非但未生半点滋养之乐，反招暴食剧痛；谨记贪多嚼不烂，超额占有往往演化为苦障，知足常乐方是解脱大道。",
                    pinyin = "shī zūn cí bēi jǐng shì duō dé liǎng méi mán tou fēi dàn wèi shēng bàn diǎn zī yǎng zhī lè fǎn zhāo bào shí jù tòng jǐn jì tān duō jiáo bù làn chāo é zhàn yǒu wǎng wǎng yǎn huà wèi kǔ zhàng zhī zú cháng lè fāng shì jiě tuō dà dào",
                    translation = "Sang guru menasihatinya dengan bijak: 'Meskipun engkau mendapatkan dua mantau lebih banyak, engkau sama sekali tidak menikmati manfaatnya, sebaliknya mantau berlebih itu mendatangkan derita kesakitan; ingatlah, memiliki lebih banyak belum tentu berkah, merasa cukup adalah sumber kebahagiaan sejati (zhī zú cháng lè)'.",
                    tokens = listOf(
                        WordToken("享受", "xiǎng shòu", "to enjoy", "Kosakata HSK 3: 享受 (xiǎng shòu)"),
                        WordToken("相反", "xiāng fǎn", "contrary / opposite", "Kosakata HSK 3: 相反 (xiāng fǎn)"),
                        WordToken("痛苦", "tòng kǔ", "pain / suffering", "Kosakata HSK 3: 痛苦 (tòng kǔ)"),
                        WordToken("知足常乐", "zhī zú cháng lè", "contentment brings happiness", "Peribahasa filosofis HSK 3")
                    )
                )
            ),
            questions = listOf(
                StoryQuestion(
                    id = "q_sxstmb_1",
                    questionText = "小和尚早晨在斋堂看到师父和大师兄的餐盘后，为什么心里觉得极其“不公平”？ (Mengapa biksu cilik merasa tidak adil saat sarapan di vihara?)",
                    options = listOf("师父吃肉，自己只能吃青菜 (Guru makan daging, ia cuma makan sayur)", "师父和大徒弟都分到了六个馒头，而个头矮小的自己却只拿到了四个馒头 (Guru dan kakak seperguruan dapat 6 mantau, ia cuma dijatah 4 mantau)", "他的碗里没有白开水 (Tak ada air)", "师父不准他坐下吃 (Dilarang duduk)"),
                    correctAnswerIndex = 1,
                    explanation = "Teks menyatakan: '小和尚发现师父和大师兄都得到了六个馒头，而他只得到了四个馒头。小和尚觉得这太不公平了，于是他找到师父，也就要了六个馒头'."
                ),
                StoryQuestion(
                    id = "q_sxstmb_2",
                    questionText = "当小和尚硬撑着把多要来的两个馒头全吃光并喝了水之后，身体引发了怎样痛苦难耐的后果？ (Apa akibat fisik menyakitkan saat biksu cilik memaksakan diri menghabiskan 6 mantau?)",
                    options = listOf("力气瞬间增大十倍 (Tenaga bertambah 10x)", "胃部严重腹胀膨胀，肚子剧烈疼痛难受起来 (Perutnya begah kembung membesar dan mulai merasakan sakit luar biasa)", "立刻健步如飞 (Lari kencang)", "头发长出来了 (Rambut tumbuh)"),
                    correctAnswerIndex = 1,
                    explanation = "Teks menjelaskan: '几分钟后，小和尚的肚子比刚才更胀了，他的肚子开始难受起来'."
                ),
                StoryQuestion(
                    id = "q_sxstmb_3",
                    questionText = "师父面对徒弟因贪多暴食受罪的情景，借事明理向他点拨了哪句经典的禅宗哲理？ (Pesan kearifan klasik apa yang diajarkan sang guru kepada muridnya?)",
                    options = listOf("多吃饭才能长得高 (Banyak makan biar tinggi)", "得到不一定就是享受，贪多反成痛苦，知足才能常乐 (Mendapatkan berlebih belum tentu kenikmatan, melainkan bisa jadi sumber derita; merasa cukup adalah bahagia sejati)", "下顿饭一个馒头都不许吃 (Makan berikutnya dihukum tak boleh makan)", "要把所有的馒头埋进土里 (Kubur mantau di tanah)"),
                    correctAnswerIndex = 1,
                    explanation = "Teks menyimpulkan pesan bijak: '虽然你多得到了两个馒头，但是你并没有享受到这两个馒头的好处，相反，它们给你带来了痛苦。记住，得到不一定就是享受，知足常乐'."
                )
            )
        ),

        // Cerita Mandarin Bean 313 (HSK 3): Embarrassing Experience (Momen Paling Canggung Bertemu Calon Mertua)
        Story(
            id = "story_embarrassing_visit",
            titleHanzi = "尴尬的第一次登门",
            titlePinyin = "Gāngà de Dì Yī Cì Dēngmén",
            titleTranslation = "Embarrassing Experience (Momen Canggung Menemui Calon Mertua)",
            level = "HSK 3",
            category = "Cerita Lucu & Percintaan",
            description = "Xiao Zhang berdandan rapi sejak jam 7 pagi demi menemui orang tua pacarnya; di depan pintu rumah ia menyapa seorang pria paruh baya yang naik tangga sebagai 'abang rekan kerja' (Liu Ge), hingga sang pacar keluar dan memanggil pria itu 'Papa'.",
            coverEmoji = "😳",
            coverImageRes = R.drawable.cover_story_embarrassing_visit,
            estimatedReadMinutes = 2,
            sentences = listOf(
                Sentence(
                    id = "s_embrxp_1",
                    hanzi = "周六正午小张首次登门拜谒准岳父母，心弦紧绷的他清晨七点便起身沐浴更衣、精心梳理仪表，十一点整分秒不差立于女友闺宅门前。",
                    pinyin = "zhōu liù zhèng wǔ Xiǎo zhāng shǒu cì dēng mén bài yè zhǔn yuè fù mǔ xīn xián jǐn bēng de tā qīng chén qī diǎn biàn qǐ shēn mù yù gēng yī jīng xīn shū lǐ yí biǎo shí yī diǎn zhěng fēn miǎo bù chà lì yú nǚ yǒu guī zhái mén qián",
                    translation = "Pada hari Sabtu siang Xiao Zhang untuk pertama kalinya bertandang menemui orang tua kekasihnya; diliputi rasa gugup ia sudah bangun sejak jam 7 pagi untuk berdandan rapi, dan tepat pukul 11:00 ia sudah berdiri di depan pintu rumah sang pacar.",
                    tokens = listOf(
                        WordToken("女朋友", "nǚ péng you", "girlfriend", "Kosakata HSK 2: 女朋友"),
                        WordToken("紧张", "jǐn zhāng", "nervous", "Kosakata HSK 3: 紧张 (jǐn zhāng)"),
                        WordToken("打扮", "dǎ ban", "to dress up / deck out", "Kosakata HSK 3: 打扮 (dǎ ban)"),
                        WordToken("准时", "zhǔn shí", "punctual / on time", "Kosakata HSK 3: 准时 (zhǔn shí)")
                    )
                ),
                Sentence(
                    id = "s_embrxp_2",
                    hanzi = "正欲扣门时忽见楼道信步走上一位中年同事，小张惊喜热络打招呼：“刘哥！您也居此宝地？”此时门扉洞开，小张赶忙拉住同事隆重向女友作介。",
                    pinyin = "zhèng yù kòu mén shí hū jiàn lóu dào xìn bù zǒu shàng lái yī wèi zhōng nián tóng shì Xiǎo zhāng jīng xǐ rè luò dǎ zhāo hu Liú gē nǐ hǎo nǐ yě zài zhèr zhù ya cǐ shí mén fēi dòng kāi Xiǎo zhāng gǎn máng lā zhù tóng shì lóng zhòng xiàng nǚ yǒu zuò jiè",
                    translation = "Saat hendak mengetuk pintu tiba-tiba naik seorang rekan kerja paruh baya dari tangga bawah; Xiao Zhang tersenyum ramah menyapa: 'Halo Abang Liu (Liu Ge)! Abang tinggal di sini juga?'; tepat saat itu pintu terbuka dan Xiao Zhang buru-buru memperkenalkan koleganya kepada pacarnya.",
                    tokens = listOf(
                        WordToken("敲门", "qiāo mén", "to knock on the door", "Kosakata tindakan: 敲门"),
                        WordToken("同事", "tóng shì", "colleague / coworker", "Kosakata HSK 3: 同事 (tóng shì)"),
                        WordToken("打招呼", "dǎ zhāo hu", "to greet / say hello", "Kosakata HSK 3: 打招呼 (dǎ zhāo hu)"),
                        WordToken("赶紧", "gǎn jǐn", "hurriedly / hastily", "Kosakata HSK 3: 赶紧 (gǎn jǐn)")
                    )
                ),
                Sentence(
                    id = "s_embrxp_3",
                    hanzi = "谁知女友对其介绍置若罔闻，反而笑靥如花迎向前恭顺唤道：“爸，您买菜回来了……”，小张呆立当场、尴尬得无地自容！",
                    pinyin = "shéi zhī nǚ yǒu duì qí jiè shào zhì ruò wǎng wén fǎn ér xiào yè rú huā yíng xiàng qián gōng shùn huàn dào bà nǐ huí lái le Xiǎo zhāng dāi lì dāng chǎng gān gà de wú dì zì róng",
                    translation = "Siapa sangka sang pacar sama sekali tidak menggubris pengenalan Xiao Zhang, melainkan langsung menyapa pria tersebut dengan manis: 'Papa, sudah pulang ya...'; seketika Xiao Zhang mematung kaku dan merasa canggung setengah mati!",
                    tokens = listOf(
                        WordToken("介绍", "jiè shào", "to introduce", "Kosakata HSK 2: 介绍 (jiè shào)"),
                        WordToken("理", "lǐ", "to pay attention to / take notice", "Kosakata HSK 3: 理 (lǐ)"),
                        WordToken("尴尬", "gān gà", "awkward / embarrassed", "Kosakata ekspresi HSK 3")
                    )
                )
            ),
            questions = listOf(
                StoryQuestion(
                    id = "q_embrxp_1",
                    questionText = "小张在星期六第一次前往女朋友家中拜见女方父母时，内心的情绪状态是怎样的？ (Bagaimana keadaan perasaan Xiao Zhang saat pertama kali berkunjung ke rumah pacarnya?)",
                    options = listOf("极为放松毫不在意 (Sangat santai masa bodoh)", "异常紧张重视，早晨7点就起床精心洗漱梳理打扮 (Sangat gugup dan waspada, bangun sejak jam 7 pagi berdandan rapi)", "感到愤怒不想去 (Marah tidak mau pergi)", "以为走错了楼门 (Mengira salah gedung)"),
                    correctAnswerIndex = 1,
                    explanation = "Teks menyatakan: '因为这是第一次见女朋友的父母，所以他非常紧张。早上7点，他就起床打扮起来了'."
                ),
                StoryQuestion(
                    id = "q_embrxp_2",
                    questionText = "在女朋友家门外楼梯间，小张偶遇了哪位自以为熟识的中年男子并热情攀谈称呼？ (Xiao Zhang berpapasan dengan siapa di lorong tangga dan bagaimana ia menyapanya?)",
                    options = listOf("学校的体育老师 (Guru olahraga sekolah)", "单位里平日同一家公司的中年同事，并亲切称呼其为“刘哥” (Rekan kerja satu kantor dan menyapanya dengan panggilan 'Liu Ge / Abang Liu')", "小区的保安队长 (Kepala satpam)", "送快递的外卖骑手 (Kurir paket)"),
                    correctAnswerIndex = 1,
                    explanation = "Teks mencatat: '突然发现自己的一个同事从楼下走上来。他笑着打招呼：刘哥，你好！你也在这儿住呀？'."
                ),
                StoryQuestion(
                    id = "q_embrxp_3",
                    questionText = "当女朋友打开房门后，发生了怎样令小张尴尬得无地自容的巨大乌龙反转？ (Kejadian salah paham mengejutkan apa yang terjadi saat pacarnya membuka pintu?)",
                    options = listOf("同事把小张的钱包偷走了 (Rekan kerja mencuri dompet)", "小张刚热心向女友介绍“这是我同事刘哥”，女友却亲热地直接对刘哥喊“爸爸，你回来了” (Xiao Zhang baru memperkenalkan 'Ini Liu Ge rekan kerjaku', sang pacar langsung memanggil pria itu 'Papa')", "女朋友根本不认识小张 (Pacar tidak kenal Xiao Zhang)", "门锁坏了打不开 (Pintu terkunci)"),
                    correctAnswerIndex = 1,
                    explanation = "Teks menyajikan puncak komedi: '丽丽，这是我同事刘哥。刘哥，这是我女朋友……不过女朋友没理他，对“刘哥”说：爸，你回来了'."
                )
            )
        )
    )
}
