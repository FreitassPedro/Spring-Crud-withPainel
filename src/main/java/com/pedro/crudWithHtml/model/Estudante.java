package com.pedro.crudWithHtml.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "estudantes")
@Getter @Setter
public class Estudante {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank @Size(min = 2, message = "Nome mínimo 2 caracteres")
    private String nome;
    @Min(value = 18, message = "O aluno deve ter no mínimo 18 anos")
    private int idade;


}
