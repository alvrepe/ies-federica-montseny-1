package org.iesfm.company;

import java.net.SocketTimeoutException;
import java.util.Arrays;
import java.util.Objects;

public class Departament {
    private String name;
    private String cif;
    private Employee[] employees;

    public Departament(String name, String cif, Employee[] employees) {
        this.name = name;
        this.cif = cif;
        this.employees = employees;
    }

    public void showEmployees() {
        for (Employee employee:employees) {
            employee.info();

        }
    }

    public void info() {
        System.out.println(name + ". Con el CIF: " + cif);
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCif() {
        return cif;
    }

    public void setCif(String cif) {
        this.cif = cif;
    }

    public Employee[] getEmployees() {
        return employees;
    }

    public void setEmployees(Employee[] employees) {
        this.employees = employees;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Departament that = (Departament) o;
        return Objects.equals(name, that.name) &&
                Objects.equals(cif, that.cif) &&
                Arrays.equals(employees, that.employees);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(name, cif);
        result = 31 * result + Arrays.hashCode(employees);
        return result;
    }

    @Override
    public String toString() {
        return "Departament{" +
                "name='" + name + '\'' +
                ", cif='" + cif + '\'' +
                ", employees=" + Arrays.toString(employees) +
                '}';
    }
}
