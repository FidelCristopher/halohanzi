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

## 4. STRICT HANZI & PINYIN ALIGNMENT (TOKEN-TO-TOKEN SYMMETRY FOR PROMPTS & OPTIONS)
**CRITICAL**: Hanzi characters and Pinyin tokens MUST align 1-to-1 in token count and spacing across BOTH question prompts AND multiple-choice option cards (`options` containing `\n`).

### 4.1. Question Prompts (`targetHanzi` & `targetPinyin`)
- **Rule**: Every space-separated token in `targetPinyin` MUST map to exactly ONE corresponding space-separated token in `targetHanzi`. Trailing punctuation MUST be bound directly to the word token without space.
  - ❌ **BAD:**
    `targetPinyin = "Nǐhǎo wǒ jiào Bùdí"` (4 tokens)
    `targetHanzi  = "你好，我 叫 布迪 。"` (4 tokens, but `你好，我` is clumped and `。` is an orphan!)
  - ✅ **GOOD:**
    `targetPinyin = "Nǐhǎo wǒ jiào Bùdí"` (4 tokens)
    `targetHanzi  = "你好， 我 叫 布迪。"` (4 tokens: `你好，`, `我`, `叫`, `布迪。`)

### 4.2. Multiple-Choice Option Cards (`options = listOf("pinyin\nhanzi", ...)`)
- **Rule**: In `options` containing a pinyin line and a hanzi line (`"pinyin\nhanzi"`), the pinyin tokens MUST match the Hanzi tokens 1-to-1 in token count!
  - ❌ **BAD (Artificial Spaces & Mismatched Tokens):**
    `"WángFēi nǐhǎo\n王 飞 ， 你 好 。"` (2 pinyin tokens vs 5 hanzi tokens -> horribly misaligned!)
    `"Wǒ jiào Bùdí\n我 叫 布迪 。"` (3 pinyin tokens vs 4 hanzi tokens -> misaligned!)
  - ✅ **GOOD (1-to-1 Token Symmetry & Bound Punctuation):**
    `"Nǐhǎo Bùdí\n你好， 布迪。"` (2 tokens: `Nǐhǎo` <-> `你好，`, `Bùdí` <-> `布迪。`)
    `"WángFēi nǐhǎo\n王飞， 你好。"` (2 tokens: `WángFēi` <-> `王飞，`, `nǐhǎo` <-> `你好。`)
    `"Wǒ jiào Bùdí\n我 叫 布迪。"` (3 tokens: `Wǒ` <-> `我`, `jiào` <-> `叫`, `Bùdí` <-> `布迪。`)
- **UI Requirement**: The UI in `LessonExerciseScreen.kt` MUST render option cards using `AlignedHanziPinyinText` (Ruby flow layout) so each word token has its pinyin centered directly above its Hanzi. Never render as unaligned plain multi-line `Text`.

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
   - Check Hanzi-Pinyin 1-to-1 token symmetry for BOTH prompts (`targetPinyin` vs `targetHanzi`) and option cards (`options` with `\n`):
     - Prompt: `targetPinyin.split("\\s+").size == targetHanzi.split("\\s+").size`
     - Options: `opt.split("\n")[0].split("\\s+").size == opt.split("\n")[1].split("\\s+").size`
   - Check UI rendering: Ensure both prompts and option cards use `AlignedHanziPinyinText` to guarantee pixel-perfect vertical alignment.
   - Check blank slot count vs expected answers (no orphan blanks).
   - Check illustration uniqueness: No duplicate `iconRes` across options in `PICTURE_CHOICE`.
   - Check ID naming convention (`u{unit}_p{part}_q{number}`).
2. **Build Verification**:
   - Run `./gradlew compileDebugKotlin` in `ChineseLearning`.
3. **Decide Action**:
   - **IF PASS**: Cherry-pick/merge the commit into `main`, print completion report.
   - **IF CODE / CONTRACT / ALIGNMENT VIOLATION (Code error, Token Mismatch, Orphan Blank, Misaligned Option Cards)**:
     DO NOT merge to `main`! Return revision immediately to Dev 1:
     ```bash
     notify-role dev1 "QA REJECT (ALIGNMENT/CONTRACT): Exercise [id] atau opsi pilihan [opt] memiliki ketidaksejajaran Hanzi-Pinyin: [detail]. Tolong perbaiki di UI dan data, lalu commit ulang."
     ```
   - **IF ASSET VIOLATION (Duplicate illustration, placeholder reuse, semantic mismatch)**:
     DO NOT merge to `main`! Delegate asset creation to Designer:
     ```bash
     notify-role designer "QA REJECT (ASSET): Exercise [id] memiliki gambar duplikat/tidak sesuai untuk opsi: [daftar opsi]. Tolong buatkan VectorDrawable unik di res/drawable dan commit."
     ```
