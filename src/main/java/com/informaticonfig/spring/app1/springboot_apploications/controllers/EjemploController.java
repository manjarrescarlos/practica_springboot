package com.informaticonfig.spring.app1.springboot_apploications.controllers;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import com.informaticonfig.spring.models.Empleados;
@Controller
public class EjemploController {

    @GetMapping("/detalles_info")

    public String info(Model model){
        Empleados empleado1= new Empleados("carlos", "manjarres", "Calle Falsa 123", "Desarrollador", 30, 123456789, 1);
        
        model.addAttribute("Empleado", empleado1);
        return "detalles_info";
    }

}
