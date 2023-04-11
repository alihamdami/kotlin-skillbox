package Module_7

fun main() {
//
//    val lada = Car(brand = "Lada", model = "Vesta", color = "Yellow")
//    val bmw = Car(brand = "BMW", model = "X6")
//    printInfo(lada)
//    printInfo(bmw)

    val vw = Car(brand = "VW", model = "Beetle", color = "Green")
    var renualt = Car(descriptor = "Renault" to "Logan", "Brown")
    printInfo(vw)
    printInfo(renualt)

}

fun printInfo(car: Car) {
    println("Brand - ${car.brand}, Model - ${car.model}, Color - ${car.color}")
}