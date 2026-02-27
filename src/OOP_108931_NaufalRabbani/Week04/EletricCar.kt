package OOP_108931_NaufalRabbani.Week04

open class EletricCar(brand: String, numberOfDoors: Int, val batteryCapacity: Int) : Car(brand, numberOfDoors) {

    final override fun accelerate() {
        println("$brand berakselerasi dalam sunyi. Kapasitas baterai: $batteryCapacity%.")
    }
}