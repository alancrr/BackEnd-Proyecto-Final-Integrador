package com.dh.clinicaodontologica.dao;

import com.dh.clinicaodontologica.model.Domicilio;
import org.springframework.stereotype.Component;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;
@Component
public class DomicilioDaoH2 implements IDao<Domicilio>{


    @Override
    public List<Domicilio> listarElementos() {
        return null;
    }

    @Override
    public Domicilio buscarPorCriterio(String criterio) {
        return null;
    }

    @Override
    public Domicilio buscarPorId(int id) {
        Connection connection = null;
        Domicilio domicilio = null;
        try{
            connection = H2Aux.getConnection();
            PreparedStatement ps = connection.prepareStatement("SELECT *"+"FROM PACIENTES");
            ResultSet rs = ps.executeQuery();
            while (rs.next()){
                //si encuentro el id que yo quiero entonces domicilio se instancia con los valores correspondientes al id
                if (rs.getInt(1) == id){
                    domicilio = new Domicilio(rs.getInt(1),rs.getString(2),rs.getInt(3),rs.getString(4),rs.getString(5));
                }
            }
        }
        catch (Exception e){
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
        return domicilio;
    }

    @Override
    public Domicilio guardar(Domicilio domicilio) {
        return null;
    }

    @Override
    public Domicilio actualizar(Domicilio domicilio) {
        return null;
    }

    @Override
    public void eliminar(int id) {

    }
}
