package com.miguel.cursospringboot.controllers;

import com.miguel.cursospringboot.models.Equipo;
import com.miguel.cursospringboot.models.Jugador;
import com.miguel.cursospringboot.services.EquipoService;
import com.miguel.cursospringboot.services.IService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;


import java.util.Optional;


@Controller
public class ParametrosController {
//     @Autowired
    private IService equipoService;
    public ParametrosController(@Qualifier("equipoEspaña") IService equipoService) {
        this.equipoService=equipoService;
    }

    @GetMapping(value = "parametros")

    public String parametros(@RequestParam(defaultValue = "hola que tal") String valor, @RequestParam(defaultValue = "18") String edad, Model model) {
        System.out.println(valor);
        model.addAttribute("valor", valor);
        model.addAttribute("edad", edad);
        return "parametros";
    }

    @GetMapping("equipos/{nombreEquipo}/{numero}")
    public String parametrosPorPath(@PathVariable String nombreEquipo, @PathVariable("numero") Integer numero, Model model) {
        Optional<Equipo> equipoOptional = equipoService.getEquipos().stream().filter(equipo -> nombreEquipo.toLowerCase().equals(equipo.getNombre().toLowerCase())).findFirst();
        if (equipoOptional.isPresent()) {
            Optional<Jugador> jugadorOptional = equipoOptional.get().getPlantilla().stream().filter(jugador -> numero == jugador.getNumeroEquipo()).findFirst();
            if (jugadorOptional.isPresent()) {
                System.out.println("jugador" + jugadorOptional.get().getNombre());
                model.addAttribute("jugador", jugadorOptional.get());

            }
        }
        return "parametros";

    }


}
