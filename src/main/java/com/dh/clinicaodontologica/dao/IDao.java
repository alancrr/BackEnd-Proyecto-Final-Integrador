package com.dh.clinicaodontologica.dao;

import java.util.List;

public interface IDao <T>{
    List<T> listarElementos();
    T buscarPorCriterio(String criterio);
    T buscarPorId (int id);
    T guardar (T t);
    T actualizar (T t);
    void eliminar(int id);
}
