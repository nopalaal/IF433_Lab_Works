package OOP_108931_NaufalRabbani.Week14

interface MultifunctionDevice{
    fun print(doc: String)
    fun scan(doc: String)
    fun fax(doc: String)
}

class SimplePrinter : MultifunctionDevice{
    override fun print(doc: String) = println("PRinting $doc")
    override fun scan(doc: String) = throw UnsupportedOperationException("no Scanner")
    override fun fax(doc: String) = throw UnsupportedOperationException("no fax")
}