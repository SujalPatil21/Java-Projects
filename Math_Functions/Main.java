import java.util.Scanner;
import static java.lang.Math.*;



public class Main{

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("\n-----MATH FUNCTIONS-----");

        System.out.println("\nEnter Two Numbers : ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int choice ;
        boolean Value = true;
        while(Value){


            System.out.println("\n1.Minimum");
            System.out.println("2.Maximum");
            System.out.println("3.Power");
            System.out.println("4.sqrt");
            System.out.println("5.Exit");
            System.out.println("\nEnter Your Choice : ");
            choice = sc.nextInt();

            switch(choice){

                case 1 : {

                    System.out.println("\nMinimum Value : " + min(num1,num2));
                    break;
                }

                case 2 : {

                    System.out.println("\nMaximum Value : " + max(num1,num2));
                    break;
                }

                case 3 : {

                    System.out.println(num1+" Power of "+ num2 +" is : "+ pow(num1,num2));
                    break;

                }

                case 4 :{

                    System.out.println(num1 +"\nSquare Root is "+sqrt(num1));
                    System.out.println(num2 + " Square Root is " + sqrt(num2));
                    break;
                }

                case 5 : {

                    System.out.println("Exiting Program.....");
                    Value = false ;

                    break;
                }

            }
        }
    }
}