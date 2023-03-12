class Truck(make: String,
            model: String,
            year: Int,
            price: Int) : Car(make, model, year, price) {

    override fun calculateValue() {
        println("Type: Truck, Price: $price")
    }
}

val truckList = listOf(
    Truck("Chevrolet", "Colorado", 2023, 1638888),
    Truck("Ford", "Ranger Raptor", 2023, 2038000),
    Truck("Isuzu", "D-MAX", 2023, 1885000),
    Truck("Nissan", "Navara", 2023, 1811000),
    Truck("Toyota", "Hilux", 2023, 2059000)
)