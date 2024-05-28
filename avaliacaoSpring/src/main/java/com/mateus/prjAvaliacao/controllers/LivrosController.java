package com.mateus.prjAvaliacao.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mateus.prjAvaliacao.entities.Livros;
import com.mateus.prjAvaliacao.services.LivrosService;

@RestController
@RequestMapping("/livros")

public class LivrosController {
    private final LivrosService livrosService;

    public LivrosController(LivrosService livrosService) {
        this.livrosService = livrosService;
    }

    @PostMapping
    public Livros createProduct(@RequestBody Livros livros) {
        return livrosService.saveLivros(livros);
    }

    @GetMapping("/{id}")
    public Livros getLivros(@PathVariable Long id) {
        return livrosService.getLivrosById(id);
    }

    @GetMapping
    public List<Livros> getAllLivross() {
        return livrosService.getAllLivross();
    }

    @DeleteMapping("/{id}")
    public void deleteLivros(@PathVariable Long id) {
        livrosService.deleteLivros(id);
    }
}
