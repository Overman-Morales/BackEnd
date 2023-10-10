package com.example.demo.estudiante.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor

@Entity
@Table(name = "datos_escolares")
public class DatosEscolares {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;

    @OneToOne
    @JoinColumn(name = "estudianteId")
    private DatosPersonales estudiante;

    private String universidad;
    private String matriculaEscolar;
    private String modalidadEscolar;
    private String planEducativo;
    private String periodo;

}
