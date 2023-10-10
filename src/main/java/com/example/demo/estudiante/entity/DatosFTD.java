package com.example.demo.estudiante.entity;

import jakarta.persistence.*;

    @Entity
    @Table(name = "datos_ftd")
    public class DatosFTD {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;
        @ManyToOne
        @JoinColumn(name = "aspirante_id")
        private DatosPersonales aspirante;

        private String nombre;
        private String primerApellido;
        private String segundoApellido;
        private String nombreProyecto;
        private String avanceProyecto;
        private String evaluacionProyecto;
        private String areaInfotec;
        private String tutor;
        private String beca;
        private String fechaIngreso;
        private String fechaTermino;
        private String grupo;
        private String enlace;
        private String matriculaFTD;
        private String correoBecario;
        private String estatusTramite;
        private String cursos;
    }

