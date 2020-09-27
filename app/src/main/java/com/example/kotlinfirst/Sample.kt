package com.example.kotlinfirst

fun main() {
    helloWorld()
    var c = helloWorld2(2)
    println("Hello World ${c}")
}


// 리턴값이 없을때는 Unit이나 안붙여도 됨
fun helloWorld() : Unit {
    println("First Line Print")
}


//var는 variable / val은 value로 val은 최초에 할당된 값을 변경할 수 없음
fun helloWorld2(b : Int) : Int {
    val a : Int = 10
    return a+b

}