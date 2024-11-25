package com.example.koitlinlearning.basic

fun main() {
    //VARIABLES
    /*-------------------*/
    //Kotlin can auto assign data types based on context
    //below is a var (variable). Variables can be changed (are mutable)
    var language = "French"
    language="German"
    //^above, language will be recognized as "String" by the compiler, and it was changed with no
    //issue

    //below, score will be recognized as an Int
    val score = 95

    //however, trying to change its value below will result in the compiler throwing an error
    //score=96


    //NULLS
    /*-------------------*/
    //kotlin has been designed from Java to reduce the odds of a "null pointer exception" error
    //to as low as possible. As such, variables in kotlin are inherently not-nullable unless
    //otherwise specified

 //a question mark after a type declaration indicates that this value can be null
    var b: String? = "abc"
// Re-assigns null to the nullable variable
    b = null
// Tries to directly return the length of a nullable variable
    //val l = b.length
    //print(l)
// ^Only safe (?.) or non-null asserted (!!.) calls are allowed on a nullable receiver of type String?

//in order to work with variables that can be null, there are several options:

//a simple if check that includes a check if b is not null. This functionality exists in more
    //refined methods in kotlin, but this also works
    if(b!=null)
    {
        println(b.length)
    }

    // adding a question mark before a function call (safe call operator) means the function can
    //safely complete if the value ends up being null. If the value is not null, the return type
    //will update to be nullable (i.e. "length" usually returns an "Int", but in this case will
    //return "Int?"
    println(b?.length) //will successfully return null


    //safe calls can be chained. In the below example, this is an attempt to get Bob's department, and then
    //the name of the head of that department. If at any point in this chain a value is null (i.e. Bob
    //isn't assigned to a department or his department doesn't have a head, the returned value will be null

    //bob?.department?.head?.name

    //safe calls can also be made in an assignment. if any of the chained safe calls below returns null,
    //the function on the right simply doesn't run.
    //person?.department?.head = managersPool.getManager()

    //elvis operators "?:"  can be used to provide an alternative to returning null if a value ends up being
    //null. Instead of returning null, the value given in the operator is returned instead

    val l = b?.length ?: 0
    //in the above equation, 0 will be returned instead of null


    //because return and throw are both expressions in kotlin, they can be used with elvis operators
    //as well:

    /*fun foo(node: Node): String? {
        // Checks for getParent(). If not null, it's assigned to parent. If null, returns null
        val parent = node.getParent() ?: return null
        // Checks for getName(). If not null, it's assigned to name. If null, throws exception
        val name = node.getName() ?: throw IllegalArgumentException("name expected")
    }*/


    //not null assertions (!!) can be used when you are confident a value cannot be null but kotlin
    //itself can't be sure because of how the compiler reads code. If a null result is given
    //for a function using a not null assertion a null-pointer exception is thrown
    // Assigns a nullable string to a variable
    val c: String? = "Kotlin"
// Treats c as non-null and accesses its length
    val d = c!!.length
    println(l)

    // Declares a list of nullable strings
    val listWithNulls: List<String?> = listOf("Kotlin", null)

    //the "let" scope function is very useful for dealing with nulls, as it only executes the code inside
    //the block if the variable is not null
// Iterates over each item in the list
    for (item in listWithNulls) {
        // Checks if the item is null and only prints non-null values
        item?.let { println(it) }
        //Kotlin

        // Declares a list containing some null and non-null integer values
        val nullableList: List<Int?> = listOf(1, 2, null, 4)

// Filters out null values, resulting in a list of non-null integers
        val intList: List<Int> = nullableList.filterNotNull()

        println(intList)
// [1, 2, 4]

        // Declares a variable of type Any, which can hold any type of value
        val a: Any = "Hello, Kotlin!"

// Safe casts to Int using the 'as?' operator
        val aInt: Int? = a as? Int
// Safe casts to String using the 'as?' operator
        val aString: String? = a as? String

        println(aInt)
// null
        println(aString)
// "Hello, Kotlin!"
    }
}