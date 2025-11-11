import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("\n------REVERSAL OF STRING------");
        System.out.print("Enter text: ");
        String text = sc.nextLine();

        String reversed = new StringBuilder(text).reverse().toString();
        System.out.println("Reversed: " + reversed);
    }
}
