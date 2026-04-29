package OOP_108931_NaufalRabbani.Week09

data class Student(val name: String, val gpa: Double)

fun main(){
    val students = listOf(
        Student("Michael", 3.2),
        Student("John", 3.6),
        Student("Sarah", 2.8),
        Student("Emily", 3.9)
    )
}