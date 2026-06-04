package OOP_108931_NaufalRabbani.Week14

interface Database{
    fun query(sql: String): List<String>
}

class postgresDatabase : Database{
    override fun query(sql: String) = listOf("pg_data1", "pg_data2")
}