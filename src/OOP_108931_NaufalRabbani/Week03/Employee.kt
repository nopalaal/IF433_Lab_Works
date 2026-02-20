package OOP_108931_NaufalRabbani.Week03

class Employee(
    val name: String,
) {
    var salary: Int = 0
        set(value){
            println("mencoba set gaji ke $value")
            this.salary = value
        }
}