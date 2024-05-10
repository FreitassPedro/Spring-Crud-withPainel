package com.pedro.crudWithHtml.controller;

import com.pedro.crudWithHtml.model.Estudante;
import com.pedro.crudWithHtml.service.EstudanteService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class EstudanteController {

    @Autowired
    private EstudanteService estudanteService;

    @GetMapping("/")
    public String listarEstudantes() {
        return "/lista-estudantes";
    }

    @GetMapping("/novo")
    public String novoEstudante(Model model) {
        Estudante estudante = new Estudante();
        model.addAttribute("novoEstudante", estudante);
        return "/novo-estudante";
    }

    @PostMapping("/gravar")
    public String salvarEstudante(
            @ModelAttribute("novoEstudante") @Valid Estudante estudante,
            BindingResult erros,
            RedirectAttributes attributes) {

        if (!erros.hasErrors()) {
            estudanteService.criarEstudante(estudante);

            attributes.addFlashAttribute("mensagem", "Estudante salvo com sucesso!");
            return "redirect:/novo";
        }
        return "/novo-estudante";

    }
}
