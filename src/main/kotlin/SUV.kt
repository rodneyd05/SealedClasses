class SUV(make: String,
          model: String,
          year: Int,
          price: Int) : Car(make, model, year, price) {

    override fun calculateValue() {
        println("Type: SUV, Price: $price")
    }
}

val suvList = listOf(
    SUV("Toyota", "Fortuner", 2023, 2595000),
    SUV("Mitsubishi", "Monterosport", 2023, 2366000),
    SUV("Isuzu", "Mu-X", 2023, 2505000),
    SUV("Nissan", "Terra", 2023, 2474000),
    SUV("Ford", "Everest", 2023, 2525000)
)