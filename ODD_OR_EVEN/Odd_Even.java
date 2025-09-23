import java.util.Scanner;
public class Odd_Even{

    public static void main (String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number:");
        Double Number = sc.nextDouble();

        if (Number % 2 ==0){

            System.out.println("Number is Even");
        }

        else {

            System.out.println("Number is Odd");
        }
    }

}