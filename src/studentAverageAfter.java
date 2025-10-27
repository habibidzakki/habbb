

import java.util.Scanner;

/**
 * Program {@code StudentAverageAfter} digunakan untuk menghitung rata-rata nilai siswa
 * dengan menerapkan prinsip refactoring agar kode lebih modular, mudah dibaca, dan terstruktur.
 *
 * <p>Program ini melibatkan proses:
 * <ul>
 *   <li>Menginput jumlah siswa</li>
 *   <li>Menginput nilai setiap siswa</li>
 *   <li>Menghitung rata-rata nilai</li>
 *   <li>Menampilkan hasil rata-rata dengan format yang rapi</li>
 * </ul>
 *
 * @author
 * Nama Anda
 * @version 1.0
 * @since 2025-10-27
 */
public class studentAverageAfter {

    /**
     * Kelas {@code Student} merepresentasikan entitas siswa dengan atribut nilai (grade).
     */
    static class Student {
        private double grade;

        /**
         * Konstruktor untuk membuat objek {@code Student} dengan nilai tertentu.
         *
         * @param grade nilai siswa dalam bentuk {@code double}
         */
        public Student(double grade) {
            this.grade = grade;
        }

        /**
         * Mengambil nilai (grade) siswa.
         *
         * @return nilai siswa dalam bentuk {@code double}
         */
        public double getGrade() {
            return grade;
        }
    }

    /**
     * Meminta pengguna untuk memasukkan jumlah siswa, dengan validasi agar nilainya lebih dari 0.
     *
     * @param scanner objek {@code Scanner} untuk membaca input dari pengguna
     * @return jumlah siswa yang valid (lebih dari 0)
     */
    private static int getValidStudentCount(Scanner scanner) {
        int count;
        do {
            System.out.print("Masukkan jumlah siswa (harus > 0): ");
            count = scanner.nextInt();
        } while (count <= 0);
        return count;
    }

    /**
     * Meminta pengguna memasukkan nilai untuk setiap siswa dan menyimpannya dalam array.
     *
     * @param jumlahSiswa jumlah siswa yang akan diinputkan
     * @param scanner objek {@code Scanner} untuk membaca input dari pengguna
     * @return array berisi objek {@code Student} yang telah memiliki nilai masing-masing
     */
    private static Student[] inputStudents(int jumlahSiswa, Scanner scanner) {
        Student[] students = new Student[jumlahSiswa];
        for (int i = 0; i < jumlahSiswa; i++) {
            System.out.print("Masukkan nilai siswa ke-" + (i + 1) + ": ");
            double grade = scanner.nextDouble();
            students[i] = new Student(grade);
        }
        return students;
    }

    /**
     * Menghitung rata-rata nilai seluruh siswa.
     *
     * @param students array berisi objek {@code Student}
     * @return nilai rata-rata dari seluruh siswa
     */
    private static double calculateAverage(Student[] students) {
        double total = 0;
        for (Student s : students) {
            total += s.getGrade();
        }
        return total / students.length;
    }

    /**
     * Menampilkan hasil rata-rata nilai siswa dengan format rapi.
     *
     * @param average nilai rata-rata yang telah dihitung
     */
    private static void displayAverage(double average) {
        System.out.println("===============================");
        System.out.printf("Rata-rata nilai siswa: %.2f%n", average);
        System.out.println("===============================");
    }

    /**
     * Method utama yang menjadi titik masuk program.
     *
     * @param args argumen baris perintah (tidak digunakan dalam program ini)
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int studentCount = getValidStudentCount(scanner);
        Student[] students = inputStudents(studentCount, scanner);
        double average = calculateAverage(students);
        displayAverage(average);
        scanner.close();
    }
}
