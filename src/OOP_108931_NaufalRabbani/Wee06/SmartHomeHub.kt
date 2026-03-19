package OOP_108931_NaufalRabbani.Wee06

class SmartHomeHub {
    val devices = mutableListOf<SmartDevice>()

    fun addDevice(device: SmartDevice) {
        devices.add(device)
        println("${device.name} berhasil ditambahkan ke Smart Home Hub.")
    }

    fun turnOffAllSwitches() {
        println("\nMematikan semua perangkat yang bisa dimatikan...")
        for (device in devices) {
            if (device is Switchable){
                device.turnOff()
            }
        }
        println("Semua perangkat Switchable telah dimatikan.")
    }
}

