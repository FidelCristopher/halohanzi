import json

chapters = [
    {
        "num": 17,
        "title_id": "Keluarga Besar, Kerabat & Kenangan Masa Kecil",
        "title_zh": "家庭亲属、辈分称谓与童年时光",
        "theme": "Silsilah keluarga diperluas, panggilan kakek-nenek, pasangan suami-istri, anak-anak, usia masa kecil, marga dan perkenalan identitas formal.",
        "grammar_points": [
            "Penggunaan marga dan nama resmi: 姓 (xìng - bermarga) vs 姓名 (xìngmíng - nama lengkap) vs 名字 (míngzi).",
            "Masa lampau dan kronologi pertumbuhan: 从小 (cóngxiǎo - sejak kecil) dan 小时候 (xiǎoshíhou - waktu kecil).",
            "Pronomina refleksif: 自己 (zìjǐ - diri sendiri) untuk tindakan mandiri atau kepemilikan (自己的家).",
            "Panggilan kerabat pihak ayah: 爷爷 (kakek) dan 奶奶 (nenek), pasangan resmi 丈夫 (suami) dan 妻子 (istri)."
        ],
        "stages": [
            {"stage": 1, "name": "Kakek, Nenek & Pasangan Hidup", "desc": "Mengenal 爷爷, 奶奶, 丈夫, 妻子"},
            {"stage": 2, "name": "Anak-Anak & Generasi Muda", "desc": "Mengenal 男孩儿, 女孩儿, 小孩儿"},
            {"stage": 3, "name": "Masa Kecil & Tumbuh Kembang", "desc": "Mengenal 小时候, 从小, 生日"},
            {"stage": 4, "name": "Identitas Diri & Marga Formal", "desc": "Mengenal 姓, 姓名, 名, 自己"},
            {"stage": 5, "name": "Evaluasi Komprehensif Keluarga & Kerabat", "desc": "Sintesis seluruh kosakata Bab 17 dalam dialog percakapan keluarga"}
        ],
        "words": [
            ("爷爷", "yéye", "Kata Benda", "kakek (pihak ayah)", "我爷爷今年七十岁。"),
            ("奶奶", "nǎinai", "Kata Benda", "nenek (pihak ayah)", "奶奶做饭很好吃。"),
            ("丈夫", "zhàngfu", "Kata Benda", "suami", "她的丈夫是医生。"),
            ("妻子", "qīzi", "Kata Benda", "istri", "我和妻子都很喜欢旅游。"),
            ("男孩儿", "nánháiér", "Kata Benda", "anak laki-laki", "那个男孩儿是谁？"),
            ("女孩儿", "nǚháiér", "Kata Benda", "anak perempuan", "前面有一个小女孩儿。"),
            ("小孩儿", "xiǎoháiér", "Kata Benda", "anak kecil / bocah", "小孩儿在房间里玩。"),
            ("小时候", "xiǎoshíhou", "Kata Benda", "waktu kecil / masa kecil", "我小时候喜欢唱歌。"),
            ("从小", "cóngxiǎo", "Kata Keterangan", "sejak kecil", "他从小学习汉语。"),
            ("生日", "shēngrì", "Kata Benda", "hari ulang tahun", "祝你生日快乐！"),
            ("姓", "xìng", "Kata Kerja / Benda", "bermarga / marga", "请问您贵姓？我姓李。"),
            ("姓名", "xìngmíng", "Kata Benda", "nama lengkap", "请在这里写你的姓名。"),
            ("名", "míng", "Kata Penggolong / Benda", "orang (formal) / nama", "有两名前天来的医生。"),
            ("自己", "zìjǐ", "Kata Ganti", "diri sendiri", "我们要照顾好自己。")
        ]
    },
    {
        "num": 18,
        "title_id": "Warna, Pakaian & Ciri Fisik Penampilan",
        "title_zh": "色彩光谱、穿戴服饰与身材外貌",
        "theme": "Spektrum warna dasar, pakaian celana, tas, aksesoris jam tangan, serta mendeskripsikan ciri fisik dan tinggi tubuh seseorang.",
        "grammar_points": [
            "Pembentukan frasa warna: Kata Sifat Warna + 色 (sè) + Kata Benda (红色的包, 白色的衣服).",
            "Kata bantu bilangan penggolong 条 (tiáo): Khusus untuk benda panjang, berliku, atau celana (一条裤子).",
            "Struktur deskripsi postur tubuh: Subjek + 个子 (gèzi) + 很 + 高/矮 (他个子很高).",
            "Modifikasi ciri fisik: Bagian tubuh + Kata Sifat (眼睛很大, 头发很长)."
        ],
        "stages": [
            {"stage": 1, "name": "Spektrum Warna Dasar", "desc": "Mengenal 颜色, 红色, 白色, 黑色, 绿色"},
            {"stage": 2, "name": "Pakaian, Celana & Aksesoris", "desc": "Mengenal 裤子, 条, 包, 手表"},
            {"stage": 3, "name": "Postur & Ciri Fisik Tubuh", "desc": "Mengenal 个子, 高, 长"},
            {"stage": 4, "name": "Detail Wajah & Anggota Tubuh", "desc": "Mengenal 眼睛, 手"},
            {"stage": 5, "name": "Evaluasi Komprehensif Busana & Fisik", "desc": "Sintesis mendeskripsikan penampilan orang dan pilihan busana"}
        ],
        "words": [
            ("颜色", "yánsè", "Kata Benda", "warna", "你喜欢什么颜色？"),
            ("红色", "hóngsè", "Kata Benda", "warna merah", "我买了一件红色的衣服。"),
            ("白色", "báisè", "Kata Benda", "warna putih", "那辆白色的车很漂亮。"),
            ("黑色", "hēisè", "Kata Benda", "warna hitam", "他戴着一块黑色的手表。"),
            ("绿色", "lǜsè", "Kata Benda", "warna hijau", "春天树上都是绿色的。"),
            ("裤子", "kùzi", "Kata Benda", "celana", "这条黑色的裤子很便宜。"),
            ("条", "tiáo", "Kata Penggolong", "helai / ekor / batang (benda panjang)", "我想买一条新裤子。"),
            ("包", "bāo", "Kata Benda / Kerja", "tas / membungkus", "这个红色的包是谁的？"),
            ("手表", "shǒubiǎo", "Kata Benda", "jam tangan", "这块手表太贵了。"),
            ("个子", "gèzi", "Kata Benda", "tinggi badan / postur", "他的个子很高。"),
            ("高", "gāo", "Kata Sifat", "tinggi", "姚明的个子非常高。"),
            ("长", "cháng", "Kata Sifat", "panjang", "这条路很长。"),
            ("眼睛", "yǎnjing", "Kata Benda", "mata", "妹妹的眼睛大大的。"),
            ("手", "shǒu", "Kata Benda", "tangan", "饭前要洗手。")
        ]
    },
    {
        "num": 19,
        "title_id": "Kuliner Restoran, Ragam Minuman & Cita Rasa",
        "title_zh": "餐馆寻味、茶饮咖啡与味蕾体验",
        "theme": "Suasana rumah makan/restoran, memesan hidangan daging dan ikan, aneka teh (merah/hijau/susu), kopi, evaluasi rasa serta fasilitas toilet.",
        "grammar_points": [
            "Kata kerja pemesanan di restoran: 点 (diǎn - memesan makanan/minuman: 点菜, 点一杯咖啡).",
            "Opini evaluatif rasa dan pengalaman: 不错 (búcuò - lumayan bagus), 有意思 (menarik) vs 没意思 (membosankan).",
            "Kondisi kerusakan atau kebusukan: 坏 (huài - rusak/basi: 菜坏了, 手机坏了).",
            "Menanyakan fasilitas umum: 洗手间 (xǐshǒujiān - toilet) + 在哪儿 (di mana)."
        ],
        "stages": [
            {"stage": 1, "name": "Suasana Rumah Makan & Memesan", "desc": "Mengenal 饭馆, 点"},
            {"stage": 2, "name": "Hidangan Daging & Ikan", "desc": "Mengenal 肉, 鱼"},
            {"stage": 3, "name": "Aneka Teh & Kopi Favorit", "desc": "Mengenal 红茶, 绿茶, 奶茶, 咖啡"},
            {"stage": 4, "name": "Evaluasi Pengalaman & Cita Rasa", "desc": "Mengenal 不错, 有意思, 没意思, 坏"},
            {"stage": 5, "name": "Kebersihan & Fasilitas Restoran", "desc": "Mengenal 洗, 洗手间, Evaluasi Bab 19"}
        ],
        "words": [
            ("饭馆", "fànguǎn", "Kata Benda", "restoran / rumah makan", "学校旁边有一家新饭馆。"),
            ("点", "diǎn", "Kata Kerja", "memesan (makanan / minuman)", "服务员，我们要点菜。"),
            ("肉", "ròu", "Kata Benda", "daging", "我不常吃牛肉。"),
            ("鱼", "yú", "Kata Benda", "ikan", "这家饭馆的鱼很新鲜。"),
            ("红茶", "hóngchá", "Kata Benda", "teh hitam", "请给我一杯热红茶。"),
            ("绿茶", "lǜchá", "Kata Benda", "teh hijau", "喝绿茶对身体很好。"),
            ("奶茶", "nǎichá", "Kata Benda", "teh susu / milk tea", "很多年轻人喜欢喝奶茶。"),
            ("咖啡", "kāfēi", "Kata Benda", "kopi", "早上我喝了一杯黑咖啡。"),
            ("不错", "búcuò", "Kata Sifat", "bagus / lumayan / mantap", "这道菜的味道真不错！"),
            ("有意思", "yǒuyìsi", "Ungkapan", "menarik / asyik", "看这本书很有意思。"),
            ("没意思", "méiyìsi", "Ungkapan", "membosankan / tidak seru", "这个电影一点也没意思。"),
            ("坏", "huài", "Kata Sifat", "rusak / basi / jahat", "我的自行车坏了。"),
            ("洗", "xǐ", "Kata Kerja", "mencuci", "吃水果前要先洗一洗。"),
            ("洗手间", "xǐshǒujiān", "Kata Benda", "toilet / kamar kecil", "请问洗手间在几楼？")
        ]
    },
    {
        "num": 20,
        "title_id": "Tata Ruang, Posisi Relatif & Arah Mata Angin",
        "title_zh": "空间方位、楼宇格局与相对位置",
        "theme": "Menentukan posisi spasial presisi: sisi kiri, sisi kanan, depan, belakang, atas, bawah, dalam, luar, gedung dan ruangan bertingkat.",
        "grammar_points": [
            "Pola penunjuk arah lengkap: Kata Posisi + 边 (bian) / 面 (miàn) (左边, 右面, 前面, 后面).",
            "Struktur frasa posisi relatif: Tempat A + 在 + Tempat B + 的 + Kata Arah (书店在学校的左边).",
            "Kata penggolong ruangan dan gedung: 间 (jiān - untuk kamar/ruangan: 一间教室), 楼 (lóu - lantai/gedung: 三楼).",
            "Posisi berdampingan: 旁边 (pángbiān - sebelah/samping: 我坐在他旁边)."
        ],
        "stages": [
            {"stage": 1, "name": "Sisi Kiri & Sisi Kanan", "desc": "Mengenal 左, 左边, 右, 右边"},
            {"stage": 2, "name": "Depan, Belakang & Sisi Samping", "desc": "Mengenal 前面, 后面, 旁边, 面"},
            {"stage": 3, "name": "Dalam, Luar, Atas & Bawah", "desc": "Mengenal 里面, 外面, 上面, 下面"},
            {"stage": 4, "name": "Lantai Gedung & Penataan Ruangan", "desc": "Mengenal 楼, 间"},
            {"stage": 5, "name": "Evaluasi Komprehensif Posisi & Tata Ruang", "desc": "Sintesis navigasi ruangan, denah denotatif, dan deskripsi tata ruang"}
        ],
        "words": [
            ("左", "zuǒ", "Kata Benda", "kiri", "往左看，有一家书店。"),
            ("左边", "zuǒbian", "Kata Benda", "sebelah kiri", "学校在医院的左边。"),
            ("右", "yòu", "Kata Benda", "kanan", "到了路口请往右走。"),
            ("右边", "yòubian", "Kata Benda", "sebelah kanan", "洗手间在楼梯的右边。"),
            ("前面", "qiánmiàn", "Kata Benda", "bagian depan / di depan", "车站在公司前面。"),
            ("后面", "hòumiàn", "Kata Benda", "bagian belakang / di belakang", "房子后面有一个小花园。"),
            ("旁边", "pángbiān", "Kata Benda", "samping / sebelah", "我就坐在你的旁边。"),
            ("面", "miàn", "Akhiran", "sisi / arah mata angin", "东面有一座大山。"),
            ("里面", "lǐmiàn", "Kata Benda", "bagian dalam / di dalam", "书包里面有三本书。"),
            ("外面", "wàimiàn", "Kata Benda", "bagian luar / di luar", "外面现在正在下大雨。"),
            ("上面", "shàngmiàn", "Kata Benda", "bagian atas / di atas", "桌子上面放着一杯水。"),
            ("下面", "xiàmiàn", "Kata Benda", "bagian bawah / di bawah", "小猫在椅子下面睡觉。"),
            ("楼", "lóu", "Kata Benda", "gedung / lantai bangunan", "我们去五楼的教室上课。"),
            ("间", "jiān", "Kata Penggolong", "ruangan / kamar", "这栋楼里有三十间房间。")
        ]
    },
    {
        "num": 21,
        "title_id": "Pergerakan, Dinamika Arah & Komplemen Arah",
        "title_zh": "趋向动词、位移动态与进出起落",
        "theme": "Kata kerja berarah mendekat (来) vs menjauh (去), masuk-keluar, naik-turun, menyeberang/lewat, dan bangkit.",
        "grammar_points": [
            "Komplemen arah sederhana (Simple Directional Complements): Kata Kerja + 来 (ke arah pembicara) / 去 (menjauhi pembicara).",
            "Pola objek tempat pada komplemen arah: Kata Kerja Arah + Objek Tempat + 来/去 (进教室来, 回家去).",
            "Pergerakan vertikal: 上来 (naik ke sini), 上去 (naik ke sana), 下来 (turun ke sini), 下去 (turun ke sana).",
            "Pergerakan horizontal & perpindahan: 进 (masuk), 出 (keluar), 过来 (datang mendekat), 过去 (pergi menjauh)."
        ],
        "stages": [
            {"stage": 1, "name": "Dinamika Masuk & Menuju Masuk", "desc": "Mengenal 进, 进来, 进去"},
            {"stage": 2, "name": "Dinamika Keluar & Meninggalkan Ruangan", "desc": "Mengenal 出, 出来, 出去, 出门"},
            {"stage": 3, "name": "Dinamika Naik Vertikal", "desc": "Mengenal 上来, 上去"},
            {"stage": 4, "name": "Dinamika Turun Vertikal", "desc": "Mengenal 下来, 下去"},
            {"stage": 5, "name": "Melintas, Mendekat & Menjauh", "desc": "Mengenal 过来, 过去, 回来, 回去, Evaluasi Bab 21"}
        ],
        "words": [
            ("进", "jìn", "Kata Kerja", "masuk", "外面冷，请进房间吧。"),
            ("进来", "jìnlái", "Kata Kerja", "masuk ke sini (ke arah pembicara)", "门开着，你快进来吧。"),
            ("进去", "jìnqù", "Kata Kerja", "masuk ke sana (menjauhi pembicara)", "他在门口，还没有进去。"),
            ("出", "chū", "Kata Kerja", "keluar", "他刚走出校门。"),
            ("出来", "chūlái", "Kata Kerja", "keluar ke sini", "请大家从教室里出来。"),
            ("出去", "chūqù", "Kata Kerja", "keluar ke sana", "爸爸出去了，不在家。"),
            ("出门", "chūmén", "Kata Kerja", "keluar rumah / bepergian", "出门前别忘了带钥匙。"),
            ("上来", "shànglái", "Kata Kerja", "naik ke sini", "我在二楼，你快上来吧。"),
            ("上去", "shàngqù", "Kata Kerja", "naik ke sana", "他们已经爬上去了。"),
            ("下来", "xiàlái", "Kata Kerja", "turun ke sini", "你站在上面太高了，快下来！"),
            ("下去", "xiàqù", "Kata Kerja", "turun ke sana", "请大家按顺序走下去。"),
            ("过来", "guòlái", "Kata Kerja", "datang kemari / mendekat", "你过来一下，我有话对你说。"),
            ("过去", "guòqù", "Kata Kerja", "pergi ke sana / masa lampau", "他朝马路对面走过去了。"),
            ("回来", "huílái", "Kata Kerja", "kembali ke sini / pulang", "你什么时候回来看我们？"),
            ("回去", "huíqù", "Kata Kerja", "kembali ke sana / pulang ke sana", "天黑了，我们快回去吧。")
        ]
    },
    {
        "num": 22,
        "title_id": "Transportasi Publik, Rute Jalan & Mobilitas Kota",
        "title_zh": "城市交通、公交地铁与出行路线",
        "theme": "Moda angkutan kota (bus umum, MRT, taksi), halte dan stasiun, kondisi jalan raya, jarak jauh-dekat, serta navigasi rute.",
        "grammar_points": [
            "Struktur jarak spasial: Tempat A + 离 (lí - berjarak dari) + Tempat B + 很远 / 很近.",
            "Pola arah pergerakan: 往 (wǎng - ke arah/menuju) + Arah/Tempat + 走 / 开 (往前走, 往右拐).",
            "Menyatakan kecepatan gerakan: 快 (kuài - cepat) vs 慢 (màn - pelan/lambat: 走得很慢).",
            "Aktivitas mobilitas: 打车 (naik taksi), 走路 (berjalan kaki), 在路上 (di tengah jalan)."
        ],
        "stages": [
            {"stage": 1, "name": "Bus Umum, MRT & Stasiun Transit", "desc": "Mengenal 公交车, 地铁, 车站, 站"},
            {"stage": 2, "name": "Memanggil Taksi & Perjalanan Jalan Kaki", "desc": "Mengenal 打车, 走, 走路"},
            {"stage": 3, "name": "Kondisi Lalu Lintas & Di Tengah Jalan", "desc": "Mengenal 路, 路上"},
            {"stage": 4, "name": "Jarak Spasial, Kecepatan & Panduan Arah", "desc": "Mengenal 离, 远, 近, 快, 慢, 往"},
            {"stage": 5, "name": "Evaluasi Komprehensif Mobilitas Kota", "desc": "Sintesis memilih moda transportasi, menanyakan rute dan jarak antar-halte"}
        ],
        "words": [
            ("公交车", "gōngjiāochē", "Kata Benda", "bus umum", "坐公交车去学校只要两块钱。"),
            ("地铁", "dìtiě", "Kata Benda", "kereta bawah tanah / MRT", "坐地铁去机场又快又方便。"),
            ("车站", "chēzhàn", "Kata Benda", "halte bus / stasiun", "我们在公共汽车站等你。"),
            ("站", "zhàn", "Kata Benda", "stasiun / perhentian halte", "下一站就是市中心了。"),
            ("打车", "dǎchē", "Kata Kerja", "naik taksi / memanggil taksi", "今天下大雨，我们打车吧。"),
            ("走", "zǒu", "Kata Kerja", "berjalan / pergi meninggalkan tempat", "时间不早了，我得走了。"),
            ("走路", "zǒulù", "Kata Kerja", "berjalan kaki", "我每天走路去公司上班。"),
            ("路", "lù", "Kata Benda", "jalan / rute kendaraan", "这条路上的车非常多。"),
            ("路上", "lùshang", "Kata Benda", "di jalan / dalam perjalanan", "我在路上遇到了老同学。"),
            ("离", "lí", "Kata Depan / Kerja", "berjarak dari / terpisah dari", "我家离公司只有两公里。"),
            ("远", "yuǎn", "Kata Sifat", "jauh", "那个饭馆太远了，别去了。"),
            ("近", "jìn", "Kata Sifat", "dekat", "超市离我家非常近。"),
            ("快", "kuài", "Kata Sifat / Keterangan", "cepat / segera", "他跑得比大家都快。"),
            ("慢", "màn", "Kata Sifat", "lambat / pelan", "老人家走路走得很慢。"),
            ("往", "wǎng", "Kata Depan", "ke arah / menuju", "一直往前走就能看到地铁站。")
        ]
    },
    {
        "num": 23,
        "title_id": "Perjalanan Wisata, Tiket & Berlibur ke Luar Negeri",
        "title_zh": "假日长途游、票务预订与出境见闻",
        "theme": "Aktivitas liburan/wisata, reservasi hotel, tiket penerbangan di bandara, melancong ke luar negeri, perayaan Tahun Baru Imlek, dan membawa oleh-oleh.",
        "grammar_points": [
            "Aspek pengalaman masa lampau dengan partikel 过 (guo): Subjek + Kata Kerja + 过 + Objek (我去过中国 = Saya pernah pergi ke Tiongkok).",
            "Persiapan rencana masa depan: 准备 (zhǔnbèi - mempersiapkan / berencana: 准备去旅游).",
            "Kata kerja pemindahan objek fisik: 送 (sòng - mengantar orang/memberikan hadiah) dan 拿 (ná - mengambil/membawa dengan tangan).",
            "Kosakata bandara dan tiket: 机场 (bandara), 机票 (tiket pesawat), 门票 (tiket masuk tempat wisata)."
        ],
        "stages": [
            {"stage": 1, "name": "Rencana Berwisata & Melancong ke Luar Negeri", "desc": "Mengenal 旅游, 外国, 出国"},
            {"stage": 2, "name": "Bandara, Penerbangan & Tiket Pesawat", "desc": "Mengenal 机场, 机票, 飞, 票, 门票"},
            {"stage": 3, "name": "Akomodasi Hotel & Merayakan Tahun Baru", "desc": "Mengenal 酒店, 过, 过年, 准备"},
            {"stage": 4, "name": "Memberi Hadiah & Membawa Barang Bawaan", "desc": "Mengenal 送, 拿, 过 (guo)"},
            {"stage": 5, "name": "Evaluasi Komprehensif Wisata & Tiket", "desc": "Sintesis memesan tiket, pengalaman bepergian, dan dialog di bandara"}
        ],
        "words": [
            ("旅游", "lǚyóu", "Kata Kerja / Benda", "berwisata / berlibur / tamasya", "今年冬天我想去北京旅游。"),
            ("外国", "wàiguó", "Kata Benda", "luar negeri", "有很多外国朋友在学中文。"),
            ("出国", "chūguó", "Kata Kerja", "pergi ke luar negeri", "他打算明年出国读大学。"),
            ("机场", "jīchǎng", "Kata Benda", "bandara / bandar udara", "明天早上我得去机场接朋友。"),
            ("机票", "jīpiào", "Kata Benda", "tiket pesawat", "春节前的机票非常贵。"),
            ("飞", "fēi", "Kata Kerja", "terbang", "小鸟在蓝蓝的天空上飞。"),
            ("票", "piào", "Kata Benda", "tiket / karcis", "电影票已经卖完了。"),
            ("门票", "ménpiào", "Kata Benda", "tiket masuk objek wisata", "公园的门票一张五十块。"),
            ("酒店", "jiǔdiàn", "Kata Benda", "hotel / penginapan", "我们住在海边的一家大酒店。"),
            ("过", "guò", "Kata Kerja", "melewati / merayakan waktu", "今天我过得很开心。"),
            ("过年", "guònián", "Kata Kerja", "merayakan Tahun Baru Imlek", "过年的时候全家人都要团聚。"),
            ("准备", "zhǔnbèi", "Kata Kerja", "mempersiapkan / bersiap-siap", "我已经准备好去考试了。"),
            ("送", "sòng", "Kata Kerja", "mengantar / memberi hadiah", "朋友送给我一本很有意思的书。"),
            ("拿", "ná", "Kata Kerja", "mengambil / memegang / membawa", "请帮我拿一下这个大包。"),
            ("过", "guo", "Partikel", "pernah (partikel aspek pengalaman)", "你吃过北京烤鸭吗？")
        ]
    },
    {
        "num": 24,
        "title_id": "Kehidupan Kampus, Kelas & Ujian Akademik",
        "title_zh": "菁菁校园、教室课堂与课业测验",
        "theme": "Jenjang SMA, awal semester masuk kelas, perlengkapan belajar (buku catatan, pena, tas), proses belajar-mengajar, ujian, serta evaluasi hasil.",
        "grammar_points": [
            "Istilah kalender pendidikan: 开学 (kāixué - awal semester) dan 班 (bān - kelas/kelompok belajar).",
            "Kata kerja hasil pemahaman dan ketepatan: 懂 (dǒng - mengerti: 听懂了 / 听得懂) dan 错 (cuò - keliru/salah: 做错了).",
            "Kosakata ujian dan evaluasi: 考试 (ujian/tes) dan 题 (soal/pertanyaan ujian: 做题).",
            "Perlengkapan alat tulis sekolah: 笔 (pena), 本子 (buku catatan), 书包 (tas sekolah)."
        ],
        "stages": [
            {"stage": 1, "name": "Jenjang Sekolah, Kelas & Awal Masuk", "desc": "Mengenal 高中, 班, 教室, 开学"},
            {"stage": 2, "name": "Perlengkapan Belajar & Alat Tulis", "desc": "Mengenal 本子, 笔, 书包, 门, 门口"},
            {"stage": 3, "name": "Proses Pengajaran & Penjelasan Guru", "desc": "Mengenal 教, 懂, 词"},
            {"stage": 4, "name": "Pelaksanaan Ujian & Ketepatan Menjawab", "desc": "Mengenal 考, 考试, 题, 错"},
            {"stage": 5, "name": "Evaluasi Komprehensif Aktivitas Akademik", "desc": "Sintesis rutinitas kelas, pengerjaan soal ujian, dan interaksi guru-murid"}
        ],
        "words": [
            ("高中", "gāozhōng", "Kata Benda", "Sekolah Menengah Atas (SMA)", "我姐姐现在在上高中。"),
            ("班", "bān", "Kata Benda", "kelas / rombongan belajar", "我们班一共有二十五个同学。"),
            ("教室", "jiàoshì", "Kata Benda", "ruang kelas", "同学们都在教室里安静自习。"),
            ("开学", "kāixué", "Kata Kerja", "mulai masuk sekolah / awal semester", "下个星期一我们就要开学了。"),
            ("本子", "běnzi", "Kata Benda", "buku catatan", "我在本子上记下了老师说的话。"),
            ("笔", "bǐ", "Kata Benda", "pena / pensil / alat tulis", "你能借我一支黑色圆珠笔吗？"),
            ("书包", "shūbāo", "Kata Benda", "tas sekolah", "这个新书包是妈妈送给我的。"),
            ("门", "mén", "Kata Benda", "pintu / gerbang", "请随手把门关上。"),
            ("门口", "ménkǒu", "Kata Benda", "pintu masuk / ambang pintu", "我在学校门口等你十分钟。"),
            ("教", "jiāo", "Kata Kerja", "mengajar", "王老师教我们中国历史。"),
            ("懂", "dǒng", "Kata Kerja", "mengerti / memahami", "老师讲的话我都听懂了。"),
            ("词", "cí", "Kata Benda", "kata / kosakata", "今天我们学了二十个新生词。"),
            ("考", "kǎo", "Kata Kerja", "menguji / dites", "明天我们要考英语听力。"),
            ("考试", "kǎoshì", "Kata Kerja / Benda", "ujian / ulangan", "期末考试大家都考得非常好。"),
            ("题", "tí", "Kata Benda", "butir soal / topik ujian", "这次数学考试最后一道题很难。"),
            ("错", "cuò", "Kata Sifat", "salah / keliru", "这道题你写错了答案。")
        ]
    },
    {
        "num": 25,
        "title_id": "Olahraga, Kebugaran Fisik & Permainan Bola",
        "title_zh": "强身健体、运动竞技与活力球类",
        "theme": "Aktivitas fisik, lari pagi, berenang, sepak bola, bola basket, menari, bangun bergerak, melatih kebugaran tubuh, serta mengatasi rasa lelah.",
        "grammar_points": [
            "Kata kerja berpasangan objek khusus (离合词): 跑步 (berlari/jogging), 游泳 (berenang), 跳舞 (menari).",
            "Kata kerja aksi permainan bola: 踢 (tī - menendang: 踢足球) vs 打 (dǎ - bermain bola dengan tangan: 打篮球).",
            "Arah permulaan tindakan atau bangkit: 起来 (qǐlái - bangun dari tidur / bangkit berdiri / mulai bergerak: 动起来).",
            "Kondisi fisik dan kelelahan: 身体 (tubuh/kesehatan: 身体很好) dan 累 (lèi - lelah/capek: 跑得很累)."
        ],
        "stages": [
            {"stage": 1, "name": "Kebugaran Umum & Lari Pagi", "desc": "Mengenal 运动, 跑, 跑步"},
            {"stage": 2, "name": "Permainan Sepak Bola & Bola Basket", "desc": "Mengenal 踢, 足球, 篮球, 球, 打"},
            {"stage": 3, "name": "Berenang & Seni Gerak Tari", "desc": "Mengenal 游, 游泳, 跳舞"},
            {"stage": 4, "name": "Bangkit Berenergi & Mengatasi Lelah", "desc": "Mengenal 起来, 动, 身体, 累"},
            {"stage": 5, "name": "Evaluasi Komprehensif Olahraga & Kebugaran", "desc": "Sintesis hobi kebugaran, pertandingan bola, dan menjaga stamina fisik"}
        ],
        "words": [
            ("运动", "yùndòng", "Kata Kerja / Benda", "berolahraga / olahraga", "多运动对身体有很多好处。"),
            ("跑", "pǎo", "Kata Kerja", "lari / berlari", "小狗在草地上飞快地跑。"),
            ("跑步", "pǎobù", "Kata Kerja", "berlari santai / jogging", "每天早晨我都去公园跑步。"),
            ("踢", "tī", "Kata Kerja", "menendang", "男孩子们在操场上踢球。"),
            ("足球", "zúqiú", "Kata Benda", "sepak bola", "我喜欢看世界杯足球比赛。"),
            ("篮球", "lánqiú", "Kata Benda", "bola basket", "弟弟个子高，很会打篮球。"),
            ("球", "qiú", "Kata Benda", "bola", "这个球是谁踢到草丛里的？"),
            ("打", "dǎ", "Kata Kerja", "bermain (olahraga tangan) / memukul", "下午我们一起去打羽毛球吧。"),
            ("游", "yóu", "Kata Kerja", "berenang", "小鱼在水里自由地游来游去。"),
            ("游泳", "yóuyǒng", "Kata Kerja", "berenang (olahraga renang)", "夏天大家最喜欢去海边游泳。"),
            ("跳舞", "tiàowǔ", "Kata Kerja", "menari / berdansa", "姐姐从小就喜欢跳舞。"),
            ("起来", "qǐlái", "Kata Kerja / Komplemen", "bangun / bangkit / mulai beraksi", "早上七点我就起床了。"),
            ("动", "dòng", "Kata Kerja", "bergerak / berpindah", "太冷了，手都快冻得动不了了。"),
            ("身体", "shēntǐ", "Kata Benda", "tubuh / kondisi kesehatan", "最近工作很忙，你要保重身体。"),
            ("累", "lèi", "Kata Sifat", "lelah / capek", "今天走了两万步，真累啊！")
        ]
    },
    {
        "num": 26,
        "title_id": "Gejala Sakit, Obat & Istirahat Pemulihan",
        "title_zh": "病痛关照、药店问诊与康复疗愈",
        "theme": "Rasa nyeri pada kepala dan tubuh, membeli obat di apotek, beristirahat di ranjang, meminta bantuan, mengabari kondisi, dan mendoakan kesembuhan.",
        "grammar_points": [
            "Menyatakan rasa sakit spesifik: Bagian tubuh + 疼 (téng - sakit/nyeri: 头疼, 眼睛疼).",
            "Menyatakan kenyamanan fisik: 舒服 (shūfu - nyaman: 身上不舒服 = badan kurang enak).",
            "Permintaan tolong dan bantuan: 帮 (bāng) / 帮忙 (bāngmáng - menolong / membantu: 请你帮我买药).",
            "Menyampaikan kabar dan harapan: 告诉 (gàosu - memberitahu) dan 希望 (xīwàng - berharap/semoga)."
        ],
        "stages": [
            {"stage": 1, "name": "Rasa Sakit Kepala & Nyeri Fisik", "desc": "Mengenal 头, 疼, 舒服"},
            {"stage": 2, "name": "Membeli Obat di Apotek & Istirahat Ranjang", "desc": "Mengenal 药, 药店, 床"},
            {"stage": 3, "name": "Meminta Bantuan & Tolong Menolong", "desc": "Mengenal 帮, 帮忙, 等"},
            {"stage": 4, "name": "Memberi Kabar & Harapan Kesembuhan", "desc": "Mengenal 告诉, 希望"},
            {"stage": 5, "name": "Evaluasi Komprehensif Kesehatan & Perawatan", "desc": "Sintesis dialog sakit, periksa apotek, dan memberi perhatian peduli"}
        ],
        "words": [
            ("头", "tóu", "Kata Benda", "kepala", "我头有点疼，想睡一会儿。"),
            ("疼", "téng", "Kata Sifat", "sakit / nyeri", "吃了太多冰淇淋，肚子很疼。"),
            ("舒服", "shūfu", "Kata Sifat", "nyaman / enak badan", "坐在沙发上看书非常舒服。"),
            ("药", "yào", "Kata Benda", "obat", "医生说这种药一天要吃三次。"),
            ("药店", "yàodiàn", "Kata Benda", "apotek / toko obat", "马路对面就有一家二十四小时药店。"),
            ("床", "chuáng", "Kata Benda", "ranjang / tempat tidur", "病人正在病床上好好休息。"),
            ("帮", "bāng", "Kata Kerja", "membantu / menolong", "你能帮我把这封信寄出去吗？"),
            ("帮忙", "bāngmáng", "Kata Kerja", "membantu / memberi pertolongan", "谢谢你今天帮了我这么大的忙。"),
            ("等", "děng", "Kata Kerja", "menunggu", "请在休息室稍等片刻。"),
            ("告诉", "gàosu", "Kata Kerja", "memberitahu / mengabarkan", "请把这件事告诉大家。"),
            ("希望", "xīwàng", "Kata Kerja / Benda", "berharap / semoga / harapan", "我希望你能快点好起来。")
        ]
    },
    {
        "num": 27,
        "title_id": "Hobi Kreatif, Alam & Dunia Maya Digital",
        "title_zh": "闲暇雅趣、自然生灵与网络冲浪",
        "theme": "Kegemaran waktu luang (melukis/menggambar), menikmati keindahan bunga, menyayangi burung, berselancar di internet, tersenyum ceria, dan mengingat urusan.",
        "grammar_points": [
            "Penggunaan ganda kata 花 (huā): Sebagai Kata Benda (bunga: 一朵花) vs Kata Kerja (menghabiskan waktu/uang: 花时间 / 花钱).",
            "Aktivitas dunia maya digital: 上网 (shàngwǎng - berselancar di internet) dan 网上 (wǎngshang - di internet / daring).",
            "Pronomina universalitas 每 (měi): 每 + Kata Penggolong + Objek + 都 (每个人都很高兴).",
            "Ekspresi emosi bahagia: 笑 (xiào - tertawa/tersenyum) dan 快乐 (kuàilè - bahagia: 生日快乐)."
        ],
        "stages": [
            {"stage": 1, "name": "Bakat Seni & Melukis", "desc": "Mengenal 爱好, 画"},
            {"stage": 2, "name": "Bunga di Taman & Menghabiskan Biaya", "desc": "Mengenal 花 (bunga), 花 (menghabiskan), 鸟"},
            {"stage": 3, "name": "Berselancar di Internet & Membuka Aplikasi", "desc": "Mengenal 上网, 网上, 打开"},
            {"stage": 4, "name": "Senyuman Gembira, Urusan & Ingatan", "desc": "Mengenal 笑, 快乐, 每, 事情, 忘"},
            {"stage": 5, "name": "Evaluasi Komprehensif Hobi & Hiburan Digital", "desc": "Sintesis aktivitas santai di akhir pekan, hobi seni, dan kegiatan daring"}
        ],
        "words": [
            ("爱好", "àihào", "Kata Benda / Kerja", "hobi / kegemaran / menyukai", "我的业余爱好是听音乐和画画。"),
            ("画", "huà", "Kata Kerja / Benda", "menggambar / melukis / gambar", "妹妹画的小猫真可爱。"),
            ("花", "huā", "Kata Benda", "bunga", "花园里开满了五颜六色的花。"),
            ("花", "huā", "Kata Kerja", "menghabiskan (uang / waktu)", "修这辆车花了我五百块钱。"),
            ("鸟", "niǎo", "Kata Benda", "burung", "树上有很多小鸟在快乐地唱歌。"),
            ("上网", "shàngwǎng", "Kata Kerja", "berselancar di internet / daring", "现在大家每天都要上网查资料。"),
            ("网上", "wǎngshang", "Kata Benda", "di internet / secara online", "很多东西在网上买比在商场便宜。"),
            ("打开", "dǎkāi", "Kata Kerja", "membuka / menyalakan", "请大家把书打开到第三十页。"),
            ("笑", "xiào", "Kata Kerja", "tersenyum / tertawa", "看到朋友来，她高兴地笑了。"),
            ("快乐", "kuàilè", "Kata Sifat", "bahagia / gembira", "祝大家新年快乐，万事如意！"),
            ("每", "měi", "Kata Ganti", "setiap / tiap-tiap", "我每天早晨都要喝一杯牛奶。"),
            ("事情", "shìqing", "Kata Benda", "urusan / persoalan / perkara", "今天公司里有很多事情要办。"),
            ("忘", "wàng", "Kata Kerja", "lupa", "对不起，我忘了带今天的课本。")
        ]
    },
    {
        "num": 28,
        "title_id": "Pola Komparasi, Superlatif & Keterangan Waktu",
        "title_zh": "比较句式、极值程度与时态副词",
        "theme": "Struktur perbandingan (A lebih daripada B), predikat paling/superlatif (最), partikel komplemen tingkat (得) dan adverbial (地), serta penanda waktu progresif.",
        "grammar_points": [
            "Pola kalimat perbandingan dasar: Subjek A + 比 (bǐ) + Subjek B + Kata Sifat (哥哥比弟弟高).",
            "Tingkat superlatif (paling/ter-): 最 (zuì) + Kata Sifat / Kata Kerja Perasaan (我最喜欢吃苹果).",
            "Partikel penanda komplemen tingkat 得 (de): Kata Kerja + 得 + Sangat + Kata Sifat (他跑得很快).",
            "Partikel pembentuk adverbial 地 (de): Kata Sifat + 地 + Kata Kerja (慢慢地走, 认真地学).",
            "Penanda waktu dan frekuensi: 已经 (sudah), 快要...了 (sebentar lagi akan), 经常 (sering), 有时 (kadang-kadang), 一会儿 (sebentar)."
        ],
        "stages": [
            {"stage": 1, "name": "Struktur Komparasi Dasar A 比 B", "desc": "Mengenal 比, 最"},
            {"stage": 2, "name": "Partikel Tata Bahasa Struktural", "desc": "Mengenal 得 (komplemen), 地 (adverbial)"},
            {"stage": 3, "name": "Demonstratif Derajat & Ragam Cara", "desc": "Mengenal 那么, 那样, 这么, 这样"},
            {"stage": 4, "name": "Frekuensi Rutinitas & Durasi Sejenak", "desc": "Mengenal 经常, 有时, 一会儿"},
            {"stage": 5, "name": "Aspek Waktu Progresif & Sudah Terjadi", "desc": "Mengenal 已经, 快要, 正, Evaluasi Bab 28"}
        ],
        "words": [
            ("比", "bǐ", "Kata Depan / Kerja", "dibandingkan dengan / daripada", "今天的天气比昨天好多了。"),
            ("最", "zuì", "Kata Keterangan", "paling / ter-", "全班同学里他汉语说得最好。"),
            ("得", "de", "Partikel", "partikel komplemen derajat / hasil", "小明汉字写得非常漂亮。"),
            ("地", "de", "Partikel", "partikel pembentuk keterangan cara", "同学们认真地听老师讲课。"),
            ("那么", "nàme", "Kata Ganti / Hubung", "sebegitu / kalau begitu", "天气那么好，我们去公园散步吧。"),
            ("那样", "nàyàng", "Kata Ganti", "seperti itu / begitu", "你不用那样做，这样做也可以。"),
            ("这么", "zhème", "Kata Ganti", "sebegini / begitu", "这件衣服怎么会这么便宜？"),
            ("这样", "zhèyàng", "Kata Ganti", "seperti ini / begini", "这样做才能把汉语学好。"),
            ("经常", "jīngcháng", "Kata Keterangan", "sering / kerap kali", "周末我经常去图书馆看书。"),
            ("有时", "yǒushí", "Kata Keterangan", "kadang-kadang / terkadang", "他有时跑步，有时去游泳。"),
            ("一会儿", "yíhuìér", "Frasa Bilangan", "sebentar / sejenak", "请你在门口等我一会儿。"),
            ("已经", "yǐjīng", "Kata Keterangan", "sudah / telah", "电影已经开始了，快进场吧。"),
            ("快要", "kuàiyào", "Kata Keterangan", "sebentar lagi akan", "火车快要开了，大家快上车。"),
            ("正", "zhèng", "Kata Keterangan", "sedang / tepat", "我正想打电话给你呢。")
        ]
    },
    {
        "num": 29,
        "title_id": "Logika Hubungan Antarklausa, Sebab-Akibat & Etiket",
        "title_zh": "复句关联、因果转折与交际礼节",
        "theme": "Merangkai kalimat majemuk sebab-akibat (karena ... maka ...), pertentangan (walaupun ... tetapi ...), pilihan interogatif, kalimat kausatif, dan etiket rasa sungkan.",
        "grammar_points": [
            "Pasangan konjungsi kausal: 因为 (yīnwèi - karena) ... 所以 (suǒyǐ - maka/oleh karena itu) ...",
            "Pasangan konjungsi konsesif: 虽然 (suīrán - walaupun/meskipun) ... 但是/但 (dànshì - tetapi/namun) ...",
            "Pertanyaan alternatif pilihan: A 还是 (háishi - ataukah) B？",
            "Konstruksi kausatif (pivotal sentence): Subjek + 让 (ràng - membuat / menyuruh) + Seseorang + Lakukan Sesuatu (老师让我回答问题).",
            "Imperatif larangan halus: 别 (bié - jangan: 别着急, 别忘了) dan etiket 不好意思 (sungkan/maaf)."
        ],
        "stages": [
            {"stage": 1, "name": "Hubungan Sebab-Akibat & Alasan", "desc": "Mengenal 因为, 所以, 为什么"},
            {"stage": 2, "name": "Hubungan Pertentangan & Transisi", "desc": "Mengenal 虽然, 但是, 但"},
            {"stage": 3, "name": "Pilihan Alternatif & Konstruksi Kausatif", "desc": "Mengenal 还是, 让, 可能"},
            {"stage": 4, "name": "Etiket Kesopanan, Memori & Makna", "desc": "Mengenal 记得, 介绍, 意思, 不好意思"},
            {"stage": 5, "name": "Larangan Lembut & Partikel Seru", "desc": "Mengenal 别, 啊, Evaluasi Bab 29"}
        ],
        "words": [
            ("因为", "yīnwèi", "Kata Hubung", "karena / sebab", "因为生病了，所以他没来上课。"),
            ("所以", "suǒyǐ", "Kata Hubung", "maka / oleh karena itu", "下雨了，所以大家都在屋里。"),
            ("为什么", "wèishénme", "Kata Tanya", "mengapa / kenapa", "你为什么今天来得这么晚？"),
            ("虽然", "suīrán", "Kata Hubung", "meskipun / walaupun", "虽然汉语很难，但他学得很快乐。"),
            ("但是", "dànshì", "Kata Hubung", "tetapi / namun", "这件衣服很漂亮，但是太贵了。"),
            ("但", "dàn", "Kata Hubung", "tetapi / namun (ringkas)", "我虽然累，但心里很高兴。"),
            ("还是", "háishi", "Kata Hubung / Keterangan", "atau (dalam pertanyaan) / masih", "你想喝咖啡还是喝红茶？"),
            ("让", "ràng", "Kata Kerja", "membiarkan / menyuruh / mempersilakan", "妈妈让我早点回家吃饭。"),
            ("可能", "kěnéng", "Kata Keterangan / Sifat", "mungkin / barangkali", "明天下午可能会下雨。"),
            ("记得", "jìde", "Kata Kerja", "ingat", "你还记得他的名字叫什么吗？"),
            ("介绍", "jièshào", "Kata Kerja", "memperkenalkan", "我来介绍一下，这位是王经理。"),
            ("意思", "yìsi", "Kata Benda", "makna / arti", "请问这个汉字是什么意思？"),
            ("不好意思", "bùhǎoyìsi", "Ungkapan", "sungkan / merasa tidak enak / permisi", "不好意思，打扰您一下。"),
            ("别", "bié", "Kata Keterangan", "jangan", "天冷了，出门别忘了多穿衣服。"),
            ("啊", "a", "Partikel", "ah / oh / partikel seru penegas", "这里的风景真美丽啊！")
        ]
    },
    {
        "num": 30,
        "title_id": "Grand Sintesis HSK 2: Angka Besar, Kalender & Evaluasi Akhir",
        "title_zh": "统筹融会、大数历法与考评大成",
        "theme": "Sistem bilangan puluhan ribu (万), perputaran pekan/minggu (周), kondisi langit (cerah/mendung), frekuensi tindakan (次), partikel aspek duratif (着), dan evaluasi puncak seluruh kurikulum HSK 2.",
        "grammar_points": [
            "Sistem bilangan skala besar empat digit: 万 (wàn - sepuluh ribu / 10.000: 一万, 两万五千).",
            "Penyebutan satuan pekan kalender: 周 (zhōu - minggu: 下周, 周末, 周一).",
            "Kata bantu frekuensi tindakan: 次 (cì - kali: 我去过两次中国).",
            "Kata penggolong kesopanan untuk orang: 位 (wèi - orang terhormat: 这位老师, 三位客人).",
            "Partikel aspek duratif tindakan: Kata Kerja + 着 (zhe - dalam keadaan berlangsung: 门开着, 穿着红衣服).",
            "Penghubung waktu dan ketuntasan: 就 (jiù), 从 (cóng), 时 (shí), 完 (wán - selesai)."
        ],
        "stages": [
            {"stage": 1, "name": "Bilangan Puluhan Ribu & Hitungan Finansial", "desc": "Mengenal 万, 商场"},
            {"stage": 2, "name": "Satuan Pekan & Dinamika Cuaca Langit", "desc": "Mengenal 周, 晴, 阴"},
            {"stage": 3, "name": "Frekuensi Peristiwa & Panggilan Terhormat", "desc": "Mengenal 次, 位"},
            {"stage": 4, "name": "Waktu, Asal-Usul & Aspek Duratif Tindakan", "desc": "Mengenal 就, 从, 时, 着"},
            {"stage": 5, "name": "Ketuntasan Tindakan & Penyelesaian Soal", "desc": "Mengenal 完, Evaluasi Latihan"},
            {"stage": 6, "name": "Grand Final Ujian HSK 2", "desc": "Ujian Evaluasi Puncak Menyeluruh 200 Kosakata HSK 2"}
        ],
        "words": [
            ("万", "wàn", "Angka", "sepuluh ribu (10.000)", "这辆新摩托车要一万块钱。"),
            ("商场", "shāngchǎng", "Kata Benda", "pusat perbelanjaan / mall", "周末很多人去大商场购物。"),
            ("周", "zhōu", "Kata Benda", "minggu / pekan", "下周我们要举行汉字比赛。"),
            ("晴", "qíng", "Kata Sifat", "cerah", "今天是个晴天，太阳很大。"),
            ("阴", "yīn", "Kata Sifat", "mendung / berawan", "今天天气很阴，好像要下雨了。"),
            ("次", "cì", "Kata Penggolong", "kali (frekuensi kejadian)", "这本书我已经认真读了三次。"),
            ("位", "wèi", "Kata Penggolong", "orang (penghormatan sopan)", "门口来了两位老朋友。"),
            ("就", "jiù", "Kata Keterangan", "langsung / segera / maka", "喝了热茶，我的头就不疼了。"),
            ("从", "cóng", "Kata Depan", "dari (arah / asal / waktu)", "从学校到我家只要十分钟。"),
            ("时", "shí", "Kata Benda", "saat / waktu / ketika", "吃饭时请不要大声说话。"),
            ("着", "zhe", "Partikel", "partikel aspek duratif (berlangsung)", "外面正下着雪呢。"),
            ("完", "wán", "Kata Kerja / Komplemen", "selesai / habis", "做完作业我们就可以去踢球了。"),
            ("一起", "yìqǐ", "Kata Keterangan", "bersama-sama", "我们大家一起学习汉语吧！")
        ]
    }
]

# Check coverage
all_assigned = []
for ch in chapters:
    for w in ch["words"]:
        all_assigned.append((w[0], w[1]))

print(f"Total assigned word entries: {len(all_assigned)}")
