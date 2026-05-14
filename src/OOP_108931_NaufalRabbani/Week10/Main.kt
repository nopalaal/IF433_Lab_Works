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

    println("\nTEST GENERIC FUNCTION")
    printData(3.14)
    val result = processData("Stable COin")
    println("Hasil Data : $result")

    println("\nTEST CONSTRAINTS")
    val math = MathBox(10.5 , 5.2)
    println("Hasil Penjumalahan : ${math.sum()}")
    println("Terbesar : ${getMax(45,30)}")

}

