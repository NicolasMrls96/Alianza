package com.example.demo.servicios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface ServiciosRepositorio extends JpaRepository <Servicios, Integer> {
    @Query(value = "Select * from servicios s where s.nombre =: nombreServicio" , nativeQuery = true)
    List<Servicios> buscarPorNombre(@Param("nombreServicio") String nombreServicio);

}
