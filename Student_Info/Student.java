import java.util.Scanner;

public class Student {


    static String Name;
    static int percentage,roll_no;

        public static void Accept() {

            Scanner sc = new Scanner(System.in);
            System.out.println("\n\tSTUDENT INFORMATION");
            System.out.println("\nEnter Student Name : ");
             Name = sc.nextLine();
            System.out.println("Enter Roll Number : ");
            roll_no = sc.nextInt();
            System.out.println("Enter Percentage : ");
             percentage = sc.nextInt();
        }

        public static void Display(){

            System.out.println("Student Name : " + Name);
            System.out.println("Roll Number : " + roll_no);
            System.out.println("Percentage : " + percentage + "%");
        }

        public static void main(String[] args){

            Accept();
            Display();
        }
    }
