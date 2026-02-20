package OOP_108931_NaufalRabbani.Week03

fun main(){
    val scanner = java.util.Scanner(System.`in`)

    println("=== Menu ===")
    println("1. Buat Senjata")
    print("2. buat Player")
    val choice = scanner.nextInt()
    scanner.nextLine()

    when(choice){
        1 -> {
            println("=== Sistem Pemilihan Senjata ===")

            print("Masukkan nama senjata: ")
            val weaponName = scanner.nextLine()
            print("Masukkan damage senjata: ")
            val weaponDamage = scanner.nextInt()

            val w1 = weapon(weaponName)
            w1.damage = weaponDamage

            println("selamat anda berhasil membuat senjata ${w1.name} dengan damage ${w1.damage} dengan tipe ${w1.tier}")
        }
        2 -> {
            println("=== Sistem Pemilihan Player ===")

            print("Masukkan nama player: ")
            val playerName = scanner.nextLine()
            print("Masukkan XP player: ")
            val playerXp = scanner.nextInt()

            val p1 = player(playerName)
            p1.addXp(playerXp)
            print("selamat anda berhasil membuat player ${p1.name} dengan XP ${playerXp} dan level ${p1.level}")
        }
        else -> println("Pilihan tidak valid")
    }


}