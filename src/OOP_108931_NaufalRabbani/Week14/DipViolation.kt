package OOP_108931_NaufalRabbani.Week14

class MySQLDatabase{
    fun query(sql: String): List<String> = listOf("data1","data2")
}

class UserDevice{
    private val db = MySQLDatabase()
    fun getUser(id: Int) = db.query("SELECT * FROM users WHERE id = $id")
}