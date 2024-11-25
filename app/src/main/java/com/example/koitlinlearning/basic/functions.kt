package com.example.koitlinlearning.basic


// in the below function, default arguments are provided. if a call to the function is missing one
//or all required arguments, the default values are used instead
fun displayBorder(character: Char = '=', length: Int = 15) {
    for (i in 1..length) {
        print(character)
    }
}
//the below call will result in an error because kotlin believes we are trying to pass 5 to the char
//argument
//displayBorder(5)
//by naming what argument we are replacing in the call, kotlin knows which value we are replacing
//displayBorder(length = 5)

fun main(args: Array<String>) {
    println("Output when no argument is passed:")
    displayBorder()

    println("\n\n'*' is used as a first argument.")
    println("Output when first argument is passed:")
    displayBorder('*')

    println("\n\n'*' is used as a first argument.")
    println("5 is used as a second argument.")
    println("Output when both arguments are passed:")
    displayBorder('*', 5)

}