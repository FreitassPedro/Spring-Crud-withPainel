package com.pedro.crudWithHtml.service;

import com.pedro.crudWithHtml.model.Estudante;
import com.pedro.crudWithHtml.repository.EstudanteRepository;
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
