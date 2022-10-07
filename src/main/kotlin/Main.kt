fun main() {
    println("We don't care about main for this test.")
}

class ShoppingCart {
    var p: List<String> = listOf();

    fun addProduct(product: String) {
        p = p + product;
    }

    fun show(): String {
        var string = "";

        for ((i, p) in p.withIndex()) {
            string = string.plus(p).plus(", ")
        }

        return "Shopping Cart: $string"
    }
}

class ShoppingCartManager {
    fun get(): ShoppingCart {
        return ShoppingCart()
    }
}