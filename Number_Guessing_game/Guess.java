import java.util.Scanner;
import java.math.*;
public class Guess {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter The Number:");
        int num = sc.nextInt();
        int random = (int)(Math.random() * 10) + 1;

        if (num == random){

            System.out.println("Good You Guessed It Correctly Haha");
        }
        else {

            System.out.println("Opps The Number You Guessed Is Wrong");
        }
        System.out.println("The Number Was: " + random);
    }
}