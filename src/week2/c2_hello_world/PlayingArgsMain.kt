package week2.c2_hello_world

fun main(args: Array<String>) {
    println("args call fun, the output is: ${readFirstItem(args)}!")
    //args call fun, the output is: null!
}

fun readFirstItem(args: Array<String>) : String? {
    return args.getOrNull(0)
}