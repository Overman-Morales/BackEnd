package com.example.demo.estudiante;

import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.session.SessionInformation;
import org.springframework.security.core.session.SessionRegistry;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;


@RestController
@RequestMapping(path = "api/v1/estudiante")
@CrossOrigin (origins = "http://localhost:4200")
public class EstudianteController {
    private final EstudianteService estudianteService;

    @Autowired
    public EstudianteController(EstudianteService estudianteService) {
        this.estudianteService = estudianteService;
    }


    @GetMapping
    public List<Estudiante> getEstudiante() {
        return estudianteService.getEstudiante();

    }


    @PostMapping
    public void registrarNewEstudiante(@RequestBody Estudiante estudiante) {
        estudianteService.addNewEstudiante(estudiante);
    }

    @DeleteMapping(path = "{estudianteId}")
    public void eliminarEstudiante(
            @PathVariable("estudianteId") Long estudianteId) {
        estudianteService.eliminarEstudiante(estudianteId);

    }


    @PutMapping(path = "{estudianteId}")
    public void actualizarEstudiante(
            @PathVariable("estudianteId") Long estudianteId,
            @RequestParam(required = false) String name,
            @RequestParam(required = false) String correoPersonal) {
        estudianteService.actualizarEstudiante(estudianteId, name, correoPersonal);
    }


}