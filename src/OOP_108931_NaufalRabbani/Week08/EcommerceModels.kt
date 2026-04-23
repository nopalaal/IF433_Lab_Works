package OOP_108931_NaufalRabbani.Week08

sealed class Product {
    data class Electronics(val id: String, val name: String, val warrantyMonths: Int) : Product()
    data class Clothing(val id: String, val name: String, val size: String) : Product()
}