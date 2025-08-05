package com.informaticonfig.spring.app1.springboot_apploications.controllers;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;
import java.util.HashMap;
import com.informaticonfig.spring.models.Empleados;

import com.informaticonfig.spring.models.dto.ClaseDto;

@RestController
@RequestMapping("/api")
public class EjemploRestController {

    @GetMapping(path = "/detalles_info2")
    public ClaseDto detalles_info2() {
        ClaseDto usuario1 = new ClaseDto();
        usuario1.setTitulo("administrador");
        usuario1.setUsuario("Juan Pérez");
        return usuario1;
    }

}
