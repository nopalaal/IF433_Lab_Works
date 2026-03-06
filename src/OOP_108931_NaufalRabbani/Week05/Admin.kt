package OOP_108931_NaufalRabbani.Week05

class Admin(name: String) : Pegawai(name){
    override fun bekerja() {
        println("$name sedang bekerja sebagai admin")
    }

    fun doAdminWork(){
        println("$name sedang merekap data absensi mahasiswa")