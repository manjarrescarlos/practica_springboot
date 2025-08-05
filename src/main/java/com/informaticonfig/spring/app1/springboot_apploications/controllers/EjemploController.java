package com.informaticonfig.spring.app1.springboot_apploications.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class EjemploController {

    @GetMapping("/detalles_info")
    public String info(Model model){
        model.addAttribute("Titulo", "servidor en linea");
        model.addAttribute("servidor", "informaticonfig");
        model.addAttribute("Ip", "1.0.0");
        return "detalles_info";
    }

}
