package com.example.demo

import kotlin.math.ln

/*
   Chapter 8: OOP Concept
   Language: Kotlin
   @author: Ganesh Tikone
 */

/*

    - Inheritance
    - Method Overriding
    - Data Class (Kotlin)
    - Seal Class (Kotlin)
    - Abstract Class
    - Singletone Class
    - Access Modifiers (Visibility Control)
    - Interface

 */


fun main(args: Array<String>) {

    // Example of Inheritance - Open Class
    var shape = Square()
    shape.area()

    // Override function
    val anotherShape = Shape()
    val square = Square()

    anotherShape.volume()
    square.volume()


    // Data Class
    val pixelXL = Mobile("Google","Android", "Pixel XL", 45897.00)

    println("Mobile: "+pixelXL.toString())
    println("Mobile Vendor: ${pixelXL.vendor} /  Model: ${pixelXL.model}")

    println("\nPrice Changes")
    pixelXL.price =  40999.00
    println("Mobile: "+pixelXL.toString())


    // Singletone Class
    println("\nSingletone")
    println(Database.display())

    // Access Modifiers


    // Interface
    println("\nInterface")
     val networkUtils = NetworkUtils()

    networkUtils.networkType()

    networkUtils.onNetworkConnected()

    networkUtils.isNetworkAvaialble = false
    println("Network available: ${networkUtils.isNetworkAvaialble}")

    networkUtils.onNetworkConnectionFailed()







    //Exercise - Learn more about Seal Class and Abstract Class


}

/**
 * Everything in Kotlin is by default final,
 * hence, we need to use the keyword “open” in front of the class declaration
 * to make it allowable to inherit.
 */
open class Shape {
    fun area(){
        println("Area of shape")
    }

    open fun volume(){
        println("Volume of Shape")
    }
}

class Square: Shape() {  // inheritence happend using default constructor

    override fun volume () {
        println("Volume of Square")
    }
}


/*
    # Data Class
    A class can be marked as a Data class whenever it is marked as ”data”.
    This type of class can be used to hold the basic data apart.
    Other than this, it does not provide any other functionality.

    All the data classes need to have one primary constructor and
    all the primary constructor should have at least one parameter.

    Whenever a class is marked as data, we can use some of the inbuilt function
    of that data class such as “toString()”,”hasCode()”, etc.

    Like java bean Getter/Setter methods are not required, it is inbuilt
 */

/**
 * Mobile data class
 * @param operatingSystem : Operating System of Mobile
 * @param vendor: Vendor of Mobile
 * @param model : Model Name of Mobile
 * @param price: Price of mobile
 */
data class Mobile(val vendor:String, val operatingSystem:String,  val model:String , var price:Double)


/*
   # Singletone Class - Kotlin

 */

object Database {

    var write:Boolean = true

    fun  display() = "printing value of Write flag: $write"
}


/*
   Access Modifiers
 */

open class Visibility {

    /**
     * private,  it will be accessible within its immediate scope.
     *
     * the variable salary can be accessible only in the same Kotlin file,
     * where its mentioned as they all are declared as private in the declaration block
     */
    private var salary = 1.0

    /**
     * Protected is another access modifier for Kotlin,
     * which is currently not available for top level declaration
     * like any package cannot be protected
     */
    protected var designation = "Software Engineer"

    /**
     * An Internal package is visible only inside the module under which it is implemented.
     * An internal class interface is visible only by other class present inside the same package or the module
     */
    internal val mobile = "9011223344"

    /**
     * By default access modifier is Public
     * Public modifier is accessible from anywhere in the project workspace.
     * If no access modifier is specified, then by default it will be in the public scope.
     */
    var email = "ganesh.tikone@silicus.com"
}




/*
    # Interface

    In Kotlin, the interface works exactly similar to Java 8, which means they can contain
    method implementation as well as abstract methods declaration.
    An interface can be implemented by a class in order to use its defined functionality.

 */

interface NetworkConnectionCallBack {

    var isNetworkAvaialble:Boolean     // Abstract property

    fun onNetworkConnected()           // Abstract method
    fun onNetworkConnectionFailed()    // Abstract method

    fun networkType() {
        // Some code ...
        println("Network Type: WI-FI")
    }
}


class NetworkUtils : NetworkConnectionCallBack {
    override var isNetworkAvaialble: Boolean = true

    override fun onNetworkConnected() {
        // some code ..
        println("Network connected successfully")
    }

    override fun onNetworkConnectionFailed() {
        // some code ..
        println("Network connection failed")
    }

}


