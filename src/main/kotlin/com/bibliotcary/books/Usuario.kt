package com.bibliotcary.books

import jakarta.persistence.Entity
import jakarta.persistence.Id


@Entity
data class Usuario(
    @Id val id: Long,
    var nombre: String,
    var apellido: String,
    var maxLibrosPrestados: Int
) {
    constructor() : this(0,"","",0)
}
