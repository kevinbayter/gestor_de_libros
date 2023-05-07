package com.bibliotcary.books.Repository

import com.bibliotcary.books.Prestamo
import org.springframework.data.jpa.repository.JpaRepository

interface PrestamoRepository : JpaRepository<Prestamo, Long>
