package com.dh.clinicaodontologica.service;

import com.dh.clinicaodontologica.model.Domicilio;
import com.dh.clinicaodontologica.model.Paciente;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

@Service
public class PacienteServiceImpl implements IPacienteService{

    private Paciente[] listita = {
            new Paciente("pedro","picapiedra","pedro@qwe.com",1234567, LocalDate.now(),(new Domicilio())),
            new Paciente("roberto","latortuga","tortuga@qwe.com",1234560,LocalDate.now(),(new Domicilio()))
    };

    @Override
    public List<Paciente> listarPacientes() {
        
        return Arrays.asList(listita);
        //Los pacientes
    }

    @Override
    public Paciente buscarPorEmail(String email) {
        for (Paciente pacienteEmail:listita) {
            if (pacienteEmail.getEmail().equals(email))
                return pacienteEmail;
        }
        return null;
    }
}
