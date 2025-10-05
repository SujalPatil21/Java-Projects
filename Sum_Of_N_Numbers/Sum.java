import java.util.Scanner;

public class Sum {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("\n\t -----SUM CALCULATION-----");
        System.out.println("\nEnter start Number : " );
        int start = sc.nextInt();
        System.out.println("Enter End Number : ");
        int end = sc.nextInt();

        int sum = 0;

        for (int i = start ; i <= end ; i++ ){

            sum += i ;
        }
        System.out.println("Sum Of Numbers : " + sum );

    }
}