package OOP_108931_NaufalRabbani.Week13
import java.io.File
import java.io.FileNotFoundException

data class Student(val name: String, val age: Int, val gpa: Double)

fun Student.toCsv(): String = "$name,$age,$gpa"

fun fromCsv(line: String): Student{
    val parts = line.split(",")
    return Student(name = parts[0], age = parts[1].toInt(), gpa = parts[2].toDouble())
}

fun saveStudents(students: List<Student>, path: String){
    File(path).writeText(students.joinToString("\n"){it.toCsv()})
}

fun loadStudents(path: String): List<Student>{
    return try{
       File(path).readLines().map { fromCsv(it) }
    } catch (e: FileNotFoundException){
        println("ERROR: File tidak ditemukan!")
        emptyList()
    }
}

fun main(){
    val students = listOf(
        Student("Budi",20,3.2),
        Student("Asep",21,3.1)
    )
    saveStudents(students,"students.csv")

    val loaded = loadStudents("students.csv")
    println("LOADED DATA")
    loaded.forEach{println(it)}
}