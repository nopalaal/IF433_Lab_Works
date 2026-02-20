package OOP_108931_NaufalRabbani.Week03

class Employee(
    val name: String,
) {
    var salary: Int = 0
        set(value) {
            if (value < 0) {
                println("ERROR: Gaji ga bole mines")
                field = 0

            } else {
                field = value
            }
        }


    private var perfomanceRating: Int = 3

    fun increasePerfomance(){
        perfomanceRating++
    }

    fun printStatus(){
        println("Nama: $name, Gaji: $salary, Rating: $perfomanceRating")
    }
}
