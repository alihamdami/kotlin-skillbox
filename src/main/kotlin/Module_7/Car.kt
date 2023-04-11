package Module_7

import java.lang.foreign.FunctionDescriptor
import kotlin.random.Random

class Car(var brand: String, var model: String, var color: String = "White") {

    constructor(descriptor: Pair<String, String>, color: String): this(
        brand = descriptor.first,
        model = descriptor.second,
        color = color) {

    }


    fun move() {
        val distance = Random.nextInt(1, 10)
        println("Car passed $distance km")
    }

    fun start() {
        println(" Car started")
    }

    fun stop() {
        println(" Car stopped")
    }


}