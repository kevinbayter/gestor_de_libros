package com.bibliotcary.books

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import jakarta.persistence.JoinColumn
import jakarta.persistence.JoinTable
import jakarta.persistence.ManyToMany

@Entity
data class Libro (
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long = 0,
    var titulo: String,
    @ManyToMany
    @JoinTable(
        name = "libro_autor",
        joinColumns = [JoinColumn(name = "libro_id")],
        inverseJoinColumns = [JoinColumn(name = "autor_id")]
    )
    var autores: List<Autor>,
    var ejemplares: Int
) {
    constructor() : this(0, "", emptyList(), 0)
}