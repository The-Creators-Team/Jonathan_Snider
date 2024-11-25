package com.example.koitlinlearning.basic

import java.util.Scanner

fun main(args: Array<String>)
{
    print("Enter text: ")

    val stringInput = readln()
    println("You entered: $stringInput")

    // Creates an instance which takes input from standard input (keyboard)
    //'in' refers to standard input (in most cases the keyboard
    //Scanner is a class from Java that can be used to read input other that strings
    val reader = Scanner(System.`in`)
    print("Enter a number: ")

    // nextInt() reads the next integer from the keyboard
    var integer:Int = reader.nextInt()

    println("You entered: $integer")
}