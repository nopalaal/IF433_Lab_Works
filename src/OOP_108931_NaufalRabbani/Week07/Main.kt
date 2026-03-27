package OOP_108931_NaufalRabbani.Week07

fun main() {
    println("=== TEST SINGLETON ===")
    println("Status ${DatabaseManager.connectionStatus}")
//    val client = NetworkClient("https://api.umn.ac.id")
    DatabaseManager.connect()

    println("\n=== TEST COMPANION OBJECT ===")
    val client = NetworkClient.createClient()
    client.connect()
}