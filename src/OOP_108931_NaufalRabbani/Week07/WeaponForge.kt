package OOP_108931_NaufalRabbani.Week07

import OOP_108931_NaufalRabbani.Week03.weapon

class Weapon private constructor(val item: GameItem, val durability: Int) {
    companion object {
        fun forgeStarterSword(): Weapon{
            val sword = GameItem("Pedang Kayu Bapuk", 5, ItemRarity.COMMON)

            return Weapon(sword, 50)
        }

        fun forgeEpicSword(): Weapon{
            val sword = GameItem("Pedang Epic Ungu", 50, ItemRarity.EPIC)

            return Weapon(sword, 100)
        }
    }
}
