package OOP_108931_NaufalRabbani.week02

import java.util.Scanner

fun main(){
    val scanner = Scanner(System.`in`)

    print("--- APLIKASI PMB UMN--- \n")

    print("Masukkan nama anda: ")
    val name = scanner.nextLine()

    print("Masukkan NIM anda (wajib 5 karakter): ")
    val nim = scanner.next()

    scanner.nextLine()

    if(nim.length != 5){
        println("ERROR: NIM harus terdiri dari 5 karakter!")
        return
    } else{
        print("Masukkan jurusan anda: ")
        val major = scanner.nextLine()

        val s1 = Student(name, nim, major)

        println("Status: Pendaftaran Berhasil")
    }

    print("Pilih Jalur(1. Reguler, 2. Umum): ")
    val type = scanner.nextInt()
    scanner.nextLine()

    if(type == 1){
        println("Masukkan Jurusan : ")
        val major = scanner.nextLine()
        val s1 = Student(name, nim, major)
        println("Terdaftar di : {${s1.major} dengan GPA awal {${s1.gpa}}")
    }else if( type == 2){
        val s2 = Student(name, nim)
        println("Terdaftar di : ${s2.major} dengan GPA awal ${s2.gpa}")
    }else{
        print("Aneh, pendaftarannya tidak valid")

    }
}
