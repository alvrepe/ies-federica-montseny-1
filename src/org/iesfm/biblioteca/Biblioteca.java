package org.iesfm.biblioteca;

import java.util.Arrays;
import java.util.Objects;

public class Biblioteca implements IBiblioteca {
    private String nombre;
    private Libro[] libros;
    private Socio[] socios;
    private Prestamo[] prestamos;

    public Biblioteca(String nombre, Libro[] libros, Socio[] socios, Prestamo[] prestamos) {
        this.nombre = nombre;
        this.libros = libros;
        this.socios = socios;
        this.prestamos = prestamos;
    }

    public void printBooks() {
        for (int i = 0; i < libros.length; i++) {
            Libro libro = libros[i];
            libro.info();
        }
    }

    public void printBooks(String genero) {
        for (int i = 0; i < libros.length; i++) {
            Libro libro = libros[i];
            if (libro.opcionesGenero(genero)) {
                libro.info();
            }
        }

    }


    public void findSocioCp(int codigoPostal) {
        for (Socio socio : socios) {
            if (socio.getCodigoPostal() == codigoPostal) {
                socio.infoSocio();
            }
        }
    }

    private Socio findSocio(String nif) {
        Socio result = null;
        for (int i = 0; i < socios.length; i++) {
            Socio socio = socios[i];
            if (socio.getNif().equals(nif)) {

                result = socio;
            }
        }
        return result;

    }

    public void printDatSocio(String nif) {
        Socio socio = findSocio(nif);
        socio.infoSocio();
    }

    @Override
    public void findPrestamoSocio(int numeroSocio) {
        
    }

    private Prestamo[] printPrestamos(String nif) {
        int numPrestamos = 0;
        for (int i = 0; i < prestamos.length; i++) {
            Prestamo prestamo = prestamos[i];
            if (prestamo.getNifSocio().equals(nif)) {
                numPrestamos++;
            }
        }
        Prestamo[] prestamosSocio = new Prestamo[numPrestamos];
        int i = 0;
        for (int j = 0; j < prestamosSocio.length; j++) {
            Prestamo prestamo = prestamos[i];
            if(prestamo.getNifSocio().equals(nif)){
                prestamosSocio[j] = prestamo;
                i++;
            }
        }return prestamosSocio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Libro[] getLibros() {
        return libros;
    }

    public void setLibros(Libro[] libros) {
        this.libros = libros;
    }

    public Socio[] getSocios() {
        return socios;
    }

    public void setSocios(Socio[] socios) {
        this.socios = socios;
    }

    public Prestamo[] getPrestamos() {
        return prestamos;
    }

    public void setPrestamos(Prestamo[] prestamos) {
        this.prestamos = prestamos;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Biblioteca that = (Biblioteca) o;
        return Objects.equals(nombre, that.nombre) &&
                Arrays.equals(libros, that.libros) &&
                Arrays.equals(socios, that.socios) &&
                Arrays.equals(prestamos, that.prestamos);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(nombre);
        result = 31 * result + Arrays.hashCode(libros);
        result = 31 * result + Arrays.hashCode(socios);
        result = 31 * result + Arrays.hashCode(prestamos);
        return result;
    }

    @Override
    public String toString() {
        return "Biblioteca{" +
                "nombre='" + nombre + '\'' +
                ", libros=" + Arrays.toString(libros) +
                ", socios=" + Arrays.toString(socios) +
                ", prestamos=" + Arrays.toString(prestamos) +
                '}';
    }
}
