package com.example.chineselearning.data.repository

import com.example.chineselearning.R
import com.example.chineselearning.data.model.Sentence
import com.example.chineselearning.data.model.Story
import com.example.chineselearning.data.model.StoryQuestion
import com.example.chineselearning.data.model.WordToken

val mandarinBeanStoriesPart27: List<Story> by lazy {
    listOf(
        // Cerita Mandarin Bean 284 (HSK 3): Twenty Years Later (Dua Puluh Tiga Tahun Kemudian Menjadi Orang Tua)
        Story(
            id = "story_twenty_years_later",
            titleHanzi = "二十三年后做父母",
            titlePinyin = "Èrshísān Nián Hòu Zuò Fùmǔ",
            titleTranslation = "Twenty Years Later (Siklus Pengasuhan: 23 Tahun Kemudian)",
            level = "HSK 3",
            category = "Keluarga & Pengasuhan Anak",
            description = "Seorang ibu di Shanghai stres mengajari anak PR; kakek-nenek tertawa bahagia karena 23 tahun lalu sang ibu juga persis sama disurati oleh ayahnya saat malas belajar.",
            coverEmoji = "📝",
            coverImageRes = R.drawable.cover_story_twenty_years_later,
            estimatedReadMinutes = 2,
            sentences = listOf(
                Sentence(
                    id = "s_twtyrl_1",
                    hanzi = "上海一位年轻母亲因辅导女儿功课心浮气躁至濒临崩溃抓狂，然而家中老外公外婆目睹此景却非但不安慰，反而忍俊不禁开怀大笑。",
                    pinyin = "Shàng hǎi yī wèi nián qīng mǔ qīn yīn fǔ dǎo nǚ ér gōng kè xīn fú qì zào zhì bīn lín bēng kuì zhuā kuáng rán ér jiā zhōng lǎo wài gōng wài pó mù dǔ cǐ jǐng què fēi dàn bù ān wèi fǎn ér rěn jùn bù jìn kāi huái dà xiào",
                    translation = "Seorang ibu muda di Shanghai merasa luar biasa pusing dan stres saat mendampingi putrinya yang tidak tekun mengerjakan PR; namun anehnya kakek dan nenek yang melihat kejadian itu bukannya menghibur malah tertawa gembira terbahak-bahak.",
                    tokens = listOf(
                        WordToken("认真", "rèn zhēn", "conscientious / serious", "Kosakata HSK 3: 认真 (rèn zhēn)"),
                        WordToken("作业", "zuò yè", "homework", "Kosakata HSK 3: 作业 (zuò yè)"),
                        WordToken("生气", "shēng qì", "angry", "Kosakata HSK 2: 生气 (shēng qì)"),
                        WordToken("开心", "kāi xīn", "happy / amused", "Kosakata HSK 2: 开心 (kāi xīn)")
                    )
                ),
                Sentence(
                    id = "s_twtyrl_2",
                    hanzi = "原来整整二十三年前，老父亲在手把手辅导童年女儿写作业时遭遇过完全相同的磨人困境，昔日女儿同样拖沓厌学、屡教不改。",
                    pinyin = "yuán lái zhěng zhěng èr shí sān nián qián lǎo fù qīn zài shǒu bǎ shǒu fǔ dǎo tóng nián nǚ ér xiě zuò yè shí zāo yù guò wán quán xiāng tóng de mó rén kùn jìng xī rì nǚ ér tóng yàng tuō tà yàn xué lǚ jiào bù gǎi",
                    translation = "Rupanya tepat 23 tahun yang lalu, sang kakek saat mengajari putrinya (ibu sekarang) mengerjakan PR mengalami nasib yang persis sama, di mana sang anak saat itu juga luar biasa malas dan tidak mau mencatat pelajaran dengan rajin.",
                    tokens = listOf(
                        WordToken("原来", "yuán lái", "as it turns out / originally", "Kosakata HSK 3: 原来 (yuán lái)"),
                        WordToken("辅导", "fǔ dǎo", "to coach / tutor", "Kosakata bimbingan belajar"),
                        WordToken("事情", "shì qing", "matter / affair", "Kosakata HSK 2: 事情 (shì qing)"),
                        WordToken("因此", "yīn cǐ", "therefore", "Kosakata HSK 3: 因此 (yīn cǐ)")
                    )
                ),
                Sentence(
                    id = "s_twtyrl_3",
                    hanzi = "当年老父亲曾致信深切预言：有朝一日你也为人父母，若孩童重蹈覆辙看你何以自处；如今岁月轮回苍天饶过谁，印证了育儿的代际传承。",
                    pinyin = "dāng nián lǎo fù qīn céng zhì xìn shēn qiè yù yán yǒu zhāo yī rì nǐ yě wéi rén fù mǔ ruò hái tóng chóng dǎo fù zhé kàn nǐ hé yǐ zì chǔ rú jīn suì yuè lún huí cāng tiān ráo guò shéi yìn zhèng le yù ér de dài jì chuán chéng",
                    translation = "Dulu sang ayah pernah menuliskan sepucuk surat nasihat: 'Suatu saat kelak kamu pun akan menjadi orang tua; jika anakmu kelak mengulangi kenakalan yang sama sepertimu sekarang, bagaimana kamu akan menghadapinya?'; kini roda zaman berputar membuktikan pesan bijak sang ayah.",
                    tokens = listOf(
                        WordToken("父母", "fù mǔ", "parents", "Kosakata HSK 3: 父母 (fù mǔ)"),
                        WordToken("将来", "jiāng lái", "in the future", "Kosakata HSK 3: 将来 (jiāng lái)"),
                        WordToken("发生", "fā shēng", "to happen / occur", "Kosakata HSK 3: 发生 (fā shēng)"),
                        WordToken("怎么做", "zěn me zuò", "how to do / act", "Kosakata HSK 2: 怎么做")
                    )
                )
            ),
            questions = listOf(
                StoryQuestion(
                    id = "q_twtyrl_1",
                    questionText = "上海这位母亲在辅导女儿写作业时，为什么会感到极度生气抓狂？ (Mengapa ibu muda di Shanghai ini merasa sangat emosi saat mengajari anaknya?)",
                    options = listOf("女儿把作业本弄丢了 (PR anaknya hilang)", "女儿对待作业心不在焉、拖延且极不认真，屡教不听 (Anak tidak tekun, malas, dan asal-asalan saat mengerjakan tugas)", "女儿想退学经商 (Anak ingin putus sekolah)", "试卷分数被老师打零分 (Nilai ujian nol)"),
                    correctAnswerIndex = 1,
                    explanation = "Teks menyatakan: '一位妈妈因为女儿不认真写作业生气到抓狂'."
                ),
                StoryQuestion(
                    id = "q_twtyrl_2",
                    questionText = "老外公外婆看到自己的女儿辅导外孙女抓狂的模样，为什么反而感到格外开心欢喜？ (Mengapa kakek-nenek justru tertawa geli dan merasa senang melihat putrinya stres?)",
                    options = listOf("外孙女考了全校第一名 (Cucu ranking satu)", "二十三年前母亲辅导当年年幼的女儿时经历了同样的情景，当年在信里写下的预言如今奇迹般照进现实 (Karena 23 tahun lalu sang kakek mengalami hal persis sama saat mengajari putrinya)", "家里领到了拆迁补偿款 (Dapat uang gusuran)", "大家准备出门去旅游 (Mau liburan)"),
                    correctAnswerIndex = 1,
                    explanation = "Teks menjelaskan: '原来23年前，这位妈妈的爸爸辅导她作业时就遇到了同样的事情... 信里说：以后有一天你也会成为父母，将来你的孩子发生你现在这样的问题，你会怎么做呢？'."
                ),
                StoryQuestion(
                    id = "q_twtyrl_3",
                    questionText = "这则真实生活趣闻以富有哲理的方式揭示了家庭教育中怎样的普世规律？ (Pesan filosofis apa yang tersirat dari kisah nyata keluarga tiga generasi ini?)",
                    options = listOf("父母应该完全放弃辅导作业 (Ortu jangan ajari anak)", "父母年轻时的缺点孩子往往也会有，养儿方知父母恩，理解需要代际体验 (Anak sering mencerminkan perilaku orang tuanya di masa kecil; baru setelah menjadi orang tua seseorang memahami jerih payah orang tuanya)", "作业写得越快智商越高 (Makin cepat nulis makin pintar)", "祖父母不应该干涉孙辈教育 (Kakek nenek jangan ikut campur)"),
                    correctAnswerIndex = 1,
                    explanation = "Cerita ini menggambarkan siklus pengasuhan keluarga (二十年后做父母), di mana seorang anak baru benar-benar memahami perasaan sabar orang tuanya setelah ia sendiri menjadi orang tua."
                )
            )
        ),

        // Cerita Mandarin Bean 285 (HSK 3): Colour (Melihat Warna Dunia untuk Pertama Kali)
        Story(
            id = "story_colour_blindness",
            titleHanzi = "第一次看见彩色世界",
            titlePinyin = "Dì Yī Cì Kànjiàn Cǎisè Shìjiè",
            titleTranslation = "Colour (Melihat Warna-Warni Dunia untuk Pertama Kali)",
            level = "HSK 3",
            category = "Kemanusiaan & Kasih",
            description = "Kisah mengharukan Jonathan, bocah berusia 12 tahun yang menderita buta warna parah; kepala sekolahnya yang juga buta warna meminjamkan kacamata khusus koreksi warna hingga sang bocah menangis bahagia.",
            coverEmoji = "👓",
            coverImageRes = R.drawable.cover_story_colour_blindness,
            estimatedReadMinutes = 2,
            sentences = listOf(
                Sentence(
                    id = "s_colbld_1",
                    hanzi = "寻常健全之人往往难以体悟色彩对于生命体验的无上价值，十二岁少年乔纳森自幼罹患极为严重的色盲症，眼中天地唯有单调灰暗。",
                    pinyin = "xún cháng jiàn quán zhī rén wǎng wǎng nán yǐ tǐ wù sè cǎi duì yú shēng mìng tǐ yàn de wú shàng jià zhí shí èr suì shào nián Qiáo nà sēn zì yòu lí huàn jí wéi yán zhòng de sè máng zhèng yǎn zhōng tiān dì wéi yǒu dān diào huī àn",
                    translation = "Orang dengan penglihatan normal sering kali sulit membayangkan betapa pentingnya keindahan warna; anak laki-laki berusia 12 tahun, Jonathan, menderita buta warna parah sejak kecil, di mana dunianya hanya tampak hitam putih kelabu.",
                    tokens = listOf(
                        WordToken("普通人", "pǔ tōng rén", "ordinary people", "Kosakata HSK 3: 普通 (pǔ tōng)"),
                        WordToken("理解", "lǐ jiě", "to understand / comprehend", "Kosakata HSK 3: 理解 (lǐ jiě)"),
                        WordToken("颜色", "yán sè", "color", "Kosakata HSK 2: 颜色 (yán sè)"),
                        WordToken("严重", "yán zhòng", "serious / severe", "Kosakata HSK 3: 严重 (yán zhòng)"),
                        WordToken("色盲", "sè máng", "color blindness", "Istilah medis")
                    )
                ),
                Sentence(
                    id = "s_colbld_2",
                    hanzi = "同样饱受色盲困扰的慈爱校长察觉后，将自己特意重金定制的色盲矫正特制眼镜摘下，温柔地借给小男孩试戴。",
                    pinyin = "tóng yàng bǎo shòu sè máng kùn rǎo de cí ài xiào zhǎng chá jué hòu jiāng zì jǐ tè yì zhòng jīn dìng zhì de sè máng jiǎo zhèng tè zhì yǎn jìng zhāi xià wēn róu de jiè gěi xiǎo nán hái shì dài",
                    translation = "Kepala sekolahnya yang penuh empati dan kebetulan juga mengidap buta warna melepaskan kacamata khusus koreksi warna miliknya, lalu meminjamkannya kepada Jonathan untuk dicoba.",
                    tokens = listOf(
                        WordToken("校长", "xiào zhǎng", "principal / headmaster", "Kosakata HSK 3: 校长 (xiào zhǎng)"),
                        WordToken("眼镜", "yǎn jìng", "glasses / spectacles", "Kosakata HSK 3: 眼镜 (yǎn jìng)"),
                        WordToken("戴", "dài", "to wear (glasses/hat)", "Kosakata HSK 3: 戴 (dài)"),
                        WordToken("特别", "tè bié", "specially", "Kosakata HSK 2: 特别 (tè bié)")
                    )
                ),
                Sentence(
                    id = "s_colbld_3",
                    hanzi = "戴上镜片的刹那，世界万物绚丽的真容第一次清晰涌入眼帘，震撼与狂喜交织，小男孩当场情难自禁地失声喜极而泣。",
                    pinyin = "dài shàng jìng piàn de chà nà shì jiè wàn wù xuàn lì de zhēn róng dì yī cì qīng xī yǒng rù yǎn lián zhèn hàn yǔ kuáng xǐ jiāo zhī xiǎo nán hái dāng chǎng qíng nán zì jìn de shī shēng xǐ jí ér qì",
                    translation = "Begitu mengenakan kacamata itu, aneka ragam warna-warni dunia yang sesungguhnya untuk pertama kali tampak jelas di depan matanya; rasa takjub dan haru membuat anak laki-laki itu tak sanggup membendung air mata bahagia.",
                    tokens = listOf(
                        WordToken("哭起来", "kū qǐ lái", "started crying", "Kosakata HSK 2: 哭 (kū)"),
                        WordToken("第一次", "dì yī cì", "first time", "Kosakata HSK 2: 第一次"),
                        WordToken("清楚", "qīng chu", "clear", "Kosakata HSK 2: 清楚 (qīng chu)"),
                        WordToken("世界", "shì jiè", "world", "Kosakata HSK 3: 世界 (shì jiè)")
                    )
                )
            ),
            questions = listOf(
                StoryQuestion(
                    id = "q_colbld_1",
                    questionText = "十二岁的小男孩乔纳森因身体患有哪种先天视力障碍，而在日常生活中无法感知绚烂色彩？ (Gangguan penglihatan apa yang dialami Jonathan sejak kecil sehingga tak bisa melihat warna?)",
                    options = listOf("严重近视眼 (Minus parah)", "严重的色盲症 (Buta warna parah)", "散光 (Silinder)", "全盲失明 (Buta total)"),
                    correctAnswerIndex = 1,
                    explanation = "Teks menyatakan: '十二岁的小男孩Jonathan有严重的色盲'."
                ),
                StoryQuestion(
                    id = "q_colbld_2",
                    questionText = "学校校长为什么随身携带着一副能够神奇矫正色盲视觉的特制眼镜？ (Mengapa kepala sekolah memiliki kacamata khusus koreksi buta warna?)",
                    options = listOf("校长是眼镜店推销员 (Sales kacamata)", "因为校长本人同样也是一名色盲患者，这是专为色盲量身打造的特制眼镜 (Karena sang kepala sekolah sendiri juga buta warna, dan kacamata itu dirancang khusus)", "从操场上捡到的遗失物 (Nemu di lapangan)", "用于物理科学实验 (Untuk eksperimen fisika)"),
                    correctAnswerIndex = 1,
                    explanation = "Teks menjelaskan: '原来他的校长也有色盲，这是为色盲特别制作的眼镜'."
                ),
                StoryQuestion(
                    id = "q_colbld_3",
                    questionText = "当乔纳森戴上这副特殊的眼镜后，为什么会忍不住当场激动地流泪大哭起来？ (Mengapa Jonathan menangis tersedu-sedu saat memakai kacamata tersebut?)",
                    options = listOf("镜框太紧勒痛了耳朵 (Kacamata kesempitan bikin telinga sakit)", "这是他人生中第一次清晰看见万事万物真实多彩的颜色，被有颜色的美丽世界震撼感动 (Pertama kali dalam hidupnya melihat warna-warni dunia yang nyata, sangat terharu)", "眼镜镜片摔裂了 (Lensa retak)", "他不想把眼镜还给校长 (Tak mau balikin kacamata)"),
                    correctAnswerIndex = 1,
                    explanation = "Teks mencatat: '小男孩哭了起来... 这是小男孩第一次看清楚不同的颜色，原来有颜色的世界是这样的'."
                )
            )
        ),

        // Cerita Mandarin Bean 286 (HSK 3): The longest-lived old person passed away (Manusia Tertua di Dunia Berusia 123 Tahun)
        Story(
            id = "story_longest_lived",
            titleHanzi = "123岁长寿老人的世纪传奇",
            titlePinyin = "Yībǎi Èrshísān Suì Chángshòu Lǎorén de Shìjì Chuánqí",
            titleTranslation = "The Longest-Lived Person (Legenda Hidup Nenek 123 Tahun)",
            level = "HSK 3",
            category = "Sejarah & Rekor Kehidupan",
            description = "Mengenang nenek tertua di dunia asal Rusia yang wafat di usia 123 tahun: lahir pada tahun 1896, melintasi tiga abad dan dua perang dunia, serta melahirkan anak pertama di usia 53 tahun.",
            coverEmoji = "👵",
            coverImageRes = R.drawable.cover_story_longest_lived,
            estimatedReadMinutes = 1,
            sentences = listOf(
                Sentence(
                    id = "s_lnglvd_1",
                    hanzi = "俄罗斯一位历经风云际会的世纪老人安详离世，享年高达一百二十三岁高龄，堪称全球有记载的人类长寿传奇。",
                    pinyin = "É luó sī yī wèi lì jīng fēng yún jì huì de shì jì lǎo rén ān xiáng lí shì xiǎng nián gāo dá yī bǎi èr shí sān suì gāo líng kān chēng quán qiú yǒu jì zǎi de rén lèi cháng shòu chuán qí",
                    translation = "Seorang wanita lansia di Rusia yang melewati badai sejarah berpulang dengan tenang pada usia 123 tahun, mencatatkan diri sebagai salah satu manusia dengan usia terpanjang yang tercatat dalam sejarah dunia.",
                    tokens = listOf(
                        WordToken("世界", "shì jiè", "world", "Kosakata HSK 3: 世界 (shì jiè)"),
                        WordToken("年龄", "nián líng", "age", "Kosakata HSK 3: 年龄 (nián líng)"),
                        WordToken("俄罗斯", "É luó sī", "Russia", "Nama negara"),
                        WordToken("长寿", "cháng shòu", "longevity / long-lived", "Kosakata HSK 3: 长寿")
                    )
                ),
                Sentence(
                    id = "s_lnglvd_2",
                    hanzi = "老人诞生于1896年沙皇俄国时代，跨越了三个世纪的历史沧桑，亲身见证了两次惨烈的世界大战与人间巨变。",
                    pinyin = "lǎo rén dàn shēng yú yī bā jiǔ liù nián shā huáng É guó shí dài kuà yuè le sān gè shì jì de lì shǐ cāng sāng qīn shēn jiàn zhèng le liǎng cì cǎn liè de shì jiè dà zhàn yǔ rén jiān jù biàn",
                    translation = "Ia dilahirkan pada tahun 1896 di zaman Kekaisaran Rusia, melintasi tiga abad (abad ke-19, 20, dan 21), serta menjadi saksi hidup berkecamuknya dua Perang Dunia.",
                    tokens = listOf(
                        WordToken("出生", "chū shēng", "to be born", "Kosakata HSK 3: 出生 (chū shēng)"),
                        WordToken("经历", "jīng lì", "to experience / go through", "Kosakata HSK 3: 经历 (jīng lì)"),
                        WordToken("世纪", "shì jì", "century", "Kosakata HSK 3: 世纪 (shì jì)"),
                        WordToken("世界大战", "shì jiè dà zhàn", "World War", "Perang dunia")
                    )
                ),
                Sentence(
                    id = "s_lnglvd_3",
                    hanzi = "更令人称奇的是她在五十三岁高龄时才喜迎首位爱子，一生共抚养三个儿子，直至今年深秋十月方才走完漫漫世纪之旅。",
                    pinyin = "gèng lìng rén chēng qí de shì tā zài wǔ shí sān suì gāo líng shí cái xǐ yíng shǒu wèi ài zǐ yī shēng gòng fǔ yǎng sān gè ér zi zhí zhì jīn nián shēn qiū shí yuè fāng cái zǒu wán màn màn shì jì zhī lǚ",
                    translation = "Yang menakjubkan, ia baru melahirkan putra pertamanya pada usia 53 tahun, membesarkan total tiga orang anak lelaki, hingga akhirnya menghembuskan napas terakhir pada bulan Oktober tahun ini.",
                    tokens = listOf(
                        WordToken("儿子", "ér zi", "son", "Kosakata HSK 1: 儿子 (ér zi)"),
                        WordToken("生下", "shēng xià", "to give birth to", "Kosakata HSK 3: 生 (shēng)"),
                        WordToken("去世", "qù shì", "to pass away", "Kosakata HSK 3: 去世 (qù shì)")
                    )
                )
            ),
            questions = listOf(
                StoryQuestion(
                    id = "q_lnglvd_1",
                    questionText = "这位被载入史册的世界最长寿俄罗斯女性离世时的最终实际年龄是多少岁？ (Berapa usia akhir nenek terpanjang umur asal Rusia saat wafat?)",
                    options = listOf("99岁 (99 tahun)", "整整123岁 (Genap 123 tahun)", "105岁 (105 tahun)", "150岁 (150 tahun)"),
                    correctAnswerIndex = 1,
                    explanation = "Teks menyatakan: '她是一位俄罗斯老人，已经123岁了'."
                ),
                StoryQuestion(
                    id = "q_lnglvd_2",
                    questionText = "老人生于1896年，漫长的一生不可思议地亲历横跨了哪些人类历史重大时期？ (Periode sejarah besar apa yang dilewati sang nenek sejak lahir tahun 1896?)",
                    options = listOf("横跨了三个不同世纪，亲历了两次世界大战 (Melintasi 3 abad dan 2 kali Perang Dunia)", "仅在和平年代生活 (Hanya hidup di era damai)", "参与了登月飞行 (Ikut ke bulan)", "当过沙皇俄国女将军 (Jenderal wanita)"),
                    correctAnswerIndex = 0,
                    explanation = "Teks mencatat: '这位长寿老人1896年出生，经历了三个世纪，两次世界大战'."
                ),
                StoryQuestion(
                    id = "q_lnglvd_3",
                    questionText = "在生育繁衍方面，这位传奇老妇人在多少岁高龄时才生下了自己的第一个儿子？ (Pada usia berapa tahun nenek tersebut melahirkan putra pertamanya?)",
                    options = listOf("18岁青年时期 (Usia 18 tahun)", "年过半百的53岁高龄 (Usia 53 tahun)", "35岁 (35 tahun)", "70岁 (70 tahun)"),
                    correctAnswerIndex = 1,
                    explanation = "Teks menyebutkan keajaiban medis: '一共育三个儿子，53岁时才生下第一个儿子'."
                )
            )
        ),

        // Cerita Mandarin Bean 287 (HSK 3): Rent or buy? (Menyewa Baju Pengganti Membeli)
        Story(
            id = "story_rent_or_buy",
            titleHanzi = "租衣服的环保新风尚",
            titlePinyin = "Zū Yīfu de Huánbǎo Xīn Fēngshàng",
            titleTranslation = "Rent or Buy? (Tren Sewa Pakaian Ramah Lingkungan)",
            level = "HSK 3",
            category = "Fesyen & Lingkungan",
            description = "Tren fesyen sirkular ramah lingkungan: merek busana internasional H&M meluncurkan layanan sewa pakaian kelas atas per minggu bagi para anggotanya guna menekan limbah tekstil.",
            coverEmoji = "👗",
            coverImageRes = R.drawable.cover_story_rent_or_buy,
            estimatedReadMinutes = 2,
            sentences = listOf(
                Sentence(
                    id = "s_rntbuy_1",
                    hanzi = "在都市青年租房安居的潮流下，知名国际时尚服装巨头H&M推陈出新，正式开启了创新的“租衣服”会员租赁业务。",
                    pinyin = "zài dū shì qīng nián zū fáng ān jū de cháo liú xià zhī míng guó jì shí shàng fú zhuāng jù tóu H&M tuī chén chū xīn zhèng shì kāi qǐ le chuàng xīn de zū yī fu huì yuán zū lìn yè wù",
                    translation = "Di tengah tren generasi muda menyewa rumah tinggal, merek fesyen global H&M melakukan terobosan dengan meluncurkan layanan berlangganan baru yakni menyewa pakaian bagi anggotanya.",
                    tokens = listOf(
                        WordToken("买", "mǎi", "to buy", "Kosakata HSK 1: 买 (mǎi)"),
                        WordToken("租", "zū", "to rent / lease", "Kosakata HSK 3: 租 (zū)"),
                        WordToken("时尚", "shí shàng", "fashion / fashionable", "Kosakata gaya hidup"),
                        WordToken("服务", "fú wù", "service", "Kosakata HSK 2: 服务 (fú wù)")
                    )
                ),
                Sentence(
                    id = "s_rntbuy_2",
                    hanzi = "会员单次可租借三件高端精品服装长达一周，单件租金约255元人民币，支持实体专卖店试穿或线上无缝寄送。",
                    pinyin = "huì yuán dān cì kě zū jiè sān jiàn gāo duān jīng pǐn fú zhuāng cháng dá yī zhōu dān jiàn zū jīn yuē èr bǎi wǔ shí wǔ yuán rén mín bì zhī chí shí tǐ zhuān mài diàn shì chuān huò xiàn shàng wú féng jì sòng",
                    translation = "Pelanggan member dapat menyewa 3 potong baju koleksi premium sekaligus selama satu minggu, dengan biaya sewa sekitar 255 yuan per helai, dapat disewa langsung di gerai toko maupun melalui pemesanan online.",
                    tokens = listOf(
                        WordToken("会员", "huì yuán", "member", "Kosakata HSK 3: 会员 (huì yuán)"),
                        WordToken("星期", "xīng qī", "week", "Kosakata HSK 1: 星期 (xīng qī)"),
                        WordToken("元", "yuán", "yuan", "Kosakata HSK 2: 元 (yuán)"),
                        WordToken("网上", "wǎng shang", "online / on the internet", "Kosakata HSK 2: 网上")
                    )
                ),
                Sentence(
                    id = "s_rntbuy_3",
                    hanzi = "这一循环时尚消费模式不仅大幅节省开支满足多变穿搭，更有效减少快时尚废弃制造，对地球生态环境极为友好。",
                    pinyin = "zhè yī xún huán shí shàng xiāo fèi mó shì bù jǐn dà fú jié shěng kāi zhī mǎn zú duō biàn chuān dā gèng yǒu xiào jiǎn shǎo kuài shí shàng fèi qì zhì zào duì dì qiú shēng tài huán jìng jí wéi yǒu hǎo",
                    translation = "Model fesyen sirkular ini tidak hanya menghemat pengeluaran untuk tampil modis dengan aneka pakaian berganti-ganti, melainkan juga menekan limbah tekstil industri sehingga dinilai jauh lebih ramah lingkungan.",
                    tokens = listOf(
                        WordToken("产品", "chǎn pǐn", "product / goods", "Kosakata HSK 3: 产品 (chǎn pǐn)"),
                        WordToken("认为", "rèn wéi", "to consider / think", "Kosakata HSK 2: 认为 (rèn wéi)"),
                        WordToken("环境", "huán jìng", "environment", "Kosakata HSK 3: 环境 (huán jìng)"),
                        WordToken("友好", "yǒu hǎo", "friendly / amicable", "Kosakata HSK 3: 友好 (yǒu hǎo)")
                    )
                )
            ),
            questions = listOf(
                StoryQuestion(
                    id = "q_rntbuy_1",
                    questionText = "知名时尚快消服装品牌H&M近期推出了怎样打破传统的创新会员消费服务？ (Layanan inovatif apa yang diluncurkan oleh merek fesyen H&M?)",
                    options = listOf("免费发放全部旧衣服 (Bagi-bagi baju gratis)", "推出高档服装会员租赁（租衣服）服务 (Menyediakan layanan sewa pakaian premium bagi member)", "强制顾客必须买十件 (Wajib beli 10 baju)", "只卖纸质一次性衣物 (Cuma jual baju kertas)"),
                    correctAnswerIndex = 1,
                    explanation = "Teks menyatakan: '时尚品牌H&M准备开始租衣服的服务。如果你是会员，可以一次租三件衣服，每次租一个星期'."
                ),
                StoryQuestion(
                    id = "q_rntbuy_2",
                    questionText = "在该品牌租赁体系中，每件高档服装租借一周的基准租金大约是多少人民币？ (Berapa biaya sewa rata-rata per potong baju selama satu minggu?)",
                    options = listOf("10元 (10 yuan)", "大约255元人民币 (Kira-kira 255 yuan)", "5000元 (5000 yuan)", "完全免费 (Gratis)"),
                    correctAnswerIndex = 1,
                    explanation = "Teks mencatat: '每一件衣服的租金大约是255元人民币'."
                ),
                StoryQuestion(
                    id = "q_rntbuy_3",
                    questionText = "许多环保人士和消费者之所以积极看好“以租代买”这一模式，其最大的社会生态价值是什么？ (Alasan utama pegiat lingkungan mendukung model sewa pakaian adalah apa?)",
                    options = listOf("让商场永远不用关门 (Mall buka nonstop)", "能减少纺织品过量生产与丢弃浪费，对地球自然环境更加友好 (Mengurangi limbah tekstil dan pakaian terbuang, lebih ramah lingkungan)", "消灭所有洗衣机 (Menghilangkan mesin cuci)", "让衣服不再褪色 (Baju tidak luntur)"),
                    correctAnswerIndex = 1,
                    explanation = "Teks menyimpulkan: '很多人认为这对环境也更友好'."
                )
            )
        ),

        // Cerita Mandarin Bean 288 (HSK 3): The benefits of saying dirty words (Riset Psikologi dan Pelepasan Emosi)
        Story(
            id = "story_benefits_dirty_words",
            titleHanzi = "心理学与情绪宣泄",
            titlePinyin = "Xīnlǐxué yǔ Qíngxù Xuānxiè",
            titleTranslation = "The Benefits of Saying Dirty Words (Penelitian Emosi & Rasa Sakit)",
            level = "HSK 3",
            category = "Sains & Psikologi Perilaku",
            description = "Temuan riset sains di Inggris: pelepasan emosi vokal saat berolahraga berat atau mengalami luka fisik dapat meredakan rasa sakit dan memicu ketahanan, namun akan hilang jika berlebihan.",
            coverEmoji = "🧠",
            coverImageRes = R.drawable.cover_story_benefits_dirty_words,
            estimatedReadMinutes = 2,
            sentences = listOf(
                Sentence(
                    id = "s_drtywd_1",
                    hanzi = "讲脏话在社会人际规范中固然被视作粗鄙不雅之举，然而英国一项严谨科学实验却揭示出令人瞩目的心理机制。",
                    pinyin = "jiǎng zāng huà zài shè huì rén jì guī fàn zhōng gù rán bèi shì zuò cū bǐ bù yǎ zhī jǔ rán ér Yīng guó yī xiàng yán jǐn kē xué shí yàn què jiē shì chū lìng rén zhǔ mù de xīn lǐ jī zhì",
                    translation = "Berkata kasar atau mengumpat tentu dipandang sebagai perilaku yang tidak sopan di masyarakat; namun sebuah penelitian ilmiah di Inggris mengungkap mekanisme psikologis yang mengejutkan.",
                    tokens = listOf(
                        WordToken("脏话", "zāng huà", "dirty words / swearing", "Istilah kata kasar"),
                        WordToken("行为", "xíng wéi", "behavior / conduct", "Kosakata HSK 3: 行为"),
                        WordToken("研究", "yán jiū", "research / study", "Kosakata HSK 3: 研究 (yán jiū)"),
                        WordToken("英国", "Yīng guó", "United Kingdom / Britain", "Negara")
                    )
                ),
                Sentence(
                    id = "s_drtywd_2",
                    hanzi = "受试者在骑行对抗极限阻力或身体突遭撞击创伤时，本能宣泄发泄者相比隐忍不发者爆发出力竭潜能，痛感亦获显著缓解。",
                    pinyin = "shòu shì zhě zài qí xíng duì kàng jí xiàn zǔ lì huò shēn tǐ tū zāo zhuàng jī chuāng shāng shí běn néng xuān xiè fā xiè zhě xiāng bǐ yǐn rěn bù fā zhě bào fā chū lì jié qián néng tòng gǎn yì huò xiǎn zhù huǎn jiě",
                    translation = "Partisipan penelitian yang mengayuh sepeda menghadapi beban tahanan berat atau saat terluka fisik, jika melampiaskan emosinya secara spontan ternyata memiliki daya tahan fisik lebih kuat dan rasa nyeri rasa sakitnya berkurang.",
                    tokens = listOf(
                        WordToken("自行车", "zì xíng chē", "bicycle", "Kosakata HSK 2: 自行车"),
                        WordToken("力量", "lì liang", "strength / power", "Kosakata HSK 3: 力量"),
                        WordToken("耐力", "nài lì", "endurance / stamina", "Istilah olahraga"),
                        WordToken("痛苦", "tòng kǔ", "pain / suffering", "Kosakata HSK 3: 痛苦 (tòng kǔ)")
                    )
                ),
                Sentence(
                    id = "s_drtywd_3",
                    hanzi = "但学者慎重告诫：此类宣泄只在偶发应急下产生应激镇痛效益，若演变为口无遮拦之恶习，该心理生理代偿机制将彻底失效。",
                    pinyin = "dàn xué zhě shèn zhòng gào jiè cǐ lèi xuān xiè zhǐ zài ǒu fā yìng jí xià chǎn shēng yìng jī zhèn tòng xiào yì ruò yǎn biàn wèi kǒu wú zhē lán zhī è xí gāi xīn lǐ shēng lǐ dài cháng jī zhì jiāng chè dǐ shī xiào",
                    translation = "Namun para peneliti mengingatkan: efek pelepasan ini hanya bereaksi saat situasi darurat sesekali; jika menjadi kebiasaan buruk yang diucapkan sembarangan setiap saat, khasiat psikologis tersebut akan sirna tak berbekas.",
                    tokens = listOf(
                        WordToken("减轻", "jiǎn qīng", "to lighten / ease", "Kosakata HSK 3: 减轻"),
                        WordToken("表示", "biǎo shì", "to express / state", "Kosakata HSK 3: 表示 (biǎo shì)"),
                        WordToken("失去", "shī qù", "to lose", "Kosakata HSK 3: 失去 (shī qù)"),
                        WordToken("作用", "zuò yòng", "effect / function", "Kosakata HSK 3: 作用 (zuò yòng)")
                    )
                )
            ),
            questions = listOf(
                StoryQuestion(
                    id = "q_drtywd_1",
                    questionText = "英国科学家的自行车体能阻力测试实验中，发现了情绪发泄的什么生理现象？ (Fenomena fisiologis apa yang ditemukan para ilmuwan Inggris dalam tes resistensi sepeda?)",
                    options = listOf("让人立刻昏睡不醒 (Membuat langsung tertidur)", "发泄宣泄的人在面对强阻力时往往能爆发出更大耐力继续蹬车 (Orang yang melampiaskan emosi memiliki kekuatan daya tahan lebih besar saat menghadapi rintangan berat)", "车速会自动降低一半 (Kecepatan sepeda berkurang)", "轮胎会瞬间磨损 (Ban cepat aus)"),
                    correctAnswerIndex = 1,
                    explanation = "Teks menyatakan: '在遇到阻力的时候，说脏话的人比不说的人有更大的力量继续骑。因为不仅可以提高运动时的耐力，受伤时也可能减轻痛苦'."
                ),
                StoryQuestion(
                    id = "q_drtywd_2",
                    questionText = "除提高高强度运动耐力外，在身体意外遭遇创伤疼痛时，适度宣泄还可能带来哪种自愈作用？ (Selain menambah daya tahan olahraga, apa efek pelepasan emosi saat cedera?)",
                    options = listOf("立刻使骨折完全愈合 (Menyambung tulang seketika)", "从心理学上帮助神经减轻感知到的剧烈痛苦 (Secara psikologis membantu meredakan rasa sakit dan nyeri)", "皮肤长出新鳞片 (Tumbuh sisik baru)", "让伤口变成金黄色 (Luka jadi warna emas)"),
                    correctAnswerIndex = 1,
                    explanation = "Teks menjelaskan: '受伤时说脏话也可能会减轻痛苦'."
                ),
                StoryQuestion(
                    id = "q_drtywd_3",
                    questionText = "研究人员最后对公众特别强调了哪项关于语言素养的审慎限制？ (Batasan penting apa yang ditekankan peneliti terkait kebiasaan berkata kasar?)",
                    options = listOf("鼓励每天大声练习说粗话 (Menganjurkan mengumpat tiap hari)", "如果频繁滥用粗话使其沦为日常恶习，这种生理减痛调节作用就会彻底失效失去 (Jika terlalu sering diucapkan sembarangan, efek pereda rasa sakit ini akan lenyap)", "只能对树木花草说粗话 (Hanya boleh bicara pada tanaman)", "必须用外语说才有效 (Harus pakai bahasa asing)"),
                    correctAnswerIndex = 1,
                    explanation = "Teks menegaskan: '但是，研究人员也表示，脏话说到得太多会失去这种作用'."
                )
            )
        ),

        // Cerita Mandarin Bean 289 (HSK 3): He who doesn't reach the Great Wall is not a true man (Tak Sampai Tembok Besar Bukanlah Pahlawan)
        Story(
            id = "story_great_wall_hero",
            titleHanzi = "不到长城非好汉",
            titlePinyin = "Bù Dào Chángchéng Fēi Hǎohàn",
            titleTranslation = "Not a True Man Unless Reaching Great Wall (Semangat Gigih Pantang Menyerah)",
            level = "HSK 3",
            category = "Sejarah & Filosofi Hidup",
            description = "Mengupas pepatah terkenal 'Bù dào Chángchéng fēi hǎohàn': asal-usul karakter 'fēi' dan 'hǎohàn', serta makna filosofisnya sebagai simbol tekad baja dalam mengatasi rintangan.",
            coverEmoji = "🧱",
            coverImageRes = R.drawable.cover_story_great_wall_hero,
            estimatedReadMinutes = 2,
            sentences = listOf(
                Sentence(
                    id = "s_grtwlh_1",
                    hanzi = "“不到长城非好汉”是享誉中外的中华名句，凡亲临北京居庸关或八达岭长城的游人皆在崖壁石碑处见过这行雄浑字迹。",
                    pinyin = "bù dào Cháng chéng fēi hǎo hàn shì xiǎng yù zhōng wài de Zhōng huá míng jù fán qīn lín Běi jīng Jū yōng guān huò Bā dá lǐng Cháng chéng de yóu rén jiē zài yá bì shí bēi chù jiàn guò zhè háng xióng hún zì jì",
                    translation = "'Bù dào Chángchéng fēi hǎohàn' (Belum sampai di Tembok Besar belumlah seorang kesatria) adalah salah satu pepatah Tionghoa paling terkenal; siapa pun yang mengunjungi Tembok Besar pasti pernah melihat tulisan penuh wibawa ini.",
                    tokens = listOf(
                        WordToken("长城", "Cháng chéng", "Great Wall of China", "Warisan dunia Tiongkok"),
                        WordToken("好汉", "hǎo hàn", "hero / brave man", "Kosakata HSK 3: 好汉"),
                        WordToken("有名", "yǒu míng", "famous", "Kosakata HSK 2: 有名 (yǒu míng)")
                    )
                ),
                Sentence(
                    id = "s_grtwlh_2",
                    hanzi = "句中“非”者，“不是”之意也；“好汉”者，指代气概非凡的勇武英雄与豪杰，字面即指未经长城险隘磨砺者难称真正英雄。",
                    pinyin = "jù zhōng fēi zhě bù shì zhī yì yě hǎo hàn zhě zhǐ dài qì gài fēi fán de yǒng wǔ yīng xióng yǔ háo jié zì miàn jí zhǐ wèi jīng Cháng chéng xiǎn ài mó lì zhě nán chēng zhēn zhèng yīng xióng",
                    translation = "Kata 'fēi' bermakna 'bukanlah' (bù shì), sedangkan 'hǎohàn' berarti kesatria tangguh atau sosok pahlawan (yīngxióng); makna harfiahnya menyatakan orang yang belum pernah mendaki Tembok Besar belumlah pahlawan sejati.",
                    tokens = listOf(
                        WordToken("英雄", "yīng xióng", "hero", "Kosakata HSK 3: 英雄 (yīng xióng)"),
                        WordToken("厉害", "lì hai", "formidable / awesome", "Kosakata HSK 3: 厉害 (lì hai)")
                    )
                ),
                Sentence(
                    id = "s_grtwlh_3",
                    hanzi = "如今该句演进为一种百折不挠的坚毅民族精神：遇困难奋勇破局、迎难而上直至问题迎刃而解，方是当代顶天立地之“好汉”。",
                    pinyin = "rú jīn gāi jù yǎn jìn wèi yī zhǒng bǎi zhé bù náo de jiān yì mín zú jīng shén yù kùn nan fèn yǒng pò jú yíng nán ér shàng zhí zhì wèn tí yíng rèn ér jiě fāng shì dāng dài dǐng tiān lì dì zhī hǎo hàn",
                    translation = "Di masa modern kalimat ini menjadi simbol semangat optimisme gigih: jika menghadapi kesulitan rintangan hidup, berjuanglah sekuat tenaga mencari solusi; barang siapa menuntaskan masalah barulah ia seorang 'hǎohàn' kesatria sejati.",
                    tokens = listOf(
                        WordToken("比喻", "bǐ yù", "metaphor / analogy", "Kosakata HSK 3: 比喻 (bǐ yù)"),
                        WordToken("积极", "jī jí", "positive / active", "Kosakata HSK 3: 积极 (jī jí)"),
                        WordToken("精神", "jīng shén", "spirit / mind", "Kosakata HSK 3: 精神 (jīng shén)"),
                        WordToken("解决", "jiě jué", "to solve / settle", "Kosakata HSK 3: 解决 (jiě jué)")
                    )
                )
            ),
            questions = listOf(
                StoryQuestion(
                    id = "q_grtwlh_1",
                    questionText = "古汉语警句“不到长城非好汉”中的文言虚词“非”字表达什么确切含义？ (Karakter klasik 'fēi' dalam pepatah ini memiliki arti apa?)",
                    options = listOf("飞翔 (Terbang)", "不是（否定） (Bukan / tidaklah)", "非常 (Sangat)", "是非 (Benar dan salah)"),
                    correctAnswerIndex = 1,
                    explanation = "Teks menyatakan: '这句话里的“非”的意思是“不是”'."
                ),
                StoryQuestion(
                    id = "q_grtwlh_2",
                    questionText = "词汇“好汉”在中国传统历史文化中通常指代具有何种品格的人？ (Kata 'hǎohàn' dalam budaya Tiongkok biasanya merujuk pada sosok yang bagaimana?)",
                    options = listOf("心地善良的医生 (Dokter baik)", "本领过人、顶天立地的英勇豪杰与真正英雄 (Sosok hebat berjiwa ksatria dan pahlawan sejati)", "很会做生意的商人 (Pedagang ulung)", "长寿的老人 (Orang tua panjang umur)"),
                    correctAnswerIndex = 1,
                    explanation = "Teks menjelaskan: '“好汉”的意思是“很厉害的人”或者“英雄”'."
                ),
                StoryQuestion(
                    id = "q_grtwlh_3",
                    questionText = "在当今社会日常生活中，人们常引用“不到长城非好汉”来激励何种进取精神？ (Dalam kehidupan saat ini, pepatah ini digunakan untuk menyemangati sikap apa?)",
                    options = listOf("遇到困难绝不退缩，积极想办法攻坚克难直至问题彻底解决的奋斗精神 (Sikap gigih pantang menyerah mencari solusi hingga rintangan berhasil diselesaikan)", "一定要买到最贵的长城门票 (Membeli tiket termahal)", "每天都必须爬一次楼梯 (Wajib naik tangga tiap hari)", "拒绝所有的外界帮助 (Menolak bantuan luar)"),
                    correctAnswerIndex = 0,
                    explanation = "Teks menyimpulkan: '现在我们常用这句话来比喻一种积极的精神，如果遇到困难，要努力想办法，如果问题解决了，那就是“好汉”'."
                )
            )
        ),

        // Cerita Mandarin Bean 290 (HSK 3): The benefits of having a dog (Manfaat Memelihara Anjing)
        Story(
            id = "story_benefits_dog",
            titleHanzi = "养狗有益身心健康",
            titlePinyin = "Yǎng Gǒu Yǒuyì Shēnxīn Jiànkāng",
            titleTranslation = "The Benefits of Having a Dog (Manfaat Medis Memelihara Anjing)",
            level = "HSK 3",
            category = "Kesehatan & Hewan Peliharaan",
            description = "Temuan medis mutakhir: memelihara anjing peliharaan terbukti secara klinis menurunkan risiko kematian dini penderita penyakit jantung yang hidup sendirian hingga lebih dari 27%.",
            coverEmoji = "🐕",
            coverImageRes = R.drawable.cover_story_benefits_dog,
            estimatedReadMinutes = 1,
            sentences = listOf(
                Sentence(
                    id = "s_bnfdog_1",
                    hanzi = "家有犬只陪伴常能给主人的日常生活注入无尽欢声笑语，最新国际流行病学科研成果更揭示出其惊人的医学保健效力。",
                    pinyin = "jiā yǒu quǎn zhī péi bàn cháng néng gěi zhǔ rén de rì cháng shēng huó zhù rù wú jìn huān shēng xiào yǔ zuì xīn guó jì liú xíng bìng xué kē yán chéng guǒ gèng jiē shì chū qí jīng rén de yī xué bǎo jiàn xiào lì",
                    translation = "Kehadiran anjing peliharaan di rumah sering kali membawa kegembiraan bagi pemiliknya; temuan riset medis internasional terbaru mengungkap bahwa memelihara anjing terbukti memberikan khasiat luar biasa bagi kesehatan raga.",
                    tokens = listOf(
                        WordToken("养", "yǎng", "to raise / keep (pet)", "Kosakata HSK 3: 养 (yǎng)"),
                        WordToken("快乐", "kuài lè", "happy", "Kosakata HSK 2: 快乐 (kuài lè)"),
                        WordToken("健康", "jiàn kāng", "healthy / health", "Kosakata HSK 3: 健康 (jiàn kāng)"),
                        WordToken("表示", "biǎo shì", "to show / state", "Kosakata HSK 3: 表示 (biǎo shì)")
                    )
                ),
                Sentence(
                    id = "s_bnfdog_2",
                    hanzi = "跟踪调查显示对于独居且患有心血管心脏疾病的特殊病患群体，养狗所促成的规律户外遛弯与暖心陪伴具有显著疗愈功用。",
                    pinyin = "gēn zōng diào chá xiǎn shì duì yú dú jū qiě huàn yǒu xīn xuè guǎn xīn zàng jí bìng de tè shū bìng huàn qún tǐ yǎng gǒu suǒ cù chéng de guī lǜ hù wài liù wān yǔ nuǎn xīn péi bàn jù yǒu xiǎn zhù liáo yù gōng yòng",
                    translation = "Penelitian menunjukkan bagi orang yang tinggal sendirian (dú jū) dan mengidap penyakit jantung, rutinitas mengajak anjing berjalan keluar dan kehangatan persahabatan satwa ini memiliki khasiat terapeutik yang nyata.",
                    tokens = listOf(
                        WordToken("心脏病", "xīn zàng bìng", "heart disease", "Istilah penyakit medis"),
                        WordToken("病人", "bìng rén", "patient / sick person", "Kosakata HSK 2: 病人 (bìng rén)"),
                        WordToken("相比", "xiāng bǐ", "compared with", "Kosakata HSK 3: 相比 (xiāng bǐ)")
                    )
                ),
                Sentence(
                    id = "s_bnfdog_3",
                    hanzi = "相较于未养宠物之孤单病患，有忠犬相伴之患者过早离世的综合死亡风险被大幅拉低了27%以上，堪称延年益寿的良方。",
                    pinyin = "xiāng jiào yú wèi yǎng chǒng wù zhī gū dān bìng huàn yǒu zhōng quǎn xiāng bàn zhī huàn zhě guò zǎo lí shì de zōng hé sǐ wáng fēng xiǎn bèi dà fú lā dī le bǎi fēn zhī èr shí qī yǐ shàng kān chēng yán nián yì shòu de liáng fāng",
                    translation = "Dibandingkan penderita jantung yang tidak memelihara satwa, pasien yang memiliki anjing setia mengalami penurunan risiko kematian dini lebih dari 27%, menjadi terapi alami memperpanjang usia hidup.",
                    tokens = listOf(
                        WordToken("风险", "fēng xiǎn", "risk", "Kosakata HSK 3: 风险 (fēng xiǎn)"),
                        WordToken("降低", "jiàng dī", "to reduce / lower", "Kosakata HSK 3: 降低 (jiàng dī)"),
                        WordToken("以上", "yǐ shàng", "above / more than", "Kosakata HSK 3: 以上 (yǐ shàng)")
                    )
                )
            ),
            questions = listOf(
                StoryQuestion(
                    id = "q_bnfdog_1",
                    questionText = "医学跟踪研究证实，在家里饲养宠物狗除了能让人获得快乐情绪外，还能带来什么深层次益处？ (Riset medis membuktikan bahwa memelihara anjing selain membawa keceriaan juga membawa manfaat apa?)",
                    options = listOf("让人学会说动物语言 (Bisa bahasa hewan)", "对身体健康产生切实的显著改善促进效果 (Membawa dampak nyata meningkatkan kesehatan tubuh)", "自动治愈所有的近视眼 (Menyembuhkan mata minus)", "省去所有的伙食费用 (Menghemat biaya makan)"),
                    correctAnswerIndex = 1,
                    explanation = "Teks menyatakan: '有研究表示，养狗不但会让我们更快乐，也可能让我们更健康'."
                ),
                StoryQuestion(
                    id = "q_bnfdog_2",
                    questionText = "这项医学科研成果特别聚焦于患有哪种典型疾病且独自生活的特殊人群？ (Penelitian medis ini secara khusus meneliti pasien penderita penyakit apa yang tinggal sendirian?)",
                    options = listOf("心脏病（心血管疾病） (Penderita penyakit jantung)", "严重骨折 (Patah tulang)", "急性牙痛 (Sakit gigi akut)", "花粉过敏症 (Alergi serbuk bunga)"),
                    correctAnswerIndex = 0,
                    explanation = "Teks mencatat: '如果你是自己住，并且已经有心脏病等问题，那么和没有养狗的人相比...'."
                ),
                StoryQuestion(
                    id = "q_bnfdog_3",
                    questionText = "对于独居的心脏病患者而言，饲养爱犬能够将过早去世的生命风险降低多少比例以上？ (Berapa persen penurunan risiko kematian dini pasien jantung berkat memelihara anjing?)",
                    options = listOf("仅降低1% (Hanya 1%)", "大幅降低27%以上 (Turun lebih dari 27%)", "降低5%左右 (Sekitar 5%)", "完全不能降低 (Tidak turun sama sekali)"),
                    correctAnswerIndex = 1,
                    explanation = "Teks menegaskan: '养狗可以让这些病人过早去世的风险降低27%以上'."
                )
            )
        ),

        // Cerita Mandarin Bean 291 (HSK 3): Stop using smartphone for one year (Tantangan Setahun Tanpa Smartphone)
        Story(
            id = "story_stop_smartphone",
            titleHanzi = "停用智能手机一年挑战",
            titlePinyin = "Tíngyòng Zhìnéng Shǒujī Yī Nián Tiǎozhàn",
            titleTranslation = "Stop Using Smartphone for 1 Year (Sayembara Tanpa Ponsel Pintar)",
            level = "HSK 3",
            category = "Teknologi & Kehidupan Modern",
            description = "Sayembara 100.000 USD dari Coca-Cola bagi siapa saja yang sanggup berhenti memakai smartphone selama setahun dan hanya memakai ponsel jadul tahun 1996; seorang penulis New York sukses bertahan 8 bulan.",
            coverEmoji = "📵",
            coverImageRes = R.drawable.cover_story_stop_smartphone,
            estimatedReadMinutes = 2,
            sentences = listOf(
                Sentence(
                    id = "s_stpsmt_1",
                    hanzi = "可口可乐公司巨额悬赏十万美元奖金发起极具颠覆性的耐力挑战：凡能整整一年停用智能手机者，即可将重奖悉数收入囊中。",
                    pinyin = "Kě kǒu kě lè gōng sī jù é xuán shǎng shí wàn měi yuán jiǎng jīn fā qǐ jí jù diān fù xìng de nài lì tiǎo zhàn fán néng zhěng zhěng yī nián tíng zhǐ shǐ yòng zhì néng shǒu jī zhě jí kě jiāng zhòng jiǎng xī shù shōu rù náng zhōng",
                    translation = "Perusahaan Coca-Cola menawarkan hadiah besar senilai 100.000 dolar AS bagi siapa saja yang sanggup berhenti total menggunakan ponsel pintar (smartphone) selama satu tahun penuh.",
                    tokens = listOf(
                        WordToken("美元", "měi yuán", "US dollar", "Mata uang internasional"),
                        WordToken("提供", "tí gōng", "to provide / offer", "Kosakata HSK 3: 提供 (tí gōng)"),
                        WordToken("停止", "tíng zhǐ", "to stop / cease", "Kosakata HSK 3: 停止 (tíng zhǐ)"),
                        WordToken("智能手机", "zhì néng shǒu jī", "smartphone", "Ponsel pintar")
                    )
                ),
                Sentence(
                    id = "s_stpsmt_2",
                    hanzi = "比赛严令选手仅能使用1996年古董非智能功能机，严禁触碰触屏手机及平板电脑，但允许使用笔记本电脑处理基本公务；若熬过半年亦可领得一万美元。",
                    pinyin = "bǐ sài yán lìng xuǎn shǒu jǐn néng shǐ yòng yī jiǔ jiǔ liù nián gǔ dǒng fēi zhì néng gōng néng jī yán jìn chù pèng chù píng shǒu jī jí píng bǎn diàn nǎo dàn yǔn xǔ shǐ yòng bǐ jì běn diàn nǎo chù lǐ jī běn gōng wù ruò áo guò bàn nián yì kě lǐng dé yī wàn měi yuán",
                    translation = "Aturan kompetisi menetapkan peserta hanya boleh menggunakan ponsel non-pintar buatan tahun 1996, dilarang menyentuh smartphone atau tablet, namun masih diizinkan memakai laptop komputer; bagi yang mampu bertahan 6 bulan berhak memperoleh 10.000 dolar.",
                    tokens = listOf(
                        WordToken("生产", "shēng chǎn", "to produce / manufacture", "Kosakata HSK 3: 生产 (shēng chǎn)"),
                        WordToken("平板电脑", "píng bǎn diàn nǎo", "tablet computer / iPad", "Perangkat digital"),
                        WordToken("笔记本电脑", "bǐ jì běn diàn nǎo", "laptop computer", "Kosakata HSK 3"),
                        WordToken("坚持", "jiān chí", "to persist / endure", "Kosakata HSK 3: 坚持 (jiān chí)")
                    )
                ),
                Sentence(
                    id = "s_stpsmt_3",
                    hanzi = "入围的二十九岁纽约女作家历经八个月数字化脱瘾考验，心境由恐慌转为澄澈安宁，毅然决意赛期届满后亦永不再度沉湎于智能机囹圄。",
                    pinyin = "rù wéi de èr shí jiǔ suì Niǔ yuē nǚ zuò jiā lì jīng bā gè yuè shù zì huà tuō yǐn kǎo yàn xīn jìng yóu kǒng huāng zhuǎn wèi chéng chè ān níng yì rán jué yì sài qī jiè mǎn hòu yì yǒng bù zài dù chén miǎn yú zhì néng jī líng yǔ",
                    translation = "Seorang penulis wanita berusia 29 tahun asal New York yang terpilih mengikuti tantangan telah berhasil melewati masa 8 bulan; ia merasa hidupnya jauh lebih tenang dan bertekad bahkan setelah tantangan berakhir pun ia tak akan kembali memakai smartphone.",
                    tokens = listOf(
                        WordToken("几乎", "jī hū", "almost / nearly", "Kosakata HSK 3: 几乎 (jī hū)"),
                        WordToken("想象", "xiǎng xiàng", "to imagine", "Kosakata HSK 3: 想象 (xiǎng xiàng)"),
                        WordToken("选中", "xuǎn zhòng", "selected / chosen", "Kosakata HSK 3: 选 (xuǎn)"),
                        WordToken("结束", "jié shù", "to end / conclude", "Kosakata HSK 3: 结束 (jié shù)")
                    )
                )
            ),
            questions = listOf(
                StoryQuestion(
                    id = "q_stpsmt_1",
                    questionText = "可口可乐公司为“彻底停用智能手机满一整年”的终极挑战者开出了多少丰厚重奖？ (Berapa jumlah uang hadiah yang ditawarkan Coca-Cola bagi pemenang yang bertahan setahun tanpa smartphone?)",
                    options = listOf("一千美元 (1.000 USD)", "整整十万美元（100,000 USD） (Genap 100.000 dolar AS)", "五百元人民币 (500 yuan)", "赠送一箱可乐 (Sekardus kola)"),
                    correctAnswerIndex = 1,
                    explanation = "Teks menyatakan: '十万美元，想要吗？可口可乐公司提供了这笔钱，如果有人能停止使用智能手机一年，就可以得到这笔钱'."
                ),
                StoryQuestion(
                    id = "q_stpsmt_2",
                    questionText = "挑战规则中对参与者在日常生活期间所能使用的通信与电子工具有着怎样苛刻的规定？ (Alat komunikasi apa yang diizinkan untuk dipakai peserta selama kompetisi?)",
                    options = listOf("只能使用最新款苹果手机 (Hanya boleh iPhone terbaru)", "只能使用1996年生产的老式非智能手机，严禁使用触屏智能手机和平板电脑 (Hanya boleh ponsel jadul 1996 tanpa fitur pintar; dilarang smartphone dan tablet)", "完全禁止与任何人交谈 (Dilarang bicara)", "只能写信不准用任何电器 (Cuma boleh surat manual)"),
                    correctAnswerIndex = 1,
                    explanation = "Teks menjelaskan: '参加比赛的人只能使用1996年生产的非智能手机，一年内不能使用智能手机或者平板电脑，但是可以使用笔记本电脑'."
                ),
                StoryQuestion(
                    id = "q_stpsmt_3",
                    questionText = "被选中的29岁纽约女作家在成功坚持了8个月后，做出了怎样令人深思的果断决定？ (Keputusan apa yang diambil penulis New York setelah berhasil bertahan selama 8 bulan?)",
                    options = listOf("立即放弃认输 (Langsung menyerah)", "即便一年挑战期满拿到奖金后，也决定不再回归使用智能手机 (Memutuskan tetap tidak akan memakai smartphone lagi meski tantangan sudah selesai)", "把奖金全部退回 (Mengembalikan hadiah)", "改行当手机软件程序员 (Beralih profesi jadi programmer HP)"),
                    correctAnswerIndex = 1,
                    explanation = "Teks menyimpulkan: '现在已经过了8个月，她决定一年结束以后也不再使用智能手机'."
                )
            )
        ),

        // Cerita Mandarin Bean 292 (HSK 3): Japanese rent car (Orang Jepang Menyewa Mobil Bukan untuk Menyetir)
        Story(
            id = "story_japanese_rent_car",
            titleHanzi = "日本共享汽车的独特空间",
            titlePinyin = "Rìběn Gòngxiǎng Qìchē de Dútè Kōngjiān",
            titleTranslation = "Japanese Rent Car (Bilik Privasi di Mobil Sewaan Jepang)",
            level = "HSK 3",
            category = "Sosial & Budaya Modern",
            description = "Fenomena unik di Jepang: perusahaan rental mobil mendapati data aneh mobil disewa dan dibayar tapi odometernya tak bergerak sama sekali; ternyata disewa untuk ruang privasi, tidur siang, dan bekerja.",
            coverEmoji = "🚗",
            coverImageRes = R.drawable.cover_story_japanese_rent_car,
            estimatedReadMinutes = 2,
            sentences = listOf(
                Sentence(
                    id = "s_jpncar_1",
                    hanzi = "日本多家共享汽车运营商在后台大数据中愕然发现离奇谜团：大批已被付费预约的租车里程表竟赫然纹丝未动，完全未曾上路行驶。",
                    pinyin = "Rì běn duō jiā gòng xiǎng qì chē yùn yíng shāng zài hòu tái dà shù jù zhōng è rán fā xiàn lí qí mǐ tuán dà pī yǐ bèi fù fèi yù yuē de zū chē lǐ chéng biǎo jìng hè rán wén sī wèi dòng wán quán wèi céng shàng lù xíng shǐ",
                    translation = "Banyak perusahaan mobil sewaan bersama di Jepang menemukan anomali ganjil dalam catatan data mereka: sejumlah besar mobil yang disewa dan dibayar lunas oleh pelanggan ternyata sama sekali tidak dikemudikan di jalan raya.",
                    tokens = listOf(
                        WordToken("共享汽车", "gòng xiǎng qì chē", "car sharing / shared car", "Layanan sewa mobil"),
                        WordToken("奇怪", "qí guài", "strange / weird", "Kosakata HSK 3: 奇怪 (qí guài)"),
                        WordToken("根本", "gēn běn", "at all / simply", "Kosakata HSK 3: 根本 (gēn běn)"),
                        WordToken("付费", "fù fèi", "to pay fees", "Kosakata HSK 3: 付 (fù)")
                    )
                ),
                Sentence(
                    id = "s_jpncar_2",
                    hanzi = "深度调研方揭晓真相：顾客租车实为寻觅安静的私密港湾，在车内补觉小憩、用餐、办公、给手机充电或拨打不受监听的私密电话。",
                    pinyin = "shēn dù diào yán fāng jiē xiǎo zhēn xiàng gù kè zū chē shí wèi xún mì ān jìng de sī mì gǎng wān zài chē nèi bǔ jiào xiǎo qì yòng cān bàn gōng gěi shǒu jī chōng diàn huò bō dǎ bù shòu jiān tīng de sī mì diàn huà",
                    translation = "Investigasi mendalam mengungkap fakta unik: para penyewa mobil memanfaatkan kabin mobil semata-mata demi istirahat tidur siang, makan siang, bekerja tanpa gangguan, mengecas baterai ponsel, atau tempat menyendiri yang tenang.",
                    tokens = listOf(
                        WordToken("调查", "diào chá", "to investigate / survey", "Kosakata HSK 3: 调查 (diào chá)"),
                        WordToken("休息", "xiū xi", "to rest", "Kosakata HSK 2: 休息 (xiū xi)"),
                        WordToken("安静", "ān jìng", "quiet / peaceful", "Kosakata HSK 3: 安静 (ān jìng)")
                    )
                ),
                Sentence(
                    id = "s_jpncar_3",
                    hanzi = "日本国民因极度深恐社交打扰邻里，加之共享租金低廉便捷，使得停驻原地的汽车成了高压都市丛林里珍贵的独立私人避风港。",
                    pinyin = "Rì běn guó mín yīn jí dù shēn kǒng shè jiāo dǎ rǎo lín lǐ jiā zhī gòng xiǎng zū jīn dī lián biàn jié shǐ de tíng zhù yuán dì de qì chē chéng le gāo yā dū shì cóng lín lǐ zhēn guì de dú lì sī rén bì fēng gǎng",
                    translation = "Warga Jepang memiliki kebiasaan sangat takut mengganggu orang lain, ditambah biaya sewa mobil yang terjangkau, membuat mobil yang terparkir diam menjadi ruang pribadi independen yang amat berharga di tengah tekanan hidup kota metropolitan.",
                    tokens = listOf(
                        WordToken("害怕", "hài pà", "afraid of", "Kosakata HSK 3: 害怕 (hài pà)"),
                        WordToken("打扰", "dǎ rǎo", "to disturb / bother", "Kosakata HSK 3: 打扰 (dǎ rǎo)"),
                        WordToken("空间", "kōng jiān", "space / room", "Kosakata HSK 3: 空间"),
                        WordToken("独立", "dú lì", "independent / private", "Kosakata HSK 3: 独立")
                    )
                )
            ),
            questions = listOf(
                StoryQuestion(
                    id = "q_jpncar_1",
                    questionText = "日本多家共享汽车租赁公司在后台运行管理数据中，发现了怎样奇特的反常现象？ (Kejanggalan data apa yang ditemukan oleh perusahaan rental mobil di Jepang?)",
                    options = listOf("所有的汽车都被偷运到了国外 (Semua mobil dilarikan ke luar negeri)", "许多被用户付费租借的汽车，里程表显示根本没有被开动行驶过 (Banyak mobil yang disewa dan dibayar ternyata sama sekali tidak pernah dikemudikan jalan)", "所有的汽车都被改装成了赛车 (Semua dimodifikasi jadi mobil balap)", "租车人全部是未成年人 (Semua penyewa anak kecil)"),
                    correctAnswerIndex = 1,
                    explanation = "Teks menyatakan: '记录显示，很多被租的车根本没有被开过，虽然用户租了，也付费了'."
                ),
                StoryQuestion(
                    id = "q_jpncar_2",
                    questionText = "汽车公司经过实地调查后，发现用户“租车却不开车”的真正主要意图是什么？ (Apa tujuan sesungguhnya orang-orang menyewa mobil tapi tidak menjalankannya?)",
                    options = listOf("在车里堆放废旧垃圾 (Menimbun sampah)", "利用车内封闭静音环境作为睡觉休息、吃东西或专注办私事的独立私人空间 (Memanfaatkan kabin mobil kedap suara sebagai ruang privasi untuk istirahat, makan, atau menyendiri)", "在车里做化学爆炸实验 (Eksperimen kimia)", "测试汽车空调抗冻极限 (Tes ketahanan AC)"),
                    correctAnswerIndex = 1,
                    explanation = "Teks menjelaskan: '发现很多人租车是为了休息、吃东西、安静地做自己的事情'."
                ),
                StoryQuestion(
                    id = "q_jpncar_3",
                    questionText = "这种“把出租车当私人静音房间”的独特社会消费现象折射出日本民众怎样的社会心理？ (Fenomena unik ini mencerminkan budaya psikologis masyarakat Jepang yang bagaimana?)",
                    options = listOf("特别喜欢炫耀豪车 (Suka pamer mobil)", "极度害怕在公共场合或家里打扰妨碍他人，且渴求拥有一块廉价便捷的独立私人空间 (Sangat takut mengganggu orang lain dan mendambakan ruang privat yang tenang dan terjangkau)", "大家都患有方向盘恐惧症 (Takut setir mobil)", "为了抵制公共交通 (Memboikot angkutan umum)"),
                    correctAnswerIndex = 1,
                    explanation = "Teks menyimpulkan: '日本人非常害怕打扰别人，租车又很便宜，所以越来越多的人开始租车不开，这样就可以拥有自己的独立空间了'."
                )
            )
        ),

        // Cerita Mandarin Bean 293 (HSK 3): DINK (Gaya Hidup Keluarga Tanpa Anak)
        Story(
            id = "story_dink_lifestyle",
            titleHanzi = "当代丁克家庭生活方式",
            titlePinyin = "Dāngdài Dīngkè Jiātíng Shēnghuó Fāngshì",
            titleTranslation = "DINK Lifestyle (Fenomena Pasangan Mandiri Tanpa Anak)",
            level = "HSK 3",
            category = "Sosiologi & Gaya Hidup Modern",
            description = "Membahas fenomena sosial keluarga DINK (Double Income, No Kids): pasangan berpenghasilan ganda berpendidikan tinggi yang secara sadar memilih hidup mandiri tanpa anak, serta tanggung jawab atas pilihan hidup.",
            coverEmoji = "👫",
            coverImageRes = R.drawable.cover_story_dink_lifestyle,
            estimatedReadMinutes = 2,
            sentences = listOf(
                Sentence(
                    id = "s_dnklfe_1",
                    hanzi = "“丁克族”（DINK）指代夫妻双方均具稳定可观收入、生理健康但主动选择不生育抚养子女的新型家庭形态。",
                    pinyin = "dīng kè zú zhǐ dài fū qī shuāng fāng jūn jù wěn dìng kě guān shōu rù shēng lǐ jiàn kāng dàn zhǔ dòng xuǎn zé bù shēng yù fǔ yǎng zǐ nǚ de xīn xíng jiā tíng xíng tài",
                    translation = "'DINK' (dīngkèzú - Double Income, No Kids) merujuk pada bentuk keluarga modern di mana suami-istri sama-sama memiliki penghasilan sendiri, berfisik sehat, namun secara sadar bersepakat untuk tidak memiliki anak.",
                    tokens = listOf(
                        WordToken("丁克族", "dīng kè zú", "DINK (Double Income, No Kids)", "Istilah sosiologi keluarga"),
                        WordToken("收入", "shōu rù", "income / revenue", "Kosakata HSK 3: 收入 (shōu rù)"),
                        WordToken("主动", "zhǔ dòng", "active / on one's own initiative", "Kosakata HSK 3: 主动 (zhǔ dòng)"),
                        WordToken("水平", "shuǐ píng", "level / standard", "Kosakata HSK 3: 水平 (shuǐ píng)")
                    )
                ),
                Sentence(
                    id = "s_dnklfe_2",
                    hanzi = "此类群体普遍受教育文化水平较高，随着社会观念开放多元，中国各大一线城市的丁克家庭数量亦呈现持续走高态势。",
                    pinyin = "cǐ lèi qún tǐ pǔ biàn shòu jiào yù wén huà shuǐ píng jiào gāo suí zhe shè huì guān niàn kāi fàng duō yuán Zhōng guó gè dà yī xiàn chéng shì de dīng kè jiā tíng shù liàng yì chéng xiàn chí xù zǒu gāo tài shì",
                    translation = "Kelompok ini umumnya memiliki tingkat pendidikan dan wawasan yang cukup tinggi; seiring makin terbukanya pandangan masyarakat modern, jumlah pasangan DINK di kota-kota besar Tiongkok pun kian bertambah.",
                    tokens = listOf(
                        WordToken("老龄化", "lǎo líng huà", "population aging", "Istilah demografi"),
                        WordToken("讨论", "tǎo lùn", "to discuss", "Kosakata HSK 3: 讨论 (tǎo lùn)"),
                        WordToken("话题", "huà tí", "topic / subject", "Kosakata HSK 3: 话题 (huà tí)")
                    )
                ),
                Sentence(
                    id = "s_dnklfe_3",
                    hanzi = "在老龄化大背景下丁克利弊各执一词，但人生的主导权终归属于个体自身，凡遵循内心抉择且笃定无悔，即是圆满人生。",
                    pinyin = "zài lǎo líng huà dà bèi jǐng xià dīng kè lì bì gè zhí yī cí dàn rén shēng de zhǔ dǎo quán zhōng guī shǔ yú gè tǐ zì shēn fán zūn xún nèi xīn jué zé qiě dǔ dìng wú huǐ jí shì yuán mǎn rén shēng",
                    translation = "Di tengah sorotan isu penuaan populasi, pro dan kontra gaya hidup DINK terus diperdebatkan; namun pada akhirnya hak menentukan jalan hidup berada di tangan individu masing-masing, asalkan diambil dengan sadar dan tanpa penyesalan.",
                    tokens = listOf(
                        WordToken("好处", "hǎo chu", "advantage / benefit", "Kosakata HSK 3: 好处 (hǎo chu)"),
                        WordToken("坏处", "huài chu", "harm / disadvantage", "Kosakata HSK 3: 坏处 (huài chu)"),
                        WordToken("决定", "jué dìng", "to decide", "Kosakata HSK 2: 决定 (jué dìng)"),
                        WordToken("后悔", "hòu huǐ", "to regret", "Kosakata HSK 3: 后悔 (hòu huǐ)")
                    )
                )
            ),
            questions = listOf(
                StoryQuestion(
                    id = "q_dnklfe_1",
                    questionText = "现代社会学概念中的“丁克族”（DINK）具有哪两项最为显著的核心家庭特征？ (Dua karakteristik utama apa yang mendefinisikan pasangan DINK dalam sosiologi?)",
                    options = listOf("没有收入且孩子众多 (Tidak berpenghasilan dan anak banyak)", "夫妻双方都拥有独立经济收入，且生理健康但主动选择不生育孩子 (Kedua pasutri berpenghasilan mandiri, sehat fisik, dan bersepakat tidak memiliki anak)", "每天都在环游世界不上班 (Keliling dunia tanpa kerja)", "隐居深山不与人往来 (Mengasingkan diri di gunung)"),
                    correctAnswerIndex = 1,
                    explanation = "Teks menyatakan: '丁克族，是指那些夫妻两个人都拥有收入，并且没有孩子的家庭。夫妻都身体健康并且主动不生孩子'."
                ),
                StoryQuestion(
                    id = "q_dnklfe_2",
                    questionText = "随着丁克家庭在各大都市持续增多，它在全社会宏观层面最常引发哪个重大议题的讨论？ (Di tingkat makro sosial, tren DINK sering memicu diskusi mengenai isu apa?)",
                    options = listOf("城市交通信号灯改造 (Lampu lalu lintas)", "国家人口少子化与社会老龄化问题 (Isu penyusutan angka kelahiran dan penuaan populasi sosial)", "大米价格下跌 (Harga beras turun)", "图书馆藏书分类 (Klasifikasi buku perpustakaan)"),
                    correctAnswerIndex = 1,
                    explanation = "Teks menjelaskan: '因为人口老龄化问题，这些越来越多的丁克族变成了大家讨论的话题'."
                ),
                StoryQuestion(
                    id = "q_dnklfe_3",
                    questionText = "作者对于现代人是否选择成为“丁克家庭”这一生活方式持有着怎样包容开明的态度？ (Bagaimana pandangan bijak dan terbuka penulis mengenai pilihan gaya hidup ini?)",
                    options = listOf("呼吁法律全面禁止丁克 (Menuntut larangan hukum bagi DINK)", "每个人都有权自主决定并负责自己的生活方式，只要遵循本心、未来不后悔即可 (Setiap orang berhak menentukan jalan hidupnya sendiri, asalkan dijalani dengan sadar dan tanpa penyesalan)", "所有夫妻都必须成为丁克 (Semua pasutri wajib jadi DINK)", "只能听从邻居的安排 (Ikut kata tetangga)"),
                    correctAnswerIndex = 1,
                    explanation = "Teks menyimpulkan: '但是能决定自己生活的，还应该是自己。我认为，如果自己不后悔，就没问题'."
                )
            )
        )
    )
}
