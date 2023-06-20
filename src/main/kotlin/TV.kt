class TV(var brand: String, var model: String, var diagonalSize: Double, var state: Boolean) {




    private var listOfChannel: List<Int> = listOf()


    companion object Volume {
        const val maxVolume: Int = 40
        var volume = 0
    }

    fun turnOn(): String {
        state = true
        return "Вы включили телевизор"
    }

    fun turnOff(): String {
        state = false
        return "Вы выключили телевизор"
    }

    fun volUp(): String {
        volume += 1
        println("Вы прибавили громкость на 1")
        return "Теперь громкость $volume"
    }
    fun volDown(): String {
        volume -= 1
        println("Вы убавили громкость на 1")
        return "Теперь громкость $volume"
    }

    fun changeChannel() {
        // разобраться с этой функций
        if (state) println("hello")
    }

}
