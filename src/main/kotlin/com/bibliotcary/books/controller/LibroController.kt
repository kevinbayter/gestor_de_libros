package com.bibliotcary.books.controller

import com.bibliotcary.books.Libro
import com.bibliotcary.books.LibroRepository
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/libros")
class LibroController(private val libroRepository: LibroRepository) {

    @GetMapping
    fun obtenerLibros(): List<Libro> {
        return libroRepository.findAll()
    }

    @GetMapping("/{id}")
    fun obtenerLibroPorId(@PathVariable id: Long): Libro {
        return libroRepository.findById(id).orElseThrow { NoSuchElementException() }
    }

    @PostMapping
    fun agregarLibro(@RequestBody libro: Libro): Libro {
        return libroRepository.save(libro)
    }

    @PutMapping("/{id}")
    fun actualizarLibro(@PathVariable id: Long, @RequestBody libro: Libro): Libro {
        val libroExistente = libroRepository.findById(id).orElseThrow { NoSuchElementException() }
        libroExistente.titulo = libro.titulo
        libroExistente.autor = libro.autor
        libroExistente.ejemplares = libro.ejemplares
        return libroRepository.save(libroExistente)
    }

    @DeleteMapping("/{id}")
    fun eliminarLibro(@PathVariable id: Long) {
        libroRepository.deleteById(id)
    }
}
