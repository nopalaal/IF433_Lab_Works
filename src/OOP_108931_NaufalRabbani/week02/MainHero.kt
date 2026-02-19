package OOP_108931_NaufalRabbani.week02

fun main(){
    val scanner = java.util.Scanner(System.`in`)
    var enemyHp = 100

    println("=== Battle Game ===")
    print("Masukkan nama hero: ")
    val name = scanner.nextLine()
    print("Masukkan serangan hero: ")
    val dmg = scanner.nextInt()

    val hero = Hero(name, dmg)
    println("selamat datang, $name! HP kamu: ${hero.hp}, Damage kamu: ${hero.baseDamage}")
    println("Kamu akan melawan musuh dengan HP $enemyHp")

    while(hero.isAlive() && enemyHp > 0){
        print("Action (1. serang euy, 2. Kabur): ")
        val action = scanner.nextInt()

        when(action){
            1 -> {
                hero.attack("Musuh")
                enemyHp -= hero.baseDamage
                println("HP musuh tersisa: $enemyHp")

                if(enemyHp > 0){
                    var damage = (10..20).random()
                    println("Musuh menyerang balik!")
                    hero.takeDamage(damage)
                }
            }
            2 -> {
                println("$name memilih untuk kabur")
                return
            }
            else -> println("Aksi tidak valid, coba lagi.")
        }
        if(!hero.isAlive()){
            println("$name telah kalah dalam pertarungan!")
        } else if(enemyHp <= 0){
            println("Selamat $name, kamu menang dalam pertarungan!")
        }
    }
}