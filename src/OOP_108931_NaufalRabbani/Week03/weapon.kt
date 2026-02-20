package OOP_108931_NaufalRabbani.Week03

class weapon(
    val name: String,
) {

    var damage: Int = 0
        set(value) {
            if(value < 0){
                println("damage ga bole mines")
            }else if(value > 1000){
                println("damage terlalu OP, damage di set ke 1000")
                field = 1000
            }else{
                println("damage sukses di set")
                field = value
                }
            }

        val tier: String
        get() = if (damage > 800) "Legendary" else if(damage > 500) "Epic" else "Common"
}