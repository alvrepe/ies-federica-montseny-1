package org.instituto;

import java.util.Arrays;
import java.util.Objects;

public class Instituto {
    private String nombre;
    private Grupo [] grupos;

    public Instituto(String nombre, Grupo[] grupos) {
        this.nombre = nombre;
        this.grupos = grupos;
    }

    public String getNombre() {
        return nombre;
    }

    public Grupo[] getGrupos() {
        return grupos;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setGrupos(Grupo[] grupos) {
        this.grupos = grupos;
    }


    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Instituto instituto = (Instituto) o;
        return Objects.equals(nombre, instituto.nombre) &&
                Arrays.equals(grupos, instituto.grupos);
    }


    public int hashCode() {
        int result = Objects.hash(nombre);
        result = 31 * result + Arrays.hashCode(grupos);
        return result;
    }

    public void infoInstituto(){
        System.out.println(" el instituto se llama "+ nombre + " y tiene " + grupos.length + " grupos.");
    }
    public void imprimirGrupo(){
        for (int i = 0; i <grupos.length; i++) {
            Grupo clase = grupos[i];
            System.out.println(clase.getAula());
            clase.imprimirAlumnos();

        }
    }


}
