package com.bibliotcary.books.Repository

import com.bibliotcary.books.Libro
import org.springframework.data.jpa.repository.JpaRepository

interface LibroRepository : JpaRepository<Libro, Long>
