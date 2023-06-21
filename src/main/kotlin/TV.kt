import kotlin.math.max

class TV(var brand: String, var model: String, var diagonalSize: Double) {

    private var isOn: Boolean = false
    private var listOfChannel: List<Int> = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9)

    companion object Volume {
        private const val maxVolume: Int = 40
        var currentVolume = maxVolume
    }

    fun turnOn(): String {
        isOn = true
        return "Вы включили телевизор"
    }

    fun turnOff(): String {
        return "Вы выключили телевизор"
    }

    fun volUp(volume: Int) {
        if (volume <= maxVolume) {
            currentVolume += volume
            println("Теперь громкость $currentVolume")
        } else {
            currentVolume = 0
            println("Значение не может быть больше $maxVolume")
        }
    }

    fun volDown(volume: Int) {
        if (volume <= currentVolume) {
            currentVolume -= volume
            println("Теперь громкость $currentVolume")
        } else {
            currentVolume = 0
            println("Значение не может быть меньше 0")
        }
    }

    fun changeChannel(channel: Int): String {
        if (channel <= listOfChannel.maxOf { it }) {
            return "Сейчас включен канал $channel" // код для переключения канала
        } else {
            println("Такого канала нет")
        }
        if (isOn) {
            turnOn()
            listOfChannel
        }
        return ""
    }

}
