package com.bibliotcary.books.controller

import com.bibliotcary.books.Prestamo
import com.bibliotcary.books.Repository.PrestamoRepository
import org.springframework.web.bind.annotation.DeleteMapping
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.PutMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import java.time.LocalDate

@RestController
@RequestMapping("/prestamos")
class PrestamoController(private val prestamoRepository: PrestamoRepository) {

    @GetMapping("/getloans")
    fun obtenerPrestamos(): List<Prestamo> {
        return prestamoRepository.findAll()
    }

    @GetMapping("/{id}")
    fun obtenerPrestamoPorId(@PathVariable id: Long): Prestamo {
        return prestamoRepository.findById(id).orElseThrow { NoSuchElementException() }
    }

    @PostMapping("/add")
    fun agregarPrestamo(@RequestBody prestamo: Prestamo): Prestamo {
        return prestamoRepository.save(prestamo)
    }

    @PostMapping("/return/{id}")
    fun devolverPrestamo(@PathVariable id: Long): Prestamo {
        val prestamoExistente = prestamoRepository.findById(id).orElseThrow { NoSuchElementException() }
        prestamoExistente.fechaDevolucion = LocalDate.now()
        return prestamoRepository.save(prestamoExistente)
    }

    @PutMapping("/{id}")
    fun actualizarPrestamo(@PathVariable id: Long, @RequestBody prestamo: Prestamo): Prestamo {
        val prestamoExistente = prestamoRepository.findById(id).orElseThrow { NoSuchElementException() }
        prestamoExistente.fechaPrestamo = prestamo.fechaPrestamo
        prestamoExistente.fechaDevolucion = prestamo.fechaDevolucion
        prestamoExistente.libro = prestamo.libro
        prestamoExistente.usuario = prestamo.usuario
        return prestamoRepository.save(prestamoExistente)
    }

    @DeleteMapping("/{id}")
    fun eliminarPrestamo(@PathVariable id: Long) {
        prestamoRepository.deleteById(id)
    }
}
