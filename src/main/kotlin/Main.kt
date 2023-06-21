fun main() {

    val samsung = TV(
        brand = "samsung",
        model = "3434",
        diagonalSize = 27.7,

    )

    samsung.turnOn()

    samsung.volUp(50)
    samsung.volUp(39)

    samsung.volDown(40)


    println(samsung.changeChannel(5))

    println(samsung.changeChannel(10))





}