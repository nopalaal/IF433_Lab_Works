package OOP_108931_NaufalRabbani.Week11

data class user(var name: String = " ", var age: Int = 0)

fun main(){
    println("TEST APPLY")
    val user = user().apply {
        name = "AleX"
        age = 17

    }
    println(user)

    println("TEST ALSO")
    val numbers = mutableListOf(1,2,3)
    numbers.also{
        println("log sebelum ditambah: $it")

    }.add(4)
    println("Setelah ditambah: $numbers")

    println("TEST WITH")
    with(user){
        println("User Details -> Name: $name, Age: $age")
    }

    val newUser = user("Budi", 20).apply{
        age = 21
    }.also{
        println("user baru dibuat: $it")
    }
}