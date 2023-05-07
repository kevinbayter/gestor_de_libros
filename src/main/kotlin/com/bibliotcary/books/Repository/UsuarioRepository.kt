package com.bibliotcary.books.Repository

import com.bibliotcary.books.Usuario
import org.springframework.data.jpa.repository.JpaRepository

interface UsuarioRepository : JpaRepository<Usuario, Long>
