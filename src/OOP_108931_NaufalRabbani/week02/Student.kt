package OOP_108931_NaufalRabbani.week02

class Student(
    val name: String,
    val nim: String,
    val major: String,
    val gpa: Double = 0.0
){
    init {
        if(nim.length !=5){
            println("WARNING: Objek tercipta dengan NIM ($nim) yang tidak valid!")
            println("Data mahasiswa $name mungkin bermasalah di sistem")
        }
        else{
            println("LOG : Objek Student $name berhasil dialokasikan ke memory")
        }
    }
    constructor(name: String, nim: String): this(name, nim, major="Non-Matriculated"){
        println("LOG: Secondary constructor dipanggil")
    }
}
