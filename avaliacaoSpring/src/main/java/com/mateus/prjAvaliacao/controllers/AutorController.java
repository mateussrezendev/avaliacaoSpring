package com.mateus.prjAvaliacao.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mateus.prjAvaliacao.entities.Autor;
import com.mateus.prjAvaliacao.services.AutorService;

@RestController
@RequestMapping("/autor")

public class AutorController {
    private final AutorService autorService;

    public AutorController(AutorService autorService) {
        this.autorService = autorService;
    }

    @PostMapping
    public Autor createProduct(@RequestBody Autor autor) {
        return autorService.saveAutor(autor);
    }

    @GetMapping("/{id}")
    public Autor getAutor(@PathVariable Long id) {
        return autorService.getAutorById(id);
    }

    @GetMapping
    public List<Autor> getAllAutors() {
        return autorService.getAllAutors();
    }

    @DeleteMapping("/{id}")
    public void deleteAutor(@PathVariable Long id) {
        autorService.deleteAutor(id);
    }
}
