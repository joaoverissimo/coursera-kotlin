package week2.c7_loops

fun main() {

    // doWhile
    val list = mutableListOf("A", "B", "C")

    do {
        println(list.get(0))
        list.removeAt(0)
    } while (list.isNotEmpty()) //A B C

    //for over list with index
    val names = listOf("jack", "hugo", "kate")
    for ((key, value) in names.withIndex()) {
        println("the key is: $key and the value is $value")
    }


    // for over map
    val map = mapOf("jack" to 20, "hugo" to 18, "kate" to 19)
    for ((key, value) in map) {
        println("the key is: $key and the value is $value")
    }


    // for over range
    for (i in 1..9) {
        print(i) //123456789
    }

    // for over until
    for (i in 1 until 9) {
        print(i) //12345678 - the last number will be excluded
    }

    //
    for (i in 9 downTo 1 step 2) {
        print(i) //97531
    }
}