package OOP_108931_NaufalRabbani.Week14
import java.io.File

class BadOrderProcessor{

    private val file = File("orders.csv")

    fun processOrder(itemName: String, basePrice: Double, customerType: String){

        val finalPrice = when (customerType) {
            "REGULAR" -> basePrice
            "VIP" -> basePrice * 0.90
            else -> basePrice
        }

        println("memproses pesanan $itemName seharga $finalPrice")

        file.appendText("$itemName - $finalPrice - $customerType")

        println("Email Terkirim: Pesanan $itemName anda telah dikonfirmasi")

    }
}
