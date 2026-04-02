package OOP_108931_NaufalRabbani.Week07

sealed class BattleState{
    data class MonsterEncounter(val monsterName:String) : BattleState()
    data class GameOver(val reason: String) : BattleState()
    data class LootDropped(val item: GameItem) : BattleState()
    object SafeZone : BattleState()
}