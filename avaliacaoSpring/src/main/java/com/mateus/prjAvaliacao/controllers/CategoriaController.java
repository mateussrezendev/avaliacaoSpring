package com.mateus.prjAvaliacao.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mateus.prjAvaliacao.entities.Categoria;
import com.mateus.prjAvaliacao.services.CategoriaService;

@RestController
@RequestMapping("/categoria")

public class CategoriaController {
    private final CategoriaService categoriaService;

    public CategoriaController(CategoriaService categoriaService) {
        this.categoriaService = categoriaService;
    }

    @PostMapping
    public Categoria createProduct(@RequestBody Categoria categoria) {
        return categoriaService.saveCategoria(categoria);
    }

    @GetMapping("/{id}")
    public Categoria getCategoria(@PathVariable Long id) {
        return categoriaService.getCategoriaById(id);
    }

    @GetMapping
    public List<Categoria> getAllCategorias() {
        return categoriaService.getAllCategorias();
    }

    @DeleteMapping("/{id}")
    public void deleteCategoria(@PathVariable Long id) {
        categoriaService.deleteCategoria(id);
    }
}
