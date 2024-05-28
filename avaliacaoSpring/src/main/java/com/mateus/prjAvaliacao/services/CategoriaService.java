package com.mateus.prjAvaliacao.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.mateus.prjAvaliacao.entities.Categoria;
import com.mateus.prjAvaliacao.repositories.CategoriaRepository;

@Service
public class CategoriaService {
    private final CategoriaRepository categoriaRepository;

    public CategoriaService(CategoriaRepository categoriaRepository) {
        this.categoriaRepository = categoriaRepository;
    }

    public Categoria saveCategoria(Categoria categoria) {
        return categoriaRepository.save(categoria);
    }

    public Categoria getCategoriaById(Long id) {
        return categoriaRepository.findById(id).orElse(null);
    }

    public List<Categoria> getAllCategorias() {
        return categoriaRepository.findAll();
    }

    public void deleteCategoria(Long id) {
        categoriaRepository.deleteById(id);
    }
}