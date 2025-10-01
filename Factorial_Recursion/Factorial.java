import java.util.Scanner;

public class Factorial {

    static int num;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter The Number You Want For Factorial:");
        num = sc.nextInt();

        System.out.println("Factorial Is : " + factorial(num));
    }

    public static int factorial(int num) {
        if (num == 1) {
            return 1;
        } else {
            return num * factorial(num - 1);
        }
    }
}
