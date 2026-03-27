package OOP_108931_NaufalRabbani.Week07

object DatabaseManager{
        const val databaseUrl: String = "jdbc:mysql://localhost:3306/mydatabase"

    var connectionStatus: String = "Disconnected"

    fun connect(){
        connectionStatus = "Connected"
        println("Database is ready")
    }
}