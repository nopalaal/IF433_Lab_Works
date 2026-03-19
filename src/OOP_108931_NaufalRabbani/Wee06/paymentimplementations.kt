package OOP_108931_NaufalRabbani.Wee06

class gopay : paymentmethod {
    override fun pay(amount: Double) {
        println("Membayar dengan Gopay sebesar $amount via gopay server")
    }
}

class creditcard : paymentmethod {
    override fun pay(amount: Double) {
        println("contact bank untuk pembayaran sebesar $amount via credit card")
    }
}