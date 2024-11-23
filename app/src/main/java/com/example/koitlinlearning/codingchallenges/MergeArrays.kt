package com.example.koitlinlearning.codingchallenges

fun main(args: Array<String>) {
    //convertArrays(intArrayOf(4, 5, 9, 1, 4, 3, 6, 8, 9), intArrayOf(7, 2, 5, 8, 3, 1, 4, 7, 2))
    println(convertArrays(intArrayOf(10, 15, 10), intArrayOf(15, 20)))
    //convertArrays(intArrayOf(), intArrayOf(1,2,3))
    //convertArrays(intArrayOf(2,2,2), intArrayOf(2,2,2))
}

fun convertArrays(arr1: IntArray, arr2: IntArray)//:IntArray
{
    if(arr1.isEmpty())
    {
        //even if arr2 is empty as well, the answer will still be an empty array,
        //so there is no need to check for whether arr2 is empty
        //return removeDuplicates(arr2)
    }

    val answerArray= IntArray(arr1.size+arr2.size)
}

fun removeDuplicates(arrayToCheck: IntArray)
{

}
