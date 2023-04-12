package com.example.demo.controladores;

import com.example.demo.admin.Admin;
import com.example.demo.admin.AdminServicio;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
@CrossOrigin
@RestController
@RequestMapping("/admin")
public class ControladorAdmin {

    AdminServicio adminServicio;
    public ControladorAdmin(AdminServicio adminServicio){
        this.adminServicio=adminServicio;
    }

    /*@PostMapping("/registrar")
    public Object save(@RequestBody Admin admin) {
        return adminServicio.crearAdmin(admin);
    }*/

    @GetMapping("/login/{documento}")
    public Object getCredencial (@PathVariable Integer documento) {
        return adminServicio.getLogin(documento);
    }

   @PostMapping("/guardar-admin")
    public Object guardarAdmin(@RequestBody Admin admin){

        return adminServicio.crearAdmin(admin);
    }

    @GetMapping("/{id}")
    public Object buscarAdmin(@PathVariable Integer id){
        return adminServicio.buscarAdminPorId(id);
    }

    @GetMapping("/nombre/{nombre}")
    public Object buscarAdminPorNombre(@PathVariable String nombre){
        return adminServicio.buscarAdminPorNombre(nombre);
    }

    @DeleteMapping("/borrar/{id}")
    public void borrarAdmin(@PathVariable Integer id){
        adminServicio.borrarAdmin(id);
    }

}
