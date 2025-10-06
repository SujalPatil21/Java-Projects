import java.util.Scanner;

public class Count{

    public static void main (String[] args){

        Scanner sc = new Scanner(System.in);

        int count = 0;
        System.out.println("\n\t-----NUMBER OF DIGIT CALCULATOR-----");
        System.out.println("\nEnter A Number : ");
        int num = sc.nextInt();

        int temp = num ;
        while(temp !=0){

           temp/=10;
           count ++;

        }
        System.out.println("Number Of Digits : " + count);
    }
}