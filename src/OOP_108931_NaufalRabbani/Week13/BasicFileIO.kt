package OOP_108931_NaufalRabbani.Week13
import java.io.File

fun main(){
    println("TEST WRITE TEXT")
    val file = File("notes.txt")
    file.writeText("Line 1:  Inisiasi Sistem. \n")
    println("File berhasil dibuat")
}