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

---

## 4. STRICT HANZI & PINYIN ALIGNMENT (TOKEN-TO-TOKEN SYMMETRY)
**CRITICAL**: Hanzi characters and Pinyin tokens MUST align 1-to-1 in token count and spacing.
- **Rule**: Every space-separated token in `targetPinyin` MUST map to exactly ONE corresponding space-separated token in `targetHanzi`.
  - BAD (Misaligned):
    `targetPinyin = "Nǐhǎo  wǒjiào  Bùdí"`
    `targetHanzi  = "你好， 我 叫 布迪 。"` (FAIL: `wǒjiào` is 1 token, but `我 叫` is 2 tokens! Leads to broken visual alignment!)
  - GOOD (1-to-1 Token Symmetry):
    `targetPinyin = "Nǐhǎo ， wǒ jiào Bùdí 。"`
    `targetHanzi  = "你好 ， 我 叫 布迪 。"`
    *(or if compound word is joined in Hanzi, join it in Pinyin as well: `wǒjiào` with `我叫`)*.
- **Verification Formula**:
  `targetPinyin.trim().split("\\s+").size == targetHanzi.trim().split("\\s+").size`

---

## 5. UNDERLINE & SLOT CONSISTENCY (NO ORPHAN BLANKS)
- **Rule**: The number of blank slots (`________`) in `sentenceWithBlank` MUST EXACTLY match the number of selections expected from the user.
- **NEVER** leave a second blank empty/orphan! If the original screenshot has two blanks:
  - If the UI only supports selecting 1 answer, combine the phrase into a single slot (e.g. `________`) so no blank is left unresolved.
  - If 2 slots are needed, ensure the exercise type and answer format explicitly handle both slots.

---

## 6. AUTONOMOUS TWO-WAY HAND-OFF PROTOCOL (NO HUMAN WAITING)

### For Developers (Dev 1 / Dev 2) & Designer:
Immediately after completing code generation and committing changes:
```bash
notify-role qa "Role [dev1/dev2/designer] selesai commit [commit-hash] di [branch]. Mohon verifikasi kontrak & build."
```
Do NOT wait for human intervention; trigger QA automatically.

### For QA / Tester:
Upon receiving a notification or checking a branch:
1. **Contract Audit**:
   - Check Hanzi-Pinyin 1-to-1 token symmetry (`targetPinyin` vs `targetHanzi`).
   - Check blank slot count vs expected answers.
   - Check ID naming convention (`u{unit}_p{part}_q{number}`).
2. **Build Verification**:
   - Run `./gradlew compileDebugKotlin` in `ChineseLearning`.
3. **Decide Action**:
   - **IF PASS**: Cherry-pick/merge the commit into `main`, print completion report.
   - **IF FAIL / CONTRACT VIOLATION**: DO NOT merge to `main`! Automatically return the revision to the author:
     ```bash
     notify-role [dev1|dev2|designer] "QA REJECT: [Detail spesifik baris/file dan alasan kegagalan]. Tolong perbaiki dan commit ulang."
     ```
