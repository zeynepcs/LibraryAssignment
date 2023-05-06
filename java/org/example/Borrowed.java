package org.example;

import java.util.ArrayList;


public class Borrowed {

    ArrayList<Book> Borrowed = new ArrayList<Book>();

    public void addBorrowed(Book lib2){
        this.Borrowed.add(lib2);
    }


    public void returnBorrowed(Book lib2){
        this.Borrowed.remove(lib2);
    }
    public void printBorrowedBooks(){
        if(Borrowed.isEmpty()){
            System.out.println("Inga böcker på lånelistan");
        }
        for(Book lib2:this.Borrowed){
            System.out.println(lib2.getTitle());
        }
    }
}




