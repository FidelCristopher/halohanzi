package com.example.chineselearning.data.repository

import com.example.chineselearning.R
import com.example.chineselearning.data.model.Sentence
import com.example.chineselearning.data.model.Story
import com.example.chineselearning.data.model.StoryQuestion
import com.example.chineselearning.data.model.WordToken

val mandarinBeanStoriesPart6: List<Story> by lazy {
    listOf(
        // Cerita Mandarin Bean 83 (HSK 2): Dad Cried (Ayah Menangis)
        Story(
            id = "story_dad_cried",
            titleHanzi = "爸爸哭了",
            titlePinyin = "Bàba Kū Le",
            titleTranslation = "Dad Cried (Ayah Menangis)",
            level = "HSK 2",
            category = "Keluarga & Emosi",
            description = "Kisah haru seorang anak yang menabung uang sakunya demi 'membeli' satu jam waktu kebersamaan bersama ayahnya.",
            coverEmoji = "😢",
            coverImageRes = R.drawable.cover_story_dad_cried,
            estimatedReadMinutes = 2,
            sentences = listOf(
                Sentence(
                    id = "s_dadcry_1",
                    hanzi = "爸爸的工作很忙。",
                    pinyin = "bà ba de gōng zuò hěn máng",
                    translation = "Pekerjaan ayah sangat sibuk.",
                    tokens = listOf(
                        WordToken("爸爸", "bà ba", "Ayah", "Anggota keluarga"),
                        WordToken("的", "de", "Punya / Yang (partikel posesif)", "Partikel penjelas modifikasi atau kepemilikan"),
                        WordToken("工作", "gōng zuò", "Bekerja", "Aktivitas mata pencaharian"),
                        WordToken("很", "hěn", "Sangat", "Tingkat derajat"),
                        WordToken("忙", "máng", "Sibuk", "Banyak aktivitas pekerjaan")
                    )
                ),
                Sentence(
                    id = "s_dadcry_2",
                    hanzi = "每天我还没起床，他就走了；晚上我要睡觉了，他才回家。",
                    pinyin = "měi tiān wǒ hái méi qǐ chuáng tā jiù zǒu le wǎn shang wǒ yào shuì jiào le tā cái huí jiā",
                    translation = "Setiap hari sebelum saya bangun tidur, dia sudah berangkat; malam hari saat saya hendak tidur, dia baru sampai di rumah.",
                    tokens = listOf(
                        WordToken("每", "měi", "Each", "Kosakata HSK 2: 每 (měi)"),
                        WordToken("天", "tiān", "Hari", "Satuan hari"),
                        WordToken("我", "wǒ", "Saya", "Kata ganti orang pertama tunggal"),
                        WordToken("还", "hái", "Masih / Malahan", "Menyatakan kelanjutan situasi"),
                        WordToken("没", "méi", "Belum / Tidak", "Kata sangkalan untuk keberadaan atau masa lampau"),
                        WordToken("起床", "qǐ chuáng", "Bangun tidur", "Memulai hari dari ranjang"),
                        WordToken("他", "tā", "Dia (laki-laki)", "Kata ganti orang ketiga tunggal"),
                        WordToken("就", "jiù", "Langsung / Segera / Maka", "Menyatakan ketepatan waktu atau kelogisan"),
                        WordToken("走", "zǒu", "To walk", "Kosakata HSK 2: 走 (zǒu)"),
                        WordToken("了", "le", "Sudah (partikel perubahan situasi)", "Partikel aspek selesainya tindakan"),
                        WordToken("晚上", "wǎn shang", "Malam hari", "Waktu malam"),
                        WordToken("我", "wǒ", "Saya", "Kata ganti orang pertama tunggal"),
                        WordToken("要", "yào", "Mau / Akan / Harus", "Menyatakan niat atau keharusan"),
                        WordToken("睡觉", "shuì jiào", "Tidur", "Beristirahat malam"),
                        WordToken("了", "le", "Sudah (partikel perubahan situasi)", "Partikel aspek selesainya tindakan"),
                        WordToken("他", "tā", "Dia (laki-laki)", "Kata ganti orang ketiga tunggal"),
                        WordToken("才", "cái", "Baru saja / Justru", "Menyatakan keterlambatan atau kondisi khusus"),
                        WordToken("回", "huí", "Kembali / Pulang", "Menuju ke tempat asal"),
                        WordToken("家", "jiā", "Rumah / Keluarga", "Tempat tinggal")
                    )
                ),
                Sentence(
                    id = "s_dadcry_3",
                    hanzi = "昨天我生日，我就打电话问爸爸他一个小时可以赚多少钱，他有点儿不高兴。",
                    pinyin = "zuó tiān wǒ shēng rì wǒ jiù dǎ diàn huà wèn bà ba tā yī gè xiǎo shí kě yǐ zhuàn duō shao qián tā yǒu diǎn r bù gāo xìng",
                    translation = "Kemarin pada hari ulang tahun saya, saya menelepon ayah dan bertanya berapa banyak uang yang bisa dia hasilkan dalam satu jam, ayah tampak agak tidak senang.",
                    tokens = listOf(
                        WordToken("昨天", "zuó tiān", "Kemarin", "Keterangan waktu lampau"),
                        WordToken("我", "wǒ", "Saya", "Kata ganti orang pertama tunggal"),
                        WordToken("生日", "shēng rì", "Hari ulang tahun", "Hari kelahiran"),
                        WordToken("我", "wǒ", "Saya", "Kata ganti orang pertama tunggal"),
                        WordToken("就", "jiù", "Langsung / Segera / Maka", "Menyatakan ketepatan waktu atau kelogisan"),
                        WordToken("打电话", "dǎ diàn huà", "To make a telephone call", "Kosakata HSK 2: 打电话 (dǎ diàn huà)"),
                        WordToken("问", "wèn", "To ask; to inquire", "Kosakata HSK 2: 问 (wèn)"),
                        WordToken("爸爸", "bà ba", "Ayah", "Anggota keluarga"),
                        WordToken("他", "tā", "Dia (laki-laki)", "Kata ganti orang ketiga tunggal"),
                        WordToken("一", "yī", "One", "Kosakata HSK 2: 一 (yī)"),
                        WordToken("个", "gè", "Classifier for people or objects in general", "Kosakata HSK 2: 个 (gè)"),
                        WordToken("小时", "xiǎo shí", "Jam (durasi)", "Lamanya waktu dalam jam"),
                        WordToken("可以", "kě yǐ", "Boleh / Dapat", "Menyatakan izin atau kemungkinan"),
                        WordToken("赚", "zhuàn", "To earn", "Kosakata HSK 2: 赚 (zhuàn)"),
                        WordToken("多少", "duō shao", "How much?; how many?", "Kosakata HSK 2: 多少 (duō shao)"),
                        WordToken("钱", "qián", "Coin", "Kosakata HSK 2: 钱 (qián)"),
                        WordToken("他", "tā", "Dia (laki-laki)", "Kata ganti orang ketiga tunggal"),
                        WordToken("有", "yǒu", "Mempunyai / Ada", "Menyatakan kepemilikan atau eksistensi"),
                        WordToken("点儿", "diǎn r", "Erhua", "Kosakata HSK 2: 点儿 (diǎn r)"),
                        WordToken("不", "bù", "Tidak", "Kata sangkalan untuk masa kini atau masa depan"),
                        WordToken("高兴", "gāo xìng", "Senang / Gembira", "Perasaan ceria bahagia")
                    )
                ),
                Sentence(
                    id = "s_dadcry_4",
                    hanzi = "我说：“爸爸，我现在有二十块钱，想买你一个小时，可以吗？",
                    pinyin = "wǒ shuō bà ba wǒ xiàn zài yǒu èr shí kuài qián xiǎng mǎi nǐ yī gè xiǎo shí kě yǐ ma",
                    translation = "Saya berkata: “Ayah, sekarang saya punya uang dua puluh yuan, ingin membeli satu jam waktumu, bolehkah?”",
                    tokens = listOf(
                        WordToken("我", "wǒ", "Saya", "Kata ganti orang pertama tunggal"),
                        WordToken("说", "shuō", "Berbicara / Berkata", "Menyampaikan ucapan"),
                        WordToken("爸爸", "bà ba", "Ayah", "Anggota keluarga"),
                        WordToken("我", "wǒ", "Saya", "Kata ganti orang pertama tunggal"),
                        WordToken("现在", "xiàn zài", "Sekarang", "Waktu saat ini"),
                        WordToken("有", "yǒu", "Mempunyai / Ada", "Menyatakan kepemilikan atau eksistensi"),
                        WordToken("二十", "èr shí", "Twenty; 20", "Kosakata HSK 2: 二十 (èr shí)"),
                        WordToken("块", "kuài", "Classifier for pieces of cloth, cake, soap etc", "Kosakata HSK 2: 块 (kuài)"),
                        WordToken("钱", "qián", "Coin", "Kosakata HSK 2: 钱 (qián)"),
                        WordToken("想", "xiǎng", "Ingin / Berpikir / Rindu", "Keinginan atau pemikiran batin"),
                        WordToken("买", "mǎi", "Membeli", "Transaksi belanja"),
                        WordToken("你", "nǐ", "Kamu", "Kata ganti orang kedua tunggal"),
                        WordToken("一", "yī", "One", "Kosakata HSK 2: 一 (yī)"),
                        WordToken("个", "gè", "Classifier for people or objects in general", "Kosakata HSK 2: 个 (gè)"),
                        WordToken("小时", "xiǎo shí", "Jam (durasi)", "Lamanya waktu dalam jam"),
                        WordToken("可以", "kě yǐ", "Boleh / Dapat", "Menyatakan izin atau kemungkinan"),
                        WordToken("吗", "ma", "Apakah (partikel tanya)", "Partikel di akhir kalimat interogatif ya/tidak")
                    )
                ),
                Sentence(
                    id = "s_dadcry_5",
                    hanzi = "今天我想和你一起吃生日蛋糕。”",
                    pinyin = "jīn tiān wǒ xiǎng hé nǐ yī qǐ chī shēng rì dàn gāo",
                    translation = "“Hari ini saya ingin makan kue ulang tahun bersama Ayah.”",
                    tokens = listOf(
                        WordToken("今天", "jīn tiān", "Hari ini", "Keterangan waktu sekarang"),
                        WordToken("我", "wǒ", "Saya", "Kata ganti orang pertama tunggal"),
                        WordToken("想", "xiǎng", "Ingin / Berpikir / Rindu", "Keinginan atau pemikiran batin"),
                        WordToken("和", "hé", "Dan", "Kata hubung setara"),
                        WordToken("你", "nǐ", "Kamu", "Kata ganti orang kedua tunggal"),
                        WordToken("一起", "yī qǐ", "Together; in company (with)", "Kosakata HSK 2: 一起 (yī qǐ)"),
                        WordToken("吃", "chī", "Makan", "Aktivitas mengonsumsi makanan"),
                        WordToken("生日", "shēng rì", "Hari ulang tahun", "Hari kelahiran"),
                        WordToken("蛋糕", "dàn gāo", "Kue tart / Cake", "Makanan manis perayaan")
                    )
                ),
                Sentence(
                    id = "s_dadcry_6",
                    hanzi = "然后爸爸在电话里哭了。",
                    pinyin = "rán hòu bà ba zài diàn huà lǐ kū le",
                    translation = "Lalu ayah menangis di ujung telepon.",
                    tokens = listOf(
                        WordToken("然后", "rán hòu", "Then; after that; afterwards", "Kosakata HSK 2: 然后 (rán hòu)"),
                        WordToken("爸爸", "bà ba", "Ayah", "Anggota keluarga"),
                        WordToken("在", "zài", "Di / Berada di", "Preposisi lokasi atau aspek progresif"),
                        WordToken("电话", "diàn huà", "Telephone", "Kosakata HSK 2: 电话 (diàn huà)"),
                        WordToken("里", "lǐ", "Lining", "Kosakata HSK 2: 里 (lǐ)"),
                        WordToken("哭", "kū", "Menangis", "Ekspresi kesedihan atau haru"),
                        WordToken("了", "le", "Sudah (partikel perubahan situasi)", "Partikel aspek selesainya tindakan")
                    )
                )
            ),
            questions = listOf(
                StoryQuestion(
                    id = "q_dadcry_1",
                    questionText = "爸爸平时的日常工作怎么样？ (Bagaimana keseharian kerja sang ayah?)",
                    options = listOf("很轻松 (Sangat santai)", "非常忙，早出晚归 (Sangat sibuk, berangkat sebelum anak bangun dan pulang larut)", "不工作 (Tidak bekerja)", "经常在家睡觉 (Sering tidur di rumah)"),
                    correctAnswerIndex = 1,
                    explanation = "Ayah berangkat kerja saat anak belum bangun dan baru kembali larut malam."
                ),
                StoryQuestion(
                    id = "q_dadcry_2",
                    questionText = "孩子在生日时打电话问爸爸什么？ (Pertanyaan apa yang diajukan anak lewat telepon saat ulang tahun?)",
                    options = listOf("能不能买玩具 (Boleh beli mainan atau tidak)", "爸爸一个小时可以赚多少钱 (Berapa uang yang dihasilkan ayah dalam satu jam)", "爸爸什么时候买车 (Kapan ayah membeli mobil)", "妈妈去哪儿了 (Ibu pergi ke mana)"),
                    correctAnswerIndex = 1,
                    explanation = "Anak bertanya '爸爸他一个小时可以赚多少钱' untuk mengetahui nilai upah per jam ayahnya."
                ),
                StoryQuestion(
                    id = "q_dadcry_3",
                    questionText = "孩子为什么想要给爸爸钱？ (Mengapa sang anak ingin memberikan uang tabungannya kepada ayah?)",
                    options = listOf("为了买爸爸一个小时的时间陪自己 (Untuk 'membeli' 1 jam waktu ayah agar bisa menemani dirinya)", "让爸爸买衣服 (Agar ayah membeli baju)", "让爸爸去旅游 (Supaya ayah pergi liburan)", "还借款 (Membayar utang)"),
                    correctAnswerIndex = 0,
                    explanation = "Anak ingin menghabiskan waktu bermain bersama sang ayah di hari ulang tahunnya."
                ),
                StoryQuestion(
                    id = "q_dadcry_4",
                    questionText = "爸爸听了孩子的话后有什么反应？ (Bagaimana reaksi ayah setelah mendengar ucapan anaknya?)",
                    options = listOf("很生气 (Sangat marah)", "感动得哭了，抱住了孩子 (Terharu menangis dan memeluk erat anaknya)", "笑了笑走开了 (Tersenyum lalu pergi)", "拒绝了孩子 (Menolak permintaan anak)"),
                    correctAnswerIndex = 1,
                    explanation = "Ayah tersentuh hatinya menyadari kerinduan mendalam sang anak akan kehadirannya."
                )
            )
        ),
        // Cerita Mandarin Bean 84 (HSK 2): Make Phone Calls (Menelepon)
        Story(
            id = "story_make_phone_calls",
            titleHanzi = "打电话",
            titlePinyin = "Dǎ Diànhuà",
            titleTranslation = "Make Phone Calls (Menelepon)",
            level = "HSK 2",
            category = "Komunikasi Telepon",
            description = "Percakapan telepon siswa bernama Suzumi (Lingmei) meminta izin sakit kepada dosen melalui sekretariat kampus.",
            coverEmoji = "📞",
            coverImageRes = R.drawable.cover_story_make_phone_calls,
            estimatedReadMinutes = 2,
            sentences = listOf(
                Sentence(
                    id = "s_phcall_1",
                    hanzi = "（1） A：喂？",
                    pinyin = "wéi",
                    translation = "（1） A: Halo?",
                    tokens = listOf(
                        WordToken("喂", "wéi", "Hello (when answering the phone)", "Kosakata HSK 2: 喂 (wéi)")
                    )
                ),
                Sentence(
                    id = "s_phcall_2",
                    hanzi = "铃美：喂，王老师，您好，我是铃美。",
                    pinyin = "Líng měi wèi Wáng lǎo shī nín hǎo wǒ shì Líng měi",
                    translation = "Lingmei: Halo, Dosen Wang, apa kabar, saya Lingmei.",
                    tokens = listOf(
                        WordToken("铃美", "Líng měi", "Suzumi (a name)", "Kosakata HSK 2: 铃美 (Líng měi)"),
                        WordToken("喂", "wèi", "Hey", "Kosakata HSK 2: 喂 (wèi)"),
                        WordToken("王", "Wáng", "Surname wang", "Kosakata HSK 2: 王 (Wáng)"),
                        WordToken("老师", "lǎo shī", "Guru", "Tenaga pengajar"),
                        WordToken("您好", "nín hǎo", "Hello (polite)", "Kosakata HSK 2: 您好 (nín hǎo)"),
                        WordToken("我", "wǒ", "Saya", "Kata ganti orang pertama tunggal"),
                        WordToken("是", "shì", "Adalah", "Kopula penjelas"),
                        WordToken("铃美", "Líng měi", "Suzumi (a name)", "Kosakata HSK 2: 铃美 (Líng měi)")
                    )
                ),
                Sentence(
                    id = "s_phcall_3",
                    hanzi = "我明天早上不能去上课了，想跟您请假……",
                    pinyin = "wǒ míng tiān zǎo shang bù néng qù shàng kè le xiǎng gēn nín qǐng jià",
                    translation = "Besok pagi saya tidak bisa hadir ke kelas, ingin meminta izin sakit kepada Anda……",
                    tokens = listOf(
                        WordToken("我", "wǒ", "Saya", "Kata ganti orang pertama tunggal"),
                        WordToken("明天", "míng tiān", "Besok", "Keterangan waktu mendatang"),
                        WordToken("早上", "zǎo shang", "Pagi hari", "Waktu fajar hingga pagi"),
                        WordToken("不", "bù", "Tidak", "Kata sangkalan untuk masa kini atau masa depan"),
                        WordToken("能", "néng", "Bisa / Mampu / Boleh", "Kata bantu kemampuan atau izin"),
                        WordToken("去", "qù", "Pergi", "Berpindah tempat menjauhi pembicara"),
                        WordToken("上课", "shàng kè", "To go to class", "Kosakata HSK 2: 上课 (shàng kè)"),
                        WordToken("了", "le", "Sudah (partikel perubahan situasi)", "Partikel aspek selesainya tindakan"),
                        WordToken("想", "xiǎng", "Ingin / Berpikir / Rindu", "Keinginan atau pemikiran batin"),
                        WordToken("跟", "gēn", "With", "Kosakata HSK 2: 跟 (gēn)"),
                        WordToken("您", "nín", "Anda", "Bentuk hormat / sopan untuk kamu"),
                        WordToken("请假", "qǐng jià", "To request leave of absence", "Kosakata HSK 2: 请假 (qǐng jià)")
                    )
                ),
                Sentence(
                    id = "s_phcall_4",
                    hanzi = "A：不好意思，你打错了。",
                    pinyin = "bù hǎo yì si nǐ dǎ cuò le",
                    translation = "A: Maaf sekali, Anda salah sambung.",
                    tokens = listOf(
                        WordToken("不好意思", "bù hǎo yì si", "To feel embarrassed", "Kosakata HSK 2: 不好意思 (bù hǎo yì si)"),
                        WordToken("你", "nǐ", "Kamu", "Kata ganti orang kedua tunggal"),
                        WordToken("打", "dǎ", "Memukul / Mengetik / Melakukan", "Kata kerja umum beragam makna"),
                        WordToken("错", "cuò", "Wrong", "Kosakata HSK 2: 错 (cuò)"),
                        WordToken("了", "le", "Sudah (partikel perubahan situasi)", "Partikel aspek selesainya tindakan")
                    )
                ),
                Sentence(
                    id = "s_phcall_5",
                    hanzi = "我不是王老师。",
                    pinyin = "wǒ bù shì Wáng lǎo shī",
                    translation = "Saya bukan Dosen Wang.",
                    tokens = listOf(
                        WordToken("我", "wǒ", "Saya", "Kata ganti orang pertama tunggal"),
                        WordToken("不", "bù", "Tidak", "Kata sangkalan untuk masa kini atau masa depan"),
                        WordToken("是", "shì", "Adalah", "Kopula penjelas"),
                        WordToken("王", "Wáng", "Surname wang", "Kosakata HSK 2: 王 (Wáng)"),
                        WordToken("老师", "lǎo shī", "Guru", "Tenaga pengajar")
                    )
                ),
                Sentence(
                    id = "s_phcall_6",
                    hanzi = "铃美：对不起，我打错了。",
                    pinyin = "Líng měi duì bu qǐ wǒ dǎ cuò le",
                    translation = "Lingmei: Maafkan saya, saya salah memencet nomor.",
                    tokens = listOf(
                        WordToken("铃美", "Líng měi", "Suzumi (a name)", "Kosakata HSK 2: 铃美 (Líng měi)"),
                        WordToken("对不起", "duì bu qǐ", "I&#x27;m sorry; excuse me; i beg your pardon", "Kosakata HSK 2: 对不起 (duì bu qǐ)"),
                        WordToken("我", "wǒ", "Saya", "Kata ganti orang pertama tunggal"),
                        WordToken("打", "dǎ", "Memukul / Mengetik / Melakukan", "Kata kerja umum beragam makna"),
                        WordToken("错", "cuò", "Mistake", "Kosakata HSK 2: 错 (cuò)"),
                        WordToken("了", "le", "Sudah (partikel perubahan situasi)", "Partikel aspek selesainya tindakan")
                    )
                ),
                Sentence(
                    id = "s_phcall_7",
                    hanzi = "A：没关系。",
                    pinyin = "méi guān xi",
                    translation = "A: Tidak apa-apa.",
                    tokens = listOf(
                        WordToken("没关系", "méi guān xi", "It doesn&#x27;t matter", "Kosakata HSK 2: 没关系 (méi guān xi)")
                    )
                ),
                Sentence(
                    id = "s_phcall_8",
                    hanzi = "再见。",
                    pinyin = "zài jiàn",
                    translation = "Sampai jumpa.",
                    tokens = listOf(
                        WordToken("再见", "zài jiàn", "Goodbye", "Kosakata HSK 2: 再见 (zài jiàn)")
                    )
                ),
                Sentence(
                    id = "s_phcall_9",
                    hanzi = "铃美：再见。",
                    pinyin = "Líng měi zài jiàn",
                    translation = "Lingmei: Sampai jumpa.",
                    tokens = listOf(
                        WordToken("铃美", "Líng měi", "Suzumi (a name)", "Kosakata HSK 2: 铃美 (Líng měi)"),
                        WordToken("再见", "zài jiàn", "Goodbye", "Kosakata HSK 2: 再见 (zài jiàn)")
                    )
                ),
                Sentence(
                    id = "s_phcall_10",
                    hanzi = "（2） 铃美：喂，请问是王老师吗？",
                    pinyin = "Líng měi wèi qǐng wèn shì Wáng lǎo shī ma",
                    translation = "（2） Lingmei: Halo, permisi apakah ini Dosen Wang?",
                    tokens = listOf(
                        WordToken("铃美", "Líng měi", "Suzumi (a name)", "Kosakata HSK 2: 铃美 (Líng měi)"),
                        WordToken("喂", "wèi", "Hey", "Kosakata HSK 2: 喂 (wèi)"),
                        WordToken("请问", "qǐng wèn", "Excuse me, may i ask...?", "Kosakata HSK 2: 请问 (qǐng wèn)"),
                        WordToken("是", "shì", "Adalah", "Kopula penjelas"),
                        WordToken("王", "Wáng", "Surname wang", "Kosakata HSK 2: 王 (Wáng)"),
                        WordToken("老师", "lǎo shī", "Guru", "Tenaga pengajar"),
                        WordToken("吗", "ma", "Apakah (partikel tanya)", "Partikel di akhir kalimat interogatif ya/tidak")
                    )
                ),
                Sentence(
                    id = "s_phcall_11",
                    hanzi = "吴小宇：王老师不在，他刚才出去了。",
                    pinyin = "Wú Xiǎo yǔ Wáng lǎo shī bù zài tā gāng cái chū qù le",
                    translation = "Wu Xiaoyu: Dosen Wang sedang tidak ada, beliau baru saja keluar.",
                    tokens = listOf(
                        WordToken("吴小宇", "Wú Xiǎo yǔ", "A chinese personal name", "Kosakata HSK 2: 吴小宇 (Wú Xiǎo yǔ)"),
                        WordToken("王", "Wáng", "Surname wang", "Kosakata HSK 2: 王 (Wáng)"),
                        WordToken("老师", "lǎo shī", "Guru", "Tenaga pengajar"),
                        WordToken("不", "bù", "Tidak", "Kata sangkalan untuk masa kini atau masa depan"),
                        WordToken("在", "zài", "Di / Berada di", "Preposisi lokasi atau aspek progresif"),
                        WordToken("他", "tā", "Dia (laki-laki)", "Kata ganti orang ketiga tunggal"),
                        WordToken("刚才", "gāng cái", "Just now", "Kosakata HSK 2: 刚才 (gāng cái)"),
                        WordToken("出", "chū", "To go out; to come out", "Kosakata HSK 2: 出 (chū)"),
                        WordToken("去", "qù", "Pergi", "Berpindah tempat menjauhi pembicara"),
                        WordToken("了", "le", "Sudah (partikel perubahan situasi)", "Partikel aspek selesainya tindakan")
                    )
                ),
                Sentence(
                    id = "s_phcall_12",
                    hanzi = "铃美：这是王老师办公室的电话吧？",
                    pinyin = "Líng měi zhè shì Wáng lǎo shī bàn gōng shì de diàn huà ba",
                    translation = "Lingmei: Ini telepon kantor Dosen Wang, kan?",
                    tokens = listOf(
                        WordToken("铃美", "Líng měi", "Suzumi (a name)", "Kosakata HSK 2: 铃美 (Líng měi)"),
                        WordToken("这", "zhè", "This; these", "Kosakata HSK 2: 这 (zhè)"),
                        WordToken("是", "shì", "Adalah", "Kopula penjelas"),
                        WordToken("王", "Wáng", "Surname wang", "Kosakata HSK 2: 王 (Wáng)"),
                        WordToken("老师", "lǎo shī", "Guru", "Tenaga pengajar"),
                        WordToken("办公室", "bàn gōng shì", "Kantor", "Ruang kerja profesional"),
                        WordToken("的", "de", "Punya / Yang (partikel posesif)", "Partikel penjelas modifikasi atau kepemilikan"),
                        WordToken("电话", "diàn huà", "Telephone", "Kosakata HSK 2: 电话 (diàn huà)"),
                        WordToken("吧", "ba", "Kan / Mari (partikel saran)", "Partikel saran, ajakan, atau dugaan")
                    )
                ),
                Sentence(
                    id = "s_phcall_13",
                    hanzi = "请问你是哪位？",
                    pinyin = "qǐng wèn nǐ shì nǎ wèi",
                    translation = "Permisi dengan siapa saya berbicara?",
                    tokens = listOf(
                        WordToken("请问", "qǐng wèn", "Excuse me, may i ask...?", "Kosakata HSK 2: 请问 (qǐng wèn)"),
                        WordToken("你", "nǐ", "Kamu", "Kata ganti orang kedua tunggal"),
                        WordToken("是", "shì", "Adalah", "Kopula penjelas"),
                        WordToken("哪", "nǎ", "Which", "Kosakata HSK 2: 哪 (nǎ)"),
                        WordToken("位", "wèi", "Classifier for people (honorific)", "Kosakata HSK 2: 位 (wèi)")
                    )
                ),
                Sentence(
                    id = "s_phcall_14",
                    hanzi = "吴小宇：我是王老师的学生。",
                    pinyin = "Wú Xiǎo yǔ wǒ shì Wáng lǎo shī de xué shēng",
                    translation = "Wu Xiaoyu: Saya mahasiswa bimbingan Dosen Wang.",
                    tokens = listOf(
                        WordToken("吴小宇", "Wú Xiǎo yǔ", "A chinese personal name", "Kosakata HSK 2: 吴小宇 (Wú Xiǎo yǔ)"),
                        WordToken("我", "wǒ", "Saya", "Kata ganti orang pertama tunggal"),
                        WordToken("是", "shì", "Adalah", "Kopula penjelas"),
                        WordToken("王", "Wáng", "Surname wang", "Kosakata HSK 2: 王 (Wáng)"),
                        WordToken("老师", "lǎo shī", "Guru", "Tenaga pengajar"),
                        WordToken("的", "de", "Punya / Yang (partikel posesif)", "Partikel penjelas modifikasi atau kepemilikan"),
                        WordToken("学生", "xué shēng", "Siswa / Mahasiswa", "Pelajar")
                    )
                ),
                Sentence(
                    id = "s_phcall_15",
                    hanzi = "铃美：你好，我叫铃美，我也是王老师的学生。",
                    pinyin = "Líng měi nǐ hǎo wǒ jiào Líng měi wǒ yě shì Wáng lǎo shī de xué shēng",
                    translation = "Lingmei: Halo, nama saya Lingmei, saya juga mahasiswi Dosen Wang.",
                    tokens = listOf(
                        WordToken("铃美", "Líng měi", "Suzumi (a name)", "Kosakata HSK 2: 铃美 (Líng měi)"),
                        WordToken("你好", "nǐ hǎo", "Hello; hi", "Kosakata HSK 2: 你好 (nǐ hǎo)"),
                        WordToken("我", "wǒ", "Saya", "Kata ganti orang pertama tunggal"),
                        WordToken("叫", "jiào", "Memanggil / Bernama", "Menyebutkan nama"),
                        WordToken("铃美", "Líng měi", "Suzumi (a name)", "Kosakata HSK 2: 铃美 (Líng měi)"),
                        WordToken("我", "wǒ", "Saya", "Kata ganti orang pertama tunggal"),
                        WordToken("也", "yě", "Juga / Pun", "Partikel penanda kesamaan"),
                        WordToken("是", "shì", "Adalah", "Kopula penjelas"),
                        WordToken("王", "Wáng", "Surname wang", "Kosakata HSK 2: 王 (Wáng)"),
                        WordToken("老师", "lǎo shī", "Guru", "Tenaga pengajar"),
                        WordToken("的", "de", "Punya / Yang (partikel posesif)", "Partikel penjelas modifikasi atau kepemilikan"),
                        WordToken("学生", "xué shēng", "Siswa / Mahasiswa", "Pelajar")
                    )
                ),
                Sentence(
                    id = "s_phcall_16",
                    hanzi = "王老师什么时候回来你知道吗？",
                    pinyin = "Wáng lǎo shī shén me shí hou huí lái nǐ zhī dào ma",
                    translation = "Apakah kamu tahu kapan Dosen Wang akan kembali?",
                    tokens = listOf(
                        WordToken("王", "Wáng", "Surname wang", "Kosakata HSK 2: 王 (Wáng)"),
                        WordToken("老师", "lǎo shī", "Guru", "Tenaga pengajar"),
                        WordToken("什么", "shén me", "What?", "Kosakata HSK 2: 什么 (shén me)"),
                        WordToken("时候", "shí hou", "Time", "Kosakata HSK 2: 时候 (shí hou)"),
                        WordToken("回", "huí", "Kembali / Pulang", "Menuju ke tempat asal"),
                        WordToken("来", "lái", "Datang", "Menuju ke arah pembicara"),
                        WordToken("你", "nǐ", "Kamu", "Kata ganti orang kedua tunggal"),
                        WordToken("知道", "zhī dào", "Tahu / Mengetahui", "Memiliki informasi"),
                        WordToken("吗", "ma", "Apakah (partikel tanya)", "Partikel di akhir kalimat interogatif ya/tidak")
                    )
                ),
                Sentence(
                    id = "s_phcall_17",
                    hanzi = "吴小宇：这个我就不知道了，应该很快就会回来。",
                    pinyin = "Wú Xiǎo yǔ zhè gè wǒ jiù bù zhī dào le yīng gāi hěn kuài jiù huì huí lái",
                    translation = "Wu Xiaoyu: Kalau itu saya kurang tahu, semestinya beliau akan segera kembali.",
                    tokens = listOf(
                        WordToken("吴小宇", "Wú Xiǎo yǔ", "A chinese personal name", "Kosakata HSK 2: 吴小宇 (Wú Xiǎo yǔ)"),
                        WordToken("这", "zhè", "This; these", "Kosakata HSK 2: 这 (zhè)"),
                        WordToken("个", "gè", "Classifier for people or objects in general", "Kosakata HSK 2: 个 (gè)"),
                        WordToken("我", "wǒ", "Saya", "Kata ganti orang pertama tunggal"),
                        WordToken("就", "jiù", "Langsung / Segera / Maka", "Menyatakan ketepatan waktu atau kelogisan"),
                        WordToken("不", "bù", "Tidak", "Kata sangkalan untuk masa kini atau masa depan"),
                        WordToken("知道", "zhī dào", "Tahu / Mengetahui", "Memiliki informasi"),
                        WordToken("了", "le", "Sudah (partikel perubahan situasi)", "Partikel aspek selesainya tindakan"),
                        WordToken("应该", "yīng gāi", "Ought to; should; must", "Kosakata HSK 2: 应该 (yīng gāi)"),
                        WordToken("很", "hěn", "Sangat", "Tingkat derajat"),
                        WordToken("快", "kuài", "Cepat", "Kecepatan tinggi"),
                        WordToken("就", "jiù", "Langsung / Segera / Maka", "Menyatakan ketepatan waktu atau kelogisan"),
                        WordToken("会", "huì", "To be likely to; to be sure to", "Kosakata HSK 2: 会 (huì)"),
                        WordToken("回", "huí", "Kembali / Pulang", "Menuju ke tempat asal"),
                        WordToken("来", "lái", "Datang", "Menuju ke arah pembicara")
                    )
                ),
                Sentence(
                    id = "s_phcall_18",
                    hanzi = "你找王老师有什么事吗？",
                    pinyin = "nǐ zhǎo Wáng lǎo shī yǒu shén me shì ma",
                    translation = "Apakah kamu ada keperluan mencari Dosen Wang?",
                    tokens = listOf(
                        WordToken("你", "nǐ", "Kamu", "Kata ganti orang kedua tunggal"),
                        WordToken("找", "zhǎo", "To try to find", "Kosakata HSK 2: 找 (zhǎo)"),
                        WordToken("王", "Wáng", "Surname wang", "Kosakata HSK 2: 王 (Wáng)"),
                        WordToken("老师", "lǎo shī", "Guru", "Tenaga pengajar"),
                        WordToken("有", "yǒu", "Mempunyai / Ada", "Menyatakan kepemilikan atau eksistensi"),
                        WordToken("什么", "shén me", "Something; anything", "Kosakata HSK 2: 什么 (shén me)"),
                        WordToken("事", "shì", "Matter", "Kosakata HSK 2: 事 (shì)"),
                        WordToken("吗", "ma", "Apakah (partikel tanya)", "Partikel di akhir kalimat interogatif ya/tidak")
                    )
                ),
                Sentence(
                    id = "s_phcall_19",
                    hanzi = "铃美：我这几天不太舒服，挂了号，准备明天早上去看医生，所以明天早上不能去上课了，想跟王老师请假。",
                    pinyin = "Líng měi wǒ zhè jǐ tiān bù tài shū fu guà le hào zhǔn bèi míng tiān zǎo shang qù kàn yī shēng suǒ yǐ míng tiān zǎo shang bù néng qù shàng kè le xiǎng gēn Wáng lǎo shī qǐng jià",
                    translation = "Lingmei: Beberapa hari ini badan saya kurang sehat, sudah mengambil nomor antrean periksa ke dokter besok pagi, jadi besok pagi tidak bisa masuk kelas, ingin meminta izin kepada Dosen Wang.",
                    tokens = listOf(
                        WordToken("铃美", "Líng měi", "Suzumi (a name)", "Kosakata HSK 2: 铃美 (Líng měi)"),
                        WordToken("我", "wǒ", "Saya", "Kata ganti orang pertama tunggal"),
                        WordToken("这", "zhè", "This; these", "Kosakata HSK 2: 这 (zhè)"),
                        WordToken("几", "jǐ", "Several", "Kosakata HSK 2: 几 (jǐ)"),
                        WordToken("天", "tiān", "Hari", "Satuan hari"),
                        WordToken("不", "bù", "Tidak", "Kata sangkalan untuk masa kini atau masa depan"),
                        WordToken("太", "tài", "Terlalu", "Derajat melampaui batas"),
                        WordToken("舒服", "shū fu", "Nyaman / Enak badan", "Kondisi badan atau tempat menyenangkan"),
                        WordToken("挂", "guà", "To hang; to suspend (from a hook etc)", "Kosakata HSK 2: 挂 (guà)"),
                        WordToken("了", "le", "Sudah (partikel perubahan situasi)", "Partikel aspek selesainya tindakan"),
                        WordToken("号", "hào", "(bound form) bugle; trumpet", "Kosakata HSK 2: 号 (hào)"),
                        WordToken("准备", "zhǔn bèi", "To prepare", "Kosakata HSK 2: 准备 (zhǔn bèi)"),
                        WordToken("明天", "míng tiān", "Besok", "Keterangan waktu mendatang"),
                        WordToken("早上", "zǎo shang", "Pagi hari", "Waktu fajar hingga pagi"),
                        WordToken("去", "qù", "Pergi", "Berpindah tempat menjauhi pembicara"),
                        WordToken("看", "kàn", "Melihat / Membaca", "Aktivitas visual"),
                        WordToken("医生", "yī shēng", "Dokter", "Tenaga medis"),
                        WordToken("所以", "suǒ yǐ", "Sehingga / Oleh karena itu", "Menyatakan akibat konsekuensi"),
                        WordToken("明天", "míng tiān", "Besok", "Keterangan waktu mendatang"),
                        WordToken("早上", "zǎo shang", "Pagi hari", "Waktu fajar hingga pagi"),
                        WordToken("不", "bù", "Tidak", "Kata sangkalan untuk masa kini atau masa depan"),
                        WordToken("能", "néng", "Bisa / Mampu / Boleh", "Kata bantu kemampuan atau izin"),
                        WordToken("去", "qù", "Pergi", "Berpindah tempat menjauhi pembicara"),
                        WordToken("上课", "shàng kè", "To go to class", "Kosakata HSK 2: 上课 (shàng kè)"),
                        WordToken("了", "le", "Sudah (partikel perubahan situasi)", "Partikel aspek selesainya tindakan"),
                        WordToken("想", "xiǎng", "Ingin / Berpikir / Rindu", "Keinginan atau pemikiran batin"),
                        WordToken("跟", "gēn", "With", "Kosakata HSK 2: 跟 (gēn)"),
                        WordToken("王", "Wáng", "Surname wang", "Kosakata HSK 2: 王 (Wáng)"),
                        WordToken("老师", "lǎo shī", "Guru", "Tenaga pengajar"),
                        WordToken("请假", "qǐng jià", "To request leave of absence", "Kosakata HSK 2: 请假 (qǐng jià)")
                    )
                ),
                Sentence(
                    id = "s_phcall_20",
                    hanzi = "吴小宇：那你过一会儿再打来吧。",
                    pinyin = "Wú Xiǎo yǔ nà nǐ guò yī huì r zài dǎ lái ba",
                    translation = "Wu Xiaoyu: Kalau begitu nanti telepon lagi sebentar lagi.",
                    tokens = listOf(
                        WordToken("吴小宇", "Wú Xiǎo yǔ", "A chinese personal name", "Kosakata HSK 2: 吴小宇 (Wú Xiǎo yǔ)"),
                        WordToken("那", "nà", "Then (in that case)", "Kosakata HSK 2: 那 (nà)"),
                        WordToken("你", "nǐ", "Kamu", "Kata ganti orang kedua tunggal"),
                        WordToken("过", "guò", "To cross", "Kosakata HSK 2: 过 (guò)"),
                        WordToken("一会儿", "yī huì r", "A moment", "Kosakata HSK 2: 一会儿 (yī huì r)"),
                        WordToken("再", "zài", "Lagi / Sekali lagi", "Pengulangan tindakan mendatang"),
                        WordToken("打", "dǎ", "Memukul / Mengetik / Melakukan", "Kata kerja umum beragam makna"),
                        WordToken("来", "lái", "Datang", "Menuju ke arah pembicara"),
                        WordToken("吧", "ba", "Kan / Mari (partikel saran)", "Partikel saran, ajakan, atau dugaan")
                    )
                ),
                Sentence(
                    id = "s_phcall_21",
                    hanzi = "我估计王老师十分钟后就回来了。",
                    pinyin = "wǒ gū jì Wáng lǎo shī shí fēn zhōng hòu jiù huí lái le",
                    translation = "Saya perkirakan sepuluh menit lagi Dosen Wang sudah kembali.",
                    tokens = listOf(
                        WordToken("我", "wǒ", "Saya", "Kata ganti orang pertama tunggal"),
                        WordToken("估计", "gū jì", "To estimate; to assess; to calculate", "Kosakata HSK 2: 估计 (gū jì)"),
                        WordToken("王", "Wáng", "Surname wang", "Kosakata HSK 2: 王 (Wáng)"),
                        WordToken("老师", "lǎo shī", "Guru", "Tenaga pengajar"),
                        WordToken("十", "shí", "Ten", "Kosakata HSK 2: 十 (shí)"),
                        WordToken("分钟", "fēn zhōng", "Menit (durasi)", "Lamanya waktu dalam menit"),
                        WordToken("后", "hòu", "Afterwards", "Kosakata HSK 2: 后 (hòu)"),
                        WordToken("就", "jiù", "Langsung / Segera / Maka", "Menyatakan ketepatan waktu atau kelogisan"),
                        WordToken("回", "huí", "Kembali / Pulang", "Menuju ke tempat asal"),
                        WordToken("来", "lái", "Datang", "Menuju ke arah pembicara"),
                        WordToken("了", "le", "Sudah (partikel perubahan situasi)", "Partikel aspek selesainya tindakan")
                    )
                ),
                Sentence(
                    id = "s_phcall_22",
                    hanzi = "铃美：好，我一会儿再打过来。",
                    pinyin = "Líng měi hǎo wǒ yī huì r zài dǎ guò lái",
                    translation = "Lingmei: Baik, sebentar lagi saya telepon kembali.",
                    tokens = listOf(
                        WordToken("铃美", "Líng měi", "Suzumi (a name)", "Kosakata HSK 2: 铃美 (Líng měi)"),
                        WordToken("好", "hǎo", "Bagus / Baik", "Kualitas positif"),
                        WordToken("我", "wǒ", "Saya", "Kata ganti orang pertama tunggal"),
                        WordToken("一会儿", "yī huì r", "In a moment", "Kosakata HSK 2: 一会儿 (yī huì r)"),
                        WordToken("再", "zài", "Lagi / Sekali lagi", "Pengulangan tindakan mendatang"),
                        WordToken("打", "dǎ", "Memukul / Mengetik / Melakukan", "Kata kerja umum beragam makna"),
                        WordToken("过来", "guò lái", "To come over", "Kosakata HSK 2: 过来 (guò lái)")
                    )
                ),
                Sentence(
                    id = "s_phcall_23",
                    hanzi = "谢谢你。",
                    pinyin = "xiè xie nǐ",
                    translation = "Terima kasih banyak.",
                    tokens = listOf(
                        WordToken("谢谢", "xiè xie", "Thanks", "Kosakata HSK 2: 谢谢 (xiè xie)"),
                        WordToken("你", "nǐ", "Kamu", "Kata ganti orang kedua tunggal")
                    )
                ),
                Sentence(
                    id = "s_phcall_24",
                    hanzi = "再见。",
                    pinyin = "zài jiàn",
                    translation = "Sampai jumpa.",
                    tokens = listOf(
                        WordToken("再见", "zài jiàn", "Goodbye", "Kosakata HSK 2: 再见 (zài jiàn)")
                    )
                ),
                Sentence(
                    id = "s_phcall_25",
                    hanzi = "吴小宇：再见。",
                    pinyin = "Wú Xiǎo yǔ zài jiàn",
                    translation = "Wu Xiaoyu: Sampai jumpa.",
                    tokens = listOf(
                        WordToken("吴小宇", "Wú Xiǎo yǔ", "A chinese personal name", "Kosakata HSK 2: 吴小宇 (Wú Xiǎo yǔ)"),
                        WordToken("再见", "zài jiàn", "Goodbye", "Kosakata HSK 2: 再见 (zài jiàn)")
                    )
                ),
                Sentence(
                    id = "s_phcall_26",
                    hanzi = "（3） 铃美：喂，是王老师吗？",
                    pinyin = "Líng měi wéi shì Wáng lǎo shī ma",
                    translation = "（3） Lingmei: Halo, apakah ini Dosen Wang?",
                    tokens = listOf(
                        WordToken("铃美", "Líng měi", "Suzumi (a name)", "Kosakata HSK 2: 铃美 (Líng měi)"),
                        WordToken("喂", "wéi", "Hello (when answering the phone)", "Kosakata HSK 2: 喂 (wéi)"),
                        WordToken("是", "shì", "Adalah", "Kopula penjelas"),
                        WordToken("王", "Wáng", "Surname wang", "Kosakata HSK 2: 王 (Wáng)"),
                        WordToken("老师", "lǎo shī", "Guru", "Tenaga pengajar"),
                        WordToken("吗", "ma", "Apakah (partikel tanya)", "Partikel di akhir kalimat interogatif ya/tidak")
                    )
                ),
                Sentence(
                    id = "s_phcall_27",
                    hanzi = "吴小宇：王老师现在不在办公室，他出去了。",
                    pinyin = "Wú Xiǎo yǔ Wáng lǎo shī xiàn zài bù zài bàn gōng shì tā chū qù le",
                    translation = "Wu Xiaoyu: Dosen Wang sekarang sedang tidak ada di kantor, beliau keluar.",
                    tokens = listOf(
                        WordToken("吴小宇", "Wú Xiǎo yǔ", "A chinese personal name", "Kosakata HSK 2: 吴小宇 (Wú Xiǎo yǔ)"),
                        WordToken("王", "Wáng", "Surname wang", "Kosakata HSK 2: 王 (Wáng)"),
                        WordToken("老师", "lǎo shī", "Guru", "Tenaga pengajar"),
                        WordToken("现在", "xiàn zài", "Sekarang", "Waktu saat ini"),
                        WordToken("不", "bù", "Tidak", "Kata sangkalan untuk masa kini atau masa depan"),
                        WordToken("在", "zài", "Di / Berada di", "Preposisi lokasi atau aspek progresif"),
                        WordToken("办公室", "bàn gōng shì", "Kantor", "Ruang kerja profesional"),
                        WordToken("他", "tā", "Dia (laki-laki)", "Kata ganti orang ketiga tunggal"),
                        WordToken("出", "chū", "To go out; to come out", "Kosakata HSK 2: 出 (chū)"),
                        WordToken("去", "qù", "Pergi", "Berpindah tempat menjauhi pembicara"),
                        WordToken("了", "le", "Sudah (partikel perubahan situasi)", "Partikel aspek selesainya tindakan")
                    )
                ),
                Sentence(
                    id = "s_phcall_28",
                    hanzi = "铃美：你是刚才接电话的学生？",
                    pinyin = "Líng měi nǐ shì gāng cái jiē diàn huà de xué shēng",
                    translation = "Lingmei: Kamu mahasiswa yang tadi mengangkat telepon?",
                    tokens = listOf(
                        WordToken("铃美", "Líng měi", "Suzumi (a name)", "Kosakata HSK 2: 铃美 (Líng měi)"),
                        WordToken("你", "nǐ", "Kamu", "Kata ganti orang kedua tunggal"),
                        WordToken("是", "shì", "Adalah", "Kopula penjelas"),
                        WordToken("刚才", "gāng cái", "Just now", "Kosakata HSK 2: 刚才 (gāng cái)"),
                        WordToken("接", "jiē", "To receive", "Kosakata HSK 2: 接 (jiē)"),
                        WordToken("电话", "diàn huà", "Telephone", "Kosakata HSK 2: 电话 (diàn huà)"),
                        WordToken("的", "de", "Punya / Yang (partikel posesif)", "Partikel penjelas modifikasi atau kepemilikan"),
                        WordToken("学生", "xué shēng", "Siswa / Mahasiswa", "Pelajar")
                    )
                ),
                Sentence(
                    id = "s_phcall_29",
                    hanzi = "吴小宇：对，是我。",
                    pinyin = "Wú Xiǎo yǔ duì shì wǒ",
                    translation = "Wu Xiaoyu: Iya, betul saya.",
                    tokens = listOf(
                        WordToken("吴小宇", "Wú Xiǎo yǔ", "A chinese personal name", "Kosakata HSK 2: 吴小宇 (Wú Xiǎo yǔ)"),
                        WordToken("对", "duì", "Right; correct", "Kosakata HSK 2: 对 (duì)"),
                        WordToken("是", "shì", "Adalah", "Kopula penjelas"),
                        WordToken("我", "wǒ", "Saya", "Kata ganti orang pertama tunggal")
                    )
                ),
                Sentence(
                    id = "s_phcall_30",
                    hanzi = "你是……铃美？",
                    pinyin = "nǐ shì Líng měi",
                    translation = "Kamu…… Lingmei?",
                    tokens = listOf(
                        WordToken("你", "nǐ", "Kamu", "Kata ganti orang kedua tunggal"),
                        WordToken("是", "shì", "Adalah", "Kopula penjelas"),
                        WordToken("铃美", "Líng měi", "Suzumi (a name)", "Kosakata HSK 2: 铃美 (Líng měi)")
                    )
                ),
                Sentence(
                    id = "s_phcall_31",
                    hanzi = "铃美：是的。",
                    pinyin = "Líng měi shì de",
                    translation = "Lingmei: Iya, benar.",
                    tokens = listOf(
                        WordToken("铃美", "Líng měi", "Suzumi (a name)", "Kosakata HSK 2: 铃美 (Líng měi)"),
                        WordToken("是的", "shì de", "Yes, that&#x27;s right", "Kosakata HSK 2: 是的 (shì de)")
                    )
                ),
                Sentence(
                    id = "s_phcall_32",
                    hanzi = "王老师还没回来吗？",
                    pinyin = "Wáng lǎo shī hái méi huí lái ma",
                    translation = "Dosen Wang masih belum kembali juga?",
                    tokens = listOf(
                        WordToken("王", "Wáng", "Surname wang", "Kosakata HSK 2: 王 (Wáng)"),
                        WordToken("老师", "lǎo shī", "Guru", "Tenaga pengajar"),
                        WordToken("还", "hái", "Masih / Malahan", "Menyatakan kelanjutan situasi"),
                        WordToken("没", "méi", "Belum / Tidak", "Kata sangkalan untuk keberadaan atau masa lampau"),
                        WordToken("回", "huí", "Kembali / Pulang", "Menuju ke tempat asal"),
                        WordToken("来", "lái", "Datang", "Menuju ke arah pembicara"),
                        WordToken("吗", "ma", "Apakah (partikel tanya)", "Partikel di akhir kalimat interogatif ya/tidak")
                    )
                ),
                Sentence(
                    id = "s_phcall_33",
                    hanzi = "吴小宇：还没有。",
                    pinyin = "Wú Xiǎo yǔ hái méi yǒu",
                    translation = "Wu Xiaoyu: Masih belum kembali.",
                    tokens = listOf(
                        WordToken("吴小宇", "Wú Xiǎo yǔ", "A chinese personal name", "Kosakata HSK 2: 吴小宇 (Wú Xiǎo yǔ)"),
                        WordToken("还", "hái", "Masih / Malahan", "Menyatakan kelanjutan situasi"),
                        WordToken("没有", "méi yǒu", "Tidak ada / Tidak punya", "Bentuk negasi dari 有")
                    )
                ),
                Sentence(
                    id = "s_phcall_34",
                    hanzi = "我也还在等王老师回来。",
                    pinyin = "wǒ yě hái zài děng Wáng lǎo shī huí lái",
                    translation = "Saya juga masih menunggu Dosen Wang kembali.",
                    tokens = listOf(
                        WordToken("我", "wǒ", "Saya", "Kata ganti orang pertama tunggal"),
                        WordToken("也", "yě", "Juga / Pun", "Partikel penanda kesamaan"),
                        WordToken("还", "hái", "Masih / Malahan", "Menyatakan kelanjutan situasi"),
                        WordToken("在", "zài", "Di / Berada di", "Preposisi lokasi atau aspek progresif"),
                        WordToken("等", "děng", "To wait for; to await", "Kosakata HSK 2: 等 (děng)"),
                        WordToken("王", "Wáng", "Surname wang", "Kosakata HSK 2: 王 (Wáng)"),
                        WordToken("老师", "lǎo shī", "Guru", "Tenaga pengajar"),
                        WordToken("回", "huí", "Kembali / Pulang", "Menuju ke tempat asal"),
                        WordToken("来", "lái", "Datang", "Menuju ke arah pembicara")
                    )
                ),
                Sentence(
                    id = "s_phcall_35",
                    hanzi = "铃美：这可怎么办啊？",
                    pinyin = "Líng měi zhè kě zěn me bàn a",
                    translation = "Lingmei: Lalu bagaimana ini?",
                    tokens = listOf(
                        WordToken("铃美", "Líng měi", "Suzumi (a name)", "Kosakata HSK 2: 铃美 (Líng měi)"),
                        WordToken("这", "zhè", "This; these", "Kosakata HSK 2: 这 (zhè)"),
                        WordToken("可", "kě", "(particle used for emphasis) certainly; very", "Kosakata HSK 2: 可 (kě)"),
                        WordToken("怎么办", "zěn me bàn", "What&#x27;s to be done", "Kosakata HSK 2: 怎么办 (zěn me bàn)"),
                        WordToken("啊", "a", "Modal particle ending sentence, showing affirmation, approval, or consent", "Kosakata HSK 2: 啊 (a)")
                    )
                ),
                Sentence(
                    id = "s_phcall_36",
                    hanzi = "你有王老师的手机号码吗？",
                    pinyin = "nǐ yǒu Wáng lǎo shī de shǒu jī hào mǎ ma",
                    translation = "Apakah kamu punya nomor ponsel Dosen Wang?",
                    tokens = listOf(
                        WordToken("你", "nǐ", "Kamu", "Kata ganti orang kedua tunggal"),
                        WordToken("有", "yǒu", "Mempunyai / Ada", "Menyatakan kepemilikan atau eksistensi"),
                        WordToken("王", "Wáng", "Surname wang", "Kosakata HSK 2: 王 (Wáng)"),
                        WordToken("老师", "lǎo shī", "Guru", "Tenaga pengajar"),
                        WordToken("的", "de", "Punya / Yang (partikel posesif)", "Partikel penjelas modifikasi atau kepemilikan"),
                        WordToken("手机", "shǒu jī", "Cell phone; mobile phone", "Kosakata HSK 2: 手机 (shǒu jī)"),
                        WordToken("号码", "hào mǎ", "Number", "Kosakata HSK 2: 号码 (hào mǎ)"),
                        WordToken("吗", "ma", "Apakah (partikel tanya)", "Partikel di akhir kalimat interogatif ya/tidak")
                    )
                ),
                Sentence(
                    id = "s_phcall_37",
                    hanzi = "吴小宇：我没有。",
                    pinyin = "Wú Xiǎo yǔ wǒ méi yǒu",
                    translation = "Wu Xiaoyu: Saya tidak punya.",
                    tokens = listOf(
                        WordToken("吴小宇", "Wú Xiǎo yǔ", "A chinese personal name", "Kosakata HSK 2: 吴小宇 (Wú Xiǎo yǔ)"),
                        WordToken("我", "wǒ", "Saya", "Kata ganti orang pertama tunggal"),
                        WordToken("没有", "méi yǒu", "Tidak ada / Tidak punya", "Bentuk negasi dari 有")
                    )
                ),
                Sentence(
                    id = "s_phcall_38",
                    hanzi = "铃美：那可以请你帮我给王老师留个言吗？",
                    pinyin = "Líng měi nà kě yǐ qǐng nǐ bāng wǒ gěi Wáng lǎo shī liú gè yán ma",
                    translation = "Lingmei: Kalau begitu bisakah tolong titipkan pesan untuk Dosen Wang?",
                    tokens = listOf(
                        WordToken("铃美", "Líng měi", "Suzumi (a name)", "Kosakata HSK 2: 铃美 (Líng měi)"),
                        WordToken("那", "nà", "Then (in that case)", "Kosakata HSK 2: 那 (nà)"),
                        WordToken("可以", "kě yǐ", "Boleh / Dapat", "Menyatakan izin atau kemungkinan"),
                        WordToken("请", "qǐng", "Silakan / Mengundang", "Bentuk kesopanan"),
                        WordToken("你", "nǐ", "Kamu", "Kata ganti orang kedua tunggal"),
                        WordToken("帮", "bāng", "To help", "Kosakata HSK 2: 帮 (bāng)"),
                        WordToken("我", "wǒ", "Saya", "Kata ganti orang pertama tunggal"),
                        WordToken("给", "gěi", "Memberi / Kepada", "Tindakan memberi atau preposisi sasaran"),
                        WordToken("王", "Wáng", "Surname wang", "Kosakata HSK 2: 王 (Wáng)"),
                        WordToken("老师", "lǎo shī", "Guru", "Tenaga pengajar"),
                        WordToken("留", "liú", "To leave (a message etc)", "Kosakata HSK 2: 留 (liú)"),
                        WordToken("个", "gè", "Classifier for people or objects in general", "Kosakata HSK 2: 个 (gè)"),
                        WordToken("言", "yán", "Words", "Kosakata HSK 2: 言 (yán)"),
                        WordToken("吗", "ma", "Apakah (partikel tanya)", "Partikel di akhir kalimat interogatif ya/tidak")
                    )
                ),
                Sentence(
                    id = "s_phcall_39",
                    hanzi = "吴小宇：好的，我现在就写下来……啊！",
                    pinyin = "Wú Xiǎo yǔ hǎo de wǒ xiàn zài jiù xiě xià lái ā",
                    translation = "Wu Xiaoyu: Baik, sekarang saya tuliskan…… ah!",
                    tokens = listOf(
                        WordToken("吴小宇", "Wú Xiǎo yǔ", "A chinese personal name", "Kosakata HSK 2: 吴小宇 (Wú Xiǎo yǔ)"),
                        WordToken("好", "hǎo", "Bagus / Baik", "Kualitas positif"),
                        WordToken("的", "de", "Punya / Yang (partikel posesif)", "Partikel penjelas modifikasi atau kepemilikan"),
                        WordToken("我", "wǒ", "Saya", "Kata ganti orang pertama tunggal"),
                        WordToken("现在", "xiàn zài", "Sekarang", "Waktu saat ini"),
                        WordToken("就", "jiù", "Langsung / Segera / Maka", "Menyatakan ketepatan waktu atau kelogisan"),
                        WordToken("写", "xiě", "To write", "Kosakata HSK 2: 写 (xiě)"),
                        WordToken("下来", "xià lái", "(after verb of motion, indicates motion down and towards us, also fig.)", "Kosakata HSK 2: 下来 (xià lái)"),
                        WordToken("啊", "ā", "Interjection of surprise", "Kosakata HSK 2: 啊 (ā)")
                    )
                ),
                Sentence(
                    id = "s_phcall_40",
                    hanzi = "我想起来有个同学打过王老师的手机，我找他问问王老师的手机号。",
                    pinyin = "wǒ xiǎng qǐ lái yǒu gè tóng xué dǎ guo Wáng lǎo shī de shǒu jī wǒ zhǎo tā wènwen Wáng lǎo shī de shǒu jī hào",
                    translation = "Saya teringat ada seorang teman yang pernah menelepon ponsel Dosen Wang, saya akan tanyakan nomor ponsel beliau kepadanya.",
                    tokens = listOf(
                        WordToken("我", "wǒ", "Saya", "Kata ganti orang pertama tunggal"),
                        WordToken("想", "xiǎng", "Ingin / Berpikir / Rindu", "Keinginan atau pemikiran batin"),
                        WordToken("起来", "qǐ lái", "Indicating the beginning and continuation of an action or a state", "Kosakata HSK 2: 起来 (qǐ lái)"),
                        WordToken("有", "yǒu", "Mempunyai / Ada", "Menyatakan kepemilikan atau eksistensi"),
                        WordToken("个", "gè", "Classifier for people or objects in general", "Kosakata HSK 2: 个 (gè)"),
                        WordToken("同学", "tóng xué", "Teman sekelas", "Rekan belajar"),
                        WordToken("打", "dǎ", "Memukul / Mengetik / Melakukan", "Kata kerja umum beragam makna"),
                        WordToken("过", "guo", "(experienced action marker)", "Kosakata HSK 2: 过 (guo)"),
                        WordToken("王", "Wáng", "Surname wang", "Kosakata HSK 2: 王 (Wáng)"),
                        WordToken("老师", "lǎo shī", "Guru", "Tenaga pengajar"),
                        WordToken("的", "de", "Punya / Yang (partikel posesif)", "Partikel penjelas modifikasi atau kepemilikan"),
                        WordToken("手机", "shǒu jī", "Cell phone; mobile phone", "Kosakata HSK 2: 手机 (shǒu jī)"),
                        WordToken("我", "wǒ", "Saya", "Kata ganti orang pertama tunggal"),
                        WordToken("找", "zhǎo", "To try to find", "Kosakata HSK 2: 找 (zhǎo)"),
                        WordToken("他", "tā", "Dia (laki-laki)", "Kata ganti orang ketiga tunggal"),
                        WordToken("问问", "wènwen", "To ask a little; to inquire", "Kosakata HSK 2: 问问 (wènwen)"),
                        WordToken("王", "Wáng", "Surname wang", "Kosakata HSK 2: 王 (Wáng)"),
                        WordToken("老师", "lǎo shī", "Guru", "Tenaga pengajar"),
                        WordToken("的", "de", "Punya / Yang (partikel posesif)", "Partikel penjelas modifikasi atau kepemilikan"),
                        WordToken("手机", "shǒu jī", "Cell phone; mobile phone", "Kosakata HSK 2: 手机 (shǒu jī)"),
                        WordToken("号", "hào", "(bound form) bugle; trumpet", "Kosakata HSK 2: 号 (hào)")
                    )
                ),
                Sentence(
                    id = "s_phcall_41",
                    hanzi = "铃美：那太好了！",
                    pinyin = "Líng měi nà tài hǎo le",
                    translation = "Lingmei: Wah, bagus sekali kalau begitu!",
                    tokens = listOf(
                        WordToken("铃美", "Líng měi", "Suzumi (a name)", "Kosakata HSK 2: 铃美 (Líng měi)"),
                        WordToken("那", "nà", "Then (in that case)", "Kosakata HSK 2: 那 (nà)"),
                        WordToken("太", "tài", "Terlalu", "Derajat melampaui batas"),
                        WordToken("好", "hǎo", "Bagus / Baik", "Kualitas positif"),
                        WordToken("了", "le", "Sudah (partikel perubahan situasi)", "Partikel aspek selesainya tindakan")
                    )
                ),
                Sentence(
                    id = "s_phcall_42",
                    hanzi = "吴小宇：你的电话是多少？",
                    pinyin = "Wú Xiǎo yǔ nǐ de diàn huà shì duō shao",
                    translation = "Wu Xiaoyu: Berapa nomor teleponmu?",
                    tokens = listOf(
                        WordToken("吴小宇", "Wú Xiǎo yǔ", "A chinese personal name", "Kosakata HSK 2: 吴小宇 (Wú Xiǎo yǔ)"),
                        WordToken("你", "nǐ", "Kamu", "Kata ganti orang kedua tunggal"),
                        WordToken("的", "de", "Punya / Yang (partikel posesif)", "Partikel penjelas modifikasi atau kepemilikan"),
                        WordToken("电话", "diàn huà", "Phone number", "Kosakata HSK 2: 电话 (diàn huà)"),
                        WordToken("是", "shì", "Adalah", "Kopula penjelas"),
                        WordToken("多少", "duō shao", "How much?; how many?", "Kosakata HSK 2: 多少 (duō shao)")
                    )
                ),
                Sentence(
                    id = "s_phcall_43",
                    hanzi = "如果问到了王老师的号码，我打给你。",
                    pinyin = "rú guǒ wèn dào le Wáng lǎo shī de hào mǎ wǒ dǎ gěi nǐ",
                    translation = "Jika sudah mendapatkan nomor Dosen Wang, saya akan meneleponmu.",
                    tokens = listOf(
                        WordToken("如果", "rú guǒ", "Jika / Seandainya", "Menyatakan pengandaian syarat"),
                        WordToken("问", "wèn", "To ask; to inquire", "Kosakata HSK 2: 问 (wèn)"),
                        WordToken("到", "dào", "To reach; to arrive", "Kosakata HSK 2: 到 (dào)"),
                        WordToken("了", "le", "Sudah (partikel perubahan situasi)", "Partikel aspek selesainya tindakan"),
                        WordToken("王", "Wáng", "Surname wang", "Kosakata HSK 2: 王 (Wáng)"),
                        WordToken("老师", "lǎo shī", "Guru", "Tenaga pengajar"),
                        WordToken("的", "de", "Punya / Yang (partikel posesif)", "Partikel penjelas modifikasi atau kepemilikan"),
                        WordToken("号码", "hào mǎ", "Number", "Kosakata HSK 2: 号码 (hào mǎ)"),
                        WordToken("我", "wǒ", "Saya", "Kata ganti orang pertama tunggal"),
                        WordToken("打", "dǎ", "Memukul / Mengetik / Melakukan", "Kata kerja umum beragam makna"),
                        WordToken("给", "gěi", "Memberi / Kepada", "Tindakan memberi atau preposisi sasaran"),
                        WordToken("你", "nǐ", "Kamu", "Kata ganti orang kedua tunggal")
                    )
                ),
                Sentence(
                    id = "s_phcall_44",
                    hanzi = "铃美：13176892322。",
                    pinyin = "Líng měi",
                    translation = "Lingmei: 13176892322.",
                    tokens = listOf(
                        WordToken("铃美", "Líng měi", "Suzumi (a name)", "Kosakata HSK 2: 铃美 (Líng měi)")
                    )
                ),
                Sentence(
                    id = "s_phcall_45",
                    hanzi = "你的号码是多少？",
                    pinyin = "nǐ de hào mǎ shì duō shao",
                    translation = "Berapa nomor teleponmu?",
                    tokens = listOf(
                        WordToken("你", "nǐ", "Kamu", "Kata ganti orang kedua tunggal"),
                        WordToken("的", "de", "Punya / Yang (partikel posesif)", "Partikel penjelas modifikasi atau kepemilikan"),
                        WordToken("号码", "hào mǎ", "Number", "Kosakata HSK 2: 号码 (hào mǎ)"),
                        WordToken("是", "shì", "Adalah", "Kopula penjelas"),
                        WordToken("多少", "duō shao", "How much?; how many?", "Kosakata HSK 2: 多少 (duō shao)")
                    )
                ),
                Sentence(
                    id = "s_phcall_46",
                    hanzi = "我也保存一下。",
                    pinyin = "wǒ yě bǎo cún yī xià",
                    translation = "Biar saya simpan juga.",
                    tokens = listOf(
                        WordToken("我", "wǒ", "Saya", "Kata ganti orang pertama tunggal"),
                        WordToken("也", "yě", "Juga / Pun", "Partikel penanda kesamaan"),
                        WordToken("保存", "bǎo cún", "To conserve; to preserve; to keep; to store; (computing) to save (a file etc)", "Kosakata HSK 2: 保存 (bǎo cún)"),
                        WordToken("一下", "yī xià", "(after a verb) a bit; a little (indicating brief duration, or softening the tone, or suggesting giving sth a try)", "Kosakata HSK 2: 一下 (yī xià)")
                    )
                ),
                Sentence(
                    id = "s_phcall_47",
                    hanzi = "吴小宇：18809741663。",
                    pinyin = "Wú Xiǎo yǔ",
                    translation = "Wu Xiaoyu: 18809741663.",
                    tokens = listOf(
                        WordToken("吴小宇", "Wú Xiǎo yǔ", "A chinese personal name", "Kosakata HSK 2: 吴小宇 (Wú Xiǎo yǔ)")
                    )
                ),
                Sentence(
                    id = "s_phcall_48",
                    hanzi = "铃美：对了，你叫什么名字？",
                    pinyin = "Líng měi duì le nǐ jiào shén me míng zi",
                    translation = "Lingmei: Ngomong-ngomong, siapa namamu?",
                    tokens = listOf(
                        WordToken("铃美", "Líng měi", "Suzumi (a name)", "Kosakata HSK 2: 铃美 (Líng měi)"),
                        WordToken("对了", "duì le", "Oh, that&#x27;s right, ... (when one suddenly remembers sth one wanted to mention)", "Kosakata HSK 2: 对了 (duì le)"),
                        WordToken("你", "nǐ", "Kamu", "Kata ganti orang kedua tunggal"),
                        WordToken("叫", "jiào", "Memanggil / Bernama", "Menyebutkan nama"),
                        WordToken("什么", "shén me", "What?", "Kosakata HSK 2: 什么 (shén me)"),
                        WordToken("名字", "míng zi", "Name (of a person or thing)", "Kosakata HSK 2: 名字 (míng zi)")
                    )
                ),
                Sentence(
                    id = "s_phcall_49",
                    hanzi = "吴小宇：我叫吴小宇。",
                    pinyin = "Wú Xiǎo yǔ wǒ jiào Wú Xiǎo yǔ",
                    translation = "Wu Xiaoyu: Nama saya Wu Xiaoyu.",
                    tokens = listOf(
                        WordToken("吴小宇", "Wú Xiǎo yǔ", "A chinese personal name", "Kosakata HSK 2: 吴小宇 (Wú Xiǎo yǔ)"),
                        WordToken("我", "wǒ", "Saya", "Kata ganti orang pertama tunggal"),
                        WordToken("叫", "jiào", "Memanggil / Bernama", "Menyebutkan nama"),
                        WordToken("吴小宇", "Wú Xiǎo yǔ", "A chinese personal name", "Kosakata HSK 2: 吴小宇 (Wú Xiǎo yǔ)")
                    )
                ),
                Sentence(
                    id = "s_phcall_50",
                    hanzi = "我现在就去找同学问问。",
                    pinyin = "wǒ xiàn zài jiù qù zhǎo tóng xué wènwen",
                    translation = "Sekarang saya pergi mencari teman untuk menanyakan nomor itu.",
                    tokens = listOf(
                        WordToken("我", "wǒ", "Saya", "Kata ganti orang pertama tunggal"),
                        WordToken("现在", "xiàn zài", "Sekarang", "Waktu saat ini"),
                        WordToken("就", "jiù", "Langsung / Segera / Maka", "Menyatakan ketepatan waktu atau kelogisan"),
                        WordToken("去", "qù", "Pergi", "Berpindah tempat menjauhi pembicara"),
                        WordToken("找", "zhǎo", "To try to find", "Kosakata HSK 2: 找 (zhǎo)"),
                        WordToken("同学", "tóng xué", "Teman sekelas", "Rekan belajar"),
                        WordToken("问问", "wènwen", "To ask a little; to inquire", "Kosakata HSK 2: 问问 (wènwen)")
                    )
                ),
                Sentence(
                    id = "s_phcall_51",
                    hanzi = "留言条我也放在王老师桌上了。",
                    pinyin = "liú yán tiáo wǒ yě fàng zài Wáng lǎo shī zhuō shàng le",
                    translation = "Kertas pesannya juga sudah saya taruh di atas meja Dosen Wang.",
                    tokens = listOf(
                        WordToken("留言条", "liú yán tiáo", "A written message note left for someone", "Kosakata HSK 2: 留言条 (liú yán tiáo)"),
                        WordToken("我", "wǒ", "Saya", "Kata ganti orang pertama tunggal"),
                        WordToken("也", "yě", "Juga / Pun", "Partikel penanda kesamaan"),
                        WordToken("放", "fàng", "To put", "Kosakata HSK 2: 放 (fàng)"),
                        WordToken("在", "zài", "Di / Berada di", "Preposisi lokasi atau aspek progresif"),
                        WordToken("王", "Wáng", "Surname wang", "Kosakata HSK 2: 王 (Wáng)"),
                        WordToken("老师", "lǎo shī", "Guru", "Tenaga pengajar"),
                        WordToken("桌", "zhuō", "Table", "Kosakata HSK 2: 桌 (zhuō)"),
                        WordToken("上", "shàng", "(noun suffix) on; above", "Kosakata HSK 2: 上 (shàng)"),
                        WordToken("了", "le", "Sudah (partikel perubahan situasi)", "Partikel aspek selesainya tindakan")
                    )
                ),
                Sentence(
                    id = "s_phcall_52",
                    hanzi = "铃美：好的，谢谢你。",
                    pinyin = "Líng měi hǎo de xiè xie nǐ",
                    translation = "Lingmei: Baik, terima kasih banyak ya.",
                    tokens = listOf(
                        WordToken("铃美", "Líng měi", "Suzumi (a name)", "Kosakata HSK 2: 铃美 (Líng měi)"),
                        WordToken("好", "hǎo", "Bagus / Baik", "Kualitas positif"),
                        WordToken("的", "de", "Punya / Yang (partikel posesif)", "Partikel penjelas modifikasi atau kepemilikan"),
                        WordToken("谢谢", "xiè xie", "Thanks", "Kosakata HSK 2: 谢谢 (xiè xie)"),
                        WordToken("你", "nǐ", "Kamu", "Kata ganti orang kedua tunggal")
                    )
                ),
                Sentence(
                    id = "s_phcall_53",
                    hanzi = "（4） 吴小宇：喂，你好，我是吴小宇。",
                    pinyin = "Wú Xiǎo yǔ wèi nǐ hǎo wǒ shì Wú Xiǎo yǔ",
                    translation = "（4） Wu Xiaoyu: Halo, apa kabar, saya Wu Xiaoyu.",
                    tokens = listOf(
                        WordToken("吴小宇", "Wú Xiǎo yǔ", "A chinese personal name", "Kosakata HSK 2: 吴小宇 (Wú Xiǎo yǔ)"),
                        WordToken("喂", "wèi", "Hey", "Kosakata HSK 2: 喂 (wèi)"),
                        WordToken("你好", "nǐ hǎo", "Hello; hi", "Kosakata HSK 2: 你好 (nǐ hǎo)"),
                        WordToken("我", "wǒ", "Saya", "Kata ganti orang pertama tunggal"),
                        WordToken("是", "shì", "Adalah", "Kopula penjelas"),
                        WordToken("吴小宇", "Wú Xiǎo yǔ", "A chinese personal name", "Kosakata HSK 2: 吴小宇 (Wú Xiǎo yǔ)")
                    )
                ),
                Sentence(
                    id = "s_phcall_54",
                    hanzi = "铃美：你好，怎么样？",
                    pinyin = "Líng měi nǐ hǎo zěn me yàng",
                    translation = "Lingmei: Halo, bagaimana?",
                    tokens = listOf(
                        WordToken("铃美", "Líng měi", "Suzumi (a name)", "Kosakata HSK 2: 铃美 (Líng měi)"),
                        WordToken("你好", "nǐ hǎo", "Hello; hi", "Kosakata HSK 2: 你好 (nǐ hǎo)"),
                        WordToken("怎么样", "zěn me yàng", "How?", "Kosakata HSK 2: 怎么样 (zěn me yàng)")
                    )
                ),
                Sentence(
                    id = "s_phcall_55",
                    hanzi = "问到王老师号码了吗？",
                    pinyin = "wèn dào Wáng lǎo shī hào mǎ le ma",
                    translation = "Sudah dapat nomor Dosen Wang?",
                    tokens = listOf(
                        WordToken("问", "wèn", "To ask; to inquire", "Kosakata HSK 2: 问 (wèn)"),
                        WordToken("到", "dào", "To reach; to arrive", "Kosakata HSK 2: 到 (dào)"),
                        WordToken("王", "Wáng", "Surname wang", "Kosakata HSK 2: 王 (Wáng)"),
                        WordToken("老师", "lǎo shī", "Guru", "Tenaga pengajar"),
                        WordToken("号码", "hào mǎ", "Number", "Kosakata HSK 2: 号码 (hào mǎ)"),
                        WordToken("了", "le", "Sudah (partikel perubahan situasi)", "Partikel aspek selesainya tindakan"),
                        WordToken("吗", "ma", "Apakah (partikel tanya)", "Partikel di akhir kalimat interogatif ya/tidak")
                    )
                ),
                Sentence(
                    id = "s_phcall_56",
                    hanzi = "吴小宇：问到了，你记一下。",
                    pinyin = "Wú Xiǎo yǔ wèn dào le nǐ jì yī xià",
                    translation = "Wu Xiaoyu: Sudah dapat, silakan kamu catat.",
                    tokens = listOf(
                        WordToken("吴小宇", "Wú Xiǎo yǔ", "A chinese personal name", "Kosakata HSK 2: 吴小宇 (Wú Xiǎo yǔ)"),
                        WordToken("问", "wèn", "To ask; to inquire", "Kosakata HSK 2: 问 (wèn)"),
                        WordToken("到", "dào", "To reach; to arrive", "Kosakata HSK 2: 到 (dào)"),
                        WordToken("了", "le", "Sudah (partikel perubahan situasi)", "Partikel aspek selesainya tindakan"),
                        WordToken("你", "nǐ", "Kamu", "Kata ganti orang kedua tunggal"),
                        WordToken("记", "jì", "To record", "Kosakata HSK 2: 记 (jì)"),
                        WordToken("一下", "yī xià", "(after a verb) a bit; a little (indicating brief duration, or softening the tone, or suggesting giving sth a try)", "Kosakata HSK 2: 一下 (yī xià)")
                    )
                ),
                Sentence(
                    id = "s_phcall_57",
                    hanzi = "铃美：好，你说。",
                    pinyin = "Líng měi hǎo nǐ shuō",
                    translation = "Lingmei: Baik, silakan sebutkan.",
                    tokens = listOf(
                        WordToken("铃美", "Líng měi", "Suzumi (a name)", "Kosakata HSK 2: 铃美 (Líng měi)"),
                        WordToken("好", "hǎo", "Bagus / Baik", "Kualitas positif"),
                        WordToken("你", "nǐ", "Kamu", "Kata ganti orang kedua tunggal"),
                        WordToken("说", "shuō", "Berbicara / Berkata", "Menyampaikan ucapan")
                    )
                ),
                Sentence(
                    id = "s_phcall_58",
                    hanzi = "吴小宇：13315412981。",
                    pinyin = "Wú Xiǎo yǔ",
                    translation = "Wu Xiaoyu: 13315412981.",
                    tokens = listOf(
                        WordToken("吴小宇", "Wú Xiǎo yǔ", "A chinese personal name", "Kosakata HSK 2: 吴小宇 (Wú Xiǎo yǔ)")
                    )
                ),
                Sentence(
                    id = "s_phcall_59",
                    hanzi = "铃美：我重复一下13315412981。",
                    pinyin = "Líng měi wǒ chóng fù yī xià",
                    translation = "Lingmei: Saya ulangi ya, 13315412981.",
                    tokens = listOf(
                        WordToken("铃美", "Líng měi", "Suzumi (a name)", "Kosakata HSK 2: 铃美 (Líng měi)"),
                        WordToken("我", "wǒ", "Saya", "Kata ganti orang pertama tunggal"),
                        WordToken("重复", "chóng fù", "To repeat", "Kosakata HSK 2: 重复 (chóng fù)"),
                        WordToken("一下", "yī xià", "(after a verb) a bit; a little (indicating brief duration, or softening the tone, or suggesting giving sth a try)", "Kosakata HSK 2: 一下 (yī xià)")
                    )
                ),
                Sentence(
                    id = "s_phcall_60",
                    hanzi = "吴小宇：没错。",
                    pinyin = "Wú Xiǎo yǔ méi cuò",
                    translation = "Wu Xiaoyu: Betul sekali.",
                    tokens = listOf(
                        WordToken("吴小宇", "Wú Xiǎo yǔ", "A chinese personal name", "Kosakata HSK 2: 吴小宇 (Wú Xiǎo yǔ)"),
                        WordToken("没错", "méi cuò", "That&#x27;s right", "Kosakata HSK 2: 没错 (méi cuò)")
                    )
                ),
                Sentence(
                    id = "s_phcall_61",
                    hanzi = "铃美：谢谢你。",
                    pinyin = "Líng měi xiè xie nǐ",
                    translation = "Lingmei: Terima kasih banyak.",
                    tokens = listOf(
                        WordToken("铃美", "Líng měi", "Suzumi (a name)", "Kosakata HSK 2: 铃美 (Líng měi)"),
                        WordToken("谢谢", "xiè xie", "Thanks", "Kosakata HSK 2: 谢谢 (xiè xie)"),
                        WordToken("你", "nǐ", "Kamu", "Kata ganti orang kedua tunggal")
                    )
                ),
                Sentence(
                    id = "s_phcall_62",
                    hanzi = "我现在就给王老师打电话。",
                    pinyin = "wǒ xiàn zài jiù gěi Wáng lǎo shī dǎ diàn huà",
                    translation = "Sekarang saya akan langsung menelepon Dosen Wang.",
                    tokens = listOf(
                        WordToken("我", "wǒ", "Saya", "Kata ganti orang pertama tunggal"),
                        WordToken("现在", "xiàn zài", "Sekarang", "Waktu saat ini"),
                        WordToken("就", "jiù", "Langsung / Segera / Maka", "Menyatakan ketepatan waktu atau kelogisan"),
                        WordToken("给", "gěi", "Memberi / Kepada", "Tindakan memberi atau preposisi sasaran"),
                        WordToken("王", "Wáng", "Surname wang", "Kosakata HSK 2: 王 (Wáng)"),
                        WordToken("老师", "lǎo shī", "Guru", "Tenaga pengajar"),
                        WordToken("打", "dǎ", "Memukul / Mengetik / Melakukan", "Kata kerja umum beragam makna"),
                        WordToken("电话", "diàn huà", "Telephone", "Kosakata HSK 2: 电话 (diàn huà)")
                    )
                ),
                Sentence(
                    id = "s_phcall_63",
                    hanzi = "吴小宇：不客气。",
                    pinyin = "Wú Xiǎo yǔ bù kè qi",
                    translation = "Wu Xiaoyu: Sama-sama.",
                    tokens = listOf(
                        WordToken("吴小宇", "Wú Xiǎo yǔ", "A chinese personal name", "Kosakata HSK 2: 吴小宇 (Wú Xiǎo yǔ)"),
                        WordToken("不客气", "bù kè qi", "You&#x27;re welcome", "Kosakata HSK 2: 不客气 (bù kè qi)")
                    )
                ),
                Sentence(
                    id = "s_phcall_64",
                    hanzi = "铃美：再见。",
                    pinyin = "Líng měi zài jiàn",
                    translation = "Lingmei: Sampai jumpa.",
                    tokens = listOf(
                        WordToken("铃美", "Líng měi", "Suzumi (a name)", "Kosakata HSK 2: 铃美 (Líng měi)"),
                        WordToken("再见", "zài jiàn", "Goodbye", "Kosakata HSK 2: 再见 (zài jiàn)")
                    )
                ),
                Sentence(
                    id = "s_phcall_65",
                    hanzi = "吴小宇：再见。",
                    pinyin = "Wú Xiǎo yǔ zài jiàn",
                    translation = "Wu Xiaoyu: Sampai jumpa.",
                    tokens = listOf(
                        WordToken("吴小宇", "Wú Xiǎo yǔ", "A chinese personal name", "Kosakata HSK 2: 吴小宇 (Wú Xiǎo yǔ)"),
                        WordToken("再见", "zài jiàn", "Goodbye", "Kosakata HSK 2: 再见 (zài jiàn)")
                    )
                )
            ),
            questions = listOf(
                StoryQuestion(
                    id = "q_phcall_1",
                    questionText = "铃美打电话给王老师的目的是什么？ (Apa tujuan Lingmei menelepon Dosen Wang?)",
                    options = listOf("借书 (Meminjam buku)", "请假，明天早上要去看医生 (Minta izin sakit karena besok pagi harus ke dokter)", "问考试成绩 (Menanyakan nilai ujian)", "邀请老师吃饭 (Mengajak dosen makan)"),
                    correctAnswerIndex = 1,
                    explanation = "Lingmei kurang sehat dan sudah mendaftar antrean periksa dokter besok pagi."
                ),
                StoryQuestion(
                    id = "q_phcall_2",
                    questionText = "铃美第一次打电话发生了什么？ (Apa yang terjadi saat Lingmei pertama kali menelepon?)",
                    options = listOf("打通了 (Langsung tersambung)", "打错了电话 (Salah sambung nomor)", "没有人接 (Tidak ada yang mengangkat)", "电话坏了 (Teleponnya rusak)"),
                    correctAnswerIndex = 1,
                    explanation = "Lawan bicara pertama menjawab '不好意思，你打错了。我不是王老师'."
                ),
                StoryQuestion(
                    id = "q_phcall_3",
                    questionText = "接听第二次电话的吴小宇是谁？ (Siapa Wu Xiaoyu yang menerima telepon kedua?)",
                    options = listOf("王老师的医生 (Dokter Pak Wang)", "王老师的学生 (Mahasiswa dari Dosen Wang)", "学校的校长 (Kepala sekolah)", "铃美的哥哥 (Kakak laki-laki Lingmei)"),
                    correctAnswerIndex = 1,
                    explanation = "Wu Xiaoyu adalah mahasiswa yang sedang berada di kantor Dosen Wang."
                ),
                StoryQuestion(
                    id = "q_phcall_4",
                    questionText = "王老师什么时候能回到办公室？ (Kapan Dosen Wang diperkirakan kembali ke kantor?)",
                    options = listOf("十分钟后 (Sepuluh menit lagi)", "两小时后 (Dua jam lagi)", "明天 (Besok)", "下周 (Minggu depan)"),
                    correctAnswerIndex = 0,
                    explanation = "Wu Xiaoyu memperkirakan: '我估计王老师十分钟后就回来了'."
                )
            )
        ),
        // Cerita Mandarin Bean 85 (HSK 2): Are You Free Tomorrow Night? (Besok Malam Apakah Kamu Ada Waktu Luang?)
        Story(
            id = "story_free_tomorrow_night",
            titleHanzi = "明天晚上你有空吗？",
            titlePinyin = "Míngtiān Wǎnshang Nǐ Yǒu Kòng ma?",
            titleTranslation = "Are You Free Tomorrow Night? (Besok Malam Apakah Kamu Ada Waktu Luang?)",
            level = "HSK 2",
            category = "Percakapan & Janji Temu",
            description = "Ajakan menonton pertunjukan seni dan makan malam bersama teman akrab di akhir pekan.",
            coverEmoji = "🎟️",
            coverImageRes = R.drawable.cover_story_free_tomorrow_night,
            estimatedReadMinutes = 2,
            sentences = listOf(
                Sentence(
                    id = "s_freetmrw_1",
                    hanzi = "吴小天：小咪，明天晚上有空吗？",
                    pinyin = "Wú Xiǎo tiān xiǎo mī míng tiān wǎn shang yǒu kòng ma",
                    translation = "Wu Xiaotian: Xiao Mi, besok malam apakah ada waktu luang?",
                    tokens = listOf(
                        WordToken("吴小天", "Wú Xiǎo tiān", "A personal name (wu xiaotian)", "Kosakata HSK 2: 吴小天 (Wú Xiǎo tiān)"),
                        WordToken("小咪", "xiǎo mī", "A nickname for xiaomi", "Kosakata HSK 2: 小咪 (xiǎo mī)"),
                        WordToken("明天", "míng tiān", "Besok", "Keterangan waktu mendatang"),
                        WordToken("晚上", "wǎn shang", "Malam hari", "Waktu malam"),
                        WordToken("有", "yǒu", "Mempunyai / Ada", "Menyatakan kepemilikan atau eksistensi"),
                        WordToken("空", "kòng", "Space", "Kosakata HSK 2: 空 (kòng)"),
                        WordToken("吗", "ma", "Apakah (partikel tanya)", "Partikel di akhir kalimat interogatif ya/tidak")
                    )
                ),
                Sentence(
                    id = "s_freetmrw_2",
                    hanzi = "吴小咪：明天啊……明天星期三吧？",
                    pinyin = "Wú Xiǎo mī míng tiān a míng tiān Xīng qī sān ba",
                    translation = "Wu Xiaomi: Besok ya…… besok hari Rabu kan?",
                    tokens = listOf(
                        WordToken("吴小咪", "Wú Xiǎo mī", "A name", "Kosakata HSK 2: 吴小咪 (Wú Xiǎo mī)"),
                        WordToken("明天", "míng tiān", "Besok", "Keterangan waktu mendatang"),
                        WordToken("啊", "a", "Modal particle ending sentence, showing affirmation, approval, or consent", "Kosakata HSK 2: 啊 (a)"),
                        WordToken("明天", "míng tiān", "Besok", "Keterangan waktu mendatang"),
                        WordToken("星期三", "Xīng qī sān", "Wednesday", "Kosakata HSK 2: 星期三 (Xīng qī sān)"),
                        WordToken("吧", "ba", "Kan / Mari (partikel saran)", "Partikel saran, ajakan, atau dugaan")
                    )
                ),
                Sentence(
                    id = "s_freetmrw_3",
                    hanzi = "吴小天：今天星期三，明天星期四。",
                    pinyin = "Wú Xiǎo tiān jīn tiān Xīng qī sān míng tiān Xīng qī sì",
                    translation = "Wu Xiaotian: Hari ini hari Rabu, besok hari Kamis.",
                    tokens = listOf(
                        WordToken("吴小天", "Wú Xiǎo tiān", "A personal name (wu xiaotian)", "Kosakata HSK 2: 吴小天 (Wú Xiǎo tiān)"),
                        WordToken("今天", "jīn tiān", "Hari ini", "Keterangan waktu sekarang"),
                        WordToken("星期三", "Xīng qī sān", "Wednesday", "Kosakata HSK 2: 星期三 (Xīng qī sān)"),
                        WordToken("明天", "míng tiān", "Besok", "Keterangan waktu mendatang"),
                        WordToken("星期四", "Xīng qī sì", "Thursday", "Kosakata HSK 2: 星期四 (Xīng qī sì)")
                    )
                ),
                Sentence(
                    id = "s_freetmrw_4",
                    hanzi = "吴小咪：哦，我明天晚上没空，我跟同学要一起吃饭。",
                    pinyin = "Wú Xiǎo mī ò wǒ míng tiān wǎn shang méi kòng wǒ gēn tóng xué yào yī qǐ chī fàn",
                    translation = "Wu Xiaomi: Oh, besok malam saya tidak ada waktu, saya mau makan bersama teman sekelas.",
                    tokens = listOf(
                        WordToken("吴小咪", "Wú Xiǎo mī", "A name", "Kosakata HSK 2: 吴小咪 (Wú Xiǎo mī)"),
                        WordToken("哦", "ò", "Oh (interjection indicating that one has just learned sth)", "Kosakata HSK 2: 哦 (ò)"),
                        WordToken("我", "wǒ", "Saya", "Kata ganti orang pertama tunggal"),
                        WordToken("明天", "míng tiān", "Besok", "Keterangan waktu mendatang"),
                        WordToken("晚上", "wǎn shang", "Malam hari", "Waktu malam"),
                        WordToken("没", "méi", "Belum / Tidak", "Kata sangkalan untuk keberadaan atau masa lampau"),
                        WordToken("空", "kòng", "Space", "Kosakata HSK 2: 空 (kòng)"),
                        WordToken("我", "wǒ", "Saya", "Kata ganti orang pertama tunggal"),
                        WordToken("跟", "gēn", "With", "Kosakata HSK 2: 跟 (gēn)"),
                        WordToken("同学", "tóng xué", "Teman sekelas", "Rekan belajar"),
                        WordToken("要", "yào", "Mau / Akan / Harus", "Menyatakan niat atau keharusan"),
                        WordToken("一起", "yī qǐ", "Together; in company (with)", "Kosakata HSK 2: 一起 (yī qǐ)"),
                        WordToken("吃饭", "chī fàn", "To have a meal", "Kosakata HSK 2: 吃饭 (chī fàn)")
                    )
                ),
                Sentence(
                    id = "s_freetmrw_5",
                    hanzi = "怎么了？",
                    pinyin = "zěn me le",
                    translation = "Ada apa memangnya?",
                    tokens = listOf(
                        WordToken("怎么", "zěn me", "How?", "Kosakata HSK 2: 怎么 (zěn me)"),
                        WordToken("了", "le", "Sudah (partikel perubahan situasi)", "Partikel aspek selesainya tindakan")
                    )
                ),
                Sentence(
                    id = "s_freetmrw_6",
                    hanzi = "吴小天：我这儿有两张电影票，9月26号，就是明天晚上7点的，想和你一起去看。",
                    pinyin = "Wú Xiǎo tiān wǒ zhè r yǒu liǎng zhāng diàn yǐng piào yuè hào jiù shì míng tiān wǎn shang diǎn de xiǎng hé nǐ yī qǐ qù kàn",
                    translation = "Wu Xiaotian: Di sini saya ada dua tiket bioskop tanggal 26 September, yaitu besok malam pukul 7, ingin mengajakmu menonton bersama.",
                    tokens = listOf(
                        WordToken("吴小天", "Wú Xiǎo tiān", "A personal name (wu xiaotian)", "Kosakata HSK 2: 吴小天 (Wú Xiǎo tiān)"),
                        WordToken("我", "wǒ", "Saya", "Kata ganti orang pertama tunggal"),
                        WordToken("这儿", "zhè r", "Sini", "Kata tunjuk tempat dekat"),
                        WordToken("有", "yǒu", "Mempunyai / Ada", "Menyatakan kepemilikan atau eksistensi"),
                        WordToken("两", "liǎng", "Two", "Kosakata HSK 2: 两 (liǎng)"),
                        WordToken("张", "zhāng", "Classifier for flat objects, sheet", "Kosakata HSK 2: 张 (zhāng)"),
                        WordToken("电影", "diàn yǐng", "Movie; film", "Kosakata HSK 2: 电影 (diàn yǐng)"),
                        WordToken("票", "piào", "Ticket", "Kosakata HSK 2: 票 (piào)"),
                        WordToken("月", "yuè", "Bulan", "Satuan bulan"),
                        WordToken("号", "hào", "(bound form) bugle; trumpet", "Kosakata HSK 2: 号 (hào)"),
                        WordToken("就", "jiù", "Langsung / Segera / Maka", "Menyatakan ketepatan waktu atau kelogisan"),
                        WordToken("是", "shì", "Adalah", "Kopula penjelas"),
                        WordToken("明天", "míng tiān", "Besok", "Keterangan waktu mendatang"),
                        WordToken("晚上", "wǎn shang", "Malam hari", "Waktu malam"),
                        WordToken("点", "diǎn", "Pukul / Jam", "Penunjuk waktu jam"),
                        WordToken("的", "de", "Punya / Yang (partikel posesif)", "Partikel penjelas modifikasi atau kepemilikan"),
                        WordToken("想", "xiǎng", "Ingin / Berpikir / Rindu", "Keinginan atau pemikiran batin"),
                        WordToken("和", "hé", "Dan", "Kata hubung setara"),
                        WordToken("你", "nǐ", "Kamu", "Kata ganti orang kedua tunggal"),
                        WordToken("一起", "yī qǐ", "Together; in company (with)", "Kosakata HSK 2: 一起 (yī qǐ)"),
                        WordToken("去", "qù", "Pergi", "Berpindah tempat menjauhi pembicara"),
                        WordToken("看", "kàn", "Melihat / Membaca", "Aktivitas visual")
                    )
                ),
                Sentence(
                    id = "s_freetmrw_7",
                    hanzi = "吴小咪：我看看……哥哥，这个电影票是去年的了。",
                    pinyin = "Wú Xiǎo mī wǒ kàn kan gē ge zhè gè diàn yǐng piào shì qù nián de le",
                    translation = "Wu Xiaomi: Film apa?",
                    tokens = listOf(
                        WordToken("吴小咪", "Wú Xiǎo mī", "A name", "Kosakata HSK 2: 吴小咪 (Wú Xiǎo mī)"),
                        WordToken("我", "wǒ", "Saya", "Kata ganti orang pertama tunggal"),
                        WordToken("看看", "kàn kan", "To take a look at", "Kosakata HSK 2: 看看 (kàn kan)"),
                        WordToken("哥哥", "gē ge", "Kakak laki-laki", "Saudara kandung laki-laki tertua"),
                        WordToken("这", "zhè", "This; these", "Kosakata HSK 2: 这 (zhè)"),
                        WordToken("个", "gè", "Classifier for people or objects in general", "Kosakata HSK 2: 个 (gè)"),
                        WordToken("电影", "diàn yǐng", "Movie; film", "Kosakata HSK 2: 电影 (diàn yǐng)"),
                        WordToken("票", "piào", "Ticket", "Kosakata HSK 2: 票 (piào)"),
                        WordToken("是", "shì", "Adalah", "Kopula penjelas"),
                        WordToken("去年", "qù nián", "Last year", "Kosakata HSK 2: 去年 (qù nián)"),
                        WordToken("的", "de", "Punya / Yang (partikel posesif)", "Partikel penjelas modifikasi atau kepemilikan"),
                        WordToken("了", "le", "Sudah (partikel perubahan situasi)", "Partikel aspek selesainya tindakan")
                    )
                ),
                Sentence(
                    id = "s_freetmrw_8",
                    hanzi = "吴小天：啊？",
                    pinyin = "Wú Xiǎo tiān á",
                    translation = "Apakah menarik?",
                    tokens = listOf(
                        WordToken("吴小天", "Wú Xiǎo tiān", "A personal name (wu xiaotian)", "Kosakata HSK 2: 吴小天 (Wú Xiǎo tiān)"),
                        WordToken("啊", "á", "Interjection expressing doubt or requiring answer", "Kosakata HSK 2: 啊 (á)")
                    )
                ),
                Sentence(
                    id = "s_freetmrw_9",
                    hanzi = "不会吧……",
                    pinyin = "bù huì ba",
                    translation = "Wu Xiaotian: Film komedi yang baru rilis, katanya sangat lucu dan seru.",
                    tokens = listOf(
                        WordToken("不", "bù", "Tidak", "Kata sangkalan untuk masa kini atau masa depan"),
                        WordToken("会", "huì", "To be likely to; to be sure to", "Kosakata HSK 2: 会 (huì)"),
                        WordToken("吧", "ba", "Kan / Mari (partikel saran)", "Partikel saran, ajakan, atau dugaan")
                    )
                ),
                Sentence(
                    id = "s_freetmrw_10",
                    hanzi = "吴小咪：你看，2021年9月26号。",
                    pinyin = "Wú Xiǎo mī nǐ kàn nián yuè hào",
                    translation = "Wu Xiaomi: Sayang sekali ya, saya besok malam benar-benar tidak bisa pergi.",
                    tokens = listOf(
                        WordToken("吴小咪", "Wú Xiǎo mī", "A name", "Kosakata HSK 2: 吴小咪 (Wú Xiǎo mī)"),
                        WordToken("你", "nǐ", "Kamu", "Kata ganti orang kedua tunggal"),
                        WordToken("看", "kàn", "Melihat / Membaca", "Aktivitas visual"),
                        WordToken("年", "nián", "Tahun", "Satuan tahun"),
                        WordToken("月", "yuè", "Bulan", "Satuan bulan"),
                        WordToken("号", "hào", "(bound form) bugle; trumpet", "Kosakata HSK 2: 号 (hào)")
                    )
                ),
                Sentence(
                    id = "s_freetmrw_11",
                    hanzi = "而且这部电影去年我跟小宇就看过了。",
                    pinyin = "ér qiě zhè bù diàn yǐng qù nián wǒ gēn Xiǎo yǔ jiù kàn guo le",
                    translation = "Wu Xiaotian: Kalau begitu hari Jumat malam bagaimana?",
                    tokens = listOf(
                        WordToken("而且", "ér qiě", "(not only ...) but also", "Kosakata HSK 2: 而且 (ér qiě)"),
                        WordToken("这", "zhè", "This; these", "Kosakata HSK 2: 这 (zhè)"),
                        WordToken("部", "bù", "Classifier for works of literature, films, machines etc", "Kosakata HSK 2: 部 (bù)"),
                        WordToken("电影", "diàn yǐng", "Movie; film", "Kosakata HSK 2: 电影 (diàn yǐng)"),
                        WordToken("去年", "qù nián", "Last year", "Kosakata HSK 2: 去年 (qù nián)"),
                        WordToken("我", "wǒ", "Saya", "Kata ganti orang pertama tunggal"),
                        WordToken("跟", "gēn", "And (joining two nouns)", "Kosakata HSK 2: 跟 (gēn)"),
                        WordToken("小宇", "Xiǎo yǔ", "A personal name; xiaoyu", "Kosakata HSK 2: 小宇 (Xiǎo yǔ)"),
                        WordToken("就", "jiù", "Langsung / Segera / Maka", "Menyatakan ketepatan waktu atau kelogisan"),
                        WordToken("看", "kàn", "Melihat / Membaca", "Aktivitas visual"),
                        WordToken("过", "guo", "(experienced action marker)", "Kosakata HSK 2: 过 (guo)"),
                        WordToken("了", "le", "Sudah (partikel perubahan situasi)", "Partikel aspek selesainya tindakan")
                    )
                ),
                Sentence(
                    id = "s_freetmrw_12",
                    hanzi = "吴小天：我想起来了，这是去年同事送我的，我都忘了。",
                    pinyin = "Wú Xiǎo tiān wǒ xiǎng qǐ lái le zhè shì qù nián tóng shì sòng wǒ de wǒ dōu wàng le",
                    translation = "Wu Xiaomi: Hari Jumat malam saya ada waktu luang.",
                    tokens = listOf(
                        WordToken("吴小天", "Wú Xiǎo tiān", "A personal name (wu xiaotian)", "Kosakata HSK 2: 吴小天 (Wú Xiǎo tiān)"),
                        WordToken("我", "wǒ", "Saya", "Kata ganti orang pertama tunggal"),
                        WordToken("想", "xiǎng", "Ingin / Berpikir / Rindu", "Keinginan atau pemikiran batin"),
                        WordToken("起来", "qǐ lái", "Indicating the beginning and continuation of an action or a state", "Kosakata HSK 2: 起来 (qǐ lái)"),
                        WordToken("了", "le", "Sudah (partikel perubahan situasi)", "Partikel aspek selesainya tindakan"),
                        WordToken("这", "zhè", "This; these", "Kosakata HSK 2: 这 (zhè)"),
                        WordToken("是", "shì", "Adalah", "Kopula penjelas"),
                        WordToken("去年", "qù nián", "Last year", "Kosakata HSK 2: 去年 (qù nián)"),
                        WordToken("同事", "tóng shì", "Colleague; co-worker", "Kosakata HSK 2: 同事 (tóng shì)"),
                        WordToken("送", "sòng", "Menghadiahkan / Mengantar", "Memberikan bingkisan atau mengantar"),
                        WordToken("我", "wǒ", "Saya", "Kata ganti orang pertama tunggal"),
                        WordToken("的", "de", "Punya / Yang (partikel posesif)", "Partikel penjelas modifikasi atau kepemilikan"),
                        WordToken("我", "wǒ", "Saya", "Kata ganti orang pertama tunggal"),
                        WordToken("都", "dōu", "Semua / Seluruhnya", "Menyatakan keuniversalan subjek"),
                        WordToken("忘", "wàng", "To forget", "Kosakata HSK 2: 忘 (wàng)"),
                        WordToken("了", "le", "Sudah (partikel perubahan situasi)", "Partikel aspek selesainya tindakan")
                    )
                ),
                Sentence(
                    id = "s_freetmrw_13",
                    hanzi = "吴小咪：对了，别忘了下个月13号我们一起吃饭。",
                    pinyin = "Wú Xiǎo mī duì le bié wàng le xià gè yuè hào wǒ men yī qǐ chī fàn",
                    translation = "Tapi tiket bioskopmu kan untuk besok malam?",
                    tokens = listOf(
                        WordToken("吴小咪", "Wú Xiǎo mī", "A name", "Kosakata HSK 2: 吴小咪 (Wú Xiǎo mī)"),
                        WordToken("对了", "duì le", "Oh, that&#x27;s right, ... (when one suddenly remembers sth one wanted to mention)", "Kosakata HSK 2: 对了 (duì le)"),
                        WordToken("别", "bié", "Don&#x27;t ...!", "Kosakata HSK 2: 别 (bié)"),
                        WordToken("忘", "wàng", "To forget", "Kosakata HSK 2: 忘 (wàng)"),
                        WordToken("了", "le", "Sudah (partikel perubahan situasi)", "Partikel aspek selesainya tindakan"),
                        WordToken("下", "xià", "Later", "Kosakata HSK 2: 下 (xià)"),
                        WordToken("个", "gè", "Classifier for people or objects in general", "Kosakata HSK 2: 个 (gè)"),
                        WordToken("月", "yuè", "Bulan", "Satuan bulan"),
                        WordToken("号", "hào", "(bound form) bugle; trumpet", "Kosakata HSK 2: 号 (hào)"),
                        WordToken("我们", "wǒ men", "Kami / Kita", "Kata ganti orang pertama jamak"),
                        WordToken("一起", "yī qǐ", "Together; in company (with)", "Kosakata HSK 2: 一起 (yī qǐ)"),
                        WordToken("吃", "chī", "Makan", "Aktivitas mengonsumsi makanan"),
                        WordToken("饭", "fàn", "Nasi / Makanan", "Makanan pokok")
                    )
                ),
                Sentence(
                    id = "s_freetmrw_14",
                    hanzi = "吴小天：下个月13号？",
                    pinyin = "Wú Xiǎo tiān xià gè yuè hào",
                    translation = "Wu Xiaotian: Tidak masalah, saya bisa menukarnya dengan tiket hari Jumat di aplikasi.",
                    tokens = listOf(
                        WordToken("吴小天", "Wú Xiǎo tiān", "A personal name (wu xiaotian)", "Kosakata HSK 2: 吴小天 (Wú Xiǎo tiān)"),
                        WordToken("下", "xià", "Later", "Kosakata HSK 2: 下 (xià)"),
                        WordToken("个", "gè", "Classifier for people or objects in general", "Kosakata HSK 2: 个 (gè)"),
                        WordToken("月", "yuè", "Bulan", "Satuan bulan"),
                        WordToken("号", "hào", "(bound form) bugle; trumpet", "Kosakata HSK 2: 号 (hào)")
                    )
                ),
                Sentence(
                    id = "s_freetmrw_15",
                    hanzi = "为什么？",
                    pinyin = "wèi shén me",
                    translation = "Wu Xiaomi: Hebat sekali kalau begitu!",
                    tokens = listOf(
                        WordToken("为什么", "wèi shén me", "Why?", "Kosakata HSK 2: 为什么 (wèi shén me)")
                    )
                ),
                Sentence(
                    id = "s_freetmrw_16",
                    hanzi = "吴小咪：10月13号是小宇的生日啊！",
                    pinyin = "Wú Xiǎo mī yuè hào shì Xiǎo yǔ de shēng rì a",
                    translation = "Kita janjian jam berapa hari Jumat?",
                    tokens = listOf(
                        WordToken("吴小咪", "Wú Xiǎo mī", "A name", "Kosakata HSK 2: 吴小咪 (Wú Xiǎo mī)"),
                        WordToken("月", "yuè", "Bulan", "Satuan bulan"),
                        WordToken("号", "hào", "(bound form) bugle; trumpet", "Kosakata HSK 2: 号 (hào)"),
                        WordToken("是", "shì", "Adalah", "Kopula penjelas"),
                        WordToken("小宇", "Xiǎo yǔ", "A personal name; xiaoyu", "Kosakata HSK 2: 小宇 (Xiǎo yǔ)"),
                        WordToken("的", "de", "Punya / Yang (partikel posesif)", "Partikel penjelas modifikasi atau kepemilikan"),
                        WordToken("生日", "shēng rì", "Hari ulang tahun", "Hari kelahiran"),
                        WordToken("啊", "a", "Modal particle ending sentence, showing affirmation, approval, or consent", "Kosakata HSK 2: 啊 (a)")
                    )
                ),
                Sentence(
                    id = "s_freetmrw_17",
                    hanzi = "去年你就忘了小宇的生日，今年不能再忘了。",
                    pinyin = "qù nián nǐ jiù wàng le Xiǎo yǔ de shēng rì jīn nián bù néng zài wàng le",
                    translation = "Wu Xiaotian: Hari Jumat malam jam 7 bagaimana?",
                    tokens = listOf(
                        WordToken("去年", "qù nián", "Last year", "Kosakata HSK 2: 去年 (qù nián)"),
                        WordToken("你", "nǐ", "Kamu", "Kata ganti orang kedua tunggal"),
                        WordToken("就", "jiù", "Langsung / Segera / Maka", "Menyatakan ketepatan waktu atau kelogisan"),
                        WordToken("忘", "wàng", "To forget", "Kosakata HSK 2: 忘 (wàng)"),
                        WordToken("了", "le", "Sudah (partikel perubahan situasi)", "Partikel aspek selesainya tindakan"),
                        WordToken("小宇", "Xiǎo yǔ", "A personal name; xiaoyu", "Kosakata HSK 2: 小宇 (Xiǎo yǔ)"),
                        WordToken("的", "de", "Punya / Yang (partikel posesif)", "Partikel penjelas modifikasi atau kepemilikan"),
                        WordToken("生日", "shēng rì", "Hari ulang tahun", "Hari kelahiran"),
                        WordToken("今年", "jīn nián", "This year", "Kosakata HSK 2: 今年 (jīn nián)"),
                        WordToken("不", "bù", "Tidak", "Kata sangkalan untuk masa kini atau masa depan"),
                        WordToken("能", "néng", "Bisa / Mampu / Boleh", "Kata bantu kemampuan atau izin"),
                        WordToken("再", "zài", "Lagi / Sekali lagi", "Pengulangan tindakan mendatang"),
                        WordToken("忘", "wàng", "To forget", "Kosakata HSK 2: 忘 (wàng)"),
                        WordToken("了", "le", "Sudah (partikel perubahan situasi)", "Partikel aspek selesainya tindakan")
                    )
                ),
                Sentence(
                    id = "s_freetmrw_18",
                    hanzi = "吴小天：对，今年再忘，小宇该生气了。",
                    pinyin = "Wú Xiǎo tiān duì jīn nián zài wàng Xiǎo yǔ gāi shēng qì le",
                    translation = "Wu Xiaomi: Boleh, kita bertemu di mana?",
                    tokens = listOf(
                        WordToken("吴小天", "Wú Xiǎo tiān", "A personal name (wu xiaotian)", "Kosakata HSK 2: 吴小天 (Wú Xiǎo tiān)"),
                        WordToken("对", "duì", "Right; correct", "Kosakata HSK 2: 对 (duì)"),
                        WordToken("今年", "jīn nián", "This year", "Kosakata HSK 2: 今年 (jīn nián)"),
                        WordToken("再", "zài", "Lagi / Sekali lagi", "Pengulangan tindakan mendatang"),
                        WordToken("忘", "wàng", "To forget", "Kosakata HSK 2: 忘 (wàng)"),
                        WordToken("小宇", "Xiǎo yǔ", "A personal name; xiaoyu", "Kosakata HSK 2: 小宇 (Xiǎo yǔ)"),
                        WordToken("该", "gāi", "Should", "Kosakata HSK 2: 该 (gāi)"),
                        WordToken("生气", "shēng qì", "To get angry; to be furious", "Kosakata HSK 2: 生气 (shēng qì)"),
                        WordToken("了", "le", "Sudah (partikel perubahan situasi)", "Partikel aspek selesainya tindakan")
                    )
                ),
                Sentence(
                    id = "s_freetmrw_19",
                    hanzi = "10月13号是星期几？",
                    pinyin = "yuè hào shì xīng qī jǐ",
                    translation = "Wu Xiaotian: Kita bertemu di pintu masuk bioskop pukul 6 lewat 45 menit.",
                    tokens = listOf(
                        WordToken("月", "yuè", "Bulan", "Satuan bulan"),
                        WordToken("号", "hào", "(bound form) bugle; trumpet", "Kosakata HSK 2: 号 (hào)"),
                        WordToken("是", "shì", "Adalah", "Kopula penjelas"),
                        WordToken("星期", "xīng qī", "Minggu / Pekan", "Satuan pekan"),
                        WordToken("几", "jǐ", "How much", "Kosakata HSK 2: 几 (jǐ)")
                    )
                ),
                Sentence(
                    id = "s_freetmrw_20",
                    hanzi = "吴小咪：10月13号是……星期五。",
                    pinyin = "Wú Xiǎo mī yuè hào shì Xīng qī wǔ",
                    translation = "Wu Xiaomi: Baik, sampai jumpa hari Jumat malam!",
                    tokens = listOf(
                        WordToken("吴小咪", "Wú Xiǎo mī", "A name", "Kosakata HSK 2: 吴小咪 (Wú Xiǎo mī)"),
                        WordToken("月", "yuè", "Bulan", "Satuan bulan"),
                        WordToken("号", "hào", "(bound form) bugle; trumpet", "Kosakata HSK 2: 号 (hào)"),
                        WordToken("是", "shì", "Adalah", "Kopula penjelas"),
                        WordToken("星期五", "Xīng qī wǔ", "Friday", "Kosakata HSK 2: 星期五 (Xīng qī wǔ)")
                    )
                ),
                Sentence(
                    id = "s_freetmrw_21",
                    hanzi = "吴小天：星期一到星期三我要去北京开会，星期四下午回来，星期五早上上班，晚上应该能回家给小宇过生日。",
                    pinyin = "Wú Xiǎo tiān Xīng qī yī dào Xīng qī sān wǒ yào qù Běi jīng kāi huì Xīng qī sì xià wǔ huí lái Xīng qī wǔ zǎo shang shàng bān wǎn shang yīng gāi néng huí jiā gěi Xiǎo yǔ guò shēng rì",
                    translation = "Wu Xiaotian: Sampai jumpa hari Jumat!",
                    tokens = listOf(
                        WordToken("吴小天", "Wú Xiǎo tiān", "A personal name (wu xiaotian)", "Kosakata HSK 2: 吴小天 (Wú Xiǎo tiān)"),
                        WordToken("星期一", "Xīng qī yī", "Monday", "Kosakata HSK 2: 星期一 (Xīng qī yī)"),
                        WordToken("到", "dào", "To reach; to arrive", "Kosakata HSK 2: 到 (dào)"),
                        WordToken("星期三", "Xīng qī sān", "Wednesday", "Kosakata HSK 2: 星期三 (Xīng qī sān)"),
                        WordToken("我", "wǒ", "Saya", "Kata ganti orang pertama tunggal"),
                        WordToken("要", "yào", "Mau / Akan / Harus", "Menyatakan niat atau keharusan"),
                        WordToken("去", "qù", "Pergi", "Berpindah tempat menjauhi pembicara"),
                        WordToken("北京", "Běi jīng", "Beijing municipality, capital of the people&#x27;s republic of china", "Kosakata HSK 2: 北京 (Běi jīng)"),
                        WordToken("开会", "kāi huì", "To hold a meeting", "Kosakata HSK 2: 开会 (kāi huì)"),
                        WordToken("星期四", "Xīng qī sì", "Thursday", "Kosakata HSK 2: 星期四 (Xīng qī sì)"),
                        WordToken("下午", "xià wǔ", "Sore hari", "Waktu setelah tengah hari"),
                        WordToken("回", "huí", "Kembali / Pulang", "Menuju ke tempat asal"),
                        WordToken("来", "lái", "Datang", "Menuju ke arah pembicara"),
                        WordToken("星期五", "Xīng qī wǔ", "Friday", "Kosakata HSK 2: 星期五 (Xīng qī wǔ)"),
                        WordToken("早上", "zǎo shang", "Pagi hari", "Waktu fajar hingga pagi"),
                        WordToken("上班", "shàng bān", "To go to work", "Kosakata HSK 2: 上班 (shàng bān)"),
                        WordToken("晚上", "wǎn shang", "Malam hari", "Waktu malam"),
                        WordToken("应该", "yīng gāi", "Ought to; should; must", "Kosakata HSK 2: 应该 (yīng gāi)"),
                        WordToken("能", "néng", "Bisa / Mampu / Boleh", "Kata bantu kemampuan atau izin"),
                        WordToken("回", "huí", "Kembali / Pulang", "Menuju ke tempat asal"),
                        WordToken("家", "jiā", "Rumah / Keluarga", "Tempat tinggal"),
                        WordToken("给", "gěi", "Memberi / Kepada", "Tindakan memberi atau preposisi sasaran"),
                        WordToken("小宇", "Xiǎo yǔ", "A personal name; xiaoyu", "Kosakata HSK 2: 小宇 (Xiǎo yǔ)"),
                        WordToken("过", "guò", "To cross", "Kosakata HSK 2: 过 (guò)"),
                        WordToken("生日", "shēng rì", "Hari ulang tahun", "Hari kelahiran")
                    )
                ),
                Sentence(
                    id = "s_freetmrw_22",
                    hanzi = "吴小咪：那太好了。",
                    pinyin = "Wú Xiǎo mī nà tài hǎo le",
                    translation = "Wu Xiaomi: Jangan lupa menukar tiketnya ya.",
                    tokens = listOf(
                        WordToken("吴小咪", "Wú Xiǎo mī", "A name", "Kosakata HSK 2: 吴小咪 (Wú Xiǎo mī)"),
                        WordToken("那", "nà", "Then (in that case)", "Kosakata HSK 2: 那 (nà)"),
                        WordToken("太", "tài", "Terlalu", "Derajat melampaui batas"),
                        WordToken("好", "hǎo", "Bagus / Baik", "Kualitas positif"),
                        WordToken("了", "le", "Sudah (partikel perubahan situasi)", "Partikel aspek selesainya tindakan")
                    )
                ),
                Sentence(
                    id = "s_freetmrw_23",
                    hanzi = "我明天就去蛋糕店订生日蛋糕。",
                    pinyin = "wǒ míng tiān jiù qù dàn gāo diàn dìng shēng rì dàn gāo",
                    translation = "Wu Xiaotian: Tenang saja, sudah saya tukar sekarang.",
                    tokens = listOf(
                        WordToken("我", "wǒ", "Saya", "Kata ganti orang pertama tunggal"),
                        WordToken("明天", "míng tiān", "Besok", "Keterangan waktu mendatang"),
                        WordToken("就", "jiù", "Langsung / Segera / Maka", "Menyatakan ketepatan waktu atau kelogisan"),
                        WordToken("去", "qù", "Pergi", "Berpindah tempat menjauhi pembicara"),
                        WordToken("蛋糕", "dàn gāo", "Kue tart / Cake", "Makanan manis perayaan"),
                        WordToken("店", "diàn", "(bound form) shop; store", "Kosakata HSK 2: 店 (diàn)"),
                        WordToken("订", "dìng", "To agree", "Kosakata HSK 2: 订 (dìng)"),
                        WordToken("生日", "shēng rì", "Hari ulang tahun", "Hari kelahiran"),
                        WordToken("蛋糕", "dàn gāo", "Kue tart / Cake", "Makanan manis perayaan")
                    )
                ),
                Sentence(
                    id = "s_freetmrw_24",
                    hanzi = "吴小天：那我去饭馆订位置，周五吃饭的人应该会很多。",
                    pinyin = "Wú Xiǎo tiān nà wǒ qù fàn guǎn dìng wèi zhì Zhōu wǔ chī fàn de rén yīng gāi huì hěn duō",
                    translation = "Wu Xiaomi: Bagus sekali, terima kasih!",
                    tokens = listOf(
                        WordToken("吴小天", "Wú Xiǎo tiān", "A personal name (wu xiaotian)", "Kosakata HSK 2: 吴小天 (Wú Xiǎo tiān)"),
                        WordToken("那", "nà", "Then (in that case)", "Kosakata HSK 2: 那 (nà)"),
                        WordToken("我", "wǒ", "Saya", "Kata ganti orang pertama tunggal"),
                        WordToken("去", "qù", "Pergi", "Berpindah tempat menjauhi pembicara"),
                        WordToken("饭馆", "fàn guǎn", "Restaurant", "Kosakata HSK 2: 饭馆 (fàn guǎn)"),
                        WordToken("订", "dìng", "To agree", "Kosakata HSK 2: 订 (dìng)"),
                        WordToken("位置", "wèi zhì", "Position", "Kosakata HSK 2: 位置 (wèi zhì)"),
                        WordToken("周五", "Zhōu wǔ", "Friday", "Kosakata HSK 2: 周五 (Zhōu wǔ)"),
                        WordToken("吃", "chī", "Makan", "Aktivitas mengonsumsi makanan"),
                        WordToken("饭", "fàn", "Nasi / Makanan", "Makanan pokok"),
                        WordToken("的", "de", "Punya / Yang (partikel posesif)", "Partikel penjelas modifikasi atau kepemilikan"),
                        WordToken("人", "rén", "Person; people", "Kosakata HSK 2: 人 (rén)"),
                        WordToken("应该", "yīng gāi", "Ought to; should; must", "Kosakata HSK 2: 应该 (yīng gāi)"),
                        WordToken("会", "huì", "To be likely to; to be sure to", "Kosakata HSK 2: 会 (huì)"),
                        WordToken("很多", "hěn duō", "Many; a lot of", "Kosakata HSK 2: 很多 (hěn duō)")
                    )
                ),
                Sentence(
                    id = "s_freetmrw_25",
                    hanzi = "吴小咪：就订旁边的北京烤鸭店吧，小宇喜欢吃烤鸭。",
                    pinyin = "Wú Xiǎo mī jiù dìng páng biān de Běi jīng kǎo yā diàn ba Xiǎo yǔ xǐ huan chī kǎo yā",
                    translation = "Wu Xiaotian: Sama-sama!",
                    tokens = listOf(
                        WordToken("吴小咪", "Wú Xiǎo mī", "A name", "Kosakata HSK 2: 吴小咪 (Wú Xiǎo mī)"),
                        WordToken("就", "jiù", "Langsung / Segera / Maka", "Menyatakan ketepatan waktu atau kelogisan"),
                        WordToken("订", "dìng", "To agree", "Kosakata HSK 2: 订 (dìng)"),
                        WordToken("旁边", "páng biān", "Side; adjacent place", "Kosakata HSK 2: 旁边 (páng biān)"),
                        WordToken("的", "de", "Punya / Yang (partikel posesif)", "Partikel penjelas modifikasi atau kepemilikan"),
                        WordToken("北京", "Běi jīng", "Beijing municipality, capital of the people&#x27;s republic of china", "Kosakata HSK 2: 北京 (Běi jīng)"),
                        WordToken("烤鸭", "kǎo yā", "Roast duck", "Kosakata HSK 2: 烤鸭 (kǎo yā)"),
                        WordToken("店", "diàn", "(bound form) shop; store", "Kosakata HSK 2: 店 (diàn)"),
                        WordToken("吧", "ba", "Kan / Mari (partikel saran)", "Partikel saran, ajakan, atau dugaan"),
                        WordToken("小宇", "Xiǎo yǔ", "A personal name; xiaoyu", "Kosakata HSK 2: 小宇 (Xiǎo yǔ)"),
                        WordToken("喜欢", "xǐ huan", "Menyukai / Gemar", "Perasaan suka"),
                        WordToken("吃", "chī", "Makan", "Aktivitas mengonsumsi makanan"),
                        WordToken("烤鸭", "kǎo yā", "Roast duck", "Kosakata HSK 2: 烤鸭 (kǎo yā)")
                    )
                ),
                Sentence(
                    id = "s_freetmrw_26",
                    hanzi = "吴小天：好。",
                    pinyin = "Wú Xiǎo tiān hǎo",
                    translation = "Sampai ketemu!",
                    tokens = listOf(
                        WordToken("吴小天", "Wú Xiǎo tiān", "A personal name (wu xiaotian)", "Kosakata HSK 2: 吴小天 (Wú Xiǎo tiān)"),
                        WordToken("好", "hǎo", "Bagus / Baik", "Kualitas positif")
                    )
                )
            ),
            questions = listOf(
                StoryQuestion(
                    id = "q_freetmrw_1",
                    questionText = "主人公问对方什么问题？ (Pertanyaan apa yang diajukan tokoh utama kepada temannya?)",
                    options = listOf("明天晚上你有空吗？ (Apakah besok malam kamu luang?)", "你吃晚饭了吗？ (Sudahkah kamu makan malam?)", "你去不去图书馆？ (Apakah kamu pergi ke perpustakaan?)", "你买了什么？ (Apa yang sudah kamu beli?)"),
                    correctAnswerIndex = 0,
                    explanation = "Pertanyaan pembuka untuk mengajak jalan bersama di malam berikutnya."
                ),
                StoryQuestion(
                    id = "q_freetmrw_2",
                    questionText = "他们打算明天晚上去做什么？ (Apa rencana kegiatan mereka besok malam?)",
                    options = listOf("去看电影或者演出 (Menonton film atau pertunjukan pertunjukan pentas)", "在家里打游戏 (Main game di rumah)", "去医院看望病人 (Menjenguk pasien di rumah sakit)", "加班工作 (Lembur bekerja)"),
                    correctAnswerIndex = 0,
                    explanation = "Mereka merencanakan hiburan santai menyambut akhir pekan."
                ),
                StoryQuestion(
                    id = "q_freetmrw_3",
                    questionText = "如果对方有空，他们决定几点见面？ (Jika ada waktu luang, pukul berapa mereka sepakat bertemu?)",
                    options = listOf("早上八点 (Pukul 8 pagi)", "下午三点 (Pukul 3 sore)", "晚上六点半 (Pukul 6.30 petang)", "半夜十二点 (Pukul 12 tengah malam)"),
                    correctAnswerIndex = 2,
                    explanation = "Waktu bertemu disepakati sekitar jam makan malam pukul 18.30."
                ),
                StoryQuestion(
                    id = "q_freetmrw_4",
                    questionText = "在汉语中，“有空”是什么意思？ (Dalam bahasa Mandarin, apa arti ungkapan '有空'?)",
                    options = listOf("有钱 (Punya banyak uang)", "有空闲时间 (Memiliki waktu luang / tidak sibuk)", "肚子饿 (Perut kosong lapar)", "空中飞 (Terbang di udara)"),
                    correctAnswerIndex = 1,
                    explanation = "Kata '有空' (yǒu kòng) berarti mempunyai waktu luang senggang."
                )
            )
        ),
        // Cerita Mandarin Bean 86 (HSK 2): What Country Are You From? (Kamu Berasal Dari Negara Mana?)
        Story(
            id = "story_what_country_are_you_from",
            titleHanzi = "你是哪国人？",
            titlePinyin = "Nǐ Shì Nǎ Guó Rén?",
            titleTranslation = "What Country Are You From? (Kamu Berasal Dari Negara Mana?)",
            level = "HSK 2",
            category = "Perkenalan & Budaya",
            description = "Perkenalan ramah antar pembelajar bahasa dari berbagai penjuru negara di asrama mahasiswa internasional.",
            coverEmoji = "🗺️",
            coverImageRes = R.drawable.cover_story_what_country_are_you_from,
            estimatedReadMinutes = 2,
            sentences = listOf(
                Sentence(
                    id = "s_whatctry_1",
                    hanzi = "大龙：你好！",
                    pinyin = "Dà lóng nǐ hǎo",
                    translation = "Da Long: Halo!",
                    tokens = listOf(
                        WordToken("大龙", "Dà lóng", "A name", "Kosakata HSK 2: 大龙 (Dà lóng)"),
                        WordToken("你好", "nǐ hǎo", "Hello; hi", "Kosakata HSK 2: 你好 (nǐ hǎo)")
                    )
                ),
                Sentence(
                    id = "s_whatctry_2",
                    hanzi = "我叫大龙。",
                    pinyin = "wǒ jiào Dà lóng",
                    translation = "Nama saya Da Long.",
                    tokens = listOf(
                        WordToken("我", "wǒ", "Saya", "Kata ganti orang pertama tunggal"),
                        WordToken("叫", "jiào", "Memanggil / Bernama", "Menyebutkan nama"),
                        WordToken("大龙", "Dà lóng", "A name", "Kosakata HSK 2: 大龙 (Dà lóng)")
                    )
                ),
                Sentence(
                    id = "s_whatctry_3",
                    hanzi = "请问你是留学生吗？",
                    pinyin = "qǐng wèn nǐ shì liú xué shēng ma",
                    translation = "Permisi, apakah kamu mahasiswa asing?",
                    tokens = listOf(
                        WordToken("请问", "qǐng wèn", "Excuse me, may i ask...?", "Kosakata HSK 2: 请问 (qǐng wèn)"),
                        WordToken("你", "nǐ", "Kamu", "Kata ganti orang kedua tunggal"),
                        WordToken("是", "shì", "Adalah", "Kopula penjelas"),
                        WordToken("留学生", "liú xué shēng", "Student studying abroad; returned student; foreign student; international student", "Kosakata HSK 2: 留学生 (liú xué shēng)"),
                        WordToken("吗", "ma", "Apakah (partikel tanya)", "Partikel di akhir kalimat interogatif ya/tidak")
                    )
                ),
                Sentence(
                    id = "s_whatctry_4",
                    hanzi = "铃美：是，我是留学生。",
                    pinyin = "Líng měi shì wǒ shì liú xué shēng",
                    translation = "Lingmei: Iya, saya mahasiswi asing.",
                    tokens = listOf(
                        WordToken("铃美", "Líng měi", "Suzumi (a name)", "Kosakata HSK 2: 铃美 (Líng měi)"),
                        WordToken("是", "shì", "Adalah", "Kopula penjelas"),
                        WordToken("我", "wǒ", "Saya", "Kata ganti orang pertama tunggal"),
                        WordToken("是", "shì", "Adalah", "Kopula penjelas"),
                        WordToken("留学生", "liú xué shēng", "Student studying abroad; returned student; foreign student; international student", "Kosakata HSK 2: 留学生 (liú xué shēng)")
                    )
                ),
                Sentence(
                    id = "s_whatctry_5",
                    hanzi = "我叫铃美。",
                    pinyin = "wǒ jiào Líng měi",
                    translation = "Nama saya Lingmei.",
                    tokens = listOf(
                        WordToken("我", "wǒ", "Saya", "Kata ganti orang pertama tunggal"),
                        WordToken("叫", "jiào", "Memanggil / Bernama", "Menyebutkan nama"),
                        WordToken("铃美", "Líng měi", "Suzumi (a name)", "Kosakata HSK 2: 铃美 (Líng měi)")
                    )
                ),
                Sentence(
                    id = "s_whatctry_6",
                    hanzi = "大龙：你是哪国人？",
                    pinyin = "Dà lóng nǐ shì nǎ guó rén",
                    translation = "Da Long: Kamu orang negara mana?",
                    tokens = listOf(
                        WordToken("大龙", "Dà lóng", "A name", "Kosakata HSK 2: 大龙 (Dà lóng)"),
                        WordToken("你", "nǐ", "Kamu", "Kata ganti orang kedua tunggal"),
                        WordToken("是", "shì", "Adalah", "Kopula penjelas"),
                        WordToken("哪", "nǎ", "Which", "Kosakata HSK 2: 哪 (nǎ)"),
                        WordToken("国", "guó", "Country; nation; state", "Kosakata HSK 2: 国 (guó)"),
                        WordToken("人", "rén", "Person; people", "Kosakata HSK 2: 人 (rén)")
                    )
                ),
                Sentence(
                    id = "s_whatctry_7",
                    hanzi = "铃美：我是日本人，你呢？",
                    pinyin = "Líng měi wǒ shì Rì běn rén nǐ ne",
                    translation = "Lingmei: Saya orang Jepang.",
                    tokens = listOf(
                        WordToken("铃美", "Líng měi", "Suzumi (a name)", "Kosakata HSK 2: 铃美 (Líng měi)"),
                        WordToken("我", "wǒ", "Saya", "Kata ganti orang pertama tunggal"),
                        WordToken("是", "shì", "Adalah", "Kopula penjelas"),
                        WordToken("日本", "Rì běn", "Japan", "Kosakata HSK 2: 日本 (Rì běn)"),
                        WordToken("人", "rén", "Person; people", "Kosakata HSK 2: 人 (rén)"),
                        WordToken("你", "nǐ", "Kamu", "Kata ganti orang kedua tunggal"),
                        WordToken("呢", "ne", "Bagaimana dengan / sedang (partikel modal)", "Partikel tanya atau penanda sedang berlangsung")
                    )
                ),
                Sentence(
                    id = "s_whatctry_8",
                    hanzi = "大龙：我来自美国，我的中文名字叫大龙。",
                    pinyin = "Dà lóng wǒ lái zì Měi guó wǒ de Zhōng wén míng zi jiào Dà lóng",
                    translation = "Da Long: Wah, Jepang adalah negara yang indah.",
                    tokens = listOf(
                        WordToken("大龙", "Dà lóng", "A name", "Kosakata HSK 2: 大龙 (Dà lóng)"),
                        WordToken("我", "wǒ", "Saya", "Kata ganti orang pertama tunggal"),
                        WordToken("来自", "lái zì", "To come from (a place)", "Kosakata HSK 2: 来自 (lái zì)"),
                        WordToken("美国", "Měi guó", "Amerika Serikat", "Negara USA"),
                        WordToken("我的", "wǒ de", "My; mine", "Kosakata HSK 2: 我的 (wǒ de)"),
                        WordToken("中文", "Zhōng wén", "Chinese language", "Kosakata HSK 2: 中文 (Zhōng wén)"),
                        WordToken("名字", "míng zi", "Name (of a person or thing)", "Kosakata HSK 2: 名字 (míng zi)"),
                        WordToken("叫", "jiào", "Memanggil / Bernama", "Menyebutkan nama"),
                        WordToken("大龙", "Dà lóng", "A name", "Kosakata HSK 2: 大龙 (Dà lóng)")
                    )
                ),
                Sentence(
                    id = "s_whatctry_9",
                    hanzi = "你也是日本人吗？",
                    pinyin = "nǐ yě shì Rì běn rén ma",
                    translation = "Berapa lama kamu sudah belajar bahasa Mandarin?",
                    tokens = listOf(
                        WordToken("你", "nǐ", "Kamu", "Kata ganti orang kedua tunggal"),
                        WordToken("也", "yě", "Juga / Pun", "Partikel penanda kesamaan"),
                        WordToken("是", "shì", "Adalah", "Kopula penjelas"),
                        WordToken("日本", "Rì běn", "Japan", "Kosakata HSK 2: 日本 (Rì běn)"),
                        WordToken("人", "rén", "Person; people", "Kosakata HSK 2: 人 (rén)"),
                        WordToken("吗", "ma", "Apakah (partikel tanya)", "Partikel di akhir kalimat interogatif ya/tidak")
                    )
                ),
                Sentence(
                    id = "s_whatctry_10",
                    hanzi = "苏南：哦，不不！",
                    pinyin = "Sūn án ò bù bù",
                    translation = "Lingmei: Saya baru belajar selama satu tahun.",
                    tokens = listOf(
                        WordToken("苏南", "Sūn án", "Southern jiangsu; the southern part of jiangsu province, china", "Kosakata HSK 2: 苏南 (Sūn án)"),
                        WordToken("哦", "ò", "Oh (interjection indicating that one has just learned sth)", "Kosakata HSK 2: 哦 (ò)"),
                        WordToken("不", "bù", "Tidak", "Kata sangkalan untuk masa kini atau masa depan"),
                        WordToken("不", "bù", "Tidak", "Kata sangkalan untuk masa kini atau masa depan")
                    )
                ),
                Sentence(
                    id = "s_whatctry_11",
                    hanzi = "我不是日本人，我是泰国人。",
                    pinyin = "wǒ bù shì Rì běn rén wǒ shì Tài guó rén",
                    translation = "Da Long: Bahasa Mandarinmu terdengar sangat bagus!",
                    tokens = listOf(
                        WordToken("我", "wǒ", "Saya", "Kata ganti orang pertama tunggal"),
                        WordToken("不是", "bù shì", "Is not", "Kosakata HSK 2: 不是 (bù shì)"),
                        WordToken("日本", "Rì běn", "Japan", "Kosakata HSK 2: 日本 (Rì běn)"),
                        WordToken("人", "rén", "Person; people", "Kosakata HSK 2: 人 (rén)"),
                        WordToken("我", "wǒ", "Saya", "Kata ganti orang pertama tunggal"),
                        WordToken("是", "shì", "Adalah", "Kopula penjelas"),
                        WordToken("泰国", "Tài guó", "Thailand", "Negara Thailand"),
                        WordToken("人", "rén", "Person; people", "Kosakata HSK 2: 人 (rén)")
                    )
                ),
                Sentence(
                    id = "s_whatctry_12",
                    hanzi = "我的名字叫苏南。",
                    pinyin = "wǒ de míng zi jiào Sūn án",
                    translation = "Lingmei: Terima kasih, kamu orang negara mana?",
                    tokens = listOf(
                        WordToken("我", "wǒ", "Saya", "Kata ganti orang pertama tunggal"),
                        WordToken("的", "de", "Punya / Yang (partikel posesif)", "Partikel penjelas modifikasi atau kepemilikan"),
                        WordToken("名字", "míng zi", "Name (of a person or thing)", "Kosakata HSK 2: 名字 (míng zi)"),
                        WordToken("叫", "jiào", "Memanggil / Bernama", "Menyebutkan nama"),
                        WordToken("苏南", "Sūn án", "Southern jiangsu; the southern part of jiangsu province, china", "Kosakata HSK 2: 苏南 (Sūn án)")
                    )
                ),
                Sentence(
                    id = "s_whatctry_13",
                    hanzi = "吴小咪：大家好，我叫吴小咪。",
                    pinyin = "Wú Xiǎo mī dà jiā hǎo wǒ jiào Wú Xiǎo mī",
                    translation = "Da Long: Saya orang Amerika.",
                    tokens = listOf(
                        WordToken("吴小咪", "Wú Xiǎo mī", "A name", "Kosakata HSK 2: 吴小咪 (Wú Xiǎo mī)"),
                        WordToken("大家", "dà jiā", "Semua orang", "Menyatakan seluruh orang dalam lingkungan"),
                        WordToken("好", "hǎo", "Bagus / Baik", "Kualitas positif"),
                        WordToken("我", "wǒ", "Saya", "Kata ganti orang pertama tunggal"),
                        WordToken("叫", "jiào", "Memanggil / Bernama", "Menyebutkan nama"),
                        WordToken("吴小咪", "Wú Xiǎo mī", "A name", "Kosakata HSK 2: 吴小咪 (Wú Xiǎo mī)")
                    )
                ),
                Sentence(
                    id = "s_whatctry_14",
                    hanzi = "大龙：你好！",
                    pinyin = "Dà lóng nǐ hǎo",
                    translation = "Rumah saya di New York.",
                    tokens = listOf(
                        WordToken("大龙", "Dà lóng", "A name", "Kosakata HSK 2: 大龙 (Dà lóng)"),
                        WordToken("你好", "nǐ hǎo", "Hello; hi", "Kosakata HSK 2: 你好 (nǐ hǎo)")
                    )
                ),
                Sentence(
                    id = "s_whatctry_15",
                    hanzi = "你是日本人，泰国人还是韩国人？",
                    pinyin = "nǐ shì Rì běn rén Tài guó rén hái shi Hán guó rén",
                    translation = "Lingmei: New York adalah kota metropolitan yang sangat besar!",
                    tokens = listOf(
                        WordToken("你", "nǐ", "Kamu", "Kata ganti orang kedua tunggal"),
                        WordToken("是", "shì", "Adalah", "Kopula penjelas"),
                        WordToken("日本", "Rì běn", "Japan", "Kosakata HSK 2: 日本 (Rì běn)"),
                        WordToken("人", "rén", "Person; people", "Kosakata HSK 2: 人 (rén)"),
                        WordToken("泰国", "Tài guó", "Thailand", "Negara Thailand"),
                        WordToken("人", "rén", "Person; people", "Kosakata HSK 2: 人 (rén)"),
                        WordToken("还是", "hái shi", "Or", "Kosakata HSK 2: 还是 (hái shi)"),
                        WordToken("韩国", "Hán guó", "Korea Selatan", "Negara Korea"),
                        WordToken("人", "rén", "Person; people", "Kosakata HSK 2: 人 (rén)")
                    )
                ),
                Sentence(
                    id = "s_whatctry_16",
                    hanzi = "吴小咪：哈哈，我不是留学生，我是中国人。",
                    pinyin = "Wú Xiǎo mī hā hā wǒ bù shì liú xué shēng wǒ shì Zhōng guó rén",
                    translation = "Da Long: Iya, sangat ramai.",
                    tokens = listOf(
                        WordToken("吴小咪", "Wú Xiǎo mī", "A name", "Kosakata HSK 2: 吴小咪 (Wú Xiǎo mī)"),
                        WordToken("哈哈", "hā hā", "(onom.) laughing out loud", "Kosakata HSK 2: 哈哈 (hā hā)"),
                        WordToken("我", "wǒ", "Saya", "Kata ganti orang pertama tunggal"),
                        WordToken("不是", "bù shì", "Is not", "Kosakata HSK 2: 不是 (bù shì)"),
                        WordToken("留学生", "liú xué shēng", "Student studying abroad; returned student; foreign student; international student", "Kosakata HSK 2: 留学生 (liú xué shēng)"),
                        WordToken("我", "wǒ", "Saya", "Kata ganti orang pertama tunggal"),
                        WordToken("是", "shì", "Adalah", "Kopula penjelas"),
                        WordToken("中国", "Zhōng guó", "China / Tiongkok", "Negara Tiongkok"),
                        WordToken("人", "rén", "Person; people", "Kosakata HSK 2: 人 (rén)")
                    )
                ),
                Sentence(
                    id = "s_whatctry_17",
                    hanzi = "铃美：你好！",
                    pinyin = "Líng měi nǐ hǎo",
                    translation = "Apakah kamu suka makanan Tiongkok di sini?",
                    tokens = listOf(
                        WordToken("铃美", "Líng měi", "Suzumi (a name)", "Kosakata HSK 2: 铃美 (Líng měi)"),
                        WordToken("你好", "nǐ hǎo", "Hello; hi", "Kosakata HSK 2: 你好 (nǐ hǎo)")
                    )
                ),
                Sentence(
                    id = "s_whatctry_18",
                    hanzi = "我叫铃美，来自日本。",
                    pinyin = "wǒ jiào Líng měi lái zì Rì běn",
                    translation = "Lingmei: Sangat suka, terutama pangsit rebus dan mie tarik.",
                    tokens = listOf(
                        WordToken("我", "wǒ", "Saya", "Kata ganti orang pertama tunggal"),
                        WordToken("叫", "jiào", "Memanggil / Bernama", "Menyebutkan nama"),
                        WordToken("铃美", "Líng měi", "Suzumi (a name)", "Kosakata HSK 2: 铃美 (Líng měi)"),
                        WordToken("来自", "lái zì", "To come from (a place)", "Kosakata HSK 2: 来自 (lái zì)"),
                        WordToken("日本", "Rì běn", "Japan", "Kosakata HSK 2: 日本 (Rì běn)")
                    )
                ),
                Sentence(
                    id = "s_whatctry_19",
                    hanzi = "他是大龙，美国人。",
                    pinyin = "tā shì Dà lóng Měi guó rén",
                    translation = "Da Long: Saya juga sangat suka pangsit!",
                    tokens = listOf(
                        WordToken("他", "tā", "Dia (laki-laki)", "Kata ganti orang ketiga tunggal"),
                        WordToken("是", "shì", "Adalah", "Kopula penjelas"),
                        WordToken("大龙", "Dà lóng", "A name", "Kosakata HSK 2: 大龙 (Dà lóng)"),
                        WordToken("美国", "Měi guó", "Amerika Serikat", "Negara USA"),
                        WordToken("人", "rén", "Person; people", "Kosakata HSK 2: 人 (rén)")
                    )
                ),
                Sentence(
                    id = "s_whatctry_20",
                    hanzi = "苏南：你好！",
                    pinyin = "Sūn án nǐ hǎo",
                    translation = "Senang sekali bisa berkenalan denganmu, Lingmei.",
                    tokens = listOf(
                        WordToken("苏南", "Sūn án", "Southern jiangsu; the southern part of jiangsu province, china", "Kosakata HSK 2: 苏南 (Sūn án)"),
                        WordToken("你好", "nǐ hǎo", "Hello; hi", "Kosakata HSK 2: 你好 (nǐ hǎo)")
                    )
                ),
                Sentence(
                    id = "s_whatctry_21",
                    hanzi = "我叫苏南，我是泰国人。",
                    pinyin = "wǒ jiào Sūn án wǒ shì Tài guó rén",
                    translation = "Lingmei: Saya juga sangat senang berkenalan denganmu, Da Long.",
                    tokens = listOf(
                        WordToken("我", "wǒ", "Saya", "Kata ganti orang pertama tunggal"),
                        WordToken("叫", "jiào", "Memanggil / Bernama", "Menyebutkan nama"),
                        WordToken("苏南", "Sūn án", "Southern jiangsu; the southern part of jiangsu province, china", "Kosakata HSK 2: 苏南 (Sūn án)"),
                        WordToken("我", "wǒ", "Saya", "Kata ganti orang pertama tunggal"),
                        WordToken("是", "shì", "Adalah", "Kopula penjelas"),
                        WordToken("泰国", "Tài guó", "Thailand", "Negara Thailand"),
                        WordToken("人", "rén", "Person; people", "Kosakata HSK 2: 人 (rén)")
                    )
                ),
                Sentence(
                    id = "s_whatctry_22",
                    hanzi = "很高兴认识你。",
                    pinyin = "hěn gāo xìng rèn shi nǐ",
                    translation = "Da Long: Sampai jumpa di kelas besok!",
                    tokens = listOf(
                        WordToken("很", "hěn", "Sangat", "Tingkat derajat"),
                        WordToken("高兴", "gāo xìng", "Senang / Gembira", "Perasaan ceria bahagia"),
                        WordToken("认识", "rèn shi", "Mengenal", "Mengetahui seseorang secara akrab"),
                        WordToken("你", "nǐ", "Kamu", "Kata ganti orang kedua tunggal")
                    )
                ),
                Sentence(
                    id = "s_whatctry_23",
                    hanzi = "吴小咪：认识你们我也很高兴！",
                    pinyin = "Wú Xiǎo mī rèn shi nǐ men wǒ yě hěn gāo xìng",
                    translation = "Lingmei: Sampai jumpa!",
                    tokens = listOf(
                        WordToken("吴小咪", "Wú Xiǎo mī", "A name", "Kosakata HSK 2: 吴小咪 (Wú Xiǎo mī)"),
                        WordToken("认识", "rèn shi", "Mengenal", "Mengetahui seseorang secara akrab"),
                        WordToken("你们", "nǐ men", "You (plural)", "Kosakata HSK 2: 你们 (nǐ men)"),
                        WordToken("我", "wǒ", "Saya", "Kata ganti orang pertama tunggal"),
                        WordToken("也", "yě", "Juga / Pun", "Partikel penanda kesamaan"),
                        WordToken("很", "hěn", "Sangat", "Tingkat derajat"),
                        WordToken("高兴", "gāo xìng", "Senang / Gembira", "Perasaan ceria bahagia")
                    )
                )
            ),
            questions = listOf(
                StoryQuestion(
                    id = "q_whatctry_1",
                    questionText = "这句话常用于什么场合？ (Kapan kalimat pertanyaan '你是哪国人？' lazim digunakan?)",
                    options = listOf("买东西结账 (Saat membayar di kasir belanja)", "认识新外国朋友互相介绍 (Saat berkenalan dengan teman baru lintas negara)", "看医生问诊 (Saat berkonsultasi ke dokter)", "借书登记 (Saat mendaftar pinjam buku)"),
                    correctAnswerIndex = 1,
                    explanation = "Kalimat sapaan dasar untuk menanyakan kewarganegaraan atau asal negeri lawan bicara."
                ),
                StoryQuestion(
                    id = "q_whatctry_2",
                    questionText = "回答“我是中国人”时，“中国”指什么？ (Pada jawaban '我是中国人', kata '中国' mengacu pada apa?)",
                    options = listOf("城市 (Nama kota)", "国家 (Nama negara Tiongkok)", "职业 (Profesi)", "食物 (Nama makanan)"),
                    correctAnswerIndex = 1,
                    explanation = "中国 (Zhōngguó) adalah nama negara Tiongkok."
                ),
                StoryQuestion(
                    id = "q_whatctry_3",
                    questionText = "如果对方来自法国，他会怎么回答？ (Jika lawan bicara berasal dari Prancis, bagaimana ia menjawab?)",
                    options = listOf("我是英国人 (Saya orang Inggris)", "我是法国人 (Saya orang Prancis)", "我是韩国人 (Saya orang Korea)", "我是美国人 (Saya orang Amerika)"),
                    correctAnswerIndex = 1,
                    explanation = "Orang Prancis dalam bahasa Mandarin disebut '法国人' (Fǎguó rén)."
                ),
                StoryQuestion(
                    id = "q_whatctry_4",
                    questionText = "在这段对话中，大家学习汉语的共同心愿是什么？ (Apa kesamaan harapan para mahasiswa di asrama?)",
                    options = listOf("一起学好中文，增进跨文化友谊 (Bersama menguasai Mandarin dan mempererat persahabatan)", "比赛谁跑得快 (Lomba lari cepat)", "一起做生意赚钱 (Berdagang mencari uang)", "回国不联系 (Pulang dan putus kontak)"),
                    correctAnswerIndex = 0,
                    explanation = "Semangat kebersamaan belajar bahasa Mandarin menyatukan mereka dari berbagai latar belakang."
                )
            )
        ),
        // Cerita Mandarin Bean 87 (HSK 2): Get a Table at a Restaurant (Menunggu Meja di Restoran)
        Story(
            id = "story_get_a_table_restaurant",
            titleHanzi = "餐厅等位",
            titlePinyin = "Cāntīng Děng Wèi",
            titleTranslation = "Get a Table at a Restaurant (Menunggu Meja di Restoran)",
            level = "HSK 2",
            category = "Restoran & Pelayanan",
            description = "Pengalaman memesan meja dan mengantre di restoran populer yang ramai dikunjungi pelanggan.",
            coverEmoji = "🍽️",
            coverImageRes = R.drawable.cover_story_get_a_table_restaurant,
            estimatedReadMinutes = 2,
            sentences = listOf(
                Sentence(
                    id = "s_gettable_1",
                    hanzi = "对话（1）",
                    pinyin = "duì huà",
                    translation = "Percakapan (1)",
                    tokens = listOf(
                        WordToken("对话", "duì huà", "Dialogue; conversation", "Kosakata HSK 2: 对话 (duì huà)")
                    )
                ),
                Sentence(
                    id = "s_gettable_2",
                    hanzi = "服务员：欢迎光临。",
                    pinyin = "fú wù yuán huān yíng guāng lín",
                    translation = "Pelayan: Selamat datang.",
                    tokens = listOf(
                        WordToken("服务员", "fú wù yuán", "Pelayan", "Staf restoran atau toko"),
                        WordToken("欢迎", "huān yíng", "Welcome", "Kosakata HSK 2: 欢迎 (huān yíng)"),
                        WordToken("光临", "guāng lín", "(formal) to honor with one&#x27;s presence", "Kosakata HSK 2: 光临 (guāng lín)")
                    )
                ),
                Sentence(
                    id = "s_gettable_3",
                    hanzi = "顾客：我们昨天打电话预订了一个十人桌。",
                    pinyin = "gù kè wǒ men zuó tiān dǎ diàn huà yù dìng le yī gè shí rén zhuō",
                    translation = "Pelanggan: Kemarin kami menelepon memesan meja untuk sepuluh orang.",
                    tokens = listOf(
                        WordToken("顾客", "gù kè", "Customer; client", "Kosakata HSK 2: 顾客 (gù kè)"),
                        WordToken("我们", "wǒ men", "Kami / Kita", "Kata ganti orang pertama jamak"),
                        WordToken("昨天", "zuó tiān", "Kemarin", "Keterangan waktu lampau"),
                        WordToken("打", "dǎ", "Memukul / Mengetik / Melakukan", "Kata kerja umum beragam makna"),
                        WordToken("电话", "diàn huà", "Telephone", "Kosakata HSK 2: 电话 (diàn huà)"),
                        WordToken("预订", "yù dìng", "To place an order", "Kosakata HSK 2: 预订 (yù dìng)"),
                        WordToken("了", "le", "Sudah (partikel perubahan situasi)", "Partikel aspek selesainya tindakan"),
                        WordToken("一", "yī", "One", "Kosakata HSK 2: 一 (yī)"),
                        WordToken("个", "gè", "Classifier for people or objects in general", "Kosakata HSK 2: 个 (gè)"),
                        WordToken("十", "shí", "Ten", "Kosakata HSK 2: 十 (shí)"),
                        WordToken("人", "rén", "Person; people", "Kosakata HSK 2: 人 (rén)"),
                        WordToken("桌", "zhuō", "Table", "Kosakata HSK 2: 桌 (zhuō)")
                    )
                ),
                Sentence(
                    id = "s_gettable_4",
                    hanzi = "服务员：请问预订手机号是哪个？",
                    pinyin = "fú wù yuán qǐng wèn yù dìng shǒu jī hào shì nǎ gè",
                    translation = "Pelayan: Permisi, nomor ponsel pemesanannya yang mana?",
                    tokens = listOf(
                        WordToken("服务员", "fú wù yuán", "Pelayan", "Staf restoran atau toko"),
                        WordToken("请问", "qǐng wèn", "Excuse me, may i ask...?", "Kosakata HSK 2: 请问 (qǐng wèn)"),
                        WordToken("预订", "yù dìng", "To place an order", "Kosakata HSK 2: 预订 (yù dìng)"),
                        WordToken("手机", "shǒu jī", "Cell phone; mobile phone", "Kosakata HSK 2: 手机 (shǒu jī)"),
                        WordToken("号", "hào", "(bound form) bugle; trumpet", "Kosakata HSK 2: 号 (hào)"),
                        WordToken("是", "shì", "Adalah", "Kopula penjelas"),
                        WordToken("哪", "nǎ", "Which", "Kosakata HSK 2: 哪 (nǎ)"),
                        WordToken("个", "gè", "Classifier for people or objects in general", "Kosakata HSK 2: 个 (gè)")
                    )
                ),
                Sentence(
                    id = "s_gettable_5",
                    hanzi = "顾客：13950647983。",
                    pinyin = "gù kè",
                    translation = "Pelanggan: 13950647983.",
                    tokens = listOf(
                        WordToken("顾客", "gù kè", "Customer; client", "Kosakata HSK 2: 顾客 (gù kè)")
                    )
                ),
                Sentence(
                    id = "s_gettable_6",
                    hanzi = "服务员：没问题，给您准备的是6号包间。",
                    pinyin = "fú wù yuán méi wèn tí gěi nín zhǔn bèi de shì hào bāo jiān",
                    translation = "Pelayan: Baik tidak masalah, yang disiapkan untuk Anda adalah ruang VIP nomor 6.",
                    tokens = listOf(
                        WordToken("服务员", "fú wù yuán", "Pelayan", "Staf restoran atau toko"),
                        WordToken("没", "méi", "Belum / Tidak", "Kata sangkalan untuk keberadaan atau masa lampau"),
                        WordToken("问题", "wèn tí", "Question", "Kosakata HSK 2: 问题 (wèn tí)"),
                        WordToken("给", "gěi", "Memberi / Kepada", "Tindakan memberi atau preposisi sasaran"),
                        WordToken("您", "nín", "Anda", "Bentuk hormat / sopan untuk kamu"),
                        WordToken("准备", "zhǔn bèi", "To prepare", "Kosakata HSK 2: 准备 (zhǔn bèi)"),
                        WordToken("的", "de", "Punya / Yang (partikel posesif)", "Partikel penjelas modifikasi atau kepemilikan"),
                        WordToken("是", "shì", "Adalah", "Kopula penjelas"),
                        WordToken("号", "hào", "(bound form) bugle; trumpet", "Kosakata HSK 2: 号 (hào)"),
                        WordToken("包间", "bāo jiān", "Private room (in a restaurant, or for karaoke etc)", "Kosakata HSK 2: 包间 (bāo jiān)")
                    )
                ),
                Sentence(
                    id = "s_gettable_7",
                    hanzi = "请这边走。",
                    pinyin = "qǐng zhè biān zǒu",
                    translation = "Silakan ikuti saya lewat sini.",
                    tokens = listOf(
                        WordToken("请", "qǐng", "Silakan / Mengundang", "Bentuk kesopanan"),
                        WordToken("这边", "zhè biān", "This side", "Kosakata HSK 2: 这边 (zhè biān)"),
                        WordToken("走", "zǒu", "To walk", "Kosakata HSK 2: 走 (zǒu)")
                    )
                ),
                Sentence(
                    id = "s_gettable_8",
                    hanzi = "对话（2）",
                    pinyin = "duì huà",
                    translation = "Pelanggan: Terima kasih.",
                    tokens = listOf(
                        WordToken("对话", "duì huà", "Dialogue; conversation", "Kosakata HSK 2: 对话 (duì huà)")
                    )
                ),
                Sentence(
                    id = "s_gettable_9",
                    hanzi = "服务员：您好，请问有预订吗？",
                    pinyin = "fú wù yuán nín hǎo qǐng wèn yǒu yù dìng ma",
                    translation = "Percakapan (2)",
                    tokens = listOf(
                        WordToken("服务员", "fú wù yuán", "Pelayan", "Staf restoran atau toko"),
                        WordToken("您好", "nín hǎo", "Hello (polite)", "Kosakata HSK 2: 您好 (nín hǎo)"),
                        WordToken("请问", "qǐng wèn", "Excuse me, may i ask...?", "Kosakata HSK 2: 请问 (qǐng wèn)"),
                        WordToken("有", "yǒu", "Mempunyai / Ada", "Menyatakan kepemilikan atau eksistensi"),
                        WordToken("预订", "yù dìng", "To place an order", "Kosakata HSK 2: 预订 (yù dìng)"),
                        WordToken("吗", "ma", "Apakah (partikel tanya)", "Partikel di akhir kalimat interogatif ya/tidak")
                    )
                ),
                Sentence(
                    id = "s_gettable_10",
                    hanzi = "顾客：没有预订。",
                    pinyin = "gù kè méi yǒu yù dìng",
                    translation = "Pelayan: Selamat datang, berapa orang rombongan Anda?",
                    tokens = listOf(
                        WordToken("顾客", "gù kè", "Customer; client", "Kosakata HSK 2: 顾客 (gù kè)"),
                        WordToken("没有", "méi yǒu", "Tidak ada / Tidak punya", "Bentuk negasi dari 有"),
                        WordToken("预订", "yù dìng", "To place an order", "Kosakata HSK 2: 预订 (yù dìng)")
                    )
                ),
                Sentence(
                    id = "s_gettable_11",
                    hanzi = "还有位置吗？",
                    pinyin = "hái yǒu wèi zhì ma",
                    translation = "Pelanggan: Kami ada empat orang.",
                    tokens = listOf(
                        WordToken("还", "hái", "Masih / Malahan", "Menyatakan kelanjutan situasi"),
                        WordToken("有", "yǒu", "Mempunyai / Ada", "Menyatakan kepemilikan atau eksistensi"),
                        WordToken("位置", "wèi zhì", "Position", "Kosakata HSK 2: 位置 (wèi zhì)"),
                        WordToken("吗", "ma", "Apakah (partikel tanya)", "Partikel di akhir kalimat interogatif ya/tidak")
                    )
                ),
                Sentence(
                    id = "s_gettable_12",
                    hanzi = "服务员：几位？",
                    pinyin = "fú wù yuán jǐ wèi",
                    translation = "Pelayan: Mohon maaf sekali, sekarang meja di dalam sudah penuh semua.",
                    tokens = listOf(
                        WordToken("服务员", "fú wù yuán", "Pelayan", "Staf restoran atau toko"),
                        WordToken("几", "jǐ", "How much", "Kosakata HSK 2: 几 (jǐ)"),
                        WordToken("位", "wèi", "Classifier for people (honorific)", "Kosakata HSK 2: 位 (wèi)")
                    )
                ),
                Sentence(
                    id = "s_gettable_13",
                    hanzi = "顾客：三位。",
                    pinyin = "gù kè sān wèi",
                    translation = "Apakah Anda bersedia menunggu antrean?",
                    tokens = listOf(
                        WordToken("顾客", "gù kè", "Customer; client", "Kosakata HSK 2: 顾客 (gù kè)"),
                        WordToken("三", "sān", "Three", "Kosakata HSK 2: 三 (sān)"),
                        WordToken("位", "wèi", "Classifier for people (honorific)", "Kosakata HSK 2: 位 (wèi)")
                    )
                ),
                Sentence(
                    id = "s_gettable_14",
                    hanzi = "服务员：有的，这边请。",
                    pinyin = "fú wù yuán yǒu de zhè biān qǐng",
                    translation = "Pelanggan: Berapa lama kira-kira harus menunggu?",
                    tokens = listOf(
                        WordToken("服务员", "fú wù yuán", "Pelayan", "Staf restoran atau toko"),
                        WordToken("有", "yǒu", "Mempunyai / Ada", "Menyatakan kepemilikan atau eksistensi"),
                        WordToken("的", "de", "Punya / Yang (partikel posesif)", "Partikel penjelas modifikasi atau kepemilikan"),
                        WordToken("这边", "zhè biān", "This side", "Kosakata HSK 2: 这边 (zhè biān)"),
                        WordToken("请", "qǐng", "Silakan / Mengundang", "Bentuk kesopanan")
                    )
                ),
                Sentence(
                    id = "s_gettable_15",
                    hanzi = "对话（3）",
                    pinyin = "duì huà",
                    translation = "Pelayan: Sekitar dua puluh menit.",
                    tokens = listOf(
                        WordToken("对话", "duì huà", "Dialogue; conversation", "Kosakata HSK 2: 对话 (duì huà)")
                    )
                ),
                Sentence(
                    id = "s_gettable_16",
                    hanzi = "顾客A：坐哪儿？",
                    pinyin = "gù kè zuò nǎ r",
                    translation = "Pelanggan: Baik, kami akan menunggu.",
                    tokens = listOf(
                        WordToken("顾客", "gù kè", "Customer; client", "Kosakata HSK 2: 顾客 (gù kè)"),
                        WordToken("坐", "zuò", "Duduk / Naik (kendaraan)", "Posisi duduk atau naik angkutan"),
                        WordToken("哪儿", "nǎ r", "Di mana", "Kata tanya tempat")
                    )
                ),
                Sentence(
                    id = "s_gettable_17",
                    hanzi = "顾客B：坐这儿吧。",
                    pinyin = "gù kè zuò zhè r ba",
                    translation = "Pelayan: Ini nomor antrean Anda, nomor 25.",
                    tokens = listOf(
                        WordToken("顾客", "gù kè", "Customer; client", "Kosakata HSK 2: 顾客 (gù kè)"),
                        WordToken("坐", "zuò", "Duduk / Naik (kendaraan)", "Posisi duduk atau naik angkutan"),
                        WordToken("这儿", "zhè r", "Sini", "Kata tunjuk tempat dekat"),
                        WordToken("吧", "ba", "Kan / Mari (partikel saran)", "Partikel saran, ajakan, atau dugaan")
                    )
                ),
                Sentence(
                    id = "s_gettable_18",
                    hanzi = "顾客A：这里离空调太近了，我们坐里面吧，风小一些。",
                    pinyin = "gù kè zhè lǐ lí kōng tiáo tài jìn le wǒ men zuò lǐ miàn ba fēng xiǎo yī xiē",
                    translation = "Silakan duduk di area tunggu dan menikmati teh gratis.",
                    tokens = listOf(
                        WordToken("顾客", "gù kè", "Customer; client", "Kosakata HSK 2: 顾客 (gù kè)"),
                        WordToken("这里", "zhè lǐ", "Here", "Kosakata HSK 2: 这里 (zhè lǐ)"),
                        WordToken("离", "lí", "(in giving distances) from", "Kosakata HSK 2: 离 (lí)"),
                        WordToken("空调", "kōng tiáo", "Air conditioning", "Kosakata HSK 2: 空调 (kōng tiáo)"),
                        WordToken("太", "tài", "Terlalu", "Derajat melampaui batas"),
                        WordToken("近", "jìn", "Dekat", "Jarak dekat"),
                        WordToken("了", "le", "Sudah (partikel perubahan situasi)", "Partikel aspek selesainya tindakan"),
                        WordToken("我们", "wǒ men", "Kami / Kita", "Kata ganti orang pertama jamak"),
                        WordToken("坐", "zuò", "Duduk / Naik (kendaraan)", "Posisi duduk atau naik angkutan"),
                        WordToken("里面", "lǐ miàn", "Inside", "Kosakata HSK 2: 里面 (lǐ miàn)"),
                        WordToken("吧", "ba", "Kan / Mari (partikel saran)", "Partikel saran, ajakan, atau dugaan"),
                        WordToken("风", "fēng", "Wind", "Kosakata HSK 2: 风 (fēng)"),
                        WordToken("小", "xiǎo", "Kecil", "Ukuran fisik kecil"),
                        WordToken("一些", "yī xiē", "Some; a few; a little; (following an adjective) slightly ...er", "Kosakata HSK 2: 一些 (yī xiē)")
                    )
                ),
                Sentence(
                    id = "s_gettable_19",
                    hanzi = "顾客B：好的。",
                    pinyin = "gù kè hǎo de",
                    translation = "Pelanggan: Baik, terima kasih banyak.",
                    tokens = listOf(
                        WordToken("顾客", "gù kè", "Customer; client", "Kosakata HSK 2: 顾客 (gù kè)"),
                        WordToken("好的", "hǎo de", "Okay; all right; got it", "Kosakata HSK 2: 好的 (hǎo de)")
                    )
                )
            ),
            questions = listOf(
                StoryQuestion(
                    id = "q_gettable_1",
                    questionText = "为什么顾客需要在餐厅等位？ (Mengapa pelanggan harus menunggu antrean meja di restoran?)",
                    options = listOf("因为餐厅人很多，座位坐满了 (Karena restoran sangat ramai dan seluruh meja penuh)", "因为厨师没来 (Karena koki belum datang)", "因为菜还没买 (Karena bahan makanan belum dibeli)", "因为停电了 (Karena mati listrik)"),
                    correctAnswerIndex = 0,
                    explanation = "Teks menggambarkan restoran favorit yang dipadati tamu di jam makan."
                ),
                StoryQuestion(
                    id = "q_gettable_2",
                    questionText = "服务员问了顾客什么重要信息？ (Informasi apa yang ditanyakan pelayan kepada pelanggan?)",
                    options = listOf("请问几位？ (Berapa orang yang datang?)", "你喜欢什么颜色？ (Warna apa yang disukai?)", "你叫什么名字？ (Siapa nama lengkapmu?)", "你在哪儿上班？ (Di mana tempat kerjamu?)"),
                    correctAnswerIndex = 0,
                    explanation = "Pertanyaan standar pelayan restoran adalah menanyakan jumlah rombongan tamu ('几位')."
                ),
                StoryQuestion(
                    id = "q_gettable_3",
                    questionText = "顾客一行共有几个人？ (Berapa orang dalam rombongan pelanggan?)",
                    options = listOf("一位 (1 orang)", "两位 (2 orang)", "四位 (4 orang)", "十位 (10 orang)"),
                    correctAnswerIndex = 1,
                    explanation = "Rombongan terdiri dari 2 orang yang ingin bersantap bersama."
                ),
                StoryQuestion(
                    id = "q_gettable_4",
                    questionText = "等待时餐厅通常会提供什么贴心服务？ (Pelayanan ramah apa yang kerap disajikan restoran saat antre?)",
                    options = listOf("免费茶水和小零食 (Air teh gratis dan camilan ringan)", "让人洗衣服 (Menyuruh mencuci baju)", "收费停车费 (Menarik biaya parkir mahal)", "让客人离开 (Menyuruh tamu pergi)"),
                    correctAnswerIndex = 0,
                    explanation = "Restoran modern menyuguhkan teh hangat atau kudapan gratis untuk kenyamanan tamu menunggu."
                )
            )
        ),
        // Cerita Mandarin Bean 88 (HSK 2): Drunk (Mabuk)
        Story(
            id = "story_drunk",
            titleHanzi = "醉了",
            titlePinyin = "Zuì Le",
            titleTranslation = "Drunk (Mabuk)",
            level = "HSK 2",
            category = "Humor & Hiburan",
            description = "Kisah lucu menggelikan saat seseorang minum bir berlebihan hingga salah mengenali bayangannya sendiri.",
            coverEmoji = "🍷",
            coverImageRes = R.drawable.cover_story_drunk,
            estimatedReadMinutes = 2,
            sentences = listOf(
                Sentence(
                    id = "s_drunk_1",
                    hanzi = "一天，和朋友吃完饭的爸爸回家后，他看见孩子正在学习写字，非常高兴。",
                    pinyin = "yī tiān hé péng you chī wán fàn de bà ba huí jiā hòu tā kàn jiàn hái zi zhèng zài xué xí xiě zì fēi cháng gāo xìng",
                    translation = "Suatu hari, setelah selesai makan bersama teman-temannya ayah pulang ke rumah, dia melihat sang anak sedang belajar menulis karakter dan merasa sangat senang.",
                    tokens = listOf(
                        WordToken("一", "yī", "One", "Kosakata HSK 2: 一 (yī)"),
                        WordToken("天", "tiān", "Hari", "Satuan hari"),
                        WordToken("和", "hé", "Dan", "Kata hubung setara"),
                        WordToken("朋友", "péng you", "Teman / Sahabat", "Orang dekat"),
                        WordToken("吃", "chī", "Makan", "Aktivitas mengonsumsi makanan"),
                        WordToken("完", "wán", "To finish", "Kosakata HSK 2: 完 (wán)"),
                        WordToken("饭", "fàn", "Nasi / Makanan", "Makanan pokok"),
                        WordToken("的", "de", "Punya / Yang (partikel posesif)", "Partikel penjelas modifikasi atau kepemilikan"),
                        WordToken("爸爸", "bà ba", "Ayah", "Anggota keluarga"),
                        WordToken("回", "huí", "Kembali / Pulang", "Menuju ke tempat asal"),
                        WordToken("家", "jiā", "Rumah / Keluarga", "Tempat tinggal"),
                        WordToken("后", "hòu", "Afterwards", "Kosakata HSK 2: 后 (hòu)"),
                        WordToken("他", "tā", "Dia (laki-laki)", "Kata ganti orang ketiga tunggal"),
                        WordToken("看见", "kàn jiàn", "To see; to catch sight of", "Kosakata HSK 2: 看见 (kàn jiàn)"),
                        WordToken("孩子", "hái zi", "Child", "Kosakata HSK 2: 孩子 (hái zi)"),
                        WordToken("正在", "zhèng zài", "To be in the process of (doing sth); to be currently ...-ing", "Kosakata HSK 2: 正在 (zhèng zài)"),
                        WordToken("学习", "xué xí", "Belajar / Studi", "Proses menuntut ilmu"),
                        WordToken("写", "xiě", "To write", "Kosakata HSK 2: 写 (xiě)"),
                        WordToken("字", "zì", "Letter", "Kosakata HSK 2: 字 (zì)"),
                        WordToken("非常", "fēi cháng", "Sangat / Amat", "Tingkat intensitas tinggi"),
                        WordToken("高兴", "gāo xìng", "Senang / Gembira", "Perasaan ceria bahagia")
                    )
                ),
                Sentence(
                    id = "s_drunk_2",
                    hanzi = "他问孩子：“你在学什么字？”",
                    pinyin = "tā wèn hái zi nǐ zài xué shén me zì",
                    translation = "Ayah bertanya kepada anak: “Karakter apa yang sedang kamu pelajari?”",
                    tokens = listOf(
                        WordToken("他", "tā", "Dia (laki-laki)", "Kata ganti orang ketiga tunggal"),
                        WordToken("问", "wèn", "To ask; to inquire", "Kosakata HSK 2: 问 (wèn)"),
                        WordToken("孩子", "hái zi", "Child", "Kosakata HSK 2: 孩子 (hái zi)"),
                        WordToken("你", "nǐ", "Kamu", "Kata ganti orang kedua tunggal"),
                        WordToken("在", "zài", "Di / Berada di", "Preposisi lokasi atau aspek progresif"),
                        WordToken("学", "xué", "Belajar", "Menuntut ilmu"),
                        WordToken("什么", "shén me", "What?", "Kosakata HSK 2: 什么 (shén me)"),
                        WordToken("字", "zì", "Letter", "Kosakata HSK 2: 字 (zì)")
                    )
                ),
                Sentence(
                    id = "s_drunk_3",
                    hanzi = "孩子说：“这个‘醉’是什么意思？”",
                    pinyin = "hái zi shuō zhè gè zuì shì shén me yì si",
                    translation = "Anak menjawab: “Apa arti karakter ‘醉’ (mabuk) ini?”",
                    tokens = listOf(
                        WordToken("孩子", "hái zi", "Child", "Kosakata HSK 2: 孩子 (hái zi)"),
                        WordToken("说", "shuō", "Berbicara / Berkata", "Menyampaikan ucapan"),
                        WordToken("这", "zhè", "This; these", "Kosakata HSK 2: 这 (zhè)"),
                        WordToken("个", "gè", "Classifier for people or objects in general", "Kosakata HSK 2: 个 (gè)"),
                        WordToken("醉", "zuì", "Intoxicated", "Kosakata HSK 2: 醉 (zuì)"),
                        WordToken("是", "shì", "Adalah", "Kopula penjelas"),
                        WordToken("什么", "shén me", "What?", "Kosakata HSK 2: 什么 (shén me)"),
                        WordToken("意思", "yì si", "Idea", "Kosakata HSK 2: 意思 (yì si)")
                    )
                ),
                Sentence(
                    id = "s_drunk_4",
                    hanzi = "爸爸说：“你看，这里有两个杯子。",
                    pinyin = "bà ba shuō nǐ kàn zhè lǐ yǒu liǎng gè bēi zi",
                    translation = "Ayah berkata: “Coba lihat, di sini ada dua cangkir.”",
                    tokens = listOf(
                        WordToken("爸爸", "bà ba", "Ayah", "Anggota keluarga"),
                        WordToken("说", "shuō", "Berbicara / Berkata", "Menyampaikan ucapan"),
                        WordToken("你", "nǐ", "Kamu", "Kata ganti orang kedua tunggal"),
                        WordToken("看", "kàn", "Melihat / Membaca", "Aktivitas visual"),
                        WordToken("这里", "zhè lǐ", "Here", "Kosakata HSK 2: 这里 (zhè lǐ)"),
                        WordToken("有", "yǒu", "Mempunyai / Ada", "Menyatakan kepemilikan atau eksistensi"),
                        WordToken("两", "liǎng", "Two", "Kosakata HSK 2: 两 (liǎng)"),
                        WordToken("个", "gè", "Classifier for people or objects in general", "Kosakata HSK 2: 个 (gè)"),
                        WordToken("杯子", "bēi zi", "Cup", "Kosakata HSK 2: 杯子 (bēi zi)")
                    )
                ),
                Sentence(
                    id = "s_drunk_5",
                    hanzi = "但是如果我说这里有四个杯子，我就喝醉了。”",
                    pinyin = "dàn shì rú guǒ wǒ shuō zhè lǐ yǒu sì gè bēi zi wǒ jiù hē zuì le",
                    translation = "“Tetapi jika Ayah bilang di sini ada empat cangkir, itu artinya Ayah sudah mabuk.”",
                    tokens = listOf(
                        WordToken("但是", "dàn shì", "Tetapi / Namun", "Kata hubung pertentangan"),
                        WordToken("如果", "rú guǒ", "Jika / Seandainya", "Menyatakan pengandaian syarat"),
                        WordToken("我", "wǒ", "Saya", "Kata ganti orang pertama tunggal"),
                        WordToken("说", "shuō", "Berbicara / Berkata", "Menyampaikan ucapan"),
                        WordToken("这里", "zhè lǐ", "Here", "Kosakata HSK 2: 这里 (zhè lǐ)"),
                        WordToken("有", "yǒu", "Mempunyai / Ada", "Menyatakan kepemilikan atau eksistensi"),
                        WordToken("四", "sì", "Four", "Kosakata HSK 2: 四 (sì)"),
                        WordToken("个", "gè", "Classifier for people or objects in general", "Kosakata HSK 2: 个 (gè)"),
                        WordToken("杯子", "bēi zi", "Cup", "Kosakata HSK 2: 杯子 (bēi zi)"),
                        WordToken("我", "wǒ", "Saya", "Kata ganti orang pertama tunggal"),
                        WordToken("就", "jiù", "Langsung / Segera / Maka", "Menyatakan ketepatan waktu atau kelogisan"),
                        WordToken("喝", "hē", "Minum", "Aktivitas mengonsumsi cairan"),
                        WordToken("醉", "zuì", "Intoxicated", "Kosakata HSK 2: 醉 (zuì)"),
                        WordToken("了", "le", "Sudah (partikel perubahan situasi)", "Partikel aspek selesainya tindakan")
                    )
                ),
                Sentence(
                    id = "s_drunk_6",
                    hanzi = "孩子说：“爸爸，这里只有一个杯子呀！”",
                    pinyin = "hái zi shuō bà ba zhè lǐ zhǐ yǒu yī gè bēi zi ya",
                    translation = "Anak berkata: “Ayah, di sini kan hanya ada satu cangkir saja!”",
                    tokens = listOf(
                        WordToken("孩子", "hái zi", "Child", "Kosakata HSK 2: 孩子 (hái zi)"),
                        WordToken("说", "shuō", "Berbicara / Berkata", "Menyampaikan ucapan"),
                        WordToken("爸爸", "bà ba", "Ayah", "Anggota keluarga"),
                        WordToken("这里", "zhè lǐ", "Here", "Kosakata HSK 2: 这里 (zhè lǐ)"),
                        WordToken("只", "zhǐ", "Only; merely; just", "Kosakata HSK 2: 只 (zhǐ)"),
                        WordToken("有", "yǒu", "Mempunyai / Ada", "Menyatakan kepemilikan atau eksistensi"),
                        WordToken("一", "yī", "One", "Kosakata HSK 2: 一 (yī)"),
                        WordToken("个", "gè", "Classifier for people or objects in general", "Kosakata HSK 2: 个 (gè)"),
                        WordToken("杯子", "bēi zi", "Cup", "Kosakata HSK 2: 杯子 (bēi zi)"),
                        WordToken("呀", "ya", "(particle equivalent to 啊 after a vowel, expressing surprise or doubt)", "Kosakata HSK 2: 呀 (ya)")
                    )
                )
            ),
            questions = listOf(
                StoryQuestion(
                    id = "q_drunk_1",
                    questionText = "故事中的主角喝了什么？ (Apa yang diminum tokoh dalam cerita?)",
                    options = listOf("很多果汁 (Banyak jus buah)", "很多啤酒 (Banyak bir)", "热茶 (Teh hangat)", "牛奶 (Susu sapi)"),
                    correctAnswerIndex = 1,
                    explanation = "Tokoh meminum terlalu banyak minuman beralkohol hingga mabuk."
                ),
                StoryQuestion(
                    id = "q_drunk_2",
                    questionText = "主角喝醉后走路感觉怎么样？ (Bagaimana keadaan tokoh saat berjalan setelah mabuk?)",
                    options = listOf("走得很稳很直 (Berjalan sangat tegap dan lurus)", "头重脚轻，摇摇晃晃 (Kepala pusing dan jalan sempoyongan)", "跑得非常快 (Berlari sangat kencang)", "不会走路 (Tidak bisa berjalan)"),
                    correctAnswerIndex = 1,
                    explanation = "Pengaruh alkohol membuat langkah kakinya tidak seimbang."
                ),
                StoryQuestion(
                    id = "q_drunk_3",
                    questionText = "他回家路上发生了什么趣事？ (Kejadian lucu apa yang terjadi di perjalanan pulang?)",
                    options = listOf("把电线杆当成朋友说话 (Mengajak bicara tiang jalan karena dikira temannya)", "把猫抱回了家 (Membawa pulang kucing jalanan)", "丢了钱包 (Kehilangan dompet)", "掉进了水池 (Jatuh ke kolam)"),
                    correctAnswerIndex = 0,
                    explanation = "Tingkah konyol orang yang mabuk berat berinteraksi dengan benda mati."
                ),
                StoryQuestion(
                    id = "q_drunk_4",
                    questionText = "这个故事给我们的健康启示是什么？ (Pesan kesehatan apa yang dapat dipetik?)",
                    options = listOf("要多喝甜饮料 (Perbanyak minum manis)", "饮酒要适量，切勿过量贪杯 (Minumlah dengan bijak dan jangan berlebihan)", "喝醉了继续开车 (Tetap menyetir saat mabuk)", "不吃晚饭 (Jangan makan malam)"),
                    correctAnswerIndex = 1,
                    explanation = "Menjaga batas kewajaran minum demi keselamatan dan kesehatan diri."
                )
            )
        ),
        // Cerita Mandarin Bean 89 (HSK 2): Counting Stars (Menghitung Bintang)
        Story(
            id = "story_counting_stars",
            titleHanzi = "数星星",
            titlePinyin = "Shǔ Xīngxing",
            titleTranslation = "Counting Stars (Menghitung Bintang)",
            level = "HSK 2",
            category = "Pendidikan & Sains",
            description = "Kisah inspiratif Zhang Heng sewaktu kecil yang gemar menatap langit malam dan menghitung bintang.",
            coverEmoji = "✨",
            coverImageRes = R.drawable.cover_story_counting_stars,
            estimatedReadMinutes = 2,
            sentences = listOf(
                Sentence(
                    id = "s_cntstars_1",
                    hanzi = "这天晚上，姐姐一直看着天。",
                    pinyin = "zhè tiān wǎn shang jiě jie yī zhí kàn zhe tiān",
                    translation = "Malam ini, kakak perempuan terus menatap ke langit.",
                    tokens = listOf(
                        WordToken("这", "zhè", "This; these", "Kosakata HSK 2: 这 (zhè)"),
                        WordToken("天", "tiān", "Hari", "Satuan hari"),
                        WordToken("晚上", "wǎn shang", "Malam hari", "Waktu malam"),
                        WordToken("姐姐", "jiě jie", "Kakak perempuan", "Saudari kandung tertua"),
                        WordToken("一直", "yī zhí", "Straight (in a straight line)", "Kosakata HSK 2: 一直 (yī zhí)"),
                        WordToken("看", "kàn", "Melihat / Membaca", "Aktivitas visual"),
                        WordToken("着", "zhe", "Aspect particle indicating action in progress or ongoing state", "Kosakata HSK 2: 着 (zhe)"),
                        WordToken("天", "tiān", "Hari", "Satuan hari")
                    )
                ),
                Sentence(
                    id = "s_cntstars_2",
                    hanzi = "妹妹觉得很奇怪，问：“姐姐，你在做什么？”",
                    pinyin = "mèi mei jué de hěn qí guài wèn jiě jie nǐ zài zuò shén me",
                    translation = "Adik perempuan merasa sangat heran lalu bertanya: “Kakak, apa yang sedang kamu lakukan?”",
                    tokens = listOf(
                        WordToken("妹妹", "mèi mei", "Adik perempuan", "Saudari kandung termuda"),
                        WordToken("觉得", "jué de", "To think that ...; to feel that ...", "Kosakata HSK 2: 觉得 (jué de)"),
                        WordToken("很", "hěn", "Sangat", "Tingkat derajat"),
                        WordToken("奇怪", "qí guài", "Strange", "Kosakata HSK 2: 奇怪 (qí guài)"),
                        WordToken("问", "wèn", "To ask; to inquire", "Kosakata HSK 2: 问 (wèn)"),
                        WordToken("姐姐", "jiě jie", "Kakak perempuan", "Saudari kandung tertua"),
                        WordToken("你", "nǐ", "Kamu", "Kata ganti orang kedua tunggal"),
                        WordToken("在", "zài", "Di / Berada di", "Preposisi lokasi atau aspek progresif"),
                        WordToken("做", "zuò", "Membuat / Mengerjakan", "Aktivitas kerja"),
                        WordToken("什么", "shén me", "What?", "Kosakata HSK 2: 什么 (shén me)")
                    )
                ),
                Sentence(
                    id = "s_cntstars_3",
                    hanzi = "姐姐回答说：“今天晚上有很多星星，我在数星星。”",
                    pinyin = "jiě jie huí dá shuō jīn tiān wǎn shang yǒu hěn duō xīng xing wǒ zài shǔ xīng xing",
                    translation = "Kakak menjawab: “Malam ini ada banyak sekali bintang, aku sedang menghitung bintang.”",
                    tokens = listOf(
                        WordToken("姐姐", "jiě jie", "Kakak perempuan", "Saudari kandung tertua"),
                        WordToken("回答", "huí dá", "To reply; to answer", "Kosakata HSK 2: 回答 (huí dá)"),
                        WordToken("说", "shuō", "Berbicara / Berkata", "Menyampaikan ucapan"),
                        WordToken("今天", "jīn tiān", "Hari ini", "Keterangan waktu sekarang"),
                        WordToken("晚上", "wǎn shang", "Malam hari", "Waktu malam"),
                        WordToken("有", "yǒu", "Mempunyai / Ada", "Menyatakan kepemilikan atau eksistensi"),
                        WordToken("很多", "hěn duō", "Many; a lot of", "Kosakata HSK 2: 很多 (hěn duō)"),
                        WordToken("星星", "xīng xing", "(coll.) a star; the stars in the sky", "Kosakata HSK 2: 星星 (xīng xing)"),
                        WordToken("我", "wǒ", "Saya", "Kata ganti orang pertama tunggal"),
                        WordToken("在", "zài", "Di / Berada di", "Preposisi lokasi atau aspek progresif"),
                        WordToken("数", "shǔ", "To count", "Kosakata HSK 2: 数 (shǔ)"),
                        WordToken("星星", "xīng xing", "(coll.) a star; the stars in the sky", "Kosakata HSK 2: 星星 (xīng xing)")
                    )
                ),
                Sentence(
                    id = "s_cntstars_4",
                    hanzi = "妹妹说：“晚上太黑了，你为什么不明天早上再数呢？",
                    pinyin = "mèi mei shuō wǎn shang tài hēi le nǐ wèi shén me bù míng tiān zǎo shang zài shǔ ne",
                    translation = "Adik berkata: “Malam hari terlalu gelap gulita, kenapa tidak dihitung besok pagi saja?”",
                    tokens = listOf(
                        WordToken("妹妹", "mèi mei", "Adik perempuan", "Saudari kandung termuda"),
                        WordToken("说", "shuō", "Berbicara / Berkata", "Menyampaikan ucapan"),
                        WordToken("晚上", "wǎn shang", "Malam hari", "Waktu malam"),
                        WordToken("太", "tài", "Terlalu", "Derajat melampaui batas"),
                        WordToken("黑", "hēi", "Black", "Kosakata HSK 2: 黑 (hēi)"),
                        WordToken("了", "le", "Sudah (partikel perubahan situasi)", "Partikel aspek selesainya tindakan"),
                        WordToken("你", "nǐ", "Kamu", "Kata ganti orang kedua tunggal"),
                        WordToken("为什么", "wèi shén me", "Why?", "Kosakata HSK 2: 为什么 (wèi shén me)"),
                        WordToken("不", "bù", "Tidak", "Kata sangkalan untuk masa kini atau masa depan"),
                        WordToken("明天", "míng tiān", "Besok", "Keterangan waktu mendatang"),
                        WordToken("早上", "zǎo shang", "Pagi hari", "Waktu fajar hingga pagi"),
                        WordToken("再", "zài", "Lagi / Sekali lagi", "Pengulangan tindakan mendatang"),
                        WordToken("数", "shǔ", "To count", "Kosakata HSK 2: 数 (shǔ)"),
                        WordToken("呢", "ne", "Bagaimana dengan / sedang (partikel modal)", "Partikel tanya atau penanda sedang berlangsung")
                    )
                ),
                Sentence(
                    id = "s_cntstars_5",
                    hanzi = "白天数就容易多了。”",
                    pinyin = "bái tiān shǔ jiù róng yì duō le",
                    translation = "“Menghitung di siang hari kan jauh lebih mudah.”",
                    tokens = listOf(
                        WordToken("白天", "bái tiān", "Daytime", "Kosakata HSK 2: 白天 (bái tiān)"),
                        WordToken("数", "shǔ", "To count", "Kosakata HSK 2: 数 (shǔ)"),
                        WordToken("就", "jiù", "Langsung / Segera / Maka", "Menyatakan ketepatan waktu atau kelogisan"),
                        WordToken("容易", "róng yì", "Easy; straightforward", "Kosakata HSK 2: 容易 (róng yì)"),
                        WordToken("多", "duō", "Banyak", "Jumlah besar"),
                        WordToken("了", "le", "Sudah (partikel perubahan situasi)", "Partikel aspek selesainya tindakan")
                    )
                )
            ),
            questions = listOf(
                StoryQuestion(
                    id = "q_cntstars_1",
                    questionText = "故事中的小朋友晚上喜欢做什么？ (Apa yang gemar dilakukan anak kecil di malam hari dalam cerita?)",
                    options = listOf("看手机 (Menatap layar ponsel)", "坐在院子里仰望夜空数星星 (Duduk di pekarangan memandang langit menghitung bintang)", "睡觉 (Langsung tidur)", "写数学作业 (Mengerjakan PR matematika)"),
                    correctAnswerIndex = 1,
                    explanation = "Kisah masa kecil astronom kuno yang gemar mengamati gugusan bintang di langit."
                ),
                StoryQuestion(
                    id = "q_cntstars_2",
                    questionText = "爷爷告诉他天上的星星怎么样？ (Apa yang diberitahukan kakek tentang bintang di langit?)",
                    options = listOf("星星很少，一下就能数完 (Bintang sangat sedikit dan cepat dihitung)", "星星很多，是数不清的 (Bintang sangat banyak dan tak terhitung jumlahnya)", "星星不会发光 (Bintang tidak bersinar)", "天亮星星会掉下来 (Bintang akan berjatuhan saat fajar)"),
                    correctAnswerIndex = 1,
                    explanation = "Kakek tersenyum memberitahu bahwa bintang di alam semesta tak terhingga banyaknya."
                ),
                StoryQuestion(
                    id = "q_cntstars_3",
                    questionText = "这个孩子长大后成为了什么著名人物？ (Menjadi tokoh terkemuka apakah anak tersebut saat dewasa?)",
                    options = listOf("伟大的天文学家张衡 (Astronom agung Zhang Heng)", "一位商人 (Seorang saudagar pedagang)", "一名将军 (Seorang panglima jenderal)", "一位画家 (Seorang pelukis)"),
                    correctAnswerIndex = 0,
                    explanation = "Ketekunan masa kecil menuntunnya menjadi ilmuwan astronomi legendaris Tiongkok."
                ),
                StoryQuestion(
                    id = "q_cntstars_4",
                    questionText = "这个故事鼓励我们培养什么品质？ (Sikap teladan apa yang diajarkan dalam kisah ini?)",
                    options = listOf("做事马虎 (Bekerja serampangan)", "对自然充满好奇心与坚持探索的精神 (Rasa ingin tahu terhadap alam dan ketekunan meneliti)", "不爱动脑筋 (Malas berpikir)", "随波逐流 (Ikut-ikutan tanpa tujuan)"),
                    correctAnswerIndex = 1,
                    explanation = "Rasa ingin tahu dan pengamatan yang tekun adalah pondasi penemuan sains."
                )
            )
        ),
        // Cerita Mandarin Bean 90 (HSK 2): Eat Cake (Makan Kue)
        Story(
            id = "story_eat_cake",
            titleHanzi = "吃蛋糕",
            titlePinyin = "Chī Dàngāo",
            titleTranslation = "Eat Cake (Makan Kue)",
            level = "HSK 2",
            category = "Keluarga & Humor",
            description = "Kisah lucu di rumah saat kue lezat di dalam kulkas menghilang secara misterius sebelum pesta dimulai.",
            coverEmoji = "🍰",
            coverImageRes = R.drawable.cover_story_eat_cake,
            estimatedReadMinutes = 2,
            sentences = listOf(
                Sentence(
                    id = "s_eatcake_1",
                    hanzi = "妈妈买了两块蛋糕，对哥哥和妹妹说：你们两个人每人吃一块蛋糕。",
                    pinyin = "mā ma mǎi le liǎng kuài dàn gāo duì gē ge hé mèi mei shuō nǐ men liǎng gè rén měi rén chī yī kuài dàn gāo",
                    translation = "Ibu membeli dua potong kue, lalu berkata kepada kakak laki-laki dan adik perempuan: kalian berdua masing-masing makan satu potong kue.",
                    tokens = listOf(
                        WordToken("妈妈", "mā ma", "Ibu", "Anggota keluarga"),
                        WordToken("买", "mǎi", "Membeli", "Transaksi belanja"),
                        WordToken("了", "le", "Sudah (partikel perubahan situasi)", "Partikel aspek selesainya tindakan"),
                        WordToken("两", "liǎng", "Two", "Kosakata HSK 2: 两 (liǎng)"),
                        WordToken("块", "kuài", "Classifier for pieces of cloth, cake, soap etc", "Kosakata HSK 2: 块 (kuài)"),
                        WordToken("蛋糕", "dàn gāo", "Kue tart / Cake", "Makanan manis perayaan"),
                        WordToken("对", "duì", "Towards; at; for", "Kosakata HSK 2: 对 (duì)"),
                        WordToken("哥哥", "gē ge", "Kakak laki-laki", "Saudara kandung laki-laki tertua"),
                        WordToken("和", "hé", "Dan", "Kata hubung setara"),
                        WordToken("妹妹", "mèi mei", "Adik perempuan", "Saudari kandung termuda"),
                        WordToken("说", "shuō", "Berbicara / Berkata", "Menyampaikan ucapan"),
                        WordToken("你们", "nǐ men", "You (plural)", "Kosakata HSK 2: 你们 (nǐ men)"),
                        WordToken("两", "liǎng", "Two", "Kosakata HSK 2: 两 (liǎng)"),
                        WordToken("个", "gè", "Classifier for people or objects in general", "Kosakata HSK 2: 个 (gè)"),
                        WordToken("人", "rén", "Person; people", "Kosakata HSK 2: 人 (rén)"),
                        WordToken("每", "měi", "Each", "Kosakata HSK 2: 每 (měi)"),
                        WordToken("人", "rén", "Person; people", "Kosakata HSK 2: 人 (rén)"),
                        WordToken("吃", "chī", "Makan", "Aktivitas mengonsumsi makanan"),
                        WordToken("一", "yī", "One", "Kosakata HSK 2: 一 (yī)"),
                        WordToken("块", "kuài", "Classifier for pieces of cloth, cake, soap etc", "Kosakata HSK 2: 块 (kuài)"),
                        WordToken("蛋糕", "dàn gāo", "Kue tart / Cake", "Makanan manis perayaan")
                    )
                ),
                Sentence(
                    id = "s_eatcake_2",
                    hanzi = "哥哥不高兴，说：我是哥哥，我更高，年纪更大，我要吃两块。",
                    pinyin = "gē ge bù gāo xìng shuō wǒ shì gē ge wǒ gèng gāo nián jì gèng dà wǒ yào chī liǎng kuài",
                    translation = "Kakak tidak senang dan berkata: Saya kan kakak, saya lebih tinggi dan lebih tua, saya mau makan dua potong.",
                    tokens = listOf(
                        WordToken("哥哥", "gē ge", "Kakak laki-laki", "Saudara kandung laki-laki tertua"),
                        WordToken("不", "bù", "Tidak", "Kata sangkalan untuk masa kini atau masa depan"),
                        WordToken("高兴", "gāo xìng", "Senang / Gembira", "Perasaan ceria bahagia"),
                        WordToken("说", "shuō", "Berbicara / Berkata", "Menyampaikan ucapan"),
                        WordToken("我", "wǒ", "Saya", "Kata ganti orang pertama tunggal"),
                        WordToken("是", "shì", "Adalah", "Kopula penjelas"),
                        WordToken("哥哥", "gē ge", "Kakak laki-laki", "Saudara kandung laki-laki tertua"),
                        WordToken("我", "wǒ", "Saya", "Kata ganti orang pertama tunggal"),
                        WordToken("更", "gèng", "More", "Kosakata HSK 2: 更 (gèng)"),
                        WordToken("高", "gāo", "Tinggi", "Postur atau letak tinggi"),
                        WordToken("年纪", "nián jì", "Age", "Kosakata HSK 2: 年纪 (nián jì)"),
                        WordToken("更", "gèng", "More", "Kosakata HSK 2: 更 (gèng)"),
                        WordToken("大", "dà", "Besar", "Ukuran fisik besar"),
                        WordToken("我", "wǒ", "Saya", "Kata ganti orang pertama tunggal"),
                        WordToken("要", "yào", "Mau / Akan / Harus", "Menyatakan niat atau keharusan"),
                        WordToken("吃", "chī", "Makan", "Aktivitas mengonsumsi makanan"),
                        WordToken("两", "liǎng", "Two", "Kosakata HSK 2: 两 (liǎng)"),
                        WordToken("块", "kuài", "Classifier for pieces of cloth, cake, soap etc", "Kosakata HSK 2: 块 (kuài)")
                    )
                ),
                Sentence(
                    id = "s_eatcake_3",
                    hanzi = "妈妈说：好的。",
                    pinyin = "mā ma shuō hǎo de",
                    translation = "Ibu berkata: Baiklah.",
                    tokens = listOf(
                        WordToken("妈妈", "mā ma", "Ibu", "Anggota keluarga"),
                        WordToken("说", "shuō", "Berbicara / Berkata", "Menyampaikan ucapan"),
                        WordToken("好", "hǎo", "Bagus / Baik", "Kualitas positif"),
                        WordToken("的", "de", "Punya / Yang (partikel posesif)", "Partikel penjelas modifikasi atau kepemilikan")
                    )
                ),
                Sentence(
                    id = "s_eatcake_4",
                    hanzi = "然后妈妈用刀切蛋糕，哥哥的蛋糕就从一块变成了两块。",
                    pinyin = "rán hòu mā ma yòng dāo qiē dàn gāo gē ge de dàn gāo jiù cóng yī kuài biàn chéng le liǎng kuài",
                    translation = "Kemudian ibu memotong kue milik kakak dengan pisau, sehingga kuenya berubah dari satu potong menjadi dua potong.",
                    tokens = listOf(
                        WordToken("然后", "rán hòu", "Then; after that; afterwards", "Kosakata HSK 2: 然后 (rán hòu)"),
                        WordToken("妈妈", "mā ma", "Ibu", "Anggota keluarga"),
                        WordToken("用", "yòng", "To use; to make use of; to employ", "Kosakata HSK 2: 用 (yòng)"),
                        WordToken("刀", "dāo", "Knife; blade; single-edged sword; cutlass", "Kosakata HSK 2: 刀 (dāo)"),
                        WordToken("切", "qiē", "To cut; to slice; to carve", "Kosakata HSK 2: 切 (qiē)"),
                        WordToken("蛋糕", "dàn gāo", "Kue tart / Cake", "Makanan manis perayaan"),
                        WordToken("哥哥", "gē ge", "Kakak laki-laki", "Saudara kandung laki-laki tertua"),
                        WordToken("的", "de", "Punya / Yang (partikel posesif)", "Partikel penjelas modifikasi atau kepemilikan"),
                        WordToken("蛋糕", "dàn gāo", "Kue tart / Cake", "Makanan manis perayaan"),
                        WordToken("就", "jiù", "Langsung / Segera / Maka", "Menyatakan ketepatan waktu atau kelogisan"),
                        WordToken("从", "cóng", "From; through; via", "Kosakata HSK 2: 从 (cóng)"),
                        WordToken("一", "yī", "One", "Kosakata HSK 2: 一 (yī)"),
                        WordToken("块", "kuài", "Classifier for pieces of cloth, cake, soap etc", "Kosakata HSK 2: 块 (kuài)"),
                        WordToken("变成", "biàn chéng", "To change into", "Kosakata HSK 2: 变成 (biàn chéng)"),
                        WordToken("了", "le", "Sudah (partikel perubahan situasi)", "Partikel aspek selesainya tindakan"),
                        WordToken("两", "liǎng", "Two", "Kosakata HSK 2: 两 (liǎng)"),
                        WordToken("块", "kuài", "Classifier for pieces of cloth, cake, soap etc", "Kosakata HSK 2: 块 (kuài)")
                    )
                ),
                Sentence(
                    id = "s_eatcake_5",
                    hanzi = "妈妈说：现在你有两块蛋糕了，吃吧！",
                    pinyin = "mā ma shuō xiàn zài nǐ yǒu liǎng kuài dàn gāo le chī ba",
                    translation = "Ibu berkata: Sekarang kamu sudah punya dua potong kue, makanlah!",
                    tokens = listOf(
                        WordToken("妈妈", "mā ma", "Ibu", "Anggota keluarga"),
                        WordToken("说", "shuō", "Berbicara / Berkata", "Menyampaikan ucapan"),
                        WordToken("现在", "xiàn zài", "Sekarang", "Waktu saat ini"),
                        WordToken("你", "nǐ", "Kamu", "Kata ganti orang kedua tunggal"),
                        WordToken("有", "yǒu", "Mempunyai / Ada", "Menyatakan kepemilikan atau eksistensi"),
                        WordToken("两", "liǎng", "Two", "Kosakata HSK 2: 两 (liǎng)"),
                        WordToken("块", "kuài", "Classifier for pieces of cloth, cake, soap etc", "Kosakata HSK 2: 块 (kuài)"),
                        WordToken("蛋糕", "dàn gāo", "Kue tart / Cake", "Makanan manis perayaan"),
                        WordToken("了", "le", "Sudah (partikel perubahan situasi)", "Partikel aspek selesainya tindakan"),
                        WordToken("吃", "chī", "Makan", "Aktivitas mengonsumsi makanan"),
                        WordToken("吧", "ba", "Kan / Mari (partikel saran)", "Partikel saran, ajakan, atau dugaan")
                    )
                )
            ),
            questions = listOf(
                StoryQuestion(
                    id = "q_eatcake_1",
                    questionText = "冰箱里的蛋糕本来是留着什么时候吃的？ (Kue di dalam lemari es awalnya disiapkan untuk kapan?)",
                    options = listOf("留给明天的客人 (Untuk disuguhkan kepada tamu besok)", "留给猫吃的 (Untuk kucing peliharaan)", "马上扔掉 (Untuk langsung dibuang)", "早饭吃 (Untuk sarapan)"),
                    correctAnswerIndex = 0,
                    explanation = "Kue tart manis disiapkan untuk menyambut jamuan tamu keesokan harinya."
                ),
                StoryQuestion(
                    id = "q_eatcake_2",
                    questionText = "谁悄悄把蛋糕吃了一大半？ (Siapa yang diam-diam memakan separuh kue tersebut?)",
                    options = listOf("调皮的小弟弟 (Adik laki-laki yang nakal dan gemar makanan manis)", "爸爸 (Ayah)", "邻居 (Tetangga)", "小狗 (Anjing kecil)"),
                    correctAnswerIndex = 0,
                    explanation = "Sang adik tergiur melihat kue krim lezat saat membuka pintu kulkas."
                ),
                StoryQuestion(
                    id = "q_eatcake_3",
                    questionText = "妈妈是怎么发现弟弟偷吃蛋糕的？ (Bagaimana ibu mengetahui bahwa sang adik yang memakannya?)",
                    options = listOf("弟弟嘴边还沾着奶油 (Di sekeliling mulut adik masih menempel sisa krim putih)", "弟弟主动承认 (Adik mengaku duluan)", "邻居看见了 (Tetangga melihatnya)", "看监控 (Melihat rekaman CCTV)"),
                    correctAnswerIndex = 0,
                    explanation = "Bekas krim kue di bibirnya menjadi bukti lucu yang tidak bisa disangkal."
                ),
                StoryQuestion(
                    id = "q_eatcake_4",
                    questionText = "大家看到弟弟的样子后反应如何？ (Bagaimana reaksi semua anggota keluarga melihat muka si adik?)",
                    options = listOf("狠狠打了他一顿 (Memukulnya keras-keras)", "忍不住哈哈大笑起来 (Tidak tahan untuk tertawa terbahak-bahak)", "都哭了 (Semuanya menangis)", "非常生气地离开 (Pergi dengan sangat marah)"),
                    correctAnswerIndex = 1,
                    explanation = "Kepolosan sang adik dengan wajah berlumuran krim membuat suasana keluarga dipenuhi tawa."
                )
            )
        ),
        // Cerita Mandarin Bean 91 (HSK 2): The Elder Brother and the Younger Brother (Kakak dan Adik Laki-laki)
        Story(
            id = "story_elder_and_younger_brother",
            titleHanzi = "哥哥和弟弟",
            titlePinyin = "Gēge hé Dìdi",
            titleTranslation = "The Elder Brother and the Younger Brother (Kakak dan Adik Laki-laki)",
            level = "HSK 2",
            category = "Keluarga & Hubungan",
            description = "Kisah persaudaraan yang rukun antara kakak dan adik saat saling berbagi apel yang paling manis.",
            coverEmoji = "👦",
            coverImageRes = R.drawable.cover_story_elder_and_younger_brother,
            estimatedReadMinutes = 2,
            sentences = listOf(
                Sentence(
                    id = "s_twobros_1",
                    hanzi = "哥哥和弟弟是双胞胎，长得一模一样。",
                    pinyin = "gē ge hé dì di shì shuāng bāo tāi zhǎng de yī mú yī yàng",
                    translation = "Kakak dan adik adalah saudara kembar, wajahnya mirip persis.",
                    tokens = listOf(
                        WordToken("哥哥", "gē ge", "Kakak laki-laki", "Saudara kandung laki-laki tertua"),
                        WordToken("和", "hé", "Dan", "Kata hubung setara"),
                        WordToken("弟弟", "dì di", "Adik laki-laki", "Saudara kandung laki-laki termuda"),
                        WordToken("是", "shì", "Adalah", "Kopula penjelas"),
                        WordToken("双胞胎", "shuāng bāo tāi", "Twin", "Kosakata HSK 2: 双胞胎 (shuāng bāo tāi)"),
                        WordToken("长", "zhǎng", "To grow", "Kosakata HSK 2: 长 (zhǎng)"),
                        WordToken("得", "de", "Dengan (partikel pelengkap derajat)", "Partikel penunjuk derajat hasil tindakan"),
                        WordToken("一模一样", "yī mú yī yàng", "(idiom) exactly alike; identical", "Kosakata HSK 2: 一模一样 (yī mú yī yàng)")
                    )
                ),
                Sentence(
                    id = "s_twobros_2",
                    hanzi = "他们的爸爸妈妈经常都不知道谁是哥哥，谁是弟弟。",
                    pinyin = "tā men de bà ba mā ma jīng cháng dōu bù zhī dào shéi shì gē ge shéi shì dì di",
                    translation = "Ayah dan ibu mereka pun sering kali tidak bisa membedakan mana yang kakak dan mana yang adik.",
                    tokens = listOf(
                        WordToken("他们", "tā men", "Mereka", "Kata ganti orang ketiga jamak"),
                        WordToken("的", "de", "Punya / Yang (partikel posesif)", "Partikel penjelas modifikasi atau kepemilikan"),
                        WordToken("爸爸", "bà ba", "Ayah", "Anggota keluarga"),
                        WordToken("妈妈", "mā ma", "Ibu", "Anggota keluarga"),
                        WordToken("经常", "jīng cháng", "Frequently; constantly; regularly; often", "Kosakata HSK 2: 经常 (jīng cháng)"),
                        WordToken("都", "dōu", "Semua / Seluruhnya", "Menyatakan keuniversalan subjek"),
                        WordToken("不", "bù", "Tidak", "Kata sangkalan untuk masa kini atau masa depan"),
                        WordToken("知道", "zhī dào", "Tahu / Mengetahui", "Memiliki informasi"),
                        WordToken("谁", "shéi", "Who", "Kosakata HSK 2: 谁 (shéi)"),
                        WordToken("是", "shì", "Adalah", "Kopula penjelas"),
                        WordToken("哥哥", "gē ge", "Kakak laki-laki", "Saudara kandung laki-laki tertua"),
                        WordToken("谁", "shéi", "Who", "Kosakata HSK 2: 谁 (shéi)"),
                        WordToken("是", "shì", "Adalah", "Kopula penjelas"),
                        WordToken("弟弟", "dì di", "Adik laki-laki", "Saudara kandung laki-laki termuda")
                    )
                ),
                Sentence(
                    id = "s_twobros_3",
                    hanzi = "这一天，爸爸妈妈和孩子们去饭馆吃饭，服务员问：“谁是哥哥？",
                    pinyin = "zhè yī tiān bà ba mā ma hé hái zi men qù fàn guǎn chī fàn fú wù yuán wèn shéi shì gē ge",
                    translation = "Suatu hari, ayah dan ibu mengajak anak-anak pergi makan di restoran, pelayan bertanya: “Siapa kakaknya?”",
                    tokens = listOf(
                        WordToken("这", "zhè", "This; these", "Kosakata HSK 2: 这 (zhè)"),
                        WordToken("一", "yī", "One", "Kosakata HSK 2: 一 (yī)"),
                        WordToken("天", "tiān", "Hari", "Satuan hari"),
                        WordToken("爸爸", "bà ba", "Ayah", "Anggota keluarga"),
                        WordToken("妈妈", "mā ma", "Ibu", "Anggota keluarga"),
                        WordToken("和", "hé", "Dan", "Kata hubung setara"),
                        WordToken("孩子", "hái zi", "Child", "Kosakata HSK 2: 孩子 (hái zi)"),
                        WordToken("们", "men", "Plural marker for pronouns, and nouns referring to individuals", "Kosakata HSK 2: 们 (men)"),
                        WordToken("去", "qù", "Pergi", "Berpindah tempat menjauhi pembicara"),
                        WordToken("饭馆", "fàn guǎn", "Restaurant", "Kosakata HSK 2: 饭馆 (fàn guǎn)"),
                        WordToken("吃饭", "chī fàn", "To have a meal", "Kosakata HSK 2: 吃饭 (chī fàn)"),
                        WordToken("服务员", "fú wù yuán", "Pelayan", "Staf restoran atau toko"),
                        WordToken("问", "wèn", "To ask; to inquire", "Kosakata HSK 2: 问 (wèn)"),
                        WordToken("谁", "shéi", "Who", "Kosakata HSK 2: 谁 (shéi)"),
                        WordToken("是", "shì", "Adalah", "Kopula penjelas"),
                        WordToken("哥哥", "gē ge", "Kakak laki-laki", "Saudara kandung laki-laki tertua")
                    )
                ),
                Sentence(
                    id = "s_twobros_4",
                    hanzi = "谁是弟弟？”",
                    pinyin = "shéi shì dì di",
                    translation = "“Siapa adiknya?”",
                    tokens = listOf(
                        WordToken("谁", "shéi", "Who", "Kosakata HSK 2: 谁 (shéi)"),
                        WordToken("是", "shì", "Adalah", "Kopula penjelas"),
                        WordToken("弟弟", "dì di", "Adik laki-laki", "Saudara kandung laki-laki termuda")
                    )
                ),
                Sentence(
                    id = "s_twobros_5",
                    hanzi = "他们想了一下，说：“哥哥旁边的是弟弟，弟弟旁边的是哥哥。”",
                    pinyin = "tā men xiǎng le yī xià shuō gē ge páng biān de shì dì di dì di páng biān de shì gē ge",
                    translation = "Mereka berpikir sejenak lalu menjawab: “Yang di sebelah kakak adalah adik, dan yang di sebelah adik adalah kakak.”",
                    tokens = listOf(
                        WordToken("他们", "tā men", "Mereka", "Kata ganti orang ketiga jamak"),
                        WordToken("想", "xiǎng", "Ingin / Berpikir / Rindu", "Keinginan atau pemikiran batin"),
                        WordToken("了", "le", "Sudah (partikel perubahan situasi)", "Partikel aspek selesainya tindakan"),
                        WordToken("一下", "yī xià", "(after a verb) a bit; a little (indicating brief duration, or softening the tone, or suggesting giving sth a try)", "Kosakata HSK 2: 一下 (yī xià)"),
                        WordToken("说", "shuō", "Berbicara / Berkata", "Menyampaikan ucapan"),
                        WordToken("哥哥", "gē ge", "Kakak laki-laki", "Saudara kandung laki-laki tertua"),
                        WordToken("旁边", "páng biān", "Side; adjacent place", "Kosakata HSK 2: 旁边 (páng biān)"),
                        WordToken("的", "de", "Punya / Yang (partikel posesif)", "Partikel penjelas modifikasi atau kepemilikan"),
                        WordToken("是", "shì", "Adalah", "Kopula penjelas"),
                        WordToken("弟弟", "dì di", "Adik laki-laki", "Saudara kandung laki-laki termuda"),
                        WordToken("弟弟", "dì di", "Adik laki-laki", "Saudara kandung laki-laki termuda"),
                        WordToken("旁边", "páng biān", "Side; adjacent place", "Kosakata HSK 2: 旁边 (páng biān)"),
                        WordToken("的", "de", "Punya / Yang (partikel posesif)", "Partikel penjelas modifikasi atau kepemilikan"),
                        WordToken("是", "shì", "Adalah", "Kopula penjelas"),
                        WordToken("哥哥", "gē ge", "Kakak laki-laki", "Saudara kandung laki-laki tertua")
                    )
                )
            ),
            questions = listOf(
                StoryQuestion(
                    id = "q_twobros_1",
                    questionText = "桌子上放着什么样的两个苹果？ (Dua apel seperti apa yang ada di atas meja?)",
                    options = listOf("一个很大很红，一个比较小 (Satu apel berukuran besar merah, satunya lagi agak kecil)", "两个都烂了 (Keduanya sudah busuk)", "都是绿色的 (Keduanya berwarna hijau)", "只有一个苹果 (Hanya ada satu apel)"),
                    correctAnswerIndex = 0,
                    explanation = "Di meja tersaji dua buah apel dengan ukuran yang berbeda."
                ),
                StoryQuestion(
                    id = "q_twobros_2",
                    questionText = "哥哥主动把哪一个苹果让给了弟弟？ (Apel mana yang diberikan sang kakak secara sukarela kepada adiknya?)",
                    options = listOf("把大的留给自己 (Mengambil yang besar untuk dirinya sendiri)", "把又大又甜的苹果让给弟弟 (Memberikan apel besar yang manis kepada sang adik)", "把坏的给弟弟 (Memberikan yang rusak kepada adik)", "两个都扔了 (Membuang kedua apel)"),
                    correctAnswerIndex = 1,
                    explanation = "Sang kakak dengan penuh kasih sayang menyilakan adiknya menikmati apel yang lebih besar."
                ),
                StoryQuestion(
                    id = "q_twobros_3",
                    questionText = "弟弟拿到大苹果后做了什么令人感动的事？ (Hal terpuji apa yang dilakukan sang adik setelah menerima apel besar?)",
                    options = listOf("切成两半和哥哥一起分享 (Memotongnya menjadi dua untuk dinikmati bersama sang kakak)", "自己一个人全吃了 (Menghabiskannya sendirian)", "藏了起来 (Menyembunyikannya)", "拿去换玩具 (Menukarnya dengan mainan)"),
                    correctAnswerIndex = 0,
                    explanation = "Sang adik belajar dari keteladanan kakak dan memilih untuk berbagi kelezatan bersama."
                ),
                StoryQuestion(
                    id = "q_twobros_4",
                    questionText = "这个故事传递了怎样的家庭美德？ (Nilai budi pekerti apa yang disampaikan dalam cerita ini?)",
                    options = listOf("争抢食物 (Berebut makanan)", "兄弟友爱、互相关怀与礼让 (Kerukunan saudara, saling menyayangi dan mengalah)", "自私自利 (Mementingkan diri sendiri)", "不听父母的话 (Membangkang orang tua)"),
                    correctAnswerIndex = 1,
                    explanation = "Sikap saling mendahulukan dan berbagi mempererat kehangatan hubungan persaudaraan."
                )
            )
        )
    )
}
