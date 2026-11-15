package com.example.chineselearning.data.repository

import com.example.chineselearning.R
import com.example.chineselearning.data.model.*

val mandarinBeanStoriesPart3: List<Story> = listOf(
        // Cerita Mandarin Bean 37: Love (Kasih Sayang) (爱)
        Story(
            id = "story_love",
            titleHanzi = "爱",
            titlePinyin = "Ài",
            titleTranslation = "Love (Kasih Sayang)",
            level = "HSK 1",
            category = "Keluarga & Kasih Sayang",
            description = "Kisah mengharukan tentang seorang anak perempuan yang menggigit kedua apelnya bukan karena serakah, melainkan untuk memilihkan apel yang paling manis untuk ibunya.",
            coverEmoji = "❤️",
            coverImageRes = R.drawable.cover_story_love,
            estimatedReadMinutes = 2,
            sentences = listOf(
                Sentence(
                    "s_love_1",
                    "女儿有两个苹果，妈妈问：“给我一个好不好？”",
                    "Nǚ'ér yǒu liǎng gè píngguǒ, māma wèn: “Gěi wǒ yí gè hǎo bù hǎo?”",
                    "Anak perempuan memiliki dua buah apel, ibu bertanya: “Beri ibu satu boleh tidak?”",
                    listOf(
                        WordToken("女儿", "nǚ'ér", "Anak perempuan", "Putri kandung"),
                        WordToken("有", "yǒu", "Punya / ada", "Kata kerja kepemilikan"),
                        WordToken("两个", "liǎng gè", "Dua buah", "Bilangan + penggolong"),
                        WordToken("苹果", "píng guǒ", "Apel", "Buah apel"),
                        WordToken("妈妈", "māma", "Ibu", "Panggilan orang tua perempuan"),
                        WordToken("问", "wèn", "Bertanya", "Kata kerja tutur"),
                        WordToken("给我", "gěi wǒ", "Beri saya", "Memberikan kepada penutur"),
                        WordToken("一个", "yí gè", "Satu buah", "Kuantitas satu"),
                        WordToken("好不好", "hǎo bù hǎo", "Boleh tidak?", "Pertanyaan meminta persetujuan")
                    )
                ),
                Sentence(
                    "s_love_2",
                    "女儿看着妈妈，把两个苹果都咬了一口。这时候，妈妈很伤心。",
                    "Nǚ'ér kàn zhe māma, bǎ liǎng gè píngguǒ dōu yǎo le yì kǒu. Zhè shíhou, māma hěn shāngxīn.",
                    "Anak perempuan itu memandangi ibunya, lalu menggigit kedua apel itu masing-masing satu gigitan. Pada saat ini, ibu merasa sangat sedih.",
                    listOf(
                        WordToken("女儿", "nǚ'ér", "Anak perempuan", "Subjek anak"),
                        WordToken("看着", "kàn zhe", "Memandangi", "Mengarahkan pandangan"),
                        WordToken("妈妈", "māma", "Ibu", "Ibu"),
                        WordToken("把两个", "bǎ liǎng gè", "Kedua buah", "Partikel ba penegas objek"),
                        WordToken("苹果", "píng guǒ", "Apel", "Buah apel"),
                        WordToken("都", "dōu", "Semua / kedua-duanya", "Cakupan menyeluruh"),
                        WordToken("咬了一口", "yǎo le yì kǒu", "Menggigit satu gigitan", "Aktivitas menggigit"),
                        WordToken("这时候", "zhè shíhou", "Pada waktu itu / saat ini", "Keterangan titik waktu"),
                        WordToken("妈妈", "māma", "Ibu", "Ibu"),
                        WordToken("很伤心", "hěn shāngxīn", "Sangat sedih / patah hati", "Perasaan kecewa dan sedih")
                    )
                ),
                Sentence(
                    "s_love_3",
                    "但是女儿吃完后，对妈妈说：“这个甜，给妈妈！”",
                    "Dànshì nǚ'ér chī wán hòu, duì māma shuō: “Zhè gè tián, gěi māma!”",
                    "Tetapi setelah mengunyahnya, anak itu berkata kepada ibunya: “Yang ini manis, untuk Ibu!”",
                    listOf(
                        WordToken("但是", "dànshì", "Tetapi / namun", "Konjungsi pertentangan"),
                        WordToken("女儿", "nǚ'ér", "Anak perempuan", "Subjek anak"),
                        WordToken("吃完后", "chī wán hòu", "Setelah selesai mengunyah", "Aktivitas selesai makan"),
                        WordToken("对", "duì", "Kepada", "Preposisi arah tutur"),
                        WordToken("妈妈", "māma", "Ibu", "Ibu"),
                        WordToken("说", "shuō", "Berkata", "Kata kerja tutur"),
                        WordToken("这个", "zhè gè", "Yang ini", "Kata penunjuk dekat"),
                        WordToken("甜", "tián", "Manis", "Rasa manis buah"),
                        WordToken("给妈妈", "gěi māma", "Untuk Ibu!", "Tindakan mempersembahkan kepada ibu")
                    )
                )
            ),
            questions = listOf(
                StoryQuestion(
                    "q_love_1",
                    "女儿手里一共有几个苹果？(Berapa buah apel yang dimiliki anak perempuan itu?)",
                    listOf(
                        "一个 (1 buah)",
                        "两个 (2 buah)",
                        "三个 (3 buah)",
                        "五个 (5 buah)"
                    ),
                    1,
                    "Di kalimat pertama tertulis: '女儿有两个苹果' (Anak perempuan punya 2 buah apel)."
                ),
                StoryQuestion(
                    "q_love_2",
                    "妈妈问女儿要苹果时，女儿做了什么举动？(Saat ibu meminta satu apel, apa tindakan yang dilakukan sang anak?)",
                    listOf(
                        "立刻把两个苹果都藏起来 (Langsung menyembunyikan apel)",
                        "把两个苹果都咬了一口 (Menggigit kedua apel itu masing-masing satu gigitan)",
                        "大声哭闹 (Menangis keras)",
                        "把苹果扔在地上 (Membuang apel ke lantai)"
                    ),
                    1,
                    "Teks menyatakan: '女儿看着妈妈，把两个苹果都咬了一口'."
                ),
                StoryQuestion(
                    "q_love_3",
                    "看到女儿把两个苹果都咬了一口，妈妈最初的心情怎样？(Melihat anak menggigit kedua apel, bagaimana perasaan awal sang ibu?)",
                    listOf(
                        "很高兴 (Sangat senang)",
                        "很伤心，以为孩子自私小气 (Sangat sedih, mengira anaknya egois pelit)",
                        "很生气大声责备 (Sangat marah memarahi)",
                        "无所谓 (Biasa saja)"
                    ),
                    1,
                    "Ibu salah paham dan merasa sedih: '这时候，妈妈很伤心'."
                ),
                StoryQuestion(
                    "q_love_4",
                    "女儿为什么要咬两个苹果？(Mengapa anak perempuan itu menggigit kedua apel tersebut?)",
                    listOf(
                        "Karena rakus",
                        "Untuk mencicipi mana yang lebih manis, agar bisa memberikan apel termanis kepada ibunya! (为了尝哪一个更甜，把甜的留给妈妈)",
                        "Karena kedua apel itu kotor",
                        "Karena disuruh ayahnya"
                    ),
                    1,
                    "Puncak kehangatan cinta: '这个甜，给妈妈！' (Anak itu menggigit untuk menguji rasa dan memberikan bagian paling manis kepada ibu tercinta!)."
                )
            )
        ),

        // Cerita Mandarin Bean 38: One Yuan (Satu Yuan) (一块钱)
        Story(
            id = "story_one_yuan_watermelon",
            titleHanzi = "一块钱",
            titlePinyin = "Yí Kuài Qián",
            titleTranslation = "One Yuan (Satu Yuan)",
            level = "Fun, HSK 1",
            category = "Humor & Keluarga",
            description = "Anekdot kocak tentang Xiao Yue yang meminta uang 1 yuan kepada ibunya dengan alasan ingin bersedekah, padahal sebenarnya ingin membeli semangka kecil.",
            coverEmoji = "🍉",
            coverImageRes = R.drawable.cover_story_one_yuan,
            estimatedReadMinutes = 2,
            sentences = listOf(
                Sentence(
                    "s_oneyuan_1",
                    "小月对正在做饭的妈妈说：“妈妈，今天天气太热了，你能给我一块钱吗？我想给学校外面的先生一块钱。”",
                    "Xiǎoyuè duì zhèngzài zuò fàn de māma shuō: “Māma, jīntiān tiānqì tài rè le, nǐ néng gěi wǒ yí kuài qián ma? Wǒ xiǎng gěi xuéxiào wàimiàn de xiānsheng yí kuài qián.”",
                    "Xiao Yue berkata kepada ibunya yang sedang memasak: “Ibu, hari ini cuaca sangat panas, bisakah Ibu memberiku uang satu yuan? Aku ingin memberikan uang satu yuan kepada pria di luar sekolah.”",
                    listOf(
                        WordToken("小月", "Xiǎoyuè", "Xiao Yue", "Nama anak perempuan"),
                        WordToken("对", "duì", "Kepada", "Preposisi arah tutur"),
                        WordToken("正在做饭的", "zhèngzài zuò fàn de", "Yang sedang memasak", "Aktivitas ibu menyiapkan makanan"),
                        WordToken("妈妈", "māma", "Ibu", "Panggilan orang tua perempuan"),
                        WordToken("说", "shuō", "Berkata", "Kata kerja tutur"),
                        WordToken("妈妈", "māma", "Ibu", "Panggilan sayang"),
                        WordToken("今天天气", "jīntiān tiānqì", "Cuaca hari ini", "Kondisi iklim cuaca"),
                        WordToken("太热了", "tài rè le", "Sangat panas terik", "Suhu udara tinggi"),
                        WordToken("你能", "nǐ néng", "Bisakah Ibu", "Permintaan santun"),
                        WordToken("给我", "gěi wǒ", "Memberi saya", "Memberikan uang"),
                        WordToken("一块钱", "yí kuài qián", "Satu yuan", "Uang nominal 1 kuai"),
                        WordToken("吗", "ma", "Bolehkah?", "Partikel tanya"),
                        WordToken("我想给", "wǒ xiǎng gěi", "Saya ingin memberi", "Niat menyerahkan uang"),
                        WordToken("学校", "xuéxiào", "Sekolah", "Tempat belajar"),
                        WordToken("外面的", "wàimiàn de", "Yang di luar", "Posisi luar area sekolah"),
                        WordToken("先生", "xiānsheng", "Tuan / pria", "Sosok pria di luar gerbang"),
                        WordToken("一块钱", "yí kuài qián", "Satu yuan", "Nominal 1 kuai")
                    )
                ),
                Sentence(
                    "s_oneyuan_2",
                    "妈妈很高兴，她觉得小月很有爱心，问：“为什么呢？”",
                    "Māma hěn gāoxìng, tā juéde Xiǎoyuè hěn yǒu àixīn, wèn: “Wèi shénme ne?”",
                    "Ibu sangat senang, dia merasa Xiao Yue memiliki hati yang penuh kasih, lalu bertanya: “Mengapa begitu?”",
                    listOf(
                        WordToken("妈妈", "māma", "Ibu", "Subjek ibu"),
                        WordToken("很高兴", "hěn gāoxìng", "Sangat senang", "Perasaan bangga sukacita"),
                        WordToken("她觉得", "tā juéde", "Dia merasa / mengira", "Pandangan pemikiran ibu"),
                        WordToken("小月", "Xiǎoyuè", "Xiao Yue", "Nama putrinya"),
                        WordToken("很有爱心", "hěn yǒu àixīn", "Sangat berbelas kasih / dermawan", "Sifat mulia penuh empati"),
                        WordToken("问", "wèn", "Bertanya", "Kata kerja tutur"),
                        WordToken("为什么呢", "wèi shénme ne", "Mengapa ya?", "Pertanyaan menanyakan alasan")
                    )
                ),
                Sentence(
                    "s_oneyuan_3",
                    "小月说：“我想买水果吃，小西瓜一块钱一个。”",
                    "Xiǎoyuè shuō: “Wǒ xiǎng mǎi shuǐguǒ chī, xiǎo xīguā yí kuài qián yí gè.”",
                    "Xiao Yue menjawab: “Aku ingin membeli buah untuk dimakan, semangka kecil harganya satu yuan per buah.”",
                    listOf(
                        WordToken("小月", "Xiǎoyuè", "Xiao Yue", "Subjek anak"),
                        WordToken("说", "shuō", "Berkata", "Kata kerja tutur"),
                        WordToken("我想买", "wǒ xiǎng mǎi", "Saya ingin membeli", "Keinginan berbelanja"),
                        WordToken("水果吃", "shuǐguǒ chī", "Buah untuk dimakan", "Santap buah segar"),
                        WordToken("小西瓜", "xiǎo xīguā", "Semangka kecil", "Buah semangka ukuran kecil"),
                        WordToken("一块钱", "yí kuài qián", "Satu yuan", "Harga nominal uang"),
                        WordToken("一个", "yí gè", "Sebuah", "Satuan harga per buah")
                    )
                )
            ),
            questions = listOf(
                StoryQuestion(
                    "q_oneyuan_1",
                    "小月找妈妈要了多少钱？(Berapa banyak uang yang diminta Xiao Yue kepada ibunya?)",
                    listOf(
                        "一块钱 (1 yuan)",
                        "五块钱 (5 yuan)",
                        "十块钱 (10 yuan)",
                        "一百块钱 (100 yuan)"
                    ),
                    0,
                    "Teks menyatakan: '你能给我一块钱吗？' (Bisakah Ibu memberiku uang satu yuan?)."
                ),
                StoryQuestion(
                    "q_oneyuan_2",
                    "妈妈一开始为什么觉得很高兴？(Mengapa pada awalnya ibu merasa sangat senang?)",
                    listOf(
                        "以为小月考试得了第一名 (Mengira Xiao Yue juara kelas)",
                        "以为小月很有爱心，想给外面的穷人捐钱 (Mengira Xiao Yue dermawan dan ingin beramal kepada pria di luar sekolah)",
                        "因为饭做好了 (Karena masakan sudah matang)",
                        "因为小月主动洗碗 (Karena Xiao Yue rajin cuci piring)"
                    ),
                    1,
                    "Ibu merasa bangga: '妈妈很高兴，她觉得小月很有爱心'."
                ),
                StoryQuestion(
                    "q_oneyuan_3",
                    "学校外面的“先生”其实是做什么的？(Pria di luar sekolah itu sebenarnya siapa?)",
                    listOf(
                        "学校的校长 (Kepala sekolah)",
                        "卖水果的小贩 (Pedagang buah semangka)",
                        "警察叔叔 (Petugas polisi)",
                        "出租车司机 (Supir taksi)"
                    ),
                    1,
                    "Pria tersebut adalah penjual buah semangka kecil di depan gerbang sekolah!"
                ),
                StoryQuestion(
                    "q_oneyuan_4",
                    "故事令人忍俊不禁的真相是什么？(Apa kebenaran lucu yang membuat pembaca tersenyum?)",
                    listOf(
                        "Ternyata uang itu bukan untuk sedekah, melainkan untuk membeli buah semangka dingin seharga 1 yuan!",
                        "Xiao Yue menjatuhkan uangnya ke air",
                        "Ibunya tidak punya uang",
                        "Semangkanya tidak manis"
                    ),
                    0,
                    "Kepolosan anak: '我想买水果吃，小西瓜一块钱一个' (Dia ingin 'memberi uang' ke pedagang sebagai transaksi membeli semangka!)."
                )
            )
        ),

        // Cerita Mandarin Bean 39: Teaching cooking (Mengajar Memasak) (教做菜)
        Story(
            id = "story_teaching_cooking",
            titleHanzi = "教做菜",
            titlePinyin = "Jiāo Zuò Cài",
            titleTranslation = "Teaching cooking (Mengajar Memasak)",
            level = "HSK 1",
            category = "Kuliner & Pengalaman",
            description = "Pengalaman seorang pecinta masak yang mencoba mengajari sahabatnya memasak, hingga menyadari betapa sulitnya peran seorang guru.",
            coverEmoji = "🍳",
            coverImageRes = R.drawable.cover_story_teaching_cooking,
            estimatedReadMinutes = 2,
            sentences = listOf(
                Sentence(
                    "s_teachcook_1",
                    "我会做很多东西，我最喜欢做菜。我的朋友、爸爸妈妈都喜欢我做的菜。他们也都很高兴能吃我做的东西，因为很好吃。",
                    "Wǒ huì zuò hěn duō dōngxi, wǒ zuì xǐhuan zuò cài. Wǒ de péngyou, bàba māma dōu xǐhuan wǒ zuò de cài. Tāmen yě dōu hěn gāoxìng néng chī wǒ zuò de dōngxi, yīnwèi hěn hǎochī.",
                    "Saya bisa membuat banyak hal, saya paling suka memasak. Teman-teman saya, ayah dan ibu semuanya menyukai masakan yang saya buat. Mereka juga sangat senang bisa menyantap makanan buatan saya, karena sangat lezat.",
                    listOf(
                        WordToken("我会做", "wǒ huì zuò", "Saya bisa membuat", "Keahlian kemampuan"),
                        WordToken("很多", "hěn duō", "Banyak", "Kuantitas jamak"),
                        WordToken("东西", "dōngxi", "Hal / barang", "Ragam karya"),
                        WordToken("我最喜欢", "wǒ zuì xǐhuan", "Saya paling suka", "Kegemaran nomor satu"),
                        WordToken("做菜", "zuò cài", "Memasak lauk pauk", "Aktivitas memasak"),
                        WordToken("我的朋友", "wǒ de péngyou", "Teman-teman saya", "Sahabat"),
                        WordToken("爸爸妈妈", "bàba māma", "Ayah dan ibu", "Orang tua"),
                        WordToken("都喜欢", "dōu xǐhuan", "Semua menyukai", "Pujian kesukaan"),
                        WordToken("我做的菜", "wǒ zuò de cài", "Masakan buatan saya", "Hidangan karya penutur"),
                        WordToken("他们也", "tāmen yě", "Mereka juga", "Subjek jamak"),
                        WordToken("都很高兴", "dōu hěn gāoxìng", "Semua sangat senang", "Perasaan bahagia"),
                        WordToken("能吃", "néng chī", "Dapat menyantap", "Menikmati makanan"),
                        WordToken("我做的东西", "wǒ zuò de dōngxi", "Makanan yang saya buat", "Hasil olahan dapur"),
                        WordToken("因为", "yīnwèi", "Karena", "Konjungsi sebab"),
                        WordToken("很好吃", "hěn hǎochī", "Sangat lezat / sedap", "Kualitas rasa tinggi")
                    )
                ),
                Sentence(
                    "s_teachcook_2",
                    "有一天，我的好朋友说想学做菜，想请我教他，我同意了。我告诉他怎么做，但是他总是做不好。我觉得当老师太难了。",
                    "Yǒu yì tiān, wǒ de hǎo péngyou shuō xiǎng xué zuò cài, xiǎng qǐng wǒ jiāo tā, wǒ tóngyì le. Wǒ gàosu tā zěnme zuò, dànshì tā zǒngshì zuò bù hǎo. Wǒ juéde dāng lǎoshī tài nán le.",
                    "Suatu hari, sahabat saya berkata ingin belajar memasak dan memintaku mengajarinya, aku pun setuju. Aku memberitahunya cara memasaknya, tetapi dia selalu saja gagal memasak dengan baik. Kupikir menjadi seorang guru sungguh terlalu sulit.",
                    listOf(
                        WordToken("有一天", "yǒu yì tiān", "Suatu hari", "Keterangan waktu"),
                        WordToken("我的好朋友", "wǒ de hǎo péngyou", "Sahabat baik saya", "Teman karib"),
                        WordToken("说想学", "shuō xiǎng xué", "Berkata ingin belajar", "Niat menuntut ilmu"),
                        WordToken("做菜", "zuò cài", "Memasak hidangan", "Keahlian dapur"),
                        WordToken("想请我", "xiǎng qǐng wǒ", "Ingin meminta saya", "Permohonan bantuan"),
                        WordToken("教他", "jiāo tā", "Mengajarinya", "Memberikan bimbingan"),
                        WordToken("我同意了", "wǒ tóngyì le", "Saya menyetujuinya", "Menerima permohonan"),
                        WordToken("我告诉他", "wǒ gàosu tā", "Saya memberitahunya", "Memberi petunjuk"),
                        WordToken("怎么做", "zěnme zuò", "Bagaimana cara memasaknya", "Langkah memasak"),
                        WordToken("但是", "dànshì", "Tetapi / namun", "Konjungsi pertentangan"),
                        WordToken("他总是", "tā zǒngshì", "Dia selalu saja", "Frekuensi berulang kali"),
                        WordToken("做不好", "zuò bù hǎo", "Gagal memasak dengan baik", "Hasil tidak memuaskan"),
                        WordToken("我觉得", "wǒ juéde", "Menurut saya / kupikir", "Opini simpulan"),
                        WordToken("当老师", "dāng lǎoshī", "Menjadi seorang guru", "Peran sebagai pendidik"),
                        WordToken("太难了", "tài nán le", "Terlalu sulit / sukar sekali", "Tingkat kesulitan yang tinggi")
                    )
                )
            ),
            questions = listOf(
                StoryQuestion(
                    "q_teachcook_1",
                    "作者最喜欢做的事情是什么？(Apa hal yang paling disukai penulis?)",
                    listOf(
                        "买衣服 (Membeli baju)",
                        "做菜 (Memasak hidangan)",
                        "看电视 (Menonton TV)",
                        "去旅游 (Pergi wisata)"
                    ),
                    1,
                    "Penulis menyatakan kegemarannya: '我会做很多东西，我最喜欢做菜'."
                ),
                StoryQuestion(
                    "q_teachcook_2",
                    "大家为什么都喜欢吃作者做的菜？(Mengapa semua orang suka makan masakan penulis?)",
                    listOf(
                        "因为不用付钱 (Karena gratis)",
                        "因为菜肴很好吃 (Karena masakannya sangat lezat dan enak)",
                        "因为只有那一家饭馆 (Karena tidak ada pilihan lain)",
                        "因为是买来的 (Karena beli di luar)"
                    ),
                    1,
                    "Teks menyebutkan: '他们也都很高兴能吃我做的东西，因为很好吃'."
                ),
                StoryQuestion(
                    "q_teachcook_3",
                    "好朋友向作者提出了什么请求？(Permintaan apa yang diajukan oleh sahabat penulis?)",
                    listOf(
                        "借钱买菜 (Pinjam uang beli sayur)",
                        "想请作者教他怎么做菜 (Meminta penulis mengajarinya cara memasak)",
                        "请大家去大饭店 (Traktir ke restoran besar)",
                        "帮忙打扫厨房 (Membantu bersih-bersih dapur)"
                    ),
                    1,
                    "Sahabatnya memohon: '想学做菜，想请我教他，我同意了'."
                ),
                StoryQuestion(
                    "q_teachcook_4",
                    "在教朋友做菜之后，作者得出了什么感悟？(Pelajaran apa yang disadari penulis setelah mengajari temannya?)",
                    listOf(
                        "觉得自己不该做菜 (Merasa tidak pantas masak)",
                        "觉得当一名老师教导别人太难了！ (Menyadari bahwa menjadi seorang guru mengajar orang lain itu sungguh sangat sulit!)",
                        "打算开一家餐厅 (Berencana buka restoran)",
                        "朋友学得非常快 (Teman belajar sangat cepat)"
                    ),
                    1,
                    "Refleksi akhir penulis: '他总是做不好。我觉得当老师太难了' (Menjadi guru ternyata jauh lebih sulit daripada sekadar memasak sendiri!)."
                )
            )
        ),

        // Cerita Mandarin Bean 40: Boyfriend (Pacar) (男朋友)
        Story(
            id = "story_boyfriend",
            titleHanzi = "男朋友",
            titlePinyin = "Nánpéngyou",
            titleTranslation = "Boyfriend (Pacar)",
            level = "HSK 1",
            category = "Romansa & Kehidupan",
            description = "Kisah dilema seorang wanita yang mendapati pacarnya berbohong sibuk di kantor, padahal tepergok naik taksi bersama wanita lain.",
            coverEmoji = "💔",
            coverImageRes = R.drawable.cover_story_boyfriend,
            estimatedReadMinutes = 2,
            sentences = listOf(
                Sentence(
                    "s_boyfriend_1",
                    "一个朋友告诉我，昨天他看见我的男朋友和一个女人一起坐出租车吃饭。我说不会的，他说他昨天没有时间吃饭。",
                    "Yí gè péngyou gàosu wǒ, zuótiān tā kànjiàn wǒ de nánpéngyou hé yí gè nǚrén yìqǐ zuò chūzūchē chī fàn. Wǒ shuō bú huì de, tā shuō tā zuótiān méiyǒu shíjiān chī fàn.",
                    "Seorang teman memberi tahuku, kemarin dia melihat pacarku bersama seorang wanita naik taksi pergi makan. Aku bilang tidak mungkin, pacarku bilang dia kemarin tidak ada waktu makan.",
                    listOf(
                        WordToken("一个朋友", "yí gè péngyou", "Seorang teman", "Subjek pemberi kabar"),
                        WordToken("告诉我", "gàosu wǒ", "Memberi tahu saya", "Menyampaikan info"),
                        WordToken("昨天", "zuótiān", "Kemarin", "Keterangan waktu kemarin"),
                        WordToken("他看见", "tā kànjiàn", "Dia melihat", "Menyaksikan kejadian"),
                        WordToken("我的男朋友", "wǒ de nánpéngyou", "Pacar saya", "Kekasih laki-laki"),
                        WordToken("和一个", "hé yí gè", "Dan seorang", "Penghubung + penggolong"),
                        WordToken("女人", "nǚrén", "Wanita", "Perempuan lain"),
                        WordToken("一起", "yìqǐ", "Bersama-sama", "Bersama"),
                        WordToken("坐出租车", "zuò chūzūchē", "Naik taksi", "Moda transportasi taksi"),
                        WordToken("吃饭", "chī fàn", "Makan bersantap", "Makan bersama"),
                        WordToken("我说", "wǒ shuō", "Saya berkata", "Respons penutur"),
                        WordToken("不会的", "bú huì de", "Tidak mungkin!", "Penyangkalan keraguan"),
                        WordToken("他说", "tā shuō", "Dia (pacar) berkata", "Pengakuan pacar"),
                        WordToken("他昨天", "tā zuótiān", "Dia kemarin", "Subjek pacar + waktu"),
                        WordToken("没有时间", "méiyǒu shíjiān", "Tidak ada waktu", "Alasan kesibukan"),
                        WordToken("吃饭", "chī fàn", "Makan", "Aktivitas makan")
                    )
                ),
                Sentence(
                    "s_boyfriend_2",
                    "下班以后，我去他的公司，看见他和一个女人一起坐出租车走了。",
                    "Xià bān yǐhòu, wǒ qù tā de gōngsī, kànjiàn tā hé yí gè nǚrén yìqǐ zuò chūzūchē zǒu le.",
                    "Setelah pulang kerja, aku pergi ke perusahaannya, dan melihat dia bersama seorang wanita naik taksi pergi.",
                    listOf(
                        WordToken("下班以后", "xià bān yǐhòu", "Setelah pulang kerja", "Waktu usai jam kantor"),
                        WordToken("我去", "wǒ qù", "Saya pergi ke", "Perjalanan mendatangi"),
                        WordToken("他的公司", "tā de gōngsī", "Perusahaannya / kantor pacar", "Tempat kerja pacar"),
                        WordToken("看见他", "kànjiàn tā", "Melihatnya", "Menyaksikan langsung dengan mata kepala"),
                        WordToken("和一个", "hé yí gè", "Dan seorang", "Bersama seorang"),
                        WordToken("女人", "nǚrén", "Wanita", "Perempuan"),
                        WordToken("一起", "yìqǐ", "Bersama", "Bersama-sama"),
                        WordToken("坐出租车", "zuò chūzūchē", "Naik taksi", "Kendaraan taksi"),
                        WordToken("走了", "zǒu le", "Berangkat pergi", "Meninggalkan lokasi")
                    )
                ),
                Sentence(
                    "s_boyfriend_3",
                    "我打电话问他在哪，他说他今天很忙，在公司工作。我不知道怎么做，你们说呢？",
                    "Wǒ dǎ diànhuà wèn tā zài nǎ, tā shuō tā jīntiān hěn máng, zài gōngsī gōngzuò. Wǒ bù zhīdào zěnme zuò, nǐmen shuō ne?",
                    "Aku menelepon menanyakan dia ada di mana, dia berbohong bilang hari ini dia sangat sibuk, sedang bekerja di kantor. Aku tidak tahu harus berbuat apa, bagaimana menurut kalian?",
                    listOf(
                        WordToken("我打电话", "wǒ dǎ diànhuà", "Saya menelepon", "Melakukan panggilan telepon"),
                        WordToken("问他在哪", "wèn tā zài nǎ", "Bertanya dia di mana", "Menanyakan keberadaan"),
                        WordToken("他说", "tā shuō", "Dia berkata", "Pengakuan bohong pacar"),
                        WordToken("他今天", "tā jīntiān", "Dia hari ini", "Waktu"),
                        WordToken("很忙", "hěn máng", "Sangat sibuk", "Alasan pekerjaan"),
                        WordToken("在公司", "zài gōngsī", "Di kantor", "Klaim lokasi palsu"),
                        WordToken("工作", "gōngzuò", "Bekerja", "Aktivitas dinas"),
                        WordToken("我不知道", "wǒ bù zhīdào", "Saya tidak tahu", "Kebingungan dilema"),
                        WordToken("怎么做", "zěnme zuò", "Bagaimana harus bertindak", "Langkah keputusan"),
                        WordToken("你们说呢", "nǐmen shuō ne", "Bagaimana menurut kalian?", "Pertanyaan meminta saran pembaca")
                    )
                )
            ),
            questions = listOf(
                StoryQuestion(
                    "q_boyfriend_1",
                    "朋友昨天告诉了作者什么事情？(Kabar apa yang disampaikan teman kepada penulis kemarin?)",
                    listOf(
                        "看见她的男朋友和一个女人一起坐出租车去吃饭 (Melihat pacarnya naik taksi makan bersama wanita lain)",
                        "看见她男朋友买了新车 (Melihat pacar beli mobil baru)",
                        "她男朋友升职了 (Pacarnya naik jabatan)",
                        "她男朋友生病住院了 (Pacarnya sakit di rumah sakit)"
                    ),
                    0,
                    "Temannya mengabarkan: '昨天他看见我的男朋友和一个女人一起坐出租车吃饭'."
                ),
                StoryQuestion(
                    "q_boyfriend_2",
                    "下班后作者去男朋友公司亲眼看到了什么？(Setelah pulang kerja, apa yang dilihat sendiri oleh penulis di kantor pacarnya?)",
                    listOf(
                        "男朋友正在认真加班 (Pacar sedang rajin lembur)",
                        "男朋友和一个女人一起坐出租车走了 (Pacarnya naik taksi pergi bersama seorang wanita)",
                        "公司已经锁门了 (Kantor sudah tutup)",
                        "男朋友在吃快餐 (Pacar sedang makan cepat saji)"
                    ),
                    1,
                    "Penulis memergoki langsung: '看见他和一个女人一起坐出租车走了'."
                ),
                StoryQuestion(
                    "q_boyfriend_3",
                    "当作者打电话问男朋友在哪儿时，男朋友是如何撒谎的？(Bagaimana pacar berbohong saat ditelepon oleh penulis?)",
                    listOf(
                        "说在医院看病 (Mengaku di rumah sakit)",
                        "说他今天很忙，正在公司工作 (Mengaku hari ini sangat sibuk dan sedang bekerja di kantor)",
                        "说在家里睡觉 (Mengaku tidur di rumah)",
                        "说在出差的路上 (Mengaku di luar kota)"
                    ),
                    1,
                    "Pacarnya berbohong tanpa sadar telah tepergok: '他说他今天很忙，在公司工作'."
                ),
                StoryQuestion(
                    "q_boyfriend_4",
                    "作者在故事结尾向大家表达了什么心境？(Perasaan apa yang diungkapkan penulis di akhir cerita?)",
                    listOf(
                        "非常愤怒想打人 (Sangat marah)",
                        "很困惑不知所措，向大家寻求建议 (Bingung harus bersikap bagaimana dan meminta pendapat pembaca)",
                        "决定原谅男朋友 (Memutuskan memaafkan)",
                        "马上订机票去旅游 (Langsung pesan tiket liburan)"
                    ),
                    1,
                    "Penulis mengakhiri dengan curhat: '我不知道怎么做，你们说呢？' (Aku bingung harus bersikap bagaimana, menurut kalian bagaimana?)."
                )
            )
        ),

        // Cerita Mandarin Bean 41: New friend (Teman Baru di Kafe) (新朋友)
        Story(
            id = "story_new_friend_coffee",
            titleHanzi = "新朋友",
            titlePinyin = "Xīn Péngyou",
            titleTranslation = "New friend (Teman Baru di Kafe)",
            level = "HSK 1",
            category = "Pertemanan & Kafe",
            description = "Pertemuan tak terduga di kedai kopi saat lupa membawa uang, yang berujung pada persahabatan manis setelah tahu orang tua mereka ternyata teman sekelas.",
            coverEmoji = "☕",
            coverImageRes = R.drawable.cover_story_new_friend_coffee,
            estimatedReadMinutes = 2,
            sentences = listOf(
                Sentence(
                    "s_newfriendc_1",
                    "李小姐是我今天认识的朋友。我今天在咖啡店吃东西，但是没钱。李小姐说可以借给我，我有点儿不好意思，但是我很想吃东西，就借了她的钱。我们一起吃饭，发现我的妈妈和她的爸爸是同学！我们都很高兴，想明天也一起吃东西。",
                    "Lǐ xiǎojiě shì wǒ jīntiān rènshi de péngyou. Wǒ jīntiān zài kāfēidiàn chī dōngxi, dànshì méi qián. Lǐ xiǎojiě shuō kěyǐ jiè gěi wǒ, wǒ yǒudiǎnr bù hǎoyìsi, dànshì wǒ hěn xiǎng chī dōngxi, jiù jiè le tā de qián. Wǒmen yìqǐ chī fàn, fāxiàn wǒ de māma hé tā de bàba shì tóngxué! Wǒmen dōu hěn gāoxìng, xiǎng míngtiān yě yìqǐ chī dōngxi.",
                    "Nona Li adalah teman yang baru saya kenal hari ini. Hari ini saya makan di kedai kopi, tetapi tidak punya uang. Nona Li berkata bisa meminjamkannya kepada saya, saya agak sungkan/malu, tetapi saya sangat ingin makan, jadi saya meminjam uangnya. Kami makan bersama, dan mengetahui bahwa ibu saya dan ayahnya adalah teman sekelas! Kami berdua sangat senang, dan ingin besok makan bersama lagi.",
                    listOf(
                        WordToken("李小姐", "Lǐ xiǎojiě", "Nona Li", "Panggilan sopan wanita bermarga Li"),
                        WordToken("是", "shì", "Adalah", "Kopula"),
                        WordToken("我", "wǒ", "Saya", "Pronomina"),
                        WordToken("今天", "jīntiān", "Hari ini", "Waktu"),
                        WordToken("认识的", "rènshi de", "Yang baru dikenal", "Menjalin perkenalan"),
                        WordToken("朋友", "péngyou", "Teman", "Kawan"),
                        WordToken("我", "wǒ", "Saya", "Subjek"),
                        WordToken("今天", "jīntiān", "Hari ini", "Waktu"),
                        WordToken("在咖啡店", "zài kāfēidiàn", "Di kedai kopi", "Lokasi kafe"),
                        WordToken("吃东西", "chī dōngxi", "Makan makanan", "Santap panganan"),
                        WordToken("但是", "dànshì", "Tetapi", "Konjungsi"),
                        WordToken("没钱", "méi qián", "Tidak ada uang", "Ketiadaan uang"),
                        WordToken("李小姐", "Lǐ xiǎojiě", "Nona Li", "Subjek penolong"),
                        WordToken("说可以", "shuō kěyǐ", "Berkata boleh / bisa", "Menawarkan bantuan"),
                        WordToken("借给我", "jiè gěi wǒ", "Meminjamkan pada saya", "Memberi pinjaman"),
                        WordToken("我有", "wǒ yǒu", "Saya agak", "Perasaan diri"),
                        WordToken("点儿", "diǎnr", "Sedikit", "Sedikit rasa sungkan"),
                        WordToken("不好意思", "bù hǎoyìsi", "Sungkan / merasa malu", "Rasa segan tidak enak hati"),
                        WordToken("但是", "dànshì", "Tetapi", "Konjungsi"),
                        WordToken("我很想", "wǒ hěn xiǎng", "Saya sangat ingin", "Keinginan kuat"),
                        WordToken("吃东西", "chī dōngxi", "Makan", "Aktivitas makan"),
                        WordToken("就借了", "jiù jiè le", "Maka meminjam", "Tindakan menerima pinjaman"),
                        WordToken("她的钱", "tā de qián", "Uangnya", "Uang milik Nona Li"),
                        WordToken("我们", "wǒmen", "Kami", "Pronomina jamak"),
                        WordToken("一起吃饭", "yìqǐ chī fàn", "Makan bersama", "Makan bersama satu meja"),
                        WordToken("发现", "fāxiàn", "Menemukan / menyadari", "Fakta baru terungkap"),
                        WordToken("我的妈妈", "wǒ de māma", "Ibu saya", "Ibu kandung penutur"),
                        WordToken("和她的爸爸", "hé tā de bàba", "Dan ayahnya", "Ayah Nona Li"),
                        WordToken("是同学", "shì tóngxué", "Adalah teman sekelas", "Sesama pelajar di masa lalu"),
                        WordToken("我们", "wǒmen", "Kami", "Pronomina jamak"),
                        WordToken("都很高兴", "dōu hěn gāoxìng", "Semua sangat gembira", "Perasaan sukacita"),
                        WordToken("想明天", "xiǎng míngtiān", "Ingin besok", "Rencana esok hari"),
                        WordToken("也一起", "yě yìqǐ", "Juga bersama", "Bersama kembali"),
                        WordToken("吃东西", "chī dōngxi", "Makan makanan", "Aktivitas kuliner")
                    )
                )
            ),
            questions = listOf(
                StoryQuestion(
                    "q_newfriendc_1",
                    "作者在咖啡店遇到了什么尴尬的问题？(Masalah canggung apa yang dialami penulis di kedai kopi?)",
                    listOf(
                        "咖啡不好喝 (Kopinya tidak enak)",
                        "想吃东西但是身上没有带钱 (Ingin makan tetapi tidak punya/bawa uang)",
                        "钱包被偷了 (Dompet dicuri)",
                        "找不到座位 (Tidak dapat kursi duduk)"
                    ),
                    1,
                    "Teks menyatakan: '我今天在咖啡店吃东西，但是没钱' (Makan di kafe tapi tidak ada uang)."
                ),
                StoryQuestion(
                    "q_newfriend_c2",
                    "是谁主动借钱帮助了作者？(Siapa yang berinisiatif meminjamkan uang menolong penulis?)",
                    listOf(
                        "李小姐 (Nona Li)",
                        "王老师 (Guru Wang)",
                        "咖啡店老板 (Pemilik kafe)",
                        "服务员 (Pelayan)"
                    ),
                    0,
                    "Nona Li yang baik hati menolong: '李小姐说可以借给我'."
                ),
                StoryQuestion(
                    "q_newfriend_c3",
                    "两人一起吃饭时发现了什么奇妙的巧合？(Kebetulan ajaib apa yang mereka sadari saat makan bersama?)",
                    listOf(
                        "他们住在同一个小区 (Tinggal di perumahan yang sama)",
                        "作者的妈妈和李小姐的爸爸是老同学！ (Ibu penulis dan ayah Nona Li ternyata teman sekelas semasa sekolah!)",
                        "他们读同一所大学 (Kuliah di kampus yang sama)",
                        "他们的生日是同一天 (Ulang tahunnya sama)"
                    ),
                    1,
                    "Fakta unik: '发现我的妈妈和她的爸爸是同学！' (Menyadari orang tua mereka adalah teman sekelas!)."
                ),
                StoryQuestion(
                    "q_newfriend_c4",
                    "这个故事给读者带来了怎样的感受？(Kesan apa yang ditinggalkan cerita ini bagi pembaca?)",
                    listOf(
                        "Kebaikan menolong orang asing tanpa pamrih yang berujung pada takdir persahabatan manis antar-keluarga!",
                        "Jangan makan di kafe",
                        "Harga kopi sangat mahal",
                        "Selalu bawa uang tunai banyak"
                    ),
                    0,
                    "Kisah hangat tentang kebaikan yang menghubungkan silaturahmi dua keluarga!"
                )
            )
        ),

        // Cerita Mandarin Bean 42: My Birthday (Hari Ulang Tahunku) (我的生日)
        Story(
            id = "story_my_birthday",
            titleHanzi = "我的生日",
            titlePinyin = "Wǒ de Shēngrì",
            titleTranslation = "My Birthday (Hari Ulang Tahunku)",
            level = "HSK 1",
            category = "Budaya & Kalender",
            description = "Kisah unik seseorang yang lahir pada tanggal 29 Februari tahun kabisat (1992), sehingga hanya bisa merayakan ulang tahun setiap 4 tahun sekali.",
            coverEmoji = "🎂",
            coverImageRes = R.drawable.cover_story_my_birthday,
            estimatedReadMinutes = 2,
            sentences = listOf(
                Sentence(
                    "s_mybirthday_1",
                    "我在一九九二年二月二十九日出生，那一天是我的生日。我不喜欢这一天，因为这一天很不一样。一九九二年有三百六十六天，不是三百六十五天，多的那一天是二月的二十九日。这一年也叫“闰年”。你知道吗？你们每一年都可以过生日，我每四年才能过生日。",
                    "Wǒ zài yī jiǔ jiǔ èr nián èr yuè èrshíjiǔ rì chūshēng, nà yì tiān shì wǒ de shēngrì. Wǒ bù xǐhuan zhè yì tiān, yīnwèi zhè yì tiān hěn bù yíyàng. Yī jiǔ jiǔ èr nián yǒu sān bǎi liùshíliù tiān, bú shì sān bǎi liùshíwǔ tiān, duō de nà yì tiān shì èr yuè de èrshíjiǔ rì. Zhè yì nián yě jiào “rùnnián”. Nǐ zhīdào ma? Nǐmen měi yì nián dōu kěyǐ guò shēngrì, wǒ měi sì nián cái néng guò shēngrì.",
                    "Saya lahir pada tanggal 29 Februari 1992, hari itulah hari ulang tahun saya. Saya tidak menyukai hari ini, karena hari ini sangatlah berbeda. Tahun 1992 memiliki 366 hari, bukan 365 hari, satu hari lebihnya itu adalah tanggal 29 Februari. Tahun ini juga disebut 'tahun kabisat'. Tahukah kamu? Kalian setiap tahun bisa merayakan ulang tahun, sedangkan saya hanya bisa merayakan ulang tahun setiap empat tahun sekali.",
                    listOf(
                        WordToken("我", "wǒ", "Saya", "Pronomina pertama"),
                        WordToken("在一九九二年", "zài yī jiǔ jiǔ èr nián", "Pada tahun 1992", "Tahun 1992"),
                        WordToken("二月二十九日", "èr yuè èrshíjiǔ rì", "29 Februari", "Tanggal kabisat"),
                        WordToken("出生", "chūshēng", "Lahir", "Kelahiran bayi"),
                        WordToken("那一天", "nà yì tiān", "Hari itu", "Keterangan hari"),
                        WordToken("是我的", "shì wǒ de", "Adalah milik saya", "Kepemilikan"),
                        WordToken("生日", "shēngrì", "Ulang tahun", "Hari lahir"),
                        WordToken("我不喜欢", "wǒ bù xǐhuan", "Saya tidak suka", "Ketidaksukaan"),
                        WordToken("这一天", "zhè yì tiān", "Hari ini", "Hari 29 Feb"),
                        WordToken("因为", "yīnwèi", "Karena", "Konjungsi sebab"),
                        WordToken("这一天", "zhè yì tiān", "Hari ini", "Hari kabisat"),
                        WordToken("很不一样", "hěn bù yíyàng", "Sangat berbeda", "Keunikan kelainan"),
                        WordToken("一九九二年", "yī jiǔ jiǔ èr nián", "Tahun 1992", "Tahun kabisat"),
                        WordToken("有", "yǒu", "Ada / memiliki", "Jumlah hari"),
                        WordToken("三百六十六天", "sān bǎi liùshíliù tiān", "366 hari", "Total hari kabisat"),
                        WordToken("不是", "bú shì", "Bukan", "Bukan 365"),
                        WordToken("三百六十五天", "sān bǎi liùshíwǔ tiān", "365 hari", "Hari tahun biasa"),
                        WordToken("多的", "duō de", "Yang berlebih", "Tambahan 1 hari"),
                        WordToken("那一天", "nà yì tiān", "Hari itu", "Hari ekstra"),
                        WordToken("是二月的", "shì èr yuè de", "Adalah di bulan Februari", "Bulan kedua"),
                        WordToken("二十九日", "èrshíjiǔ rì", "Tanggal 29", "Hari ekstra kabisat"),
                        WordToken("这一年", "zhè yì nián", "Tahun ini", "Tahun tersebut"),
                        WordToken("也叫", "yě jiào", "Juga disebut", "Penamaan istilah"),
                        WordToken("闰年", "rùnnián", "Tahun kabisat", "Tahun dengan 366 hari"),
                        WordToken("你知道吗", "nǐ zhīdào ma", "Tahukah kamu?", "Pertanyaan retoris"),
                        WordToken("你们", "nǐmen", "Kalian", "Pronomina jamak"),
                        WordToken("每一年", "měi yì nián", "Setiap tahun", "Frekuensi tahunan"),
                        WordToken("都可以", "dōu kěyǐ", "Semua bisa", "Kemampuan rutin"),
                        WordToken("过生日", "guò shēngrì", "Merayakan ulang tahun", "Peringatan hari lahir"),
                        WordToken("我", "wǒ", "Saya", "Pronomina"),
                        WordToken("每四年", "měi sì nián", "Setiap empat tahun", "Interval 4 tahunan"),
                        WordToken("才能", "cái néng", "Baru bisa", "Keterbatasan langka"),
                        WordToken("过生日", "guò shēngrì", "Ulang tahun", "Merayakan ultah")
                    )
                )
            ),
            questions = listOf(
                StoryQuestion(
                    "q_mybirthday_1",
                    "作者出生在哪一年哪一天？(Kapan tanggal dan tahun kelahiran penulis?)",
                    listOf(
                        "1990年1月1日",
                        "1992年2月29日 (29 Februari 1992)",
                        "1995年2月28日",
                        "2000年12月31日"
                    ),
                    1,
                    "Teks menyebutkan: '我在一九九二年二月二十九日出生' (Lahir tanggal 29 Februari 1992)."
                ),
                StoryQuestion(
                    "q_mybirthday_2",
                    "1992年这一年一共有多少天？(Berapa jumlah total hari pada tahun 1992?)",
                    listOf(
                        "360天",
                        "365天",
                        "366天 (366 hari)",
                        "370天"
                    ),
                    2,
                    "Penulis menjelaskan: '一九九二年有三百六十六天，不是三百六十五天'."
                ),
                StoryQuestion(
                    "q_mybirthday_3",
                    "有366天的年份在中文里被称为什么？(Tahun yang memiliki 366 hari disebut apa dalam bahasa Mandarin?)",
                    listOf(
                        "大年 (Tahun besar)",
                        "闰年 (Tahun kabisat)",
                        "新年 (Tahun baru)",
                        "平年 (Tahun biasa)"
                    ),
                    1,
                    "Teks menyatakan istilah astronomi: '这一年也叫“闰年”' (Tahun ini disebut 'kabisat')."
                ),
                StoryQuestion(
                    "q_mybirthday_4",
                    "作者为什么有点遗憾地抱怨自己的生日？(Mengapa penulis mengeluhkan tanggal lahirnya dengan jenaka?)",
                    listOf(
                        "Karena dia harus merayakan ulang tahun sendirian",
                        "Karena orang lain bisa merayakan ultah setiap tahun, sedangkan dia hanya bisa merayakan ultah asli setiap 4 tahun sekali! (每四年才能过一次生日)",
                        "Karena kue ulang tahunnya kecil",
                        "Karena dia tidak suka hadiah"
                    ),
                    1,
                    "Kelucuan nasib lahir tanggal 29 Februari: '你们每一年都可以过生日，我每四年才能过生日'!"
                )
            )
        ),

        // Cerita Mandarin Bean 43: My Mother (Ibu Saya) (我的妈妈)
        Story(
            id = "story_my_mother",
            titleHanzi = "我的妈妈",
            titlePinyin = "Wǒ de Māma",
            titleTranslation = "My Mother (Ibu Saya)",
            level = "HSK 1",
            category = "Keluarga & Profesi",
            description = "Potret kehidupan seorang ibu berdedikasi tinggi yang berprofesi sebagai dokter di rumah sakit, gemar makan buah dan berbelanja di waktu luang.",
            coverEmoji = "👩‍⚕️",
            coverImageRes = R.drawable.cover_story_my_mother,
            estimatedReadMinutes = 2,
            sentences = listOf(
                Sentence(
                    "s_mymother_1",
                    "明天是妈妈的生日，她今年55岁。她有一个姐姐和两个弟弟。她不喜欢喝咖啡，但是很喜欢吃水果。她在医院工作，是一个医生，每天都很忙，工作的时间很长。有时候她下午6点下班，有时候晚上10点下班。她也喜欢买东西，所以她非常喜欢去商店。",
                    "Míngtiān shì māma de shēngrì, tā jīnnián 55 suì. Tā yǒu yí gè jiějie hé liǎng gè dìdi. Tā bù xǐhuan hē kāfēi, dànshì hěn xǐhuan chī shuǐguǒ. Tā zài yīyuàn gōngzuò, shì yí gè yīshēng, měitiān dōu hěn máng, gōngzuò de shíjiān hěn cháng. Yǒushíhou tā xiàwǔ 6 diǎn xià bān, yǒushíhou wǎnshang 10 diǎn xià bān. Tā yě xǐhuan mǎi dōngxi, suǒyǐ tā fēicháng xǐhuan qù shāngdiàn.",
                    "Besok adalah hari ulang tahun ibu, beliau tahun ini berusia 55 tahun. Beliau memiliki seorang kakak perempuan dan dua adik laki-laki. Beliau tidak suka minum kopi, tetapi sangat suka makan buah. Beliau bekerja di rumah sakit sebagai seorang dokter, setiap hari sangat sibuk dan jam kerjanya panjang. Kadang-kadang beliau pulang kerja jam 6 sore, kadang-kadang jam 10 malam. Beliau juga gemar berbelanja, sehingga sangat suka pergi ke toko.",
                    listOf(
                        WordToken("明天是", "míngtiān shì", "Besok adalah", "Keterangan waktu esok"),
                        WordToken("妈妈的", "māma de", "Milik ibu", "Kepemilikan orang tua"),
                        WordToken("生日", "shēngrì", "Ulang tahun", "Hari lahir"),
                        WordToken("她今年", "tā jīnnián", "Beliau tahun ini", "Subjek + waktu"),
                        WordToken("55岁", "wǔshíwǔ suì", "55 tahun", "Keterangan usia"),
                        WordToken("她有一个", "tā yǒu yí gè", "Beliau memiliki seorang", "Saudara kandung"),
                        WordToken("姐姐", "jiějie", "Kakak perempuan", "Kakak sulung wanita"),
                        WordToken("和两个", "hé liǎng gè", "Dan dua orang", "Penghubung bilangan"),
                        WordToken("弟弟", "dìdi", "Adik laki-laki", "Saudara muda laki-laki"),
                        WordToken("她不喜欢", "tā bù xǐhuan", "Beliau tidak suka", "Preferensi negatif"),
                        WordToken("喝咖啡", "hē kāfēi", "Minum kopi", "Minuman kopi"),
                        WordToken("但是", "dànshì", "Tetapi", "Konjungsi"),
                        WordToken("很喜欢", "hěn xǐhuan", "Sangat suka", "Preferensi tinggi"),
                        WordToken("吃水果", "chī shuǐguǒ", "Makan buah", "Santap buah segar"),
                        WordToken("她在", "tā zài", "Beliau di", "Preposisi lokasi kerja"),
                        WordToken("医院工作", "yīyuàn gōngzuò", "Bekerja di rumah sakit", "Tempat kerja medis"),
                        WordToken("是一个", "shì yí gè", "Adalah seorang", "Identitas profesi"),
                        WordToken("医生", "yīshēng", "Dokter", "Profesi medis"),
                        WordToken("每天", "měitiān", "Setiap hari", "Frekuensi harian"),
                        WordToken("都很忙", "dōu hěn máng", "Semua sangat sibuk", "Tingkat kesibukan"),
                        WordToken("工作的时间", "gōngzuò de shíjiān", "Waktu jam kerja", "Durasi dinas"),
                        WordToken("很长", "hěn cháng", "Sangat panjang / lama", "Durasi panjang"),
                        WordToken("有时候", "yǒushíhou", "Kadang-kadang", "Keterangan frekuensi"),
                        WordToken("她下午", "tā xiàwǔ", "Beliau sore hari", "Waktu sore"),
                        WordToken("6点下班", "liù diǎn xià bān", "Pukul 6 pulang kerja", "Jam selesai kerja"),
                        WordToken("有时候", "yǒushíhou", "Kadang-kadang", "Keterangan frekuensi"),
                        WordToken("晚上", "wǎnshang", "Malam hari", "Waktu malam"),
                        WordToken("10点", "shí diǎn", "Pukul 10", "Jam 10 malam"),
                        WordToken("下班", "xià bān", "Pulang kerja", "Selesai dinas"),
                        WordToken("她也", "tā yě", "Beliau juga", "Subjek penambahan"),
                        WordToken("喜欢买东西", "xǐhuan mǎi dōngxi", "Suka berbelanja barang", "Hobi belanja"),
                        WordToken("所以", "suǒyǐ", "Oleh karena itu", "Konjungsi simpulan"),
                        WordToken("她非常", "tā fēicháng", "Beliau sangat", "Derajat intensitas"),
                        WordToken("喜欢去", "xǐhuan qù", "Suka pergi ke", "Gemar mendatangi"),
                        WordToken("商店", "shāngdiàn", "Toko / perbelanjaan", "Tempat belanja")
                    )
                )
            ),
            questions = listOf(
                StoryQuestion(
                    "q_mymother_1",
                    "妈妈今年多少岁？在什么地方工作？(Berapa umur ibu dan di mana beliau bekerja?)",
                    listOf(
                        "50岁，在学校 (50 tahun, di sekolah)",
                        "55岁，在医院当医生 (55 tahun, di rumah sakit sebagai dokter)",
                        "60岁，在商店 (60 tahun, di toko)",
                        "45岁，在公司 (45 tahun, di kantor)"
                    ),
                    1,
                    "Teks menyatakan: '她今年55岁... 在医院工作，是一个医生'."
                ),
                StoryQuestion(
                    "q_mymother_2",
                    "妈妈在饮食上有什么喜好？(Apa preferensi konsumsi ibu?)",
                    listOf(
                        "喜欢喝咖啡，不吃水果 (Suka kopi, tidak makan buah)",
                        "不喜欢喝咖啡，但是很喜欢吃水果 (Tidak suka kopi, tetapi sangat suka makan buah)",
                        "只喜欢喝茶 (Hanya suka minum teh)",
                        "喜欢吃辣的菜 (Suka masakan pedas)"
                    ),
                    1,
                    "Teks menyebutkan: '她不喜欢喝咖啡，但是很喜欢吃水果'."
                ),
                StoryQuestion(
                    "q_mymother_3",
                    "妈妈的工作时间一般是怎样的？(Bagaimana jam kerja ibu sebagai dokter?)",
                    listOf(
                        "每天都很轻松 (Santai setiap hari)",
                        "工作时间很长，有时下午6点下班，有时晚上10点才下班 (Jam kerja panjang, kadang pulang jam 6 sore, kadang jam 10 malam)",
                        "只上半天班 (Hanya kerja setengah hari)",
                        "周末不上班 (Akhir pekan libur)"
                    ),
                    1,
                    "Dedikasi ibu: '工作的时间很长。有时候她下午6点下班，有时候晚上10点下班'."
                ),
                StoryQuestion(
                    "q_mymother_4",
                    "除了工作，妈妈平时还有什么爱好？(Selain bekerja, apa hobi ibu di waktu luang?)",
                    listOf(
                        "去图书馆借书 (Pinjam buku di perpustakaan)",
                        "非常喜欢去商店买东西 (Sangat suka pergi ke toko berbelanja barang)",
                        "爬山运动 (Mendaki gunung)",
                        "在家睡觉看电视 (Tidur dan nonton TV)"
                    ),
                    1,
                    "Hobi ibu terungkap di akhir: '她也喜欢买东西，所以她非常喜欢去商店' (Suka pergi belanja ke toko)."
                )
            )
        ),

        // Cerita Mandarin Bean 44: My Father (Ayah Saya) (我的爸爸)
        Story(
            id = "story_my_father",
            titleHanzi = "我的爸爸",
            titlePinyin = "Wǒ de Bàba",
            titleTranslation = "My Father (Ayah Saya)",
            level = "HSK 1",
            category = "Keluarga & Pendidikan",
            description = "Rutinitas harian seorang ayah yang berprofesi sebagai dosen universitas di Sichuan, mengajar dari pagi hingga sore dan gemar menikmati teh di malam hari.",
            coverEmoji = "👨‍🏫",
            coverImageRes = R.drawable.cover_story_my_father,
            estimatedReadMinutes = 2,
            sentences = listOf(
                Sentence(
                    "s_myfather_1",
                    "这是我的爸爸，今年55岁。他是一个老师，在四川的大学工作，星期一到星期五都要上班。他早上八点去学校，下午六点回家，吃饭以后喜欢喝茶，晚上十点睡觉。这是他的一天。",
                    "Zhè shì wǒ de bàba, jīnnián 55 suì. Tā shì yí gè lǎoshī, zài Sìchuān de dàxué gōngzuò, Xīngqīyī dào Xīngqīwǔ dōu yào shàng bān. Tā zǎoshang bā diǎn qù xuéxiào, xiàwǔ liù diǎn huí jiā, chī fàn yǐhòu xǐhuan hē chá, wǎnshang shí diǎn shuìjiào. Zhè shì tā de yì tiān.",
                    "Ini adalah ayah saya, tahun ini berusia 55 tahun. Beliau adalah seorang guru/dosen, bekerja di universitas di Sichuan, hari Senin sampai Jumat harus bekerja. Beliau pukul delapan pagi berangkat ke kampus, pukul enam sore pulang ke rumah, setelah makan suka minum teh, dan pukul sepuluh malam tidur. Inilah rutinitas satu hari beliau.",
                    listOf(
                        WordToken("这是", "zhè shì", "Ini adalah", "Pengenalan sosok"),
                        WordToken("我的爸爸", "wǒ de bàba", "Ayah saya", "Orang tua laki-laki"),
                        WordToken("今年55岁", "jīnnián 55 suì", "Tahun ini berusia 55 tahun", "Keterangan umur"),
                        WordToken("他是一个", "tā shì yí gè", "Beliau adalah seorang", "Identitas profesi"),
                        WordToken("老师", "lǎoshī", "Guru / dosen", "Pengajar universitas"),
                        WordToken("在四川的", "zài Sìchuān de", "Di Sichuan", "Lokasi provinsi Sichuan"),
                        WordToken("大学工作", "dàxué gōngzuò", "Bekerja di perguruan tinggi", "Kampus universitas"),
                        WordToken("星期一到", "Xīngqīyī dào", "Hari Senin sampai", "Rentang hari kerja"),
                        WordToken("星期五", "Xīngqīwǔ", "Hari Jumat", "Hari kerja kelima"),
                        WordToken("都要上班", "dōu yào shàng bān", "Semua harus masuk kerja", "Jadwal dinas rutin"),
                        WordToken("他早上", "tā zǎoshang", "Beliau pagi hari", "Waktu pagi"),
                        WordToken("八点去", "bā diǎn qù", "Pukul 8 pergi ke", "Jam keberangkatan"),
                        WordToken("学校", "xuéxiào", "Sekolah / kampus", "Tempat mengajar"),
                        WordToken("下午六点", "xiàwǔ liù diǎn", "Pukul 6 sore", "Waktu sore"),
                        WordToken("回家", "huí jiā", "Pulang ke rumah", "Kembali ke kediaman"),
                        WordToken("吃饭以后", "chī fàn yǐhòu", "Setelah selesai makan", "Usai santap malam"),
                        WordToken("喜欢喝茶", "xǐhuan hē chá", "Suka minum teh", "Hobi menikmati teh"),
                        WordToken("晚上十点", "wǎnshang shí diǎn", "Pukul 10 malam", "Jam malam"),
                        WordToken("睡觉", "shuìjiào", "Tidur", "Istirahat malam"),
                        WordToken("这是他的", "zhè shì tā de", "Inilah milik beliau", "Penunjuk kepemilikan"),
                        WordToken("一天", "yì tiān", "Satu hari", "Rutinitas harian")
                    )
                )
            ),
            questions = listOf(
                StoryQuestion(
                    "q_myfather_1",
                    "爸爸今年几岁？在什么地方工作？(Berapa usia ayah dan di mana beliau bekerja?)",
                    listOf(
                        "50岁，在医院 (50 tahun di RS)",
                        "55岁，在四川的大学工作 (55 tahun, bekerja di universitas di Sichuan)",
                        "60岁，在北京的高中 (60 tahun di SMA Beijing)",
                        "48岁，在上海的公司 (48 tahun di kantor Shanghai)"
                    ),
                    1,
                    "Teks menyebutkan: '今年55岁... 在四川的大学工作'."
                ),
                StoryQuestion(
                    "q_myfather_2",
                    "爸爸每周哪几天需要去学校上班？(Hari apa saja ayah harus pergi mengajar di kampus?)",
                    listOf(
                        "每天都要上班 (Setiap hari)",
                        "星期一到星期五 (Hari Senin sampai Jumat)",
                        "只有周末 (Hanya akhir pekan)",
                        "星期二和星期四 (Hanya Selasa dan Kamis)"
                    ),
                    1,
                    "Jadwal kerja ayah: '星期一到星期五都要上班' (Senin sampai Jumat)."
                ),
                StoryQuestion(
                    "q_myfather_3",
                    "爸爸吃完晚饭后喜欢做什么？(Apa yang suka dilakukan ayah setelah makan malam?)",
                    listOf(
                        "看电影 (Menonton film)",
                        "喜欢喝茶 (Suka minum teh hangat)",
                        "去公园散步 (Jalan-jalan ke taman)",
                        "做俯卧撑 (Olahraga)"
                    ),
                    1,
                    "Kebiasaan santai ayah: '吃饭以后喜欢喝茶' (Setelah makan suka minum teh)."
                ),
                StoryQuestion(
                    "q_myfather_4",
                    "爸爸通常在晚上几点上床睡觉？(Pukul berapa ayah biasanya tidur di malam hari?)",
                    listOf(
                        "晚上8点 (Jam 8 malam)",
                        "晚上9点 (Jam 9 malam)",
                        "晚上十点 (Pukul 10 malam)",
                        "午夜12点 (Tengah malam)"
                    ),
                    2,
                    "Jadwal istirahat: '晚上十点睡觉' (Pukul 10 malam tidur)."
                )
            )
        ),

        // Cerita Mandarin Bean 45: Wait for you in the car (Menunggumu di Mobil) (在车里等你)
        Story(
            id = "story_wait_in_the_car",
            titleHanzi = "在车里等你",
            titlePinyin = "Zài Chē Lǐ Děng Nǐ",
            titleTranslation = "Wait for you in the car (Menunggumu di Mobil)",
            level = "Fun, HSK 1",
            category = "Humor & Keluarga",
            description = "Anekdot kocak tentang anak yang merengek ingin pergi ke sekolah untuk bermain, tetapi begitu sampai malah menolak turun karena mobil ber-AC lebih sejuk dan nyaman.",
            coverEmoji = "🚗",
            coverImageRes = R.drawable.cover_story_wait_in_the_car,
            estimatedReadMinutes = 2,
            sentences = listOf(
                Sentence(
                    "s_waitcar_1",
                    "儿子想去学校玩。今天很热，车里开着空调，我们喝着可乐，到了学校，儿子对爸爸说：你自己去玩吧，我和妈妈在车里等你。",
                    "Érzi xiǎng qù xuéxiào wán. Jīntiān hěn rè, chē lǐ kāi zhe kōngtiáo, wǒmen hē zhe kělè, dào le xuéxiào, érzi duì bàba shuō: nǐ zìjǐ qù wán ba, wǒ hé māma zài chē lǐ děng nǐ.",
                    "Anak laki-laki ingin pergi bermain ke sekolah. Hari ini sangat panas, di dalam mobil menyala AC, kami meminum kola, begitu sampai di sekolah, anak berkata kepada ayahnya: Ayah saja yang pergi bermain sendiri ya, aku dan ibu menunggumu di mobil.",
                    listOf(
                        WordToken("儿子", "érzi", "Anak laki-laki", "Subjek putra"),
                        WordToken("想去", "xiǎng qù", "Ingin pergi ke", "Niat berangkat"),
                        WordToken("学校", "xuéxiào", "Sekolah", "Tempat bermain sekolah"),
                        WordToken("玩", "wán", "Bermain", "Aktivitas rekreasi"),
                        WordToken("今天", "jīntiān", "Hari ini", "Keterangan waktu"),
                        WordToken("很热", "hěn rè", "Sangat panas terik", "Suhu udara panas"),
                        WordToken("车里", "chē lǐ", "Di dalam mobil", "Ruang interior mobil"),
                        WordToken("开着", "kāi zhe", "Menyala / dihidupkan", "Status AC menyala"),
                        WordToken("空调", "kōngtiáo", "AC / pendingin ruangan", "Pendingin udara mobil"),
                        WordToken("我们", "wǒmen", "Kami", "Pronomina jamak"),
                        WordToken("喝着", "hē zhe", "Meminum", "Menyeruput minuman"),
                        WordToken("可乐", "kělè", "Kola", "Minuman bersoda segar"),
                        WordToken("到了", "dào le", "Tiba di", "Sampai di tujuan"),
                        WordToken("学校", "xuéxiào", "Sekolah", "Gerbang sekolah"),
                        WordToken("儿子", "érzi", "Putra", "Subjek anak"),
                        WordToken("对爸爸", "duì bàba", "Kepada ayah", "Arah tutur"),
                        WordToken("说", "shuō", "Berkata", "Kata kerja tutur"),
                        WordToken("你自己", "nǐ zìjǐ", "Ayah sendiri saja", "Menyuruh ayah sendiri"),
                        WordToken("去玩吧", "qù wán ba", "Pergi main ya", "Partikel saran"),
                        WordToken("我和妈妈", "wǒ hé māma", "Saya dan ibu", "Anak dan ibu"),
                        WordToken("在车里", "zài chē lǐ", "Di dalam mobil", "Lokasi tetap di mobil"),
                        WordToken("等你", "děng nǐ", "Menunggumu", "Menunggu ayah selesai bermain")
                    )
                )
            ),
            questions = listOf(
                StoryQuestion(
                    "q_waitcar_1",
                    "一开始是谁闹着想去学校玩的？(Awalnya siapa yang merengek ingin pergi ke sekolah untuk bermain?)",
                    listOf(
                        "爸爸 (Ayah)",
                        "儿子 (Anak laki-laki)",
                        "妈妈 (Ibu)",
                        "老师 (Guru)"
                    ),
                    1,
                    "Teks menyatakan: '儿子想去学校玩' (Anak laki-laki ingin pergi ke sekolah bermain)."
                ),
                StoryQuestion(
                    "q_waitcar_2",
                    "今天的天气和车里的环境是怎样的？(Bagaimana cuaca hari ini dan suasana di dalam mobil?)",
                    listOf(
                        "天气很冷，车里开着暖气 (Cuaca dingin menyalakan pemanas)",
                        "天气很热，车里开着空调还喝着可乐 (Cuaca sangat panas, di dalam mobil ber-AC sejuk dan minum kola)",
                        "天下着大雨 (Hujan deras)",
                        "车里空调坏了 (AC mobil rusak)"
                    ),
                    1,
                    "Kenyamanan di dalam mobil: '今天很热，车里开着空调，我们喝着可乐'."
                ),
                StoryQuestion(
                    "q_waitcar_3",
                    "到了学校门口后，儿子对爸爸说了什么让人哭笑不得的话？(Sampai di sekolah, apa yang dikatakan anak kepada ayahnya?)",
                    listOf(
                        "爸爸快点跑 (Ayah cepat lari)",
                        "你自己去玩吧，我和妈妈在车里等你 (Ayah pergi main sendiri saja ya, aku dan ibu nunggu di mobil)",
                        "我想回家 (Aku ingin pulang)",
                        "买两瓶水 (Beli 2 botol air)"
                    ),
                    1,
                    "Ucapan kocak sang anak: '你自己去玩吧，我和妈妈在车里等你'."
                ),
                StoryQuestion(
                    "q_waitcar_4",
                    "儿子为什么突然改变主意不肯下车了？(Mengapa anak itu tiba-tiba berubah pikiran menolak turun mobil?)",
                    listOf(
                        "Karena di luar panas terik, sedangkan di dalam mobil ada AC sejuk dan minuman kola yang jauh lebih nyaman daripada bermain!",
                        "Karena takut guru",
                        "Karena lupa bawa sepatu",
                        "Karena sekolah tutup"
                    ),
                    0,
                    "Puncak humor: anak yang merengek minta jalan-jalan, malah mager di mobil ber-AC dan menyuruh ayahnya bermain sendirian di luar!"
                )
            )
        ),

        // Cerita Mandarin Bean 46: Tongue Twister: four and ten (Latihan Nada: Empat dan Sepuluh) (四和十)
        Story(
            id = "story_tongue_twister_four_ten",
            titleHanzi = "四和十",
            titlePinyin = "Sì Hé Shí",
            titleTranslation = "Tongue Twister: four and ten (Latihan Nada: Empat dan Sepuluh)",
            level = "Fun, HSK 1",
            category = "Linguistik & Pelafalan",
            description = "Permainan pelafalan lidah klasik Tiongkok untuk melatih kepekaan nada dan inisial sibilan antara angka 4 (sì) dan 10 (shí).",
            coverEmoji = "🗣️",
            coverImageRes = R.drawable.cover_story_tongue_twister_four_ten,
            estimatedReadMinutes = 2,
            sentences = listOf(
                Sentence(
                    "s_twister_1",
                    "四是四，十是十，十四是十四，四十是四十，四和十、十和四，四十和四十，十四和十四。请你来，试一试。",
                    "Sì shì sì, shí shì shí, shísì shì shísì, sìshí shì sìshí, sì hé shí, shí hé sì, sìshí hé sìshí, shísì hé shísì. Qǐng nǐ lái, shì yí shì.",
                    "Empat adalah empat, sepuluh adalah sepuluh, empat belas adalah empat belas, empat puluh adalah empat puluh, empat dan sepuluh, sepuluh dan empat, empat puluh dan empat puluh, empat belas dan empat belas. Silakan kamu coba ya.",
                    listOf(
                        WordToken("四是四", "sì shì sì", "Empat adalah empat", "Bunyi nada sibilan sì"),
                        WordToken("十是十", "shí shì shí", "Sepuluh adalah sepuluh", "Bunyi nada retrofleks shí"),
                        WordToken("十四", "shísì", "Empat belas", "Angka 14"),
                        WordToken("是十四", "shì shísì", "Adalah 14", "Penegasan 14"),
                        WordToken("四十", "sìshí", "Empat puluh", "Angka 40"),
                        WordToken("是四十", "shì sìshí", "Adalah 40", "Penegasan 40"),
                        WordToken("四和十", "sì hé shí", "Empat dan sepuluh", "Kombinasi 4 dan 10"),
                        WordToken("十和四", "shí hé sì", "Sepuluh dan empat", "Kombinasi 10 dan 4"),
                        WordToken("四十和四十", "sìshí hé sìshí", "Empat puluh dan empat puluh", "Kombinasi 40 dan 40"),
                        WordToken("十四和十四", "shísì hé shísì", "Empat belas dan empat belas", "Kombinasi 14 dan 14"),
                        WordToken("请你来", "qǐng nǐ lái", "Silakan kamu datang / coba", "Undangan santun"),
                        WordToken("试一试", "shì yí shì", "Mencoba melafalkannya", "Uji coba pelafalan lidah")
                    )
                )
            ),
            questions = listOf(
                StoryQuestion(
                    "q_twister_1",
                    "这首绕口令主要训练哪两个数字的发音区别？(Latihan lidah ini melatih perbedaan bunyi pelafalan antara dua angka apa?)",
                    listOf(
                        "一和二 (1 dan 2)",
                        "四和十 (4 dan 10)",
                        "五和八 (5 dan 8)",
                        "六和七 (6 dan 7)"
                    ),
                    1,
                    "Fokus utama adalah membedakan nada 'sì' (angka 4) dan 'shí' (angka 10)."
                ),
                StoryQuestion(
                    "q_twister_2",
                    "中文数字“14”和“40”的正确拼音分别是什么？(Apa pinyin yang benar untuk angka 14 dan 40?)",
                    listOf(
                        "shísì 和 sìshí (14 = shísì, 40 = sìshí)",
                        "sìshí 和 shísì",
                        "shíshí 和 sìsì",
                        "sìsì 和 shíshí"
                    ),
                    0,
                    "14 adalah shísì (sepuluh empat), 40 adalah sìshí (empat sepuluh)."
                ),
                StoryQuestion(
                    "q_twister_3",
                    "为什么很多外国初学者觉得“四”和“十”很难念？(Mengapa banyak pemula merasa pelafalan '4' dan '10' menantang?)",
                    listOf(
                        "因为汉字笔画太多 (Karena goresan terlalu banyak)",
                        "因为平舌音s与翘舌音sh容易混淆，且声调第四声与第二声需要精准切换 (Karena sibilan dental s dan retrofleks sh serta nada 4 dan 2 menuntut kepekaan lidah yang tepat)",
                        "因为发音太慢 (Karena lafal lambat)",
                        "因为意思完全一样 (Karena artinya sama)"
                    ),
                    1,
                    "Tantangan fonetik: kontras antara 's' datar nada 4 dengan 'sh' melengkung nada 2."
                ),
                StoryQuestion(
                    "q_twister_4",
                    "文章最后一句话“请你来，试一试”是什么意思？(Apa arti ajakan penutup 'qǐng nǐ lái, shì yí shì'?)",
                    listOf(
                        "Silakan kamu datang untuk mencoba melafalkannya!",
                        "Jangan coba-coba",
                        "Silakan kamu tidur",
                        "Tolong beli empat buah"
                    ),
                    0,
                    "Ajakan interaktif ramah: mengajak pembaca mencoba melatih lidah membaca cepat!"
                )
            )
        ),

        // Cerita Mandarin Bean 47: Leap Year (Tahun Kabisat) (闰年)
        Story(
            id = "story_leap_year",
            titleHanzi = "闰年",
            titlePinyin = "Rùnnián",
            titleTranslation = "Leap Year (Tahun Kabisat)",
            level = "Culture, HSK 1",
            category = "Budaya & Pengetahuan",
            description = "Penjelasan edukatif yang sederhana dan mudah dipahami tentang perbedaan jumlah hari antara tahun biasa (平年) dan tahun kabisat (闰年).",
            coverEmoji = "📅",
            coverImageRes = R.drawable.cover_story_leap_year,
            estimatedReadMinutes = 2,
            sentences = listOf(
                Sentence(
                    "s_leapyear_1",
                    "我们都知道，一年有12个月，365天。有365天的这一年，我们叫“平年”。有时候，一年有366天，这一年叫“闰年”。每四年有一个闰年。闰年的二月有二十九天，平年的二月有二十八天。",
                    "Wǒmen dōu zhīdào, yì nián yǒu 12 gè yuè, 365 tiān. Yǒu 365 tiān de zhè yì nián, wǒmen jiào “píngnián”. Yǒushíhou, yì nián yǒu 366 tiān, zhè yì nián jiào “rùnnián”. Měi sì nián yǒu yí gè rùnnián. Rùnnián de èr yuè yǒu èrshíjiǔ tiān, píngnián de èr yuè yǒu èrshíbā tiān.",
                    "Kita semua tahu, satu tahun memiliki 12 bulan dan 365 hari. Tahun yang memiliki 365 hari, kita sebut 'tahun biasa' (pingnian). Kadang-kadang, satu tahun memiliki 366 hari, tahun ini disebut 'tahun kabisat' (runnian). Setiap empat tahun terdapat satu tahun kabisat. Bulan Februari pada tahun kabisat memiliki 29 hari, sedangkan bulan Februari pada tahun biasa memiliki 28 hari.",
                    listOf(
                        WordToken("我们", "wǒmen", "Kita", "Pronomina jamak"),
                        WordToken("都知道", "dōu zhīdào", "Semua tahu", "Pengetahuan umum"),
                        WordToken("一年有", "yì nián yǒu", "Satu tahun ada", "Satuan waktu tahun"),
                        WordToken("12个月", "shí'èr gè yuè", "12 bulan", "Jumlah bulan setahun"),
                        WordToken("365天", "sānbǎi liùshíwǔ tiān", "365 hari", "Hari tahun biasa"),
                        WordToken("有365天的", "yǒu 365 tiān de", "Yang memiliki 365 hari", "Kategori tahun"),
                        WordToken("这一年", "zhè yì nián", "Tahun ini", "Tahun tersebut"),
                        WordToken("我们叫", "wǒmen jiào", "Kita sebut", "Penamaan istilah"),
                        WordToken("平年", "píngnián", "Tahun biasa", "Tahun standar 365 hari"),
                        WordToken("有时候", "yǒushíhou", "Kadang-kadang", "Keterangan frekuensi"),
                        WordToken("一年有", "yì nián yǒu", "Satu tahun ada", "Satuan tahun"),
                        WordToken("366天", "sānbǎi liùshíliù tiān", "366 hari", "Hari tahun kabisat"),
                        WordToken("这一年叫", "zhè yì nián jiào", "Tahun ini disebut", "Penamaan istilah"),
                        WordToken("闰年", "rùnnián", "Tahun kabisat", "Tahun kabisat 366 hari"),
                        WordToken("每四年", "měi sì nián", "Setiap empat tahun", "Interval siklus"),
                        WordToken("有一个", "yǒu yí gè", "Ada satu kali", "Satu kali periode"),
                        WordToken("闰年", "rùnnián", "Tahun kabisat", "Tahun kabisat"),
                        WordToken("闰年的", "rùnnián de", "Milik tahun kabisat", "Spesifikasi kabisat"),
                        WordToken("二月有", "èr yuè yǒu", "Bulan Februari ada", "Bulan kedua"),
                        WordToken("二十九天", "èrshíjiǔ tiān", "29 hari", "Hari ekstra Februari"),
                        WordToken("平年的", "píngnián de", "Milik tahun biasa", "Spesifikasi tahun biasa"),
                        WordToken("二月有", "èr yuè yǒu", "Bulan Februari ada", "Bulan kedua"),
                        WordToken("二十八天", "èrshíbā tiān", "28 hari", "Hari normal Februari")
                    )
                )
            ),
            questions = listOf(
                StoryQuestion(
                    "q_leapyear_1",
                    "一年一般有多少个月，多少天？(Satu tahun umumnya memiliki berapa bulan dan berapa hari?)",
                    listOf(
                        "10个月，300天",
                        "12个月，365天 (12 bulan, 365 hari)",
                        "13个月，366天",
                        "12个月，380天"
                    ),
                    1,
                    "Teks menyatakan: '我们都知道，一年有12个月，365天'."
                ),
                StoryQuestion(
                    "q_leapyear_2",
                    "在中文里，有365天的那一年被称为什么？(Tahun dengan 365 hari disebut apa dalam bahasa Mandarin?)",
                    listOf(
                        "平年 (Píngnián / Tahun biasa)",
                        "闰年 (Tahun kabisat)",
                        "新年 (Tahun baru)",
                        "过年 (Tahun festival)"
                    ),
                    0,
                    "Istilah bahasa Mandarin untuk tahun 365 hari: '我们叫“平年”'."
                ),
                StoryQuestion(
                    "q_leapyear_3",
                    "每隔多少年会出现一次“闰年”？(Setiap berapa tahun sekali tahun kabisat muncul?)",
                    listOf(
                        "每年一次 (Tiap tahun)",
                        "每两年 (Tiap 2 tahun)",
                        "每四年 (Tiap 4 tahun sekali)",
                        "每十年 (Tiap 10 tahun)"
                    ),
                    2,
                    "Teks menjelaskan siklusnya: '每四年有一个闰年' (Setiap 4 tahun ada 1 tahun kabisat)."
                ),
                StoryQuestion(
                    "q_leapyear_4",
                    "闰年和平年的二月份分别有多少天？(Bulan Februari pada tahun kabisat dan tahun biasa masing-masing ada berapa hari?)",
                    listOf(
                        "闰年28天，平年29天",
                        "闰年29天，平年28天 (Kabisat 29 hari, tahun biasa 28 hari)",
                        "都是30天",
                        "都是31天"
                    ),
                    1,
                    "Perbedaan mendasar Februari: '闰年的二月有二十九天，平年的二月有二十八天'."
                )
            )
        ),

        // Cerita Mandarin Bean 48: One of my days (Keseharianku) (我的一天)
        Story(
            id = "story_one_of_my_days",
            titleHanzi = "我的一天",
            titlePinyin = "Wǒ de Yì Tiān",
            titleTranslation = "One of my days (Keseharianku)",
            level = "HSK 1",
            category = "Rutinitas & Belajar",
            description = "Cerita seorang pelajar yang bangun pagi, les bahasa Mandarin bersama gurunya di kafe, dan makan malam bersama keluarga di rumah.",
            coverEmoji = "☕",
            coverImageRes = R.drawable.cover_story_one_of_my_days,
            estimatedReadMinutes = 2,
            sentences = listOf(
                Sentence(
                    "s_oneday_1",
                    "我今天7点起床吃东西，9点去学校上课。我的汉语不好，下午汉语老师帮助我学习，我们一起喝咖啡学习汉语。很谢谢我的汉语老师，现在都懂了。晚上6点，我回家和爸爸妈妈吃饭。今天不想看书了，睡觉吧！",
                    "Wǒ jīntiān 7 diǎn qǐchuáng chī dōngxi, 9 diǎn qù xuéxiào shàng kè. Wǒ de Hànyǔ bù hǎo, xiàwǔ Hànyǔ lǎoshī bāngzhù wǒ xuéxí, wǒmen yìqǐ hē kāfēi xuéxí Hànyǔ. Hěn xièxie wǒ de Hànyǔ lǎoshī, xiànzài dōu dǒng le. Wǎnshang 6 diǎn, wǒ huí jiā hé bàba māma chī fàn. Jīntiān bù xiǎng kàn shū le, shuìjiào ba!",
                    "Saya hari ini bangun jam 7 makan sarapan, jam 9 pergi ke sekolah mengikuti pelajaran. Bahasa Mandarin saya kurang bagus, siang hari guru bahasa Mandarin membantu saya belajar, kami bersama-sama minum kopi sambil belajar bahasa Mandarin. Sangat berterima kasih kepada guru bahasa Mandarin saya, sekarang saya sudah paham semua. Jam 6 sore, saya pulang ke rumah makan bersama ayah dan ibu. Hari ini sudah tidak ingin membaca buku lagi, ayo tidur saja!",
                    listOf(
                        WordToken("我今天", "wǒ jīntiān", "Saya hari ini", "Subjek + waktu"),
                        WordToken("7点", "qī diǎn", "Pukul 7", "Jam 7 pagi"),
                        WordToken("起床", "qǐchuáng", "Bangun tidur", "Aktivitas bangun pagi"),
                        WordToken("吃东西", "chī dōngxi", "Sarapan makan", "Santap pagi"),
                        WordToken("9点", "jiǔ diǎn", "Pukul 9", "Jam 9 pagi"),
                        WordToken("去学校", "qù xuéxiào", "Pergi ke sekolah", "Keberangkatan ke sekolah"),
                        WordToken("上课", "shàng kè", "Masuk kelas / belajar", "Jam pelajaran"),
                        WordToken("我的汉语", "wǒ de Hànyǔ", "Bahasa Mandarin saya", "Kemampuan bahasa Mandarin"),
                        WordToken("不好", "bù hǎo", "Kurang bagus", "Kondisi belum lancar"),
                        WordToken("下午", "xiàwǔ", "Siang / sore hari", "Waktu sore"),
                        WordToken("汉语老师", "Hànyǔ lǎoshī", "Guru bahasa Mandarin", "Pengajar bahasa Mandarin"),
                        WordToken("帮助我", "bāngzhù wǒ", "Membantu saya", "Memberikan bimbingan"),
                        WordToken("学习", "xuéxí", "Belajar", "Studi materi"),
                        WordToken("我们", "wǒmen", "Kami", "Pronomina jamak"),
                        WordToken("一起喝咖啡", "yìqǐ hē kāfēi", "Minum kopi bersama", "Bersantai minum kopi"),
                        WordToken("学习汉语", "xuéxí Hànyǔ", "Belajar bahasa Mandarin", "Mempelajari bahasa"),
                        WordToken("很谢谢", "hěn xièxie", "Sangat berterima kasih", "Rasa terima kasih mendalam"),
                        WordToken("我的汉语老师", "wǒ de Hànyǔ lǎoshī", "Guru Mandarin saya", "Sosok guru"),
                        WordToken("现在", "xiànzài", "Sekarang", "Waktu saat ini"),
                        WordToken("都懂了", "dōu dǒng le", "Semua sudah paham", "Pemahaman tuntas"),
                        WordToken("晚上6点", "wǎnshang liù diǎn", "Pukul 6 malam / petang", "Jam 6 petang"),
                        WordToken("我回家", "wǒ huí jiā", "Saya pulang ke rumah", "Tiba di rumah"),
                        WordToken("和爸爸妈妈", "hé bàba māma", "Bersama ayah dan ibu", "Keluarga inti"),
                        WordToken("吃饭", "chī fàn", "Makan bersama", "Santap malam"),
                        WordToken("今天", "jīntiān", "Hari ini", "Keterangan waktu"),
                        WordToken("不想看书了", "bù xiǎng kàn shū le", "Sudah tidak ingin membaca buku lagi", "Rasa lelah belajar"),
                        WordToken("睡觉吧", "shuìjiào ba", "Ayo tidur saja!", "Istirahat tidur malam")
                    )
                )
            ),
            questions = listOf(
                StoryQuestion(
                    "q_oneday_1",
                    "作者早上几点起床，几点去学校上课？(Pukul berapa penulis bangun pagi dan masuk kelas di sekolah?)",
                    listOf(
                        "6点起床，8点上课",
                        "7点起床吃东西，9点去学校上课 (Bangun jam 7, ke sekolah jam 9)",
                        "8点起床，10点上课",
                        "9点起床，11点上课"
                    ),
                    1,
                    "Teks menyatakan: '我今天7点起床吃东西，9点去学校上课'."
                ),
                StoryQuestion(
                    "q_oneday_2",
                    "下午汉语老师是如何帮助作者学习的？(Bagaimana guru Mandarin membantu penulis belajar di sore hari?)",
                    listOf(
                        "一起喝咖啡学习汉语 (Bersama-sama minum kopi sambil belajar Mandarin)",
                        "去图书馆写大量作业 (Ke perpustakaan buat banyak PR)",
                        "看中文电影 (Nonton film Mandarin)",
                        "考试测验 (Mengadakan ujian)"
                    ),
                    0,
                    "Suasana belajar yang nyaman: '我们一起喝咖啡学习汉语' (Kami minum kopi sambil belajar)."
                ),
                StoryQuestion(
                    "q_oneday_3",
                    "晚上6点作者回家和谁一起吃晚饭？(Pukul 6 petang penulis pulang ke rumah makan malam bersama siapa?)",
                    listOf(
                        "和同学朋友 (Bersama teman sekelas)",
                        "和爸爸妈妈 (Bersama ayah dan ibu)",
                        "和老师 (Bersama guru)",
                        "自己一个人吃 (Makan sendirian)"
                    ),
                    1,
                    "Teks menyebutkan: '晚上6点，我回家和爸爸妈妈吃饭'."
                ),
                StoryQuestion(
                    "q_oneday_4",
                    "吃完晚饭后作者打算做什么？(Apa rencana penulis setelah selesai makan malam?)",
                    listOf(
                        "继续读中文书 (Lanjut membaca buku)",
                        "不想看书了，打算睡觉 (Sudah tidak ingin membaca buku lagi, langsung bersiap tidur)",
                        "去外面散步 (Jalan-jalan keluar)",
                        "看电视打游戏 (Nonton TV dan main game)"
                    ),
                    1,
                    "Penutup hari: '今天不想看书了，睡觉吧！' (Hari ini tidak mau baca buku lagi, ayo tidur saja!)."
                )
            )
        ),

        // Cerita Mandarin Bean 49: The birthdays of children (Ulang Tahun Anak-anak) (孩子的生日)
        Story(
            id = "story_birthdays_of_children",
            titleHanzi = "孩子的生日",
            titlePinyin = "Háizi de Shēngrì",
            titleTranslation = "The birthdays of children (Ulang Tahun Anak-anak)",
            level = "HSK 1",
            category = "Keluarga & Persahabatan",
            description = "Kisah pertemanan dua orang tua yang sama-sama memiliki anak dan sedang memikirkan hadiah terbaik untuk ulang tahun putra temannya yang sebentar lagi tiba.",
            coverEmoji = "🎉",
            coverImageRes = R.drawable.cover_story_birthdays_of_children,
            estimatedReadMinutes = 2,
            sentences = listOf(
                Sentence(
                    "s_bdaychild_1",
                    "我和我的好朋友都有孩子，我有一个女儿，她有一个儿子。我的女儿在2017年2月16日星期四出生。朋友的儿子生日是6月30日。他的生日快到了，不知道他想要什么礼物呢？",
                    "Wǒ hé wǒ de hǎo péngyou dōu yǒu háizi, wǒ yǒu yí gè nǚ'ér, tā yǒu yí gè érzi. Wǒ de nǚ'ér zài 2017 nián 2 yuè 16 rì Xīngqīsì chūshēng. Péngyou de érzi shēngrì shì 6 yuè 30 rì. Tā de shēngrì kuài dào le, bù zhīdào tā xiǎng yào shénme lǐwù ne?",
                    "Saya dan sahabat baik saya sama-sama memiliki anak, saya mempunyai seorang anak perempuan, dan dia mempunyai seorang anak laki-laki. Anak perempuan saya lahir pada hari Kamis, 16 Februari 2017. Ulang tahun putra teman saya adalah tanggal 30 Juni. Ulang tahunnya sudah hampir tiba, tidak tahu kado apa yang dia inginkan ya?",
                    listOf(
                        WordToken("我和我的", "wǒ hé wǒ de", "Saya dan milik saya", "Subjek penutur"),
                        WordToken("好朋友", "hǎo péngyou", "Sahabat baik", "Kawan karib"),
                        WordToken("都有孩子", "dōu yǒu háizi", "Semua memiliki anak", "Status keluarga sama-sama punya momongan"),
                        WordToken("我有一个", "wǒ yǒu yí gè", "Saya memiliki seorang", "Keluarga penutur"),
                        WordToken("女儿", "nǚ'ér", "Anak perempuan", "Putri kandung"),
                        WordToken("她有一个", "tā yǒu yí gè", "Dia memiliki seorang", "Keluarga sahabat"),
                        WordToken("儿子", "érzi", "Anak laki-laki", "Putra kandung"),
                        WordToken("我的女儿", "wǒ de nǚ'ér", "Putri saya", "Subjek anak perempuan"),
                        WordToken("在2017年", "zài 2017 nián", "Pada tahun 2017", "Tahun 2017"),
                        WordToken("2月16日", "èr yuè shíliù rì", "16 Februari", "Tanggal 16 Feb"),
                        WordToken("星期四", "Xīngqīsì", "Hari Kamis", "Hari ke-4"),
                        WordToken("出生", "chūshēng", "Lahir", "Kelahiran anak"),
                        WordToken("朋友的儿子", "péngyou de érzi", "Putra teman", "Anak sahabat"),
                        WordToken("生日是", "shēngrì shì", "Hari ulang tahun adalah", "Tanggal lahir"),
                        WordToken("6月30日", "liù yuè sānshí rì", "30 Juni", "Tanggal 30 Juni"),
                        WordToken("他的生日", "tā de shēngrì", "Hari ulang tahunnya", "Ultah sang anak"),
                        WordToken("快到了", "kuài dào le", "Hampir tiba / segera tiba", "Waktu yang mendekat"),
                        WordToken("不知道", "bù zhīdào", "Tidak tahu", "Rasa penasaran"),
                        WordToken("他想要", "tā xiǎng yào", "Dia menginginkan", "Harapan keinginan anak"),
                        WordToken("什么礼物", "shénme lǐwù", "Hadiah / kado apa", "Barang kado bingkisan"),
                        WordToken("呢", "ne", "Ya?", "Partikel tanya penasaran")
                    )
                )
            ),
            questions = listOf(
                StoryQuestion(
                    "q_bdaychild_1",
                    "作者和她的好朋友分别有什么孩子？(Anak apa yang dimiliki oleh penulis dan sahabatnya masing-masing?)",
                    listOf(
                        "两人都有两个儿子 (Keduanya punya 2 putra)",
                        "作者有一个女儿，朋友有一个儿子 (Penulis punya seorang putri, temannya punya seorang putra)",
                        "两人都是双胞胎 (Keduanya kembar)",
                        "都还没有孩子 (Belum punya anak)"
                    ),
                    1,
                    "Teks menyatakan: '我有一个女儿，她有一个儿子'."
                ),
                StoryQuestion(
                    "q_bdaychild_2",
                    "作者的女儿出生在哪一天？(Kapan tanggal kelahiran putri penulis?)",
                    listOf(
                        "2016年1月1日",
                        "2017年2月16日星期四 (Kamis, 16 Februari 2017)",
                        "2017年6月30日",
                        "2018年3月15日"
                    ),
                    1,
                    "Rincian tanggal lahir putri: '我的女儿在2017年2月16日星期四出生'."
                ),
                StoryQuestion(
                    "q_bdaychild_3",
                    "朋友的儿子生日是在哪一天？(Kapan hari ulang tahun putra sahabat penulis?)",
                    listOf(
                        "2月16日",
                        "5月1日",
                        "6月30日 (30 Juni)",
                        "10月1日"
                    ),
                    2,
                    "Teks menyebutkan: '朋友的儿子生日是6月30日'."
                ),
                StoryQuestion(
                    "q_bdaychild_4",
                    "随着朋友儿子的生日临近，作者正在思考什么？(Menjelang ultah putra temannya, apa yang sedang dipikirkan penulis?)",
                    listOf(
                        "买什么衣服 (Beli baju apa)",
                        "不知道他想要什么生日礼物 (Sedang memikirkan hadiah kado apa yang diinginkannya)",
                        "去哪家饭馆庆祝 (Restoran mana untuk pesta)",
                        "买多大的蛋糕 (Berapa besar kuenya)"
                    ),
                    1,
                    "Penulis memikirkan kado terbaik: '他的生日快到了，不知道他想要什么礼物呢？'."
                )
            )
        ),

        // Cerita Mandarin Bean 50: Be late again (Terlambat Lagi) (又迟到了)
        Story(
            id = "story_be_late_again",
            titleHanzi = "又迟到了",
            titlePinyin = "Yòu Chídào Le",
            titleTranslation = "Be late again (Terlambat Lagi)",
            level = "HSK 1",
            category = "Humor & Transportasi",
            description = "Cerita lucu tentang Yang Chen yang selalu terlambat ke sekolah naik taksi macet, dan saat liburan ke Shanghai naik pesawat pun tetap terlambat karena cuaca buruk.",
            coverEmoji = "✈️",
            coverImageRes = R.drawable.cover_story_be_late_again,
            estimatedReadMinutes = 2,
            sentences = listOf(
                Sentence(
                    "s_belate_1",
                    "我和杨陈是2017年9月在学校认识的，他是我同学。他每天坐出租车去学校，我走去学校，每天车很多，他常常迟到。今年我们去上海旅游，他坐飞机，我坐火车，天气不好，飞机晚了，他又迟到了。",
                    "Wǒ hé Yáng Chén shì 2017 nián 9 yuè zài xuéxiào rènshi de, tā shì wǒ tóngxué. Tā měitiān zuò chūzūchē qù xuéxiào, wǒ zǒu qù xuéxiào, měitiān chē hěn duō, tā chángcháng chídào. Jīnnián wǒmen qù Shànghǎi lǚyóu, tā zuò fēijī, wǒ zuò huǒchē, tiānqì bù hǎo, fēijī wǎn le, tā yòu chídào le.",
                    "Saya dan Yang Chen saling mengenal di sekolah pada bulan September 2017, dia adalah teman sekelas saya. Dia setiap hari naik taksi ke sekolah, sedangkan saya berjalan kaki ke sekolah, setiap hari lalu lintas macet mobil banyak, dia sering terlambat. Tahun ini kami pergi berwisata ke Shanghai, dia naik pesawat terbang dan saya naik kereta api, cuaca buruk sehingga pesawat tertunda, dan dia pun terlambat lagi.",
                    listOf(
                        WordToken("我和", "wǒ hé", "Saya dan", "Pronomina + penghubung"),
                        WordToken("杨陈", "Yáng Chén", "Yang Chen", "Nama teman sekelas"),
                        WordToken("是2017年", "shì 2017 nián", "Adalah tahun 2017", "Waktu perkenalan"),
                        WordToken("9月", "jiǔ yuè", "Bulan September", "Bulan ke-9"),
                        WordToken("在学校", "zài xuéxiào", "Di sekolah", "Lokasi kampus/sekolah"),
                        WordToken("认识的", "rènshi de", "Berkenalan", "Menjalin perkenalan"),
                        WordToken("他是", "tā shì", "Dia adalah", "Kopula"),
                        WordToken("我同学", "wǒ tóngxué", "Teman sekelas saya", "Status kawan sekolah"),
                        WordToken("他每天", "tā měitiān", "Dia setiap hari", "Subjek + frekuensi harian"),
                        WordToken("坐出租车", "zuò chūzūchē", "Naik taksi", "Moda transportasi taksi"),
                        WordToken("去学校", "qù xuéxiào", "Pergi ke sekolah", "Tujuan perjalanan"),
                        WordToken("我走去", "wǒ zǒu qù", "Saya berjalan kaki ke", "Jalan kaki santai"),
                        WordToken("学校", "xuéxiào", "Sekolah", "Tujuan"),
                        WordToken("每天", "měitiān", "Setiap hari", "Frekuensi"),
                        WordToken("车很多", "chē hěn duō", "Mobil sangat banyak / macet", "Kepadatan lalu lintas"),
                        WordToken("他常常", "tā chángcháng", "Dia sering kali", "Frekuensi tinggi"),
                        WordToken("迟到", "chídào", "Terlambat", "Datang telat"),
                        WordToken("今年", "jīnnián", "Tahun ini", "Keterangan waktu"),
                        WordToken("我们去", "wǒmen qù", "Kami pergi ke", "Perjalanan wisata"),
                        WordToken("上海旅游", "Shànghǎi lǚyóu", "Wisata ke Shanghai", "Destinasi kota Shanghai"),
                        WordToken("他坐飞机", "tā zuò fēijī", "Dia naik pesawat terbang", "Moda penerbangan"),
                        WordToken("我坐火车", "wǒ zuò huǒchē", "Saya naik kereta api", "Moda kereta api darat"),
                        WordToken("天气不好", "tiānqì bù hǎo", "Cuaca tidak bagus / buruk", "Kondisi cuaca buruk"),
                        WordToken("飞机晚了", "fēijī wǎn le", "Pesawat terlambat / delay", "Penerbangan tertunda"),
                        WordToken("他又", "tā yòu", "Dia kembali lagi", "Pengulangan kejadian buruk"),
                        WordToken("迟到了", "chídào le", "Terlambat!", "Kondisi datang telat lagi")
                    )
                )
            ),
            questions = listOf(
                StoryQuestion(
                    "q_belate_1",
                    "作者和杨陈是什么时候在哪儿认识的？(Kapan dan di mana penulis dan Yang Chen berkenalan?)",
                    listOf(
                        "2015年在上海 (2015 di Shanghai)",
                        "2017年9月在学校 (September 2017 di sekolah)",
                        "2018年在火车上 (2018 di kereta)",
                        "2020年在飞机场 (2020 di bandara)"
                    ),
                    1,
                    "Teks menyebutkan: '我和杨陈是2017年9月在学校认识的'."
                ),
                StoryQuestion(
                    "q_belate_2",
                    "平时上学时，杨陈为什么常常迟到？(Saat hari sekolah biasa, mengapa Yang Chen sering terlambat?)",
                    listOf(
                        "因为他起不来床 (Karena tidak bisa bangun pagi)",
                        "因为他坐出租车，每天路上车很多容易堵车 (Karena dia naik taksi dan setiap hari macet banyak mobil)",
                        "因为他走得太慢 (Karena jalan kaki lambat)",
                        "因为学校太远 (Karena sekolah terlalu jauh)"
                    ),
                    1,
                    "Alasannya: '他每天坐出租车去学校... 每天车很多，他常常迟到'."
                ),
                StoryQuestion(
                    "q_belate_3",
                    "两人去上海旅游时各自选择了什么交通工具？(Alat transportasi apa yang dipilih masing-masing saat wisata ke Shanghai?)",
                    listOf(
                        "都坐飞机 (Keduanya naik pesawat)",
                        "杨陈坐飞机，作者坐火车 (Yang Chen naik pesawat, penulis naik kereta api)",
                        "都坐汽车 (Keduanya naik mobil)",
                        "骑自行车 (Naik sepeda)"
                    ),
                    1,
                    "Teks menyatakan: '他坐飞机，我坐火车' (Yang Chen naik pesawat, penulis naik kereta api)."
                ),
                StoryQuestion(
                    "q_belate_4",
                    "去上海旅游时为什么杨陈又迟到了？(Mengapa saat wisata ke Shanghai Yang Chen terlambat lagi?)",
                    listOf(
                        "因为天气不好导致飞机延误晚点 (Karena cuaca buruk membuat pesawatnya tertunda/delay!)",
                        "因为他错过了班车 (Ketinggalan bus)",
                        "因为他在机场迷路了 (Tersesat di bandara)",
                        "因为他忘记买票了 (Lupa beli tiket)"
                    ),
                    0,
                    "Nasib kocak Yang Chen: '天气不好，飞机晚了，他又迟到了' (Mau naik pesawat cepat pun tetap berakhir terlambat!)."
                )
            )
        ),

        // Cerita Mandarin Bean 51: Buy Clothes (Membeli Pakaian) (买衣服)
        Story(
            id = "story_buy_clothes",
            titleHanzi = "买衣服",
            titlePinyin = "Mǎi Yīfu",
            titleTranslation = "Buy Clothes (Membeli Pakaian)",
            level = "HSK 1",
            category = "Belanja & Kehidupan",
            description = "Pengalaman berbelanja pakaian dan buah bersama adik perempuan di toko, serta pertemuan ramah dengan Tuan Wang yang memuji pakaian barunya.",
            coverEmoji = "👗",
            coverImageRes = R.drawable.cover_story_buy_clothes,
            estimatedReadMinutes = 2,
            sentences = listOf(
                Sentence(
                    "s_buyclothes_1",
                    "昨天上午，我和妹妹去商店买东西了，很晚回家。她买了一点儿水果，我买了不少衣服。我还看见了王先生，他去学开车了。王先生说我买的新衣服很漂亮，我很高兴。",
                    "Zuótiān shàngwǔ, wǒ hé mèimei qù shāngdiàn mǎi dōngxi le, hěn wǎn huí jiā. Tā mǎi le yìdiǎnr shuǐguǒ, wǒ mǎi le bù shǎo yīfu. Wǒ hái kànjiàn le Wáng xiānsheng, tā qù xué kāi chē le. Wáng xiānsheng shuō wǒ mǎi de xīn yīfu hěn piàoliang, wǒ hěn gāoxìng.",
                    "Kemarin pagi, saya dan adik perempuan pergi ke toko berbelanja barang, dan pulang ke rumah sangat larut. Dia membeli sedikit buah, sedangkan saya membeli cukup banyak pakaian. Saya juga bertemu dengan Tuan Wang, dia pergi belajar menyetir mobil. Tuan Wang memuji baju baru yang saya beli sangat cantik, saya sangat senang.",
                    listOf(
                        WordToken("昨天上午", "zuótiān shàngwǔ", "Kemarin pagi", "Keterangan waktu kemarin"),
                        WordToken("我和妹妹", "wǒ hé mèimei", "Saya dan adik perempuan", "Subjek kakak beradik"),
                        WordToken("去商店", "qù shāngdiàn", "Pergi ke toko", "Tujuan tempat berbelanja"),
                        WordToken("买东西了", "mǎi dōngxi le", "Berbelanja barang", "Aktivitas belanja"),
                        WordToken("很晚回家", "hěn wǎn huí jiā", "Pulang ke rumah larut", "Waktu kepulangan malam"),
                        WordToken("她买了", "tā mǎi le", "Dia membeli", "Belanjaan adik"),
                        WordToken("一点儿", "yìdiǎnr", "Sedikit", "Kuantitas sedikit"),
                        WordToken("水果", "shuǐguǒ", "Buah-buahan", "Komoditas buah"),
                        WordToken("我买了", "wǒ mǎi le", "Saya membeli", "Belanjaan penutur"),
                        WordToken("不少", "bù shǎo", "Cukup banyak / tidak sedikit", "Kuantitas banyak"),
                        WordToken("衣服", "yīfu", "Pakaian / baju", "Pakaian busana"),
                        WordToken("我还看见了", "wǒ hái kànjiàn le", "Saya juga melihat", "Bertemu dengan orang lain"),
                        WordToken("王先生", "Wáng xiānsheng", "Tuan Wang", "Sosok kenalan pria"),
                        WordToken("他去学", "tā qù xué", "Dia pergi belajar", "Aktivitas kursus"),
                        WordToken("开车了", "kāi chē le", "Menyetir mobil", "Mengemudikan kendaraan"),
                        WordToken("王先生说", "Wáng xiānsheng shuō", "Tuan Wang berkata", "Tutur pujian"),
                        WordToken("我买的", "wǒ mǎi de", "Yang saya beli", "Barang belanjaan"),
                        WordToken("新衣服", "xīn yīfu", "Pakaian baru", "Baju baru"),
                        WordToken("很漂亮", "hěn piàoliang", "Sangat cantik / indah", "Pujian estetika"),
                        WordToken("我很高兴", "wǒ hěn gāoxìng", "Saya sangat gembira", "Perasaan bahagia")
                    )
                )
            ),
            questions = listOf(
                StoryQuestion(
                    "q_buyclothes_1",
                    "昨天上午作者和谁一起去商店买东西？(Kemarin pagi penulis pergi belanja ke toko bersama siapa?)",
                    listOf(
                        "和妈妈 (Bersama ibu)",
                        "和妹妹 (Bersama adik perempuan)",
                        "和王先生 (Bersama Tuan Wang)",
                        "和老师 (Bersama guru)"
                    ),
                    1,
                    "Teks menyatakan: '昨天上午，我和妹妹去商店买东西了'."
                ),
                StoryQuestion(
                    "q_buyclothes_2",
                    "妹妹和作者分别买了什么东西？(Apa barang yang dibeli oleh adik perempuan dan penulis masing-masing?)",
                    listOf(
                        "妹妹买了水果，作者买了不少衣服 (Adik beli sedikit buah, penulis beli banyak pakaian)",
                        "都买了衣服 (Keduanya beli baju)",
                        "都买了水果 (Keduanya beli buah)",
                        "买了电脑和手机 (Beli komputer dan HP)"
                    ),
                    0,
                    "Rincian belanjaan: '她买了一点儿水果，我买了不少衣服'."
                ),
                StoryQuestion(
                    "q_buyclothes_3",
                    "在商店附近，作者碰见了谁？他正在做什么？(Di sekitar toko, siapa yang ditemui penulis dan apa yang sedang dilakukannya?)",
                    listOf(
                        "碰见李医生去上班 (Bertemu dokter Li)",
                        "碰见了王先生，他去学开车了 (Bertemu Tuan Wang yang pergi belajar menyetir mobil)",
                        "碰见同学在买书 (Bertemu teman beli buku)",
                        "碰见警察在工作 (Bertemu polisi)"
                    ),
                    1,
                    "Teks menyebutkan: '我还看见了王先生，他去学开车了'."
                ),
                StoryQuestion(
                    "q_buyclothes_4",
                    "作者为什么感到非常高兴？(Mengapa penulis merasa sangat gembira?)",
                    listOf(
                        "因为衣服打了半折 (Karena dapat diskon)",
                        "因为王先生夸奖她买的新衣服很漂亮 (Karena Tuan Wang memuji pakaian barunya sangat cantik)",
                        "因为妹妹送了她礼物 (Karena dapat kado)",
                        "因为很快学会了开车 (Karena bisa nyetir)"
                    ),
                    1,
                    "Pujian ramah: '王先生说我买的新衣服很漂亮，我很高兴' (Tuan Wang bilang baju barunya sangat cantik!)."
                )
            )
        ),

        // Cerita Mandarin Bean 52: My Family (Keluargaku) (我的家)
        Story(
            id = "story_my_family_erica",
            titleHanzi = "我的家",
            titlePinyin = "Wǒ de Jiā",
            titleTranslation = "My Family (Keluargaku)",
            level = "HSK 1, Lifestyle",
            category = "Keluarga & Harmoni",
            description = "Perkenalan keluarga kecil Erica yang harmonis: suami berdarah Amerika seorang guru, dirinya dokter asal Tiongkok, putra lucu 2 tahun, dan seekor anjing kecil.",
            coverEmoji = "🏡",
            coverImageRes = R.drawable.cover_story_my_family_erica,
            estimatedReadMinutes = 2,
            sentences = listOf(
                Sentence(
                    "s_myfamerica_1",
                    "我是Erica，我的中文名字叫杨陈。我家有三口人，丈夫、儿子和我。",
                    "Wǒ shì Erica, wǒ de Zhōngwén míngzi jiào Yáng Chén. Wǒ jiā yǒu sān kǒu rén, zhàngfu, érzi hé wǒ.",
                    "Saya adalah Erica, nama Mandarin saya adalah Yang Chen. Keluarga saya memiliki tiga orang, suami, anak laki-laki, dan saya.",
                    listOf(
                        WordToken("我是", "wǒ shì", "Saya adalah", "Pengenalan diri"),
                        WordToken("Erica", "Erica", "Erica", "Nama Inggris"),
                        WordToken("我的中文名字", "wǒ de Zhōngwén míngzi", "Nama Mandarin saya", "Identitas nama Tionghoa"),
                        WordToken("叫杨陈", "jiào Yáng Chén", "Bernama Yang Chen", "Nama marga Yang Chen"),
                        WordToken("我家有", "wǒ jiā yǒu", "Keluarga saya ada", "Jumlah keluarga"),
                        WordToken("三口人", "sān kǒu rén", "Tiga orang anggota keluarga", "Penggolong kǒu untuk keluarga"),
                        WordToken("丈夫", "zhàngfu", "Suami", "Pasangan pria"),
                        WordToken("儿子和我", "érzi hé wǒ", "Anak laki-laki dan saya", "Putra dan diri sendiri")
                    )
                ),
                Sentence(
                    "s_myfamerica_2",
                    "我的丈夫是一个美国人，他是一个老师。我是中国人，我在医院工作，是一个医生。我们的儿子今年两岁了，很可爱。我们还有一只小狗。我很爱他们。你家呢？",
                    "Wǒ de zhàngfu shì yí gè Měiguó rén, tā shì yí gè lǎoshī. Wǒ shì Zhōngguó rén, wǒ zài yīyuàn gōngzuò, shì yí gè yīshēng. Wǒmen de érzi jīnnián liǎng suì le, hěn kě'ài. Wǒmen hái yǒu yì zhī xiǎo gǒu. Wǒ hěn ài tāmen. Nǐ jiā ne?",
                    "Suami saya adalah orang Amerika, dia adalah seorang guru. Saya adalah orang Tiongkok, saya bekerja di rumah sakit sebagai seorang dokter. Anak laki-laki kami tahun ini berumur dua tahun, sangat lucu. Kami juga memelihara seekor anjing kecil. Saya sangat mencintai mereka. Bagaimana dengan keluargamu?",
                    listOf(
                        WordToken("我的丈夫", "wǒ de zhàngfu", "Suami saya", "Sosok suami"),
                        WordToken("是一个", "shì yí gè", "Adalah seorang", "Kopula"),
                        WordToken("美国人", "Měiguó rén", "Orang Amerika", "Warga negara AS"),
                        WordToken("他是一个", "tā shì yí gè", "Dia adalah seorang", "Kopula"),
                        WordToken("老师", "lǎoshī", "Guru", "Profesi pendidik"),
                        WordToken("我是", "wǒ shì", "Saya adalah", "Kopula"),
                        WordToken("中国人", "Zhōngguó rén", "Orang Tiongkok", "Warga negara Tiongkok"),
                        WordToken("我在", "wǒ zài", "Saya di", "Preposisi lokasi kerja"),
                        WordToken("医院工作", "yīyuàn gōngzuò", "Bekerja di rumah sakit", "Tempat dinas medis"),
                        WordToken("是一个", "shì yí gè", "Adalah seorang", "Kopula"),
                        WordToken("医生", "yīshēng", "Dokter", "Profesi medis"),
                        WordToken("我们的儿子", "wǒmen de érzi", "Anak laki-laki kami", "Putra kandung"),
                        WordToken("今年两岁了", "jīnnián liǎng suì le", "Tahun ini berumur dua tahun", "Keterangan usia 2 tahun"),
                        WordToken("很可爱", "hěn kě'ài", "Sangat lucu / menggemaskan", "Karakter imut anak"),
                        WordToken("我们还有", "wǒmen hái yǒu", "Kami juga masih memiliki", "Tambahan peliharaan"),
                        WordToken("一只小狗", "yì zhī xiǎo gǒu", "Seekor anjing kecil", "Hewan piaraan"),
                        WordToken("我很爱他们", "wǒ hěn ài tāmen", "Saya sangat mencintai mereka", "Ungkapan kasih sayang mendalam"),
                        WordToken("你家呢", "nǐ jiā ne", "Bagaimana dengan keluargamu?", "Pertanyaan balik interaktif kepada pembaca")
                    )
                )
            ),
            questions = listOf(
                StoryQuestion(
                    "q_myfamerica_1",
                    "作者的中文名字叫什么？家里一共有几口人？(Siapa nama Mandarin penulis dan berapa anggota keluarganya?)",
                    listOf(
                        "李华，四口人",
                        "杨陈，三口人 (Yang Chen, 3 orang anggota keluarga)",
                        "王月，两口人",
                        "大卫，五口人"
                    ),
                    1,
                    "Teks menyebutkan: '我的中文名字叫杨陈。我家有三口人'."
                ),
                StoryQuestion(
                    "q_myfamerica_2",
                    "作者的丈夫是哪国人？从事什么职业？(Dari negara mana suami penulis dan apa profesinya?)",
                    listOf(
                        "中国人，医生 (Orang Tiongkok, dokter)",
                        "美国人，老师 (Orang Amerika, guru)",
                        "英国人，工程师 (Orang Inggris, insinyur)",
                        "日本人，司机 (Orang Jepang, supir)"
                    ),
                    1,
                    "Teks menyatakan: '我的丈夫是一个美国人，他是一个老师'."
                ),
                StoryQuestion(
                    "q_myfamerica_3",
                    "关于作者和她的孩子，以下哪个说法是正确的？(Mengenai penulis dan anaknya, manakah pernyataan yang benar?)",
                    listOf(
                        "作者是医院的医生，儿子两岁很可爱 (Penulis adalah dokter rumah sakit, putranya berumur 2 tahun sangat lucu)",
                        "作者是全职妈妈 (Ibu rumah tangga)",
                        "儿子今年五岁在上小学 (Anak 5 tahun sudah SD)",
                        "家里养了一只小猫 (Memelihara kucing)"
                    ),
                    0,
                    "Rincian keluarga: '我在医院工作，是一个医生。我们的儿子今年两岁了，很可爱'."
                ),
                StoryQuestion(
                    "q_myfamerica_4",
                    "除了三口人，家里还生活着什么小成员？(Selain 3 anggota keluarga, siapa lagi anggota kecil yang tinggal di rumah?)",
                    listOf(
                        "一只漂亮的小鸟 (Burung)",
                        "一只小狗 (Seekor anjing kecil)",
                        "两只兔子 (Dua kelinci)",
                        "一条小金鱼 (Ikan mas)"
                    ),
                    1,
                    "Peliharaan keluarga: '我们还有一只小狗' (Kami juga memiliki seekor anjing kecil)."
                )
            )
        ),

        // Cerita Mandarin Bean 53: Gift for Mother-in-law (Kado untuk Ibu Mertua) (给丈母娘的礼物)
        Story(
            id = "story_gift_for_mother_in_law",
            titleHanzi = "给丈母娘的礼物",
            titlePinyin = "Gěi Zhàngmuniáng de Lǐwù",
            titleTranslation = "Gift for Mother-in-law (Kado untuk Ibu Mertua)",
            level = "Fun, HSK 1",
            category = "Humor & Keluarga",
            description = "Anekdot kocak tentang seorang suami yang bersikeras ingin membelikan sebotol arak alkohol untuk ibu mertuanya yang tidak minum alkohol demi kepentingannya sendiri.",
            coverEmoji = "🍾",
            coverImageRes = R.drawable.cover_story_gift_for_mother_in_law,
            estimatedReadMinutes = 2,
            sentences = listOf(
                Sentence(
                    "s_giftmil_1",
                    "妻子：马上过年了，你想送我妈什么东西？",
                    "Qīzi: Mǎshàng guò nián le, nǐ xiǎng sòng wǒ mā shénme dōngxi?",
                    "Istri: Sebentar lagi tahun baru Imlek, kamu ingin memberi kado apa untuk ibuku?",
                    listOf(
                        WordToken("妻子", "qī zi", "Istri", "Panggilan istri"),
                        WordToken("马上", "mǎ shàng", "Sebentar lagi / segera", "Waktu yang mendekat"),
                        WordToken("过年了", "guò nián le", "Tahun baru Imlek", "Perayaan pergantian tahun"),
                        WordToken("你想送", "nǐ xiǎng sòng", "Kamu ingin menghadiahkan", "Niat memberi hadiah"),
                        WordToken("我妈", "wǒ mā", "Ibuku", "Ibu mertua"),
                        WordToken("什么东西", "shénme dōngxi", "Barang apa?", "Pertanyaan kado")
                    )
                ),
                Sentence(
                    "s_giftmil_2",
                    "丈夫：送一瓶好酒！",
                    "Zhàngfu: Sòng yì píng hǎo jiǔ!",
                    "Suami: Hadiahkan sebotol arak bagus!",
                    listOf(
                        WordToken("丈夫", "zhàng fu", "Suami", "Panggilan suami"),
                        WordToken("送", "sòng", "Memberi hadiah", "Tindakan menghadiahkan"),
                        WordToken("一瓶", "yì píng", "Sebotol", "Bilangan + penggolong botol"),
                        WordToken("好酒", "hǎo jiǔ", "Arak / minuman beralkohol bermutu", "Minuman anggur/arak lezat")
                    )
                ),
                Sentence(
                    "s_giftmil_3",
                    "妻子：为什么？我爸爸已经去世五年了，我妈妈不喝酒，你为什么要送酒？",
                    "Qīzi: Wèi shénme? Wǒ bàba yǐjīng qùshì wǔ nián le, wǒ māma bù hē jiǔ, nǐ wèi shénme yào sòng jiǔ?",
                    "Istri: Kenapa begitu? Ayahku sudah meninggal lima tahun yang lalu, ibuku tidak minum alkohol, kenapa kamu harus memberi hadiah arak?",
                    listOf(
                        WordToken("妻子", "qī zi", "Istri", "Panggilan istri"),
                        WordToken("为什么", "wèi shénme", "Kenapa?", "Pertanyaan keheranan"),
                        WordToken("我爸爸", "wǒ bàba", "Ayahku", "Almarhum ayah mertua"),
                        WordToken("已经去世", "yǐjīng qùshì", "Sudah meninggal dunia", "Wafat berpulang"),
                        WordToken("五年了", "wǔ nián le", "Sudah 5 tahun", "Durasi waktu 5 tahun"),
                        WordToken("我妈妈", "wǒ māma", "Ibuku", "Ibu mertua"),
                        WordToken("不喝酒", "bù hē jiǔ", "Tidak minum arak / alkohol", "Pantangan minum alkohol"),
                        WordToken("你为什么", "nǐ wèi shénme", "Kenapa kamu", "Desakan pertanyaan"),
                        WordToken("要送酒", "yào sòng jiǔ", "Harus menghadiahkan arak?", "Pertanyaan alasan")
                    )
                ),
                Sentence(
                    "s_giftmil_4",
                    "丈夫：因为我每次去她家，她只给我喝茶。",
                    "Zhàngfu: Yīnwèi wǒ měi cì qù tā jiā, tā zhǐ gěi wǒ hē chá.",
                    "Suami: Karena setiap kali aku berkunjung ke rumahnya, ibu cuma menyuguhi aku minum teh.",
                    listOf(
                        WordToken("丈夫", "zhàng fu", "Suami", "Panggilan suami"),
                        WordToken("因为我", "yīnwèi wǒ", "Karena saya", "Alasan suami"),
                        WordToken("每次去", "měi cì qù", "Setiap kali pergi ke", "Frekuensi kunjungan berkala"),
                        WordToken("她家", "tā jiā", "Rumahnya", "Rumah ibu mertua"),
                        WordToken("她只给我", "tā zhǐ gěi wǒ", "Ibu hanya memberi saya", "Keterbatasan suguhan"),
                        WordToken("喝茶", "hē chá", "Minum teh", "Menyuguhkan teh biasa")
                    )
                )
            ),
            questions = listOf(
                StoryQuestion(
                    "q_giftmil_1",
                    "过年快到了，丈夫打算送岳母（妻子妈妈）什么礼物？(Menjelang Imlek, hadiah apa yang ingin diberikan suami kepada ibu mertuanya?)",
                    listOf(
                        "一件漂亮的衣服 (Baju cantik)",
                        "一瓶好酒 (Sebotol arak bagus)",
                        "一盒水果 (Sekotak buah)",
                        "一套茶具 (Satu set cangkir teh)"
                    ),
                    1,
                    "Suami menjawab bersemangat: '送一瓶好酒！' (Hadiahkan sebotol arak bagus!)."
                ),
                StoryQuestion(
                    "q_giftmil_2",
                    "妻子为什么觉得送酒非常不合理？(Mengapa istri merasa menghadiahkan arak sangat tidak masuk akal?)",
                    listOf(
                        "因为酒太贵了 (Karena arak terlalu mahal)",
                        "因为爸爸去世五年了，而妈妈根本不喝酒 (Karena ayah sudah wafat 5 tahun lalu, sedangkan ibu sama sekali tidak minum alkohol)",
                        "因为酒瓶容易打碎 (Karena botol mudah pecah)",
                        "因为妈妈喜欢喝咖啡 (Karena ibu suka kopi)"
                    ),
                    1,
                    "Istri memprotes logis: '我爸爸已经去世五年了，我妈妈不喝酒，你为什么要送酒？'."
                ),
                StoryQuestion(
                    "q_giftmil_3",
                    "丈夫一定要送酒的真正小算盘是什么？(Apa motif rahasia kocak di balik suami yang ngotot ingin menghadiahkan arak?)",
                    listOf(
                        "想让丈母娘学喝酒 (Ingin mertua belajar minum arak)",
                        "因为每次去丈母娘家都只能喝茶，送了酒自己去拜年时就有好酒喝了！ (Karena tiap bertamu hanya disuguhi teh, kalau ada arak dia sendiri yang akan meminumnya saat bertamu!)",
                        "为了炫耀有钱 (Ingin pamer)",
                        "受朋友委托 (Titipan teman)"
                    ),
                    1,
                    "Pengakuan jujur suami: '因为我每次去她家，她只给我喝茶' (Menghadiahkan arak agar dia sendiri bisa minum arak saat berkunjung!)."
                ),
                StoryQuestion(
                    "q_giftmil_4",
                    "这个故事讽刺并让人发笑的幽默点是什么？(Apa poin humor yang mengocok perut dalam cerita ini?)",
                    listOf(
                        "Kado untuk orang lain yang sebenarnya dibeli semata-mata demi memuaskan selera diri sendiri!",
                        "Istri menolak pulang kampung",
                        "Mertua membuang botol arak",
                        "Araknya ternyata air putih"
                    ),
                    0,
                    "Puncak kelucuan: membeli hadiah untuk mertua padahal tujuannya untuk dinikmati sendiri saat bertamu!"
                )
            )
        ),

        // Cerita Mandarin Bean 54: Hello 2018 (Halo, 2018) (你好，2018)
        Story(
            id = "story_hello_2018",
            titleHanzi = "你好，2018",
            titlePinyin = "Nǐ Hǎo, 2018",
            titleTranslation = "Hello 2018 (Halo, 2018)",
            level = "Culture, HSK 1",
            category = "Budaya & Festival",
            description = "Pengenalan budaya perayaan Tahun Baru Masehi (Yuan Dan) di Tiongkok, sejarah 4000 tahunnya, libur 3 hari, dan ucapan harapan tahun baru yang ceria.",
            coverEmoji = "🏮",
            coverImageRes = R.drawable.cover_story_hello_2018,
            estimatedReadMinutes = 2,
            sentences = listOf(
                Sentence(
                    "s_hello2018_1",
                    "新年，在中国也叫元旦。",
                    "Xīnnián, zài Zhōngguó yě jiào Yuándàn.",
                    "Tahun baru, di Tiongkok juga disebut Yuan Dan.",
                    listOf(
                        WordToken("新年", "xīn nián", "Tahun baru", "Pergantian tahun"),
                        WordToken("在", "zài", "Di", "Preposisi tempat"),
                        WordToken("中国", "Zhōng guó", "Tiongkok", "Negara Tiongkok"),
                        WordToken("也叫", "yě jiào", "Juga disebut", "Nama sebutan"),
                        WordToken("元旦", "Yuán dàn", "Yuan Dan", "Hari Tahun Baru Masehi 1 Januari")
                    )
                ),
                Sentence(
                    "s_hello2018_2",
                    "元旦有4000多年历史了。",
                    "Yuándàn yǒu 4000 duō nián lìshǐ le.",
                    "Yuan Dan memiliki sejarah lebih dari 4000 tahun.",
                    listOf(
                        WordToken("元旦", "Yuán dàn", "Yuan Dan", "Tradisi tahun baru"),
                        WordToken("有", "yǒu", "Ada / memiliki", "Memiliki sejarah"),
                        WordToken("4000", "4000", "4000", "Angka 4000"),
                        WordToken("多", "duō", "Lebih", "Lebih dari"),
                        WordToken("年", "nián", "Tahun", "Rentang tahun"),
                        WordToken("历史", "lì shǐ", "Sejarah", "Catatan sejarah peradaban"),
                        WordToken("了", "le", "Sudah", "Partikel penegas")
                    )
                ),
                Sentence(
                    "s_hello2018_3",
                    "每年1月1日，新的一年到来。",
                    "Měi nián 1 yuè 1 rì, xīn de yì nián dàolái.",
                    "Setiap tahun pada tanggal 1 Januari, tahun yang baru tiba.",
                    listOf(
                        WordToken("每", "měi", "Setiap", "Frekuensi"),
                        WordToken("年", "nián", "Tahun", "Tahun"),
                        WordToken("1", "1", "1", "Angka 1"),
                        WordToken("月", "yuè", "Bulan", "Bulan Januari"),
                        WordToken("1", "1", "1", "Angka 1"),
                        WordToken("日", "rì", "Hari / tanggal", "Tanggal satu"),
                        WordToken("新的", "xīn de", "Yang baru", "Sifat baru"),
                        WordToken("一年", "yī nián", "Satu tahun", "Tahun baru"),
                        WordToken("到来", "dào lái", "Tiba / datang", "Kehadiran waktu baru")
                    )
                ),
                Sentence(
                    "s_hello2018_4",
                    "下个星期一是元旦节，2018年开始。",
                    "Xià gè xīngqīyī shì Yuándàn jié, 2018 nián kāishǐ.",
                    "Hari Senin depan adalah Hari Yuan Dan, tahun 2018 dimulai.",
                    listOf(
                        WordToken("下个", "xià gè", "Depan / berikutnya", "Awal pekan depan"),
                        WordToken("星期一", "xīng qī yī", "Hari Senin", "Hari pertama kerja"),
                        WordToken("是", "shì", "Adalah", "Kopula"),
                        WordToken("元旦节", "Yuán dàn jié", "Festival Yuan Dan", "Hari perayaan"),
                        WordToken("2018", "2018", "2018", "Angka tahun 2018"),
                        WordToken("年", "nián", "Tahun", "Tahun"),
                        WordToken("开始", "kāi shǐ", "Dimulai", "Awal tahun")
                    )
                ),
                Sentence(
                    "s_hello2018_5",
                    "12月30号到1月1号，放假三天。你们去哪儿？",
                    "12 yuè 30 hào dào 1 yuè 1 hào, fàng jià sān tiān. Nǐmen qù nǎr?",
                    "Dari tanggal 30 Desember sampai 1 Januari, libur tiga hari. Kalian hendak pergi ke mana?",
                    listOf(
                        WordToken("12", "12", "12", "Angka 12"),
                        WordToken("月", "yuè", "Bulan", "Bulan Desember"),
                        WordToken("30", "30", "30", "Angka 30"),
                        WordToken("号", "hào", "Tanggal", "Tanggal 30"),
                        WordToken("到", "dào", "Sampai", "Preposisi rentang hingga"),
                        WordToken("1", "1", "1", "Angka 1"),
                        WordToken("月", "yuè", "Bulan", "Bulan Januari"),
                        WordToken("1", "1", "1", "Angka 1"),
                        WordToken("号", "hào", "Tanggal", "Tanggal 1"),
                        WordToken("放假", "fàng jià", "Libur / cuti", "Hari libur"),
                        WordToken("三天", "sān tiān", "Tiga hari", "Durasi libur 3 hari"),
                        WordToken("你们", "nǐ men", "Kalian", "Pronomina jamak"),
                        WordToken("去", "qù", "Pergi ke", "Aktivitas bepergian"),
                        WordToken("哪儿", "nǎ r", "Ke mana?", "Pertanyaan tujuan")
                    )
                ),
                Sentence(
                    "s_hello2018_6",
                    "再见，2017。你好，2018。",
                    "Zàijiàn, 2017. Nǐ hǎo, 2018.",
                    "Selamat tinggal 2017. Halo 2018.",
                    listOf(
                        WordToken("再见", "zài jiàn", "Selamat tinggal", "Perpisahan tahun lalu"),
                        WordToken("2017", "2017", "2017", "Angka tahun 2017"),
                        WordToken("你好", "nǐ hǎo", "Halo / selamat datang", "Menyambut tahun baru"),
                        WordToken("2018", "2018", "2018", "Angka tahun 2018")
                    )
                ),
                Sentence(
                    "s_hello2018_7",
                    "祝你们元旦节快乐！新年快乐！",
                    "Zhù nǐmen Yuándàn jié kuàilè! Xīnnián kuàilè!",
                    "Semoga kalian Selamat Hari Yuan Dan! Selamat Tahun Baru!",
                    listOf(
                        WordToken("祝", "zhù", "Mendoakan / mengucapkan", "Kata kerja tutur doa"),
                        WordToken("你们", "nǐ men", "Kalian", "Pronomina jamak"),
                        WordToken("元旦节", "Yuán dàn jié", "Hari Yuan Dan", "Perayaan"),
                        WordToken("快乐", "kuài lè", "Selamat / bahagia", "Ungkapan selamat"),
                        WordToken("新年", "xīn nián", "Tahun baru", "Tahun baru"),
                        WordToken("快乐", "kuài lè", "Selamat / bahagia", "Ungkapan selamat")
                    )
                )
            ),
            questions = listOf(
                StoryQuestion(
                    "q_hello2018_1",
                    "在中国，每年的1月1日公历新年被称为什么？(Di Tiongkok, tahun baru Masehi 1 Januari disebut apa?)",
                    listOf(
                        "春节 (Imlek)",
                        "中秋节 (Festival Kue Bulan)",
                        "元旦 (Yuan Dan)",
                        "端午节 (Peh Cun)"
                    ),
                    2,
                    "Teks menyebutkan: '新年，在中国也叫元旦。每年1月1日，新的一年到来'."
                ),
                StoryQuestion(
                    "q_hello2018_2",
                    "中国的“元旦”节日大概有多少年历史了？(Berapa lama perkiraan sejarah perayaan Yuan Dan di Tiongkok?)",
                    listOf(
                        "100多年",
                        "1000多年",
                        "4000多年 (Lebih dari 4000 tahun)",
                        "10000年"
                    ),
                    2,
                    "Sejarah kuno: '元旦有4000多年历史了' (Yuan Dan memiliki sejarah lebih dari 4000 tahun)."
                ),
                StoryQuestion(
                    "q_hello2018_3",
                    "文章中从12月30号到1月1号一共有几天假期？(Berapa hari libur dari 30 Desember sampai 1 Januari dalam cerita?)",
                    listOf(
                        "一天 (1 hari)",
                        "两天 (2 hari)",
                        "三天 (3 hari)",
                        "七天 (7 hari)"
                    ),
                    2,
                    "Teks menyebutkan: '12月30号到1月1号，放假三天' (Libur tiga hari)."
                ),
                StoryQuestion(
                    "q_hello2018_4",
                    "文章在结尾向大家送上了怎样的节日祝福？(Ucapan doa festival apa yang disampaikan di akhir teks?)",
                    listOf(
                        "祝你们考试第一名 (Selamat juara satu)",
                        "祝你们元旦节快乐！新年快乐！ (Selamat Hari Yuan Dan! Selamat Tahun Baru!)",
                        "祝你们一路顺风 (Selamat jalan)",
                        "祝你们生日快乐 (Selamat ulang tahun)"
                    ),
                    1,
                    "Ucapan penutup festival: '祝你们元旦节快乐！新年快乐！'."
                )
            )
        ),

        // Cerita Mandarin Bean 55: Where is the father? (爸爸去哪儿了？)
        Story(
            id = "story_where_is_father",
            titleHanzi = "爸爸去哪儿了？",
            titlePinyin = "Bàba Qù Nǎr Le?",
            titleTranslation = "Where is the father? (Ayah Pergi ke Mana?)",
            level = "Fun, HSK 1",
            category = "Humor & Seni",
            description = "Anekdot cerdas tentang dua anak laki-laki yang menikmati lukisan keluarga dan mempertanyakan mengapa sosok ayah tidak ada di dalam lukisan.",
            coverEmoji = "🎨",
            coverImageRes = R.drawable.cover_story_where_is_father,
            estimatedReadMinutes = 2,
            sentences = listOf(
                Sentence(
                    "s_wherefather_1",
                    "哥哥和弟弟两个人在看一些漂亮的画。",
                    "Gēge hé dìdi liǎng gè rén zài kàn yìxiē piàoliang de huà.",
                    "Kakak dan adik berdua sedang melihat beberapa lukisan yang indah.",
                    listOf(
                        WordToken("哥哥和弟弟", "gē ge hé dì di", "Kakak dan adik", "Dua bersaudara laki-laki"),
                        WordToken("两个人", "liǎng gè rén", "Dua orang", "Kuantitas dua orang"),
                        WordToken("在看", "zài kàn", "Sedang melihat", "Aktivitas menikmati lukisan"),
                        WordToken("一些", "yì xiē", "Beberapa", "Kuantitas jamak"),
                        WordToken("漂亮的", "piào liang de", "Yang indah / cantik", "Kualitas estetika"),
                        WordToken("画", "huà", "Lukisan / gambar", "Karya seni lukis")
                    )
                ),
                Sentence(
                    "s_wherefather_2",
                    "“看，”哥哥说，“这些画多漂亮啊！”",
                    "“Kàn,” gēge shuō, “zhèxiē huà duō piàoliang a!”",
                    "“Lihat,” kata kakak, “lukisan-lukisan ini betapa indahnya ya!”",
                    listOf(
                        WordToken("看", "kàn", "Lihatlah", "Seruan mengarahkan pandangan"),
                        WordToken("哥哥", "gē ge", "Kakak laki-laki", "Subjek kakak"),
                        WordToken("说", "shuō", "Berkata", "Kata kerja tutur"),
                        WordToken("这些画", "zhè xiē huà", "Lukisan-lukisan ini", "Kumpulan karya lukis"),
                        WordToken("多漂亮啊", "duō piào liang a", "Betapa cantiknya ya!", "Seruan kekaguman")
                    )
                ),
                Sentence(
                    "s_wherefather_3",
                    "“是啊，”弟弟说，“但是这些画只有妈妈和孩子。”",
                    "“Shì a,” dìdi shuō, “dànshì zhèxiē huà zhǐyǒu māma hé háizi.”",
                    "“Iya ya,” kata adik, “tetapi lukisan-lukisan ini hanya ada ibu dan anak.”",
                    listOf(
                        WordToken("是啊", "shì a", "Benar ya", "Pernyataan persetujuan"),
                        WordToken("弟弟", "dì di", "Adik laki-laki", "Subjek adik"),
                        WordToken("说", "shuō", "Berkata", "Kata kerja tutur"),
                        WordToken("但是", "dàn shì", "Tetapi / namun", "Konjungsi pertentangan"),
                        WordToken("这些画", "zhè xiē huà", "Lukisan-lukisan ini", "Karya seni lukis"),
                        WordToken("只有", "zhǐ yǒu", "Hanya ada", "Pembatasan subjek"),
                        WordToken("妈妈和孩子", "mā ma hé hái zi", "Ibu dan anak", "Tokoh dalam lukisan")
                    )
                ),
                Sentence(
                    "s_wherefather_4",
                    "“那爸爸去哪儿了呢？”哥哥想了想说：“他在画这些画啊。”",
                    "“Nà bàba qù nǎr le ne?” Gēge xiǎng le xiǎng shuō: “Tā zài huà zhèxiē huà a.”",
                    "“Lalu ayah pergi ke mana ya?” Kakak berpikir sejenak lalu berkata: “Ayah kan yang sedang melukis lukisan-lukisan ini!”",
                    listOf(
                        WordToken("那爸爸", "nà bà ba", "Lalu ayah", "Menanyakan keberadaan sosok ayah"),
                        WordToken("去哪儿了呢", "qù nǎ r le ne", "Pergi ke mana ya?", "Pertanyaan keheranan"),
                        WordToken("哥哥", "gē ge", "Kakak", "Subjek kakak"),
                        WordToken("想了想", "xiǎng le xiǎng", "Berpikir sejenak", "Merenung sesaat"),
                        WordToken("说", "shuō", "Berkata", "Kata kerja tutur"),
                        WordToken("他在画", "tā zài huà", "Dia sedang melukis", "Aktivitas ayah yang sebenarnya"),
                        WordToken("这些画啊", "zhè xiē huà a", "Lukisan-lukisan ini lho!", "Objek karya yang dilukis ayah")
                    )
                )
            ),
            questions = listOf(
                StoryQuestion(
                    "q_wherefather_1",
                    "哥哥和弟弟在看什么？(Apa yang sedang dilihat oleh kakak dan adik?)",
                    listOf(
                        "电视机 (Televisi)",
                        "一些漂亮的画 (Beberapa lukisan yang indah)",
                        "新买的玩具 (Mainan baru)",
                        "动物园里的小狗 (Anjing kecil)"
                    ),
                    1,
                    "Di kalimat pertama dinyatakan: '哥哥和弟弟两个人在看一些漂亮的画' (Kakak dan adik berdua sedang melihat beberapa lukisan yang indah)."
                ),
                StoryQuestion(
                    "q_wherefather_2",
                    "弟弟看着画，发现了什么奇怪的事情？(Apa hal janggal yang disadari oleh sang adik saat melihat lukisan?)",
                    listOf(
                        "画里没有花 (Di lukisan tidak ada bunga)",
                        "这些画里只有妈妈和孩子，没有爸爸 (Lukisan-lukisan itu hanya ada ibu dan anak, tidak ada sosok ayah)",
                        "画上的颜色不好看 (Warnanya tidak bagus)",
                        "画都被弄脏了 (Lukisannya kotor)"
                    ),
                    1,
                    "Adik mengamati dengan jeli: '但是这些画只有妈妈和孩子。那爸爸去哪儿了呢？'."
                ),
                StoryQuestion(
                    "q_wherefather_3",
                    "哥哥想了想之后，给出了怎样机智的回答？(Setelah berpikir sejenak, jawaban cerdas apa yang diberikan sang kakak?)",
                    listOf(
                        "爸爸去上班了 (Ayah pergi kerja)",
                        "爸爸正在画这些画呢！ (Ayah adalah orang yang sedang melukis lukisan-lukisan itu!)",
                        "爸爸去买西瓜了 (Ayah pergi beli semangka)",
                        "爸爸在睡觉 (Ayah sedang tidur)"
                    ),
                    1,
                    "Kakak menjawab dengan analogi cerdas: '他在画这些画啊' (Ayah kan yang melukis semua lukisan ini, makanya beliau tidak ada di dalam gambar!)."
                ),
                StoryQuestion(
                    "q_wherefather_4",
                    "这个故事让人联想到日常家庭生活中的什么真实场景？(Cerita jenaka ini mengingatkan pada pemandangan nyata apa dalam kehidupan keluarga?)",
                    listOf(
                        "Ayah malas belajar",
                        "Foto-foto keluarga yang selalu tidak ada ayahnya karena ayahlah yang selalu menjadi fotografer di balik kamera!",
                        "Ibu yang jago melukis",
                        "Kakak beradik yang sering bertengkar"
                    ),
                    1,
                    "Puncak kehangatan humor: sama seperti foto keluarga di mana sosok ayah sering 'hilang' karena beliau yang memegang kamera, dalam lukisan keluarga ayahlah yang melukis anak dan istrinya!"
                )
            )
        )
)
