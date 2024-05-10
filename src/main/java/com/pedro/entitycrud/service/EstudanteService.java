package com.pedro.entitycrud.service;

import com.pedro.entitycrud.model.Estudante;
import com.pedro.entitycrud.repository.EstudanteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EstudanteService {

    @Autowired
    private EstudanteRepository repository;


    public Estudante criarEstudante(Estudante estudante) {
        return repository.save(estudante);
    }
}
