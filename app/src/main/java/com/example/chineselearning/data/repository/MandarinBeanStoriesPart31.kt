package com.example.chineselearning.data.repository

import com.example.chineselearning.R
import com.example.chineselearning.data.model.Sentence
import com.example.chineselearning.data.model.Story
import com.example.chineselearning.data.model.StoryQuestion
import com.example.chineselearning.data.model.WordToken

val mandarinBeanStoriesPart31: List<Story> by lazy {
    listOf(
        // Cerita Mandarin Bean 324 (HSK 3): A Leaf Block Out Eyes (Peribahasa: Sehelai Daun Menutup Mata)
        Story(
            id = "story_leaf_block_eyes",
            titleHanzi = "成语：一叶障目",
            titlePinyin = "Chéngyǔ: Yī Yè Zhàng Mù",
            titleTranslation = "A Leaf Blocks the Eyes (Tertutup Pandangan Sehelai Daun)",
            level = "HSK 3",
            category = "Sejarah & Peribahasa (Chengyu)",
            description = "Fabel klasik tentang seorang miskin yang mempercayai mitos daun pelindung belalang sembah pembawa tembus pandang; begitu mengira dirinya tak terlihat, ia nekat mencuri di pasar dan tertangkap seketika.",
            coverEmoji = "🍃",
            coverImageRes = R.drawable.cover_story_leaf_block_eyes,
            estimatedReadMinutes = 2,
            sentences = listOf(
                Sentence(
                    id = "s_leafbl_1",
                    hanzi = "古有一贫如洗之书生妄求横财，见古籍载称“若得螳螂捕蝉所蔽之叶即可隐身遁形”，便如获至宝攀树苦寻良久。",
                    pinyin = "gǔ yǒu yī pín rú xǐ zhī shū shēng wàng qiú hèng cái jiàn gǔ jí zǎi chēng ruò dé táng láng bǔ chán suǒ bì zhī yè jí kě yǐn shēn dùn xíng biàn rú huò zhì bǎo pān shù kǔ xún liáng jiǔ",
                    translation = "Dahulu ada seorang pelajar miskin yang terobsesi ingin cepat kaya; membaca sebuah buku kuno yang konon menuliskan 'barang siapa memperoleh daun yang dipakai belalang sembah menyamar saat menangkap jangkrik maka orang lain tak akan bisa melihatnya', ia pun segera bergegas ke bawah pohon untuk mencarinya.",
                    tokens = listOf(
                        WordToken("读书人", "dú shū rén", "scholar / intellectual", "Orang berpendidikan zaman kuno"),
                        WordToken("穷", "qióng", "poor / impoverished", "Kosakata HSK 3: 穷 (qióng)"),
                        WordToken("发财", "fā cái", "to get rich", "Kosakata HSK 3: 发财 (fā cái)"),
                        WordToken("树叶", "shù yè", "tree leaf", "Daun pohon")
                    )
                ),
                Sentence(
                    id = "s_leafbl_2",
                    hanzi = "侥幸觅得却失手落入落叶堆中莫辨真伪，他索性扫尽枯叶归家逐一以叶遮目逼问妻子：“能见我否？”妻不堪其扰随口敷衍：“不见！”",
                    pinyin = "jiǎo xìng mì dé què shī shǒu luò rù luò yè duī zhōng mò biàn zhēn wěi tā suǒ xì sǎo jìn kū yè guī jiā zhú yī yǐ yè zhē mù bī wèn qī zi néng jiàn wǒ fǒu qī bù kān qí rǎo suí kǒu fū yǎn bù jiàn",
                    translation = "Setelah susah payah menemukan daun itu, daunnya tak sengaja jatuh dan bercampur dengan dedaunan lain; ia pun mengangkut semua daun ke rumah dan mencobanya satu per satu sambil menutupi mata dan bertanya pada istrinya: 'Bisakah kamu melihatku?'; sang istri yang jengkel akhirnya asal menyahut: 'Tidak kelihatan!'.",
                    tokens = listOf(
                        WordToken("遮住", "zhē zhù", "to cover / block", "Kosakata tindakan: 遮住"),
                        WordToken("妻子", "qī zi", "wife", "Kosakata HSK 2: 妻子 (qī zi)"),
                        WordToken("烦", "fán", "annoyed / irritated", "Kosakata HSK 3: 烦 (fán)"),
                        WordToken("随口", "suí kǒu", "casually / offhand", "Kosakata HSK 3: 随口")
                    )
                ),
                Sentence(
                    id = "s_leafbl_3",
                    hanzi = "书生大喜过望信以为真，当即擎叶公然在闹市抢夺商贾之物，旋即被当街捕获示众；“一叶障目”遂成自欺欺人、目光短浅之千古讥弹。",
                    pinyin = "shū shēng dà xǐ guò wàng xìn yǐ wéi zhēn dāng jí qíng yè gōng rán zài nào shì qiǎng duó shāng gǔ zhī wù xuán jí bèi dāng jiē bǔ huò shì zhòng yī yè zhàng mù suì chéng zì qī qī rén mù guāng duǎn qiǎn zhī qiān gǔ jī tán",
                    translation = "Pelajar itu girang bukan kepalang mengira dirinya benar-benar menghilang; ia segera membawa daun itu dan merampas barang orang di pasar di siang bolong, hingga seketika diringkus di tempat; peribahasa 'yī yè zhàng mù' menyindir orang yang tertipu ilusi dan berpandangan sempit.",
                    tokens = listOf(
                        WordToken("当面", "dāng miàn", "to one's face / in presence of", "Kosakata HSK 3: 当面"),
                        WordToken("抓住", "zhuā zhù", "to catch / seize", "Kosakata HSK 3: 抓 (zhuā)"),
                        WordToken("结果", "jié guǒ", "result / in the end", "Kosakata HSK 3: 结果 (jié guǒ)")
                    )
                )
            ),
            questions = listOf(
                StoryQuestion(
                    id = "q_leafbl_1",
                    questionText = "古代那个穷困潦倒的读书人之所以发疯般到处寻找一片特殊的树叶，其动机是什么？ (Motivasi apa yang membuat pelajar miskin itu mencari daun pohon tertentu?)",
                    options = listOf("用来当作中药药引治病 (Untuk ramuan obat herbal)", "轻信古书传言，以为得到螳螂捕蝉遮身的树叶就能使自己彻底隐形发财 (Percaya mitos bahwa daun penyamar belalang sembah bisa membuatnya tembus pandang untuk mencuri)", "为了给妻子制作华美叶裙 (Bikin gaun daun untuk istri)", "用来盖房子的屋顶 (Menambal atap rumah)"),
                    correctAnswerIndex = 1,
                    explanation = "Teks menyatakan: '书上说：谁得到螳螂捕蝉时遮身的那片树叶，别人就看不见他了。他非常高兴，于是跑到一棵树下希望找到那片树叶'."
                ),
                StoryQuestion(
                    id = "q_leafbl_2",
                    questionText = "在家中试验树叶隐身术时，妻子为什么最终会对丈夫说出那句致命的“看不见”？ (Mengapa sang istri akhirnya berucap 'aku tidak melihatmu'?)",
                    options = listOf("妻子双眼突然失明 (Istri mendadak buta)", "被丈夫拿树叶蒙眼连续成千上万次追问逼得心烦意乱，随口敷衍应付 (Terlalu jengkel dan lelah ditanya berkali-kali tanpa henti, sehingga asal menjawab 'tidak lihat')", "丈夫真的在房间里凭空消失了 (Suami benar-benar menghilang)", "房间里没有点蜡烛太黑 (Kamar terlalu gelap)"),
                    correctAnswerIndex = 1,
                    explanation = "Teks menjelaskan: '后来，妻子被他问烦了，就随口说：“看不见！”'."
                ),
                StoryQuestion(
                    id = "q_leafbl_3",
                    questionText = "家喻户晓的成语“一叶障目”（或一叶障目，不见泰山）在现代社会主要用来比喻什么现象？ (Apa makna kiasan peribahasa 'yī yè zhàng mù' dalam kehidupan modern?)",
                    options = listOf("森林里的树叶生长茂密 (Pohon di hutan sangat lebat)", "被眼前极其微小局部的事物或荒唐私欲所蒙蔽，看不到大局与客观真相，甚至盲目自欺欺人 (Tertutup pandangannya oleh hal sepele atau ilusi palsu hingga mengabaikan kenyataan sejati)", "视力衰退需要配戴老花镜 (Mata rabun)", "秋天落叶满地难以清扫 (Daun musim gugur banyak)"),
                    correctAnswerIndex = 1,
                    explanation = "Peribahasa '一叶障目' mengibaratkan orang yang tertipu oleh ilusi kecil atau ketamakan diri sendiri hingga kehilangan akal sehat dan tidak melihat kebenaran objektif."
                )
            )
        ),

        // Cerita Mandarin Bean 325 (HSK 3): “万” Is Hard to Write (Bocah yang Mengeluh Menulis Kata Sepuluh Ribu)
        Story(
            id = "story_wan_hard_to_write",
            titleHanzi = "初学者写“万”字",
            titlePinyin = "Chūxuézhě Xiě Wàn Zì",
            titleTranslation = "Writing the Character Wan (Merasa Cepat Pintar Menulis Huruf Wan)",
            level = "HSK 3",
            category = "Pendidikan & Humor Belajar",
            description = "Seorang anak pedagang kaya belajar menulis huruf 一, 二, dan 三 lalu sombong mengira sudah menguasai seluruh tulisan Mandarin dan memecat gurunya; saat disuruh menulis 万 (10.000) ia lelah menggambar 3.000 garis.",
            coverEmoji = "🖌️",
            coverImageRes = R.drawable.cover_story_wan_hard_to_write,
            estimatedReadMinutes = 2,
            sentences = listOf(
                Sentence(
                    id = "s_wanhrd_1",
                    hanzi = "富商延请名师授子识字，首日学一画之“一”，次日学两画之“二”，三日学三画之“三”，少爷便沾沾自喜自命大成，迫不及待辞退西席。",
                    pinyin = "fù shāng yán qǐng míng shī shòu zǐ shí zì shǒu rì xué yī huà zhī yī cì rì xué liǎng huà zhī èr sān rì xué sān huà zhī sān shào yé biàn zhān zhān zì xǐ zì mìng dà chéng pò bù jí dài cí tuì xī xí",
                    translation = "Seorang saudagar kaya menyewa guru mengajari putranya menulis; hari pertama belajar '一' satu goresan, hari kedua '二' dua goresan, hari ketiga '三' tiga goresan; sang anak langsung merasa menulis Mandarin sangat gampang dan menyuruh ayahnya memecat sang guru.",
                    tokens = listOf(
                        WordToken("商人", "shāng rén", "merchant / businessman", "Kosakata HSK 3: 商人 (shāng rén)"),
                        WordToken("认字", "rèn zì", "learn to read/write characters", "Belajar aksara"),
                        WordToken("简单", "jiǎn dān", "simple / easy", "Kosakata HSK 3: 简单 (jiǎn dān)"),
                        WordToken("辞退", "cí tuì", "to dismiss / fire", "Kosakata HSK 3: 辞退")
                    )
                ),
                Sentence(
                    id = "s_wanhrd_2",
                    hanzi = "数日后父命其手书“万”字，少爷苦坐穷日伏案画线、挥汗如雨，至日暮哀叹：“‘万’字实乃天下一大难字，我苦画整日方才堪堪画完三千横划！”",
                    pinyin = "shù rì hòu fù mìng qí shǒu shū wàn zì shào yé kǔ zuò qióng rì fú àn huà xiàn huī hàn rú yǔ zhì rì mù āi tàn wàn zì shí nǎi tiān xià yī dà nán zì wǒ kǔ huà zhěng rì fāng cái kān kān huà wán sān qiān héng huà",
                    translation = "Beberapa hari kemudian sang ayah menyuruhnya menulis karakter '万' (wàn / sepuluh ribu); sang anak terkurung seharian menggambar garis horizontal hingga bercucuran keringat, saat petang mengeluh: 'Huruf Wan ternyata sulit sekali, seharian penuh aku baru sempat menggambar 3.000 garis!'.",
                    tokens = listOf(
                        WordToken("万", "wàn", "ten thousand (10,000)", "Angka besar: 万"),
                        WordToken("竟然", "jìng rán", "unexpectedly / to one's surprise", "Kosakata HSK 3: 竟然 (jìng rán)"),
                        WordToken("划", "huà", "stroke (in character) / line", "Goresan aksara")
                    )
                ),
                Sentence(
                    id = "s_wanhrd_3",
                    hanzi = "学海无涯永无止境，若于学业仅浅尝辄止、一知半解便狂妄自满，则与画三千画之愚顽痴儿又有何本质分别？",
                    pinyin = "xué hǎi wú yá yǒng wú zhǐ jìng ruò yú xué yè jǐn qiǎn cháng zhé zhǐ yī zhī bàn jiě biàn kuáng wàng zì mǎn zé yǔ huà sān qiān huà zhī yú wán chī ér yòu yǒu hé běn zhì fēn bié",
                    translation = "Lautan ilmu pengetahuan tidak bertepi; jika kita belajar hanya puas dengan sedikit pemahaman dangkal lalu merasa sudah tahu segalanya, apa bedanya kita dengan anak bodoh yang menggambar ribuan garis tersebut?",
                    tokens = listOf(
                        WordToken("知识", "zhī shi", "knowledge", "Kosakata HSK 3: 知识 (zhī shi)"),
                        WordToken("满足", "mǎn zú", "satisfied / content", "Kosakata HSK 3: 满足 (mǎn zú)"),
                        WordToken("一知半解", "yī zhī bàn jiě", "half-baked knowledge / superficial", "Peribahasa HSK 3"),
                        WordToken("区别", "qū bié", "difference / distinction", "Kosakata HSK 3: 区别 (qū bié)")
                    )
                )
            ),
            questions = listOf(
                StoryQuestion(
                    id = "q_wanhrd_1",
                    questionText = "商人的儿子在刚学了汉字“一”、“二”、“三”之后，做出了怎样盲目自满的举动？ (Tindakan ceroboh apa yang dilakukan anak saudagar setelah baru belajar angka 1, 2, dan 3?)",
                    options = listOf("要求老师每天多教一百个生字 (Minta diajari 100 kata tiap hari)", "自以为汉字规律全在画横线，宣称自己已经彻底掌握写字，让父亲把教书先生给辞退了解雇 (Merasa menulis Hanzi cuma soal garis dan menyuruh ayahnya memecat guru)", "把文房四宝全送给了朋友 (Bagi-bagi alat tulis)", "立刻考上了朝廷状元 (Lulus ujian kekaisaran)"),
                    correctAnswerIndex = 1,
                    explanation = "Teks menyatakan: '儿子觉得写字很简单，自己已经学会写字了，就请父亲辞退了老师'."
                ),
                StoryQuestion(
                    id = "q_wanhrd_2",
                    questionText = "当父亲吩咐儿子书写一个“万”字时，这名自以为是的愚笨儿子在纸上干了什么让人哭笑不得的事？ (Apa yang dilakukan anak tersebut saat disuruh menulis kata 'Wan' / 10.000?)",
                    options = listOf("用毛笔画了一只大老虎 (Melukis harimau)", "在纸上辛辛苦苦画了一整天横线，到傍晚才好不容易画了三千道横杠 (Seharian penuh menggambar garis datar hingga baru mencapai 3.000 garis)", "把纸张全部涂成黑色 (Mewarnai kertas jadi hitam)", "逃跑去集市看戏 (Kabur nonton sandiwara)"),
                    correctAnswerIndex = 1,
                    explanation = "Teks mencatat kelucuan: '儿子说：“万”字竟然这么难写，我写了一天才写了3000划'."
                ),
                StoryQuestion(
                    id = "q_wanhrd_3",
                    questionText = "这个传诵甚广的寓言故事旨在警醒一切求知向学之人应当恪守怎样的求学态度？ (Pelajaran moral apa yang disampaikan cerita ini kepada para penuntut ilmu?)",
                    options = listOf("汉字越简单越不用学 (Aksara mudah tak perlu dipelajari)", "知识浩瀚无穷无尽，求学切忌浅尝辄止、“一知半解”便狂妄自满 (Ilmu pengetahuan tanpa batas, jangan pernah puas dengan pemahaman dangkal / yī zhī bàn jiě)", "写字必须用毛笔不能用硬笔 (Harus pakai kuas)", "有钱人不需要学习文化知识 (Orang kaya tak butuh belajar)"),
                    correctAnswerIndex = 1,
                    explanation = "Teks menyimpulkan: '知识是无穷无尽的，如果学习只满足于一知半解，那和这个笨儿子又有什么区别呢？'."
                )
            )
        ),

        // Cerita Mandarin Bean 326 (HSK 3): Imported From New Zealand (Telur dan Tahu Impor Selandia Baru)
        Story(
            id = "story_imported_from_nz",
            titleHanzi = "新西兰进口的炒蛋与豆腐",
            titlePinyin = "Xīnxīlán Jìnkǒu de Chǎodàn yǔ Dòufu",
            titleTranslation = "Imported From New Zealand (Lelucon Restoran: Impor Selandia Baru)",
            level = "HSK 3",
            category = "Cerita Lucu & Humor",
            description = "Xiao Wen kaget melihat tagihan restoran: tumis telur tomat 200 yuan karena bahannya impor dari Selandia Baru; saat tahu seharga 100 yuan lebih padahal beli di supermarket, pelayan beralasan yang beli adalah mahasiswa asal Selandia Baru.",
            coverEmoji = "🍳",
            coverImageRes = R.drawable.cover_story_imported_from_nz,
            estimatedReadMinutes = 1,
            sentences = listOf(
                Sentence(
                    id = "s_impnzl_1",
                    hanzi = "小文在高级餐馆结账时目瞪口呆：一份家常西红柿炒鸡蛋账单赫然标价两百元，女侍者淡定释称番茄与鸡蛋皆纯系新西兰远洋空运进口。",
                    pinyin = "Xiǎo wén zài gāo jí cān guǎn jié zhàng shí mù dèng kǒu dāi yī fèn jiā cháng xī hóng shì chǎo jī dàn zhàng dān hè rán biāo jià liǎng bǎi yuán nǚ shì zhě dàn dìng shì chēng fān qié yǔ jī dàn jiē chún xì Xīn xī lán yuǎn yáng kōng yùn jìn kǒu",
                    translation = "Xiao Wen terperanjat saat memeriksa nota tagihan di restoran: seporsi tumis telur tomat biasa dihargai hingga 200 yuan; pelayan wanita dengan tenang menjelaskan bahwa tomat dan telurnya diimpor langsung dari Selandia Baru.",
                    tokens = listOf(
                        WordToken("账单", "zhàng dān", "bill / check", "Nota pembayaran"),
                        WordToken("西红柿炒鸡蛋", "xī hóng shì chǎo jī dàn", "scrambled eggs with tomato", "Kuliner rumahan populer"),
                        WordToken("进口", "jìn kǒu", "imported / to import", "Kosakata HSK 3: 进口 (jìn kǒu)"),
                        WordToken("新西兰", "Xīn xī lán", "New Zealand", "Nama negara")
                    )
                ),
                Sentence(
                    id = "s_impnzl_2",
                    hanzi = "小文旋即抓过账目愤然质问：“中华本土千年发明的寻常豆腐竟也要价百多元，莫非这豆腐亦须从新西兰千里迢迢进口不成？！”",
                    pinyin = "Xiǎo wén xuán jí zhuā guò zhàng mù fèn rán zhì wèn Zhōng huá běn tǔ qiān nián fā míng de xún cháng dòu fu jìng yě yào jià bǎi duō yuán mò fēi zhè dòu fu yì xū cóng Xīn xī lán qiān lǐ tiáo tiáo jìn kǒu bù chéng",
                    translation = "Xiao Wen lantas menunjuk menu berikutnya dengan marah: 'Tahu kan makanan asli ciptaan bangsa Tiongkok, masa tahu begini juga harus diimpor dari Selandia Baru sampai harganya lebih dari 100 yuan?!'.",
                    tokens = listOf(
                        WordToken("豆腐", "dòu fu", "tofu / bean curd", "Bahan makanan tradisional"),
                        WordToken("发明", "fā míng", "to invent / invention", "Kosakata HSK 3: 发明 (fā míng)"),
                        WordToken("超市", "chāo shì", "supermarket", "Kosakata HSK 3: 超市 (chāo shì)"),
                        WordToken("生气", "shēng qì", "angry", "Kosakata HSK 2: 生气 (shēng qì)")
                    )
                ),
                Sentence(
                    id = "s_impnzl_3",
                    hanzi = "女侍者从容镇定给出神级奇葩答复：“豆腐确实是在街口超市平价采购的，但刚才奉命步行去超市买豆腐的服务员，是一位新西兰留学生！”",
                    pinyin = "nǚ shì zhě cóng róng zhèn dìng gěi chū shén jí qí pā dá fù dòu fu què shí shì zài jiē kǒu chāo shì píng jià cǎi gòu de dàn gāng cái fèng mìng bù xíng qù chāo shì mǎi dòu fu de fú wù yuán shì yī wèi Xīn xī lán liú xué shēng",
                    translation = "Pelayan wanita itu dengan tenang memberikan jawaban yang mengocok perut: 'Tahu ini memang dibeli dari supermarket biasa kok, tapi pelayan yang tadi kami suruh beli tahu ke supermarket adalah seorang mahasiswa asing asal Selandia Baru!'.",
                    tokens = listOf(
                        WordToken("冷静", "lěng jìng", "calm / composed", "Kosakata HSK 3: 冷静 (lěng jìng)"),
                        WordToken("服务员", "fú wù yuán", "waiter / waitress", "Kosakata HSK 2: 服务员"),
                        WordToken("留学生", "liú xué shēng", "foreign student / international student", "Kosakata HSK 3: 留学生")
                    )
                )
            ),
            questions = listOf(
                StoryQuestion(
                    id = "q_impnzl_1",
                    questionText = "在餐厅吃完饭看账单时，哪一道极其普通家常的炒菜标价高达200元让小文深感震惊？ (Menu masakan rumahan apa yang dihargai sampai 200 yuan hingga mengejutkan Xiao Wen?)",
                    options = listOf("法式顶级黑松露 (Jamur truffle Prancis)", "西红柿炒鸡蛋 (Tumis telur tomat biasa)", "深海金枪鱼刺身 (Sashimi tuna)", "澳洲烤牛排 (Steak sapi Australia)"),
                    correctAnswerIndex = 1,
                    explanation = "Teks menyatakan: '一个西红柿炒鸡蛋竟然要两百元！'."
                ),
                StoryQuestion(
                    id = "q_impnzl_2",
                    questionText = "女服务员对于一盘普通番茄炒蛋敢卖两百元天价给出的官方理由是什么？ (Alasan apa yang diberikan pelayan restoran untuk membenarkan harga telur tomat 200 yuan?)",
                    options = listOf("厨师获得了米其林三星 (Koki bintang Michelin)", "声称所使用的西红柿和鸡蛋全都是直接从新西兰跨洋进口的 (Mengklaim tomat dan telurnya diimpor langsung dari Selandia Baru)", "盘子是用纯黄金打造的 (Piringnya terbuat dari emas)", "餐厅附赠免费音乐表演 (Dapat pertunjukan musik)"),
                    correctAnswerIndex = 1,
                    explanation = "Pelayan berdalih: '您看这个西红柿和鸡蛋都是从新西兰进口的'."
                ),
                StoryQuestion(
                    id = "q_impnzl_3",
                    questionText = "对于在附近超市普通采购的中国本土豆腐也能卖出一百多元，女服务员给出了怎样令人捧腹绝倒的奇葩解释？ (Penjelasan menggelikan apa yang diberikan pelayan mengapa tahu lokal supermarket dihargai lebih dari 100 yuan?)",
                    options = listOf("豆腐是用百年山泉水浸泡的 (Tahu direndam mata air 100 tahun)", "因为刚才代表餐厅跑腿去超市采购豆腐的那位服务员，是一名来自新西兰的外国留学生 (Karena staf pelayan yang disuruh pergi membeli tahu ke supermarket adalah mahasiswa asing asal Selandia Baru)", "超市距离餐厅整整一万里 (Supermarketnya jauh)", "豆腐里包了钻石 (Ada berlian di tahu)"),
                    correctAnswerIndex = 1,
                    explanation = "Teks menyajikan puncak humor: '因为这个去买豆腐的服务员，是个新西兰的留学生！'."
                )
            )
        ),

        // Cerita Mandarin Bean 327 (HSK 3): Apply Mechanically (Meniru Tebak-Tebakan Secara Kaku)
        Story(
            id = "story_apply_mechanically",
            titleHanzi = "死板套用谜语",
            titlePinyin = "Sǐbǎn Tàoyòng Míyǔ",
            titleTranslation = "Apply Mechanically (Meniru Tebak-Tebakan Secara Kaku)",
            level = "HSK 3",
            category = "Cerita Lucu & Logika",
            description = "Pelayan restoran memberikan tebak-tebakan: 'Anak ayah-ibu saya bukan saudara lelaki/perempuan, siapa dia? Jawabannya saya'; sang tamu yang mencoba mengulangi tebak-tebakan ke temannya malah menjawab 'seorang pelayan restoran'.",
            coverEmoji = "🧩",
            coverImageRes = R.drawable.cover_story_apply_mechanically,
            estimatedReadMinutes = 1,
            sentences = listOf(
                Sentence(
                    id = "s_aplymc_1",
                    hanzi = "饭馆侍者向顾客出谜：“双亲所诞之子，既非我之兄弟，亦非我之姊妹，此人究竟为何方神圣？”食客百思不解，侍者得意揭晓谜底：“正是在下鄙人我自己！”",
                    pinyin = "fàn guǎn shì zhě xiàng gù kè chū mí shuāng qīn suǒ dàn zhī zǐ jì fēi wǒ zhī xiōng dì yì fēi wǒ zhī zǐ mèi cǐ rén jiū jìng wèi hé fāng shén shèng shí kè bǎi sī bù jiě shì zhě dé yì jiē xiǎo mí dǐ zhèng shì zài xià bǐ rén wǒ zì jǐ",
                    translation = "Pelayan restoran memberi teka-teki kepada tamu: 'Anak yang dilahirkan oleh ayah dan ibu saya, bukan saudara laki-laki saya dan bukan saudara perempuan saya, siapakah dia?'; sang tamu tak bisa menjawab, dan pelayan dengan bangga menjawab: 'Dialah saya sendiri!'.",
                    tokens = listOf(
                        WordToken("服务员", "fú wù yuán", "waiter", "Kosakata HSK 2: 服务员"),
                        WordToken("顾客", "gù kè", "customer / client", "Kosakata HSK 3: 顾客 (gù kè)"),
                        WordToken("猜谜语", "cāi mí yǔ", "guess riddles", "Bermain teka-teki"),
                        WordToken("兄弟", "xiōng dì", "brothers", "Kosakata HSK 3: 兄弟 (xiōng dì)"),
                        WordToken("姐妹", "jiě mèi", "sisters", "Kosakata HSK 3: 姐妹")
                    )
                ),
                Sentence(
                    id = "s_aplymc_2",
                    hanzi = "食客如获至宝返家向密友现学现卖复述原谜，友人冥思苦想良久举手投降探问其详，食客竟脱口而出胸有成竹答曰：“谜底乃是方才那家饭馆的服务员！”",
                    pinyin = "shí kè rú huò zhì bǎo fǎn jiā xiàng mì yǒu xiàn xué xiàn mài fù shù yuán mí yǒu rén míng sī kǔ xiǎng liáng jiǔ jǔ shǒu tóu xiáng tàn wèn qí xiáng shí kè jìng tuō kǒu ér chū xiōng yǒu chéng zhú dá yuē mí dǐ nǎi shì fāng cái nà jiā fàn guǎn de fú wù yuán",
                    translation = "Tamu tersebut merasa teka-teki itu sangat bagus lalu mengulanginya persis kepada sahabatnya di rumah; saat sahabatnya menyerah dan bertanya siapa jawabannya, sang tamu dengan yakin menjawab: 'Jawabannya adalah seorang pelayan restoran tadi!'.",
                    tokens = listOf(
                        WordToken("父母", "fù mǔ", "parents", "Kosakata HSK 3: 父母 (fù mǔ)"),
                        WordToken("朋友", "péng you", "friend", "Kosakata HSK 1: 朋友 (péng you)"),
                        WordToken("知道", "zhī dào", "to know", "Kosakata HSK 1: 知道 (zhī dào)")
                    )
                ),
                Sentence(
                    id = "s_aplymc_3",
                    hanzi = "在尚未参透事物内在运行逻辑本质前，若只会机械生搬硬套外在表象传话，无异于贻笑大方的当代掩耳盗铃跳梁小丑。",
                    pinyin = "zài shàng wèi cān tòu shì wù nèi zài yùn xíng luó jí běn zhì qián ruò zhǐ huì jī xiè shēng bān yìng tào wài zài biǎo xiàng chuán huà wú yì yú yí xiào dà fāng de dāng dài yǎn ěr dào líng tiào liáng xiǎo chǒu",
                    translation = "Ketika kita sendiri belum benar-benar memahami logika esensial dari suatu perkara, meniru dan mengulanginya secara kaku tanpa mencerna akal sehat adalah hal yang sangat konyol dan memalukan.",
                    tokens = listOf(
                        WordToken("断定", "duàn dìng", "to conclude / determine", "Kosakata HSK 3: 断定"),
                        WordToken("是否", "shì fǒu", "whether or not", "Kosakata HSK 3: 是否 (shì fǒu)"),
                        WordToken("重复", "chóng fù", "to repeat / duplicate", "Kosakata HSK 3: 重复 (chóng fù)"),
                        WordToken("事实", "shì shí", "fact", "Kosakata HSK 3: 事实 (shì shí)"),
                        WordToken("愚蠢", "yú chǔn", "foolish / stupid", "Kosakata HSK 3: 愚蠢 (yú chǔn)")
                    )
                )
            ),
            questions = listOf(
                StoryQuestion(
                    id = "q_aplymc_1",
                    questionText = "饭馆服务员给顾客出的谜语“我父母生了个孩子，既不是我兄弟，也不是我姐妹，此人是谁？”的原本逻辑正确答案是什么？ (Apa jawaban logika yang benar dari tebak-tebakan pelayan restoran?)",
                    options = listOf("邻居大叔 (Paman tetangga)", "谜题讲述者“我自己”（也就是说话人本人） (Si pembicara itu sendiri)", "外星人 (Alien)", "双胞胎表妹 (Sepupu kembar)"),
                    correctAnswerIndex = 1,
                    explanation = "Teks menyatakan: '服务员告诉他：是我'."
                ),
                StoryQuestion(
                    id = "q_aplymc_2",
                    questionText = "那位死板生搬硬套的顾客回到家里让自己的朋友猜同一个谜语时，给出了怎样让人啼笑皆非的荒唐答案？ (Jawaban konyol apa yang diberikan sang tamu saat mengulang tebak-tebakan ke temannya?)",
                    options = listOf("是他的亲生母亲 (Ibunya sendiri)", "“是一个服务员！” (Adalah seorang pelayan restoran!)", "是外卖骑手 (Kurir)", "是小学班主任 (Wali kelas)"),
                    correctAnswerIndex = 1,
                    explanation = "Teks mencatat puncak komedi: '他的朋友问：是谁？这位顾客回答：是一个服务员'."
                ),
                StoryQuestion(
                    id = "q_aplymc_3",
                    questionText = "这则幽默微型寓言通过讽刺机械照抄，旨在教育大家在学习与认知事物时应当杜绝什么错误习惯？ (Pelajaran apa yang disindir dari cerita tiru-meniru yang kaku ini?)",
                    options = listOf("不要去餐馆吃饭 (Jangan makan di resto)", "切忌在自己尚未真正透彻理解本质原理时，就生搬硬套、死板机械地向他人复述重复 (Jangan meniru dan mengulangi sesuatu secara kaku dan membabi-buta sebelum paham maknanya)", "不要和朋友猜任何谜语 (Jangan main tebak-tebakan)", "不要跟服务员多说话 (Jangan bicara dengan pelayan)"),
                    correctAnswerIndex = 1,
                    explanation = "Teks menyimpulkan pelajaran berharga: '当我们自己不能断定我们是否真的明白了一切的时候，向其他人重复那个我们认识的事实，就是一件最愚蠢的事情'."
                )
            )
        ),

        // Cerita Mandarin Bean 328 (HSK 3): Boxer’s Mistake (Jaket Petinju dan Pelari Cepat)
        Story(
            id = "story_boxers_mistake",
            titleHanzi = "拳击手的大衣与跑步健将",
            titlePinyin = "Quánjīshǒu de Dàyī yǔ Pǎobù Jiànjiàng",
            titleTranslation = "Boxer's Mistake (Jaket Sang Petinju & Sang Pelari Cepat)",
            level = "HSK 3",
            category = "Cerita Lucu & Kehidupan",
            description = "Petinju berbadan kekar menggantungkan jaket di pintu restoran dengan pesan: 'Jaket ini milik petinju, saya segera kembali'; saat selesai makan jaketnya raib diganti pesan: 'Jaket diambil pelari cepat, ia tak akan kembali lagi!'.",
            coverEmoji = "🥊",
            coverImageRes = R.drawable.cover_story_boxers_mistake,
            estimatedReadMinutes = 1,
            sentences = listOf(
                Sentence(
                    id = "s_bxrmst_1",
                    hanzi = "一位孔武有力、身形魁梧的职业拳击手前往餐厅就餐，为防名贵大衣在衣帽钩失窃，他特意在衣领附留霸气字条威慑旁人：“拳击手大衣在此，片刻即回！”",
                    pinyin = "yī wèi kǒng wǔ yǒu lì shēn xíng kuí wu de zhí yè quán jī shǒu qián wǎng cān tīng jiù cān wèi fáng míng guì dà yī zài yī mào gōu shī qiè tā tè yì zài yī lǐng fù liú bà qì zì tiáo wēi shè páng rén quán jī shǒu dà yī zài cǐ piàn kè jí huí",
                    translation = "Seorang petinju bertubuh kekar dan tinggi besar pergi makan di restoran; agar mantel jaket tebalnya tidak dicuri orang, ia sengaja meninggalkan secarik kertas gertakan: 'Mantel milik atlet tinju ada di sini, saya akan segera kembali!'.",
                    tokens = listOf(
                        WordToken("身材", "shēn cái", "figure / stature", "Kosakata HSK 3: 身材 (shēn cái)"),
                        WordToken("拳击手", "quán jī shǒu", "boxer", "Atlet tinju"),
                        WordToken("脱下", "tuō xià", "to take off (coat)", "Kosakata HSK 3: 脱 (tuō)"),
                        WordToken("大衣", "dà yī", "overcoat / coat", "Kosakata pakaian"),
                        WordToken("纸条", "zhǐ tiáo", "slip of paper / note", "Secarik kertas pesan")
                    )
                ),
                Sentence(
                    id = "s_bxrmst_2",
                    hanzi = "拳王志得意满大快朵颐，饱餐欲取大衣时却惊觉衣架空空如也，唯余一张嘲弄字条字迹娟秀：“杰出短跑运动员取走大衣，他绝不再回！”",
                    pinyin = "quán wáng zhì dé yì mǎn dà kuài duǒ yí bǎo cān yù qǔ dà yī shí què jīng jué yī jià kōng kōng rú yě wéi yú yī zhāng cháo nòng zì tiáo zì jì juān xiù jié chū duǎn pǎo yùn dòng yuán qǔ zǒu dà yī tā jué bù zài huí",
                    translation = "Sang petinju makan dengan tenang; namun saat selesai makan dan hendak mengambil jaketnya, mantelnya sudah lenyap tak berbekas, hanya tersisa selembar kertas balasan: 'Seorang atlet pelari cepat telah mengambil mantel ini, dan ia tidak akan kembali lagi!'.",
                    tokens = listOf(
                        WordToken("放心", "fàng xīn", "feel relieved", "Kosakata HSK 3: 放心 (fàng xīn)"),
                        WordToken("杰出", "jié chū", "outstanding", "Kosakata HSK 3: 杰出"),
                        WordToken("跑步", "pǎo bù", "to run", "Kosakata HSK 2: 跑步 (pǎo bù)"),
                        WordToken("运动员", "yùn dòng yuán", "athlete / sportsman", "Kosakata HSK 2: 运动员")
                    )
                ),
                Sentence(
                    id = "s_bxrmst_3",
                    hanzi = "寸有所长尺有所短，切莫一味狂妄紧盯自身强项而盲目托大；善于明察他人之所长、正视自身之所不及，方是保全立身之智。",
                    pinyin = "cùn yǒu suǒ cháng chǐ yǒu suǒ duǎn qiè mò yī wèi kuáng wàng jǐn dīng zì shēn qiáng xiàng ér máng mù tuō dà shàn yú míng chá tā rén zhī suǒ cháng zhèng shì zì shēn zhī suǒ bù jí fāng shì bǎo quán lì shēn zhī zhì",
                    translation = "Setiap orang memiliki kelebihan dan keterbatasan masing-masing; janganlah terlalu sombong hanya memamerkan keunggulan sendiri hingga meremehkan orang lain; pandai melihat kelebihan orang lain dan menyadari kekurangan diri sendiri adalah hal yang sangat penting.",
                    tokens = listOf(
                        WordToken("优点", "yōu diǎn", "merit / strong point", "Kosakata HSK 3: 优点 (yōu diǎn)"),
                        WordToken("未必", "wèi bì", "not necessarily", "Kosakata HSK 3: 未必"),
                        WordToken("长处", "cháng chù", "strength / advantage", "Kosakata HSK 3: 长处"),
                        WordToken("忽略", "hū lüè", "to neglect / overlook", "Kosakata HSK 3: 忽略 (hū lüè)")
                    )
                )
            ),
            questions = listOf(
                StoryQuestion(
                    id = "q_bxrmst_1",
                    questionText = "身材高大的拳击手去餐馆就餐挂大衣时，为了震慑潜在小偷，在纸条上写了什么耀武扬威的话？ (Pesan gertakan apa yang ditulis petinju di secarik kertas pada jaketnya?)",
                    options = listOf("“这件大衣破了不要拿” (Jaket sobek jangan diambil)", "“拳击手的大衣在此，我一会儿就回来” (Jaket milik atlet tinju ada di sini, saya akan segera kembali)", "“偷衣服的人要付一万元” (Denda 10.000)", "“里面装有炸弹” (Ada bom)"),
                    correctAnswerIndex = 1,
                    explanation = "Teks menyatakan: '所以他在大衣上留下了一张纸条：拳击手的大衣在此，我一会儿就回来'."
                ),
                StoryQuestion(
                    id = "q_bxrmst_2",
                    questionText = "当拳击手吃完饭出来取衣服时，发现大衣早已被谁顺手牵羊、留下了什么幽默反讽字条？ (Siapa yang mengambil jaket itu dan pesan balasan apa yang ditinggalkan?)",
                    options = listOf("被餐馆老板洗干净了 (Dicuci pemilik resto)", "被一位“杰出的跑步运动员”拿走了，并留下纸条声明“他不再回来了” (Diambil oleh pelari cepat dengan pesan: 'ia tak akan pernah kembali lagi')", "被警察没收 (Disita polisi)", "衣服掉在地上被狗叼走了 (Digondol anjing)"),
                    correctAnswerIndex = 1,
                    explanation = "Teks mencatat puncak komedi: '上面写着：杰出的跑步运动员拿走了大衣，他不再回来了！'."
                ),
                StoryQuestion(
                    id = "q_bxrmst_3",
                    questionText = "这则故事通过“力拔千钧的拳击手败给脚底抹油的跑步选手”的绝妙讽刺，告诫了人们怎样的处世真理？ (Kebenaran moral apa yang disindir dari kisah petinju dan pelari cepat ini?)",
                    options = listOf("所有运动员都不能穿大衣 (Atlet dilarang pakai mantel)", "人各有所长各有所短，切莫自恃某一特长便盲目自大而忽视自身局限 (Setiap orang memiliki kelebihan masing-masing; jangan sombong memamerkan kekuatan sendiri sambil melupakan keterbatasan)", "去饭馆吃饭必须把大衣穿在身上 (Makan wajib pakai jaket)", "跑步运动员比拳击手更有钱 (Pelari lebih kaya dari petinju)"),
                    correctAnswerIndex = 1,
                    explanation = "Teks menyimpulkan: '每个人都有自己的优点... 不要总是盯着自己的长处而忽略了自己的不足，善于看到别人的长处和发现自己的不足也是很重要的'."
                )
            )
        ),

        // Cerita Mandarin Bean 329 (HSK 3): Giving Is Happiness (Pangeran yang Bermuram Durja)
        Story(
            id = "story_giving_is_happiness",
            titleHanzi = "给别人带去快乐的王子",
            titlePinyin = "Gěi Biéren Dàiqù Kuàilè de Wángzǐ",
            titleTranslation = "Giving Is Happiness (Resep Bahagia Sang Pangeran)",
            level = "HSK 3",
            category = "Dongeng & Nilai Kebajikan",
            description = "Seorang pangeran muda memiliki segalanya namun selalu bermuram durja; seorang bijak membawakan sepucuk surat rahasia yang membuatnya menjadi pemuda paling bahagia di kerajaan: 'Lakukan satu kebaikan untuk orang lain setiap hari!'.",
            coverEmoji = "👑",
            coverImageRes = R.drawable.cover_story_giving_is_happiness,
            estimatedReadMinutes = 2,
            sentences = listOf(
                Sentence(
                    id = "s_gvghpy_1",
                    hanzi = "古国国王万般宠溺爱子，年轻王子坐拥锦衣玉食与世间一切奢望，然而他却日日愁眉深锁、满目郁郁寡欢。",
                    pinyin = "gǔ guó guó wáng wàn bān chǒng nì ài zǐ nián qīng wáng zǐ zuò yōng jǐn yī yù shí yǔ shì jiān yī qiè shē wàng rán ér tā què rì rì chóu méi shēn suǒ mǎn mù yù yù guǎ huān",
                    translation = "Dahulu kala seorang raja sangat memanjakan putra tercintanya; pangeran muda itu dapat memperoleh segala hal yang ia inginkan di dunia, namun ia justru kerap mengerutkan kening dan hidup tanpa senyum kebahagiaan.",
                    tokens = listOf(
                        WordToken("国王", "guó wáng", "king", "Raja monarki"),
                        WordToken("王子", "wáng zǐ", "prince", "Pangeran kerajaan"),
                        WordToken("然而", "rán ér", "however / yet", "Kosakata HSK 3: 然而 (rán ér)"),
                        WordToken("快乐", "kuài lè", "happy / happiness", "Kosakata HSK 2: 快乐 (kuài lè)")
                    )
                ),
                Sentence(
                    id = "s_gvghpy_2",
                    hanzi = "一位智者造访王宫面圣，立誓有灵丹妙方可解王子心结，国王欣喜应允：若能功成，任何非分厚赏皆予准行。",
                    pinyin = "yī wèi zhì zhě zào fǎng wáng gōng miàn shèng lì shì yǒu líng dān miào fāng kě jiě wáng zǐ xīn jié guó wáng xīn xǐ yīng yǔn ruò néng gōng chéng rèn hé fēi fèn hòu shǎng jiē yǔ zhǔn xíng",
                    translation = "Suatu hari seorang bijak memasuki istana kerajaan dan berkata kepada sang raja bahwa ia memiliki cara ampuh untuk membuat pangeran bahagia kembali; raja dengan gembira berjanji akan mengabulkan permintaan apa pun jika tugas itu berhasil.",
                    tokens = listOf(
                        WordToken("王宫", "wáng gōng", "royal palace", "Istana raja"),
                        WordToken("办法", "bàn fǎ", "method / way", "Kosakata HSK 2: 办法 (bàn fǎ)"),
                        WordToken("任何", "rèn hé", "any / whatever", "Kosakata HSK 3: 任何 (rèn hé)"),
                        WordToken("答应", "dā ying", "to agree / promise", "Kosakata HSK 3: 答应 (dā ying)")
                    )
                ),
                Sentence(
                    id = "s_gvghpy_3",
                    hanzi = "智者呈递锦囊密函嘱其严遵践行，王子依教奉行果成举国最快乐之少年；密函唯留一行真谛：“每日力行一件扶弱善事！”",
                    pinyin = "zhì zhě chéng dì jǐn náng mì hán zhǔ qí yán zūn jiàn xíng wáng zǐ yī jiào fèng xíng guǒ chéng jǔ guó zuì kuài lè zhī shào nián mì hán wéi liú yī háng zhēn dì měi rì lì xíng yī jiàn fú ruò shàn shì",
                    translation = "Orang bijak itu menyerahkan sepucuk surat rahasia dan menyuruh sang pangeran menjalankannya; sang pangeran menuruti nasihat tersebut dan tak lama kemudian ia menjadi pemuda paling bahagia di seluruh negeri; isi surat itu bertuliskan: 'Setiap hari lakukanlah satu perbuatan baik untuk orang lain!'.",
                    tokens = listOf(
                        WordToken("按照", "àn zhào", "according to / in light of", "Kosakata HSK 3: 按照 (àn zhào)"),
                        WordToken("不久", "bù jiǔ", "not long / soon", "Kosakata HSK 3: 不久 (bù jiǔ)"),
                        WordToken("少年", "shào nián", "youth / juvenile", "Kosakata HSK 3: 少年"),
                        WordToken("善事", "shàn shì", "good deed / charity", "Perbuatan kebajikan")
                    )
                )
            ),
            questions = listOf(
                StoryQuestion(
                    id = "q_gvghpy_1",
                    questionText = "古国国王深爱独子并满足了他的一切物质索求，但年轻的王子在富贵生活中表现出了怎样的反常状态？ (Keadaan aneh apa yang dialami pangeran meski memiliki segala kemewahan?)",
                    options = listOf("整天在王宫里练剑 (Latihan pedang seharian)", "常常紧皱眉头，生活得非常不快乐、充满烦闷 (Kerap mengerutkan dahi, hidup murung dan merasa tidak bahagia)", "要求国王退位给自己 (Minta tahta)", "把所有大臣都赶出国境 (Mengusir menteri)"),
                    correctAnswerIndex = 1,
                    explanation = "Teks menyatakan: '这位年轻的王子可以得到一切他想要的东西，然而他却常常皱着眉头，很不快乐'."
                ),
                StoryQuestion(
                    id = "q_gvghpy_2",
                    questionText = "进宫揭榜的智者为了化解王子的抑郁心魔，交给了王子什么关键法宝？ (Benda penolong apa yang diserahkan sang bijak kepada pangeran?)",
                    options = listOf("一把镶嵌九颗钻石的宝剑 (Pedang berlian)", "一封写有行事指引的神秘信件，并嘱咐他务必严格照做 (Sepucuk surat petunjuk tindakan yang wajib ditaati dan dijalankan)", "一箱来自异国的纯金金币 (Peti koin emas)", "一颗神奇的魔法长生药 (Obat sihir panjang umur)"),
                    correctAnswerIndex = 1,
                    explanation = "Teks mencatat: '这个人给了一封信，并且告诉王子一定要按照信上说的做'."
                ),
                StoryQuestion(
                    id = "q_gvghpy_3",
                    questionText = "让原本愁容满面的王子脱胎换骨蜕变为举国最快乐少年的那句神秘信中真言是什么？ (Kalimat wasiat rahasia di dalam surat yang mengubah hidup sang pangeran menjadi bahagia adalah?)",
                    options = listOf("“抢夺邻国所有的金银财宝” (Rampas harta tetangga)", "“每天为别人做一件善事！” ('Setiap hari lakukanlah satu perbuatan baik untuk orang lain!')", "“每天在王宫大睡十二个小时” (Tidur 12 jam di istana)", "“把王宫所有的围墙拆掉” (Robohkan tembok istana)"),
                    correctAnswerIndex = 1,
                    explanation = "Teks menyimpulkan rahasia kebahagiaan sejati: '原来，信上只写了这样几个字：“每天为别人做一件善事！”'."
                )
            )
        ),

        // Cerita Mandarin Bean 330 (HSK 3): Happiness (Socrates dan Pembuat Perahu Kayu)
        Story(
            id = "story_socrates_happiness",
            titleHanzi = "苏格拉底与寻找快乐的青年",
            titlePinyin = "Sūgélǎdǐ yǔ Xúnzhǎo Kuàilè de Qīngnián",
            titleTranslation = "Happiness (Socrates & Perahu Kayu Pencari Kebahagiaan)",
            level = "HSK 3",
            category = "Filsafat & Makna Bahagia",
            description = "Sekelompok pemuda mengeluh menderita dan bertanya pada filsuf Socrates di mana letak kebahagiaan; Socrates mengajak mereka bergotong royong menebang pohon dan merakit perahu selama 49 hari hingga menemukan sukacita sejati.",
            coverEmoji = "⛵",
            coverImageRes = R.drawable.cover_story_socrates_happiness,
            estimatedReadMinutes = 2,
            sentences = listOf(
                Sentence(
                    id = "s_scrhpy_1",
                    hanzi = "一群苦闷青年满世界寻觅快乐芳踪，却一路碰壁饱受无尽烦恼与痛苦折磨，困惑之下请教先哲苏格拉底：“快乐究竟身在何方？”",
                    pinyin = "yī qún kǔ mèn qīng nián mǎn shì jiè xún mì kuài lè fāng zōng què yī lù pèng bì bǎo shòu wú jìn fán nǎo yǔ tòng kǔ zhé mó kùn huò zhī xià qǐng jiào xiān zhé Sū gé lā dǐ kuài lè jiū jìng shēn zài hé fāng",
                    translation = "Sekelompok pemuda berkelana ke mana-mana mencari arti kebahagiaan, namun di jalan hanya menjumpai aneka kegundahan dan kepedihan; dalam kebingungan mereka bertanya kepada filsuf agung Socrates: 'Di manakah sebenarnya letak kebahagiaan itu?'.",
                    tokens = listOf(
                        WordToken("寻找", "xún zhǎo", "to seek / look for", "Kosakata HSK 3: 寻找 (xún zhǎo)"),
                        WordToken("烦恼", "fán nǎo", "worries / vexation", "Kosakata HSK 3: 烦恼 (fán nǎo)"),
                        WordToken("痛苦", "tòng kǔ", "pain / suffering", "Kosakata HSK 3: 痛苦 (tòng kǔ)"),
                        WordToken("到底", "dào dǐ", "on earth / after all", "Kosakata HSK 3: 到底 (dào dǐ)")
                    )
                ),
                Sentence(
                    id = "s_scrhpy_2",
                    hanzi = "先哲不答反请青年合力造舟，诸生暂搁执念同心协力历经四十九个昼夜凿木为舟，泛舟碧波之上击节高歌、身心无比开怀愉悦。",
                    pinyin = "xiān zhé bù dá fǎn qǐng qīng nián hé lì zào zhōu zhū shēng zàn gē zhí niàn tóng xīn xié lì lì jīng sì shí jiǔ gè zhòu yè záo mù wèi zhōu fàn zhōu bì bō zhī shàng jī jié gāo gē shēn xīn wú bǐ kāi huái yú yuè",
                    translation = "Socrates tidak langsung menjawab melainkan meminta mereka membuatkan sebuah perahu; para pemuda mengesampingkan pencarian abstrak mereka dan bergotong royong selama 49 hari merakit perahu kayu, lalu berlayar di atas air sambil mendayung dan bernyanyi bersama penuh sukacita.",
                    tokens = listOf(
                        WordToken("造船", "zào chuán", "build a boat", "Kosakata membuat perahu"),
                        WordToken("暂时", "zàn shí", "temporarily", "Kosakata HSK 3: 暂时 (zàn shí)"),
                        WordToken("划船", "huá chuán", "to row a boat", "Kosakata HSK 3: 划船 (huá chuán)"),
                        WordToken("极了", "jí le", "extremely / exceedingly", "Tata bahasa HSK 3: ...极了")
                    )
                ),
                Sentence(
                    id = "s_scrhpy_3",
                    hanzi = "苏格拉底睿智点题：快乐从非刻意搜求之死物，它往往在全神贯注投身劳动与专注造福之时，如期而至悄然来访！",
                    pinyin = "Sū gé lā dǐ ruì zhì diǎn tí kuài lè cóng fēi kè yì sōu qiú zhī sǐ wù tā wǎng wǎng zài quán shén guàn zhù tóu shēn láo dòng yǔ zhuān zhù zào fú zhī shí rú qī ér zhì qiāo rán lái fǎng",
                    translation = "Socrates membagikan wejangan: 'Kebahagiaan sejatinya adalah seperti ini; ia sering kali datang berkunjung secara tiba-tiba justru di saat engkau sedang sibuk tekun mengerjakan hal-hal yang bermanfaat!'.",
                    tokens = listOf(
                        WordToken("往往", "wǎng wǎng", "often / frequently", "Kosakata HSK 3: 往往 (wǎng wǎng)"),
                        WordToken("事情", "shì qing", "matter / business", "Kosakata HSK 2: 事情 (shì qing)"),
                        WordToken("来访", "lái fǎng", "to come to visit", "Kosakata HSK 3: 来访")
                    )
                )
            ),
            questions = listOf(
                StoryQuestion(
                    id = "q_scrhpy_1",
                    questionText = "古希腊大哲学家苏格拉底在面对年轻人关于“快乐到底在哪里”的哲学追问时，给出了怎样的实际任务指令？ (Tugas nyata apa yang diberikan Socrates saat murid bertanya di mana kebahagiaan?)",
                    options = listOf("让他们坐下闭门冥想七天 (Duduk meditasi seminggu)", "让他们暂时放下寻找快乐的执念，齐心协力先帮自己建造一条木船 (Mengesampingkan pencarian sejenak dan bersama-sama membantunya membuat perahu)", "去市场上买十桶橄榄油 (Beli minyak zaitun)", "去攀登奥林匹斯山 (Mendaki gunung)"),
                    correctAnswerIndex = 1,
                    explanation = "Teks menyatakan: '苏格拉底说：你们还是先帮我造一条船吧！'."
                ),
                StoryQuestion(
                    id = "q_scrhpy_2",
                    questionText = "青年们花费了49天艰苦劳动造成独木舟并邀请老师泛舟湖上划船唱歌时，内心的精神体验变成了什么？ (Pengalaman batin apa yang dirasakan para pemuda saat mendayung perahu buatan mereka?)",
                    options = listOf("感到极度痛苦绝望 (Sangat menderita)", "整个人感到“快乐极了”，先前所有的烦恼烟消云散 (Merasa 'sangat bahagia sekali' / kuàilè jí le)", "全身脱力生病 (Sakit lemas)", "互相推卸责任吵架 (Saling menyalahkan)"),
                    correctAnswerIndex = 1,
                    explanation = "Teks mencatat: '苏格拉底问：孩子们，你们快乐吗？学生们回答：快乐极了！'."
                ),
                StoryQuestion(
                    id = "q_scrhpy_3",
                    questionText = "苏格拉底在这场造船教育实践中向后世揭示的关于“快乐真谛”的哲言是什么？ (Pelajaran filsafat agung apa yang diungkapkan Socrates tentang kebahagiaan?)",
                    options = listOf("只有当上国王才能快乐 (Hanya raja yang bahagia)", "快乐往往不是刻意苦寻来的，而是在你全心投入忙于创造和做其他有意义事情时，悄然降临造访 (Kebahagiaan bukan dicari-cari secara hampa, melainkan datang tiba-tiba saat kita sibuk berkarya)", "只要坐在船上就永远快乐 (Cuma duduk di perahu)", "金钱是快乐的唯一来源 (Uang satu-satunya sumber bahagia)"),
                    correctAnswerIndex = 1,
                    explanation = "Teks menyimpulkan sabda bijak Socrates: '苏格拉底说：快乐就是这样，它往往在你忙着做别的事情时突然来访'."
                )
            )
        ),

        // Cerita Mandarin Bean 331 (HSK 3): Imagination Is More Important (Imajinasi dan Pertarungan Juara Karate)
        Story(
            id = "story_imagination_important",
            titleHanzi = "空手道冠军与街头对决",
            titlePinyin = "Kōngshǒudào Guànjūn yǔ Jiētóu Duìjué",
            titleTranslation = "Imagination Is More Important (Imajinasi Mengalahkan Aturan Kaku)",
            level = "HSK 3",
            category = "Kecerdikan & Pola Pikir",
            description = "Juara karate kalah dalam perkelahian jalanan melawan orang biasa karena gerakannya terikat kaku oleh aturan resmi tanding dilarang memukul kepala; orang biasa langsung memukul hidungnya hingga tumbang. Imajinasi lebih penting dari hafalan kaku.",
            coverEmoji = "🥋",
            coverImageRes = R.drawable.cover_story_imagination_important,
            estimatedReadMinutes = 2,
            sentences = listOf(
                Sentence(
                    id = "s_imgimp_1",
                    hanzi = "常人若择决斗对手必定选避空手道冠军而挑寻常凡夫，因大众深信身经百战的武道冠军在近身搏击中占据压倒性优势。",
                    pinyin = "cháng rén ruò zé jué dòu duì shǒu bì dìng xuǎn bì kōng shǒu dào guàn jūn ér tiāo xún cháng fán fū yīn dà zhòng shēn xìn shēn jīng bǎi zhàn de wǔ dào guàn jūn zài jìn shēn bó jī zhōng zhàn jù yā dǎo xìng yōu shì",
                    translation = "Jika harus memilih lawan bertarung kebanyakan orang pasti memilih orang biasa daripada juara karate (*kōngshǒudào guànjūn*); sebab semua orang paham betul bahwa juara bela diri sangat lihai dalam bertarung.",
                    tokens = listOf(
                        WordToken("选择", "xuǎn zé", "to choose / select", "Kosakata HSK 3: 选择 (xuǎn zé)"),
                        WordToken("普通人", "pǔ tōng rén", "ordinary person", "Kosakata HSK 3: 普通"),
                        WordToken("空手道", "kōng shǒu dào", "Karate martial arts", "Seni bela diri karate"),
                        WordToken("冠军", "guàn jūn", "champion", "Kosakata HSK 3: 冠军 (guàn jūn)")
                    )
                ),
                Sentence(
                    id = "s_imgimp_2",
                    hanzi = "然而美利坚一桩街头斗殴大跌眼镜：冠军拳手恪守赛场条规拘泥于“禁击头颅”之铁律，未受规训的平民反手猛轰其脆弱鼻梁，冠军应声瘫倒折戟沉沙。",
                    pinyin = "rán ér Měi lì jiān yī zhuāng jiē tóu dòu ōu dà diē yǎn jìng guàn jūn quán shǒu kè shǒu sài chǎng tiáo guī jū nì yú jìn jī tóu lú zhī tiě lǜ wèi shòu guī xùn de píng mín fǎn shǒu měng hōng qí cuì ruò bí liáng guàn jūn yìng shēng tān dǎo zhé jǐ chén shā",
                    translation = "Namun dalam perkelahian jalanan di Amerika hal tak terduga terjadi: sang juara karate begitu terikat aturan tanding resmi dilarang memukul kepala, sedangkan lawannya yang orang biasa tanpa ragu langsung menghantam hidung sang juara hingga roboh tak berkutik.",
                    tokens = listOf(
                        WordToken("受到", "shòu dào", "to receive / suffer", "Kosakata HSK 3: 受到 (shòu dào)"),
                        WordToken("规则", "guī zé", "rule / regulation", "Kosakata HSK 3: 规则 (guī zé)"),
                        WordToken("头部", "tóu bù", "head (body part)", "Kepala"),
                        WordToken("鼻子", "bí zi", "nose", "Kosakata HSK 2: 鼻子 (bí zi)")
                    )
                ),
                Sentence(
                    id = "s_imgimp_3",
                    hanzi = "爱因斯坦名言由此再度昭彰：拘泥僵化知识往往作茧自缚，不受束缚的变通想象力与应变机变实比死板教条远为重要！",
                    pinyin = "Ài yīn sī tǎn míng yán yóu cǐ zài dù zhāo zhāng jū nì jiāng huà zhī shi wǎng wǎng zuò jiǎn zì fù bù shòu shù fù de biàn tōng xiǎng xiàng lì yǔ yìng biàn jī biàn shí bǐ sǐ bǎn jiào tiáo yuǎn wèi zhòng yào",
                    translation = "Hal ini membuktikan kata mutiara Einstein: terjebak oleh aturan kaku hanya akan mengekang gerak langkah; imajinasi dan fleksibilitas berpikir sering kali jauh lebih berharga dan menentukan daripada sekadar pengetahuan teoritis!",
                    tokens = listOf(
                        WordToken("想象力", "xiǎng xiàng lì", "imagination", "Kosakata HSK 3: 想象力"),
                        WordToken("知识", "zhī shi", "knowledge", "Kosakata HSK 3: 知识 (zhī shi)"),
                        WordToken("重要", "zhòng yào", "important", "Kosakata HSK 2: 重要 (zhòng yào)")
                    )
                )
            ),
            questions = listOf(
                StoryQuestion(
                    id = "q_imgimp_1",
                    questionText = "按照常理推断，如果在街头发生肢体冲突，绝大多数普通人本能会做出怎样的规避选择？ (Secara logika umum, lawan seperti apa yang dipilih orang saat terdesak?)",
                    options = listOf("偏要挑选空手道全国冠军较量 (Memilih juara karate)", "肯定选择同普通的常人周旋，因为知道冠军精通格斗技巧胜算极低 (Memilih orang biasa karena tahu atlet juara karate sangat terlatih bertarung)", "选择与裁判打架 (Melawan wasit)", "闭上眼睛躺在地上 (Rebahan tutup mata)"),
                    correctAnswerIndex = 1,
                    explanation = "Teks menyatakan: '相信大部分的人会选择普通人。因为大家很清楚，空手道冠军很会打架'."
                ),
                StoryQuestion(
                    id = "q_imgimp_2",
                    questionText = "在那场真实的美国街头对决中，赫赫有名的空手道冠军最终失手被击倒惨败的核心技术致命短板是什么？ (Kelemahan apa yang membuat juara karate kalah dari orang biasa di jalanan?)",
                    options = listOf("冠军当时正在发高烧 (Sedang demam)", "长期受正规竞技体育比赛安全规则的思维束缚（规定不打头部），而普通人毫无规则限制直接狠击其鼻梁 (Terbiasa aturan turnamen resmi dilarang memukul kepala, sedangkan orang biasa langsung menghantam hidungnya)", "普通人拿出了激光枪 (Orang biasa bawa senjata)", "路面结冰太滑 (Jalanan licin)"),
                    correctAnswerIndex = 1,
                    explanation = "Teks menjelaskan: '因为空手道冠军受到规则的束缚，不打头部，但是另一个人没有学过，重重地打了他的鼻子，然后他就站不起来了'."
                ),
                StoryQuestion(
                    id = "q_imgimp_3",
                    questionText = "故事结尾借爱因斯坦著名论断深刻阐述的思维真谛是什么？ (Pelajaran berpikir apa yang ditegaskan di akhir teks?)",
                    options = listOf("所有人都不应该学习武术 (Dilarang belajar beladiri)", "想象力与打破常规的应变思维比死板僵化的教条知识更加重要 (Imajinasi dan fleksibilitas berpikir di luar pakem kaku jauh lebih penting daripada hafalan aturan)", "鼻子是人体最硬的部位 (Hidung paling keras)", "比赛规则比生命更重要 (Aturan lebih penting dari nyawa)"),
                    correctAnswerIndex = 1,
                    explanation = "Teks menyimpulkan: '所以，想象力比知识更重要！' (Oleh karena itu, imajinasi dan fleksibilitas berpikir jauh lebih penting daripada aturan pengetahuan kaku)."
                )
            )
        ),

        // Cerita Mandarin Bean 332 (HSK 3): Two Hours of Life Changing (Dua Jam Sehari Mengubah Takdir Hidup)
        Story(
            id = "story_two_hours_changing",
            titleHanzi = "改变人生的每天两小时",
            titlePinyin = "Gǎibiàn Rénshēng de Měitiān Liǎng Xiǎoshí",
            titleTranslation = "Two Hours of Life Changing (Dua Jam Sehari Mengubah Takdir)",
            level = "HSK 3",
            category = "Karier & Pengembangan Diri",
            description = "Teman kuliah yang dulu kemampuannya biasa-biasa saja mengejutkan reuni dengan mendirikan perusahaan besar; rahasia suksesnya sederhana: konsisten belajar manajemen bisnis 2 jam setiap hari setelah wisuda.",
            coverEmoji = "📈",
            coverImageRes = R.drawable.cover_story_two_hours_changing,
            estimatedReadMinutes = 2,
            sentences = listOf(
                Sentence(
                    id = "s_twohrch_1",
                    hanzi = "在一次大学毕业同窗聚会上，一位昔日默默无闻、学业资质平平的同窗以异军突起的卓越商业成就震撼全场。",
                    pinyin = "zài yī cì dà xué bì yè tóng chuāng jù huì shàng yī wèi xī rì mò mò wú wén xué yè zī zhì píng píng de tóng chuāng yǐ yì jūn tū qǐ de zhuó yuè shāng yè chéng jiù zhèn hàn quán chǎng",
                    translation = "Dalam sebuah reuni temu alumni kampus, seorang teman sekelas yang di masa kuliah berprestasi biasa-biasa saja mencuri perhatian semua orang karena kesuksesan karier bisnisnya yang luar biasa cemerlang.",
                    tokens = listOf(
                        WordToken("聚会", "jù huì", "gathering / reunion", "Kosakata HSK 3: 聚会 (jù huì)"),
                        WordToken("事业", "shì yè", "career / undertaking", "Kosakata HSK 3: 事业 (shì yè)"),
                        WordToken("成功", "chéng gōng", "successful", "Kosakata HSK 3: 成功 (chéng gōng)"),
                        WordToken("印象", "yìn xiàng", "impression", "Kosakata HSK 3: 印象 (yìn xiàng)")
                    )
                ),
                Sentence(
                    id = "s_twohrch_2",
                    hanzi = "面对惊诧旧友关于发迹秘诀的诚恳探问，他淡然笑答并无捷径奇术，唯将毕生泰半心血数十年如一日专攻一事。",
                    pinyin = "miàn duì jīng chà jiù yǒu guān yú fā jì mì jué de chéng kěn tàn wèn tā dàn rán xiào dá bìng wú jié jìng qí shù wéi jiāng bì shēng tài bàn xīn xuè shù shí nián rú yī rì zhuān gōng yī shì",
                    translation = "Menghadapi pertanyaan heran kawan-kawan lamanya mengenai resep sukses (*mìjué*), ia tersenyum menjawab tidak ada rahasia mistis apa pun, melainkan ia hanya mencurahkan sebagian besar waktunya fokus konsisten pada satu hal saja.",
                    tokens = listOf(
                        WordToken("秘诀", "mì jué", "secret of success / key", "Rahasia sukses"),
                        WordToken("部分", "bù fen", "part / portion", "Kosakata HSK 3: 部分 (bù fen)"),
                        WordToken("时间", "shí jiān", "time", "Kosakata HSK 1: 时间 (shí jiān)")
                    )
                ),
                Sentence(
                    id = "s_twohrch_3",
                    hanzi = "原来毕业伊始他每日雷打不动辟出两小时钻研现代企业管理，积跬步至千里，雄厚的智慧沉淀终令其领航巨舰公司飞跃腾达。",
                    pinyin = "yuán lái bì yè yī shǐ tā měi rì léi dǎ bù dòng pì chū liǎng xiǎo shí zuān yán xiàn dài qǐ yè guǎn lǐ jī kuǐ bù zhì qiān lǐ xióng hòu de zhì huì chén diàn zhōng lìng qí lǐng háng jù jiàn gōng sī fēi yuè téng dá",
                    translation = "Rupanya semenjak wisuda ia setiap hari meluangkan waktu 2 jam tanpa putus untuk tekun mempelajari manajemen bisnis; akumulasi ilmu yang mendalam itulah yang membuatnya mampu mendirikan dan membesarkan perusahaannya menjadi raksasa.",
                    tokens = listOf(
                        WordToken("企业", "qǐ yè", "enterprise / company", "Kosakata HSK 3: 企业 (qǐ yè)"),
                        WordToken("管理", "guǎn lǐ", "management / to manage", "Kosakata HSK 3: 管理 (guǎn lǐ)"),
                        WordToken("积累", "jī lěi", "accumulation / to accumulate", "Kosakata HSK 3: 积累 (jī lěi)")
                    )
                )
            ),
            questions = listOf(
                StoryQuestion(
                    id = "q_twohrch_1",
                    questionText = "在大学毕业后的同学聚会上，那位引起全场瞩目引起广泛赞叹的同学有着怎样昔日反差强烈的背景？ (Latar belakang masa lalu apa dari teman tersebut yang membuat teman-teman reuni kaget?)",
                    options = listOf("大学时代就是全校学生会主席 (Ketua BEM kampus)", "在大家过去的旧有印象中并非拔尖优秀之士，学业成绩与各项能力都平平无奇 (Dulu prestasinya biasa-biasa saja dan tidak terlalu menonjol)", "曾经是全校体育冠军 (Juara olahraga)", "来自全省最富有的豪门 (Keluarga konglomerat)"),
                    correctAnswerIndex = 1,
                    explanation = "Teks menyatakan: '但是在大家以前的印象中，这位同学不是一位优秀的人，成绩和各方面的能力都很一般'."
                ),
                StoryQuestion(
                    id = "q_twohrch_2",
                    questionText = "这位成功企业家在被问及改变人生命运的制胜秘诀时，透露了哪项长年坚持的自律日常习惯？ (Kebiasaan disiplin harian apa yang diungkapkannya sebagai kunci sukses?)",
                    options = listOf("每天买两张福利彩票 (Beli lotere tiap hari)", "大学毕业后坚持每天抽出整整两个小时专心致志研读企业管理 (Konsisten meluangkan waktu 2 jam setiap hari belajar manajemen bisnis)", "每天去健身房锻炼六小时 (Gym 6 jam)", "每天只睡两小时 (Tidur 2 jam)"),
                    correctAnswerIndex = 1,
                    explanation = "Teks menjelaskan: '大学毕业后，他每天都会拿出两个小时来学习企业管理'."
                ),
                StoryQuestion(
                    id = "q_twohrch_3",
                    questionText = "他的企业最终能够如雨后春笋般迅速发展壮大、取得辉煌成就的坚实基石是什么？ (Fondasi utama apa yang membuat perusahaannya berkembang pesat?)",
                    options = listOf("全靠运气和炒作 (Hanya modal hoki)", "数年如一日持之以恒带来的深厚知识与实践积累 (Akumulasi ilmu dan wawasan mendalam berkat ketekunan bertahun-tahun)", "向国外银行借了巨款 (Utang bank asing)", "垄断了所有的原材料 (Monopoli bahan baku)"),
                    correctAnswerIndex = 1,
                    explanation = "Teks menyimpulkan: '因为有丰富的积累，他的公司很快就变得越来越大' (Karena memiliki akumulasi fondasi yang kaya, perusahaannya berkembang pesat)."
                )
            )
        ),

        // Cerita Mandarin Bean 333 (HSK 3): Cup (Filosofi Cangkir Kosong dan Menemukan Diri)
        Story(
            id = "story_empty_cup_mind",
            titleHanzi = "空杯心态与找回自己",
            titlePinyin = "Kōng Bēi Xīntài yǔ Zhǎohuí Zìjǐ",
            titleTranslation = "Cup (Filosofi Cangkir: Membuang Ambisi & Menemukan Jati Diri)",
            level = "HSK 3",
            category = "Filsafat Hidup & Pencerahan Batin",
            description = "Cangkir berisi air disebut air, berisi susu disebut susu; hanya saat kosong orang melihatnya sebagai cangkir murni. Begitu pula manusia: saat hati penuh dengan ambisi harta dan tahta, kita kehilangan jati diri kita yang sejati.",
            coverEmoji = "🍵",
            coverImageRes = R.drawable.cover_story_empty_cup_mind,
            estimatedReadMinutes = 2,
            sentences = listOf(
                Sentence(
                    id = "s_emptcp_1",
                    hanzi = "杯盏若斟满甘泉人们目之所及皆呼为“水”，斟满乳酪则唤作“牛奶”，唯其空无一物澄澈见底之际，世人方叹：“瞧，这是一只纯粹的杯子！”",
                    pinyin = "bēi zhǎn ruò zhēn mǎn gān quán rén men mù zhī suǒ jí jiē hū wèi shuǐ zhēn mǎn rǔ lào zé huàn zuò niú nǎi wéi qí kōng wú yī wù chéng chè jiàn dǐ zhī jì shì rén fāng tàn qiáo zhè shì yī zhī chún cuì de bēi zi",
                    translation = "Ketika sebuah cangkir diisi penuh air, orang-orang akan menyebutnya 'ini air'; ketika diisi susu, orang akan menyebutnya 'ini susu'; hanya saat cangkir itu kosong tidak memuat apa pun, barulah orang berujar: 'Lihatlah, ini adalah sebuah cangkir!'.",
                    tokens = listOf(
                        WordToken("杯子", "bēi zi", "cup / glass", "Kosakata HSK 1: 杯子 (bēi zi)"),
                        WordToken("装满", "zhuāng mǎn", "to fill up / full", "Kosakata HSK 3: 装"),
                        WordToken("牛奶", "niú nǎi", "milk", "Kosakata HSK 2: 牛奶 (niú nǎi)"),
                        WordToken("相同", "xiāng tóng", "same / identical", "Kosakata HSK 3: 相同 (xiāng tóng)")
                    )
                ),
                Sentence(
                    id = "s_emptcp_2",
                    hanzi = "万物同理心灵亦然：当灵府深处被滚滚金钱财富、顽固傲慢成见与煊赫功名权势填塞充斥，个体便已彻底异化沉沦、迷失自我本真。",
                    pinyin = "wàn wù tóng lǐ xīn líng yì rán dāng líng fǔ shēn chù bèi gǔn gǔn jīn qián cái fù wán gù ào màn chéng jiàn yǔ xuān hè gōng míng quán shì tián sè chōng chì gè tǐ biàn yǐ chè dǐ yì huà chén lún mí shī zì wǒ běn zhēn",
                    translation = "Hal yang sama berlaku bagi jiwa manusia: ketika di dalam hati kita penuh sesak oleh nafsu harta kekayaan, prasangka sempit, dan ambisi kekuasaan, kita sejatinya bukan lagi diri kita sendiri.",
                    tokens = listOf(
                        WordToken("心中", "xīn zhōng", "in one's heart / mind", "Di lubuk hati"),
                        WordToken("财富", "cái fù", "wealth / riches", "Kosakata HSK 3: 财富 (cái fù)"),
                        WordToken("成见", "chéng jiàn", "prejudice / preconception", "Prasangka pikiran"),
                        WordToken("权势", "quán shì", "power and influence", "Kekuasaan duniawi")
                    )
                ),
                Sentence(
                    id = "s_emptcp_3",
                    hanzi = "世人穷极一生汲汲于外物之贪占囊括，却常因贪多务得而错失最本初的灵明自性；懂得清空凡俗执念，方能真正回归独一无二的真我。",
                    pinyin = "shì rén qióng jí yī shēng jí jí yú wài wù zhī tān zhàn náng kuò què cháng yīn tān duō wù dé ér cuò shī zuì běn chū de líng míng zì xìng dǒng de qīng kōng fán sú zhí niàn fāng néng zhēn zhèng huí guī dú yī wú èr de zhēn wǒ",
                    translation = "Manusia sering kali begitu bernafsu mengejar kepemilikan banyak hal duniawi, namun justru sangat sulit untuk benar-benar memiliki dan menemukan jati diri mereka yang sejati.",
                    tokens = listOf(
                        WordToken("热衷", "rè zhōng", "obsessed with / zealous", "Tergila-gila / bernafsu"),
                        WordToken("拥有", "yōng yǒu", "to possess / own", "Kosakata HSK 3: 拥有 (yōng yǒu)"),
                        WordToken("真正", "zhēn zhèng", "genuine / truly", "Kosakata HSK 3: 真正 (zhēn zhèng)")
                    )
                )
            ),
            questions = listOf(
                StoryQuestion(
                    id = "q_emptcp_1",
                    questionText = "在文章开篇的精妙哲学实验中，人们只有在什么特定情形下，才会指着眼前之物赞叹“看，这是一个杯子”？ (Kapan orang-orang baru melihat benda tersebut murni sebagai 'sebuah cangkir'?)",
                    options = listOf("在杯子里倒满金粉时 (Saat diisi serbuk emas)", "唯独当杯子彻底倒空、里面什么附着物品也没有的本真状态下 (Hanya saat cangkir itu kosong tidak diisi benda apa pun)", "把杯子打碎在地上时 (Saat dipecahkan)", "在太阳暴晒十天后 (Setelah dijemur)"),
                    correctAnswerIndex = 1,
                    explanation = "Teks menyatakan: '只有杯子里什么东西也没有时，人们才会说：看，这是一个杯子'."
                ),
                StoryQuestion(
                    id = "q_emptcp_2",
                    questionText = "文章借“盛满水即被唤作水、盛满牛奶即被称作牛奶”的形象比拟，深刻洞察了人性怎样的迷失困境？ (Kiasan cangkir terisi mencerminkan hilangnya jati diri manusia akibat apa?)",
                    options = listOf("人类每天需要喝太多牛奶 (Manusia minum susu berlebih)", "当我们的内心深处被无尽的财富、狭隘的成见与世俗的权势装满填塞时，我们便彻底迷失而不再是真实的自己 (Ketika hati penuh sesak oleh harta, prasangka, dan kekuasaan, kita bukan lagi diri kita sendiri)", "人类不善于制作陶瓷杯 (Tak bisa bikin keramik)", "水比牛奶更加珍贵 (Air lebih berharga dari susu)"),
                    correctAnswerIndex = 1,
                    explanation = "Teks menjelaskan: '当我们的心中装满了财富、成见、权势的时候，就不再是我们自己了'."
                ),
                StoryQuestion(
                    id = "q_emptcp_3",
                    questionText = "作者在文章最后一句向汲汲营营于外物占有的现代人敲响了怎样振聋发聩的心灵警钟？ (Peringatan batin apa yang disampaikan penulis di akhir teks?)",
                    options = listOf("家里必须买一千只水杯 (Harus beli 1000 cangkir)", "人往往热衷于拼命拥有很多外在名利，但往往最难真正拥有纯粹本真的自己 (Manusia berhasrat memiliki banyak hal di luar, namun paling sulit memiliki diri sejatinya)", "必须把所有的财产捐给寺庙 (Sumbangkan seluruh harta)", "少喝牛奶多喝茶 (Kurangi susu)"),
                    correctAnswerIndex = 1,
                    explanation = "Teks menyimpulkan nasihat abadi: '人往往热衷拥有很多，但往往很难真正拥有自己'."
                )
            )
        )
    )
}
