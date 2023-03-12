class Sedan(make: String,
            model: String,
            year: Int,
            price: Int) : Car(make, model, year, price) {

    override fun calculateValue() {
        println("Type: Sedan, Price: $price")
    }
}

val sedanList = listOf(
    Sedan("Kia", "Rio", 2023, 985000),
    Sedan("Nissan", "Versa", 2023, 866500),
    Sedan("Honda", "Civic", 2023, 1583000),
    Sedan("Hyundai", "Elantra N", 2023, 1549829),
    Sedan("Volkswagen", "Jetta GLI", 2023, 1800210)
)