package com.mateus.prjAvaliacao.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.mateus.prjAvaliacao.entities.Autor;
import com.mateus.prjAvaliacao.repositories.AutorRepository;

@Service
public class AutorService {
    private final AutorRepository autorRepository;

    public AutorService(AutorRepository autorRepository) {
        this.autorRepository = autorRepository;
    }

    public Autor saveAutor(Autor autor) {
        return autorRepository.save(autor);
    }

    public Autor getAutorById(Long id) {
        return autorRepository.findById(id).orElse(null);
    }

    public List<Autor> getAllAutors() {
        return autorRepository.findAll();
    }

    public void deleteAutor(Long id) {
        autorRepository.deleteById(id);
    }
}