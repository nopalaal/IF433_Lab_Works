package OOP_108931_NaufalRabbani.week02

import java.util.Scanner

fun main(){
    val scanner = Scanner(System.`in`)

    print("--- APLIKASI PMB UMN---")

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
}