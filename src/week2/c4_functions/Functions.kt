package week2.c4_functions

//same functions, just simplified syntax

fun maxA(a: Int, b: Int): Int {
    if (a > b) {
       return a
    } else {
        return b
    }
}

fun maxB(a: Int, b: Int) : Int = if (a > b) a else b

//Unit = void
fun displayMax(): Unit = println(maxB(10, 14))

//local function
fun printReverseUpper(a: String, b: String) {
    fun revUp(str: String): String {
        return str.reversed().toUpperCase()
    }

    println("the value of a is '${revUp(a)}'; and the value of b is '${revUp(b)}'.")
}

fun main() {
    displayMax() //14

    printReverseUpper("Kotlin", "Java")   //the value of a is 'NILTOK'; and the value of b is 'AVAJ'.
}