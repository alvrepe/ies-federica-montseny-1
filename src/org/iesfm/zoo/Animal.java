package org.iesfm.zoo;

import java.util.Objects;

public class Animal {

    public static final String CARNIVORO = "carnivoro";
    public static final String HERBIVORO = "hervivoro";
    public static final String OMNIVORO = "omnivoro";

    private String especie;
    private int edad;
    private int jaula;
    private String alimentacion;

    public Animal(String especie, int edad, int jaula, String alimentacion){
        this.especie = especie;
        this.edad = edad;
        this.jaula = jaula;
        this.alimentacion = alimentacion;
    }


    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return edad == animal.edad &&
                jaula == animal.jaula &&
                Objects.equals(especie, animal.especie) &&
                Objects.equals(alimentacion, animal.alimentacion);
    }


    public int hashCode() {
        return Objects.hash(especie, edad, jaula, alimentacion);
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setJaula(int jaula) {
        this.jaula = jaula;
    }

    public void setAlimentacion(String alimentacion) {
        this.alimentacion = alimentacion;
    }

    public String getEspecie() {
        return especie;
    }

    public int getEdad() {
        return edad;
    }

    public int getJaula() {
        return jaula;
    }

    public String getAlimentacion() {
        return alimentacion;
    }

    public void infoAnimal(){
        System.out.println("este es un " + especie + " de " + edad + " años. Son " + alimentacion + " y su jaula es la numero " + jaula);
    }


}

