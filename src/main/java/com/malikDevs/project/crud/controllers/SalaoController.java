package com.malikDevs.project.crud.controllers;

import com.malikDevs.project.crud.model.Agendamento;
import com.malikDevs.project.crud.service.AgendamentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/agendamentos")
public class SalaoController {

    @Autowired
    private AgendamentoService agendamentoService;

    @GetMapping("/novo")
    public String exibirFormulario(Model model) {
        model.addAttribute("agendamento", new Agendamento());
        return "agendamento-form";
    }




    }









