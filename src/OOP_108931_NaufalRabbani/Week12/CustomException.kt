package OOP_108931_NaufalRabbani.Week12

class InsufficientBalanceException(val amount: Int, val balance: Int) : Exception("Attemped $amount, balance is only $balance")