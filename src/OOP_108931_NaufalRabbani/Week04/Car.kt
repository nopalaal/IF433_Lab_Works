package OOP_108931_NaufalRabbani.Week04

open class Car(brand: String, val numberOfDoors: Int) : vehicle(brand) {
    fun openTrunk(){
        println("Bagasi mobil $brand dengan $numberOfDoors pintu terbuka")
    }

    override fun honk() {
        println("TIN TIN! Mobil $brand lewat!")
    }
}