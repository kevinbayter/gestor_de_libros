package com.bibliotcary.books.controller

import com.bibliotcary.books.Autor
import com.bibliotcary.books.Repository.AutorRepository
import org.springframework.web.bind.annotation.DeleteMapping
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.PutMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/autor")
class AutorController(private val autorRepository: AutorRepository) {

    @GetMapping("/getautores")
    fun obtenerAutores(): List<Autor> {
        return autorRepository.findAll()
    }

    @GetMapping("/{id}")
    fun obtenerAutorPorId(id: Long): Autor {
        return autorRepository.findById(id).orElseThrow { NoSuchElementException() }
    }

    @PostMapping("/add")
    fun agregarAutor(autor: Autor): Autor {
        return autorRepository.save(autor)
    }

    @PutMapping("/{id}")
    fun actualizarAutor(id: Long, autor: Autor): Autor {
        val autorExistente = autorRepository.findById(id).orElseThrow { NoSuchElementException() }
        autorExistente.nombre = autor.nombre
        autorExistente.apellido = autor.apellido
        return autorRepository.save(autorExistente)
    }

    @DeleteMapping("/{id}")
    fun eliminarAutor(id: Long) {
        autorRepository.deleteById(id)
    }
}