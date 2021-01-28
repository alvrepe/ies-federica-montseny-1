package org.iesfm.edificio;

import java.util.Arrays;
import java.util.Objects;

public class Apartamento {
    private int numeroPlanta;
    private String puerta;
    private Propietario [] propietarios;

    public Apartamento(int numeroPlanta, String puerta, Propietario[] propietarios) {
        this.numeroPlanta = numeroPlanta;
        this.puerta = puerta;
        this.propietarios = propietarios;
    }

    public int getNumeroPlanta() {
        return numeroPlanta;
    }

    public void info() {
        System.out.println("En la planta " + numeroPlanta  + " " + puerta + "vive:" );
        for (int i = 0; i < propietarios.length; i++) {
            Propietario propietario = propietarios[i];
            propietario.info();

        }

    }













    public void setNumeroPlanta(int numeroPlanta) {
        this.numeroPlanta = numeroPlanta;
    }

    public String getPuerta() {
        return puerta;
    }

    public void setPuerta(String puerta) {
        this.puerta = puerta;
    }

    public Propietario[] getPropietarios() {
        return propietarios;
    }

    public void setPropietarios(Propietario[] propietarios) {
        this.propietarios = propietarios;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Apartamento that = (Apartamento) o;
        return numeroPlanta == that.numeroPlanta &&
                Objects.equals(puerta, that.puerta) &&
                Arrays.equals(propietarios, that.propietarios);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(numeroPlanta, puerta);
        result = 31 * result + Arrays.hashCode(propietarios);
        return result;
    }

    @Override
    public String toString() {
        return "Apartamento{" +
                "numeroPlanta=" + numeroPlanta +
                ", puerta='" + puerta + '\'' +
                ", propietarios=" + Arrays.toString(propietarios) +
                '}';
    }
}
