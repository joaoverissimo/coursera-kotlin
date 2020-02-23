package week2.c1_from_java_to_kotlin

object PersonMainKotlin {

    @JvmStatic
    fun main(args: Array<String>) {
        val personJava = PersonJava("verissimo", 10)
        println(personJava)

        val personKotlin = PersonKotlin("verissimo", 10)
        println(personKotlin)
    }

}
