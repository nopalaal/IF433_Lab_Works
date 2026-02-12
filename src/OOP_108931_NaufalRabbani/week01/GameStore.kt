package OOP_108931_NaufalRabbani.week01

fun main(){
    val gameTitle: String = "roblos"
    val price: Int = 600000

    val finalPrice = calculateDiscount(price)

    val userNote: String? = null

    printReceipt(title = gameTitle, finalPrice = finalPrice)
    println("Catatan pembeli: ${userNote ?: "Tidak ada catatan"}")
}

fun calculateDiscount(price: Int): Int = when{
    price > 500000 -> (price * 0.20).toInt()
    else -> (price * 0.10).toInt()
}

fun printReceipt(title: String?, finalPrice: Int) = println("nama game :$title, harga : $finalPrice")