package OOP_108931_NaufalRabbani.Week09

fun main(){
    println("===  TEST LIST ===")


    val frameworks: List<String> = listOf("Spring", "Java", "C++")

    println("Immutable List: $frameworks")

    val scores: MutableList<Int> = mutableListOf(85,90)
    scores.add(95)
    scores[0] = 88
    println("Mutable List: $scores")

    println("==== SET LIST====")
    val uniqueNumbers = setOf(1,2,2,3,3,4)
    println("Unique numbers in unique: $uniqueNumbers")

    val activeUsers = mutableSetOf("UserA", "UserB")
    activeUsers.add("UserC")
    activeUsers.add("UserA")
    println("Active users: $activeUsers")

    println("=== MAP LIST ===")
    val studentGrades = mapOf("Alice" to "A", "Bob" to "B", "Charlie" to "C")
    println("Student Grades: $studentGrades")

    val inventory = mutableMapOf("Apple" to 50, "Banana" to 30)
    inventory["Orange"] = 20
    inventory["Apple"] = 45
    println("Inventory: $inventory")
}