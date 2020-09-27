package com.example.kotlinfirst

fun main() {
    helloWorld()
    var c = helloWorld2(2)
    println("Hello World ${c}")
}

fun helloWorld() : Unit {
    println("First Line Print")
}

fun helloWorld2(b : Int) : Int {
    val a : Int = 10
    return a+b

}