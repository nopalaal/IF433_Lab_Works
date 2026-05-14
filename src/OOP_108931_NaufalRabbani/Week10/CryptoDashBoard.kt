package OOP_108931_NaufalRabbani.Week10

fun main(){
    val coinRepo = WalletRepository<Coin>()

    coinRepo.addItem(Coin("BTC",5.0))
    coinRepo.addItem(Coin("ETH",10.0))
    coinRepo.addItem(Coin("USDT",1.0))



}