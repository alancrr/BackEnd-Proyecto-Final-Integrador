package com.dh.clinicaodontologica.model;

import java.sql.Date;
import java.time.LocalDate;


public class Paciente {
    //Paciente (ID, Apellido, Nombre, Email, DNI, Fecha ingreso)
    private int ID;
    private String apellido;
    private String nombre;
    private String email;
    private Integer DNI;
    private LocalDate fecha_ingreso;
    private Domicilio domicilio;

    public Paciente(){
    }

    public Paciente(String apellido, String nombre, String email, Integer DNI, LocalDate fecha_ingreso, Domicilio domicilio) {
        this.apellido = apellido;
        this.nombre = nombre;
        this.email = email;
        this.DNI = DNI;
        this.fecha_ingreso = fecha_ingreso;
        this.domicilio = domicilio;
    }

    public Paciente(int ID, String apellido, String nombre, String email, Integer DNI, LocalDate fecha_ingreso, Domicilio domicilio) {
        this.ID = ID;
        this.apellido = apellido;
        this.nombre = nombre;
        this.email = email;
        this.DNI = DNI;
        this.fecha_ingreso = fecha_ingreso;
        this.domicilio = domicilio;
    }

    public int getID() {
        return ID;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getDNI() {
        return DNI;
    }

    public void setDNI(Integer DNI) {
        this.DNI = DNI;
    }

    public String getEmail(){
        return email;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public LocalDate getFecha_ingreso() {
        return fecha_ingreso;
    }

    public void setFecha_ingreso(LocalDate fecha_ingreso) {
        this.fecha_ingreso = fecha_ingreso;
    }

    public Domicilio getDomicilio(){
        return domicilio;
    }

    public void setDomicilio(Domicilio domicilio){
        this.domicilio = domicilio;
    }

    @Override
    public String toString() {
        return "Paciente{" +
                "ID=" + ID +
                ", apellido='" + apellido + '\'' +
                ", nombre='" + nombre + '\'' +
                ", email='" + email + '\'' +
                ", DNI=" + DNI +
                ", fecha_ingreso=" + fecha_ingreso +
                ", domicilio=" + domicilio +
                '}';
    }
}
