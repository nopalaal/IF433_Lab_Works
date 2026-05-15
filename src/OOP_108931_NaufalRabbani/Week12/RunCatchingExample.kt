package OOP_108931_NaufalRabbani.Week12

fun main(){
    println("TES RUNCACHING")
    val result: Result<Int> = runCatching { "42X".toInt() }

    val safeValue = result.getOrElse {-1}
    println("safeValue: $safeValue")

    val recovered = result.recover{0}.getOrNull()
    println("Recovered: $recovered")

    runCatching {
        "100".toInt()
    }.onSuccess { v -> println("Berhasil dikonversi: $v")}.onFailure { e -> println("Gagal Konversi: ${e.message}")}
}