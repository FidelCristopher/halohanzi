package com.example.chineselearning.data.repository

import com.example.chineselearning.R
import com.example.chineselearning.data.model.Sentence
import com.example.chineselearning.data.model.Story
import com.example.chineselearning.data.model.StoryQuestion
import com.example.chineselearning.data.model.WordToken

val mandarinBeanStoriesPart16: List<Story> by lazy {
    listOf(
        // Cerita Mandarin Bean 175 (HSK 2): Birthday (Hari Ulang Tahun)
        Story(
            id = "story_birthday",
            titleHanzi = "生日",
            titlePinyin = "Shēngrì",
            titleTranslation = "Birthday (Hari Ulang Tahun)",
            level = "HSK 2",
            category = "Keluarga & Tradisi",
            description = "Perayaan sederhana hari ulang tahun bersama keluarga dengan tradisi makan mi panjang umur dan meniup lilin kue.",
            coverEmoji = "🎂",
            coverImageRes = R.drawable.cover_story_birthday,
            estimatedReadMinutes = 2,
            sentences = listOf(
                Sentence(
                    id = "s_bdayst_1",
                    hanzi = "今天是5月20日，好朋友的生日就要到了，时间过得真快。",
                    pinyin = "jīn tiān shì yuè rì hǎo péng you de shēng rì jiù yào dào le shí jiān guò de zhēn kuài",
                    translation = "Hari ini tanggal 20 Mei, hari ulang tahun sahabat baikku sebentar lagi akan tiba; waktu benar-benar berlalu dengan sangat cepat.",
                    tokens = listOf(
                        WordToken("今天", "jīn tiān", "today", "Kosakata HSK 2: 今天 (jīn tiān)"),
                        WordToken("是", "shì", "to be (followed by substantives only)", "Kosakata HSK 2: 是 (shì)"),
                        WordToken("月", "yuè", "month / monthly", "Kosakata HSK 2: 月 (yuè)"),
                        WordToken("日", "rì", "sun / day / date, day of the month", "Kosakata HSK 2: 日 (rì)"),
                        WordToken("好", "hǎo", "good / appropriate; proper", "Kosakata HSK 2: 好 (hǎo)"),
                        WordToken("朋友", "péng you", "friend", "Kosakata HSK 2: 朋友 (péng you)"),
                        WordToken("的", "de", "possessive particle (of; 's) / modifying particle (used after an attribute to modify a noun or to form a nominal expression)", "Kosakata HSK 2: 的 (de)"),
                        WordToken("生日", "shēng rì", "birthday", "Kosakata HSK 2: 生日 (shēng rì)"),
                        WordToken("就", "jiù", "to approach; to move towards", "Kosakata HSK 2: 就 (jiù)"),
                        WordToken("要", "yào", "will; shall; about to / need to; should / if", "Kosakata HSK 2: 要 (yào)"),
                        WordToken("到", "dào", "to reach; to arrive / to (a place); until (a time); up to (a point) / (verb complement indicating arriving at a place or reaching a point)", "Kosakata HSK 2: 到 (dào)"),
                        WordToken("了", "le", "(completed action marker) / (modal particle indicating change of state, situation now)", "Kosakata HSK 2: 了 (le)"),
                        WordToken("时间", "shí jiān", "time", "Kosakata HSK 2: 时间 (shí jiān)"),
                        WordToken("过", "guò", "to cross / to go over / to pass (time) / to celebrate (a holiday) / to live / to get along", "Kosakata HSK 2: 过 (guò)"),
                        WordToken("得", "de", "structural particle: used after a verb (or adjective as main verb), linking it to following phrase indicating effect, degree, possibility etc", "Kosakata HSK 2: 得 (de)"),
                        WordToken("真", "zhēn", "really / truly / indeed", "Kosakata HSK 2: 真 (zhēn)"),
                        WordToken("快", "kuài", "rapid / quick", "Kosakata HSK 2: 快 (kuài)")
                    )
                ),
                Sentence(
                    id = "s_bdayst_2",
                    hanzi = "我不知道她准备做什么。",
                    pinyin = "wǒ bù zhī dào tā zhǔn bèi zuò shén me",
                    translation = "Aku sendiri belum tahu apa rencana yang ia persiapkan untuk merayakannya.",
                    tokens = listOf(
                        WordToken("我", "wǒ", "I; me; my", "Kosakata HSK 2: 我 (wǒ)"),
                        WordToken("不", "bù", "no; not so", "Kosakata HSK 2: 不 (bù)"),
                        WordToken("知道", "zhī dào", "to know; to become aware of", "Kosakata HSK 2: 知道 (zhī dào)"),
                        WordToken("她", "tā", "she", "Kosakata HSK 2: 她 (tā)"),
                        WordToken("准备", "zhǔn bèi", "to prepare / to intend / to be about to", "Kosakata HSK 2: 准备 (zhǔn bèi)"),
                        WordToken("做", "zuò", "to do; to engage in; to hold (a party etc)", "Kosakata HSK 2: 做 (zuò)"),
                        WordToken("什么", "shén me", "what?", "Kosakata HSK 2: 什么 (shén me)")
                    )
                ),
                Sentence(
                    id = "s_bdayst_3",
                    hanzi = "但是我想她可以去杭州旅游。",
                    pinyin = "dàn shì wǒ xiǎng tā kě yǐ qù Háng zhōu lǚ yóu",
                    translation = "Namun menurut hematku, ia bisa merayakannya dengan berlibur menikmati panorama kota Hangzhou yang menawan.",
                    tokens = listOf(
                        WordToken("但是", "dàn shì", "but; however", "Kosakata HSK 2: 但是 (dàn shì)"),
                        WordToken("我", "wǒ", "I; me; my", "Kosakata HSK 2: 我 (wǒ)"),
                        WordToken("想", "xiǎng", "to think (about) / to think of; to devise / to think (that); to believe (that)", "Kosakata HSK 2: 想 (xiǎng)"),
                        WordToken("她", "tā", "she", "Kosakata HSK 2: 她 (tā)"),
                        WordToken("可以", "kě yǐ", "can / may / possible / able to", "Kosakata HSK 2: 可以 (kě yǐ)"),
                        WordToken("去", "qù", "to go, to go to", "Kosakata HSK 2: 去 (qù)"),
                        WordToken("杭州", "Háng zhōu", "Hangzhou, a city in Zhejiang Province, China.", "Kosakata HSK 2: 杭州 (Háng zhōu)"),
                        WordToken("旅游", "lǚ yóu", "to travel", "Kosakata HSK 2: 旅游 (lǚ yóu)")
                    )
                ),
                Sentence(
                    id = "s_bdayst_4",
                    hanzi = "杭州很不错，我去过一次。",
                    pinyin = "Háng zhōu hěn bù cuò wǒ qù guo yī cì",
                    translation = "Kota Hangzhou sungguh sangat indah dan asri, aku pernah berkunjung ke sana sekali.",
                    tokens = listOf(
                        WordToken("杭州", "Háng zhōu", "Hangzhou, a city in Zhejiang Province, China.", "Kosakata HSK 2: 杭州 (Háng zhōu)"),
                        WordToken("很", "hěn", "very; quite", "Kosakata HSK 2: 很 (hěn)"),
                        WordToken("不错", "bù cuò", "not bad / pretty good", "Kosakata HSK 2: 不错 (bù cuò)"),
                        WordToken("我", "wǒ", "I; me; my", "Kosakata HSK 2: 我 (wǒ)"),
                        WordToken("去", "qù", "to go, to go to", "Kosakata HSK 2: 去 (qù)"),
                        WordToken("过", "guo", "(experienced action marker)", "Kosakata HSK 2: 过 (guo)"),
                        WordToken("一", "yī", "one / single / a (article)", "Kosakata HSK 2: 一 (yī)"),
                        WordToken("次", "cì", "classifier for enumerated events: time", "Kosakata HSK 2: 次 (cì)")
                    )
                ),
                Sentence(
                    id = "s_bdayst_5",
                    hanzi = "从北京到杭州也不远，飞机火车都很方便。",
                    pinyin = "cóng Běi jīng dào Háng zhōu yě bù yuǎn fēi jī huǒ chē dōu hěn fāng biàn",
                    translation = "Jarak perjalanan dari Beijing ke Hangzhou juga tidak terlalu jauh, pilihan transportasi pesawat maupun kereta cepat semuanya sangat praktis.",
                    tokens = listOf(
                        WordToken("从", "cóng", "from; through; via / (bound form) retainer; attendant / (bound form) assistant; auxiliary; subordinate / (bound form) related by common paternal grandfather or earlier ancestor", "Kosakata HSK 2: 从 (cóng)"),
                        WordToken("北京", "Běi jīng", "Beijing municipality, capital of the People's Republic of China", "Kosakata HSK 2: 北京 (Běi jīng)"),
                        WordToken("到", "dào", "to reach; to arrive / to (a place); until (a time); up to (a point) / (verb complement indicating arriving at a place or reaching a point)", "Kosakata HSK 2: 到 (dào)"),
                        WordToken("杭州", "Háng zhōu", "Hangzhou, a city in Zhejiang Province, China.", "Kosakata HSK 2: 杭州 (Háng zhōu)"),
                        WordToken("也", "yě", "also; too; as well; (not ...) either", "Kosakata HSK 2: 也 (yě)"),
                        WordToken("不", "bù", "no; not so", "Kosakata HSK 2: 不 (bù)"),
                        WordToken("远", "yuǎn", "far / distant / remote", "Kosakata HSK 2: 远 (yuǎn)"),
                        WordToken("飞机", "fēi jī", "airplane", "Kosakata HSK 2: 飞机 (fēi jī)"),
                        WordToken("火车", "huǒ chē", "train", "Kosakata HSK 2: 火车 (huǒ chē)"),
                        WordToken("都", "dōu", "all; both; entirely", "Kosakata HSK 2: 都 (dōu)"),
                        WordToken("很", "hěn", "very; quite", "Kosakata HSK 2: 很 (hěn)"),
                        WordToken("方便", "fāng biàn", "convenient; suitable", "Kosakata HSK 2: 方便 (fāng biàn)")
                    )
                ),
                Sentence(
                    id = "s_bdayst_6",
                    hanzi = "这肯定会是个特别的生日。",
                    pinyin = "zhè kěn dìng huì shì gè tè bié de shēng rì",
                    translation = "Perjalanan liburan ke Hangzhou ini pasti akan menjadi momen perayaan ulang tahun yang sangat berkesan dan istimewa.",
                    tokens = listOf(
                        WordToken("这", "zhè", "this; these", "Kosakata HSK 2: 这 (zhè)"),
                        WordToken("肯定", "kěn dìng", "assuredly; definitely", "Kosakata HSK 2: 肯定 (kěn dìng)"),
                        WordToken("会", "huì", "to be likely to; to be sure to", "Kosakata HSK 2: 会 (huì)"),
                        WordToken("是", "shì", "to be (followed by substantives only)", "Kosakata HSK 2: 是 (shì)"),
                        WordToken("个", "gè", "classifier for people or objects in general", "Kosakata HSK 2: 个 (gè)"),
                        WordToken("特别", "tè bié", "unusual; special", "Kosakata HSK 2: 特别 (tè bié)"),
                        WordToken("的", "de", "possessive particle (of; 's) / modifying particle (used after an attribute to modify a noun or to form a nominal expression)", "Kosakata HSK 2: 的 (de)"),
                        WordToken("生日", "shēng rì", "birthday", "Kosakata HSK 2: 生日 (shēng rì)")
                    )
                )
            ),
            questions = listOf(
                StoryQuestion(
                    id = "q_bdayst_1",
                    questionText = "文章开篇提到的当前日期是几月几号，预示着谁的生日即将来临？ (Tanggal berapakah yang disebutkan di awal cerita sebagai penanda hari ulang tahun sahabatnya?)",
                    options = listOf("元旦1月1日 (Tahun baru 1 Januari)", "5月20日（好朋友的生日即将到来） (Tanggal 20 Mei - ulang tahun sahabat baiknya kian dekat)", "国庆节10月1日 (Hari Nasional 1 Oktober)", "圣诞节12月25日 (Hari Natal 25 Desember)"),
                    correctAnswerIndex = 1,
                    explanation = "Narator menuturkan bahwa tanggal saat itu adalah 20 Mei dan ulang tahun sahabatnya sudah dekat."
                ),
                StoryQuestion(
                    id = "q_bdayst_2",
                    questionText = "虽然还不知道寿星自己的打算，但作者在心中为朋友筹划了怎样一个绝妙的庆生方案？ (Rencana perayaan ulang tahun istimewa apa yang dipikirkan narator untuk sahabatnya?)",
                    options = listOf("在嘈杂的酒吧通宵唱卡拉OK (Bernyanyi karaoke semalaman di bar bising)", "建议她动身前往如诗如画的人间天堂——杭州去旅游度假 (Menyarankannya berlibur menikmati keindahan kota Hangzhou yang permai)", "在学校食堂吃一碗白米饭 (Makan semangkuk nasi putih di kantin kampus)", "去大沙漠徒步探险 (Mendaki gurun pasir tandus)"),
                    correctAnswerIndex = 1,
                    explanation = "Narator menyarankan destinasi wisata kota Hangzhou yang terkenal dengan keindahan danau baratnya."
                ),
                StoryQuestion(
                    id = "q_bdayst_3",
                    questionText = "作者向朋友极力推荐杭州旅游的自身实际经历与理由是什么？ (Alasan pribadi apa yang membuat narator begitu yakin merekomendasikan Hangzhou?)",
                    options = listOf("自己从没去过纯属道听途说 (Belum pernah ke sana dan hanya mendengar kabar burung)", "作者自己曾经亲身游历过一次，深感杭州风光宜人且印象极佳 (Narator sendiri sudah pernah berkunjung ke sana dan merasakan pesona wisatanya yang memikat)", "杭州的所有景点对寿星全部免门票 (Semua objek wisata Hangzhou gratis untuk yang berulang tahun)", "作者在杭州拥有一座私人岛屿 (Narator memiliki pulau pribadi di Hangzhou)"),
                    correctAnswerIndex = 1,
                    explanation = "Pengalaman langsung narator yang pernah berkunjung ke Hangzhou membuatnya sangat merekomendasikannya."
                ),
                StoryQuestion(
                    id = "q_bdayst_4",
                    questionText = "从首都北京前往南方名城杭州，在现代交通条件上具备怎样的便捷性？ (Kemudahan akses transportasi apa yang menghubungkan Beijing dengan Hangzhou?)",
                    options = listOf("只能步行或者骑马翻山越岭 (Hanya bisa berjalan kaki atau naik kuda menembus pegunungan)", "两地距离适中，民航飞机与高铁动车班次极其密集方便 (Jaraknya tidak terlalu jauh, penerbangan pesawat dan kereta cepat tersedia sangat praktis)", "必须先坐轮船绕行太平洋 (Harus naik kapal laut mengitari samudra Pasifik)", "每个月仅有一趟慢速绿皮火车 (Hanya ada satu jadwal kereta lambat per bulan)"),
                    correctAnswerIndex = 1,
                    explanation = "Konektivitas kereta cepat dan pesawat terbang menjadikan perjalanan dari Beijing ke Hangzhou cepat dan efisien."
                )
            )
        ),
        // Cerita Mandarin Bean 176 (HSK 2): Watch Movie (Menonton Film di Bioskop)
        Story(
            id = "story_watch_movie",
            titleHanzi = "看电影",
            titlePinyin = "Kàn Diànyǐng",
            titleTranslation = "Watch Movie (Menonton Film di Bioskop)",
            level = "HSK 2",
            category = "Hiburan & Teman",
            description = "Pengalaman seru menonton film bioskop 3D bersama teman-teman di akhir pekan dan berdiskusi seru seusai film.",
            coverEmoji = "🎬",
            coverImageRes = R.drawable.cover_story_watch_movie,
            estimatedReadMinutes = 2,
            sentences = listOf(
                Sentence(
                    id = "s_wtchmv_1",
                    hanzi = "听说有个新电影，我没看过，但是他们说很有意思。",
                    pinyin = "tīng shuō yǒu gè xīn diàn yǐng wǒ méi kàn guo dàn shì tā men shuō hěn yǒu yì si",
                    translation = "Kudengar ada film layar lebar baru yang sedang tayang; aku sendiri belum menontonnya, tetapi orang-orang bilang ceritanya sangat seru dan menarik.",
                    tokens = listOf(
                        WordToken("听说", "tīng shuō", "to hear (sth said) / one hears (that)", "Kosakata HSK 2: 听说 (tīng shuō)"),
                        WordToken("有", "yǒu", "to have; there is", "Kosakata HSK 2: 有 (yǒu)"),
                        WordToken("个", "gè", "classifier for people or objects in general", "Kosakata HSK 2: 个 (gè)"),
                        WordToken("新", "xīn", "new; newly", "Kosakata HSK 2: 新 (xīn)"),
                        WordToken("电影", "diàn yǐng", "movie; film", "Kosakata HSK 2: 电影 (diàn yǐng)"),
                        WordToken("我", "wǒ", "I; me; my", "Kosakata HSK 2: 我 (wǒ)"),
                        WordToken("没", "méi", "(negative prefix for verbs) have not; not", "Kosakata HSK 2: 没 (méi)"),
                        WordToken("看", "kàn", "to see; to look at / to read / to watch / to visit; to call on / to consider; to regard as / to look after / to treat (a patient or illness) / to depend on / to feel (that) / (after a verb) to give it a try / to watch out for", "Kosakata HSK 2: 看 (kàn)"),
                        WordToken("过", "guo", "(experienced action marker)", "Kosakata HSK 2: 过 (guo)"),
                        WordToken("但是", "dàn shì", "but; however", "Kosakata HSK 2: 但是 (dàn shì)"),
                        WordToken("他们", "tā men", "they; them", "Kosakata HSK 2: 他们 (tā men)"),
                        WordToken("说", "shuō", "to speak; to talk; to say", "Kosakata HSK 2: 说 (shuō)"),
                        WordToken("很", "hěn", "very; quite", "Kosakata HSK 2: 很 (hěn)"),
                        WordToken("有意思", "yǒu yì si", "interesting / meaningful / enjoyable / fun", "Kosakata HSK 2: 有意思 (yǒu yì si)")
                    )
                ),
                Sentence(
                    id = "s_wtchmv_2",
                    hanzi = "我想和我的女朋友去看，但是我的朋友们也想去。",
                    pinyin = "wǒ xiǎng hé wǒ de nǚ péng you qù kàn dàn shì wǒ de péng you men yě xiǎng qù",
                    translation = "Awalnya aku berniat mengajak pacarku menonton berdua, tetapi teman-teman satu gengku ternyata juga ingin ikut menonton bersama.",
                    tokens = listOf(
                        WordToken("我", "wǒ", "I; me; my", "Kosakata HSK 2: 我 (wǒ)"),
                        WordToken("想", "xiǎng", "to desire; to want (to)", "Kosakata HSK 2: 想 (xiǎng)"),
                        WordToken("和", "hé", "and; together with", "Kosakata HSK 2: 和 (hé)"),
                        WordToken("我的", "wǒ de", "my; mine", "Kosakata HSK 2: 我的 (wǒ de)"),
                        WordToken("女", "nǚ", "female", "Kosakata HSK 2: 女 (nǚ)"),
                        WordToken("朋友", "péng you", "friend", "Kosakata HSK 2: 朋友 (péng you)"),
                        WordToken("去", "qù", "to go, to go to", "Kosakata HSK 2: 去 (qù)"),
                        WordToken("看", "kàn", "to see; to look at / to read / to watch / to visit; to call on / to consider; to regard as / to look after / to treat (a patient or illness) / to depend on / to feel (that) / (after a verb) to give it a try / to watch out for", "Kosakata HSK 2: 看 (kàn)"),
                        WordToken("但是", "dàn shì", "but; however", "Kosakata HSK 2: 但是 (dàn shì)"),
                        WordToken("我的", "wǒ de", "my; mine", "Kosakata HSK 2: 我的 (wǒ de)"),
                        WordToken("朋友", "péng you", "friend", "Kosakata HSK 2: 朋友 (péng you)"),
                        WordToken("们", "men", "plural marker for pronouns, and nouns referring to individuals", "Kosakata HSK 2: 们 (men)"),
                        WordToken("也", "yě", "also; too; as well; (not ...) either", "Kosakata HSK 2: 也 (yě)"),
                        WordToken("想", "xiǎng", "to desire; to want (to)", "Kosakata HSK 2: 想 (xiǎng)"),
                        WordToken("去", "qù", "to go, to go to", "Kosakata HSK 2: 去 (qù)")
                    )
                ),
                Sentence(
                    id = "s_wtchmv_3",
                    hanzi = "虽然我的朋友们不认识我的女朋友，但是我想让他们见面认识认识。",
                    pinyin = "suī rán wǒ de péng you men bù rèn shi wǒ de nǚ péng you dàn shì wǒ xiǎng ràng tā men jiàn miàn rèn shi rèn shi",
                    translation = "Meskipun teman-temanku belum pernah berkenalan dengan pacarku, aku rasa ini kesempatan bagus mempertemukan mereka agar bisa saling mengenal akrab.",
                    tokens = listOf(
                        WordToken("虽然", "suī rán", "although; even though", "Kosakata HSK 2: 虽然 (suī rán)"),
                        WordToken("我的", "wǒ de", "my; mine", "Kosakata HSK 2: 我的 (wǒ de)"),
                        WordToken("朋友", "péng you", "friend", "Kosakata HSK 2: 朋友 (péng you)"),
                        WordToken("们", "men", "plural marker for pronouns, and nouns referring to individuals", "Kosakata HSK 2: 们 (men)"),
                        WordToken("不", "bù", "no; not so", "Kosakata HSK 2: 不 (bù)"),
                        WordToken("认识", "rèn shi", "to know / to recognize / to be familiar with / to get acquainted with sb", "Kosakata HSK 2: 认识 (rèn shi)"),
                        WordToken("我", "wǒ", "I; me; my", "Kosakata HSK 2: 我 (wǒ)"),
                        WordToken("的", "de", "possessive particle (of; 's) / modifying particle (used after an attribute to modify a noun or to form a nominal expression)", "Kosakata HSK 2: 的 (de)"),
                        WordToken("女", "nǚ", "female", "Kosakata HSK 2: 女 (nǚ)"),
                        WordToken("朋友", "péng you", "friend", "Kosakata HSK 2: 朋友 (péng you)"),
                        WordToken("但是", "dàn shì", "but; however", "Kosakata HSK 2: 但是 (dàn shì)"),
                        WordToken("我", "wǒ", "I; me; my", "Kosakata HSK 2: 我 (wǒ)"),
                        WordToken("想", "xiǎng", "to desire; to want (to)", "Kosakata HSK 2: 想 (xiǎng)"),
                        WordToken("让", "ràng", "to permit / to let sb do sth / to have sb do sth / to make sb (feel sad etc)", "Kosakata HSK 2: 让 (ràng)"),
                        WordToken("他们", "tā men", "they; them", "Kosakata HSK 2: 他们 (tā men)"),
                        WordToken("见面", "jiàn miàn", "to meet; to see each other", "Kosakata HSK 2: 见面 (jiàn miàn)"),
                        WordToken("认识", "rèn shi", "to know / to recognize / to be familiar with / to get acquainted with sb", "Kosakata HSK 2: 认识 (rèn shi)"),
                        WordToken("认识", "rèn shi", "to know / to recognize / to be familiar with / to get acquainted with sb", "Kosakata HSK 2: 认识 (rèn shi)")
                    )
                ),
                Sentence(
                    id = "s_wtchmv_4",
                    hanzi = "我们就可以一起去看电影了。",
                    pinyin = "wǒ men jiù kě yǐ yī qǐ qù kàn diàn yǐng le",
                    translation = "Dengan begitu kami semua bisa beramai-ramai nonton bareng ke bioskop.",
                    tokens = listOf(
                        WordToken("我们", "wǒ men", "we; us; ourselves; our", "Kosakata HSK 2: 我们 (wǒ men)"),
                        WordToken("就", "jiù", "in that case; then", "Kosakata HSK 2: 就 (jiù)"),
                        WordToken("可以", "kě yǐ", "can / may / possible / able to", "Kosakata HSK 2: 可以 (kě yǐ)"),
                        WordToken("一起", "yī qǐ", "together; in company (with)", "Kosakata HSK 2: 一起 (yī qǐ)"),
                        WordToken("去", "qù", "to go, to go to", "Kosakata HSK 2: 去 (qù)"),
                        WordToken("看", "kàn", "to see; to look at / to read / to watch / to visit; to call on / to consider; to regard as / to look after / to treat (a patient or illness) / to depend on / to feel (that) / (after a verb) to give it a try / to watch out for", "Kosakata HSK 2: 看 (kàn)"),
                        WordToken("电影", "diàn yǐng", "movie; film", "Kosakata HSK 2: 电影 (diàn yǐng)"),
                        WordToken("了", "le", "(completed action marker) / (modal particle indicating change of state, situation now)", "Kosakata HSK 2: 了 (le)")
                    )
                ),
                Sentence(
                    id = "s_wtchmv_5",
                    hanzi = "我们想明天去商场的那个电影院，我去过一次，那儿还可以，就是不便宜。",
                    pinyin = "wǒ men xiǎng míng tiān qù shāng chǎng de nà gè diàn yǐng yuàn wǒ qù guo yī cì nà r hái kě yǐ jiù shì bù pián yi",
                    translation = "Rencananya besok kami akan pergi ke bioskop di dalam pusat perbelanjaan (mall); aku pernah ke sana sekali, fasilitasnya cukup nyaman walau harga tiketnya agak mahal.",
                    tokens = listOf(
                        WordToken("我们", "wǒ men", "we; us; ourselves; our", "Kosakata HSK 2: 我们 (wǒ men)"),
                        WordToken("想", "xiǎng", "to desire; to want (to)", "Kosakata HSK 2: 想 (xiǎng)"),
                        WordToken("明天", "míng tiān", "tomorrow", "Kosakata HSK 2: 明天 (míng tiān)"),
                        WordToken("去", "qù", "to go, to go to", "Kosakata HSK 2: 去 (qù)"),
                        WordToken("商场", "shāng chǎng", "shopping mall / shopping center / department store / emporium", "Kosakata HSK 2: 商场 (shāng chǎng)"),
                        WordToken("的", "de", "possessive particle (of; 's) / modifying particle (used after an attribute to modify a noun or to form a nominal expression)", "Kosakata HSK 2: 的 (de)"),
                        WordToken("那", "nà", "(specifier) that; the; those / (pronoun) that (referring to persons, things or situations)", "Kosakata HSK 2: 那 (nà)"),
                        WordToken("个", "gè", "classifier for people or objects in general", "Kosakata HSK 2: 个 (gè)"),
                        WordToken("电影院", "diàn yǐng yuàn", "cinema; movie theater", "Kosakata HSK 2: 电影院 (diàn yǐng yuàn)"),
                        WordToken("我", "wǒ", "I; me; my", "Kosakata HSK 2: 我 (wǒ)"),
                        WordToken("去", "qù", "to go, to go to", "Kosakata HSK 2: 去 (qù)"),
                        WordToken("过", "guo", "(experienced action marker)", "Kosakata HSK 2: 过 (guo)"),
                        WordToken("一", "yī", "one / single / a (article)", "Kosakata HSK 2: 一 (yī)"),
                        WordToken("次", "cì", "classifier for enumerated events: time", "Kosakata HSK 2: 次 (cì)"),
                        WordToken("那儿", "nà r", "there", "Kosakata HSK 2: 那儿 (nà r)"),
                        WordToken("还", "hái", "fairly, passably (good)", "Kosakata HSK 2: 还 (hái)"),
                        WordToken("可以", "kě yǐ", "not bad / pretty good", "Kosakata HSK 2: 可以 (kě yǐ)"),
                        WordToken("就是", "jiù shì", "exactly; precisely / only; simply; just / even; even if", "Kosakata HSK 2: 就是 (jiù shì)"),
                        WordToken("不", "bù", "no; not so", "Kosakata HSK 2: 不 (bù)"),
                        WordToken("便宜", "pián yi", "cheap; inexpensive", "Kosakata HSK 2: 便宜 (pián yi)")
                    )
                ),
                Sentence(
                    id = "s_wtchmv_6",
                    hanzi = "明天见！",
                    pinyin = "míng tiān jiàn",
                    translation = "Sampai jumpa besok di bioskop!",
                    tokens = listOf(
                        WordToken("明天", "míng tiān", "tomorrow", "Kosakata HSK 2: 明天 (míng tiān)"),
                        WordToken("见", "jiàn", "to see / to meet / to appear (to be sth) / to interview", "Kosakata HSK 2: 见 (jiàn)")
                    )
                )
            ),
            questions = listOf(
                StoryQuestion(
                    id = "q_wtchmv_1",
                    questionText = "作者萌生去电影院看电影的最初念头，是源自怎样的信息渠道与评价？ (Dari mana asal rasa penasaran narator untuk menonton film bioskop tersebut?)",
                    options = listOf("报纸上的批评差评报道 (Ulasan negatif di koran harian)", "从身边的朋友处听说上映了一部新上映且口碑极佳、很有意思的电影 (Mendengar kabar rekomendasi dari teman-teman bahwa ada film baru yang seru dan menarik)", "电影导演是自己的亲戚 (Sutradara film adalah kerabat keluarganya)", "为了去电影院避暑吹免费空调 (Hanya demi menumpang AC dingin gratis)"),
                    correctAnswerIndex = 1,
                    explanation = "Rekomendasi teman tentang serunya film baru yang tayang di bioskop memicu minat narator."
                ),
                StoryQuestion(
                    id = "q_wtchmv_2",
                    questionText = "在观影人员的邀约安排上，作者原本的二人世界构想发生了怎样有趣的演变？ (Bagaimana rencana menonton yang semula berdua berkembang menjadi acara kumpul bersama?)",
                    options = listOf("原本想请全班五十人看电影 (Awalnya ingin mentraktir seisi kelas)", "原本只想陪女朋友单独看，但一群好哥们也嚷着想去，便决定大团圆一起去 (Awalnya ingin berdua dengan pacar, tetapi sahabat-sahabatnya juga ingin ikut sehingga diputuskan nonton bareng)", "女朋友拒绝赴约，作者只能一个人看 (Pacar menolak datang sehingga ia terpaksa menonton sendirian)", "朋友们反对他交女朋友 (Teman-temannya menentang hubungannya)"),
                    correctAnswerIndex = 1,
                    explanation = "Keinginan teman-teman untuk ikut serta dimanfaatkan sebagai momen manis memperkenalkan pacar barunya."
                ),
                StoryQuestion(
                    id = "q_wtchmv_3",
                    questionText = "作者欣然促成“女朋友与铁哥们一同观影”这趟局的深层用心是什么？ (Maksud baik apa yang ingin dicapai narator dengan mengajak pacar dan sahabat-sahabatnya sekaligus?)",
                    options = listOf("让朋友们帮他平摊昂贵的女友爆米花费用 (Agar teman-temannya patungan membayar popcorn pacar)", "借此绝佳的轻松社交契机，让原本素未谋面的朋友们与女友正式见面结识 (Memanfaatkan momen santai bioskop agar sahabat-sahabatnya bisa saling mengenal akrab dengan sang kekasih)", "向大家炫耀自己的财富 (Pamer kekayaan kepada semua orang)", "测试谁才是真正的好朋友 (Menguji siapa teman sejati)"),
                    correctAnswerIndex = 1,
                    explanation = "Momen nonton film bersama menjadi wadah silaturahmi hangat memperluas lingkaran pertemanan."
                ),
                StoryQuestion(
                    id = "q_wtchmv_4",
                    questionText = "关于他们选定的大型商场影城，作者给出了怎样客观真实的消费体验评价？ (Bagaimana kesan objektif narator mengenai bioskop di dalam pusat perbelanjaan yang dipilih?)",
                    options = listOf("环境脏乱差、银幕模糊 (Kotor, kumuh, dan layarnya buram)", "硬件环境与观影体验确实还算不错，只是电影票价与零食略微偏贵 (Fasilitas dan layarnya cukup bagus dan nyaman, hanya saja harga tiketnya tergolong tidak murah)", "放映厅里到处都在漏雨 (Ruang bioskop bocor air hujan di mana-mana)", "所有电影场次全部免费开放 (Semua penayangan film digratiskan)"),
                    correctAnswerIndex = 1,
                    explanation = "Bioskop modern di mall menawarkan kenyamanan berkelas, walau tarif tiketnya agak menguras dompet."
                )
            )
        ),
        // Cerita Mandarin Bean 177 (HSK 2): Alarm Clock (Jam Beker yang Cerewet)
        Story(
            id = "story_alarm_clock",
            titleHanzi = "闹钟",
            titlePinyin = "Nàozhōng",
            titleTranslation = "Alarm Clock (Jam Beker yang Cerewet)",
            level = "HSK 2",
            category = "Kehidupan Sehari-hari",
            description = "Perjuangan klasik bangun pagi di hari Senin melawan bunyi jam beker yang tiada henti berdering.",
            coverEmoji = "⏰",
            coverImageRes = R.drawable.cover_story_alarm_clock,
            estimatedReadMinutes = 2,
            sentences = listOf(
                Sentence(
                    id = "s_almclk_1",
                    hanzi = "明天早上八点要开会，不能迟到。",
                    pinyin = "míng tiān zǎo shang bā diǎn yào kāi huì bù néng chí dào",
                    translation = "Besok pagi pukul delapan tepat ada rapat kantor yang sangat penting, aku sama sekali tidak boleh terlambat.",
                    tokens = listOf(
                        WordToken("明天", "míng tiān", "tomorrow", "Kosakata HSK 2: 明天 (míng tiān)"),
                        WordToken("早上", "zǎo shang", "early morning", "Kosakata HSK 2: 早上 (zǎo shang)"),
                        WordToken("八", "bā", "eight", "Kosakata HSK 2: 八 (bā)"),
                        WordToken("点", "diǎn", "point; dot; spot; speck / dot stroke in Chinese characters / (math.) decimal point / point in time or space / (after a number) o'clock", "Kosakata HSK 2: 点 (diǎn)"),
                        WordToken("要", "yào", "will; shall; about to / need to; should / if", "Kosakata HSK 2: 要 (yào)"),
                        WordToken("开会", "kāi huì", "to hold a meeting / to attend a meeting", "Kosakata HSK 2: 开会 (kāi huì)"),
                        WordToken("不", "bù", "no; not so", "Kosakata HSK 2: 不 (bù)"),
                        WordToken("能", "néng", "can / to be able to / might possibly", "Kosakata HSK 2: 能 (néng)"),
                        WordToken("迟到", "chí dào", "to arrive late", "Kosakata HSK 2: 迟到 (chí dào)")
                    )
                ),
                Sentence(
                    id = "s_almclk_2",
                    hanzi = "我买了一个小闹钟叫我起床。",
                    pinyin = "wǒ mǎi le yī gè xiǎo nào zhōng jiào wǒ qǐ chuáng",
                    translation = "Oleh karena itu aku sengaja membeli sebuah jam beker kecil untuk membangunkanku tepat waktu.",
                    tokens = listOf(
                        WordToken("我", "wǒ", "I; me; my", "Kosakata HSK 2: 我 (wǒ)"),
                        WordToken("买", "mǎi", "to buy / to purchase", "Kosakata HSK 2: 买 (mǎi)"),
                        WordToken("了", "le", "(completed action marker) / (modal particle indicating change of state, situation now)", "Kosakata HSK 2: 了 (le)"),
                        WordToken("一", "yī", "one / single / a (article)", "Kosakata HSK 2: 一 (yī)"),
                        WordToken("个", "gè", "classifier for people or objects in general", "Kosakata HSK 2: 个 (gè)"),
                        WordToken("小", "xiǎo", "small / tiny / few", "Kosakata HSK 2: 小 (xiǎo)"),
                        WordToken("闹钟", "nào zhōng", "alarm clock", "Kosakata HSK 2: 闹钟 (nào zhōng)"),
                        WordToken("叫", "jiào", "to call", "Kosakata HSK 2: 叫 (jiào)"),
                        WordToken("我", "wǒ", "I; me; my", "Kosakata HSK 2: 我 (wǒ)"),
                        WordToken("起床", "qǐ chuáng", "to get out of bed; to get up", "Kosakata HSK 2: 起床 (qǐ chuáng)")
                    )
                ),
                Sentence(
                    id = "s_almclk_3",
                    hanzi = "因为有它，这一晚我睡得很好。",
                    pinyin = "yīn wèi yǒu tā zhè yī wǎn wǒ shuì de hěn hǎo",
                    translation = "Karena merasa tenang ada jam beker andalan, malam itu aku tidur dengan sangat nyenyak tanpa rasa cemas.",
                    tokens = listOf(
                        WordToken("因为", "yīn wèi", "because; owing to; on account of", "Kosakata HSK 2: 因为 (yīn wèi)"),
                        WordToken("有", "yǒu", "to have; there is", "Kosakata HSK 2: 有 (yǒu)"),
                        WordToken("它", "tā", "it", "Kosakata HSK 2: 它 (tā)"),
                        WordToken("这", "zhè", "this; these", "Kosakata HSK 2: 这 (zhè)"),
                        WordToken("一", "yī", "entire; whole; all; throughout", "Kosakata HSK 2: 一 (yī)"),
                        WordToken("晚", "wǎn", "evening / night", "Kosakata HSK 2: 晚 (wǎn)"),
                        WordToken("我", "wǒ", "I; me; my", "Kosakata HSK 2: 我 (wǒ)"),
                        WordToken("睡", "shuì", "to sleep / to lie down", "Kosakata HSK 2: 睡 (shuì)"),
                        WordToken("得", "de", "structural particle: used after a verb (or adjective as main verb), linking it to following phrase indicating effect, degree, possibility etc", "Kosakata HSK 2: 得 (de)"),
                        WordToken("很", "hěn", "very; quite", "Kosakata HSK 2: 很 (hěn)"),
                        WordToken("好", "hǎo", "good / appropriate; proper", "Kosakata HSK 2: 好 (hǎo)")
                    )
                ),
                Sentence(
                    id = "s_almclk_4",
                    hanzi = "第二天早上，我起来的时候已经七点四十了，我发现闹钟没有响。",
                    pinyin = "dì èr tiān zǎo shang wǒ qǐ lái de shí hou yǐ jīng qī diǎn sì shí le wǒ fā xiàn nào zhōng méi yǒu xiǎng",
                    translation = "Keesokan paginya saat aku terbangun, jam di dinding sudah menunjukkan pukul 7.40, dan aku baru sadar jam beker itu sama sekali tidak berbunyi!",
                    tokens = listOf(
                        WordToken("第", "dì", "(prefix indicating ordinal number)", "Kosakata HSK 2: 第 (dì)"),
                        WordToken("二", "èr", "two / 2", "Kosakata HSK 2: 二 (èr)"),
                        WordToken("天", "tiān", "day", "Kosakata HSK 2: 天 (tiān)"),
                        WordToken("早上", "zǎo shang", "early morning", "Kosakata HSK 2: 早上 (zǎo shang)"),
                        WordToken("我", "wǒ", "I; me; my", "Kosakata HSK 2: 我 (wǒ)"),
                        WordToken("起来", "qǐ lái", "to stand up; to get up", "Kosakata HSK 2: 起来 (qǐ lái)"),
                        WordToken("的", "de", "possessive particle (of; 's) / modifying particle (used after an attribute to modify a noun or to form a nominal expression)", "Kosakata HSK 2: 的 (de)"),
                        WordToken("时候", "shí hou", "time / length of time / moment / period", "Kosakata HSK 2: 时候 (shí hou)"),
                        WordToken("已经", "yǐ jīng", "already", "Kosakata HSK 2: 已经 (yǐ jīng)"),
                        WordToken("七", "qī", "seven / 7", "Kosakata HSK 2: 七 (qī)"),
                        WordToken("点", "diǎn", "point; dot; spot; speck / dot stroke in Chinese characters / (math.) decimal point / point in time or space / (after a number) o'clock", "Kosakata HSK 2: 点 (diǎn)"),
                        WordToken("四", "sì", "four / 4", "Kosakata HSK 2: 四 (sì)"),
                        WordToken("十", "shí", "ten / 10", "Kosakata HSK 2: 十 (shí)"),
                        WordToken("了", "le", "(completed action marker) / (modal particle indicating change of state, situation now)", "Kosakata HSK 2: 了 (le)"),
                        WordToken("我", "wǒ", "I; me; my", "Kosakata HSK 2: 我 (wǒ)"),
                        WordToken("发现", "fā xiàn", "to notice; to become aware of / to discover; to find; to detect", "Kosakata HSK 2: 发现 (fā xiàn)"),
                        WordToken("闹钟", "nào zhōng", "alarm clock", "Kosakata HSK 2: 闹钟 (nào zhōng)"),
                        WordToken("没有", "méi yǒu", "haven't / hasn't", "Kosakata HSK 2: 没有 (méi yǒu)"),
                        WordToken("响", "xiǎng", "to make a sound / to sound / to ring", "Kosakata HSK 2: 响 (xiǎng)")
                    )
                ),
                Sentence(
                    id = "s_almclk_5",
                    hanzi = "我到公司最快也要四十分钟，最后还是迟到了。",
                    pinyin = "wǒ dào gōng sī zuì kuài yě yào sì shí fēn zhōng zuì hòu hái shì chí dào le",
                    translation = "Perjalanan ke kantor paling cepat memakan waktu 40 menit, sehingga pada akhirnya aku tetap saja datang terlambat ke rapat.",
                    tokens = listOf(
                        WordToken("我", "wǒ", "I; me; my", "Kosakata HSK 2: 我 (wǒ)"),
                        WordToken("到", "dào", "to reach; to arrive / to (a place); until (a time); up to (a point) / (verb complement indicating arriving at a place or reaching a point)", "Kosakata HSK 2: 到 (dào)"),
                        WordToken("公司", "gōng sī", "company; firm; corporation", "Kosakata HSK 2: 公司 (gōng sī)"),
                        WordToken("最", "zuì", "(before an adjective or verb) to the highest degree; (the) most ...; -est", "Kosakata HSK 2: 最 (zuì)"),
                        WordToken("快", "kuài", "rapid / quick", "Kosakata HSK 2: 快 (kuài)"),
                        WordToken("也", "yě", "even (extreme or unexpected case)", "Kosakata HSK 2: 也 (yě)"),
                        WordToken("要", "yào", "to want; to need; to ask for", "Kosakata HSK 2: 要 (yào)"),
                        WordToken("四", "sì", "four / 4", "Kosakata HSK 2: 四 (sì)"),
                        WordToken("十", "shí", "ten / 10", "Kosakata HSK 2: 十 (shí)"),
                        WordToken("分钟", "fēn zhōng", "minute", "Kosakata HSK 2: 分钟 (fēn zhōng)"),
                        WordToken("最后", "zuì hòu", "finally; in the end", "Kosakata HSK 2: 最后 (zuì hòu)"),
                        WordToken("还", "hái", "still, still in progress, yet", "Kosakata HSK 2: 还 (hái)"),
                        WordToken("是", "shì", "indeed (used for emphasis)", "Kosakata HSK 2: 是 (shì)"),
                        WordToken("迟到", "chí dào", "to arrive late", "Kosakata HSK 2: 迟到 (chí dào)"),
                        WordToken("了", "le", "(completed action marker) / (modal particle indicating change of state, situation now)", "Kosakata HSK 2: 了 (le)")
                    )
                ),
                Sentence(
                    id = "s_almclk_6",
                    hanzi = "下班以后，刚到家，闹钟就响了，“时间到了，时间到了。”",
                    pinyin = "xià bān yǐ hòu gāng dào jiā nào zhōng jiù xiǎng le shí jiān dào le shí jiān dào le",
                    translation = "Sore harinya sepulang kerja, baru saja aku melangkah masuk ke rumah, mendadak jam beker itu berdering nyaring: “Waktunya bangun! Waktunya bangun!”",
                    tokens = listOf(
                        WordToken("下班", "xià bān", "to finish work; to get off work", "Kosakata HSK 2: 下班 (xià bān)"),
                        WordToken("以后", "yǐ hòu", "after / later / afterwards / following / later on / in the future", "Kosakata HSK 2: 以后 (yǐ hòu)"),
                        WordToken("刚", "gāng", "just / barely / exactly", "Kosakata HSK 2: 刚 (gāng)"),
                        WordToken("到", "dào", "to reach; to arrive / to (a place); until (a time); up to (a point) / (verb complement indicating arriving at a place or reaching a point)", "Kosakata HSK 2: 到 (dào)"),
                        WordToken("家", "jiā", "home / family / (polite) my (sister, uncle etc)", "Kosakata HSK 2: 家 (jiā)"),
                        WordToken("闹钟", "nào zhōng", "alarm clock", "Kosakata HSK 2: 闹钟 (nào zhōng)"),
                        WordToken("就", "jiù", "as soon as; immediately after", "Kosakata HSK 2: 就 (jiù)"),
                        WordToken("响", "xiǎng", "to make a sound / to sound / to ring", "Kosakata HSK 2: 响 (xiǎng)"),
                        WordToken("了", "le", "(completed action marker) / (modal particle indicating change of state, situation now)", "Kosakata HSK 2: 了 (le)"),
                        WordToken("时间", "shí jiān", "time", "Kosakata HSK 2: 时间 (shí jiān)"),
                        WordToken("到", "dào", "to reach; to arrive / to (a place); until (a time); up to (a point) / (verb complement indicating arriving at a place or reaching a point)", "Kosakata HSK 2: 到 (dào)"),
                        WordToken("了", "le", "(completed action marker) / (modal particle indicating change of state, situation now)", "Kosakata HSK 2: 了 (le)"),
                        WordToken("时间", "shí jiān", "time", "Kosakata HSK 2: 时间 (shí jiān)"),
                        WordToken("到", "dào", "to reach; to arrive / to (a place); until (a time); up to (a point) / (verb complement indicating arriving at a place or reaching a point)", "Kosakata HSK 2: 到 (dào)"),
                        WordToken("了", "le", "(completed action marker) / (modal particle indicating change of state, situation now)", "Kosakata HSK 2: 了 (le)")
                    )
                ),
                Sentence(
                    id = "s_almclk_7",
                    hanzi = "我看表，正好六点，原来我把时间定在了下午六点。",
                    pinyin = "wǒ kàn biǎo zhèng hǎo liù diǎn yuán lái wǒ bǎ shí jiān dìng zài le xià wǔ liù diǎn",
                    translation = "Kulihat jarum jam, tepat pukul enam petang; rupanya semalam aku keliru menyetel alarm untuk pukul enam sore bukannya enam pagi!",
                    tokens = listOf(
                        WordToken("我", "wǒ", "I; me; my", "Kosakata HSK 2: 我 (wǒ)"),
                        WordToken("看", "kàn", "to see; to look at / to read / to watch / to visit; to call on / to consider; to regard as / to look after / to treat (a patient or illness) / to depend on / to feel (that) / (after a verb) to give it a try / to watch out for", "Kosakata HSK 2: 看 (kàn)"),
                        WordToken("表", "biǎo", "watch (timepiece) / meter; gauge", "Kosakata HSK 2: 表 (biǎo)"),
                        WordToken("正好", "zhèng hǎo", "just (in time)", "Kosakata HSK 2: 正好 (zhèng hǎo)"),
                        WordToken("六", "liù", "six / 6", "Kosakata HSK 2: 六 (liù)"),
                        WordToken("点", "diǎn", "point; dot; spot; speck / dot stroke in Chinese characters / (math.) decimal point / point in time or space / (after a number) o'clock", "Kosakata HSK 2: 点 (diǎn)"),
                        WordToken("原来", "yuán lái", "so, actually, as it turns out", "Kosakata HSK 2: 原来 (yuán lái)"),
                        WordToken("我", "wǒ", "I; me; my", "Kosakata HSK 2: 我 (wǒ)"),
                        WordToken("把", "bǎ", "(used to put the object before the verb: 把[ba3] + {noun} + {verb})", "Kosakata HSK 2: 把 (bǎ)"),
                        WordToken("时间", "shí jiān", "time", "Kosakata HSK 2: 时间 (shí jiān)"),
                        WordToken("定", "dìng", "to fix; to set; to make definite / to subscribe to; to book; to order / to congeal; to coagulate", "Kosakata HSK 2: 定 (dìng)"),
                        WordToken("在", "zài", "(of sb or sth) to be (located) at", "Kosakata HSK 2: 在 (zài)"),
                        WordToken("了", "le", "(completed action marker) / (modal particle indicating change of state, situation now)", "Kosakata HSK 2: 了 (le)"),
                        WordToken("下午", "xià wǔ", "afternoon / p.m.", "Kosakata HSK 2: 下午 (xià wǔ)"),
                        WordToken("六", "liù", "six / 6", "Kosakata HSK 2: 六 (liù)"),
                        WordToken("点", "diǎn", "point; dot; spot; speck / dot stroke in Chinese characters / (math.) decimal point / point in time or space / (after a number) o'clock", "Kosakata HSK 2: 点 (diǎn)")
                    )
                )
            ),
            questions = listOf(
                StoryQuestion(
                    id = "q_almclk_1",
                    questionText = "主人公为了确保第二天早上八点的重要会议绝不迟到，提前做出了什么防范准备？ (Persiapan apa yang dilakukan narator agar tidak terlambat menghadiri rapat pukul 8 pagi?)",
                    options = listOf("拜托邻居七点钟来砸门叫醒他 (Meminta tolong tetangga mendobrak pintu membangunkannya jam 7)", "特意花钱买了一个小巧灵敏的新闹钟来负责早晨叫醒 (Sengaja membeli sebuah jam beker kecil baru untuk membangunkannya tepat waktu)", "决定一整晚不闭眼通宵熬夜 (Memutuskan begadang semalaman tanpa tidur)", "直接睡在公司的会议室地板上 (Tidur langsung di lantai ruang rapat kantor)"),
                    correctAnswerIndex = 1,
                    explanation = "Sebuah jam beker baru dibeli secara khusus untuk menjamin ia bangun tepat waktu menjelang rapat penting."
                ),
                StoryQuestion(
                    id = "q_almclk_2",
                    questionText = "有了新闹钟护航的主人公，在开会前夜体验到了怎样的睡眠状态？ (Bagaimana kualitas tidur narator di malam sebelum rapat setelah memiliki jam beker baru?)",
                    options = listOf("噩梦连连，一整晚都在失眠翻滚 (Mimpi buruk dan insomnia gelisah sepanjang malam)", "心里倍感踏实安心，这辈子难得睡得如此香甜深沉 (Merasa sangat tenang dan bebas cemas, sehingga tidur nyenyak sepanjang malam)", "中途醒来了二十多次 (Terbangun lebih dari dua puluh kali)", "被闹钟每隔十分钟吵醒一次 (Diteror bunyi alarm setiap sepuluh menit)"),
                    correctAnswerIndex = 1,
                    explanation = "Rasa percaya penuh pada jam beker baru membuatnya tidur lelap dengan rasa aman yang semu."
                ),
                StoryQuestion(
                    id = "q_almclk_3",
                    questionText = "第二天早晨发生的事情，如何以残酷的现实将主人公的如意算盘彻底粉碎？ (Kejadian mengejutkan apa yang terjadi keesokan paginya yang memupuskan harapannya?)",
                    options = listOf("公司大楼被暴风雨吹倒了 (Gedung kantor roboh tersapu badai)", "自己自然醒时已然是早上7点40分，新买的闹钟竟然全程哑火没有发出任何声响！ (Saat ia terbangun waktu sudah menunjukkan pukul 07.40 pagi, dan jam beker baru itu sama sekali tidak berbunyi!)", "闹钟爆炸把床头柜炸坏了 (Jam beker meledak menghancurkan meja tidur)", "会议通知推迟到了下周 (Pemberitahuan rapat diundur ke minggu depan)"),
                    correctAnswerIndex = 1,
                    explanation = "Jam beker tidak berbunyi sama sekali, dan ia baru terbangun saat waktu tersisa 20 menit menuju jam 8!"
                ),
                StoryQuestion(
                    id = "q_almclk_4",
                    questionText = "傍晚下班刚进家门闹钟却突然疯狂大叫，这背后的荒唐乌龙原因究竟是什么？ (Penyebab konyol apa yang terungkap saat jam beker mendadak berdering nyaring di petang hari?)",
                    options = listOf("闹钟电池装反了 (Baterai jam beker dipasang terbalik)", "作者昨晚粗心大意，把原本早晨六点（6:00 AM）的闹铃错误定在了下午六点（6:00 PM）！ (Narator teledor menyetel alarm untuk pukul 6 petang/sore bukannya pukul 6 pagi!)", "小偷潜入家里偷偷修改了闹钟时间 (Pencuri masuk ke rumah dan mengubah setelan alarm)", "闹钟在嘲笑主人迟到被罚款 (Jam beker mengejek majikannya yang terkena denda terlambat)"),
                    correctAnswerIndex = 1,
                    explanation = "Puncak kelakar teledor: salah membedakan waktu AM dan PM membuat alarm berdering tepat saat ia baru pulang kerja sore hari!"
                )
            )
        ),
        // Cerita Mandarin Bean 178 (HSK 2): Travel to China (Berwisata ke Tiongkok)
        Story(
            id = "story_travel_to_china",
            titleHanzi = "去中国旅游",
            titlePinyin = "Qù Zhōngguó Lǚyóu",
            titleTranslation = "Travel to China (Berwisata ke Tiongkok)",
            level = "HSK 2",
            category = "Pariwisata & Petualangan",
            description = "Rencana perjalanan wisata mengagumi keindahan panorama alam Guilin dan kemegahan Tembok Besar Tiongkok.",
            coverEmoji = "🌄",
            coverImageRes = R.drawable.cover_story_travel_to_china,
            estimatedReadMinutes = 2,
            sentences = listOf(
                Sentence(
                    id = "s_trvlch_1",
                    hanzi = "你想去中国旅游吗？",
                    pinyin = "nǐ xiǎng qù Zhōng guó lǚ yóu ma",
                    translation = "Apakah Anda berminat untuk berlibur menjelajahi Tiongkok?",
                    tokens = listOf(
                        WordToken("你", "nǐ", "you", "Kosakata HSK 2: 你 (nǐ)"),
                        WordToken("想", "xiǎng", "to desire; to want (to)", "Kosakata HSK 2: 想 (xiǎng)"),
                        WordToken("去", "qù", "to go, to go to", "Kosakata HSK 2: 去 (qù)"),
                        WordToken("中国", "Zhōng guó", "China", "Kosakata HSK 2: 中国 (Zhōng guó)"),
                        WordToken("旅游", "lǚ yóu", "to travel", "Kosakata HSK 2: 旅游 (lǚ yóu)"),
                        WordToken("吗", "ma", "(question particle for \"yes-no\" questions)", "Kosakata HSK 2: 吗 (ma)")
                    )
                ),
                Sentence(
                    id = "s_trvlch_2",
                    hanzi = "你觉得什么时候去最好？",
                    pinyin = "nǐ jué de shén me shí hou qù zuì hǎo",
                    translation = "Menurut Anda, kapankah waktu musim terbaik untuk berkunjung ke sana?",
                    tokens = listOf(
                        WordToken("你", "nǐ", "you", "Kosakata HSK 2: 你 (nǐ)"),
                        WordToken("觉得", "jué de", "to think that ...; to feel that ...", "Kosakata HSK 2: 觉得 (jué de)"),
                        WordToken("什么", "shén me", "what?", "Kosakata HSK 2: 什么 (shén me)"),
                        WordToken("时候", "shí hou", "time / length of time / moment / period", "Kosakata HSK 2: 时候 (shí hou)"),
                        WordToken("去", "qù", "to go, to go to", "Kosakata HSK 2: 去 (qù)"),
                        WordToken("最", "zuì", "(before an adjective or verb) to the highest degree; (the) most ...; -est", "Kosakata HSK 2: 最 (zuì)"),
                        WordToken("好", "hǎo", "good / appropriate; proper", "Kosakata HSK 2: 好 (hǎo)")
                    )
                ),
                Sentence(
                    id = "s_trvlch_3",
                    hanzi = "这个问题有点儿难。",
                    pinyin = "zhè ge wèn tí yǒu diǎn r nán",
                    translation = "Pertanyaan ini sejatinya cukup sulit untuk dijawab secara pasti.",
                    tokens = listOf(
                        WordToken("这个", "zhè ge", "(pronoun) this / (adjective) this", "Kosakata HSK 2: 这个 (zhè ge)"),
                        WordToken("问题", "wèn tí", "question / problem / issue / topic", "Kosakata HSK 2: 问题 (wèn tí)"),
                        WordToken("有点儿", "yǒu diǎn r", "slightly / a little / somewhat", "Kosakata HSK 2: 有点儿 (yǒu diǎn r)"),
                        WordToken("难", "nán", "difficult (to...) / difficult", "Kosakata HSK 2: 难 (nán)")
                    )
                ),
                Sentence(
                    id = "s_trvlch_4",
                    hanzi = "因为一年四季都是最好的时间。",
                    pinyin = "yīn wèi yī nián sì jì dōu shì zuì hǎo de shí jiān",
                    translation = "Sebab sepanjang empat musim dalam setahun, masing-masing selalu menawarkan pesona keindahan terbaiknya.",
                    tokens = listOf(
                        WordToken("因为", "yīn wèi", "because; owing to; on account of", "Kosakata HSK 2: 因为 (yīn wèi)"),
                        WordToken("一", "yī", "entire; whole; all; throughout", "Kosakata HSK 2: 一 (yī)"),
                        WordToken("年", "nián", "year", "Kosakata HSK 2: 年 (nián)"),
                        WordToken("四", "sì", "four / 4", "Kosakata HSK 2: 四 (sì)"),
                        WordToken("季", "jì", "season / the last month of a season / fourth or youngest amongst brothers", "Kosakata HSK 2: 季 (jì)"),
                        WordToken("都", "dōu", "all; both; entirely", "Kosakata HSK 2: 都 (dōu)"),
                        WordToken("是", "shì", "to be (followed by substantives only)", "Kosakata HSK 2: 是 (shì)"),
                        WordToken("最", "zuì", "(before an adjective or verb) to the highest degree; (the) most ...; -est", "Kosakata HSK 2: 最 (zuì)"),
                        WordToken("好", "hǎo", "good / appropriate; proper", "Kosakata HSK 2: 好 (hǎo)"),
                        WordToken("的", "de", "possessive particle (of; 's) / modifying particle (used after an attribute to modify a noun or to form a nominal expression)", "Kosakata HSK 2: 的 (de)"),
                        WordToken("时间", "shí jiān", "time", "Kosakata HSK 2: 时间 (shí jiān)")
                    )
                ),
                Sentence(
                    id = "s_trvlch_5",
                    hanzi = "春天，你可以去浙江、云南，那儿有很多花，也有很美的水。",
                    pinyin = "chūn tiān nǐ kě yǐ qù Zhè jiāng Yún nán nà r yǒu hěn duō huā yě yǒu hěn měi de shuǐ",
                    translation = "Di musim semi, Anda dapat mengunjungi Zhejiang dan Yunnan, di mana bunga-bunga bermekaran indah bersanding dengan panorama telaga air yang jernih.",
                    tokens = listOf(
                        WordToken("春天", "chūn tiān", "spring (season)", "Kosakata HSK 2: 春天 (chūn tiān)"),
                        WordToken("你", "nǐ", "you", "Kosakata HSK 2: 你 (nǐ)"),
                        WordToken("可以", "kě yǐ", "can / may / possible / able to", "Kosakata HSK 2: 可以 (kě yǐ)"),
                        WordToken("去", "qù", "to go, to go to", "Kosakata HSK 2: 去 (qù)"),
                        WordToken("浙江", "Zhè jiāng", "Zhejiang Province in eastern China.", "Kosakata HSK 2: 浙江 (Zhè jiāng)"),
                        WordToken("云南", "Yún nán", "Yunnan Province, a province in southwest China", "Kosakata HSK 2: 云南 (Yún nán)"),
                        WordToken("那儿", "nà r", "there", "Kosakata HSK 2: 那儿 (nà r)"),
                        WordToken("有", "yǒu", "to have; there is", "Kosakata HSK 2: 有 (yǒu)"),
                        WordToken("很多", "hěn duō", "many; a lot of", "Kosakata HSK 2: 很多 (hěn duō)"),
                        WordToken("花", "huā", "flower / blossom / fancy pattern", "Kosakata HSK 2: 花 (huā)"),
                        WordToken("也", "yě", "also; too; as well; (not ...) either", "Kosakata HSK 2: 也 (yě)"),
                        WordToken("有", "yǒu", "to have; there is", "Kosakata HSK 2: 有 (yǒu)"),
                        WordToken("很", "hěn", "very; quite", "Kosakata HSK 2: 很 (hěn)"),
                        WordToken("美", "měi", "beautiful / very satisfactory; good", "Kosakata HSK 2: 美 (měi)"),
                        WordToken("的", "de", "possessive particle (of; 's) / modifying particle (used after an attribute to modify a noun or to form a nominal expression)", "Kosakata HSK 2: 的 (de)"),
                        WordToken("水", "shuǐ", "water / (after a name) ... River / (bound form) additional cost; extra income", "Kosakata HSK 2: 水 (shuǐ)")
                    )
                ),
                Sentence(
                    id = "s_trvlch_6",
                    hanzi = "夏天，你可以去西藏、内蒙古，那儿有雪山和草地。",
                    pinyin = "xià tiān nǐ kě yǐ qù Xī zàng Nèi Měng gǔ nà r yǒu xuě shān hé cǎo dì",
                    translation = "Di musim panas, Anda dapat menjelajahi Tibet dan padang rumput Mongolia Dalam, menikmati padang rumput hijau berlatar puncak gunung salju abadi.",
                    tokens = listOf(
                        WordToken("夏天", "xià tiān", "summer", "Kosakata HSK 2: 夏天 (xià tiān)"),
                        WordToken("你", "nǐ", "you", "Kosakata HSK 2: 你 (nǐ)"),
                        WordToken("可以", "kě yǐ", "can / may / possible / able to", "Kosakata HSK 2: 可以 (kě yǐ)"),
                        WordToken("去", "qù", "to go, to go to", "Kosakata HSK 2: 去 (qù)"),
                        WordToken("西藏", "Xī zàng", "Tibet; an autonomous region in southwest China.", "Kosakata HSK 2: 西藏 (Xī zàng)"),
                        WordToken("内蒙古", "Nèi Měng gǔ", "Inner Mongolia; an autonomous region in northern China.", "Kosakata HSK 2: 内蒙古 (Nèi Měng gǔ)"),
                        WordToken("那儿", "nà r", "there", "Kosakata HSK 2: 那儿 (nà r)"),
                        WordToken("有", "yǒu", "to have; there is", "Kosakata HSK 2: 有 (yǒu)"),
                        WordToken("雪山", "xuě shān", "snow-capped mountain", "Kosakata HSK 2: 雪山 (xuě shān)"),
                        WordToken("和", "hé", "and; together with", "Kosakata HSK 2: 和 (hé)"),
                        WordToken("草地", "cǎo dì", "lawn / meadow / sod / turf", "Kosakata HSK 2: 草地 (cǎo dì)")
                    )
                ),
                Sentence(
                    id = "s_trvlch_7",
                    hanzi = "秋天，你可以去新疆、北京，天气不冷也不热，北方的秋天非常美。",
                    pinyin = "qiū tiān nǐ kě yǐ qù Xīn jiāng Běi jīng tiān qì bù lěng yě bù rè běi fāng de qiū tiān fēi cháng měi",
                    translation = "Di musim gugur, Anda dapat menyambangi Xinjiang dan Beijing; cuacanya sejuk nyaman tidak panas dan tidak dingin, dengan lanskap daun emas utara yang memukau.",
                    tokens = listOf(
                        WordToken("秋天", "qiū tiān", "autumn", "Kosakata HSK 2: 秋天 (qiū tiān)"),
                        WordToken("你", "nǐ", "you", "Kosakata HSK 2: 你 (nǐ)"),
                        WordToken("可以", "kě yǐ", "can / may / possible / able to", "Kosakata HSK 2: 可以 (kě yǐ)"),
                        WordToken("去", "qù", "to go, to go to", "Kosakata HSK 2: 去 (qù)"),
                        WordToken("新疆", "Xīn jiāng", "Xinjiang Uyghur Autonomous Region in northwest China; Xinjiang.", "Kosakata HSK 2: 新疆 (Xīn jiāng)"),
                        WordToken("北京", "Běi jīng", "Beijing municipality, capital of the People's Republic of China", "Kosakata HSK 2: 北京 (Běi jīng)"),
                        WordToken("天气", "tiān qì", "weather", "Kosakata HSK 2: 天气 (tiān qì)"),
                        WordToken("不", "bù", "no; not so", "Kosakata HSK 2: 不 (bù)"),
                        WordToken("冷", "lěng", "cold", "Kosakata HSK 2: 冷 (lěng)"),
                        WordToken("也", "yě", "also; too; as well; (not ...) either", "Kosakata HSK 2: 也 (yě)"),
                        WordToken("不", "bù", "no; not so", "Kosakata HSK 2: 不 (bù)"),
                        WordToken("热", "rè", "hot (of weather)", "Kosakata HSK 2: 热 (rè)"),
                        WordToken("北方", "běi fāng", "north / the northern part a country / China north of the Yellow River", "Kosakata HSK 2: 北方 (běi fāng)"),
                        WordToken("的", "de", "possessive particle (of; 's) / modifying particle (used after an attribute to modify a noun or to form a nominal expression)", "Kosakata HSK 2: 的 (de)"),
                        WordToken("秋天", "qiū tiān", "autumn", "Kosakata HSK 2: 秋天 (qiū tiān)"),
                        WordToken("非常", "fēi cháng", "very; really", "Kosakata HSK 2: 非常 (fēi cháng)"),
                        WordToken("美", "měi", "beautiful / very satisfactory; good", "Kosakata HSK 2: 美 (měi)")
                    )
                ),
                Sentence(
                    id = "s_trvlch_8",
                    hanzi = "冬天，如果你不喜欢很冷的天气，你可以去海南游泳；如果你喜欢雪，你可以去东北，那是雪的天堂。",
                    pinyin = "dōng tiān rú guǒ nǐ bù xǐ huan hěn lěng de tiān qì nǐ kě yǐ qù Hǎi nán yóu yǒng rú guǒ nǐ xǐ huan xuě nǐ kě yǐ qù Dōng běi nà shì xuě de tiān táng",
                    translation = "Di musim dingin, jika Anda menghindari hawa dingin membeku Anda dapat berenang di pantai tropis Hainan; namun jika Anda menyukai salju, wilayah Timur Laut (Dongbei) adalah surga salju sejati.",
                    tokens = listOf(
                        WordToken("冬天", "dōng tiān", "winter", "Kosakata HSK 2: 冬天 (dōng tiān)"),
                        WordToken("如果", "rú guǒ", "if; in case; in the event that", "Kosakata HSK 2: 如果 (rú guǒ)"),
                        WordToken("你", "nǐ", "you", "Kosakata HSK 2: 你 (nǐ)"),
                        WordToken("不", "bù", "no; not so", "Kosakata HSK 2: 不 (bù)"),
                        WordToken("喜欢", "xǐ huan", "to like; to be fond of", "Kosakata HSK 2: 喜欢 (xǐ huan)"),
                        WordToken("很", "hěn", "very; quite", "Kosakata HSK 2: 很 (hěn)"),
                        WordToken("冷", "lěng", "cold", "Kosakata HSK 2: 冷 (lěng)"),
                        WordToken("的", "de", "possessive particle (of; 's) / modifying particle (used after an attribute to modify a noun or to form a nominal expression)", "Kosakata HSK 2: 的 (de)"),
                        WordToken("天气", "tiān qì", "weather", "Kosakata HSK 2: 天气 (tiān qì)"),
                        WordToken("你", "nǐ", "you", "Kosakata HSK 2: 你 (nǐ)"),
                        WordToken("可以", "kě yǐ", "can / may / possible / able to", "Kosakata HSK 2: 可以 (kě yǐ)"),
                        WordToken("去", "qù", "to go, to go to", "Kosakata HSK 2: 去 (qù)"),
                        WordToken("海南", "Hǎi nán", "Hainan; an island province of southern China.", "Kosakata HSK 2: 海南 (Hǎi nán)"),
                        WordToken("游泳", "yóu yǒng", "to swim", "Kosakata HSK 2: 游泳 (yóu yǒng)"),
                        WordToken("如果", "rú guǒ", "if; in case; in the event that", "Kosakata HSK 2: 如果 (rú guǒ)"),
                        WordToken("你", "nǐ", "you", "Kosakata HSK 2: 你 (nǐ)"),
                        WordToken("喜欢", "xǐ huan", "to like; to be fond of", "Kosakata HSK 2: 喜欢 (xǐ huan)"),
                        WordToken("雪", "xuě", "snow", "Kosakata HSK 2: 雪 (xuě)"),
                        WordToken("你", "nǐ", "you", "Kosakata HSK 2: 你 (nǐ)"),
                        WordToken("可以", "kě yǐ", "can / may / possible / able to", "Kosakata HSK 2: 可以 (kě yǐ)"),
                        WordToken("去", "qù", "to go, to go to", "Kosakata HSK 2: 去 (qù)"),
                        WordToken("东北", "Dōng běi", "Northeast China; Manchuria", "Kosakata HSK 2: 东北 (Dōng běi)"),
                        WordToken("那", "nà", "(specifier) that; the; those / (pronoun) that (referring to persons, things or situations)", "Kosakata HSK 2: 那 (nà)"),
                        WordToken("是", "shì", "to be (followed by substantives only)", "Kosakata HSK 2: 是 (shì)"),
                        WordToken("雪", "xuě", "snow", "Kosakata HSK 2: 雪 (xuě)"),
                        WordToken("的", "de", "possessive particle (of; 's) / modifying particle (used after an attribute to modify a noun or to form a nominal expression)", "Kosakata HSK 2: 的 (de)"),
                        WordToken("天堂", "tiān táng", "paradise / heaven", "Kosakata HSK 2: 天堂 (tiān táng)")
                    )
                ),
                Sentence(
                    id = "s_trvlch_9",
                    hanzi = "你最想去哪儿？",
                    pinyin = "nǐ zuì xiǎng qù nǎ r",
                    translation = "Destinasi manakah yang paling ingin Anda kunjungi?",
                    tokens = listOf(
                        WordToken("你", "nǐ", "you", "Kosakata HSK 2: 你 (nǐ)"),
                        WordToken("最", "zuì", "(before an adjective or verb) to the highest degree; (the) most ...; -est", "Kosakata HSK 2: 最 (zuì)"),
                        WordToken("想", "xiǎng", "to desire; to want (to)", "Kosakata HSK 2: 想 (xiǎng)"),
                        WordToken("去", "qù", "to go, to go to", "Kosakata HSK 2: 去 (qù)"),
                        WordToken("哪儿", "nǎ r", "where?", "Kosakata HSK 2: 哪儿 (nǎ r)")
                    )
                )
            ),
            questions = listOf(
                StoryQuestion(
                    id = "q_trvlch_1",
                    questionText = "面对外国游客关于“去中国旅游什么时间最好”的经典提问，文章开宗明义给出了什么结论？ (Kesimpulan apa yang disampaikan di awal bacaan mengenai waktu terbaik berlibur ke Tiongkok?)",
                    options = listOf("只有夏天才适合前往 (Hanya musim panas yang cocok)", "难以给出单一答案，因为中国幅员辽阔，一年四季的任何时候都是最佳的旅游时间 (Sukar dijawab dengan satu bulan saja, karena keempat musim dalam setahun selalu menawarkan waktu terbaik)", "全年任何时候都绝对不推荐旅游 (Sama sekali tidak disarankan berlibur kapan pun)", "只有大年三十那一天最好 (Hanya malam Tahun Baru Imlek yang terbaik)"),
                    correctAnswerIndex = 1,
                    explanation = "Keberagaman iklim dan geografis Tiongkok menjadikan setiap musim memiliki keunggulan panorama wisatanya sendiri."
                ),
                StoryQuestion(
                    id = "q_trvlch_2",
                    questionText = "在春暖花开的季节里，文章重点推荐游客前往江南的浙江与西南的云南去领略什么风光？ (Keindahan apa yang disarankan untuk dinikmati di Zhejiang dan Yunnan saat musim semi?)",
                    options = listOf("无边无际的荒凉沙漠戈壁 (Padang pasir gersang yang membentang)", "万紫千红的盛开繁花与碧波荡漾的秀美山水 (Pemandangan mekarnya aneka bunga musim semi bersanding dengan kejernihan telaga air)", "现代化的摩天大楼建筑群 (Deretan gedung pencakar langit modern)", "工业重镇的钢铁冶炼厂 (Pabrik peleburan baja industri berat)"),
                    correctAnswerIndex = 1,
                    explanation = "Musim semi di Yunnan dan Zhejiang terkenal dengan surga mekarnya bunga-bunga dan danau air yang elok."
                ),
                StoryQuestion(
                    id = "q_trvlch_3",
                    questionText = "如果是在秋高气爽的金色时节来到中国，推荐游历哪两座代表性的北方胜地？ (Dua destinasi unggulan utara mana yang direkomendasikan untuk dikunjungi pada musim gugur?)",
                    options = listOf("广州与深圳 (Guangzhou dan Shenzhen)", "辽阔的新疆与历史古都北京（气候宜人不冷不热，秋景壮美） (Wilayah Xinjiang yang megah dan kota Beijing dengan cuaca sejuk nyaman dan daun musim gugur keemasan)", "香港与澳门 (Hong Kong dan Makau)", "三亚的海滩 (Pantai pasir Sanya)"),
                    correctAnswerIndex = 1,
                    explanation = "Musim gugur di Beijing dan Xinjiang berhawa sejuk segar dengan panorama alam paling mempesona dalam kalender tahunan."
                ),
                StoryQuestion(
                    id = "q_trvlch_4",
                    questionText = "针对寒冷冬季的极端差异，文章给出了哪两种截然相反但各具极致魅力的度假体验路线？ (Dua alternatif wisata kontras apa yang ditawarkan selama musim dingin?)",
                    options = listOf("宅在酒店看电视与去网吧打游戏 (Diam di hotel menonton TV atau main game di warnet)", "怕冷者可南下海南海岛温暖游泳，喜雪者可北上东北尽享银装素裹的冰雪滑雪天堂 (Yang tak tahan dingin bisa berenang di pulau tropis Hainan, pecinta salju bisa ke Dongbei menikmati surga salju)", "去地下洞穴探险与去深海潜水 (Menjelajahi gua bawah tanah atau menyelam di palung laut)", "去大草原放羊与去黄土高坡挖土 (Menggembala domba di padang rumput atau menggali tanah)"),
                    correctAnswerIndex = 1,
                    explanation = "Tiongkok di musim dingin menawarkan dua dunia: hangatnya pantai tropis di selatan (Hainan) vs surga salju dan es di utara (Dongbei)."
                )
            )
        ),
        // Cerita Mandarin Bean 179 (HSK 2): New Boss (Bos Baru di Kantor)
        Story(
            id = "story_new_boss",
            titleHanzi = "新老板",
            titlePinyin = "Xīn Lǎobǎn",
            titleTranslation = "New Boss (Bos Baru di Kantor)",
            level = "HSK 2",
            category = "Dunia Kerja & Humor",
            description = "Kecanggungan hari pertama kehadiran manajer baru di kantor dan dinamika penyesuaian para staf karyawan.",
            coverEmoji = "💼",
            coverImageRes = R.drawable.cover_story_new_boss,
            estimatedReadMinutes = 2,
            sentences = listOf(
                Sentence(
                    id = "s_newbos_1",
                    hanzi = "我们公司来了一个新老板。",
                    pinyin = "wǒ men gōng sī lái le yī gè xīn lǎo bǎn",
                    translation = "Perusahaan kami baru saja kedatangan seorang pimpinan direktur (bos) yang baru.",
                    tokens = listOf(
                        WordToken("我们", "wǒ men", "we; us; ourselves; our", "Kosakata HSK 2: 我们 (wǒ men)"),
                        WordToken("公司", "gōng sī", "company; firm; corporation", "Kosakata HSK 2: 公司 (gōng sī)"),
                        WordToken("来", "lái", "to come", "Kosakata HSK 2: 来 (lái)"),
                        WordToken("了", "le", "(completed action marker) / (modal particle indicating change of state, situation now)", "Kosakata HSK 2: 了 (le)"),
                        WordToken("一", "yī", "one / single / a (article)", "Kosakata HSK 2: 一 (yī)"),
                        WordToken("个", "gè", "classifier for people or objects in general", "Kosakata HSK 2: 个 (gè)"),
                        WordToken("新", "xīn", "new; newly", "Kosakata HSK 2: 新 (xīn)"),
                        WordToken("老板", "lǎo bǎn", "boss / business proprietor", "Kosakata HSK 2: 老板 (lǎo bǎn)")
                    )
                ),
                Sentence(
                    id = "s_newbos_2",
                    hanzi = "大家听说他有很高的要求，但是不知道他第一天会做什么。",
                    pinyin = "dà jiā tīng shuō tā yǒu hěn gāo de yāo qiú dàn shì bù zhī dào tā dì yī tiān huì zuò shén me",
                    translation = "Semua karyawan mendengar desas-desus bahwa bos baru ini memiliki standar kedisiplinan yang sangat tinggi, namun belum tahu apa gebrakan pertamanya.",
                    tokens = listOf(
                        WordToken("大家", "dà jiā", "everyone", "Kosakata HSK 2: 大家 (dà jiā)"),
                        WordToken("听说", "tīng shuō", "to hear (sth said) / one hears (that)", "Kosakata HSK 2: 听说 (tīng shuō)"),
                        WordToken("他", "tā", "he; him; his", "Kosakata HSK 2: 他 (tā)"),
                        WordToken("有", "yǒu", "to have; there is", "Kosakata HSK 2: 有 (yǒu)"),
                        WordToken("很", "hěn", "very; quite", "Kosakata HSK 2: 很 (hěn)"),
                        WordToken("高", "gāo", "high / tall / above average / loud", "Kosakata HSK 2: 高 (gāo)"),
                        WordToken("的", "de", "possessive particle (of; 's) / modifying particle (used after an attribute to modify a noun or to form a nominal expression)", "Kosakata HSK 2: 的 (de)"),
                        WordToken("要求", "yāo qiú", "requirement", "Kosakata HSK 2: 要求 (yāo qiú)"),
                        WordToken("但是", "dàn shì", "but; however", "Kosakata HSK 2: 但是 (dàn shì)"),
                        WordToken("不", "bù", "no; not so", "Kosakata HSK 2: 不 (bù)"),
                        WordToken("知道", "zhī dào", "to know; to become aware of", "Kosakata HSK 2: 知道 (zhī dào)"),
                        WordToken("他", "tā", "he; him; his", "Kosakata HSK 2: 他 (tā)"),
                        WordToken("第", "dì", "(prefix indicating ordinal number)", "Kosakata HSK 2: 第 (dì)"),
                        WordToken("一", "yī", "one / single / a (article)", "Kosakata HSK 2: 一 (yī)"),
                        WordToken("天", "tiān", "day", "Kosakata HSK 2: 天 (tiān)"),
                        WordToken("会", "huì", "to be likely to; to be sure to", "Kosakata HSK 2: 会 (huì)"),
                        WordToken("做", "zuò", "to do; to engage in; to hold (a party etc)", "Kosakata HSK 2: 做 (zuò)"),
                        WordToken("什么", "shén me", "what?", "Kosakata HSK 2: 什么 (shén me)")
                    )
                ),
                Sentence(
                    id = "s_newbos_3",
                    hanzi = "他第一次来办公室的时候，看到大家桌子上有很多东西，他非常不高兴地说：“我希望你的思想不要和这儿的桌子一样。”",
                    pinyin = "tā dì yī cì lái bàn gōng shì de shí hou kàn dào dà jiā zhuō zi shàng yǒu hěn duō dōng xi tā fēi cháng bù gāo xìng de shuō wǒ xī wàng nǐ de sī xiǎng bù yào hé zhè r de zhuō zi yī yàng",
                    translation = "Ketika pertama kali berkeliling meninjau ruang kerja, ia melihat meja para staf berserakan banyak berkas, lalu berujar dingin: “Saya harap pikiran kerja kalian tidak semrawut seperti meja ini.”",
                    tokens = listOf(
                        WordToken("他", "tā", "he; him; his", "Kosakata HSK 2: 他 (tā)"),
                        WordToken("第", "dì", "(prefix indicating ordinal number)", "Kosakata HSK 2: 第 (dì)"),
                        WordToken("一", "yī", "one / single / a (article)", "Kosakata HSK 2: 一 (yī)"),
                        WordToken("次", "cì", "classifier for enumerated events: time", "Kosakata HSK 2: 次 (cì)"),
                        WordToken("来", "lái", "to come", "Kosakata HSK 2: 来 (lái)"),
                        WordToken("办公室", "bàn gōng shì", "office; business premises", "Kosakata HSK 2: 办公室 (bàn gōng shì)"),
                        WordToken("的", "de", "possessive particle (of; 's) / modifying particle (used after an attribute to modify a noun or to form a nominal expression)", "Kosakata HSK 2: 的 (de)"),
                        WordToken("时候", "shí hou", "time / length of time / moment / period", "Kosakata HSK 2: 时候 (shí hou)"),
                        WordToken("看到", "kàn dào", "to see", "Kosakata HSK 2: 看到 (kàn dào)"),
                        WordToken("大家", "dà jiā", "everyone", "Kosakata HSK 2: 大家 (dà jiā)"),
                        WordToken("桌子", "zhuō zi", "table / desk", "Kosakata HSK 2: 桌子 (zhuō zi)"),
                        WordToken("上", "shàng", "(noun suffix) on; above", "Kosakata HSK 2: 上 (shàng)"),
                        WordToken("有", "yǒu", "to have; there is", "Kosakata HSK 2: 有 (yǒu)"),
                        WordToken("很多", "hěn duō", "many; a lot of", "Kosakata HSK 2: 很多 (hěn duō)"),
                        WordToken("东西", "dōng xi", "thing / stuff / person", "Kosakata HSK 2: 东西 (dōng xi)"),
                        WordToken("他", "tā", "he; him; his", "Kosakata HSK 2: 他 (tā)"),
                        WordToken("非常", "fēi cháng", "very; really", "Kosakata HSK 2: 非常 (fēi cháng)"),
                        WordToken("不", "bù", "no; not so", "Kosakata HSK 2: 不 (bù)"),
                        WordToken("高兴", "gāo xìng", "happy / glad / in a cheerful mood", "Kosakata HSK 2: 高兴 (gāo xìng)"),
                        WordToken("地", "de", "-ly / structural particle: used before a verb or adjective, linking it to preceding modifying adverbial adjunct", "Kosakata HSK 2: 地 (de)"),
                        WordToken("说", "shuō", "to speak; to talk; to say", "Kosakata HSK 2: 说 (shuō)"),
                        WordToken("我", "wǒ", "I; me; my", "Kosakata HSK 2: 我 (wǒ)"),
                        WordToken("希望", "xī wàng", "to hope", "Kosakata HSK 2: 希望 (xī wàng)"),
                        WordToken("你", "nǐ", "you", "Kosakata HSK 2: 你 (nǐ)"),
                        WordToken("的", "de", "possessive particle (of; 's) / modifying particle (used after an attribute to modify a noun or to form a nominal expression)", "Kosakata HSK 2: 的 (de)"),
                        WordToken("思想", "sī xiǎng", "thought / thinking / idea / ideology", "Kosakata HSK 2: 思想 (sī xiǎng)"),
                        WordToken("不要", "bù yào", "don't!; must not", "Kosakata HSK 2: 不要 (bù yào)"),
                        WordToken("和", "hé", "and; together with", "Kosakata HSK 2: 和 (hé)"),
                        WordToken("这儿", "zhè r", "here", "Kosakata HSK 2: 这儿 (zhè r)"),
                        WordToken("的", "de", "possessive particle (of; 's) / modifying particle (used after an attribute to modify a noun or to form a nominal expression)", "Kosakata HSK 2: 的 (de)"),
                        WordToken("桌子", "zhuō zi", "table / desk", "Kosakata HSK 2: 桌子 (zhuō zi)"),
                        WordToken("一样", "yī yàng", "same / like / equal to / the same as", "Kosakata HSK 2: 一样 (yī yàng)")
                    )
                ),
                Sentence(
                    id = "s_newbos_4",
                    hanzi = "大家都知道了，这个老板喜欢干净。",
                    pinyin = "dà jiā dōu zhī dào le zhè gè lǎo bǎn xǐ huan gān jìng",
                    translation = "Mendengar sindiran itu, seluruh staf langsung paham bahwa bos baru ini sangat menyukai kerapian dan kebersihan.",
                    tokens = listOf(
                        WordToken("大家", "dà jiā", "everyone", "Kosakata HSK 2: 大家 (dà jiā)"),
                        WordToken("都", "dōu", "all; both; entirely", "Kosakata HSK 2: 都 (dōu)"),
                        WordToken("知道", "zhī dào", "to know; to become aware of", "Kosakata HSK 2: 知道 (zhī dào)"),
                        WordToken("了", "le", "(completed action marker) / (modal particle indicating change of state, situation now)", "Kosakata HSK 2: 了 (le)"),
                        WordToken("这", "zhè", "this; these", "Kosakata HSK 2: 这 (zhè)"),
                        WordToken("个", "gè", "classifier for people or objects in general", "Kosakata HSK 2: 个 (gè)"),
                        WordToken("老板", "lǎo bǎn", "boss / business proprietor", "Kosakata HSK 2: 老板 (lǎo bǎn)"),
                        WordToken("喜欢", "xǐ huan", "to like; to be fond of", "Kosakata HSK 2: 喜欢 (xǐ huan)"),
                        WordToken("干净", "gān jìng", "clean / neat", "Kosakata HSK 2: 干净 (gān jìng)")
                    )
                ),
                Sentence(
                    id = "s_newbos_5",
                    hanzi = "他走后，大家开始打扫，办公室的桌子干净了。",
                    pinyin = "tā zǒu hòu dà jiā kāi shǐ dǎ sǎo bàn gōng shì de zhuō zi gān jìng le",
                    translation = "Setelah beliau pergi, semua karyawan serempak merapikan meja kerja masing-masing hingga bersih mengilap tanpa sehelai kertas pun.",
                    tokens = listOf(
                        WordToken("他", "tā", "he; him; his", "Kosakata HSK 2: 他 (tā)"),
                        WordToken("走", "zǒu", "to walk / to go / to run / to move (of vehicle) / to visit / to leave / to go away / to die (euph.) / to change (shape, form, meaning)", "Kosakata HSK 2: 走 (zǒu)"),
                        WordToken("后", "hòu", "afterwards / after", "Kosakata HSK 2: 后 (hòu)"),
                        WordToken("大家", "dà jiā", "everyone", "Kosakata HSK 2: 大家 (dà jiā)"),
                        WordToken("开始", "kāi shǐ", "to begin / to start", "Kosakata HSK 2: 开始 (kāi shǐ)"),
                        WordToken("打扫", "dǎ sǎo", "to clean / to sweep", "Kosakata HSK 2: 打扫 (dǎ sǎo)"),
                        WordToken("办公室", "bàn gōng shì", "office; business premises", "Kosakata HSK 2: 办公室 (bàn gōng shì)"),
                        WordToken("的", "de", "possessive particle (of; 's) / modifying particle (used after an attribute to modify a noun or to form a nominal expression)", "Kosakata HSK 2: 的 (de)"),
                        WordToken("桌子", "zhuō zi", "table / desk", "Kosakata HSK 2: 桌子 (zhuō zi)"),
                        WordToken("干净", "gān jìng", "clean / neat", "Kosakata HSK 2: 干净 (gān jìng)"),
                        WordToken("了", "le", "(completed action marker) / (modal particle indicating change of state, situation now)", "Kosakata HSK 2: 了 (le)")
                    )
                ),
                Sentence(
                    id = "s_newbos_6",
                    hanzi = "但是老板第二次来办公室的时候，看着干净的桌子，说：“我希望你们的头脑不要和现在的桌子一样，什么都没有。”",
                    pinyin = "dàn shì lǎo bǎn dì èr cì lái bàn gōng shì de shí hou kàn zhe gān jìng de zhuō zi shuō wǒ xī wàng nǐ men de tóu nǎo bù yào hé xiàn zài de zhuō zi yī yàng shén me dōu méi yǒu",
                    translation = "Namun saat sang bos kembali memeriksa untuk kedua kalinya, menatap meja-meja yang kosong melompong ia justru berkata: “Saya harap isi kepala kalian tidak kosong melompong seperti meja ini sekarang.”",
                    tokens = listOf(
                        WordToken("但是", "dàn shì", "but; however", "Kosakata HSK 2: 但是 (dàn shì)"),
                        WordToken("老板", "lǎo bǎn", "boss / business proprietor", "Kosakata HSK 2: 老板 (lǎo bǎn)"),
                        WordToken("第", "dì", "(prefix indicating ordinal number)", "Kosakata HSK 2: 第 (dì)"),
                        WordToken("二", "èr", "two / 2", "Kosakata HSK 2: 二 (èr)"),
                        WordToken("次", "cì", "classifier for enumerated events: time", "Kosakata HSK 2: 次 (cì)"),
                        WordToken("来", "lái", "to come", "Kosakata HSK 2: 来 (lái)"),
                        WordToken("办公室", "bàn gōng shì", "office; business premises", "Kosakata HSK 2: 办公室 (bàn gōng shì)"),
                        WordToken("的", "de", "possessive particle (of; 's) / modifying particle (used after an attribute to modify a noun or to form a nominal expression)", "Kosakata HSK 2: 的 (de)"),
                        WordToken("时候", "shí hou", "time / length of time / moment / period", "Kosakata HSK 2: 时候 (shí hou)"),
                        WordToken("看着", "kàn zhe", "seems to look at; while looking at; in the process of watching/looking", "Kosakata HSK 2: 看着 (kàn zhe)"),
                        WordToken("干净", "gān jìng", "clean / neat", "Kosakata HSK 2: 干净 (gān jìng)"),
                        WordToken("的", "de", "possessive particle (of; 's) / modifying particle (used after an attribute to modify a noun or to form a nominal expression)", "Kosakata HSK 2: 的 (de)"),
                        WordToken("桌子", "zhuō zi", "table / desk", "Kosakata HSK 2: 桌子 (zhuō zi)"),
                        WordToken("说", "shuō", "to speak; to talk; to say", "Kosakata HSK 2: 说 (shuō)"),
                        WordToken("我", "wǒ", "I; me; my", "Kosakata HSK 2: 我 (wǒ)"),
                        WordToken("希望", "xī wàng", "to hope", "Kosakata HSK 2: 希望 (xī wàng)"),
                        WordToken("你们", "nǐ men", "you (plural)", "Kosakata HSK 2: 你们 (nǐ men)"),
                        WordToken("的", "de", "possessive particle (of; 's) / modifying particle (used after an attribute to modify a noun or to form a nominal expression)", "Kosakata HSK 2: 的 (de)"),
                        WordToken("头脑", "tóu nǎo", "brains / mind / skull / (fig.) gist (of a matter) / leader / boss", "Kosakata HSK 2: 头脑 (tóu nǎo)"),
                        WordToken("不要", "bù yào", "don't!; must not", "Kosakata HSK 2: 不要 (bù yào)"),
                        WordToken("和", "hé", "and; together with", "Kosakata HSK 2: 和 (hé)"),
                        WordToken("现在", "xiàn zài", "now; at present; currently", "Kosakata HSK 2: 现在 (xiàn zài)"),
                        WordToken("的", "de", "possessive particle (of; 's) / modifying particle (used after an attribute to modify a noun or to form a nominal expression)", "Kosakata HSK 2: 的 (de)"),
                        WordToken("桌子", "zhuō zi", "table / desk", "Kosakata HSK 2: 桌子 (zhuō zi)"),
                        WordToken("一样", "yī yàng", "same / like / equal to / the same as", "Kosakata HSK 2: 一样 (yī yàng)"),
                        WordToken("什么", "shén me", "something; anything", "Kosakata HSK 2: 什么 (shén me)"),
                        WordToken("都", "dōu", "(not) at all", "Kosakata HSK 2: 都 (dōu)"),
                        WordToken("没有", "méi yǒu", "doesn't exist / to not be", "Kosakata HSK 2: 没有 (méi yǒu)")
                    )
                )
            ),
            questions = listOf(
                StoryQuestion(
                    id = "q_newbos_1",
                    questionText = "公司新调来了一位部门大领导，在员工们私下的传闻中这位新老板有什么鲜明特点？ (Ciri khas apa yang didengar para karyawan mengenai sosok manajer baru mereka?)",
                    options = listOf("为人极其随和从不查考勤 (Orangnya sangat santai dan tidak pernah memeriksa absensi)", "对工作业绩与行为细节有着极高、极严格的要求与期许 (Memiliki standar disiplin dan ekspektasi kerja yang teramat tinggi dan ketat)", "每天会给全体员工发红包 (Setiap hari membagikan bonus uang)", "根本不会说中文 (Sama sekali tidak bisa berbahasa Mandarin)"),
                    correctAnswerIndex = 1,
                    explanation = "Reputasi disiplin dan tuntutan standar kerja tinggi membuat para karyawan tegang mengamati gerak-gerik sang bos baru."
                ),
                StoryQuestion(
                    id = "q_newbos_2",
                    questionText = "新老板第一天踏进大办公室视察时，看到工位上的凌乱杂物做出了怎样一针见血的训诫？ (Sindiran tajam apa yang dilontarkan bos baru saat melihat meja kerja staf yang berantakan?)",
                    options = listOf("“大家辛苦了今晚吃火锅” (Kalian sudah bekerja keras malam ini kita makan hotpot)", "“我希望你们的思想工作状态，不要像这里的桌面一样杂乱无章！” (Saya harap pola pikir dan kinerja kalian tidak semrawut seperti meja yang berantakan ini!)", "“工位上的所有文件全部烧掉” (Bakar semua berkas dokumen yang ada di atas meja)", "“大家明天全部换新电脑” (Besok semua staf ganti komputer baru)"),
                    correctAnswerIndex = 1,
                    explanation = "Bos mengibaratkan meja yang kotor berantakan sebagai cerminan cara berpikir staf yang tidak teratur."
                ),
                StoryQuestion(
                    id = "q_newbos_3",
                    questionText = "领会到老板“酷爱整洁”的意图后，全体员工在老板离开后采取了怎样矫枉过正的清洁行动？ (Tindakan pembersihan ekstrem apa yang serempak dilakukan para staf setelah bos pergi?)",
                    options = listOf("集体写辞职报告抗议 (Kompak menulis surat resign massal)", "彻底大扫除，把桌面上所有文件、文具甚至纸片全部清理一空，让桌面变得光秃秃一片空白 (Membersihkan meja hingga kosong melompong tanpa selembar berkas pun di atas meja)", "把办公室的所有桌子都搬到走廊上 (Memindahkan semua meja kerja ke lorong)", "喷洒了满满三瓶空气清新剂 (Menyemprotkan tiga botol pengharum ruangan)"),
                    correctAnswerIndex = 1,
                    explanation = "Karyawan bertindak berlebihan dengan menyingkirkan semua barang kerja hingga meja benar-benar steril dan kosong."
                ),
                StoryQuestion(
                    id = "q_newbos_4",
                    questionText = "当老板第二次折返回来审视一尘不染、空空如也的桌面时，给出了怎样令人欲哭无泪的绝杀讽刺？ (Sarkasme telak apa yang diucapkan sang bos saat kembali melihat meja kerja yang kosong melompong?)",
                    options = listOf("当场给每人颁发劳动模范奖金 (Langsung membagikan bonus karyawan teladan)", "“我希望你们的头脑，不要像现在的桌面一样——空空如也、什么都没有！” (Saya harap isi kepala kalian tidak seperti meja ini sekarang: kosong melompong tanpa ada apa pun!)", "“大家干得好明天放假一天” (Bagus sekali besok kalian semua libur)", "“现在的环境非常适合打乒乓球” (Ruangan ini sekarang cocok untuk main tenis meja)"),
                    correctAnswerIndex = 1,
                    explanation = "Puncak dilema satir dunia kerja: meja berantakan disindir cara berpikirnya semrawut, meja dikosongkan disindir otaknya kosong melompong!"
                )
            )
        ),
        // Cerita Mandarin Bean 180 (HSK 2): Beginning of Spring (Awal Musim Semi Lichun)
        Story(
            id = "story_beginning_of_spring",
            titleHanzi = "立春",
            titlePinyin = "Lìchūn",
            titleTranslation = "Beginning of Spring (Awal Musim Semi Lichun)",
            level = "HSK 2",
            category = "Budaya & 24 Pos Musim",
            description = "Mengenal pos musim pertama dalam penanggalan tradisional Tiongkok, saat alam mulai bangkit dari musim dingin yang membeku.",
            coverEmoji = "🌱",
            coverImageRes = R.drawable.cover_story_beginning_of_spring,
            estimatedReadMinutes = 2,
            sentences = listOf(
                Sentence(
                    id = "s_bgnspr_1",
                    hanzi = "立春，二月四号，这是今年的第一个节气。",
                    pinyin = "Lì chūn èr yuè sì hào zhè shì jīn nián de dì yī gè jié qì",
                    translation = "Lichun (Beginning of Spring), yang jatuh pada tanggal 4 Februari, merupakan pos musim (Solar Term) pertama dalam penanggalan tradisional Tiongkok tahun ini.",
                    tokens = listOf(
                        WordToken("立春", "Lì chūn", "Lichun or Beginning of Spring, 1st of the 24 solar terms", "Kosakata HSK 2: 立春 (Lì chūn)"),
                        WordToken("二", "èr", "two / 2", "Kosakata HSK 2: 二 (èr)"),
                        WordToken("月", "yuè", "month / monthly", "Kosakata HSK 2: 月 (yuè)"),
                        WordToken("四", "sì", "four / 4", "Kosakata HSK 2: 四 (sì)"),
                        WordToken("号", "hào", "(bound form) bugle; trumpet / (bound form) signal; bugle call / (bound form) mark; sign / (bound form) name; appellation / (after a numeral) number designation / day of the month / (bound form) size; type; category", "Kosakata HSK 2: 号 (hào)"),
                        WordToken("这", "zhè", "this; these", "Kosakata HSK 2: 这 (zhè)"),
                        WordToken("是", "shì", "to be (followed by substantives only)", "Kosakata HSK 2: 是 (shì)"),
                        WordToken("今年", "jīn nián", "this year", "Kosakata HSK 2: 今年 (jīn nián)"),
                        WordToken("的", "de", "possessive particle (of; 's) / modifying particle (used after an attribute to modify a noun or to form a nominal expression)", "Kosakata HSK 2: 的 (de)"),
                        WordToken("第", "dì", "(prefix indicating ordinal number)", "Kosakata HSK 2: 第 (dì)"),
                        WordToken("一", "yī", "one / single / a (article)", "Kosakata HSK 2: 一 (yī)"),
                        WordToken("个", "gè", "classifier for people or objects in general", "Kosakata HSK 2: 个 (gè)"),
                        WordToken("节气", "jié qì", "solar term", "Kosakata HSK 2: 节气 (jié qì)")
                    )
                ),
                Sentence(
                    id = "s_bgnspr_2",
                    hanzi = "“立”有开始的意思，“立春”就是春天开始了。",
                    pinyin = "lì yǒu kāi shǐ de yì si Lì chūn jiù shì chūn tiān kāi shǐ le",
                    translation = "Karakter 'Li' (立) bermakna permulaan atau awal mula; sehingga istilah 'Lichun' melambangkan bahwa musim semi yang hangat telah resmi dimulai.",
                    tokens = listOf(
                        WordToken("立", "lì", "to stand / to set up / to establish / to lay down / to draw up", "Kosakata HSK 2: 立 (lì)"),
                        WordToken("有", "yǒu", "to have; there is", "Kosakata HSK 2: 有 (yǒu)"),
                        WordToken("开始", "kāi shǐ", "beginning", "Kosakata HSK 2: 开始 (kāi shǐ)"),
                        WordToken("的", "de", "possessive particle (of; 's) / modifying particle (used after an attribute to modify a noun or to form a nominal expression)", "Kosakata HSK 2: 的 (de)"),
                        WordToken("意思", "yì si", "idea / opinion / meaning", "Kosakata HSK 2: 意思 (yì si)"),
                        WordToken("立春", "Lì chūn", "Lichun or Beginning of Spring, 1st of the 24 solar terms", "Kosakata HSK 2: 立春 (Lì chūn)"),
                        WordToken("就是", "jiù shì", "exactly; precisely / only; simply; just / even; even if", "Kosakata HSK 2: 就是 (jiù shì)"),
                        WordToken("春天", "chūn tiān", "spring (season)", "Kosakata HSK 2: 春天 (chūn tiān)"),
                        WordToken("开始", "kāi shǐ", "to begin / to start", "Kosakata HSK 2: 开始 (kāi shǐ)"),
                        WordToken("了", "le", "(completed action marker) / (modal particle indicating change of state, situation now)", "Kosakata HSK 2: 了 (le)")
                    )
                ),
                Sentence(
                    id = "s_bgnspr_3",
                    hanzi = "这一天，中国人会吃萝卜、姜、饼等东西，称为“咬春”，大家也会吃一些春天的菜，迎接新春。",
                    pinyin = "zhè yī tiān Zhōng guó rén huì chī luó bo jiāng bǐng děng dōng xi chēng wéi yǎo chūn dà jiā yě huì chī yī xiē chūn tiān de cài yíng jiē xīn chūn",
                    translation = "Pada hari istimewa ini, masyarakat Tiongkok memiliki tradisi menyantap lobak segar, jahe, dan lumpia musim semi (spring pancake) yang dinamai tradisi 'Menggigit Musim Semi' (Yaochun), serta menikmati hidangan sayuran segar menyambut tahun baru.",
                    tokens = listOf(
                        WordToken("这", "zhè", "this; these", "Kosakata HSK 2: 这 (zhè)"),
                        WordToken("一", "yī", "one / single / a (article)", "Kosakata HSK 2: 一 (yī)"),
                        WordToken("天", "tiān", "day", "Kosakata HSK 2: 天 (tiān)"),
                        WordToken("中国人", "Zhōng guó rén", "Chinese person", "Kosakata HSK 2: 中国人 (Zhōng guó rén)"),
                        WordToken("会", "huì", "to be likely to; to be sure to", "Kosakata HSK 2: 会 (huì)"),
                        WordToken("吃", "chī", "to eat; to consume / to eat at", "Kosakata HSK 2: 吃 (chī)"),
                        WordToken("萝卜", "luó bo", "radish (Raphanus sativus), esp. daikon", "Kosakata HSK 2: 萝卜 (luó bo)"),
                        WordToken("姜", "jiāng", "ginger", "Kosakata HSK 2: 姜 (jiāng)"),
                        WordToken("饼", "bǐng", "round flat cake / cookie / cake / pastry", "Kosakata HSK 2: 饼 (bǐng)"),
                        WordToken("等", "děng", "and so on; etc.; et al. / (used to end an enumeration)", "Kosakata HSK 2: 等 (děng)"),
                        WordToken("东西", "dōng xi", "thing / stuff / person", "Kosakata HSK 2: 东西 (dōng xi)"),
                        WordToken("称为", "chēng wéi", "to be called; to be known as; to call it \"...\"", "Kosakata HSK 2: 称为 (chēng wéi)"),
                        WordToken("咬", "yǎo", "to bite / to nip", "Kosakata HSK 2: 咬 (yǎo)"),
                        WordToken("春", "chūn", "spring (season) / love / lust / life", "Kosakata HSK 2: 春 (chūn)"),
                        WordToken("大家", "dà jiā", "everyone", "Kosakata HSK 2: 大家 (dà jiā)"),
                        WordToken("也", "yě", "also; too; as well; (not ...) either", "Kosakata HSK 2: 也 (yě)"),
                        WordToken("会", "huì", "to be likely to; to be sure to", "Kosakata HSK 2: 会 (huì)"),
                        WordToken("吃", "chī", "to eat; to consume / to eat at", "Kosakata HSK 2: 吃 (chī)"),
                        WordToken("一些", "yī xiē", "some; a few; a little; (following an adjective) slightly ...er", "Kosakata HSK 2: 一些 (yī xiē)"),
                        WordToken("春天", "chūn tiān", "spring (season)", "Kosakata HSK 2: 春天 (chūn tiān)"),
                        WordToken("的", "de", "possessive particle (of; 's) / modifying particle (used after an attribute to modify a noun or to form a nominal expression)", "Kosakata HSK 2: 的 (de)"),
                        WordToken("菜", "cài", "vegetable; greens", "Kosakata HSK 2: 菜 (cài)"),
                        WordToken("迎接", "yíng jiē", "to welcome; to greet", "Kosakata HSK 2: 迎接 (yíng jiē)"),
                        WordToken("新", "xīn", "new; newly", "Kosakata HSK 2: 新 (xīn)"),
                        WordToken("春", "chūn", "spring (season) / love / lust / life", "Kosakata HSK 2: 春 (chūn)")
                    )
                )
            ),
            questions = listOf(
                StoryQuestion(
                    id = "q_bgnspr_1",
                    questionText = "中国传统二十四节气之首的“立春”，通常在公历的哪一天拉开序幕？ (Pada tanggal berapakah pos musim pertama Lichun biasanya jatuh dalam kalender Masehi?)",
                    options = listOf("1月1日 (1 Januari)", "2月4日左右 (Sekitar tanggal 4 Februari)", "3月12日植树节 (12 Maret Hari Menanam Pohon)", "5月1日劳动节 (1 Mei Hari Buruh)"),
                    correctAnswerIndex = 1,
                    explanation = "Lichun (Beginning of Spring) secara berkala jatuh pada tanggal 4 Februari setiap tahunnya."
                ),
                StoryQuestion(
                    id = "q_bgnspr_2",
                    questionText = "汉字词汇“立春”中的关键字“立”，在古代造字与节气语境中蕴含着什么核心意义？ (Apa makna dasar dari karakter 'Lì' dalam nama pos musim Lichun?)",
                    options = listOf("罚站立正的意思 (Berdiri tegak mendapat hukuman)", "象征着“开始、确立”，寓意寒冬结束、温暖明媚的春天正式启程 (Bermakna 'permulaan atau awal mula', melambangkan musim semi resmi dimulai)", "立即离开的意思 (Segera bergegas pergi)", "独立自主的意思 (Berdiri mandiri)"),
                    correctAnswerIndex = 1,
                    explanation = "Karakter 'Li' (立) memiliki makna 'dimulainya' suatu siklus musim yang baru."
                ),
                StoryQuestion(
                    id = "q_bgnspr_3",
                    questionText = "在民间源远流长的立春传统习俗中，被称为“咬春”的标志性食俗包含品尝哪些特色食物？ (Tradisi kuliner 'Yaochun' pada hari Lichun identik dengan menyantap makanan apa saja?)",
                    options = listOf("吃烤全羊与涮牛肉 (Makan kambing guling dan daging sapi celup)", "品尝新鲜的脆生萝卜、辛温嫩姜、春饼及春季时令新鲜蔬菜 (Menyantap lobak segar yang renyah, jahe hangat, lumpia musim semi / spring pancake, dan sayur hijau)", "大量吃冰激凌雪糕 (Makan banyak es krim stik)", "吃重油重盐的肥肉 (Makan lemak babi berminyak)"),
                    correctAnswerIndex = 1,
                    explanation = "Tradisi 'Yaochun' (咬春) dirayakan dengan memakan lobak segar, jahe, dan lumpia musim semi (春饼) demi kebugaran tubuh."
                ),
                StoryQuestion(
                    id = "q_bgnspr_4",
                    questionText = "古代华夏农耕先民将立春奉为岁首重节，寄托了对大自然与农事耕作的何种崇高期望？ (Harapan filosofis apa yang diyakini masyarakat agraris kuno saat menyambut pos musim Lichun?)",
                    options = listOf("希望冬天永远不要过去 (Berharap musim dingin tidak pernah berakhir)", "顺应天时物候转暖，迎接万物复苏、春耕破土播种与丰收新岁的美好祝愿 (Menyelaraskan diri dengan kebangkitan alam, menyambut musim bercocok tanam baru dengan penuh sukacita)", "祈祷所有的庄稼都不用浇水 (Berdoa agar tanaman tidak perlu disiram)", "希望一年四季天天放假 (Berharap setiap hari libur sepanjang tahun)"),
                    correctAnswerIndex = 1,
                    explanation = "Lichun menandai awal mula bangkitnya kehidupan alam dari tidur panjang musim dingin, simbol harapan kesuburan bumi."
                )
            )
        ),
        // Cerita Mandarin Bean 181 (HSK 2): Buy Earrings (Membeli Anting-anting Cantik)
        Story(
            id = "story_buy_earrings",
            titleHanzi = "买耳环",
            titlePinyin = "Mǎi Érhuán",
            titleTranslation = "Buy Earrings (Membeli Anting-anting Cantik)",
            level = "HSK 2",
            category = "Belanja & Humor",
            description = "Percakapan lucu saat seorang suami menemani istrinya memilih sepasang anting perhiasan di toko perhiasan.",
            coverEmoji = "💎",
            coverImageRes = R.drawable.cover_story_buy_earrings,
            estimatedReadMinutes = 2,
            sentences = listOf(
                Sentence(
                    id = "s_buyear_1",
                    hanzi = "一个女人在商店里看见两只一样的耳环。",
                    pinyin = "yī gè nǚ rén zài shāng diàn lǐ kàn jiàn liǎng zhī yī yàng de ěr huán",
                    translation = "Seorang wanita melihat sepasang anting perhiasan dengan model yang identik sama di etalase toko perhiasan.",
                    tokens = listOf(
                        WordToken("一", "yī", "one / single / a (article)", "Kosakata HSK 2: 一 (yī)"),
                        WordToken("个", "gè", "classifier for people or objects in general", "Kosakata HSK 2: 个 (gè)"),
                        WordToken("女人", "nǚ rén", "woman", "Kosakata HSK 2: 女人 (nǚ rén)"),
                        WordToken("在", "zài", "(of sb or sth) to be (located) at", "Kosakata HSK 2: 在 (zài)"),
                        WordToken("商店", "shāng diàn", "store; shop", "Kosakata HSK 2: 商店 (shāng diàn)"),
                        WordToken("里", "lǐ", "lining / interior / inside", "Kosakata HSK 2: 里 (lǐ)"),
                        WordToken("看见", "kàn jiàn", "to see; to catch sight of", "Kosakata HSK 2: 看见 (kàn jiàn)"),
                        WordToken("两", "liǎng", "two / both / some / a few", "Kosakata HSK 2: 两 (liǎng)"),
                        WordToken("只", "zhī", "classifier for birds and certain animals, one of a pair, some utensils, vessels etc", "Kosakata HSK 2: 只 (zhī)"),
                        WordToken("一样", "yī yàng", "same / like / equal to / the same as", "Kosakata HSK 2: 一样 (yī yàng)"),
                        WordToken("的", "de", "possessive particle (of; 's) / modifying particle (used after an attribute to modify a noun or to form a nominal expression)", "Kosakata HSK 2: 的 (de)"),
                        WordToken("耳环", "ěr huán", "earring", "Kosakata HSK 2: 耳环 (ěr huán)")
                    )
                ),
                Sentence(
                    id = "s_buyear_2",
                    hanzi = "但是，一只的价格是五百元，另一只的价格只有二百五十元。",
                    pinyin = "dàn shì yī zhī de jià gé shì wǔ bǎi yuán lìng yī zhī de jià gé zhǐ yǒu èr bǎi wǔ shí yuán",
                    translation = "Namun anehnya, label harga anting yang satu tertulis 500 yuan, sedangkan anting pasangannya hanya berlabel 250 yuan.",
                    tokens = listOf(
                        WordToken("但是", "dàn shì", "but; however", "Kosakata HSK 2: 但是 (dàn shì)"),
                        WordToken("一", "yī", "one / single / a (article)", "Kosakata HSK 2: 一 (yī)"),
                        WordToken("只", "zhī", "classifier for birds and certain animals, one of a pair, some utensils, vessels etc", "Kosakata HSK 2: 只 (zhī)"),
                        WordToken("的", "de", "possessive particle (of; 's) / modifying particle (used after an attribute to modify a noun or to form a nominal expression)", "Kosakata HSK 2: 的 (de)"),
                        WordToken("价格", "jià gé", "price", "Kosakata HSK 2: 价格 (jià gé)"),
                        WordToken("是", "shì", "to be (followed by substantives only)", "Kosakata HSK 2: 是 (shì)"),
                        WordToken("五", "wǔ", "five / 5", "Kosakata HSK 2: 五 (wǔ)"),
                        WordToken("百", "bǎi", "hundred", "Kosakata HSK 2: 百 (bǎi)"),
                        WordToken("元", "yuán", "currency unit (esp. Chinese yuan) / era (of a reign) / (geology) eon", "Kosakata HSK 2: 元 (yuán)"),
                        WordToken("另", "lìng", "other / another / separate", "Kosakata HSK 2: 另 (lìng)"),
                        WordToken("一", "yī", "one / single / a (article)", "Kosakata HSK 2: 一 (yī)"),
                        WordToken("只", "zhī", "classifier for birds and certain animals, one of a pair, some utensils, vessels etc", "Kosakata HSK 2: 只 (zhī)"),
                        WordToken("的", "de", "possessive particle (of; 's) / modifying particle (used after an attribute to modify a noun or to form a nominal expression)", "Kosakata HSK 2: 的 (de)"),
                        WordToken("价格", "jià gé", "price", "Kosakata HSK 2: 价格 (jià gé)"),
                        WordToken("只", "zhǐ", "only; merely; just", "Kosakata HSK 2: 只 (zhǐ)"),
                        WordToken("有", "yǒu", "to have; there is", "Kosakata HSK 2: 有 (yǒu)"),
                        WordToken("二", "èr", "two / 2", "Kosakata HSK 2: 二 (èr)"),
                        WordToken("百", "bǎi", "hundred", "Kosakata HSK 2: 百 (bǎi)"),
                        WordToken("五", "wǔ", "five / 5", "Kosakata HSK 2: 五 (wǔ)"),
                        WordToken("十", "shí", "ten / 10", "Kosakata HSK 2: 十 (shí)"),
                        WordToken("元", "yuán", "currency unit (esp. Chinese yuan) / era (of a reign) / (geology) eon", "Kosakata HSK 2: 元 (yuán)")
                    )
                ),
                Sentence(
                    id = "s_buyear_3",
                    hanzi = "她很高兴，以为是商店写错了，现在买就太便宜了。",
                    pinyin = "tā hěn gāo xìng yǐ wéi shì shāng diàn xiě cuò le xiàn zài mǎi jiù tài pián yi le",
                    translation = "Wanita itu merasa sangat girang, mengira pihak toko telah keliru menuliskan label harga dan ini kesempatan emas membeli barang murah.",
                    tokens = listOf(
                        WordToken("她", "tā", "she", "Kosakata HSK 2: 她 (tā)"),
                        WordToken("很", "hěn", "very; quite", "Kosakata HSK 2: 很 (hěn)"),
                        WordToken("高兴", "gāo xìng", "happy / glad / in a cheerful mood", "Kosakata HSK 2: 高兴 (gāo xìng)"),
                        WordToken("以为", "yǐ wéi", "to think; to believe", "Kosakata HSK 2: 以为 (yǐ wéi)"),
                        WordToken("是", "shì", "to be (followed by substantives only)", "Kosakata HSK 2: 是 (shì)"),
                        WordToken("商店", "shāng diàn", "store; shop", "Kosakata HSK 2: 商店 (shāng diàn)"),
                        WordToken("写", "xiě", "to write", "Kosakata HSK 2: 写 (xiě)"),
                        WordToken("错", "cuò", "mistake", "Kosakata HSK 2: 错 (cuò)"),
                        WordToken("了", "le", "(completed action marker) / (modal particle indicating change of state, situation now)", "Kosakata HSK 2: 了 (le)"),
                        WordToken("现在", "xiàn zài", "now; at present; currently", "Kosakata HSK 2: 现在 (xiàn zài)"),
                        WordToken("买", "mǎi", "to buy / to purchase", "Kosakata HSK 2: 买 (mǎi)"),
                        WordToken("就", "jiù", "in that case; then", "Kosakata HSK 2: 就 (jiù)"),
                        WordToken("太", "tài", "too (much) / very / extremely", "Kosakata HSK 2: 太 (tài)"),
                        WordToken("便宜", "pián yi", "cheap; inexpensive", "Kosakata HSK 2: 便宜 (pián yi)"),
                        WordToken("了", "le", "(completed action marker) / (modal particle indicating change of state, situation now)", "Kosakata HSK 2: 了 (le)")
                    )
                ),
                Sentence(
                    id = "s_buyear_4",
                    hanzi = "她就马上买了那个便宜的耳环，非常高兴地走出了商店。",
                    pinyin = "tā jiù mǎ shàng mǎi le nà gè pián yi de ěr huán fēi cháng gāo xìng de zǒu chū le shāng diàn",
                    translation = "Tanpa membuang waktu ia langsung membeli anting berlabel 250 yuan tersebut, lalu bergegas melangkah keluar toko dengan senyum kemenangan.",
                    tokens = listOf(
                        WordToken("她", "tā", "she", "Kosakata HSK 2: 她 (tā)"),
                        WordToken("就", "jiù", "as soon as; immediately after", "Kosakata HSK 2: 就 (jiù)"),
                        WordToken("马上", "mǎ shàng", "at once / right away / immediately", "Kosakata HSK 2: 马上 (mǎ shàng)"),
                        WordToken("买", "mǎi", "to buy / to purchase", "Kosakata HSK 2: 买 (mǎi)"),
                        WordToken("了", "le", "(completed action marker) / (modal particle indicating change of state, situation now)", "Kosakata HSK 2: 了 (le)"),
                        WordToken("那", "nà", "(specifier) that; the; those / (pronoun) that (referring to persons, things or situations)", "Kosakata HSK 2: 那 (nà)"),
                        WordToken("个", "gè", "classifier for people or objects in general", "Kosakata HSK 2: 个 (gè)"),
                        WordToken("便宜", "pián yi", "cheap; inexpensive", "Kosakata HSK 2: 便宜 (pián yi)"),
                        WordToken("的", "de", "possessive particle (of; 's) / modifying particle (used after an attribute to modify a noun or to form a nominal expression)", "Kosakata HSK 2: 的 (de)"),
                        WordToken("耳环", "ěr huán", "earring", "Kosakata HSK 2: 耳环 (ěr huán)"),
                        WordToken("非常", "fēi cháng", "very; really", "Kosakata HSK 2: 非常 (fēi cháng)"),
                        WordToken("高兴", "gāo xìng", "happy / glad / in a cheerful mood", "Kosakata HSK 2: 高兴 (gāo xìng)"),
                        WordToken("地", "de", "-ly / structural particle: used before a verb or adjective, linking it to preceding modifying adverbial adjunct", "Kosakata HSK 2: 地 (de)"),
                        WordToken("走", "zǒu", "to walk / to go / to run / to move (of vehicle) / to visit / to leave / to go away / to die (euph.) / to change (shape, form, meaning)", "Kosakata HSK 2: 走 (zǒu)"),
                        WordToken("出", "chū", "(used after a verb to indicate an outward direction or a positive result)", "Kosakata HSK 2: 出 (chū)"),
                        WordToken("了", "le", "(completed action marker) / (modal particle indicating change of state, situation now)", "Kosakata HSK 2: 了 (le)"),
                        WordToken("商店", "shāng diàn", "store; shop", "Kosakata HSK 2: 商店 (shāng diàn)")
                    )
                ),
                Sentence(
                    id = "s_buyear_5",
                    hanzi = "这时候，店里面的一个店员对另一个店员说：“你看，我们这样写价格，看见的人都买了。”",
                    pinyin = "zhè shí hou diàn lǐ miàn de yī gè diàn yuán duì lìng yī gè diàn yuán shuō nǐ kàn wǒ men zhè yàng xiě jià gé kàn jiàn de rén dōu mǎi le",
                    translation = "Pada saat itu, seorang pelayan toko tersenyum licik dan berbisik kepada rekannya: “Coba lihat, setiap kali kita memasang trik label harga seperti itu, semua orang pasti langsung berebut membelinya!”",
                    tokens = listOf(
                        WordToken("这", "zhè", "this; these", "Kosakata HSK 2: 这 (zhè)"),
                        WordToken("时候", "shí hou", "time / length of time / moment / period", "Kosakata HSK 2: 时候 (shí hou)"),
                        WordToken("店", "diàn", "(bound form) shop; store", "Kosakata HSK 2: 店 (diàn)"),
                        WordToken("里面", "lǐ miàn", "inside / interior", "Kosakata HSK 2: 里面 (lǐ miàn)"),
                        WordToken("的", "de", "possessive particle (of; 's) / modifying particle (used after an attribute to modify a noun or to form a nominal expression)", "Kosakata HSK 2: 的 (de)"),
                        WordToken("一", "yī", "one / single / a (article)", "Kosakata HSK 2: 一 (yī)"),
                        WordToken("个", "gè", "classifier for people or objects in general", "Kosakata HSK 2: 个 (gè)"),
                        WordToken("店员", "diàn yuán", "shop assistant; store clerk", "Kosakata HSK 2: 店员 (diàn yuán)"),
                        WordToken("对", "duì", "towards; at; for / concerning; regarding", "Kosakata HSK 2: 对 (duì)"),
                        WordToken("另", "lìng", "other / another / separate", "Kosakata HSK 2: 另 (lìng)"),
                        WordToken("一", "yī", "one / single / a (article)", "Kosakata HSK 2: 一 (yī)"),
                        WordToken("个", "gè", "classifier for people or objects in general", "Kosakata HSK 2: 个 (gè)"),
                        WordToken("店员", "diàn yuán", "shop assistant; store clerk", "Kosakata HSK 2: 店员 (diàn yuán)"),
                        WordToken("说", "shuō", "to speak; to talk; to say", "Kosakata HSK 2: 说 (shuō)"),
                        WordToken("你", "nǐ", "you", "Kosakata HSK 2: 你 (nǐ)"),
                        WordToken("看", "kàn", "to see; to look at / to read / to watch / to visit; to call on / to consider; to regard as / to look after / to treat (a patient or illness) / to depend on / to feel (that) / (after a verb) to give it a try / to watch out for", "Kosakata HSK 2: 看 (kàn)"),
                        WordToken("我们", "wǒ men", "we; us; ourselves; our", "Kosakata HSK 2: 我们 (wǒ men)"),
                        WordToken("这样", "zhè yàng", "this way; like this; so", "Kosakata HSK 2: 这样 (zhè yàng)"),
                        WordToken("写", "xiě", "to write", "Kosakata HSK 2: 写 (xiě)"),
                        WordToken("价格", "jià gé", "price", "Kosakata HSK 2: 价格 (jià gé)"),
                        WordToken("看见", "kàn jiàn", "to see; to catch sight of", "Kosakata HSK 2: 看见 (kàn jiàn)"),
                        WordToken("的", "de", "possessive particle (of; 's) / modifying particle (used after an attribute to modify a noun or to form a nominal expression)", "Kosakata HSK 2: 的 (de)"),
                        WordToken("人", "rén", "person; people", "Kosakata HSK 2: 人 (rén)"),
                        WordToken("都", "dōu", "all; both; entirely", "Kosakata HSK 2: 都 (dōu)"),
                        WordToken("买", "mǎi", "to buy / to purchase", "Kosakata HSK 2: 买 (mǎi)"),
                        WordToken("了", "le", "(completed action marker) / (modal particle indicating change of state, situation now)", "Kosakata HSK 2: 了 (le)")
                    )
                )
            ),
            questions = listOf(
                StoryQuestion(
                    id = "q_buyear_1",
                    questionText = "那位女士在精品珠宝饰品店的展示专柜里，发现了怎样一对非常特殊的耳环？ (Pasangan anting perhiasan seperti apa yang ditemukan sang wanita di etalase toko?)",
                    options = listOf("一只由纯银打造，另一只由纯黄金打造 (Satu terbuat dari perak murni, satunya lagi emas murni)", "两只耳环的外观款式和材质做工完全一模一样，毫无差别 (Kedua belah anting memiliki bentuk model dan bahan yang identik persis sama)", "一只是古董，一只是现代塑料 (Satu barang antik kuno, satunya plastik)", "两只都严重破损断裂了 (Keduanya rusak dan patah)"),
                    correctAnswerIndex = 1,
                    explanation = "Kedua belah anting memiliki model fisik yang kembar identik tanpa ada perbedaan mutu."
                ),
                StoryQuestion(
                    id = "q_buyear_2",
                    questionText = "让这位女顾客感到匪夷所思并心生暗喜的标价牌差异是怎样的？ (Perbedaan label harga ganjil apa yang membuat sang wanita tergiur?)",
                    options = listOf("一只标价10元，另一只标价1000元 (Satu berlabel 10 yuan, satunya 1000 yuan)", "完全相同的一副耳环，其中一只标价五百元，而另一只却仅标价二百五十元！ (Model identik sama, sebelah dilabeli 500 yuan, sedangkan sebelah pasangannya cuma 250 yuan!)", "两只都标价为零元免费赠送 (Keduanya berlabel nol rupiah gratis)", "只能成吨打包购买 (Hanya bisa dibeli dalam partai berton-ton)"),
                    correctAnswerIndex = 1,
                    explanation = "Anting pertama dipajang seharga 500 yuan, sedangkan sebelahnya diberi label 250 yuan."
                ),
                StoryQuestion(
                    id = "q_buyear_3",
                    questionText = "女顾客看到250元的耳环后，在心里打起了什么自以为聪明的算盘？ (Pikiran apa yang membuat sang wanita merasa beruntung dan bergegas membelinya?)",
                    options = listOf("以为店员粗心将昂贵的名贵真品价格标签贴错了，生怕店家发现于是立刻捡漏买下！ (Mengira karyawan teledor salah menempel label harga diskon, sehingga ia bergegas membelinya sebelum toko sadar!)", "打算买下来当废铜烂铁卖掉 (Berniat membelinya untuk dijual kembali sebagai rongsokan)", "以为这是假的仿制品 (Mengira itu adalah barang tiruan tiruan)", "打算送给讨厌的情敌 (Berniat menghadiahkannya kepada musuh)"),
                    correctAnswerIndex = 0,
                    explanation = "Ia merasa toko salah memberi label harga murah dan merasa beruntung bisa memborongnya dengan harga murah."
                ),
                StoryQuestion(
                    id = "q_buyear_4",
                    questionText = "两位狡黠的店员在顾客欢天喜地离店后的悄悄话，揭示了商家怎样的营销心理陷阱？ (Trik psikologi harga apa yang diakui sang pelayan toko setelah pembeli pergi?)",
                    options = listOf("那只耳环其实是用廉价废纸糊出来的 (Anting itu sebenarnya terbuat dari bubur kertas bekas)", "故意制造同款不对称的高低标价锚定心理，诱导贪图便宜的顾客毫不犹豫地买下溢价商品！ (Sengaja menciptakan efek jangkar harga kontras untuk memancing pembeli yang merasa menang padahal membeli barang murah bermargin tinggi!)", "他们正准备向警察报案抓小偷 (Mereka bersiap melapor polisi)", "商店马上就要破产倒闭了 (Toko perhiasan tersebut hendak gulung tikar)"),
                    correctAnswerIndex = 1,
                    explanation = "Trik psikologi 'Price Anchoring': memajang harga 500 yuan sengaja dibuat agar harga 250 yuan tampak seperti diskon besar menguntungkan!"
                )
            )
        ),
        // Cerita Mandarin Bean 182 (HSK 2): Gifts (Etika Memberi Hadiah)
        Story(
            id = "story_gifts_culture",
            titleHanzi = "礼物",
            titlePinyin = "Lǐwù",
            titleTranslation = "Gifts (Etika Memberi Hadiah)",
            level = "HSK 2",
            category = "Budaya & Adat Istiadat",
            description = "Tradisi dan tata krama memberi bingkisan hadiah di kalangan masyarakat Tiongkok saat bertamu dan hari raya.",
            coverEmoji = "🎁",
            coverImageRes = R.drawable.cover_story_gifts_culture,
            estimatedReadMinutes = 2,
            sentences = listOf(
                Sentence(
                    id = "s_giftcl_1",
                    hanzi = "冬天有很多节日。",
                    pinyin = "dōng tiān yǒu hěn duō jié rì",
                    translation = "Di musim dingin terdapat sangat banyak perayaan hari besar dan festival kebudayaan.",
                    tokens = listOf(
                        WordToken("冬天", "dōng tiān", "winter", "Kosakata HSK 2: 冬天 (dōng tiān)"),
                        WordToken("有", "yǒu", "to have; there is", "Kosakata HSK 2: 有 (yǒu)"),
                        WordToken("很", "hěn", "very; quite", "Kosakata HSK 2: 很 (hěn)"),
                        WordToken("多", "duō", "many; much; more; a lot of", "Kosakata HSK 2: 多 (duō)"),
                        WordToken("节日", "jié rì", "holiday / festival", "Kosakata HSK 2: 节日 (jié rì)")
                    )
                ),
                Sentence(
                    id = "s_giftcl_2",
                    hanzi = "节日里，大家喜欢买东西送给朋友和家人。",
                    pinyin = "jié rì lǐ dà jiā xǐ huan mǎi dōng xi sòng gěi péng you hé jiā rén",
                    translation = "Selama momen perayaan hari raya, masyarakat gemar berbelanja aneka bingkisan hadiah untuk dipersembahkan kepada sahabat dan sanak keluarga tercinta.",
                    tokens = listOf(
                        WordToken("节日", "jié rì", "holiday / festival", "Kosakata HSK 2: 节日 (jié rì)"),
                        WordToken("里", "lǐ", "lining / interior / inside", "Kosakata HSK 2: 里 (lǐ)"),
                        WordToken("大家", "dà jiā", "everyone", "Kosakata HSK 2: 大家 (dà jiā)"),
                        WordToken("喜欢", "xǐ huan", "to like; to be fond of", "Kosakata HSK 2: 喜欢 (xǐ huan)"),
                        WordToken("买", "mǎi", "to buy / to purchase", "Kosakata HSK 2: 买 (mǎi)"),
                        WordToken("东西", "dōng xi", "thing / stuff / person", "Kosakata HSK 2: 东西 (dōng xi)"),
                        WordToken("送", "sòng", "to give (as a present)", "Kosakata HSK 2: 送 (sòng)"),
                        WordToken("给", "gěi", "to / for / for the benefit of / to do sth (for sb)", "Kosakata HSK 2: 给 (gěi)"),
                        WordToken("朋友", "péng you", "friend", "Kosakata HSK 2: 朋友 (péng you)"),
                        WordToken("和", "hé", "and; together with", "Kosakata HSK 2: 和 (hé)"),
                        WordToken("家人", "jiā rén", "family member", "Kosakata HSK 2: 家人 (jiā rén)")
                    )
                ),
                Sentence(
                    id = "s_giftcl_3",
                    hanzi = "但是，商店的人非常多，我很不喜欢人山人海的地方。",
                    pinyin = "dàn shì shāng diàn de rén fēi cháng duō wǒ hěn bù xǐ huan rén shān rén hǎi de dì fang",
                    translation = "Namun suasana pusat perbelanjaan selalu dipadati lautan manusia, sedangkan aku sendiri sangat tidak menyukai berada di kerumunan yang ramai sesak.",
                    tokens = listOf(
                        WordToken("但是", "dàn shì", "but; however", "Kosakata HSK 2: 但是 (dàn shì)"),
                        WordToken("商店", "shāng diàn", "store; shop", "Kosakata HSK 2: 商店 (shāng diàn)"),
                        WordToken("的", "de", "possessive particle (of; 's) / modifying particle (used after an attribute to modify a noun or to form a nominal expression)", "Kosakata HSK 2: 的 (de)"),
                        WordToken("人", "rén", "person; people", "Kosakata HSK 2: 人 (rén)"),
                        WordToken("非常", "fēi cháng", "very; really", "Kosakata HSK 2: 非常 (fēi cháng)"),
                        WordToken("多", "duō", "many; much; more; a lot of", "Kosakata HSK 2: 多 (duō)"),
                        WordToken("我", "wǒ", "I; me; my", "Kosakata HSK 2: 我 (wǒ)"),
                        WordToken("很", "hěn", "very; quite", "Kosakata HSK 2: 很 (hěn)"),
                        WordToken("不", "bù", "no; not so", "Kosakata HSK 2: 不 (bù)"),
                        WordToken("喜欢", "xǐ huan", "to like; to be fond of", "Kosakata HSK 2: 喜欢 (xǐ huan)"),
                        WordToken("人", "rén", "person; people", "Kosakata HSK 2: 人 (rén)"),
                        WordToken("山", "shān", "mountain; hill / (coll.) small bundle of straw for silkworms to spin cocoons on", "Kosakata HSK 2: 山 (shān)"),
                        WordToken("人", "rén", "person; people", "Kosakata HSK 2: 人 (rén)"),
                        WordToken("海", "hǎi", "ocean / sea / great number of people or things", "Kosakata HSK 2: 海 (hǎi)"),
                        WordToken("的", "de", "possessive particle (of; 's) / modifying particle (used after an attribute to modify a noun or to form a nominal expression)", "Kosakata HSK 2: 的 (de)"),
                        WordToken("地方", "dì fang", "place; location; area; space; territory / aspect; part", "Kosakata HSK 2: 地方 (dì fang)")
                    )
                ),
                Sentence(
                    id = "s_giftcl_4",
                    hanzi = "所以，现在我不知道送什么给他们。",
                    pinyin = "suǒ yǐ xiàn zài wǒ bù zhī dào sòng shén me gěi tā men",
                    translation = "Oleh karena itu, sampai saat ini aku masih bingung hadiah apa yang paling tepat untuk kuberikan kepada mereka.",
                    tokens = listOf(
                        WordToken("所以", "suǒ yǐ", "therefore / as a result / so", "Kosakata HSK 2: 所以 (suǒ yǐ)"),
                        WordToken("现在", "xiàn zài", "now; at present; currently", "Kosakata HSK 2: 现在 (xiàn zài)"),
                        WordToken("我", "wǒ", "I; me; my", "Kosakata HSK 2: 我 (wǒ)"),
                        WordToken("不", "bù", "no; not so", "Kosakata HSK 2: 不 (bù)"),
                        WordToken("知道", "zhī dào", "to know; to become aware of", "Kosakata HSK 2: 知道 (zhī dào)"),
                        WordToken("送", "sòng", "to give (as a present)", "Kosakata HSK 2: 送 (sòng)"),
                        WordToken("什么", "shén me", "what?", "Kosakata HSK 2: 什么 (shén me)"),
                        WordToken("给", "gěi", "to / for / for the benefit of / to do sth (for sb)", "Kosakata HSK 2: 给 (gěi)"),
                        WordToken("他们", "tā men", "they; them", "Kosakata HSK 2: 他们 (tā men)")
                    )
                ),
                Sentence(
                    id = "s_giftcl_5",
                    hanzi = "你们说呢？",
                    pinyin = "nǐ men shuō ne",
                    translation = "Bagaimana menurut pendapat kalian semua?",
                    tokens = listOf(
                        WordToken("你们", "nǐ men", "you (plural)", "Kosakata HSK 2: 你们 (nǐ men)"),
                        WordToken("说", "shuō", "to speak; to talk; to say", "Kosakata HSK 2: 说 (shuō)"),
                        WordToken("呢", "ne", "(sentence-final particle) used in questions to link back to prior discourse or context (\"what about...?\", \"and...?\")", "Kosakata HSK 2: 呢 (ne)")
                    )
                )
            ),
            questions = listOf(
                StoryQuestion(
                    id = "q_giftcl_1",
                    questionText = "漫长而寒冷的冬日时节，往往伴随着许多令人们翘首以盼的什么社会活动？ (Peristiwa apa yang marak terjadi di masyarakat selama musim dingin?)",
                    options = listOf("学生们全都在大街上露宿 (Para siswa tidur di jalanan)", "接踵而至的各种传统佳节、团聚庆典与走亲访友活动 (Aneka festival hari raya, reuni perayaan, dan silaturahmi keluarga)", "全城工厂全部停工半年 (Pabrik seisi kota berhenti beroperasi)", "禁止市民外出走动 (Warga dilarang bepergian keluar rumah)"),
                    correctAnswerIndex = 1,
                    explanation = "Musim dingin diramaikan oleh berbagai momen hari besar seperti Natal, Tahun Baru, dan Festival Musim Semi."
                ),
                StoryQuestion(
                    id = "q_giftcl_2",
                    questionText = "在喜庆祥和的节日氛围中，亲友之间表达深情厚谊与祝福的普遍习俗是什么？ (Tradisi umum apa yang dilakukan masyarakat untuk menunjukkan kasih sayang kepada orang terdekat?)",
                    options = listOf("互相赠送精选的礼物与慰问品以表心意 (Saling membeli dan memberikan bingkisan hadiah manis sebagai tanda kasih)", "互相向对方索要借款 (Saling meminjam uang)", "互相在网络上恶语相向 (Saling mencaci di dunia maya)", "闭门谢客装作彼此不认识 (Mengunci pintu pura-pura tidak saling kenal)"),
                    correctAnswerIndex = 0,
                    explanation = "Membeli bingkisan hadiah untuk orang tua, sahabat, dan kerabat adalah tradisi kehangatan musim dingin."
                ),
                StoryQuestion(
                    id = "q_giftcl_3",
                    questionText = "在准备挑选节庆礼物的过程中，主人公面临着怎样令他心生抗拒的现实烦恼？ (Persoalan pribadi apa yang membuat narator merasa enggan dan ragu pergi berbelanja?)",
                    options = listOf("全城所有商场货架全部空空如也 (Semua rak barang di mall kosong melompong)", "各大商业街与商场全都是人山人海，而他本人极度排斥和恐惧拥挤喧闹的场所 (Pusat perbelanjaan penuh sesak lautan manusia, sedangkan ia sangat tidak menyukai kerumunan ramai)", "天气太冷他的羽绒服破了 (Baju mantel tebalnya robek)", "所有的商品必须用黄金结账 (Semua barang wajib dibayar emas murni)"),
                    correctAnswerIndex = 1,
                    explanation = "Fobia kerumunan dan antrean panjang membuatnya malas berdesak-desakan di toko."
                ),
                StoryQuestion(
                    id = "q_giftcl_4",
                    questionText = "文章文末以开放式的提问“你们说呢”，向读者征求关于礼物真谛的什么深层思考？ (Pertanyaan reflektif apa yang diajukan penulis kepada pembaca di akhir kisah?)",
                    options = listOf("哪一家商场的防盗门最结实 (Pintu keamanan mall mana yang paling kokoh)", "在琳琅满目的物质消费与喧嚣之外，究竟怎样才能送出最得体、最走心且不随波逐流的心意？ (Di tengah konsumerisme materi, bingkisan tulus dan bermakna seperti apa yang paling tepat untuk dipersembahkan?)", "冬天最适合穿什么颜色的秋裤 (Celana hangat warna apa yang paling cocok di musim dingin)", "如何才能不给亲友回礼 (Bagaimana cara agar tidak perlu membalas kado orang lain)"),
                    correctAnswerIndex = 1,
                    explanation = "Esensi hadiah sejati terletak pada ketulusan cinta dan perhatian, bukan semata pada keramaian pusat perbelanjaan."
                )
            )
        ),
        // Cerita Mandarin Bean 183 (HSK 2): Get Back Home (Pulang ke Rumah)
        Story(
            id = "story_get_back_home",
            titleHanzi = "回家",
            titlePinyin = "Huí Jiā",
            titleTranslation = "Get Back Home (Pulang ke Rumah)",
            level = "HSK 2",
            category = "Keluarga & Kerinduan",
            description = "Perasaan hangat dan melegakan saat melangkahkan kaki kembali ke rumah tercinta setelah seharian lelah beraktivitas.",
            coverEmoji = "🏡",
            coverImageRes = R.drawable.cover_story_get_back_home,
            estimatedReadMinutes = 2,
            sentences = listOf(
                Sentence(
                    id = "s_bckhom_1",
                    hanzi = "丈夫、妻子和孩子一起开车回家。",
                    pinyin = "zhàng fu qī zi hé hái zi yī qǐ kāi chē huí jiā",
                    translation = "Sepasang suami istri bersama anak mereka berkendara mobil pulang ke apartemen kediaman mereka.",
                    tokens = listOf(
                        WordToken("丈夫", "zhàng fu", "husband", "Kosakata HSK 2: 丈夫 (zhàng fu)"),
                        WordToken("妻子", "qī zi", "wife", "Kosakata HSK 2: 妻子 (qī zi)"),
                        WordToken("和", "hé", "and; together with", "Kosakata HSK 2: 和 (hé)"),
                        WordToken("孩子", "hái zi", "child", "Kosakata HSK 2: 孩子 (hái zi)"),
                        WordToken("一起", "yī qǐ", "together; in company (with)", "Kosakata HSK 2: 一起 (yī qǐ)"),
                        WordToken("开车", "kāi chē", "to drive a car (or train etc) / (slang) to post sexual content online; to make a sexual joke", "Kosakata HSK 2: 开车 (kāi chē)"),
                        WordToken("回家", "huí jiā", "to return home", "Kosakata HSK 2: 回家 (huí jiā)")
                    )
                ),
                Sentence(
                    id = "s_bckhom_2",
                    hanzi = "他们的家在30楼。",
                    pinyin = "tā men de jiā zài lóu",
                    translation = "Apartemen tempat tinggal keluarga mereka terletak di lantai 30 sebuah gedung bertingkat tinggi.",
                    tokens = listOf(
                        WordToken("他们的", "tā men de", "their", "Kosakata HSK 2: 他们的 (tā men de)"),
                        WordToken("家", "jiā", "home / family / (polite) my (sister, uncle etc)", "Kosakata HSK 2: 家 (jiā)"),
                        WordToken("在", "zài", "(of sb or sth) to be (located) at", "Kosakata HSK 2: 在 (zài)"),
                        WordToken("楼", "lóu", "house with more than 1 story / storied building / floor", "Kosakata HSK 2: 楼 (lóu)")
                    )
                ),
                Sentence(
                    id = "s_bckhom_3",
                    hanzi = "大楼电梯有问题，今天不能坐电梯了。",
                    pinyin = "dà lóu diàn tī yǒu wèn tí jīn tiān bù néng zuò diàn tī le",
                    translation = "Hari itu lift gedung sedang mengalami gangguan teknis parah, sehingga sama sekali tidak dapat digunakan.",
                    tokens = listOf(
                        WordToken("大楼", "dà lóu", "building (a relatively large, multistory one)", "Kosakata HSK 2: 大楼 (dà lóu)"),
                        WordToken("电梯", "diàn tī", "elevator / escalator", "Kosakata HSK 2: 电梯 (diàn tī)"),
                        WordToken("有", "yǒu", "to have; there is", "Kosakata HSK 2: 有 (yǒu)"),
                        WordToken("问题", "wèn tí", "question / problem / issue / topic", "Kosakata HSK 2: 问题 (wèn tí)"),
                        WordToken("今天", "jīn tiān", "today", "Kosakata HSK 2: 今天 (jīn tiān)"),
                        WordToken("不", "bù", "no; not so", "Kosakata HSK 2: 不 (bù)"),
                        WordToken("能", "néng", "can / to be able to / might possibly", "Kosakata HSK 2: 能 (néng)"),
                        WordToken("坐", "zuò", "to sit / to take a seat / to take (a bus, airplane etc) / to bear fruit", "Kosakata HSK 2: 坐 (zuò)"),
                        WordToken("电梯", "diàn tī", "elevator / escalator", "Kosakata HSK 2: 电梯 (diàn tī)"),
                        WordToken("了", "le", "(completed action marker) / (modal particle indicating change of state, situation now)", "Kosakata HSK 2: 了 (le)")
                    )
                ),
                Sentence(
                    id = "s_bckhom_4",
                    hanzi = "他们都想回家睡觉。",
                    pinyin = "tā men dōu xiǎng huí jiā shuì jiào",
                    translation = "Mereka semua sudah sangat kelelahan dan hanya ingin segera sampai di kamar untuk tidur pulas.",
                    tokens = listOf(
                        WordToken("他们", "tā men", "they; them", "Kosakata HSK 2: 他们 (tā men)"),
                        WordToken("都", "dōu", "all; both; entirely", "Kosakata HSK 2: 都 (dōu)"),
                        WordToken("想", "xiǎng", "to desire; to want (to)", "Kosakata HSK 2: 想 (xiǎng)"),
                        WordToken("回家", "huí jiā", "to return home", "Kosakata HSK 2: 回家 (huí jiā)"),
                        WordToken("睡觉", "shuì jiào", "to go to bed / to sleep", "Kosakata HSK 2: 睡觉 (shuì jiào)")
                    )
                ),
                Sentence(
                    id = "s_bckhom_5",
                    hanzi = "三个人一起走楼梯回家，一边唱歌，一边走，这样就不那么累了。",
                    pinyin = "sān gè rén yī qǐ zǒu lóu tī huí jiā yī biān chàng gē yī biān zǒu zhè yàng jiù bù nà me lèi le",
                    translation = "Ketiganya memutuskan berjalan mendaki tangga darurat sambil bernyanyi bersama; mendaki sambil bernyanyi membuat langkah kaki terasa tidak terlalu melelahkan.",
                    tokens = listOf(
                        WordToken("三", "sān", "three / 3", "Kosakata HSK 2: 三 (sān)"),
                        WordToken("个", "gè", "classifier for people or objects in general", "Kosakata HSK 2: 个 (gè)"),
                        WordToken("人", "rén", "person; people", "Kosakata HSK 2: 人 (rén)"),
                        WordToken("一起", "yī qǐ", "together; in company (with)", "Kosakata HSK 2: 一起 (yī qǐ)"),
                        WordToken("走", "zǒu", "to walk / to go / to run / to move (of vehicle) / to visit / to leave / to go away / to die (euph.) / to change (shape, form, meaning)", "Kosakata HSK 2: 走 (zǒu)"),
                        WordToken("楼梯", "lóu tī", "stair / staircase", "Kosakata HSK 2: 楼梯 (lóu tī)"),
                        WordToken("回", "huí", "to go back / to turn around / to answer / to return", "Kosakata HSK 2: 回 (huí)"),
                        WordToken("家", "jiā", "home / family / (polite) my (sister, uncle etc)", "Kosakata HSK 2: 家 (jiā)"),
                        WordToken("一边", "yī biān", "on the one hand / on the other hand / doing while", "Kosakata HSK 2: 一边 (yī biān)"),
                        WordToken("唱歌", "chàng gē", "to sing a song", "Kosakata HSK 2: 唱歌 (chàng gē)"),
                        WordToken("一边", "yī biān", "on the one hand / on the other hand / doing while", "Kosakata HSK 2: 一边 (yī biān)"),
                        WordToken("走", "zǒu", "to walk / to go / to run / to move (of vehicle) / to visit / to leave / to go away / to die (euph.) / to change (shape, form, meaning)", "Kosakata HSK 2: 走 (zǒu)"),
                        WordToken("这样", "zhè yàng", "this way; like this; so", "Kosakata HSK 2: 这样 (zhè yàng)"),
                        WordToken("就", "jiù", "in that case; then", "Kosakata HSK 2: 就 (jiù)"),
                        WordToken("不", "bù", "no; not so", "Kosakata HSK 2: 不 (bù)"),
                        WordToken("那么", "nà me", "like that; in that way; to that extent", "Kosakata HSK 2: 那么 (nà me)"),
                        WordToken("累", "lèi", "tired / weary", "Kosakata HSK 2: 累 (lèi)"),
                        WordToken("了", "le", "(completed action marker) / (modal particle indicating change of state, situation now)", "Kosakata HSK 2: 了 (le)")
                    )
                ),
                Sentence(
                    id = "s_bckhom_6",
                    hanzi = "他们一个人唱一首歌，唱了10首，这时他们走到了第29楼，大家都觉得很累。",
                    pinyin = "tā men yī gè rén chàng yī shǒu gē chàng le shǒu zhè shí tā men zǒu dào le dì lóu dà jiā dōu jué de hěn lèi",
                    translation = "Masing-masing bernyanyi bergiliran hingga sepuluh lagu usai dinyanyikan; pada saat itu mereka akhirnya berhasil mencapai lantai 29 dengan napas tersengal-sengal.",
                    tokens = listOf(
                        WordToken("他们", "tā men", "they; them", "Kosakata HSK 2: 他们 (tā men)"),
                        WordToken("一", "yī", "one / single / a (article)", "Kosakata HSK 2: 一 (yī)"),
                        WordToken("个", "gè", "classifier for people or objects in general", "Kosakata HSK 2: 个 (gè)"),
                        WordToken("人", "rén", "person; people", "Kosakata HSK 2: 人 (rén)"),
                        WordToken("唱", "chàng", "to sing / to call loudly / to chant", "Kosakata HSK 2: 唱 (chàng)"),
                        WordToken("一", "yī", "one / single / a (article)", "Kosakata HSK 2: 一 (yī)"),
                        WordToken("首", "shǒu", "classifier for poems, songs etc", "Kosakata HSK 2: 首 (shǒu)"),
                        WordToken("歌", "gē", "song", "Kosakata HSK 2: 歌 (gē)"),
                        WordToken("唱", "chàng", "to sing / to call loudly / to chant", "Kosakata HSK 2: 唱 (chàng)"),
                        WordToken("了", "le", "(completed action marker) / (modal particle indicating change of state, situation now)", "Kosakata HSK 2: 了 (le)"),
                        WordToken("首", "shǒu", "classifier for poems, songs etc", "Kosakata HSK 2: 首 (shǒu)"),
                        WordToken("这", "zhè", "now; this moment", "Kosakata HSK 2: 这 (zhè)"),
                        WordToken("时", "shí", "o'clock / time / hour / season / period", "Kosakata HSK 2: 时 (shí)"),
                        WordToken("他们", "tā men", "they; them", "Kosakata HSK 2: 他们 (tā men)"),
                        WordToken("走", "zǒu", "to walk / to go / to run / to move (of vehicle) / to visit / to leave / to go away / to die (euph.) / to change (shape, form, meaning)", "Kosakata HSK 2: 走 (zǒu)"),
                        WordToken("到", "dào", "to reach; to arrive / to (a place); until (a time); up to (a point) / (verb complement indicating arriving at a place or reaching a point)", "Kosakata HSK 2: 到 (dào)"),
                        WordToken("了", "le", "(completed action marker) / (modal particle indicating change of state, situation now)", "Kosakata HSK 2: 了 (le)"),
                        WordToken("第", "dì", "(prefix indicating ordinal number)", "Kosakata HSK 2: 第 (dì)"),
                        WordToken("楼", "lóu", "house with more than 1 story / storied building / floor", "Kosakata HSK 2: 楼 (lóu)"),
                        WordToken("大家", "dà jiā", "everyone", "Kosakata HSK 2: 大家 (dà jiā)"),
                        WordToken("都", "dōu", "all; both; entirely", "Kosakata HSK 2: 都 (dōu)"),
                        WordToken("觉得", "jué de", "to feel (uncomfortable etc)", "Kosakata HSK 2: 觉得 (jué de)"),
                        WordToken("很", "hěn", "very; quite", "Kosakata HSK 2: 很 (hěn)"),
                        WordToken("累", "lèi", "tired / weary", "Kosakata HSK 2: 累 (lèi)")
                    )
                ),
                Sentence(
                    id = "s_bckhom_7",
                    hanzi = "妻子很高兴“我们再唱一首歌，就到家了。”",
                    pinyin = "qī zi hěn gāo xìng wǒ men zài chàng yī shǒu gē jiù dào jiā le",
                    translation = "Sang istri dengan wajah berbinar berseru riang: “Tinggal satu lagu lagi kita nyanyikan bersama, kita sudah sampai di depan pintu rumah!”",
                    tokens = listOf(
                        WordToken("妻子", "qī zi", "wife", "Kosakata HSK 2: 妻子 (qī zi)"),
                        WordToken("很", "hěn", "very; quite", "Kosakata HSK 2: 很 (hěn)"),
                        WordToken("高兴", "gāo xìng", "happy / glad / in a cheerful mood", "Kosakata HSK 2: 高兴 (gāo xìng)"),
                        WordToken("我们", "wǒ men", "we; us; ourselves; our", "Kosakata HSK 2: 我们 (wǒ men)"),
                        WordToken("再", "zài", "again; once more; re-", "Kosakata HSK 2: 再 (zài)"),
                        WordToken("唱", "chàng", "to sing / to call loudly / to chant", "Kosakata HSK 2: 唱 (chàng)"),
                        WordToken("一", "yī", "one / single / a (article)", "Kosakata HSK 2: 一 (yī)"),
                        WordToken("首", "shǒu", "classifier for poems, songs etc", "Kosakata HSK 2: 首 (shǒu)"),
                        WordToken("歌", "gē", "song", "Kosakata HSK 2: 歌 (gē)"),
                        WordToken("就", "jiù", "merely; nothing else but; simply; just; precisely; exactly", "Kosakata HSK 2: 就 (jiù)"),
                        WordToken("到", "dào", "to reach; to arrive / to (a place); until (a time); up to (a point) / (verb complement indicating arriving at a place or reaching a point)", "Kosakata HSK 2: 到 (dào)"),
                        WordToken("家", "jiā", "home / family / (polite) my (sister, uncle etc)", "Kosakata HSK 2: 家 (jiā)"),
                        WordToken("了", "le", "(completed action marker) / (modal particle indicating change of state, situation now)", "Kosakata HSK 2: 了 (le)")
                    )
                ),
                Sentence(
                    id = "s_bckhom_8",
                    hanzi = "丈夫说：“是的，但是……钥匙在车里。”",
                    pinyin = "zhàng fu shuō shì de dàn shì yào shi zài chē lǐ",
                    translation = "Sang suami menatapnya pucat pasi lalu berbisik lemas: “Iya benar... tapi masalahnya, kunci rumah kita tertinggal di dalam mobil di lantai bawah!”",
                    tokens = listOf(
                        WordToken("丈夫", "zhàng fu", "husband", "Kosakata HSK 2: 丈夫 (zhàng fu)"),
                        WordToken("说", "shuō", "to speak; to talk; to say", "Kosakata HSK 2: 说 (shuō)"),
                        WordToken("是的", "shì de", "yes, that's right", "Kosakata HSK 2: 是的 (shì de)"),
                        WordToken("但是", "dàn shì", "but; however", "Kosakata HSK 2: 但是 (dàn shì)"),
                        WordToken("钥匙", "yào shi", "key", "Kosakata HSK 2: 钥匙 (yào shi)"),
                        WordToken("在", "zài", "(of sb or sth) to be (located) at", "Kosakata HSK 2: 在 (zài)"),
                        WordToken("车", "chē", "car / vehicle / machine", "Kosakata HSK 2: 车 (chē)"),
                        WordToken("里", "lǐ", "lining / interior / inside", "Kosakata HSK 2: 里 (lǐ)")
                    )
                )
            ),
            questions = listOf(
                StoryQuestion(
                    id = "q_bckhom_1",
                    questionText = "驾车疲惫归来的一家三口，他们温馨的家安设在大厦的哪一楼层？ (Di lantai berapakah unit apartemen kediaman keluarga kecil tersebut?)",
                    options = listOf("位于地下一层车库旁 (Di lantai dasar bawah tanah)", "位于高耸入云的第30层 (Terletak di lantai ke-30 sebuah gedung bertingkat tinggi)", "位于第3层的小平房 (Di lantai 3 rumah susun)", "位于顶层第100层 (Di puncak gedung lantai 100)"),
                    correctAnswerIndex = 1,
                    explanation = "Tempat tinggal mereka berada di lantai 30 sebuah gedung apartemen modern."
                ),
                StoryQuestion(
                    id = "q_bckhom_2",
                    questionText = "当他们精疲力竭只想早点上床睡觉时，大厦物业却发生了什么灾难性的故障？ (Kendala teknis apa yang menghadang mereka setibanya di lobi apartemen?)",
                    options = listOf("整个小区发生了煤气泄漏 (Terjadi kebocoran gas di perumahan)", "大厦唯一的公共电梯发生故障停运，今天完全无法乘坐！ (Lift utama gedung mengalami kerusakan fatal dan berhenti beroperasi total!)", "大厦大门被铁链锁住了 (Pintu gerbang digembok rantai)", "楼道里有流浪野狗挡路 (Ada anjing liar menghalangi lorong)"),
                    correctAnswerIndex = 1,
                    explanation = "Kerusakan lift memaksa mereka harus menaiki tangga manual darurat setinggi 30 lantai."
                ),
                StoryQuestion(
                    id = "q_bckhom_3",
                    questionText = "为了克服攀登漫长30层楼梯的沉重疲惫，机智的三口之家发明了什么心理调节法？ (Metode apa yang mereka ciptakan bersama untuk mengatasi kelelahan mendaki tangga?)",
                    options = listOf("在楼梯间里拼命赛跑冲刺 (Balapan lari cepat di tangga)", "三人一边走一边轮流唱歌，用欢声笑语转移肉体上的劳累 (Mendaki sambil bergiliran bernyanyi riang agar rasa lelah teralihkan)", "每上一层楼梯就坐在台阶上吃零食 (Duduk makan cemilan di setiap anak tangga)", "闭着眼睛倒退着爬楼梯 (Berjalan mundur dengan mata terpejam)"),
                    correctAnswerIndex = 1,
                    explanation = "Bernyanyi lagu bersama secara bergiliran membuat proses mendaki tangga puluhan lantai terasa menyenangkan."
                ),
                StoryQuestion(
                    id = "q_bckhom_4",
                    questionText = "在唱完第十首歌胜利登上第29层的大功告成之际，丈夫说出了什么让人彻底崩溃的黑色幽默真相？ (Fakta pahit apa yang dibisikkan sang suami saat mereka tiba di depan lantai 29?)",
                    options = listOf("他突然想起来自己的钱包被偷了 (Dompet uangnya baru saja dicopet)", "虽然只差一层就能到家，但是……进门的钥匙忘在地下车库的车里了！ (Tinggal satu lantai lagi sampai ke pintu rumah, tapi... kuncinya tertinggal di dalam mobil di bawah!)", "今天其实是星期天不用上班 (Hari ini ternyata hari libur)", "他们走错到了邻居家单元楼 (Mereka salah masuk gedung apartemen tetangga)"),
                    correctAnswerIndex = 1,
                    explanation = "Puncak ironi lelucon: setelah bersusah payah mendaki 29 lantai dengan bernyanyi gembira, kuncinya justru tertinggal di mobil di lantai dasar!"
                )
            )
        ),
        // Cerita Mandarin Bean 184 (HSK 2): Winter Solstice Festival (Festival Titik Balik Musim Dingin)
        Story(
            id = "story_winter_solstice_festival",
            titleHanzi = "冬至",
            titlePinyin = "Dōngzhì",
            titleTranslation = "Winter Solstice Festival (Festival Titik Balik Musim Dingin)",
            level = "HSK 2",
            category = "Budaya & Kuliner",
            description = "Tradisi makan ronde manis tangyuan dan pangsit jiaozi hangat bersama keluarga saat malam terpanjang dalam setahun.",
            coverEmoji = "🥟",
            coverImageRes = R.drawable.cover_story_winter_solstice_festival,
            estimatedReadMinutes = 2,
            sentences = listOf(
                Sentence(
                    id = "s_wntsol_1",
                    hanzi = "12月22日是今年的第22个节气—冬至。",
                    pinyin = "yuè rì shì jīn nián de dì gè jié qì Dōng zhì",
                    translation = "Tanggal 22 Desember menandai tibanya pos musim ke-22 dalam penanggalan tradisional Tiongkok, yaitu Titik Balik Musim Dingin (Dongzhi).",
                    tokens = listOf(
                        WordToken("月", "yuè", "month / monthly", "Kosakata HSK 2: 月 (yuè)"),
                        WordToken("日", "rì", "sun / day / date, day of the month", "Kosakata HSK 2: 日 (rì)"),
                        WordToken("是", "shì", "to be (followed by substantives only)", "Kosakata HSK 2: 是 (shì)"),
                        WordToken("今年", "jīn nián", "this year", "Kosakata HSK 2: 今年 (jīn nián)"),
                        WordToken("的", "de", "possessive particle (of; 's) / modifying particle (used after an attribute to modify a noun or to form a nominal expression)", "Kosakata HSK 2: 的 (de)"),
                        WordToken("第", "dì", "(prefix indicating ordinal number)", "Kosakata HSK 2: 第 (dì)"),
                        WordToken("个", "gè", "classifier for people or objects in general", "Kosakata HSK 2: 个 (gè)"),
                        WordToken("节气", "jié qì", "solar term", "Kosakata HSK 2: 节气 (jié qì)"),
                        WordToken("冬至", "Dōng zhì", "Winter Solstice, 22nd of the 24 solar terms", "Kosakata HSK 2: 冬至 (Dōng zhì)")
                    )
                ),
                Sentence(
                    id = "s_wntsol_2",
                    hanzi = "这一天，北半球晚上最长，白天最短。",
                    pinyin = "zhè yī tiān běi bàn qiú wǎn shang zuì cháng bái tiān zuì duǎn",
                    translation = "Pada hari istimewa ini di belahan bumi utara, malam hari berdurasi paling panjang dan siang hari berlangsung paling singkat dalam setahun.",
                    tokens = listOf(
                        WordToken("这", "zhè", "this; these", "Kosakata HSK 2: 这 (zhè)"),
                        WordToken("一", "yī", "one / single / a (article)", "Kosakata HSK 2: 一 (yī)"),
                        WordToken("天", "tiān", "day", "Kosakata HSK 2: 天 (tiān)"),
                        WordToken("北", "běi", "north", "Kosakata HSK 2: 北 (běi)"),
                        WordToken("半球", "bàn qiú", "hemisphere", "Kosakata HSK 2: 半球 (bàn qiú)"),
                        WordToken("晚上", "wǎn shang", "evening / night", "Kosakata HSK 2: 晚上 (wǎn shang)"),
                        WordToken("最", "zuì", "(before an adjective or verb) to the highest degree; (the) most ...; -est", "Kosakata HSK 2: 最 (zuì)"),
                        WordToken("长", "cháng", "long", "Kosakata HSK 2: 长 (cháng)"),
                        WordToken("白天", "bái tiān", "daytime / day", "Kosakata HSK 2: 白天 (bái tiān)"),
                        WordToken("最", "zuì", "(before an adjective or verb) to the highest degree; (the) most ...; -est", "Kosakata HSK 2: 最 (zuì)"),
                        WordToken("短", "duǎn", "short / brief", "Kosakata HSK 2: 短 (duǎn)")
                    )
                ),
                Sentence(
                    id = "s_wntsol_3",
                    hanzi = "因为这是冬天，所以天气很冷。",
                    pinyin = "yīn wèi zhè shì dōng tiān suǒ yǐ tiān qì hěn lěng",
                    translation = "Karena telah berada di puncak musim dingin, suhu udara di luar terasa sangat menusuk tulang.",
                    tokens = listOf(
                        WordToken("因为", "yīn wèi", "because; owing to; on account of", "Kosakata HSK 2: 因为 (yīn wèi)"),
                        WordToken("这", "zhè", "this; these", "Kosakata HSK 2: 这 (zhè)"),
                        WordToken("是", "shì", "to be (followed by substantives only)", "Kosakata HSK 2: 是 (shì)"),
                        WordToken("冬天", "dōng tiān", "winter", "Kosakata HSK 2: 冬天 (dōng tiān)"),
                        WordToken("所以", "suǒ yǐ", "therefore / as a result / so", "Kosakata HSK 2: 所以 (suǒ yǐ)"),
                        WordToken("天气", "tiān qì", "weather", "Kosakata HSK 2: 天气 (tiān qì)"),
                        WordToken("很", "hěn", "very; quite", "Kosakata HSK 2: 很 (hěn)"),
                        WordToken("冷", "lěng", "cold", "Kosakata HSK 2: 冷 (lěng)")
                    )
                ),
                Sentence(
                    id = "s_wntsol_4",
                    hanzi = "冬至的时候，中国人会吃饺子、羊肉、馄饨、豆腐、汤圆。",
                    pinyin = "Dōng zhì de shí hou Zhōng guó rén huì chī jiǎo zi yáng ròu hún tun dòu fu tāng yuán",
                    translation = "Saat festival Dongzhi tiba, masyarakat Tiongkok memiliki tradisi menyantap pangsit jiaozi hangat, sup daging kambing, wonton, tahu, dan ronde manis tangyuan.",
                    tokens = listOf(
                        WordToken("冬至", "Dōng zhì", "Winter Solstice, 22nd of the 24 solar terms", "Kosakata HSK 2: 冬至 (Dōng zhì)"),
                        WordToken("的", "de", "possessive particle (of; 's) / modifying particle (used after an attribute to modify a noun or to form a nominal expression)", "Kosakata HSK 2: 的 (de)"),
                        WordToken("时候", "shí hou", "time / length of time / moment / period", "Kosakata HSK 2: 时候 (shí hou)"),
                        WordToken("中国人", "Zhōng guó rén", "Chinese person", "Kosakata HSK 2: 中国人 (Zhōng guó rén)"),
                        WordToken("会", "huì", "to be likely to; to be sure to", "Kosakata HSK 2: 会 (huì)"),
                        WordToken("吃", "chī", "to eat; to consume / to eat at", "Kosakata HSK 2: 吃 (chī)"),
                        WordToken("饺子", "jiǎo zi", "dumpling / pot-sticker", "Kosakata HSK 2: 饺子 (jiǎo zi)"),
                        WordToken("羊肉", "yáng ròu", "mutton / goat meat", "Kosakata HSK 2: 羊肉 (yáng ròu)"),
                        WordToken("馄饨", "hún tun", "wonton; Chinese ravioli (served in soup)", "Kosakata HSK 2: 馄饨 (hún tun)"),
                        WordToken("豆腐", "dòu fu", "tofu / bean curd", "Kosakata HSK 2: 豆腐 (dòu fu)"),
                        WordToken("汤圆", "tāng yuán", "boiled or deep-fried balls of glutinous rice flour, usually eaten during Lantern Festival", "Kosakata HSK 2: 汤圆 (tāng yuán)")
                    )
                ),
                Sentence(
                    id = "s_wntsol_5",
                    hanzi = "在中国，这是很重要的一天，有“冬至大似年”的说法。",
                    pinyin = "zài Zhōng guó zhè shì hěn zhòng yào de yī tiān yǒu dōng zhì dà sì nián de shuō fa",
                    translation = "Di Tiongkok, perayaan Dongzhi merupakan hari yang teramat agung dan penting, hingga melahirkan pepatah kuno terkenal: ‘Makna Dongzhi setara agungnya dengan Tahun Baru Imlek’ (Dōngzhì dà sì nián).",
                    tokens = listOf(
                        WordToken("在", "zài", "(of sb or sth) to be (located) at", "Kosakata HSK 2: 在 (zài)"),
                        WordToken("中国", "Zhōng guó", "China", "Kosakata HSK 2: 中国 (Zhōng guó)"),
                        WordToken("这", "zhè", "this; these", "Kosakata HSK 2: 这 (zhè)"),
                        WordToken("是", "shì", "to be (followed by substantives only)", "Kosakata HSK 2: 是 (shì)"),
                        WordToken("很", "hěn", "very; quite", "Kosakata HSK 2: 很 (hěn)"),
                        WordToken("重要", "zhòng yào", "important; significant; major", "Kosakata HSK 2: 重要 (zhòng yào)"),
                        WordToken("的", "de", "possessive particle (of; 's) / modifying particle (used after an attribute to modify a noun or to form a nominal expression)", "Kosakata HSK 2: 的 (de)"),
                        WordToken("一", "yī", "one / single / a (article)", "Kosakata HSK 2: 一 (yī)"),
                        WordToken("天", "tiān", "day", "Kosakata HSK 2: 天 (tiān)"),
                        WordToken("有", "yǒu", "to have; there is", "Kosakata HSK 2: 有 (yǒu)"),
                        WordToken("冬至大似年", "dōng zhì dà sì nián", "an old saying that the Winter Solstice is as important as the Chinese New Year", "Kosakata HSK 2: 冬至大似年 (dōng zhì dà sì nián)"),
                        WordToken("的", "de", "possessive particle (of; 's) / modifying particle (used after an attribute to modify a noun or to form a nominal expression)", "Kosakata HSK 2: 的 (de)"),
                        WordToken("说法", "shuō fa", "way of speaking / wording / formulation / one's version (of events) / statement / theory / hypothesis / interpretation", "Kosakata HSK 2: 说法 (shuō fa)")
                    )
                )
            ),
            questions = listOf(
                StoryQuestion(
                    id = "q_wntsol_1",
                    questionText = "在每年的12月22日前后，中国民间迎来二十四节气中极具分量的哪一个重要节气？ (Pos musim penting apa yang jatuh pada tanggal 22 Desember setiap tahunnya?)",
                    options = listOf("春分 (Titik Musim Semi / Chunfen)", "冬至（北半球夜最长、昼最短的一天） (Titik Balik Musim Dingin / Dongzhi - malam terpanjang dan siang tersingkat)", "夏至 (Titik Balik Musim Panas / Xiazhi)", "秋分 (Titik Musim Gugur / Qiufen)"),
                    correctAnswerIndex = 1,
                    explanation = "Dongzhi (Winter Solstice) adalah pos musim ke-22 yang menandai puncak malam terpanjang di belahan bumi utara."
                ),
                StoryQuestion(
                    id = "q_wntsol_2",
                    questionText = "冬至这天在天文学与昼夜交替现象上，呈现出怎样的极端自然规律？ (Fenomena alam astronomis apa yang terjadi tepat pada hari Dongzhi?)",
                    options = listOf("太阳二十四小时永不落山 (Matahari tidak pernah terbenam selama 24 jam)", "北半球夜幕时间达到全年最长，而白昼光照时间达到全年最短 (Malam hari mencapai durasi paling lama, dan siang hari berlangsung paling pendek dalam setahun)", "全天昼夜时间完全等长各占十二小时 (Siang dan malam berdurasi seimbang sama rata 12 jam)", "天空中会出现两颗月亮 (Terlihat dua buah bulan di langit)"),
                    correctAnswerIndex = 1,
                    explanation = "Di belahan bumi utara, hari Dongzhi memiliki durasi siang tersingkat dan malam terpanjang."
                ),
                StoryQuestion(
                    id = "q_wntsol_3",
                    questionText = "中华饮食文化在冬至节气有着极为讲究的节令美食谱系，文中提到了哪些温补珍馐？ (Hidangan kuliner tradisional apa sajakah yang disantap masyarakat Tiongkok pada festival Dongzhi?)",
                    options = listOf("冰镇可乐与生鱼片沙拉 (Minuman soda dingin dan salad ikan mentah)", "热气腾腾的饺子、滋补羊肉、皮薄馅嫩的馄饨、豆腐以及甜蜜团圆的汤圆 (Pangsit jiaozi hangat, daging kambing bernutrisi, wonton, tahu, dan ronde manis tangyuan)", "西式炸鸡与汉堡包 (Ayam goreng tepung dan burger)", "麻辣小龙虾与生蚝 (Lobster pedas dan tiram mentah)"),
                    correctAnswerIndex = 1,
                    explanation = "Pangsit jiaozi di utara dan ronde tangyuan di selatan merupakan santapan wajib penghangat tubuh saat Dongzhi."
                ),
                StoryQuestion(
                    id = "q_wntsol_4",
                    questionText = "民间俗语所常言的“冬至大似年”，深刻体现了古代社会对冬至怀有怎样崇高的社会定位？ (Arti pepatah kuno 'Dōngzhì dà sì nián' menggambarkan penghormatan seperti apa terhadap hari Dongzhi?)",
                    options = listOf("冬至那天的饭菜价格比过年还要贵 (Harga makanan hari Dongzhi lebih mahal dari Imlek)", "冬至节气所承载的家族祭祖、阖家团圆与祈福仪式感，其神圣重要性堪比甚至超越了过大年！ (Makna ritual penghormatan leluhur, kehangatan keluarga, dan harapan berkah Dongzhi setara agungnya dengan perayaan Tahun Baru Imlek)", "冬至过后所有人都必须年长两岁 (Setelah Dongzhi semua orang bertambah umur dua tahun)", "冬至当天严禁任何人出家门 (Dilarang keluar rumah saat perayaan Dongzhi)"),
                    correctAnswerIndex = 1,
                    explanation = "Pepatah 'Dongzhi setara agungnya dengan Tahun Baru Imlek' mencerminkan bobot kultural sakral festival titik balik matahari musim dingin ini."
                )
            )
        ),
        // Cerita Mandarin Bean 185 (HSK 2): Heavy Snow (Salju Lebat Daxue)
        Story(
            id = "story_heavy_snow",
            titleHanzi = "大雪",
            titlePinyin = "Dàxuě",
            titleTranslation = "Heavy Snow (Salju Lebat Daxue)",
            level = "HSK 2",
            category = "Musim & Tradisi",
            description = "Pos musim ke-21 penanggalan Tiongkok saat salju tebal menyelimuti bumi, saatnya menikmati sup daging kambing hangat.",
            coverEmoji = "❄️",
            coverImageRes = R.drawable.cover_story_heavy_snow,
            estimatedReadMinutes = 2,
            sentences = listOf(
                Sentence(
                    id = "s_hvysnw_1",
                    hanzi = "中国有24个节气。",
                    pinyin = "Zhōng guó yǒu gè jié qì",
                    translation = "Penanggalan tradisional Tiongkok terbagi menjadi 24 pos musim (Solar Terms) yang harmonis dengan ritme alam semesta.",
                    tokens = listOf(
                        WordToken("中国", "Zhōng guó", "China", "Kosakata HSK 2: 中国 (Zhōng guó)"),
                        WordToken("有", "yǒu", "to have; there is", "Kosakata HSK 2: 有 (yǒu)"),
                        WordToken("个", "gè", "classifier for people or objects in general", "Kosakata HSK 2: 个 (gè)"),
                        WordToken("节气", "jié qì", "solar term", "Kosakata HSK 2: 节气 (jié qì)")
                    )
                ),
                Sentence(
                    id = "s_hvysnw_2",
                    hanzi = "今天开始第21个节气——大雪。",
                    pinyin = "jīn tiān kāi shǐ dì gè jié qì Dà xuě",
                    translation = "Hari ini menandai dimulainya pos musim ke-21 dalam siklus tahunan, yaitu Daxue (Salju Lebat).",
                    tokens = listOf(
                        WordToken("今天", "jīn tiān", "today", "Kosakata HSK 2: 今天 (jīn tiān)"),
                        WordToken("开始", "kāi shǐ", "to begin / to start", "Kosakata HSK 2: 开始 (kāi shǐ)"),
                        WordToken("第", "dì", "(prefix indicating ordinal number)", "Kosakata HSK 2: 第 (dì)"),
                        WordToken("个", "gè", "classifier for people or objects in general", "Kosakata HSK 2: 个 (gè)"),
                        WordToken("节气", "jié qì", "solar term", "Kosakata HSK 2: 节气 (jié qì)"),
                        WordToken("大雪", "Dà xuě", "Daxue or Great Snow, 21st of the 24 solar terms", "Kosakata HSK 2: 大雪 (Dà xuě)")
                    )
                ),
                Sentence(
                    id = "s_hvysnw_3",
                    hanzi = "在这个节气，雪会越来越大，气温下降很多，天气也更冷。",
                    pinyin = "zài zhè gè jié qì xuě huì yuè lái yuè dà qì wēn xià jiàng hěn duō tiān qì yě gèng lěng",
                    translation = "Memasuki pos musim Daxue, intensitas curah salju akan semakin sering dan lebat, suhu udara anjlok drastis, dan cuaca menjadi jauh lebih dingin menggigil.",
                    tokens = listOf(
                        WordToken("在", "zài", "(of sb or sth) to be (located) at", "Kosakata HSK 2: 在 (zài)"),
                        WordToken("这", "zhè", "this; these", "Kosakata HSK 2: 这 (zhè)"),
                        WordToken("个", "gè", "classifier for people or objects in general", "Kosakata HSK 2: 个 (gè)"),
                        WordToken("节气", "jié qì", "solar term", "Kosakata HSK 2: 节气 (jié qì)"),
                        WordToken("雪", "xuě", "snow", "Kosakata HSK 2: 雪 (xuě)"),
                        WordToken("会", "huì", "to be likely to; to be sure to", "Kosakata HSK 2: 会 (huì)"),
                        WordToken("越来越", "yuè lái yuè", "more and more", "Kosakata HSK 2: 越来越 (yuè lái yuè)"),
                        WordToken("大", "dà", "big; large; great / older (than another person) / eldest", "Kosakata HSK 2: 大 (dà)"),
                        WordToken("气温", "qì wēn", "air temperature", "Kosakata HSK 2: 气温 (qì wēn)"),
                        WordToken("下降", "xià jiàng", "to decline / to drop / to fall / to go down / to decrease", "Kosakata HSK 2: 下降 (xià jiàng)"),
                        WordToken("很", "hěn", "very; quite", "Kosakata HSK 2: 很 (hěn)"),
                        WordToken("多", "duō", "many; much; more; a lot of", "Kosakata HSK 2: 多 (duō)"),
                        WordToken("天气", "tiān qì", "weather", "Kosakata HSK 2: 天气 (tiān qì)"),
                        WordToken("也", "yě", "also; too; as well; (not ...) either", "Kosakata HSK 2: 也 (yě)"),
                        WordToken("更", "gèng", "more / even more / further / still / still more", "Kosakata HSK 2: 更 (gèng)"),
                        WordToken("冷", "lěng", "cold", "Kosakata HSK 2: 冷 (lěng)")
                    )
                ),
                Sentence(
                    id = "s_hvysnw_4",
                    hanzi = "大家应该多喝水，多穿衣服，不要生病。",
                    pinyin = "dà jiā yīng gāi duō hē shuǐ duō chuān yī fu bù yào shēng bìng",
                    translation = "Masyarakat dianjurkan untuk memperbanyak minum air hangat, mengenakan busana tebal berlapis, dan menjaga daya tahan tubuh agar tidak mudah terserang flu.",
                    tokens = listOf(
                        WordToken("大家", "dà jiā", "everyone", "Kosakata HSK 2: 大家 (dà jiā)"),
                        WordToken("应该", "yīng gāi", "ought to; should; must", "Kosakata HSK 2: 应该 (yīng gāi)"),
                        WordToken("多", "duō", "many; much; more; a lot of", "Kosakata HSK 2: 多 (duō)"),
                        WordToken("喝", "hē", "to drink", "Kosakata HSK 2: 喝 (hē)"),
                        WordToken("水", "shuǐ", "water / (after a name) ... River / (bound form) additional cost; extra income", "Kosakata HSK 2: 水 (shuǐ)"),
                        WordToken("多", "duō", "many; much; more; a lot of", "Kosakata HSK 2: 多 (duō)"),
                        WordToken("穿", "chuān", "to wear / to put on / to dress", "Kosakata HSK 2: 穿 (chuān)"),
                        WordToken("衣服", "yī fu", "clothes", "Kosakata HSK 2: 衣服 (yī fu)"),
                        WordToken("不要", "bù yào", "don't!; must not", "Kosakata HSK 2: 不要 (bù yào)"),
                        WordToken("生病", "shēng bìng", "to fall ill", "Kosakata HSK 2: 生病 (shēng bìng)")
                    )
                ),
                Sentence(
                    id = "s_hvysnw_5",
                    hanzi = "中医认为，这个时候我们要多喝热粥，吃羊肉。",
                    pinyin = "zhōng yī rèn wéi zhè gè shí hou wǒ men yào duō hē rè zhōu chī yáng ròu",
                    translation = "Pakar pengobatan tradisional Tiongkok (TCM) menganjurkan pada musim ini untuk mengonsumsi bubur hangat bergizi dan sup daging kambing penghangat tubuh.",
                    tokens = listOf(
                        WordToken("中医", "zhōng yī", "traditional Chinese medical science / a doctor trained in Chinese medicine", "Kosakata HSK 2: 中医 (zhōng yī)"),
                        WordToken("认为", "rèn wéi", "to believe; to think; to consider; to feel", "Kosakata HSK 2: 认为 (rèn wéi)"),
                        WordToken("这", "zhè", "this; these", "Kosakata HSK 2: 这 (zhè)"),
                        WordToken("个", "gè", "classifier for people or objects in general", "Kosakata HSK 2: 个 (gè)"),
                        WordToken("时候", "shí hou", "time / length of time / moment / period", "Kosakata HSK 2: 时候 (shí hou)"),
                        WordToken("我们", "wǒ men", "we; us; ourselves; our", "Kosakata HSK 2: 我们 (wǒ men)"),
                        WordToken("要", "yào", "will; shall; about to / need to; should / if", "Kosakata HSK 2: 要 (yào)"),
                        WordToken("多", "duō", "many; much; more; a lot of", "Kosakata HSK 2: 多 (duō)"),
                        WordToken("喝", "hē", "to drink", "Kosakata HSK 2: 喝 (hē)"),
                        WordToken("热", "rè", "hot (of weather)", "Kosakata HSK 2: 热 (rè)"),
                        WordToken("粥", "zhōu", "congee / gruel / porridge", "Kosakata HSK 2: 粥 (zhōu)"),
                        WordToken("吃", "chī", "to eat; to consume / to eat at", "Kosakata HSK 2: 吃 (chī)"),
                        WordToken("羊", "yáng", "sheep; goat", "Kosakata HSK 2: 羊 (yáng)"),
                        WordToken("肉", "ròu", "meat / flesh / pulp (of a fruit)", "Kosakata HSK 2: 肉 (ròu)")
                    )
                ),
                Sentence(
                    id = "s_hvysnw_6",
                    hanzi = "桔子也是冬天很好的水果。",
                    pinyin = "jú zi yě shì dōng tiān hěn hǎo de shuǐ guǒ",
                    translation = "Buah jeruk mandarin yang kaya vitamin juga menjadi pilihan buah terbaik untuk dikonsumsi selama musim dingin.",
                    tokens = listOf(
                        WordToken("桔子", "jú zi", "orange; tangerine", "Kosakata HSK 2: 桔子 (jú zi)"),
                        WordToken("也", "yě", "also; too; as well; (not ...) either", "Kosakata HSK 2: 也 (yě)"),
                        WordToken("是", "shì", "to be (followed by substantives only)", "Kosakata HSK 2: 是 (shì)"),
                        WordToken("冬天", "dōng tiān", "winter", "Kosakata HSK 2: 冬天 (dōng tiān)"),
                        WordToken("很", "hěn", "very; quite", "Kosakata HSK 2: 很 (hěn)"),
                        WordToken("好", "hǎo", "good / appropriate; proper", "Kosakata HSK 2: 好 (hǎo)"),
                        WordToken("的", "de", "possessive particle (of; 's) / modifying particle (used after an attribute to modify a noun or to form a nominal expression)", "Kosakata HSK 2: 的 (de)"),
                        WordToken("水果", "shuǐ guǒ", "fruit", "Kosakata HSK 2: 水果 (shuǐ guǒ)")
                    )
                ),
                Sentence(
                    id = "s_hvysnw_7",
                    hanzi = "对农民来说，这个节气也非常重要。",
                    pinyin = "duì nóng mín lái shuō zhè gè jié qì yě fēi cháng zhòng yào",
                    translation = "Bagi kalangan petani pedesaan, pos musim Salju Lebat memiliki arti yang sangat krusial bagi kelangsungan hasil bumi.",
                    tokens = listOf(
                        WordToken("对", "duì", "towards; at; for / concerning; regarding", "Kosakata HSK 2: 对 (duì)"),
                        WordToken("农民", "nóng mín", "peasant; farmer", "Kosakata HSK 2: 农民 (nóng mín)"),
                        WordToken("来说", "lái shuō", "for; from the point of view of; in the case of", "Kosakata HSK 2: 来说 (lái shuō)"),
                        WordToken("这", "zhè", "this; these", "Kosakata HSK 2: 这 (zhè)"),
                        WordToken("个", "gè", "classifier for people or objects in general", "Kosakata HSK 2: 个 (gè)"),
                        WordToken("节气", "jié qì", "solar term", "Kosakata HSK 2: 节气 (jié qì)"),
                        WordToken("也", "yě", "also; too; as well; (not ...) either", "Kosakata HSK 2: 也 (yě)"),
                        WordToken("非常", "fēi cháng", "very; really", "Kosakata HSK 2: 非常 (fēi cháng)"),
                        WordToken("重要", "zhòng yào", "important; significant; major", "Kosakata HSK 2: 重要 (zhòng yào)")
                    )
                ),
                Sentence(
                    id = "s_hvysnw_8",
                    hanzi = "因为如果雪很大，那么下一年会是丰收的一年，所以我们说“瑞雪兆丰年”。",
                    pinyin = "yīn wèi rú guǒ xuě hěn dà nà me xià yī nián huì shì fēng shōu de yī nián suǒ yǐ wǒ men shuō ruì xuě zhào fēng nián",
                    translation = "Sebab tumpukan salju tebal yang menyelimuti tanah pertanian dipercaya dapat membasmi hama dan menyuburkan bibit, sebagaimana pepatah bijak berbunyi: ‘Salju lebat pembawa berkah pertanda tahun panen raya yang berlimpah’ (Ruìxuě zhào fēngnián).",
                    tokens = listOf(
                        WordToken("因为", "yīn wèi", "because; owing to; on account of", "Kosakata HSK 2: 因为 (yīn wèi)"),
                        WordToken("如果", "rú guǒ", "if; in case; in the event that", "Kosakata HSK 2: 如果 (rú guǒ)"),
                        WordToken("雪", "xuě", "snow", "Kosakata HSK 2: 雪 (xuě)"),
                        WordToken("很", "hěn", "very; quite", "Kosakata HSK 2: 很 (hěn)"),
                        WordToken("大", "dà", "big; large; great / older (than another person) / eldest", "Kosakata HSK 2: 大 (dà)"),
                        WordToken("那么", "nà me", "then; in that case", "Kosakata HSK 2: 那么 (nà me)"),
                        WordToken("下", "xià", "later / next (week etc)", "Kosakata HSK 2: 下 (xià)"),
                        WordToken("一", "yī", "one / single / a (article)", "Kosakata HSK 2: 一 (yī)"),
                        WordToken("年", "nián", "year", "Kosakata HSK 2: 年 (nián)"),
                        WordToken("会", "huì", "to be likely to; to be sure to", "Kosakata HSK 2: 会 (huì)"),
                        WordToken("是", "shì", "to be (followed by substantives only)", "Kosakata HSK 2: 是 (shì)"),
                        WordToken("丰收", "fēng shōu", "to reap a bumper harvest", "Kosakata HSK 2: 丰收 (fēng shōu)"),
                        WordToken("的", "de", "possessive particle (of; 's) / modifying particle (used after an attribute to modify a noun or to form a nominal expression)", "Kosakata HSK 2: 的 (de)"),
                        WordToken("一", "yī", "one / single / a (article)", "Kosakata HSK 2: 一 (yī)"),
                        WordToken("年", "nián", "year", "Kosakata HSK 2: 年 (nián)"),
                        WordToken("所以", "suǒ yǐ", "therefore / as a result / so", "Kosakata HSK 2: 所以 (suǒ yǐ)"),
                        WordToken("我们", "wǒ men", "we; us; ourselves; our", "Kosakata HSK 2: 我们 (wǒ men)"),
                        WordToken("说", "shuō", "to speak; to talk; to say", "Kosakata HSK 2: 说 (shuō)"),
                        WordToken("瑞雪兆丰年", "ruì xuě zhào fēng nián", "An auspicious snowfall in winter is believed to presage a good harvest the next year.", "Kosakata HSK 2: 瑞雪兆丰年 (ruì xuě zhào fēng nián)")
                    )
                )
            ),
            questions = listOf(
                StoryQuestion(
                    id = "q_hvysnw_1",
                    questionText = "在大雪节气到来之际，大自然的气候特征会发生怎样最为直观剧烈的演变？ (Perubahan iklim apa yang terjadi secara drastis saat pos musim Daxue tiba?)",
                    options = listOf("天气突然暴热并伴随春暖花开 (Udara mendadak terik panas dan bunga mekar)", "降雪频次与积雪厚度显著加剧，气温急剧下降，寒气逼人更胜以往 (Intensitas dan ketebalan salju melonjak tinggi, suhu anjlok tajam, dan cuaca menjadi kian menusuk beku)", "整整一个月连续狂刮台风暴雨 (Badai topan bertiup sebulan penuh)", "所有的河水全部蒸发干涸 (Semua air sungai menguap kering)"),
                    correctAnswerIndex = 1,
                    explanation = "Pos musim Daxue (Salju Lebat) menandai turunnya salju yang kian lebat dan dinginnya cuaca musim dingin sejati."
                ),
                StoryQuestion(
                    id = "q_hvysnw_2",
                    questionText = "为应对严寒天气并防止风寒侵袭，日常保健与起居最基础的常识要求包括什么？ (Pedoman kesehatan dasar apa yang dianjurkan untuk mencegah sakit saat musim salju lebat?)",
                    options = listOf("坚持穿着短袖短裤在雪地里跑步 (Berlari di atas salju hanya mengenakan celana pendek)", "多饮用温热水、穿戴防寒保暖的充足厚重衣物，提高抗病免疫力 (Memperbanyak minum air hangat, mengenakan busana tebal berlapis, dan menjaga daya tahan tubuh)", "全天紧闭门窗并开冷气空调 (Menyalakan AC dingin di dalam kamar tertutup)", "少喝水少睡觉 (Kurangi minum air dan kurangi tidur)"),
                    correctAnswerIndex = 1,
                    explanation = "Menjaga kehangatan tubuh dan kecukupan hidrasi air hangat adalah benteng utama melawan infeksi flu musim dingin."
                ),
                StoryQuestion(
                    id = "q_hvysnw_3",
                    questionText = "传统中医养生智慧在饮食调理上，建议人们在大雪时节多摄入哪些温阳御寒的食材？ (Bahan pangan penambah energi hangat apa yang disarankan oleh pakar TCM saat musim salju?)",
                    options = listOf("冰镇西瓜与冷饮冰淇淋 (Semangka dingin dari kulkas dan es krim)", "多喝温热浓稠的营养粥品、品尝温补气血的鲜美羊肉，以及食用水润多汁的新鲜桔子 (Menikmati bubur hangat bernutrisi, sup daging kambing penghangat tubuh, dan buah jeruk mandarin)", "生吃冰冻海鲜 (Makan hidangan laut beku mentah)", "只吃油炸膨化薯片 (Hanya memakan keripik kentang goreng)"),
                    correctAnswerIndex = 1,
                    explanation = "Bubur hangat, daging kambing berkhasiat tonik panas, dan buah jeruk sarat vitamin C sangat ideal bagi metabolisme musim dingin."
                ),
                StoryQuestion(
                    id = "q_hvysnw_4",
                    questionText = "在农业耕作传统中，农谚“瑞雪兆丰年”向世代农人传达了关于降雪的什么吉祥科学道理？ (Makna sains pertanian apa yang tersirat dari pepatah 'Salju lebat pembawa berkah tanda panen melimpah'?)",
                    options = listOf("厚重的积雪会把地里所有的农作物全部冻死 (Tumpukan salju tebal akan membekukan mati seluruh tanaman)", "冬季厚厚雪被既能冻死地表越冬害虫，又能锁水保温滋养麦苗，预示来年农业必获硕果大丰收！ (Salju tebal membasmi telur hama, menjaga kelembapan tanah, dan menyuburkan bibit untuk panen raya tahun depan!)", "下大雪意味着农民明年可以彻底放弃耕作 (Salju lebat berarti petani tidak perlu lagi bertani)", "雪花融化后可以直接当作金子售卖 (Lelehan salju bisa langsung dijual seperti emas)"),
                    correctAnswerIndex = 1,
                    explanation = "Pepatah 'Ruìxuě zhào fēngnián': salju tebal menyelimuti tanah laksana selimut termal yang membunuh hama dan menjamin ketersediaan air tanah saat semi."
                )
            )
        )
    )
}
