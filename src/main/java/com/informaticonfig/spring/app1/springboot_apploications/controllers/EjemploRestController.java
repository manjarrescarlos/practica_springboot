package com.informaticonfig.spring.app1.springboot_apploications.controllers;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;
import java.util.HashMap;

@RestController
public class EjemploRestController {

    @GetMapping("/detalles_info2")
    public Map<String, Object> detalles_info2(){
        Map<String, Object> respuesta = new HashMap<>();
        respuesta.put("Titulo", "servidor en linea");
        respuesta.put("servidor", "informaticonfig");
        respuesta.put("Ip", "1.0.0");
        return respuesta;
    }

}
