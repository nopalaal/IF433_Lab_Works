package OOP_108931_NaufalRabbani.Week08

fun main(){
    println("=== TEST SAFE CALL & ELVIS ===")
    val EmptyOrder = Order(null,null)

    val destination = EmptyOrder.deliveryDetails?.address?.city?.name ?: "kota tidak diketahui"

    println("Tujuan pengiriman: $destination")
}