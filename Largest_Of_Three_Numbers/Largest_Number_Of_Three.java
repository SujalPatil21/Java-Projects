import java.util.Scanner;

public class Largest_Number_Of_Three{

    public static void main (String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter First Number");
        int num1 = sc.nextInt();
        System.out.println("Enter Second Number");
        int num2 = sc.nextInt();
        System.out.println("Enter Third Number:");
        int num3 = sc.nextInt();

        if(num1 > num2 && num1 > num3 ){

            System.out.println("First Number Is Greater");
        }
        else if (num2 > num1 && num2 > num3) {

            System.out.println("Second Number Is Greater");

        }
        else {

            System.out.println("Third Number Is Greater");
        }
    }
}