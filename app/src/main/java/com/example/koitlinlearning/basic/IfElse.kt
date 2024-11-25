package com.example.koitlinlearning.basic

fun main(args: Array<String>) {
    //unlike in java, "if" can be used in expressions as well. Used like this, an "else" branch is required
    //because this basically performs the purpose of Java's ternary operator, Kotlin does not have
    //a ternary operator
    val number = -10
    val result = if (number > 0) {
        "Positive number"
    } else {
        "Negative number"
    }
    println(result)

}
