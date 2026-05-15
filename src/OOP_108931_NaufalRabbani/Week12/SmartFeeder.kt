package OOP_108931_NaufalRabbani.Week12

fun dispenseKibble(requestedGram: Int, availableGram: Int, isJammed: Boolean): Int{
    require(requestedGram > 0){
        "porsi Kibble harus lebih dari 0 gr"
    }

    if (isJammed){
        throw DispenserJamException()
    }

    if (requestedGram > availableGram){
        throw FoodEmptyException(requestedGram, availableGram   )
    }

    return availableGram - requestedGram
}

fun main(){
    var currentKibble = 50

    try {
        dispenseKibble(80, currentKibble, false)
    } catch (e: DispenserJamException) {
        println("Dispenser Mati: ${e.message}")
    }catch(e:FoodEmptyException){
        println("Stok makan abis: ${e.message}")
    }catch(e: Exception){
        println("Error tidak ketahui: ${e.message}")
    }finally {
        println("Siklus pengecekan dipenser pagi selesai")
    }

}