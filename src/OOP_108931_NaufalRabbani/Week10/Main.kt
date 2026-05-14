package OOP_108931_NaufalRabbani.Week10

fun main(){
    println("TEST GENERIC CLASS")
    val intBox = Box(100)
    val stringBox = Box("Generic in kotlin")

    println("isi int : ${intBox.value}")
    println("isi string : ${stringBox.value}")
}