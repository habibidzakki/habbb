# 📘 Student Average Program (Refactored)

## 🧩 Deskripsi
Program **StudentAverageAfter** digunakan untuk menghitung **rata-rata nilai siswa** berdasarkan input dari pengguna.  
Program ini telah melalui proses **refactoring** agar lebih **modular, terstruktur, dan mudah dipelihara**.

---

## ✨ Fitur Utama
1. **Input jumlah siswa** dengan validasi agar tidak bernilai nol atau negatif.
2. **Input nilai setiap siswa** menggunakan objek `Student`.
3. **Perhitungan rata-rata nilai** secara otomatis.
4. **Tampilan hasil yang rapi** di konsol.

---

## 🧱 Struktur Program

| Komponen | Deskripsi |
|-----------|------------|
| `Student` | Kelas yang merepresentasikan entitas siswa dengan atribut `grade`. |
| `getValidStudentCount()` | Memvalidasi input jumlah siswa agar lebih dari 0. |
| `inputStudents()` | Menginput nilai siswa dan menyimpan dalam array `Student[]`. |
| `calculateAverage()` | Menghitung rata-rata nilai dari seluruh siswa. |
| `displayAverage()` | Menampilkan hasil rata-rata dengan format rapi di terminal. |

---

## 🚀 Cara Menjalankan Program

### 1. Kompilasi Program
```bash
javac Tugas3/StudentAverageAfter.java
