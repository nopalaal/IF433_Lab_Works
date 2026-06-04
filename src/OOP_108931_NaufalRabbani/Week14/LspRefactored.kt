package OOP_108931_NaufalRabbani.Week14

interface Shape{
    fun area(): Int
}

class SafeRectangle(val width: Int, val height: Int): Shape{
    override fun area() = width * height
}

class SafeSquare(val side: Int): Shape{
    override fun area() = side * side
}