package OOP_108931_NaufalRabbani.Week14

class UserValidator{
    fun validate(user: User): Boolean = user.email.contains("@") && user.age >= 18
}

class UserRepository{
    fun save(user: User){
        println("SAVING User: ${user.name} welcome to database")
    }
}