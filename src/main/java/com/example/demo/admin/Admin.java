package com.example.demo.admin;

import com.example.demo.servicios.Servicios;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name="admin")
public class Admin {
    private static final long serialVersionUID = 1232L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idAdmin")
    private Integer idAdmin;

    @Column(name = "nombre")
    String nombre;

    @Column (name = "Documento")
    int documento;

    @Column (name = "ModificarServicio")
    int modificarServicio;

    @OneToMany(mappedBy = "admin", cascade = CascadeType.ALL)
    List<Servicios> servicios;

}