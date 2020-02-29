package week2.c6_if_and_when

fun main() {
    val i: Int = 5;
    val d: Double = 2.5;

    fun convertAndPrint(n: Number) {
        when (n) {
            is Int -> println(n.toDouble())
            is Double -> println(n.toInt())
        }
    }

    convertAndPrint(i) //5.0
    convertAndPrint(d) //2

    //since kotlin 1.3, it's possible declare a variable (local) in when
    when(val y = 3.7) {
        is Double -> println(y.toInt())
    }
}