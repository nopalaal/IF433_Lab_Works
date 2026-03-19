package OOP_108931_NaufalRabbani.Wee06

fun processCheckout(method: paymentmethod, amount: Double) {
    println("mulai checkout")
    method.pay(amount)
}

fun main(){
    val mywatch = smartwatch()
    mywatch.showTime()

    val myPhone = smartphone()
    myPhone.turnOn()

    val pay1 = gopay()
    val pay2 = creditcard()

    println("proses pembayaran")
    processCheckout(pay1, 50000.0)
    processCheckout(pay2, 150000.0)
}