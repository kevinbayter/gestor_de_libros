package com.bibliotcary.books

import org.springframework.data.jpa.repository.JpaRepository

interface PrestamoRepository : JpaRepository<Prestamo, Long>
