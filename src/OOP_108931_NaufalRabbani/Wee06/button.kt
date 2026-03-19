package OOP_108931_NaufalRabbani.Wee06

class button(override val name: String): clickable(name) {
    override fun click() {
        println("Tombol $name diklik")
    }
}