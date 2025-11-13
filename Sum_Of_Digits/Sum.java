
import java.util.Scanner;

public class Sum{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter A Number:");
        int a = sc.nextInt();
        int original = a;

        int sum = 0;
        while (original !=0){

            int digit = original % 10 ;
            sum += digit;
            original /= 10;

        }

        System.out.println("Sum Of Digit is:" + sum);
    }
}
