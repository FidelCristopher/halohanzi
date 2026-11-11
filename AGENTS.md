# Project Guidelines & Verification Policy (ChineseLearning)

## Smart Verification & Git Commit Standards
To maintain rapid development while preventing regressions, strictly follow this tiered verification matrix before committing changes:

### Tier 1: Data, Strings & Content Changes
* **Scope**: Renaming stages, updating lesson titles, adding/modifying vocabulary, grammar notes, static data lists, or color hex values.
* **Verification Rule**: 
  - Run `git diff` to inspect changes and ensure correct Kotlin syntax.
  - **DO NOT** run `gradlew assembleDebug`.
  - **DO NOT** launch ADB emulator or capture `.png` screenshots.
  - Stage and commit immediately using Conventional Commits. (Total target time: < 5 seconds).

### Tier 2: Logic, ViewModel & State Changes
* **Scope**: Modifications to ViewModels, StateFlow, Room DB, repository algorithms, or quiz evaluation logic.
* **Verification Rule**:
  - Run fast compile check (`./gradlew compileDebugKotlin` via `cmd.exe`) or local unit tests.
  - **DO NOT** launch emulator or take visual screenshots unless UI behaviour needs inspection.
  - Commit once compilation passes.

### Tier 3: Complex UI Layouts & Visual Reworks
* **Scope**: Major Composable restructuring, Canvas path drawing, animation timing, or breaking UI redesigns.
* **Verification Rule**:
  - Run `gradlew assembleDebug` and install to emulator.
  - Capture screenshot via ADB screencap to verify visual accuracy.
  - Commit after visual confirmation.

## Remote Push Policy
* **STRICT RULE**: The assistant must **ONLY** stage and commit changes locally (`git commit`).
* **NEVER** run `git push` or push to any remote.
* The user will manually handle all `git push` operations via Git Bash.
