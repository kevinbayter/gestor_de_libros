package com.bibliotcary.books

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import jakarta.persistence.ManyToMany

@Entity
data class Autor (
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long = 0,
    var nombre: String,
    var apellido: String,
    @ManyToMany(mappedBy = "autores")
    var libros: List<Libro>
) {
    constructor() : this(0, "", "", emptyList())
}
