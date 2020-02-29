package week2.c6_if_and_when

import java.awt.*

import java.awt.Color.*

class WeatherBoolean {

    fun updateWeather(degrees: Int) : String {
        val (description: String, color: Color) = when {
            degrees < 10 -> Pair("cold", BLUE)
            degrees < 25 -> "mild" to ORANGE //Pair replaced by 'to'
            else -> "hot" to RED
        }

        return "$description/$color"
    }
}


fun main() {
    val inst = WeatherBoolean()
    println(inst.updateWeather(20))
    //mild/ORANGE
}
