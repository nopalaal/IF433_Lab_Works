package OOP_108931_NaufalRabbani.Week04

open class Car(brand: String, val numberOfDoors: Int) : vehicle(brand) {
    fun openTrunk(){
        println("Bagasi mobil $brand dengan $numberOfDoors pintu terbuka")
    }

    override fun accelerate() {
        super.accelerate()
        println("Mobil $brand menggunakan transmisi gigi untuk menambah kecepatan!")
    }

    override fun honk() {
        println("TIN TIN! Mobil $brand lewat!")
    }
}