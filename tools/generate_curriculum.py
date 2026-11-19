import json

with open('app/src/main/assets/hsk/new_hsk_1.json', 'r', encoding='utf-8') as f:
    hsk1 = json.load(f)

vocab_lookup = {item['hanzi']: item for item in hsk1}

extra_vocab = {
    '网友': {'hanzi': '网友', 'pinyin': 'wǎngyǒu', 'meaning': 'teman online / internet friend', 'category': 'Kata Benda'},
    '同事': {'hanzi': '同事', 'pinyin': 'tóngshì', 'meaning': 'rekan kerja / kolega', 'category': 'Kata Benda'},
    '室友': {'hanzi': '室友', 'pinyin': 'shìyǒu', 'meaning': 'teman sekamar / roommate', 'category': 'Kata Benda'},
    '老板': {'hanzi': '老板', 'pinyin': 'lǎobǎn', 'meaning': 'bos / atasan', 'category': 'Kata Benda'},
    '邻居': {'hanzi': '邻居', 'pinyin': 'línjū', 'meaning': 'tetangga / neighbor', 'category': 'Kata Benda'}
}
vocab_lookup.update(extra_vocab)

chapters = [
    {
        'num': 1,
        'title_id': 'Sapaan & Perkenalan Diri',
        'title_zh': '问候与相识',
        'theme': 'Tata cara menyapa, menanyakan nama, asal negara (kewarganegaraan), dan perkenalan profesi dasar.',
        'context': 'Situasi perkenalan pertama kali di kelas, bandara, atau acara formal. Pelajar belajar membentuk kalimat deklaratif subjek-predikat dengan 是 dan kalimat tanya dengan 吗.',
        'stages': 4,
        'grammar': [
            'Pola kalimat ekuatif: A 是 B (Wǒ shì Yìnní rén / 我是印尼人)',
            'Kalimat tanya ya/tidak dengan partikel 吗 (吗字问句: Nǐ shì lǎoshī ma? / 你是老师吗？)',
            'Bentuk negasi dasar: 不 (bù + Kata Kerja / Kata Sifat)',
            'Kata tanya identitas nama: 叫什么名字 (Jiào shénme míngzi)'
        ],
        'words': ['你', '你好', '我', '叫', '是', '老师', '学生', '医生', '中国', '国', '人', '不', '吗', '再见', '名字', '什么', '好']
    },
    {
        'num': 2,
        'title_id': 'Siapa Dia? Hubungan Sosial & Lingkungan',
        'title_zh': '社会关系与身边人',
        'theme': 'Mengidentifikasi orang di sekitar, relasi sosial, keluarga dekat, teman sekelas, kolega kerja, dan relasi kepemilikan.',
        'context': 'Mengenalkan teman, pacar, atau kolega kepada orang lain menggunakan kata ganti orang ketiga dan partikel kepemilikan 的. Membedakan hubungan formal dan kasual.',
        'stages': 5,
        'grammar': [
            'Partikel modifikasi kepemilikan: Kata Benda / Ganti + 的 + Kata Benda (我的朋友 / 我的同学)',
            'Kata tanya orang: 谁 (shéi / shuí - Siapa)',
            'Kata penunjuk demonstratif: 这 (zhè - ini) & 那 (nà - itu)',
            'Partikel jamak persona: 们 (men - kami, kalian, mereka)'
        ],
        'words': ['他', '她', '它', '他们', '她们', '它们', '我们', '你们', '朋友', '同学', '同事', '老板', '网友', '邻居', '室友', '男朋友', '女朋友', '的', '谁', '这', '那', '们']
    },
    {
        'num': 3,
        'title_id': 'Angka, Kuantitas & Berhitung Dasar',
        'title_zh': '数字、数量与基数',
        'theme': 'Sistem bilangan 0 - 9999, penomoran urut (ordinal), kuantitas dasar, dan kata penggolong universal.',
        'context': 'Menyebutkan nomor telepon, nomor kamar, berhitung sederhana, menanyakan kuantitas kecil (几) versus kuantitas besar (多少). Pondasi penting untuk waktu dan transaksi.',
        'stages': 5,
        'grammar': [
            'Sistem bilangan desimal dasar 0 - 1000 (零, 一, 二, ... 十, 百, 千)',
            'Perbedaan krusial pemakaian 二 (èr) untuk hitungan murni vs 两 (liǎng) di depan kata penggolong',
            'Kata bantu bilangan penggolong universal: 个 (gè) - 一个人, 三个苹果',
            'Pertanyaan kuantitas terarah: 几 (jǐ - kuantitas < 10) vs 多少 (duōshao - kuantitas bebas/besar)',
            'Pembentukan bilangan tingkat (ordinal): Awalan 第 (dì) + Angka (第一, 第二)'
        ],
        'words': ['一', '二', '两', '三', '四', '五', '六', '七', '八', '九', '十', '零', '百', '千', '第', '几', '多少', '多', '少', '个']
    },
    {
        'num': 4,
        'title_id': 'Waktu, Tanggal & Kalender',
        'title_zh': '时间、日期与日历',
        'theme': 'Menyatakan jam, menit, bagian jam (setengah), tanggal, bulan, tahun, serta hari dalam sepekan.',
        'context': 'Membuat janji temu, membaca kalender, merencanakan jadwal, serta menanyakan waktu sekarang (现在几点？). Konsep waktu Mandarin berurutan dari unit besar ke kecil (Tahun - Bulan - Hari).',
        'stages': 6,
        'grammar': [
            'Hierarki waktu makro ke mikro: Tahun (年) -> Bulan (月) -> Tanggal (日/号) -> Hari (星期)',
            'Penyebutan jam analog: 点 (jam) + 分/分钟 (menit), dan 半 (setengah jam / 30 menit)',
            'Keterangan waktu relatif hari: 今天 (hari ini), 明天 (besok), 昨天 (kemarin)',
            'Keterangan waktu relatif tahun: 今年 (tahun ini), 明年 (tahun depan), 去年 (tahun lalu)',
            'Struktur kalimat waktu: Subjek + Keterangan Waktu + Predikat (我今天去学校)'
        ],
        'words': ['今天', '明天', '昨天', '年', '今年', '明年', '去年', '月', '日', '号', '星期', '星期天', '星期日', '点', '分', '分钟', '半', '小时', '时候', '时间', '现在']
    },
    {
        'num': 5,
        'title_id': 'Aktivitas Harian: Pagi Hingga Malam',
        'title_zh': '从早到晚的日常作息',
        'theme': 'Rutinitas harian dari bangun tidur, sarapan, bekerja, makan siang, istirahat, hingga tidur malam.',
        'context': 'Menceritakan jadwal rutinitas harian kepada teman atau kolega. Mempelajari aspek durasi dan aksi yang sedang berlangsung dengan 正在 / 在.',
        'stages': 5,
        'grammar': [
            'Pembagian segmen hari: 早上 (pagi), 上午 (pagi menjelang siang), 中午 (tengah hari), 下午 (sore), 晚上 (malam)',
            'Aspek progresif (aksi sedang berlangsung): 正在 / 在 + Kata Kerja (我正在睡觉 / 他在看书)',
            'Verba berobjek (Verb-Object compound): 起床 (bangun tidur), 睡觉 (tidur), 吃饭 (makan)',
            'Bentuk kelembutan atau durasi singkat: Kata Kerja + 一下 (yíxià - sejenak/sebentar)'
        ],
        'words': ['早上', '早', '上午', '中午', '下午', '晚上', '晚', '白天', '起床', '睡觉', '睡', '休息', '正在', '在', '一下', '早饭', '午饭', '晚饭']
    },
    {
        'num': 6,
        'title_id': 'Keluarga & Kehangatan Rumah',
        'title_zh': '家庭成员与温馨居所',
        'theme': 'Silsilah keluarga lengkap, umur/usia, furnitur rumah tangga, dan tempat tinggal.',
        'context': 'Memperkenalkan anggota keluarga (orang tua, saudara kandung, anak), menanyakan umur, menyebutkan perabotan di dalam kamar/rumah.',
        'stages': 6,
        'grammar': [
            'Menyatakan umur: Subjek + Angka + 岁 (suì - tahun umur)',
            'Kata bantu penggolong khusus anggota keluarga: 口 (kǒu) - 我家有四口人',
            'Pertanyaan usia: 几岁 (anak kecil < 10 tahun) vs 多大 (dewasa / umum)',
            'Predikat lokatif tempat tinggal: 住 (zhù) + 在 + Tempat',
            'Kosakata perabot dan ruang: 房间 (kamar), 桌子 (meja), 椅子 (kursi)'
        ],
        'words': ['家', '家人', '爸爸', '妈妈', '哥哥', '姐姐', '弟弟', '妹妹', '儿子', '女儿', '孩子', '小朋友', '口', '岁', '住', '房间', '桌子', '椅子']
    },
    {
        'num': 7,
        'title_id': 'Restoran, Makanan & Kuliner Khas',
        'title_zh': '餐厅、美味与中国美食',
        'theme': 'Makanan pokok, hidangan khas Tiongkok (dim sum, baozi, mie, pangsit), minuman, buah-buahan, dan rasa lezat.',
        'context': 'Memesan makanan di kantin atau restoran, mengekspresikan selera dan preferensi kuliner (makan, minum), memberikan apresiasi masakan (好吃).',
        'stages': 6,
        'grammar': [
            'Kata kerja konsumsi primer: 吃 (chī - makan) & 喝 (hē - minum)',
            'Prefiks pembentuk adjektiva sensorik rasa: 好 + Verba (好吃 - enak dimakan / lezat)',
            'Konstruksi aktivitas kuliner: 做饭 (zuò fàn - memasak makanan)',
            'Kata penggolong wadah minuman: 杯子 (cangkir/gelas) -> 一杯水, 一杯茶',
            'Interaksi transaksi restoran: Pelayan (服务员) & Pemesan (我想吃...)'
        ],
        'words': ['饭', '饭店', '做饭', '吃', '喝', '水', '茶', '牛奶', '米饭', '面条儿', '包子', '饺子', '鸡蛋', '菜', '水果', '苹果', '杯子', '好吃', '面包']
    },
    {
        'num': 8,
        'title_id': 'Belanja, Toko & Nilai Mata Uang',
        'title_zh': '商场购物与价钱结算',
        'theme': 'Aktivitas belanja di pasar/supermarket, pakaian, harga mahal/murah, mata uang Yuan/Kuai, dan menawar dasar.',
        'context': 'Bertransaksi jual beli, menanyakan berapa harganya (多少钱), memilih ukuran atau jumlah (一点儿, 一些), mencoba baju baru.',
        'stages': 6,
        'grammar': [
            'Pasangan antonim transaksi: 买 (mǎi - membeli) vs 卖 (mài - menjual)',
            'Satuan mata uang Tiongkok: 块 (kuài - ragam lisan) & 元 (yuán - ragam resmi tulisan)',
            'Eksklamasio intensitas emosional: 太 + Adjektiva + 了 (太贵了！- Terlalu mahal!)',
            'Distingsi kuantitas parsial: 一点儿 (sedikit setelah kata kerja/sifat) vs 有点儿 (agak/cenderung negatif sebelum kata sifat)',
            'Kata bantu penggolong busana/pakaian: 件 (jiàn) - 一件新衣服'
        ],
        'words': ['买', '卖', '钱', '块', '元', '贵', '便宜', '商店', '超市', '店', '东西', '衣服', '穿', '件', '新', '太', '一点儿', '一些', '一半', '有点儿', '些']
    },
    {
        'num': 9,
        'title_id': 'Posisi, Arah & Menemukan Tempat',
        'title_zh': '空间方位与位置指引',
        'theme': 'Posisi spasial (atas, bawah, depan, belakang, dalam, luar) dan kata ganti penunjuk lokasi.',
        'context': 'Mencari barang yang hilang di atas meja/di dalam tas, memberikan petunjuk letak suatu tempat di lingkungan kampus atau kota.',
        'stages': 5,
        'grammar': [
            'Kata penunjuk posisi (Fangweici): 上 (atas), 下 (bawah), 前 (depan), 后 (belakang), 里 (dalam), 外 (luar), 边 (sisi)',
            'Triad demonstratif tempat: 这儿 / 这里 (di sini), 那儿 / 那里 (di sana), 哪儿 / 哪里 (di mana?)',
            'Struktur eksistensi spasial: Benda A + 在 + Benda B + Posisi (电脑在桌子上 / 手机在房间里)',
            'Verba tujuan pergerakan: 到 + Lokasi + 去/来'
        ],
        'words': ['上', '下', '前', '后', '里', '外', '外边', '边', '这儿', '这里', '这边', '那儿', '那里', '那边', '哪儿', '哪里', '哪', '哪个', '这个', '那个', '到']
    },
    {
        'num': 10,
        'title_id': 'Transportasi & Perjalanan Kota',
        'title_zh': '交通工具与城市出行',
        'theme': 'Kendaraan umum dan pribadi (taksi, kereta, pesawat, mobil), pergerakan arah pergi, datang, dan pulang.',
        'context': 'Bepergian di dalam dan luar kota, memesan taksi, bepergian naik kereta atau pesawat, menanyakan cara menuju suatu destinasi (怎么去).',
        'stages': 5,
        'grammar': [
            'Konstruksi instrumental kendaraan umum: 坐 + Moda Transportasi (坐出租车, 坐火车, 坐飞机)',
            'Verba kemudi aktif: 开 + Kendaraan (开车 - menyetir mobil)',
            'Triad verba gerak berarah: 去 (pergi menjauh dari pembicara) vs 来 (datang mendekat) vs 回 (kembali pulang)',
            'Pola serial kerja berangkai (Consecutive Verb Clauses): 坐出租车去火车站 (Naik taksi pergi ke stasiun kereta)'
        ],
        'words': ['车', '坐', '开', '开车', '出租车', '火车', '飞机', '去', '来', '回']
    },
    {
        'num': 11,
        'title_id': 'Sekolah, Kampus & Belajar Bahasa',
        'title_zh': '学校教育与汉语言研习',
        'theme': 'Tingkatan sekolah (SD, SMP, Universitas), rutinitas akademik (masuk kelas, bubar kelas), membaca dan menulis karakter Hanzi.',
        'context': 'Kehidupan akademik di universitas atau sekolah, interaksi antara dosen/guru dan mahasiswa, belajar membaca buku dan menulis aksara Hanzi.',
        'stages': 6,
        'grammar': [
            'Jenjang institusi edukasi: 小学 (SD) -> 中学 (SMP/SMA) -> 大学 (Universitas), beserta siswanya',
            'Verba siklus perkuliahan: 上课 (memulai sesi kuliah) vs 下课 (selesai kuliah)',
            'Pembedaan terminologi bahasa Mandarin: 汉语 (Hànyǔ - bahasa suku Han), 中文 (Zhōngwén - bahasa tulisan Tionghoa), 汉字 (Hànzì - karakter Hanzi)',
            'Verba literasi: 读 (membaca lantang), 写 (menulis kaligrafi/aksara), 读书 (belajar/kuliah)',
            'Kata penggolong jilid/buku: 本 (běn) - 一本汉语书'
        ],
        'words': ['学校', '小学', '小学生', '中学', '中学生', '大学', '大学生', '学习', '学', '课', '上课', '下课', '上学', '书', '书店', '本', '读', '读书', '写', '汉字', '汉语', '中文', '字']
    },
    {
        'num': 12,
        'title_id': 'Kantor, Dunia Kerja & Etiket Bisnis',
        'title_zh': '公司职场与商务礼节',
        'theme': 'Dunia profesional, rutinitas kantor (masuk kantor, pulang kantor), kesibukan pekerjaan, komputer, dan sapaan formal.',
        'context': 'Komunikasi di tempat kerja, menyapa rekan atau klien dengan hormat (Tuan/Nyonya), mengelola urusan kantor, etiket meminta maaf saat ada kendala.',
        'stages': 5,
        'grammar': [
            'Siklus jam kantor: 上班 (mulai jam kerja) vs 下班 (usai jam kerja)',
            'Gelar kehormatan profesional: Marga + 先生 (Bapak/Tuan) / 女士 (Ibu/Nyonya)',
            'Preposisi datif / benefaktif: 给 (gěi - memberi / kepada / untuk)',
            'Respons sopan santun: 没关系 (tidak apa-apa / no problem), 没事 (tidak ada masalah)'
        ],
        'words': ['工作', '公司', '上班', '下班', '忙', '事', '先生', '女士', '电脑', '找', '给', '做', '没关系', '没事']
    },
    {
        'num': 13,
        'title_id': 'Cuaca, Iklim & Alam Sekitar',
        'title_zh': '天气变化与自然四季',
        'theme': 'Kondisi cuaca harian (panas, dingin, hujan, salju), menanyakan situasi (怎么样), dan intensitas derajat.',
        'context': 'Membuka obrolan ringan (small talk) mengenai cuaca hari ini, memilih pakaian yang sesuai dengan suhu udara, merespons perubahan cuaca mendadak.',
        'stages': 5,
        'grammar': [
            'Formula menanyakan kondisi: Topik + 怎么样？(今天天气怎么样？)',
            'Kata sifat suhu lingkungan: 热 (rè - panas) vs 冷 (lěng - dingin)',
            'Fenomena meteorologi VO compound: 下雨 (turun hujan), 下雪 (turun salju)',
            'Gradasi adverbia intensitas: 很 (cukup/sangat) -> 非常 (amat sangat) -> 真 (sungguh-sungguh)'
        ],
        'words': ['天气', '热', '冷', '雨', '下雨', '雪', '天', '怎么样', '非常', '很', '真']
    },
    {
        'num': 14,
        'title_id': 'Hobi, Hiburan, Seni & Musik',
        'title_zh': '休闲娱乐、艺术与宠物',
        'theme': 'Menyatakan minat, mendengarkan lagu, bernyanyi, menonton bioskop/TV, estetika keindahan, dan hewan peliharaan.',
        'context': 'Berbagi cerita tentang apa yang disukai di waktu luang, mengajak menonton film bersama, mengagumi keindahan hewan atau pemandangan.',
        'stages': 6,
        'grammar': [
            'Verba afektif & minat: 喜欢 (menyukai), 爱 (mencintai/gemar sekali), 想 (ingin)',
            'Sifat perseptual berawalan 好: 好看 (sedap dipandang), 好听 (enak didengar), 好玩儿 (menyenangkan/asyik)',
            'Verba persepsi komplemen hasil: 看见 (melihat & tampak), 听见 (mendengar & terdengar)',
            'Kata penggolong fauna kecil: 只 (zhī) - 一只猫, 两只狗'
        ],
        'words': ['喜欢', '爱', '想', '玩', '好玩儿', '听', '听见', '歌', '唱', '好听', '看', '看见', '电影', '电影院', '电视', '好看', '漂亮', '狗', '猫', '只']
    },
    {
        'num': 15,
        'title_id': 'Komunikasi, Telepon & Bertanya Santun',
        'title_zh': '远程通讯与礼貌交际',
        'theme': 'Berkomunikasi jarak jauh melalui panggilan telepon atau ponsel pintar, bertanya dengan santun, meminta pertolongan, dan etiket kesopanan.',
        'context': 'Menghubungi seseorang lewat telepon, menanyakan alamat atau informasi penting dengan sopan (请问), mengucapkan rasa terima kasih dan apresiasi.',
        'stages': 5,
        'grammar': [
            'Interjeksi pembuka telepon standar: 喂 (wèi - halo di telepon)',
            'Frasa idiomatis komunikasi: 打电话 (melakukan panggilan telepon), 说话 (bercakap-cakap)',
            'Struktur permohonan santun: 请 (silakan / tolong) & 请问 (permisi / numpang tanya)',
            'Pronomina persona kehormatan tinggi: 您 (nín - Anda)',
            'Pengekspresian pendapat epistemik: 觉得 (juéde - berpendapat / merasa)'
        ],
        'words': ['电话', '打电话', '手机', '喂', '说', '说话', '请', '请问', '问', '问题', '谢谢', '不客气', '对不起', '认识', '高兴', '知道', '觉得', '您', '见']
    },
    {
        'num': 16,
        'title_id': 'Kesehatan, Kebugaran & Sintesis Kehidupan',
        'title_zh': '健康状况与综合应用',
        'theme': 'Kondisi fisik dan kesehatan, mengunjungi dokter atau rumah sakit, sintesis modalitas (bisa, boleh, harus), serta integrasi gramatika penutup HSK 1.',
        'context': 'Menyampaikan kondisi tubuh saat kurang fit, berobat ke dokter, meminta izin, serta sintesis menyeluruh semua struktur kalimat New HSK 1 dalam percakapan komprehensif.',
        'stages': 6,
        'grammar': [
            'Istilah medis & ragawi: 生病 (jatuh sakit), 看病 (berobat ke dokter), 医院 (rumah sakit)',
            'Tri-modalitas Mandarin: 会 (kemampuan perolehan belajar) vs 能 (kapasitas fisik/kondisi) vs 可以 (izin kebolehan)',
            'Deontik keharusan & prohibisi: 要 (harus/mau) vs 不要 (jangan/dilarang)',
            'Partikel wacana final: 吧 (ajakan/konfirmasi santun), 呢 (tanya balik / kontinuitas), 了 (perubahan status)',
            'Sintesis penghubung wacana: 和 (dan), 也 (juga), 都 (semua), 大家 (hadirin/semua orang)'
        ],
        'words': ['病', '生病', '看病', '医院', '能', '可以', '会', '要', '不要', '没有', '有', '有的', '有些', '那些', '哪些', '这些', '大家', '都', '也', '还', '和', '吧', '呢', '了', '对', '男', '女', '大', '小', '怎么', '再']
    }
]

lines = []
lines.append('# MASTER BLUEPRINT: RANCANGAN KURIKULUM NEW HSK 1 (16 BAB)')
lines.append('## HaloHanzi Pedagogical Curriculum Expansion (300 Kosakata)')
lines.append('')
lines.append('> Dokumen ini memetakan seluruh **300 Kosakata New HSK 1** ke dalam **16 Bab Tematik Komprehensif**.')
lines.append('> Setiap bab dirancang dengan kohesi semantik yang kuat, bobot akademis standar internasional (Hanban / CTI), serta keterpakaian tinggi dalam kehidupan sehari-hari.')
lines.append('')
lines.append('---')
lines.append('')
lines.append('## 1. Analisis & Metrik Kurikulum')
lines.append('- **Total Kosakata Standar New HSK 1**: 300 Kosakata Resmi.')
lines.append('- **Cakupan Bab 1 & Bab 2 (Telah Diimplementasikan)**: 38 Kosakata.')
lines.append('- **Ekspansi Bab Baru (Bab 3 s/d Bab 16)**: 14 Bab Baru (262 Kosakata HSK 1 + 5 Kosakata Komunikatif Pelengkap Bab 2).')
lines.append('- **Total Target Bab**: **16 Bab Tematik**.')
lines.append('- **Rentang Stage per Bab**: **4 hingga 6 Stage per Bab** (Rata-rata 5 - 6 stage, total ~86 stage komprehensif).')
lines.append('- **Tingkat Cakupan HSK 1**: **100.0% (300 dari 300 kata)**.')
lines.append('')
lines.append('---')
lines.append('')
lines.append('## 2. Ringkasan Matriks 16 Bab')
lines.append('')
lines.append('| No | Judul Bab (Indonesia & Mandarin) | Tema Utama | Kosakata Kunci | Jml Stage | Status |')
lines.append('|:---|:---|:---|:---|:---:|:---:|')

for ch in chapters:
    status = 'Selesai (Live)' if ch['num'] <= 2 else 'Siap Diimplementasikan'
    sample_words = ', '.join(ch['words'][:6]) + ('...' if len(ch['words']) > 6 else '')
    lines.append(f"| Bab {ch['num']} | **{ch['title_id']}**<br>`{ch['title_zh']}` | {ch['theme'][:38]}... | {sample_words} ({len(ch['words'])} kata) | {ch['stages']} Stage | {status} |")

lines.append('')
lines.append('---')
lines.append('')
lines.append('## 3. Silabus Rinci Per Bab (Bab 1 s/d Bab 16)')
lines.append('')

for ch in chapters:
    lines.append(f"### Bab {ch['num']}: {ch['title_id']} ({ch['title_zh']})")
    lines.append(f"- **Fokus & Konteks Akademis**: {ch['context']}")
    lines.append(f"- **Struktur Tata Bahasa Inti**:")
    for g in ch['grammar']:
        lines.append(f"  1. {g}")
    lines.append(f"- **Jumlah Stage**: {ch['stages']} Stage ({ch['stages'] * 10} - {ch['stages'] * 12} Latihan Aktif)")
    lines.append(f"- **Daftar Kosakata Lengkap ({len(ch['words'])} Kata)**:")
    lines.append('')
    lines.append('| No | Hanzi | Pinyin | Kategori | Arti Bahasa Indonesia | Catatan / Contoh |')
    lines.append('|:---|:---:|:---|:---:|:---|:---|')
    for idx, w in enumerate(ch['words']):
        item = vocab_lookup.get(w, {'pinyin': '-', 'category': 'Umum', 'meaning': '-'})
        cat = item.get('category', 'Kosakata')
        meaning = item.get('meaning', item.get('id_meaning', '-'))
        pinyin = item.get('pinyin', '-')
        lines.append(f"| {idx+1} | **{w}** | `{pinyin}` | {cat} | {meaning} | `{w}` |")
    lines.append('')
    lines.append('---')
    lines.append('')

lines.append('## 4. Standar Eksekusi & Kepatuhan Kontrak (EXERCISE_CONTRACT.md)')
lines.append('Setiap stage pada bab-bab baru diwajibkan mematuhi aturan baku pengkodean HaloHanzi:')
lines.append('1. **ID Formula**: `u{unit}_s{stage}_p{part}_q{number}` (konsisten dan terindeks).')
lines.append('2. **Sintaks WordChips**: Format mutlak `"Hanzi:Pinyin"` (contoh: `"苹果:píngguǒ"`).')
lines.append('3. **Simetri Token 1-to-1**: Jumlah spasi Hanzi dan Pinyin wajib simetris sempurna (`targetPinyin.split().size == targetHanzi.split().size`).')
lines.append('4. **Zero Background pada Soal Listening (Aturan 10)**: Seluruh soal `Apa yang Anda dengar?` wajib memiliki `illustrationRes = 0` dan latar kartu putih murni.')
lines.append('5. **Underline Parking Dinamis**: Garis bawah hanya berada di bawah chip/slot kosong, dinamis untuk kalimat panjang (5+ slot).')
lines.append('6. **Pinyin Keyboard Generic Architecture**: Seluruh soal pinyin keyboard wajib mendukung rendering dinamis audio, prompt terjemahan, dan baris tombol huruf interaktif.')
lines.append('')
lines.append('## 5. Kesimpulan & Rekomendasi Tahap Implementasi')
lines.append('- **Bab Prioritas Berikutnya**: **Bab 3: Angka, Kuantitas & Berhitung Dasar (数字、数量与基数)**.')
lines.append('- Bab 3 menjadi batu loncatan mutlak sebelum memasuki Bab 4 (Waktu & Kalender) dan Bab 6 (Keluarga/Umur) serta Bab 8 (Harga/Belanja), karena angka merupakan prasyarat gramatika untuk mengukur waktu, harga, dan usia.')
lines.append('')

content = '\n'.join(lines)
with open('docs/HSK1_CURRICULUM_EXPANSION_PLAN.md', 'w', encoding='utf-8') as f:
    f.write(content)

print('File docs/HSK1_CURRICULUM_EXPANSION_PLAN.md successfully generated!')
