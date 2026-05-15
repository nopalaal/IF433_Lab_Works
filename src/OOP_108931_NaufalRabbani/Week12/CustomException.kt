package OOP_108931_NaufalRabbani.Week12

class InsufficientBalanceException(val amount: Double, val balance: Double) : Exception("Attemped $amount, balance is only $balance")

class BankAccount(var balance: Double) {
    fun withdraw(amount: Double){
        if (amount < 0){
            throw IllegalArgumentException("Amount must be positive")
        }
        if(amount > balance){
            throw InsufficientBalanceException(amount,balance)
        }
        balance -= amount
        println("Withdraw Successful. Remaining balance: $balance")
    }

}

fun main(){
    println("TEST MULTIPLE CATCH")

    val account = BankAccount(100.0)

    try{
        account.withdraw(150.0)
    }catch(e: InsufficientBalanceException){
        println("Insufficient balance: ${e.message}")
    }catch (e: IllegalArgumentException){
        println("Caught Argument error: Input tidak valid ${e.message}")
    }catch (e: Exception){
        println("Caught General Error: Terjadi kesalahan tidak terduga")
    }
}