package OOP_108931_NaufalRabbani.Week05

fun main(){
    val dosen1 = Dosen("Pa Budi", "122411")
    val admin1 = Admin("Bu Siti")

    val daftarPegawai: List<Pegawai> = listOf(dosen1, admin1)

    println("=== AKTIVITAS PEGAWAI ===")
    for (pegawai in daftarPegawai){
        pegawai.bekerja()

        when(pegawai){
            is Dosen -> {
                println("Dosen ${pegawai.name} dengan NIDN ${pegawai.nidn} sedang mengajar.")
                pegawai.mengajar()
            }
            is Admin -> {
                println("Admin ${pegawai.name} sedang mengelola administrasi.")
                pegawai.doAdminWork()
            }
        }
        println("-----------------------------")
    }
}