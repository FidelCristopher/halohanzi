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
    PICTURE_CHOICE,     // Pilih gambar yang benar (2x2 grid)
    MATCH_PAIRS,        // Ketuk pasangan yang sesuai (Left Hanzi, Right Translation)
    FILL_BLANK,         // Lengkapi terjemahan (Blank underline + options chips)
    SENTENCE_CHOICE,    // Pilih terjemahan yang benar (4 cards)
    SENTENCE_BUILDER    // Apa yang Anda dengar / Susun kata
}

data class PictureOption(
    val id: String,
    val label: String,
    val emoji: String,
    val isCorrect: Boolean
)

data class MatchPairItem(
    val id: String,
    val hanzi: String,
    val pinyin: String,
    val translation: String
)

data class Exercise(
    val id: String,
    val type: ExerciseType,
    val title: String, // e.g. "Pilih gambar yang benar", "Ketuk pasangan yang sesuai"
    val targetHanzi: String = "",
    val targetPinyin: String = "",
    val targetTranslation: String = "",
    val sentenceWithBlank: String = "", // e.g. "Saya _______ orang Indonesia."
    val options: List<String> = emptyList(),
    val pictureOptions: List<PictureOption> = emptyList(),
    val matchPairs: List<MatchPairItem> = emptyList(),
    val wordChips: List<String> = emptyList(),
    val correctAnswer: String = "",
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

enum class NodeIconType {
    CAP,        // Graduation cap
    DUMBBELL,   // 'H' dumbbell
    SHUFFLE,    // Cross / shuffle arrows (Screenshot 2026-10-25 210240.png)
    BOOK,       // Reading / Quiz icon
    CHEST,      // Checkpoint chest with handshake
    REST_AREA   // Unit transition gas pump
}

data class PathNode(
    val id: String,
    val title: String,
    val color: androidx.compose.ui.graphics.Color,
    val iconType: NodeIconType,
    val isCompleted: Boolean = false,
    val lessonId: String = ""
)

data class UnitCourse(
    val id: String,
    val unitNumber: Int,
    val title: String,
    val subtitle: String,
    val emoji: String,
    val level: String,
    val bannerTitle: String,
    val lessons: List<Lesson>,
    val story: Story,
    val nodes: List<PathNode> = emptyList()
)
