import java.util.Scanner;

public class Armstrong_Recursion {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter The Number To Check If It Is Armstrong Number:");
        int num = sc.nextInt();

        int result = Armstrong(num);

        if (result == num) {
            System.out.println(num + " is an Armstrong Number.");
        } else {
            System.out.println(num + " is NOT an Armstrong Number.");
        }
    }

    public static int Armstrong(int num) {
        if (num == 0) {
            return 0;
        }
        int digit = num % 10;
        return (digit * digit * digit) + Armstrong(num / 10);
    }
}
