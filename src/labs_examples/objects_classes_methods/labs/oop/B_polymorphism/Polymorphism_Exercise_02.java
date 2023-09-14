package labs_examples.objects_classes_methods.labs.oop.B_polymorphism;

import java.util.ArrayList;
import java.util.Arrays;

class Polymorphism_Exercise_02 {
    public static void main(String[] args) {

    }
}

interface Book {
        // Method to get the title of the book
        String getTitle();

        // Method to set the title of the book
        void setTitle(String title);

        // Method to get the author of the book
        String[] getAuthor();

        // Method to set the author of the book
        void setAuthor(String... authors);

        // Method to get the publication year of the book
        int getPublicationYear();

        // Method to set the publication year of the book
        void setPublicationYear(int publicationYear);

        // Method to get the ISBN (International Standard Book Number) of the book
        String getISBN();

        // Method to set the ISBN of the book
        void setISBN(String isbn);

        // Method to get the price of the book
        double getPrice();

        // Method to set the price of the book
        void setPrice(double price);

}

class AnActualBook implements Book{
    private String title;
    private String[] authors;
    private int publicationYear;
    private String ISBN;
    private double price;
    private int pages;

    public AnActualBook() {
    }

    public AnActualBook(String title, int publicationYear, String ISBN, double price, int pages, String... authors) {
        this.title = title;
        this.publicationYear = publicationYear;
        this.ISBN = ISBN;
        this.price = price;
        this.pages = pages;
        this.authors = authors;
    }

    @Override
    public String getTitle() {
        return this.title;
    }

    @Override
    public void setTitle(String title) {
        this.title = title;
    }

    public String[] getAuthor() {
        return authors;
    }

    public void setAuthor(String[] authors) {
        this.authors = authors;
    }

    @Override
    public int getPublicationYear() {
        return publicationYear;
    }

    @Override
    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }

    @Override
    public String getISBN() {
        return ISBN;
    }

    @Override
    public void setISBN(String isbn) {
        this.ISBN = ISBN;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public void setPrice(double price) {
        this.price = price;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }
}

class EBook extends AnActualBook {
    private String format;
    public EBook(String title, int publicationYear, String ISBN, double price, int pages, String format, String... authors) {
        super(title, publicationYear, ISBN, price, pages, authors);
        this.format = format;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }
}