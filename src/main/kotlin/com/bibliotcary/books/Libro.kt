package com.bibliotcary.books

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id

@Entity
data class Libro (
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long = 0,
    var titulo: String,
    var autor: String,
    var ejemplares: Int
) {
    constructor() : this(0, "", "",0)
}