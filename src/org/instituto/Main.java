package org.instituto;

import java.util.Scanner;

public class Main {

   private static Scanner scan = new Scanner(System.in);

  private static Alumno pideAlumno() {
        System.out.println("Introduce el nombre del alumno:");
        String nombre = scan.next();
        System.out.println("Introduce del apellido del alumno:");
        String apellidos = scan.nextLine();
        System.out.println("Introduce el código postal del alumno:");
        int cp = scan.nextInt();
        //----------------------
        scan.nextLine(); //Para poder poner dos nombres, siempre despues del int.
        //-----------------------

        Alumno alumno = new Alumno(nombre, apellidos, cp);
        return alumno;
        // return new Alumno (nombre, apellidos, cp);
    }

   private static Alumno[] pideAlumnos() {
        System.out.println("Introduce el numero de alumnos:");
        int cantidad = scan.nextInt();
        while (cantidad <= 0) {
            System.out.println("tiene que haber al menos un vehiculo");
            cantidad = scan.nextInt();
        }
        Alumno[] alumnosArray = new Alumno[cantidad];
        for (int i = 0; i < alumnosArray.length; i++) {
            alumnosArray[i] = pideAlumno();
        }
        return alumnosArray;
    }

   private static Grupo pideGrupo() {
        System.out.println("introduce el aula del grupo :");
        String aula = scan.next();
        Alumno[] alumnos = pideAlumnos();
        return new Grupo(aula, alumnos);
    }

   private static Grupo[] pideGrupos() {
        System.out.println("introduce el numero de grupos");
        int cantidad = scan.nextInt();
        Grupo[] grupoArray = new Grupo[cantidad];
        for (int i = 0; i < grupoArray.length; i++) {
            grupoArray[i] = pideGrupo();
        }
        return grupoArray;
    }

   private static Instituto pideInstituto() {
        System.out.println("Introduce el nombre del instituto");
        String nombre = scan.next();
        Grupo[] grupos = pideGrupos();
        return new Instituto(nombre, grupos);
    }

    public static void main(String[] args) {
        Instituto instituto = pideInstituto();
        instituto.infoInstituto();
        instituto.imprimirGrupo();
    }
}


