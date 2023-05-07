package com.bibliotcary.books

import jakarta.persistence.*
import java.time.LocalDate

@Entity
data class Prestamo (
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long = 0,
    val fechaPrestamo: LocalDate,
    val fechaDevolucion: LocalDate,
    @ManyToOne
    val libro: Libro,
    @ManyToOne
    val usuario: Usuario
) {
    // Constructor sin argumentos
    constructor() : this(0, LocalDate.now(), LocalDate.now(), Libro(), Usuario())
}



