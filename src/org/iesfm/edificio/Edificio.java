package org.iesfm.edificio;

import java.util.Arrays;
import java.util.Objects;

public class Edificio {
    private String direccion;
    private String municipio;
    private Apartamento [] apartamentos;

    public Edificio(String direccion, String municipio, Apartamento[] apartamentos) {
        this.direccion = direccion;
        this.municipio = municipio;
        this.apartamentos = apartamentos;
    }
    public void printApartamentos(){
        for (int i = 0; i < apartamentos.length; i++) {
            Apartamento apartamento = apartamentos[i];
            apartamento.info();

        }
    }







    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getMunicipio() {
        return municipio;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }

    public Apartamento[] getApartamentos() {
        return apartamentos;
    }

    public void setApartamentos(Apartamento[] apartamentos) {
        this.apartamentos = apartamentos;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Edificio edificio = (Edificio) o;
        return Objects.equals(direccion, edificio.direccion) &&
                Objects.equals(municipio, edificio.municipio) &&
                Arrays.equals(apartamentos, edificio.apartamentos);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(direccion, municipio);
        result = 31 * result + Arrays.hashCode(apartamentos);
        return result;
    }

    @Override
    public String toString() {
        return "Edificio{" +
                "direccion='" + direccion + '\'' +
                ", municipio='" + municipio + '\'' +
                ", apartamentos=" + Arrays.toString(apartamentos) +
                '}';
    }
}









