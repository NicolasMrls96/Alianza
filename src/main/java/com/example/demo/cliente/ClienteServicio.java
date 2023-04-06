package com.example.demo.cliente;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteServicio {

    ClienteRepositorio clienteRepositorio;
    public ClienteServicio(ClienteRepositorio clienteRepositorio){
        this.clienteRepositorio= clienteRepositorio;
    }

    public Object crearCliente(Cliente cliente){
        return clienteRepositorio.save(cliente);
    }

    public Object buscarClientePorId(Integer idCliente) {
        return clienteRepositorio.findById(idCliente);
    }

    public List<Cliente> buscarClientePorNombre(String nombre) {
        return clienteRepositorio.buscarPorNombre(nombre);
    }

    public void borrarCliente(Integer idCliente) {
        clienteRepositorio.deleteById(idCliente);
    }
}