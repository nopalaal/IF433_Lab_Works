package OOP_108931_NaufalRabbani.Wee06

class smartphone : camera, phone{
    override fun turnOn() {
        super<camera>.turnOn()
        super<phone>.turnOn()
        println("sistem operasi smartphone berhasil di booting")
    }
}