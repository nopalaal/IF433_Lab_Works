package OOP_108931_NaufalRabbani.Week12

fun devide(a: Int, b: Int): Int {
    try{
        return a/b
    } catch(e: ArithmeticException){
        println("Error: ${e.message}")
        return -1
    } finally {
        println("Division attempt finished")
    }
}