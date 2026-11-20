package com.example.chineselearning.data.repository

import androidx.compose.ui.graphics.Color
import com.example.chineselearning.data.model.Lesson
import com.example.chineselearning.data.model.NodeIconType
import com.example.chineselearning.data.model.PathNode
import com.example.chineselearning.data.model.UnitCourse
import com.example.chineselearning.data.model.Word

val hsk2Units: List<UnitCourse> by lazy {
    val stories = LearningRepository.stories
    listOf(
        // BAB 17: Keluarga Besar, Kerabat & Kenangan Masa Kecil (家庭亲属、辈分称谓与童年时光)
        UnitCourse(
            id = "unit_17",
            unitNumber = 17,
            title = "Keluarga Besar & Kerabat",
            subtitle = "Kakek nenek, suami istri, anak-anak, masa kecil, dan marga formal",
            bannerTitle = "Keluarga Besar & Kerabat",
            emoji = "👨‍👩‍👧‍👦",
            level = "Level 17 (HSK 2)",
            story = stories[16],
            nodes = listOf(
                PathNode("u17_n1", "Kakek Nenek & Pasangan", Color(0xFFFFC107), NodeIconType.CAP, isCompleted = false, lessonId = "u17_l1"),
                PathNode("u17_n2", "Anak & Generasi Muda", Color(0xFFFFC107), NodeIconType.DUMBBELL, isCompleted = false, lessonId = "u17_l2"),
                PathNode("u17_n3", "Masa Kecil & Ultah", Color(0xFFFFC107), NodeIconType.CAP, isCompleted = false, lessonId = "u17_l3"),
                PathNode("u17_n4", "Marga & Diri Sendiri", Color(0xFFFFC107), NodeIconType.DUMBBELL, isCompleted = false, lessonId = "u17_l4"),
                PathNode("u17_n5", "Evaluasi Keluarga", Color(0xFFFFC107), NodeIconType.SHUFFLE, isCompleted = false, lessonId = "u17_l5"),
                PathNode("u17_n6", "Kuis Cerita Bab 17", Color(0xFFFFC107), NodeIconType.BOOK, isCompleted = false, lessonId = "u17_l1"),
                PathNode("u17_n7", "Checkpoint Peti", Color(0xFFFFB300), NodeIconType.CHEST, isCompleted = false, lessonId = "u17_l1"),
                PathNode("u17_n8", "Rest area", Color(0xFF03A9F4), NodeIconType.REST_AREA, isCompleted = false, lessonId = "u17_l1")
            ),
            lessons = listOf(
                Lesson(
                    id = "u17_l1",
                    title = "Kakek, Nenek & Pasangan",
                    subtitle = "Kosakata 爷爷, 奶奶, 丈夫, dan 妻子",
                    grammarNote = "Panggilan kerabat pihak ayah: 爷爷 (kakek) dan 奶奶 (nenek). Pasangan resmi suami-istri: 丈夫 (zhàngfu - suami) dan 妻子 (qīzi - istri).",
                    newWords = listOf(
                        Word("w17_1", "爷爷", "yéye", "Kakek", "Keluarga", "我爷爷今年七十岁。", "Wǒ yéye jīnnián qīshí suì.", "Kakek saya tahun ini 70 tahun."),
                        Word("w17_2", "奶奶", "nǎinai", "Nenek", "Keluarga", "奶奶做饭很好吃。", "Nǎinai zuòfàn hěn hǎochī.", "Nenek memasak sangat enak."),
                        Word("w17_3", "丈夫", "zhàngfu", "Suami", "Keluarga", "她的丈夫是医生。", "Tā de zhàngfu shì yīshēng.", "Suaminya adalah dokter."),
                        Word("w17_4", "妻子", "qīzi", "Istri", "Keluarga", "我和妻子都喜欢旅游。", "Wǒ hé qīzi dōu xǐhuan lǚyóu.", "Saya dan istri suka berwisata.")
                    ),
                    exercises = bab17Stage1Part1Exercises,
                    exercisesPart1 = bab17Stage1Part1Exercises,
                    exercisesPart2 = bab17Stage1Part2Exercises
                ),
                Lesson(
                    id = "u17_l2",
                    title = "Anak-Anak & Generasi Muda",
                    subtitle = "Kosakata 男孩儿, 女孩儿, dan 小孩儿",
                    grammarNote = "Penyebutan anak dengan sufiks retrofleksi 儿 (ér): 男孩儿 (anak laki-laki), 女孩儿 (anak perempuan), dan 小孩儿 (bocah/anak kecil).",
                    newWords = listOf(
                        Word("w17_5", "男孩儿", "nánháiér", "Anak laki-laki", "Keluarga", "那个男孩儿是谁？", "Nàge nánháiér shì shéi?", "Anak laki-laki itu siapa?"),
                        Word("w17_6", "女孩儿", "nǚháiér", "Anak perempuan", "Keluarga", "前面有一个小女孩儿。", "Qiánmiàn yǒu yí gè xiǎo nǚháiér.", "Di depan ada seorang anak perempuan kecil."),
                        Word("w17_7", "小孩儿", "xiǎoháiér", "Anak kecil / bocah", "Keluarga", "小孩儿在房间里玩。", "Xiǎoháiér zài fángjiān lǐ wán.", "Anak kecil bermain di kamar.")
                    ),
                    exercises = bab17Stage2Part1Exercises,
                    exercisesPart1 = bab17Stage2Part1Exercises,
                    exercisesPart2 = bab17Stage2Part2Exercises
                ),
                Lesson(
                    id = "u17_l3",
                    title = "Masa Kecil & Ulang Tahun",
                    subtitle = "Kosakata 小时候, 从小, dan 生日",
                    grammarNote = "Keterangan waktu lampau: 小时候 (xiǎoshíhou - waktu kecil) dan 从小 (cóngxiǎo - sejak kecil). Perayaan hari lahir: 生日 (shēngrì) -> 祝你生日快乐！",
                    newWords = listOf(
                        Word("w17_8", "小时候", "xiǎoshíhou", "Waktu kecil", "Waktu", "我小时候喜欢唱歌。", "Wǒ xiǎoshíhou xǐhuan chànggē.", "Waktu kecil saya suka menyanyi."),
                        Word("w17_9", "从小", "cóngxiǎo", "Sejak kecil", "Waktu", "他从小学习汉语。", "Tā cóngxiǎo xuéxí Hànyǔ.", "Dia sejak kecil belajar bahasa Mandarin."),
                        Word("w17_10", "生日", "shēngrì", "Hari ulang tahun", "Waktu", "祝你生日快乐！", "Zhù nǐ shēngrì kuàilè!", "Selamat ulang tahun!")
                    ),
                    exercises = bab17Stage3Part1Exercises,
                    exercisesPart1 = bab17Stage3Part1Exercises,
                    exercisesPart2 = bab17Stage3Part2Exercises
                ),
                Lesson(
                    id = "u17_l4",
                    title = "Identitas Diri & Marga Formal",
                    subtitle = "Kosakata 姓, 姓名, 名, dan 自己",
                    grammarNote = "Pertanyaan marga formal: 您贵姓？ (Nín guì xìng?). Nama lengkap: 姓名 (xìngmíng). Penggolong orang terhormat: 名 (míng - 两名医生). Refleksif diri: 自己 (zìjǐ - diri sendiri).",
                    newWords = listOf(
                        Word("w17_11", "姓", "xìng", "Marga / bermarga", "Identitas", "请问您贵姓？", "Qǐngwèn nín guì xìng?", "Bolehkah tanya siapa marga Anda?"),
                        Word("w17_12", "姓名", "xìngmíng", "Nama lengkap", "Identitas", "请在这里写你的姓名。", "Qǐng zài zhèlǐ xiě nǐ de xìngmíng.", "Tolong tuliskan nama lengkap Anda di sini."),
                        Word("w17_13", "名", "míng", "Orang (formal)", "Penggolong", "来了一名新老师。", "Lái le yì míng xīn lǎoshī.", "Datang seorang guru baru."),
                        Word("w17_14", "自己", "zìjǐ", "Diri sendiri", "Kata Ganti", "我们要照顾好自己。", "Wǒmen yào zhàogù hǎo zìjǐ.", "Kita harus merawat diri sendiri dengan baik.")
                    ),
                    exercises = bab17Stage4Part1Exercises,
                    exercisesPart1 = bab17Stage4Part1Exercises,
                    exercisesPart2 = bab17Stage4Part2Exercises
                ),
                Lesson(
                    id = "u17_l5",
                    title = "Evaluasi Komprehensif Keluarga & Kerabat",
                    subtitle = "Review seluruh 14 kosakata kerabat, masa kecil & identitas",
                    grammarNote = "Evaluasi menyeluruh Bab 17: memadukan silsilah keluarga, panggilan kakek-nenek, pasangan suami-istri, kenangan masa kecil, pesta ulang tahun, dan marga formal.",
                    newWords = listOf(
                        Word("w17_1", "爷爷", "yéye", "Kakek", "Keluarga", "爷爷奶奶都在家。", "Yéye nǎinai dōu zài jiā.", "Kakek dan nenek ada di rumah."),
                        Word("w17_3", "丈夫", "zhàngfu", "Suami", "Keluarga", "她的丈夫很爱她。", "Tā de zhàngfu hěn ài tā.", "Suaminya sangat mencintainya."),
                        Word("w17_10", "生日", "shēngrì", "Ulang tahun", "Waktu", "今天是我的生日。", "Jīntiān shì wǒ de shēngrì.", "Hari ini adalah hari ulang tahun saya."),
                        Word("w17_14", "自己", "zìjǐ", "Diri sendiri", "Kata Ganti", "爱自己的家人。", "Ài zìjǐ de jiārén.", "Menyayangi keluarga sendiri.")
                    ),
                    exercises = bab17Stage5Part1Exercises,
                    exercisesPart1 = bab17Stage5Part1Exercises,
                    exercisesPart2 = bab17Stage5Part2Exercises
                )
            )
        ),

        // BAB 18: Warna, Pakaian & Ciri Fisik Penampilan (色彩光谱、穿戴服饰与身材外貌)
        UnitCourse(
            id = "unit_18",
            unitNumber = 18,
            title = "Warna, Pakaian & Fisik",
            subtitle = "Warna dasar, pakaian celana, arloji, tinggi badan, mata, dan tangan",
            bannerTitle = "Warna, Pakaian & Penampilan",
            emoji = "👔",
            level = "Level 18 (HSK 2)",
            story = stories[17],
            nodes = listOf(
                PathNode("u18_n1", "Spektrum Warna", Color(0xFFFFC107), NodeIconType.CAP, isCompleted = false, lessonId = "u18_l1"),
                PathNode("u18_n2", "Pakaian & Aksesoris", Color(0xFFFFC107), NodeIconType.DUMBBELL, isCompleted = false, lessonId = "u18_l2"),
                PathNode("u18_n3", "Postur & Tinggi", Color(0xFFFFC107), NodeIconType.CAP, isCompleted = false, lessonId = "u18_l3"),
                PathNode("u18_n4", "Mata & Tangan", Color(0xFFFFC107), NodeIconType.DUMBBELL, isCompleted = false, lessonId = "u18_l4"),
                PathNode("u18_n5", "Evaluasi Penampilan", Color(0xFFFFC107), NodeIconType.SHUFFLE, isCompleted = false, lessonId = "u18_l5"),
                PathNode("u18_n6", "Kuis Cerita Bab 18", Color(0xFFFFC107), NodeIconType.BOOK, isCompleted = false, lessonId = "u18_l1"),
                PathNode("u18_n7", "Checkpoint Peti", Color(0xFFFFB300), NodeIconType.CHEST, isCompleted = false, lessonId = "u18_l1"),
                PathNode("u18_n8", "Rest area", Color(0xFF03A9F4), NodeIconType.REST_AREA, isCompleted = false, lessonId = "u18_l1")
            ),
            lessons = listOf(
                Lesson(
                    id = "u18_l1",
                    title = "Spektrum Warna Dasar",
                    subtitle = "Kosakata 颜色, 红色, 白色, 黑色, dan 绿色",
                    grammarNote = "Frasa warna: Kata Sifat Warna + 色 (sè) + 的 + Kata Benda (红色的衣服, 白色的车). Menanyakan preferensi: 你喜欢什么颜色？",
                    newWords = listOf(
                        Word("w18_1", "颜色", "yánsè", "Warna", "Warna", "你喜欢什么颜色？", "Nǐ xǐhuan shénme yánsè?", "Kamu suka warna apa?"),
                        Word("w18_2", "红色", "hóngsè", "Warna merah", "Warna", "我买了一件红色的衣服。", "Wǒ mǎi le yí jiàn hóngsè de yīfu.", "Saya membeli baju warna merah."),
                        Word("w18_3", "白色", "báisè", "Warna putih", "Warna", "那辆白色的车很漂亮。", "Nà liàng báisè de chē hěn piàoliang.", "Mobil putih itu sangat indah."),
                        Word("w18_4", "黑色", "hēisè", "Warna hitam", "Warna", "他戴着黑色的手表。", "Tā dài zhe hēisè de shǒubiǎo.", "Dia memakai jam tangan hitam."),
                        Word("w18_5", "绿色", "lǜsè", "Warna hijau", "Warna", "春天树上都是绿色的。", "Chūntiān shùshang dōushì lǜsè de.", "Musim semi dedaunan hijau.")
                    ),
                    exercises = bab18Stage1Part1Exercises,
                    exercisesPart1 = bab18Stage1Part1Exercises,
                    exercisesPart2 = bab18Stage1Part2Exercises
                ),
                Lesson(
                    id = "u18_l2",
                    title = "Pakaian & Aksesoris",
                    subtitle = "Kosakata 裤子, 条, 包, dan 手表",
                    grammarNote = "Kata penggolong benda panjang/celana: 条 (tiáo - 一条裤子). Aksesoris pribadi: 包 (bāo - tas) dan 手表 (shǒubiǎo - arloji/jam tangan).",
                    newWords = listOf(
                        Word("w18_6", "裤子", "kùzi", "Celana", "Pakaian", "这条裤子很便宜。", "Zhè tiáo kùzi hěn piányi.", "Celana ini sangat murah."),
                        Word("w18_7", "条", "tiáo", "Helai (panjang)", "Penggolong", "我想买一条新裤子。", "Wǒ xiǎng mǎi yì tiáo xīn kùzi.", "Saya mau beli celana baru."),
                        Word("w18_8", "包", "bāo", "Tas", "Barang", "红色的包真漂亮。", "Hóngsè de bāo zhēn piàoliang.", "Tas merah sungguh cantik."),
                        Word("w18_9", "手表", "shǒubiǎo", "Jam tangan", "Aksesoris", "这块手表太贵了。", "Zhè kuài shǒubiǎo tài guì le.", "Jam tangan ini terlalu mahal.")
                    ),
                    exercises = bab18Stage2Part1Exercises,
                    exercisesPart1 = bab18Stage2Part1Exercises,
                    exercisesPart2 = bab18Stage2Part2Exercises
                ),
                Lesson(
                    id = "u18_l3",
                    title = "Postur & Tinggi Tubuh",
                    subtitle = "Kosakata 个子, 高, dan 长",
                    grammarNote = "Deskripsi tinggi badan: 个子 (gèzi) + 很高 (hěn gāo). Sifat panjang: 长 (cháng - 头发很长 / 这条路很长).",
                    newWords = listOf(
                        Word("w18_10", "个子", "gèzi", "Tinggi badan", "Fisik", "他的个子很高。", "Tā de gèzi hěn gāo.", "Tinggi badannya sangat tinggi."),
                        Word("w18_11", "高", "gāo", "Tinggi", "Kata Sifat", "姚明的个子非常高。", "Yáo Míng de gèzi fēicháng gāo.", "Postur Yao Ming sangat tinggi."),
                        Word("w18_12", "长", "cháng", "Panjang", "Kata Sifat", "妹妹的头发很长。", "Mèimei de tóufa hěn cháng.", "Rambut adik perempuan panjang.")
                    ),
                    exercises = bab18Stage3Part1Exercises,
                    exercisesPart1 = bab18Stage3Part1Exercises,
                    exercisesPart2 = bab18Stage3Part2Exercises
                ),
                Lesson(
                    id = "u18_l4",
                    title = "Mata & Tangan",
                    subtitle = "Kosakata 眼睛 dan 手",
                    grammarNote = "Ciri fisik wajah: 眼睛 (yǎnjing - mata: 大眼睛). Anggota gerak: 手 (shǒu - tangan: 洗手 = mencuci tangan).",
                    newWords = listOf(
                        Word("w18_13", "眼睛", "yǎnjing", "Mata", "Tubuh", "妹妹的眼睛很大。", "Mèimei de yǎnjing hěn dà.", "Mata adik perempuan besar."),
                        Word("w18_14", "手", "shǒu", "Tangan", "Tubuh", "吃饭前要洗手。", "Chīfàn qián yào xǐ shǒu.", "Sebelum makan harus cuci tangan.")
                    ),
                    exercises = bab18Stage4Part1Exercises,
                    exercisesPart1 = bab18Stage4Part1Exercises,
                    exercisesPart2 = bab18Stage4Part2Exercises
                ),
                Lesson(
                    id = "u18_l5",
                    title = "Evaluasi Komprehensif Busana & Fisik",
                    subtitle = "Review seluruh 14 kosakata warna, pakaian, dan ciri fisik",
                    grammarNote = "Evaluasi menyeluruh Bab 18: memadukan warna pakaian, celana baru, arloji, tas, postur tubuh tinggi, mata besar, dan kebersihan tangan.",
                    newWords = listOf(
                        Word("w18_1", "颜色", "yánsè", "Warna", "Warna", "漂亮颜色的衣服。", "Piàoliang yánsè de yīfu.", "Baju dengan warna indah."),
                        Word("w18_6", "裤子", "kùzi", "Celana", "Pakaian", "一条白色裤子。", "Yì tiáo báisè kùzi.", "Sehelai celana putih."),
                        Word("w18_10", "个子", "gèzi", "Tinggi badan", "Fisik", "个子很高。", "Gèzi hěn gāo.", "Tinggi badannya tinggi."),
                        Word("w18_13", "眼睛", "yǎnjing", "Mata", "Tubuh", "小男孩儿的眼睛。", "Xiǎo nánháiér de yǎnjing.", "Mata anak laki-laki kecil.")
                    ),
                    exercises = bab18Stage5Part1Exercises,
                    exercisesPart1 = bab18Stage5Part1Exercises,
                    exercisesPart2 = bab18Stage5Part2Exercises
                )
            )
        ),

        // BAB 19: Kuliner Restoran, Ragam Minuman & Cita Rasa (餐馆寻味、茶饮咖啡与味蕾体验)
        UnitCourse(
            id = "unit_19",
            unitNumber = 19,
            title = "Kuliner & Restoran",
            subtitle = "Restoran, memesan makanan, daging, ikan, aneka teh, kopi, dan rasa",
            bannerTitle = "Kuliner & Cita Rasa",
            emoji = "🍜",
            level = "Level 19 (HSK 2)",
            story = stories[18],
            nodes = listOf(
                PathNode("u19_n1", "Restoran & Pesan", Color(0xFFFFC107), NodeIconType.CAP, isCompleted = false, lessonId = "u19_l1"),
                PathNode("u19_n2", "Daging & Ikan", Color(0xFFFFC107), NodeIconType.DUMBBELL, isCompleted = false, lessonId = "u19_l2"),
                PathNode("u19_n3", "Teh & Kopi", Color(0xFFFFC107), NodeIconType.CAP, isCompleted = false, lessonId = "u19_l3"),
                PathNode("u19_n4", "Evaluasi Rasa", Color(0xFFFFC107), NodeIconType.DUMBBELL, isCompleted = false, lessonId = "u19_l4"),
                PathNode("u19_n5", "Kebersihan & Toilet", Color(0xFFFFC107), NodeIconType.SHUFFLE, isCompleted = false, lessonId = "u19_l5"),
                PathNode("u19_n6", "Kuis Cerita Bab 19", Color(0xFFFFC107), NodeIconType.BOOK, isCompleted = false, lessonId = "u19_l1"),
                PathNode("u19_n7", "Checkpoint Peti", Color(0xFFFFB300), NodeIconType.CHEST, isCompleted = false, lessonId = "u19_l1"),
                PathNode("u19_n8", "Rest area", Color(0xFF03A9F4), NodeIconType.REST_AREA, isCompleted = false, lessonId = "u19_l1")
            ),
            lessons = listOf(
                Lesson(
                    id = "u19_l1",
                    title = "Suasana Restoran & Memesan",
                    subtitle = "Kosakata 饭馆 dan 点",
                    grammarNote = "Fasilitas makan: 饭馆 (fànguǎn - restoran/rumah makan). Kata kerja memesan: 点 (diǎn - 点菜 = pesan makan).",
                    newWords = listOf(
                        Word("w19_1", "饭馆", "fànguǎn", "Restoran", "Tempat", "学校旁边有一家新饭馆。", "Xuéxiào pángbiān yǒu yì jiā xīn fànguǎn.", "Di samping sekolah ada restoran baru."),
                        Word("w19_2", "点", "diǎn", "Memesan", "Kata Kerja", "服务员，我们要点菜。", "Fúwùyuán, wǒmen yào diǎn cài.", "Pelayan, kami ingin pesan makan.")
                    ),
                    exercises = bab19Stage1Part1Exercises,
                    exercisesPart1 = bab19Stage1Part1Exercises,
                    exercisesPart2 = bab19Stage1Part2Exercises
                ),
                Lesson(
                    id = "u19_l2",
                    title = "Hidangan Daging & Ikan",
                    subtitle = "Kosakata 肉 dan 鱼",
                    grammarNote = "Bahan pangan protein: 肉 (ròu - daging: 牛肉, 羊肉) dan 鱼 (yú - ikan: 新鲜的鱼).",
                    newWords = listOf(
                        Word("w19_3", "肉", "ròu", "Daging", "Makanan", "我不常吃肉。", "Wǒ bù cháng chī ròu.", "Saya tidak sering makan daging."),
                        Word("w19_4", "鱼", "yú", "Ikan", "Makanan", "这家饭馆的鱼很新鲜。", "Zhè jiā fànguǎn de yú hěn xīnxiān.", "Ikan di restoran ini sangat segar.")
                    ),
                    exercises = bab19Stage2Part1Exercises,
                    exercisesPart1 = bab19Stage2Part1Exercises,
                    exercisesPart2 = bab19Stage2Part2Exercises
                ),
                Lesson(
                    id = "u19_l3",
                    title = "Aneka Teh & Kopi Favorit",
                    subtitle = "Kosakata 红茶, 绿茶, 奶茶, dan 咖啡",
                    grammarNote = "Ragam minuman santai: 红茶 (hóngchá - teh hitam), 绿茶 (lǜchá - teh hijau), 奶茶 (nǎichá - milk tea), 咖啡 (kāfēi - kopi).",
                    newWords = listOf(
                        Word("w19_5", "红茶", "hóngchá", "Teh hitam", "Minuman", "请给我一杯热红茶。", "Qǐng gěi wǒ yì bēi rè hóngchá.", "Tolong beri saya segelas teh hitam."),
                        Word("w19_6", "绿茶", "lǜchá", "Teh hijau", "Minuman", "喝绿茶对身体很好。", "Hē lǜchá duì shēntǐ hěn hǎo.", "Minum teh hijau sangat baik untuk tubuh."),
                        Word("w19_7", "奶茶", "nǎichá", "Teh susu / boba", "Minuman", "年轻人喜欢喝奶茶。", "Niánqīngrén xǐhuan hē nǎichá.", "Anak muda suka minum teh susu."),
                        Word("w19_8", "咖啡", "kāfēi", "Kopi", "Minuman", "早上我喝了一杯黑咖啡。", "Zǎoshang wǒ hē le yì bēi hēi kāfēi.", "Pagi hari saya minum kopi hitam.")
                    ),
                    exercises = bab19Stage3Part1Exercises,
                    exercisesPart1 = bab19Stage3Part1Exercises,
                    exercisesPart2 = bab19Stage3Part2Exercises
                ),
                Lesson(
                    id = "u19_l4",
                    title = "Evaluasi Rasa & Pengalaman",
                    subtitle = "Kosakata 不错, 有意思, 没意思, dan 坏",
                    grammarNote = "Evaluasi positif: 不错 (búcuò - lumayan/mantap), 有意思 (yǒuyìsi - menarik). Negatif: 没意思 (membosankan), 坏 (huài - rusak/basi).",
                    newWords = listOf(
                        Word("w19_9", "不错", "búcuò", "Bagus / mantap", "Sifat", "这道菜味道真不错！", "Zhè dào cài wèidao zhēn búcuò!", "Cita rasa hidangan ini sungguh mantap!"),
                        Word("w19_10", "有意思", "yǒuyìsi", "Menarik / asyik", "Ungkapan", "看这本书很有意思。", "Kàn zhè běn shū hěn yǒuyìsi.", "Membaca buku ini sangat menarik."),
                        Word("w19_11", "没意思", "méiyìsi", "Membosankan", "Ungkapan", "这个电影一点也没意思。", "Zhège diànyǐng yìdiǎn yě méiyìsi.", "Film ini membosankan."),
                        Word("w19_12", "坏", "huài", "Rusak / basi", "Sifat", "菜坏了不能吃。", "Cài huài le bù néng chī.", "Masakannya basi tidak bisa dimakan.")
                    ),
                    exercises = bab19Stage4Part1Exercises,
                    exercisesPart1 = bab19Stage4Part1Exercises,
                    exercisesPart2 = bab19Stage4Part2Exercises
                ),
                Lesson(
                    id = "u19_l5",
                    title = "Kebersihan & Fasilitas Toilet",
                    subtitle = "Kosakata 洗 dan 洗手间",
                    grammarNote = "Tindakan mencuci: 洗 (xǐ - 洗手 = cuci tangan). Fasilitas sanitasi: 洗手间 (xǐshǒujiān - toilet/kamar kecil: 洗手间在哪儿？).",
                    newWords = listOf(
                        Word("w19_13", "洗", "xǐ", "Mencuci", "Kata Kerja", "吃水果前要先洗一洗。", "Chī shuǐguǒ qián yào xiān xǐ yi xǐ.", "Sebelum makan buah harus dicuci dulu."),
                        Word("w19_14", "洗手间", "xǐshǒujiān", "Toilet", "Tempat", "请问洗手间在几楼？", "Qǐngwèn xǐshǒujiān zài jǐ lóu?", "Permisi toilet di lantai berapa?"),
                        Word("w19_1", "饭馆", "fànguǎn", "Restoran", "Tempat", "在饭馆吃饭。", "Zài fànguǎn chīfàn.", "Makan di restoran."),
                        Word("w19_9", "不错", "búcuò", "Mantap", "Sifat", "味道真不错。", "Wèidao zhēn búcuò.", "Rasanya sungguh mantap.")
                    ),
                    exercises = bab19Stage5Part1Exercises,
                    exercisesPart1 = bab19Stage5Part1Exercises,
                    exercisesPart2 = bab19Stage5Part2Exercises
                )
            )
        ),

        // BAB 20: Tata Ruang, Posisi Relatif & Arah Mata Angin (空间方位、楼宇格局与相对位置)
        UnitCourse(
            id = "unit_20",
            unitNumber = 20,
            title = "Tata Ruang & Posisi",
            subtitle = "Kiri, kanan, depan, belakang, samping, dalam, luar, atas, bawah, gedung, dan kamar",
            bannerTitle = "Tata Ruang & Posisi Relatif",
            emoji = "🧭",
            level = "Level 20 (HSK 2)",
            story = stories[19],
            nodes = listOf(
                PathNode("u20_n1", "Kiri & Kanan", Color(0xFFFFC107), NodeIconType.CAP, isCompleted = false, lessonId = "u20_l1"),
                PathNode("u20_n2", "Depan Belakang Samping", Color(0xFFFFC107), NodeIconType.DUMBBELL, isCompleted = false, lessonId = "u20_l2"),
                PathNode("u20_n3", "Dalam Luar Atas Bawah", Color(0xFFFFC107), NodeIconType.CAP, isCompleted = false, lessonId = "u20_l3"),
                PathNode("u20_n4", "Lantai & Kamar", Color(0xFFFFC107), NodeIconType.DUMBBELL, isCompleted = false, lessonId = "u20_l4"),
                PathNode("u20_n5", "Evaluasi Tata Ruang", Color(0xFFFFC107), NodeIconType.SHUFFLE, isCompleted = false, lessonId = "u20_l5"),
                PathNode("u20_n6", "Kuis Cerita Bab 20", Color(0xFFFFC107), NodeIconType.BOOK, isCompleted = false, lessonId = "u20_l1"),
                PathNode("u20_n7", "Checkpoint Peti", Color(0xFFFFB300), NodeIconType.CHEST, isCompleted = false, lessonId = "u20_l1"),
                PathNode("u20_n8", "Rest area", Color(0xFF03A9F4), NodeIconType.REST_AREA, isCompleted = false, lessonId = "u20_l1")
            ),
            lessons = listOf(
                Lesson(
                    id = "u20_l1",
                    title = "Sisi Kiri & Sisi Kanan",
                    subtitle = "Kosakata 左, 左边, 右, dan 右边",
                    grammarNote = "Arah lateral: 左 (zuǒ - kiri) vs 右 (yòu - kanan). Frasa posisi: 左边 (sebelah kiri) dan 右边 (sebelah kanan: 洗手间在右边).",
                    newWords = listOf(
                        Word("w20_1", "左", "zuǒ", "Kiri", "Arah", "往左看，有一家书店。", "Wǎng zuǒ kàn, yǒu yì jiā shūdiàn.", "Lihat ke kiri ada toko buku."),
                        Word("w20_2", "左边", "zuǒbian", "Sebelah kiri", "Arah", "学校在医院的左边。", "Xuéxiào zài yīyuàn de zuǒbian.", "Sekolah di sebelah kiri rumah sakit."),
                        Word("w20_3", "右", "yòu", "Kanan", "Arah", "到了路口请往右走。", "Dào le lùkǒu qǐng wǎng yòu zǒu.", "Sampai perempatan silakan jalan ke kanan."),
                        Word("w20_4", "右边", "yòubian", "Sebelah kanan", "Arah", "洗手间在楼梯的右边。", "Xǐshǒujiān zài lóutī de yòubian.", "Toilet di sebelah kanan tangga.")
                    ),
                    exercises = bab20Stage1Part1Exercises,
                    exercisesPart1 = bab20Stage1Part1Exercises,
                    exercisesPart2 = bab20Stage1Part2Exercises
                ),
                Lesson(
                    id = "u20_l2",
                    title = "Depan, Belakang & Sisi Samping",
                    subtitle = "Kosakata 前面, 后面, 旁边, dan 面",
                    grammarNote = "Posisi longitudinal: 前面 (depan), 后面 (belakang). Berdampingan: 旁边 (samping). Sufiks arah: 面 (miàn - 东面, 南面).",
                    newWords = listOf(
                        Word("w20_5", "前面", "qiánmiàn", "Bagian depan / di depan", "Arah", "车站在公司前面。", "Chēzhàn zài gōngsī qiánmiàn.", "Halte di depan kantor."),
                        Word("w20_6", "后面", "hòumiàn", "Bagian belakang / di belakang", "Arah", "房子后面有一个花园。", "Fángzi hòumiàn yǒu yí gè huāyuán.", "Di belakang rumah ada taman."),
                        Word("w20_7", "旁边", "pángbiān", "Samping / sebelah", "Arah", "我就坐在你的旁边。", "Wǒ jiù zuò zài nǐ de pángbiān.", "Saya duduk di sampingmu."),
                        Word("w20_8", "面", "miàn", "Sisi / arah", "Arah", "东面有一座大山。", "Dōngmiàn yǒu yí zuò dà shān.", "Di sisi timur ada gunung besar.")
                    ),
                    exercises = bab20Stage2Part1Exercises,
                    exercisesPart1 = bab20Stage2Part1Exercises,
                    exercisesPart2 = bab20Stage2Part2Exercises
                ),
                Lesson(
                    id = "u20_l3",
                    title = "Dalam, Luar, Atas & Bawah",
                    subtitle = "Kosakata 里面, 外面, 上面, dan 下面",
                    grammarNote = "Posisi vertikal & wadah: 里面 (di dalam), 外面 (di luar), 上面 (di atas), 下面 (di bawah: 小猫在椅子下面).",
                    newWords = listOf(
                        Word("w20_9", "里面", "lǐmiàn", "Bagian dalam / di dalam", "Arah", "书包里面有三本书。", "Shūbāo lǐmiàn yǒu sān běn shū.", "Di dalam tas ada tiga buku."),
                        Word("w20_10", "外面", "wàimiàn", "Bagian luar / di luar", "Arah", "外面正在下大雨。", "Wàimiàn zhèngzài xià dàyǔ.", "Di luar sedang hujan lebat."),
                        Word("w20_11", "上面", "shàngmiàn", "Bagian atas / di atas", "Arah", "桌子上面放着水。", "Zhuōzi shàngmiàn fàng zhe shuǐ.", "Di atas meja ada air."),
                        Word("w20_12", "下面", "xiàmiàn", "Bagian bawah / di bawah", "Arah", "小猫在椅子下面睡觉。", "Xiǎomāo zài yǐzi xiàmiàn shuìjiào.", "Kucing tidur di bawah kursi.")
                    ),
                    exercises = bab20Stage3Part1Exercises,
                    exercisesPart1 = bab20Stage3Part1Exercises,
                    exercisesPart2 = bab20Stage3Part2Exercises
                ),
                Lesson(
                    id = "u20_l4",
                    title = "Lantai Gedung & Penataan Ruangan",
                    subtitle = "Kosakata 楼 dan 间",
                    grammarNote = "Tingkat lantai: 楼 (lóu - 三楼, 上楼). Penggolong ruangan: 间 (jiān - 一间教室, 三十间房间).",
                    newWords = listOf(
                        Word("w20_13", "楼", "lóu", "Gedung / lantai", "Tempat", "我们去五楼上课。", "Wǒmen qù wǔ lóu shàngkè.", "Kita ke lantai lima untuk belajar."),
                        Word("w20_14", "间", "jiān", "Kamar / ruangan", "Penggolong", "这里有三十间房间。", "Zhèlǐ yǒu sānshí jiān fángjiān.", "Di sini ada 30 kamar.")
                    ),
                    exercises = bab20Stage4Part1Exercises,
                    exercisesPart1 = bab20Stage4Part1Exercises,
                    exercisesPart2 = bab20Stage4Part2Exercises
                ),
                Lesson(
                    id = "u20_l5",
                    title = "Evaluasi Komprehensif Tata Ruang",
                    subtitle = "Review seluruh 14 kosakata posisi spasial, arah & gedung",
                    grammarNote = "Evaluasi menyeluruh Bab 20: navigasi denah, menentukan letak ruangan, posisi kiri/kanan/depan/belakang, dan lantai gedung.",
                    newWords = listOf(
                        Word("w20_2", "左边", "zuǒbian", "Sebelah kiri", "Arah", "左边是书店。", "Zuǒbian shì shūdiàn.", "Sebelah kiri toko buku."),
                        Word("w20_4", "右边", "yòubian", "Sebelah kanan", "Arah", "右边是学校。", "Yòubian shì xuéxiào.", "Sebelah kanan sekolah."),
                        Word("w20_7", "旁边", "pángbiān", "Samping", "Arah", "在旁边坐。", "Zài pángbiān zuò.", "Duduk di samping."),
                        Word("w20_13", "楼", "lóu", "Lantai", "Tempat", "房间在三楼。", "Fángjiān zài sān lóu.", "Kamar di lantai tiga.")
                    ),
                    exercises = bab20Stage5Part1Exercises,
                    exercisesPart1 = bab20Stage5Part1Exercises,
                    exercisesPart2 = bab20Stage5Part2Exercises
                )
            )
        ),

        // BAB 21: Pergerakan, Dinamika Arah & Komplemen Arah (趋向动词、位移动态与进出起落)
        UnitCourse(
            id = "unit_21",
            unitNumber = 21,
            title = "Pergerakan & Arah Gerak",
            subtitle = "Masuk, keluar, naik, turun, mendekat, menjauh, dan komplemen arah",
            bannerTitle = "Pergerakan & Komplemen Arah",
            emoji = "🏃",
            level = "Level 21 (HSK 2)",
            story = stories[20],
            nodes = listOf(
                PathNode("u21_n1", "Dinamika Masuk", Color(0xFFFFC107), NodeIconType.CAP, isCompleted = false, lessonId = "u21_l1"),
                PathNode("u21_n2", "Dinamika Keluar", Color(0xFFFFC107), NodeIconType.DUMBBELL, isCompleted = false, lessonId = "u21_l2"),
                PathNode("u21_n3", "Naik Vertikal", Color(0xFFFFC107), NodeIconType.CAP, isCompleted = false, lessonId = "u21_l3"),
                PathNode("u21_n4", "Turun Vertikal", Color(0xFFFFC107), NodeIconType.DUMBBELL, isCompleted = false, lessonId = "u21_l4"),
                PathNode("u21_n5", "Melintas & Pulang", Color(0xFFFFC107), NodeIconType.SHUFFLE, isCompleted = false, lessonId = "u21_l5"),
                PathNode("u21_n6", "Kuis Cerita Bab 21", Color(0xFFFFC107), NodeIconType.BOOK, isCompleted = false, lessonId = "u21_l1"),
                PathNode("u21_n7", "Checkpoint Peti", Color(0xFFFFB300), NodeIconType.CHEST, isCompleted = false, lessonId = "u21_l1"),
                PathNode("u21_n8", "Rest area", Color(0xFF03A9F4), NodeIconType.REST_AREA, isCompleted = false, lessonId = "u21_l1")
            ),
            lessons = listOf(
                Lesson(
                    id = "u21_l1",
                    title = "Dinamika Masuk ke Dalam",
                    subtitle = "Kosakata 进, 进来, dan 进去",
                    grammarNote = "Komplemen arah masuk: 进 (jìn - masuk), 进来 (jìnlái - masuk kemari), 进去 (jìnqù - masuk ke sana).",
                    newWords = listOf(
                        Word("w21_1", "进", "jìn", "Masuk", "Kata Kerja", "请进房间吧。", "Qǐng jìn fángjiān ba.", "Silakan masuk ke kamar."),
                        Word("w21_2", "进来", "jìnlái", "Masuk ke sini", "Kata Kerja", "门开着，你快进来吧。", "Mén kāi zhe, nǐ kuài jìnlái ba.", "Pintu buka, cepatlah kamu masuk."),
                        Word("w21_3", "进去", "jìnqù", "Masuk ke sana", "Kata Kerja", "他在门口，还没进去。", "Tā zài ménkǒu, hái méi jìnqù.", "Dia di pintu, belum masuk.")
                    ),
                    exercises = bab21Stage1Part1Exercises,
                    exercisesPart1 = bab21Stage1Part1Exercises,
                    exercisesPart2 = bab21Stage1Part2Exercises
                ),
                Lesson(
                    id = "u21_l2",
                    title = "Dinamika Keluar Ruangan",
                    subtitle = "Kosakata 出, 出来, 出去, dan 出门",
                    grammarNote = "Komplemen arah keluar: 出 (chū), 出来 (chūlái - keluar kemari), 出去 (chūqù - keluar ke sana), 出门 (chūmén - keluar rumah/bepergian).",
                    newWords = listOf(
                        Word("w21_4", "出", "chū", "Keluar", "Kata Kerja", "他刚走出校门。", "Tā gāng zǒu chū xiàomén.", "Dia baru melangkah keluar gerbang."),
                        Word("w21_5", "出来", "chūlái", "Keluar ke sini", "Kata Kerja", "请大家从教室出来。", "Qǐng dàjiā cóng jiàoshì chūlái.", "Silakan keluar dari kelas."),
                        Word("w21_6", "出去", "chūqù", "Keluar ke sana", "Kata Kerja", "爸爸出去了，不在家。", "Bàba chūqù le, bú zài jiā.", "Ayah keluar, tidak ada di rumah."),
                        Word("w21_7", "出门", "chūmén", "Keluar rumah", "Kata Kerja", "出门前别忘了带钥匙。", "Chūmén qián bié wàng le dài yàoshi.", "Sebelum keluar rumah jangan lupa bawa kunci.")
                    ),
                    exercises = bab21Stage2Part1Exercises,
                    exercisesPart1 = bab21Stage2Part1Exercises,
                    exercisesPart2 = bab21Stage2Part2Exercises
                ),
                Lesson(
                    id = "u21_l3",
                    title = "Dinamika Naik Vertikal",
                    subtitle = "Kosakata 上来 dan 上去",
                    grammarNote = "Pergerakan vertikal ke atas: 上来 (shànglái - naik mendekat ke pembicara) vs 上去 (shàngqù - naik menjauh).",
                    newWords = listOf(
                        Word("w21_8", "上来", "shànglái", "Naik ke sini", "Kata Kerja", "我在二楼，你快上来吧。", "Wǒ zài èr lóu, nǐ kuài shànglái ba.", "Saya di lantai dua, cepat naik kemari."),
                        Word("w21_9", "上去", "shàngqù", "Naik ke sana", "Kata Kerja", "他们已经爬上去了。", "Tāmen yǐjīng pá shàngqù le.", "Mereka sudah naik ke atas sana.")
                    ),
                    exercises = bab21Stage3Part1Exercises,
                    exercisesPart1 = bab21Stage3Part1Exercises,
                    exercisesPart2 = bab21Stage3Part2Exercises
                ),
                Lesson(
                    id = "u21_l4",
                    title = "Dinamika Turun Vertikal",
                    subtitle = "Kosakata 下来 dan 下去",
                    grammarNote = "Pergerakan vertikal ke bawah: 下来 (xiàlái - turun mendekat ke pembicara) vs 下去 (xiàqù - turun menjauhi pembicara).",
                    newWords = listOf(
                        Word("w21_10", "下来", "xiàlái", "Turun ke sini", "Kata Kerja", "太高了，快下来！", "Tài gāo le, kuài xiàlái!", "Terlalu tinggi, cepat turun kemari!"),
                        Word("w21_11", "下去", "xiàqù", "Turun ke sana", "Kata Kerja", "请走下去。", "Qǐng zǒu xiàqù.", "Silakan berjalan turun.")
                    ),
                    exercises = bab21Stage4Part1Exercises,
                    exercisesPart1 = bab21Stage4Part1Exercises,
                    exercisesPart2 = bab21Stage4Part2Exercises
                ),
                Lesson(
                    id = "u21_l5",
                    title = "Melintas, Mendekat & Pulang",
                    subtitle = "Kosakata 过来, 过去, 回来, dan 回去",
                    grammarNote = "Melintas spasial: 过来 (guòlái - mendekat kemari), 过去 (guòqù - melintas ke sana). Kembali: 回来 (huílái - pulang kemari), 回去 (huíqù - kembali ke sana).",
                    newWords = listOf(
                        Word("w21_12", "过来", "guòlái", "Datang kemari", "Kata Kerja", "你过来一下。", "Nǐ guòlái yíxià.", "Kamu kemari sebentar."),
                        Word("w21_13", "过去", "guòqù", "Pergi ke sana", "Kata Kerja", "他朝对面走过去了。", "Tā cháo duìmiàn zǒu guòqù le.", "Dia berjalan ke seberang."),
                        Word("w21_14", "回来", "huílái", "Kembali ke sini", "Kata Kerja", "什么时候回来看我们？", "Shénmeshíhou huílái kàn wǒmen?", "Kapan pulang menjenguk kami?"),
                        Word("w21_15", "回去", "huíqù", "Kembali ke sana", "Kata Kerja", "天黑了，我们快回去吧。", "Tiān hēi le, wǒmen kuài huíqù ba.", "Hari gelap, lekas kita pulang.")
                    ),
                    exercises = bab21Stage5Part1Exercises,
                    exercisesPart1 = bab21Stage5Part1Exercises,
                    exercisesPart2 = bab21Stage5Part2Exercises
                )
            )
        ),

        // BAB 22: Transportasi Publik, Rute Jalan & Mobilitas Kota (城市交通、公交地铁与出行路线)
        UnitCourse(
            id = "unit_22",
            unitNumber = 22,
            title = "Transportasi & Rute",
            subtitle = "Bus umum, MRT, halte, taksi, jalan kaki, kondisi lalu lintas, dan jarak",
            bannerTitle = "Transportasi & Mobilitas Kota",
            emoji = "🚌",
            level = "Level 22 (HSK 2)",
            story = stories[21],
            nodes = listOf(
                PathNode("u22_n1", "Bus & MRT", Color(0xFFFFC107), NodeIconType.CAP, isCompleted = false, lessonId = "u22_l1"),
                PathNode("u22_n2", "Taksi & Jalan Kaki", Color(0xFFFFC107), NodeIconType.DUMBBELL, isCompleted = false, lessonId = "u22_l2"),
                PathNode("u22_n3", "Kondisi Jalan", Color(0xFFFFC107), NodeIconType.CAP, isCompleted = false, lessonId = "u22_l3"),
                PathNode("u22_n4", "Jarak & Kecepatan", Color(0xFFFFC107), NodeIconType.DUMBBELL, isCompleted = false, lessonId = "u22_l4"),
                PathNode("u22_n5", "Evaluasi Mobilitas", Color(0xFFFFC107), NodeIconType.SHUFFLE, isCompleted = false, lessonId = "u22_l5"),
                PathNode("u22_n6", "Kuis Cerita Bab 22", Color(0xFFFFC107), NodeIconType.BOOK, isCompleted = false, lessonId = "u22_l1"),
                PathNode("u22_n7", "Checkpoint Peti", Color(0xFFFFB300), NodeIconType.CHEST, isCompleted = false, lessonId = "u22_l1"),
                PathNode("u22_n8", "Rest area", Color(0xFF03A9F4), NodeIconType.REST_AREA, isCompleted = false, lessonId = "u22_l1")
            ),
            lessons = listOf(
                Lesson(
                    id = "u22_l1",
                    title = "Bus Umum & MRT",
                    subtitle = "Kosakata 公交车, 地铁, 车站, dan 站",
                    grammarNote = "Moda transportasi kota: 公交车 (gōngjiāochē - bus umum), 地铁 (dìtiě - MRT), 车站 (chēzhàn - halte bus/stasiun), 站 (zhàn - halte/stasiun).",
                    newWords = listOf(
                        Word("w22_1", "公交车", "gōngjiāochē", "Bus umum", "Transportasi", "坐公交车去学校只要两块钱。", "Zuò gōngjiāochē qù xuéxiào zhǐyào liǎng kuài qián.", "Naik bus ke sekolah hanya butuh dua yuan."),
                        Word("w22_2", "地铁", "dìtiě", "MRT / kereta bawah tanah", "Transportasi", "坐地铁去机场又快又方便。", "Zuò dìtiě qù jīchǎng yòu kuài yòu fāngbiàn.", "Naik MRT ke bandara cepat dan praktis."),
                        Word("w22_3", "车站", "chēzhàn", "Halte / stasiun", "Tempat", "我们在车站等你。", "Wǒmen zài chēzhàn děng nǐ.", "Kami menunggumu di halte."),
                        Word("w22_4", "站", "zhàn", "Perhentian / halte", "Penggolong", "下一站是市中心。", "Xià yí zhàn shì shìzhōngxīn.", "Halte berikutnya pusat kota.")
                    ),
                    exercises = bab22Stage1Part1Exercises,
                    exercisesPart1 = bab22Stage1Part1Exercises,
                    exercisesPart2 = bab22Stage1Part2Exercises
                ),
                Lesson(
                    id = "u22_l2",
                    title = "Taksi & Jalan Kaki",
                    subtitle = "Kosakata 打车, 走, dan 走路",
                    grammarNote = "Memanggil taksi: 打车 (dǎchē). Berjalan kaki: 走 (zǒu - berjalan/pergi), 走路 (zǒulù - jalan kaki: 走路去上班).",
                    newWords = listOf(
                        Word("w22_5", "打车", "dǎchē", "Naik taksi", "Kata Kerja", "今天下大雨，我们打车吧。", "Jīntiān xià dàyǔ, wǒmen dǎchē ba.", "Hari ini hujan lebat, ayo naik taksi."),
                        Word("w22_6", "走", "zǒu", "Berjalan / pergi", "Kata Kerja", "时间不早了，我得走了。", "Shíjiān bù zǎo le, wǒ děi zǒu le.", "Waktu sudah larut, saya harus pergi."),
                        Word("w22_7", "走路", "zǒulù", "Berjalan kaki", "Kata Kerja", "我每天走路去公司上班。", "Wǒ měitiān zǒulù qù gōngsī shàngbān.", "Saya setiap hari jalan kaki ke kantor.")
                    ),
                    exercises = bab22Stage2Part1Exercises,
                    exercisesPart1 = bab22Stage2Part1Exercises,
                    exercisesPart2 = bab22Stage2Part2Exercises
                ),
                Lesson(
                    id = "u22_l3",
                    title = "Kondisi Lalu Lintas & Jalan",
                    subtitle = "Kosakata 路 dan 路上",
                    grammarNote = "Ruas jalan raya: 路 (lù - jalan: 这条路), 路上 (lùshang - di jalan/dalam perjalanan: 路上小心).",
                    newWords = listOf(
                        Word("w22_8", "路", "lù", "Jalan / rute", "Tempat", "这条路上的车非常多。", "Zhè tiáo lù shang de chē fēicháng duō.", "Mobil di jalan ini sangat banyak."),
                        Word("w22_9", "路上", "lùshang", "Di jalan / perjalanan", "Tempat", "路上小心点儿！", "Lùshang xiǎoxīn diǎnr!", "Hati-hati di jalan ya!")
                    ),
                    exercises = bab22Stage3Part1Exercises,
                    exercisesPart1 = bab22Stage3Part1Exercises,
                    exercisesPart2 = bab22Stage3Part2Exercises
                ),
                Lesson(
                    id = "u22_l4",
                    title = "Jarak Spasial & Kecepatan",
                    subtitle = "Kosakata 离, 远, 近, 快, 慢, dan 往",
                    grammarNote = "Struktur jarak: A 离 B 很远/近. Kecepatan: 快 (cepat) vs 慢 (lambat). Arah gerak: 往 (menuju: 往前走).",
                    newWords = listOf(
                        Word("w22_10", "离", "lí", "Berjarak dari", "Kata Depan", "我家离公司很近。", "Wǒ jiā lí gōngsī hěn jìn.", "Rumah saya dekat dari kantor."),
                        Word("w22_11", "远", "yuǎn", "Jauh", "Kata Sifat", "那个饭馆太远了。", "Nàge fànguǎn tài yuǎn le.", "Restoran itu terlalu jauh."),
                        Word("w22_12", "近", "jìn", "Dekat", "Kata Sifat", "学校离超市很近。", "Xuéxiào lí chāoshì hěn jìn.", "Sekolah sangat dekat dari supermarket."),
                        Word("w22_13", "快", "kuài", "Cepat", "Kata Sifat", "他跑得比大家都快。", "Tā pǎo de bǐ dàjiā dōu kuài.", "Dia lari lebih cepat dari semua orang."),
                        Word("w22_14", "慢", "màn", "Lambat / pelan", "Kata Sifat", "爷爷走路走得很慢。", "Yéye zǒulù zǒu de hěn màn.", "Kakek jalan kaki sangat pelan."),
                        Word("w22_15", "往", "wǎng", "Ke arah / menuju", "Kata Depan", "一直往前走。", "Yìzhí wǎng qián zǒu.", "Jalan lurus terus ke depan.")
                    ),
                    exercises = bab22Stage4Part1Exercises,
                    exercisesPart1 = bab22Stage4Part1Exercises,
                    exercisesPart2 = bab22Stage4Part2Exercises
                ),
                Lesson(
                    id = "u22_l5",
                    title = "Evaluasi Komprehensif Mobilitas Kota",
                    subtitle = "Review seluruh 15 kosakata angkutan kota, jalan & arah",
                    grammarNote = "Evaluasi menyeluruh Bab 22: memilih moda transportasi umum, menanyakan rute jalan, jarak tempuh, dan panduan arah jalan.",
                    newWords = listOf(
                        Word("w22_1", "公交车", "gōngjiāochē", "Bus umum", "Transportasi", "坐公交车很方便。", "Zuò gōngjiāochē hěn fāngbiàn.", "Naik bus sangat praktis."),
                        Word("w22_2", "地铁", "dìtiě", "MRT", "Transportasi", "地铁站在右边。", "Dìtiězhàn zài yòubian.", "Stasiun MRT di kanan."),
                        Word("w22_7", "走路", "zǒulù", "Jalan kaki", "Kata Kerja", "每天走路。", "Měitiān zǒulù.", "Tiap hari jalan kaki."),
                        Word("w22_10", "离", "lí", "Berjarak dari", "Kata Depan", "离这里不远。", "Lí zhèlǐ bù yuǎn.", "Dari sini tidak jauh.")
                    ),
                    exercises = bab22Stage5Part1Exercises,
                    exercisesPart1 = bab22Stage5Part1Exercises,
                    exercisesPart2 = bab22Stage5Part2Exercises
                )
            )
        ),

        // BAB 23: Perjalanan Wisata, Tiket & Berlibur ke Luar Negeri (假日长途游、票务预订与出境见闻)
        UnitCourse(
            id = "unit_23",
            unitNumber = 23,
            title = "Wisata & Luar Negeri",
            subtitle = "Wisata, luar negeri, bandara, tiket pesawat, hotel, perayaan Imlek, dan oleh-oleh",
            bannerTitle = "Wisata & Liburan Internasional",
            emoji = "✈️",
            level = "Level 23 (HSK 2)",
            story = stories[22],
            nodes = listOf(
                PathNode("u23_n1", "Rencana Berlibur", Color(0xFFFFC107), NodeIconType.CAP, isCompleted = false, lessonId = "u23_l1"),
                PathNode("u23_n2", "Bandara & Tiket", Color(0xFFFFC107), NodeIconType.DUMBBELL, isCompleted = false, lessonId = "u23_l2"),
                PathNode("u23_n3", "Hotel & Imlek", Color(0xFFFFC107), NodeIconType.CAP, isCompleted = false, lessonId = "u23_l3"),
                PathNode("u23_n4", "Hadiah & Pernah", Color(0xFFFFC107), NodeIconType.DUMBBELL, isCompleted = false, lessonId = "u23_l4"),
                PathNode("u23_n5", "Evaluasi Wisata", Color(0xFFFFC107), NodeIconType.SHUFFLE, isCompleted = false, lessonId = "u23_l5"),
                PathNode("u23_n6", "Kuis Cerita Bab 23", Color(0xFFFFC107), NodeIconType.BOOK, isCompleted = false, lessonId = "u23_l1"),
                PathNode("u23_n7", "Checkpoint Peti", Color(0xFFFFB300), NodeIconType.CHEST, isCompleted = false, lessonId = "u23_l1"),
                PathNode("u23_n8", "Rest area", Color(0xFF03A9F4), NodeIconType.REST_AREA, isCompleted = false, lessonId = "u23_l1")
            ),
            lessons = listOf(
                Lesson(
                    id = "u23_l1",
                    title = "Rencana Berlibur ke Luar Negeri",
                    subtitle = "Kosakata 旅游, 外国, dan 出国",
                    grammarNote = "Aktivitas wisata: 旅游 (lǚyóu - berwisata), 外国 (wàiguó - luar negeri), 出国 (chūguó - pergi ke luar negeri).",
                    newWords = listOf(
                        Word("w23_1", "旅游", "lǚyóu", "Berwisata / berlibur", "Wisata", "今年冬天我想去北京旅游。", "Jīnnián dōngtiān wǒ xiǎng qù Běijīng lǚyóu.", "Musim dingin ini saya mau ke Beijing berlibur."),
                        Word("w23_2", "外国", "wàiguó", "Luar negeri", "Tempat", "有很多外国朋友在学中文。", "Yǒu hěn duō wàiguó péngyou zài xué Zhōngwén.", "Banyak teman luar negeri belajar Mandarin."),
                        Word("w23_3", "出国", "chūguó", "Pergi ke luar negeri", "Kata Kerja", "他打算明年出国读大学。", "Tā míngnián dǎsuan chūguó dú dàxué.", "Dia berencana tahun depan kuliah di luar negeri.")
                    ),
                    exercises = bab23Stage1Part1Exercises,
                    exercisesPart1 = bab23Stage1Part1Exercises,
                    exercisesPart2 = bab23Stage1Part2Exercises
                ),
                Lesson(
                    id = "u23_l2",
                    title = "Bandara & Tiket Pesawat",
                    subtitle = "Kosakata 机场, 机票, 飞, 票, dan 门票",
                    grammarNote = "Fasilitas penerbangan: 机场 (bandara), 机票 (tiket pesawat), 飞 (terbang). Karcis: 票 (tiket), 门票 (tiket masuk wisata).",
                    newWords = listOf(
                        Word("w23_4", "机场", "jīchǎng", "Bandara", "Tempat", "明天早上我得去机场接朋友。", "Míngtiān zǎoshang wǒ děi qù jīchǎng jiē péngyou.", "Besok pagi saya ke bandara jemput kawan."),
                        Word("w23_5", "机票", "jīpiào", "Tiket pesawat", "Barang", "春节前的机票非常贵。", "Chūnjié qián de jīpiào fēicháng guì.", "Tiket pesawat sebelum Imlek mahal."),
                        Word("w23_6", "飞", "fēi", "Terbang", "Kata Kerja", "飞机飞得很高。", "Fēijī fēi de hěn gāo.", "Pesawat terbang sangat tinggi."),
                        Word("w23_7", "票", "piào", "Tiket / karcis", "Barang", "电影票已经卖完了。", "Diànyǐngpiào yǐjīng mài wán le.", "Tiket bioskop sudah habis."),
                        Word("w23_8", "门票", "ménpiào", "Tiket masuk", "Barang", "公园的门票一张五十块。", "Gōngyuán de ménpiào yì zhāng wǔshí kuài.", "Tiket masuk taman 50 yuan per lembar.")
                    ),
                    exercises = bab23Stage2Part1Exercises,
                    exercisesPart1 = bab23Stage2Part1Exercises,
                    exercisesPart2 = bab23Stage2Part2Exercises
                ),
                Lesson(
                    id = "u23_l3",
                    title = "Hotel & Perayaan Imlek",
                    subtitle = "Kosakata 酒店, 过, 过年, dan 准备",
                    grammarNote = "Penginapan: 酒店 (hotel). Melewati waktu: 过 (guò). Perayaan tahun baru: 过年 (guònián). Kesiapan rencana: 准备 (zhǔnbèi).",
                    newWords = listOf(
                        Word("w23_9", "酒店", "jiǔdiàn", "Hotel", "Tempat", "我们住在海边的酒店。", "Wǒmen zhù zài hǎibiān de jiǔdiàn.", "Kami tinggal di hotel tepi laut."),
                        Word("w23_10", "过", "guò", "Melewati / merayakan", "Kata Kerja", "今天我过得很开心。", "Jīntiān wǒ guò de hěn kāixīn.", "Hari ini saya lalui dengan senang."),
                        Word("w23_11", "过年", "guònián", "Merayakan Imlek", "Kata Kerja", "过年全家团聚在一起。", "Guònián quánjiā tuánjù zài yìqǐ.", "Saat Imlek sekeluarga berkumpul."),
                        Word("w23_12", "准备", "zhǔnbèi", "Mempersiapkan", "Kata Kerja", "我已经准备好去旅游了。", "Wǒ yǐjīng zhǔnbèi hǎo qù lǚyóu le.", "Saya sudah siap berangkat berlibur.")
                    ),
                    exercises = bab23Stage3Part1Exercises,
                    exercisesPart1 = bab23Stage3Part1Exercises,
                    exercisesPart2 = bab23Stage3Part2Exercises
                ),
                Lesson(
                    id = "u23_l4",
                    title = "Memberi Hadiah & Aspek Pernah",
                    subtitle = "Kosakata 送, 拿, dan 过 (guo)",
                    grammarNote = "Pemindahan objek: 送 (sòng - menghadiahi/mengantar) dan 拿 (ná - membawa/mengambil). Aspek pengalaman: Kata Kerja + 过 (guo - pernah).",
                    newWords = listOf(
                        Word("w23_13", "送", "sòng", "Mengantar / memberi hadiah", "Kata Kerja", "朋友送我一本好书。", "Péngyou sòng wǒ yì běn hǎoshū.", "Teman menghadiahkan saya buku bagus."),
                        Word("w23_14", "拿", "ná", "Membawa / memegang", "Kata Kerja", "请帮我拿一下这个包。", "Qǐng bāng wǒ ná yíxià zhège bāo.", "Tolong bantu saya membawa tas ini."),
                        Word("w23_15", "过", "guo", "Pernah (aspek pengalaman)", "Partikel", "你吃过北京烤鸭吗？", "Nǐ chī guo Běijīng kǎoyā ma?", "Apakah kamu pernah makan bebek panggang?")
                    ),
                    exercises = bab23Stage4Part1Exercises,
                    exercisesPart1 = bab23Stage4Part1Exercises,
                    exercisesPart2 = bab23Stage4Part2Exercises
                ),
                Lesson(
                    id = "u23_l5",
                    title = "Evaluasi Komprehensif Wisata & Tiket",
                    subtitle = "Review seluruh 15 kosakata wisata, bandara, hotel, dan tiket",
                    grammarNote = "Evaluasi menyeluruh Bab 23: perencanaan perjalanan ke luar negeri, pembelian tiket pesawat, reservasi hotel, dan pengalaman berwisata.",
                    newWords = listOf(
                        Word("w23_1", "旅游", "lǚyóu", "Berwisata", "Wisata", "买机票飞去北京旅游。", "Mǎi jīpiào fēi qù Běijīng lǚyóu.", "Beli tiket terbang liburan ke Beijing."),
                        Word("w23_5", "机票", "jīpiào", "Tiket pesawat", "Barang", "准备好机票。", "Zhǔnbèi hǎo jīpiào.", "Siapkan tiket pesawat."),
                        Word("w23_9", "酒店", "jiǔdiàn", "Hotel", "Tempat", "住在机场旁的酒店。", "Zhù zài jīchǎng páng de jiǔdiàn.", "Menginap di hotel samping bandara."),
                        Word("w23_3", "出国", "chūguó", "Ke luar negeri", "Kata Kerja", "出国旅游。", "Chūguó lǚyóu.", "Berwisata ke luar negeri.")
                    ),
                    exercises = bab23Stage5Part1Exercises,
                    exercisesPart1 = bab23Stage5Part1Exercises,
                    exercisesPart2 = bab23Stage5Part2Exercises
                )
            )
        ),

        // BAB 24: Kehidupan Kampus, Kelas & Ujian Akademik (菁菁校园、教室课堂与课业测验)
        UnitCourse(
            id = "unit_24",
            unitNumber = 24,
            title = "Kampus & Ujian",
            subtitle = "SMA, kelas, awal semester, buku catatan, pena, tas, mengajar, paham, ujian, dan soal",
            bannerTitle = "Kampus & Ujian Akademik",
            emoji = "🎓",
            level = "Level 24 (HSK 2)",
            story = stories[23],
            nodes = listOf(
                PathNode("u24_n1", "Sekolah & Kelas", Color(0xFFFFC107), NodeIconType.CAP, isCompleted = false, lessonId = "u24_l1"),
                PathNode("u24_n2", "Alat Tulis & Pintu", Color(0xFFFFC107), NodeIconType.DUMBBELL, isCompleted = false, lessonId = "u24_l2"),
                PathNode("u24_n3", "Mengajar & Paham", Color(0xFFFFC107), NodeIconType.CAP, isCompleted = false, lessonId = "u24_l3"),
                PathNode("u24_n4", "Ujian & Butir Soal", Color(0xFFFFC107), NodeIconType.DUMBBELL, isCompleted = false, lessonId = "u24_l4"),
                PathNode("u24_n5", "Evaluasi Akademik", Color(0xFFFFC107), NodeIconType.SHUFFLE, isCompleted = false, lessonId = "u24_l5"),
                PathNode("u24_n6", "Kuis Cerita Bab 24", Color(0xFFFFC107), NodeIconType.BOOK, isCompleted = false, lessonId = "u24_l1"),
                PathNode("u24_n7", "Checkpoint Peti", Color(0xFFFFB300), NodeIconType.CHEST, isCompleted = false, lessonId = "u24_l1"),
                PathNode("u24_n8", "Rest area", Color(0xFF03A9F4), NodeIconType.REST_AREA, isCompleted = false, lessonId = "u24_l1")
            ),
            lessons = listOf(
                Lesson(
                    id = "u24_l1",
                    title = "Jenjang SMA & Awal Masuk",
                    subtitle = "Kosakata 高中, 班, 教室, dan 开学",
                    grammarNote = "Tingkat pendidikan: 高中 (gāozhōng - SMA), 班 (bān - kelas/kelompok), 教室 (jiàoshì - ruang kelas), 开学 (kāixué - awal semester masuk sekolah).",
                    newWords = listOf(
                        Word("w24_1", "高中", "gāozhōng", "SMA", "Pendidikan", "我姐姐现在上高中。", "Wǒ jiějie xiànzài shàng gāozhōng.", "Kakak saya sekolah di SMA."),
                        Word("w24_2", "班", "bān", "Kelas / rombel", "Pendidikan", "我们班一共有二十五个同学。", "Wǒmen bān yígòng yǒu èrshíwǔ gè tóngxué.", "Kelas kami ada 25 siswa."),
                        Word("w24_3", "教室", "jiàoshì", "Ruang kelas", "Tempat", "同学们在教室里学习。", "Tóngxuémen zài jiàoshì lǐ xuéxí.", "Murid-murid belajar di kelas."),
                        Word("w24_4", "开学", "kāixué", "Awal semester", "Waktu", "下星期一我们就开学了。", "Xià xīngqīyī wǒmen jiù kāixué le.", "Senin depan kita awal semester.")
                    ),
                    exercises = bab24Stage1Part1Exercises,
                    exercisesPart1 = bab24Stage1Part1Exercises,
                    exercisesPart2 = bab24Stage1Part2Exercises
                ),
                Lesson(
                    id = "u24_l2",
                    title = "Perlengkapan Belajar & Pintu",
                    subtitle = "Kosakata 本子, 笔, 书包, 门, dan 门口",
                    grammarNote = "Alat tulis: 本子 (buku catatan), 笔 (pena), 书包 (tas sekolah). Pintu: 门 (pintu), 门口 (ambang pintu/gerbang: 在门口等你).",
                    newWords = listOf(
                        Word("w24_5", "本子", "běnzi", "Buku catatan", "Barang", "我在本子上记下。", "Wǒ zài běnzi shang jìxià.", "Saya mencatat di buku catatan."),
                        Word("w24_6", "笔", "bǐ", "Pena / pensil", "Barang", "你能借我一支笔吗？", "Nǐ néng jiè wǒ yì zhī bǐ ma?", "Bisakah pinjamkan saya pena?"),
                        Word("w24_7", "书包", "shūbāo", "Tas sekolah", "Barang", "新书包是妈妈送的。", "Xīn shūbāo shì māma sòng de.", "Tas baru hadiah dari ibu."),
                        Word("w24_8", "门", "mén", "Pintu / gerbang", "Benda", "出门前请把门关上。", "Chūmén qián qǐng bǎ mén guān shàng.", "Sebelum keluar tutup pintunya."),
                        Word("w24_9", "门口", "ménkǒu", "Pintu masuk", "Tempat", "我在学校门口等你。", "Wǒ zài xuéxiào ménkǒu děng nǐ.", "Saya menunggumu di pintu sekolah.")
                    ),
                    exercises = bab24Stage2Part1Exercises,
                    exercisesPart1 = bab24Stage2Part1Exercises,
                    exercisesPart2 = bab24Stage2Part2Exercises
                ),
                Lesson(
                    id = "u24_l3",
                    title = "Pengajaran, Kata & Pemahaman",
                    subtitle = "Kosakata 教, 懂, 词, dan 开始",
                    grammarNote = "Aktivitas instruksi: 教 (jiāo - mengajar), 开始 (kāishǐ - mulai). Pemahaman: 懂 (dǒng - paham: 听懂了). Kosakata: 词 (cí - kata/kosakata).",
                    newWords = listOf(
                        Word("w24_10", "教", "jiāo", "Mengajar", "Kata Kerja", "王老师教我们汉语。", "Wáng lǎoshī jiāo wǒmen Hànyǔ.", "Guru Wang mengajar kami Mandarin."),
                        Word("w24_11", "懂", "dǒng", "Mengerti / paham", "Kata Kerja", "老师讲的话我都懂了。", "Lǎoshī jiǎng de huà wǒ dōu dǒng le.", "Perkataan guru saya paham."),
                        Word("w24_12", "词", "cí", "Kata / kosakata", "Bahasa", "今天我们学了二十个新词。", "Jīntiān wǒmen xué le èrshí gè xīn cí.", "Hari ini belajar 20 kosakata baru."),
                        Word("w24_13", "开始", "kāishǐ", "Mulai / permulaan", "Kata Kerja", "现在我们开始上课。", "Xiànzài wǒmen kāishǐ shàngkè.", "Sekarang kita mulai kelas.")
                    ),
                    exercises = bab24Stage3Part1Exercises,
                    exercisesPart1 = bab24Stage3Part1Exercises,
                    exercisesPart2 = bab24Stage3Part2Exercises
                ),
                Lesson(
                    id = "u24_l4",
                    title = "Pelaksanaan Ujian & Butir Soal",
                    subtitle = "Kosakata 考, 考试, 题, dan 错",
                    grammarNote = "Tes akademik: 考 (kǎo - menguji), 考试 (kǎoshì - ujian). Butir soal: 题 (tí - soal ujian). Kekeliruan: 错 (cuò - salah/keliru: 做错了).",
                    newWords = listOf(
                        Word("w24_14", "考", "kǎo", "Menguji / dites", "Kata Kerja", "明天我们考听力。", "Míngtiān wǒmen kǎo tīnglì.", "Besok kita tes menyimak."),
                        Word("w24_15", "考试", "kǎoshì", "Ujian / ulangan", "Pendidikan", "期末考试大家考得很好。", "Qīmò kǎoshì dàjiā kǎo de hěn hǎo.", "Ujian akhir semua dapat nilai bagus."),
                        Word("w24_16", "题", "tí", "Butir soal / topik", "Pendidikan", "最后一道题很难。", "Zuìhòu yí dào tí hěn nán.", "Soal terakhir sangat sulit."),
                        Word("w24_17", "错", "cuò", "Salah / keliru", "Kata Sifat", "这道题你写错了。", "Zhè dào tí nǐ xiě cuò le.", "Soal ini kamu salah tulis.")
                    ),
                    exercises = bab24Stage4Part1Exercises,
                    exercisesPart1 = bab24Stage4Part1Exercises,
                    exercisesPart2 = bab24Stage4Part2Exercises
                ),
                Lesson(
                    id = "u24_l5",
                    title = "Evaluasi Komprehensif Aktivitas Akademik",
                    subtitle = "Review seluruh 17 kosakata kampus, belajar, dan ujian",
                    grammarNote = "Evaluasi menyeluruh Bab 24: suasana ruang kelas SMA, peralatan alat tulis, penjelasan guru, memahami materi, dan pengerjaan ujian.",
                    newWords = listOf(
                        Word("w24_1", "高中", "gāozhōng", "SMA", "Pendidikan", "在高中学习。", "Zài gāozhōng xuéxí.", "Belajar di SMA."),
                        Word("w24_3", "教室", "jiàoshì", "Ruang kelas", "Tempat", "在教室听课。", "Zài jiàoshì tīngkè.", "Mendengarkan pelajaran di kelas."),
                        Word("w24_11", "懂", "dǒng", "Paham", "Kata Kerja", "新词都懂了。", "Xīn cí dōu dǒng le.", "Kosakata baru sudah paham."),
                        Word("w24_15", "考试", "kǎoshì", "Ujian", "Pendidikan", "考试没做错。", "Kǎoshì méi zuò cuò.", "Ujian tidak ada yang salah.")
                    ),
                    exercises = bab24Stage5Part1Exercises,
                    exercisesPart1 = bab24Stage5Part1Exercises,
                    exercisesPart2 = bab24Stage5Part2Exercises
                )
            )
        ),

        // BAB 25: Olahraga, Kebugaran Fisik & Permainan Bola (强身健体、运动竞技与活力球类)
        UnitCourse(
            id = "unit_25",
            unitNumber = 25,
            title = "Olahraga & Kebugaran",
            subtitle = "Olahraga, lari, jogging, sepak bola, bola basket, renang, tari, dan kebugaran",
            bannerTitle = "Olahraga & Kebugaran Fisik",
            emoji = "⚽",
            level = "Level 25 (HSK 2)",
            story = stories[24],
            nodes = listOf(
                PathNode("u25_n1", "Olahraga & Lari", Color(0xFFFFC107), NodeIconType.CAP, isCompleted = false, lessonId = "u25_l1"),
                PathNode("u25_n2", "Sepak Bola & Basket", Color(0xFFFFC107), NodeIconType.DUMBBELL, isCompleted = false, lessonId = "u25_l2"),
                PathNode("u25_n3", "Renang & Menari", Color(0xFFFFC107), NodeIconType.CAP, isCompleted = false, lessonId = "u25_l3"),
                PathNode("u25_n4", "Bangkit & Kebugaran", Color(0xFFFFC107), NodeIconType.DUMBBELL, isCompleted = false, lessonId = "u25_l4"),
                PathNode("u25_n5", "Evaluasi Olahraga", Color(0xFFFFC107), NodeIconType.SHUFFLE, isCompleted = false, lessonId = "u25_l5"),
                PathNode("u25_n6", "Kuis Cerita Bab 25", Color(0xFFFFC107), NodeIconType.BOOK, isCompleted = false, lessonId = "u25_l1"),
                PathNode("u25_n7", "Checkpoint Peti", Color(0xFFFFB300), NodeIconType.CHEST, isCompleted = false, lessonId = "u25_l1"),
                PathNode("u25_n8", "Rest area", Color(0xFF03A9F4), NodeIconType.REST_AREA, isCompleted = false, lessonId = "u25_l1")
            ),
            lessons = listOf(
                Lesson(
                    id = "u25_l1",
                    title = "Kebugaran Umum & Lari Pagi",
                    subtitle = "Kosakata 运动, 跑, dan 跑步",
                    grammarNote = "Aktivitas fisik: 运动 (yùndòng - olahraga), 跑 (pǎo - berlari), 跑步 (pǎobù - jogging/lari santai).",
                    newWords = listOf(
                        Word("w25_1", "运动", "yùndòng", "Berolahraga / olahraga", "Olahraga", "多运动对身体好。", "Duō yùndòng duì shēntǐ hǎo.", "Banyak olahraga baik untuk tubuh."),
                        Word("w25_2", "跑", "pǎo", "Lari / berlari", "Kata Kerja", "他跑得很快。", "Tā pǎo de hěn kuài.", "Dia berlari sangat cepat."),
                        Word("w25_3", "跑步", "pǎobù", "Berlari santai / jogging", "Kata Kerja", "早晨我去公园跑步。", "Zǎochén wǒ qù gōngyuán pǎobù.", "Pagi hari saya ke taman jogging.")
                    ),
                    exercises = bab25Stage1Part1Exercises,
                    exercisesPart1 = bab25Stage1Part1Exercises,
                    exercisesPart2 = bab25Stage1Part2Exercises
                ),
                Lesson(
                    id = "u25_l2",
                    title = "Sepak Bola & Bola Basket",
                    subtitle = "Kosakata 踢, 足球, 篮球, 球, dan 打",
                    grammarNote = "Permainan bola: 踢 (tī - menendang: 踢足球) vs 打 (dǎ - bermain olahraga tangan: 打篮球). Benda: 足球 (sepak bola), 篮球 (bola basket), 球 (bola).",
                    newWords = listOf(
                        Word("w25_4", "踢", "tī", "Menendang", "Kata Kerja", "在操场踢球。", "Zài cāochǎng tīqiú.", "Bermain bola di lapangan."),
                        Word("w25_5", "足球", "zúqiú", "Sepak bola", "Olahraga", "我喜欢看足球比赛。", "Wǒ xǐhuan kàn zúqiú bǐsài.", "Saya suka nonton sepak bola."),
                        Word("w25_6", "篮球", "lánqiú", "Bola basket", "Olahraga", "弟弟很会打篮球。", "Dìdi hěn huì dǎ lánqiú.", "Adik sangat bisa main basket."),
                        Word("w25_7", "球", "qiú", "Bola", "Barang", "这个球是谁的？", "Zhège qiú shì shéi de?", "Bola ini punya siapa?"),
                        Word("w25_8", "打", "dǎ", "Bermain (tangan) / memukul", "Kata Kerja", "下午去打球。", "Xiàwǔ qù dǎqiú.", "Sore hari pergi main bola.")
                    ),
                    exercises = bab25Stage2Part1Exercises,
                    exercisesPart1 = bab25Stage2Part1Exercises,
                    exercisesPart2 = bab25Stage2Part2Exercises
                ),
                Lesson(
                    id = "u25_l3",
                    title = "Berenang & Seni Gerak Tari",
                    subtitle = "Kosakata 游, 游泳, dan 跳舞",
                    grammarNote = "Aktivitas air: 游 (yóu), 游泳 (yóuyǒng - olahraga renang). Seni gerak: 跳舞 (tiàowǔ - menari/berdansa: 跳舞跳得好看).",
                    newWords = listOf(
                        Word("w25_9", "游", "yóu", "Berenang", "Kata Kerja", "小鱼在水里游。", "Xiǎoyú zài shuǐ lǐ yóu.", "Ikan berenang di air."),
                        Word("w25_10", "游泳", "yóuyǒng", "Berenang", "Olahraga", "夏天去海边游泳。", "Xiàtiān qù hǎibiān yóuyǒng.", "Musim panas ke pantai renang."),
                        Word("w25_11", "跳舞", "tiàowǔ", "Menari / berdansa", "Seni", "姐姐从小喜欢跳舞。", "Jiějie cóngxiǎo xǐhuan tiàowǔ.", "Kakak sejak kecil suka menari.")
                    ),
                    exercises = bab25Stage3Part1Exercises,
                    exercisesPart1 = bab25Stage3Part1Exercises,
                    exercisesPart2 = bab25Stage3Part2Exercises
                ),
                Lesson(
                    id = "u25_l4",
                    title = "Bangkit Berenergi & Stamina",
                    subtitle = "Kosakata 起来, 动, 身体, dan 累",
                    grammarNote = "Arah bangkit: 起来 (qǐlái - bangun/bangkit: 站起来). Gerak: 动 (dòng - bergerak). Kondisi fisik: 身体 (shēntǐ - tubuh), 累 (lèi - lelah/capek).",
                    newWords = listOf(
                        Word("w25_12", "起来", "qǐlái", "Bangun / bangkit", "Kata Kerja", "早上七点我就起来了。", "Zǎoshang qīdiǎn wǒ jiù qǐlái le.", "Jam tujuh pagi saya sudah bangun."),
                        Word("w25_13", "动", "dòng", "Bergerak", "Kata Kerja", "快起来动一动！", "Kuài qǐlái dòng yi dòng!", "Cepat bangun dan bergerak sedikit!"),
                        Word("w25_14", "身体", "shēntǐ", "Tubuh / kesehatan", "Fisik", "你要保重身体。", "Nǐ yào bǎozhòng shēntǐ.", "Kamu harus menjaga kesehatan."),
                        Word("w25_15", "累", "lèi", "Lelah / capek", "Kata Sifat", "今天真累！", "Jīntiān zhēn lèi!", "Hari ini sungguh lelah!")
                    ),
                    exercises = bab25Stage4Part1Exercises,
                    exercisesPart1 = bab25Stage4Part1Exercises,
                    exercisesPart2 = bab25Stage4Part2Exercises
                ),
                Lesson(
                    id = "u25_l5",
                    title = "Evaluasi Komprehensif Olahraga & Kebugaran",
                    subtitle = "Review seluruh 15 kosakata olahraga, bola, renang & kebugaran",
                    grammarNote = "Evaluasi menyeluruh Bab 25: ragam olahraga bola (sepak bola & basket), jogging pagi, berenang, menari, dan menjaga stamina tubuh.",
                    newWords = listOf(
                        Word("w25_1", "运动", "yùndòng", "Olahraga", "Olahraga", "大家一起运动吧！", "Dàjiā yìqǐ yùndòng ba!", "Ayo kita olahraga bersama!"),
                        Word("w25_5", "足球", "zúqiú", "Sepak bola", "Olahraga", "周末去踢足球。", "Zhōumò qù tī zúqiú.", "Akhir pekan main bola."),
                        Word("w25_6", "篮球", "lánqiú", "Basket", "Olahraga", "喜欢打篮球。", "Xǐhuan dǎ lánqiú.", "Suka main basket."),
                        Word("w25_10", "游泳", "yóuyǒng", "Berenang", "Olahraga", "游泳让身体健康。", "Yóuyǒng ràng shēntǐ jiànkāng.", "Renang membuat tubuh sehat.")
                    ),
                    exercises = bab25Stage5Part1Exercises,
                    exercisesPart1 = bab25Stage5Part1Exercises,
                    exercisesPart2 = bab25Stage5Part2Exercises
                )
            )
        ),

        // BAB 26: Gejala Sakit, Obat & Istirahat Pemulihan (病痛关照、药店问诊与康复疗愈)
        UnitCourse(
            id = "unit_26",
            unitNumber = 26,
            title = "Gejala Sakit & Pemulihan",
            subtitle = "Sakit kepala, nyaman, obat, apotek, ranjang, meminta bantuan, mengabari, dan harapan sembuh",
            bannerTitle = "Kesehatan & Pemulihan Sakit",
            emoji = "💊",
            level = "Level 26 (HSK 2)",
            story = stories[25],
            nodes = listOf(
                PathNode("u26_n1", "Kepala & Nyeri", Color(0xFFFFC107), NodeIconType.CAP, isCompleted = false, lessonId = "u26_l1"),
                PathNode("u26_n2", "Obat & Ranjang", Color(0xFFFFC107), NodeIconType.DUMBBELL, isCompleted = false, lessonId = "u26_l2"),
                PathNode("u26_n3", "Minta Bantuan & Tunggu", Color(0xFFFFC107), NodeIconType.CAP, isCompleted = false, lessonId = "u26_l3"),
                PathNode("u26_n4", "Kabar & Kesembuhan", Color(0xFFFFC107), NodeIconType.DUMBBELL, isCompleted = false, lessonId = "u26_l4"),
                PathNode("u26_n5", "Evaluasi Pemulihan", Color(0xFFFFC107), NodeIconType.SHUFFLE, isCompleted = false, lessonId = "u26_l5"),
                PathNode("u26_n6", "Kuis Cerita Bab 26", Color(0xFFFFC107), NodeIconType.BOOK, isCompleted = false, lessonId = "u26_l1"),
                PathNode("u26_n7", "Checkpoint Peti", Color(0xFFFFB300), NodeIconType.CHEST, isCompleted = false, lessonId = "u26_l1"),
                PathNode("u26_n8", "Rest area", Color(0xFF03A9F4), NodeIconType.REST_AREA, isCompleted = false, lessonId = "u26_l1")
            ),
            lessons = listOf(
                Lesson(
                    id = "u26_l1",
                    title = "Rasa Sakit Kepala & Kenyamanan",
                    subtitle = "Kosakata 头, 疼, dan 舒服",
                    grammarNote = "Gejala sakit: 头 (tóu - kepala), 疼 (téng - nyeri/sakit: 头疼, 肚子疼). Kenyamanan tubuh: 舒服 (shūfu - nyaman: 身上不舒服).",
                    newWords = listOf(
                        Word("w26_1", "头", "tóu", "Kepala", "Tubuh", "我头有点疼，想睡一会儿。", "Wǒ tóu yǒudiǎn téng, xiǎng shuì yíhuìér.", "Kepala saya agak pusing, mau tidur sebentar."),
                        Word("w26_2", "疼", "téng", "Sakit / nyeri", "Kata Sifat", "吃太多冰淇淋，肚子很疼。", "Chī tài duō bīngqílín, dùzi hěn téng.", "Makan terlalu banyak es krim, perut sakit."),
                        Word("w26_3", "舒服", "shūfu", "Nyaman / enak badan", "Kata Sifat", "今天我身体不舒服。", "Jīntiān wǒ shēntǐ bù shūfu.", "Hari ini tubuh saya kurang enak.")
                    ),
                    exercises = bab26Stage1Part1Exercises,
                    exercisesPart1 = bab26Stage1Part1Exercises,
                    exercisesPart2 = bab26Stage1Part2Exercises
                ),
                Lesson(
                    id = "u26_l2",
                    title = "Membeli Obat & Istirahat Ranjang",
                    subtitle = "Kosakata 药, 药店, dan 床",
                    grammarNote = "Medikasi: 药 (yào - obat), 药店 (yàodiàn - apotek). Peristirahatan: 床 (chuáng - ranjang/tempat tidur: 躺在床上休息).",
                    newWords = listOf(
                        Word("w26_4", "药", "yào", "Obat", "Medis", "这种药一天吃三次。", "Zhè zhǒng yào yìtiān chī sān cì.", "Obat ini diminum tiga kali sehari."),
                        Word("w26_5", "药店", "yàodiàn", "Apotek / toko obat", "Tempat", "马路对面有一家药店。", "Mǎlù duìmiàn yǒu yì jiā yàodiàn.", "Di seberang jalan ada apotek."),
                        Word("w26_6", "床", "chuáng", "Ranjang / tempat tidur", "Barang", "病人在床上休息。", "Bìngrén zài chuáng shang xiūxi.", "Pasien beristirahat di ranjang.")
                    ),
                    exercises = bab26Stage2Part1Exercises,
                    exercisesPart1 = bab26Stage2Part1Exercises,
                    exercisesPart2 = bab26Stage2Part2Exercises
                ),
                Lesson(
                    id = "u26_l3",
                    title = "Meminta Bantuan & Tolong Menolong",
                    subtitle = "Kosakata 帮, 帮忙, dan 等",
                    grammarNote = "Bantuan sosial: 帮 (bāng - membantu), 帮忙 (bāngmáng - memberi pertolongan). Menunggu: 等 (děng - 等一会儿).",
                    newWords = listOf(
                        Word("w26_7", "帮", "bāng", "Membantu / menolong", "Kata Kerja", "你能帮我买药吗？", "Nǐ néng bāng wǒ mǎi yào ma?", "Bisakah bantu saya beli obat?"),
                        Word("w26_8", "帮忙", "bāngmáng", "Memberi bantuan", "Kata Kerja", "谢谢你帮我的忙。", "Xièxie nǐ bāng wǒ de máng.", "Terima kasih telah membantuku."),
                        Word("w26_9", "等", "děng", "Menunggu", "Kata Kerja", "请在药店等一会儿。", "Qǐng zài yàodiàn děng yíhuìér.", "Silakan tunggu sebentar di apotek.")
                    ),
                    exercises = bab26Stage3Part1Exercises,
                    exercisesPart1 = bab26Stage3Part1Exercises,
                    exercisesPart2 = bab26Stage3Part2Exercises
                ),
                Lesson(
                    id = "u26_l4",
                    title = "Memberi Kabar & Harapan Kesembuhan",
                    subtitle = "Kosakata 告诉 dan 希望",
                    grammarNote = "Penyampaian informasi: 告诉 (gàosu - mengabari). Mendoakan kesembuhan: 希望 (xīwàng - berharap: 希望你快点好起来).",
                    newWords = listOf(
                        Word("w26_10", "告诉", "gàosu", "Memberitahu / mengabari", "Kata Kerja", "请告诉医生我头疼。", "Qǐng gàosu yīshēng wǒ tóuténg.", "Tolong beritahu dokter saya pusing."),
                        Word("w26_11", "希望", "xīwàng", "Berharap / semoga", "Kata Kerja", "我希望你快点好起来。", "Wǒ xīwàng nǐ kuàidiǎn hǎoqǐlai.", "Semoga kamu lekas sembuh membaik.")
                    ),
                    exercises = bab26Stage4Part1Exercises,
                    exercisesPart1 = bab26Stage4Part1Exercises,
                    exercisesPart2 = bab26Stage4Part2Exercises
                ),
                Lesson(
                    id = "u26_l5",
                    title = "Evaluasi Komprehensif Kesehatan & Perawatan",
                    subtitle = "Review seluruh 11 kosakata gejala sakit, apotek & pemulihan",
                    grammarNote = "Evaluasi menyeluruh Bab 26: konsultasi apotek, menjelaskan rasa sakit kepala/perut, meminum obat, meminta bantuan, dan doa kesembuhan.",
                    newWords = listOf(
                        Word("w26_1", "头", "tóu", "Kepala", "Tubuh", "我头疼去药店买药。", "Wǒ tóuténg qù yàodiàn mǎi yào.", "Saya pusing ke apotek beli obat."),
                        Word("w26_3", "舒服", "shūfu", "Nyaman", "Kata Sifat", "吃了药身体很舒服。", "Chī le yào shēntǐ hěn shūfu.", "Minum obat badan jadi nyaman."),
                        Word("w26_4", "药", "yào", "Obat", "Medis", "妈妈叫我吃药。", "Māma jiào wǒ chī yào.", "Ibu suruh saya minum obat."),
                        Word("w26_11", "希望", "xīwàng", "Semoga", "Kata Kerja", "希望你快点好起来！", "Xīwàng nǐ kuàidiǎn hǎoqǐlai!", "Semoga lekas sembuh membaik!")
                    ),
                    exercises = bab26Stage5Part1Exercises,
                    exercisesPart1 = bab26Stage5Part1Exercises,
                    exercisesPart2 = bab26Stage5Part2Exercises
                )
            )
        ),

        // BAB 27: Hobi Kreatif, Alam & Dunia Maya Digital (闲暇雅趣、自然生灵与网络冲浪)
        UnitCourse(
            id = "unit_27",
            unitNumber = 27,
            title = "Hobi, Alam & Internet",
            subtitle = "Melukis, bunga, burung, berselancar daring, menyalakan, senyum, bahagia, dan urusan",
            bannerTitle = "Hobi Kreatif & Dunia Digital",
            emoji = "🎨",
            level = "Level 27 (HSK 2)",
            story = stories[26],
            nodes = listOf(
                PathNode("u27_n1", "Bakat Seni & Lukis", Color(0xFFFFC107), NodeIconType.CAP, isCompleted = false, lessonId = "u27_l1"),
                PathNode("u27_n2", "Bunga & Burung", Color(0xFFFFC107), NodeIconType.DUMBBELL, isCompleted = false, lessonId = "u27_l2"),
                PathNode("u27_n3", "Internet & Buka", Color(0xFFFFC107), NodeIconType.CAP, isCompleted = false, lessonId = "u27_l3"),
                PathNode("u27_n4", "Senyum & Urusan", Color(0xFFFFC107), NodeIconType.DUMBBELL, isCompleted = false, lessonId = "u27_l4"),
                PathNode("u27_n5", "Evaluasi Hobi", Color(0xFFFFC107), NodeIconType.SHUFFLE, isCompleted = false, lessonId = "u27_l5"),
                PathNode("u27_n6", "Kuis Cerita Bab 27", Color(0xFFFFC107), NodeIconType.BOOK, isCompleted = false, lessonId = "u27_l1"),
                PathNode("u27_n7", "Checkpoint Peti", Color(0xFFFFB300), NodeIconType.CHEST, isCompleted = false, lessonId = "u27_l1"),
                PathNode("u27_n8", "Rest area", Color(0xFF03A9F4), NodeIconType.REST_AREA, isCompleted = false, lessonId = "u27_l1")
            ),
            lessons = listOf(
                Lesson(
                    id = "u27_l1",
                    title = "Bakat Seni & Melukis",
                    subtitle = "Kosakata 爱好 dan 画",
                    grammarNote = "Kegemaran kreatif: 爱好 (àihào - hobi), 画 (huà - melukis/gambar: 画画).",
                    newWords = listOf(
                        Word("w27_1", "爱好", "àihào", "Hobi / kegemaran", "Hobi", "我的爱好是画画。", "Wǒ de àihào shì huàhuà.", "Hobi saya adalah melukis."),
                        Word("w27_2", "画", "huà", "Menggambar / melukis", "Seni", "妹妹画的小猫真可爱。", "Mèimei huà de xiǎomāo zhēn kě'ài.", "Kucing yang digambar adik lucu.")
                    ),
                    exercises = bab27Stage1Part1Exercises,
                    exercisesPart1 = bab27Stage1Part1Exercises,
                    exercisesPart2 = bab27Stage1Part2Exercises
                ),
                Lesson(
                    id = "u27_l2",
                    title = "Bunga, Burung & Pengeluaran",
                    subtitle = "Kosakata 花 (bunga), 花 (menghabiskan), dan 鸟",
                    grammarNote = "Keindahan alam: 花 (huā - bunga), 鸟 (niǎo - burung). Penggunaan kerja: 花 (huā - menghabiskan uang/waktu: 花时间, 花钱).",
                    newWords = listOf(
                        Word("w27_3", "花", "huā", "Bunga", "Alam", "花园里开满了花。", "Huāyuán lǐ kāi mǎn le huā.", "Di taman penuh dengan bunga."),
                        Word("w27_4", "花", "huā", "Menghabiskan (biaya/waktu)", "Kata Kerja", "修车花了我五百块钱。", "Xiū chē huā le wǒ wǔbǎi kuài qián.", "Perbaiki mobil habis 500 yuan."),
                        Word("w27_5", "鸟", "niǎo", "Burung", "Alam", "树上有小鸟在唱歌。", "Shùshang yǒu xiǎoniǎo zài chànggē.", "Di atas pohon ada burung berkicau.")
                    ),
                    exercises = bab27Stage2Part1Exercises,
                    exercisesPart1 = bab27Stage2Part1Exercises,
                    exercisesPart2 = bab27Stage2Part2Exercises
                ),
                Lesson(
                    id = "u27_l3",
                    title = "Internet & Membuka Aplikasi",
                    subtitle = "Kosakata 上网, 网上, dan 打开",
                    grammarNote = "Dunia maya digital: 上网 (shàngwǎng - berselancar internet), 网上 (wǎngshang - secara online). Operasi: 打开 (dǎkāi - membuka/menyalakan: 打开电脑).",
                    newWords = listOf(
                        Word("w27_6", "上网", "shàngwǎng", "Berselancar di internet", "Digital", "现在大家每天上网查资料。", "Xiànzài dàjiā měitiān shàngwǎng chá zīliào.", "Sekarang tiap hari semua internetan."),
                        Word("w27_7", "网上", "wǎngshang", "Di internet / daring", "Digital", "网上买东西比商场便宜。", "Wǎngshang mǎi dōngxi bǐ shāngchǎng piányi.", "Beli di internet lebih murah."),
                        Word("w27_8", "打开", "dǎkāi", "Membuka / menyalakan", "Kata Kerja", "请把书打开到三十页。", "Qǐng bǎ shū dǎkāi dào sānshí yè.", "Silakan buka buku ke halaman 30.")
                    ),
                    exercises = bab27Stage3Part1Exercises,
                    exercisesPart1 = bab27Stage3Part1Exercises,
                    exercisesPart2 = bab27Stage3Part2Exercises
                ),
                Lesson(
                    id = "u27_l4",
                    title = "Senyuman Gembira, Urusan & Ingatan",
                    subtitle = "Kosakata 笑, 快乐, 每, 事情, dan 忘",
                    grammarNote = "Ekspresi kebahagiaan: 笑 (xiào - senyum), 快乐 (kuàilè - bahagia). Kuantitas & perkara: 每 (setiap), 事情 (urusan), 忘 (lupa: 别忘了).",
                    newWords = listOf(
                        Word("w27_9", "笑", "xiào", "Tersenyum / tertawa", "Ekspresi", "看到朋友她高兴地笑了。", "Kàndào péngyou tā gāoxìng de xiào le.", "Melihat kawan dia tersenyum gembira."),
                        Word("w27_10", "快乐", "kuàilè", "Bahagia / gembira", "Kata Sifat", "祝大家新年快乐！", "Zhù dàjiā xīnnián kuàilè!", "Semoga kalian semua bahagia!"),
                        Word("w27_11", "每", "měi", "Setiap", "Kata Ganti", "我每天早上都喝牛奶。", "Wǒ měitiān zǎoshang dōu hē niúnǎi.", "Saya setiap pagi minum susu."),
                        Word("w27_12", "事情", "shìqing", "Urusan / persoalan", "Benda", "今天公司有很多事情。", "Jīntiān gōngsī yǒu hěn duō shìqing.", "Hari ini kantor banyak urusan."),
                        Word("w27_13", "忘", "wàng", "Lupa", "Kata Kerja", "对不起，我忘了带课本。", "Duìbuqǐ, wǒ wàng le dài kèběn.", "Maaf, saya lupa membawa buku.")
                    ),
                    exercises = bab27Stage4Part1Exercises,
                    exercisesPart1 = bab27Stage4Part1Exercises,
                    exercisesPart2 = bab27Stage4Part2Exercises
                ),
                Lesson(
                    id = "u27_l5",
                    title = "Evaluasi Komprehensif Hobi & Digital",
                    subtitle = "Review seluruh 13 kosakata hobi, seni, bunga & internet",
                    grammarNote = "Evaluasi menyeluruh Bab 27: hobi melukis, menikmati keindahan bunga dan burung, berselancar daring, senyum gembira, dan mengingat urusan.",
                    newWords = listOf(
                        Word("w27_1", "爱好", "àihào", "Hobi", "Hobi", "爱好是画花。", "Àihào shì huà huā.", "Hobi adalah melukis bunga."),
                        Word("w27_3", "花", "huā", "Bunga", "Alam", "花园里的花真美丽。", "Huāyuán lǐ de huā zhēn měilì.", "Bunga di taman sungguh cantik."),
                        Word("w27_6", "上网", "shàngwǎng", "Online", "Digital", "打开电脑上网。", "Dǎkāi diànnǎo shàngwǎng.", "Nyalakan komputer internetan."),
                        Word("w27_10", "快乐", "kuàilè", "Bahagia", "Kata Sifat", "每天都要快乐生活。", "Měitiān dōu yào kuàilè shēnghuó.", "Setiap hari hiduplah bahagia.")
                    ),
                    exercises = bab27Stage5Part1Exercises,
                    exercisesPart1 = bab27Stage5Part1Exercises,
                    exercisesPart2 = bab27Stage5Part2Exercises
                )
            )
        ),

        // BAB 28: Pola Komparasi, Superlatif & Keterangan Waktu (比较句式、极值程度与时态副词)
        UnitCourse(
            id = "unit_28",
            unitNumber = 28,
            title = "Komparasi & Waktu",
            subtitle = "Pola perbandingan 比, superlatif 最, partikel 得 dan 地, demonstratif derajat, dan penanda waktu",
            bannerTitle = "Komparasi, Derajat & Waktu",
            emoji = "⚖️",
            level = "Level 28 (HSK 2)",
            story = stories[27],
            nodes = listOf(
                PathNode("u28_n1", "Komparasi Dasar", Color(0xFFFFC107), NodeIconType.CAP, isCompleted = false, lessonId = "u28_l1"),
                PathNode("u28_n2", "Partikel Hasil & Cara", Color(0xFFFFC107), NodeIconType.DUMBBELL, isCompleted = false, lessonId = "u28_l2"),
                PathNode("u28_n3", "Derajat & Ragam Cara", Color(0xFFFFC107), NodeIconType.CAP, isCompleted = false, lessonId = "u28_l3"),
                PathNode("u28_n4", "Frekuensi Rutinitas", Color(0xFFFFC107), NodeIconType.DUMBBELL, isCompleted = false, lessonId = "u28_l4"),
                PathNode("u28_n5", "Evaluasi Komparasi", Color(0xFFFFC107), NodeIconType.SHUFFLE, isCompleted = false, lessonId = "u28_l5"),
                PathNode("u28_n6", "Kuis Cerita Bab 28", Color(0xFFFFC107), NodeIconType.BOOK, isCompleted = false, lessonId = "u28_l1"),
                PathNode("u28_n7", "Checkpoint Peti", Color(0xFFFFB300), NodeIconType.CHEST, isCompleted = false, lessonId = "u28_l1"),
                PathNode("u28_n8", "Rest area", Color(0xFF03A9F4), NodeIconType.REST_AREA, isCompleted = false, lessonId = "u28_l1")
            ),
            lessons = listOf(
                Lesson(
                    id = "u28_l1",
                    title = "Pola Komparasi Dasar A 比 B",
                    subtitle = "Kosakata 比 dan 最",
                    grammarNote = "Pola perbandingan komparatif: A + 比 (bǐ) + B + Kata Sifat (哥哥比弟弟高). Superlatif ekstrem: 最 (zuì - paling: 最好, 最喜欢).",
                    newWords = listOf(
                        Word("w28_1", "比", "bǐ", "Dibandingkan / daripada", "Tata Bahasa", "今天天气比昨天好。", "Jīntiān tiānqì bǐ zuótiān hǎo.", "Hari ini cuaca lebih baik dari kemarin."),
                        Word("w28_2", "最", "zuì", "Paling / ter-", "Keterangan", "他汉语说得最好。", "Tā Hànyǔ shuō de zuì hǎo.", "Dia bicara Mandarin paling bagus.")
                    ),
                    exercises = bab28Stage1Part1Exercises,
                    exercisesPart1 = bab28Stage1Part1Exercises,
                    exercisesPart2 = bab28Stage1Part2Exercises
                ),
                Lesson(
                    id = "u28_l2",
                    title = "Partikel Struktural Hasil & Cara",
                    subtitle = "Kosakata 得 dan 地",
                    grammarNote = "Partikel komplemen hasil derajat: Kata Kerja + 得 (de) + Kata Sifat (写得很漂亮). Partikel penanda adverbial cara: Kata Sifat + 地 (de) + Kata Kerja (慢慢地走).",
                    newWords = listOf(
                        Word("w28_3", "得", "de", "Partikel derajat hasil", "Partikel", "小明汉字写得非常漂亮。", "Xiǎomíng Hànzì xiě de fēicháng piàoliang.", "Xiao Ming menulis Hanzi sangat indah."),
                        Word("w28_4", "地", "de", "Partikel keterangan cara", "Partikel", "同学们认真地听课。", "Tóngxuémen rènzhēn de tīngkè.", "Siswa mendengarkan dengan sungguh-sungguh.")
                    ),
                    exercises = bab28Stage2Part1Exercises,
                    exercisesPart1 = bab28Stage2Part1Exercises,
                    exercisesPart2 = bab28Stage2Part2Exercises
                ),
                Lesson(
                    id = "u28_l3",
                    title = "Demonstratif Derajat & Ragam Cara",
                    subtitle = "Kosakata 那么, 那样, 这么, dan 这样",
                    grammarNote = "Derajat: 这么 (zhème - sebegini), 那么 (nàme - sebegitu). Ragam cara: 这样 (zhèyàng - cara begini), 那样 (nàyàng - cara begitu).",
                    newWords = listOf(
                        Word("w28_5", "那么", "nàme", "Sebegitu / kalau begitu", "Keterangan", "天气那么好，去公园吧。", "Tiānqì nàme hǎo, qù gōngyuán ba.", "Cuaca begitu bagus, ayo ke taman."),
                        Word("w28_6", "那样", "nàyàng", "Seperti itu", "Kata Ganti", "你不用那样做。", "Nǐ bú yòng nàyàng zuò.", "Kamu tak usah berbuat seperti itu."),
                        Word("w28_7", "这么", "zhème", "Sebegini / begitu", "Keterangan", "怎么这么便宜？", "Zěnme zhème piányi?", "Kenapa begitu murah?"),
                        Word("w28_8", "这样", "zhèyàng", "Seperti ini / begini", "Kata Ganti", "这样做才能学好汉语。", "Zhèyàng zuò cáinéng xuéhǎo Hànyǔ.", "Berbuat begini baru bisa belajar Mandarin.")
                    ),
                    exercises = bab28Stage3Part1Exercises,
                    exercisesPart1 = bab28Stage3Part1Exercises,
                    exercisesPart2 = bab28Stage3Part2Exercises
                ),
                Lesson(
                    id = "u28_l4",
                    title = "Frekuensi Rutinitas & Durasi Sejenak",
                    subtitle = "Kosakata 经常, 有时, dan 一会儿",
                    grammarNote = "Frekuensi waktu: 经常 (jīngcháng - sering/kerap), 有时 (yǒushí - kadang-kadang). Durasi sekejap: 一会儿 (yíhuìér - sebentar: 等我一会儿).",
                    newWords = listOf(
                        Word("w28_9", "经常", "jīngcháng", "Sering / kerap kali", "Keterangan", "周末我经常去图书馆。", "Zhōumò wǒ jīngcháng qù túshūguǎn.", "Akhir pekan saya sering ke perpustakaan."),
                        Word("w28_10", "有时", "yǒushí", "Kadang-kadang / terkadang", "Keterangan", "他有时跑步，有时游泳。", "Tā yǒushí pǎobù, yǒushí yóuyǒng.", "Dia kadang jogging, kadang renang."),
                        Word("w28_11", "一会儿", "yíhuìér", "Sebentar / sejenak", "Waktu", "请在门口等我一会儿。", "Qǐng zài ménkǒu děng wǒ yíhuìér.", "Tolong tunggu saya sebentar di pintu.")
                    ),
                    exercises = bab28Stage4Part1Exercises,
                    exercisesPart1 = bab28Stage4Part1Exercises,
                    exercisesPart2 = bab28Stage4Part2Exercises
                ),
                Lesson(
                    id = "u28_l5",
                    title = "Aspek Waktu Progresif & Sudah Terjadi",
                    subtitle = "Kosakata 已经, 快要, dan 正",
                    grammarNote = "Penanda temporal: 已经 (yǐjīng - sudah/telah), 快要...了 (kuàiyào...le - sebentar lagi akan), 正 (zhèng - sedang/tepat saat).",
                    newWords = listOf(
                        Word("w28_12", "已经", "yǐjīng", "Sudah / telah", "Keterangan", "电影已经开始了。", "Diànyǐng yǐjīng kāishǐ le.", "Film sudah dimulai."),
                        Word("w28_13", "快要", "kuàiyào", "Sebentar lagi akan", "Keterangan", "火车快要开了。", "Huǒchē kuàiyào kāi le.", "Kereta sebentar lagi berangkat."),
                        Word("w28_14", "正", "zhèng", "Sedang / tepat", "Keterangan", "我正想打电话给你。", "Wǒ zhèng xiǎng dǎ diànhuà gěi nǐ.", "Saya tepat sedang mau teleponmu.")
                    ),
                    exercises = bab28Stage5Part1Exercises,
                    exercisesPart1 = bab28Stage5Part1Exercises,
                    exercisesPart2 = bab28Stage5Part2Exercises
                )
            )
        ),

        // BAB 29: Logika Hubungan Antarklausa, Sebab-Akibat & Etiket (复句关联、因果转折与交际礼节)
        UnitCourse(
            id = "unit_29",
            unitNumber = 29,
            title = "Logika & Etiket",
            subtitle = "Sebab-akibat 因为/所以, pertentangan 虽然/但是, alternatif 还是, kausatif 让, dan etiket 不好意思",
            bannerTitle = "Hubungan Antarklausa & Etiket",
            emoji = "🤝",
            level = "Level 29 (HSK 2)",
            story = stories[28],
            nodes = listOf(
                PathNode("u29_n1", "Sebab-Akibat", Color(0xFFFFC107), NodeIconType.CAP, isCompleted = false, lessonId = "u29_l1"),
                PathNode("u29_n2", "Pertentangan", Color(0xFFFFC107), NodeIconType.DUMBBELL, isCompleted = false, lessonId = "u29_l2"),
                PathNode("u29_n3", "Pilihan & Perintah", Color(0xFFFFC107), NodeIconType.CAP, isCompleted = false, lessonId = "u29_l3"),
                PathNode("u29_n4", "Etiket & Makna", Color(0xFFFFC107), NodeIconType.DUMBBELL, isCompleted = false, lessonId = "u29_l4"),
                PathNode("u29_n5", "Evaluasi Logika", Color(0xFFFFC107), NodeIconType.SHUFFLE, isCompleted = false, lessonId = "u29_l5"),
                PathNode("u29_n6", "Kuis Cerita Bab 29", Color(0xFFFFC107), NodeIconType.BOOK, isCompleted = false, lessonId = "u29_l1"),
                PathNode("u29_n7", "Checkpoint Peti", Color(0xFFFFB300), NodeIconType.CHEST, isCompleted = false, lessonId = "u29_l1"),
                PathNode("u29_n8", "Rest area", Color(0xFF03A9F4), NodeIconType.REST_AREA, isCompleted = false, lessonId = "u29_l1")
            ),
            lessons = listOf(
                Lesson(
                    id = "u29_l1",
                    title = "Hubungan Sebab-Akibat & Alasan",
                    subtitle = "Kosakata 因为, 所以, dan 为什么",
                    grammarNote = "Pola hubungan kausal: 因为 (yīnwèi - karena) ... 所以 (suǒyǐ - maka) ... Menanyakan sebab: 为什么 (wèishénme - mengapa/kenapa: 你为什么迟到？).",
                    newWords = listOf(
                        Word("w29_1", "因为", "yīnwèi", "Karena / sebab", "Konjungsi", "因为生病，所以他没来。", "Yīnwèi shēngbìng, suǒyǐ tā méi lái.", "Karena sakit, maka dia tidak masuk."),
                        Word("w29_2", "所以", "suǒyǐ", "Maka / oleh karena itu", "Konjungsi", "因为下雨，所以我们没出去。", "Yīnwèi xiàyǔ, suǒyǐ wǒmen méi chūqù.", "Karena hujan, maka kami tak keluar."),
                        Word("w29_3", "为什么", "wèishénme", "Mengapa / kenapa", "Kata Tanya", "你为什么来得这么晚？", "Nǐ wèishénme lái de zhème wǎn?", "Kenapa kamu datang begitu lambat?")
                    ),
                    exercises = bab29Stage1Part1Exercises,
                    exercisesPart1 = bab29Stage1Part1Exercises,
                    exercisesPart2 = bab29Stage1Part2Exercises
                ),
                Lesson(
                    id = "u29_l2",
                    title = "Hubungan Pertentangan & Transisi",
                    subtitle = "Kosakata 虽然, 但是, dan 但",
                    grammarNote = "Pola pertentangan konsesif: 虽然 (suīrán - walaupun) ... 但是/但 (dànshì/dàn - tetapi) ... (虽然汉语难，但是很快乐).",
                    newWords = listOf(
                        Word("w29_4", "虽然", "suīrán", "Meskipun / walaupun", "Konjungsi", "虽然汉语难，但是很快乐。", "Suīrán Hànyǔ nán, dànshì hěn kuàilè.", "Meskipun Mandarin sulit, tapi senang belajarnya."),
                        Word("w29_5", "但是", "dànshì", "Tetapi / namun", "Konjungsi", "衣服很美，但是太贵了。", "Yīfu hěn měi, dànshì tài guì le.", "Baju sangat indah, tapi terlalu mahal."),
                        Word("w29_6", "但", "dàn", "Tetapi (ringkas)", "Konjungsi", "我虽然累，但心里高兴。", "Wǒ suīrán lèi, dàn xīnlǐ gāoxìng.", "Saya walau lelah, tapi hati senang.")
                    ),
                    exercises = bab29Stage2Part1Exercises,
                    exercisesPart1 = bab29Stage2Part1Exercises,
                    exercisesPart2 = bab29Stage2Part2Exercises
                ),
                Lesson(
                    id = "u29_l3",
                    title = "Pilihan Alternatif & Kausatif",
                    subtitle = "Kosakata 还是, 让, dan 可能",
                    grammarNote = "Pilihan tanya: A 还是 (háishi - ataukah) B？ Pola kausatif: 让 (ràng - menyuruh/membuat orang berbuat sesuatu). Probabilitas: 可能 (kěnéng - barangkali).",
                    newWords = listOf(
                        Word("w29_7", "还是", "háishi", "Atau (tanya)", "Konjungsi", "你想喝咖啡还是喝茶？", "Nǐ xiǎng hē kāfēi háishi hē chá?", "Kamu mau minum kopi atau minum teh?"),
                        Word("w29_8", "让", "ràng", "Menyuruh / membiarkan", "Kata Kerja", "妈妈让我早点回家吃饭。", "Māma ràng wǒ zǎodiǎn huíjiā chīfàn.", "Ibu suruh saya lekas pulang makan."),
                        Word("w29_9", "可能", "kěnéng", "Mungkin / barangkali", "Keterangan", "明天下午可能会下雨。", "Míngtiān xiàwǔ kěnéng huì xiàyǔ.", "Besok sore mungkin turun hujan.")
                    ),
                    exercises = bab29Stage3Part1Exercises,
                    exercisesPart1 = bab29Stage3Part1Exercises,
                    exercisesPart2 = bab29Stage3Part2Exercises
                ),
                Lesson(
                    id = "u29_l4",
                    title = "Etiket Kesopanan & Makna",
                    subtitle = "Kosakata 记得, 介绍, 意思, dan 不好意思",
                    grammarNote = "Etiket kesopanan: 不好意思 (bùhǎoyìsi - permisi/sungkan: 不好意思打扰了). Memperkenalkan: 介绍 (jièshào). Pemaknaan: 意思 (yìsi). Ingatan: 记得 (jìde).",
                    newWords = listOf(
                        Word("w29_10", "记得", "jìde", "Ingat", "Kata Kerja", "你还记得他的名字吗？", "Nǐ hái jìde tā de míngzi ma?", "Kamu masih ingat namanya?"),
                        Word("w29_11", "介绍", "jièshào", "Memperkenalkan", "Kata Kerja", "我介绍一下，这是王经理。", "Wǒ jièshào yíxià, zhè shì Wáng jīnglǐ.", "Saya perkenalkan, ini Manajer Wang."),
                        Word("w29_12", "意思", "yìsi", "Makna / arti", "Benda", "这个汉字是什么意思？", "Zhège Hànzì shì shénme yìsi?", "Karakter Hanzi ini maknanya apa?"),
                        Word("w29_13", "不好意思", "bùhǎoyìsi", "Sungkan / permisi", "Ungkapan", "不好意思，打扰您一下。", "Bùhǎoyìsi, dǎrǎo nín yíxià.", "Permisi, mengganggu Anda sebentar.")
                    ),
                    exercises = bab29Stage4Part1Exercises,
                    exercisesPart1 = bab29Stage4Part1Exercises,
                    exercisesPart2 = bab29Stage4Part2Exercises
                ),
                Lesson(
                    id = "u29_l5",
                    title = "Evaluasi Komprehensif Logika & Etiket",
                    subtitle = "Review seluruh 16 kosakata konjungsi, kausatif & etiket",
                    grammarNote = "Evaluasi menyeluruh Bab 29: merangkai kalimat sebab-akibat, pertentangan, imperatif halus 别 (bié - jangan: 别忘了), partikel seruan 啊 (a), dan frasa 跟 (gēn - bersama).",
                    newWords = listOf(
                        Word("w29_14", "别", "bié", "Jangan", "Keterangan", "出门别忘穿衣服。", "Chūmén bié wàng chuān yīfu.", "Keluar rumah jangan lupa pakai baju."),
                        Word("w29_15", "啊", "a", "Partikel seru", "Partikel", "这里的风景真美丽啊！", "Zhèlǐ de fēngjǐng zhēn měilì a!", "Pemandangan di sini sungguh cantik ya!"),
                        Word("w29_16", "跟", "gēn", "Bersama / dengan", "Preposisi", "我想跟你一起去超市。", "Wǒ xiǎng gēn nǐ yìqǐ qù chāoshì.", "Saya mau pergi ke supermarket bersamamu."),
                        Word("w29_1", "因为", "yīnwèi", "Karena", "Konjungsi", "因为所以。", "Yīnwèi suǒyǐ.", "Karena dan maka.")
                    ),
                    exercises = bab29Stage5Part1Exercises,
                    exercisesPart1 = bab29Stage5Part1Exercises,
                    exercisesPart2 = bab29Stage5Part2Exercises
                )
            )
        ),

        // BAB 30: Grand Sintesis HSK 2: Angka Besar, Kalender & Evaluasi Akhir (统筹融会、大数历法与考评大成)
        UnitCourse(
            id = "unit_30",
            unitNumber = 30,
            title = "Grand Sintesis HSK 2",
            subtitle = "Puluhan ribu 万, mall, pekan 周, cuaca cerah/mendung, kali 次, orang sopan 位, duratif 着, dan kelulusan",
            bannerTitle = "Grand Sintesis Akhir HSK 2",
            emoji = "🏆",
            level = "Level 30 (HSK 2)",
            story = stories[29],
            nodes = listOf(
                PathNode("u30_n1", "Puluhan Ribu & Mall", Color(0xFFFFC107), NodeIconType.CAP, isCompleted = false, lessonId = "u30_l1"),
                PathNode("u30_n2", "Pekan & Cuaca Langit", Color(0xFFFFC107), NodeIconType.DUMBBELL, isCompleted = false, lessonId = "u30_l2"),
                PathNode("u30_n3", "Frekuensi & Tamu", Color(0xFFFFC107), NodeIconType.CAP, isCompleted = false, lessonId = "u30_l3"),
                PathNode("u30_n4", "Waktu & Duratif", Color(0xFFFFC107), NodeIconType.DUMBBELL, isCompleted = false, lessonId = "u30_l4"),
                PathNode("u30_n5", "Tuntas & Bersama", Color(0xFFFFC107), NodeIconType.CAP, isCompleted = false, lessonId = "u30_l5"),
                PathNode("u30_n6", "Grand Evaluasi Final", Color(0xFFFFC107), NodeIconType.SHUFFLE, isCompleted = false, lessonId = "u30_l6"),
                PathNode("u30_n7", "Kuis Cerita Final HSK 2", Color(0xFFFFC107), NodeIconType.BOOK, isCompleted = false, lessonId = "u30_l1"),
                PathNode("u30_n8", "Piala Tamat HSK 2", Color(0xFFFFB300), NodeIconType.CHEST, isCompleted = false, lessonId = "u30_l1"),
                PathNode("u30_n9", "Rest area", Color(0xFF03A9F4), NodeIconType.REST_AREA, isCompleted = false, lessonId = "u30_l1")
            ),
            lessons = listOf(
                Lesson(
                    id = "u30_l1",
                    title = "Bilangan Puluhan Ribu & Mall",
                    subtitle = "Kosakata 万 dan 商场",
                    grammarNote = "Sistem bilangan empat digit: 万 (wàn - 10.000: 一万, 两万). Tempat belanja: 商场 (shāngchǎng - mall: 去商场买东西).",
                    newWords = listOf(
                        Word("w30_1", "万", "wàn", "Sepuluh ribu (10.000)", "Angka", "这辆新车要一万块钱。", "Zhè liàng xīnchē yào yíwàn kuài qián.", "Mobil baru ini seharga sepuluh ribu yuan."),
                        Word("w30_2", "商场", "shāngchǎng", "Pusat perbelanjaan / mall", "Tempat", "周末很多人去大商场购物。", "Zhōumò hěn duō rén qù dà shāngchǎng gòuwù.", "Akhir pekan banyak orang ke mall.")
                    ),
                    exercises = bab30Stage1Part1Exercises,
                    exercisesPart1 = bab30Stage1Part1Exercises,
                    exercisesPart2 = bab30Stage1Part2Exercises
                ),
                Lesson(
                    id = "u30_l2",
                    title = "Satuan Pekan & Cuaca Langit",
                    subtitle = "Kosakata 周, 晴, dan 阴",
                    grammarNote = "Kalender: 周 (zhōu - pekan/minggu: 下周, 这周). Cuaca: 晴 (qíng - cerah), 阴 (yīn - mendung/berawan: 今天天阴).",
                    newWords = listOf(
                        Word("w30_3", "周", "zhōu", "Minggu / pekan", "Waktu", "下周我们有汉字比赛。", "Xiàzhōu wǒmen yǒu Hànzì bǐsài.", "Pekan depan kita ada lomba Hanzi."),
                        Word("w30_4", "晴", "qíng", "Cerah", "Cuaca", "今天是个晴天，太阳大。", "Jīntiān shì gè qíngtiān, tàiyáng dà.", "Hari ini cerah, matahari terik."),
                        Word("w30_5", "阴", "yīn", "Mendung / berawan", "Cuaca", "今天天阴，要下雨了。", "Jīntiān tiān yīn, yào xiàyǔ le.", "Hari ini mendung mau hujan.")
                    ),
                    exercises = bab30Stage2Part1Exercises,
                    exercisesPart1 = bab30Stage2Part1Exercises,
                    exercisesPart2 = bab30Stage2Part2Exercises
                ),
                Lesson(
                    id = "u30_l3",
                    title = "Frekuensi & Panggilan Tamu",
                    subtitle = "Kosakata 次 dan 位",
                    grammarNote = "Frekuensi peristiwa: 次 (cì - kali: 去过两次, 读了三次). Panggilan terhormat: 位 (wèi - orang terhormat: 两位老师, 三位客人).",
                    newWords = listOf(
                        Word("w30_6", "次", "cì", "Kali (frekuensi)", "Penggolong", "这本书我读了三次。", "Zhè běn shū wǒ dú le sān cì.", "Buku ini sudah saya baca tiga kali."),
                        Word("w30_7", "位", "wèi", "Orang (sopan)", "Penggolong", "门口来了两位朋友。", "Ménkǒu lái le liǎng wèi péngyou.", "Di pintu datang dua orang kawan.")
                    ),
                    exercises = bab30Stage3Part1Exercises,
                    exercisesPart1 = bab30Stage3Part1Exercises,
                    exercisesPart2 = bab30Stage3Part2Exercises
                ),
                Lesson(
                    id = "u30_l4",
                    title = "Waktu, Asal-Usul & Aspek Duratif",
                    subtitle = "Kosakata 就, 从, 时, dan 着",
                    grammarNote = "Asal & urutan: 从 (cóng - dari), 就 (jiù - langsung). Waktu: 时 (shí - saat: 吃饭时). Duratif status: 着 (zhe - dalam keadaan: 门开着).",
                    newWords = listOf(
                        Word("w30_8", "就", "jiù", "Langsung / maka", "Keterangan", "喝热茶头就不疼了。", "Hē rèchá tóu jiù bù téng le.", "Minum teh panas pusing langsung hilang."),
                        Word("w30_9", "从", "cóng", "Dari (asal)", "Preposisi", "从学校到我家十分钟。", "Cóng xuéxiào dào wǒjiā shí fēnzhōng.", "Dari sekolah ke rumah 10 menit."),
                        Word("w30_10", "时", "shí", "Saat / ketika", "Waktu", "吃饭时别大声说话。", "Chīfàn shí bié dàshēng shuōhuà.", "Saat makan jangan bersuara keras."),
                        Word("w30_11", "着", "zhe", "Partikel duratif", "Partikel", "门开着，请进。", "Mén kāi zhe, qǐng jìn.", "Pintu terbuka, silakan masuk.")
                    ),
                    exercises = bab30Stage4Part1Exercises,
                    exercisesPart1 = bab30Stage4Part1Exercises,
                    exercisesPart2 = bab30Stage4Part2Exercises
                ),
                Lesson(
                    id = "u30_l5",
                    title = "Ketuntasan & Kebersamaan",
                    subtitle = "Kosakata 完 dan 一起",
                    grammarNote = "Komplemen ketuntasan: 完 (wán - selesai/habis: 做完, 吃完, 学完). Kebersamaan: 一起 (yìqǐ - bersama-sama: 我们大家一起).",
                    newWords = listOf(
                        Word("w30_12", "完", "wán", "Selesai / habis", "Kata Kerja", "做完作业去踢球。", "Zuòwán zuòyè qù tīqiú.", "Selesai PR kita pergi main bola."),
                        Word("w30_13", "一起", "yìqǐ", "Bersama-sama", "Keterangan", "我们一起学汉语吧！", "Wǒmen yìqǐ xué Hànyǔ ba!", "Ayo kita belajar Mandarin bersama!")
                    ),
                    exercises = bab30Stage5Part1Exercises,
                    exercisesPart1 = bab30Stage5Part1Exercises,
                    exercisesPart2 = bab30Stage5Part2Exercises
                ),
                Lesson(
                    id = "u30_l6",
                    title = "Grand Evaluasi Final New HSK 2",
                    subtitle = "Sintesis menyeluruh 200 kosakata New HSK 2 dari Bab 17 hingga Bab 30",
                    grammarNote = "Ujian evaluasi puncak New HSK 2: memadukan seluruh struktur gramatika keluarga kerabat, warna busana, restoran makanan, posisi spasial, komplemen arah, transportasi kota, wisata liburan, kehidupan sekolah, olahraga bola, apotek sakit, hobi digital, pola komparasi, logika antarklausa, angka puluhan ribu, dan aspek duratif.",
                    newWords = listOf(
                        Word("w30_1", "万", "wàn", "10.000", "Angka", "学完了汉语。", "Xué wán le Hànyǔ.", "Tamat belajar bahasa Mandarin."),
                        Word("w30_4", "晴", "qíng", "Cerah", "Cuaca", "今天晴天去商场。", "Jīntiān qíngtiān qù shāngchǎng.", "Hari cerah ke mall."),
                        Word("w30_12", "完", "wán", "Selesai", "Kata Kerja", "大家都做完题了。", "Dàjiā dōu zuòwán tí le.", "Semua selesai mengerjakan soal."),
                        Word("w30_13", "一起", "yìqǐ", "Bersama", "Keterangan", "祝贺大家学习成功！", "Zhùhè dàjiā xuéxí chénggōng!", "Selamat atas sukses belajar!")
                    ),
                    exercises = bab30Stage6Part1Exercises,
                    exercisesPart1 = bab30Stage6Part1Exercises,
                    exercisesPart2 = bab30Stage6Part2Exercises
                )
            )
        )
    )
}
