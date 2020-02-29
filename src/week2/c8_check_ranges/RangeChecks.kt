package week2.c8_check_ranges

import java.math.BigDecimal
import java.time.LocalDate

fun main() {
    val isInRange = 'B' in 'A'..'Z'
    println(isInRange)

    val s = '8'
    when (s) {
        in 'a'..'z' -> println("is lowercase letter")
        in 'A'..'Z' -> println("is uppercase letter")
        in '0'..'9' -> println("is a digit")
    }

    val start = LocalDate.of(2020, 2, 10)
    val end = LocalDate.of(2020, 2, 22)
    val currentDate = LocalDate.of(2020, 2, 17)
    //println(currentDate >= start && currentDate <= end)
    println(currentDate in start..end)

    val min = BigDecimal.ONE
    val max = BigDecimal.TEN
    val value = BigDecimal.valueOf(4)
    println(value in min..max)
}