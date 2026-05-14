package OOP_108931_NaufalRabbani.Week11

fun main(){
    val homeDevices = mutableListOf<SmartDevice>()

    SmartDevice(name = "", category = "").apply {
        name = "Philips WiZ Living Room"
        category = "Lighting"
        isOnline = true
        powerLoad = 12
    }.also {
        homeDevices.add(it)
        println("Device ditambahkan: ${it.name}")
    }

    SmartDevice("Ezviz Outdoor", "Camera").apply {
        isOnline = true
        powerLoad = 5
    }.also {
        println("(LOG) Kamera terhubung")
        homeDevices.add(it)
    }

    val acDevice = run {
        SmartDevice("Daikin Inverter (Kabel 3x2.5)", "HVAC", false, 800)
    }
    homeDevices.add(acDevice)

    homeDevices.add(SmartDevice("Picolo's Auto Feeder", "Pet Care", true, 10))

    val searchResult = homeDevices.find { it.category == "Camera" }
    searchResult?.let {
        println("\n=== Hasil Pencarian ===")
        println(it.diagnose())
    }

    with(homeDevices) {
        println("\n=== Rangkuman Smart Home ===")
        println("Total Perangkat: ${this.size}")
        println("Perangkat Online: ${this.count { it.isOnline }}")
        println("Perangkat Offline: ${this.count { !it.isOnline }}")
        println("Total Daya: ${this.sumOf { it.powerLoad }} Watt")
    }

    val totalPower = homeDevices.run { sumOf { it.powerLoad } }
    println("\nTotal Daya Seluruh Perangkat: $totalPower Watt")

    homeDevices.forEach { device ->
        println(device.diagnose())
    }
}