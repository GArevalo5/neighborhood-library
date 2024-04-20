package com.pluralsight;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    static final Scanner userInput = new Scanner(System.in);
    public static void main(String[] args) {


        //Need the array for the books
        Book[] booksInLibrary = {
                new Book(101, "978-0-00-000000-1", "Gotrek & Felix The First Omnibus", false, " "),
                new Book(102, "978-0-00-000000-2", "Gotrek & Felix The Second Omnibus", " "),
                new Book(103, "978-0-00-000000-3", "Gotrek & Felix The Third Omnibus", " "),
                new Book(104, "978-0-00-000000-4", "Gotrek & Felix The Fourth Omnibus", " "),
                new Book(105, "978-0-00-000000-5", "Gotrek & Felix The Fifth Omnibus", " "),
                new Book(106, "978-0-00-000000-6", "Gotrek & Felix The Sixth Omnibus", " "),
                new Book(107, "978-0-00-000000-7", "Atomic Habits", false, " "),
                new Book(108, "978-0-00-000000-8", "The 5 Resets", false, " "),
                new Book(109, "978-0-00-000000-9", "Solve for Happy", false, " "),
                new Book(110, "978-0-00-000000-10", "I Will Teach You to Be Rich", false, " "),
                new Book(111, "978-0-00-000000-11", "The Psychology of Money", false, " "),
                new Book(112, "978-0-00-000000-12", "The Laws of Human Nature", false, " "),
                new Book(113, "978-0-00-000000-13", "48 Laws of Power", false, " "),
                new Book(114, "978-0-00-000000-14", "Warhammer40k Avenging Son", false, " "),
                new Book(115, "978-0-00-000000-15", "Warhammer40k The Gate of Bones", false, " "),
                new Book(116, "978-0-00-000000-16", "Warhammer40k The Wolftime", false, " "),
                new Book(117, "978-0-00-000000-17", "Warhammer40k Throne of Light", false, " "),
                new Book(118, "978-0-00-000000-18", "Warhammer40k The Iron Kingdom", false, " "),
                new Book(119, "978-0-00-000000-19", "Warhammer40k The Martyr’s Tomb", false, " "),
                new Book(120, "978-0-00-000000-20", "Warhammer40k Sea of Souls", false, " "),
        };
        int choices = 0;
        while (choices != 20) {

            //Screen 1 main menu/home screen
            System.out.println("Welcome to the Neighborhood Library!");
            System.out.println();
            System.out.println("What page would you like to go to?");
            System.out.println();
            System.out.println("1. List of Books that can be checked out");
            System.out.println("2. Books checked out");
            System.out.println("3.Check in a book");
            System.out.println("4. quit app");
            System.out.println();
            System.out.println("Enter your choice:");

            choices = Integer.parseInt(userInput.next());

            switch (choices) {
                //Screen 2: show What books can be checked out
                case 1:
                    listOfBooks(booksInLibrary);
                    System.out.println("What Book would you like to check out? ");
                    userInput.nextInt();


                    break;

                //Screen 3: Show checked out books and by who
                case 2:
                   // System.out.println("These are the books currently checked out by someone: ");
                    //System.out.println();
                    showCheckOutBooks(booksInLibrary);
                    //System.out.println();
                    //System.out.println("Press 4 to head back to the home screen.");
                    break;


                //Screen 4: Check in books
                case 3:
                    //System.out.println("Please enter book Id to check back in: ");
                    //userInput.nextInt();

                    //System.out.println("Thank you for checking %s back in");
                    break;
                case 4:
                    //if (userInput.hasNextInt() == 1,2,3,4)

            }
        }
    }
