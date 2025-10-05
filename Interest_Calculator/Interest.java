import java.util.Scanner;

public class Interest {

    public static void main (String args[]){

        Scanner sc = new Scanner(System.in);

        System.out.println("\n\t-----INTEREST CALCULATOR-----");
        System.out.println("\nEnter Principal Amount : ");
        double principal = sc.nextDouble();
        System.out.println("Enter Interest Rate : ");
        double rate = sc.nextDouble();
        System.out.println("Enter Time Years : ");
        double time = sc.nextDouble();

        double interest = (principal * rate * time ) /100;

        System.out.println("Interest Amount : " + interest);

    }
}