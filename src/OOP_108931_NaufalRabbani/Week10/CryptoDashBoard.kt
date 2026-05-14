package OOP_108931_NaufalRabbani.Week10

fun main(){
    val coinRepo = WalletRepository<Coin>()

    coinRepo.addItem(Coin("BTC",5.0))
    coinRepo.addItem(Coin("ETH",10.0))
    coinRepo.addItem(Coin("USDT",1.0))

    val response = ApiResponse<List<Coin>>("200 OK", coinRepo.getAll())
    println(response)

   response.data.forEach { coin ->
       println("Coin: ${coin.name}, Value: ${coin.balance}")
    }

    val txRepo = WalletRepository<Transcation>()

    txRepo.addItem(Transcation("ETH",1.0))

}