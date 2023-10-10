package com.example.demo.estudiante.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor

@Entity
@Table(name = "datos_personales")

public class DatosPersonales {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombres;
    private String primerApellido;
    private String segundoApellido;
    private String genero;
    private String curp;
    private String estado;
    private String ciudad;
    private String domicilio;
    private String celular;
    private String telefono;
    private String correoPersonal;

    @OneToMany(mappedBy = "aspirante")
    private List<DatosFTD> datosFTD;

    @OneToOne(mappedBy = "aspirante")
    private DatosEscolares datosEscolares;

    @OneToOne(mappedBy = "aspirante")
    private DatosIngreso datosIngreso;

}
