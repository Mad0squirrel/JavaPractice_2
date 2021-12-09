package com.company;

public class Book {
    private String name, author, publisher;
    private int edition, publishYear;

    public Book(String name, String author, String publisher, int edition, int publishYear) {
        this.name = name;
        this.author = author;
        this.publisher = publisher;
        this.publishYear = publishYear;
        setEdition(edition);
    }

    public String toString() {
        String res = "Book{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'';
        if(edition > 0)
            res += ", publisher='" + publisher + '\'' +
                    ", edition=" + edition  +
                    ", publishYear=" + publishYear+
                    '}';
        else res += ", had not been published yet!}";
        return res;
    }

    public int getEdition() {
        return edition;
    }

    public void setEdition(int edition) {
        if(edition < 0) throw new IllegalArgumentException("The edition cannot be less than 0!");
        this.edition = edition;
    }
}
