package OOP_108931_NaufalRabbani.week01

fun main(){
    val gameTitle: String? = null
    val price: Int? = null

}

fun calculateDiscount(price: Int): Int = when{
    price > 500000 -> (price * 0.20).toInt()
    else -> (price * 0.10).toInt()
}