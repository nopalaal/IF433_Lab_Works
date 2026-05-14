package OOP_108931_NaufalRabbani.Week09

class WalletRepository<T> {
    private val items = mutableListOf<T>()

    fun addItem(item: T) {
    }

    fun getAll(): List<T> {
        return items
    }
}