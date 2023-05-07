package com.bibliotcary.books

import jakarta.persistence.*
import java.time.LocalDate

@Entity
data class Prestamo (
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long = 0,
    var fechaPrestamo: LocalDate,
    var fechaDevolucion: LocalDate,
    @ManyToOne
    var libro: Libro,
    @ManyToOne
    var usuario: Usuario
) {
    // Constructor sin argumentos
    constructor() : this(0, LocalDate.now(), LocalDate.now(), Libro(), Usuario())
}



