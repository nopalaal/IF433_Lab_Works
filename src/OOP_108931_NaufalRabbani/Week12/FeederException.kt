package OOP_108931_NaufalRabbani.Week12

sealed class FeederException(msg:String): Exception(msg) {}

class FoodEmptyException(requested: Int, available: Int): FeederException("Kibble tidak Cukup! diminta $requested gr, sisa $available gr")

class DispenserJamException : FeederException("Wadah dispenser tersangkut/jam")
