import java.util.Scanner;

public class Power {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("\n\t-----POWER CALCULATOR-----");
        System.out.println("\nEnter A Number : ");
        int num = sc.nextInt();
        System.out.println("Enter The Power : ");
        int power = sc.nextInt();
        int result = num ;
        result *= power;

        System.out.println("Number : " + num + " Raise To  " + power);
        System.out.println("Answer : " + result );

    }
}