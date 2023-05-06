package org.example;

import java.util.ArrayList;


public class Library {

    ArrayList<BookExt> catalogue = new ArrayList<>();
    public void addBook(BookExt lib){
        this.catalogue.add(lib);
    }
    public void removeBook(BookExt lib){
        this.catalogue.remove(lib);
    }
    public void printAvailableBooks(){
        if(catalogue.isEmpty()){
            System.out.println("Ingen bok i katalogen");
        }
        for(BookExt lib:this.catalogue){
            System.out.println("Title:" + lib.getTitle() + ", " + "Författare:" + lib.getFörfattare() + ", " + "Genre:"+ lib.getGenre() );
        }
    }
    public void printAvailableBooks2(){
        if(catalogue.isEmpty()){
            System.out.println("Ingen bok i katalogen");
        }
        for(BookExt lib:this.catalogue){
            System.out.println( lib.getTitle());
        }
    }


}




