package OOP_108931_NaufalRabbani.Week10

interface Hasname{
    val name: String
}

class WalletRepository<T> {
    private val items = mutableListOf<T>()

    fun addItem(item: T) {
        items.add(item)
    }

    fun getAll(): List<T> {
        return items
    }

    fun search(name:String): List<T>{
        return items.filter{
            it is Hasname && it.name.contains(name, ignoreCase = true)
        }
    }
}