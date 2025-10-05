import java.util.Scanner;

public class Tip {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);


        System.out.println("\n\t-----TIP GENERATOR-----");
        System.out.println("\nEnter The Bill : ");
        Double bill = sc.nextDouble();

        System.out.println("Enter Tip Percentage : ");
        Double Tip_p = sc.nextDouble();

        Double Tip = (bill * Tip_p) / 100;

        Double Total = bill + Tip ;

        System.out.println("The Total Bill Amount : " + Total );
        System.out.println("Tip Amount : " + Tip);



    }
}