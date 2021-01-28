package org.iesfm.library;

import java.util.Arrays;
import java.util.Objects;

public class Book {
    private int isbn;
    private String title;
    private String author;
    private String [] genres;

    public Book(int isbn, String title, String author, String[] genres) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.genres = genres;
    }

    public void info() {
        System.out.println(title + ", de " +  author + ". Su ISBN es : " + isbn);
    }
//Tiene genero, cuando sea del genero se metera en el metodo.
    public boolean hasGenre(String genre) {
        boolean genreFound = false;
        for (String bookGenre : genres) {
            if(bookGenre.equals(genre)){
                genreFound = true;
            }

        }return genreFound;
    }





    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String[] getGenres() {
        return genres;
    }

    public void setGenres(String[] genres) {
        this.genres = genres;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book library = (Book) o;
        return isbn == library.isbn &&
                Objects.equals(title, library.title) &&
                Objects.equals(author, library.author) &&
                Arrays.equals(genres, library.genres);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(isbn, title, author);
        result = 31 * result + Arrays.hashCode(genres);
        return result;
    }

    @Override
    public String toString() {
        return "Library{" +
                "isbn=" + isbn +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", genres=" + Arrays.toString(genres) +
                '}';
    }
}
