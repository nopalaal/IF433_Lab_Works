package OOP_108931_NaufalRabbani.Week07

fun main() {
    println("=== TEST SINGLETON ===")
    println("Status ${DatabaseManager.connectionStatus}")
//    val client = NetworkClient("https://api.umn.ac.id")
    DatabaseManager.connect()

    println("\n=== TEST COMPANION OBJECT ===")
    val client = NetworkClient.createClient()
    client.connect()

    println("\n === TEST REGULAR CLASS === ")
    val reg1 = RegularUser("Budi",21)
    val reg2 = RegularUser("Siti",25)
    println(reg1)
    println("sama? ${reg1 == reg2}")
}