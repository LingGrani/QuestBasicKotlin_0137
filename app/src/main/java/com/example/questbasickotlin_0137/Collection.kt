package com.example.questbasickotlin_0137

fun main() {
    contohList()
}

fun contohList() {
    println("=== List ===")

    // List Read-only
    val readOnlyAbjad = listOf("A", "B", "C")
    println(readOnlyAbjad)

    // Mutable list
    val shape: MutableList<String> = mutableListOf("Circle", "Square", "Triangle")
    println(shape)

    // Menambahkan data ke dalam List mutable
    shape.add("Circle")
    println(shape)

    // Menghapus data dari list mutable
    shape.remove("Triangle")
    println(shape)

    // Mengubah data di dalam List Mutable
    shape[0] = "Oval"
    println(shape)
}
