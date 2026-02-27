package OOP_108931_NaufalRabbani.Week04

open class Manager(name: String, baseSalary: Int) : Employee(name, baseSalary) {

    override fun work(){
        println("$name sedang mengelola tim")
    }

    override fun calculateSalary(): Int {
        return super.calculateSalary() + 500000
    }
}