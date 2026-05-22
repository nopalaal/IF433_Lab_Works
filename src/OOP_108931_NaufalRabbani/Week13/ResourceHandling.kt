package OOP_108931_NaufalRabbani.Week13
import java.io.File

fun main(){
    println("TEST UNSAFE RESOURCES HAnDLING")
    val unsafeFile = File("unsafe_log.txt")

    val writer = unsafeFile.printWriter()

    writer.println("log 1: Membuka koneksi database")
    writer.println("log 2: Menulis data user")

    writer.close()
    println("Proses penulisan unsafe selesai")


}