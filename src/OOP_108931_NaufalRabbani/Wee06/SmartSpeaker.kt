package OOP_108931_NaufalRabbani.Wee06

class SmartSpeaker(override val id: String, override val name: String) : SmartDevice, Switchable {

    override fun turnOn() {
        println("$name dinyalakan. Speaker siap digunakan.")
    }

    override fun turnOff() {
        println("$name dimatikan. Sampai jumpa!")
    }

    fun playMusic(song: String) {
        println("Memutar lagu $song dari Spotify.")
    }
}