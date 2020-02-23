package week2.c1_from_java_to_kotlin

import java.awt.*

import java.awt.Color.*

class WeatherKotlin {

    fun updateWeather(degrees: Int) {
        val (description: String, color: Color) = when {
            degrees < 10 -> Pair("cold", BLUE)
            degrees < 25 -> "mild" to ORANGE //Pair replaced by 'to'
            else -> "hot" to RED
        }

        println("out: $description$color")
    }

}
