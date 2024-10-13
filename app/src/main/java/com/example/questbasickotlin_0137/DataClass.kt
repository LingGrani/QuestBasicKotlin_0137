package com.example.questbasickotlin_0137

data class Dataclass(
    val id: Int,
    var email: String
)

fun main() {
    val data = Dataclass(1, "indra@gmail.com")
    println(data)

    //equal function
    val data2 = Dataclass(1,"makan@gmail.com")
    println(data == data2)

    //copy function
    val data3 = data.copy()
    println(data3)

    //copy with change
    val data4 = data.copy(email = "sahar@gmail.com")
    println(data4)
}