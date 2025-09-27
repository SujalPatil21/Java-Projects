import java.util.Scanner;

public class Calculator {

    public static void main(String[] args){

        int c;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Number:");
        int num1 = sc.nextInt();
        System.out.println("Enter Second Number:");
        int num2 = sc.nextInt();
        System.out.println("\n 1.Addition \n 2.Subtraction \n 3.Multiplication \n 4.Division");
        System.out.println("\nEnter Your Choice:");
        int ch = sc.nextInt();
        switch(ch){

            case 1 :
            {
               c = num1+num2 ;
                System.out.println("Addition:"+c);
            }

            case 2:
            {
                c= num1 - num2;
                System.out.println("Subtraction:"+c);
            }

            case 3:
            {

                c = num1 * num2;
                System.out.println("Multiplication:"+c);

            }

            case 4 :
            {

                c = num1/num2;
                System.out.println("Division:"+c);
            }
        }

    }
}