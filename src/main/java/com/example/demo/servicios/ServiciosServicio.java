package com.example.demo.servicios;

import com.example.demo.cliente.Cliente;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiciosServicio {

    ServiciosRepositorio serviciosRepositorio;
    public ServiciosServicio(ServiciosRepositorio serviciosRepositorio){
        this.serviciosRepositorio = serviciosRepositorio;
    }

    public List<Servicios> buscarServiciosPorNombre(String nombre) {
        return serviciosRepositorio.buscarPorNombre(nombre);
    }

    public Object crearServicios(Servicios servicios){
        return serviciosRepositorio.save(servicios);
    }
}