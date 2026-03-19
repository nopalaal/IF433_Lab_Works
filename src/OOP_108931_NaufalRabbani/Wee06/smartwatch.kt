package OOP_108931_NaufalRabbani.Wee06

class smartwatch : watch(), bluetoothConnectable, rechargeable{
    override fun showTime() {
        println("layar OLED menyala : 12:00 PM")
    }

    override fun connectBluetooth() {
        println("mencari smartphone untuk terhubung...")
    }

    override fun rechargeBattery() {
        println("mengisi daya baterai smartwatch...")
    }

}