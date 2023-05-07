package com.bibliotcary.books

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id


@Entity
data class Usuario(
    @Id
    var id: Long = 0,
    var nombre: String,
    var apellido: String,
    var maxLibrosPrestados: Int
) {
    constructor() : this(0,"","",0)
}
