package OOP_108931_NaufalRabbani.Wee06

interface SmartDevice {
    val id: String
    val name: String
}

// Interface Switchable: mewajibkan fungsi turnOn() dan turnOff()
interface Switchable {
    fun turnOn()
    fun turnOff()
}

interface Recordable{
    fun startRecord()
    fun stopRecord()
}