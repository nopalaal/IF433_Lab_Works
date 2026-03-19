package OOP_108931_NaufalRabbani.Wee06

class SmartCCTV(override val id: String, override val name: String): SmartDevice, Switchable, Recordable {

    override fun turnOn() {
        println("$name dinyalakan. Kamera mulai aktif memantau area.")
        startRecord()
    }

    override fun turnOff() {
        stopRecord()
        println("$name dimatikan. Pemantauan area dihentikan.")
    }

    override fun startRecord() {
        println("$name mulai merekam dan menyiarkan secara langsung.")
    }

    override fun stopRecord() {
        println("$name berhenti merekam dan menyiarkan.")
    }
}
