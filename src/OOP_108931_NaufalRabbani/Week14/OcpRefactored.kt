package OOP_108931_NaufalRabbani.Week14

interface DiscountStrategy{
    fun apply(price:Double):Double
}

class StudentDiscount : DiscountStrategy{
    override fun apply(price:Double) = price * 0.80
}

class MemberDiscount : DiscountStrategy{
    override fun apply(price:Double) = price * 0.85
}

class SafeDiscountCalculator(private var strategy: DiscountStrategy){
    fun calculate(price:Double) = strategy.apply(price)
}

class SeniorDiscount : DiscountStrategy{
    override fun apply(price:Double) = price * 0.75
}