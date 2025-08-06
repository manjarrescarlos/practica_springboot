package com.informaticonfig.spring.app1.springboot_apploications.controllers;



import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.informaticonfig.spring.models.Empleados;
@Controller
public class EjemploController {

    @GetMapping("/detalles_info")

    public String info(Model model){
        Empleados empleado1= new Empleados("carlos", "manjarres", null, "Desarrollador", 30, 123456789, 1);
        
        model.addAttribute("Empleado", empleado1);
        return "detalles_info";
    }

    @ModelAttribute("ListaEmpleados")
    public List<Empleados> ListaEmpleados(){
        return Arrays.asList(
            new Empleados("Carlos", "Manjarres", "Calle 123", "Desarrollador", 30, 123456789, 1),
            new Empleados("Ana", "Gomez", "Avenida 456", "Gerente", 35, 987654321, 2),
            new Empleados("Luis", "Perez", "Carrera 789", "Analista", 28, 456789123, 3)
        );
    }

}
