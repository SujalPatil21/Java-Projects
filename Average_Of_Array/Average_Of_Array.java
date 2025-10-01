import java.util.Scanner;

public class Average_Of_Array{

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Number Of Elements In Array:");
        int n = sc.nextInt();

        int[] A = new int[n];
        int i ;
        System.out.println("Enter The Elements");

        for(i = 0 ; i < n ; i++){

            A[i] = sc.nextInt();
        }
        System.out.println("The Elements Of Array Are : ");

        for(i = 0 ; i < n ; i++){

            System.out.println(A[i]);
        }

        double average = 0;
        for(i = 0 ; i < n ; i++){

             average += A[i];

        }
        average /= n;
        System.out.println("Average Of The Array Is :" + average);
    }
}