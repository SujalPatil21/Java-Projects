import java.util.Scanner;

public class Positive_Or_Negative {

    public static void main(String[] args){

        Scanner sc= new Scanner(System.in);
        System.out.println("Enter A Number:");
        int Num = sc.nextInt();

        if(Num==0){
            System.out.println("Number is Zero ");
        }

        else if (Num>0) {

            System.out.println("Number is Positive");

        }

        else {

            System.out.println("Number is Negative");
        }
    }
}