import java.util.Scanner;

public class Array_Even_Odd{

    public static void main(String[] args){

        Scanner sc = new Scanner (System.in);
        System.out.println("Enter Number Of Elements In Array:");
        int n = sc.nextInt();

        int [] A = new int[n];

        int i ;

        System.out.println("Enter The Elements Of Array: ");

        for(i = 0 ; i < n ; i++){

            A[i] = sc.nextInt();

        }
        System.out.println("Elements Of Array Are : ");

        for(i = 0 ; i < n ; i++){

            System.out.println(A[i]);
        }

        int count_Odd = 0;
        int count_Even = 0;
        for(i = 0 ; i < n ; i++){

            if (A[i] % 2 == 0){
                count_Even++;
            }
            else{
                count_Odd++;
            }
        }
        System.out.println("Number Of Odd Numbers Are :" + count_Odd);
        System.out.println("Number Of Even Number Are :" + count_Even);
    }
}