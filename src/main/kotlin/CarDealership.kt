class CarDealership {

    val availableCars = mutableListOf<Car>()
    private val purchasedCar = mutableListOf<Car>()
    private val returnedCar = mutableListOf<Car>()

    fun addCar() {

        println("Car brand: ")
        val make = readLine()!!
        println("Car model: ")
        val model = readLine()!!
        println("Car year: ")
        val year = readLine()!!.toInt()
        println("Car price: ")
        val price = readLine()!!.toInt()

        println("Car type: ")
        println("[1] Sedan")
        println("[2] SUV")
        println("[3] Truck")
        when (readLine()!!.toInt()) {
            1 -> availableCars.add(Sedan(make, model, year, price))
            2 -> availableCars.add(SUV(make, model, year, price))
            3 -> availableCars.add(Truck(make, model, year, price))
        }

        println("Car added successfully!")
    }

    fun removeCar() {
        println("Which car do you want to remove?")
        printCar(availableCars)

        val carToBeRemoved = availableCars[readLine()!!.toInt() - 1]

        println("Do you want to remove this car? ${carToBeRemoved.getInfo()} | Type 'Y' or 'N'")
        when (readLine()!!.lowercase()) {
            "n" -> removeCar()
            "y" -> {
                availableCars.remove(carToBeRemoved)
                println("Successfully removed ${carToBeRemoved.getInfo()}")
            }

            else -> println("Invalid keyword")
        }
    }

    fun purchaseCar() {

        println("Enter name: ")
        val name = readLine()!!
        println("Enter age: ")
        val age = readLine()!!.toInt()
        println("Enter budget: ")
        val budget = readLine()!!.toInt()
        println("paymentType: ")
        println("[1] Cash")
        println("[2] Installment")
        println("[3] Financing")

        lateinit var type: PaymentType

        when (readLine()!!.toInt()) {
            1 -> type = PaymentType.CASH
            2 -> type = PaymentType.INSTALLMENT
            3 -> type = PaymentType.FINANCING
            else -> println("Invalid keyword")
        }

        //create an object of Customer
        val customer = Customer(name, age, budget)

        println("Which car do you want to purchase?")
        printCar(availableCars)

        val carToBePurchased = availableCars[readLine()!!.toInt() - 1]

        println("Do you want to purchase this car? ${carToBePurchased.getInfo()} | Type 'Y' or 'N'")
        when (readLine()!!.lowercase()) {
            "n" -> purchaseCar()
            "y" -> {
                if (customer.budget >= carToBePurchased.price) {
                    purchasedCar.add(carToBePurchased)
                    availableCars.remove(carToBePurchased)

                    //create Order object
                    listOfPurchaseOrder.add(Order.Purchase(customer, carToBePurchased, type, carToBePurchased.price))

                    println("Successfully purchased ${carToBePurchased.getInfo()}")
                } else {
                    println("Sorry, budget is less than the price\n")
                }
            }

            else -> {
                println("Invalid keyword")
                purchaseCar()
            }
        }
    }

    fun returnCar() {
        println("Which car do you want to return?")
        printCar(purchasedCar)

        val carToBeReturned = availableCars[readLine()!!.toInt() - 1]

        println("Do you want to return this car? ${carToBeReturned.getInfo()} | Type 'Y' or 'N'")
        when (readLine()!!.lowercase()) {
            "n" -> returnCar()
            "y" -> {
                availableCars.add(carToBeReturned)
                returnedCar.add(carToBeReturned)
                purchasedCar.remove(carToBeReturned)

                println("Successfully returned ${carToBeReturned.getInfo()}")
            }

            else -> {
                println("Invalid keyword")
                returnCar()
            }
        }
    }
}