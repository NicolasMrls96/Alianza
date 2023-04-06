package com.example.demo.cliente;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ClienteRepositorio extends JpaRepository<Cliente, Integer> {

    @Query(value= "SELECT u from Persona u where u.nombre=:nombre")
    List<Cliente> buscarPorNombre(@Param("nombre") String nombre);
}
