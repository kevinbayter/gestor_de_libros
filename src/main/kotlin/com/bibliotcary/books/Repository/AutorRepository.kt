package com.bibliotcary.books.Repository

import com.bibliotcary.books.Autor
import org.springframework.data.jpa.repository.JpaRepository

interface AutorRepository : JpaRepository<Autor, Long>