# Style Guide & Pipeline: Ilustrasi Kartun 2D HaloHanzi (`art_*`)

Panduan standar artistik resmi untuk transformasi kartu soal pilihan bergambar (`PictureOption`) HaloHanzi dari flat vector sederhana menjadi **Ilustrasi Kartun 2D Hidup, Ceria & Ekspresif** bergaya HelloChinese & Duolingo.

---

## 1. Filosofi & Visi Artistik
* **Personality-Driven**: Karakter tidak lagi berupa siluet geometris pasif, melainkan memiliki kepribadian nyata, ekspresi wajah ceria, pandangan mata hangat (*welcoming gaze*), dan gestur tubuh interaktif.
* **Vibe HelloChinese / Duolingo**: Gaya kartun modern dengan proporsi semi-chibi (kepala sedikit lebih besar untuk menonjolkan ekspresi wajah), garis kontur bersih (*clean lineart*), dan bayangan cel-shaded lembut.
* **Anti-Slop Restraint**: Menghindari gradien metalik palsu, tekstur acak, atau anatomi terdistorsi buatan AI. Semua ilustrasi mempertahankan konsistensi palet warna triad pastel HaloHanzi (kuning hangat, biru langit, merah muda koral).

---

## 2. Spesifikasi Teknis Asset Pipeline
| Parameter | Standar Produksi | Keterangan |
| :--- | :--- | :--- |
| **Naming Prefix** | `art_<category>_<name>.webp` | Contoh: `art_fam_grandfather.webp` |
| **Lokasi Direktori** | `app/src/main/res/drawable/` | Universal density scaling |
| **Format File** | WebP (Lossless / 90% High Quality) | Kompresi tinggi, APK ringan, tanpa artefak |
| **Resolusi Kanvas** | 512 x 512 px (Rasio 1:1) | Ideal untuk kartu soal bergambar Compose |
| **Latar Belakang** | Transparan (*Alpha Channel*) | Melebur sempurna dengan kartu tema aplikasi |
| **Safe Padding** | Margin 10% (32px dari tepi kanvas) | Menjamin ilustrasi tidak pernah terpotong |

---

## 3. Desain Karakter & Arketipe Utama

### A. Keluarga (Family Archetypes)
1. **Kakek (`art_fam_grandfather.webp` / 爷爷)**:
   * **Ekspresi**: Wajah tersenyum ramah dan bijak, kerutan senyum halus di sudut mata, kacamata berbingkai bulat klasik.
   * **Rambut**: Rambut perak/abu-abu berwibawa dengan sedikit botak atas atau sisir samping rapi, kumis putih tertata rapi.
   * **Pakaian**: Rompi rajut hangat cokelat atau kardigan biru tua dengan kemeja kerah putih di dalamnya.
   * **Gestur**: Tangan bersedekap santai atau memberi salam ramah.

2. **Nenek (`art_fam_grandmother.webp` / 奶奶)**:
   * **Ekspresi**: Senyuman hangat penuh kasih sayang, pipi merona lembut, mata berbinar ramah.
   * **Rambut**: Sanggul klasik perak (*hair bun*) berhiaskan tusuk konde emas/mutiara.
   * **Pakaian**: Blus ungu lavender lembut berpadu syal koral merah muda melingkar di leher.
   * **Gestur**: Memegang cangkir teh porselen atau melambaikan tangan lembut.

3. **Anak Laki-Laki (`art_child_boy.webp` / 男孩儿)**:
   * **Ekspresi**: Ceria, enerjik, mata bulat besar penasaran, seringai tawa gigi kelinci.
   * **Rambut**: Rambut hitam sedikit berantakan (*playful cowlick*).
   * **Pakaian**: Kaos katun kasual biru langit bergaris kuning cerah, celana pendek denim.
   * **Gestur**: Mengacungkan jempol atau melompat gembira.

4. **Anak Perempuan (`art_child_girl.webp` / 女孩儿)**:
   * **Ekspresi**: Manis, cerdas, pipi merah merona, senyum riang merekah.
   * **Rambut**: Kuncir dua (*twin pigtails*) dengan pita rambut merah koral.
   * **Pakaian**: Gaun pinafore merah koral dengan kerah putih Peter Pan.
   * **Gestur**: Melambaikan tangan gembira menyapa pengguna.

---

### B. Profesi & Tokoh Keseharian (Professions)
1. **Guru (`art_person_guru.webp` / 老师)**:
   * Kacamata modis, kemeja rapi membawa papan jepit (*clipboard*) atau buku Hanzi, tangan menunjuk ramah menjelaskan materi.
2. **Murid / Mahasiswa (`art_person_murid.webp` / 学生)**:
   * Mengenakan ransel sekolah, seragam kasual rapi, memegang buku catatan, ekspresi antusias belajar.
3. **Dokter (`art_person_dokter.webp` / 医生)**:
   * Jas lab putih bersih, stetoskop di leher, memberi acungan jempol meyakinkan yang menenangkan pasien.

---

## 4. Rencana Penerapan Bertahap (Roadmap)

* **Fase 1 (Karakter Keluarga & Manusia)**:
  * Prioritas utama mengganti kartu `PictureOption` karakter pada Bab 17 (Keluarga Besar) dan Bab 6-7:
    * `art_fam_grandfather.webp` (Kakek)
    * `art_fam_grandmother.webp` (Nenek)
    * `art_child_boy.webp` (Anak laki-laki)
    * `art_child_girl.webp` (Anak perempuan)
* **Fase 2 (Profesi & Sosok Interaktif)**:
  * Bab 11, Bab 12, dan Bab 24: Guru, Murid, Dokter, Rekan Kerja, Bos.
* **Fase 3 (Tindakan & Makanan Ikonik)**:
  * Makanan lezat (Baozi, Jiaozi, Mi, Teh, Daging, Ikan) dan Aksi (Membaca, Menulis, Berlari, Berenang).

---

## 5. Kompatibilitas Kode Android (Compose)
Di dalam kode `PictureOption`, pemanggilan aset format WebP identik dengan drawable XML:
```kotlin
PictureOption(
    id = "u17_s1_p1_opt1",
    label = "kakek",
    emoji = "",
    iconRes = R.drawable.art_fam_grandfather,
    isCorrect = true
)
```
Compose `AsyncImage` maupun `painterResource(opt.iconRes)` secara otomatis menangani render WebP dengan akselerasi hardware GPU tanpa perubahan logika sistem.
