package com.example.demo

/*
   Chapter 5: Kotlin Functions
   Language: Kotlin
   @author: Ganesh Tikone
 */


fun main(args: Array<String>) {

    // Simple functions
    getData()

    // function with arguments
    val cubeEdge = 5
    getAreaOfCube(cubeEdge)

    // function with arguments with default value
    getOperatingSystemName("Windows")
    getOperatingSystemName()

    // function arguments and return type
    val max = maxOf(10,20)
    println("Max Value: $max")

    println("Cube of 3: "+ cube(3))
}

/**
 * Kotlin function
 */
fun getData() {
    println("Get data simple function")
}

/**
 * function with argument(s)
 */
fun getAreaOfCube(cubeEdge:Int){
    val area = 6 * ( cubeEdge * cubeEdge)
    println("Area of Cube: $area")
}

/**
 * function with arguments default value
 */
fun getOperatingSystemName(osName:String = "Linux"){
    println("Operating System: $osName")
}

/**
 * Function with arguments and return type
 * @param a: first int value
 * @param b: second int value
 * @return Int Max value
 */
fun maxOf(a:Int, b:Int): Int{
    if (a > b){
        return a
    }
    return b
}

/**
 * Single Expression
 */
fun cube(a:Int):Int = a * a * a










