package OOP_108931_NaufalRabbani.week02

class Hero(
    val name: String,
    var hp: Int = 100,
    val baseDamage: Int
) {

    fun attack (targetName: String) = println("$name menyerang $targetName dengan damage $baseDamage")
    fun takeDamage(damage: Int){
         hp -= damage

        if(hp <= 0){
            println("$name telah mati")
        } else {
            println("$name menerima $damage damage, sisa HP: $hp")
        }
    }
    fun isAlive(): Boolean = hp > 0

    constructor(name: String, baseDamage: Int) : this(name, 100,baseDamage){
        println("LOG: Hero $name berhasil dibuat")
    }


}