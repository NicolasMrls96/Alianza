package com.example.demo.admin;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AdminRepositorio extends JpaRepository<Admin,Integer> {
    @Query(value= "SELECT * from Persona p where p.nombre=:nombre", nativeQuery = true)
    Object buscarPorNombre(@Param("nombre") String nombre);

}