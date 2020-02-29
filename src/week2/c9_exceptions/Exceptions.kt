package week2.c9_exceptions

import java.io.IOException
import java.lang.NumberFormatException

fun main() {
    // is possible to assign to a variable
    val s = "34.f"
    val n = try {
        Integer.parseInt(s)
    } catch (e: NumberFormatException) {
        null
    }
    println(n)

    @Throws(IOException::class)
    fun foo() {
        throw IOException()
    }

}