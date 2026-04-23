package OOP_108931_NaufalRabbani.Week08

class ApiParser()
fun parseProduct(rawJson: Map<String, Any?>): Product? {
    val id   = requireNotNull(rawJson["id"])   { "API Invalid: Missing ID" }
    val name = requireNotNull(rawJson["name"]) { "API Invalid: Missing Name" }

    val type = rawJson["type"] as? String

    return when (type) {
        "ELECTRONIC" -> {
            val warranty = rawJson["warranty"] as? Int ?: 12
            Product.Electronics(id = id.toString(), name = name.toString(), warrantyMonths = warranty)
        }
        "CLOTHING" -> {
            val size = rawJson["size"] as? String ?: "All Size"
            Product.Clothing(id = id.toString(), name = name.toString(), size = size)
        }
        else -> null
    }
}

