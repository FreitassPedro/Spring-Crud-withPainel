package com.pedro.entitycrud.repository;

import com.pedro.entitycrud.model.Estudante;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EstudanteRepository extends JpaRepository<Estudante, Long> {
}
