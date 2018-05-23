package com.example.demo


/*
   Chapter 6: Class and Objects
   Language: Kotlin
   @author: Ganesh Tikone
 */


fun main(args: Array<String>) {

    // Object of user class
    val me = User()
    me.printUser()
    me.age = 17
    //println(User.Nested().foo())
    me.age = 25
    println(me.age)

}


class User {

    // Properties (Data Member)
    private var firstName:String = "Ganesh"

    private var lastname:String = "Tikone"

    var age:Int = 21
    set(value) {
        if (value < 18){
            println("Non Voter")
        }else{
            println("Voter")
            field = value
        }
    }

    // Member function

    // fun keyword represents function
    // printUser() represents function name
    // Unit represents return type - Void in Java

    fun printUser():Unit{
        println("User: $firstName $lastname")
    }

    // Nested Class

//    class Nested {
//        fun foo() = "Hello Android SIG"
//    }



}

