package id.infinitelearning.KotlinSubmission.exercise4

fun main() {
    try {
        // Misalnya, kita akan mencoba mengonversi input pengguna ke dalam bilangan bulat
        print("Masukkan sebuah bilangan bulat: ")
        val userInput = readLine()
        val number = userInput?.toInt()

        // Jika konversi berhasil, cetak hasilnya
        if (number != null) {
            println("Bilangan yang dimasukkan: $number")
        } else {
            throw NumberFormatException("Input tidak valid")
        }

    } catch (e: NumberFormatException) {
        // Tangani kesalahan jika terjadi
        println("Terjadi kesalahan: ${e.message}")
    }
}
    /**
     * Buatlah contoh code penggunaan try catch untuk menangani suatu kasus sesuai keinginan teman-teman
     *
     */
    // Buat di bawah sini
