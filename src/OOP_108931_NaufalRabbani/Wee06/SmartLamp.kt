package OOP_108931_NaufalRabbani.Wee06

class SmartLamp(override val id: String, override val name: String) : SmartDevice, Switchable {

    override fun turnOn() {
        println("$name dinyalakan. Lampu mulai menerangi ruangan.")
    }

    override fun turnOff() {
        println("$name dimatikan. Ruangan kembali gelap.")
    }
}