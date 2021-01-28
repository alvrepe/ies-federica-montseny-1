package org.iesfm.company;

import java.util.Arrays;
import java.util.Objects;

public class Company implements ICompany {
    private String name;
    private String cif;
    private Departament[] departaments;

    public Company(String name, Departament[] departaments) {
        this.name = name;
        this.departaments = departaments;
    }

    @Override
    public void showDepartamentNames() {
        System.out.println("Los nombres de los departamentos son :");
        for (Departament departament : departaments) {
            System.out.println(departament.getName());
//            departament.info();

        }
    }

    @Override
    public Employee[] getEmployees(String departamentName) {
        Departament departament = findDepartaments(departamentName);
        Employee[] employees = null;
        if (departament != null) {
            employees = departament.getEmployees();
        } else {
            System.out.println("el departamento no se ha encontrado");

        }
        return employees;
    }

    private Departament findDepartaments(String departamentName) {
        Departament found = null;
        for (Departament departament : departaments) {
            if (departament.getName().equals(departamentName)) {
                found = departament;
            }
        }
        return found;
    }

    @Override
    public void showEmployees(String departamentNames) {
        Departament departament = findDepartaments(departamentNames);
        if(departament != null){
            departament.showEmployees();
        }else{
            System.out.println("no hay empleados que mostrar");
        }
    }

    @Override
    public void showAllEmployess() {
        for (Departament departament: departaments) {
            departament.getEmployees();

        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Departament[] getDepartaments() {
        return departaments;
    }

    public void setDepartaments(Departament[] departaments) {
        this.departaments = departaments;
    }

    public String getCif() {
        return cif;
    }

    public void setCif(String cif) {
        this.cif = cif;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Company company = (Company) o;
        return Objects.equals(name, company.name) &&
                Objects.equals(cif, company.cif) &&
                Arrays.equals(departaments, company.departaments);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(name, cif);
        result = 31 * result + Arrays.hashCode(departaments);
        return result;
    }

    @Override
    public String toString() {
        return "Company{" +
                "name='" + name + '\'' +
                ", departaments=" + Arrays.toString(departaments) +
                '}';
    }

}
