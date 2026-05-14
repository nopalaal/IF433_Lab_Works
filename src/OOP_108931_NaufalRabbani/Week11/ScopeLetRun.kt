package OOP_108931_NaufalRabbani.Week11

fun main(){
    println(" TEST LET FUNCTION")

    val name: String? = "alexander"

    val length = name?.let {
        println("Nama: $it terdekteksi")
        it.length
    }
    println("Panjang nama: $length")

    println("TEST RUN FUNCTION")

    val result = "kotlin".run {
        println("String: $this")
        this.length * 2
    }

    println("hasil kalkulasi run: $result")
}