package OOP_108931_NaufalRabbani.Week12

fun dispenseKibble(requestedGram: Int, availableGram: Int, isJammed: Boolean): Int{
    require(requestedGram > 0){
        "porsi Kibble harus lebih dari 0 gr"
    }

    if (isJammed){
        throw DispenserJamException()
    }


}