package week2.c6_if_and_when

import java.awt.Color
import java.lang.Exception

fun main() {
    fun getDescription(color: Color): String {
        when(color) {
            Color.BLUE -> return "cold"
            Color.ORANGE -> return "mild"
            Color.RED, Color.PINK -> return "hot"
            else -> return "unknown"
        }
    }

    fun mix(c1: Color, c2: Color): Color {
        when(setOf(c1, c2)) {
            setOf(Color.RED, Color.YELLOW) -> return Color.ORANGE
            setOf(Color.YELLOW, Color.BLUE) -> return Color.GREEN
            setOf(Color.BLUE, Color.GREEN) -> return Color.YELLOW
            else -> throw Exception("Dirty color")
        }
    }

    println(getDescription(Color.ORANGE)) //mild
    println(mix(Color.YELLOW, Color.BLUE)) //[r=0,g=255,b=0]
}