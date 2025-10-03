import java.util.Scanner;
import java.math.*;

public class Guess_Advance{

    public static void main (String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("\n\t WELCOME TO NUMBER GUESSING GAME");
        System.out.println("\tNumber Should Be Between 1 to 100");

        int guess = 1;
        int num = 0;

        int computer_num = (int) (Math.random() *100) +1;

        while(computer_num != num){

            System.out.println("\nEnter The Number:");
            num = sc.nextInt();

            if(num>computer_num){

                System.out.println("Try Lower..");
                guess ++;
            }

            else if (num<computer_num) {

                System.out.println("Try Higher..");
                guess ++;
            }
            else {

                System.out.println("Congratulations You Have Guessed Correct Number!!");
                System.out.println("Number Of Guesses:" + guess);
            }
        }
    }
}