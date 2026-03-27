package OOP_108931_NaufalRabbani.Week07

class NetworkClient private constructor(val url: String) {
  companion object {
      const val BASE_URL = "https://api.umn.ac.id"

      fun createClient(): NetworkClient {
          println("membangun NetworkClient dengan URL $BASE_URL")
          return NetworkClient(BASE_URL)
      }
  }
    fun connect() {
        println("Connecting to $url")
    }
}