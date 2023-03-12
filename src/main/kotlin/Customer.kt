data class Customer(val name: String,
                    val age: Int,
                    val budget: Int) {
    fun getInfo(): String {
        return "Customer: $name"
    }
}