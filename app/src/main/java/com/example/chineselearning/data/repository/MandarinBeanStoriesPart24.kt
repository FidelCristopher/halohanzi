package com.example.chineselearning.data.repository

import com.example.chineselearning.R
import com.example.chineselearning.data.model.Sentence
import com.example.chineselearning.data.model.Story
import com.example.chineselearning.data.model.StoryQuestion
import com.example.chineselearning.data.model.WordToken

val mandarinBeanStoriesPart24: List<Story> by lazy {
    listOf(
        // Cerita Mandarin Bean 254 (HSK 3): Getting hotter (Musim Panas Ekstrem dan Perubahan Iklim)
        Story(
            id = "story_getting_hotter",
            titleHanzi = "酷热的夏天",
            titlePinyin = "Kùrè de Xiàtiān",
            titleTranslation = "Getting hotter (Musim Panas Ekstrem & Perubahan Iklim)",
            level = "HSK 3",
            category = "Lingkungan & Alam",
            description = "Fenomena gelombang panas ekstrem di berbagai belahan dunia dan Tiongkok (mencapai 40°C di Shanghai), pandangan para ahli iklim, dan seruan pelestarian lingkungan bumi.",
            coverEmoji = "🌡️",
            coverImageRes = R.drawable.cover_story_getting_hotter,
            estimatedReadMinutes = 2,
            sentences = listOf(
                Sentence(
                    id = "s_gethot_1",
                    hanzi = "今年夏天很特别，从中国到外国，北方到南方，天气都非常热，温度也特别高。",
                    pinyin = "jīn nián xià tiān hěn tè bié cóng Zhōng guó dào wài guó běi fāng dào nán fāng tiān qì dōu fēi cháng rè wēn dù yě tè bié gāo",
                    translation = "Musim panas tahun ini sangat tidak biasa; dari Tiongkok hingga mancanegara, dari wilayah utara hingga selatan, cuaca terasa sangat panas dan suhunya luar biasa tinggi.",
                    tokens = listOf(
                        WordToken("特别", "tè bié", "special / unusual", "Kosakata HSK 2: 特别 (tè bié)"),
                        WordToken("北方", "běi fāng", "north / northern part", "Kosakata HSK 3: 北方 (běi fāng)"),
                        WordToken("南方", "nán fāng", "south / southern part", "Kosakata HSK 3: 南方 (nán fāng)"),
                        WordToken("温度", "wēn dù", "temperature", "Kosakata HSK 3: 温度 (wēn dù)")
                    )
                ),
                Sentence(
                    id = "s_gethot_2",
                    hanzi = "比如上海夏天一般在三十五度左右，可是今年最热时几乎天天超过四十度，大家感慨这是近二十年最热的盛夏。",
                    pinyin = "bǐ rú Shàng hǎi xià tiān yī bān zài sān shí wǔ dù zuǒ yòu kě shì jīn nián zuì rè shí jī hū tiān tiān chāo guò sì shí dù dà jiā gǎn kǎi zhè shì jìn èr shí nián zuì rè de shèng xià",
                    translation = "Sebagai contoh di Shanghai, musim panas biasanya berkisar sekitar 35 derajat Celsius, namun pada puncak panas tahun ini suhunya hampir setiap hari menembus lebih dari 40 derajat, masyarakat menyebut ini musim panas terpanas dalam 20 tahun terakhir.",
                    tokens = listOf(
                        WordToken("比如", "bǐ rú", "for example", "Kosakata HSK 3: 比如 (bǐ rú)"),
                        WordToken("一般", "yī bān", "generally / usually", "Kosakata HSK 3: 一般 (yī bān)"),
                        WordToken("左右", "zuǒ yòu", "around / approximately", "Kosakata HSK 3: 左右 (zuǒ yòu)"),
                        WordToken("差不多", "chà bu duō", "almost / nearly", "Kosakata HSK 3: 差不多 (chà bu duō)")
                    )
                ),
                Sentence(
                    id = "s_gethot_3",
                    hanzi = "专家指出气候变化源于环境遭受破坏，若不立即重视保护生态环境，异常极端气候将在全球越发频繁肆虐。",
                    pinyin = "zhuān jiā zhǐ chū qì hòu biàn huà yuán yú huán jìng zāo shòu pò huài ruò bù lì jí zhòng shì bǎo hù shēng tài huán jìng yì cháng jí duān qì hòu jiāng zài quán shì jiè yuè fā pín fán sì nüè",
                    translation = "Para ahli mengingatkan bahwa perubahan iklim bersumber dari rusaknya lingkungan alam; jika kita tidak segera mengutamakan perlindungan ekosistem, cuaca ekstrem anomali seperti ini akan makin sering melanda seluruh dunia.",
                    tokens = listOf(
                        WordToken("气候", "qì hòu", "climate", "Kosakata HSK 3: 气候 (qì hòu)"),
                        WordToken("变化", "biàn huà", "change / variation", "Kosakata HSK 3: 变化 (biàn huà)"),
                        WordToken("环境", "huán jìng", "environment", "Kosakata HSK 3: 环境 (huán jìng)"),
                        WordToken("保护", "bǎo hù", "to protect / safeguard", "Kosakata HSK 3: 保护 (bǎo hù)"),
                        WordToken("必须", "bì xū", "must / have to", "Kosakata HSK 3: 必须 (bì xū)")
                    )
                )
            ),
            questions = listOf(
                StoryQuestion(
                    id = "q_gethot_1",
                    questionText = "根据文章记录，今年上海在最酷热的时期气温达到了怎样的罕见高度？ (Berdasarkan teks, berapa derajat suhu ekstrem yang dicapai Shanghai pada periode terpanas?)",
                    options = listOf("刚过20度 (Hanya 20°C)", "差不多每天都在40度以上 (Hampir setiap hari menembus lebih dari 40°C)", "始终保持在28度 (Bertahan di 28°C)", "降到了零下5度 (Turun ke minus 5°C)"),
                    correctAnswerIndex = 1,
                    explanation = "Teks menyatakan: '最热的那段时间差不多每天都有四十多度。大家都说，这是最近二十年最热的夏天'."
                ),
                StoryQuestion(
                    id = "q_gethot_2",
                    questionText = "科学专家对全球极端异常高温天气频发的科学成因做出了怎样的判断？ (Apa faktor penyebab ilmiah menurut para ahli terkait fenomena cuaca panas ekstrem global?)",
                    options = listOf("月球引力改变 (Gravitasi bulan berubah)", "全球气候发生深刻变化，生态自然环境遭到严重破坏 (Perubahan iklim global dan rusaknya lingkungan alam hidup)", "太阳离地球越来越近 (Matahari makin dekat ke bumi)", "工厂生产了过多的空调 (Pabrik memproduksi terlalu banyak AC)"),
                    correctAnswerIndex = 1,
                    explanation = "Teks menjelaskan: '有的专家说这是因为气候变化，环境被破坏了'."
                ),
                StoryQuestion(
                    id = "q_gethot_3",
                    questionText = "为了遏止反常极端气候进一步威胁人类社会，文章向全人类发出了什么呼吁？ (Seruan apa yang disampaikan penulis kepada masyarakat untuk mencegah ancaman iklim?)",
                    options = listOf("大家都搬去北极生活 (Pindah ke Kutub Utara)", "全人类必须高度重视并切实行动起来保护地球自然生态环境 (Manusia harus mengutamakan dan bertindak nyata menjaga kelestarian lingkungan)", "完全停止所有工业生产 (Hentikan seluruh pabrik)", "夏天不要出门上班 (Jangan masuk kerja saat musim panas)"),
                    correctAnswerIndex = 1,
                    explanation = "Teks menyimpulkan: '我们必须开始重视保护环境了' (Kita harus mulai mengutamakan perlindungan lingkungan hidup)."
                )
            )
        ),

        // Cerita Mandarin Bean 255 (HSK 3): Name (Budaya Nama Tionghoa)
        Story(
            id = "story_name_culture",
            titleHanzi = "中国人的姓名文化",
            titlePinyin = "Zhōngguórén de Xìngmíng Wénhuà",
            titleTranslation = "Name (Budaya Nama & Marga Tionghoa)",
            level = "HSK 3",
            category = "Budaya & Tradisi",
            description = "Menyelami tata cara penamaan dalam budaya Tionghoa: susunan marga di depan, makna mendalam dan harapan orang tua (seperti Kang dan Mei), hingga nama pena (*bǐmíng*) dan nama panggung (*yìmíng*).",
            coverEmoji = "📛",
            coverImageRes = R.drawable.cover_story_name_culture,
            estimatedReadMinutes = 2,
            sentences = listOf(
                Sentence(
                    id = "s_namclt_1",
                    hanzi = "大多数中国人的姓名由“姓”和“名”两部分组成，不同于西方，姓氏在前而名字在后，可随父姓亦可随母姓。",
                    pinyin = "dà duō shù Zhōng guó rén de xìng míng yóu xìng hé míng liǎng bù fen zǔ chéng bù tóng yú xī fāng xìng shì zài qián ér míng zi zài hòu kě suí fù xìng yì kě suí mǔ xìng",
                    translation = "Sebagian besar nama orang Tionghoa terdiri dari dua unsur yaitu marga (xìng) dan nama diri (míng); berbeda dari budaya Barat, marga diletakkan di depan dan nama kecil di belakang, serta bisa mengikuti marga ayah maupun ibu.",
                    tokens = listOf(
                        WordToken("姓名", "xìng míng", "full name", "Kosakata HSK 2: 名字 (míng zi)"),
                        WordToken("文化", "wén huà", "culture", "Kosakata HSK 2: 文化 (wén huà)"),
                        WordToken("部分", "bù fen", "part / section", "Kosakata HSK 3: 部分 (bù fen)"),
                        WordToken("前面", "qián miàn", "front / ahead", "Kosakata HSK 1: 前面 (qián miàn)")
                    )
                ),
                Sentence(
                    id = "s_namclt_2",
                    hanzi = "孩提时期家人常用亲昵的昵称，步入社会则启用蕴含深意的正式大名，父母常将期许寄寓其中，如“康”寓意健康，“美”希冀美丽。",
                    pinyin = "hái tí shí qī jiā rén cháng yòng qīn nì de nì chēng bù rù shè huì zé qǐ yòng yùn hán shēn yì de zhèng shì dà míng fù mǔ cháng jiāng qī xǔ jì yù qí zhōng rú kāng yù yì jiàn kāng měi xī jì měi lì",
                    translation = "Di masa kecil anggota keluarga biasa memanggil dengan nama panggilan sayang (nìchēng), namun saat memasuki sekolah dan masyarakat digunakan nama resmi yang mengandung makna doa orang tua; misalnya 'Kāng' melambangkan kesehatan dan 'Měi' menyiratkan keelokan paras dan budi.",
                    tokens = listOf(
                        WordToken("正式", "zhèng shì", "formal / official", "Kosakata HSK 3: 正式 (zhèng shì)"),
                        WordToken("特殊", "tè shū", "special / unique", "Kosakata HSK 3: 特殊 (tè shū)"),
                        WordToken("期望", "qī wàng", "expectation / hope", "Kosakata HSK 3: 期望 (qī wàng)"),
                        WordToken("健康", "jiàn kāng", "healthy", "Kosakata HSK 3: 健康 (jiàn kāng)"),
                        WordToken("美丽", "měi lì", "beautiful", "Kosakata HSK 3: 美丽 (měi lì)")
                    )
                ),
                Sentence(
                    id = "s_namclt_3",
                    hanzi = "成年后亦可依志趣自拟新称：演艺人士起艺名，文人著书立笔名，网海冲浪取网名，反映出丰富多彩的文化标识。",
                    pinyin = "chéng nián hòu yì kě yī zhì qù zì nǐ xīn chēng yǎn yì rén shì qǐ yì míng wén rén zhù shū lì bǐ míng wǎng hǎi chōng làng qǔ wǎng míng fǎn yìng chū fēng fù duō cǎi de wén huà biāo shí",
                    translation = "Setelah beranjak dewasa seseorang juga bisa membuat nama sebutan baru sesuai profesi dan minat: seniman panggung memakai nama panggung (yìmíng), penulis memakai nama pena (bǐmíng), dan di jagat internet menggunakan nama akun (wǎngmíng).",
                    tokens = listOf(
                        WordToken("长大", "zhǎng dà", "to grow up", "Kosakata HSK 2: 长大 (zhǎng dà)"),
                        WordToken("笔名", "bǐ míng", "pen name / pseudonym", "Istilah literatur"),
                        WordToken("上网", "shàng wǎng", "to surf the internet", "Kosakata HSK 2: 上网 (shàng wǎng)")
                    )
                )
            ),
            questions = listOf(
                StoryQuestion(
                    id = "q_namclt_1",
                    questionText = "与世界上很多西方文化的命名规则不同，中国人的姓名结构具有怎样的显著特征？ (Berbeda dari negara barat, apa ciri khas utama susunan nama orang Tionghoa?)",
                    options = listOf("完全不使用任何姓氏 (Sama sekali tidak memakai marga)", "姓氏（姓）放在最前面，个人名字（名）放在后面 (Marga/fam diletakkan di depan, nama kecil diletakkan di belakang)", "名字必须由五个汉字组成 (Nama wajib lima karakter)", "所有人一生只能用一个单字 (Hanya boleh satu kata seumur hidup)"),
                    correctAnswerIndex = 1,
                    explanation = "Teks menyatakan: '和很多文化不一样的是，中国人的姓放在前面，名放在后面'."
                ),
                StoryQuestion(
                    id = "q_namclt_2",
                    questionText = "中国父母在给孩子取名选用汉字“康”或“美”时，通常蕴含着怎样的美好期望？ (Doa harapan apa yang tersirat saat orang tua menyematkan karakter 'Kang' atau 'Mei'?)",
                    options = listOf("希望孩子能当大官 (Semoga menjadi pejabat tinggi)", "分别期望孩子一生身体健康、品貌美好美丽 (Mendoakan anak selalu sehat walafiat atau tumbuh rupawan berbudi indah)", "希望孩子发大财 (Semoga cepat kaya raya)", "希望孩子周游列国 (Semoga keliling dunia)"),
                    correctAnswerIndex = 1,
                    explanation = "Teks menjelaskan: '比如，“康”可能是希望孩子健康，“美”可能是希望孩子成为一个美丽的人'."
                ),
                StoryQuestion(
                    id = "q_namclt_3",
                    questionText = "在现代社会生活中，作家和网络冲浪者为自己另起的别名分别通常称作什么？ (Nama alias yang dipakai penulis buku dan pengguna internet masing-masing disebut apa?)",
                    options = listOf("小名与学名 (Nama kecil dan nama sekolah)", "笔名（作家所用）与网名（网络使用） (Bǐmíng / nama pena untuk penulis, dan Wǎngmíng untuk nama daring)", "绰号与外号 (Nama julukan dan ejekan)", "艺名与真名 (Nama panggung dan nama asli)"),
                    correctAnswerIndex = 1,
                    explanation = "Teks menyatakan: '如果你是作家，可以起一个笔名；如果你上网，还可以起一个网名'."
                )
            )
        ),

        // Cerita Mandarin Bean 256 (HSK 3): An E-mail (Surel dari Masa Lalu)
        Story(
            id = "story_an_email",
            titleHanzi = "一封前男友的来信",
            titlePinyin = "Yī Fēng Qián Nányǒu de Láixìn",
            titleTranslation = "An E-mail (Surel Reuni dari Mantan Kekasih)",
            level = "HSK 3",
            category = "Emosi & Kehidupan",
            description = "Gejolak perasaan seorang wanita saat menerima surel dari mantan pacarnya di masa kuliah setelah 5 tahun berpisah: campur aduk antara rasa gugup, rindu, dan doa kebahagiaan.",
            coverEmoji = "💌",
            coverImageRes = R.drawable.cover_story_an_email,
            estimatedReadMinutes = 2,
            sentences = listOf(
                Sentence(
                    id = "s_aneml_1",
                    hanzi = "昨日收到了大学前男友丹尼的电子邮件，毕业后我留在中国任职，他远赴加拿大深造，分手后我们已整整五年未曾谋面。",
                    pinyin = "zuó rì shōu dào le dà xué qián nán yǒu Dān ní de diàn zǐ yóu jiàn bì yè hòu wǒ liú zài Zhōng guó rèn zhí tā yuǎn fù Jiā ná dà shēn zào fēn shǒu hòu wǒ men yǐ zhěng zhěng wǔ nián wèi céng móu miàn",
                    translation = "Kemarin aku menerima sebuah surel dari mantan pacarku semasa kuliah, Danny; setelah wisuda aku bekerja di Tiongkok sementara ia melanjutkan studi ke Kanada, dan semenjak berpisah kami telah lima tahun tidak pernah bertemu.",
                    tokens = listOf(
                        WordToken("邮件", "yóu jiàn", "email / mail", "Kosakata HSK 3: 邮件 (yóu jiàn)"),
                        WordToken("毕业", "bì yè", "to graduate", "Kosakata HSK 3: 毕业 (bì yè)"),
                        WordToken("分手", "fēn shǒu", "to break up", "Kosakata HSK 3: 分手 (fēn shǒu)"),
                        WordToken("见面", "jiàn miàn", "to meet", "Kosakata HSK 3: 见面 (jiàn miàn)")
                    )
                ),
                Sentence(
                    id = "s_aneml_2",
                    hanzi = "丹尼在信中透露下个月即将从加拿大回国，抵京后非常渴望能与我见上一面叙旧，这封来信让我整夜辗转难眠。",
                    pinyin = "Dān ní zài xìn zhōng tòu lù xià gè yuè jí jiāng cóng Jiā ná dà huí guó dǐ jīng hòu fēi cháng kě wàng néng yǔ wǒ jiàn shàng yī miàn xù jiù zhè fēng lái xìn ràng wǒ zhěng yè zhǎn zhuǎn nán mián",
                    translation = "Danny mengabarkan dalam surelnya bahwa bulan depan ia akan pulang dari Kanada, dan setibanya di Beijing ia sangat berharap bisa berjumpa dan mengobrol denganku; surat ini membuatku terjaga sepanjang malam tak bisa tidur.",
                    tokens = listOf(
                        WordToken("回国", "huí guó", "return to homeland", "Kosakata HSK 3: 回国"),
                        WordToken("聊天", "liáo tiān", "to chat", "Kosakata HSK 3: 聊天 (liáo tiān)"),
                        WordToken("睡觉", "shuì jiào", "to sleep", "Kosakata HSK 1: 睡觉 (shuì jiào)")
                    )
                ),
                Sentence(
                    id = "s_aneml_3",
                    hanzi = "心中五味杂陈：既激动又担忧，既期待又害怕，不知他容貌可变、博士学业与生活是否顺遂，虽曾心碎但依然真诚祝愿他一生幸福。",
                    pinyin = "xīn zhōng wǔ wèi zá chén jì jī dòng yòu dān yōu jì qī dài yòu hài pà bù zhī tā róng mào kě biàn bó shì xué yè yǔ shēng huó shì fǒu shùn suì suī céng xīn suì dàn yī rán zhēn chéng zhù yuàn tā yī shēng xìng fú",
                    translation = "Perasaanku campur aduk: ada rasa berdebar sekaligus cemas, ada harapan bercampur takut; penasaran bagaimana rupanya sekarang, apakah sudah lulus doktor dan hidup bahagia; meski perpisahan dulu memilukan, aku tetap tulus mendoakan kebahagiaannya.",
                    tokens = listOf(
                        WordToken("激动", "jī dòng", "excited / stirred", "Kosakata HSK 3: 激动 (jī dòng)"),
                        WordToken("复杂", "fù zá", "complex / complicated", "Kosakata HSK 3: 复杂 (fù zá)"),
                        WordToken("博士", "bó shì", "doctorate / Ph.D.", "Kosakata HSK 3: 博士 (bó shì)"),
                        WordToken("幸福", "xìng fú", "happy / happiness", "Kosakata HSK 3: 幸福 (xìng fú)")
                    )
                )
            ),
            questions = listOf(
                StoryQuestion(
                    id = "q_aneml_1",
                    questionText = "女主人公与大学时期的前男友丹尼在分手之后有多久未曾谋面？ (Berapa lama tokoh utama dan mantan pacarnya, Danny, tidak pernah berjumpa sejak berpisah?)",
                    options = listOf("半年 (Setengah tahun)", "整整五年 (Lima tahun penuh)", "十年以上 (Lebih dari 10 tahun)", "上个星期才见过 (Baru ketemu minggu lalu)"),
                    correctAnswerIndex = 1,
                    explanation = "Teks menyatakan: '分手之后，我们已经五年没有见面了'."
                ),
                StoryQuestion(
                    id = "q_aneml_2",
                    questionText = "得知丹尼下个月将从加拿大归国相约见面后，女主角当晚的心情状态如何？ (Bagaimana keadaan perasaan tokoh utama malam itu setelah menerima surel tersebut?)",
                    options = listOf("漠不关心立刻倒头大睡 (Masa bodoh langsung tidur pulas)", "整夜失眠没睡，内心既激动又担忧、既期待又害怕，心情非常复杂 (Insomnia semalaman, merasa gembira bercampur cemas, harapan dan takut campur aduk)", "愤怒地立刻删除了邮件 (Marah dan langsung menghapus email)", "马上收拾行李搬家 (Segera kemas koper pindah rumah)"),
                    correctAnswerIndex = 1,
                    explanation = "Teks mencatat: '我一晚上没有睡觉，有点儿激动，有点儿担心，有点儿期待，有点儿害怕，心情很复杂'."
                ),
                StoryQuestion(
                    id = "q_aneml_3",
                    questionText = "回顾曾经刻骨铭心但最终分手的青春岁月，女主角内心深处持有怎样的豁达态度？ (Sikap kedewasaan lapang dada apa yang dimiliki sang wanita terhadap masa lalu mereka?)",
                    options = listOf("充满怨恨拒不相见 (Penuh dendam menolak bertemu)", "虽然曾经分手心碎，但难忘相伴的美好快乐，真诚希望对方能够收获幸福 (Meskipun perpisahan dulu melukai hati, ia tetap tulus mendoakan kebahagiaan sang mantan)", "要求丹尼赔偿青春损失费 (Menuntut ganti rugi materi)", "假装完全不认识对方 (Pura-pura tidak kenal)"),
                    correctAnswerIndex = 1,
                    explanation = "Teks menyimpulkan: '虽然分手让人心碎，但是我们在一起的那几年非常快乐，所以我也希望他幸福'."
                )
            )
        ),

        // Cerita Mandarin Bean 257 (HSK 3): Where is the subway station? (Mencari Stasiun Century Park)
        Story(
            id = "story_century_park_subway",
            titleHanzi = "寻找世纪公园地铁站",
            titlePinyin = "Xúnzhǎo Shìjì Gōngyuán Dìtiězhàn",
            titleTranslation = "Where is the subway station? (Arah Stasiun Century Park)",
            level = "HSK 3",
            category = "Transportasi & Arah",
            description = "Percakapan menanyakan rute stasiun subway Century Park di dekat National Library: rute jalan kaki melewati taman bunga dan persimpangan vs alternatif praktis naik taksi.",
            coverEmoji = "🚇",
            coverImageRes = R.drawable.cover_story_century_park_subway,
            estimatedReadMinutes = 1,
            sentences = listOf(
                Sentence(
                    id = "s_ctypk_1",
                    hanzi = "路人甲焦急询问附近地铁站方位，热心市民告知最近的轨交枢纽是位于大型商场旁的世纪公园站。",
                    pinyin = "lù rén jiǎ jiāo jí xún wèn fù jìn dì tiě zhàn fāng wèi rè xīn shì mín gào zhī zuì jìn de guǐ jiāo shū niǔ shì wèi yú dà xíng shāng chǎng páng de Shì jì Gōng yuán zhàn",
                    translation = "Seorang pejalan kaki bertanya letak stasiun subway terdekat, dan warga yang ramah memberi tahu stasiun terdekat adalah Stasiun Taman Abad (Century Park) di samping pusat perbelanjaan.",
                    tokens = listOf(
                        WordToken("地铁站", "dì tiě zhàn", "subway station", "Kosakata HSK 3: 地铁 (dì tiě)"),
                        WordToken("世纪公园", "Shì jì Gōng yuán", "Century Park", "Nama taman terkenal"),
                        WordToken("旁边", "páng biān", "beside / next to", "Kosakata HSK 2: 旁边 (páng biān)")
                    )
                ),
                Sentence(
                    id = "s_ctypk_2",
                    hanzi = "指引路线甚为详尽：沿此路直行穿过小花园出后门左转，横过两个十字路口即可望见国家图书馆，其对面即是拥有数个地铁出入口的繁华商场。",
                    pinyin = "zhǐ yǐn lù xiàn shèn wéi xiáng jìn yán cǐ lù zhí xíng chuān guò xiǎo huā yuán chū hòu mén zuǒ zhuǎn héng guò liǎng gè shí zì lù kǒu jí kě wàng jiàn Guó jiā Tú shū guǎn qí duì miàn jí shì yōng yǒu shù gè dì tiě chū rù kǒu de fán huá shāng chǎng",
                    translation = "Petunjuk rute sangat terperinci: jalan lurus menyusuri jalan ini menembus taman bunga kecil, keluar dari pintu belakang lalu belok kiri, lewati dua persimpangan perempatan jalan maka akan terlihat Perpustakaan Nasional, di mana di seberangnya terdapat mall yang memiliki beberapa pintu keluar-masuk subway.",
                    tokens = listOf(
                        WordToken("穿过", "chuān guò", "to pass through / cross", "Kosakata HSK 3: 穿 (chuān)"),
                        WordToken("十字路口", "shí zì lù kǒu", "crossroads / intersection", "Kosakata HSK 3: 路口"),
                        WordToken("国家图书馆", "Guó jiā Tú shū guǎn", "National Library", "Tempat penting"),
                        WordToken("入口", "rù kǒu", "entrance", "Kosakata HSK 3: 入口 (rù kǒu)")
                    )
                ),
                Sentence(
                    id = "s_ctypk_3",
                    hanzi = "问路者因信息量过大且语速偏快难以悉数记牢，在道谢之余，热心路人幽默支招：若嫌繁琐亦可直接打车瞬时抵达。",
                    pinyin = "wèn lù zhě yīn xìn xī liàng guò dà qiě yǔ sù piān kuài nán yǐ xī shù jì láo zài dào xiè zhī yú rè xīn lù rén yōu mò zhī zhāo ruò xián fán suǒ yì kě zhí jiē dǎ chē shùn shí dǐ dá",
                    translation = "Penanya arah kewalahan mengingat instruksi yang begitu panjang dan cepat; setelah berterima kasih, sang pemberi petunjuk dengan ramah bergurau: kalau merasa terlalu repot, bisa langsung memanggil taksi agar cepat sampai.",
                    tokens = listOf(
                        WordToken("遍", "biàn", "measure word for actions (times)", "Kosakata HSK 3: 遍 (biàn)"),
                        WordToken("其实", "qí shí", "actually / in fact", "Kosakata HSK 3: 其实 (qí shí)"),
                        WordToken("打车", "dǎ chē", "to hail a taxi", "Kosakata HSK 2: 打车 (dǎ chē)")
                    )
                )
            ),
            questions = listOf(
                StoryQuestion(
                    id = "q_ctypk_1",
                    questionText = "热心路人所指引的距离当前地点最近的地铁枢纽站名称是什么？ (Apa nama stasiun subway terdekat yang ditunjukkan oleh warga tersebut?)",
                    options = listOf("人民广场站 (Stasiun People's Square)", "世纪公园站 (Stasiun Century Park / Taman Abad)", "火车站 (Stasiun Kereta Api)", "飞机场站 (Stasiun Bandara)"),
                    correctAnswerIndex = 1,
                    explanation = "Teks menyatakan: '最近的地铁站应该是世纪公园站，在商场旁边'."
                ),
                StoryQuestion(
                    id = "q_ctypk_2",
                    questionText = "根据路人指引，穿过花园左转并经过两个十字路口后，首先映入眼帘的标志性文化建筑是什么？ (Gedung budaya penting apa yang akan terlihat setelah melewati dua perempatan jalan?)",
                    options = listOf("国家图书馆 (Perpustakaan Nasional / National Library)", "市第一人民医院 (Rumah sakit daerah)", "大型体育场 (Stadion olahraga)", "少年宫 (Gedung pemuda)"),
                    correctAnswerIndex = 0,
                    explanation = "Teks merinci: '再过两个十字路口，你就能看到国家图书馆了，图书馆对面就是世纪公园的商场'."
                ),
                StoryQuestion(
                    id = "q_ctypk_3",
                    questionText = "问路者听完详细的步行换乘路径后，为什么提出让对方“能否再说一遍”？ (Mengapa penanya meminta petunjuk jalan diulangi sekali lagi?)",
                    options = listOf("路人讲的是外语 (Warga berbicara bahasa asing)", "路人语速太快且路线步骤较多，自己一时没完全记住 (Bicaranya terlalu cepat dan langkahnya banyak sehingga belum sempat hafal)", "他根本不想去地铁站 (Sebenarnya tidak mau ke subway)", "录音笔电量耗尽 (Baterai perekam habis)"),
                    correctAnswerIndex = 1,
                    explanation = "Penanya berkata: '谢谢你！但是，你说得太快了，能再说一遍吗？'."
                )
            )
        ),

        // Cerita Mandarin Bean 258 (HSK 3): Send a gift (2) (Pantangan Memberi Hadiah di Tiongkok)
        Story(
            id = "story_gift_taboos",
            titleHanzi = "送礼的文化禁忌",
            titlePinyin = "Sònglǐ de Wénhuà Jìjì",
            titleTranslation = "Gift Giving Taboos (Pantangan Budaya Memberi Hadiah di Tiongkok)",
            level = "HSK 3",
            category = "Budaya & Tradisi",
            description = "Edukasi penting mengenai etika dan pantangan tabu memberi hadiah kepada orang Tionghoa: jangan memberi jam dinding (sòng zhōng = sòngzhōng), topi hijau, bunga krisan, payung, dan pir.",
            coverEmoji = "🎁",
            coverImageRes = R.drawable.cover_story_gift_taboos,
            estimatedReadMinutes = 2,
            sentences = listOf(
                Sentence(
                    id = "s_gfttb_1",
                    hanzi = "在华馈赠亲友需谙悉风俗避开禁忌：绝不可赠送钟表，因“送钟”谐音“送终”，系老人临终送别之晦气凶词。",
                    pinyin = "zài huá kuì zèng qīn yǒu xū ān xī fēng sú bì kāi jìn jì jué bù kě zèng sòng zhōng biǎo yīn sòng zhōng xié yīn sòng zhōng xì lǎo rén lín zhōng sòng bié zhī huì qì xiōng cí",
                    translation = "Saat memberikan hadiah kepada teman Tionghoa kita perlu memahami adat dan menghindari pantangan: pantang menghadiahkan jam dinding, karena 'sòng zhōng' (memberi jam) berbunyi sama persis dengan 'sòngzhōng' (mengiringi pemakaman jenazah).",
                    tokens = listOf(
                        WordToken("礼物", "lǐ wù", "gift", "Kosakata HSK 2: 礼物 (lǐ wù)"),
                        WordToken("特别", "tè bié", "especially", "Kosakata HSK 2: 特别 (tè bié)"),
                        WordToken("钟", "zhōng", "clock", "Kosakata HSK 3: 钟 (zhōng)"),
                        WordToken("去世", "qù shì", "to pass away / die", "Kosakata HSK 3: 去世 (qù shì)")
                    )
                ),
                Sentence(
                    id = "s_gfttb_2",
                    hanzi = "赠帽切莫选绿色，因“绿帽子”在汉语言境中指代配偶背叛不贞；择花切忌白黄菊花，因其专用于悼念亡者祭祀场合。",
                    pinyin = "zèng mào qiè mò xuǎn lǜ sè yīn lǜ mào zi zài Hàn yǔ yán jìng zhōng zhǐ dài pèi ǒu bèi pàn bù zhēn zé huā qiè jì bái huáng jú huā yīn qí zhuān yòng yú dào niàn wáng zhě jì sì chǎng hé",
                    translation = "Jangan memilih topi warna hijau, sebab 'lǜ màozi' (topi hijau) dalam ungkapan bahasa Mandarin bermakna pasangan berselingkuh/dikhianati; hindari pula bunga krisan (júhuā) karena merupakan bunga duka untuk pemakaman orang meninggal.",
                    tokens = listOf(
                        WordToken("帽子", "mào zi", "hat / cap", "Kosakata HSK 3: 帽子 (mào zi)"),
                        WordToken("绿色", "lǜ sè", "green", "Kosakata HSK 2: 绿色 (lǜ sè)"),
                        WordToken("背叛", "bèi pàn", "to betray", "Kosakata HSK 3: 背叛 (bèi pàn)"),
                        WordToken("菊花", "jú huā", "chrysanthemum", "Bunga duka tradisi")
                    )
                ),
                Sentence(
                    id = "s_gfttb_3",
                    hanzi = "雨伞与鸭梨亦在忌讳之列，因“伞”音同失散之“散”，“梨”音同别离之“离”，皆含拆散分离之不吉兆头。",
                    pinyin = "yǔ sǎn yǔ yā lí yì zài jì huì zhī liè yīn sǎn yīn tóng shī sàn zhī sàn lí yīn tóng bié lí zhī lí jiē hán chāi sàn fēn lí zhī bù jí zhào tou",
                    translation = "Payung (sǎn) dan buah pir (lí) juga termasuk dalam daftar pantangan hadiah, sebab bunyi 'sǎn' mirip dengan 'sàn' (bubar/terpisah), dan 'lí' sama bunyinya dengan 'lí' (perpisahan), yang dianggap membawa pertanda kurang baik.",
                    tokens = listOf(
                        WordToken("伞", "sǎn", "umbrella", "Kosakata HSK 3: 伞 (sǎn)"),
                        WordToken("梨子", "lí zi", "pear", "Kosakata HSK 3: 梨 (lí)"),
                        WordToken("吉利", "jí lì", "auspicious / lucky", "Kosakata budaya HSK 3: 吉利")
                    )
                )
            ),
            questions = listOf(
                StoryQuestion(
                    id = "q_gfttb_1",
                    questionText = "在中国传统民间交际送礼中，为什么严厉忌讳把“钟表（钟）”作为礼品送给朋友？ (Mengapa dalam adat istiadat Tionghoa terdapat pantangan keras menghadiahkan jam dinding?)",
                    options = listOf("钟表内部零件太重容易摔坏 (Komponen jam terlalu berat)", "“送钟”（sòng zhōng）发音与为长辈送葬办丧事的“送终”完全同音，极不吉利 (Pengucapan 'sòng zhōng' berbunyi sama persis dengan 'sòngzhōng' yang berarti mengantar kematian jenazah)", "因为钟表电池很快会耗尽 (Baterai jam cepat habis)", "年轻人自己都有手机不需要看钟 (Semua sudah punya ponsel)"),
                    correctAnswerIndex = 1,
                    explanation = "Teks menyatakan: '我们不会送钟给朋友，因为“送钟”听起来和“送终”一样，只有老人去世时才会这么说'."
                ),
                StoryQuestion(
                    id = "q_gfttb_2",
                    questionText = "如果想送帽子作为礼物，在颜色选择上必须坚决避免哪种颜色？ (Jika ingin menghadiahi topi, warna apa yang harus dihindari sama sekali?)",
                    options = listOf("黑色 (Hitam)", "绿色（“绿帽子”隐喻配偶不忠与感情背叛） (Warna hijau - karena istilah 'lǜ màozi' bermakna pasangan berselingkuh)", "红色 (Merah)", "蓝色 (Biru)"),
                    correctAnswerIndex = 1,
                    explanation = "Teks menjelaskan: '别送绿色的帽子，因为“绿帽子”在汉语中表示这个人被自己的爱人背叛了'."
                ),
                StoryQuestion(
                    id = "q_gfttb_3",
                    questionText = "日常物品“雨伞”和水果“梨子”之所以最好不要作为礼物赠送，是因为它们分别谐音何字？ (Mengapa payung dan buah pir dihindari dijadikan kado pertemanan?)",
                    options = listOf("谐音“甜”和“咸” (Homofon manis dan asin)", "分别谐音四散分离的“散”与分道扬镳的“离”，寓意关系拆散 (Masing-masing berbunyi mirip kata 'sàn' / bubar dan 'lí' / berpisah)", "价格太便宜显得不尊重 (Harganya terlalu murah)", "保质期太短 (Masa kedaluwarsa pendek)"),
                    correctAnswerIndex = 1,
                    explanation = "Teks menerangkan: '伞和梨子也最好不要送，因为“伞”听起来像“散”，“梨”听起来像“离”，都有分离、分手的意思，不太吉利'."
                )
            )
        ),

        // Cerita Mandarin Bean 259 (HSK 3): Send a Gift (1) (Etika Hadiah Pernikahan & Bertamu)
        Story(
            id = "story_wedding_gifts",
            titleHanzi = "婚礼送礼与做客之道",
            titlePinyin = "Hūnlǐ Sònglǐ yǔ Zuòkè zhī Dào",
            titleTranslation = "Send a Gift: Wedding & Visiting (Etika Hadiah Pernikahan & Bertamu)",
            level = "HSK 3",
            category = "Budaya & Tradisi Sosial",
            description = "Tradisi memberi hadiah di Tiongkok: mengapa angpao uang tunai merah menjadi kado pernikahan paling praktis dan disukai, serta pilihan hadiah santun saat berkunjung ke rumah kawan.",
            coverEmoji = "🧧",
            coverImageRes = R.drawable.cover_story_wedding_gifts,
            estimatedReadMinutes = 2,
            sentences = listOf(
                Sentence(
                    id = "s_wdgift_1",
                    hanzi = "参加中国朋友婚礼即便新人谦逊客套推辞，作为至关重要的喜庆大典，宾客绝不可空手前往。",
                    pinyin = "cān jiā Zhōng guó péng you hūn lǐ jí biàn xīn rén qiān xùn kè tao tuī cí zuò wéi zhì guān zhòng yào de xǐ qìng dà diǎn bīn kè jué bù kě kōng shǒu qián wǎng",
                    translation = "Menghadiri pesta pernikahan sahabat Tionghoa, sekalipun mempelai secara sopan berkata tak perlu membawa apa-apa, sebagai peristiwa agung yang sangat penting para tamu tentu tidak mungkin datang dengan tangan hampa.",
                    tokens = listOf(
                        WordToken("结婚", "jié hūn", "to marry", "Kosakata HSK 3: 结婚 (jié hūn)"),
                        WordToken("重要", "zhòng yào", "important", "Kosakata HSK 2: 重要 (zhòng yào)"),
                        WordToken("事情", "shì qing", "matter / affair", "Kosakata HSK 2: 事情 (shì qing)"),
                        WordToken("不可能", "bù kě néng", "impossible", "Kosakata HSK 2: 可能 (kě néng)")
                    )
                ),
                Sentence(
                    id = "s_wdgift_2",
                    hanzi = "多数人首选奉上红包现金礼金，既免除挑选实物不对胃口的繁琐尴尬，又最直接实用、满载诚挚祝福。",
                    pinyin = "duō shù rén shǒu xuǎn fèng shàng hóng bāo xiàn jīn lǐ jīn jì miǎn chú tiāo xuǎn shí wù bù duì wèi kǒu de fán suǒ gān gà yòu zuì zhí jiē shí yòng mǎn zǎi chéng zhì zhù fú",
                    translation = "Mayoritas masyarakat memilih memberikan uang tunai dalam amplop merah (angpao), yang terbukti paling praktis tanpa khawatir salah membeli barang yang tidak disukai pengantin, sekaligus menjadi doa restu yang paling tulus.",
                    tokens = listOf(
                        WordToken("麻烦", "má fan", "troublesome / complicated", "Kosakata HSK 3: 麻烦 (má fan)"),
                        WordToken("简单", "jiǎn dān", "simple", "Kosakata HSK 3: 简单 (jiǎn dān)"),
                        WordToken("表达", "biǎo dá", "to express / convey", "Kosakata HSK 3: 表达 (biǎo dá)"),
                        WordToken("祝福", "zhù fú", "blessing / good wishes", "Kosakata HSK 3: 祝福 (zhù fú)")
                    )
                ),
                Sentence(
                    id = "s_wdgift_3",
                    hanzi = "而登门拜访好友家常做客，则宜携一束芬芳鲜花、一盒精选名茶、些许美味点心或一瓶美酒，体面得体且宾主尽欢。",
                    pinyin = "ér dēng mén bài fǎng hǎo yǒu jiā cháng zuò kè zé yí xié yī shù fēn fāng xiān huā yī hé jīng xuǎn míng chá xiē xǔ měi wèi diǎn xin huò yī píng měi jiǔ tǐ miàn dé tǐ qiě bīn zhǔ jìn huān",
                    translation = "Sedangkan bila berkunjung santai ke rumah sahabat, membawa seikat bunga segar, sekotak teh pilihan, makanan ringan yang enak, atau sebotol anggur berkualitas merupakan bingkisan yang sangat pantas dan menyenangkan tuan rumah.",
                    tokens = listOf(
                        WordToken("做客", "zuò kè", "to be a guest", "Kosakata HSK 3: 客人 (kè rén)"),
                        WordToken("束", "shù", "bundle / bouquet (measure word)", "Kosakata HSK 3: 束 (shù)"),
                        WordToken("盒", "hé", "box (measure word)", "Kosakata HSK 3: 盒 (hé)"),
                        WordToken("瓶", "píng", "bottle (measure word)", "Kosakata HSK 3: 瓶 (píng)")
                    )
                )
            ),
            questions = listOf(
                StoryQuestion(
                    id = "q_wdgift_1",
                    questionText = "在中国参加亲友结婚大典时，绝大多数宾客最为普遍且认可度最高的随礼形式是什么？ (Bentuk kado pernikahan yang paling umum dan praktis di Tiongkok adalah apa?)",
                    options = listOf("赠送家用电器微波炉 (Memberikan microwave)", "赠送装在红信封里的礼金现金（红包份子钱） (Memberikan uang tunai dalam amplop merah / angpao)", "送一面手织锦旗 (Memberikan spanduk)", "送一箱新鲜蔬菜 (Memberikan sekardus sayur)"),
                    correctAnswerIndex = 1,
                    explanation = "Teks menyatakan: '大多数人一般会送钱，因为买东西很麻烦，结婚的朋友可能不需要或者不喜欢这个礼物，送钱很简单，也能表达自己的祝福'."
                ),
                StoryQuestion(
                    id = "q_wdgift_2",
                    questionText = "送礼金给新婚夫妇之所以被公认为上策，其核心现实优势体现在哪里？ (Keunggulan utama memberikan uang tunai pernikahan adalah?)",
                    options = listOf("新人可以用钱替客人买单 (Pengantin bayarin tamu)", "简单明了实用，新人可自主支配，免去买错多余实物闲置浪费的烦琐 (Sangat praktis, bisa dipakai sesuai kebutuhan pengantin tanpa takut salah beli barang)", "银行有现金补贴 (Ada subsidi bank)", "不需要手写任何祝福语 (Tak perlu nulis doa)"),
                    correctAnswerIndex = 1,
                    explanation = "Teks menerangkan bahwa membeli barang sangat merepotkan dan belum tentu dibutuhkan mempelai, sedangkan memberi uang tunai jauh lebih simpel dan fleksibel."
                ),
                StoryQuestion(
                    id = "q_wdgift_3",
                    questionText = "如果是日常前往中国朋友家中登门做客，文章推荐了哪些得体怡人的随手礼物？ (Kado apa yang direkomendasikan saat berkunjung santai ke rumah kawan?)",
                    options = listOf("贵重的黄金首饰 (Perhiasan emas mahal)", "一束鲜花、一盒好茶、一些可口美食或一瓶好酒 (Sebundel bunga segar, sekotak teh, camilan lezat, atau sebotol minuman anggur)", "大捆木柴 (Sebundel kayu bakar)", "旧报纸 (Koran bekas)"),
                    correctAnswerIndex = 1,
                    explanation = "Teks menyarankan: '如果去朋友家玩，一般可以买一束花，一盒茶，一些好吃的东西，或者一瓶酒，这些礼物都可以'."
                )
            )
        ),

        // Cerita Mandarin Bean 260 (HSK 3): Favorite Country (Negara Liburan Impian Keluarga)
        Story(
            id = "story_favorite_country",
            titleHanzi = "全家人热爱的旅行国度",
            titlePinyin = "Quán Jiā Rén Rè'ài de Lǚxíng Guódù",
            titleTranslation = "Favorite country (Destinasi Liburan Impian Keluarga)",
            level = "HSK 3",
            category = "Perjalanan & Dunia",
            description = "Pilihan destinasi wisata keluarga: kakak yang mengagumi Jepang, ibu yang menyukai arsitektur kota Eropa, ayah pencinta taman nasional Amerika, dan penulis yang mendambakan pantai hangat Thailand.",
            coverEmoji = "🏝️",
            coverImageRes = R.drawable.cover_story_favorite_country,
            estimatedReadMinutes = 2,
            sentences = listOf(
                Sentence(
                    id = "s_favcnt_1",
                    hanzi = "全家酷爱环球旅行：兄长钟情东瀛日本的传统人文，母亲醉心欧洲典雅如画的历史名城。",
                    pinyin = "quán jiā kù ài huán qiú lǚ xíng xiōng zhǎng zhōng qíng dōng yíng Rì běn de chuán tǒng rén wén mǔ qīn zuì xīn Ōu zhōu diǎn yǎ rú huà de lì shǐ míng chéng",
                    translation = "Keluarga kami semakin gemar bepergian ke luar negeri: kakak laki-laki sangat menyukai kebudayaan Jepang, sementara ibu jatuh hati pada kota-kota bersejarah di Eropa yang indah menawan.",
                    tokens = listOf(
                        WordToken("出国", "chū guó", "to go abroad", "Kosakata HSK 3: 出国 (chū guó)"),
                        WordToken("旅游", "lǚ yóu", "travel / tourism", "Kosakata HSK 2: 旅游 (lǚ yóu)"),
                        WordToken("日本", "Rì běn", "Japan", "Negara"),
                        WordToken("欧洲", "Ōu zhōu", "Europe", "Benua")
                    )
                ),
                Sentence(
                    id = "s_favcnt_2",
                    hanzi = "父亲偏爱北美美国壮阔瑰丽的国家公园自然地貌，而我心中无可替代的最爱则是阳光明媚的热带泰国。",
                    pinyin = "fù qīn piān ài běi měi Měi guó zhuàng kuò guī lì de guó jiā gōng yuán zì rán dì mào ér wǒ xīn zhōng wú kě tì dài de zuì ài zé shì yáng guāng míng mèi de rè dài Tài guó",
                    translation = "Ayah sangat mengagumi pemandangan alam megah di taman-taman nasional Amerika Serikat, sedangkan destinasi nomor satu yang paling kudambakan adalah pesona negeri tropis Thailand.",
                    tokens = listOf(
                        WordToken("国家公园", "guó jiā gōng yuán", "national park", "Taman alam"),
                        WordToken("自然", "zì rán", "natural / nature", "Kosakata HSK 3: 自然 (zì rán)"),
                        WordToken("泰国", "Tài guó", "Thailand", "Negara Asia Tenggara")
                    )
                ),
                Sentence(
                    id = "s_favcnt_3",
                    hanzi = "泰国当地居民多通晓英语交流顺畅，碧海银沙、热带美食与永不褪色的灿烂夏日，令我心驰神往渴望常驻生活于此。",
                    pinyin = "Tài guó dāng dì jū mín duō tōng xiǎo Yīng yǔ jiāo liú shùn chàng bì hǎi yín shā rè dài měi shí yǔ yǒng bù tuì sè de càn làn xià rì lìng wǒ xīn chí shén wǎng kě wàng cháng zhù shēng huó yú cǐ",
                    translation = "Di Thailand banyak warganya yang bisa berbahasa Inggris sehingga perjalanan sangat mudah; lautnya yang membiru, kulinernya yang lezat, serta musim panas yang abadi menjadikannya tempat impian bagiku.",
                    tokens = listOf(
                        WordToken("方便", "fāng biàn", "convenient", "Kosakata HSK 2: 方便 (fāng biàn)"),
                        WordToken("海", "hǎi", "sea / ocean", "Kosakata HSK 3: 海 (hǎi)"),
                        WordToken("食物", "shí wù", "food", "Kosakata HSK 3: 食物 (shí wù)"),
                        WordToken("季节", "jì jié", "season", "Kosakata HSK 3: 季节 (jì jié)")
                    )
                )
            ),
            questions = listOf(
                StoryQuestion(
                    id = "q_favcnt_1",
                    questionText = "作者的哥哥和妈妈在出国旅行目的地偏好上分别展现出怎样的追求？ (Kakak dan ibu penulis masing-masing memiliki minat destinasi wisata ke mana?)",
                    options = listOf("哥哥喜欢去非洲，妈妈喜欢去澳洲 (Kakak suka Afrika, ibu suka Australia)", "哥哥痴迷日本文化喜欢去日本，妈妈醉心于欧洲优美迷人的城市风光 (Kakak suka Jepang karena budayanya, ibu suka Eropa karena keindahan kotanya)", "全家人只喜欢在国内露营 (Semua hanya suka berkemah di dalam negeri)", "都喜欢去南极看企鹅 (Suka ke Antartika melihat pinguin)"),
                    correctAnswerIndex = 1,
                    explanation = "Teks menyatakan: '哥哥喜欢去日本，因为他很喜欢日本文化。我的妈妈喜欢欧洲，因为欧洲有很多漂亮的城市'."
                ),
                StoryQuestion(
                    id = "q_favcnt_2",
                    questionText = "作者本人为什么毫不掩饰地将“泰国”列为自己心目中最爱的旅游胜地？ (Mengapa penulis sendiri memilih Thailand sebagai negara liburan favoritnya?)",
                    options = listOf("泰国冬天经常下大雪 (Thailand sering turun salju)", "当地英语通用交流方便，有迷人海景、可口美食且气候常年如夏 (Bahasa Inggris mudah, pemandangan laut indah, makanan lezat, dan selalu musim panas)", "泰国的物价是全球最高的 (Biaya hidup termahal)", "因为作者在泰国当导游 (Karena bekerja sebagai pemandu tur)"),
                    correctAnswerIndex = 1,
                    explanation = "Teks menyebutkan: '我最喜欢泰国，很多人都能说一点儿英语，去哪儿都很方便，还有漂亮的海和好吃的食物。泰国一直是夏天，这也是我最喜欢的季节'."
                ),
                StoryQuestion(
                    id = "q_favcnt_3",
                    questionText = "父亲之所以格外偏爱前往美国度假旅行，其最主要吸引力是什么？ (Daya tarik utama apa yang membuat sang ayah gemar berwisata ke Amerika Serikat?)",
                    options = listOf("美国国家公园壮丽迷人的优美自然生态环境 (Pesona keindahan lingkungan alam di taman-taman nasional AS)", "喜欢去拉斯维加斯购物 (Suka belanja di Las Vegas)", "探访华尔街金融中心 (Mengunjungi Wall Street)", "去好莱坞拍摄科幻电影 (Syuting film di Hollywood)"),
                    correctAnswerIndex = 0,
                    explanation = "Teks mencatat: '我的爸爸喜欢美国，因为那些国家公园的自然环境很美'."
                )
            )
        ),

        // Cerita Mandarin Bean 261 (HSK 3): The Chinese in Germany (Kota Kecil Berjuluk Tiongkok di Jerman)
        Story(
            id = "story_chinese_in_germany",
            titleHanzi = "德国小镇的中国狂欢节",
            titlePinyin = "Déguó Xiǎozhèn de Zhōngguó Kuánghuānjié",
            titleTranslation = "The Chinese in Germany (Karnaval Imlek Unik di Dietfurt Jerman)",
            level = "HSK 3",
            category = "Dunia & Keajaiban Budaya",
            description = "Kisah nyata kota kecil Dietfurt di Bavaria Jerman berpopulasi 6.000 jiwa yang warga Eropanya bangga menjuluki diri mereka 'orang Tionghoa' dan merayakan karnaval Imlek meriah ratusan tahun.",
            coverEmoji = "🏮",
            coverImageRes = R.drawable.cover_story_chinese_in_germany,
            estimatedReadMinutes = 2,
            sentences = listOf(
                Sentence(
                    id = "s_chngrm_1",
                    hanzi = "德国坐落着一座人口仅六千余人的宁静小镇，居民虽皆为地道金发碧眼的欧洲人模样，却自豪宣称自己是“中国人”。",
                    pinyin = "Dé guó zuò luò zhe yī zuò rén kǒu jǐn liù qiān yú rén de níng jìng xiǎo zhèn jū mín suī jiē wèi dì dao jīn fà bì yǎn de Ōu zhōu rén yàng zi què zì háo xuān chēng zì jǐ shì Zhōng guó rén",
                    translation = "Di Jerman terdapat sebuah kota kecil permai berpenduduk 6.000 jiwa; meskipun dari anak-anak hingga dewasa berparas orang Eropa tulen, mereka dengan bangga menyebut diri mereka sebagai 'orang Tionghoa'.",
                    tokens = listOf(
                        WordToken("德国", "Dé guó", "Germany", "Negara Eropa"),
                        WordToken("小镇", "xiǎo zhèn", "small town", "Kosakata HSK 3: 镇 (zhèn)"),
                        WordToken("样子", "yàng zi", "appearance / look", "Kosakata HSK 3: 样子 (yàng zi)"),
                        WordToken("王国", "wáng guó", "kingdom", "Kosakata HSK 3: 王国 (wáng guó)")
                    )
                ),
                Sentence(
                    id = "s_chngrm_2",
                    hanzi = "他们视小镇为“中国人的王国”，甚至尊崇汉语为官方语言，每逢中国农历春节，全镇男女老幼皆着唐装举行盛大狂欢节。",
                    pinyin = "tā men shì xiǎo zhèn wèi Zhōng guó rén de wáng guó shèn zhì zūn chóng Hàn yǔ wèi guān fāng yǔ yán měi féng Zhōng guó nóng lì Chūn jié quán zhèn nán nǚ lǎo yòu jiē zhe táng zhuāng jǔ xíng shèng dà kuáng huān jié",
                    translation = "Mereka menganggap kota kecil mereka sebagai 'kerajaan orang Tionghoa' bahkan menetapkan bahasa Mandarin sebagai salah satu bahasa simbolik kota; setiap Tahun Baru Imlek, seluruh warga merayakan festival karnaval Tiongkok dengan meriah.",
                    tokens = listOf(
                        WordToken("官方", "guān fāng", "official", "Kosakata HSK 3: 官方 (guān fāng)"),
                        WordToken("春节", "Chūn jié", "Spring Festival", "Hari raya Imlek"),
                        WordToken("狂欢节", "kuáng huān jié", "carnival festival", "Perayaan karnaval"),
                        WordToken("认真", "rèn zhēn", "earnest / conscientious", "Kosakata HSK 3: 认真 (rèn zhēn)")
                    )
                ),
                Sentence(
                    id = "s_chngrm_3",
                    hanzi = "相传数百年前小镇先民便与华商贸易通商，因深深爱慕中华文明而将这一欢庆传统代代传承至今。",
                    pinyin = "xiāng chuán shù bǎi nián qián xiǎo zhèn xiān mín biàn yǔ huá shāng mào yì tōng shāng yīn shēn shēn ài mù Zhōng huá wén míng ér jiāng zhè yī huān qìng chuán tǒng dài dài chuán chéng zhì jīn",
                    translation = "Konon ceritanya, ratusan tahun yang lalu leluhur kota kecil ini telah berniaga dengan pedagang Tiongkok, hingga lambat laun jatuh cinta pada kebudayaan Tionghoa dan melestarikan tradisi festival Imlek ini turun-temurun.",
                    tokens = listOf(
                        WordToken("据说", "jù shuō", "it is said that / reportedly", "Tata bahasa HSK 3: 据说"),
                        WordToken("做生意", "zuò shēng yì", "to do business / trade", "Kosakata HSK 3: 生意 (shēng yì)"),
                        WordToken("文化", "wén huà", "culture", "Kosakata HSK 2: 文化 (wén huà)")
                    )
                )
            ),
            questions = listOf(
                StoryQuestion(
                    id = "q_chngrm_1",
                    questionText = "这座地处德国的6000人口特殊小镇，居民在文化身份认同上有着怎样令人惊奇的宣称？ (Klaim identitas budaya unik apa yang dideklarasikan oleh warga kota kecil berpenduduk 6.000 jiwa di Jerman ini?)",
                    options = listOf("宣称自己是火星人的后代 (Mengaku keturunan bangsa Mars)", "虽然外貌全都是欧洲人，却坚称自己是“中国人”，小镇是“中国人的王国” (Meski berparas Eropa tulen, mereka menyatakan diri mereka 'orang Tionghoa' dan kotanya adalah 'kerajaan Tiongkok')", "宣称与外界彻底隔绝 (Mengaku terisolasi dari dunia luar)", "宣称所有人都必须当水手 (Mengharuskan warganya jadi pelaut)"),
                    correctAnswerIndex = 1,
                    explanation = "Teks menyatakan: '从孩子到大人，都是欧洲人的样子。但是，他们却说自己是中国人，自己的小镇是中国人的王国'."
                ),
                StoryQuestion(
                    id = "q_chngrm_2",
                    questionText = "每逢中国农历新春佳节（春节），该德国小镇都会全城举行什么标志性的盛大庆典？ (Festival akbar apa yang digelar kota kecil ini setiap kali Tahun Baru Imlek tiba?)",
                    options = listOf("啤酒饮酒马拉松 (Lomba minum bir maraton)", "热闹盛大的“中国狂欢节”（Chinese Carnival） (Perayaan meriah 'Karnaval Tiongkok')", "全城闭门熄灯三天 (Mematikan lampu kota 3 hari)", "大型滑雪锦标赛 (Turnamen ski salju)"),
                    correctAnswerIndex = 1,
                    explanation = "Teks menyebutkan: '每年中国春节，这里都会有热闹的中国狂欢节，大人和孩子都认真地庆祝'."
                ),
                StoryQuestion(
                    id = "q_chngrm_3",
                    questionText = "导致这座欧洲小镇数百年来深深爱上并传承中华民俗的历史渊源是什么？ (Latar belakang sejarah apa yang membuat kota Eropa ini jatuh cinta pada tradisi Tiongkok ratusan tahun lalu?)",
                    options = listOf("小镇被中国皇帝御赐封地 (Kota dihadiahkan kaisar Tiongkok)", "几百年前当地祖先就与中国商人通商贸易往来，逐渐深爱情感与文化 (Ratusan tahun lalu leluhur mereka berdagang dengan saudagar Tionghoa dan terpesona oleh budayanya)", "小镇从中国领养了全部儿童 (Mengadopsi anak dari Tiongkok)", "地理课教师的强制命令 (Perintah guru geografi)"),
                    correctAnswerIndex = 1,
                    explanation = "Teks mencatat: '据说，这是因为几百年前这里的人就开如和中国人做生意，慢慢喜欢上了中国文化，就开始过中国狂欢节了'."
                )
            )
        ),

        // Cerita Mandarin Bean 262 (HSK 3): Dream Room (Kamar Impian Anak-Anak Shanghai)
        Story(
            id = "story_dream_room",
            titleHanzi = "上海困境儿童的“梦想房间”",
            titlePinyin = "Shànghǎi Kùnjìng Értóng de Mèngxiǎng Fángjiān",
            titleTranslation = "Dream Room (Renovasi Kamar Impian Anak Kurang Mampu)",
            level = "HSK 3",
            category = "Sosial & Kepedulian Kasih",
            description = "Program filantropi di Shanghai merenovasi kamar tidur bagi anak-anak dari keluarga berpenghasilan rendah: dinding, lantai, meja belajar, dan inspirasi sang anak untuk kelak membalas budi membantu sesama.",
            coverEmoji = "🛋️",
            coverImageRes = R.drawable.cover_story_dream_room,
            estimatedReadMinutes = 1,
            sentences = listOf(
                Sentence(
                    id = "s_drmrm_1",
                    hanzi = "每个孩童心底都渴望拥有一间属于自己的温暖天地，上海最新启动公益爱心计划，专门帮扶困难家庭改造“梦想房间”。",
                    pinyin = "měi gè hái tóng xīn dǐ dōu kě wàng yōng yǒu yī jiān shǔ yú zì jǐ de wēn nuǎn tiān dì Shàng hǎi zuì xīn qǐ dòng gōng yì ài xīn jì huà zhuān mén bāng fú kùn nan jiā tíng gǎi zào mèng xiǎng fáng jiān",
                    translation = "Setiap anak mendambakan sebuah kamar pribadi yang hangat milik mereka sendiri; Shanghai meluncurkan program sosial kepedulian yang khusus membantu anak-anak dari keluarga berpenghasilan rendah merenovasi 'kamar impian'.",
                    tokens = listOf(
                        WordToken("梦想", "mèng xiǎng", "dream / aspiration", "Kosakata HSK 3: 梦想 (mèng xiǎng)"),
                        WordToken("房间", "fáng jiān", "room", "Kosakata HSK 1: 房间 (fáng jiān)"),
                        WordToken("困难", "kùn nan", "difficult / hardship", "Kosakata HSK 3: 困难 (kùn nan)"),
                        WordToken("改造", "gǎi zào", "to transform / renovate", "Kosakata HSK 3: 改造 (gǎi zào)")
                    )
                ),
                Sentence(
                    id = "s_drmrm_2",
                    hanzi = "改造工程为孩子们重新粉刷墙壁、铺整地面，并配备了崭新的舒适卧床、护眼台灯、书桌以及人体工学座椅。",
                    pinyin = "gǎi zào gōng chéng wèi hái zi men chóng xīn fěn shuā qiáng bì pū zhěng dì miàn bìng pèi bèi le zhǎn xīn de shū shì wò chuáng hù yǎn tái dēng shū zhuō yǐ jí rén tǐ gōng xué zuò yǐ",
                    translation = "Proyek renovasi ini mengecat ulang dinding kamar anak-anak, merapikan lantai, serta melengkapinya dengan kasur baru yang nyaman, lampu belajar pelindung mata, meja belajar, dan kursi yang ergonomis.",
                    tokens = listOf(
                        WordToken("墙", "qiáng", "wall", "Kosakata HSK 3: 墙 (qiáng)"),
                        WordToken("地", "dì", "floor / ground", "Kosakata HSK 2: 地 (dì)"),
                        WordToken("灯", "dēng", "lamp / light", "Kosakata HSK 3: 灯 (dēng)"),
                        WordToken("桌子", "zhuō zi", "table / desk", "Kosakata HSK 1: 桌子 (zhuō zi)"),
                        WordToken("椅子", "yǐ zi", "chair", "Kosakata HSK 1: 椅子 (yǐ zi)")
                    )
                ),
                Sentence(
                    id = "s_drmrm_3",
                    hanzi = "喜获崭新独立房间的王同学眼眶湿润、备受激励，立志勤勉苦读，期许未来学有所成也能将爱心接力回馈更多困顿之人。",
                    pinyin = "xǐ huò zhǎn xīn dú lì fáng jiān de Wáng tóng xué yǎn kuàng shī rùn bèi shòu jī lì lì zhì qín miǎn kǔ dú qī xǔ wèi lái xué yǒu suǒ chéng yě néng jiāng ài xīn jiē lì huí kuì gèng duō kùn dùn zhī rén",
                    translation = "Siswa bermarga Wang yang baru saja menerima kamar impiannya merasa sangat terharu dan termotivasi; ia berjanji akan giat belajar agar kelak saat dewasa bisa meneruskan estafet kebaikan membantu lebih banyak orang yang membutuhkan.",
                    tokens = listOf(
                        WordToken("表示", "biǎo shì", "to express / state", "Kosakata HSK 3: 表示 (biǎo shì)"),
                        WordToken("努力", "nǔ lì", "to make efforts / diligent", "Kosakata HSK 2: 努力 (nǔ lì)"),
                        WordToken("帮助", "bāng zhù", "to help", "Kosakata HSK 2: 帮助 (bāng zhù)")
                    )
                )
            ),
            questions = listOf(
                StoryQuestion(
                    id = "q_drmrm_1",
                    questionText = "上海近期实施的爱心民生新举措中，专门针对哪些特殊儿童群体开展“梦想房间”改造？ (Program 'kamar impian' di Shanghai secara khusus ditujukan bagi kelompok anak yang mana?)",
                    options = listOf("考试考了全校第一名的学霸儿童 (Anak juara satu ujian)", "家庭经济条件存在困难的困境儿童 (Anak-anak dari keluarga yang menghadapi kesulitan ekonomi/kurang mampu)", "在国外出生的外国侨童 (Anak ekspatriat asing)", "拥有专业特长的艺术神童 (Anak berbakat seni)"),
                    correctAnswerIndex = 1,
                    explanation = "Teks menyatakan: '上海有一个新计划，帮助家庭有困难的孩子改造自己的梦想房间'."
                ),
                StoryQuestion(
                    id = "q_drmrm_2",
                    questionText = "在“梦想房间”全套改造流程中，施工方通常会为受助孩子翻新添置哪些基本设施？ (Fasilitas apa saja yang direnovasi dan dipasang dalam proyek kamar impian tersebut?)",
                    options = listOf("高档电脑游戏机和音响 (Mesin game dan sound system mahal)", "粉刷墙壁与地面，换置全新舒适大床、护眼照明灯具、书桌及椅子 (Mengecat dinding & lantai, kasur baru, lampu meja, meja belajar, dan kursi)", "名牌运动鞋专柜 (Lemari sepatu bermerek)", "一间迷你电影院 (Bioskop mini)"),
                    correctAnswerIndex = 1,
                    explanation = "Teks merinci: '房间会改造墙、地、床、灯、桌子、椅子等'."
                ),
                StoryQuestion(
                    id = "q_drmrm_3",
                    questionText = "刚获赠崭新梦想房间的王同学在感言中立下了怎样的成长誓言？ (Tekad apa yang diungkapkan oleh Siswa Wang setelah menerima kamar impiannya?)",
                    options = listOf("以后再也不去上学了 (Tidak mau sekolah lagi)", "一定要努力刻苦学习，希望将来自己有能力去帮助更多需要帮助的人 (Akan giat belajar agar kelak mampu membalas budi membantu lebih banyak orang yang membutuhkan)", "要求搬去更大的大别墅 (Minta pindah ke vila mewah)", "把房间租给同学赚钱 (Menyewakan kamar ke temannya)"),
                    correctAnswerIndex = 1,
                    explanation = "Teks mencatat: '刚刚得到自己梦想房间的王同学表示，希望努力学习，以后也可以帮助更多人'."
                )
            )
        ),

        // Cerita Mandarin Bean 263 (HSK 3): The Family of Teachers (Empat Generasi Keluarga Guru)
        Story(
            id = "story_family_of_teachers",
            titleHanzi = "一家四代的教师世家",
            titlePinyin = "Yī Jiā Sì Dài de Jiàoshī Shìjiā",
            titleTranslation = "The Family of Teachers (Empat Generasi Mengabdi Pendidikan)",
            level = "HSK 3",
            category = "Pendidikan & Inspirasi",
            description = "Kisah luar biasa keluarga Guru Wu Huihui di Guangzhou: dari kakek pendidik ternama, orang tua yang mengabdi di pedesaan, hingga anak dan kerabat (lebih dari 30 orang) mengabdi tulus bagi masa depan generasi bangsa.",
            coverEmoji = "👨‍🏫",
            coverImageRes = R.drawable.cover_story_family_of_teachers,
            estimatedReadMinutes = 2,
            sentences = listOf(
                Sentence(
                    id = "s_famtea_1",
                    hanzi = "广州市某初级中学数学教师吴晖晖已在三尺讲台躬耕执教29载，其祖父乃近代中国赫赫有名的杰出教育家。",
                    pinyin = "Guǎng zhōu shì mǒu chū jí zhōng xué shù xué jiào shī Wú Huī huī yǐ zài sān chǐ jiǎng tái gōng gēng zhí jiào èr shí jiǔ zǎi qí zǔ fù nǎi jìn dài Zhōng guó hè hè yǒu míng de jié chū jiào yù jiā",
                    translation = "Guru matematika SMP di kota Guangzhou, Wu Huihui, telah mengabdi mendidik selama 29 tahun; kakeknya adalah seorang tokoh pendidik terkemuka yang sangat termasyhur di Tiongkok.",
                    tokens = listOf(
                        WordToken("数学", "shù xué", "mathematics", "Kosakata HSK 3: 数学 (shù xué)"),
                        WordToken("当", "dāng", "to serve as / work as", "Kosakata HSK 3: 当 (dāng)"),
                        WordToken("著名", "zhù míng", "famous / well-known", "Kosakata HSK 3: 著名 (zhù míng)"),
                        WordToken("教育家", "jiào yù jiā", "educator", "Tokoh bidang pendidikan")
                    )
                ),
                Sentence(
                    id = "s_famtea_2",
                    hanzi = "她的双亲毕生扎根乡村教育播撒智慧之光，家族内外更有三十余位至亲骨肉分赴神州各大城镇投身教育伟业，其女如今亦承继衣钵任教。",
                    pinyin = "tā de shuāng qīn bì shēng zhā gēn xiāng cūn jiào yù bō sǎ zhì huì zhī guāng jiā zú nèi wài gèng yǒu sān shí yú wèi zhì qīn gǔ ròu fēn fù shén zhōu gè dà chéng zhèn tóu shēn jiào yù wěi yè qí nǚ rú jīn yì chéng jì yī bō rèn jiào",
                    translation = "Kedua orang tuanya mendedikasikan seumur hidup mereka bagi pendidikan di desa-desa terpencil; di dalam keluarga besarnya terdapat lebih dari 30 orang yang tersebar di berbagai kota mengabdi sebagai guru, bahkan putri kandungnya kini turut menjadi guru.",
                    tokens = listOf(
                        WordToken("乡村", "xiāng cūn", "village / rural area", "Kosakata HSK 3: 乡村"),
                        WordToken("其他", "qí tā", "other / else", "Kosakata HSK 2: 其他 (qí tā)"),
                        WordToken("城市", "chéng shì", "city", "Kosakata HSK 2: 城市 (chéng shì)"),
                        WordToken("女儿", "nǚ ér", "daughter", "Kosakata HSK 1: 女儿 (nǚ ér)")
                    )
                ),
                Sentence(
                    id = "s_famtea_3",
                    hanzi = "一家四代人坚贞不渝地笃信教育乃人类最崇高伟大的神圣事业，更将这一份传道授业的奉献精神化作阖家终身无悔的精神追求。",
                    pinyin = "yī jiā sì dài rén jiān zhēn bù yú de dǔ xìn jiào yù nǎi rén lèi zuì chóng gāo wěi dà de shén shèng shì yè gèng jiāng zhè yī fèn chuán dào shòu yè de fèng xiàn jīng shén huà zuò hé jiā zhōng shēn wú huǐ de jīng shén zhuī qiú",
                    translation = "Empat generasi dalam satu keluarga ini berkeyakinan teguh bahwa pendidikan adalah cita-cita pengabdian yang paling agung dan mulia, dan menjadikannya sebagai pedoman pengabdian hidup yang mereka perjuangkan tanpa henti.",
                    tokens = listOf(
                        WordToken("四代", "sì dài", "four generations", "Silsilah keluarga"),
                        WordToken("相信", "xiāng xìn", "to believe", "Kosakata HSK 3: 相信 (xiāng xìn)"),
                        WordToken("伟大", "wěi dà", "great / magnificent", "Kosakata HSK 3: 伟大 (wěi dà)"),
                        WordToken("事业", "shì yè", "cause / undertaking", "Kosakata HSK 3: 事业 (shì yè)"),
                        WordToken("追求", "zhuī qiú", "pursuit / to pursue", "Kosakata HSK 3: 追求 (zhuī qiú)")
                    )
                )
            ),
            questions = listOf(
                StoryQuestion(
                    id = "q_famtea_1",
                    questionText = "广州市中学数学老师吴晖晖自己在人民教师的岗位上默默坚守奉献了多少个春秋？ (Berapa tahun Guru Wu Huihui mengabdi sebagai guru matematika di Guangzhou?)",
                    options = listOf("整整5年 (5 tahun)", "长达29年 (29 tahun lamanya)", "刚满1年 (Baru 1 tahun)", "超过50年 (Lebih dari 50 tahun)"),
                    correctAnswerIndex = 1,
                    explanation = "Teks menyatakan: '吴晖晖，她已经当老师29年了'."
                ),
                StoryQuestion(
                    id = "q_famtea_2",
                    questionText = "除了吴老师的直系祖父辈与父母外，该大家族中还有多少名亲属在不同城市执教？ (Berapa banyak kerabat dalam keluarga besarnya yang berprofesi sebagai tenaga pendidik?)",
                    options = listOf("仅有两三个人 (Hanya dua-tiga orang)", "有三十多位家庭成员都在不同城市从事教育工作 (Lebih dari 30 orang anggota keluarga mengabdi di dunia pendidikan di berbagai kota)", "不到五个人 (Kurang dari lima orang)", "全部改行经商 (Semua beralih profesi bisnis)"),
                    correctAnswerIndex = 1,
                    explanation = "Teks menjelaskan: '吴老师的其他家人中，有三十多人都在不同的城市做教育工作'."
                ),
                StoryQuestion(
                    id = "q_famtea_3",
                    questionText = "这家四代人历经岁月沧桑，共同坚守不移的最高人生信念与崇高追求是什么？ (Nilai keyakinan agung apa yang dipegang teguh oleh empat generasi keluarga ini?)",
                    options = listOf("只要能赚大钱就是成功 (Asal kaya itu sukses)", "坚信教育是全人类最伟大的崇高事业，并将其作为全家人终身无悔的追求 (Yakin bahwa pendidikan adalah profesi yang paling agung dan mulia, menjadikannya tujuan hidup sekeluarga)", "每个人都必须考上北京大学 (Semua wajib masuk Universitas Peking)", "家族必须拥有百亩良田 (Keluarga harus punya tanah luas)"),
                    correctAnswerIndex = 1,
                    explanation = "Teks menyimpulkan: '一家四代人都相信，教育是伟大的事业，这也是他们一生的追求'."
                )
            )
        )
    )
}
