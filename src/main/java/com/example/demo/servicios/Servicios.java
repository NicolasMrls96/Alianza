package com.example.demo.servicios;

import com.example.demo.admin.Admin;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@Entity(name = "servicios")
@NoArgsConstructor
@AllArgsConstructor
public class Servicios {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IdServicio")
    private Integer idServicio;

    @Column(name = "nombreServicio")
    String nombreServicio;

    @Column(name = "tipoServicio")
    int tipoServicio;

    @Column(name = "precio")
    Double precio;

    @ManyToOne
    @JoinColumn(name = "idAdmin")
    Admin admin;

}