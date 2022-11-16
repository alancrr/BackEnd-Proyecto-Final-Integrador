package com.dh.clinicaodontologica.service;

import com.dh.clinicaodontologica.model.Paciente;

import java.util.List;

public interface IPacienteService {
    List<Paciente> listarPacientes();
    Paciente buscarPorEmail(String email);
}
