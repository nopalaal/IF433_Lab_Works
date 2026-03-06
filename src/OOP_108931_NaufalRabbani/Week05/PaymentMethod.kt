package OOP_108931_NaufalRabbani.Week05

abstract class PaymentMethod(val accountName: String){
        abstract fun prcoessPayment(amount: Double)
}