import java.util.Scanner;

public class Mul {

    public static void main (String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter First Number : ");
        Double a = sc.nextDouble();

        System.out.println("Enter Second Number : ");
        Double b = sc.nextDouble();

        Double c = a * b ;

        System.out.println("Multiplication : " + c);
    }
}