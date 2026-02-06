package OOP_108931_NaufalRabbani.week01

fun calculateStatus(score: Int) = if (score > 75) "Lulus" else "Tidak Lulus"

fun main(){
    val name = "Nopal"
    val score = 80

        println("nama $name dan nilainya $score")

    val grade = when(score){
        in 90..100 -> "A"
        in 80..89 -> "B"
        in 70..79 -> "C"
        else -> "D"
    }
    println("Grade Anda adalah $grade")
    println("anda dinyatakan ${calculateStatus(score)}")
}