package org.iesfm.biblioteca;

import java.util.Objects;

public class Socio {
    private String nif;
    private String nombre;
    private String apellidos;
    private String numeroSocio;
    private int codigoPostal;

    public Socio(String nif, String nombre, String apellidos, String numeroSocio, int codigoPostal) {
        this.nif = nif;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.numeroSocio = numeroSocio;
        this.codigoPostal = codigoPostal;
    }

    public void infoSocio() {
        System.out.println(nombre + apellidos + " con nif " + nif);
    }

    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getNumeroSocio() {
        return numeroSocio;
    }

    public void setNumeroSocio(String numeroSocio) {
        this.numeroSocio = numeroSocio;
    }

    public int getCodigoPostal() {
        return codigoPostal;
    }

    public void setCodigoPostal(int codigoPostal) {
        this.codigoPostal = codigoPostal;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Socio socios = (Socio) o;
        return codigoPostal == socios.codigoPostal &&
                Objects.equals(nif, socios.nif) &&
                Objects.equals(nombre, socios.nombre) &&
                Objects.equals(apellidos, socios.apellidos) &&
                Objects.equals(numeroSocio, socios.numeroSocio);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nif, nombre, apellidos, numeroSocio, codigoPostal);
    }

    @Override
    public String toString() {
        return "Socios{" +
                "nif='" + nif + '\'' +
                ", nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", numeroSocio='" + numeroSocio + '\'' +
                ", codigoPostal=" + codigoPostal +
                '}';
    }
}
