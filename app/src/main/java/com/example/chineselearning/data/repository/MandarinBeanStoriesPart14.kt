package com.example.chineselearning.data.repository

import com.example.chineselearning.R
import com.example.chineselearning.data.model.Sentence
import com.example.chineselearning.data.model.Story
import com.example.chineselearning.data.model.StoryQuestion
import com.example.chineselearning.data.model.WordToken

val mandarinBeanStoriesPart14: List<Story> by lazy {
    listOf(
        // Cerita Mandarin Bean 155 (HSK 2): Gift (Hadiah Kejutan)
        Story(
            id = "story_gift",
            titleHanzi = "礼物",
            titlePinyin = "Lǐwù",
            titleTranslation = "Gift (Hadiah Kejutan)",
            level = "HSK 2",
            category = "Keluarga & Kasih Sayang",
            description = "Kejutan manis semangkuk mi hangat di atas meja makan yang disiapkan seorang anak berbakti tepat di hari ulang tahun sang ibu.",
            coverEmoji = "🍜",
            coverImageRes = R.drawable.cover_story_gift,
            estimatedReadMinutes = 2,
            sentences = listOf(
                Sentence(
                    id = "s_giftst_1",
                    hanzi = "妈妈生日那天，一进家门就看见桌子上放着一碗面条。",
                    pinyin = "mā ma shēng rì nà tiān yī jìn jiā mén jiù kàn jiàn zhuō zi shàng fàng zhe yī wǎn miàn tiáo",
                    translation = "Tepat di hari ulang tahun ibu, begitu melangkahkan kaki masuk ke dalam rumah, beliau langsung melihat semangkuk mi hangat tersaji di atas meja makan.",
                    tokens = listOf(
                        WordToken("妈妈", "mā ma", "mama / mommy / mother", "Kosakata HSK 2: 妈妈 (mā ma)"),
                        WordToken("生日", "shēng rì", "birthday", "Kosakata HSK 2: 生日 (shēng rì)"),
                        WordToken("那", "nà", "(specifier) that; the; those / (pronoun) that (referring to persons, things or situations)", "Kosakata HSK 2: 那 (nà)"),
                        WordToken("天", "tiān", "day", "Kosakata HSK 2: 天 (tiān)"),
                        WordToken("一", "yī", "as soon as", "Kosakata HSK 2: 一 (yī)"),
                        WordToken("进", "jìn", "to go in / to enter / to put in / to submit / to take in / to admit", "Kosakata HSK 2: 进 (jìn)"),
                        WordToken("家", "jiā", "home / family / (polite) my (sister, uncle etc)", "Kosakata HSK 2: 家 (jiā)"),
                        WordToken("门", "mén", "gate / door / gateway / doorway / opening / valve / switch / way to do something / knack / family / house / (religious) sect / school (of thought) / class / category / phylum or division (taxonomy) / (suffix) -gate (i.e. scandal; derived from Watergate)", "Kosakata HSK 2: 门 (mén)"),
                        WordToken("就", "jiù", "as soon as; immediately after", "Kosakata HSK 2: 就 (jiù)"),
                        WordToken("看见", "kàn jiàn", "to see; to catch sight of", "Kosakata HSK 2: 看见 (kàn jiàn)"),
                        WordToken("桌子", "zhuō zi", "table / desk", "Kosakata HSK 2: 桌子 (zhuō zi)"),
                        WordToken("上", "shàng", "(noun suffix) on; above", "Kosakata HSK 2: 上 (shàng)"),
                        WordToken("放", "fàng", "to put / to place", "Kosakata HSK 2: 放 (fàng)"),
                        WordToken("着", "zhe", "aspect particle indicating action in progress or ongoing state", "Kosakata HSK 2: 着 (zhe)"),
                        WordToken("一", "yī", "one / single / a (article)", "Kosakata HSK 2: 一 (yī)"),
                        WordToken("碗", "wǎn", "bowl / cup", "Kosakata HSK 2: 碗 (wǎn)"),
                        WordToken("面条", "miàn tiáo", "noodles", "Kosakata HSK 2: 面条 (miàn tiáo)")
                    )
                ),
                Sentence(
                    id = "s_giftst_2",
                    hanzi = "妈妈非常高兴，她觉得这是儿子送她的礼物。",
                    pinyin = "mā ma fēi cháng gāo xìng tā jué de zhè shì ér zi sòng tā de lǐ wù",
                    translation = "Ibu merasa sangat bahagia, beliau mengira hidangan mi lezat ini adalah kado ulang tahun kejutan yang disiapkan oleh putranya.",
                    tokens = listOf(
                        WordToken("妈妈", "mā ma", "mama / mommy / mother", "Kosakata HSK 2: 妈妈 (mā ma)"),
                        WordToken("非常", "fēi cháng", "very; really", "Kosakata HSK 2: 非常 (fēi cháng)"),
                        WordToken("高兴", "gāo xìng", "happy / glad / in a cheerful mood", "Kosakata HSK 2: 高兴 (gāo xìng)"),
                        WordToken("她", "tā", "she", "Kosakata HSK 2: 她 (tā)"),
                        WordToken("觉得", "jué de", "to think that ...; to feel that ...", "Kosakata HSK 2: 觉得 (jué de)"),
                        WordToken("这", "zhè", "this; these", "Kosakata HSK 2: 这 (zhè)"),
                        WordToken("是", "shì", "to be (followed by substantives only)", "Kosakata HSK 2: 是 (shì)"),
                        WordToken("儿子", "ér zi", "son", "Kosakata HSK 2: 儿子 (ér zi)"),
                        WordToken("送", "sòng", "to give (as a present)", "Kosakata HSK 2: 送 (sòng)"),
                        WordToken("她", "tā", "she", "Kosakata HSK 2: 她 (tā)"),
                        WordToken("的", "de", "possessive particle (of; 's) / modifying particle (used after an attribute to modify a noun or to form a nominal expression)", "Kosakata HSK 2: 的 (de)"),
                        WordToken("礼物", "lǐ wù", "gift; present", "Kosakata HSK 2: 礼物 (lǐ wù)")
                    )
                ),
                Sentence(
                    id = "s_giftst_3",
                    hanzi = "这时，儿子拿着一双筷子从厨房走出来，妈妈笑着说：“儿子，这是你给我的生日礼物吗？”",
                    pinyin = "zhè shí ér zi ná zhe yī shuāng kuài zi cóng chú fáng zǒu chū lái mā ma xiào zhe shuō ér zi zhè shì nǐ gěi wǒ de shēng rì lǐ wù ma",
                    translation = "Pada saat itu, sang putra berjalan keluar dari dapur sambil membawa sepasang sumpit di tangannya, lalu ibu tersenyum dan bertanya: “Nak, apakah ini kado ulang tahun yang kamu siapkan untuk ibu?”",
                    tokens = listOf(
                        WordToken("这", "zhè", "this; these", "Kosakata HSK 2: 这 (zhè)"),
                        WordToken("时", "shí", "o'clock / time / hour / season / period", "Kosakata HSK 2: 时 (shí)"),
                        WordToken("儿子", "ér zi", "son", "Kosakata HSK 2: 儿子 (ér zi)"),
                        WordToken("拿", "ná", "to hold / to seize / to catch / to apprehend / to take", "Kosakata HSK 2: 拿 (ná)"),
                        WordToken("着", "zhe", "aspect particle indicating action in progress or ongoing state", "Kosakata HSK 2: 着 (zhe)"),
                        WordToken("一", "yī", "one / single / a (article)", "Kosakata HSK 2: 一 (yī)"),
                        WordToken("双", "shuāng", "pair", "Kosakata HSK 2: 双 (shuāng)"),
                        WordToken("筷子", "kuài zi", "chopsticks", "Kosakata HSK 2: 筷子 (kuài zi)"),
                        WordToken("从", "cóng", "from; through; via / (bound form) retainer; attendant / (bound form) assistant; auxiliary; subordinate / (bound form) related by common paternal grandfather or earlier ancestor", "Kosakata HSK 2: 从 (cóng)"),
                        WordToken("厨房", "chú fáng", "kitchen", "Kosakata HSK 2: 厨房 (chú fáng)"),
                        WordToken("走", "zǒu", "to walk / to go / to run / to move (of vehicle) / to visit / to leave / to go away / to die (euph.) / to change (shape, form, meaning)", "Kosakata HSK 2: 走 (zǒu)"),
                        WordToken("出", "chū", "(used after a verb to indicate an outward direction or a positive result)", "Kosakata HSK 2: 出 (chū)"),
                        WordToken("来", "lái", "hither (directional complement for motion toward the speaker)", "Kosakata HSK 2: 来 (lái)"),
                        WordToken("妈妈", "mā ma", "mama / mommy / mother", "Kosakata HSK 2: 妈妈 (mā ma)"),
                        WordToken("笑", "xiào", "to laugh; to smile", "Kosakata HSK 2: 笑 (xiào)"),
                        WordToken("着", "zhe", "aspect particle indicating action in progress or ongoing state", "Kosakata HSK 2: 着 (zhe)"),
                        WordToken("说", "shuō", "to speak; to talk; to say", "Kosakata HSK 2: 说 (shuō)"),
                        WordToken("儿子", "ér zi", "son", "Kosakata HSK 2: 儿子 (ér zi)"),
                        WordToken("这", "zhè", "this; these", "Kosakata HSK 2: 这 (zhè)"),
                        WordToken("是", "shì", "to be (followed by substantives only)", "Kosakata HSK 2: 是 (shì)"),
                        WordToken("你", "nǐ", "you", "Kosakata HSK 2: 你 (nǐ)"),
                        WordToken("给", "gěi", "to give", "Kosakata HSK 2: 给 (gěi)"),
                        WordToken("我", "wǒ", "I; me; my", "Kosakata HSK 2: 我 (wǒ)"),
                        WordToken("的", "de", "possessive particle (of; 's) / modifying particle (used after an attribute to modify a noun or to form a nominal expression)", "Kosakata HSK 2: 的 (de)"),
                        WordToken("生日", "shēng rì", "birthday", "Kosakata HSK 2: 生日 (shēng rì)"),
                        WordToken("礼物", "lǐ wù", "gift; present", "Kosakata HSK 2: 礼物 (lǐ wù)"),
                        WordToken("吗", "ma", "(question particle for \"yes-no\" questions)", "Kosakata HSK 2: 吗 (ma)")
                    )
                ),
                Sentence(
                    id = "s_giftst_4",
                    hanzi = "“是的，妈妈，礼物就是我自己会做饭了！你喜欢这个礼物吗？”",
                    pinyin = "shì de mā ma lǐ wù jiù shì wǒ zì jǐ huì zuò fàn le nǐ xǐ huan zhè gè lǐ wù ma",
                    translation = "Putranya menjawab bangga: “Tentu saja, Ibu! Hadiah terbesarnya adalah kenyataan bahwa aku sekarang sudah bisa memasak sendiri! Apakah Ibu menyukai hadiah ini?”",
                    tokens = listOf(
                        WordToken("是", "shì", "correct; right; true", "Kosakata HSK 2: 是 (shì)"),
                        WordToken("的", "de", "emphatic particle (used at the end of a declarative sentence for emphasis)", "Kosakata HSK 2: 的 (de)"),
                        WordToken("妈妈", "mā ma", "mama / mommy / mother", "Kosakata HSK 2: 妈妈 (mā ma)"),
                        WordToken("礼物", "lǐ wù", "gift; present", "Kosakata HSK 2: 礼物 (lǐ wù)"),
                        WordToken("就", "jiù", "merely; nothing else but; simply; just; precisely; exactly", "Kosakata HSK 2: 就 (jiù)"),
                        WordToken("是", "shì", "to be (followed by substantives only)", "Kosakata HSK 2: 是 (shì)"),
                        WordToken("我", "wǒ", "I; me; my", "Kosakata HSK 2: 我 (wǒ)"),
                        WordToken("自己", "zì jǐ", "oneself; (attributive) one's own", "Kosakata HSK 2: 自己 (zì jǐ)"),
                        WordToken("会", "huì", "can; to have the skill; to know how to", "Kosakata HSK 2: 会 (huì)"),
                        WordToken("做饭", "zuò fàn", "to prepare a meal / to cook", "Kosakata HSK 2: 做饭 (zuò fàn)"),
                        WordToken("了", "le", "(completed action marker) / (modal particle indicating change of state, situation now)", "Kosakata HSK 2: 了 (le)"),
                        WordToken("你", "nǐ", "you", "Kosakata HSK 2: 你 (nǐ)"),
                        WordToken("喜欢", "xǐ huan", "to like; to be fond of", "Kosakata HSK 2: 喜欢 (xǐ huan)"),
                        WordToken("这", "zhè", "this; these", "Kosakata HSK 2: 这 (zhè)"),
                        WordToken("个", "gè", "classifier for people or objects in general", "Kosakata HSK 2: 个 (gè)"),
                        WordToken("礼物", "lǐ wù", "gift; present", "Kosakata HSK 2: 礼物 (lǐ wù)"),
                        WordToken("吗", "ma", "(question particle for \"yes-no\" questions)", "Kosakata HSK 2: 吗 (ma)")
                    )
                ),
                Sentence(
                    id = "s_giftst_5",
                    hanzi = "说完，儿子大口吃了起来。",
                    pinyin = "shuō wán ér zi dà kǒu chī le qǐ lái",
                    translation = "Selesai berkata demikian, sang putra pun langsung melahap habis mi di mangkok tersebut dengan lahapnya!",
                    tokens = listOf(
                        WordToken("说", "shuō", "to speak; to talk; to say", "Kosakata HSK 2: 说 (shuō)"),
                        WordToken("完", "wán", "to finish / to be over", "Kosakata HSK 2: 完 (wán)"),
                        WordToken("儿子", "ér zi", "son", "Kosakata HSK 2: 儿子 (ér zi)"),
                        WordToken("大", "dà", "big; large; great / older (than another person) / eldest", "Kosakata HSK 2: 大 (dà)"),
                        WordToken("口", "kǒu", "classifier for things with mouths / classifier for bites or mouthfuls", "Kosakata HSK 2: 口 (kǒu)"),
                        WordToken("吃", "chī", "to eat; to consume / to eat at", "Kosakata HSK 2: 吃 (chī)"),
                        WordToken("了", "le", "(completed action marker) / (modal particle indicating change of state, situation now)", "Kosakata HSK 2: 了 (le)"),
                        WordToken("起来", "qǐ lái", "indicating the beginning and continuation of an action or a state / indicating an upward movement / indicating completion / expressing preliminary judgment", "Kosakata HSK 2: 起来 (qǐ lái)")
                    )
                )
            ),
            questions = listOf(
                StoryQuestion(
                    id = "q_giftst_1",
                    questionText = "在妈妈生日那天，她一推开家门便看到了什么温馨的场景？ (Pemandangan hangat apa yang langsung dilihat sang ibu begitu membuka pintu rumah di hari ulang tahunnya?)",
                    options = listOf("满地的脏衣服没人收拾 (Baju kotor berantakan di lantai)", "客厅餐桌上静静摆放着一碗热气腾腾的面条 (Di atas meja makan tersaji semangkuk mi hangat yang mengepul)", "一个巨大的三层巧克力蛋糕 (Kue cokelat raksasa tiga tingkat)", "一束昂贵的百合鲜花 (Sebuket bunga lili mahal)"),
                    correctAnswerIndex = 1,
                    explanation = "Ibu melihat semangkuk mi terhidang manis di atas meja makan tepat di hari ulang tahunnya."
                ),
                StoryQuestion(
                    id = "q_giftst_2",
                    questionText = "看到这碗长寿面，妈妈心里产生了怎样幸福的揣测？ (Dugaan membahagiakan apa yang terlintas di benak sang ibu saat melihat semangkuk mi tersebut?)",
                    options = listOf("以为是隔壁邻居送来的慰问品 (Mengira itu kiriman makanan dari tetangga sebelah)", "以为这是乖巧的儿子专门为自己亲手准备的生日孝心礼物 (Mengira itu adalah kado ulang tahun kejutan yang dimasak sang putra untuknya)", "以为是丈夫叫的外卖快餐 (Mengira makanan pesan antar yang dipesan suaminya)", "以为是昨晚剩下的冷饭 (Mengira sisa makanan semalam)"),
                    correctAnswerIndex = 1,
                    explanation = "Ibu tersenyum bahagia mengira putranya telah tumbuh dewasa dan memasakkan kado mi ulang tahun untuknya."
                ),
                StoryQuestion(
                    id = "q_giftst_3",
                    questionText = "儿子拿着筷子从厨房走出来后，向妈妈宣告的“真正礼物”是什么？ (Pengumuman apa yang disampaikan sang putra mengenai makna 'hadiah ulang tahun' versinya?)",
                    options = listOf("“礼物是我买了一条新裙子送给妈妈” (Hadiahnya adalah gaun baru untuk ibu)", "“礼物就是我已经学会自己做饭煮面了” (Hadiah terbesarnya adalah kenyataan bahwa ia sekarang sudah bisa memasak sendiri!)", "“礼物是家里打扫得一尘不染” (Hadiahnya adalah rumah yang bersih mengilap)", "“礼物是我考了全班第一名” (Hadiahnya adalah nilai juara satu)"),
                    correctAnswerIndex = 1,
                    explanation = "Kado menurut versi sang anak adalah kemampuannya yang baru: ia sekarang sudah mandiri bisa memasak mi sendiri!"
                ),
                StoryQuestion(
                    id = "q_giftst_4",
                    questionText = "说完祝词后，儿子的什么举动让整个温馨氛围瞬间变成爆笑喜剧？ (Tindakan sang putra setelah berujar yang membuat suasana haru seketika berbalik jadi tawa?)",
                    options = listOf("把面条端给妈妈一口口喂她吃 (Menyuapi mi ke mulut ibunya dengan penuh kasih)", "自己拿起筷子坐在桌前大口大口把那碗面条吃得精光 (Ia justru duduk dan menyantap habis semangkuk mi tersebut untuk perutnya sendiri!)", "把面条倒进了垃圾桶 (Membuang mi ke tong sampah)", "把面条打包带去学校 (Membungkus mi untuk dibawa ke sekolah)"),
                    correctAnswerIndex = 1,
                    explanation = "Puncak humor: mi itu ternyata bukan untuk dimakan sang ibu, melainkan dimakan sendiri oleh sang putra di depan ibunya!"
                )
            )
        ),
        // Cerita Mandarin Bean 156 (HSK 2): Window (Jendela yang Kotor)
        Story(
            id = "story_window",
            titleHanzi = "窗户",
            titlePinyin = "Chuānghu",
            titleTranslation = "Window (Jendela yang Kotor)",
            level = "HSK 2",
            category = "Moral & Persepsi Diri",
            description = "Refleksi introspeksi: jangan terburu-buru mencela pakaian orang lain yang tampak kotor, padahal mungkin kaca jendela rumah kita sendirilah yang berdebu.",
            coverEmoji = "🪟",
            coverImageRes = R.drawable.cover_story_window,
            estimatedReadMinutes = 2,
            sentences = listOf(
                Sentence(
                    id = "s_windst_1",
                    hanzi = "有个人多年来一直觉得邻居很懒惰，“那个女人的衣服永远洗不干净，看，她晾在外面的衣服，总是有脏东西，我真的不知道，她为什么不洗干净一点儿。”",
                    pinyin = "yǒu gè rén duō nián lái yī zhí jué de lín jū hěn lǎn duò nà gè nǚ rén de yī fu yǒng yuǎn xǐ bù gān jìng kàn tā liàng zài wài miàn de yī fu zǒng shì yǒu zāng dōng xi wǒ zhēn dí bù zhī dào tā wèi shén me bù xǐ gān jìng yī diǎn r",
                    translation = "Selama bertahun-tahun, seorang wanita selalu menganggap tetangga di depan rumahnya sebagai pemalas: “Pakaian wanita itu tidak pernah bisa dicuci sampai bersih; coba lihat, baju-baju yang dijemurnya di luar selalu penuh bercak kotor. Aku benar-benar heran, mengapa ia tidak mencucinya sedikit lebih bersih.”",
                    tokens = listOf(
                        WordToken("有", "yǒu", "to have; there is", "Kosakata HSK 2: 有 (yǒu)"),
                        WordToken("个", "gè", "classifier for people or objects in general", "Kosakata HSK 2: 个 (gè)"),
                        WordToken("人", "rén", "person; people", "Kosakata HSK 2: 人 (rén)"),
                        WordToken("多", "duō", "many; much; more; a lot of", "Kosakata HSK 2: 多 (duō)"),
                        WordToken("年", "nián", "year", "Kosakata HSK 2: 年 (nián)"),
                        WordToken("来", "lái", "ever since / for the past (amount of time)", "Kosakata HSK 2: 来 (lái)"),
                        WordToken("一直", "yī zhí", "straight (in a straight line) / continuously; always; all the way through", "Kosakata HSK 2: 一直 (yī zhí)"),
                        WordToken("觉得", "jué de", "to think that ...; to feel that ...", "Kosakata HSK 2: 觉得 (jué de)"),
                        WordToken("邻居", "lín jū", "neighbor", "Kosakata HSK 2: 邻居 (lín jū)"),
                        WordToken("很", "hěn", "very; quite", "Kosakata HSK 2: 很 (hěn)"),
                        WordToken("懒惰", "lǎn duò", "idle / lazy", "Kosakata HSK 2: 懒惰 (lǎn duò)"),
                        WordToken("那", "nà", "(specifier) that; the; those / (pronoun) that (referring to persons, things or situations)", "Kosakata HSK 2: 那 (nà)"),
                        WordToken("个", "gè", "classifier for people or objects in general", "Kosakata HSK 2: 个 (gè)"),
                        WordToken("女人", "nǚ rén", "woman", "Kosakata HSK 2: 女人 (nǚ rén)"),
                        WordToken("的", "de", "possessive particle (of; 's) / modifying particle (used after an attribute to modify a noun or to form a nominal expression)", "Kosakata HSK 2: 的 (de)"),
                        WordToken("衣服", "yī fu", "clothes", "Kosakata HSK 2: 衣服 (yī fu)"),
                        WordToken("永远", "yǒng yuǎn", "forever", "Kosakata HSK 2: 永远 (yǒng yuǎn)"),
                        WordToken("洗", "xǐ", "to wash; to bathe / to develop (photographs) / to shuffle (cards etc) / to erase (a recording)", "Kosakata HSK 2: 洗 (xǐ)"),
                        WordToken("不", "bù", "no; not so", "Kosakata HSK 2: 不 (bù)"),
                        WordToken("干净", "gān jìng", "clean / neat", "Kosakata HSK 2: 干净 (gān jìng)"),
                        WordToken("看", "kàn", "to see; to look at / to read / to watch / to visit; to call on / to consider; to regard as / to look after / to treat (a patient or illness) / to depend on / to feel (that) / (after a verb) to give it a try / to watch out for", "Kosakata HSK 2: 看 (kàn)"),
                        WordToken("她", "tā", "she", "Kosakata HSK 2: 她 (tā)"),
                        WordToken("晾", "liàng", "to dry in the air / (fig.) to cold-shoulder", "Kosakata HSK 2: 晾 (liàng)"),
                        WordToken("在", "zài", "(of sb or sth) to be (located) at", "Kosakata HSK 2: 在 (zài)"),
                        WordToken("外面", "wài miàn", "outside", "Kosakata HSK 2: 外面 (wài miàn)"),
                        WordToken("的", "de", "possessive particle (of; 's) / modifying particle (used after an attribute to modify a noun or to form a nominal expression)", "Kosakata HSK 2: 的 (de)"),
                        WordToken("衣服", "yī fu", "clothes", "Kosakata HSK 2: 衣服 (yī fu)"),
                        WordToken("总是", "zǒng shì", "always", "Kosakata HSK 2: 总是 (zǒng shì)"),
                        WordToken("有", "yǒu", "to have; there is", "Kosakata HSK 2: 有 (yǒu)"),
                        WordToken("脏", "zāng", "dirty / filthy", "Kosakata HSK 2: 脏 (zāng)"),
                        WordToken("东西", "dōng xi", "thing / stuff / person", "Kosakata HSK 2: 东西 (dōng xi)"),
                        WordToken("我", "wǒ", "I; me; my", "Kosakata HSK 2: 我 (wǒ)"),
                        WordToken("真", "zhēn", "really / truly / indeed", "Kosakata HSK 2: 真 (zhēn)"),
                        WordToken("的", "dí", "really and truly", "Kosakata HSK 2: 的 (dí)"),
                        WordToken("不", "bù", "no; not so", "Kosakata HSK 2: 不 (bù)"),
                        WordToken("知道", "zhī dào", "to know; to become aware of", "Kosakata HSK 2: 知道 (zhī dào)"),
                        WordToken("她", "tā", "she", "Kosakata HSK 2: 她 (tā)"),
                        WordToken("为什么", "wèi shén me", "why? / for what reason?", "Kosakata HSK 2: 为什么 (wèi shén me)"),
                        WordToken("不", "bù", "no; not so", "Kosakata HSK 2: 不 (bù)"),
                        WordToken("洗", "xǐ", "to wash; to bathe / to develop (photographs) / to shuffle (cards etc) / to erase (a recording)", "Kosakata HSK 2: 洗 (xǐ)"),
                        WordToken("干净", "gān jìng", "clean / neat", "Kosakata HSK 2: 干净 (gān jìng)"),
                        WordToken("一点儿", "yī diǎn r", "erhua", "Kosakata HSK 2: 一点儿 (yī diǎn r)")
                    )
                ),
                Sentence(
                    id = "s_windst_2",
                    hanzi = "有一天，有个朋友到她家，才发现不是邻居的衣服没洗干净，而是她家的窗户很脏。",
                    pinyin = "yǒu yī tiān yǒu gè péng you dào tā jiā cái fā xiàn bù shì lín jū de yī fu méi xǐ gān jìng ér shì tā jiā de chuāng hu hěn zāng",
                    translation = "Suatu hari, seorang sahabat berkunjung ke rumahnya, dan barulah menyadari bahwa persoalannya sama sekali bukan karena pakaian tetangga yang kotor, melainkan kaca jendela rumah wanita inilah yang penuh debu dan berkerak.",
                    tokens = listOf(
                        WordToken("有", "yǒu", "to have; there is", "Kosakata HSK 2: 有 (yǒu)"),
                        WordToken("一", "yī", "one / single / a (article)", "Kosakata HSK 2: 一 (yī)"),
                        WordToken("天", "tiān", "day", "Kosakata HSK 2: 天 (tiān)"),
                        WordToken("有", "yǒu", "to have; there is", "Kosakata HSK 2: 有 (yǒu)"),
                        WordToken("个", "gè", "classifier for people or objects in general", "Kosakata HSK 2: 个 (gè)"),
                        WordToken("朋友", "péng you", "friend", "Kosakata HSK 2: 朋友 (péng you)"),
                        WordToken("到", "dào", "to reach; to arrive / to (a place); until (a time); up to (a point) / (verb complement indicating arriving at a place or reaching a point)", "Kosakata HSK 2: 到 (dào)"),
                        WordToken("她", "tā", "she", "Kosakata HSK 2: 她 (tā)"),
                        WordToken("家", "jiā", "home / family / (polite) my (sister, uncle etc)", "Kosakata HSK 2: 家 (jiā)"),
                        WordToken("才", "cái", "just now", "Kosakata HSK 2: 才 (cái)"),
                        WordToken("发现", "fā xiàn", "to notice; to become aware of / to discover; to find; to detect", "Kosakata HSK 2: 发现 (fā xiàn)"),
                        WordToken("不", "bù", "no; not so", "Kosakata HSK 2: 不 (bù)"),
                        WordToken("是", "shì", "to be (followed by substantives only)", "Kosakata HSK 2: 是 (shì)"),
                        WordToken("邻居", "lín jū", "neighbor", "Kosakata HSK 2: 邻居 (lín jū)"),
                        WordToken("的", "de", "possessive particle (of; 's) / modifying particle (used after an attribute to modify a noun or to form a nominal expression)", "Kosakata HSK 2: 的 (de)"),
                        WordToken("衣服", "yī fu", "clothes", "Kosakata HSK 2: 衣服 (yī fu)"),
                        WordToken("没", "méi", "(negative prefix for verbs) have not; not", "Kosakata HSK 2: 没 (méi)"),
                        WordToken("洗", "xǐ", "to wash; to bathe / to develop (photographs) / to shuffle (cards etc) / to erase (a recording)", "Kosakata HSK 2: 洗 (xǐ)"),
                        WordToken("干净", "gān jìng", "clean / neat", "Kosakata HSK 2: 干净 (gān jìng)"),
                        WordToken("而", "ér", "but (not) / yet (not) / (indicates contrast)", "Kosakata HSK 2: 而 (ér)"),
                        WordToken("是", "shì", "indeed (used for emphasis)", "Kosakata HSK 2: 是 (shì)"),
                        WordToken("她", "tā", "she", "Kosakata HSK 2: 她 (tā)"),
                        WordToken("家", "jiā", "home / family / (polite) my (sister, uncle etc)", "Kosakata HSK 2: 家 (jiā)"),
                        WordToken("的", "de", "possessive particle (of; 's) / modifying particle (used after an attribute to modify a noun or to form a nominal expression)", "Kosakata HSK 2: 的 (de)"),
                        WordToken("窗户", "chuāng hu", "window", "Kosakata HSK 2: 窗户 (chuāng hu)"),
                        WordToken("很", "hěn", "very; quite", "Kosakata HSK 2: 很 (hěn)"),
                        WordToken("脏", "zāng", "dirty / filthy", "Kosakata HSK 2: 脏 (zāng)")
                    )
                ),
                Sentence(
                    id = "s_windst_3",
                    hanzi = "朋友擦掉窗户上的脏东西后，对她说：“看，这不就干净了吗？”",
                    pinyin = "péng you cā diào chuāng hu shàng de zāng dōng xi hòu duì tā shuō kàn zhè bù jiù gān jìng le ma",
                    translation = "Setelah sang sahabat menyeka bersih kotoran di kaca jendela tersebut, ia menoleh dan berkata: “Coba lihat sekarang, bukankah pemandangan baju di seberang sana sudah langsung tampak bersih berkilau?”",
                    tokens = listOf(
                        WordToken("朋友", "péng you", "friend", "Kosakata HSK 2: 朋友 (péng you)"),
                        WordToken("擦掉", "cā diào", "to wipe", "Kosakata HSK 2: 擦掉 (cā diào)"),
                        WordToken("窗户", "chuāng hu", "window", "Kosakata HSK 2: 窗户 (chuāng hu)"),
                        WordToken("上", "shàng", "(noun suffix) on; above", "Kosakata HSK 2: 上 (shàng)"),
                        WordToken("的", "de", "possessive particle (of; 's) / modifying particle (used after an attribute to modify a noun or to form a nominal expression)", "Kosakata HSK 2: 的 (de)"),
                        WordToken("脏", "zāng", "dirty / filthy", "Kosakata HSK 2: 脏 (zāng)"),
                        WordToken("东西", "dōng xi", "thing / stuff / person", "Kosakata HSK 2: 东西 (dōng xi)"),
                        WordToken("后", "hòu", "afterwards / after", "Kosakata HSK 2: 后 (hòu)"),
                        WordToken("对", "duì", "towards; at; for / concerning; regarding", "Kosakata HSK 2: 对 (duì)"),
                        WordToken("她", "tā", "she", "Kosakata HSK 2: 她 (tā)"),
                        WordToken("说", "shuō", "to speak; to talk; to say", "Kosakata HSK 2: 说 (shuō)"),
                        WordToken("看", "kàn", "to see; to look at / to read / to watch / to visit; to call on / to consider; to regard as / to look after / to treat (a patient or illness) / to depend on / to feel (that) / (after a verb) to give it a try / to watch out for", "Kosakata HSK 2: 看 (kàn)"),
                        WordToken("这", "zhè", "this; these", "Kosakata HSK 2: 这 (zhè)"),
                        WordToken("不", "bù", "no; not so", "Kosakata HSK 2: 不 (bù)"),
                        WordToken("就", "jiù", "merely; nothing else but; simply; just; precisely; exactly", "Kosakata HSK 2: 就 (jiù)"),
                        WordToken("干净", "gān jìng", "clean / neat", "Kosakata HSK 2: 干净 (gān jìng)"),
                        WordToken("了", "le", "(completed action marker) / (modal particle indicating change of state, situation now)", "Kosakata HSK 2: 了 (le)"),
                        WordToken("吗", "ma", "(question particle for \"yes-no\" questions)", "Kosakata HSK 2: 吗 (ma)")
                    )
                )
            ),
            questions = listOf(
                StoryQuestion(
                    id = "q_windst_1",
                    questionText = "多年来，这位妇人总是对住在对面的女邻居持有怎样刻板的负面评价？ (Pandangan stereotipe negatif apa yang selalu diyakini wanita ini terhadap tetangganya selama bertahun-tahun?)",
                    options = listOf("觉得女邻居脾气暴躁爱骂人 (Menganggap tetangganya pemarah dan suka memaki)", "觉得女邻居为人极度懒惰，晾在外面的衣服永远洗不干净 (Menganggap tetangganya sangat pemalas dan pakaian yang dijemurnya di luar selalu berdebu kotor)", "觉得邻居经常偷看她家 (Menganggap tetangga suka mengintip rumahnya)", "觉得邻居家的小狗太吵闹 (Menganggap anjing tetangga terlalu berisik)"),
                    correctAnswerIndex = 1,
                    explanation = "Setiap kali menatap jemuran baju tetangga, ia selalu mencemooh bahwa baju-baju itu tak pernah dicuci bersih."
                ),
                StoryQuestion(
                    id = "q_windst_2",
                    questionText = "朋友来到她家做客后，经过仔细观察敏锐地发现了什么事情的真相？ (Kenyataan apa yang dijumpai sang sahabat saat berkunjung ke rumah wanita tersebut?)",
                    options = listOf("邻居家根本就没有晾衣服 (Tetangga sebenarnya tidak pernah menjemur baju di luar)", "不是邻居的衣服洗不干净，而是她自己家窗户玻璃上布满了厚厚的污垢 (Bukan baju tetangga yang kotor, melainkan kaca jendela rumah wanita inilah yang dipenuhi kerak debu!)", "邻居使用的是昂贵的高档洗衣液 (Tetangga memakai sabun cuci baju kualitas premium)", "女主人眼睛视力出了严重问题 (Mata sang nyonya rumah mengalami gangguan penglihatan)"),
                    correctAnswerIndex = 1,
                    explanation = "Noda yang tampak selama bertahun-tahun ternyata menempel di kaca jendela rumahnya sendiri!"
                ),
                StoryQuestion(
                    id = "q_windst_3",
                    questionText = "朋友将窗户上的脏东西彻底擦干净后，眼前呈现出怎样的景象？ (Pemandangan apa yang langsung terlihat jelas setelah sahabatnya menyeka bersih kaca jendela tersebut?)",
                    options = listOf("对面的衣服被雨淋湿了 (Baju di seberang basah kuyup tersiram hujan)", "对面阳台上的衣服其实洁白整洁，在阳光下显得非常干净 (Baju-baju di jemuran seberang ternyata sangat bersih berseri tanpa noda)", "窗户玻璃被擦碎了 (Kaca jendela retak pecah)", "外面起了一场大雾 (Di luar kabut tebal turun)"),
                    correctAnswerIndex = 1,
                    explanation = "Setelah kotoran di kaca jendela dibersihkan, pakaian tetangga di seberang langsung tampak bersih berkilau."
                ),
                StoryQuestion(
                    id = "q_windst_4",
                    questionText = "这篇寓意深刻的小哲理故事告诫我们在评判他人时应当首先做到什么？ (Nasihat moral mendalam apa yang dipetik saat kita hendak menilai dan mengkritik orang lain?)",
                    options = listOf("在指责他人道德缺失前，必须先擦亮自己内心的心灵之窗，反省自身是否存在偏见与盲区 (Sebelum menyalahkan kekurangan orang lain, bersihkan dulu jendela hati sendiri dan lakukan introspeksi objektif)", "永远不要去朋友家做客 (Jangan pernah bertamu ke rumah sahabat)", "家里不要安装透明窗户 (Jangan memasang jendela kaca transparan di rumah)", "衣服最好放在室内阴干 (Sebaiknya menjemur baju di dalam ruangan)"),
                    correctAnswerIndex = 0,
                    explanation = "Introspeksi diri adalah kunci kearifan: sering kali kecacatan yang kita lihat pada orang lain bersumber dari kekeruhan sudut pandang kita sendiri."
                )
            )
        ),
        // Cerita Mandarin Bean 157 (HSK 2): Smart Dog (Anjing yang Sangat Cerdas)
        Story(
            id = "story_smart_dog",
            titleHanzi = "聪明的狗",
            titlePinyin = "Cōngmíng De Gǒu",
            titleTranslation = "Smart Dog (Anjing yang Sangat Cerdas)",
            level = "HSK 2",
            category = "Humor & Peliharaan",
            description = "Pamer kepintaran hewan peliharaan di taman: seorang pemilik bangga anjingnya membawakan koran tiap pagi, padahal ia sendiri tidak berlangganan koran.",
            coverEmoji = "📰",
            coverImageRes = R.drawable.cover_story_smart_dog,
            estimatedReadMinutes = 2,
            sentences = listOf(
                Sentence(
                    id = "s_smartdog_1",
                    hanzi = "公园里，有很多人在遛狗，大家都夸自己的狗聪明。",
                    pinyin = "gōng yuán lǐ yǒu hěn duō rén zài liù gǒu dà jiā dōu kuā zì jǐ de gǒu cōng míng",
                    translation = "Di taman kota ada banyak orang yang sedang mengajak anjing peliharaan mereka berjalan-jalan, dan masing-masing saling membanggakan kepintaran anjingnya.",
                    tokens = listOf(
                        WordToken("公园", "gōng yuán", "park (for public recreation)", "Kosakata HSK 2: 公园 (gōng yuán)"),
                        WordToken("里", "lǐ", "lining / interior / inside", "Kosakata HSK 2: 里 (lǐ)"),
                        WordToken("有", "yǒu", "to have; there is", "Kosakata HSK 2: 有 (yǒu)"),
                        WordToken("很多", "hěn duō", "many; a lot of", "Kosakata HSK 2: 很多 (hěn duō)"),
                        WordToken("人", "rén", "person; people", "Kosakata HSK 2: 人 (rén)"),
                        WordToken("在", "zài", "(used before a verb to indicate an action in progress)", "Kosakata HSK 2: 在 (zài)"),
                        WordToken("遛", "liù", "to stroll / to walk (an animal)", "Kosakata HSK 2: 遛 (liù)"),
                        WordToken("狗", "gǒu", "dog", "Kosakata HSK 2: 狗 (gǒu)"),
                        WordToken("大家", "dà jiā", "everyone", "Kosakata HSK 2: 大家 (dà jiā)"),
                        WordToken("都", "dōu", "all; both; entirely", "Kosakata HSK 2: 都 (dōu)"),
                        WordToken("夸", "kuā", "to boast; to exaggerate / to praise", "Kosakata HSK 2: 夸 (kuā)"),
                        WordToken("自己", "zì jǐ", "oneself; (attributive) one's own", "Kosakata HSK 2: 自己 (zì jǐ)"),
                        WordToken("的", "de", "possessive particle (of; 's) / modifying particle (used after an attribute to modify a noun or to form a nominal expression)", "Kosakata HSK 2: 的 (de)"),
                        WordToken("狗", "gǒu", "dog", "Kosakata HSK 2: 狗 (gǒu)"),
                        WordToken("聪明", "cōng míng", "intelligent; clever; bright / acute (of sight and hearing)", "Kosakata HSK 2: 聪明 (cōng míng)")
                    )
                ),
                Sentence(
                    id = "s_smartdog_2",
                    hanzi = "有的说自己家的狗会开门，有的说自己家的狗会跳舞……",
                    pinyin = "yǒu de shuō zì jǐ jiā de gǒu huì kāi mén yǒu de shuō zì jǐ jiā de gǒu huì tiào wǔ",
                    translation = "Ada yang memamerkan bahwa anjingnya bisa membuka pintu rumah, ada pula yang berujar anjingnya mahir menari riang...",
                    tokens = listOf(
                        WordToken("有的", "yǒu de", "(there are) some (who are...) / some (exist)", "Kosakata HSK 2: 有的 (yǒu de)"),
                        WordToken("说", "shuō", "to speak; to talk; to say", "Kosakata HSK 2: 说 (shuō)"),
                        WordToken("自己", "zì jǐ", "oneself; (attributive) one's own", "Kosakata HSK 2: 自己 (zì jǐ)"),
                        WordToken("家", "jiā", "home / family / (polite) my (sister, uncle etc)", "Kosakata HSK 2: 家 (jiā)"),
                        WordToken("的", "de", "possessive particle (of; 's) / modifying particle (used after an attribute to modify a noun or to form a nominal expression)", "Kosakata HSK 2: 的 (de)"),
                        WordToken("狗", "gǒu", "dog", "Kosakata HSK 2: 狗 (gǒu)"),
                        WordToken("会", "huì", "can; to have the skill; to know how to", "Kosakata HSK 2: 会 (huì)"),
                        WordToken("开", "kāi", "to open (transitive or intransitive)", "Kosakata HSK 2: 开 (kāi)"),
                        WordToken("门", "mén", "gate / door / gateway / doorway / opening / valve / switch / way to do something / knack / family / house / (religious) sect / school (of thought) / class / category / phylum or division (taxonomy) / (suffix) -gate (i.e. scandal; derived from Watergate)", "Kosakata HSK 2: 门 (mén)"),
                        WordToken("有的", "yǒu de", "(there are) some (who are...) / some (exist)", "Kosakata HSK 2: 有的 (yǒu de)"),
                        WordToken("说", "shuō", "to speak; to talk; to say", "Kosakata HSK 2: 说 (shuō)"),
                        WordToken("自己", "zì jǐ", "oneself; (attributive) one's own", "Kosakata HSK 2: 自己 (zì jǐ)"),
                        WordToken("家", "jiā", "home / family / (polite) my (sister, uncle etc)", "Kosakata HSK 2: 家 (jiā)"),
                        WordToken("的", "de", "possessive particle (of; 's) / modifying particle (used after an attribute to modify a noun or to form a nominal expression)", "Kosakata HSK 2: 的 (de)"),
                        WordToken("狗", "gǒu", "dog", "Kosakata HSK 2: 狗 (gǒu)"),
                        WordToken("会", "huì", "can; to have the skill; to know how to", "Kosakata HSK 2: 会 (huì)"),
                        WordToken("跳舞", "tiào wǔ", "to dance", "Kosakata HSK 2: 跳舞 (tiào wǔ)")
                    )
                ),
                Sentence(
                    id = "s_smartdog_3",
                    hanzi = "有一个人说：“我家的狗会做一件很特别的事，你们的小狗一定不会。它每天早上都会叼报纸回家。”",
                    pinyin = "yǒu yī gè rén shuō wǒ jiā de gǒu huì zuò yī jiàn hěn tè bié de shì nǐ men de xiǎo gǒu yī dìng bù huì tā měi tiān zǎo shang dōu huì diāo bào zhǐ huí jiā",
                    translation = "Lalu ada seorang pria yang berseru: “Anjing milikku bisa melakukan satu hal yang sangat luar biasa, anjing kalian semua pasti tak sanggup melakukannya. Setiap pagi ia selalu menggigit koran baru dan membawanya pulang ke rumah.”",
                    tokens = listOf(
                        WordToken("有", "yǒu", "to have; there is", "Kosakata HSK 2: 有 (yǒu)"),
                        WordToken("一", "yī", "one / single / a (article)", "Kosakata HSK 2: 一 (yī)"),
                        WordToken("个", "gè", "classifier for people or objects in general", "Kosakata HSK 2: 个 (gè)"),
                        WordToken("人", "rén", "person; people", "Kosakata HSK 2: 人 (rén)"),
                        WordToken("说", "shuō", "to speak; to talk; to say", "Kosakata HSK 2: 说 (shuō)"),
                        WordToken("我", "wǒ", "I; me; my", "Kosakata HSK 2: 我 (wǒ)"),
                        WordToken("家", "jiā", "home / family / (polite) my (sister, uncle etc)", "Kosakata HSK 2: 家 (jiā)"),
                        WordToken("的", "de", "possessive particle (of; 's) / modifying particle (used after an attribute to modify a noun or to form a nominal expression)", "Kosakata HSK 2: 的 (de)"),
                        WordToken("狗", "gǒu", "dog", "Kosakata HSK 2: 狗 (gǒu)"),
                        WordToken("会", "huì", "can; to have the skill; to know how to", "Kosakata HSK 2: 会 (huì)"),
                        WordToken("做", "zuò", "to do; to engage in; to hold (a party etc)", "Kosakata HSK 2: 做 (zuò)"),
                        WordToken("一", "yī", "one / single / a (article)", "Kosakata HSK 2: 一 (yī)"),
                        WordToken("件", "jiàn", "classifier for events, things, clothes etc", "Kosakata HSK 2: 件 (jiàn)"),
                        WordToken("很", "hěn", "very; quite", "Kosakata HSK 2: 很 (hěn)"),
                        WordToken("特别", "tè bié", "unusual; special", "Kosakata HSK 2: 特别 (tè bié)"),
                        WordToken("的", "de", "possessive particle (of; 's) / modifying particle (used after an attribute to modify a noun or to form a nominal expression)", "Kosakata HSK 2: 的 (de)"),
                        WordToken("事", "shì", "matter / thing / item / affair", "Kosakata HSK 2: 事 (shì)"),
                        WordToken("你们", "nǐ men", "you (plural)", "Kosakata HSK 2: 你们 (nǐ men)"),
                        WordToken("的", "de", "possessive particle (of; 's) / modifying particle (used after an attribute to modify a noun or to form a nominal expression)", "Kosakata HSK 2: 的 (de)"),
                        WordToken("小", "xiǎo", "young", "Kosakata HSK 2: 小 (xiǎo)"),
                        WordToken("狗", "gǒu", "dog", "Kosakata HSK 2: 狗 (gǒu)"),
                        WordToken("一定", "yī dìng", "surely; certainly; definitely", "Kosakata HSK 2: 一定 (yī dìng)"),
                        WordToken("不", "bù", "no; not so", "Kosakata HSK 2: 不 (bù)"),
                        WordToken("会", "huì", "to be likely to; to be sure to", "Kosakata HSK 2: 会 (huì)"),
                        WordToken("它", "tā", "it", "Kosakata HSK 2: 它 (tā)"),
                        WordToken("每", "měi", "each / every", "Kosakata HSK 2: 每 (měi)"),
                        WordToken("天", "tiān", "day", "Kosakata HSK 2: 天 (tiān)"),
                        WordToken("早上", "zǎo shang", "early morning", "Kosakata HSK 2: 早上 (zǎo shang)"),
                        WordToken("都", "dōu", "all; both; entirely", "Kosakata HSK 2: 都 (dōu)"),
                        WordToken("会", "huì", "to be likely to; to be sure to", "Kosakata HSK 2: 会 (huì)"),
                        WordToken("叼", "diāo", "to hold with one's mouth", "Kosakata HSK 2: 叼 (diāo)"),
                        WordToken("报纸", "bào zhǐ", "newspaper / newsprint", "Kosakata HSK 2: 报纸 (bào zhǐ)"),
                        WordToken("回", "huí", "to go back / to turn around / to answer / to return", "Kosakata HSK 2: 回 (huí)"),
                        WordToken("家", "jiā", "home / family / (polite) my (sister, uncle etc)", "Kosakata HSK 2: 家 (jiā)")
                    )
                ),
                Sentence(
                    id = "s_smartdog_4",
                    hanzi = "其他人说：“这不难啊，很多狗都能做到！”",
                    pinyin = "qí tā rén shuō zhè bù nán a hěn duō gǒu dōu néng zuò dào",
                    translation = "Orang-orang lain menimpali: “Ah, itu kan hal biasa yang mudah, banyak anjing terlatih juga bisa melakukannya!”",
                    tokens = listOf(
                        WordToken("其他", "qí tā", "other / (sth or sb) else / the rest", "Kosakata HSK 2: 其他 (qí tā)"),
                        WordToken("人", "rén", "person; people", "Kosakata HSK 2: 人 (rén)"),
                        WordToken("说", "shuō", "to speak; to talk; to say", "Kosakata HSK 2: 说 (shuō)"),
                        WordToken("这", "zhè", "this; these", "Kosakata HSK 2: 这 (zhè)"),
                        WordToken("不", "bù", "no; not so", "Kosakata HSK 2: 不 (bù)"),
                        WordToken("难", "nán", "difficult (to...) / difficult", "Kosakata HSK 2: 难 (nán)"),
                        WordToken("啊", "a", "modal particle ending sentence, showing affirmation, approval, or consent", "Kosakata HSK 2: 啊 (a)"),
                        WordToken("很多", "hěn duō", "many; a lot of", "Kosakata HSK 2: 很多 (hěn duō)"),
                        WordToken("狗", "gǒu", "dog", "Kosakata HSK 2: 狗 (gǒu)"),
                        WordToken("都", "dōu", "all; both; entirely", "Kosakata HSK 2: 都 (dōu)"),
                        WordToken("能", "néng", "can / to be able to / might possibly", "Kosakata HSK 2: 能 (néng)"),
                        WordToken("做", "zuò", "to do; to engage in; to hold (a party etc)", "Kosakata HSK 2: 做 (zuò)"),
                        WordToken("到", "dào", "to reach; to arrive / to (a place); until (a time); up to (a point) / (verb complement indicating arriving at a place or reaching a point)", "Kosakata HSK 2: 到 (dào)")
                    )
                ),
                Sentence(
                    id = "s_smartdog_5",
                    hanzi = "“但是我没有订报纸啊！”",
                    pinyin = "dàn shì wǒ méi yǒu dìng bào zhǐ a",
                    translation = "Pria itu tersenyum kecut lalu berbisik: “Tapi masalahnya... saya sekeluarga sama sekali tidak pernah berlangganan koran apa pun!”",
                    tokens = listOf(
                        WordToken("但是", "dàn shì", "but; however", "Kosakata HSK 2: 但是 (dàn shì)"),
                        WordToken("我", "wǒ", "I; me; my", "Kosakata HSK 2: 我 (wǒ)"),
                        WordToken("没有", "méi yǒu", "haven't / hasn't", "Kosakata HSK 2: 没有 (méi yǒu)"),
                        WordToken("订", "dìng", "to agree / to conclude / to draw up / to subscribe to (a newspaper etc) / to order", "Kosakata HSK 2: 订 (dìng)"),
                        WordToken("报纸", "bào zhǐ", "newspaper / newsprint", "Kosakata HSK 2: 报纸 (bào zhǐ)"),
                        WordToken("啊", "a", "modal particle ending sentence, showing affirmation, approval, or consent", "Kosakata HSK 2: 啊 (a)")
                    )
                )
            ),
            questions = listOf(
                StoryQuestion(
                    id = "q_smartdog_1",
                    questionText = "在公园里遛狗的宠物主人们聚集在一起时，最热衷于攀比讨论什么话题？ (Topik apa yang paling sering dibanggakan dan diperdebatkan oleh para pemilik anjing di taman?)",
                    options = listOf("哪一种狗粮的价格最昂贵 (Merek makanan anjing mana yang paling mahal)", "各自争相夸赞自己家的小狗有多么聪明聪明伶俐与身怀绝技 (Saling memamerkan kecerdasan dan keahlian istimewa anjing peliharaan masing-masing)", "谁家的小狗打架最厉害 (Anjing milik siapa yang paling jago berkelahi)", "讨论公园的花草树木 (Membicarakan tanaman di taman)"),
                    correctAnswerIndex = 1,
                    explanation = "Para pemilik anjing saling pamer kepintaran anjingnya: ada yang bisa membuka pintu, menari, dan sebagainya."
                ),
                StoryQuestion(
                    id = "q_smartdog_2",
                    questionText = "其中一位狗主人胸有成竹地宣称自家小狗每天清晨都会做一件什么特别的事？ (Kemampuan unik apa yang dipamerkan oleh salah satu pemilik anjing?)",
                    options = listOf("每天早上给全家做早餐 (Setiap pagi memasak sarapan untuk seisi rumah)", "每天清晨都会叼一份崭新的报纸回家 (Setiap pagi selalu menggigit koran baru dan membawanya pulang ke rumah)", "每天早上准时叫主人起床打卡上班 (Setiap pagi membangunkan majikannya tepat waktu)", "每天早上自己去超市买肉吃 (Setiap pagi berbelanja daging sendiri ke supermarket)"),
                    correctAnswerIndex = 1,
                    explanation = "Pria itu mengklaim anjingnya secara rutin membawakan koran pagi ke rumah setiap hari."
                ),
                StoryQuestion(
                    id = "q_smartdog_3",
                    questionText = "其他狗主人起初对“叼报纸回家”这种技能抱持着怎样不以为然的态度？ (Bagaimana tanggapan remeh para pemilik anjing lain mendengar keahlian mengambil koran tersebut?)",
                    options = listOf("感到惊为天人佩服得五体投地 (Sangat takjub dan kagum luar biasa)", "觉得这种基本训练很多受训犬只都能轻易做到，根本算不上稀奇 (Menganggap itu hal lumrah yang mudah dilakukan banyak anjing terlatih)", "指责他的狗在破坏公物 (Menuduh anjingnya merusak fasilitas umum)", "怀疑那只狗其实是一只猫 (Curiga bahwa hewan itu sebenarnya adalah kucing)"),
                    correctAnswerIndex = 1,
                    explanation = "Orang-orang menyepelekan karena anjing mengambil koran dianggap trik latihan hewan yang standar."
                ),
                StoryQuestion(
                    id = "q_smartdog_4",
                    questionText = "狗主人最后轻描淡写说出的一句话，为什么瞬间让整个故事变得捧腹搞笑？ (Ucapan terakhir apa dari sang pemilik anjing yang membuat ceritanya menjadi sangat kocak?)",
                    options = listOf("“小狗只认识英文报纸” (Anjing itu cuma bisa membaca koran bahasa Inggris)", "“但是我家里从来就没有订过报纸啊！” (Tetapi keluarga saya sama sekali tidak pernah berlangganan koran apa pun!)", "“报纸全被小狗撕碎了” (Koran tersebut habis dicabik-cabik oleh anjing)", "“那份报纸是十年前的旧闻” (Koran itu ternyata terbitan sepuluh tahun silam)"),
                    correctAnswerIndex = 1,
                    explanation = "Puncak humor: karena majikan tak pernah berlangganan koran, anjing itu ternyata mencuri koran milik para tetangga setiap pagi!"
                )
            )
        ),
        // Cerita Mandarin Bean 158 (HSK 2): Who Am I? (Siapakah Aku?)
        Story(
            id = "story_who_am_i_sister",
            titleHanzi = "我是谁？",
            titlePinyin = "Wǒ Shì Shéi?",
            titleTranslation = "Who Am I? (Siapakah Aku?)",
            level = "HSK 2",
            category = "Keluarga & Mengharukan",
            description = "Kisah haru penuh kasih sayang persaudaraan: adik perempuan yang mengidap penyakit hilang ingatan langka rela melupakan dirinya sendiri demi tetap mengingat keluarganya.",
            coverEmoji = "👧",
            coverImageRes = R.drawable.cover_story_who_am_i_sister,
            estimatedReadMinutes = 2,
            sentences = listOf(
                Sentence(
                    id = "s_whoamis_1",
                    hanzi = "妹妹从小得了一种很奇怪的病，最多只能记住四个人。",
                    pinyin = "mèi mei cóng xiǎo dé le yī zhǒng hěn qí guài de bìng zuì duō zhǐ néng jì zhu sì gè rén",
                    translation = "Sejak masih balita, adik perempuanku mengidap penyakit langka yang sangat aneh, di mana memori otaknya maksimal hanya sanggup mengingat empat orang saja seumur hidupnya.",
                    tokens = listOf(
                        WordToken("妹妹", "mèi mei", "younger sister / young woman", "Kosakata HSK 2: 妹妹 (mèi mei)"),
                        WordToken("从", "cóng", "from; through; via / (bound form) retainer; attendant / (bound form) assistant; auxiliary; subordinate / (bound form) related by common paternal grandfather or earlier ancestor", "Kosakata HSK 2: 从 (cóng)"),
                        WordToken("小", "xiǎo", "young", "Kosakata HSK 2: 小 (xiǎo)"),
                        WordToken("得", "dé", "to obtain / to get / to gain / to catch (a disease)", "Kosakata HSK 2: 得 (dé)"),
                        WordToken("了", "le", "(completed action marker) / (modal particle indicating change of state, situation now)", "Kosakata HSK 2: 了 (le)"),
                        WordToken("一", "yī", "one / single / a (article)", "Kosakata HSK 2: 一 (yī)"),
                        WordToken("种", "zhǒng", "classifier for types, kinds, sorts", "Kosakata HSK 2: 种 (zhǒng)"),
                        WordToken("很", "hěn", "very; quite", "Kosakata HSK 2: 很 (hěn)"),
                        WordToken("奇怪", "qí guài", "strange / odd", "Kosakata HSK 2: 奇怪 (qí guài)"),
                        WordToken("的", "de", "possessive particle (of; 's) / modifying particle (used after an attribute to modify a noun or to form a nominal expression)", "Kosakata HSK 2: 的 (de)"),
                        WordToken("病", "bìng", "illness / disease / defect", "Kosakata HSK 2: 病 (bìng)"),
                        WordToken("最", "zuì", "(before an adjective or verb) to the highest degree; (the) most ...; -est", "Kosakata HSK 2: 最 (zuì)"),
                        WordToken("多", "duō", "many; much; more; a lot of", "Kosakata HSK 2: 多 (duō)"),
                        WordToken("只", "zhǐ", "only; merely; just", "Kosakata HSK 2: 只 (zhǐ)"),
                        WordToken("能", "néng", "can / to be able to / might possibly", "Kosakata HSK 2: 能 (néng)"),
                        WordToken("记住", "jì zhu", "to remember / to bear in mind / to learn by heart", "Kosakata HSK 2: 记住 (jì zhu)"),
                        WordToken("四", "sì", "four / 4", "Kosakata HSK 2: 四 (sì)"),
                        WordToken("个", "gè", "classifier for people or objects in general", "Kosakata HSK 2: 个 (gè)"),
                        WordToken("人", "rén", "person; people", "Kosakata HSK 2: 人 (rén)")
                    )
                ),
                Sentence(
                    id = "s_whoamis_2",
                    hanzi = "看着妹妹一天天长大，哥哥对她说:“如果你有了喜欢的人，就把我忘了吧。照顾好爸爸妈妈。”",
                    pinyin = "kàn zhe mèi mei yī tiān tiān zhǎng dà gē ge duì tā shuō rú guǒ nǐ yǒu le xǐ huan de rén jiù bǎ wǒ wàng le ba zhào gù hǎo bà ba mā ma",
                    translation = "Melihat sang adik beranjak dewasa dari hari ke hari, sang kakak berkata dengan tulus: “Kelak jika kamu sudah menemukan orang yang kamu cintai, lupakanlah aku saja. Cukup rawat ayah dan ibu kita dengan baik.”",
                    tokens = listOf(
                        WordToken("看", "kàn", "to see; to look at / to read / to watch / to visit; to call on / to consider; to regard as / to look after / to treat (a patient or illness) / to depend on / to feel (that) / (after a verb) to give it a try / to watch out for", "Kosakata HSK 2: 看 (kàn)"),
                        WordToken("着", "zhe", "aspect particle indicating action in progress or ongoing state", "Kosakata HSK 2: 着 (zhe)"),
                        WordToken("妹妹", "mèi mei", "younger sister / young woman", "Kosakata HSK 2: 妹妹 (mèi mei)"),
                        WordToken("一", "yī", "entire; whole; all; throughout", "Kosakata HSK 2: 一 (yī)"),
                        WordToken("天", "tiān", "day", "Kosakata HSK 2: 天 (tiān)"),
                        WordToken("天", "tiān", "day", "Kosakata HSK 2: 天 (tiān)"),
                        WordToken("长大", "zhǎng dà", "to grow up", "Kosakata HSK 2: 长大 (zhǎng dà)"),
                        WordToken("哥哥", "gē ge", "older brother", "Kosakata HSK 2: 哥哥 (gē ge)"),
                        WordToken("对", "duì", "towards; at; for / concerning; regarding", "Kosakata HSK 2: 对 (duì)"),
                        WordToken("她", "tā", "she", "Kosakata HSK 2: 她 (tā)"),
                        WordToken("说", "shuō", "to speak; to talk; to say", "Kosakata HSK 2: 说 (shuō)"),
                        WordToken("如果", "rú guǒ", "if; in case; in the event that", "Kosakata HSK 2: 如果 (rú guǒ)"),
                        WordToken("你", "nǐ", "you", "Kosakata HSK 2: 你 (nǐ)"),
                        WordToken("有", "yǒu", "to have; there is", "Kosakata HSK 2: 有 (yǒu)"),
                        WordToken("了", "le", "(completed action marker) / (modal particle indicating change of state, situation now)", "Kosakata HSK 2: 了 (le)"),
                        WordToken("喜欢", "xǐ huan", "to like; to be fond of", "Kosakata HSK 2: 喜欢 (xǐ huan)"),
                        WordToken("的", "de", "possessive particle (of; 's) / modifying particle (used after an attribute to modify a noun or to form a nominal expression)", "Kosakata HSK 2: 的 (de)"),
                        WordToken("人", "rén", "person; people", "Kosakata HSK 2: 人 (rén)"),
                        WordToken("就", "jiù", "merely; nothing else but; simply; just; precisely; exactly", "Kosakata HSK 2: 就 (jiù)"),
                        WordToken("把", "bǎ", "(used to put the object before the verb: 把[ba3] + {noun} + {verb})", "Kosakata HSK 2: 把 (bǎ)"),
                        WordToken("我", "wǒ", "I; me; my", "Kosakata HSK 2: 我 (wǒ)"),
                        WordToken("忘", "wàng", "to forget / to overlook / to neglect", "Kosakata HSK 2: 忘 (wàng)"),
                        WordToken("了", "le", "(completed action marker) / (modal particle indicating change of state, situation now)", "Kosakata HSK 2: 了 (le)"),
                        WordToken("吧", "ba", "(modal particle indicating suggestion or surmise) / ...right? / ...OK? / ...I presume.", "Kosakata HSK 2: 吧 (ba)"),
                        WordToken("照顾", "zhào gù", "to take care of / to show consideration / to attend to / to look after", "Kosakata HSK 2: 照顾 (zhào gù)"),
                        WordToken("好", "hǎo", "(verb complement indicating completion)", "Kosakata HSK 2: 好 (hǎo)"),
                        WordToken("爸爸", "bà ba", "(coll.) father; dad", "Kosakata HSK 2: 爸爸 (bà ba)"),
                        WordToken("妈妈", "mā ma", "mama / mommy / mother", "Kosakata HSK 2: 妈妈 (mā ma)")
                    )
                ),
                Sentence(
                    id = "s_whoamis_3",
                    hanzi = "有一天，哥哥接到一个电话，妹妹哭着问:“哥哥，我是谁啊？”",
                    pinyin = "yǒu yì tiān gē ge jiē dào yī gè diàn huà mèi mei kū zhe wèn gē ge wǒ shì shéi a",
                    translation = "Suatu hari, sang kakak menerima panggilan telepon di mana sang adik menangis tersedu-sedu sambil bertanya lirih: “Kakak... sebenarnya siapakah diriku ini?”",
                    tokens = listOf(
                        WordToken("有一天", "yǒu yì tiān", "one day; at some unspecified day in the past or future", "Kosakata HSK 2: 有一天 (yǒu yì tiān)"),
                        WordToken("哥哥", "gē ge", "older brother", "Kosakata HSK 2: 哥哥 (gē ge)"),
                        WordToken("接", "jiē", "to receive / to answer (the phone) / to meet or welcome sb", "Kosakata HSK 2: 接 (jiē)"),
                        WordToken("到", "dào", "to reach; to arrive / to (a place); until (a time); up to (a point) / (verb complement indicating arriving at a place or reaching a point)", "Kosakata HSK 2: 到 (dào)"),
                        WordToken("一", "yī", "one / single / a (article)", "Kosakata HSK 2: 一 (yī)"),
                        WordToken("个", "gè", "classifier for people or objects in general", "Kosakata HSK 2: 个 (gè)"),
                        WordToken("电话", "diàn huà", "telephone / phone call", "Kosakata HSK 2: 电话 (diàn huà)"),
                        WordToken("妹妹", "mèi mei", "younger sister / young woman", "Kosakata HSK 2: 妹妹 (mèi mei)"),
                        WordToken("哭", "kū", "to cry; to weep", "Kosakata HSK 2: 哭 (kū)"),
                        WordToken("着", "zhe", "aspect particle indicating action in progress or ongoing state", "Kosakata HSK 2: 着 (zhe)"),
                        WordToken("问", "wèn", "to ask; to inquire", "Kosakata HSK 2: 问 (wèn)"),
                        WordToken("哥哥", "gē ge", "older brother", "Kosakata HSK 2: 哥哥 (gē ge)"),
                        WordToken("我", "wǒ", "I; me; my", "Kosakata HSK 2: 我 (wǒ)"),
                        WordToken("是", "shì", "to be (followed by substantives only)", "Kosakata HSK 2: 是 (shì)"),
                        WordToken("谁", "shéi", "who", "Kosakata HSK 2: 谁 (shéi)"),
                        WordToken("啊", "a", "modal particle ending sentence, showing affirmation, approval, or consent", "Kosakata HSK 2: 啊 (a)")
                    )
                ),
                Sentence(
                    id = "s_whoamis_4",
                    hanzi = "哥哥听了感动得说不出话来，因为妹妹宁愿忘了自己，也不愿意忘了自己最爱的家人。",
                    pinyin = "gē ge tīng le gǎn dòng de shuō bù chū huà lái yīn wèi mèi mei nìng yuàn wàng le zì jǐ yě bù yuàn yì wàng le zì jǐ zuì ài de jiā rén",
                    translation = "Mendengar pertanyaan itu, sang kakak terharu hingga tercekat tak sanggup berkata-kata, karena sang adik ternyata lebih memilih melupakan identitas dirinya sendiri daripada harus melupakan keluarga yang paling dicintainya.",
                    tokens = listOf(
                        WordToken("哥哥", "gē ge", "older brother", "Kosakata HSK 2: 哥哥 (gē ge)"),
                        WordToken("听", "tīng", "to listen to; to hear", "Kosakata HSK 2: 听 (tīng)"),
                        WordToken("了", "le", "(completed action marker) / (modal particle indicating change of state, situation now)", "Kosakata HSK 2: 了 (le)"),
                        WordToken("感动", "gǎn dòng", "to move (sb) / to touch (sb emotionally)", "Kosakata HSK 2: 感动 (gǎn dòng)"),
                        WordToken("得", "de", "structural particle: used after a verb (or adjective as main verb), linking it to following phrase indicating effect, degree, possibility etc", "Kosakata HSK 2: 得 (de)"),
                        WordToken("说", "shuō", "to speak; to talk; to say", "Kosakata HSK 2: 说 (shuō)"),
                        WordToken("不", "bù", "no; not so", "Kosakata HSK 2: 不 (bù)"),
                        WordToken("出", "chū", "(used after a verb to indicate an outward direction or a positive result)", "Kosakata HSK 2: 出 (chū)"),
                        WordToken("话", "huà", "spoken words / speech / talk / words / conversation / what sb said", "Kosakata HSK 2: 话 (huà)"),
                        WordToken("来", "lái", "hither (directional complement for motion toward the speaker)", "Kosakata HSK 2: 来 (lái)"),
                        WordToken("因为", "yīn wèi", "because; owing to; on account of", "Kosakata HSK 2: 因为 (yīn wèi)"),
                        WordToken("妹妹", "mèi mei", "younger sister / young woman", "Kosakata HSK 2: 妹妹 (mèi mei)"),
                        WordToken("宁愿", "nìng yuàn", "would rather ... (than ...)", "Kosakata HSK 2: 宁愿 (nìng yuàn)"),
                        WordToken("忘", "wàng", "to forget / to overlook / to neglect", "Kosakata HSK 2: 忘 (wàng)"),
                        WordToken("了", "le", "(completed action marker) / (modal particle indicating change of state, situation now)", "Kosakata HSK 2: 了 (le)"),
                        WordToken("自己", "zì jǐ", "oneself; (attributive) one's own", "Kosakata HSK 2: 自己 (zì jǐ)"),
                        WordToken("也", "yě", "also; too; as well; (not ...) either", "Kosakata HSK 2: 也 (yě)"),
                        WordToken("不", "bù", "no; not so", "Kosakata HSK 2: 不 (bù)"),
                        WordToken("愿意", "yuàn yì", "to wish / to want / ready / willing (to do sth)", "Kosakata HSK 2: 愿意 (yuàn yì)"),
                        WordToken("忘", "wàng", "to forget / to overlook / to neglect", "Kosakata HSK 2: 忘 (wàng)"),
                        WordToken("了", "le", "(completed action marker) / (modal particle indicating change of state, situation now)", "Kosakata HSK 2: 了 (le)"),
                        WordToken("自己", "zì jǐ", "oneself; (attributive) one's own", "Kosakata HSK 2: 自己 (zì jǐ)"),
                        WordToken("最", "zuì", "(before an adjective or verb) to the highest degree; (the) most ...; -est", "Kosakata HSK 2: 最 (zuì)"),
                        WordToken("爱", "ài", "to love; to be fond of; to like", "Kosakata HSK 2: 爱 (ài)"),
                        WordToken("的", "de", "possessive particle (of; 's) / modifying particle (used after an attribute to modify a noun or to form a nominal expression)", "Kosakata HSK 2: 的 (de)"),
                        WordToken("家人", "jiā rén", "family member", "Kosakata HSK 2: 家人 (jiā rén)")
                    )
                )
            ),
            questions = listOf(
                StoryQuestion(
                    id = "q_whoamis_1",
                    questionText = "妹妹自幼患上的一种罕见疾病，导致她的记忆机制有着怎样令人心碎的残酷限制？ (Batasan memori kejam apa yang dialami sang adik akibat penyakit langka sejak kecil?)",
                    options = listOf("完全无法开口学会说话 (Sama sekali tidak bisa berbicara)", "一生的大脑容量最多只能记住并保留四个人的记忆 (Kapasitas memorinya maksimal hanya sanggup mengingat empat sosok orang seumur hidupnya)", "只能记住昨天发生的事情 (Hanya bisa mengingat kejadian satu hari kemarin)", "一见到阳光就会昏倒 (Langsung pingsan setiap kali terkena sinar matahari)"),
                    correctAnswerIndex = 1,
                    explanation = "Penyakit langka membatasi memorinya sehingga ia hanya bisa mengingat empat nama/orang terpenting saja."
                ),
                StoryQuestion(
                    id = "q_whoamis_2",
                    questionText = "看着妹妹日渐长大，哥哥怀着无私的大爱对她许下了怎样感人至深的嘱托？ (Pesan pengorbanan tulus apa yang diucapkan sang kakak saat adiknya beranjak dewasa?)",
                    options = listOf("要求妹妹永远不准谈恋爱结婚 (Melarang adiknya menikah atau berpacaran seumur hidup)", "若将来有了真心喜欢的人，就把哥哥忘掉以腾出名额，专心照顾好父母 (Jika kelak menemukan orang yang dicintai, lupakan saja sang kakak demi menyisakan slot ingatan bagi pasangannya dan tetap merawat orang tua)", "要求妹妹把父母忘掉只记住自己 (Menyuruh adiknya melupakan orang tua dan hanya mengingat dirinya)", "带妹妹去环游世界寻医问药 (Membawa adiknya keliling dunia mencari obat)"),
                    correctAnswerIndex = 1,
                    explanation = "Kakak rela dihapus dari ingatan adiknya demi kebahagiaan masa depan adiknya bersama orang yang dicintai."
                ),
                StoryQuestion(
                    id = "q_whoamis_3",
                    questionText = "有一天哥哥接起电话时，那头哭泣的妹妹提出了什么震撼心灵的疑问？ (Pertanyaan menggetarkan hati apa yang diucapkan adik di ujung telepon sambil menangis?)",
                    options = listOf("“哥哥，今天晚上吃什么菜？” (Kakak, malam ini kita makan apa?)", "“哥哥……我是谁啊？” (Kakak... sebenarnya siapakah diriku ini?)", "“哥哥，我把钥匙丢了” (Kakak, kunciku hilang)", "“哥哥，我们搬家去哪里？” (Kakak, kita pindah rumah ke mana?)"),
                    correctAnswerIndex = 1,
                    explanation = "Adik menelepon sambil menangis kebingungan menanyakan siapa nama dan identitas dirinya sendiri."
                ),
                StoryQuestion(
                    id = "q_whoamis_4",
                    questionText = "当哥哥明白妹妹为了保住对家人的记忆而选择忘掉自己时，体会到了人间何种至纯至善的情感？ (Kekuatan emosional luhur apa yang terpancar dari pilihan sang adik melupakan dirinya sendiri?)",
                    options = listOf("对病魔的无助妥协 (Keputusasaan menghadapi penyakit)", "超越生命本能与自我认同的至深亲情——宁可失去自我，也绝不遗忘挚爱家人 (Kasih persaudaraan agung yang melampaui ego diri: rela melupakan eksistensi diri demi menjaga cinta pada keluarga tercinta)", "兄妹之间严重的性格矛盾 (Konflik kepribadian antara kakak dan adik)", "对现实生活的彻底厌倦 (Rasa jenuh terhadap kehidupan)"),
                    correctAnswerIndex = 1,
                    explanation = "Pengorbanan suci seorang adik yang memilih menghapus memori tentang dirinya sendiri agar tetap bisa mengingat ayah, ibu, dan kakaknya."
                )
            )
        ),
        // Cerita Mandarin Bean 159 (HSK 2): Maternal Love (Kasih Ibu)
        Story(
            id = "story_maternal_love",
            titleHanzi = "母爱",
            titlePinyin = "Mǔ'ài",
            titleTranslation = "Maternal Love (Kasih Ibu)",
            level = "HSK 2",
            category = "Humor & Kepolosan",
            description = "Kepolosan seorang anak kecil di taman yang melihat wanita hamil dan bertanya polos mengapa sang ibu 'memakan' anaknya ke dalam perut.",
            coverEmoji = "🤰",
            coverImageRes = R.drawable.cover_story_maternal_love,
            estimatedReadMinutes = 2,
            sentences = listOf(
                Sentence(
                    id = "s_matlove_1",
                    hanzi = "有一个妈妈和她的女儿正在公园里玩。",
                    pinyin = "yǒu yī gè mā ma hé tā de nǚ ér zhèng zài gōng yuán lǐ wán",
                    translation = "Seorang ibu bersama anak perempuannya yang masih kecil sedang asyik bermain bersama di taman kota.",
                    tokens = listOf(
                        WordToken("有", "yǒu", "to have; there is", "Kosakata HSK 2: 有 (yǒu)"),
                        WordToken("一", "yī", "one / single / a (article)", "Kosakata HSK 2: 一 (yī)"),
                        WordToken("个", "gè", "classifier for people or objects in general", "Kosakata HSK 2: 个 (gè)"),
                        WordToken("妈妈", "mā ma", "mama / mommy / mother", "Kosakata HSK 2: 妈妈 (mā ma)"),
                        WordToken("和", "hé", "and; together with", "Kosakata HSK 2: 和 (hé)"),
                        WordToken("她", "tā", "she", "Kosakata HSK 2: 她 (tā)"),
                        WordToken("的", "de", "possessive particle (of; 's) / modifying particle (used after an attribute to modify a noun or to form a nominal expression)", "Kosakata HSK 2: 的 (de)"),
                        WordToken("女儿", "nǚ ér", "daughter", "Kosakata HSK 2: 女儿 (nǚ ér)"),
                        WordToken("正在", "zhèng zài", "to be in the process of (doing sth); to be currently ...-ing", "Kosakata HSK 2: 正在 (zhèng zài)"),
                        WordToken("公园", "gōng yuán", "park (for public recreation)", "Kosakata HSK 2: 公园 (gōng yuán)"),
                        WordToken("里", "lǐ", "lining / interior / inside", "Kosakata HSK 2: 里 (lǐ)"),
                        WordToken("玩", "wán", "to play / to have fun / to trifle with / to keep sth for entertainment", "Kosakata HSK 2: 玩 (wán)")
                    )
                ),
                Sentence(
                    id = "s_matlove_2",
                    hanzi = "天气太热了，所以妈妈买了一个西瓜给女儿吃。",
                    pinyin = "tiān qì tài rè le suǒ yǐ mā ma mǎi le yī gè xī guā gěi nǚ ér chī",
                    translation = "Karena terik matahari siang itu terasa sangat menyengat, sang ibu membelikan sepotong semangka segar untuk dimakan sang putri.",
                    tokens = listOf(
                        WordToken("天气", "tiān qì", "weather", "Kosakata HSK 2: 天气 (tiān qì)"),
                        WordToken("太", "tài", "too (much) / very / extremely", "Kosakata HSK 2: 太 (tài)"),
                        WordToken("热", "rè", "hot (of weather)", "Kosakata HSK 2: 热 (rè)"),
                        WordToken("了", "le", "(completed action marker) / (modal particle indicating change of state, situation now)", "Kosakata HSK 2: 了 (le)"),
                        WordToken("所以", "suǒ yǐ", "therefore / as a result / so", "Kosakata HSK 2: 所以 (suǒ yǐ)"),
                        WordToken("妈妈", "mā ma", "mama / mommy / mother", "Kosakata HSK 2: 妈妈 (mā ma)"),
                        WordToken("买", "mǎi", "to buy / to purchase", "Kosakata HSK 2: 买 (mǎi)"),
                        WordToken("了", "le", "(completed action marker) / (modal particle indicating change of state, situation now)", "Kosakata HSK 2: 了 (le)"),
                        WordToken("一", "yī", "one / single / a (article)", "Kosakata HSK 2: 一 (yī)"),
                        WordToken("个", "gè", "classifier for people or objects in general", "Kosakata HSK 2: 个 (gè)"),
                        WordToken("西瓜", "xī guā", "watermelon", "Kosakata HSK 2: 西瓜 (xī guā)"),
                        WordToken("给", "gěi", "to / for / for the benefit of / to do sth (for sb)", "Kosakata HSK 2: 给 (gěi)"),
                        WordToken("女儿", "nǚ ér", "daughter", "Kosakata HSK 2: 女儿 (nǚ ér)"),
                        WordToken("吃", "chī", "to eat; to consume / to eat at", "Kosakata HSK 2: 吃 (chī)")
                    )
                ),
                Sentence(
                    id = "s_matlove_3",
                    hanzi = "小女孩吃着西瓜，高兴地说：“妈妈，你真好！老师说母爱很伟大，是吗？”",
                    pinyin = "xiǎo nǚ hái chī zhe xī guā gāo xìng de shuō mā ma nǐ zhēn hǎo lǎo shī shuō mǔ ài hěn wěi dà shì ma",
                    translation = "Sambil mengunyah semangka manis itu, anak perempuan itu berkata gembira: “Ibu, engkau sungguh baik sekali! Guruku di sekolah bilang bahwa kasih ibu itu luar biasa mulia, benarkah begitu?”",
                    tokens = listOf(
                        WordToken("小", "xiǎo", "young", "Kosakata HSK 2: 小 (xiǎo)"),
                        WordToken("女孩", "nǚ hái", "girl; lass", "Kosakata HSK 2: 女孩 (nǚ hái)"),
                        WordToken("吃", "chī", "to eat; to consume / to eat at", "Kosakata HSK 2: 吃 (chī)"),
                        WordToken("着", "zhe", "aspect particle indicating action in progress or ongoing state", "Kosakata HSK 2: 着 (zhe)"),
                        WordToken("西瓜", "xī guā", "watermelon", "Kosakata HSK 2: 西瓜 (xī guā)"),
                        WordToken("高兴", "gāo xìng", "happy / glad / in a cheerful mood", "Kosakata HSK 2: 高兴 (gāo xìng)"),
                        WordToken("地", "de", "-ly / structural particle: used before a verb or adjective, linking it to preceding modifying adverbial adjunct", "Kosakata HSK 2: 地 (de)"),
                        WordToken("说", "shuō", "to speak; to talk; to say", "Kosakata HSK 2: 说 (shuō)"),
                        WordToken("妈妈", "mā ma", "mama / mommy / mother", "Kosakata HSK 2: 妈妈 (mā ma)"),
                        WordToken("你", "nǐ", "you", "Kosakata HSK 2: 你 (nǐ)"),
                        WordToken("真", "zhēn", "really / truly / indeed", "Kosakata HSK 2: 真 (zhēn)"),
                        WordToken("好", "hǎo", "good / appropriate; proper", "Kosakata HSK 2: 好 (hǎo)"),
                        WordToken("老师", "lǎo shī", "teacher", "Kosakata HSK 2: 老师 (lǎo shī)"),
                        WordToken("说", "shuō", "to speak; to talk; to say", "Kosakata HSK 2: 说 (shuō)"),
                        WordToken("母爱", "mǔ ài", "maternal love", "Kosakata HSK 2: 母爱 (mǔ ài)"),
                        WordToken("很", "hěn", "very; quite", "Kosakata HSK 2: 很 (hěn)"),
                        WordToken("伟大", "wěi dà", "huge; great; grand; worthy of the greatest admiration; important (contribution etc)", "Kosakata HSK 2: 伟大 (wěi dà)"),
                        WordToken("是", "shì", "correct; right; true", "Kosakata HSK 2: 是 (shì)"),
                        WordToken("吗", "ma", "(question particle for \"yes-no\" questions)", "Kosakata HSK 2: 吗 (ma)")
                    )
                ),
                Sentence(
                    id = "s_matlove_4",
                    hanzi = "妈妈回答：“是啊，每个妈妈都很爱她的孩子。”",
                    pinyin = "mā ma huí dá shì a měi gè mā ma dōu hěn ài tā de hái zi",
                    translation = "Sang ibu tersenyum hangat membalas: “Tentu saja benar, setiap ibu di dunia ini pasti mencurahkan seluruh kasih sayangnya untuk buah hatinya.”",
                    tokens = listOf(
                        WordToken("妈妈", "mā ma", "mama / mommy / mother", "Kosakata HSK 2: 妈妈 (mā ma)"),
                        WordToken("回答", "huí dá", "to reply; to answer / reply; answer", "Kosakata HSK 2: 回答 (huí dá)"),
                        WordToken("是", "shì", "indeed (used for emphasis)", "Kosakata HSK 2: 是 (shì)"),
                        WordToken("啊", "a", "modal particle ending sentence, showing affirmation, approval, or consent", "Kosakata HSK 2: 啊 (a)"),
                        WordToken("每", "měi", "each / every", "Kosakata HSK 2: 每 (měi)"),
                        WordToken("个", "gè", "classifier for people or objects in general", "Kosakata HSK 2: 个 (gè)"),
                        WordToken("妈妈", "mā ma", "mama / mommy / mother", "Kosakata HSK 2: 妈妈 (mā ma)"),
                        WordToken("都", "dōu", "all; both; entirely", "Kosakata HSK 2: 都 (dōu)"),
                        WordToken("很", "hěn", "very; quite", "Kosakata HSK 2: 很 (hěn)"),
                        WordToken("爱", "ài", "to love; to be fond of; to like", "Kosakata HSK 2: 爱 (ài)"),
                        WordToken("她", "tā", "she", "Kosakata HSK 2: 她 (tā)"),
                        WordToken("的", "de", "possessive particle (of; 's) / modifying particle (used after an attribute to modify a noun or to form a nominal expression)", "Kosakata HSK 2: 的 (de)"),
                        WordToken("孩子", "hái zi", "child", "Kosakata HSK 2: 孩子 (hái zi)")
                    )
                ),
                Sentence(
                    id = "s_matlove_5",
                    hanzi = "小女孩看着一个孕妇，疑惑地问：“但是那个阿姨为什么把她的孩子吃到肚子里去呢？”",
                    pinyin = "xiǎo nǚ hái kàn zhe yī gè yùn fù yí huò de wèn dàn shì nà gè ā yí wèi shén me bǎ tā de hái zi chī dào dù zi lǐ qù ne",
                    translation = "Tiba-tiba anak perempuan itu menoleh memandangi seorang wanita hamil yang lewat, lalu bertanya penuh kebingungan polos: “Tetapi Ibu... mengapa bibi di seberang sana tega memakan anaknya sendiri sampai masuk ke dalam perutnya?”",
                    tokens = listOf(
                        WordToken("小", "xiǎo", "young", "Kosakata HSK 2: 小 (xiǎo)"),
                        WordToken("女孩", "nǚ hái", "girl; lass", "Kosakata HSK 2: 女孩 (nǚ hái)"),
                        WordToken("看", "kàn", "to see; to look at / to read / to watch / to visit; to call on / to consider; to regard as / to look after / to treat (a patient or illness) / to depend on / to feel (that) / (after a verb) to give it a try / to watch out for", "Kosakata HSK 2: 看 (kàn)"),
                        WordToken("着", "zhe", "aspect particle indicating action in progress or ongoing state", "Kosakata HSK 2: 着 (zhe)"),
                        WordToken("一", "yī", "one / single / a (article)", "Kosakata HSK 2: 一 (yī)"),
                        WordToken("个", "gè", "classifier for people or objects in general", "Kosakata HSK 2: 个 (gè)"),
                        WordToken("孕妇", "yùn fù", "pregnant woman", "Kosakata HSK 2: 孕妇 (yùn fù)"),
                        WordToken("疑惑", "yí huò", "to doubt / to distrust / to puzzle over", "Kosakata HSK 2: 疑惑 (yí huò)"),
                        WordToken("地", "de", "-ly / structural particle: used before a verb or adjective, linking it to preceding modifying adverbial adjunct", "Kosakata HSK 2: 地 (de)"),
                        WordToken("问", "wèn", "to ask; to inquire", "Kosakata HSK 2: 问 (wèn)"),
                        WordToken("但是", "dàn shì", "but; however", "Kosakata HSK 2: 但是 (dàn shì)"),
                        WordToken("那", "nà", "(specifier) that; the; those / (pronoun) that (referring to persons, things or situations)", "Kosakata HSK 2: 那 (nà)"),
                        WordToken("个", "gè", "classifier for people or objects in general", "Kosakata HSK 2: 个 (gè)"),
                        WordToken("阿姨", "ā yí", "maternal aunt / step-mother / childcare worker / nursemaid / woman of similar age to one's parents (term of address used by child)", "Kosakata HSK 2: 阿姨 (ā yí)"),
                        WordToken("为什么", "wèi shén me", "why? / for what reason?", "Kosakata HSK 2: 为什么 (wèi shén me)"),
                        WordToken("把", "bǎ", "(used to put the object before the verb: 把[ba3] + {noun} + {verb})", "Kosakata HSK 2: 把 (bǎ)"),
                        WordToken("她", "tā", "she", "Kosakata HSK 2: 她 (tā)"),
                        WordToken("的", "de", "possessive particle (of; 's) / modifying particle (used after an attribute to modify a noun or to form a nominal expression)", "Kosakata HSK 2: 的 (de)"),
                        WordToken("孩子", "hái zi", "child", "Kosakata HSK 2: 孩子 (hái zi)"),
                        WordToken("吃", "chī", "to eat; to consume / to eat at", "Kosakata HSK 2: 吃 (chī)"),
                        WordToken("到", "dào", "to reach; to arrive / to (a place); until (a time); up to (a point) / (verb complement indicating arriving at a place or reaching a point)", "Kosakata HSK 2: 到 (dào)"),
                        WordToken("肚子", "dù zi", "belly / abdomen / stomach", "Kosakata HSK 2: 肚子 (dù zi)"),
                        WordToken("里", "lǐ", "lining / interior / inside", "Kosakata HSK 2: 里 (lǐ)"),
                        WordToken("去", "qù", "(after a verb of motion) movement away from the speaker; (after certain verbs) detachment or separation", "Kosakata HSK 2: 去 (qù)"),
                        WordToken("呢", "ne", "(sentence-final particle) used in questions to link back to prior discourse or context (\"what about...?\", \"and...?\")", "Kosakata HSK 2: 呢 (ne)")
                    )
                )
            ),
            questions = listOf(
                StoryQuestion(
                    id = "q_matlove_1",
                    questionText = "炎炎夏日公园里，妈妈为了让玩耍口渴的小女儿解暑，做了什么关爱举动？ (Tindakan kasih sayang apa yang dilakukan sang ibu untuk putrinya saat cuaca panas di taman?)",
                    options = listOf("带女儿去游乐场坐过山车 (Mengajak putrinya naik roller coaster di wahana)", "买了一个清凉解渴的大西瓜给女儿吃 (Membelikan buah semangka segar yang manis untuk dimakan bersama)", "给女儿买了一把漂亮的花阳伞 (Membelikan payung cantik bermotif bunga)", "立刻带女儿坐出租车回家开空调 (Langsung mengajak putrinya naik taksi pulang menyalakan AC)"),
                    correctAnswerIndex = 1,
                    explanation = "Ibu membelikan semangka manis menyegarkan untuk meredakan dahaga anak perempuannya di hari yang terik."
                ),
                StoryQuestion(
                    id = "q_matlove_2",
                    questionText = "吃着甜美西瓜的小女孩，高兴地向妈妈转述了学校老师教授的什么道德道理？ (Ajaran moral dari guru sekolah apa yang diungkapkan sang anak sambil menikmati semangka?)",
                    options = listOf("吃水果前一定要先洗手 (Harus mencuci tangan sebelum makan buah)", "老师教导说母爱是非常崇高与伟大的 (Guru di sekolah mengajarkan bahwa kasih sayang seorang ibu itu teramat mulia dan agung)", "西瓜皮不能乱扔在地上 (Kulit semangka tidak boleh dibuang sembarangan)", "夏天应该多喝白开水少吃冷饮 (Di musim panas perbanyak minum air putih hangat)"),
                    correctAnswerIndex = 1,
                    explanation = "Anak perempuan teringat ajaran gurunya tentang keagungan cinta kasih seorang ibu kepada anaknya."
                ),
                StoryQuestion(
                    id = "q_matlove_3",
                    questionText = "小女孩在公园偶遇一位大腹便便的孕妇时，眼神里流露出了怎样的神情？ (Ekspresi apa yang terpancar saat anak kecil itu mengamati seorang wanita hamil di seberang jalannya?)",
                    options = listOf("满心厌恶与嫌弃 (Rasa benci dan jijik)", "充满了天真幼稚与困惑不解 (Penuh dengan rasa penasaran dan kebingungan yang polos)", "极度嫉妒与生气 (Sangat cemburu dan marah)", "若无其事完全视而不见 (Bersikap acuh tak acuh)"),
                    correctAnswerIndex = 1,
                    explanation = "Melihat perut buncit sang ibu hamil, kognisi polos anak kecil membuatnya bingung mencocokkan logika fisiknya."
                ),
                StoryQuestion(
                    id = "q_matlove_4",
                    questionText = "小女孩最后向妈妈提出的那个令人哑然失笑的问题是什么？ (Pertanyaan menggelikan apa yang dilontarkan sang anak menatap perut buncit wanita hamil?)",
                    options = listOf("“那个阿姨为什么不吃西瓜？” (Mengapa bibi itu tidak makan semangka?)", "“既然母爱这么伟大，那个阿姨为什么要把自己的孩子吃到肚子里去呢？” (Jika kasih ibu begitu agung, mengapa bibi itu tega memakan anaknya sendiri sampai masuk ke dalam perutnya?!)", "“那个阿姨怀里抱的是洋娃娃吗？” (Apakah yang ada di pelukan bibi itu adalah boneka mainan?)", "“那个阿姨是不是走不动路了？” (Apakah bibi itu sudah tidak kuat berjalan?)"),
                    correctAnswerIndex = 1,
                    explanation = "Humor kepolosan anak prasekolah yang belum mengerti proses kehamilan biologis dan mengira janin di perut adalah makanan yang ditelan!"
                )
            )
        ),
        // Cerita Mandarin Bean 160 (HSK 2): Nag (Omelan di Dapur)
        Story(
            id = "story_nag",
            titleHanzi = "唠叨",
            titlePinyin = "Láodao",
            titleTranslation = "Nag (Omelan di Dapur)",
            level = "HSK 2",
            category = "Pernikahan & Humor",
            description = "Cara cerdik seorang suami membalas kebiasaan cerewet istrinya saat ia mengemudi, dengan balik mengomentari semua gerak-gerik sang istri saat memasak.",
            coverEmoji = "🍳",
            coverImageRes = R.drawable.cover_story_nag,
            estimatedReadMinutes = 2,
            sentences = listOf(
                Sentence(
                    id = "s_nagwfe_1",
                    hanzi = "妻子正在做菜，丈夫在她旁边一直唠叨不停：“慢些，小心！火太大了……油太多了……水少一点儿！”",
                    pinyin = "qī zi zhèng zài zuò cài zhàng fu zài tā páng biān yī zhí láo dao bù tíng màn xiē xiǎo xīn huǒ tài dà le yóu tài duō le shuǐ shǎo yī diǎn r",
                    translation = "Sang istri sedang sibuk mengolah hidangan di dapur, sementara sang suami terus-menerus mengomel dan mengoceh tanpa henti di sampingnya: “Awas pelan-pelan, hati-hati! Apinya terlalu besar tuh... minyaknya kebanyakan... air kuahnya dikurangi sedikit!”",
                    tokens = listOf(
                        WordToken("妻子", "qī zi", "wife", "Kosakata HSK 2: 妻子 (qī zi)"),
                        WordToken("正在", "zhèng zài", "to be in the process of (doing sth); to be currently ...-ing", "Kosakata HSK 2: 正在 (zhèng zài)"),
                        WordToken("做", "zuò", "to make; to produce", "Kosakata HSK 2: 做 (zuò)"),
                        WordToken("菜", "cài", "dish (of food)", "Kosakata HSK 2: 菜 (cài)"),
                        WordToken("丈夫", "zhàng fu", "husband", "Kosakata HSK 2: 丈夫 (zhàng fu)"),
                        WordToken("在", "zài", "(of sb or sth) to be (located) at", "Kosakata HSK 2: 在 (zài)"),
                        WordToken("她", "tā", "she", "Kosakata HSK 2: 她 (tā)"),
                        WordToken("旁边", "páng biān", "side; adjacent place", "Kosakata HSK 2: 旁边 (páng biān)"),
                        WordToken("一直", "yī zhí", "straight (in a straight line) / continuously; always; all the way through", "Kosakata HSK 2: 一直 (yī zhí)"),
                        WordToken("唠叨", "láo dao", "to prattle / to chatter away / to nag", "Kosakata HSK 2: 唠叨 (láo dao)"),
                        WordToken("不", "bù", "no; not so", "Kosakata HSK 2: 不 (bù)"),
                        WordToken("停", "tíng", "to stop / to halt", "Kosakata HSK 2: 停 (tíng)"),
                        WordToken("慢", "màn", "slow", "Kosakata HSK 2: 慢 (màn)"),
                        WordToken("些", "xiē", "classifier indicating a small amount or small number greater than 1: some, a few, several", "Kosakata HSK 2: 些 (xiē)"),
                        WordToken("小心", "xiǎo xīn", "to be careful / to take care", "Kosakata HSK 2: 小心 (xiǎo xīn)"),
                        WordToken("火", "huǒ", "fire / ammunition / internal heat (Chinese medicine) / Kangxi radical 86", "Kosakata HSK 2: 火 (huǒ)"),
                        WordToken("太", "tài", "too (much) / very / extremely", "Kosakata HSK 2: 太 (tài)"),
                        WordToken("大", "dà", "big; large; great / older (than another person) / eldest", "Kosakata HSK 2: 大 (dà)"),
                        WordToken("了", "le", "(completed action marker) / (modal particle indicating change of state, situation now)", "Kosakata HSK 2: 了 (le)"),
                        WordToken("油", "yóu", "oil / fat / grease / petroleum", "Kosakata HSK 2: 油 (yóu)"),
                        WordToken("太", "tài", "too (much) / very / extremely", "Kosakata HSK 2: 太 (tài)"),
                        WordToken("多", "duō", "too many; in excess", "Kosakata HSK 2: 多 (duō)"),
                        WordToken("了", "le", "(completed action marker) / (modal particle indicating change of state, situation now)", "Kosakata HSK 2: 了 (le)"),
                        WordToken("水", "shuǐ", "water / (after a name) ... River / (bound form) additional cost; extra income", "Kosakata HSK 2: 水 (shuǐ)"),
                        WordToken("少", "shǎo", "few / less", "Kosakata HSK 2: 少 (shǎo)"),
                        WordToken("一点儿", "yī diǎn r", "erhua", "Kosakata HSK 2: 一点儿 (yī diǎn r)")
                    )
                ),
                Sentence(
                    id = "s_nagwfe_2",
                    hanzi = "妻子生气地说：“你能不能回房间做自己的事情？我知道怎样做菜，不需要你来告诉我。”",
                    pinyin = "qī zi shēng qì de shuō nǐ néng bù néng huí fáng jiān zuò zì jǐ de shì qing wǒ zhī dào zěn yàng zuò cài bù xū yào nǐ lái gào su wǒ",
                    translation = "Merasa jengkel terganggu, sang istri membentak marah: “Bisakah kamu kembali ke kamarmu dan urus urusanmu sendiri? Aku ini tahu betul bagaimana cara memasak, tidak perlu kamu yang mengatur-aturku!”",
                    tokens = listOf(
                        WordToken("妻子", "qī zi", "wife", "Kosakata HSK 2: 妻子 (qī zi)"),
                        WordToken("生气", "shēng qì", "to get angry; to be furious", "Kosakata HSK 2: 生气 (shēng qì)"),
                        WordToken("地", "de", "-ly / structural particle: used before a verb or adjective, linking it to preceding modifying adverbial adjunct", "Kosakata HSK 2: 地 (de)"),
                        WordToken("说", "shuō", "to speak; to talk; to say", "Kosakata HSK 2: 说 (shuō)"),
                        WordToken("你", "nǐ", "you", "Kosakata HSK 2: 你 (nǐ)"),
                        WordToken("能", "néng", "can / to be able to / might possibly", "Kosakata HSK 2: 能 (néng)"),
                        WordToken("不", "bù", "no; not so", "Kosakata HSK 2: 不 (bù)"),
                        WordToken("能", "néng", "can / to be able to / might possibly", "Kosakata HSK 2: 能 (néng)"),
                        WordToken("回", "huí", "to go back / to turn around / to answer / to return", "Kosakata HSK 2: 回 (huí)"),
                        WordToken("房间", "fáng jiān", "room", "Kosakata HSK 2: 房间 (fáng jiān)"),
                        WordToken("做", "zuò", "to do; to engage in; to hold (a party etc)", "Kosakata HSK 2: 做 (zuò)"),
                        WordToken("自己", "zì jǐ", "oneself; (attributive) one's own", "Kosakata HSK 2: 自己 (zì jǐ)"),
                        WordToken("的", "de", "possessive particle (of; 's) / modifying particle (used after an attribute to modify a noun or to form a nominal expression)", "Kosakata HSK 2: 的 (de)"),
                        WordToken("事情", "shì qing", "affair; matter; thing; business", "Kosakata HSK 2: 事情 (shì qing)"),
                        WordToken("我", "wǒ", "I; me; my", "Kosakata HSK 2: 我 (wǒ)"),
                        WordToken("知道", "zhī dào", "to know; to become aware of", "Kosakata HSK 2: 知道 (zhī dào)"),
                        WordToken("怎样", "zěn yàng", "how", "Kosakata HSK 2: 怎样 (zěn yàng)"),
                        WordToken("做", "zuò", "to make; to produce", "Kosakata HSK 2: 做 (zuò)"),
                        WordToken("菜", "cài", "dish (of food)", "Kosakata HSK 2: 菜 (cài)"),
                        WordToken("不", "bù", "no; not so", "Kosakata HSK 2: 不 (bù)"),
                        WordToken("需要", "xū yào", "to need; to want; to demand; to require", "Kosakata HSK 2: 需要 (xū yào)"),
                        WordToken("你", "nǐ", "you", "Kosakata HSK 2: 你 (nǐ)"),
                        WordToken("来", "lái", "(used as a substitute for a more specific verb)", "Kosakata HSK 2: 来 (lái)"),
                        WordToken("告诉", "gào su", "to tell; to inform; to let know", "Kosakata HSK 2: 告诉 (gào su)"),
                        WordToken("我", "wǒ", "I; me; my", "Kosakata HSK 2: 我 (wǒ)")
                    )
                ),
                Sentence(
                    id = "s_nagwfe_3",
                    hanzi = "丈夫平静地回答：“我只是要让你知道，我开车时，你在旁边不停地说话，我的感觉如何……”",
                    pinyin = "zhàng fu píng jìng de huí dá wǒ zhǐ shì yào ràng nǐ zhī dào wǒ kāi chē shí nǐ zài páng biān bù tíng de shuō huà wǒ de gǎn jué rú hé",
                    translation = "Sang suami dengan wajah tenang menjawab santai: “Aku cuma ingin kamu merasakan sendiri, bagaimana rasanya hatiku saat aku sedang mengemudikan mobil lalu kamu cerewet mengoceh tanpa henti di kursi penumpang sampingku...”",
                    tokens = listOf(
                        WordToken("丈夫", "zhàng fu", "husband", "Kosakata HSK 2: 丈夫 (zhàng fu)"),
                        WordToken("平静", "píng jìng", "tranquil / undisturbed / serene", "Kosakata HSK 2: 平静 (píng jìng)"),
                        WordToken("地", "de", "-ly / structural particle: used before a verb or adjective, linking it to preceding modifying adverbial adjunct", "Kosakata HSK 2: 地 (de)"),
                        WordToken("回答", "huí dá", "to reply; to answer / reply; answer", "Kosakata HSK 2: 回答 (huí dá)"),
                        WordToken("我", "wǒ", "I; me; my", "Kosakata HSK 2: 我 (wǒ)"),
                        WordToken("只", "zhǐ", "only; merely; just", "Kosakata HSK 2: 只 (zhǐ)"),
                        WordToken("是", "shì", "indeed (used for emphasis)", "Kosakata HSK 2: 是 (shì)"),
                        WordToken("要", "yào", "to want; to need; to ask for", "Kosakata HSK 2: 要 (yào)"),
                        WordToken("让", "ràng", "to permit / to let sb do sth / to have sb do sth / to make sb (feel sad etc)", "Kosakata HSK 2: 让 (ràng)"),
                        WordToken("你", "nǐ", "you", "Kosakata HSK 2: 你 (nǐ)"),
                        WordToken("知道", "zhī dào", "to know; to become aware of", "Kosakata HSK 2: 知道 (zhī dào)"),
                        WordToken("我", "wǒ", "I; me; my", "Kosakata HSK 2: 我 (wǒ)"),
                        WordToken("开车", "kāi chē", "to drive a car (or train etc) / (slang) to post sexual content online; to make a sexual joke", "Kosakata HSK 2: 开车 (kāi chē)"),
                        WordToken("时", "shí", "when", "Kosakata HSK 2: 时 (shí)"),
                        WordToken("你", "nǐ", "you", "Kosakata HSK 2: 你 (nǐ)"),
                        WordToken("在", "zài", "(of sb or sth) to be (located) at", "Kosakata HSK 2: 在 (zài)"),
                        WordToken("旁边", "páng biān", "side; adjacent place", "Kosakata HSK 2: 旁边 (páng biān)"),
                        WordToken("不", "bù", "no; not so", "Kosakata HSK 2: 不 (bù)"),
                        WordToken("停", "tíng", "to stop / to halt", "Kosakata HSK 2: 停 (tíng)"),
                        WordToken("地", "de", "-ly / structural particle: used before a verb or adjective, linking it to preceding modifying adverbial adjunct", "Kosakata HSK 2: 地 (de)"),
                        WordToken("说话", "shuō huà", "to speak / to say / to talk / to gossip / to tell stories", "Kosakata HSK 2: 说话 (shuō huà)"),
                        WordToken("我", "wǒ", "I; me; my", "Kosakata HSK 2: 我 (wǒ)"),
                        WordToken("的", "de", "possessive particle (of; 's) / modifying particle (used after an attribute to modify a noun or to form a nominal expression)", "Kosakata HSK 2: 的 (de)"),
                        WordToken("感觉", "gǎn jué", "feeling; impression; sensation", "Kosakata HSK 2: 感觉 (gǎn jué)"),
                        WordToken("如何", "rú hé", "how / what way / what", "Kosakata HSK 2: 如何 (rú hé)")
                    )
                )
            ),
            questions = listOf(
                StoryQuestion(
                    id = "q_nagwfe_1",
                    questionText = "当妻子在厨房全神贯注炒菜做饭时，站在身旁的丈夫表现出怎样的反常行为？ (Tindakan tak biasa apa yang dilakukan sang suami saat istrinya sedang fokus memasak di dapur?)",
                    options = listOf("主动帮忙洗菜切肉刷锅 (Membantu mencuci sayur, memotong daging, dan mencuci wajan)", "在一旁像唐僧一样指手画脚、唠叨个没完没了 (Berdiri di samping mengoceh tanpa henti mengomentari api, minyak, dan bumbu)", "安静地坐在餐桌前看报纸 (Duduk membaca koran dengan tenang di meja makan)", "把厨房的燃气灶关掉了 (Mematikan kompor gas dapur)"),
                    correctAnswerIndex = 1,
                    explanation = "Suami berdiri di samping kompor dan terus-menerus mengomentari besar api, takaran minyak, dan air kuah."
                ),
                StoryQuestion(
                    id = "q_nagwfe_2",
                    questionText = "面对丈夫在耳边喋喋不休的指责，被激怒的妻子做出了怎样的情绪反弹？ (Bagaimana reaksi kemarahan sang istri menghadapi ocehan tanpa henti suaminya?)",
                    options = listOf("高兴地向丈夫虚心请教烹饪技巧 (Dengan senang hati meminta saran teknik memasak kepada suami)", "非常生气地怒斥丈夫回自己房间去，声明自己懂得做菜不需要他指手画脚 (Sangat marah membentak suami agar kembali ke kamarnya dan menegaskan ia tahu cara memasak tanpa perlu diajari)", "直接把手里的锅铲摔在地上 (Membanting sodet spatula ke lantai)", "委屈地蹲在地上大哭 (Menangis tersedu-sedu di sudut dapur)"),
                    correctAnswerIndex = 1,
                    explanation = "Istri jengkel privasi dan keahlian masaknya diganggu ocehan suami yang sok mengatur."
                ),
                StoryQuestion(
                    id = "q_nagwfe_3",
                    questionText = "丈夫面对妻子的怒火不仅没有惊慌，反而心平气和地道出了什么隐秘意图？ (Maksud tersembunyi apa yang diungkapkan suami dengan nada tenang merespons kemarahan istrinya?)",
                    options = listOf("他其实想亲自下厨做红烧肉 (Ia sebenarnya ingin memasak daging semur sendiri)", "他只是为了让妻子亲身体验一下，平日自己开车时妻子在副驾驶不停唠叨自己时的痛苦感受 (Ia sengaja berbuat demikian agar istri merasakan langsung bagaimana tersiksanya perasaan suami saat disetir dan diomeli terus-menerus saat mengemudi mobil!)", "他忘记买做菜用的食盐了 (Ia lupa membeli garam dapur)", "他在背诵新学的相声台词 (Ia sedang menghafal naskah komedi)"),
                    correctAnswerIndex = 1,
                    explanation = "Pembalasan cerdik dengan terapi empati: mengajarkan istri bagaimana rasanya menjadi 'sopir yang diomeli penumpang backseat driver'."
                ),
                StoryQuestion(
                    id = "q_nagwfe_4",
                    questionText = "这个夫妻相处的小幽默为现代婚姻关系中的沟通模式带来了什么有益启示？ (Pelajaran berharga apa mengenai komunikasi suami-istri yang tersirat dari kisah dapur ini?)",
                    options = listOf("夫妻之间应该天天互相大吵大闹 (Suami istri harus sering bertengkar setiap hari)", "学会换位思考并克制无意义的碎碎念与微观干涉，彼此给予尊重与信任的空间 (Pentingnya empati dua arah dan menahan diri dari kebiasaan mengkritik berlebihan hal-hal sepele yang dikerjakan pasangan)", "做饭时绝对不要让男人进厨房 (Jangan pernah mengizinkan pria masuk ke area dapur)", "开车时必须佩戴降噪耳塞 (Wajib memakai penutup telinga saat mengemudikan mobil)"),
                    correctAnswerIndex = 1,
                    explanation = "Saling menghargai ruang dan menahan diri dari kebiasaan cerewet adalah kunci keharmonisan rumah tangga."
                )
            )
        ),
        // Cerita Mandarin Bean 161 (HSK 2): Who Knows More? (Siapa yang Tahu Lebih Banyak?)
        Story(
            id = "story_who_knows_more",
            titleHanzi = "谁知道得多？",
            titlePinyin = "Shéi Zhīdào De Duō?",
            titleTranslation = "Who Knows More? (Siapa yang Tahu Lebih Banyak?)",
            level = "HSK 2",
            category = "Keluarga & Logika",
            description = "Pertanyaan kritis seorang anak kepada ayahnya: jika ayah selalu tahu lebih banyak daripada anak, mengapa bukan ayahnya Edison yang menemukan lampu pijar?",
            coverEmoji = "💡",
            coverImageRes = R.drawable.cover_story_who_knows_more,
            estimatedReadMinutes = 2,
            sentences = listOf(
                Sentence(
                    id = "s_whoknow_1",
                    hanzi = "小男孩问爸爸：“是不是爸爸总比孩子知道得多？”",
                    pinyin = "xiǎo nán hái wèn bà ba shì bù shì bà ba zǒng bǐ hái zi zhī dào de duō",
                    translation = "Seorang anak laki-laki bertanya kepada ayahnya: “Ayah, apakah seorang ayah selalu tahu jauh lebih banyak hal daripada anaknya?”",
                    tokens = listOf(
                        WordToken("小", "xiǎo", "young", "Kosakata HSK 2: 小 (xiǎo)"),
                        WordToken("男孩", "nán hái", "boy", "Kosakata HSK 2: 男孩 (nán hái)"),
                        WordToken("问", "wèn", "to ask; to inquire", "Kosakata HSK 2: 问 (wèn)"),
                        WordToken("爸爸", "bà ba", "(coll.) father; dad", "Kosakata HSK 2: 爸爸 (bà ba)"),
                        WordToken("是", "shì", "correct; right; true", "Kosakata HSK 2: 是 (shì)"),
                        WordToken("不", "bù", "no; not so", "Kosakata HSK 2: 不 (bù)"),
                        WordToken("是", "shì", "correct; right; true", "Kosakata HSK 2: 是 (shì)"),
                        WordToken("爸爸", "bà ba", "(coll.) father; dad", "Kosakata HSK 2: 爸爸 (bà ba)"),
                        WordToken("总", "zǒng", "in every case; always; invariably", "Kosakata HSK 2: 总 (zǒng)"),
                        WordToken("比", "bǐ", "(followed by a noun and adjective) more {adj.} than {noun} / (in some compounds derived from Classical Chinese)", "Kosakata HSK 2: 比 (bǐ)"),
                        WordToken("孩子", "hái zi", "child", "Kosakata HSK 2: 孩子 (hái zi)"),
                        WordToken("知道", "zhī dào", "to know; to become aware of", "Kosakata HSK 2: 知道 (zhī dào)"),
                        WordToken("得", "de", "structural particle: used after a verb (or adjective as main verb), linking it to following phrase indicating effect, degree, possibility etc", "Kosakata HSK 2: 得 (de)"),
                        WordToken("多", "duō", "many; much; more; a lot of", "Kosakata HSK 2: 多 (duō)")
                    )
                ),
                Sentence(
                    id = "s_whoknow_2",
                    hanzi = "爸爸回答：“当然!”",
                    pinyin = "bà ba huí dá dāng rán",
                    translation = "Ayah menjawab mantap penuh percaya diri: “Tentu saja!”",
                    tokens = listOf(
                        WordToken("爸爸", "bà ba", "(coll.) father; dad", "Kosakata HSK 2: 爸爸 (bà ba)"),
                        WordToken("回答", "huí dá", "to reply; to answer / reply; answer", "Kosakata HSK 2: 回答 (huí dá)"),
                        WordToken("当然", "dāng rán", "certainly / of course / without doubt", "Kosakata HSK 2: 当然 (dāng rán)")
                    )
                ),
                Sentence(
                    id = "s_whoknow_3",
                    hanzi = "小男孩问：“电灯是谁发明的？”",
                    pinyin = "xiǎo nán hái wèn diàn dēng shì shéi fā míng de",
                    translation = "Anak laki-laki itu bertanya lagi: “Siapakah sosok yang menemukan bola lampu listrik?”",
                    tokens = listOf(
                        WordToken("小", "xiǎo", "young", "Kosakata HSK 2: 小 (xiǎo)"),
                        WordToken("男孩", "nán hái", "boy", "Kosakata HSK 2: 男孩 (nán hái)"),
                        WordToken("问", "wèn", "to ask; to inquire", "Kosakata HSK 2: 问 (wèn)"),
                        WordToken("电灯", "diàn dēng", "electric light", "Kosakata HSK 2: 电灯 (diàn dēng)"),
                        WordToken("是", "shì", "indeed (used for emphasis)", "Kosakata HSK 2: 是 (shì)"),
                        WordToken("谁", "shéi", "who", "Kosakata HSK 2: 谁 (shéi)"),
                        WordToken("发明", "fā míng", "to invent", "Kosakata HSK 2: 发明 (fā míng)"),
                        WordToken("的", "de", "emphatic particle (used at the end of a declarative sentence for emphasis)", "Kosakata HSK 2: 的 (de)")
                    )
                ),
                Sentence(
                    id = "s_whoknow_4",
                    hanzi = "爸爸笑着回答：“爱迪生。”",
                    pinyin = "bà ba xiào zhe huí dá Ài dí shēng",
                    translation = "Ayah tersenyum bangga lalu menjawab: “Tokoh hebat bernama Thomas Edison.”",
                    tokens = listOf(
                        WordToken("爸爸", "bà ba", "(coll.) father; dad", "Kosakata HSK 2: 爸爸 (bà ba)"),
                        WordToken("笑", "xiào", "to laugh; to smile", "Kosakata HSK 2: 笑 (xiào)"),
                        WordToken("着", "zhe", "aspect particle indicating action in progress or ongoing state", "Kosakata HSK 2: 着 (zhe)"),
                        WordToken("回答", "huí dá", "to reply; to answer / reply; answer", "Kosakata HSK 2: 回答 (huí dá)"),
                        WordToken("爱迪生", "Ài dí shēng", "Edison (name) / Thomas Alva Edison (1847-1931), American inventor and businessman", "Kosakata HSK 2: 爱迪生 (Ài dí shēng)")
                    )
                ),
                Sentence(
                    id = "s_whoknow_5",
                    hanzi = "小男孩又问：“那爱迪生的爸爸怎么没有发明电灯？”",
                    pinyin = "xiǎo nán hái yòu wèn nà Ài dí shēng de bà ba zěn me méi yǒu fā míng diàn dēng",
                    translation = "Anak laki-laki itu kembali bertanya kritis: “Lalu, mengapa bukan ayahnya Edison yang menemukan lampu pijar tersebut?”",
                    tokens = listOf(
                        WordToken("小", "xiǎo", "young", "Kosakata HSK 2: 小 (xiǎo)"),
                        WordToken("男孩", "nán hái", "boy", "Kosakata HSK 2: 男孩 (nán hái)"),
                        WordToken("又", "yòu", "(once) again", "Kosakata HSK 2: 又 (yòu)"),
                        WordToken("问", "wèn", "to ask; to inquire", "Kosakata HSK 2: 问 (wèn)"),
                        WordToken("那", "nà", "then (in that case)", "Kosakata HSK 2: 那 (nà)"),
                        WordToken("爱迪生", "Ài dí shēng", "Edison (name) / Thomas Alva Edison (1847-1931), American inventor and businessman", "Kosakata HSK 2: 爱迪生 (Ài dí shēng)"),
                        WordToken("的", "de", "possessive particle (of; 's) / modifying particle (used after an attribute to modify a noun or to form a nominal expression)", "Kosakata HSK 2: 的 (de)"),
                        WordToken("爸爸", "bà ba", "(coll.) father; dad", "Kosakata HSK 2: 爸爸 (bà ba)"),
                        WordToken("怎么", "zěn me", "how? / what? / why?", "Kosakata HSK 2: 怎么 (zěn me)"),
                        WordToken("没有", "méi yǒu", "haven't / hasn't", "Kosakata HSK 2: 没有 (méi yǒu)"),
                        WordToken("发明", "fā míng", "to invent", "Kosakata HSK 2: 发明 (fā míng)"),
                        WordToken("电灯", "diàn dēng", "electric light", "Kosakata HSK 2: 电灯 (diàn dēng)")
                    )
                ),
                Sentence(
                    id = "s_whoknow_6",
                    hanzi = "爸爸看着他，不知道怎么回答这个问题。",
                    pinyin = "bà ba kàn zhe tā bù zhī dào zěn me huí dá zhè ge wèn tí",
                    translation = "Mendengar pertanyaan itu, sang ayah menatap putranya terpaku, tak tahu harus memberikan jawaban apa.",
                    tokens = listOf(
                        WordToken("爸爸", "bà ba", "(coll.) father; dad", "Kosakata HSK 2: 爸爸 (bà ba)"),
                        WordToken("看", "kàn", "to see; to look at / to read / to watch / to visit; to call on / to consider; to regard as / to look after / to treat (a patient or illness) / to depend on / to feel (that) / (after a verb) to give it a try / to watch out for", "Kosakata HSK 2: 看 (kàn)"),
                        WordToken("着", "zhe", "aspect particle indicating action in progress or ongoing state", "Kosakata HSK 2: 着 (zhe)"),
                        WordToken("他", "tā", "he; him; his", "Kosakata HSK 2: 他 (tā)"),
                        WordToken("不", "bù", "no; not so", "Kosakata HSK 2: 不 (bù)"),
                        WordToken("知道", "zhī dào", "to know; to become aware of", "Kosakata HSK 2: 知道 (zhī dào)"),
                        WordToken("怎么", "zěn me", "how? / what? / why?", "Kosakata HSK 2: 怎么 (zěn me)"),
                        WordToken("回答", "huí dá", "to reply; to answer / reply; answer", "Kosakata HSK 2: 回答 (huí dá)"),
                        WordToken("这个", "zhè ge", "(pronoun) this / (adjective) this", "Kosakata HSK 2: 这个 (zhè ge)"),
                        WordToken("问题", "wèn tí", "question / problem / issue / topic", "Kosakata HSK 2: 问题 (wèn tí)")
                    )
                ),
                Sentence(
                    id = "s_whoknow_7",
                    hanzi = "很多时候，我们知道的不一定都是对的，孩子常常能给我们新的启发！",
                    pinyin = "hěn duō shí hou wǒ men zhī dào de bù yī dìng dōu shì duì de hái zi cháng cháng néng gěi wǒ men xīn de qǐ fā",
                    translation = "Sering kali apa yang kita anggap pasti belum tentu sepenuhnya tepat; rasa ingin tahu anak-anak kerap kali memberi kita perenungan dan wawasan baru yang mencerahkan!",
                    tokens = listOf(
                        WordToken("很多", "hěn duō", "many; a lot of", "Kosakata HSK 2: 很多 (hěn duō)"),
                        WordToken("时候", "shí hou", "time / length of time / moment / period", "Kosakata HSK 2: 时候 (shí hou)"),
                        WordToken("我们", "wǒ men", "we; us; ourselves; our", "Kosakata HSK 2: 我们 (wǒ men)"),
                        WordToken("知道", "zhī dào", "to know; to become aware of", "Kosakata HSK 2: 知道 (zhī dào)"),
                        WordToken("的", "de", "possessive particle (of; 's) / modifying particle (used after an attribute to modify a noun or to form a nominal expression)", "Kosakata HSK 2: 的 (de)"),
                        WordToken("不", "bù", "no; not so", "Kosakata HSK 2: 不 (bù)"),
                        WordToken("一定", "yī dìng", "surely; certainly; definitely", "Kosakata HSK 2: 一定 (yī dìng)"),
                        WordToken("都", "dōu", "all; both; entirely", "Kosakata HSK 2: 都 (dōu)"),
                        WordToken("是", "shì", "indeed (used for emphasis)", "Kosakata HSK 2: 是 (shì)"),
                        WordToken("对", "duì", "right; correct", "Kosakata HSK 2: 对 (duì)"),
                        WordToken("的", "de", "emphatic particle (used at the end of a declarative sentence for emphasis)", "Kosakata HSK 2: 的 (de)"),
                        WordToken("孩子", "hái zi", "child", "Kosakata HSK 2: 孩子 (hái zi)"),
                        WordToken("常常", "cháng cháng", "frequently; often", "Kosakata HSK 2: 常常 (cháng cháng)"),
                        WordToken("能", "néng", "can / to be able to / might possibly", "Kosakata HSK 2: 能 (néng)"),
                        WordToken("给", "gěi", "to give", "Kosakata HSK 2: 给 (gěi)"),
                        WordToken("我们", "wǒ men", "we; us; ourselves; our", "Kosakata HSK 2: 我们 (wǒ men)"),
                        WordToken("新", "xīn", "new; newly", "Kosakata HSK 2: 新 (xīn)"),
                        WordToken("的", "de", "possessive particle (of; 's) / modifying particle (used after an attribute to modify a noun or to form a nominal expression)", "Kosakata HSK 2: 的 (de)"),
                        WordToken("启发", "qǐ fā", "enlightenment / revelation / motivation", "Kosakata HSK 2: 启发 (qǐ fā)")
                    )
                )
            ),
            questions = listOf(
                StoryQuestion(
                    id = "q_whoknow_1",
                    questionText = "故事开篇小男孩向父亲提出了一个关于长幼认知的什么原则性提问？ (Pertanyaan mendasar apa yang diajukan sang anak kepada ayahnya di awal cerita?)",
                    options = listOf("“是不是长得高的人力气一定更大？” (Apakah orang yang berbadan tinggi pasti tenaganya lebih besar?)", "“是不是身为爸爸的成年人总会比小孩子知道得更多？” (Apakah seorang ayah selalu tahu jauh lebih banyak hal daripada anak-anaknya?)", "“是不是吃肉比吃蔬菜更有营养？” (Apakah makan daging lebih bergizi daripada makan sayuran?)", "“是不是太阳比月亮距离地球更近？” (Apakah matahari lebih dekat ke bumi daripada bulan?)"),
                    correctAnswerIndex = 1,
                    explanation = "Anak laki-laki menguji doktrin otoritas orang tua: apakah ayah memang selalu serbatahu dibanding anak."
                ),
                StoryQuestion(
                    id = "q_whoknow_2",
                    questionText = "面对儿子的发问，自负的父亲做出了何种毫不犹豫的肯定回答？ (Bagaimana respons penuh percaya diri sang ayah menjawab pertanyaan pertama anaknya?)",
                    options = listOf("“这要看具体情况” (Tergantung situasi dan kondisinya)", "“那当然了，爸爸知道的肯定比你多！” (Tentu saja! Ayah pasti tahu jauh lebih banyak daripada kamu!)", "“小孩子知道的其实更多” (Sebenarnya anak kecil yang tahu lebih banyak)", "“我也不太清楚” (Ayah juga kurang paham)"),
                    correctAnswerIndex = 1,
                    explanation = "Ayah dengan bangga dan tanpa ragu langsung mengiyakan bahwa ayah selalu tahu lebih banyak."
                ),
                StoryQuestion(
                    id = "q_whoknow_3",
                    questionText = "当爸爸得意地说出是“爱迪生发明了电灯”后，儿子紧接着抛出了什么逻辑绝杀？ (Pertanyaan telak apa yang langsung dilontarkan sang anak setelah ayah menyebut Thomas Edison penemu lampu?)",
                    options = listOf("“电灯泡多少钱一个？” (Berapa harga satu buah bola lampu?)", "“既然爸爸总比儿子懂得更多，那为什么当年爱迪生的爸爸没有发明电灯呢？” (Jika ayah selalu tahu lebih banyak daripada anak, lantas mengapa bukan ayahnya Edison yang menemukan lampu pijar itu?!)", "“爱迪生有几个孩子？” (Berapa banyak anak yang dimiliki Thomas Edison?)", "“为什么不用蜡烛代替电灯？” (Mengapa tidak memakai lilin saja daripada lampu listrik?)"),
                    correctAnswerIndex = 1,
                    explanation = "Skakmat logika anak: jika teori ayah benar bahwa ayah selalu lebih pintar dari anak, seharusnya ayahnya Edisonlah yang menciptakan lampu!"
                ),
                StoryQuestion(
                    id = "q_whoknow_4",
                    questionText = "这个故事通过父亲的语塞，提示成人应当如何看待儿童的批判性思考？ (Sikap apa yang hendaknya dimiliki orang dewasa terhadap daya kritis anak berdasarkan kisah ini?)",
                    options = listOf("严厉惩罚孩子顶撞大人的行为 (Menghukum anak karena berani mendebat argumen orang tua)", "放下盲目的成人权威傲慢，以开放谦逊的心态倾听孩子的思维闪光点并接纳启发 (Menanggalkan arogansi otoritas dan bersikap rendah hati mendengarkan pemikiran kritis anak yang mencerahkan)", "禁止孩子再去阅读课外科学读物 (Melarang anak membaca buku ensiklopedia sains)", "告诉孩子大人说话永远是对的 (Mendoktrin anak bahwa ucapan orang dewasa tidak pernah salah)"),
                    correctAnswerIndex = 1,
                    explanation = "Pertanyaan kritis anak meruntuhkan ilusi serbatahu orang tua dan mengajarkan kerendahan hati dalam belajar."
                )
            )
        ),
        // Cerita Mandarin Bean 162 (HSK 2): Ensure Safety (Memastikan Keamanan Bertani)
        Story(
            id = "story_ensure_safety",
            titleHanzi = "确保安全",
            titlePinyin = "Quèbǎo Ānquán",
            titleTranslation = "Ensure Safety (Memastikan Keamanan Bertani)",
            level = "HSK 2",
            category = "Humor & Kemalasan",
            description = "Alasan kocak seorang adik petani yang selalu khawatir berlebihan tentang cuaca, sehingga pada akhirnya ia tidak menanam buah apa pun sama sekali.",
            coverEmoji = "🍉",
            coverImageRes = R.drawable.cover_story_ensure_safety,
            estimatedReadMinutes = 2,
            sentences = listOf(
                Sentence(
                    id = "s_enssafe_1",
                    hanzi = "去年，弟弟告诉我，他正在种水果。",
                    pinyin = "qù nián dì di gào su wǒ tā zhèng zài zhòng shuǐ guǒ",
                    translation = "Tahun lalu, adik laki-lakiku bercerita bahwa ia berencana bercocok tanam buah-buahan di kebun.",
                    tokens = listOf(
                        WordToken("去年", "qù nián", "last year", "Kosakata HSK 2: 去年 (qù nián)"),
                        WordToken("弟弟", "dì di", "younger brother", "Kosakata HSK 2: 弟弟 (dì di)"),
                        WordToken("告诉", "gào su", "to tell; to inform; to let know", "Kosakata HSK 2: 告诉 (gào su)"),
                        WordToken("我", "wǒ", "I; me; my", "Kosakata HSK 2: 我 (wǒ)"),
                        WordToken("他", "tā", "he; him; his", "Kosakata HSK 2: 他 (tā)"),
                        WordToken("正在", "zhèng zài", "to be in the process of (doing sth); to be currently ...-ing", "Kosakata HSK 2: 正在 (zhèng zài)"),
                        WordToken("种", "zhòng", "to plant / to grow / to cultivate", "Kosakata HSK 2: 种 (zhòng)"),
                        WordToken("水果", "shuǐ guǒ", "fruit", "Kosakata HSK 2: 水果 (shuǐ guǒ)")
                    )
                ),
                Sentence(
                    id = "s_enssafe_2",
                    hanzi = "我问他：“种西瓜了吗？”",
                    pinyin = "wǒ wèn tā zhòng xī guā le ma",
                    translation = "Aku bertanya kepadanya: “Apakah kamu menanam semangka manis?”",
                    tokens = listOf(
                        WordToken("我", "wǒ", "I; me; my", "Kosakata HSK 2: 我 (wǒ)"),
                        WordToken("问", "wèn", "to ask; to inquire", "Kosakata HSK 2: 问 (wèn)"),
                        WordToken("他", "tā", "he; him; his", "Kosakata HSK 2: 他 (tā)"),
                        WordToken("种", "zhòng", "to plant / to grow / to cultivate", "Kosakata HSK 2: 种 (zhòng)"),
                        WordToken("西瓜", "xī guā", "watermelon", "Kosakata HSK 2: 西瓜 (xī guā)"),
                        WordToken("了", "le", "(completed action marker) / (modal particle indicating change of state, situation now)", "Kosakata HSK 2: 了 (le)"),
                        WordToken("吗", "ma", "(question particle for \"yes-no\" questions)", "Kosakata HSK 2: 吗 (ma)")
                    )
                ),
                Sentence(
                    id = "s_enssafe_3",
                    hanzi = "弟弟：“没，我担心天不下雨。”",
                    pinyin = "dì di méi wǒ dān xīn tiān bù xià yǔ",
                    translation = "Adik menjawab lesu: “Tidak jadi, aku khawatir langit tidak akan menurunkan hujan.”",
                    tokens = listOf(
                        WordToken("弟弟", "dì di", "younger brother", "Kosakata HSK 2: 弟弟 (dì di)"),
                        WordToken("没", "méi", "(negative prefix for verbs) have not; not", "Kosakata HSK 2: 没 (méi)"),
                        WordToken("我", "wǒ", "I; me; my", "Kosakata HSK 2: 我 (wǒ)"),
                        WordToken("担心", "dān xīn", "to worry / to be anxious", "Kosakata HSK 2: 担心 (dān xīn)"),
                        WordToken("天", "tiān", "sky", "Kosakata HSK 2: 天 (tiān)"),
                        WordToken("不", "bù", "no; not so", "Kosakata HSK 2: 不 (bù)"),
                        WordToken("下雨", "xià yǔ", "to rain", "Kosakata HSK 2: 下雨 (xià yǔ)")
                    )
                ),
                Sentence(
                    id = "s_enssafe_4",
                    hanzi = "我又问：“那你种苹果了吗？”",
                    pinyin = "wǒ yòu wèn nà nǐ zhòng píng guǒ le ma",
                    translation = "Aku bertanya lagi: “Lalu apakah kamu menanam pohon apel?”",
                    tokens = listOf(
                        WordToken("我", "wǒ", "I; me; my", "Kosakata HSK 2: 我 (wǒ)"),
                        WordToken("又", "yòu", "(once) again", "Kosakata HSK 2: 又 (yòu)"),
                        WordToken("问", "wèn", "to ask; to inquire", "Kosakata HSK 2: 问 (wèn)"),
                        WordToken("那", "nà", "then (in that case)", "Kosakata HSK 2: 那 (nà)"),
                        WordToken("你", "nǐ", "you", "Kosakata HSK 2: 你 (nǐ)"),
                        WordToken("种", "zhòng", "to plant / to grow / to cultivate", "Kosakata HSK 2: 种 (zhòng)"),
                        WordToken("苹果", "píng guǒ", "apple", "Kosakata HSK 2: 苹果 (píng guǒ)"),
                        WordToken("了", "le", "(completed action marker) / (modal particle indicating change of state, situation now)", "Kosakata HSK 2: 了 (le)"),
                        WordToken("吗", "ma", "(question particle for \"yes-no\" questions)", "Kosakata HSK 2: 吗 (ma)")
                    )
                ),
                Sentence(
                    id = "s_enssafe_5",
                    hanzi = "弟弟：“没，我担心虫子吃了苹果。”",
                    pinyin = "dì di méi wǒ dān xīn chóng zi chī le píng guǒ",
                    translation = "Adik membalas: “Tidak juga, aku takut hama ulat akan memakan habis semua buah apelku.”",
                    tokens = listOf(
                        WordToken("弟弟", "dì di", "younger brother", "Kosakata HSK 2: 弟弟 (dì di)"),
                        WordToken("没", "méi", "(negative prefix for verbs) have not; not", "Kosakata HSK 2: 没 (méi)"),
                        WordToken("我", "wǒ", "I; me; my", "Kosakata HSK 2: 我 (wǒ)"),
                        WordToken("担心", "dān xīn", "to worry / to be anxious", "Kosakata HSK 2: 担心 (dān xīn)"),
                        WordToken("虫子", "chóng zi", "insect / bug / worm", "Kosakata HSK 2: 虫子 (chóng zi)"),
                        WordToken("吃", "chī", "to eat; to consume / to eat at", "Kosakata HSK 2: 吃 (chī)"),
                        WordToken("了", "le", "(completed action marker) / (modal particle indicating change of state, situation now)", "Kosakata HSK 2: 了 (le)"),
                        WordToken("苹果", "píng guǒ", "apple", "Kosakata HSK 2: 苹果 (píng guǒ)")
                    )
                ),
                Sentence(
                    id = "s_enssafe_6",
                    hanzi = "我再问：“那你种了什么？”",
                    pinyin = "wǒ zài wèn nà nǐ zhòng le shén me",
                    translation = "Aku pun bertanya heran: “Lantas sebenarnya buah apa yang kamu tanam di kebun?”",
                    tokens = listOf(
                        WordToken("我", "wǒ", "I; me; my", "Kosakata HSK 2: 我 (wǒ)"),
                        WordToken("再", "zài", "again; once more; re-", "Kosakata HSK 2: 再 (zài)"),
                        WordToken("问", "wèn", "to ask; to inquire", "Kosakata HSK 2: 问 (wèn)"),
                        WordToken("那", "nà", "then (in that case)", "Kosakata HSK 2: 那 (nà)"),
                        WordToken("你", "nǐ", "you", "Kosakata HSK 2: 你 (nǐ)"),
                        WordToken("种", "zhòng", "to plant / to grow / to cultivate", "Kosakata HSK 2: 种 (zhòng)"),
                        WordToken("了", "le", "(completed action marker) / (modal particle indicating change of state, situation now)", "Kosakata HSK 2: 了 (le)"),
                        WordToken("什么", "shén me", "what?", "Kosakata HSK 2: 什么 (shén me)")
                    )
                ),
                Sentence(
                    id = "s_enssafe_7",
                    hanzi = "弟弟：“什么也没种，我要确保安全。”",
                    pinyin = "dì di shén me yě méi zhòng wǒ yào què bǎo ān quán",
                    translation = "Adik menjawab mantap: “Aku tidak menanam apa pun, aku harus memastikan kebunku aman seratus persen!”",
                    tokens = listOf(
                        WordToken("弟弟", "dì di", "younger brother", "Kosakata HSK 2: 弟弟 (dì di)"),
                        WordToken("什么", "shén me", "something; anything", "Kosakata HSK 2: 什么 (shén me)"),
                        WordToken("也", "yě", "also; too; as well; (not ...) either", "Kosakata HSK 2: 也 (yě)"),
                        WordToken("没", "méi", "(negative prefix for verbs) have not; not", "Kosakata HSK 2: 没 (méi)"),
                        WordToken("种", "zhòng", "to plant / to grow / to cultivate", "Kosakata HSK 2: 种 (zhòng)"),
                        WordToken("我", "wǒ", "I; me; my", "Kosakata HSK 2: 我 (wǒ)"),
                        WordToken("要", "yào", "to want; to need; to ask for", "Kosakata HSK 2: 要 (yào)"),
                        WordToken("确保", "què bǎo", "to ensure; to guarantee", "Kosakata HSK 2: 确保 (què bǎo)"),
                        WordToken("安全", "ān quán", "safety; security", "Kosakata HSK 2: 安全 (ān quán)")
                    )
                ),
                Sentence(
                    id = "s_enssafe_8",
                    hanzi = "最后，弟弟什么也没收获。",
                    pinyin = "zuì hòu dì di shén me yě méi shōu huò",
                    translation = "Pada akhirnya, ketika musim panen raya tiba, adikku sama sekali tidak memanen hasil panen apa pun.",
                    tokens = listOf(
                        WordToken("最后", "zuì hòu", "finally; in the end", "Kosakata HSK 2: 最后 (zuì hòu)"),
                        WordToken("弟弟", "dì di", "younger brother", "Kosakata HSK 2: 弟弟 (dì di)"),
                        WordToken("什么", "shén me", "something; anything", "Kosakata HSK 2: 什么 (shén me)"),
                        WordToken("也", "yě", "also; too; as well; (not ...) either", "Kosakata HSK 2: 也 (yě)"),
                        WordToken("没", "méi", "(negative prefix for verbs) have not; not", "Kosakata HSK 2: 没 (méi)"),
                        WordToken("收获", "shōu huò", "to harvest / to reap / to gain", "Kosakata HSK 2: 收获 (shōu huò)")
                    )
                )
            ),
            questions = listOf(
                StoryQuestion(
                    id = "q_enssafe_1",
                    questionText = "去年弟弟向哥哥兴致勃勃地透露了他打算从事什么崭新的生产计划？ (Rencana kegiatan berkebun apa yang disampaikan sang adik kepada kakaknya tahun lalu?)",
                    options = listOf("去大城市学习厨师烹饪 (Pergi ke kota besar belajar menjadi koki)", "要在自家的田地里种植丰盛可口的水果 (Berencana menanam aneka buah-buahan lezat di kebun miliknya)", "要去深山里捕猎野兽 (Pergi ke hutan belantara berburu binatang)", "要开一家大型水果超市 (Membuka toko buah-buahan grosir)"),
                    correctAnswerIndex = 1,
                    explanation = "Adik berencana merintis perkebunan buah-buahan di tanah garapannya."
                ),
                StoryQuestion(
                    id = "q_enssafe_2",
                    questionText = "当哥哥问起是否种植了清凉多汁的西瓜时，弟弟给出了怎样充满担忧的借口？ (Kekhawatiran apa yang menjadi alasan adik saat ditanya apakah ia menanam semangka?)",
                    options = listOf("嫌西瓜种子价格太贵买不起 (Bibit semangka terlalu mahal tidak terbeli)", "因为过度担心老天爷不下雨发生干旱，所以放弃了种植 (Khawatir langit kemarau tidak menurunkan hujan, sehingga ia membatalkan niatnya)", "担心自己忍不住把西瓜全吃光 (Takut dirinya sendiri memakan habis buah semangka itu)", "觉得西瓜太沉搬不动 (Merasa buah semangka terlalu berat diangkat)"),
                    correctAnswerIndex = 1,
                    explanation = "Kekhawatiran berlebihan akan cuaca kering tanpa hujan membuatnya enggan menabur benih semangka."
                ),
                StoryQuestion(
                    id = "q_enssafe_3",
                    questionText = "哥哥追问是否种了苹果树时，弟弟又抬出了什么阻碍行动的顾虑？ (Alasan penghambat apa lagi yang dilontarkan sang adik ketika ditanya soal pohon apel?)",
                    options = listOf("担心苹果树长得太高摘不到 (Takut pohon apel tumbuh terlalu tinggi untuk dipetik)", "极度担心果园里的害虫会把苹果啃食破坏殆尽 (Sangat cemas hama ulat akan memakan habis semua buah apel)", "因为自己平时不爱吃苹果 (Karena dirinya tidak suka memakan buah apel)", "害怕苹果掉下来砸到头 (Takut buah apel jatuh menimpa kepalanya)"),
                    correctAnswerIndex = 1,
                    explanation = "Bayangan serangan hama ulat membuatnya takut merawat pohon apel."
                ),
                StoryQuestion(
                    id = "q_enssafe_4",
                    questionText = "弟弟为了所谓“确保百分之百安全”而做出的最终结局，揭示了关于人生的什么真理？ (Kenyataan pahit apa yang terjadi akibat obsesi keamanan semu sang adik, dan apa maknanya bagi kehidupan?)",
                    options = listOf("他成为了全村最富有的安全顾问 (Ia menjadi konsultan pertanian terkaya di desa)", "因为害怕一切潜在风险而什么也不肯付出播种，到头来在收获季落得两手空空一无所获 (Karena takut akan segala risiko dan tak berani menabur, akhirnya ia pulang dengan tangan hampa tanpa panen sedikit pun)", "他靠卖杂草发了大财 (Ia kaya raya dari menjual rumput liar)", "他的土地变成了肥沃的牧场 (Lahannya disulap menjadi padang rumput peternakan)"),
                    correctAnswerIndex = 1,
                    explanation = "Filosofi kehidupan: orang yang enggan menanggung risiko apa pun dalam hidup sejatinya menanggung risiko terbesar, yakni kegagalan total tanpa hasil."
                )
            )
        ),
        // Cerita Mandarin Bean 163 (HSK 2): The Story Of Fang Zhongyong (Kisah Tragis Si Jenius Fang Zhongyong)
        Story(
            id = "story_the_story_of_fang_zhongyong",
            titleHanzi = "方仲永的故事",
            titlePinyin = "Fāng Zhòngyǒng De Gùshi",
            titleTranslation = "The Story Of Fang Zhongyong (Kisah Tragis Si Jenius Fang Zhongyong)",
            level = "HSK 2",
            category = "Legenda & Pendidikan",
            description = "Kisah klasik pujangga Tiongkok tentang anak ajaib berbakat puisi yang akhirnya menjadi manusia biasa karena sang ayah mengeksploitasinya tanpa mau memberinya pendidikan baru.",
            coverEmoji = "📜",
            coverImageRes = R.drawable.cover_story_the_story_of_fang_zhongyong,
            estimatedReadMinutes = 2,
            sentences = listOf(
                Sentence(
                    id = "s_fangzhy_1",
                    hanzi = "从前，中国有一个非常聪明的孩子，叫“方仲永”。他没有见过笔和纸，但是五岁的时候，他突然哭着要纸和笔，说想写诗。",
                    pinyin = "cóng qián Zhōng guó yǒu yī gè fēi cháng cōng míng de hái zi jiào Fāng Zhòng yǒng tā méi yǒu jiàn guo bǐ hé zhǐ dàn shì wǔ suì de shí hou tā tū rán kū zhe yào zhǐ hé bǐ shuō xiǎng xiě shī",
                    translation = "Zaman dahulu kala di Tiongkok, hiduplah seorang anak kecil yang luar biasa jenius bernama Fang Zhongyong; ia belum pernah melihat kuas dan kertas, namun ketika berusia lima tahun, ia mendadak menangis meminta kertas dan kuas karena ingin menulis puisi.",
                    tokens = listOf(
                        WordToken("从前", "cóng qián", "previously / formerly / once upon a time", "Kosakata HSK 2: 从前 (cóng qián)"),
                        WordToken("中国", "Zhōng guó", "China", "Kosakata HSK 2: 中国 (Zhōng guó)"),
                        WordToken("有", "yǒu", "to have; there is", "Kosakata HSK 2: 有 (yǒu)"),
                        WordToken("一", "yī", "one / single / a (article)", "Kosakata HSK 2: 一 (yī)"),
                        WordToken("个", "gè", "classifier for people or objects in general", "Kosakata HSK 2: 个 (gè)"),
                        WordToken("非常", "fēi cháng", "very; really", "Kosakata HSK 2: 非常 (fēi cháng)"),
                        WordToken("聪明", "cōng míng", "intelligent; clever; bright / acute (of sight and hearing)", "Kosakata HSK 2: 聪明 (cōng míng)"),
                        WordToken("的", "de", "possessive particle (of; 's) / modifying particle (used after an attribute to modify a noun or to form a nominal expression)", "Kosakata HSK 2: 的 (de)"),
                        WordToken("孩子", "hái zi", "child", "Kosakata HSK 2: 孩子 (hái zi)"),
                        WordToken("叫", "jiào", "to be called", "Kosakata HSK 2: 叫 (jiào)"),
                        WordToken("方仲永", "Fāng Zhòng yǒng", "Fang Zhongyong; a child prodigy in a famous Chinese essay whose talents later declined.", "Kosakata HSK 2: 方仲永 (Fāng Zhòng yǒng)"),
                        WordToken("他", "tā", "he; him; his", "Kosakata HSK 2: 他 (tā)"),
                        WordToken("没有", "méi yǒu", "haven't / hasn't", "Kosakata HSK 2: 没有 (méi yǒu)"),
                        WordToken("见", "jiàn", "to see / to meet / to appear (to be sth) / to interview", "Kosakata HSK 2: 见 (jiàn)"),
                        WordToken("过", "guo", "(experienced action marker)", "Kosakata HSK 2: 过 (guo)"),
                        WordToken("笔", "bǐ", "writing brush; writing implement / brushstroke; stroke (in painting or calligraphy) / (bound form) style of writing; literary manner; technique of brushwork", "Kosakata HSK 2: 笔 (bǐ)"),
                        WordToken("和", "hé", "and; together with", "Kosakata HSK 2: 和 (hé)"),
                        WordToken("纸", "zhǐ", "paper", "Kosakata HSK 2: 纸 (zhǐ)"),
                        WordToken("但是", "dàn shì", "but; however", "Kosakata HSK 2: 但是 (dàn shì)"),
                        WordToken("五", "wǔ", "five / 5", "Kosakata HSK 2: 五 (wǔ)"),
                        WordToken("岁", "suì", "classifier for years (of age)", "Kosakata HSK 2: 岁 (suì)"),
                        WordToken("的", "de", "possessive particle (of; 's) / modifying particle (used after an attribute to modify a noun or to form a nominal expression)", "Kosakata HSK 2: 的 (de)"),
                        WordToken("时候", "shí hou", "time / length of time / moment / period", "Kosakata HSK 2: 时候 (shí hou)"),
                        WordToken("他", "tā", "he; him; his", "Kosakata HSK 2: 他 (tā)"),
                        WordToken("突然", "tū rán", "sudden; abrupt; unexpected", "Kosakata HSK 2: 突然 (tū rán)"),
                        WordToken("哭", "kū", "to cry; to weep", "Kosakata HSK 2: 哭 (kū)"),
                        WordToken("着", "zhe", "aspect particle indicating action in progress or ongoing state", "Kosakata HSK 2: 着 (zhe)"),
                        WordToken("要", "yào", "to want; to need; to ask for", "Kosakata HSK 2: 要 (yào)"),
                        WordToken("纸", "zhǐ", "paper", "Kosakata HSK 2: 纸 (zhǐ)"),
                        WordToken("和", "hé", "and; together with", "Kosakata HSK 2: 和 (hé)"),
                        WordToken("笔", "bǐ", "writing brush; writing implement / brushstroke; stroke (in painting or calligraphy) / (bound form) style of writing; literary manner; technique of brushwork", "Kosakata HSK 2: 笔 (bǐ)"),
                        WordToken("说", "shuō", "to speak; to talk; to say", "Kosakata HSK 2: 说 (shuō)"),
                        WordToken("想", "xiǎng", "to desire; to want (to)", "Kosakata HSK 2: 想 (xiǎng)"),
                        WordToken("写", "xiě", "to write", "Kosakata HSK 2: 写 (xiě)"),
                        WordToken("诗", "shī", "poem / poetry / verse", "Kosakata HSK 2: 诗 (shī)")
                    )
                ),
                Sentence(
                    id = "s_fangzhy_2",
                    hanzi = "他爸爸借来笔和纸，他拿起笔就写了一首诗，大家都觉得他写得不错。",
                    pinyin = "tā bà ba jiè lái bǐ hé zhǐ tā ná qǐ bǐ jiù xiě le yī shǒu shī dà jiā dōu jué de tā xiě de bù cuò",
                    translation = "Ayahnya meminjam kuas dan kertas dari tetangga, begitu memegang kuas anak itu seketika menggubah sebuah bait puisi indah yang membuat semua orang terkagum-kagum.",
                    tokens = listOf(
                        WordToken("他", "tā", "he; him; his", "Kosakata HSK 2: 他 (tā)"),
                        WordToken("爸爸", "bà ba", "(coll.) father; dad", "Kosakata HSK 2: 爸爸 (bà ba)"),
                        WordToken("借", "jiè", "to borrow / to lend / to make use of; to avail oneself of", "Kosakata HSK 2: 借 (jiè)"),
                        WordToken("来", "lái", "hither (directional complement for motion toward the speaker)", "Kosakata HSK 2: 来 (lái)"),
                        WordToken("笔", "bǐ", "writing brush; writing implement / brushstroke; stroke (in painting or calligraphy) / (bound form) style of writing; literary manner; technique of brushwork", "Kosakata HSK 2: 笔 (bǐ)"),
                        WordToken("和", "hé", "and; together with", "Kosakata HSK 2: 和 (hé)"),
                        WordToken("纸", "zhǐ", "paper", "Kosakata HSK 2: 纸 (zhǐ)"),
                        WordToken("他", "tā", "he; him; his", "Kosakata HSK 2: 他 (tā)"),
                        WordToken("拿", "ná", "to hold / to seize / to catch / to apprehend / to take", "Kosakata HSK 2: 拿 (ná)"),
                        WordToken("起", "qǐ", "to rise / to raise / to get up / to set out / to start / to appear / to launch / to initiate (action) / to draft / to establish / to get (from a depot or counter)", "Kosakata HSK 2: 起 (qǐ)"),
                        WordToken("笔", "bǐ", "writing brush; writing implement / brushstroke; stroke (in painting or calligraphy) / (bound form) style of writing; literary manner; technique of brushwork", "Kosakata HSK 2: 笔 (bǐ)"),
                        WordToken("就", "jiù", "as soon as; immediately after", "Kosakata HSK 2: 就 (jiù)"),
                        WordToken("写", "xiě", "to write", "Kosakata HSK 2: 写 (xiě)"),
                        WordToken("了", "le", "(completed action marker) / (modal particle indicating change of state, situation now)", "Kosakata HSK 2: 了 (le)"),
                        WordToken("一", "yī", "one / single / a (article)", "Kosakata HSK 2: 一 (yī)"),
                        WordToken("首", "shǒu", "classifier for poems, songs etc", "Kosakata HSK 2: 首 (shǒu)"),
                        WordToken("诗", "shī", "poem / poetry / verse", "Kosakata HSK 2: 诗 (shī)"),
                        WordToken("大家", "dà jiā", "everyone", "Kosakata HSK 2: 大家 (dà jiā)"),
                        WordToken("都", "dōu", "all; both; entirely", "Kosakata HSK 2: 都 (dōu)"),
                        WordToken("觉得", "jué de", "to think that ...; to feel that ...", "Kosakata HSK 2: 觉得 (jué de)"),
                        WordToken("他", "tā", "he; him; his", "Kosakata HSK 2: 他 (tā)"),
                        WordToken("写", "xiě", "to write", "Kosakata HSK 2: 写 (xiě)"),
                        WordToken("得", "de", "structural particle: used after a verb (or adjective as main verb), linking it to following phrase indicating effect, degree, possibility etc", "Kosakata HSK 2: 得 (de)"),
                        WordToken("不错", "bù cuò", "not bad / pretty good", "Kosakata HSK 2: 不错 (bù cuò)")
                    )
                ),
                Sentence(
                    id = "s_fangzhy_3",
                    hanzi = "从此，他爸爸每天让他写诗赚钱，但是不让他学习新的知识。",
                    pinyin = "cóng cǐ tā bà ba měi tiān ràng tā xiě shī zhuàn qián dàn shì bù ràng tā xué xí xīn de zhī shi",
                    translation = "Sejak saat itu, sang ayah justru memanfaatkannya dengan menyuruhnya menulis puisi keliling desa setiap hari demi mendulang uang, tanpa pernah mengizinkannya mempelajari ilmu-ilmu pengetahuan yang baru.",
                    tokens = listOf(
                        WordToken("从此", "cóng cǐ", "from now on / since then / henceforth", "Kosakata HSK 2: 从此 (cóng cǐ)"),
                        WordToken("他", "tā", "he; him; his", "Kosakata HSK 2: 他 (tā)"),
                        WordToken("爸爸", "bà ba", "(coll.) father; dad", "Kosakata HSK 2: 爸爸 (bà ba)"),
                        WordToken("每", "měi", "each / every", "Kosakata HSK 2: 每 (měi)"),
                        WordToken("天", "tiān", "day", "Kosakata HSK 2: 天 (tiān)"),
                        WordToken("让", "ràng", "to permit / to let sb do sth / to have sb do sth / to make sb (feel sad etc)", "Kosakata HSK 2: 让 (ràng)"),
                        WordToken("他", "tā", "he; him; his", "Kosakata HSK 2: 他 (tā)"),
                        WordToken("写", "xiě", "to write", "Kosakata HSK 2: 写 (xiě)"),
                        WordToken("诗", "shī", "poem / poetry / verse", "Kosakata HSK 2: 诗 (shī)"),
                        WordToken("赚钱", "zhuàn qián", "to earn money", "Kosakata HSK 2: 赚钱 (zhuàn qián)"),
                        WordToken("但是", "dàn shì", "but; however", "Kosakata HSK 2: 但是 (dàn shì)"),
                        WordToken("不", "bù", "no; not so", "Kosakata HSK 2: 不 (bù)"),
                        WordToken("让", "ràng", "to permit / to let sb do sth / to have sb do sth / to make sb (feel sad etc)", "Kosakata HSK 2: 让 (ràng)"),
                        WordToken("他", "tā", "he; him; his", "Kosakata HSK 2: 他 (tā)"),
                        WordToken("学习", "xué xí", "to learn / to study", "Kosakata HSK 2: 学习 (xué xí)"),
                        WordToken("新", "xīn", "new; newly", "Kosakata HSK 2: 新 (xīn)"),
                        WordToken("的", "de", "possessive particle (of; 's) / modifying particle (used after an attribute to modify a noun or to form a nominal expression)", "Kosakata HSK 2: 的 (de)"),
                        WordToken("知识", "zhī shi", "knowledge", "Kosakata HSK 2: 知识 (zhī shi)")
                    )
                ),
                Sentence(
                    id = "s_fangzhy_4",
                    hanzi = "所以二十岁的时候，方仲永已经和普通人一样了。",
                    pinyin = "suǒ yǐ èr shí suì de shí hou Fāng Zhòng yǒng yǐ jīng hé pǔ tōng rén yī yàng le",
                    translation = "Akibatnya, ketika Fang Zhongyong menginjak usia dua puluh tahun, seluruh bakat kejeniusannya telah pudar dan ia tak lebih dari sekadar orang biasa pada umumnya.",
                    tokens = listOf(
                        WordToken("所以", "suǒ yǐ", "therefore / as a result / so", "Kosakata HSK 2: 所以 (suǒ yǐ)"),
                        WordToken("二十", "èr shí", "twenty; 20", "Kosakata HSK 2: 二十 (èr shí)"),
                        WordToken("岁", "suì", "classifier for years (of age)", "Kosakata HSK 2: 岁 (suì)"),
                        WordToken("的", "de", "possessive particle (of; 's) / modifying particle (used after an attribute to modify a noun or to form a nominal expression)", "Kosakata HSK 2: 的 (de)"),
                        WordToken("时候", "shí hou", "time / length of time / moment / period", "Kosakata HSK 2: 时候 (shí hou)"),
                        WordToken("方仲永", "Fāng Zhòng yǒng", "Fang Zhongyong; a child prodigy in a famous Chinese essay whose talents later declined.", "Kosakata HSK 2: 方仲永 (Fāng Zhòng yǒng)"),
                        WordToken("已经", "yǐ jīng", "already", "Kosakata HSK 2: 已经 (yǐ jīng)"),
                        WordToken("和", "hé", "and; together with", "Kosakata HSK 2: 和 (hé)"),
                        WordToken("普通", "pǔ tōng", "common / ordinary / general / average", "Kosakata HSK 2: 普通 (pǔ tōng)"),
                        WordToken("人", "rén", "person; people", "Kosakata HSK 2: 人 (rén)"),
                        WordToken("一样", "yī yàng", "same / like / equal to / the same as", "Kosakata HSK 2: 一样 (yī yàng)"),
                        WordToken("了", "le", "(completed action marker) / (modal particle indicating change of state, situation now)", "Kosakata HSK 2: 了 (le)")
                    )
                )
            ),
            questions = listOf(
                StoryQuestion(
                    id = "q_fangzhy_1",
                    questionText = "古代神童方仲永在五岁之前的人生经历中，有着怎样惊人的神奇之处？ (Keajaiban luar biasa apa yang menyelimuti masa kecil Fang Zhongyong di usia lima tahun?)",
                    options = listOf("出生就会背诵四书五经 (Bisa menghafal kitab klasik sejak hari kelahiran)", "平生从未见过纸和笔，五岁时却突然哭闹索要纸笔当场成诗 (Seumur hidup belum pernah melihat kuas dan kertas, namun di usia 5 tahun mendadak menangis minta kertas lalu langsung menggubah puisi indah)", "力大无穷能够徒手举鼎 (Memiliki kekuatan fisik raksasa mengangkat gentong)", "能够听懂鸟兽虫鱼的语言 (Bisa memahami bahasa binatang di alam)"),
                    correctAnswerIndex = 1,
                    explanation = "Bakat alami bawaan lahir yang mencengangkan: anak desa miskin yang belum pernah melihat alat tulis seketika mampu merangkai bait puisi."
                ),
                StoryQuestion(
                    id = "q_fangzhy_2",
                    questionText = "乡邻众人看到方仲永五岁写出的诗作后，给出了怎样一致的评价？ (Penilaian apa yang diberikan oleh warga sekampung setelah membaca karya puisi anak usia lima tahun itu?)",
                    options = listOf("认为他是在胡乱涂鸦毫无文采 (Menganggap karyanya sekadar coretan anak kecil)", "一致赞叹惊艳，认为诗词文采飞扬写得极好 (Semua terkagum-kagum dan memuji kualitas puisinya yang luar biasa indah)", "嘲笑他的字写得歪歪扭扭 (Mengejek bentuk tulisan tangannya yang miring)", "怀疑是他父亲替他作弊写的 (Curiga bahwa ayahnya yang menuliskan puisi itu)"),
                    correctAnswerIndex = 1,
                    explanation = "Semua cendekiawan dan tetangga terpukau mengakui kejeniusan mutlak Fang Zhongyong."
                ),
                StoryQuestion(
                    id = "q_fangzhy_3",
                    questionText = "面对儿子的罕见文学天赋，贪婪短视的父亲采取了怎样毁灭性的教育做法？ (Perlakuan destruktif apa yang dilakukan sang ayah demi keuntungan sesaat atas bakat langka putranya?)",
                    options = listOf("砸锅卖铁送他去京城最高学府深造 (Menjual seluruh harta demi menyekolahkan anaknya ke akademi kekaisaran)", "每天拉着他四处给有钱人写诗敛财，却坚决不让他继续学习新的科学文化知识 (Menjadikannya alat eksploitasi keliling desa menulis puisi demi meraup uang tunai, tanpa mengizinkannya belajar ilmu baru)", "严禁他再动笔写任何字 (Melarangnya menyentuh kuas dan tinta lagi)", "让他拜当朝宰相为师 (Menjadikannya murid perdana menteri)"),
                    correctAnswerIndex = 1,
                    explanation = "Eksploitasi komersial tanpa asupan nutrisi ilmu baru: ayah menjadikannya mesin uang keliling tanpa mengenyam pendidikan lanjutan."
                ),
                StoryQuestion(
                    id = "q_fangzhy_4",
                    questionText = "“伤仲永”的千古悲剧在二十岁落幕时，给现代教育留下了怎样振聋发聩的历史警钟？ (Peringatan sejarah mendalam apa yang diwariskan dari kisah tragis 'Matinya Bakat Fang Zhongyong' di usia 20 tahun?)",
                    options = listOf("天生聪明的人永远不需要后天努力 (Orang yang jenius sejak lahir tidak memerlukan usaha belajar lagi)", "再耀眼的天赋若缺少后天持续不断的学习滋养与品格锤炼，终究会彻底泯灭沦为凡人 (Sebesar apa pun anugerah bakat lahiriah, tanpa proses belajar berkelanjutan dan tempaan ilmu baru, niscaya akan layu dan berakhir jadi orang biasa)", "写诗赚钱是最好的致富捷径 (Menulis puisi adalah jalan pintas terbaik menjadi kaya)", "五岁会写诗的人寿命都很短暂 (Orang yang jenius di usia 5 tahun cenderung berumur pendek)"),
                    correctAnswerIndex = 1,
                    explanation = "Karya monumental Wang Anshi (王安石) ini mengingatkan bahwa pendidikan dan kerja keras berkelanjutan (后天教育) jauh lebih menentukan daripada sekadar bakat alami."
                )
            )
        )
    )
}
