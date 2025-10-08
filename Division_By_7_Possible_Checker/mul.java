import java.util.Scanner;

public class mul {

    public static void main(String[] args){

         Scanner sc = new Scanner(System.in);

        System.out.println("\n\t -----DIVISION BY 7?-----");
        System.out.println("\nEnter A Number :");
        int a = sc.nextInt();
        if(a % 7 == 0){

            System.out.println("Division By 7 Possible...");
        }
        else {

            System.out.println("Division By 7 Not Possible...");
        }
    }
}