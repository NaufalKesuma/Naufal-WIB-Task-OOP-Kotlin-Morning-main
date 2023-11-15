package id.infinitelearning.KotlinSubmission.exercise1

/**
Latihan 1
Lengkapi fungsi myProfile di bawah ini dengan membuat variabel dengan ketentuan dibawah ini:
- Variable bertipe data string yang menyimpan nilai nama depan Anda.
- Variable bertipe data string yang menyimpan nilai nama belakang Anda.
- Variable bertipe data number yang menyimpan nilai umur Anda.
- Variable bertipe data boolean yang menyimpan nilai status Anda (single atau tidak)
Dan Cetak setiap variabel ke layar saat variable myProfile di panggil
 */
fun myProfile() {
    val firstName: String = "Naufal"

    val lastName: String = "Kesuma"

    val age: Int = 21

    val Relationship: Boolean = false

    println("Nama Depan: $firstName")
    println("Nama Belakang: $lastName")
    println("Umur: $age tahun")
    println("Relationship: $Relationship")
}


/**
 *  Latihan 2
 *  Lengkapi fungsi di bawah ini agar dapat mencetak nilai dari parameter-parameter yang ada dengan fungsi println
 */
fun groupDetail(groupId: String, groupMember: List<Any>, session: String): Any {
    println("Group Id = $groupId")
    println("Group Member = $groupMember")
    println("Session = $session")
    return "Group Detail Print"
}

/**
 * Latihan 3
 * Buat variable yang berisi daftar anggota group kamu,
 * Kemudian akses item yang berisi nama Anda dari variable tersebut, lalu jadikan nilai kembalian untuk fungsi myTeam ini
 *
 */
fun myTeam(): List<Any> {
    val anggotaGroup = listOf("Aisyah","Angga","Bram","Felicia","Fikri","Irfan","Naufal","Raisa","Syahrul","Tria","Zulham")

    val namaSaya = anggotaGroup[6]

    return anggotaGroup
}

/**
 * Latihan 4
 * Lengkapi dan perbaiki isi fungsi totalMember() ini dengan rumus:
 *
 *      total mentor + jumlah anggota group
 *
 */
fun totalMember(): Int {
    val mentor = arrayOf<String>("Reynaldi","Malik")
    val countOfGroup = arrayOf<String>("Aisyah","Angga","Bram","Felicia","Fikri","Irfan","Naufal","Raisa","Syahrul","Tria","Zulham")

    val totalAnggota = mentor.size + countOfGroup.size

    return totalAnggota
}

fun main() {

    myProfile()

    val myTeam = myTeam()
    println("My team is: $myTeam")

    val totalMember = totalMember()
    println("Total Member group : $totalMember")

    /**
     *  Latihan 5
     *  Ubah nilai argumen-argumen dari fungsi groupDetail di bawah ini sesuai dengan data group kamu
     *
     */
    groupDetail("Waktu Indonesia Bahagia", listOf("Aisyah","Angga","Bram","Felicia","Fikri","Irfan","Naufal","Raisa","Syahrul","Tria","Zulham"), "Morning")

}