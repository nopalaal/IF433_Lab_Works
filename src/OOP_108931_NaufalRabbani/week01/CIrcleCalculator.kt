package OOP_108931_NaufalRabbani.week01

fun main(args: Array<String>) {
// Variable definition
    val radius = 7.0
    val pi = 3.14
// Calculation
    val area: Double = pi * radius * radius

// Output Concatenation
println("Radius: $radius Area: $area")
// Logic check
println(checkSize(area))

}
fun checkSize(area: Double) = if (area > 100) "Large Circle" else "Small Circle"