package OOP_108931_NaufalRabbani.Week12

fun main(){
    println("TES RUNCACHING")
    val result: Result<Int> = runCatching { "42X".toInt() }
}