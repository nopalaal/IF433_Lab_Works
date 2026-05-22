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

    println("TEST SAFE RESOURCES HAnDLING")

    val safeFile = File("safe_log.txt")

    safeFile.printWriter().use {
        out -> for(i in 1..100){
            out.println("safe log Entry #$i : System Status OK")
    }
    }
    println("100 Baris Log Berhasil digenerate dengan sangat aman")
}