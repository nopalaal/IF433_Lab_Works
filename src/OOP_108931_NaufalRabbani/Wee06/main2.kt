package OOP_108931_NaufalRabbani.Wee06

fun main(){
    val hub = SmartHomeHub()

    val lamp    = SmartLamp(id = "LAMP-001", name = "Ruang Tamu")
    val speaker = SmartSpeaker(id = "SPK-001", name = "Google Nest Dapur")
    val cctv    = SmartCCTV(id = "CCTV-001", name = "Ezviz Garasi")

    hub.addDevice(lamp)
    hub.addDevice(speaker)
    hub.addDevice(cctv)

    hub.turnOffAllSwitches()
    hub.activateSecurityMode()
}