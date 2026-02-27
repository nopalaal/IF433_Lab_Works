package OOP_108931_NaufalRabbani.Week04

fun main() {
    println("--- Testing Vehicle ---")
    val generalVehicle = vehicle("mobil roda 3")
    generalVehicle.accelerate()
    generalVehicle.honk()

    println("\n--- Testing Car ---")
    val myCar = Car("Toyota", 4)
    myCar.accelerate()
    myCar.honk()
    myCar.openTrunk()
}