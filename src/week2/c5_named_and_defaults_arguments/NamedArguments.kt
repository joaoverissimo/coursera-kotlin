package week2.c5_named_and_defaults_arguments

@JvmOverloads
fun displaySeparator(char: Char = '#', size: Int = 10) {
    repeat(size) {
        print(char)
    }
}

fun main() {
    displaySeparator()
    //##########

    displaySeparator('.', 5)
    //.....

    displaySeparator(size = 5)
    //#####
}