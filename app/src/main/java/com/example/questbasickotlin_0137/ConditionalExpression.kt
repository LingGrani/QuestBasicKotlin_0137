package com.example.questbasickotlin_0137

import android.util.Printer

fun ConditionalStatement() {
    println("=== Conditional Expression ===")

    //if-else
    val number = 10
    if (number > 0) {
        println("Positive Number")
    }
    else {
        println("Negative Number")
    }

    //when
    val day = 1
    when (day) {
        1 -> println("Sunday")
        1 -> println("Monday")
        1 -> println("Tuesday")
        1 -> println("Wednesday")
        1 -> println("Thursday")
        1 -> println("Friday")
        1 -> println("Saturday")
        else -> println("Invalid Day")
    }

    //try-catch
    val value = "10"
    try {
        val result = value.toInt()
        println("result: $result")
    } catch (e: NumberFormatException) {
        println("Invalid Number")
    }
}

fun Perulangan() {
    println()
    println("=== Perulangan ===")

    for (i in 1..5) {
        println("Perulangan ke-$i")
    }
    val cars = listOf("BMW", "Toyota", "Honda", "Audi")
    for (car in cars) {
        println("Car type $car")
    }
    var x = 1
    while (x <= 5) {
        println("Perulangan ke-$x")
        x++
    }
    var y = 1
    do {
        println("Perulangan ke-$y")
        y++
    } while (y <= 5)
}

fun main() {
    ConditionalStatement()
    Perulangan()
}