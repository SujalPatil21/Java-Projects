import java.sql.SQLOutput;
import java.util.Scanner;

public class Library {

    static Scanner sc = new Scanner(System.in);

    static String[] Title = new String[10];

    static String[] Author = new String[10];
    static int bookCount = 0;

    static boolean[] issue = new boolean[10];

    static void addBook() {
        if (bookCount >= Title.length) {
            System.out.println("Library full! Cannot add more books.");
            return;
        }

        sc.nextLine(); // consume leftover newline
        System.out.print("Enter book title: ");
        Title[bookCount] = sc.nextLine();

        System.out.print("Enter author name: ");
        Author[bookCount] = sc.nextLine();

        bookCount++;

        System.out.println("Book added successfully!");
    }


    static void removeBook(){

        System.out.println("Enter the book number to remove : ");

        int num = sc.nextInt();
        for(int i = num-1 ; i < bookCount -1 ; i++ ){
            Title[i] = Title[i + 1];
            Author[i] = Author[i + 1];
            issue[i] = issue[i + 1]; // also shift issue status
        }
        Title[bookCount - 1] = null;
        Author[bookCount - 1] = null;
        issue[bookCount - 1] = false;
        bookCount--;
        System.out.println("Book removed successfully!");


    }
    static void showBooks(){

        if (bookCount == 0){

            System.out.println("No Books To Display ");
        }
        else {

            System.out.println("-----BOOKS IN LIBRARY-----");
            for(int i = 0 ;i < bookCount ; i++){

                String status = issue [i] ? "[issued]" : "[Available]";
                System.out.println((i + 1) + ". " + Title[i] + " by " + Author[i] + " " + status);
            }

        }
    }
    static void returnBook() {
        if (bookCount == 0) {
            System.out.println("No books in the library.");
            return;
        }


        System.out.print("Enter book number to return: ");
        int num = sc.nextInt();

        if (num <= 0 || num > bookCount) {
            System.out.println("Invalid book number.");
            return;
        }

        if (issue[num - 1]) { // check if book was issued
            issue[num - 1] = false; // mark as available
            System.out.println("Book returned successfully!");
        } else {
            System.out.println("This book was not issued.");
        }
    }

    static void issueBook(){

        {
            if (bookCount == 0) {
                System.out.println("No books to issue.");
                return;
            }

            showBooks();
            System.out.print("Enter book number to issue: ");
            int num = sc.nextInt();

            if (num <= 0 || num > bookCount) {
                System.out.println("Invalid book number.");
                return;
            }

            if (!issue[num - 1]) { // check if available
                issue[num - 1] = true;
                System.out.println("Book issued successfully!");
            } else {
                System.out.println("Sorry, this book is already issued.");
            }
        }


    }

    public static void main (String[] args){

        boolean running = true;



        while (running == true) {

            System.out.println("\n-----LIBRARY MANAGEMENT SYSTEM-----");
            System.out.println("1.Add Books ");
            System.out.println("2.Remove Books ");
            System.out.println("3.Issue Book ");
            System.out.println("4.Return Book ");
            System.out.println("5.Show Books ");
            System.out.println("6.Exit");
            System.out.println("Enter You Choice : ");
            int choice = sc.nextInt();

            switch(choice){

                case 1 : {

                     addBook();
                    break;
                }
                case 2 : {

                    removeBook();
                    break;

                }

                case 3 : {

                    issueBook();
                    break;
                }
                case 4 : {

                    returnBook();
                    break;

                }
                case 5 : {

                    showBooks();
                    break;
                }
                case 6 : {

                    System.out.println("Exiting Library Management System....");
                    running = false;
                    break;

                }
            }
        }
    }
}