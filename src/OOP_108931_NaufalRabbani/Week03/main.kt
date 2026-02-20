package OOP_108931_NaufalRabbani.Week03

fun main(){
    val e = Employee("Asep")
    println("test error")
    e.salary = -1000
    e.salary = 5000
    println("gaji: ${e.salary}")

    e.increasePerfomance()

    println("pajak: ${e.tax}")
}