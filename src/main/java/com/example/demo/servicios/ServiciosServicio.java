package com.example.demo.servicios;

import org.springframework.stereotype.Service;

@Service
public class ServiciosServicio {

    ServiciosRepositorio serviciosRepositorio;
    public ServiciosServicio(ServiciosServicio serviciosServicio){
        this.serviciosRepositorio = serviciosRepositorio;
    }

    public Object crearServicios(Servicios servicios){
        return serviciosRepositorio.save(servicios);
    }
}