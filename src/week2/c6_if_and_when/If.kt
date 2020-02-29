package week2.c6_if_and_when

import java.awt.Color
import java.awt.Color.*
import java.lang.Exception

fun main() {
    //if inline (there is no ternary operator)
    if (4 > 3) println("bigger") else println("lower")

    //if block
    if (4 > 3) {
        val newValue = 4 + 3
        println("bigger $newValue")
    } else {
        val newValue = 4 - 3
        println("bigger $newValue")
    }

}