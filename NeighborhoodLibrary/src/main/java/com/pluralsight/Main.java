package com.pluralsight;

import java.util.Scanner;

public class Main {
    static final Scanner userInput = new Scanner(System.in);
    public static void main(String[] args) {


        //Need the array for the books
        Book[] booksInLibrary = {
                new Book(101, "978-0-00-000000-1", "Gotrek & Felix The First Omnibus", false, " "),
                new Book(102, "978-0-00-000000-2", "Gotrek & Felix The Second Omnibus", false, " "),
                new Book(103, "978-0-00-000000-3", "Gotrek & Felix The Third Omnibus", false, " "),
                new Book(104, "978-0-00-000000-4", "Gotrek & Felix The Fourth Omnibus",false,  " "),
                new Book(105, "978-0-00-000000-5", "Gotrek & Felix The Fifth Omnibus", false, " "),
                new Book(106, "978-0-00-000000-6", "Gotrek & Felix The Sixth Omnibus", false, " "),
                new Book(107, "978-0-00-000000-7", "Atomic Habits", false, " "),
                new Book(108, "978-0-00-000000-8", "The 5 Resets", false, " "),
                new Book(109, "978-0-00-000000-9", "Solve for Happy", false, " "),
                new Book(110, "978-0-00-000001-0", "I Will Teach You to Be Rich", false, " "),
                new Book(111, "978-0-00-000001-1", "The Psychology of Money", false, " "),
                new Book(112, "978-0-00-000001-2", "The Laws of Human Nature", false, " "),
                new Book(113, "978-0-00-000001-3", "48 Laws of Power", false, " "),
                new Book(114, "978-0-00-000001-4", "Warhammer40k Avenging Son", false, " "),
                new Book(115, "978-0-00-000001-5", "Warhammer40k The Gate of Bones", false, " "),
                new Book(116, "978-0-00-000001-6", "Warhammer40k The Wolftime", false, " "),
                new Book(117, "978-0-00-000001-7", "Warhammer40k Throne of Light", false, " "),
                new Book(118, "978-0-00-000001-8", "Warhammer40k The Iron Kingdom", false, " "),
                new Book(119, "978-0-00-000001-9", "Warhammer40k The Martyr’s Tomb", false, " "),
                new Book(120, "978-0-00-000002-0", "Warhammer40k Sea of Souls", false, " "),
        };
        int choices = 0;
        while (choices != 20) {

            //Screen 1 main menu/home screen
           choices = homeSceenChoices();

            switch (choices) {

                //Screen 2: show What books can be checked out
                case 1:
                    bookList(booksInLibrary);
                    break;

                //Screen 3: Show checked out books and by who
                case 2:
                    showCheckOutBooks(booksInLibrary);
                    break;

                //Screen 4: Check in books
                case 3:
                    showCheckoutTo(booksInLibrary);
                    break;

                case 4:
                    //Quiting app
                    System.out.println();
                    System.out.println("Thanks for using the Neighborhood Library app! Bye!");
                    return;

                    // If user inputs wrong button.
                default:
                    System.out.println();
                    System.out.println("That is not the button you are looking for.");
                    System.out.println();
                    break;
            }
        }

    }
    //how homeScreen will look
    public static int homeSceenChoices()
    {
        System.out.println("Welcome to the Neighborhood Library!");
        System.out.println("What page would you like to go to?");
        System.out.println();
        System.out.println("1. List of Books that can be checked out");
        System.out.println("2. Books checked out");
        System.out.println("3.Check in a book");
        System.out.println("4. quit app");
        System.out.println();
        System.out.println("Enter your choice:");
        return Integer.parseInt(userInput.next());
    }
    //How available book list will appear
    public static void bookList(Book[] books){
        System.out.println();
        System.out.println("All books");
        System.out.println("-------------------------------------------------------------");

        for (int i = 0; i < books.length ; i++) {
            //print out all the books and their information:
            Book book = books[i];

            System.out.printf("%d, %s, %s,%s \n",book.getId(),book.getIsbn(),book.getTitle(),book.getCheckedOutTo());

        }
        System.out.println();
        System.out.println("press 0 to return to home: ");
        userInput.nextInt();
        if (userInput.nextInt() == 0) {
            homeSceenChoices();
        }
    }

    // Checked out books screen
    public static void showCheckOutBooks(Book[] books) {
        System.out.println();
        System.out.println("Books currently checked out: ");
        System.out.println("----------------------------------------------------------------");

        //displaying the books not checked out yet
        for (int i = 0; i < books.length ; i++) {
            Book book = books[i];

            System.out.printf("%d,%s ,%s ,%s \n",book.getId(),book.getIsbn(),book.getTitle(), book.getCheckedOutTo() );

        }

        //ask user if they would like to check out a book that's available

        System.out.println();
        System.out.println("Choose a book you would like to check out by choosing it's id");
        System.out.println("Enter book ID: ");
        int bookID = userInput.nextInt();
        userInput.nextLine();
        System.out.println();
        System.out.println("What is your name? ");
        String name = userInput.nextLine();

        for (int i = 0; i < books.length; i++) {
            Book book = books[i];
            if (bookID == book.getId()){
                book.checkOut(name);
                System.out.println("Enjoy your reading!");
                return;
            }
        }

    }

    public static void showCheckoutTo(Book[] books)
            //who checked out books and what books they checked out
    {
        System.out.println("People who checked out a book");
        System.out.println("-----------------------------------------------");

        for (int i = 0; i < books.length; i++) {
            Book book = books[i];

            System.out.printf("%d,%s ,%s ,%s \n",book.getId(),book.getIsbn(),book.getTitle(), book.getCheckedOutTo() );

            //ask user if they're checking in a book
            System.out.println();
            System.out.println("If your returning a book please enter the book id: ");
            int bookID = userInput.nextInt();
            userInput.nextLine();
            System.out.println();
            System.out.println("Please enter --- to erase your name: ");
            String name = userInput.nextLine();
            // Change book checked out status to false again and erase username on who checked it out.
            if (bookID == book.getId()){
                book.checkIn(name);}
            return;

        }
    }

}