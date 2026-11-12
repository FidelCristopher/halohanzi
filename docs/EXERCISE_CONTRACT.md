# HALOHANZI EXERCISE DATA CONTRACT
(Standard Specification for All Stage Exercises)

Whenever the user prompts with:
"Ini soal untuk stage [X] part [Y], sesuaikan dengan template kontrak dan kerjakan di file Part[Y].kt"
Follow these strict rules without deviation:

## 1. ID Naming Formula
- Part 1: `u{unit}_p1_q{number}` (e.g. `u1_p1_q1`, `u1_p1_q2`)
- Part 2: `u{unit}_p2_q{number}` (e.g. `u1_p2_q1`, `u1_p2_q2`)
- Part 3: `u{unit}_p3_q{number}` (e.g. `u1_p3_q1`, `u1_p3_q2`)

## 2. Exercise Types & Data Formats (from Models.kt)
- `ExerciseType.PICTURE_CHOICE`: 4 options in `pictureOptions = listOf(PictureOption(..., iconRes = R.drawable.ic_..., isCorrect = ...))`
- `ExerciseType.SENTENCE_BUILDER`: 
  - `wordChips`: MUST format as `"Hanzi:Pinyin"` (e.g. `"我:wǒ"`, `"叫:jiào"`)
  - `correctAnswer`: Comma-separated without spaces (e.g. `"我,叫"`)
- `ExerciseType.MATCH_PAIRS`: 4 pairs in `matchPairs = listOf(MatchPairItem(..., hanzi, pinyin, translation))`
- `ExerciseType.FILL_BLANK`: `sentenceWithBlank`, `wordChips`, `correctAnswer`
- `ExerciseType.PINYIN_KEYBOARD`: `targetHanzi`, `targetPinyin`, `correctAnswer`
- `audioToSpeak`: Pure Hanzi text string for TTS engine.

## 3. File & Variable Naming
- Part 1: File `Stage{X}Part1Data.kt` -> Variable `val stage{X}Part1Exercises = listOf<Exercise>(...)`
- Part 2: File `Stage{X}Part2Data.kt` -> Variable `val stage{X}Part2Exercises = listOf<Exercise>(...)`
- Part 3: File `Stage{X}Part3Data.kt` -> Variable `val stage{X}Part3Exercises = listOf<Exercise>(...)`
Package: `package com.example.chineselearning.data.repository`
Imports: `import com.example.chineselearning.data.model.*` and `import com.example.chineselearning.R`
