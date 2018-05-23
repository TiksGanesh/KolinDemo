package com.example.demo

/*
   Chapter 3: Control Flow, Loops and Collection
   Language: Kotlin
   @author: Ganesh Tikone
 */

    /*
       Kotlin has following

       # Control Flow
       - If/Else
       - When (Similar to switch case )

       # Loops
       - For
       - While and Do-While
       - ForEach

     */

fun main(args: Array<String>) {


    val operandOne = 10
    val operandTwo = 20


    // If Else
    if (operandOne > operandTwo){
        println("$operandOne is greater than $operandTwo")
    }else if (operandOne < operandTwo){
        println("$operandOne is less than $operandTwo")
    }else {
        println("$operandOne is equal than $operandTwo")
    }


    // When
    when(operandTwo){
        in 1..10 -> println("value is in range of 1 to 10")
        20,21,22 -> println("value is in range of 20 to 22")
        else -> println("Default case like switch")
    }


    // For Loop - Remember Integer Array
    val numberArray : IntArray =  intArrayOf(12,22,32,42,52,62)

    for (number in numberArray){
        print(" $number ")
    }

    println("\n\nPrint Array with index")
    for ((index,value) in numberArray.withIndex()){
        println("$index -> $value")
    }


    // for each
    println("\nFor Each - Lambda")
    numberArray.forEach {it->
        print("$it, ")
    }


    // WHILE
    println("\n\nWhile")
    var i = 0

    while (i <= 10){
        print("$i ")
        i++
    }

    /*
        # Loops with Ranges
        Range expressions are formed with rangeTo functions that have the operator form .. which is complemented by in and !in.
        Range is defined for any comparable type, but for integral primitive types it has an optimized implementation
     */

    println("\n\nRange")
    for (j in 1..4){
        print("$j ")
    }

    // Extension function
    println("\n\nRange DownTo")
    for (j in 4 downTo 1){
        print("$j ")
    }

    // Extension function
    println("\n\nRange Step")
    for (k in 1..5 step 2){
        print("$k ")
    }

}