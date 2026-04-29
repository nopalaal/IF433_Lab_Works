package OOP_108931_NaufalRabbani.Week09

fun main(){
    val tradeHistory = listOf(
        TradeLog("BTCUSDT", "LONG", 10, 35.5, "CLOSED"),
        TradeLog("BTCUSDT", "SHORT", 5, -12.0, "CLOSED"),
        TradeLog("ETHUSDT", "LONG", 8, 22.3, "OPEN"),
        TradeLog("ETHUSDT", "SHORT", 3, -5.7, "CLOSED"),
        TradeLog("BTCUSDT", "LONG", 15, 50.0, "OPEN"),
        TradeLog("ETHUSDT", "SHORT", 7, -18.4, "OPEN")
    )

    val closedTrades = tradeHistory.filter { it.status == "CLOSED" }
    val winningTrades = closedTrades.filter { it.roe > 0 }
    val losingTrades = closedTrades.filter { it.roe < 0 }
}