package com.pedro.crudWithHtml.repository;

import com.pedro.crudWithHtml.model.Estudante;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EstudanteRepository extends JpaRepository<Estudante, Long> {
}
