package com.example.chineselearning.data.repository

import com.example.chineselearning.R
import com.example.chineselearning.data.model.Sentence
import com.example.chineselearning.data.model.Story
import com.example.chineselearning.data.model.StoryQuestion
import com.example.chineselearning.data.model.WordToken

val mandarinBeanStoriesPart7: List<Story> by lazy {
    listOf(
        // Cerita Mandarin Bean 92 (HSK 2): Bird Nest and Hair (Sarang Burung dan Rambut)
        Story(
            id = "story_bird_nest_and_hair",
            titleHanzi = "鸟窝和头发",
            titlePinyin = "Niǎowō hé Tóufa",
            titleTranslation = "Bird Nest and Hair (Sarang Burung dan Rambut)",
            level = "HSK 2",
            category = "Alam & Humor",
            description = "Humor tentang seseorang yang bangun tidur dengan rambut acak-acakan menyerupai sarang burung.",
            coverEmoji = "🪺",
            coverImageRes = R.drawable.cover_story_bird_nest_and_hair,
            estimatedReadMinutes = 2,
            sentences = listOf(
                Sentence(
                    id = "s_birdnest_1",
                    hanzi = "哥哥看到树上有一个鸟窝，就告诉弟弟：“你知道那是什么吗？",
                    pinyin = "gē ge kàn dào shù shàng yǒu yī gè niǎo wō jiù gào su dì di nǐ zhī dào nà shì shén me ma",
                    translation = "Kakak laki-laki Melihat / Membaca To reach; to arrive Tree (noun suffix) on; above Mempunyai / Ada One Classifier for people or objects in general Bird Nest Langsung / Segera / Maka To tell; to inform; to let know Adik laki-laki Kamu Tahu / Mengetahui (specifier) that; the; those Adalah What? Apakah (partikel tanya)",
                    tokens = listOf(
                        WordToken("哥哥", "gē ge", "Kakak laki-laki", "Saudara kandung laki-laki tertua"),
                        WordToken("看", "kàn", "Melihat / Membaca", "Aktivitas visual"),
                        WordToken("到", "dào", "To reach; to arrive", "Kosakata HSK 2: 到 (dào)"),
                        WordToken("树", "shù", "Tree", "Kosakata HSK 2: 树 (shù)"),
                        WordToken("上", "shàng", "(noun suffix) on; above", "Kosakata HSK 2: 上 (shàng)"),
                        WordToken("有", "yǒu", "Mempunyai / Ada", "Menyatakan kepemilikan atau eksistensi"),
                        WordToken("一", "yī", "One", "Kosakata HSK 2: 一 (yī)"),
                        WordToken("个", "gè", "Classifier for people or objects in general", "Kosakata HSK 2: 个 (gè)"),
                        WordToken("鸟", "niǎo", "Bird", "Kosakata HSK 2: 鸟 (niǎo)"),
                        WordToken("窝", "wō", "Nest", "Kosakata HSK 2: 窝 (wō)"),
                        WordToken("就", "jiù", "Langsung / Segera / Maka", "Menyatakan ketepatan waktu atau kelogisan"),
                        WordToken("告诉", "gào su", "To tell; to inform; to let know", "Kosakata HSK 2: 告诉 (gào su)"),
                        WordToken("弟弟", "dì di", "Adik laki-laki", "Saudara kandung laki-laki termuda"),
                        WordToken("你", "nǐ", "Kamu", "Kata ganti orang kedua tunggal"),
                        WordToken("知道", "zhī dào", "Tahu / Mengetahui", "Memiliki informasi"),
                        WordToken("那", "nà", "(specifier) that; the; those", "Kosakata HSK 2: 那 (nà)"),
                        WordToken("是", "shì", "Adalah", "Kopula penjelas"),
                        WordToken("什么", "shén me", "What?", "Kosakata HSK 2: 什么 (shén me)"),
                        WordToken("吗", "ma", "Apakah (partikel tanya)", "Partikel di akhir kalimat interogatif ya/tidak")
                    )
                ),
                Sentence(
                    id = "s_birdnest_2",
                    hanzi = "那个东西叫鸟窝，就是鸟的家。",
                    pinyin = "nà gè dōng xi jiào niǎo wō jiù shì niǎo de jiā",
                    translation = "(specifier) that; the; those Classifier for people or objects in general Thing Memanggil / Bernama Bird Nest Langsung / Segera / Maka Adalah Bird Punya / Yang (partikel posesif) Rumah / Keluarga",
                    tokens = listOf(
                        WordToken("那", "nà", "(specifier) that; the; those", "Kosakata HSK 2: 那 (nà)"),
                        WordToken("个", "gè", "Classifier for people or objects in general", "Kosakata HSK 2: 个 (gè)"),
                        WordToken("东西", "dōng xi", "Thing", "Kosakata HSK 2: 东西 (dōng xi)"),
                        WordToken("叫", "jiào", "Memanggil / Bernama", "Menyebutkan nama"),
                        WordToken("鸟", "niǎo", "Bird", "Kosakata HSK 2: 鸟 (niǎo)"),
                        WordToken("窝", "wō", "Nest", "Kosakata HSK 2: 窝 (wō)"),
                        WordToken("就", "jiù", "Langsung / Segera / Maka", "Menyatakan ketepatan waktu atau kelogisan"),
                        WordToken("是", "shì", "Adalah", "Kopula penjelas"),
                        WordToken("鸟", "niǎo", "Bird", "Kosakata HSK 2: 鸟 (niǎo)"),
                        WordToken("的", "de", "Punya / Yang (partikel posesif)", "Partikel penjelas modifikasi atau kepemilikan"),
                        WordToken("家", "jiā", "Rumah / Keluarga", "Tempat tinggal")
                    )
                ),
                Sentence(
                    id = "s_birdnest_3",
                    hanzi = "鸟窝里有鸟，也有蛋。”",
                    pinyin = "niǎo wō lǐ yǒu niǎo yě yǒu dàn",
                    translation = "Bird Nest Lining Mempunyai / Ada Bird Juga / Pun Mempunyai / Ada Egg",
                    tokens = listOf(
                        WordToken("鸟", "niǎo", "Bird", "Kosakata HSK 2: 鸟 (niǎo)"),
                        WordToken("窝", "wō", "Nest", "Kosakata HSK 2: 窝 (wō)"),
                        WordToken("里", "lǐ", "Lining", "Kosakata HSK 2: 里 (lǐ)"),
                        WordToken("有", "yǒu", "Mempunyai / Ada", "Menyatakan kepemilikan atau eksistensi"),
                        WordToken("鸟", "niǎo", "Bird", "Kosakata HSK 2: 鸟 (niǎo)"),
                        WordToken("也", "yě", "Juga / Pun", "Partikel penanda kesamaan"),
                        WordToken("有", "yǒu", "Mempunyai / Ada", "Menyatakan kepemilikan atau eksistensi"),
                        WordToken("蛋", "dàn", "Egg", "Kosakata HSK 2: 蛋 (dàn)")
                    )
                ),
                Sentence(
                    id = "s_birdnest_4",
                    hanzi = "弟弟高兴地说：“真的吗？",
                    pinyin = "dì di gāo xìng de shuō zhēn dí ma",
                    translation = "Adik laki-laki Senang / Gembira Secara (partikel adverbia) Berbicara / Berkata Sungguh / Benar-benar Punya / Yang (partikel posesif) Apakah (partikel tanya)",
                    tokens = listOf(
                        WordToken("弟弟", "dì di", "Adik laki-laki", "Saudara kandung laki-laki termuda"),
                        WordToken("高兴", "gāo xìng", "Senang / Gembira", "Perasaan ceria bahagia"),
                        WordToken("地", "de", "Secara (partikel adverbia)", "Partikel penanda kata keterangan sifat tindakan"),
                        WordToken("说", "shuō", "Berbicara / Berkata", "Menyampaikan ucapan"),
                        WordToken("真", "zhēn", "Sungguh / Benar-benar", "Menyatakan keaslian rasa"),
                        WordToken("的", "dí", "Punya / Yang (partikel posesif)", "Partikel penjelas modifikasi atau kepemilikan"),
                        WordToken("吗", "ma", "Apakah (partikel tanya)", "Partikel di akhir kalimat interogatif ya/tidak")
                    )
                ),
                Sentence(
                    id = "s_birdnest_5",
                    hanzi = "我要看你的头发！",
                    pinyin = "wǒ yào kàn nǐ de tóu fa",
                    translation = "Saya Mau / Akan / Harus Melihat / Membaca Kamu Punya / Yang (partikel posesif) Hair (on the head)",
                    tokens = listOf(
                        WordToken("我", "wǒ", "Saya", "Kata ganti orang pertama tunggal"),
                        WordToken("要", "yào", "Mau / Akan / Harus", "Menyatakan niat atau keharusan"),
                        WordToken("看", "kàn", "Melihat / Membaca", "Aktivitas visual"),
                        WordToken("你", "nǐ", "Kamu", "Kata ganti orang kedua tunggal"),
                        WordToken("的", "de", "Punya / Yang (partikel posesif)", "Partikel penjelas modifikasi atau kepemilikan"),
                        WordToken("头发", "tóu fa", "Hair (on the head)", "Kosakata HSK 2: 头发 (tóu fa)")
                    )
                ),
                Sentence(
                    id = "s_birdnest_6",
                    hanzi = "你的头上也有一个鸟窝，里面也有鸟和蛋吗？”",
                    pinyin = "nǐ de tóu shàng yě yǒu yī gè niǎo wō lǐ miàn yě yǒu niǎo hé dàn ma",
                    translation = "Kamu Punya / Yang (partikel posesif) Head (noun suffix) on; above Juga / Pun Mempunyai / Ada One Classifier for people or objects in general Bird Nest Lining Side Juga / Pun Mempunyai / Ada Bird Dan Egg Apakah (partikel tanya)",
                    tokens = listOf(
                        WordToken("你", "nǐ", "Kamu", "Kata ganti orang kedua tunggal"),
                        WordToken("的", "de", "Punya / Yang (partikel posesif)", "Partikel penjelas modifikasi atau kepemilikan"),
                        WordToken("头", "tóu", "Head", "Kosakata HSK 2: 头 (tóu)"),
                        WordToken("上", "shàng", "(noun suffix) on; above", "Kosakata HSK 2: 上 (shàng)"),
                        WordToken("也", "yě", "Juga / Pun", "Partikel penanda kesamaan"),
                        WordToken("有", "yǒu", "Mempunyai / Ada", "Menyatakan kepemilikan atau eksistensi"),
                        WordToken("一", "yī", "One", "Kosakata HSK 2: 一 (yī)"),
                        WordToken("个", "gè", "Classifier for people or objects in general", "Kosakata HSK 2: 个 (gè)"),
                        WordToken("鸟", "niǎo", "Bird", "Kosakata HSK 2: 鸟 (niǎo)"),
                        WordToken("窝", "wō", "Nest", "Kosakata HSK 2: 窝 (wō)"),
                        WordToken("里", "lǐ", "Lining", "Kosakata HSK 2: 里 (lǐ)"),
                        WordToken("面", "miàn", "Side", "Kosakata HSK 2: 面 (miàn)"),
                        WordToken("也", "yě", "Juga / Pun", "Partikel penanda kesamaan"),
                        WordToken("有", "yǒu", "Mempunyai / Ada", "Menyatakan kepemilikan atau eksistensi"),
                        WordToken("鸟", "niǎo", "Bird", "Kosakata HSK 2: 鸟 (niǎo)"),
                        WordToken("和", "hé", "Dan", "Kata hubung setara"),
                        WordToken("蛋", "dàn", "Egg", "Kosakata HSK 2: 蛋 (dàn)"),
                        WordToken("吗", "ma", "Apakah (partikel tanya)", "Partikel di akhir kalimat interogatif ya/tidak")
                    )
                )
            ),
            questions = listOf(
                StoryQuestion(
                    id = "q_birdnest_1",
                    questionText = "主人公早上起床照镜子时发现了什么？ (Apa yang disadari tokoh utama saat berkaca di cermin pagi hari?)",
                    options = listOf("自己的头发乱蓬蓬的像个鸟窝 (Rambut kepalanya kusut berantakan mirip sarang burung)", "脸上长了胡子 (Tumbuh jenggot di muka)", "牙齿掉了 (Giginya tanggal)", "衣服破了 (Bajunya sobek)"),
                    correctAnswerIndex = 0,
                    explanation = "Gaya rambut setelah bangun tidur yang mencuat ke segala arah menggelitik tawa."
                ),
                StoryQuestion(
                    id = "q_birdnest_2",
                    questionText = "朋友看到他的发型后说了什么趣话？ (Candaan apa yang diucapkan temannya melihat tatanan rambut itu?)",
                    options = listOf("小鸟会不会飞来你的头上做窝？ (Mungkinkah burung kecil datang bertelur di atas kepalamu?)", "你的发型真好看 (Gaya rambutmu keren sekali)", "你像个电影明星 (Kamu mirip bintang film)", "你戴帽子了吗？ (Apakah kamu memakai topi?)"),
                    correctAnswerIndex = 0,
                    explanation = "Temannya bergurau menanyakan apakah ada burung yang mengira itu sarang ranting."
                ),
                StoryQuestion(
                    id = "q_birdnest_3",
                    questionText = "为了把头发整理好，他使用了什么工具？ (Alat apa yang digunakannya untuk merapikan rambut?)",
                    options = listOf("梳子和温水 (Sisir dan air hangat)", "剪刀 (Gunting)", "胶水 (Lem)", "毛巾 (Handuk basah saja)"),
                    correctAnswerIndex = 0,
                    explanation = "Menyisir rapi dengan bantuan air agar helai rambut kembali tertata lurus."
                ),
                StoryQuestion(
                    id = "q_birdnest_4",
                    questionText = "在汉语日常会话中，“鸟窝”常用来形容什么？ (Dalam percakapan santai, kata '鸟窝' sering meminjam kiasan apa?)",
                    options = listOf("非常整洁的房间 (Kamar yang sangat rapi)", "乱糟糟没有打理的发型 (Rambut berantakan yang belum disisir)", "好吃的点心 (Kudapan lezat)", "昂贵的帽子 (Topi mahal)"),
                    correctAnswerIndex = 1,
                    explanation = "Metafora umum untuk menyebut rambut bangun tidur yang acak-acakan."
                )
            )
        ),
        // Cerita Mandarin Bean 93 (HSK 2): See You There (Sampai Bertemu di Sana / Tidak Boleh Batal)
        Story(
            id = "story_see_you_there",
            titleHanzi = "不见不散",
            titlePinyin = "Bú Jiàn Bú Sàn",
            titleTranslation = "See You There (Sampai Bertemu di Sana / Tidak Boleh Batal)",
            level = "HSK 2",
            category = "Janji Temu & Lokasi",
            description = "Janji temu di depan stasiun bioskop dengan komitmen 'bú jiàn bú sàn' — pantang pulang sebelum berjumpa.",
            coverEmoji = "📍",
            coverImageRes = R.drawable.cover_story_see_you_there,
            estimatedReadMinutes = 2,
            sentences = listOf(
                Sentence(
                    id = "s_seeyouthere_1",
                    hanzi = "A：现在几点？",
                    pinyin = "xiàn zài jǐ diǎn",
                    translation = "Sekarang How much Pukul / Jam",
                    tokens = listOf(
                        WordToken("现在", "xiàn zài", "Sekarang", "Waktu saat ini"),
                        WordToken("几", "jǐ", "How much", "Kosakata HSK 2: 几 (jǐ)"),
                        WordToken("点", "diǎn", "Pukul / Jam", "Penunjuk waktu jam")
                    )
                ),
                Sentence(
                    id = "s_seeyouthere_2",
                    hanzi = "B：差五分两点。",
                    pinyin = "chà wǔ fēn liǎng diǎn",
                    translation = "To fall short; to lack Five Menit Two Pukul / Jam",
                    tokens = listOf(
                        WordToken("差", "chà", "To fall short; to lack", "Kosakata HSK 2: 差 (chà)"),
                        WordToken("五", "wǔ", "Five", "Kosakata HSK 2: 五 (wǔ)"),
                        WordToken("分", "fēn", "Menit", "Satuan menit"),
                        WordToken("两", "liǎng", "Two", "Kosakata HSK 2: 两 (liǎng)"),
                        WordToken("点", "diǎn", "Pukul / Jam", "Penunjuk waktu jam")
                    )
                ),
                Sentence(
                    id = "s_seeyouthere_3",
                    hanzi = "怎么了？",
                    pinyin = "zěn me le",
                    translation = "How? Sudah (partikel perubahan situasi)",
                    tokens = listOf(
                        WordToken("怎么", "zěn me", "How?", "Kosakata HSK 2: 怎么 (zěn me)"),
                        WordToken("了", "le", "Sudah (partikel perubahan situasi)", "Partikel aspek selesainya tindakan")
                    )
                ),
                Sentence(
                    id = "s_seeyouthere_4",
                    hanzi = "A：我两点半要去咖啡店见朋友。",
                    pinyin = "wǒ liǎng diǎn bàn yào qù kā fēi diàn jiàn péng you",
                    translation = "Saya Two Pukul / Jam (after a number) and a half Mau / Akan / Harus Pergi Kopi (bound form) shop; store To see Teman / Sahabat",
                    tokens = listOf(
                        WordToken("我", "wǒ", "Saya", "Kata ganti orang pertama tunggal"),
                        WordToken("两", "liǎng", "Two", "Kosakata HSK 2: 两 (liǎng)"),
                        WordToken("点", "diǎn", "Pukul / Jam", "Penunjuk waktu jam"),
                        WordToken("半", "bàn", "(after a number) and a half", "Kosakata HSK 2: 半 (bàn)"),
                        WordToken("要", "yào", "Mau / Akan / Harus", "Menyatakan niat atau keharusan"),
                        WordToken("去", "qù", "Pergi", "Berpindah tempat menjauhi pembicara"),
                        WordToken("咖啡", "kā fēi", "Kopi", "Minuman berkafein"),
                        WordToken("店", "diàn", "(bound form) shop; store", "Kosakata HSK 2: 店 (diàn)"),
                        WordToken("见", "jiàn", "To see", "Kosakata HSK 2: 见 (jiàn)"),
                        WordToken("朋友", "péng you", "Teman / Sahabat", "Orang dekat")
                    )
                ),
                Sentence(
                    id = "s_seeyouthere_5",
                    hanzi = "B：你见谁？",
                    pinyin = "nǐ jiàn shéi",
                    translation = "Kamu To see Who",
                    tokens = listOf(
                        WordToken("你", "nǐ", "Kamu", "Kata ganti orang kedua tunggal"),
                        WordToken("见", "jiàn", "To see", "Kosakata HSK 2: 见 (jiàn)"),
                        WordToken("谁", "shéi", "Who", "Kosakata HSK 2: 谁 (shéi)")
                    )
                ),
                Sentence(
                    id = "s_seeyouthere_6",
                    hanzi = "A：我的小学同学，林林。",
                    pinyin = "wǒ de xiǎo xué tóng xué Lín Lín",
                    translation = "Saya Punya / Yang (partikel posesif) Elementary school; primary school Teman sekelas A personal name; lin lin",
                    tokens = listOf(
                        WordToken("我", "wǒ", "Saya", "Kata ganti orang pertama tunggal"),
                        WordToken("的", "de", "Punya / Yang (partikel posesif)", "Partikel penjelas modifikasi atau kepemilikan"),
                        WordToken("小学", "xiǎo xué", "Elementary school; primary school", "Kosakata HSK 2: 小学 (xiǎo xué)"),
                        WordToken("同学", "tóng xué", "Teman sekelas", "Rekan belajar"),
                        WordToken("林林", "Lín Lín", "A personal name; lin lin", "Kosakata HSK 2: 林林 (Lín Lín)")
                    )
                ),
                Sentence(
                    id = "s_seeyouthere_7",
                    hanzi = "你见过她的。",
                    pinyin = "nǐ jiàn guo tā de",
                    translation = "Kamu To see (experienced action marker) Dia (perempuan) Punya / Yang (partikel posesif)",
                    tokens = listOf(
                        WordToken("你", "nǐ", "Kamu", "Kata ganti orang kedua tunggal"),
                        WordToken("见", "jiàn", "To see", "Kosakata HSK 2: 见 (jiàn)"),
                        WordToken("过", "guo", "(experienced action marker)", "Kosakata HSK 2: 过 (guo)"),
                        WordToken("她", "tā", "Dia (perempuan)", "Kata ganti orang ketiga tunggal perempuan"),
                        WordToken("的", "de", "Punya / Yang (partikel posesif)", "Partikel penjelas modifikasi atau kepemilikan")
                    )
                ),
                Sentence(
                    id = "s_seeyouthere_8",
                    hanzi = "B：我知道了，那个很爱笑的姑娘。",
                    pinyin = "wǒ zhī dào le nà gè hěn ài xiào de gū niang",
                    translation = "Saya Tahu / Mengetahui Sudah (partikel perubahan situasi) (specifier) that; the; those Classifier for people or objects in general Sangat Mencintai / Cinta Tersenyum / Tertawa Punya / Yang (partikel posesif) Girl",
                    tokens = listOf(
                        WordToken("我", "wǒ", "Saya", "Kata ganti orang pertama tunggal"),
                        WordToken("知道", "zhī dào", "Tahu / Mengetahui", "Memiliki informasi"),
                        WordToken("了", "le", "Sudah (partikel perubahan situasi)", "Partikel aspek selesainya tindakan"),
                        WordToken("那", "nà", "(specifier) that; the; those", "Kosakata HSK 2: 那 (nà)"),
                        WordToken("个", "gè", "Classifier for people or objects in general", "Kosakata HSK 2: 个 (gè)"),
                        WordToken("很", "hěn", "Sangat", "Tingkat derajat"),
                        WordToken("爱", "ài", "Mencintai / Cinta", "Perasaan kasih sayang mendalam"),
                        WordToken("笑", "xiào", "Tersenyum / Tertawa", "Ekspresi kegembiraan"),
                        WordToken("的", "de", "Punya / Yang (partikel posesif)", "Partikel penjelas modifikasi atau kepemilikan"),
                        WordToken("姑娘", "gū niang", "Girl", "Kosakata HSK 2: 姑娘 (gū niang)")
                    )
                ),
                Sentence(
                    id = "s_seeyouthere_9",
                    hanzi = "你们晚上一起吃饭吗？",
                    pinyin = "nǐ men wǎn shang yī qǐ chī fàn ma",
                    translation = "You (plural) Malam hari Together; in company (with) To have a meal Apakah (partikel tanya)",
                    tokens = listOf(
                        WordToken("你们", "nǐ men", "You (plural)", "Kosakata HSK 2: 你们 (nǐ men)"),
                        WordToken("晚上", "wǎn shang", "Malam hari", "Waktu malam"),
                        WordToken("一起", "yī qǐ", "Together; in company (with)", "Kosakata HSK 2: 一起 (yī qǐ)"),
                        WordToken("吃饭", "chī fàn", "To have a meal", "Kosakata HSK 2: 吃饭 (chī fàn)"),
                        WordToken("吗", "ma", "Apakah (partikel tanya)", "Partikel di akhir kalimat interogatif ya/tidak")
                    )
                ),
                Sentence(
                    id = "s_seeyouthere_10",
                    hanzi = "A：还不知道。",
                    pinyin = "hái bù zhī dào",
                    translation = "Masih / Malahan Tidak Tahu / Mengetahui",
                    tokens = listOf(
                        WordToken("还", "hái", "Masih / Malahan", "Menyatakan kelanjutan situasi"),
                        WordToken("不", "bù", "Tidak", "Kata sangkalan untuk masa kini atau masa depan"),
                        WordToken("知道", "zhī dào", "Tahu / Mengetahui", "Memiliki informasi")
                    )
                ),
                Sentence(
                    id = "s_seeyouthere_11",
                    hanzi = "我们只打算一起喝喝咖啡，聊聊天。",
                    pinyin = "wǒ men zhǐ dǎ suàn yī qǐ hē hē kā fēi liáo liáo tiān",
                    translation = "Kami / Kita Only; merely; just To plan Together; in company (with) Minum Minum Kopi Have a chat; talk casually",
                    tokens = listOf(
                        WordToken("我们", "wǒ men", "Kami / Kita", "Kata ganti orang pertama jamak"),
                        WordToken("只", "zhǐ", "Only; merely; just", "Kosakata HSK 2: 只 (zhǐ)"),
                        WordToken("打算", "dǎ suàn", "To plan", "Kosakata HSK 2: 打算 (dǎ suàn)"),
                        WordToken("一起", "yī qǐ", "Together; in company (with)", "Kosakata HSK 2: 一起 (yī qǐ)"),
                        WordToken("喝", "hē", "Minum", "Aktivitas mengonsumsi cairan"),
                        WordToken("喝", "hē", "Minum", "Aktivitas mengonsumsi cairan"),
                        WordToken("咖啡", "kā fēi", "Kopi", "Minuman berkafein"),
                        WordToken("聊聊天", "liáo liáo tiān", "Have a chat; talk casually", "Kosakata HSK 2: 聊聊天 (liáo liáo tiān)")
                    )
                ),
                Sentence(
                    id = "s_seeyouthere_12",
                    hanzi = "B：你们喝完来旁边的公园吧。",
                    pinyin = "nǐ men hē wán lái páng biān de gōng yuán ba",
                    translation = "You (plural) Minum To finish Datang Side; adjacent place Punya / Yang (partikel posesif) Park (for public recreation) Kan / Mari (partikel saran)",
                    tokens = listOf(
                        WordToken("你们", "nǐ men", "You (plural)", "Kosakata HSK 2: 你们 (nǐ men)"),
                        WordToken("喝", "hē", "Minum", "Aktivitas mengonsumsi cairan"),
                        WordToken("完", "wán", "To finish", "Kosakata HSK 2: 完 (wán)"),
                        WordToken("来", "lái", "Datang", "Menuju ke arah pembicara"),
                        WordToken("旁边", "páng biān", "Side; adjacent place", "Kosakata HSK 2: 旁边 (páng biān)"),
                        WordToken("的", "de", "Punya / Yang (partikel posesif)", "Partikel penjelas modifikasi atau kepemilikan"),
                        WordToken("公园", "gōng yuán", "Park (for public recreation)", "Kosakata HSK 2: 公园 (gōng yuán)"),
                        WordToken("吧", "ba", "Kan / Mari (partikel saran)", "Partikel saran, ajakan, atau dugaan")
                    )
                ),
                Sentence(
                    id = "s_seeyouthere_13",
                    hanzi = "下午我会和几个朋友去公园晒太阳，然后一起玩飞盘。",
                    pinyin = "xià wǔ wǒ huì hé jǐ gè péng you qù gōng yuán shài tài yáng rán hòu yī qǐ wán fēi pán",
                    translation = "Sore hari Saya To be likely to; to be sure to Dan Several Classifier for people or objects in general Teman / Sahabat Pergi Park (for public recreation) (of the sun) to shine on Sun Then; after that; afterwards Together; in company (with) To play Frisbee",
                    tokens = listOf(
                        WordToken("下午", "xià wǔ", "Sore hari", "Waktu setelah tengah hari"),
                        WordToken("我", "wǒ", "Saya", "Kata ganti orang pertama tunggal"),
                        WordToken("会", "huì", "To be likely to; to be sure to", "Kosakata HSK 2: 会 (huì)"),
                        WordToken("和", "hé", "Dan", "Kata hubung setara"),
                        WordToken("几", "jǐ", "Several", "Kosakata HSK 2: 几 (jǐ)"),
                        WordToken("个", "gè", "Classifier for people or objects in general", "Kosakata HSK 2: 个 (gè)"),
                        WordToken("朋友", "péng you", "Teman / Sahabat", "Orang dekat"),
                        WordToken("去", "qù", "Pergi", "Berpindah tempat menjauhi pembicara"),
                        WordToken("公园", "gōng yuán", "Park (for public recreation)", "Kosakata HSK 2: 公园 (gōng yuán)"),
                        WordToken("晒", "shài", "(of the sun) to shine on", "Kosakata HSK 2: 晒 (shài)"),
                        WordToken("太阳", "tài yáng", "Sun", "Kosakata HSK 2: 太阳 (tài yáng)"),
                        WordToken("然后", "rán hòu", "Then; after that; afterwards", "Kosakata HSK 2: 然后 (rán hòu)"),
                        WordToken("一起", "yī qǐ", "Together; in company (with)", "Kosakata HSK 2: 一起 (yī qǐ)"),
                        WordToken("玩", "wán", "To play", "Kosakata HSK 2: 玩 (wán)"),
                        WordToken("飞盘", "fēi pán", "Frisbee", "Kosakata HSK 2: 飞盘 (fēi pán)")
                    )
                ),
                Sentence(
                    id = "s_seeyouthere_14",
                    hanzi = "你们也来吧！",
                    pinyin = "nǐ men yě lái ba",
                    translation = "You (plural) Juga / Pun Datang Kan / Mari (partikel saran)",
                    tokens = listOf(
                        WordToken("你们", "nǐ men", "You (plural)", "Kosakata HSK 2: 你们 (nǐ men)"),
                        WordToken("也", "yě", "Juga / Pun", "Partikel penanda kesamaan"),
                        WordToken("来", "lái", "Datang", "Menuju ke arah pembicara"),
                        WordToken("吧", "ba", "Kan / Mari (partikel saran)", "Partikel saran, ajakan, atau dugaan")
                    )
                ),
                Sentence(
                    id = "s_seeyouthere_15",
                    hanzi = "A：听起来不错！",
                    pinyin = "tīng qǐ lái bù cuò",
                    translation = "Mendengar Indicating the beginning and continuation of an action or a state Not bad",
                    tokens = listOf(
                        WordToken("听", "tīng", "Mendengar", "Aktivitas auditori"),
                        WordToken("起来", "qǐ lái", "Indicating the beginning and continuation of an action or a state", "Kosakata HSK 2: 起来 (qǐ lái)"),
                        WordToken("不错", "bù cuò", "Not bad", "Kosakata HSK 2: 不错 (bù cuò)")
                    )
                ),
                Sentence(
                    id = "s_seeyouthere_16",
                    hanzi = "你们几个人？",
                    pinyin = "nǐ men jǐ gè rén",
                    translation = "You (plural) How much Classifier for people or objects in general Person; people",
                    tokens = listOf(
                        WordToken("你们", "nǐ men", "You (plural)", "Kosakata HSK 2: 你们 (nǐ men)"),
                        WordToken("几", "jǐ", "How much", "Kosakata HSK 2: 几 (jǐ)"),
                        WordToken("个", "gè", "Classifier for people or objects in general", "Kosakata HSK 2: 个 (gè)"),
                        WordToken("人", "rén", "Person; people", "Kosakata HSK 2: 人 (rén)")
                    )
                ),
                Sentence(
                    id = "s_seeyouthere_17",
                    hanzi = "几点开始玩？",
                    pinyin = "jǐ diǎn kāi shǐ wán",
                    translation = "How much Pukul / Jam To begin To play",
                    tokens = listOf(
                        WordToken("几", "jǐ", "How much", "Kosakata HSK 2: 几 (jǐ)"),
                        WordToken("点", "diǎn", "Pukul / Jam", "Penunjuk waktu jam"),
                        WordToken("开始", "kāi shǐ", "To begin", "Kosakata HSK 2: 开始 (kāi shǐ)"),
                        WordToken("玩", "wán", "To play", "Kosakata HSK 2: 玩 (wán)")
                    )
                ),
                Sentence(
                    id = "s_seeyouthere_18",
                    hanzi = "B：我们有五个人，打算三点一刻在公园门口见面。",
                    pinyin = "wǒ men yǒu wǔ gè rén dǎ suàn sān diǎn yī kè zài gōng yuán mén kǒu jiàn miàn",
                    translation = "Kami / Kita Mempunyai / Ada Five Classifier for people or objects in general Person; people To plan Three Pukul / Jam One Quarter (hour) Di / Berada di Park (for public recreation) Doorway To meet; to see each other",
                    tokens = listOf(
                        WordToken("我们", "wǒ men", "Kami / Kita", "Kata ganti orang pertama jamak"),
                        WordToken("有", "yǒu", "Mempunyai / Ada", "Menyatakan kepemilikan atau eksistensi"),
                        WordToken("五", "wǔ", "Five", "Kosakata HSK 2: 五 (wǔ)"),
                        WordToken("个", "gè", "Classifier for people or objects in general", "Kosakata HSK 2: 个 (gè)"),
                        WordToken("人", "rén", "Person; people", "Kosakata HSK 2: 人 (rén)"),
                        WordToken("打算", "dǎ suàn", "To plan", "Kosakata HSK 2: 打算 (dǎ suàn)"),
                        WordToken("三", "sān", "Three", "Kosakata HSK 2: 三 (sān)"),
                        WordToken("点", "diǎn", "Pukul / Jam", "Penunjuk waktu jam"),
                        WordToken("一", "yī", "One", "Kosakata HSK 2: 一 (yī)"),
                        WordToken("刻", "kè", "Quarter (hour)", "Kosakata HSK 2: 刻 (kè)"),
                        WordToken("在", "zài", "Di / Berada di", "Preposisi lokasi atau aspek progresif"),
                        WordToken("公园", "gōng yuán", "Park (for public recreation)", "Kosakata HSK 2: 公园 (gōng yuán)"),
                        WordToken("门口", "mén kǒu", "Doorway", "Kosakata HSK 2: 门口 (mén kǒu)"),
                        WordToken("见面", "jiàn miàn", "To meet; to see each other", "Kosakata HSK 2: 见面 (jiàn miàn)")
                    )
                ),
                Sentence(
                    id = "s_seeyouthere_19",
                    hanzi = "A：太好了，下午我们也来。",
                    pinyin = "tài hǎo le xià wǔ wǒ men yě lái",
                    translation = "Terlalu Bagus / Baik Sudah (partikel perubahan situasi) Sore hari Kami / Kita Juga / Pun Datang",
                    tokens = listOf(
                        WordToken("太", "tài", "Terlalu", "Derajat melampaui batas"),
                        WordToken("好", "hǎo", "Bagus / Baik", "Kualitas positif"),
                        WordToken("了", "le", "Sudah (partikel perubahan situasi)", "Partikel aspek selesainya tindakan"),
                        WordToken("下午", "xià wǔ", "Sore hari", "Waktu setelah tengah hari"),
                        WordToken("我们", "wǒ men", "Kami / Kita", "Kata ganti orang pertama jamak"),
                        WordToken("也", "yě", "Juga / Pun", "Partikel penanda kesamaan"),
                        WordToken("来", "lái", "Datang", "Menuju ke arah pembicara")
                    )
                ),
                Sentence(
                    id = "s_seeyouthere_20",
                    hanzi = "不见不散！",
                    pinyin = "bù jiàn bù sàn",
                    translation = "Lit. even if we don&#x27;t see each other, don&#x27;t give up and leave (idiom)",
                    tokens = listOf(
                        WordToken("不见不散", "bù jiàn bù sàn", "Lit. even if we don&#x27;t see each other, don&#x27;t give up and leave (idiom)", "Kosakata HSK 2: 不见不散 (bù jiàn bù sàn)")
                    )
                )
            ),
            questions = listOf(
                StoryQuestion(
                    id = "q_seeyouthere_1",
                    questionText = "成语“不见不散”表达的是什么意思？ (Apa makna dari ungkapan lazim '不见不散'?)",
                    options = listOf("见不到面就不离开，一定会等到对方 (Tidak akan beranjak sebelum bertemu, pasti setia menunggu)", "不要再见面了 (Jangan pernah bertemu lagi)", "谁先到谁走 (Siapa yang sampai duluan boleh pergi)", "找不到地方就回家 (Kalau tak jumpa langsung pulang)"),
                    correctAnswerIndex = 0,
                    explanation = "Janji teguh untuk menanti di titik temu sampai sahabat tiba."
                ),
                StoryQuestion(
                    id = "q_seeyouthere_2",
                    questionText = "他们在故事中约定在什么地点见面？ (Di lokasi mana mereka sepakat untuk saling bertemu?)",
                    options = listOf("电影院门口 (Di depan pintu masuk bioskop)", "学校图书馆 (Perpustakaan sekolah)", "飞机场 (Bandara)", "大超市 (Supermarket besar)"),
                    correctAnswerIndex = 0,
                    explanation = "Titik pertemuan yang disepakati adalah di gerbang depan gedung bioskop."
                ),
                StoryQuestion(
                    id = "q_seeyouthere_3",
                    questionText = "他们约定几点在指定地点汇合？ (Pukul berapa jadwal janji temu mereka?)",
                    options = listOf("下午两点 (Pukul 2 siang)", "晚上七点 (Pukul 7 malam)", "早上八点 (Pukul 8 pagi)", "中午十二点 (Pukul 12 siang)"),
                    correctAnswerIndex = 1,
                    explanation = "Janji temu dijadwalkan pada pukul 19.00 malam."
                ),
                StoryQuestion(
                    id = "q_seeyouthere_4",
                    questionText = "如果其中一个人稍微迟到了几分钟，另一个人会怎么做？ (Apa yang dilakukan salah satu pihak bila rekannya telat beberapa menit?)",
                    options = listOf("耐心地在原地等待，履行不见不散的约定 (Sabar menunggu di tempat, menepati janji temu)", "生气质问并离开 (Marah-marah lalu pergi pulang)", "报警找人 (Lapor polisi)", "自己一个人回家 (Pulang sendirian)"),
                    correctAnswerIndex = 0,
                    explanation = "Prinsip '不见不散' menuntut kesabaran dan kesetiaan menjaga janji pertemanan."
                )
            )
        ),
        // Cerita Mandarin Bean 94 (HSK 2): Get Married (Menikah)
        Story(
            id = "story_get_married",
            titleHanzi = "结婚",
            titlePinyin = "Jiéhūn",
            titleTranslation = "Get Married (Menikah)",
            level = "HSK 2",
            category = "Pernikahan & Tradisi",
            description = "Suasana sukacita pesta pernikahan kerabat dengan dekorasi warna merah penuh harapan keberuntungan.",
            coverEmoji = "💍",
            coverImageRes = R.drawable.cover_story_get_married,
            estimatedReadMinutes = 2,
            sentences = listOf(
                Sentence(
                    id = "s_getmarry_1",
                    hanzi = "A：下个月八号我结婚，你来南湖酒店参加我的婚礼吧。",
                    pinyin = "xià gè yuè bā hào wǒ jié hūn nǐ lái Nán Hú jiǔ diàn cān jiā wǒ de hūn lǐ ba",
                    translation = "Later Classifier for people or objects in general Bulan Eight (bound form) bugle; trumpet Saya Menikah Kamu Datang South lake Hotel To participate My; mine Wedding ceremony Kan / Mari (partikel saran)",
                    tokens = listOf(
                        WordToken("下", "xià", "Later", "Kosakata HSK 2: 下 (xià)"),
                        WordToken("个", "gè", "Classifier for people or objects in general", "Kosakata HSK 2: 个 (gè)"),
                        WordToken("月", "yuè", "Bulan", "Satuan bulan"),
                        WordToken("八", "bā", "Eight", "Kosakata HSK 2: 八 (bā)"),
                        WordToken("号", "hào", "(bound form) bugle; trumpet", "Kosakata HSK 2: 号 (hào)"),
                        WordToken("我", "wǒ", "Saya", "Kata ganti orang pertama tunggal"),
                        WordToken("结婚", "jié hūn", "Menikah", "Membina ikatan pernikahan"),
                        WordToken("你", "nǐ", "Kamu", "Kata ganti orang kedua tunggal"),
                        WordToken("来", "lái", "Datang", "Menuju ke arah pembicara"),
                        WordToken("南湖", "Nán Hú", "South lake", "Kosakata HSK 2: 南湖 (Nán Hú)"),
                        WordToken("酒店", "jiǔ diàn", "Hotel", "Kosakata HSK 2: 酒店 (jiǔ diàn)"),
                        WordToken("参加", "cān jiā", "To participate", "Kosakata HSK 2: 参加 (cān jiā)"),
                        WordToken("我的", "wǒ de", "My; mine", "Kosakata HSK 2: 我的 (wǒ de)"),
                        WordToken("婚礼", "hūn lǐ", "Wedding ceremony", "Kosakata HSK 2: 婚礼 (hūn lǐ)"),
                        WordToken("吧", "ba", "Kan / Mari (partikel saran)", "Partikel saran, ajakan, atau dugaan")
                    )
                ),
                Sentence(
                    id = "s_getmarry_2",
                    hanzi = "B：恭喜恭喜！",
                    pinyin = "gōng xǐ gōng xǐ",
                    translation = "(interj.) congratulations! (interj.) congratulations!",
                    tokens = listOf(
                        WordToken("恭喜", "gōng xǐ", "(interj.) congratulations!", "Kosakata HSK 2: 恭喜 (gōng xǐ)"),
                        WordToken("恭喜", "gōng xǐ", "(interj.) congratulations!", "Kosakata HSK 2: 恭喜 (gōng xǐ)")
                    )
                ),
                Sentence(
                    id = "s_getmarry_3",
                    hanzi = "没想到你那么快就要结婚了。",
                    pinyin = "méi xiǎng dào nǐ nà me kuài jiù yào jié hūn le",
                    translation = "Belum / Tidak Ingin / Berpikir / Rindu To reach; to arrive Kamu Like that; in that way; to that extent Cepat Langsung / Segera / Maka Mau / Akan / Harus Menikah Sudah (partikel perubahan situasi)",
                    tokens = listOf(
                        WordToken("没", "méi", "Belum / Tidak", "Kata sangkalan untuk keberadaan atau masa lampau"),
                        WordToken("想", "xiǎng", "Ingin / Berpikir / Rindu", "Keinginan atau pemikiran batin"),
                        WordToken("到", "dào", "To reach; to arrive", "Kosakata HSK 2: 到 (dào)"),
                        WordToken("你", "nǐ", "Kamu", "Kata ganti orang kedua tunggal"),
                        WordToken("那么", "nà me", "Like that; in that way; to that extent", "Kosakata HSK 2: 那么 (nà me)"),
                        WordToken("快", "kuài", "Cepat", "Kecepatan tinggi"),
                        WordToken("就", "jiù", "Langsung / Segera / Maka", "Menyatakan ketepatan waktu atau kelogisan"),
                        WordToken("要", "yào", "Mau / Akan / Harus", "Menyatakan niat atau keharusan"),
                        WordToken("结婚", "jié hūn", "Menikah", "Membina ikatan pernikahan"),
                        WordToken("了", "le", "Sudah (partikel perubahan situasi)", "Partikel aspek selesainya tindakan")
                    )
                ),
                Sentence(
                    id = "s_getmarry_4",
                    hanzi = "八号是星期几？",
                    pinyin = "bā hào shì xīng qī jǐ",
                    translation = "Eight (bound form) bugle; trumpet Adalah Minggu / Pekan How much",
                    tokens = listOf(
                        WordToken("八", "bā", "Eight", "Kosakata HSK 2: 八 (bā)"),
                        WordToken("号", "hào", "(bound form) bugle; trumpet", "Kosakata HSK 2: 号 (hào)"),
                        WordToken("是", "shì", "Adalah", "Kopula penjelas"),
                        WordToken("星期", "xīng qī", "Minggu / Pekan", "Satuan pekan"),
                        WordToken("几", "jǐ", "How much", "Kosakata HSK 2: 几 (jǐ)")
                    )
                ),
                Sentence(
                    id = "s_getmarry_5",
                    hanzi = "A：八号应该是星期六。",
                    pinyin = "bā hào yīng gāi shì xīng qī liù",
                    translation = "Eight (bound form) bugle; trumpet Ought to; should; must Adalah Minggu / Pekan Six",
                    tokens = listOf(
                        WordToken("八", "bā", "Eight", "Kosakata HSK 2: 八 (bā)"),
                        WordToken("号", "hào", "(bound form) bugle; trumpet", "Kosakata HSK 2: 号 (hào)"),
                        WordToken("应该", "yīng gāi", "Ought to; should; must", "Kosakata HSK 2: 应该 (yīng gāi)"),
                        WordToken("是", "shì", "Adalah", "Kopula penjelas"),
                        WordToken("星期", "xīng qī", "Minggu / Pekan", "Satuan pekan"),
                        WordToken("六", "liù", "Six", "Kosakata HSK 2: 六 (liù)")
                    )
                ),
                Sentence(
                    id = "s_getmarry_6",
                    hanzi = "B：星期六没问题，我休息。",
                    pinyin = "xīng qī liù méi wèn tí wǒ xiū xi",
                    translation = "Minggu / Pekan Six Belum / Tidak Question Saya To rest",
                    tokens = listOf(
                        WordToken("星期", "xīng qī", "Minggu / Pekan", "Satuan pekan"),
                        WordToken("六", "liù", "Six", "Kosakata HSK 2: 六 (liù)"),
                        WordToken("没", "méi", "Belum / Tidak", "Kata sangkalan untuk keberadaan atau masa lampau"),
                        WordToken("问题", "wèn tí", "Question", "Kosakata HSK 2: 问题 (wèn tí)"),
                        WordToken("我", "wǒ", "Saya", "Kata ganti orang pertama tunggal"),
                        WordToken("休息", "xiū xi", "To rest", "Kosakata HSK 2: 休息 (xiū xi)")
                    )
                ),
                Sentence(
                    id = "s_getmarry_7",
                    hanzi = "到时候我会准备一个大红包送给你，真为你开心！",
                    pinyin = "dào shí hou wǒ huì zhǔn bèi yī gè dà hóng bāo sòng gěi nǐ zhēn wèi nǐ kāi xīn",
                    translation = "To reach; to arrive Time Saya To be likely to; to be sure to To prepare One Classifier for people or objects in general Besar Money wrapped in red as a gift Menghadiahkan / Mengantar Memberi / Kepada Kamu Sungguh / Benar-benar Because of Kamu To feel happy",
                    tokens = listOf(
                        WordToken("到", "dào", "To reach; to arrive", "Kosakata HSK 2: 到 (dào)"),
                        WordToken("时候", "shí hou", "Time", "Kosakata HSK 2: 时候 (shí hou)"),
                        WordToken("我", "wǒ", "Saya", "Kata ganti orang pertama tunggal"),
                        WordToken("会", "huì", "To be likely to; to be sure to", "Kosakata HSK 2: 会 (huì)"),
                        WordToken("准备", "zhǔn bèi", "To prepare", "Kosakata HSK 2: 准备 (zhǔn bèi)"),
                        WordToken("一", "yī", "One", "Kosakata HSK 2: 一 (yī)"),
                        WordToken("个", "gè", "Classifier for people or objects in general", "Kosakata HSK 2: 个 (gè)"),
                        WordToken("大", "dà", "Besar", "Ukuran fisik besar"),
                        WordToken("红包", "hóng bāo", "Money wrapped in red as a gift", "Kosakata HSK 2: 红包 (hóng bāo)"),
                        WordToken("送", "sòng", "Menghadiahkan / Mengantar", "Memberikan bingkisan atau mengantar"),
                        WordToken("给", "gěi", "Memberi / Kepada", "Tindakan memberi atau preposisi sasaran"),
                        WordToken("你", "nǐ", "Kamu", "Kata ganti orang kedua tunggal"),
                        WordToken("真", "zhēn", "Sungguh / Benar-benar", "Menyatakan keaslian rasa"),
                        WordToken("为", "wèi", "Because of", "Kosakata HSK 2: 为 (wèi)"),
                        WordToken("你", "nǐ", "Kamu", "Kata ganti orang kedua tunggal"),
                        WordToken("开心", "kāi xīn", "To feel happy", "Kosakata HSK 2: 开心 (kāi xīn)")
                    )
                ),
                Sentence(
                    id = "s_getmarry_8",
                    hanzi = "A：谢谢，谢谢！",
                    pinyin = "xiè xie xiè xie",
                    translation = "Thanks Thanks",
                    tokens = listOf(
                        WordToken("谢谢", "xiè xie", "Thanks", "Kosakata HSK 2: 谢谢 (xiè xie)"),
                        WordToken("谢谢", "xiè xie", "Thanks", "Kosakata HSK 2: 谢谢 (xiè xie)")
                    )
                ),
                Sentence(
                    id = "s_getmarry_9",
                    hanzi = "你呢？",
                    pinyin = "nǐ ne",
                    translation = "Kamu Bagaimana dengan / sedang (partikel modal)",
                    tokens = listOf(
                        WordToken("你", "nǐ", "Kamu", "Kata ganti orang kedua tunggal"),
                        WordToken("呢", "ne", "Bagaimana dengan / sedang (partikel modal)", "Partikel tanya atau penanda sedang berlangsung")
                    )
                ),
                Sentence(
                    id = "s_getmarry_10",
                    hanzi = "你准备什么时候结婚？",
                    pinyin = "nǐ zhǔn bèi shén me shí hou jié hūn",
                    translation = "Kamu To prepare What? Time Menikah",
                    tokens = listOf(
                        WordToken("你", "nǐ", "Kamu", "Kata ganti orang kedua tunggal"),
                        WordToken("准备", "zhǔn bèi", "To prepare", "Kosakata HSK 2: 准备 (zhǔn bèi)"),
                        WordToken("什么", "shén me", "What?", "Kosakata HSK 2: 什么 (shén me)"),
                        WordToken("时候", "shí hou", "Time", "Kosakata HSK 2: 时候 (shí hou)"),
                        WordToken("结婚", "jié hūn", "Menikah", "Membina ikatan pernikahan")
                    )
                ),
                Sentence(
                    id = "s_getmarry_11",
                    hanzi = "B：我？",
                    pinyin = "wǒ",
                    translation = "Saya",
                    tokens = listOf(
                        WordToken("我", "wǒ", "Saya", "Kata ganti orang pertama tunggal")
                    )
                ),
                Sentence(
                    id = "s_getmarry_12",
                    hanzi = "和你分手以后，我还没有别的女朋友呢。",
                    pinyin = "hé nǐ fēn shǒu yǐ hòu wǒ hái méi yǒu bié de nǚ péng you ne",
                    translation = "Dan Kamu To part company After Saya Masih / Malahan Tidak ada / Tidak punya Else Pacar perempuan Bagaimana dengan / sedang (partikel modal)",
                    tokens = listOf(
                        WordToken("和", "hé", "Dan", "Kata hubung setara"),
                        WordToken("你", "nǐ", "Kamu", "Kata ganti orang kedua tunggal"),
                        WordToken("分手", "fēn shǒu", "To part company", "Kosakata HSK 2: 分手 (fēn shǒu)"),
                        WordToken("以后", "yǐ hòu", "After", "Kosakata HSK 2: 以后 (yǐ hòu)"),
                        WordToken("我", "wǒ", "Saya", "Kata ganti orang pertama tunggal"),
                        WordToken("还", "hái", "Masih / Malahan", "Menyatakan kelanjutan situasi"),
                        WordToken("没有", "méi yǒu", "Tidak ada / Tidak punya", "Bentuk negasi dari 有"),
                        WordToken("别的", "bié de", "Else", "Kosakata HSK 2: 别的 (bié de)"),
                        WordToken("女朋友", "nǚ péng you", "Pacar perempuan", "Pasangan wanita"),
                        WordToken("呢", "ne", "Bagaimana dengan / sedang (partikel modal)", "Partikel tanya atau penanda sedang berlangsung")
                    )
                ),
                Sentence(
                    id = "s_getmarry_13",
                    hanzi = "可能有点儿不想再认识其他女孩子了。",
                    pinyin = "kě néng yǒu diǎn r bù xiǎng zài rèn shi qí tā nǚ hái zi le",
                    translation = "Might (happen) Slightly Tidak Ingin / Berpikir / Rindu Lagi / Sekali lagi Mengenal Other Girl Sudah (partikel perubahan situasi)",
                    tokens = listOf(
                        WordToken("可能", "kě néng", "Might (happen)", "Kosakata HSK 2: 可能 (kě néng)"),
                        WordToken("有点儿", "yǒu diǎn r", "Slightly", "Kosakata HSK 2: 有点儿 (yǒu diǎn r)"),
                        WordToken("不", "bù", "Tidak", "Kata sangkalan untuk masa kini atau masa depan"),
                        WordToken("想", "xiǎng", "Ingin / Berpikir / Rindu", "Keinginan atau pemikiran batin"),
                        WordToken("再", "zài", "Lagi / Sekali lagi", "Pengulangan tindakan mendatang"),
                        WordToken("认识", "rèn shi", "Mengenal", "Mengetahui seseorang secara akrab"),
                        WordToken("其他", "qí tā", "Other", "Kosakata HSK 2: 其他 (qí tā)"),
                        WordToken("女孩子", "nǚ hái zi", "Girl", "Kosakata HSK 2: 女孩子 (nǚ hái zi)"),
                        WordToken("了", "le", "Sudah (partikel perubahan situasi)", "Partikel aspek selesainya tindakan")
                    )
                ),
                Sentence(
                    id = "s_getmarry_14",
                    hanzi = "A：你别这样……我们都分手三年了。",
                    pinyin = "nǐ bié zhè yàng wǒ men dōu fēn shǒu sān nián le",
                    translation = "Kamu Don&#x27;t ...! This way; like this; so Kami / Kita Semua / Seluruhnya To part company Three Tahun Sudah (partikel perubahan situasi)",
                    tokens = listOf(
                        WordToken("你", "nǐ", "Kamu", "Kata ganti orang kedua tunggal"),
                        WordToken("别", "bié", "Don&#x27;t ...!", "Kosakata HSK 2: 别 (bié)"),
                        WordToken("这样", "zhè yàng", "This way; like this; so", "Kosakata HSK 2: 这样 (zhè yàng)"),
                        WordToken("我们", "wǒ men", "Kami / Kita", "Kata ganti orang pertama jamak"),
                        WordToken("都", "dōu", "Semua / Seluruhnya", "Menyatakan keuniversalan subjek"),
                        WordToken("分手", "fēn shǒu", "To part company", "Kosakata HSK 2: 分手 (fēn shǒu)"),
                        WordToken("三", "sān", "Three", "Kosakata HSK 2: 三 (sān)"),
                        WordToken("年", "nián", "Tahun", "Satuan tahun"),
                        WordToken("了", "le", "Sudah (partikel perubahan situasi)", "Partikel aspek selesainya tindakan")
                    )
                ),
                Sentence(
                    id = "s_getmarry_15",
                    hanzi = "开始新生活吧，好吗？",
                    pinyin = "kāi shǐ xīn shēng huó ba hǎo ma",
                    translation = "To begin Baru Life Kan / Mari (partikel saran) Bagus / Baik Apakah (partikel tanya)",
                    tokens = listOf(
                        WordToken("开始", "kāi shǐ", "To begin", "Kosakata HSK 2: 开始 (kāi shǐ)"),
                        WordToken("新", "xīn", "Baru", "Benda atau waktu mutakhir"),
                        WordToken("生活", "shēng huó", "Life", "Kosakata HSK 2: 生活 (shēng huó)"),
                        WordToken("吧", "ba", "Kan / Mari (partikel saran)", "Partikel saran, ajakan, atau dugaan"),
                        WordToken("好", "hǎo", "Bagus / Baik", "Kualitas positif"),
                        WordToken("吗", "ma", "Apakah (partikel tanya)", "Partikel di akhir kalimat interogatif ya/tidak")
                    )
                ),
                Sentence(
                    id = "s_getmarry_16",
                    hanzi = "B：没事儿，你过得幸福就好。",
                    pinyin = "méi shì r nǐ guò de xìng fú jiù hǎo",
                    translation = "It&#x27;s not important Kamu To cross Dengan (partikel pelengkap derajat) Happy Langsung / Segera / Maka Bagus / Baik",
                    tokens = listOf(
                        WordToken("没事儿", "méi shì r", "It&#x27;s not important", "Kosakata HSK 2: 没事儿 (méi shì r)"),
                        WordToken("你", "nǐ", "Kamu", "Kata ganti orang kedua tunggal"),
                        WordToken("过", "guò", "To cross", "Kosakata HSK 2: 过 (guò)"),
                        WordToken("得", "de", "Dengan (partikel pelengkap derajat)", "Partikel penunjuk derajat hasil tindakan"),
                        WordToken("幸福", "xìng fú", "Happy", "Kosakata HSK 2: 幸福 (xìng fú)"),
                        WordToken("就", "jiù", "Langsung / Segera / Maka", "Menyatakan ketepatan waktu atau kelogisan"),
                        WordToken("好", "hǎo", "Bagus / Baik", "Kualitas positif")
                    )
                ),
                Sentence(
                    id = "s_getmarry_17",
                    hanzi = "知道你幸福，我就很开心。",
                    pinyin = "zhī dào nǐ xìng fú wǒ jiù hěn kāi xīn",
                    translation = "Tahu / Mengetahui Kamu Happy Saya Langsung / Segera / Maka Sangat To feel happy",
                    tokens = listOf(
                        WordToken("知道", "zhī dào", "Tahu / Mengetahui", "Memiliki informasi"),
                        WordToken("你", "nǐ", "Kamu", "Kata ganti orang kedua tunggal"),
                        WordToken("幸福", "xìng fú", "Happy", "Kosakata HSK 2: 幸福 (xìng fú)"),
                        WordToken("我", "wǒ", "Saya", "Kata ganti orang pertama tunggal"),
                        WordToken("就", "jiù", "Langsung / Segera / Maka", "Menyatakan ketepatan waktu atau kelogisan"),
                        WordToken("很", "hěn", "Sangat", "Tingkat derajat"),
                        WordToken("开心", "kāi xīn", "To feel happy", "Kosakata HSK 2: 开心 (kāi xīn)")
                    )
                ),
                Sentence(
                    id = "s_getmarry_18",
                    hanzi = "A：你也要幸福啊！",
                    pinyin = "nǐ yě yào xìng fú a",
                    translation = "Kamu Juga / Pun Mau / Akan / Harus Happy Modal particle ending sentence, showing affirmation, approval, or consent",
                    tokens = listOf(
                        WordToken("你", "nǐ", "Kamu", "Kata ganti orang kedua tunggal"),
                        WordToken("也", "yě", "Juga / Pun", "Partikel penanda kesamaan"),
                        WordToken("要", "yào", "Mau / Akan / Harus", "Menyatakan niat atau keharusan"),
                        WordToken("幸福", "xìng fú", "Happy", "Kosakata HSK 2: 幸福 (xìng fú)"),
                        WordToken("啊", "a", "Modal particle ending sentence, showing affirmation, approval, or consent", "Kosakata HSK 2: 啊 (a)")
                    )
                )
            ),
            questions = listOf(
                StoryQuestion(
                    id = "q_getmarry_1",
                    questionText = "在传统中国婚礼上，最喜庆吉利的颜色是什么？ (Warna apa yang melambangkan keberuntungan dalam pernikahan tradisi Tiongkok?)",
                    options = listOf("黑色 (Hitam)", "红色 (Merah)", "白色 (Putih)", "灰色 (Abu-abu)"),
                    correctAnswerIndex = 1,
                    explanation = "Warna merah melambangkan kebahagiaan, kemakmuran, dan kehangatan nasib baik."
                ),
                StoryQuestion(
                    id = "q_getmarry_2",
                    questionText = "客人们去参加婚礼通常会送给新人什么？ (Bingkisan apa yang lazim dihadiahkan para tamu kepada mempelai?)",
                    options = listOf("装有礼金的红色信封（红包） (Amplop merah berisi hadiah uang / hongbao)", "旧报纸 (Koran bekas)", "一盒药 (Sekotak obat)", "黑雨伞 (Payung hitam)"),
                    correctAnswerIndex = 0,
                    explanation = "Pemberian angpao merah (hóngbāo) adalah wujud doa restu tulus bagi kedua mempelai."
                ),
                StoryQuestion(
                    id = "q_getmarry_3",
                    questionText = "新郎和新娘在婚礼上感觉怎么样？ (Bagaimana raut emosi kedua mempelai sepanjang resepsi?)",
                    options = listOf("满脸笑容，幸福甜蜜 (Penuh senyuman, memancarkan rasa bahagia manis)", "非常伤心 (Sangat sedih)", "无精打采 (Lesu tidak bersemangat)", "只想睡觉 (Hanya ingin tidur)"),
                    correctAnswerIndex = 0,
                    explanation = "Ikatan suci pernikahan disambut dengan rasa syukur dan senyuman bahagia."
                ),
                StoryQuestion(
                    id = "q_getmarry_4",
                    questionText = "参加婚礼的亲朋好友们向新人表达了什么祝福？ (Doa restu apa yang dihaturkan sanak saudara kepada mempelai?)",
                    options = listOf("早日生病 (Lekas jatuh sakit)", "白头偕老，百年好合，幸福美满 (Semoga rukun bahagia hingga rambut memutih)", "不要在一起 (Jangan bersama)", "天天吵架 (Setiap hari bertengkar)"),
                    correctAnswerIndex = 1,
                    explanation = "Ucapan '百年好合' dan '白头偕老' adalah doa abadi bagi kelanggengan rumah tangga."
                )
            )
        ),
        // Cerita Mandarin Bean 95 (HSK 2): Cut Cake (Memotong Kue)
        Story(
            id = "story_cut_cake",
            titleHanzi = "切蛋糕",
            titlePinyin = "Qiē Dàngāo",
            titleTranslation = "Cut Cake (Memotong Kue)",
            level = "HSK 2",
            category = "Keluarga & Humor",
            description = "Momen seru saat membagi kue ulang tahun secara adil dan merata di antara teman-teman yang hadir.",
            coverEmoji = "🎂",
            coverImageRes = R.drawable.cover_story_cut_cake,
            estimatedReadMinutes = 2,
            sentences = listOf(
                Sentence(
                    id = "s_cutcake_1",
                    hanzi = "小龙今年7岁，他的妹妹今年6岁。",
                    pinyin = "xiǎo lóng jīn nián suì tā de mèi mei jīn nián suì",
                    translation = "Snake (as one of the 12 chinese zodiac animals) This year Classifier for years (of age) Dia (laki-laki) Punya / Yang (partikel posesif) Adik perempuan This year Classifier for years (of age)",
                    tokens = listOf(
                        WordToken("小龙", "xiǎo lóng", "Snake (as one of the 12 chinese zodiac animals)", "Kosakata HSK 2: 小龙 (xiǎo lóng)"),
                        WordToken("今年", "jīn nián", "This year", "Kosakata HSK 2: 今年 (jīn nián)"),
                        WordToken("岁", "suì", "Classifier for years (of age)", "Kosakata HSK 2: 岁 (suì)"),
                        WordToken("他", "tā", "Dia (laki-laki)", "Kata ganti orang ketiga tunggal"),
                        WordToken("的", "de", "Punya / Yang (partikel posesif)", "Partikel penjelas modifikasi atau kepemilikan"),
                        WordToken("妹妹", "mèi mei", "Adik perempuan", "Saudari kandung termuda"),
                        WordToken("今年", "jīn nián", "This year", "Kosakata HSK 2: 今年 (jīn nián)"),
                        WordToken("岁", "suì", "Classifier for years (of age)", "Kosakata HSK 2: 岁 (suì)")
                    )
                ),
                Sentence(
                    id = "s_cutcake_2",
                    hanzi = "今天是妈妈的生日，爸爸买了一个大蛋糕。",
                    pinyin = "jīn tiān shì mā ma de shēng rì bà ba mǎi le yī gè dà dàn gāo",
                    translation = "Hari ini Adalah Ibu Punya / Yang (partikel posesif) Hari ulang tahun Ayah Membeli Sudah (partikel perubahan situasi) One Classifier for people or objects in general Besar Kue tart / Cake",
                    tokens = listOf(
                        WordToken("今天", "jīn tiān", "Hari ini", "Keterangan waktu sekarang"),
                        WordToken("是", "shì", "Adalah", "Kopula penjelas"),
                        WordToken("妈妈", "mā ma", "Ibu", "Anggota keluarga"),
                        WordToken("的", "de", "Punya / Yang (partikel posesif)", "Partikel penjelas modifikasi atau kepemilikan"),
                        WordToken("生日", "shēng rì", "Hari ulang tahun", "Hari kelahiran"),
                        WordToken("爸爸", "bà ba", "Ayah", "Anggota keluarga"),
                        WordToken("买", "mǎi", "Membeli", "Transaksi belanja"),
                        WordToken("了", "le", "Sudah (partikel perubahan situasi)", "Partikel aspek selesainya tindakan"),
                        WordToken("一", "yī", "One", "Kosakata HSK 2: 一 (yī)"),
                        WordToken("个", "gè", "Classifier for people or objects in general", "Kosakata HSK 2: 个 (gè)"),
                        WordToken("大", "dà", "Besar", "Ukuran fisik besar"),
                        WordToken("蛋糕", "dàn gāo", "Kue tart / Cake", "Makanan manis perayaan")
                    )
                ),
                Sentence(
                    id = "s_cutcake_3",
                    hanzi = "吃蛋糕的时候，妈妈把刀给了小龙，说：“今天你来切蛋糕，你和妹妹一人吃一块。”",
                    pinyin = "chī dàn gāo de shí hou mā ma bǎ dāo gěi le xiǎo lóng shuō jīn tiān nǐ lái qiē dàn gāo nǐ hé mèi mei yī rén chī yī kuài",
                    translation = "Makan Kue tart / Cake Punya / Yang (partikel posesif) Time Ibu (used to put the object before the verb: 把[ba3] + {noun} + {verb}) Knife; blade; single-edged sword; cutlass Memberi / Kepada Sudah (partikel perubahan situasi) Snake (as one of the 12 chinese zodiac animals) Berbicara / Berkata Hari ini Kamu Datang To cut; to slice; to carve Kue tart / Cake Kamu Dan Adik perempuan One Person; people Makan One Classifier for pieces of cloth, cake, soap etc",
                    tokens = listOf(
                        WordToken("吃", "chī", "Makan", "Aktivitas mengonsumsi makanan"),
                        WordToken("蛋糕", "dàn gāo", "Kue tart / Cake", "Makanan manis perayaan"),
                        WordToken("的", "de", "Punya / Yang (partikel posesif)", "Partikel penjelas modifikasi atau kepemilikan"),
                        WordToken("时候", "shí hou", "Time", "Kosakata HSK 2: 时候 (shí hou)"),
                        WordToken("妈妈", "mā ma", "Ibu", "Anggota keluarga"),
                        WordToken("把", "bǎ", "(used to put the object before the verb: 把[ba3] + {noun} + {verb})", "Kosakata HSK 2: 把 (bǎ)"),
                        WordToken("刀", "dāo", "Knife; blade; single-edged sword; cutlass", "Kosakata HSK 2: 刀 (dāo)"),
                        WordToken("给", "gěi", "Memberi / Kepada", "Tindakan memberi atau preposisi sasaran"),
                        WordToken("了", "le", "Sudah (partikel perubahan situasi)", "Partikel aspek selesainya tindakan"),
                        WordToken("小龙", "xiǎo lóng", "Snake (as one of the 12 chinese zodiac animals)", "Kosakata HSK 2: 小龙 (xiǎo lóng)"),
                        WordToken("说", "shuō", "Berbicara / Berkata", "Menyampaikan ucapan"),
                        WordToken("今天", "jīn tiān", "Hari ini", "Keterangan waktu sekarang"),
                        WordToken("你", "nǐ", "Kamu", "Kata ganti orang kedua tunggal"),
                        WordToken("来", "lái", "Datang", "Menuju ke arah pembicara"),
                        WordToken("切", "qiē", "To cut; to slice; to carve", "Kosakata HSK 2: 切 (qiē)"),
                        WordToken("蛋糕", "dàn gāo", "Kue tart / Cake", "Makanan manis perayaan"),
                        WordToken("你", "nǐ", "Kamu", "Kata ganti orang kedua tunggal"),
                        WordToken("和", "hé", "Dan", "Kata hubung setara"),
                        WordToken("妹妹", "mèi mei", "Adik perempuan", "Saudari kandung termuda"),
                        WordToken("一", "yī", "One", "Kosakata HSK 2: 一 (yī)"),
                        WordToken("人", "rén", "Person; people", "Kosakata HSK 2: 人 (rén)"),
                        WordToken("吃", "chī", "Makan", "Aktivitas mengonsumsi makanan"),
                        WordToken("一", "yī", "One", "Kosakata HSK 2: 一 (yī)"),
                        WordToken("块", "kuài", "Classifier for pieces of cloth, cake, soap etc", "Kosakata HSK 2: 块 (kuài)")
                    )
                ),
                Sentence(
                    id = "s_cutcake_4",
                    hanzi = "小龙非常高兴，这是他第一次切蛋糕。",
                    pinyin = "xiǎo lóng fēi cháng gāo xìng zhè shì tā dì yī cì qiē dàn gāo",
                    translation = "Snake (as one of the 12 chinese zodiac animals) Sangat / Amat Senang / Gembira This; these Adalah Dia (laki-laki) First Classifier for enumerated events: time To cut; to slice; to carve Kue tart / Cake",
                    tokens = listOf(
                        WordToken("小龙", "xiǎo lóng", "Snake (as one of the 12 chinese zodiac animals)", "Kosakata HSK 2: 小龙 (xiǎo lóng)"),
                        WordToken("非常", "fēi cháng", "Sangat / Amat", "Tingkat intensitas tinggi"),
                        WordToken("高兴", "gāo xìng", "Senang / Gembira", "Perasaan ceria bahagia"),
                        WordToken("这", "zhè", "This; these", "Kosakata HSK 2: 这 (zhè)"),
                        WordToken("是", "shì", "Adalah", "Kopula penjelas"),
                        WordToken("他", "tā", "Dia (laki-laki)", "Kata ganti orang ketiga tunggal"),
                        WordToken("第一", "dì yī", "First", "Kosakata HSK 2: 第一 (dì yī)"),
                        WordToken("次", "cì", "Classifier for enumerated events: time", "Kosakata HSK 2: 次 (cì)"),
                        WordToken("切", "qiē", "To cut; to slice; to carve", "Kosakata HSK 2: 切 (qiē)"),
                        WordToken("蛋糕", "dàn gāo", "Kue tart / Cake", "Makanan manis perayaan")
                    )
                ),
                Sentence(
                    id = "s_cutcake_5",
                    hanzi = "妈妈又说：“不过，你要像个绅士一样。”",
                    pinyin = "mā ma yòu shuō bù guò nǐ yào xiàng gè shēn shì yī yàng",
                    translation = "Ibu Lagi (telah terjadi) Berbicara / Berkata But Kamu Mau / Akan / Harus To resemble Classifier for people or objects in general Gentleman Just like",
                    tokens = listOf(
                        WordToken("妈妈", "mā ma", "Ibu", "Anggota keluarga"),
                        WordToken("又", "yòu", "Lagi (telah terjadi)", "Pengulangan tindakan lampau"),
                        WordToken("说", "shuō", "Berbicara / Berkata", "Menyampaikan ucapan"),
                        WordToken("不过", "bù guò", "But", "Kosakata HSK 2: 不过 (bù guò)"),
                        WordToken("你", "nǐ", "Kamu", "Kata ganti orang kedua tunggal"),
                        WordToken("要", "yào", "Mau / Akan / Harus", "Menyatakan niat atau keharusan"),
                        WordToken("像", "xiàng", "To resemble", "Kosakata HSK 2: 像 (xiàng)"),
                        WordToken("个", "gè", "Classifier for people or objects in general", "Kosakata HSK 2: 个 (gè)"),
                        WordToken("绅士", "shēn shì", "Gentleman", "Kosakata HSK 2: 绅士 (shēn shì)"),
                        WordToken("一样", "yī yàng", "Just like", "Kosakata HSK 2: 一样 (yī yàng)")
                    )
                ),
                Sentence(
                    id = "s_cutcake_6",
                    hanzi = "小龙问：“绅士？",
                    pinyin = "xiǎo lóng wèn shēn shì",
                    translation = "Snake (as one of the 12 chinese zodiac animals) To ask; to inquire Gentleman",
                    tokens = listOf(
                        WordToken("小龙", "xiǎo lóng", "Snake (as one of the 12 chinese zodiac animals)", "Kosakata HSK 2: 小龙 (xiǎo lóng)"),
                        WordToken("问", "wèn", "To ask; to inquire", "Kosakata HSK 2: 问 (wèn)"),
                        WordToken("绅士", "shēn shì", "Gentleman", "Kosakata HSK 2: 绅士 (shēn shì)")
                    )
                ),
                Sentence(
                    id = "s_cutcake_7",
                    hanzi = "绅士会怎么做？”",
                    pinyin = "shēn shì huì zěn me zuò",
                    translation = "Gentleman To be likely to; to be sure to How? Membuat / Mengerjakan",
                    tokens = listOf(
                        WordToken("绅士", "shēn shì", "Gentleman", "Kosakata HSK 2: 绅士 (shēn shì)"),
                        WordToken("会", "huì", "To be likely to; to be sure to", "Kosakata HSK 2: 会 (huì)"),
                        WordToken("怎么", "zěn me", "How?", "Kosakata HSK 2: 怎么 (zěn me)"),
                        WordToken("做", "zuò", "Membuat / Mengerjakan", "Aktivitas kerja")
                    )
                ),
                Sentence(
                    id = "s_cutcake_8",
                    hanzi = "妈妈回答说：“绅士会把大的那一块给别人，自己吃小的那一块。”",
                    pinyin = "mā ma huí dá shuō shēn shì huì bǎ dà de nà yī kuài gěi bié rén zì jǐ chī xiǎo de nà yī kuài",
                    translation = "Ibu To reply; to answer Berbicara / Berkata Gentleman To be likely to; to be sure to (used to put the object before the verb: 把[ba3] + {noun} + {verb}) Besar Punya / Yang (partikel posesif) (specifier) that; the; those One Lump; chunk; piece Memberi / Kepada Other people; others; other person Oneself; (attributive) one&#x27;s own Makan Kecil Punya / Yang (partikel posesif) (specifier) that; the; those A piece; a chunk",
                    tokens = listOf(
                        WordToken("妈妈", "mā ma", "Ibu", "Anggota keluarga"),
                        WordToken("回答", "huí dá", "To reply; to answer", "Kosakata HSK 2: 回答 (huí dá)"),
                        WordToken("说", "shuō", "Berbicara / Berkata", "Menyampaikan ucapan"),
                        WordToken("绅士", "shēn shì", "Gentleman", "Kosakata HSK 2: 绅士 (shēn shì)"),
                        WordToken("会", "huì", "To be likely to; to be sure to", "Kosakata HSK 2: 会 (huì)"),
                        WordToken("把", "bǎ", "(used to put the object before the verb: 把[ba3] + {noun} + {verb})", "Kosakata HSK 2: 把 (bǎ)"),
                        WordToken("大", "dà", "Besar", "Ukuran fisik besar"),
                        WordToken("的", "de", "Punya / Yang (partikel posesif)", "Partikel penjelas modifikasi atau kepemilikan"),
                        WordToken("那", "nà", "(specifier) that; the; those", "Kosakata HSK 2: 那 (nà)"),
                        WordToken("一", "yī", "One", "Kosakata HSK 2: 一 (yī)"),
                        WordToken("块", "kuài", "Lump; chunk; piece", "Kosakata HSK 2: 块 (kuài)"),
                        WordToken("给", "gěi", "Memberi / Kepada", "Tindakan memberi atau preposisi sasaran"),
                        WordToken("别人", "bié rén", "Other people; others; other person", "Kosakata HSK 2: 别人 (bié rén)"),
                        WordToken("自己", "zì jǐ", "Oneself; (attributive) one&#x27;s own", "Kosakata HSK 2: 自己 (zì jǐ)"),
                        WordToken("吃", "chī", "Makan", "Aktivitas mengonsumsi makanan"),
                        WordToken("小", "xiǎo", "Kecil", "Ukuran fisik kecil"),
                        WordToken("的", "de", "Punya / Yang (partikel posesif)", "Partikel penjelas modifikasi atau kepemilikan"),
                        WordToken("那", "nà", "(specifier) that; the; those", "Kosakata HSK 2: 那 (nà)"),
                        WordToken("一块", "yī kuài", "A piece; a chunk", "Kosakata HSK 2: 一块 (yī kuài)")
                    )
                ),
                Sentence(
                    id = "s_cutcake_9",
                    hanzi = "小龙想了想，对妹妹说：“妹妹，今天你来切蛋糕吧！",
                    pinyin = "xiǎo lóng xiǎng le xiǎng duì mèi mei shuō mèi mei jīn tiān nǐ lái qiē dàn gāo ba",
                    translation = "Snake (as one of the 12 chinese zodiac animals) Ingin / Berpikir / Rindu Sudah (partikel perubahan situasi) Ingin / Berpikir / Rindu Towards; at; for Adik perempuan Berbicara / Berkata Adik perempuan Hari ini Kamu Datang To cut; to slice; to carve Kue tart / Cake Kan / Mari (partikel saran)",
                    tokens = listOf(
                        WordToken("小龙", "xiǎo lóng", "Snake (as one of the 12 chinese zodiac animals)", "Kosakata HSK 2: 小龙 (xiǎo lóng)"),
                        WordToken("想", "xiǎng", "Ingin / Berpikir / Rindu", "Keinginan atau pemikiran batin"),
                        WordToken("了", "le", "Sudah (partikel perubahan situasi)", "Partikel aspek selesainya tindakan"),
                        WordToken("想", "xiǎng", "Ingin / Berpikir / Rindu", "Keinginan atau pemikiran batin"),
                        WordToken("对", "duì", "Towards; at; for", "Kosakata HSK 2: 对 (duì)"),
                        WordToken("妹妹", "mèi mei", "Adik perempuan", "Saudari kandung termuda"),
                        WordToken("说", "shuō", "Berbicara / Berkata", "Menyampaikan ucapan"),
                        WordToken("妹妹", "mèi mei", "Adik perempuan", "Saudari kandung termuda"),
                        WordToken("今天", "jīn tiān", "Hari ini", "Keterangan waktu sekarang"),
                        WordToken("你", "nǐ", "Kamu", "Kata ganti orang kedua tunggal"),
                        WordToken("来", "lái", "Datang", "Menuju ke arah pembicara"),
                        WordToken("切", "qiē", "To cut; to slice; to carve", "Kosakata HSK 2: 切 (qiē)"),
                        WordToken("蛋糕", "dàn gāo", "Kue tart / Cake", "Makanan manis perayaan"),
                        WordToken("吧", "ba", "Kan / Mari (partikel saran)", "Partikel saran, ajakan, atau dugaan")
                    )
                ),
                Sentence(
                    id = "s_cutcake_10",
                    hanzi = "你要像个绅士一样。”",
                    pinyin = "nǐ yào xiàng gè shēn shì yī yàng",
                    translation = "Kamu Mau / Akan / Harus To resemble Classifier for people or objects in general Gentleman Just like",
                    tokens = listOf(
                        WordToken("你", "nǐ", "Kamu", "Kata ganti orang kedua tunggal"),
                        WordToken("要", "yào", "Mau / Akan / Harus", "Menyatakan niat atau keharusan"),
                        WordToken("像", "xiàng", "To resemble", "Kosakata HSK 2: 像 (xiàng)"),
                        WordToken("个", "gè", "Classifier for people or objects in general", "Kosakata HSK 2: 个 (gè)"),
                        WordToken("绅士", "shēn shì", "Gentleman", "Kosakata HSK 2: 绅士 (shēn shì)"),
                        WordToken("一样", "yī yàng", "Just like", "Kosakata HSK 2: 一样 (yī yàng)")
                    )
                )
            ),
            questions = listOf(
                StoryQuestion(
                    id = "q_cutcake_1",
                    questionText = "大家唱完生日歌后下一步要做什么？ (Apa yang dilakukan setelah selesai menyanyikan lagu selamat ulang tahun?)",
                    options = listOf("吹蜡烛并切蛋糕 (Meniup lilin lalu memotong kue tart)", "收拾书包走人 (Meremas tas langsung pulang)", "打开电脑写作业 (Membuka laptop mengerjakan tugas)", "去操场跑步 (Pergi lari di lapangan)"),
                    correctAnswerIndex = 0,
                    explanation = "Ritual tiup lilin dan pemotongan kue tart adalah puncak pesta ulang tahun."
                ),
                StoryQuestion(
                    id = "q_cutcake_2",
                    questionText = "生日的主人公许了什么愿望？ (Harapan apa yang dipanjatkan oleh sang empunya ulang tahun?)",
                    options = listOf("希望所有人考试满分、身体健康 (Berharap semua orang sehat dan studinya berhasil)", "想买十辆汽车 (Ingin beli 10 mobil)", "希望不上课 (Berharap tidak usah sekolah)", "没有许愿 (Tidak berdoa)"),
                    correctAnswerIndex = 0,
                    explanation = "Doa yang dipanjatkan mencerminkan kepedulian bagi kebahagiaan keluarga dan sahabat."
                ),
                StoryQuestion(
                    id = "q_cutcake_3",
                    questionText = "切蛋糕时，大家是如何分配蛋糕的？ (Bagaimana kue tart dibagi ke seluruh piring tamu?)",
                    options = listOf("每个人都分到了切得整齐的一块 (Setiap orang mendapatkan sepotong kue yang rapi)", "一个人全拿走 (Diambil habis satu orang)", "扔在地上 (Dilempar ke lantai)", "只给寿星吃 (Hanya diberikan kepada yang berulang tahun)"),
                    correctAnswerIndex = 0,
                    explanation = "Kue dibagikan secara adil agar seluruh tamu dapat merasakan manisnya kebersamaan."
                ),
                StoryQuestion(
                    id = "q_cutcake_4",
                    questionText = "在这个庆祝活动中，最重要的是什么？ (Nilai apakah yang paling berharga dalam perayaan ini?)",
                    options = listOf("蛋糕有多贵 (Seberapa mahal harga kue)", "朋友相聚分享喜悦的温暖气氛 (Kehangatan berkumpul dan berbagi kebahagiaan antar sahabat)", "吃了多少克糖 (Berapa gram gula yang ditelan)", "穿了多漂亮的衣服 (Seberapa mewah busana yang dipakai)"),
                    correctAnswerIndex = 1,
                    explanation = "Persahabatan dan kebersamaan adalah kado terindah dalam setiap perayaan."
                )
            )
        ),
        // Cerita Mandarin Bean 96 (HSK 2): Perfect Son (Anak Laki-laki yang Sempurna)
        Story(
            id = "story_perfect_son",
            titleHanzi = "完美的儿子",
            titlePinyin = "Wánměi de Érzi",
            titleTranslation = "Perfect Son (Anak Laki-laki yang Sempurna)",
            level = "HSK 2",
            category = "Humor & Kehidupan",
            description = "Kisah humor antara dua orang ibu yang saling membanggakan kepatuhan putra kesayangannya.",
            coverEmoji = "🌟",
            coverImageRes = R.drawable.cover_story_perfect_son,
            estimatedReadMinutes = 2,
            sentences = listOf(
                Sentence(
                    id = "s_perfectson_1",
                    hanzi = "两个男人在河边钓鱼。",
                    pinyin = "liǎng gè nán rén zài hé bian diào yú",
                    translation = "Two Classifier for people or objects in general A man Di / Berada di River Suffix of a noun of locality To fish (with line and hook); to angle",
                    tokens = listOf(
                        WordToken("两", "liǎng", "Two", "Kosakata HSK 2: 两 (liǎng)"),
                        WordToken("个", "gè", "Classifier for people or objects in general", "Kosakata HSK 2: 个 (gè)"),
                        WordToken("男人", "nán rén", "A man", "Kosakata HSK 2: 男人 (nán rén)"),
                        WordToken("在", "zài", "Di / Berada di", "Preposisi lokasi atau aspek progresif"),
                        WordToken("河", "hé", "River", "Kosakata HSK 2: 河 (hé)"),
                        WordToken("边", "bian", "Suffix of a noun of locality", "Kosakata HSK 2: 边 (bian)"),
                        WordToken("钓鱼", "diào yú", "To fish (with line and hook); to angle", "Kosakata HSK 2: 钓鱼 (diào yú)")
                    )
                ),
                Sentence(
                    id = "s_perfectson_2",
                    hanzi = "他们一边钓鱼一边聊天。",
                    pinyin = "tā men yī biān diào yú yī biān liáo tiān",
                    translation = "Mereka On the one hand To fish (with line and hook); to angle On the one hand To chat; to gossip",
                    tokens = listOf(
                        WordToken("他们", "tā men", "Mereka", "Kata ganti orang ketiga jamak"),
                        WordToken("一边", "yī biān", "On the one hand", "Kosakata HSK 2: 一边 (yī biān)"),
                        WordToken("钓鱼", "diào yú", "To fish (with line and hook); to angle", "Kosakata HSK 2: 钓鱼 (diào yú)"),
                        WordToken("一边", "yī biān", "On the one hand", "Kosakata HSK 2: 一边 (yī biān)"),
                        WordToken("聊天", "liáo tiān", "To chat; to gossip", "Kosakata HSK 2: 聊天 (liáo tiān)")
                    )
                ),
                Sentence(
                    id = "s_perfectson_3",
                    hanzi = "年纪大的男人说：“我的儿子真让我担心，喝酒、抽烟，吃不健康的东西，每天都很晚才回家，还经常和我吵架。”",
                    pinyin = "nián jì dà de nán rén shuō wǒ de ér zi zhēn ràng wǒ dān xīn hē jiǔ chōu yān chī bù jiàn kāng de dōng xi měi tiān dōu hěn wǎn cái huí jiā hái jīng cháng hé wǒ chǎo jià",
                    translation = "Age Besar Punya / Yang (partikel posesif) A man Berbicara / Berkata My; mine Anak laki-laki Sungguh / Benar-benar To permit Saya To worry Minum Minuman beralkohol To smoke (tobacco) Makan Tidak Healthy Punya / Yang (partikel posesif) Thing Each Hari Semua / Seluruhnya Sangat Late Baru saja / Justru Kembali / Pulang Rumah / Keluarga Masih / Malahan Frequently; constantly; regularly; often Dan Saya To quarrel",
                    tokens = listOf(
                        WordToken("年纪", "nián jì", "Age", "Kosakata HSK 2: 年纪 (nián jì)"),
                        WordToken("大", "dà", "Besar", "Ukuran fisik besar"),
                        WordToken("的", "de", "Punya / Yang (partikel posesif)", "Partikel penjelas modifikasi atau kepemilikan"),
                        WordToken("男人", "nán rén", "A man", "Kosakata HSK 2: 男人 (nán rén)"),
                        WordToken("说", "shuō", "Berbicara / Berkata", "Menyampaikan ucapan"),
                        WordToken("我的", "wǒ de", "My; mine", "Kosakata HSK 2: 我的 (wǒ de)"),
                        WordToken("儿子", "ér zi", "Anak laki-laki", "Keturunan laki-laki"),
                        WordToken("真", "zhēn", "Sungguh / Benar-benar", "Menyatakan keaslian rasa"),
                        WordToken("让", "ràng", "To permit", "Kosakata HSK 2: 让 (ràng)"),
                        WordToken("我", "wǒ", "Saya", "Kata ganti orang pertama tunggal"),
                        WordToken("担心", "dān xīn", "To worry", "Kosakata HSK 2: 担心 (dān xīn)"),
                        WordToken("喝", "hē", "Minum", "Aktivitas mengonsumsi cairan"),
                        WordToken("酒", "jiǔ", "Minuman beralkohol", "Bir atau arak"),
                        WordToken("抽烟", "chōu yān", "To smoke (tobacco)", "Kosakata HSK 2: 抽烟 (chōu yān)"),
                        WordToken("吃", "chī", "Makan", "Aktivitas mengonsumsi makanan"),
                        WordToken("不", "bù", "Tidak", "Kata sangkalan untuk masa kini atau masa depan"),
                        WordToken("健康", "jiàn kāng", "Healthy", "Kosakata HSK 2: 健康 (jiàn kāng)"),
                        WordToken("的", "de", "Punya / Yang (partikel posesif)", "Partikel penjelas modifikasi atau kepemilikan"),
                        WordToken("东西", "dōng xi", "Thing", "Kosakata HSK 2: 东西 (dōng xi)"),
                        WordToken("每", "měi", "Each", "Kosakata HSK 2: 每 (měi)"),
                        WordToken("天", "tiān", "Hari", "Satuan hari"),
                        WordToken("都", "dōu", "Semua / Seluruhnya", "Menyatakan keuniversalan subjek"),
                        WordToken("很", "hěn", "Sangat", "Tingkat derajat"),
                        WordToken("晚", "wǎn", "Late", "Kosakata HSK 2: 晚 (wǎn)"),
                        WordToken("才", "cái", "Baru saja / Justru", "Menyatakan keterlambatan atau kondisi khusus"),
                        WordToken("回", "huí", "Kembali / Pulang", "Menuju ke tempat asal"),
                        WordToken("家", "jiā", "Rumah / Keluarga", "Tempat tinggal"),
                        WordToken("还", "hái", "Masih / Malahan", "Menyatakan kelanjutan situasi"),
                        WordToken("经常", "jīng cháng", "Frequently; constantly; regularly; often", "Kosakata HSK 2: 经常 (jīng cháng)"),
                        WordToken("和", "hé", "Dan", "Kata hubung setara"),
                        WordToken("我", "wǒ", "Saya", "Kata ganti orang pertama tunggal"),
                        WordToken("吵架", "chǎo jià", "To quarrel", "Kosakata HSK 2: 吵架 (chǎo jià)")
                    )
                ),
                Sentence(
                    id = "s_perfectson_4",
                    hanzi = "年轻一些的男人说：“我的儿子就很完美！",
                    pinyin = "nián qīng yī xiē de nán rén shuō wǒ de ér zi jiù hěn wán měi",
                    translation = "Young Some; a few; a little; (following an adjective) slightly ...er Punya / Yang (partikel posesif) A man Berbicara / Berkata My; mine Anak laki-laki Langsung / Segera / Maka Sangat Perfect",
                    tokens = listOf(
                        WordToken("年轻", "nián qīng", "Young", "Kosakata HSK 2: 年轻 (nián qīng)"),
                        WordToken("一些", "yī xiē", "Some; a few; a little; (following an adjective) slightly ...er", "Kosakata HSK 2: 一些 (yī xiē)"),
                        WordToken("的", "de", "Punya / Yang (partikel posesif)", "Partikel penjelas modifikasi atau kepemilikan"),
                        WordToken("男人", "nán rén", "A man", "Kosakata HSK 2: 男人 (nán rén)"),
                        WordToken("说", "shuō", "Berbicara / Berkata", "Menyampaikan ucapan"),
                        WordToken("我的", "wǒ de", "My; mine", "Kosakata HSK 2: 我的 (wǒ de)"),
                        WordToken("儿子", "ér zi", "Anak laki-laki", "Keturunan laki-laki"),
                        WordToken("就", "jiù", "Langsung / Segera / Maka", "Menyatakan ketepatan waktu atau kelogisan"),
                        WordToken("很", "hěn", "Sangat", "Tingkat derajat"),
                        WordToken("完美", "wán měi", "Perfect", "Kosakata HSK 2: 完美 (wán měi)")
                    )
                ),
                Sentence(
                    id = "s_perfectson_5",
                    hanzi = "不喝酒，不抽烟，吃非常健康的东西，也不会很晚回家，更不会和我吵架。”",
                    pinyin = "bù hē jiǔ bù chōu yān chī fēi cháng jiàn kāng de dōng xi yě bù huì hěn wǎn huí jiā gèng bù huì hé wǒ chǎo jià",
                    translation = "Tidak Minum Minuman beralkohol Tidak To smoke (tobacco) Makan Sangat / Amat Healthy Punya / Yang (partikel posesif) Thing Juga / Pun Will not Sangat Late Kembali / Pulang Rumah / Keluarga More Will not Dan Saya To quarrel",
                    tokens = listOf(
                        WordToken("不", "bù", "Tidak", "Kata sangkalan untuk masa kini atau masa depan"),
                        WordToken("喝", "hē", "Minum", "Aktivitas mengonsumsi cairan"),
                        WordToken("酒", "jiǔ", "Minuman beralkohol", "Bir atau arak"),
                        WordToken("不", "bù", "Tidak", "Kata sangkalan untuk masa kini atau masa depan"),
                        WordToken("抽烟", "chōu yān", "To smoke (tobacco)", "Kosakata HSK 2: 抽烟 (chōu yān)"),
                        WordToken("吃", "chī", "Makan", "Aktivitas mengonsumsi makanan"),
                        WordToken("非常", "fēi cháng", "Sangat / Amat", "Tingkat intensitas tinggi"),
                        WordToken("健康", "jiàn kāng", "Healthy", "Kosakata HSK 2: 健康 (jiàn kāng)"),
                        WordToken("的", "de", "Punya / Yang (partikel posesif)", "Partikel penjelas modifikasi atau kepemilikan"),
                        WordToken("东西", "dōng xi", "Thing", "Kosakata HSK 2: 东西 (dōng xi)"),
                        WordToken("也", "yě", "Juga / Pun", "Partikel penanda kesamaan"),
                        WordToken("不会", "bù huì", "Will not", "Kosakata HSK 2: 不会 (bù huì)"),
                        WordToken("很", "hěn", "Sangat", "Tingkat derajat"),
                        WordToken("晚", "wǎn", "Late", "Kosakata HSK 2: 晚 (wǎn)"),
                        WordToken("回", "huí", "Kembali / Pulang", "Menuju ke tempat asal"),
                        WordToken("家", "jiā", "Rumah / Keluarga", "Tempat tinggal"),
                        WordToken("更", "gèng", "More", "Kosakata HSK 2: 更 (gèng)"),
                        WordToken("不会", "bù huì", "Will not", "Kosakata HSK 2: 不会 (bù huì)"),
                        WordToken("和", "hé", "Dan", "Kata hubung setara"),
                        WordToken("我", "wǒ", "Saya", "Kata ganti orang pertama tunggal"),
                        WordToken("吵架", "chǎo jià", "To quarrel", "Kosakata HSK 2: 吵架 (chǎo jià)")
                    )
                ),
                Sentence(
                    id = "s_perfectson_6",
                    hanzi = "年纪大的男人说：“啊，那你的儿子真的很完美！",
                    pinyin = "nián jì dà de nán rén shuō ā nà nǐ de ér zi zhēn de hěn wán měi",
                    translation = "Age Besar Punya / Yang (partikel posesif) A man Berbicara / Berkata Interjection of surprise Then (in that case) Your; yours Anak laki-laki Really; truly; indeed Sangat Perfect",
                    tokens = listOf(
                        WordToken("年纪", "nián jì", "Age", "Kosakata HSK 2: 年纪 (nián jì)"),
                        WordToken("大", "dà", "Besar", "Ukuran fisik besar"),
                        WordToken("的", "de", "Punya / Yang (partikel posesif)", "Partikel penjelas modifikasi atau kepemilikan"),
                        WordToken("男人", "nán rén", "A man", "Kosakata HSK 2: 男人 (nán rén)"),
                        WordToken("说", "shuō", "Berbicara / Berkata", "Menyampaikan ucapan"),
                        WordToken("啊", "ā", "Interjection of surprise", "Kosakata HSK 2: 啊 (ā)"),
                        WordToken("那", "nà", "Then (in that case)", "Kosakata HSK 2: 那 (nà)"),
                        WordToken("你的", "nǐ de", "Your; yours", "Kosakata HSK 2: 你的 (nǐ de)"),
                        WordToken("儿子", "ér zi", "Anak laki-laki", "Keturunan laki-laki"),
                        WordToken("真的", "zhēn de", "Really; truly; indeed", "Kosakata HSK 2: 真的 (zhēn de)"),
                        WordToken("很", "hěn", "Sangat", "Tingkat derajat"),
                        WordToken("完美", "wán měi", "Perfect", "Kosakata HSK 2: 完美 (wán měi)")
                    )
                ),
                Sentence(
                    id = "s_perfectson_7",
                    hanzi = "他今年多少岁了？”",
                    pinyin = "tā jīn nián duō shao suì le",
                    translation = "Dia (laki-laki) This year How much?; how many? Classifier for years (of age) Sudah (partikel perubahan situasi)",
                    tokens = listOf(
                        WordToken("他", "tā", "Dia (laki-laki)", "Kata ganti orang ketiga tunggal"),
                        WordToken("今年", "jīn nián", "This year", "Kosakata HSK 2: 今年 (jīn nián)"),
                        WordToken("多少", "duō shao", "How much?; how many?", "Kosakata HSK 2: 多少 (duō shao)"),
                        WordToken("岁", "suì", "Classifier for years (of age)", "Kosakata HSK 2: 岁 (suì)"),
                        WordToken("了", "le", "Sudah (partikel perubahan situasi)", "Partikel aspek selesainya tindakan")
                    )
                ),
                Sentence(
                    id = "s_perfectson_8",
                    hanzi = "年轻男人回答说：“六个月了。”",
                    pinyin = "nián qīng nán rén huí dá shuō liù gè yuè le",
                    translation = "Young A man To reply; to answer Berbicara / Berkata Six Classifier for people or objects in general Bulan Sudah (partikel perubahan situasi)",
                    tokens = listOf(
                        WordToken("年轻", "nián qīng", "Young", "Kosakata HSK 2: 年轻 (nián qīng)"),
                        WordToken("男人", "nán rén", "A man", "Kosakata HSK 2: 男人 (nán rén)"),
                        WordToken("回答", "huí dá", "To reply; to answer", "Kosakata HSK 2: 回答 (huí dá)"),
                        WordToken("说", "shuō", "Berbicara / Berkata", "Menyampaikan ucapan"),
                        WordToken("六", "liù", "Six", "Kosakata HSK 2: 六 (liù)"),
                        WordToken("个", "gè", "Classifier for people or objects in general", "Kosakata HSK 2: 个 (gè)"),
                        WordToken("月", "yuè", "Bulan", "Satuan bulan"),
                        WordToken("了", "le", "Sudah (partikel perubahan situasi)", "Partikel aspek selesainya tindakan")
                    )
                )
            ),
            questions = listOf(
                StoryQuestion(
                    id = "q_perfectson_1",
                    questionText = "两位妈妈在谈论什么话题？ (Topik apa yang sedang diperbincangkan oleh kedua orang ibu?)",
                    options = listOf("在夸奖各自的儿子懂事孝顺 (Memuji kepatuhan dan kebaikan putra masing-masing)", "讨论菜价 (Membahas harga sayur di pasar)", "谈论天气 (Membahas cuaca mendung)", "讨论电影 (Membahas sinopsis film)"),
                    correctAnswerIndex = 0,
                    explanation = "Kedua orang tua saling menceritakan betapa berbakti putra kesayangannya."
                ),
                StoryQuestion(
                    id = "q_perfectson_2",
                    questionText = "第一位妈妈夸自己的儿子有什么优点？ (Keunggulan apa yang dibanggakan ibu pertama tentang putranya?)",
                    options = listOf("不吸烟、不喝酒、每天按时回家 (Tidak merokok, tidak minum alkohol, dan selalu tepat waktu pulang ke rumah)", "会开飞机 (Bisa menerbangkan pesawat)", "很有钱 (Punya banyak kekayaan)", "天天在外面玩 (Tiap hari bermain di luar)"),
                    correctAnswerIndex = 0,
                    explanation = "Sang putra digambarkan sangat disiplin dan bersih dari kebiasaan buruk."
                ),
                StoryQuestion(
                    id = "q_perfectson_3",
                    questionText = "这位“完美的儿子”今年几岁了？ (Berapa usia putra yang dipuji sempurna tersebut?)",
                    options = listOf("二十岁 (20 tahun)", "三十岁 (30 tahun)", "才六个月大 (Baru berusia 6 bulan!)", "五十岁 (50 tahun)"),
                    correctAnswerIndex = 2,
                    explanation = "Titik humor cerita: putranya masih bayi berusia 6 bulan sehingga tentu saja belum bisa merokok atau pulang malam!"
                ),
                StoryQuestion(
                    id = "q_perfectson_4",
                    questionText = "这个故事的幽默感来自哪里？ (Dari mana datangnya unsur lelucon dalam cerita ini?)",
                    options = listOf("母亲用成年人的道德标准来夸奖一个小婴儿 (Seorang ibu memakai tolok ukur kedewasaan untuk memuji bayi mungil)", "大家都很生气 (Semua orang marah-marah)", "有人摔倒了 (Ada orang tergelincir jatuh)", "儿子跑丢了 (Anak laki-lakinya tersesat)"),
                    correctAnswerIndex = 0,
                    explanation = "Kontras tak terduga antara kriteria kepatuhan orang dewasa dengan realitas bayi 6 bulan menghasilkan tawa."
                )
            )
        ),
        // Cerita Mandarin Bean 97 (HSK 2): Girlfriend and Boyfriend (Pacar Perempuan dan Pacar Laki-laki)
        Story(
            id = "story_girlfriend_and_boyfriend",
            titleHanzi = "女朋友和男朋友",
            titlePinyin = "Nǚpéngyou hé Nánpéngyou",
            titleTranslation = "Girlfriend and Boyfriend (Pacar Perempuan dan Pacar Laki-laki)",
            level = "HSK 2",
            category = "Hubungan & Humor",
            description = "Percakapan manis dan penuh canda antara sepasang kekasih mengenai perhatian dan komitmen cinta.",
            coverEmoji = "💌",
            coverImageRes = R.drawable.cover_story_girlfriend_and_boyfriend,
            estimatedReadMinutes = 2,
            sentences = listOf(
                Sentence(
                    id = "s_gfbf_1",
                    hanzi = "A：你手机上的那个女孩儿是你的女朋友吗？",
                    pinyin = "nǐ shǒu jī shàng de nà gè nǚ hái r shì nǐ de nǚ péng you ma",
                    translation = "Kamu Cell phone; mobile phone (noun suffix) on; above Punya / Yang (partikel posesif) (specifier) that; the; those Classifier for people or objects in general Erhua form of 女孩 Adalah Your; yours Female Teman / Sahabat Apakah (partikel tanya)",
                    tokens = listOf(
                        WordToken("你", "nǐ", "Kamu", "Kata ganti orang kedua tunggal"),
                        WordToken("手机", "shǒu jī", "Cell phone; mobile phone", "Kosakata HSK 2: 手机 (shǒu jī)"),
                        WordToken("上", "shàng", "(noun suffix) on; above", "Kosakata HSK 2: 上 (shàng)"),
                        WordToken("的", "de", "Punya / Yang (partikel posesif)", "Partikel penjelas modifikasi atau kepemilikan"),
                        WordToken("那", "nà", "(specifier) that; the; those", "Kosakata HSK 2: 那 (nà)"),
                        WordToken("个", "gè", "Classifier for people or objects in general", "Kosakata HSK 2: 个 (gè)"),
                        WordToken("女孩儿", "nǚ hái r", "Erhua form of 女孩", "Kosakata HSK 2: 女孩儿 (nǚ hái r)"),
                        WordToken("是", "shì", "Adalah", "Kopula penjelas"),
                        WordToken("你的", "nǐ de", "Your; yours", "Kosakata HSK 2: 你的 (nǐ de)"),
                        WordToken("女", "nǚ", "Female", "Kosakata HSK 2: 女 (nǚ)"),
                        WordToken("朋友", "péng you", "Teman / Sahabat", "Orang dekat"),
                        WordToken("吗", "ma", "Apakah (partikel tanya)", "Partikel di akhir kalimat interogatif ya/tidak")
                    )
                ),
                Sentence(
                    id = "s_gfbf_2",
                    hanzi = "B：不是，她是我的大学同学。",
                    pinyin = "bù shì tā shì wǒ de dà xué tóng xué",
                    translation = "No Dia (perempuan) Adalah My; mine Universitas Teman sekelas",
                    tokens = listOf(
                        WordToken("不是", "bù shì", "No", "Kosakata HSK 2: 不是 (bù shì)"),
                        WordToken("她", "tā", "Dia (perempuan)", "Kata ganti orang ketiga tunggal perempuan"),
                        WordToken("是", "shì", "Adalah", "Kopula penjelas"),
                        WordToken("我的", "wǒ de", "My; mine", "Kosakata HSK 2: 我的 (wǒ de)"),
                        WordToken("大学", "dà xué", "Universitas", "Perguruan tinggi"),
                        WordToken("同学", "tóng xué", "Teman sekelas", "Rekan belajar")
                    )
                ),
                Sentence(
                    id = "s_gfbf_3",
                    hanzi = "你觉得她怎么样？",
                    pinyin = "nǐ jué de tā zěn me yàng",
                    translation = "Kamu To think that ...; to feel that ... Dia (perempuan) How?",
                    tokens = listOf(
                        WordToken("你", "nǐ", "Kamu", "Kata ganti orang kedua tunggal"),
                        WordToken("觉得", "jué de", "To think that ...; to feel that ...", "Kosakata HSK 2: 觉得 (jué de)"),
                        WordToken("她", "tā", "Dia (perempuan)", "Kata ganti orang ketiga tunggal perempuan"),
                        WordToken("怎么样", "zěn me yàng", "How?", "Kosakata HSK 2: 怎么样 (zěn me yàng)")
                    )
                ),
                Sentence(
                    id = "s_gfbf_4",
                    hanzi = "A：她很漂亮！",
                    pinyin = "tā hěn piào liang",
                    translation = "Dia (perempuan) Sangat Pretty; beautiful",
                    tokens = listOf(
                        WordToken("她", "tā", "Dia (perempuan)", "Kata ganti orang ketiga tunggal perempuan"),
                        WordToken("很", "hěn", "Sangat", "Tingkat derajat"),
                        WordToken("漂亮", "piào liang", "Pretty; beautiful", "Kosakata HSK 2: 漂亮 (piào liang)")
                    )
                ),
                Sentence(
                    id = "s_gfbf_5",
                    hanzi = "你看，她长长的头发，大大的眼睛，又高又瘦。",
                    pinyin = "nǐ kàn tā cháng cháng de tóu fa dà dà de yǎn jing yòu gāo yòu shòu",
                    translation = "Kamu Melihat / Membaca Dia (perempuan) Long Long Punya / Yang (partikel posesif) Hair (on the head) Besar Besar Punya / Yang (partikel posesif) Eye Lagi (telah terjadi) Tinggi Lagi (telah terjadi) Kurus",
                    tokens = listOf(
                        WordToken("你", "nǐ", "Kamu", "Kata ganti orang kedua tunggal"),
                        WordToken("看", "kàn", "Melihat / Membaca", "Aktivitas visual"),
                        WordToken("她", "tā", "Dia (perempuan)", "Kata ganti orang ketiga tunggal perempuan"),
                        WordToken("长", "cháng", "Long", "Kosakata HSK 2: 长 (cháng)"),
                        WordToken("长", "cháng", "Long", "Kosakata HSK 2: 长 (cháng)"),
                        WordToken("的", "de", "Punya / Yang (partikel posesif)", "Partikel penjelas modifikasi atau kepemilikan"),
                        WordToken("头发", "tóu fa", "Hair (on the head)", "Kosakata HSK 2: 头发 (tóu fa)"),
                        WordToken("大", "dà", "Besar", "Ukuran fisik besar"),
                        WordToken("大", "dà", "Besar", "Ukuran fisik besar"),
                        WordToken("的", "de", "Punya / Yang (partikel posesif)", "Partikel penjelas modifikasi atau kepemilikan"),
                        WordToken("眼睛", "yǎn jing", "Eye", "Kosakata HSK 2: 眼睛 (yǎn jing)"),
                        WordToken("又", "yòu", "Lagi (telah terjadi)", "Pengulangan tindakan lampau"),
                        WordToken("高", "gāo", "Tinggi", "Postur atau letak tinggi"),
                        WordToken("又", "yòu", "Lagi (telah terjadi)", "Pengulangan tindakan lampau"),
                        WordToken("瘦", "shòu", "Kurus", "Bentuk tubuh ramping")
                    )
                ),
                Sentence(
                    id = "s_gfbf_6",
                    hanzi = "你为什么有她的照片？",
                    pinyin = "nǐ wèi shén me yǒu tā de zhào piàn",
                    translation = "Kamu Why? Mempunyai / Ada Her; hers Photograph",
                    tokens = listOf(
                        WordToken("你", "nǐ", "Kamu", "Kata ganti orang kedua tunggal"),
                        WordToken("为什么", "wèi shén me", "Why?", "Kosakata HSK 2: 为什么 (wèi shén me)"),
                        WordToken("有", "yǒu", "Mempunyai / Ada", "Menyatakan kepemilikan atau eksistensi"),
                        WordToken("她的", "tā de", "Her; hers", "Kosakata HSK 2: 她的 (tā de)"),
                        WordToken("照片", "zhào piàn", "Photograph", "Kosakata HSK 2: 照片 (zhào piàn)")
                    )
                ),
                Sentence(
                    id = "s_gfbf_7",
                    hanzi = "你喜欢她，对吗？",
                    pinyin = "nǐ xǐ huan tā duì ma",
                    translation = "Kamu Menyukai / Gemar Dia (perempuan) Right; correct Apakah (partikel tanya)",
                    tokens = listOf(
                        WordToken("你", "nǐ", "Kamu", "Kata ganti orang kedua tunggal"),
                        WordToken("喜欢", "xǐ huan", "Menyukai / Gemar", "Perasaan suka"),
                        WordToken("她", "tā", "Dia (perempuan)", "Kata ganti orang ketiga tunggal perempuan"),
                        WordToken("对", "duì", "Right; correct", "Kosakata HSK 2: 对 (duì)"),
                        WordToken("吗", "ma", "Apakah (partikel tanya)", "Partikel di akhir kalimat interogatif ya/tidak")
                    )
                ),
                Sentence(
                    id = "s_gfbf_8",
                    hanzi = "B：哈哈，是的，我很喜欢她。",
                    pinyin = "hā hā shì de wǒ hěn xǐ huan tā",
                    translation = "(onom.) laughing out loud Yes, that&#x27;s right Saya Sangat Menyukai / Gemar Dia (perempuan)",
                    tokens = listOf(
                        WordToken("哈哈", "hā hā", "(onom.) laughing out loud", "Kosakata HSK 2: 哈哈 (hā hā)"),
                        WordToken("是的", "shì de", "Yes, that&#x27;s right", "Kosakata HSK 2: 是的 (shì de)"),
                        WordToken("我", "wǒ", "Saya", "Kata ganti orang pertama tunggal"),
                        WordToken("很", "hěn", "Sangat", "Tingkat derajat"),
                        WordToken("喜欢", "xǐ huan", "Menyukai / Gemar", "Perasaan suka"),
                        WordToken("她", "tā", "Dia (perempuan)", "Kata ganti orang ketiga tunggal perempuan")
                    )
                ),
                Sentence(
                    id = "s_gfbf_9",
                    hanzi = "希望有一天她真的能成为我的女朋友。",
                    pinyin = "xī wàng yǒu yī tiān tā zhēn de néng chéng wéi wǒ de nǚ péng you",
                    translation = "To hope Mempunyai / Ada One Hari Dia (perempuan) Really; truly; indeed Bisa / Mampu / Boleh To become; to turn into My; mine Female Teman / Sahabat",
                    tokens = listOf(
                        WordToken("希望", "xī wàng", "To hope", "Kosakata HSK 2: 希望 (xī wàng)"),
                        WordToken("有", "yǒu", "Mempunyai / Ada", "Menyatakan kepemilikan atau eksistensi"),
                        WordToken("一", "yī", "One", "Kosakata HSK 2: 一 (yī)"),
                        WordToken("天", "tiān", "Hari", "Satuan hari"),
                        WordToken("她", "tā", "Dia (perempuan)", "Kata ganti orang ketiga tunggal perempuan"),
                        WordToken("真的", "zhēn de", "Really; truly; indeed", "Kosakata HSK 2: 真的 (zhēn de)"),
                        WordToken("能", "néng", "Bisa / Mampu / Boleh", "Kata bantu kemampuan atau izin"),
                        WordToken("成为", "chéng wéi", "To become; to turn into", "Kosakata HSK 2: 成为 (chéng wéi)"),
                        WordToken("我的", "wǒ de", "My; mine", "Kosakata HSK 2: 我的 (wǒ de)"),
                        WordToken("女", "nǚ", "Female", "Kosakata HSK 2: 女 (nǚ)"),
                        WordToken("朋友", "péng you", "Teman / Sahabat", "Orang dekat")
                    )
                ),
                Sentence(
                    id = "s_gfbf_10",
                    hanzi = "你呢？",
                    pinyin = "nǐ ne",
                    translation = "Kamu Bagaimana dengan / sedang (partikel modal)",
                    tokens = listOf(
                        WordToken("你", "nǐ", "Kamu", "Kata ganti orang kedua tunggal"),
                        WordToken("呢", "ne", "Bagaimana dengan / sedang (partikel modal)", "Partikel tanya atau penanda sedang berlangsung")
                    )
                ),
                Sentence(
                    id = "s_gfbf_11",
                    hanzi = "你喜欢什么样的男孩儿？",
                    pinyin = "nǐ xǐ huan shén me yàng de nán hái r",
                    translation = "Kamu Menyukai / Gemar What kind?; what sort? Punya / Yang (partikel posesif) Erhua form of 男孩",
                    tokens = listOf(
                        WordToken("你", "nǐ", "Kamu", "Kata ganti orang kedua tunggal"),
                        WordToken("喜欢", "xǐ huan", "Menyukai / Gemar", "Perasaan suka"),
                        WordToken("什么样", "shén me yàng", "What kind?; what sort?", "Kosakata HSK 2: 什么样 (shén me yàng)"),
                        WordToken("的", "de", "Punya / Yang (partikel posesif)", "Partikel penjelas modifikasi atau kepemilikan"),
                        WordToken("男孩儿", "nán hái r", "Erhua form of 男孩", "Kosakata HSK 2: 男孩儿 (nán hái r)")
                    )
                ),
                Sentence(
                    id = "s_gfbf_12",
                    hanzi = "A：我喜欢个子高高的，不胖也不瘦，干干净净的男孩儿。",
                    pinyin = "wǒ xǐ huan gè zi gāo gāo de bù pàng yě bù shòu gān gān jìng jìng de nán hái r",
                    translation = "Saya Menyukai / Gemar Stature; height; size (of a person or object) Tinggi Tinggi Punya / Yang (partikel posesif) Tidak Gemuk Juga / Pun Tidak Kurus Clean and neat; spotless Punya / Yang (partikel posesif) Erhua form of 男孩",
                    tokens = listOf(
                        WordToken("我", "wǒ", "Saya", "Kata ganti orang pertama tunggal"),
                        WordToken("喜欢", "xǐ huan", "Menyukai / Gemar", "Perasaan suka"),
                        WordToken("个子", "gè zi", "Stature; height; size (of a person or object)", "Kosakata HSK 2: 个子 (gè zi)"),
                        WordToken("高", "gāo", "Tinggi", "Postur atau letak tinggi"),
                        WordToken("高", "gāo", "Tinggi", "Postur atau letak tinggi"),
                        WordToken("的", "de", "Punya / Yang (partikel posesif)", "Partikel penjelas modifikasi atau kepemilikan"),
                        WordToken("不", "bù", "Tidak", "Kata sangkalan untuk masa kini atau masa depan"),
                        WordToken("胖", "pàng", "Gemuk", "Bentuk tubuh berisi"),
                        WordToken("也", "yě", "Juga / Pun", "Partikel penanda kesamaan"),
                        WordToken("不", "bù", "Tidak", "Kata sangkalan untuk masa kini atau masa depan"),
                        WordToken("瘦", "shòu", "Kurus", "Bentuk tubuh ramping"),
                        WordToken("干干净净", "gān gān jìng jìng", "Clean and neat; spotless", "Kosakata HSK 2: 干干净净 (gān gān jìng jìng)"),
                        WordToken("的", "de", "Punya / Yang (partikel posesif)", "Partikel penjelas modifikasi atau kepemilikan"),
                        WordToken("男孩儿", "nán hái r", "Erhua form of 男孩", "Kosakata HSK 2: 男孩儿 (nán hái r)")
                    )
                ),
                Sentence(
                    id = "s_gfbf_13",
                    hanzi = "当然，他最好喜欢运动，还喜欢音乐和电影。",
                    pinyin = "dāng rán tā zuì hǎo xǐ huan yùn dòng hái xǐ huan yīn yuè hé diàn yǐng",
                    translation = "Certainly Dia (laki-laki) Had better ...; it would be best to ... Menyukai / Gemar To exercise Masih / Malahan Menyukai / Gemar Music Dan Movie; film",
                    tokens = listOf(
                        WordToken("当然", "dāng rán", "Certainly", "Kosakata HSK 2: 当然 (dāng rán)"),
                        WordToken("他", "tā", "Dia (laki-laki)", "Kata ganti orang ketiga tunggal"),
                        WordToken("最好", "zuì hǎo", "Had better ...; it would be best to ...", "Kosakata HSK 2: 最好 (zuì hǎo)"),
                        WordToken("喜欢", "xǐ huan", "Menyukai / Gemar", "Perasaan suka"),
                        WordToken("运动", "yùn dòng", "To exercise", "Kosakata HSK 2: 运动 (yùn dòng)"),
                        WordToken("还", "hái", "Masih / Malahan", "Menyatakan kelanjutan situasi"),
                        WordToken("喜欢", "xǐ huan", "Menyukai / Gemar", "Perasaan suka"),
                        WordToken("音乐", "yīn yuè", "Music", "Kosakata HSK 2: 音乐 (yīn yuè)"),
                        WordToken("和", "hé", "Dan", "Kata hubung setara"),
                        WordToken("电影", "diàn yǐng", "Movie; film", "Kosakata HSK 2: 电影 (diàn yǐng)")
                    )
                ),
                Sentence(
                    id = "s_gfbf_14",
                    hanzi = "他还得聪明、善良，对所有人都很友好……",
                    pinyin = "tā hái děi cōng míng shàn liáng duì suǒ yǒu rén dōu hěn yǒu hǎo",
                    translation = "Dia (laki-laki) Masih / Malahan Dengan (partikel pelengkap derajat) Intelligent; clever; bright Good and honest Towards; at; for All Person; people Semua / Seluruhnya Sangat Friendly; amicable",
                    tokens = listOf(
                        WordToken("他", "tā", "Dia (laki-laki)", "Kata ganti orang ketiga tunggal"),
                        WordToken("还", "hái", "Masih / Malahan", "Menyatakan kelanjutan situasi"),
                        WordToken("得", "děi", "Dengan (partikel pelengkap derajat)", "Partikel penunjuk derajat hasil tindakan"),
                        WordToken("聪明", "cōng míng", "Intelligent; clever; bright", "Kosakata HSK 2: 聪明 (cōng míng)"),
                        WordToken("善良", "shàn liáng", "Good and honest", "Kosakata HSK 2: 善良 (shàn liáng)"),
                        WordToken("对", "duì", "Towards; at; for", "Kosakata HSK 2: 对 (duì)"),
                        WordToken("所有", "suǒ yǒu", "All", "Kosakata HSK 2: 所有 (suǒ yǒu)"),
                        WordToken("人", "rén", "Person; people", "Kosakata HSK 2: 人 (rén)"),
                        WordToken("都", "dōu", "Semua / Seluruhnya", "Menyatakan keuniversalan subjek"),
                        WordToken("很", "hěn", "Sangat", "Tingkat derajat"),
                        WordToken("友好", "yǒu hǎo", "Friendly; amicable", "Kosakata HSK 2: 友好 (yǒu hǎo)")
                    )
                ),
                Sentence(
                    id = "s_gfbf_15",
                    hanzi = "B：你要求太多了！",
                    pinyin = "nǐ yāo qiú tài duō le",
                    translation = "Kamu To request Terlalu Banyak Sudah (partikel perubahan situasi)",
                    tokens = listOf(
                        WordToken("你", "nǐ", "Kamu", "Kata ganti orang kedua tunggal"),
                        WordToken("要求", "yāo qiú", "To request", "Kosakata HSK 2: 要求 (yāo qiú)"),
                        WordToken("太", "tài", "Terlalu", "Derajat melampaui batas"),
                        WordToken("多", "duō", "Banyak", "Jumlah besar"),
                        WordToken("了", "le", "Sudah (partikel perubahan situasi)", "Partikel aspek selesainya tindakan")
                    )
                ),
                Sentence(
                    id = "s_gfbf_16",
                    hanzi = "这就是为什么你现在还没有男朋友。",
                    pinyin = "zhè jiù shì wèi shén me nǐ xiàn zài hái méi yǒu nán péng you",
                    translation = "This; these Langsung / Segera / Maka Adalah Why? Kamu Sekarang Masih / Malahan Tidak ada / Tidak punya (bound form) male Teman / Sahabat",
                    tokens = listOf(
                        WordToken("这", "zhè", "This; these", "Kosakata HSK 2: 这 (zhè)"),
                        WordToken("就", "jiù", "Langsung / Segera / Maka", "Menyatakan ketepatan waktu atau kelogisan"),
                        WordToken("是", "shì", "Adalah", "Kopula penjelas"),
                        WordToken("为什么", "wèi shén me", "Why?", "Kosakata HSK 2: 为什么 (wèi shén me)"),
                        WordToken("你", "nǐ", "Kamu", "Kata ganti orang kedua tunggal"),
                        WordToken("现在", "xiàn zài", "Sekarang", "Waktu saat ini"),
                        WordToken("还", "hái", "Masih / Malahan", "Menyatakan kelanjutan situasi"),
                        WordToken("没有", "méi yǒu", "Tidak ada / Tidak punya", "Bentuk negasi dari 有"),
                        WordToken("男", "nán", "(bound form) male", "Kosakata HSK 2: 男 (nán)"),
                        WordToken("朋友", "péng you", "Teman / Sahabat", "Orang dekat")
                    )
                )
            ),
            questions = listOf(
                StoryQuestion(
                    id = "q_gfbf_1",
                    questionText = "女朋友问男朋友如果自己变胖了还会不会爱她，男朋友怎么回答？ (Saat pacar wanita bertanya apakah masih dicintai jika bertubuh gemuk, apa jawaban sang pria?)",
                    options = listOf("不管你胖还是瘦，我都一样深爱你 (Baik gemuk maupun langsing, cintaku tak akan pernah berubah)", "那我就离开你 (Kalau begitu aku akan pergi meninggalkanmu)", "你现在就很胖 (Kamu sekarang sudah gemuk)", "我不知道 (Aku tidak tahu)"),
                    correctAnswerIndex = 0,
                    explanation = "Jawaban bijak penuh kasih yang menegaskan ketulusan hatinya tanpa memandang fisik semata."
                ),
                StoryQuestion(
                    id = "q_gfbf_2",
                    questionText = "女朋友听了男朋友的甜言蜜语后感觉怎样？ (Bagaimana perasaan pacar wanita setelah mendengar jawaban tulus itu?)",
                    options = listOf("心里甜滋滋的非常开心 (Hatinya berbunga-bunga sangat bahagia)", "大发雷霆 (Marah besar)", "觉得很无聊 (Merasa sangat bosan)", "立刻哭了 (Langsung menangis)"),
                    correctAnswerIndex = 0,
                    explanation = "Perhatian dan kepastian kata-kata kekasih menghangatkan sanubarinya."
                ),
                StoryQuestion(
                    id = "q_gfbf_3",
                    questionText = "男朋友送给女朋友什么小惊喜？ (Kejutan kecil apa yang dihadiahkan sang pria kepada kekasihnya?)",
                    options = listOf("一本写满回忆的相册与鲜花 (Bunga segar dan album kenangan kebersamaan)", "一辆大卡车 (Sebuah truk besar)", "一双旧袜子 (Sepasang kaus kaki lama)", "一瓶醋 (Sebotol cuka dapur)"),
                    correctAnswerIndex = 0,
                    explanation = "Tanda kasih sederhana yang sarat akan makna perhatian tulus."
                ),
                StoryQuestion(
                    id = "q_gfbf_4",
                    questionText = "健康的恋爱关系最需要的是什么？ (Hal apakah yang paling esensial dalam membina jalinan asmara yang sehat?)",
                    options = listOf("相互坦诚、理解、包容与彼此支持 (Saling jujur, memahami, memaafkan, dan saling mendukung)", "天天攀比花钱 (Saling bersaing menghamburkan uang)", "经常无端怀疑 (Sering curiga tanpa bukti)", "不跟对方沟通 (Enggan berkomunikasi satu sama lain)"),
                    correctAnswerIndex = 0,
                    explanation = "Komunikasi hangat dan saling menghargai adalah tiang utama keharmonisan hubungan."
                )
            )
        ),
        // Cerita Mandarin Bean 98 (HSK 2): My New Home (Rumah Baruku)
        Story(
            id = "story_my_new_home",
            titleHanzi = "我的新家",
            titlePinyin = "Wǒ de Xīn Jiā",
            titleTranslation = "My New Home (Rumah Baruku)",
            level = "HSK 2",
            category = "Rumah & Tempat Tinggal",
            description = "Pengalaman pindah ke apartemen baru yang cerah, nyaman, dan dekat dengan stasiun kereta bawah tanah.",
            coverEmoji = "🏠",
            coverImageRes = R.drawable.cover_story_my_new_home,
            estimatedReadMinutes = 2,
            sentences = listOf(
                Sentence(
                    id = "s_newhome_1",
                    hanzi = "去年我和家人买了一套新房子，今年我们搬进来了。",
                    pinyin = "qù nián wǒ hé jiā rén mǎi le yī tào xīn fáng zi jīn nián wǒ men bān jìn lái le",
                    translation = "Last year Saya Dan Family member Membeli Sudah (partikel perubahan situasi) One Classifier for sets, collections Baru House This year Kami / Kita To move To go in Datang Sudah (partikel perubahan situasi)",
                    tokens = listOf(
                        WordToken("去年", "qù nián", "Last year", "Kosakata HSK 2: 去年 (qù nián)"),
                        WordToken("我", "wǒ", "Saya", "Kata ganti orang pertama tunggal"),
                        WordToken("和", "hé", "Dan", "Kata hubung setara"),
                        WordToken("家人", "jiā rén", "Family member", "Kosakata HSK 2: 家人 (jiā rén)"),
                        WordToken("买", "mǎi", "Membeli", "Transaksi belanja"),
                        WordToken("了", "le", "Sudah (partikel perubahan situasi)", "Partikel aspek selesainya tindakan"),
                        WordToken("一", "yī", "One", "Kosakata HSK 2: 一 (yī)"),
                        WordToken("套", "tào", "Classifier for sets, collections", "Kosakata HSK 2: 套 (tào)"),
                        WordToken("新", "xīn", "Baru", "Benda atau waktu mutakhir"),
                        WordToken("房子", "fáng zi", "House", "Kosakata HSK 2: 房子 (fáng zi)"),
                        WordToken("今年", "jīn nián", "This year", "Kosakata HSK 2: 今年 (jīn nián)"),
                        WordToken("我们", "wǒ men", "Kami / Kita", "Kata ganti orang pertama jamak"),
                        WordToken("搬", "bān", "To move", "Kosakata HSK 2: 搬 (bān)"),
                        WordToken("进", "jìn", "To go in", "Kosakata HSK 2: 进 (jìn)"),
                        WordToken("来", "lái", "Datang", "Menuju ke arah pembicara"),
                        WordToken("了", "le", "Sudah (partikel perubahan situasi)", "Partikel aspek selesainya tindakan")
                    )
                ),
                Sentence(
                    id = "s_newhome_2",
                    hanzi = "新家西边有一条干净的河，南边有一个森林公园。",
                    pinyin = "xīn jiā xī bian yǒu yī tiáo gān jìng de hé nán bian yǒu yī gè sēn lín gōng yuán",
                    translation = "Baru Rumah / Keluarga West Suffix of a noun of locality Mempunyai / Ada One Classifier for long thin things Clean Punya / Yang (partikel posesif) River South Suffix of a noun of locality Mempunyai / Ada One Classifier for people or objects in general Forest Park (for public recreation)",
                    tokens = listOf(
                        WordToken("新", "xīn", "Baru", "Benda atau waktu mutakhir"),
                        WordToken("家", "jiā", "Rumah / Keluarga", "Tempat tinggal"),
                        WordToken("西", "xī", "West", "Kosakata HSK 2: 西 (xī)"),
                        WordToken("边", "bian", "Suffix of a noun of locality", "Kosakata HSK 2: 边 (bian)"),
                        WordToken("有", "yǒu", "Mempunyai / Ada", "Menyatakan kepemilikan atau eksistensi"),
                        WordToken("一", "yī", "One", "Kosakata HSK 2: 一 (yī)"),
                        WordToken("条", "tiáo", "Classifier for long thin things", "Kosakata HSK 2: 条 (tiáo)"),
                        WordToken("干净", "gān jìng", "Clean", "Kosakata HSK 2: 干净 (gān jìng)"),
                        WordToken("的", "de", "Punya / Yang (partikel posesif)", "Partikel penjelas modifikasi atau kepemilikan"),
                        WordToken("河", "hé", "River", "Kosakata HSK 2: 河 (hé)"),
                        WordToken("南", "nán", "South", "Kosakata HSK 2: 南 (nán)"),
                        WordToken("边", "bian", "Suffix of a noun of locality", "Kosakata HSK 2: 边 (bian)"),
                        WordToken("有", "yǒu", "Mempunyai / Ada", "Menyatakan kepemilikan atau eksistensi"),
                        WordToken("一", "yī", "One", "Kosakata HSK 2: 一 (yī)"),
                        WordToken("个", "gè", "Classifier for people or objects in general", "Kosakata HSK 2: 个 (gè)"),
                        WordToken("森林", "sēn lín", "Forest", "Kosakata HSK 2: 森林 (sēn lín)"),
                        WordToken("公园", "gōng yuán", "Park (for public recreation)", "Kosakata HSK 2: 公园 (gōng yuán)")
                    )
                ),
                Sentence(
                    id = "s_newhome_3",
                    hanzi = "周围有山，有水，有树，有花，风景非常漂亮，空气也非常新鲜。",
                    pinyin = "zhōu wéi yǒu shān yǒu shuǐ yǒu shù yǒu huā fēng jǐng fēi cháng piào liang kōng qì yě fēi cháng xīn xiān",
                    translation = "Environs; surroundings; periphery Mempunyai / Ada Mountain; hill Mempunyai / Ada Air Mempunyai / Ada Tree Mempunyai / Ada Flower Scenery; landscape Sangat / Amat Pretty; beautiful Air Juga / Pun Sangat / Amat Fresh (experience, food etc)",
                    tokens = listOf(
                        WordToken("周围", "zhōu wéi", "Environs; surroundings; periphery", "Kosakata HSK 2: 周围 (zhōu wéi)"),
                        WordToken("有", "yǒu", "Mempunyai / Ada", "Menyatakan kepemilikan atau eksistensi"),
                        WordToken("山", "shān", "Mountain; hill", "Kosakata HSK 2: 山 (shān)"),
                        WordToken("有", "yǒu", "Mempunyai / Ada", "Menyatakan kepemilikan atau eksistensi"),
                        WordToken("水", "shuǐ", "Air", "Minuman mineral"),
                        WordToken("有", "yǒu", "Mempunyai / Ada", "Menyatakan kepemilikan atau eksistensi"),
                        WordToken("树", "shù", "Tree", "Kosakata HSK 2: 树 (shù)"),
                        WordToken("有", "yǒu", "Mempunyai / Ada", "Menyatakan kepemilikan atau eksistensi"),
                        WordToken("花", "huā", "Flower", "Kosakata HSK 2: 花 (huā)"),
                        WordToken("风景", "fēng jǐng", "Scenery; landscape", "Kosakata HSK 2: 风景 (fēng jǐng)"),
                        WordToken("非常", "fēi cháng", "Sangat / Amat", "Tingkat intensitas tinggi"),
                        WordToken("漂亮", "piào liang", "Pretty; beautiful", "Kosakata HSK 2: 漂亮 (piào liang)"),
                        WordToken("空气", "kōng qì", "Air", "Kosakata HSK 2: 空气 (kōng qì)"),
                        WordToken("也", "yě", "Juga / Pun", "Partikel penanda kesamaan"),
                        WordToken("非常", "fēi cháng", "Sangat / Amat", "Tingkat intensitas tinggi"),
                        WordToken("新鲜", "xīn xiān", "Fresh (experience, food etc)", "Kosakata HSK 2: 新鲜 (xīn xiān)")
                    )
                ),
                Sentence(
                    id = "s_newhome_4",
                    hanzi = "每天早上都能看到很多人去公园运动，晚上河边也有很多人散步。",
                    pinyin = "měi tiān zǎo shang dōu néng kàn dào hěn duō rén qù gōng yuán yùn dòng wǎn shang hé bian yě yǒu hěn duō rén sàn bù",
                    translation = "Each Hari Pagi hari Semua / Seluruhnya Bisa / Mampu / Boleh Melihat / Membaca To reach; to arrive Many; a lot of Person; people Pergi Park (for public recreation) To exercise Malam hari River Suffix of a noun of locality Juga / Pun Mempunyai / Ada Many; a lot of Person; people Jalan-jalan santai",
                    tokens = listOf(
                        WordToken("每", "měi", "Each", "Kosakata HSK 2: 每 (měi)"),
                        WordToken("天", "tiān", "Hari", "Satuan hari"),
                        WordToken("早上", "zǎo shang", "Pagi hari", "Waktu fajar hingga pagi"),
                        WordToken("都", "dōu", "Semua / Seluruhnya", "Menyatakan keuniversalan subjek"),
                        WordToken("能", "néng", "Bisa / Mampu / Boleh", "Kata bantu kemampuan atau izin"),
                        WordToken("看", "kàn", "Melihat / Membaca", "Aktivitas visual"),
                        WordToken("到", "dào", "To reach; to arrive", "Kosakata HSK 2: 到 (dào)"),
                        WordToken("很多", "hěn duō", "Many; a lot of", "Kosakata HSK 2: 很多 (hěn duō)"),
                        WordToken("人", "rén", "Person; people", "Kosakata HSK 2: 人 (rén)"),
                        WordToken("去", "qù", "Pergi", "Berpindah tempat menjauhi pembicara"),
                        WordToken("公园", "gōng yuán", "Park (for public recreation)", "Kosakata HSK 2: 公园 (gōng yuán)"),
                        WordToken("运动", "yùn dòng", "To exercise", "Kosakata HSK 2: 运动 (yùn dòng)"),
                        WordToken("晚上", "wǎn shang", "Malam hari", "Waktu malam"),
                        WordToken("河", "hé", "River", "Kosakata HSK 2: 河 (hé)"),
                        WordToken("边", "bian", "Suffix of a noun of locality", "Kosakata HSK 2: 边 (bian)"),
                        WordToken("也", "yě", "Juga / Pun", "Partikel penanda kesamaan"),
                        WordToken("有", "yǒu", "Mempunyai / Ada", "Menyatakan kepemilikan atau eksistensi"),
                        WordToken("很多", "hěn duō", "Many; a lot of", "Kosakata HSK 2: 很多 (hěn duō)"),
                        WordToken("人", "rén", "Person; people", "Kosakata HSK 2: 人 (rén)"),
                        WordToken("散步", "sàn bù", "Jalan-jalan santai", "Aktivitas jalan santai relaksasi")
                    )
                ),
                Sentence(
                    id = "s_newhome_5",
                    hanzi = "新家的东边有一个小学，孩子们每天准时上课，下课以后就去公园玩，感觉很快乐。",
                    pinyin = "xīn jiā de dōng bian yǒu yī gè xiǎo xué hái zi men měi tiān zhǔn shí shàng kè xià kè yǐ hòu jiù qù gōng yuán wán gǎn jué hěn kuài lè",
                    translation = "Baru Rumah / Keluarga Punya / Yang (partikel posesif) East Suffix of a noun of locality Mempunyai / Ada One Classifier for people or objects in general Elementary school; primary school Child Plural marker for pronouns, and nouns referring to individuals Each Hari On time To go to class To finish class After Langsung / Segera / Maka Pergi Park (for public recreation) To play To feel; to perceive Sangat Happy; joyful",
                    tokens = listOf(
                        WordToken("新", "xīn", "Baru", "Benda atau waktu mutakhir"),
                        WordToken("家", "jiā", "Rumah / Keluarga", "Tempat tinggal"),
                        WordToken("的", "de", "Punya / Yang (partikel posesif)", "Partikel penjelas modifikasi atau kepemilikan"),
                        WordToken("东", "dōng", "East", "Kosakata HSK 2: 东 (dōng)"),
                        WordToken("边", "bian", "Suffix of a noun of locality", "Kosakata HSK 2: 边 (bian)"),
                        WordToken("有", "yǒu", "Mempunyai / Ada", "Menyatakan kepemilikan atau eksistensi"),
                        WordToken("一", "yī", "One", "Kosakata HSK 2: 一 (yī)"),
                        WordToken("个", "gè", "Classifier for people or objects in general", "Kosakata HSK 2: 个 (gè)"),
                        WordToken("小学", "xiǎo xué", "Elementary school; primary school", "Kosakata HSK 2: 小学 (xiǎo xué)"),
                        WordToken("孩子", "hái zi", "Child", "Kosakata HSK 2: 孩子 (hái zi)"),
                        WordToken("们", "men", "Plural marker for pronouns, and nouns referring to individuals", "Kosakata HSK 2: 们 (men)"),
                        WordToken("每", "měi", "Each", "Kosakata HSK 2: 每 (měi)"),
                        WordToken("天", "tiān", "Hari", "Satuan hari"),
                        WordToken("准时", "zhǔn shí", "On time", "Kosakata HSK 2: 准时 (zhǔn shí)"),
                        WordToken("上课", "shàng kè", "To go to class", "Kosakata HSK 2: 上课 (shàng kè)"),
                        WordToken("下课", "xià kè", "To finish class", "Kosakata HSK 2: 下课 (xià kè)"),
                        WordToken("以后", "yǐ hòu", "After", "Kosakata HSK 2: 以后 (yǐ hòu)"),
                        WordToken("就", "jiù", "Langsung / Segera / Maka", "Menyatakan ketepatan waktu atau kelogisan"),
                        WordToken("去", "qù", "Pergi", "Berpindah tempat menjauhi pembicara"),
                        WordToken("公园", "gōng yuán", "Park (for public recreation)", "Kosakata HSK 2: 公园 (gōng yuán)"),
                        WordToken("玩", "wán", "To play", "Kosakata HSK 2: 玩 (wán)"),
                        WordToken("感觉", "gǎn jué", "To feel; to perceive", "Kosakata HSK 2: 感觉 (gǎn jué)"),
                        WordToken("很", "hěn", "Sangat", "Tingkat derajat"),
                        WordToken("快乐", "kuài lè", "Happy; joyful", "Kosakata HSK 2: 快乐 (kuài lè)")
                    )
                ),
                Sentence(
                    id = "s_newhome_6",
                    hanzi = "我的孩子就在这个学校学习，因为离家很近，他每天中午都能回家吃饭。",
                    pinyin = "wǒ de hái zi jiù zài zhè gè xué xiào xué xí yīn wèi lí jiā hěn jìn tā měi tiān zhōng wǔ dōu néng huí jiā chī fàn",
                    translation = "Saya Punya / Yang (partikel posesif) Child Langsung / Segera / Maka Di / Berada di This; these Classifier for people or objects in general Sekolah Belajar / Studi Karena (in giving distances) from Rumah / Keluarga Sangat Dekat Dia (laki-laki) Each Hari Siang hari Semua / Seluruhnya Bisa / Mampu / Boleh Kembali / Pulang Rumah / Keluarga Makan Nasi / Makanan",
                    tokens = listOf(
                        WordToken("我", "wǒ", "Saya", "Kata ganti orang pertama tunggal"),
                        WordToken("的", "de", "Punya / Yang (partikel posesif)", "Partikel penjelas modifikasi atau kepemilikan"),
                        WordToken("孩子", "hái zi", "Child", "Kosakata HSK 2: 孩子 (hái zi)"),
                        WordToken("就", "jiù", "Langsung / Segera / Maka", "Menyatakan ketepatan waktu atau kelogisan"),
                        WordToken("在", "zài", "Di / Berada di", "Preposisi lokasi atau aspek progresif"),
                        WordToken("这", "zhè", "This; these", "Kosakata HSK 2: 这 (zhè)"),
                        WordToken("个", "gè", "Classifier for people or objects in general", "Kosakata HSK 2: 个 (gè)"),
                        WordToken("学校", "xué xiào", "Sekolah", "Institusi pendidikan"),
                        WordToken("学习", "xué xí", "Belajar / Studi", "Proses menuntut ilmu"),
                        WordToken("因为", "yīn wèi", "Karena", "Menyatakan alasan sebab"),
                        WordToken("离", "lí", "(in giving distances) from", "Kosakata HSK 2: 离 (lí)"),
                        WordToken("家", "jiā", "Rumah / Keluarga", "Tempat tinggal"),
                        WordToken("很", "hěn", "Sangat", "Tingkat derajat"),
                        WordToken("近", "jìn", "Dekat", "Jarak dekat"),
                        WordToken("他", "tā", "Dia (laki-laki)", "Kata ganti orang ketiga tunggal"),
                        WordToken("每", "měi", "Each", "Kosakata HSK 2: 每 (měi)"),
                        WordToken("天", "tiān", "Hari", "Satuan hari"),
                        WordToken("中午", "zhōng wǔ", "Siang hari", "Waktu tengah hari"),
                        WordToken("都", "dōu", "Semua / Seluruhnya", "Menyatakan keuniversalan subjek"),
                        WordToken("能", "néng", "Bisa / Mampu / Boleh", "Kata bantu kemampuan atau izin"),
                        WordToken("回", "huí", "Kembali / Pulang", "Menuju ke tempat asal"),
                        WordToken("家", "jiā", "Rumah / Keluarga", "Tempat tinggal"),
                        WordToken("吃", "chī", "Makan", "Aktivitas mengonsumsi makanan"),
                        WordToken("饭", "fàn", "Nasi / Makanan", "Makanan pokok")
                    )
                ),
                Sentence(
                    id = "s_newhome_7",
                    hanzi = "我太喜欢我的新家了。",
                    pinyin = "wǒ tài xǐ huan wǒ de xīn jiā le",
                    translation = "Saya Terlalu Menyukai / Gemar Saya Punya / Yang (partikel posesif) Baru Rumah / Keluarga Sudah (partikel perubahan situasi)",
                    tokens = listOf(
                        WordToken("我", "wǒ", "Saya", "Kata ganti orang pertama tunggal"),
                        WordToken("太", "tài", "Terlalu", "Derajat melampaui batas"),
                        WordToken("喜欢", "xǐ huan", "Menyukai / Gemar", "Perasaan suka"),
                        WordToken("我", "wǒ", "Saya", "Kata ganti orang pertama tunggal"),
                        WordToken("的", "de", "Punya / Yang (partikel posesif)", "Partikel penjelas modifikasi atau kepemilikan"),
                        WordToken("新", "xīn", "Baru", "Benda atau waktu mutakhir"),
                        WordToken("家", "jiā", "Rumah / Keluarga", "Tempat tinggal"),
                        WordToken("了", "le", "Sudah (partikel perubahan situasi)", "Partikel aspek selesainya tindakan")
                    )
                )
            ),
            questions = listOf(
                StoryQuestion(
                    id = "q_newhome_1",
                    questionText = "作者的新家有什么特点？ (Apa keistimewaan apartemen baru sang penulis?)",
                    options = listOf("采光很好，房间既明亮又宽敞 (Pencahayaannya bagus, ruangan terang dan lapang)", "非常阴暗潮湿 (Sangat gelap dan lembap)", "离哪里都很远 (Sangat jauh dari mana pun)", "屋顶漏水 (Atap rumahnya bocor)"),
                    correctAnswerIndex = 0,
                    explanation = "Kondisi unit apartemen baru yang bersih, nyaman, dan berlimpah cahaya matahari."
                ),
                StoryQuestion(
                    id = "q_newhome_2",
                    questionText = "新家附近的交通方便吗？ (Apakah akses transportasi di sekitar rumah baru tergolong praktis?)",
                    options = listOf("很不方便，没有车 (Sangat sulit, tidak ada angkutan)", "非常方便，步行几分钟就是地铁站 (Sangat praktis, hanya beberapa menit jalan kaki ke stasiun MRT)", "只能坐船 (Hanya bisa naik perahu)", "每天都堵车走不了 (Tiap hari macet total)"),
                    correctAnswerIndex = 1,
                    explanation = "Kedekatan jarak dengan stasiun kereta bawah tanah memudahkan aktivitas mobilitas kerja harian."
                ),
                StoryQuestion(
                    id = "q_newhome_3",
                    questionText = "作者在客厅摆放了什么让自己感觉舒适的物品？ (Benda apa yang ditaruh penulis di ruang tamu untuk kenyamanan bersantai?)",
                    options = listOf("一张柔软的大沙发和几盆绿色植物 (Sofa empuk yang nyaman dan beberapa pot tanaman hijau segar)", "十台电视机 (Sepuluh unit televisi)", "一张破桌子 (Satu meja reot)", "空无一物 (Dibiarkan kosong melompong)"),
                    correctAnswerIndex = 0,
                    explanation = "Sentuhan tanaman hias dan sofa empuk menghadirkan aura relaksasi yang asri."
                ),
                StoryQuestion(
                    id = "q_newhome_4",
                    questionText = "搬进新家后，作者的心情是怎样的？ (Bagaimana suasana batin penulis setelah menempati hunian baru?)",
                    options = listOf("充满喜悦与对美好生活的期待 (Penuh kegembiraan dan antusiasme menatap hari depan)", "非常后悔 (Sangat menyesal pindah)", "天天失眠害怕 (Setiap hari cemas tidak bisa tidur)", "想马上搬回老房子 (Ingin segera balik ke kontrakan lama)"),
                    correctAnswerIndex = 0,
                    explanation = "Lingkungan baru yang nyaman memberikan energi positif untuk berkarya setiap hari."
                )
            )
        ),
        // Cerita Mandarin Bean 99 (HSK 2): Where Are You Going? (Kamu Mau Pergi ke Mana?)
        Story(
            id = "story_where_are_you_going",
            titleHanzi = "你去哪儿？",
            titlePinyin = "Nǐ Qù Nǎr?",
            titleTranslation = "Where Are You Going? (Kamu Mau Pergi ke Mana?)",
            level = "HSK 2",
            category = "Aktivitas & Perjalanan",
            description = "Percakapan santai di pinggir jalan saat berpapasan dengan teman yang hendak pergi berbelanja buku.",
            coverEmoji = "🚲",
            coverImageRes = R.drawable.cover_story_where_are_you_going,
            estimatedReadMinutes = 2,
            sentences = listOf(
                Sentence(
                    id = "s_wherego_1",
                    hanzi = "A：早！",
                    pinyin = "zǎo",
                    translation = "Morning",
                    tokens = listOf(
                        WordToken("早", "zǎo", "Morning", "Kosakata HSK 2: 早 (zǎo)")
                    )
                ),
                Sentence(
                    id = "s_wherego_2",
                    hanzi = "吃早饭了吗？",
                    pinyin = "chī zǎo fàn le ma",
                    translation = "Makan Morning Nasi / Makanan Sudah (partikel perubahan situasi) Apakah (partikel tanya)",
                    tokens = listOf(
                        WordToken("吃", "chī", "Makan", "Aktivitas mengonsumsi makanan"),
                        WordToken("早", "zǎo", "Morning", "Kosakata HSK 2: 早 (zǎo)"),
                        WordToken("饭", "fàn", "Nasi / Makanan", "Makanan pokok"),
                        WordToken("了", "le", "Sudah (partikel perubahan situasi)", "Partikel aspek selesainya tindakan"),
                        WordToken("吗", "ma", "Apakah (partikel tanya)", "Partikel di akhir kalimat interogatif ya/tidak")
                    )
                ),
                Sentence(
                    id = "s_wherego_3",
                    hanzi = "B：早！",
                    pinyin = "zǎo",
                    translation = "Morning",
                    tokens = listOf(
                        WordToken("早", "zǎo", "Morning", "Kosakata HSK 2: 早 (zǎo)")
                    )
                ),
                Sentence(
                    id = "s_wherego_4",
                    hanzi = "吃了。",
                    pinyin = "chī le",
                    translation = "Makan Sudah (partikel perubahan situasi)",
                    tokens = listOf(
                        WordToken("吃", "chī", "Makan", "Aktivitas mengonsumsi makanan"),
                        WordToken("了", "le", "Sudah (partikel perubahan situasi)", "Partikel aspek selesainya tindakan")
                    )
                ),
                Sentence(
                    id = "s_wherego_5",
                    hanzi = "你去上班啊？",
                    pinyin = "nǐ qù shàng bān á",
                    translation = "Kamu Pergi To go to work Interjection expressing doubt or requiring answer",
                    tokens = listOf(
                        WordToken("你", "nǐ", "Kamu", "Kata ganti orang kedua tunggal"),
                        WordToken("去", "qù", "Pergi", "Berpindah tempat menjauhi pembicara"),
                        WordToken("上班", "shàng bān", "To go to work", "Kosakata HSK 2: 上班 (shàng bān)"),
                        WordToken("啊", "á", "Interjection expressing doubt or requiring answer", "Kosakata HSK 2: 啊 (á)")
                    )
                ),
                Sentence(
                    id = "s_wherego_6",
                    hanzi = "A：今天星期六，不上班。",
                    pinyin = "jīn tiān xīng qī liù bù shàng bān",
                    translation = "Hari ini Minggu / Pekan Six Tidak To go to work",
                    tokens = listOf(
                        WordToken("今天", "jīn tiān", "Hari ini", "Keterangan waktu sekarang"),
                        WordToken("星期", "xīng qī", "Minggu / Pekan", "Satuan pekan"),
                        WordToken("六", "liù", "Six", "Kosakata HSK 2: 六 (liù)"),
                        WordToken("不", "bù", "Tidak", "Kata sangkalan untuk masa kini atau masa depan"),
                        WordToken("上班", "shàng bān", "To go to work", "Kosakata HSK 2: 上班 (shàng bān)")
                    )
                ),
                Sentence(
                    id = "s_wherego_7",
                    hanzi = "B：对，今天星期六！",
                    pinyin = "duì jīn tiān xīng qī liù",
                    translation = "Right; correct Hari ini Minggu / Pekan Six",
                    tokens = listOf(
                        WordToken("对", "duì", "Right; correct", "Kosakata HSK 2: 对 (duì)"),
                        WordToken("今天", "jīn tiān", "Hari ini", "Keterangan waktu sekarang"),
                        WordToken("星期", "xīng qī", "Minggu / Pekan", "Satuan pekan"),
                        WordToken("六", "liù", "Six", "Kosakata HSK 2: 六 (liù)")
                    )
                ),
                Sentence(
                    id = "s_wherego_8",
                    hanzi = "现在那么早，你要去哪儿？",
                    pinyin = "xiàn zài nà me zǎo nǐ yào qù nǎ r",
                    translation = "Sekarang Like that; in that way; to that extent Early Kamu Mau / Akan / Harus Pergi Di mana",
                    tokens = listOf(
                        WordToken("现在", "xiàn zài", "Sekarang", "Waktu saat ini"),
                        WordToken("那么", "nà me", "Like that; in that way; to that extent", "Kosakata HSK 2: 那么 (nà me)"),
                        WordToken("早", "zǎo", "Early", "Kosakata HSK 2: 早 (zǎo)"),
                        WordToken("你", "nǐ", "Kamu", "Kata ganti orang kedua tunggal"),
                        WordToken("要", "yào", "Mau / Akan / Harus", "Menyatakan niat atau keharusan"),
                        WordToken("去", "qù", "Pergi", "Berpindah tempat menjauhi pembicara"),
                        WordToken("哪儿", "nǎ r", "Di mana", "Kata tanya tempat")
                    )
                ),
                Sentence(
                    id = "s_wherego_9",
                    hanzi = "A：我要去图书馆，很久没看书了。",
                    pinyin = "wǒ yào qù tú shū guǎn hěn jiǔ méi kàn shū le",
                    translation = "Saya Mau / Akan / Harus Pergi Library Sangat (of a period of time) long Belum / Tidak Melihat / Membaca Book Sudah (partikel perubahan situasi)",
                    tokens = listOf(
                        WordToken("我", "wǒ", "Saya", "Kata ganti orang pertama tunggal"),
                        WordToken("要", "yào", "Mau / Akan / Harus", "Menyatakan niat atau keharusan"),
                        WordToken("去", "qù", "Pergi", "Berpindah tempat menjauhi pembicara"),
                        WordToken("图书馆", "tú shū guǎn", "Library", "Kosakata HSK 2: 图书馆 (tú shū guǎn)"),
                        WordToken("很", "hěn", "Sangat", "Tingkat derajat"),
                        WordToken("久", "jiǔ", "(of a period of time) long", "Kosakata HSK 2: 久 (jiǔ)"),
                        WordToken("没", "méi", "Belum / Tidak", "Kata sangkalan untuk keberadaan atau masa lampau"),
                        WordToken("看", "kàn", "Melihat / Membaca", "Aktivitas visual"),
                        WordToken("书", "shū", "Book", "Kosakata HSK 2: 书 (shū)"),
                        WordToken("了", "le", "Sudah (partikel perubahan situasi)", "Partikel aspek selesainya tindakan")
                    )
                ),
                Sentence(
                    id = "s_wherego_10",
                    hanzi = "B：那你今天又不能看了。",
                    pinyin = "nà nǐ jīn tiān yòu bù néng kàn le",
                    translation = "Then (in that case) Kamu Hari ini Lagi (telah terjadi) Tidak Bisa / Mampu / Boleh Melihat / Membaca Sudah (partikel perubahan situasi)",
                    tokens = listOf(
                        WordToken("那", "nà", "Then (in that case)", "Kosakata HSK 2: 那 (nà)"),
                        WordToken("你", "nǐ", "Kamu", "Kata ganti orang kedua tunggal"),
                        WordToken("今天", "jīn tiān", "Hari ini", "Keterangan waktu sekarang"),
                        WordToken("又", "yòu", "Lagi (telah terjadi)", "Pengulangan tindakan lampau"),
                        WordToken("不", "bù", "Tidak", "Kata sangkalan untuk masa kini atau masa depan"),
                        WordToken("能", "néng", "Bisa / Mampu / Boleh", "Kata bantu kemampuan atau izin"),
                        WordToken("看", "kàn", "Melihat / Membaca", "Aktivitas visual"),
                        WordToken("了", "le", "Sudah (partikel perubahan situasi)", "Partikel aspek selesainya tindakan")
                    )
                ),
                Sentence(
                    id = "s_wherego_11",
                    hanzi = "A：为什么？",
                    pinyin = "wèi shén me",
                    translation = "Why?",
                    tokens = listOf(
                        WordToken("为什么", "wèi shén me", "Why?", "Kosakata HSK 2: 为什么 (wèi shén me)")
                    )
                ),
                Sentence(
                    id = "s_wherego_12",
                    hanzi = "B：图书馆今天和明天有活动，学生才能去。",
                    pinyin = "tú shū guǎn jīn tiān hé míng tiān yǒu huó dòng xué shēng cái néng qù",
                    translation = "Library Hari ini Dan Besok Mempunyai / Ada (volcanic, seismic, economic etc) activity Siswa / Mahasiswa Baru saja / Justru Bisa / Mampu / Boleh Pergi",
                    tokens = listOf(
                        WordToken("图书馆", "tú shū guǎn", "Library", "Kosakata HSK 2: 图书馆 (tú shū guǎn)"),
                        WordToken("今天", "jīn tiān", "Hari ini", "Keterangan waktu sekarang"),
                        WordToken("和", "hé", "Dan", "Kata hubung setara"),
                        WordToken("明天", "míng tiān", "Besok", "Keterangan waktu mendatang"),
                        WordToken("有", "yǒu", "Mempunyai / Ada", "Menyatakan kepemilikan atau eksistensi"),
                        WordToken("活动", "huó dòng", "(volcanic, seismic, economic etc) activity", "Kosakata HSK 2: 活动 (huó dòng)"),
                        WordToken("学生", "xué shēng", "Siswa / Mahasiswa", "Pelajar"),
                        WordToken("才", "cái", "Baru saja / Justru", "Menyatakan keterlambatan atau kondisi khusus"),
                        WordToken("能", "néng", "Bisa / Mampu / Boleh", "Kata bantu kemampuan atau izin"),
                        WordToken("去", "qù", "Pergi", "Berpindah tempat menjauhi pembicara")
                    )
                ),
                Sentence(
                    id = "s_wherego_13",
                    hanzi = "A：是吗？",
                    pinyin = "shì ma",
                    translation = "Adalah Apakah (partikel tanya)",
                    tokens = listOf(
                        WordToken("是", "shì", "Adalah", "Kopula penjelas"),
                        WordToken("吗", "ma", "Apakah (partikel tanya)", "Partikel di akhir kalimat interogatif ya/tidak")
                    )
                ),
                Sentence(
                    id = "s_wherego_14",
                    hanzi = "我不知道！",
                    pinyin = "wǒ bù zhī dào",
                    translation = "Saya Tidak Tahu / Mengetahui",
                    tokens = listOf(
                        WordToken("我", "wǒ", "Saya", "Kata ganti orang pertama tunggal"),
                        WordToken("不", "bù", "Tidak", "Kata sangkalan untuk masa kini atau masa depan"),
                        WordToken("知道", "zhī dào", "Tahu / Mengetahui", "Memiliki informasi")
                    )
                ),
                Sentence(
                    id = "s_wherego_15",
                    hanzi = "那我去公园跑步吧。",
                    pinyin = "nà wǒ qù gōng yuán pǎo bù ba",
                    translation = "Then (in that case) Saya Pergi Park (for public recreation) To run Kan / Mari (partikel saran)",
                    tokens = listOf(
                        WordToken("那", "nà", "Then (in that case)", "Kosakata HSK 2: 那 (nà)"),
                        WordToken("我", "wǒ", "Saya", "Kata ganti orang pertama tunggal"),
                        WordToken("去", "qù", "Pergi", "Berpindah tempat menjauhi pembicara"),
                        WordToken("公园", "gōng yuán", "Park (for public recreation)", "Kosakata HSK 2: 公园 (gōng yuán)"),
                        WordToken("跑步", "pǎo bù", "To run", "Kosakata HSK 2: 跑步 (pǎo bù)"),
                        WordToken("吧", "ba", "Kan / Mari (partikel saran)", "Partikel saran, ajakan, atau dugaan")
                    )
                ),
                Sentence(
                    id = "s_wherego_16",
                    hanzi = "谢谢你。",
                    pinyin = "xiè xie nǐ",
                    translation = "Thanks Kamu",
                    tokens = listOf(
                        WordToken("谢谢", "xiè xie", "Thanks", "Kosakata HSK 2: 谢谢 (xiè xie)"),
                        WordToken("你", "nǐ", "Kamu", "Kata ganti orang kedua tunggal")
                    )
                ),
                Sentence(
                    id = "s_wherego_17",
                    hanzi = "B：不用谢。",
                    pinyin = "bù yòng xiè",
                    translation = "Need not To thank",
                    tokens = listOf(
                        WordToken("不用", "bù yòng", "Need not", "Kosakata HSK 2: 不用 (bù yòng)"),
                        WordToken("谢", "xiè", "To thank", "Kosakata HSK 2: 谢 (xiè)")
                    )
                )
            ),
            questions = listOf(
                StoryQuestion(
                    id = "q_wherego_1",
                    questionText = "两位朋友是在哪里偶然遇见的？ (Di mana kedua sahabat ini tidak sengaja berpapasan?)",
                    options = listOf("在去往图书馆的路上 (Di jalan menuju arah perpustakaan)", "在飞机上 (Di dalam pesawat terbang)", "在医院病房 (Di bangsal rumah sakit)", "在电影院里 (Di dalam gedung bioskop)"),
                    correctAnswerIndex = 0,
                    explanation = "Pertemuan tak terduga di rute jalan kampus yang biasa dilalui mahasiswa."
                ),
                StoryQuestion(
                    id = "q_wherego_2",
                    questionText = "骑自行车的同学打算去哪里？ (Hendak ke manakah siswa yang mengendarai sepeda itu pergi?)",
                    options = listOf("去书店买一本新的汉语词典 (Pergi ke toko buku membeli kamus Mandarin yang baru)", "去游泳池游泳 (Berenang ke kolam renang)", "回家睡午觉 (Pulang ke rumah untuk tidur siang)", "去火车站接人 (Ke stasiun menjemput kerabat)"),
                    correctAnswerIndex = 0,
                    explanation = "Ia ingin melengkapi referensi belajar dengan membeli kamus bahasa Mandarin terkini."
                ),
                StoryQuestion(
                    id = "q_wherego_3",
                    questionText = "另一位同学接下来准备做什么？ (Apa rencana yang akan dilakukan oleh rekannya?)",
                    options = listOf("正好也要去书店，提议结伴同行 (Kebetulan juga hendak ke toko buku dan mengajak berangkat bersama)", "立刻掉头回家 (Langsung berbalik arah pulang)", "去买菜做饭 (Pergi belanja sayur untuk masak)", "去跑步 (Pergi olahraga lari)"),
                    correctAnswerIndex = 0,
                    explanation = "Tujuan perjalanan yang searah membuat mereka sepakat melangkah bersama."
                ),
                StoryQuestion(
                    id = "q_wherego_4",
                    questionText = "在汉语日常交际中，“你去哪儿？”通常起到什么作用？ (Dalam pergaulan harian, fungsi apa yang diemban oleh sapaan '你去哪儿？'?)",
                    options = listOf("友善的寒暄打招呼方式 (Bentuk sapaan ramah pengakrab suasana antar kenalan)", "警察审讯犯人 (Pemeriksaan polisi kepada tersangka)", "严厉的批评 (Kritikan keras)", "拒绝对方 (Bentuk penolakan)"),
                    correctAnswerIndex = 0,
                    explanation = "Pertanyaan ramah penanda keakraban khas budaya penutur Mandarin saat berselisih jalan."
                )
            )
        ),
        // Cerita Mandarin Bean 100 (HSK 2): My Roommate (Teman Sekamarku)
        Story(
            id = "story_my_roommate",
            titleHanzi = "我的室友",
            titlePinyin = "Wǒ de Shìyǒu",
            titleTranslation = "My Roommate (Teman Sekamarku)",
            level = "HSK 2",
            category = "Kehidupan Mahasiswa",
            description = "Kisah toleransi dan persahabatan hangat antara dua mahasiswa sekamar yang saling melengkapi kebiasaan.",
            coverEmoji = "🛋️",
            coverImageRes = R.drawable.cover_story_my_roommate,
            estimatedReadMinutes = 2,
            sentences = listOf(
                Sentence(
                    id = "s_roommate_1",
                    hanzi = "我的室友是一个法国人，他今年25岁，因为喜欢中国文化，就想来中国工作和生活。",
                    pinyin = "wǒ de shì yǒu shì yī gè Fǎ guó rén tā jīn nián suì yīn wèi xǐ huan Zhōng guó wén huà jiù xiǎng lái Zhōng guó gōng zuò hé shēng huó",
                    translation = "Saya Punya / Yang (partikel posesif) Teman sekamar Adalah One Classifier for people or objects in general Prancis Person; people Dia (laki-laki) This year Classifier for years (of age) Karena Menyukai / Gemar China / Tiongkok Culture Langsung / Segera / Maka Ingin / Berpikir / Rindu Datang China / Tiongkok Bekerja Dan To live",
                    tokens = listOf(
                        WordToken("我", "wǒ", "Saya", "Kata ganti orang pertama tunggal"),
                        WordToken("的", "de", "Punya / Yang (partikel posesif)", "Partikel penjelas modifikasi atau kepemilikan"),
                        WordToken("室友", "shì yǒu", "Teman sekamar", "Orang yang tinggal bersama"),
                        WordToken("是", "shì", "Adalah", "Kopula penjelas"),
                        WordToken("一", "yī", "One", "Kosakata HSK 2: 一 (yī)"),
                        WordToken("个", "gè", "Classifier for people or objects in general", "Kosakata HSK 2: 个 (gè)"),
                        WordToken("法国", "Fǎ guó", "Prancis", "Negara Prancis"),
                        WordToken("人", "rén", "Person; people", "Kosakata HSK 2: 人 (rén)"),
                        WordToken("他", "tā", "Dia (laki-laki)", "Kata ganti orang ketiga tunggal"),
                        WordToken("今年", "jīn nián", "This year", "Kosakata HSK 2: 今年 (jīn nián)"),
                        WordToken("岁", "suì", "Classifier for years (of age)", "Kosakata HSK 2: 岁 (suì)"),
                        WordToken("因为", "yīn wèi", "Karena", "Menyatakan alasan sebab"),
                        WordToken("喜欢", "xǐ huan", "Menyukai / Gemar", "Perasaan suka"),
                        WordToken("中国", "Zhōng guó", "China / Tiongkok", "Negara Tiongkok"),
                        WordToken("文化", "wén huà", "Culture", "Kosakata HSK 2: 文化 (wén huà)"),
                        WordToken("就", "jiù", "Langsung / Segera / Maka", "Menyatakan ketepatan waktu atau kelogisan"),
                        WordToken("想", "xiǎng", "Ingin / Berpikir / Rindu", "Keinginan atau pemikiran batin"),
                        WordToken("来", "lái", "Datang", "Menuju ke arah pembicara"),
                        WordToken("中国", "Zhōng guó", "China / Tiongkok", "Negara Tiongkok"),
                        WordToken("工作", "gōng zuò", "Bekerja", "Aktivitas mata pencaharian"),
                        WordToken("和", "hé", "Dan", "Kata hubung setara"),
                        WordToken("生活", "shēng huó", "To live", "Kosakata HSK 2: 生活 (shēng huó)")
                    )
                ),
                Sentence(
                    id = "s_roommate_2",
                    hanzi = "但是他不会汉语，这里很多工作都必须会说汉语，所以他现在一边学汉语一边找工作。",
                    pinyin = "dàn shì tā bù huì Hàn yǔ zhè lǐ hěn duō gōng zuò dōu bì xū huì shuō Hàn yǔ suǒ yǐ tā xiàn zài yī biān xué Hàn yǔ yī biān zhǎo gōng zuò",
                    translation = "Tetapi / Namun Dia (laki-laki) Tidak Can; to have the skill; to know how to Chinese language Here Many; a lot of Bekerja Semua / Seluruhnya To have to Can; to have the skill; to know how to Berbicara / Berkata Chinese language Sehingga / Oleh karena itu Dia (laki-laki) Sekarang On the one hand Belajar Chinese language On the one hand To try to find Bekerja",
                    tokens = listOf(
                        WordToken("但是", "dàn shì", "Tetapi / Namun", "Kata hubung pertentangan"),
                        WordToken("他", "tā", "Dia (laki-laki)", "Kata ganti orang ketiga tunggal"),
                        WordToken("不", "bù", "Tidak", "Kata sangkalan untuk masa kini atau masa depan"),
                        WordToken("会", "huì", "Can; to have the skill; to know how to", "Kosakata HSK 2: 会 (huì)"),
                        WordToken("汉语", "Hàn yǔ", "Chinese language", "Kosakata HSK 2: 汉语 (Hàn yǔ)"),
                        WordToken("这里", "zhè lǐ", "Here", "Kosakata HSK 2: 这里 (zhè lǐ)"),
                        WordToken("很多", "hěn duō", "Many; a lot of", "Kosakata HSK 2: 很多 (hěn duō)"),
                        WordToken("工作", "gōng zuò", "Bekerja", "Aktivitas mata pencaharian"),
                        WordToken("都", "dōu", "Semua / Seluruhnya", "Menyatakan keuniversalan subjek"),
                        WordToken("必须", "bì xū", "To have to", "Kosakata HSK 2: 必须 (bì xū)"),
                        WordToken("会", "huì", "Can; to have the skill; to know how to", "Kosakata HSK 2: 会 (huì)"),
                        WordToken("说", "shuō", "Berbicara / Berkata", "Menyampaikan ucapan"),
                        WordToken("汉语", "Hàn yǔ", "Chinese language", "Kosakata HSK 2: 汉语 (Hàn yǔ)"),
                        WordToken("所以", "suǒ yǐ", "Sehingga / Oleh karena itu", "Menyatakan akibat konsekuensi"),
                        WordToken("他", "tā", "Dia (laki-laki)", "Kata ganti orang ketiga tunggal"),
                        WordToken("现在", "xiàn zài", "Sekarang", "Waktu saat ini"),
                        WordToken("一边", "yī biān", "On the one hand", "Kosakata HSK 2: 一边 (yī biān)"),
                        WordToken("学", "xué", "Belajar", "Menuntut ilmu"),
                        WordToken("汉语", "Hàn yǔ", "Chinese language", "Kosakata HSK 2: 汉语 (Hàn yǔ)"),
                        WordToken("一边", "yī biān", "On the one hand", "Kosakata HSK 2: 一边 (yī biān)"),
                        WordToken("找", "zhǎo", "To try to find", "Kosakata HSK 2: 找 (zhǎo)"),
                        WordToken("工作", "gōng zuò", "Bekerja", "Aktivitas mata pencaharian")
                    )
                ),
                Sentence(
                    id = "s_roommate_3",
                    hanzi = "他白天有时候在家休息，有时候去学校上课；晚上常常跟朋友去酒吧喝酒，很晚才回来。",
                    pinyin = "tā bái tiān yǒu shí hou zài jiā xiū xi yǒu shí hou qù xué xiào shàng kè wǎn shang cháng cháng gēn péng you qù jiǔ bā hē jiǔ hěn wǎn cái huí lái",
                    translation = "Dia (laki-laki) During the day Sometimes Di / Berada di Rumah / Keluarga To rest Sometimes Pergi Sekolah To go to class Malam hari Frequently; often With Teman / Sahabat Pergi Bar (place to buy drinks) Minum Minuman beralkohol Sangat Late Baru saja / Justru To return; to come back",
                    tokens = listOf(
                        WordToken("他", "tā", "Dia (laki-laki)", "Kata ganti orang ketiga tunggal"),
                        WordToken("白天", "bái tiān", "During the day", "Kosakata HSK 2: 白天 (bái tiān)"),
                        WordToken("有时候", "yǒu shí hou", "Sometimes", "Kosakata HSK 2: 有时候 (yǒu shí hou)"),
                        WordToken("在", "zài", "Di / Berada di", "Preposisi lokasi atau aspek progresif"),
                        WordToken("家", "jiā", "Rumah / Keluarga", "Tempat tinggal"),
                        WordToken("休息", "xiū xi", "To rest", "Kosakata HSK 2: 休息 (xiū xi)"),
                        WordToken("有时候", "yǒu shí hou", "Sometimes", "Kosakata HSK 2: 有时候 (yǒu shí hou)"),
                        WordToken("去", "qù", "Pergi", "Berpindah tempat menjauhi pembicara"),
                        WordToken("学校", "xué xiào", "Sekolah", "Institusi pendidikan"),
                        WordToken("上课", "shàng kè", "To go to class", "Kosakata HSK 2: 上课 (shàng kè)"),
                        WordToken("晚上", "wǎn shang", "Malam hari", "Waktu malam"),
                        WordToken("常常", "cháng cháng", "Frequently; often", "Kosakata HSK 2: 常常 (cháng cháng)"),
                        WordToken("跟", "gēn", "With", "Kosakata HSK 2: 跟 (gēn)"),
                        WordToken("朋友", "péng you", "Teman / Sahabat", "Orang dekat"),
                        WordToken("去", "qù", "Pergi", "Berpindah tempat menjauhi pembicara"),
                        WordToken("酒吧", "jiǔ bā", "Bar (place to buy drinks)", "Kosakata HSK 2: 酒吧 (jiǔ bā)"),
                        WordToken("喝", "hē", "Minum", "Aktivitas mengonsumsi cairan"),
                        WordToken("酒", "jiǔ", "Minuman beralkohol", "Bir atau arak"),
                        WordToken("很", "hěn", "Sangat", "Tingkat derajat"),
                        WordToken("晚", "wǎn", "Late", "Kosakata HSK 2: 晚 (wǎn)"),
                        WordToken("才", "cái", "Baru saja / Justru", "Menyatakan keterlambatan atau kondisi khusus"),
                        WordToken("回来", "huí lái", "To return; to come back", "Kosakata HSK 2: 回来 (huí lái)")
                    )
                ),
                Sentence(
                    id = "s_roommate_4",
                    hanzi = "周末他起床很晚，我们就一起做晚饭，晚上一起看电影。",
                    pinyin = "zhōu mò tā qǐ chuáng hěn wǎn wǒ men jiù yī qǐ zuò wǎn fàn wǎn shang yī qǐ kàn diàn yǐng",
                    translation = "Weekend Dia (laki-laki) Bangun tidur Sangat Late Kami / Kita Langsung / Segera / Maka Together; in company (with) Membuat / Mengerjakan Evening meal Malam hari Together; in company (with) Melihat / Membaca Movie; film",
                    tokens = listOf(
                        WordToken("周末", "zhōu mò", "Weekend", "Kosakata HSK 2: 周末 (zhōu mò)"),
                        WordToken("他", "tā", "Dia (laki-laki)", "Kata ganti orang ketiga tunggal"),
                        WordToken("起床", "qǐ chuáng", "Bangun tidur", "Memulai hari dari ranjang"),
                        WordToken("很", "hěn", "Sangat", "Tingkat derajat"),
                        WordToken("晚", "wǎn", "Late", "Kosakata HSK 2: 晚 (wǎn)"),
                        WordToken("我们", "wǒ men", "Kami / Kita", "Kata ganti orang pertama jamak"),
                        WordToken("就", "jiù", "Langsung / Segera / Maka", "Menyatakan ketepatan waktu atau kelogisan"),
                        WordToken("一起", "yī qǐ", "Together; in company (with)", "Kosakata HSK 2: 一起 (yī qǐ)"),
                        WordToken("做", "zuò", "Membuat / Mengerjakan", "Aktivitas kerja"),
                        WordToken("晚饭", "wǎn fàn", "Evening meal", "Kosakata HSK 2: 晚饭 (wǎn fàn)"),
                        WordToken("晚上", "wǎn shang", "Malam hari", "Waktu malam"),
                        WordToken("一起", "yī qǐ", "Together; in company (with)", "Kosakata HSK 2: 一起 (yī qǐ)"),
                        WordToken("看", "kàn", "Melihat / Membaca", "Aktivitas visual"),
                        WordToken("电影", "diàn yǐng", "Movie; film", "Kosakata HSK 2: 电影 (diàn yǐng)")
                    )
                ),
                Sentence(
                    id = "s_roommate_5",
                    hanzi = "他每个月都有一次汉语考试，快考试的时候，我也会帮他复习汉语。",
                    pinyin = "tā měi gè yuè dōu yǒu yī cì Hàn yǔ kǎo shì kuài kǎo shì de shí hou wǒ yě huì bāng tā fù xí Hàn yǔ",
                    translation = "Dia (laki-laki) Each Classifier for people or objects in general Bulan Semua / Seluruhnya Mempunyai / Ada One Classifier for enumerated events: time Chinese language Exam Cepat Exam Punya / Yang (partikel posesif) Time Saya Juga / Pun To be likely to; to be sure to To help Dia (laki-laki) To review Chinese language",
                    tokens = listOf(
                        WordToken("他", "tā", "Dia (laki-laki)", "Kata ganti orang ketiga tunggal"),
                        WordToken("每", "měi", "Each", "Kosakata HSK 2: 每 (měi)"),
                        WordToken("个", "gè", "Classifier for people or objects in general", "Kosakata HSK 2: 个 (gè)"),
                        WordToken("月", "yuè", "Bulan", "Satuan bulan"),
                        WordToken("都", "dōu", "Semua / Seluruhnya", "Menyatakan keuniversalan subjek"),
                        WordToken("有", "yǒu", "Mempunyai / Ada", "Menyatakan kepemilikan atau eksistensi"),
                        WordToken("一", "yī", "One", "Kosakata HSK 2: 一 (yī)"),
                        WordToken("次", "cì", "Classifier for enumerated events: time", "Kosakata HSK 2: 次 (cì)"),
                        WordToken("汉语", "Hàn yǔ", "Chinese language", "Kosakata HSK 2: 汉语 (Hàn yǔ)"),
                        WordToken("考试", "kǎo shì", "Exam", "Kosakata HSK 2: 考试 (kǎo shì)"),
                        WordToken("快", "kuài", "Cepat", "Kecepatan tinggi"),
                        WordToken("考试", "kǎo shì", "Exam", "Kosakata HSK 2: 考试 (kǎo shì)"),
                        WordToken("的", "de", "Punya / Yang (partikel posesif)", "Partikel penjelas modifikasi atau kepemilikan"),
                        WordToken("时候", "shí hou", "Time", "Kosakata HSK 2: 时候 (shí hou)"),
                        WordToken("我", "wǒ", "Saya", "Kata ganti orang pertama tunggal"),
                        WordToken("也", "yě", "Juga / Pun", "Partikel penanda kesamaan"),
                        WordToken("会", "huì", "To be likely to; to be sure to", "Kosakata HSK 2: 会 (huì)"),
                        WordToken("帮", "bāng", "To help", "Kosakata HSK 2: 帮 (bāng)"),
                        WordToken("他", "tā", "Dia (laki-laki)", "Kata ganti orang ketiga tunggal"),
                        WordToken("复习", "fù xí", "To review", "Kosakata HSK 2: 复习 (fù xí)"),
                        WordToken("汉语", "Hàn yǔ", "Chinese language", "Kosakata HSK 2: 汉语 (Hàn yǔ)")
                    )
                ),
                Sentence(
                    id = "s_roommate_6",
                    hanzi = "现在他的汉语越来越好了，明年就可以考HSK四级了。",
                    pinyin = "xiàn zài tā de Hàn yǔ yuè lái yuè hǎo le míng nián jiù kě yǐ kǎo sì jí le",
                    translation = "Sekarang Dia (laki-laki) Punya / Yang (partikel posesif) Chinese language More and more Bagus / Baik Sudah (partikel perubahan situasi) Next year Langsung / Segera / Maka Boleh / Dapat To check Four Level Sudah (partikel perubahan situasi)",
                    tokens = listOf(
                        WordToken("现在", "xiàn zài", "Sekarang", "Waktu saat ini"),
                        WordToken("他", "tā", "Dia (laki-laki)", "Kata ganti orang ketiga tunggal"),
                        WordToken("的", "de", "Punya / Yang (partikel posesif)", "Partikel penjelas modifikasi atau kepemilikan"),
                        WordToken("汉语", "Hàn yǔ", "Chinese language", "Kosakata HSK 2: 汉语 (Hàn yǔ)"),
                        WordToken("越来越", "yuè lái yuè", "More and more", "Kosakata HSK 2: 越来越 (yuè lái yuè)"),
                        WordToken("好", "hǎo", "Bagus / Baik", "Kualitas positif"),
                        WordToken("了", "le", "Sudah (partikel perubahan situasi)", "Partikel aspek selesainya tindakan"),
                        WordToken("明年", "míng nián", "Next year", "Kosakata HSK 2: 明年 (míng nián)"),
                        WordToken("就", "jiù", "Langsung / Segera / Maka", "Menyatakan ketepatan waktu atau kelogisan"),
                        WordToken("可以", "kě yǐ", "Boleh / Dapat", "Menyatakan izin atau kemungkinan"),
                        WordToken("考", "kǎo", "To check", "Kosakata HSK 2: 考 (kǎo)"),
                        WordToken("四", "sì", "Four", "Kosakata HSK 2: 四 (sì)"),
                        WordToken("级", "jí", "Level", "Kosakata HSK 2: 级 (jí)"),
                        WordToken("了", "le", "Sudah (partikel perubahan situasi)", "Partikel aspek selesainya tindakan")
                    )
                ),
                Sentence(
                    id = "s_roommate_7",
                    hanzi = "希望他考试顺利，能找到一个好工作。",
                    pinyin = "xī wàng tā kǎo shì shùn lì néng zhǎo dào yī gè hǎo gōng zuò",
                    translation = "To hope Dia (laki-laki) Exam Smoothly; without a hitch Bisa / Mampu / Boleh To find One Classifier for people or objects in general Bagus / Baik Bekerja",
                    tokens = listOf(
                        WordToken("希望", "xī wàng", "To hope", "Kosakata HSK 2: 希望 (xī wàng)"),
                        WordToken("他", "tā", "Dia (laki-laki)", "Kata ganti orang ketiga tunggal"),
                        WordToken("考试", "kǎo shì", "Exam", "Kosakata HSK 2: 考试 (kǎo shì)"),
                        WordToken("顺利", "shùn lì", "Smoothly; without a hitch", "Kosakata HSK 2: 顺利 (shùn lì)"),
                        WordToken("能", "néng", "Bisa / Mampu / Boleh", "Kata bantu kemampuan atau izin"),
                        WordToken("找到", "zhǎo dào", "To find", "Kosakata HSK 2: 找到 (zhǎo dào)"),
                        WordToken("一", "yī", "One", "Kosakata HSK 2: 一 (yī)"),
                        WordToken("个", "gè", "Classifier for people or objects in general", "Kosakata HSK 2: 个 (gè)"),
                        WordToken("好", "hǎo", "Bagus / Baik", "Kualitas positif"),
                        WordToken("工作", "gōng zuò", "Bekerja", "Aktivitas mata pencaharian")
                    )
                )
            ),
            questions = listOf(
                StoryQuestion(
                    id = "q_roommate_1",
                    questionText = "我的室友性格怎么样？ (Bagaimana watak kepribadian teman sekamar saya?)",
                    options = listOf("热情开朗，乐于助人 (Ramah, ceria, dan gemar menolong sesama)", "冷漠不理人 (Dingin dan enggan bertegur sapa)", "非常暴躁 (Sangat pemarah)", "胆小怕事 (Penakut)"),
                    correctAnswerIndex = 0,
                    explanation = "Karakter rekan sekamar yang suportif dan bersahabat menciptakan suasana asrama yang nyaman."
                ),
                StoryQuestion(
                    id = "q_roommate_2",
                    questionText = "室友平时有什么擅长的本领？ (Keahlian apa yang dikuasai dengan mahir oleh teman sekamar?)",
                    options = listOf("做得一手色香味俱全的地道家常菜 (Sangat pandai memasak hidangan rumahan yang lezat)", "修理汽车 (Memperbaiki mesin mobil)", "弹钢琴 (Bermain piano)", "画油画 (Melukis cat minyak)"),
                    correctAnswerIndex = 0,
                    explanation = "Keahlian memasaknya kerap memanjakan selera makan mereka berdua di waktu libur."
                ),
                StoryQuestion(
                    id = "q_roommate_3",
                    questionText = "当作者生病发烧时，室友是如何照顾的？ (Bagaimana kepedulian teman sekamar tatkala sang penulis jatuh sakit demam?)",
                    options = listOf("倒温水、买药并细心煮热粥 (Mengambilkan air hangat, membelikan obat, dan memasakkan bubur)", "完全不管不顾 (Masa bodoh membiarkannya)", "收拾行李搬走 (Mengepak koper langsung pindah)", "嫌弃吵闹 (Mengeluh bising)"),
                    correctAnswerIndex = 0,
                    explanation = "Ketulusan merawat saat sakit mempererat jalinan persaudaraan sejati."
                ),
                StoryQuestion(
                    id = "q_roommate_4",
                    questionText = "与室友相处融洽最重要的秘诀是什么？ (Kunci pokok apakah yang menjaga keharmonisan hidup bersama teman sekamar?)",
                    options = listOf("彼此尊重作息、主动沟通与互相体谅 (Saling menghargai waktu istirahat, proaktif berkomunikasi, dan toleransi)", "各管各的一言不发 (Saling mendiamkan tanpa menyapa)", "强迫对方服从自己 (Memaksa teman menuruti kehendak sendiri)", "经常乱扔垃圾 (Kerap membuang sampah sembarangan)"),
                    correctAnswerIndex = 0,
                    explanation = "Saling menghormati batas privasi dan menjaga kebersihan bersama menghadirkan ketenangan asrama."
                )
            )
        )
    )
}
