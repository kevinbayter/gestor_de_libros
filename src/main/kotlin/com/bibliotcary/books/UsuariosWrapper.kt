package com.bibliotcary.books

data class UsuariosWrapper(
    val usuarios: List<Usuario>
) {
    constructor() : this(emptyList())
}

