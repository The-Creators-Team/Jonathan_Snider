package com.example.koitlinlearning.basic

/*example of a comment */
//another kind of comment
fun main(args : Array<String>)
{
    println("Hello yet again, World")
    val a = -12
    val b = 12

    // use of greater than operator
    val max = if (a > b) {
        println("a is larger than b.")
        a
    } else {
        println("b is larger than a.")
        b
    }

    println("max = $max")
}