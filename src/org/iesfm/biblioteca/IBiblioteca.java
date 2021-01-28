package org.iesfm.biblioteca;

public interface IBiblioteca {
    void printBooks();
    void printBooks(String genero);
    void findSocioCp(int codigoPostal);
    void printDatSocio(String nif);
    void findPrestamoSocio(int numeroSocio);
}
