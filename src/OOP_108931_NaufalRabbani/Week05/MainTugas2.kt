package OOP_108931_NaufalRabbani.Week05

fun main(){
    val Ewallet = Ewallet("Budi", 50000)
    val CreditCard = CreditCard("Asep", 100000.0)

    val paymentMethod: List<PaymentMethod> = listOf(Ewallet, CreditCard)

    println("pembayaran dengan berbagai metode:")
    for(payment in paymentMethod){
        when(payment){
            is Ewallet -> {
                payment.prcoessPayment(75000.0)
            }
            is CreditCard -> {
                payment.prcoessPayment(75000.0)
            }
        }
    }



}