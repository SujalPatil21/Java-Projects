import java.util.Scanner;

public class Prime {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("\n\tENTER A RANGE ");
        System.out.println("\nEnter Start Number:");
        int start = sc.nextInt();
        System.out.println("Enter End Number");
        int end = sc.nextInt();

        System.out.println("Prime Numbers From "+ start + " to " + end);
        for (int i = start ; i <= end ; i++ ){

            if(i % 2 != 0){

                System.out.println("Prime Number : " + i);
            }
            }
        }
    }
