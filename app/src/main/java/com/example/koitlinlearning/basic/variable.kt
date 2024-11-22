package com.example.koitlinlearning.basic

fun main() { //start of the code
    //Compiler can guess the TYPE based on value assigned
    var kotlin = "🙂"

    var intValue: Int = 12
    var intValue1 = 12
    var intValue2: Int? = null

    if (intValue2 != null)


        intValue2!!

    kotlin = "something else"
    println(kotlin)

    //String interpolation
    println("Addition of $intValue and $intValue1 is ${addNumber3(intValue, intValue1)}")

    //Conditional Statement
    //if else
    //Special KOTLIN -> WHEN (condition/expression) { // statements, use cases}

//    when(intValue) {
//        is Integer -> {}
//        is Double -> {}
//        is Long -> {}
//        else -> {}
//    }

    when {
        intValue == 5 -> {}
        intValue > 1 -> {}
        intValue < 10 -> {}
    }


}

//Functions
fun addNumber3(a: Int, b: Int) = a + b

//third iteration
fun addNumber2(
    a: Int,
    b: Int
): Int = a + b

//second iteration
fun addNumber1(
    a: Int,
    b: Int
): Int { //return type
    return a + b
}

//first iteration
fun addNumber(//parameters
    a: Int,
    b: Int
): Int { //return type
    //body of function
    val temp = a + b
    return temp
}