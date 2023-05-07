package com.bibliotcary.books.controller

import com.bibliotcary.books.Usuario
import com.bibliotcary.books.Repository.UsuarioRepository
import org.springframework.web.bind.annotation.DeleteMapping
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.PutMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/usuarios")
class UsuarioController(private val usuarioRepository: UsuarioRepository) {

    @GetMapping("/getusers")
    fun obtenerUsuarios(): List<Usuario> {
        return usuarioRepository.findAll()
    }

    @GetMapping("/{id}")
    fun obtenerUsuarioPorId(@PathVariable id: Long): Usuario {
        return usuarioRepository.findById(id).orElseThrow { NoSuchElementException() }
    }

    @PostMapping("/add")
    fun agregarUsuario(@RequestBody usuario: Usuario): Usuario {
        return usuarioRepository.save(usuario)
    }

    @PutMapping("/{id}")
    fun actualizarUsuario(@PathVariable id: Long, @RequestBody usuario: Usuario): Usuario {
        val usuarioExistente = usuarioRepository.findById(id).orElseThrow { NoSuchElementException() }
        usuarioExistente.nombre = usuario.nombre
        usuarioExistente.apellido = usuario.apellido
        usuarioExistente.maxLibrosPrestados = usuario.maxLibrosPrestados
        return usuarioRepository.save(usuarioExistente)
    }

    @DeleteMapping("/{id}")
    fun eliminarUsuario(@PathVariable id: Long) {
        usuarioRepository.deleteById(id)
    }
}
