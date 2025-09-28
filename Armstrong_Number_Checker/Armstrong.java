import java.util.Scanner;

public class Armstrong{

    public static void main (String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter The Number:");
        int num = sc.nextInt();

        int original = num;
        int cube = 0;
        while (num>0){

            int digit = num % 10;
            cube = cube + digit * digit * digit ;
            num =num/10;
        }

        if(original==cube){

            System.out.println("It Is Armstrong Number");
        }

        else{

            System.out.println("It Is Not A Armstrong Number");
        }
    }
}