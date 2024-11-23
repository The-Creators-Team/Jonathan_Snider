package com.example.koitlinlearning.codingchallenges

import kotlin.math.floor

fun main(args: Array<String>) {

    calculateChange("111.43;200.00")
    //calculateChange("15.00;15.00")
    //calculateChange("18.75;10.00")
    //calculateChange("1.25;2.00")


}

fun calculateChange(purchase: String) : String
{
    val splitNumbers: List<String> = purchase.split(";")
    val purchasePrice= splitNumbers[0].toFloat()
    val cashGiven=splitNumbers[1].toFloat()
    if(purchasePrice>cashGiven)
    {
        return("ERROR")
    }
    if(purchasePrice==cashGiven)
    {
        return("ZERO")
    }
    var change: Float=cashGiven-purchasePrice
    println("change: $change")
    val valueMap= mapOf(
        "ONE HUNDRED" to 100f,
        "FIFTY" to 50f,
        "TWENTY" to 20f,
        "TEN" to 10f,
        "FIVE" to 5f,
        "TWO" to 2f,
        "ONE" to 1f,
        "HALF DOLLAR" to 0.50f,
        "QUARTER" to 0.25f,
        "DIME" to 0.10f,
        "NICKEL" to 0.05f,
        "PENNY" to 0.01f)
    val changeMap =LinkedHashMap<String, Float>()



    valueMap.forEach{
        entry->
        if(change/entry.value>=1)
        {
            println("checking: $entry.key")
            println("change before: $change")
            changeMap.put(entry.key,floor(change/entry.value))
            val amountToRemove=floor(change/entry.value)*entry.value
            println("total money to remove from change: $amountToRemove")
            change-=amountToRemove
            println("change after: $change")
        }
    }
    println(changeMap.toString())
    return(changeMap.toString())
}