package com.example.demo


/*
   Chapter 2: Basic Types
   Language: Kotlin
   @author: Ganesh Tikone
 */

 /*
    The representation of numbers in Kotlin is pretty similar to Java, however,
    Kotlin does not allow internal conversion of different data types.

    Basic types supported:
    - Double
    - Float
    - Int
    - Long
    - Short
    - Byte
    - Character
    - String
    - Boolean
    - Arrays
    - Ranges
    - Collections - later in session
  */


fun main(args: Array<String>) {

    // Variable Declaration

    val count: Int = 10
    println("Int: $count")

    val pi: Float = 3.14f
    println("Float: $pi")

    val weight: Double = 72.65
    println("Double: $weight")


    val uniqueId: Long = 1234L
    println("Long: $uniqueId")


    val char: Char = 'A'
    println("Char: $char")


    val toogle: Short = 0
    println("Short: $toogle")

    val byte: Byte = 1
    println("Byte: $byte")

    // Try Boolean isNetworkConnected and String address



    /* Arrays:
       Arrays are a collection of homogeneous data. Like Java,
       Kotlin supports arrays of different data types.
       Array is immutable
     */


    val numberArray : IntArray =  intArrayOf(1,2,3,4,5,6)
    println("3rd index of numberArray: "+ numberArray[3])


    // Try String Arrayof Months


    // Variable - Mutable/Not final
    var result = pi * count
    println("Result: $result")

    result += count
    println("Adding Count Result: $result")



    // Null variables and Null Check


    var location:String? = null

    // Handle Null check with Safe Operator

    val characterCount = location?.length

    // This is error code , !! operator tells that developer is sure about
    // value of given variable will never be null at run time
    //val errorCode = location!!.length

    println("Char Count with Safe Operator: $characterCount")

    // Elvis Operator, handle initialisation smoothly
    // making sure Non Null variables

    val locationStringLength = location?.length ?: 0

    println("Char Count With Elvis Operation : $locationStringLength")



    // Try Setting null to non null variable


















}