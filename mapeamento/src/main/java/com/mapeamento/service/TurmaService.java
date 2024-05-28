package com.mapeamento.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.mapeamento.entities.Turma;
import com.mapeamento.repository.TurmaRepository;

@Service
public class TurmaService {
    private TurmaRepository turmaRepository;

	public TurmaService(TurmaRepository turmaRepository) {
        this.turmaRepository = turmaRepository;
    }

    public List<Turma> getAllTurmas() {
        return turmaRepository.findAll();
    }

    public Turma getTurmaById(Long id) {
        Optional<Turma> turma = turmaRepository.findById(id);
        return turma.orElse(null);
    }

    public Turma salvarTurma(Turma turma) {
        return turmaRepository.salvar(turma);
    }

    public Turma updateTurma(Long id, Turma updatedTurma) {
        Optional<Turma> existingTurma = turmaRepository.findById(id);
        if (existingTurma.isPresent()) {
            updatedTurma.setId(id);
            return turmaRepository.save(updatedTurma);
        }
        return null;
    }

    public boolean deleteTurma(Long id) {
        Optional<Turma> existingTurma = turmaRepository.findById(id);
        if (existingTurma.isPresent()) {
            turmaRepository.deleteById(id);
            return true;
        }
        return false;
    }
}

