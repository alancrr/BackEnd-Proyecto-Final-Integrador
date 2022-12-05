package com.dh.clinicaodontologica.controller;

import com.dh.clinicaodontologica.model.Paciente;
import com.dh.clinicaodontologica.service.PacienteServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/pacientes")
public class PacienteController {
    private final PacienteServiceImpl pacienteService;

    @Autowired
    public PacienteController (PacienteServiceImpl pacienteService){
        this.pacienteService = pacienteService;
    }

    @GetMapping
    public List<Paciente> getPacientes(){
        return  pacienteService.listarPacientes();
    }

    @GetMapping
    public Paciente getPacienteByEmail(String email){
        return null;
    }


}
