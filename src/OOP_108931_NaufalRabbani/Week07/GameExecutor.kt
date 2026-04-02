package OOP_108931_NaufalRabbani.Week07

fun processEvent(event: BattleState){
    when(event){
        is BattleState.MonsterEncounter -> {
            println("Monster muncul: ${event.monsterName}! Bersiap bertarung!")
        }
        is BattleState.GameOver -> {
            println("Game Over! Alasan: ${event.reason}")
        }
        is BattleState.LootDropped -> {
            val (item) = event
            println("Mendapat loot: ${item.name} (${item.rarity})")
        }
        BattleState.SafeZone -> {
            println("Kamu berada di zona aman. Istirahat dulu...")
        }
    }
}