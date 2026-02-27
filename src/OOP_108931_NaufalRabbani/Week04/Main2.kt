package OOP_108931_NaufalRabbani.Week04

fun main() {
    println("=== Employeee ===")
    val employee = Employee("Budi",5000000)
    employee.work()
    println("Gaji: ${employee.calculateSalary()}")

    println("\n=== Manager ===")
    val manager = Manager("Siti", 10000000)
    manager.work()
    println("Gaji: ${manager.calculateSalary()}")

    println("\n=== Developer ===")
    val developer = Developer("Jono", 10000000, "javaScript")
    developer.work()
    println("Gaji: ${developer.calculateSalary()}")
}