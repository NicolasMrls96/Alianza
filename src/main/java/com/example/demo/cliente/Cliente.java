package com.example.demo.cliente;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@Entity(name = "clientes")
@NoArgsConstructor
@AllArgsConstructor
public class Cliente {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_cliente")
    private Integer id_cliente;

    @Column(name = "nombre")
    String nombreCliente;

    @Column(name = "apellido")
    String apellidoCliente;

    @Column(name = "documento")
    Integer documentoCliente;

    @Column(name = "servicio")
    Integer servicioCliente;

    @Column(name = "correo")
    String correoCliente;

    @Column(name = "telefono")
    Integer telefonoCliente;

    /*@ManyToOne
    @JoinColumn(name = "idCliente")
    Cliente cliente;*/

}
