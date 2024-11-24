package com.example.koitlinlearning.codingchallenges


fun main(args: Array<String>)
{
    println(validateBankCard("1121-0000-0000-0312","03/12"))
    println(validateBankCard("1234-5678-9101-1121", "11/21"))
    println(validateBankCard("1121-0000-000-0312", "03/12"))
    println(validateBankCard("1121-0000-0000-0312", "04/12"))
    println(validateBankCard("1121-0000-ABCD-0312", "03/12"))


}

fun validateBankCard(cardId: String?, expiryDate: String?) :Boolean
{
    if(cardId.isNullOrEmpty() || expiryDate.isNullOrEmpty())
    {
        println("either the card ID or expiry date is null/empty,  cannot check card")
        return false
    }
    val banks= mapOf("1121" to "ACME", "1111" to "ALFA", "AMEX" to "3796")
    val cardIdSanitized=cardId.replace("-","")
    val checkRegex=Regex("^[0-9]*$")
    if(cardIdSanitized.length!=16)
    {
        println("invalid card ID, card ID has either too many or not enough digits")
        return false
    }
    if(!cardIdSanitized.matches(checkRegex))
    {
        println("invalid card ID, card ID contains non-numerical characters")
        return false
    }
    val bankCheckSegment=cardId.substring(0,4)
    if(!banks.containsKey(bankCheckSegment))
        {
            println("invalid card ID, bank issuing segment does not match known bank")
            return false
        }

    val expiryDateCheckSegment=cardId.substring(cardId.length-4)
    if(!expiryDateCheckSegment.equals(expiryDate.replace("/","")))
    {
        println("invalid card ID, expiry date segment does not match the card's expiration date")
        return false
    }
    return true


}