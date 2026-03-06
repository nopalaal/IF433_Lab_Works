package OOP_108931_NaufalRabbani.Week05

class Ewallet(accountName: String, val balance: Int): PaymentMethod(accountName){
    override fun prcoessPayment(amount: Double) {
        if(balance >= amount){
            val newBalance = balance - amount
            println("Pembayaran sebesar $amount berhasil. Sisa saldo: $newBalance")
        }
        if (amount > balance){
            println("Pembayaran sebesar $amount gagal. Saldo tidak mencukupi.")
        }
    }

    fun topUp(amount: Int){
        val newBalance = balance + amount
        println("Top up sebesar $amount berhasil. Saldo baru: $newBalance")
    }
}