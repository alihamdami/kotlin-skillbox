import java.util.Random
import kotlin.random.nextInt

object Channel {

    private val listOfChannel = listOf<String>(
        "1 Первый канал", "2 Россия 24", "3 НТВ", "4 Рен ТВ", "5 Культура",
        "6 Спорт", "7 МАТЧ ТВ", "8 Карусель", "9 Зоо ТВ", "10 Второй канал",
    )

     fun getRandomChannels(): List<String>  {
         val randomListChannel = listOfChannel.take(kotlin.random.Random.nextInt(1..listOfChannel.size)).toMutableList()
         randomListChannel.shuffle()

         return randomListChannel
     }

}