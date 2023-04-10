package com.example.demo.admin;

import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class AdminServicio {
    AdminRepositorio adminRepositorio;

    public AdminServicio(AdminRepositorio adminRepositorio) {
        this.adminRepositorio = adminRepositorio;
    }

    public Object crearAdmin(Admin admin){
        return adminRepositorio.save(admin);

    }

    public Object buscarAdminPorId(Integer idAdmin){
        return adminRepositorio.findById(idAdmin);
    }

    public Object buscarAdminPorNombre(String nombre){
        return adminRepositorio.buscarPorNombre(nombre);
    }

    public void borrarAdmin(Integer idAdmin){
        adminRepositorio.deleteById(idAdmin);
    }

}
