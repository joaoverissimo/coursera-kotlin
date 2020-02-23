package week2.c2_hello_world

fun main() {
    println("hello world");
}

fun main(args: Array<String>) {
    val name = if (args.size > 0) args[0] else "kotlin"
    println("hello, $name! Your list has ${args.size} items");
}