package com.bibliotcary.books

import org.springframework.data.jpa.repository.JpaRepository

interface LibroRepository : JpaRepository<Libro, Long>
