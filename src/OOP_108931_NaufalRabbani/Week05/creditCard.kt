package OOP_108931_NaufalRabbani.Week05

class CreditCard(accountName: String, val limit: Double, var usedAmount: Double = 0.0): PaymentMethod(accountName) {
    override fun prcoessPayment(amount: Double) {
        if (usedAmount + amount <= limit) {
            usedAmount += amount
            println("Credit Card payment of $$amount processed. Used amount: $$usedAmount/$limit")
        } else {
            println("Payment failed! Exceeds credit limit.")
        }
    }
}
