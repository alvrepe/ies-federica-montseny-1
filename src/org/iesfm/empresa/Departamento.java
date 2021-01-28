package org.iesfm.empresa;

import java.util.Arrays;
import java.util.Objects;

public class Departamento {
    private String nombre;
    private Empleado [] empleados;

    public Departamento(String nombre, Empleado[] empleados) {
        this.nombre = nombre;
        this.empleados = empleados;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Empleado[] getEmpleados() {
        return empleados;
    }

    public void setEmpleados(Empleado[] empleados) {
        this.empleados = empleados;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Departamento that = (Departamento) o;
        return Objects.equals(nombre, that.nombre) &&
                Arrays.equals(empleados, that.empleados);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(nombre);
        result = 31 * result + Arrays.hashCode(empleados);
        return result;
    }

    @Override
    public String toString() {
        return "Departamento{" +
                "nombre='" + nombre + '\'' +
                ", empleados=" + Arrays.toString(empleados) +
                '}';
    }
}
