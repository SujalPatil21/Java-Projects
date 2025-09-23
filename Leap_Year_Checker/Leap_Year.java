import java.util.Scanner;

public class Leap_Year{

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Year:");
        Double Year = sc.nextDouble();

        if (Year % 4 == 0 && Year % 100 !=0 || Year % 400 == 0){

            System.out.println("It is Leap Year");

        }
        else {

            System.out.println("It is Not a Leap Year");
        }
    }
}