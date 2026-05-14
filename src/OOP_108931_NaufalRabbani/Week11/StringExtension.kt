package OOP_108931_NaufalRabbani.Week11

fun String.addGreeting(): String {
    return "Hello, $this!"
}

fun String.repeatTimes(n: Int): String {
    return this.repeat(n)
}