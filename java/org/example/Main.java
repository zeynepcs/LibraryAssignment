package org.example;


import java.util.Scanner;

public class Main {

    static Scanner in = new Scanner(System.in);

    static Boolean running =true;
    public static void main (String[] args){


          Library firstLibrary = new Library();
          firstLibrary.addBook(new BookExt("Faust","Johann Wolfgang Von Goethe","Dram" ));
          firstLibrary.addBook(new BookExt("Les Miserables", "Victor Hugo", "Dram"));
          firstLibrary.addBook(new BookExt("Emma", "Jane Austen", "Romantic"));
          firstLibrary.addBook(new BookExt("Hamlet", "William Shakespeare", "Tragedi"));

          Borrowed mybooks = new Borrowed();
          mybooks.addBorrowed( new Book("Faust"));
          mybooks.addBorrowed( new Book("Emma"));


          while (running) {
            System.out.println("----VÄLKOMMEN TILL BIBLIOTEKET---" + "\nTryck 1 om du är kund" + "\nTryck 2 om du är anställd");
            int answer = in.nextInt();
            switch (answer) {

                case 1:

                    System.out.println("\nTryck på 1 för boklista"
                    + "\nTryck på 2 för att låna en ny bok"
                    + "\nTryck på 3 för en lista över lånade böcker"
                    + "\nTryck på 4 för att returnera boken");
                    int answer2 = in.nextInt();
                    switch (answer2) {

                        case 1:
                            System.out.println("\n-------------"
                            +"\n-------------");
                            System.out.println("Böcker tillgängliga i biblioteket:");
                            firstLibrary.printAvailableBooks();
                            System.out.println("\n-------------"
                                    +"\n-------------");
                            break;

                        case 2:
                            System.out.println("\n-------------"
                                    +"\n-------------");
                            System.out.println("Din lista över lånade böcker");
                            mybooks.printBorrowedBooks();
                            System.out.println("\n-------------"
                                    +"\n-------------");
                            break;

                        case 3:
                            System.out.println("\n-------------"
                                    +"\n-------------");
                            System.out.println("Det här är listan");
                            firstLibrary.printAvailableBooks2();
                            System.out.println("Skriv namnet på boken");
                            Scanner input = new Scanner(System.in);
                            String name = input.nextLine();
                            mybooks.addBorrowed( new Book(name));
                            System.out.println("\n-------------"
                                    +"\n-------------");
                            break;
                        case 4:

                            System.out.println("\n-------------"
                                    +"\n-------------");
                            System.out.println("Lista över lånade böcker");
                            mybooks.printBorrowedBooks();
                            System.out.println("Skriv namnet på boken");
                            Scanner input2 = new Scanner(System.in);
                            String name2 = input2.nextLine();
                            mybooks.returnBorrowed(new Book(name2));
                            System.out.println("\n-------------"
                                    +"\n-------------");
                            break;
                    }
                    break;
                case 2:

                        System.out.println("Välkommen till biblioteket" + "\nTryck på 1 för en lista över böcker i biblioteket"
                            + "\nTryck på 2 om du vill lägga till en ny bok i biblioteket"
                          +  "\nTryck på 3 if you want to remove book from the library" );
                         int answer3 = in.nextInt();
                         switch (answer3){


                             case 1:
                        System.out.println("\n-------------"
                                +"\n-------------");
                        System.out.println("Böcker tillgängliga i biblioteket:");
                        firstLibrary.printAvailableBooks();
                        System.out.println("\n-------------"
                                +"\n-------------");
                        break;

                        case 2:
                            System.out.println("\n-------------"
                                    +"\n-------------");
                            System.out.println("Skriv namnet på den nya bok som du vill lägga till i biblioteket");
                            Scanner input3 = new Scanner(System.in);
                            String name3 = input3.nextLine();
                            firstLibrary.addBook(new BookExt(name3, "", ""));
                            System.out.println("\n-------------"
                                    +"\n-------------");
                        break;

                        case 3:
                            System.out.println("\n-------------"
                                    +"\n-------------");
                            System.out.println("Böcker tillgängliga i  biblioteket:");
                            firstLibrary.printAvailableBooks2();
                            System.out.println("Skriv namnet på boken som du vill ta bort från biblioteket");
                            Scanner input4 = new Scanner(System.in);
                            String name4 = input4.nextLine();
                           firstLibrary.removeBook(new BookExt(name4,"",""));
                            System.out.println("\n-------------"
                                    +"\n-------------");
                            break;
                }
                    break;
            }


        }


    }


        }




