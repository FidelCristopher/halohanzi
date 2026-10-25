package com.example.chineselearning.data.repository

import com.example.chineselearning.data.model.*

object LearningRepository {

    // --- GLOBAL WORD DICTIONARY FOR INSTANT TAP-TO-TRANSLATE ---
    private val globalWordDictionary = mutableMapOf<String, WordToken>()

    // User's bookmarked words
    private val savedWords = mutableListOf<Word>()

    init {
        // Register common word tokens with English definitions
        registerToken("你好", "nǐ hǎo", "Hello / Hi", "The most standard greeting in Mandarin Chinese.")
        registerToken("我", "wǒ", "I / Me", "First-person singular pronoun.")
        registerToken("叫", "jiào", "To be called / Named", "Commonly used for introducing names: 我叫 (My name is...).")
        registerToken("大卫", "Dàwèi", "David (Name)", "Phonetic transliteration of the English name David.")
        registerToken("是", "shì", "To be (am / is / are)", "Copula verb linking subject and predicate.")
        registerToken("学生", "xuéshēng", "Student", "Compound of 学 (study) + 生 (person/birth).")
        registerToken("不", "bù", "No / Not", "Standard negation particle. Changes to 2nd tone 'bú' before a 4th tone.")
        registerToken("老师", "lǎoshī", "Teacher", "Respectful title and address for instructors.")
        registerToken("她", "tā", "She / Her", "Third-person feminine pronoun featuring the female radical 女.")
        registerToken("他", "tā", "He / Him", "Third-person masculine pronoun featuring the person radical 亻.")
        registerToken("中国人", "Zhōngguó rén", "Chinese person / citizen", "中国 (China) + 人 (person).")
        registerToken("印尼人", "Yìnní rén", "Indonesian person", "印尼 (Indonesia) + 人 (person).")
        registerToken("在", "zài", "At / In / Located at", "Locative preposition indicating position.")
        registerToken("学校", "xuéxiào", "School / Campus", "Place of education and study.")
        registerToken("认识", "rènshi", "To know / To recognize / To meet", "很高兴认识你 = Nice to meet you.")
        registerToken("说", "shuō", "To speak / To say", "Standard verb for speaking.")
        registerToken("很", "hěn", "Very / Quite", "Degree adverb, often used before predicate adjectives.")
        registerToken("高兴", "gāoxìng", "Happy / Glad / Pleased", "Feeling delighted or pleased.")
        registerToken("也", "yě", "Also / Too", "Adverb always positioned before verbs or adjectives.")
        registerToken("谢谢", "xièxie", "Thank you", "Expression of gratitude.")
        registerToken("再见", "zàijiàn", "Goodbye / See you again", "Literally 'see again' (再 = again, 见 = see).")

        // Food & Beverage
        registerToken("吃", "chī", "To eat", "Action of consuming food.")
        registerToken("喝", "hē", "To drink", "Action of consuming liquids.")
        registerToken("茶", "chá", "Tea", "Traditional Chinese tea beverage.")
        registerToken("绿茶", "lǜchá", "Green tea", "Unfermented traditional Chinese tea.")
        registerToken("水", "shuǐ", "Water", "Plain drinking water.")
        registerToken("包子", "bāozi", "Steamed stuffed bun", "Warm steamed bun filled with meat or vegetables.")
        registerToken("米饭", "mǐfàn", "Cooked rice", "Steamed white rice.")
        registerToken("炒面", "chǎomiàn", "Fried noodles / Chow mein", "Stir-fried wheat noodles.")
        registerToken("喜欢", "xǐhuan", "To like / To enjoy", "Expresses preference for objects or activities.")
        registerToken("好吃", "hǎochī", "Delicious (food)", "Combination of 好 (good) + 吃 (eat).")
        registerToken("好喝", "hǎohē", "Delicious / Tasty (drink)", "Combination of 好 (good) + 喝 (drink).")
        registerToken("多少钱", "duōshao qián", "How much is it?", "Essential phrase for asking prices.")
        registerToken("块", "kuài", "Yuan (currency unit)", "Colloquial term for the Chinese RMB Yuan.")

        // Family & Daily Life
        registerToken("家", "jiā", "Family / Home", "Household or family dwelling.")
        registerToken("爸爸", "bàba", "Father / Dad", "Informal term for father.")
        registerToken("妈妈", "māma", "Mother / Mom", "Informal term for mother.")
        registerToken("哥哥", "gēge", "Older brother", "Elder male sibling.")
        registerToken("妹妹", "mèimei", "Younger sister", "Younger female sibling.")
        registerToken("有", "yǒu", "To have / There is", "Indicates possession or existence.")
        registerToken("没有", "méiyǒu", "Do not have / There isn't", "Standard negation of 有.")
        registerToken("岁", "suì", "Years old (age)", "Measure word for age.")
        registerToken("几", "jǐ", "How many (usually < 10)", "Question word for small quantities.")
        registerToken("今天", "jīntiān", "Today", "The present day.")
        registerToken("明天", "míngtiān", "Tomorrow", "The day after today.")
        registerToken("昨天", "zuótiān", "Yesterday", "The day before today.")

        // Shopping & Travel
        registerToken("买", "mǎi", "To buy / To purchase", "Verb for commercial transaction.")
        registerToken("苹果", "píngguǒ", "Apple", "Crisp sweet fruit.")
        registerToken("太贵了", "tài guì le", "Too expensive!", "Classic phrase for market bargaining.")
        registerToken("便宜", "piányi", "Cheap / Inexpensive", "Low in price or affordable.")
        registerToken("去", "qù", "To go to", "Moving towards a destination.")
        registerToken("火车站", "huǒchēzhàn", "Railway station", "Terminal for passenger trains.")
        registerToken("怎么走", "zěnme zǒu", "How do I get there?", "Asking for directions or travel route.")
        registerToken("左", "zuǒ", "Left", "Left-hand direction.")
        registerToken("右", "yòu", "Right", "Right-hand direction.")
        registerToken("前", "qián", "Front / Ahead", "Forward direction.")
    }

    private fun registerToken(hanzi: String, pinyin: String, meaning: String, detail: String = "") {
        globalWordDictionary[hanzi] = WordToken(hanzi, pinyin, meaning, detail)
    }

    fun findToken(hanzi: String): WordToken {
        return globalWordDictionary[hanzi] ?: WordToken(
            hanzi = hanzi,
            pinyin = "",
            meaning = "Mandarin word",
            detail = "Tap the audio button to hear native pronunciation."
        )
    }

    fun getSavedWords(): List<Word> = savedWords

    fun toggleSaveWord(word: Word): Boolean {
        val existingIndex = savedWords.indexOfFirst { it.hanzi == word.hanzi }
        return if (existingIndex >= 0) {
            savedWords.removeAt(existingIndex)
            false
        } else {
            savedWords.add(word.copy(isSaved = true))
            true
        }
    }

    fun isWordSaved(hanzi: String): Boolean {
        return savedWords.any { it.hanzi == hanzi }
    }

    // ==========================================
    // GRADED READERS (CONTROLLED VOCABULARY STORIES)
    // ==========================================
    val stories: List<Story> = listOf(
        // Story 1 - HSK 1 Beginners
        Story(
            id = "story_1",
            titleHanzi = "我的新朋友",
            titlePinyin = "Wǒ de Xīn Péngyou",
            titleTranslation = "My New Friend",
            level = "HSK 1",
            category = "Greetings & Campus",
            description = "A warm story about David's first day on a university campus in Beijing, meeting his classmate Li Hua.",
            coverEmoji = "🎓",
            estimatedReadMinutes = 2,
            sentences = listOf(
                Sentence(
                    id = "s1_1",
                    hanzi = "你好！我叫大卫。",
                    pinyin = "Nǐ hǎo! Wǒ jiào Dàwèi.",
                    translation = "Hello! My name is David.",
                    tokens = listOf(
                        findToken("你好"),
                        findToken("我"),
                        findToken("叫"),
                        findToken("大卫")
                    )
                ),
                Sentence(
                    id = "s1_2",
                    hanzi = "我是学生，我不是老师。",
                    pinyin = "Wǒ shì xuésheng, wǒ bú shì lǎoshī.",
                    translation = "I am a student, I am not a teacher.",
                    tokens = listOf(
                        findToken("我"),
                        findToken("是"),
                        findToken("学生"),
                        findToken("不"),
                        findToken("是"),
                        findToken("老师")
                    )
                ),
                Sentence(
                    id = "s1_3",
                    hanzi = "她是李华，她是中国人。",
                    pinyin = "Tā shì Lǐ Huá, tā shì Zhōngguó rén.",
                    translation = "She is Li Hua, she is Chinese.",
                    tokens = listOf(
                        findToken("她"),
                        findToken("是"),
                        WordToken("李华", "Lǐ Huá", "Li Hua (Name)", "A popular Chinese given name."),
                        findToken("她"),
                        findToken("是"),
                        findToken("中国人")
                    )
                ),
                Sentence(
                    id = "s1_4",
                    hanzi = "我们在学校认识。",
                    pinyin = "Wǒmen zài xuéxiào rènshi.",
                    translation = "We met at school.",
                    tokens = listOf(
                        WordToken("我们", "wǒmen", "We / Us", "First-person plural pronoun."),
                        findToken("在"),
                        findToken("学校"),
                        findToken("认识")
                    )
                ),
                Sentence(
                    id = "s1_5",
                    hanzi = "李华说：“很高兴认识你！”",
                    pinyin = "Lǐ Huá shuō: \"Hěn gāoxìng rènshi nǐ!\"",
                    translation = "Li Hua said: \"Nice to meet you!\"",
                    tokens = listOf(
                        WordToken("李华", "Lǐ Huá", "Li Hua", "Name"),
                        findToken("说"),
                        findToken("很"),
                        findToken("高兴"),
                        findToken("认识"),
                        WordToken("你", "nǐ", "You", "Second-person singular pronoun.")
                    )
                ),
                Sentence(
                    id = "s1_6",
                    hanzi = "我说：“我也很高兴认识你，谢谢！”",
                    pinyin = "Wǒ shuō: \"Wǒ yě hěn gāoxìng rènshi nǐ, xièxie!\"",
                    translation = "I said: \"Nice to meet you too, thank you!\"",
                    tokens = listOf(
                        findToken("我"),
                        findToken("说"),
                        findToken("我"),
                        findToken("也"),
                        findToken("很"),
                        findToken("高兴"),
                        findToken("认识"),
                        WordToken("你", "nǐ", "You"),
                        findToken("谢谢")
                    )
                ),
                Sentence(
                    id = "s1_7",
                    hanzi = "到了下午，我们说再见。",
                    pinyin = "Dào le xiàwǔ, wǒmen shuō zàijiàn.",
                    translation = "When afternoon arrived, we said goodbye.",
                    tokens = listOf(
                        WordToken("到了", "dào le", "Arrived / Reached"),
                        WordToken("下午", "xiàwǔ", "Afternoon"),
                        WordToken("我们", "wǒmen", "We"),
                        findToken("说"),
                        findToken("再见")
                    )
                )
            ),
            questions = listOf(
                StoryQuestion(
                    id = "q1_1",
                    questionText = "Who is David? (大卫是谁？)",
                    options = listOf("Teacher (老师)", "Student (学生)", "Doctor (医生)", "Manager (经理)"),
                    correctAnswerIndex = 1,
                    explanation = "In sentence 2: '我是学生，我不是老师' (I am a student, not a teacher)."
                ),
                StoryQuestion(
                    id = "q1_2",
                    questionText = "Where is Li Hua from? (李华是哪国人？)",
                    options = listOf("Indonesia (印尼人)", "China (中国人)", "America (美国人)", "Japan (日本人)"),
                    correctAnswerIndex = 1,
                    explanation = "Sentence 3 specifies: '她是李华，她是中国人' (She is Li Hua, she is Chinese)."
                ),
                StoryQuestion(
                    id = "q1_3",
                    questionText = "Where did they meet? (他们在哪里认识？)",
                    options = listOf("At the teahouse (在茶馆)", "At school (在学校)", "At the station (在火车站)", "At home (在家里)"),
                    correctAnswerIndex = 1,
                    explanation = "Sentence 4 states: '我们在学校认识' (We met at school)."
                )
            )
        ),

        // Story 2 - HSK 1+ Dining & Food
        Story(
            id = "story_2",
            titleHanzi = "在茶馆点点心",
            titlePinyin = "Zài Cháguǎn Diǎn Diǎnxin",
            titleTranslation = "Ordering Dim Sum at the Teahouse",
            level = "HSK 1+",
            category = "Dining & Food",
            description = "Enjoying a tranquil afternoon sipping fragrant jasmine tea and ordering fresh steamed baozi.",
            coverEmoji = "🥟",
            estimatedReadMinutes = 3,
            sentences = listOf(
                Sentence(
                    id = "s2_1",
                    hanzi = "今天下午，我去中国茶馆。",
                    pinyin = "Jīntiān xiàwǔ, wǒ qù Zhōngguó cháguǎn.",
                    translation = "This afternoon, I went to a Chinese teahouse.",
                    tokens = listOf(
                        findToken("今天"),
                        WordToken("下午", "xiàwǔ", "Afternoon"),
                        findToken("我"),
                        findToken("去"),
                        WordToken("中国", "Zhōngguó", "China"),
                        WordToken("茶馆", "cháguǎn", "Teahouse", "A traditional Chinese social venue for tea drinking.")
                    )
                ),
                Sentence(
                    id = "s2_2",
                    hanzi = "服务员问：“请问，您喝什么？”",
                    pinyin = "Fúwùyuán wèn: \"Qǐngwèn, nín hē shénme?\"",
                    translation = "The waiter asked: \"May I ask, what would you like to drink?\"",
                    tokens = listOf(
                        WordToken("服务员", "fúwùyuán", "Waiter / Server"),
                        WordToken("问", "wèn", "To ask"),
                        WordToken("请问", "qǐngwèn", "May I ask / Excuse me"),
                        WordToken("您", "nín", "You (polite)"),
                        findToken("喝"),
                        WordToken("什么", "shénme", "What")
                    )
                ),
                Sentence(
                    id = "s2_3",
                    hanzi = "我说：“我喝绿茶，谢谢。”",
                    pinyin = "Wǒ shuō: \"Wǒ hē lǜchá, xièxie.\"",
                    translation = "I said: \"I'll drink green tea, thank you.\"",
                    tokens = listOf(
                        findToken("我"),
                        findToken("说"),
                        findToken("我"),
                        findToken("喝"),
                        findToken("绿茶"),
                        findToken("谢谢")
                    )
                ),
                Sentence(
                    id = "s2_4",
                    hanzi = "这里的包子非常有名，也很好吃。",
                    pinyin = "Zhèlǐ de bāozi fēicháng yǒumíng, yě hěn hǎochī.",
                    translation = "The steamed buns here are very famous, and also very delicious.",
                    tokens = listOf(
                        WordToken("这里", "zhèlǐ", "Here"),
                        WordToken("的", "de", "Possessive / descriptive particle"),
                        findToken("包子"),
                        WordToken("非常", "fēicháng", "Very / Extremely"),
                        WordToken("有名", "yǒumíng", "Famous / Well-known"),
                        findToken("也"),
                        findToken("很"),
                        findToken("好吃")
                    )
                ),
                Sentence(
                    id = "s2_5",
                    hanzi = "我点了三个热包子。",
                    pinyin = "Wǒ diǎn le sān ge rè bāozi.",
                    translation = "I ordered three hot steamed buns.",
                    tokens = listOf(
                        findToken("我"),
                        WordToken("点了", "diǎn le", "Ordered (food)"),
                        WordToken("三个", "sān ge", "Three items"),
                        WordToken("热", "rè", "Hot / Warm"),
                        findToken("包子")
                    )
                ),
                Sentence(
                    id = "s2_6",
                    hanzi = "一共多少钱？一共二十五块。",
                    pinyin = "Yígòng duōshao qián? Yígòng èrshíwǔ kuài.",
                    translation = "How much is the total? It is 25 yuan in total.",
                    tokens = listOf(
                        WordToken("一共", "yígòng", "In total / Altogether"),
                        findToken("多少钱"),
                        WordToken("一共", "yígòng", "Altogether"),
                        WordToken("二十五", "èrshíwǔ", "Twenty-five (25)"),
                        findToken("块")
                    )
                ),
                Sentence(
                    id = "s2_7",
                    hanzi = "这里的茶好喝，我很喜欢！",
                    pinyin = "Zhèlǐ de chá hǎohē, wǒ hěn xǐhuan!",
                    translation = "The tea here is tasty, I like it very much!",
                    tokens = listOf(
                        WordToken("这里", "zhèlǐ", "Here"),
                        WordToken("的", "de", "Of"),
                        findToken("茶"),
                        findToken("好喝"),
                        findToken("我"),
                        findToken("很"),
                        findToken("喜欢")
                    )
                )
            ),
            questions = listOf(
                StoryQuestion(
                    id = "q2_1",
                    questionText = "What kind of tea did David drink? (大卫喝了什么茶？)",
                    options = listOf("Black tea (红茶)", "Green tea (绿茶)", "Coffee (咖啡)", "Water (白开水)"),
                    correctAnswerIndex = 1,
                    explanation = "In sentence 3: '我喝绿茶' (I'll drink green tea)."
                ),
                StoryQuestion(
                    id = "q2_2",
                    questionText = "How many steamed buns did he order? (大卫点了几个包子？)",
                    options = listOf("1 bun (一个)", "2 buns (两个)", "3 buns (三个)", "5 buns (五个)"),
                    correctAnswerIndex = 2,
                    explanation = "Sentence 5 states: '我点了三个热包子' (I ordered three hot buns)."
                ),
                StoryQuestion(
                    id = "q2_3",
                    questionText = "How much was the bill altogether? (一共多少钱？)",
                    options = listOf("15 yuan (15块)", "20 yuan (20块)", "25 yuan (25块)", "50 yuan (50块)"),
                    correctAnswerIndex = 2,
                    explanation = "Sentence 6 mentions: '一共二十五块' (25 yuan in total)."
                )
            )
        ),

        // Story 3 - HSK 2 Shopping & Market Bargaining
        Story(
            id = "story_3",
            titleHanzi = "在水果市场买苹果",
            titlePinyin = "Zài Shuǐguǒ Shìchǎng Mǎi Píngguǒ",
            titleTranslation = "Buying Apples at the Fruit Market",
            level = "HSK 2",
            category = "Market & Shopping",
            description = "A fun bargaining conversation while buying fresh sweet red apples at a local market.",
            coverEmoji = "🍎",
            estimatedReadMinutes = 3,
            sentences = listOf(
                Sentence(
                    id = "s3_1",
                    hanzi = "周末，李华去水果市场买东西。",
                    pinyin = "Zhōumò, Lǐ Huá qù shuǐguǒ shìchǎng mǎi dōngxi.",
                    translation = "On the weekend, Li Hua went to the fruit market to do some shopping.",
                    tokens = listOf(
                        WordToken("周末", "zhōumò", "Weekend"),
                        WordToken("李华", "Lǐ Huá", "Li Hua"),
                        findToken("去"),
                        WordToken("水果市场", "shuǐguǒ shìchǎng", "Fruit market"),
                        findToken("买"),
                        WordToken("东西", "dōngxi", "Things / Goods")
                    )
                ),
                Sentence(
                    id = "s3_2",
                    hanzi = "老板说：“红苹果很甜，十块钱一斤。”",
                    pinyin = "Lǎobǎn shuō: \"Hóng píngguǒ hěn tián, shí kuài qián yì jīn.\"",
                    translation = "The shop owner said: \"Red apples are very sweet, 10 yuan per half kilo (jin).\"",
                    tokens = listOf(
                        WordToken("老板", "lǎobǎn", "Shop owner / Boss"),
                        findToken("说"),
                        WordToken("红苹果", "hóng píngguǒ", "Red apples"),
                        WordToken("很甜", "hěn tián", "Very sweet"),
                        WordToken("十块钱", "shí kuài qián", "Ten yuan"),
                        WordToken("一斤", "yì jīn", "One jin (500 grams)")
                    )
                ),
                Sentence(
                    id = "s3_3",
                    hanzi = "李华笑着说：“太贵了，便宜一点儿吧！”",
                    pinyin = "Lǐ Huá xiào zhe shuō: \"Tài guì le, piányi yìdiǎnr ba!\"",
                    translation = "Li Hua smiled and said: \"Too expensive, give a little discount!\"",
                    tokens = listOf(
                        WordToken("李华", "Lǐ Huá", "Li Hua"),
                        WordToken("笑着说", "xiào zhe shuō", "Said with a smile"),
                        findToken("太贵了"),
                        findToken("便宜"),
                        WordToken("一点儿", "yìdiǎnr", "A little bit"),
                        WordToken("吧", "ba", "Suggestion / modal particle")
                    )
                ),
                Sentence(
                    id = "s3_4",
                    hanzi = "老板说：“如果你买两斤，八块钱一斤。”",
                    pinyin = "Lǎobǎn shuō: \"Rúguǒ nǐ mǎi liǎng jīn, bā kuài qián yì jīn.\"",
                    translation = "The owner said: \"If you buy two jin, it's 8 yuan per jin.\"",
                    tokens = listOf(
                        WordToken("老板", "lǎobǎn", "Shop owner"),
                        findToken("说"),
                        WordToken("如果", "rúguǒ", "If"),
                        WordToken("你买", "nǐ mǎi", "You buy"),
                        WordToken("两斤", "liǎng jīn", "Two jin (1 kg)"),
                        WordToken("八块钱", "bā kuài qián", "Eight yuan"),
                        WordToken("一斤", "yì jīn", "Per jin")
                    )
                ),
                Sentence(
                    id = "s3_5",
                    hanzi = "李华很高兴，买了三斤大苹果。",
                    pinyin = "Lǐ Huá hěn gāoxìng, mǎi le sān jīn dà píngguǒ.",
                    translation = "Li Hua was delighted and bought three jin of big apples.",
                    tokens = listOf(
                        WordToken("李华", "Lǐ Huá", "Li Hua"),
                        findToken("很"),
                        findToken("高兴"),
                        WordToken("买了", "mǎi le", "Bought"),
                        WordToken("三斤", "sān jīn", "Three jin"),
                        WordToken("大苹果", "dà píngguǒ", "Big apples")
                    )
                )
            ),
            questions = listOf(
                StoryQuestion(
                    id = "q3_1",
                    questionText = "What was the initial price quoted per jin? (老板最开始说一斤苹果多少钱？)",
                    options = listOf("6 yuan (6块)", "8 yuan (8块)", "10 yuan (10块)", "12 yuan (12块)"),
                    correctAnswerIndex = 2,
                    explanation = "Initially the owner said: '十块钱一斤' (10 yuan per jin)."
                ),
                StoryQuestion(
                    id = "q3_2",
                    questionText = "How many jin of apples did Li Hua eventually buy? (李华最后买了多少斤？)",
                    options = listOf("1 jin (一斤)", "2 jin (两斤)", "3 jin (三斤)", "5 jin (五斤)"),
                    correctAnswerIndex = 2,
                    explanation = "Sentence 5 states: '李华很高兴，买了三斤大苹果' (Li Hua bought 3 jin)."
                )
            )
        )
    )

    // ==========================================
    // LEARNING PATH & UNITS
    // ==========================================
    val units: List<UnitCourse> = listOf(
        UnitCourse(
            id = "unit_1",
            unitNumber = 1,
            title = "Greetings & Introductions",
            subtitle = "Master essential greetings and introduce yourself in minutes",
            emoji = "👋",
            level = "HSK 1",
            story = stories[0],
            lessons = listOf(
                Lesson(
                    id = "l1_1",
                    title = "Greeting People",
                    subtitle = "Learn 'Hello' and 'Thank You'",
                    grammarNote = "Greeting pattern: 你 (you) + 好 (good) = 你好 (Hello!). To say thank you, duplicate the character 谢 (xiè) as 谢谢 (xièxie), where the second syllable is spoken softly in a neutral tone.",
                    newWords = listOf(
                        Word("w1", "你好", "nǐ hǎo", "Hello / Hi", "Greeting", "你好！很高兴认识你。", "Nǐ hǎo! Hěn gāoxìng rènshi nǐ.", "Hello! Nice to meet you.", 1),
                        Word("w2", "谢谢", "xièxie", "Thank you", "Expression", "非常感谢你！", "Fēicháng gǎnxiè nǐ!", "Thank you very much!", 1),
                        Word("w3", "再见", "zàijiàn", "Goodbye", "Expression", "明天见，再见！", "Míngtiān jiàn, zàijiàn!", "See you tomorrow, goodbye!", 1)
                    ),
                    exercises = listOf(
                        Exercise(
                            id = "ex1_1",
                            type = ExerciseType.MULTIPLE_CHOICE,
                            prompt = "What does this phrase mean?",
                            targetHanzi = "你好",
                            targetPinyin = "nǐ hǎo",
                            targetTranslation = "Hello",
                            options = listOf("Hello", "Thank you", "Goodbye", "Sorry"),
                            correctAnswer = "Hello",
                            audioToSpeak = "你好"
                        ),
                        Exercise(
                            id = "ex1_2",
                            type = ExerciseType.MULTIPLE_CHOICE,
                            prompt = "What does '谢谢 (xièxie)' mean?",
                            targetHanzi = "谢谢",
                            targetPinyin = "xièxie",
                            targetTranslation = "Thank you",
                            options = listOf("Thank you", "Goodbye", "Hello", "Sorry"),
                            correctAnswer = "Thank you",
                            audioToSpeak = "谢谢"
                        ),
                        Exercise(
                            id = "ex1_3",
                            type = ExerciseType.SENTENCE_BUILDER,
                            prompt = "Build the sentence: 'Hello! Thank you.'",
                            targetHanzi = "你好！谢谢。",
                            targetPinyin = "Nǐ hǎo! Xièxie.",
                            targetTranslation = "Hello! Thank you.",
                            wordChips = listOf("谢谢", "再见", "你好", "我"),
                            correctAnswer = "你好,谢谢",
                            audioToSpeak = "你好，谢谢。"
                        )
                    )
                ),
                Lesson(
                    id = "l1_2",
                    title = "Expressing Identity",
                    subtitle = "Learn 'I am...' and professions",
                    grammarNote = "Predicate sentence structure: 'Subject + 是 (shì) + Noun'. For negation (am not / is not), use '不是 (bú shì)'.",
                    newWords = listOf(
                        Word("w4", "我", "wǒ", "I / Me", "Pronoun", "我是学生。", "Wǒ shì xuésheng.", "I am a student.", 1),
                        Word("w5", "是", "shì", "To be (am/is/are)", "Verb", "他是我的朋友。", "Tā shì wǒ de péngyou.", "He is my friend.", 1),
                        Word("w6", "学生", "xuéshēng", "Student", "Noun", "我们是学生。", "Wǒmen shì xuésheng.", "We are students.", 1),
                        Word("w7", "老师", "lǎoshī", "Teacher", "Noun", "李老师很好。", "Lǐ lǎoshī hěn hǎo.", "Teacher Li is very kind.", 1)
                    ),
                    exercises = listOf(
                        Exercise(
                            id = "ex2_1",
                            type = ExerciseType.SENTENCE_BUILDER,
                            prompt = "Build the sentence: 'I am a student.'",
                            targetHanzi = "我是学生。",
                            targetPinyin = "Wǒ shì xuésheng.",
                            targetTranslation = "I am a student.",
                            wordChips = listOf("学生", "我", "老师", "是"),
                            correctAnswer = "我,是,学生",
                            audioToSpeak = "我是学生。"
                        ),
                        Exercise(
                            id = "ex2_2",
                            type = ExerciseType.LISTENING,
                            prompt = "Listen to the audio and pick the correct meaning:",
                            targetHanzi = "他不是老师",
                            targetPinyin = "tā bú shì lǎoshī",
                            targetTranslation = "He is not a teacher",
                            options = listOf("He is a teacher", "He is not a teacher", "I am a student", "The teacher is here"),
                            correctAnswer = "He is not a teacher",
                            audioToSpeak = "他不是老师。"
                        )
                    )
                )
            )
        ),

        UnitCourse(
            id = "unit_2",
            unitNumber = 2,
            title = "Food & Drinks at the Café",
            subtitle = "Order delicious dumplings and Chinese tea with confidence",
            emoji = "🍜",
            level = "HSK 1+",
            story = stories[1],
            lessons = listOf(
                Lesson(
                    id = "l2_1",
                    title = "Ordering Tea & Water",
                    subtitle = "Action verbs 'Eat' and 'Drink'",
                    grammarNote = "Basic action sentence: 'Subject + 吃/喝 + Food/Drink'. Example: 我喝水 (I drink water), 我吃包子 (I eat steamed buns).",
                    newWords = listOf(
                        Word("w8", "吃", "chī", "To eat", "Verb", "你吃什么？", "Nǐ chī shénme?", "What do you eat?", 1),
                        Word("w9", "喝", "hē", "To drink", "Verb", "我想喝茶。", "Wǒ xiǎng hē chá.", "I want to drink tea.", 1),
                        Word("w10", "茶", "chá", "Tea", "Noun", "中国茶很好喝。", "Zhōngguó chá hěn hǎohē.", "Chinese tea is very tasty.", 1),
                        Word("w11", "包子", "bāozi", "Steamed bun", "Noun", "早餐吃包子。", "Zǎocān chī bāozi.", "Eat steamed buns for breakfast.", 1)
                    ),
                    exercises = listOf(
                        Exercise(
                            id = "ex3_1",
                            type = ExerciseType.MULTIPLE_CHOICE,
                            prompt = "Choose the phrase meaning 'Drink Tea':",
                            targetHanzi = "喝茶",
                            targetPinyin = "hē chá",
                            targetTranslation = "Drink tea",
                            options = listOf("喝茶", "吃茶", "喝水", "吃包子"),
                            correctAnswer = "喝茶",
                            audioToSpeak = "喝茶"
                        ),
                        Exercise(
                            id = "ex3_2",
                            type = ExerciseType.SENTENCE_BUILDER,
                            prompt = "Build the sentence: 'I eat steamed buns, drink tea.'",
                            targetHanzi = "我吃包子，喝茶。",
                            targetPinyin = "Wǒ chī bāozi, hē chá.",
                            targetTranslation = "I eat steamed buns, drink tea.",
                            wordChips = listOf("包子", "喝茶", "吃", "我"),
                            correctAnswer = "我,吃,包子,喝茶",
                            audioToSpeak = "我吃包子，喝茶。"
                        )
                    )
                )
            )
        ),

        UnitCourse(
            id = "unit_3",
            unitNumber = 3,
            title = "Fruit Shopping & Bargaining",
            subtitle = "Ask prices and negotiate friendly discounts at local markets",
            emoji = "🛍️",
            level = "HSK 2",
            story = stories[2],
            lessons = listOf(
                Lesson(
                    id = "l3_1",
                    title = "Asking How Much It Costs",
                    subtitle = "Phrases '太贵了' and '多少钱'",
                    grammarNote = "Asking price: '[Item Name] + 多少钱？'. Expressing that something is too pricey: '太...了' (e.g. 太贵了！- Too expensive!).",
                    newWords = listOf(
                        Word("w12", "买", "mǎi", "To buy", "Verb", "你要买什么？", "Nǐ yào mǎi shénme?", "What do you want to buy?", 1),
                        Word("w13", "多少钱", "duōshao qián", "How much is it?", "Question phrase", "这个多少钱？", "Zhège duōshao qián?", "How much is this?", 1),
                        Word("w14", "便宜", "piányi", "Cheap / Inexpensive", "Adjective", "这个很便宜！", "Zhège hěn piányi!", "This is very cheap!", 2)
                    ),
                    exercises = listOf(
                        Exercise(
                            id = "ex4_1",
                            type = ExerciseType.MULTIPLE_CHOICE,
                            prompt = "How do you ask for the price in Mandarin?",
                            targetHanzi = "多少钱？",
                            targetPinyin = "duōshao qián?",
                            targetTranslation = "How much is it?",
                            options = listOf("多少钱？", "太贵了！", "很好吃！", "你在哪？"),
                            correctAnswer = "多少钱？",
                            audioToSpeak = "这个多少钱？"
                        )
                    )
                )
            )
        )
    )
}
