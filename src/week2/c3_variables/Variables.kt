package week2.c3_variables

fun main() {
    //var is mutable
    var str = "a"
    str = "b"

    //val is read only (final)
    val str2 = "a"
    //str2 = "b"     doesn't compile

    //mutableListOf vs listOf
    val languages = mutableListOf("Java")
    languages.add("Kotlin")

    val languages2 = listOf("Java")
    //languages2.add("Kotlin")   doesn't compile
}