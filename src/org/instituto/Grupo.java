package org.instituto;

import java.util.Arrays;
import java.util.Objects;

public class Grupo {
    private String aula;
    private Alumno [] alumnos;

    public Grupo(String nombre, Alumno [] alumnos){
        this.aula = nombre;
        this.alumnos=alumnos;
    }


    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Grupo instituto = (Grupo) o;
        return Objects.equals(aula, instituto.aula) &&
                Arrays.equals(alumnos, instituto.alumnos);
    }


    public int hashCode() {
        int result = Objects.hash(aula);
        result = 31 * result + Arrays.hashCode(alumnos);
        return result;
    }

    public void setAula(String aula) {
        this.aula = aula;
    }

    public void setAlumnos(Alumno[] alumnos) {
        this.alumnos = alumnos;
    }

    public String getAula() {
        return aula;
    }

    public Alumno[] getAlumnos() {
        return alumnos;
    }

    public void imprimirAlumnos(){
        for (int i = 0; i < alumnos.length; i++) {
            Alumno alumno = alumnos[i];
            alumno.infoAlumno();
        }
    }



}
