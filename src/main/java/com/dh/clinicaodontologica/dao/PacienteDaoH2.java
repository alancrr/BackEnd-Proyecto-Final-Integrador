package com.dh.clinicaodontologica.dao;

import com.dh.clinicaodontologica.model.Domicilio;
import com.dh.clinicaodontologica.model.Paciente;
import org.springframework.stereotype.Component;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

@Component
public class PacienteDaoH2 implements IDao<Paciente> {
    @Override
    public List<Paciente> listarElementos() {
        Connection connection = null;
        List<Paciente> listaPacientes = new ArrayList<>();
        Paciente paciente ;
        Domicilio domicilio;
        try {
            connection = H2Aux.getConnection();
            PreparedStatement ps = connection.prepareStatement("SELECT *"+"FROM PACIENTES");
            ResultSet rs = ps.executeQuery();
            while  (rs.next()){
                //Creo la lista de pacientes
                DomicilioDaoH2 domicilioDaoH2 = new DomicilioDaoH2();
                domicilio = domicilioDaoH2.buscarPorId(rs.getInt(7));
                paciente = new Paciente(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getInt(5),rs.getDate(6).toLocalDate(),domicilio);
                listaPacientes.add(paciente);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        finally {
            try{
                connection.close();
            }
            catch (Exception ex){
                ex.printStackTrace();
            }
        }
        return listaPacientes;
    }

    @Override
    public Paciente buscarPorCriterio(String criterio) {
        Connection connection = null;
        Paciente paciente = null;
        Domicilio domicilio = null;
        try{
            connection = H2Aux.getConnection();
            PreparedStatement ps = connection.prepareStatement("SELECT *"+"FROM PACIENTES");
            ResultSet rs = ps.executeQuery();
            while (rs.next()){
                if(rs.getString(3)==criterio) {
                    DomicilioDaoH2 domicilioDaoH2 = new DomicilioDaoH2();
                    domicilio = domicilioDaoH2.buscarPorId(rs.getInt(7));
                }
            }
        } catch (Exception e){

        }
        return null;
    }

    @Override
    public Paciente buscarPorId(int id) {
        return null;
    }

    @Override
    public Paciente guardar(Paciente paciente) {
        return null;
    }

    @Override
    public Paciente actualizar(Paciente paciente) {
        return null;
    }

    @Override
    public void eliminar(int id) {

    }
}
