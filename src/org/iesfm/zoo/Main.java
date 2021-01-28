package org.iesfm.zoo;

import java.util.Scanner;

public class Main {
    static Scanner scan = new Scanner(System.in);


    static Zoo pideZoo() {
        System.out.println("Introduce el nombre del Zoo...:");
        String nombre = scan.next();
        Animal [] animales = pideAnimales();
        return new Zoo(nombre,animales);

    }

    static Animal pideAnimal() {
        System.out.println("introduce una especie :");
        String especie = scan.next();
        System.out.println("introduce la edad del animal :");
        int edad = scan.nextInt();
        System.out.println("introduce en que jaula esta el animal:");
        int jaula = scan.nextInt();
        System.out.println("introduce la alimenación del animal");
        System.out.println("1.Carnivoro");
        System.out.println("2.hervivoro");
        System.out.println("3.Omnivoro");
        int opcionAlimentacion = scan.nextInt();
        if(opcionAlimentacion == 1){
            return new Animal(especie,edad,jaula,Animal.CARNIVORO);
        } else if (opcionAlimentacion == 2) {
            return new Animal(especie,edad,jaula,Animal.CARNIVORO);
        }else {
            return new Animal(especie,edad,jaula,Animal.CARNIVORO);
        }
    }




    static Animal[] pideAnimales() {
        System.out.println("itroduce el numero de animales a meter");
        int cantidad = scan.nextInt();
        while (cantidad <= 0) {
            System.out.println("tiene que haber al menos un animal");
            cantidad = scan.nextInt();
        }
        Animal[] animalesArray = new Animal[cantidad];
        for (int i = 0; i < animalesArray.length; i++) {
            animalesArray[i] = pideAnimal();
        }
        return animalesArray;
    }

    public static void main(String[] args) {
        Zoo zoo = pideZoo();
        zoo.imprimirHervivoros();
        zoo.imprimirCarnivoro();
        zoo.imprimirOmnivoro();


    }
}