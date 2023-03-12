fun main() {

    //create a CarDealership object
    val dealership = CarDealership()

    //add Car at the start of the program
    sedanList.forEach { dealership.availableCars.add(it) }
    suvList.forEach { dealership.availableCars.add(it) }
    truckList.forEach { dealership.availableCars.add(it) }

    println("Hi new Customer! let me assist you")
    dealership.purchaseCar()

    while (true) {

        println("[1] Show Cars")
        println("[2] Add Car")
        println("[3] Remove Car")
        println("[4] Purchase Car")
        println("[5] Return Car")
        println("[0] Exit")

        when (readLine()!!.toInt()) {
            1 -> printCar(dealership.availableCars)
            2 -> dealership.addCar()
            3 -> dealership.removeCar()
            4 -> dealership.purchaseCar()
            5 -> dealership.returnCar()
            6 -> printPurchaseOrder()
            7 -> printReturnOrder()
            0 -> break
            else -> println("Invalid keyword")
        }
    }
}

fun printCar(cars: List<Car>) {
    var counter = 1
    for (car in cars) {
        println("[$counter] ${car.getInfo()}")
        counter++
    }
    println("")
}

fun printPurchaseOrder() {
    for (purchase in listOfPurchaseOrder) {
        println(purchase.getInfo())
    }
}

fun printReturnOrder() {
    for (returnOrder in listOfReturnOrder) {
        println(returnOrder.getInfo())
    }
}

//  *** Remove private keyword in CarDealership purchasedCar and returnedCar to activate this***
//fun printPurchasedCar(purchasedCar: List<Car>) {
//    for (purchase in purchasedCar) {
//        println(purchase)
//    }
//}
//
//fun printReturnedCar(returnedCar: List<Car>) {
//    for (returned in returnedCar) {
//        println(returned)
//    }
//}