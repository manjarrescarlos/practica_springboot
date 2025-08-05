package com.informaticonfig.spring.app1.springboot_apploications.controllers;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;
import java.util.HashMap;
import com.informaticonfig.spring.models.Empleados;

@RestController
@RequestMapping("/api")
public class EjemploRestController {

    @GetMapping(path = "/detalles_info2")

    public Map<String, Object> detalles_info2(){
        Empleados empleado1= new Empleados("Juan", "Pérez", "Calle Falsa 123", "Desarrollador", 30, 123456789, 1);

        Map<String, Object> respuesta = new HashMap<>();
        respuesta.put("Empleado", empleado1);
        return respuesta;
    }

}
