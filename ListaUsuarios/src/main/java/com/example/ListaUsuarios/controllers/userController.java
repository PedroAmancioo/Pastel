package com.example.ListaUsuarios.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class userController {

    @GetMapping("/")
    public String index(
            @RequestParam(value = "nome", required = false, defaultValue = "") String nome,
            Model model) {

        model.addAttribute("nome", nome);

        return "index";
    }
}
