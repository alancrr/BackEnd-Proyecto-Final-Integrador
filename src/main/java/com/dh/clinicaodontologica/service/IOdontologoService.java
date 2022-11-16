package com.dh.clinicaodontologica.service;

import com.dh.clinicaodontologica.model.Odontologo;

import java.util.List;

public interface IOdontologoService {
    List<Odontologo> listarOdontologos();
    Odontologo buscarOdontologoPorId(int id);
    Odontologo registrarOdontologo (Odontologo odont);
}
