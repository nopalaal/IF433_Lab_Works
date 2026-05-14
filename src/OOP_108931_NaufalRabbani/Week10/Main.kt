package OOP_108931_NaufalRabbani.Week10

fun main(){
    println("TEST GENERIC CLASS")
    val intBox = Box(100)
    val stringBox = Box("Generic in kotlin")

    println("isi int : ${intBox.value}")
    println("isi string : ${stringBox.value}")

    println("\nTEST MULTIPLE TYPE PARAMETERS")
    val itemPrice = PairBox("Bitcoin", 50000)
    println("Item: ${itemPrice.key}, Price: ${itemPrice.value}")
}