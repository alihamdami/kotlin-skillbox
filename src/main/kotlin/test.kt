fun main() {

    var countNumber = 3
    var listOfNumbers =  mutableListOf("4343434", "434343434", "43434343")

    var listOfUsers = mutableMapOf<String, String>()

    for (item in 0 until countNumber) {
        print("Enter ${listOfNumbers.forEach { println(it) }} name ")
        listOfUsers[item.toString()] = readln()
    }

    println(listOfUsers)



}