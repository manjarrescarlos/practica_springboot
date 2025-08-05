package com.informaticonfig.spring.app1.springboot_apploications.controllers;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class EjemploController {

    @GetMapping("/detalles_info")
    public String info(Map<String, Object> model){
        model.put("Titulo", "servidor en linea");
        model.put("servidor", "informaticonfig");
        model.put("Ip", "1.0.0");
        return "detalles_info";
    }

}
