package org.iesfm.zoo;

import java.util.Arrays;
import java.util.Objects;

public class Zoo {
    private String nombre;
    private Animal[] animales;

    public Zoo(String nombre, Animal[] animales) {
        this.nombre = nombre;
        this.animales = animales;
    }


    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Zoo zoo = (Zoo) o;
        return Objects.equals(nombre, zoo.nombre) &&
                Arrays.equals(animales, zoo.animales);
    }


    public int hashCode() {
        int result = Objects.hash(nombre);
        result = 31 * result + Arrays.hashCode(animales);
        return result;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setAnimales(Animal[] animales) {
        this.animales = animales;
    }

    public String getNombre() {
        return nombre;
    }

    public Animal[] getAnimales() {
        return animales;
    }

    public void imprimirAnimales(String alimentacion) {
        for (int i = 0; i < animales.length; i++) {
            Animal animal = animales[i];
            if (animal.getAlimentacion().equals(alimentacion)) {
                animal.infoAnimal();

            }
        }
    }

    public void imprimirHervivoros() {
        imprimirAnimales(Animal.HERBIVORO);
    }

    public void imprimirCarnivoro() {
        imprimirAnimales(Animal.CARNIVORO);
    }

    public void imprimirOmnivoro() {
        imprimirAnimales(Animal.OMNIVORO);
    }

}

