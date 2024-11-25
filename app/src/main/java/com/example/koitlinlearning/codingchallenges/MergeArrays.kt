package com.example.koitlinlearning.codingchallenges



fun main(args: Array<String>) {
    convertArrays(intArrayOf(4, 5, 9, 1, 4, 3, 6, 8, 9), intArrayOf(7, 2, 5, 8, 3, 1, 4, 7, 2))
    convertArrays(intArrayOf(10, 15, 10), intArrayOf(15, 20))
    convertArrays(intArrayOf(), intArrayOf(1,2,3))
    convertArrays(intArrayOf(2,2,2), intArrayOf(2,2,2))
}

fun convertArrays(arr1: IntArray, arr2: IntArray):IntArray
{
    val combinedArray= intArrayOf(*arr1, *arr2)
    combinedArray.sort()
    val answerSet= LinkedHashSet<Int>()
    for (value in combinedArray)
    {
        answerSet.add(value)
    }
    val answerArray = IntArray(answerSet.size) { 0 }
    for(i in 0..answerSet.size-1)
    {
        answerArray[i]=answerSet.elementAt(i)
    }
   /* for(i in 0..answerArray.size-1)
    {
        println(answerArray[i])
    }*/
    println(answerArray.contentToString())
return answerArray
}
