package OOP_108931_NaufalRabbani.Week04

class Employee(val name: String, val baseSalary: Int) {

    open fun work(){
        println("$name sedang bekerja")
    }
    open fun calculateSalary(): Int {
        val bonus = baseSalary * 0.1
        return (baseSalary + bonus).toInt()
    }
}