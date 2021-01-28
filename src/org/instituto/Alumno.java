package org.instituto;

import java.util.Objects;

public class Alumno {
    private String nombre;
    private String apellidos;
    private int codigoPostal;

    //constructor
    public Alumno(String nombre, String apellidos, int codigoPostal) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.codigoPostal = codigoPostal;
    }

    public void infoAlumno() {
        System.out.println("Este es el alumno " + nombre + " " + apellidos + ". Con codigo postal  " + codigoPostal);

    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public int getcp() {
        return codigoPostal;
    }

    public int hashCode() {
        return Objects.hash(nombre, apellidos, codigoPostal);
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void setCodigoPostal(int codigoPostal) {
        this.codigoPostal = codigoPostal;
    }


    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Alumno alumno = (Alumno) o;
        return codigoPostal == alumno.codigoPostal &&
                Objects.equals(nombre, alumno.nombre) &&
                Objects.equals(apellidos, alumno.apellidos);
    }

}
