import java.util.Scanner;

public class Calculator{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Number:");
        int a = sc.nextInt();
        System.out.println("Enter Second Number");
        int b = sc.nextInt();

        System.out.println("Addition:" + (a+b));
        System.out.println("Substraction:" + (a-b));
        System.out.println("Multiplication:" + (a*b));
        System.out.println("Division:"+(a/b));
    }
}
