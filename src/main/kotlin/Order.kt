sealed class Order {
    class Purchase(
        private val customerPurchase: Customer,
        private val carPurchase: Car,
        private val payment: PaymentType,
        private val purchasePrice: Int) {

        fun getInfo(): String {
            return "Customer: ${customerPurchase.getInfo()}, " +
                    "Car: ${carPurchase.make} ${carPurchase.model}, " +
                    "Payment: $payment, " +
                    "Purchase Price: P$purchasePrice"
        }
    }

    class Return(
        private val customerReturn: Customer,
        private val carReturn: Car,
        private val returnPrice: Int) {

        fun getInfo(): String {
            return "Customer: $customerReturn," +
                    "Car: ${carReturn.make} ${carReturn.model}," +
                    "Return Price: P$returnPrice"
        }
    }
}

val listOfPurchaseOrder = mutableListOf<Order.Purchase>()
val listOfReturnOrder = mutableListOf<Order.Return>()