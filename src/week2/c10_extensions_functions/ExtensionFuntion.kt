package week2.c10_extensions_functions

fun Iterable<Int>.mysum(): Int {
    var result = 0
    for (i in this) {
        result += i
    }
    return result
}

infix fun Iterable<Int>.by(operator: String) : Int {
    return when(operator) {
        "+" -> this.sum()
        "avg" -> this.average().toInt()
        else -> 0
    }
}

fun main(args: Array<String>) {
    val list = listOf(1, 2, 3)
    println(list.mysum())    // 6

    println(list by "avg")
}