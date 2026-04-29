package OOP_108931_NaufalRabbani.Week09

fun main(){
    val tradeHistory = listOf(
        TradeLog("BTCUSDT", "LONG", 10, 35.5, "OPEN"),
        TradeLog("BTCUSDT", "SHORT", 5, -12.0, "CLOSED"),
        TradeLog("ETHUSDT", "LONG", 8, 22.3, "OPEN"),
        TradeLog("ETHUSDT", "SHORT", 3, -5.7, "CLOSED"),
        TradeLog("BTCUSDT", "LONG", 15, 50.0, "OPEN"),
        TradeLog("ETHUSDT", "SHORT", 7, -18.4, "OPEN")
    )

    val closedTrade = tradeHistory.filter { it.status == "CLOSED" }
}