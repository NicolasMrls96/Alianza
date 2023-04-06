package com.example.demo.controladores;

import com.example.demo.admin.Admin;
import com.example.demo.admin.AdminServicio;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/admin")
public class ControladorAdmin {

    AdminServicio adminServicio;
    public ControladorAdmin(AdminServicio adminServicio){
        this.adminServicio=adminServicio;
    }

    List<Admin> personas = new ArrayList<>();

    @PostMapping("/guardar-admin")
    public Object guardarAdmin(@RequestBody Admin admin){

        return adminServicio.crearAdmin(admin);
    }

    @GetMapping("/{id}")
    public Object buscarAdmin(@PathVariable Integer id){

        return adminServicio.buscarAdminPorId(id);
    }

    @GetMapping("/nombre/{nombre}")
    public List<Admin> buscarAdminPorNombre(@PathVariable String nombre){
        return adminServicio.buscarAdminPorNombre(nombre);
    }

    @DeleteMapping("/borrar/{id}")
    public void borrarAdmin(@PathVariable Integer id){
        adminServicio.borrarAdmin(id);
    }

}
