package com.example.demo.controladores;

import com.example.demo.cliente.Cliente;
import com.example.demo.servicios.Servicios;
import com.example.demo.servicios.ServiciosServicio;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
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

    @GetMapping("/nombre/{nombre}")
    public List<Servicios> buscarServiciosPorNombre(@PathVariable String nombre){
        return serviciosServicio.buscarServiciosPorNombre(nombre);
    }
}
