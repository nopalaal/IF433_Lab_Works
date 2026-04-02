package OOP_108931_NaufalRabbani.Week07

object GameManager {
    var isGameRunning: Boolean = false

    fun startGame() {
        if(!isGameRunning) {
            isGameRunning = true
            println("Game started!")
        } else {
            println("Game is already running.")
        }
    }
}