package com.bibliotcary.books

import jakarta.persistence.Entity
import jakarta.persistence.Id


@Entity
data class Usuario(
    @Id val id: Long,
    val nombre: String,
    val apellido: String,
    val maxLibrosPrestados: Int
) {
    constructor() : this(0,"","",0)
}
