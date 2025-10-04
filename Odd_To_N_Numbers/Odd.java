import java.util.Scanner;

public class Odd {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Start Number : ");
        int a = sc.nextInt();
        System.out.println("Enter End Number : ");
        int b = sc.nextInt();

        for (int i = a; i <= b; i++) {

            if (i % 2 != 0) {
                System.out.println("Odd Number : " + i);
            }
        }
    }
}