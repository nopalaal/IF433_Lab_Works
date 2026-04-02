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
    val reg2 = RegularUser("Budi",21)
    println(reg1)
    println("sama? ${reg1 == reg2}")

    println("\n === TEST DATA CLASS === ")
    val data1 = DataUser("asep",21)
    val data2 = DataUser("asep",21)
    println(reg1)
    println("sama? ${data1 == data2}")
    val data3 = data1.copy(age = 23)
    println("Hasil Copy: $data3")

    val (userName, userAge) = data1
    println("Destructuring: name=$userName, age=$userAge")

    println("\n=== TEST SEALED CLASS ===")
    val response: ApiResponse = ApiResponse.Success("Data berhasil diambil")

    val uimessage = when(response){
        is ApiResponse.Success -> "Tampil: ${response.data}"
        is ApiResponse.Error -> "Munculkan alert: ${response.message}"
        is ApiResponse.Loading -> "Tampilkan Spinner"
    }
}