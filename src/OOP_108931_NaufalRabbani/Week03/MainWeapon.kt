package OOP_108931_NaufalRabbani.Week03

fun main(){
    val scanner = java.util.Scanner(System.`in`)
    println("=== Sistem Pemilihan Senjata ===")

    print("Masukkan nama senjata: ")
    val weaponName = scanner.nextLine()
    print("Masukkan damage senjata: ")
    val weaponDamage = scanner.nextInt()

    val w1 = weapon(weaponName)
    w1.damage = weaponDamage

    println("selamat anda berhasil membuat senjata ${w1.name} dengan damage ${w1.damage} dengan tipe ${w1.tier}")
}