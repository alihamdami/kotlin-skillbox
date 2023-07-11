fun main() {

    var countNumber: Int

    do {
        println("Enter number")
        countNumber = readln().toInt()
    } while (countNumber < 0)

    print(addedNumberInList(countNumber))

}


fun addedNumberInList(countNumber: Int): MutableList<String> {

    var listOfNumber: MutableList<String> = MutableList(countNumber) { "" }
    for (item in 0 until countNumber) {
        print("Enter $item number phone ")
        listOfNumber[item] = readln()
    }
    var filteredListOfNumber = listOfNumber.filter { it.startsWith("+7") }
    println("Filtered: $filteredListOfNumber")

    var listOfUniqueNumber = listOfNumber.toSet().size
    println("Unique: $listOfUniqueNumber")

    var sumOfNumber = filteredListOfNumber.sumOf { it.length - 1 }
    println("Sum of number: $sumOfNumber")


    var namesOfUsers: MutableMap<String, String> = mutableMapOf()
    for (number in 0 until listOfNumber.size) {
        println("Enter name for ${listOfNumber[number]}")
        namesOfUsers[listOfNumber[number]] = readln()
    }
    println(namesOfUsers)
    // я к каждому элементу обратился по индексу
    // каким еще способом можно обратиться к каждому элементу по индексу? map[listOfNumber[0]] = readln()
    // для заполнения коллекции используют циклы, например for в котором итератором будет i в коллекции
    // i это переменная, которая будет проходить по массиву и иметь в себе значение элемента коллекции

    // I accessed each element by index
     // any other way to access each element by index? map[listOfNumber[0]] = readln()
     // loops are used to fill the collection, for example for in which the iterator will be i in the collection
     // i is a variable that will pass through the array and contain the value of the collection element
    return listOfNumber
}
