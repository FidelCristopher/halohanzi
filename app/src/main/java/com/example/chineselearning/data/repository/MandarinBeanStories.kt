package com.example.chineselearning.data.repository

import com.example.chineselearning.R
import com.example.chineselearning.data.model.*

val mandarinBeanStories: List<Story> = listOf(
        // Cerita Mandarin Bean: I Didn't Laugh (我没笑)
        Story(
            id = "story_i_didnt_laugh",
            titleHanzi = "我没笑",
            titlePinyin = "Wǒ Méi Xiào",
            titleTranslation = "I Didn't Laugh (Saya Tidak Tertawa)",
            level = "HSK 1",
            category = "Humor & Sekolah",
            description = "Anekdot lucu tentang Xiao Wang yang pulang ke rumah dan bercerita kepada ibunya tentang kejadian di sekolah.",
            coverEmoji = "😂",
            coverImageRes = R.drawable.cover_story_i_didnt_laugh,
            estimatedReadMinutes = 2,
            sentences = listOf(
                Sentence(
                    "s_idl_1",
                    "小王从学校回家，妈妈问他今天怎么样，他告诉妈妈：",
                    "Xiǎo Wáng cóng xuéxiào huí jiā, māma wèn tā jīntiān zěnmeyàng, tā gàosu māma:",
                    "Wang kecil pulang ke rumah dari sekolah, ibu bertanya padanya bagaimana hari ini, dia memberi tahu ibunya:",
                    listOf(
                        WordToken("小王", "Xiǎo Wáng", "Wang kecil", "Nama orang"),
                        WordToken("从", "cóng", "Dari", "Preposisi asal"),
                        WordToken("学校", "xuéxiào", "Sekolah", "Tempat belajar"),
                        WordToken("回家", "huí jiā", "Pulang ke rumah", "Kembali ke kediaman"),
                        WordToken("妈妈", "māma", "Ibu", "Orang tua perempuan"),
                        WordToken("问", "wèn", "Bertanya", "Mengajukan pertanyaan"),
                        WordToken("他", "tā", "Dia / -nya", "Kata ganti orang ketiga"),
                        WordToken("今天", "jīntiān", "Hari ini", "Waktu saat ini"),
                        WordToken("怎么样", "zěnmeyàng", "Bagaimana", "Menanyakan keadaan"),
                        WordToken("他", "tā", "Dia / -nya", "Kata ganti orang ketiga"),
                        WordToken("告诉", "gàosu", "Memberitahu", "Menyampaikan informasi"),
                        WordToken("妈妈", "māma", "Ibu", "Orang tua perempuan")
                    )
                ),
                Sentence(
                    "s_idl_2",
                    "“今天有一个孩子掉进水里了，同学们都大笑，只有我没笑。”",
                    "“Jīntiān yǒu yī gè háizi diào jìn shuǐ lǐ le, tóngxuémen dōu dà xiào, zhǐyǒu wǒ méi xiào.”",
                    "“Hari ini ada seorang anak jatuh ke dalam air, teman-teman sekelas semua tertawa terbahak-bahak, hanya aku yang tidak tertawa.”",
                    listOf(
                        WordToken("今天", "jīntiān", "Hari ini", "Waktu saat ini"),
                        WordToken("有", "yǒu", "Ada", "Kata kerja keberadaan"),
                        WordToken("一个", "yī gè", "Seorang", "Bilangan dan kata bantu"),
                        WordToken("孩子", "háizi", "Anak", "Anak kecil"),
                        WordToken("掉进", "diào jìn", "Jatuh ke dalam", "Terperosok ke dalam"),
                        WordToken("水里", "shuǐ lǐ", "Di dalam air", "Tempat berisi air"),
                        WordToken("了", "le", "Sudah", "Partikel aspek"),
                        WordToken("同学们", "tóngxuémen", "Teman-teman sekelas", "Sesama pelajar"),
                        WordToken("都", "dōu", "Semua", "Menunjukkan keseluruhan"),
                        WordToken("大笑", "dà xiào", "Tertawa keras", "Tertawa terbahak-bahak"),
                        WordToken("只有", "zhǐyǒu", "Hanya", "Menunjukkan perkecualian"),
                        WordToken("我", "wǒ", "Saya / aku", "Kata ganti orang pertama"),
                        WordToken("没笑", "méi xiào", "Tidak tertawa", "Bentuk negasi lampau tertawa")
                    )
                ),
                Sentence(
                    "s_idl_3",
                    "妈妈很高兴：“好孩子，我们当然不能笑别人。谁掉进水里了？”",
                    "Māma hěn gāoxìng: “Hǎo háizi, wǒmen dāngrán bù néng xiào biérén. Shéi diào jìn shuǐ lǐ le?”",
                    "Ibu sangat senang: “Anak pintar, kita tentu saja tidak boleh menertawakan orang lain. Siapa yang jatuh ke dalam air?”",
                    listOf(
                        WordToken("妈妈", "māma", "Ibu", "Orang tua perempuan"),
                        WordToken("很", "hěn", "Sangat", "Tingkat intensitas"),
                        WordToken("高兴", "gāoxìng", "Senang / gembira", "Perasaan bahagia"),
                        WordToken("好", "hǎo", "Baik / pintar", "Karakter terpuji"),
                        WordToken("孩子", "háizi", "Anak", "Anak kecil"),
                        WordToken("我们", "wǒmen", "Kita / kami", "Kata ganti orang pertama jamak"),
                        WordToken("当然", "dāngrán", "Tentu saja", "Kepastian / wajar"),
                        WordToken("不能", "bù néng", "Tidak boleh", "Larangan moral"),
                        WordToken("笑", "xiào", "Menertawakan", "Tertawa pada sesuatu"),
                        WordToken("别人", "biérén", "Orang lain", "Selain diri sendiri"),
                        WordToken("谁", "shéi", "Siapa", "Kata tanya orang"),
                        WordToken("掉进", "diào jìn", "Jatuh ke dalam", "Terperosok ke dalam"),
                        WordToken("水里", "shuǐ lǐ", "Di dalam air", "Tempat berisi air"),
                        WordToken("了", "le", "Partikel", "Penanda situasi")
                    )
                ),
                Sentence(
                    "s_idl_4",
                    "小王说：“我。”",
                    "Xiǎo Wáng shuō: “Wǒ.”",
                    "Wang kecil berkata: “Saya.”",
                    listOf(
                        WordToken("小王", "Xiǎo Wáng", "Wang kecil", "Nama orang"),
                        WordToken("说", "shuō", "Berkata", "Menyatakan sesuatu"),
                        WordToken("我", "wǒ", "Saya", "Kata ganti orang pertama")
                    )
                )
            ),
            questions = listOf(
                StoryQuestion(
                    "q_idl_1",
                    "谁掉进水里了？(Siapa yang jatuh ke dalam air?)",
                    listOf("妈妈 (Ibu)", "同学 (Teman sekelas)", "小王 (Wang kecil)", "老师 (Guru)"),
                    2,
                    "Di akhir cerita, saat ibu bertanya siapa yang jatuh ke air, Xiao Wang menjawab: \"我\" (Saya)."
                ),
                StoryQuestion(
                    "q_idl_2",
                    "小王为什么没笑？(Mengapa Xiao Wang tidak tertawa?)",
                    listOf(
                        "因为他是好孩子 (Karena dia anak baik)",
                        "因为是他掉进水里了 (Karena dia yang jatuh ke air)",
                        "因为他不高兴 (Karena dia tidak senang)",
                        "因为他没看到 (Karena dia tidak melihatnya)"
                    ),
                    1,
                    "Xiao Wang tidak tertawa bukan karena menahan diri, tetapi karena dialah yang jatuh ke dalam air sehingga tidak bisa menertawakan diri sendiri."
                ),
                StoryQuestion(
                    "q_idl_3",
                    "妈妈一开始的心情怎么样？(Bagaimana perasaan ibu pada awalnya?)",
                    listOf(
                        "很高兴 (Sangat senang)",
                        "很生气 (Sangat marah)",
                        "害怕 (Takut)",
                        "难过 (Sedih)"
                    ),
                    0,
                    "Di kalimat ke-3 tertulis: '妈妈很高兴: 好孩子，我们当然不能笑别人' (Ibu sangat senang mengira anaknya berbuat terpuji)."
                )
            )
        ),

        // Cerita Mandarin Bean 2: Dad's Work (爸爸的工作)
        Story(
            id = "story_dads_work",
            titleHanzi = "爸爸的工作",
            titlePinyin = "Bàba de Gōngzuò",
            titleTranslation = "Dad's Work (Pekerjaan Ayah)",
            level = "HSK 1",
            category = "Humor & Keluarga",
            description = "Percakapan jenaka antara seorang guru TK dengan murid perempuan kecil berusia lima tahun tentang pekerjaan ayahnya.",
            coverEmoji = "👨‍👧",
            coverImageRes = R.drawable.cover_story_dads_work,
            estimatedReadMinutes = 1,
            sentences = listOf(
                Sentence(
                    "s_dw_1",
                    "老师问五岁的小女孩：“你的爸爸是做什么的？”",
                    "Lǎoshī wèn wǔ suì de xiǎo nǚhái: “Nǐ de bàba shì zuò shénme de?”",
                    "Guru bertanya kepada anak perempuan kecil berusia lima tahun: “Apa pekerjaan ayahmu?”",
                    listOf(
                        WordToken("老师", "lǎoshī", "Guru", "Profesi pengajar"),
                        WordToken("问", "wèn", "Bertanya", "Mengajukan pertanyaan"),
                        WordToken("五岁", "wǔ suì", "Berusia lima tahun", "Keterangan umur"),
                        WordToken("的", "de", "Yang", "Partikel penghubung atributif"),
                        WordToken("小女孩", "xiǎo nǚhái", "Anak perempuan kecil", "Gadis cilik"),
                        WordToken("你的", "nǐ de", "Milikmu / -mu", "Kata ganti kepemilikan"),
                        WordToken("爸爸", "bàba", "Ayah / papa", "Orang tua laki-laki"),
                        WordToken("是", "shì", "Adalah", "Kopula"),
                        WordToken("做什么", "zuò shénme", "Mengerjakan apa", "Frasa menanyakan profesi"),
                        WordToken("的", "de", "Partikel penekanan profesi", "Pola 是...的")
                    )
                ),
                Sentence(
                    "s_dw_2",
                    "小女孩说：“我的妈妈让他做什么，他就做什么。”",
                    "Xiǎo nǚhái shuō: “Wǒ de māma ràng tā zuò shénme, tā jiù zuò shénme.”",
                    "Gadis kecil itu berkata: “Apa pun yang ibuku suruh dia lakukan, itu yang dia lakukan.”",
                    listOf(
                        WordToken("小女孩", "xiǎo nǚhái", "Gadis kecil", "Anak perempuan cilik"),
                        WordToken("说", "shuō", "Berkata", "Menyatakan sesuatu"),
                        WordToken("我的", "wǒ de", "Milikku / -ku", "Kata ganti kepemilikan"),
                        WordToken("妈妈", "māma", "Ibu / mama", "Orang tua perempuan"),
                        WordToken("让", "ràng", "Menyuruh / meminta", "Kata kerja kausatif"),
                        WordToken("他", "tā", "Dia / -nya", "Merujuk ke ayah"),
                        WordToken("做", "zuò", "Melakukan / mengerjakan", "Kata kerja tindakan"),
                        WordToken("什么", "shénme", "Apa / apa pun", "Kata tanya / pronomina tak tentu"),
                        WordToken("他", "tā", "Dia", "Merujuk ke ayah"),
                        WordToken("就", "jiù", "Maka / langsung", "Adverbia penegas urutan"),
                        WordToken("做", "zuò", "Mengerjakan", "Melakukan tindakan"),
                        WordToken("什么", "shénme", "Itu / apa", "Korelasi dengan kata apa pun sebelumnya")
                    )
                )
            ),
            questions = listOf(
                StoryQuestion(
                    "q_dw_1",
                    "小女孩几岁？(Berapa usia anak perempuan itu?)",
                    listOf("三岁 (3 tahun)", "四岁 (4 tahun)", "五岁 (5 tahun)", "六岁 (6 tahun)"),
                    2,
                    "Di kalimat pertama tertulis: '老师问五岁的小女孩' (Guru bertanya kepada gadis kecil berusia 5 tahun)."
                ),
                StoryQuestion(
                    "q_dw_2",
                    "老师问了小女孩什么问题？(Pertanyaan apa yang diajukan oleh guru?)",
                    listOf(
                        "妈妈漂亮吗？(Apakah ibumu cantik?)",
                        "你的爸爸是做什么的？(Apa pekerjaan ayahmu?)",
                        "你喜欢学校吗？(Apakah kamu suka sekolah?)",
                        "你有几个朋友？(Berapa banyak teman yang kamu punya?)"
                    ),
                    1,
                    "Guru menanyakan pekerjaan ayah si anak: '你的爸爸是做什么的？'."
                ),
                StoryQuestion(
                    "q_dw_3",
                    "小女孩的意思是什么？(Apa maksud jawaban gadis kecil itu?)",
                    listOf(
                        "爸爸听妈妈的话 (Ayah selalu patuh pada perintah ibu)",
                        "爸爸是老师 (Ayah bekerja sebagai guru)",
                        "爸爸没有工作 (Ayah tidak punya pekerjaan)",
                        "爸爸不回家 (Ayah tidak pulang ke rumah)"
                    ),
                    0,
                    "Maksud dari '妈妈让他做什么，他就做什么' adalah sang ayah sangat patuh dan mendengarkan segala suruhan/perintah sang ibu di rumah."
                )
            )
        ),

        // Cerita Mandarin Bean 3: Who I am (我是谁)
        Story(
            id = "story_who_i_am",
            titleHanzi = "我是谁",
            titlePinyin = "Wǒ Shì Shéi",
            titleTranslation = "Who I Am (Siapa Saya)",
            level = "HSK 1",
            category = "Profil & Pekerjaan",
            description = "Perkenalan diri David Lee, seorang guru bahasa Inggris asal Amerika yang tumbuh di Jepang, kuliah di Inggris, dan kini mengajar di Tiongkok.",
            coverEmoji = "👨‍🏫",
            coverImageRes = R.drawable.cover_story_who_i_am,
            estimatedReadMinutes = 2,
            sentences = listOf(
                Sentence(
                    "s_wia_1",
                    "我的名字叫李大卫，我是美国人，但是在日本长大，在英国上大学，现在在中国工作。",
                    "Wǒ de míngzi jiào Lǐ Dàwèi, wǒ shì Měiguó rén, dànshì zài Rìběn zhǎngdà, zài Yīngguó shàng dàxué, xiànzài zài Zhōngguó gōngzuò.",
                    "Nama saya David Lee, saya orang Amerika, tetapi besar di Jepang, kuliah di Inggris, dan sekarang bekerja di Tiongkok.",
                    listOf(
                        WordToken("我的", "wǒ de", "Milikku / saya punya", "Kata ganti kepemilikan"),
                        WordToken("名字", "míngzi", "Nama", "Kata benda identitas"),
                        WordToken("叫", "jiào", "Dipanggil / bernama", "Kata kerja menyebut nama"),
                        WordToken("李大卫", "Lǐ Dàwèi", "David Lee", "Nama orang"),
                        WordToken("我", "wǒ", "Saya", "Kata ganti orang pertama"),
                        WordToken("是", "shì", "Adalah", "Kopula"),
                        WordToken("美国人", "Měiguó rén", "Orang Amerika", "Kewarganegaraan"),
                        WordToken("但是", "dànshì", "Tetapi / namun", "Konjungsi pertentangan"),
                        WordToken("在", "zài", "Di", "Preposisi lokasi"),
                        WordToken("日本", "Rìběn", "Jepang", "Nama negara"),
                        WordToken("长大", "zhǎngdà", "Tumbuh besar", "Frasa perkembangan hidup"),
                        WordToken("在", "zài", "Di", "Preposisi lokasi"),
                        WordToken("英国", "Yīngguó", "Inggris", "Nama negara"),
                        WordToken("上大学", "shàng dàxué", "Kuliah / masuk universitas", "Aktivitas pendidikan tinggi"),
                        WordToken("现在", "xiànzài", "Sekarang", "Keterangan waktu saat ini"),
                        WordToken("在", "zài", "Di", "Preposisi lokasi"),
                        WordToken("中国", "Zhōngguó", "Tiongkok", "Nama negara"),
                        WordToken("工作", "gōngzuò", "Bekerja", "Aktivitas profesi")
                    )
                ),
                Sentence(
                    "s_wia_2",
                    "我在大学学习历史和英语，现在是一个英语老师，我非常喜欢我的工作。",
                    "Wǒ zài dàxué xuéxí lìshǐ hé Yīngyǔ, xiànzài shì yī gè Yīngyǔ lǎoshī, wǒ fēicháng xǐhuan wǒ de gōngzuò.",
                    "Saya belajar sejarah dan bahasa Inggris di universitas, sekarang adalah seorang guru bahasa Inggris, saya sangat menyukai pekerjaan saya.",
                    listOf(
                        WordToken("我", "wǒ", "Saya", "Kata ganti orang pertama"),
                        WordToken("在", "zài", "Di", "Preposisi"),
                        WordToken("大学", "dàxué", "Universitas", "Perguruan tinggi"),
                        WordToken("学习", "xuéxí", "Belajar", "Kata kerja menuntut ilmu"),
                        WordToken("历史", "lìshǐ", "Sejarah", "Mata kuliah / ilmu masa lalu"),
                        WordToken("和", "hé", "Dan", "Kata hubung setara"),
                        WordToken("英语", "Yīngyǔ", "Bahasa Inggris", "Bahasa asing"),
                        WordToken("现在", "xiànzài", "Sekarang", "Keterangan waktu"),
                        WordToken("是", "shì", "Adalah", "Kopula"),
                        WordToken("一个", "yī gè", "Seorang", "Satuan jumlah"),
                        WordToken("英语老师", "Yīngyǔ lǎoshī", "Guru bahasa Inggris", "Profesi pengajar bahasa"),
                        WordToken("我", "wǒ", "Saya", "Kata ganti orang pertama"),
                        WordToken("非常", "fēicháng", "Sangat / luar biasa", "Adverbia penegas intensitas tinggi"),
                        WordToken("喜欢", "xǐhuan", "Menyukai / gemar", "Perasaan suka"),
                        WordToken("我的", "wǒ de", "Milik saya", "Kepemilikan"),
                        WordToken("工作", "gōngzuò", "Pekerjaan", "Karir / tugas")
                    )
                ),
                Sentence(
                    "s_wia_3",
                    "学生们很好，学校也很好。",
                    "Xuéshengmen hěn hǎo, xuéxiào yě hěn hǎo.",
                    "Para murid sangat baik, sekolahnya juga sangat baik.",
                    listOf(
                        WordToken("学生们", "xuéshengmen", "Para murid / siswa", "Bentuk jamak pelajar"),
                        WordToken("很", "hěn", "Sangat", "Adverbia derajat"),
                        WordToken("好", "hǎo", "Baik / ramah", "Kata sifat"),
                        WordToken("学校", "xuéxiào", "Sekolah", "Tempat mengajar"),
                        WordToken("也", "yě", "Juga", "Adverbia inklusi"),
                        WordToken("很好", "hěn hǎo", "Sangat baik", "Kondisi memuaskan")
                    )
                )
            ),
            questions = listOf(
                StoryQuestion(
                    "q_wia_1",
                    "李大卫是哪国人？(Dari negara mana David Lee berasal?)",
                    listOf("中国 (Tiongkok)", "美国 (Amerika Serikat)", "日本 (Jepang)", "英国 (Inggris)"),
                    1,
                    "Di kalimat pertama tertulis: '我是美国人' (Saya adalah orang Amerika)."
                ),
                StoryQuestion(
                    "q_wia_2",
                    "李大卫现在做什么工作？(Apa pekerjaan David Lee sekarang?)",
                    listOf(
                        "学生 (Murid)",
                        "医生 (Dokter)",
                        "英语老师 (Guru Bahasa Inggris)",
                        "历史老师 (Guru Sejarah)"
                    ),
                    2,
                    "Di kalimat ke-2 tertulis: '现在是一个英语老师' (Sekarang adalah seorang guru bahasa Inggris)."
                ),
                StoryQuestion(
                    "q_wia_3",
                    "李大卫现在在哪里工作？(Di mana David Lee bekerja sekarang?)",
                    listOf(
                        "在日本 (Di Jepang)",
                        "在英国 (Di Inggris)",
                        "在美国 (Di Amerika Serikat)",
                        "在中国 (Di Tiongkok)"
                    ),
                    3,
                    "Di kalimat pertama tertulis: '现在在中国工作' (Sekarang bekerja di Tiongkok)."
                )
            )
        ),

        // Cerita Mandarin Bean 4: Do you know them? (你认识他们吗？)
        Story(
            id = "story_do_you_know_them",
            titleHanzi = "你认识他们吗？",
            titlePinyin = "Nǐ Rènshi Tāmen Ma?",
            titleTranslation = "Do You Know Them? (Apakah Kamu Mengenal Mereka?)",
            level = "HSK 1",
            category = "Keluarga & Guru",
            description = "Kisah tentang Guru Wang dan Guru Li, sepasang guru yang saling melengkapi dengan keluarga kecil mereka yang bahagia.",
            coverEmoji = "👨‍👩‍👧‍👦",
            coverImageRes = R.drawable.cover_story_do_you_know_them,
            estimatedReadMinutes = 2,
            sentences = listOf(
                Sentence(
                    "s_dykt_1",
                    "你认识这两个人吗？",
                    "Nǐ rènshi zhè liǎng gè rén ma?",
                    "Apakah kamu mengenal kedua orang ini?",
                    listOf(
                        WordToken("你", "nǐ", "Kamu", "Pronomina orang kedua"),
                        WordToken("认识", "rènshi", "Mengenal", "Mengetahui / familiar"),
                        WordToken("这", "zhè", "Ini", "Pronomina penunjuk"),
                        WordToken("两个人", "liǎng gè rén", "Dua orang", "Bilangan + penggolong + nomina"),
                        WordToken("吗", "ma", "Apakah", "Partikel tanya ya/tidak")
                    )
                ),
                Sentence(
                    "s_dykt_2",
                    "她是我的中文老师，姓王；他是弟弟的英文老师，姓李。",
                    "Tā shì wǒ de Zhōngwén lǎoshī, xìng Wáng; tā shì dìdi de Yīngwén lǎoshī, xìng Lǐ.",
                    "Dia adalah guru bahasa Mandarin saya, bermarga Wang; dia adalah guru bahasa Inggris adik laki-laki saya, bermarga Li.",
                    listOf(
                        WordToken("她", "tā", "Dia (perempuan)", "Pronomina orang ketiga wanita"),
                        WordToken("是", "shì", "Adalah", "Kopula"),
                        WordToken("我的", "wǒ de", "Milik saya", "Kepemilikan"),
                        WordToken("中文老师", "Zhōngwén lǎoshī", "Guru bahasa Mandarin", "Profesi pengajar bahasa"),
                        WordToken("姓", "xìng", "Bermarga", "Menyatakan nama keluarga"),
                        WordToken("王", "Wáng", "Wang", "Marga Wang"),
                        WordToken("他", "tā", "Dia (laki-laki)", "Pronomina orang ketiga pria"),
                        WordToken("是", "shì", "Adalah", "Kopula"),
                        WordToken("弟弟的", "dìdi de", "Milik adik laki-laki", "Kepemilikan"),
                        WordToken("英文老师", "Yīngwén lǎoshī", "Guru bahasa Inggris", "Profesi pengajar bahasa"),
                        WordToken("姓", "xìng", "Bermarga", "Menyatakan nama keluarga"),
                        WordToken("李", "Lǐ", "Li", "Marga Li")
                    )
                ),
                Sentence(
                    "s_dykt_3",
                    "王老师很漂亮，她今年二十八岁，喜欢旅游和跑步。",
                    "Wáng lǎoshī hěn piàoliang, tā jīnnián èrshíbā suì, xǐhuan lǚyóu hé pǎobù.",
                    "Guru Wang sangat cantik, tahun ini berusia dua puluh delapan tahun, gemar bepergian dan lari.",
                    listOf(
                        WordToken("王老师", "Wáng lǎoshī", "Guru Wang", "Panggilan hormat"),
                        WordToken("很", "hěn", "Sangat", "Tingkat derajat"),
                        WordToken("漂亮", "piàoliang", "Cantik", "Sifat visual memikat"),
                        WordToken("她", "tā", "Dia", "Pronomina"),
                        WordToken("今年", "jīnnián", "Tahun ini", "Keterangan waktu"),
                        WordToken("二十八岁", "èrshíbā suì", "28 tahun", "Keterangan usia"),
                        WordToken("喜欢", "xǐhuan", "Suka / gemar", "Perasaan suka"),
                        WordToken("旅游", "lǚyóu", "Bepergian / liburan", "Aktivitas wisata"),
                        WordToken("和", "hé", "Dan", "Konjungsi"),
                        WordToken("跑步", "pǎobù", "Berlari / jogging", "Aktivitas olahraga")
                    )
                ),
                Sentence(
                    "s_dykt_4",
                    "李老师很高，今年三十二岁，在大学工作。",
                    "Lǐ lǎoshī hěn gāo, jīnnián sānshí'èr suì, zài dàxué gōngzuò.",
                    "Guru Li sangat tinggi, tahun ini berusia tiga puluh dua tahun, bekerja di universitas.",
                    listOf(
                        WordToken("李老师", "Lǐ lǎoshī", "Guru Li", "Panggilan hormat"),
                        WordToken("很", "hěn", "Sangat", "Derajat intensitas"),
                        WordToken("高", "gāo", "Tinggi", "Postur fisik / tinggi badan"),
                        WordToken("今年", "jīnnián", "Tahun ini", "Waktu saat ini"),
                        WordToken("三十二岁", "sānshí'èr suì", "32 tahun", "Keterangan usia"),
                        WordToken("在", "zài", "Di", "Preposisi lokasi"),
                        WordToken("大学", "dàxué", "Universitas", "Perguruan tinggi"),
                        WordToken("工作", "gōngzuò", "Bekerja", "Aktivitas profesi")
                    )
                ),
                Sentence(
                    "s_dykt_5",
                    "他们两个人认识五年了，有一个女儿和一个儿子。",
                    "Tāmen liǎng gè rén rènshi wǔ nián le, yǒu yī gè nǚ'ér hé yī gè érzi.",
                    "Mereka berdua sudah saling mengenal selama lima tahun, memiliki seorang anak perempuan dan seorang anak laki-laki.",
                    listOf(
                        WordToken("他们", "tāmen", "Mereka", "Pronomina orang ketiga jamak"),
                        WordToken("两个人", "liǎng gè rén", "Dua orang", "Kuantitas orang"),
                        WordToken("认识", "rènshi", "Mengenal", "Saling kenal"),
                        WordToken("五年了", "wǔ nián le", "Sudah 5 tahun", "Durasi waktu lampau"),
                        WordToken("有", "yǒu", "Mempunyai / ada", "Kepemilikan"),
                        WordToken("一个", "yī gè", "Seorang", "Satuan jumlah"),
                        WordToken("女儿", "nǚ'ér", "Anak perempuan", "Anak kandung putri"),
                        WordToken("和", "hé", "Dan", "Kata hubung"),
                        WordToken("一个", "yī gè", "Seorang", "Satuan jumlah"),
                        WordToken("儿子", "érzi", "Anak laki-laki", "Anak kandung putra")
                    )
                ),
                Sentence(
                    "s_dykt_6",
                    "女儿一岁，儿子三岁，他们会说中文，也会说英文。",
                    "Nǚ'ér yī suì, érzi sān suì, tāmen huì shuō Zhōngwén, yě huì shuō Yīngwén.",
                    "Anak perempuan berusia satu tahun, anak laki-laki berusia tiga tahun, mereka bisa berbicara bahasa Mandarin, juga bisa berbicara bahasa Inggris.",
                    listOf(
                        WordToken("女儿", "nǚ'ér", "Anak perempuan", "Putri"),
                        WordToken("一岁", "yī suì", "1 tahun", "Usia"),
                        WordToken("儿子", "érzi", "Anak laki-laki", "Putra"),
                        WordToken("三岁", "sān suì", "3 tahun", "Usia"),
                        WordToken("他们", "tāmen", "Mereka", "Pronomina jamak"),
                        WordToken("会说", "huì shuō", "Bisa berbicara", "Kemampuan berbahasa"),
                        WordToken("中文", "Zhōngwén", "Bahasa Mandarin", "Bahasa Mandarin"),
                        WordToken("也会说", "yě huì shuō", "Juga bisa berbicara", "Kemampuan tambahan"),
                        WordToken("英文", "Yīngwén", "Bahasa Inggris", "Bahasa Inggris")
                    )
                ),
                Sentence(
                    "s_dykt_7",
                    "王老师和李老师都是很好的人，我和弟弟都很喜欢他们。",
                    "Wáng lǎoshī hé Lǐ lǎoshī dōu shì hěn hǎo de rén, wǒ hé dìdi dōu hěn xǐhuan tāmen.",
                    "Guru Wang dan Guru Li keduanya adalah orang yang sangat baik, saya dan adik laki-laki saya sangat menyukai mereka.",
                    listOf(
                        WordToken("王老师", "Wáng lǎoshī", "Guru Wang", "Subjek"),
                        WordToken("和", "hé", "Dan", "Konjungsi"),
                        WordToken("李老师", "Lǐ lǎoshī", "Guru Li", "Subjek"),
                        WordToken("都是", "dōu shì", "Keduanya adalah", "Penegas kejamakan"),
                        WordToken("很好的人", "hěn hǎo de rén", "Orang yang sangat baik", "Deskripsi kepribadian"),
                        WordToken("我和弟弟", "wǒ hé dìdi", "Saya dan adik laki-laki", "Subjek"),
                        WordToken("都很喜欢", "dōu hěn xǐhuan", "Keduanya sangat menyukai", "Perasaan suka"),
                        WordToken("他们", "tāmen", "Mereka", "Objek")
                    )
                )
            ),
            questions = listOf(
                StoryQuestion(
                    "q_dykt_1",
                    "王老师教什么？(Apa yang diajarkan oleh Guru Wang?)",
                    listOf("中文 (Bahasa Mandarin)", "英文 (Bahasa Inggris)", "历史 (Sejarah)", "跑步 (Lari)"),
                    0,
                    "Di kalimat kedua tertulis: '她是我的中文老师，姓王' (Dia adalah guru bahasa Mandarin saya, bermarga Wang)."
                ),
                StoryQuestion(
                    "q_dykt_2",
                    "王老师和李老师有几个孩子？(Berapa banyak anak yang dimiliki Guru Wang dan Guru Li?)",
                    listOf("一个 (Satu anak)", "两个 (Dua anak)", "三个 (Tiga anak)", "四个 (Empat anak)"),
                    1,
                    "Di kalimat kelima tertulis: '有一个女儿和一个儿子' (Memiliki seorang anak perempuan dan seorang anak laki-laki, total dua anak)."
                ),
                StoryQuestion(
                    "q_dykt_3",
                    "李老师今年多大？(Berapa usia Guru Li tahun ini?)",
                    listOf("二十八岁 (28 tahun)", "三十岁 (30 tahun)", "三十二岁 (32 tahun)", "三十五岁 (35 tahun)"),
                    2,
                    "Di kalimat keempat tertulis: '李老师很高，今年三十二岁' (Guru Li sangat tinggi, tahun ini berusia 32 tahun)."
                )
            )
        ),

        // Cerita Mandarin Bean 5: You have grown up (你长大了)
        Story(
            id = "story_you_have_grown_up",
            titleHanzi = "你长大了",
            titlePinyin = "Nǐ Zhǎng Dà Le",
            titleTranslation = "You Have Grown Up (Kamu Sudah Besar)",
            level = "HSK 1",
            category = "Humor & Keluarga",
            description = "Anekdot jenaka tentang seorang anak yang meminta uang saku kepada ayahnya dengan alasan ia sudah tumbuh dewasa.",
            coverEmoji = "🪙",
            coverImageRes = R.drawable.cover_story_you_have_grown_up,
            estimatedReadMinutes = 2,
            sentences = listOf(
                Sentence(
                    "s_yhgu_1",
                    "孩子经常找爸爸妈妈要钱买东西。这一天，孩子又找爸爸要钱。",
                    "Háizi jīngcháng zhǎo bàba māma yào qián mǎi dōngxi. Zhè yī tiān, háizi yòu zhǎo bàba yào qián.",
                    "Anak itu sering mencari ayah dan ibunya untuk meminta uang membeli barang. Pada suatu hari, anak itu kembali mencari ayahnya untuk meminta uang.",
                    listOf(
                        WordToken("孩子", "háizi", "Anak", "Anak kecil"),
                        WordToken("经常", "jīngcháng", "Sering / kerap", "Adverbia frekuensi"),
                        WordToken("找", "zhǎo", "Mencari / menemui", "Kata kerja mendatangi"),
                        WordToken("爸爸", "bàba", "Ayah", "Orang tua laki-laki"),
                        WordToken("妈妈", "māma", "Ibu", "Orang tua perempuan"),
                        WordToken("要钱", "yào qián", "Meminta uang", "Frasa kata kerja"),
                        WordToken("买东西", "mǎi dōngxi", "Membeli barang", "Aktivitas belanja"),
                        WordToken("这一天", "zhè yī tiān", "Pada suatu hari", "Keterangan waktu"),
                        WordToken("孩子", "háizi", "Anak", "Subjek anak"),
                        WordToken("又", "yòu", "Kembali / lagi", "Adverbia pengulangan masa lampau"),
                        WordToken("找", "zhǎo", "Mencari / menemui", "Kata kerja"),
                        WordToken("爸爸", "bàba", "Ayah", "Orang tua laki-laki"),
                        WordToken("要钱", "yào qián", "Meminta uang", "Frasa kata kerja")
                    )
                ),
                Sentence(
                    "s_yhgu_2",
                    "孩子说：“爸爸，给我五毛钱吧，我想买吃的东西。”",
                    "Háizi shuō: “Bàba, gěi wǒ wǔ máo qián ba, wǒ xiǎng mǎi chī de dōngxi.”",
                    "Anak itu berkata: “Ayah, berikan aku lima puluh sen (5 mao), aku ingin membeli makanan.”",
                    listOf(
                        WordToken("孩子", "háizi", "Anak", "Subjek"),
                        WordToken("说", "shuō", "Berkata", "Kata kerja tutur"),
                        WordToken("爸爸", "bàba", "Ayah", "Panggilan"),
                        WordToken("给我", "gěi wǒ", "Beri saya", "Kata kerja + objek"),
                        WordToken("五毛钱", "wǔ máo qián", "5 mao (0.5 yuan)", "Satuan uang receh"),
                        WordToken("吧", "ba", "Lah / dong", "Partikel permohonan"),
                        WordToken("我想", "wǒ xiǎng", "Saya ingin", "Harapan"),
                        WordToken("买", "mǎi", "Membeli", "Kata kerja"),
                        WordToken("吃的东西", "chī de dōngxi", "Makanan / barang untuk dimakan", "Nomina makanan")
                    )
                ),
                Sentence(
                    "s_yhgu_3",
                    "爸爸说：“你10岁了，已经长大了。昨天你要了五毛钱，今天你又要五毛钱，明天还要五毛钱，这样不好吧？大孩子会这样做吗？”",
                    "Bàba shuō: “Nǐ shí suì le, yǐjīng zhǎngdà le. Zuótiān nǐ yào le wǔ máo qián, jīntiān nǐ yòu yào wǔ máo qián, míngtiān hái yào wǔ máo qián, zhèyàng bù hǎo ba? Dà háizi huì zhèyàng zuò ma?”",
                    "Ayah berkata: “Kamu sudah berusia 10 tahun, sudah besar. Kemarin kamu meminta lima puluh sen, hari ini kamu minta lima puluh sen lagi, besok masih akan minta lima puluh sen, begini tidak baik bukan? Apakah anak besar akan bertingkah seperti ini?”",
                    listOf(
                        WordToken("爸爸", "bàba", "Ayah", "Subjek"),
                        WordToken("说", "shuō", "Berkata", "Kata kerja tutur"),
                        WordToken("你10岁了", "nǐ shí suì le", "Kamu sudah 10 tahun", "Keterangan usia"),
                        WordToken("已经", "yǐjīng", "Sudah", "Adverbia penyelesaian"),
                        WordToken("长大了", "zhǎngdà le", "Tumbuh besar", "Frasa kedewasaan"),
                        WordToken("昨天", "zuótiān", "Kemarin", "Waktu lampau"),
                        WordToken("你要了", "nǐ yào le", "Kamu telah meminta", "Verba aspek lampau"),
                        WordToken("五毛钱", "wǔ máo qián", "5 mao", "Uang receh"),
                        WordToken("今天", "jīntiān", "Hari ini", "Waktu kini"),
                        WordToken("你又", "nǐ yòu", "Kamu kembali / lagi", "Penegas pengulangan"),
                        WordToken("要", "yào", "Meminta", "Kata kerja"),
                        WordToken("五毛钱", "wǔ máo qián", "5 mao", "Mata uang"),
                        WordToken("明天", "míngtiān", "Besok", "Waktu mendatang"),
                        WordToken("还要", "hái yào", "Masih mau meminta", "Kelanjutan"),
                        WordToken("五毛钱", "wǔ máo qián", "5 mao", "Uang"),
                        WordToken("这样", "zhèyàng", "Begini / seperti ini", "Cara / kondisi"),
                        WordToken("不好吧", "bù hǎo ba", "Tidak baik bukan?", "Pertanyaan retoris"),
                        WordToken("大孩子", "dà háizi", "Anak besar / anak dewasa", "Subjek perbandingan"),
                        WordToken("会", "huì", "Akan / bisa", "Peluang modal"),
                        WordToken("这样做", "zhèyàng zuò", "Berbuat demikian", "Tindakan"),
                        WordToken("吗", "ma", "Apakah", "Partikel tanya")
                    )
                ),
                Sentence(
                    "s_yhgu_4",
                    "孩子想了想，说：“爸爸你说得对，这样不好。我是大孩子了，那你今天给我五块钱吧！”",
                    "Háizi xiǎng le xiǎng, shuō: “Bàba nǐ shuō de duì, zhèyàng bù hǎo. Wǒ shì dà háizi le, nà nǐ jīntiān gěi wǒ wǔ kuài qián ba!”",
                    "Anak itu berpikir sejenak, lalu berkata: “Ayah, perkataanmu benar, begini memang tidak baik. Aku sudah anak besar, kalau begitu hari ini beri aku lima yuan (5 kuai) saja!”",
                    listOf(
                        WordToken("孩子", "háizi", "Anak", "Subjek"),
                        WordToken("想了想", "xiǎng le xiǎng", "Berpikir sejenak", "Reduplikasi verba pikir"),
                        WordToken("说", "shuō", "Berkata", "Kata kerja tutur"),
                        WordToken("爸爸", "bàba", "Ayah", "Panggilan"),
                        WordToken("你说得对", "nǐ shuō de duì", "Kamu benar", "Persetujuan"),
                        WordToken("这样", "zhèyàng", "Begini", "Cara"),
                        WordToken("不好", "bù hǎo", "Tidak baik", "Penilaian negatif"),
                        WordToken("我是", "wǒ shì", "Saya adalah", "Pernyataan diri"),
                        WordToken("大孩子了", "dà háizi le", "Sudah anak besar", "Identitas baru"),
                        WordToken("那你", "nà nǐ", "Kalau begitu kamu", "Penghubung konsekuensi"),
                        WordToken("今天", "jīntiān", "Hari ini", "Waktu"),
                        WordToken("给我", "gěi wǒ", "Beri saya", "Permintaan"),
                        WordToken("五块钱", "wǔ kuài qián", "Lima yuan (5 kuai)", "Satuan mata uang yuan"),
                        WordToken("吧", "ba", "Lah / saja", "Partikel permintaan")
                    )
                )
            ),
            questions = listOf(
                StoryQuestion(
                    "q_yhgu_1",
                    "孩子今年几岁了？(Berapa usia anak itu tahun ini?)",
                    listOf("5岁 (5 tahun)", "8岁 (8 tahun)", "10岁 (10 tahun)", "12岁 (12 tahun)"),
                    2,
                    "Di kalimat ketiga ayah berkata: '你10岁了，已经长大了' (Kamu sudah 10 tahun, sudah besar)."
                ),
                StoryQuestion(
                    "q_yhgu_2",
                    "孩子一开始想买什么？(Apa yang awalnya ingin dibeli oleh anak itu?)",
                    listOf(
                        "玩具 (Mainan)",
                        "书 (Buku)",
                        "吃的东西 (Makanan)",
                        "衣服 (Pakaian)"
                    ),
                    2,
                    "Di kalimat kedua anak berkata: '我想买吃的东西' (Aku ingin membeli makanan)."
                ),
                StoryQuestion(
                    "q_yhgu_3",
                    "孩子最后要了多少钱？(Berapa banyak uang yang akhirnya diminta anak itu?)",
                    listOf(
                        "五毛钱 (5 mao / 0.5 yuan)",
                        "五块钱 (5 kuai / 5 yuan)",
                        "十块钱 (10 kuai / 10 yuan)",
                        "不要钱 (Tidak meminta uang)"
                    ),
                    1,
                    "Karena ayah bilang dia sudah anak besar, anak tersebut dengan cerdik meminta 5 kuai (五块钱) yang bernilai 10 kali lipat dari 5 mao."
                )
            )
        ),

        // Cerita Mandarin Bean 6: What are you studying? (你在学什么？)
        Story(
            id = "story_what_are_you_studying",
            titleHanzi = "你在学什么？",
            titlePinyin = "Nǐ Zài Xué Shénme?",
            titleTranslation = "What are you studying? (Kamu Sedang Belajar Apa?)",
            level = "HSK 1",
            category = "Pendidikan & Percakapan",
            description = "Percakapan inspiratif tentang pengalaman belajar bahasa Mandarin di sekolah bahasa, guru akrab, dan tantangan menulis karakter Hanzi.",
            coverEmoji = "📚",
            coverImageRes = R.drawable.cover_story_what_are_you_studying,
            estimatedReadMinutes = 2,
            sentences = listOf(
                Sentence(
                    "s_ways_1",
                    "你在学什么？",
                    "Nǐ zài xué shénme?",
                    "A: Kamu sedang belajar apa?",
                    listOf(
                        WordToken("你", "nǐ", "Kamu", "Kata ganti orang kedua"),
                        WordToken("在", "zài", "Sedang", "Partikel aspek progresif"),
                        WordToken("学", "xué", "Belajar", "Kata kerja mempelajari sesuatu"),
                        WordToken("什么", "shénme", "Apa", "Kata tanya objek atau kegiatan")
                    )
                ),
                Sentence(
                    "s_ways_2",
                    "我在学汉语。",
                    "Wǒ zài xué Hànyǔ.",
                    "B: Saya sedang belajar bahasa Mandarin.",
                    listOf(
                        WordToken("我", "wǒ", "Saya", "Kata ganti orang pertama"),
                        WordToken("在", "zài", "Sedang", "Partikel aspek progresif"),
                        WordToken("学", "xué", "Belajar", "Kata kerja belajar"),
                        WordToken("汉语", "Hànyǔ", "Bahasa Mandarin", "Bahasa Tionghoa / suku Han")
                    )
                ),
                Sentence(
                    "s_ways_3",
                    "你有汉语老师吗？",
                    "Nǐ yǒu Hànyǔ lǎoshī ma?",
                    "A: Apakah kamu punya guru bahasa Mandarin?",
                    listOf(
                        WordToken("你", "nǐ", "Kamu", "Kata ganti orang kedua"),
                        WordToken("有", "yǒu", "Punya / memiliki", "Kata kerja kepemilikan"),
                        WordToken("汉语", "Hànyǔ", "Bahasa Mandarin", "Bahasa Mandarin"),
                        WordToken("老师", "lǎoshī", "Guru", "Pendidik atau pengajar"),
                        WordToken("吗", "ma", "Apakah", "Partikel tanya ya/tidak")
                    )
                ),
                Sentence(
                    "s_ways_4",
                    "我有两个汉语老师，他们也是我的好朋友。",
                    "Wǒ yǒu liǎng gè Hànyǔ lǎoshī, tāmen yě shì wǒ de hǎo péngyou.",
                    "B: Saya punya dua guru bahasa Mandarin, mereka juga teman baik saya.",
                    listOf(
                        WordToken("我", "wǒ", "Saya", "Kata ganti orang pertama"),
                        WordToken("有", "yǒu", "Punya", "Kata kerja kepemilikan"),
                        WordToken("两个", "liǎng gè", "Dua orang", "Bilangan liang + penggolong ge"),
                        WordToken("汉语老师", "Hànyǔ lǎoshī", "Guru Mandarin", "Profesi pengajar bahasa Mandarin"),
                        WordToken("他们", "tāmen", "Mereka", "Kata ganti orang ketiga jamak"),
                        WordToken("也", "yě", "Juga", "Adverbia penambahan"),
                        WordToken("是", "shì", "Adalah", "Kopula / kata kerja penghubung"),
                        WordToken("我的", "wǒ de", "Milik saya", "Kata ganti kepemilikan"),
                        WordToken("好朋友", "hǎo péngyou", "Sahabat / teman baik", "Teman akrab yang dekat")
                    )
                ),
                Sentence(
                    "s_ways_5",
                    "你在家学习吗？",
                    "Nǐ zài jiā xuéxí ma?",
                    "A: Apakah kamu belajar di rumah?",
                    listOf(
                        WordToken("你", "nǐ", "Kamu", "Kata ganti orang kedua"),
                        WordToken("在", "zài", "Di", "Preposisi tempat"),
                        WordToken("家", "jiā", "Rumah", "Tempat tinggal / hunian"),
                        WordToken("学习", "xuéxí", "Belajar", "Kata kerja belajar"),
                        WordToken("吗", "ma", "Apakah", "Partikel kalimat tanya")
                    )
                ),
                Sentence(
                    "s_ways_6",
                    "不，我在汉语学校学习。我有三十个同学。",
                    "Bù, wǒ zài Hànyǔ xuéxiào xuéxí. Wǒ yǒu sānshí gè tóngxué.",
                    "B: Tidak, saya belajar di sekolah bahasa Mandarin. Saya punya tiga puluh teman sekelas.",
                    listOf(
                        WordToken("不", "bù", "Tidak", "Partikel negasi"),
                        WordToken("我", "wǒ", "Saya", "Kata ganti orang pertama"),
                        WordToken("在", "zài", "Di", "Preposisi lokasi"),
                        WordToken("汉语学校", "Hànyǔ xuéxiào", "Sekolah bahasa Mandarin", "Institusi kursus bahasa Mandarin"),
                        WordToken("学习", "xuéxí", "Belajar", "Melakukan aktivitas studi"),
                        WordToken("我", "wǒ", "Saya", "Kata ganti orang pertama"),
                        WordToken("有", "yǒu", "Memiliki", "Kata kerja kepemilikan"),
                        WordToken("三十个", "sānshí gè", "Tiga puluh orang", "Angka 30 + penggolong"),
                        WordToken("同学", "tóngxué", "Teman sekelas", "Sesama pelajar dalam satu kelas")
                    )
                ),
                Sentence(
                    "s_ways_7",
                    "你学汉语多长时间了？",
                    "Nǐ xué Hànyǔ duō cháng shíjiān le?",
                    "A: Sudah berapa lama kamu belajar bahasa Mandarin?",
                    listOf(
                        WordToken("你", "nǐ", "Kamu", "Kata ganti orang kedua"),
                        WordToken("学", "xué", "Belajar", "Kata kerja belajar"),
                        WordToken("汉语", "Hànyǔ", "Bahasa Mandarin", "Bahasa Mandarin"),
                        WordToken("多长时间", "duō cháng shíjiān", "Berapa lama", "Frasa penanya durasi waktu"),
                        WordToken("了", "le", "Sudah", "Partikel aspek perubahan keadaan")
                    )
                ),
                Sentence(
                    "s_ways_8",
                    "我学汉语三年了，现在是HSK四级。",
                    "Wǒ xué Hànyǔ sān nián le, xiànzài shì HSK sì jí.",
                    "B: Saya sudah belajar bahasa Mandarin tiga tahun, sekarang tingkat HSK 4.",
                    listOf(
                        WordToken("我", "wǒ", "Saya", "Kata ganti orang pertama"),
                        WordToken("学", "xué", "Belajar", "Kata kerja belajar"),
                        WordToken("汉语", "Hànyǔ", "Bahasa Mandarin", "Bahasa Mandarin"),
                        WordToken("三年", "sān nián", "Tiga tahun", "Rentang waktu 3 tahun"),
                        WordToken("了", "le", "Sudah", "Partikel aspek durasi berjalan"),
                        WordToken("现在", "xiànzài", "Sekarang", "Keterangan waktu saat ini"),
                        WordToken("是", "shì", "Adalah / mencapai", "Kopula"),
                        WordToken("HSK四级", "HSK sì jí", "HSK tingkat 4", "Ujian kemampuan bahasa Mandarin level 4")
                    )
                ),
                Sentence(
                    "s_ways_9",
                    "真棒！",
                    "Zhēn bàng!",
                    "A: Hebat sekali!",
                    listOf(
                        WordToken("真", "zhēn", "Sungguh / benar-benar", "Adverbia penegas intensitas"),
                        WordToken("棒", "bàng", "Hebat / luar biasa", "Kata sifat pujian keunggulan")
                    )
                ),
                Sentence(
                    "s_ways_10",
                    "但是我的汉字不好。很多汉字我会读，不会写。",
                    "Dànshì wǒ de hànzì bù hǎo. Hěnduō hànzì wǒ huì dú, bù huì xiě.",
                    "B: Tetapi karakter Hanzi saya kurang bagus. Banyak karakter Hanzi yang bisa saya baca, tapi tidak bisa saya tulis.",
                    listOf(
                        WordToken("但是", "dànshì", "Tetapi / namun", "Konjungsi pertentangan"),
                        WordToken("我的", "wǒ de", "Milik saya", "Kata ganti kepemilikan"),
                        WordToken("汉字", "hànzì", "Karakter Hanzi", "Tulisan aksara Mandarin"),
                        WordToken("不好", "bù hǎo", "Kurang baik / tidak bagus", "Kondisi tidak memuaskan"),
                        WordToken("很多", "hěnduō", "Banyak", "Kuantitas banyak"),
                        WordToken("汉字", "hànzì", "Karakter Hanzi", "Tulisan aksara Mandarin"),
                        WordToken("我", "wǒ", "Saya", "Kata ganti orang pertama"),
                        WordToken("会读", "huì dú", "Bisa membaca", "Mampu mengenali dan mengeja bacaan"),
                        WordToken("不会写", "bù huì xiě", "Tidak bisa menulis", "Belum mampu menuliskan goresan karakter")
                    )
                ),
                Sentence(
                    "s_ways_11",
                    "没关系，多练习就好了！",
                    "Méiguānxi, duō liànxí jiù hǎo le!",
                    "A: Tidak apa-apa, perbanyak latihan pasti akan lancar!",
                    listOf(
                        WordToken("没关系", "méiguānxi", "Tidak apa-apa", "Ungkapan penghibur / santai saja"),
                        WordToken("多", "duō", "Perbanyak / sering", "Adverbia kuantitas tindakan"),
                        WordToken("练习", "liànxí", "Berlatih / latihan", "Melakukan latihan berulang"),
                        WordToken("就", "jiù", "Maka / pasti", "Kata sambung penguat akibat"),
                        WordToken("好了", "hǎo le", "Akan bagus / beres", "Menunjukkan kepastian hasil baik")
                    )
                ),
                Sentence(
                    "s_ways_12",
                    "我的老师也这么说。",
                    "Wǒ de lǎoshī yě zhème shuō.",
                    "B: Guru saya juga berkata begitu.",
                    listOf(
                        WordToken("我的", "wǒ de", "Milik saya", "Kepemilikan"),
                        WordToken("老师", "lǎoshī", "Guru", "Pengajar"),
                        WordToken("也", "yě", "Juga", "Adverbia kesamaan"),
                        WordToken("这么说", "zhème shuō", "Berkata demikian", "Menyatakan ucapan serupa")
                    )
                )
            ),
            questions = listOf(
                StoryQuestion(
                    "q_ways_1",
                    "A问B在学什么？(A bertanya apa yang sedang dipelajari B?)",
                    listOf(
                        "在学英语 (Sedang belajar bahasa Inggris)",
                        "在学汉语 (Sedang belajar bahasa Mandarin)",
                        "在学习做饭 (Sedang belajar memasak)",
                        "在学画画 (Sedang belajar melukis)"
                    ),
                    1,
                    "Pembicara B menjawab dengan jelas: '我在学汉语' (Saya sedang belajar bahasa Mandarin)."
                ),
                StoryQuestion(
                    "q_ways_2",
                    "B在哪里学习汉语？(Di mana B belajar bahasa Mandarin?)",
                    listOf(
                        "在家自学 (Belajar mandiri di rumah)",
                        "在汉语学校 (Di sekolah bahasa Mandarin)",
                        "在大学 (Di universitas umum)",
                        "在图书馆 (Di perpustakaan kota)"
                    ),
                    1,
                    "Pembicara B menyatakan: '不，我在汉语学校学习。我有三十个同学。' (Tidak, saya belajar di sekolah bahasa Mandarin)."
                ),
                StoryQuestion(
                    "q_ways_3",
                    "B学汉语多长时间了？现在水平如何？(Sudah berapa lama B belajar dan bagaimana tingkatannya sekarang?)",
                    listOf(
                        "学了一年，HSK一级 (1 tahun, tingkat HSK 1)",
                        "学了两年，HSK二级 (2 tahun, tingkat HSK 2)",
                        "学了三年，现在是HSK四级 (3 tahun, sekarang tingkat HSK 4)",
                        "学了五年，现在是HSK六级 (5 tahun, sekarang tingkat HSK 6)"
                    ),
                    2,
                    "B menjelaskan: '我学汉语三年了，现在是HSK四级。' (Sudah 3 tahun belajar bahasa Mandarin, sekarang tingkat HSK 4)."
                ),
                StoryQuestion(
                    "q_ways_4",
                    "B觉得学习汉语哪方面比较困难？(Bagian mana yang dirasa sulit oleh B?)",
                    listOf(
                        "听不懂老师说话 (Tidak paham ucapan guru)",
                        "很多汉字会读不会写 (Banyak karakter hanzi yang bisa dibaca tapi tidak bisa ditulis)",
                        "发音不准 (Pelafalan nada tidak tepat)",
                        "记不住生词 (Sulit menghafal kosakata baru)"
                    ),
                    1,
                    "B mengatakan: '但是我的汉字不好。很多汉字我会读，不会写。' (Tetapi karakter Hanzi saya kurang bagus, banyak yang bisa dibaca tapi belum bisa ditulis)."
                )
            )
        ),

        // Cerita Mandarin Bean 7: My family (我的家人)
        Story(
            id = "story_my_family",
            titleHanzi = "我的家人",
            titlePinyin = "Wǒ de Jiārén",
            titleTranslation = "My family (Keluarga Saya)",
            level = "HSK 1",
            category = "Keluarga & Percakapan",
            description = "Pertemuan hangat di restoran masakan Kanton antara murid dan Guru Wang, menceritakan keluarga berempat yang bahagia dan rukun.",
            coverEmoji = "👨‍👩‍👧‍👦",
            coverImageRes = R.drawable.cover_story_my_family,
            estimatedReadMinutes = 2,
            sentences = listOf(
                Sentence(
                    "s_myfam_1",
                    "王老师，好久不见！",
                    "Wáng lǎoshī, hǎojiǔ bu jiàn!",
                    "A: Guru Wang, lama tidak bertemu!",
                    listOf(
                        WordToken("王老师", "Wáng lǎoshī", "Guru Wang", "Panggilan hormat guru bermarga Wang"),
                        WordToken("好久不见", "hǎojiǔ bu jiàn", "Lama tidak bertemu", "Ungkapan salam saat sudah lama tak bersua")
                    )
                ),
                Sentence(
                    "s_myfam_2",
                    "好久不见！你也来这家饭店吃饭？",
                    "Hǎojiǔ bu jiàn! Nǐ yě lái zhè jiā fàndiàn chī fàn?",
                    "B: Lama tidak bertemu! Kamu juga datang makan di restoran ini?",
                    listOf(
                        WordToken("好久不见", "hǎojiǔ bu jiàn", "Lama tidak bertemu", "Sapaan ramah reuni"),
                        WordToken("你也", "nǐ yě", "Kamu juga", "Subjek dan adverbia kesamaan"),
                        WordToken("来", "lái", "Datang", "Kata kerja pergerakan"),
                        WordToken("这家", "zhè jiā", "Ini (penggolong usaha)", "Kata tunjuk + penggolong restoran"),
                        WordToken("饭店", "fàndiàn", "Restoran / rumah makan", "Tempat makan"),
                        WordToken("吃饭", "chī fàn", "Makan nasi / bersantap", "Melakukan kegiatan makan")
                    )
                ),
                Sentence(
                    "s_myfam_3",
                    "对，我和我的家人来吃饭。我的朋友说这里的广东菜很好吃。",
                    "Duì, wǒ hé wǒ de jiārén lái chī fàn. Wǒ de péngyou shuō zhèlǐ de Guǎngdōng cài hěn hǎochī.",
                    "A: Betul, saya dan keluarga saya datang untuk makan. Teman saya bilang masakan Kanton di sini sangat enak.",
                    listOf(
                        WordToken("对", "duì", "Betul / benar", "Pernyataan konfirmasi pembenaran"),
                        WordToken("我和", "wǒ hé", "Saya dan", "Pronomina + kata hubung"),
                        WordToken("我的家人", "wǒ de jiārén", "Keluarga saya", "Anggota keluarga penutur"),
                        WordToken("来吃饭", "lái chī fàn", "Datang untuk makan", "Tujuan kedatangan"),
                        WordToken("我的朋友", "wǒ de péngyou", "Teman saya", "Subjek teman"),
                        WordToken("说", "shuō", "Berkata / bilang", "Kata kerja menyatakan info"),
                        WordToken("这里的", "zhèlǐ de", "Yang di sini", "Penunjuk tempat"),
                        WordToken("广东菜", "Guǎngdōng cài", "Masakan Kanton / Guangdong", "Masakan khas provinsi Guangdong yang populer"),
                        WordToken("很好吃", "hěn hǎochī", "Sangat lezat / sedap", "Kualitas rasa yang enak")
                    )
                ),
                Sentence(
                    "s_myfam_4",
                    "你的爸爸妈妈也来了吗？",
                    "Nǐ de bàba māma yě lái le ma?",
                    "B: Apakah ayah dan ibumu juga ikut datang?",
                    listOf(
                        WordToken("你的", "nǐ de", "Milikmu", "Kepemilikan orang kedua"),
                        WordToken("爸爸妈妈", "bàba māma", "Orang tua (ayah dan ibu)", "Panggilan untuk ayah dan ibu"),
                        WordToken("也", "yě", "Juga", "Adverbia penambahan"),
                        WordToken("来了", "lái le", "Sudah datang", "Tindakan kedatangan"),
                        WordToken("吗", "ma", "Apakah", "Partikel tanya ya/tidak")
                    )
                ),
                Sentence(
                    "s_myfam_5",
                    "没有，他们喜欢在家吃。我的孩子们来了。那是我的老公，小孙；那个是我的大儿子，小宝，今年7岁了；这是我的小女儿，小贝，今年5岁了。",
                    "Méiyǒu, tāmen xǐhuan zài jiā chī. Wǒ de háizimen lái le. Nà shì wǒ de lǎogōng, Xiǎo Sūn; nà gè shì wǒ de dà érzi, Xiǎo Bǎo, jīnnián 7 suì le; zhè shì wǒ de xiǎo nǚ'ér, Xiǎo Bèi, jīnnián 5 suì le.",
                    "A: Tidak, mereka suka makan di rumah. Anak-anak saya yang datang. Itu suami saya, Xiao Sun; yang itu putra sulung saya, Xiao Bao, tahun ini 7 tahun; ini putri bungsu saya, Xiao Bei, tahun ini 5 tahun.",
                    listOf(
                        WordToken("没有", "méiyǒu", "Tidak ada / tidak", "Bentuk negasi"),
                        WordToken("他们喜欢", "tāmen xǐhuan", "Mereka suka", "Subjek jamak + kata kerja gemar"),
                        WordToken("在家吃", "zài jiā chī", "Makan di rumah", "Makan di dalam rumah sendiri"),
                        WordToken("我的孩子们", "wǒ de háizimen", "Anak-anak saya", "Bentuk jamak anak penutur"),
                        WordToken("来了", "lái le", "Sudah datang", "Kedatangan"),
                        WordToken("那是", "nà shì", "Itu adalah", "Kata tunjuk jauh + kopula"),
                        WordToken("我的老公", "wǒ de lǎogōng", "Suami saya", "Panggilan akrab untuk suami"),
                        WordToken("小孙", "Xiǎo Sūn", "Xiao Sun", "Nama panggilan suami bermarga Sun"),
                        WordToken("那个是", "nà gè shì", "Yang itu adalah", "Kata tunjuk jauh + kopula"),
                        WordToken("我的", "wǒ de", "Milik saya", "Kepemilikan"),
                        WordToken("大儿子", "dà érzi", "Putra sulung", "Anak laki-laki pertama"),
                        WordToken("小宝", "Xiǎo Bǎo", "Xiao Bao", "Panggilan sayang untuk anak pertama"),
                        WordToken("今年7岁了", "jīnnián 7 suì le", "Tahun ini berusia 7 tahun", "Menyatakan umur"),
                        WordToken("这是", "zhè shì", "Ini adalah", "Kata penunjuk dekat + kopula"),
                        WordToken("我的", "wǒ de", "Milik saya", "Kepemilikan"),
                        WordToken("小女儿", "xiǎo nǚ'ér", "Putri bungsu", "Anak perempuan terkecil"),
                        WordToken("小贝", "Xiǎo Bèi", "Xiao Bei", "Panggilan sayang untuk anak kedua"),
                        WordToken("今年5岁了", "jīnnián 5 suì le", "Tahun ini berusia 5 tahun", "Menyatakan umur")
                    )
                ),
                Sentence(
                    "s_myfam_6",
                    "你们一家四口人真幸福！孩子们都上学了吗？",
                    "Nǐmen yī jiā sì kǒu rén zhēn xìngfú! Háizimen dōu shàngxué le ma?",
                    "B: Keluarga berempat kalian sungguh bahagia! Apakah anak-anak sudah sekolah semua?",
                    listOf(
                        WordToken("你们", "nǐmen", "Kalian", "Pronomina jamak orang kedua"),
                        WordToken("一家四口人", "yī jiā sì kǒu rén", "Satu keluarga 4 anggota", "Frasa jumlah anggota keluarga"),
                        WordToken("真幸福", "zhēn xìngfú", "Sungguh bahagia", "Pernyataan kebahagiaan dan keharmonisan"),
                        WordToken("孩子们", "háizimen", "Anak-anak", "Bentuk jamak anak"),
                        WordToken("都", "dōu", "Semua", "Adverbia cakupan menyeluruh"),
                        WordToken("上学了吗", "shàngxué le ma", "Apakah sudah mulai sekolah?", "Menanyakan masa sekolah")
                    )
                ),
                Sentence(
                    "s_myfam_7",
                    "大儿子去年上小学了，小女儿明年上小学。",
                    "Dà érzi qùnián shàng xiǎoxué le, xiǎo nǚ'ér míngnián shàng xiǎoxué.",
                    "A: Putra sulung tahun lalu sudah masuk SD, putri bungsu tahun depan baru masuk SD.",
                    listOf(
                        WordToken("大儿子", "dà érzi", "Putra sulung", "Anak laki-laki tertua"),
                        WordToken("去年", "qùnián", "Tahun lalu", "Keterangan tahun sebelumnya"),
                        WordToken("上小学了", "shàng xiǎoxué le", "Sudah masuk SD", "Mulai bersekolah jenjang dasar"),
                        WordToken("小女儿", "xiǎo nǚ'ér", "Putri bungsu", "Anak perempuan terkecil"),
                        WordToken("明年", "míngnián", "Tahun depan", "Keterangan tahun yang akan datang"),
                        WordToken("上小学", "shàng xiǎoxué", "Masuk SD", "Bersekolah jenjang Sekolah Dasar")
                    )
                ),
                Sentence(
                    "s_myfam_8",
                    "你老公也会说汉语吗？",
                    "Nǐ lǎogōng yě huì shuō Hànyǔ ma?",
                    "B: Apakah suamimu juga bisa berbicara bahasa Mandarin?",
                    listOf(
                        WordToken("你老公", "nǐ lǎogōng", "Suamimu", "Panggilan suami dari lawan bicara"),
                        WordToken("也", "yě", "Juga", "Adverbia penambahan"),
                        WordToken("会说", "huì shuō", "Bisa berbicara", "Kemampuan berbahasa"),
                        WordToken("汉语", "Hànyǔ", "Bahasa Mandarin", "Bahasa Mandarin"),
                        WordToken("吗", "ma", "Apakah", "Partikel tanya ya/tidak")
                    )
                ),
                Sentence(
                    "s_myfam_9",
                    "哈哈，当然，他是中国人！",
                    "Hāhā, dāngrán, tā shì Zhōngguó rén!",
                    "A: Haha, tentu saja, dia adalah orang Tiongkok!",
                    listOf(
                        WordToken("哈哈", "hāhā", "Haha", "Tawa ceria dan akrab"),
                        WordToken("当然", "dāngrán", "Tentu saja", "Kepastian penuh"),
                        WordToken("他是", "tā shì", "Dia adalah", "Subjek dia + kopula"),
                        WordToken("中国人", "Zhōngguó rén", "Orang Tiongkok", "Warga negara Tiongkok")
                    )
                )
            ),
            questions = listOf(
                StoryQuestion(
                    "q_myfam_1",
                    "A和王老师在哪里见面？(Di mana A dan Guru Wang bertemu?)",
                    listOf(
                        "在学校 (Di sekolah)",
                        "在广东菜饭店 (Di restoran masakan Kanton)",
                        "在医院 (Di rumah sakit)",
                        "在机场 (Di bandara)"
                    ),
                    1,
                    "Keduanya bertemu saat makan di restoran: '你也来这家饭店吃饭？' dan menikmati '广东菜' (masakan Kanton)."
                ),
                StoryQuestion(
                    "q_myfam_2",
                    "谁没有来这家饭店吃饭？(Siapa yang tidak ikut datang makan di restoran?)",
                    listOf(
                        "A的老公 (Suami A)",
                        "A的大儿子小宝 (Putra sulung A, Xiao Bao)",
                        "A的爸爸妈妈 (Ayah dan ibu A)",
                        "A的小女儿小贝 (Putri bungsu A, Xiao Bei)"
                    ),
                    2,
                    "A menjawab: '没有，他们喜欢在家吃。' (Ayah dan ibunya tidak ikut karena lebih suka makan di rumah)."
                ),
                StoryQuestion(
                    "q_myfam_3",
                    "关于A的两个孩子，哪个描述是正确的？(Mengenai kedua anak A, pernyataan mana yang benar?)",
                    listOf(
                        "小宝今年7岁，去年上小学了 (Xiao Bao 7 tahun, tahun lalu sudah masuk SD)",
                        "小贝今年7岁，明年上小学 (Xiao Bei 7 tahun, tahun depan masuk SD)",
                        "两个孩子都在上小学 (Kedua anak sudah masuk SD)",
                        "小宝今年5岁，还没有上学 (Xiao Bao 5 tahun, belum sekolah)"
                    ),
                    0,
                    "A menjelaskan: Xiao Bao (putra sulung) tahun ini 7 tahun dan tahun lalu sudah masuk SD ('大儿子去年上小学了')."
                ),
                StoryQuestion(
                    "q_myfam_4",
                    "为什么A的老公会说汉语？(Mengapa suami A bisa berbicara bahasa Mandarin?)",
                    listOf(
                        "因为他学汉语三年了 (Karena dia sudah belajar 3 tahun)",
                        "因为他是中国人 (Karena dia adalah orang Tiongkok)",
                        "因为他是汉语老师 (Karena dia seorang guru Mandarin)",
                        "因为他在汉语学校工作 (Karena dia bekerja di sekolah Mandarin)"
                    ),
                    1,
                    "A tertawa ramah dan menjawab: '哈哈，当然，他是中国人！' (Haha, tentu saja, dia adalah orang Tiongkok!)."
                )
            )
        ),

        // Cerita Mandarin Bean 8: What to do tomorrow? (明天做什么？)
        Story(
            id = "story_what_to_do_tomorrow",
            titleHanzi = "明天做什么？",
            titlePinyin = "Míngtiān Zuò Shénme?",
            titleTranslation = "What to do tomorrow? (Besok Mau Melakukan Apa?)",
            level = "HSK 1",
            category = "Rencana & Belanja",
            description = "Percakapan santai akhir pekan tentang rencana hari Sabtu, belanja kebutuhan dan buah segar, serta janji masak makan malam bersama.",
            coverEmoji = "☕",
            coverImageRes = R.drawable.cover_story_what_to_do_tomorrow,
            estimatedReadMinutes = 2,
            sentences = listOf(
                Sentence(
                    "s_wtdt_1",
                    "明天你想做什么？",
                    "Míngtiān nǐ xiǎng zuò shénme?",
                    "A: Besok kamu ingin melakukan apa?",
                    listOf(
                        WordToken("明天", "míngtiān", "Besok", "Keterangan waktu esok hari"),
                        WordToken("你想", "nǐ xiǎng", "Kamu ingin", "Subjek + kata kerja bantu berkeinginan"),
                        WordToken("做", "zuò", "Melakukan", "Kata kerja perbuatan"),
                        WordToken("什么", "shénme", "Apa", "Kata tanya benda/aktivitas")
                    )
                ),
                Sentence(
                    "s_wtdt_2",
                    "明天去学校。",
                    "Míngtiān qù xuéxiào.",
                    "B: Besok pergi ke sekolah.",
                    listOf(
                        WordToken("明天", "míngtiān", "Besok", "Keterangan waktu"),
                        WordToken("去", "qù", "Pergi ke", "Kata kerja perpindahan arah"),
                        WordToken("学校", "xuéxiào", "Sekolah", "Tempat belajar dan menuntut ilmu")
                    )
                ),
                Sentence(
                    "s_wtdt_3",
                    "明天星期六，休息。",
                    "Míngtiān Xīngqīliù, xiūxi.",
                    "A: Besok hari Sabtu, libur istirahat.",
                    listOf(
                        WordToken("明天", "míngtiān", "Besok", "Waktu esok"),
                        WordToken("星期六", "Xīngqīliù", "Hari Sabtu", "Nama hari ke-6 dalam sepekan"),
                        WordToken("休息", "xiūxi", "Istirahat / libur", "Beristirahat dari rutinitas kerja/sekolah")
                    )
                ),
                Sentence(
                    "s_wtdt_4",
                    "是呢，我忘了。明天上午我想在家睡觉，下午我想去书店买书，你呢？",
                    "Shì ne, wǒ wàng le. Míngtiān shàngwǔ wǒ xiǎng zài jiā shuìjiào, xiàwǔ wǒ xiǎng qù shūdiàn mǎi shū, nǐ ne?",
                    "B: Iya ya, saya lupa. Besok pagi saya ingin tidur di rumah, sore harinya saya ingin pergi ke toko buku untuk membeli buku, bagaimana denganmu?",
                    listOf(
                        WordToken("是呢", "shì ne", "Iya ya / benar juga", "Partikel penanda kesadaran baru"),
                        WordToken("我忘了", "wǒ wàng le", "Saya lupa", "Pernyataan lupa akan sesuatu"),
                        WordToken("明天上午", "míngtiān shàngwǔ", "Besok pagi", "Waktu pagi esok hari"),
                        WordToken("我想", "wǒ xiǎng", "Saya berniat", "Menyatakan rencana keinginan"),
                        WordToken("在家睡觉", "zài jiā shuìjiào", "Tidur di rumah", "Tempat dan aktivitas istirahat tidur"),
                        WordToken("下午", "xiàwǔ", "Sore hari", "Rentang waktu setelah siang"),
                        WordToken("我想", "wǒ xiǎng", "Saya berniat", "Menyatakan rencana"),
                        WordToken("去书店买书", "qù shūdiàn mǎi shū", "Pergi ke toko buku membeli buku", "Aktivitas membeli literatur"),
                        WordToken("你呢", "nǐ ne", "Kalau kamu?", "Pertanyaan balik retoris santai")
                    )
                ),
                Sentence(
                    "s_wtdt_5",
                    "我想去买东西。",
                    "Wǒ xiǎng qù mǎi dōngxi.",
                    "A: Saya ingin pergi berbelanja.",
                    listOf(
                        WordToken("我想去", "wǒ xiǎng qù", "Saya ingin pergi", "Niat berangkat"),
                        WordToken("买东西", "mǎi dōngxi", "Berbelanja barang", "Ungkapan membeli barang-barang kebutuhan")
                    )
                ),
                Sentence(
                    "s_wtdt_6",
                    "你想买什么？",
                    "Nǐ xiǎng mǎi shénme?",
                    "B: Kamu ingin membeli apa?",
                    listOf(
                        WordToken("你想买", "nǐ xiǎng mǎi", "Kamu ingin membeli", "Menanyakan daftar belanjaan"),
                        WordToken("什么", "shénme", "Apa", "Kata tanya objek")
                    )
                ),
                Sentence(
                    "s_wtdt_7",
                    "我想买一个杯子，一盒牛奶，还有一些水果。",
                    "Wǒ xiǎng mǎi yī gè bēizi, yī hé niúnǎi, hái yǒu yīxiē shuǐguǒ.",
                    "A: Saya ingin membeli sebuah cangkir, sekotak susu, dan juga beberapa buah-buahan.",
                    listOf(
                        WordToken("我想买", "wǒ xiǎng mǎi", "Saya ingin membeli", "Keinginan berbelanja"),
                        WordToken("一个杯子", "yī gè bēizi", "Sebuah cangkir / gelas", "Bilangan + kata penggolong + wadah minum"),
                        WordToken("一盒牛奶", "yī hé niúnǎi", "Sekotak susu", "Bilangan + penggolong kotak + susu sapi"),
                        WordToken("还有", "hái yǒu", "Dan juga / masih ada", "Konjungsi penambahan item"),
                        WordToken("一些水果", "yīxiē shuǐguǒ", "Beberapa buah", "Kuantitas jamak + buah-buahan")
                    )
                ),
                Sentence(
                    "s_wtdt_8",
                    "你喜欢吃什么水果？",
                    "Nǐ xǐhuan chī shénme shuǐguǒ?",
                    "B: Kamu suka makan buah apa?",
                    listOf(
                        WordToken("你喜欢吃", "nǐ xǐhuan chī", "Kamu suka makan", "Menanyakan preferensi makanan"),
                        WordToken("什么水果", "shénme shuǐguǒ", "Buah apa", "Kata tanya ragam buah")
                    )
                ),
                Sentence(
                    "s_wtdt_9",
                    "我喜欢吃香蕉和苹果。",
                    "Wǒ xǐhuan chī xiāngjiāo hé píngguǒ.",
                    "A: Saya suka makan pisang dan apel.",
                    listOf(
                        WordToken("我喜欢吃", "wǒ xǐhuan chī", "Saya suka makan", "Pernyataan selera"),
                        WordToken("香蕉", "xiāngjiāo", "Pisang", "Buah pisang kuning"),
                        WordToken("和", "hé", "Dan", "Kata penghubung setara"),
                        WordToken("苹果", "píngguǒ", "Apel", "Buah apel segar")
                    )
                ),
                Sentence(
                    "s_wtdt_10",
                    "我家也没有水果了。现在的苹果很好，你帮我也买一斤吧。",
                    "Wǒ jiā yě méiyǒu shuǐguǒ le. Xiànzài de píngguǒ hěn hǎo, nǐ bāng wǒ yě mǎi yī jīn ba.",
                    "B: Di rumah saya juga sudah tidak ada buah lagi. Apel saat ini sangat bagus, tolong bantu belikan untuk saya juga satu jin (setengah kilogram) ya.",
                    listOf(
                        WordToken("我家", "wǒ jiā", "Rumah saya", "Tempat tinggal penutur"),
                        WordToken("也没有", "yě méiyǒu", "Juga tidak ada", "Adverbia + negasi"),
                        WordToken("水果了", "shuǐguǒ le", "Buah lagi", "Buah + partikel perubahan keadaan"),
                        WordToken("现在的", "xiànzài de", "Yang sekarang", "Keterangan musim sekarang"),
                        WordToken("苹果很好", "píngguǒ hěn hǎo", "Apelnya sangat bagus", "Kualitas buah yang segar"),
                        WordToken("你帮我", "nǐ bāng wǒ", "Kamu tolong saya", "Permintaan bantuan ramah"),
                        WordToken("也买", "yě mǎi", "Juga beli", "Ikut membeli"),
                        WordToken("一斤吧", "yī jīn ba", "Satu jin ya (500 gram)", "Satuan timbangan Tiongkok 0.5 kg + partikel saran")
                    )
                ),
                Sentence(
                    "s_wtdt_11",
                    "没问题。我明天几点给你苹果？",
                    "Méi wèntí. Wǒ míngtiān jǐ diǎn gěi nǐ píngguǒ?",
                    "A: Tidak masalah. Besok saya jam berapa memberikan apelnya kepadamu?",
                    listOf(
                        WordToken("没问题", "méi wèntí", "Tidak masalah / siap", "Ungkapan kesediaan membantu"),
                        WordToken("我明天", "wǒ míngtiān", "Saya besok", "Subjek + waktu"),
                        WordToken("几点", "jǐ diǎn", "Jam berapa", "Menanyakan waktu spesifik"),
                        WordToken("给你", "gěi nǐ", "Memberikan padamu", "Menyerahkan barang"),
                        WordToken("苹果", "píngguǒ", "Apel", "Objek buah apel")
                    )
                ),
                Sentence(
                    "s_wtdt_12",
                    "明天我五点从书店回家，你五点来我家吧。你也可以在我家吃饭，明天我们自己做，怎么样？",
                    "Míngtiān wǒ wǔ diǎn cóng shūdiàn huí jiā, nǐ wǔ diǎn lái wǒ jiā ba. Nǐ yě kěyǐ zài wǒ jiā chī fàn, míngtiān wǒmen zìjǐ zuò, zěnmeyàng?",
                    "B: Besok saya jam 5 pulang ke rumah dari toko buku, kamu datang ke rumah saya jam 5 saja. Kamu juga bisa makan di rumah saya, besok kita masak sendiri, bagaimana?",
                    listOf(
                        WordToken("明天我五点", "míngtiān wǒ wǔ diǎn", "Besok saya jam lima", "Waktu kepulangan"),
                        WordToken("从书店回家", "cóng shūdiàn huí jiā", "Pulang ke rumah dari toko buku", "Asal tempat + pulang ke kediaman"),
                        WordToken("你五点", "nǐ wǔ diǎn", "Kamu jam lima", "Waktu kedatangan"),
                        WordToken("来我家吧", "lái wǒ jiā ba", "Datanglah ke rumah saya", "Undangan hangat berkunjung"),
                        WordToken("你也可以", "nǐ yě kěyǐ", "Kamu juga bisa / boleh", "Memberikan pilihan yang baik"),
                        WordToken("在我家吃饭", "zài wǒ jiā chī fàn", "Makan di rumah saya", "Makan bersama di rumah"),
                        WordToken("明天我们", "míngtiān wǒmen", "Besok kita", "Waktu dan subjek jamak"),
                        WordToken("自己做", "zìjǐ zuò", "Masak / bikin sendiri", "Memasak mandiri bersama"),
                        WordToken("怎么样", "zěnmeyàng", "Bagaimana menurutmu?", "Menanyakan kesepakatan")
                    )
                ),
                Sentence(
                    "s_wtdt_13",
                    "好，明天五点我去你家。",
                    "Hǎo, míngtiān wǔ diǎn wǒ qù nǐ jiā.",
                    "A: Baik, besok jam 5 saya akan pergi ke rumahmu.",
                    listOf(
                        WordToken("好", "hǎo", "Baik / setuju", "Pernyataan sepakat"),
                        WordToken("明天五点", "míngtiān wǔ diǎn", "Besok jam 5", "Kepastian waktu"),
                        WordToken("我去", "wǒ qù", "Saya akan berangkat ke", "Aktivitas pergi"),
                        WordToken("你家", "nǐ jiā", "Rumahmu", "Destinasi tujuan")
                    )
                )
            ),
            questions = listOf(
                StoryQuestion(
                    "q_wtdt_1",
                    "为什么B明天不用去学校？(Mengapa B besok tidak perlu ke sekolah?)",
                    listOf(
                        "因为他生病了 (Karena dia sakit)",
                        "因为明天星期六，学校休息 (Karena besok hari Sabtu, sekolah libur)",
                        "因为他已经毕业了 (Karena dia sudah lulus)",
                        "因为学校在装修 (Karena sekolah sedang renovasi)"
                    ),
                    1,
                    "A mengingatkan B bahwa: '明天星期六，休息' (Besok hari Sabtu, libur istirahat)."
                ),
                StoryQuestion(
                    "q_wtdt_2",
                    "B周六上午和下午各想做什么？(Apa rencana B di hari Sabtu pagi dan sore?)",
                    listOf(
                        "上午在家睡觉，下午去书店买书 (Pagi tidur di rumah, sore ke toko buku membeli buku)",
                        "上午去买东西，下午去运动 (Pagi belanja, sore berolahraga)",
                        "上午看电影，下午做饭 (Pagi nonton film, sore memasak)",
                        "全天在学校上课 (Seharian belajar di sekolah)"
                    ),
                    0,
                    "B menjelaskan rencananya: '明天上午我想在家睡觉，下午我想去书店买书'."
                ),
                StoryQuestion(
                    "q_wtdt_3",
                    "A打算去买什么东西？(Apa saja barang yang ingin dibeli A?)",
                    listOf(
                        "衣服和鞋子 (Baju dan sepatu)",
                        "电脑和手机 (Komputer dan HP)",
                        "一个杯子、一盒牛奶和一些水果 (Sebuah cangkir, sekotak susu, dan buah-buahan)",
                        "两本中文书 (Dua buah buku Mandarin)"
                    ),
                    2,
                    "A merinci daftar belanjanya: '我想买一个杯子，一盒牛奶，还有一些水果' (termasuk pisang dan apel)."
                ),
                StoryQuestion(
                    "q_wtdt_4",
                    "明天下午五点他们打算做什么？(Apa rencana mereka besok jam 5 sore?)",
                    listOf(
                        "去饭店吃广东菜 (Pergi ke restoran makan masakan Kanton)",
                        "在B的家里一起自己做饭吃 (Di rumah B bersama-sama memasak sendiri)",
                        "一起去书店选书 (Bersama-sama ke toko buku memilih buku)",
                        "去公园散步 (Jalan-jalan di taman kota)"
                    ),
                    1,
                    "B mengundang: '你五点来我家吧... 明天我们自己做 (besok kita masak makan sendiri di rumahku)' dan disetujui A."
                )
            )
        ),

        // Cerita Mandarin Bean 9: Shopping (买东西)
        Story(
            id = "story_shopping",
            titleHanzi = "买东西",
            titlePinyin = "Mǎi Dōngxi",
            titleTranslation = "Shopping (Berbelanja)",
            level = "HSK 1",
            category = "Belanja & Transaksi",
            description = "Percakapan praktis di toko saat membeli minuman pelepas dahaga dan roti, dilengkapi penyebutan harga serta pembayaran kasir.",
            coverEmoji = "🛒",
            coverImageRes = R.drawable.cover_story_shopping,
            estimatedReadMinutes = 2,
            sentences = listOf(
                Sentence(
                    "s_shop_1",
                    "先生，你想买什么？",
                    "Xiānsheng, nǐ xiǎng mǎi shénme?",
                    "A: Tuan, Anda ingin membeli apa?",
                    listOf(
                        WordToken("先生", "xiānsheng", "Tuan / Bapak", "Panggilan sopan untuk pelanggan pria"),
                        WordToken("你想买", "nǐ xiǎng mǎi", "Anda ingin membeli", "Pertanyaan ramah pramuniaga"),
                        WordToken("什么", "shénme", "Apa", "Kata tanya barang yang dicari")
                    )
                ),
                Sentence(
                    "s_shop_2",
                    "我很渴，有喝的东西吗？",
                    "Wǒ hěn kě, yǒu hē de dōngxi ma?",
                    "B: Saya sangat haus, apakah ada minuman?",
                    listOf(
                        WordToken("我很渴", "wǒ hěn kě", "Saya sangat haus", "Menyatakan kondisi haus"),
                        WordToken("有", "yǒu", "Ada", "Kata kerja keberadaan"),
                        WordToken("喝的东西", "hē de dōngxi", "Minuman / sesuatu untuk diminum", "Frasa nomina ragam minuman"),
                        WordToken("吗", "ma", "Apakah", "Partikel tanya ya/tidak")
                    )
                ),
                Sentence(
                    "s_shop_3",
                    "有。我们有水、茶、牛奶、咖啡、啤酒，你想喝什么？",
                    "Yǒu. Wǒmen yǒu shuǐ, chá, niúnǎi, kāfēi, píjiǔ, nǐ xiǎng hē shénme?",
                    "A: Ada. Kami ada air, teh, susu, kopi, bir, Anda ingin minum apa?",
                    listOf(
                        WordToken("有", "yǒu", "Ada", "Konfirmasi ketersediaan barang"),
                        WordToken("我们有", "wǒmen yǒu", "Kami menyediakan", "Daftar produk yang dijual"),
                        WordToken("水", "shuǐ", "Air", "Air mineral"),
                        WordToken("茶", "chá", "Teh", "Minuman teh"),
                        WordToken("牛奶", "niúnǎi", "Susu", "Susu sapi"),
                        WordToken("咖啡", "kāfēi", "Kopi", "Minuman kopi"),
                        WordToken("啤酒", "píjiǔ", "Bir", "Minuman bir"),
                        WordToken("你想喝什么", "nǐ xiǎng hē shénme", "Anda ingin minum apa?", "Menanyakan pilihan minuman")
                    )
                ),
                Sentence(
                    "s_shop_4",
                    "我要一瓶啤酒。",
                    "Wǒ yào yī píng píjiǔ.",
                    "B: Saya mau sebotol bir.",
                    listOf(
                        WordToken("我要", "wǒ yào", "Saya mau / pesan", "Pernyataan pilihan pesanan"),
                        WordToken("一瓶啤酒", "yī píng píjiǔ", "Sebotol bir", "Bilangan + kata penggolong botol + bir")
                    )
                ),
                Sentence(
                    "s_shop_5",
                    "好的，还要什么吗？",
                    "Hǎo de, hái yào shénme ma?",
                    "A: Baik, apakah masih mau yang lain?",
                    listOf(
                        WordToken("好的", "hǎo de", "Baik / siap", "Konfirmasi penerimaan pesanan"),
                        WordToken("还要", "hái yào", "Masih perlu / ada lagi", "Menanyakan pesanan tambahan"),
                        WordToken("什么吗", "shénme ma", "Apa lagi?", "Pertanyaan lanjutan ramah")
                    )
                ),
                Sentence(
                    "s_shop_6",
                    "我也买些吃的东西吧。",
                    "Wǒ yě mǎi xiē chī de dōngxi ba.",
                    "B: Saya juga beli beberapa makanan deh.",
                    listOf(
                        WordToken("我也买", "wǒ yě mǎi", "Saya juga beli", "Keinginan menambah belanjaan"),
                        WordToken("些", "xiē", "Beberapa", "Kuantitas jamak tak tentu"),
                        WordToken("吃的东西", "chī de dōngxi", "Makanan / sesuatu untuk dimakan", "Frasa nomina panganan"),
                        WordToken("吧", "ba", "Deh", "Partikel keputusan santai")
                    )
                ),
                Sentence(
                    "s_shop_7",
                    "没问题。我们有米饭、面条，也有面包，你想要哪个？",
                    "Méi wèntí. Wǒmen yǒu mǐfàn, miàntiáo, yě yǒu miànbāo, nǐ xiǎng yào něi gè?",
                    "A: Tidak masalah. Kami ada nasi, mi, dan juga roti, Anda mau yang mana?",
                    listOf(
                        WordToken("没问题", "méi wèntí", "Tidak masalah", "Kesediaan melayani"),
                        WordToken("我们有", "wǒmen yǒu", "Kami ada", "Daftar stok makanan"),
                        WordToken("米饭", "mǐfàn", "Nasi", "Nasi putih matang"),
                        WordToken("面条", "miàntiáo", "Mi", "Olahan mi"),
                        WordToken("也有", "yě yǒu", "Juga ada", "Varian tambahan"),
                        WordToken("面包", "miànbāo", "Roti", "Roti gandum / tawar"),
                        WordToken("你想要哪个", "nǐ xiǎng yào něi gè", "Anda mau yang mana?", "Menanyakan opsi pilihan produk")
                    )
                ),
                Sentence(
                    "s_shop_8",
                    "一个面包。一共多少钱？",
                    "Yī gè miànbāo. Yīgòng duōshao qián?",
                    "B: Satu buah roti. Berapa total semuanya?",
                    listOf(
                        WordToken("一个面包", "yī gè miànbāo", "Satu buah roti", "Bilangan + penggolong + roti"),
                        WordToken("一共", "yīgòng", "Total / secara keseluruhan", "Jumlah total belanjaan"),
                        WordToken("多少钱", "duōshao qián", "Berapa harganya / uangnya?", "Frasa baku menanyakan total biaya")
                    )
                ),
                Sentence(
                    "s_shop_9",
                    "啤酒三块五，面包十块，一共十三块五。",
                    "Píjiǔ sān kuài wǔ, miànbāo shí kuài, yīgòng shísān kuài wǔ.",
                    "A: Bir 3,5 kuai, roti 10 kuai, totalnya 13,5 kuai.",
                    listOf(
                        WordToken("啤酒", "píjiǔ", "Bir", "Item minuman"),
                        WordToken("三块五", "sān kuài wǔ", "3,5 kuai", "3.5 yuan"),
                        WordToken("面包", "miànbāo", "Roti", "Item makanan"),
                        WordToken("十块", "shí kuài", "10 kuai", "10 yuan"),
                        WordToken("一共", "yīgòng", "Total", "Jumlah total"),
                        WordToken("十三块五", "shísān kuài wǔ", "13,5 kuai", "13.5 yuan")
                    )
                ),
                Sentence(
                    "s_shop_10",
                    "好的，给你钱。",
                    "Hǎo de, gěi nǐ qián.",
                    "B: Baik, ini uangnya.",
                    listOf(
                        WordToken("好的", "hǎo de", "Baik", "Persetujuan transaksi"),
                        WordToken("给你钱", "gěi nǐ qián", "Ini uangnya / serahkan uang", "Tindakan penyerahan alat pembayaran")
                    )
                ),
                Sentence(
                    "s_shop_11",
                    "这是你买的东西，再见。",
                    "Zhè shì nǐ mǎi de dōngxi, zàijiàn.",
                    "A: Ini barang belanjaan Anda, sampai jumpa.",
                    listOf(
                        WordToken("这是", "zhè shì", "Ini adalah", "Penyerahan bungkusan belanja"),
                        WordToken("你买的东西", "nǐ mǎi de dōngxi", "Barang belanjaan Anda", "Barang yang telah dibayar"),
                        WordToken("再见", "zàijiàn", "Sampai jumpa", "Salam penutup kasir")
                    )
                ),
                Sentence(
                    "s_shop_12",
                    "再见。",
                    "Zàijiàn.",
                    "B: Sampai jumpa.",
                    listOf(
                        WordToken("再见", "zàijiàn", "Sampai jumpa", "Salam perpisahan pembeli")
                    )
                )
            ),
            questions = listOf(
                StoryQuestion(
                    "q_shop_1",
                    "B一开始为什么向店员询问？(Mengapa B awalnya bertanya kepada kasir?)",
                    listOf(
                        "因为他很饿想要米饭 (Karena lapar ingin makan nasi)",
                        "因为他很渴，想买喝的东西 (Karena sangat haus dan mencari minuman)",
                        "因为要买书 (Karena ingin membeli buku)",
                        "因为要换钱 (Karena ingin menukar uang)"
                    ),
                    1,
                    "B menyampaikan kondisinya: '我很渴，有喝的东西吗？' (Saya sangat haus, apakah ada minuman?)."
                ),
                StoryQuestion(
                    "q_shop_2",
                    "在店员列出的饮料中，B最终选了哪一样？(Di antara daftar minuman yang disebutkan, apa yang dipilih B?)",
                    listOf(
                        "牛奶 (Susu)",
                        "咖啡 (Kopi)",
                        "一瓶啤酒 (Sebotol bir)",
                        "茶 (Teh)"
                    ),
                    2,
                    "B langsung memesan minuman: '我要一瓶啤酒' (Saya mau sebotol bir)."
                ),
                StoryQuestion(
                    "q_shop_3",
                    "B selain membeli minuman, juga membeli makanan apa? (Selain minuman, makanan apa yang dibeli B?)",
                    listOf(
                        "米饭 (Nasi)",
                        "面条 (Mi)",
                        "一个面包 (Satu buah roti)",
                        "一些水果 (Beberapa buah)"
                    ),
                    2,
                    "Dari pilihan nasi, mi, dan roti yang ditawarkan toko, B memutuskan membeli '一个面包' (satu buah roti)."
                ),
                StoryQuestion(
                    "q_shop_4",
                    "B一共需要支付多少钱？(Berapa total uang yang harus dibayar B?)",
                    listOf(
                        "十块钱 (10 kuai)",
                        "十三块五 (13,5 kuai)",
                        "三块五 (3,5 kuai)",
                        "十五块 (15 kuai)"
                    ),
                    1,
                    "Penjual merinci biaya: bir 3.5 kuai + roti 10 kuai = '一共十三块五' (total 13.5 kuai)."
                )
            )
        ),

        // Cerita Mandarin Bean 10: How is it going recently? (最近怎么样)
        Story(
            id = "story_how_is_it_going_recently",
            titleHanzi = "最近怎么样",
            titlePinyin = "Zuìjìn Zěnmeyàng",
            titleTranslation = "How is it going recently? (Bagaimana Akhir-akhir Ini?)",
            level = "HSK 1",
            category = "Sekolah & Keluarga",
            description = "Percakapan penuh perhatian antara Ibu Lele dan Guru Li tentang perilaku anak di sekolah, kebiasaan nonton TV di rumah, dan kerja sama pendidik-orang tua.",
            coverEmoji = "🏫",
            coverImageRes = R.drawable.cover_story_how_is_it_going_recently,
            estimatedReadMinutes = 2,
            sentences = listOf(
                Sentence(
                    "s_hiigr_1",
                    "李老师，好久不见！",
                    "Lǐ lǎoshī, hǎojiǔ bù jiàn!",
                    "A: Guru Li, lama tidak bertemu!",
                    listOf(
                        WordToken("李老师", "Lǐ lǎoshī", "Guru Li", "Panggilan hormat guru bermarga Li"),
                        WordToken("好久不见", "hǎojiǔ bù jiàn", "Lama tidak bertemu", "Ungkapan salam saat sudah lama tak berjumpa")
                    )
                ),
                Sentence(
                    "s_hiigr_2",
                    "乐乐妈妈，好久不见！",
                    "Lèlè māma, hǎojiǔ bù jiàn!",
                    "B: Ibu Lele, lama tidak bertemu!",
                    listOf(
                        WordToken("乐乐妈妈", "Lèlè māma", "Ibu Lele", "Panggilan untuk ibu dari murid bernama Lele"),
                        WordToken("好久不见", "hǎojiǔ bù jiàn", "Lama tidak bertemu", "Sapaan ramah balasan")
                    )
                ),
                Sentence(
                    "s_hiigr_3",
                    "乐乐最近在学校怎么样？",
                    "Lèlè zuìjìn zài xuéxiào zěnmeyàng?",
                    "A: Bagaimana kabar/perkembangan Lele di sekolah akhir-akhir ini?",
                    listOf(
                        WordToken("乐乐", "Lèlè", "Lele", "Nama anak murid"),
                        WordToken("最近", "zuìjìn", "Akhir-akhir ini / belakangan ini", "Keterangan waktu baru-baru ini"),
                        WordToken("在学校", "zài xuéxiào", "Di sekolah", "Keterangan tempat bersekolah"),
                        WordToken("怎么样", "zěnmeyàng", "Bagaimana?", "Menanyakan kondisi atau performa")
                    )
                ),
                Sentence(
                    "s_hiigr_4",
                    "他喜欢帮助大家，同学们也都很喜欢他，但是最近学习马马虎虎。",
                    "Tā xǐhuan bāngzhù dàjiā, tóngxuémen yě dōu hěn xǐhuan tā, dànshì zuìjìn xuéxí mǎmahūhū.",
                    "B: Dia suka membantu semua orang, teman-teman sekelas juga sangat menyukainya, tetapi belakangan ini belajarnya biasa-biasa saja / agak teledor.",
                    listOf(
                        WordToken("他喜欢", "tā xǐhuan", "Dia suka", "Karakter gemar membantu"),
                        WordToken("帮助大家", "bāngzhù dàjiā", "Membantu semua orang", "Sifat peduli dan suka menolong"),
                        WordToken("同学们", "tóngxuémen", "Teman-teman sekelas", "Sesama pelajar"),
                        WordToken("也都很喜欢他", "yě dōu hěn xǐhuan tā", "Juga semua sangat menyukainya", "Disukai banyak teman"),
                        WordToken("但是", "dànshì", "Tetapi / namun", "Konjungsi pertentangan"),
                        WordToken("最近学习", "zuìjìn xuéxí", "Belajarnya akhir-akhir ini", "Prestasi belajar terkini"),
                        WordToken("马马虎虎", "mǎmahūhū", "Biasa-biasa saja / asal-asalan", "Idiom chengyu untuk hal yang standar / kurang teliti")
                    )
                ),
                Sentence(
                    "s_hiigr_5",
                    "他学习不努力，每天回家就喜欢看电视。",
                    "Tā xuéxí bù nǔlì, měi tiān huí jiā jiù xǐhuan kàn diànshì.",
                    "A: Dia tidak rajin belajar, setiap hari begitu pulang ke rumah langsung suka menonton TV.",
                    listOf(
                        WordToken("他学习", "tā xuéxí", "Dia belajar", "Aktivitas belajar anak"),
                        WordToken("不努力", "bù nǔlì", "Kurang giat / tidak rajin", "Kurang kerja keras dan fokus"),
                        WordToken("每天回家", "měi tiān huí jiā", "Setiap hari pulang ke rumah", "Rutinitas harian sepulang sekolah"),
                        WordToken("就喜欢", "jiù xǐhuan", "Langsung suka", "Kecenderungan kegemaran"),
                        WordToken("看电视", "kàn diànshì", "Menonton TV / televisi", "Menonton siaran televisi")
                    )
                ),
                Sentence(
                    "s_hiigr_6",
                    "看太多电视不好。",
                    "Kàn tài duō diànshì bù hǎo.",
                    "B: Menonton terlalu banyak TV itu tidak baik.",
                    listOf(
                        WordToken("看太多", "kàn tài duō", "Menonton terlalu banyak", "Frekuensi dan durasi berlebihan"),
                        WordToken("电视", "diànshì", "Televisi", "Media tayangan TV"),
                        WordToken("不好", "bù hǎo", "Tidak baik", "Dampak negatif bagi perkembangan anak")
                    )
                ),
                Sentence(
                    "s_hiigr_7",
                    "是呀。我说了，他不听。",
                    "Shì ya. Wǒ shuō le, tā bù tīng.",
                    "A: Betul sekali. Saya sudah beri tahu, tapi dia tidak mau mendengar.",
                    listOf(
                        WordToken("是呀", "shì ya", "Betul sekali / iya nih", "Penegasan persetujuan keluhan"),
                        WordToken("我说了", "wǒ shuō le", "Saya sudah menasihati", "Usaha orang tua mengingatkan"),
                        WordToken("他不听", "tā bù tīng", "Dia tidak mau mendengar", "Anak bersikap keras kepala / abai")
                    )
                ),
                Sentence(
                    "s_hiigr_8",
                    "明天他来学校，我也跟他说说这个事。",
                    "Míngtiān tā lái xuéxiào, wǒ yě gēn tā shuō shuo zhè gè shì.",
                    "B: Besok saat dia datang ke sekolah, saya juga akan membicarakan hal ini dengannya.",
                    listOf(
                        WordToken("明天", "míngtiān", "Besok", "Keterangan waktu esok hari"),
                        WordToken("他来学校", "tā lái xuéxiào", "Dia datang ke sekolah", "Kehadiran murid di sekolah"),
                        WordToken("我也跟他说说", "wǒ yě gēn tā shuō shuo", "Saya juga akan berbicara dengannya", "Bantuan guru untuk membimbing murid"),
                        WordToken("这个事", "zhè gè shì", "Masalah ini / hal ini", "Topik tentang belajar dan kebiasaan TV")
                    )
                ),
                Sentence(
                    "s_hiigr_9",
                    "太好了！谢谢李老师。",
                    "Tài hǎo le! Xièxie Lǐ lǎoshī.",
                    "A: Bagus sekali! Terima kasih Guru Li.",
                    listOf(
                        WordToken("太好了", "tài hǎo le", "Bagus sekali! / syukurlah", "Ekspresi kelegaan dan kepuasan"),
                        WordToken("谢谢", "xièxie", "Terima kasih", "Ungkapan terima kasih mendalam"),
                        WordToken("李老师", "Lǐ lǎoshī", "Guru Li", "Panggilan hormat guru")
                    )
                )
            ),
            questions = listOf(
                StoryQuestion(
                    "q_hiigr_1",
                    "故事中对话的两个人分别是谁？(Siapa kedua orang yang saling berbicara dalam cerita?)",
                    listOf(
                        "乐乐和他的同桌 (Lele dan teman sebangkunya)",
                        "乐乐的妈妈和李老师 (Ibu Lele dan Guru Li)",
                        "两位小学老师 (Dua orang guru SD)",
                        "医生和病人 (Dokter dan pasien)"
                    ),
                    1,
                    "Percakapan terjadi antara orang tua murid ('乐乐妈妈') dan wali kelas/guru di sekolah ('李老师')."
                ),
                StoryQuestion(
                    "q_hiigr_2",
                    "李老师觉得乐乐在学校表现如何？(Bagaimana sikap Lele di sekolah menurut Guru Li?)",
                    listOf(
                        "不愿意和同学说话 (Enggan berbicara dengan teman)",
                        "喜欢帮助大家，很受同学欢迎 (Suka membantu semua orang, sangat disukai teman-teman)",
                        "经常迟到 (Sering terlambat)",
                        "上课总睡觉 (Selalu tidur saat jam pelajaran)"
                    ),
                    1,
                    "Guru Li memuji karakter sosialnya: '他喜欢帮助大家，同学们也都很喜欢他' (Dia suka membantu semua orang dan teman-teman menyukainya)."
                ),
                StoryQuestion(
                    "q_hiigr_3",
                    "乐乐的妈妈为什么感到苦恼？(Mengapa ibu Lele merasa risau?)",
                    listOf(
                        "乐乐不肯去学校 (Lele tidak mau ke sekolah)",
                        "乐乐生病了 (Lele sedang sakit)",
                        "乐乐学习不努力，每天回家只喜欢看电视 (Lele kurang tekun belajar, pulang ke rumah langsung suka nonton TV)",
                        "乐乐把书本弄丢了 (Lele menghilangkan buku pelajarannya)"
                    ),
                    2,
                    "Sang ibu mengeluhkan: '他学习不努力，每天回家就喜欢看电视。我说了，他不听' (Belajarnya kurang giat dan tidak mendengarkan omongan ibunya)."
                ),
                StoryQuestion(
                    "q_hiigr_4",
                    "李老师打算明天怎样帮助乐乐妈妈？(Bagaimana Guru Li berencana membantu ibu Lele besok?)",
                    listOf(
                        "给乐乐布置大量作业 (Memberikan banyak PR)",
                        "明天在学校找乐乐谈谈这件事 (Membicarakan dan menasihati Lele di sekolah tentang hal ini)",
                        "给乐乐换一个座位 (Memindahkan tempat duduk Lele)",
                        "去乐乐家里家访 (Melakukan kunjungan ke rumah)"
                    ),
                    1,
                    "Guru Li menawarkan bantuan bijak: '明天他来学校，我也跟他说说这个事' (Besok dia datang ke sekolah, saya juga akan ikut mengajaknya bicara)."
                )
            )
        ),

        // Cerita Mandarin Bean 11: Dad and mom are not at home (爸妈不在家)
        Story(
            id = "story_parents_not_at_home",
            titleHanzi = "爸妈不在家",
            titlePinyin = "Bàmā Bù Zài Jiā",
            titleTranslation = "Dad and mom are not at home (Ayah dan Ibu Tidak Ada di Rumah)",
            level = "HSK 1",
            category = "Keluarga & Rumah",
            description = "Anekdot jenaka tentang seorang kakak yang menjaga adik-adiknya di rumah saat orang tua pergi, namun bingung menghadapi selera makanan yang berbeda.",
            coverEmoji = "🏠",
            coverImageRes = R.drawable.cover_story_parents_not_at_home,
            estimatedReadMinutes = 2,
            sentences = listOf(
                Sentence(
                    "s_pnah_1",
                    "今天爸爸妈妈不在家，我和弟弟妹妹在家。",
                    "Jīntiān bàba māma bù zài jiā, wǒ hé dìdi mèimei zài jiā.",
                    "Hari ini ayah dan ibu tidak ada di rumah, saya bersama adik laki-laki dan adik perempuan di rumah.",
                    listOf(
                        WordToken("今天", "jīntiān", "Hari ini", "Keterangan waktu saat ini"),
                        WordToken("爸爸妈妈", "bàba māma", "Ayah dan ibu", "Panggilan orang tua"),
                        WordToken("不在家", "bù zài jiā", "Tidak ada di rumah", "Negasi keberadaan di kediaman"),
                        WordToken("我和", "wǒ hé", "Saya dan", "Pronomina + kata hubung"),
                        WordToken("弟弟妹妹", "dìdi mèimei", "Adik laki-laki dan adik perempuan", "Saudara-saudari yang lebih muda"),
                        WordToken("在家", "zài jiā", "Di rumah", "Keterangan tempat tinggal")
                    )
                ),
                Sentence(
                    "s_pnah_2",
                    "妹妹想喝可乐，吃米饭；弟弟想喝茶，吃面条；我想喝咖啡，吃面包。",
                    "Mèimei xiǎng hē kělè, chī mǐfàn; dìdi xiǎng hē chá, chī miàntiáo; wǒ xiǎng hē kāfēi, chī miànbāo.",
                    "Adik perempuan ingin minum kola dan makan nasi; adik laki-laki ingin minum teh dan makan mi; saya ingin minum kopi dan makan roti.",
                    listOf(
                        WordToken("妹妹想", "mèimei xiǎng", "Adik perempuan ingin", "Keinginan adik perempuan"),
                        WordToken("喝可乐", "hē kělè", "Minum kola", "Minuman soda kola"),
                        WordToken("吃米饭", "chī mǐfàn", "Makan nasi", "Makanan pokok nasi putih"),
                        WordToken("弟弟想", "dìdi xiǎng", "Adik laki-laki ingin", "Keinginan adik laki-laki"),
                        WordToken("喝茶", "hē chá", "Minum teh", "Minuman teh hangat"),
                        WordToken("吃面条", "chī miàntiáo", "Makan mi", "Olahan mi"),
                        WordToken("我想", "wǒ xiǎng", "Saya ingin", "Keinginan penutur/kakak"),
                        WordToken("喝咖啡", "hē kāfēi", "Minum kopi", "Minuman kopi"),
                        WordToken("吃面包", "chī miànbāo", "Makan roti", "Panganan roti gandum")
                    )
                ),
                Sentence(
                    "s_pnah_3",
                    "但是我不会做米饭和面条，他们不喜欢面包，这是个问题。",
                    "Dànshì wǒ bù huì zuò mǐfàn hé miàntiáo, tāmen bù xǐhuan miànbāo, zhè shì gè wèntí.",
                    "Tetapi saya tidak bisa memasak nasi dan mi, dan mereka tidak suka roti, ini adalah sebuah masalah.",
                    listOf(
                        WordToken("但是", "dànshì", "Tetapi / namun", "Konjungsi pertentangan"),
                        WordToken("我不会做", "wǒ bù huì zuò", "Saya tidak bisa membuat / masak", "Ketidakmampuan memasak hidangan panas"),
                        WordToken("米饭和面条", "mǐfàn hé miàntiáo", "Nasi dan mi", "Makanan yang diinginkan adik-adik"),
                        WordToken("他们", "tāmen", "Mereka", "Kata ganti orang ketiga jamak"),
                        WordToken("不喜欢面包", "bù xǐhuan miànbāo", "Tidak suka roti", "Ketidaksukaan makanan"),
                        WordToken("这是个问题", "zhè shì gè wèntí", "Ini adalah sebuah masalah", "Dilema situasi yang dihadapi")
                    )
                ),
                Sentence(
                    "s_pnah_4",
                    "爸爸妈妈什么时候回家呢？",
                    "Bàba māma shénme shíhou huí jiā ne?",
                    "Kapan ya ayah dan ibu pulang ke rumah?",
                    listOf(
                        WordToken("爸爸妈妈", "bàba māma", "Ayah dan ibu", "Orang tua yang dinanti"),
                        WordToken("什么时候", "shénme shíhou", "Kapan / jam berapa", "Kata tanya waktu kejadian"),
                        WordToken("回家呢", "huí jiā ne", "Pulang ke rumah ya?", "Pertanyaan kepulangan dengan partikel ne yang penuh harap")
                    )
                )
            ),
            questions = listOf(
                StoryQuestion(
                    "q_pnah_1",
                    "今天家里都有谁在？(Hari ini siapa saja yang ada di rumah?)",
                    listOf(
                        "爸爸、妈妈和我 (Ayah, ibu, dan saya)",
                        "我和弟弟妹妹 (Saya, adik laki-laki, dan adik perempuan)",
                        "只有爷爷奶奶 (Hanya kakek dan nenek)",
                        "老师和同学们 (Guru dan teman-teman)"
                    ),
                    1,
                    "Di awal cerita disebutkan: '今天爸爸妈妈不在家，我和弟弟妹妹在家'."
                ),
                StoryQuestion(
                    "q_pnah_2",
                    "妹妹想要吃什么和喝什么？(Apa yang ingin dimakan dan diminum oleh adik perempuan?)",
                    listOf(
                        "想喝茶，吃面条 (Ingin minum teh dan makan mi)",
                        "想喝咖啡，吃面包 (Ingin minum kopi dan makan roti)",
                        "想喝可乐，吃米饭 (Ingin minum kola dan makan nasi)",
                        "想吃苹果，喝牛奶 (Ingin makan apel dan minum susu)"
                    ),
                    2,
                    "Teks menyatakan: '妹妹想喝可乐，吃米饭' (Adik perempuan ingin minum kola dan makan nasi)."
                ),
                StoryQuestion(
                    "q_pnah_3",
                    "作者遇到了什么难题？(Masalah apa yang dihadapi oleh penulis/sang kakak?)",
                    listOf(
                        "家里没有水喝 (Tidak ada air minum di rumah)",
                        "不会做米饭和面条，而弟弟妹妹不喜欢吃面包 (Tidak bisa masak nasi & mi, sedangkan adik-adik tidak suka roti)",
                        "找不到电视遥控器 (Tidak menemukan remote TV)",
                        "弟弟妹妹不肯写作业 (Adik-adik tidak mau mengerjakan PR)"
                    ),
                    1,
                    "Sang kakak bingung: '但是我不会做米饭和面条，他们不喜欢面包，这是个问题'."
                ),
                StoryQuestion(
                    "q_pnah_4",
                    "故事结尾，作者最盼望的事情是什么？(Di akhir cerita, apa yang paling dinantikan oleh sang kakak?)",
                    listOf(
                        "盼望爸爸妈妈快点回家 (Berharap ayah dan ibu segera pulang ke rumah)",
                        "盼望去商店买零食 (Berharap pergi belanja camilan)",
                        "盼望明天去学校 (Berharap besok pergi ke sekolah)",
                        "盼望自己学会做饭 (Berharap bisa belajar masak sendiri)"
                    ),
                    0,
                    "Karena tidak bisa memasak untuk adik-adiknya, ia bertanya-tanya penuh harap: '爸爸妈妈什么时候回家呢？' (Kapan ya ayah dan ibu pulang?)."
                )
            )
        ),

        // Cerita Mandarin Bean 12: Never Seen (没见过)
        Story(
            id = "story_never_seen",
            titleHanzi = "没见过",
            titlePinyin = "Méi Jiànguo",
            titleTranslation = "Never Seen (Belum Pernah Melihat)",
            level = "HSK 1",
            category = "Humor & Keluarga",
            description = "Anekdot cerdas dan jenaka tentang seorang anak berusia 7 tahun yang tangannya kotor dan memberikan jawaban tak terduga kepada ibunya.",
            coverEmoji = "👧",
            coverImageRes = R.drawable.cover_story_never_seen,
            estimatedReadMinutes = 2,
            sentences = listOf(
                Sentence(
                    "s_neverseen_1",
                    "7岁的女儿回家后，妈妈看见她的手很脏，就说：“看你的手，多脏呀！你什么时候看到过我的手这么脏了？”",
                    "7 suì de nǚ'ér huí jiā hòu, māma kànjiàn tā de shǒu hěn zāng, jiù shuō: “Kàn nǐ de shǒu, duō zāng ya! Nǐ shénme shíhou kàn dào guo wǒ de shǒu zhème zāng le?”",
                    "Setelah anak perempuan berusia 7 tahun pulang ke rumah, ibu melihat tangannya sangat kotor, lalu berkata: “Lihat tanganmu, kotor sekali ya! Kapan kamu pernah melihat tangan ibu sekotor ini?”",
                    listOf(
                        WordToken("7岁的", "7 suì de", "Berusia 7 tahun", "Keterangan usia anak"),
                        WordToken("女儿", "nǚ'ér", "Anak perempuan", "Putri kandung"),
                        WordToken("回家后", "huí jiā hòu", "Setelah pulang ke rumah", "Kembali ke kediaman + setelah"),
                        WordToken("妈妈", "māma", "Ibu", "Panggilan orang tua perempuan"),
                        WordToken("看见", "kànjiàn", "Melihat", "Menangkap dengan indera penglihatan"),
                        WordToken("她的", "tā de", "Miliknya / -nya", "Pronomina kepemilikan orang ketiga perempuan"),
                        WordToken("手", "shǒu", "Tangan", "Bagian tubuh tangan"),
                        WordToken("很脏", "hěn zāng", "Sangat kotor", "Kondisi terkena noda atau tanah"),
                        WordToken("就说", "jiù shuō", "Lalu berkata", "Konjungsi kelanjutan tutur"),
                        WordToken("看", "kàn", "Lihatlah", "Seruan untuk memperhatikan"),
                        WordToken("你的", "nǐ de", "Milikmu", "Kepemilikan orang kedua"),
                        WordToken("手", "shǒu", "Tangan", "Bagian tubuh tangan"),
                        WordToken("多脏呀", "duō zāng ya", "Kotor sekali ya!", "Seruan penegas derajat kotor"),
                        WordToken("你", "nǐ", "Kamu", "Kata ganti orang kedua"),
                        WordToken("什么时候", "shénme shíhou", "Kapan", "Kata tanya waktu kejadian"),
                        WordToken("看到过", "kàn dào guo", "Pernah melihat", "Melihat + aspek pengalaman pernah"),
                        WordToken("我的", "wǒ de", "Milik saya", "Kepemilikan penutur"),
                        WordToken("手", "shǒu", "Tangan", "Bagian tubuh tangan"),
                        WordToken("这么脏了", "zhème zāng le", "Sekotor ini", "Tingkat kotor yang ekstrem")
                    )
                ),
                Sentence(
                    "s_neverseen_2",
                    "女儿回答：“没有，妈妈。因为我没有看到过你7岁的样子。”",
                    "Nǚ'ér huídá: “Méiyǒu, māma. Yīnwèi wǒ méiyǒu kàn dào guo nǐ 7 suì de yàngzi.”",
                    "Anak perempuan menjawab: “Belum pernah, Ibu. Karena aku belum pernah melihat penampilan Ibu saat berumur 7 tahun.”",
                    listOf(
                        WordToken("女儿", "nǚ'ér", "Anak perempuan", "Putri kandung"),
                        WordToken("回答", "huídá", "Menjawab", "Memberikan jawaban atau sanggahan"),
                        WordToken("没有", "méiyǒu", "Belum pernah / tidak", "Negasi pengalaman"),
                        WordToken("妈妈", "māma", "Ibu", "Panggilan hormat sayang kepada ibu"),
                        WordToken("因为", "yīnwèi", "Karena", "Konjungsi alasan atau sebab"),
                        WordToken("我", "wǒ", "Saya / aku", "Kata ganti orang pertama"),
                        WordToken("没有", "méiyǒu", "Tidak pernah", "Bentuk negasi"),
                        WordToken("看到过", "kàn dào guo", "Pernah melihat", "Pengalaman melihat"),
                        WordToken("你", "nǐ", "Kamu / Ibu", "Panggilan untuk lawan bicara"),
                        WordToken("7岁的", "7 suì de", "Berusia 7 tahun", "Kondisi umur 7 tahun"),
                        WordToken("样子", "yàngzi", "Penampilan / rupa", "Bentuk atau keadaan rupa seseorang")
                    )
                )
            ),
            questions = listOf(
                StoryQuestion(
                    "q_neverseen_1",
                    "女儿今年多大？(Berapa umur anak perempuan itu?)",
                    listOf(
                        "5岁 (5 tahun)",
                        "7岁 (7 tahun)",
                        "9岁 (9 tahun)",
                        "10岁 (10 tahun)"
                    ),
                    1,
                    "Di kalimat pertama tertulis: '7岁的女儿回家后' (Anak perempuan berusia 7 tahun setelah pulang ke rumah)."
                ),
                StoryQuestion(
                    "q_neverseen_2",
                    "妈妈看见女儿的什么很脏？(Ibu melihat bagian tubuh anak perempuan yang mana yang sangat kotor?)",
                    listOf(
                        "衣服 (Pakaian)",
                        "手 (Tangan)",
                        "鞋子 (Sepatu)",
                        "脸 (Wajah)"
                    ),
                    1,
                    "Ibu melihat tangannya: '妈妈看见她的手很脏，就说：看你的手，多脏呀！'."
                ),
                StoryQuestion(
                    "q_neverseen_3",
                    "妈妈问了女儿什么问题？(Pertanyaan apa yang dilontarkan ibu?)",
                    listOf(
                        "作业写完了吗？ (Apakah sudah selesai mengerjakan PR?)",
                        "你什么时候看到过我的手这么脏了？ (Kapan kamu pernah melihat tangan ibu sekotor ini?)",
                        "今天在学校学了什么？ (Hari ini di sekolah belajar apa?)",
                        "晚饭想吃什么？ (Makan malam ingin makan apa?)"
                    ),
                    1,
                    "Ibu menegur: '你什么时候看到过我的手这么脏了？' (Kapan kamu pernah melihat tangan ibu sekotor ini?)."
                ),
                StoryQuestion(
                    "q_neverseen_4",
                    "女儿是如何机智回答妈妈的？(Bagaimana anak perempuan itu menjawab ibunya secara cerdik?)",
                    listOf(
                        "说自己马上就去洗手 (Mengatakan akan segera cuci tangan)",
                        "说自己没看到过妈妈7岁时的样子 (Mengatakan belum pernah melihat rupa ibu waktu umur 7 tahun)",
                        "说是弟弟弄脏的 (Menyalahkan adiknya)",
                        "默不作声 (Hanya terdiam)"
                    ),
                    1,
                    "Anak tersebut dengan polos dan cerdas berdalih: '没有，妈妈。因为我没有看到过你7岁的样子。' (Belum pernah bu, karena aku belum pernah lihat penampilan ibu saat berusia 7 tahun!)."
                )
            )
        ),

        // Cerita Mandarin Bean 13: Ride in a Car (坐车)
        Story(
            id = "story_ride_in_a_car",
            titleHanzi = "坐车",
            titlePinyin = "Zuò Chē",
            titleTranslation = "Ride in a Car (Naik Kendaraan)",
            level = "HSK 1",
            category = "Humor & Transportasi",
            description = "Anekdot kocak tentang seorang anak cerdik yang lelah berjalan kaki dan membuat perjanjian jenaka dengan ayahnya tentang naik bus atau taksi.",
            coverEmoji = "🚌",
            coverImageRes = R.drawable.cover_story_ride_in_a_car,
            estimatedReadMinutes = 2,
            sentences = listOf(
                Sentence(
                    "s_ridecar_1",
                    "一天，爸爸带儿子去玩。回来的路上，儿子对爸爸说：“爸爸，我累了，我们坐车吧。”",
                    "Yī tiān, bàba dài érzi qù wán. Huí lái de lù shang, érzi duì bàba shuō: “Bàba, wǒ lèi le, wǒmen zuò chē ba.”",
                    "Suatu hari, ayah mengajak anak laki-lakinya pergi bermain. Di perjalanan pulang, anak itu berkata kepada ayahnya: “Ayah, aku lelah, ayo kita naik kendaraan.”",
                    listOf(
                        WordToken("一天", "yī tiān", "Suatu hari", "Keterangan waktu pada suatu hari"),
                        WordToken("爸爸", "bàba", "Ayah", "Orang tua laki-laki"),
                        WordToken("带", "dài", "Membawa / mengajak", "Kata kerja mendampingi pergi"),
                        WordToken("儿子", "érzi", "Anak laki-laki", "Putra kandung"),
                        WordToken("去玩", "qù wán", "Pergi bermain", "Aktivitas rekreasi bersenang-senang"),
                        WordToken("回来的", "huí lái de", "Saat kembali", "Arah pulang perjalanan"),
                        WordToken("路上", "lù shang", "Di perjalanan / di jalan", "Lokasi sepanjang jalan"),
                        WordToken("儿子", "érzi", "Anak laki-laki", "Putra kandung"),
                        WordToken("对", "duì", "Kepada", "Preposisi arah sasaran tutur"),
                        WordToken("爸爸", "bàba", "Ayah", "Panggilan orang tua laki-laki"),
                        WordToken("说", "shuō", "Berkata", "Kata kerja tutur"),
                        WordToken("爸爸", "bàba", "Ayah", "Panggilan sayang anak"),
                        WordToken("我", "wǒ", "Saya / aku", "Kata ganti orang pertama"),
                        WordToken("累了", "lèi le", "Lelah / capek", "Kondisi fisik letih setelah beraktivitas"),
                        WordToken("我们", "wǒmen", "Kita", "Kata ganti orang pertama jamak"),
                        WordToken("坐车", "zuò chē", "Naik kendaraan", "Menaiki moda transportasi darat"),
                        WordToken("吧", "ba", "Ayo / ya", "Partikel ajakan santai")
                    )
                ),
                Sentence(
                    "s_ridecar_2",
                    "“那要看你表现。”爸爸说。",
                    "“Nà yào kàn nǐ biǎoxiàn.” Bàba shuō.",
                    "“Itu tergantung bagaimana sikap dan kelakuanmu,” kata ayah.",
                    listOf(
                        WordToken("那要看", "nà yào kàn", "Itu tergantung", "Frasa penentu syarat/kondisi"),
                        WordToken("你", "nǐ", "Kamu", "Kata ganti orang kedua"),
                        WordToken("表现", "biǎoxiàn", "Kelakuan / sikap", "Sikap dan perilaku seseorang"),
                        WordToken("爸爸", "bàba", "Ayah", "Subjek ayah"),
                        WordToken("说", "shuō", "Berkata", "Kata kerja tutur")
                    )
                ),
                Sentence(
                    "s_ridecar_3",
                    "儿子说：“好的，如果我表现好，我们就坐公共汽车回去；如果我表现不好，我们就坐出租车回去。”",
                    "Érzi shuō: “Hǎo de, rúguǒ wǒ biǎoxiàn hǎo, wǒmen jiù zuò gōnggòng qìchē huí qù; rúguǒ wǒ biǎoxiàn bù hǎo, wǒmen jiù zuò chūzūchē huí qù.”",
                    "Anak itu berkata: “Baiklah, kalau sikapku baik, kita naik bus umum pulang; tapi kalau sikapku tidak baik, kita naik taksi pulang.”",
                    listOf(
                        WordToken("儿子", "érzi", "Anak laki-laki", "Subjek putra"),
                        WordToken("说", "shuō", "Berkata", "Kata kerja tutur"),
                        WordToken("好的", "hǎo de", "Baiklah", "Pernyataan sepakat cerdik"),
                        WordToken("如果", "rúguǒ", "Jika / kalau", "Konjungsi pengandaian"),
                        WordToken("我", "wǒ", "Saya / aku", "Kata ganti orang pertama"),
                        WordToken("表现", "biǎoxiàn", "Sikap / kelakuan", "Perilaku"),
                        WordToken("好", "hǎo", "Baik", "Kondisi positif"),
                        WordToken("我们", "wǒmen", "Kita", "Pronomina jamak"),
                        WordToken("就坐", "jiù zuò", "Maka naik", "Penegasan tindakan transportasi"),
                        WordToken("公共汽车", "gōnggòng qìchē", "Bus umum", "Transportasi bus kota"),
                        WordToken("回去", "huí qù", "Pulang", "Kembali ke rumah"),
                        WordToken("如果", "rúguǒ", "Jika / kalau", "Konjungsi pengandaian"),
                        WordToken("我", "wǒ", "Saya / aku", "Pronomina pertama"),
                        WordToken("表现", "biǎoxiàn", "Sikap / perilaku", "Perilaku"),
                        WordToken("不好", "bù hǎo", "Tidak baik / nakal", "Kondisi negatif"),
                        WordToken("我们", "wǒmen", "Kita", "Pronomina jamak"),
                        WordToken("就坐", "jiù zuò", "Maka naik", "Penegasan tindakan transportasi"),
                        WordToken("出租车", "chūzūchē", "Taksi", "Mobil sewa penumpang yang lebih nyaman"),
                        WordToken("回去", "huí qù", "Pulang", "Kembali ke kediaman")
                    )
                )
            ),
            questions = listOf(
                StoryQuestion(
                    "q_ridecar_1",
                    "在回来的路上，儿子对爸爸说了什么？(Di perjalanan pulang, apa yang dikatakan anak itu kepada ayahnya?)",
                    listOf(
                        "他肚子饿了想吃米饭 (Dia lapar ingin makan nasi)",
                        "他累了，想坐车回家 (Dia lelah dan ingin naik kendaraan pulang)",
                        "他还想继续玩 (Dia masih ingin terus bermain)",
                        "他想去买新衣服 (Dia ingin membeli baju baru)"
                    ),
                    1,
                    "Anak itu berkata: '爸爸，我累了，我们坐车吧。' (Ayah, aku lelah, ayo kita naik kendaraan)."
                ),
                StoryQuestion(
                    "q_ridecar_2",
                    "爸爸原本的意思是什么？(Apa maksud awal ayah saat berkata '那要看你表现'?)",
                    listOf(
                        "表现好才可以坐车 (Berkelakuan baik barulah boleh naik kendaraan pulang)",
                        "表现好可以买玩具 (Berkelakuan baik boleh membeli mainan)",
                        "完全不打算回家 (Sama sekali tidak berencana pulang)",
                        "必须马上走路回家 (Harus langsung berjalan kaki pulang)"
                    ),
                    0,
                    "Ayah bermaksud memberi syarat kedisiplinan: kalau bersikap baik baru boleh naik kendaraan pulang."
                ),
                StoryQuestion(
                    "q_ridecar_3",
                    "按照儿子的计划，如果表现好他们要坐什么？(Menurut si anak, kalau sikapnya baik mereka akan naik apa?)",
                    listOf(
                        "坐出租车 (Naik taksi)",
                        "坐公共汽车 (Naik bus umum)",
                        "坐火车 (Naik kereta api)",
                        "走路 (Jalan kaki)"
                    ),
                    1,
                    "Anak itu berkata: '如果我表现好，我们就坐公共汽车回去' (Kalau sikapku baik, kita naik bus umum pulang)."
                ),
                StoryQuestion(
                    "q_ridecar_4",
                    "为什么儿子的回答让人觉得很好笑？(Mengapa jawaban anak laki-laki itu terdengar sangat lucu?)",
                    listOf(
                        "因为他害怕坐车 (Karena dia takut naik kendaraan)",
                        "因为表现不好反而可以坐更贵更舒服的出租车 (Karena kalau nakal/tidak baik, dia malah minta naik taksi yang lebih mahal dan nyaman)",
                        "因为他在路边大哭 (Karena dia menangis di pinggir jalan)",
                        "因为他想自己开车 (Karena dia ingin menyetir sendiri)"
                    ),
                    1,
                    "Kelucuan puncaknya: jika berkelakuan tidak baik, dia malah mengatur agar mereka pulang naik taksi ('出租车') yang jauh lebih nyaman daripada bus umum!"
                )
            )
        ),

        // Cerita Mandarin Bean 14: Fall Asleep (睡着)
        Story(
            id = "story_fall_asleep",
            titleHanzi = "睡着",
            titlePinyin = "Shuìzháo",
            titleTranslation = "Fall Asleep (Tertidur)",
            level = "HSK 1",
            category = "Humor & Keluarga",
            description = "Anekdot jenaka tentang seorang ayah yang membacakan cerita pengantar tidur untuk anaknya, tetapi justru ayahnya sendiri yang langsung tertidur lelap.",
            coverEmoji = "💤",
            coverImageRes = R.drawable.cover_story_fall_asleep,
            estimatedReadMinutes = 2,
            sentences = listOf(
                Sentence(
                    "s_fallasleep_1",
                    "儿子不想睡觉，爸爸坐在他的旁边给他讲故事。一个小时过去了，房间里很安静，没有一点儿声音。",
                    "Érzi bù xiǎng shuìjiào, bàba zuò zài tā de pángbiān gěi tā jiǎng gùshi. Yī gè xiǎoshí guòqù le, fángjiān lǐ hěn ānjìng, méiyǒu yīdiǎnr shēngyīn.",
                    "Anak laki-laki tidak mau tidur, ayah duduk di sampingnya membacakan cerita untuknya. Satu jam telah berlalu, di dalam kamar sangat sunyi, tidak ada suara sedikit pun.",
                    listOf(
                        WordToken("儿子", "érzi", "Anak laki-laki", "Putra kandung"),
                        WordToken("不想", "bù xiǎng", "Tidak ingin", "Negasi keinginan"),
                        WordToken("睡觉", "shuìjiào", "Tidur", "Aktivitas istirahat tidur"),
                        WordToken("爸爸", "bàba", "Ayah", "Orang tua laki-laki"),
                        WordToken("坐在", "zuò zài", "Duduk di", "Posisi duduk di tempat"),
                        WordToken("他的", "tā de", "Miliknya / -nya", "Pronomina kepemilikan orang ketiga"),
                        WordToken("旁边", "pángbiān", "Samping / sebelah", "Penunjuk letak posisi"),
                        WordToken("给他", "gěi tā", "Kepadanya / untuknya", "Preposisi penerima manfaat"),
                        WordToken("讲故事", "jiǎng gùshi", "Bercerita / mendongeng", "Aktivitas menceritakan kisah"),
                        WordToken("一个小时", "yī gè xiǎoshí", "Satu jam", "Rentang durasi waktu 60 menit"),
                        WordToken("过去了", "guòqù le", "Telah berlalu", "Waktu yang sudah lewat"),
                        WordToken("房间里", "fángjiān lǐ", "Di dalam kamar", "Keterangan ruang kamar"),
                        WordToken("很", "hěn", "Sangat", "Tingkat intensitas"),
                        WordToken("安静", "ānjìng", "Tenang / hening", "Kondisi sunyi tanpa kegaduhan"),
                        WordToken("没有", "méiyǒu", "Tidak ada", "Negasi eksistensi"),
                        WordToken("一点儿", "yīdiǎnr", "Sedikit pun", "Kuantitas minimal"),
                        WordToken("声音", "shēngyīn", "Suara", "Bunyi suara")
                    )
                ),
                Sentence(
                    "s_fallasleep_2",
                    "这时妈妈开门问：“他睡着了吗？”",
                    "Zhè shí māma kāi mén wèn: “Tā shuìzháo le ma?”",
                    "Pada saat ini ibu membuka pintu dan bertanya: “Apakah dia sudah tertidur?”",
                    listOf(
                        WordToken("这时", "zhè shí", "Saat ini / pada waktu itu", "Keterangan titik waktu"),
                        WordToken("妈妈", "māma", "Ibu", "Panggilan orang tua perempuan"),
                        WordToken("开门", "kāi mén", "Membuka pintu", "Tindakan membuka daun pintu"),
                        WordToken("问", "wèn", "Bertanya", "Kata kerja tutur"),
                        WordToken("他", "tā", "Dia", "Kata ganti orang ketiga"),
                        WordToken("睡着了", "shuìzháo le", "Sudah tertidur", "Kondisi masuk ke alam tidur lelap"),
                        WordToken("吗", "ma", "Apakah", "Partikel kalimat tanya ya/tidak")
                    )
                ),
                Sentence(
                    "s_fallasleep_3",
                    "“睡着了，妈妈。”儿子说，“爸爸读了一分钟就睡着了。”",
                    "“Shuìzháo le, māma.” Érzi shuō, “Bàba dú le yī fēnzhōng jiù shuìzháo le.”",
                    "“Sudah tertidur, Ibu,” kata anak laki-laki itu, “Ayah baru membaca satu menit langsung tertidur.”",
                    listOf(
                        WordToken("睡着了", "shuìzháo le", "Sudah tertidur", "Kondisi tertidur pulas"),
                        WordToken("妈妈", "māma", "Ibu", "Panggilan sayang kepada ibu"),
                        WordToken("儿子", "érzi", "Anak laki-laki", "Subjek putra"),
                        WordToken("说", "shuō", "Berkata", "Kata kerja tutur"),
                        WordToken("爸爸", "bàba", "Ayah", "Subjek ayah"),
                        WordToken("读了", "dú le", "Membaca selama", "Kata kerja membaca teks"),
                        WordToken("一分钟", "yī fēnzhōng", "Satu menit", "Durasi waktu 60 detik yang sangat singkat"),
                        WordToken("就", "jiù", "Langsung", "Adverbia kesegeraan tindakan"),
                        WordToken("睡着了", "shuìzháo le", "Tertidur lelap", "Kondisi tertidur")
                    )
                )
            ),
            questions = listOf(
                StoryQuestion(
                    "q_fallasleep_1",
                    "一开始为什么爸爸要给儿子讲故事？(Pada awalnya mengapa ayah membacakan cerita untuk anaknya?)",
                    listOf(
                        "因为儿子想学中文 (Karena anak ingin belajar Mandarin)",
                        "因为儿子不想睡觉 (Karena anak tidak mau tidur)",
                        "因为爸爸喜欢讲故事 (Karena ayah hobi mendongeng)",
                        "因为妈妈不在家 (Karena ibu tidak ada di rumah)"
                    ),
                    1,
                    "Di kalimat pertama dijelaskan: '儿子不想睡觉，爸爸坐在他的旁边给他讲故事' (Anak tidak mau tidur, sehingga ayah mendongeng untuknya)."
                ),
                StoryQuestion(
                    "q_fallasleep_2",
                    "一个小时后，房间里的情况怎么样？(Setelah satu jam berlalu, bagaimana keadaan di dalam kamar?)",
                    listOf(
                        "房间里很吵闹 (Kamar sangat bising)",
                        "房间里很安静，没有一点儿声音 (Kamar sangat sunyi, tidak ada suara sedikit pun)",
                        "爸爸和儿子在玩游戏 (Ayah dan anak sedang bermain game)",
                        "电视机还开着 (Televisi masih menyala)"
                    ),
                    1,
                    "Teks menyatakan: '一个小时过去了，房间里很安静，没有一点儿声音' (Kamar sangat tenang dan hening tanpa suara)."
                ),
                StoryQuestion(
                    "q_fallasleep_3",
                    "妈妈开门时问了什么？(Apa yang ditanyakan ibu saat membuka pintu?)",
                    listOf(
                        "晚饭做好了吗？ (Apakah makan malam sudah siap?)",
                        "他睡着了吗？ (Apakah dia sudah tertidur?)",
                        "你们在做什么？ (Kalian sedang melakukan apa?)",
                        "该吃药了吗？ (Apakah sudah waktunya minum obat?)"
                    ),
                    1,
                    "Ibu membuka pintu dan bertanya: '他睡着了吗？' (Apakah dia sudah tertidur? - mengira anaknya yang tidur)."
                ),
                StoryQuestion(
                    "q_fallasleep_4",
                    "故事最有趣的反转是什么？(Apa plot twist lucu dari akhir cerita ini?)",
                    listOf(
                        "妈妈也进去睡觉了 (Ibu ikut masuk tidur)",
                        "其实是爸爸刚读了一分钟就睡着了 (Sebenarnya ayah yang baru membaca satu menit langsung tertidur pulas)",
                        "儿子偷偷跑出房间 (Anak diam-diam kabur dari kamar)",
                        "故事书找不到了 (Buku cerita hilang)"
                    ),
                    1,
                    "Anak laki-laki yang masih segar bugar menjawab polos: '睡着了，妈妈。爸爸读了一分钟就睡着了。' (Bukan anak yang tidur, melainkan ayahnya yang baru membaca 1 menit langsung tertidur lelap!)."
                )
            )
        ),

        // Cerita Mandarin Bean 15: Result (结果)
        Story(
            id = "story_result",
            titleHanzi = "结果",
            titlePinyin = "Jiéguǒ",
            titleTranslation = "Result (Hasil / Akibat)",
            level = "HSK 1",
            category = "Humor & Sekolah",
            description = "Anekdot cerdas tentang seorang murid bernama Xiao Ming saat diajari pengurangan matematika dengan perumpamaan buah apel milik kakaknya.",
            coverEmoji = "🍎",
            coverImageRes = R.drawable.cover_story_result,
            estimatedReadMinutes = 2,
            sentences = listOf(
                Sentence(
                    "s_result_1",
                    "老师说：“今天我们来学习减法。小明，你哥哥有五个苹果，你从那儿拿走三个，结果会怎样？”",
                    "Lǎoshī shuō: “Jīntiān wǒmen lái xuéxí jiǎnfǎ. Xiǎomíng, nǐ gēge yǒu wǔ gè píngguǒ, nǐ cóng nàr názǒu sān gè, jiéguǒ huì zěnyàng?”",
                    "Guru berkata: “Hari ini kita akan belajar pengurangan. Xiao Ming, kakak laki-lakimu punya lima buah apel, kamu mengambil tiga buah dari sana, bagaimana hasilnya?”",
                    listOf(
                        WordToken("老师", "lǎoshī", "Guru", "Pendidik / pengajar"),
                        WordToken("说", "shuō", "Berkata", "Kata kerja tutur"),
                        WordToken("今天", "jīntiān", "Hari ini", "Keterangan waktu saat ini"),
                        WordToken("我们", "wǒmen", "Kita", "Kata ganti orang pertama jamak"),
                        WordToken("来学习", "lái xuéxí", "Mari belajar", "Datang untuk mempelajari"),
                        WordToken("减法", "jiǎnfǎ", "Pengurangan", "Operasi matematika pengurangan"),
                        WordToken("小明", "Xiǎomíng", "Xiao Ming", "Nama murid laki-laki"),
                        WordToken("你", "nǐ", "Kamu", "Pronomina orang kedua"),
                        WordToken("哥哥", "gēge", "Kakak laki-laki", "Saudara laki-laki yang lebih tua"),
                        WordToken("有", "yǒu", "Memiliki / ada", "Kata kerja kepemilikan"),
                        WordToken("五个", "wǔ gè", "Lima buah", "Bilangan angka 5 + kata penggolong"),
                        WordToken("苹果", "píngguǒ", "Apel", "Buah apel"),
                        WordToken("你", "nǐ", "Kamu", "Pronomina orang kedua"),
                        WordToken("从", "cóng", "Dari", "Preposisi asal"),
                        WordToken("那儿", "nàr", "Sana", "Kata penunjuk tempat itu"),
                        WordToken("拿走", "ná zǒu", "Mengambil pergi", "Kata kerja mengambil dan membawa pergi"),
                        WordToken("三个", "sān gè", "Tiga buah", "Bilangan angka 3 + penggolong"),
                        WordToken("结果", "jiéguǒ", "Hasilnya / akibatnya", "Hasil perhitungan atau akibat kejadian"),
                        WordToken("会怎样", "huì zěnyàng", "Akan bagaimana?", "Menanyakan apa yang akan terjadi")
                    )
                ),
                Sentence(
                    "s_result_2",
                    "小明回答：“老师，结果他一定会打我的！昨天我只吃了哥哥的一个苹果，他就打我了。所以我们可以不从哥哥那儿拿走苹果吗？”",
                    "Xiǎomíng huídá: “Lǎoshī, jiéguǒ tā yīdìng huì dǎ wǒ de! Zuótiān wǒ zhǐ chī le gēge de yí gè píngguǒ, tā jiù dǎ wǒ le. Suǒyǐ wǒmen kěyǐ bù cóng gēge nàr názǒu píngguǒ ma?”",
                    "Xiao Ming menjawab: “Guru, akibatnya dia pasti akan memukul saya! Kemarin saya cuma memakan satu buah apel milik kakak, dia langsung memukul saya. Jadi bisakah kita tidak mengambil apel dari tempat kakak?”",
                    listOf(
                        WordToken("小明", "Xiǎomíng", "Xiao Ming", "Subjek murid"),
                        WordToken("回答", "huídá", "Menjawab", "Memberikan jawaban tutur"),
                        WordToken("老师", "lǎoshī", "Guru", "Panggilan hormat guru"),
                        WordToken("结果", "jiéguǒ", "Hasilnya / akibatnya", "Akibat yang terjadi"),
                        WordToken("他", "tā", "Dia", "Pronomina orang ketiga"),
                        WordToken("一定会", "yīdìng huì", "Pasti akan", "Kepastian mutlak"),
                        WordToken("打我的", "dǎ wǒ de", "Memukul saya!", "Kata kerja memukul + objek + penegas"),
                        WordToken("昨天", "zuótiān", "Kemarin", "Keterangan waktu kemarin"),
                        WordToken("我", "wǒ", "Saya / aku", "Pronomina orang pertama"),
                        WordToken("只吃了", "zhǐ chī le", "Hanya memakan", "Adverbia pembatas 'hanya' + makan + partikel aspek"),
                        WordToken("哥哥的", "gēge de", "Milik kakak", "Kepemilikan kakak laki-laki"),
                        WordToken("一个", "yī gè", "Satu buah", "Bilangan + penggolong"),
                        WordToken("苹果", "píngguǒ", "Apel", "Buah apel"),
                        WordToken("他", "tā", "Dia", "Subjek kakak"),
                        WordToken("就打我了", "jiù dǎ wǒ le", "Langsung memukul saya", "Tindakan balasan seketika"),
                        WordToken("所以", "suǒyǐ", "Oleh karena itu", "Konjungsi simpulan sebab-akibat"),
                        WordToken("我们", "wǒmen", "Kita", "Pronomina jamak"),
                        WordToken("可以", "kěyǐ", "Boleh / bisakah", "Modalitas izin"),
                        WordToken("不从", "bù cóng", "Tidak dari", "Negasi preposisi"),
                        WordToken("哥哥", "gēge", "Kakak", "Kakak laki-laki"),
                        WordToken("那儿", "nàr", "Sana", "Tempat itu"),
                        WordToken("拿走", "ná zǒu", "Mengambil", "Tindakan mengambil"),
                        WordToken("苹果", "píngguǒ", "Apel", "Buah apel"),
                        WordToken("吗", "ma", "Apakah boleh?", "Partikel kalimat tanya")
                    )
                )
            ),
            questions = listOf(
                StoryQuestion(
                    "q_result_1",
                    "老师今天在课堂上要教学生们什么？(Apa materi pelajaran yang diajarkan guru hari ini di kelas?)",
                    listOf(
                        "学习汉字书写 (Menulis hanzi)",
                        "学习减法算术 (Belajar hitungan pengurangan / matematika)",
                        "学习唱中文歌 (Menyanyi lagu Mandarin)",
                        "学习做饭 (Belajar memasak)"
                    ),
                    1,
                    "Guru berkata: '今天我们来学习减法' (Hari ini kita belajar operasi pengurangan)."
                ),
                StoryQuestion(
                    "q_result_2",
                    "老师给小明出了怎样的数学题？(Soal matematika seperti apa yang diberikan guru kepada Xiao Ming?)",
                    listOf(
                        "哥哥有五个苹果，拿走三个 (Kakak punya 5 apel, diambil 3 apel)",
                        "哥哥有十本书，借走两本 (Kakak punya 10 buku, dipinjam 2)",
                        "妈妈买了三个苹果和两个橘子 (Ibu beli 3 apel dan 2 jeruk)",
                        "弟弟吃了四个西瓜 (Adik makan 4 semangka)"
                    ),
                    0,
                    "Guru memberi soal pengurangan: '你哥哥有五个苹果，你从那儿拿走三个，结果会怎样？'."
                ),
                StoryQuestion(
                    "q_result_3",
                    "小明认为拿走三个苹果的“结果”会是什么？(Menurut Xiao Ming, apa \"hasil\" jika dia mengambil 3 apel milik kakaknya?)",
                    listOf(
                        "哥哥还剩下两个苹果 (Kakak sisa 2 apel)",
                        "哥哥一定会打他的！ (Kakak pasti akan memukulnya!)",
                        "哥哥会再给他买苹果 (Kakak akan membelikan apel baru)",
                        "老师会给他奖品 (Guru akan memberinya hadiah)"
                    ),
                    1,
                    "Xiao Ming menjawab dengan cemas dan polos: '老师，结果他一定会打我的！' (Guru, hasilnya kakak pasti akan memukul saya!)."
                ),
                StoryQuestion(
                    "q_result_4",
                    "为什么小明这么肯定哥哥会打他？(Kenapa Xiao Ming begitu yakin kakaknya akan memukulnya?)",
                    listOf(
                        "因为昨天他只吃了一个苹果，哥哥就打他了 (Karena kemarin baru makan 1 apel saja sudah dipukul kakak)",
                        "因为哥哥不喜欢吃水果 (Karena kakak tidak suka buah)",
                        "因为苹果非常昂贵 (Karena apelnya sangat mahal)",
                        "因为哥哥脾气不好 (Karena kakak pemarah pada semua orang)"
                    ),
                    0,
                    "Xiao Ming menceritakan pengalamannya: '昨天我只吃了哥哥的一个苹果，他就打我了' (Kemarin cuma makan 1 apel saja sudah dipukul, apalagi kalau mengambil 3!)."
                )
            )
        ),

        // Cerita Mandarin Bean 16: Wash the Face (洗脸)
        Story(
            id = "story_wash_the_face",
            titleHanzi = "洗脸",
            titlePinyin = "Xǐ Liǎn",
            titleTranslation = "Wash the Face (Mencuci Muka)",
            level = "HSK 1",
            category = "Humor & Sekolah",
            description = "Anekdot kocak tentang murid bernama Xiaobo yang malas mencuci muka dan membuat gurunya tercengang saat menebak sisa makanan di wajahnya.",
            coverEmoji = "🧼",
            coverImageRes = R.drawable.cover_story_wash_the_face,
            estimatedReadMinutes = 2,
            sentences = listOf(
                Sentence(
                    "s_washface_1",
                    "7岁的小波不喜欢洗脸。有一天，老师看见他的脸很脏，就说：“你怎么每天不洗脸？吃的早饭渣还在脸上呢？”",
                    "7 suì de Xiǎobō bù xǐhuan xǐ liǎn. Yǒu yì tiān, lǎoshī kànjiàn tā de liǎn hěn zāng, jiù shuō: “Nǐ zěnme měi tiān bù xǐ liǎn? Chī de zǎofàn zhā hái zài liǎn shàng ne?”",
                    "Xiaobo yang berumur 7 tahun tidak suka mencuci muka. Suatu hari, guru melihat wajahnya sangat kotor, lalu berkata: “Mengapa kamu setiap hari tidak cuci muka? Sisa makanan sarapan bahkan masih menempel di wajahmu lho?”",
                    listOf(
                        WordToken("7岁的", "7 suì de", "Berusia 7 tahun", "Keterangan usia anak"),
                        WordToken("小波", "Xiǎobō", "Xiaobo", "Nama anak murid"),
                        WordToken("不喜欢", "bù xǐhuan", "Tidak suka", "Negasi kesukaan"),
                        WordToken("洗脸", "xǐ liǎn", "Mencuci muka", "Membersihkan wajah dengan air"),
                        WordToken("有一天", "yǒu yì tiān", "Suatu hari", "Keterangan waktu pada suatu hari"),
                        WordToken("老师", "lǎoshī", "Guru", "Pendidik / pengajar"),
                        WordToken("看见", "kànjiàn", "Melihat", "Menangkap dengan indera penglihatan"),
                        WordToken("他的", "tā de", "Miliknya / -nya", "Pronomina kepemilikan orang ketiga"),
                        WordToken("脸", "liǎn", "Wajah / muka", "Bagian muka"),
                        WordToken("很脏", "hěn zāng", "Sangat kotor", "Kondisi bernoda/dekil"),
                        WordToken("就说", "jiù shuō", "Lalu berkata", "Konjungsi akibat + kata kerja tutur"),
                        WordToken("你怎么", "nǐ zěnme", "Mengapa kamu", "Pertanyaan heran menanyakan alasan"),
                        WordToken("每天", "měi tiān", "Setiap hari", "Frekuensi harian"),
                        WordToken("不洗脸", "bù xǐ liǎn", "Tidak cuci muka", "Tidak membersihkan wajah"),
                        WordToken("吃的", "chī de", "Yang dimakan", "Makanan yang disantap"),
                        WordToken("早饭", "zǎofàn", "Sarapan", "Makan pagi"),
                        WordToken("渣", "zhā", "Sisa / remah", "Ampas atau remah makanan"),
                        WordToken("还在", "hái zài", "Masih berada di", "Keterangan masih ada"),
                        WordToken("脸上", "liǎn shàng", "Di wajah", "Posisi di atas permukaan muka"),
                        WordToken("呢", "ne", "Lho", "Partikel penegas retoris di akhir kalimat")
                    )
                ),
                Sentence(
                    "s_washface_2",
                    "小波说：“老师，那你猜猜我吃的是什么？”",
                    "Xiǎobō shuō: “Lǎoshī, nà nǐ cāicai wǒ chī de shì shénme?”",
                    "Xiaobo berkata: “Guru, kalau begitu coba tebak apa yang saya makan?”",
                    listOf(
                        WordToken("小波", "Xiǎobō", "Xiaobo", "Subjek murid"),
                        WordToken("说", "shuō", "Berkata", "Kata kerja tutur"),
                        WordToken("老师", "lǎoshī", "Guru", "Panggilan hormat guru"),
                        WordToken("那你", "nà nǐ", "Kalau begitu Anda", "Konjungsi transisi + pronomina"),
                        WordToken("猜猜", "cāicai", "Tebaklah", "Reduplikasi kata kerja menebak"),
                        WordToken("我", "wǒ", "Saya / aku", "Kata ganti orang pertama"),
                        WordToken("吃的", "chī de", "Yang dimakan", "Objek makanan"),
                        WordToken("是", "shì", "Adalah", "Kopula"),
                        WordToken("什么", "shénme", "Apa?", "Kata tanya benda")
                    )
                ),
                Sentence(
                    "s_washface_3",
                    "老师说：“米饭。”",
                    "Lǎoshī shuō: “Mǐfàn.”",
                    "Guru berkata: “Nasi.”",
                    listOf(
                        WordToken("老师", "lǎoshī", "Guru", "Subjek guru"),
                        WordToken("说", "shuō", "Berkata", "Kata kerja tutur"),
                        WordToken("米饭", "mǐfàn", "Nasi", "Nasi putih matang")
                    )
                ),
                Sentence(
                    "s_washface_4",
                    "小波说：“老师，你猜错了，那是昨天吃的。”",
                    "Xiǎobō shuō: “Lǎoshī, nǐ cāi cuò le, nà shì zuótiān chī de.”",
                    "Xiaobo berkata: “Guru, tebakan Anda salah, itu nasi yang saya makan kemarin.”",
                    listOf(
                        WordToken("小波", "Xiǎobō", "Xiaobo", "Subjek murid"),
                        WordToken("说", "shuō", "Berkata", "Kata kerja tutur"),
                        WordToken("老师", "lǎoshī", "Guru", "Panggilan hormat guru"),
                        WordToken("你", "nǐ", "Anda / Ibu guru", "Pronomina orang kedua"),
                        WordToken("猜错了", "cāi cuò le", "Tebakan Anda salah", "Salah menebak"),
                        WordToken("那是", "nà shì", "Itu adalah", "Kata penunjuk jauh + kopula"),
                        WordToken("昨天", "zuótiān", "Kemarin", "Keterangan waktu kemarin"),
                        WordToken("吃的", "chī de", "Yang dimakan", "Makanan yang disantap kemarin")
                    )
                )
            ),
            questions = listOf(
                StoryQuestion(
                    "q_washface_1",
                    "小波有什么不好的生活习惯？(Kebiasaan buruk apa yang dimiliki Xiaobo?)",
                    listOf(
                        "不喜欢写作业 (Tidak suka mengerjakan PR)",
                        "不喜欢洗脸 (Tidak suka mencuci muka)",
                        "不喜欢吃饭 (Tidak suka makan)",
                        "经常迟到 (Sering terlambat)"
                    ),
                    1,
                    "Di kalimat pertama dinyatakan: '7岁的小波不喜欢洗脸' (Xiaobo yang berumur 7 tahun tidak suka mencuci muka)."
                ),
                StoryQuestion(
                    "q_washface_2",
                    "老师看见小波脸上有什么？(Guru melihat apa yang menempel di wajah Xiaobo?)",
                    listOf(
                        "一滴墨水 (Setetes tinta)",
                        "早饭的食物残渣 (Sisa / remah makanan)",
                        "红色的颜料 (Cat merah)",
                        "一片树叶 (Sehelai daun)"
                    ),
                    1,
                    "Guru menegur: '吃的早饭渣还在脸上呢？' (Remah makanan sarapan bahkan masih menempel di wajahmu lho?)."
                ),
                StoryQuestion(
                    "q_washface_3",
                    "当小波让老师猜他吃了什么时，老师的回答是什么？(Saat Xiaobo menyuruh guru menebak apa yang dia makan, apa tebakan guru?)",
                    listOf(
                        "面包 (Roti)",
                        "米饭 (Nasi)",
                        "苹果 (Apel)",
                        "面条 (Mi)"
                    ),
                    1,
                    "Melihat butiran nasi yang menempel di wajah Xiaobo, guru menebak: '米饭' (Nasi)."
                ),
                StoryQuestion(
                    "q_washface_4",
                    "故事最搞笑的结局是什么？(Apa akhir cerita yang paling lucu?)",
                    listOf(
                        "Xiaobo langsung pergi mencuci muka ke wastafel",
                        "Guru memberinya hadiah sarapan baru",
                        "Xiaobo mengatakan nasi itu adalah makanan kemarin, bukan sarapan hari ini! (那是昨天吃的)",
                        "Guru memanggil orang tua Xiaobo"
                    ),
                    2,
                    "Xiaobo dengan polos mengoreksi tebakan gurunya: '老师，你猜错了，那是昨天吃的！' (Guru salah tebak, butiran nasi itu dimakan kemarin! — artinya Xiaobo sudah berhari-hari tidak cuci muka!)."
                )
            )
        ),

        // Cerita Mandarin Bean 17: Distribute Watermelon (分西瓜)
        Story(
            id = "story_distribute_watermelon",
            titleHanzi = "分西瓜",
            titlePinyin = "Fēn Xīguā",
            titleTranslation = "Distribute Watermelon (Membagi Semangka)",
            level = "HSK 1",
            category = "Humor & Matematika",
            description = "Anekdot jenaka tentang seorang anak yang salah paham tentang pecahan matematika saat membagi buah semangka bersama teman-temannya.",
            coverEmoji = "🍉",
            coverImageRes = R.drawable.cover_story_distribute_watermelon,
            estimatedReadMinutes = 2,
            sentences = listOf(
                Sentence(
                    "s_distwatermelon_1",
                    "爸爸买了一个西瓜，儿子叫来了两个小朋友一起吃，一个说：“我要二分之一。”",
                    "Bàba mǎi le yí gè xīguā, érzi jiào lái le liǎng gè xiǎo péngyou yīqǐ chī, yí gè shuō: “Wǒ yào èr fēn zhī yī.”",
                    "Ayah membeli sebuah semangka, anak laki-lakinya memanggil dua teman kecil untuk makan bersama, satu teman berkata: “Aku mau seperdua (setengah).”",
                    listOf(
                        WordToken("爸爸", "bàba", "Ayah", "Orang tua laki-laki"),
                        WordToken("买了", "mǎi le", "Membeli", "Tindakan membeli barang"),
                        WordToken("一个", "yī gè", "Sebuah", "Bilangan + kata penggolong"),
                        WordToken("西瓜", "xīguā", "Semangka", "Buah semangka manis"),
                        WordToken("儿子", "érzi", "Anak laki-laki", "Putra kandung"),
                        WordToken("叫来了", "jiào lái le", "Memanggil datang", "Mengajak orang datang berkumpul"),
                        WordToken("两个", "liǎng gè", "Dua orang", "Bilangan + penggolong orang"),
                        WordToken("小朋友", "xiǎo péngyou", "Teman kecil / anak-anak", "Sesama anak kecil"),
                        WordToken("一起吃", "yīqǐ chī", "Makan bersama", "Bersantap secara bersama-sama"),
                        WordToken("一个", "yí gè", "Satu anak", "Salah satu teman"),
                        WordToken("说", "shuō", "Berkata", "Kata kerja tutur"),
                        WordToken("我要", "wǒ yào", "Saya mau / minta", "Pernyataan permintaan"),
                        WordToken("二分之一", "èr fēn zhī yī", "Setengah / 1/2", "Pecahan satu per dua")
                    )
                ),
                Sentence(
                    "s_distwatermelon_2",
                    "另一个说：“我要三分之一。”",
                    "Lìng yí gè shuō: “Wǒ yào sān fēn zhī yī.”",
                    "Teman yang satu lagi berkata: “Aku mau sepertiga.”",
                    listOf(
                        WordToken("另一个", "lìng yí gè", "Yang satunya lagi", "Teman yang lain"),
                        WordToken("说", "shuō", "Berkata", "Kata kerja tutur"),
                        WordToken("我要", "wǒ yào", "Saya mau", "Permintaan"),
                        WordToken("三分之一", "sān fēn zhī yī", "Sepertiga / 1/3", "Pecahan satu per tiga")
                    )
                ),
                Sentence(
                    "s_distwatermelon_3",
                    "儿子最后说：“这个西瓜是我爸爸买的，我就多吃一点儿，我要百分之一！”",
                    "Érzi zuìhòu shuō: “Zhè gè xīguā shì wǒ bàba mǎi de, wǒ jiù duō chī yīdiǎnr, wǒ yào bǎi fēn zhī yī!”",
                    "Anak laki-laki itu terakhir berkata: “Semangka ini ayahku yang beli, jadi aku mau makan lebih banyak sedikit, aku mau seperseratus (1%)!”",
                    listOf(
                        WordToken("儿子", "érzi", "Anak laki-laki", "Subjek putra"),
                        WordToken("最后", "zuìhòu", "Terakhir", "Urutan paling akhir"),
                        WordToken("说", "shuō", "Berkata", "Kata kerja tutur"),
                        WordToken("这个", "zhè gè", "Ini", "Kata penunjuk"),
                        WordToken("西瓜", "xīguā", "Semangka", "Buah semangka"),
                        WordToken("是", "shì", "Adalah", "Kopula"),
                        WordToken("我爸爸", "wǒ bàba", "Ayah saya", "Subjek ayah penutur"),
                        WordToken("买的", "mǎi de", "Yang membelinya", "Konstruksi penegas pembeli"),
                        WordToken("我", "wǒ", "Saya / aku", "Pronomina orang pertama"),
                        WordToken("就", "jiù", "Maka", "Adverbia penegas akibat wajar"),
                        WordToken("多吃", "duō chī", "Makan lebih banyak", "Kuantitas makan bertambah"),
                        WordToken("一点儿", "yīdiǎnr", "Sedikit", "Sedikit lebih banyak"),
                        WordToken("我要", "wǒ yào", "Saya mau", "Permintaan"),
                        WordToken("百分之一", "bǎi fēn zhī yī", "Seperseratus / 1%", "Pecahan satu per seratus")
                    )
                )
            ),
            questions = listOf(
                StoryQuestion(
                    "q_distwatermelon_1",
                    "爸爸买了什么水果给孩子们吃？(Buah apa yang dibeli ayah untuk dimakan bersama anak-anak?)",
                    listOf(
                        "苹果 (Apel)",
                        "西瓜 (Semangka)",
                        "香蕉 (Pisang)",
                        "草莓 (Stroberi)"
                    ),
                    1,
                    "Di kalimat pertama dinyatakan: '爸爸买了一个西瓜，儿子叫来了两个小朋友一起吃' (Ayah membeli sebuah semangka)."
                ),
                StoryQuestion(
                    "q_distwatermelon_2",
                    "两个小朋友分别想要吃多少西瓜？(Berapa bagian semangka yang diminta oleh kedua teman kecil itu?)",
                    listOf(
                        "二分之一和三分之一 (1/2 dan 1/3)",
                        "四分之一和五分之一 (1/4 dan 1/5)",
                        "两个人都要吃全部 (Keduanya minta semuanya)",
                        "他们都不想吃 (Mereka tidak mau makan)"
                    ),
                    0,
                    "Satu teman berkata: '我要二分之一' (1/2), dan teman lainnya berkata: '我要三分之一' (1/3)."
                ),
                StoryQuestion(
                    "q_distwatermelon_3",
                    "儿子为什么觉得自己应该多吃一点儿？(Mengapa anak laki-laki itu merasa harus makan lebih banyak?)",
                    listOf(
                        "因为他年纪最大 (Karena dia paling tua)",
                        "因为这个西瓜是他爸爸买的 (Karena semangka itu dibeli oleh ayahnya)",
                        "因为他跑得最快 (Karena dia lari paling cepat)",
                        "因为他很渴 (Karena dia sangat haus)"
                    ),
                    1,
                    "Anak itu beralasan: '这个西瓜是我爸爸买的，我就多吃一点儿' (Semangka ini ayahku yang beli, jadi aku makan lebih banyak)."
                ),
                StoryQuestion(
                    "q_distwatermelon_4",
                    "故事的笑点在哪里？(Di mana letak kelucuan dari cerita ini?)",
                    listOf(
                        "西瓜太甜了 (Semangkanya terlalu manis)",
                        "儿子以为“百分之一”比“二分之一”多，其实拿到的是最少最小的一块！(Anak itu mengira 1/100 lebih banyak dari 1/2 karena angka 100 lebih besar, padahal porsinya jadi yang paling sedikit!)",
                        "西瓜掉在地上了 (Semangkanya jatuh ke tanah)",
                        "爸爸把西瓜都吃光了 (Ayah menghabiskan semua semangkanya)"
                    ),
                    1,
                    "Kelucuan puncaknya: anak itu gagal paham matematika pecahan; ia mengira angka 100 (百) lebih besar sehingga porsi '百分之一' (1%) paling banyak, padahal seperseratus justru potongan yang paling kecil sekali!"
                )
            )
        ),

        // Cerita Mandarin Bean 18: Smart Hawker (聪明的小贩)
        Story(
            id = "story_smart_hawker",
            titleHanzi = "聪明的小贩",
            titlePinyin = "Cōngming de Xiǎofàn",
            titleTranslation = "Smart Hawker (Pedagang yang Cerdas)",
            level = "Fun, HSK 1",
            category = "Humor & Bisnis",
            description = "Anekdot cerdas tentang trik psikologi harga seorang pedagang susu yang membuat pembeli merasa beruntung padahal memborong 3 cangkir sekaligus.",
            coverEmoji = "🥛",
            coverImageRes = R.drawable.cover_story_smart_hawker,
            estimatedReadMinutes = 2,
            sentences = listOf(
                Sentence(
                    "s_smarthawker_1",
                    "有一个人去买牛奶，小贩说：“三元一杯，十元三杯。”",
                    "Yǒu yí gè rén qù mǎi niúnǎi, xiǎofàn shuō: “Sān yuán yì bēi, shí yuán sān bēi.”",
                    "Ada seseorang pergi membeli susu, pedagang kaki lima berkata: “Tiga yuan satu cangkir, sepuluh yuan tiga cangkir.”",
                    listOf(
                        WordToken("有一个人", "yǒu yí gè rén", "Ada seseorang", "Frasa keberadaan seorang pembeli"),
                        WordToken("去买", "qù mǎi", "Pergi membeli", "Tindakan berbelanja"),
                        WordToken("牛奶", "niúnǎi", "Susu", "Minuman susu sapi segar"),
                        WordToken("小贩", "xiǎofàn", "Pedagang kecil / penjual", "Penjual jalanan atau pedagang kios"),
                        WordToken("说", "shuō", "Berkata", "Kata kerja tutur"),
                        WordToken("三元", "sān yuán", "Tiga yuan", "Mata uang nominal 3 yuan"),
                        WordToken("一杯", "yì bēi", "Satu cangkir", "Bilangan + penggolong cangkir"),
                        WordToken("十元", "shí yuán", "Sepuluh yuan", "Nominal 10 yuan"),
                        WordToken("三杯", "sān bēi", "Tiga cangkir", "Bilangan + penggolong cangkir")
                    )
                ),
                Sentence(
                    "s_smarthawker_2",
                    "他拿三块钱买了一杯，像这样买了三次，然后对小贩说：“你看，我拿九块钱就买了三杯。”",
                    "Tā ná sān kuài qián mǎi le yì bēi, xiàng zhèyàng mǎi le sān cì, ránhòu duì xiǎofàn shuō: “Nǐ kàn, wǒ ná jiǔ kuài qián jiù mǎi le sān bēi.”",
                    "Dia mengambil uang tiga yuan membeli satu cangkir, seperti ini membeli tiga kali, lalu berkata kepada pedagang: “Coba lihat, saya cuma pakai uang sembilan yuan sudah bisa membeli tiga cangkir.”",
                    listOf(
                        WordToken("他拿", "tā ná", "Dia mengambil / membayar", "Tindakan mengambil uang pembayaran"),
                        WordToken("三块钱", "sān kuài qián", "Uang tiga yuan", "Bentuk lisan untuk 3 yuan"),
                        WordToken("买了一杯", "mǎi le yì bēi", "Membeli satu cangkir", "Tindakan pembelian pertama"),
                        WordToken("像这样", "xiàng zhèyàng", "Seperti ini", "Menunjukkan pengulangan cara yang sama"),
                        WordToken("买了", "mǎi le", "Membeli", "Kata kerja + aspek selesainya transaksi"),
                        WordToken("三次", "sān cì", "Tiga kali", "Frekuensi pengulangan pembelian"),
                        WordToken("然后", "ránhòu", "Kemudian / lalu", "Konjungsi urutan waktu"),
                        WordToken("对", "duì", "Kepada", "Preposisi arah tutur"),
                        WordToken("小贩", "xiǎofàn", "Pedagang", "Penjual susu"),
                        WordToken("说", "shuō", "Berkata", "Kata kerja tutur"),
                        WordToken("你看", "nǐ kàn", "Coba lihat", "Frasa menarik perhatian lawan bicara"),
                        WordToken("我拿", "wǒ ná", "Saya hanya menggunakan", "Memakai uang"),
                        WordToken("九块钱", "jiǔ kuài qián", "Uang sembilan yuan", "Nominal 9 yuan (3 x 3)"),
                        WordToken("就买了", "jiù mǎi le", "Sudah bisa membeli", "Penegasan kemudahan transaksi"),
                        WordToken("三杯", "sān bēi", "Tiga cangkir", "Total cangkir susu yang dibeli")
                    )
                ),
                Sentence(
                    "s_smarthawker_3",
                    "小贩说：“我这样做，每次都能卖出三杯。”",
                    "Xiǎofàn shuō: “Wǒ zhème zuò, měi cì dōu néng mài chū sān bēi.”",
                    "Pedagang itu tersenyum berkata: “Saya sengaja berbuat begitu, setiap kali selalu berhasil menjual tiga cangkir.”",
                    listOf(
                        WordToken("小贩", "xiǎofàn", "Pedagang", "Subjek pedagang"),
                        WordToken("说", "shuō", "Berkata", "Kata kerja tutur"),
                        WordToken("我这样做", "wǒ zhème zuò", "Saya berbuat begini", "Taktik strategi harga pedagang"),
                        WordToken("每次", "měi cì", "Setiap kali", "Setiap ada pembeli datang"),
                        WordToken("都能", "dōu néng", "Selalu dapat", "Kepastian keberhasilan strategi penjualan"),
                        WordToken("卖出", "mài chū", "Menjual keluar / laku", "Penjualan barang dagangan laku terjual"),
                        WordToken("三杯", "sān bēi", "Tiga cangkir", "Jumlah 3 cangkir susu")
                    )
                )
            ),
            questions = listOf(
                StoryQuestion(
                    "q_smarthawker_1",
                    "小贩卖牛奶的价格规则是什么？(Bagaimana aturan harga susu yang ditawarkan oleh pedagang?)",
                    listOf(
                        "三元一杯，十元三杯 (3 yuan 1 cangkir, 10 yuan 3 cangkir)",
                        "五元一杯，十元两杯 (5 yuan 1 cangkir, 10 yuan 2 cangkir)",
                        "小朋友免费喝 (Gratis untuk anak-anak)",
                        "一元一杯 (1 yuan 1 cangkir)"
                    ),
                    0,
                    "Pedagang mematok harga unik: '三元一杯，十元三杯' (3 yuan satu cangkir, 10 yuan tiga cangkir)."
                ),
                StoryQuestion(
                    "q_smarthawker_2",
                    "买牛奶的人是如何买到三杯牛奶的？(Bagaimana pembeli mendapatkan tiga cangkir susu?)",
                    listOf(
                        "直接付十元买三杯 (Langsung bayar 10 yuan untuk 3 cangkir)",
                        "每次付三块钱，像这样买了三次 (Membayar 3 yuan per cangkir sebanyak 3 kali)",
                        "和小贩讨价还价 (Menawar harga dengan pedagang)",
                        "叫来朋友一起买 (Memanggil temannya ikut beli)"
                    ),
                    1,
                    "Pembeli membayar 3 yuan per cangkir dan mengulanginya 3 kali ('像这样买了三次'), sehingga menghabiskan total 9 yuan."
                ),
                StoryQuestion(
                    "q_smarthawker_3",
                    "买牛奶的人对小贩说了什么？(Apa yang dikatakan pembeli kepada pedagang?)",
                    listOf(
                        "牛奶太甜了 (Susunya terlalu manis)",
                        "你看，我拿九块钱就买了三杯 (Coba lihat, saya cuma pakai 9 yuan sudah bisa beli 3 cangkir)",
                        "请再送我一杯 (Tolong beri saya gratis satu cangkir lagi)",
                        "你的牛奶不好喝 (Susumu tidak enak)"
                    ),
                    1,
                    "Pembeli merasa telah mengakali pedagang: '你看，我拿九块钱就买了三杯' (Coba lihat, cuma pakai 9 yuan sudah dapat 3 cangkir!)."
                ),
                StoryQuestion(
                    "q_smarthawker_4",
                    "小贩为什么故意定这个价格？(Mengapa pedagang sengaja mematok strategi harga tersebut?)",
                    listOf(
                        "因为他数学不好，算错了 (Karena tidak bisa matematika)",
                        "为了让顾客觉得自己占便宜，每次都能顺利卖出三杯！(Agar pembeli merasa untung sehingga selalu memborong 3 cangkir sekaligus!)",
                        "因为他想早点关门回家 (Karena ingin cepat tutup)",
                        "为了打折促销 (Karena ingin memberi diskon amal)"
                    ),
                    1,
                    "Inilah kejeniusan pedagang: '我这样做，每次都能卖出三杯' (Dengan trik harga semu itu, orang yang tadinya hanya ingin beli 1 cangkir terdorong membeli 3 cangkir sekaligus!)."
                )
            )
        ),

        // Cerita Mandarin Bean 19: Lost Girl (迷失的女孩)
        Story(
            id = "story_lost_girl",
            titleHanzi = "迷失的女孩",
            titlePinyin = "Míshī de Nǚhái",
            titleTranslation = "Lost Girl (Gadis Kecil yang Tersesat)",
            level = "Fun, HSK 1",
            category = "Humor & Keluarga",
            description = "Anekdot menggemaskan tentang seorang anak yang tersesat di jalan dan menjawab nama orang tuanya dengan panggilan sayang ayah dan ibunya di rumah.",
            coverEmoji = "👧",
            coverImageRes = R.drawable.cover_story_lost_girl,
            estimatedReadMinutes = 2,
            sentences = listOf(
                Sentence(
                    "s_lostgirl_1",
                    "有一个小女孩在路边哭，警察过来问：“好孩子，怎么了？”",
                    "Yǒu yí gè xiǎo nǚhái zài lù biān kū, jǐngchá guò lái wèn: “Hǎo háizi, zěnme le?”",
                    "Ada seorang gadis kecil menangis di pinggir jalan, polisi datang menghampiri dan bertanya: “Anak baik, ada apa?”",
                    listOf(
                        WordToken("有一个", "yǒu yí gè", "Ada seorang", "Frasa keberadaan seorang anak"),
                        WordToken("小女孩", "xiǎo nǚhái", "Gadis kecil", "Anak perempuan kecil"),
                        WordToken("在", "zài", "Di", "Preposisi lokasi tempat"),
                        WordToken("路边", "lù biān", "Pinggir jalan", "Sisi jalan umum"),
                        WordToken("哭", "kū", "Menangis", "Mengeluarkan air mata kesedihan"),
                        WordToken("警察", "jǐngchá", "Polisi", "Petugas kepolisian penolong"),
                        WordToken("过来", "guò lái", "Datang menghampiri", "Mendekati anak tersebut"),
                        WordToken("问", "wèn", "Bertanya", "Kata kerja tutur"),
                        WordToken("好孩子", "hǎo háizi", "Anak baik", "Sapaan ramah kepada anak kecil"),
                        WordToken("怎么了", "zěnme le", "Ada apa / kenapa?", "Pertanyaan menanyakan penyebab tangis")
                    )
                ),
                Sentence(
                    "s_lostgirl_2",
                    "小女孩哭着说：“我想回家，但是我不知道回家的路了。”",
                    "Xiǎo nǚhái kū zhe shuō: “Wǒ xiǎng huí jiā, dànshì wǒ bù zhīdào huí jiā de lù le.”",
                    "Gadis kecil itu sambil menangis berkata: “Aku ingin pulang ke rumah, tetapi aku sudah tidak tahu jalan pulang ke rumah.”",
                    listOf(
                        WordToken("小女孩", "xiǎo nǚhái", "Gadis kecil", "Subjek anak perempuan"),
                        WordToken("哭着说", "kū zhe shuō", "Berkata sambil menangis", "Tindakan tutur diiringi tangisan"),
                        WordToken("我想", "wǒ xiǎng", "Saya ingin", "Keinginan kuat untuk pulang"),
                        WordToken("回家", "huí jiā", "Pulang ke rumah", "Kembali ke kediaman keluarga"),
                        WordToken("但是", "dànshì", "Tetapi / namun", "Konjungsi pertentangan"),
                        WordToken("我不知道", "wǒ bù zhīdào", "Saya tidak tahu", "Ketidaktahuan rute"),
                        WordToken("回家的", "huí jiā de", "Arah pulang", "Menuju arah ke rumah"),
                        WordToken("路", "lù", "Jalan", "Jalanan / jalur arah pulang"),
                        WordToken("了", "le", "Sudah", "Partikel aspek perubahan keadaan")
                    )
                ),
                Sentence(
                    "s_lostgirl_3",
                    "警察问：“你爸爸叫什么？”",
                    "Jǐngchá wèn: “Nǐ bàba jiào shénme?”",
                    "Polisi bertanya: “Siapa nama ayahmu?”",
                    listOf(
                        WordToken("警察", "jǐngchá", "Polisi", "Subjek petugas polisi"),
                        WordToken("问", "wèn", "Bertanya", "Kata kerja tutur"),
                        WordToken("你爸爸", "nǐ bàba", "Ayahmu", "Orang tua laki-laki"),
                        WordToken("叫什么", "jiào shénme", "Siapa namanya?", "Pertanyaan menanyakan nama")
                    )
                ),
                Sentence(
                    "s_lostgirl_4",
                    "小女孩说：“亲爱的！”",
                    "Xiǎo nǚhái shuō: “Qīn'ài de!”",
                    "Gadis kecil berkata: “Sayang!”",
                    listOf(
                        WordToken("小女孩", "xiǎo nǚhái", "Gadis kecil", "Subjek anak"),
                        WordToken("说", "shuō", "Berkata", "Kata kerja tutur"),
                        WordToken("亲爱的", "qīn'ài de", "Sayang! / Darling", "Panggilan sayang mesra istri ke suami")
                    )
                ),
                Sentence(
                    "s_lostgirl_5",
                    "警察问：“你妈妈叫什么？”",
                    "Jǐngchá wèn: “Nǐ māma jiào shénme?”",
                    "Polisi bertanya: “Siapa nama ibumu?”",
                    listOf(
                        WordToken("警察", "jǐngchá", "Polisi", "Subjek polisi"),
                        WordToken("问", "wèn", "Bertanya", "Kata kerja tutur"),
                        WordToken("你妈妈", "nǐ māma", "Ibumu", "Orang tua perempuan"),
                        WordToken("叫什么", "jiào shénme", "Siapa namanya?", "Pertanyaan menanyakan nama")
                    )
                ),
                Sentence(
                    "s_lostgirl_6",
                    "小女孩说：“宝贝！”",
                    "Xiǎo nǚhái shuō: “Bǎobèi!”",
                    "Gadis kecil berkata: “Baby / Sayang!”",
                    listOf(
                        WordToken("小女孩", "xiǎo nǚhái", "Gadis kecil", "Subjek anak"),
                        WordToken("说", "shuō", "Berkata", "Kata kerja tutur"),
                        WordToken("宝贝", "bǎobèi", "Baby! / Sayang", "Panggilan sayang manis suami ke istri")
                    )
                )
            ),
            questions = listOf(
                StoryQuestion(
                    "q_lostgirl_1",
                    "小女孩为什么在路边哭？(Mengapa gadis kecil itu menangis di pinggir jalan?)",
                    listOf(
                        "迷路了，不知道回家的路 (Tersesat dan tidak tahu jalan pulang ke rumah)",
                        "肚子饿了想吃东西 (Lapar ingin makan)",
                        "没有零花钱 (Tidak punya uang saku)",
                        "和同学吵架了 (Bertengkar dengan teman)"
                    ),
                    0,
                    "Gadis kecil itu mengadu: '我想回家，但是我不知道回家的路了' (Saya ingin pulang, tapi tidak tahu jalan pulang)."
                ),
                StoryQuestion(
                    "q_lostgirl_2",
                    "谁过来热心帮助小女孩？(Siapa yang datang dengan ramah menolong gadis kecil itu?)",
                    listOf(
                        "医生 (Dokter)",
                        "老师 (Guru)",
                        "警察 (Polisi)",
                        "邻居 (Tetangga)"
                    ),
                    2,
                    "Teks menyatakan: '警察过来问：好孩子，怎么了？' (Petugas polisi datang menghampiri dan bertanya)."
                ),
                StoryQuestion(
                    "q_lostgirl_3",
                    "当警察问小女孩爸爸叫什么名字时，小女孩怎么回答？(Saat polisi menanyakan nama ayahnya, apa jawaban gadis kecil itu?)",
                    listOf(
                        "李大卫 (Li Dawei)",
                        "亲爱的 (Sayang / Darling)",
                        "王先生 (Tuan Wang)",
                        "小孙 (Xiao Sun)"
                    ),
                    1,
                    "Gadis kecil itu dengan polos menjawab: '亲爱的！' (karena itulah panggilan ibunya kepada sang ayah di rumah)."
                ),
                StoryQuestion(
                    "q_lostgirl_4",
                    "为什么小女孩会说妈妈的名字叫“宝贝”？(Mengapa gadis kecil itu mengatakan nama ibunya adalah 'Baby/Sayang'?)",
                    listOf(
                        "因为平时在家里爸爸都这么亲切地叫妈妈 (Karena sehari-hari di rumah ayahnya memanggil ibu dengan panggilan sayang tersebut)",
                        "因为妈妈的名字很难念 (Karena nama ibu susah diucapkan)",
                        "因为她不想告诉警察实话 (Karena tidak mau jujur ke polisi)",
                        "因为她把朋友的名字记混了 (Karena tertukar dengan nama temannya)"
                    ),
                    0,
                    "Inilah puncak kelucuan cerita: karena di rumah ayah dan ibunya selalu memanggil mesra satu sama lain dengan '亲爱的' (Darling) dan '宝贝' (Baby), anak kecil itu mengira itulah nama resmi orang tuanya!"
                )
            )
        )
)
