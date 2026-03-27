package OOP_108931_NaufalRabbani.Week07

class NetworkClient private constructor(val url: String) {
    fun connect() {
        println("Connecting to $url")
    }
}