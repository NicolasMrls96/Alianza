package com.example.demo.cliente;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@Entity(name = "cliente")
@NoArgsConstructor
@AllArgsConstructor
public class Cliente {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idCliente")
    private Integer idCliente;

    @Column(name = "nombre")
    String nombreCliente;

    @Column(name = "apellido")
    String apellidoCliente;

    @Column(name = "documento")
    int documentoCliente;

    @Column(name = "servicio")
    int servicioCliente;

    @Column(name = "correo")
    String correoCliente;

    @Column(name = "telefono")
    int telefonoCliente;

    /*@ManyToOne
    @JoinColumn(name = "idCliente")
    Cliente cliente;*/

}
