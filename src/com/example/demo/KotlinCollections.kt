package com.example.demo


/*
   Chapter 4: Kotlin Collections
   Language: Kotlin
   @author: Ganesh Tikone
 */

fun main(args: Array<String>) {


    // Let's learn about collection

    val numbers = listOf<Int>(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,0,-4,1)   // Kind of List from Java

    // Collections with different functions

    // 1. Iteration

    numbers.forEach {
        print("$it, ")
    }


    // Let's filter odd number and print only even
    println("\n\nOperator: filter")
    numbers.filter { it%2 == 0 }
            .forEach { print("$it, ")  }


    println("\n\nOperator: filter , any")
    val data = numbers.filter { it%2 == 0 }
            .any { it >= 10 }

    println("Result : $data")

    println("\n\nOperator: filter , count")
    val result = numbers.count { it%2 == 1 }
    println("Result : $result")


    println("\n\nOperator: max ")
    println("Max : "+ numbers.max())

    println("\n\nOperator: min ")
    println("Min : "+ numbers.min())

    println("\n\nOperator: minBy ")
    println("MinBY : "+ numbers.minBy { -it })

    println("\n\nOperator: drop n elements ")
    println("Drop : "+ numbers.drop(4))

    println("\n\nOperator: filterNot ")
    println("filterNot : "+ numbers.filterNot { it%2==0 })

    // Return list of elements at specific indices
    println("\n\nOperator: slice ")
    println("slice : "+ numbers.slice(listOf(1,6,10)))

    println("\n\nOperator: takeLast ")
    println("takeLast : "+ numbers.takeLast(3))


    /*
         #flatMap
         Iterates over the elements creating a new collection for each one,
         and finally flattens all the collections into a unique list containing all the elements.
     */

    println("\n\nOperator: flatMap ")
    println("flatMap : "+ numbers.flatMap { listOf(it,it+1) })

    /*
        #groupBy
        Returns a map of the elements in original collection grouped by the result of given function
     */
    println("\n\nOperator: groupBy ")
    println("groupBy : "+ numbers.groupBy { if (it % 2 == 0) "even" else "odd" })


    /*
       #map
       Returns a list containing the results of applying the given transform function
       to each element of the original collection.
     */

    println("\n\nOperator: map ")
    println("map : "+ numbers.map { it*2 })


    println("\n\ncontains ")
    println("contains : "+ numbers.contains(12) )


    println("\n\nelementAtOrElse ")
    println("elementAtOrElse : "+ numbers.elementAtOrElse(10, { 2 * it }))

    /**
     * #first
     * Returns the first element matching the given predicate
     */
    println("\n\nfirst ")
    println("first : "+ numbers.first{ it > -8 })


    /**
     * #last
     * Returns the last element matching the given predicate
     */
    println("\n\nlast ")
    println("last : "+ numbers.last{ it > 10 })

    /**
     * #singleOrNull
     * Returns the single element matching the given predicate,
     * or null if element was not found or more than one element was found.
     */
    println("\n\nsingleOrNull ")
    println("singleOrNull : "+ numbers.singleOrNull{ it % 7 == 0 })


    /**
     * #partition
     * Splits original collection into pair of collections, where the first collection contains elements
     * for which the predicate returned true, while the second collection contains elements
     * for which the predicate returned false.
     */
    println("\n\npartition ")
    println("partition : "+ numbers.partition{ it % 2 == 0 })

    println("\n\nSort ")
    println("reversed : "+ numbers.reversed())
    println("sorted : "+ numbers.sorted())
    println("Sort By : "+ numbers.sortedBy { it % 3 == 0 })
    println("Sorted Descending : "+ numbers.sortedDescending())
}