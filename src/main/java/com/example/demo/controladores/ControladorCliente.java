package com.example.demo.controladores;

import com.example.demo.cliente.Cliente;
import com.example.demo.cliente.ClienteServicio;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/cliente")
public class ControladorCliente {

    ClienteServicio clienteServicio;
    public ControladorCliente(ClienteServicio clienteServicio){
        this.clienteServicio=clienteServicio;
    }

    List<Cliente> personas = new ArrayList<>();

    @CrossOrigin
    @PostMapping("/guardar-cliente")
    public Object guardarCliente(@RequestBody Cliente cliente){

        return clienteServicio.crearCliente(cliente);
    }

    @GetMapping("/{id}")
    public Object buscarCliente(@PathVariable Integer id){

        return clienteServicio.buscarClientePorId(id);
    }

    @GetMapping("/nombre/{nombre}")
    public List<Cliente> buscarClientePorNombre(@PathVariable String nombre){
        return clienteServicio.buscarClientePorNombre(nombre);
    }

    @DeleteMapping("/borrar/{id}")
    public void borrarCliente(@PathVariable Integer id){
        clienteServicio.borrarCliente(id);
    }

}
