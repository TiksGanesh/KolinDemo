package com.example.demo

/*
   Chapter 9: Kotlin Extension and Lambda
   Language: Kotlin
   @author: Ganesh Tikone
 */


class Student {

    var skills : String = "null"

    fun printSkills(){
        println("Skills: $skills")
    }
}


fun main(args: Array<String>) {

    // Student class
    val student = Student()
    student.skills = "Java"
    //student.printSkills()

    // extension function

    val studentOne = Student()
    studentOne.skills = "MYSQL"
    //studentOne.printSkills()

    val me = Student()
    me.skills = student.addSkills(studentOne)
    me.printSkills()

    // Int Extension
    val randomInt = 12
    val square = 2

    println(randomInt.raiseTo(square))



}

/*
    # EXTENSION Function

    Using extension, we will be able to add or remove some method functionality even
    without inheriting or modifying them. Extensions are resolved statistically.
    It does not actually modify the existing class, but it creates a callable function
    that can be called with a dot operation.
 */


fun Student.addSkills(student: Student):String {
    val temporaryStudent = Student()
    temporaryStudent.skills = this.skills + " " + student.skills
    return temporaryStudent.skills
}

/**
 * Kotlin Int function has no support of calculate power of number
 * Added extension function to Int
 */
fun Int.raiseTo(number: Int):Int{

    var result:Int = 1

    repeat(number){
        result *= this
    }
    return result
}


