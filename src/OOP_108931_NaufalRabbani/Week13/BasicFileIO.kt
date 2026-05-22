package OOP_108931_NaufalRabbani.Week13
import java.io.File

fun main(){
    println("TEST WRITE TEXT")
    val file = File("notes.txt")
    file.writeText("Line 1:  Inisiasi Sistem. \n")
    println("File berhasil dibuat")

    file.appendText("Lines 2: Menambahkan konfigurasi baru. \n")
    println("teks berhasil di append")


    println("TEST READ FILE")
    val fullcontent = file.readText()
        println("membaca sekaligus: ${fullcontent}")

    println("TEST READ LINES")
    val lines = file.readLines()
    lines.forEachIndexed { index, line ->   println("$index: $line")}

}