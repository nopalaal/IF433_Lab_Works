package OOP_108931_NaufalRabbani.Week03

class player(val name: String) {
    private var xp: Int = 0

    val level : Int
        get() = xp / 100 + 1

    fun addXp(amount: Int){
        if(amount < 0){
            println("XP ga bole mines")
        }else{
            xp += amount
            println("$name mendapatkan $amount XP, total XP: $xp, level: $level")
        }
    }
}