import java.util.Scanner;

public class Average {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);



        System.out.println("\n\t-----AVERAGE OF THREE NUMBERS-----");
        System.out.println("\nEnter First Number : ");
        double a = sc.nextDouble();
        System.out.println("Enter Second Number : ");
        double b = sc.nextDouble();
        System.out.println("Enter Third Number : ");
        double c = sc.nextDouble();

        double average = (a+b+c)/3.0;

        System.out.println("Average Of Three Numbers : " + average);

    }
}