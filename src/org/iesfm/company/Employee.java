package org.iesfm.company;

import java.util.Objects;

public class Employee {
    private String name;
    private String surnames;
    private String nif;
    private String role ;

    public Employee(String name, String surnames, String nif, String role) {
        this.name = name;
        this.surnames = surnames;
        this.nif = nif;
        this.role = role;
    }

    public void info() {
        System.out.println(nif);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurnames() {
        return surnames;
    }

    public void setSurnames(String surnames) {
        this.surnames = surnames;
    }

    public String getCif() {
        return nif;
    }

    public void setCif(String cif) {
        this.nif = cif;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Objects.equals(name, employee.name) &&
                Objects.equals(surnames, employee.surnames) &&
                Objects.equals(nif, employee.nif) &&
                Objects.equals(role, employee.role);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surnames, nif, role);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", surnames='" + surnames + '\'' +
                ", nif='" + nif + '\'' +
                ", role='" + role + '\'' +
                '}';
    }
}
