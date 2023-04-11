class HelloPrinter {
    fun printHello() {
        println("Hello!")
    }

}

class Printer {
    companion object DocumentPrinter {
        fun printDocument() = println("Document printing successful.")
    }
}

fun main() {
    Printer.printDocument() // неявный вызов companion object

    Printer.DocumentPrinter.printDocument() // явный вызов companion object
}