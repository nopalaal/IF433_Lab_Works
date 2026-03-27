package OOP_108931_NaufalRabbani.Week07

object DatabaseManager{
    var connectionStatus: String = "Disconnected"

    fun connect(){
        connectionStatus = "Connected"
        println("Database is ready")
    }
}