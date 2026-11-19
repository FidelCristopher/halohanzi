package com.example.chineselearning.data.repository

import com.example.chineselearning.R
import com.example.chineselearning.data.model.Sentence
import com.example.chineselearning.data.model.Story
import com.example.chineselearning.data.model.StoryQuestion
import com.example.chineselearning.data.model.WordToken

val mandarinBeanStoriesPart17: List<Story> by lazy {
    listOf(
        // Cerita Mandarin Bean 186 (HSK 2): The difference between China and foreign countries (Perbedaan Tiongkok dan Luar Negeri)
        Story(
            id = "story_difference_china_foreign",
            titleHanzi = "中外的不同",
            titlePinyin = "Zhōngwài de Bùtóng",
            titleTranslation = "The Difference Between China and Foreign Countries (Perbedaan Tiongkok dan Luar Negeri)",
            level = "HSK 2",
            category = "Budaya & Bahasa",
            description = "Menjelaskan perbedaan mendasar antara kebiasaan Tiongkok dan negara Barat, terutama tata urutan nama serta penulisan tanggal.",
            coverEmoji = "🌏",
            coverImageRes = R.drawable.cover_story_difference_china_foreign,
            estimatedReadMinutes = 2,
            sentences = listOf(
                Sentence(
                    id = "s_diffcf_1",
                    hanzi = "中国的语言、文化和外国都有很大不同。",
                    pinyin = "Zhōng guó de yǔ yán wén huà hé wài guó dōu yǒu hěn dà bù tóng",
                    translation = "Bahasa dan kebudayaan Tiongkok memiliki perbedaan yang cukup besar jika dibandingkan dengan negara-negara asing.",
                    tokens = listOf(
                        WordToken("中国", "Zhōng guó", "China", "Kosakata HSK 2: 中国 (Zhōng guó)"),
                        WordToken("的", "de", "possessive particle (of; 's) / modifying particle", "Kosakata HSK 2: 的 (de)"),
                        WordToken("语言", "yǔ yán", "language", "Kosakata HSK 2: 语言 (yǔ yán)"),
                        WordToken("文化", "wén huà", "culture / civilization", "Kosakata HSK 2: 文化 (wén huà)"),
                        WordToken("和", "hé", "and / with / together with", "Kosakata HSK 2: 和 (hé)"),
                        WordToken("外国", "wài guó", "foreign country", "Kosakata HSK 2: 外国 (wài guó)"),
                        WordToken("都", "dōu", "all / both", "Kosakata HSK 2: 都 (dōu)"),
                        WordToken("有", "yǒu", "to have / there is", "Kosakata HSK 2: 有 (yǒu)"),
                        WordToken("很", "hěn", "very / quite", "Kosakata HSK 2: 很 (hěn)"),
                        WordToken("大", "dà", "big / huge / large", "Kosakata HSK 2: 大 (dà)"),
                        WordToken("不同", "bù tóng", "different / distinct / difference", "Kosakata HSK 2: 不同 (bù tóng)")
                    )
                ),
                Sentence(
                    id = "s_diffcf_2",
                    hanzi = "比如，名字，中国人的名字是姓在前面，名在后面；日期，中国人说日期，是年、月、日，从大到小，而不是日、月、年。",
                    pinyin = "bǐ rú míng zi Zhōng guó rén de míng zi shì xìng zài qián miàn míng zài hòu miàn rì qī Zhōng guó rén shuō rì qī shì nián yuè rì cóng dà dào xiǎo ér bù shì rì yuè nián",
                    translation = "Sebagai contoh, nama: nama orang Tionghoa marganya berada di depan dan nama kecilnya di belakang; untuk tanggal: penyebutan tanggal oleh orang Tiongkok berurutan mulai dari tahun, bulan, hingga hari (dari besar ke kecil), bukan hari, bulan, tahun.",
                    tokens = listOf(
                        WordToken("比如", "bǐ rú", "for example / for instance", "Kosakata HSK 2: 比如 (bǐ rú)"),
                        WordToken("名字", "míng zi", "name (of a person or thing)", "Kosakata HSK 2: 名字 (míng zi)"),
                        WordToken("中国人", "Zhōng guó rén", "Chinese person", "Kosakata HSK 2: 中国人 (Zhōng guó rén)"),
                        WordToken("的", "de", "possessive particle (of; 's)", "Kosakata HSK 2: 的 (de)"),
                        WordToken("名字", "míng zi", "name", "Kosakata HSK 2: 名字 (míng zi)"),
                        WordToken("是", "shì", "to be", "Kosakata HSK 2: 是 (shì)"),
                        WordToken("姓", "xìng", "family name / surname", "Kosakata HSK 2: 姓 (xìng)"),
                        WordToken("在", "zài", "at / in / located at", "Kosakata HSK 2: 在 (zài)"),
                        WordToken("前面", "qián miàn", "ahead / in front", "Kosakata HSK 2: 前面 (qián miàn)"),
                        WordToken("名", "míng", "given name / firstname", "Kosakata HSK 2: 名 (míng)"),
                        WordToken("在", "zài", "at / in", "Kosakata HSK 2: 在 (zài)"),
                        WordToken("后面", "hòu miàn", "rear / back / behind", "Kosakata HSK 2: 后面 (hòu miàn)"),
                        WordToken("日期", "rì qī", "date", "Kosakata HSK 2: 日期 (rì qī)"),
                        WordToken("中国人", "Zhōng guó rén", "Chinese person", "Kosakata HSK 2: 中国人 (Zhōng guó rén)"),
                        WordToken("说", "shuō", "to speak / to say", "Kosakata HSK 2: 说 (shuō)"),
                        WordToken("日期", "rì qī", "date", "Kosakata HSK 2: 日期 (rì qī)"),
                        WordToken("是", "shì", "to be", "Kosakata HSK 2: 是 (shì)"),
                        WordToken("年", "nián", "year", "Kosakata HSK 2: 年 (nián)"),
                        WordToken("月", "yuè", "month", "Kosakata HSK 2: 月 (yuè)"),
                        WordToken("日", "rì", "day / date", "Kosakata HSK 2: 日 (rì)"),
                        WordToken("从", "cóng", "from", "Kosakata HSK 2: 从 (cóng)"),
                        WordToken("大", "dà", "big / large", "Kosakata HSK 2: 大 (dà)"),
                        WordToken("到", "dào", "to / reaching", "Kosakata HSK 2: 到 (dào)"),
                        WordToken("小", "xiǎo", "small / little", "Kosakata HSK 2: 小 (xiǎo)"),
                        WordToken("而", "ér", "and / as well as / but (not)", "Kosakata HSK 2: 而 (ér)"),
                        WordToken("不是", "bù shì", "is not / not", "Kosakata HSK 2: 不是 (bù shì)"),
                        WordToken("日", "rì", "day", "Kosakata HSK 2: 日 (rì)"),
                        WordToken("月", "yuè", "month", "Kosakata HSK 2: 月 (yuè)"),
                        WordToken("年", "nián", "year", "Kosakata HSK 2: 年 (nián)")
                    )
                ),
                Sentence(
                    id = "s_diffcf_3",
                    hanzi = "这些都是小问题，但是也都很重要，大家要注意。",
                    pinyin = "zhè xiē dōu shì xiǎo wèn tí dàn shì yě dōu hěn zhòng yào dà jiā yào zhù yì",
                    translation = "Hal-hal tersebut mungkin tampak seperti hal-hal sepele, namun sesungguhnya sangat penting, sehingga kita semua harus memperhatikannya.",
                    tokens = listOf(
                        WordToken("这些", "zhè xiē", "these", "Kosakata HSK 2: 这些 (zhè xiē)"),
                        WordToken("都", "dōu", "all", "Kosakata HSK 2: 都 (dōu)"),
                        WordToken("是", "shì", "to be", "Kosakata HSK 2: 是 (shì)"),
                        WordToken("小", "xiǎo", "small / minor", "Kosakata HSK 2: 小 (xiǎo)"),
                        WordToken("问题", "wèn tí", "question / problem / issue", "Kosakata HSK 2: 问题 (wèn tí)"),
                        WordToken("但是", "dàn shì", "but / however", "Kosakata HSK 2: 但是 (dàn shì)"),
                        WordToken("也", "yě", "also", "Kosakata HSK 2: 也 (yě)"),
                        WordToken("都", "dōu", "all", "Kosakata HSK 2: 都 (dōu)"),
                        WordToken("很", "hěn", "very", "Kosakata HSK 2: 很 (hěn)"),
                        WordToken("重要", "zhòng yào", "important / significant", "Kosakata HSK 2: 重要 (zhòng yào)"),
                        WordToken("大家", "dà jiā", "everyone", "Kosakata HSK 2: 大家 (dà jiā)"),
                        WordToken("要", "yào", "need to / must", "Kosakata HSK 2: 要 (yào)"),
                        WordToken("注意", "zhù yì", "to pay attention to / to take note of", "Kosakata HSK 2: 注意 (zhù yì)")
                    )
                )
            ),
            questions = listOf(
                StoryQuestion(
                    id = "q_diffcf_1",
                    questionText = "中国人的名字结构与外国相比有什么明显不同？ (Apa perbedaan susunan nama orang Tionghoa dibanding nama di luar negeri?)",
                    options = listOf("只有名而完全没有姓氏 (Hanya memiliki nama panggilan tanpa marga)", "姓在前面，名在后面 (Marga/fam terletak di depan, nama kecil di belakang)", "全部倒着用拼音缩写 (Semua ditulis terbalik menggunakan singkatan pinyin)", "姓氏必须写在最中间 (Marga wajib diletakkan tepat di tengah-tengah)"),
                    correctAnswerIndex = 1,
                    explanation = "Dalam kebudayaan Tiongkok, nama keluarga/marga (姓) selalu diletakkan di depan sebelum nama diri (名)."
                ),
                StoryQuestion(
                    id = "q_diffcf_2",
                    questionText = "中国人习惯按照怎样的顺序来表达日期？ (Bagaimanakah urutan orang Tiongkok dalam menyebutkan tanggal?)",
                    options = listOf("日、月、年（从小到大） (Hari, bulan, tahun - dari unit terkecil ke terbesar)", "年、月、日（从大到小） (Tahun, bulan, hari - dari unit terbesar ke terkecil)", "月、日、年 (Bulan, hari, baru tahun)", "只说季节与星期几 (Hanya menyebut musim dan nama hari saja)"),
                    correctAnswerIndex = 1,
                    explanation = "Dalam bahasa Mandarin, penanggalan selalu diurutkan dari skala besar ke kecil: Tahun (年), Bulan (月), Hari (日)."
                ),
                StoryQuestion(
                    id = "q_diffcf_3",
                    questionText = "作者对姓名与日期表达上的中外差异持怎样的看法？ (Bagaimanakah pandangan penulis mengenai perbedaan tata nama dan tanggal ini?)",
                    options = listOf("完全是毫无意义的小事，不用理睬 (Sepenuhnya tidak berguna dan tak perlu dipedulikan)", "看似小问题，但其实非常重要，大家需多加注意 (Tampak seperti masalah sepele, namun sesungguhnya sangat penting dan harus diperhatikan)", "只要学会英文就足够在中文里通用 (Cukup paham aturan bahasa Inggris saja sudah bisa dipakai di mana-mana)", "年轻人应该抛弃这些传统规矩 (Kaum muda sebaiknya meninggalkan aturan tradisional tersebut)"),
                    correctAnswerIndex = 1,
                    explanation = "Teks menyatakan: '这些都是小问题，但是也都很重要，大家要注意' (Hal ini tampak sepele, namun sangat penting)."
                ),
                StoryQuestion(
                    id = "q_diffcf_4",
                    questionText = "下列哪项中文日期书写完全符合规范？ (Penulisan tanggal Mandarin manakah yang benar sesuai aturan teks?)",
                    options = listOf("15日10月2026年 (15 hari 10 bulan 2026 tahun)", "2026年10月15日 (Tahun 2026 bulan 10 hari 15)", "10月2026年15日 (Bulan 10 tahun 2026 hari 15)", "日15月10年2026 (Hari 15 bulan 10 tahun 2026)"),
                    correctAnswerIndex = 1,
                    explanation = "Sesuai pola 'dari besar ke kecil' (年、月、日), format yang benar adalah 2026年10月15日."
                )
            )
        ),

        // Cerita Mandarin Bean 187 (HSK 2): Winter travel, where to go? (Wisata Musim Dingin, Mau Pergi ke Mana?)
        Story(
            id = "story_winter_travel",
            titleHanzi = "冬天去哪玩儿",
            titlePinyin = "Dōngtiān Qù Nǎr Wánr",
            titleTranslation = "Winter Travel, Where to Go? (Wisata Musim Dingin, Mau Pergi ke Mana?)",
            level = "HSK 2",
            category = "Pariwisata & Liburan",
            description = "Rekomendasi destinasi liburan musim dingin di kota Harbin, menikmati keindahan salju, lampion es megah, dan pangsit lezat.",
            coverEmoji = "❄️",
            coverImageRes = R.drawable.cover_story_winter_travel,
            estimatedReadMinutes = 2,
            sentences = listOf(
                Sentence(
                    id = "s_wintrv_1",
                    hanzi = "中国的冬天，你知道去哪里玩儿更好吗？",
                    pinyin = "Zhōng guó de dōng tiān nǐ zhī dào qù nǎ lǐ wán r gèng hǎo ma",
                    translation = "Di musim dingin Tiongkok, tahukah kamu ke mana tempat yang paling seru untuk berlibur dan bersenang-senang?",
                    tokens = listOf(
                        WordToken("中国", "Zhōng guó", "China", "Kosakata HSK 2: 中国 (Zhōng guó)"),
                        WordToken("的", "de", "possessive particle (of; 's)", "Kosakata HSK 2: 的 (de)"),
                        WordToken("冬天", "dōng tiān", "winter", "Kosakata HSK 2: 冬天 (dōng tiān)"),
                        WordToken("你", "nǐ", "you", "Kosakata HSK 2: 你 (nǐ)"),
                        WordToken("知道", "zhī dào", "to know", "Kosakata HSK 2: 知道 (zhī dào)"),
                        WordToken("去", "qù", "to go", "Kosakata HSK 2: 去 (qù)"),
                        WordToken("哪里", "nǎ lǐ", "where", "Kosakata HSK 2: 哪里 (nǎ lǐ)"),
                        WordToken("玩儿", "wán r", "to play / to have fun", "Kosakata HSK 2: 玩儿 (wán r)"),
                        WordToken("更", "gèng", "more / even more", "Kosakata HSK 2: 更 (gèng)"),
                        WordToken("好", "hǎo", "good / nice", "Kosakata HSK 2: 好 (hǎo)"),
                        WordToken("吗", "ma", "question particle", "Kosakata HSK 2: 吗 (ma)")
                    )
                ),
                Sentence(
                    id = "s_wintrv_2",
                    hanzi = "哈尔滨是个很漂亮的城市，你可以看雪，看冰灯。",
                    pinyin = "Hā ěr bīn shì gè hěn piào liang de chéng shì nǐ kě yǐ kàn xuě kàn bīng dēng",
                    translation = "Harbin adalah sebuah kota yang sangat indah; kamu bisa melihat hamparan salju dan menikmati lentera es yang memukau.",
                    tokens = listOf(
                        WordToken("哈尔滨", "Hā ěr bīn", "Harbin (city in Heilongjiang)", "Kosakata HSK 2: 哈尔滨 (Hā ěr bīn)"),
                        WordToken("是", "shì", "to be", "Kosakata HSK 2: 是 (shì)"),
                        WordToken("个", "gè", "measure word", "Kosakata HSK 2: 个 (gè)"),
                        WordToken("很", "hěn", "very", "Kosakata HSK 2: 很 (hěn)"),
                        WordToken("漂亮", "piào liang", "pretty / beautiful", "Kosakata HSK 2: 漂亮 (piào liang)"),
                        WordToken("的", "de", "modifying particle", "Kosakata HSK 2: 的 (de)"),
                        WordToken("城市", "chéng shì", "city / town", "Kosakata HSK 2: 城市 (chéng shì)"),
                        WordToken("你", "nǐ", "you", "Kosakata HSK 2: 你 (nǐ)"),
                        WordToken("可以", "kě yǐ", "can / may", "Kosakata HSK 2: 可以 (kě yǐ)"),
                        WordToken("看", "kàn", "to look / to see", "Kosakata HSK 2: 看 (kàn)"),
                        WordToken("雪", "xuě", "snow", "Kosakata HSK 2: 雪 (xuě)"),
                        WordToken("看", "kàn", "to look / to see", "Kosakata HSK 2: 看 (kàn)"),
                        WordToken("冰灯", "bīng dēng", "ice lantern / ice sculpture", "Kosakata HSK 2: 冰灯 (bīng dēng)")
                    )
                ),
                Sentence(
                    id = "s_wintrv_3",
                    hanzi = "这个城市在中国的东北，非常冷。",
                    pinyin = "zhè gè chéng shì zài Zhōng guó de dōng běi fēi cháng lěng",
                    translation = "Kota ini terletak di wilayah timur laut Tiongkok, dan suhunya luar biasa dingin.",
                    tokens = listOf(
                        WordToken("这个", "zhè gè", "this", "Kosakata HSK 2: 这个 (zhè gè)"),
                        WordToken("城市", "chéng shì", "city", "Kosakata HSK 2: 城市 (chéng shì)"),
                        WordToken("在", "zài", "located in / at", "Kosakata HSK 2: 在 (zài)"),
                        WordToken("中国", "Zhōng guó", "China", "Kosakata HSK 2: 中国 (Zhōng guó)"),
                        WordToken("的", "de", "possessive particle", "Kosakata HSK 2: 的 (de)"),
                        WordToken("东北", "dōng běi", "northeast (Dongbei)", "Kosakata HSK 2: 东北 (dōng běi)"),
                        WordToken("非常", "fēi cháng", "very / extremely", "Kosakata HSK 2: 非常 (fēi cháng)"),
                        WordToken("冷", "lěng", "cold", "Kosakata HSK 2: 冷 (lěng)")
                    )
                ),
                Sentence(
                    id = "s_wintrv_4",
                    hanzi = "东北的食物也很好吃，大家都喜欢吃东北的饺子。",
                    pinyin = "Dōng běi de shí wù yě hěn hǎo chī dà jiā dōu xǐ huan chī Dōng běi de jiǎo zi",
                    translation = "Kuliner khas kawasan timur laut juga sangat sedap; semua orang sangat gemar menyantap jiaozi (pangsit) khas Dongbei.",
                    tokens = listOf(
                        WordToken("东北", "Dōng běi", "northeast (Dongbei)", "Kosakata HSK 2: 东北 (Dōng běi)"),
                        WordToken("的", "de", "possessive particle", "Kosakata HSK 2: 的 (de)"),
                        WordToken("食物", "shí wù", "food", "Kosakata HSK 2: 食物 (shí wù)"),
                        WordToken("也", "yě", "also", "Kosakata HSK 2: 也 (yě)"),
                        WordToken("很", "hěn", "very", "Kosakata HSK 2: 很 (hěn)"),
                        WordToken("好吃", "hǎo chī", "delicious / tasty", "Kosakata HSK 2: 好吃 (hǎo chī)"),
                        WordToken("大家", "dà jiā", "everyone", "Kosakata HSK 2: 大家 (dà jiā)"),
                        WordToken("都", "dōu", "all", "Kosakata HSK 2: 都 (dōu)"),
                        WordToken("喜欢", "xǐ huan", "to like / to love", "Kosakata HSK 2: 喜欢 (xǐ huan)"),
                        WordToken("吃", "chī", "to eat", "Kosakata HSK 2: 吃 (chī)"),
                        WordToken("东北", "Dōng běi", "northeast", "Kosakata HSK 2: 东北 (Dōng běi)"),
                        WordToken("的", "de", "possessive particle", "Kosakata HSK 2: 的 (de)"),
                        WordToken("饺子", "jiǎo zi", "dumpling / potsticker", "Kosakata HSK 2: 饺子 (jiǎo zi)")
                    )
                )
            ),
            questions = listOf(
                StoryQuestion(
                    id = "q_wintrv_1",
                    questionText = "文章推荐在中国的冬天去哪座城市旅游观光？ (Kota manakah di Tiongkok yang direkomendasikan untuk berlibur pada musim dingin?)",
                    options = listOf("三亚 (Sanya)", "哈尔滨 (Harbin)", "广州 (Guangzhou)", "海口 (Haikou)"),
                    correctAnswerIndex = 1,
                    explanation = "Teks merekomendasikan kota Harbin (哈尔滨) sebagai destinasi liburan musim dingin yang indah."
                ),
                StoryQuestion(
                    id = "q_wintrv_2",
                    questionText = "在哈尔滨旅游时，游客可以欣赏到哪些特别的冬日景观？ (Pemandangan khas musim dingin apa yang dapat dinikmati wisatawan di Harbin?)",
                    options = listOf("热带椰林和金色沙滩 (Hutan kelapa tropis dan pantai berpasir emas)", "皑皑白雪与梦幻冰灯 (Hamparan salju putih dan lentera es yang memukau)", "满山盛开的油菜花 (Bunga kanola mekar di seluruh perbukitan)", "沙漠骆驼商队 (Kafilah unta di padang pasir)"),
                    correctAnswerIndex = 1,
                    explanation = "Teks menyebutkan '你可以看雪，看冰灯' (kamu bisa melihat salju dan lentera es)."
                ),
                StoryQuestion(
                    id = "q_wintrv_3",
                    questionText = "哈尔滨位于中国的哪个地理方位？气候特点如何？ (Di manakah letak geografis Harbin di Tiongkok dan bagaimana iklimnya?)",
                    options = listOf("在温暖湿润的南部沿海 (Di pesisir selatan yang hangat dan lembap)", "在中国东北部，气候非常冷 (Di wilayah timur laut Tiongkok dan bersuhu sangat dingin)", "在西部大沙漠，气候炎热干燥 (Di gurun pasir barat yang terik dan kering)", "在西南高原，一年四季如春 (Di dataran tinggi barat daya bersuhu semi sepanjang tahun)"),
                    correctAnswerIndex = 1,
                    explanation = "Teks menjelaskan: '这个城市在中国的东北，非常冷' (Kota ini berada di timur laut Tiongkok, sangat dingin)."
                ),
                StoryQuestion(
                    id = "q_wintrv_4",
                    questionText = "文章中特别提到东北哪种让人喜爱的特色美食？ (Makanan khas Dongbei apakah yang disebutkan sangat digemari banyak orang?)",
                    options = listOf("广式早茶点心 (Dimsum sarapan ala Kanton)", "东北的饺子 (Pangsit / jiaozi khas Dongbei)", "四川麻婆豆腐 (Tahu mapo pedas Sichuan)", "云南过桥米线 (Bihun penyeberang jembatan Yunnan)"),
                    correctAnswerIndex = 1,
                    explanation = "Teks menyatakan: '大家都喜欢吃东北的饺子' (semua orang suka menyantap pangsit khas Dongbei)."
                )
            )
        ),

        // Cerita Mandarin Bean 188 (HSK 2): Great Cold (Dahan - Periode Dingin Puncak)
        Story(
            id = "story_great_cold",
            titleHanzi = "大寒",
            titlePinyin = "Dàhán",
            titleTranslation = "Great Cold (Dahan - Periode Dingin Ekstrem)",
            level = "HSK 2",
            category = "Budaya & Tradisi",
            description = "Mengenal 'Dahan', titik balik matahari ke-24 dalam penanggalan tradisional Tiongkok saat puncak musim dingin tiba dan persiapan menyambut Imlek dimulai.",
            coverEmoji = "⛄",
            coverImageRes = R.drawable.cover_story_great_cold,
            estimatedReadMinutes = 2,
            sentences = listOf(
                Sentence(
                    id = "s_grtcld_1",
                    hanzi = "1月20日，大寒。",
                    pinyin = "yuè rì Dà hán",
                    translation = "Tanggal 20 Januari adalah istilah matahari 'Dahan' (Dingin Ekstrem).",
                    tokens = listOf(
                        WordToken("月", "yuè", "month", "Kosakata HSK 2: 月 (yuè)"),
                        WordToken("日", "rì", "day / date", "Kosakata HSK 2: 日 (rì)"),
                        WordToken("大寒", "Dà hán", "Great Cold (24th solar term)", "Kosakata HSK 2: 大寒 (Dà hán)")
                    )
                ),
                Sentence(
                    id = "s_grtcld_2",
                    hanzi = "这是二十四节气中的最后一个节气。",
                    pinyin = "zhè shì èr shí sì jié qì zhōng de zuì hòu yī gè jié qì",
                    translation = "Ini merupakan istilah matahari yang paling terakhir di antara dua puluh empat siklus musim tradisional.",
                    tokens = listOf(
                        WordToken("这", "zhè", "this", "Kosakata HSK 2: 这 (zhè)"),
                        WordToken("是", "shì", "to be", "Kosakata HSK 2: 是 (shì)"),
                        WordToken("二十四", "èr shí sì", "twenty-four", "Kosakata HSK 2: 二十四 (èr shí sì)"),
                        WordToken("节气", "jié qì", "solar term (in traditional Chinese calendar)", "Kosakata HSK 2: 节气 (jié qì)"),
                        WordToken("中", "zhōng", "among / within", "Kosakata HSK 2: 中 (zhōng)"),
                        WordToken("的", "de", "possessive particle", "Kosakata HSK 2: 的 (de)"),
                        WordToken("最后", "zuì hòu", "final / last", "Kosakata HSK 2: 最后 (zuì hòu)"),
                        WordToken("一个", "yī gè", "one", "Kosakata HSK 2: 一个 (yī gè)"),
                        WordToken("节气", "jié qì", "solar term", "Kosakata HSK 2: 节气 (jié qì)")
                    )
                ),
                Sentence(
                    id = "s_grtcld_3",
                    hanzi = "这个时候，天气多是雨雪、低温、大风。",
                    pinyin = "zhè gè shí hou tiān qì duō shì yǔ xuě dī wēn dà fēng",
                    translation = "Pada masa-masa ini, kondisi cuaca kerap dipenuhi hujan salju, suhu yang membeku, serta terpaan angin kencang.",
                    tokens = listOf(
                        WordToken("这个", "zhè gè", "this", "Kosakata HSK 2: 这个 (zhè gè)"),
                        WordToken("时候", "shí hou", "time / period", "Kosakata HSK 2: 时候 (shí hou)"),
                        WordToken("天气", "tiān qì", "weather", "Kosakata HSK 2: 天气 (tiān qì)"),
                        WordToken("多", "duō", "mostly / frequently", "Kosakata HSK 2: 多 (duō)"),
                        WordToken("是", "shì", "to be", "Kosakata HSK 2: 是 (shì)"),
                        WordToken("雨雪", "yǔ xuě", "rain and snow", "Kosakata HSK 2: 雨雪 (yǔ xuě)"),
                        WordToken("低温", "dī wēn", "low temperature", "Kosakata HSK 2: 低温 (dī wēn)"),
                        WordToken("大风", "dà fēng", "strong wind / gale", "Kosakata HSK 2: 大风 (dà fēng)")
                    )
                ),
                Sentence(
                    id = "s_grtcld_4",
                    hanzi = "我们要少吃生冷的东西，多吃羊肉、牛肉等。",
                    pinyin = "wǒ men yào shǎo chī shēng lěng de dōng xi duō chī yáng ròu niú ròu děng",
                    translation = "Kita disarankan untuk mengurangi konsumsi makanan mentah dan dingin, serta memperbanyak makan daging kambing, daging sapi, dan sejenisnya.",
                    tokens = listOf(
                        WordToken("我们", "wǒ men", "we / us", "Kosakata HSK 2: 我们 (wǒ men)"),
                        WordToken("要", "yào", "should / must", "Kosakata HSK 2: 要 (yào)"),
                        WordToken("少", "shǎo", "less / reduce", "Kosakata HSK 2: 少 (shǎo)"),
                        WordToken("吃", "chī", "to eat", "Kosakata HSK 2: 吃 (chī)"),
                        WordToken("生冷", "shēng lěng", "raw and cold (food)", "Kosakata HSK 2: 生冷 (shēng lěng)"),
                        WordToken("的", "de", "modifying particle", "Kosakata HSK 2: 的 (de)"),
                        WordToken("东西", "dōng xi", "thing / items / food", "Kosakata HSK 2: 东西 (dōng xi)"),
                        WordToken("多", "duō", "more / increase", "Kosakata HSK 2: 多 (duō)"),
                        WordToken("吃", "chī", "to eat", "Kosakata HSK 2: 吃 (chī)"),
                        WordToken("羊肉", "yáng ròu", "mutton / lamb", "Kosakata HSK 2: 羊肉 (yáng ròu)"),
                        WordToken("牛肉", "niú ròu", "beef", "Kosakata HSK 2: 牛肉 (niú ròu)"),
                        WordToken("等", "děng", "etc. / and so on", "Kosakata HSK 2: 等 (děng)")
                    )
                ),
                Sentence(
                    id = "s_grtcld_5",
                    hanzi = "“小寒大寒，杀猪过年”，因为下一个节气就是立春了。在中国，特别是农村，每到大寒节气，人们就开始忙着准备过年的东西了。",
                    pinyin = "Xiǎo hán Dà hán shā zhū guò nián yīn wèi xià yī gè jié qì jiù shì Lì chūn le zài Zhōng guó tè bié shì nóng cūn měi dào Dà hán jié qì rén men jiù kāi shǐ máng zhe zhǔn bèi guò nián de dōng xi le",
                    translation = "Pepatah mengatakan 'Saat Xiaohan dan Dahan tiba, potonglah babi untuk menyambut tahun baru', sebab musim berikutnya adalah Lichun (Awal Musim Semi). Di Tiongkok, khususnya di daerah pedesaan, setiap kali Dahan tiba, warga sudah mulai sibuk menyiapkan berbagai perlengkapan tahun baru.",
                    tokens = listOf(
                        WordToken("小寒", "Xiǎo hán", "Minor Cold (23rd solar term)", "Kosakata HSK 2: 小寒 (Xiǎo hán)"),
                        WordToken("大寒", "Dà hán", "Great Cold (24th solar term)", "Kosakata HSK 2: 大寒 (Dà hán)"),
                        WordToken("杀", "shā", "to kill / to slaughter", "Kosakata HSK 2: 杀 (shā)"),
                        WordToken("猪", "zhū", "pig / swine", "Kosakata HSK 2: 猪 (zhū)"),
                        WordToken("过年", "guò nián", "to celebrate Chinese New Year", "Kosakata HSK 2: 过年 (guò nián)"),
                        WordToken("因为", "yīn wèi", "because / since", "Kosakata HSK 2: 因为 (yīn wèi)"),
                        WordToken("下", "xià", "next", "Kosakata HSK 2: 下 (xià)"),
                        WordToken("一个", "yī gè", "one", "Kosakata HSK 2: 一个 (yī gè)"),
                        WordToken("节气", "jié qì", "solar term", "Kosakata HSK 2: 节气 (jié qì)"),
                        WordToken("就", "jiù", "then / already", "Kosakata HSK 2: 就 (jiù)"),
                        WordToken("是", "shì", "to be", "Kosakata HSK 2: 是 (shì)"),
                        WordToken("立春", "Lì chūn", "Beginning of Spring (1st solar term)", "Kosakata HSK 2: 立春 (Lì chūn)"),
                        WordToken("了", "le", "modal particle", "Kosakata HSK 2: 了 (le)"),
                        WordToken("在", "zài", "in / at", "Kosakata HSK 2: 在 (zài)"),
                        WordToken("中国", "Zhōng guó", "China", "Kosakata HSK 2: 中国 (Zhōng guó)"),
                        WordToken("特别", "tè bié", "especially / particularly", "Kosakata HSK 2: 特别 (tè bié)"),
                        WordToken("是", "shì", "to be", "Kosakata HSK 2: 是 (shì)"),
                        WordToken("农村", "nóng cūn", "rural area / village / countryside", "Kosakata HSK 2: 农村 (nóng cūn)"),
                        WordToken("每", "měi", "each / every", "Kosakata HSK 2: 每 (měi)"),
                        WordToken("到", "dào", "to arrive / upon reaching", "Kosakata HSK 2: 到 (dào)"),
                        WordToken("大寒", "Dà hán", "Great Cold", "Kosakata HSK 2: 大寒 (Dà hán)"),
                        WordToken("节气", "jié qì", "solar term", "Kosakata HSK 2: 节气 (jié qì)"),
                        WordToken("人们", "rén men", "people", "Kosakata HSK 2: 人们 (rén men)"),
                        WordToken("就", "jiù", "then", "Kosakata HSK 2: 就 (jiù)"),
                        WordToken("开始", "kāi shǐ", "to begin / to start", "Kosakata HSK 2: 开始 (kāi shǐ)"),
                        WordToken("忙", "máng", "busy", "Kosakata HSK 2: 忙 (máng)"),
                        WordToken("着", "zhe", "aspect particle", "Kosakata HSK 2: 着 (zhe)"),
                        WordToken("准备", "zhǔn bèi", "to prepare", "Kosakata HSK 2: 准备 (zhǔn bèi)"),
                        WordToken("过年", "guò nián", "to celebrate New Year", "Kosakata HSK 2: 过年 (guò nián)"),
                        WordToken("的", "de", "possessive particle", "Kosakata HSK 2: 的 (de)"),
                        WordToken("东西", "dōng xi", "supplies / goods", "Kosakata HSK 2: 东西 (dōng xi)"),
                        WordToken("了", "le", "modal particle", "Kosakata HSK 2: 了 (le)")
                    )
                ),
                Sentence(
                    id = "s_grtcld_6",
                    hanzi = "大寒以后，新一年的节气将开始。",
                    pinyin = "Dà hán yǐ hòu xīn yī nián de jié qì jiāng kāi shǐ",
                    translation = "Setelah masa Dahan berlalu, siklus istilah matahari untuk tahun yang baru pun akan segera bergulir kembali.",
                    tokens = listOf(
                        WordToken("大寒", "Dà hán", "Great Cold", "Kosakata HSK 2: 大寒 (Dà hán)"),
                        WordToken("以后", "yǐ hòu", "afterwards / after", "Kosakata HSK 2: 以后 (yǐ hòu)"),
                        WordToken("新", "xīn", "new", "Kosakata HSK 2: 新 (xīn)"),
                        WordToken("一年", "yī nián", "one year", "Kosakata HSK 2: 一年 (yī nián)"),
                        WordToken("的", "de", "possessive particle", "Kosakata HSK 2: 的 (de)"),
                        WordToken("节气", "jié qì", "solar terms", "Kosakata HSK 2: 节气 (jié qì)"),
                        WordToken("将", "jiāng", "will / shall / about to", "Kosakata HSK 2: 将 (jiāng)"),
                        WordToken("开始", "kāi shǐ", "to start / to begin", "Kosakata HSK 2: 开始 (kāi shǐ)")
                    )
                )
            ),
            questions = listOf(
                StoryQuestion(
                    id = "q_grtcld_1",
                    questionText = "“大寒”在中国传统的二十四节气中占据怎样的位置？ (Di manakah posisi 'Dahan' dalam sistem 24 istilah matahari tradisional Tiongkok?)",
                    options = listOf("第一个节气 (Istilah matahari paling pertama)", "最后一个节气（第二十四个） (Istilah matahari paling terakhir - ke-24)", "正好处于盛夏的第十二个 (Tepat di tengah musim panas - ke-12)", "秋季的开始 (Awal penanda musim gugur)"),
                    correctAnswerIndex = 1,
                    explanation = "Teks menyatakan: '这是二十四节气中的最后一个节气' (Ini adalah istilah matahari terakhir dalam siklus 24 musim)."
                ),
                StoryQuestion(
                    id = "q_grtcld_2",
                    questionText = "大寒节气来临时，天气通常呈现怎样的特征？ (Bagaimana karakteristik cuaca saat periode Dahan tiba?)",
                    options = listOf("艳阳高照且雷雨阵阵 (Panas terik disertai kilat petir bertubi-tubi)", "多雨雪、低温与强劲大风 (Kerap dilanda salju basah, suhu sangat rendah, dan angin kencang)", "温暖如春且百花盛开 (Hangat semerbak dengan bunga-bunga bermekaran)", "空气干燥极度炎热 (Udara kering dan luar biasa panas)"),
                    correctAnswerIndex = 1,
                    explanation = "Teks menjelaskan cuaca pada masa ini: '多是雨雪、低温、大风'."
                ),
                StoryQuestion(
                    id = "q_grtcld_3",
                    questionText = "为了御寒保暖，文中间接建议人们在大寒时节多吃什么？ (Makanan apa yang dianjurkan untuk dikonsumsi lebih banyak pada musim Dahan?)",
                    options = listOf("冰镇汽水和冷饮 (Minuman soda dingin dan es sirup)", "羊肉和牛肉等热性温补食物 (Daging kambing dan daging sapi yang menghangatkan tubuh)", "大量生食蔬菜水果 (Banyak mengonsumsi sayuran mentah dingin)", "各种油炸苦瓜 (Aneka gorengan pare pahit)"),
                    correctAnswerIndex = 1,
                    explanation = "Teks menyarankan: '少吃生冷的东西，多吃羊肉、牛肉等'."
                ),
                StoryQuestion(
                    id = "q_grtcld_4",
                    questionText = "中国民间俗语“小寒大寒，杀猪过年”反映了人们在大寒期间做些什么？ (Pepatah 'Xiaohan Dahan, potong babi sambut tahun baru' mencerminkan tradisi masyarakat apa?)",
                    options = listOf("准备去南极探险 (Persiapan pergi berpetualang ke Antartika)", "特别是农村，人们忙着置办年货准备欢度春节 (Khususnya di pedesaan, warga mulai sibuk menyiapkan kebutuhan menyambut hari raya Imlek)", "停止所有农耕并闭门冬眠 (Menghentikan semua kegiatan dan tidur hibernasi)", "搬迁去海边避寒 (Pindah rumah ke pantai untuk menghindari hawa dingin)"),
                    correctAnswerIndex = 1,
                    explanation = "Karena setelah Dahan akan segera tiba Lichun dan Imlek, warga pedesaan mulai sibuk mempersiapkan perayaan tahun baru."
                )
            )
        ),

        // Cerita Mandarin Bean 189 (HSK 2): Pills to Make You Clever (Obat Pintar)
        Story(
            id = "story_clever_pill",
            titleHanzi = "聪明药",
            titlePinyin = "Cōngmíng Yào",
            titleTranslation = "Pills to Make You Clever (Obat Pintar)",
            level = "HSK 2",
            category = "Cerita Lucu & Hiburan",
            description = "Kisah humor tentang seorang pasien yang ingin membeli obat pintar, dan respons jenaka dokter saat sang pasien mulai menyadari kepintarannya.",
            coverEmoji = "💊",
            coverImageRes = R.drawable.cover_story_clever_pill,
            estimatedReadMinutes = 2,
            sentences = listOf(
                Sentence(
                    id = "s_clvrpl_1",
                    hanzi = "有个病人问医生：“医生，有让人变聪明的药吗？”医生开了一些药，叫他下个星期再来。",
                    pinyin = "yǒu gè bìng rén wèn yī shēng yī shēng yǒu ràng rén biàn cōng míng de yào ma yī shēng kāi le yī xiē yào jiào tā xià gè xīng qī zài lái",
                    translation = "Ada seorang pasien bertanya kepada dokter: 'Dokter, adakah obat yang bisa membuat orang menjadi pintar?' Dokter pun meresepkan sejumlah obat dan menyuruhnya datang kembali minggu depan.",
                    tokens = listOf(
                        WordToken("有", "yǒu", "there is / to have", "Kosakata HSK 2: 有 (yǒu)"),
                        WordToken("个", "gè", "measure word", "Kosakata HSK 2: 个 (gè)"),
                        WordToken("病人", "bìng rén", "patient / sick person", "Kosakata HSK 2: 病人 (bìng rén)"),
                        WordToken("问", "wèn", "to ask", "Kosakata HSK 2: 问 (wèn)"),
                        WordToken("医生", "yī shēng", "doctor", "Kosakata HSK 2: 医生 (yī shēng)"),
                        WordToken("医生", "yī shēng", "doctor", "Kosakata HSK 2: 医生 (yī shēng)"),
                        WordToken("有", "yǒu", "is there / to have", "Kosakata HSK 2: 有 (yǒu)"),
                        WordToken("让", "ràng", "to make / to let", "Kosakata HSK 2: 让 (ràng)"),
                        WordToken("人", "rén", "person / people", "Kosakata HSK 2: 人 (rén)"),
                        WordToken("变", "biàn", "to become / to turn into", "Kosakata HSK 2: 变 (biàn)"),
                        WordToken("聪明", "cōng míng", "clever / smart / intelligent", "Kosakata HSK 2: 聪明 (cōng míng)"),
                        WordToken("的", "de", "modifying particle", "Kosakata HSK 2: 的 (de)"),
                        WordToken("药", "yào", "medicine / pill", "Kosakata HSK 2: 药 (yào)"),
                        WordToken("吗", "ma", "question particle", "Kosakata HSK 2: 吗 (ma)"),
                        WordToken("医生", "yī shēng", "doctor", "Kosakata HSK 2: 医生 (yī shēng)"),
                        WordToken("开", "kāi", "to prescribe (medicine)", "Kosakata HSK 2: 开 (kāi)"),
                        WordToken("了", "le", "aspect particle", "Kosakata HSK 2: 了 (le)"),
                        WordToken("一些", "yī xiē", "some / a few", "Kosakata HSK 2: 一些 (yī xiē)"),
                        WordToken("药", "yào", "medicine", "Kosakata HSK 2: 药 (yào)"),
                        WordToken("叫", "jiào", "to tell / to order", "Kosakata HSK 2: 叫 (jiào)"),
                        WordToken("他", "tā", "him", "Kosakata HSK 2: 他 (tā)"),
                        WordToken("下个星期", "xià gè xīng qī", "next week", "Kosakata HSK 2: 下个星期 (xià gè xīng qī)"),
                        WordToken("再", "zài", "again / once more", "Kosakata HSK 2: 再 (zài)"),
                        WordToken("来", "lái", "to come", "Kosakata HSK 2: 来 (lái)")
                    )
                ),
                Sentence(
                    id = "s_clvrpl_2",
                    hanzi = "一星期后，他问医生：“我觉得没有变聪明啊。”",
                    pinyin = "yī xīng qī hòu tā wèn yī shēng wǒ jué de méi yǒu biàn cōng míng a",
                    translation = "Satu minggu kemudian, ia kembali dan bertanya kepada dokter: 'Saya merasa tidak bertambah pintar sama sekali lho.'",
                    tokens = listOf(
                        WordToken("一星期", "yī xīng qī", "one week", "Kosakata HSK 2: 一星期 (yī xīng qī)"),
                        WordToken("后", "hòu", "after / later", "Kosakata HSK 2: 后 (hòu)"),
                        WordToken("他", "tā", "he", "Kosakata HSK 2: 他 (tā)"),
                        WordToken("问", "wèn", "to ask", "Kosakata HSK 2: 问 (wèn)"),
                        WordToken("医生", "yī shēng", "doctor", "Kosakata HSK 2: 医生 (yī shēng)"),
                        WordToken("我", "wǒ", "I", "Kosakata HSK 2: 我 (wǒ)"),
                        WordToken("觉得", "jué de", "to feel / to think", "Kosakata HSK 2: 觉得 (jué de)"),
                        WordToken("没有", "méi yǒu", "did not / have not", "Kosakata HSK 2: 没有 (méi yǒu)"),
                        WordToken("变", "biàn", "to become", "Kosakata HSK 2: 变 (biàn)"),
                        WordToken("聪明", "cōng míng", "smart", "Kosakata HSK 2: 聪明 (cōng míng)"),
                        WordToken("啊", "a", "modal particle", "Kosakata HSK 2: 啊 (a)")
                    )
                ),
                Sentence(
                    id = "s_clvrpl_3",
                    hanzi = "医生说：“不会的，你再吃一个星期的药吧。”病人有些不信，但还是听了医生的话。",
                    pinyin = "yī shēng shuō bù huì de nǐ zài chī yī gè xīng qī de yào ba bìng rén yǒu xiē bù xìn dàn hái shì tīng le yī shēng de huà",
                    translation = "Dokter menjawab: 'Tidak mungkin begitu, coba minumlah obat ini selama satu minggu lagi.' Pasien merasa agak ragu, tetapi ia tetap menuruti petunjuk dokter.",
                    tokens = listOf(
                        WordToken("医生", "yī shēng", "doctor", "Kosakata HSK 2: 医生 (yī shēng)"),
                        WordToken("说", "shuō", "to say", "Kosakata HSK 2: 说 (shuō)"),
                        WordToken("不会的", "bù huì de", "impossible / won't be", "Kosakata HSK 2: 不会的 (bù huì de)"),
                        WordToken("你", "nǐ", "you", "Kosakata HSK 2: 你 (nǐ)"),
                        WordToken("再", "zài", "again / more", "Kosakata HSK 2: 再 (zài)"),
                        WordToken("吃", "chī", "to take (medicine) / to eat", "Kosakata HSK 2: 吃 (chī)"),
                        WordToken("一个星期", "yī gè xīng qī", "one week", "Kosakata HSK 2: 一个星期 (yī gè xīng qī)"),
                        WordToken("的", "de", "particle", "Kosakata HSK 2: 的 (de)"),
                        WordToken("药", "yào", "medicine", "Kosakata HSK 2: 药 (yào)"),
                        WordToken("吧", "ba", "suggestion particle", "Kosakata HSK 2: 吧 (ba)"),
                        WordToken("病人", "bìng rén", "patient", "Kosakata HSK 2: 病人 (bìng rén)"),
                        WordToken("有些", "yǒu xiē", "somewhat / a little", "Kosakata HSK 2: 有些 (yǒu xiē)"),
                        WordToken("不信", "bù xìn", "disbelieve / doubtful", "Kosakata HSK 2: 不信 (bù xìn)"),
                        WordToken("但", "dàn", "but", "Kosakata HSK 2: 但 (dàn)"),
                        WordToken("还是", "hái shì", "still / nevertheless", "Kosakata HSK 2: 还是 (hái shì)"),
                        WordToken("听", "tīng", "to listen / to heed", "Kosakata HSK 2: 听 (tīng)"),
                        WordToken("了", "le", "aspect particle", "Kosakata HSK 2: 了 (le)"),
                        WordToken("医生", "yī shēng", "doctor", "Kosakata HSK 2: 医生 (yī shēng)"),
                        WordToken("的", "de", "possessive particle", "Kosakata HSK 2: 的 (de)"),
                        WordToken("话", "huà", "words / advice", "Kosakata HSK 2: 话 (huà)")
                    )
                ),
                Sentence(
                    id = "s_clvrpl_4",
                    hanzi = "第二个星期后，病人又来到医院问医生：“我怎么还没觉得比以前聪明啊。医生，是不是没有聪明药呢？”",
                    pinyin = "dì èr gè xīng qī hòu bìng rén yòu lái dào yī yuàn wèn yī shēng wǒ zěn me hái méi jué de bǐ yǐ qián cōng míng a yī shēng shì bù shì méi yǒu cōng míng yào ne",
                    translation = "Setelah minggu kedua berakhir, pasien kembali datang ke rumah sakit dan bertanya kepada dokter: 'Kenapa saya masih belum merasa lebih pintar dibanding sebelumnya ya? Dokter, mungkinkah sebenarnya memang tidak ada yang namanya obat pintar?'",
                    tokens = listOf(
                        WordToken("第二个星期", "dì èr gè xīng qī", "the second week", "Kosakata HSK 2: 第二个星期 (dì èr gè xīng qī)"),
                        WordToken("后", "hòu", "after", "Kosakata HSK 2: 后 (hòu)"),
                        WordToken("病人", "bìng rén", "patient", "Kosakata HSK 2: 病人 (bìng rén)"),
                        WordToken("又", "yòu", "again", "Kosakata HSK 2: 又 (yòu)"),
                        WordToken("来到", "lái dào", "to come to / to arrive at", "Kosakata HSK 2: 来到 (lái dào)"),
                        WordToken("医院", "yī yuàn", "hospital", "Kosakata HSK 2: 医院 (yī yuàn)"),
                        WordToken("问", "wèn", "to ask", "Kosakata HSK 2: 问 (wèn)"),
                        WordToken("医生", "yī shēng", "doctor", "Kosakata HSK 2: 医生 (yī shēng)"),
                        WordToken("我", "wǒ", "I", "Kosakata HSK 2: 我 (wǒ)"),
                        WordToken("怎么", "zěn me", "how come / why", "Kosakata HSK 2: 怎么 (zěn me)"),
                        WordToken("还", "hái", "still / yet", "Kosakata HSK 2: 还 (hái)"),
                        WordToken("没", "méi", "not yet", "Kosakata HSK 2: 没 (méi)"),
                        WordToken("觉得", "jué de", "to feel / to perceive", "Kosakata HSK 2: 觉得 (jué de)"),
                        WordToken("比", "bǐ", "compared to", "Kosakata HSK 2: 比 (bǐ)"),
                        WordToken("以前", "yǐ qián", "previously / before", "Kosakata HSK 2: 以前 (yǐ qián)"),
                        WordToken("聪明", "cōng míng", "smart / clever", "Kosakata HSK 2: 聪明 (cōng míng)"),
                        WordToken("啊", "a", "modal particle", "Kosakata HSK 2: 啊 (a)"),
                        WordToken("医生", "yī shēng", "doctor", "Kosakata HSK 2: 医生 (yī shēng)"),
                        WordToken("是不是", "shì bù shì", "is it or not / could it be that", "Kosakata HSK 2: 是不是 (shì bù shì)"),
                        WordToken("没有", "méi yǒu", "there is no", "Kosakata HSK 2: 没有 (méi yǒu)"),
                        WordToken("聪明药", "cōng míng yào", "smart pills / clever medicine", "Kosakata HSK 2: 聪明药 (cōng míng yào)"),
                        WordToken("呢", "ne", "question particle", "Kosakata HSK 2: 呢 (ne)")
                    )
                ),
                Sentence(
                    id = "s_clvrpl_5",
                    hanzi = "医生回答：“不对，我觉得你现在比以前聪明多了。”",
                    pinyin = "yī shēng huí dá bù duì wǒ jué de nǐ xiàn zài bǐ yǐ qián cōng míng duō le",
                    translation = "Dokter pun tersenyum menjawab: 'Tidak benar begitu; menurut saya sekarang kamu sudah jauh lebih pintar daripada sebelumnya!'",
                    tokens = listOf(
                        WordToken("医生", "yī shēng", "doctor", "Kosakata HSK 2: 医生 (yī shēng)"),
                        WordToken("回答", "huí dá", "to reply / to answer", "Kosakata HSK 2: 回答 (huí dá)"),
                        WordToken("不对", "bù duì", "incorrect / not right", "Kosakata HSK 2: 不对 (bù duì)"),
                        WordToken("我", "wǒ", "I", "Kosakata HSK 2: 我 (wǒ)"),
                        WordToken("觉得", "jué de", "to feel / to think", "Kosakata HSK 2: 觉得 (jué de)"),
                        WordToken("你", "nǐ", "you", "Kosakata HSK 2: 你 (nǐ)"),
                        WordToken("现在", "xiàn zài", "now", "Kosakata HSK 2: 现在 (xiàn zài)"),
                        WordToken("比", "bǐ", "compared to", "Kosakata HSK 2: 比 (bǐ)"),
                        WordToken("以前", "yǐ qián", "before", "Kosakata HSK 2: 以前 (yǐ qián)"),
                        WordToken("聪明", "cōng míng", "smart", "Kosakata HSK 2: 聪明 (cōng míng)"),
                        WordToken("多了", "duō le", "much more", "Kosakata HSK 2: 多了 (duō le)")
                    )
                )
            ),
            questions = listOf(
                StoryQuestion(
                    id = "q_clvrpl_1",
                    questionText = "故事一开始，病人来到医院向医生提出了怎样的奇特要求？ (Pada awal cerita, permintaan aneh apa yang diajukan pasien kepada dokter?)",
                    options = listOf("想做全面的视力检查 (Ingin tes kesehatan mata lengkap)", "询问有没有能让人变聪明的药 (Menanyakan apakah ada obat yang bisa membuat orang jadi pintar)", "要求开具安眠药治疗失眠 (Meminta resep obat tidur untuk mengobati insomnia)", "想找医生学习如何针灸 (Ingin belajar teknik akupunktur dari dokter)"),
                    correctAnswerIndex = 1,
                    explanation = "Pasien bertanya: '医生，有让人变聪明的药吗？' (Dokter, adakah obat yang membuat orang jadi pintar?)."
                ),
                StoryQuestion(
                    id = "q_clvrpl_2",
                    questionText = "吃了一周的药之后，病人向医生反馈了怎样的自身感觉？ (Setelah minum obat selama seminggu, apa keluhan yang disampaikan pasien?)",
                    options = listOf("觉得脑子飞快转动过目不忘 (Merasa otaknya berputar cepat dan daya ingatnya luar biasa)", "觉得自己的智力根本没有任何变化，没变聪明 (Merasa kecerdasannya tidak bertambah dan tidak merasa pintar)", "身体非常健康并且跑得更快 (Tubuhnya sangat sehat dan larinya lebih cepat)", "记性彻底退化把药全忘光了 (Daya ingatnya menurun drastis sampai lupa obatnya)"),
                    correctAnswerIndex = 1,
                    explanation = "Pasien mengatakan: '我觉得没有变聪明啊' (Saya merasa tidak bertambah pintar)."
                ),
                StoryQuestion(
                    id = "q_clvrpl_3",
                    questionText = "到了第二个星期复诊时，病人终于察觉并提出了什么疑问？ (Saat kontrol di minggu kedua, keraguan apa yang akhirnya disadari dan ditanyakan pasien?)",
                    options = listOf("药片为什么换成了粉红色 (Kenapa warna tablet obatnya berubah menjadi merah muda)", "是不是这世界上根本就没有所谓的“聪明药” (Mungkinkah di dunia ini sebenarnya memang tidak ada obat pintar)", "医生给的药是不是过期了 (Apakah obat yang diberikan dokter sudah kedaluwarsa)", "下周是否需要加倍剂量服用 (Apakah dosis obat minggu depan harus digandakan)"),
                    correctAnswerIndex = 1,
                    explanation = "Pasien bertanya dengan kritis: '医生，是不是没有聪明药呢？' (Dokter, mungkinkah memang tidak ada obat pintar?)."
                ),
                StoryQuestion(
                    id = "q_clvrpl_4",
                    questionText = "医生最后说病人“比以前聪明多了”，其中的幽默讽刺寓意是什么？ (Apa maksud humor dari ucapan dokter bahwa pasien 'jauh lebih pintar daripada sebelumnya'?)",
                    options = listOf("药片里的神秘成分终于起到了化学神效 (Zat misterius di obat akhirnya bereaksi secara kimiawi)", "病人终于开窍意识到世界上没有聪明药，不再盲目受骗 (Pasien akhirnya sadar bahwa tak ada obat pintar, menunjukkan ia sudah lebih cerdas dan kritis)", "病人通过了医学考试 (Pasien berhasil lulus ujian kedokteran)", "医生准备把药价提高十倍 (Dokter berencana menaikkan harga obat 10 kali lipat)"),
                    correctAnswerIndex = 1,
                    explanation = "Poin lucunya adalah: kemampuan pasien menyadari bahwa 'obat pintar itu tidak nyata' membuktikan bahwa pemikirannya kini sudah jauh lebih cerdas."
                )
            )
        ),

        // Cerita Mandarin Bean 190 (HSK 2): The Spring Festival (Tahun Baru Imlek - Hari Pertama)
        Story(
            id = "story_spring_festival_first_day",
            titleHanzi = "大年初一",
            titlePinyin = "Dà Nián Chū Yī",
            titleTranslation = "The Spring Festival (Hari Pertama Tahun Baru Imlek)",
            level = "HSK 2",
            category = "Budaya & Tradisi",
            description = "Mengenal makna hari pertama Tahun Baru Imlek (Danian Chuyi) sebagai awal musim semi dan perayaan tradisi berusia lebih dari 4.000 tahun.",
            coverEmoji = "🧧",
            coverImageRes = R.drawable.cover_story_spring_festival_first_day,
            estimatedReadMinutes = 2,
            sentences = listOf(
                Sentence(
                    id = "s_spfesf_1",
                    hanzi = "新年好！今天是大年初一，就是我们的“春节”。",
                    pinyin = "xīn nián hǎo jīn tiān shì dà nián chū yī jiù shì wǒ men de Chūn jié",
                    translation = "Selamat Tahun Baru! Hari ini adalah hari pertama bulan pertama (Danian Chuyi), yang tak lain merupakan Hari Raya 'Tahun Baru Imlek' bagi kita semua.",
                    tokens = listOf(
                        WordToken("新年", "xīn nián", "New Year", "Kosakata HSK 2: 新年 (xīn nián)"),
                        WordToken("好", "hǎo", "good / greeting", "Kosakata HSK 2: 好 (hǎo)"),
                        WordToken("今天", "jīn tiān", "today", "Kosakata HSK 2: 今天 (jīn tiān)"),
                        WordToken("是", "shì", "to be", "Kosakata HSK 2: 是 (shì)"),
                        WordToken("大年初一", "dà nián chū yī", "first day of the Lunar New Year", "Kosakata HSK 2: 大年初一 (dà nián chū yī)"),
                        WordToken("就", "jiù", "precisely / exactly", "Kosakata HSK 2: 就 (jiù)"),
                        WordToken("是", "shì", "to be", "Kosakata HSK 2: 是 (shì)"),
                        WordToken("我们", "wǒ men", "we / our", "Kosakata HSK 2: 我们 (wǒ men)"),
                        WordToken("的", "de", "possessive particle", "Kosakata HSK 2: 的 (de)"),
                        WordToken("春节", "Chūn jié", "Spring Festival / Lunar New Year", "Kosakata HSK 2: 春节 (Chūn jié)")
                    )
                ),
                Sentence(
                    id = "s_spfesf_2",
                    hanzi = "这是新一年的第一天，是春季的第一天，也是正月的第一天。",
                    pinyin = "zhè shì xīn yī nián de dì yī tiān shì chūn jì de dì yī tiān yě shì Zhēng yuè de dì yī tiān",
                    translation = "Ini merupakan hari pertama dari tahun yang baru, hari pertama musim semi, dan sekaligus hari pertama bulan pertama penanggalan lunar.",
                    tokens = listOf(
                        WordToken("这", "zhè", "this", "Kosakata HSK 2: 这 (zhè)"),
                        WordToken("是", "shì", "to be", "Kosakata HSK 2: 是 (shì)"),
                        WordToken("新一年", "xīn yī nián", "new year", "Kosakata HSK 2: 新一年 (xīn yī nián)"),
                        WordToken("的", "de", "possessive particle", "Kosakata HSK 2: 的 (de)"),
                        WordToken("第一天", "dì yī tiān", "first day", "Kosakata HSK 2: 第一天 (dì yī tiān)"),
                        WordToken("是", "shì", "to be", "Kosakata HSK 2: 是 (shì)"),
                        WordToken("春季", "chūn jì", "spring season", "Kosakata HSK 2: 春季 (chūn jì)"),
                        WordToken("的", "de", "possessive particle", "Kosakata HSK 2: 的 (de)"),
                        WordToken("第一天", "dì yī tiān", "first day", "Kosakata HSK 2: 第一天 (dì yī tiān)"),
                        WordToken("也", "yě", "also", "Kosakata HSK 2: 也 (yě)"),
                        WordToken("是", "shì", "to be", "Kosakata HSK 2: 是 (shì)"),
                        WordToken("正月", "Zhēng yuè", "first month of lunar year", "Kosakata HSK 2: 正月 (Zhēng yuè)"),
                        WordToken("的", "de", "possessive particle", "Kosakata HSK 2: 的 (de)"),
                        WordToken("第一天", "dì yī tiān", "first day", "Kosakata HSK 2: 第一天 (dì yī tiān)")
                    )
                ),
                Sentence(
                    id = "s_spfesf_3",
                    hanzi = "春节是中国最重要的一天。",
                    pinyin = "Chūn jié shì Zhōng guó zuì zhòng yào de yī tiān",
                    translation = "Tahun Baru Imlek adalah hari paling penting dan istimewa di seantero negeri Tiongkok.",
                    tokens = listOf(
                        WordToken("春节", "Chūn jié", "Spring Festival", "Kosakata HSK 2: 春节 (Chūn jié)"),
                        WordToken("是", "shì", "to be", "Kosakata HSK 2: 是 (shì)"),
                        WordToken("中国", "Zhōng guó", "China", "Kosakata HSK 2: 中国 (Zhōng guó)"),
                        WordToken("最", "zuì", "most", "Kosakata HSK 2: 最 (zuì)"),
                        WordToken("重要", "zhòng yào", "important", "Kosakata HSK 2: 重要 (zhòng yào)"),
                        WordToken("的", "de", "modifying particle", "Kosakata HSK 2: 的 (de)"),
                        WordToken("一天", "yī tiān", "one day / day", "Kosakata HSK 2: 一天 (yī tiān)")
                    )
                ),
                Sentence(
                    id = "s_spfesf_4",
                    hanzi = "中国人过春节已经有4000多年了。",
                    pinyin = "Zhōng guó rén guò Chūn jié yǐ jīng yǒu duō nián le",
                    translation = "Tradisi bangsa Tionghoa merayakan Tahun Baru Imlek telah berlangsung lebih dari 4.000 tahun lamanya.",
                    tokens = listOf(
                        WordToken("中国人", "Zhōng guó rén", "Chinese people", "Kosakata HSK 2: 中国人 (Zhōng guó rén)"),
                        WordToken("过", "guò", "to celebrate / to observe", "Kosakata HSK 2: 过 (guò)"),
                        WordToken("春节", "Chūn jié", "Spring Festival", "Kosakata HSK 2: 春节 (Chūn jié)"),
                        WordToken("已经", "yǐ jīng", "already", "Kosakata HSK 2: 已经 (yǐ jīng)"),
                        WordToken("有", "yǒu", "to have / dating back", "Kosakata HSK 2: 有 (yǒu)"),
                        WordToken("4000多", "duō", "more than 4000", "Kosakata HSK 2: 4000多 (sì qiān duō)"),
                        WordToken("年", "nián", "years", "Kosakata HSK 2: 年 (nián)"),
                        WordToken("了", "le", "modal particle", "Kosakata HSK 2: 了 (le)")
                    )
                ),
                Sentence(
                    id = "s_spfesf_5",
                    hanzi = "春节快乐，恭喜发财！",
                    pinyin = "Chūn jié kuài lè gōng xǐ fā cái",
                    translation = "Selamat Hari Raya Imlek, semoga dilimpahi kebahagiaan dan kemakmuran rezeki!",
                    tokens = listOf(
                        WordToken("春节", "Chūn jié", "Spring Festival", "Kosakata HSK 2: 春节 (Chūn jié)"),
                        WordToken("快乐", "kuài lè", "happy", "Kosakata HSK 2: 快乐 (kuài lè)"),
                        WordToken("恭喜发财", "gōng xǐ fā cái", "may you be prosperous / wishing wealth", "Kosakata HSK 2: 恭喜发财 (gōng xǐ fā cái)")
                    )
                )
            ),
            questions = listOf(
                StoryQuestion(
                    id = "q_spfesf_1",
                    questionText = "“大年初一”所指的具体是哪一个具有代表性的传统节日？ (Hari raya apakah yang secara spesifik dirujuk oleh istilah 'Danian Chuyi'?)",
                    options = listOf("端午节 (Festival Perahu Naga)", "春节（农历新年第一天） (Tahun Baru Imlek - hari pertama kalender lunar)", "中秋节 (Festival Kue Bulan)", "清明节 (Festival Qingming / Cengbeng)"),
                    correctAnswerIndex = 1,
                    explanation = "Teks menyatakan: '今天是大年初一，就是我们的春节' (Hari ini Danian Chuyi, yaitu Tahun Baru Imlek kita)."
                ),
                StoryQuestion(
                    id = "q_spfesf_2",
                    questionText = "大年初一在时间与节令上汇聚了哪些象征意义？ (Makna simbolis apa saja yang bertepatan pada hari Danian Chuyi?)",
                    options = listOf("夏至最热的一天 (Hari terpanas saat titik balik matahari musim panas)", "新一年的第一天、春季的第一天、正月的首日 (Hari pertama tahun baru, hari pertama musim semi, dan awal bulan pertama lunar)", "秋收结束的最后一天 (Hari terakhir berakhirnya panen raya musim gugur)", "一年之中黑夜最长的一天 (Hari dengan malam terpanjang dalam setahun)"),
                    correctAnswerIndex = 1,
                    explanation = "Teks menyebutkan: '这是新一年的第一天，是春季的第一天，也是正月的第一天'."
                ),
                StoryQuestion(
                    id = "q_spfesf_3",
                    questionText = "根据文章记录，中国人庆祝春节的历史有多悠久？ (Menurut teks, sudah berapa lama sejarah tradisi perayaan Imlek di Tiongkok?)",
                    options = listOf("只有近100年的近代历史 (Hanya sekitar 100 tahun sejarah modern)", "已经有4000多年的悠久传统 (Telah berlangsung selama lebih dari 4.000 tahun)", "大约50年左右 (Kira-kira 50 tahun saja)", "仅从唐朝才刚开始流传 (Hanya mulai dikenal sejak Dinasti Tang)"),
                    correctAnswerIndex = 1,
                    explanation = "Teks menyatakan: '中国人过春节已经有4000多年了' (Orang Tionghoa merayakan Imlek sudah lebih dari 4.000 tahun)."
                ),
                StoryQuestion(
                    id = "q_spfesf_4",
                    questionText = "在春节期间，最经典且家喻户晓的祝福祝词是什么？ (Ucapan selamat apakah yang paling klasik dan populer disampaikan saat Tahun Baru Imlek?)",
                    options = listOf("生日快乐，工作顺利 (Selamat ulang tahun dan lancar bekerja)", "春节快乐，恭喜发财！ (Selamat Imlek, semoga makmur dan banyak rezeki!)", "中秋快乐，花好月圆 (Selamat festival kue bulan, semoga bahagia)", "晚安好梦，天天开心 (Selamat malam tidur nyenyak)" ),
                    correctAnswerIndex = 1,
                    explanation = "Teks diakhiri dengan salam khas Imlek: '春节快乐，恭喜发财！'."
                )
            )
        ),

        // Cerita Mandarin Bean 191 (HSK 2): High-speed Rail Between Xi'an and Chengdu (Kereta Cepat Xi'an - Chengdu)
        Story(
            id = "story_xian_chengdu_rail",
            titleHanzi = "西安-成都",
            titlePinyin = "Xī'ān - Chéngdū",
            titleTranslation = "High-speed Rail Between Xi'an and Chengdu (Kereta Cepat Xi'an - Chengdu)",
            level = "HSK 2",
            category = "Berita & Transportasi",
            description = "Pembukaan jalur kereta cepat Xi'an ke Chengdu yang memangkas waktu tempuh dari 16 jam menjadi hanya 4 jam saja.",
            coverEmoji = "🚄",
            coverImageRes = R.drawable.cover_story_xian_chengdu_rail,
            estimatedReadMinutes = 2,
            sentences = listOf(
                Sentence(
                    id = "s_xacdra_1",
                    hanzi = "西安到成都的高铁开通了。",
                    pinyin = "Xī ān dào Chéng dū de gāo tiě kāi tōng le",
                    translation = "Jalur kereta berkecepatan tinggi yang menghubungkan Xi'an ke Chengdu kini telah resmi dibuka beroperasi.",
                    tokens = listOf(
                        WordToken("西安", "Xī ān", "Xi'an (capital of Shaanxi)", "Kosakata HSK 2: 西安 (Xī ān)"),
                        WordToken("到", "dào", "to / reaching", "Kosakata HSK 2: 到 (dào)"),
                        WordToken("成都", "Chéng dū", "Chengdu (capital of Sichuan)", "Kosakata HSK 2: 成都 (Chéng dū)"),
                        WordToken("的", "de", "modifying particle", "Kosakata HSK 2: 的 (de)"),
                        WordToken("高铁", "gāo tiě", "high-speed railway / bullet train", "Kosakata HSK 2: 高铁 (gāo tiě)"),
                        WordToken("开通", "kāi tōng", "to open for traffic / to start service", "Kosakata HSK 2: 开通 (kāi tōng)"),
                        WordToken("了", "le", "modal particle", "Kosakata HSK 2: 了 (le)")
                    )
                ),
                Sentence(
                    id = "s_xacdra_2",
                    hanzi = "第一个星期六和星期天，有1万多人坐高铁去成都。",
                    pinyin = "dì yī gè xīng qī liù hé xīng qī tiān yǒu wàn duō rén zuò gāo tiě qù Chéng dū",
                    translation = "Pada akhir pekan (Sabtu dan Minggu) pertama pembukaan, tercatat lebih dari 10.000 orang menaiki kereta cepat ini menuju Chengdu.",
                    tokens = listOf(
                        WordToken("第一个", "dì yī gè", "the first", "Kosakata HSK 2: 第一个 (dì yī gè)"),
                        WordToken("星期六", "xīng qī liù", "Saturday", "Kosakata HSK 2: 星期六 (xīng qī liù)"),
                        WordToken("和", "hé", "and", "Kosakata HSK 2: 和 (hé)"),
                        WordToken("星期天", "xīng qī tiān", "Sunday", "Kosakata HSK 2: 星期天 (xīng qī tiān)"),
                        WordToken("有", "yǒu", "there are / to have", "Kosakata HSK 2: 有 (yǒu)"),
                        WordToken("1万多", "wàn duō", "more than ten thousand", "Kosakata HSK 2: 1万多 (yī wàn duō)"),
                        WordToken("人", "rén", "people", "Kosakata HSK 2: 人 (rén)"),
                        WordToken("坐", "zuò", "to ride / to take (train)", "Kosakata HSK 2: 坐 (zuò)"),
                        WordToken("高铁", "gāo tiě", "high-speed rail", "Kosakata HSK 2: 高铁 (gāo tiě)"),
                        WordToken("去", "qù", "to go to", "Kosakata HSK 2: 去 (qù)"),
                        WordToken("成都", "Chéng dū", "Chengdu", "Kosakata HSK 2: 成都 (Chéng dū)")
                    )
                ),
                Sentence(
                    id = "s_xacdra_3",
                    hanzi = "也有很多人从成都去西安旅游。",
                    pinyin = "yě yǒu hěn duō rén cóng Chéng dū qù Xī ān lǚ yóu",
                    translation = "Banyak pula warga yang berangkat dari Chengdu ke Xi'an untuk berwisata menikmati objek sejarah.",
                    tokens = listOf(
                        WordToken("也", "yě", "also", "Kosakata HSK 2: 也 (yě)"),
                        WordToken("有", "yǒu", "there are", "Kosakata HSK 2: 有 (yǒu)"),
                        WordToken("很多", "hěn duō", "many / a lot of", "Kosakata HSK 2: 很多 (hěn duō)"),
                        WordToken("人", "rén", "people", "Kosakata HSK 2: 人 (rén)"),
                        WordToken("从", "cóng", "from", "Kosakata HSK 2: 从 (cóng)"),
                        WordToken("成都", "Chéng dū", "Chengdu", "Kosakata HSK 2: 成都 (Chéng dū)"),
                        WordToken("去", "qù", "to go to", "Kosakata HSK 2: 去 (qù)"),
                        WordToken("西安", "Xī ān", "Xi'an", "Kosakata HSK 2: 西安 (Xī ān)"),
                        WordToken("旅游", "lǚ yóu", "to travel / to tour", "Kosakata HSK 2: 旅游 (lǚ yóu)")
                    )
                ),
                Sentence(
                    id = "s_xacdra_4",
                    hanzi = "以前，西安到成都的火车时间是16个小时。",
                    pinyin = "yǐ qián Xī ān dào Chéng dū de huǒ chē shí jiān shì gè xiǎo shí",
                    translation = "Sebelumnya, waktu tempuh perjalanan kereta api biasa antara Xi'an dan Chengdu memakan waktu hingga 16 jam.",
                    tokens = listOf(
                        WordToken("以前", "yǐ qián", "previously / before", "Kosakata HSK 2: 以前 (yǐ qián)"),
                        WordToken("西安", "Xī ān", "Xi'an", "Kosakata HSK 2: 西安 (Xī ān)"),
                        WordToken("到", "dào", "to", "Kosakata HSK 2: 到 (dào)"),
                        WordToken("成都", "Chéng dū", "Chengdu", "Kosakata HSK 2: 成都 (Chéng dū)"),
                        WordToken("的", "de", "possessive particle", "Kosakata HSK 2: 的 (de)"),
                        WordToken("火车", "huǒ chē", "train", "Kosakata HSK 2: 火车 (huǒ chē)"),
                        WordToken("时间", "shí jiān", "time / duration", "Kosakata HSK 2: 时间 (shí jiān)"),
                        WordToken("是", "shì", "to be", "Kosakata HSK 2: 是 (shì)"),
                        WordToken("16个", "gè", "16 (measure word)", "Kosakata HSK 2: 16个 (shí liù gè)"),
                        WordToken("小时", "xiǎo shí", "hours", "Kosakata HSK 2: 小时 (xiǎo shí)")
                    )
                ),
                Sentence(
                    id = "s_xacdra_5",
                    hanzi = "现在，只要4个多小时。",
                    pinyin = "xiàn zài zhǐ yào gè duō xiǎo shí",
                    translation = "Namun sekarang, perjalanan hanya membutuhkan waktu 4 jam lebih sedikit saja.",
                    tokens = listOf(
                        WordToken("现在", "xiàn zài", "now / currently", "Kosakata HSK 2: 现在 (xiàn zài)"),
                        WordToken("只", "zhǐ", "only", "Kosakata HSK 2: 只 (zhǐ)"),
                        WordToken("要", "yào", "requires / needs", "Kosakata HSK 2: 要 (yào)"),
                        WordToken("4个", "gè", "4 (measure word)", "Kosakata HSK 2: 4个 (sì gè)"),
                        WordToken("多", "duō", "more than / over", "Kosakata HSK 2: 多 (duō)"),
                        WordToken("小时", "xiǎo shí", "hours", "Kosakata HSK 2: 小时 (xiǎo shí)")
                    )
                ),
                Sentence(
                    id = "s_xacdra_6",
                    hanzi = "两个城市的人都很方便。",
                    pinyin = "liǎng gè chéng shì de rén dōu hěn fāng biàn",
                    translation = "Masyarakat di kedua kota besar tersebut kini merasakan kemudahan mobilitas yang sangat praktis.",
                    tokens = listOf(
                        WordToken("两", "liǎng", "two", "Kosakata HSK 2: 两 (liǎng)"),
                        WordToken("个", "gè", "measure word", "Kosakata HSK 2: 个 (gè)"),
                        WordToken("城市", "chéng shì", "city", "Kosakata HSK 2: 城市 (chéng shì)"),
                        WordToken("的", "de", "possessive particle", "Kosakata HSK 2: 的 (de)"),
                        WordToken("人", "rén", "people", "Kosakata HSK 2: 人 (rén)"),
                        WordToken("都", "dōu", "all", "Kosakata HSK 2: 都 (dōu)"),
                        WordToken("很", "hěn", "very", "Kosakata HSK 2: 很 (hěn)"),
                        WordToken("方便", "fāng biàn", "convenient", "Kosakata HSK 2: 方便 (fāng biàn)")
                    )
                )
            ),
            questions = listOf(
                StoryQuestion(
                    id = "q_xacdra_1",
                    questionText = "新闻报道了哪两个重要历史文化名城之间的高铁正式开通？ (Jalur kereta cepat antara dua kota besar manakah yang resmi dioperasikan?)",
                    options = listOf("北京与上海 (Beijing dan Shanghai)", "西安与成都 (Xi'an dan Chengdu)", "广州与深圳 (Guangzhou dan Shenzhen)", "武汉与南京 (Wuhan dan Nanjing)"),
                    correctAnswerIndex = 1,
                    explanation = "Teks menyatakan: '西安到成都的高铁开通了' (Kereta cepat Xi'an ke Chengdu telah beroperasi)."
                ),
                StoryQuestion(
                    id = "q_xacdra_2",
                    questionText = "在高铁运营首个周末，大约有多少旅客搭乘高铁奔赴成都？ (Berapa perkiraan jumlah penumpang yang naik kereta cepat ke Chengdu pada akhir pekan pertama?)",
                    options = listOf("不到几百人 (Kurang dari beberapa ratus orang)", "1万多人 (Lebih dari 10.000 orang)", "超过100万人 (Lebih dari 1 juta orang)", "刚好只有两三个旅游团 (Hanya dua atau tiga rombongan tur)"),
                    correctAnswerIndex = 1,
                    explanation = "Teks menjelaskan: '第一个星期六和星期天，有1万多人坐高铁去成都'."
                ),
                StoryQuestion(
                    id = "q_xacdra_3",
                    questionText = "在以往没有高铁的时代，坐普通火车从西安到成都需要多长时间？ (Sebelum ada kereta cepat, berapa lama perjalanan kereta biasa dari Xi'an ke Chengdu?)",
                    options = listOf("只需2小时 (Hanya butuh 2 jam)", "整整16个小时 (Memakan waktu hingga 16 jam)", "足足耗费3天3夜 (Menghabiskan waktu 3 hari 3 malam)", "半个小时即可到达 (Hanya setengah jam sudah sampai)"),
                    correctAnswerIndex = 1,
                    explanation = "Teks mencatat: '以前，西安到成都的火车时间是16个小时'."
                ),
                StoryQuestion(
                    id = "q_xacdra_4",
                    questionText = "开通高铁后，两座城市之间的交通旅行时间大幅缩短到了多久？ (Setelah kereta cepat dibuka, waktu tempuh perjalanan terpangkas menjadi berapa lama?)",
                    options = listOf("仍然需要10个小时以上 (Masih membutuhkan waktu lebih dari 10 jam)", "只要4个多小时 (Hanya membutuhkan waktu 4 jam lebih sedikit)", "完全没有缩短 (Sama sekali tidak berkurang)", "仅需10分钟 (Hanya perlu waktu 10 menit)"),
                    correctAnswerIndex = 1,
                    explanation = "Teks menyatakan: '现在，只要4个多小时' (Sekarang hanya butuh 4 jam lebih)."
                )
            )
        ),

        // Cerita Mandarin Bean 192 (HSK 2): Help (Membantu Menulis Kartu Pos)
        Story(
            id = "story_help_elderly",
            titleHanzi = "帮忙",
            titlePinyin = "Bāngmáng",
            titleTranslation = "Help (Membantu Menulis Kartu Pos)",
            level = "HSK 2",
            category = "Cerita Lucu & Kehidupan",
            description = "Kisah humor saat seorang kakek meminta bantuan pemuda menulis kartu pos, dan menambahkan pesan terakhir yang membuat tertawa geli.",
            coverEmoji = "🤝",
            coverImageRes = R.drawable.cover_story_help_elderly,
            estimatedReadMinutes = 2,
            sentences = listOf(
                Sentence(
                    id = "s_hlpeld_1",
                    hanzi = "一个老人走到一个年轻人旁边，问：“先生，请帮我在明信片上写地址好吗？”",
                    pinyin = "yī gè lǎo rén zǒu dào yī gè nián qīng rén páng biān wèn xiān sheng qǐng bāng wǒ zài míng xìn piàn shàng xiě dì zhǐ hǎo ma",
                    translation = "Seorang pria lanjut usia menghampiri seorang pemuda lalu bertanya: 'Tuan, bolehkah tolong bantu saya menuliskan alamat pada kartu pos ini?'",
                    tokens = listOf(
                        WordToken("一个", "yī gè", "an / one", "Kosakata HSK 2: 一个 (yī gè)"),
                        WordToken("老人", "lǎo rén", "elderly person / old man", "Kosakata HSK 2: 老人 (lǎo rén)"),
                        WordToken("走", "zǒu", "to walk", "Kosakata HSK 2: 走 (zǒu)"),
                        WordToken("到", "dào", "to arrive at", "Kosakata HSK 2: 到 (dào)"),
                        WordToken("一个", "yī gè", "a", "Kosakata HSK 2: 一个 (yī gè)"),
                        WordToken("年轻", "nián qīng", "young", "Kosakata HSK 2: 年轻 (nián qīng)"),
                        WordToken("人", "rén", "person", "Kosakata HSK 2: 人 (rén)"),
                        WordToken("旁边", "páng biān", "side / beside", "Kosakata HSK 2: 旁边 (páng biān)"),
                        WordToken("问", "wèn", "to ask", "Kosakata HSK 2: 问 (wèn)"),
                        WordToken("先生", "xiān sheng", "sir / mister", "Kosakata HSK 2: 先生 (xiān sheng)"),
                        WordToken("请", "qǐng", "please", "Kosakata HSK 2: 请 (qǐng)"),
                        WordToken("帮", "bāng", "to help", "Kosakata HSK 2: 帮 (bāng)"),
                        WordToken("我", "wǒ", "me", "Kosakata HSK 2: 我 (wǒ)"),
                        WordToken("在", "zài", "on / at", "Kosakata HSK 2: 在 (zài)"),
                        WordToken("明信片", "míng xìn piàn", "postcard", "Kosakata HSK 2: 明信片 (míng xìn piàn)"),
                        WordToken("上", "shàng", "on", "Kosakata HSK 2: 上 (shàng)"),
                        WordToken("写", "xiě", "to write", "Kosakata HSK 2: 写 (xiě)"),
                        WordToken("地址", "dì zhǐ", "address", "Kosakata HSK 2: 地址 (dì zhǐ)"),
                        WordToken("好", "hǎo", "good / fine", "Kosakata HSK 2: 好 (hǎo)"),
                        WordToken("吗", "ma", "question particle", "Kosakata HSK 2: 吗 (ma)")
                    )
                ),
                Sentence(
                    id = "s_hlpeld_2",
                    hanzi = "“可以。”年轻人照老人的话写下了地址。",
                    pinyin = "kě yǐ nián qīng rén zhào lǎo rén de huà xiě xià le dì zhǐ",
                    translation = "'Tentu saja bisa.' Pemuda itu pun menuliskan alamat pos sesuai yang didektekan oleh kakek tersebut.",
                    tokens = listOf(
                        WordToken("可以", "kě yǐ", "can / certainly", "Kosakata HSK 2: 可以 (kě yǐ)"),
                        WordToken("年轻", "nián qīng", "young", "Kosakata HSK 2: 年轻 (nián qīng)"),
                        WordToken("人", "rén", "person", "Kosakata HSK 2: 人 (rén)"),
                        WordToken("照", "zhào", "according to / following", "Kosakata HSK 2: 照 (zhào)"),
                        WordToken("老人", "lǎo rén", "old man", "Kosakata HSK 2: 老人 (lǎo rén)"),
                        WordToken("的", "de", "possessive particle", "Kosakata HSK 2: 的 (de)"),
                        WordToken("话", "huà", "words", "Kosakata HSK 2: 话 (huà)"),
                        WordToken("写", "xiě", "to write", "Kosakata HSK 2: 写 (xiě)"),
                        WordToken("下", "xià", "down", "Kosakata HSK 2: 下 (xià)"),
                        WordToken("了", "le", "aspect particle", "Kosakata HSK 2: 了 (le)"),
                        WordToken("地址", "dì zhǐ", "address", "Kosakata HSK 2: 地址 (dì zhǐ)")
                    )
                ),
                Sentence(
                    id = "s_hlpeld_3",
                    hanzi = "老人说：“再帮我写上一些话，好吗？谢谢！”",
                    pinyin = "lǎo rén shuō zài bāng wǒ xiě shàng yī xiē huà hǎo ma xiè xie",
                    translation = "Sang kakek berkata lagi: 'Bolehkah tolong tuliskan beberapa patah kata ucapan lagi untuk saya? Terima kasih banyak ya!'",
                    tokens = listOf(
                        WordToken("老人", "lǎo rén", "old man", "Kosakata HSK 2: 老人 (lǎo rén)"),
                        WordToken("说", "shuō", "to say", "Kosakata HSK 2: 说 (shuō)"),
                        WordToken("再", "zài", "further / again", "Kosakata HSK 2: 再 (zài)"),
                        WordToken("帮", "bāng", "to help", "Kosakata HSK 2: 帮 (bāng)"),
                        WordToken("我", "wǒ", "me", "Kosakata HSK 2: 我 (wǒ)"),
                        WordToken("写", "xiě", "to write", "Kosakata HSK 2: 写 (xiě)"),
                        WordToken("上", "shàng", "on / down", "Kosakata HSK 2: 上 (shàng)"),
                        WordToken("一些", "yī xiē", "some / a few", "Kosakata HSK 2: 一些 (yī xiē)"),
                        WordToken("话", "huà", "words / message", "Kosakata HSK 2: 话 (huà)"),
                        WordToken("好", "hǎo", "good", "Kosakata HSK 2: 好 (hǎo)"),
                        WordToken("吗", "ma", "question particle", "Kosakata HSK 2: 吗 (ma)"),
                        WordToken("谢谢", "xiè xie", "thank you", "Kosakata HSK 2: 谢谢 (xiè xie)")
                    )
                ),
                Sentence(
                    id = "s_hlpeld_4",
                    hanzi = "“好吧。”年轻人照老人的话写好后，笑着问：“还有什么要帮忙的吗？”",
                    pinyin = "hǎo ba nián qīng rén zhào lǎo rén de huà xiě hǎo hòu xiào zhe wèn hái yǒu shén me yào bāng máng de ma",
                    translation = "'Baiklah.' Setelah selesai menuliskan pesan sesuai ucapan si kakek, pemuda itu tersenyum ramah dan bertanya: 'Apakah masih ada hal lain yang bisa saya bantu?'",
                    tokens = listOf(
                        WordToken("好", "hǎo", "alright", "Kosakata HSK 2: 好 (hǎo)"),
                        WordToken("吧", "ba", "particle", "Kosakata HSK 2: 吧 (ba)"),
                        WordToken("年轻", "nián qīng", "young", "Kosakata HSK 2: 年轻 (nián qīng)"),
                        WordToken("人", "rén", "person", "Kosakata HSK 2: 人 (rén)"),
                        WordToken("照", "zhào", "following / according to", "Kosakata HSK 2: 照 (zhào)"),
                        WordToken("老人", "lǎo rén", "old man", "Kosakata HSK 2: 老人 (lǎo rén)"),
                        WordToken("的", "de", "possessive particle", "Kosakata HSK 2: 的 (de)"),
                        WordToken("话", "huà", "words", "Kosakata HSK 2: 话 (huà)"),
                        WordToken("写", "xiě", "to write", "Kosakata HSK 2: 写 (xiě)"),
                        WordToken("好", "hǎo", "properly / finished", "Kosakata HSK 2: 好 (hǎo)"),
                        WordToken("后", "hòu", "after", "Kosakata HSK 2: 后 (hòu)"),
                        WordToken("笑", "xiào", "to smile", "Kosakata HSK 2: 笑 (xiào)"),
                        WordToken("着", "zhe", "aspect particle", "Kosakata HSK 2: 着 (zhe)"),
                        WordToken("问", "wèn", "to ask", "Kosakata HSK 2: 问 (wèn)"),
                        WordToken("还", "hái", "still / else", "Kosakata HSK 2: 还 (hái)"),
                        WordToken("有", "yǒu", "to have / is there", "Kosakata HSK 2: 有 (yǒu)"),
                        WordToken("什么", "shén me", "what", "Kosakata HSK 2: 什么 (shén me)"),
                        WordToken("要", "yào", "need / want", "Kosakata HSK 2: 要 (yào)"),
                        WordToken("帮忙", "bāng máng", "to help / assistance", "Kosakata HSK 2: 帮忙 (bāng máng)"),
                        WordToken("的", "de", "particle", "Kosakata HSK 2: 的 (de)"),
                        WordToken("吗", "ma", "question particle", "Kosakata HSK 2: 吗 (ma)")
                    )
                ),
                Sentence(
                    id = "s_hlpeld_5",
                    hanzi = "“还有一件小事。”老人看着明信片说，“帮我再写几个字：字写得很不好，请不要在意。”",
                    pinyin = "hái yǒu yī jiàn xiǎo shì lǎo rén kàn zhe míng xìn piàn shuō bāng wǒ zài xiě jǐ gè zì zì xiě de hěn bù hǎo qǐng bù yào zài yì",
                    translation = "'Masih ada satu hal kecil.' Sang kakek memandangi kartu pos itu lalu berkata, 'Tolong tambahkan beberapa kata penutup ini: Tulisan ini sangat jelek, mohon jangan dimasukkan ke hati ya.'",
                    tokens = listOf(
                        WordToken("还", "hái", "still", "Kosakata HSK 2: 还 (hái)"),
                        WordToken("有", "yǒu", "there is", "Kosakata HSK 2: 有 (yǒu)"),
                        WordToken("一", "yī", "one", "Kosakata HSK 2: 一 (yī)"),
                        WordToken("件", "jiàn", "measure word (matter / thing)", "Kosakata HSK 2: 件 (jiàn)"),
                        WordToken("小", "xiǎo", "small", "Kosakata HSK 2: 小 (xiǎo)"),
                        WordToken("事", "shì", "matter / thing", "Kosakata HSK 2: 事 (shì)"),
                        WordToken("老人", "lǎo rén", "old man", "Kosakata HSK 2: 老人 (lǎo rén)"),
                        WordToken("看", "kàn", "to look at", "Kosakata HSK 2: 看 (kàn)"),
                        WordToken("着", "zhe", "aspect particle", "Kosakata HSK 2: 着 (zhe)"),
                        WordToken("明信片", "míng xìn piàn", "postcard", "Kosakata HSK 2: 明信片 (míng xìn piàn)"),
                        WordToken("说", "shuō", "to say", "Kosakata HSK 2: 说 (shuō)"),
                        WordToken("帮", "bāng", "to help", "Kosakata HSK 2: 帮 (bāng)"),
                        WordToken("我", "wǒ", "me", "Kosakata HSK 2: 我 (wǒ)"),
                        WordToken("再", "zài", "again / additionally", "Kosakata HSK 2: 再 (zài)"),
                        WordToken("写", "xiě", "to write", "Kosakata HSK 2: 写 (xiě)"),
                        WordToken("几", "jǐ", "a few / several", "Kosakata HSK 2: 几 (jǐ)"),
                        WordToken("个", "gè", "measure word", "Kosakata HSK 2: 个 (gè)"),
                        WordToken("字", "zì", "characters / handwriting", "Kosakata HSK 2: 字 (zì)"),
                        WordToken("字", "zì", "handwriting / characters", "Kosakata HSK 2: 字 (zì)"),
                        WordToken("写", "xiě", "to write", "Kosakata HSK 2: 写 (xiě)"),
                        WordToken("得", "de", "particle", "Kosakata HSK 2: 得 (de)"),
                        WordToken("很", "hěn", "very", "Kosakata HSK 2: 很 (hěn)"),
                        WordToken("不好", "bù hǎo", "bad / not good", "Kosakata HSK 2: 不好 (bù hǎo)"),
                        WordToken("请", "qǐng", "please", "Kosakata HSK 2: 请 (qǐng)"),
                        WordToken("不要", "bù yào", "do not", "Kosakata HSK 2: 不要 (bù yào)"),
                        WordToken("在意", "zài yì", "to mind / to care about", "Kosakata HSK 2: 在意 (zài yì)")
                    )
                )
            ),
            questions = listOf(
                StoryQuestion(
                    id = "q_hlpeld_1",
                    questionText = "老人在路边请求年轻人给予的第一项帮助是什么？ (Bantuan pertama apakah yang diminta oleh orang tua itu kepada pemuda?)",
                    options = listOf("借手机拨打急救电话 (Meminjam ponsel untuk telepon darurat)", "在明信片上帮忙代写收信地址 (Membantu menuliskan alamat penerima pada kartu pos)", "买一瓶矿泉水 (Membelikan sebotol air mineral)", "搀扶老人过马路 (Menuntun orang tua menyeberang jalan)"),
                    correctAnswerIndex = 1,
                    explanation = "Orang tua itu bertanya: '先生，请帮我在明信片上写地址好吗？'."
                ),
                StoryQuestion(
                    id = "q_hlpeld_2",
                    questionText = "写好地址后，老人接着又提出了什么后续请求？ (Setelah menuliskan alamat, apa permintaan lanjutan dari sang kakek?)",
                    options = listOf("替他掏钱买邮票 (Membayarkan prangko pos)", "再帮忙写上一些祝贺信文 (Tolong bantu menuliskan isi pesan di kartu pos)", "把明信片当场撕掉 (Merobek kartu pos di tempat)", "让年轻人把明信片带回家收藏 (Menyuruh pemuda membawa pulang kartu pos itu)"),
                    correctAnswerIndex = 1,
                    explanation = "Kakek berkata: '再帮我写上一些话，好吗？谢谢！'."
                ),
                StoryQuestion(
                    id = "q_hlpeld_3",
                    questionText = "老人最后请求年轻人加上的一句让人哭笑不得的话是什么？ (Kalimat penutup menggelikan apa yang diminta kakek untuk dituliskan di akhir kartu pos?)",
                    options = listOf("“祝你生日快乐，天天发财” ('Selamat ulang tahun dan semakin makmur')", "“字写得很不好，请不要在意” ('Tulisan tangan ini sangat jelek, mohon jangan dimasukkan ke hati')", "“快点给我回信” ('Cepat balas surat saya ini')", "“这是一张来自远方的神秘明信片” ('Ini adalah kartu pos misterius dari kejauhan')"),
                    correctAnswerIndex = 1,
                    explanation = "Kakek meminta dituliskan: '字写得很不好，请不要在意' (Tulisannya sangat jelek, mohon dimaklumi)."
                ),
                StoryQuestion(
                    id = "q_hlpeld_4",
                    questionText = "这个故事的幽默笑点在哪里？ (Di manakah letak kejenakaan dan kelucuan dari cerita ini?)",
                    options = listOf("明信片上的邮票贴反了 (Prangko pada kartu pos tertempel terbalik)", "年轻人好心帮忙代写全部内容，老人却当着他的面抱怨并写下“字写得很差” (Pemuda berbaik hati membantu menulis semuanya, tapi kakek justru mendiktekan kalimat bahwa tulisan tangan pemuda itu jelek)", "年轻人根本不识字 (Pemuda itu ternyata buta huruf)", "老人忘记了收信人的名字 (Kakek lupa nama penerima surat)"),
                    correctAnswerIndex = 1,
                    explanation = "Kejenakaannya adalah sang pemuda yang menuliskan seluruh kartu pos dengan sukarela, namun justru disuruh menulis kalimat bahwa tulisannya sendiri sangat jelek."
                )
            )
        ),

        // Cerita Mandarin Bean 193 (HSK 2): Sleeping (Petinju yang Susah Tidur)
        Story(
            id = "story_boxer_sleeping",
            titleHanzi = "睡觉",
            titlePinyin = "Shuìjiào",
            titleTranslation = "Sleeping (Petinju yang Susah Tidur)",
            level = "HSK 2",
            category = "Cerita Lucu & Hiburan",
            description = "Cerita jenaka seorang petinju yang menderita insomnia; dokter menyarankannya menghitung angka, namun insting bertarungnya justru bangkit.",
            coverEmoji = "🥊",
            coverImageRes = R.drawable.cover_story_boxer_sleeping,
            estimatedReadMinutes = 2,
            sentences = listOf(
                Sentence(
                    id = "s_bxrslp_1",
                    hanzi = "一位拳击运动员晚上睡不着，请求医生的帮助。",
                    pinyin = "yī wèi quán jī yùn dòng yuán wǎn shang shuì bù zháo qǐng qiú yī shēng de bāng zhù",
                    translation = "Seorang atlet tinju mengalami kesulitan tidur di malam hari, sehingga ia mendatangi dokter untuk meminta bantuan medis.",
                    tokens = listOf(
                        WordToken("一位", "yī wèi", "one (polite measure word for person)", "Kosakata HSK 2: 一位 (yī wèi)"),
                        WordToken("拳击", "quán jī", "boxing", "Kosakata HSK 2: 拳击 (quán jī)"),
                        WordToken("运动员", "yùn dòng yuán", "athlete / sportsman", "Kosakata HSK 2: 运动员 (yùn dòng yuán)"),
                        WordToken("晚上", "wǎn shang", "night / evening", "Kosakata HSK 2: 晚上 (wǎn shang)"),
                        WordToken("睡不着", "shuì bù zháo", "unable to sleep", "Kosakata HSK 2: 睡不着 (shuì bù zháo)"),
                        WordToken("请求", "qǐng qiú", "to request / to ask for", "Kosakata HSK 2: 请求 (qǐng qiú)"),
                        WordToken("医生", "yī shēng", "doctor", "Kosakata HSK 2: 医生 (yī shēng)"),
                        WordToken("的", "de", "possessive particle", "Kosakata HSK 2: 的 (de)"),
                        WordToken("帮助", "bāng zhù", "help / assistance", "Kosakata HSK 2: 帮助 (bāng zhù)")
                    )
                ),
                Sentence(
                    id = "s_bxrslp_2",
                    hanzi = "医生让他睡觉前念数字。第二天，运动员又来了，他对医生说：这个方法不行！我从一念到九的时候，马上就跳起来了！",
                    pinyin = "yī shēng ràng tā shuì jiào qián niàn shù zì dì èr tiān yùn dòng yuán yòu lái le tā duì yī shēng shuō zhè ge fāng fǎ bù xíng wǒ cóng yī niàn dào jiǔ de shí hou mǎ shàng jiù tiào qǐ lái le",
                    translation = "Dokter menyarankannya untuk menghitung angka sebelum tidur. Keesokan harinya, petinju itu datang kembali dan mengeluh kepada dokter: 'Metode ini sama sekali tidak mempan! Begitu saya menghitung dari satu hingga sembilan, saya langsung refleks melompat bangun!'",
                    tokens = listOf(
                        WordToken("医生", "yī shēng", "doctor", "Kosakata HSK 2: 医生 (yī shēng)"),
                        WordToken("让", "ràng", "to instruct / to let", "Kosakata HSK 2: 让 (ràng)"),
                        WordToken("他", "tā", "him", "Kosakata HSK 2: 他 (tā)"),
                        WordToken("睡觉", "shuì jiào", "to sleep", "Kosakata HSK 2: 睡觉 (shuì jiào)"),
                        WordToken("前", "qián", "before", "Kosakata HSK 2: 前 (qián)"),
                        WordToken("念", "niàn", "to chant / to count / to read aloud", "Kosakata HSK 2: 念 (niàn)"),
                        WordToken("数字", "shù zì", "numbers / digits", "Kosakata HSK 2: 数字 (shù zì)"),
                        WordToken("第二天", "dì èr tiān", "the next day", "Kosakata HSK 2: 第二天 (dì èr tiān)"),
                        WordToken("运动员", "yùn dòng yuán", "athlete", "Kosakata HSK 2: 运动员 (yùn dòng yuán)"),
                        WordToken("又", "yòu", "again", "Kosakata HSK 2: 又 (yòu)"),
                        WordToken("来", "lái", "to come", "Kosakata HSK 2: 来 (lái)"),
                        WordToken("了", "le", "aspect particle", "Kosakata HSK 2: 了 (le)"),
                        WordToken("他", "tā", "he", "Kosakata HSK 2: 他 (tā)"),
                        WordToken("对", "duì", "towards / to", "Kosakata HSK 2: 对 (duì)"),
                        WordToken("医生", "yī shēng", "doctor", "Kosakata HSK 2: 医生 (yī shēng)"),
                        WordToken("说", "shuō", "to say", "Kosakata HSK 2: 说 (shuō)"),
                        WordToken("这个", "zhè ge", "this", "Kosakata HSK 2: 这个 (zhè ge)"),
                        WordToken("方法", "fāng fǎ", "method / technique", "Kosakata HSK 2: 方法 (fāng fǎ)"),
                        WordToken("不行", "bù xíng", "does not work / no good", "Kosakata HSK 2: 不行 (bù xíng)"),
                        WordToken("我", "wǒ", "I", "Kosakata HSK 2: 我 (wǒ)"),
                        WordToken("从", "cóng", "from", "Kosakata HSK 2: 从 (cóng)"),
                        WordToken("一", "yī", "one", "Kosakata HSK 2: 一 (yī)"),
                        WordToken("念", "niàn", "to count / to chant", "Kosakata HSK 2: 念 (niàn)"),
                        WordToken("到", "dào", "to / until", "Kosakata HSK 2: 到 (dào)"),
                        WordToken("九", "jiǔ", "nine", "Kosakata HSK 2: 九 (jiǔ)"),
                        WordToken("的", "de", "possessive particle", "Kosakata HSK 2: 的 (de)"),
                        WordToken("时候", "shí hou", "when / at the time", "Kosakata HSK 2: 时候 (shí hou)"),
                        WordToken("马上", "mǎ shàng", "immediately / at once", "Kosakata HSK 2: 马上 (mǎ shàng)"),
                        WordToken("就", "jiù", "then", "Kosakata HSK 2: 就 (jiù)"),
                        WordToken("跳", "tiào", "to jump", "Kosakata HSK 2: 跳 (tiào)"),
                        WordToken("起来", "qǐ lái", "upward / to get up", "Kosakata HSK 2: 起来 (qǐ lái)"),
                        WordToken("了", "le", "modal particle", "Kosakata HSK 2: 了 (le)")
                    )
                )
            ),
            questions = listOf(
                StoryQuestion(
                    id = "q_bxrslp_1",
                    questionText = "故事中求助于医生的主角从事的是哪种职业运动？ (Olahraga apakah yang digeluti tokoh utama yang mendatangi dokter?)",
                    options = listOf("游泳运动员 (Atlet renang)", "拳击运动员 (Atlet tinju)", "马拉松长跑选手 (Pelari maraton)", "举重运动员 (Atlet angkat besi)"),
                    correctAnswerIndex = 1,
                    explanation = "Teks menyatakan: '一位拳击运动员晚上睡不着，请求医生的帮助' (Seorang atlet tinju tidak bisa tidur dan meminta bantuan dokter)."
                ),
                StoryQuestion(
                    id = "q_bxrslp_2",
                    questionText = "医生为了改善运动员的失眠症状，给他推荐了什么助眠方法？ (Metode apa yang dianjurkan dokter untuk mengatasi susah tidurnya?)",
                    options = listOf("睡前剧烈举重锻炼 (Latihan angkat beban berat sebelum tidur)", "睡觉前在心里念数字（数羊数数） (Menghitung angka sebelum tidur)", "喝大量浓咖啡 (Minum kopi pekat dalam jumlah banyak)", "彻夜看恐怖电影 (Menonton film horor sepanjang malam)"),
                    correctAnswerIndex = 1,
                    explanation = "Teks menyebutkan: '医生让他睡觉前念数字' (Dokter menyuruhnya menghitung angka sebelum tidur)."
                ),
                StoryQuestion(
                    id = "q_bxrslp_3",
                    questionText = "拳击运动员在数数字时，数到哪个数字会发生意想不到的反应？ (Sampai di angka berapakah reaksi tak terduga dialami sang petinju?)",
                    options = listOf("数到100安然入睡 (Tidur pulas saat mencapai angka 100)", "数到“九”时马上本能地跳了起来 (Langsung melompat bangun begitu menghitung sampai angka 'sembilan')", "刚数到“二”就昏睡过去 (Langsung pingsan tidur begitu menghitung angka 2)", "数到一万也没任何感觉 (Menghitung sampai 10.000 tanpa reaksi apa-apa)"),
                    correctAnswerIndex = 1,
                    explanation = "Petinju berkata: '我从一念到九的时候，马上就跳起来了！' (Saat menghitung sampai 9, langsung melompat bangun)."
                ),
                StoryQuestion(
                    id = "q_bxrslp_4",
                    questionText = "为什么拳击手一数到“九”就会猛然跳起来？ (Mengapa atlet petinju langsung melompat berdiri begitu mendengar hitungan sembilan?)",
                    options = listOf("因为他怕双数 (Karena takut pada angka genap)", "因为在拳击比赛中裁判数到十就判定KO击倒，职业本能促使他在数到九前必须立刻站起 (Dalam pertandingan tinju, wasit menghitung sampai sepuluh menandakan KO; insting petinju membuatnya harus melompat bangkit sebelum hitungan sepuluh)", "闹钟在九点准时响起 (Alarm berbunyi tepat pukul 9)", "他突然想起来还要去晨练 (Dia tiba-tiba teringat harus lari pagi)"),
                    correctAnswerIndex = 1,
                    explanation = "Dalam aturan tinju, hitungan wasit (count of 10) menentukan kekalahan Knock Out. Refleks profesional petinju membuatnya segera melompat bangkit di hitungan ke-9 agar tidak kalah KO!"
                )
            )
        ),

        // Cerita Mandarin Bean 194 (HSK 2): The Ring (Cincin)
        Story(
            id = "story_the_ring",
            titleHanzi = "戒指",
            titlePinyin = "Jièzhi",
            titleTranslation = "The Ring (Cincin)",
            level = "HSK 2",
            category = "Cerita Lucu & Hiburan",
            description = "Percakapan lucu dua orang mengenai cincin yang dipungut di jalan dan tulisan romantis yang disalahartikan.",
            coverEmoji = "💍",
            coverImageRes = R.drawable.cover_story_the_ring,
            estimatedReadMinutes = 1,
            sentences = listOf(
                Sentence(
                    id = "s_therng_1",
                    hanzi = "A：你捡到了戒指，为什么不说，而是自己戴上了？",
                    pinyin = "nǐ jiǎn dào le jiè zhi wèi shén me bù shuō ér shì zì jǐ dài shàng le",
                    translation = "A: 'Kamu memungut sebuah cincin emas, kenapa tidak memberitahukannya kepada orang lain, melainkan malah kamu pakai sendiri di jarimu?'",
                    tokens = listOf(
                        WordToken("你", "nǐ", "you", "Kosakata HSK 2: 你 (nǐ)"),
                        WordToken("捡", "jiǎn", "to pick up / to find", "Kosakata HSK 2: 捡 (jiǎn)"),
                        WordToken("到", "dào", "to reach / complement of finding", "Kosakata HSK 2: 到 (dào)"),
                        WordToken("了", "le", "aspect particle", "Kosakata HSK 2: 了 (le)"),
                        WordToken("戒指", "jiè zhi", "ring", "Kosakata HSK 2: 戒指 (jiè zhi)"),
                        WordToken("为什么", "wèi shén me", "why / for what reason", "Kosakata HSK 2: 为什么 (wèi shén me)"),
                        WordToken("不说", "bù shuō", "not say / keep silent", "Kosakata HSK 2: 不说 (bù shuō)"),
                        WordToken("而是", "ér shì", "rather / but instead", "Kosakata HSK 2: 而是 (ér shì)"),
                        WordToken("自己", "zì jǐ", "oneself / own", "Kosakata HSK 2: 自己 (zì jǐ)"),
                        WordToken("戴", "dài", "to wear (accessories / ring)", "Kosakata HSK 2: 戴 (dài)"),
                        WordToken("上", "shàng", "on", "Kosakata HSK 2: 上 (shàng)"),
                        WordToken("了", "le", "modal particle", "Kosakata HSK 2: 了 (le)")
                    )
                ),
                Sentence(
                    id = "s_therng_2",
                    hanzi = "B：因为我看到戒指上写着：我是你的！",
                    pinyin = "yīn wèi wǒ kàn dào jiè zhi shàng xiě zhe wǒ shì nǐ de",
                    translation = "B: 'Karena di bagian ukiran cincin itu tertulis: Aku adalah milikmu!'",
                    tokens = listOf(
                        WordToken("因为", "yīn wèi", "because", "Kosakata HSK 2: 因为 (yīn wèi)"),
                        WordToken("我", "wǒ", "I", "Kosakata HSK 2: 我 (wǒ)"),
                        WordToken("看到", "kàn dào", "to see / saw", "Kosakata HSK 2: 看到 (kàn dào)"),
                        WordToken("戒指", "jiè zhi", "ring", "Kosakata HSK 2: 戒指 (jiè zhi)"),
                        WordToken("上", "shàng", "on", "Kosakata HSK 2: 上 (shàng)"),
                        WordToken("写", "xiě", "to write / inscribed", "Kosakata HSK 2: 写 (xiě)"),
                        WordToken("着", "zhe", "aspect particle", "Kosakata HSK 2: 着 (zhe)"),
                        WordToken("我", "wǒ", "I", "Kosakata HSK 2: 我 (wǒ)"),
                        WordToken("是", "shì", "to be", "Kosakata HSK 2: 是 (shì)"),
                        WordToken("你的", "nǐ de", "yours", "Kosakata HSK 2: 你的 (nǐ de)")
                    )
                )
            ),
            questions = listOf(
                StoryQuestion(
                    id = "q_therng_1",
                    questionText = "在对话中，人物A质问了人物B什么样的行为？ (Perilaku apakah yang dipertanyakan oleh si A kepada si B dalam percakapan?)",
                    options = listOf("为什么弄丢了贵重的钻石项链 (Kenapa menghilangkan kalung berlian berharga)", "捡到了戒指为什么不声张交出，反而自己偷偷戴在手上 (Mengapa setelah memungut cincin tidak melapor, melainkan justru memakainya sendiri di jari)", "为什么拒绝参加朋友的订婚晚宴 (Mengapa menolak menghadiri pesta pertunangan teman)", "为什么在珠宝店偷买假戒指 (Kenapa membeli cincin palsu di toko perhiasan)"),
                    correctAnswerIndex = 1,
                    explanation = "A bertanya: '你捡到了戒指，为什么不说，而是自己戴上了？'."
                ),
                StoryQuestion(
                    id = "q_therng_2",
                    questionText = "人物B为自己戴上这枚戒指找到了怎样荒唐搞笑的理由？ (Alasan konyol apa yang diberikan oleh si B untuk membenarkan tindakannya memakai cincin tersebut?)",
                    options = listOf("以为戒指是用巧克力做的 (Mengira cincin itu terbuat dari cokelat)", "因为看到戒指刻字写着“我是你的！”，自作多情以为 cincin itu milik dirinya (Karena melihat ukiran di cincin bertuliskan 'Aku milikmu!', sehingga menganggap cincin itu ditakdirkan untuk dirinya)", "误以为是地上掉落的易拉罐拉环 (Mengira itu cincin tutup kaleng soda)", "说自己的手指太冷需要金属保暖 (Mengaku jarinya kedinginan dan butuh logam penghangat)"),
                    correctAnswerIndex = 1,
                    explanation = "B menjawab: '因为我看到戒指上写着：我是你的！' (Karena saya melihat di cincin tertulis: Aku milikmu!)."
                ),
                StoryQuestion(
                    id = "q_therng_3",
                    questionText = "戒指上刻印的“我是你的”在原本情境中通常代表什么含义？ (Apa makna sesungguhnya dari tulisan 'Aku adalah milikmu' pada ukiran cincin tersebut?)",
                    options = listOf("失物认领处的官方印章 (Cap resmi dari kantor barang hilang)", "情侣或夫妻之间表达深情爱意的誓言刻字 (Tulisan sumpah setia ungkapan cinta mendalam antar pasangan kekasih/suami-istri)", "黄金成色和纯度的鉴定证明 (Sertifikat kadar dan kemurnian emas)", "首饰加工厂的工匠代号 (Kode identitas pengrajin di pabrik perhiasan)"),
                    correctAnswerIndex = 1,
                    explanation = "Ukiran '我是你的' (I am yours) adalah kata-kata romantis sepasang kekasih pada cincin tunangan atau pernikahan."
                ),
                StoryQuestion(
                    id = "q_therng_4",
                    questionText = "在中文里，佩戴戒指应该搭配哪个动词？ (Dalam bahasa Mandarin, kata kerja manakah yang tepat digunakan untuk mengenakan cincin?)",
                    options = listOf("穿 (chuān - untuk baju/sepatu)", "戴 (dài - untuk aksesori cincin/topi/kacamata)", "提 (tí - untuk menjinjing)", "挂 (guà - untuk menggantung)"),
                    correctAnswerIndex = 1,
                    explanation = "Untuk aksesoris seperti cincin (戒指), topi (帽子), kacamata (眼镜), kata kerja yang digunakan adalah '戴' (dài)."
                )
            )
        )
    )
}
