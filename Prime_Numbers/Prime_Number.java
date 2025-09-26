import java.util.Scanner;

public class Prime_Number {

    public static void main(String[] args){
        int i;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter A Number:");
        int Prime = sc.nextInt();

        if(Prime<= 1){

            System.out.println("The Number Is Not Prime");

        }

        else {

            for (i = 2 ; i < Prime ; i ++){

                if(Prime % i == 0) {


                    System.out.println("It is Not Prime Number");

                    break;
                }

            }

            if ( i ==Prime){

                System.out.println("It is Prime Number");
            }
        }

    }
}