package org.iesfm.library;

import java.util.Arrays;
import java.util.Objects;

public class Library implements ILibrary {
    private String name;
    private Book[] books;
    private Member[] members;
    private BookLend[] bookLends;

    public Library(String name, Book[] books, Member[] members, BookLend[] bookLends) {
        this.name = name;
        this.books = books;
        this.members = members;
        this.bookLends = bookLends;
    }

    @Override
    //Mostrar libros
    public void showBooks() {
        System.out.println("libros de la biblioteca:");
        for (Book book : books) {
            book.info();

        }
    }

    @Override
    //Mostrar libros de un genero
    public void showBooksByGenre(String genre) {
        System.out.println("Libros de la biblioteca del genero " + genre + ":");
        for (Book book : books) {
            if (book.hasGenre(genre)) {
                book.info();
            }

        }
    }

    @Override
    //Mostrar los datos de los socios.
    public void showMember() {
        for (Member member : members) {
            member.info();

        }
    }

    @Override
    //Monstrar miembro por su cp
    public void showMembersByCp(int cp) {
        System.out.println("Los socios con el codigo postal : " + cp + " son:" );
        for (Member member: members) {
            if(member.getCp() == (cp)){
                member.info();
            }

        }

    }

    @Override
    public void showMembersLends(String nif) {

    }

    @Override
    public void showMemberLends(int numMember) {

    }

    @Override
    public boolean memberHasLend(int numMember, int isbn) {
        return false;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Book[] getBooks() {
        return books;
    }

    public void setBooks(Book[] books) {
        this.books = books;
    }

    public Member[] getMembers() {
        return members;
    }

    public void setMembers(Member[] members) {
        this.members = members;
    }

    public BookLend[] getBookLends() {
        return bookLends;
    }

    public void setBookLends(BookLend[] bookLends) {
        this.bookLends = bookLends;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Library library = (Library) o;
        return Objects.equals(name, library.name) &&
                Arrays.equals(books, library.books) &&
                Arrays.equals(members, library.members) &&
                Arrays.equals(bookLends, library.bookLends);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(name);
        result = 31 * result + Arrays.hashCode(books);
        result = 31 * result + Arrays.hashCode(members);
        result = 31 * result + Arrays.hashCode(bookLends);
        return result;
    }

    @Override
    public String toString() {
        return "Library{" +
                "name='" + name + '\'' +
                ", books=" + Arrays.toString(books) +
                ", members=" + Arrays.toString(members) +
                ", bookLends=" + Arrays.toString(bookLends) +
                '}';
    }
}
