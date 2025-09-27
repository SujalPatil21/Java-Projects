import java.util.Scanner;

public class Palindrome{

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter A Number:");
        int num = sc.nextInt();
        int orginal = num;
        int reverse = 0;
        while(num != 0){

            int digit = num %10;
            reverse = reverse * 10 + digit;
            num = num/10;
        }
        if (reverse == orginal){

            System.out.println("It Is A Palindrome Number");
        }
    }
}