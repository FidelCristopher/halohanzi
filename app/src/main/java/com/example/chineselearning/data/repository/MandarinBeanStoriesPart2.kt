package com.example.chineselearning.data.repository

import com.example.chineselearning.R
import com.example.chineselearning.data.model.*

val mandarinBeanStoriesPart2: List<Story> = listOf(
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
        ),

        // Cerita Mandarin Bean 20: Playing with Water (玩水)
        Story(
            id = "story_playing_with_water",
            titleHanzi = "玩水",
            titlePinyin = "Wán Shuǐ",
            titleTranslation = "Playing with Water (Bermain Air)",
            level = "Fun, HSK 1",
            category = "Humor & Rumah",
            description = "Anekdot lucu tentang seorang ibu yang dengan cerdik memanfaatkan kegemaran anaknya bermain air untuk menyuruhnya mencuci piring.",
            coverEmoji = "🏊",
            coverImageRes = R.drawable.cover_story_playing_with_water,
            estimatedReadMinutes = 2,
            sentences = listOf(
                Sentence(
                    "s_playwater_1",
                    "星期六，妈妈和儿子在家看电视。妈妈说：“儿子，你很喜欢玩水，是不是？”",
                    "Xīngqīliù, māma hé érzi zài jiā kàn diànshì. Māma shuō: “Érzi, nǐ hěn xǐhuan wán shuǐ, shì bu shì?”",
                    "Hari Sabtu, ibu dan anak laki-lakinya menonton TV di rumah. Ibu berkata: “Nak, kamu sangat suka bermain air, benar kan?”",
                    listOf(
                        WordToken("星期六", "Xīngqīliù", "Hari Sabtu", "Nama hari ke-6 dalam sepekan"),
                        WordToken("妈妈", "māma", "Ibu", "Orang tua perempuan"),
                        WordToken("和", "hé", "Dan", "Kata penghubung"),
                        WordToken("儿子", "érzi", "Anak laki-laki", "Putra kandung"),
                        WordToken("在家", "zài jiā", "Di rumah", "Keterangan tempat kediaman"),
                        WordToken("看电视", "kàn diànshì", "Menonton TV", "Aktivitas menonton televisi"),
                        WordToken("妈妈", "māma", "Ibu", "Subjek ibu"),
                        WordToken("说", "shuō", "Berkata", "Kata kerja tutur"),
                        WordToken("儿子", "érzi", "Anakku / nak", "Panggilan sayang kepada putra"),
                        WordToken("你", "nǐ", "Kamu", "Pronomina orang kedua"),
                        WordToken("很喜欢", "hěn xǐhuan", "Sangat suka", "Derajat kesukaan tinggi"),
                        WordToken("玩水", "wán shuǐ", "Bermain air", "Aktivitas bermain dengan air"),
                        WordToken("是不是", "shì bu shì", "Benar bukan?", "Pola tanya penegasan konfirmasi")
                    )
                ),
                Sentence(
                    "s_playwater_2",
                    "五岁的儿子以为妈妈要带他去游泳池玩，高兴地说：“是的，妈妈。”",
                    "Wǔ suì de érzi yǐwéi māma yào dài tā qù yóuyǒngchí wán, gāoxìng de shuō: “Shì de, māma.”",
                    "Anak berusia 5 tahun itu mengira ibu akan membawanya pergi bermain ke kolam renang, dengan gembira berkata: “Benar sekali, Ibu.”",
                    listOf(
                        WordToken("五岁的", "wǔ suì de", "Berusia 5 tahun", "Keterangan usia anak"),
                        WordToken("儿子", "érzi", "Anak laki-laki", "Subjek putra"),
                        WordToken("以为", "yǐwéi", "Mengira / menyangka", "Dugaan yang ternyata salah"),
                        WordToken("妈妈", "māma", "Ibu", "Pihak yang disangka"),
                        WordToken("要带他去", "yào dài tā qù", "Akan mengajaknya pergi ke", "Rencana membawa anak"),
                        WordToken("游泳池", "yóuyǒngchí", "Kolam renang", "Tempat berenang"),
                        WordToken("玩", "wán", "Bermain", "Aktivitas rekreasi"),
                        WordToken("高兴地", "gāoxìng de", "Dengan gembira", "Adverbia perasaan senang riang"),
                        WordToken("说", "shuō", "Berkata", "Kata kerja tutur"),
                        WordToken("是的", "shì de", "Benar / ya", "Pernyataan pembenaran antusias"),
                        WordToken("妈妈", "māma", "Ibu", "Panggilan sayang ibu")
                    )
                ),
                Sentence(
                    "s_playwater_3",
                    "妈妈说：“那你一定也喜欢洗碗，今天你洗碗，怎么样？”",
                    "Māma shuō: “Nà nǐ yídìng yě xǐhuan xǐ wǎn, jīntiān nǐ xǐ wǎn, zěnmeyàng?”",
                    "Ibu berkata: “Kalau begitu kamu pasti juga suka mencuci mangkuk, hari ini kamu yang cuci mangkuk ya, bagaimana?”",
                    listOf(
                        WordToken("妈妈", "māma", "Ibu", "Subjek ibu"),
                        WordToken("说", "shuō", "Berkata", "Kata kerja tutur"),
                        WordToken("那你", "nà nǐ", "Kalau begitu kamu", "Konjungsi kesimpulan + pronomina"),
                        WordToken("一定", "yídìng", "Pasti / tentu", "Kepastian logis"),
                        WordToken("也喜欢", "yě xǐhuan", "Juga suka", "Adverbia kesamaan + gemar"),
                        WordToken("洗碗", "xǐ wǎn", "Mencuci mangkuk / piring", "Pekerjaan rumah tangga mencuci perabot makan"),
                        WordToken("今天", "jīntiān", "Hari ini", "Keterangan waktu saat ini"),
                        WordToken("你", "nǐ", "Kamu", "Pronomina orang kedua"),
                        WordToken("洗碗", "xǐ wǎn", "Cuci mangkuk", "Tugas mencuci piring"),
                        WordToken("怎么样", "zěnmeyàng", "Bagaimana?", "Kalimat tanya penawaran/persetujuan")
                    )
                )
            ),
            questions = listOf(
                StoryQuestion(
                    "q_playwater_1",
                    "故事发生在哪一天？他们在做什么？(Pada hari apa cerita ini terjadi dan apa yang mereka lakukan?)",
                    listOf(
                        "星期一在学校上课 (Hari Senin belajar di sekolah)",
                        "星期六在家看电视 (Hari Sabtu menonton TV di rumah)",
                        "星期天在公园跑步 (Hari Minggu jogging di taman)",
                        "星期五去饭馆吃饭 (Hari Jumat makan di restoran)"
                    ),
                    1,
                    "Di awal kalimat tertulis jelas: '星期六，妈妈和儿子在家看电视' (Hari Sabtu, ibu dan anak laki-lakinya di rumah menonton TV)."
                ),
                StoryQuestion(
                    "q_playwater_2",
                    "五岁的儿子一开始以为妈妈要带他去哪里？(Awalnya anak berusia 5 tahun itu mengira ibu akan mengajaknya ke mana?)",
                    listOf(
                        "去超市买零食 (Ke supermarket beli camilan)",
                        "去游泳池玩水 (Ke kolam renang bermain air)",
                        "去图书馆借书 (Ke perpustakaan pinjam buku)",
                        "去动物园看小狗 (Ke kebun binatang lihat anjing)"
                    ),
                    1,
                    "Teks menyatakan: '五岁的儿子以为妈妈要带他去游泳池玩' (Anak 5 tahun itu menyangka ibu mau mengajaknya ke kolam renang)."
                ),
                StoryQuestion(
                    "q_playwater_3",
                    "妈妈真正想让儿子做的事情是什么？(Apa yang sebenarnya ingin disuruh oleh ibu kepada anaknya?)",
                    listOf(
                        "去洗衣服 (Mencuci baju)",
                        "今天去洗碗 (Hari ini mencuci mangkuk piring)",
                        "去打扫房间 (Membersihkan kamar)",
                        "马上去睡觉 (Segera tidur)"
                    ),
                    1,
                    "Ibu menjebaknya dengan cerdik: '那你一定也喜欢洗碗，今天你洗碗，怎么样？' (Kalau begitu kamu pasti juga suka cuci piring, hari ini kamu yang cuci piring ya!)."
                ),
                StoryQuestion(
                    "q_playwater_4",
                    "这个故事的笑点是什么？(Di mana letak kelucuan dari cerita ini?)",
                    listOf(
                        "Ibu terpeleset di dapur",
                        "Anak mengira diajak bersenang-senang renang, ternyata disuruh kerja rumah tangga mencuci piring!",
                        "Televisi mereka tiba-tiba rusak",
                        "Mangkuknya pecah semua"
                    ),
                    1,
                    "Plot twist lucunya: anak yang mengira akan diajak bermain air di kolam renang ternyata diakali oleh ibunya untuk mencuci tumpukan piring kotor!"
                )
            )
        ),

        // Cerita Mandarin Bean 21: Climb Mountain (爬山)
        Story(
            id = "story_climb_mountain",
            titleHanzi = "爬山",
            titlePinyin = "Pá Shān",
            titleTranslation = "Climb Mountain (Mendaki Gunung)",
            level = "Fun, HSK 1",
            category = "Humor & Alam",
            description = "Anekdot jenaka tentang seorang anak yang mempertanyakan logika ayahnya saat bersusah payah mendaki gunung hanya untuk melihat pemandangan di bawah.",
            coverEmoji = "⛰️",
            coverImageRes = R.drawable.cover_story_climb_mountain,
            estimatedReadMinutes = 2,
            sentences = listOf(
                Sentence(
                    "s_climbmountain_1",
                    "星期六，爸爸带着小儿子爬山，他们花了3个小时爬到了山顶。",
                    "Xīngqīliù, bàba dài zhe xiǎo érzi pá shān, tāmen huā le 3 gè xiǎoshí pá dào le shāndǐng.",
                    "Hari Sabtu, ayah mengajak putra kecilnya mendaki gunung, mereka menghabiskan waktu 3 jam mendaki hingga ke puncak gunung.",
                    listOf(
                        WordToken("星期六", "Xīngqīliù", "Hari Sabtu", "Keterangan waktu akhir pekan"),
                        WordToken("爸爸", "bàba", "Ayah", "Orang tua laki-laki"),
                        WordToken("带着", "dài zhe", "Mengajak / mendampingi", "Aspek berkelanjutan mendampingi"),
                        WordToken("小儿子", "xiǎo érzi", "Putra kecil / bungsu", "Anak laki-laki yang masih kecil"),
                        WordToken("爬山", "pá shān", "Mendaki gunung", "Aktivitas olahraga mendaki lereng gunung"),
                        WordToken("他们", "tāmen", "Mereka", "Pronomina orang ketiga jamak"),
                        WordToken("花了", "huā le", "Menghabiskan / memakan", "Penggunaan sumber daya waktu"),
                        WordToken("3个", "sān gè", "Tiga", "Bilangan angka 3 + kata penggolong"),
                        WordToken("小时", "xiǎoshí", "Jam", "Satuan durasi waktu jam"),
                        WordToken("爬到了", "pá dào le", "Mendaki sampai di", "Berhasil tiba di ketinggian"),
                        WordToken("山顶", "shāndǐng", "Puncak gunung", "Titik tertinggi gunung")
                    )
                ),
                Sentence(
                    "s_climbmountain_2",
                    "爸爸说：“看，山下的景色多好！”",
                    "Bàba shuō: “Kàn, shān xià de jǐngsè duō hǎo!”",
                    "Ayah berkata: “Lihat, pemandangan di bawah gunung betapa indahnya!”",
                    listOf(
                        WordToken("爸爸", "bàba", "Ayah", "Subjek ayah"),
                        WordToken("说", "shuō", "Berkata", "Kata kerja tutur"),
                        WordToken("看", "kàn", "Lihatlah", "Seruan mengarahkan pandangan mata"),
                        WordToken("山下的", "shān xià de", "Yang di bawah gunung", "Keterangan posisi di lembah/bawah"),
                        WordToken("景色", "jǐngsè", "Pemandangan", "Panorama alam pemandangan"),
                        WordToken("多好", "duō hǎo", "Betapa indahnya! / sangat bagus!", "Seruan kekaguman atas keindahan")
                    )
                ),
                Sentence(
                    "s_climbmountain_3",
                    "儿子说：“爸爸，山下的景色那么好，我们为什么要花那么多时间爬上来呢？”",
                    "Érzi shuō: “Bàba, shān xià de jǐngsè nàme hǎo, wǒmen wèi shénme yào huā nàme duō shíjiān pá shàng lái ne?”",
                    "Putranya berkata: “Ayah, kalau pemandangan di bawah gunung seindah itu, kenapa kita harus menghabiskan begitu banyak waktu mendaki ke atas sini ya?”",
                    listOf(
                        WordToken("儿子", "érzi", "Putra / anak laki-laki", "Subjek anak"),
                        WordToken("说", "shuō", "Berkata", "Kata kerja tutur"),
                        WordToken("爸爸", "bàba", "Ayah", "Panggilan sayang kepada ayah"),
                        WordToken("山下的", "shān xià de", "Di bawah gunung", "Posisi lembah"),
                        WordToken("景色", "jǐngsè", "Pemandangan", "Panorama pemandangan"),
                        WordToken("那么好", "nàme hǎo", "Begitu indah / sedemikian bagus", "Derajat kualitas sangat tinggi"),
                        WordToken("我们", "wǒmen", "Kita", "Pronomina jamak penutur"),
                        WordToken("为什么", "wèi shénme", "Mengapa / kenapa", "Kata tanya menanyakan alasan"),
                        WordToken("要花", "yào huā", "Harus menghabiskan", "Keharusan mengorbankan waktu"),
                        WordToken("那么多", "nàme duō", "Begitu banyak", "Kuantitas jumlah yang besar"),
                        WordToken("时间", "shíjiān", "Waktu", "Waktu / durasi jam"),
                        WordToken("爬上来", "pá shàng lái", "Mendaki naik ke atas sini", "Arah gerak mendaki ke puncak"),
                        WordToken("呢", "ne", "Ya?", "Partikel tanya retoris polos")
                    )
                )
            ),
            questions = listOf(
                StoryQuestion(
                    "q_climbmountain_1",
                    "爸爸带着儿子花了多长时间爬到山顶？(Berapa lama ayah dan putranya mendaki hingga ke puncak gunung?)",
                    listOf(
                        "1个小时 (1 jam)",
                        "2个小时 (2 jam)",
                        "3个小时 (3 jam)",
                        "5个小时 (5 jam)"
                    ),
                    2,
                    "Di kalimat pertama tertulis: '他们花了3个小时爬到了山顶' (Mereka menghabiskan waktu 3 jam mendaki ke puncak)."
                ),
                StoryQuestion(
                    "q_climbmountain_2",
                    "爬到山顶后，爸爸赞叹什么？(Setelah tiba di puncak, pemandangan apa yang dikagumi sang ayah?)",
                    listOf(
                        "天上的白云 (Awan putih di langit)",
                        "山下的美丽景色 (Pemandangan indah di bawah gunung)",
                        "山顶的饭馆 (Restoran di puncak gunung)",
                        "路边的小动物 (Hewan kecil di jalan)"
                    ),
                    1,
                    "Ayah berkata dengan bangga: '看，山下的景色多好！' (Lihat, betapa indahnya pemandangan di bawah gunung!)."
                ),
                StoryQuestion(
                    "q_climbmountain_3",
                    "儿子对爸爸的赞叹提出了什么疑问？(Pertanyaan apa yang dilontarkan sang anak menanggapi ucapan ayahnya?)",
                    listOf(
                        "什么时候可以吃午饭 (Kapan bisa makan siang)",
                        "既然山下景色那么好，为什么还要花3小时费力爬上来？ (Kalau pemandangan di bawah seindah itu, kenapa harus repot mendaki 3 jam ke atas?)",
                        "怎么坐索道下山 (Bagaimana naik kereta gantung untuk turun)",
                        "还要再爬一座山吗 (Apakah mau mendaki gunung lain lagi)"
                    ),
                    1,
                    "Anak itu berpikir kritis dan polos: '山下的景色那么好，我们为什么要花那么多时间爬上来呢？'."
                ),
                StoryQuestion(
                    "q_climbmountain_4",
                    "这个故事的幽默核心是什么？(Apa inti kelucuan dari cerita ini?)",
                    listOf(
                        "Anak kehilangan sepatunya di gunung",
                        "Kepolosan anak yang menganggap capek-capek mendaki 3 jam hanya untuk melihat pemandangan tempat mereka berdiri semula adalah kesia-siaan!",
                        "Ayah lupa membawa air minum",
                        "Hujan turun sangat deras di puncak"
                    ),
                    1,
                    "Humor terletak pada logika polos anak kecil yang mematahkan romantisme mendaki gunung: jika yang bagus adalah pemandangan di bawah, kenapa harus capek-capek naik ke atas!"
                )
            )
        ),

        // Cerita Mandarin Bean 22: Learn English (学英语)
        Story(
            id = "story_learn_english",
            titleHanzi = "学英语",
            titlePinyin = "Xué Yīngyǔ",
            titleTranslation = "Learn English (Belajar Bahasa Inggris)",
            level = "Fun, HSK 1",
            category = "Humor & Sekolah",
            description = "Anekdot cerdas tentang seorang murid yang membandingkan nasihat guru tentang mendengarkan bahasa Inggris dengan mendengar anjing menggonggong setiap hari.",
            coverEmoji = "🇬🇧",
            coverImageRes = R.drawable.cover_story_learn_english,
            estimatedReadMinutes = 2,
            sentences = listOf(
                Sentence(
                    "s_learneng_1",
                    "老师说：“我们学校从下学期开始，用英语上课。”",
                    "Lǎoshī shuō: “Wǒmen xuéxiào cóng xià xuéqī kāishǐ, yòng Yīngyǔ shàng kè.”",
                    "Guru berkata: “Sekolah kita mulai semester depan akan menggunakan bahasa Inggris dalam kegiatan belajar mengajar.”",
                    listOf(
                        WordToken("老师", "lǎoshī", "Guru", "Pendidik / pengajar"),
                        WordToken("说", "shuō", "Berkata", "Kata kerja tutur"),
                        WordToken("我们", "wǒmen", "Kita / kami", "Pronomina jamak orang pertama"),
                        WordToken("学校", "xuéxiào", "Sekolah", "Lembaga pendidikan sekolah"),
                        WordToken("从", "cóng", "Mulai dari", "Preposisi titik awal waktu"),
                        WordToken("下学期", "xià xuéqī", "Semester depan", "Masa periode sekolah berikutnya"),
                        WordToken("开始", "kāishǐ", "Mulai", "Memulai suatu kegiatan"),
                        WordToken("用英语", "yòng Yīngyǔ", "Menggunakan bahasa Inggris", "Memakai media bahasa Inggris"),
                        WordToken("上课", "shàng kè", "Mengikuti pelajaran / mengajar", "Aktivitas belajar mengajar di kelas")
                    )
                ),
                Sentence(
                    "s_learneng_2",
                    "学生说：“我们会听不懂的。”",
                    "Xuésheng shuō: “Wǒmen huì tīng bù dǒng de.”",
                    "Murid berkata: “Kami pasti tidak akan paham.”",
                    listOf(
                        WordToken("学生", "xuésheng", "Murid / siswa", "Pelajar di sekolah"),
                        WordToken("说", "shuō", "Berkata", "Kata kerja tutur"),
                        WordToken("我们会", "wǒmen huì", "Kami pasti akan", "Subjek jamak + modalitas kepastian"),
                        WordToken("听不懂的", "tīng bù dǒng de", "Tidak mengerti bila mendengar", "Bentuk potensial negatif pemahaman dengar")
                    )
                ),
                Sentence(
                    "s_learneng_3",
                    "老师说：“学英语就是要多听，听多了就会了。”",
                    "Lǎoshī shuō: “Xué Yīngyǔ jiù shì yào duō tīng, tīng duō le jiù huì le.”",
                    "Guru berkata: “Belajar bahasa Inggris kuncinya harus sering mendengarkan, kalau sudah sering mendengar lama-lama akan bisa.”",
                    listOf(
                        WordToken("老师", "lǎoshī", "Guru", "Subjek pengajar"),
                        WordToken("说", "shuō", "Berkata", "Kata kerja tutur"),
                        WordToken("学英语", "xué Yīngyǔ", "Belajar bahasa Inggris", "Mempelajari ilmu bahasa Inggris"),
                        WordToken("就是", "jiù shì", "Yaitu / intinya", "Penegasan esensi"),
                        WordToken("要多听", "yào duō tīng", "Harus banyak mendengarkan", "Anjuran memperbanyak intensitas menyimak"),
                        WordToken("听多了", "tīng duō le", "Setelah sering mendengar", "Kondisi akumulasi pendengaran"),
                        WordToken("就会了", "jiù huì le", "Pasti langsung bisa", "Hasil kemahiran yang akan dicapai")
                    )
                ),
                Sentence(
                    "s_learneng_4",
                    "学生说：“我每天听家里的小狗叫，但是一直不知道它在说什么。”",
                    "Xuésheng shuō: “Wǒ měi tiān tīng jiā lǐ de xiǎo gǒu jiào, dànshì yìzhí bù zhīdào tā zài shuō shénme.”",
                    "Murid membalas: “Saya setiap hari mendengar anjing kecil di rumah menggonggong, tapi sampai sekarang tetap tidak tahu dia sedang bicara apa.”",
                    listOf(
                        WordToken("学生", "xuésheng", "Murid / siswa", "Subjek pelajar"),
                        WordToken("说", "shuō", "Berkata", "Kata kerja tutur"),
                        WordToken("我每天", "wǒ měi tiān", "Saya setiap hari", "Subjek + frekuensi harian"),
                        WordToken("听", "tīng", "Mendengar", "Kata kerja menyimak indera pendengaran"),
                        WordToken("家里的", "jiā lǐ de", "Yang di dalam rumah", "Keterangan lokasi kepemilikan"),
                        WordToken("小狗", "xiǎo gǒu", "Anjing kecil", "Hewan peliharaan anjing"),
                        WordToken("叫", "jiào", "Menggonggong / bersuara", "Suara bunyi hewan anjing"),
                        WordToken("但是", "dànshì", "Tetapi / namun", "Konjungsi pertentangan tajam"),
                        WordToken("一直", "yìzhí", "Terus-menerus / selalu", "Keterangan kelanjutan tanpa henti"),
                        WordToken("不知道", "bù zhīdào", "Tidak tahu / tidak paham", "Ketidaktahuan makna"),
                        WordToken("它在说什么", "tā zài shuō shénme", "Apa yang sedang diucapkannya", "Isi ucapan yang tidak dipahami")
                    )
                )
            ),
            questions = listOf(
                StoryQuestion(
                    "q_learneng_1",
                    "学校从下学期开始有什么新教学计划？(Apa rencana baru sekolah mulai semester depan?)",
                    listOf(
                        "每天多上一节体育课 (Menambah 1 jam olahraga setiap hari)",
                        "用英语上课 (Mengajar menggunakan bahasa Inggris)",
                        "学生可以不用写作业 (Murid tidak perlu buat PR)",
                        "学校搬到新的地方 (Sekolah pindah tempat baru)"
                    ),
                    1,
                    "Guru mengumumkan: '我们学校从下学期开始，用英语上课' (Sekolah kita mulai semester depan menggunakan bahasa Inggris untuk mengajar)."
                ),
                StoryQuestion(
                    "q_learneng_2",
                    "学生们对英语上课有什么担心？(Apa kekhawatiran murid-murid terhadap kelas bahasa Inggris?)",
                    listOf(
                        "怕作业太多 (Takut PR terlalu banyak)",
                        "怕听不懂 (Takut tidak mengerti apa yang dibicarakan)",
                        "怕放学太晚 (Takut pulang terlalu sore)",
                        "怕考试太难 (Takut ujian terlalu sulit)"
                    ),
                    1,
                    "Murid mengeluh cemas: '学生说：我们会听不懂的' (Kami pasti tidak akan paham)."
                ),
                StoryQuestion(
                    "q_learneng_3",
                    "老师认为学好英语的关键是什么？(Menurut guru, apa kunci utama belajar bahasa Inggris?)",
                    listOf(
                        "多背单词 (Banyak menghafal kosakata)",
                        "多听，听多了自然就会了 (Banyak mendengarkan, sering mendengar lama-lama akan bisa)",
                        "每天看英文电影 (Setiap hari nonton film Inggris)",
                        "多写汉字 (Banyak menulis hanzi)"
                    ),
                    1,
                    "Guru menasihati: '学英语就是要多听，听多了就会了' (Kuncinya harus banyak mendengar)."
                ),
                StoryQuestion(
                    "q_learneng_4",
                    "学生是用什么巧妙的比喻反驳老师的？(Dengan perumpamaan cerdas apa murid membantah teori gurunya?)",
                    listOf(
                        "Dia mendengar burung bernyanyi",
                        "Dia setiap hari mendengar anjingnya menggonggong di rumah tapi sampai sekarang tetap tidak paham anjingnya bicara apa! (每天听小狗叫，还是不知道它说什么)",
                        "Dia sering mendengarkan musik tapi tidak bisa menyanyi",
                        "Dia tidak suka memelihara anjing"
                    ),
                    1,
                    "Murid membalas dengan cerdik: '我每天听家里的小狗叫，但是一直不知道它在说什么' (Kalau cuma mendengar bisa membuat paham, tentu saya sudah paham bahasa anjing di rumah!)."
                )
            )
        ),

        // Cerita Mandarin Bean 23: I'm thirsty (我渴了)
        Story(
            id = "story_im_thirsty",
            titleHanzi = "我渴了",
            titlePinyin = "Wǒ Kě Le",
            titleTranslation = "I'm thirsty (Saya Haus)",
            level = "HSK 1",
            category = "Keluarga & Percakapan",
            description = "Percakapan penuh kasih sayang antara seorang ibu dan anaknya yang kehausan dan kelelahan setelah berjalan, lalu disegarkan dengan sebotol kola manis.",
            coverEmoji = "🥤",
            coverImageRes = R.drawable.cover_story_im_thirsty,
            estimatedReadMinutes = 2,
            sentences = listOf(
                Sentence(
                    "s_imthirsty_1",
                    "妈妈：你怎么啦？",
                    "Māma: Nǐ zěnme la?",
                    "Ibu: Kamu kenapa ya?",
                    listOf(
                        WordToken("你怎么啦", "nǐ zěnme la", "Kamu kenapa ya?", "Pertanyaan ramah menanyakan keadaan")
                    )
                ),
                Sentence(
                    "s_imthirsty_2",
                    "孩子：妈妈，我累了……口也很渴。",
                    "Háizi: Māma, wǒ lèi le... kǒu yě hěn kě.",
                    "Anak: Ibu, aku lelah... dan tenggorokan juga sangat haus.",
                    listOf(
                        WordToken("妈妈", "māma", "Ibu", "Panggilan sayang kepada ibu"),
                        WordToken("我累了", "wǒ lèi le", "Saya lelah / capek", "Kondisi tubuh letih"),
                        WordToken("口也很渴", "kǒu yě hěn kě", "Mulut dan tenggorokan juga sangat haus", "Kondisi dahaga kering di mulut")
                    )
                ),
                Sentence(
                    "s_imthirsty_3",
                    "妈妈：坐在这儿吧。你现在怎么样？",
                    "Māma: Zuò zài zhèr ba. Nǐ xiànzài zěnmeyàng?",
                    "Ibu: Duduklah di sini. Bagaimana keadaanmu sekarang?",
                    listOf(
                        WordToken("坐在这儿吧", "zuò zài zhèr ba", "Duduklah di sini ya", "Tawaran mengajak istirahat duduk di tempat ini"),
                        WordToken("你现在", "nǐ xiànzài", "Kamu sekarang", "Pronomina + keterangan waktu kini"),
                        WordToken("怎么样", "zěnmeyàng", "Bagaimana?", "Menanyakan kondisi tubuh terkini")
                    )
                ),
                Sentence(
                    "s_imthirsty_4",
                    "孩子：好一点。",
                    "Háizi: Hǎo yìdiǎn.",
                    "Anak: Lumayan lebih baik.",
                    listOf(
                        WordToken("好一点", "hǎo yìdiǎn", "Lumayan lebih baik sedikit", "Perbaikan kondisi fisik berangsur reda")
                    )
                ),
                Sentence(
                    "s_imthirsty_5",
                    "妈妈：看！那有可乐！我去买。",
                    "Māma: Kàn! Nà yǒu kělè! Wǒ qù mǎi.",
                    "Ibu: Lihat! Di sana ada kola! Ibu pergi membelinya.",
                    listOf(
                        WordToken("看", "kàn", "Lihatlah!", "Seruan mengarahkan pandangan"),
                        WordToken("那有", "nà yǒu", "Di sana ada", "Menunjukkan keberadaan di kejauhan"),
                        WordToken("可乐", "kělè", "Kola / minuman bersoda", "Minuman penyegar manis"),
                        WordToken("我去买", "wǒ qù mǎi", "Saya akan pergi membelinya", "Niat segera berbelanja")
                    )
                ),
                Sentence(
                    "s_imthirsty_6",
                    "妈妈：给你喝！",
                    "Māma: Gěi nǐ hē!",
                    "Ibu: Ini minum ya!",
                    listOf(
                        WordToken("给你喝", "gěi nǐ hē", "Diberikan padamu untuk diminum", "Tindakan menyodorkan minuman")
                    )
                ),
                Sentence(
                    "s_imthirsty_7",
                    "孩子：谢谢，妈妈。真好喝。",
                    "Háizi: Xièxie, māma. Zhēn hǎohē.",
                    "Anak: Terima kasih, Ibu. Enak sekali.",
                    listOf(
                        WordToken("谢谢", "xièxie", "Terima kasih", "Ungkapan terima kasih hangat"),
                        WordToken("妈妈", "māma", "Ibu", "Panggilan sayang kepada ibu"),
                        WordToken("真好喝", "zhēn hǎohē", "Sangat enak dan segar diminum", "Pujian rasa minuman menyegarkan")
                    )
                ),
                Sentence(
                    "s_imthirsty_8",
                    "妈妈：你现在好了吗？",
                    "Māma: Nǐ xiànzài hǎo le ma?",
                    "Ibu: Apakah kamu sekarang sudah baikan?",
                    listOf(
                        WordToken("你现在", "nǐ xiànzài", "Kamu sekarang", "Pronomina + waktu saat ini"),
                        WordToken("好了吗", "hǎo le ma", "Apakah sudah pulih / segar?", "Pertanyaan konfirmasi kesehatan/kebugaran")
                    )
                ),
                Sentence(
                    "s_imthirsty_9",
                    "孩子：是的，现在好了，谢谢妈妈！",
                    "Háizi: Shì de, xiànzài hǎo le, xièxie māma!",
                    "Anak: Iya, sekarang sudah segar kembali, terima kasih Ibu!",
                    listOf(
                        WordToken("是的", "shì de", "Benar / iya", "Konfirmasi pembenaran"),
                        WordToken("现在", "xiànzài", "Sekarang", "Keterangan waktu saat ini"),
                        WordToken("好了", "hǎo le", "Sudah baik / pulih", "Kondisi bugar kembali"),
                        WordToken("谢谢", "xièxie", "Terima kasih", "Rasa syukur kasih sayang"),
                        WordToken("妈妈", "māma", "Ibu", "Panggilan ibu tercinta")
                    )
                )
            ),
            questions = listOf(
                StoryQuestion(
                    "q_imthirsty_1",
                    "孩子一开始对妈妈表达了什么感觉？(Awalnya apa yang dirasakan dan dikeluhkan oleh anak kepada ibunya?)",
                    listOf(
                        "肚子很疼 (Perutnya sangat sakit)",
                        "又累又渴 (Kelelahan dan juga sangat haus)",
                        "想去买新衣服 (Ingin membeli baju baru)",
                        "觉得天气太冷 (Merasa cuaca terlalu dingin)"
                    ),
                    1,
                    "Anak berkata: '妈妈，我累了……口也很渴' (Ibu, aku lelah dan tenggorokanku juga sangat haus)."
                ),
                StoryQuestion(
                    "q_imthirsty_2",
                    "妈妈让孩子先做什么？(Apa yang disuruh ibu pertama kali kepada anaknya?)",
                    listOf(
                        "坐在这儿休息一下 (Duduk di sini istirahat sebentar)",
                        "继续快点走 (Lanjut jalan cepat)",
                        "喝热水 (Minum air hangat)",
                        "给爸爸打电话 (Menelepon ayah)"
                    ),
                    0,
                    "Ibu dengan penuh perhatian mengajak istirahat: '坐在这儿吧。你现在怎么样？' (Duduklah di sini dulu)."
                ),
                StoryQuestion(
                    "q_imthirsty_3",
                    "妈妈看到什么后主动跑去买给孩子喝？(Ibu melihat apa lalu berinisiatif membelikannya untuk sang anak?)",
                    listOf(
                        "热茶 (Teh hangat)",
                        "牛奶 (Susu sapi)",
                        "可乐 (Minuman kola)",
                        "西瓜汁 (Jus semangka)"
                    ),
                    2,
                    "Ibu berseru gembira melihat kios minuman: '看！那有可乐！我去买' (Lihat! Di sana ada kola! Ibu belikan ya)."
                ),
                StoryQuestion(
                    "q_imthirsty_4",
                    "喝了可乐之后，孩子的感觉怎么样？(Bagaimana keadaan anak setelah meminum kola?)",
                    listOf(
                        "越来越累了 (Semakin lelah)",
                        "觉得不好喝 (Merasa tidak enak)",
                        "现在好了，感觉真好喝并感谢妈妈 (Sekarang sudah segar kembali, terasa sangat nikmat dan berterima kasih pada ibu)",
                        "想再吃一碗面条 (Ingin makan semangkuk mi lagi)"
                    ),
                    2,
                    "Anak bersyukur dengan ceria: '谢谢，妈妈。真好喝。是的，现在好了，谢谢妈妈！'."
                )
            )
        ),

        // Cerita Mandarin Bean 24: One Dollar (Satu Yuan) (一块钱)
        Story(
            id = "story_one_dollar",
            titleHanzi = "一块钱",
            titlePinyin = "Yī Kuài Qián",
            titleTranslation = "One Dollar (Satu Yuan)",
            level = "Fun, HSK 1",
            category = "Humor & Keluarga",
            description = "Anekdot jenaka tentang seorang anak yang mengira keluarga temannya sangat miskin hanya karena orang tuanya panik saat koin satu yuan tertelan.",
            coverEmoji = "🪙",
            coverImageRes = R.drawable.cover_story_one_dollar,
            estimatedReadMinutes = 2,
            sentences = listOf(
                Sentence(
                    "s_onedollar_1",
                    "有一天，女儿在朋友明明家玩。回家后，她对妈妈说：“妈妈，明明家一定很穷。”",
                    "Yǒu yì tiān, nǚ'ér zài péngyou Míngming jiā wán. Huí jiā hòu, tā duì māma shuō: “Māma, Míngming jiā yídìng hěn qióng.”",
                    "Suatu hari, anak perempuan bermain di rumah temannya Mingming. Setelah pulang, dia berkata kepada ibunya: “Ibu, keluarga Mingming pasti sangat miskin.”",
                    listOf(
                        WordToken("有一天", "yǒu yì tiān", "Suatu hari", "Keterangan waktu"),
                        WordToken("女儿", "nǚ'ér", "Anak perempuan", "Putri kandung"),
                        WordToken("在朋友", "zài péngyou", "Di teman", "Preposisi tempat"),
                        WordToken("明明", "Míngming", "Mingming", "Nama teman"),
                        WordToken("家玩", "jiā wán", "Bermain di rumah", "Aktivitas berkunjung"),
                        WordToken("回家后", "huí jiā hòu", "Setelah pulang", "Kembali ke rumah"),
                        WordToken("她对", "tā duì", "Dia kepada", "Subjek dan arah tutur"),
                        WordToken("妈妈", "māma", "Ibu", "Panggilan ibu"),
                        WordToken("说", "shuō", "Berkata", "Kata kerja tutur"),
                        WordToken("妈妈", "māma", "Ibu", "Panggilan sayang"),
                        WordToken("明明", "Míngming", "Mingming", "Nama teman"),
                        WordToken("家", "jiā", "Keluarga", "Keluarga teman"),
                        WordToken("一定", "yídìng", "Pasti", "Kepastian dugaan"),
                        WordToken("很穷", "hěn qióng", "Sangat miskin", "Kondisi ekonomi kurang mampu")
                    )
                ),
                Sentence(
                    "s_onedollar_2",
                    "妈妈问：“你怎么知道？”",
                    "Māma wèn: “Nǐ zěnme zhīdào?”",
                    "Ibu bertanya: “Bagaimana kamu tahu?”",
                    listOf(
                        WordToken("妈妈", "māma", "Ibu", "Subjek ibu"),
                        WordToken("问", "wèn", "Bertanya", "Kata kerja tutur"),
                        WordToken("你怎么", "nǐ zěnme", "Bagaimana kamu", "Pertanyaan cara"),
                        WordToken("知道", "zhīdào", "Tahu", "Mengetahui")
                    )
                ),
                Sentence(
                    "s_onedollar_3",
                    "女儿说：“今天明明只是吃下了一块钱，他的爸爸妈妈就都很紧张。”",
                    "Nǚ'ér shuō: “Jīntiān Míngming zhǐ shì chī xià le yí kuài qián, tā de bàba māma jiù dōu hěn jǐnzhāng.”",
                    "Anak perempuan berkata: “Hari ini Mingming cuma menelan uang koin satu yuan, ayah dan ibunya langsung sangat panik dan tegang.”",
                    listOf(
                        WordToken("女儿", "nǚ'ér", "Anak perempuan", "Subjek anak"),
                        WordToken("说", "shuō", "Berkata", "Kata kerja tutur"),
                        WordToken("今天", "jīntiān", "Hari ini", "Keterangan waktu"),
                        WordToken("明明", "Míngming", "Mingming", "Nama teman"),
                        WordToken("只是", "zhǐ shì", "Hanya / cuma", "Adverbia pembatas"),
                        WordToken("吃下了", "chī xià le", "Menelan / termakan", "Masuk ke dalam mulut tertelan"),
                        WordToken("一块钱", "yí kuài qián", "Uang satu yuan", "Koin uang 1 yuan"),
                        WordToken("他的", "tā de", "Miliknya", "Kepemilikan"),
                        WordToken("爸爸妈妈", "bàba māma", "Ayah dan ibu", "Orang tua"),
                        WordToken("就都", "jiù dōu", "Langsung semua", "Reaksi seketika"),
                        WordToken("很紧张", "hěn jǐnzhāng", "Sangat panik / tegang", "Kondisi cemas panik")
                    )
                )
            ),
            questions = listOf(
                StoryQuestion(
                    "q_onedollar_1",
                    "女儿去哪里玩了？(Anak perempuan pergi bermain ke mana?)",
                    listOf(
                        "在明明家玩 (Bermain di rumah Mingming)",
                        "在公园玩 (Bermain di taman)",
                        "在学校踢足球 (Main bola di sekolah)",
                        "在图书馆看书 (Membaca di perpustakaan)"
                    ),
                    0,
                    "Di kalimat pertama dinyatakan: '女儿在朋友明明家玩' (Bermain di rumah temannya Mingming)."
                ),
                StoryQuestion(
                    "q_onedollar_2",
                    "回家后，女儿对妈妈说了什么？(Setelah pulang, anak perempuan berkata apa kepada ibunya?)",
                    listOf(
                        "明明家非常富有 (Keluarga Mingming sangat kaya)",
                        "明明家一定很穷 (Keluarga Mingming pasti sangat miskin)",
                        "明天的作业很多 (PR besok sangat banyak)",
                        "想再去明明家玩 (Ingin main ke rumah Mingming lagi)"
                    ),
                    1,
                    "Anak itu berkata: '妈妈，明明家一定很穷' (Ibu, keluarga Mingming pasti sangat miskin)."
                ),
                StoryQuestion(
                    "q_onedollar_3",
                    "明明的爸爸妈妈为什么表现得很紧张？(Mengapa orang tua Mingming bersikap sangat panik dan tegang?)",
                    listOf(
                        "因为找不到钱包 (Karena dompet hilang)",
                        "因为明明不小心吃下了一块钱硬币！ (Karena Mingming menelan koin 1 yuan!)",
                        "因为家里的电视坏了 (Karena TV rusak)",
                        "因为明明考试得了零分 (Karena Mingming dapat nilai nol)"
                    ),
                    1,
                    "Orang tua panik bukan karena nilai uangnya, melainkan karena koin tertelan ke dalam perut: '明明只是吃下了一块钱，他的爸爸妈妈就都很紧张'."
                ),
                StoryQuestion(
                    "q_onedollar_4",
                    "这个故事的笑点在哪里？(Di mana letak kelucuan dari cerita ini?)",
                    listOf(
                        "Anak mengira orang tua panik karena kehilangan 1 yuan uang, padahal mereka panik karena koinnya tertelan membahayakan nyawa anak!",
                        "Uang koin itu ternyata palsu",
                        "Mingming membelikan semua orang es krim",
                        "Ibu anak perempuan itu memarahi Mingming"
                    ),
                    0,
                    "Kepolosan anak mengira orang tua panik karena uang 1 yuan yang bernilai kecil, bukan karena bahaya tertelan koin!"
                )
            )
        ),

        // Cerita Mandarin Bean 25: Playful Student (Murid yang Gemar Bermain) (爱玩的学生)
        Story(
            id = "story_playful_student",
            titleHanzi = "爱玩的学生",
            titlePinyin = "Ài Wán de Xuésheng",
            titleTranslation = "Playful Student (Murid yang Gemar Bermain)",
            level = "Fun, HSK 1",
            category = "Humor & Sekolah",
            description = "Anekdot cerdas tentang seorang murid kelas tiga yang merasa sudah terlalu banyak tahu sehingga ingin berhenti sekolah dan beralih mengajar kelas dua.",
            coverEmoji = "🎒",
            coverImageRes = R.drawable.cover_story_playful_student,
            estimatedReadMinutes = 2,
            sentences = listOf(
                Sentence(
                    "s_playstudent_1",
                    "三年级有一个非常聪明的学生，但是他很爱玩，不喜欢做作业，也不喜欢听课。",
                    "Sān niánjí yǒu yí gè fēicháng cōngmíng de xuésheng, dànshì tā hěn ài wán, bù xǐhuan zuò zuòyè, yě bù xǐhuan tīng kè.",
                    "Di kelas tiga ada seorang murid yang sangat pintar, tetapi dia sangat suka bermain, tidak suka mengerjakan PR, dan juga tidak suka mendengarkan pelajaran.",
                    listOf(
                        WordToken("三年级", "sān niánjí", "Kelas tiga", "Tingkat kelas SD"),
                        WordToken("有一个", "yǒu yí gè", "Ada seorang", "Keberadaan murid"),
                        WordToken("非常聪明的", "fēicháng cōngmíng de", "Yang sangat pintar", "Kecerdasan luar biasa"),
                        WordToken("学生", "xuésheng", "Murid / siswa", "Pelajar"),
                        WordToken("但是", "dànshì", "Tetapi", "Konjungsi pertentangan"),
                        WordToken("他很爱玩", "tā hěn ài wán", "Dia sangat suka bermain", "Gemar bermain-main"),
                        WordToken("不喜欢", "bù xǐhuan", "Tidak suka", "Negasi gemar"),
                        WordToken("做作业", "zuò zuòyè", "Mengerjakan PR", "Tugas pekerjaan rumah"),
                        WordToken("也不喜欢", "yě bù xǐhuan", "Juga tidak suka", "Tidak gemar juga"),
                        WordToken("听课", "tīng kè", "Menyimak pelajaran", "Mendengarkan guru di kelas")
                    )
                ),
                Sentence(
                    "s_playstudent_2",
                    "有一天，他对学校的老师说：“我懂的东西已经很多了，所以我不想读书了。”",
                    "Yǒu yì tiān, tā duì xuéxiào de lǎoshī shuō: “Wǒ dǒng de dōngxi yǐjīng hěn duō le, suǒyǐ wǒ bù xiǎng dú shū le.”",
                    "Suatu hari, dia berkata kepada guru di sekolah: “Hal yang kupahami sudah sangat banyak, jadi aku tidak mau sekolah lagi.”",
                    listOf(
                        WordToken("有一天", "yǒu yì tiān", "Suatu hari", "Keterangan waktu"),
                        WordToken("他对", "tā duì", "Dia kepada", "Arah tutur"),
                        WordToken("学校的", "xuéxiào de", "Yang di sekolah", "Keterangan tempat sekolah"),
                        WordToken("老师", "lǎoshī", "Guru", "Pengajar"),
                        WordToken("说", "shuō", "Berkata", "Kata kerja tutur"),
                        WordToken("我懂的", "wǒ dǒng de", "Yang kupahami", "Pengetahuan yang dimengerti"),
                        WordToken("东西", "dōngxi", "Hal / ilmu", "Hal pengetahuan"),
                        WordToken("已经", "yǐjīng", "Sudah", "Keterangan telah selesai"),
                        WordToken("很多了", "hěn duō le", "Sangat banyak", "Kuantitas berlebih"),
                        WordToken("所以", "suǒyǐ", "Oleh karena itu", "Konjungsi simpulan"),
                        WordToken("我不想", "wǒ bù xiǎng", "Saya tidak ingin", "Keengganan"),
                        WordToken("读书了", "dú shū le", "Bersekolah / belajar lagi", "Aktivitas menuntut ilmu")
                    )
                ),
                Sentence(
                    "s_playstudent_3",
                    "老师问：“那你想做什么呢？”",
                    "Lǎoshī wèn: “Nà nǐ xiǎng zuò shénme ne?”",
                    "Guru bertanya: “Kalau begitu kamu ingin melakukan apa?”",
                    listOf(
                        WordToken("老师", "lǎoshī", "Guru", "Subjek guru"),
                        WordToken("问", "wèn", "Bertanya", "Kata kerja tutur"),
                        WordToken("那你", "nà nǐ", "Kalau begitu kamu", "Pertanyaan transisi"),
                        WordToken("想做", "xiǎng zuò", "Ingin berbuat / bekerja", "Niat profesi"),
                        WordToken("什么呢", "shénme ne", "Apa ya?", "Kata tanya objek")
                    )
                ),
                Sentence(
                    "s_playstudent_4",
                    "学生说：“教二年级。”",
                    "Xuésheng shuō: “Jiāo èr niánjí.”",
                    "Murid itu menjawab: “Mengajar kelas dua.”",
                    listOf(
                        WordToken("学生", "xuésheng", "Murid", "Subjek murid"),
                        WordToken("说", "shuō", "Berkata", "Kata kerja tutur"),
                        WordToken("教", "jiāo", "Mengajar", "Memberi pelajaran"),
                        WordToken("二年级", "èr niánjí", "Kelas dua", "Tingkat kelas di bawahnya")
                    )
                )
            ),
            questions = listOf(
                StoryQuestion(
                    "q_playstudent_1",
                    "这个三年级学生有什么特点？(Apa karakteristik murid kelas tiga ini?)",
                    listOf(
                        "又笨又爱睡觉 (Bodoh dan suka tidur)",
                        "非常聪明但是很爱玩，不做作业 (Sangat pintar tapi suka main dan malas buat PR)",
                        "特别喜欢看书 (Sangat suka membaca buku)",
                        "每天都帮老师打扫卫生 (Setiap hari membantu guru membersihkan kelas)"
                    ),
                    1,
                    "Teks menyatakan: '三年级有一个非常聪明的学生，但是他很爱玩，不喜欢做作业'."
                ),
                StoryQuestion(
                    "q_playstudent_2",
                    "学生为什么不想继续读书了？(Mengapa murid itu tidak ingin lanjut belajar di sekolah?)",
                    listOf(
                        "因为生病了 (Karena sakit)",
                        "因为觉得懂的东西已经很多了 (Karena merasa ilmu yang dipahaminya sudah sangat banyak)",
                        "因为学校太远 (Karena sekolah terlalu jauh)",
                        "因为没有朋友 (Karena tidak punya teman)"
                    ),
                    1,
                    "Dia berkata: '我懂的东西已经很多了，所以我不想读书了' (Hal yang kupahami sudah banyak, jadi tidak mau sekolah lagi)."
                ),
                StoryQuestion(
                    "q_playstudent_3",
                    "当老师问他想做什么时，他回答了什么？(Saat guru bertanya ingin bekerja apa, apa jawabannya?)",
                    listOf(
                        "回家睡觉 (Pulang tidur)",
                        "教二年级 (Mengajar anak kelas 2)",
                        "当校长 (Jadi kepala sekolah)",
                        "去开出租车 (Jadi supir taksi)"
                    ),
                    1,
                    "Dengan percaya diri dia menjawab ingin jadi guru: '教二年级' (Mengajar kelas 2)."
                ),
                StoryQuestion(
                    "q_playstudent_4",
                    "这个故事让人发笑的原因是什么？(Apa yang membuat cerita ini mengundang tawa?)",
                    listOf(
                        "Murid kelas 3 itu mengira karena dia sudah lulus kelas 2, dia langsung berhak menjadi guru bagi adik kelasnya!",
                        "Guru memberikan nilai 100",
                        "Anak itu membawa mainan ke kelas",
                        "Orang tuanya datang ke sekolah"
                    ),
                    0,
                    "Logika kocak anak SD: daripada capek belajar materi kelas 3, dia lebih memilih menjadi guru kelas 2 karena materi kelas 2 sudah dia kuasai!"
                )
            )
        ),

        // Cerita Mandarin Bean 26: Forgot to bring books (Lupa Membawa Buku) (忘了带书)
        Story(
            id = "story_forgot_to_bring_books",
            titleHanzi = "忘了带书",
            titlePinyin = "Wàng le Dài Shū",
            titleTranslation = "Forgot to bring books (Lupa Membawa Buku)",
            level = "HSK 1",
            category = "Keluarga & Percakapan",
            description = "Percakapan telepon yang menggelitik antara seorang ibu yang mengira buku anaknya tertinggal di rumah dan anak yang santai di sekolah.",
            coverEmoji = "📚",
            coverImageRes = R.drawable.cover_story_forgot_to_bring_books,
            estimatedReadMinutes = 2,
            sentences = listOf(
                Sentence(
                    "s_forgotbook_1",
                    "A: 喂？你在哪？你没带你的书！",
                    "Wéi? Nǐ zài nǎ? Nǐ méi dài nǐ de shū!",
                    "A: Halo? Kamu di mana? Kamu tidak membawa bukumu!",
                    listOf(
                        WordToken("喂", "wéi", "Halo (di telepon)", "Sapaan telepon"),
                        WordToken("你在哪", "nǐ zài nǎ", "Kamu di mana?", "Menanyakan lokasi"),
                        WordToken("你没带", "nǐ méi dài", "Kamu tidak membawa", "Kelalaian membawa"),
                        WordToken("你的书", "nǐ de shū", "Bukumu", "Buku pelajaran anak")
                    )
                ),
                Sentence(
                    "s_forgotbook_2",
                    "B: 什么？你是谁？",
                    "Shénme? Nǐ shì shéi?",
                    "B: Apa? Anda ini siapa?",
                    listOf(
                        WordToken("什么", "shénme", "Apa?", "Kata tanya heran"),
                        WordToken("你是谁", "nǐ shì shéi", "Kamu/Anda siapa?", "Menanyakan identitas penelepon")
                    )
                ),
                Sentence(
                    "s_forgotbook_3",
                    "A: 我是你妈！我看见你的书在家。你忘了，是吗？",
                    "Wǒ shì nǐ mā! Wǒ kànjiàn nǐ de shū zài jiā. Nǐ wàng le, shì ma?",
                    "A: Aku ini ibumu! Aku melihat bukumu ada di rumah. Kamu lupa ya?",
                    listOf(
                        WordToken("我是你妈", "wǒ shì nǐ mā", "Saya ini ibumu!", "Penegasan identitas ibu"),
                        WordToken("我看见", "wǒ kànjiàn", "Saya melihat", "Melihat buku"),
                        WordToken("你的书", "nǐ de shū", "Bukumu", "Objek buku"),
                        WordToken("在家", "zài jiā", "Di rumah", "Keterangan lokasi"),
                        WordToken("你忘了", "nǐ wàng le", "Kamu lupa", "Lupa barang"),
                        WordToken("是吗", "shì ma", "Benarkah?", "Konfirmasi tanya")
                    )
                ),
                Sentence(
                    "s_forgotbook_4",
                    "B: 妈妈！对，我的书在家，今天不用带书。",
                    "Māma! Duì, wǒ de shū zài jiā, jīntiān bú yòng dài shū.",
                    "B: Ibu! Iya, bukuku memang di rumah, hari ini tidak perlu membawa buku.",
                    listOf(
                        WordToken("妈妈", "māma", "Ibu!", "Panggilan sadar"),
                        WordToken("对", "duì", "Benar / iya", "Konfirmasi pembenaran"),
                        WordToken("我的书", "wǒ de shū", "Bukuku", "Buku anak"),
                        WordToken("在家", "zài jiā", "Di rumah", "Lokasi"),
                        WordToken("今天", "jīntiān", "Hari ini", "Waktu saat ini"),
                        WordToken("不用带书", "bú yòng dài shū", "Tidak perlu membawa buku", "Bebas dari kewajiban membawa buku")
                    )
                ),
                Sentence(
                    "s_forgotbook_5",
                    "A: 好的，知道了。今天想吃什么？",
                    "Hǎo de, zhīdào le. Jīntiān xiǎng chī shénme?",
                    "A: Baiklah, ibu paham. Hari ini kamu ingin makan apa?",
                    listOf(
                        WordToken("好的", "hǎo de", "Baiklah", "Penerimaan informasi"),
                        WordToken("知道了", "zhīdào le", "Sudah mengerti / paham", "Memahami konteks"),
                        WordToken("今天", "jīntiān", "Hari ini", "Waktu"),
                        WordToken("想吃什么", "xiǎng chī shénme", "Ingin makan apa?", "Menanyakan menu santap")
                    )
                ),
                Sentence(
                    "s_forgotbook_6",
                    "B: 我想吃米饭。",
                    "Wǒ xiǎng chī mǐfàn.",
                    "B: Saya ingin makan nasi.",
                    listOf(
                        WordToken("我想吃", "wǒ xiǎng chī", "Saya ingin makan", "Pilihan makanan"),
                        WordToken("米饭", "mǐfàn", "Nasi", "Nasi putih")
                    )
                ),
                Sentence(
                    "s_forgotbook_7",
                    "A: 好的，吃米饭。再见。",
                    "Hǎo de, chī mǐfàn. Zàijiàn.",
                    "A: Baiklah, makan nasi. Sampai jumpa.",
                    listOf(
                        WordToken("好的", "hǎo de", "Baiklah", "Persetujuan"),
                        WordToken("吃米饭", "chī mǐfàn", "Makan nasi", "Menu yang disepakati"),
                        WordToken("再见", "zàijiàn", "Sampai jumpa", "Salam perpisahan telepon")
                    )
                ),
                Sentence(
                    "s_forgotbook_8",
                    "B: 再见！",
                    "Zàijiàn!",
                    "B: Sampai jumpa!",
                    listOf(
                        WordToken("再见", "zàijiàn", "Sampai jumpa!", "Salam perpisahan penutup")
                    )
                )
            ),
            questions = listOf(
                StoryQuestion(
                    "q_forgotbook_1",
                    "对话中的A和B是什么关系？(Apa hubungan antara pembicara A dan B dalam dialog?)",
                    listOf(
                        "老师和学生 (Guru dan murid)",
                        "母子关系 (Hubungan ibu dan anak)",
                        "同学关系 (Teman sekelas)",
                        "店员和顾客 (Kasir dan pembeli)"
                    ),
                    1,
                    "A berseru: '我是你妈！' dan B membalas: '妈妈！'."
                ),
                StoryQuestion(
                    "q_forgotbook_2",
                    "妈妈一开始打电话给孩子是因为什么？(Mengapa ibu awalnya menelepon sang anak?)",
                    listOf(
                        "问孩子晚上想吃什么 (Menanyakan makan malam)",
                        "以为孩子把书本忘在家里了 (Mengira anak lupa membawa buku ke sekolah)",
                        "催孩子赶紧回家 (Menyuruh anak cepat pulang)",
                        "询问考试成绩 (Menanyakan nilai ujian)"
                    ),
                    1,
                    "Ibu panik melihat buku di rumah: '你没带你的书！我看见你的书在家。你忘了，是吗？'."
                ),
                StoryQuestion(
                    "q_forgotbook_3",
                    "为什么孩子的书会在家里？(Mengapa buku anak berada di rumah?)",
                    listOf(
                        "因为被同学弄坏了 (Karena dirusak teman)",
                        "因为今天学校本来就不用带书 (Karena hari ini memang tidak perlu membawa buku)",
                        "因为孩子偷偷逃学 (Karena bolos sekolah)",
                        "因为书本丢了 (Karena buku hilang)"
                    ),
                    1,
                    "Anak menjelaskan santai: '对，我的书在家，今天不用带书'."
                ),
                StoryQuestion(
                    "q_forgotbook_4",
                    "最后孩子决定晚饭吃什么？(Pada akhirnya apa yang diminta anak untuk menu makan?)",
                    listOf(
                        "面条 (Mi)",
                        "米饭 (Nasi)",
                        "面包 (Roti)",
                        "苹果 (Apel)"
                    ),
                    1,
                    "Anak menjawab: '我想吃米饭' (Saya ingin makan nasi)."
                )
            )
        ),

        // Cerita Mandarin Bean 27: Spring Tour (Wisata Musim Semi) (春游)
        Story(
            id = "story_spring_tour",
            titleHanzi = "春游",
            titlePinyin = "Chūnyóu",
            titleTranslation = "Spring Tour (Wisata Musim Semi)",
            level = "Fun, HSK 1",
            category = "Humor & Sekolah",
            description = "Anekdot kocak tentang seorang murid yang semula menolak ikut piknik sekolah karena mahal, tetapi seketika berubah pikiran demi terbebas dari PR.",
            coverEmoji = "🌸",
            coverImageRes = R.drawable.cover_story_spring_tour,
            estimatedReadMinutes = 2,
            sentences = listOf(
                Sentence(
                    "s_springtour_1",
                    "星期日，学校组织春游，每人要交一百元，儿子回家说：“妈妈，我不去春游了，太贵了。”",
                    "Xīngqīrì, xuéxiào zǔzhī chūnyóu, měi rén yào jiāo yì bǎi yuán, érzi huí jiā shuō: “Māma, wǒ bú qù chūnyóu le, tài guì le.”",
                    "Hari Minggu, sekolah mengadakan piknik musim semi, setiap orang harus membayar 100 yuan, anak laki-laki pulang ke rumah dan berkata: “Ibu, aku tidak mau ikut piknik, terlalu mahal.”",
                    listOf(
                        WordToken("星期日", "xīngqīrì", "Hari Minggu", "Hari akhir pekan"),
                        WordToken("学校", "xuéxiào", "Sekolah", "Lembaga pendidikan"),
                        WordToken("组织", "zǔzhī", "Mengorganisir / mengadakan", "Mengadakan kegiatan bersama"),
                        WordToken("春游", "chūnyóu", "Wisata musim semi / piknik", "Kegiatan tur rekreasi musim semi"),
                        WordToken("每人", "měi rén", "Setiap orang", "Per orang"),
                        WordToken("要交", "yào jiāo", "Harus membayar / menyerahkan", "Kewajiban iuran biaya"),
                        WordToken("一百元", "yì bǎi yuán", "100 yuan", "Nominal 100 yuan"),
                        WordToken("儿子", "érzi", "Putra", "Anak laki-laki"),
                        WordToken("回家", "huí jiā", "Pulang ke rumah", "Tiba di rumah"),
                        WordToken("说", "shuō", "Berkata", "Kata kerja tutur"),
                        WordToken("妈妈", "māma", "Ibu", "Panggilan orang tua"),
                        WordToken("我不去", "wǒ bú qù", "Saya tidak pergi / tidak ikut", "Pernyataan penolakan"),
                        WordToken("春游了", "chūnyóu le", "Piknik", "Kegiatan piknik"),
                        WordToken("太贵了", "tài guì le", "Terlalu mahal", "Keluhan harga yang tinggi")
                    )
                ),
                Sentence(
                    "s_springtour_2",
                    "但是第二天，儿子一到家就说：“妈妈，能给我一百块钱吗？”",
                    "Dànshì dì-èr tiān, érzi yí dào jiā jiù shuō: “Māma, néng gěi wǒ yì bǎi kuài qián ma?”",
                    "Tetapi keesokan harinya, anak itu begitu tiba di rumah langsung berkata: “Ibu, bisakah berikan aku uang 100 yuan?”",
                    listOf(
                        WordToken("但是", "dànshì", "Tetapi", "Konjungsi pertentangan"),
                        WordToken("第二天", "dì-èr tiān", "Hari kedua / keesokan hari", "Waktu hari berikutnya"),
                        WordToken("儿子", "érzi", "Anak laki-laki", "Subjek putra"),
                        WordToken("一到家", "yí dào jiā", "Begitu tiba di rumah", "Kesegeraan saat sampai"),
                        WordToken("就说", "jiù shuō", "Langsung berkata", "Tindakan tutur seketika"),
                        WordToken("妈妈", "māma", "Ibu", "Panggilan ibu"),
                        WordToken("能给我", "néng gěi wǒ", "Bisakah memberiku", "Permintaan sopan"),
                        WordToken("一百块钱", "yì bǎi kuài qián", "Uang 100 yuan", "Nominal 100 kuai"),
                        WordToken("吗", "ma", "Bolehkah?", "Partikel tanya ya/tidak")
                    )
                ),
                Sentence(
                    "s_springtour_3",
                    "妈妈问：“为什么？”",
                    "Māma wèn: “Wèi shénme?”",
                    "Ibu bertanya: “Kenapa?”",
                    listOf(
                        WordToken("妈妈", "māma", "Ibu", "Subjek ibu"),
                        WordToken("问", "wèn", "Bertanya", "Kata kerja tutur"),
                        WordToken("为什么", "wèi shénme", "Kenapa / mengapa?", "Menanyakan alasan perubahan pikiran")
                    )
                ),
                Sentence(
                    "s_springtour_4",
                    "儿子说：“老师今天说，去春游的同学没有作业。”",
                    "Érzi shuō: “Lǎoshī jīntiān shuō, qù chūnyóu de tóngxué méiyǒu zuòyè.”",
                    "Anak itu menjawab: “Guru hari ini bilang, murid yang ikut piknik musim semi tidak ada PR.”",
                    listOf(
                        WordToken("儿子", "érzi", "Anak laki-laki", "Subjek putra"),
                        WordToken("说", "shuō", "Berkata", "Kata kerja tutur"),
                        WordToken("老师", "lǎoshī", "Guru", "Pengajar"),
                        WordToken("今天", "jīntiān", "Hari ini", "Keterangan waktu"),
                        WordToken("说", "shuō", "Berkata", "Kata kerja tutur"),
                        WordToken("去春游的", "qù chūnyóu de", "Yang pergi piknik", "Murid peserta piknik"),
                        WordToken("同学", "tóngxué", "Teman sekolah / murid", "Para pelajar"),
                        WordToken("没有", "méiyǒu", "Tidak ada", "Bebas dari kewajiban"),
                        WordToken("作业", "zuòyè", "Pekerjaan rumah / PR", "Tugas akademik sekolah")
                    )
                )
            ),
            questions = listOf(
                StoryQuestion(
                    "q_springtour_1",
                    "学校组织的春游每人需要交多少钱？(Berapa biaya piknik yang diadakan sekolah per orang?)",
                    listOf(
                        "五十元 (50 yuan)",
                        "一百元 (100 yuan)",
                        "两百元 (200 yuan)",
                        "免费 (Gratis)"
                    ),
                    1,
                    "Teks menyatakan: '每人要交一百元' (Setiap orang harus membayar 100 yuan)."
                ),
                StoryQuestion(
                    "q_springtour_2",
                    "儿子一开始为什么说不去春游？(Mengapa awalnya anak laki-laki itu menolak ikut piknik?)",
                    listOf(
                        "因为身体不舒服 (Karena badan tidak enak)",
                        "因为觉得一百元太贵了 (Karena merasa 100 yuan terlalu mahal)",
                        "因为害怕坐大巴 (Karena takut naik bus)",
                        "因为想在家打游戏 (Karena ingin main game di rumah)"
                    ),
                    1,
                    "Anak itu mengeluh: '妈妈，我不去春游了，太贵了' (Ibu, aku tidak mau ikut, terlalu mahal)."
                ),
                StoryQuestion(
                    "q_springtour_3",
                    "第二天儿子为什么突然向妈妈要一百块钱？(Mengapa keesokan harinya anak itu tiba-tiba meminta 100 yuan?)",
                    listOf(
                        "因为想去春游，因为参加春游的同学不用写作业！ (Karena ingin ikut piknik demi bebas dari tugas PR!)",
                        "因为要买新书包 (Karena mau beli tas baru)",
                        "因为弄丢了同学的钱 (Karena menghilangkan uang teman)",
                        "因为想给妈妈买礼物 (Karena ingin membelikan kado ibu)"
                    ),
                    0,
                    "Alasannya terungkap: '老师今天说，去春游的同学没有作业' (Murid yang ikut piknik tidak ada PR!)."
                ),
                StoryQuestion(
                    "q_springtour_4",
                    "这个故事表现了孩子怎样的心态？(Pola pikir anak seperti apa yang tergambar dalam cerita jenaka ini?)",
                    listOf(
                        "Sangat rajin belajar",
                        "Rela membayar uang mahal demi menghindari tugas pekerjaan rumah (PR)!",
                        "Sangat hemat dan perhitungan",
                        "Takut kepada guru sekolah"
                    ),
                    1,
                    "Humor terletak pada prioritas anak: uang 100 yuan yang tadinya dianggap mahal langsung terasa murah demi bisa lepas dari PR sekolah!"
                )
            )
        ),

        // Cerita Mandarin Bean 28: New Friend (Teman Baru) (新朋友)
        Story(
            id = "story_new_friend",
            titleHanzi = "新朋友",
            titlePinyin = "Xīn Péngyou",
            titleTranslation = "New Friend (Teman Baru)",
            level = "HSK 1",
            category = "Pertemanan & Kuliner",
            description = "Kisah hangat tentang perkenalan di kantor dengan seorang rekan asal Tiongkok yang memperkenalkan kelezatan masakan Tionghoa.",
            coverEmoji = "🤝",
            coverImageRes = R.drawable.cover_story_new_friend,
            estimatedReadMinutes = 2,
            sentences = listOf(
                Sentence(
                    "s_newfriend_1",
                    "今天在公司认识了一个新朋友，他是个中国人。",
                    "Jīntiān zài gōngsī rènshi le yí gè xīn péngyou, tā shì gè Zhōngguó rén.",
                    "Hari ini di kantor berkenalan dengan seorang teman baru, dia adalah orang Tiongkok.",
                    listOf(
                        WordToken("今天", "jīntiān", "Hari ini", "Keterangan waktu saat ini"),
                        WordToken("在公司", "zài gōngsī", "Di kantor perusahaan", "Lokasi tempat kerja"),
                        WordToken("认识了", "rènshi le", "Berkenalan dengan", "Menjalin perkenalan"),
                        WordToken("一个", "yí gè", "Seorang", "Bilangan + penggolong"),
                        WordToken("新朋友", "xīn péngyou", "Teman baru", "Rekan baru"),
                        WordToken("他是", "tā shì", "Dia adalah", "Kopula"),
                        WordToken("个", "gè", "Seorang", "Penggolong"),
                        WordToken("中国人", "Zhōngguó rén", "Orang Tiongkok", "Warga negara Tiongkok")
                    )
                ),
                Sentence(
                    "s_newfriend_2",
                    "晚上他带我去了一个中国饭馆，这是我第一次吃中国菜，很好吃，我很喜欢。",
                    "Wǎnshang tā dài wǒ qù le yí gè Zhōngguó fànguǎn, zhè shì wǒ dì-yī cì chī Zhōngguó cài, hěn hǎochī, wǒ hěn xǐhuan.",
                    "Malam hari dia mengajakku pergi ke sebuah restoran Tiongkok, ini pertama kalinya aku makan masakan Tiongkok, sangat enak, aku sangat menyukainya.",
                    listOf(
                        WordToken("晚上", "wǎnshang", "Malam hari", "Waktu malam"),
                        WordToken("他带我", "tā dài wǒ", "Dia mengajak saya", "Mendampingi pergi"),
                        WordToken("去了一个", "qù le yí gè", "Pergi ke sebuah", "Perjalanan menuju tempat"),
                        WordToken("中国饭馆", "Zhōngguó fànguǎn", "Restoran Tiongkok", "Rumah makan masakan Tionghoa"),
                        WordToken("这是", "zhè shì", "Ini adalah", "Penunjuk pengalaman"),
                        WordToken("我", "wǒ", "Saya", "Pronomina pertama"),
                        WordToken("第一次", "dì-yī cì", "Pertama kali", "Pengalaman perdana"),
                        WordToken("吃中国菜", "chī Zhōngguó cài", "Makan masakan Tiongkok", "Menikmati kuliner Tiongkok"),
                        WordToken("很好吃", "hěn hǎochī", "Sangat lezat / enak", "Pujian rasa makanan"),
                        WordToken("我", "wǒ", "Saya", "Pronomina"),
                        WordToken("很喜欢", "hěn xǐhuan", "Sangat menyukai", "Derajat kegemaran")
                    )
                ),
                Sentence(
                    "s_newfriend_3",
                    "他说周末可以教我做中国菜，我非常高兴。",
                    "Tā shuō zhōumò kěyǐ jiāo wǒ zuò Zhōngguó cài, wǒ fēicháng gāoxìng.",
                    "Dia berkata akhir pekan bisa mengajariku memasak masakan Tiongkok, aku sangat senang.",
                    listOf(
                        WordToken("他说", "tā shuō", "Dia berkata", "Tutur rekan"),
                        WordToken("周末", "zhōumò", "Akhir pekan", "Waktu Sabtu-Minggu"),
                        WordToken("可以", "kěyǐ", "Bisa / boleh", "Kemungkinan kesediaan"),
                        WordToken("教我", "jiāo wǒ", "Mengajari saya", "Memberikan bimbingan"),
                        WordToken("做中国菜", "zuò Zhōngguó cài", "Memasak masakan Tiongkok", "Aktivitas memasak kuliner Tionghoa"),
                        WordToken("我", "wǒ", "Saya", "Subjek"),
                        WordToken("非常高兴", "fēicháng gāoxìng", "Sangat gembira / senang luar biasa", "Perasaan sukacita")
                    )
                ),
                Sentence(
                    "s_newfriend_4",
                    "他是个很好的朋友，但是他的英语不好，我想我可以学习汉语，我们就可以交流更多了。",
                    "Tā shì gè hěn hǎo de péngyou, dànshì tā de Yīngyǔ bù hǎo, wǒ xiǎng wǒ kěyǐ xuéxí Hànyǔ, wǒmen jiù kěyǐ jiāoliú gèng duō le.",
                    "Dia adalah teman yang sangat baik, tetapi bahasa Inggrisnya kurang lancar, kupikir aku bisa belajar bahasa Mandarin, sehingga kami bisa berkomunikasi lebih banyak lagi.",
                    listOf(
                        WordToken("他是", "tā shì", "Dia adalah", "Subjek + kopula"),
                        WordToken("个", "gè", "Seorang", "Penggolong"),
                        WordToken("很好的", "hěn hǎo de", "Yang sangat baik", "Karakter terpuji"),
                        WordToken("朋友", "péngyou", "Teman / sahabat", "Kawan dekat"),
                        WordToken("但是", "dànshì", "Tetapi / namun", "Konjungsi pertentangan"),
                        WordToken("他的", "tā de", "Miliknya", "Kepemilikan"),
                        WordToken("英语", "Yīngyǔ", "Bahasa Inggris", "Bahasa Inggris"),
                        WordToken("不好", "bù hǎo", "Kurang bagus / belum lancar", "Kondisi kemampuan bahasa"),
                        WordToken("我想", "wǒ xiǎng", "Saya rasa / berniat", "Pandangan pemikiran"),
                        WordToken("我可以", "wǒ kěyǐ", "Saya bisa", "Kemauan diri"),
                        WordToken("学习", "xuéxí", "Belajar", "Menuntut ilmu bahasa"),
                        WordToken("汉语", "Hànyǔ", "Bahasa Mandarin", "Bahasa Tionghoa"),
                        WordToken("我们", "wǒmen", "Kita / kami", "Pronomina jamak"),
                        WordToken("就可以", "jiù kěyǐ", "Maka bisa", "Hasil kemudahan"),
                        WordToken("交流", "jiāoliú", "Berkomunikasi / bertukar kabar", "Interaksi percakapan"),
                        WordToken("更多了", "gèng duō le", "Lebih banyak lagi", "Peningkatan kuantitas komunikasi")
                    )
                )
            ),
            questions = listOf(
                StoryQuestion(
                    "q_newfriend_1",
                    "作者是在哪里认识这位中国新朋友的？(Di mana penulis berkenalan dengan teman baru asal Tiongkok ini?)",
                    listOf(
                        "在公司 (Di kantor perusahaan)",
                        "在饭馆 (Di restoran)",
                        "在学校 (Di sekolah)",
                        "在机场 (Di bandara)"
                    ),
                    0,
                    "Di kalimat pertama disebutkan: '今天在公司认识了一个新朋友' (Hari ini di kantor berkenalan dengan teman baru)."
                ),
                StoryQuestion(
                    "q_newfriend_2",
                    "晚上新朋友带作者去了哪里？(Malam harinya teman baru mengajak penulis ke mana?)",
                    listOf(
                        "去超市买东西 (Ke supermarket belanja)",
                        "去了一个中国饭馆吃中国菜 (Pergi ke restoran Tiongkok makan masakan Tiongkok)",
                        "去公园散步 (Ke taman jalan-jalan)",
                        "去电影院看电影 (Ke bioskop nonton film)"
                    ),
                    1,
                    "Teks menyatakan: '晚上他带我去了一个中国饭馆，这是我第一次吃中国菜'."
                ),
                StoryQuestion(
                    "q_newfriend_3",
                    "新朋友提出周末可以教作者做什么？(Teman baru menawarkan untuk mengajari apa di akhir pekan?)",
                    listOf(
                        "教踢足球 (Mengajari main bola)",
                        "教做中国菜 (Mengajari memasak masakan Tiongkok)",
                        "教写英文信 (Mengajari nulis surat Inggris)",
                        "教唱歌 (Mengajari bernyanyi)"
                    ),
                    1,
                    "Teman barunya berjanji: '他说周末可以教我做中国菜' (Dia bilang akhir pekan bisa mengajariku masak masakan Tiongkok)."
                ),
                StoryQuestion(
                    "q_newfriend_4",
                    "作者为什么决定学习汉语？(Mengapa penulis memutuskan untuk belajar bahasa Mandarin?)",
                    listOf(
                        "因为新朋友的英语不太好，学汉语能更好地互相交流 (Karena bahasa Inggris temannya belum lancar, belajar Mandarin membuat mereka bisa mengobrol lebih banyak)",
                        "因为公司要求必须学 (Karena tuntutan perusahaan)",
                        "因为想去北京旅游 (Karena ingin liburan ke Beijing)",
                        "因为要准备考试 (Karena mau ujian)"
                    ),
                    0,
                    "Alasan tulus penulis: '他的英语不好，我想我可以学习汉语，我们就可以交流更多了'."
                )
            )
        ),

        // Cerita Mandarin Bean 29: Return Goods (Mengembalikan Barang) (退货)
        Story(
            id = "story_return_goods",
            titleHanzi = "退货",
            titlePinyin = "Tuì Huò",
            titleTranslation = "Return Goods (Mengembalikan Barang)",
            level = "Fun, HSK 1",
            category = "Humor & Hewan",
            description = "Anekdot kocak tentang seorang pembeli yang ingin mengembalikan anjing peliharaannya ke toko karena menganggap anjing itu salah mengerjakan tugas PR sekolahnya.",
            coverEmoji = "🐕",
            coverImageRes = R.drawable.cover_story_return_goods,
            estimatedReadMinutes = 2,
            sentences = listOf(
                Sentence(
                    "s_returngoods_1",
                    "一个人带着他买的狗到宠物店，说：“我不要这只狗了。”",
                    "Yí gè rén dài zhe tā mǎi de gǒu dào chǒngwùdiàn, shuō: “Wǒ bú yào zhè zhī gǒu le.”",
                    "Seseorang membawa anjing yang baru dibelinya ke toko hewan peliharaan, dan berkata: “Saya tidak mau anjing ini lagi.”",
                    listOf(
                        WordToken("一个人", "yí gè rén", "Seseorang", "Subjek pembeli"),
                        WordToken("带着", "dài zhe", "Membawa serta", "Membawa hewan"),
                        WordToken("他买的", "tā mǎi de", "Yang dia beli", "Anjing yang dibeli"),
                        WordToken("狗", "gǒu", "Anjing", "Hewan anjing"),
                        WordToken("到", "dào", "Menuju / sampai ke", "Arah tujuan"),
                        WordToken("宠物店", "chǒngwùdiàn", "Toko hewan peliharaan", "Toko hewan"),
                        WordToken("说", "shuō", "Berkata", "Kata kerja tutur"),
                        WordToken("我", "wǒ", "Saya", "Pronomina pertama"),
                        WordToken("不要", "bú yào", "Tidak mau / menolak", "Penolakan menyimpan"),
                        WordToken("这只狗", "zhè zhī gǒu", "Anjing ini", "Kata tunjuk + penggolong ekor + anjing"),
                        WordToken("了", "le", "Lagi", "Partikel perubahan keputusan")
                    )
                ),
                Sentence(
                    "s_returngoods_2",
                    "老板说：“这只狗很聪明，你为什么不想要了呢？”",
                    "Lǎobǎn shuō: “Zhè zhī gǒu hěn cōngmíng, nǐ wèi shénme bù xiǎng yào le ne?”",
                    "Pemilik toko berkata: “Anjing ini sangat pintar, kenapa Anda tidak menginginkannya lagi ya?”",
                    listOf(
                        WordToken("老板", "lǎobǎn", "Pemilik toko / bos", "Pengelola toko"),
                        WordToken("说", "shuō", "Berkata", "Kata kerja tutur"),
                        WordToken("这只狗", "zhè zhī gǒu", "Anjing ini", "Subjek anjing"),
                        WordToken("很聪明", "hěn cōngmíng", "Sangat pintar / cerdas", "Pujian kecerdasan"),
                        WordToken("你", "nǐ", "Anda", "Pronomina kedua"),
                        WordToken("为什么", "wèi shénme", "Mengapa / kenapa", "Menanyakan alasan"),
                        WordToken("不想要了", "bù xiǎng yào le", "Tidak ingin lagi", "Keengganan memelihara"),
                        WordToken("呢", "ne", "Ya?", "Partikel tanya heran")
                    )
                ),
                Sentence(
                    "s_returngoods_3",
                    "他说：“我觉得它一点儿也不聪明，昨天学校的作业它做错了很多！”",
                    "Tā shuō: “Wǒ juéde tā yìdiǎnr yě bù cōngmíng, zuótiān xuéxiào de zuòyè tā zuò cuò le hěn duō!”",
                    "Dia menjawab: “Menurut saya dia sama sekali tidak pintar, PR sekolah kemarin saja dia kerjakan salah banyak!”",
                    listOf(
                        WordToken("他说", "tā shuō", "Dia berkata", "Kata kerja tutur"),
                        WordToken("我觉得", "wǒ juéde", "Menurut saya / kupikir", "Opini penutur"),
                        WordToken("它", "tā", "Dia / si anjing", "Pronomina hewan"),
                        WordToken("一点儿也不", "yìdiǎnr yě bù", "Sama sekali tidak", "Penyangkalan mutlak"),
                        WordToken("聪明", "cōngmíng", "Pintar", "Kecerdasan"),
                        WordToken("昨天", "zuótiān", "Kemarin", "Keterangan waktu"),
                        WordToken("学校的", "xuéxiào de", "Yang dari sekolah", "Keterangan asal tugas"),
                        WordToken("作业", "zuòyè", "PR / tugas sekolah", "Pekerjaan rumah"),
                        WordToken("它", "tā", "Dia", "Subjek anjing"),
                        WordToken("做错了", "zuò cuò le", "Salah mengerjakan", "Melakukan kesalahan tugas"),
                        WordToken("很多", "hěn duō", "Banyak", "Jumlah kesalahan banyak")
                    )
                )
            ),
            questions = listOf(
                StoryQuestion(
                    "q_returngoods_1",
                    "顾客带着狗去了什么地方？(Ke tempat apa pelanggan membawa anjingnya?)",
                    listOf(
                        "宠物店 (Toko hewan peliharaan)",
                        "医院 (Rumah sakit)",
                        "学校 (Sekolah)",
                        "饭馆 (Restoran)"
                    ),
                    0,
                    "Teks menyatakan: '一个人带着他买的狗到宠物店' (Seseorang membawa anjingnya ke toko hewan peliharaan)."
                ),
                StoryQuestion(
                    "q_returngoods_2",
                    "宠物店老板是怎么夸奖这只狗的？(Bagaimana pemilik toko memuji anjing tersebut?)",
                    listOf(
                        "这只狗跑得很快 (Anjing ini lari sangat cepat)",
                        "这只狗很聪明 (Anjing ini sangat pintar)",
                        "这只狗非常好看 (Anjing ini sangat tampan)",
                        "这只狗喜欢游泳 (Anjing ini suka berenang)"
                    ),
                    1,
                    "Pemilik toko membela kualitas anjingnya: '这只狗很聪明，你为什么不想要了呢？'."
                ),
                StoryQuestion(
                    "q_returngoods_3",
                    "顾客为什么坚决认为这只狗一点儿也不聪明？(Mengapa pelanggan bersikeras menganggap anjing itu sama sekali tidak pintar?)",
                    listOf(
                        "因为狗不会叫 (Karena tidak bisa menggonggong)",
                        "因为昨天学校的作业它做错了很多！ (Karena PR sekolah kemarin dikerjakan salah banyak oleh anjing itu!)",
                        "因为狗乱咬东西 (Karena suka menggigit barang)",
                        "因为狗不肯吃饭 (Karena tidak mau makan)"
                    ),
                    1,
                    "Pelanggan berargumen konyol: '昨天学校的作业它做错了很多！'."
                ),
                StoryQuestion(
                    "q_returngoods_4",
                    "这个故事让人捧腹大笑的荒谬之处在于什么？(Di mana letak keanehan konyol yang membuat pembaca tertawa?)",
                    listOf(
                        "Anjing itu ternyata pintar berhitung",
                        "Pembeli konyol menyalahkan anjing peliharaan karena tidak bisa mengerjakan PR sekolahnya!",
                        "Pemilik toko lupa memberi makanan",
                        "Anjing itu kabur dari toko"
                    ),
                    1,
                    "Puncak humor: pembeli mengira anjing pintar bisa dipekerjakan untuk mengerjakan tugas PR sekolahnya!"
                )
            )
        ),

        // Cerita Mandarin Bean 30: Eating Apple (Memakan Apel) (吃苹果)
        Story(
            id = "story_eating_apple",
            titleHanzi = "吃苹果",
            titlePinyin = "Chī Píngguǒ",
            titleTranslation = "Eating Apple (Memakan Apel)",
            level = "Fun, HSK 1",
            category = "Humor & Saudara",
            description = "Anekdot jenaka tentang seorang kakak yang menggunakan alasan mencicipi untuk memeriksa kebusukan apel, tetapi malah menghabiskan seluruh apel milik adiknya.",
            coverEmoji = "🍎",
            coverImageRes = R.drawable.cover_story_eating_apple,
            estimatedReadMinutes = 2,
            sentences = listOf(
                Sentence(
                    "s_eatingapple_1",
                    "星期日，爸爸妈妈都不在家，只有哥哥和弟弟两个人。",
                    "Xīngqīrì, bàba māma dōu bù zài jiā, zhǐ yǒu gēge hé dìdi liǎng gè rén.",
                    "Hari Minggu, ayah dan ibu semuanya tidak ada di rumah, hanya ada kakak dan adik laki-laki berdua.",
                    listOf(
                        WordToken("星期日", "xīngqīrì", "Hari Minggu", "Hari akhir pekan"),
                        WordToken("爸爸妈妈", "bàba māma", "Ayah dan ibu", "Orang tua"),
                        WordToken("都不在家", "dōu bù zài jiā", "Semua tidak di rumah", "Ketiadaan orang tua"),
                        WordToken("只有", "zhǐ yǒu", "Hanya ada", "Pembatasan subjek"),
                        WordToken("哥哥", "gēge", "Kakak laki-laki", "Saudara tua"),
                        WordToken("和", "hé", "Dan", "Kata sambung"),
                        WordToken("弟弟", "dìdi", "Adik laki-laki", "Saudara muda"),
                        WordToken("两个人", "liǎng gè rén", "Dua orang", "Kuantitas orang")
                    )
                ),
                Sentence(
                    "s_eatingapple_2",
                    "桌子上有一个苹果，弟弟看见了，说：“哥哥，我想吃苹果。”",
                    "Zhuōzi shang yǒu yí gè píngguǒ, dìdi kànjiàn le, shuō: “Gēge, wǒ xiǎng chī píngguǒ.”",
                    "Di atas meja ada sebuah apel, adik melihatnya dan berkata: “Kak, aku ingin makan apel.”",
                    listOf(
                        WordToken("桌子上", "zhuōzi shang", "Di atas meja", "Keterangan letak di meja"),
                        WordToken("有一个", "yǒu yí gè", "Ada sebuah", "Keberadaan benda"),
                        WordToken("苹果", "píngguǒ", "Apel", "Buah apel"),
                        WordToken("弟弟", "弟弟", "Adik laki-laki", "Subjek adik"),
                        WordToken("看见了", "kànjiàn le", "Melihatnya", "Melihat penampakan apel"),
                        WordToken("说", "shuō", "Berkata", "Kata kerja tutur"),
                        WordToken("哥哥", "gēge", "Kakak", "Panggilan hormat ke kakak"),
                        WordToken("我", "wǒ", "Saya / aku", "Pronomina pertama"),
                        WordToken("想吃", "xiǎng chī", "Ingin makan", "Keinginan santap"),
                        WordToken("苹果", "píngguǒ", "Apel", "Buah apel")
                    )
                ),
                Sentence(
                    "s_eatingapple_3",
                    "哥哥说：“可以啊，但是不知道苹果有没有坏。我先帮你尝尝。”说着，哥哥把苹果吃完了。",
                    "Gēge shuō: “Kěyǐ a, dànshì bù zhīdào píngguǒ yǒu méiyǒu huài. Wǒ xiān bāng nǐ chángchang.” Shuō zhe, gēge bǎ píngguǒ chī wán le.",
                    "Kakak berkata: “Boleh kok, tapi tidak tahu apelnya busuk atau tidak. Kakak cicipi dulu untukmu ya.” Sambil berkata begitu, sang kakak menghabiskan seluruh apelnya.",
                    listOf(
                        WordToken("哥哥", "gēge", "Kakak", "Subjek kakak"),
                        WordToken("说", "shuō", "Berkata", "Kata kerja tutur"),
                        WordToken("可以啊", "kěyǐ a", "Boleh kok", "Memberi persetujuan awal"),
                        WordToken("但是", "dànshì", "Tetapi", "Konjungsi pertentangan"),
                        WordToken("不知道", "bù zhīdào", "Tidak tahu", "Ketidakpastian"),
                        WordToken("苹果", "píngguǒ", "Apel", "Buah apel"),
                        WordToken("有没有坏", "yǒu méiyǒu huài", "Ada busuk atau tidak", "Kondisi kesegaran buah"),
                        WordToken("我先", "wǒ xiān", "Saya duluan", "Tindakan mendahului"),
                        WordToken("帮你", "bāng nǐ", "Membantumu", "Alasan menolong"),
                        WordToken("尝尝", "chángchang", "Mencicipi rasa", "Mencoba sedikit rasa"),
                        WordToken("说着", "shuō zhe", "Sambil berkata begitu", "Tindakan bersamaan dengan bicara"),
                        WordToken("哥哥", "gēge", "Kakak", "Subjek kakak"),
                        WordToken("把苹果", "bǎ píngguǒ", "Buah apel tersebut", "Partikel ba penegas objek"),
                        WordToken("吃完了", "chī wán le", "Dimakan habis", "Tindakan menghabiskan makanan")
                    )
                )
            ),
            questions = listOf(
                StoryQuestion(
                    "q_eatingapple_1",
                    "星期日家里只有谁在？(Siapa saja yang berada di rumah pada hari Minggu?)",
                    listOf(
                        "爸爸和妈妈 (Ayah dan ibu)",
                        "只有哥哥和弟弟两个人 (Hanya kakak dan adik berdua)",
                        "爷爷和奶奶 (Kakek dan nenek)",
                        "老师和同学 (Guru dan teman)"
                    ),
                    1,
                    "Teks menyatakan: '爸爸妈妈都不在家，只有哥哥和弟弟两个人'."
                ),
                StoryQuestion(
                    "q_eatingapple_2",
                    "弟弟看到桌上的苹果后向哥哥提出了什么要求？(Apa yang diminta adik setelah melihat apel di meja?)",
                    listOf(
                        "想把苹果扔掉 (Ingin membuang apel)",
                        "哥哥，我想吃苹果 (Kak, aku ingin makan apel)",
                        "想去超市再买几个 (Ingin beli lagi ke supermarket)",
                        "想画一张苹果的画 (Ingin menggambar apel)"
                    ),
                    1,
                    "Adik berkata jujur: '哥哥，我想吃苹果' (Kak, aku ingin makan apel)."
                ),
                StoryQuestion(
                    "q_eatingapple_3",
                    "哥哥借口什么理由先咬了苹果？(Alasan apa yang dipakai kakak untuk menggigit apel duluan?)",
                    listOf(
                        "自己肚子太饿 (Perutnya lapar sekali)",
                        "不知道苹果有没有坏，先帮弟弟尝尝 (Tidak tahu apelnya busuk atau tidak, ingin mencicipi dulu demi adik)",
                        "要拿去洗干净 (Mau mencucinya)",
                        "要切成两半 (Mau memotong jadi dua)"
                    ),
                    1,
                    "Kakak berdalih cerdik: '不知道苹果有没有坏。我先帮你尝尝'."
                ),
                StoryQuestion(
                    "q_eatingapple_4",
                    "故事令人发笑的结尾是什么？(Apa akhir cerita yang mengundang tawa?)",
                    listOf(
                        "Apelnya ternyata sangat masam",
                        "Sambil beralasan mencicipi, kakak malah memakan habis seluruh apel tersebut tanpa sisa!",
                        "Adik menangis kencang",
                        "Ibu pulang membawa sekantong apel"
                    ),
                    1,
                    "Puncak kelucuan: berniat mencicipi satu gigitan, sang kakak malah melahap habis seluruh buah apelnya sendirian!"
                )
            )
        ),

        // Cerita Mandarin Bean 31: Avoid Being Late (Menghindari Terlambat) (避免迟到)
        Story(
            id = "story_avoid_being_late",
            titleHanzi = "避免迟到",
            titlePinyin = "Bìmǐan Chídào",
            titleTranslation = "Avoid Being Late (Menghindari Terlambat)",
            level = "Fun, HSK 1",
            category = "Humor & Sekolah",
            description = "Anekdot polos tentang seorang anak yang berlari-lari di dalam bus kota dengan harapan bisa tiba di sekolah lebih cepat agar tidak terlambat.",
            coverEmoji = "🏃",
            coverImageRes = R.drawable.cover_story_avoid_being_late,
            estimatedReadMinutes = 2,
            sentences = listOf(
                Sentence(
                    "s_avoidlate_1",
                    "妈妈带儿子坐公共汽车去学校，谁知第一天就迟到了。第二天，儿子一上车就在车里跑了起来。",
                    "Māma dài érzi zuò gōnggòng qìchē qù xuéxiào, shéi zhī dì-yī tiān jiù chídào le. Dì-èr tiān, érzi yí shàng chē jiù zài chē lǐ pǎo le qǐlai.",
                    "Ibu mengajak putranya naik bus umum pergi ke sekolah, siapa sangka hari pertama sudah terlambat. Keesokan harinya, anak itu begitu naik bus langsung berlari-lari di dalam bus.",
                    listOf(
                        WordToken("妈妈", "māma", "Ibu", "Orang tua perempuan"),
                        WordToken("带儿子", "dài érzi", "Membawa putranya", "Mendampingi anak"),
                        WordToken("坐公共汽车", "zuò gōnggòng qìchē", "Naik bus umum", "Moda transportasi bus kota"),
                        WordToken("去学校", "qù xuéxiào", "Pergi ke sekolah", "Tujuan perjalanan"),
                        WordToken("谁知", "shéi zhī", "Siapa sangka / tak disangka", "Kejadian tak terduga"),
                        WordToken("第一天", "dì-yī tiān", "Hari pertama", "Hari permulaan"),
                        WordToken("就迟到了", "jiù chídào le", "Langsung terlambat", "Keterlambatan waktu"),
                        WordToken("第二天", "dì-èr tiān", "Hari kedua", "Keesokan hari"),
                        WordToken("儿子", "érzi", "Anak laki-laki", "Subjek putra"),
                        WordToken("一上车", "yí shàng chē", "Begitu naik kendaraan", "Tindakan seketika naik bus"),
                        WordToken("就在", "jiù zài", "Langsung di", "Penegasan lokasi"),
                        WordToken("车里", "chē lǐ", "Di dalam kendaraan bus", "Ruang interior bus"),
                        WordToken("跑了起来", "pǎo le qǐlai", "Mulai berlari-lari", "Aktivitas lari")
                    )
                ),
                Sentence(
                    "s_avoidlate_2",
                    "“你在做什么？快点儿坐下来！”妈妈说。",
                    "“Nǐ zài zuò shénme? Kuài diǎnr zuò xià lai!” Māma shuō.",
                    "“Kamu sedang melakukan apa? Cepat duduk!” kata ibu.",
                    listOf(
                        WordToken("你在做什么", "nǐ zài zuò shénme", "Kamu sedang apa?", "Pertanyaan keheranan ibu"),
                        WordToken("快点儿", "kuài diǎnr", "Cepatlah / lekas", "Desakan kesegeraan"),
                        WordToken("坐下来", "zuò xià lai", "Duduklah", "Perintah untuk duduk tenang"),
                        WordToken("妈妈", "māma", "Ibu", "Subjek ibu"),
                        WordToken("说", "shuō", "Berkata", "Kata kerja tutur")
                    )
                ),
                Sentence(
                    "s_avoidlate_3",
                    "“我和车子一起跑，这样就不会迟到了！”",
                    "“Wǒ hé chēzi yìqǐ pǎo, zhèyàng jiù bú huì chídào le!”",
                    "“Aku berlari bersama dengan bus ini, dengan begitu tidak akan terlambat lagi!”",
                    listOf(
                        WordToken("我和", "wǒ hé", "Saya dan", "Subjek gabungan"),
                        WordToken("车子", "chēzi", "Kendaraan / bus", "Bus yang melaju"),
                        WordToken("一起跑", "yìqǐ pǎo", "Berlari bersama-sama", "Berlari berbarengan"),
                        WordToken("这样", "zhèyàng", "Dengan begini / cara ini", "Metode yang diambil"),
                        WordToken("就不会", "jiù bú huì", "Maka tidak akan", "Pencegahan hasil buruk"),
                        WordToken("迟到了", "chídào le", "Terlambat", "Kondisi datang telat")
                    )
                )
            ),
            questions = listOf(
                StoryQuestion(
                    "q_avoidlate_1",
                    "妈妈和儿子第一天坐公共汽车上学发生了什么事？(Apa yang terjadi di hari pertama saat ibu dan anak naik bus ke sekolah?)",
                    listOf(
                        "他们在车上睡着了 (Mereka tertidur di bus)",
                        "第一天就迟到了 (Hari pertama langsung terlambat)",
                        "找不到学校 (Tidak menemukan sekolah)",
                        "汽车坏在半路了 (Bus mogok di jalan)"
                    ),
                    1,
                    "Teks menyatakan: '谁知第一天就迟到了' (Siapa sangka hari pertama sudah terlambat)."
                ),
                StoryQuestion(
                    "q_avoidlate_2",
                    "第二天上车后，儿子做出了什么反常举动？(Tindakan tak lazim apa yang dilakukan anak begitu naik bus di hari kedua?)",
                    listOf(
                        "大声唱歌 (Bernyanyi keras-keras)",
                        "一上车就在车厢里跑了起来 (Begitu naik langsung berlari-lari di dalam bus)",
                        "坐在车门旁边哭 (Duduk di pintu sambil menangis)",
                        "跟司机叔叔说话 (Mengajak supir mengobrol)"
                    ),
                    1,
                    "Anak itu bertingkah lucu: '第二天，儿子一上车就在车里跑了起来'."
                ),
                StoryQuestion(
                    "q_avoidlate_3",
                    "看到儿子在车里乱跑，妈妈说了什么？(Melihat anaknya berlari di dalam bus, apa teguran ibu?)",
                    listOf(
                        "你在做什么？快点儿坐下来！ (Kamu sedang apa? Cepat duduk!)",
                        "跑得真快！ (Lari cepat sekali!)",
                        "不要喝水 (Jangan minum air)",
                        "明天不要坐车了 (Besok tidak usah naik mobil)"
                    ),
                    0,
                    "Ibu menegur cemas: '你在做什么？快点儿坐下来！'."
                ),
                StoryQuestion(
                    "q_avoidlate_4",
                    "儿子在车里奔跑的荒唐逻辑是什么？(Apa logika konyol di balik anak yang berlari di dalam bus?)",
                    listOf(
                        "Karena kakinya kram",
                        "Dia mengira jika dia ikut berlari di dalam bus yang melaju, kecepatannya bertambah sehingga tidak akan terlambat!",
                        "Karena takut pada penumpang lain",
                        "Karena ingin berolahraga pagi"
                    ),
                    1,
                    "Kelucuan puncak: anak berpikir polos bahwa berlari di dalam bus yang berjalan (*'我和车子一起跑'*) akan membuat mereka melaju dobel cepat!"
                )
            )
        ),

        // Cerita Mandarin Bean 32: Three Years Old (Tiga Tahun) (三岁)
        Story(
            id = "story_three_years_old",
            titleHanzi = "三岁",
            titlePinyin = "Sān Suì",
            titleTranslation = "Three Years Old (Tiga Tahun)",
            level = "HSK 1",
            category = "Humor & Keluarga",
            description = "Percakapan manis dan menggelitik antara ibu dan putranya yang berusia 3 tahun tentang mengapa umur sang ayah juga tiga tahun.",
            coverEmoji = "🎂",
            coverImageRes = R.drawable.cover_story_three_years_old,
            estimatedReadMinutes = 2,
            sentences = listOf(
                Sentence(
                    "s_threeyears_1",
                    "妈妈问儿子：“你今年几岁了？”",
                    "Māma wèn érzi: “Nǐ jīnnián jǐ suì le?”",
                    "Ibu bertanya kepada putranya: “Kamu tahun ini berumur berapa tahun?”",
                    listOf(
                        WordToken("妈妈", "māma", "Ibu", "Panggilan orang tua perempuan"),
                        WordToken("问", "wèn", "Bertanya", "Kata kerja tutur"),
                        WordToken("儿子", "érzi", "Anak laki-laki", "Putra kandung"),
                        WordToken("你今年", "nǐ jīnnián", "Kamu tahun ini", "Subjek + keterangan waktu"),
                        WordToken("几岁了", "jǐ suì le", "Berapa tahun umurnya?", "Pertanyaan usia anak")
                    )
                ),
                Sentence(
                    "s_threeyears_2",
                    "儿子回答：“我今年三岁了。”",
                    "Érzi huídá: “Wǒ jīnnián sān suì le.”",
                    "Putranya menjawab: “Aku tahun ini berumur tiga tahun.”",
                    listOf(
                        WordToken("儿子", "érzi", "Putra", "Subjek anak"),
                        WordToken("回答", "huídá", "Menjawab", "Memberikan respons"),
                        WordToken("我今年", "wǒ jīnnián", "Saya tahun ini", "Usia saat ini"),
                        WordToken("三岁了", "sān suì le", "Tiga tahun", "Umur 3 tahun")
                    )
                ),
                Sentence(
                    "s_threeyears_3",
                    "妈妈又问：“那爸爸几岁了？”",
                    "Māma yòu wèn: “Nà bàba jǐ suì le?”",
                    "Ibu bertanya lagi: “Kalau begitu ayah berumur berapa tahun?”",
                    listOf(
                        WordToken("妈妈", "māma", "Ibu", "Subjek ibu"),
                        WordToken("又问", "yòu wèn", "Bertanya lagi", "Pertanyaan lanjutan"),
                        WordToken("那爸爸", "nà bàba", "Kalau begitu ayah", "Menanyakan orang tua pria"),
                        WordToken("几岁了", "jǐ suì le", "Berapa tahun umurnya?", "Menanyakan usia")
                    )
                ),
                Sentence(
                    "s_threeyears_4",
                    "儿子说：“爸爸也三岁。”",
                    "Érzi shuō: “Bàba yě sān suì.”",
                    "Putranya menjawab: “Ayah juga berumur tiga tahun.”",
                    listOf(
                        WordToken("儿子", "érzi", "Putra", "Subjek anak"),
                        WordToken("说", "shuō", "Berkata", "Kata kerja tutur"),
                        WordToken("爸爸", "bàba", "Ayah", "Orang tua laki-laki"),
                        WordToken("也三岁", "yě sān suì", "Juga tiga tahun", "Menyamakan umur ayah")
                    )
                ),
                Sentence(
                    "s_threeyears_5",
                    "妈妈很奇怪：“爸爸为什么只有三岁呢？”",
                    "Māma hěn qíguài: “Bàba wèi shénme zhǐ yǒu sān suì ne?”",
                    "Ibu merasa sangat heran: “Mengapa ayah hanya berumur tiga tahun ya?”",
                    listOf(
                        WordToken("妈妈", "māma", "Ibu", "Subjek ibu"),
                        WordToken("很奇怪", "hěn qíguài", "Sangat heran / aneh", "Rasa takjub penasaran"),
                        WordToken("爸爸", "bàba", "Ayah", "Sosok ayah"),
                        WordToken("为什么", "wèi shénme", "Mengapa / kenapa", "Menanyakan alasan"),
                        WordToken("只有", "zhǐ yǒu", "Hanya ada", "Pembatasan jumlah"),
                        WordToken("三岁", "sān suì", "Tiga tahun", "Usia 3 tahun"),
                        WordToken("呢", "ne", "Ya?", "Partikel tanya heran")
                    )
                ),
                Sentence(
                    "s_threeyears_6",
                    "“因为爸爸是在我出生那一天才变成爸爸的！”",
                    "“Yīnwèi bàba shì zài wǒ chūshēng nà yì tiān cái biànchéng bàba de!”",
                    "“Karena ayah baru resmi menjadi ayah pada hari saat aku dilahirkan!”",
                    listOf(
                        WordToken("因为爸爸", "yīnwèi bàba", "Karena ayah", "Alasan terkait ayah"),
                        WordToken("是在我", "shì zài wǒ", "Adalah saat saya", "Konstruksi penegas waktu"),
                        WordToken("出生", "chūshēng", "Lahir / dilahirkan", "Kelahiran bayi ke dunia"),
                        WordToken("那一天", "nà yì tiān", "Pada hari itu", "Hari spesifik momen kelahiran"),
                        WordToken("才变成", "cái biànchéng", "Baru berubah menjadi", "Baru resmi menyandang status"),
                        WordToken("爸爸的", "bàba de", "Seorang ayah", "Peran sebagai ayah")
                    )
                )
            ),
            questions = listOf(
                StoryQuestion(
                    "q_threeyears_1",
                    "儿子今年多少岁？(Berapa umur putra kecil itu tahun ini?)",
                    listOf(
                        "两岁 (2 tahun)",
                        "三岁 (3 tahun)",
                        "四岁 (4 tahun)",
                        "五岁 (5 tahun)"
                    ),
                    1,
                    "Anak itu menjawab: '我今年三岁了' (Saya tahun ini berumur 3 tahun)."
                ),
                StoryQuestion(
                    "q_threeyears_2",
                    "儿子认为爸爸今年几岁？(Menurut si anak, berapa umur ayahnya?)",
                    listOf(
                        "三十岁 (30 tahun)",
                        "也三岁 (Juga 3 tahun)",
                        "五十岁 (50 tahun)",
                        "十岁 (10 tahun)"
                    ),
                    1,
                    "Anak itu dengan yakin berkata: '爸爸也三岁' (Ayah juga berumur 3 tahun)."
                ),
                StoryQuestion(
                    "q_threeyears_3",
                    "妈妈听到儿子的回答后心情怎样？(Bagaimana perasaan ibu setelah mendengar jawaban putranya?)",
                    listOf(
                        "很生气 (Sangat marah)",
                        "很奇怪 (Sangat heran dan penasaran)",
                        "害怕 (Takut)",
                        "难过 (Sedih)"
                    ),
                    1,
                    "Teks menyatakan: '妈妈很奇怪：爸爸为什么只有三岁呢？' (Ibu merasa sangat aneh dan heran)."
                ),
                StoryQuestion(
                    "q_threeyears_4",
                    "儿子解释爸爸只有3岁的暖心又搞笑的理由是什么？(Apa alasan cerdas nan manis dari si anak mengapa ayahnya baru berumur 3 tahun?)",
                    listOf(
                        "Karena ayah bertubuh pendek",
                        "Karena ayah baru resmi berubah status menjadi 'ayah' pada hari saat anaknya lahir 3 tahun yang lalu!",
                        "Karena ayah suka mainan anak-anak",
                        "Karena ayah sering lupa umur aslinya"
                    ),
                    1,
                    "Sentuhan manis penuh tawa: status seorang pria menjadi 'ayah' memang dimulai tepat saat anaknya lahir ke dunia!"
                )
            )
        ),

        // Cerita Mandarin Bean 33: The Reason for the Hit (Alasan Dipukul) (挨打的原因)
        Story(
            id = "story_the_reason_for_the_hit",
            titleHanzi = "挨打的原因",
            titlePinyin = "Áidǎ de Yuányīn",
            titleTranslation = "The Reason for the Hit (Alasan Dipukul)",
            level = "Fun, HSK 1",
            category = "Humor & Keluarga",
            description = "Anekdot kocak tentang Xiao Gang yang dipukul dua kali oleh ayahnya gara-gara lembar kertas ujian bernilai nol.",
            coverEmoji = "📝",
            coverImageRes = R.drawable.cover_story_the_reason_for_the_hit,
            estimatedReadMinutes = 2,
            sentences = listOf(
                Sentence(
                    "s_reasonhit_1",
                    "小刚说：“妈妈，爸爸今天打了我两次！”",
                    "Xiǎogāng shuō: “Māma, bàba jīntiān dǎ le wǒ liǎng cì!”",
                    "Xiao Gang berkata: “Ibu, ayah hari ini memukulku dua kali!”",
                    listOf(
                        WordToken("小刚", "Xiǎogāng", "Xiao Gang", "Nama anak laki-laki"),
                        WordToken("说", "shuō", "Berkata", "Kata kerja tutur"),
                        WordToken("妈妈", "māma", "Ibu", "Panggilan ibu"),
                        WordToken("爸爸", "bàba", "Ayah", "Subjek ayah"),
                        WordToken("今天", "jīntiān", "Hari ini", "Keterangan waktu"),
                        WordToken("打了我", "dǎ le wǒ", "Memukul saya", "Tindakan memberi hukuman fisik"),
                        WordToken("两次", "liǎng cì", "Dua kali", "Frekuensi hukuman")
                    )
                ),
                Sentence(
                    "s_reasonhit_2",
                    "妈妈问：“你做了什么？”",
                    "Māma wèn: “Nǐ zuò le shénme?”",
                    "Ibu bertanya: “Apa yang telah kamu perbuat?”",
                    listOf(
                        WordToken("妈妈", "māma", "Ibu", "Subjek ibu"),
                        WordToken("问", "wèn", "Bertanya", "Kata kerja tutur"),
                        WordToken("你", "nǐ", "Kamu", "Pronomina kedua"),
                        WordToken("做了什么", "zuò le shénme", "Telah melakukan apa?", "Menanyakan perbuatan penyebab")
                    )
                ),
                Sentence(
                    "s_reasonhit_3",
                    "小刚回答：“第一次是因为我给他看了一张零分的试卷。”",
                    "Xiǎogāng huídá: “Dì-yī cì shì yīnwèi wǒ gěi tā kàn le yì zhāng líng fēn de shìjuàn.”",
                    "Xiao Gang menjawab: “Kali pertama karena aku memperlihatkan kepadanya selembar kertas ujian bernilai nol.”",
                    listOf(
                        WordToken("小刚", "Xiǎogāng", "Xiao Gang", "Subjek anak"),
                        WordToken("回答", "huídá", "Menjawab", "Memberi jawaban"),
                        WordToken("第一次", "dì-yī cì", "Kali pertama", "Peristiwa pertama"),
                        WordToken("是因为", "shì yīnwèi", "Adalah karena", "Alasan penyebab"),
                        WordToken("我给他", "wǒ gěi tā", "Saya kepadanya", "Menunjukkan kepada ayah"),
                        WordToken("看了", "kàn le", "Melihat / memperlihatkan", "Memperlihatkan barang"),
                        WordToken("一张", "yì zhāng", "Selembar", "Kata bantu bilangan lembar"),
                        WordToken("零分的", "líng fēn de", "Bernilai nol (0)", "Nilai terendah ujian"),
                        WordToken("试卷", "shìjuàn", "Kertas ujian", "Lembaran hasil tes")
                    )
                ),
                Sentence(
                    "s_reasonhit_4",
                    "“那第二次呢？”妈妈问。",
                    "“Nà dì-èr cì ne?” Māma wèn.",
                    "“Lalu kali kedua kenapa?” tanya ibu.",
                    listOf(
                        WordToken("那第二次呢", "nà dì-èr cì ne", "Lalu kali kedua bagaimana?", "Menanyakan alasan kedua"),
                        WordToken("妈妈", "māma", "Ibu", "Subjek ibu"),
                        WordToken("问", "wèn", "Bertanya", "Kata kerja tutur")
                    )
                ),
                Sentence(
                    "s_reasonhit_5",
                    "小刚回答：“我告诉他，那张是他小时候的试卷。”",
                    "Xiǎogāng huídá: “Wǒ gàosu tā, nà zhāng shì tā xiǎoshíhou de shìjuàn.”",
                    "Xiao Gang menjawab: “Aku memberi tahunya, bahwa kertas ujian itu adalah lembar ujian ayah sendiri saat masih kecil dulu.”",
                    listOf(
                        WordToken("小刚", "Xiǎogāng", "Xiao Gang", "Subjek anak"),
                        WordToken("回答", "huídá", "Menjawab", "Memberi keterangan"),
                        WordToken("我告诉他", "wǒ gàosu tā", "Saya memberitahunya", "Menyampaikan fakta"),
                        WordToken("那张是", "nà zhāng shì", "Lembaran itu adalah", "Identitas kertas"),
                        WordToken("他", "tā", "Dia / ayah", "Pronomina orang ketiga"),
                        WordToken("小时候的", "xiǎoshíhou de", "Semasa kecil", "Masa kanak-kanak ayah"),
                        WordToken("试卷", "shìjuàn", "Kertas ujian", "Lembar hasil tes")
                    )
                )
            ),
            questions = listOf(
                StoryQuestion(
                    "q_reasonhit_1",
                    "今天爸爸一共打了小刚几次？(Berapa kali ayah memukul Xiao Gang hari ini?)",
                    listOf(
                        "一次 (1 kali)",
                        "两次 (2 kali)",
                        "三次 (3 kali)",
                        "没有打他 (Tidak memukul)"
                    ),
                    1,
                    "Xiao Gang mengadu: '爸爸今天打了我两次！' (Ayah hari ini memukulku dua kali!)."
                ),
                StoryQuestion(
                    "q_reasonhit_2",
                    "小刚第一次挨打是因为什么？(Mengapa Xiao Gang dipukul untuk kali pertama?)",
                    listOf(
                        "打碎了家里的花瓶 (Memecahkan vas bunga)",
                        "拿了一张零分的试卷给爸爸看 (Memperlihatkan kertas ujian nilai nol kepada ayah)",
                        "没有做作业 (Tidak buat PR)",
                        "偷偷在外面玩水 (Main air di luar)"
                    ),
                    1,
                    "Xiao Gang berkata: '第一次是因为我给他看了一张零分的试卷'."
                ),
                StoryQuestion(
                    "q_reasonhit_3",
                    "那张得零分的试卷其实是谁的？(Kertas ujian nilai nol itu sebenarnya milik siapa?)",
                    listOf(
                        "小刚自己的 (Milik Xiao Gang sendiri)",
                        "爸爸小时候的试卷 (Kertas ujian milik ayah waktu masih kecil dulu)",
                        "同班同学的 (Milik teman sekelas)",
                        "邻居家哥哥的 (Milik anak tetangga)"
                    ),
                    1,
                    "Fakta mengejutkan: '那张是他小时候的试卷' (Kertas ujian itu milik ayah semasa kecil!)."
                ),
                StoryQuestion(
                    "q_reasonhit_4",
                    "爸爸为什么第二次还要打小刚？(Mengapa ayah memukul Xiao Gang untuk kedua kalinya?)",
                    listOf(
                        "Karena Xiao Gang menertawakan dan membongkar aib masa lalu ayahnya yang pernah dapat nilai nol!",
                        "Karena kertas ujiannya sobek",
                        "Karena Xiao Gang belum mandi",
                        "Karena ibu menyuruh ayah memukulnya"
                    ),
                    0,
                    "Puncak kelucuan: ayah yang tadinya marah menyangka anaknya dapat nilai nol, menjadi malu dan gengsi saat tahu itu adalah lembar ujian dirinya sendiri waktu kecil!"
                )
            )
        ),

        // Cerita Mandarin Bean 34: Really Don't Know (Benar-benar Tidak Tahu) (真的不知道)
        Story(
            id = "story_really_dont_know",
            titleHanzi = "真的不知道",
            titlePinyin = "Zhēn de Bù Zhīdào",
            titleTranslation = "Really Don't Know (Benar-benar Tidak Tahu)",
            level = "Fun, HSK 1",
            category = "Humor & Sekolah",
            description = "Anekdot cerdas tentang seorang murid yang jujur mengakui di kelas bahwa ia tidak tahu cara mengerjakan soal karena ayahnya belum selesai mengerjakan PR-nya tadi malam.",
            coverEmoji = "❓",
            coverImageRes = R.drawable.cover_story_really_dont_know,
            estimatedReadMinutes = 2,
            sentences = listOf(
                Sentence(
                    "s_reallydontknow_1",
                    "老师对一个学生说：“你来说说这道题怎么做。”",
                    "Lǎoshī duì yí gè xuésheng shuō: “Nǐ lái shuō shuo zhè dào tí zěnme zuò.”",
                    "Guru berkata kepada seorang murid: “Coba kamu jelaskan bagaimana cara mengerjakan soal ini.”",
                    listOf(
                        WordToken("老师", "lǎoshī", "Guru", "Pengajar"),
                        WordToken("对一个", "duì yí gè", "Kepada seorang", "Arah sasaran bicara"),
                        WordToken("学生", "xuésheng", "Murid / siswa", "Pelajar"),
                        WordToken("说", "shuō", "Berkata", "Kata kerja tutur"),
                        WordToken("你来", "nǐ lái", "Kamu coba / silakan", "Perintah ajakan santun"),
                        WordToken("说说", "shuō shuo", "Jelaskan / katakan", "Menuturkan penjelasan"),
                        WordToken("这道题", "zhè dào tí", "Soal ini", "Butir soal ujian/latihan"),
                        WordToken("怎么做", "zěnme zuò", "Bagaimana mengerjakannya", "Cara menyelesaikan soal")
                    )
                ),
                Sentence(
                    "s_reallydontknow_2",
                    "学生说：“我不知道，老师。”",
                    "Xuésheng shuō: “Wǒ bù zhīdào, lǎoshī.”",
                    "Murid itu menjawab: “Saya tidak tahu, Guru.”",
                    listOf(
                        WordToken("学生", "xuésheng", "Murid", "Subjek pelajar"),
                        WordToken("说", "shuō", "Berkata", "Kata kerja tutur"),
                        WordToken("我不知道", "wǒ bù zhīdào", "Saya tidak tahu", "Pernyataan ketidaktahuan"),
                        WordToken("老师", "lǎoshī", "Guru", "Panggilan hormat guru")
                    )
                ),
                Sentence(
                    "s_reallydontknow_3",
                    "老师问：“怎么会不知道呢？从昨天的作业看，你已经会做了呀。”",
                    "Lǎoshī wèn: “Zěnme huì bù zhīdào ne? Cóng zuótiān de zuòyè kàn, nǐ yǐjīng huì zuò le ya.”",
                    "Guru bertanya: “Bagaimana bisa tidak tahu? Dilihat dari PR kemarin, kamu kan sudah bisa mengerjakannya.”",
                    listOf(
                        WordToken("老师", "lǎoshī", "Guru", "Subjek guru"),
                        WordToken("问", "wèn", "Bertanya", "Kata kerja tutur"),
                        WordToken("怎么会", "zěnme huì", "Bagaimana bisa", "Pertanyaan keheranan"),
                        WordToken("不知道呢", "bù zhīdào ne", "Tidak tahu ya?", "Ketidaktahuan"),
                        WordToken("从", "cóng", "Dilihat dari / dari", "Berdasarkan sumber acuan"),
                        WordToken("昨天的", "zuótiān de", "Yang kemarin", "Keterangan waktu kemarin"),
                        WordToken("作业看", "zuòyè kàn", "Dilihat dari tugas PR", "Bukti pengerjaan PR"),
                        WordToken("你", "nǐ", "Kamu", "Pronomina kedua"),
                        WordToken("已经", "yǐjīng", "Sudah", "Keterangan telah mampu"),
                        WordToken("会做了呀", "huì zuò le ya", "Sudah bisa mengerjakannya lho", "Kemampuan menyelesaikan soal")
                    )
                ),
                Sentence(
                    "s_reallydontknow_4",
                    "学生说：“我真的不知道，昨天我睡觉的时候，爸爸还没做到这道题呢！”",
                    "Xuésheng shuō: “Wǒ zhēn de bù zhīdào, zuótiān wǒ shuìjiào de shíhou, bàba hái méi zuò dào zhè dào tí ne!”",
                    "Murid itu berkata: “Saya benar-benar tidak tahu, kemarin waktu saya tidur, Ayah belum sampai mengerjakan nomor soal ini kok!”",
                    listOf(
                        WordToken("学生", "xuésheng", "Murid", "Subjek murid"),
                        WordToken("说", "shuō", "Berkata", "Kata kerja tutur"),
                        WordToken("我真的", "wǒ zhēn de", "Saya sungguh-sungguh / benar-benar", "Penegasan kejujuran"),
                        WordToken("不知道", "bù zhīdào", "Tidak tahu", "Ketidaktahuan"),
                        WordToken("昨天", "zuótiān", "Kemarin", "Waktu malam kemarin"),
                        WordToken("我睡觉的", "wǒ shuìjiào de", "Saat saya tidur", "Aktivitas istirahat malam"),
                        WordToken("时候", "shíhou", "Ketika / sewaktu", "Keterangan waktu"),
                        WordToken("爸爸", "bàba", "Ayah", "Subjek yang mengerjakan PR sebenarnya"),
                        WordToken("还没做到", "hái méi zuò dào", "Masih belum sampai mengerjakan", "Progress pengerjaan"),
                        WordToken("这道题", "zhè dào tí", "Nomor soal ini", "Soal yang ditanyakan guru"),
                        WordToken("呢", "ne", "Kok / lho", "Partikel penegas retoris polos")
                    )
                )
            ),
            questions = listOf(
                StoryQuestion(
                    "q_reallydontknow_1",
                    "老师在课堂上要求学生做什么？(Apa yang diminta guru kepada murid di kelas?)",
                    listOf(
                        "朗读课文 (Membaca teks cerita)",
                        "说说这道题怎么做 (Menjelaskan cara mengerjakan soal ini)",
                        "擦黑板 (Menghapus papan tulis)",
                        "默写生词 (Dikte kosakata)"
                    ),
                    1,
                    "Guru meminta murid menjawab: '你来说说这道题怎么做'."
                ),
                StoryQuestion(
                    "q_reallydontknow_2",
                    "老师为什么坚信这位学生应该会做这道题？(Mengapa guru yakin murid itu seharusnya bisa mengerjakan soal tersebut?)",
                    listOf(
                        "因为他是全班第一名 (Karena juara kelas)",
                        "因为从昨天的作业来看，他已经全部做对了 (Karena dari PR kemarin terlihat sudah bisa dikerjakan)",
                        "因为题目非常简单 (Karena soalnya terlalu mudah)",
                        "因为他在黑板上写过 (Karena pernah menulis di papan tulis)"
                    ),
                    1,
                    "Guru heran: '从昨天的作业看，你已经会做了呀'."
                ),
                StoryQuestion(
                    "q_reallydontknow_3",
                    "昨天的家庭作业到底是谁做的？(Sebenarnya siapa yang mengerjakan tugas PR kemarin?)",
                    listOf(
                        "学生自己认真做的 (Dikerjakan sendiri oleh murid)",
                        "学生的爸爸做的 (Dikerjakan oleh ayahnya!)",
                        "抄同桌的 (Mencontek teman sebangku)",
                        "妈妈帮忙写的 (Dituliskan oleh ibu)"
                    ),
                    1,
                    "Rahasia terbongkar: ayahnya yang mengerjakan PR tersebut di malam hari!"
                ),
                StoryQuestion(
                    "q_reallydontknow_4",
                    "学生的诚实回答让人发笑的原因是什么？(Mengapa jawaban jujur murid itu mengundang tawa?)",
                    listOf(
                        "Karena tanpa sengaja ia membocorkan bahwa semua PR-nya dikerjakan oleh ayahnya saat dia sudah tertidur!",
                        "Karena dia salah sebut nama ayahnya",
                        "Karena guru memberi nilai 100",
                        "Karena dia menangis di kelas"
                    ),
                    0,
                    "Kepolosan anak yang tanpa rasa bersalah mengakui bahwa ayahnya belum sempat menyelesaikan soal tersebut saat dia tidur!"
                )
            )
        ),

        // Cerita Mandarin Bean 35: Check Homework (Memeriksa PR) (检查作业)
        Story(
            id = "story_check_homework",
            titleHanzi = "检查作业",
            titlePinyin = "Jiǎnchá Zuòyè",
            titleTranslation = "Check Homework (Memeriksa PR)",
            level = "Fun, HSK 1",
            category = "Humor & Pendidikan",
            description = "Trik cerdas seorang ibu yang bertukar peran dengan anaknya dalam mengerjakan PR, membuat anak belajar dengan antusias tanpa merasa terbebani.",
            coverEmoji = "🔍",
            coverImageRes = R.drawable.cover_story_check_homework,
            estimatedReadMinutes = 2,
            sentences = listOf(
                Sentence(
                    "s_checkhw_1",
                    "有一天，妈妈陪着她六岁的女儿学习。",
                    "Yǒu yì tiān, māma péi zhe tā liù suì de nǚ'ér xuéxí.",
                    "Suatu hari, ibu menemani putrinya yang berusia enam tahun belajar.",
                    listOf(
                        WordToken("有一天", "yǒu yì tiān", "Suatu hari", "Keterangan waktu pada suatu hari"),
                        WordToken("妈妈", "māma", "Ibu", "Orang tua perempuan"),
                        WordToken("陪着", "péi zhe", "Menemani / mendampingi", "Aktivitas mendampingi"),
                        WordToken("她六岁的", "tā liù suì de", "Yang berusia 6 tahun", "Keterangan umur anak"),
                        WordToken("女儿", "nǚ'ér", "Putri / anak perempuan", "Anak kandung perempuan"),
                        WordToken("学习", "xuéxí", "Belajar", "Kegiatan belajar")
                    )
                ),
                Sentence(
                    "s_checkhw_2",
                    "女儿突然说：“妈妈，你真幸福，都不用做作业。”妈妈回答：“那我帮你写作业，你来检查，好吗？”女儿高兴地答应了。",
                    "Nǚ'ér tūrán shuō: “Māma, nǐ zhēn xìngfú, dōu bú yòng zuò zuòyè.” Māma huídá: “Nà wǒ bāng nǐ xiě zuòyè, nǐ lái jiǎnchá, hǎo ma?” Nǚ'ér gāoxìng de dāying le.",
                    "Putrinya tiba-tiba berkata: “Ibu, Ibu sungguh beruntung, sama sekali tidak perlu membuat PR.” Ibu menjawab: “Kalau begitu Ibu bantu kamu menuliskan PR-nya, lalu kamu yang memeriksa, bagaimana?” Putrinya dengan senang hati menyetujuinya.",
                    listOf(
                        WordToken("女儿", "nǚ'ér", "Anak perempuan", "Subjek anak"),
                        WordToken("突然说", "tūrán shuō", "Tiba-tiba berkata", "Ucapan mendadak"),
                        WordToken("妈妈", "māma", "Ibu", "Panggilan ibu"),
                        WordToken("你真幸福", "nǐ zhēn xìngfú", "Ibu sungguh bahagia / beruntung", "Pernyataan iri pada status orang dewasa"),
                        WordToken("都不用", "dōu bú yòng", "Sama sekali tidak perlu", "Bebas dari keharusan"),
                        WordToken("做作业", "zuò zuòyè", "Membuat PR", "Tugas pekerjaan rumah"),
                        WordToken("妈妈", "māma", "Ibu", "Subjek ibu"),
                        WordToken("回答", "huídá", "Menjawab", "Tanggapan cerdik ibu"),
                        WordToken("那我帮你", "nà wǒ bāng nǐ", "Kalau begitu Ibu membantumu", "Tawaran peran"),
                        WordToken("写作业", "xiě zuòyè", "Menulis PR", "Menuliskan jawaban"),
                        WordToken("你来检查", "nǐ lái jiǎnchá", "Kamu yang memeriksa", "Peran sebagai pemeriksa/guru"),
                        WordToken("好吗", "hǎo ma", "Bolehkah / setuju?", "Menanyakan kesepakatan"),
                        WordToken("女儿", "nǚ'ér", "Anak perempuan", "Subjek anak"),
                        WordToken("高兴地", "gāoxìng de", "Dengan senang gembira", "Perasaan antusias"),
                        WordToken("答应了", "dāying le", "Menyetujuinya", "Menerima tawaran")
                    )
                ),
                Sentence(
                    "s_checkhw_3",
                    "检查作业时，女儿把作业都做了一遍。",
                    "Jiǎnchá zuòyè shí, nǚ'ér bǎ zuòyè dōu zuò le yí biàn.",
                    "Saat memeriksa PR, sang anak mengerjakan ulang seluruh soal tugasnya dari awal sampai akhir.",
                    listOf(
                        WordToken("检查作业时", "jiǎnchá zuòyè shí", "Saat memeriksa PR", "Keterangan waktu proses koreksi"),
                        WordToken("女儿", "nǚ'ér", "Anak perempuan", "Subjek anak"),
                        WordToken("把作业", "bǎ zuòyè", "Semua tugas PR tersebut", "Partikel ba penegas objek"),
                        WordToken("都做了一遍", "dōu zuò le yí biàn", "Semuanya dikerjakan ulang satu kali", "Menuntaskan seluruh soal sendiri")
                    )
                )
            ),
            questions = listOf(
                StoryQuestion(
                    "q_checkhw_1",
                    "女儿今年几岁了？(Berapa usia anak perempuan dalam cerita?)",
                    listOf(
                        "五岁 (5 tahun)",
                        "六岁 (6 tahun)",
                        "七岁 (7 tahun)",
                        "八岁 (8 tahun)"
                    ),
                    1,
                    "Di kalimat pertama tertulis: '妈妈陪着她六岁的女儿学习' (Ibu menemani putrinya yang berumur 6 tahun)."
                ),
                StoryQuestion(
                    "q_checkhw_2",
                    "女儿为什么羡慕妈妈“真幸福”？(Mengapa anak perempuan merasa ibunya sangat beruntung?)",
                    listOf(
                        "因为妈妈不用做作业 (Karena ibu tidak perlu membuat PR)",
                        "因为妈妈有好多零食 (Karena ibu punya banyak camilan)",
                        "因为妈妈可以晚睡 (Karena ibu boleh tidur larut)",
                        "因为妈妈有很多漂亮的衣服 (Karena ibu punya banyak baju bagus)"
                    ),
                    0,
                    "Anak itu mengeluh polos: '妈妈，你真幸福，都不用做作业'."
                ),
                StoryQuestion(
                    "q_checkhw_3",
                    "妈妈想出了什么巧妙的办法？(Trik cerdas apa yang dipikirkan oleh sang ibu?)",
                    listOf(
                        "让爸爸来教女儿 (Menyuruh ayah mengajar)",
                        "妈妈帮女儿写作业，由女儿当小老师来检查 (Ibu yang menuliskan PR, lalu anak bertugas memeriksa layaknya guru)",
                        "直接帮女儿把作业收起来 (Menyimpan buku tugas)",
                        "答应做完作业就给买冰淇淋 (Menjanjikan es krim)"
                    ),
                    1,
                    "Ibu membalik peran dengan brilian: '那我帮你写作业，你来检查，好吗？'."
                ),
                StoryQuestion(
                    "q_checkhw_4",
                    "这个教学计谋最终收到了什么效果？(Hasil apa yang diperoleh dari strategi ibu tersebut?)",
                    listOf(
                        "Ibu merasa kelelahan menulis",
                        "Demi bisa memeriksa PR dengan benar, anak tanpa sadar justru mengerjakan dan menuntaskan seluruh soal tugasnya sendiri!",
                        "Anak tidur di meja belajar",
                        "PR-nya menjadi rusak"
                    ),
                    1,
                    "Kejeniusan seorang ibu: '检查作业时，女儿把作业都做了一遍' (Saat bertindak sebagai pemeriksa, anak justru menghitung dan menyelesaikan setiap soal dengan teliti!)."
                )
            )
        ),

        // Cerita Mandarin Bean 36: Plate (Piring) (盘子)
        Story(
            id = "story_plate",
            titleHanzi = "盘子",
            titlePinyin = "Pánzi",
            titleTranslation = "Plate (Piring)",
            level = "HSK 1",
            category = "Humor & Keluarga",
            description = "Anekdot kocak tentang seorang anak yang dengan tepat menebak bahwa ibunya yang memecahkan piring di dapur karena tidak terdengar suara omelan sama sekali.",
            coverEmoji = "🍽️",
            coverImageRes = R.drawable.cover_story_plate,
            estimatedReadMinutes = 2,
            sentences = listOf(
                Sentence(
                    "s_plate_1",
                    "有一天，妈妈和女儿一起洗盘子，爸爸和儿子一起看电视。",
                    "Yǒu yì tiān, māma hé nǚ'ér yìqǐ xǐ pánzi, bàba hé érzi yìqǐ kàn diànshì.",
                    "Suatu hari, ibu dan anak perempuan bersama-sama mencuci piring, ayah dan anak laki-laki bersama-sama menonton TV.",
                    listOf(
                        WordToken("有一天", "yǒu yì tiān", "Suatu hari", "Keterangan waktu pada suatu hari"),
                        WordToken("妈妈和女儿", "māma hé nǚ'ér", "Ibu dan anak perempuan", "Dua anggota keluarga perempuan"),
                        WordToken("一起", "yìqǐ", "Bersama-sama", "Melakukan kegiatan bersama"),
                        WordToken("洗盘子", "xǐ pánzi", "Mencuci piring", "Mencuci perabot makan piring"),
                        WordToken("爸爸和儿子", "bàba hé érzi", "Ayah dan anak laki-laki", "Dua anggota keluarga laki-laki"),
                        WordToken("一起", "yìqǐ", "Bersama-sama", "Bersama"),
                        WordToken("看电视", "kàn diànshì", "Menonton TV", "Menyaksikan siaran televisi")
                    )
                ),
                Sentence(
                    "s_plate_2",
                    "突然，他们听见打破盘子的声音。儿子看着他父亲，说：“一定是妈妈打破的。”",
                    "Tūrán, tāmen tīngjiàn dǎ pò pánzi de shēngyīn. Érzi kàn zhe tā fùqīn, shuō: “Yídìng shì māma dǎ pò de.”",
                    "Tiba-tiba, mereka mendengar suara piring pecah. Anak laki-laki memandangi ayahnya, lalu berkata: “Pasti Ibu yang memecahkannya.”",
                    listOf(
                        WordToken("突然", "tūrán", "Tiba-tiba", "Kejadian mendadak tak terduga"),
                        WordToken("他们", "tāmen", "Mereka", "Ayah dan anak"),
                        WordToken("听见", "tīngjiàn", "Mendengar", "Menangkap bunyi suara"),
                        WordToken("打破盘子的", "dǎ pò pánzi de", "Piring pecah", "Kerusakan piring pecah terbelah"),
                        WordToken("声音", "shēngyīn", "Bunyi suara", "Suara pecahan piring"),
                        WordToken("儿子", "érzi", "Anak laki-laki", "Subjek putra"),
                        WordToken("看着", "kàn zhe", "Memandangi", "Mengarahkan tatapan mata"),
                        WordToken("他父亲", "tā fùqīn", "Ayahnya", "Panggilan hormat ayah"),
                        WordToken("说", "shuō", "Berkata", "Kata kerja tutur"),
                        WordToken("一定是", "yídìng shì", "Pasti adalah", "Kepastian mutlak"),
                        WordToken("妈妈", "māma", "Ibu", "Pihak yang diduga"),
                        WordToken("打破的", "dǎ pò de", "Yang memecahkannya", "Pelaku pemecahan barang")
                    )
                ),
                Sentence(
                    "s_plate_3",
                    "爸爸问：“你怎么知道？”儿子回答：“昨天，我打破了一个盘子，妈妈很不高兴。但是今天妈妈没有骂人。”",
                    "Bàba wèn: “Nǐ zěnme zhīdào?” Érzi huídá: “Zuótiān, wǒ dǎ pò le yí gè pánzi, māma hěn bù gāoxìng. Dànshì jīntiān māma méiyǒu mà rén.”",
                    "Ayah bertanya: “Bagaimana kamu tahu?” Anak laki-laki menjawab: “Kemarin aku memecahkan sebuah piring, Ibu sangat marah. Tapi hari ini Ibu sama sekali tidak memarahi siapa pun.”",
                    listOf(
                        WordToken("爸爸", "bàba", "Ayah", "Subjek ayah"),
                        WordToken("问", "wèn", "Bertanya", "Kata kerja tutur"),
                        WordToken("你怎么知道", "nǐ zěnme zhīdào", "Bagaimana kamu tahu?", "Menanyakan dasar bukti tebakan"),
                        WordToken("儿子", "érzi", "Anak laki-laki", "Subjek putra"),
                        WordToken("回答", "huídá", "Menjawab", "Memberi penjelasan"),
                        WordToken("昨天", "zuótiān", "Kemarin", "Waktu kemarin"),
                        WordToken("我打破了", "wǒ dǎ pò le", "Saya telah memecahkan", "Tindakan lampau memecahkan"),
                        WordToken("一个盘子", "yí gè pánzi", "Sebuah piring", "Objek piring makan"),
                        WordToken("妈妈", "māma", "Ibu", "Ibu"),
                        WordToken("很不高兴", "hěn bù gāoxìng", "Sangat tidak senang / marah", "Kekesalan emosi"),
                        WordToken("但是", "dànshì", "Tetapi", "Konjungsi pertentangan"),
                        WordToken("今天", "jīntiān", "Hari ini", "Waktu saat ini"),
                        WordToken("妈妈", "māma", "Ibu", "Ibu"),
                        WordToken("没有骂人", "méiyǒu mà rén", "Tidak memarahi orang", "Tidak melontarkan omelan marah")
                    )
                )
            ),
            questions = listOf(
                StoryQuestion(
                    "q_plate_1",
                    "故事发生时，家人们分别在做什么？(Saat cerita berlangsung, apa yang sedang dilakukan masing-masing anggota keluarga?)",
                    listOf(
                        "妈妈和女儿洗盘子，爸爸和儿子看电视 (Ibu & anak perempuan cuci piring, ayah & anak laki-laki nonton TV)",
                        "全家人都在厨房做饭 (Semua orang di dapur memasak)",
                        "爸爸在打扫房间，妈妈在洗衣服 (Ayah bersih-bersih, ibu cuci baju)",
                        "全家都在看电影 (Semua nonton film)"
                    ),
                    0,
                    "Di kalimat pertama tertulis: '妈妈和女儿一起洗盘子，爸爸和儿子一起看电视'."
                ),
                StoryQuestion(
                    "q_plate_2",
                    "突然客厅里的人听到了什么声音？(Tiba-tiba orang di ruang tamu mendengar suara apa?)",
                    listOf(
                        "电视机爆炸的声音 (Suara ledakan TV)",
                        "打破盘子的声音 (Suara piring pecah)",
                        "敲门的声音 (Suara ketukan pintu)",
                        "唱歌的声音 (Suara bernyanyi)"
                    ),
                    1,
                    "Teks menyatakan: '突然，他们听见打破盘子的声音' (Tiba-tiba mereka mendengar suara piring pecah)."
                ),
                StoryQuestion(
                    "q_plate_3",
                    "儿子为什么能够如此肯定盘子是妈妈打破的？(Mengapa sang anak bisa begitu yakin bahwa piring itu dipecahkan oleh ibunya?)",
                    listOf(
                        "亲眼看到了 (Melihat langsung dengan mata kepala sendiri)",
                        "因为今天厨房里没有听到妈妈骂人的声音 (Karena hari ini tidak terdengar suara ibu memarahi orang)",
                        "因为妹妹跑出来告状了 (Karena adik perempuan mengadu)",
                        "因为爸爸提前知道 (Karena ayah tahu lebih dulu)"
                    ),
                    1,
                    "Deduksi cerdik sang anak: '昨天我打破了一个盘子，妈妈很不高兴。但是今天妈妈没有骂人'."
                ),
                StoryQuestion(
                    "q_plate_4",
                    "这个故事讽刺并让人发笑的家庭现象是什么？(Fenomena rumah tangga apa yang disindir dengan jenaka dalam cerita ini?)",
                    listOf(
                        "Orang tua yang cepat marah jika anak melakukan kesalahan, tetapi langsung diam seribu bahasa jika dirinya sendiri yang berbuat salah!",
                        "Kualitas piring yang terlalu tipis",
                        "Televisi yang diputar terlalu keras",
                        "Anak perempuan yang malas mencuci piring"
                    ),
                    0,
                    "Puncak humor: standar ganda ibu yang selalu memarahi orang lain saat piring pecah, tetapi diam sunyi senyap saat dirinya sendiri yang memecahkan piring!"
                )
            )
        )
)
