package OOP_108931_NaufalRabbani.Week14
import java.io.File

interface OrderRepository {
    fun saveOrder(itemName: String, finalPrice: Double, customerType: String)
}

class CsvOrderRepository(private val filePath: String = "orders.csv") : OrderRepository {
    override fun saveOrder(itemName: String, finalPrice: Double, customerType: String) {
        File(filePath).bufferedWriter().use { writer ->
            writer.appendLine("$itemName - $finalPrice - $customerType")
        }
    }
}


interface NotificationService {
    fun sendNotification(itemName: String)
}

class EmailNotifier : NotificationService {
    override fun sendNotification(itemName: String) {
        println("Email Terkirim: Pesanan $itemName anda telah dikonfirmasi")
    }
}

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
