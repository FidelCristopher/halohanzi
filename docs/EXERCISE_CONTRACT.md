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

## 5. UNDERLINE & SLOT CONSISTENCY (NO ORPHAN BLANKS & NO STRIKE-THROUGH UNDERLINES)
- **Rule 1 (No Orphan Blanks)**: The number of blank slots (`________`) in `sentenceWithBlank` MUST EXACTLY match the number of selections expected from the user.
- **Rule 2 (Underline Parking)**: Underlines in `SENTENCE_BUILDER` and full-sentence drop zones MUST ALWAYS be positioned directly and solely beneath each chip (using per-chip/per-slot underline layout). Underlines must NEVER be rendered as fixed background lines that slice through the middle of chips.
- **Rule 3 (Dynamic Slot Rendering - 5+ Words)**: In `SENTENCE_BUILDER`, slot rendering MUST dynamically loop through all expected slots (`0 until expectedSlots`). NEVER hardcode a maximum of 4 slots; exercises with 5, 6, or 7+ words (e.g. `u2_s5_p2_q5`, `u2_s5_p2_q2`) must render all slots seamlessly without truncation.
- **Rule 4 (Mid-Sentence Fixed Words)**: Fixed words that appear in the middle of a sentence (e.g. `们` in `我们是邻居`, `你的` in `我是你的老板`, `我们的` in `那是我们的邻居`) MUST be positioned as mid-sentence fixed elements between slots. NEVER displace mid-sentence words into `staticTrailingText` or `staticLeadingText` inappropriately.

---

## 6. PINYIN KEYBOARD GENERIC ARCHITECTURE (ZERO BLANK SCREENS)
- **Rule**: Every `ExerciseType.PINYIN_KEYBOARD` exercise MUST use a generic modular layout fallback. It MUST dynamically render:
  1. Target translation at the top (if present).
  2. Audio speaker button (if `audioToSpeak` is present).
  3. Interactive sentence where the missing word token is replaced by the interactive typing slot with animated cursor, while all other words display their Pinyin centered above Hanzi.
  4. On-screen Pinyin keyboard at the bottom.
- **NEVER** use hardcoded `if (exercise.id == ...)` without a universal `else` fallback that renders the prompt for new exercises.

---

## 7. MATCH PAIRS CONCISENESS & SCALING
- **Rule 1 (Concise Definitions)**: Indonesian translation labels in `matchPairs` MUST be concise (e.g. `们` -> `"akhiran jamak (orang)"`, NOT lengthy multi-line dictionary paragraphs).
- **Rule 2 (Responsive Auto-Scaling)**: Card text must dynamically scale font size (`12sp` - `17sp`) and adjust line height based on character length so no text is ever clipped.

---

## 8. ILLUSTRATION UNIQUENESS & SEMANTIC ACCURACY (NO DUPLICATES / NO LAZY REUSE)
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

## 9. AUTONOMOUS TWO-WAY HAND-OFF PROTOCOL (NO HUMAN WAITING)

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

---

## 10. MANDAT LATAR PUTIH BERSIH UNTUK SOAL LISTENING (ZERO BACKGROUND ILLUSTRATION & ZERO SILHOUETTES ON LISTENING EXERCISES)
**CRITICAL**: Seluruh soal latihan mendengar (*listening*) dengan judul `"Apa yang Anda dengar?"` (atau varian listening sentence builder):
- **Rule 1 (Zero Background Illustration)**: `illustrationRes` **WAJIB bernilai `0`** (tidak boleh menggunakan gambar ilustrasi latar belakang seperti gambar foto/ilustrasi adegan). Seluruh soal mendengar harus murni menguji kemampuan pendengaran siswa tanpa bantuan/distraksi visual gambar adegan.
- **Rule 2 (Zero Silhouettes & Pure White Canvas)**: Kontainer kartu latihan listening (`ImmersiveSentenceBuilder`) **WAJIB menggunakan latar belakang putih murni bersih (`Color.White`)** dengan border halus (`Color(0xFFF1F5F9)`). **DILARANG** menampilkan bayangan/siluet orang (`ic_person_murid` alpha) maupun gradien abu-abu gelap yang mengotori area baca kata.
- **Rule 3 (Auditory Focus & High Legibility)**: Area kartu harus bersih agar fokus siswa terpusat pada tombol pemutar audio (`ttsManager`), slot garis bawah (*underline slots*), dan deretan chip Hanzi-Pinyin tanpa distraksi elemen visual latar belakang.
- **Rule 4 (Automated Audit Rule)**: Setiap unit test verifikasi kurikulum (`ExampleUnitTest.kt`) wajib mengaudit bahwa tidak ada satu pun soal dengan `title == "Apa yang Anda dengar?"` yang memiliki `illustrationRes != 0`.
