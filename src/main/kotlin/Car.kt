abstract class Car (
    val make: String,
    val model: String,
    private val year: Int,
    val price: Int) {

    abstract fun calculateValue()

    fun getInfo(): String {
        return "Make: $make, Model: $model, Year: $year, Price: P$price"
    }
}