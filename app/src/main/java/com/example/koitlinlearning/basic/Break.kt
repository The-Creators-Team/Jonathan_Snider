package com.example.koitlinlearning.basic

//break and continue in kotlin works similarly to java
//labelled breaks and continues can be used to break nested loops at specific points by labelling a loop and then
//using that label with the break or continue command
fun main(args: Array<String>) {

    first@ for (i in 1..4) {

        second@ for (j in 1..2) {
            println("i = $i; j = $j")

            if (i == 2)
                break@first
        }
    }
}