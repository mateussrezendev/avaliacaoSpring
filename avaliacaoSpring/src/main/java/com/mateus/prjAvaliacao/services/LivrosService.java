package com.mateus.prjAvaliacao.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.mateus.prjAvaliacao.entities.Livros;
import com.mateus.prjAvaliacao.repositories.LivrosRepository;

@Service
public class LivrosService {
    private final LivrosRepository livrosRepository;

    public LivrosService(LivrosRepository livrosRepository) {
        this.livrosRepository = livrosRepository;
    }

    public Livros saveLivros(Livros livros) {
        return livrosRepository.save(livros);
    }

    public Livros getLivrosById(Long id) {
        return livrosRepository.findById(id).orElse(null);
    }

    public List<Livros> getAllLivross() {
        return livrosRepository.findAll();
    }

    public void deleteLivros(Long id) {
        livrosRepository.deleteById(id);
    }
}