package org.example;

public class BookExt extends Book{
    String författare;
    String genre;

    public BookExt( String bookTitle, String bookFörfattare, String bookGenre) {

        super.title = bookTitle;
        this.författare = bookFörfattare;
        this.genre = bookGenre;
    }

    public String getFörfattare() {
        return this.författare;
    }

    public String getGenre()
    {return genre;


}
    }
