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
  - ❌ **BAD (Misaligned Case 1):**
    `targetPinyin = "Nǐhǎo  wǒjiào  Bùdí"`
    `targetHanzi  = "你好， 我 叫 布迪 。"` (FAIL: `wǒjiào` is 1 token, but `我 叫` is 2 tokens! Leads to broken visual alignment!)
  - ❌ **BAD (Misaligned Case 2 - Clumped Hanzi):**
    `targetPinyin = "Nà shì nǐ de lǎobǎn ma"` (6 tokens)
    `targetHanzi  = "那是你的 老板 吗？"` (3 tokens: `那是你的`, `老板`, `吗？` -> FAIL! Visual text stretches out horribly!)
  - ✅ **GOOD (1-to-1 Token Symmetry):**
    `targetPinyin = "Nà shì nǐ de lǎobǎn ma ？"`
    `targetHanzi  = "那 是 你 的 老板 吗 ？"`
    *(or if grouped into words: `Nàshì nǐde lǎobǎn ma ？` vs `那是 你的 老板 吗 ？`)*
- **Verification Formula**:
  `targetPinyin.trim().split("\\s+").size == targetHanzi.trim().split("\\s+").size`

---

## 5. UNDERLINE & SLOT CONSISTENCY (NO ORPHAN BLANKS)
- **Rule**: The number of blank slots (`________`) in `sentenceWithBlank` MUST EXACTLY match the number of selections expected from the user.
- **NEVER** leave a second blank empty/orphan! If the original screenshot has two blanks:
  - If the UI only supports selecting 1 answer, combine the phrase into a single slot (e.g. `________`) so no blank is left unresolved.
  - If 2 slots are needed, ensure the exercise type and answer format explicitly handle both slots.

---

## 6. ILLUSTRATION UNIQUENESS & SEMANTIC ACCURACY (NO DUPLICATES / NO LAZY REUSE)
**CRITICAL**: In `ExerciseType.PICTURE_CHOICE`, all 4 options MUST have distinct, non-duplicate illustration drawables (`iconRes`).
- **Rule 1 (Zero Duplicates)**: No two options in the same exercise may share the same `iconRes`.
  - ❌ **BAD**: "bos" and "guru" both using `R.drawable.ic_teacher`, or "rekan kerja" and "teman sekolah" both using `R.drawable.ic_classmates`.
  - ✅ **GOOD**: 
    - "bos": `R.drawable.ic_boss` (gambar eksekutif / kantor)
    - "guru": `R.drawable.ic_teacher` (gambar guru / papan tulis)
    - "rekan kerja, kolega": `R.drawable.ic_colleagues` (gambar rekan kerja dewasa di kantor)
    - "teman sekolah": `R.drawable.ic_classmates` (gambar murid sekolah berseragam)
- **Rule 2 (Semantic Matching)**: The illustration MUST accurately represent the meaning of the Indonesian label (e.g. "rekan kerja" MUST NOT be depicted as elementary school children in uniform).

---

## 7. AUTONOMOUS TWO-WAY HAND-OFF PROTOCOL (NO HUMAN WAITING)

### For Developers (Dev 1 / Dev 2) & Designer:
Immediately after completing code generation and committing changes:
```bash
notify-role qa "Role [dev1/dev2/designer] selesai commit [commit-hash] di [branch]. Mohon verifikasi kontrak & build."
```
Do NOT wait for human intervention; trigger QA automatically.

### For QA / Tester:
Upon receiving a notification or checking a branch:
1. **Contract Audit**:
   - Check Hanzi-Pinyin 1-to-1 token symmetry:
     `targetPinyin.split("\\s+").size == targetHanzi.split("\\s+").size`
   - Check blank slot count vs expected answers (no orphan blanks).
   - Check illustration uniqueness: No duplicate `iconRes` across options in `PICTURE_CHOICE`.
   - Check ID naming convention (`u{unit}_p{part}_q{number}`).
2. **Build Verification**:
   - Run `./gradlew compileDebugKotlin` in `ChineseLearning`.
3. **Decide Action**:
   - **IF PASS**: Cherry-pick/merge the commit into `main`, print completion report.
   - **IF CODE / CONTRACT VIOLATION (Code error, Token Mismatch, Orphan Blank)**:
     DO NOT merge to `main`! Return revision to Developer:
     ```bash
     notify-role [dev1|dev2] "QA REJECT (CODE/CONTRACT): [Detail spesifik baris/file dan alasan]. Tolong perbaiki dan commit ulang."
     ```
   - **IF ASSET VIOLATION (Duplicate illustration, placeholder reuse, semantic mismatch)**:
     DO NOT merge to `main`! Delegate asset creation to Designer:
     ```bash
     notify-role designer "QA REJECT (ASSET): Exercise [id] memiliki gambar duplikat/tidak sesuai untuk opsi: [daftar opsi]. Tolong buatkan VectorDrawable unik di res/drawable dan commit."
     ```
