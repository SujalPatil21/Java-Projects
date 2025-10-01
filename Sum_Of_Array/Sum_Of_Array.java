import java.util.Scanner;

public class Sum_Of_Array{

    public static void main(String[] args){

        int i;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter The Number Of Elements:");
        int n = sc.nextInt();
        int [] a = new int[n];
        System.out.println("Enter The Elements:");

        for( i = 0 ; i < n ; i ++){

            a[i] = sc.nextInt();

        }
        System.out.println("Elements Are : ");
        for( i = 0 ; i < n ; i++){

            System.out.println(a[i]);
        }

        int sum = 0;
        for(i = 0 ; i < n ; i++){

            sum += a[i];

        }
        System.out.println("Sum Of The Array : " + sum);

    }
}