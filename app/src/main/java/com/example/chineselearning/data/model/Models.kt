package com.example.chineselearning.data.model

data class WordToken(
    val hanzi: String,
    val pinyin: String,
    val meaning: String,
    val detail: String = ""
)

data class Sentence(
    val id: String,
    val hanzi: String,
    val pinyin: String,
    val translation: String,
    val tokens: List<WordToken>
)

data class StoryQuestion(
    val id: String,
    val questionText: String,
    val options: List<String>,
    val correctAnswerIndex: Int,
    val explanation: String
)

data class Story(
    val id: String,
    val titleHanzi: String,
    val titlePinyin: String,
    val titleTranslation: String,
    val level: String,
    val category: String,
    val description: String,
    val coverEmoji: String,
    val estimatedReadMinutes: Int,
    val sentences: List<Sentence>,
    val questions: List<StoryQuestion>
)

data class Word(
    val id: String,
    val hanzi: String,
    val pinyin: String,
    val translation: String,
    val partOfSpeech: String,
    val exampleHanzi: String,
    val examplePinyin: String,
    val exampleTranslation: String,
    val hskLevel: Int = 1,
    var isSaved: Boolean = false
)

enum class ExerciseType {
    SENTENCE_BUILDER,
    MULTIPLE_CHOICE,
    TONE_DRILL,
    LISTENING
}

data class Exercise(
    val id: String,
    val type: ExerciseType,
    val prompt: String,
    val targetHanzi: String,
    val targetPinyin: String,
    val targetTranslation: String,
    val options: List<String> = emptyList(),
    val wordChips: List<String> = emptyList(),
    val correctAnswer: String,
    val audioToSpeak: String = ""
)

data class Lesson(
    val id: String,
    val title: String,
    val subtitle: String,
    val grammarNote: String,
    val newWords: List<Word>,
    val exercises: List<Exercise>
)

data class UnitCourse(
    val id: String,
    val unitNumber: Int,
    val title: String,
    val subtitle: String,
    val emoji: String,
    val level: String,
    val lessons: List<Lesson>,
    val story: Story
)
