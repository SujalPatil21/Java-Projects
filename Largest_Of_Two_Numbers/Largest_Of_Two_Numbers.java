import java.util.Scanner;

public class Largest_Of_Two_Numbers{

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter First Number:");
        int num1 = sc.nextInt();
        System.out.println("Enter Second Number:");
        int num2 = sc.nextInt();

        if(num1>num2){

            System.out.println("Fist Number is Greater");

        }

        else {

            System.out.println("Second Number is Greater");
        }
    }

}