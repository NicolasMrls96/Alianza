package com.example.demo.controladores;

import com.example.demo.servicios.Servicios;
import com.example.demo.servicios.ServiciosServicio;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/servicios")
public class ControladorServicios {

    ServiciosServicio serviciosServicio;

    public ControladorServicios(ServiciosServicio serviciosServicio){
        this.serviciosServicio = serviciosServicio;
    }
    @PostMapping("/crear")
    public Object crearServicios(@RequestBody Servicios servicios){
        return serviciosServicio.crearServicios(servicios);
    }
}
