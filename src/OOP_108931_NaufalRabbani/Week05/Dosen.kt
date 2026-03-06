package OOP_108931_NaufalRabbani.Week05

class Dosen(name: String, val nidn: String) : Pegawai(name){

    override fun bekerja() {
        println("$name sedang menyiapkan materi dan revisi RPKPS")
    }
    fun mengajar() {
        println("$name sedang mengajar di kelas")
    }
}