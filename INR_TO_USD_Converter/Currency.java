import java.util.Scanner;

public class Currency{

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("\n\t-----CURRENCY CONVERTER-----");
        System.out.println("\nEnter INR Rupees : ");
        double Usd = sc.nextDouble();
        Usd /=83;

        System.out.println("Amount In USD : " + Usd + "$");


    }
}