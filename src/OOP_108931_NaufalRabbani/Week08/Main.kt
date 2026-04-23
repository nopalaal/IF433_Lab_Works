package OOP_108931_NaufalRabbani.Week08

fun main(){
    println("=== TEST SAFE CALL & ELVIS ===")
    val EmptyOrder = Order(null,null)

    val destination = EmptyOrder.deliveryDetails?.address?.city?.name ?: "kota tidak diketahui"

    println("Tujuan pengiriman: $destination")

    val validOrder = Order(null, 250000)
    val receipt = validOrder.totalPrice?.let { price -> val tax = price * 0.11
        "transaksi valid. harga : Rp$price, pajak: Rp$tax, total: Rp${price + tax}" } ?: "transaksi tidak valid"

    println(receipt)

    val mixedData: List<Any> = listOf(
        "Smartphone",
        1500000,
        UserProfile("andi",null),
        "laptop",
        3500000.0,
    )

    for (item in mixedData){
        val text = item as String?

        text?.let {
            println("Ditemukan Teks: ${it.uppercase()}}")
        }

        val someObject: Any = 100

        val safeString = someObject as? String ?: "Bukan sebuah string"
        println(safeString)


    }
}