//package org.iesfm.empresa;
//
//import java.util.Arrays;
//import java.util.Objects;
//
//public class Empresa {
//    private String nombre;
//    private String cif;
//    private Departamento[] departamentos;
//
//    public Empresa(String nombre, String cif, Departamento[] departamentos) {
//        this.nombre = nombre;
//        this.cif = cif;
//        this.departamentos = departamentos;
//    }
//
//    public void printEmpleado(String nombreDepartamento) {
//        for (Departamento departamento : departamentos) {
//            if (departamento.getNombre().equals(nombreDepartamento)) {
//                departamento.imprimeEmpleados();
//            }
//        }
//
//
//        public String getNombre () {
//            return nombre;
//        }
//
//        public void setNombre (String nombre){
//            this.nombre = nombre;
//        }
//
//        public String getCif () {
//            return cif;
//        }
//
//        public void setCif (String cif){
//            this.cif = cif;
//        }
//
//        public Departamento[] getDepartamentos () {
//            return departamentos;
//        }
//
//        public void setDepartamentos (Departamento[]departamentos){
//            this.departamentos = departamentos;
//        }
//
//        @Override
//        public boolean equals (Object o){
//            if (this == o) return true;
//            if (o == null || getClass() != o.getClass()) return false;
//            Empresa empresa = (Empresa) o;
//            return Objects.equals(nombre, empresa.nombre) &&
//                    Objects.equals(cif, empresa.cif) &&
//                    Arrays.equals(departamentos, empresa.departamentos);
//        }
//
//        @Override
//        public int hashCode () {
//            int result = Objects.hash(nombre, cif);
//            result = 31 * result + Arrays.hashCode(departamentos);
//            return result;
//        }
//
//        @Override
//        public String toString () {
//            return "Empresa{" +
//                    "nombre='" + nombre + '\'' +
//                    ", cif='" + cif + '\'' +
//                    ", departamentos=" + Arrays.toString(departamentos) +
//                    '}';
//        }
//    }
