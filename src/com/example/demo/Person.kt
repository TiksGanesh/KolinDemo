package com.example.demo

/*
   Chapter 7: Class Constructors
   Language: Kotlin
   @author: Ganesh Tikone
 */



fun main(args: Array<String>) {
    val me = Person("Ganesh", "Tikone")
    println("FirstName: "+me.firstName)
    println("LastName: "+me.lastName)

    // Create object of human

}


/*
   # Constructor

   Kotlin has two types of constructor - one is the primary constructor and the other is the secondary constructor.
   One Kotlin class can have one primary constructor, and one or more secondary constructor.
   Java constructor initializes the member variables, however, in Kotlin the primary constructor initializes the class,
   whereas the secondary constructor helps to include some extra logic while initializing the same.
   The primary constructor can be declared at class header level.
 */


class Person (val firstName:String , val lastName:String ){

}


 /*
    # Secondary Constructor

    Kotlin allows to create one or more secondary constructors for your class.
    This secondary constructor is created using the “constructor” keyword.
    It is required whenever you want to create more than one constructor in Kotlin or whenever you want to include
    more logic in the primary constructor and you cannot do that because the primary constructor may be called by some
    other class.

    Note − Any number of secondary constructors can be created, however, all of those constructors should call
    the primary constructor directly or indirectly.
  */

class Human(val firstName: String, val lastName: String){

    val age = 16

    constructor(firstName: String, lastName: String, age: Int):this(firstName,lastName)
}