package com.pedro.crudWithHtml.service;

import com.pedro.crudWithHtml.exceptions.EstudanteNotFoundException;
import com.pedro.crudWithHtml.model.Estudante;
import com.pedro.crudWithHtml.repository.EstudanteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EstudanteService {

    @Autowired
    private EstudanteRepository repository;


    public Estudante criarEstudante(Estudante estudante) {
        return repository.save(estudante);
    }

    public List<Estudante> buscarEstudantes() {
        return repository.findAll();
    }

    public Estudante buscarPorId(Long id) throws EstudanteNotFoundException{
        Optional<Estudante> opt = repository.findById(id);
        if (opt.isPresent()) {
            return opt.get();
        }
        else {
            throw new EstudanteNotFoundException("ID não existe");
        }
    }

    public void apagarEstudante(Long id) throws EstudanteNotFoundException {
        Estudante estudante = buscarPorId(id);
        repository.delete(estudante);
    }
}
