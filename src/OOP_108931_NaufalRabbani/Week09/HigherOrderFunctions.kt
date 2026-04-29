package OOP_108931_NaufalRabbani.Week09

fun main(){
    val number = listOf(1,2,3,4,5,6,7,8)
    println("Data ori : $number")
    println("no FIltter")

    val even = number.filter { it % 2 == 0 }
    println("Even: ${even}")

    println("HOF:MAP")
    val multiplied = even.map { it * 10 }
    val asString = multiplied.map { "Rp. ${it}K" }
    println("Multiplied: $multiplied")
    println("As String: $asString")
}